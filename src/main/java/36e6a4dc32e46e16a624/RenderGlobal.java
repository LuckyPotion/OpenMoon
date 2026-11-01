package net.minecraft.client.renderer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class RenderGlobal implements net.minecraft.world.IWorldAccess, net.minecraft.client.resources.IResourceManagerReloadListener {

private static org.apache.logging.log4j.Logger a;

public static moom.DD b;

private static moom.DD c;

public static moom.DD d;

public static moom.DD e;

private static moom.DD f;

private static java.util.Set g;

private static int h;

public net.minecraft.client.Minecraft i;

public java.util.Map<java.lang.Integer, moom.kU> j;

private net.minecraft.client.renderer.texture.TextureManager k;

private net.minecraft.client.renderer.entity.RenderManager l;

private java.util.Set<net.minecraft.tileentity.TileEntity> m;

private moom.oD n;

private java.util.Map<moom.DT, net.minecraft.client.audio.ISound> o;

private net.minecraft.client.renderer.texture.TextureAtlasSprite[] p;

private moom.mi q;

private org.lwjgl.util.vector.Vector4f[] r;

private moom.DZ s;

private moom.Mf t;

private java.util.Deque u;

private java.util.List v;

private java.util.List w;

private java.util.List x;

private java.util.List y;

private java.util.List z;

private java.util.List A;

private moom.Mi B;

public boolean C;

public net.minecraft.entity.Entity D;

public java.util.Set E;

public java.util.Set F;

public boolean G;

public boolean H;

net.minecraft.client.renderer.chunk.IRenderChunkFactory I;

private net.minecraft.client.multiplayer.WorldClient J;

private java.util.Set<moom.mp> K;

private java.util.List<moom.ls> L;

private moom.lv M;

private int N;

private int O;

private int P;

private moom.oC Q;

private moom.oC R;

private moom.oC S;

private int T;

private net.minecraft.client.shader.Framebuffer U;

private net.minecraft.client.shader.ShaderGroup V;

private double W;

private double X;

private double Y;

private int Z;

private int aa;

private int ab;

private double ac;

private double ad;

private double ae;

private double af;

private double ag;

private moom.kR ah;

private int ai;

private int aj;

private int ak;

private int al;

private int am;

private boolean an;

private moom.mv ao;

private boolean ap;

private double aq;

private double ar;

private double as;

private java.util.List<moom.ls> at;

private java.util.List au;

private int av;

private int aw;

private int ax;

private moom.Fn ay;

private moom.Do az;

private int aA;

private boolean aB;

private static long bb;

private static long[] cb;

private static java.lang.Integer[] db;

private static java.util.Map eb;

private static long[] fb;

private static java.lang.Long[] gb;

private static java.util.Map hb;

public RenderGlobal(net.minecraft.client.Minecraft p0) { super(); }

private static void __sourceConstructorBody_beea2afdfcd8168f(net.minecraft.client.renderer.RenderGlobal receiver, net.minecraft.client.Minecraft p0) throws Throwable {
long local2_life2 = (net.minecraft.client.renderer.RenderGlobal.bb ^ 13452432174254L);
    net.minecraft.client.renderer.RenderGlobal.__sourceConstructorInit_beea2afdfcd8168f_0(((net.minecraft.client.renderer.RenderGlobal)(receiver)));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).j = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).m = ((java.util.Set)(com.google.common.collect.Sets.newHashSet()));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).o = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).p = ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(new net.minecraft.client.renderer.texture.TextureAtlasSprite[__sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_11(1857, (7236748457441442432L ^ local2_life2))]));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).q = ((moom.mi)(new moom.mi()));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).r = ((org.lwjgl.util.vector.Vector4f[])(new org.lwjgl.util.vector.Vector4f[__sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_15(20434, (1057945952642036292L ^ local2_life2))]));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).s = ((moom.DZ)(new moom.DZ()));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).u = ((java.util.Deque)(new java.util.ArrayDeque()));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).v = ((java.util.List)(new java.util.ArrayList(__sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_20(23193, (9092214687812609871L ^ local2_life2)))));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).w = ((java.util.List)(new java.util.ArrayList(__sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_23(30423, (851178333486861068L ^ local2_life2)))));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).x = ((java.util.List)(new java.util.ArrayList(__sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_26(30423, (851178333486861068L ^ local2_life2)))));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).y = ((java.util.List)(new java.util.ArrayList(__sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_29(30423, (851178333486861068L ^ local2_life2)))));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).z = ((java.util.List)(new java.util.ArrayList(__sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_32(30423, (851178333486861068L ^ local2_life2)))));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).A = ((java.util.List)(new java.util.ArrayList(__sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_35(30423, (851178333486861068L ^ local2_life2)))));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).B = ((moom.Mi)(new moom.Mi(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE(), new moom.DT(0, 0, 0))));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).C = ((boolean)(true));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).E = ((java.util.Set)(new java.util.LinkedHashSet()));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).F = ((java.util.Set)(new java.util.LinkedHashSet()));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).G = ((boolean)(false));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).H = ((boolean)(false));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).K = ((java.util.Set)(com.google.common.collect.Sets.newLinkedHashSet()));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).L = ((java.util.List)(com.google.common.collect.Lists.newArrayListWithCapacity(((int)(__sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_48(4100, (5660843211731021297L ^ local2_life2)))))));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).N = ((int)(-1));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).O = ((int)(-1));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).P = ((int)(-1));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).W = ((double)(0x0.0000000000001p-1022D));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).X = ((double)(0x0.0000000000001p-1022D));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).Y = ((double)(0x0.0000000000001p-1022D));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).Z = ((int)(__sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_61(23684, (1393938438483435883L ^ local2_life2))));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).aa = ((int)(__sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_64(23684, (1393938438483435883L ^ local2_life2))));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).ab = ((int)(__sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_67(23684, (1393938438483435883L ^ local2_life2))));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).ac = ((double)(0x0.0000000000001p-1022D));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).ad = ((double)(0x0.0000000000001p-1022D));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).ae = ((double)(0x0.0000000000001p-1022D));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).af = ((double)(0x0.0000000000001p-1022D));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).ag = ((double)(0x0.0000000000001p-1022D));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).ai = ((int)(-1));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).aj = ((int)(__sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_81(18625, (7270665195903546719L ^ local2_life2))));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).an = ((boolean)(false));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).ap = ((boolean)(false));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).at = ((java.util.List)(new java.util.ArrayList(__sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_86(30423, (851178333486861068L ^ local2_life2)))));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).au = ((java.util.List)(new java.util.ArrayList(__sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_89(30423, (851178333486861068L ^ local2_life2)))));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).av = ((int)(0));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).aw = ((int)(0));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).ay = ((moom.Fn)(null));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).az = ((moom.Do)(null));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).aA = ((int)(0));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).aB = ((boolean)(false));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).t = ((moom.Mf)(new moom.Mf(p0)));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).i = ((net.minecraft.client.Minecraft)(p0));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).l = ((net.minecraft.client.renderer.entity.RenderManager)(((net.minecraft.client.Minecraft)(p0)).a__nw()));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).k = ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(p0)).a__ok()));
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.renderer.RenderGlobal)(receiver)).k)).a__Void(((moom.DD)(net.minecraft.client.renderer.RenderGlobal.f)));
    org.lwjgl.opengl.GL11.glTexParameteri(((int)(__sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_107(7825, (1872809096523948887L ^ local2_life2)))), ((int)(__sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_109(32746, (7486215631392784899L ^ local2_life2)))), ((int)(__sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_111(28835, (7399670617603558774L ^ local2_life2)))));
    org.lwjgl.opengl.GL11.glTexParameteri(((int)(__sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_114(935, (8374424570732723816L ^ local2_life2)))), ((int)(__sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_116(24787, (226789050057612607L ^ local2_life2)))), ((int)(__sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_118(28610, (9070973093120791125L ^ local2_life2)))));
    moom.kZ.i(((int)(0)));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).a__Void();
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).ap = ((boolean)(net.minecraft.client.renderer.OpenGlHelper.b__Boolean()));
    if (((net.minecraft.client.renderer.RenderGlobal)(receiver)).ap) {
        ((net.minecraft.client.renderer.RenderGlobal)(receiver)).ah = ((moom.kR)(new moom.kT()));
        ((net.minecraft.client.renderer.RenderGlobal)(receiver)).I = ((net.minecraft.client.renderer.chunk.IRenderChunkFactory)(new moom.ms()));
    } else {
        ((net.minecraft.client.renderer.RenderGlobal)(receiver)).ah = ((moom.kR)(new moom.kS()));
        ((net.minecraft.client.renderer.RenderGlobal)(receiver)).I = ((net.minecraft.client.renderer.chunk.IRenderChunkFactory)(new moom.mo()));
    }
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).n = ((moom.oD)(new moom.oD()));
    ((moom.oD)(((net.minecraft.client.renderer.RenderGlobal)(receiver)).n)).a(((moom.oF)(new moom.oF(0, net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType.FLOAT, net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage.POSITION, 3))));
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).f__Void();
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).e__Void();
    ((net.minecraft.client.renderer.RenderGlobal)(receiver)).d__Void();
    return;
}


static {
bb = ((long)(((moom._a)(moom._c.a(((long)(-2493795256892822696L)), ((long)(-1304699226558017619L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(134690280342525L)))));
    eb = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (net.minecraft.client.renderer.RenderGlobal.bb ^ 138786675701070L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill1171_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1171_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1171_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1171_14 = new byte[8];
    (__sourceSpill1171_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill1171_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation1171_16 = __sourceSpill1171_14;
    ((javax.crypto.Cipher)(__sourceSpill1171_11)).init(((int)(__sourceSpill1171_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1171_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1171_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life19 = new long[77];
    int local16_life20 = 0;
    java.lang.String local17_life21;
    int local18_life23 = ((java.lang.String)((local17_life21 = "!óýfÈ¼\t­\tSM©ù¾»\030\001ãB!ÉÄÔ2eYöP¤ÿ»ØKÌtïr¥\031YcAê\0224\002g6Â\013fÛüòs$-0r0u0¦R·\024òê\027V8;¦Ü -Ï__ÞyÓXÇ_ÈÒ¶ªv¼èP» &å¡N@\03152«ßx<*ö¾\026á¬ô\"ë¬ìÒâR¡ïÛ24ª©¾DÙNoéé5Y)Ñ\036pÌÓÝµ\\®J'yy\024¬XÐ>òøZÎ\003³È¨ô¥gÂ³æqÍ(\006_ûäËe(ZqÒCû£½£8¯Å*4,\013q.>Ñúõ\033\001^¶nwÚ\fHaµÀ©Yqu^\006\017scé\016MþýeÇí\000z}Î;èê \r&<\\\021¬\003\005Îä#ßWû'¥_<<^o äüð'No,Ï'Sô «âNÁ¦Kâ§þ»¢¢$©YÔTÝþûÅE¨9z\022\037¦ðÔ¨o­´\027\021¨Ü¤ð!£\025,«r\016\033?¨TWHÉÏmzsÿL\027h\026¦Rw÷\006Ë9ýTi\002NÔ\030Nt¨=\020æ-3 u\036\177Ó4a>` \037Ða\036\004àS\000yB\017ér\0179ýcUÖ?Ms\022/o\034Ó\025Js¤þQ­³o<µò\\±\013õÞ X70ýqòO\004í9#\tÐ·BY/BÞtyO®ÿ}ÊÁê©Ã´Å\032§\022ËoÈ@ÿõ`9²j|sô~Ûu$\017QÜ©Lm¼2G*Ð!Ã«½5¤2iÃ*ëç\023ðÏ\\Î\r{~ÿ%\036`«á/µ\031íZ2Àô¿7åÒ?¯N.OªÅd\037\n¸%«JYåñ"))).length();
    int local15_life24 = 0;
    do {
        java.lang.String __sourceSpill1171_25 = local17_life21;
        int __sourceSpill1171_26 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1171_25)).substring(((int)(__sourceSpill1171_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1171_30 = local19_life19;
        int __sourceSpill1171_31 = local16_life20;
        local16_life20 += 1;
        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));
        byte[] __sourceSpill1171_33 = new byte[8];
        (__sourceSpill1171_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));
        (__sourceSpill1171_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));
        (__sourceSpill1171_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));
        (__sourceSpill1171_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));
        (__sourceSpill1171_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));
        (__sourceSpill1171_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));
        (__sourceSpill1171_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));
        (__sourceSpill1171_33)[7] = ((byte) ((int) local21_life32));
        javax.crypto.Cipher __sourceSpill1171_34 = local13_life9;
        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill1171_34)).doFinal(((byte[])(__sourceSpill1171_33)));
        (__sourceSpill1171_30)[__sourceSpill1171_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    local18_life23 = ((java.lang.String)((local17_life21 = "C²g;ÊÑ\b¦7`D'#¨±"))).length();
    local15_life24 = 0;
    do {
        java.lang.String __sourceSpill1171_38 = local17_life21;
        int __sourceSpill1171_39 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1171_38)).substring(((int)(__sourceSpill1171_39)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1171_43 = local19_life19;
        int __sourceSpill1171_44 = local16_life20;
        local16_life20 += 1;
        long local21_life45 = (((((((((((long) (local20_life42)[0]) & 255L) << 56) | ((((long) (local20_life42)[1]) & 255L) << 48)) | ((((long) (local20_life42)[2]) & 255L) << 40)) | ((((long) (local20_life42)[3]) & 255L) << 32)) | ((((long) (local20_life42)[4]) & 255L) << 24)) | ((((long) (local20_life42)[5]) & 255L) << 16)) | ((((long) (local20_life42)[6]) & 255L) << 8)) | (((long) (local20_life42)[7]) & 255L));
        byte[] __sourceSpill1171_46 = new byte[8];
        (__sourceSpill1171_46)[0] = ((byte) ((int) (local21_life45 >>> 56)));
        (__sourceSpill1171_46)[1] = ((byte) ((int) (local21_life45 >>> 48)));
        (__sourceSpill1171_46)[2] = ((byte) ((int) (local21_life45 >>> 40)));
        (__sourceSpill1171_46)[3] = ((byte) ((int) (local21_life45 >>> 32)));
        (__sourceSpill1171_46)[4] = ((byte) ((int) (local21_life45 >>> 24)));
        (__sourceSpill1171_46)[5] = ((byte) ((int) (local21_life45 >>> 16)));
        (__sourceSpill1171_46)[6] = ((byte) ((int) (local21_life45 >>> 8)));
        (__sourceSpill1171_46)[7] = ((byte) ((int) local21_life45));
        javax.crypto.Cipher __sourceSpill1171_47 = local13_life9;
        byte[] local23_life49 = ((javax.crypto.Cipher)(__sourceSpill1171_47)).doFinal(((byte[])(__sourceSpill1171_46)));
        (__sourceSpill1171_43)[__sourceSpill1171_44] = (((((((((((long) (local23_life49)[0]) & 255L) << 56) | ((((long) (local23_life49)[1]) & 255L) << 48)) | ((((long) (local23_life49)[2]) & 255L) << 40)) | ((((long) (local23_life49)[3]) & 255L) << 32)) | ((((long) (local23_life49)[4]) & 255L) << 24)) | ((((long) (local23_life49)[5]) & 255L) << 16)) | ((((long) (local23_life49)[6]) & 255L) << 8)) | (((long) (local23_life49)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    cb = ((long[])(local19_life19));
    db = ((java.lang.Integer[])(new java.lang.Integer[77]));
    hb = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill1171_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1171_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1171_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1171_59 = new byte[8];
    (__sourceSpill1171_59)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill1171_59)[local1_life60] = ((byte) ((int) ((local11_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation1171_61 = __sourceSpill1171_59;
    ((javax.crypto.Cipher)(__sourceSpill1171_56)).init(((int)(__sourceSpill1171_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1171_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1171_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life64 = new long[2];
    int local3_life65 = 0;
    java.lang.String local4_life66;
    int local5_life68 = ((java.lang.String)((local4_life66 = "Ðæ>¯\007µ/tAiªÕº"))).length();
    int local2_life69 = 0;
    do {
        java.lang.String __sourceSpill1171_70 = local4_life66;
        int __sourceSpill1171_71 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill1171_70)).substring(((int)(__sourceSpill1171_71)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1171_75 = local6_life64;
        int __sourceSpill1171_76 = local3_life65;
        local3_life65 += 1;
        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));
        byte[] __sourceSpill1171_78 = new byte[8];
        (__sourceSpill1171_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));
        (__sourceSpill1171_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));
        (__sourceSpill1171_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));
        (__sourceSpill1171_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));
        (__sourceSpill1171_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));
        (__sourceSpill1171_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));
        (__sourceSpill1171_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));
        (__sourceSpill1171_78)[7] = ((byte) ((int) local8_life77));
        javax.crypto.Cipher __sourceSpill1171_79 = local0_life54;
        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill1171_79)).doFinal(((byte[])(__sourceSpill1171_78)));
        (__sourceSpill1171_75)[__sourceSpill1171_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    fb = ((long[])(local6_life64));
    gb = ((java.lang.Long[])(new java.lang.Long[2]));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
    b = ((moom.DD)(null));
    c = ((moom.DD)(new moom.DD("textures/environment/sun.png")));
    d = ((moom.DD)(null));
    e = ((moom.DD)(null));
    f = ((moom.DD)(new moom.DD("textures/misc/forcefield.png")));
    g = ((java.util.Set)(java.util.Set.of(((java.lang.Object[])(moom.bs.VALUES)))));
    h = ((int)(0));
}

private static native <E extends Throwable> void __sourceConstructorInit_beea2afdfcd8168f_0(net.minecraft.client.renderer.RenderGlobal a0) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_7d15e7eb11c07394d2a1(net.minecraft.client.renderer.RenderGlobal a0, double a1, double a2, double a3) throws E;
private static final class __SourceHandler_7d15e7eb11c07394d2a1 {

public static void f595(net.minecraft.client.renderer.RenderGlobal receiver, double p0, double p1, double p2) throws Throwable {
    long life7_3;
    moom.OL life9_19;
    moom.OL life10_29;
    moom.OL life11_36;
    int life12_154;
    forest_join_220: {
    life7_3 = (__fieldRead595_0() ^ 71722818603343L);
    __fieldWrite595_1(receiver, new moom.mw());
    __call595_4(__cast595_3(__fieldRead595_2(receiver)));
    life9_19 = new moom.OL(__fieldRead595_6(__fieldRead595_5(receiver)));
    __call595_7(life9_19);
    life10_29 = new moom.OL(__fieldRead595_9(__fieldRead595_8(receiver)));
    __call595_10(life10_29);
    life11_36 = new moom.OL();
    __call595_11(life10_29, life9_19, life11_36);
    __call595_12(life11_36);
    __fieldWrite595_14(__fieldRead595_13(receiver), p0);
    __fieldWrite595_16(__fieldRead595_15(receiver), p1);
    __fieldWrite595_18(__fieldRead595_17(receiver), p2);
    (__fieldRead595_19(receiver))[0] = new org.lwjgl.util.vector.Vector4f(-0x1.0p0f, -0x1.0p0f, -0x1.0p0f, 0x1.0p0f);
    (__fieldRead595_20(receiver))[1] = new org.lwjgl.util.vector.Vector4f(0x1.0p0f, -0x1.0p0f, -0x1.0p0f, 0x1.0p0f);
    (__fieldRead595_21(receiver))[2] = new org.lwjgl.util.vector.Vector4f(0x1.0p0f, 0x1.0p0f, -0x1.0p0f, 0x1.0p0f);
    (__fieldRead595_22(receiver))[3] = new org.lwjgl.util.vector.Vector4f(-0x1.0p0f, 0x1.0p0f, -0x1.0p0f, 0x1.0p0f);
    (__fieldRead595_23(receiver))[4] = new org.lwjgl.util.vector.Vector4f(-0x1.0p0f, -0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    (__fieldRead595_24(receiver))[5] = new org.lwjgl.util.vector.Vector4f(0x1.0p0f, -0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    (__fieldRead595_25(receiver))[__invokedynamic595_26(30557, (3807803141038550849L ^ life7_3))] = new org.lwjgl.util.vector.Vector4f(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    (__fieldRead595_27(receiver))[__invokedynamic595_28(140, (5506146555939576063L ^ life7_3))] = new org.lwjgl.util.vector.Vector4f(-0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    life12_154 = 0;
    forest_cycle_155: while (true) {
    if (!((life12_154 < __invokedynamic595_29(20434, (1058021807700481957L ^ life7_3))))) {
        break forest_join_220;
    }
    __call595_32(life11_36, (__fieldRead595_30(receiver))[life12_154], (__fieldRead595_31(receiver))[life12_154]);
    org.lwjgl.util.vector.Vector4f __stackOp595_34_0 = (__fieldRead595_33(receiver))[life12_154];
    __fieldWrite595_38(__stackOp595_34_0, (__fieldRead595_35(__stackOp595_34_0) / __fieldRead595_37((__fieldRead595_36(receiver))[life12_154])));
    org.lwjgl.util.vector.Vector4f __stackOp595_40_0 = (__fieldRead595_39(receiver))[life12_154];
    __fieldWrite595_44(__stackOp595_40_0, (__fieldRead595_41(__stackOp595_40_0) / __fieldRead595_43((__fieldRead595_42(receiver))[life12_154])));
    org.lwjgl.util.vector.Vector4f __stackOp595_46_0 = (__fieldRead595_45(receiver))[life12_154];
    __fieldWrite595_50(__stackOp595_46_0, (__fieldRead595_47(__stackOp595_46_0) / __fieldRead595_49((__fieldRead595_48(receiver))[life12_154])));
    __fieldWrite595_52((__fieldRead595_51(receiver))[life12_154], 0x1.0p0f);
    life12_154 += 1;
    continue forest_cycle_155;
    }
    }
    return;
}
public static void h595_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3059500_0(p0);
}
private static native long __fieldRead595_0() throws Throwable;
private static native void __fieldWrite595_1(net.minecraft.client.renderer.RenderGlobal a0, moom.mw a1) throws Throwable;
private static native moom.mv __fieldRead595_2(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.mw __cast595_3(moom.mv a0) throws Throwable;
private static native void __call595_4(moom.mw a0) throws Throwable;
private static native moom.mv __fieldRead595_5(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native float[] __fieldRead595_6(moom.mv a0) throws Throwable;
private static native org.lwjgl.util.vector.Matrix __call595_7(moom.OL a0) throws Throwable;
private static native moom.mv __fieldRead595_8(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native float[] __fieldRead595_9(moom.mv a0) throws Throwable;
private static native org.lwjgl.util.vector.Matrix __call595_10(moom.OL a0) throws Throwable;
private static native org.lwjgl.util.vector.Matrix4f __call595_11(moom.OL a0, moom.OL a1, moom.OL a2) throws Throwable;
private static native org.lwjgl.util.vector.Matrix __call595_12(moom.OL a0) throws Throwable;
private static native moom.DZ __fieldRead595_13(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __fieldWrite595_14(moom.DZ a0, double a1) throws Throwable;
private static native moom.DZ __fieldRead595_15(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __fieldWrite595_16(moom.DZ a0, double a1) throws Throwable;
private static native moom.DZ __fieldRead595_17(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __fieldWrite595_18(moom.DZ a0, double a1) throws Throwable;
private static native org.lwjgl.util.vector.Vector4f[] __fieldRead595_19(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native org.lwjgl.util.vector.Vector4f[] __fieldRead595_20(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native org.lwjgl.util.vector.Vector4f[] __fieldRead595_21(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native org.lwjgl.util.vector.Vector4f[] __fieldRead595_22(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native org.lwjgl.util.vector.Vector4f[] __fieldRead595_23(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native org.lwjgl.util.vector.Vector4f[] __fieldRead595_24(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native org.lwjgl.util.vector.Vector4f[] __fieldRead595_25(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __invokedynamic595_26(int a0, long a1) throws Throwable;
private static native org.lwjgl.util.vector.Vector4f[] __fieldRead595_27(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __invokedynamic595_28(int a0, long a1) throws Throwable;
private static native int __invokedynamic595_29(int a0, long a1) throws Throwable;
private static native org.lwjgl.util.vector.Vector4f[] __fieldRead595_30(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native org.lwjgl.util.vector.Vector4f[] __fieldRead595_31(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native org.lwjgl.util.vector.Vector4f __call595_32(moom.OL a0, org.lwjgl.util.vector.Vector4f a1, org.lwjgl.util.vector.Vector4f a2) throws Throwable;
private static native org.lwjgl.util.vector.Vector4f[] __fieldRead595_33(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native float __fieldRead595_35(org.lwjgl.util.vector.Vector4f a0) throws Throwable;
private static native org.lwjgl.util.vector.Vector4f[] __fieldRead595_36(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native float __fieldRead595_37(org.lwjgl.util.vector.Vector4f a0) throws Throwable;
private static native void __fieldWrite595_38(org.lwjgl.util.vector.Vector4f a0, float a1) throws Throwable;
private static native org.lwjgl.util.vector.Vector4f[] __fieldRead595_39(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native float __fieldRead595_41(org.lwjgl.util.vector.Vector4f a0) throws Throwable;
private static native org.lwjgl.util.vector.Vector4f[] __fieldRead595_42(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native float __fieldRead595_43(org.lwjgl.util.vector.Vector4f a0) throws Throwable;
private static native void __fieldWrite595_44(org.lwjgl.util.vector.Vector4f a0, float a1) throws Throwable;
private static native org.lwjgl.util.vector.Vector4f[] __fieldRead595_45(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native float __fieldRead595_47(org.lwjgl.util.vector.Vector4f a0) throws Throwable;
private static native org.lwjgl.util.vector.Vector4f[] __fieldRead595_48(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native float __fieldRead595_49(org.lwjgl.util.vector.Vector4f a0) throws Throwable;
private static native void __fieldWrite595_50(org.lwjgl.util.vector.Vector4f a0, float a1) throws Throwable;
private static native org.lwjgl.util.vector.Vector4f[] __fieldRead595_51(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __fieldWrite595_52(org.lwjgl.util.vector.Vector4f a0, float a1) throws Throwable;
private static native java.lang.Throwable __call3059500_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_dcabf7ef617fefca8a27(net.minecraft.client.renderer.RenderGlobal a0, float a1, int a2) throws E;
private static final class __SourceHandler_dcabf7ef617fefca8a27 {

public static void f507(net.minecraft.client.renderer.RenderGlobal receiver, float p0, int p1) throws Throwable {
    long life3_3;
    int life5_24;
    moom.DR life6_38;
    moom.DR life6_58;
    float life7_69;
    float life8_73;
    float life9_77;
    float life10_94;
    float life11_104;
    float life12_114;
    net.minecraft.client.renderer.Tessellator life10_126;
    moom.lw life11_129;
    float[] life12_234;
    float life13_289;
    float life14_293;
    float life15_297;
    float life16_314;
    float life17_324;
    float life18_334;
    int life16_367;
    int life17_369;
    float life18_385;
    float life19_388;
    float life20_391;
    float life13_457;
    float life14_497;
    float life14_566;
    int life15_576;
    int life16_580;
    int life17_586;
    float life18_591;
    float life19_596;
    float life20_603;
    float life21_610;
    float life15_690;
    double life16_799;
    float life18_862;
    float life19_868;
    float life20_870;
    life3_3 = (__fieldRead507_0() ^ 137545607274045L);
    if ((__call507_4(__fieldRead507_3(__fieldRead507_2(__fieldRead507_1(receiver)))) == 1)) {
        __call507_5(receiver);
    } else {
        if (__call507_9(__fieldRead507_8(__fieldRead507_7(__fieldRead507_6(receiver))))) {
        __call507_10();
        life5_24 = __integerCategory507_12(__call507_11());
        if ((life5_24 != 0)) {
        __call507_13();
    }
        life6_38 = __call507_17(__fieldRead507_14(receiver), __call507_16(__fieldRead507_15(receiver)), p0);
        life6_58 = __call507_29(life6_38, __fieldRead507_19(__fieldRead507_18(receiver)), __fieldRead507_22(__call507_21(__fieldRead507_20(receiver))), (__fieldRead507_25(__call507_24(__fieldRead507_23(receiver))) + 0x1.0p0d), __fieldRead507_28(__call507_27(__fieldRead507_26(receiver))));
        if ((life5_24 != 0)) {
        __call507_30(life6_58);
    }
        life7_69 = ((float) __fieldRead507_31(life6_58));
        life8_73 = ((float) __fieldRead507_32(life6_58));
        life9_77 = ((float) __fieldRead507_33(life6_58));
        if ((p1 != 2)) {
        life10_94 = ((((life7_69 * 0x1.ep4f) + (life8_73 * 0x1.d8p5f)) + (life9_77 * 0x1.6p3f)) / 0x1.9p6f);
        life11_104 = (((life7_69 * 0x1.ep4f) + (life8_73 * 0x1.18p6f)) / 0x1.9p6f);
        life12_114 = (((life7_69 * 0x1.ep4f) + (life9_77 * 0x1.18p6f)) / 0x1.9p6f);
        life7_69 = life10_94;
        life8_73 = life11_104;
        life9_77 = life12_114;
    }
        __call507_34(life7_69, life8_73, life9_77);
        life10_126 = __call507_35();
        life11_129 = __call507_36(life10_126);
        __call507_37(0);
        __call507_38();
        if ((life5_24 != 0)) {
        __call507_39();
    }
        __call507_40(life7_69, life8_73, life9_77);
        if ((life5_24 != 0)) {
        __call507_41();
    }
        if (__call507_42()) {
        if (__fieldRead507_43(receiver)) {
        __call507_45(__fieldRead507_44(receiver));
        __call507_47(__invokedynamic507_46(26520, (1067280825730656499L ^ life3_3)));
        __call507_50(3, __invokedynamic507_48(16533, (8241298575996669849L ^ life3_3)), __invokedynamic507_49(22342, (7844977994030077989L ^ life3_3)), 0L);
        __call507_53(__fieldRead507_51(receiver), __invokedynamic507_52(140, (5506212657904684941L ^ life3_3)));
        int spill507_0 = 13727;
        __call507_55(__fieldRead507_54(receiver));
        __call507_57(__invokedynamic507_56(spill507_0, (4114405937978555081L ^ life3_3)));
    } else {
        __call507_59(__fieldRead507_58(receiver));
    }
    }
        __call507_60();
        if ((life5_24 != 0)) {
        __call507_61();
    }
        __call507_62();
        int spill507_1 = 21947;
        __call507_63();
        __call507_66(__invokedynamic507_64(spill507_1, (6244675725418420987L ^ life3_3)), __invokedynamic507_65(27667, (3110842827609072452L ^ life3_3)), 1, 0);
        __call507_67();
        life12_234 = __call507_72(__fieldRead507_69(__fieldRead507_68(receiver)), __call507_71(__fieldRead507_70(receiver), p0), p0);
        if ((life12_234 != null)) {
        if (__call507_73()) {
        __call507_74();
        if ((life5_24 != 0)) {
        __call507_75();
    }
        __call507_77(__invokedynamic507_76(21409, (4218134241269800181L ^ life3_3)));
        __call507_78();
        __call507_79(0x1.68p6f, 0x1.0p0f, 0x0.0p0f, 0x0.0p0f);
        __call507_83(((__call507_82(__call507_81(__fieldRead507_80(receiver), p0)) < 0x0.0p0f) ? 0x1.68p7f : 0x0.0p0f), 0x0.0p0f, 0x0.0p0f, 0x1.0p0f);
        __call507_84(0x1.68p6f, 0x0.0p0f, 0x0.0p0f, 0x1.0p0f);
        life13_289 = (life12_234)[0];
        life14_293 = (life12_234)[1];
        life15_297 = (life12_234)[2];
        if ((p1 != 2)) {
        life16_314 = ((((life13_289 * 0x1.ep4f) + (life14_293 * 0x1.d8p5f)) + (life15_297 * 0x1.6p3f)) / 0x1.9p6f);
        life17_324 = (((life13_289 * 0x1.ep4f) + (life14_293 * 0x1.18p6f)) / 0x1.9p6f);
        life18_334 = (((life13_289 * 0x1.ep4f) + (life15_297 * 0x1.18p6f)) / 0x1.9p6f);
        life13_289 = life16_314;
        life14_293 = life17_324;
        life15_297 = life18_334;
    }
        __call507_87(life11_129, __invokedynamic507_85(30557, (3807851671750965299L ^ life3_3)), __fieldRead507_86());
        int spill507_2 = 2671;
        __call507_90(__call507_89(__call507_88(life11_129, 0x0.0p0d, 0x1.9p6d, 0x0.0p0d), life13_289, life14_293, life15_297, (life12_234)[3]));
        life16_367 = __invokedynamic507_91(spill507_2, (6021988562212816176L ^ life3_3));
        life17_369 = 0;
        loop_region_337: while ((life17_369 <= __invokedynamic507_92(2671, (6021988562212816176L ^ life3_3)))) {
        life18_385 = (((((float) life17_369) * 0x1.921fb6p1f) * 0x1.0p1f) / 0x1.0p4f);
        life19_388 = __call507_93(life18_385);
        life20_391 = __call507_94(life18_385);
        __call507_97(__call507_96(__call507_95(life11_129, ((double) (life19_388 * 0x1.ep6f)), ((double) (life20_391 * 0x1.ep6f)), ((double) (((-life20_391) * 0x1.4p5f) * (life12_234)[3]))), (life12_234)[0], (life12_234)[1], (life12_234)[2], 0x0.0p0f));
        life17_369 += 1;
    }
        __call507_98(life10_126);
        int spill507_3 = 17597;
        __call507_99();
        __call507_101(__invokedynamic507_100(spill507_3, (2287995008323439601L ^ life3_3)));
    }
    }
        __call507_102();
        if ((life5_24 != 0)) {
        __call507_103();
    }
        __call507_105(__invokedynamic507_104(21947, (6244675725418420987L ^ life3_3)), 1, 1, 0);
        __call507_106();
        life13_457 = (0x1.0p0f - __call507_108(__fieldRead507_107(receiver), p0));
        __call507_109(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, life13_457);
        __call507_110(-0x1.68p6f, 0x0.0p0f, 0x1.0p0f, 0x0.0p0f);
        __call507_113(__fieldRead507_111(receiver), __fieldRead507_112(receiver), p0);
        if ((life5_24 != 0)) {
        __call507_114();
    }
        __call507_117((__call507_116(__fieldRead507_115(receiver), p0) * 0x1.68p8f), 0x1.0p0f, 0x0.0p0f, 0x0.0p0f);
        if ((life5_24 != 0)) {
        __call507_118();
    }
        life14_497 = 0x1.ep4f;
        if (__call507_119()) {
        __call507_122(__fieldRead507_120(receiver), __fieldRead507_121());
        __call507_125(life11_129, __invokedynamic507_123(140, (5506212657904684941L ^ life3_3)), __fieldRead507_124());
        __call507_128(__call507_127(__call507_126(life11_129, ((double) (-life14_497)), 0x1.9p6d, ((double) (-life14_497))), 0x0.0p0d, 0x0.0p0d));
        __call507_131(__call507_130(__call507_129(life11_129, ((double) life14_497), 0x1.9p6d, ((double) (-life14_497))), 0x1.0p0d, 0x0.0p0d));
        __call507_134(__call507_133(__call507_132(life11_129, ((double) life14_497), 0x1.9p6d, ((double) life14_497)), 0x1.0p0d, 0x1.0p0d));
        __call507_137(__call507_136(__call507_135(life11_129, ((double) (-life14_497)), 0x1.9p6d, ((double) life14_497)), 0x0.0p0d, 0x1.0p0d));
        __call507_138(life10_126);
    }
        life14_566 = 0x1.4p4f;
        if (__call507_139()) {
        __call507_142(__fieldRead507_140(receiver), __fieldRead507_141());
        life15_576 = __call507_144(__fieldRead507_143(receiver));
        life16_580 = (life15_576 % 4);
        life17_586 = ((life15_576 / 4) % 2);
        life18_591 = (((float) life16_580) / 0x1.0p2f);
        life19_596 = (((float) life17_586) / 0x1.0p1f);
        life20_603 = (((float) (life16_580 + 1)) / 0x1.0p2f);
        life21_610 = (((float) (life17_586 + 1)) / 0x1.0p1f);
        __call507_147(life11_129, __invokedynamic507_145(140, (5506212657904684941L ^ life3_3)), __fieldRead507_146());
        __call507_150(__call507_149(__call507_148(life11_129, ((double) (-life14_566)), -0x1.9p6d, ((double) life14_566)), ((double) life20_603), ((double) life21_610)));
        __call507_153(__call507_152(__call507_151(life11_129, ((double) life14_566), -0x1.9p6d, ((double) life14_566)), ((double) life18_591), ((double) life21_610)));
        __call507_156(__call507_155(__call507_154(life11_129, ((double) life14_566), -0x1.9p6d, ((double) (-life14_566))), ((double) life18_591), ((double) life19_596)));
        __call507_159(__call507_158(__call507_157(life11_129, ((double) (-life14_566)), -0x1.9p6d, ((double) (-life14_566))), ((double) life20_603), ((double) life19_596)));
        __call507_160(life10_126);
    }
        __call507_161();
        if ((life5_24 != 0)) {
        __call507_162();
    }
        life15_690 = (__call507_164(__fieldRead507_163(receiver), p0) * life13_457);
        if ((life15_690 > 0x0.0p0f)) {
        if (__call507_165()) {
        if ((!__call507_167(__fieldRead507_166(receiver)))) {
        __call507_168(life15_690, life15_690, life15_690, life15_690);
        if (__fieldRead507_169(receiver)) {
        __call507_171(__fieldRead507_170(receiver));
        __call507_173(__invokedynamic507_172(13727, (4114405937978555081L ^ life3_3)));
        __call507_176(3, __invokedynamic507_174(29258, (4612514672900701500L ^ life3_3)), __invokedynamic507_175(22342, (7844977994030077989L ^ life3_3)), 0L);
        __call507_179(__fieldRead507_177(receiver), __invokedynamic507_178(140, (5506212657904684941L ^ life3_3)));
        int spill507_4 = 13727;
        __call507_181(__fieldRead507_180(receiver));
        __call507_183(__invokedynamic507_182(spill507_4, (4114405937978555081L ^ life3_3)));
    } else {
        __call507_185(__fieldRead507_184(receiver));
    }
    }
    }
    }
        __call507_186(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
        __call507_187();
        __call507_188();
        __call507_189();
        if ((life5_24 != 0)) {
        __call507_190();
    }
        __call507_191();
        __call507_192();
        if ((life5_24 != 0)) {
        __call507_193();
    }
        __call507_194(0x0.0p0f, 0x0.0p0f, 0x0.0p0f);
        life16_799 = (__fieldRead507_198(__call507_197(__fieldRead507_196(__fieldRead507_195(receiver)), p0)) - __call507_200(__fieldRead507_199(receiver)));
        if ((life16_799 < 0x0.0p0d)) {
        __call507_201();
        __call507_202(0x0.0p0f, 0x1.8p3f, 0x0.0p0f);
        if (__fieldRead507_203(receiver)) {
        __call507_205(__fieldRead507_204(receiver));
        __call507_207(__invokedynamic507_206(13727, (4114405937978555081L ^ life3_3)));
        __call507_210(3, __invokedynamic507_208(29258, (4612514672900701500L ^ life3_3)), __invokedynamic507_209(22342, (7844977994030077989L ^ life3_3)), 0L);
        __call507_213(__fieldRead507_211(receiver), __invokedynamic507_212(140, (5506212657904684941L ^ life3_3)));
        int spill507_5 = 13727;
        __call507_215(__fieldRead507_214(receiver));
        __call507_217(__invokedynamic507_216(spill507_5, (4114405937978555081L ^ life3_3)));
    } else {
        __call507_219(__fieldRead507_218(receiver));
    }
        __call507_220();
        life18_862 = 0x1.0p0f;
        life19_868 = (-((float) (life16_799 + 0x1.04p6d)));
        life20_870 = -0x1.0p0f;
        __call507_223(life11_129, __invokedynamic507_221(140, (5506212657904684941L ^ life3_3)), __fieldRead507_222());
        __call507_227(__call507_226(__call507_224(life11_129, -0x1.0p0d, ((double) life19_868), 0x1.0p0d), 0, 0, 0, __invokedynamic507_225(14550, (6292081764455233422L ^ life3_3))));
        __call507_231(__call507_230(__call507_228(life11_129, 0x1.0p0d, ((double) life19_868), 0x1.0p0d), 0, 0, 0, __invokedynamic507_229(14550, (6292081764455233422L ^ life3_3))));
        __call507_235(__call507_234(__call507_232(life11_129, 0x1.0p0d, -0x1.0p0d, 0x1.0p0d), 0, 0, 0, __invokedynamic507_233(14550, (6292081764455233422L ^ life3_3))));
        __call507_239(__call507_238(__call507_236(life11_129, -0x1.0p0d, -0x1.0p0d, 0x1.0p0d), 0, 0, 0, __invokedynamic507_237(14550, (6292081764455233422L ^ life3_3))));
        __call507_243(__call507_242(__call507_240(life11_129, -0x1.0p0d, -0x1.0p0d, -0x1.0p0d), 0, 0, 0, __invokedynamic507_241(14550, (6292081764455233422L ^ life3_3))));
        __call507_247(__call507_246(__call507_244(life11_129, 0x1.0p0d, -0x1.0p0d, -0x1.0p0d), 0, 0, 0, __invokedynamic507_245(14550, (6292081764455233422L ^ life3_3))));
        __call507_251(__call507_250(__call507_248(life11_129, 0x1.0p0d, ((double) life19_868), -0x1.0p0d), 0, 0, 0, __invokedynamic507_249(14550, (6292081764455233422L ^ life3_3))));
        __call507_255(__call507_254(__call507_252(life11_129, -0x1.0p0d, ((double) life19_868), -0x1.0p0d), 0, 0, 0, __invokedynamic507_253(14550, (6292081764455233422L ^ life3_3))));
        __call507_259(__call507_258(__call507_256(life11_129, 0x1.0p0d, -0x1.0p0d, -0x1.0p0d), 0, 0, 0, __invokedynamic507_257(14550, (6292081764455233422L ^ life3_3))));
        __call507_263(__call507_262(__call507_260(life11_129, 0x1.0p0d, -0x1.0p0d, 0x1.0p0d), 0, 0, 0, __invokedynamic507_261(14550, (6292081764455233422L ^ life3_3))));
        __call507_267(__call507_266(__call507_264(life11_129, 0x1.0p0d, ((double) life19_868), 0x1.0p0d), 0, 0, 0, __invokedynamic507_265(14550, (6292081764455233422L ^ life3_3))));
        __call507_271(__call507_270(__call507_268(life11_129, 0x1.0p0d, ((double) life19_868), -0x1.0p0d), 0, 0, 0, __invokedynamic507_269(14550, (6292081764455233422L ^ life3_3))));
        __call507_275(__call507_274(__call507_272(life11_129, -0x1.0p0d, ((double) life19_868), -0x1.0p0d), 0, 0, 0, __invokedynamic507_273(14550, (6292081764455233422L ^ life3_3))));
        __call507_279(__call507_278(__call507_276(life11_129, -0x1.0p0d, ((double) life19_868), 0x1.0p0d), 0, 0, 0, __invokedynamic507_277(14550, (6292081764455233422L ^ life3_3))));
        __call507_283(__call507_282(__call507_280(life11_129, -0x1.0p0d, -0x1.0p0d, 0x1.0p0d), 0, 0, 0, __invokedynamic507_281(14550, (6292081764455233422L ^ life3_3))));
        __call507_287(__call507_286(__call507_284(life11_129, -0x1.0p0d, -0x1.0p0d, -0x1.0p0d), 0, 0, 0, __invokedynamic507_285(14550, (6292081764455233422L ^ life3_3))));
        __call507_291(__call507_290(__call507_288(life11_129, -0x1.0p0d, -0x1.0p0d, -0x1.0p0d), 0, 0, 0, __invokedynamic507_289(14550, (6292081764455233422L ^ life3_3))));
        __call507_295(__call507_294(__call507_292(life11_129, -0x1.0p0d, -0x1.0p0d, 0x1.0p0d), 0, 0, 0, __invokedynamic507_293(14550, (6292081764455233422L ^ life3_3))));
        __call507_299(__call507_298(__call507_296(life11_129, 0x1.0p0d, -0x1.0p0d, 0x1.0p0d), 0, 0, 0, __invokedynamic507_297(14550, (6292081764455233422L ^ life3_3))));
        __call507_303(__call507_302(__call507_300(life11_129, 0x1.0p0d, -0x1.0p0d, -0x1.0p0d), 0, 0, 0, __invokedynamic507_301(14550, (6292081764455233422L ^ life3_3))));
        __call507_304(life10_126);
    }
        if (__call507_307(__fieldRead507_306(__fieldRead507_305(receiver)))) {
        __call507_308(((life7_69 * 0x1.99999ap-3f) + 0x1.47ae14p-5f), ((life8_73 * 0x1.99999ap-3f) + 0x1.47ae14p-5f), ((life9_77 * 0x1.333334p-1f) + 0x1.99999ap-4f));
    } else {
        __call507_309(life7_69, life8_73, life9_77);
    }
        if ((__fieldRead507_312(__fieldRead507_311(__fieldRead507_310(receiver))) <= 4)) {
        __call507_322(__fieldRead507_315(__fieldRead507_314(__fieldRead507_313(receiver))), __fieldRead507_318(__fieldRead507_317(__fieldRead507_316(receiver))), __fieldRead507_321(__fieldRead507_320(__fieldRead507_319(receiver))));
    }
        __call507_323();
        __call507_324(0x0.0p0f, (-((float) (life16_799 - 0x1.0p4d))), 0x0.0p0f);
        if (__call507_325()) {
        if (__fieldRead507_326(receiver)) {
        __call507_328(__fieldRead507_327(receiver));
        __call507_330(__invokedynamic507_329(13727, (4114405937978555081L ^ life3_3)));
        __call507_333(3, __invokedynamic507_331(29258, (4612514672900701500L ^ life3_3)), __invokedynamic507_332(22342, (7844977994030077989L ^ life3_3)), 0);
        __call507_336(__fieldRead507_334(receiver), __invokedynamic507_335(140, (5506212657904684941L ^ life3_3)));
        int spill507_6 = 13727;
        __call507_338(__fieldRead507_337(receiver));
        __call507_340(__invokedynamic507_339(spill507_6, (4114405937978555081L ^ life3_3)));
    } else {
        __call507_342(__fieldRead507_341(receiver));
    }
    }
        __call507_343();
        __call507_344();
        if ((life5_24 != 0)) {
        __call507_345();
    }
        __call507_346(1);
    }
    }
    return;
}
public static void h507_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call2050700_0(p0);
}
public static void h507_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call2050701_0(p0);
}
public static void h507_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call2050702_0(p0);
}
public static void h507_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call2050703_0(p0);
}
public static void h507_4(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call2050704_0(p0);
}
public static void h507_5(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call2050705_0(p0);
}
public static void h507_6(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call2050706_0(p0);
}
public static void h507_7(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call2050707_0(p0);
}
public static void h507_8(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call2050708_0(p0);
}
public static void h507_9(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call2050709_0(p0);
}
public static void h507_10(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call2050710_0(p0);
}
public static void h507_11(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call2050711_0(p0);
}
public static void h507_12(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call2050712_0(p0);
}
public static void h507_13(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call2050713_0(p0);
}
public static void h507_14(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call2050714_0(p0);
}
public static void h507_15(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call2050715_0(p0);
}
public static void h507_16(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call2050716_0(p0);
}
public static void h507_17(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call2050717_0(p0);
}
public static void h507_18(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call2050718_0(p0);
}
public static void h507_19(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call2050719_0(p0);
}
public static void h507_20(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call2050720_0(p0);
}
public static void h507_21(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call2050721_0(p0);
}
public static void h507_22(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call2050722_0(p0);
}
public static void h507_23(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call2050723_0(p0);
}
public static void h507_24(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call2050724_0(p0);
}
public static void h507_25(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call2050725_0(p0);
}
public static void h507_26(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call2050726_0(p0);
}
public static void h507_27(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call2050727_0(p0);
}
public static void h507_28(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call2050728_0(p0);
}
public static void h507_29(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call2050729_0(p0);
}
private static native long __fieldRead507_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead507_1(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead507_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.EA __fieldRead507_3(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native int __call507_4(moom.EA a0) throws Throwable;
private static native void __call507_5(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead507_6(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead507_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.EA __fieldRead507_8(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native boolean __call507_9(moom.EA a0) throws Throwable;
private static native void __call507_10() throws Throwable;
private static native boolean __call507_11() throws Throwable;
private static native int __integerCategory507_12(boolean value) throws Throwable;
private static native void __call507_13() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead507_14(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead507_15(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call507_16(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DR __call507_17(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.entity.Entity a1, float a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead507_18(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead507_19(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead507_20(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call507_21(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead507_22(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead507_23(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call507_24(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead507_25(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead507_26(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call507_27(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead507_28(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.DR __call507_29(moom.DR a0, net.minecraft.client.multiplayer.WorldClient a1, double a2, double a3, double a4) throws Throwable;
private static native void __call507_30(moom.DR a0) throws Throwable;
private static native double __fieldRead507_31(moom.DR a0) throws Throwable;
private static native double __fieldRead507_32(moom.DR a0) throws Throwable;
private static native double __fieldRead507_33(moom.DR a0) throws Throwable;
private static native void __call507_34(float a0, float a1, float a2) throws Throwable;
private static native net.minecraft.client.renderer.Tessellator __call507_35() throws Throwable;
private static native moom.lw __call507_36(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native void __call507_37(int a0) throws Throwable;
private static native void __call507_38() throws Throwable;
private static native void __call507_39() throws Throwable;
private static native void __call507_40(float a0, float a1, float a2) throws Throwable;
private static native void __call507_41() throws Throwable;
private static native boolean __call507_42() throws Throwable;
private static native boolean __fieldRead507_43(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.oC __fieldRead507_44(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call507_45(moom.oC a0) throws Throwable;
private static native int __invokedynamic507_46(int a0, long a1) throws Throwable;
private static native void __call507_47(int a0) throws Throwable;
private static native int __invokedynamic507_48(int a0, long a1) throws Throwable;
private static native int __invokedynamic507_49(int a0, long a1) throws Throwable;
private static native void __call507_50(int a0, int a1, int a2, long a3) throws Throwable;
private static native moom.oC __fieldRead507_51(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __invokedynamic507_52(int a0, long a1) throws Throwable;
private static native void __call507_53(moom.oC a0, int a1) throws Throwable;
private static native moom.oC __fieldRead507_54(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call507_55(moom.oC a0) throws Throwable;
private static native int __invokedynamic507_56(int a0, long a1) throws Throwable;
private static native void __call507_57(int a0) throws Throwable;
private static native int __fieldRead507_58(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call507_59(int a0) throws Throwable;
private static native void __call507_60() throws Throwable;
private static native void __call507_61() throws Throwable;
private static native void __call507_62() throws Throwable;
private static native void __call507_63() throws Throwable;
private static native int __invokedynamic507_64(int a0, long a1) throws Throwable;
private static native int __invokedynamic507_65(int a0, long a1) throws Throwable;
private static native void __call507_66(int a0, int a1, int a2, int a3) throws Throwable;
private static native void __call507_67() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead507_68(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.EA __fieldRead507_69(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead507_70(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native float __call507_71(net.minecraft.client.multiplayer.WorldClient a0, float a1) throws Throwable;
private static native float[] __call507_72(moom.EA a0, float a1, float a2) throws Throwable;
private static native boolean __call507_73() throws Throwable;
private static native void __call507_74() throws Throwable;
private static native void __call507_75() throws Throwable;
private static native int __invokedynamic507_76(int a0, long a1) throws Throwable;
private static native void __call507_77(int a0) throws Throwable;
private static native void __call507_78() throws Throwable;
private static native void __call507_79(float a0, float a1, float a2, float a3) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead507_80(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native float __call507_81(net.minecraft.client.multiplayer.WorldClient a0, float a1) throws Throwable;
private static native float __call507_82(float a0) throws Throwable;
private static native void __call507_83(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call507_84(float a0, float a1, float a2, float a3) throws Throwable;
private static native int __invokedynamic507_85(int a0, long a1) throws Throwable;
private static native moom.oD __fieldRead507_86() throws Throwable;
private static native void __call507_87(moom.lw a0, int a1, moom.oD a2) throws Throwable;
private static native moom.lw __call507_88(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call507_89(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native void __call507_90(moom.lw a0) throws Throwable;
private static native int __invokedynamic507_91(int a0, long a1) throws Throwable;
private static native int __invokedynamic507_92(int a0, long a1) throws Throwable;
private static native float __call507_93(float a0) throws Throwable;
private static native float __call507_94(float a0) throws Throwable;
private static native moom.lw __call507_95(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call507_96(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native void __call507_97(moom.lw a0) throws Throwable;
private static native void __call507_98(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native void __call507_99() throws Throwable;
private static native int __invokedynamic507_100(int a0, long a1) throws Throwable;
private static native void __call507_101(int a0) throws Throwable;
private static native void __call507_102() throws Throwable;
private static native void __call507_103() throws Throwable;
private static native int __invokedynamic507_104(int a0, long a1) throws Throwable;
private static native void __call507_105(int a0, int a1, int a2, int a3) throws Throwable;
private static native void __call507_106() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead507_107(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native float __call507_108(net.minecraft.client.multiplayer.WorldClient a0, float a1) throws Throwable;
private static native void __call507_109(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call507_110(float a0, float a1, float a2, float a3) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead507_111(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __fieldRead507_112(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call507_113(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.client.renderer.texture.TextureManager a1, float a2) throws Throwable;
private static native void __call507_114() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead507_115(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native float __call507_116(net.minecraft.client.multiplayer.WorldClient a0, float a1) throws Throwable;
private static native void __call507_117(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call507_118() throws Throwable;
private static native boolean __call507_119() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __fieldRead507_120(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.DD __fieldRead507_121() throws Throwable;
private static native void __call507_122(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native int __invokedynamic507_123(int a0, long a1) throws Throwable;
private static native moom.oD __fieldRead507_124() throws Throwable;
private static native void __call507_125(moom.lw a0, int a1, moom.oD a2) throws Throwable;
private static native moom.lw __call507_126(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call507_127(moom.lw a0, double a1, double a2) throws Throwable;
private static native void __call507_128(moom.lw a0) throws Throwable;
private static native moom.lw __call507_129(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call507_130(moom.lw a0, double a1, double a2) throws Throwable;
private static native void __call507_131(moom.lw a0) throws Throwable;
private static native moom.lw __call507_132(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call507_133(moom.lw a0, double a1, double a2) throws Throwable;
private static native void __call507_134(moom.lw a0) throws Throwable;
private static native moom.lw __call507_135(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call507_136(moom.lw a0, double a1, double a2) throws Throwable;
private static native void __call507_137(moom.lw a0) throws Throwable;
private static native void __call507_138(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native boolean __call507_139() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __fieldRead507_140(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.DD __fieldRead507_141() throws Throwable;
private static native void __call507_142(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead507_143(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __call507_144(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native int __invokedynamic507_145(int a0, long a1) throws Throwable;
private static native moom.oD __fieldRead507_146() throws Throwable;
private static native void __call507_147(moom.lw a0, int a1, moom.oD a2) throws Throwable;
private static native moom.lw __call507_148(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call507_149(moom.lw a0, double a1, double a2) throws Throwable;
private static native void __call507_150(moom.lw a0) throws Throwable;
private static native moom.lw __call507_151(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call507_152(moom.lw a0, double a1, double a2) throws Throwable;
private static native void __call507_153(moom.lw a0) throws Throwable;
private static native moom.lw __call507_154(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call507_155(moom.lw a0, double a1, double a2) throws Throwable;
private static native void __call507_156(moom.lw a0) throws Throwable;
private static native moom.lw __call507_157(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call507_158(moom.lw a0, double a1, double a2) throws Throwable;
private static native void __call507_159(moom.lw a0) throws Throwable;
private static native void __call507_160(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native void __call507_161() throws Throwable;
private static native void __call507_162() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead507_163(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native float __call507_164(net.minecraft.client.multiplayer.WorldClient a0, float a1) throws Throwable;
private static native boolean __call507_165() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead507_166(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call507_167(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native void __call507_168(float a0, float a1, float a2, float a3) throws Throwable;
private static native boolean __fieldRead507_169(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.oC __fieldRead507_170(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call507_171(moom.oC a0) throws Throwable;
private static native int __invokedynamic507_172(int a0, long a1) throws Throwable;
private static native void __call507_173(int a0) throws Throwable;
private static native int __invokedynamic507_174(int a0, long a1) throws Throwable;
private static native int __invokedynamic507_175(int a0, long a1) throws Throwable;
private static native void __call507_176(int a0, int a1, int a2, long a3) throws Throwable;
private static native moom.oC __fieldRead507_177(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __invokedynamic507_178(int a0, long a1) throws Throwable;
private static native void __call507_179(moom.oC a0, int a1) throws Throwable;
private static native moom.oC __fieldRead507_180(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call507_181(moom.oC a0) throws Throwable;
private static native int __invokedynamic507_182(int a0, long a1) throws Throwable;
private static native void __call507_183(int a0) throws Throwable;
private static native int __fieldRead507_184(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call507_185(int a0) throws Throwable;
private static native void __call507_186(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call507_187() throws Throwable;
private static native void __call507_188() throws Throwable;
private static native void __call507_189() throws Throwable;
private static native void __call507_190() throws Throwable;
private static native void __call507_191() throws Throwable;
private static native void __call507_192() throws Throwable;
private static native void __call507_193() throws Throwable;
private static native void __call507_194(float a0, float a1, float a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead507_195(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead507_196(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DR __call507_197(net.minecraft.client.entity.EntityPlayerSP a0, float a1) throws Throwable;
private static native double __fieldRead507_198(moom.DR a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead507_199(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native double __call507_200(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native void __call507_201() throws Throwable;
private static native void __call507_202(float a0, float a1, float a2) throws Throwable;
private static native boolean __fieldRead507_203(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.oC __fieldRead507_204(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call507_205(moom.oC a0) throws Throwable;
private static native int __invokedynamic507_206(int a0, long a1) throws Throwable;
private static native void __call507_207(int a0) throws Throwable;
private static native int __invokedynamic507_208(int a0, long a1) throws Throwable;
private static native int __invokedynamic507_209(int a0, long a1) throws Throwable;
private static native void __call507_210(int a0, int a1, int a2, long a3) throws Throwable;
private static native moom.oC __fieldRead507_211(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __invokedynamic507_212(int a0, long a1) throws Throwable;
private static native void __call507_213(moom.oC a0, int a1) throws Throwable;
private static native moom.oC __fieldRead507_214(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call507_215(moom.oC a0) throws Throwable;
private static native int __invokedynamic507_216(int a0, long a1) throws Throwable;
private static native void __call507_217(int a0) throws Throwable;
private static native int __fieldRead507_218(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call507_219(int a0) throws Throwable;
private static native void __call507_220() throws Throwable;
private static native int __invokedynamic507_221(int a0, long a1) throws Throwable;
private static native moom.oD __fieldRead507_222() throws Throwable;
private static native void __call507_223(moom.lw a0, int a1, moom.oD a2) throws Throwable;
private static native moom.lw __call507_224(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic507_225(int a0, long a1) throws Throwable;
private static native moom.lw __call507_226(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call507_227(moom.lw a0) throws Throwable;
private static native moom.lw __call507_228(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic507_229(int a0, long a1) throws Throwable;
private static native moom.lw __call507_230(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call507_231(moom.lw a0) throws Throwable;
private static native moom.lw __call507_232(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic507_233(int a0, long a1) throws Throwable;
private static native moom.lw __call507_234(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call507_235(moom.lw a0) throws Throwable;
private static native moom.lw __call507_236(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic507_237(int a0, long a1) throws Throwable;
private static native moom.lw __call507_238(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call507_239(moom.lw a0) throws Throwable;
private static native moom.lw __call507_240(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic507_241(int a0, long a1) throws Throwable;
private static native moom.lw __call507_242(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call507_243(moom.lw a0) throws Throwable;
private static native moom.lw __call507_244(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic507_245(int a0, long a1) throws Throwable;
private static native moom.lw __call507_246(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call507_247(moom.lw a0) throws Throwable;
private static native moom.lw __call507_248(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic507_249(int a0, long a1) throws Throwable;
private static native moom.lw __call507_250(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call507_251(moom.lw a0) throws Throwable;
private static native moom.lw __call507_252(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic507_253(int a0, long a1) throws Throwable;
private static native moom.lw __call507_254(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call507_255(moom.lw a0) throws Throwable;
private static native moom.lw __call507_256(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic507_257(int a0, long a1) throws Throwable;
private static native moom.lw __call507_258(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call507_259(moom.lw a0) throws Throwable;
private static native moom.lw __call507_260(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic507_261(int a0, long a1) throws Throwable;
private static native moom.lw __call507_262(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call507_263(moom.lw a0) throws Throwable;
private static native moom.lw __call507_264(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic507_265(int a0, long a1) throws Throwable;
private static native moom.lw __call507_266(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call507_267(moom.lw a0) throws Throwable;
private static native moom.lw __call507_268(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic507_269(int a0, long a1) throws Throwable;
private static native moom.lw __call507_270(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call507_271(moom.lw a0) throws Throwable;
private static native moom.lw __call507_272(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic507_273(int a0, long a1) throws Throwable;
private static native moom.lw __call507_274(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call507_275(moom.lw a0) throws Throwable;
private static native moom.lw __call507_276(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic507_277(int a0, long a1) throws Throwable;
private static native moom.lw __call507_278(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call507_279(moom.lw a0) throws Throwable;
private static native moom.lw __call507_280(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic507_281(int a0, long a1) throws Throwable;
private static native moom.lw __call507_282(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call507_283(moom.lw a0) throws Throwable;
private static native moom.lw __call507_284(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic507_285(int a0, long a1) throws Throwable;
private static native moom.lw __call507_286(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call507_287(moom.lw a0) throws Throwable;
private static native moom.lw __call507_288(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic507_289(int a0, long a1) throws Throwable;
private static native moom.lw __call507_290(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call507_291(moom.lw a0) throws Throwable;
private static native moom.lw __call507_292(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic507_293(int a0, long a1) throws Throwable;
private static native moom.lw __call507_294(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call507_295(moom.lw a0) throws Throwable;
private static native moom.lw __call507_296(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic507_297(int a0, long a1) throws Throwable;
private static native moom.lw __call507_298(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call507_299(moom.lw a0) throws Throwable;
private static native moom.lw __call507_300(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic507_301(int a0, long a1) throws Throwable;
private static native moom.lw __call507_302(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call507_303(moom.lw a0) throws Throwable;
private static native void __call507_304(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead507_305(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.EA __fieldRead507_306(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native boolean __call507_307(moom.EA a0) throws Throwable;
private static native void __call507_308(float a0, float a1, float a2) throws Throwable;
private static native void __call507_309(float a0, float a1, float a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead507_310(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead507_311(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead507_312(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead507_313(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.renderer.EntityRenderer __fieldRead507_314(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead507_315(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead507_316(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.renderer.EntityRenderer __fieldRead507_317(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead507_318(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead507_319(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.renderer.EntityRenderer __fieldRead507_320(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead507_321(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call507_322(float a0, float a1, float a2) throws Throwable;
private static native void __call507_323() throws Throwable;
private static native void __call507_324(float a0, float a1, float a2) throws Throwable;
private static native boolean __call507_325() throws Throwable;
private static native boolean __fieldRead507_326(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.oC __fieldRead507_327(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call507_328(moom.oC a0) throws Throwable;
private static native int __invokedynamic507_329(int a0, long a1) throws Throwable;
private static native void __call507_330(int a0) throws Throwable;
private static native int __invokedynamic507_331(int a0, long a1) throws Throwable;
private static native int __invokedynamic507_332(int a0, long a1) throws Throwable;
private static native void __call507_333(int a0, int a1, int a2, int a3) throws Throwable;
private static native moom.oC __fieldRead507_334(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __invokedynamic507_335(int a0, long a1) throws Throwable;
private static native void __call507_336(moom.oC a0, int a1) throws Throwable;
private static native moom.oC __fieldRead507_337(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call507_338(moom.oC a0) throws Throwable;
private static native int __invokedynamic507_339(int a0, long a1) throws Throwable;
private static native void __call507_340(int a0) throws Throwable;
private static native int __fieldRead507_341(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call507_342(int a0) throws Throwable;
private static native void __call507_343() throws Throwable;
private static native void __call507_344() throws Throwable;
private static native void __call507_345() throws Throwable;
private static native void __call507_346(int a0) throws Throwable;
private static native java.lang.Throwable __call2050700_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call2050701_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call2050702_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call2050703_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call2050704_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call2050705_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call2050706_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call2050707_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call2050708_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call2050709_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call2050710_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call2050711_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call2050712_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call2050713_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call2050714_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call2050715_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call2050716_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call2050717_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call2050718_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call2050719_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call2050720_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call2050721_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call2050722_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call2050723_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call2050724_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call2050725_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call2050726_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call2050727_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call2050728_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call2050729_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c7ea5958bcae6fcc1f1e(net.minecraft.client.renderer.RenderGlobal a0, int a1, int a2) throws E;
private static final class __SourceHandler_c7ea5958bcae6fcc1f1e {

public static void f2514(net.minecraft.client.renderer.RenderGlobal receiver, int p0, int p1) throws Throwable {
    if (__fieldRead2514_0()) {
        if ((__fieldRead2514_1(receiver) != null)) {
        __call2514_3(__fieldRead2514_2(receiver), p0, p1);
    }
    }
    return;
}
public static void h2514_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251400_0(p0);
}
public static void h2514_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251401_0(p0);
}
private static native boolean __fieldRead2514_0() throws Throwable;
private static native net.minecraft.client.shader.ShaderGroup __fieldRead2514_1(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.shader.ShaderGroup __fieldRead2514_2(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call2514_3(net.minecraft.client.shader.ShaderGroup a0, int a1, int a2) throws Throwable;
private static native java.lang.Throwable __call1251400_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251401_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_2923859c31dd3b5bff1c(net.minecraft.client.renderer.RenderGlobal a0, int a1, moom.DT a2, int a3) throws E;
private static final class __SourceHandler_2923859c31dd3b5bff1c {

public static void f1052(net.minecraft.client.renderer.RenderGlobal receiver, int p0, moom.DT p1, int p2) throws Throwable {
    long life4_3;
    double life6_19;
    double life8_28;
    double life10_37;
    double life12_50;
    double life14_55;
    double life16_60;
    double life18_65;
    forest_join_121: {
    forest_join_111: {
    forest_join_93: {
    forest_join_6: {
    life4_3 = (__fieldRead1052_0() ^ 122571877465681L);
    switch (p0) {
case 1013:
case 1018:
{
        break forest_join_6;
    }
default:
{
        break forest_join_121;
    }
}
    }
    if (!((__call1052_2(__fieldRead1052_1(receiver)) != null))) {
        break forest_join_121;
    }
    life6_19 = (((double) __call1052_3(p1)) - __fieldRead1052_6(__call1052_5(__fieldRead1052_4(receiver))));
    life8_28 = (((double) __call1052_7(p1)) - __fieldRead1052_10(__call1052_9(__fieldRead1052_8(receiver))));
    life10_37 = (((double) __call1052_11(p1)) - __fieldRead1052_14(__call1052_13(__fieldRead1052_12(receiver))));
    life12_50 = __call1052_15((((life6_19 * life6_19) + (life8_28 * life8_28)) + (life10_37 * life10_37)));
    life14_55 = __fieldRead1052_18(__call1052_17(__fieldRead1052_16(receiver)));
    life16_60 = __fieldRead1052_21(__call1052_20(__fieldRead1052_19(receiver)));
    life18_65 = __fieldRead1052_24(__call1052_23(__fieldRead1052_22(receiver)));
    if (!((__numericCompare1052_25(life12_50, 0x0.0p0d) > 0))) {
        break forest_join_93;
    }
    life14_55 = (life14_55 + ((life6_19 / life12_50) * 0x1.0p1d));
    life16_60 = (life16_60 + ((life8_28 / life12_50) * 0x1.0p1d));
    life18_65 = (life18_65 + ((life10_37 / life12_50) * 0x1.0p1d));
    }
    if (!((p0 == __invokedynamic1052_26(13095, (6342171828451302416L ^ life4_3))))) {
        break forest_join_111;
    }
    __call1052_28(__fieldRead1052_27(receiver), life14_55, life16_60, life18_65, "mob.wither.spawn", 0x1.0p0f, 0x1.0p0f, 0);
    break forest_join_121;
    }
    __call1052_30(__fieldRead1052_29(receiver), life14_55, life16_60, life18_65, "mob.enderdragon.end", 0x1.4p2f, 0x1.0p0f, 0);
    }
    return;
}
public static void h1052_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3105200_0(p0);
}
public static void h1052_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3105201_0(p0);
}
private static native long __fieldRead1052_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1052_1(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call1052_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __call1052_3(moom.DT a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1052_4(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call1052_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead1052_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call1052_7(moom.DT a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1052_8(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call1052_9(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead1052_10(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call1052_11(moom.DT a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1052_12(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call1052_13(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead1052_14(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __call1052_15(double a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1052_16(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call1052_17(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead1052_18(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1052_19(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call1052_20(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead1052_21(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1052_22(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call1052_23(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead1052_24(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __numericCompare1052_25(double a0, double a1) throws Throwable;
private static native int __invokedynamic1052_26(int a0, long a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1052_27(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call1052_28(net.minecraft.client.multiplayer.WorldClient a0, double a1, double a2, double a3, java.lang.String a4, float a5, float a6, int a7) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1052_29(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call1052_30(net.minecraft.client.multiplayer.WorldClient a0, double a1, double a2, double a3, java.lang.String a4, float a5, float a6, int a7) throws Throwable;
private static native java.lang.Throwable __call3105200_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3105201_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.client.particle.EntityFX __sourceHandlerCall_b776de57a58a45acc605(net.minecraft.client.renderer.RenderGlobal a0, int a1, boolean a2, double a3, double a4, double a5, double a6, double a7, double a8, int[] a9) throws E;
private static final class __SourceHandler_b776de57a58a45acc605 {

public static net.minecraft.client.particle.EntityFX f2516(net.minecraft.client.renderer.RenderGlobal receiver, int p0, boolean p1, double p2, double p3, double p4, double p5, double p6, double p7, int[] p8) throws Throwable {
    int life16_21;
    double life17_42;
    double life19_49;
    double life21_56;
    double life23_294;
    net.minecraft.client.particle.EntityFX life23_338;
    if ((__fieldRead2516_0(receiver) != null)) {
        if ((__call2516_2(__fieldRead2516_1(receiver)) != null)) {
        if ((__fieldRead2516_4(__fieldRead2516_3(receiver)) != null)) {
        life16_21 = __fieldRead2516_7(__fieldRead2516_6(__fieldRead2516_5(receiver)));
        if ((life16_21 == 1)) {
        if ((__call2516_10(__fieldRead2516_9(__fieldRead2516_8(receiver)), 3) == 0)) {
        life16_21 = 2;
    }
    }
        life17_42 = (__fieldRead2516_13(__call2516_12(__fieldRead2516_11(receiver))) - p2);
        life19_49 = (__fieldRead2516_16(__call2516_15(__fieldRead2516_14(receiver))) - p3);
        life21_56 = (__fieldRead2516_19(__call2516_18(__fieldRead2516_17(receiver))) - p4);
        if ((p0 == __call2516_21(__fieldRead2516_20()))) {
        if ((!__call2516_22())) {
        return null;
    }
    }
        if ((p0 == __call2516_24(__fieldRead2516_23()))) {
        if ((!__call2516_25())) {
        return null;
    }
    }
        if ((p0 == __call2516_27(__fieldRead2516_26()))) {
        if ((!__call2516_28())) {
        return null;
    }
    }
        if ((p0 == __call2516_30(__fieldRead2516_29()))) {
        if ((!__call2516_31())) {
        return null;
    }
    }
        if ((p0 == __call2516_33(__fieldRead2516_32()))) {
        if ((!__call2516_34())) {
        return null;
    }
    }
        if ((p0 == __call2516_36(__fieldRead2516_35()))) {
        if ((!__call2516_37())) {
        return null;
    }
    }
        if ((p0 == __call2516_39(__fieldRead2516_38()))) {
        if ((!__call2516_40())) {
        return null;
    }
    }
        if ((p0 == __call2516_42(__fieldRead2516_41()))) {
        if ((!__call2516_43())) {
        return null;
    }
    }
        if ((p0 == __call2516_45(__fieldRead2516_44()))) {
        if ((!__call2516_46())) {
        return null;
    }
    }
        if ((p0 == __call2516_48(__fieldRead2516_47()))) {
        if ((!__call2516_49())) {
        return null;
    }
    }
        if ((p0 == __call2516_51(__fieldRead2516_50()))) {
        if ((!__call2516_52())) {
        return null;
    }
    }
        if ((p0 == __call2516_54(__fieldRead2516_53()))) {
        if ((!__call2516_55())) {
        return null;
    }
    }
        if ((p0 == __call2516_57(__fieldRead2516_56()))) {
        if ((!__call2516_58())) {
        return null;
    }
    }
        if ((p0 == __call2516_60(__fieldRead2516_59()))) {
        if ((!__call2516_61())) {
        return null;
    }
    }
        if ((p0 == __call2516_63(__fieldRead2516_62()))) {
        if ((!__call2516_64())) {
        return null;
    }
    }
        if ((p0 == __call2516_66(__fieldRead2516_65()))) {
        if ((!__call2516_67())) {
        return null;
    }
    }
        if ((p0 == __call2516_69(__fieldRead2516_68()))) {
        if ((!__call2516_70())) {
        return null;
    }
    }
        if ((p0 == __call2516_72(__fieldRead2516_71()))) {
        if ((!__call2516_73())) {
        return null;
    }
    }
        if ((!p1)) {
        life23_294 = 0x1.0p8d;
        if ((p0 == __call2516_75(__fieldRead2516_74()))) {
        life23_294 = 0x1.2c2p15d;
    }
        if (((((life17_42 * life17_42) + (life19_49 * life19_49)) + (life21_56 * life21_56)) > life23_294)) {
        return null;
    }
        if ((life16_21 > 1)) {
        return null;
    }
    }
        life23_338 = __call2516_78(__fieldRead2516_77(__fieldRead2516_76(receiver)), p0, p2, p3, p4, p5, p6, p7, p8);
        if ((p0 == __call2516_80(__fieldRead2516_79()))) {
        __call2516_83(life23_338, __fieldRead2516_81(receiver), p2, p3, p4, __fieldRead2516_82(receiver));
    }
        if ((p0 == __call2516_85(__fieldRead2516_84()))) {
        __call2516_88(life23_338, __fieldRead2516_86(receiver), p2, p3, p4, __fieldRead2516_87(receiver));
    }
        if ((p0 == __call2516_90(__fieldRead2516_89()))) {
        __call2516_93(life23_338, __fieldRead2516_91(receiver), p2, p3, p4, __fieldRead2516_92(receiver));
    }
        if ((p0 == __call2516_95(__fieldRead2516_94()))) {
        __call2516_96(life23_338);
    }
        if ((p0 == __call2516_98(__fieldRead2516_97()))) {
        __call2516_99(life23_338);
    }
        if ((p0 == __call2516_101(__fieldRead2516_100()))) {
        __call2516_103(life23_338, __fieldRead2516_102(receiver), p2, p3, p4);
    }
        return life23_338;
    }
    }
    }
    return null;
}
public static void h2516_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251600_0(p0);
}
public static void h2516_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251601_0(p0);
}
public static void h2516_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251602_0(p0);
}
public static void h2516_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251603_0(p0);
}
public static void h2516_4(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251604_0(p0);
}
public static void h2516_5(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251605_0(p0);
}
public static void h2516_6(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251606_0(p0);
}
public static void h2516_7(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251607_0(p0);
}
public static void h2516_8(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251608_0(p0);
}
public static void h2516_9(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251609_0(p0);
}
public static void h2516_10(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251610_0(p0);
}
public static void h2516_11(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251611_0(p0);
}
public static void h2516_12(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251612_0(p0);
}
public static void h2516_13(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251613_0(p0);
}
public static void h2516_14(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251614_0(p0);
}
public static void h2516_15(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251615_0(p0);
}
public static void h2516_16(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251616_0(p0);
}
public static void h2516_17(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251617_0(p0);
}
public static void h2516_18(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251618_0(p0);
}
public static void h2516_19(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251619_0(p0);
}
public static void h2516_20(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251620_0(p0);
}
public static void h2516_21(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251621_0(p0);
}
public static void h2516_22(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251622_0(p0);
}
public static void h2516_23(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251623_0(p0);
}
public static void h2516_24(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251624_0(p0);
}
public static void h2516_25(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251625_0(p0);
}
public static void h2516_26(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251626_0(p0);
}
public static void h2516_27(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251627_0(p0);
}
public static void h2516_28(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251628_0(p0);
}
public static void h2516_29(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251629_0(p0);
}
public static void h2516_30(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251630_0(p0);
}
public static void h2516_31(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251631_0(p0);
}
public static void h2516_32(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251632_0(p0);
}
public static void h2516_33(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251633_0(p0);
}
public static void h2516_34(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251634_0(p0);
}
public static void h2516_35(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251635_0(p0);
}
public static void h2516_36(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251636_0(p0);
}
public static void h2516_37(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251637_0(p0);
}
public static void h2516_38(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251638_0(p0);
}
public static void h2516_39(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251639_0(p0);
}
public static void h2516_40(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251640_0(p0);
}
public static void h2516_41(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251641_0(p0);
}
public static void h2516_42(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251642_0(p0);
}
public static void h2516_43(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251643_0(p0);
}
public static void h2516_44(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251644_0(p0);
}
public static void h2516_45(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251645_0(p0);
}
public static void h2516_46(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1251646_0(p0);
}
private static native net.minecraft.client.Minecraft __fieldRead2516_0(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2516_1(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call2516_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2516_3(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.particle.EffectRenderer __fieldRead2516_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2516_5(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2516_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead2516_7(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead2516_8(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.util.Random __fieldRead2516_9(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native int __call2516_10(java.util.Random a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2516_11(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call2516_12(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead2516_13(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2516_14(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call2516_15(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead2516_16(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2516_17(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call2516_18(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead2516_19(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead2516_20() throws Throwable;
private static native int __call2516_21(net.minecraft.util.EnumParticleTypes a0) throws Throwable;
private static native boolean __call2516_22() throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead2516_23() throws Throwable;
private static native int __call2516_24(net.minecraft.util.EnumParticleTypes a0) throws Throwable;
private static native boolean __call2516_25() throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead2516_26() throws Throwable;
private static native int __call2516_27(net.minecraft.util.EnumParticleTypes a0) throws Throwable;
private static native boolean __call2516_28() throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead2516_29() throws Throwable;
private static native int __call2516_30(net.minecraft.util.EnumParticleTypes a0) throws Throwable;
private static native boolean __call2516_31() throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead2516_32() throws Throwable;
private static native int __call2516_33(net.minecraft.util.EnumParticleTypes a0) throws Throwable;
private static native boolean __call2516_34() throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead2516_35() throws Throwable;
private static native int __call2516_36(net.minecraft.util.EnumParticleTypes a0) throws Throwable;
private static native boolean __call2516_37() throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead2516_38() throws Throwable;
private static native int __call2516_39(net.minecraft.util.EnumParticleTypes a0) throws Throwable;
private static native boolean __call2516_40() throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead2516_41() throws Throwable;
private static native int __call2516_42(net.minecraft.util.EnumParticleTypes a0) throws Throwable;
private static native boolean __call2516_43() throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead2516_44() throws Throwable;
private static native int __call2516_45(net.minecraft.util.EnumParticleTypes a0) throws Throwable;
private static native boolean __call2516_46() throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead2516_47() throws Throwable;
private static native int __call2516_48(net.minecraft.util.EnumParticleTypes a0) throws Throwable;
private static native boolean __call2516_49() throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead2516_50() throws Throwable;
private static native int __call2516_51(net.minecraft.util.EnumParticleTypes a0) throws Throwable;
private static native boolean __call2516_52() throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead2516_53() throws Throwable;
private static native int __call2516_54(net.minecraft.util.EnumParticleTypes a0) throws Throwable;
private static native boolean __call2516_55() throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead2516_56() throws Throwable;
private static native int __call2516_57(net.minecraft.util.EnumParticleTypes a0) throws Throwable;
private static native boolean __call2516_58() throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead2516_59() throws Throwable;
private static native int __call2516_60(net.minecraft.util.EnumParticleTypes a0) throws Throwable;
private static native boolean __call2516_61() throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead2516_62() throws Throwable;
private static native int __call2516_63(net.minecraft.util.EnumParticleTypes a0) throws Throwable;
private static native boolean __call2516_64() throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead2516_65() throws Throwable;
private static native int __call2516_66(net.minecraft.util.EnumParticleTypes a0) throws Throwable;
private static native boolean __call2516_67() throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead2516_68() throws Throwable;
private static native int __call2516_69(net.minecraft.util.EnumParticleTypes a0) throws Throwable;
private static native boolean __call2516_70() throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead2516_71() throws Throwable;
private static native int __call2516_72(net.minecraft.util.EnumParticleTypes a0) throws Throwable;
private static native boolean __call2516_73() throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead2516_74() throws Throwable;
private static native int __call2516_75(net.minecraft.util.EnumParticleTypes a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2516_76(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.particle.EffectRenderer __fieldRead2516_77(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.particle.EntityFX __call2516_78(net.minecraft.client.particle.EffectRenderer a0, int a1, double a2, double a3, double a4, double a5, double a6, double a7, int[] a8) throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead2516_79() throws Throwable;
private static native int __call2516_80(net.minecraft.util.EnumParticleTypes a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead2516_81(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.Mi __fieldRead2516_82(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call2516_83(net.minecraft.client.particle.EntityFX a0, net.minecraft.client.multiplayer.WorldClient a1, double a2, double a3, double a4, moom.Mi a5) throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead2516_84() throws Throwable;
private static native int __call2516_85(net.minecraft.util.EnumParticleTypes a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead2516_86(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.Mi __fieldRead2516_87(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call2516_88(net.minecraft.client.particle.EntityFX a0, net.minecraft.client.multiplayer.WorldClient a1, double a2, double a3, double a4, moom.Mi a5) throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead2516_89() throws Throwable;
private static native int __call2516_90(net.minecraft.util.EnumParticleTypes a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead2516_91(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.Mi __fieldRead2516_92(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call2516_93(net.minecraft.client.particle.EntityFX a0, net.minecraft.client.multiplayer.WorldClient a1, double a2, double a3, double a4, moom.Mi a5) throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead2516_94() throws Throwable;
private static native int __call2516_95(net.minecraft.util.EnumParticleTypes a0) throws Throwable;
private static native void __call2516_96(net.minecraft.client.particle.EntityFX a0) throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead2516_97() throws Throwable;
private static native int __call2516_98(net.minecraft.util.EnumParticleTypes a0) throws Throwable;
private static native void __call2516_99(net.minecraft.client.particle.EntityFX a0) throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead2516_100() throws Throwable;
private static native int __call2516_101(net.minecraft.util.EnumParticleTypes a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead2516_102(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call2516_103(net.minecraft.client.particle.EntityFX a0, net.minecraft.client.multiplayer.WorldClient a1, double a2, double a3, double a4) throws Throwable;
private static native java.lang.Throwable __call1251600_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251601_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251602_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251603_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251604_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251605_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251606_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251607_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251608_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251609_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251610_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251611_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251612_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251613_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251614_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251615_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251616_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251617_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251618_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251619_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251620_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251621_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251622_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251623_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251624_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251625_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251626_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251627_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251628_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251629_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251630_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251631_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251632_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251633_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251634_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251635_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251636_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251637_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251638_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251639_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251640_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251641_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251642_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251643_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251644_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251645_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1251646_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_a40cdf19468e6c48f0b2(net.minecraft.client.renderer.RenderGlobal a0, long a1) throws E;
private static final class __SourceHandler_a40cdf19468e6c48f0b2 {

public static void f720008(net.minecraft.client.renderer.RenderGlobal receiver, long p0) throws Throwable {
    long life1_5;
    java.util.Iterator life3_22;
    moom.mp life4_29;
    java.util.Iterator life3_60;
    moom.mp life4_67;
    double life3_77;
    int life5_79;
    java.util.Iterator life6_87;
    moom.mp life7_94;
    int life8_97;
    int life9_104;
    double life10_125;
    forest_join_135: {
    forest_join_74: {
    forest_join_52: {
    life1_5 = ((long) (((double) p0) + 0x1.7d784p26d));
    net.minecraft.client.renderer.RenderGlobal __stackOp720008_0_0 = receiver;
    __fieldWrite720008_6(__stackOp720008_0_0, (__integerCategory720008_4(__fieldRead720008_1(__stackOp720008_0_0)) | __integerCategory720008_5(__call720008_3(__fieldRead720008_2(receiver), life1_5))));
    if (!((__call720008_8(__fieldRead720008_7(receiver)) > 0))) {
        break forest_join_52;
    }
    life3_22 = __call720008_10(__fieldRead720008_9(receiver));
    forest_cycle_23: while (true) {
    forest_join_36: {
    if (!(__call720008_11(life3_22))) {
        break forest_join_52;
    }
    life4_29 = __cast720008_13(__call720008_12(life3_22));
    if (!((!__call720008_15(__fieldRead720008_14(receiver), life4_29)))) {
        break forest_join_36;
    }
    break forest_join_52;
    }
    __call720008_16(life4_29, 0);
    __call720008_17(life3_22);
    __call720008_19(__fieldRead720008_18(receiver), life4_29);
    __call720008_21(__fieldRead720008_20(receiver), life4_29);
    continue forest_cycle_23;
    }
    }
    if (!((__call720008_23(__fieldRead720008_22(receiver)) > 0))) {
        break forest_join_74;
    }
    life3_60 = __call720008_25(__fieldRead720008_24(receiver));
    if (!(__call720008_26(life3_60))) {
        break forest_join_74;
    }
    life4_67 = __cast720008_28(__call720008_27(life3_60));
    if (!(__call720008_30(__fieldRead720008_29(receiver), life4_67))) {
        break forest_join_74;
    }
    __call720008_31(life3_60);
    }
    life3_77 = 0x0.0p0d;
    life5_79 = __call720008_32();
    if (!((!__call720008_34(__fieldRead720008_33(receiver))))) {
        break forest_join_135;
    }
    life6_87 = __call720008_36(__fieldRead720008_35(receiver));
    forest_cycle_86: while (true) {
    forest_join_134: {
    forest_join_112: {
    forest_join_109: {
    forest_join_104: {
    if (!(__call720008_37(life6_87))) {
        break forest_join_135;
    }
    life7_94 = __cast720008_39(__call720008_38(life6_87));
    life8_97 = __integerCategory720008_41(__call720008_40(life7_94));
    if (!((life8_97 != 0))) {
        break forest_join_104;
    }
    life9_104 = __integerCategory720008_44(__call720008_43(__fieldRead720008_42(receiver), life7_94));
    break forest_join_109;
    }
    life9_104 = __integerCategory720008_47(__call720008_46(__fieldRead720008_45(receiver), life7_94));
    }
    if (!((life9_104 == 0))) {
        break forest_join_112;
    }
    break forest_join_135;
    }
    __call720008_48(life7_94, 0);
    __call720008_49(life6_87);
    if (!((life8_97 == 0))) {
        break forest_join_134;
    }
    life10_125 = (0x1.0p1d * __call720008_50(life7_94));
    life3_77 = (life3_77 + life10_125);
    if (!((__numericCompare720008_51(life3_77, ((double) life5_79)) > 0))) {
        break forest_join_134;
    }
    break forest_join_135;
    }
    continue forest_cycle_86;
    }
    }
    return;
}
public static void h720008_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call75000800_0(p0);
}
public static void h720008_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call75000801_0(p0);
}
public static void h720008_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call75000802_0(p0);
}
public static void h720008_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call75000803_0(p0);
}
private static native boolean __fieldRead720008_1(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.mi __fieldRead720008_2(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call720008_3(moom.mi a0, long a1) throws Throwable;
private static native int __integerCategory720008_4(boolean value) throws Throwable;
private static native int __integerCategory720008_5(boolean value) throws Throwable;
private static native void __fieldWrite720008_6(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native java.util.Set __fieldRead720008_7(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __call720008_8(java.util.Set a0) throws Throwable;
private static native java.util.Set __fieldRead720008_9(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.util.Iterator __call720008_10(java.util.Set a0) throws Throwable;
private static native boolean __call720008_11(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call720008_12(java.util.Iterator a0) throws Throwable;
private static native moom.mp __cast720008_13(java.lang.Object a0) throws Throwable;
private static native moom.mi __fieldRead720008_14(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call720008_15(moom.mi a0, moom.mp a1) throws Throwable;
private static native void __call720008_16(moom.mp a0, int a1) throws Throwable;
private static native void __call720008_17(java.util.Iterator a0) throws Throwable;
private static native java.util.Set __fieldRead720008_18(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call720008_19(java.util.Set a0, moom.mp a1) throws Throwable;
private static native java.util.Set __fieldRead720008_20(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call720008_21(java.util.Set a0, moom.mp a1) throws Throwable;
private static native java.util.Set __fieldRead720008_22(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __call720008_23(java.util.Set a0) throws Throwable;
private static native java.util.Set __fieldRead720008_24(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.util.Iterator __call720008_25(java.util.Set a0) throws Throwable;
private static native boolean __call720008_26(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call720008_27(java.util.Iterator a0) throws Throwable;
private static native moom.mp __cast720008_28(java.lang.Object a0) throws Throwable;
private static native moom.mi __fieldRead720008_29(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call720008_30(moom.mi a0, moom.mp a1) throws Throwable;
private static native void __call720008_31(java.util.Iterator a0) throws Throwable;
private static native int __call720008_32() throws Throwable;
private static native java.util.Set __fieldRead720008_33(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call720008_34(java.util.Set a0) throws Throwable;
private static native java.util.Set __fieldRead720008_35(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.util.Iterator __call720008_36(java.util.Set a0) throws Throwable;
private static native boolean __call720008_37(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call720008_38(java.util.Iterator a0) throws Throwable;
private static native moom.mp __cast720008_39(java.lang.Object a0) throws Throwable;
private static native boolean __call720008_40(moom.mp a0) throws Throwable;
private static native int __integerCategory720008_41(boolean value) throws Throwable;
private static native moom.mi __fieldRead720008_42(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call720008_43(moom.mi a0, moom.mp a1) throws Throwable;
private static native int __integerCategory720008_44(boolean value) throws Throwable;
private static native moom.mi __fieldRead720008_45(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call720008_46(moom.mi a0, moom.mp a1) throws Throwable;
private static native int __integerCategory720008_47(boolean value) throws Throwable;
private static native void __call720008_48(moom.mp a0, int a1) throws Throwable;
private static native void __call720008_49(java.util.Iterator a0) throws Throwable;
private static native double __call720008_50(moom.mp a0) throws Throwable;
private static native int __numericCompare720008_51(double a0, double a1) throws Throwable;
private static native java.lang.Throwable __call75000800_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call75000801_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call75000802_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call75000803_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_640975aa4e9b46d48593(net.minecraft.client.renderer.RenderGlobal a0, java.util.Collection a1, java.util.Collection a2) throws E;
private static final class __SourceHandler_640975aa4e9b46d48593 {

public static void f596(net.minecraft.client.renderer.RenderGlobal receiver, java.util.Collection p0, java.util.Collection p1) throws Throwable {
    java.util.Set life3_3;
    __monitorEnter596_1((life3_3 = __fieldRead596_0(receiver)));
    __call596_3(__fieldRead596_2(receiver), p0);
    __call596_5(__fieldRead596_4(receiver), p1);
    __monitorExit596_6(life3_3);
    return;
}
public static void h596_0(java.lang.Throwable p0, java.util.Set p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3059600_0(p1);
    throw life2_2;
}
private static native java.util.Set __fieldRead596_0(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __monitorEnter596_1(java.util.Set a0) throws Throwable;
private static native java.util.Set __fieldRead596_2(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call596_3(java.util.Set a0, java.util.Collection a1) throws Throwable;
private static native java.util.Set __fieldRead596_4(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call596_5(java.util.Set a0, java.util.Collection a1) throws Throwable;
private static native void __monitorExit596_6(java.util.Set a0) throws Throwable;
private static native void __monitorExit3059600_0(java.util.Set a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_ab53872f9a89baf3b706(net.minecraft.client.renderer.RenderGlobal a0, java.util.Iterator a1) throws E;
private static final class __SourceHandler_ab53872f9a89baf3b706 {

public static void f597(net.minecraft.client.renderer.RenderGlobal receiver, java.util.Iterator p0) throws Throwable {
    long life2_3;
    moom.kU life4_10;
    int life5_13;
    forest_join_27: {
    life2_3 = (__fieldRead597_0() ^ 137124231522826L);
    forest_cycle_4: while (true) {
    forest_join_26: {
    if (!(__call597_1(p0))) {
        break forest_join_27;
    }
    life4_10 = __cast597_3(__call597_2(p0));
    life5_13 = __call597_4(life4_10);
    if (!(((__fieldRead597_5(receiver) - life5_13) > __invokedynamic597_6(605, (8890964382220908825L ^ life2_3))))) {
        break forest_join_26;
    }
    __call597_7(p0);
    }
    continue forest_cycle_4;
    }
    }
    return;
}
public static void h597_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3059700_0(p0);
}
private static native long __fieldRead597_0() throws Throwable;
private static native boolean __call597_1(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call597_2(java.util.Iterator a0) throws Throwable;
private static native moom.kU __cast597_3(java.lang.Object a0) throws Throwable;
private static native int __call597_4(moom.kU a0) throws Throwable;
private static native int __fieldRead597_5(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __invokedynamic597_6(int a0, long a1) throws Throwable;
private static native void __call597_7(java.util.Iterator a0) throws Throwable;
private static native java.lang.Throwable __call3059700_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> java.util.Set __sourceHandlerCall_9315fb54a638f4f81f0a(net.minecraft.client.renderer.RenderGlobal a0, moom.DT a1) throws E;
private static final class __SourceHandler_9315fb54a638f4f81f0a {

public static java.util.Set f598(net.minecraft.client.renderer.RenderGlobal receiver, moom.DT p0) throws Throwable {
    long life2_3;
    moom.mt life4_7;
    moom.DT life5_29;
    net.minecraft.world.chunk.Chunk life6_34;
    java.util.Iterator life7_55;
    moom.DU life8_62;
    forest_join_72: {
    life2_3 = (__fieldRead598_0() ^ 89302793550605L);
    life4_7 = new moom.mt();
    life5_29 = new moom.DT(((__call598_1(p0) >> 4) << 4), ((__call598_2(p0) >> 4) << 4), ((__call598_3(p0) >> 4) << 4));
    life6_34 = __call598_5(__fieldRead598_4(receiver), life5_29);
    life7_55 = __call598_11(__call598_10(life5_29, __call598_9(life5_29, __invokedynamic598_6(402, (1618731256492436416L ^ life2_3)), __invokedynamic598_7(4737, (7645923710706235628L ^ life2_3)), __invokedynamic598_8(4737, (7645923710706235628L ^ life2_3)))));
    forest_cycle_56: while (true) {
    forest_join_71: {
    if (!(__call598_12(life7_55))) {
        break forest_join_72;
    }
    life8_62 = __cast598_14(__call598_13(life7_55));
    if (!(__call598_16(__call598_15(life6_34, life8_62)))) {
        break forest_join_71;
    }
    __call598_17(life4_7, life8_62);
    }
    continue forest_cycle_56;
    }
    }
    return __call598_18(life4_7, p0);
}
public static java.util.Set h598_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3059800_0(p0);
}
private static native long __fieldRead598_0() throws Throwable;
private static native int __call598_1(moom.DT a0) throws Throwable;
private static native int __call598_2(moom.DT a0) throws Throwable;
private static native int __call598_3(moom.DT a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead598_4(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call598_5(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1) throws Throwable;
private static native int __invokedynamic598_6(int a0, long a1) throws Throwable;
private static native int __invokedynamic598_7(int a0, long a1) throws Throwable;
private static native int __invokedynamic598_8(int a0, long a1) throws Throwable;
private static native moom.DT __call598_9(moom.DT a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Iterable __call598_10(moom.DT a0, moom.DT a1) throws Throwable;
private static native java.util.Iterator __call598_11(java.lang.Iterable a0) throws Throwable;
private static native boolean __call598_12(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call598_13(java.util.Iterator a0) throws Throwable;
private static native moom.DU __cast598_14(java.lang.Object a0) throws Throwable;
private static native net.minecraft.block.Block __call598_15(net.minecraft.world.chunk.Chunk a0, moom.DU a1) throws Throwable;
private static native boolean __call598_16(net.minecraft.block.Block a0) throws Throwable;
private static native void __call598_17(moom.mt a0, moom.DU a1) throws Throwable;
private static native java.util.Set __call598_18(moom.mt a0, moom.DT a1) throws Throwable;
private static native java.lang.Throwable __call3059800_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_77e5fab436016cbe18e4(net.minecraft.client.renderer.RenderGlobal a0, moom.DT a1, moom.mp a2) throws E;
private static final class __SourceHandler_77e5fab436016cbe18e4 {

public static boolean f1401(net.minecraft.client.renderer.RenderGlobal receiver, moom.DT p0, moom.mp p1) throws Throwable {
    int forwardValue1401_46_0;
    long life3_3;
    moom.DT life5_6;
    forward_join_46: {
    forward_join_45: {
    life3_3 = (__fieldRead1401_0() ^ 51394440715004L);
    life5_6 = __call1401_1(p1);
    if (!((__call1401_4((__call1401_2(p0) - __call1401_3(life5_6))) <= __invokedynamic1401_5(2671, (6021934028444598769L ^ life3_3))))) {
        break forward_join_45;
    }
    if (!((__call1401_8((__call1401_6(p0) - __call1401_7(life5_6))) <= __invokedynamic1401_9(2671, (6021934028444598769L ^ life3_3))))) {
        break forward_join_45;
    }
    if (!((__call1401_12((__call1401_10(p0) - __call1401_11(life5_6))) <= __invokedynamic1401_13(2671, (6021934028444598769L ^ life3_3))))) {
        break forward_join_45;
    }
    forwardValue1401_46_0 = 1;
    break forward_join_46;
    }
    forwardValue1401_46_0 = 0;
    }
    return __integerCategory1401_14(forwardValue1401_46_0);
}
public static void h1401_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1140100_0(p0);
}
public static void h1401_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1140101_0(p0);
}
public static void h1401_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1140102_0(p0);
}
private static native long __fieldRead1401_0() throws Throwable;
private static native moom.DT __call1401_1(moom.mp a0) throws Throwable;
private static native int __call1401_2(moom.DT a0) throws Throwable;
private static native int __call1401_3(moom.DT a0) throws Throwable;
private static native int __call1401_4(int a0) throws Throwable;
private static native int __invokedynamic1401_5(int a0, long a1) throws Throwable;
private static native int __call1401_6(moom.DT a0) throws Throwable;
private static native int __call1401_7(moom.DT a0) throws Throwable;
private static native int __call1401_8(int a0) throws Throwable;
private static native int __invokedynamic1401_9(int a0, long a1) throws Throwable;
private static native int __call1401_10(moom.DT a0) throws Throwable;
private static native int __call1401_11(moom.DT a0) throws Throwable;
private static native int __call1401_12(int a0) throws Throwable;
private static native int __invokedynamic1401_13(int a0, long a1) throws Throwable;
private static native boolean __integerCategory1401_14(int value) throws Throwable;
private static native java.lang.Throwable __call1140100_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1140101_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1140102_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> moom.mp __sourceHandlerCall_3ebe8961c654bcd25917(net.minecraft.client.renderer.RenderGlobal a0, moom.DT a1, moom.mp a2, moom.bs a3, boolean a4, int a5) throws E;
private static final class __SourceHandler_3ebe8961c654bcd25917 {

public static moom.mp f2522(net.minecraft.client.renderer.RenderGlobal receiver, moom.DT p0, moom.mp p1, moom.bs p2, boolean p3, int p4) throws Throwable {
    moom.mp life6_3;
    moom.DT life7_23;
    int life8_29;
    int life9_35;
    int life10_43;
    life6_3 = __call2522_0(p1, p2);
    if ((life6_3 == null)) {
        return null;
    }
    if ((__call2522_2(__call2522_1(life6_3)) > p4)) {
        return null;
    }
    if (p3) {
        life7_23 = __call2522_3(life6_3);
        life8_29 = (__call2522_4(p0) - __call2522_5(life7_23));
        life9_35 = (__call2522_6(p0) - __call2522_7(life7_23));
        life10_43 = ((life8_29 * life8_29) + (life9_35 * life9_35));
        if ((life10_43 > __fieldRead2522_8(receiver))) {
        return null;
    }
    }
    return life6_3;
}
public static void h2522_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1252200_0(p0);
}
public static void h2522_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1252201_0(p0);
}
public static void h2522_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1252202_0(p0);
}
private static native moom.mp __call2522_0(moom.mp a0, moom.bs a1) throws Throwable;
private static native moom.DT __call2522_1(moom.mp a0) throws Throwable;
private static native int __call2522_2(moom.DT a0) throws Throwable;
private static native moom.DT __call2522_3(moom.mp a0) throws Throwable;
private static native int __call2522_4(moom.DT a0) throws Throwable;
private static native int __call2522_5(moom.DT a0) throws Throwable;
private static native int __call2522_6(moom.DT a0) throws Throwable;
private static native int __call2522_7(moom.DT a0) throws Throwable;
private static native int __fieldRead2522_8(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.lang.Throwable __call1252200_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1252201_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1252202_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_a5b3019a5386f12a0d78(net.minecraft.client.renderer.RenderGlobal a0, moom.lw a1) throws E;
private static final class __SourceHandler_a5b3019a5386f12a0d78 {

public static void f2523(net.minecraft.client.renderer.RenderGlobal receiver, moom.lw p0) throws Throwable {
    long life2_3;
    java.util.Random life4_12;
    int life5_22;
    double life6_37;
    double life8_45;
    double life10_53;
    double life12_61;
    double life14_73;
    double life14_89;
    double life6_93;
    double life8_97;
    double life10_101;
    double life16_105;
    double life18_109;
    double life20_113;
    double life22_117;
    double life24_120;
    double life26_123;
    double life28_134;
    double life30_137;
    double life32_140;
    double life34_147;
    double life36_150;
    double life38_153;
    int life40_155;
    double life41_160;
    double life43_169;
    double life45_180;
    double life47_182;
    double life49_190;
    double life51_198;
    double life53_206;
    double life55_214;
    double life57_222;
    double life59_230;
    life2_3 = (__fieldRead2523_0() ^ 41885018532680L);
    life4_12 = new java.util.Random(__invokedynamic2523_1(4997, (1820662782568541019L ^ life2_3)));
    __call2523_4(p0, __invokedynamic2523_2(140, (5506112605439294200L ^ life2_3)), __fieldRead2523_3());
    life5_22 = 0;
    loop_region_23: while ((life5_22 < __invokedynamic2523_5(6161, (916713691510006333L ^ life2_3)))) {
        life6_37 = ((double) ((__call2523_6(life4_12) * 0x1.0p1f) - 0x1.0p0f));
        life8_45 = ((double) ((__call2523_7(life4_12) * 0x1.0p1f) - 0x1.0p0f));
        life10_53 = ((double) ((__call2523_8(life4_12) * 0x1.0p1f) - 0x1.0p0f));
        life12_61 = ((double) (0x1.333334p-3f + (__call2523_9(life4_12) * 0x1.99999ap-4f)));
        life14_73 = (((life6_37 * life6_37) + (life8_45 * life8_45)) + (life10_53 * life10_53));
        if ((life14_73 < 0x1.0p0d)) {
        if ((life14_73 > 0x1.47ae147ae147bp-7d)) {
        life14_89 = (0x1.0p0d / __call2523_10(life14_73));
        life6_93 = (life6_37 * life14_89);
        life8_97 = (life8_45 * life14_89);
        life10_101 = (life10_53 * life14_89);
        life16_105 = (life6_93 * 0x1.9p6d);
        life18_109 = (life8_97 * 0x1.9p6d);
        life20_113 = (life10_101 * 0x1.9p6d);
        life22_117 = __call2523_11(life6_93, life10_101);
        life24_120 = __call2523_12(life22_117);
        life26_123 = __call2523_13(life22_117);
        life28_134 = __call2523_15(__call2523_14(((life6_93 * life6_93) + (life10_101 * life10_101))), life8_97);
        life30_137 = __call2523_16(life28_134);
        life32_140 = __call2523_17(life28_134);
        life34_147 = ((__call2523_18(life4_12) * 0x1.921fb54442d18p1d) * 0x1.0p1d);
        life36_150 = __call2523_19(life34_147);
        life38_153 = __call2523_20(life34_147);
        life40_155 = 0;
        loop_region_153: while ((life40_155 < 4)) {
        life41_160 = 0x0.0p0d;
        life43_169 = (((double) ((life40_155 & 2) - 1)) * life12_61);
        life45_180 = (((double) (((life40_155 + 1) & 2) - 1)) * life12_61);
        life47_182 = 0x0.0p0d;
        life49_190 = ((life43_169 * life38_153) - (life45_180 * life36_150));
        life51_198 = ((life45_180 * life38_153) + (life43_169 * life36_150));
        life53_206 = ((life49_190 * life30_137) + (0x0.0p0d * life32_140));
        life55_214 = ((0x0.0p0d * life30_137) - (life49_190 * life32_140));
        life57_222 = ((life55_214 * life24_120) - (life51_198 * life26_123));
        life59_230 = ((life51_198 * life24_120) + (life55_214 * life26_123));
        __call2523_22(__call2523_21(p0, (life16_105 + life57_222), (life18_109 + life53_206), (life20_113 + life59_230)));
        life40_155 += 1;
    }
    }
    }
        life5_22 += 1;
    }
    return;
}
public static void h2523_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1252300_0(p0);
}
private static native long __fieldRead2523_0() throws Throwable;
private static native long __invokedynamic2523_1(int a0, long a1) throws Throwable;
private static native int __invokedynamic2523_2(int a0, long a1) throws Throwable;
private static native moom.oD __fieldRead2523_3() throws Throwable;
private static native void __call2523_4(moom.lw a0, int a1, moom.oD a2) throws Throwable;
private static native int __invokedynamic2523_5(int a0, long a1) throws Throwable;
private static native float __call2523_6(java.util.Random a0) throws Throwable;
private static native float __call2523_7(java.util.Random a0) throws Throwable;
private static native float __call2523_8(java.util.Random a0) throws Throwable;
private static native float __call2523_9(java.util.Random a0) throws Throwable;
private static native double __call2523_10(double a0) throws Throwable;
private static native double __call2523_11(double a0, double a1) throws Throwable;
private static native double __call2523_12(double a0) throws Throwable;
private static native double __call2523_13(double a0) throws Throwable;
private static native double __call2523_14(double a0) throws Throwable;
private static native double __call2523_15(double a0, double a1) throws Throwable;
private static native double __call2523_16(double a0) throws Throwable;
private static native double __call2523_17(double a0) throws Throwable;
private static native double __call2523_18(java.util.Random a0) throws Throwable;
private static native double __call2523_19(double a0) throws Throwable;
private static native double __call2523_20(double a0) throws Throwable;
private static native moom.lw __call2523_21(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native void __call2523_22(moom.lw a0) throws Throwable;
private static native java.lang.Throwable __call1252300_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_1f98b188a02e43da6832(net.minecraft.client.renderer.RenderGlobal a0, net.minecraft.client.multiplayer.WorldClient a1) throws E;
private static final class __SourceHandler_1f98b188a02e43da6832 {

public static void f2524(net.minecraft.client.renderer.RenderGlobal receiver, net.minecraft.client.multiplayer.WorldClient p0) throws Throwable {
    long life2_3;
    life2_3 = (__fieldRead2524_0() ^ 132002414080098L);
    if ((__fieldRead2524_1(receiver) != null)) {
        __call2524_3(__fieldRead2524_2(receiver), receiver);
    }
    __fieldWrite2524_4(receiver, 0x0.0000000000001p-1022d);
    __fieldWrite2524_5(receiver, 0x0.0000000000001p-1022d);
    __fieldWrite2524_6(receiver, 0x0.0000000000001p-1022d);
    __fieldWrite2524_8(receiver, __invokedynamic2524_7(14647, (5641812636566640653L ^ life2_3)));
    __fieldWrite2524_10(receiver, __invokedynamic2524_9(23684, (1393925304310939047L ^ life2_3)));
    __fieldWrite2524_12(receiver, __invokedynamic2524_11(23684, (1393925304310939047L ^ life2_3)));
    __call2524_14(__fieldRead2524_13(receiver), p0);
    __fieldWrite2524_15(receiver, p0);
    if (__call2524_16()) {
        __call2524_17();
    }
    __call2524_18();
    __fieldWrite2524_19(receiver, null);
    __fieldWrite2524_20(receiver, null);
    __call2524_22(__fieldRead2524_21(receiver), null, null);
    __call2524_24(__fieldRead2524_23(receiver));
    if ((p0 != null)) {
        __call2524_25(p0, receiver);
        __call2524_26(receiver);
    } else {
        __call2524_28(__fieldRead2524_27(receiver));
        __call2524_29(receiver);
        if ((__fieldRead2524_30(receiver) != null)) {
        __call2524_32(__fieldRead2524_31(receiver));
    }
        __fieldWrite2524_33(receiver, null);
    }
    return;
}
public static void h2524_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1252400_0(p0);
}
public static void h2524_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1252401_0(p0);
}
public static void h2524_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1252402_0(p0);
}
public static void h2524_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1252403_0(p0);
}
private static native long __fieldRead2524_0() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead2524_1(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead2524_2(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call2524_3(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.client.renderer.RenderGlobal a1) throws Throwable;
private static native void __fieldWrite2524_4(net.minecraft.client.renderer.RenderGlobal a0, double a1) throws Throwable;
private static native void __fieldWrite2524_5(net.minecraft.client.renderer.RenderGlobal a0, double a1) throws Throwable;
private static native void __fieldWrite2524_6(net.minecraft.client.renderer.RenderGlobal a0, double a1) throws Throwable;
private static native int __invokedynamic2524_7(int a0, long a1) throws Throwable;
private static native void __fieldWrite2524_8(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native int __invokedynamic2524_9(int a0, long a1) throws Throwable;
private static native void __fieldWrite2524_10(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native int __invokedynamic2524_11(int a0, long a1) throws Throwable;
private static native void __fieldWrite2524_12(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __fieldRead2524_13(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call2524_14(net.minecraft.client.renderer.entity.RenderManager a0, net.minecraft.client.multiplayer.WorldClient a1) throws Throwable;
private static native void __fieldWrite2524_15(net.minecraft.client.renderer.RenderGlobal a0, net.minecraft.client.multiplayer.WorldClient a1) throws Throwable;
private static native boolean __call2524_16() throws Throwable;
private static native void __call2524_17() throws Throwable;
private static native void __call2524_18() throws Throwable;
private static native void __fieldWrite2524_19(net.minecraft.client.renderer.RenderGlobal a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite2524_20(net.minecraft.client.renderer.RenderGlobal a0, java.lang.Object a1) throws Throwable;
private static native moom.Mi __fieldRead2524_21(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call2524_22(moom.Mi a0, java.lang.Object a1, java.lang.Object a2) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead2524_23(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call2524_24(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native void __call2524_25(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.client.renderer.RenderGlobal a1) throws Throwable;
private static native void __call2524_26(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.util.Set __fieldRead2524_27(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call2524_28(java.util.Set a0) throws Throwable;
private static native void __call2524_29(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.lv __fieldRead2524_30(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.lv __fieldRead2524_31(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call2524_32(moom.lv a0) throws Throwable;
private static native void __fieldWrite2524_33(net.minecraft.client.renderer.RenderGlobal a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Throwable __call1252400_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1252401_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1252402_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1252403_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e0606b863dde6e96f9c1(net.minecraft.client.renderer.RenderGlobal a0, net.minecraft.client.renderer.Tessellator a1, moom.lw a2, net.minecraft.entity.Entity a3, float a4) throws E;
private static final class __SourceHandler_e0606b863dde6e96f9c1 {

public static void f599(net.minecraft.client.renderer.RenderGlobal receiver, net.minecraft.client.renderer.Tessellator p0, moom.lw p1, net.minecraft.entity.Entity p2, float p3) throws Throwable {
    int forestValue599_122_0;
    long life5_3;
    double life7_15;
    double life9_27;
    double life11_39;
    java.util.Iterator life13_72;
    moom.kU life14_79;
    moom.DT life15_82;
    double life16_88;
    double life18_94;
    double life20_100;
    net.minecraft.block.Block life22_106;
    int life23_125;
    net.minecraft.block.state.IBlockState life24_150;
    int life25_158;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life26_163;
    net.minecraft.client.renderer.BlockRendererDispatcher life27_167;
    forest_join_181: {
    forest_join_172: {
    life5_3 = (__fieldRead599_0() ^ 58604916534154L);
    life7_15 = (__fieldRead599_1(p2) + ((__fieldRead599_2(p2) - __fieldRead599_3(p2)) * ((double) p3)));
    life9_27 = (__fieldRead599_4(p2) + ((__fieldRead599_5(p2) - __fieldRead599_6(p2)) * ((double) p3)));
    life11_39 = (__fieldRead599_7(p2) + ((__fieldRead599_8(p2) - __fieldRead599_9(p2)) * ((double) p3)));
    if (!((!__call599_11(__fieldRead599_10(receiver))))) {
        break forest_join_181;
    }
    __call599_14(__fieldRead599_12(receiver), __fieldRead599_13());
    __call599_15(receiver);
    __call599_18(p1, __invokedynamic599_16(140, (5506133680703126074L ^ life5_3)), __fieldRead599_17());
    __call599_19(p1, (-life7_15), (-life9_27), (-life11_39));
    __call599_20(p1);
    life13_72 = __call599_23(__call599_22(__fieldRead599_21(receiver)));
    forest_cycle_73: while (true) {
    forest_join_171: {
    forest_join_142: {
    forest_join_122: {
    forest_join_121: {
    if (!(__call599_24(life13_72))) {
        break forest_join_172;
    }
    life14_79 = __cast599_26(__call599_25(life13_72));
    life15_82 = __call599_27(life14_79);
    life16_88 = (((double) __call599_28(life15_82)) - life7_15);
    life18_94 = (((double) __call599_29(life15_82)) - life9_27);
    life20_100 = (((double) __call599_30(life15_82)) - life11_39);
    life22_106 = __call599_33(__call599_32(__fieldRead599_31(receiver), life15_82));
    if (!((__instanceOf599_34(life22_106) == 0))) {
        break forest_join_121;
    }
    if (!((__instanceOf599_35(life22_106) == 0))) {
        break forest_join_121;
    }
    if (!((__instanceOf599_36(life22_106) == 0))) {
        break forest_join_121;
    }
    if (!((__instanceOf599_37(life22_106) == 0))) {
        break forest_join_121;
    }
    forestValue599_122_0 = 1;
    break forest_join_122;
    }
    forestValue599_122_0 = 0;
    }
    life23_125 = forestValue599_122_0;
    if (!((life23_125 != 0))) {
        break forest_join_171;
    }
    if (!((__numericCompare599_38((((life16_88 * life16_88) + (life18_94 * life18_94)) + (life20_100 * life20_100)), 0x1.0p10d) > 0))) {
        break forest_join_142;
    }
    __call599_39(life13_72);
    break forest_join_171;
    }
    life24_150 = __call599_41(__fieldRead599_40(receiver), life15_82);
    if (!((__call599_43(__call599_42(life24_150)) != __fieldRead599_44()))) {
        break forest_join_171;
    }
    life25_158 = __call599_45(life14_79);
    life26_163 = (__fieldRead599_46(receiver))[life25_158];
    life27_167 = __call599_48(__fieldRead599_47(receiver));
    __call599_50(life27_167, life24_150, life15_82, life26_163, __fieldRead599_49(receiver));
    }
    continue forest_cycle_73;
    }
    }
    __call599_51(p0);
    __call599_52(p1, 0x0.0p0d, 0x0.0p0d, 0x0.0p0d);
    __call599_53(receiver);
    }
    return;
}
public static void h599_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3059900_0(p0);
}
public static void h599_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3059901_0(p0);
}
public static void h599_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3059902_0(p0);
}
public static void h599_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3059903_0(p0);
}
public static void h599_4(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3059904_0(p0);
}
public static void h599_5(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3059905_0(p0);
}
private static native long __fieldRead599_0() throws Throwable;
private static native double __fieldRead599_1(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead599_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead599_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead599_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead599_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead599_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead599_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead599_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead599_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.util.Map __fieldRead599_10(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call599_11(java.util.Map a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __fieldRead599_12(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.DD __fieldRead599_13() throws Throwable;
private static native void __call599_14(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native void __call599_15(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __invokedynamic599_16(int a0, long a1) throws Throwable;
private static native moom.oD __fieldRead599_17() throws Throwable;
private static native void __call599_18(moom.lw a0, int a1, moom.oD a2) throws Throwable;
private static native void __call599_19(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native void __call599_20(moom.lw a0) throws Throwable;
private static native java.util.Map __fieldRead599_21(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.util.Collection __call599_22(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call599_23(java.util.Collection a0) throws Throwable;
private static native boolean __call599_24(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call599_25(java.util.Iterator a0) throws Throwable;
private static native moom.kU __cast599_26(java.lang.Object a0) throws Throwable;
private static native moom.DT __call599_27(moom.kU a0) throws Throwable;
private static native int __call599_28(moom.DT a0) throws Throwable;
private static native int __call599_29(moom.DT a0) throws Throwable;
private static native int __call599_30(moom.DT a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead599_31(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call599_32(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call599_33(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __instanceOf599_34(net.minecraft.block.Block a0) throws Throwable;
private static native int __instanceOf599_35(net.minecraft.block.Block a0) throws Throwable;
private static native int __instanceOf599_36(net.minecraft.block.Block a0) throws Throwable;
private static native int __instanceOf599_37(net.minecraft.block.Block a0) throws Throwable;
private static native int __numericCompare599_38(double a0, double a1) throws Throwable;
private static native void __call599_39(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead599_40(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call599_41(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call599_42(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.fn __call599_43(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead599_44() throws Throwable;
private static native int __call599_45(moom.kU a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead599_46(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead599_47(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.renderer.BlockRendererDispatcher __call599_48(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead599_49(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call599_50(net.minecraft.client.renderer.BlockRendererDispatcher a0, net.minecraft.block.state.IBlockState a1, moom.DT a2, net.minecraft.client.renderer.texture.TextureAtlasSprite a3, net.minecraft.client.multiplayer.WorldClient a4) throws Throwable;
private static native void __call599_51(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native void __call599_52(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native void __call599_53(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.lang.Throwable __call3059900_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3059901_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3059902_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3059903_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3059904_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3059905_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_29f8a8181980c26f2eda(net.minecraft.client.renderer.RenderGlobal a0, net.minecraft.entity.Entity a1, double a2, net.minecraft.client.renderer.culling.ICamera a3, int a4, boolean a5) throws E;
private static final class __SourceHandler_29f8a8181980c26f2eda {

public static void f100198(net.minecraft.client.renderer.RenderGlobal receiver, net.minecraft.entity.Entity p0, double p1, net.minecraft.client.renderer.culling.ICamera p2, int p3, boolean p4) throws Throwable {
    net.minecraft.client.renderer.RenderGlobal forestValue100198_266_0;
    net.minecraft.client.renderer.RenderGlobal forestValue100198_268_0;
    net.minecraft.client.renderer.RenderGlobal forestValue100198_269_0;
    int forestValue100198_269_1;
    int forestValue100198_298_0;
    int forestValue100198_580_0;
    moom.bs[] forestValue100198_716_0;
    int forestValue100198_884_0;
    net.minecraft.client.renderer.RenderGlobal spill100198_0;
    long life7_3;
    double life9_24;
    double life11_30;
    double life13_36;
    double life15_121;
    double life17_132;
    double life19_143;
    net.minecraft.client.renderer.culling.Frustum life21_163;
    moom.DT life21_192;
    moom.mp life22_197;
    int life23_310;
    int life24_320;
    int life25_337;
    moom.mp life26_372;
    java.util.Iterator life27_421;
    moom.mp life28_428;
    moom.ls life29_439;
    java.util.Deque life27_508;
    int life28_512;
    int life29_522;
    moom.ls life30_529;
    java.util.Set life31_531;
    org.lwjgl.util.vector.Vector3f life32_540;
    moom.bs life33_549;
    int life29_611;
    int life30_624;
    int life31_632;
    moom.mp life32_662;
    moom.ls life33_677;
    int life29_696;
    moom.ls life30_703;
    moom.mp life31_706;
    moom.bs life32_709;
    net.minecraft.client.renderer.chunk.CompiledChunk life33_712;
    moom.bs[] life34_753;
    int life35_756;
    int life36_758;
    moom.bs life37_765;
    moom.mp life38_785;
    int life39_806;
    moom.ls life40_809;
    java.util.Set life27_858;
    java.util.Iterator life28_867;
    moom.ls life29_874;
    moom.mp life30_877;
    moom.DT life31_891;
    int life32_927;
    forest_join_931: {
    forest_join_920: {
    forest_join_806: {
    forest_join_800: {
    forest_join_784: {
    forest_join_780: {
    forest_join_657: {
    forest_join_589: {
    forest_join_580: {
    forest_join_575: {
    forest_join_564: {
    forest_join_563: {
    forest_join_555: {
    forest_join_544: {
    forest_join_534: {
    forest_join_529: {
    forest_join_525: {
    forest_join_463: {
    forest_join_451: {
    forest_join_450: {
    forest_join_391: {
    forest_join_344: {
    forest_join_330: {
    forest_join_319: {
    forest_join_298: {
    forest_join_297: {
    forest_join_269: {
    forest_join_268: {
    forest_join_266: {
    forest_join_171: {
    forest_join_100: {
    forest_join_96: {
    forest_join_65: {
    forest_join_13: {
    life7_3 = (__fieldRead100198_0() ^ 37226725218325L);
    if (!((__fieldRead100198_3(__fieldRead100198_2(__fieldRead100198_1(receiver))) != __fieldRead100198_4(receiver)))) {
        break forest_join_13;
    }
    __call100198_5(receiver);
    }
    __call100198_8(__fieldRead100198_7(__fieldRead100198_6(receiver)), "camera");
    life9_24 = (__fieldRead100198_9(p0) - __fieldRead100198_10(receiver));
    life11_30 = (__fieldRead100198_11(p0) - __fieldRead100198_12(receiver));
    life13_36 = (__fieldRead100198_13(p0) - __fieldRead100198_14(receiver));
    if (!((__fieldRead100198_15(receiver) == __fieldRead100198_16(p0)))) {
        break forest_join_65;
    }
    if (!((__fieldRead100198_17(receiver) == __fieldRead100198_18(p0)))) {
        break forest_join_65;
    }
    if (!((__fieldRead100198_19(receiver) == __fieldRead100198_20(p0)))) {
        break forest_join_65;
    }
    if (!((__numericCompare100198_21((((life9_24 * life9_24) + (life11_30 * life11_30)) + (life13_36 * life13_36)), 0x1.0p4d) > 0))) {
        break forest_join_96;
    }
    }
    __fieldWrite100198_23(receiver, __fieldRead100198_22(p0));
    __fieldWrite100198_25(receiver, __fieldRead100198_24(p0));
    __fieldWrite100198_27(receiver, __fieldRead100198_26(p0));
    __fieldWrite100198_29(receiver, __fieldRead100198_28(p0));
    __fieldWrite100198_31(receiver, __fieldRead100198_30(p0));
    __fieldWrite100198_33(receiver, __fieldRead100198_32(p0));
    __call100198_37(__fieldRead100198_34(receiver), __fieldRead100198_35(p0), __fieldRead100198_36(p0));
    }
    if (!(__call100198_38())) {
        break forest_join_100;
    }
    __call100198_39(receiver);
    }
    __call100198_42(__fieldRead100198_41(__fieldRead100198_40(receiver)), "renderlistcamera");
    life15_121 = (__fieldRead100198_43(p0) + ((__fieldRead100198_44(p0) - __fieldRead100198_45(p0)) * p1));
    life17_132 = (__fieldRead100198_46(p0) + ((__fieldRead100198_47(p0) - __fieldRead100198_48(p0)) * p1));
    life19_143 = (__fieldRead100198_49(p0) + ((__fieldRead100198_50(p0) - __fieldRead100198_51(p0)) * p1));
    __call100198_53(__fieldRead100198_52(receiver), life15_121, life17_132, life19_143);
    __call100198_56(__fieldRead100198_55(__fieldRead100198_54(receiver)), "cull");
    if (!((__fieldRead100198_57(receiver) != null))) {
        break forest_join_171;
    }
    life21_163 = new net.minecraft.client.renderer.culling.Frustum(__fieldRead100198_58(receiver));
    __call100198_65(life21_163, __fieldRead100198_60(__fieldRead100198_59(receiver)), __fieldRead100198_62(__fieldRead100198_61(receiver)), __fieldRead100198_64(__fieldRead100198_63(receiver)));
    p2 = life21_163;
    }
    __call100198_68(__fieldRead100198_67(__fieldRead100198_66(receiver)), "culling");
    life21_192 = new moom.DT(life15_121, (life17_132 + ((double) __call100198_69(p0))), life19_143);
    life22_197 = __call100198_71(__fieldRead100198_70(receiver), life21_192);
    new moom.DT((__call100198_72((life15_121 / 0x1.0p4d)) * __invokedynamic100198_73(20096, (7197087361762822121L ^ life7_3))), (__call100198_74((life17_132 / 0x1.0p4d)) * __invokedynamic100198_75(2671, (6021939914468049688L ^ life7_3))), (__call100198_76((life19_143 / 0x1.0p4d)) * __invokedynamic100198_77(2671, (6021939914468049688L ^ life7_3))));
    spill100198_0 = receiver;
    if (!((!__fieldRead100198_78(receiver)))) {
        forestValue100198_266_0 = spill100198_0;
        break forest_join_266;
    }
    if (!(__call100198_80(__fieldRead100198_79(receiver)))) {
        forestValue100198_266_0 = spill100198_0;
        break forest_join_266;
    }
    if (!((__numericCompare100198_83(__fieldRead100198_81(p0), __fieldRead100198_82(receiver)) == 0))) {
        forestValue100198_266_0 = spill100198_0;
        break forest_join_266;
    }
    if (!((__numericCompare100198_86(__fieldRead100198_84(p0), __fieldRead100198_85(receiver)) == 0))) {
        forestValue100198_266_0 = spill100198_0;
        break forest_join_266;
    }
    if (!((__numericCompare100198_89(__fieldRead100198_87(p0), __fieldRead100198_88(receiver)) == 0))) {
        forestValue100198_266_0 = spill100198_0;
        break forest_join_266;
    }
    if (!((__numericCompare100198_92(((double) __fieldRead100198_90(p0)), __fieldRead100198_91(receiver)) == 0))) {
        forestValue100198_266_0 = spill100198_0;
        break forest_join_266;
    }
    if (!((__numericCompare100198_95(((double) __fieldRead100198_93(p0)), __fieldRead100198_94(receiver)) != 0))) {
        forestValue100198_268_0 = spill100198_0;
        break forest_join_268;
    }
    forestValue100198_266_0 = spill100198_0;
    }
    forestValue100198_269_0 = forestValue100198_266_0;
    forestValue100198_269_1 = 1;
    break forest_join_269;
    }
    forestValue100198_269_0 = forestValue100198_268_0;
    forestValue100198_269_1 = 0;
    }
    __fieldWrite100198_96(forestValue100198_269_0, forestValue100198_269_1);
    __fieldWrite100198_98(receiver, __fieldRead100198_97(p0));
    __fieldWrite100198_100(receiver, __fieldRead100198_99(p0));
    __fieldWrite100198_102(receiver, __fieldRead100198_101(p0));
    __fieldWrite100198_104(receiver, ((double) __fieldRead100198_103(p0)));
    __fieldWrite100198_106(receiver, ((double) __fieldRead100198_105(p0)));
    if (!((__fieldRead100198_107(receiver) != null))) {
        break forest_join_297;
    }
    forestValue100198_298_0 = 1;
    break forest_join_298;
    }
    forestValue100198_298_0 = 0;
    }
    life23_310 = forestValue100198_298_0;
    __call100198_110(__fieldRead100198_109(__fieldRead100198_108(receiver)), "update");
    __call100198_112(__fieldRead100198_111());
    life24_320 = __call100198_113(receiver);
    if (!((life24_320 != __fieldRead100198_114(receiver)))) {
        break forest_join_319;
    }
    __fieldWrite100198_115(receiver, life24_320);
    __fieldWrite100198_116(receiver, 1);
    }
    life25_337 = __invokedynamic100198_117(10365, (3905769029832270124L ^ life7_3));
    if (!((!__call100198_118()))) {
        break forest_join_330;
    }
    __fieldWrite100198_119(receiver, 1);
    }
    if (!((life23_310 == 0))) {
        break forest_join_344;
    }
    if (!(__fieldRead100198_120(receiver))) {
        break forest_join_344;
    }
    if (!(__call100198_121())) {
        break forest_join_344;
    }
    life25_337 = __call100198_124(__fieldRead100198_122(receiver), p0, __fieldRead100198_123(receiver));
    }
    life26_372 = __call100198_129(__fieldRead100198_125(receiver), new moom.DT(__fieldRead100198_126(p0), __fieldRead100198_127(p0), __fieldRead100198_128(p0)));
    if (!(__fieldRead100198_130())) {
        break forest_join_451;
    }
    __fieldWrite100198_132(receiver, __fieldRead100198_131(receiver));
    __fieldWrite100198_134(receiver, __fieldRead100198_133(receiver));
    __fieldWrite100198_136(receiver, __fieldRead100198_135(receiver));
    if (!((life23_310 == 0))) {
        break forest_join_463;
    }
    if (!(__fieldRead100198_137(receiver))) {
        break forest_join_463;
    }
    __call100198_138(receiver);
    if (!((life26_372 != null))) {
        break forest_join_391;
    }
    if (!((__call100198_140(__call100198_139(life26_372)) > life25_337))) {
        break forest_join_391;
    }
    __call100198_143(__fieldRead100198_141(receiver), __call100198_142(life26_372));
    }
    life27_421 = __call100198_147(__fieldRead100198_144(receiver), p1, p0, __fieldRead100198_145(receiver), __fieldRead100198_146(receiver));
    forest_cycle_401: while (true) {
    forest_join_449: {
    forest_join_439: {
    forest_join_430: {
    forest_join_425: {
    if (!(__call100198_148(life27_421))) {
        break forest_join_450;
    }
    life28_428 = __cast100198_150(__call100198_149(life27_421));
    if (!((life28_428 != null))) {
        break forest_join_449;
    }
    if (!((__call100198_152(__call100198_151(life28_428)) <= life25_337))) {
        break forest_join_449;
    }
    life29_439 = __call100198_153(life28_428);
    if (!(__call100198_155(__fieldRead100198_154(life28_428)))) {
        break forest_join_425;
    }
    if (!(__call100198_156(life28_428))) {
        break forest_join_430;
    }
    }
    __call100198_158(__fieldRead100198_157(receiver), life29_439);
    }
    if (!(__call100198_160(__call100198_159(life28_428)))) {
        break forest_join_439;
    }
    __call100198_162(__fieldRead100198_161(receiver), life29_439);
    }
    if (!((__call100198_165(__call100198_164(__call100198_163(life28_428))) > 0))) {
        break forest_join_449;
    }
    __call100198_167(__fieldRead100198_166(receiver), life29_439);
    }
    continue forest_cycle_401;
    }
    }
    break forest_join_463;
    }
    __fieldWrite100198_169(receiver, __fieldRead100198_168(receiver));
    __fieldWrite100198_171(receiver, __fieldRead100198_170(receiver));
    __fieldWrite100198_173(receiver, __fieldRead100198_172(receiver));
    }
    if (!((life23_310 == 0))) {
        break forest_join_784;
    }
    if (!(__fieldRead100198_174(receiver))) {
        break forest_join_784;
    }
    if (!((!__fieldRead100198_175()))) {
        break forest_join_784;
    }
    __fieldWrite100198_176(receiver, 0);
    __call100198_177(receiver);
    __call100198_179(__fieldRead100198_178(receiver));
    life27_508 = __fieldRead100198_180(receiver);
    life28_512 = __integerCategory100198_183(__fieldRead100198_182(__fieldRead100198_181(receiver)));
    if (!((life22_197 != null))) {
        break forest_join_564;
    }
    if (!((__call100198_185(__call100198_184(life22_197)) <= life25_337))) {
        break forest_join_564;
    }
    life29_522 = 0;
    life30_529 = new moom.ls(life22_197, null, 0);
    life31_531 = __fieldRead100198_186();
    if (!((__call100198_187(life31_531) == 1))) {
        break forest_join_529;
    }
    life32_540 = __call100198_188(receiver, p0, p1);
    life33_549 = __call100198_193(__call100198_192(__fieldRead100198_189(life32_540), __fieldRead100198_190(life32_540), __fieldRead100198_191(life32_540)));
    if (!((life33_549 == null))) {
        break forest_join_525;
    }
    life33_549 = __fieldRead100198_194();
    }
    __call100198_195(life31_531, life33_549);
    }
    if (!(__call100198_196(life31_531))) {
        break forest_join_534;
    }
    life29_522 = 1;
    }
    if (!((life29_522 != 0))) {
        break forest_join_544;
    }
    if (!((!p4))) {
        break forest_join_544;
    }
    __call100198_198(__fieldRead100198_197(receiver), life30_529);
    break forest_join_563;
    }
    if (!(p4)) {
        break forest_join_555;
    }
    if (!(__call100198_202(__call100198_201(__call100198_200(__fieldRead100198_199(receiver), life21_192))))) {
        break forest_join_555;
    }
    life28_512 = 0;
    }
    __call100198_203(life22_197, p3);
    __call100198_204(life27_508, life30_529);
    }
    break forest_join_657;
    }
    if (!((__call100198_205(life21_192) > 0))) {
        break forest_join_575;
    }
    forestValue100198_580_0 = __call100198_207(life25_337, __invokedynamic100198_206(28715, (2361016920518474082L ^ life7_3)));
    break forest_join_580;
    }
    forestValue100198_580_0 = __invokedynamic100198_208(8277, (8363574468044679546L ^ life7_3));
    }
    life29_611 = forestValue100198_580_0;
    if (!((life26_372 != null))) {
        break forest_join_589;
    }
    __call100198_211(__fieldRead100198_209(receiver), __call100198_210(life26_372));
    }
    life30_624 = (-__fieldRead100198_212(receiver));
    forest_cycle_593: while (true) {
    forest_join_655: {
    if (!((life30_624 <= __fieldRead100198_213(receiver)))) {
        break forest_join_657;
    }
    life31_632 = (-__fieldRead100198_214(receiver));
    forest_cycle_601: while (true) {
    forest_join_653: {
    if (!((life31_632 <= __fieldRead100198_215(receiver)))) {
        break forest_join_655;
    }
    life32_662 = __call100198_219(__fieldRead100198_216(receiver), new moom.DT(((life30_624 << 4) + __invokedynamic100198_217(20434, (1057987311586838271L ^ life7_3))), life29_611, ((life31_632 << 4) + __invokedynamic100198_218(20434, (1057987311586838271L ^ life7_3)))));
    if (!((life32_662 != null))) {
        break forest_join_653;
    }
    if (!(__call100198_220(life32_662, p2, p3))) {
        break forest_join_653;
    }
    __call100198_221(life32_662, p3);
    life33_677 = __call100198_222(life32_662);
    __call100198_223(life33_677, null, 0);
    __call100198_224(life27_508, life33_677);
    }
    life31_632 += 1;
    continue forest_cycle_601;
    }
    }
    life30_624 += 1;
    continue forest_cycle_593;
    }
    }
    __call100198_227(__fieldRead100198_226(__fieldRead100198_225(receiver)), "iteration");
    life29_696 = __integerCategory100198_229(__call100198_228());
    forest_cycle_664: while (true) {
    forest_join_779: {
    forest_join_716: {
    forest_join_715: {
    forest_join_709: {
    forest_join_700: {
    forest_join_691: {
    forest_join_686: {
    if (!((!__call100198_230(life27_508)))) {
        break forest_join_780;
    }
    life30_703 = __cast100198_232(__call100198_231(life27_508));
    life31_706 = __fieldRead100198_233(life30_703);
    life32_709 = __fieldRead100198_234(life30_703);
    life33_712 = __fieldRead100198_235(life31_706);
    if (!(__call100198_236(life33_712))) {
        break forest_join_686;
    }
    if (!(__call100198_237(life31_706))) {
        break forest_join_691;
    }
    }
    __call100198_239(__fieldRead100198_238(receiver), life30_703);
    }
    if (!(__call100198_241(__call100198_240(life31_706)))) {
        break forest_join_700;
    }
    __call100198_243(__fieldRead100198_242(receiver), life30_703);
    }
    if (!((__call100198_245(__call100198_244(life33_712)) > 0))) {
        break forest_join_709;
    }
    __call100198_247(__fieldRead100198_246(receiver), life30_703);
    }
    if (!((life28_512 != 0))) {
        break forest_join_715;
    }
    forestValue100198_716_0 = __call100198_249(__fieldRead100198_248(life30_703));
    break forest_join_716;
    }
    forestValue100198_716_0 = __fieldRead100198_250();
    }
    life34_753 = forestValue100198_716_0;
    life35_756 = (life34_753).length;
    life36_758 = 0;
    forest_cycle_722: while (true) {
    forest_join_777: {
    forest_join_739: {
    if (!((life36_758 < life35_756))) {
        break forest_join_779;
    }
    life37_765 = (life34_753)[life36_758];
    if (!((life28_512 != 0))) {
        break forest_join_739;
    }
    if (!((life32_709 != null))) {
        break forest_join_739;
    }
    if (!(__call100198_252(life33_712, __call100198_251(life32_709), life37_765))) {
        break forest_join_777;
    }
    }
    life38_785 = __call100198_253(receiver, life21_192, life31_706, life37_765, life29_696, life25_337);
    if (!((life38_785 != null))) {
        break forest_join_777;
    }
    if (!(__call100198_254(life38_785, p3))) {
        break forest_join_777;
    }
    if (!(__call100198_255(life38_785, p2, p3))) {
        break forest_join_777;
    }
    life39_806 = (__fieldRead100198_256(life30_703) | (1 << __call100198_257(life37_765)));
    life40_809 = __call100198_258(life38_785);
    __call100198_259(life40_809, life37_765, life39_806);
    __call100198_260(life27_508, life40_809);
    }
    life36_758 += 1;
    continue forest_cycle_722;
    }
    }
    continue forest_cycle_664;
    }
    }
    __call100198_263(__fieldRead100198_262(__fieldRead100198_261(receiver)));
    }
    __call100198_266(__fieldRead100198_265(__fieldRead100198_264(receiver)), "captureFrustum");
    if (!(__fieldRead100198_267(receiver))) {
        break forest_join_800;
    }
    __call100198_268(receiver, life15_121, life17_132, life19_143);
    __fieldWrite100198_269(receiver, 0);
    }
    __call100198_271(__fieldRead100198_270());
    if (!(__fieldRead100198_272())) {
        break forest_join_806;
    }
    __call100198_273();
    break forest_join_931;
    }
    __call100198_276(__fieldRead100198_275(__fieldRead100198_274(receiver)), "rebuildNear");
    __call100198_278(__fieldRead100198_277(receiver));
    life27_858 = __fieldRead100198_279(receiver);
    __fieldWrite100198_281(receiver, __call100198_280());
    __call100198_283(__fieldRead100198_282());
    life28_867 = __call100198_285(__fieldRead100198_284(receiver));
    forest_cycle_826: while (true) {
    forest_join_919: {
    forest_join_902: {
    forest_join_893: {
    forest_join_884: {
    forest_join_883: {
    forest_join_843: {
    if (!(__call100198_286(life28_867))) {
        break forest_join_920;
    }
    life29_874 = __cast100198_288(__call100198_287(life28_867));
    life30_877 = __fieldRead100198_289(life29_874);
    if (!((!__call100198_290(life30_877)))) {
        break forest_join_843;
    }
    if (!(__call100198_291(life27_858, life30_877))) {
        break forest_join_919;
    }
    }
    __fieldWrite100198_292(receiver, 1);
    life31_891 = __call100198_293(life30_877);
    if (!((__numericCompare100198_301(__call100198_300(life21_192, ((double) (__call100198_294(life31_891) + __invokedynamic100198_295(20434, (1057987311586838271L ^ life7_3)))), ((double) (__call100198_296(life31_891) + __invokedynamic100198_297(20434, (1057987311586838271L ^ life7_3)))), ((double) (__call100198_298(life31_891) + __invokedynamic100198_299(20434, (1057987311586838271L ^ life7_3))))), 0x1.8p9d) < 0))) {
        break forest_join_883;
    }
    forestValue100198_884_0 = 1;
    break forest_join_884;
    }
    forestValue100198_884_0 = 0;
    }
    life32_927 = forestValue100198_884_0;
    if (!((life32_927 == 0))) {
        break forest_join_893;
    }
    __call100198_303(__fieldRead100198_302(receiver), life30_877);
    break forest_join_919;
    }
    if (!((!__call100198_304(life30_877)))) {
        break forest_join_902;
    }
    __call100198_306(__fieldRead100198_305(receiver), life30_877);
    break forest_join_919;
    }
    __call100198_309(__fieldRead100198_308(__fieldRead100198_307(receiver)), "build near");
    __call100198_311(__fieldRead100198_310(receiver), life30_877);
    __call100198_312(life30_877, 0);
    __call100198_315(__fieldRead100198_314(__fieldRead100198_313(receiver)));
    }
    continue forest_cycle_826;
    }
    }
    __call100198_317(__fieldRead100198_316());
    __call100198_319(__fieldRead100198_318(receiver), life27_858);
    __call100198_322(__fieldRead100198_321(__fieldRead100198_320(receiver)));
    }
    return;
}
public static void h100198_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019800_0(p0);
}
public static void h100198_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019801_0(p0);
}
public static void h100198_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019802_0(p0);
}
public static void h100198_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019803_0(p0);
}
public static void h100198_4(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019804_0(p0);
}
public static void h100198_5(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019805_0(p0);
}
public static void h100198_6(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019806_0(p0);
}
public static void h100198_7(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019807_0(p0);
}
public static void h100198_8(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019808_0(p0);
}
public static void h100198_9(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019809_0(p0);
}
public static void h100198_10(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019810_0(p0);
}
public static void h100198_11(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019811_0(p0);
}
public static void h100198_12(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019812_0(p0);
}
public static void h100198_13(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019813_0(p0);
}
public static void h100198_14(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019814_0(p0);
}
public static void h100198_15(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019815_0(p0);
}
public static void h100198_16(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019816_0(p0);
}
public static void h100198_17(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019817_0(p0);
}
public static void h100198_18(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019818_0(p0);
}
public static void h100198_19(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019819_0(p0);
}
public static void h100198_20(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019820_0(p0);
}
public static void h100198_21(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019821_0(p0);
}
public static void h100198_22(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019822_0(p0);
}
public static void h100198_23(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019823_0(p0);
}
public static void h100198_24(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019824_0(p0);
}
public static void h100198_25(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019825_0(p0);
}
public static void h100198_26(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019826_0(p0);
}
public static void h100198_27(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019827_0(p0);
}
public static void h100198_28(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019828_0(p0);
}
public static void h100198_29(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019829_0(p0);
}
public static void h100198_30(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019830_0(p0);
}
public static void h100198_31(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019831_0(p0);
}
public static void h100198_32(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019832_0(p0);
}
public static void h100198_33(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019833_0(p0);
}
public static void h100198_34(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019834_0(p0);
}
public static void h100198_35(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019835_0(p0);
}
public static void h100198_36(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019836_0(p0);
}
public static void h100198_37(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019837_0(p0);
}
public static void h100198_38(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019838_0(p0);
}
public static void h100198_39(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019839_0(p0);
}
public static void h100198_40(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019840_0(p0);
}
public static void h100198_41(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019841_0(p0);
}
public static void h100198_42(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019842_0(p0);
}
public static void h100198_43(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019843_0(p0);
}
public static void h100198_44(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019844_0(p0);
}
public static void h100198_45(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019845_0(p0);
}
public static void h100198_46(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019846_0(p0);
}
public static void h100198_47(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019847_0(p0);
}
public static void h100198_48(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019848_0(p0);
}
public static void h100198_49(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019849_0(p0);
}
public static void h100198_50(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019850_0(p0);
}
public static void h100198_51(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019851_0(p0);
}
private static native long __fieldRead100198_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100198_1(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead100198_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead100198_3(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __fieldRead100198_4(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call100198_5(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead100198_6(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.A9 __fieldRead100198_7(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native void __call100198_8(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native double __fieldRead100198_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead100198_10(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native double __fieldRead100198_11(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead100198_12(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native double __fieldRead100198_13(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead100198_14(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __fieldRead100198_15(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __fieldRead100198_16(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __fieldRead100198_17(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __fieldRead100198_18(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __fieldRead100198_19(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __fieldRead100198_20(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __numericCompare100198_21(double a0, double a1) throws Throwable;
private static native double __fieldRead100198_22(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite100198_23(net.minecraft.client.renderer.RenderGlobal a0, double a1) throws Throwable;
private static native double __fieldRead100198_24(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite100198_25(net.minecraft.client.renderer.RenderGlobal a0, double a1) throws Throwable;
private static native double __fieldRead100198_26(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite100198_27(net.minecraft.client.renderer.RenderGlobal a0, double a1) throws Throwable;
private static native int __fieldRead100198_28(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite100198_29(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native int __fieldRead100198_30(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite100198_31(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native int __fieldRead100198_32(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite100198_33(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native moom.lv __fieldRead100198_34(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native double __fieldRead100198_35(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead100198_36(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call100198_37(moom.lv a0, double a1, double a2) throws Throwable;
private static native boolean __call100198_38() throws Throwable;
private static native void __call100198_39(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead100198_40(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.A9 __fieldRead100198_41(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native void __call100198_42(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native double __fieldRead100198_43(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead100198_44(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead100198_45(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead100198_46(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead100198_47(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead100198_48(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead100198_49(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead100198_50(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead100198_51(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.kR __fieldRead100198_52(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call100198_53(moom.kR a0, double a1, double a2, double a3) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead100198_54(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.A9 __fieldRead100198_55(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native void __call100198_56(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native moom.mv __fieldRead100198_57(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.mv __fieldRead100198_58(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.DZ __fieldRead100198_59(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native double __fieldRead100198_60(moom.DZ a0) throws Throwable;
private static native moom.DZ __fieldRead100198_61(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native double __fieldRead100198_62(moom.DZ a0) throws Throwable;
private static native moom.DZ __fieldRead100198_63(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native double __fieldRead100198_64(moom.DZ a0) throws Throwable;
private static native void __call100198_65(net.minecraft.client.renderer.culling.Frustum a0, double a1, double a2, double a3) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100198_66(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.A9 __fieldRead100198_67(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call100198_68(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native float __call100198_69(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.lv __fieldRead100198_70(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.mp __call100198_71(moom.lv a0, moom.DT a1) throws Throwable;
private static native int __call100198_72(double a0) throws Throwable;
private static native int __invokedynamic100198_73(int a0, long a1) throws Throwable;
private static native int __call100198_74(double a0) throws Throwable;
private static native int __invokedynamic100198_75(int a0, long a1) throws Throwable;
private static native int __call100198_76(double a0) throws Throwable;
private static native int __invokedynamic100198_77(int a0, long a1) throws Throwable;
private static native boolean __fieldRead100198_78(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.util.Set __fieldRead100198_79(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call100198_80(java.util.Set a0) throws Throwable;
private static native double __fieldRead100198_81(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead100198_82(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __numericCompare100198_83(double a0, double a1) throws Throwable;
private static native double __fieldRead100198_84(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead100198_85(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __numericCompare100198_86(double a0, double a1) throws Throwable;
private static native double __fieldRead100198_87(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead100198_88(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __numericCompare100198_89(double a0, double a1) throws Throwable;
private static native float __fieldRead100198_90(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead100198_91(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __numericCompare100198_92(double a0, double a1) throws Throwable;
private static native float __fieldRead100198_93(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead100198_94(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __numericCompare100198_95(double a0, double a1) throws Throwable;
private static native void __fieldWrite100198_96(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native double __fieldRead100198_97(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite100198_98(net.minecraft.client.renderer.RenderGlobal a0, double a1) throws Throwable;
private static native double __fieldRead100198_99(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite100198_100(net.minecraft.client.renderer.RenderGlobal a0, double a1) throws Throwable;
private static native double __fieldRead100198_101(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite100198_102(net.minecraft.client.renderer.RenderGlobal a0, double a1) throws Throwable;
private static native float __fieldRead100198_103(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite100198_104(net.minecraft.client.renderer.RenderGlobal a0, double a1) throws Throwable;
private static native float __fieldRead100198_105(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite100198_106(net.minecraft.client.renderer.RenderGlobal a0, double a1) throws Throwable;
private static native moom.mv __fieldRead100198_107(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100198_108(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.A9 __fieldRead100198_109(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call100198_110(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native moom.JL __fieldRead100198_111() throws Throwable;
private static native void __call100198_112(moom.JL a0) throws Throwable;
private static native int __call100198_113(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __fieldRead100198_114(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __fieldWrite100198_115(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native void __fieldWrite100198_116(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native int __invokedynamic100198_117(int a0, long a1) throws Throwable;
private static native boolean __call100198_118() throws Throwable;
private static native void __fieldWrite100198_119(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native boolean __fieldRead100198_120(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call100198_121() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead100198_122(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __fieldRead100198_123(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __call100198_124(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.entity.Entity a1, int a2) throws Throwable;
private static native moom.lv __fieldRead100198_125(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native double __fieldRead100198_126(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead100198_127(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead100198_128(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.mp __call100198_129(moom.lv a0, moom.DT a1) throws Throwable;
private static native boolean __fieldRead100198_130() throws Throwable;
private static native java.util.List __fieldRead100198_131(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __fieldWrite100198_132(net.minecraft.client.renderer.RenderGlobal a0, java.util.List a1) throws Throwable;
private static native java.util.List __fieldRead100198_133(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __fieldWrite100198_134(net.minecraft.client.renderer.RenderGlobal a0, java.util.List a1) throws Throwable;
private static native java.util.List __fieldRead100198_135(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __fieldWrite100198_136(net.minecraft.client.renderer.RenderGlobal a0, java.util.List a1) throws Throwable;
private static native boolean __fieldRead100198_137(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call100198_138(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.DT __call100198_139(moom.mp a0) throws Throwable;
private static native int __call100198_140(moom.DT a0) throws Throwable;
private static native java.util.List __fieldRead100198_141(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.ls __call100198_142(moom.mp a0) throws Throwable;
private static native boolean __call100198_143(java.util.List a0, moom.ls a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead100198_144(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __fieldRead100198_145(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.lv __fieldRead100198_146(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.util.Iterator __call100198_147(net.minecraft.client.multiplayer.WorldClient a0, double a1, net.minecraft.entity.Entity a2, int a3, moom.lv a4) throws Throwable;
private static native boolean __call100198_148(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100198_149(java.util.Iterator a0) throws Throwable;
private static native moom.mp __cast100198_150(java.lang.Object a0) throws Throwable;
private static native moom.DT __call100198_151(moom.mp a0) throws Throwable;
private static native int __call100198_152(moom.DT a0) throws Throwable;
private static native moom.ls __call100198_153(moom.mp a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.CompiledChunk __fieldRead100198_154(moom.mp a0) throws Throwable;
private static native boolean __call100198_155(net.minecraft.client.renderer.chunk.CompiledChunk a0) throws Throwable;
private static native boolean __call100198_156(moom.mp a0) throws Throwable;
private static native java.util.List __fieldRead100198_157(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call100198_158(java.util.List a0, moom.ls a1) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call100198_159(moom.mp a0) throws Throwable;
private static native boolean __call100198_160(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native java.util.List __fieldRead100198_161(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call100198_162(java.util.List a0, moom.ls a1) throws Throwable;
private static native net.minecraft.client.renderer.chunk.CompiledChunk __call100198_163(moom.mp a0) throws Throwable;
private static native java.util.List __call100198_164(net.minecraft.client.renderer.chunk.CompiledChunk a0) throws Throwable;
private static native int __call100198_165(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead100198_166(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call100198_167(java.util.List a0, moom.ls a1) throws Throwable;
private static native java.util.List __fieldRead100198_168(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __fieldWrite100198_169(net.minecraft.client.renderer.RenderGlobal a0, java.util.List a1) throws Throwable;
private static native java.util.List __fieldRead100198_170(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __fieldWrite100198_171(net.minecraft.client.renderer.RenderGlobal a0, java.util.List a1) throws Throwable;
private static native java.util.List __fieldRead100198_172(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __fieldWrite100198_173(net.minecraft.client.renderer.RenderGlobal a0, java.util.List a1) throws Throwable;
private static native boolean __fieldRead100198_174(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __fieldRead100198_175() throws Throwable;
private static native void __fieldWrite100198_176(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native void __call100198_177(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.util.Deque __fieldRead100198_178(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call100198_179(java.util.Deque a0) throws Throwable;
private static native java.util.Deque __fieldRead100198_180(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100198_181(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __fieldRead100198_182(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __integerCategory100198_183(boolean value) throws Throwable;
private static native moom.DT __call100198_184(moom.mp a0) throws Throwable;
private static native int __call100198_185(moom.DT a0) throws Throwable;
private static native java.util.Set __fieldRead100198_186() throws Throwable;
private static native int __call100198_187(java.util.Set a0) throws Throwable;
private static native org.lwjgl.util.vector.Vector3f __call100198_188(net.minecraft.client.renderer.RenderGlobal a0, net.minecraft.entity.Entity a1, double a2) throws Throwable;
private static native float __fieldRead100198_189(org.lwjgl.util.vector.Vector3f a0) throws Throwable;
private static native float __fieldRead100198_190(org.lwjgl.util.vector.Vector3f a0) throws Throwable;
private static native float __fieldRead100198_191(org.lwjgl.util.vector.Vector3f a0) throws Throwable;
private static native moom.bs __call100198_192(float a0, float a1, float a2) throws Throwable;
private static native moom.bs __call100198_193(moom.bs a0) throws Throwable;
private static native moom.bs __fieldRead100198_194() throws Throwable;
private static native boolean __call100198_195(java.util.Set a0, moom.bs a1) throws Throwable;
private static native boolean __call100198_196(java.util.Set a0) throws Throwable;
private static native java.util.List __fieldRead100198_197(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call100198_198(java.util.List a0, moom.ls a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead100198_199(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call100198_200(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call100198_201(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native boolean __call100198_202(net.minecraft.block.Block a0) throws Throwable;
private static native boolean __call100198_203(moom.mp a0, int a1) throws Throwable;
private static native boolean __call100198_204(java.util.Deque a0, moom.ls a1) throws Throwable;
private static native int __call100198_205(moom.DT a0) throws Throwable;
private static native int __invokedynamic100198_206(int a0, long a1) throws Throwable;
private static native int __call100198_207(int a0, int a1) throws Throwable;
private static native int __invokedynamic100198_208(int a0, long a1) throws Throwable;
private static native java.util.List __fieldRead100198_209(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.ls __call100198_210(moom.mp a0) throws Throwable;
private static native boolean __call100198_211(java.util.List a0, moom.ls a1) throws Throwable;
private static native int __fieldRead100198_212(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __fieldRead100198_213(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __fieldRead100198_214(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __fieldRead100198_215(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.lv __fieldRead100198_216(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __invokedynamic100198_217(int a0, long a1) throws Throwable;
private static native int __invokedynamic100198_218(int a0, long a1) throws Throwable;
private static native moom.mp __call100198_219(moom.lv a0, moom.DT a1) throws Throwable;
private static native boolean __call100198_220(moom.mp a0, net.minecraft.client.renderer.culling.ICamera a1, int a2) throws Throwable;
private static native boolean __call100198_221(moom.mp a0, int a1) throws Throwable;
private static native moom.ls __call100198_222(moom.mp a0) throws Throwable;
private static native void __call100198_223(moom.ls a0, java.lang.Object a1, int a2) throws Throwable;
private static native boolean __call100198_224(java.util.Deque a0, moom.ls a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100198_225(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.A9 __fieldRead100198_226(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call100198_227(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native boolean __call100198_228() throws Throwable;
private static native int __integerCategory100198_229(boolean value) throws Throwable;
private static native boolean __call100198_230(java.util.Deque a0) throws Throwable;
private static native java.lang.Object __call100198_231(java.util.Deque a0) throws Throwable;
private static native moom.ls __cast100198_232(java.lang.Object a0) throws Throwable;
private static native moom.mp __fieldRead100198_233(moom.ls a0) throws Throwable;
private static native moom.bs __fieldRead100198_234(moom.ls a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.CompiledChunk __fieldRead100198_235(moom.mp a0) throws Throwable;
private static native boolean __call100198_236(net.minecraft.client.renderer.chunk.CompiledChunk a0) throws Throwable;
private static native boolean __call100198_237(moom.mp a0) throws Throwable;
private static native java.util.List __fieldRead100198_238(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call100198_239(java.util.List a0, moom.ls a1) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call100198_240(moom.mp a0) throws Throwable;
private static native boolean __call100198_241(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native java.util.List __fieldRead100198_242(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call100198_243(java.util.List a0, moom.ls a1) throws Throwable;
private static native java.util.List __call100198_244(net.minecraft.client.renderer.chunk.CompiledChunk a0) throws Throwable;
private static native int __call100198_245(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead100198_246(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call100198_247(java.util.List a0, moom.ls a1) throws Throwable;
private static native int __fieldRead100198_248(moom.ls a0) throws Throwable;
private static native moom.bs[] __call100198_249(int a0) throws Throwable;
private static native moom.bs[] __fieldRead100198_250() throws Throwable;
private static native moom.bs __call100198_251(moom.bs a0) throws Throwable;
private static native boolean __call100198_252(net.minecraft.client.renderer.chunk.CompiledChunk a0, moom.bs a1, moom.bs a2) throws Throwable;
private static native moom.mp __call100198_253(net.minecraft.client.renderer.RenderGlobal a0, moom.DT a1, moom.mp a2, moom.bs a3, int a4, int a5) throws Throwable;
private static native boolean __call100198_254(moom.mp a0, int a1) throws Throwable;
private static native boolean __call100198_255(moom.mp a0, net.minecraft.client.renderer.culling.ICamera a1, int a2) throws Throwable;
private static native int __fieldRead100198_256(moom.ls a0) throws Throwable;
private static native int __call100198_257(moom.bs a0) throws Throwable;
private static native moom.ls __call100198_258(moom.mp a0) throws Throwable;
private static native void __call100198_259(moom.ls a0, moom.bs a1, int a2) throws Throwable;
private static native boolean __call100198_260(java.util.Deque a0, moom.ls a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100198_261(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.A9 __fieldRead100198_262(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call100198_263(moom.A9 a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100198_264(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.A9 __fieldRead100198_265(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call100198_266(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native boolean __fieldRead100198_267(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call100198_268(net.minecraft.client.renderer.RenderGlobal a0, double a1, double a2, double a3) throws Throwable;
private static native void __fieldWrite100198_269(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native moom.JL __fieldRead100198_270() throws Throwable;
private static native void __call100198_271(moom.JL a0) throws Throwable;
private static native boolean __fieldRead100198_272() throws Throwable;
private static native void __call100198_273() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100198_274(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.A9 __fieldRead100198_275(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call100198_276(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native moom.mi __fieldRead100198_277(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call100198_278(moom.mi a0) throws Throwable;
private static native java.util.Set __fieldRead100198_279(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.util.LinkedHashSet __call100198_280() throws Throwable;
private static native void __fieldWrite100198_281(net.minecraft.client.renderer.RenderGlobal a0, java.util.LinkedHashSet a1) throws Throwable;
private static native moom.JL __fieldRead100198_282() throws Throwable;
private static native void __call100198_283(moom.JL a0) throws Throwable;
private static native java.util.List __fieldRead100198_284(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.util.Iterator __call100198_285(java.util.List a0) throws Throwable;
private static native boolean __call100198_286(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100198_287(java.util.Iterator a0) throws Throwable;
private static native moom.ls __cast100198_288(java.lang.Object a0) throws Throwable;
private static native moom.mp __fieldRead100198_289(moom.ls a0) throws Throwable;
private static native boolean __call100198_290(moom.mp a0) throws Throwable;
private static native boolean __call100198_291(java.util.Set a0, moom.mp a1) throws Throwable;
private static native void __fieldWrite100198_292(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native moom.DT __call100198_293(moom.mp a0) throws Throwable;
private static native int __call100198_294(moom.DT a0) throws Throwable;
private static native int __invokedynamic100198_295(int a0, long a1) throws Throwable;
private static native int __call100198_296(moom.DT a0) throws Throwable;
private static native int __invokedynamic100198_297(int a0, long a1) throws Throwable;
private static native int __call100198_298(moom.DT a0) throws Throwable;
private static native int __invokedynamic100198_299(int a0, long a1) throws Throwable;
private static native double __call100198_300(moom.DT a0, double a1, double a2, double a3) throws Throwable;
private static native int __numericCompare100198_301(double a0, double a1) throws Throwable;
private static native java.util.Set __fieldRead100198_302(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call100198_303(java.util.Set a0, moom.mp a1) throws Throwable;
private static native boolean __call100198_304(moom.mp a0) throws Throwable;
private static native java.util.Set __fieldRead100198_305(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call100198_306(java.util.Set a0, moom.mp a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100198_307(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.A9 __fieldRead100198_308(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call100198_309(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native moom.mi __fieldRead100198_310(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call100198_311(moom.mi a0, moom.mp a1) throws Throwable;
private static native void __call100198_312(moom.mp a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100198_313(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.A9 __fieldRead100198_314(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call100198_315(moom.A9 a0) throws Throwable;
private static native moom.JL __fieldRead100198_316() throws Throwable;
private static native void __call100198_317(moom.JL a0) throws Throwable;
private static native java.util.Set __fieldRead100198_318(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call100198_319(java.util.Set a0, java.util.Set a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100198_320(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.A9 __fieldRead100198_321(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call100198_322(moom.A9 a0) throws Throwable;
private static native java.lang.Throwable __call13019800_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019801_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019802_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019803_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019804_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019805_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019806_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019807_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019808_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019809_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019810_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019811_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019812_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019813_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019814_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019815_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019816_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019817_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019818_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019819_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019820_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019821_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019822_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019823_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019824_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019825_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019826_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019827_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019828_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019829_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019830_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019831_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019832_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019833_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019834_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019835_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019836_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019837_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019838_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019839_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019840_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019841_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019842_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019843_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019844_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019845_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019846_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019847_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019848_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019849_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019850_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019851_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_64013e6cfd2ed582c3a5(net.minecraft.client.renderer.RenderGlobal a0, net.minecraft.entity.Entity a1, float a2) throws E;
private static final class __SourceHandler_64013e6cfd2ed582c3a5 {

public static void f1403(net.minecraft.client.renderer.RenderGlobal receiver, net.minecraft.entity.Entity p0, float p1) throws Throwable {
    int spill1403_0;
    long spill1403_1;
    int spill1403_2;
    long spill1403_3;
    int spill1403_4;
    long spill1403_5;
    long life3_3;
    net.minecraft.client.renderer.Tessellator life5_5;
    moom.lw life6_8;
    net.minecraft.world.border.WorldBorder life7_12;
    double life8_24;
    double life10_84;
    double life10_89;
    double life12_104;
    double life14_116;
    double life16_128;
    int life18_145;
    float life19_162;
    float life20_179;
    float life21_190;
    float life22_220;
    float life23_222;
    float life24_224;
    float life25_226;
    double life26_251;
    double life28_260;
    float life30_269;
    double life31_271;
    double life33_281;
    float life35_286;
    float life30_376;
    double life31_378;
    double life33_388;
    float life35_393;
    double life26_483;
    double life28_492;
    float life30_501;
    double life31_503;
    double life33_513;
    float life35_518;
    float life30_608;
    double life31_610;
    double life33_620;
    float life35_625;
    lexical_join_726: {
    lexical_join_692: {
    lexical_join_585: {
    lexical_join_460: {
    lexical_join_353: {
    lexical_join_62: {
    lexical_join_57: {
    life3_3 = (__fieldRead1403_0() ^ 29181088412928L);
    life5_5 = __call1403_1();
    life6_8 = __call1403_2(life5_5);
    life7_12 = __call1403_4(__fieldRead1403_3(receiver));
    life8_24 = ((double) (__fieldRead1403_7(__fieldRead1403_6(__fieldRead1403_5(receiver))) * __invokedynamic1403_8(2671, (6021876904021093901L ^ life3_3))));
    if (!((__numericCompare1403_11(__fieldRead1403_9(p0), (__call1403_10(life7_12) - life8_24)) < 0))) {
        break lexical_join_57;
    }
    if (!((__numericCompare1403_14(__fieldRead1403_12(p0), (__call1403_13(life7_12) + life8_24)) > 0))) {
        break lexical_join_57;
    }
    if (!((__numericCompare1403_17(__fieldRead1403_15(p0), (__call1403_16(life7_12) - life8_24)) < 0))) {
        break lexical_join_57;
    }
    if (!((__numericCompare1403_20(__fieldRead1403_18(p0), (__call1403_19(life7_12) + life8_24)) <= 0))) {
        break lexical_join_726;
    }
    }
    if (!(__call1403_21())) {
        break lexical_join_62;
    }
    __call1403_22();
    __call1403_24(__fieldRead1403_23());
    }
    life10_84 = (0x1.0p0d - (__call1403_25(life7_12, p0) / life8_24));
    spill1403_0 = 22673;
    life10_89 = __call1403_26(life10_84, 0x1.0p2d);
    spill1403_1 = (4685075273132293284L ^ life3_3);
    life12_104 = (__fieldRead1403_27(p0) + ((__fieldRead1403_28(p0) - __fieldRead1403_29(p0)) * ((double) p1)));
    life14_116 = (__fieldRead1403_30(p0) + ((__fieldRead1403_31(p0) - __fieldRead1403_32(p0)) * ((double) p1)));
    life16_128 = (__fieldRead1403_33(p0) + ((__fieldRead1403_34(p0) - __fieldRead1403_35(p0)) * ((double) p1)));
    __call1403_36();
    __call1403_38(__invokedynamic1403_37(spill1403_0, spill1403_1), 1, 1, 0);
    __call1403_41(__fieldRead1403_39(receiver), __fieldRead1403_40());
    __call1403_42(0);
    __call1403_43();
    life18_145 = __call1403_45(__call1403_44(life7_12));
    life19_162 = (((float) ((life18_145 >> __invokedynamic1403_46(2671, (6021876904021093901L ^ life3_3))) & __invokedynamic1403_47(32333, (1508067387072387584L ^ life3_3)))) / 0x1.fep7f);
    life20_179 = (((float) ((life18_145 >> __invokedynamic1403_48(20434, (1057926498034527210L ^ life3_3))) & __invokedynamic1403_49(14550, (6291969127015144627L ^ life3_3)))) / 0x1.fep7f);
    life21_190 = (((float) (life18_145 & __invokedynamic1403_50(14550, (6291969127015144627L ^ life3_3)))) / 0x1.fep7f);
    spill1403_2 = 31064;
    __call1403_51(life19_162, life20_179, life21_190, ((float) life10_89));
    spill1403_3 = (2110578729338510691L ^ life3_3);
    __call1403_52(-0x1.8p1f, -0x1.8p1f);
    __call1403_53();
    __call1403_55(__invokedynamic1403_54(spill1403_2, spill1403_3), 0x1.99999ap-4f);
    __call1403_56();
    __call1403_57();
    life22_220 = (((float) (__call1403_58() % __invokedynamic1403_59(13505, (6072164668405387862L ^ life3_3)))) / 0x1.77p11f);
    life23_222 = 0x0.0p0f;
    life24_224 = 0x0.0p0f;
    life25_226 = 0x1.0p7f;
    __call1403_62(life6_8, __invokedynamic1403_60(12452, (6696226470428955891L ^ life3_3)), __fieldRead1403_61());
    __call1403_63(life6_8, (-life12_104), (-life14_116), (-life16_128));
    life26_251 = __call1403_66(((double) __call1403_64((life16_128 - life8_24))), __call1403_65(life7_12));
    life28_260 = __call1403_69(((double) __call1403_67((life16_128 + life8_24))), __call1403_68(life7_12));
    if (!((__numericCompare1403_71(life12_104, (__call1403_70(life7_12) - life8_24)) > 0))) {
        break lexical_join_353;
    }
    life30_269 = 0x0.0p0f;
    life31_271 = life26_251;
    lexical_cycle_257: while (true) {
    if (!((__numericCompare1403_72(life31_271, life28_260) < 0))) {
        break lexical_join_353;
    }
    life33_281 = __call1403_73(0x1.0p0d, (life28_260 - life31_271));
    life35_286 = (((float) life33_281) * 0x1.0p-1f);
    __call1403_77(__call1403_76(__call1403_75(life6_8, __call1403_74(life7_12), 0x1.0p8d, life31_271), ((double) (life22_220 + life30_269)), ((double) (life22_220 + 0x0.0p0f))));
    __call1403_81(__call1403_80(__call1403_79(life6_8, __call1403_78(life7_12), 0x1.0p8d, (life31_271 + life33_281)), ((double) ((life22_220 + life35_286) + life30_269)), ((double) (life22_220 + 0x0.0p0f))));
    __call1403_85(__call1403_84(__call1403_83(life6_8, __call1403_82(life7_12), 0x0.0p0d, (life31_271 + life33_281)), ((double) ((life22_220 + life35_286) + life30_269)), ((double) (life22_220 + 0x1.0p7f))));
    __call1403_89(__call1403_88(__call1403_87(life6_8, __call1403_86(life7_12), 0x0.0p0d, life31_271), ((double) (life22_220 + life30_269)), ((double) (life22_220 + 0x1.0p7f))));
    life31_271 = (life31_271 + 0x1.0p0d);
    life30_269 = (life30_269 + 0x1.0p-1f);
    continue lexical_cycle_257;
    }
    }
    if (!((__numericCompare1403_91(life12_104, (__call1403_90(life7_12) + life8_24)) < 0))) {
        break lexical_join_460;
    }
    life30_376 = 0x0.0p0f;
    life31_378 = life26_251;
    lexical_cycle_364: while (true) {
    if (!((__numericCompare1403_92(life31_378, life28_260) < 0))) {
        break lexical_join_460;
    }
    life33_388 = __call1403_93(0x1.0p0d, (life28_260 - life31_378));
    life35_393 = (((float) life33_388) * 0x1.0p-1f);
    __call1403_97(__call1403_96(__call1403_95(life6_8, __call1403_94(life7_12), 0x1.0p8d, life31_378), ((double) (life22_220 + life30_376)), ((double) (life22_220 + 0x0.0p0f))));
    __call1403_101(__call1403_100(__call1403_99(life6_8, __call1403_98(life7_12), 0x1.0p8d, (life31_378 + life33_388)), ((double) ((life22_220 + life35_393) + life30_376)), ((double) (life22_220 + 0x0.0p0f))));
    __call1403_105(__call1403_104(__call1403_103(life6_8, __call1403_102(life7_12), 0x0.0p0d, (life31_378 + life33_388)), ((double) ((life22_220 + life35_393) + life30_376)), ((double) (life22_220 + 0x1.0p7f))));
    __call1403_109(__call1403_108(__call1403_107(life6_8, __call1403_106(life7_12), 0x0.0p0d, life31_378), ((double) (life22_220 + life30_376)), ((double) (life22_220 + 0x1.0p7f))));
    life31_378 = (life31_378 + 0x1.0p0d);
    life30_376 = (life30_376 + 0x1.0p-1f);
    continue lexical_cycle_364;
    }
    }
    life26_483 = __call1403_112(((double) __call1403_110((life12_104 - life8_24))), __call1403_111(life7_12));
    life28_492 = __call1403_115(((double) __call1403_113((life12_104 + life8_24))), __call1403_114(life7_12));
    if (!((__numericCompare1403_117(life16_128, (__call1403_116(life7_12) - life8_24)) > 0))) {
        break lexical_join_585;
    }
    life30_501 = 0x0.0p0f;
    life31_503 = life26_483;
    lexical_cycle_489: while (true) {
    if (!((__numericCompare1403_118(life31_503, life28_492) < 0))) {
        break lexical_join_585;
    }
    life33_513 = __call1403_119(0x1.0p0d, (life28_492 - life31_503));
    life35_518 = (((float) life33_513) * 0x1.0p-1f);
    __call1403_123(__call1403_122(__call1403_121(life6_8, life31_503, 0x1.0p8d, __call1403_120(life7_12)), ((double) (life22_220 + life30_501)), ((double) (life22_220 + 0x0.0p0f))));
    __call1403_127(__call1403_126(__call1403_125(life6_8, (life31_503 + life33_513), 0x1.0p8d, __call1403_124(life7_12)), ((double) ((life22_220 + life35_518) + life30_501)), ((double) (life22_220 + 0x0.0p0f))));
    __call1403_131(__call1403_130(__call1403_129(life6_8, (life31_503 + life33_513), 0x0.0p0d, __call1403_128(life7_12)), ((double) ((life22_220 + life35_518) + life30_501)), ((double) (life22_220 + 0x1.0p7f))));
    __call1403_135(__call1403_134(__call1403_133(life6_8, life31_503, 0x0.0p0d, __call1403_132(life7_12)), ((double) (life22_220 + life30_501)), ((double) (life22_220 + 0x1.0p7f))));
    life31_503 = (life31_503 + 0x1.0p0d);
    life30_501 = (life30_501 + 0x1.0p-1f);
    continue lexical_cycle_489;
    }
    }
    if (!((__numericCompare1403_137(life16_128, (__call1403_136(life7_12) + life8_24)) < 0))) {
        break lexical_join_692;
    }
    life30_608 = 0x0.0p0f;
    life31_610 = life26_483;
    lexical_cycle_596: while (true) {
    if (!((__numericCompare1403_138(life31_610, life28_492) < 0))) {
        break lexical_join_692;
    }
    life33_620 = __call1403_139(0x1.0p0d, (life28_492 - life31_610));
    life35_625 = (((float) life33_620) * 0x1.0p-1f);
    __call1403_143(__call1403_142(__call1403_141(life6_8, life31_610, 0x1.0p8d, __call1403_140(life7_12)), ((double) (life22_220 + life30_608)), ((double) (life22_220 + 0x0.0p0f))));
    __call1403_147(__call1403_146(__call1403_145(life6_8, (life31_610 + life33_620), 0x1.0p8d, __call1403_144(life7_12)), ((double) ((life22_220 + life35_625) + life30_608)), ((double) (life22_220 + 0x0.0p0f))));
    __call1403_151(__call1403_150(__call1403_149(life6_8, (life31_610 + life33_620), 0x0.0p0d, __call1403_148(life7_12)), ((double) ((life22_220 + life35_625) + life30_608)), ((double) (life22_220 + 0x1.0p7f))));
    __call1403_155(__call1403_154(__call1403_153(life6_8, life31_610, 0x0.0p0d, __call1403_152(life7_12)), ((double) (life22_220 + life30_608)), ((double) (life22_220 + 0x1.0p7f))));
    life31_610 = (life31_610 + 0x1.0p0d);
    life30_608 = (life30_608 + 0x1.0p-1f);
    continue lexical_cycle_596;
    }
    }
    __call1403_156(life5_5);
    spill1403_4 = 21947;
    __call1403_157(life6_8, 0x0.0p0d, 0x0.0p0d, 0x0.0p0d);
    spill1403_5 = (6244782865716261318L ^ life3_3);
    __call1403_158();
    __call1403_159();
    __call1403_160(0x0.0p0f, 0x0.0p0f);
    __call1403_161();
    __call1403_162();
    __call1403_165(__invokedynamic1403_163(spill1403_4, spill1403_5), __invokedynamic1403_164(7322, (4074972027946956969L ^ life3_3)), 1, 0);
    __call1403_166();
    __call1403_167();
    __call1403_168(1);
    if (!(__call1403_169())) {
        break lexical_join_726;
    }
    __call1403_170();
    }
    return;
}
public static void h1403_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1140300_0(p0);
}
public static void h1403_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1140301_0(p0);
}
public static void h1403_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1140302_0(p0);
}
public static void h1403_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1140303_0(p0);
}
public static void h1403_4(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1140304_0(p0);
}
public static void h1403_5(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1140305_0(p0);
}
private static native long __fieldRead1403_0() throws Throwable;
private static native net.minecraft.client.renderer.Tessellator __call1403_1() throws Throwable;
private static native moom.lw __call1403_2(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1403_3(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.world.border.WorldBorder __call1403_4(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1403_5(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1403_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead1403_7(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __invokedynamic1403_8(int a0, long a1) throws Throwable;
private static native double __fieldRead1403_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __call1403_10(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native int __numericCompare1403_11(double a0, double a1) throws Throwable;
private static native double __fieldRead1403_12(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __call1403_13(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native int __numericCompare1403_14(double a0, double a1) throws Throwable;
private static native double __fieldRead1403_15(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __call1403_16(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native int __numericCompare1403_17(double a0, double a1) throws Throwable;
private static native double __fieldRead1403_18(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __call1403_19(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native int __numericCompare1403_20(double a0, double a1) throws Throwable;
private static native boolean __call1403_21() throws Throwable;
private static native void __call1403_22() throws Throwable;
private static native moom.MB __fieldRead1403_23() throws Throwable;
private static native void __call1403_24(moom.MB a0) throws Throwable;
private static native double __call1403_25(net.minecraft.world.border.WorldBorder a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native double __call1403_26(double a0, double a1) throws Throwable;
private static native double __fieldRead1403_27(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1403_28(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1403_29(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1403_30(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1403_31(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1403_32(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1403_33(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1403_34(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1403_35(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call1403_36() throws Throwable;
private static native int __invokedynamic1403_37(int a0, long a1) throws Throwable;
private static native void __call1403_38(int a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __fieldRead1403_39(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.DD __fieldRead1403_40() throws Throwable;
private static native void __call1403_41(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native void __call1403_42(int a0) throws Throwable;
private static native void __call1403_43() throws Throwable;
private static native net.minecraft.world.border.EnumBorderStatus __call1403_44(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native int __call1403_45(net.minecraft.world.border.EnumBorderStatus a0) throws Throwable;
private static native int __invokedynamic1403_46(int a0, long a1) throws Throwable;
private static native int __invokedynamic1403_47(int a0, long a1) throws Throwable;
private static native int __invokedynamic1403_48(int a0, long a1) throws Throwable;
private static native int __invokedynamic1403_49(int a0, long a1) throws Throwable;
private static native int __invokedynamic1403_50(int a0, long a1) throws Throwable;
private static native void __call1403_51(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call1403_52(float a0, float a1) throws Throwable;
private static native void __call1403_53() throws Throwable;
private static native int __invokedynamic1403_54(int a0, long a1) throws Throwable;
private static native void __call1403_55(int a0, float a1) throws Throwable;
private static native void __call1403_56() throws Throwable;
private static native void __call1403_57() throws Throwable;
private static native long __call1403_58() throws Throwable;
private static native long __invokedynamic1403_59(int a0, long a1) throws Throwable;
private static native int __invokedynamic1403_60(int a0, long a1) throws Throwable;
private static native moom.oD __fieldRead1403_61() throws Throwable;
private static native void __call1403_62(moom.lw a0, int a1, moom.oD a2) throws Throwable;
private static native void __call1403_63(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __call1403_64(double a0) throws Throwable;
private static native double __call1403_65(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native double __call1403_66(double a0, double a1) throws Throwable;
private static native int __call1403_67(double a0) throws Throwable;
private static native double __call1403_68(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native double __call1403_69(double a0, double a1) throws Throwable;
private static native double __call1403_70(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native int __numericCompare1403_71(double a0, double a1) throws Throwable;
private static native int __numericCompare1403_72(double a0, double a1) throws Throwable;
private static native double __call1403_73(double a0, double a1) throws Throwable;
private static native double __call1403_74(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native moom.lw __call1403_75(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call1403_76(moom.lw a0, double a1, double a2) throws Throwable;
private static native void __call1403_77(moom.lw a0) throws Throwable;
private static native double __call1403_78(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native moom.lw __call1403_79(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call1403_80(moom.lw a0, double a1, double a2) throws Throwable;
private static native void __call1403_81(moom.lw a0) throws Throwable;
private static native double __call1403_82(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native moom.lw __call1403_83(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call1403_84(moom.lw a0, double a1, double a2) throws Throwable;
private static native void __call1403_85(moom.lw a0) throws Throwable;
private static native double __call1403_86(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native moom.lw __call1403_87(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call1403_88(moom.lw a0, double a1, double a2) throws Throwable;
private static native void __call1403_89(moom.lw a0) throws Throwable;
private static native double __call1403_90(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native int __numericCompare1403_91(double a0, double a1) throws Throwable;
private static native int __numericCompare1403_92(double a0, double a1) throws Throwable;
private static native double __call1403_93(double a0, double a1) throws Throwable;
private static native double __call1403_94(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native moom.lw __call1403_95(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call1403_96(moom.lw a0, double a1, double a2) throws Throwable;
private static native void __call1403_97(moom.lw a0) throws Throwable;
private static native double __call1403_98(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native moom.lw __call1403_99(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call1403_100(moom.lw a0, double a1, double a2) throws Throwable;
private static native void __call1403_101(moom.lw a0) throws Throwable;
private static native double __call1403_102(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native moom.lw __call1403_103(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call1403_104(moom.lw a0, double a1, double a2) throws Throwable;
private static native void __call1403_105(moom.lw a0) throws Throwable;
private static native double __call1403_106(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native moom.lw __call1403_107(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call1403_108(moom.lw a0, double a1, double a2) throws Throwable;
private static native void __call1403_109(moom.lw a0) throws Throwable;
private static native int __call1403_110(double a0) throws Throwable;
private static native double __call1403_111(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native double __call1403_112(double a0, double a1) throws Throwable;
private static native int __call1403_113(double a0) throws Throwable;
private static native double __call1403_114(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native double __call1403_115(double a0, double a1) throws Throwable;
private static native double __call1403_116(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native int __numericCompare1403_117(double a0, double a1) throws Throwable;
private static native int __numericCompare1403_118(double a0, double a1) throws Throwable;
private static native double __call1403_119(double a0, double a1) throws Throwable;
private static native double __call1403_120(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native moom.lw __call1403_121(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call1403_122(moom.lw a0, double a1, double a2) throws Throwable;
private static native void __call1403_123(moom.lw a0) throws Throwable;
private static native double __call1403_124(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native moom.lw __call1403_125(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call1403_126(moom.lw a0, double a1, double a2) throws Throwable;
private static native void __call1403_127(moom.lw a0) throws Throwable;
private static native double __call1403_128(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native moom.lw __call1403_129(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call1403_130(moom.lw a0, double a1, double a2) throws Throwable;
private static native void __call1403_131(moom.lw a0) throws Throwable;
private static native double __call1403_132(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native moom.lw __call1403_133(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call1403_134(moom.lw a0, double a1, double a2) throws Throwable;
private static native void __call1403_135(moom.lw a0) throws Throwable;
private static native double __call1403_136(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native int __numericCompare1403_137(double a0, double a1) throws Throwable;
private static native int __numericCompare1403_138(double a0, double a1) throws Throwable;
private static native double __call1403_139(double a0, double a1) throws Throwable;
private static native double __call1403_140(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native moom.lw __call1403_141(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call1403_142(moom.lw a0, double a1, double a2) throws Throwable;
private static native void __call1403_143(moom.lw a0) throws Throwable;
private static native double __call1403_144(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native moom.lw __call1403_145(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call1403_146(moom.lw a0, double a1, double a2) throws Throwable;
private static native void __call1403_147(moom.lw a0) throws Throwable;
private static native double __call1403_148(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native moom.lw __call1403_149(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call1403_150(moom.lw a0, double a1, double a2) throws Throwable;
private static native void __call1403_151(moom.lw a0) throws Throwable;
private static native double __call1403_152(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native moom.lw __call1403_153(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call1403_154(moom.lw a0, double a1, double a2) throws Throwable;
private static native void __call1403_155(moom.lw a0) throws Throwable;
private static native void __call1403_156(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native void __call1403_157(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native void __call1403_158() throws Throwable;
private static native void __call1403_159() throws Throwable;
private static native void __call1403_160(float a0, float a1) throws Throwable;
private static native void __call1403_161() throws Throwable;
private static native void __call1403_162() throws Throwable;
private static native int __invokedynamic1403_163(int a0, long a1) throws Throwable;
private static native int __invokedynamic1403_164(int a0, long a1) throws Throwable;
private static native void __call1403_165(int a0, int a1, int a2, int a3) throws Throwable;
private static native void __call1403_166() throws Throwable;
private static native void __call1403_167() throws Throwable;
private static native void __call1403_168(int a0) throws Throwable;
private static native boolean __call1403_169() throws Throwable;
private static native void __call1403_170() throws Throwable;
private static native java.lang.Throwable __call1140300_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1140301_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1140302_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1140303_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1140304_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1140305_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_84cb402424982b39e07c(net.minecraft.client.renderer.RenderGlobal a0, net.minecraft.entity.Entity a1, net.minecraft.client.renderer.culling.ICamera a2, float a3) throws E;
private static final class __SourceHandler_84cb402424982b39e07c {

public static void f600(net.minecraft.client.renderer.RenderGlobal receiver, net.minecraft.entity.Entity p0, net.minecraft.client.renderer.culling.ICamera p1, float p2) throws Throwable {
    int forestValue600_275_0;
    int forestValue600_302_0;
    int forestValue600_385_0;
    int forestValue600_447_0;
    int forestValue600_465_0;
    int forestValue600_728_0;
    int spill600_0;
    long spill600_1;
    long life4_3;
    int life6_5;
    double life7_31;
    double life9_43;
    double life11_55;
    net.minecraft.entity.Entity life13_115;
    double life14_127;
    double life16_139;
    double life18_151;
    java.util.List life20_176;
    int life21_195;
    net.minecraft.entity.Entity life22_208;
    java.util.Iterator life21_259;
    net.minecraft.entity.Entity life22_266;
    int life23_282;
    int life24_313;
    int life21_375;
    int life22_385;
    int life23_402;
    java.util.Iterator life24_406;
    moom.ls life25_413;
    net.minecraft.world.chunk.Chunk life26_417;
    net.minecraft.util.ClassInheritanceMultiMap life27_431;
    java.util.Iterator life28_437;
    net.minecraft.entity.Entity life29_445;
    int life30_465;
    int life31_484;
    java.util.Iterator life24_596;
    moom.ls life25_603;
    java.util.List life26_608;
    java.util.Iterator life27_614;
    net.minecraft.tileentity.TileEntity life28_622;
    moom.CA life29_625;
    java.util.Set life24_657;
    java.util.Iterator life25_662;
    net.minecraft.tileentity.TileEntity life26_669;
    java.util.Iterator life24_693;
    moom.kU life25_700;
    moom.DT life26_703;
    net.minecraft.tileentity.TileEntity life27_708;
    net.minecraft.tileentity.TileEntityChest life28_714;
    net.minecraft.block.Block life28_745;
    int life29_767;
    forest_join_762: {
    forest_join_750: {
    forest_join_742: {
    forest_join_647: {
    forest_join_621: {
    forest_join_555: {
    forest_join_546: {
    forest_join_385: {
    forest_join_384: {
    forest_join_364: {
    forest_join_354: {
    forest_join_324: {
    forest_join_224: {
    forest_join_189: {
    forest_join_181: {
    forest_join_110: {
    forest_join_19: {
    forest_join_12: {
    life4_3 = (__fieldRead600_0() ^ 21203526756462L);
    life6_5 = 0;
    if (!((__fieldRead600_1(receiver) > 0))) {
        break forest_join_19;
    }
    if (!((life6_5 > 0))) {
        break forest_join_12;
    }
    return;
    }
    net.minecraft.client.renderer.RenderGlobal __stackOp600_2_0 = receiver;
    __fieldWrite600_4(__stackOp600_2_0, (__fieldRead600_3(__stackOp600_2_0) - 1));
    break forest_join_762;
    }
    life7_31 = (__fieldRead600_5(p0) + ((__fieldRead600_6(p0) - __fieldRead600_7(p0)) * ((double) p2)));
    life9_43 = (__fieldRead600_8(p0) + ((__fieldRead600_9(p0) - __fieldRead600_10(p0)) * ((double) p2)));
    life11_55 = (__fieldRead600_11(p0) + ((__fieldRead600_12(p0) - __fieldRead600_13(p0)) * ((double) p2)));
    __call600_16(__fieldRead600_15(__fieldRead600_14(receiver)), "prepare");
    __call600_25(__fieldRead600_17(), __fieldRead600_18(receiver), __call600_20(__fieldRead600_19(receiver)), __fieldRead600_22(__fieldRead600_21(receiver)), __call600_24(__fieldRead600_23(receiver)), p2);
    __call600_36(__fieldRead600_26(receiver), __fieldRead600_27(receiver), __fieldRead600_29(__fieldRead600_28(receiver)), __call600_31(__fieldRead600_30(receiver)), __fieldRead600_33(__fieldRead600_32(receiver)), __fieldRead600_35(__fieldRead600_34(receiver)), p2);
    __fieldWrite600_38((__fieldRead600_37() + 1));
    if (!((life6_5 == 0))) {
        break forest_join_110;
    }
    __fieldWrite600_39(receiver, 0);
    __fieldWrite600_40(receiver, 0);
    __fieldWrite600_41(receiver, 0);
    __fieldWrite600_42(receiver, 0);
    }
    life13_115 = __call600_44(__fieldRead600_43(receiver));
    life14_127 = (__fieldRead600_45(life13_115) + ((__fieldRead600_46(life13_115) - __fieldRead600_47(life13_115)) * ((double) p2)));
    life16_139 = (__fieldRead600_48(life13_115) + ((__fieldRead600_49(life13_115) - __fieldRead600_50(life13_115)) * ((double) p2)));
    life18_151 = (__fieldRead600_51(life13_115) + ((__fieldRead600_52(life13_115) - __fieldRead600_53(life13_115)) * ((double) p2)));
    __fieldWrite600_54(life14_127);
    __fieldWrite600_55(life16_139);
    __fieldWrite600_56(life18_151);
    __call600_58(__fieldRead600_57(receiver), life14_127, life16_139, life18_151);
    __call600_61(__fieldRead600_60(__fieldRead600_59(receiver)));
    __call600_64(__fieldRead600_63(__fieldRead600_62(receiver)), "global");
    life20_176 = __call600_66(__fieldRead600_65(receiver));
    if (!((life6_5 == 0))) {
        break forest_join_181;
    }
    __fieldWrite600_68(receiver, __call600_67(life20_176));
    }
    if (!(__call600_69())) {
        break forest_join_189;
    }
    if (!(__fieldRead600_72(__fieldRead600_71(__fieldRead600_70(receiver))))) {
        break forest_join_189;
    }
    __call600_73();
    }
    life21_195 = 0;
    forest_cycle_191: while (true) {
    forest_join_222: {
    if (!((life21_195 < __call600_76(__fieldRead600_75(__fieldRead600_74(receiver)))))) {
        break forest_join_224;
    }
    life22_208 = __cast600_80(__call600_79(__fieldRead600_78(__fieldRead600_77(receiver)), life21_195));
    net.minecraft.client.renderer.RenderGlobal __stackOp600_81_0 = receiver;
    __fieldWrite600_83(__stackOp600_81_0, (__fieldRead600_82(__stackOp600_81_0) + 1));
    if (!(__call600_84(life22_208, life7_31, life9_43, life11_55))) {
        break forest_join_222;
    }
    __call600_86(__fieldRead600_85(receiver), life22_208, p2);
    }
    life21_195 += 1;
    continue forest_cycle_191;
    }
    }
    if (!(__call600_87(receiver))) {
        break forest_join_354;
    }
    __call600_89(__invokedynamic600_88(32697, (8553080190348658306L ^ life4_3)));
    __call600_90();
    __call600_92(__fieldRead600_91(receiver));
    __call600_94(__fieldRead600_93(receiver), 0);
    __call600_97(__fieldRead600_96(__fieldRead600_95(receiver)), "entityOutlines");
    __call600_98();
    __call600_100(__fieldRead600_99(receiver), 1);
    life21_259 = __call600_101(life20_176);
    forest_cycle_254: while (true) {
    forest_join_323: {
    forest_join_315: {
    forest_join_302: {
    forest_join_301: {
    forest_join_296: {
    forest_join_275: {
    forest_join_274: {
    if (!(__call600_102(life21_259))) {
        break forest_join_324;
    }
    life22_266 = __cast600_104(__call600_103(life21_259));
    if (!((__instanceOf600_107(__call600_106(__fieldRead600_105(receiver))) != 0))) {
        break forest_join_274;
    }
    if (!(__call600_111(__cast600_110(__call600_109(__fieldRead600_108(receiver)))))) {
        break forest_join_274;
    }
    forestValue600_275_0 = 1;
    break forest_join_275;
    }
    forestValue600_275_0 = 0;
    }
    life23_282 = forestValue600_275_0;
    if (!(__call600_112(life22_266, life7_31, life9_43, life11_55))) {
        break forest_join_301;
    }
    if (!((!__fieldRead600_113(life22_266)))) {
        break forest_join_296;
    }
    if (!((!__call600_115(p1, __call600_114(life22_266))))) {
        break forest_join_296;
    }
    if (!((__fieldRead600_116(life22_266) == __fieldRead600_118(__fieldRead600_117(receiver))))) {
        break forest_join_301;
    }
    }
    if (!((__instanceOf600_119(life22_266) != 0))) {
        break forest_join_301;
    }
    forestValue600_302_0 = 1;
    break forest_join_302;
    }
    forestValue600_302_0 = 0;
    }
    life24_313 = forestValue600_302_0;
    if (!((life22_266 == __call600_121(__fieldRead600_120(receiver))))) {
        break forest_join_315;
    }
    if (!((__fieldRead600_124(__fieldRead600_123(__fieldRead600_122(receiver))) == 0))) {
        break forest_join_315;
    }
    if (!((life23_282 != 0))) {
        break forest_join_323;
    }
    }
    if (!((life24_313 != 0))) {
        break forest_join_323;
    }
    __call600_126(__fieldRead600_125(receiver), life22_266, p2);
    }
    continue forest_cycle_254;
    }
    }
    __call600_128(__fieldRead600_127(receiver), 0);
    spill600_0 = 18837;
    __call600_129();
    spill600_1 = (5343690742134190285L ^ life4_3);
    __call600_130(0);
    __call600_132(__fieldRead600_131(receiver), p2);
    __call600_133();
    __call600_134(1);
    __call600_137(__call600_136(__fieldRead600_135(receiver)), 0);
    __call600_138();
    __call600_139();
    __call600_140();
    __call600_142(__invokedynamic600_141(spill600_0, spill600_1));
    __call600_143();
    __call600_144();
    }
    __call600_147(__fieldRead600_146(__fieldRead600_145(receiver)), "entities");
    life21_375 = __integerCategory600_149(__call600_148());
    if (!((life21_375 != 0))) {
        break forest_join_364;
    }
    __call600_150();
    }
    __call600_151();
    life22_385 = __integerCategory600_155(__fieldRead600_154(__fieldRead600_153(__fieldRead600_152(receiver))));
    __fieldWrite600_159(__fieldRead600_157(__fieldRead600_156(receiver)), __call600_158());
    if (!(__fieldRead600_160())) {
        break forest_join_384;
    }
    if (!((!__call600_163(__fieldRead600_162(__fieldRead600_161(receiver)))))) {
        break forest_join_384;
    }
    forestValue600_385_0 = 1;
    break forest_join_385;
    }
    forestValue600_385_0 = 0;
    }
    life23_402 = forestValue600_385_0;
    life24_406 = __call600_165(__fieldRead600_164(receiver));
    forest_cycle_390: while (true) {
    forest_join_545: {
    forest_join_544: {
    if (!(__call600_166(life24_406))) {
        break forest_join_546;
    }
    life25_413 = __cast600_168(__call600_167(life24_406));
    life26_417 = __call600_170(__fieldRead600_169(life25_413));
    life27_431 = (__call600_171(life26_417))[(__call600_174(__call600_173(__fieldRead600_172(life25_413))) / __invokedynamic600_175(2671, (6021885414301299555L ^ life4_3)))];
    if (!((!__call600_176(life27_431)))) {
        break forest_join_545;
    }
    life28_437 = __call600_177(life27_431);
    forest_cycle_421: while (true) {
    forest_join_543: {
    forest_join_534: {
    forest_join_522: {
    forest_join_521: {
    forest_join_511: {
    forest_join_498: {
    forest_join_480: {
    forest_join_465: {
    forest_join_464: {
    forest_join_451: {
    forest_join_447: {
    forest_join_446: {
    forest_join_444: {
    forest_join_425: {
    if (!((!__call600_178(life28_437)))) {
        break forest_join_425;
    }
    break forest_join_544;
    }
    life29_445 = __cast600_180(__call600_179(life28_437));
    if (!((!__call600_182(__fieldRead600_181(receiver), life29_445, p1, life7_31, life9_43, life11_55)))) {
        break forest_join_444;
    }
    if (!((__fieldRead600_183(life29_445) == __fieldRead600_185(__fieldRead600_184(receiver))))) {
        break forest_join_446;
    }
    }
    forestValue600_447_0 = 1;
    break forest_join_447;
    }
    forestValue600_447_0 = 0;
    }
    life30_465 = forestValue600_447_0;
    if (!((life30_465 == 0))) {
        break forest_join_451;
    }
    break forest_join_522;
    }
    if (!((__instanceOf600_188(__call600_187(__fieldRead600_186(receiver))) != 0))) {
        break forest_join_464;
    }
    if (!(__call600_192(__cast600_191(__call600_190(__fieldRead600_189(receiver)))))) {
        break forest_join_464;
    }
    forestValue600_465_0 = 1;
    break forest_join_465;
    }
    forestValue600_465_0 = 0;
    }
    life31_484 = forestValue600_465_0;
    if (!((life29_445 == __call600_194(__fieldRead600_193(receiver))))) {
        break forest_join_480;
    }
    if (!((life23_402 == 0))) {
        break forest_join_480;
    }
    if (!((__fieldRead600_197(__fieldRead600_196(__fieldRead600_195(receiver))) == 0))) {
        break forest_join_480;
    }
    if (!((life31_484 != 0))) {
        break forest_join_521;
    }
    }
    if (!((__numericCompare600_199(__fieldRead600_198(life29_445), 0x0.0p0d) >= 0))) {
        break forest_join_498;
    }
    if (!((__numericCompare600_201(__fieldRead600_200(life29_445), 0x1.0p8d) < 0))) {
        break forest_join_498;
    }
    if (!(__call600_203(__fieldRead600_202(receiver), new moom.DT(life29_445)))) {
        break forest_join_521;
    }
    }
    net.minecraft.client.renderer.RenderGlobal __stackOp600_204_0 = receiver;
    __fieldWrite600_206(__stackOp600_204_0, (__fieldRead600_205(__stackOp600_204_0) + 1));
    __fieldWrite600_207(receiver, life29_445);
    if (!((life21_375 != 0))) {
        break forest_join_511;
    }
    __call600_208(life29_445);
    }
    __call600_210(__fieldRead600_209(receiver), life29_445, p2);
    __fieldWrite600_211(receiver, null);
    break forest_join_522;
    }
    continue forest_cycle_421;
    }
    if (!((life30_465 == 0))) {
        break forest_join_543;
    }
    if (!((__instanceOf600_212(life29_445) != 0))) {
        break forest_join_543;
    }
    __fieldWrite600_213(receiver, life29_445);
    if (!((life21_375 != 0))) {
        break forest_join_534;
    }
    __call600_214(life29_445);
    }
    __call600_217(__call600_216(__fieldRead600_215(receiver)), life29_445, p2);
    __fieldWrite600_218(receiver, null);
    }
    continue forest_cycle_421;
    }
    }
    continue forest_cycle_390;
    }
    continue forest_cycle_390;
    }
    }
    __fieldWrite600_221(__fieldRead600_220(__fieldRead600_219(receiver)), life22_385);
    if (!((life21_375 != 0))) {
        break forest_join_555;
    }
    __call600_222();
    __call600_223();
    }
    __call600_226(__fieldRead600_225(__fieldRead600_224(receiver)), "blockentities");
    __call600_227();
    __call600_228();
    life24_596 = __call600_230(__fieldRead600_229(receiver));
    forest_cycle_566: while (true) {
    forest_join_620: {
    forest_join_619: {
    if (!(__call600_231(life24_596))) {
        break forest_join_621;
    }
    life25_603 = __cast600_233(__call600_232(life24_596));
    life26_608 = __call600_236(__call600_235(__fieldRead600_234(life25_603)));
    if (!((!__call600_237(life26_608)))) {
        break forest_join_620;
    }
    life27_614 = __call600_238(life26_608);
    forest_cycle_584: while (true) {
    forest_join_607: {
    forest_join_603: {
    forest_join_602: {
    forest_join_588: {
    if (!((!__call600_239(life27_614)))) {
        break forest_join_588;
    }
    break forest_join_619;
    }
    life28_622 = __cast600_241(__call600_240(life27_614));
    life29_625 = __call600_242(life28_622);
    if (!((life29_625 != null))) {
        break forest_join_603;
    }
    if (!(__call600_243(p1, life29_625))) {
        break forest_join_602;
    }
    break forest_join_603;
    }
    continue forest_cycle_584;
    }
    if (!((life21_375 != 0))) {
        break forest_join_607;
    }
    __call600_244(life28_622);
    }
    __call600_246(__fieldRead600_245(), life28_622, p2, -1);
    net.minecraft.client.renderer.RenderGlobal __stackOp600_247_0 = receiver;
    __fieldWrite600_249(__stackOp600_247_0, (__fieldRead600_248(__stackOp600_247_0) + 1));
    continue forest_cycle_584;
    }
    }
    continue forest_cycle_566;
    }
    continue forest_cycle_566;
    }
    }
    __monitorEnter600_251((life24_657 = __fieldRead600_250(receiver)));
    life25_662 = __call600_253(__fieldRead600_252(receiver));
    forest_cycle_630: while (true) {
    forest_join_641: {
    if (!(__call600_254(life25_662))) {
        break forest_join_647;
    }
    life26_669 = __cast600_256(__call600_255(life25_662));
    if (!((life21_375 != 0))) {
        break forest_join_641;
    }
    __call600_257(life26_669);
    }
    __call600_259(__fieldRead600_258(), life26_669, p2, -1);
    continue forest_cycle_630;
    }
    }
    __monitorExit600_260(life24_657);
    __fieldWrite600_261(receiver, 1);
    __call600_262(receiver);
    life24_693 = __call600_265(__call600_264(__fieldRead600_263(receiver)));
    forest_cycle_659: while (true) {
    forest_join_741: {
    forest_join_735: {
    forest_join_728: {
    forest_join_727: {
    forest_join_725: {
    forest_join_705: {
    forest_join_693: {
    if (!(__call600_266(life24_693))) {
        break forest_join_742;
    }
    life25_700 = __cast600_268(__call600_267(life24_693));
    life26_703 = __call600_269(life25_700);
    life27_708 = __call600_271(__fieldRead600_270(receiver), life26_703);
    if (!((__instanceOf600_272(life27_708) != 0))) {
        break forest_join_705;
    }
    life28_714 = __cast600_273(life27_708);
    if (!((__fieldRead600_274(life28_714) != null))) {
        break forest_join_693;
    }
    life26_703 = __call600_276(life26_703, __fieldRead600_275());
    life27_708 = __call600_278(__fieldRead600_277(receiver), life26_703);
    break forest_join_705;
    }
    if (!((__fieldRead600_279(life28_714) != null))) {
        break forest_join_705;
    }
    life26_703 = __call600_281(life26_703, __fieldRead600_280());
    life27_708 = __call600_283(__fieldRead600_282(receiver), life26_703);
    }
    life28_745 = __call600_286(__call600_285(__fieldRead600_284(receiver), life26_703));
    if (!((life27_708 != null))) {
        break forest_join_727;
    }
    if (!((__instanceOf600_287(life28_745) == 0))) {
        break forest_join_725;
    }
    if (!((__instanceOf600_288(life28_745) == 0))) {
        break forest_join_725;
    }
    if (!((__instanceOf600_289(life28_745) == 0))) {
        break forest_join_725;
    }
    if (!((__instanceOf600_290(life28_745) != 0))) {
        break forest_join_727;
    }
    }
    forestValue600_728_0 = 1;
    break forest_join_728;
    }
    forestValue600_728_0 = 0;
    }
    life29_767 = forestValue600_728_0;
    if (!((life29_767 != 0))) {
        break forest_join_741;
    }
    if (!((life21_375 != 0))) {
        break forest_join_735;
    }
    __call600_291(life27_708);
    }
    __call600_294(__fieldRead600_292(), life27_708, p2, __call600_293(life25_700));
    }
    continue forest_cycle_659;
    }
    }
    __call600_295(receiver);
    __fieldWrite600_296(receiver, 0);
    if (!((life21_375 != 0))) {
        break forest_join_750;
    }
    __call600_297();
    }
    __fieldWrite600_299((__fieldRead600_298() - 1));
    __call600_302(__fieldRead600_301(__fieldRead600_300(receiver)));
    __call600_305(__fieldRead600_304(__fieldRead600_303(receiver)));
    }
    return;
}
public static void h600_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060000_0(p0);
}
public static void h600_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060001_0(p0);
}
public static void h600_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060002_0(p0);
}
public static void h600_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060003_0(p0);
}
public static void h600_4(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060004_0(p0);
}
public static void h600_5(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060005_0(p0);
}
public static void h600_6(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060006_0(p0);
}
public static void h600_7(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060007_0(p0);
}
public static void h600_8(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060008_0(p0);
}
public static void h600_9(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060009_0(p0);
}
public static void h600_10(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060010_0(p0);
}
public static void h600_11(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060011_0(p0);
}
public static void h600_12(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060012_0(p0);
}
public static void h600_13(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060013_0(p0);
}
public static void h600_14(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060014_0(p0);
}
public static void h600_15(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060015_0(p0);
}
public static void h600_16(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060016_0(p0);
}
public static void h600_17(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060017_0(p0);
}
public static void h600_18(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060018_0(p0);
}
public static void h600_19(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060019_0(p0);
}
public static void h600_20(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060020_0(p0);
}
public static void h600_21(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060021_0(p0);
}
public static void h600_22(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060022_0(p0);
}
public static void h600_23(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060023_0(p0);
}
public static void h600_24(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060024_0(p0);
}
public static void h600_25(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060025_0(p0);
}
public static void h600_26(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060026_0(p0);
}
public static void h600_27(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060027_0(p0);
}
public static void h600_28(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060028_0(p0);
}
public static void h600_29(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060029_0(p0);
}
public static void h600_30(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060030_0(p0);
}
public static void h600_31(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060031_0(p0);
}
public static void h600_32(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060032_0(p0);
}
public static void h600_33(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060033_0(p0);
}
public static void h600_34(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060034_0(p0);
}
public static void h600_35(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060035_0(p0);
}
public static void h600_36(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060036_0(p0);
}
public static void h600_37(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060037_0(p0);
}
public static void h600_38(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060038_0(p0);
}
public static void h600_39(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060039_0(p0);
}
public static void h600_40(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060040_0(p0);
}
public static void h600_41(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060041_0(p0);
}
public static void h600_42(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060042_0(p0);
}
public static void h600_43(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060043_0(p0);
}
public static void h600_44(java.lang.Throwable p0, java.util.Set p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3060044_0(p1);
    throw life2_2;
}
public static void h600_45(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060045_0(p0);
}
public static void h600_46(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060046_0(p0);
}
public static void h600_47(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060047_0(p0);
}
public static void h600_48(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060048_0(p0);
}
public static void h600_49(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060049_0(p0);
}
public static void h600_50(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060050_0(p0);
}
public static void h600_51(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060051_0(p0);
}
public static void h600_52(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060052_0(p0);
}
private static native long __fieldRead600_0() throws Throwable;
private static native int __fieldRead600_1(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __fieldRead600_3(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __fieldWrite600_4(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native double __fieldRead600_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead600_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead600_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead600_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead600_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead600_10(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead600_11(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead600_12(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead600_13(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead600_14(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.A9 __fieldRead600_15(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native void __call600_16(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native moom.oo __fieldRead600_17() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead600_18(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead600_19(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call600_20(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead600_21(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead600_22(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead600_23(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call600_24(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call600_25(moom.oo a0, net.minecraft.client.multiplayer.WorldClient a1, net.minecraft.client.renderer.texture.TextureManager a2, net.minecraft.client.gui.FontRenderer a3, net.minecraft.entity.Entity a4, float a5) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __fieldRead600_26(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead600_27(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead600_28(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead600_29(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead600_30(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call600_31(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead600_32(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead600_33(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead600_34(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead600_35(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call600_36(net.minecraft.client.renderer.entity.RenderManager a0, net.minecraft.client.multiplayer.WorldClient a1, net.minecraft.client.gui.FontRenderer a2, net.minecraft.entity.Entity a3, net.minecraft.entity.Entity a4, net.minecraft.client.settings.GameSettings a5, float a6) throws Throwable;
private static native int __fieldRead600_37() throws Throwable;
private static native void __fieldWrite600_38(int a0) throws Throwable;
private static native void __fieldWrite600_39(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native void __fieldWrite600_40(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native void __fieldWrite600_41(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native void __fieldWrite600_42(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead600_43(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call600_44(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead600_45(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead600_46(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead600_47(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead600_48(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead600_49(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead600_50(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead600_51(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead600_52(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead600_53(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite600_54(double a0) throws Throwable;
private static native void __fieldWrite600_55(double a0) throws Throwable;
private static native void __fieldWrite600_56(double a0) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __fieldRead600_57(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call600_58(net.minecraft.client.renderer.entity.RenderManager a0, double a1, double a2, double a3) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead600_59(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.renderer.EntityRenderer __fieldRead600_60(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call600_61(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead600_62(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.A9 __fieldRead600_63(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native void __call600_64(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead600_65(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.util.List __call600_66(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native int __call600_67(java.util.List a0) throws Throwable;
private static native void __fieldWrite600_68(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native boolean __call600_69() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead600_70(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.renderer.EntityRenderer __fieldRead600_71(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead600_72(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call600_73() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead600_74(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.util.List __fieldRead600_75(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native int __call600_76(java.util.List a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead600_77(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.util.List __fieldRead600_78(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native java.lang.Object __call600_79(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.entity.Entity __cast600_80(java.lang.Object a0) throws Throwable;
private static native int __fieldRead600_82(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __fieldWrite600_83(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native boolean __call600_84(net.minecraft.entity.Entity a0, double a1, double a2, double a3) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __fieldRead600_85(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call600_86(net.minecraft.client.renderer.entity.RenderManager a0, net.minecraft.entity.Entity a1, float a2) throws Throwable;
private static native boolean __call600_87(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __invokedynamic600_88(int a0, long a1) throws Throwable;
private static native void __call600_89(int a0) throws Throwable;
private static native void __call600_90() throws Throwable;
private static native net.minecraft.client.shader.Framebuffer __fieldRead600_91(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call600_92(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native net.minecraft.client.shader.Framebuffer __fieldRead600_93(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call600_94(net.minecraft.client.shader.Framebuffer a0, int a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead600_95(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.A9 __fieldRead600_96(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native void __call600_97(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native void __call600_98() throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __fieldRead600_99(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call600_100(net.minecraft.client.renderer.entity.RenderManager a0, int a1) throws Throwable;
private static native java.util.Iterator __call600_101(java.util.List a0) throws Throwable;
private static native boolean __call600_102(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call600_103(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.Entity __cast600_104(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead600_105(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call600_106(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __instanceOf600_107(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead600_108(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call600_109(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __cast600_110(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call600_111(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native boolean __call600_112(net.minecraft.entity.Entity a0, double a1, double a2, double a3) throws Throwable;
private static native boolean __fieldRead600_113(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call600_114(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call600_115(net.minecraft.client.renderer.culling.ICamera a0, moom.CA a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead600_116(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead600_117(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead600_118(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __instanceOf600_119(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead600_120(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call600_121(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead600_122(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead600_123(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead600_124(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __fieldRead600_125(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call600_126(net.minecraft.client.renderer.entity.RenderManager a0, net.minecraft.entity.Entity a1, float a2) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __fieldRead600_127(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call600_128(net.minecraft.client.renderer.entity.RenderManager a0, int a1) throws Throwable;
private static native void __call600_129() throws Throwable;
private static native void __call600_130(int a0) throws Throwable;
private static native net.minecraft.client.shader.ShaderGroup __fieldRead600_131(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call600_132(net.minecraft.client.shader.ShaderGroup a0, float a1) throws Throwable;
private static native void __call600_133() throws Throwable;
private static native void __call600_134(int a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead600_135(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.shader.Framebuffer __call600_136(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call600_137(net.minecraft.client.shader.Framebuffer a0, int a1) throws Throwable;
private static native void __call600_138() throws Throwable;
private static native void __call600_139() throws Throwable;
private static native void __call600_140() throws Throwable;
private static native int __invokedynamic600_141(int a0, long a1) throws Throwable;
private static native void __call600_142(int a0) throws Throwable;
private static native void __call600_143() throws Throwable;
private static native void __call600_144() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead600_145(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.A9 __fieldRead600_146(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native void __call600_147(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native boolean __call600_148() throws Throwable;
private static native int __integerCategory600_149(boolean value) throws Throwable;
private static native void __call600_150() throws Throwable;
private static native void __call600_151() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead600_152(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead600_153(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead600_154(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __integerCategory600_155(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead600_156(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead600_157(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call600_158() throws Throwable;
private static native void __fieldWrite600_159(net.minecraft.client.settings.GameSettings a0, boolean a1) throws Throwable;
private static native boolean __fieldRead600_160() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead600_161(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead600_162(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call600_163(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native java.util.List __fieldRead600_164(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.util.Iterator __call600_165(java.util.List a0) throws Throwable;
private static native boolean __call600_166(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call600_167(java.util.Iterator a0) throws Throwable;
private static native moom.ls __cast600_168(java.lang.Object a0) throws Throwable;
private static native moom.mp __fieldRead600_169(moom.ls a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call600_170(moom.mp a0) throws Throwable;
private static native net.minecraft.util.ClassInheritanceMultiMap[] __call600_171(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.mp __fieldRead600_172(moom.ls a0) throws Throwable;
private static native moom.DT __call600_173(moom.mp a0) throws Throwable;
private static native int __call600_174(moom.DT a0) throws Throwable;
private static native int __invokedynamic600_175(int a0, long a1) throws Throwable;
private static native boolean __call600_176(net.minecraft.util.ClassInheritanceMultiMap a0) throws Throwable;
private static native java.util.Iterator __call600_177(net.minecraft.util.ClassInheritanceMultiMap a0) throws Throwable;
private static native boolean __call600_178(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call600_179(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.Entity __cast600_180(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __fieldRead600_181(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call600_182(net.minecraft.client.renderer.entity.RenderManager a0, net.minecraft.entity.Entity a1, net.minecraft.client.renderer.culling.ICamera a2, double a3, double a4, double a5) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead600_183(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead600_184(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead600_185(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead600_186(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call600_187(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __instanceOf600_188(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead600_189(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call600_190(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __cast600_191(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call600_192(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead600_193(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call600_194(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead600_195(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead600_196(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead600_197(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native double __fieldRead600_198(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __numericCompare600_199(double a0, double a1) throws Throwable;
private static native double __fieldRead600_200(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __numericCompare600_201(double a0, double a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead600_202(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call600_203(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1) throws Throwable;
private static native int __fieldRead600_205(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __fieldWrite600_206(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native void __fieldWrite600_207(net.minecraft.client.renderer.RenderGlobal a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native void __call600_208(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __fieldRead600_209(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call600_210(net.minecraft.client.renderer.entity.RenderManager a0, net.minecraft.entity.Entity a1, float a2) throws Throwable;
private static native void __fieldWrite600_211(net.minecraft.client.renderer.RenderGlobal a0, java.lang.Object a1) throws Throwable;
private static native int __instanceOf600_212(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite600_213(net.minecraft.client.renderer.RenderGlobal a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native void __call600_214(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead600_215(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __call600_216(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call600_217(net.minecraft.client.renderer.entity.RenderManager a0, net.minecraft.entity.Entity a1, float a2) throws Throwable;
private static native void __fieldWrite600_218(net.minecraft.client.renderer.RenderGlobal a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead600_219(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead600_220(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite600_221(net.minecraft.client.settings.GameSettings a0, int a1) throws Throwable;
private static native void __call600_222() throws Throwable;
private static native void __call600_223() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead600_224(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.A9 __fieldRead600_225(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native void __call600_226(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native void __call600_227() throws Throwable;
private static native void __call600_228() throws Throwable;
private static native java.util.List __fieldRead600_229(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.util.Iterator __call600_230(java.util.List a0) throws Throwable;
private static native boolean __call600_231(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call600_232(java.util.Iterator a0) throws Throwable;
private static native moom.ls __cast600_233(java.lang.Object a0) throws Throwable;
private static native moom.mp __fieldRead600_234(moom.ls a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.CompiledChunk __call600_235(moom.mp a0) throws Throwable;
private static native java.util.List __call600_236(net.minecraft.client.renderer.chunk.CompiledChunk a0) throws Throwable;
private static native boolean __call600_237(java.util.List a0) throws Throwable;
private static native java.util.Iterator __call600_238(java.util.List a0) throws Throwable;
private static native boolean __call600_239(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call600_240(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __cast600_241(java.lang.Object a0) throws Throwable;
private static native moom.CA __call600_242(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native boolean __call600_243(net.minecraft.client.renderer.culling.ICamera a0, moom.CA a1) throws Throwable;
private static native void __call600_244(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.oo __fieldRead600_245() throws Throwable;
private static native void __call600_246(moom.oo a0, net.minecraft.tileentity.TileEntity a1, float a2, int a3) throws Throwable;
private static native int __fieldRead600_248(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __fieldWrite600_249(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native java.util.Set __fieldRead600_250(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __monitorEnter600_251(java.util.Set a0) throws Throwable;
private static native java.util.Set __fieldRead600_252(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.util.Iterator __call600_253(java.util.Set a0) throws Throwable;
private static native boolean __call600_254(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call600_255(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __cast600_256(java.lang.Object a0) throws Throwable;
private static native void __call600_257(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.oo __fieldRead600_258() throws Throwable;
private static native void __call600_259(moom.oo a0, net.minecraft.tileentity.TileEntity a1, float a2, int a3) throws Throwable;
private static native void __monitorExit600_260(java.util.Set a0) throws Throwable;
private static native void __fieldWrite600_261(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native void __call600_262(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.util.Map __fieldRead600_263(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.util.Collection __call600_264(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call600_265(java.util.Collection a0) throws Throwable;
private static native boolean __call600_266(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call600_267(java.util.Iterator a0) throws Throwable;
private static native moom.kU __cast600_268(java.lang.Object a0) throws Throwable;
private static native moom.DT __call600_269(moom.kU a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead600_270(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call600_271(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1) throws Throwable;
private static native int __instanceOf600_272(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntityChest __cast600_273(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntityChest __fieldRead600_274(net.minecraft.tileentity.TileEntityChest a0) throws Throwable;
private static native moom.bs __fieldRead600_275() throws Throwable;
private static native moom.DT __call600_276(moom.DT a0, moom.bs a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead600_277(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call600_278(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1) throws Throwable;
private static native net.minecraft.tileentity.TileEntityChest __fieldRead600_279(net.minecraft.tileentity.TileEntityChest a0) throws Throwable;
private static native moom.bs __fieldRead600_280() throws Throwable;
private static native moom.DT __call600_281(moom.DT a0, moom.bs a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead600_282(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call600_283(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead600_284(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call600_285(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call600_286(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __instanceOf600_287(net.minecraft.block.Block a0) throws Throwable;
private static native int __instanceOf600_288(net.minecraft.block.Block a0) throws Throwable;
private static native int __instanceOf600_289(net.minecraft.block.Block a0) throws Throwable;
private static native int __instanceOf600_290(net.minecraft.block.Block a0) throws Throwable;
private static native void __call600_291(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.oo __fieldRead600_292() throws Throwable;
private static native int __call600_293(moom.kU a0) throws Throwable;
private static native void __call600_294(moom.oo a0, net.minecraft.tileentity.TileEntity a1, float a2, int a3) throws Throwable;
private static native void __call600_295(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __fieldWrite600_296(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native void __call600_297() throws Throwable;
private static native int __fieldRead600_298() throws Throwable;
private static native void __fieldWrite600_299(int a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead600_300(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.renderer.EntityRenderer __fieldRead600_301(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call600_302(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead600_303(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.A9 __fieldRead600_304(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call600_305(moom.A9 a0) throws Throwable;
private static native java.lang.Throwable __call3060000_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060001_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060002_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060003_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060004_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060005_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060006_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060007_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060008_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060009_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060010_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060011_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060012_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060013_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060014_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060015_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060016_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060017_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060018_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060019_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060020_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060021_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060022_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060023_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060024_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060025_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060026_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060027_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060028_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060029_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060030_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060031_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060032_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060033_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060034_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060035_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060036_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060037_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060038_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060039_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060040_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060041_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060042_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060043_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native void __monitorExit3060044_0(java.util.Set a0) throws Throwable;
private static native java.lang.Throwable __call3060045_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060046_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060047_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060048_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060049_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060050_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060051_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060052_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_123dc1f693c59b7cf034(net.minecraft.client.renderer.RenderGlobal a0, net.minecraft.entity.player.EntityPlayer a1, int a2, moom.DT a3, int a4) throws E;
private static final class __SourceHandler_123dc1f693c59b7cf034 {

public static void f1051(net.minecraft.client.renderer.RenderGlobal receiver, net.minecraft.entity.player.EntityPlayer p0, int p1, moom.DT p2, int p3) throws Throwable {
    net.minecraft.client.renderer.RenderGlobal spill1051_0;
    net.minecraft.util.EnumParticleTypes spill1051_1;
    double spill1051_2;
    double spill1051_3;
    double spill1051_4;
    double spill1051_5;
    double spill1051_6;
    double spill1051_7;
    int[] spill1051_8;
    int[] spill1051_9;
    net.minecraft.client.renderer.RenderGlobal spill1051_10;
    net.minecraft.util.EnumParticleTypes spill1051_11;
    double spill1051_12;
    double spill1051_13;
    double spill1051_14;
    double spill1051_15;
    double spill1051_16;
    double spill1051_17;
    int[] spill1051_18;
    long life5_3;
    java.util.Random life7_7;
    int life8_329;
    int life9_337;
    double life10_348;
    double life12_354;
    double life14_365;
    int life16_367;
    double life17_381;
    double life19_398;
    double life21_407;
    double life23_424;
    double life25_434;
    double life27_441;
    double life29_451;
    net.minecraft.block.Block life16_474;
    double life17_544;
    double life19_548;
    double life21_552;
    int life23_554;
    int life23_596;
    float life24_613;
    float life25_630;
    float life26_641;
    net.minecraft.util.EnumParticleTypes life27_643;
    int life28_651;
    double life29_663;
    double life31_670;
    double life33_675;
    double life35_682;
    double life37_687;
    net.minecraft.client.particle.EntityFX life39_712;
    float life40_721;
    double life28_761;
    double life30_765;
    double life32_771;
    int life34_773;
    double life34_809;
    int life34_879;
    double life35_902;
    double life37_918;
    double life39_934;
    forest_join_966: {
    forest_join_961: {
    forest_join_960: {
    forest_join_877: {
    forest_join_876: {
    forest_join_807: {
    forest_join_755: {
    forest_join_739: {
    forest_join_649: {
    forest_join_592: {
    forest_join_540: {
    forest_join_519: {
    forest_join_466: {
    forest_join_465: {
    forest_join_324: {
    forest_join_308: {
    forest_join_292: {
    forest_join_276: {
    forest_join_259: {
    forest_join_242: {
    forest_join_225: {
    forest_join_208: {
    forest_join_191: {
    forest_join_174: {
    forest_join_157: {
    forest_join_140: {
    forest_join_123: {
    forest_join_106: {
    forest_join_90: {
    forest_join_84: {
    forest_join_70: {
    forest_join_53: {
    forest_join_37: {
    forest_join_28: {
    forest_join_19: {
    forest_join_10: {
    life5_3 = (__fieldRead1051_0() ^ 140425110120870L);
    life7_7 = __fieldRead1051_2(__fieldRead1051_1(receiver));
    switch (p1) {
case 1000:
{
        break forest_join_10;
    }
case 1001:
{
        break forest_join_19;
    }
case 1002:
{
        break forest_join_28;
    }
case 1003:
{
        break forest_join_37;
    }
case 1004:
{
        break forest_join_53;
    }
case 1005:
{
        break forest_join_70;
    }
case 1006:
{
        break forest_join_90;
    }
case 1007:
{
        break forest_join_106;
    }
case 1008:
{
        break forest_join_123;
    }
case 1009:
{
        break forest_join_140;
    }
case 1010:
{
        break forest_join_157;
    }
case 1011:
{
        break forest_join_174;
    }
case 1012:
{
        break forest_join_191;
    }
case 1014:
{
        break forest_join_208;
    }
case 1015:
{
        break forest_join_225;
    }
case 1016:
{
        break forest_join_242;
    }
case 1017:
{
        break forest_join_259;
    }
case 1020:
{
        break forest_join_276;
    }
case 1021:
{
        break forest_join_292;
    }
case 1022:
{
        break forest_join_308;
    }
case 2000:
{
        break forest_join_324;
    }
case 2001:
{
        break forest_join_466;
    }
case 2002:
{
        break forest_join_540;
    }
case 2003:
{
        break forest_join_755;
    }
case 2004:
{
        break forest_join_877;
    }
case 2005:
{
        break forest_join_961;
    }
default:
{
        break forest_join_966;
    }
}
    }
    __call1051_4(__fieldRead1051_3(receiver), p2, "random.click", 0x1.0p0f, 0x1.0p0f, 0);
    break forest_join_966;
    }
    __call1051_6(__fieldRead1051_5(receiver), p2, "random.click", 0x1.0p0f, 0x1.333334p0f, 0);
    break forest_join_966;
    }
    __call1051_8(__fieldRead1051_7(receiver), p2, "random.bow", 0x1.0p0f, 0x1.333334p0f, 0);
    break forest_join_966;
    }
    __call1051_13(__fieldRead1051_9(receiver), p2, "random.door_open", 0x1.0p0f, ((__call1051_12(__fieldRead1051_11(__fieldRead1051_10(receiver))) * 0x1.99999ap-4f) + 0x1.ccccccp-1f), 0);
    break forest_join_966;
    }
    __call1051_17(__fieldRead1051_14(receiver), p2, "random.fizz", 0x1.0p-1f, (0x1.4cccccp1f + ((__call1051_15(life7_7) - __call1051_16(life7_7)) * 0x1.99999ap-1f)), 0);
    break forest_join_966;
    }
    if (!((__instanceOf1051_19(__call1051_18(p3)) != 0))) {
        break forest_join_84;
    }
    __call1051_25(__fieldRead1051_20(receiver), p2, __invokedynamic1051_24(__fieldRead1051_23(__cast1051_22(__call1051_21(p3)))));
    break forest_join_966;
    }
    __call1051_27(__fieldRead1051_26(receiver), p2, null);
    break forest_join_966;
    }
    __call1051_32(__fieldRead1051_28(receiver), p2, "random.door_close", 0x1.0p0f, ((__call1051_31(__fieldRead1051_30(__fieldRead1051_29(receiver))) * 0x1.99999ap-4f) + 0x1.ccccccp-1f), 0);
    break forest_join_966;
    }
    __call1051_36(__fieldRead1051_33(receiver), p2, "mob.ghast.charge", 0x1.4p3f, (((__call1051_34(life7_7) - __call1051_35(life7_7)) * 0x1.99999ap-3f) + 0x1.0p0f), 0);
    break forest_join_966;
    }
    __call1051_40(__fieldRead1051_37(receiver), p2, "mob.ghast.fireball", 0x1.4p3f, (((__call1051_38(life7_7) - __call1051_39(life7_7)) * 0x1.99999ap-3f) + 0x1.0p0f), 0);
    break forest_join_966;
    }
    __call1051_44(__fieldRead1051_41(receiver), p2, "mob.ghast.fireball", 0x1.0p1f, (((__call1051_42(life7_7) - __call1051_43(life7_7)) * 0x1.99999ap-3f) + 0x1.0p0f), 0);
    break forest_join_966;
    }
    __call1051_48(__fieldRead1051_45(receiver), p2, "mob.zombie.wood", 0x1.0p1f, (((__call1051_46(life7_7) - __call1051_47(life7_7)) * 0x1.99999ap-3f) + 0x1.0p0f), 0);
    break forest_join_966;
    }
    __call1051_52(__fieldRead1051_49(receiver), p2, "mob.zombie.metal", 0x1.0p1f, (((__call1051_50(life7_7) - __call1051_51(life7_7)) * 0x1.99999ap-3f) + 0x1.0p0f), 0);
    break forest_join_966;
    }
    __call1051_56(__fieldRead1051_53(receiver), p2, "mob.zombie.woodbreak", 0x1.0p1f, (((__call1051_54(life7_7) - __call1051_55(life7_7)) * 0x1.99999ap-3f) + 0x1.0p0f), 0);
    break forest_join_966;
    }
    __call1051_60(__fieldRead1051_57(receiver), p2, "mob.wither.shoot", 0x1.0p1f, (((__call1051_58(life7_7) - __call1051_59(life7_7)) * 0x1.99999ap-3f) + 0x1.0p0f), 0);
    break forest_join_966;
    }
    __call1051_64(__fieldRead1051_61(receiver), p2, "mob.bat.takeoff", 0x1.99999ap-5f, (((__call1051_62(life7_7) - __call1051_63(life7_7)) * 0x1.99999ap-3f) + 0x1.0p0f), 0);
    break forest_join_966;
    }
    __call1051_68(__fieldRead1051_65(receiver), p2, "mob.zombie.infect", 0x1.0p1f, (((__call1051_66(life7_7) - __call1051_67(life7_7)) * 0x1.99999ap-3f) + 0x1.0p0f), 0);
    break forest_join_966;
    }
    __call1051_72(__fieldRead1051_69(receiver), p2, "mob.zombie.unfect", 0x1.0p1f, (((__call1051_70(life7_7) - __call1051_71(life7_7)) * 0x1.99999ap-3f) + 0x1.0p0f), 0);
    break forest_join_966;
    }
    __call1051_77(__fieldRead1051_73(receiver), p2, "random.anvil_break", 0x1.0p0f, ((__call1051_76(__fieldRead1051_75(__fieldRead1051_74(receiver))) * 0x1.99999ap-4f) + 0x1.ccccccp-1f), 0);
    break forest_join_966;
    }
    __call1051_82(__fieldRead1051_78(receiver), p2, "random.anvil_use", 0x1.0p0f, ((__call1051_81(__fieldRead1051_80(__fieldRead1051_79(receiver))) * 0x1.99999ap-4f) + 0x1.ccccccp-1f), 0);
    break forest_join_966;
    }
    __call1051_87(__fieldRead1051_83(receiver), p2, "random.anvil_land", 0x1.333334p-2f, ((__call1051_86(__fieldRead1051_85(__fieldRead1051_84(receiver))) * 0x1.99999ap-4f) + 0x1.ccccccp-1f), 0);
    break forest_join_966;
    }
    life8_329 = ((p3 % 3) - 1);
    life9_337 = (((p3 / 3) % 3) - 1);
    life10_348 = ((((double) __call1051_88(p2)) + (((double) life8_329) * 0x1.3333333333333p-1d)) + 0x1.0p-1d);
    life12_354 = (((double) __call1051_89(p2)) + 0x1.0p-1d);
    life14_365 = ((((double) __call1051_90(p2)) + (((double) life9_337) * 0x1.3333333333333p-1d)) + 0x1.0p-1d);
    life16_367 = 0;
    forest_cycle_368: while (true) {
    if (!((life16_367 < __invokedynamic1051_91(1857, (7236840304687038344L ^ life5_3))))) {
        break forest_join_465;
    }
    life17_381 = ((__call1051_92(life7_7) * 0x1.999999999999ap-3d) + 0x1.47ae147ae147bp-7d);
    life19_398 = ((life10_348 + (((double) life8_329) * 0x1.47ae147ae147bp-7d)) + (((__call1051_93(life7_7) - 0x1.0p-1d) * ((double) life9_337)) * 0x1.0p-1d));
    life21_407 = (life12_354 + ((__call1051_94(life7_7) - 0x1.0p-1d) * 0x1.0p-1d));
    life23_424 = ((life14_365 + (((double) life9_337) * 0x1.47ae147ae147bp-7d)) + (((__call1051_95(life7_7) - 0x1.0p-1d) * ((double) life8_329)) * 0x1.0p-1d));
    life25_434 = ((((double) life8_329) * life17_381) + (__call1051_96(life7_7) * 0x1.47ae147ae147bp-7d));
    life27_441 = (-0x1.eb851eb851eb8p-6d + (__call1051_97(life7_7) * 0x1.47ae147ae147bp-7d));
    life29_451 = ((((double) life9_337) * life17_381) + (__call1051_98(life7_7) * 0x1.47ae147ae147bp-7d));
    __call1051_100(receiver, __fieldRead1051_99(), life19_398, life21_407, life23_424, life25_434, life27_441, life29_451, new int[0]);
    life16_367 += 1;
    continue forest_cycle_368;
    }
    }
    return;
    }
    life16_474 = __call1051_102((p3 & __invokedynamic1051_101(29981, (8380069103307935113L ^ life5_3))));
    if (!((__call1051_103(life16_474) != __fieldRead1051_104()))) {
        break forest_join_519;
    }
    __call1051_116(__call1051_106(__fieldRead1051_105(receiver)), new moom.fY(new moom.DD(__call1051_108(__fieldRead1051_107(life16_474))), ((__call1051_110(__fieldRead1051_109(life16_474)) + 0x1.0p0f) / 0x1.0p1f), (__call1051_112(__fieldRead1051_111(life16_474)) * 0x1.99999ap-1f), (((float) __call1051_113(p2)) + 0x1.0p-1f), (((float) __call1051_114(p2)) + 0x1.0p-1f), (((float) __call1051_115(p2)) + 0x1.0p-1f)));
    }
    __call1051_122(__fieldRead1051_118(__fieldRead1051_117(receiver)), p2, __call1051_121(life16_474, ((p3 >> __invokedynamic1051_119(14212, (2893522409310130032L ^ life5_3))) & __invokedynamic1051_120(14550, (6292080259366944789L ^ life5_3)))));
    break forest_join_966;
    }
    life17_544 = ((double) __call1051_123(p2));
    life19_548 = ((double) __call1051_124(p2));
    life21_552 = ((double) __call1051_125(p2));
    life23_554 = 0;
    forest_cycle_554: while (true) {
    if (!((life23_554 < __invokedynamic1051_126(20434, (1058037733453526860L ^ life5_3))))) {
        break forest_join_592;
    }
    spill1051_0 = receiver;
    spill1051_1 = __fieldRead1051_127();
    spill1051_2 = life17_544;
    spill1051_3 = life19_548;
    spill1051_4 = life21_552;
    spill1051_5 = (__call1051_128(life7_7) * 0x1.3333333333333p-3d);
    spill1051_6 = (__call1051_129(life7_7) * 0x1.999999999999ap-3d);
    spill1051_7 = (__call1051_130(life7_7) * 0x1.3333333333333p-3d);
    int[] __stackOp1051_131_0 = new int[2];
    spill1051_8 = __stackOp1051_131_0;
    (__stackOp1051_131_0)[0] = __call1051_133(__fieldRead1051_132());
    int[] __stackOp1051_134_0 = spill1051_8;
    spill1051_9 = __stackOp1051_134_0;
    (__stackOp1051_134_0)[1] = p3;
    __call1051_135(spill1051_0, spill1051_1, spill1051_2, spill1051_3, spill1051_4, spill1051_5, spill1051_6, spill1051_7, spill1051_9);
    life23_554 += 1;
    continue forest_cycle_554;
    }
    }
    life23_596 = __call1051_137(__fieldRead1051_136(), p3);
    life24_613 = (((float) ((life23_596 >> __invokedynamic1051_138(2671, (6021985734274626219L ^ life5_3))) & __invokedynamic1051_139(14550, (6292080259366944789L ^ life5_3)))) / 0x1.fep7f);
    life25_630 = (((float) ((life23_596 >> __invokedynamic1051_140(20434, (1058037733453526860L ^ life5_3))) & __invokedynamic1051_141(14550, (6292080259366944789L ^ life5_3)))) / 0x1.fep7f);
    life26_641 = (((float) (life23_596 & __invokedynamic1051_142(14550, (6292080259366944789L ^ life5_3)))) / 0x1.fep7f);
    life27_643 = __fieldRead1051_143();
    if (!(__call1051_145(__fieldRead1051_144(), p3))) {
        break forest_join_649;
    }
    life27_643 = __fieldRead1051_146();
    }
    life28_651 = 0;
    forest_cycle_651: while (true) {
    forest_join_737: {
    if (!((life28_651 < __invokedynamic1051_147(4408, (3949534207074970063L ^ life5_3))))) {
        break forest_join_739;
    }
    life29_663 = (__call1051_148(life7_7) * 0x1.0p2d);
    life31_670 = ((__call1051_149(life7_7) * 0x1.921fb54442d18p1d) * 0x1.0p1d);
    life33_675 = (__call1051_150(life31_670) * life29_663);
    life35_682 = (0x1.47ae147ae147bp-7d + (__call1051_151(life7_7) * 0x1.0p-1d));
    life37_687 = (__call1051_152(life31_670) * life29_663);
    life39_712 = __call1051_155(receiver, __call1051_153(life27_643), __call1051_154(life27_643), (life17_544 + (life33_675 * 0x1.999999999999ap-4d)), (life19_548 + 0x1.3333333333333p-2d), (life21_552 + (life37_687 * 0x1.999999999999ap-4d)), life33_675, life35_682, life37_687, new int[0]);
    if (!((life39_712 != null))) {
        break forest_join_737;
    }
    life40_721 = (0x1.8p-1f + (__call1051_156(life7_7) * 0x1.0p-2f));
    __call1051_157(life39_712, (life24_613 * life40_721), (life25_630 * life40_721), (life26_641 * life40_721));
    __call1051_158(life39_712, ((float) life29_663));
    }
    life28_651 += 1;
    continue forest_cycle_651;
    }
    }
    __call1051_163(__fieldRead1051_159(receiver), p2, "game.potion.smash", 0x1.0p0f, ((__call1051_162(__fieldRead1051_161(__fieldRead1051_160(receiver))) * 0x1.99999ap-4f) + 0x1.ccccccp-1f), 0);
    break forest_join_966;
    }
    life28_761 = (((double) __call1051_164(p2)) + 0x1.0p-1d);
    life30_765 = ((double) __call1051_165(p2));
    life32_771 = (((double) __call1051_166(p2)) + 0x1.0p-1d);
    life34_773 = 0;
    forest_cycle_773: while (true) {
    if (!((life34_773 < __invokedynamic1051_167(20434, (1058037733453526860L ^ life5_3))))) {
        break forest_join_807;
    }
    spill1051_10 = receiver;
    spill1051_11 = __fieldRead1051_168();
    spill1051_12 = life28_761;
    spill1051_13 = life30_765;
    spill1051_14 = life32_771;
    spill1051_15 = (__call1051_169(life7_7) * 0x1.3333333333333p-3d);
    spill1051_16 = (__call1051_170(life7_7) * 0x1.999999999999ap-3d);
    spill1051_17 = (__call1051_171(life7_7) * 0x1.3333333333333p-3d);
    int[] __stackOp1051_172_0 = new int[1];
    spill1051_18 = __stackOp1051_172_0;
    (__stackOp1051_172_0)[0] = __call1051_174(__fieldRead1051_173());
    __call1051_175(spill1051_10, spill1051_11, spill1051_12, spill1051_13, spill1051_14, spill1051_15, spill1051_16, spill1051_17, spill1051_18);
    life34_773 += 1;
    continue forest_cycle_773;
    }
    }
    life34_809 = 0x0.0p0d;
    forest_cycle_809: while (true) {
    if (!((__numericCompare1051_176(life34_809, 0x1.921fb54442d18p2d) < 0))) {
        break forest_join_876;
    }
    __call1051_182(receiver, __fieldRead1051_177(), (life28_761 + (__call1051_178(life34_809) * 0x1.4p2d)), (life30_765 - 0x1.999999999999ap-2d), (life32_771 + (__call1051_179(life34_809) * 0x1.4p2d)), (__call1051_180(life34_809) * -0x1.4p2d), 0x0.0p0d, (__call1051_181(life34_809) * -0x1.4p2d), new int[0]);
    __call1051_188(receiver, __fieldRead1051_183(), (life28_761 + (__call1051_184(life34_809) * 0x1.4p2d)), (life30_765 - 0x1.999999999999ap-2d), (life32_771 + (__call1051_185(life34_809) * 0x1.4p2d)), (__call1051_186(life34_809) * -0x1.cp2d), 0x0.0p0d, (__call1051_187(life34_809) * -0x1.cp2d), new int[0]);
    life34_809 = (life34_809 + 0x1.41b2f769cf0ep-3d);
    continue forest_cycle_809;
    }
    }
    return;
    }
    life34_879 = 0;
    forest_cycle_879: while (true) {
    if (!((life34_879 < __invokedynamic1051_189(18172, (9079673395311803939L ^ life5_3))))) {
        break forest_join_960;
    }
    life35_902 = ((((double) __call1051_190(p2)) + 0x1.0p-1d) + ((((double) __call1051_193(__fieldRead1051_192(__fieldRead1051_191(receiver)))) - 0x1.0p-1d) * 0x1.0p1d));
    life37_918 = ((((double) __call1051_194(p2)) + 0x1.0p-1d) + ((((double) __call1051_197(__fieldRead1051_196(__fieldRead1051_195(receiver)))) - 0x1.0p-1d) * 0x1.0p1d));
    life39_934 = ((((double) __call1051_198(p2)) + 0x1.0p-1d) + ((((double) __call1051_201(__fieldRead1051_200(__fieldRead1051_199(receiver)))) - 0x1.0p-1d) * 0x1.0p1d));
    __call1051_204(__fieldRead1051_202(receiver), __fieldRead1051_203(), life35_902, life37_918, life39_934, 0x0.0p0d, 0x0.0p0d, 0x0.0p0d, new int[0]);
    __call1051_207(__fieldRead1051_205(receiver), __fieldRead1051_206(), life35_902, life37_918, life39_934, 0x0.0p0d, 0x0.0p0d, 0x0.0p0d, new int[0]);
    life34_879 += 1;
    continue forest_cycle_879;
    }
    }
    return;
    }
    __call1051_209(__fieldRead1051_208(receiver), p2, p3);
    }
    return;
}
public static void h1051_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3105100_0(p0);
}
public static void h1051_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3105101_0(p0);
}
public static void h1051_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3105102_0(p0);
}
public static void h1051_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3105103_0(p0);
}
public static void h1051_4(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3105104_0(p0);
}
private static native long __fieldRead1051_0() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1051_1(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.util.Random __fieldRead1051_2(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1051_3(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call1051_4(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1, java.lang.String a2, float a3, float a4, int a5) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1051_5(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call1051_6(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1, java.lang.String a2, float a3, float a4, int a5) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1051_7(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call1051_8(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1, java.lang.String a2, float a3, float a4, int a5) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1051_9(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1051_10(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.util.Random __fieldRead1051_11(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native float __call1051_12(java.util.Random a0) throws Throwable;
private static native void __call1051_13(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1, java.lang.String a2, float a3, float a4, int a5) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1051_14(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native float __call1051_15(java.util.Random a0) throws Throwable;
private static native float __call1051_16(java.util.Random a0) throws Throwable;
private static native void __call1051_17(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1, java.lang.String a2, float a3, float a4, int a5) throws Throwable;
private static native net.minecraft.item.Item __call1051_18(int a0) throws Throwable;
private static native int __instanceOf1051_19(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1051_20(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.item.Item __call1051_21(int a0) throws Throwable;
private static native moom.xF __cast1051_22(net.minecraft.item.Item a0) throws Throwable;
private static native java.lang.String __fieldRead1051_23(moom.xF a0) throws Throwable;
private static native java.lang.String __invokedynamic1051_24(java.lang.String a0) throws Throwable;
private static native void __call1051_25(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1, java.lang.String a2) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1051_26(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call1051_27(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1, java.lang.Object a2) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1051_28(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1051_29(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.util.Random __fieldRead1051_30(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native float __call1051_31(java.util.Random a0) throws Throwable;
private static native void __call1051_32(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1, java.lang.String a2, float a3, float a4, int a5) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1051_33(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native float __call1051_34(java.util.Random a0) throws Throwable;
private static native float __call1051_35(java.util.Random a0) throws Throwable;
private static native void __call1051_36(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1, java.lang.String a2, float a3, float a4, int a5) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1051_37(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native float __call1051_38(java.util.Random a0) throws Throwable;
private static native float __call1051_39(java.util.Random a0) throws Throwable;
private static native void __call1051_40(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1, java.lang.String a2, float a3, float a4, int a5) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1051_41(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native float __call1051_42(java.util.Random a0) throws Throwable;
private static native float __call1051_43(java.util.Random a0) throws Throwable;
private static native void __call1051_44(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1, java.lang.String a2, float a3, float a4, int a5) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1051_45(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native float __call1051_46(java.util.Random a0) throws Throwable;
private static native float __call1051_47(java.util.Random a0) throws Throwable;
private static native void __call1051_48(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1, java.lang.String a2, float a3, float a4, int a5) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1051_49(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native float __call1051_50(java.util.Random a0) throws Throwable;
private static native float __call1051_51(java.util.Random a0) throws Throwable;
private static native void __call1051_52(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1, java.lang.String a2, float a3, float a4, int a5) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1051_53(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native float __call1051_54(java.util.Random a0) throws Throwable;
private static native float __call1051_55(java.util.Random a0) throws Throwable;
private static native void __call1051_56(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1, java.lang.String a2, float a3, float a4, int a5) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1051_57(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native float __call1051_58(java.util.Random a0) throws Throwable;
private static native float __call1051_59(java.util.Random a0) throws Throwable;
private static native void __call1051_60(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1, java.lang.String a2, float a3, float a4, int a5) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1051_61(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native float __call1051_62(java.util.Random a0) throws Throwable;
private static native float __call1051_63(java.util.Random a0) throws Throwable;
private static native void __call1051_64(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1, java.lang.String a2, float a3, float a4, int a5) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1051_65(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native float __call1051_66(java.util.Random a0) throws Throwable;
private static native float __call1051_67(java.util.Random a0) throws Throwable;
private static native void __call1051_68(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1, java.lang.String a2, float a3, float a4, int a5) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1051_69(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native float __call1051_70(java.util.Random a0) throws Throwable;
private static native float __call1051_71(java.util.Random a0) throws Throwable;
private static native void __call1051_72(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1, java.lang.String a2, float a3, float a4, int a5) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1051_73(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1051_74(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.util.Random __fieldRead1051_75(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native float __call1051_76(java.util.Random a0) throws Throwable;
private static native void __call1051_77(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1, java.lang.String a2, float a3, float a4, int a5) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1051_78(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1051_79(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.util.Random __fieldRead1051_80(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native float __call1051_81(java.util.Random a0) throws Throwable;
private static native void __call1051_82(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1, java.lang.String a2, float a3, float a4, int a5) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1051_83(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1051_84(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.util.Random __fieldRead1051_85(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native float __call1051_86(java.util.Random a0) throws Throwable;
private static native void __call1051_87(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1, java.lang.String a2, float a3, float a4, int a5) throws Throwable;
private static native int __call1051_88(moom.DT a0) throws Throwable;
private static native int __call1051_89(moom.DT a0) throws Throwable;
private static native int __call1051_90(moom.DT a0) throws Throwable;
private static native int __invokedynamic1051_91(int a0, long a1) throws Throwable;
private static native double __call1051_92(java.util.Random a0) throws Throwable;
private static native double __call1051_93(java.util.Random a0) throws Throwable;
private static native double __call1051_94(java.util.Random a0) throws Throwable;
private static native double __call1051_95(java.util.Random a0) throws Throwable;
private static native double __call1051_96(java.util.Random a0) throws Throwable;
private static native double __call1051_97(java.util.Random a0) throws Throwable;
private static native double __call1051_98(java.util.Random a0) throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead1051_99() throws Throwable;
private static native void __call1051_100(net.minecraft.client.renderer.RenderGlobal a0, net.minecraft.util.EnumParticleTypes a1, double a2, double a3, double a4, double a5, double a6, double a7, int[] a8) throws Throwable;
private static native int __invokedynamic1051_101(int a0, long a1) throws Throwable;
private static native net.minecraft.block.Block __call1051_102(int a0) throws Throwable;
private static native moom.fn __call1051_103(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead1051_104() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1051_105(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.audio.SoundHandler __call1051_106(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.eJ __fieldRead1051_107(net.minecraft.block.Block a0) throws Throwable;
private static native java.lang.String __call1051_108(moom.eJ a0) throws Throwable;
private static native moom.eJ __fieldRead1051_109(net.minecraft.block.Block a0) throws Throwable;
private static native float __call1051_110(moom.eJ a0) throws Throwable;
private static native moom.eJ __fieldRead1051_111(net.minecraft.block.Block a0) throws Throwable;
private static native float __call1051_112(moom.eJ a0) throws Throwable;
private static native int __call1051_113(moom.DT a0) throws Throwable;
private static native int __call1051_114(moom.DT a0) throws Throwable;
private static native int __call1051_115(moom.DT a0) throws Throwable;
private static native void __call1051_116(net.minecraft.client.audio.SoundHandler a0, moom.fY a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1051_117(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.particle.EffectRenderer __fieldRead1051_118(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __invokedynamic1051_119(int a0, long a1) throws Throwable;
private static native int __invokedynamic1051_120(int a0, long a1) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1051_121(net.minecraft.block.Block a0, int a1) throws Throwable;
private static native void __call1051_122(net.minecraft.client.particle.EffectRenderer a0, moom.DT a1, net.minecraft.block.state.IBlockState a2) throws Throwable;
private static native int __call1051_123(moom.DT a0) throws Throwable;
private static native int __call1051_124(moom.DT a0) throws Throwable;
private static native int __call1051_125(moom.DT a0) throws Throwable;
private static native int __invokedynamic1051_126(int a0, long a1) throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead1051_127() throws Throwable;
private static native double __call1051_128(java.util.Random a0) throws Throwable;
private static native double __call1051_129(java.util.Random a0) throws Throwable;
private static native double __call1051_130(java.util.Random a0) throws Throwable;
private static native net.minecraft.item.ItemPotion __fieldRead1051_132() throws Throwable;
private static native int __call1051_133(net.minecraft.item.ItemPotion a0) throws Throwable;
private static native void __call1051_135(net.minecraft.client.renderer.RenderGlobal a0, net.minecraft.util.EnumParticleTypes a1, double a2, double a3, double a4, double a5, double a6, double a7, int[] a8) throws Throwable;
private static native net.minecraft.item.ItemPotion __fieldRead1051_136() throws Throwable;
private static native int __call1051_137(net.minecraft.item.ItemPotion a0, int a1) throws Throwable;
private static native int __invokedynamic1051_138(int a0, long a1) throws Throwable;
private static native int __invokedynamic1051_139(int a0, long a1) throws Throwable;
private static native int __invokedynamic1051_140(int a0, long a1) throws Throwable;
private static native int __invokedynamic1051_141(int a0, long a1) throws Throwable;
private static native int __invokedynamic1051_142(int a0, long a1) throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead1051_143() throws Throwable;
private static native net.minecraft.item.ItemPotion __fieldRead1051_144() throws Throwable;
private static native boolean __call1051_145(net.minecraft.item.ItemPotion a0, int a1) throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead1051_146() throws Throwable;
private static native int __invokedynamic1051_147(int a0, long a1) throws Throwable;
private static native double __call1051_148(java.util.Random a0) throws Throwable;
private static native double __call1051_149(java.util.Random a0) throws Throwable;
private static native double __call1051_150(double a0) throws Throwable;
private static native double __call1051_151(java.util.Random a0) throws Throwable;
private static native double __call1051_152(double a0) throws Throwable;
private static native int __call1051_153(net.minecraft.util.EnumParticleTypes a0) throws Throwable;
private static native boolean __call1051_154(net.minecraft.util.EnumParticleTypes a0) throws Throwable;
private static native net.minecraft.client.particle.EntityFX __call1051_155(net.minecraft.client.renderer.RenderGlobal a0, int a1, boolean a2, double a3, double a4, double a5, double a6, double a7, double a8, int[] a9) throws Throwable;
private static native float __call1051_156(java.util.Random a0) throws Throwable;
private static native void __call1051_157(net.minecraft.client.particle.EntityFX a0, float a1, float a2, float a3) throws Throwable;
private static native net.minecraft.client.particle.EntityFX __call1051_158(net.minecraft.client.particle.EntityFX a0, float a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1051_159(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1051_160(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.util.Random __fieldRead1051_161(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native float __call1051_162(java.util.Random a0) throws Throwable;
private static native void __call1051_163(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1, java.lang.String a2, float a3, float a4, int a5) throws Throwable;
private static native int __call1051_164(moom.DT a0) throws Throwable;
private static native int __call1051_165(moom.DT a0) throws Throwable;
private static native int __call1051_166(moom.DT a0) throws Throwable;
private static native int __invokedynamic1051_167(int a0, long a1) throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead1051_168() throws Throwable;
private static native double __call1051_169(java.util.Random a0) throws Throwable;
private static native double __call1051_170(java.util.Random a0) throws Throwable;
private static native double __call1051_171(java.util.Random a0) throws Throwable;
private static native net.minecraft.item.Item __fieldRead1051_173() throws Throwable;
private static native int __call1051_174(net.minecraft.item.Item a0) throws Throwable;
private static native void __call1051_175(net.minecraft.client.renderer.RenderGlobal a0, net.minecraft.util.EnumParticleTypes a1, double a2, double a3, double a4, double a5, double a6, double a7, int[] a8) throws Throwable;
private static native int __numericCompare1051_176(double a0, double a1) throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead1051_177() throws Throwable;
private static native double __call1051_178(double a0) throws Throwable;
private static native double __call1051_179(double a0) throws Throwable;
private static native double __call1051_180(double a0) throws Throwable;
private static native double __call1051_181(double a0) throws Throwable;
private static native void __call1051_182(net.minecraft.client.renderer.RenderGlobal a0, net.minecraft.util.EnumParticleTypes a1, double a2, double a3, double a4, double a5, double a6, double a7, int[] a8) throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead1051_183() throws Throwable;
private static native double __call1051_184(double a0) throws Throwable;
private static native double __call1051_185(double a0) throws Throwable;
private static native double __call1051_186(double a0) throws Throwable;
private static native double __call1051_187(double a0) throws Throwable;
private static native void __call1051_188(net.minecraft.client.renderer.RenderGlobal a0, net.minecraft.util.EnumParticleTypes a1, double a2, double a3, double a4, double a5, double a6, double a7, int[] a8) throws Throwable;
private static native int __invokedynamic1051_189(int a0, long a1) throws Throwable;
private static native int __call1051_190(moom.DT a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1051_191(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.util.Random __fieldRead1051_192(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native float __call1051_193(java.util.Random a0) throws Throwable;
private static native int __call1051_194(moom.DT a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1051_195(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.util.Random __fieldRead1051_196(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native float __call1051_197(java.util.Random a0) throws Throwable;
private static native int __call1051_198(moom.DT a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1051_199(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.util.Random __fieldRead1051_200(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native float __call1051_201(java.util.Random a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1051_202(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead1051_203() throws Throwable;
private static native void __call1051_204(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.util.EnumParticleTypes a1, double a2, double a3, double a4, double a5, double a6, double a7, int[] a8) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1051_205(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead1051_206() throws Throwable;
private static native void __call1051_207(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.util.EnumParticleTypes a1, double a2, double a3, double a4, double a5, double a6, double a7, int[] a8) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1051_208(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call1051_209(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1, int a2) throws Throwable;
private static native java.lang.Throwable __call3105100_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3105101_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3105102_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3105103_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3105104_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b3a6552ea312311825e8(net.minecraft.client.renderer.RenderGlobal a0, net.minecraft.entity.player.EntityPlayer a1, net.minecraft.util.MovingObjectPosition a2, int a3, float a4) throws E;
private static final class __SourceHandler_b3a6552ea312311825e8 {

public static void f100199(net.minecraft.client.renderer.RenderGlobal receiver, net.minecraft.entity.player.EntityPlayer p0, net.minecraft.util.MovingObjectPosition p1, int p2, float p3) throws Throwable {
    long life5_3;
    float life7_41;
    moom.DT life8_44;
    net.minecraft.block.Block life9_50;
    double life10_78;
    double life12_90;
    double life14_102;
    moom.CA life16_108;
    moom.F life17_111;
    forest_join_136: {
    forest_join_135: {
    forest_join_129: {
    forest_join_116: {
    forest_join_35: {
    life5_3 = (__fieldRead100199_0() ^ 17727905155230L);
    if (!((p2 == 0))) {
        break forest_join_136;
    }
    if (!((__fieldRead100199_1(p1) == __fieldRead100199_2()))) {
        break forest_join_136;
    }
    __call100199_3();
    __call100199_6(__invokedynamic100199_4(21947, (6244775777559333976L ^ life5_3)), __invokedynamic100199_5(27667, (3110723001176782311L ^ life5_3)), 1, 0);
    __call100199_7(0x0.0p0f, 0x0.0p0f, 0x0.0p0f, 0x1.99999ap-2f);
    __call100199_8(0x1.0p1f);
    __call100199_9();
    if (!(__call100199_10())) {
        break forest_join_35;
    }
    __call100199_11();
    }
    __call100199_12(0);
    life7_41 = 0x1.0624dep-9f;
    life8_44 = __call100199_13(p1);
    life9_50 = __call100199_16(__call100199_15(__fieldRead100199_14(receiver), life8_44));
    if (!((__call100199_17(life9_50) != __fieldRead100199_18()))) {
        break forest_join_129;
    }
    if (!(__call100199_21(__call100199_20(__fieldRead100199_19(receiver)), life8_44))) {
        break forest_join_129;
    }
    __call100199_23(life9_50, __fieldRead100199_22(receiver), life8_44);
    life10_78 = (__fieldRead100199_24(p0) + ((__fieldRead100199_25(p0) - __fieldRead100199_26(p0)) * ((double) p3)));
    life12_90 = (__fieldRead100199_27(p0) + ((__fieldRead100199_28(p0) - __fieldRead100199_29(p0)) * ((double) p3)));
    life14_102 = (__fieldRead100199_30(p0) + ((__fieldRead100199_31(p0) - __fieldRead100199_32(p0)) * ((double) p3)));
    life16_108 = __call100199_34(life9_50, __fieldRead100199_33(receiver), life8_44);
    life17_111 = __call100199_35(life9_50);
    if (!((life17_111 != __fieldRead100199_36()))) {
        break forest_join_116;
    }
    life16_108 = __call100199_37(life16_108, life17_111, life8_44);
    }
    __call100199_40(__call100199_39(__call100199_38(life16_108, 0x1.0624dep-9d, 0x1.0624dep-9d, 0x1.0624dep-9d), (-life10_78), (-life12_90), (-life14_102)));
    }
    __call100199_41(1);
    __call100199_42();
    if (!(__call100199_43())) {
        break forest_join_135;
    }
    __call100199_44();
    }
    __call100199_45();
    }
    return;
}
public static void h100199_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019900_0(p0);
}
public static void h100199_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019901_0(p0);
}
public static void h100199_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019902_0(p0);
}
public static void h100199_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019903_0(p0);
}
public static void h100199_4(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019904_0(p0);
}
private static native long __fieldRead100199_0() throws Throwable;
private static native net.minecraft.util.MovingObjectPosition$MovingObjectType __fieldRead100199_1(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition$MovingObjectType __fieldRead100199_2() throws Throwable;
private static native void __call100199_3() throws Throwable;
private static native int __invokedynamic100199_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic100199_5(int a0, long a1) throws Throwable;
private static native void __call100199_6(int a0, int a1, int a2, int a3) throws Throwable;
private static native void __call100199_7(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call100199_8(float a0) throws Throwable;
private static native void __call100199_9() throws Throwable;
private static native boolean __call100199_10() throws Throwable;
private static native void __call100199_11() throws Throwable;
private static native void __call100199_12(int a0) throws Throwable;
private static native moom.DT __call100199_13(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead100199_14(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call100199_15(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call100199_16(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.fn __call100199_17(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead100199_18() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead100199_19(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.world.border.WorldBorder __call100199_20(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native boolean __call100199_21(net.minecraft.world.border.WorldBorder a0, moom.DT a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead100199_22(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call100199_23(net.minecraft.block.Block a0, net.minecraft.client.multiplayer.WorldClient a1, moom.DT a2) throws Throwable;
private static native double __fieldRead100199_24(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native double __fieldRead100199_25(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native double __fieldRead100199_26(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native double __fieldRead100199_27(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native double __fieldRead100199_28(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native double __fieldRead100199_29(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native double __fieldRead100199_30(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native double __fieldRead100199_31(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native double __fieldRead100199_32(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead100199_33(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.CA __call100199_34(net.minecraft.block.Block a0, net.minecraft.client.multiplayer.WorldClient a1, moom.DT a2) throws Throwable;
private static native moom.F __call100199_35(net.minecraft.block.Block a0) throws Throwable;
private static native moom.F __fieldRead100199_36() throws Throwable;
private static native moom.CA __call100199_37(moom.CA a0, moom.F a1, moom.DT a2) throws Throwable;
private static native moom.CA __call100199_38(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native moom.CA __call100199_39(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native void __call100199_40(moom.CA a0) throws Throwable;
private static native void __call100199_41(int a0) throws Throwable;
private static native void __call100199_42() throws Throwable;
private static native boolean __call100199_43() throws Throwable;
private static native void __call100199_44() throws Throwable;
private static native void __call100199_45() throws Throwable;
private static native java.lang.Throwable __call13019900_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019901_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019902_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019903_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019904_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e15259bce9f6301e2c34(net.minecraft.client.renderer.RenderGlobal a0, net.minecraft.util.EnumWorldBlockLayer a1) throws E;
private static final class __SourceHandler_e15259bce9f6301e2c34 {

public static void f601(net.minecraft.client.renderer.RenderGlobal receiver, net.minecraft.util.EnumWorldBlockLayer p0) throws Throwable {
    int spill601_0;
    int spill601_1;
    int spill601_2;
    long life2_3;
    java.util.Iterator life4_60;
    moom.oF life5_67;
    net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage life6_70;
    int life7_73;
    forest_join_104: {
    forest_join_52: {
    forest_join_44: {
    forest_join_40: {
    life2_3 = (__fieldRead601_0() ^ 83629600219118L);
    __call601_3(__fieldRead601_2(__fieldRead601_1(receiver)));
    if (!(__call601_4())) {
        break forest_join_40;
    }
    __call601_6(__invokedynamic601_5(13727, (4114459860428061466L ^ life2_3)));
    spill601_0 = 1643;
    __call601_8(__fieldRead601_7());
    __call601_10(__invokedynamic601_9(spill601_0, (955434769739729139L ^ life2_3)));
    spill601_1 = 14082;
    __call601_12(__fieldRead601_11());
    __call601_14(__invokedynamic601_13(spill601_1, (315457276949428652L ^ life2_3)));
    spill601_2 = 6621;
    __call601_16(__fieldRead601_15());
    __call601_18(__invokedynamic601_17(spill601_2, (5877216989827913479L ^ life2_3)));
    }
    if (!(__call601_19())) {
        break forest_join_44;
    }
    __call601_20(p0);
    }
    __call601_22(__fieldRead601_21(receiver), p0);
    if (!(__call601_23())) {
        break forest_join_52;
    }
    __call601_24(p0);
    }
    if (!(__call601_25())) {
        break forest_join_104;
    }
    life4_60 = __call601_28(__call601_27(__fieldRead601_26()));
    forest_cycle_58: while (true) {
    forest_join_103: {
    forest_join_96: {
    forest_join_83: {
    forest_join_76: {
    if (!(__call601_29(life4_60))) {
        break forest_join_104;
    }
    life5_67 = __cast601_31(__call601_30(life4_60));
    life6_70 = __call601_32(life5_67);
    life7_73 = __call601_33(life5_67);
    switch ((__fieldRead601_34())[__call601_35(life6_70)]) {
case 1:
{
        break forest_join_76;
    }
case 2:
{
        break forest_join_83;
    }
case 3:
{
        break forest_join_96;
    }
default:
{
        break forest_join_103;
    }
}
    }
    __call601_37(__invokedynamic601_36(13727, (4114459860428061466L ^ life2_3)));
    break forest_join_103;
    }
    __call601_39((__fieldRead601_38() + life7_73));
    __call601_41(__invokedynamic601_40(14082, (315457276949428652L ^ life2_3)));
    __call601_43(__fieldRead601_42());
    break forest_join_103;
    }
    __call601_45(__invokedynamic601_44(20725, (175860384760241765L ^ life2_3)));
    __call601_46();
    }
    continue forest_cycle_58;
    }
    }
    __call601_49(__fieldRead601_48(__fieldRead601_47(receiver)));
    return;
}
public static void h601_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060100_0(p0);
}
public static void h601_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060101_0(p0);
}
public static void h601_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060102_0(p0);
}
public static void h601_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060103_0(p0);
}
private static native long __fieldRead601_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead601_1(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.renderer.EntityRenderer __fieldRead601_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call601_3(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native boolean __call601_4() throws Throwable;
private static native int __invokedynamic601_5(int a0, long a1) throws Throwable;
private static native void __call601_6(int a0) throws Throwable;
private static native int __fieldRead601_7() throws Throwable;
private static native void __call601_8(int a0) throws Throwable;
private static native int __invokedynamic601_9(int a0, long a1) throws Throwable;
private static native void __call601_10(int a0) throws Throwable;
private static native int __fieldRead601_11() throws Throwable;
private static native void __call601_12(int a0) throws Throwable;
private static native int __invokedynamic601_13(int a0, long a1) throws Throwable;
private static native void __call601_14(int a0) throws Throwable;
private static native int __fieldRead601_15() throws Throwable;
private static native void __call601_16(int a0) throws Throwable;
private static native int __invokedynamic601_17(int a0, long a1) throws Throwable;
private static native void __call601_18(int a0) throws Throwable;
private static native boolean __call601_19() throws Throwable;
private static native void __call601_20(net.minecraft.util.EnumWorldBlockLayer a0) throws Throwable;
private static native moom.kR __fieldRead601_21(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call601_22(moom.kR a0, net.minecraft.util.EnumWorldBlockLayer a1) throws Throwable;
private static native boolean __call601_23() throws Throwable;
private static native void __call601_24(net.minecraft.util.EnumWorldBlockLayer a0) throws Throwable;
private static native boolean __call601_25() throws Throwable;
private static native moom.oD __fieldRead601_26() throws Throwable;
private static native java.util.List __call601_27(moom.oD a0) throws Throwable;
private static native java.util.Iterator __call601_28(java.util.List a0) throws Throwable;
private static native boolean __call601_29(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call601_30(java.util.Iterator a0) throws Throwable;
private static native moom.oF __cast601_31(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage __call601_32(moom.oF a0) throws Throwable;
private static native int __call601_33(moom.oF a0) throws Throwable;
private static native int[] __fieldRead601_34() throws Throwable;
private static native int __call601_35(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage a0) throws Throwable;
private static native int __invokedynamic601_36(int a0, long a1) throws Throwable;
private static native void __call601_37(int a0) throws Throwable;
private static native int __fieldRead601_38() throws Throwable;
private static native void __call601_39(int a0) throws Throwable;
private static native int __invokedynamic601_40(int a0, long a1) throws Throwable;
private static native void __call601_41(int a0) throws Throwable;
private static native int __fieldRead601_42() throws Throwable;
private static native void __call601_43(int a0) throws Throwable;
private static native int __invokedynamic601_44(int a0, long a1) throws Throwable;
private static native void __call601_45(int a0) throws Throwable;
private static native void __call601_46() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead601_47(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.renderer.EntityRenderer __fieldRead601_48(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call601_49(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native java.lang.Throwable __call3060100_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060101_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060102_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060103_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_a4e485b291a3c14741e8(net.minecraft.client.renderer.RenderGlobal a0, net.minecraft.util.EnumWorldBlockLayer a1, double a2, int a3, net.minecraft.entity.Entity a4) throws E;
private static final class __SourceHandler_a4e485b291a3c14741e8 {

public static int f1054(net.minecraft.client.renderer.RenderGlobal receiver, net.minecraft.util.EnumWorldBlockLayer p0, double p1, int p2, net.minecraft.entity.Entity p3) throws Throwable {
    int forestValue1054_113_0;
    int forestValue1054_123_0;
    int forestValue1054_131_0;
    int forestValue1054_137_0;
    long life6_3;
    double life8_21;
    double life10_27;
    double life12_33;
    int life14_61;
    java.util.Iterator life15_68;
    moom.ls life16_75;
    int life8_109;
    int life9_116;
    int life10_126;
    int life11_134;
    int life12_140;
    int life13_142;
    moom.mp life14_152;
    forest_join_185: {
    forest_join_176: {
    forest_join_166: {
    forest_join_137: {
    forest_join_136: {
    forest_join_131: {
    forest_join_128: {
    forest_join_123: {
    forest_join_122: {
    forest_join_113: {
    forest_join_112: {
    forest_join_100: {
    forest_join_96: {
    life6_3 = (__fieldRead1054_0() ^ 81080953020506L);
    __call1054_1();
    if (!((p0 == __fieldRead1054_2()))) {
        break forest_join_100;
    }
    if (!((!__fieldRead1054_3()))) {
        break forest_join_100;
    }
    __call1054_6(__fieldRead1054_5(__fieldRead1054_4(receiver)), "translucent_sort");
    life8_21 = (__fieldRead1054_7(p3) - __fieldRead1054_8(receiver));
    life10_27 = (__fieldRead1054_9(p3) - __fieldRead1054_10(receiver));
    life12_33 = (__fieldRead1054_11(p3) - __fieldRead1054_12(receiver));
    if (!((__numericCompare1054_13((((life8_21 * life8_21) + (life10_27 * life10_27)) + (life12_33 * life12_33)), 0x1.0p0d) > 0))) {
        break forest_join_96;
    }
    __fieldWrite1054_15(receiver, __fieldRead1054_14(p3));
    __fieldWrite1054_17(receiver, __fieldRead1054_16(p3));
    __fieldWrite1054_19(receiver, __fieldRead1054_18(p3));
    life14_61 = 0;
    __call1054_21(__fieldRead1054_20(receiver));
    life15_68 = __call1054_23(__fieldRead1054_22(receiver));
    forest_cycle_68: while (true) {
    forest_join_95: {
    if (!(__call1054_24(life15_68))) {
        break forest_join_96;
    }
    life16_75 = __cast1054_26(__call1054_25(life15_68));
    if (!(__call1054_29(__fieldRead1054_28(__fieldRead1054_27(life16_75)), p0))) {
        break forest_join_95;
    }
    if (!(((life14_61++) < __invokedynamic1054_30(4737, (7645950656323249083L ^ life6_3))))) {
        break forest_join_95;
    }
    __call1054_33(__fieldRead1054_31(receiver), __fieldRead1054_32(life16_75));
    }
    continue forest_cycle_68;
    }
    }
    __call1054_36(__fieldRead1054_35(__fieldRead1054_34(receiver)));
    }
    __call1054_39(__fieldRead1054_38(__fieldRead1054_37(receiver)), "filterempty");
    life8_109 = 0;
    if (!((p0 == __fieldRead1054_40()))) {
        break forest_join_112;
    }
    forestValue1054_113_0 = 1;
    break forest_join_113;
    }
    forestValue1054_113_0 = 0;
    }
    life9_116 = forestValue1054_113_0;
    if (!((life9_116 != 0))) {
        break forest_join_122;
    }
    forestValue1054_123_0 = (__call1054_42(__fieldRead1054_41(receiver)) - 1);
    break forest_join_123;
    }
    forestValue1054_123_0 = 0;
    }
    life10_126 = forestValue1054_123_0;
    if (!((life9_116 != 0))) {
        break forest_join_128;
    }
    forestValue1054_131_0 = -1;
    break forest_join_131;
    }
    forestValue1054_131_0 = __call1054_44(__fieldRead1054_43(receiver));
    }
    life11_134 = forestValue1054_131_0;
    if (!((life9_116 != 0))) {
        break forest_join_136;
    }
    forestValue1054_137_0 = -1;
    break forest_join_137;
    }
    forestValue1054_137_0 = 1;
    }
    life12_140 = forestValue1054_137_0;
    life13_142 = life10_126;
    forest_cycle_140: while (true) {
    forest_join_161: {
    if (!((life13_142 != life11_134))) {
        break forest_join_166;
    }
    life14_152 = __fieldRead1054_48(__cast1054_47(__call1054_46(__fieldRead1054_45(receiver), life13_142)));
    if (!((!__call1054_50(__call1054_49(life14_152), p0)))) {
        break forest_join_161;
    }
    life8_109 += 1;
    __call1054_52(__fieldRead1054_51(receiver), life14_152, p0);
    }
    life13_142 = (life13_142 + life12_140);
    continue forest_cycle_140;
    }
    }
    if (!((life8_109 != 0))) {
        break forest_join_185;
    }
    if (!(__call1054_53())) {
        break forest_join_176;
    }
    if (!(__fieldRead1054_56(__fieldRead1054_55(__fieldRead1054_54(receiver))))) {
        break forest_join_176;
    }
    __call1054_57();
    }
    __call1054_61(__fieldRead1054_59(__fieldRead1054_58(receiver)), __invokedynamic1054_60(p0));
    __call1054_62(receiver, p0);
    }
    __call1054_65(__fieldRead1054_64(__fieldRead1054_63(receiver)));
    return life8_109;
}
public static int h1054_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3105400_0(p0);
}
public static int h1054_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3105401_0(p0);
}
public static int h1054_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3105402_0(p0);
}
public static int h1054_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3105403_0(p0);
}
public static int h1054_4(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3105404_0(p0);
}
public static int h1054_5(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3105405_0(p0);
}
public static int h1054_6(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3105406_0(p0);
}
public static int h1054_7(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3105407_0(p0);
}
public static int h1054_8(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3105408_0(p0);
}
public static int h1054_9(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3105409_0(p0);
}
public static int h1054_10(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3105410_0(p0);
}
private static native long __fieldRead1054_0() throws Throwable;
private static native void __call1054_1() throws Throwable;
private static native net.minecraft.util.EnumWorldBlockLayer __fieldRead1054_2() throws Throwable;
private static native boolean __fieldRead1054_3() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1054_4(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.A9 __fieldRead1054_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1054_6(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native double __fieldRead1054_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1054_8(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native double __fieldRead1054_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1054_10(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native double __fieldRead1054_11(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1054_12(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __numericCompare1054_13(double a0, double a1) throws Throwable;
private static native double __fieldRead1054_14(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite1054_15(net.minecraft.client.renderer.RenderGlobal a0, double a1) throws Throwable;
private static native double __fieldRead1054_16(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite1054_17(net.minecraft.client.renderer.RenderGlobal a0, double a1) throws Throwable;
private static native double __fieldRead1054_18(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite1054_19(net.minecraft.client.renderer.RenderGlobal a0, double a1) throws Throwable;
private static native java.util.Set __fieldRead1054_20(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call1054_21(java.util.Set a0) throws Throwable;
private static native java.util.List __fieldRead1054_22(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.util.Iterator __call1054_23(java.util.List a0) throws Throwable;
private static native boolean __call1054_24(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1054_25(java.util.Iterator a0) throws Throwable;
private static native moom.ls __cast1054_26(java.lang.Object a0) throws Throwable;
private static native moom.mp __fieldRead1054_27(moom.ls a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.CompiledChunk __fieldRead1054_28(moom.mp a0) throws Throwable;
private static native boolean __call1054_29(net.minecraft.client.renderer.chunk.CompiledChunk a0, net.minecraft.util.EnumWorldBlockLayer a1) throws Throwable;
private static native int __invokedynamic1054_30(int a0, long a1) throws Throwable;
private static native java.util.Set __fieldRead1054_31(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.mp __fieldRead1054_32(moom.ls a0) throws Throwable;
private static native boolean __call1054_33(java.util.Set a0, moom.mp a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1054_34(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.A9 __fieldRead1054_35(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1054_36(moom.A9 a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1054_37(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.A9 __fieldRead1054_38(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1054_39(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.util.EnumWorldBlockLayer __fieldRead1054_40() throws Throwable;
private static native java.util.List __fieldRead1054_41(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __call1054_42(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead1054_43(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __call1054_44(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead1054_45(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.lang.Object __call1054_46(java.util.List a0, int a1) throws Throwable;
private static native moom.ls __cast1054_47(java.lang.Object a0) throws Throwable;
private static native moom.mp __fieldRead1054_48(moom.ls a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.CompiledChunk __call1054_49(moom.mp a0) throws Throwable;
private static native boolean __call1054_50(net.minecraft.client.renderer.chunk.CompiledChunk a0, net.minecraft.util.EnumWorldBlockLayer a1) throws Throwable;
private static native moom.kR __fieldRead1054_51(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call1054_52(moom.kR a0, moom.mp a1, net.minecraft.util.EnumWorldBlockLayer a2) throws Throwable;
private static native boolean __call1054_53() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1054_54(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.renderer.EntityRenderer __fieldRead1054_55(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead1054_56(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call1054_57() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1054_58(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.A9 __fieldRead1054_59(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __invokedynamic1054_60(net.minecraft.util.EnumWorldBlockLayer a0) throws Throwable;
private static native void __call1054_61(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native void __call1054_62(net.minecraft.client.renderer.RenderGlobal a0, net.minecraft.util.EnumWorldBlockLayer a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1054_63(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.A9 __fieldRead1054_64(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1054_65(moom.A9 a0) throws Throwable;
private static native java.lang.Throwable __call3105400_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3105401_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3105402_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3105403_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3105404_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3105405_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3105406_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3105407_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3105408_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3105409_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3105410_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_99200fd2c9d720704f53(net.minecraft.client.renderer.RenderGlobal a0) throws E;
private static final class __SourceHandler_99200fd2c9d720704f53 {

public static boolean f1404(net.minecraft.client.renderer.RenderGlobal receiver) throws Throwable {
    int forwardValue1404_28_0;
    forward_join_28: {
    forward_join_27: {
    if (!((!__call1404_0()))) {
        break forward_join_27;
    }
    if (!((!__call1404_1()))) {
        break forward_join_27;
    }
    if (!((__fieldRead1404_2(receiver) != null))) {
        break forward_join_27;
    }
    if (!((__fieldRead1404_3(receiver) != null))) {
        break forward_join_27;
    }
    if (!((__fieldRead1404_5(__fieldRead1404_4(receiver)) != null))) {
        break forward_join_27;
    }
    if (!(__call1404_8(__fieldRead1404_7(__fieldRead1404_6(receiver))))) {
        break forward_join_27;
    }
    if (!(__call1404_12(__fieldRead1404_11(__fieldRead1404_10(__fieldRead1404_9(receiver)))))) {
        break forward_join_27;
    }
    forwardValue1404_28_0 = 1;
    break forward_join_28;
    }
    forwardValue1404_28_0 = 0;
    }
    return __integerCategory1404_13(forwardValue1404_28_0);
}
public static void h1404_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1140400_0(p0);
}
public static void h1404_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1140401_0(p0);
}
public static void h1404_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1140402_0(p0);
}
public static void h1404_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1140403_0(p0);
}
public static void h1404_4(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1140404_0(p0);
}
public static void h1404_5(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1140405_0(p0);
}
public static void h1404_6(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1140406_0(p0);
}
private static native boolean __call1404_0() throws Throwable;
private static native boolean __call1404_1() throws Throwable;
private static native net.minecraft.client.shader.Framebuffer __fieldRead1404_2(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.shader.ShaderGroup __fieldRead1404_3(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1404_4(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1404_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1404_6(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1404_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call1404_8(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1404_9(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1404_10(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead1404_11(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call1404_12(moom.pz a0) throws Throwable;
private static native boolean __integerCategory1404_13(int value) throws Throwable;
private static native java.lang.Throwable __call1140400_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1140401_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1140402_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1140403_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1140404_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1140405_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1140406_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_4fac1fbea5c9c1e3e66c(net.minecraft.client.renderer.RenderGlobal a0) throws E;
private static final class __SourceHandler_4fac1fbea5c9c1e3e66c {

public static java.lang.String f602(net.minecraft.client.renderer.RenderGlobal receiver) throws Throwable {
    java.lang.String forestValue602_51_0;
    java.lang.Object[] forestValue602_51_1;
    java.lang.Object[] forestValue602_51_2;
    int forestValue602_51_3;
    java.lang.String forestValue602_52_0;
    java.lang.Object[] forestValue602_52_1;
    java.lang.Object[] forestValue602_52_2;
    int forestValue602_52_3;
    java.lang.String forestValue602_52_4;
    java.lang.String spill602_0;
    java.lang.Object[] spill602_1;
    java.lang.Object[] spill602_2;
    java.lang.Object[] spill602_3;
    java.lang.Object[] spill602_4;
    int spill602_5;
    java.lang.Object[] spill602_6;
    java.lang.Object[] spill602_7;
    int life1_4;
    int life2_6;
    java.util.Iterator life3_10;
    moom.ls life4_17;
    net.minecraft.client.renderer.chunk.CompiledChunk life5_21;
    forest_join_52: {
    forest_join_51: {
    forest_join_30: {
    life1_4 = (__fieldRead602_1(__fieldRead602_0(receiver))).length;
    life2_6 = 0;
    life3_10 = __call602_3(__fieldRead602_2(receiver));
    forest_cycle_11: while (true) {
    forest_join_29: {
    if (!(__call602_4(life3_10))) {
        break forest_join_30;
    }
    life4_17 = __cast602_6(__call602_5(life3_10));
    life5_21 = __fieldRead602_8(__fieldRead602_7(life4_17));
    if (!((life5_21 != __fieldRead602_9()))) {
        break forest_join_29;
    }
    if (!((!__call602_10(life5_21)))) {
        break forest_join_29;
    }
    life2_6 += 1;
    }
    continue forest_cycle_11;
    }
    }
    spill602_0 = "C: %d/%d %sD: %d, %s";
    java.lang.Object[] __stackOp602_11_0 = new java.lang.Object[5];
    spill602_1 = __stackOp602_11_0;
    (__stackOp602_11_0)[0] = __call602_12(life2_6);
    java.lang.Object[] __stackOp602_13_0 = spill602_1;
    spill602_2 = __stackOp602_13_0;
    (__stackOp602_13_0)[1] = __call602_14(life1_4);
    java.lang.Object[] __stackOp602_15_0 = spill602_2;
    spill602_3 = __stackOp602_15_0;
    spill602_4 = __stackOp602_15_0;
    spill602_5 = 2;
    if (!(__fieldRead602_17(__fieldRead602_16(receiver)))) {
        forestValue602_51_0 = spill602_0;
        forestValue602_51_1 = spill602_3;
        forestValue602_51_2 = spill602_4;
        forestValue602_51_3 = spill602_5;
        break forest_join_51;
    }
    forestValue602_52_0 = spill602_0;
    forestValue602_52_1 = spill602_3;
    forestValue602_52_2 = spill602_4;
    forestValue602_52_3 = spill602_5;
    forestValue602_52_4 = "(s) ";
    break forest_join_52;
    }
    forestValue602_52_0 = forestValue602_51_0;
    forestValue602_52_1 = forestValue602_51_1;
    forestValue602_52_2 = forestValue602_51_2;
    forestValue602_52_3 = forestValue602_51_3;
    forestValue602_52_4 = "";
    }
    (forestValue602_52_2)[forestValue602_52_3] = forestValue602_52_4;
    java.lang.Object[] __stackOp602_18_0 = forestValue602_52_1;
    spill602_6 = __stackOp602_18_0;
    (__stackOp602_18_0)[3] = __call602_20(__fieldRead602_19(receiver));
    java.lang.Object[] __stackOp602_21_0 = spill602_6;
    spill602_7 = __stackOp602_21_0;
    (__stackOp602_21_0)[4] = __call602_23(__fieldRead602_22(receiver));
    return __call602_24(forestValue602_52_0, spill602_7);
}
public static java.lang.String h602_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060200_0(p0);
}
public static java.lang.String h602_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060201_0(p0);
}
public static java.lang.String h602_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060202_0(p0);
}
private static native moom.lv __fieldRead602_0(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.mp[] __fieldRead602_1(moom.lv a0) throws Throwable;
private static native java.util.List __fieldRead602_2(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.util.Iterator __call602_3(java.util.List a0) throws Throwable;
private static native boolean __call602_4(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call602_5(java.util.Iterator a0) throws Throwable;
private static native moom.ls __cast602_6(java.lang.Object a0) throws Throwable;
private static native moom.mp __fieldRead602_7(moom.ls a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.CompiledChunk __fieldRead602_8(moom.mp a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.CompiledChunk __fieldRead602_9() throws Throwable;
private static native boolean __call602_10(net.minecraft.client.renderer.chunk.CompiledChunk a0) throws Throwable;
private static native java.lang.Integer __call602_12(int a0) throws Throwable;
private static native java.lang.Integer __call602_14(int a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead602_16(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __fieldRead602_17(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead602_19(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.lang.Integer __call602_20(int a0) throws Throwable;
private static native moom.mi __fieldRead602_22(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.lang.String __call602_23(moom.mi a0) throws Throwable;
private static native java.lang.String __call602_24(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.Throwable __call3060200_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060201_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060202_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_cc387acd787f29441489(net.minecraft.client.renderer.RenderGlobal a0) throws E;
private static final class __SourceHandler_cc387acd787f29441489 {

public static void f2535(net.minecraft.client.renderer.RenderGlobal receiver) throws Throwable {
    net.minecraft.client.renderer.texture.TextureMap life1_3;
    int life2_5;
    life1_3 = __call2535_1(__fieldRead2535_0(receiver));
    life2_5 = 0;
    loop_region_6: while ((life2_5 < (__fieldRead2535_2(receiver)).length)) {
        (__fieldRead2535_3(receiver))[life2_5] = __call2535_5(life1_3, __invokedynamic2535_4(life2_5));
        life2_5 += 1;
    }
    return;
}
public static void h2535_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1253500_0(p0);
}
private static native net.minecraft.client.Minecraft __fieldRead2535_0(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureMap __call2535_1(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead2535_2(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead2535_3(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.lang.String __invokedynamic2535_4(int a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call2535_5(net.minecraft.client.renderer.texture.TextureMap a0, java.lang.String a1) throws Throwable;
private static native java.lang.Throwable __call1253500_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_9f6e4c574bf4aceb48b6(net.minecraft.client.renderer.RenderGlobal a0, float a1, int a2) throws E;
private static final class __SourceHandler_9f6e4c574bf4aceb48b6 {

public static void f2536(net.minecraft.client.renderer.RenderGlobal receiver, float p0, int p1) throws Throwable {
    long life3_3;
    moom.DR life5_37;
    float life1_51;
    float life6_71;
    net.minecraft.client.renderer.Tessellator life7_73;
    moom.lw life8_76;
    float life9_101;
    float life10_105;
    float life11_109;
    float life12_126;
    float life13_136;
    float life14_146;
    double life12_159;
    double life14_181;
    double life16_199;
    int life18_204;
    int life19_209;
    double life14_220;
    double life16_231;
    float life20_240;
    float life20_249;
    float life21_254;
    float life22_259;
    int life23_273;
    int life24_286;
    life3_3 = (__fieldRead2536_0() ^ 23755951054050L);
    if ((!__call2536_1())) {
        if (__call2536_5(__fieldRead2536_4(__fieldRead2536_3(__fieldRead2536_2(receiver))))) {
        if (__call2536_6()) {
        __call2536_7();
    }
        if (__call2536_8()) {
        __call2536_9(receiver, p0, p1);
    } else {
        life5_37 = __call2536_11(__fieldRead2536_10(receiver), p0);
        int spill2536_0 = 21947;
        __call2536_14(__fieldRead2536_12(receiver), 0, __fieldRead2536_13(receiver), p0, life5_37);
        long spill2536_1 = (6244773043874830372L ^ life3_3);
        life1_51 = 0x0.0p0f;
        __call2536_15();
        life6_71 = ((float) (__fieldRead2536_18(__call2536_17(__fieldRead2536_16(receiver))) + ((__fieldRead2536_21(__call2536_20(__fieldRead2536_19(receiver))) - __fieldRead2536_24(__call2536_23(__fieldRead2536_22(receiver)))) * ((double) life1_51))));
        life7_73 = __call2536_25();
        life8_76 = __call2536_26(life7_73);
        __call2536_29(__fieldRead2536_27(receiver), __fieldRead2536_28());
        __call2536_30();
        __call2536_33(__invokedynamic2536_31(spill2536_0, spill2536_1), __invokedynamic2536_32(27667, (3110729029095530907L ^ life3_3)), 1, 0);
        if (__call2536_35(__fieldRead2536_34(receiver))) {
        __call2536_37(__fieldRead2536_36(receiver));
        life9_101 = ((float) __fieldRead2536_38(life5_37));
        life10_105 = ((float) __fieldRead2536_39(life5_37));
        life11_109 = ((float) __fieldRead2536_40(life5_37));
        if ((p1 != 2)) {
        life12_126 = ((((life9_101 * 0x1.ep4f) + (life10_105 * 0x1.d8p5f)) + (life11_109 * 0x1.6p3f)) / 0x1.9p6f);
        life13_136 = (((life9_101 * 0x1.ep4f) + (life10_105 * 0x1.18p6f)) / 0x1.9p6f);
        life14_146 = (((life9_101 * 0x1.ep4f) + (life11_109 * 0x1.18p6f)) / 0x1.9p6f);
        life9_101 = life12_126;
        life10_105 = life13_136;
        life11_109 = life14_146;
    }
        life12_159 = ((double) (((float) __fieldRead2536_41(receiver)) + life1_51));
        life14_181 = ((__fieldRead2536_44(__call2536_43(__fieldRead2536_42(receiver))) + ((__fieldRead2536_47(__call2536_46(__fieldRead2536_45(receiver))) - __fieldRead2536_50(__call2536_49(__fieldRead2536_48(receiver)))) * ((double) life1_51))) + (life12_159 * 0x1.eb851ep-6d));
        life16_199 = (__fieldRead2536_53(__call2536_52(__fieldRead2536_51(receiver))) + ((__fieldRead2536_56(__call2536_55(__fieldRead2536_54(receiver))) - __fieldRead2536_59(__call2536_58(__fieldRead2536_57(receiver)))) * ((double) life1_51)));
        life18_204 = __call2536_60((life14_181 / 0x1.0p11d));
        life19_209 = __call2536_61((life16_199 / 0x1.0p11d));
        life14_220 = (life14_181 - ((double) (life18_204 * __invokedynamic2536_62(7953, (2021708226866598570L ^ life3_3)))));
        life16_231 = (life16_199 - ((double) (life19_209 * __invokedynamic2536_63(7953, (2021708226866598570L ^ life3_3)))));
        life20_240 = ((__call2536_66(__fieldRead2536_65(__fieldRead2536_64(receiver))) - life6_71) + 0x1.51eb86p-2f);
        life20_249 = (life20_240 + (__fieldRead2536_69(__fieldRead2536_68(__fieldRead2536_67(receiver))) * 0x1.0p7f));
        life21_254 = ((float) (life14_220 * 0x1.0p-11d));
        life22_259 = ((float) (life16_231 * 0x1.0p-11d));
        __call2536_72(life8_76, __invokedynamic2536_70(140, (5506098865832643922L ^ life3_3)), __fieldRead2536_71());
        life23_273 = __invokedynamic2536_73(13687, (8416888547955931354L ^ life3_3));
        loop_region_263: while ((life23_273 < __invokedynamic2536_74(15501, (5303448645421363494L ^ life3_3)))) {
        life24_286 = __invokedynamic2536_75(13215, (6947125199361605122L ^ life3_3));
        loop_region_276: while ((life24_286 < __invokedynamic2536_76(15501, (5303448645421363494L ^ life3_3)))) {
        __call2536_82(__call2536_81(__call2536_80(__call2536_78(life8_76, ((double) life23_273), ((double) life20_249), ((double) (life24_286 + __invokedynamic2536_77(8236, (2742593974400970164L ^ life3_3))))), ((double) ((((float) life23_273) * 0x1.0p-11f) + life21_254)), ((double) ((((float) (life24_286 + __invokedynamic2536_79(20995, (6794189241108602838L ^ life3_3)))) * 0x1.0p-11f) + life22_259))), life9_101, life10_105, life11_109, 0x1.99999ap-1f));
        __call2536_90(__call2536_89(__call2536_88(__call2536_85(life8_76, ((double) (life23_273 + __invokedynamic2536_83(20995, (6794189241108602838L ^ life3_3)))), ((double) life20_249), ((double) (life24_286 + __invokedynamic2536_84(20995, (6794189241108602838L ^ life3_3))))), ((double) ((((float) (life23_273 + __invokedynamic2536_86(20995, (6794189241108602838L ^ life3_3)))) * 0x1.0p-11f) + life21_254)), ((double) ((((float) (life24_286 + __invokedynamic2536_87(20995, (6794189241108602838L ^ life3_3)))) * 0x1.0p-11f) + life22_259))), life9_101, life10_105, life11_109, 0x1.99999ap-1f));
        __call2536_96(__call2536_95(__call2536_94(__call2536_92(life8_76, ((double) (life23_273 + __invokedynamic2536_91(20995, (6794189241108602838L ^ life3_3)))), ((double) life20_249), ((double) life24_286)), ((double) ((((float) (life23_273 + __invokedynamic2536_93(20995, (6794189241108602838L ^ life3_3)))) * 0x1.0p-11f) + life21_254)), ((double) ((((float) life24_286) * 0x1.0p-11f) + life22_259))), life9_101, life10_105, life11_109, 0x1.99999ap-1f));
        __call2536_100(__call2536_99(__call2536_98(__call2536_97(life8_76, ((double) life23_273), ((double) life20_249), ((double) life24_286)), ((double) ((((float) life23_273) * 0x1.0p-11f) + life21_254)), ((double) ((((float) life24_286) * 0x1.0p-11f) + life22_259))), life9_101, life10_105, life11_109, 0x1.99999ap-1f));
        life24_286 += 32;
    }
        life23_273 += 32;
    }
        __call2536_101(life7_73);
        __call2536_103(__fieldRead2536_102(receiver));
    }
        __call2536_105(__fieldRead2536_104(receiver));
        __call2536_106(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
        __call2536_107();
        __call2536_108();
    }
        if (__call2536_109()) {
        __call2536_110();
    }
    }
    }
    return;
}
public static void h2536_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1253600_0(p0);
}
public static void h2536_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1253601_0(p0);
}
public static void h2536_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1253602_0(p0);
}
public static void h2536_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1253603_0(p0);
}
public static void h2536_4(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1253604_0(p0);
}
public static void h2536_5(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1253605_0(p0);
}
private static native long __fieldRead2536_0() throws Throwable;
private static native boolean __call2536_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2536_2(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead2536_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.EA __fieldRead2536_4(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native boolean __call2536_5(moom.EA a0) throws Throwable;
private static native boolean __call2536_6() throws Throwable;
private static native void __call2536_7() throws Throwable;
private static native boolean __call2536_8() throws Throwable;
private static native void __call2536_9(net.minecraft.client.renderer.RenderGlobal a0, float a1, int a2) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead2536_10(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.DR __call2536_11(net.minecraft.client.multiplayer.WorldClient a0, float a1) throws Throwable;
private static native moom.Mf __fieldRead2536_12(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __fieldRead2536_13(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call2536_14(moom.Mf a0, int a1, int a2, float a3, moom.DR a4) throws Throwable;
private static native void __call2536_15() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2536_16(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call2536_17(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead2536_18(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2536_19(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call2536_20(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead2536_21(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2536_22(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call2536_23(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead2536_24(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.renderer.Tessellator __call2536_25() throws Throwable;
private static native moom.lw __call2536_26(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __fieldRead2536_27(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.DD __fieldRead2536_28() throws Throwable;
private static native void __call2536_29(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native void __call2536_30() throws Throwable;
private static native int __invokedynamic2536_31(int a0, long a1) throws Throwable;
private static native int __invokedynamic2536_32(int a0, long a1) throws Throwable;
private static native void __call2536_33(int a0, int a1, int a2, int a3) throws Throwable;
private static native moom.Mf __fieldRead2536_34(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call2536_35(moom.Mf a0) throws Throwable;
private static native moom.Mf __fieldRead2536_36(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call2536_37(moom.Mf a0) throws Throwable;
private static native double __fieldRead2536_38(moom.DR a0) throws Throwable;
private static native double __fieldRead2536_39(moom.DR a0) throws Throwable;
private static native double __fieldRead2536_40(moom.DR a0) throws Throwable;
private static native int __fieldRead2536_41(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2536_42(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call2536_43(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead2536_44(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2536_45(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call2536_46(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead2536_47(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2536_48(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call2536_49(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead2536_50(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2536_51(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call2536_52(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead2536_53(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2536_54(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call2536_55(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead2536_56(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2536_57(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call2536_58(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead2536_59(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call2536_60(double a0) throws Throwable;
private static native int __call2536_61(double a0) throws Throwable;
private static native int __invokedynamic2536_62(int a0, long a1) throws Throwable;
private static native int __invokedynamic2536_63(int a0, long a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead2536_64(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.EA __fieldRead2536_65(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native float __call2536_66(moom.EA a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2536_67(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2536_68(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead2536_69(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __invokedynamic2536_70(int a0, long a1) throws Throwable;
private static native moom.oD __fieldRead2536_71() throws Throwable;
private static native void __call2536_72(moom.lw a0, int a1, moom.oD a2) throws Throwable;
private static native int __invokedynamic2536_73(int a0, long a1) throws Throwable;
private static native int __invokedynamic2536_74(int a0, long a1) throws Throwable;
private static native int __invokedynamic2536_75(int a0, long a1) throws Throwable;
private static native int __invokedynamic2536_76(int a0, long a1) throws Throwable;
private static native int __invokedynamic2536_77(int a0, long a1) throws Throwable;
private static native moom.lw __call2536_78(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic2536_79(int a0, long a1) throws Throwable;
private static native moom.lw __call2536_80(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call2536_81(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native void __call2536_82(moom.lw a0) throws Throwable;
private static native int __invokedynamic2536_83(int a0, long a1) throws Throwable;
private static native int __invokedynamic2536_84(int a0, long a1) throws Throwable;
private static native moom.lw __call2536_85(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic2536_86(int a0, long a1) throws Throwable;
private static native int __invokedynamic2536_87(int a0, long a1) throws Throwable;
private static native moom.lw __call2536_88(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call2536_89(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native void __call2536_90(moom.lw a0) throws Throwable;
private static native int __invokedynamic2536_91(int a0, long a1) throws Throwable;
private static native moom.lw __call2536_92(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic2536_93(int a0, long a1) throws Throwable;
private static native moom.lw __call2536_94(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call2536_95(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native void __call2536_96(moom.lw a0) throws Throwable;
private static native moom.lw __call2536_97(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call2536_98(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call2536_99(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native void __call2536_100(moom.lw a0) throws Throwable;
private static native void __call2536_101(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native moom.Mf __fieldRead2536_102(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call2536_103(moom.Mf a0) throws Throwable;
private static native moom.Mf __fieldRead2536_104(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call2536_105(moom.Mf a0) throws Throwable;
private static native void __call2536_106(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call2536_107() throws Throwable;
private static native void __call2536_108() throws Throwable;
private static native boolean __call2536_109() throws Throwable;
private static native void __call2536_110() throws Throwable;
private static native java.lang.Throwable __call1253600_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1253601_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1253602_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1253603_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1253604_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1253605_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_7a36e39a1cc20c105b42(net.minecraft.client.renderer.RenderGlobal a0, int a1, moom.DT a2, int a3) throws E;
private static final class __SourceHandler_7a36e39a1cc20c105b42 {

public static void f1405(net.minecraft.client.renderer.RenderGlobal receiver, int p0, moom.DT p1, int p2) throws Throwable {
    long life4_3;
    moom.kU life6_22;
    forward_join_67: {
    forward_join_61: {
    forward_join_53: {
    forward_join_40: {
    life4_3 = (__fieldRead1405_0() ^ 84496666409702L);
    if (!((p2 >= 0))) { break forward_join_61; }
    if (!((p2 < __invokedynamic1405_1(26135, (5738775545525603713L ^ life4_3))))) { break forward_join_61; }
    life6_22 = __cast1405_5(__call1405_4(__fieldRead1405_2(receiver), __call1405_3(p0)));
    if (!((life6_22 != null))) { break forward_join_40; }
    if (!((__call1405_7(__call1405_6(life6_22)) == __call1405_8(p1)))) { break forward_join_40; }
    if (!((__call1405_10(__call1405_9(life6_22)) == __call1405_11(p1)))) { break forward_join_40; }
    if (!((__call1405_13(__call1405_12(life6_22)) != __call1405_14(p1)))) { break forward_join_53; }
    }
    life6_22 = new moom.kU(p0, p1);
    __call1405_17(__fieldRead1405_15(receiver), __call1405_16(p0), life6_22);
    }
    __call1405_18(life6_22, p2);
    __call1405_20(life6_22, __fieldRead1405_19(receiver));
    break forward_join_67;
    }
    __call1405_23(__fieldRead1405_21(receiver), __call1405_22(p0));
    }
    return;
}
public static void h1405_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1140500_0(p0);
}
public static void h1405_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1140501_0(p0);
}
public static void h1405_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1140502_0(p0);
}
public static void h1405_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1140503_0(p0);
}
private static native long __fieldRead1405_0() throws Throwable;
private static native int __invokedynamic1405_1(int a0, long a1) throws Throwable;
private static native java.util.Map __fieldRead1405_2(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.lang.Integer __call1405_3(int a0) throws Throwable;
private static native java.lang.Object __call1405_4(java.util.Map a0, java.lang.Integer a1) throws Throwable;
private static native moom.kU __cast1405_5(java.lang.Object a0) throws Throwable;
private static native moom.DT __call1405_6(moom.kU a0) throws Throwable;
private static native int __call1405_7(moom.DT a0) throws Throwable;
private static native int __call1405_8(moom.DT a0) throws Throwable;
private static native moom.DT __call1405_9(moom.kU a0) throws Throwable;
private static native int __call1405_10(moom.DT a0) throws Throwable;
private static native int __call1405_11(moom.DT a0) throws Throwable;
private static native moom.DT __call1405_12(moom.kU a0) throws Throwable;
private static native int __call1405_13(moom.DT a0) throws Throwable;
private static native int __call1405_14(moom.DT a0) throws Throwable;
private static native java.util.Map __fieldRead1405_15(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.lang.Integer __call1405_16(int a0) throws Throwable;
private static native java.lang.Object __call1405_17(java.util.Map a0, java.lang.Integer a1, moom.kU a2) throws Throwable;
private static native void __call1405_18(moom.kU a0, int a1) throws Throwable;
private static native int __fieldRead1405_19(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call1405_20(moom.kU a0, int a1) throws Throwable;
private static native java.util.Map __fieldRead1405_21(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.lang.Integer __call1405_22(int a0) throws Throwable;
private static native java.lang.Object __call1405_23(java.util.Map a0, java.lang.Integer a1) throws Throwable;
private static native java.lang.Throwable __call1140500_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1140501_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1140502_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1140503_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_747ceebc0d1507433af0(net.minecraft.client.renderer.RenderGlobal a0) throws E;
private static final class __SourceHandler_747ceebc0d1507433af0 {

public static boolean f1406(net.minecraft.client.renderer.RenderGlobal receiver) throws Throwable {
    int forwardValue1406_11_0;
    forward_join_11: {
    forward_join_10: {
    if (!(__call1406_1(__fieldRead1406_0(receiver)))) {
        break forward_join_10;
    }
    if (!(__call1406_3(__fieldRead1406_2(receiver)))) {
        break forward_join_10;
    }
    forwardValue1406_11_0 = 1;
    break forward_join_11;
    }
    forwardValue1406_11_0 = 0;
    }
    return __integerCategory1406_4(forwardValue1406_11_0);
}
public static void h1406_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1140600_0(p0);
}
public static void h1406_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1140601_0(p0);
}
private static native java.util.Set __fieldRead1406_0(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call1406_1(java.util.Set a0) throws Throwable;
private static native moom.mi __fieldRead1406_2(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call1406_3(moom.mi a0) throws Throwable;
private static native boolean __integerCategory1406_4(int value) throws Throwable;
private static native java.lang.Throwable __call1140600_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1140601_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_973b52d31c874e2b499f(net.minecraft.client.renderer.RenderGlobal a0) throws E;
private static final class __SourceHandler_973b52d31c874e2b499f {

public static void f603(net.minecraft.client.renderer.RenderGlobal receiver) throws Throwable {
    moom.DD life1_11;
    forest_join_47: {
    forest_join_41: {
    forest_join_5: {
    if (!(__fieldRead603_0())) {
        break forest_join_41;
    }
    if (!((__call603_1() == null))) {
        break forest_join_5;
    }
    __call603_2();
    }
    life1_11 = new moom.DD("shaders/post/entity_outline.json");
    __fieldWrite603_9(receiver, new net.minecraft.client.shader.ShaderGroup(__call603_4(__fieldRead603_3(receiver)), __call603_6(__fieldRead603_5(receiver)), __call603_8(__fieldRead603_7(receiver)), life1_11));
    __call603_15(__fieldRead603_10(receiver), __fieldRead603_12(__fieldRead603_11(receiver)), __fieldRead603_14(__fieldRead603_13(receiver)));
    __fieldWrite603_18(receiver, __call603_17(__fieldRead603_16(receiver), "final"));
    break forest_join_47;
    }
    __fieldWrite603_19(receiver, null);
    __fieldWrite603_20(receiver, null);
    }
    return;
}
public static void h603_0(java.io.IOException p0) throws Throwable {
    throw __call3060300_0(p0);
}
public static void h603_1(java.io.IOException p0) throws Throwable {
    throw __call3060301_0(p0);
}
public static void h603_2(java.lang.Exception p0, net.minecraft.client.renderer.RenderGlobal p1, moom.DD p2) throws Throwable {
    java.lang.Exception life3_2;
    life3_2 = p0;
    __call3060302_2(__fieldRead3060302_0(), __invokedynamic3060302_1(p2), life3_2);
    __fieldWrite3060302_3(p1, null);
    __fieldWrite3060302_4(p1, null);
    return;
}
private static native boolean __fieldRead603_0() throws Throwable;
private static native moom.pD __call603_1() throws Throwable;
private static native void __call603_2() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead603_3(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call603_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead603_5(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.oR __call603_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead603_7(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.shader.Framebuffer __call603_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite603_9(net.minecraft.client.renderer.RenderGlobal a0, net.minecraft.client.shader.ShaderGroup a1) throws Throwable;
private static native net.minecraft.client.shader.ShaderGroup __fieldRead603_10(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead603_11(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __fieldRead603_12(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead603_13(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __fieldRead603_14(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call603_15(net.minecraft.client.shader.ShaderGroup a0, int a1, int a2) throws Throwable;
private static native net.minecraft.client.shader.ShaderGroup __fieldRead603_16(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.shader.Framebuffer __call603_17(net.minecraft.client.shader.ShaderGroup a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite603_18(net.minecraft.client.renderer.RenderGlobal a0, net.minecraft.client.shader.Framebuffer a1) throws Throwable;
private static native void __fieldWrite603_19(net.minecraft.client.renderer.RenderGlobal a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite603_20(net.minecraft.client.renderer.RenderGlobal a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Throwable __call3060300_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3060301_0(java.io.IOException a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3060302_0() throws Throwable;
private static native java.lang.String __invokedynamic3060302_1(moom.DD a0) throws Throwable;
private static native void __call3060302_2(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Exception a2) throws Throwable;
private static native void __fieldWrite3060302_3(net.minecraft.client.renderer.RenderGlobal a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite3060302_4(net.minecraft.client.renderer.RenderGlobal a0, java.lang.Object a1) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_68eaf42e60391ac2bfd5(net.minecraft.client.renderer.RenderGlobal a0, float a1, int a2) throws E;
private static final class __SourceHandler_68eaf42e60391ac2bfd5 {

public static void f604(net.minecraft.client.renderer.RenderGlobal receiver, float p0, int p1) throws Throwable {
    long life3_3;
    moom.DR life5_8;
    float life1_18;
    float life6_38;
    net.minecraft.client.renderer.Tessellator life7_40;
    moom.lw life8_43;
    double life9_50;
    double life11_74;
    double life13_96;
    float life15_105;
    float life15_114;
    int life16_119;
    int life17_124;
    double life11_135;
    double life13_146;
    float life18_168;
    float life19_172;
    float life20_176;
    float life21_193;
    float life22_203;
    float life23_213;
    float life21_223;
    float life22_227;
    float life23_231;
    float life24_235;
    float life25_239;
    float life26_243;
    float life27_247;
    float life28_251;
    float life29_255;
    float life30_257;
    float life31_263;
    float life32_269;
    float life33_276;
    float life34_283;
    int life35_285;
    int life36_287;
    float life37_289;
    int life38_295;
    int life38_344;
    int life39_353;
    float life40_373;
    float life41_382;
    float life42_386;
    float life43_390;
    int life44_741;
    int life44_943;
    int life44_1153;
    int life44_1355;
    forest_join_1567: {
    forest_join_1564: {
    forest_join_331: {
    forest_join_220: {
    life3_3 = (__fieldRead604_0() ^ 26738179174080L);
    life5_8 = __call604_2(__fieldRead604_1(receiver), p0);
    __call604_5(__fieldRead604_3(receiver), 1, __fieldRead604_4(receiver), p0, life5_8);
    life1_18 = 0x0.0p0f;
    __call604_6();
    life6_38 = ((float) (__fieldRead604_9(__call604_8(__fieldRead604_7(receiver))) + ((__fieldRead604_12(__call604_11(__fieldRead604_10(receiver))) - __fieldRead604_15(__call604_14(__fieldRead604_13(receiver)))) * ((double) life1_18))));
    life7_40 = __call604_16();
    life8_43 = __call604_17(life7_40);
    life9_50 = ((double) (((float) __fieldRead604_18(receiver)) + life1_18));
    life11_74 = (((__fieldRead604_21(__call604_20(__fieldRead604_19(receiver))) + ((__fieldRead604_24(__call604_23(__fieldRead604_22(receiver))) - __fieldRead604_27(__call604_26(__fieldRead604_25(receiver)))) * ((double) life1_18))) + (life9_50 * 0x1.eb851ep-6d)) / 0x1.8p3d);
    life13_96 = (((__fieldRead604_30(__call604_29(__fieldRead604_28(receiver))) + ((__fieldRead604_33(__call604_32(__fieldRead604_31(receiver))) - __fieldRead604_36(__call604_35(__fieldRead604_34(receiver)))) * ((double) life1_18))) / 0x1.8p3d) + 0x1.51eb86p-2d);
    life15_105 = ((__call604_39(__fieldRead604_38(__fieldRead604_37(receiver))) - life6_38) + 0x1.51eb86p-2f);
    life15_114 = (life15_105 + (__fieldRead604_42(__fieldRead604_41(__fieldRead604_40(receiver))) * 0x1.0p7f));
    life16_119 = __call604_43((life11_74 / 0x1.0p11d));
    life17_124 = __call604_44((life13_96 / 0x1.0p11d));
    life11_135 = (life11_74 - ((double) (life16_119 * __invokedynamic604_45(29191, (7106625510213471659L ^ life3_3)))));
    life13_146 = (life13_96 - ((double) (life17_124 * __invokedynamic604_46(7953, (2021695265084514440L ^ life3_3)))));
    __call604_49(__fieldRead604_47(receiver), __fieldRead604_48());
    __call604_50();
    __call604_53(__invokedynamic604_51(21947, (6244784270493477382L ^ life3_3)), __invokedynamic604_52(27667, (3110732080222426041L ^ life3_3)), 1, 0);
    life18_168 = ((float) __fieldRead604_54(life5_8));
    life19_172 = ((float) __fieldRead604_55(life5_8));
    life20_176 = ((float) __fieldRead604_56(life5_8));
    if (!((p1 != 2))) {
        break forest_join_220;
    }
    life21_193 = ((((life18_168 * 0x1.ep4f) + (life19_172 * 0x1.d8p5f)) + (life20_176 * 0x1.6p3f)) / 0x1.9p6f);
    life22_203 = (((life18_168 * 0x1.ep4f) + (life19_172 * 0x1.18p6f)) / 0x1.9p6f);
    life23_213 = (((life18_168 * 0x1.ep4f) + (life20_176 * 0x1.18p6f)) / 0x1.9p6f);
    life18_168 = life21_193;
    life19_172 = life22_203;
    life20_176 = life23_213;
    }
    life21_223 = (life18_168 * 0x1.ccccccp-1f);
    life22_227 = (life19_172 * 0x1.ccccccp-1f);
    life23_231 = (life20_176 * 0x1.ccccccp-1f);
    life24_235 = (life18_168 * 0x1.666666p-1f);
    life25_239 = (life19_172 * 0x1.666666p-1f);
    life26_243 = (life20_176 * 0x1.666666p-1f);
    life27_247 = (life18_168 * 0x1.99999ap-1f);
    life28_251 = (life19_172 * 0x1.99999ap-1f);
    life29_255 = (life20_176 * 0x1.99999ap-1f);
    life30_257 = 0x1.0p-8f;
    life31_263 = (((float) __call604_57(life11_135)) * 0x1.0p-8f);
    life32_269 = (((float) __call604_58(life13_146)) * 0x1.0p-8f);
    life33_276 = ((float) (life11_135 - ((double) __call604_59(life11_135))));
    life34_283 = ((float) (life13_146 - ((double) __call604_60(life13_146))));
    life35_285 = 1;
    life36_287 = 1;
    life37_289 = 0x1.0p-10f;
    __call604_61(0x1.8p3f, 0x1.0p0f, 0x1.8p3f);
    life38_295 = 0;
    forest_cycle_296: while (true) {
    forest_join_326: {
    forest_join_321: {
    forest_join_315: {
    forest_join_309: {
    forest_join_307: {
    if (!((life38_295 < 2))) {
        break forest_join_331;
    }
    if (!((life38_295 == 0))) {
        break forest_join_307;
    }
    __call604_62(0, 0, 0, 0);
    break forest_join_326;
    }
    switch (p1) {
case 0:
{
        break forest_join_309;
    }
case 1:
{
        break forest_join_315;
    }
case 2:
{
        break forest_join_321;
    }
default:
{
        break forest_join_326;
    }
}
    }
    __call604_63(0, 1, 1, 1);
    break forest_join_326;
    }
    __call604_64(1, 0, 0, 1);
    break forest_join_326;
    }
    __call604_65(1, 1, 1, 1);
    }
    __call604_67(__fieldRead604_66(receiver));
    life38_295 += 1;
    continue forest_cycle_296;
    }
    }
    if (!(__call604_69(__fieldRead604_68(receiver)))) {
        break forest_join_1567;
    }
    __call604_71(__fieldRead604_70(receiver));
    life38_344 = __invokedynamic604_72(8852, (8264853442901712160L ^ life3_3));
    forest_cycle_344: while (true) {
    forest_join_1562: {
    if (!((life38_344 <= 4))) {
        break forest_join_1564;
    }
    life39_353 = __invokedynamic604_73(4485, (2672749699533549094L ^ life3_3));
    forest_cycle_353: while (true) {
    forest_join_1558: {
    forest_join_1348: {
    forest_join_1146: {
    forest_join_936: {
    forest_join_734: {
    forest_join_558: {
    if (!((life39_353 <= 4))) {
        break forest_join_1562;
    }
    __call604_76(life8_43, __invokedynamic604_74(140, (5506101845104213872L ^ life3_3)), __fieldRead604_75());
    life40_373 = ((float) (life38_344 * __invokedynamic604_77(20434, (1057924044874149930L ^ life3_3))));
    life41_382 = ((float) (life39_353 * __invokedynamic604_78(20434, (1057924044874149930L ^ life3_3))));
    life42_386 = (life40_373 - life33_276);
    life43_390 = (life41_382 - life34_283);
    if (!((__numericCompare604_79(life15_114, -0x1.4p2f) > 0))) {
        break forest_join_558;
    }
    __call604_84(__call604_83(__call604_82(__call604_81(__call604_80(life8_43, ((double) (life42_386 + 0x0.0p0f)), ((double) (life15_114 + 0x0.0p0f)), ((double) (life43_390 + 0x1.0p3f))), ((double) (((life40_373 + 0x0.0p0f) * 0x1.0p-8f) + life31_263)), ((double) (((life41_382 + 0x1.0p3f) * 0x1.0p-8f) + life32_269))), life24_235, life25_239, life26_243, 0x1.99999ap-1f), 0x0.0p0f, -0x1.0p0f, 0x0.0p0f));
    __call604_89(__call604_88(__call604_87(__call604_86(__call604_85(life8_43, ((double) (life42_386 + 0x1.0p3f)), ((double) (life15_114 + 0x0.0p0f)), ((double) (life43_390 + 0x1.0p3f))), ((double) (((life40_373 + 0x1.0p3f) * 0x1.0p-8f) + life31_263)), ((double) (((life41_382 + 0x1.0p3f) * 0x1.0p-8f) + life32_269))), life24_235, life25_239, life26_243, 0x1.99999ap-1f), 0x0.0p0f, -0x1.0p0f, 0x0.0p0f));
    __call604_94(__call604_93(__call604_92(__call604_91(__call604_90(life8_43, ((double) (life42_386 + 0x1.0p3f)), ((double) (life15_114 + 0x0.0p0f)), ((double) (life43_390 + 0x0.0p0f))), ((double) (((life40_373 + 0x1.0p3f) * 0x1.0p-8f) + life31_263)), ((double) (((life41_382 + 0x0.0p0f) * 0x1.0p-8f) + life32_269))), life24_235, life25_239, life26_243, 0x1.99999ap-1f), 0x0.0p0f, -0x1.0p0f, 0x0.0p0f));
    __call604_99(__call604_98(__call604_97(__call604_96(__call604_95(life8_43, ((double) (life42_386 + 0x0.0p0f)), ((double) (life15_114 + 0x0.0p0f)), ((double) (life43_390 + 0x0.0p0f))), ((double) (((life40_373 + 0x0.0p0f) * 0x1.0p-8f) + life31_263)), ((double) (((life41_382 + 0x0.0p0f) * 0x1.0p-8f) + life32_269))), life24_235, life25_239, life26_243, 0x1.99999ap-1f), 0x0.0p0f, -0x1.0p0f, 0x0.0p0f));
    }
    if (!((__numericCompare604_100(life15_114, 0x1.4p2f) <= 0))) {
        break forest_join_734;
    }
    __call604_105(__call604_104(__call604_103(__call604_102(__call604_101(life8_43, ((double) (life42_386 + 0x0.0p0f)), ((double) ((life15_114 + 0x1.0p2f) - 0x1.0p-10f)), ((double) (life43_390 + 0x1.0p3f))), ((double) (((life40_373 + 0x0.0p0f) * 0x1.0p-8f) + life31_263)), ((double) (((life41_382 + 0x1.0p3f) * 0x1.0p-8f) + life32_269))), life18_168, life19_172, life20_176, 0x1.99999ap-1f), 0x0.0p0f, 0x1.0p0f, 0x0.0p0f));
    __call604_110(__call604_109(__call604_108(__call604_107(__call604_106(life8_43, ((double) (life42_386 + 0x1.0p3f)), ((double) ((life15_114 + 0x1.0p2f) - 0x1.0p-10f)), ((double) (life43_390 + 0x1.0p3f))), ((double) (((life40_373 + 0x1.0p3f) * 0x1.0p-8f) + life31_263)), ((double) (((life41_382 + 0x1.0p3f) * 0x1.0p-8f) + life32_269))), life18_168, life19_172, life20_176, 0x1.99999ap-1f), 0x0.0p0f, 0x1.0p0f, 0x0.0p0f));
    __call604_115(__call604_114(__call604_113(__call604_112(__call604_111(life8_43, ((double) (life42_386 + 0x1.0p3f)), ((double) ((life15_114 + 0x1.0p2f) - 0x1.0p-10f)), ((double) (life43_390 + 0x0.0p0f))), ((double) (((life40_373 + 0x1.0p3f) * 0x1.0p-8f) + life31_263)), ((double) (((life41_382 + 0x0.0p0f) * 0x1.0p-8f) + life32_269))), life18_168, life19_172, life20_176, 0x1.99999ap-1f), 0x0.0p0f, 0x1.0p0f, 0x0.0p0f));
    __call604_120(__call604_119(__call604_118(__call604_117(__call604_116(life8_43, ((double) (life42_386 + 0x0.0p0f)), ((double) ((life15_114 + 0x1.0p2f) - 0x1.0p-10f)), ((double) (life43_390 + 0x0.0p0f))), ((double) (((life40_373 + 0x0.0p0f) * 0x1.0p-8f) + life31_263)), ((double) (((life41_382 + 0x0.0p0f) * 0x1.0p-8f) + life32_269))), life18_168, life19_172, life20_176, 0x1.99999ap-1f), 0x0.0p0f, 0x1.0p0f, 0x0.0p0f));
    }
    if (!((life38_344 > -1))) {
        break forest_join_936;
    }
    life44_741 = 0;
    forest_cycle_739: while (true) {
    if (!((life44_741 < __invokedynamic604_121(20434, (1057924044874149930L ^ life3_3))))) {
        break forest_join_936;
    }
    __call604_126(__call604_125(__call604_124(__call604_123(__call604_122(life8_43, ((double) ((life42_386 + ((float) life44_741)) + 0x0.0p0f)), ((double) (life15_114 + 0x0.0p0f)), ((double) (life43_390 + 0x1.0p3f))), ((double) ((((life40_373 + ((float) life44_741)) + 0x1.0p-1f) * 0x1.0p-8f) + life31_263)), ((double) (((life41_382 + 0x1.0p3f) * 0x1.0p-8f) + life32_269))), life21_223, life22_227, life23_231, 0x1.99999ap-1f), -0x1.0p0f, 0x0.0p0f, 0x0.0p0f));
    __call604_131(__call604_130(__call604_129(__call604_128(__call604_127(life8_43, ((double) ((life42_386 + ((float) life44_741)) + 0x0.0p0f)), ((double) (life15_114 + 0x1.0p2f)), ((double) (life43_390 + 0x1.0p3f))), ((double) ((((life40_373 + ((float) life44_741)) + 0x1.0p-1f) * 0x1.0p-8f) + life31_263)), ((double) (((life41_382 + 0x1.0p3f) * 0x1.0p-8f) + life32_269))), life21_223, life22_227, life23_231, 0x1.99999ap-1f), -0x1.0p0f, 0x0.0p0f, 0x0.0p0f));
    __call604_136(__call604_135(__call604_134(__call604_133(__call604_132(life8_43, ((double) ((life42_386 + ((float) life44_741)) + 0x0.0p0f)), ((double) (life15_114 + 0x1.0p2f)), ((double) (life43_390 + 0x0.0p0f))), ((double) ((((life40_373 + ((float) life44_741)) + 0x1.0p-1f) * 0x1.0p-8f) + life31_263)), ((double) (((life41_382 + 0x0.0p0f) * 0x1.0p-8f) + life32_269))), life21_223, life22_227, life23_231, 0x1.99999ap-1f), -0x1.0p0f, 0x0.0p0f, 0x0.0p0f));
    __call604_141(__call604_140(__call604_139(__call604_138(__call604_137(life8_43, ((double) ((life42_386 + ((float) life44_741)) + 0x0.0p0f)), ((double) (life15_114 + 0x0.0p0f)), ((double) (life43_390 + 0x0.0p0f))), ((double) ((((life40_373 + ((float) life44_741)) + 0x1.0p-1f) * 0x1.0p-8f) + life31_263)), ((double) (((life41_382 + 0x0.0p0f) * 0x1.0p-8f) + life32_269))), life21_223, life22_227, life23_231, 0x1.99999ap-1f), -0x1.0p0f, 0x0.0p0f, 0x0.0p0f));
    life44_741 += 1;
    continue forest_cycle_739;
    }
    }
    if (!((life38_344 <= 1))) {
        break forest_join_1146;
    }
    life44_943 = 0;
    forest_cycle_941: while (true) {
    if (!((life44_943 < __invokedynamic604_142(20434, (1057924044874149930L ^ life3_3))))) {
        break forest_join_1146;
    }
    __call604_147(__call604_146(__call604_145(__call604_144(__call604_143(life8_43, ((double) (((life42_386 + ((float) life44_943)) + 0x1.0p0f) - 0x1.0p-10f)), ((double) (life15_114 + 0x0.0p0f)), ((double) (life43_390 + 0x1.0p3f))), ((double) ((((life40_373 + ((float) life44_943)) + 0x1.0p-1f) * 0x1.0p-8f) + life31_263)), ((double) (((life41_382 + 0x1.0p3f) * 0x1.0p-8f) + life32_269))), life21_223, life22_227, life23_231, 0x1.99999ap-1f), 0x1.0p0f, 0x0.0p0f, 0x0.0p0f));
    __call604_152(__call604_151(__call604_150(__call604_149(__call604_148(life8_43, ((double) (((life42_386 + ((float) life44_943)) + 0x1.0p0f) - 0x1.0p-10f)), ((double) (life15_114 + 0x1.0p2f)), ((double) (life43_390 + 0x1.0p3f))), ((double) ((((life40_373 + ((float) life44_943)) + 0x1.0p-1f) * 0x1.0p-8f) + life31_263)), ((double) (((life41_382 + 0x1.0p3f) * 0x1.0p-8f) + life32_269))), life21_223, life22_227, life23_231, 0x1.99999ap-1f), 0x1.0p0f, 0x0.0p0f, 0x0.0p0f));
    __call604_157(__call604_156(__call604_155(__call604_154(__call604_153(life8_43, ((double) (((life42_386 + ((float) life44_943)) + 0x1.0p0f) - 0x1.0p-10f)), ((double) (life15_114 + 0x1.0p2f)), ((double) (life43_390 + 0x0.0p0f))), ((double) ((((life40_373 + ((float) life44_943)) + 0x1.0p-1f) * 0x1.0p-8f) + life31_263)), ((double) (((life41_382 + 0x0.0p0f) * 0x1.0p-8f) + life32_269))), life21_223, life22_227, life23_231, 0x1.99999ap-1f), 0x1.0p0f, 0x0.0p0f, 0x0.0p0f));
    __call604_162(__call604_161(__call604_160(__call604_159(__call604_158(life8_43, ((double) (((life42_386 + ((float) life44_943)) + 0x1.0p0f) - 0x1.0p-10f)), ((double) (life15_114 + 0x0.0p0f)), ((double) (life43_390 + 0x0.0p0f))), ((double) ((((life40_373 + ((float) life44_943)) + 0x1.0p-1f) * 0x1.0p-8f) + life31_263)), ((double) (((life41_382 + 0x0.0p0f) * 0x1.0p-8f) + life32_269))), life21_223, life22_227, life23_231, 0x1.99999ap-1f), 0x1.0p0f, 0x0.0p0f, 0x0.0p0f));
    life44_943 += 1;
    continue forest_cycle_941;
    }
    }
    if (!((life39_353 > -1))) {
        break forest_join_1348;
    }
    life44_1153 = 0;
    forest_cycle_1151: while (true) {
    if (!((life44_1153 < __invokedynamic604_163(20434, (1057924044874149930L ^ life3_3))))) {
        break forest_join_1348;
    }
    __call604_168(__call604_167(__call604_166(__call604_165(__call604_164(life8_43, ((double) (life42_386 + 0x0.0p0f)), ((double) (life15_114 + 0x1.0p2f)), ((double) ((life43_390 + ((float) life44_1153)) + 0x0.0p0f))), ((double) (((life40_373 + 0x0.0p0f) * 0x1.0p-8f) + life31_263)), ((double) ((((life41_382 + ((float) life44_1153)) + 0x1.0p-1f) * 0x1.0p-8f) + life32_269))), life27_247, life28_251, life29_255, 0x1.99999ap-1f), 0x0.0p0f, 0x0.0p0f, -0x1.0p0f));
    __call604_173(__call604_172(__call604_171(__call604_170(__call604_169(life8_43, ((double) (life42_386 + 0x1.0p3f)), ((double) (life15_114 + 0x1.0p2f)), ((double) ((life43_390 + ((float) life44_1153)) + 0x0.0p0f))), ((double) (((life40_373 + 0x1.0p3f) * 0x1.0p-8f) + life31_263)), ((double) ((((life41_382 + ((float) life44_1153)) + 0x1.0p-1f) * 0x1.0p-8f) + life32_269))), life27_247, life28_251, life29_255, 0x1.99999ap-1f), 0x0.0p0f, 0x0.0p0f, -0x1.0p0f));
    __call604_178(__call604_177(__call604_176(__call604_175(__call604_174(life8_43, ((double) (life42_386 + 0x1.0p3f)), ((double) (life15_114 + 0x0.0p0f)), ((double) ((life43_390 + ((float) life44_1153)) + 0x0.0p0f))), ((double) (((life40_373 + 0x1.0p3f) * 0x1.0p-8f) + life31_263)), ((double) ((((life41_382 + ((float) life44_1153)) + 0x1.0p-1f) * 0x1.0p-8f) + life32_269))), life27_247, life28_251, life29_255, 0x1.99999ap-1f), 0x0.0p0f, 0x0.0p0f, -0x1.0p0f));
    __call604_183(__call604_182(__call604_181(__call604_180(__call604_179(life8_43, ((double) (life42_386 + 0x0.0p0f)), ((double) (life15_114 + 0x0.0p0f)), ((double) ((life43_390 + ((float) life44_1153)) + 0x0.0p0f))), ((double) (((life40_373 + 0x0.0p0f) * 0x1.0p-8f) + life31_263)), ((double) ((((life41_382 + ((float) life44_1153)) + 0x1.0p-1f) * 0x1.0p-8f) + life32_269))), life27_247, life28_251, life29_255, 0x1.99999ap-1f), 0x0.0p0f, 0x0.0p0f, -0x1.0p0f));
    life44_1153 += 1;
    continue forest_cycle_1151;
    }
    }
    if (!((life39_353 <= 1))) {
        break forest_join_1558;
    }
    life44_1355 = 0;
    forest_cycle_1353: while (true) {
    if (!((life44_1355 < __invokedynamic604_184(20434, (1057924044874149930L ^ life3_3))))) {
        break forest_join_1558;
    }
    __call604_189(__call604_188(__call604_187(__call604_186(__call604_185(life8_43, ((double) (life42_386 + 0x0.0p0f)), ((double) (life15_114 + 0x1.0p2f)), ((double) (((life43_390 + ((float) life44_1355)) + 0x1.0p0f) - 0x1.0p-10f))), ((double) (((life40_373 + 0x0.0p0f) * 0x1.0p-8f) + life31_263)), ((double) ((((life41_382 + ((float) life44_1355)) + 0x1.0p-1f) * 0x1.0p-8f) + life32_269))), life27_247, life28_251, life29_255, 0x1.99999ap-1f), 0x0.0p0f, 0x0.0p0f, 0x1.0p0f));
    __call604_194(__call604_193(__call604_192(__call604_191(__call604_190(life8_43, ((double) (life42_386 + 0x1.0p3f)), ((double) (life15_114 + 0x1.0p2f)), ((double) (((life43_390 + ((float) life44_1355)) + 0x1.0p0f) - 0x1.0p-10f))), ((double) (((life40_373 + 0x1.0p3f) * 0x1.0p-8f) + life31_263)), ((double) ((((life41_382 + ((float) life44_1355)) + 0x1.0p-1f) * 0x1.0p-8f) + life32_269))), life27_247, life28_251, life29_255, 0x1.99999ap-1f), 0x0.0p0f, 0x0.0p0f, 0x1.0p0f));
    __call604_199(__call604_198(__call604_197(__call604_196(__call604_195(life8_43, ((double) (life42_386 + 0x1.0p3f)), ((double) (life15_114 + 0x0.0p0f)), ((double) (((life43_390 + ((float) life44_1355)) + 0x1.0p0f) - 0x1.0p-10f))), ((double) (((life40_373 + 0x1.0p3f) * 0x1.0p-8f) + life31_263)), ((double) ((((life41_382 + ((float) life44_1355)) + 0x1.0p-1f) * 0x1.0p-8f) + life32_269))), life27_247, life28_251, life29_255, 0x1.99999ap-1f), 0x0.0p0f, 0x0.0p0f, 0x1.0p0f));
    __call604_204(__call604_203(__call604_202(__call604_201(__call604_200(life8_43, ((double) (life42_386 + 0x0.0p0f)), ((double) (life15_114 + 0x0.0p0f)), ((double) (((life43_390 + ((float) life44_1355)) + 0x1.0p0f) - 0x1.0p-10f))), ((double) (((life40_373 + 0x0.0p0f) * 0x1.0p-8f) + life31_263)), ((double) ((((life41_382 + ((float) life44_1355)) + 0x1.0p-1f) * 0x1.0p-8f) + life32_269))), life27_247, life28_251, life29_255, 0x1.99999ap-1f), 0x0.0p0f, 0x0.0p0f, 0x1.0p0f));
    life44_1355 += 1;
    continue forest_cycle_1353;
    }
    }
    __call604_205(life7_40);
    life39_353 += 1;
    continue forest_cycle_353;
    }
    }
    life38_344 += 1;
    continue forest_cycle_344;
    }
    }
    __call604_207(__fieldRead604_206(receiver));
    }
    __call604_208(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    __call604_209();
    __call604_210();
    return;
}
public static void h604_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060400_0(p0);
}
public static void h604_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060401_0(p0);
}
public static void h604_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060402_0(p0);
}
public static void h604_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060403_0(p0);
}
public static void h604_4(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060404_0(p0);
}
public static void h604_5(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060405_0(p0);
}
public static void h604_6(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060406_0(p0);
}
public static void h604_7(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060407_0(p0);
}
public static void h604_8(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060408_0(p0);
}
private static native long __fieldRead604_0() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead604_1(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.DR __call604_2(net.minecraft.client.multiplayer.WorldClient a0, float a1) throws Throwable;
private static native moom.Mf __fieldRead604_3(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __fieldRead604_4(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call604_5(moom.Mf a0, int a1, int a2, float a3, moom.DR a4) throws Throwable;
private static native void __call604_6() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead604_7(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call604_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead604_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead604_10(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call604_11(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead604_12(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead604_13(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call604_14(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead604_15(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.renderer.Tessellator __call604_16() throws Throwable;
private static native moom.lw __call604_17(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native int __fieldRead604_18(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead604_19(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call604_20(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead604_21(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead604_22(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call604_23(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead604_24(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead604_25(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call604_26(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead604_27(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead604_28(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call604_29(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead604_30(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead604_31(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call604_32(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead604_33(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead604_34(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call604_35(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead604_36(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead604_37(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.EA __fieldRead604_38(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native float __call604_39(moom.EA a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead604_40(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead604_41(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead604_42(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __call604_43(double a0) throws Throwable;
private static native int __call604_44(double a0) throws Throwable;
private static native int __invokedynamic604_45(int a0, long a1) throws Throwable;
private static native int __invokedynamic604_46(int a0, long a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __fieldRead604_47(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.DD __fieldRead604_48() throws Throwable;
private static native void __call604_49(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native void __call604_50() throws Throwable;
private static native int __invokedynamic604_51(int a0, long a1) throws Throwable;
private static native int __invokedynamic604_52(int a0, long a1) throws Throwable;
private static native void __call604_53(int a0, int a1, int a2, int a3) throws Throwable;
private static native double __fieldRead604_54(moom.DR a0) throws Throwable;
private static native double __fieldRead604_55(moom.DR a0) throws Throwable;
private static native double __fieldRead604_56(moom.DR a0) throws Throwable;
private static native int __call604_57(double a0) throws Throwable;
private static native int __call604_58(double a0) throws Throwable;
private static native int __call604_59(double a0) throws Throwable;
private static native int __call604_60(double a0) throws Throwable;
private static native void __call604_61(float a0, float a1, float a2) throws Throwable;
private static native void __call604_62(int a0, int a1, int a2, int a3) throws Throwable;
private static native void __call604_63(int a0, int a1, int a2, int a3) throws Throwable;
private static native void __call604_64(int a0, int a1, int a2, int a3) throws Throwable;
private static native void __call604_65(int a0, int a1, int a2, int a3) throws Throwable;
private static native moom.Mf __fieldRead604_66(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call604_67(moom.Mf a0) throws Throwable;
private static native moom.Mf __fieldRead604_68(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native boolean __call604_69(moom.Mf a0) throws Throwable;
private static native moom.Mf __fieldRead604_70(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call604_71(moom.Mf a0) throws Throwable;
private static native int __invokedynamic604_72(int a0, long a1) throws Throwable;
private static native int __invokedynamic604_73(int a0, long a1) throws Throwable;
private static native int __invokedynamic604_74(int a0, long a1) throws Throwable;
private static native moom.oD __fieldRead604_75() throws Throwable;
private static native void __call604_76(moom.lw a0, int a1, moom.oD a2) throws Throwable;
private static native int __invokedynamic604_77(int a0, long a1) throws Throwable;
private static native int __invokedynamic604_78(int a0, long a1) throws Throwable;
private static native int __numericCompare604_79(float a0, float a1) throws Throwable;
private static native moom.lw __call604_80(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call604_81(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call604_82(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call604_83(moom.lw a0, float a1, float a2, float a3) throws Throwable;
private static native void __call604_84(moom.lw a0) throws Throwable;
private static native moom.lw __call604_85(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call604_86(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call604_87(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call604_88(moom.lw a0, float a1, float a2, float a3) throws Throwable;
private static native void __call604_89(moom.lw a0) throws Throwable;
private static native moom.lw __call604_90(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call604_91(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call604_92(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call604_93(moom.lw a0, float a1, float a2, float a3) throws Throwable;
private static native void __call604_94(moom.lw a0) throws Throwable;
private static native moom.lw __call604_95(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call604_96(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call604_97(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call604_98(moom.lw a0, float a1, float a2, float a3) throws Throwable;
private static native void __call604_99(moom.lw a0) throws Throwable;
private static native int __numericCompare604_100(float a0, float a1) throws Throwable;
private static native moom.lw __call604_101(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call604_102(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call604_103(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call604_104(moom.lw a0, float a1, float a2, float a3) throws Throwable;
private static native void __call604_105(moom.lw a0) throws Throwable;
private static native moom.lw __call604_106(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call604_107(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call604_108(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call604_109(moom.lw a0, float a1, float a2, float a3) throws Throwable;
private static native void __call604_110(moom.lw a0) throws Throwable;
private static native moom.lw __call604_111(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call604_112(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call604_113(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call604_114(moom.lw a0, float a1, float a2, float a3) throws Throwable;
private static native void __call604_115(moom.lw a0) throws Throwable;
private static native moom.lw __call604_116(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call604_117(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call604_118(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call604_119(moom.lw a0, float a1, float a2, float a3) throws Throwable;
private static native void __call604_120(moom.lw a0) throws Throwable;
private static native int __invokedynamic604_121(int a0, long a1) throws Throwable;
private static native moom.lw __call604_122(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call604_123(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call604_124(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call604_125(moom.lw a0, float a1, float a2, float a3) throws Throwable;
private static native void __call604_126(moom.lw a0) throws Throwable;
private static native moom.lw __call604_127(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call604_128(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call604_129(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call604_130(moom.lw a0, float a1, float a2, float a3) throws Throwable;
private static native void __call604_131(moom.lw a0) throws Throwable;
private static native moom.lw __call604_132(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call604_133(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call604_134(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call604_135(moom.lw a0, float a1, float a2, float a3) throws Throwable;
private static native void __call604_136(moom.lw a0) throws Throwable;
private static native moom.lw __call604_137(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call604_138(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call604_139(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call604_140(moom.lw a0, float a1, float a2, float a3) throws Throwable;
private static native void __call604_141(moom.lw a0) throws Throwable;
private static native int __invokedynamic604_142(int a0, long a1) throws Throwable;
private static native moom.lw __call604_143(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call604_144(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call604_145(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call604_146(moom.lw a0, float a1, float a2, float a3) throws Throwable;
private static native void __call604_147(moom.lw a0) throws Throwable;
private static native moom.lw __call604_148(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call604_149(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call604_150(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call604_151(moom.lw a0, float a1, float a2, float a3) throws Throwable;
private static native void __call604_152(moom.lw a0) throws Throwable;
private static native moom.lw __call604_153(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call604_154(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call604_155(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call604_156(moom.lw a0, float a1, float a2, float a3) throws Throwable;
private static native void __call604_157(moom.lw a0) throws Throwable;
private static native moom.lw __call604_158(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call604_159(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call604_160(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call604_161(moom.lw a0, float a1, float a2, float a3) throws Throwable;
private static native void __call604_162(moom.lw a0) throws Throwable;
private static native int __invokedynamic604_163(int a0, long a1) throws Throwable;
private static native moom.lw __call604_164(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call604_165(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call604_166(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call604_167(moom.lw a0, float a1, float a2, float a3) throws Throwable;
private static native void __call604_168(moom.lw a0) throws Throwable;
private static native moom.lw __call604_169(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call604_170(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call604_171(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call604_172(moom.lw a0, float a1, float a2, float a3) throws Throwable;
private static native void __call604_173(moom.lw a0) throws Throwable;
private static native moom.lw __call604_174(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call604_175(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call604_176(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call604_177(moom.lw a0, float a1, float a2, float a3) throws Throwable;
private static native void __call604_178(moom.lw a0) throws Throwable;
private static native moom.lw __call604_179(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call604_180(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call604_181(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call604_182(moom.lw a0, float a1, float a2, float a3) throws Throwable;
private static native void __call604_183(moom.lw a0) throws Throwable;
private static native int __invokedynamic604_184(int a0, long a1) throws Throwable;
private static native moom.lw __call604_185(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call604_186(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call604_187(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call604_188(moom.lw a0, float a1, float a2, float a3) throws Throwable;
private static native void __call604_189(moom.lw a0) throws Throwable;
private static native moom.lw __call604_190(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call604_191(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call604_192(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call604_193(moom.lw a0, float a1, float a2, float a3) throws Throwable;
private static native void __call604_194(moom.lw a0) throws Throwable;
private static native moom.lw __call604_195(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call604_196(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call604_197(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call604_198(moom.lw a0, float a1, float a2, float a3) throws Throwable;
private static native void __call604_199(moom.lw a0) throws Throwable;
private static native moom.lw __call604_200(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call604_201(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call604_202(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call604_203(moom.lw a0, float a1, float a2, float a3) throws Throwable;
private static native void __call604_204(moom.lw a0) throws Throwable;
private static native void __call604_205(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native moom.Mf __fieldRead604_206(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call604_207(moom.Mf a0) throws Throwable;
private static native void __call604_208(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call604_209() throws Throwable;
private static native void __call604_210() throws Throwable;
private static native java.lang.Throwable __call3060400_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060401_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060402_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060403_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060404_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060405_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060406_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060407_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060408_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5505cc6daa51192cf423(net.minecraft.client.renderer.RenderGlobal a0) throws E;
private static final class __SourceHandler_5505cc6daa51192cf423 {

public static void f100197(net.minecraft.client.renderer.RenderGlobal receiver) throws Throwable {
    long life1_3;
    net.minecraft.client.renderer.Tessellator life3_5;
    moom.lw life4_8;
    forest_join_69: {
    forest_join_49: {
    forest_join_24: {
    forest_join_15: {
    life1_3 = (__fieldRead100197_0() ^ 84254204417241L);
    life3_5 = __call100197_1();
    life4_8 = __call100197_2(life3_5);
    if (!((__fieldRead100197_3(receiver) != null))) {
        break forest_join_15;
    }
    __call100197_5(__fieldRead100197_4(receiver));
    }
    if (!((__fieldRead100197_6(receiver) >= 0))) {
        break forest_join_24;
    }
    __call100197_8(__fieldRead100197_7(receiver));
    __fieldWrite100197_9(receiver, -1);
    }
    if (!(__fieldRead100197_10(receiver))) {
        break forest_join_49;
    }
    __fieldWrite100197_12(receiver, new moom.oC(__fieldRead100197_11(receiver)));
    __call100197_13(receiver, life4_8, -0x1.0p4f, 1);
    __call100197_14(life4_8);
    __call100197_15(life4_8);
    __call100197_18(__fieldRead100197_16(receiver), __call100197_17(life4_8));
    break forest_join_69;
    }
    __fieldWrite100197_20(receiver, __call100197_19(1));
    __call100197_23(__fieldRead100197_21(receiver), __invokedynamic100197_22(10950, (6363457019254288232L ^ life1_3)));
    __call100197_24(receiver, life4_8, -0x1.0p4f, 1);
    __call100197_25(life3_5);
    __call100197_26();
    }
    return;
}
public static void h100197_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019700_0(p0);
}
public static void h100197_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019701_0(p0);
}
public static void h100197_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019702_0(p0);
}
private static native long __fieldRead100197_0() throws Throwable;
private static native net.minecraft.client.renderer.Tessellator __call100197_1() throws Throwable;
private static native moom.lw __call100197_2(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native moom.oC __fieldRead100197_3(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.oC __fieldRead100197_4(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call100197_5(moom.oC a0) throws Throwable;
private static native int __fieldRead100197_6(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __fieldRead100197_7(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call100197_8(int a0) throws Throwable;
private static native void __fieldWrite100197_9(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native boolean __fieldRead100197_10(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.oD __fieldRead100197_11(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __fieldWrite100197_12(net.minecraft.client.renderer.RenderGlobal a0, moom.oC a1) throws Throwable;
private static native void __call100197_13(net.minecraft.client.renderer.RenderGlobal a0, moom.lw a1, float a2, int a3) throws Throwable;
private static native void __call100197_14(moom.lw a0) throws Throwable;
private static native void __call100197_15(moom.lw a0) throws Throwable;
private static native moom.oC __fieldRead100197_16(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.nio.ByteBuffer __call100197_17(moom.lw a0) throws Throwable;
private static native void __call100197_18(moom.oC a0, java.nio.ByteBuffer a1) throws Throwable;
private static native int __call100197_19(int a0) throws Throwable;
private static native void __fieldWrite100197_20(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native int __fieldRead100197_21(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __invokedynamic100197_22(int a0, long a1) throws Throwable;
private static native void __call100197_23(int a0, int a1) throws Throwable;
private static native void __call100197_24(net.minecraft.client.renderer.RenderGlobal a0, moom.lw a1, float a2, int a3) throws Throwable;
private static native void __call100197_25(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native void __call100197_26() throws Throwable;
private static native java.lang.Throwable __call13019700_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019701_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019702_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_0f188932429931ae1413(net.minecraft.client.renderer.RenderGlobal a0) throws E;
private static final class __SourceHandler_0f188932429931ae1413 {

public static int f2542(net.minecraft.client.renderer.RenderGlobal receiver) throws Throwable {
    moom.Fn life1_10;
    moom.jH life2_27;
    if ((__fieldRead2542_0(receiver) == null)) {
        return 0;
    }
    life1_10 = __call2542_2(__fieldRead2542_1(receiver));
    if ((life1_10 == null)) {
        return 0;
    }
    if ((life1_10 != __fieldRead2542_3(receiver))) {
        __fieldWrite2542_4(receiver, life1_10);
        life2_27 = __cast2542_6(__fieldRead2542_5(receiver));
        __fieldWrite2542_8(receiver, __fieldRead2542_7(life2_27));
    }
    return ((__fieldRead2542_9(receiver) == null) ? 0 : __call2542_11(__fieldRead2542_10(receiver)));
}
public static void h2542_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1254200_0(p0);
}
public static void h2542_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1254201_0(p0);
}
public static void h2542_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1254202_0(p0);
}
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead2542_0(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead2542_1(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.Fn __call2542_2(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native moom.Fn __fieldRead2542_3(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __fieldWrite2542_4(net.minecraft.client.renderer.RenderGlobal a0, moom.Fn a1) throws Throwable;
private static native moom.Fn __fieldRead2542_5(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.jH __cast2542_6(moom.Fn a0) throws Throwable;
private static native moom.Do __fieldRead2542_7(moom.jH a0) throws Throwable;
private static native void __fieldWrite2542_8(net.minecraft.client.renderer.RenderGlobal a0, moom.Do a1) throws Throwable;
private static native moom.Do __fieldRead2542_9(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.Do __fieldRead2542_10(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __call2542_11(moom.Do a0) throws Throwable;
private static native java.lang.Throwable __call1254200_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1254201_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1254202_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_ee65009d77c486490ab2(net.minecraft.client.renderer.RenderGlobal a0) throws E;
private static final class __SourceHandler_ee65009d77c486490ab2 {

public static void f100195(net.minecraft.client.renderer.RenderGlobal receiver) throws Throwable {
    long life1_3;
    net.minecraft.client.renderer.Tessellator life3_5;
    moom.lw life4_8;
    forest_join_69: {
    forest_join_49: {
    forest_join_24: {
    forest_join_15: {
    life1_3 = (__fieldRead100195_0() ^ 21993345377208L);
    life3_5 = __call100195_1();
    life4_8 = __call100195_2(life3_5);
    if (!((__fieldRead100195_3(receiver) != null))) {
        break forest_join_15;
    }
    __call100195_5(__fieldRead100195_4(receiver));
    }
    if (!((__fieldRead100195_6(receiver) >= 0))) {
        break forest_join_24;
    }
    __call100195_8(__fieldRead100195_7(receiver));
    __fieldWrite100195_9(receiver, -1);
    }
    if (!(__fieldRead100195_10(receiver))) {
        break forest_join_49;
    }
    __fieldWrite100195_12(receiver, new moom.oC(__fieldRead100195_11(receiver)));
    __call100195_13(receiver, life4_8, 0x1.0p4f, 0);
    __call100195_14(life4_8);
    __call100195_15(life4_8);
    __call100195_18(__fieldRead100195_16(receiver), __call100195_17(life4_8));
    break forest_join_69;
    }
    __fieldWrite100195_20(receiver, __call100195_19(1));
    __call100195_23(__fieldRead100195_21(receiver), __invokedynamic100195_22(10950, (6363536597421070345L ^ life1_3)));
    __call100195_24(receiver, life4_8, 0x1.0p4f, 0);
    __call100195_25(life3_5);
    __call100195_26();
    }
    return;
}
public static void h100195_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019500_0(p0);
}
public static void h100195_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019501_0(p0);
}
public static void h100195_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019502_0(p0);
}
private static native long __fieldRead100195_0() throws Throwable;
private static native net.minecraft.client.renderer.Tessellator __call100195_1() throws Throwable;
private static native moom.lw __call100195_2(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native moom.oC __fieldRead100195_3(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.oC __fieldRead100195_4(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call100195_5(moom.oC a0) throws Throwable;
private static native int __fieldRead100195_6(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __fieldRead100195_7(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call100195_8(int a0) throws Throwable;
private static native void __fieldWrite100195_9(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native boolean __fieldRead100195_10(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.oD __fieldRead100195_11(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __fieldWrite100195_12(net.minecraft.client.renderer.RenderGlobal a0, moom.oC a1) throws Throwable;
private static native void __call100195_13(net.minecraft.client.renderer.RenderGlobal a0, moom.lw a1, float a2, int a3) throws Throwable;
private static native void __call100195_14(moom.lw a0) throws Throwable;
private static native void __call100195_15(moom.lw a0) throws Throwable;
private static native moom.oC __fieldRead100195_16(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.nio.ByteBuffer __call100195_17(moom.lw a0) throws Throwable;
private static native void __call100195_18(moom.oC a0, java.nio.ByteBuffer a1) throws Throwable;
private static native int __call100195_19(int a0) throws Throwable;
private static native void __fieldWrite100195_20(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native int __fieldRead100195_21(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __invokedynamic100195_22(int a0, long a1) throws Throwable;
private static native void __call100195_23(int a0, int a1) throws Throwable;
private static native void __call100195_24(net.minecraft.client.renderer.RenderGlobal a0, moom.lw a1, float a2, int a3) throws Throwable;
private static native void __call100195_25(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native void __call100195_26() throws Throwable;
private static native java.lang.Throwable __call13019500_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019501_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019502_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b283c0e1cc36f62620ab(net.minecraft.client.renderer.RenderGlobal a0) throws E;
private static final class __SourceHandler_b283c0e1cc36f62620ab {

public static void f100196(net.minecraft.client.renderer.RenderGlobal receiver) throws Throwable {
    long life1_3;
    net.minecraft.client.renderer.Tessellator life3_5;
    moom.lw life4_8;
    forest_join_67: {
    forest_join_47: {
    forest_join_24: {
    forest_join_15: {
    life1_3 = (__fieldRead100196_0() ^ 119714630518766L);
    life3_5 = __call100196_1();
    life4_8 = __call100196_2(life3_5);
    if (!((__fieldRead100196_3(receiver) != null))) {
        break forest_join_15;
    }
    __call100196_5(__fieldRead100196_4(receiver));
    }
    if (!((__fieldRead100196_6(receiver) >= 0))) {
        break forest_join_24;
    }
    __call100196_8(__fieldRead100196_7(receiver));
    __fieldWrite100196_9(receiver, -1);
    }
    if (!(__fieldRead100196_10(receiver))) {
        break forest_join_47;
    }
    __fieldWrite100196_12(receiver, new moom.oC(__fieldRead100196_11(receiver)));
    __call100196_13(receiver, life4_8);
    __call100196_14(life4_8);
    __call100196_15(life4_8);
    __call100196_18(__fieldRead100196_16(receiver), __call100196_17(life4_8));
    break forest_join_67;
    }
    __fieldWrite100196_20(receiver, __call100196_19(1));
    __call100196_21();
    __call100196_24(__fieldRead100196_22(receiver), __invokedynamic100196_23(20209, (3071441794531743819L ^ life1_3)));
    __call100196_25(receiver, life4_8);
    __call100196_26(life3_5);
    __call100196_27();
    __call100196_28();
    }
    return;
}
public static void h100196_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019600_0(p0);
}
public static void h100196_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019601_0(p0);
}
public static void h100196_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call13019602_0(p0);
}
private static native long __fieldRead100196_0() throws Throwable;
private static native net.minecraft.client.renderer.Tessellator __call100196_1() throws Throwable;
private static native moom.lw __call100196_2(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native moom.oC __fieldRead100196_3(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.oC __fieldRead100196_4(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call100196_5(moom.oC a0) throws Throwable;
private static native int __fieldRead100196_6(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __fieldRead100196_7(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call100196_8(int a0) throws Throwable;
private static native void __fieldWrite100196_9(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native boolean __fieldRead100196_10(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.oD __fieldRead100196_11(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __fieldWrite100196_12(net.minecraft.client.renderer.RenderGlobal a0, moom.oC a1) throws Throwable;
private static native void __call100196_13(net.minecraft.client.renderer.RenderGlobal a0, moom.lw a1) throws Throwable;
private static native void __call100196_14(moom.lw a0) throws Throwable;
private static native void __call100196_15(moom.lw a0) throws Throwable;
private static native moom.oC __fieldRead100196_16(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.nio.ByteBuffer __call100196_17(moom.lw a0) throws Throwable;
private static native void __call100196_18(moom.oC a0, java.nio.ByteBuffer a1) throws Throwable;
private static native int __call100196_19(int a0) throws Throwable;
private static native void __fieldWrite100196_20(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native void __call100196_21() throws Throwable;
private static native int __fieldRead100196_22(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __invokedynamic100196_23(int a0, long a1) throws Throwable;
private static native void __call100196_24(int a0, int a1) throws Throwable;
private static native void __call100196_25(net.minecraft.client.renderer.RenderGlobal a0, moom.lw a1) throws Throwable;
private static native void __call100196_26(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native void __call100196_27() throws Throwable;
private static native void __call100196_28() throws Throwable;
private static native java.lang.Throwable __call13019600_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019601_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call13019602_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f064d4738ef460cfab42(net.minecraft.client.renderer.RenderGlobal a0) throws E;
private static final class __SourceHandler_f064d4738ef460cfab42 {

public static void f605(net.minecraft.client.renderer.RenderGlobal receiver) throws Throwable {
    long life1_3;
    int life3_48;
    java.util.Set life4_104;
    net.minecraft.entity.Entity life4_132;
    forest_join_149: {
    forest_join_142: {
    forest_join_135: {
    forest_join_93: {
    forest_join_81: {
    forest_join_66: {
    forest_join_20: {
    life1_3 = (__fieldRead605_0() ^ 135787663610877L);
    if (!((__fieldRead605_1(receiver) != null))) {
        break forest_join_142;
    }
    __fieldWrite605_2(receiver, 1);
    __call605_5(__fieldRead605_3(), __call605_4());
    __call605_8(__fieldRead605_6(), __call605_7());
    __call605_9();
    if (!(__call605_10())) {
        break forest_join_20;
    }
    __call605_11();
    }
    __call605_12();
    __fieldWrite605_16(receiver, __fieldRead605_15(__fieldRead605_14(__fieldRead605_13(receiver))));
    __fieldWrite605_19(receiver, (__fieldRead605_17(receiver) * __invokedynamic605_18(2671, (6021982125435291888L ^ life1_3))));
    __fieldWrite605_22(receiver, (__fieldRead605_20(receiver) * __fieldRead605_21(receiver)));
    life3_48 = __integerCategory605_24(__fieldRead605_23(receiver));
    __fieldWrite605_26(receiver, __call605_25());
    if (!((life3_48 != 0))) {
        break forest_join_66;
    }
    if (!((!__fieldRead605_27(receiver)))) {
        break forest_join_66;
    }
    __fieldWrite605_28(receiver, new moom.kS());
    __fieldWrite605_29(receiver, new moom.mo());
    break forest_join_81;
    }
    if (!((life3_48 == 0))) {
        break forest_join_81;
    }
    if (!(__fieldRead605_30(receiver))) {
        break forest_join_81;
    }
    __fieldWrite605_31(receiver, new moom.kT());
    __fieldWrite605_32(receiver, new moom.ms());
    }
    __call605_33(receiver);
    __call605_34(receiver);
    __call605_35(receiver);
    if (!((__fieldRead605_36(receiver) != null))) {
        break forest_join_93;
    }
    __call605_38(__fieldRead605_37(receiver));
    }
    __call605_39(receiver);
    __monitorEnter605_41((life4_104 = __fieldRead605_40(receiver)));
    __call605_43(__fieldRead605_42(receiver));
    __monitorExit605_44(life4_104);
    __fieldWrite605_50(receiver, new moom.lv(__fieldRead605_45(receiver), __fieldRead605_48(__fieldRead605_47(__fieldRead605_46(receiver))), receiver, __fieldRead605_49(receiver)));
    if (!((__fieldRead605_51(receiver) != null))) {
        break forest_join_135;
    }
    life4_132 = __call605_53(__fieldRead605_52(receiver));
    if (!((life4_132 != null))) {
        break forest_join_135;
    }
    __call605_57(__fieldRead605_54(receiver), __fieldRead605_55(life4_132), __fieldRead605_56(life4_132));
    }
    __fieldWrite605_59(receiver, __invokedynamic605_58(17386, (7752629379704406353L ^ life1_3)));
    }
    if (!((__fieldRead605_61(__fieldRead605_60(receiver)) == null))) {
        break forest_join_149;
    }
    __fieldWrite605_62(receiver, 1);
    }
    return;
}
public static void h605_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060500_0(p0);
}
public static void h605_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060501_0(p0);
}
public static void h605_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060502_0(p0);
}
public static void h605_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060503_0(p0);
}
public static void h605_4(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060504_0(p0);
}
public static void h605_5(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060505_0(p0);
}
public static void h605_6(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060506_0(p0);
}
public static void h605_7(java.lang.Throwable p0, java.util.Set p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3060507_0(p1);
    throw life2_2;
}
public static void h605_8(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060508_0(p0);
}
public static void h605_9(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call3060509_0(p0);
}
private static native long __fieldRead605_0() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead605_1(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __fieldWrite605_2(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native moom.dH __fieldRead605_3() throws Throwable;
private static native boolean __call605_4() throws Throwable;
private static native void __call605_5(moom.dH a0, boolean a1) throws Throwable;
private static native moom.dH __fieldRead605_6() throws Throwable;
private static native boolean __call605_7() throws Throwable;
private static native void __call605_8(moom.dH a0, boolean a1) throws Throwable;
private static native void __call605_9() throws Throwable;
private static native boolean __call605_10() throws Throwable;
private static native void __call605_11() throws Throwable;
private static native void __call605_12() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead605_13(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead605_14(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead605_15(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native void __fieldWrite605_16(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native int __fieldRead605_17(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __invokedynamic605_18(int a0, long a1) throws Throwable;
private static native void __fieldWrite605_19(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native int __fieldRead605_20(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __fieldRead605_21(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __fieldWrite605_22(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native boolean __fieldRead605_23(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __integerCategory605_24(boolean value) throws Throwable;
private static native boolean __call605_25() throws Throwable;
private static native void __fieldWrite605_26(net.minecraft.client.renderer.RenderGlobal a0, boolean a1) throws Throwable;
private static native boolean __fieldRead605_27(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __fieldWrite605_28(net.minecraft.client.renderer.RenderGlobal a0, moom.kS a1) throws Throwable;
private static native void __fieldWrite605_29(net.minecraft.client.renderer.RenderGlobal a0, moom.mo a1) throws Throwable;
private static native boolean __fieldRead605_30(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __fieldWrite605_31(net.minecraft.client.renderer.RenderGlobal a0, moom.kT a1) throws Throwable;
private static native void __fieldWrite605_32(net.minecraft.client.renderer.RenderGlobal a0, moom.ms a1) throws Throwable;
private static native void __call605_33(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call605_34(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call605_35(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.lv __fieldRead605_36(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.lv __fieldRead605_37(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call605_38(moom.lv a0) throws Throwable;
private static native void __call605_39(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.util.Set __fieldRead605_40(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __monitorEnter605_41(java.util.Set a0) throws Throwable;
private static native java.util.Set __fieldRead605_42(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call605_43(java.util.Set a0) throws Throwable;
private static native void __monitorExit605_44(java.util.Set a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead605_45(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead605_46(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead605_47(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead605_48(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.IRenderChunkFactory __fieldRead605_49(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __fieldWrite605_50(net.minecraft.client.renderer.RenderGlobal a0, moom.lv a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead605_51(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead605_52(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call605_53(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.lv __fieldRead605_54(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native double __fieldRead605_55(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead605_56(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call605_57(moom.lv a0, double a1, double a2) throws Throwable;
private static native int __invokedynamic605_58(int a0, long a1) throws Throwable;
private static native void __fieldWrite605_59(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead605_60(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead605_61(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite605_62(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native java.lang.Throwable __call3060500_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060501_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060502_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060503_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060504_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060505_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060506_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native void __monitorExit3060507_0(java.util.Set a0) throws Throwable;
private static native java.lang.Throwable __call3060508_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call3060509_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_26a51e4e39895b4463a9(net.minecraft.client.renderer.RenderGlobal a0) throws E;
private static final class __SourceHandler_26a51e4e39895b4463a9 {

public static void f230(net.minecraft.client.renderer.RenderGlobal receiver) throws Throwable {
    long life1_3;
    moom.hG life3_31;
    life1_3 = (__fieldRead230_0() ^ 25633434140759L);
    if (__call230_1()) {
        if (__call230_3(__invokedynamic230_2(24199, (8655944239918649271L ^ life1_3)))) {
        if (__call230_5(__invokedynamic230_4(17527, (8258124273189459299L ^ life1_3)))) {
        life3_31 = new moom.hG(null, __call230_6());
        __call230_8(__call230_7(), life3_31);
    }
    }
        if (__call230_10(__invokedynamic230_9(12945, (4032925600401286038L ^ life1_3)))) {
        if (__call230_12(__invokedynamic230_11(28660, (7523973938356043470L ^ life1_3)))) {
        __call230_13();
        __call230_14();
    }
    }
    }
    net.minecraft.client.renderer.RenderGlobal __stackOp230_15_0 = receiver;
    __fieldWrite230_17(__stackOp230_15_0, (__fieldRead230_16(__stackOp230_15_0) + 1));
    if (((__fieldRead230_18(receiver) % __invokedynamic230_19(10371, (6642135931250866598L ^ life1_3))) == 0)) {
        __call230_23(receiver, __call230_22(__call230_21(__fieldRead230_20(receiver))));
    }
    return;
}
public static void h230_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1023000_0(p0);
}
public static void h230_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1023001_0(p0);
}
public static void h230_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1023002_0(p0);
}
public static void h230_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1023003_0(p0);
}
public static void h230_4(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1023004_0(p0);
}
private static native long __fieldRead230_0() throws Throwable;
private static native boolean __call230_1() throws Throwable;
private static native int __invokedynamic230_2(int a0, long a1) throws Throwable;
private static native boolean __call230_3(int a0) throws Throwable;
private static native int __invokedynamic230_4(int a0, long a1) throws Throwable;
private static native boolean __call230_5(int a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __call230_6() throws Throwable;
private static native net.minecraft.client.Minecraft __call230_7() throws Throwable;
private static native void __call230_8(net.minecraft.client.Minecraft a0, moom.hG a1) throws Throwable;
private static native int __invokedynamic230_9(int a0, long a1) throws Throwable;
private static native boolean __call230_10(int a0) throws Throwable;
private static native int __invokedynamic230_11(int a0, long a1) throws Throwable;
private static native boolean __call230_12(int a0) throws Throwable;
private static native void __call230_13() throws Throwable;
private static native void __call230_14() throws Throwable;
private static native int __fieldRead230_16(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __fieldWrite230_17(net.minecraft.client.renderer.RenderGlobal a0, int a1) throws Throwable;
private static native int __fieldRead230_18(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __invokedynamic230_19(int a0, long a1) throws Throwable;
private static native java.util.Map __fieldRead230_20(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.util.Collection __call230_21(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call230_22(java.util.Collection a0) throws Throwable;
private static native void __call230_23(net.minecraft.client.renderer.RenderGlobal a0, java.util.Iterator a1) throws Throwable;
private static native java.lang.Throwable __call1023000_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1023001_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1023002_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1023003_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1023004_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_bb4e20dd890070c1d13a(net.minecraft.client.renderer.RenderGlobal a0) throws E;
private static final class __SourceHandler_bb4e20dd890070c1d13a {

public static void f2547(net.minecraft.client.renderer.RenderGlobal receiver) throws Throwable {
    long life1_3;
    net.minecraft.client.renderer.Tessellator life3_30;
    moom.lw life4_33;
    int life5_35;
    int life6_115;
    int life7_121;
    int life8_127;
    moom.DR life9_145;
    moom.DR life9_154;
    life1_3 = (__fieldRead2547_0() ^ 48418116547285L);
    if (__call2547_1()) {
        __call2547_2();
        int spill2547_0 = 21947;
        __call2547_3();
        long spill2547_1 = (6244762521668761107L ^ life1_3);
        __call2547_4();
        __call2547_7(__invokedynamic2547_5(spill2547_0, spill2547_1), __invokedynamic2547_6(27667, (3110788875746348972L ^ life1_3)), 1, 0);
        __call2547_8();
        __call2547_9(0);
        __call2547_12(__fieldRead2547_10(receiver), __fieldRead2547_11());
        life3_30 = __call2547_13();
        life4_33 = __call2547_14(life3_30);
        life5_35 = 0;
        loop_region_36: while ((life5_35 < __invokedynamic2547_15(30557, (3807905610460763355L ^ life1_3)))) {
        __call2547_16();
        if ((life5_35 == 1)) {
        __call2547_17(0x1.68p6f, 0x1.0p0f, 0x0.0p0f, 0x0.0p0f);
    }
        if ((life5_35 == 2)) {
        __call2547_18(-0x1.68p6f, 0x1.0p0f, 0x0.0p0f, 0x0.0p0f);
    }
        if ((life5_35 == 3)) {
        __call2547_19(0x1.68p7f, 0x1.0p0f, 0x0.0p0f, 0x0.0p0f);
    }
        if ((life5_35 == 4)) {
        __call2547_20(0x1.68p6f, 0x0.0p0f, 0x0.0p0f, 0x1.0p0f);
    }
        if ((life5_35 == 5)) {
        __call2547_21(-0x1.68p6f, 0x0.0p0f, 0x0.0p0f, 0x1.0p0f);
    }
        __call2547_24(life4_33, __invokedynamic2547_22(140, (5506123526954279781L ^ life1_3)), __fieldRead2547_23());
        life6_115 = __invokedynamic2547_25(6502, (1872522829009386235L ^ life1_3));
        life7_121 = __invokedynamic2547_26(19291, (4888525854742980804L ^ life1_3));
        life8_127 = __invokedynamic2547_27(19291, (4888525854742980804L ^ life1_3));
        if (__call2547_28()) {
        life9_145 = new moom.DR((((double) life6_115) / 0x1.fep7d), (((double) life7_121) / 0x1.fep7d), (((double) life8_127) / 0x1.fep7d));
        life9_154 = __call2547_32(life9_145, __fieldRead2547_29(receiver), __call2547_31(__fieldRead2547_30(receiver)), 0x0.0p0f);
        life6_115 = ((int) (__fieldRead2547_33(life9_154) * 0x1.fep7d));
        life7_121 = ((int) (__fieldRead2547_34(life9_154) * 0x1.fep7d));
        life8_127 = ((int) (__fieldRead2547_35(life9_154) * 0x1.fep7d));
    }
        __call2547_40(__call2547_39(__call2547_37(__call2547_36(life4_33, -0x1.9p6d, -0x1.9p6d, -0x1.9p6d), 0x0.0p0d, 0x0.0p0d), life6_115, life7_121, life8_127, __invokedynamic2547_38(14550, (6291992771217447782L ^ life1_3))));
        __call2547_45(__call2547_44(__call2547_42(__call2547_41(life4_33, -0x1.9p6d, -0x1.9p6d, 0x1.9p6d), 0x0.0p0d, 0x1.0p4d), life6_115, life7_121, life8_127, __invokedynamic2547_43(14550, (6291992771217447782L ^ life1_3))));
        __call2547_50(__call2547_49(__call2547_47(__call2547_46(life4_33, 0x1.9p6d, -0x1.9p6d, 0x1.9p6d), 0x1.0p4d, 0x1.0p4d), life6_115, life7_121, life8_127, __invokedynamic2547_48(14550, (6291992771217447782L ^ life1_3))));
        __call2547_55(__call2547_54(__call2547_52(__call2547_51(life4_33, 0x1.9p6d, -0x1.9p6d, -0x1.9p6d), 0x1.0p4d, 0x0.0p0d), life6_115, life7_121, life8_127, __invokedynamic2547_53(14550, (6291992771217447782L ^ life1_3))));
        __call2547_56(life3_30);
        __call2547_57();
        life5_35 += 1;
    }
        __call2547_58(1);
        __call2547_59();
        __call2547_60();
        __call2547_61();
    }
    return;
}
public static void h2547_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1254700_0(p0);
}
public static void h2547_1(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1254701_0(p0);
}
public static void h2547_2(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1254702_0(p0);
}
public static void h2547_3(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1254703_0(p0);
}
public static void h2547_4(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1254704_0(p0);
}
public static void h2547_5(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1254705_0(p0);
}
private static native long __fieldRead2547_0() throws Throwable;
private static native boolean __call2547_1() throws Throwable;
private static native void __call2547_2() throws Throwable;
private static native void __call2547_3() throws Throwable;
private static native void __call2547_4() throws Throwable;
private static native int __invokedynamic2547_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic2547_6(int a0, long a1) throws Throwable;
private static native void __call2547_7(int a0, int a1, int a2, int a3) throws Throwable;
private static native void __call2547_8() throws Throwable;
private static native void __call2547_9(int a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __fieldRead2547_10(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.DD __fieldRead2547_11() throws Throwable;
private static native void __call2547_12(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native net.minecraft.client.renderer.Tessellator __call2547_13() throws Throwable;
private static native moom.lw __call2547_14(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native int __invokedynamic2547_15(int a0, long a1) throws Throwable;
private static native void __call2547_16() throws Throwable;
private static native void __call2547_17(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call2547_18(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call2547_19(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call2547_20(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call2547_21(float a0, float a1, float a2, float a3) throws Throwable;
private static native int __invokedynamic2547_22(int a0, long a1) throws Throwable;
private static native moom.oD __fieldRead2547_23() throws Throwable;
private static native void __call2547_24(moom.lw a0, int a1, moom.oD a2) throws Throwable;
private static native int __invokedynamic2547_25(int a0, long a1) throws Throwable;
private static native int __invokedynamic2547_26(int a0, long a1) throws Throwable;
private static native int __invokedynamic2547_27(int a0, long a1) throws Throwable;
private static native boolean __call2547_28() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead2547_29(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2547_30(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.entity.Entity __call2547_31(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DR __call2547_32(moom.DR a0, net.minecraft.client.multiplayer.WorldClient a1, net.minecraft.entity.Entity a2, float a3) throws Throwable;
private static native double __fieldRead2547_33(moom.DR a0) throws Throwable;
private static native double __fieldRead2547_34(moom.DR a0) throws Throwable;
private static native double __fieldRead2547_35(moom.DR a0) throws Throwable;
private static native moom.lw __call2547_36(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call2547_37(moom.lw a0, double a1, double a2) throws Throwable;
private static native int __invokedynamic2547_38(int a0, long a1) throws Throwable;
private static native moom.lw __call2547_39(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call2547_40(moom.lw a0) throws Throwable;
private static native moom.lw __call2547_41(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call2547_42(moom.lw a0, double a1, double a2) throws Throwable;
private static native int __invokedynamic2547_43(int a0, long a1) throws Throwable;
private static native moom.lw __call2547_44(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call2547_45(moom.lw a0) throws Throwable;
private static native moom.lw __call2547_46(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call2547_47(moom.lw a0, double a1, double a2) throws Throwable;
private static native int __invokedynamic2547_48(int a0, long a1) throws Throwable;
private static native moom.lw __call2547_49(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call2547_50(moom.lw a0) throws Throwable;
private static native moom.lw __call2547_51(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call2547_52(moom.lw a0, double a1, double a2) throws Throwable;
private static native int __invokedynamic2547_53(int a0, long a1) throws Throwable;
private static native moom.lw __call2547_54(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call2547_55(moom.lw a0) throws Throwable;
private static native void __call2547_56(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native void __call2547_57() throws Throwable;
private static native void __call2547_58(int a0) throws Throwable;
private static native void __call2547_59() throws Throwable;
private static native void __call2547_60() throws Throwable;
private static native void __call2547_61() throws Throwable;
private static native java.lang.Throwable __call1254700_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1254701_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1254702_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1254703_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1254704_0(com.google.gson.JsonSyntaxException a0) throws Throwable;
private static native java.lang.Throwable __call1254705_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_eb817034412f60981c40(net.minecraft.client.renderer.RenderGlobal a0) throws E;
private static final class __SourceHandler_eb817034412f60981c40 {

public static void f2548(net.minecraft.client.renderer.RenderGlobal receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead2548_0() ^ 121621421564263L);
    if ((__fieldRead2548_1() > 0)) {
        __fieldWrite2548_5(receiver, new java.util.ArrayList((__call2548_3(__fieldRead2548_2(receiver)) + __invokedynamic2548_4(2671, (6022004521713531498L ^ life1_3)))));
        __fieldWrite2548_9(receiver, new java.util.ArrayList((__call2548_7(__fieldRead2548_6(receiver)) + __invokedynamic2548_8(2671, (6022004521713531498L ^ life1_3)))));
        __fieldWrite2548_13(receiver, new java.util.ArrayList((__call2548_11(__fieldRead2548_10(receiver)) + __invokedynamic2548_12(2671, (6022004521713531498L ^ life1_3)))));
    } else {
        __call2548_15(__fieldRead2548_14(receiver));
        __call2548_17(__fieldRead2548_16(receiver));
        __call2548_19(__fieldRead2548_18(receiver));
    }
    return;
}
public static void h2548_0(com.google.gson.JsonSyntaxException p0) throws Throwable {
    throw __call1254800_0(p0);
}
private static native long __fieldRead2548_0() throws Throwable;
private static native int __fieldRead2548_1() throws Throwable;
private static native java.util.List __fieldRead2548_2(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __call2548_3(java.util.List a0) throws Throwable;
private static native int __invokedynamic2548_4(int a0, long a1) throws Throwable;
private static native void __fieldWrite2548_5(net.minecraft.client.renderer.RenderGlobal a0, java.util.ArrayList a1) throws Throwable;
private static native java.util.List __fieldRead2548_6(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __call2548_7(java.util.List a0) throws Throwable;
private static native int __invokedynamic2548_8(int a0, long a1) throws Throwable;
private static native void __fieldWrite2548_9(net.minecraft.client.renderer.RenderGlobal a0, java.util.ArrayList a1) throws Throwable;
private static native java.util.List __fieldRead2548_10(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __call2548_11(java.util.List a0) throws Throwable;
private static native int __invokedynamic2548_12(int a0, long a1) throws Throwable;
private static native void __fieldWrite2548_13(net.minecraft.client.renderer.RenderGlobal a0, java.util.ArrayList a1) throws Throwable;
private static native java.util.List __fieldRead2548_14(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call2548_15(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead2548_16(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call2548_17(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead2548_18(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call2548_19(java.util.List a0) throws Throwable;
private static native java.lang.Throwable __call1254800_0(com.google.gson.JsonSyntaxException a0) throws Throwable;

}


public void i() { __sourceHandlerCall_26a51e4e39895b4463a9(this); }


private void b(int p0, int p1, int p2, int p3, int p4, int p5) {
((moom.lv)(this.M)).a(((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)));
    return;
}


public void b(moom.DT p0) {
int local2 = ((moom.DT)(p0)).a();
    int local3 = ((moom.DT)(p0)).b();
    int local4 = ((moom.DT)(p0)).c();
    ((net.minecraft.client.renderer.RenderGlobal)(this)).b(((int)((local2 - 1))), ((int)((local3 - 1))), ((int)((local4 - 1))), ((int)((local2 + 1))), ((int)((local3 + 1))), ((int)((local4 + 1))));
    return;
}


public void b(net.minecraft.entity.Entity p0) {
try {
        moom.JT.b(((net.minecraft.entity.Entity)(p0)), ((net.minecraft.world.World)(this.J)));
        if (moom.BU.ay()) {
        moom.JF.b(((net.minecraft.entity.Entity)(p0)), ((net.minecraft.client.renderer.RenderGlobal)(this)));
    }
    } catch (com.google.gson.JsonSyntaxException caught_rethrow_0) {
        throw net.minecraft.client.renderer.RenderGlobal.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    return;
}


public java.lang.String b__String() {
return __sourceIntrinsic_d1398b4921c0_originalDynamicSite1823_7(this.al, this.ak, this.am, ((this.ak - this.am) - this.al), moom.BU.b__String());
}


public void b(float p0, int p1) { __sourceHandlerCall_9f6e4c574bf4aceb48b6(this, p0, p1); }


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral10656_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/lq"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = net.minecraft.client.renderer.RenderGlobal.b(((int)(local4)), ((long)(local5)));
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 3011);
    if (((net.minecraft.client.renderer.RenderGlobal.gb)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (net.minecraft.client.renderer.RenderGlobal.fb)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(net.minecraft.client.renderer.RenderGlobal.hb)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(net.minecraft.client.renderer.RenderGlobal.hb)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/lq", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (net.minecraft.client.renderer.RenderGlobal.gb)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((net.minecraft.client.renderer.RenderGlobal.gb)[life3_8])).longValue();
}


public int b() {
return ((java.util.List)(this.L)).size();
}


public boolean b__Boolean() { return __sourceHandlerCall_747ceebc0d1507433af0(this); }


public void b(int p0, moom.DT p1, int p2) { __sourceHandlerCall_7a36e39a1cc20c105b42(this, p0, p1, p2); }


public void b(moom.oR p0) {
((net.minecraft.client.renderer.RenderGlobal)(this)).a__Void();
    return;
}


public void b__Void() { __sourceHandlerCall_973b52d31c874e2b499f(this); }


private void e__Void() { __sourceHandlerCall_ee65009d77c486490ab2(this); }


public int e() { return __sourceHandlerCall_0f188932429931ae1413(this); }


public void s() {
try {
        if ((this.q != null)) {
        ((moom.mi)(this.q)).d();
    }
    } catch (com.google.gson.JsonSyntaxException caught_rethrow_0) {
        throw net.minecraft.client.renderer.RenderGlobal.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    return;
}


public void c__Void() {
long life1_3;
    life1_3 = (net.minecraft.client.renderer.RenderGlobal.bb ^ 6444227875427L);
    try {
        if (((net.minecraft.client.renderer.RenderGlobal)(this)).a__Boolean()) {
        moom.kZ.l();
        moom.kZ.a(((int)(__sourceIntrinsic_7ac46ee229a8_invokedynamic2602_3(21947, (6244790330797315749L ^ life1_3)))), ((int)(__sourceIntrinsic_7ac46ee229a8_invokedynamic2602_4(27667, (3110746910446841626L ^ life1_3)))), ((int)(0)), ((int)(1)));
        ((net.minecraft.client.shader.Framebuffer)(this.U)).a(((int)(((net.minecraft.client.Minecraft)(this.i)).G)), ((int)(((net.minecraft.client.Minecraft)(this.i)).H)), ((boolean)(false)));
        moom.kZ.k();
    }
    } catch (com.google.gson.JsonSyntaxException caught_rethrow_0) {
        throw net.minecraft.client.renderer.RenderGlobal.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    return;
}


public int c() {
return this.al;
}


private void c(float p0, int p1) { __sourceHandlerCall_68eaf42e60391ac2bfd5(this, p0, p1); }


public void n() {
this.C = ((boolean)(true));
    return;
}


protected void h() {
((java.util.Set)(this.K)).clear();
    ((moom.mi)(this.q)).a__Void();
    return;
}


public int f() {
return ((java.util.Set)(this.K)).size();
}


private void f__Void() { __sourceHandlerCall_b283c0e1cc36f62620ab(this); }


private void l() {
try {
        moom.kZ.c__Void();
        moom.kZ.a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
        moom.kZ.r();
        moom.kZ.d__Void();
        moom.kZ.a(((boolean)(true)));
        moom.kZ.C();
        if (moom.BU.ap()) {
        moom.MR.h();
    }
    } catch (com.google.gson.JsonSyntaxException caught_rethrow_0) {
        throw net.minecraft.client.renderer.RenderGlobal.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    return;
}


public int d() {
return this.ax;
}


private void d__Void() { __sourceHandlerCall_5505cc6daa51192cf423(this); }


protected boolean a__Boolean() { return __sourceHandlerCall_99200fd2c9d720704f53(this); }


public void a(net.minecraft.entity.player.EntityPlayer p0, int p1, moom.DT p2, int p3) { __sourceHandlerCall_123dc1f693c59b7cf034(this, p0, p1, p2, p3); }


public void a(net.minecraft.entity.player.EntityPlayer p0, java.lang.String p1, double p2, double p3, double p4, float p5, float p6) {
return;
}


public static void a(moom.CA p0) {
net.minecraft.client.renderer.Tessellator local1 = net.minecraft.client.renderer.Tessellator.a();
    moom.lw local2 = ((net.minecraft.client.renderer.Tessellator)(local1)).a__lw();
    ((moom.lw)(local2)).a(((int)(3)), ((moom.oD)(moom.oB.g)));
    ((moom.lw)(((moom.lw)(local2)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).d))))).c__Void();
    ((moom.lw)(((moom.lw)(local2)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).d))))).c__Void();
    ((moom.lw)(((moom.lw)(local2)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).g))))).c__Void();
    ((moom.lw)(((moom.lw)(local2)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).g))))).c__Void();
    ((moom.lw)(((moom.lw)(local2)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).d))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(local1)).a__Void();
    ((moom.lw)(local2)).a(((int)(3)), ((moom.oD)(moom.oB.g)));
    ((moom.lw)(((moom.lw)(local2)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).d))))).c__Void();
    ((moom.lw)(((moom.lw)(local2)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).d))))).c__Void();
    ((moom.lw)(((moom.lw)(local2)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).g))))).c__Void();
    ((moom.lw)(((moom.lw)(local2)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).g))))).c__Void();
    ((moom.lw)(((moom.lw)(local2)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).d))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(local1)).a__Void();
    ((moom.lw)(local2)).a(((int)(1)), ((moom.oD)(moom.oB.g)));
    ((moom.lw)(((moom.lw)(local2)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).d))))).c__Void();
    ((moom.lw)(((moom.lw)(local2)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).d))))).c__Void();
    ((moom.lw)(((moom.lw)(local2)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).d))))).c__Void();
    ((moom.lw)(((moom.lw)(local2)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).d))))).c__Void();
    ((moom.lw)(((moom.lw)(local2)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).g))))).c__Void();
    ((moom.lw)(((moom.lw)(local2)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).g))))).c__Void();
    ((moom.lw)(((moom.lw)(local2)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).g))))).c__Void();
    ((moom.lw)(((moom.lw)(local2)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).g))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(local1)).a__Void();
    return;
}


private void a(net.minecraft.util.EnumParticleTypes p0, double p1, double p2, double p3, double p4, double p5, double p6, int[] p7) {
((net.minecraft.client.renderer.RenderGlobal)(this)).a__Void(((int)(((net.minecraft.util.EnumParticleTypes)(p0)).a())), ((boolean)(((net.minecraft.util.EnumParticleTypes)(p0)).a__Boolean())), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((double)(p4)), ((double)(p5)), ((double)(p6)), ((int[])(p7)));
    return;
}


private net.minecraft.client.particle.EntityFX a(int p0, boolean p1, double p2, double p3, double p4, double p5, double p6, double p7, int[] p8) { return __sourceHandlerCall_b776de57a58a45acc605(this, p0, p1, p2, p3, p4, p5, p6, p7, p8); }


public void a(net.minecraft.entity.Entity p0) {
try {
        moom.JT.a(((net.minecraft.entity.Entity)(p0)), ((net.minecraft.world.World)(this.J)));
        if (moom.BU.ay()) {
        moom.JF.a(((net.minecraft.entity.Entity)(p0)), ((net.minecraft.client.renderer.RenderGlobal)(this)));
    }
    } catch (com.google.gson.JsonSyntaxException caught_rethrow_0) {
        throw net.minecraft.client.renderer.RenderGlobal.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    return;
}


public void a(int p0, moom.DT p1, int p2) { __sourceHandlerCall_2923859c31dd3b5bff1c(this, p0, p1, p2); }


private void a__Void() { __sourceHandlerCall_cc387acd787f29441489(this); }


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 18725;
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
            throw new RuntimeException("moom/lq", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         db[var3] = var15;
      }

      return db[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.renderer.RenderGlobal.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10675_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/lq"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int a() {
return (((moom.lv)(this.M)).f).length;
}


public static void a(moom.CA p0, int p1, int p2, int p3, int p4) {
net.minecraft.client.renderer.Tessellator local5 = net.minecraft.client.renderer.Tessellator.a();
    moom.lw local6 = ((net.minecraft.client.renderer.Tessellator)(local5)).a__lw();
    ((moom.lw)(local6)).a(((int)(3)), ((moom.oD)(moom.oB.h)));
    ((moom.lw)(((moom.lw)(((moom.lw)(local6)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).d))))).a(((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local6)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).d))))).a(((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local6)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).g))))).a(((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local6)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).g))))).a(((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local6)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).d))))).a(((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(local5)).a__Void();
    ((moom.lw)(local6)).a(((int)(3)), ((moom.oD)(moom.oB.h)));
    ((moom.lw)(((moom.lw)(((moom.lw)(local6)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).d))))).a(((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local6)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).d))))).a(((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local6)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).g))))).a(((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local6)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).g))))).a(((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local6)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).d))))).a(((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(local5)).a__Void();
    ((moom.lw)(local6)).a(((int)(1)), ((moom.oD)(moom.oB.h)));
    ((moom.lw)(((moom.lw)(((moom.lw)(local6)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).d))))).a(((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local6)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).d))))).a(((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local6)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).d))))).a(((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local6)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).d))))).a(((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local6)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).g))))).a(((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local6)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).g))))).a(((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local6)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).g))))).a(((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local6)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).g))))).a(((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(local5)).a__Void();
    return;
}


public moom.mp a__mp(moom.DT p0) {
return ((moom.lv)(this.M)).a(((moom.DT)(p0)));
}


public net.minecraft.client.multiplayer.WorldClient a__Ev() {
return this.J;
}


public void a(java.util.Collection<net.minecraft.tileentity.TileEntity> p0, java.util.Collection<net.minecraft.tileentity.TileEntity> p1) { __sourceHandlerCall_640975aa4e9b46d48593(this, p0, p1); }


protected org.lwjgl.util.vector.Vector3f a(net.minecraft.entity.Entity p0, double p1) {
float life4_13;
    float life5_27;
    float life6_44;
    float life7_52;
    float life8_59;
    float life9_65;
    life4_13 = ((float) (((double) ((net.minecraft.entity.Entity)(p0)).z) + (((double) (((net.minecraft.entity.Entity)(p0)).x - ((net.minecraft.entity.Entity)(p0)).z)) * p1)));
    life5_27 = ((float) (((double) ((net.minecraft.entity.Entity)(p0)).y) + (((double) (((net.minecraft.entity.Entity)(p0)).w - ((net.minecraft.entity.Entity)(p0)).y)) * p1)));
    if ((((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).W)).aP == 2)) {
        life4_13 = (life4_13 + 0x1.68p7f);
    }
    life6_44 = moom.Dr.b(((float)((((-life5_27) * 0x1.1df46ap-6f) - 0x1.921fb6p1f))));
    life7_52 = moom.Dr.a(((float)((((-life5_27) * 0x1.1df46ap-6f) - 0x1.921fb6p1f))));
    life8_59 = (-moom.Dr.b(((float)(((-life4_13) * 0x1.1df46ap-6f)))));
    life9_65 = moom.Dr.a(((float)(((-life4_13) * 0x1.1df46ap-6f))));
    return new org.lwjgl.util.vector.Vector3f((life7_52 * life8_59), life9_65, (life6_44 * life8_59));
}


private void a(double p0, double p1, double p2) { __sourceHandlerCall_7d15e7eb11c07394d2a1(this, p0, p1, p2); }


private moom.mp a(moom.DT p0, moom.mp p1, moom.bs p2, boolean p3, int p4) { return __sourceHandlerCall_3ebe8961c654bcd25917(this, p0, p1, p2, p3, p4); }


private java.util.Set<moom.bs> a(moom.DT p0) { return __sourceHandlerCall_9315fb54a638f4f81f0a(this, p0); }


private void a(moom.lw p0) { __sourceHandlerCall_a5b3019a5386f12a0d78(this, p0); }


private void a(java.util.Iterator<moom.kU> p0) { __sourceHandlerCall_ab53872f9a89baf3b706(this, p0); }


private void a(net.minecraft.util.EnumWorldBlockLayer p0) { __sourceHandlerCall_e15259bce9f6301e2c34(this, p0); }


public int a(net.minecraft.util.EnumWorldBlockLayer p0, double p1, int p2, net.minecraft.entity.Entity p3) { return __sourceHandlerCall_a4e485b291a3c14741e8(this, p0, p1, p2, p3); }


public java.lang.String a__String() { return __sourceHandlerCall_4fac1fbea5c9c1e3e66c(this); }


public void a(net.minecraft.entity.Entity p0, net.minecraft.client.renderer.culling.ICamera p1, float p2) { __sourceHandlerCall_84cb402424982b39e07c(this, p0, p1, p2); }


public void a(int p0, int p1) { __sourceHandlerCall_c7ea5958bcae6fcc1f1e(this, p0, p1); }


public void a__Void(int p0, boolean p1, double p2, double p3, double p4, double p5, double p6, double p7, int[] p8) {
moom.qY life17_17;
    moom.qZ life18_21;
    try {
        ((net.minecraft.client.renderer.RenderGlobal)(this)).a(((int)(p0)), ((boolean)(p1)), ((double)(p2)), ((double)(p3)), ((double)(p4)), ((double)(p5)), ((double)(p6)), ((double)(p7)), ((int[])(p8)));
    } catch (java.lang.Throwable life16_13) {
        life17_17 = moom.qY.a(((java.lang.Throwable)(life16_13)), ((java.lang.String)("Exception while adding particle")));
        life18_21 = ((moom.qY)(life17_17)).a(((java.lang.String)("Particle being added")));
        try {
        ((moom.qZ)(life18_21)).a(((java.lang.String)("ID")), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0))))));
        if ((p8 != null)) {
        ((moom.qZ)(life18_21)).a(((java.lang.String)("Parameters")), ((java.lang.Object)(p8)));
    }
    } catch (java.lang.Throwable caught_rethrow_1) {
        throw net.minecraft.client.renderer.RenderGlobal.a(((java.lang.Throwable)(caught_rethrow_1)));
    }
        ((moom.qZ)(life18_21)).a(((java.lang.String)("Position")), ((java.util.concurrent.Callable)(__sourceIntrinsic_909542edda10_invokedynamic2595_7(p2, p3, p4))));
        throw new moom.Oo(life17_17);
    }
    return;
}


public void a(net.minecraft.client.multiplayer.WorldClient p0) { __sourceHandlerCall_1f98b188a02e43da6832(this, p0); }


public void a(net.minecraft.entity.Entity p0, double p1, net.minecraft.client.renderer.culling.ICamera p2, int p3, boolean p4) { __sourceHandlerCall_29f8a8181980c26f2eda(this, p0, p1, p2, p3, p4); }


private boolean a(moom.DT p0, moom.mp p1) { return __sourceHandlerCall_77e5fab436016cbe18e4(this, p0, p1); }


public void a(java.lang.String p0, double p1, double p2, double p3, float p4, float p5) {
return;
}


public void a(java.lang.String p0, moom.DT p1) {
net.minecraft.client.audio.ISound life3_5;
    moom.xF life4_25;
    moom.fY life5_51;
    life3_5 = ((net.minecraft.client.audio.ISound)(((java.util.Map)(this.o)).get(((java.lang.Object)(p1)))));
    try {
        if ((life3_5 != null)) {
        ((net.minecraft.client.audio.SoundHandler)(((net.minecraft.client.Minecraft)(this.i)).a__f1())).b(((net.minecraft.client.audio.ISound)(life3_5)));
        ((java.util.Map)(this.o)).remove(((java.lang.Object)(p1)));
    }
    } catch (com.google.gson.JsonSyntaxException caught_rethrow_0) {
        throw net.minecraft.client.renderer.RenderGlobal.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    if ((p0 != null)) {
        life4_25 = moom.xF.a(((java.lang.String)(p0)));
        try {
        if ((life4_25 != null)) {
        ((net.minecraft.client.gui.GuiIngame)(((net.minecraft.client.Minecraft)(this.i)).T)).a(((java.lang.String)(((moom.xF)(life4_25)).b__sourceReturn_0e30dfc966())));
    }
    } catch (com.google.gson.JsonSyntaxException caught_rethrow_1) {
        throw net.minecraft.client.renderer.RenderGlobal.a(((java.lang.Throwable)(caught_rethrow_1)));
    }
        life5_51 = moom.fY.a(((moom.DD)(new moom.DD(p0))), ((float)(((float) ((moom.DT)(p1)).a()))), ((float)(((float) ((moom.DT)(p1)).b()))), ((float)(((float) ((moom.DT)(p1)).c()))));
        ((java.util.Map)(this.o)).put(((java.lang.Object)(p1)), ((java.lang.Object)(life5_51)));
        ((net.minecraft.client.audio.SoundHandler)(((net.minecraft.client.Minecraft)(this.i)).a__f1())).a(((net.minecraft.client.audio.ISound)(life5_51)));
    }
    return;
}


public void a(int p0, int p1, int p2, int p3, int p4, int p5) {
((net.minecraft.client.renderer.RenderGlobal)(this)).b(((int)((p0 - 1))), ((int)((p1 - 1))), ((int)((p2 - 1))), ((int)((p3 + 1))), ((int)((p4 + 1))), ((int)((p5 + 1))));
    return;
}


public void a__Void(moom.DT p0) {
int local2 = ((moom.DT)(p0)).a();
    int local3 = ((moom.DT)(p0)).b();
    int local4 = ((moom.DT)(p0)).c();
    ((net.minecraft.client.renderer.RenderGlobal)(this)).b(((int)((local2 - 1))), ((int)((local3 - 1))), ((int)((local4 - 1))), ((int)((local2 + 1))), ((int)((local3 + 1))), ((int)((local4 + 1))));
    return;
}


public void a(net.minecraft.entity.player.EntityPlayer p0, net.minecraft.util.MovingObjectPosition p1, int p2, float p3) { __sourceHandlerCall_b3a6552ea312311825e8(this, p0, p1, p2, p3); }


private void a(moom.lw p0, float p1, boolean p2) {
long local4 = (net.minecraft.client.renderer.RenderGlobal.bb ^ 69370824655957L);
    int local6 = __sourceIntrinsic_896bfd7b1d8c_invokedynamic8929_1(22363, (6882357978394362451L ^ local4));
    int local7 = __sourceIntrinsic_896bfd7b1d8c_invokedynamic8929_2(27691, (9093722457329187122L ^ local4));
    ((moom.lw)(p0)).a(((int)(__sourceIntrinsic_896bfd7b1d8c_invokedynamic8929_3(140, (5506140043199665637L ^ local4)))), ((moom.oD)(moom.oB.g)));
    int local8 = ((((this.av / __sourceIntrinsic_896bfd7b1d8c_invokedynamic8929_7(11955, (1311760569301695395L ^ local4))) + 1) * __sourceIntrinsic_896bfd7b1d8c_invokedynamic8929_8(11955, (1311760569301695395L ^ local4))) + __sourceIntrinsic_896bfd7b1d8c_invokedynamic8929_9(11955, (1311760569301695395L ^ local4)));
    int local9 = (-local8);
    while ((local9 <= local8)) {
        int local10 = (-local8);
        while ((local10 <= local8)) {
        float local11 = ((float) local9);
        float local12 = ((float) (local9 + __sourceIntrinsic_896bfd7b1d8c_invokedynamic8929_10(11955, (1311760569301695395L ^ local4))));
        if (p2) {
        local12 = ((float) local9);
        local11 = ((float) (local9 + __sourceIntrinsic_896bfd7b1d8c_invokedynamic8929_11(11955, (1311760569301695395L ^ local4))));
    }
        ((moom.lw)(((moom.lw)(p0)).a(((double)(((double) local11))), ((double)(((double) p1))), ((double)(((double) local10)))))).c__Void();
        ((moom.lw)(((moom.lw)(p0)).a(((double)(((double) local12))), ((double)(((double) p1))), ((double)(((double) local10)))))).c__Void();
        ((moom.lw)(((moom.lw)(p0)).a(((double)(((double) local12))), ((double)(((double) p1))), ((double)(((double) (local10 + __sourceIntrinsic_896bfd7b1d8c_invokedynamic8929_16(11955, (1311760569301695395L ^ local4))))))))).c__Void();
        ((moom.lw)(((moom.lw)(p0)).a(((double)(((double) local11))), ((double)(((double) p1))), ((double)(((double) (local10 + __sourceIntrinsic_896bfd7b1d8c_invokedynamic8929_19(11955, (1311760569301695395L ^ local4))))))))).c__Void();
        local10 += 64;
    }
        local9 += 64;
    }
    return;
}


public void a(float p0, int p1) { __sourceHandlerCall_dcabf7ef617fefca8a27(this, p0, p1); }


public void a(net.minecraft.client.renderer.Tessellator p0, moom.lw p1, net.minecraft.entity.Entity p2, float p3) { __sourceHandlerCall_e0606b863dde6e96f9c1(this, p0, p1, p2, p3); }


public void a(long p0) { __sourceHandlerCall_a40cdf19468e6c48f0b2(this, p0); }


public boolean a(double p0, double p1, double p2, float p3) {
return ((0) != 0);
}


public void a(net.minecraft.entity.Entity p0, float p1) { __sourceHandlerCall_64013e6cfd2ed582c3a5(this, p0, p1); }


public void m() {
return;
}


public void o() {
((moom.Mf)(this.t)).d();
    return;
}


private void p() { __sourceHandlerCall_eb817034412f60981c40(this); }


private void k() {
long life1_3;
    life1_3 = (net.minecraft.client.renderer.RenderGlobal.bb ^ 102563539597531L);
    try {
        moom.kZ.a(((int)(__sourceIntrinsic_6f67d3e79a8e_invokedynamic2610_1(10159, (4837549228746624519L ^ life1_3)))), ((int)(__sourceIntrinsic_6f67d3e79a8e_invokedynamic2610_2(24958, (5433892501520058623L ^ life1_3)))), ((int)(1)), ((int)(0)));
        moom.kZ.l();
        moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p-1f)));
        moom.kZ.a(((float)(-0x1.0p0f)), ((float)(-0x1.4p3f)));
        moom.kZ.q();
        moom.kZ.a(((int)(__sourceIntrinsic_6f67d3e79a8e_invokedynamic2610_8(17504, (6224278017272491477L ^ life1_3)))), ((float)(0x1.99999ap-4f)));
        moom.kZ.d__Void();
        moom.kZ.B();
        if (moom.BU.ap()) {
        moom.MR.g();
    }
    } catch (com.google.gson.JsonSyntaxException caught_rethrow_0) {
        throw net.minecraft.client.renderer.RenderGlobal.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    return;
}


public void g() { __sourceHandlerCall_f064d4738ef460cfab42(this); }


private void j() { __sourceHandlerCall_bb4e20dd890070c1d13a(this); }


public void q() {
try {
        if (this.aB) {
        ((net.minecraft.client.renderer.RenderGlobal)(this)).g();
        this.aB = ((boolean)(false));
    }
    } catch (com.google.gson.JsonSyntaxException caught_rethrow_0) {
        throw net.minecraft.client.renderer.RenderGlobal.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    return;
}


public void r() {
try {
        if ((this.q != null)) {
        ((moom.mi)(this.q)).c();
    }
    } catch (com.google.gson.JsonSyntaxException caught_rethrow_0) {
        throw net.minecraft.client.renderer.RenderGlobal.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    return;
}


private static java.lang.String lambda$spawnParticle$0(double p0, double p1, double p2) throws java.lang.Exception {
return moom.qZ.a(((double)(p0)), ((double)(p1)), ((double)(p2)));
}


private static native <E extends Throwable> int __sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_116(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_beea2afdfcd8168f_originalDynamicSite470_118(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10675_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_896bfd7b1d8c_invokedynamic8929_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_896bfd7b1d8c_invokedynamic8929_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_896bfd7b1d8c_invokedynamic8929_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_896bfd7b1d8c_invokedynamic8929_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_896bfd7b1d8c_invokedynamic8929_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_896bfd7b1d8c_invokedynamic8929_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_896bfd7b1d8c_invokedynamic8929_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_896bfd7b1d8c_invokedynamic8929_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_896bfd7b1d8c_invokedynamic8929_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_896bfd7b1d8c_invokedynamic8929_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_909542edda10_invokedynamic2595_7(double a0, double a1, double a2) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral10656_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d1398b4921c0_originalDynamicSite1823_7(int a0, int a1, int a2, int a3, java.lang.String a4) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic2602_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic2602_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6f67d3e79a8e_invokedynamic2610_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6f67d3e79a8e_invokedynamic2610_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6f67d3e79a8e_invokedynamic2610_8(int a0, long a1) throws E;
}
