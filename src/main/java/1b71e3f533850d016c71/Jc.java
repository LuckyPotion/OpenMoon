package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Jc {

public java.lang.String a;

public java.lang.String b;

public moom.J_[] c;

public int[] d;

public java.lang.String[] e;

public int f;

public java.lang.String[] g;

public int h;

public int i;

public net.minecraft.world.biome.BiomeGenBase[] j;

public moom.Ke k;

public int l;

public boolean m;

public int[] n;

public int o;

public int p;

public int[] q;

public int r;

public int s;

public boolean t;

public moom.Kb u;

public int[] v;

public int w;

public net.minecraft.client.renderer.texture.TextureAtlasSprite[] x;

public net.minecraft.client.renderer.texture.TextureAtlasSprite[] y;

public moom.J_[] z;

public java.lang.String[] A;

public net.minecraft.client.renderer.texture.TextureAtlasSprite[] B;

public int C;

public net.minecraft.block.state.IBlockState D;

public net.minecraft.util.EnumWorldBlockLayer E;

private static long F;

private static java.lang.String[] G;

private static java.lang.String[] H;

private static java.util.Map I;

private static long[] J;

private static java.lang.Integer[] K;

private static java.util.Map L;

public Jc(java.util.Properties p0, java.lang.String p1) { super(); }


private static void __sourceConstructorBody_e9d504841194cd2b(moom.Jc receiver, java.util.Properties p0, java.lang.String p1) throws Throwable {

moom.Jc __initValue537_436_0;

    int __initValue537_263_0;

    int __initValue537_263_1;

    long local3_life2;

    moom.J3 local6_life43;

    net.minecraft.entity.Entity[] local5_life83;

    int local7_life100;

    int local8_life107;

    init_join_452: {

    init_join_436: {

    init_join_274: {

    init_join_264: {

    init_join_263: {

    local3_life2 = (moom.Jc.F ^ 65055934267300L);

    moom.Jc.__sourceConstructorInit_e9d504841194cd2b_0(((moom.Jc)(receiver)));

    ((moom.Jc)(receiver)).a = ((java.lang.String)(null));

    ((moom.Jc)(receiver)).b = ((java.lang.String)(null));

    ((moom.Jc)(receiver)).c = ((moom.J_[])(null));

    ((moom.Jc)(receiver)).d = ((int[])(null));

    ((moom.Jc)(receiver)).e = ((java.lang.String[])(null));

    net.minecraft.entity.Entity[] __sourceSpill537_11 = moom.JM.b__Arrayr3();

    ((moom.Jc)(receiver)).f = ((int)(0));

    ((moom.Jc)(receiver)).g = ((java.lang.String[])(null));

    ((moom.Jc)(receiver)).h = ((int)(0));

    ((moom.Jc)(receiver)).i = ((int)(__sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_15(4250, (161075689017649789L ^ local3_life2))));

    ((moom.Jc)(receiver)).j = ((net.minecraft.world.biome.BiomeGenBase[])(null));

    ((moom.Jc)(receiver)).k = ((moom.Ke)(null));

    ((moom.Jc)(receiver)).l = ((int)(0));

    ((moom.Jc)(receiver)).m = ((boolean)(false));

    ((moom.Jc)(receiver)).n = ((int[])(null));

    ((moom.Jc)(receiver)).o = ((int)(0));

    ((moom.Jc)(receiver)).p = ((int)(0));

    ((moom.Jc)(receiver)).q = ((int[])(null));

    ((moom.Jc)(receiver)).r = ((int)(0));

    ((moom.Jc)(receiver)).s = ((int)(1));

    ((moom.Jc)(receiver)).t = ((boolean)(false));

    ((moom.Jc)(receiver)).u = ((moom.Kb)(null));

    ((moom.Jc)(receiver)).v = ((int[])(null));

    ((moom.Jc)(receiver)).w = ((int)(1));

    ((moom.Jc)(receiver)).x = ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(null));

    ((moom.Jc)(receiver)).y = ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(null));

    ((moom.Jc)(receiver)).z = ((moom.J_[])(null));

    ((moom.Jc)(receiver)).A = ((java.lang.String[])(null));

    ((moom.Jc)(receiver)).B = ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(null));

    ((moom.Jc)(receiver)).C = ((int)(-1));

    ((moom.Jc)(receiver)).D = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE()));

    ((moom.Jc)(receiver)).E = ((net.minecraft.util.EnumWorldBlockLayer)(null));

    local6_life43 = new moom.J3(__sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_42(18381, (7490472501769331129L ^ local3_life2)));

    ((moom.Jc)(receiver)).a = ((java.lang.String)(((moom.J3)(local6_life43)).a__String(((java.lang.String)(p1)))));

    ((moom.Jc)(receiver)).b = ((java.lang.String)(((moom.J3)(local6_life43)).b(((java.lang.String)(p1)))));

    ((moom.Jc)(receiver)).c = ((moom.J_[])(((moom.J3)(local6_life43)).a__ArrayJ_(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_49(4570, (2900216356615600054L ^ local3_life2))))))))));

    ((moom.Jc)(receiver)).d = ((int[])(((moom.J3)(local6_life43)).a__ArrayInt(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_54(19432, (2195528851438464411L ^ local3_life2))))))))));

    ((moom.Jc)(receiver)).e = ((java.lang.String[])(((moom.Jc)(receiver)).a__ArrayString(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_59(19054, (8116872546720476249L ^ local3_life2))))))))));

    ((moom.Jc)(receiver)).f = ((int)(moom.Jc.e(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_64(10341, (5349229243703692902L ^ local3_life2))))))))));

    ((moom.Jc)(receiver)).g = ((java.lang.String[])(((moom.Jc)(receiver)).b__ArrayString(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_69(32180, (6001067858405776361L ^ local3_life2))))))))));

    ((moom.Jc)(receiver)).h = ((int)(moom.Jc.d(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_74(3957, (7503481062808561974L ^ local3_life2))))))))));

    ((moom.Jc)(receiver)).i = ((int)(moom.Jc.b(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_79(7771, (7817331441295046658L ^ local3_life2))))))))));

    local5_life83 = __sourceSpill537_11;

    ((moom.Jc)(receiver)).j = ((net.minecraft.world.biome.BiomeGenBase[])(((moom.J3)(local6_life43)).a__ArrayES(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_85(1781, (8283878502058008802L ^ local3_life2))))))))));

    ((moom.Jc)(receiver)).k = ((moom.Ke)(((moom.J3)(local6_life43)).a__Ke(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_90(2937, (7081740451712904510L ^ local3_life2))))))))));

    moom.Jc __sourceSpill537_94 = receiver;

    if (!((local5_life83 != null))) {

        __initValue537_436_0 = __sourceSpill537_94;

        break init_join_436;

    }

    if (!((((moom.Jc)(__sourceSpill537_94)).k == null))) {

        break init_join_274;

    }

    local7_life100 = ((moom.J3)(local6_life43)).a(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_97(4067, (1690734660741015949L ^ local3_life2))))))), ((int)(-1)));

    local8_life107 = ((moom.J3)(local6_life43)).a(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_102(13276, (51392429117805970L ^ local3_life2))))))), ((int)(__sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_105(17500, (3751501569698692776L ^ local3_life2)))));

    int __sourceSpill537_108 = local7_life100;

    int __sourceSpill537_109 = -1;

    if (!((local5_life83 != null))) {

        __initValue537_263_0 = __sourceSpill537_108;

        __initValue537_263_1 = __sourceSpill537_109;

        break init_join_263;

    }

    if (!((__sourceSpill537_108 == __sourceSpill537_109))) {

        break init_join_264;

    }

    __initValue537_263_0 = local8_life107;

    __initValue537_263_1 = __sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_111(12543, (290930191029504533L ^ local3_life2));

    }

    if (!((__initValue537_263_0 != __initValue537_263_1))) {

        break init_join_274;

    }

    }

    ((moom.Jc)(receiver)).k = ((moom.Ke)(new moom.Ke(new moom.Kd(local7_life100, local8_life107))));

    }

    ((moom.Jc)(receiver)).l = ((int)(((moom.J3)(local6_life43)).a(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_114(20838, (7874513425208637305L ^ local3_life2))))))), ((int)(-1)))));

    ((moom.Jc)(receiver)).m = ((boolean)(((moom.J3)(local6_life43)).a(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_119(4047, (7509904412057053673L ^ local3_life2))))))), ((boolean)(false)))));

    ((moom.Jc)(receiver)).n = ((int[])(((moom.Jc)(receiver)).a(((java.util.Properties)(p0)))));

    ((moom.Jc)(receiver)).o = ((int)(((moom.J3)(local6_life43)).a(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_126(15638, (534482341210987354L ^ local3_life2))))))), ((int)(-1)))));

    ((moom.Jc)(receiver)).p = ((int)(((moom.J3)(local6_life43)).a(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_131(27762, (3462948455711885894L ^ local3_life2))))))), ((int)(-1)))));

    ((moom.Jc)(receiver)).q = ((int[])(((moom.J3)(local6_life43)).a__ArrayInt(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_136(28460, (7761302057502001427L ^ local3_life2))))))))));

    ((moom.Jc)(receiver)).r = ((int)(((moom.J3)(local6_life43)).a(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_141(4971, (1286860886660986232L ^ local3_life2))))))), ((int)(0)))));

    ((moom.Jc)(receiver)).s = ((int)(moom.Jc.a(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_146(22610, (8997425972370112092L ^ local3_life2))))))))));

    ((moom.Jc)(receiver)).t = ((boolean)(((moom.J3)(local6_life43)).a(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_151(32691, (8367306997188385265L ^ local3_life2))))))), ((boolean)(false)))));

    ((moom.Jc)(receiver)).u = ((moom.Kb)(((moom.J3)(local6_life43)).a(((java.lang.String)(__sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_156(22327, (6452004966939586872L ^ local3_life2)))), ((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_158(5765, (3430694994406584464L ^ local3_life2))))))))));

    ((moom.Jc)(receiver)).z = ((moom.J_[])(((moom.J3)(local6_life43)).a__ArrayJ_(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_163(18884, (1299529236466560991L ^ local3_life2))))))))));

    ((moom.Jc)(receiver)).A = ((java.lang.String[])(((moom.Jc)(receiver)).a__ArrayString(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_168(2221, (7723863224783515385L ^ local3_life2))))))))));

    ((moom.Jc)(receiver)).C = ((int)(((moom.J3)(local6_life43)).a(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_173(2861, (7544510213592001895L ^ local3_life2))))))), ((int)(-1)))));

    ((moom.Jc)(receiver)).D = ((net.minecraft.block.state.IBlockState)(((moom.J3)(local6_life43)).a(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_178(32631, (4048528546832439630L ^ local3_life2))))))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())))));

    __initValue537_436_0 = receiver;

    }

    ((moom.Jc)(__initValue537_436_0)).E = ((net.minecraft.util.EnumWorldBlockLayer)(((moom.J3)(local6_life43)).a(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_185(5340, (109380914668712652L ^ local3_life2))))))), ((net.minecraft.util.EnumWorldBlockLayer)(net.minecraft.util.EnumWorldBlockLayer.CUTOUT_MIPPED)))));

    if (!((local5_life83 == null))) {

        break init_join_452;

    }

    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));

    }

    return;

}



