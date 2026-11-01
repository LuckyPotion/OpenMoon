package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class bq extends sourcebuild.EnumConstructor<moom.bq> {

public static moom.bq BASE;

public static moom.bq SQUARE_BOTTOM_LEFT;

public static moom.bq SQUARE_BOTTOM_RIGHT;

public static moom.bq SQUARE_TOP_LEFT;

public static moom.bq SQUARE_TOP_RIGHT;

public static moom.bq STRIPE_BOTTOM;

public static moom.bq STRIPE_TOP;

public static moom.bq STRIPE_LEFT;

public static moom.bq STRIPE_RIGHT;

public static moom.bq STRIPE_CENTER;

public static moom.bq STRIPE_MIDDLE;

public static moom.bq STRIPE_DOWNRIGHT;

public static moom.bq STRIPE_DOWNLEFT;

public static moom.bq STRIPE_SMALL;

public static moom.bq CROSS;

public static moom.bq STRAIGHT_CROSS;

public static moom.bq TRIANGLE_BOTTOM;

public static moom.bq TRIANGLE_TOP;

public static moom.bq TRIANGLES_BOTTOM;

public static moom.bq TRIANGLES_TOP;

public static moom.bq DIAGONAL_LEFT;

public static moom.bq DIAGONAL_RIGHT;

public static moom.bq DIAGONAL_LEFT_MIRROR;

public static moom.bq DIAGONAL_RIGHT_MIRROR;

public static moom.bq CIRCLE_MIDDLE;

public static moom.bq RHOMBUS_MIDDLE;

public static moom.bq HALF_VERTICAL;

public static moom.bq HALF_HORIZONTAL;

public static moom.bq HALF_VERTICAL_MIRROR;

public static moom.bq HALF_HORIZONTAL_MIRROR;

public static moom.bq BORDER;

public static moom.bq CURLY_BORDER;

public static moom.bq CREEPER;

public static moom.bq GRADIENT;

public static moom.bq GRADIENT_UP;

public static moom.bq BRICKS;

public static moom.bq SKULL;

public static moom.bq FLOWER;

public static moom.bq MOJANG;

private java.lang.String a;

private java.lang.String b;

private java.lang.String[] c;

private net.minecraft.item.ItemStack d;

private static moom.bq[] e;

private static long f;

private static long[] g;

private static java.lang.Integer[] h;

private static java.util.Map i;

private bq(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6) {
this(p0, p1, p2, p3);
    (this.c)[0] = p4;
    (this.c)[1] = p5;
    (this.c)[2] = p6;
    return;
}


private bq(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3) {
super(p0, p1);
    this.c = new java.lang.String[3];
    this.a = p2;
    this.b = p3;
}


private bq(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, net.minecraft.item.ItemStack p4) {
this(p0, p1, p2, p3);
    this.d = ((net.minecraft.item.ItemStack)(p4));
    return;
}


private static void initialize() {
f = ((long)(((moom._a)(moom._c.a(((long)(6595850179568145393L)), ((long)(-3648888668117035931L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(41819037935645L)))));
    long local11_life6 = (moom.bq.f ^ 85871271084742L);
    i = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1113_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1113_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1113_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1113_14 = new byte[8];
    (__sourceSpill1113_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1113_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1113_16 = __sourceSpill1113_14;
    ((javax.crypto.Cipher)(__sourceSpill1113_11)).init(((int)(__sourceSpill1113_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1113_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1113_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[67];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "²ð[\0005ÒÆÖY9ðË\026µ47eoêåÄw,Ós\036wµX_º¢ø\025\030zâñ¥&9 ¢¨\027´!\037?´)%\030F5ä¸$¿\022ÿ(åÛ©1\032E\007½ÑfÝ¾|JÎ¡\f\0202ó8@R\025Ô~Yç'h5GÁ¬Um8dõVôA\020\025kK³C\026T¨¦+äF\023?ÝV.\ræ\nþæ±¬\nÆØ\bùí¼µ\021Z»ý^v\024Þ¾Ðó0M3ä\016=Ú\b\\\013\f}\177wdÂ\034¼þ\035¢Ã²A.¹Æ¥ç¾qt\177á×ú¥?~E?>\016ñëí]zßúË\013Ibû~e\f&×à\021? îPhó×¨k.]\030#Lyk°ÄMÚ¦Ò\033ª4r@ Î&:i;u@î\023Þ k\016ã>C²\026zé\\ ÷ßÿ-»9hÃ¾\024ÅzïÉVi\000rTøõ)pÿÑ\0266\024îRéã,RG\025XpÇ¤LFI»dOOw\016\004A\013oÕp«uVízg©\016W¤´RHïÞ·Àí0ÇVX¬#¦Ë\025 äµÈ]\027~.=:¿¼´H&\030Ì< \023û¶íO\027j4d\026°È\023A¿výÎ4k2CÌñÊ7ýØÍ\021\f {\\U\017rÁòðØâþR(»B\021Q¸<´¸Æ|MÔ\0174xUsèA!Lee\035Ó%¸\177p_hO6O=ébs·ý"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1113_25 = local4_life21;
        int __sourceSpill1113_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1113_25)).substring(((int)(__sourceSpill1113_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1113_30 = local6_life19;
        int __sourceSpill1113_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1113_33 = new byte[8];
        (__sourceSpill1113_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1113_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1113_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1113_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1113_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1113_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1113_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1113_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1113_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1113_34)).doFinal(((byte[])(__sourceSpill1113_33)));
        (__sourceSpill1113_30)[__sourceSpill1113_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "`Þ9ÅçÔoµ\017XhâYö"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1113_38 = local4_life21;
        int __sourceSpill1113_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1113_38)).substring(((int)(__sourceSpill1113_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1113_43 = local6_life19;
        int __sourceSpill1113_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1113_46 = new byte[8];
        (__sourceSpill1113_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1113_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1113_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1113_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1113_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1113_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1113_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1113_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1113_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1113_47)).doFinal(((byte[])(__sourceSpill1113_46)));
        (__sourceSpill1113_43)[__sourceSpill1113_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    g = ((long[])(local6_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[67]));
    BASE = ((moom.bq)(new moom.bq("BASE", 0, "base", "b")));
    SQUARE_BOTTOM_LEFT = ((moom.bq)(new moom.bq("SQUARE_BOTTOM_LEFT", 1, "square_bottom_left", "bl", "   ", "   ", "#  ")));
    SQUARE_BOTTOM_RIGHT = ((moom.bq)(new moom.bq("SQUARE_BOTTOM_RIGHT", 2, "square_bottom_right", "br", "   ", "   ", "  #")));
    SQUARE_TOP_LEFT = ((moom.bq)(new moom.bq("SQUARE_TOP_LEFT", 3, "square_top_left", "tl", "#  ", "   ", "   ")));
    SQUARE_TOP_RIGHT = ((moom.bq)(new moom.bq("SQUARE_TOP_RIGHT", 4, "square_top_right", "tr", "  #", "   ", "   ")));
    STRIPE_BOTTOM = ((moom.bq)(new moom.bq("STRIPE_BOTTOM", 5, "stripe_bottom", "bs", "   ", "   ", "###")));
    STRIPE_TOP = ((moom.bq)(new moom.bq("STRIPE_TOP", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_58(10588, (510678877060644112L ^ local11_life6)), "stripe_top", "ts", "###", "   ", "   ")));
    STRIPE_LEFT = ((moom.bq)(new moom.bq("STRIPE_LEFT", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_60(13462, (4474509895379984607L ^ local11_life6)), "stripe_left", "ls", "#  ", "#  ", "#  ")));
    STRIPE_RIGHT = ((moom.bq)(new moom.bq("STRIPE_RIGHT", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_62(4396, (7521987854359987564L ^ local11_life6)), "stripe_right", "rs", "  #", "  #", "  #")));
    STRIPE_CENTER = ((moom.bq)(new moom.bq("STRIPE_CENTER", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_64(4848, (5134494223670937248L ^ local11_life6)), "stripe_center", "cs", " # ", " # ", " # ")));
    STRIPE_MIDDLE = ((moom.bq)(new moom.bq("STRIPE_MIDDLE", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_66(12290, (4054117877997773904L ^ local11_life6)), "stripe_middle", "ms", "   ", "###", "   ")));
    STRIPE_DOWNRIGHT = ((moom.bq)(new moom.bq("STRIPE_DOWNRIGHT", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_68(20817, (4828423399933920526L ^ local11_life6)), "stripe_downright", "drs", "#  ", " # ", "  #")));
    STRIPE_DOWNLEFT = ((moom.bq)(new moom.bq("STRIPE_DOWNLEFT", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_70(22072, (2321415388383560318L ^ local11_life6)), "stripe_downleft", "dls", "  #", " # ", "#  ")));
    STRIPE_SMALL = ((moom.bq)(new moom.bq("STRIPE_SMALL", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_72(1782, (2294786099845730974L ^ local11_life6)), "small_stripes", "ss", "# #", "# #", "   ")));
    CROSS = ((moom.bq)(new moom.bq("CROSS", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_74(13334, (5830122093692362863L ^ local11_life6)), "cross", "cr", "# #", " # ", "# #")));
    STRAIGHT_CROSS = ((moom.bq)(new moom.bq("STRAIGHT_CROSS", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_76(24799, (6267450019880268982L ^ local11_life6)), "straight_cross", "sc", " # ", "###", " # ")));
    TRIANGLE_BOTTOM = ((moom.bq)(new moom.bq("TRIANGLE_BOTTOM", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_78(32578, (4930754176571599621L ^ local11_life6)), "triangle_bottom", "bt", "   ", " # ", "# #")));
    TRIANGLE_TOP = ((moom.bq)(new moom.bq("TRIANGLE_TOP", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_80(7810, (6458565804994333356L ^ local11_life6)), "triangle_top", "tt", "# #", " # ", "   ")));
    TRIANGLES_BOTTOM = ((moom.bq)(new moom.bq("TRIANGLES_BOTTOM", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_82(10167, (108719528894510016L ^ local11_life6)), "triangles_bottom", "bts", "   ", "# #", " # ")));
    TRIANGLES_TOP = ((moom.bq)(new moom.bq("TRIANGLES_TOP", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_84(31045, (1624986023534062895L ^ local11_life6)), "triangles_top", "tts", " # ", "# #", "   ")));
    DIAGONAL_LEFT = ((moom.bq)(new moom.bq("DIAGONAL_LEFT", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_86(31039, (4397952699344022851L ^ local11_life6)), "diagonal_left", "ld", "## ", "#  ", "   ")));
    DIAGONAL_RIGHT = ((moom.bq)(new moom.bq("DIAGONAL_RIGHT", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_88(1016, (2067603726033196972L ^ local11_life6)), "diagonal_up_right", "rd", "   ", "  #", " ##")));
    DIAGONAL_LEFT_MIRROR = ((moom.bq)(new moom.bq("DIAGONAL_LEFT_MIRROR", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_90(19434, (7776614744338980752L ^ local11_life6)), "diagonal_up_left", "lud", "   ", "#  ", "## ")));
    DIAGONAL_RIGHT_MIRROR = ((moom.bq)(new moom.bq("DIAGONAL_RIGHT_MIRROR", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_92(15688, (7027618279912057146L ^ local11_life6)), "diagonal_right", "rud", " ##", "  #", "   ")));
    CIRCLE_MIDDLE = ((moom.bq)(new moom.bq("CIRCLE_MIDDLE", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_94(10609, (6418330735678864699L ^ local11_life6)), "circle", "mc", "   ", " # ", "   ")));
    RHOMBUS_MIDDLE = ((moom.bq)(new moom.bq("RHOMBUS_MIDDLE", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_96(8613, (2434220315960980949L ^ local11_life6)), "rhombus", "mr", " # ", "# #", " # ")));
    HALF_VERTICAL = ((moom.bq)(new moom.bq("HALF_VERTICAL", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_98(17192, (6982262527757047678L ^ local11_life6)), "half_vertical", "vh", "## ", "## ", "## ")));
    HALF_HORIZONTAL = ((moom.bq)(new moom.bq("HALF_HORIZONTAL", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_100(18809, (4860958203814763826L ^ local11_life6)), "half_horizontal", "hh", "###", "###", "   ")));
    HALF_VERTICAL_MIRROR = ((moom.bq)(new moom.bq("HALF_VERTICAL_MIRROR", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_102(26245, (61324322114695878L ^ local11_life6)), "half_vertical_right", "vhr", " ##", " ##", " ##")));
    HALF_HORIZONTAL_MIRROR = ((moom.bq)(new moom.bq("HALF_HORIZONTAL_MIRROR", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_104(18221, (8881317164505912177L ^ local11_life6)), "half_horizontal_bottom", "hhb", "   ", "###", "###")));
    BORDER = ((moom.bq)(new moom.bq("BORDER", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_106(32219, (3366720532492708232L ^ local11_life6)), "border", "bo", "###", "# #", "###")));
    CURLY_BORDER = ((moom.bq)(new moom.bq("CURLY_BORDER", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_108(26660, (6814323272609627200L ^ local11_life6)), "curly_border", "cbo", new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.bc))));
    CREEPER = ((moom.bq)(new moom.bq("CREEPER", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_111(9225, (7560727577371127888L ^ local11_life6)), "creeper", "cre", new net.minecraft.item.ItemStack(net.minecraft.init.Items.bM, 1, 4))));
    GRADIENT = ((moom.bq)(new moom.bq("GRADIENT", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_114(16233, (4166367480149912365L ^ local11_life6)), "gradient", "gra", "# #", " # ", " # ")));
    GRADIENT_UP = ((moom.bq)(new moom.bq("GRADIENT_UP", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_116(19801, (4628832302657001755L ^ local11_life6)), "gradient_up", "gru", " # ", " # ", "# #")));
    BRICKS = ((moom.bq)(new moom.bq("BRICKS", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_118(10030, (8639221141147464559L ^ local11_life6)), "bricks", "bri", new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.V))));
    SKULL = ((moom.bq)(new moom.bq("SKULL", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_121(24326, (6274299961413192565L ^ local11_life6)), "skull", "sku", new net.minecraft.item.ItemStack(net.minecraft.init.Items.bM, 1, 1))));
    FLOWER = ((moom.bq)(new moom.bq("FLOWER", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_124(6324, (4504037159922175209L ^ local11_life6)), "flower", "flo", new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.O, 1, ((net.minecraft.block.BlockFlower$EnumFlowerType)(net.minecraft.block.BlockFlower$EnumFlowerType.OXEYE_DAISY)).a()))));
    MOJANG = ((moom.bq)(new moom.bq("MOJANG", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_129(23384, (5463759240052100870L ^ local11_life6)), "mojang", "moj", new net.minecraft.item.ItemStack(net.minecraft.init.Items.ao, 1, 1))));
    e = ((moom.bq[])(moom.bq.a__Arraybq()));
}


public static moom.bq[] values() {
return ((moom.bq[])(((moom.bq[])(moom.bq.e)).clone()));
}


public static moom.bq valueOf(java.lang.String p0) {
return ((moom.bq)(java.lang.Enum.valueOf(((java.lang.Class)(moom.bq.class)), ((java.lang.String)(p0)))));
}


public boolean b__Boolean() {
long local1 = (moom.bq.f ^ 49527659807665L);
    return ((((this.d != null) ? 1 : 0)) != 0);
}


public java.lang.String b() {
return this.b;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 22701;
      if (h[var3] == null) {
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
         long var5 = g[var3];
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/bq", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


public java.lang.String a() {
return this.a;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.bq.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6983_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/bq"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public java.lang.String[] a__ArrayString() {
return this.c;
}


public boolean a__Boolean() {
moom.bq forwardValue2987_12_0;
    int forwardValue2987_19_0;
    moom.bq spill2987_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_16: {
    forward_join_12: {
    life1_3 = (moom.bq.f ^ 42322298184134L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill2987_0 = this;
    if (!((life3_5 != null))) {
        forwardValue2987_12_0 = spill2987_0;
        break forward_join_12;
    }
    if (!((((moom.bq)(spill2987_0)).d == null))) {
        break forward_join_16;
    }
    forwardValue2987_12_0 = this;
    }
    if (!(((((moom.bq)(forwardValue2987_12_0)).c)[0] != null))) {
        break forward_join_18;
    }
    }
    forwardValue2987_19_0 = 1;
    break forward_join_19;
    }
    forwardValue2987_19_0 = 0;
    }
    return ((forwardValue2987_19_0) != 0);
}


public net.minecraft.item.ItemStack a__xW() {
return this.d;
}


public static moom.bq a(java.lang.String p0) {
java.lang.String[] spill1060_0;
    long life1_3;
    moom.bq[] life4_6;
    java.lang.String[] life3_7;
    int life5_10;
    int life6_12;
    moom.bq life7_19;
    lexical_join_32: {
    life1_3 = (moom.bq.f ^ 51079489226062L);
    spill1060_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    life4_6 = moom.bq.values();
    life3_7 = spill1060_0;
    life5_10 = (life4_6).length;
    life6_12 = 0;
    lexical_cycle_13: while (true) {
    lexical_join_30: {
    lexical_join_29: {
    if (!((life6_12 < life5_10))) {
        break lexical_join_32;
    }
    life7_19 = (life4_6)[life6_12];
    if (!((life3_7 != null))) {
        break lexical_join_30;
    }
    if (!(((java.lang.String)(((moom.bq)(life7_19)).b)).equals(((java.lang.Object)(p0))))) {
        break lexical_join_29;
    }
    return life7_19;
    }
    life6_12 += 1;
    }
    if (!((life3_7 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return null;
}


private static moom.bq[] a__Arraybq() {
long local0_life1 = (moom.bq.f ^ 3954664304363L);
    moom.bq[] __sourceSharedArray771_4 = new moom.bq[__sourceIntrinsic_be4ea4242a12_originalDynamicSite771_2(17276, (6061057919025363742L ^ local0_life1))];
    __sourceSharedArray771_4[0] = moom.bq.BASE;
    __sourceSharedArray771_4[1] = moom.bq.SQUARE_BOTTOM_LEFT;
    __sourceSharedArray771_4[2] = moom.bq.SQUARE_BOTTOM_RIGHT;
    __sourceSharedArray771_4[3] = moom.bq.SQUARE_TOP_LEFT;
    __sourceSharedArray771_4[4] = moom.bq.SQUARE_TOP_RIGHT;
    __sourceSharedArray771_4[5] = moom.bq.STRIPE_BOTTOM;
    __sourceSharedArray771_4[__sourceIntrinsic_be4ea4242a12_originalDynamicSite771_10(20161, (5543546117949339277L ^ local0_life1))] = moom.bq.STRIPE_TOP;
    __sourceSharedArray771_4[__sourceIntrinsic_be4ea4242a12_originalDynamicSite771_12(17157, (911613071977462643L ^ local0_life1))] = moom.bq.STRIPE_LEFT;
    __sourceSharedArray771_4[__sourceIntrinsic_be4ea4242a12_originalDynamicSite771_14(1273, (8799656444794567841L ^ local0_life1))] = moom.bq.STRIPE_RIGHT;
    __sourceSharedArray771_4[__sourceIntrinsic_be4ea4242a12_originalDynamicSite771_16(310, (358629536250853751L ^ local0_life1))] = moom.bq.STRIPE_CENTER;
    __sourceSharedArray771_4[__sourceIntrinsic_be4ea4242a12_originalDynamicSite771_18(388, (4908490132171389432L ^ local0_life1))] = moom.bq.STRIPE_MIDDLE;
    __sourceSharedArray771_4[__sourceIntrinsic_be4ea4242a12_originalDynamicSite771_20(10039, (2618902948877066050L ^ local0_life1))] = moom.bq.STRIPE_DOWNRIGHT;
    __sourceSharedArray771_4[__sourceIntrinsic_be4ea4242a12_originalDynamicSite771_22(5026, (3290886887688432628L ^ local0_life1))] = moom.bq.STRIPE_DOWNLEFT;
    __sourceSharedArray771_4[__sourceIntrinsic_be4ea4242a12_originalDynamicSite771_24(17600, (7257063140870995074L ^ local0_life1))] = moom.bq.STRIPE_SMALL;
    __sourceSharedArray771_4[__sourceIntrinsic_be4ea4242a12_originalDynamicSite771_26(2386, (4976719581555355930L ^ local0_life1))] = moom.bq.CROSS;
    __sourceSharedArray771_4[__sourceIntrinsic_be4ea4242a12_originalDynamicSite771_28(18405, (6761729901691158500L ^ local0_life1))] = moom.bq.STRAIGHT_CROSS;
    __sourceSharedArray771_4[__sourceIntrinsic_be4ea4242a12_originalDynamicSite771_30(31463, (7846874741976760993L ^ local0_life1))] = moom.bq.TRIANGLE_BOTTOM;
    __sourceSharedArray771_4[__sourceIntrinsic_be4ea4242a12_originalDynamicSite771_32(553, (3694995960762989178L ^ local0_life1))] = moom.bq.TRIANGLE_TOP;
    __sourceSharedArray771_4[__sourceIntrinsic_be4ea4242a12_originalDynamicSite771_34(9684, (687107746852658620L ^ local0_life1))] = moom.bq.TRIANGLES_BOTTOM;
    __sourceSharedArray771_4[__sourceIntrinsic_be4ea4242a12_originalDynamicSite771_36(10529, (1804908683832119665L ^ local0_life1))] = moom.bq.TRIANGLES_TOP;
    __sourceSharedArray771_4[__sourceIntrinsic_be4ea4242a12_originalDynamicSite771_38(18371, (2148245275498069914L ^ local0_life1))] = moom.bq.DIAGONAL_LEFT;
    __sourceSharedArray771_4[__sourceIntrinsic_be4ea4242a12_originalDynamicSite771_40(5423, (8438877368425606516L ^ local0_life1))] = moom.bq.DIAGONAL_RIGHT;
    __sourceSharedArray771_4[__sourceIntrinsic_be4ea4242a12_originalDynamicSite771_42(22958, (4134535955932979681L ^ local0_life1))] = moom.bq.DIAGONAL_LEFT_MIRROR;
    __sourceSharedArray771_4[__sourceIntrinsic_be4ea4242a12_originalDynamicSite771_44(30322, (6659840027723468402L ^ local0_life1))] = moom.bq.DIAGONAL_RIGHT_MIRROR;
    __sourceSharedArray771_4[__sourceIntrinsic_be4ea4242a12_originalDynamicSite771_46(8067, (6138048245366876096L ^ local0_life1))] = moom.bq.CIRCLE_MIDDLE;
    __sourceSharedArray771_4[__sourceIntrinsic_be4ea4242a12_originalDynamicSite771_48(6317, (5631220118750355686L ^ local0_life1))] = moom.bq.RHOMBUS_MIDDLE;
    __sourceSharedArray771_4[__sourceIntrinsic_be4ea4242a12_originalDynamicSite771_50(18603, (6426247353805320427L ^ local0_life1))] = moom.bq.HALF_VERTICAL;
    __sourceSharedArray771_4[__sourceIntrinsic_be4ea4242a12_originalDynamicSite771_52(9261, (353477330670279783L ^ local0_life1))] = moom.bq.HALF_HORIZONTAL;
    __sourceSharedArray771_4[__sourceIntrinsic_be4ea4242a12_originalDynamicSite771_54(10132, (1596354835486957539L ^ local0_life1))] = moom.bq.HALF_VERTICAL_MIRROR;
    __sourceSharedArray771_4[__sourceIntrinsic_be4ea4242a12_originalDynamicSite771_56(520, (1436823352033049202L ^ local0_life1))] = moom.bq.HALF_HORIZONTAL_MIRROR;
    __sourceSharedArray771_4[__sourceIntrinsic_be4ea4242a12_originalDynamicSite771_58(31339, (7227428329504899622L ^ local0_life1))] = moom.bq.BORDER;
    __sourceSharedArray771_4[__sourceIntrinsic_be4ea4242a12_originalDynamicSite771_60(3181, (7941852443786441784L ^ local0_life1))] = moom.bq.CURLY_BORDER;
    __sourceSharedArray771_4[__sourceIntrinsic_be4ea4242a12_originalDynamicSite771_62(13656, (7400822943701028152L ^ local0_life1))] = moom.bq.CREEPER;
    __sourceSharedArray771_4[__sourceIntrinsic_be4ea4242a12_originalDynamicSite771_64(1373, (5847546303226215717L ^ local0_life1))] = moom.bq.GRADIENT;
    __sourceSharedArray771_4[__sourceIntrinsic_be4ea4242a12_originalDynamicSite771_66(7165, (6771383575801783198L ^ local0_life1))] = moom.bq.GRADIENT_UP;
    __sourceSharedArray771_4[__sourceIntrinsic_be4ea4242a12_originalDynamicSite771_68(17034, (3295849435480242904L ^ local0_life1))] = moom.bq.BRICKS;
    __sourceSharedArray771_4[__sourceIntrinsic_be4ea4242a12_originalDynamicSite771_70(30545, (3892590423838887711L ^ local0_life1))] = moom.bq.SKULL;
    __sourceSharedArray771_4[__sourceIntrinsic_be4ea4242a12_originalDynamicSite771_72(15875, (7594422086852134495L ^ local0_life1))] = moom.bq.FLOWER;
    __sourceSharedArray771_4[__sourceIntrinsic_be4ea4242a12_originalDynamicSite771_74(20593, (5695328211832547348L ^ local0_life1))] = moom.bq.MOJANG;
    return __sourceSharedArray771_4;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_88(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_92(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_96(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_100(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_102(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_104(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_106(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_108(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_116(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_118(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_121(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_124(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1113_129(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6983_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be4ea4242a12_originalDynamicSite771_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be4ea4242a12_originalDynamicSite771_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be4ea4242a12_originalDynamicSite771_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be4ea4242a12_originalDynamicSite771_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be4ea4242a12_originalDynamicSite771_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be4ea4242a12_originalDynamicSite771_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be4ea4242a12_originalDynamicSite771_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be4ea4242a12_originalDynamicSite771_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be4ea4242a12_originalDynamicSite771_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be4ea4242a12_originalDynamicSite771_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be4ea4242a12_originalDynamicSite771_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be4ea4242a12_originalDynamicSite771_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be4ea4242a12_originalDynamicSite771_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be4ea4242a12_originalDynamicSite771_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be4ea4242a12_originalDynamicSite771_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be4ea4242a12_originalDynamicSite771_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be4ea4242a12_originalDynamicSite771_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be4ea4242a12_originalDynamicSite771_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be4ea4242a12_originalDynamicSite771_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be4ea4242a12_originalDynamicSite771_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be4ea4242a12_originalDynamicSite771_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be4ea4242a12_originalDynamicSite771_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be4ea4242a12_originalDynamicSite771_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be4ea4242a12_originalDynamicSite771_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be4ea4242a12_originalDynamicSite771_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be4ea4242a12_originalDynamicSite771_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be4ea4242a12_originalDynamicSite771_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be4ea4242a12_originalDynamicSite771_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be4ea4242a12_originalDynamicSite771_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be4ea4242a12_originalDynamicSite771_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be4ea4242a12_originalDynamicSite771_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be4ea4242a12_originalDynamicSite771_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be4ea4242a12_originalDynamicSite771_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be4ea4242a12_originalDynamicSite771_74(int a0, long a1) throws E;
}