static {
F = ((long)(((moom._a)(moom._c.a(((long)(6176658676999945260L)), ((long)(-7977525942828425319L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(221398793976131L)))));
    I = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.Jc.F ^ 109176211856075L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill608_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill608_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill608_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill608_14 = new byte[8];
    (__sourceSpill608_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill608_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation608_16 = __sourceSpill608_14;
    ((javax.crypto.Cipher)(__sourceSpill608_11)).init(((int)(__sourceSpill608_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill608_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation608_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[125];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "\027ÍæðÉæ<¶\023ü°¥F\002²©÷4!·ô\034É|i\\s\006û\"j¡ÛüZ=\020Ãö­ùQ³5ª+B}¶\020\0176º^¬¡MB8ª\016²$ s\021¨î`Þ! dj9Òâ~ÀëñK\024ìjûâe'ÄbWC\\\030\030­²Æù¡HÖ¹æ\031l\b\002\024Äq.¿ü\r(ÑkÎöáþ&`TÔ\032øceá¾ZYú\001\032{SÆ\033p½8Ô !W\031ë\036Ú\020­-ÙÖ¤\032»1¶\006ÿù\r\020îÛY§ÝÅRj§\022;V¦ù\030ôºG\013mÌ]\031g\026È\f¡fÇq \016ÇÈ¶05LÓ4 Â\036WøFA½q9«¹à´\001yj\021åÌ« 0ù:5ÈßÇ±»M©8\020Yû\030õ\023²´~ºÌRÁ=\030÷b\034a;7Ð2À'i°ñVä÷bÿÆ§\020ÇÛ£úMÇ/Ò~8RÚ¨\004eÊHu,Q\0220rHà=ÉJr­ã1Ö$\f÷ÓåH¼µî±\016Ç[Ò\035?ª_¼÷Y¼|ÏC°c®<66¾ômëp:\005ÈÁu%õï\007*i*ü\020\fóìiwC3äVnr.ì__\020\023oz\016FC\034Ö)V}â\031ä?\020 FCòZ\002ö\013ý:\tDH²ïÌ¨­¿>$A*B7\b 2ÛköoÍ@q$cá£UÐ+\r£\030u$2\007vþð¨Ùª\000Ç`A]p×Xr½}NßÕs³ÝÃ¤-sÂí·(¤ØÛ-da'Îj¥S@G\tH[\013ÎûDÙ`^3if§Òd­¦}\036+8Øçjl \"\0209ä\\!«e-Z\030lWwZ\031¥7ð@¡Â÷<Þ¼Ï\000ØWa¥.òñJ0m\003èÅ\002$\0208\037\006Ô?ô/¡ßm:¾+x.\020\177Z~Ê\177R\016I\f81(Þs³°\004µ1Õ[g|\006^ÚùVÜ«Jª!¸ñK\005ib{\004\036µ½_\030\006N\177wÆ\026¦Üè\035Gw²¸nLâ;5Ü\020fò»Ì×8a¤<0\033\000g# \001\005\007Z\030­5ejjó>ò@\016Ø¼4õ\177¶ª=©ö0»tòëdÞJ§\ni¡\037$\f½5¥»\n|ZÆê%}\"å4\022+\027yôÒøqöR`éB¯çò³\020ªm©°Ð»A\002ú§ÁY¶f <\032y?\001ä{\016Û¼û<]ãáF¾\177KàË\027èCCd­EÆ RmYª¡g+6LÁÁ\023Tçßâ\031\013W»±-¹6/Øþk>\020x¾íj\020ô\004ö\025E]\003e¦(öú ÇâüX­Ó«ß\006íÎ\023è\\£\030ó®4no/úTzpÿü\001{xÑìnõ\020PF/AúºNpÎÃ\003`åÙ< 7Éø.i«¨H\022\034S[ûÿ-V[o³ã\"%nÏ&\025\n @03\030À^ºUÆï1É!)\032\020¡m¡ÙNÜ(êµ~|ï\tNò2\033[±L|r¸Åý<\b\020&\020)½Í\016Ð\bûDÈWL\031.O$¾6 \024\n.wáä\026eUm^ñÖµ\003/J¦¢&CÀ±÷¯°\024(ã/´ YU©½k¾úï+¢\r\nýþg°ê\013Y\022á\031îÊÄÉW kA0`@§\ff\021Çµ¨Ø«Äz÷ÊM\035DÙhësbþø\tô\037¸dÌÕ/lW¦ôiæô\f\022ÒÍ:wçùå\"ÃìGtôh6ê\016É×T(zÀR\tü<1:\025}ôÑ\tÏ\032Ê\021Ès\007!LÖ8<ñ`¿µ®Õëa\0214Wn\020±B\000Qéµ\026\020NsNèeó@\024D\001VbK\fÝ\037ñà\017ÏRÐj&¿.Ó °á\f¦®ÿ«%1ä~hÐ¹®4ð\0041Í\034{6¡$KÈ\006Üdu³Vî©1\034\020\177OV\026\002\t9¯Ä\024Tw\020\020ÄÝim\\M4ÞØ­sö¿(Zñø\002~,W\0177·¾¿\013øÕ\035ê\0302åÜ\026 GÅ²Ö\025è\006wÎl?\030,\027eYÁý¾Í\bKÂPKí4íÚù.D\020\000¼Ñå\030\031N¡äÞÞ\027%0\030\031:Þ,r\022Ä{É\r\033¬òsaU\020¤É£VP¸°\013Q°¶ÌÐ\033ÓdÅÊ iÀýé-\032¿FÅµS\024=ûx.\013÷«\033yBø\177YR8Õ\tþÓy'%>EÑ¡ àkPí¾jóÆ<EaMSP­°¸· <CP2¾\031$]ñÑã6þ/êFÓ\020\027ÔzûR\030K\rð \017Íù\013$\032¥]ÖÃF!Rvæ\031¨¦\013aîv¤F/\006\f5Ra\020lÆ,\0241C(CÁñ~p/ ¸\016Ç?rdñ­\030!ú\177Î\036kËÿ¥NÑËa\007\020^Èç\030®\022î@û\t \"¼Ý\0234c&ÎÍëï2\027xj\020$÷O£0\t\027§«U»\033JzP\007\0226ËFZwÇ¹æÓï½u\rnu>étÊ©«[%>u3ºD×|ø\nh¤Øæòp²Ú´\026S$Sòl.Pt5¸ÑÆä¹ç½>EòVQ²0ÅNüï×ê'\020J\n[,ë\007\004Yt \033%BY\r çá!É®4(%\n8ÈÁ¤êOÿÇæKs\027½öC9é1(WÀ\032«ßkz\\õ;ÖSwv\034ßúU´\007\f\b\"TÎd1Ê:i¸üæ \032K\r+ÒyêsKøw6Hì\\mÄçiðÞÒôe6Yþh '(ò\020òlYN)(sÉÜ±\003¤5úï+ûù»ôbï°`Ïìð\027*éXáø\026/º\020êj!\007ÿÊEþc4È')ºÑ \020ByS+ð½\016Þ\021é \004ýíä¶l0A½\005k>I\006ÎÅô[\020ZâºÑínæ3Ó&J&}kÖ\020¬\013¢ð\027<Tý:(\007V(wä\022×ëTæ¡ê|Ã\0044Ø±{~7ÚÔåZd\037u·ñÇ1h*Î.\020%\005|ñ%b<\017D$\035]ú\0251u\020}Ò¦\"\005\râw§C\030¶¯+ì \026~ì¹ô¬»O+7z\022\b£±è£ñL«k\bë\021ô«B×I\020\036LÐgÔáÌ§úi¤\034CþX\025\007Ô\017Z\0344TØ\005×Á\034\025Ý<¢iç{ø »#þßyè\031?Ê}èf0é\0038ü¢½](Üx]7°ã4º\034Ý:ª§¹Â@\017óUò¬\bÃ±oMÛ¼\022!zß\013X\020ëÄ«c]Bô$snXa°«\027\030Òí\007Ìªîò·ÛySÜv\020ÚIØ\nd>h8Õ0kL*£ü ÞúF£;7f#Nn\f¿êªÓsßÌ\022yðpÀ \r7Óx:àÒ\025ïì0æ\001'P|íy}\177ÄM\022ú\t9j\013\006Aq\n\026¹Á)ó­wÌ×`sEÊyçð×\025Ï?#m\013PÍ¬\022·»\031îª4\tõ,jp³«×\035Y½sí¸ºÈ\"Äþ[LA¬A¯1zÑXâ1*\003\\»%%îW_pôv\025É(Í\026[|\036xË7I\007Ö Ù'¶©Í\006à_á\001\fµÝTD(V«%¹áB±Ø°ªÈ)\020\017º\037ÊýPÓV:l¤\177\023(ÍöðÝ\fù\027=\005;^\\ËÅ;±Í0\"hvÕ·m þôoüç'ÊÜ\020¢\033ÇÐ'ùÌ\004NËÏ>­&\030¾\016\017Ò_Å\0060/±%%\033ñ\f¬ÍnìïQ¯]÷\020éIÿ'Z±òçKp8£70\020M¿¸\027¢s!h\t»ãTJ|\034 7%Bg!Æ¤fjS\027øÊþ«Ð°\006é«<h}¢¨)­\020\r9`!8Úi|X»\027M@t õ\b¹®v\t§\021V¦\020º¦\036 Uý¦ìÏ°ULûÏ3Êm\035Nâ\001F%X]\027Q$\037.¦_üú¬\004\raõn$\020\\{Jñui­BÔËè9\n\030\036Ø~\030¤Á,ÝOz­\031âADwªÑ5q}z\020w ÅK[HÓßWJÆ©|º Õ>\002Òãr/Üü8µ§\007°Cf³ôAø'ïåòÌF(úô>æ<T\024®æ¾CïLNýHÃ`G»sOþ\024ó4¬¿\023oZ¶mEW\\H1\003Çj|×)\037«è2\001{ÔèybPÕ¼\t·QñÇ0ÀB&x¾\031«È£+.Óî#|© £]§&÷2ë8S¤EòÙ[(.»\017J/C4sÄNÐM`nØ¨0ñ\035÷Q5º\\\n[Ü\024 Ý»¦\035«²ÚÕä\030o·ñ+íân\022Ù·\031\"+_\020·CÉ\005Ý >\033*t\006ÓÛ\034\026\b\0066­ôÊxÛZÕ=7fF\177Uþcº@ìÂ\017OÙÜ¤kv[Òó\016._(Ê¾iF:\005RóX3¨Ö\näÛÔÆ×déëÓJtYqî°Çþ\tÁÔ\177ÿµ\033 øFzÒ\024#,ÚVÉX½\013wð\006$OObÕu\030µ©Sj\020ªK=\035zm£ïËv¹½-Í@I k\025ö \0365\031þG\017\033×#¬HÀ[}Rîd?\006\023ô\016\177í\0233È\\î,´sYDôä©Ù\177\035j¨³ÈÛÃvÐI÷\020L\000\022ûõ¢\006|¦dWI®Éz(·{Ø(\006´ÞMcQ@.\000rq;×Ð£áìo;}E\004ìý§Ød8ôC£|\030©ò\177û;g\007tãC,÷U)\033(\t¾¶:´Ù\020b=TÅÜÉÝÚÜ\017\020 ß0õ3Cß,NÊ\027Xg\002¥J#L\núÍ´\005zõü³f9NXÊÀ¸BBn\022¿Ø\177s!·\027Ê3\003\020¼¼}\032¯\\NJ\0040\002ìN+%(J\033,¨zPìNx\026wÚ¦\036ØM¸Ñ»\001ÇHÞêõ%*\\}È\006&K,(8\ftûôþ#\tHøÀA \006ocTÓ *g)Á2y[ÙC¯Ñ~VÊ!r X¸\036öKá·,¦Öçâ=­äs¶ ÙÕ[Ì#(TD7\rJ»\0166r¸NÉRë\031X.~ÅÌM@B7àõß»¢ëjùÎÒLã3ªkÓN,]±ª\007\024ípû6k°\020\rBòJeÉÉ4«-q5&@(\026}F\017S#P,Â°\022²s\006ÜrüÄRÉK¡è®fÙ¤\005Ö¦\007|Ç´~ðÂ \037ôc3\024C¶þ¹.c\001\fûa<\030³S+ÞÎPõ\bZ:X\020¶ÁQ·8ÂKD\020!çÀ¹j\020«Í\007Áô£îæokõtìì\005\030\006I+\033o2ñ¥[ñÊ\t ÍR°\002\nX}Jò²\030÷Â7>}/·jS?ø:à.ú`*óJzL,\030\024öió°\"Ò' Ù¿°3G\027}ª\tD\020#§ø!uPT\024e\"µå¶`\020\030³\037É:ÇÚ5|VêPí\030zÕ(ø \\Ô%^Õ_P< 8½JäÄ÷-ãEÃGhIjÐi»*!¹ _\021Ç\004\007ÛÐ¥È\fÞ+ÁçC\020\033±\004º`LF\022?\005¸âOp¤@º\013¯\006\032Û¼W· n±d\001äÜ°¬}÷Ýê/ëÞÖ#¢©\020\005\004ZlV\nf4ªuOõ­Ja;Y01ÜÛÈ¡ó(wOl¦¡=\020«~hw¿£õ\035ßk´¥ÅµÃ\024¡z\023\rú\t8iÜ÷\nªú+¬ó«\002KO\013LoØþ\006ùÝ\023p^Ë¦¸ìÏ\"=\177!+Mx,P««.öe\025\nLùÂ¼8"))).length();
    int local16_life24 = 40;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill608_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill608_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill608_29)).doFinal(((byte[])(__sourceSpill608_28)));
        java.lang.String __sourceSpill608_34 = ((java.lang.String)(moom.Jc.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill608_35 = local20_life19;
        int __sourceSpill608_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill608_35)[__sourceSpill608_36] = __sourceSpill608_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "è(Ä\032]BÂô^¶£>Ç¼\036¨Oë\0049&ëÉ|½$×\020 ]Û¥ðêUx~Ç^F¸"))).length();
    local16_life24 = 32;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill608_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill608_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill608_42)).doFinal(((byte[])(__sourceSpill608_41)));
        java.lang.String __sourceSpill608_47 = ((java.lang.String)(moom.Jc.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill608_48 = local20_life19;
        int __sourceSpill608_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill608_48)[__sourceSpill608_49] = __sourceSpill608_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    G = ((java.lang.String[])(local20_life19));
    H = ((java.lang.String[])(new java.lang.String[125]));
    L = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill608_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill608_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill608_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill608_60 = new byte[8];
    (__sourceSpill608_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill608_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation608_62 = __sourceSpill608_60;
    ((javax.crypto.Cipher)(__sourceSpill608_57)).init(((int)(__sourceSpill608_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill608_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation608_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[30];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "Â·¾@´jS\024~ì¥WÑ½oôË\016¹÷Ïd&ë_ð¡º»\017^r\026Þ°Ñ\177\002í0\034+Xÿ,,\004<y¼ufæxrCP÷»ô4Å:³ª]ø£%Õ°Í\n¼XþWe\"xÁ`<-\b]hx>X9ï4ýÝ¼;tl\177¼21\\¢H²ÿ|¼U¬â\031ì±>9J\006\tQ!ìÅ­ÕK\016NÈv¢\025Ù oçºwäâY#è^9Þ~\020¯<\024 \016®h5\034Ü]\bòBzt¸â\017(\0139yXª.>zÊFk?¿ð:y¨ TïR¸"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill608_71 = local4_life67;
        int __sourceSpill608_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill608_71)).substring(((int)(__sourceSpill608_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill608_76 = local6_life65;
        int __sourceSpill608_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill608_79 = new byte[8];
        (__sourceSpill608_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill608_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill608_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill608_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill608_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill608_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill608_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill608_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill608_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill608_80)).doFinal(((byte[])(__sourceSpill608_79)));
        (__sourceSpill608_76)[__sourceSpill608_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "×°¬\024ÓCö¡rüãR\024$"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill608_84 = local4_life67;
        int __sourceSpill608_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill608_84)).substring(((int)(__sourceSpill608_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill608_89 = local6_life65;
        int __sourceSpill608_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill608_92 = new byte[8];
        (__sourceSpill608_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill608_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill608_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill608_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill608_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill608_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill608_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill608_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill608_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill608_93)).doFinal(((byte[])(__sourceSpill608_92)));
        (__sourceSpill608_89)[__sourceSpill608_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    J = ((long[])(local6_life65));
    K = ((java.lang.Integer[])(new java.lang.Integer[30]));
}

private static native <E extends Throwable> void __sourceConstructorInit_e9d504841194cd2b_0(moom.Jc a0) throws E;

public java.lang.String toString() {
long local1 = (moom.Jc.F ^ 128585417772722L);
    java.lang.String __sourceSpill1731_7 = this.a;
    java.lang.String __sourceSpill1731_8 = this.b;
    java.lang.String __sourceSpill1731_9 = moom.BU.a(((java.lang.Object[])(this.c)));
    java.lang.String local3 = moom.BU.a(((java.lang.Object[])(this.e)));
    java.lang.String local4 = __sourceSpill1731_9;
    java.lang.String local5 = __sourceSpill1731_8;
    java.lang.String local6 = __sourceSpill1731_7;
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1731_14(__sourceIntrinsic_a86c261fcdee_originalDynamicSite1731_10(4159, (8000128482223540014L ^ local1)), local6, __sourceIntrinsic_a86c261fcdee_originalDynamicSite1731_11(4800, (8316625345817888157L ^ local1)), local5, __sourceIntrinsic_a86c261fcdee_originalDynamicSite1731_12(774, (1319266981062366224L ^ local1)), local4, __sourceIntrinsic_a86c261fcdee_originalDynamicSite1731_13(19702, (7929210783487695770L ^ local1)), local3);
}


private boolean i(java.lang.String p0) {
java.lang.String[] forwardValue2368_22_0;
    int forwardValue2368_39_0;
    java.lang.String[] spill2368_0;
    int spill2368_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_39: {
    forward_join_38: {
    forward_join_22: {
    forward_join_20: {
    life2_3 = (moom.Jc.F ^ 11721225819279L);
    life4_5 = moom.JM.b__Arrayr3();
    spill2368_0 = this.g;
    if (!((life4_5 != null))) {
        forwardValue2368_22_0 = spill2368_0;
        break forward_join_22;
    }
    if (!((spill2368_0 == null))) {
        break forward_join_20;
    }
    this.g = ((java.lang.String[])(((moom.Jc)(this)).b__ArrayString(((java.lang.String)(__sourceIntrinsic_8a6f2c26bf9b_invokedynamic2368_3(13878, (1146666891217533740L ^ life2_3)))))));
    }
    forwardValue2368_22_0 = this.g;
    }
    spill2368_1 = (forwardValue2368_22_0).length;
    if (!((life4_5 != null))) {
        forwardValue2368_39_0 = spill2368_1;
        break forward_join_39;
    }
    if (!((spill2368_1 != 4))) {
        break forward_join_38;
    }
    java.lang.String __stackOp2368_8_0 = p0;
    java.lang.String __stackOp2368_8_1 = __sourceIntrinsic_8a6f2c26bf9b_invokedynamic2368_7(1745, (3159888170473376727L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_8a6f2c26bf9b_invokedynamic2368_9(__stackOp2368_8_1, __stackOp2368_8_0))));
    return ((0) != 0);
    }
    forwardValue2368_39_0 = 1;
    }
    return ((forwardValue2368_39_0) != 0);
}


public boolean b(int p0) {
return (__sourceIntrinsic_booleanComparison((moom.Ka.a(((int)(p0)), ((moom.J_[])(this.c))))) != 0);
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5241_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Jc"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private boolean b__Boolean(java.lang.String p0) {
java.lang.String[] forwardValue2358_22_0;
    int forwardValue2358_43_0;
    java.lang.String[] spill2358_0;
    int spill2358_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_43: {
    forward_join_42: {
    forward_join_22: {
    forward_join_20: {
    life2_3 = (moom.Jc.F ^ 140354189647075L);
    life4_5 = moom.JM.b__Arrayr3();
    spill2358_0 = this.g;
    if (!((life4_5 != null))) {
        forwardValue2358_22_0 = spill2358_0;
        break forward_join_22;
    }
    if (!((spill2358_0 == null))) {
        break forward_join_20;
    }
    this.g = ((java.lang.String[])(((moom.Jc)(this)).b__ArrayString(((java.lang.String)(__sourceIntrinsic_34999ae2dcc3_invokedynamic2358_3(12479, (487920705362130307L ^ life2_3)))))));
    }
    forwardValue2358_22_0 = this.g;
    }
    spill2358_1 = (forwardValue2358_22_0).length;
    if (!((life4_5 != null))) {
        forwardValue2358_43_0 = spill2358_1;
        break forward_join_43;
    }
    if (!((spill2358_1 < __sourceIntrinsic_34999ae2dcc3_invokedynamic2358_7(13968, (1297872336571133748L ^ life2_3))))) {
        break forward_join_42;
    }
    java.lang.String __stackOp2358_9_0 = p0;
    java.lang.String __stackOp2358_9_1 = __sourceIntrinsic_34999ae2dcc3_invokedynamic2358_8(17801, (7372312942011547824L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_34999ae2dcc3_invokedynamic2358_10(__stackOp2358_9_1, __stackOp2358_9_0))));
    return ((0) != 0);
    }
    forwardValue2358_43_0 = 1;
    }
    return ((forwardValue2358_43_0) != 0);
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Jc.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public int b() {
int lexicalValue857_46_0;
    net.minecraft.entity.Entity[] spill857_0;
    int spill857_1;
    int spill857_2;
    long life1_3;
    int life4_6;
    net.minecraft.entity.Entity[] life3_7;
    int life4_15;
    moom.J_[] life5_21;
    int life6_24;
    int life7_26;
    moom.J_ life8_33;
    lexical_join_46: {
    lexical_join_45: {
    life1_3 = (moom.Jc.F ^ 47092265142766L);
    spill857_0 = moom.JM.b__Arrayr3();
    life4_6 = -1;
    life3_7 = spill857_0;
    spill857_1 = ((moom.Jc)(this)).a(((int[])(this.d)), ((int)(life4_6)));
    if (!((life3_7 != null))) {
        lexicalValue857_46_0 = spill857_1;
        break lexical_join_46;
    }
    life4_15 = spill857_1;
    if (!((this.c != null))) {
        break lexical_join_45;
    }
    life5_21 = this.c;
    life6_24 = (life5_21).length;
    life7_26 = 0;
    lexical_cycle_27: while (true) {
    if (!((life7_26 < life6_24))) {
        break lexical_join_45;
    }
    life8_33 = (life5_21)[life7_26];
    spill857_2 = ((moom.Jc)(this)).a(((int[])(((moom.J_)(life8_33)).a__ArrayInt())), ((int)(life4_15)));
    if (!((life3_7 != null))) {
        lexicalValue857_46_0 = spill857_2;
        break lexical_join_46;
    }
    life4_15 = spill857_2;
    life7_26 += 1;
    if (!((life3_7 == null))) { continue lexical_cycle_27; }
    break lexical_cycle_27;
    }
    }
    lexicalValue857_46_0 = life4_15;
    }
    return lexicalValue857_46_0;
}


private static int b(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x69A2;
        if (K[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = J[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])L.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    L.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Jc", exception);
            }
            int n7 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Jc.K[n4] = n7;
        }
        return K[n4];
}


private static int b(java.lang.String p0) {
java.lang.String lexicalValue858_17_0;
    int lexicalValue858_53_0;
    java.lang.String spill858_0;
    int spill858_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    java.lang.String[] life4_28;
    int life5_30;
    java.lang.String[] life6_32;
    int life7_35;
    int life8_37;
    java.lang.String life9_44;
    int life10_47;
    lexical_join_53: {
    lexical_join_52: {
    lexical_join_17: {
    lexical_join_16: {
    life1_3 = (moom.Jc.F ^ 110361836401440L);
    life3_5 = moom.JM.b__Arrayr3();
    spill858_0 = p0;
    if (!((life3_5 != null))) {
        lexicalValue858_17_0 = spill858_0;
        break lexical_join_17;
    }
    if (!((spill858_0 == null))) {
        break lexical_join_16;
    }
    return __sourceIntrinsic_a9b1eb8ac462_invokedynamic858_2(15589, (945596240225077906L ^ life1_3));
    }
    lexicalValue858_17_0 = p0;
    }
    life4_28 = moom.BU.a__ArrayString(((java.lang.String)(lexicalValue858_17_0)), ((java.lang.String)(__sourceIntrinsic_a9b1eb8ac462_invokedynamic858_3(26640, (4056966155955323589L ^ life1_3)))));
    life5_30 = 0;
    life6_32 = life4_28;
    life7_35 = (life6_32).length;
    life8_37 = 0;
    lexical_cycle_33: while (true) {
    if (!((life8_37 < life7_35))) {
        break lexical_join_52;
    }
    life9_44 = (life6_32)[life8_37];
    life10_47 = moom.Jc.c(((java.lang.String)(life9_44)));
    spill858_1 = (life5_30 | life10_47);
    if (!((life3_5 != null))) {
        lexicalValue858_53_0 = spill858_1;
        break lexical_join_53;
    }
    life5_30 = spill858_1;
    life8_37 += 1;
    if (!((life3_5 == null))) { continue lexical_cycle_33; }
    break lexical_cycle_33;
    }
    }
    lexicalValue858_53_0 = life5_30;
    }
    return lexicalValue858_53_0;
}


private static java.lang.String b__String(java.lang.String p0) {
long local1 = (moom.Jc.F ^ 87270788061842L);
    int local3 = ((java.lang.String)(p0)).lastIndexOf(((int)(__sourceIntrinsic_98e46c5122cb_invokedynamic4380_1(10790, (5499035073019835874L ^ local1)))));
    return ((local3 < 0) ? "" : ((java.lang.String)(p0)).substring(((int)(0)), ((int)(local3))));
}


private java.lang.String[] b__ArrayString(java.lang.String p0) {
int lexicalValue859_99_0;
    int lexicalValue859_118_0;
    int lexicalValue859_129_0;
    int lexicalValue859_184_0;
    int lexicalValue859_200_0;
    java.lang.String lexicalValue859_204_0;
    java.lang.String[] lexicalValue859_213_0;
    boolean spill859_0;
    int spill859_1;
    int spill859_2;
    int spill859_3;
    int spill859_4;
    java.lang.String spill859_5;
    java.lang.String spill859_6;
    java.lang.String spill859_7;
    java.lang.String[] spill859_8;
    boolean spill859_9;
    boolean spill859_10;
    boolean spill859_11;
    java.lang.String spill859_12;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    java.util.ArrayList life5_15;
    java.lang.String[] life6_23;
    java.lang.String[] life7_25;
    int life8_28;
    int life9_30;
    java.lang.String life10_37;
    java.lang.String[] life11_55;
    int life12_70;
    int life13_76;
    int life14_131;
    int life8_167;
    java.lang.String life9_177;
    java.lang.String life9_182;
    lexical_join_213: {
    lexical_join_212: {
    lexical_join_129: {
    lexical_join_122: {
    lexical_join_10: {
    life2_3 = (moom.Jc.F ^ 25308610035915L);
    life4_5 = moom.JM.b__Arrayr3();
    if (!((p0 == null))) {
        break lexical_join_10;
    }
    return null;
    }
    life5_15 = new java.util.ArrayList();
    life6_23 = moom.BU.a__ArrayString(((java.lang.String)(p0)), ((java.lang.String)(__sourceIntrinsic_fafb7c06958a_invokedynamic859_2(20758, (5610583678880860177L ^ life2_3)))));
    life7_25 = life6_23;
    life8_28 = (life7_25).length;
    life9_30 = 0;
    lexical_cycle_29: while (true) {
    lexical_join_119: {
    lexical_join_118: {
    lexical_join_115: {
    lexical_join_99: {
    lexical_join_98: {
    if (!((life9_30 < life8_28))) {
        break lexical_join_122;
    }
    life10_37 = (life7_25)[life9_30];
    spill859_0 = ((java.lang.String)(life10_37)).contains(((java.lang.CharSequence)("-")));
    if (!((life4_5 != null))) {
        lexicalValue859_129_0 = ((spill859_0) ? 1 : 0);
        break lexical_join_129;
    }
    if (!((life4_5 != null))) {
        lexicalValue859_118_0 = ((spill859_0) ? 1 : 0);
        break lexical_join_118;
    }
    if (!(spill859_0)) {
        break lexical_join_115;
    }
    life11_55 = moom.BU.a__ArrayString(((java.lang.String)(life10_37)), ((java.lang.String)("-")));
    spill859_1 = (life11_55).length;
    if (!((life4_5 != null))) {
        lexicalValue859_118_0 = spill859_1;
        break lexical_join_118;
    }
    if (!((spill859_1 == 2))) {
        break lexical_join_115;
    }
    life12_70 = moom.BU.a(((java.lang.String)((life11_55)[0])), ((int)(-1)));
    life13_76 = moom.BU.a(((java.lang.String)((life11_55)[1])), ((int)(-1)));
    spill859_2 = life12_70;
    if (!((life4_5 != null))) {
        lexicalValue859_118_0 = spill859_2;
        break lexical_join_118;
    }
    if (!((spill859_2 >= 0))) {
        break lexical_join_115;
    }
    spill859_3 = life13_76;
    if (!((life4_5 != null))) {
        lexicalValue859_118_0 = spill859_3;
        break lexical_join_118;
    }
    if (!((spill859_3 >= 0))) {
        break lexical_join_115;
    }
    spill859_4 = life12_70;
    if (!((life4_5 != null))) {
        lexicalValue859_99_0 = spill859_4;
        break lexical_join_99;
    }
    if (!((spill859_4 > life13_76))) {
        break lexical_join_98;
    }
    java.lang.String __stackOp859_11_0 = life10_37;
    java.lang.String __stackOp859_11_1 = p0;
    java.lang.String __stackOp859_11_2 = __sourceIntrinsic_fafb7c06958a_invokedynamic859_10(8554, (1962058147645929589L ^ life2_3));
    spill859_5 = __stackOp859_11_2;
    spill859_6 = __stackOp859_11_0;
    spill859_7 = __stackOp859_11_1;
    recovery.source.CarrierOps.discard(__stackOp859_11_2);
    java.lang.String __stackOp859_14_0 = spill859_7;
    java.lang.String __stackOp859_14_1 = __sourceIntrinsic_fafb7c06958a_invokedynamic859_13(10505, (1893818108539711560L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_fafb7c06958a_invokedynamic859_15(spill859_5, spill859_6, __stackOp859_14_1, __stackOp859_14_0))));
    if (!((life4_5 == null))) {
        break lexical_join_119;
    }
    }
    lexicalValue859_99_0 = life12_70;
    }
    life14_131 = lexicalValue859_99_0;
    lexical_cycle_100: while (true) {
    lexical_join_113: {
    lexical_join_107: {
    if (!((life14_131 > life13_76))) {
        break lexical_join_107;
    }
    if (!((life4_5 != null))) {
        break lexical_join_113;
    }
    if (!((life4_5 == null))) {
        break lexical_join_119;
    }
    }
    ((java.util.List)(life5_15)).add(((java.lang.Object)(java.lang.String.valueOf(((int)(life14_131))))));
    life14_131 += 1;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_100; }
    break lexical_cycle_100;
    }
    }
    lexicalValue859_118_0 = ((((java.util.List)(life5_15)).add(((java.lang.Object)(life10_37)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue859_118_0);
    }
    life9_30 += 1;
    if (!((life4_5 == null))) { continue lexical_cycle_29; }
    break lexical_cycle_29;
    }
    }
    life7_25 = ((java.lang.String[])(((java.util.List)(life5_15)).toArray(((java.lang.Object[])(new java.lang.String[0])))));
    lexicalValue859_129_0 = 0;
    }
    life8_167 = lexicalValue859_129_0;
    lexical_cycle_130: while (true) {
    lexical_join_205: {
    lexical_join_204: {
    lexical_join_200: {
    lexical_join_195: {
    lexical_join_184: {
    lexical_join_177: {
    if (!((life8_167 < (life7_25).length))) {
        break lexical_join_212;
    }
    spill859_8 = life7_25;
    if (!((life4_5 != null))) {
        lexicalValue859_213_0 = spill859_8;
        break lexical_join_213;
    }
    life9_177 = (spill859_8)[life8_167];
    life9_182 = moom.Oc.a(((java.lang.String)(life9_177)), ((java.lang.String)(this.b)));
    spill859_9 = ((java.lang.String)(life9_182)).startsWith(((java.lang.String)(this.b)));
    if (!((life4_5 != null))) {
        lexicalValue859_184_0 = ((spill859_9) ? 1 : 0);
        break lexical_join_184;
    }
    if (!((!spill859_9))) {
        break lexical_join_177;
    }
    spill859_10 = ((java.lang.String)(life9_182)).startsWith(((java.lang.String)(__sourceIntrinsic_fafb7c06958a_invokedynamic859_29(17759, (2678908685744823317L ^ life2_3)))));
    if (!((life4_5 != null))) {
        lexicalValue859_184_0 = ((spill859_10) ? 1 : 0);
        break lexical_join_184;
    }
    if (!((!spill859_10))) {
        break lexical_join_177;
    }
    spill859_11 = ((java.lang.String)(life9_182)).startsWith(((java.lang.String)(__sourceIntrinsic_fafb7c06958a_invokedynamic859_32(17018, (5692767471961561926L ^ life2_3)))));
    if (!((life4_5 != null))) {
        lexicalValue859_184_0 = ((spill859_11) ? 1 : 0);
        break lexical_join_184;
    }
    if (!((!spill859_11))) {
        break lexical_join_177;
    }
    life9_182 = __sourceIntrinsic_fafb7c06958a_invokedynamic859_36(this.b, life9_182);
    }
    lexicalValue859_184_0 = ((((java.lang.String)(life9_182)).endsWith(((java.lang.String)(__sourceIntrinsic_fafb7c06958a_invokedynamic859_37(583, (6076181931346762542L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        lexicalValue859_200_0 = lexicalValue859_184_0;
        break lexical_join_200;
    }
    if (!((lexicalValue859_184_0 != 0))) {
        break lexical_join_195;
    }
    life9_182 = ((java.lang.String)(life9_182)).substring(((int)(0)), ((int)((((java.lang.String)(life9_182)).length() - 4))));
    }
    spill859_12 = life9_182;
    if (!((life4_5 != null))) {
        lexicalValue859_204_0 = spill859_12;
        break lexical_join_204;
    }
    lexicalValue859_200_0 = ((((java.lang.String)(spill859_12)).startsWith(((java.lang.String)("/")))) ? 1 : 0);
    }
    if (!((lexicalValue859_200_0 != 0))) {
        break lexical_join_205;
    }
    lexicalValue859_204_0 = ((java.lang.String)(life9_182)).substring(((int)(1)));
    }
    life9_182 = lexicalValue859_204_0;
    }
    (life7_25)[life8_167] = life9_182;
    life8_167 += 1;
    if (!((life4_5 == null))) { continue lexical_cycle_130; }
    break lexical_cycle_130;
    }
    }
    lexicalValue859_213_0 = life7_25;
    }
    return lexicalValue859_213_0;
}


private boolean e__Boolean(java.lang.String p0) {
moom.Jc forwardValue2364_15_0;
    net.minecraft.util.EnumWorldBlockLayer forwardValue2364_29_0;
    moom.Jc spill2364_0;
    net.minecraft.util.EnumWorldBlockLayer spill2364_1;
    net.minecraft.util.EnumWorldBlockLayer spill2364_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_29: {
    forward_join_27: {
    forward_join_15: {
    forward_join_14: {
    life2_3 = (moom.Jc.F ^ 72757075455660L);
    life4_5 = moom.JM.b__Arrayr3();
    spill2364_0 = this;
    if (!((life4_5 != null))) {
        forwardValue2364_15_0 = spill2364_0;
        break forward_join_15;
    }
    if (!((!((moom.Jc)(spill2364_0)).o(((java.lang.String)(p0)))))) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    forwardValue2364_15_0 = this;
    }
    spill2364_1 = ((moom.Jc)(forwardValue2364_15_0)).E;
    if (!((life4_5 != null))) {
        forwardValue2364_29_0 = spill2364_1;
        break forward_join_29;
    }
    if (!((spill2364_1 != null))) {
        break forward_join_27;
    }
    spill2364_2 = this.E;
    if (!((life4_5 != null))) {
        forwardValue2364_29_0 = spill2364_2;
        break forward_join_29;
    }
    if (!((spill2364_2 != net.minecraft.util.EnumWorldBlockLayer.SOLID))) {
        break forward_join_27;
    }
    return ((1) != 0);
    }
    forwardValue2364_29_0 = this.E;
    }
    net.minecraft.util.EnumWorldBlockLayer __stackOp2364_10_0 = forwardValue2364_29_0;
    java.lang.String __stackOp2364_10_1 = __sourceIntrinsic_85e729d079f8_invokedynamic2364_9(665, (9155300842099127804L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_85e729d079f8_invokedynamic2364_11(__stackOp2364_10_1, __stackOp2364_10_0))));
    return ((0) != 0);
}


private static int e(java.lang.String p0) {
java.lang.String forwardValue2363_16_0;
    int forwardValue2363_58_0;
    int forwardValue2363_94_0;
    int forwardValue2363_106_0;
    int forwardValue2363_118_0;
    int forwardValue2363_130_0;
    int forwardValue2363_146_0;
    int forwardValue2363_202_0;
    int forwardValue2363_218_0;
    int forwardValue2363_234_0;
    int forwardValue2363_250_0;
    int forwardValue2363_269_0;
    int forwardValue2363_275_0;
    int forwardValue2363_281_0;
    int forwardValue2363_283_0;
    int forwardValue2363_285_0;
    java.lang.String spill2363_0;
    boolean spill2363_1;
    boolean spill2363_2;
    boolean spill2363_3;
    boolean spill2363_4;
    boolean spill2363_5;
    boolean spill2363_6;
    boolean spill2363_7;
    boolean spill2363_8;
    boolean spill2363_9;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_285: {
    forward_join_284: {
    forward_join_283: {
    forward_join_282: {
    forward_join_281: {
    forward_join_276: {
    forward_join_275: {
    forward_join_270: {
    forward_join_269: {
    forward_join_259: {
    forward_join_250: {
    forward_join_243: {
    forward_join_234: {
    forward_join_227: {
    forward_join_218: {
    forward_join_211: {
    forward_join_202: {
    forward_join_195: {
    forward_join_146: {
    forward_join_139: {
    forward_join_130: {
    forward_join_123: {
    forward_join_118: {
    forward_join_111: {
    forward_join_106: {
    forward_join_99: {
    forward_join_94: {
    forward_join_87: {
    forward_join_58: {
    forward_join_51: {
    forward_join_16: {
    forward_join_12: {
    life1_3 = (moom.Jc.F ^ 108817482735090L);
    life3_5 = moom.JM.b__Arrayr3();
    spill2363_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue2363_16_0 = spill2363_0;
        break forward_join_16;
    }
    if (!((spill2363_0 == null))) {
        break forward_join_12;
    }
    return 1;
    }
    p0 = ((java.lang.String)(p0)).trim();
    forwardValue2363_16_0 = p0;
    }
    spill2363_1 = ((java.lang.String)(forwardValue2363_16_0)).equals(((java.lang.Object)(__sourceIntrinsic_bf2556b0defc_invokedynamic2363_3(8091, (2994943696780155797L ^ life1_3)))));
    if (!((life3_5 != null))) {
        forwardValue2363_285_0 = ((spill2363_1) ? 1 : 0);
        break forward_join_285;
    }
    if (!((!spill2363_1))) {
        break forward_join_284;
    }
    spill2363_2 = ((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_bf2556b0defc_invokedynamic2363_6(22416, (1406195497740637105L ^ life1_3)))));
    if (!((life3_5 != null))) {
        forwardValue2363_285_0 = ((spill2363_2) ? 1 : 0);
        break forward_join_285;
    }
    if (!((!spill2363_2))) {
        break forward_join_284;
    }
    spill2363_3 = ((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_bf2556b0defc_invokedynamic2363_9(9262, (7530169311956852765L ^ life1_3)))));
    if (!((life3_5 != null))) {
        forwardValue2363_58_0 = ((spill2363_3) ? 1 : 0);
        break forward_join_58;
    }
    if (!(spill2363_3)) {
        break forward_join_51;
    }
    return __sourceIntrinsic_bf2556b0defc_invokedynamic2363_12(25580, (4318615553961835332L ^ life1_3));
    }
    forwardValue2363_58_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_bf2556b0defc_invokedynamic2363_13(8029, (9075012200553765737L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2363_283_0 = forwardValue2363_58_0;
        break forward_join_283;
    }
    if (!((forwardValue2363_58_0 == 0))) {
        break forward_join_282;
    }
    spill2363_4 = ((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_bf2556b0defc_invokedynamic2363_16(22858, (5556818869326519669L ^ life1_3)))));
    if (!((life3_5 != null))) {
        forwardValue2363_283_0 = ((spill2363_4) ? 1 : 0);
        break forward_join_283;
    }
    if (!((!spill2363_4))) {
        break forward_join_282;
    }
    spill2363_5 = ((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_bf2556b0defc_invokedynamic2363_19(10034, (7846653344574497553L ^ life1_3)))));
    if (!((life3_5 != null))) {
        forwardValue2363_94_0 = ((spill2363_5) ? 1 : 0);
        break forward_join_94;
    }
    if (!(spill2363_5)) {
        break forward_join_87;
    }
    return __sourceIntrinsic_bf2556b0defc_invokedynamic2363_22(26479, (4944324424393080793L ^ life1_3));
    }
    forwardValue2363_94_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_bf2556b0defc_invokedynamic2363_23(1155, (3210893320516812991L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2363_106_0 = forwardValue2363_94_0;
        break forward_join_106;
    }
    if (!((forwardValue2363_94_0 != 0))) {
        break forward_join_99;
    }
    return 3;
    }
    forwardValue2363_106_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_bf2556b0defc_invokedynamic2363_26(20317, (2941339318392523588L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2363_118_0 = forwardValue2363_106_0;
        break forward_join_118;
    }
    if (!((forwardValue2363_106_0 != 0))) {
        break forward_join_111;
    }
    return 4;
    }
    forwardValue2363_118_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_bf2556b0defc_invokedynamic2363_29(946, (808892764853585874L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2363_130_0 = forwardValue2363_118_0;
        break forward_join_130;
    }
    if (!((forwardValue2363_118_0 != 0))) {
        break forward_join_123;
    }
    return 5;
    }
    forwardValue2363_130_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_bf2556b0defc_invokedynamic2363_32(29844, (3737678283423002873L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2363_146_0 = forwardValue2363_130_0;
        break forward_join_146;
    }
    if (!((forwardValue2363_130_0 != 0))) {
        break forward_join_139;
    }
    return __sourceIntrinsic_bf2556b0defc_invokedynamic2363_35(29217, (2777470372664420998L ^ life1_3));
    }
    forwardValue2363_146_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_bf2556b0defc_invokedynamic2363_36(27484, (1886647643247750969L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2363_281_0 = forwardValue2363_146_0;
        break forward_join_281;
    }
    if (!((forwardValue2363_146_0 == 0))) {
        break forward_join_276;
    }
    spill2363_6 = ((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_bf2556b0defc_invokedynamic2363_39(7062, (7066809634081890264L ^ life1_3)))));
    if (!((life3_5 != null))) {
        forwardValue2363_281_0 = ((spill2363_6) ? 1 : 0);
        break forward_join_281;
    }
    if (!((!spill2363_6))) {
        break forward_join_276;
    }
    spill2363_7 = ((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_bf2556b0defc_invokedynamic2363_42(12744, (4256709981365466503L ^ life1_3)))));
    if (!((life3_5 != null))) {
        forwardValue2363_275_0 = ((spill2363_7) ? 1 : 0);
        break forward_join_275;
    }
    if (!((!spill2363_7))) {
        break forward_join_270;
    }
    spill2363_8 = ((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_bf2556b0defc_invokedynamic2363_45(19379, (8786853380036530058L ^ life1_3)))));
    if (!((life3_5 != null))) {
        forwardValue2363_275_0 = ((spill2363_8) ? 1 : 0);
        break forward_join_275;
    }
    if (!((!spill2363_8))) {
        break forward_join_270;
    }
    spill2363_9 = ((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_bf2556b0defc_invokedynamic2363_48(27998, (7194392575785740661L ^ life1_3)))));
    if (!((life3_5 != null))) {
        forwardValue2363_202_0 = ((spill2363_9) ? 1 : 0);
        break forward_join_202;
    }
    if (!(spill2363_9)) {
        break forward_join_195;
    }
    return __sourceIntrinsic_bf2556b0defc_invokedynamic2363_51(31204, (4059150549388108115L ^ life1_3));
    }
    forwardValue2363_202_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_bf2556b0defc_invokedynamic2363_52(22732, (4338578597481946294L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2363_218_0 = forwardValue2363_202_0;
        break forward_join_218;
    }
    if (!((forwardValue2363_202_0 != 0))) {
        break forward_join_211;
    }
    return __sourceIntrinsic_bf2556b0defc_invokedynamic2363_55(6428, (5942974862207730084L ^ life1_3));
    }
    forwardValue2363_218_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_bf2556b0defc_invokedynamic2363_56(24775, (8065489702105162983L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2363_234_0 = forwardValue2363_218_0;
        break forward_join_234;
    }
    if (!((forwardValue2363_218_0 != 0))) {
        break forward_join_227;
    }
    return __sourceIntrinsic_bf2556b0defc_invokedynamic2363_59(10817, (1960728247329846001L ^ life1_3));
    }
    forwardValue2363_234_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_bf2556b0defc_invokedynamic2363_60(7261, (8559971875547305985L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2363_250_0 = forwardValue2363_234_0;
        break forward_join_250;
    }
    if (!((forwardValue2363_234_0 != 0))) {
        break forward_join_243;
    }
    return __sourceIntrinsic_bf2556b0defc_invokedynamic2363_63(13492, (6299283412941925402L ^ life1_3));
    }
    forwardValue2363_250_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_bf2556b0defc_invokedynamic2363_64(3963, (3530049429906377547L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2363_269_0 = forwardValue2363_250_0;
        break forward_join_269;
    }
    if (!((forwardValue2363_250_0 != 0))) {
        break forward_join_259;
    }
    return __sourceIntrinsic_bf2556b0defc_invokedynamic2363_67(10387, (6606537124320047162L ^ life1_3));
    }
    java.lang.String __stackOp2363_69_0 = p0;
    java.lang.String __stackOp2363_69_1 = __sourceIntrinsic_bf2556b0defc_invokedynamic2363_68(4624, (7547033180007847527L ^ life1_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_bf2556b0defc_invokedynamic2363_70(__stackOp2363_69_1, __stackOp2363_69_0))));
    forwardValue2363_269_0 = 0;
    }
    return forwardValue2363_269_0;
    }
    forwardValue2363_275_0 = __sourceIntrinsic_bf2556b0defc_invokedynamic2363_72(28082, (23832869109740813L ^ life1_3));
    }
    return forwardValue2363_275_0;
    }
    forwardValue2363_281_0 = __sourceIntrinsic_bf2556b0defc_invokedynamic2363_73(9715, (937405970479086912L ^ life1_3));
    }
    return forwardValue2363_281_0;
    }
    forwardValue2363_283_0 = 2;
    }
    return forwardValue2363_283_0;
    }
    forwardValue2363_285_0 = 1;
    }
    return forwardValue2363_285_0;
}


private boolean c__Boolean(java.lang.String p0) {
java.lang.String[] forwardValue2360_22_0;
    int forwardValue2360_39_0;
    java.lang.String[] spill2360_0;
    int spill2360_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_39: {
    forward_join_38: {
    forward_join_22: {
    forward_join_20: {
    life2_3 = (moom.Jc.F ^ 127434387192601L);
    life4_5 = moom.JM.b__Arrayr3();
    spill2360_0 = this.g;
    if (!((life4_5 != null))) {
        forwardValue2360_22_0 = spill2360_0;
        break forward_join_22;
    }
    if (!((spill2360_0 == null))) {
        break forward_join_20;
    }
    this.g = ((java.lang.String[])(((moom.Jc)(this)).b__ArrayString(((java.lang.String)(__sourceIntrinsic_157aaaf3c16d_invokedynamic2360_3(13038, (5111182137329274885L ^ life2_3)))))));
    }
    forwardValue2360_22_0 = this.g;
    }
    spill2360_1 = (forwardValue2360_22_0).length;
    if (!((life4_5 != null))) {
        forwardValue2360_39_0 = spill2360_1;
        break forward_join_39;
    }
    if (!((spill2360_1 < 5))) {
        break forward_join_38;
    }
    java.lang.String __stackOp2360_8_0 = p0;
    java.lang.String __stackOp2360_8_1 = __sourceIntrinsic_157aaaf3c16d_invokedynamic2360_7(17517, (775788798227228376L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_157aaaf3c16d_invokedynamic2360_9(__stackOp2360_8_1, __stackOp2360_8_0))));
    return ((0) != 0);
    }
    forwardValue2360_39_0 = 1;
    }
    return ((forwardValue2360_39_0) != 0);
}


private static int c(java.lang.String p0) {
int forwardValue2359_68_0;
    int forwardValue2359_84_0;
    int forwardValue2359_100_0;
    int forwardValue2359_116_0;
    int forwardValue2359_132_0;
    int forwardValue2359_155_0;
    int forwardValue2359_157_0;
    int forwardValue2359_159_0;
    net.minecraft.entity.Entity[] spill2359_0;
    boolean spill2359_1;
    boolean spill2359_2;
    boolean spill2359_3;
    boolean spill2359_4;
    boolean spill2359_5;
    long life1_3;
    java.lang.String life0_7;
    net.minecraft.entity.Entity[] life3_8;
    forward_join_159: {
    forward_join_158: {
    forward_join_157: {
    forward_join_156: {
    forward_join_155: {
    forward_join_141: {
    forward_join_132: {
    forward_join_125: {
    forward_join_116: {
    forward_join_109: {
    forward_join_100: {
    forward_join_93: {
    forward_join_84: {
    forward_join_77: {
    forward_join_68: {
    forward_join_61: {
    life1_3 = (moom.Jc.F ^ 121961163948697L);
    spill2359_0 = moom.JM.b__Arrayr3();
    life0_7 = ((java.lang.String)(p0)).toLowerCase();
    life3_8 = spill2359_0;
    spill2359_1 = ((java.lang.String)(life0_7)).equals(((java.lang.Object)(__sourceIntrinsic_4176a183cc0f_invokedynamic2359_3(16731, (606248920415525427L ^ life1_3)))));
    if (!((life3_8 != null))) {
        forwardValue2359_159_0 = ((spill2359_1) ? 1 : 0);
        break forward_join_159;
    }
    if (!((!spill2359_1))) {
        break forward_join_158;
    }
    spill2359_2 = ((java.lang.String)(life0_7)).equals(((java.lang.Object)(__sourceIntrinsic_4176a183cc0f_invokedynamic2359_6(14199, (6056691071380106293L ^ life1_3)))));
    if (!((life3_8 != null))) {
        forwardValue2359_159_0 = ((spill2359_2) ? 1 : 0);
        break forward_join_159;
    }
    if (!((!spill2359_2))) {
        break forward_join_158;
    }
    spill2359_3 = ((java.lang.String)(life0_7)).equals(((java.lang.Object)(__sourceIntrinsic_4176a183cc0f_invokedynamic2359_9(17315, (1342807915656009887L ^ life1_3)))));
    if (!((life3_8 != null))) {
        forwardValue2359_157_0 = ((spill2359_3) ? 1 : 0);
        break forward_join_157;
    }
    if (!((!spill2359_3))) {
        break forward_join_156;
    }
    spill2359_4 = ((java.lang.String)(life0_7)).equals(((java.lang.Object)(__sourceIntrinsic_4176a183cc0f_invokedynamic2359_12(11295, (906768219287598848L ^ life1_3)))));
    if (!((life3_8 != null))) {
        forwardValue2359_157_0 = ((spill2359_4) ? 1 : 0);
        break forward_join_157;
    }
    if (!((!spill2359_4))) {
        break forward_join_156;
    }
    spill2359_5 = ((java.lang.String)(life0_7)).equals(((java.lang.Object)(__sourceIntrinsic_4176a183cc0f_invokedynamic2359_15(15280, (5604251954099790005L ^ life1_3)))));
    if (!((life3_8 != null))) {
        forwardValue2359_68_0 = ((spill2359_5) ? 1 : 0);
        break forward_join_68;
    }
    if (!(spill2359_5)) {
        break forward_join_61;
    }
    return 4;
    }
    forwardValue2359_68_0 = ((((java.lang.String)(life0_7)).equals(((java.lang.Object)(__sourceIntrinsic_4176a183cc0f_invokedynamic2359_18(7588, (7062074120728807136L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_8 != null))) {
        forwardValue2359_84_0 = forwardValue2359_68_0;
        break forward_join_84;
    }
    if (!((forwardValue2359_68_0 != 0))) {
        break forward_join_77;
    }
    return __sourceIntrinsic_4176a183cc0f_invokedynamic2359_21(296, (5820319176085604069L ^ life1_3));
    }
    forwardValue2359_84_0 = ((((java.lang.String)(life0_7)).equals(((java.lang.Object)(__sourceIntrinsic_4176a183cc0f_invokedynamic2359_22(28132, (6344671955583694501L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_8 != null))) {
        forwardValue2359_100_0 = forwardValue2359_84_0;
        break forward_join_100;
    }
    if (!((forwardValue2359_84_0 != 0))) {
        break forward_join_93;
    }
    return __sourceIntrinsic_4176a183cc0f_invokedynamic2359_25(16498, (2642023588453631904L ^ life1_3));
    }
    forwardValue2359_100_0 = ((((java.lang.String)(life0_7)).equals(((java.lang.Object)(__sourceIntrinsic_4176a183cc0f_invokedynamic2359_26(13797, (8913149142752177809L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_8 != null))) {
        forwardValue2359_116_0 = forwardValue2359_100_0;
        break forward_join_116;
    }
    if (!((forwardValue2359_100_0 != 0))) {
        break forward_join_109;
    }
    return __sourceIntrinsic_4176a183cc0f_invokedynamic2359_29(32741, (8647977527121737761L ^ life1_3));
    }
    forwardValue2359_116_0 = ((((java.lang.String)(life0_7)).equals(((java.lang.Object)(__sourceIntrinsic_4176a183cc0f_invokedynamic2359_30(9901, (2350826549126315456L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_8 != null))) {
        forwardValue2359_132_0 = forwardValue2359_116_0;
        break forward_join_132;
    }
    if (!((forwardValue2359_116_0 != 0))) {
        break forward_join_125;
    }
    return __sourceIntrinsic_4176a183cc0f_invokedynamic2359_33(27438, (2226101991386737905L ^ life1_3));
    }
    forwardValue2359_132_0 = ((((java.lang.String)(life0_7)).equals(((java.lang.Object)(__sourceIntrinsic_4176a183cc0f_invokedynamic2359_34(25479, (7136027984786225297L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_8 != null))) {
        forwardValue2359_155_0 = forwardValue2359_132_0;
        break forward_join_155;
    }
    if (!((forwardValue2359_132_0 != 0))) {
        break forward_join_141;
    }
    return __sourceIntrinsic_4176a183cc0f_invokedynamic2359_37(4250, (161026480369407808L ^ life1_3));
    }
    java.lang.String __stackOp2359_39_0 = life0_7;
    java.lang.String __stackOp2359_39_1 = __sourceIntrinsic_4176a183cc0f_invokedynamic2359_38(2389, (9070810173326594612L ^ life1_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_4176a183cc0f_invokedynamic2359_40(__stackOp2359_39_1, __stackOp2359_39_0))));
    forwardValue2359_155_0 = __sourceIntrinsic_4176a183cc0f_invokedynamic2359_42(29710, (2296594848713241560L ^ life1_3));
    }
    return forwardValue2359_155_0;
    }
    forwardValue2359_157_0 = 2;
    }
    return forwardValue2359_157_0;
    }
    forwardValue2359_159_0 = 1;
    }
    return forwardValue2359_159_0;
}


private boolean n(java.lang.String p0) {
moom.Jc forwardValue2373_23_0;
    int forwardValue2373_40_0;
    int forwardValue2373_57_0;
    int forwardValue2373_77_0;
    moom.Jc spill2373_0;
    int spill2373_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_77: {
    forward_join_76: {
    forward_join_57: {
    forward_join_54: {
    forward_join_40: {
    forward_join_38: {
    forward_join_23: {
    forward_join_22: {
    life2_3 = (moom.Jc.F ^ 61406614083247L);
    life4_5 = moom.JM.b__Arrayr3();
    spill2373_0 = this;
    if (!((life4_5 != null))) {
        forwardValue2373_23_0 = spill2373_0;
        break forward_join_23;
    }
    if (!((((moom.Jc)(spill2373_0)).g == null))) {
        break forward_join_22;
    }
    java.lang.String __stackOp2373_4_0 = p0;
    java.lang.String __stackOp2373_4_1 = __sourceIntrinsic_60ddcc447474_invokedynamic2373_3(20446, (417524509717758184L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_60ddcc447474_invokedynamic2373_5(__stackOp2373_4_1, __stackOp2373_4_0))));
    return ((0) != 0);
    }
    forwardValue2373_23_0 = this;
    }
    spill2373_1 = ((moom.Jc)(forwardValue2373_23_0)).o;
    if (!((life4_5 != null))) {
        forwardValue2373_40_0 = spill2373_1;
        break forward_join_40;
    }
    if (!((spill2373_1 <= 0))) {
        break forward_join_38;
    }
    java.lang.String __stackOp2373_10_0 = p0;
    java.lang.String __stackOp2373_10_1 = __sourceIntrinsic_60ddcc447474_invokedynamic2373_9(25513, (2371358736733416701L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_60ddcc447474_invokedynamic2373_11(__stackOp2373_10_1, __stackOp2373_10_0))));
    return ((0) != 0);
    }
    forwardValue2373_40_0 = this.p;
    }
    if (!((life4_5 != null))) {
        forwardValue2373_57_0 = forwardValue2373_40_0;
        break forward_join_57;
    }
    if (!((forwardValue2373_40_0 <= 0))) {
        break forward_join_54;
    }
    java.lang.String __stackOp2373_16_0 = p0;
    java.lang.String __stackOp2373_16_1 = __sourceIntrinsic_60ddcc447474_invokedynamic2373_15(23457, (9023064568128345276L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_60ddcc447474_invokedynamic2373_17(__stackOp2373_16_1, __stackOp2373_16_0))));
    return ((0) != 0);
    }
    forwardValue2373_57_0 = (this.g).length;
    }
    if (!((life4_5 != null))) {
        forwardValue2373_77_0 = forwardValue2373_57_0;
        break forward_join_77;
    }
    if (!((forwardValue2373_57_0 != (this.o * this.p)))) {
        break forward_join_76;
    }
    java.lang.String __stackOp2373_24_0 = p0;
    java.lang.String __stackOp2373_24_1 = __sourceIntrinsic_60ddcc447474_invokedynamic2373_23(2168, (4671351885933168495L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_60ddcc447474_invokedynamic2373_25(__stackOp2373_24_1, __stackOp2373_24_0))));
    return ((0) != 0);
    }
    forwardValue2373_77_0 = 1;
    }
    return ((forwardValue2373_77_0) != 0);
}


private boolean h(java.lang.String p0) {
moom.Jc forwardValue2367_15_0;
    net.minecraft.util.EnumWorldBlockLayer forwardValue2367_29_0;
    moom.Jc spill2367_0;
    net.minecraft.util.EnumWorldBlockLayer spill2367_1;
    net.minecraft.util.EnumWorldBlockLayer spill2367_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_29: {
    forward_join_27: {
    forward_join_15: {
    forward_join_14: {
    life2_3 = (moom.Jc.F ^ 123914008217854L);
    life4_5 = moom.JM.b__Arrayr3();
    spill2367_0 = this;
    if (!((life4_5 != null))) {
        forwardValue2367_15_0 = spill2367_0;
        break forward_join_15;
    }
    if (!((!((moom.Jc)(spill2367_0)).b__Boolean(((java.lang.String)(p0)))))) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    forwardValue2367_15_0 = this;
    }
    spill2367_1 = ((moom.Jc)(forwardValue2367_15_0)).E;
    if (!((life4_5 != null))) {
        forwardValue2367_29_0 = spill2367_1;
        break forward_join_29;
    }
    if (!((spill2367_1 != null))) {
        break forward_join_27;
    }
    spill2367_2 = this.E;
    if (!((life4_5 != null))) {
        forwardValue2367_29_0 = spill2367_2;
        break forward_join_29;
    }
    if (!((spill2367_2 != net.minecraft.util.EnumWorldBlockLayer.SOLID))) {
        break forward_join_27;
    }
    return ((1) != 0);
    }
    forwardValue2367_29_0 = this.E;
    }
    net.minecraft.util.EnumWorldBlockLayer __stackOp2367_10_0 = forwardValue2367_29_0;
    java.lang.String __stackOp2367_10_1 = __sourceIntrinsic_400848a2fc8a_invokedynamic2367_9(14987, (9062176627542158224L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_400848a2fc8a_invokedynamic2367_11(__stackOp2367_10_1, __stackOp2367_10_0))));
    return ((0) != 0);
}


private boolean f(java.lang.String p0) {
moom.Jc forwardValue2365_15_0;
    net.minecraft.util.EnumWorldBlockLayer forwardValue2365_29_0;
    moom.Jc spill2365_0;
    net.minecraft.util.EnumWorldBlockLayer spill2365_1;
    net.minecraft.util.EnumWorldBlockLayer spill2365_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_29: {
    forward_join_27: {
    forward_join_15: {
    forward_join_14: {
    life2_3 = (moom.Jc.F ^ 62940741492959L);
    life4_5 = moom.JM.b__Arrayr3();
    spill2365_0 = this;
    if (!((life4_5 != null))) {
        forwardValue2365_15_0 = spill2365_0;
        break forward_join_15;
    }
    if (!((!((moom.Jc)(spill2365_0)).m(((java.lang.String)(p0)))))) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    forwardValue2365_15_0 = this;
    }
    spill2365_1 = ((moom.Jc)(forwardValue2365_15_0)).E;
    if (!((life4_5 != null))) {
        forwardValue2365_29_0 = spill2365_1;
        break forward_join_29;
    }
    if (!((spill2365_1 != null))) {
        break forward_join_27;
    }
    spill2365_2 = this.E;
    if (!((life4_5 != null))) {
        forwardValue2365_29_0 = spill2365_2;
        break forward_join_29;
    }
    if (!((spill2365_2 != net.minecraft.util.EnumWorldBlockLayer.SOLID))) {
        break forward_join_27;
    }
    return ((1) != 0);
    }
    forwardValue2365_29_0 = this.E;
    }
    net.minecraft.util.EnumWorldBlockLayer __stackOp2365_10_0 = forwardValue2365_29_0;
    java.lang.String __stackOp2365_10_1 = __sourceIntrinsic_9bd29ed03928_invokedynamic2365_9(665, (9155345842768313231L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_9bd29ed03928_invokedynamic2365_11(__stackOp2365_10_1, __stackOp2365_10_0))));
    return ((0) != 0);
}


private boolean l(java.lang.String p0) {
java.lang.String[] forwardValue2371_24_0;
    int forwardValue2371_45_0;
    java.lang.String[] spill2371_0;
    int spill2371_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_45: {
    forward_join_44: {
    forward_join_24: {
    forward_join_22: {
    life2_3 = (moom.Jc.F ^ 15953740527600L);
    life4_5 = moom.JM.b__Arrayr3();
    spill2371_0 = this.g;
    if (!((life4_5 != null))) {
        forwardValue2371_24_0 = spill2371_0;
        break forward_join_24;
    }
    if (!((spill2371_0 == null))) {
        break forward_join_22;
    }
    java.lang.String __stackOp2371_4_0 = p0;
    java.lang.String __stackOp2371_4_1 = __sourceIntrinsic_42c0cfad2bfc_invokedynamic2371_3(11389, (5645887863270326899L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_42c0cfad2bfc_invokedynamic2371_5(__stackOp2371_4_1, __stackOp2371_4_0))));
    return ((0) != 0);
    }
    forwardValue2371_24_0 = this.g;
    }
    spill2371_1 = (forwardValue2371_24_0).length;
    if (!((life4_5 != null))) {
        forwardValue2371_45_0 = spill2371_1;
        break forward_join_45;
    }
    if (!((spill2371_1 != __sourceIntrinsic_42c0cfad2bfc_invokedynamic2371_9(8646, (7119048449666405230L ^ life2_3))))) {
        break forward_join_44;
    }
    java.lang.String __stackOp2371_11_0 = p0;
    java.lang.String __stackOp2371_11_1 = __sourceIntrinsic_42c0cfad2bfc_invokedynamic2371_10(23614, (1162956084926100063L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_42c0cfad2bfc_invokedynamic2371_12(__stackOp2371_11_1, __stackOp2371_11_0))));
    return ((0) != 0);
    }
    forwardValue2371_45_0 = 1;
    }
    return ((forwardValue2371_45_0) != 0);
}


private boolean d__Boolean(java.lang.String p0) {
java.lang.String[] forwardValue2362_24_0;
    moom.Jc forwardValue2362_43_0;
    net.minecraft.util.EnumWorldBlockLayer forwardValue2362_57_0;
    java.lang.String[] spill2362_0;
    moom.Jc spill2362_1;
    net.minecraft.util.EnumWorldBlockLayer spill2362_2;
    net.minecraft.util.EnumWorldBlockLayer spill2362_3;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_57: {
    forward_join_55: {
    forward_join_43: {
    forward_join_42: {
    forward_join_24: {
    forward_join_20: {
    life2_3 = (moom.Jc.F ^ 94355414734920L);
    life4_5 = moom.JM.b__Arrayr3();
    spill2362_0 = this.g;
    if (!((life4_5 != null))) {
        forwardValue2362_24_0 = spill2362_0;
        break forward_join_24;
    }
    if (!((spill2362_0 == null))) {
        break forward_join_20;
    }
    this.g = ((java.lang.String[])(((moom.Jc)(this)).b__ArrayString(((java.lang.String)(__sourceIntrinsic_af7f005541ad_invokedynamic2362_3(19202, (4196016804335717002L ^ life2_3)))))));
    }
    spill2362_1 = this;
    if (!((life4_5 != null))) {
        forwardValue2362_43_0 = spill2362_1;
        break forward_join_43;
    }
    forwardValue2362_24_0 = ((moom.Jc)(spill2362_1)).g;
    }
    if (!(((forwardValue2362_24_0).length < __sourceIntrinsic_af7f005541ad_invokedynamic2362_7(7178, (939896292644045075L ^ life2_3))))) {
        break forward_join_42;
    }
    java.lang.String __stackOp2362_9_0 = p0;
    java.lang.String __stackOp2362_9_1 = __sourceIntrinsic_af7f005541ad_invokedynamic2362_8(27677, (6738677515301072350L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_af7f005541ad_invokedynamic2362_10(__stackOp2362_9_1, __stackOp2362_9_0))));
    return ((0) != 0);
    }
    forwardValue2362_43_0 = this;
    }
    spill2362_2 = ((moom.Jc)(forwardValue2362_43_0)).E;
    if (!((life4_5 != null))) {
        forwardValue2362_57_0 = spill2362_2;
        break forward_join_57;
    }
    if (!((spill2362_2 != null))) {
        break forward_join_55;
    }
    spill2362_3 = this.E;
    if (!((life4_5 != null))) {
        forwardValue2362_57_0 = spill2362_3;
        break forward_join_57;
    }
    if (!((spill2362_3 != net.minecraft.util.EnumWorldBlockLayer.SOLID))) {
        break forward_join_55;
    }
    return ((1) != 0);
    }
    forwardValue2362_57_0 = this.E;
    }
    net.minecraft.util.EnumWorldBlockLayer __stackOp2362_19_0 = forwardValue2362_57_0;
    java.lang.String __stackOp2362_19_1 = __sourceIntrinsic_af7f005541ad_invokedynamic2362_18(665, (9155323705373377304L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_af7f005541ad_invokedynamic2362_20(__stackOp2362_19_1, __stackOp2362_19_0))));
    return ((0) != 0);
}


private static int d(java.lang.String p0) {
java.lang.String forwardValue2361_16_0;
    int forwardValue2361_34_0;
    int forwardValue2361_46_0;
    int forwardValue2361_65_0;
    java.lang.String spill2361_0;
    boolean spill2361_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_65: {
    forward_join_51: {
    forward_join_46: {
    forward_join_39: {
    forward_join_34: {
    forward_join_27: {
    forward_join_16: {
    forward_join_12: {
    life1_3 = (moom.Jc.F ^ 90925495816801L);
    life3_5 = moom.JM.b__Arrayr3();
    spill2361_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue2361_16_0 = spill2361_0;
        break forward_join_16;
    }
    if (!((spill2361_0 == null))) {
        break forward_join_12;
    }
    return 0;
    }
    p0 = ((java.lang.String)(p0)).trim();
    forwardValue2361_16_0 = p0;
    }
    spill2361_1 = ((java.lang.String)(forwardValue2361_16_0)).equals(((java.lang.Object)(__sourceIntrinsic_0abc1caceeb7_invokedynamic2361_3(22736, (4971291192081437447L ^ life1_3)))));
    if (!((life3_5 != null))) {
        forwardValue2361_34_0 = ((spill2361_1) ? 1 : 0);
        break forward_join_34;
    }
    if (!(spill2361_1)) {
        break forward_join_27;
    }
    return 1;
    }
    forwardValue2361_34_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_0abc1caceeb7_invokedynamic2361_6(27650, (5835529758190233565L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2361_46_0 = forwardValue2361_34_0;
        break forward_join_46;
    }
    if (!((forwardValue2361_34_0 != 0))) {
        break forward_join_39;
    }
    return 2;
    }
    forwardValue2361_46_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_0abc1caceeb7_invokedynamic2361_9(29809, (480752774029377524L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2361_65_0 = forwardValue2361_46_0;
        break forward_join_65;
    }
    if (!((forwardValue2361_46_0 != 0))) {
        break forward_join_51;
    }
    return 3;
    }
    java.lang.String __stackOp2361_13_0 = p0;
    java.lang.String __stackOp2361_13_1 = __sourceIntrinsic_0abc1caceeb7_invokedynamic2361_12(25771, (398508924588191526L ^ life1_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_0abc1caceeb7_invokedynamic2361_14(__stackOp2361_13_1, __stackOp2361_13_0))));
    forwardValue2361_65_0 = __sourceIntrinsic_0abc1caceeb7_invokedynamic2361_16(29710, (2296581301482873632L ^ life1_3));
    }
    return forwardValue2361_65_0;
}


public boolean a(int p0, int p1) {
int forwardValue2342_18_0;
    int forwardValue2342_22_0;
    int forwardValue2342_24_0;
    boolean spill2342_0;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_18: {
    life3_3 = (moom.Jc.F ^ 74862401863196L);
    life5_5 = moom.JM.b__Arrayr3();
    spill2342_0 = moom.Ka.a(((int)(p0)), ((int)(p1)), ((moom.J_[])(this.c)));
    if (!((life5_5 != null))) {
        forwardValue2342_18_0 = ((spill2342_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill2342_0)) {
        break forward_join_23;
    }
    forwardValue2342_18_0 = ((moom.Ka.a(((int)(p1)), ((int[])(this.d)))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2342_22_0 = forwardValue2342_18_0;
        break forward_join_22;
    }
    if (!((forwardValue2342_18_0 != 0))) {
        break forward_join_23;
    }
    forwardValue2342_22_0 = 1;
    }
    forwardValue2342_24_0 = forwardValue2342_22_0;
    break forward_join_24;
    }
    forwardValue2342_24_0 = 0;
    }
    return ((forwardValue2342_24_0) != 0);
}


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 29959);
    if (((moom.Jc.H)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Jc.I)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Jc.I)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Jc", life9_51);
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
        life9_116 = ((java.lang.String)((moom.Jc.G)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Jc.H)[life5_8] = moom.Jc.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Jc.H)[life5_8];
}


public boolean a(net.minecraft.client.renderer.texture.TextureAtlasSprite p0) {
return (__sourceIntrinsic_booleanComparison((moom.Ka.a(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(this.x))))) != 0);
}


private static int a(java.lang.String p0) {
java.lang.String forwardValue2343_16_0;
    int forwardValue2343_34_0;
    int forwardValue2343_53_0;
    java.lang.String spill2343_0;
    boolean spill2343_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_53: {
    forward_join_43: {
    forward_join_34: {
    forward_join_27: {
    forward_join_16: {
    forward_join_12: {
    life1_3 = (moom.Jc.F ^ 3689229735974L);
    life3_5 = moom.JM.b__Arrayr3();
    spill2343_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue2343_16_0 = spill2343_0;
        break forward_join_16;
    }
    if (!((spill2343_0 == null))) {
        break forward_join_12;
    }
    return 1;
    }
    p0 = ((java.lang.String)(p0)).trim();
    forwardValue2343_16_0 = p0;
    }
    spill2343_1 = ((java.lang.String)(forwardValue2343_16_0)).equals(((java.lang.Object)(__sourceIntrinsic_599c5f800586_invokedynamic2343_3(8862, (8524156893523469156L ^ life1_3)))));
    if (!((life3_5 != null))) {
        forwardValue2343_34_0 = ((spill2343_1) ? 1 : 0);
        break forward_join_34;
    }
    if (!(spill2343_1)) {
        break forward_join_27;
    }
    return 2;
    }
    forwardValue2343_34_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_599c5f800586_invokedynamic2343_6(31178, (6614710702353659945L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2343_53_0 = forwardValue2343_34_0;
        break forward_join_53;
    }
    if (!((forwardValue2343_34_0 != 0))) {
        break forward_join_43;
    }
    return __sourceIntrinsic_599c5f800586_invokedynamic2343_9(356, (1664166235051744270L ^ life1_3));
    }
    java.lang.String __stackOp2343_11_0 = p0;
    java.lang.String __stackOp2343_11_1 = __sourceIntrinsic_599c5f800586_invokedynamic2343_10(982, (6098961686500000266L ^ life1_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_599c5f800586_invokedynamic2343_12(__stackOp2343_11_1, __stackOp2343_11_0))));
    forwardValue2343_53_0 = 1;
    }
    return forwardValue2343_53_0;
}


private static net.minecraft.client.renderer.texture.TextureAtlasSprite[] a(java.lang.String[] p0, net.minecraft.client.renderer.texture.TextureMap p1, boolean p2, boolean p3) {
java.lang.String lexicalValue853_63_0;
    int lexicalValue853_85_0;
    int lexicalValue853_95_0;
    int lexicalValue853_101_0;
    java.lang.String lexicalValue853_140_0;
    java.lang.String lexicalValue853_140_1;
    java.lang.Object[] lexicalValue853_164_0;
    java.lang.String[] spill853_0;
    java.lang.String spill853_1;
    boolean spill853_2;
    boolean spill853_3;
    java.lang.String spill853_4;
    java.lang.String spill853_5;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    java.util.ArrayList life7_15;
    java.lang.String[] life8_17;
    int life9_20;
    int life10_22;
    java.lang.String life11_31;
    moom.DD life12_36;
    java.lang.String life13_39;
    java.lang.String life14_42;
    java.lang.String life15_68;
    moom.DD life16_141;
    int life17_144;
    java.lang.String life18_164;
    java.lang.String life19_166;
    moom.DD life20_189;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life21_193;
    lexical_join_164: {
    lexical_join_160: {
    lexical_join_10: {
    life4_3 = (moom.Jc.F ^ 136000610563961L);
    life6_5 = moom.JM.b__Arrayr3();
    if (!((p0 == null))) {
        break lexical_join_10;
    }
    return null;
    }
    life7_15 = new java.util.ArrayList();
    life8_17 = p0;
    life9_20 = (life8_17).length;
    life10_22 = 0;
    lexical_cycle_21: while (true) {
    lexical_join_157: {
    lexical_join_143: {
    lexical_join_140: {
    lexical_join_124: {
    lexical_join_104: {
    lexical_join_101: {
    lexical_join_95: {
    lexical_join_85: {
    lexical_join_84: {
    lexical_join_63: {
    lexical_join_56: {
    if (!((life10_22 < life9_20))) {
        break lexical_join_160;
    }
    spill853_0 = life8_17;
    if (!((life6_5 != null))) {
        lexicalValue853_164_0 = spill853_0;
        break lexical_join_164;
    }
    life11_31 = (spill853_0)[life10_22];
    life12_36 = new moom.DD(life11_31);
    life13_39 = ((moom.DD)(life12_36)).b();
    life14_42 = ((moom.DD)(life12_36)).a();
    spill853_1 = life14_42;
    if (!((life6_5 != null))) {
        lexicalValue853_63_0 = spill853_1;
        break lexical_join_63;
    }
    if (!((!((java.lang.String)(spill853_1)).contains(((java.lang.CharSequence)("/")))))) {
        break lexical_join_56;
    }
    java.lang.String __stackOp853_6_0 = life14_42;
    java.lang.String __stackOp853_6_1 = __sourceIntrinsic_08ac247e1343_invokedynamic853_5(28028, (3219858728462713828L ^ life4_3));
    life14_42 = __sourceIntrinsic_08ac247e1343_invokedynamic853_7(__stackOp853_6_1, __stackOp853_6_0);
    }
    lexicalValue853_63_0 = __sourceIntrinsic_08ac247e1343_invokedynamic853_9(life14_42, __sourceIntrinsic_08ac247e1343_invokedynamic853_8(26311, (4982420391396935745L ^ life4_3)));
    }
    life15_68 = lexicalValue853_63_0;
    spill853_2 = p2;
    if (!((life6_5 != null))) {
        lexicalValue853_85_0 = ((spill853_2) ? 1 : 0);
        break lexical_join_85;
    }
    if (!(spill853_2)) {
        break lexical_join_84;
    }
    spill853_3 = ((java.lang.String)(life15_68)).endsWith(((java.lang.String)(__sourceIntrinsic_08ac247e1343_invokedynamic853_11(30615, (4708897675505015146L ^ life4_3)))));
    if (!((life6_5 != null))) {
        lexicalValue853_85_0 = ((spill853_3) ? 1 : 0);
        break lexical_join_85;
    }
    if (!(spill853_3)) {
        break lexical_join_84;
    }
    ((java.util.List)(life7_15)).add(((java.lang.Object)(null)));
    if (!((life6_5 == null))) {
        break lexical_join_157;
    }
    }
    lexicalValue853_85_0 = ((p3) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        lexicalValue853_95_0 = lexicalValue853_85_0;
        break lexical_join_95;
    }
    if (!((lexicalValue853_85_0 != 0))) {
        break lexical_join_104;
    }
    lexicalValue853_95_0 = ((((java.lang.String)(life15_68)).endsWith(((java.lang.String)(__sourceIntrinsic_08ac247e1343_invokedynamic853_16(29032, (2593869617606565767L ^ life4_3)))))) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        lexicalValue853_101_0 = lexicalValue853_95_0;
        break lexical_join_101;
    }
    if (!((lexicalValue853_95_0 != 0))) {
        break lexical_join_104;
    }
    lexicalValue853_101_0 = ((((java.util.List)(life7_15)).add(((java.lang.Object)(moom.Jd.y)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue853_101_0);
    if (!((life6_5 == null))) {
        break lexical_join_157;
    }
    }
    life16_141 = new moom.DD(life13_39, life15_68);
    life17_144 = ((moom.BU.a__Boolean(((moom.DD)(life16_141)))) ? 1 : 0);
    if (!((life17_144 == 0))) {
        break lexical_join_124;
    }
    java.lang.String __stackOp853_26_0 = life15_68;
    java.lang.String __stackOp853_26_1 = __sourceIntrinsic_08ac247e1343_invokedynamic853_25(4304, (2539870525237132902L ^ life4_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_08ac247e1343_invokedynamic853_27(__stackOp853_26_1, __stackOp853_26_0))));
    }
    life18_164 = __sourceIntrinsic_08ac247e1343_invokedynamic853_29(10016, (8671556106275932574L ^ life4_3));
    life19_166 = life14_42;
    spill853_4 = life14_42;
    spill853_5 = life18_164;
    if (!((life6_5 != null))) {
        lexicalValue853_140_0 = spill853_4;
        lexicalValue853_140_1 = spill853_5;
        break lexical_join_140;
    }
    if (!(((java.lang.String)(spill853_4)).startsWith(((java.lang.String)(spill853_5))))) {
        break lexical_join_143;
    }
    lexicalValue853_140_0 = life14_42;
    lexicalValue853_140_1 = life18_164;
    }
    life19_166 = ((java.lang.String)(lexicalValue853_140_0)).substring(((int)(((java.lang.String)(lexicalValue853_140_1)).length())));
    }
    life20_189 = new moom.DD(life13_39, life19_166);
    life21_193 = ((net.minecraft.client.renderer.texture.TextureMap)(p1)).a__oh(((moom.DD)(life20_189)));
    ((java.util.List)(life7_15)).add(((java.lang.Object)(life21_193)));
    }
    life10_22 += 1;
    if (!((life6_5 == null))) { continue lexical_cycle_21; }
    break lexical_cycle_21;
    }
    }
    lexicalValue853_164_0 = ((java.util.List)(life7_15)).toArray(((java.lang.Object[])(new net.minecraft.client.renderer.texture.TextureAtlasSprite[0])));
    }
    return ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(lexicalValue853_164_0));
}


private static boolean a(int p0) {
int forwardValue236_13_0;
    int spill236_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_13: {
    forward_join_12: {
    forward_join_10: {
    life1_3 = (moom.Jc.F ^ 22841023417296L);
    life3_5 = moom.JM.b__Arrayr3();
    spill236_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue236_13_0 = spill236_0;
        break forward_join_13;
    }
    switch (spill236_0) {
case 11:
case 12:
case 13:
case 14:
case 15:
{
        break forward_join_10;
    }
default:
{
        break forward_join_12;
    }
}
    }
    return ((1) != 0);
    }
    forwardValue236_13_0 = 0;
    }
    return ((forwardValue236_13_0) != 0);
}


public boolean a(net.minecraft.world.biome.BiomeGenBase p0) {
return (__sourceIntrinsic_booleanComparison((moom.Ka.a(((net.minecraft.world.biome.BiomeGenBase)(p0)), ((net.minecraft.world.biome.BiomeGenBase[])(this.j))))) != 0);
}


private int a(int[] p0, int p1) {
int[] lexicalValue852_11_0;
    int lexicalValue852_37_0;
    int[] spill852_0;
    int spill852_1;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    int[] life6_14;
    int life7_17;
    int life8_19;
    int life9_26;
    lexical_join_37: {
    lexical_join_36: {
    lexical_join_11: {
    life3_3 = (moom.Jc.F ^ 80176014435036L);
    life5_5 = moom.JM.b__Arrayr3();
    spill852_0 = p0;
    if (!((life5_5 != null))) {
        lexicalValue852_11_0 = spill852_0;
        break lexical_join_11;
    }
    if (!((spill852_0 != null))) {
        break lexical_join_36;
    }
    lexicalValue852_11_0 = p0;
    }
    life6_14 = lexicalValue852_11_0;
    life7_17 = (life6_14).length;
    life8_19 = 0;
    lexical_cycle_17: while (true) {
    lexical_join_34: {
    lexical_join_33: {
    if (!((life8_19 < life7_17))) {
        break lexical_join_36;
    }
    life9_26 = (life6_14)[life8_19];
    if (!((life5_5 != null))) {
        break lexical_join_34;
    }
    spill852_1 = life9_26;
    if (!((life5_5 != null))) {
        lexicalValue852_37_0 = spill852_1;
        break lexical_join_37;
    }
    if (!((spill852_1 > p1))) {
        break lexical_join_33;
    }
    p1 = life9_26;
    }
    life8_19 += 1;
    }
    if (!((life5_5 == null))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    lexicalValue852_37_0 = p1;
    }
    return lexicalValue852_37_0;
}


private static java.lang.String a__String(java.lang.String p0) {
int forwardValue2353_33_0;
    net.minecraft.entity.Entity[] spill2353_0;
    int spill2353_1;
    long life1_3;
    java.lang.String life4_6;
    net.minecraft.entity.Entity[] life3_7;
    int life5_15;
    int life6_36;
    forward_join_41: {
    forward_join_33: {
    forward_join_26: {
    life1_3 = (moom.Jc.F ^ 38242696899029L);
    spill2353_0 = moom.JM.b__Arrayr3();
    life4_6 = p0;
    life3_7 = spill2353_0;
    life5_15 = ((java.lang.String)(p0)).lastIndexOf(((int)(__sourceIntrinsic_7d31a37a36f2_invokedynamic2353_2(13968, (1297781531596560898L ^ life1_3)))));
    spill2353_1 = life5_15;
    if (!((life3_7 != null))) {
        forwardValue2353_33_0 = spill2353_1;
        break forward_join_33;
    }
    if (!((spill2353_1 >= 0))) {
        break forward_join_26;
    }
    life4_6 = ((java.lang.String)(p0)).substring(((int)((life5_15 + 1))));
    }
    forwardValue2353_33_0 = ((java.lang.String)(life4_6)).lastIndexOf(((int)(__sourceIntrinsic_7d31a37a36f2_invokedynamic2353_5(16447, (7886843743568850090L ^ life1_3)))));
    }
    life6_36 = forwardValue2353_33_0;
    if (!((life6_36 >= 0))) {
        break forward_join_41;
    }
    life4_6 = ((java.lang.String)(life4_6)).substring(((int)(0)), ((int)(life6_36)));
    }
    return life4_6;
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
        byte[] spill2721_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2721_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2721_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2721_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2721_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2721_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private int[] a__ArrayInt() {
int lexicalValue854_25_0;
    int lexicalValue854_63_0;
    int lexicalValue854_63_1;
    int lexicalValue854_83_0;
    int[] lexicalValue854_88_0;
    boolean spill854_0;
    int spill854_1;
    int spill854_2;
    int spill854_3;
    int[] spill854_4;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    int life4_30;
    int life5_32;
    int life6_42;
    java.lang.String life6_93;
    int life7_97;
    lexical_join_88: {
    lexical_join_83: {
    lexical_join_82: {
    lexical_join_66: {
    lexical_join_63: {
    lexical_join_61: {
    lexical_join_25: {
    lexical_join_19: {
    life1_3 = (moom.Jc.F ^ 34589981127552L);
    life3_5 = moom.JM.b__Arrayr3();
    spill854_0 = ((java.lang.String)(this.a)).startsWith(((java.lang.String)(__sourceIntrinsic_357136e3a4c0_invokedynamic854_3(7740, (5827817105923224639L ^ life1_3)))));
    if (!((life3_5 != null))) {
        lexicalValue854_25_0 = ((spill854_0) ? 1 : 0);
        break lexical_join_25;
    }
    if (!((!spill854_0))) {
        break lexical_join_19;
    }
    return null;
    }
    lexicalValue854_25_0 = ((java.lang.String)(__sourceIntrinsic_357136e3a4c0_invokedynamic854_6(7740, (5827817105923224639L ^ life1_3)))).length();
    }
    life4_30 = lexicalValue854_25_0;
    life5_32 = life4_30;
    lexical_cycle_28: while (true) {
    lexical_join_58: {
    if (!((life5_32 < ((java.lang.String)(this.a)).length()))) {
        break lexical_join_61;
    }
    life6_42 = ((int)(((java.lang.String)(this.a)).charAt(((int)(life5_32)))));
    spill854_1 = life6_42;
    spill854_2 = __sourceIntrinsic_357136e3a4c0_invokedynamic854_13(2913, (6642836043305434559L ^ life1_3));
    if (!((life3_5 != null))) {
        lexicalValue854_63_0 = spill854_1;
        lexicalValue854_63_1 = spill854_2;
        break lexical_join_63;
    }
    if (!((life3_5 != null))) {
        lexicalValue854_63_0 = spill854_1;
        lexicalValue854_63_1 = spill854_2;
        break lexical_join_63;
    }
    if (!((spill854_1 >= spill854_2))) {
        break lexical_join_61;
    }
    if (!((life6_42 > __sourceIntrinsic_357136e3a4c0_invokedynamic854_14(13924, (5406187097382060215L ^ life1_3))))) {
        break lexical_join_58;
    }
    if (!((life3_5 == null))) {
        break lexical_join_61;
    }
    }
    life5_32 += 1;
    if (!((life3_5 == null))) { continue lexical_cycle_28; }
    break lexical_cycle_28;
    }
    }
    lexicalValue854_63_0 = life5_32;
    lexicalValue854_63_1 = life4_30;
    }
    if (!((lexicalValue854_63_0 == lexicalValue854_63_1))) {
        break lexical_join_66;
    }
    return null;
    }
    life6_93 = ((java.lang.String)(this.a)).substring(((int)(life4_30)), ((int)(life5_32)));
    life7_97 = moom.BU.a(((java.lang.String)(life6_93)), ((int)(-1)));
    spill854_3 = life7_97;
    if (!((life3_5 != null))) {
        lexicalValue854_83_0 = spill854_3;
        break lexical_join_83;
    }
    if (!((spill854_3 < 0))) {
        break lexical_join_82;
    }
    lexicalValue854_88_0 = null;
    break lexical_join_88;
    }
    lexicalValue854_83_0 = 1;
    }
    int[] __stackOp854_18_0 = new int[lexicalValue854_83_0];
    spill854_4 = __stackOp854_18_0;
    (__stackOp854_18_0)[0] = life7_97;
    lexicalValue854_88_0 = spill854_4;
    }
    return lexicalValue854_88_0;
}


private java.lang.String[] a__ArrayString() {
long local1 = (moom.Jc.F ^ 118812887361778L);
    net.minecraft.client.renderer.texture.TextureAtlasSprite local3 = moom.Jc.a__oh(((java.lang.String)(this.a)));
    return ((local3 == null) ? null : new java.lang.String[] {this.a});
}


private static net.minecraft.client.renderer.texture.TextureAtlasSprite a__oh(java.lang.String p0) {
net.minecraft.client.renderer.texture.TextureAtlasSprite forwardValue2354_29_0;
    net.minecraft.entity.Entity[] spill2354_0;
    net.minecraft.client.renderer.texture.TextureAtlasSprite spill2354_1;
    net.minecraft.client.renderer.texture.TextureMap spill2354_2;
    long life1_3;
    net.minecraft.client.renderer.texture.TextureMap life4_7;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life5_11;
    net.minecraft.entity.Entity[] life3_12;
    forward_join_29: {
    forward_join_28: {
    life1_3 = (moom.Jc.F ^ 52944103293543L);
    spill2354_0 = moom.JM.b__Arrayr3();
    life4_7 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__n8();
    life5_11 = ((net.minecraft.client.renderer.texture.TextureMap)(life4_7)).c(((java.lang.String)(p0)));
    life3_12 = spill2354_0;
    spill2354_1 = life5_11;
    if (!((life3_12 != null))) {
        forwardValue2354_29_0 = spill2354_1;
        break forward_join_29;
    }
    if (!((spill2354_1 == null))) {
        break forward_join_28;
    }
    spill2354_2 = life4_7;
    java.lang.String __stackOp2354_6_0 = p0;
    java.lang.String __stackOp2354_6_1 = __sourceIntrinsic_10726c0df5f9_invokedynamic2354_5(23015, (211469020354511393L ^ life1_3));
    life5_11 = ((net.minecraft.client.renderer.texture.TextureMap)(spill2354_2)).c(((java.lang.String)(__sourceIntrinsic_10726c0df5f9_invokedynamic2354_7(__stackOp2354_6_1, __stackOp2354_6_0))));
    }
    forwardValue2354_29_0 = life5_11;
    }
    return forwardValue2354_29_0;
}


private int[] a(java.util.Properties p0) {
java.lang.Object lexicalValue851_33_0;
    java.lang.String lexicalValue851_49_0;
    java.lang.String lexicalValue851_49_1;
    java.lang.String lexicalValue851_64_0;
    int lexicalValue851_72_0;
    int lexicalValue851_83_0;
    int lexicalValue851_89_0;
    int lexicalValue851_126_0;
    int lexicalValue851_136_0;
    int[] lexicalValue851_170_0;
    java.lang.Object spill851_0;
    int spill851_1;
    java.lang.String spill851_2;
    java.lang.String spill851_3;
    java.lang.String spill851_4;
    int spill851_5;
    int spill851_6;
    int[] spill851_7;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    java.util.HashMap life5_16;
    java.util.Iterator life6_20;
    java.lang.Object life7_26;
    java.lang.String life8_42;
    java.lang.String life9_48;
    java.lang.String life10_65;
    java.lang.String life11_69;
    int life12_83;
    int life13_109;
    int[] life6_180;
    int life7_182;
    lexical_join_170: {
    lexical_join_169: {
    lexical_join_136: {
    lexical_join_131: {
    lexical_join_126: {
    lexical_join_124: {
    lexical_join_11: {
    life2_3 = (moom.Jc.F ^ 136019548378569L);
    life4_5 = moom.JM.b__Arrayr3();
    if (!((this.g == null))) {
        break lexical_join_11;
    }
    return null;
    }
    life5_16 = new java.util.HashMap();
    life6_20 = ((java.util.Set)(((java.util.Properties)(p0)).keySet())).iterator();
    lexical_cycle_19: while (true) {
    lexical_join_122: {
    lexical_join_113: {
    lexical_join_111: {
    lexical_join_102: {
    lexical_join_89: {
    lexical_join_83: {
    lexical_join_72: {
    lexical_join_64: {
    lexical_join_49: {
    lexical_join_33: {
    if (!(((java.util.Iterator)(life6_20)).hasNext())) {
        break lexical_join_124;
    }
    life7_26 = ((java.util.Iterator)(life6_20)).next();
    spill851_0 = life7_26;
    if (!((life4_5 != null))) {
        lexicalValue851_33_0 = spill851_0;
        break lexical_join_33;
    }
    spill851_1 = ((spill851_0 instanceof java.lang.String) ? 1 : 0);
    if (!((life4_5 != null))) {
        lexicalValue851_126_0 = spill851_1;
        break lexical_join_126;
    }
    if (!((spill851_1 != 0))) {
        break lexical_join_122;
    }
    lexicalValue851_33_0 = life7_26;
    }
    life8_42 = ((java.lang.String)(lexicalValue851_33_0));
    life9_48 = __sourceIntrinsic_38d3ca5a5f50_invokedynamic851_9(15887, (2316255356427678326L ^ life2_3));
    spill851_2 = life8_42;
    spill851_3 = life9_48;
    if (!((life4_5 != null))) {
        lexicalValue851_49_0 = spill851_2;
        lexicalValue851_49_1 = spill851_3;
        break lexical_join_49;
    }
    if (!(((java.lang.String)(spill851_2)).startsWith(((java.lang.String)(spill851_3))))) {
        break lexical_join_122;
    }
    lexicalValue851_49_0 = life8_42;
    lexicalValue851_49_1 = life9_48;
    }
    life10_65 = ((java.lang.String)(lexicalValue851_49_0)).substring(((int)(((java.lang.String)(lexicalValue851_49_1)).length())));
    life11_69 = ((java.util.Properties)(p0)).getProperty(((java.lang.String)(life8_42)));
    spill851_4 = life11_69;
    if (!((life4_5 != null))) {
        lexicalValue851_64_0 = spill851_4;
        break lexical_join_64;
    }
    if (!((spill851_4 != null))) {
        break lexical_join_122;
    }
    life11_69 = ((java.lang.String)(life11_69)).trim();
    lexicalValue851_64_0 = life10_65;
    }
    life12_83 = moom.BU.a(((java.lang.String)(lexicalValue851_64_0)), ((int)(-1)));
    spill851_5 = life12_83;
    if (!((life4_5 != null))) {
        lexicalValue851_72_0 = spill851_5;
        break lexical_join_72;
    }
    if (!((spill851_5 >= 0))) {
        break lexical_join_113;
    }
    lexicalValue851_72_0 = life12_83;
    }
    if (!((life4_5 != null))) {
        lexicalValue851_83_0 = lexicalValue851_72_0;
        break lexical_join_83;
    }
    if (!((lexicalValue851_72_0 <= __sourceIntrinsic_38d3ca5a5f50_invokedynamic851_16(1243, (1792138572762289216L ^ life2_3))))) {
        break lexical_join_113;
    }
    lexicalValue851_83_0 = moom.BU.a(((java.lang.String)(life11_69)), ((int)(-1)));
    }
    life13_109 = lexicalValue851_83_0;
    spill851_6 = life13_109;
    if (!((life4_5 != null))) {
        lexicalValue851_89_0 = spill851_6;
        break lexical_join_89;
    }
    if (!((spill851_6 >= 0))) {
        break lexical_join_102;
    }
    lexicalValue851_89_0 = life13_109;
    }
    if (!((lexicalValue851_89_0 < (this.g).length))) {
        break lexical_join_102;
    }
    ((java.util.Map)(life5_16)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(life12_83))))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(life13_109))))));
    if (!((life4_5 == null))) {
        break lexical_join_111;
    }
    }
    java.lang.String __stackOp851_23_0 = life11_69;
    java.lang.String __stackOp851_23_1 = __sourceIntrinsic_38d3ca5a5f50_invokedynamic851_22(15277, (6720241526236362637L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_38d3ca5a5f50_invokedynamic851_24(__stackOp851_23_1, __stackOp851_23_0))));
    }
    if (!((life4_5 == null))) {
        break lexical_join_122;
    }
    }
    java.lang.String __stackOp851_27_0 = life10_65;
    java.lang.String __stackOp851_27_1 = __sourceIntrinsic_38d3ca5a5f50_invokedynamic851_26(3052, (410362178947385275L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_38d3ca5a5f50_invokedynamic851_28(__stackOp851_27_1, __stackOp851_27_0))));
    }
    if (!((life4_5 == null))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    lexicalValue851_126_0 = ((((java.util.Map)(life5_16)).isEmpty()) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        lexicalValue851_136_0 = lexicalValue851_126_0;
        break lexical_join_136;
    }
    if (!((lexicalValue851_126_0 != 0))) {
        break lexical_join_131;
    }
    return null;
    }
    lexicalValue851_136_0 = __sourceIntrinsic_38d3ca5a5f50_invokedynamic851_32(13968, (1297876791580435998L ^ life2_3));
    }
    life6_180 = new int[lexicalValue851_136_0];
    life7_182 = 0;
    lexical_cycle_140: while (true) {
    lexical_join_167: {
    lexical_join_166: {
    if (!((life7_182 < (life6_180).length))) {
        break lexical_join_169;
    }
    spill851_7 = life6_180;
    if (!((life4_5 != null))) {
        lexicalValue851_170_0 = spill851_7;
        break lexical_join_170;
    }
    (spill851_7)[life7_182] = -1;
    if (!((life4_5 != null))) {
        break lexical_join_167;
    }
    if (!(((java.util.Map)(life5_16)).containsKey(((java.lang.Object)(java.lang.Integer.valueOf(((int)(life7_182)))))))) {
        break lexical_join_166;
    }
    (life6_180)[life7_182] = ((java.lang.Integer)(((java.lang.Integer)(((java.util.Map)(life5_16)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(life7_182)))))))))).intValue();
    }
    life7_182 += 1;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_140; }
    break lexical_cycle_140;
    }
    }
    lexicalValue851_170_0 = life6_180;
    }
    return lexicalValue851_170_0;
}


private moom.J_[] a__ArrayJ_() {
int[] lexicalValue855_16_0;
    moom.J_[] lexicalValue855_40_0;
    net.minecraft.entity.Entity[] spill855_0;
    int[] spill855_1;
    moom.J_[] spill855_2;
    long life1_3;
    int[] life4_7;
    net.minecraft.entity.Entity[] life3_8;
    moom.J_[] life5_23;
    int life6_25;
    lexical_join_40: {
    lexical_join_39: {
    lexical_join_16: {
    lexical_join_15: {
    life1_3 = (moom.Jc.F ^ 11031558385155L);
    spill855_0 = moom.JM.b__Arrayr3();
    life4_7 = ((moom.Jc)(this)).a__ArrayInt();
    life3_8 = spill855_0;
    spill855_1 = life4_7;
    if (!((life3_8 != null))) {
        lexicalValue855_16_0 = spill855_1;
        break lexical_join_16;
    }
    if (!((spill855_1 == null))) {
        break lexical_join_15;
    }
    return null;
    }
    lexicalValue855_16_0 = life4_7;
    }
    life5_23 = new moom.J_[(lexicalValue855_16_0).length];
    life6_25 = 0;
    lexical_cycle_21: while (true) {
    if (!((life6_25 < (life5_23).length))) {
        break lexical_join_39;
    }
    spill855_2 = life5_23;
    if (!((life3_8 != null))) {
        lexicalValue855_40_0 = spill855_2;
        break lexical_join_40;
    }
    (spill855_2)[life6_25] = new moom.J_((life4_7)[life6_25]);
    life6_25 += 1;
    if (!((life3_8 == null))) { continue lexical_cycle_21; }
    break lexical_cycle_21;
    }
    }
    lexicalValue855_40_0 = life5_23;
    }
    return lexicalValue855_40_0;
}


private int a() {
moom.Jc forwardValue2340_14_0;
    int forwardValue2340_23_0;
    moom.Jc spill2340_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_23: {
    forward_join_18: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (moom.Jc.F ^ 42969841564715L);
    life3_5 = moom.JM.b__Arrayr3();
    spill2340_0 = this;
    if (!((life3_5 != null))) {
        forwardValue2340_14_0 = spill2340_0;
        break forward_join_14;
    }
    if (!((((moom.Jc)(spill2340_0)).c != null))) {
        break forward_join_13;
    }
    forwardValue2340_23_0 = 1;
    break forward_join_23;
    }
    forwardValue2340_14_0 = this;
    }
    if (!((((moom.Jc)(forwardValue2340_14_0)).e != null))) {
        break forward_join_18;
    }
    forwardValue2340_23_0 = 2;
    break forward_join_23;
    }
    forwardValue2340_23_0 = __sourceIntrinsic_8aebf151eadb_invokedynamic2340_4(29710, (2296674319984856426L ^ life1_3));
    }
    return forwardValue2340_23_0;
}


public boolean a__Boolean(java.lang.String p0) {
moom.Jc forwardValue237_34_0;
    moom.Jc forwardValue237_43_0;
    moom.Jc forwardValue237_57_0;
    moom.J_[] forwardValue237_60_0;
    moom.Jc forwardValue237_78_0;
    moom.Jc forwardValue237_94_0;
    java.lang.String[] forwardValue237_100_0;
    int forwardValue237_115_0;
    int forwardValue237_136_0;
    int forwardValue237_159_0;
    int forwardValue237_181_0;
    int forwardValue237_197_0;
    int forwardValue237_270_0;
    int forwardValue237_281_0;
    java.lang.String forwardValue237_290_0;
    int forwardValue237_292_0;
    java.lang.String spill237_0;
    int spill237_1;
    moom.Jc spill237_2;
    moom.J_[] spill237_3;
    moom.Jc spill237_4;
    java.lang.String[] spill237_5;
    int spill237_6;
    int spill237_7;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_292: {
    forward_join_290: {
    forward_join_282: {
    forward_join_281: {
    forward_join_271: {
    forward_join_270: {
    forward_join_260: {
    forward_join_256: {
    forward_join_252: {
    forward_join_248: {
    forward_join_244: {
    forward_join_240: {
    forward_join_236: {
    forward_join_232: {
    forward_join_228: {
    forward_join_224: {
    forward_join_220: {
    forward_join_216: {
    forward_join_212: {
    forward_join_208: {
    forward_join_204: {
    forward_join_200: {
    forward_join_197: {
    forward_join_195: {
    forward_join_181: {
    forward_join_173: {
    forward_join_159: {
    forward_join_151: {
    forward_join_136: {
    forward_join_134: {
    forward_join_115: {
    forward_join_113: {
    forward_join_100: {
    forward_join_94: {
    forward_join_93: {
    forward_join_78: {
    forward_join_77: {
    forward_join_60: {
    forward_join_57: {
    forward_join_56: {
    forward_join_43: {
    forward_join_42: {
    forward_join_34: {
    forward_join_33: {
    life2_3 = (moom.Jc.F ^ 33812254182598L);
    life4_5 = moom.JM.b__Arrayr3();
    spill237_0 = this.a;
    if (!((life4_5 != null))) {
        forwardValue237_290_0 = spill237_0;
        break forward_join_290;
    }
    if (!((spill237_0 != null))) {
        break forward_join_282;
    }
    spill237_1 = ((java.lang.String)(this.a)).length();
    if (!((life4_5 != null))) {
        forwardValue237_292_0 = spill237_1;
        break forward_join_292;
    }
    if (!((spill237_1 > 0))) {
        break forward_join_282;
    }
    spill237_2 = this;
    if (!((life4_5 != null))) {
        forwardValue237_34_0 = spill237_2;
        break forward_join_34;
    }
    if (!((((moom.Jc)(spill237_2)).b == null))) {
        break forward_join_33;
    }
    java.lang.String __stackOp237_7_0 = p0;
    java.lang.String __stackOp237_7_1 = __sourceIntrinsic_051b43f8cbc1_invokedynamic237_6(1507, (4612481849641193683L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_051b43f8cbc1_invokedynamic237_8(__stackOp237_7_1, __stackOp237_7_0))));
    return ((0) != 0);
    }
    forwardValue237_34_0 = this;
    }
    if (!((life4_5 != null))) {
        forwardValue237_43_0 = forwardValue237_34_0;
        break forward_join_43;
    }
    if (!((((moom.Jc)(forwardValue237_34_0)).c == null))) {
        break forward_join_42;
    }
    this.c = ((moom.J_[])(((moom.Jc)(this)).a__ArrayJ_()));
    }
    forwardValue237_43_0 = this;
    }
    if (!((life4_5 != null))) {
        forwardValue237_57_0 = forwardValue237_43_0;
        break forward_join_57;
    }
    if (!((((moom.Jc)(forwardValue237_43_0)).e == null))) {
        break forward_join_56;
    }
    spill237_3 = this.c;
    if (!((life4_5 != null))) {
        forwardValue237_60_0 = spill237_3;
        break forward_join_60;
    }
    if (!((spill237_3 == null))) {
        break forward_join_56;
    }
    this.e = ((java.lang.String[])(((moom.Jc)(this)).a__ArrayString()));
    }
    forwardValue237_57_0 = this;
    }
    if (!((life4_5 != null))) {
        forwardValue237_78_0 = forwardValue237_57_0;
        break forward_join_78;
    }
    forwardValue237_60_0 = ((moom.Jc)(forwardValue237_57_0)).c;
    }
    if (!((forwardValue237_60_0 == null))) {
        break forward_join_77;
    }
    spill237_4 = this;
    if (!((life4_5 != null))) {
        forwardValue237_78_0 = spill237_4;
        break forward_join_78;
    }
    if (!((((moom.Jc)(spill237_4)).e == null))) {
        break forward_join_77;
    }
    java.lang.String __stackOp237_21_0 = p0;
    java.lang.String __stackOp237_21_1 = __sourceIntrinsic_051b43f8cbc1_invokedynamic237_20(7941, (8014712060837874176L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_051b43f8cbc1_invokedynamic237_22(__stackOp237_21_1, __stackOp237_21_0))));
    return ((0) != 0);
    }
    forwardValue237_78_0 = this;
    }
    if (!((life4_5 != null))) {
        forwardValue237_94_0 = forwardValue237_78_0;
        break forward_join_94;
    }
    if (!((((moom.Jc)(forwardValue237_78_0)).f == 0))) {
        break forward_join_93;
    }
    java.lang.String __stackOp237_27_0 = p0;
    java.lang.String __stackOp237_27_1 = __sourceIntrinsic_051b43f8cbc1_invokedynamic237_26(8963, (5322641728482866757L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_051b43f8cbc1_invokedynamic237_28(__stackOp237_27_1, __stackOp237_27_0))));
    return ((0) != 0);
    }
    forwardValue237_94_0 = this;
    }
    spill237_5 = ((moom.Jc)(forwardValue237_94_0)).g;
    if (!((life4_5 != null))) {
        forwardValue237_100_0 = spill237_5;
        break forward_join_100;
    }
    if (!((spill237_5 != null))) {
        break forward_join_271;
    }
    forwardValue237_100_0 = this.g;
    }
    spill237_6 = (forwardValue237_100_0).length;
    if (!((life4_5 != null))) {
        forwardValue237_281_0 = spill237_6;
        break forward_join_281;
    }
    if (!((spill237_6 > 0))) {
        break forward_join_271;
    }
    spill237_7 = this.h;
    if (!((life4_5 != null))) {
        forwardValue237_115_0 = spill237_7;
        break forward_join_115;
    }
    if (!((spill237_7 == 0))) {
        break forward_join_113;
    }
    this.h = ((int)(((moom.Jc)(this)).a()));
    }
    forwardValue237_115_0 = this.h;
    }
    if (!((life4_5 != null))) {
        forwardValue237_136_0 = forwardValue237_115_0;
        break forward_join_136;
    }
    if (!((forwardValue237_115_0 == __sourceIntrinsic_051b43f8cbc1_invokedynamic237_37(9775, (6359524988393058224L ^ life2_3))))) {
        break forward_join_134;
    }
    java.lang.String __stackOp237_39_0 = p0;
    java.lang.String __stackOp237_39_1 = __sourceIntrinsic_051b43f8cbc1_invokedynamic237_38(32434, (4904733257024842715L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_051b43f8cbc1_invokedynamic237_40(__stackOp237_39_1, __stackOp237_39_0))));
    return ((0) != 0);
    }
    forwardValue237_136_0 = this.l;
    }
    if (!((life4_5 != null))) {
        forwardValue237_159_0 = forwardValue237_136_0;
        break forward_join_159;
    }
    if (!((forwardValue237_136_0 > 0))) {
        break forward_join_151;
    }
    int __stackOp237_46_0 = this.l;
    java.lang.String __stackOp237_46_1 = __sourceIntrinsic_051b43f8cbc1_invokedynamic237_45(13682, (1765546203892375636L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_051b43f8cbc1_invokedynamic237_47(__stackOp237_46_1, __stackOp237_46_0))));
    return ((0) != 0);
    }
    forwardValue237_159_0 = (this.i & __sourceIntrinsic_051b43f8cbc1_invokedynamic237_51(29710, (2296647742370856327L ^ life2_3)));
    }
    if (!((life4_5 != null))) {
        forwardValue237_181_0 = forwardValue237_159_0;
        break forward_join_181;
    }
    if (!((forwardValue237_159_0 != 0))) {
        break forward_join_173;
    }
    java.lang.String __stackOp237_53_0 = p0;
    java.lang.String __stackOp237_53_1 = __sourceIntrinsic_051b43f8cbc1_invokedynamic237_52(31719, (4304847795423293068L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_051b43f8cbc1_invokedynamic237_54(__stackOp237_53_1, __stackOp237_53_0))));
    return ((0) != 0);
    }
    forwardValue237_181_0 = (this.s & __sourceIntrinsic_051b43f8cbc1_invokedynamic237_58(29710, (2296647742370856327L ^ life2_3)));
    }
    if (!((life4_5 != null))) {
        forwardValue237_197_0 = forwardValue237_181_0;
        break forward_join_197;
    }
    if (!((forwardValue237_181_0 != 0))) {
        break forward_join_195;
    }
    java.lang.String __stackOp237_60_0 = p0;
    java.lang.String __stackOp237_60_1 = __sourceIntrinsic_051b43f8cbc1_invokedynamic237_59(25620, (6984792011047317883L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_051b43f8cbc1_invokedynamic237_61(__stackOp237_60_1, __stackOp237_60_0))));
    return ((0) != 0);
    }
    forwardValue237_197_0 = this.f;
    }
    if (!((life4_5 != null))) {
        forwardValue237_270_0 = forwardValue237_197_0;
        break forward_join_270;
    }
    switch (forwardValue237_197_0) {
case 1:
{
        break forward_join_200;
    }
case 2:
{
        break forward_join_204;
    }
case 3:
{
        break forward_join_208;
    }
case 4:
{
        break forward_join_212;
    }
case 5:
{
        break forward_join_216;
    }
case 6:
{
        break forward_join_220;
    }
case 7:
{
        break forward_join_224;
    }
case 8:
{
        break forward_join_228;
    }
case 9:
{
        break forward_join_232;
    }
case 10:
{
        break forward_join_236;
    }
case 11:
{
        break forward_join_240;
    }
case 12:
{
        break forward_join_244;
    }
case 13:
{
        break forward_join_248;
    }
case 14:
{
        break forward_join_252;
    }
case 15:
{
        break forward_join_256;
    }
default:
{
        break forward_join_260;
    }
}
    }
    return ((moom.Jc)(this)).b__Boolean(((java.lang.String)(p0)));
    }
    return ((moom.Jc)(this)).i(((java.lang.String)(p0)));
    }
    return ((moom.Jc)(this)).p(((java.lang.String)(p0)));
    }
    return ((moom.Jc)(this)).m(((java.lang.String)(p0)));
    }
    return ((moom.Jc)(this)).n(((java.lang.String)(p0)));
    }
    return ((moom.Jc)(this)).j(((java.lang.String)(p0)));
    }
    return ((moom.Jc)(this)).o(((java.lang.String)(p0)));
    }
    return ((moom.Jc)(this)).k(((java.lang.String)(p0)));
    }
    return ((moom.Jc)(this)).l(((java.lang.String)(p0)));
    }
    return ((moom.Jc)(this)).c__Boolean(((java.lang.String)(p0)));
    }
    return ((moom.Jc)(this)).d__Boolean(((java.lang.String)(p0)));
    }
    return ((moom.Jc)(this)).e__Boolean(((java.lang.String)(p0)));
    }
    return ((moom.Jc)(this)).f(((java.lang.String)(p0)));
    }
    return ((moom.Jc)(this)).g(((java.lang.String)(p0)));
    }
    return ((moom.Jc)(this)).h(((java.lang.String)(p0)));
    }
    java.lang.String __stackOp237_81_0 = p0;
    java.lang.String __stackOp237_81_1 = __sourceIntrinsic_051b43f8cbc1_invokedynamic237_80(6152, (1636514835401198909L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_051b43f8cbc1_invokedynamic237_82(__stackOp237_81_1, __stackOp237_81_0))));
    forwardValue237_270_0 = 0;
    }
    return ((forwardValue237_270_0) != 0);
    }
    java.lang.String __stackOp237_86_0 = p0;
    java.lang.String __stackOp237_86_1 = __sourceIntrinsic_051b43f8cbc1_invokedynamic237_85(5143, (4305567297828831495L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_051b43f8cbc1_invokedynamic237_87(__stackOp237_86_1, __stackOp237_86_0))));
    forwardValue237_281_0 = 0;
    }
    return ((forwardValue237_281_0) != 0);
    }
    java.lang.String __stackOp237_91_0 = p0;
    java.lang.String __stackOp237_91_1 = __sourceIntrinsic_051b43f8cbc1_invokedynamic237_90(14155, (6185297217696293421L ^ life2_3));
    forwardValue237_290_0 = __sourceIntrinsic_051b43f8cbc1_invokedynamic237_92(__stackOp237_91_1, __stackOp237_91_0);
    }
    moom.BU.c(((java.lang.String)(forwardValue237_290_0)));
    forwardValue237_292_0 = 0;
    }
    return ((forwardValue237_292_0) != 0);
}


public void a(net.minecraft.client.renderer.texture.TextureMap p0) {
java.lang.String[] forwardValue2346_21_0;
    java.lang.String[] forwardValue2346_36_0;
    moom.Jc forwardValue2346_38_0;
    moom.Jc forwardValue2346_49_0;
    java.lang.String[] forwardValue2346_49_1;
    net.minecraft.client.renderer.texture.TextureMap forwardValue2346_49_2;
    int forwardValue2346_49_3;
    int forwardValue2346_49_4;
    moom.Jc forwardValue2346_50_0;
    java.lang.String[] forwardValue2346_50_1;
    net.minecraft.client.renderer.texture.TextureMap forwardValue2346_50_2;
    int forwardValue2346_50_3;
    moom.Jc forwardValue2346_51_0;
    java.lang.String[] forwardValue2346_51_1;
    net.minecraft.client.renderer.texture.TextureMap forwardValue2346_51_2;
    int forwardValue2346_51_3;
    int forwardValue2346_51_4;
    java.lang.String[] spill2346_0;
    moom.Jc spill2346_1;
    java.lang.String[] spill2346_2;
    net.minecraft.client.renderer.texture.TextureMap spill2346_3;
    int spill2346_4;
    boolean spill2346_5;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_53: {
    forward_join_51: {
    forward_join_50: {
    forward_join_49: {
    forward_join_38: {
    forward_join_36: {
    forward_join_32: {
    forward_join_21: {
    forward_join_19: {
    life2_3 = (moom.Jc.F ^ 30971159094208L);
    life4_5 = moom.JM.b__Arrayr3();
    spill2346_0 = this.e;
    if (!((life4_5 != null))) {
        forwardValue2346_21_0 = spill2346_0;
        break forward_join_21;
    }
    if (!((spill2346_0 != null))) {
        break forward_join_19;
    }
    this.x = ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(moom.Jc.a(((java.lang.String[])(this.e)), ((net.minecraft.client.renderer.texture.TextureMap)(p0)), ((boolean)(false)), ((boolean)(false)))));
    }
    forwardValue2346_21_0 = this.A;
    }
    if (!((life4_5 != null))) {
        forwardValue2346_36_0 = forwardValue2346_21_0;
        break forward_join_36;
    }
    if (!((forwardValue2346_21_0 != null))) {
        break forward_join_32;
    }
    this.B = ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(moom.Jc.a(((java.lang.String[])(this.A)), ((net.minecraft.client.renderer.texture.TextureMap)(p0)), ((boolean)(false)), ((boolean)(false)))));
    }
    spill2346_1 = this;
    if (!((life4_5 != null))) {
        forwardValue2346_38_0 = spill2346_1;
        break forward_join_38;
    }
    forwardValue2346_36_0 = ((moom.Jc)(spill2346_1)).g;
    }
    if (!((forwardValue2346_36_0 != null))) {
        break forward_join_53;
    }
    forwardValue2346_38_0 = this;
    }
    spill2346_2 = this.g;
    spill2346_3 = p0;
    spill2346_4 = 1;
    spill2346_5 = moom.Jc.a(((int)(this.f)));
    if (!((life4_5 != null))) {
        forwardValue2346_49_0 = forwardValue2346_38_0;
        forwardValue2346_49_1 = spill2346_2;
        forwardValue2346_49_2 = spill2346_3;
        forwardValue2346_49_3 = spill2346_4;
        forwardValue2346_49_4 = ((spill2346_5) ? 1 : 0);
        break forward_join_49;
    }
    if (!((!spill2346_5))) {
        forwardValue2346_50_0 = forwardValue2346_38_0;
        forwardValue2346_50_1 = spill2346_2;
        forwardValue2346_50_2 = spill2346_3;
        forwardValue2346_50_3 = spill2346_4;
        break forward_join_50;
    }
    forwardValue2346_49_0 = forwardValue2346_38_0;
    forwardValue2346_49_1 = spill2346_2;
    forwardValue2346_49_2 = spill2346_3;
    forwardValue2346_49_3 = spill2346_4;
    forwardValue2346_49_4 = 1;
    }
    forwardValue2346_51_0 = forwardValue2346_49_0;
    forwardValue2346_51_1 = forwardValue2346_49_1;
    forwardValue2346_51_2 = forwardValue2346_49_2;
    forwardValue2346_51_3 = forwardValue2346_49_3;
    forwardValue2346_51_4 = forwardValue2346_49_4;
    break forward_join_51;
    }
    forwardValue2346_51_0 = forwardValue2346_50_0;
    forwardValue2346_51_1 = forwardValue2346_50_1;
    forwardValue2346_51_2 = forwardValue2346_50_2;
    forwardValue2346_51_3 = forwardValue2346_50_3;
    forwardValue2346_51_4 = 0;
    }
    ((moom.Jc)(forwardValue2346_51_0)).y = ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(moom.Jc.a(((java.lang.String[])(forwardValue2346_51_1)), ((net.minecraft.client.renderer.texture.TextureMap)(forwardValue2346_51_2)), ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue2346_51_3))), ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue2346_51_4))))));
    }
    return;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Jc.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5273_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Jc"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static net.minecraft.block.properties.IProperty a(java.lang.String p0, java.util.Collection<net.minecraft.block.properties.IProperty> p1) {
net.minecraft.entity.Entity[] spill850_0;
    long life2_3;
    java.util.Iterator life5_7;
    net.minecraft.entity.Entity[] life4_8;
    net.minecraft.block.properties.IProperty life6_15;
    lexical_join_25: {
    life2_3 = (moom.Jc.F ^ 72602164439274L);
    spill850_0 = moom.JM.b__Arrayr3();
    life5_7 = ((java.util.Collection)(p1)).iterator();
    life4_8 = spill850_0;
    lexical_cycle_9: while (true) {
    lexical_join_23: {
    if (!(((java.util.Iterator)(life5_7)).hasNext())) {
        break lexical_join_25;
    }
    life6_15 = ((net.minecraft.block.properties.IProperty)(((java.util.Iterator)(life5_7)).next()));
    if (!(((java.lang.String)(p0)).equals(((java.lang.Object)(((net.minecraft.block.properties.IProperty)(life6_15)).a__String()))))) {
        break lexical_join_23;
    }
    return life6_15;
    }
    if (!((life4_8 == null))) { continue lexical_cycle_9; }
    break lexical_cycle_9;
    }
    }
    return null;
}


private java.lang.String[] a__ArrayString(java.lang.String p0) {
java.lang.String lexicalValue856_13_0;
    java.lang.String lexicalValue856_49_0;
    java.lang.String lexicalValue856_49_1;
    java.lang.String[] lexicalValue856_59_0;
    java.lang.String spill856_0;
    java.lang.String[] spill856_1;
    java.lang.String spill856_2;
    java.lang.String spill856_3;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    java.lang.String[] life5_20;
    int life6_22;
    java.lang.String life7_32;
    java.lang.String life7_58;
    lexical_join_59: {
    lexical_join_58: {
    lexical_join_13: {
    lexical_join_12: {
    life2_3 = (moom.Jc.F ^ 109785156322741L);
    life4_5 = moom.JM.b__Arrayr3();
    spill856_0 = p0;
    if (!((life4_5 != null))) {
        lexicalValue856_13_0 = spill856_0;
        break lexical_join_13;
    }
    if (!((spill856_0 == null))) {
        break lexical_join_12;
    }
    return null;
    }
    lexicalValue856_13_0 = p0;
    }
    life5_20 = moom.BU.a__ArrayString(((java.lang.String)(lexicalValue856_13_0)), ((java.lang.String)(" ")));
    life6_22 = 0;
    lexical_cycle_18: while (true) {
    lexical_join_49: {
    lexical_join_46: {
    if (!((life6_22 < (life5_20).length))) {
        break lexical_join_58;
    }
    spill856_1 = life5_20;
    if (!((life4_5 != null))) {
        lexicalValue856_59_0 = spill856_1;
        break lexical_join_59;
    }
    life7_32 = (spill856_1)[life6_22];
    spill856_2 = life7_32;
    spill856_3 = __sourceIntrinsic_fa9b96cb207e_invokedynamic856_3(583, (6076089940773084752L ^ life2_3));
    if (!((life4_5 != null))) {
        lexicalValue856_49_0 = spill856_2;
        lexicalValue856_49_1 = spill856_3;
        break lexical_join_49;
    }
    if (!(((java.lang.String)(spill856_2)).endsWith(((java.lang.String)(spill856_3))))) {
        break lexical_join_46;
    }
    life7_32 = ((java.lang.String)(life7_32)).substring(((int)(0)), ((int)((((java.lang.String)(life7_32)).length() - 4))));
    }
    lexicalValue856_49_0 = life7_32;
    lexicalValue856_49_1 = this.b;
    }
    life7_58 = moom.Oc.a(((java.lang.String)(lexicalValue856_49_0)), ((java.lang.String)(lexicalValue856_49_1)));
    (life5_20)[life6_22] = life7_58;
    life6_22 += 1;
    if (!((life4_5 == null))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    lexicalValue856_59_0 = life5_20;
    }
    return lexicalValue856_59_0;
}


private boolean m(java.lang.String p0) {
int lexicalValue860_64_0;
    int lexicalValue860_64_1;
    int lexicalValue860_119_0;
    moom.Jc lexicalValue860_165_0;
    int lexicalValue860_166_0;
    int lexicalValue860_192_0;
    int lexicalValue860_203_0;
    int spill860_0;
    moom.Jc spill860_1;
    int spill860_2;
    int spill860_3;
    int spill860_4;
    int spill860_5;
    int spill860_6;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    int[] life5_65;
    int[] life5_102;
    int life6_115;
    int life7_119;
    int life5_146;
    int life6_148;
    lexical_join_203: {
    lexical_join_202: {
    lexical_join_193: {
    lexical_join_192: {
    lexical_join_181: {
    lexical_join_166: {
    lexical_join_165: {
    lexical_join_164: {
    lexical_join_147: {
    lexical_join_144: {
    lexical_join_119: {
    lexical_join_118: {
    lexical_join_112: {
    lexical_join_109: {
    lexical_join_64: {
    lexical_join_56: {
    life2_3 = (moom.Jc.F ^ 135388603956366L);
    life4_5 = moom.JM.b__Arrayr3();
    if (!((life4_5 != null))) {
        break lexical_join_202;
    }
    if (!((this.g != null))) {
        break lexical_join_193;
    }
    spill860_0 = (this.g).length;
    if (!((life4_5 != null))) {
        lexicalValue860_203_0 = spill860_0;
        break lexical_join_203;
    }
    if (!((spill860_0 > 0))) {
        break lexical_join_193;
    }
    spill860_1 = this;
    if (!((life4_5 != null))) {
        lexicalValue860_165_0 = spill860_1;
        break lexical_join_165;
    }
    if (!((((moom.Jc)(spill860_1)).q != null))) {
        break lexical_join_164;
    }
    spill860_2 = (this.q).length;
    spill860_3 = (this.g).length;
    if (!((life4_5 != null))) {
        lexicalValue860_64_0 = spill860_2;
        lexicalValue860_64_1 = spill860_3;
        break lexical_join_64;
    }
    if (!((spill860_2 > spill860_3))) {
        break lexical_join_56;
    }
    java.lang.String __stackOp860_8_0 = p0;
    java.lang.String __stackOp860_8_1 = __sourceIntrinsic_cbfd0e191e19_invokedynamic860_7(26683, (1272972916972408109L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_cbfd0e191e19_invokedynamic860_9(__stackOp860_8_1, __stackOp860_8_0))));
    life5_65 = new int[(this.g).length];
    java.lang.System.arraycopy(((java.lang.Object)(this.q)), ((int)(0)), ((java.lang.Object)(life5_65)), ((int)(0)), ((int)((life5_65).length)));
    this.q = ((int[])(life5_65));
    }
    spill860_4 = (this.q).length;
    if (!((life4_5 != null))) {
        lexicalValue860_119_0 = spill860_4;
        break lexical_join_119;
    }
    lexicalValue860_64_0 = spill860_4;
    lexicalValue860_64_1 = (this.g).length;
    }
    if (!((lexicalValue860_64_0 < lexicalValue860_64_1))) {
        break lexical_join_112;
    }
    java.lang.String __stackOp860_18_0 = p0;
    java.lang.String __stackOp860_18_1 = __sourceIntrinsic_cbfd0e191e19_invokedynamic860_17(5797, (2366285006515975070L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_cbfd0e191e19_invokedynamic860_19(__stackOp860_18_1, __stackOp860_18_0))));
    life5_102 = new int[(this.g).length];
    java.lang.System.arraycopy(((java.lang.Object)(this.q)), ((int)(0)), ((java.lang.Object)(life5_102)), ((int)(0)), ((int)((this.q).length)));
    life6_115 = moom.N2.a(((int[])(this.q)));
    life7_119 = (this.q).length;
    lexical_cycle_96: while (true) {
    if (!((life7_119 < (life5_102).length))) {
        break lexical_join_109;
    }
    (life5_102)[life7_119] = life6_115;
    life7_119 += 1;
    if (!((life4_5 != null))) {
        break lexical_join_118;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_96; }
    break lexical_cycle_96;
    }
    }
    this.q = ((int[])(life5_102));
    }
    this.v = ((int[])(new int[(this.q).length]));
    }
    lexicalValue860_119_0 = 0;
    }
    life5_146 = lexicalValue860_119_0;
    life6_148 = 0;
    lexical_cycle_122: while (true) {
    if (!((life6_148 < (this.q).length))) {
        break lexical_join_144;
    }
    life5_146 = (life5_146 + (this.q)[life6_148]);
    (this.v)[life6_148] = life5_146;
    life6_148 += 1;
    if (!((life4_5 != null))) {
        break lexical_join_147;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_122; }
    break lexical_cycle_122;
    }
    }
    this.w = ((int)(life5_146));
    }
    spill860_5 = this.w;
    if (!((life4_5 != null))) {
        lexicalValue860_166_0 = spill860_5;
        break lexical_join_166;
    }
    if (!((spill860_5 <= 0))) {
        break lexical_join_164;
    }
    int __stackOp860_37_0 = life5_146;
    java.lang.String __stackOp860_37_1 = __sourceIntrinsic_cbfd0e191e19_invokedynamic860_36(16559, (2902253656937588123L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_cbfd0e191e19_invokedynamic860_38(__stackOp860_37_1, __stackOp860_37_0))));
    this.w = ((int)(1));
    }
    lexicalValue860_165_0 = this;
    }
    lexicalValue860_166_0 = ((moom.Jc)(lexicalValue860_165_0)).r;
    }
    if (!((life4_5 != null))) {
        lexicalValue860_192_0 = lexicalValue860_166_0;
        break lexical_join_192;
    }
    if (!((lexicalValue860_166_0 >= 0))) {
        break lexical_join_181;
    }
    spill860_6 = this.r;
    if (!((life4_5 != null))) {
        lexicalValue860_192_0 = spill860_6;
        break lexical_join_192;
    }
    if (!((spill860_6 <= __sourceIntrinsic_cbfd0e191e19_invokedynamic860_43(10467, (1859613221920903474L ^ life2_3))))) {
        break lexical_join_181;
    }
    return ((1) != 0);
    }
    int __stackOp860_47_0 = this.r;
    java.lang.String __stackOp860_47_1 = __sourceIntrinsic_cbfd0e191e19_invokedynamic860_46(27996, (7720178122973497416L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_cbfd0e191e19_invokedynamic860_48(__stackOp860_47_1, __stackOp860_47_0))));
    lexicalValue860_192_0 = 0;
    }
    return ((lexicalValue860_192_0) != 0);
    }
    java.lang.String __stackOp860_52_0 = p0;
    java.lang.String __stackOp860_52_1 = __sourceIntrinsic_cbfd0e191e19_invokedynamic860_51(22882, (3042883120848338040L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_cbfd0e191e19_invokedynamic860_53(__stackOp860_52_1, __stackOp860_52_0))));
    }
    lexicalValue860_203_0 = 0;
    }
    return ((lexicalValue860_203_0) != 0);
}


private boolean o(java.lang.String p0) {
java.lang.String[] forwardValue2374_24_0;
    int forwardValue2374_38_0;
    java.lang.String[] spill2374_0;
    int spill2374_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_38: {
    forward_join_37: {
    forward_join_24: {
    forward_join_22: {
    life2_3 = (moom.Jc.F ^ 45647291014270L);
    life4_5 = moom.JM.b__Arrayr3();
    spill2374_0 = this.g;
    if (!((life4_5 != null))) {
        forwardValue2374_24_0 = spill2374_0;
        break forward_join_24;
    }
    if (!((spill2374_0 == null))) {
        break forward_join_22;
    }
    java.lang.String __stackOp2374_4_0 = p0;
    java.lang.String __stackOp2374_4_1 = __sourceIntrinsic_569f6894d90a_invokedynamic2374_3(22882, (3042793654613154952L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_569f6894d90a_invokedynamic2374_5(__stackOp2374_4_1, __stackOp2374_4_0))));
    return ((0) != 0);
    }
    forwardValue2374_24_0 = this.g;
    }
    spill2374_1 = (forwardValue2374_24_0).length;
    if (!((life4_5 != null))) {
        forwardValue2374_38_0 = spill2374_1;
        break forward_join_38;
    }
    if (!((spill2374_1 != 1))) {
        break forward_join_37;
    }
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_569f6894d90a_invokedynamic2374_9(4192, (3880992913799075254L ^ life2_3)))));
    return ((0) != 0);
    }
    forwardValue2374_38_0 = 1;
    }
    return ((forwardValue2374_38_0) != 0);
}


private boolean p(java.lang.String p0) {
java.lang.String[] forwardValue2375_22_0;
    int forwardValue2375_39_0;
    java.lang.String[] spill2375_0;
    int spill2375_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_39: {
    forward_join_38: {
    forward_join_22: {
    forward_join_20: {
    life2_3 = (moom.Jc.F ^ 38522976867333L);
    life4_5 = moom.JM.b__Arrayr3();
    spill2375_0 = this.g;
    if (!((life4_5 != null))) {
        forwardValue2375_22_0 = spill2375_0;
        break forward_join_22;
    }
    if (!((spill2375_0 == null))) {
        break forward_join_20;
    }
    this.g = ((java.lang.String[])(((moom.Jc)(this)).b__ArrayString(((java.lang.String)(__sourceIntrinsic_ade936728fbb_invokedynamic2375_3(20069, (6280798544902177767L ^ life2_3)))))));
    }
    forwardValue2375_22_0 = this.g;
    }
    spill2375_1 = (forwardValue2375_22_0).length;
    if (!((life4_5 != null))) {
        forwardValue2375_39_0 = spill2375_1;
        break forward_join_39;
    }
    if (!((spill2375_1 != 1))) {
        break forward_join_38;
    }
    java.lang.String __stackOp2375_8_0 = p0;
    java.lang.String __stackOp2375_8_1 = __sourceIntrinsic_ade936728fbb_invokedynamic2375_7(16316, (3102920186687107675L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_ade936728fbb_invokedynamic2375_9(__stackOp2375_8_1, __stackOp2375_8_0))));
    return ((0) != 0);
    }
    forwardValue2375_39_0 = 1;
    }
    return ((forwardValue2375_39_0) != 0);
}


private boolean k(java.lang.String p0) {
java.lang.String[] forwardValue2370_24_0;
    int forwardValue2370_45_0;
    java.lang.String[] spill2370_0;
    int spill2370_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_45: {
    forward_join_44: {
    forward_join_24: {
    forward_join_22: {
    life2_3 = (moom.Jc.F ^ 837252396403L);
    life4_5 = moom.JM.b__Arrayr3();
    spill2370_0 = this.g;
    if (!((life4_5 != null))) {
        forwardValue2370_24_0 = spill2370_0;
        break forward_join_24;
    }
    if (!((spill2370_0 == null))) {
        break forward_join_22;
    }
    java.lang.String __stackOp2370_4_0 = p0;
    java.lang.String __stackOp2370_4_1 = __sourceIntrinsic_1ca29cda940c_invokedynamic2370_3(17850, (5047068669550618893L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_1ca29cda940c_invokedynamic2370_5(__stackOp2370_4_1, __stackOp2370_4_0))));
    return ((0) != 0);
    }
    forwardValue2370_24_0 = this.g;
    }
    spill2370_1 = (forwardValue2370_24_0).length;
    if (!((life4_5 != null))) {
        forwardValue2370_45_0 = spill2370_1;
        break forward_join_45;
    }
    if (!((spill2370_1 != __sourceIntrinsic_1ca29cda940c_invokedynamic2370_9(29217, (2777573820353167879L ^ life2_3))))) {
        break forward_join_44;
    }
    java.lang.String __stackOp2370_11_0 = p0;
    java.lang.String __stackOp2370_11_1 = __sourceIntrinsic_1ca29cda940c_invokedynamic2370_10(20719, (3420855443422772282L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_1ca29cda940c_invokedynamic2370_12(__stackOp2370_11_1, __stackOp2370_11_0))));
    return ((0) != 0);
    }
    forwardValue2370_45_0 = 1;
    }
    return ((forwardValue2370_45_0) != 0);
}


private boolean g(java.lang.String p0) {
moom.Jc forwardValue2366_15_0;
    net.minecraft.util.EnumWorldBlockLayer forwardValue2366_29_0;
    moom.Jc spill2366_0;
    net.minecraft.util.EnumWorldBlockLayer spill2366_1;
    net.minecraft.util.EnumWorldBlockLayer spill2366_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_29: {
    forward_join_27: {
    forward_join_15: {
    forward_join_14: {
    life2_3 = (moom.Jc.F ^ 26952939738911L);
    life4_5 = moom.JM.b__Arrayr3();
    spill2366_0 = this;
    if (!((life4_5 != null))) {
        forwardValue2366_15_0 = spill2366_0;
        break forward_join_15;
    }
    if (!((!((moom.Jc)(spill2366_0)).n(((java.lang.String)(p0)))))) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    forwardValue2366_15_0 = this;
    }
    spill2366_1 = ((moom.Jc)(forwardValue2366_15_0)).E;
    if (!((life4_5 != null))) {
        forwardValue2366_29_0 = spill2366_1;
        break forward_join_29;
    }
    if (!((spill2366_1 != null))) {
        break forward_join_27;
    }
    spill2366_2 = this.E;
    if (!((life4_5 != null))) {
        forwardValue2366_29_0 = spill2366_2;
        break forward_join_29;
    }
    if (!((spill2366_2 != net.minecraft.util.EnumWorldBlockLayer.SOLID))) {
        break forward_join_27;
    }
    return ((1) != 0);
    }
    forwardValue2366_29_0 = this.E;
    }
    net.minecraft.util.EnumWorldBlockLayer __stackOp2366_10_0 = forwardValue2366_29_0;
    java.lang.String __stackOp2366_10_1 = __sourceIntrinsic_62fa36bd0b64_invokedynamic2366_9(665, (9155381761862143055L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_62fa36bd0b64_invokedynamic2366_11(__stackOp2366_10_1, __stackOp2366_10_0))));
    return ((0) != 0);
}


private boolean j(java.lang.String p0) {
java.lang.String[] forwardValue2369_24_0;
    int forwardValue2369_41_0;
    java.lang.String[] spill2369_0;
    int spill2369_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_41: {
    forward_join_40: {
    forward_join_24: {
    forward_join_22: {
    life2_3 = (moom.Jc.F ^ 34080069400073L);
    life4_5 = moom.JM.b__Arrayr3();
    spill2369_0 = this.g;
    if (!((life4_5 != null))) {
        forwardValue2369_24_0 = spill2369_0;
        break forward_join_24;
    }
    if (!((spill2369_0 == null))) {
        break forward_join_22;
    }
    java.lang.String __stackOp2369_4_0 = p0;
    java.lang.String __stackOp2369_4_1 = __sourceIntrinsic_bf0deb06ab7c_invokedynamic2369_3(5263, (1002773212232497983L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_bf0deb06ab7c_invokedynamic2369_5(__stackOp2369_4_1, __stackOp2369_4_0))));
    return ((0) != 0);
    }
    forwardValue2369_24_0 = this.g;
    }
    spill2369_1 = (forwardValue2369_24_0).length;
    if (!((life4_5 != null))) {
        forwardValue2369_41_0 = spill2369_1;
        break forward_join_41;
    }
    if (!((spill2369_1 != 4))) {
        break forward_join_40;
    }
    java.lang.String __stackOp2369_10_0 = p0;
    java.lang.String __stackOp2369_10_1 = __sourceIntrinsic_bf0deb06ab7c_invokedynamic2369_9(3696, (3435644786275983788L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_bf0deb06ab7c_invokedynamic2369_11(__stackOp2369_10_1, __stackOp2369_10_0))));
    return ((0) != 0);
    }
    forwardValue2369_41_0 = 1;
    }
    return ((forwardValue2369_41_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_42(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_49(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_54(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_59(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_64(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_69(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_74(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_79(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_85(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_90(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_97(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_102(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_111(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_114(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_119(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_126(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_131(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_136(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_141(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_146(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_151(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_156(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_158(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_163(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_168(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_173(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_178(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d504841194cd2b_originalDynamicSite537_185(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8aebf151eadb_invokedynamic2340_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_599c5f800586_invokedynamic2343_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_599c5f800586_invokedynamic2343_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_599c5f800586_invokedynamic2343_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_599c5f800586_invokedynamic2343_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_599c5f800586_invokedynamic2343_12(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5273_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38d3ca5a5f50_invokedynamic851_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_38d3ca5a5f50_invokedynamic851_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38d3ca5a5f50_invokedynamic851_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38d3ca5a5f50_invokedynamic851_24(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38d3ca5a5f50_invokedynamic851_26(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38d3ca5a5f50_invokedynamic851_28(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_38d3ca5a5f50_invokedynamic851_32(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_08ac247e1343_invokedynamic853_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_08ac247e1343_invokedynamic853_7(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_08ac247e1343_invokedynamic853_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_08ac247e1343_invokedynamic853_9(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_08ac247e1343_invokedynamic853_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_08ac247e1343_invokedynamic853_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_08ac247e1343_invokedynamic853_25(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_08ac247e1343_invokedynamic853_27(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_08ac247e1343_invokedynamic853_29(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_357136e3a4c0_invokedynamic854_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_357136e3a4c0_invokedynamic854_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_357136e3a4c0_invokedynamic854_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_357136e3a4c0_invokedynamic854_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fa9b96cb207e_invokedynamic856_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic237_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic237_8(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic237_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic237_22(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic237_26(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic237_28(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_051b43f8cbc1_invokedynamic237_37(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic237_38(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic237_40(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic237_45(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic237_47(java.lang.String a0, int a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_051b43f8cbc1_invokedynamic237_51(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic237_52(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic237_54(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_051b43f8cbc1_invokedynamic237_58(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic237_59(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic237_61(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic237_80(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic237_82(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic237_85(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic237_87(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic237_90(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic237_92(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7d31a37a36f2_invokedynamic2353_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7d31a37a36f2_invokedynamic2353_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_10726c0df5f9_invokedynamic2354_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_10726c0df5f9_invokedynamic2354_7(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a9b1eb8ac462_invokedynamic858_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a9b1eb8ac462_invokedynamic858_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5241_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fafb7c06958a_invokedynamic859_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fafb7c06958a_invokedynamic859_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fafb7c06958a_invokedynamic859_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fafb7c06958a_invokedynamic859_15(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fafb7c06958a_invokedynamic859_29(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fafb7c06958a_invokedynamic859_32(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fafb7c06958a_invokedynamic859_36(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fafb7c06958a_invokedynamic859_37(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_34999ae2dcc3_invokedynamic2358_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_34999ae2dcc3_invokedynamic2358_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_34999ae2dcc3_invokedynamic2358_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_34999ae2dcc3_invokedynamic2358_10(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_98e46c5122cb_invokedynamic4380_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4176a183cc0f_invokedynamic2359_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4176a183cc0f_invokedynamic2359_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4176a183cc0f_invokedynamic2359_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4176a183cc0f_invokedynamic2359_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4176a183cc0f_invokedynamic2359_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4176a183cc0f_invokedynamic2359_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4176a183cc0f_invokedynamic2359_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4176a183cc0f_invokedynamic2359_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4176a183cc0f_invokedynamic2359_25(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4176a183cc0f_invokedynamic2359_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4176a183cc0f_invokedynamic2359_29(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4176a183cc0f_invokedynamic2359_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4176a183cc0f_invokedynamic2359_33(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4176a183cc0f_invokedynamic2359_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4176a183cc0f_invokedynamic2359_37(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4176a183cc0f_invokedynamic2359_38(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4176a183cc0f_invokedynamic2359_40(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4176a183cc0f_invokedynamic2359_42(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_157aaaf3c16d_invokedynamic2360_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_157aaaf3c16d_invokedynamic2360_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_157aaaf3c16d_invokedynamic2360_9(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0abc1caceeb7_invokedynamic2361_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0abc1caceeb7_invokedynamic2361_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0abc1caceeb7_invokedynamic2361_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0abc1caceeb7_invokedynamic2361_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0abc1caceeb7_invokedynamic2361_14(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0abc1caceeb7_invokedynamic2361_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_af7f005541ad_invokedynamic2362_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_af7f005541ad_invokedynamic2362_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_af7f005541ad_invokedynamic2362_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_af7f005541ad_invokedynamic2362_10(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_af7f005541ad_invokedynamic2362_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_af7f005541ad_invokedynamic2362_20(java.lang.String a0, net.minecraft.util.EnumWorldBlockLayer a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_bf2556b0defc_invokedynamic2363_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_bf2556b0defc_invokedynamic2363_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_bf2556b0defc_invokedynamic2363_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bf2556b0defc_invokedynamic2363_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_bf2556b0defc_invokedynamic2363_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_bf2556b0defc_invokedynamic2363_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_bf2556b0defc_invokedynamic2363_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bf2556b0defc_invokedynamic2363_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_bf2556b0defc_invokedynamic2363_23(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_bf2556b0defc_invokedynamic2363_26(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_bf2556b0defc_invokedynamic2363_29(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_bf2556b0defc_invokedynamic2363_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bf2556b0defc_invokedynamic2363_35(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_bf2556b0defc_invokedynamic2363_36(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_bf2556b0defc_invokedynamic2363_39(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_bf2556b0defc_invokedynamic2363_42(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_bf2556b0defc_invokedynamic2363_45(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_bf2556b0defc_invokedynamic2363_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bf2556b0defc_invokedynamic2363_51(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_bf2556b0defc_invokedynamic2363_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bf2556b0defc_invokedynamic2363_55(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_bf2556b0defc_invokedynamic2363_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bf2556b0defc_invokedynamic2363_59(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_bf2556b0defc_invokedynamic2363_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bf2556b0defc_invokedynamic2363_63(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_bf2556b0defc_invokedynamic2363_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bf2556b0defc_invokedynamic2363_67(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_bf2556b0defc_invokedynamic2363_68(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_bf2556b0defc_invokedynamic2363_70(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bf2556b0defc_invokedynamic2363_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bf2556b0defc_invokedynamic2363_73(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_85e729d079f8_invokedynamic2364_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_85e729d079f8_invokedynamic2364_11(java.lang.String a0, net.minecraft.util.EnumWorldBlockLayer a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9bd29ed03928_invokedynamic2365_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9bd29ed03928_invokedynamic2365_11(java.lang.String a0, net.minecraft.util.EnumWorldBlockLayer a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_62fa36bd0b64_invokedynamic2366_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_62fa36bd0b64_invokedynamic2366_11(java.lang.String a0, net.minecraft.util.EnumWorldBlockLayer a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_400848a2fc8a_invokedynamic2367_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_400848a2fc8a_invokedynamic2367_11(java.lang.String a0, net.minecraft.util.EnumWorldBlockLayer a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8a6f2c26bf9b_invokedynamic2368_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8a6f2c26bf9b_invokedynamic2368_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8a6f2c26bf9b_invokedynamic2368_9(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_bf0deb06ab7c_invokedynamic2369_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_bf0deb06ab7c_invokedynamic2369_5(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_bf0deb06ab7c_invokedynamic2369_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_bf0deb06ab7c_invokedynamic2369_11(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1ca29cda940c_invokedynamic2370_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1ca29cda940c_invokedynamic2370_5(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1ca29cda940c_invokedynamic2370_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1ca29cda940c_invokedynamic2370_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1ca29cda940c_invokedynamic2370_12(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_42c0cfad2bfc_invokedynamic2371_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_42c0cfad2bfc_invokedynamic2371_5(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_42c0cfad2bfc_invokedynamic2371_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_42c0cfad2bfc_invokedynamic2371_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_42c0cfad2bfc_invokedynamic2371_12(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cbfd0e191e19_invokedynamic860_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cbfd0e191e19_invokedynamic860_9(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cbfd0e191e19_invokedynamic860_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cbfd0e191e19_invokedynamic860_19(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cbfd0e191e19_invokedynamic860_36(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cbfd0e191e19_invokedynamic860_38(java.lang.String a0, int a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cbfd0e191e19_invokedynamic860_43(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cbfd0e191e19_invokedynamic860_46(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cbfd0e191e19_invokedynamic860_48(java.lang.String a0, int a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cbfd0e191e19_invokedynamic860_51(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cbfd0e191e19_invokedynamic860_53(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_60ddcc447474_invokedynamic2373_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_60ddcc447474_invokedynamic2373_5(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_60ddcc447474_invokedynamic2373_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_60ddcc447474_invokedynamic2373_11(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_60ddcc447474_invokedynamic2373_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_60ddcc447474_invokedynamic2373_17(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_60ddcc447474_invokedynamic2373_23(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_60ddcc447474_invokedynamic2373_25(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_569f6894d90a_invokedynamic2374_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_569f6894d90a_invokedynamic2374_5(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_569f6894d90a_invokedynamic2374_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ade936728fbb_invokedynamic2375_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ade936728fbb_invokedynamic2375_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ade936728fbb_invokedynamic2375_9(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1731_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1731_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1731_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1731_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1731_14(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, java.lang.String a5, java.lang.String a6, java.lang.String a7) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
