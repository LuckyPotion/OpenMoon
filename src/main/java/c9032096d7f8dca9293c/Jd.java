package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Jd {

private static java.util.Map[] a;

private static java.util.Map[] b;

private static java.util.Map[][] c;

private static moom.Jc[][] d;

private static moom.Jc[][] e;

private static boolean f;

public static net.minecraft.block.state.IBlockState g;

private static net.minecraft.client.renderer.texture.TextureAtlasSprite h;

private static moom.bK[] i;

private static moom.bK[] j;

private static moom.bK[] k;

private static moom.bK[] l;

private static moom.bK[] m;

private static moom.bK[] n;

private static moom.bK[] o;

private static moom.bK[] p;

private static moom.bK[] q;

private static moom.bK[] r;

private static moom.bK[] s;

private static moom.bK[] t;

private static moom.bK[] u;

private static moom.bK[] v;

private static moom.bK[] w;

private static moom.bK[] x;

public static net.minecraft.client.renderer.texture.TextureAtlasSprite y;

private static long z;

private static java.lang.String[] A;

private static java.lang.String[] B;

private static java.util.Map C;

private static long[] D;

private static java.lang.Integer[] E;

private static java.util.Map F;

public Jd() {
super();
}


static {
z = ((long)(((moom._a)(moom._c.a(((long)(-4629745616333252323L)), ((long)(2090388463807615052L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(77580444907652L)))));
    long local20_life6 = (moom.Jd.z ^ 15798271197705L);
    C = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life9;
    javax.crypto.Cipher __sourceSpill609_11 = (local11_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill609_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill609_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill609_14 = new byte[8];
    (__sourceSpill609_14)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local12_life15 = 1;
    while ((local12_life15 < 8)) {
        (__sourceSpill609_14)[local12_life15] = ((byte) ((int) ((local20_life6 << (local12_life15 * 8)) >>> 56)));
        local12_life15 += 1;
    }
    byte[] __sourcePreallocation609_16 = __sourceSpill609_14;
    ((javax.crypto.Cipher)(__sourceSpill609_11)).init(((int)(__sourceSpill609_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill609_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation609_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local18_life19 = new java.lang.String[47];
    int local16_life20 = 0;
    java.lang.String local15_life21;
    int local17_life23 = ((java.lang.String)((local15_life21 = "É\027³¯ØÂðv>æK7£® £º=øÐø(ufs\035\030õ±\021ês»K¹\037\021ËiÜv¯\"wö\031\007bÑq\020ÎØÎ\037n&ªÀþ!÷Ø\b\020\025f\031ù ¿¸%\032Ê8¸LÅb0]c\030àï1(r\021pG¦04Ç8%¥ýe*\017ênH:&ÈÞ<yÕGÌ±,³3|¾Ýäz\020¾ÿ%¸\"·\001\013\016ãÊØô\020\030b¹íÈ\034Lµ\b\001ð{\005\03012«\013\036Xç/¼8\027ap=Jîä,\006}\020QÀ\027ÇY¢l#]e\"å7þ\020¿HÈÀ\034ÆsØC\nÕuÊz¯0ê¸\025Y!ÞïñqMm¨?Éw°\f £+ár\016#Ü'NB,@ì\026¶\021ïþ\004U`Jðä\025¼\020Ùr}¶öÉA!ò¼n?Û\020X÷¯ºÌÐ\nÑc_\035x\0310ºX¹p >\007\016fäÞoöÇmä^Äi¾v`Öôò\025\023þøÅK*Twæ¡Fç\030CæÒNÀlã'ð\022«æRô,«@H< qÑzÜ\\ÿ@¬\013°*/+\024\017ûLò\n&7ü4¼rèµ\017üöQòvdÝÝTGÆ\007ÜmþOí¹¬M(4Y\034WcT\"¬±?\004Á<II(;.Kv¦\033bþ\013¡G\\¬«ðçr°(xÎ+ÍÆ4m£\023\031u»¨Ü\n\\(ó´+Õõ\017\033éúÎ£9Gÿ\nÍ¦\017o8l\022,É\032FÝÖtÃê#4Ãt;\020W½¼PK\\U§\007ÛHic\020¬Ã\022z§²¦Æ\nÌ\002![½j\020\013uq\013ìðçQ¼ôQJÿ\000è(Ù.RÕDòx&\005-\037£O~\032EÄÇ-à©ÑÑ\025\004ò\"ä8§-/tj\006È\030·ÌëË\020÷ü¤1\033Uiñ½\005\034ö\033<Î:(\004\024!»\004Ó\027(±»¸h-\000\177-µ¿gvÕª\032v\032/ª mç%ÄÎV;ù¹\020»ß\030Ìb\r\"\000UF¬¬\020õ­4\034\0178}&Ôù|x(c@)ä2éÌ\036³£)W\037*8v+¢Mé¹ô18cÈP(\032Ñ¥É±î6D8\020ë£<}^Jpý¡{ýsF\032jL3Ú\005Iµü\030Þ-6§ÆÂCüûÚ2yê{h×I¼¦¿¹Ü6Pý¼(wV\020ù\002\177[ÚRg¤ÊÀpµÈ\035Aq6\031ì[sÀ¾\023âóºíåA\033é\021\020\013ÀMBÃD>\030t¡Úª/<ö ºJóD\034½Ã\fÞðÈ`­¿\177¹<©d\b¨aTH=²6A(¼\006*ÿ_sK\0305WD¢\035fQ\007pI\tGokyO`×qûå-^¢\002ïð(ÖÔEM\r4C\te\036VÊV¢Z·\016Cß_YÐ0tî±\033$Ì,\"ÉlM#:X8°(½sÓÁl§èßHóíDy]ÓI2X²Gé±µQQ\033x:\005ÔP×b-|}ó\036F^K[jIeppAHÿ é'u),î£\004\037'\"·\fç¨ÔÛ\"Ü °VÁÛëØé\037ÞÓ\036\021J¢J|Wò!Ü½r;·ãçZ_´P¾²¤\n$È(x\rDa\020Á¡u t½Ó\r^°:/q-ù(U »ñÐ\177\005v\\L½=ø¸ÊÝ[BÔ\003\037q\031\033#n:ºRñ>K0·±*\021Òë®Ëðöndümr\002·«\037L³æy»«úR\032ù[yÍÝ0Øæ4£,tµ$ Ü0¸J²V+ÎÏ\036ÕÚðû´¨ìY\004­dÍT>?õ\032\b\020&\020ª®\023X?3\\Ýïu¬d\006'\030î5©\177TÇè\004á\034å#¡Kp`#ù¥Ë\020\024\022yÇø¥O\003+ BÂtéâ ]hÜn×¢åWmeÜ2xh%Ðä¢\003º\007g}ó\\á _\025Ê¼\026)1Á«¬Çä,s¬õÀ_âÜ5S\037Gº[Äsd³@ÏÄ\b\"XP]^øÞ~\004éHô\001½Ñû¿í¢ï\035ózPüú\027ÿêM\016\032\016ÑþÅ\003R-Àû:2^Üat=Ös+"))).length();
    int local14_life24 = 32;
    int local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill609_28 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill609_29 = local11_life9;
        byte[] local19_life31 = ((javax.crypto.Cipher)(__sourceSpill609_29)).doFinal(((byte[])(__sourceSpill609_28)));
        java.lang.String __sourceSpill609_34 = ((java.lang.String)(moom.Jd.a(((byte[])(local19_life31))))).intern();
        java.lang.String[] __sourceSpill609_35 = local18_life19;
        int __sourceSpill609_36 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill609_35)[__sourceSpill609_36] = __sourceSpill609_34;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    local17_life23 = ((java.lang.String)((local15_life21 = "\013}ehv=r_TÎ+]ð\020x\026Ø¿Öâ Ö.[ògt\004LI"))).length();
    local14_life24 = 16;
    local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill609_41 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill609_42 = local11_life9;
        byte[] local19_life44 = ((javax.crypto.Cipher)(__sourceSpill609_42)).doFinal(((byte[])(__sourceSpill609_41)));
        java.lang.String __sourceSpill609_47 = ((java.lang.String)(moom.Jd.a(((byte[])(local19_life44))))).intern();
        java.lang.String[] __sourceSpill609_48 = local18_life19;
        int __sourceSpill609_49 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill609_48)[__sourceSpill609_49] = __sourceSpill609_47;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    A = ((java.lang.String[])(local18_life19));
    B = ((java.lang.String[])(new java.lang.String[47]));
    F = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill609_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill609_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill609_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill609_60 = new byte[8];
    (__sourceSpill609_60)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill609_60)[local1_life61] = ((byte) ((int) ((local20_life6 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation609_62 = __sourceSpill609_60;
    ((javax.crypto.Cipher)(__sourceSpill609_57)).init(((int)(__sourceSpill609_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill609_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation609_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[60];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "\027\"vïeHUâyíB*Á\020Ópåô4~4æCÙ02ö9!iÒ\034¬ANÑw$îaK<:ôF<9ÅÙ}úËßB}´¤\033\025BU¿«[\030\177Ã\0254|Èp\0330&GH\002ø#ó¹\000\013\034kéz\023Ú³\f¦3·ö\013­\032z¾·ü¡v\f¥xÊÍh\023÷ó1/àØ£\034\026dx\001\bWÎìFHÖçK}Q\037Ë{\tu­ÒñD¯Ó?fßm(U¬¡¤hó\026\022\f_Ì%EtÀ»GÄQý&Ø]´3~Z]»øÂSÖR\021øÕ\036ù1Ò=Ãù,rª]\037½R®è'O;wãAq²Oÿ!Á20\005Ä§·Y\\â\tù_ül&ppQ\031a\024Å\013wì¹#ô3)6d\025&I{vÐrY«\026\022\003dò ^.\006\020øèoõk¹ ß\027\030éïe+\0310¼¾&B.\005©ô!ø \025?ÉE\034=ÊÉúûeE:&zÀ\rJ\r!3øq#å¾Q¶ÐlL>8Â£é\035úIÞÁ?Òâ!é\032\026 33\017Ë\003¾¥°KAÊ]ÝgØr²3\bØd[Æá«Äí\021Áü|ÇÄ\003\f³k®gE_w®\\GJàõ&È#Hh;\005\004Ü¾nAµ1«"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill609_71 = local4_life67;
        int __sourceSpill609_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill609_71)).substring(((int)(__sourceSpill609_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill609_76 = local6_life65;
        int __sourceSpill609_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill609_79 = new byte[8];
        (__sourceSpill609_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill609_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill609_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill609_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill609_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill609_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill609_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill609_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill609_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill609_80)).doFinal(((byte[])(__sourceSpill609_79)));
        (__sourceSpill609_76)[__sourceSpill609_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "ìÍO.úØ}Y0H~×\b"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill609_84 = local4_life67;
        int __sourceSpill609_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill609_84)).substring(((int)(__sourceSpill609_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill609_89 = local6_life65;
        int __sourceSpill609_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill609_92 = new byte[8];
        (__sourceSpill609_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill609_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill609_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill609_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill609_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill609_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill609_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill609_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill609_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill609_93)).doFinal(((byte[])(__sourceSpill609_92)));
        (__sourceSpill609_89)[__sourceSpill609_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    D = ((long[])(local6_life65));
    E = ((java.lang.Integer[])(new java.lang.Integer[60]));
    a = ((java.util.Map[])(null));
    b = ((java.util.Map[])(null));
    c = ((java.util.Map[][])(null));
    d = ((moom.Jc[][])(null));
    e = ((moom.Jc[][])(null));
    f = ((boolean)(false));
    g = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE()));
    h = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(null));
    moom.bK[] __sourceSpill609_109 = new moom.bK[4];
    (__sourceSpill609_109)[0] = moom.bK.WEST;
    (__sourceSpill609_109)[1] = moom.bK.EAST;
    (__sourceSpill609_109)[2] = moom.bK.NORTH;
    (__sourceSpill609_109)[3] = moom.bK.SOUTH;
    i = ((moom.bK[])(__sourceSpill609_109));
    moom.bK[] __sourceSpill609_115 = new moom.bK[4];
    (__sourceSpill609_115)[0] = moom.bK.WEST;
    (__sourceSpill609_115)[1] = moom.bK.EAST;
    (__sourceSpill609_115)[2] = moom.bK.SOUTH;
    (__sourceSpill609_115)[3] = moom.bK.NORTH;
    j = ((moom.bK[])(__sourceSpill609_115));
    moom.bK[] __sourceSpill609_121 = new moom.bK[4];
    (__sourceSpill609_121)[0] = moom.bK.EAST;
    (__sourceSpill609_121)[1] = moom.bK.WEST;
    (__sourceSpill609_121)[2] = moom.bK.DOWN;
    (__sourceSpill609_121)[3] = moom.bK.UP;
    k = ((moom.bK[])(__sourceSpill609_121));
    moom.bK[] __sourceSpill609_127 = new moom.bK[4];
    (__sourceSpill609_127)[0] = moom.bK.WEST;
    (__sourceSpill609_127)[1] = moom.bK.EAST;
    (__sourceSpill609_127)[2] = moom.bK.DOWN;
    (__sourceSpill609_127)[3] = moom.bK.UP;
    l = ((moom.bK[])(__sourceSpill609_127));
    moom.bK[] __sourceSpill609_133 = new moom.bK[4];
    (__sourceSpill609_133)[0] = moom.bK.NORTH;
    (__sourceSpill609_133)[1] = moom.bK.SOUTH;
    (__sourceSpill609_133)[2] = moom.bK.DOWN;
    (__sourceSpill609_133)[3] = moom.bK.UP;
    m = ((moom.bK[])(__sourceSpill609_133));
    moom.bK[] __sourceSpill609_139 = new moom.bK[4];
    (__sourceSpill609_139)[0] = moom.bK.SOUTH;
    (__sourceSpill609_139)[1] = moom.bK.NORTH;
    (__sourceSpill609_139)[2] = moom.bK.DOWN;
    (__sourceSpill609_139)[3] = moom.bK.UP;
    n = ((moom.bK[])(__sourceSpill609_139));
    moom.bK[] __sourceSpill609_145 = new moom.bK[4];
    (__sourceSpill609_145)[0] = moom.bK.WEST;
    (__sourceSpill609_145)[1] = moom.bK.EAST;
    (__sourceSpill609_145)[2] = moom.bK.UP;
    (__sourceSpill609_145)[3] = moom.bK.DOWN;
    o = ((moom.bK[])(__sourceSpill609_145));
    moom.bK[] __sourceSpill609_151 = new moom.bK[4];
    (__sourceSpill609_151)[0] = moom.bK.NORTH;
    (__sourceSpill609_151)[1] = moom.bK.SOUTH;
    (__sourceSpill609_151)[2] = moom.bK.UP;
    (__sourceSpill609_151)[3] = moom.bK.DOWN;
    p = ((moom.bK[])(__sourceSpill609_151));
    moom.bK[] __sourceSpill609_157 = new moom.bK[4];
    (__sourceSpill609_157)[0] = moom.bK.NORTH_EAST;
    (__sourceSpill609_157)[1] = moom.bK.NORTH_WEST;
    (__sourceSpill609_157)[2] = moom.bK.SOUTH_EAST;
    (__sourceSpill609_157)[3] = moom.bK.SOUTH_WEST;
    q = ((moom.bK[])(__sourceSpill609_157));
    moom.bK[] __sourceSpill609_163 = new moom.bK[4];
    (__sourceSpill609_163)[0] = moom.bK.SOUTH_EAST;
    (__sourceSpill609_163)[1] = moom.bK.SOUTH_WEST;
    (__sourceSpill609_163)[2] = moom.bK.NORTH_EAST;
    (__sourceSpill609_163)[3] = moom.bK.NORTH_WEST;
    r = ((moom.bK[])(__sourceSpill609_163));
    moom.bK[] __sourceSpill609_169 = new moom.bK[4];
    (__sourceSpill609_169)[0] = moom.bK.DOWN_WEST;
    (__sourceSpill609_169)[1] = moom.bK.DOWN_EAST;
    (__sourceSpill609_169)[2] = moom.bK.UP_WEST;
    (__sourceSpill609_169)[3] = moom.bK.UP_EAST;
    s = ((moom.bK[])(__sourceSpill609_169));
    moom.bK[] __sourceSpill609_175 = new moom.bK[4];
    (__sourceSpill609_175)[0] = moom.bK.DOWN_EAST;
    (__sourceSpill609_175)[1] = moom.bK.DOWN_WEST;
    (__sourceSpill609_175)[2] = moom.bK.UP_EAST;
    (__sourceSpill609_175)[3] = moom.bK.UP_WEST;
    t = ((moom.bK[])(__sourceSpill609_175));
    moom.bK[] __sourceSpill609_181 = new moom.bK[4];
    (__sourceSpill609_181)[0] = moom.bK.DOWN_SOUTH;
    (__sourceSpill609_181)[1] = moom.bK.DOWN_NORTH;
    (__sourceSpill609_181)[2] = moom.bK.UP_SOUTH;
    (__sourceSpill609_181)[3] = moom.bK.UP_NORTH;
    u = ((moom.bK[])(__sourceSpill609_181));
    moom.bK[] __sourceSpill609_187 = new moom.bK[4];
    (__sourceSpill609_187)[0] = moom.bK.DOWN_NORTH;
    (__sourceSpill609_187)[1] = moom.bK.DOWN_SOUTH;
    (__sourceSpill609_187)[2] = moom.bK.UP_NORTH;
    (__sourceSpill609_187)[3] = moom.bK.UP_SOUTH;
    v = ((moom.bK[])(__sourceSpill609_187));
    moom.bK[] __sourceSpill609_193 = new moom.bK[4];
    (__sourceSpill609_193)[0] = moom.bK.UP_EAST;
    (__sourceSpill609_193)[1] = moom.bK.UP_WEST;
    (__sourceSpill609_193)[2] = moom.bK.DOWN_EAST;
    (__sourceSpill609_193)[3] = moom.bK.DOWN_WEST;
    w = ((moom.bK[])(__sourceSpill609_193));
    moom.bK[] __sourceSpill609_199 = new moom.bK[4];
    (__sourceSpill609_199)[0] = moom.bK.UP_SOUTH;
    (__sourceSpill609_199)[1] = moom.bK.UP_NORTH;
    (__sourceSpill609_199)[2] = moom.bK.DOWN_SOUTH;
    (__sourceSpill609_199)[3] = moom.bK.DOWN_NORTH;
    x = ((moom.bK[])(__sourceSpill609_199));
    y = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(new net.minecraft.client.renderer.texture.TextureAtlasSprite(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite609_204(4296, (2614822654189292375L ^ local20_life6)))));
}

private static native <E extends Throwable> boolean __sourceHandlerCall_00037f592a669492c948() throws E;
private static final class __SourceHandler_00037f592a669492c948 {

public static boolean f680() throws Throwable {
    moom.Jc[] lexicalValue680_71_0;
    net.minecraft.client.renderer.texture.TextureAtlasSprite[] lexicalValue680_109_0;
    int lexicalValue680_129_0;
    int lexicalValue680_131_0;
    net.minecraft.entity.Entity[] spill680_0;
    moom.Jc[] spill680_1;
    moom.Jc[] spill680_2;
    net.minecraft.client.renderer.texture.TextureAtlasSprite[] spill680_3;
    boolean spill680_4;
    long life0_3;
    java.util.ArrayList life3_8;
    net.minecraft.entity.Entity[] life2_9;
    moom.Jc[][] life4_11;
    int life5_14;
    int life6_16;
    moom.Jc[] life7_23;
    moom.Jc[][] life4_48;
    int life5_51;
    int life6_53;
    moom.Jc[] life7_60;
    moom.Jc[] life4_89;
    java.util.HashSet life5_93;
    java.util.HashSet life6_97;
    moom.Jc[] life7_99;
    int life8_102;
    int life9_104;
    moom.Jc life10_111;
    lexical_join_131: {
    lexical_join_130: {
    lexical_join_129: {
    lexical_join_123: {
    lexical_join_119: {
    lexical_join_71: {
    lexical_join_66: {
    lexical_join_38: {
    life0_3 = (__fieldRead680_0() ^ 13075833710912L);
    spill680_0 = __call680_1();
    life3_8 = new java.util.ArrayList();
    life2_9 = spill680_0;
    life4_11 = __fieldRead680_2();
    life5_14 = (life4_11).length;
    life6_16 = 0;
    lexical_cycle_17: while (true) {
    lexical_join_36: {
    lexical_join_35: {
    if (!((life6_16 < life5_14))) {
        break lexical_join_38;
    }
    life7_23 = (life4_11)[life6_16];
    if (!((life2_9 != null))) {
        break lexical_join_36;
    }
    spill680_1 = life7_23;
    if (!((life2_9 != null))) {
        lexicalValue680_71_0 = spill680_1;
        break lexical_join_71;
    }
    if (!((spill680_1 != null))) {
        break lexical_join_35;
    }
    __call680_4(life3_8, __call680_3(life7_23));
    }
    life6_16 += 1;
    }
    if (!((life2_9 == null))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    life4_48 = __fieldRead680_5();
    life5_51 = (life4_48).length;
    life6_53 = 0;
    lexical_cycle_45: while (true) {
    lexical_join_64: {
    lexical_join_63: {
    if (!((life6_53 < life5_51))) {
        break lexical_join_66;
    }
    life7_60 = (life4_48)[life6_53];
    if (!((life2_9 != null))) {
        break lexical_join_64;
    }
    spill680_2 = life7_60;
    if (!((life2_9 != null))) {
        lexicalValue680_71_0 = spill680_2;
        break lexical_join_71;
    }
    if (!((spill680_2 != null))) {
        break lexical_join_63;
    }
    __call680_7(life3_8, __call680_6(life7_60));
    }
    life6_53 += 1;
    }
    if (!((life2_9 == null))) { continue lexical_cycle_45; }
    break lexical_cycle_45;
    }
    }
    lexicalValue680_71_0 = __cast680_9(__call680_8(life3_8, new moom.Jc[0]));
    }
    life4_89 = lexicalValue680_71_0;
    life5_93 = new java.util.HashSet();
    life6_97 = new java.util.HashSet();
    life7_99 = life4_89;
    life8_102 = (life7_99).length;
    life9_104 = 0;
    lexical_cycle_87: while (true) {
    lexical_join_116: {
    lexical_join_109: {
    lexical_join_107: {
    if (!((life9_104 < life8_102))) {
        break lexical_join_119;
    }
    life10_111 = (life7_99)[life9_104];
    if (!((life2_9 != null))) {
        break lexical_join_123;
    }
    spill680_3 = __fieldRead680_10(life10_111);
    if (!((life2_9 != null))) {
        lexicalValue680_109_0 = spill680_3;
        break lexical_join_109;
    }
    if (!((spill680_3 != null))) {
        break lexical_join_107;
    }
    __call680_13(life5_93, __call680_12(__fieldRead680_11(life10_111)));
    }
    lexicalValue680_109_0 = __fieldRead680_14(life10_111);
    }
    if (!((lexicalValue680_109_0 != null))) {
        break lexical_join_116;
    }
    __call680_17(life6_97, __call680_16(__fieldRead680_15(life10_111)));
    }
    life9_104 += 1;
    if (!((life2_9 == null))) { continue lexical_cycle_87; }
    break lexical_cycle_87;
    }
    }
    __call680_18(life5_93, life6_97);
    }
    spill680_4 = __call680_19(life5_93);
    if (!((life2_9 != null))) {
        lexicalValue680_129_0 = __integerCategory680_20(spill680_4);
        break lexical_join_129;
    }
    if (!((!spill680_4))) {
        break lexical_join_130;
    }
    lexicalValue680_129_0 = 1;
    }
    lexicalValue680_131_0 = lexicalValue680_129_0;
    break lexical_join_131;
    }
    lexicalValue680_131_0 = 0;
    }
    return __integerCategory680_21(lexicalValue680_131_0);
}
public static void h680_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068000_0(p0);
}
public static void h680_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068001_0(p0);
}
public static void h680_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068002_0(p0);
}
public static void h680_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068003_0(p0);
}
public static void h680_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068004_0(p0);
}
public static void h680_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068005_0(p0);
}
public static void h680_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068006_0(p0);
}
public static void h680_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068007_0(p0);
}
public static void h680_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068008_0(p0);
}
public static void h680_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068009_0(p0);
}
public static void h680_10(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068010_0(p0);
}
private static native long __fieldRead680_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call680_1() throws Throwable;
private static native moom.Jc[][] __fieldRead680_2() throws Throwable;
private static native java.util.List __call680_3(moom.Jc[] a0) throws Throwable;
private static native boolean __call680_4(java.util.ArrayList a0, java.util.List a1) throws Throwable;
private static native moom.Jc[][] __fieldRead680_5() throws Throwable;
private static native java.util.List __call680_6(moom.Jc[] a0) throws Throwable;
private static native boolean __call680_7(java.util.ArrayList a0, java.util.List a1) throws Throwable;
private static native java.lang.Object[] __call680_8(java.util.ArrayList a0, moom.Jc[] a1) throws Throwable;
private static native moom.Jc[] __cast680_9(java.lang.Object[] a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead680_10(moom.Jc a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead680_11(moom.Jc a0) throws Throwable;
private static native java.util.List __call680_12(net.minecraft.client.renderer.texture.TextureAtlasSprite[] a0) throws Throwable;
private static native boolean __call680_13(java.util.HashSet a0, java.util.List a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead680_14(moom.Jc a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead680_15(moom.Jc a0) throws Throwable;
private static native java.util.List __call680_16(net.minecraft.client.renderer.texture.TextureAtlasSprite[] a0) throws Throwable;
private static native boolean __call680_17(java.util.HashSet a0, java.util.List a1) throws Throwable;
private static native boolean __call680_18(java.util.HashSet a0, java.util.HashSet a1) throws Throwable;
private static native boolean __call680_19(java.util.HashSet a0) throws Throwable;
private static native int __integerCategory680_20(boolean value) throws Throwable;
private static native boolean __integerCategory680_21(int value) throws Throwable;
private static native java.lang.Exception __call1068000_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068001_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068002_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068003_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068004_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068005_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068006_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068007_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068008_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068009_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068010_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> moom.bs __sourceHandlerCall_611c91cc7955f3ba0816(int a0) throws E;
private static final class __SourceHandler_611c91cc7955f3ba0816 {

public static moom.bs f1211(int p0) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead1211_0() ^ 3537939616561L);
    switch (p0) {
case 0:
{
        return __fieldRead1211_1();
    }
case 2:
{
        return __fieldRead1211_2();
    }
case 3:
{
        return __fieldRead1211_3();
    }
case 4:
{
        return __fieldRead1211_4();
    }
case 5:
{
        return __fieldRead1211_5();
    }
case 1:
default:
{
        return __fieldRead1211_6();
    }
}
}
public static void h1211_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1121100_0(p0);
}
private static native long __fieldRead1211_0() throws Throwable;
private static native moom.bs __fieldRead1211_1() throws Throwable;
private static native moom.bs __fieldRead1211_2() throws Throwable;
private static native moom.bs __fieldRead1211_3() throws Throwable;
private static native moom.bs __fieldRead1211_4() throws Throwable;
private static native moom.bs __fieldRead1211_5() throws Throwable;
private static native moom.bs __fieldRead1211_6() throws Throwable;
private static native java.lang.Exception __call1121100_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_6c267aefb62426dad0fc(int a0, int a1) throws E;
private static final class __SourceHandler_6c267aefb62426dad0fc {

public static int f700(int p0, int p1) throws Throwable {
    int forestValue700_23_0;
    int forestValue700_37_0;
    int forestValue700_39_0;
    int spill700_0;
    int spill700_1;
    int spill700_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forest_join_39: {
    forest_join_38: {
    forest_join_37: {
    forest_join_36: {
    forest_join_34: {
    forest_join_32: {
    forest_join_30: {
    forest_join_28: {
    forest_join_24: {
    forest_join_23: {
    forest_join_22: {
    forest_join_20: {
    forest_join_18: {
    forest_join_16: {
    forest_join_14: {
    forest_join_10: {
    life2_3 = (__fieldRead700_0() ^ 97485557843667L);
    life4_5 = __call700_1();
    spill700_0 = p1;
    if (!((life4_5 != null))) {
        forestValue700_39_0 = spill700_0;
        break forest_join_39;
    }
    switch (spill700_0) {
case 1:
{
        break forest_join_10;
    }
case 2:
{
        break forest_join_24;
    }
default:
{
        break forest_join_38;
    }
}
    }
    spill700_1 = p0;
    if (!((life4_5 != null))) {
        forestValue700_23_0 = spill700_1;
        break forest_join_23;
    }
    switch (spill700_1) {
case 0:
{
        break forest_join_14;
    }
case 1:
{
        break forest_join_16;
    }
case 2:
{
        break forest_join_18;
    }
case 3:
{
        break forest_join_20;
    }
default:
{
        break forest_join_22;
    }
}
    }
    return 2;
    }
    return 3;
    }
    return 1;
    }
    return 0;
    }
    forestValue700_23_0 = p0;
    }
    return forestValue700_23_0;
    }
    spill700_2 = p0;
    if (!((life4_5 != null))) {
        forestValue700_37_0 = spill700_2;
        break forest_join_37;
    }
    switch (spill700_2) {
case 0:
{
        break forest_join_28;
    }
case 1:
{
        break forest_join_30;
    }
case 2:
case 3:
default:
{
        break forest_join_32;
    }
case 4:
{
        break forest_join_34;
    }
case 5:
{
        break forest_join_36;
    }
}
    }
    return 4;
    }
    return 5;
    }
    return p0;
    }
    return 1;
    }
    forestValue700_37_0 = 0;
    }
    return forestValue700_37_0;
    }
    forestValue700_39_0 = p0;
    }
    return forestValue700_39_0;
}
public static int h700_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070000_0(p0);
}
public static int h700_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070001_0(p0);
}
public static int h700_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070002_0(p0);
}
public static int h700_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070003_0(p0);
}
public static int h700_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070004_0(p0);
}
public static int h700_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070005_0(p0);
}
private static native long __fieldRead700_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call700_1() throws Throwable;
private static native java.lang.Exception __call3070000_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070001_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070002_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070003_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070004_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070005_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> moom.Jc[][] __sourceHandlerCall_284fe5892a72b60fc6f1(java.util.List a0) throws E;
private static final class __SourceHandler_284fe5892a72b60fc6f1 {

public static moom.Jc[][] f681(java.util.List p0) throws Throwable {
    net.minecraft.entity.Entity[] spill681_0;
    long life1_3;
    moom.Jc[][] life4_8;
    int life5_10;
    net.minecraft.entity.Entity[] life3_11;
    java.util.List life6_20;
    moom.Jc[] life7_33;
    lexical_join_38: {
    life1_3 = (__fieldRead681_0() ^ 90222835598335L);
    spill681_0 = __call681_1();
    life4_8 = new moom.Jc[__call681_2(p0)][];
    life5_10 = 0;
    life3_11 = spill681_0;
    lexical_cycle_12: while (true) {
    lexical_join_36: {
    lexical_join_35: {
    if (!((life5_10 < __call681_3(p0)))) {
        break lexical_join_38;
    }
    life6_20 = __cast681_5(__call681_4(p0, life5_10));
    if (!((life3_11 != null))) {
        break lexical_join_36;
    }
    if (!((life6_20 != null))) {
        break lexical_join_35;
    }
    life7_33 = __cast681_7(__call681_6(life6_20, new moom.Jc[0]));
    (life4_8)[life5_10] = life7_33;
    }
    life5_10 += 1;
    }
    if (!((life3_11 == null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    return life4_8;
}
public static void h681_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068100_0(p0);
}
private static native long __fieldRead681_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call681_1() throws Throwable;
private static native int __call681_2(java.util.List a0) throws Throwable;
private static native int __call681_3(java.util.List a0) throws Throwable;
private static native java.lang.Object __call681_4(java.util.List a0, int a1) throws Throwable;
private static native java.util.List __cast681_5(java.lang.Object a0) throws Throwable;
private static native java.lang.Object[] __call681_6(java.util.List a0, moom.Jc[] a1) throws Throwable;
private static native moom.Jc[] __cast681_7(java.lang.Object[] a0) throws Throwable;
private static native java.lang.Exception __call1068100_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_be624a1c5208d8bcd6a3(moom.Jc a0, java.util.List a1) throws E;
private static final class __SourceHandler_be624a1c5208d8bcd6a3 {

public static void f73(moom.Jc p0, java.util.List p1) throws Throwable {
    int lexicalValue73_48_0;
    int lexicalValue73_54_0;
    int spill73_0;
    java.lang.String spill73_1;
    net.minecraft.client.renderer.texture.TextureAtlasSprite spill73_2;
    java.lang.String spill73_3;
    int spill73_4;
    java.lang.String spill73_5;
    int spill73_6;
    java.lang.String spill73_7;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    int life5_10;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life6_20;
    int life7_57;
    lexical_join_80: {
    life2_3 = (__fieldRead73_0() ^ 20510217581793L);
    life4_5 = __call73_1();
    if (!((__fieldRead73_2(p0) != null))) {
        break lexical_join_80;
    }
    life5_10 = 0;
    lexical_cycle_11: while (true) {
    lexical_join_77: {
    lexical_join_73: {
    lexical_join_54: {
    lexical_join_48: {
    lexical_join_46: {
    if (!((life5_10 < (__fieldRead73_3(p0)).length))) {
        break lexical_join_80;
    }
    life6_20 = (__fieldRead73_4(p0))[life5_10];
    spill73_0 = __instanceOf73_5(life6_20);
    if (!((life4_5 != null))) {
        lexicalValue73_48_0 = spill73_0;
        break lexical_join_48;
    }
    if (!((spill73_0 == 0))) {
        break lexical_join_46;
    }
    net.minecraft.client.renderer.texture.TextureAtlasSprite __stackOp73_8_0 = life6_20;
    java.lang.String __stackOp73_8_1 = __call73_6(life6_20);
    java.lang.String __stackOp73_8_2 = __invokedynamic73_7(7639, (5099179269126074532L ^ life2_3));
    spill73_1 = __stackOp73_8_2;
    spill73_2 = __stackOp73_8_0;
    spill73_3 = __stackOp73_8_1;
    __discardScalar73_9(__stackOp73_8_2);
    java.lang.String __stackOp73_11_0 = spill73_3;
    java.lang.String __stackOp73_11_1 = __invokedynamic73_10(14009, (2139206848329849854L ^ life2_3));
    __call73_13(__invokedynamic73_12(spill73_1, spill73_2, __stackOp73_11_1, __stackOp73_11_0));
    if (!((life4_5 == null))) {
        break lexical_join_77;
    }
    }
    lexicalValue73_48_0 = __call73_14(life6_20);
    }
    life7_57 = lexicalValue73_48_0;
    spill73_4 = life7_57;
    if (!((life4_5 != null))) {
        lexicalValue73_54_0 = spill73_4;
        break lexical_join_54;
    }
    if (!((spill73_4 < 0))) {
        break lexical_join_73;
    }
    lexicalValue73_54_0 = life7_57;
    }
    int __stackOp73_17_0 = lexicalValue73_54_0;
    java.lang.String __stackOp73_17_1 = __call73_15(life6_20);
    java.lang.String __stackOp73_17_2 = __invokedynamic73_16(18093, (5063369910455725024L ^ life2_3));
    spill73_5 = __stackOp73_17_2;
    spill73_6 = __stackOp73_17_0;
    spill73_7 = __stackOp73_17_1;
    __discardScalar73_18(__stackOp73_17_2);
    java.lang.String __stackOp73_20_0 = spill73_7;
    java.lang.String __stackOp73_20_1 = __invokedynamic73_19(2370, (1587500434466120722L ^ life2_3));
    __call73_22(__invokedynamic73_21(spill73_5, spill73_6, __stackOp73_20_1, __stackOp73_20_0));
    if (!((life4_5 == null))) {
        break lexical_join_77;
    }
    }
    __call73_23(p0, p1, life7_57);
    }
    life5_10 += 1;
    if (!((life4_5 == null))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    return;
}
public static void h73_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007300_0(p0);
}
public static void h73_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007301_0(p0);
}
public static void h73_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007302_0(p0);
}
public static void h73_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007303_0(p0);
}
public static void h73_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007304_0(p0);
}
private static native long __fieldRead73_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call73_1() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead73_2(moom.Jc a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead73_3(moom.Jc a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead73_4(moom.Jc a0) throws Throwable;
private static native int __instanceOf73_5(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.String __call73_6(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.String __invokedynamic73_7(int a0, long a1) throws Throwable;
private static native void __discardScalar73_9(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic73_10(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic73_12(java.lang.String a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native void __call73_13(java.lang.String a0) throws Throwable;
private static native int __call73_14(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.String __call73_15(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.String __invokedynamic73_16(int a0, long a1) throws Throwable;
private static native void __discardScalar73_18(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic73_19(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic73_21(java.lang.String a0, int a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native void __call73_22(java.lang.String a0) throws Throwable;
private static native void __call73_23(moom.Jc a0, java.util.List a1, int a2) throws Throwable;
private static native java.lang.Exception __call1007300_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1007301_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1007302_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1007303_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1007304_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_edc6f7aa6acea46d26d8(moom.Jc a0, java.util.List a1, int a2) throws E;
private static final class __SourceHandler_edc6f7aa6acea46d26d8 {

public static void f38(moom.Jc p0, java.util.List p1, int p2) throws Throwable {
    java.util.List forestValue38_22_0;
    java.util.List forestValue38_37_0;
    java.util.List spill38_0;
    java.util.List spill38_1;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    java.util.List life6_28;
    forest_join_37: {
    forest_join_36: {
    forest_join_22: {
    forest_join_18: {
    life3_3 = (__fieldRead38_0() ^ 108817721305653L);
    life5_5 = __call38_1();
    forest_cycle_6: while (true) {
    if (!((p2 >= __call38_2(p1)))) {
        break forest_join_18;
    }
    spill38_0 = p1;
    if (!((life5_5 != null))) {
        forestValue38_22_0 = spill38_0;
        break forest_join_22;
    }
    __call38_3(spill38_0, null);
    if (!((life5_5 == null))) {
        continue forest_cycle_6;
    }
    break forest_cycle_6;
    }
    }
    forestValue38_22_0 = __cast38_5(__call38_4(p1, p2));
    }
    life6_28 = forestValue38_22_0;
    spill38_1 = life6_28;
    if (!((life5_5 != null))) {
        forestValue38_37_0 = spill38_1;
        break forest_join_37;
    }
    if (!((spill38_1 == null))) {
        break forest_join_36;
    }
    life6_28 = new java.util.ArrayList();
    __call38_6(p1, p2, life6_28);
    }
    forestValue38_37_0 = life6_28;
    }
    __call38_7(forestValue38_37_0, p0);
    return;
}
public static void h38_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3003800_0(p0);
}
public static void h38_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3003801_0(p0);
}
private static native long __fieldRead38_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call38_1() throws Throwable;
private static native int __call38_2(java.util.List a0) throws Throwable;
private static native boolean __call38_3(java.util.List a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Object __call38_4(java.util.List a0, int a1) throws Throwable;
private static native java.util.List __cast38_5(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call38_6(java.util.List a0, int a1, java.util.List a2) throws Throwable;
private static native boolean __call38_7(java.util.List a0, moom.Jc a1) throws Throwable;
private static native java.lang.Exception __call3003800_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3003801_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.client.renderer.texture.TextureAtlasSprite __sourceHandlerCall_f8e1b004a55defa18788(moom.Jc a0, moom.DT a1, int a2) throws E;
private static final class __SourceHandler_f8e1b004a55defa18788 {

public static net.minecraft.client.renderer.texture.TextureAtlasSprite f701(moom.Jc p0, moom.DT p1, int p2) throws Throwable {
    int forestValue701_20_0;
    int forestValue701_93_0;
    int forestValue701_102_0;
    int forestValue701_116_0;
    int spill701_0;
    int spill701_1;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    int life6_21;
    int life7_24;
    int life8_27;
    int life9_29;
    int life10_31;
    int life11_119;
    forest_join_116: {
    forest_join_110: {
    forest_join_102: {
    forest_join_101: {
    forest_join_93: {
    forest_join_82: {
    forest_join_74: {
    forest_join_67: {
    forest_join_60: {
    forest_join_50: {
    forest_join_44: {
    forest_join_35: {
    forest_join_20: {
    forest_join_18: {
    life3_3 = (__fieldRead701_0() ^ 32290698191251L);
    life5_5 = __call701_1();
    spill701_0 = (__fieldRead701_2(p0)).length;
    if (!((life5_5 != null))) {
        forestValue701_20_0 = spill701_0;
        break forest_join_20;
    }
    if (!((spill701_0 == 1))) {
        break forest_join_18;
    }
    return (__fieldRead701_3(p0))[0];
    }
    forestValue701_20_0 = __call701_4(p1);
    }
    life6_21 = forestValue701_20_0;
    life7_24 = __call701_5(p1);
    life8_27 = __call701_6(p1);
    life9_29 = 0;
    life10_31 = 0;
    spill701_1 = p2;
    if (!((life5_5 != null))) {
        forestValue701_93_0 = spill701_1;
        break forest_join_93;
    }
    switch (spill701_1) {
case 0:
{
        break forest_join_35;
    }
case 1:
{
        break forest_join_44;
    }
case 2:
{
        break forest_join_50;
    }
case 3:
{
        break forest_join_60;
    }
case 4:
{
        break forest_join_67;
    }
case 5:
{
        break forest_join_74;
    }
default:
{
        break forest_join_82;
    }
}
    }
    life9_29 = life6_21;
    life10_31 = ((-life8_27) - 1);
    if (!((life5_5 == null))) {
        break forest_join_82;
    }
    }
    life9_29 = life6_21;
    life10_31 = life8_27;
    if (!((life5_5 == null))) {
        break forest_join_82;
    }
    }
    life9_29 = ((-life6_21) - 1);
    life10_31 = (-life7_24);
    if (!((life5_5 == null))) {
        break forest_join_82;
    }
    }
    life9_29 = life6_21;
    life10_31 = (-life7_24);
    if (!((life5_5 == null))) {
        break forest_join_82;
    }
    }
    life9_29 = life8_27;
    life10_31 = (-life7_24);
    if (!((life5_5 == null))) {
        break forest_join_82;
    }
    }
    life9_29 = ((-life8_27) - 1);
    life10_31 = (-life7_24);
    }
    life9_29 = (life9_29 % __fieldRead701_7(p0));
    life10_31 = (life10_31 % __fieldRead701_8(p0));
    forestValue701_93_0 = life9_29;
    }
    if (!((life5_5 != null))) {
        forestValue701_102_0 = forestValue701_93_0;
        break forest_join_102;
    }
    if (!((forestValue701_93_0 < 0))) {
        break forest_join_101;
    }
    life9_29 = (life9_29 + __fieldRead701_9(p0));
    }
    forestValue701_102_0 = life10_31;
    }
    if (!((life5_5 != null))) {
        forestValue701_116_0 = forestValue701_102_0;
        break forest_join_116;
    }
    if (!((forestValue701_102_0 < 0))) {
        break forest_join_110;
    }
    life10_31 = (life10_31 + __fieldRead701_10(p0));
    }
    forestValue701_116_0 = ((life10_31 * __fieldRead701_11(p0)) + life9_29);
    }
    life11_119 = forestValue701_116_0;
    return (__fieldRead701_12(p0))[life11_119];
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h701_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070100_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h701_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070101_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h701_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070102_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h701_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070103_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h701_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070104_0(p0);
}
private static native long __fieldRead701_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call701_1() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead701_2(moom.Jc a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead701_3(moom.Jc a0) throws Throwable;
private static native int __call701_4(moom.DT a0) throws Throwable;
private static native int __call701_5(moom.DT a0) throws Throwable;
private static native int __call701_6(moom.DT a0) throws Throwable;
private static native int __fieldRead701_7(moom.Jc a0) throws Throwable;
private static native int __fieldRead701_8(moom.Jc a0) throws Throwable;
private static native int __fieldRead701_9(moom.Jc a0) throws Throwable;
private static native int __fieldRead701_10(moom.Jc a0) throws Throwable;
private static native int __fieldRead701_11(moom.Jc a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead701_12(moom.Jc a0) throws Throwable;
private static native java.lang.Exception __call3070100_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070101_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070102_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070103_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070104_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> moom.lC[] __sourceHandlerCall_ef39749226ca650dcd2d(moom.Jc a0, moom.DT a1, int a2, moom.lC a3, moom.Mi a4) throws E;
private static final class __SourceHandler_ef39749226ca650dcd2d {

public static moom.lC[] f40(moom.Jc p0, moom.DT p1, int p2, moom.lC p3, moom.Mi p4) throws Throwable {
    long life5_3;
    net.minecraft.entity.Entity[] life7_5;
    moom.LZ life8_17;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life10_22;
    java.lang.Object life9_38;
    life5_3 = (__fieldRead40_0() ^ 54369595749170L);
    life7_5 = __call40_1();
    if ((!__call40_2(p3))) {
        return null;
    }
    life8_17 = __call40_4(p4, __fieldRead40_3(p0));
    life10_22 = __call40_5(p0, p1, p2);
    if ((life10_22 != null)) {
        __call40_9(life8_17, __call40_7(life10_22, p3, __fieldRead40_6(p0)), __fieldRead40_8(p0));
    }
    life9_38 = null;
    if ((life7_5 != null)) {
        if ((__call40_10(life8_17) > 0)) {
        __call40_11(p4, 1);
    }
    }
    return __cast40_12(life9_38);
}
public static moom.lC[] h40_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2004000_0(p0);
}
public static moom.lC[] h40_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2004001_0(p0);
}
public static moom.lC[] h40_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2004002_0(p0);
}
public static moom.lC[] h40_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2004003_0(p0);
}
public static moom.lC[] h40_4(java.lang.Throwable p0, moom.Mi p1, moom.LZ p2) throws Throwable {
    java.lang.Throwable local3 = p0;
    if ((__call2004004_0(p2) > 0)) {
        __call2004004_1(p1, 1);
    }
    throw local3;
}
public static moom.lC[] h40_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2004005_0(p0);
}
private static native long __fieldRead40_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call40_1() throws Throwable;
private static native boolean __call40_2(moom.lC a0) throws Throwable;
private static native net.minecraft.util.EnumWorldBlockLayer __fieldRead40_3(moom.Jc a0) throws Throwable;
private static native moom.LZ __call40_4(moom.Mi a0, net.minecraft.util.EnumWorldBlockLayer a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call40_5(moom.Jc a0, moom.DT a1, int a2) throws Throwable;
private static native int __fieldRead40_6(moom.Jc a0) throws Throwable;
private static native moom.lC __call40_7(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, int a2) throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead40_8(moom.Jc a0) throws Throwable;
private static native void __call40_9(moom.LZ a0, moom.lC a1, net.minecraft.block.state.IBlockState a2) throws Throwable;
private static native int __call40_10(moom.LZ a0) throws Throwable;
private static native void __call40_11(moom.Mi a0, int a1) throws Throwable;
private static native moom.lC[] __cast40_12(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call2004000_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call2004001_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call2004002_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call2004003_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native int __call2004004_0(moom.LZ a0) throws Throwable;
private static native void __call2004004_1(moom.Mi a0, int a1) throws Throwable;
private static native java.lang.Exception __call2004005_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> moom.lC[] __sourceHandlerCall_03b21c9eef301c88028f(moom.Jc a0, moom.lC a1, moom.Mi a2) throws E;
private static final class __SourceHandler_03b21c9eef301c88028f {

public static moom.lC[] f41(moom.Jc p0, moom.lC p1, moom.Mi p2) throws Throwable {
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    moom.LZ life6_17;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life8_20;
    java.lang.Object life7_36;
    life3_3 = (__fieldRead41_0() ^ 132934119569815L);
    life5_5 = __call41_1();
    if ((!__call41_2(p1))) {
        return null;
    }
    life6_17 = __call41_4(p2, __fieldRead41_3(p0));
    life8_20 = __call41_5(p0);
    if ((life8_20 != null)) {
        __call41_9(life6_17, __call41_7(life8_20, p1, __fieldRead41_6(p0)), __fieldRead41_8(p0));
    }
    life7_36 = null;
    if ((life5_5 != null)) {
        if ((__call41_10(life6_17) > 0)) {
        __call41_11(p2, 1);
    }
    }
    return __cast41_12(life7_36);
}
public static moom.lC[] h41_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2004100_0(p0);
}
public static moom.lC[] h41_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2004101_0(p0);
}
public static moom.lC[] h41_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2004102_0(p0);
}
public static moom.lC[] h41_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2004103_0(p0);
}
public static moom.lC[] h41_4(java.lang.Throwable p0, moom.Mi p1, moom.LZ p2) throws Throwable {
    java.lang.Throwable local3 = p0;
    if ((__call2004104_0(p2) > 0)) {
        __call2004104_1(p1, 1);
    }
    throw local3;
}
public static moom.lC[] h41_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2004105_0(p0);
}
private static native long __fieldRead41_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call41_1() throws Throwable;
private static native boolean __call41_2(moom.lC a0) throws Throwable;
private static native net.minecraft.util.EnumWorldBlockLayer __fieldRead41_3(moom.Jc a0) throws Throwable;
private static native moom.LZ __call41_4(moom.Mi a0, net.minecraft.util.EnumWorldBlockLayer a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call41_5(moom.Jc a0) throws Throwable;
private static native int __fieldRead41_6(moom.Jc a0) throws Throwable;
private static native moom.lC __call41_7(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, int a2) throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead41_8(moom.Jc a0) throws Throwable;
private static native void __call41_9(moom.LZ a0, moom.lC a1, net.minecraft.block.state.IBlockState a2) throws Throwable;
private static native int __call41_10(moom.LZ a0) throws Throwable;
private static native void __call41_11(moom.Mi a0, int a1) throws Throwable;
private static native moom.lC[] __cast41_12(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call2004100_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call2004101_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call2004102_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call2004103_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native int __call2004104_0(moom.LZ a0) throws Throwable;
private static native void __call2004104_1(moom.Mi a0, int a1) throws Throwable;
private static native java.lang.Exception __call2004105_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.client.renderer.texture.TextureAtlasSprite __sourceHandlerCall_ff509c0803fdc53dbe44(moom.Jc a0, net.minecraft.world.IBlockAccess a1, moom.fB a2, moom.DT a3, int a4) throws E;
private static final class __SourceHandler_ff509c0803fdc53dbe44 {

public static net.minecraft.client.renderer.texture.TextureAtlasSprite f684(moom.Jc p0, net.minecraft.world.IBlockAccess p1, moom.fB p2, moom.DT p3, int p4) throws Throwable {
    int lexicalValue684_24_0;
    int lexicalValue684_24_1;
    int lexicalValue684_72_0;
    int lexicalValue684_106_0;
    int lexicalValue684_124_0;
    int spill684_0;
    int spill684_1;
    boolean spill684_2;
    int spill684_3;
    int spill684_4;
    int spill684_5;
    long life5_3;
    net.minecraft.entity.Entity[] life7_5;
    int life8_30;
    moom.DT life9_41;
    net.minecraft.block.state.IBlockState life10_45;
    int life9_89;
    int life10_91;
    int life11_129;
    int[] life12_132;
    int life13_134;
    lexical_join_130: {
    lexical_join_106: {
    lexical_join_102: {
    lexical_join_91: {
    lexical_join_87: {
    lexical_join_72: {
    lexical_join_63: {
    lexical_join_24: {
    lexical_join_18: {
    life5_3 = (__fieldRead684_0() ^ 55384506037766L);
    life7_5 = __call684_1();
    spill684_0 = (__fieldRead684_2(p0)).length;
    spill684_1 = 1;
    if (!((life7_5 != null))) {
        lexicalValue684_24_0 = spill684_0;
        lexicalValue684_24_1 = spill684_1;
        break lexical_join_24;
    }
    if (!((spill684_0 == spill684_1))) {
        break lexical_join_18;
    }
    return (__fieldRead684_3(p0))[0];
    }
    lexicalValue684_24_0 = (p4 / __fieldRead684_4(p0));
    lexicalValue684_24_1 = __fieldRead684_5(p0);
    }
    life8_30 = (lexicalValue684_24_0 * lexicalValue684_24_1);
    spill684_2 = __fieldRead684_6(p0);
    if (!((life7_5 != null))) {
        lexicalValue684_72_0 = __integerCategory684_7(spill684_2);
        break lexical_join_72;
    }
    if (!(spill684_2)) {
        break lexical_join_63;
    }
    life9_41 = __call684_8(p3);
    life10_45 = __call684_9(p1, life9_41);
    lexical_cycle_38: while (true) {
    lexical_join_61: {
    lexical_join_57: {
    if (!((__call684_10(life10_45) == __call684_11(p2)))) {
        break lexical_join_63;
    }
    p3 = life9_41;
    life9_41 = __call684_12(life9_41);
    if (!((life7_5 != null))) {
        break lexical_join_61;
    }
    spill684_3 = __call684_13(life9_41);
    if (!((life7_5 != null))) {
        lexicalValue684_72_0 = spill684_3;
        break lexical_join_72;
    }
    if (!((spill684_3 < 0))) {
        break lexical_join_57;
    }
    if (!((life7_5 == null))) {
        break lexical_join_63;
    }
    }
    life10_45 = __call684_14(p1, life9_41);
    }
    if (!((life7_5 == null))) { continue lexical_cycle_38; }
    break lexical_cycle_38;
    }
    }
    lexicalValue684_72_0 = (__call684_15(p3, life8_30) & __invokedynamic684_16(28464, (1694139118851110707L ^ life5_3)));
    }
    life9_89 = lexicalValue684_72_0;
    life10_91 = 0;
    lexical_cycle_75: while (true) {
    if (!((life10_91 < __fieldRead684_17(p0)))) {
        break lexical_join_87;
    }
    life9_89 = __call684_18(life9_89);
    life10_91 += 1;
    if (!((life7_5 != null))) {
        break lexical_join_91;
    }
    if (!((life7_5 == null))) { continue lexical_cycle_75; }
    break lexical_cycle_75;
    }
    }
    spill684_4 = 0;
    if (!((life7_5 != null))) {
        lexicalValue684_106_0 = spill684_4;
        break lexical_join_106;
    }
    life10_91 = spill684_4;
    }
    if (!((__fieldRead684_19(p0) == null))) {
        break lexical_join_102;
    }
    life10_91 = (life9_89 % (__fieldRead684_20(p0)).length);
    if (!((life7_5 == null))) {
        break lexical_join_130;
    }
    }
    lexicalValue684_106_0 = (life9_89 % __fieldRead684_21(p0));
    }
    life11_129 = lexicalValue684_106_0;
    life12_132 = __fieldRead684_22(p0);
    life13_134 = 0;
    lexical_cycle_112: while (true) {
    lexical_join_127: {
    lexical_join_124: {
    if (!((life13_134 < (life12_132).length))) {
        break lexical_join_130;
    }
    spill684_5 = life11_129;
    if (!((life7_5 != null))) {
        lexicalValue684_124_0 = spill684_5;
        break lexical_join_124;
    }
    if (!((spill684_5 < (life12_132)[life13_134]))) {
        break lexical_join_127;
    }
    lexicalValue684_124_0 = life13_134;
    }
    life10_91 = lexicalValue684_124_0;
    if (!((life7_5 == null))) {
        break lexical_join_130;
    }
    }
    life13_134 += 1;
    if (!((life7_5 == null))) { continue lexical_cycle_112; }
    break lexical_cycle_112;
    }
    }
    return (__fieldRead684_23(p0))[life10_91];
}
public static void h684_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068400_0(p0);
}
public static void h684_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068401_0(p0);
}
public static void h684_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068402_0(p0);
}
public static void h684_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068403_0(p0);
}
public static void h684_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068404_0(p0);
}
public static void h684_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068405_0(p0);
}
public static void h684_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068406_0(p0);
}
public static void h684_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068407_0(p0);
}
public static void h684_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068408_0(p0);
}
public static void h684_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068409_0(p0);
}
public static void h684_10(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068410_0(p0);
}
private static native long __fieldRead684_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call684_1() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead684_2(moom.Jc a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead684_3(moom.Jc a0) throws Throwable;
private static native int __fieldRead684_4(moom.Jc a0) throws Throwable;
private static native int __fieldRead684_5(moom.Jc a0) throws Throwable;
private static native boolean __fieldRead684_6(moom.Jc a0) throws Throwable;
private static native int __integerCategory684_7(boolean value) throws Throwable;
private static native moom.DT __call684_8(moom.DT a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call684_9(net.minecraft.world.IBlockAccess a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call684_10(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.block.Block __call684_11(moom.fB a0) throws Throwable;
private static native moom.DT __call684_12(moom.DT a0) throws Throwable;
private static native int __call684_13(moom.DT a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call684_14(net.minecraft.world.IBlockAccess a0, moom.DT a1) throws Throwable;
private static native int __call684_15(moom.DT a0, int a1) throws Throwable;
private static native int __invokedynamic684_16(int a0, long a1) throws Throwable;
private static native int __fieldRead684_17(moom.Jc a0) throws Throwable;
private static native int __call684_18(int a0) throws Throwable;
private static native int[] __fieldRead684_19(moom.Jc a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead684_20(moom.Jc a0) throws Throwable;
private static native int __fieldRead684_21(moom.Jc a0) throws Throwable;
private static native int[] __fieldRead684_22(moom.Jc a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead684_23(moom.Jc a0) throws Throwable;
private static native java.lang.Exception __call1068400_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068401_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068402_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068403_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068404_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068405_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068406_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068407_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068408_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068409_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068410_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> moom.lC[] __sourceHandlerCall_1ec1b19ea60714a66d83(moom.Jc a0, net.minecraft.world.IBlockAccess a1, moom.fB a2, moom.DT a3, int a4, moom.lC a5, int a6, moom.Mi a7) throws E;
private static final class __SourceHandler_1ec1b19ea60714a66d83 {

public static moom.lC[] f699(moom.Jc p0, net.minecraft.world.IBlockAccess p1, moom.fB p2, moom.DT p3, int p4, moom.lC p5, int p6, moom.Mi p7) throws Throwable {
    int forestValue699_37_0;
    int forestValue699_62_0;
    int forestValue699_68_0;
    int forestValue699_97_0;
    int forestValue699_104_0;
    moom.Jc forestValue699_120_0;
    moom.Jc forestValue699_137_0;
    moom.Jc forestValue699_309_0;
    net.minecraft.entity.Entity[] spill699_0;
    int spill699_1;
    int spill699_2;
    int spill699_3;
    int spill699_4;
    int spill699_5;
    int spill699_6;
    moom.Jc spill699_7;
    moom.Jc spill699_8;
    moom.Jc spill699_9;
    moom.Jc spill699_10;
    long life8_3;
    int life11_6;
    net.minecraft.entity.Entity[] life10_7;
    int life12_10;
    int life13_12;
    net.minecraft.block.Block life14_15;
    int life15_92;
    int life15_116;
    net.minecraft.world.biome.BiomeGenBase life16_143;
    java.lang.String life16_159;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life16_169;
    forest_join_309: {
    forest_join_308: {
    forest_join_301: {
    forest_join_292: {
    forest_join_287: {
    forest_join_276: {
    forest_join_274: {
    forest_join_261: {
    forest_join_248: {
    forest_join_235: {
    forest_join_229: {
    forest_join_216: {
    forest_join_208: {
    forest_join_198: {
    forest_join_185: {
    forest_join_172: {
    forest_join_158: {
    forest_join_150: {
    forest_join_137: {
    forest_join_136: {
    forest_join_120: {
    forest_join_119: {
    forest_join_104: {
    forest_join_102: {
    forest_join_97: {
    forest_join_91: {
    forest_join_68: {
    forest_join_67: {
    forest_join_62: {
    forest_join_57: {
    forest_join_37: {
    forest_join_35: {
    life8_3 = (__fieldRead699_0() ^ 104813797969883L);
    spill699_0 = __call699_1();
    life11_6 = 0;
    life10_7 = spill699_0;
    life12_10 = __call699_2(p2);
    life13_12 = life12_10;
    life14_15 = __call699_3(p2);
    spill699_1 = __instanceOf699_4(life14_15);
    if (!((life10_7 != null))) {
        forestValue699_37_0 = spill699_1;
        break forest_join_37;
    }
    if (!((spill699_1 != 0))) {
        break forest_join_35;
    }
    life11_6 = __call699_5(p4, life12_10);
    spill699_2 = __call699_6(p0);
    if (!((life10_7 != null))) {
        forestValue699_37_0 = spill699_2;
        break forest_join_37;
    }
    if (!((spill699_2 <= 3))) {
        break forest_join_35;
    }
    life13_12 = (life12_10 & 3);
    }
    forestValue699_37_0 = __instanceOf699_7(life14_15);
    }
    if (!((life10_7 != null))) {
        forestValue699_62_0 = forestValue699_37_0;
        break forest_join_62;
    }
    if (!((forestValue699_37_0 != 0))) {
        break forest_join_57;
    }
    life11_6 = __call699_8(p4, life12_10);
    spill699_3 = __call699_9(p0);
    if (!((life10_7 != null))) {
        forestValue699_62_0 = spill699_3;
        break forest_join_62;
    }
    if (!((spill699_3 <= 2))) {
        break forest_join_57;
    }
    spill699_4 = life13_12;
    if (!((life10_7 != null))) {
        forestValue699_62_0 = spill699_4;
        break forest_join_62;
    }
    if (!((spill699_4 > 2))) {
        break forest_join_57;
    }
    life13_12 = 2;
    }
    forestValue699_62_0 = __integerCategory699_12(__call699_11(p0, __call699_10(p2), life13_12));
    }
    if (!((life10_7 != null))) {
        forestValue699_68_0 = forestValue699_62_0;
        break forest_join_68;
    }
    if (!((forestValue699_62_0 == 0))) {
        break forest_join_67;
    }
    return null;
    }
    forestValue699_68_0 = p4;
    }
    if (!((life10_7 != null))) {
        forestValue699_104_0 = forestValue699_68_0;
        break forest_join_104;
    }
    if (!((forestValue699_68_0 >= 0))) {
        break forest_join_102;
    }
    spill699_5 = __fieldRead699_13(p0);
    if (!((life10_7 != null))) {
        forestValue699_104_0 = spill699_5;
        break forest_join_104;
    }
    if (!((spill699_5 != __invokedynamic699_14(22516, (6009346806230087227L ^ life8_3))))) {
        break forest_join_102;
    }
    life15_92 = p4;
    spill699_6 = life11_6;
    if (!((life10_7 != null))) {
        forestValue699_97_0 = spill699_6;
        break forest_join_97;
    }
    if (!((spill699_6 != 0))) {
        break forest_join_91;
    }
    life15_92 = __call699_15(p4, life11_6);
    }
    forestValue699_97_0 = ((1 << life15_92) & __fieldRead699_16(p0));
    }
    if (!((life10_7 != null))) {
        forestValue699_104_0 = forestValue699_97_0;
        break forest_join_104;
    }
    if (!((forestValue699_97_0 == 0))) {
        break forest_join_102;
    }
    return null;
    }
    forestValue699_104_0 = __call699_17(p3);
    }
    life15_116 = forestValue699_104_0;
    spill699_7 = p0;
    if (!((life10_7 != null))) {
        forestValue699_120_0 = spill699_7;
        break forest_join_120;
    }
    if (!((__fieldRead699_18(spill699_7) != null))) {
        break forest_join_119;
    }
    spill699_8 = p0;
    if (!((life10_7 != null))) {
        forestValue699_120_0 = spill699_8;
        break forest_join_120;
    }
    if (!((!__call699_20(__fieldRead699_19(spill699_8), life15_116)))) {
        break forest_join_119;
    }
    return null;
    }
    forestValue699_120_0 = p0;
    }
    if (!((life10_7 != null))) {
        forestValue699_137_0 = forestValue699_120_0;
        break forest_join_137;
    }
    if (!((__fieldRead699_21(forestValue699_120_0) != null))) {
        break forest_join_136;
    }
    life16_143 = __call699_22(p1, p3);
    spill699_9 = p0;
    if (!((life10_7 != null))) {
        forestValue699_137_0 = spill699_9;
        break forest_join_137;
    }
    if (!((!__call699_23(spill699_9, life16_143)))) {
        break forest_join_136;
    }
    return null;
    }
    forestValue699_137_0 = p0;
    }
    if (!((__fieldRead699_24(forestValue699_137_0) != null))) {
        break forest_join_150;
    }
    life16_159 = __call699_25(p1, p3);
    if (!((!__call699_27(__fieldRead699_26(p0), life16_159)))) {
        break forest_join_150;
    }
    return null;
    }
    life16_169 = __call699_28(p5);
    spill699_10 = p0;
    if (!((life10_7 != null))) {
        forestValue699_309_0 = spill699_10;
        break forest_join_309;
    }
    switch (__fieldRead699_29(spill699_10)) {
case 1:
{
        break forest_join_158;
    }
case 2:
{
        break forest_join_172;
    }
case 3:
{
        break forest_join_185;
    }
case 4:
{
        break forest_join_198;
    }
case 5:
{
        break forest_join_208;
    }
case 6:
{
        break forest_join_216;
    }
case 7:
{
        break forest_join_229;
    }
case 8:
{
        break forest_join_235;
    }
case 9:
{
        break forest_join_248;
    }
case 10:
{
        break forest_join_261;
    }
default:
{
        break forest_join_274;
    }
case 11:
{
        break forest_join_276;
    }
case 12:
{
        break forest_join_287;
    }
case 13:
{
        break forest_join_292;
    }
case 14:
{
        break forest_join_301;
    }
case 15:
{
        break forest_join_308;
    }
}
    }
    return __call699_31(__call699_30(p0, p1, p2, p3, life11_6, p4, life16_169, life12_10, p7), p5, p7);
    }
    return __call699_33(__call699_32(p0, p1, p2, p3, life11_6, p4, life16_169, life12_10), p5, p7);
    }
    return __call699_35(__call699_34(p0, p1, p2, p3, life11_6, p4, life16_169, life12_10), p5, p7);
    }
    return __call699_37(__call699_36(p0, p1, p2, p3, p4), p5, p7);
    }
    return __call699_39(__call699_38(p0, p3, p4), p5, p7);
    }
    return __call699_41(__call699_40(p0, p1, p2, p3, life11_6, p4, life16_169, life12_10), p5, p7);
    }
    return __call699_43(__call699_42(p0), p5, p7);
    }
    return __call699_45(__call699_44(p0, p1, p2, p3, life11_6, p4, life16_169, life12_10), p5, p7);
    }
    return __call699_47(__call699_46(p0, p1, p2, p3, life11_6, p4, life16_169, life12_10), p5, p7);
    }
    if (!((p6 == 0))) {
        break forest_join_274;
    }
    return __call699_48(p0, p1, p2, p3, life11_6, p4, p5, life12_10, p7);
    }
    return null;
    }
    return __call699_49(p0, p1, p2, p3, life11_6, p4, p5, life12_10, p7);
    }
    return __call699_50(p0, p5, p7);
    }
    return __call699_51(p0, p1, p2, p3, p4, p5, p7);
    }
    return __call699_52(p0, p3, p4, p5, p7);
    }
    forestValue699_309_0 = p0;
    }
    return __call699_53(forestValue699_309_0, p1, p2, p3, life11_6, p4, p5, life12_10, p7);
}
public static moom.lC[] h699_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069900_0(p0);
}
public static moom.lC[] h699_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069901_0(p0);
}
public static moom.lC[] h699_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069902_0(p0);
}
public static moom.lC[] h699_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069903_0(p0);
}
public static moom.lC[] h699_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069904_0(p0);
}
public static moom.lC[] h699_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069905_0(p0);
}
public static moom.lC[] h699_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069906_0(p0);
}
public static moom.lC[] h699_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069907_0(p0);
}
public static moom.lC[] h699_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069908_0(p0);
}
public static moom.lC[] h699_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069909_0(p0);
}
public static moom.lC[] h699_10(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069910_0(p0);
}
public static moom.lC[] h699_11(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069911_0(p0);
}
public static moom.lC[] h699_12(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069912_0(p0);
}
public static moom.lC[] h699_13(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069913_0(p0);
}
public static moom.lC[] h699_14(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069914_0(p0);
}
public static moom.lC[] h699_15(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069915_0(p0);
}
public static moom.lC[] h699_16(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069916_0(p0);
}
public static moom.lC[] h699_17(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069917_0(p0);
}
public static moom.lC[] h699_18(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069918_0(p0);
}
public static moom.lC[] h699_19(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069919_0(p0);
}
public static moom.lC[] h699_20(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069920_0(p0);
}
public static moom.lC[] h699_21(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069921_0(p0);
}
public static moom.lC[] h699_22(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069922_0(p0);
}
public static moom.lC[] h699_23(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069923_0(p0);
}
public static moom.lC[] h699_24(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069924_0(p0);
}
private static native long __fieldRead699_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call699_1() throws Throwable;
private static native int __call699_2(moom.fB a0) throws Throwable;
private static native net.minecraft.block.Block __call699_3(moom.fB a0) throws Throwable;
private static native int __instanceOf699_4(net.minecraft.block.Block a0) throws Throwable;
private static native int __call699_5(int a0, int a1) throws Throwable;
private static native int __call699_6(moom.Jc a0) throws Throwable;
private static native int __instanceOf699_7(net.minecraft.block.Block a0) throws Throwable;
private static native int __call699_8(int a0, int a1) throws Throwable;
private static native int __call699_9(moom.Jc a0) throws Throwable;
private static native int __call699_10(moom.fB a0) throws Throwable;
private static native boolean __call699_11(moom.Jc a0, int a1, int a2) throws Throwable;
private static native int __integerCategory699_12(boolean value) throws Throwable;
private static native int __fieldRead699_13(moom.Jc a0) throws Throwable;
private static native int __invokedynamic699_14(int a0, long a1) throws Throwable;
private static native int __call699_15(int a0, int a1) throws Throwable;
private static native int __fieldRead699_16(moom.Jc a0) throws Throwable;
private static native int __call699_17(moom.DT a0) throws Throwable;
private static native moom.Ke __fieldRead699_18(moom.Jc a0) throws Throwable;
private static native moom.Ke __fieldRead699_19(moom.Jc a0) throws Throwable;
private static native boolean __call699_20(moom.Ke a0, int a1) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase[] __fieldRead699_21(moom.Jc a0) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __call699_22(net.minecraft.world.IBlockAccess a0, moom.DT a1) throws Throwable;
private static native boolean __call699_23(moom.Jc a0, net.minecraft.world.biome.BiomeGenBase a1) throws Throwable;
private static native moom.Kb __fieldRead699_24(moom.Jc a0) throws Throwable;
private static native java.lang.String __call699_25(net.minecraft.world.IBlockAccess a0, moom.DT a1) throws Throwable;
private static native moom.Kb __fieldRead699_26(moom.Jc a0) throws Throwable;
private static native boolean __call699_27(moom.Kb a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call699_28(moom.lC a0) throws Throwable;
private static native int __fieldRead699_29(moom.Jc a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call699_30(moom.Jc a0, net.minecraft.world.IBlockAccess a1, moom.fB a2, moom.DT a3, int a4, int a5, net.minecraft.client.renderer.texture.TextureAtlasSprite a6, int a7, moom.Mi a8) throws Throwable;
private static native moom.lC[] __call699_31(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, moom.Mi a2) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call699_32(moom.Jc a0, net.minecraft.world.IBlockAccess a1, moom.fB a2, moom.DT a3, int a4, int a5, net.minecraft.client.renderer.texture.TextureAtlasSprite a6, int a7) throws Throwable;
private static native moom.lC[] __call699_33(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, moom.Mi a2) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call699_34(moom.Jc a0, net.minecraft.world.IBlockAccess a1, moom.fB a2, moom.DT a3, int a4, int a5, net.minecraft.client.renderer.texture.TextureAtlasSprite a6, int a7) throws Throwable;
private static native moom.lC[] __call699_35(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, moom.Mi a2) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call699_36(moom.Jc a0, net.minecraft.world.IBlockAccess a1, moom.fB a2, moom.DT a3, int a4) throws Throwable;
private static native moom.lC[] __call699_37(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, moom.Mi a2) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call699_38(moom.Jc a0, moom.DT a1, int a2) throws Throwable;
private static native moom.lC[] __call699_39(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, moom.Mi a2) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call699_40(moom.Jc a0, net.minecraft.world.IBlockAccess a1, moom.fB a2, moom.DT a3, int a4, int a5, net.minecraft.client.renderer.texture.TextureAtlasSprite a6, int a7) throws Throwable;
private static native moom.lC[] __call699_41(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, moom.Mi a2) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call699_42(moom.Jc a0) throws Throwable;
private static native moom.lC[] __call699_43(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, moom.Mi a2) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call699_44(moom.Jc a0, net.minecraft.world.IBlockAccess a1, moom.fB a2, moom.DT a3, int a4, int a5, net.minecraft.client.renderer.texture.TextureAtlasSprite a6, int a7) throws Throwable;
private static native moom.lC[] __call699_45(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, moom.Mi a2) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call699_46(moom.Jc a0, net.minecraft.world.IBlockAccess a1, moom.fB a2, moom.DT a3, int a4, int a5, net.minecraft.client.renderer.texture.TextureAtlasSprite a6, int a7) throws Throwable;
private static native moom.lC[] __call699_47(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, moom.Mi a2) throws Throwable;
private static native moom.lC[] __call699_48(moom.Jc a0, net.minecraft.world.IBlockAccess a1, moom.fB a2, moom.DT a3, int a4, int a5, moom.lC a6, int a7, moom.Mi a8) throws Throwable;
private static native moom.lC[] __call699_49(moom.Jc a0, net.minecraft.world.IBlockAccess a1, moom.fB a2, moom.DT a3, int a4, int a5, moom.lC a6, int a7, moom.Mi a8) throws Throwable;
private static native moom.lC[] __call699_50(moom.Jc a0, moom.lC a1, moom.Mi a2) throws Throwable;
private static native moom.lC[] __call699_51(moom.Jc a0, net.minecraft.world.IBlockAccess a1, moom.fB a2, moom.DT a3, int a4, moom.lC a5, moom.Mi a6) throws Throwable;
private static native moom.lC[] __call699_52(moom.Jc a0, moom.DT a1, int a2, moom.lC a3, moom.Mi a4) throws Throwable;
private static native moom.lC[] __call699_53(moom.Jc a0, net.minecraft.world.IBlockAccess a1, moom.fB a2, moom.DT a3, int a4, int a5, moom.lC a6, int a7, moom.Mi a8) throws Throwable;
private static native java.lang.Exception __call3069900_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069901_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069902_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069903_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069904_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069905_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069906_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069907_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069908_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069909_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069910_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069911_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069912_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069913_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069914_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069915_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069916_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069917_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069918_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069919_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069920_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069921_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069922_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069923_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069924_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> moom.lC[] __sourceHandlerCall_3f004db9132d94fbc73a(moom.Jc a0, net.minecraft.world.IBlockAccess a1, moom.fB a2, moom.DT a3, int a4, moom.lC a5, moom.Mi a6) throws E;
private static final class __SourceHandler_3f004db9132d94fbc73a {

public static moom.lC[] f42(moom.Jc p0, net.minecraft.world.IBlockAccess p1, moom.fB p2, moom.DT p3, int p4, moom.lC p5, moom.Mi p6) throws Throwable {
    long life7_3;
    net.minecraft.entity.Entity[] life9_5;
    moom.LZ life10_17;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life12_24;
    java.lang.Object life11_40;
    life7_3 = (__fieldRead42_0() ^ 13484094729582L);
    life9_5 = __call42_1();
    if ((!__call42_2(p5))) {
        return null;
    }
    life10_17 = __call42_4(p6, __fieldRead42_3(p0));
    life12_24 = __call42_5(p0, p1, p2, p3, p4);
    if ((life12_24 != null)) {
        __call42_9(life10_17, __call42_7(life12_24, p5, __fieldRead42_6(p0)), __fieldRead42_8(p0));
    }
    life11_40 = null;
    if ((life9_5 != null)) {
        if ((__call42_10(life10_17) > 0)) {
        __call42_11(p6, 1);
    }
    }
    return __cast42_12(life11_40);
}
public static moom.lC[] h42_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2004200_0(p0);
}
public static moom.lC[] h42_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2004201_0(p0);
}
public static moom.lC[] h42_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2004202_0(p0);
}
public static moom.lC[] h42_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2004203_0(p0);
}
public static moom.lC[] h42_4(java.lang.Throwable p0, moom.Mi p1, moom.LZ p2) throws Throwable {
    java.lang.Throwable local3 = p0;
    if ((__call2004204_0(p2) > 0)) {
        __call2004204_1(p1, 1);
    }
    throw local3;
}
public static moom.lC[] h42_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2004205_0(p0);
}
private static native long __fieldRead42_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call42_1() throws Throwable;
private static native boolean __call42_2(moom.lC a0) throws Throwable;
private static native net.minecraft.util.EnumWorldBlockLayer __fieldRead42_3(moom.Jc a0) throws Throwable;
private static native moom.LZ __call42_4(moom.Mi a0, net.minecraft.util.EnumWorldBlockLayer a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call42_5(moom.Jc a0, net.minecraft.world.IBlockAccess a1, moom.fB a2, moom.DT a3, int a4) throws Throwable;
private static native int __fieldRead42_6(moom.Jc a0) throws Throwable;
private static native moom.lC __call42_7(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, int a2) throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead42_8(moom.Jc a0) throws Throwable;
private static native void __call42_9(moom.LZ a0, moom.lC a1, net.minecraft.block.state.IBlockState a2) throws Throwable;
private static native int __call42_10(moom.LZ a0) throws Throwable;
private static native void __call42_11(moom.Mi a0, int a1) throws Throwable;
private static native moom.lC[] __cast42_12(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call2004200_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call2004201_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call2004202_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call2004203_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native int __call2004204_0(moom.LZ a0) throws Throwable;
private static native void __call2004204_1(moom.Mi a0, int a1) throws Throwable;
private static native java.lang.Exception __call2004205_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.client.renderer.texture.TextureAtlasSprite __sourceHandlerCall_34c47a0ec9e7da1b0a83(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, int a5, net.minecraft.client.renderer.texture.TextureAtlasSprite a6, int a7) throws E;
private static final class __SourceHandler_34c47a0ec9e7da1b0a83 {

public static net.minecraft.client.renderer.texture.TextureAtlasSprite f702(moom.Jc p0, net.minecraft.world.IBlockAccess p1, net.minecraft.block.state.IBlockState p2, moom.DT p3, int p4, int p5, net.minecraft.client.renderer.texture.TextureAtlasSprite p6, int p7) throws Throwable {
    int forestValue702_37_0;
    int forestValue702_129_0;
    int forestValue702_289_0;
    int forestValue702_303_0;
    int forestValue702_307_0;
    int forestValue702_315_0;
    net.minecraft.entity.Entity[] spill702_0;
    int spill702_1;
    int spill702_2;
    int spill702_3;
    int spill702_4;
    int spill702_5;
    int spill702_6;
    long life8_3;
    int life11_5;
    int life12_8;
    net.minecraft.entity.Entity[] life10_9;
    int life13_292;
    int life13_305;
    forest_join_316: {
    forest_join_315: {
    forest_join_314: {
    forest_join_307: {
    forest_join_306: {
    forest_join_303: {
    forest_join_302: {
    forest_join_289: {
    forest_join_288: {
    forest_join_268: {
    forest_join_246: {
    forest_join_224: {
    forest_join_202: {
    forest_join_198: {
    forest_join_196: {
    forest_join_176: {
    forest_join_154: {
    forest_join_132: {
    forest_join_129: {
    forest_join_110: {
    forest_join_106: {
    forest_join_104: {
    forest_join_84: {
    forest_join_62: {
    forest_join_40: {
    forest_join_37: {
    forest_join_18: {
    forest_join_14: {
    life8_3 = (__fieldRead702_0() ^ 40836983666694L);
    life11_5 = 0;
    spill702_0 = __call702_1();
    life12_8 = 0;
    life10_9 = spill702_0;
    spill702_1 = p4;
    if (!((life10_9 != null))) {
        forestValue702_289_0 = spill702_1;
        break forest_join_289;
    }
    switch (spill702_1) {
case 0:
{
        break forest_join_14;
    }
case 1:
{
        break forest_join_106;
    }
case 2:
{
        break forest_join_198;
    }
default:
{
        break forest_join_288;
    }
}
    }
    spill702_2 = p5;
    if (!((life10_9 != null))) {
        forestValue702_37_0 = spill702_2;
        break forest_join_37;
    }
    switch (spill702_2) {
case 0:
case 1:
case 3:
{
        break forest_join_18;
    }
case 2:
{
        break forest_join_40;
    }
case 4:
{
        break forest_join_62;
    }
case 5:
{
        break forest_join_84;
    }
default:
{
        break forest_join_104;
    }
}
    }
    life11_5 = __integerCategory702_4(__call702_3(p0, p1, p2, __call702_2(p3), p5, p6, p7));
    forestValue702_37_0 = __integerCategory702_7(__call702_6(p0, p1, p2, __call702_5(p3), p5, p6, p7));
    }
    life12_8 = forestValue702_37_0;
    if (!((life10_9 == null))) {
        break forest_join_288;
    }
    }
    life11_5 = __integerCategory702_10(__call702_9(p0, p1, p2, __call702_8(p3), p5, p6, p7));
    life12_8 = __integerCategory702_13(__call702_12(p0, p1, p2, __call702_11(p3), p5, p6, p7));
    if (!((life10_9 == null))) {
        break forest_join_288;
    }
    }
    life11_5 = __integerCategory702_16(__call702_15(p0, p1, p2, __call702_14(p3), p5, p6, p7));
    life12_8 = __integerCategory702_19(__call702_18(p0, p1, p2, __call702_17(p3), p5, p6, p7));
    if (!((life10_9 == null))) {
        break forest_join_288;
    }
    }
    life11_5 = __integerCategory702_22(__call702_21(p0, p1, p2, __call702_20(p3), p5, p6, p7));
    life12_8 = __integerCategory702_25(__call702_24(p0, p1, p2, __call702_23(p3), p5, p6, p7));
    }
    if (!((life10_9 == null))) {
        break forest_join_288;
    }
    }
    spill702_3 = p5;
    if (!((life10_9 != null))) {
        forestValue702_129_0 = spill702_3;
        break forest_join_129;
    }
    switch (spill702_3) {
case 0:
{
        break forest_join_110;
    }
case 1:
case 2:
case 3:
{
        break forest_join_132;
    }
case 4:
{
        break forest_join_154;
    }
case 5:
{
        break forest_join_176;
    }
default:
{
        break forest_join_196;
    }
}
    }
    life11_5 = __integerCategory702_28(__call702_27(p0, p1, p2, __call702_26(p3), p5, p6, p7));
    forestValue702_129_0 = __integerCategory702_31(__call702_30(p0, p1, p2, __call702_29(p3), p5, p6, p7));
    }
    life12_8 = forestValue702_129_0;
    if (!((life10_9 == null))) {
        break forest_join_288;
    }
    }
    life11_5 = __integerCategory702_34(__call702_33(p0, p1, p2, __call702_32(p3), p5, p6, p7));
    life12_8 = __integerCategory702_37(__call702_36(p0, p1, p2, __call702_35(p3), p5, p6, p7));
    if (!((life10_9 == null))) {
        break forest_join_288;
    }
    }
    life11_5 = __integerCategory702_40(__call702_39(p0, p1, p2, __call702_38(p3), p5, p6, p7));
    life12_8 = __integerCategory702_43(__call702_42(p0, p1, p2, __call702_41(p3), p5, p6, p7));
    if (!((life10_9 == null))) {
        break forest_join_288;
    }
    }
    life11_5 = __integerCategory702_46(__call702_45(p0, p1, p2, __call702_44(p3), p5, p6, p7));
    life12_8 = __integerCategory702_49(__call702_48(p0, p1, p2, __call702_47(p3), p5, p6, p7));
    }
    if (!((life10_9 == null))) {
        break forest_join_288;
    }
    }
    spill702_4 = p5;
    if (!((life10_9 != null))) {
        forestValue702_289_0 = spill702_4;
        break forest_join_289;
    }
    switch (spill702_4) {
case 0:
{
        break forest_join_202;
    }
case 1:
case 4:
case 5:
{
        break forest_join_224;
    }
case 2:
{
        break forest_join_246;
    }
case 3:
{
        break forest_join_268;
    }
default:
{
        break forest_join_288;
    }
}
    }
    life11_5 = __integerCategory702_52(__call702_51(p0, p1, p2, __call702_50(p3), p5, p6, p7));
    life12_8 = __integerCategory702_55(__call702_54(p0, p1, p2, __call702_53(p3), p5, p6, p7));
    if (!((life10_9 == null))) {
        break forest_join_288;
    }
    }
    life11_5 = __integerCategory702_58(__call702_57(p0, p1, p2, __call702_56(p3), p5, p6, p7));
    life12_8 = __integerCategory702_61(__call702_60(p0, p1, p2, __call702_59(p3), p5, p6, p7));
    if (!((life10_9 == null))) {
        break forest_join_288;
    }
    }
    life11_5 = __integerCategory702_64(__call702_63(p0, p1, p2, __call702_62(p3), p5, p6, p7));
    life12_8 = __integerCategory702_67(__call702_66(p0, p1, p2, __call702_65(p3), p5, p6, p7));
    if (!((life10_9 == null))) {
        break forest_join_288;
    }
    }
    life11_5 = __integerCategory702_70(__call702_69(p0, p1, p2, __call702_68(p3), p5, p6, p7));
    life12_8 = __integerCategory702_73(__call702_72(p0, p1, p2, __call702_71(p3), p5, p6, p7));
    }
    forestValue702_289_0 = 3;
    }
    life13_292 = forestValue702_289_0;
    spill702_5 = life11_5;
    if (!((life10_9 != null))) {
        forestValue702_307_0 = spill702_5;
        break forest_join_307;
    }
    if (!((spill702_5 != 0))) {
        break forest_join_306;
    }
    spill702_6 = life12_8;
    if (!((life10_9 != null))) {
        forestValue702_303_0 = spill702_6;
        break forest_join_303;
    }
    if (!((spill702_6 != 0))) {
        break forest_join_302;
    }
    life13_305 = 1;
    if (!((life10_9 == null))) {
        break forest_join_316;
    }
    }
    forestValue702_303_0 = 2;
    }
    life13_305 = forestValue702_303_0;
    if (!((life10_9 == null))) {
        break forest_join_316;
    }
    }
    forestValue702_307_0 = life12_8;
    }
    if (!((life10_9 != null))) {
        forestValue702_315_0 = forestValue702_307_0;
        break forest_join_315;
    }
    if (!((forestValue702_307_0 != 0))) {
        break forest_join_314;
    }
    life13_305 = 0;
    if (!((life10_9 == null))) {
        break forest_join_316;
    }
    }
    forestValue702_315_0 = 3;
    }
    life13_305 = forestValue702_315_0;
    }
    return (__fieldRead702_74(p0))[life13_305];
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h702_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070200_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h702_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070201_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h702_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070202_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h702_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070203_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h702_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070204_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h702_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070205_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h702_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070206_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h702_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070207_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h702_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070208_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h702_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070209_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h702_10(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070210_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h702_11(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070211_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h702_12(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070212_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h702_13(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070213_0(p0);
}
private static native long __fieldRead702_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call702_1() throws Throwable;
private static native moom.DT __call702_2(moom.DT a0) throws Throwable;
private static native boolean __call702_3(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory702_4(boolean value) throws Throwable;
private static native moom.DT __call702_5(moom.DT a0) throws Throwable;
private static native boolean __call702_6(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory702_7(boolean value) throws Throwable;
private static native moom.DT __call702_8(moom.DT a0) throws Throwable;
private static native boolean __call702_9(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory702_10(boolean value) throws Throwable;
private static native moom.DT __call702_11(moom.DT a0) throws Throwable;
private static native boolean __call702_12(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory702_13(boolean value) throws Throwable;
private static native moom.DT __call702_14(moom.DT a0) throws Throwable;
private static native boolean __call702_15(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory702_16(boolean value) throws Throwable;
private static native moom.DT __call702_17(moom.DT a0) throws Throwable;
private static native boolean __call702_18(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory702_19(boolean value) throws Throwable;
private static native moom.DT __call702_20(moom.DT a0) throws Throwable;
private static native boolean __call702_21(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory702_22(boolean value) throws Throwable;
private static native moom.DT __call702_23(moom.DT a0) throws Throwable;
private static native boolean __call702_24(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory702_25(boolean value) throws Throwable;
private static native moom.DT __call702_26(moom.DT a0) throws Throwable;
private static native boolean __call702_27(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory702_28(boolean value) throws Throwable;
private static native moom.DT __call702_29(moom.DT a0) throws Throwable;
private static native boolean __call702_30(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory702_31(boolean value) throws Throwable;
private static native moom.DT __call702_32(moom.DT a0) throws Throwable;
private static native boolean __call702_33(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory702_34(boolean value) throws Throwable;
private static native moom.DT __call702_35(moom.DT a0) throws Throwable;
private static native boolean __call702_36(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory702_37(boolean value) throws Throwable;
private static native moom.DT __call702_38(moom.DT a0) throws Throwable;
private static native boolean __call702_39(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory702_40(boolean value) throws Throwable;
private static native moom.DT __call702_41(moom.DT a0) throws Throwable;
private static native boolean __call702_42(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory702_43(boolean value) throws Throwable;
private static native moom.DT __call702_44(moom.DT a0) throws Throwable;
private static native boolean __call702_45(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory702_46(boolean value) throws Throwable;
private static native moom.DT __call702_47(moom.DT a0) throws Throwable;
private static native boolean __call702_48(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory702_49(boolean value) throws Throwable;
private static native moom.DT __call702_50(moom.DT a0) throws Throwable;
private static native boolean __call702_51(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory702_52(boolean value) throws Throwable;
private static native moom.DT __call702_53(moom.DT a0) throws Throwable;
private static native boolean __call702_54(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory702_55(boolean value) throws Throwable;
private static native moom.DT __call702_56(moom.DT a0) throws Throwable;
private static native boolean __call702_57(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory702_58(boolean value) throws Throwable;
private static native moom.DT __call702_59(moom.DT a0) throws Throwable;
private static native boolean __call702_60(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory702_61(boolean value) throws Throwable;
private static native moom.DT __call702_62(moom.DT a0) throws Throwable;
private static native boolean __call702_63(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory702_64(boolean value) throws Throwable;
private static native moom.DT __call702_65(moom.DT a0) throws Throwable;
private static native boolean __call702_66(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory702_67(boolean value) throws Throwable;
private static native moom.DT __call702_68(moom.DT a0) throws Throwable;
private static native boolean __call702_69(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory702_70(boolean value) throws Throwable;
private static native moom.DT __call702_71(moom.DT a0) throws Throwable;
private static native boolean __call702_72(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory702_73(boolean value) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead702_74(moom.Jc a0) throws Throwable;
private static native java.lang.Exception __call3070200_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070201_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070202_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070203_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070204_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070205_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070206_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070207_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070208_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070209_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070210_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070211_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070212_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070213_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_8059381de0489b03af92(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, int a5, net.minecraft.client.renderer.texture.TextureAtlasSprite a6, int a7, moom.Mi a8) throws E;
private static final class __SourceHandler_8059381de0489b03af92 {

public static int f302(moom.Jc p0, net.minecraft.world.IBlockAccess p1, net.minecraft.block.state.IBlockState p2, moom.DT p3, int p4, int p5, net.minecraft.client.renderer.texture.TextureAtlasSprite p6, int p7, moom.Mi p8) throws Throwable {
    boolean[] forestValue302_86_0;
    int forestValue302_86_1;
    int forestValue302_86_2;
    boolean[] forestValue302_90_0;
    int forestValue302_90_1;
    int forestValue302_90_2;
    boolean[] forestValue302_91_0;
    int forestValue302_91_1;
    boolean[] forestValue302_92_0;
    int forestValue302_92_1;
    int forestValue302_92_2;
    boolean[] forestValue302_110_0;
    int forestValue302_110_1;
    int forestValue302_110_2;
    boolean[] forestValue302_114_0;
    int forestValue302_114_1;
    int forestValue302_114_2;
    boolean[] forestValue302_115_0;
    int forestValue302_115_1;
    boolean[] forestValue302_116_0;
    int forestValue302_116_1;
    int forestValue302_116_2;
    boolean[] forestValue302_134_0;
    int forestValue302_134_1;
    int forestValue302_134_2;
    boolean[] forestValue302_138_0;
    int forestValue302_138_1;
    int forestValue302_138_2;
    boolean[] forestValue302_139_0;
    int forestValue302_139_1;
    boolean[] forestValue302_140_0;
    int forestValue302_140_1;
    int forestValue302_140_2;
    boolean[] forestValue302_158_0;
    int forestValue302_158_1;
    int forestValue302_158_2;
    boolean[] forestValue302_162_0;
    int forestValue302_162_1;
    int forestValue302_162_2;
    boolean[] forestValue302_163_0;
    int forestValue302_163_1;
    boolean[] forestValue302_164_0;
    int forestValue302_164_1;
    int forestValue302_164_2;
    boolean[] forestValue302_240_0;
    int forestValue302_240_1;
    int forestValue302_240_2;
    boolean[] forestValue302_244_0;
    int forestValue302_244_1;
    int forestValue302_244_2;
    boolean[] forestValue302_245_0;
    int forestValue302_245_1;
    boolean[] forestValue302_246_0;
    int forestValue302_246_1;
    int forestValue302_246_2;
    boolean[] forestValue302_264_0;
    int forestValue302_264_1;
    int forestValue302_264_2;
    boolean[] forestValue302_268_0;
    int forestValue302_268_1;
    int forestValue302_268_2;
    boolean[] forestValue302_269_0;
    int forestValue302_269_1;
    boolean[] forestValue302_270_0;
    int forestValue302_270_1;
    int forestValue302_270_2;
    boolean[] forestValue302_288_0;
    int forestValue302_288_1;
    int forestValue302_288_2;
    boolean[] forestValue302_292_0;
    int forestValue302_292_1;
    int forestValue302_292_2;
    boolean[] forestValue302_293_0;
    int forestValue302_293_1;
    boolean[] forestValue302_294_0;
    int forestValue302_294_1;
    int forestValue302_294_2;
    boolean[] forestValue302_312_0;
    int forestValue302_312_1;
    int forestValue302_312_2;
    boolean[] forestValue302_316_0;
    int forestValue302_316_1;
    int forestValue302_316_2;
    boolean[] forestValue302_317_0;
    int forestValue302_317_1;
    boolean[] forestValue302_318_0;
    int forestValue302_318_1;
    int forestValue302_318_2;
    boolean[] forestValue302_394_0;
    int forestValue302_394_1;
    int forestValue302_394_2;
    boolean[] forestValue302_398_0;
    int forestValue302_398_1;
    int forestValue302_398_2;
    boolean[] forestValue302_399_0;
    int forestValue302_399_1;
    boolean[] forestValue302_400_0;
    int forestValue302_400_1;
    int forestValue302_400_2;
    boolean[] forestValue302_418_0;
    int forestValue302_418_1;
    int forestValue302_418_2;
    boolean[] forestValue302_422_0;
    int forestValue302_422_1;
    int forestValue302_422_2;
    boolean[] forestValue302_423_0;
    int forestValue302_423_1;
    boolean[] forestValue302_424_0;
    int forestValue302_424_1;
    int forestValue302_424_2;
    boolean[] forestValue302_442_0;
    int forestValue302_442_1;
    int forestValue302_442_2;
    boolean[] forestValue302_446_0;
    int forestValue302_446_1;
    int forestValue302_446_2;
    boolean[] forestValue302_447_0;
    int forestValue302_447_1;
    boolean[] forestValue302_448_0;
    int forestValue302_448_1;
    int forestValue302_448_2;
    boolean[] forestValue302_466_0;
    int forestValue302_466_1;
    int forestValue302_466_2;
    boolean[] forestValue302_470_0;
    int forestValue302_470_1;
    int forestValue302_470_2;
    boolean[] forestValue302_471_0;
    int forestValue302_471_1;
    boolean[] forestValue302_472_0;
    int forestValue302_472_1;
    int forestValue302_472_2;
    int forestValue302_474_0;
    boolean[] forestValue302_561_0;
    int forestValue302_561_1;
    int forestValue302_561_2;
    boolean[] forestValue302_565_0;
    int forestValue302_565_1;
    int forestValue302_565_2;
    boolean[] forestValue302_566_0;
    int forestValue302_566_1;
    boolean[] forestValue302_567_0;
    int forestValue302_567_1;
    int forestValue302_567_2;
    boolean[] forestValue302_585_0;
    int forestValue302_585_1;
    int forestValue302_585_2;
    boolean[] forestValue302_589_0;
    int forestValue302_589_1;
    int forestValue302_589_2;
    boolean[] forestValue302_590_0;
    int forestValue302_590_1;
    boolean[] forestValue302_591_0;
    int forestValue302_591_1;
    int forestValue302_591_2;
    boolean[] forestValue302_609_0;
    int forestValue302_609_1;
    int forestValue302_609_2;
    boolean[] forestValue302_613_0;
    int forestValue302_613_1;
    int forestValue302_613_2;
    boolean[] forestValue302_614_0;
    int forestValue302_614_1;
    boolean[] forestValue302_615_0;
    int forestValue302_615_1;
    int forestValue302_615_2;
    boolean[] forestValue302_633_0;
    int forestValue302_633_1;
    int forestValue302_633_2;
    boolean[] forestValue302_637_0;
    int forestValue302_637_1;
    int forestValue302_637_2;
    boolean[] forestValue302_638_0;
    int forestValue302_638_1;
    boolean[] forestValue302_639_0;
    int forestValue302_639_1;
    int forestValue302_639_2;
    boolean[] forestValue302_715_0;
    int forestValue302_715_1;
    int forestValue302_715_2;
    boolean[] forestValue302_719_0;
    int forestValue302_719_1;
    int forestValue302_719_2;
    boolean[] forestValue302_720_0;
    int forestValue302_720_1;
    boolean[] forestValue302_721_0;
    int forestValue302_721_1;
    int forestValue302_721_2;
    boolean[] forestValue302_739_0;
    int forestValue302_739_1;
    int forestValue302_739_2;
    boolean[] forestValue302_743_0;
    int forestValue302_743_1;
    int forestValue302_743_2;
    boolean[] forestValue302_744_0;
    int forestValue302_744_1;
    boolean[] forestValue302_745_0;
    int forestValue302_745_1;
    int forestValue302_745_2;
    boolean[] forestValue302_763_0;
    int forestValue302_763_1;
    int forestValue302_763_2;
    boolean[] forestValue302_767_0;
    int forestValue302_767_1;
    int forestValue302_767_2;
    boolean[] forestValue302_768_0;
    int forestValue302_768_1;
    boolean[] forestValue302_769_0;
    int forestValue302_769_1;
    int forestValue302_769_2;
    boolean[] forestValue302_787_0;
    int forestValue302_787_1;
    int forestValue302_787_2;
    boolean[] forestValue302_791_0;
    int forestValue302_791_1;
    int forestValue302_791_2;
    boolean[] forestValue302_792_0;
    int forestValue302_792_1;
    boolean[] forestValue302_793_0;
    int forestValue302_793_1;
    int forestValue302_793_2;
    boolean[] forestValue302_869_0;
    int forestValue302_869_1;
    int forestValue302_869_2;
    boolean[] forestValue302_873_0;
    int forestValue302_873_1;
    int forestValue302_873_2;
    boolean[] forestValue302_874_0;
    int forestValue302_874_1;
    boolean[] forestValue302_875_0;
    int forestValue302_875_1;
    int forestValue302_875_2;
    boolean[] forestValue302_893_0;
    int forestValue302_893_1;
    int forestValue302_893_2;
    boolean[] forestValue302_897_0;
    int forestValue302_897_1;
    int forestValue302_897_2;
    boolean[] forestValue302_898_0;
    int forestValue302_898_1;
    boolean[] forestValue302_899_0;
    int forestValue302_899_1;
    int forestValue302_899_2;
    boolean[] forestValue302_917_0;
    int forestValue302_917_1;
    int forestValue302_917_2;
    boolean[] forestValue302_921_0;
    int forestValue302_921_1;
    int forestValue302_921_2;
    boolean[] forestValue302_922_0;
    int forestValue302_922_1;
    boolean[] forestValue302_923_0;
    int forestValue302_923_1;
    int forestValue302_923_2;
    boolean[] forestValue302_941_0;
    int forestValue302_941_1;
    int forestValue302_941_2;
    boolean[] forestValue302_945_0;
    int forestValue302_945_1;
    int forestValue302_945_2;
    boolean[] forestValue302_946_0;
    int forestValue302_946_1;
    boolean[] forestValue302_947_0;
    int forestValue302_947_1;
    int forestValue302_947_2;
    int forestValue302_949_0;
    int forestValue302_962_0;
    int forestValue302_973_0;
    int forestValue302_973_1;
    int forestValue302_974_0;
    int forestValue302_975_0;
    int forestValue302_975_1;
    int forestValue302_983_0;
    int forestValue302_983_1;
    int forestValue302_984_0;
    int forestValue302_985_0;
    int forestValue302_985_1;
    int forestValue302_993_0;
    int forestValue302_993_1;
    int forestValue302_994_0;
    int forestValue302_995_0;
    int forestValue302_995_1;
    int forestValue302_1006_0;
    int forestValue302_1010_0;
    int forestValue302_1012_0;
    int forestValue302_1023_0;
    int forestValue302_1023_1;
    int forestValue302_1024_0;
    int forestValue302_1025_0;
    int forestValue302_1025_1;
    int forestValue302_1033_0;
    int forestValue302_1033_1;
    int forestValue302_1034_0;
    int forestValue302_1035_0;
    int forestValue302_1035_1;
    int forestValue302_1046_0;
    int forestValue302_1050_0;
    int forestValue302_1052_0;
    int forestValue302_1059_0;
    int forestValue302_1059_1;
    int forestValue302_1060_0;
    int forestValue302_1061_0;
    int forestValue302_1061_1;
    int forestValue302_1073_0;
    int forestValue302_1073_1;
    int forestValue302_1074_0;
    int forestValue302_1075_0;
    int forestValue302_1075_1;
    int forestValue302_1090_0;
    int forestValue302_1094_0;
    int forestValue302_1096_0;
    int forestValue302_1103_0;
    int forestValue302_1103_1;
    int forestValue302_1104_0;
    int forestValue302_1105_0;
    int forestValue302_1105_1;
    int forestValue302_1113_0;
    int forestValue302_1113_1;
    int forestValue302_1114_0;
    int forestValue302_1115_0;
    int forestValue302_1115_1;
    int forestValue302_1138_0;
    int forestValue302_1145_0;
    int forestValue302_1145_1;
    int forestValue302_1146_0;
    int forestValue302_1147_0;
    int forestValue302_1147_1;
    int forestValue302_1155_0;
    int forestValue302_1155_1;
    int forestValue302_1156_0;
    int forestValue302_1157_0;
    int forestValue302_1157_1;
    int forestValue302_1168_0;
    int forestValue302_1172_0;
    int forestValue302_1174_0;
    int forestValue302_1181_0;
    int forestValue302_1181_1;
    int forestValue302_1182_0;
    int forestValue302_1183_0;
    int forestValue302_1183_1;
    int forestValue302_1206_0;
    int forestValue302_1213_0;
    int forestValue302_1213_1;
    int forestValue302_1214_0;
    int forestValue302_1215_0;
    int forestValue302_1215_1;
    int forestValue302_1227_0;
    int forestValue302_1227_1;
    int forestValue302_1228_0;
    int forestValue302_1229_0;
    int forestValue302_1229_1;
    int forestValue302_1244_0;
    int forestValue302_1251_0;
    int forestValue302_1251_1;
    int forestValue302_1252_0;
    int forestValue302_1253_0;
    int forestValue302_1253_1;
    int forestValue302_1261_0;
    int forestValue302_1261_1;
    int forestValue302_1262_0;
    int forestValue302_1263_0;
    int forestValue302_1263_1;
    int forestValue302_1282_0;
    int forestValue302_1286_0;
    int forestValue302_1288_0;
    int forestValue302_1303_0;
    int forestValue302_1303_1;
    int forestValue302_1304_0;
    int forestValue302_1305_0;
    int forestValue302_1305_1;
    int forestValue302_1320_0;
    int forestValue302_1324_0;
    int forestValue302_1326_0;
    int forestValue302_1337_0;
    int forestValue302_1337_1;
    int forestValue302_1338_0;
    int forestValue302_1339_0;
    int forestValue302_1339_1;
    int forestValue302_1358_0;
    int forestValue302_1362_0;
    int forestValue302_1364_0;
    int forestValue302_1390_0;
    int forestValue302_1397_0;
    int forestValue302_1397_1;
    int forestValue302_1398_0;
    int forestValue302_1399_0;
    int forestValue302_1399_1;
    int forestValue302_1426_0;
    int forestValue302_1433_0;
    int forestValue302_1433_1;
    int forestValue302_1434_0;
    int forestValue302_1435_0;
    int forestValue302_1435_1;
    int forestValue302_1462_0;
    int forestValue302_1469_0;
    int forestValue302_1469_1;
    int forestValue302_1470_0;
    int forestValue302_1471_0;
    int forestValue302_1471_1;
    int forestValue302_1498_0;
    int forestValue302_1508_0;
    int forestValue302_1514_0;
    int forestValue302_1520_0;
    boolean[] forestValue302_1539_0;
    int forestValue302_1539_1;
    int forestValue302_1539_2;
    boolean[] forestValue302_1540_0;
    int forestValue302_1540_1;
    boolean[] forestValue302_1541_0;
    int forestValue302_1541_1;
    int forestValue302_1541_2;
    boolean[] forestValue302_1558_0;
    int forestValue302_1558_1;
    int forestValue302_1558_2;
    boolean[] forestValue302_1559_0;
    int forestValue302_1559_1;
    boolean[] forestValue302_1560_0;
    int forestValue302_1560_1;
    int forestValue302_1560_2;
    boolean[] forestValue302_1577_0;
    int forestValue302_1577_1;
    int forestValue302_1577_2;
    boolean[] forestValue302_1578_0;
    int forestValue302_1578_1;
    boolean[] forestValue302_1579_0;
    int forestValue302_1579_1;
    int forestValue302_1579_2;
    boolean[] forestValue302_1596_0;
    int forestValue302_1596_1;
    int forestValue302_1596_2;
    boolean[] forestValue302_1597_0;
    int forestValue302_1597_1;
    boolean[] forestValue302_1598_0;
    int forestValue302_1598_1;
    int forestValue302_1598_2;
    boolean[] forestValue302_1628_0;
    int forestValue302_1628_1;
    boolean[] forestValue302_1629_0;
    int forestValue302_1629_1;
    int forestValue302_1629_2;
    boolean[] forestValue302_1630_0;
    int forestValue302_1630_1;
    boolean[] forestValue302_1631_0;
    int forestValue302_1631_1;
    int forestValue302_1631_2;
    boolean[] forestValue302_1653_0;
    int forestValue302_1653_1;
    boolean[] forestValue302_1654_0;
    int forestValue302_1654_1;
    int forestValue302_1654_2;
    boolean[] forestValue302_1655_0;
    int forestValue302_1655_1;
    boolean[] forestValue302_1656_0;
    int forestValue302_1656_1;
    int forestValue302_1656_2;
    boolean[] forestValue302_1678_0;
    int forestValue302_1678_1;
    boolean[] forestValue302_1679_0;
    int forestValue302_1679_1;
    int forestValue302_1679_2;
    boolean[] forestValue302_1680_0;
    int forestValue302_1680_1;
    boolean[] forestValue302_1681_0;
    int forestValue302_1681_1;
    int forestValue302_1681_2;
    boolean[] forestValue302_1703_0;
    int forestValue302_1703_1;
    boolean[] forestValue302_1704_0;
    int forestValue302_1704_1;
    int forestValue302_1704_2;
    boolean[] forestValue302_1705_0;
    int forestValue302_1705_1;
    boolean[] forestValue302_1706_0;
    int forestValue302_1706_1;
    int forestValue302_1706_2;
    boolean[] forestValue302_1725_0;
    int forestValue302_1725_1;
    int forestValue302_1725_2;
    boolean[] forestValue302_1726_0;
    int forestValue302_1726_1;
    boolean[] forestValue302_1727_0;
    int forestValue302_1727_1;
    int forestValue302_1727_2;
    boolean[] forestValue302_1744_0;
    int forestValue302_1744_1;
    int forestValue302_1744_2;
    boolean[] forestValue302_1745_0;
    int forestValue302_1745_1;
    boolean[] forestValue302_1746_0;
    int forestValue302_1746_1;
    int forestValue302_1746_2;
    boolean[] forestValue302_1763_0;
    int forestValue302_1763_1;
    int forestValue302_1763_2;
    boolean[] forestValue302_1764_0;
    int forestValue302_1764_1;
    boolean[] forestValue302_1765_0;
    int forestValue302_1765_1;
    int forestValue302_1765_2;
    boolean[] forestValue302_1782_0;
    int forestValue302_1782_1;
    int forestValue302_1782_2;
    boolean[] forestValue302_1783_0;
    int forestValue302_1783_1;
    boolean[] forestValue302_1784_0;
    int forestValue302_1784_1;
    int forestValue302_1784_2;
    boolean[] forestValue302_1814_0;
    int forestValue302_1814_1;
    boolean[] forestValue302_1815_0;
    int forestValue302_1815_1;
    int forestValue302_1815_2;
    boolean[] forestValue302_1816_0;
    int forestValue302_1816_1;
    boolean[] forestValue302_1817_0;
    int forestValue302_1817_1;
    int forestValue302_1817_2;
    boolean[] forestValue302_1839_0;
    int forestValue302_1839_1;
    boolean[] forestValue302_1840_0;
    int forestValue302_1840_1;
    int forestValue302_1840_2;
    boolean[] forestValue302_1841_0;
    int forestValue302_1841_1;
    boolean[] forestValue302_1842_0;
    int forestValue302_1842_1;
    int forestValue302_1842_2;
    boolean[] forestValue302_1864_0;
    int forestValue302_1864_1;
    boolean[] forestValue302_1865_0;
    int forestValue302_1865_1;
    int forestValue302_1865_2;
    boolean[] forestValue302_1866_0;
    int forestValue302_1866_1;
    boolean[] forestValue302_1867_0;
    int forestValue302_1867_1;
    int forestValue302_1867_2;
    boolean[] forestValue302_1889_0;
    int forestValue302_1889_1;
    boolean[] forestValue302_1890_0;
    int forestValue302_1890_1;
    int forestValue302_1890_2;
    boolean[] forestValue302_1891_0;
    int forestValue302_1891_1;
    boolean[] forestValue302_1892_0;
    int forestValue302_1892_1;
    int forestValue302_1892_2;
    boolean[] forestValue302_1911_0;
    int forestValue302_1911_1;
    int forestValue302_1911_2;
    boolean[] forestValue302_1912_0;
    int forestValue302_1912_1;
    boolean[] forestValue302_1913_0;
    int forestValue302_1913_1;
    int forestValue302_1913_2;
    boolean[] forestValue302_1930_0;
    int forestValue302_1930_1;
    int forestValue302_1930_2;
    boolean[] forestValue302_1931_0;
    int forestValue302_1931_1;
    boolean[] forestValue302_1932_0;
    int forestValue302_1932_1;
    int forestValue302_1932_2;
    boolean[] forestValue302_1949_0;
    int forestValue302_1949_1;
    int forestValue302_1949_2;
    boolean[] forestValue302_1950_0;
    int forestValue302_1950_1;
    boolean[] forestValue302_1951_0;
    int forestValue302_1951_1;
    int forestValue302_1951_2;
    boolean[] forestValue302_1968_0;
    int forestValue302_1968_1;
    int forestValue302_1968_2;
    boolean[] forestValue302_1969_0;
    int forestValue302_1969_1;
    boolean[] forestValue302_1970_0;
    int forestValue302_1970_1;
    int forestValue302_1970_2;
    boolean[] forestValue302_2000_0;
    int forestValue302_2000_1;
    boolean[] forestValue302_2001_0;
    int forestValue302_2001_1;
    int forestValue302_2001_2;
    boolean[] forestValue302_2002_0;
    int forestValue302_2002_1;
    boolean[] forestValue302_2003_0;
    int forestValue302_2003_1;
    int forestValue302_2003_2;
    boolean[] forestValue302_2025_0;
    int forestValue302_2025_1;
    boolean[] forestValue302_2026_0;
    int forestValue302_2026_1;
    int forestValue302_2026_2;
    boolean[] forestValue302_2027_0;
    int forestValue302_2027_1;
    boolean[] forestValue302_2028_0;
    int forestValue302_2028_1;
    int forestValue302_2028_2;
    boolean[] forestValue302_2050_0;
    int forestValue302_2050_1;
    boolean[] forestValue302_2051_0;
    int forestValue302_2051_1;
    int forestValue302_2051_2;
    boolean[] forestValue302_2052_0;
    int forestValue302_2052_1;
    boolean[] forestValue302_2053_0;
    int forestValue302_2053_1;
    int forestValue302_2053_2;
    boolean[] forestValue302_2075_0;
    int forestValue302_2075_1;
    boolean[] forestValue302_2076_0;
    int forestValue302_2076_1;
    int forestValue302_2076_2;
    boolean[] forestValue302_2077_0;
    int forestValue302_2077_1;
    boolean[] forestValue302_2078_0;
    int forestValue302_2078_1;
    int forestValue302_2078_2;
    int forestValue302_2080_0;
    boolean[] forestValue302_2110_0;
    int forestValue302_2110_1;
    int forestValue302_2110_2;
    boolean[] forestValue302_2111_0;
    int forestValue302_2111_1;
    boolean[] forestValue302_2112_0;
    int forestValue302_2112_1;
    int forestValue302_2112_2;
    boolean[] forestValue302_2129_0;
    int forestValue302_2129_1;
    int forestValue302_2129_2;
    boolean[] forestValue302_2130_0;
    int forestValue302_2130_1;
    boolean[] forestValue302_2131_0;
    int forestValue302_2131_1;
    int forestValue302_2131_2;
    boolean[] forestValue302_2148_0;
    int forestValue302_2148_1;
    int forestValue302_2148_2;
    boolean[] forestValue302_2149_0;
    int forestValue302_2149_1;
    boolean[] forestValue302_2150_0;
    int forestValue302_2150_1;
    int forestValue302_2150_2;
    boolean[] forestValue302_2167_0;
    int forestValue302_2167_1;
    int forestValue302_2167_2;
    boolean[] forestValue302_2168_0;
    int forestValue302_2168_1;
    boolean[] forestValue302_2169_0;
    int forestValue302_2169_1;
    int forestValue302_2169_2;
    boolean[] forestValue302_2199_0;
    int forestValue302_2199_1;
    boolean[] forestValue302_2200_0;
    int forestValue302_2200_1;
    int forestValue302_2200_2;
    boolean[] forestValue302_2201_0;
    int forestValue302_2201_1;
    boolean[] forestValue302_2202_0;
    int forestValue302_2202_1;
    int forestValue302_2202_2;
    boolean[] forestValue302_2224_0;
    int forestValue302_2224_1;
    boolean[] forestValue302_2225_0;
    int forestValue302_2225_1;
    int forestValue302_2225_2;
    boolean[] forestValue302_2226_0;
    int forestValue302_2226_1;
    boolean[] forestValue302_2227_0;
    int forestValue302_2227_1;
    int forestValue302_2227_2;
    boolean[] forestValue302_2249_0;
    int forestValue302_2249_1;
    boolean[] forestValue302_2250_0;
    int forestValue302_2250_1;
    int forestValue302_2250_2;
    boolean[] forestValue302_2251_0;
    int forestValue302_2251_1;
    boolean[] forestValue302_2252_0;
    int forestValue302_2252_1;
    int forestValue302_2252_2;
    boolean[] forestValue302_2274_0;
    int forestValue302_2274_1;
    boolean[] forestValue302_2275_0;
    int forestValue302_2275_1;
    int forestValue302_2275_2;
    boolean[] forestValue302_2276_0;
    int forestValue302_2276_1;
    boolean[] forestValue302_2277_0;
    int forestValue302_2277_1;
    int forestValue302_2277_2;
    boolean[] forestValue302_2296_0;
    int forestValue302_2296_1;
    int forestValue302_2296_2;
    boolean[] forestValue302_2297_0;
    int forestValue302_2297_1;
    boolean[] forestValue302_2298_0;
    int forestValue302_2298_1;
    int forestValue302_2298_2;
    boolean[] forestValue302_2315_0;
    int forestValue302_2315_1;
    int forestValue302_2315_2;
    boolean[] forestValue302_2316_0;
    int forestValue302_2316_1;
    boolean[] forestValue302_2317_0;
    int forestValue302_2317_1;
    int forestValue302_2317_2;
    boolean[] forestValue302_2334_0;
    int forestValue302_2334_1;
    int forestValue302_2334_2;
    boolean[] forestValue302_2335_0;
    int forestValue302_2335_1;
    boolean[] forestValue302_2336_0;
    int forestValue302_2336_1;
    int forestValue302_2336_2;
    boolean[] forestValue302_2353_0;
    int forestValue302_2353_1;
    int forestValue302_2353_2;
    boolean[] forestValue302_2354_0;
    int forestValue302_2354_1;
    boolean[] forestValue302_2355_0;
    int forestValue302_2355_1;
    int forestValue302_2355_2;
    boolean[] forestValue302_2385_0;
    int forestValue302_2385_1;
    boolean[] forestValue302_2386_0;
    int forestValue302_2386_1;
    int forestValue302_2386_2;
    boolean[] forestValue302_2387_0;
    int forestValue302_2387_1;
    boolean[] forestValue302_2388_0;
    int forestValue302_2388_1;
    int forestValue302_2388_2;
    boolean[] forestValue302_2410_0;
    int forestValue302_2410_1;
    boolean[] forestValue302_2411_0;
    int forestValue302_2411_1;
    int forestValue302_2411_2;
    boolean[] forestValue302_2412_0;
    int forestValue302_2412_1;
    boolean[] forestValue302_2413_0;
    int forestValue302_2413_1;
    int forestValue302_2413_2;
    boolean[] forestValue302_2435_0;
    int forestValue302_2435_1;
    boolean[] forestValue302_2436_0;
    int forestValue302_2436_1;
    int forestValue302_2436_2;
    boolean[] forestValue302_2437_0;
    int forestValue302_2437_1;
    boolean[] forestValue302_2438_0;
    int forestValue302_2438_1;
    int forestValue302_2438_2;
    boolean[] forestValue302_2460_0;
    int forestValue302_2460_1;
    boolean[] forestValue302_2461_0;
    int forestValue302_2461_1;
    int forestValue302_2461_2;
    boolean[] forestValue302_2462_0;
    int forestValue302_2462_1;
    boolean[] forestValue302_2463_0;
    int forestValue302_2463_1;
    int forestValue302_2463_2;
    boolean[] forestValue302_2482_0;
    int forestValue302_2482_1;
    int forestValue302_2482_2;
    boolean[] forestValue302_2483_0;
    int forestValue302_2483_1;
    boolean[] forestValue302_2484_0;
    int forestValue302_2484_1;
    int forestValue302_2484_2;
    boolean[] forestValue302_2501_0;
    int forestValue302_2501_1;
    int forestValue302_2501_2;
    boolean[] forestValue302_2502_0;
    int forestValue302_2502_1;
    boolean[] forestValue302_2503_0;
    int forestValue302_2503_1;
    int forestValue302_2503_2;
    boolean[] forestValue302_2520_0;
    int forestValue302_2520_1;
    int forestValue302_2520_2;
    boolean[] forestValue302_2521_0;
    int forestValue302_2521_1;
    boolean[] forestValue302_2522_0;
    int forestValue302_2522_1;
    int forestValue302_2522_2;
    boolean[] forestValue302_2539_0;
    int forestValue302_2539_1;
    int forestValue302_2539_2;
    boolean[] forestValue302_2540_0;
    int forestValue302_2540_1;
    boolean[] forestValue302_2541_0;
    int forestValue302_2541_1;
    int forestValue302_2541_2;
    boolean[] forestValue302_2571_0;
    int forestValue302_2571_1;
    boolean[] forestValue302_2572_0;
    int forestValue302_2572_1;
    int forestValue302_2572_2;
    boolean[] forestValue302_2573_0;
    int forestValue302_2573_1;
    boolean[] forestValue302_2574_0;
    int forestValue302_2574_1;
    int forestValue302_2574_2;
    boolean[] forestValue302_2596_0;
    int forestValue302_2596_1;
    boolean[] forestValue302_2597_0;
    int forestValue302_2597_1;
    int forestValue302_2597_2;
    boolean[] forestValue302_2598_0;
    int forestValue302_2598_1;
    boolean[] forestValue302_2599_0;
    int forestValue302_2599_1;
    int forestValue302_2599_2;
    boolean[] forestValue302_2621_0;
    int forestValue302_2621_1;
    boolean[] forestValue302_2622_0;
    int forestValue302_2622_1;
    int forestValue302_2622_2;
    boolean[] forestValue302_2623_0;
    int forestValue302_2623_1;
    boolean[] forestValue302_2624_0;
    int forestValue302_2624_1;
    int forestValue302_2624_2;
    boolean[] forestValue302_2646_0;
    int forestValue302_2646_1;
    boolean[] forestValue302_2647_0;
    int forestValue302_2647_1;
    int forestValue302_2647_2;
    boolean[] forestValue302_2648_0;
    int forestValue302_2648_1;
    boolean[] forestValue302_2649_0;
    int forestValue302_2649_1;
    int forestValue302_2649_2;
    int forestValue302_2651_0;
    int forestValue302_2664_0;
    int forestValue302_2669_0;
    int forestValue302_2669_1;
    int forestValue302_2683_0;
    int forestValue302_2688_0;
    int forestValue302_2688_1;
    int forestValue302_2702_0;
    int forestValue302_2707_0;
    int forestValue302_2707_1;
    int forestValue302_2725_0;
    int forestValue302_2730_0;
    int forestValue302_2730_1;
    int forestValue302_2748_0;
    int forestValue302_2753_0;
    int forestValue302_2753_1;
    int forestValue302_2777_0;
    int forestValue302_2782_0;
    int forestValue302_2782_1;
    int forestValue302_2806_0;
    int forestValue302_2811_0;
    int forestValue302_2811_1;
    int forestValue302_2835_0;
    int forestValue302_2840_0;
    int forestValue302_2840_1;
    int forestValue302_2864_0;
    int forestValue302_2869_0;
    int forestValue302_2869_1;
    int forestValue302_2893_0;
    int forestValue302_2898_0;
    int forestValue302_2898_1;
    int forestValue302_2922_0;
    int forestValue302_2927_0;
    int forestValue302_2927_1;
    int forestValue302_2951_0;
    int forestValue302_2956_0;
    int forestValue302_2956_1;
    int forestValue302_2980_0;
    int forestValue302_2985_0;
    int forestValue302_2985_1;
    int forestValue302_3009_0;
    int forestValue302_3014_0;
    int forestValue302_3014_1;
    int forestValue302_3038_0;
    int forestValue302_3043_0;
    int forestValue302_3043_1;
    int forestValue302_3067_0;
    int forestValue302_3072_0;
    int forestValue302_3072_1;
    int forestValue302_3096_0;
    int forestValue302_3101_0;
    int forestValue302_3101_1;
    int forestValue302_3137_0;
    int forestValue302_3142_0;
    int forestValue302_3142_1;
    int forestValue302_3178_0;
    int forestValue302_3183_0;
    int forestValue302_3183_1;
    int forestValue302_3219_0;
    int forestValue302_3224_0;
    int forestValue302_3224_1;
    int forestValue302_3260_0;
    int forestValue302_3265_0;
    int forestValue302_3265_1;
    int forestValue302_3301_0;
    int forestValue302_3306_0;
    int forestValue302_3306_1;
    int forestValue302_3342_0;
    int forestValue302_3347_0;
    int forestValue302_3347_1;
    int forestValue302_3383_0;
    int forestValue302_3388_0;
    int forestValue302_3388_1;
    int forestValue302_3424_0;
    int forestValue302_3429_0;
    int forestValue302_3429_1;
    int forestValue302_3465_0;
    int forestValue302_3470_0;
    int forestValue302_3470_1;
    int forestValue302_3506_0;
    int forestValue302_3511_0;
    int forestValue302_3511_1;
    int forestValue302_3547_0;
    int forestValue302_3552_0;
    int forestValue302_3552_1;
    int forestValue302_3588_0;
    int forestValue302_3593_0;
    int forestValue302_3593_1;
    int forestValue302_3629_0;
    int forestValue302_3634_0;
    int forestValue302_3634_1;
    int forestValue302_3670_0;
    int forestValue302_3677_0;
    int forestValue302_3677_1;
    int forestValue302_3709_0;
    net.minecraft.entity.Entity[] spill302_0;
    int spill302_1;
    boolean spill302_2;
    boolean[] spill302_3;
    int spill302_4;
    boolean spill302_5;
    boolean[] spill302_6;
    int spill302_7;
    boolean spill302_8;
    boolean[] spill302_9;
    int spill302_10;
    boolean spill302_11;
    boolean[] spill302_12;
    int spill302_13;
    boolean spill302_14;
    boolean spill302_15;
    boolean[] spill302_16;
    int spill302_17;
    boolean spill302_18;
    boolean[] spill302_19;
    int spill302_20;
    boolean spill302_21;
    boolean[] spill302_22;
    int spill302_23;
    boolean spill302_24;
    boolean[] spill302_25;
    int spill302_26;
    boolean spill302_27;
    boolean spill302_28;
    boolean[] spill302_29;
    int spill302_30;
    boolean spill302_31;
    boolean[] spill302_32;
    int spill302_33;
    boolean spill302_34;
    boolean[] spill302_35;
    int spill302_36;
    boolean spill302_37;
    boolean[] spill302_38;
    int spill302_39;
    boolean spill302_40;
    boolean spill302_41;
    boolean[] spill302_42;
    int spill302_43;
    boolean spill302_44;
    boolean[] spill302_45;
    int spill302_46;
    boolean spill302_47;
    boolean[] spill302_48;
    int spill302_49;
    boolean spill302_50;
    boolean[] spill302_51;
    int spill302_52;
    boolean spill302_53;
    boolean spill302_54;
    boolean[] spill302_55;
    int spill302_56;
    boolean spill302_57;
    boolean[] spill302_58;
    int spill302_59;
    boolean spill302_60;
    boolean[] spill302_61;
    int spill302_62;
    boolean spill302_63;
    boolean[] spill302_64;
    int spill302_65;
    boolean spill302_66;
    boolean spill302_67;
    boolean[] spill302_68;
    int spill302_69;
    boolean spill302_70;
    boolean[] spill302_71;
    int spill302_72;
    boolean spill302_73;
    boolean[] spill302_74;
    int spill302_75;
    boolean spill302_76;
    boolean[] spill302_77;
    int spill302_78;
    boolean spill302_79;
    boolean spill302_80;
    boolean spill302_81;
    int spill302_82;
    boolean spill302_83;
    int spill302_84;
    boolean spill302_85;
    int spill302_86;
    int spill302_87;
    boolean spill302_88;
    int spill302_89;
    boolean spill302_90;
    int spill302_91;
    boolean spill302_92;
    int spill302_93;
    boolean spill302_94;
    int spill302_95;
    boolean spill302_96;
    int spill302_97;
    boolean spill302_98;
    int spill302_99;
    boolean spill302_100;
    int spill302_101;
    boolean spill302_102;
    int spill302_103;
    boolean spill302_104;
    int spill302_105;
    boolean spill302_106;
    int spill302_107;
    boolean spill302_108;
    int spill302_109;
    boolean spill302_110;
    int spill302_111;
    boolean spill302_112;
    int spill302_113;
    int spill302_114;
    boolean spill302_115;
    int spill302_116;
    int spill302_117;
    boolean spill302_118;
    int spill302_119;
    int spill302_120;
    boolean spill302_121;
    int spill302_122;
    boolean spill302_123;
    int spill302_124;
    boolean spill302_125;
    int spill302_126;
    boolean[] spill302_127;
    int spill302_128;
    boolean spill302_129;
    boolean[] spill302_130;
    int spill302_131;
    boolean spill302_132;
    boolean[] spill302_133;
    int spill302_134;
    boolean spill302_135;
    boolean[] spill302_136;
    int spill302_137;
    boolean spill302_138;
    boolean spill302_139;
    boolean[] spill302_140;
    int spill302_141;
    boolean spill302_142;
    boolean spill302_143;
    boolean[] spill302_144;
    int spill302_145;
    boolean spill302_146;
    boolean spill302_147;
    boolean[] spill302_148;
    int spill302_149;
    boolean spill302_150;
    boolean spill302_151;
    boolean[] spill302_152;
    int spill302_153;
    boolean spill302_154;
    boolean spill302_155;
    boolean[] spill302_156;
    int spill302_157;
    boolean spill302_158;
    boolean[] spill302_159;
    int spill302_160;
    boolean spill302_161;
    boolean[] spill302_162;
    int spill302_163;
    boolean spill302_164;
    boolean[] spill302_165;
    int spill302_166;
    boolean spill302_167;
    boolean spill302_168;
    boolean[] spill302_169;
    int spill302_170;
    boolean spill302_171;
    boolean spill302_172;
    boolean[] spill302_173;
    int spill302_174;
    boolean spill302_175;
    boolean spill302_176;
    boolean[] spill302_177;
    int spill302_178;
    boolean spill302_179;
    boolean spill302_180;
    boolean[] spill302_181;
    int spill302_182;
    boolean spill302_183;
    boolean spill302_184;
    boolean[] spill302_185;
    int spill302_186;
    boolean spill302_187;
    boolean[] spill302_188;
    int spill302_189;
    boolean spill302_190;
    boolean[] spill302_191;
    int spill302_192;
    boolean spill302_193;
    boolean[] spill302_194;
    int spill302_195;
    boolean spill302_196;
    boolean spill302_197;
    boolean[] spill302_198;
    int spill302_199;
    boolean spill302_200;
    boolean spill302_201;
    boolean[] spill302_202;
    int spill302_203;
    boolean spill302_204;
    boolean spill302_205;
    boolean[] spill302_206;
    int spill302_207;
    boolean spill302_208;
    boolean spill302_209;
    boolean[] spill302_210;
    int spill302_211;
    boolean spill302_212;
    boolean spill302_213;
    int spill302_214;
    boolean[] spill302_215;
    int spill302_216;
    boolean spill302_217;
    boolean[] spill302_218;
    int spill302_219;
    boolean spill302_220;
    boolean[] spill302_221;
    int spill302_222;
    boolean spill302_223;
    boolean[] spill302_224;
    int spill302_225;
    boolean spill302_226;
    boolean spill302_227;
    boolean[] spill302_228;
    int spill302_229;
    boolean spill302_230;
    boolean spill302_231;
    boolean[] spill302_232;
    int spill302_233;
    boolean spill302_234;
    boolean spill302_235;
    boolean[] spill302_236;
    int spill302_237;
    boolean spill302_238;
    boolean spill302_239;
    boolean[] spill302_240;
    int spill302_241;
    boolean spill302_242;
    boolean spill302_243;
    boolean[] spill302_244;
    int spill302_245;
    boolean spill302_246;
    boolean[] spill302_247;
    int spill302_248;
    boolean spill302_249;
    boolean[] spill302_250;
    int spill302_251;
    boolean spill302_252;
    boolean[] spill302_253;
    int spill302_254;
    boolean spill302_255;
    boolean spill302_256;
    boolean[] spill302_257;
    int spill302_258;
    boolean spill302_259;
    boolean spill302_260;
    boolean[] spill302_261;
    int spill302_262;
    boolean spill302_263;
    boolean spill302_264;
    boolean[] spill302_265;
    int spill302_266;
    boolean spill302_267;
    boolean spill302_268;
    boolean[] spill302_269;
    int spill302_270;
    boolean spill302_271;
    boolean spill302_272;
    boolean[] spill302_273;
    int spill302_274;
    boolean spill302_275;
    boolean[] spill302_276;
    int spill302_277;
    boolean spill302_278;
    boolean[] spill302_279;
    int spill302_280;
    boolean spill302_281;
    boolean[] spill302_282;
    int spill302_283;
    boolean spill302_284;
    boolean spill302_285;
    boolean[] spill302_286;
    int spill302_287;
    boolean spill302_288;
    boolean spill302_289;
    boolean[] spill302_290;
    int spill302_291;
    boolean spill302_292;
    boolean spill302_293;
    boolean[] spill302_294;
    int spill302_295;
    boolean spill302_296;
    boolean spill302_297;
    boolean[] spill302_298;
    int spill302_299;
    boolean spill302_300;
    boolean spill302_301;
    int spill302_302;
    boolean spill302_303;
    boolean spill302_304;
    boolean spill302_305;
    boolean spill302_306;
    boolean spill302_307;
    boolean spill302_308;
    boolean spill302_309;
    boolean spill302_310;
    boolean spill302_311;
    boolean spill302_312;
    boolean spill302_313;
    boolean spill302_314;
    boolean spill302_315;
    boolean spill302_316;
    boolean spill302_317;
    boolean spill302_318;
    boolean spill302_319;
    boolean spill302_320;
    boolean spill302_321;
    boolean spill302_322;
    boolean spill302_323;
    boolean spill302_324;
    boolean spill302_325;
    boolean spill302_326;
    boolean spill302_327;
    boolean spill302_328;
    boolean spill302_329;
    boolean spill302_330;
    boolean spill302_331;
    boolean spill302_332;
    boolean spill302_333;
    boolean spill302_334;
    boolean spill302_335;
    boolean spill302_336;
    boolean spill302_337;
    boolean spill302_338;
    boolean spill302_339;
    boolean spill302_340;
    boolean spill302_341;
    boolean spill302_342;
    boolean spill302_343;
    boolean spill302_344;
    boolean spill302_345;
    boolean spill302_346;
    boolean spill302_347;
    boolean spill302_348;
    boolean spill302_349;
    boolean spill302_350;
    boolean spill302_351;
    boolean spill302_352;
    boolean spill302_353;
    boolean spill302_354;
    boolean spill302_355;
    boolean spill302_356;
    boolean spill302_357;
    boolean spill302_358;
    boolean spill302_359;
    boolean spill302_360;
    boolean spill302_361;
    boolean spill302_362;
    boolean spill302_363;
    boolean spill302_364;
    boolean spill302_365;
    boolean spill302_366;
    boolean spill302_367;
    boolean spill302_368;
    boolean spill302_369;
    boolean spill302_370;
    boolean spill302_371;
    boolean spill302_372;
    boolean spill302_373;
    boolean spill302_374;
    boolean spill302_375;
    boolean spill302_376;
    boolean spill302_377;
    boolean spill302_378;
    boolean spill302_379;
    boolean spill302_380;
    boolean spill302_381;
    boolean spill302_382;
    boolean spill302_383;
    boolean spill302_384;
    boolean spill302_385;
    boolean spill302_386;
    boolean spill302_387;
    boolean spill302_388;
    boolean spill302_389;
    boolean spill302_390;
    long life9_3;
    boolean[] life12_7;
    net.minecraft.entity.Entity[] life11_8;
    moom.DT life13_70;
    moom.DT life13_238;
    moom.DT life13_406;
    moom.DT life13_589;
    moom.DT life13_757;
    moom.DT life13_925;
    int life13_1050;
    moom.DT life14_1759;
    moom.DT life14_1963;
    moom.DT life14_2167;
    moom.DT life14_2386;
    moom.DT life14_2590;
    moom.DT life14_2794;
    forest_join_3709: {
    forest_join_3708: {
    forest_join_3677: {
    forest_join_3670: {
    forest_join_3669: {
    forest_join_3634: {
    forest_join_3629: {
    forest_join_3628: {
    forest_join_3593: {
    forest_join_3588: {
    forest_join_3587: {
    forest_join_3552: {
    forest_join_3547: {
    forest_join_3546: {
    forest_join_3511: {
    forest_join_3506: {
    forest_join_3505: {
    forest_join_3470: {
    forest_join_3465: {
    forest_join_3464: {
    forest_join_3429: {
    forest_join_3424: {
    forest_join_3423: {
    forest_join_3388: {
    forest_join_3383: {
    forest_join_3382: {
    forest_join_3347: {
    forest_join_3342: {
    forest_join_3341: {
    forest_join_3306: {
    forest_join_3301: {
    forest_join_3300: {
    forest_join_3265: {
    forest_join_3260: {
    forest_join_3259: {
    forest_join_3224: {
    forest_join_3219: {
    forest_join_3218: {
    forest_join_3183: {
    forest_join_3178: {
    forest_join_3177: {
    forest_join_3142: {
    forest_join_3137: {
    forest_join_3136: {
    forest_join_3101: {
    forest_join_3096: {
    forest_join_3095: {
    forest_join_3072: {
    forest_join_3067: {
    forest_join_3066: {
    forest_join_3043: {
    forest_join_3038: {
    forest_join_3037: {
    forest_join_3014: {
    forest_join_3009: {
    forest_join_3008: {
    forest_join_2985: {
    forest_join_2980: {
    forest_join_2979: {
    forest_join_2956: {
    forest_join_2951: {
    forest_join_2950: {
    forest_join_2927: {
    forest_join_2922: {
    forest_join_2921: {
    forest_join_2898: {
    forest_join_2893: {
    forest_join_2892: {
    forest_join_2869: {
    forest_join_2864: {
    forest_join_2863: {
    forest_join_2840: {
    forest_join_2835: {
    forest_join_2834: {
    forest_join_2811: {
    forest_join_2806: {
    forest_join_2805: {
    forest_join_2782: {
    forest_join_2777: {
    forest_join_2776: {
    forest_join_2753: {
    forest_join_2748: {
    forest_join_2747: {
    forest_join_2730: {
    forest_join_2725: {
    forest_join_2724: {
    forest_join_2707: {
    forest_join_2702: {
    forest_join_2701: {
    forest_join_2688: {
    forest_join_2683: {
    forest_join_2682: {
    forest_join_2669: {
    forest_join_2664: {
    forest_join_2663: {
    forest_join_2651: {
    forest_join_2650: {
    forest_join_2649: {
    forest_join_2648: {
    forest_join_2647: {
    forest_join_2646: {
    forest_join_2624: {
    forest_join_2623: {
    forest_join_2622: {
    forest_join_2621: {
    forest_join_2599: {
    forest_join_2598: {
    forest_join_2597: {
    forest_join_2596: {
    forest_join_2574: {
    forest_join_2573: {
    forest_join_2572: {
    forest_join_2571: {
    forest_join_2541: {
    forest_join_2540: {
    forest_join_2539: {
    forest_join_2522: {
    forest_join_2521: {
    forest_join_2520: {
    forest_join_2503: {
    forest_join_2502: {
    forest_join_2501: {
    forest_join_2484: {
    forest_join_2483: {
    forest_join_2482: {
    forest_join_2466: {
    forest_join_2463: {
    forest_join_2462: {
    forest_join_2461: {
    forest_join_2460: {
    forest_join_2438: {
    forest_join_2437: {
    forest_join_2436: {
    forest_join_2435: {
    forest_join_2413: {
    forest_join_2412: {
    forest_join_2411: {
    forest_join_2410: {
    forest_join_2388: {
    forest_join_2387: {
    forest_join_2386: {
    forest_join_2385: {
    forest_join_2355: {
    forest_join_2354: {
    forest_join_2353: {
    forest_join_2336: {
    forest_join_2335: {
    forest_join_2334: {
    forest_join_2317: {
    forest_join_2316: {
    forest_join_2315: {
    forest_join_2298: {
    forest_join_2297: {
    forest_join_2296: {
    forest_join_2280: {
    forest_join_2277: {
    forest_join_2276: {
    forest_join_2275: {
    forest_join_2274: {
    forest_join_2252: {
    forest_join_2251: {
    forest_join_2250: {
    forest_join_2249: {
    forest_join_2227: {
    forest_join_2226: {
    forest_join_2225: {
    forest_join_2224: {
    forest_join_2202: {
    forest_join_2201: {
    forest_join_2200: {
    forest_join_2199: {
    forest_join_2169: {
    forest_join_2168: {
    forest_join_2167: {
    forest_join_2150: {
    forest_join_2149: {
    forest_join_2148: {
    forest_join_2131: {
    forest_join_2130: {
    forest_join_2129: {
    forest_join_2112: {
    forest_join_2111: {
    forest_join_2110: {
    forest_join_2094: {
    forest_join_2080: {
    forest_join_2079: {
    forest_join_2078: {
    forest_join_2077: {
    forest_join_2076: {
    forest_join_2075: {
    forest_join_2053: {
    forest_join_2052: {
    forest_join_2051: {
    forest_join_2050: {
    forest_join_2028: {
    forest_join_2027: {
    forest_join_2026: {
    forest_join_2025: {
    forest_join_2003: {
    forest_join_2002: {
    forest_join_2001: {
    forest_join_2000: {
    forest_join_1970: {
    forest_join_1969: {
    forest_join_1968: {
    forest_join_1951: {
    forest_join_1950: {
    forest_join_1949: {
    forest_join_1932: {
    forest_join_1931: {
    forest_join_1930: {
    forest_join_1913: {
    forest_join_1912: {
    forest_join_1911: {
    forest_join_1895: {
    forest_join_1892: {
    forest_join_1891: {
    forest_join_1890: {
    forest_join_1889: {
    forest_join_1867: {
    forest_join_1866: {
    forest_join_1865: {
    forest_join_1864: {
    forest_join_1842: {
    forest_join_1841: {
    forest_join_1840: {
    forest_join_1839: {
    forest_join_1817: {
    forest_join_1816: {
    forest_join_1815: {
    forest_join_1814: {
    forest_join_1784: {
    forest_join_1783: {
    forest_join_1782: {
    forest_join_1765: {
    forest_join_1764: {
    forest_join_1763: {
    forest_join_1746: {
    forest_join_1745: {
    forest_join_1744: {
    forest_join_1727: {
    forest_join_1726: {
    forest_join_1725: {
    forest_join_1709: {
    forest_join_1706: {
    forest_join_1705: {
    forest_join_1704: {
    forest_join_1703: {
    forest_join_1681: {
    forest_join_1680: {
    forest_join_1679: {
    forest_join_1678: {
    forest_join_1656: {
    forest_join_1655: {
    forest_join_1654: {
    forest_join_1653: {
    forest_join_1631: {
    forest_join_1630: {
    forest_join_1629: {
    forest_join_1628: {
    forest_join_1598: {
    forest_join_1597: {
    forest_join_1596: {
    forest_join_1579: {
    forest_join_1578: {
    forest_join_1577: {
    forest_join_1560: {
    forest_join_1559: {
    forest_join_1558: {
    forest_join_1541: {
    forest_join_1540: {
    forest_join_1539: {
    forest_join_1523: {
    forest_join_1520: {
    forest_join_1519: {
    forest_join_1514: {
    forest_join_1513: {
    forest_join_1508: {
    forest_join_1507: {
    forest_join_1498: {
    forest_join_1483: {
    forest_join_1471: {
    forest_join_1470: {
    forest_join_1469: {
    forest_join_1462: {
    forest_join_1451: {
    forest_join_1435: {
    forest_join_1434: {
    forest_join_1433: {
    forest_join_1426: {
    forest_join_1419: {
    forest_join_1399: {
    forest_join_1398: {
    forest_join_1397: {
    forest_join_1390: {
    forest_join_1387: {
    forest_join_1364: {
    forest_join_1363: {
    forest_join_1362: {
    forest_join_1358: {
    forest_join_1355: {
    forest_join_1339: {
    forest_join_1338: {
    forest_join_1337: {
    forest_join_1326: {
    forest_join_1325: {
    forest_join_1324: {
    forest_join_1320: {
    forest_join_1317: {
    forest_join_1305: {
    forest_join_1304: {
    forest_join_1303: {
    forest_join_1288: {
    forest_join_1287: {
    forest_join_1286: {
    forest_join_1282: {
    forest_join_1279: {
    forest_join_1263: {
    forest_join_1262: {
    forest_join_1261: {
    forest_join_1253: {
    forest_join_1252: {
    forest_join_1251: {
    forest_join_1244: {
    forest_join_1241: {
    forest_join_1229: {
    forest_join_1228: {
    forest_join_1227: {
    forest_join_1215: {
    forest_join_1214: {
    forest_join_1213: {
    forest_join_1206: {
    forest_join_1203: {
    forest_join_1183: {
    forest_join_1182: {
    forest_join_1181: {
    forest_join_1174: {
    forest_join_1173: {
    forest_join_1172: {
    forest_join_1168: {
    forest_join_1165: {
    forest_join_1157: {
    forest_join_1156: {
    forest_join_1155: {
    forest_join_1147: {
    forest_join_1146: {
    forest_join_1145: {
    forest_join_1138: {
    forest_join_1131: {
    forest_join_1115: {
    forest_join_1114: {
    forest_join_1113: {
    forest_join_1105: {
    forest_join_1104: {
    forest_join_1103: {
    forest_join_1096: {
    forest_join_1095: {
    forest_join_1094: {
    forest_join_1090: {
    forest_join_1087: {
    forest_join_1075: {
    forest_join_1074: {
    forest_join_1073: {
    forest_join_1061: {
    forest_join_1060: {
    forest_join_1059: {
    forest_join_1052: {
    forest_join_1051: {
    forest_join_1050: {
    forest_join_1046: {
    forest_join_1043: {
    forest_join_1035: {
    forest_join_1034: {
    forest_join_1033: {
    forest_join_1025: {
    forest_join_1024: {
    forest_join_1023: {
    forest_join_1012: {
    forest_join_1011: {
    forest_join_1010: {
    forest_join_1006: {
    forest_join_1003: {
    forest_join_995: {
    forest_join_994: {
    forest_join_993: {
    forest_join_985: {
    forest_join_984: {
    forest_join_983: {
    forest_join_975: {
    forest_join_974: {
    forest_join_973: {
    forest_join_962: {
    forest_join_961: {
    forest_join_949: {
    forest_join_948: {
    forest_join_947: {
    forest_join_946: {
    forest_join_945: {
    forest_join_941: {
    forest_join_923: {
    forest_join_922: {
    forest_join_921: {
    forest_join_917: {
    forest_join_899: {
    forest_join_898: {
    forest_join_897: {
    forest_join_893: {
    forest_join_875: {
    forest_join_874: {
    forest_join_873: {
    forest_join_869: {
    forest_join_796: {
    forest_join_793: {
    forest_join_792: {
    forest_join_791: {
    forest_join_787: {
    forest_join_769: {
    forest_join_768: {
    forest_join_767: {
    forest_join_763: {
    forest_join_745: {
    forest_join_744: {
    forest_join_743: {
    forest_join_739: {
    forest_join_721: {
    forest_join_720: {
    forest_join_719: {
    forest_join_715: {
    forest_join_642: {
    forest_join_639: {
    forest_join_638: {
    forest_join_637: {
    forest_join_633: {
    forest_join_615: {
    forest_join_614: {
    forest_join_613: {
    forest_join_609: {
    forest_join_591: {
    forest_join_590: {
    forest_join_589: {
    forest_join_585: {
    forest_join_567: {
    forest_join_566: {
    forest_join_565: {
    forest_join_561: {
    forest_join_488: {
    forest_join_474: {
    forest_join_473: {
    forest_join_472: {
    forest_join_471: {
    forest_join_470: {
    forest_join_466: {
    forest_join_448: {
    forest_join_447: {
    forest_join_446: {
    forest_join_442: {
    forest_join_424: {
    forest_join_423: {
    forest_join_422: {
    forest_join_418: {
    forest_join_400: {
    forest_join_399: {
    forest_join_398: {
    forest_join_394: {
    forest_join_321: {
    forest_join_318: {
    forest_join_317: {
    forest_join_316: {
    forest_join_312: {
    forest_join_294: {
    forest_join_293: {
    forest_join_292: {
    forest_join_288: {
    forest_join_270: {
    forest_join_269: {
    forest_join_268: {
    forest_join_264: {
    forest_join_246: {
    forest_join_245: {
    forest_join_244: {
    forest_join_240: {
    forest_join_167: {
    forest_join_164: {
    forest_join_163: {
    forest_join_162: {
    forest_join_158: {
    forest_join_140: {
    forest_join_139: {
    forest_join_138: {
    forest_join_134: {
    forest_join_116: {
    forest_join_115: {
    forest_join_114: {
    forest_join_110: {
    forest_join_92: {
    forest_join_91: {
    forest_join_90: {
    forest_join_86: {
    forest_join_13: {
    life9_3 = (__fieldRead302_0() ^ 22480398767208L);
    spill302_0 = __call302_1();
    life12_7 = __call302_2(p8);
    life11_8 = spill302_0;
    spill302_1 = p5;
    if (!((life11_8 != null))) {
        forestValue302_962_0 = spill302_1;
        break forest_join_962;
    }
    switch (spill302_1) {
case 0:
{
        break forest_join_13;
    }
case 1:
{
        break forest_join_167;
    }
case 2:
{
        break forest_join_321;
    }
case 3:
{
        break forest_join_488;
    }
case 4:
{
        break forest_join_642;
    }
case 5:
{
        break forest_join_796;
    }
default:
{
        break forest_join_961;
    }
}
    }
    (life12_7)[0] = __call302_4(p0, p1, p2, __call302_3(p3), p5, p6, p7);
    (life12_7)[1] = __call302_6(p0, p1, p2, __call302_5(p3), p5, p6, p7);
    (life12_7)[2] = __call302_8(p0, p1, p2, __call302_7(p3), p5, p6, p7);
    (life12_7)[3] = __call302_10(p0, p1, p2, __call302_9(p3), p5, p6, p7);
    spill302_2 = __fieldRead302_11(p0);
    if (!((life11_8 != null))) {
        forestValue302_962_0 = __integerCategory302_12(spill302_2);
        break forest_join_962;
    }
    if (!(spill302_2)) {
        break forest_join_961;
    }
    life13_70 = __call302_13(p3);
    spill302_3 = life12_7;
    spill302_4 = 0;
    spill302_5 = (life12_7)[0];
    if (!((life11_8 != null))) {
        forestValue302_86_0 = spill302_3;
        forestValue302_86_1 = spill302_4;
        forestValue302_86_2 = __integerCategory302_14(spill302_5);
        break forest_join_86;
    }
    if (!(spill302_5)) {
        forestValue302_91_0 = spill302_3;
        forestValue302_91_1 = spill302_4;
        break forest_join_91;
    }
    forestValue302_86_0 = spill302_3;
    forestValue302_86_1 = spill302_4;
    forestValue302_86_2 = __integerCategory302_17(__call302_16(p0, p1, p2, __call302_15(life13_70), p5, p6, p7));
    }
    if (!((life11_8 != null))) {
        forestValue302_90_0 = forestValue302_86_0;
        forestValue302_90_1 = forestValue302_86_1;
        forestValue302_90_2 = forestValue302_86_2;
        break forest_join_90;
    }
    if (!((forestValue302_86_2 == 0))) {
        forestValue302_91_0 = forestValue302_86_0;
        forestValue302_91_1 = forestValue302_86_1;
        break forest_join_91;
    }
    forestValue302_90_0 = forestValue302_86_0;
    forestValue302_90_1 = forestValue302_86_1;
    forestValue302_90_2 = 1;
    }
    forestValue302_92_0 = forestValue302_90_0;
    forestValue302_92_1 = forestValue302_90_1;
    forestValue302_92_2 = forestValue302_90_2;
    break forest_join_92;
    }
    forestValue302_92_0 = forestValue302_91_0;
    forestValue302_92_1 = forestValue302_91_1;
    forestValue302_92_2 = 0;
    }
    (forestValue302_92_0)[forestValue302_92_1] = __integerCategory302_18(forestValue302_92_2);
    spill302_6 = life12_7;
    spill302_7 = 1;
    spill302_8 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_110_0 = spill302_6;
        forestValue302_110_1 = spill302_7;
        forestValue302_110_2 = __integerCategory302_19(spill302_8);
        break forest_join_110;
    }
    if (!(spill302_8)) {
        forestValue302_115_0 = spill302_6;
        forestValue302_115_1 = spill302_7;
        break forest_join_115;
    }
    forestValue302_110_0 = spill302_6;
    forestValue302_110_1 = spill302_7;
    forestValue302_110_2 = __integerCategory302_22(__call302_21(p0, p1, p2, __call302_20(life13_70), p5, p6, p7));
    }
    if (!((life11_8 != null))) {
        forestValue302_114_0 = forestValue302_110_0;
        forestValue302_114_1 = forestValue302_110_1;
        forestValue302_114_2 = forestValue302_110_2;
        break forest_join_114;
    }
    if (!((forestValue302_110_2 == 0))) {
        forestValue302_115_0 = forestValue302_110_0;
        forestValue302_115_1 = forestValue302_110_1;
        break forest_join_115;
    }
    forestValue302_114_0 = forestValue302_110_0;
    forestValue302_114_1 = forestValue302_110_1;
    forestValue302_114_2 = 1;
    }
    forestValue302_116_0 = forestValue302_114_0;
    forestValue302_116_1 = forestValue302_114_1;
    forestValue302_116_2 = forestValue302_114_2;
    break forest_join_116;
    }
    forestValue302_116_0 = forestValue302_115_0;
    forestValue302_116_1 = forestValue302_115_1;
    forestValue302_116_2 = 0;
    }
    (forestValue302_116_0)[forestValue302_116_1] = __integerCategory302_23(forestValue302_116_2);
    spill302_9 = life12_7;
    spill302_10 = 2;
    spill302_11 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_134_0 = spill302_9;
        forestValue302_134_1 = spill302_10;
        forestValue302_134_2 = __integerCategory302_24(spill302_11);
        break forest_join_134;
    }
    if (!(spill302_11)) {
        forestValue302_139_0 = spill302_9;
        forestValue302_139_1 = spill302_10;
        break forest_join_139;
    }
    forestValue302_134_0 = spill302_9;
    forestValue302_134_1 = spill302_10;
    forestValue302_134_2 = __integerCategory302_27(__call302_26(p0, p1, p2, __call302_25(life13_70), p5, p6, p7));
    }
    if (!((life11_8 != null))) {
        forestValue302_138_0 = forestValue302_134_0;
        forestValue302_138_1 = forestValue302_134_1;
        forestValue302_138_2 = forestValue302_134_2;
        break forest_join_138;
    }
    if (!((forestValue302_134_2 == 0))) {
        forestValue302_139_0 = forestValue302_134_0;
        forestValue302_139_1 = forestValue302_134_1;
        break forest_join_139;
    }
    forestValue302_138_0 = forestValue302_134_0;
    forestValue302_138_1 = forestValue302_134_1;
    forestValue302_138_2 = 1;
    }
    forestValue302_140_0 = forestValue302_138_0;
    forestValue302_140_1 = forestValue302_138_1;
    forestValue302_140_2 = forestValue302_138_2;
    break forest_join_140;
    }
    forestValue302_140_0 = forestValue302_139_0;
    forestValue302_140_1 = forestValue302_139_1;
    forestValue302_140_2 = 0;
    }
    (forestValue302_140_0)[forestValue302_140_1] = __integerCategory302_28(forestValue302_140_2);
    spill302_12 = life12_7;
    spill302_13 = 3;
    spill302_14 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_158_0 = spill302_12;
        forestValue302_158_1 = spill302_13;
        forestValue302_158_2 = __integerCategory302_29(spill302_14);
        break forest_join_158;
    }
    if (!(spill302_14)) {
        forestValue302_163_0 = spill302_12;
        forestValue302_163_1 = spill302_13;
        break forest_join_163;
    }
    forestValue302_158_0 = spill302_12;
    forestValue302_158_1 = spill302_13;
    forestValue302_158_2 = __integerCategory302_32(__call302_31(p0, p1, p2, __call302_30(life13_70), p5, p6, p7));
    }
    if (!((life11_8 != null))) {
        forestValue302_162_0 = forestValue302_158_0;
        forestValue302_162_1 = forestValue302_158_1;
        forestValue302_162_2 = forestValue302_158_2;
        break forest_join_162;
    }
    if (!((forestValue302_158_2 == 0))) {
        forestValue302_163_0 = forestValue302_158_0;
        forestValue302_163_1 = forestValue302_158_1;
        break forest_join_163;
    }
    forestValue302_162_0 = forestValue302_158_0;
    forestValue302_162_1 = forestValue302_158_1;
    forestValue302_162_2 = 1;
    }
    forestValue302_164_0 = forestValue302_162_0;
    forestValue302_164_1 = forestValue302_162_1;
    forestValue302_164_2 = forestValue302_162_2;
    break forest_join_164;
    }
    forestValue302_164_0 = forestValue302_163_0;
    forestValue302_164_1 = forestValue302_163_1;
    forestValue302_164_2 = 0;
    }
    (forestValue302_164_0)[forestValue302_164_1] = __integerCategory302_33(forestValue302_164_2);
    if (!((life11_8 == null))) {
        break forest_join_961;
    }
    }
    (life12_7)[0] = __call302_35(p0, p1, p2, __call302_34(p3), p5, p6, p7);
    (life12_7)[1] = __call302_37(p0, p1, p2, __call302_36(p3), p5, p6, p7);
    (life12_7)[2] = __call302_39(p0, p1, p2, __call302_38(p3), p5, p6, p7);
    (life12_7)[3] = __call302_41(p0, p1, p2, __call302_40(p3), p5, p6, p7);
    spill302_15 = __fieldRead302_42(p0);
    if (!((life11_8 != null))) {
        forestValue302_962_0 = __integerCategory302_43(spill302_15);
        break forest_join_962;
    }
    if (!(spill302_15)) {
        break forest_join_961;
    }
    life13_238 = __call302_44(p3);
    spill302_16 = life12_7;
    spill302_17 = 0;
    spill302_18 = (life12_7)[0];
    if (!((life11_8 != null))) {
        forestValue302_240_0 = spill302_16;
        forestValue302_240_1 = spill302_17;
        forestValue302_240_2 = __integerCategory302_45(spill302_18);
        break forest_join_240;
    }
    if (!(spill302_18)) {
        forestValue302_245_0 = spill302_16;
        forestValue302_245_1 = spill302_17;
        break forest_join_245;
    }
    forestValue302_240_0 = spill302_16;
    forestValue302_240_1 = spill302_17;
    forestValue302_240_2 = __integerCategory302_48(__call302_47(p0, p1, p2, __call302_46(life13_238), p5, p6, p7));
    }
    if (!((life11_8 != null))) {
        forestValue302_244_0 = forestValue302_240_0;
        forestValue302_244_1 = forestValue302_240_1;
        forestValue302_244_2 = forestValue302_240_2;
        break forest_join_244;
    }
    if (!((forestValue302_240_2 == 0))) {
        forestValue302_245_0 = forestValue302_240_0;
        forestValue302_245_1 = forestValue302_240_1;
        break forest_join_245;
    }
    forestValue302_244_0 = forestValue302_240_0;
    forestValue302_244_1 = forestValue302_240_1;
    forestValue302_244_2 = 1;
    }
    forestValue302_246_0 = forestValue302_244_0;
    forestValue302_246_1 = forestValue302_244_1;
    forestValue302_246_2 = forestValue302_244_2;
    break forest_join_246;
    }
    forestValue302_246_0 = forestValue302_245_0;
    forestValue302_246_1 = forestValue302_245_1;
    forestValue302_246_2 = 0;
    }
    (forestValue302_246_0)[forestValue302_246_1] = __integerCategory302_49(forestValue302_246_2);
    spill302_19 = life12_7;
    spill302_20 = 1;
    spill302_21 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_264_0 = spill302_19;
        forestValue302_264_1 = spill302_20;
        forestValue302_264_2 = __integerCategory302_50(spill302_21);
        break forest_join_264;
    }
    if (!(spill302_21)) {
        forestValue302_269_0 = spill302_19;
        forestValue302_269_1 = spill302_20;
        break forest_join_269;
    }
    forestValue302_264_0 = spill302_19;
    forestValue302_264_1 = spill302_20;
    forestValue302_264_2 = __integerCategory302_53(__call302_52(p0, p1, p2, __call302_51(life13_238), p5, p6, p7));
    }
    if (!((life11_8 != null))) {
        forestValue302_268_0 = forestValue302_264_0;
        forestValue302_268_1 = forestValue302_264_1;
        forestValue302_268_2 = forestValue302_264_2;
        break forest_join_268;
    }
    if (!((forestValue302_264_2 == 0))) {
        forestValue302_269_0 = forestValue302_264_0;
        forestValue302_269_1 = forestValue302_264_1;
        break forest_join_269;
    }
    forestValue302_268_0 = forestValue302_264_0;
    forestValue302_268_1 = forestValue302_264_1;
    forestValue302_268_2 = 1;
    }
    forestValue302_270_0 = forestValue302_268_0;
    forestValue302_270_1 = forestValue302_268_1;
    forestValue302_270_2 = forestValue302_268_2;
    break forest_join_270;
    }
    forestValue302_270_0 = forestValue302_269_0;
    forestValue302_270_1 = forestValue302_269_1;
    forestValue302_270_2 = 0;
    }
    (forestValue302_270_0)[forestValue302_270_1] = __integerCategory302_54(forestValue302_270_2);
    spill302_22 = life12_7;
    spill302_23 = 2;
    spill302_24 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_288_0 = spill302_22;
        forestValue302_288_1 = spill302_23;
        forestValue302_288_2 = __integerCategory302_55(spill302_24);
        break forest_join_288;
    }
    if (!(spill302_24)) {
        forestValue302_293_0 = spill302_22;
        forestValue302_293_1 = spill302_23;
        break forest_join_293;
    }
    forestValue302_288_0 = spill302_22;
    forestValue302_288_1 = spill302_23;
    forestValue302_288_2 = __integerCategory302_58(__call302_57(p0, p1, p2, __call302_56(life13_238), p5, p6, p7));
    }
    if (!((life11_8 != null))) {
        forestValue302_292_0 = forestValue302_288_0;
        forestValue302_292_1 = forestValue302_288_1;
        forestValue302_292_2 = forestValue302_288_2;
        break forest_join_292;
    }
    if (!((forestValue302_288_2 == 0))) {
        forestValue302_293_0 = forestValue302_288_0;
        forestValue302_293_1 = forestValue302_288_1;
        break forest_join_293;
    }
    forestValue302_292_0 = forestValue302_288_0;
    forestValue302_292_1 = forestValue302_288_1;
    forestValue302_292_2 = 1;
    }
    forestValue302_294_0 = forestValue302_292_0;
    forestValue302_294_1 = forestValue302_292_1;
    forestValue302_294_2 = forestValue302_292_2;
    break forest_join_294;
    }
    forestValue302_294_0 = forestValue302_293_0;
    forestValue302_294_1 = forestValue302_293_1;
    forestValue302_294_2 = 0;
    }
    (forestValue302_294_0)[forestValue302_294_1] = __integerCategory302_59(forestValue302_294_2);
    spill302_25 = life12_7;
    spill302_26 = 3;
    spill302_27 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_312_0 = spill302_25;
        forestValue302_312_1 = spill302_26;
        forestValue302_312_2 = __integerCategory302_60(spill302_27);
        break forest_join_312;
    }
    if (!(spill302_27)) {
        forestValue302_317_0 = spill302_25;
        forestValue302_317_1 = spill302_26;
        break forest_join_317;
    }
    forestValue302_312_0 = spill302_25;
    forestValue302_312_1 = spill302_26;
    forestValue302_312_2 = __integerCategory302_63(__call302_62(p0, p1, p2, __call302_61(life13_238), p5, p6, p7));
    }
    if (!((life11_8 != null))) {
        forestValue302_316_0 = forestValue302_312_0;
        forestValue302_316_1 = forestValue302_312_1;
        forestValue302_316_2 = forestValue302_312_2;
        break forest_join_316;
    }
    if (!((forestValue302_312_2 == 0))) {
        forestValue302_317_0 = forestValue302_312_0;
        forestValue302_317_1 = forestValue302_312_1;
        break forest_join_317;
    }
    forestValue302_316_0 = forestValue302_312_0;
    forestValue302_316_1 = forestValue302_312_1;
    forestValue302_316_2 = 1;
    }
    forestValue302_318_0 = forestValue302_316_0;
    forestValue302_318_1 = forestValue302_316_1;
    forestValue302_318_2 = forestValue302_316_2;
    break forest_join_318;
    }
    forestValue302_318_0 = forestValue302_317_0;
    forestValue302_318_1 = forestValue302_317_1;
    forestValue302_318_2 = 0;
    }
    (forestValue302_318_0)[forestValue302_318_1] = __integerCategory302_64(forestValue302_318_2);
    if (!((life11_8 == null))) {
        break forest_join_961;
    }
    }
    (life12_7)[0] = __call302_66(p0, p1, p2, __call302_65(p3), p5, p6, p7);
    (life12_7)[1] = __call302_68(p0, p1, p2, __call302_67(p3), p5, p6, p7);
    (life12_7)[2] = __call302_70(p0, p1, p2, __call302_69(p3), p5, p6, p7);
    (life12_7)[3] = __call302_72(p0, p1, p2, __call302_71(p3), p5, p6, p7);
    spill302_28 = __fieldRead302_73(p0);
    if (!((life11_8 != null))) {
        forestValue302_474_0 = __integerCategory302_74(spill302_28);
        break forest_join_474;
    }
    if (!(spill302_28)) {
        break forest_join_473;
    }
    life13_406 = __call302_75(p3);
    spill302_29 = life12_7;
    spill302_30 = 0;
    spill302_31 = (life12_7)[0];
    if (!((life11_8 != null))) {
        forestValue302_394_0 = spill302_29;
        forestValue302_394_1 = spill302_30;
        forestValue302_394_2 = __integerCategory302_76(spill302_31);
        break forest_join_394;
    }
    if (!(spill302_31)) {
        forestValue302_399_0 = spill302_29;
        forestValue302_399_1 = spill302_30;
        break forest_join_399;
    }
    forestValue302_394_0 = spill302_29;
    forestValue302_394_1 = spill302_30;
    forestValue302_394_2 = __integerCategory302_79(__call302_78(p0, p1, p2, __call302_77(life13_406), p5, p6, p7));
    }
    if (!((life11_8 != null))) {
        forestValue302_398_0 = forestValue302_394_0;
        forestValue302_398_1 = forestValue302_394_1;
        forestValue302_398_2 = forestValue302_394_2;
        break forest_join_398;
    }
    if (!((forestValue302_394_2 == 0))) {
        forestValue302_399_0 = forestValue302_394_0;
        forestValue302_399_1 = forestValue302_394_1;
        break forest_join_399;
    }
    forestValue302_398_0 = forestValue302_394_0;
    forestValue302_398_1 = forestValue302_394_1;
    forestValue302_398_2 = 1;
    }
    forestValue302_400_0 = forestValue302_398_0;
    forestValue302_400_1 = forestValue302_398_1;
    forestValue302_400_2 = forestValue302_398_2;
    break forest_join_400;
    }
    forestValue302_400_0 = forestValue302_399_0;
    forestValue302_400_1 = forestValue302_399_1;
    forestValue302_400_2 = 0;
    }
    (forestValue302_400_0)[forestValue302_400_1] = __integerCategory302_80(forestValue302_400_2);
    spill302_32 = life12_7;
    spill302_33 = 1;
    spill302_34 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_418_0 = spill302_32;
        forestValue302_418_1 = spill302_33;
        forestValue302_418_2 = __integerCategory302_81(spill302_34);
        break forest_join_418;
    }
    if (!(spill302_34)) {
        forestValue302_423_0 = spill302_32;
        forestValue302_423_1 = spill302_33;
        break forest_join_423;
    }
    forestValue302_418_0 = spill302_32;
    forestValue302_418_1 = spill302_33;
    forestValue302_418_2 = __integerCategory302_84(__call302_83(p0, p1, p2, __call302_82(life13_406), p5, p6, p7));
    }
    if (!((life11_8 != null))) {
        forestValue302_422_0 = forestValue302_418_0;
        forestValue302_422_1 = forestValue302_418_1;
        forestValue302_422_2 = forestValue302_418_2;
        break forest_join_422;
    }
    if (!((forestValue302_418_2 == 0))) {
        forestValue302_423_0 = forestValue302_418_0;
        forestValue302_423_1 = forestValue302_418_1;
        break forest_join_423;
    }
    forestValue302_422_0 = forestValue302_418_0;
    forestValue302_422_1 = forestValue302_418_1;
    forestValue302_422_2 = 1;
    }
    forestValue302_424_0 = forestValue302_422_0;
    forestValue302_424_1 = forestValue302_422_1;
    forestValue302_424_2 = forestValue302_422_2;
    break forest_join_424;
    }
    forestValue302_424_0 = forestValue302_423_0;
    forestValue302_424_1 = forestValue302_423_1;
    forestValue302_424_2 = 0;
    }
    (forestValue302_424_0)[forestValue302_424_1] = __integerCategory302_85(forestValue302_424_2);
    spill302_35 = life12_7;
    spill302_36 = 2;
    spill302_37 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_442_0 = spill302_35;
        forestValue302_442_1 = spill302_36;
        forestValue302_442_2 = __integerCategory302_86(spill302_37);
        break forest_join_442;
    }
    if (!(spill302_37)) {
        forestValue302_447_0 = spill302_35;
        forestValue302_447_1 = spill302_36;
        break forest_join_447;
    }
    forestValue302_442_0 = spill302_35;
    forestValue302_442_1 = spill302_36;
    forestValue302_442_2 = __integerCategory302_89(__call302_88(p0, p1, p2, __call302_87(life13_406), p5, p6, p7));
    }
    if (!((life11_8 != null))) {
        forestValue302_446_0 = forestValue302_442_0;
        forestValue302_446_1 = forestValue302_442_1;
        forestValue302_446_2 = forestValue302_442_2;
        break forest_join_446;
    }
    if (!((forestValue302_442_2 == 0))) {
        forestValue302_447_0 = forestValue302_442_0;
        forestValue302_447_1 = forestValue302_442_1;
        break forest_join_447;
    }
    forestValue302_446_0 = forestValue302_442_0;
    forestValue302_446_1 = forestValue302_442_1;
    forestValue302_446_2 = 1;
    }
    forestValue302_448_0 = forestValue302_446_0;
    forestValue302_448_1 = forestValue302_446_1;
    forestValue302_448_2 = forestValue302_446_2;
    break forest_join_448;
    }
    forestValue302_448_0 = forestValue302_447_0;
    forestValue302_448_1 = forestValue302_447_1;
    forestValue302_448_2 = 0;
    }
    (forestValue302_448_0)[forestValue302_448_1] = __integerCategory302_90(forestValue302_448_2);
    spill302_38 = life12_7;
    spill302_39 = 3;
    spill302_40 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_466_0 = spill302_38;
        forestValue302_466_1 = spill302_39;
        forestValue302_466_2 = __integerCategory302_91(spill302_40);
        break forest_join_466;
    }
    if (!(spill302_40)) {
        forestValue302_471_0 = spill302_38;
        forestValue302_471_1 = spill302_39;
        break forest_join_471;
    }
    forestValue302_466_0 = spill302_38;
    forestValue302_466_1 = spill302_39;
    forestValue302_466_2 = __integerCategory302_94(__call302_93(p0, p1, p2, __call302_92(life13_406), p5, p6, p7));
    }
    if (!((life11_8 != null))) {
        forestValue302_470_0 = forestValue302_466_0;
        forestValue302_470_1 = forestValue302_466_1;
        forestValue302_470_2 = forestValue302_466_2;
        break forest_join_470;
    }
    if (!((forestValue302_466_2 == 0))) {
        forestValue302_471_0 = forestValue302_466_0;
        forestValue302_471_1 = forestValue302_466_1;
        break forest_join_471;
    }
    forestValue302_470_0 = forestValue302_466_0;
    forestValue302_470_1 = forestValue302_466_1;
    forestValue302_470_2 = 1;
    }
    forestValue302_472_0 = forestValue302_470_0;
    forestValue302_472_1 = forestValue302_470_1;
    forestValue302_472_2 = forestValue302_470_2;
    break forest_join_472;
    }
    forestValue302_472_0 = forestValue302_471_0;
    forestValue302_472_1 = forestValue302_471_1;
    forestValue302_472_2 = 0;
    }
    (forestValue302_472_0)[forestValue302_472_1] = __integerCategory302_95(forestValue302_472_2);
    }
    forestValue302_474_0 = p4;
    }
    if (!((life11_8 != null))) {
        forestValue302_962_0 = forestValue302_474_0;
        break forest_join_962;
    }
    if (!((forestValue302_474_0 == 1))) {
        break forest_join_961;
    }
    __call302_96(0, 1, life12_7);
    __call302_97(2, 3, life12_7);
    if (!((life11_8 == null))) {
        break forest_join_961;
    }
    }
    (life12_7)[0] = __call302_99(p0, p1, p2, __call302_98(p3), p5, p6, p7);
    (life12_7)[1] = __call302_101(p0, p1, p2, __call302_100(p3), p5, p6, p7);
    (life12_7)[2] = __call302_103(p0, p1, p2, __call302_102(p3), p5, p6, p7);
    (life12_7)[3] = __call302_105(p0, p1, p2, __call302_104(p3), p5, p6, p7);
    spill302_41 = __fieldRead302_106(p0);
    if (!((life11_8 != null))) {
        forestValue302_962_0 = __integerCategory302_107(spill302_41);
        break forest_join_962;
    }
    if (!(spill302_41)) {
        break forest_join_961;
    }
    life13_589 = __call302_108(p3);
    spill302_42 = life12_7;
    spill302_43 = 0;
    spill302_44 = (life12_7)[0];
    if (!((life11_8 != null))) {
        forestValue302_561_0 = spill302_42;
        forestValue302_561_1 = spill302_43;
        forestValue302_561_2 = __integerCategory302_109(spill302_44);
        break forest_join_561;
    }
    if (!(spill302_44)) {
        forestValue302_566_0 = spill302_42;
        forestValue302_566_1 = spill302_43;
        break forest_join_566;
    }
    forestValue302_561_0 = spill302_42;
    forestValue302_561_1 = spill302_43;
    forestValue302_561_2 = __integerCategory302_112(__call302_111(p0, p1, p2, __call302_110(life13_589), p5, p6, p7));
    }
    if (!((life11_8 != null))) {
        forestValue302_565_0 = forestValue302_561_0;
        forestValue302_565_1 = forestValue302_561_1;
        forestValue302_565_2 = forestValue302_561_2;
        break forest_join_565;
    }
    if (!((forestValue302_561_2 == 0))) {
        forestValue302_566_0 = forestValue302_561_0;
        forestValue302_566_1 = forestValue302_561_1;
        break forest_join_566;
    }
    forestValue302_565_0 = forestValue302_561_0;
    forestValue302_565_1 = forestValue302_561_1;
    forestValue302_565_2 = 1;
    }
    forestValue302_567_0 = forestValue302_565_0;
    forestValue302_567_1 = forestValue302_565_1;
    forestValue302_567_2 = forestValue302_565_2;
    break forest_join_567;
    }
    forestValue302_567_0 = forestValue302_566_0;
    forestValue302_567_1 = forestValue302_566_1;
    forestValue302_567_2 = 0;
    }
    (forestValue302_567_0)[forestValue302_567_1] = __integerCategory302_113(forestValue302_567_2);
    spill302_45 = life12_7;
    spill302_46 = 1;
    spill302_47 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_585_0 = spill302_45;
        forestValue302_585_1 = spill302_46;
        forestValue302_585_2 = __integerCategory302_114(spill302_47);
        break forest_join_585;
    }
    if (!(spill302_47)) {
        forestValue302_590_0 = spill302_45;
        forestValue302_590_1 = spill302_46;
        break forest_join_590;
    }
    forestValue302_585_0 = spill302_45;
    forestValue302_585_1 = spill302_46;
    forestValue302_585_2 = __integerCategory302_117(__call302_116(p0, p1, p2, __call302_115(life13_589), p5, p6, p7));
    }
    if (!((life11_8 != null))) {
        forestValue302_589_0 = forestValue302_585_0;
        forestValue302_589_1 = forestValue302_585_1;
        forestValue302_589_2 = forestValue302_585_2;
        break forest_join_589;
    }
    if (!((forestValue302_585_2 == 0))) {
        forestValue302_590_0 = forestValue302_585_0;
        forestValue302_590_1 = forestValue302_585_1;
        break forest_join_590;
    }
    forestValue302_589_0 = forestValue302_585_0;
    forestValue302_589_1 = forestValue302_585_1;
    forestValue302_589_2 = 1;
    }
    forestValue302_591_0 = forestValue302_589_0;
    forestValue302_591_1 = forestValue302_589_1;
    forestValue302_591_2 = forestValue302_589_2;
    break forest_join_591;
    }
    forestValue302_591_0 = forestValue302_590_0;
    forestValue302_591_1 = forestValue302_590_1;
    forestValue302_591_2 = 0;
    }
    (forestValue302_591_0)[forestValue302_591_1] = __integerCategory302_118(forestValue302_591_2);
    spill302_48 = life12_7;
    spill302_49 = 2;
    spill302_50 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_609_0 = spill302_48;
        forestValue302_609_1 = spill302_49;
        forestValue302_609_2 = __integerCategory302_119(spill302_50);
        break forest_join_609;
    }
    if (!(spill302_50)) {
        forestValue302_614_0 = spill302_48;
        forestValue302_614_1 = spill302_49;
        break forest_join_614;
    }
    forestValue302_609_0 = spill302_48;
    forestValue302_609_1 = spill302_49;
    forestValue302_609_2 = __integerCategory302_122(__call302_121(p0, p1, p2, __call302_120(life13_589), p5, p6, p7));
    }
    if (!((life11_8 != null))) {
        forestValue302_613_0 = forestValue302_609_0;
        forestValue302_613_1 = forestValue302_609_1;
        forestValue302_613_2 = forestValue302_609_2;
        break forest_join_613;
    }
    if (!((forestValue302_609_2 == 0))) {
        forestValue302_614_0 = forestValue302_609_0;
        forestValue302_614_1 = forestValue302_609_1;
        break forest_join_614;
    }
    forestValue302_613_0 = forestValue302_609_0;
    forestValue302_613_1 = forestValue302_609_1;
    forestValue302_613_2 = 1;
    }
    forestValue302_615_0 = forestValue302_613_0;
    forestValue302_615_1 = forestValue302_613_1;
    forestValue302_615_2 = forestValue302_613_2;
    break forest_join_615;
    }
    forestValue302_615_0 = forestValue302_614_0;
    forestValue302_615_1 = forestValue302_614_1;
    forestValue302_615_2 = 0;
    }
    (forestValue302_615_0)[forestValue302_615_1] = __integerCategory302_123(forestValue302_615_2);
    spill302_51 = life12_7;
    spill302_52 = 3;
    spill302_53 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_633_0 = spill302_51;
        forestValue302_633_1 = spill302_52;
        forestValue302_633_2 = __integerCategory302_124(spill302_53);
        break forest_join_633;
    }
    if (!(spill302_53)) {
        forestValue302_638_0 = spill302_51;
        forestValue302_638_1 = spill302_52;
        break forest_join_638;
    }
    forestValue302_633_0 = spill302_51;
    forestValue302_633_1 = spill302_52;
    forestValue302_633_2 = __integerCategory302_127(__call302_126(p0, p1, p2, __call302_125(life13_589), p5, p6, p7));
    }
    if (!((life11_8 != null))) {
        forestValue302_637_0 = forestValue302_633_0;
        forestValue302_637_1 = forestValue302_633_1;
        forestValue302_637_2 = forestValue302_633_2;
        break forest_join_637;
    }
    if (!((forestValue302_633_2 == 0))) {
        forestValue302_638_0 = forestValue302_633_0;
        forestValue302_638_1 = forestValue302_633_1;
        break forest_join_638;
    }
    forestValue302_637_0 = forestValue302_633_0;
    forestValue302_637_1 = forestValue302_633_1;
    forestValue302_637_2 = 1;
    }
    forestValue302_639_0 = forestValue302_637_0;
    forestValue302_639_1 = forestValue302_637_1;
    forestValue302_639_2 = forestValue302_637_2;
    break forest_join_639;
    }
    forestValue302_639_0 = forestValue302_638_0;
    forestValue302_639_1 = forestValue302_638_1;
    forestValue302_639_2 = 0;
    }
    (forestValue302_639_0)[forestValue302_639_1] = __integerCategory302_128(forestValue302_639_2);
    if (!((life11_8 == null))) {
        break forest_join_961;
    }
    }
    (life12_7)[0] = __call302_130(p0, p1, p2, __call302_129(p3), p5, p6, p7);
    (life12_7)[1] = __call302_132(p0, p1, p2, __call302_131(p3), p5, p6, p7);
    (life12_7)[2] = __call302_134(p0, p1, p2, __call302_133(p3), p5, p6, p7);
    (life12_7)[3] = __call302_136(p0, p1, p2, __call302_135(p3), p5, p6, p7);
    spill302_54 = __fieldRead302_137(p0);
    if (!((life11_8 != null))) {
        forestValue302_962_0 = __integerCategory302_138(spill302_54);
        break forest_join_962;
    }
    if (!(spill302_54)) {
        break forest_join_961;
    }
    life13_757 = __call302_139(p3);
    spill302_55 = life12_7;
    spill302_56 = 0;
    spill302_57 = (life12_7)[0];
    if (!((life11_8 != null))) {
        forestValue302_715_0 = spill302_55;
        forestValue302_715_1 = spill302_56;
        forestValue302_715_2 = __integerCategory302_140(spill302_57);
        break forest_join_715;
    }
    if (!(spill302_57)) {
        forestValue302_720_0 = spill302_55;
        forestValue302_720_1 = spill302_56;
        break forest_join_720;
    }
    forestValue302_715_0 = spill302_55;
    forestValue302_715_1 = spill302_56;
    forestValue302_715_2 = __integerCategory302_143(__call302_142(p0, p1, p2, __call302_141(life13_757), p5, p6, p7));
    }
    if (!((life11_8 != null))) {
        forestValue302_719_0 = forestValue302_715_0;
        forestValue302_719_1 = forestValue302_715_1;
        forestValue302_719_2 = forestValue302_715_2;
        break forest_join_719;
    }
    if (!((forestValue302_715_2 == 0))) {
        forestValue302_720_0 = forestValue302_715_0;
        forestValue302_720_1 = forestValue302_715_1;
        break forest_join_720;
    }
    forestValue302_719_0 = forestValue302_715_0;
    forestValue302_719_1 = forestValue302_715_1;
    forestValue302_719_2 = 1;
    }
    forestValue302_721_0 = forestValue302_719_0;
    forestValue302_721_1 = forestValue302_719_1;
    forestValue302_721_2 = forestValue302_719_2;
    break forest_join_721;
    }
    forestValue302_721_0 = forestValue302_720_0;
    forestValue302_721_1 = forestValue302_720_1;
    forestValue302_721_2 = 0;
    }
    (forestValue302_721_0)[forestValue302_721_1] = __integerCategory302_144(forestValue302_721_2);
    spill302_58 = life12_7;
    spill302_59 = 1;
    spill302_60 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_739_0 = spill302_58;
        forestValue302_739_1 = spill302_59;
        forestValue302_739_2 = __integerCategory302_145(spill302_60);
        break forest_join_739;
    }
    if (!(spill302_60)) {
        forestValue302_744_0 = spill302_58;
        forestValue302_744_1 = spill302_59;
        break forest_join_744;
    }
    forestValue302_739_0 = spill302_58;
    forestValue302_739_1 = spill302_59;
    forestValue302_739_2 = __integerCategory302_148(__call302_147(p0, p1, p2, __call302_146(life13_757), p5, p6, p7));
    }
    if (!((life11_8 != null))) {
        forestValue302_743_0 = forestValue302_739_0;
        forestValue302_743_1 = forestValue302_739_1;
        forestValue302_743_2 = forestValue302_739_2;
        break forest_join_743;
    }
    if (!((forestValue302_739_2 == 0))) {
        forestValue302_744_0 = forestValue302_739_0;
        forestValue302_744_1 = forestValue302_739_1;
        break forest_join_744;
    }
    forestValue302_743_0 = forestValue302_739_0;
    forestValue302_743_1 = forestValue302_739_1;
    forestValue302_743_2 = 1;
    }
    forestValue302_745_0 = forestValue302_743_0;
    forestValue302_745_1 = forestValue302_743_1;
    forestValue302_745_2 = forestValue302_743_2;
    break forest_join_745;
    }
    forestValue302_745_0 = forestValue302_744_0;
    forestValue302_745_1 = forestValue302_744_1;
    forestValue302_745_2 = 0;
    }
    (forestValue302_745_0)[forestValue302_745_1] = __integerCategory302_149(forestValue302_745_2);
    spill302_61 = life12_7;
    spill302_62 = 2;
    spill302_63 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_763_0 = spill302_61;
        forestValue302_763_1 = spill302_62;
        forestValue302_763_2 = __integerCategory302_150(spill302_63);
        break forest_join_763;
    }
    if (!(spill302_63)) {
        forestValue302_768_0 = spill302_61;
        forestValue302_768_1 = spill302_62;
        break forest_join_768;
    }
    forestValue302_763_0 = spill302_61;
    forestValue302_763_1 = spill302_62;
    forestValue302_763_2 = __integerCategory302_153(__call302_152(p0, p1, p2, __call302_151(life13_757), p5, p6, p7));
    }
    if (!((life11_8 != null))) {
        forestValue302_767_0 = forestValue302_763_0;
        forestValue302_767_1 = forestValue302_763_1;
        forestValue302_767_2 = forestValue302_763_2;
        break forest_join_767;
    }
    if (!((forestValue302_763_2 == 0))) {
        forestValue302_768_0 = forestValue302_763_0;
        forestValue302_768_1 = forestValue302_763_1;
        break forest_join_768;
    }
    forestValue302_767_0 = forestValue302_763_0;
    forestValue302_767_1 = forestValue302_763_1;
    forestValue302_767_2 = 1;
    }
    forestValue302_769_0 = forestValue302_767_0;
    forestValue302_769_1 = forestValue302_767_1;
    forestValue302_769_2 = forestValue302_767_2;
    break forest_join_769;
    }
    forestValue302_769_0 = forestValue302_768_0;
    forestValue302_769_1 = forestValue302_768_1;
    forestValue302_769_2 = 0;
    }
    (forestValue302_769_0)[forestValue302_769_1] = __integerCategory302_154(forestValue302_769_2);
    spill302_64 = life12_7;
    spill302_65 = 3;
    spill302_66 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_787_0 = spill302_64;
        forestValue302_787_1 = spill302_65;
        forestValue302_787_2 = __integerCategory302_155(spill302_66);
        break forest_join_787;
    }
    if (!(spill302_66)) {
        forestValue302_792_0 = spill302_64;
        forestValue302_792_1 = spill302_65;
        break forest_join_792;
    }
    forestValue302_787_0 = spill302_64;
    forestValue302_787_1 = spill302_65;
    forestValue302_787_2 = __integerCategory302_158(__call302_157(p0, p1, p2, __call302_156(life13_757), p5, p6, p7));
    }
    if (!((life11_8 != null))) {
        forestValue302_791_0 = forestValue302_787_0;
        forestValue302_791_1 = forestValue302_787_1;
        forestValue302_791_2 = forestValue302_787_2;
        break forest_join_791;
    }
    if (!((forestValue302_787_2 == 0))) {
        forestValue302_792_0 = forestValue302_787_0;
        forestValue302_792_1 = forestValue302_787_1;
        break forest_join_792;
    }
    forestValue302_791_0 = forestValue302_787_0;
    forestValue302_791_1 = forestValue302_787_1;
    forestValue302_791_2 = 1;
    }
    forestValue302_793_0 = forestValue302_791_0;
    forestValue302_793_1 = forestValue302_791_1;
    forestValue302_793_2 = forestValue302_791_2;
    break forest_join_793;
    }
    forestValue302_793_0 = forestValue302_792_0;
    forestValue302_793_1 = forestValue302_792_1;
    forestValue302_793_2 = 0;
    }
    (forestValue302_793_0)[forestValue302_793_1] = __integerCategory302_159(forestValue302_793_2);
    if (!((life11_8 == null))) {
        break forest_join_961;
    }
    }
    (life12_7)[0] = __call302_161(p0, p1, p2, __call302_160(p3), p5, p6, p7);
    (life12_7)[1] = __call302_163(p0, p1, p2, __call302_162(p3), p5, p6, p7);
    (life12_7)[2] = __call302_165(p0, p1, p2, __call302_164(p3), p5, p6, p7);
    (life12_7)[3] = __call302_167(p0, p1, p2, __call302_166(p3), p5, p6, p7);
    spill302_67 = __fieldRead302_168(p0);
    if (!((life11_8 != null))) {
        forestValue302_949_0 = __integerCategory302_169(spill302_67);
        break forest_join_949;
    }
    if (!(spill302_67)) {
        break forest_join_948;
    }
    life13_925 = __call302_170(p3);
    spill302_68 = life12_7;
    spill302_69 = 0;
    spill302_70 = (life12_7)[0];
    if (!((life11_8 != null))) {
        forestValue302_869_0 = spill302_68;
        forestValue302_869_1 = spill302_69;
        forestValue302_869_2 = __integerCategory302_171(spill302_70);
        break forest_join_869;
    }
    if (!(spill302_70)) {
        forestValue302_874_0 = spill302_68;
        forestValue302_874_1 = spill302_69;
        break forest_join_874;
    }
    forestValue302_869_0 = spill302_68;
    forestValue302_869_1 = spill302_69;
    forestValue302_869_2 = __integerCategory302_174(__call302_173(p0, p1, p2, __call302_172(life13_925), p5, p6, p7));
    }
    if (!((life11_8 != null))) {
        forestValue302_873_0 = forestValue302_869_0;
        forestValue302_873_1 = forestValue302_869_1;
        forestValue302_873_2 = forestValue302_869_2;
        break forest_join_873;
    }
    if (!((forestValue302_869_2 == 0))) {
        forestValue302_874_0 = forestValue302_869_0;
        forestValue302_874_1 = forestValue302_869_1;
        break forest_join_874;
    }
    forestValue302_873_0 = forestValue302_869_0;
    forestValue302_873_1 = forestValue302_869_1;
    forestValue302_873_2 = 1;
    }
    forestValue302_875_0 = forestValue302_873_0;
    forestValue302_875_1 = forestValue302_873_1;
    forestValue302_875_2 = forestValue302_873_2;
    break forest_join_875;
    }
    forestValue302_875_0 = forestValue302_874_0;
    forestValue302_875_1 = forestValue302_874_1;
    forestValue302_875_2 = 0;
    }
    (forestValue302_875_0)[forestValue302_875_1] = __integerCategory302_175(forestValue302_875_2);
    spill302_71 = life12_7;
    spill302_72 = 1;
    spill302_73 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_893_0 = spill302_71;
        forestValue302_893_1 = spill302_72;
        forestValue302_893_2 = __integerCategory302_176(spill302_73);
        break forest_join_893;
    }
    if (!(spill302_73)) {
        forestValue302_898_0 = spill302_71;
        forestValue302_898_1 = spill302_72;
        break forest_join_898;
    }
    forestValue302_893_0 = spill302_71;
    forestValue302_893_1 = spill302_72;
    forestValue302_893_2 = __integerCategory302_179(__call302_178(p0, p1, p2, __call302_177(life13_925), p5, p6, p7));
    }
    if (!((life11_8 != null))) {
        forestValue302_897_0 = forestValue302_893_0;
        forestValue302_897_1 = forestValue302_893_1;
        forestValue302_897_2 = forestValue302_893_2;
        break forest_join_897;
    }
    if (!((forestValue302_893_2 == 0))) {
        forestValue302_898_0 = forestValue302_893_0;
        forestValue302_898_1 = forestValue302_893_1;
        break forest_join_898;
    }
    forestValue302_897_0 = forestValue302_893_0;
    forestValue302_897_1 = forestValue302_893_1;
    forestValue302_897_2 = 1;
    }
    forestValue302_899_0 = forestValue302_897_0;
    forestValue302_899_1 = forestValue302_897_1;
    forestValue302_899_2 = forestValue302_897_2;
    break forest_join_899;
    }
    forestValue302_899_0 = forestValue302_898_0;
    forestValue302_899_1 = forestValue302_898_1;
    forestValue302_899_2 = 0;
    }
    (forestValue302_899_0)[forestValue302_899_1] = __integerCategory302_180(forestValue302_899_2);
    spill302_74 = life12_7;
    spill302_75 = 2;
    spill302_76 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_917_0 = spill302_74;
        forestValue302_917_1 = spill302_75;
        forestValue302_917_2 = __integerCategory302_181(spill302_76);
        break forest_join_917;
    }
    if (!(spill302_76)) {
        forestValue302_922_0 = spill302_74;
        forestValue302_922_1 = spill302_75;
        break forest_join_922;
    }
    forestValue302_917_0 = spill302_74;
    forestValue302_917_1 = spill302_75;
    forestValue302_917_2 = __integerCategory302_184(__call302_183(p0, p1, p2, __call302_182(life13_925), p5, p6, p7));
    }
    if (!((life11_8 != null))) {
        forestValue302_921_0 = forestValue302_917_0;
        forestValue302_921_1 = forestValue302_917_1;
        forestValue302_921_2 = forestValue302_917_2;
        break forest_join_921;
    }
    if (!((forestValue302_917_2 == 0))) {
        forestValue302_922_0 = forestValue302_917_0;
        forestValue302_922_1 = forestValue302_917_1;
        break forest_join_922;
    }
    forestValue302_921_0 = forestValue302_917_0;
    forestValue302_921_1 = forestValue302_917_1;
    forestValue302_921_2 = 1;
    }
    forestValue302_923_0 = forestValue302_921_0;
    forestValue302_923_1 = forestValue302_921_1;
    forestValue302_923_2 = forestValue302_921_2;
    break forest_join_923;
    }
    forestValue302_923_0 = forestValue302_922_0;
    forestValue302_923_1 = forestValue302_922_1;
    forestValue302_923_2 = 0;
    }
    (forestValue302_923_0)[forestValue302_923_1] = __integerCategory302_185(forestValue302_923_2);
    spill302_77 = life12_7;
    spill302_78 = 3;
    spill302_79 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_941_0 = spill302_77;
        forestValue302_941_1 = spill302_78;
        forestValue302_941_2 = __integerCategory302_186(spill302_79);
        break forest_join_941;
    }
    if (!(spill302_79)) {
        forestValue302_946_0 = spill302_77;
        forestValue302_946_1 = spill302_78;
        break forest_join_946;
    }
    forestValue302_941_0 = spill302_77;
    forestValue302_941_1 = spill302_78;
    forestValue302_941_2 = __integerCategory302_189(__call302_188(p0, p1, p2, __call302_187(life13_925), p5, p6, p7));
    }
    if (!((life11_8 != null))) {
        forestValue302_945_0 = forestValue302_941_0;
        forestValue302_945_1 = forestValue302_941_1;
        forestValue302_945_2 = forestValue302_941_2;
        break forest_join_945;
    }
    if (!((forestValue302_941_2 == 0))) {
        forestValue302_946_0 = forestValue302_941_0;
        forestValue302_946_1 = forestValue302_941_1;
        break forest_join_946;
    }
    forestValue302_945_0 = forestValue302_941_0;
    forestValue302_945_1 = forestValue302_941_1;
    forestValue302_945_2 = 1;
    }
    forestValue302_947_0 = forestValue302_945_0;
    forestValue302_947_1 = forestValue302_945_1;
    forestValue302_947_2 = forestValue302_945_2;
    break forest_join_947;
    }
    forestValue302_947_0 = forestValue302_946_0;
    forestValue302_947_1 = forestValue302_946_1;
    forestValue302_947_2 = 0;
    }
    (forestValue302_947_0)[forestValue302_947_1] = __integerCategory302_190(forestValue302_947_2);
    }
    forestValue302_949_0 = p4;
    }
    if (!((life11_8 != null))) {
        forestValue302_962_0 = forestValue302_949_0;
        break forest_join_962;
    }
    if (!((forestValue302_949_0 == 2))) {
        break forest_join_961;
    }
    __call302_191(0, 1, life12_7);
    __call302_192(2, 3, life12_7);
    }
    forestValue302_962_0 = 0;
    }
    life13_1050 = forestValue302_962_0;
    spill302_80 = (life12_7)[0];
    spill302_81 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_973_0 = __integerCategory302_193(spill302_80);
        forestValue302_973_1 = __integerCategory302_194(spill302_81);
        break forest_join_973;
    }
    if (!((!spill302_81))) {
        forestValue302_974_0 = __integerCategory302_195(spill302_80);
        break forest_join_974;
    }
    forestValue302_973_0 = __integerCategory302_196(spill302_80);
    forestValue302_973_1 = 1;
    }
    forestValue302_975_0 = forestValue302_973_0;
    forestValue302_975_1 = forestValue302_973_1;
    break forest_join_975;
    }
    forestValue302_975_0 = forestValue302_974_0;
    forestValue302_975_1 = 0;
    }
    spill302_82 = (forestValue302_975_0 & forestValue302_975_1);
    spill302_83 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_983_0 = spill302_82;
        forestValue302_983_1 = __integerCategory302_197(spill302_83);
        break forest_join_983;
    }
    if (!((!spill302_83))) {
        forestValue302_984_0 = spill302_82;
        break forest_join_984;
    }
    forestValue302_983_0 = spill302_82;
    forestValue302_983_1 = 1;
    }
    forestValue302_985_0 = forestValue302_983_0;
    forestValue302_985_1 = forestValue302_983_1;
    break forest_join_985;
    }
    forestValue302_985_0 = forestValue302_984_0;
    forestValue302_985_1 = 0;
    }
    spill302_84 = (forestValue302_985_0 & forestValue302_985_1);
    spill302_85 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_993_0 = spill302_84;
        forestValue302_993_1 = __integerCategory302_198(spill302_85);
        break forest_join_993;
    }
    if (!((!spill302_85))) {
        forestValue302_994_0 = spill302_84;
        break forest_join_994;
    }
    forestValue302_993_0 = spill302_84;
    forestValue302_993_1 = 1;
    }
    forestValue302_995_0 = forestValue302_993_0;
    forestValue302_995_1 = forestValue302_993_1;
    break forest_join_995;
    }
    forestValue302_995_0 = forestValue302_994_0;
    forestValue302_995_1 = 0;
    }
    spill302_86 = (forestValue302_995_0 & forestValue302_995_1);
    if (!((life11_8 != null))) {
        forestValue302_1006_0 = spill302_86;
        break forest_join_1006;
    }
    if (!((spill302_86 != 0))) {
        break forest_join_1003;
    }
    life13_1050 = 3;
    if (!((life11_8 == null))) {
        break forest_join_1507;
    }
    }
    forestValue302_1006_0 = __integerCategory302_199((life12_7)[0]);
    }
    if (!((life11_8 != null))) {
        forestValue302_1010_0 = forestValue302_1006_0;
        break forest_join_1010;
    }
    if (!((forestValue302_1006_0 == 0))) {
        break forest_join_1011;
    }
    forestValue302_1010_0 = 1;
    }
    forestValue302_1012_0 = forestValue302_1010_0;
    break forest_join_1012;
    }
    forestValue302_1012_0 = 0;
    }
    spill302_87 = (forestValue302_1012_0 & __integerCategory302_200((life12_7)[1]));
    spill302_88 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_1023_0 = spill302_87;
        forestValue302_1023_1 = __integerCategory302_201(spill302_88);
        break forest_join_1023;
    }
    if (!((!spill302_88))) {
        forestValue302_1024_0 = spill302_87;
        break forest_join_1024;
    }
    forestValue302_1023_0 = spill302_87;
    forestValue302_1023_1 = 1;
    }
    forestValue302_1025_0 = forestValue302_1023_0;
    forestValue302_1025_1 = forestValue302_1023_1;
    break forest_join_1025;
    }
    forestValue302_1025_0 = forestValue302_1024_0;
    forestValue302_1025_1 = 0;
    }
    spill302_89 = (forestValue302_1025_0 & forestValue302_1025_1);
    spill302_90 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_1033_0 = spill302_89;
        forestValue302_1033_1 = __integerCategory302_202(spill302_90);
        break forest_join_1033;
    }
    if (!((!spill302_90))) {
        forestValue302_1034_0 = spill302_89;
        break forest_join_1034;
    }
    forestValue302_1033_0 = spill302_89;
    forestValue302_1033_1 = 1;
    }
    forestValue302_1035_0 = forestValue302_1033_0;
    forestValue302_1035_1 = forestValue302_1033_1;
    break forest_join_1035;
    }
    forestValue302_1035_0 = forestValue302_1034_0;
    forestValue302_1035_1 = 0;
    }
    spill302_91 = (forestValue302_1035_0 & forestValue302_1035_1);
    if (!((life11_8 != null))) {
        forestValue302_1046_0 = spill302_91;
        break forest_join_1046;
    }
    if (!((spill302_91 != 0))) {
        break forest_join_1043;
    }
    life13_1050 = 1;
    if (!((life11_8 == null))) {
        break forest_join_1507;
    }
    }
    forestValue302_1046_0 = __integerCategory302_203((life12_7)[0]);
    }
    if (!((life11_8 != null))) {
        forestValue302_1050_0 = forestValue302_1046_0;
        break forest_join_1050;
    }
    if (!((forestValue302_1046_0 == 0))) {
        break forest_join_1051;
    }
    forestValue302_1050_0 = 1;
    }
    forestValue302_1052_0 = forestValue302_1050_0;
    break forest_join_1052;
    }
    forestValue302_1052_0 = 0;
    }
    spill302_92 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_1059_0 = forestValue302_1052_0;
        forestValue302_1059_1 = __integerCategory302_204(spill302_92);
        break forest_join_1059;
    }
    if (!((!spill302_92))) {
        forestValue302_1060_0 = forestValue302_1052_0;
        break forest_join_1060;
    }
    forestValue302_1059_0 = forestValue302_1052_0;
    forestValue302_1059_1 = 1;
    }
    forestValue302_1061_0 = forestValue302_1059_0;
    forestValue302_1061_1 = forestValue302_1059_1;
    break forest_join_1061;
    }
    forestValue302_1061_0 = forestValue302_1060_0;
    forestValue302_1061_1 = 0;
    }
    spill302_93 = ((forestValue302_1061_0 & forestValue302_1061_1) & __integerCategory302_205((life12_7)[2]));
    spill302_94 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_1073_0 = spill302_93;
        forestValue302_1073_1 = __integerCategory302_206(spill302_94);
        break forest_join_1073;
    }
    if (!((!spill302_94))) {
        forestValue302_1074_0 = spill302_93;
        break forest_join_1074;
    }
    forestValue302_1073_0 = spill302_93;
    forestValue302_1073_1 = 1;
    }
    forestValue302_1075_0 = forestValue302_1073_0;
    forestValue302_1075_1 = forestValue302_1073_1;
    break forest_join_1075;
    }
    forestValue302_1075_0 = forestValue302_1074_0;
    forestValue302_1075_1 = 0;
    }
    spill302_95 = (forestValue302_1075_0 & forestValue302_1075_1);
    if (!((life11_8 != null))) {
        forestValue302_1090_0 = spill302_95;
        break forest_join_1090;
    }
    if (!((spill302_95 != 0))) {
        break forest_join_1087;
    }
    life13_1050 = __invokedynamic302_207(235, (7234540208909941413L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_1507;
    }
    }
    forestValue302_1090_0 = __integerCategory302_208((life12_7)[0]);
    }
    if (!((life11_8 != null))) {
        forestValue302_1094_0 = forestValue302_1090_0;
        break forest_join_1094;
    }
    if (!((forestValue302_1090_0 == 0))) {
        break forest_join_1095;
    }
    forestValue302_1094_0 = 1;
    }
    forestValue302_1096_0 = forestValue302_1094_0;
    break forest_join_1096;
    }
    forestValue302_1096_0 = 0;
    }
    spill302_96 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_1103_0 = forestValue302_1096_0;
        forestValue302_1103_1 = __integerCategory302_209(spill302_96);
        break forest_join_1103;
    }
    if (!((!spill302_96))) {
        forestValue302_1104_0 = forestValue302_1096_0;
        break forest_join_1104;
    }
    forestValue302_1103_0 = forestValue302_1096_0;
    forestValue302_1103_1 = 1;
    }
    forestValue302_1105_0 = forestValue302_1103_0;
    forestValue302_1105_1 = forestValue302_1103_1;
    break forest_join_1105;
    }
    forestValue302_1105_0 = forestValue302_1104_0;
    forestValue302_1105_1 = 0;
    }
    spill302_97 = (forestValue302_1105_0 & forestValue302_1105_1);
    spill302_98 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_1113_0 = spill302_97;
        forestValue302_1113_1 = __integerCategory302_210(spill302_98);
        break forest_join_1113;
    }
    if (!((!spill302_98))) {
        forestValue302_1114_0 = spill302_97;
        break forest_join_1114;
    }
    forestValue302_1113_0 = spill302_97;
    forestValue302_1113_1 = 1;
    }
    forestValue302_1115_0 = forestValue302_1113_0;
    forestValue302_1115_1 = forestValue302_1113_1;
    break forest_join_1115;
    }
    forestValue302_1115_0 = forestValue302_1114_0;
    forestValue302_1115_1 = 0;
    }
    spill302_99 = ((forestValue302_1115_0 & forestValue302_1115_1) & __integerCategory302_211((life12_7)[3]));
    if (!((life11_8 != null))) {
        forestValue302_1138_0 = spill302_99;
        break forest_join_1138;
    }
    if (!((spill302_99 != 0))) {
        break forest_join_1131;
    }
    life13_1050 = __invokedynamic302_212(28687, (6095813430545320520L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_1507;
    }
    }
    forestValue302_1138_0 = (__integerCategory302_213((life12_7)[0]) & __integerCategory302_214((life12_7)[1]));
    }
    spill302_100 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_1145_0 = forestValue302_1138_0;
        forestValue302_1145_1 = __integerCategory302_215(spill302_100);
        break forest_join_1145;
    }
    if (!((!spill302_100))) {
        forestValue302_1146_0 = forestValue302_1138_0;
        break forest_join_1146;
    }
    forestValue302_1145_0 = forestValue302_1138_0;
    forestValue302_1145_1 = 1;
    }
    forestValue302_1147_0 = forestValue302_1145_0;
    forestValue302_1147_1 = forestValue302_1145_1;
    break forest_join_1147;
    }
    forestValue302_1147_0 = forestValue302_1146_0;
    forestValue302_1147_1 = 0;
    }
    spill302_101 = (forestValue302_1147_0 & forestValue302_1147_1);
    spill302_102 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_1155_0 = spill302_101;
        forestValue302_1155_1 = __integerCategory302_216(spill302_102);
        break forest_join_1155;
    }
    if (!((!spill302_102))) {
        forestValue302_1156_0 = spill302_101;
        break forest_join_1156;
    }
    forestValue302_1155_0 = spill302_101;
    forestValue302_1155_1 = 1;
    }
    forestValue302_1157_0 = forestValue302_1155_0;
    forestValue302_1157_1 = forestValue302_1155_1;
    break forest_join_1157;
    }
    forestValue302_1157_0 = forestValue302_1156_0;
    forestValue302_1157_1 = 0;
    }
    spill302_103 = (forestValue302_1157_0 & forestValue302_1157_1);
    if (!((life11_8 != null))) {
        forestValue302_1168_0 = spill302_103;
        break forest_join_1168;
    }
    if (!((spill302_103 != 0))) {
        break forest_join_1165;
    }
    life13_1050 = 2;
    if (!((life11_8 == null))) {
        break forest_join_1507;
    }
    }
    forestValue302_1168_0 = __integerCategory302_217((life12_7)[0]);
    }
    if (!((life11_8 != null))) {
        forestValue302_1172_0 = forestValue302_1168_0;
        break forest_join_1172;
    }
    if (!((forestValue302_1168_0 == 0))) {
        break forest_join_1173;
    }
    forestValue302_1172_0 = 1;
    }
    forestValue302_1174_0 = forestValue302_1172_0;
    break forest_join_1174;
    }
    forestValue302_1174_0 = 0;
    }
    spill302_104 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_1181_0 = forestValue302_1174_0;
        forestValue302_1181_1 = __integerCategory302_218(spill302_104);
        break forest_join_1181;
    }
    if (!((!spill302_104))) {
        forestValue302_1182_0 = forestValue302_1174_0;
        break forest_join_1182;
    }
    forestValue302_1181_0 = forestValue302_1174_0;
    forestValue302_1181_1 = 1;
    }
    forestValue302_1183_0 = forestValue302_1181_0;
    forestValue302_1183_1 = forestValue302_1181_1;
    break forest_join_1183;
    }
    forestValue302_1183_0 = forestValue302_1182_0;
    forestValue302_1183_1 = 0;
    }
    spill302_105 = (((forestValue302_1183_0 & forestValue302_1183_1) & __integerCategory302_219((life12_7)[2])) & __integerCategory302_220((life12_7)[3]));
    if (!((life11_8 != null))) {
        forestValue302_1206_0 = spill302_105;
        break forest_join_1206;
    }
    if (!((spill302_105 != 0))) {
        break forest_join_1203;
    }
    life13_1050 = __invokedynamic302_221(28636, (8064019027832444322L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_1507;
    }
    }
    forestValue302_1206_0 = __integerCategory302_222((life12_7)[0]);
    }
    spill302_106 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_1213_0 = forestValue302_1206_0;
        forestValue302_1213_1 = __integerCategory302_223(spill302_106);
        break forest_join_1213;
    }
    if (!((!spill302_106))) {
        forestValue302_1214_0 = forestValue302_1206_0;
        break forest_join_1214;
    }
    forestValue302_1213_0 = forestValue302_1206_0;
    forestValue302_1213_1 = 1;
    }
    forestValue302_1215_0 = forestValue302_1213_0;
    forestValue302_1215_1 = forestValue302_1213_1;
    break forest_join_1215;
    }
    forestValue302_1215_0 = forestValue302_1214_0;
    forestValue302_1215_1 = 0;
    }
    spill302_107 = ((forestValue302_1215_0 & forestValue302_1215_1) & __integerCategory302_224((life12_7)[2]));
    spill302_108 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_1227_0 = spill302_107;
        forestValue302_1227_1 = __integerCategory302_225(spill302_108);
        break forest_join_1227;
    }
    if (!((!spill302_108))) {
        forestValue302_1228_0 = spill302_107;
        break forest_join_1228;
    }
    forestValue302_1227_0 = spill302_107;
    forestValue302_1227_1 = 1;
    }
    forestValue302_1229_0 = forestValue302_1227_0;
    forestValue302_1229_1 = forestValue302_1227_1;
    break forest_join_1229;
    }
    forestValue302_1229_0 = forestValue302_1228_0;
    forestValue302_1229_1 = 0;
    }
    spill302_109 = (forestValue302_1229_0 & forestValue302_1229_1);
    if (!((life11_8 != null))) {
        forestValue302_1244_0 = spill302_109;
        break forest_join_1244;
    }
    if (!((spill302_109 != 0))) {
        break forest_join_1241;
    }
    life13_1050 = __invokedynamic302_226(27376, (4718866725282025658L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_1507;
    }
    }
    forestValue302_1244_0 = __integerCategory302_227((life12_7)[0]);
    }
    spill302_110 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_1251_0 = forestValue302_1244_0;
        forestValue302_1251_1 = __integerCategory302_228(spill302_110);
        break forest_join_1251;
    }
    if (!((!spill302_110))) {
        forestValue302_1252_0 = forestValue302_1244_0;
        break forest_join_1252;
    }
    forestValue302_1251_0 = forestValue302_1244_0;
    forestValue302_1251_1 = 1;
    }
    forestValue302_1253_0 = forestValue302_1251_0;
    forestValue302_1253_1 = forestValue302_1251_1;
    break forest_join_1253;
    }
    forestValue302_1253_0 = forestValue302_1252_0;
    forestValue302_1253_1 = 0;
    }
    spill302_111 = (forestValue302_1253_0 & forestValue302_1253_1);
    spill302_112 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_1261_0 = spill302_111;
        forestValue302_1261_1 = __integerCategory302_229(spill302_112);
        break forest_join_1261;
    }
    if (!((!spill302_112))) {
        forestValue302_1262_0 = spill302_111;
        break forest_join_1262;
    }
    forestValue302_1261_0 = spill302_111;
    forestValue302_1261_1 = 1;
    }
    forestValue302_1263_0 = forestValue302_1261_0;
    forestValue302_1263_1 = forestValue302_1261_1;
    break forest_join_1263;
    }
    forestValue302_1263_0 = forestValue302_1262_0;
    forestValue302_1263_1 = 0;
    }
    spill302_113 = ((forestValue302_1263_0 & forestValue302_1263_1) & __integerCategory302_230((life12_7)[3]));
    if (!((life11_8 != null))) {
        forestValue302_1282_0 = spill302_113;
        break forest_join_1282;
    }
    if (!((spill302_113 != 0))) {
        break forest_join_1279;
    }
    life13_1050 = __invokedynamic302_231(13430, (6442313297066479133L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_1507;
    }
    }
    forestValue302_1282_0 = __integerCategory302_232((life12_7)[0]);
    }
    if (!((life11_8 != null))) {
        forestValue302_1286_0 = forestValue302_1282_0;
        break forest_join_1286;
    }
    if (!((forestValue302_1282_0 == 0))) {
        break forest_join_1287;
    }
    forestValue302_1286_0 = 1;
    }
    forestValue302_1288_0 = forestValue302_1286_0;
    break forest_join_1288;
    }
    forestValue302_1288_0 = 0;
    }
    spill302_114 = ((forestValue302_1288_0 & __integerCategory302_233((life12_7)[1])) & __integerCategory302_234((life12_7)[2]));
    spill302_115 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_1303_0 = spill302_114;
        forestValue302_1303_1 = __integerCategory302_235(spill302_115);
        break forest_join_1303;
    }
    if (!((!spill302_115))) {
        forestValue302_1304_0 = spill302_114;
        break forest_join_1304;
    }
    forestValue302_1303_0 = spill302_114;
    forestValue302_1303_1 = 1;
    }
    forestValue302_1305_0 = forestValue302_1303_0;
    forestValue302_1305_1 = forestValue302_1303_1;
    break forest_join_1305;
    }
    forestValue302_1305_0 = forestValue302_1304_0;
    forestValue302_1305_1 = 0;
    }
    spill302_116 = (forestValue302_1305_0 & forestValue302_1305_1);
    if (!((life11_8 != null))) {
        forestValue302_1320_0 = spill302_116;
        break forest_join_1320;
    }
    if (!((spill302_116 != 0))) {
        break forest_join_1317;
    }
    life13_1050 = __invokedynamic302_236(8940, (9129925952393369755L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_1507;
    }
    }
    forestValue302_1320_0 = __integerCategory302_237((life12_7)[0]);
    }
    if (!((life11_8 != null))) {
        forestValue302_1324_0 = forestValue302_1320_0;
        break forest_join_1324;
    }
    if (!((forestValue302_1320_0 == 0))) {
        break forest_join_1325;
    }
    forestValue302_1324_0 = 1;
    }
    forestValue302_1326_0 = forestValue302_1324_0;
    break forest_join_1326;
    }
    forestValue302_1326_0 = 0;
    }
    spill302_117 = (forestValue302_1326_0 & __integerCategory302_238((life12_7)[1]));
    spill302_118 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_1337_0 = spill302_117;
        forestValue302_1337_1 = __integerCategory302_239(spill302_118);
        break forest_join_1337;
    }
    if (!((!spill302_118))) {
        forestValue302_1338_0 = spill302_117;
        break forest_join_1338;
    }
    forestValue302_1337_0 = spill302_117;
    forestValue302_1337_1 = 1;
    }
    forestValue302_1339_0 = forestValue302_1337_0;
    forestValue302_1339_1 = forestValue302_1337_1;
    break forest_join_1339;
    }
    forestValue302_1339_0 = forestValue302_1338_0;
    forestValue302_1339_1 = 0;
    }
    spill302_119 = ((forestValue302_1339_0 & forestValue302_1339_1) & __integerCategory302_240((life12_7)[3]));
    if (!((life11_8 != null))) {
        forestValue302_1358_0 = spill302_119;
        break forest_join_1358;
    }
    if (!((spill302_119 != 0))) {
        break forest_join_1355;
    }
    life13_1050 = __invokedynamic302_241(30601, (3605998996814925311L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_1507;
    }
    }
    forestValue302_1358_0 = __integerCategory302_242((life12_7)[0]);
    }
    if (!((life11_8 != null))) {
        forestValue302_1362_0 = forestValue302_1358_0;
        break forest_join_1362;
    }
    if (!((forestValue302_1358_0 == 0))) {
        break forest_join_1363;
    }
    forestValue302_1362_0 = 1;
    }
    forestValue302_1364_0 = forestValue302_1362_0;
    break forest_join_1364;
    }
    forestValue302_1364_0 = 0;
    }
    spill302_120 = (((forestValue302_1364_0 & __integerCategory302_243((life12_7)[1])) & __integerCategory302_244((life12_7)[2])) & __integerCategory302_245((life12_7)[3]));
    if (!((life11_8 != null))) {
        forestValue302_1390_0 = spill302_120;
        break forest_join_1390;
    }
    if (!((spill302_120 != 0))) {
        break forest_join_1387;
    }
    life13_1050 = __invokedynamic302_246(13860, (7677132380385397886L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_1507;
    }
    }
    forestValue302_1390_0 = __integerCategory302_247((life12_7)[0]);
    }
    spill302_121 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_1397_0 = forestValue302_1390_0;
        forestValue302_1397_1 = __integerCategory302_248(spill302_121);
        break forest_join_1397;
    }
    if (!((!spill302_121))) {
        forestValue302_1398_0 = forestValue302_1390_0;
        break forest_join_1398;
    }
    forestValue302_1397_0 = forestValue302_1390_0;
    forestValue302_1397_1 = 1;
    }
    forestValue302_1399_0 = forestValue302_1397_0;
    forestValue302_1399_1 = forestValue302_1397_1;
    break forest_join_1399;
    }
    forestValue302_1399_0 = forestValue302_1398_0;
    forestValue302_1399_1 = 0;
    }
    spill302_122 = (((forestValue302_1399_0 & forestValue302_1399_1) & __integerCategory302_249((life12_7)[2])) & __integerCategory302_250((life12_7)[3]));
    if (!((life11_8 != null))) {
        forestValue302_1426_0 = spill302_122;
        break forest_join_1426;
    }
    if (!((spill302_122 != 0))) {
        break forest_join_1419;
    }
    life13_1050 = __invokedynamic302_251(29942, (7747241448373554829L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_1507;
    }
    }
    forestValue302_1426_0 = (__integerCategory302_252((life12_7)[0]) & __integerCategory302_253((life12_7)[1]));
    }
    spill302_123 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_1433_0 = forestValue302_1426_0;
        forestValue302_1433_1 = __integerCategory302_254(spill302_123);
        break forest_join_1433;
    }
    if (!((!spill302_123))) {
        forestValue302_1434_0 = forestValue302_1426_0;
        break forest_join_1434;
    }
    forestValue302_1433_0 = forestValue302_1426_0;
    forestValue302_1433_1 = 1;
    }
    forestValue302_1435_0 = forestValue302_1433_0;
    forestValue302_1435_1 = forestValue302_1433_1;
    break forest_join_1435;
    }
    forestValue302_1435_0 = forestValue302_1434_0;
    forestValue302_1435_1 = 0;
    }
    spill302_124 = ((forestValue302_1435_0 & forestValue302_1435_1) & __integerCategory302_255((life12_7)[3]));
    if (!((life11_8 != null))) {
        forestValue302_1462_0 = spill302_124;
        break forest_join_1462;
    }
    if (!((spill302_124 != 0))) {
        break forest_join_1451;
    }
    life13_1050 = __invokedynamic302_256(13945, (5633683592910195746L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_1507;
    }
    }
    forestValue302_1462_0 = ((__integerCategory302_257((life12_7)[0]) & __integerCategory302_258((life12_7)[1])) & __integerCategory302_259((life12_7)[2]));
    }
    spill302_125 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_1469_0 = forestValue302_1462_0;
        forestValue302_1469_1 = __integerCategory302_260(spill302_125);
        break forest_join_1469;
    }
    if (!((!spill302_125))) {
        forestValue302_1470_0 = forestValue302_1462_0;
        break forest_join_1470;
    }
    forestValue302_1469_0 = forestValue302_1462_0;
    forestValue302_1469_1 = 1;
    }
    forestValue302_1471_0 = forestValue302_1469_0;
    forestValue302_1471_1 = forestValue302_1469_1;
    break forest_join_1471;
    }
    forestValue302_1471_0 = forestValue302_1470_0;
    forestValue302_1471_1 = 0;
    }
    spill302_126 = (forestValue302_1471_0 & forestValue302_1471_1);
    if (!((life11_8 != null))) {
        forestValue302_1498_0 = spill302_126;
        break forest_join_1498;
    }
    if (!((spill302_126 != 0))) {
        break forest_join_1483;
    }
    life13_1050 = __invokedynamic302_261(11867, (3868428000684594228L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_1507;
    }
    }
    forestValue302_1498_0 = (((__integerCategory302_262((life12_7)[0]) & __integerCategory302_263((life12_7)[1])) & __integerCategory302_264((life12_7)[2])) & __integerCategory302_265((life12_7)[3]));
    }
    if (!((life11_8 != null))) {
        forestValue302_1508_0 = forestValue302_1498_0;
        break forest_join_1508;
    }
    if (!((forestValue302_1498_0 != 0))) {
        break forest_join_1507;
    }
    life13_1050 = __invokedynamic302_266(12192, (8395555076385297905L ^ life9_3));
    }
    forestValue302_1508_0 = life13_1050;
    }
    if (!((life11_8 != null))) {
        forestValue302_1514_0 = forestValue302_1508_0;
        break forest_join_1514;
    }
    if (!((forestValue302_1508_0 == 0))) {
        break forest_join_1513;
    }
    return life13_1050;
    }
    forestValue302_1514_0 = __integerCategory302_268(__call302_267());
    }
    if (!((life11_8 != null))) {
        forestValue302_1520_0 = forestValue302_1514_0;
        break forest_join_1520;
    }
    if (!((forestValue302_1514_0 == 0))) {
        break forest_join_1519;
    }
    return life13_1050;
    }
    forestValue302_1520_0 = p5;
    }
    if (!((life11_8 != null))) {
        forestValue302_2664_0 = forestValue302_1520_0;
        break forest_join_2664;
    }
    switch (forestValue302_1520_0) {
case 0:
{
        break forest_join_1523;
    }
case 1:
{
        break forest_join_1709;
    }
case 2:
{
        break forest_join_1895;
    }
case 3:
{
        break forest_join_2094;
    }
case 4:
{
        break forest_join_2280;
    }
case 5:
{
        break forest_join_2466;
    }
default:
{
        break forest_join_2663;
    }
}
    }
    spill302_127 = life12_7;
    spill302_128 = 0;
    spill302_129 = __call302_271(p0, p1, p2, __call302_270(__call302_269(p3)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_1539_0 = spill302_127;
        forestValue302_1539_1 = spill302_128;
        forestValue302_1539_2 = __integerCategory302_272(spill302_129);
        break forest_join_1539;
    }
    if (!((!spill302_129))) {
        forestValue302_1540_0 = spill302_127;
        forestValue302_1540_1 = spill302_128;
        break forest_join_1540;
    }
    forestValue302_1539_0 = spill302_127;
    forestValue302_1539_1 = spill302_128;
    forestValue302_1539_2 = 1;
    }
    forestValue302_1541_0 = forestValue302_1539_0;
    forestValue302_1541_1 = forestValue302_1539_1;
    forestValue302_1541_2 = forestValue302_1539_2;
    break forest_join_1541;
    }
    forestValue302_1541_0 = forestValue302_1540_0;
    forestValue302_1541_1 = forestValue302_1540_1;
    forestValue302_1541_2 = 0;
    }
    (forestValue302_1541_0)[forestValue302_1541_1] = __integerCategory302_273(forestValue302_1541_2);
    spill302_130 = life12_7;
    spill302_131 = 1;
    spill302_132 = __call302_276(p0, p1, p2, __call302_275(__call302_274(p3)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_1558_0 = spill302_130;
        forestValue302_1558_1 = spill302_131;
        forestValue302_1558_2 = __integerCategory302_277(spill302_132);
        break forest_join_1558;
    }
    if (!((!spill302_132))) {
        forestValue302_1559_0 = spill302_130;
        forestValue302_1559_1 = spill302_131;
        break forest_join_1559;
    }
    forestValue302_1558_0 = spill302_130;
    forestValue302_1558_1 = spill302_131;
    forestValue302_1558_2 = 1;
    }
    forestValue302_1560_0 = forestValue302_1558_0;
    forestValue302_1560_1 = forestValue302_1558_1;
    forestValue302_1560_2 = forestValue302_1558_2;
    break forest_join_1560;
    }
    forestValue302_1560_0 = forestValue302_1559_0;
    forestValue302_1560_1 = forestValue302_1559_1;
    forestValue302_1560_2 = 0;
    }
    (forestValue302_1560_0)[forestValue302_1560_1] = __integerCategory302_278(forestValue302_1560_2);
    spill302_133 = life12_7;
    spill302_134 = 2;
    spill302_135 = __call302_281(p0, p1, p2, __call302_280(__call302_279(p3)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_1577_0 = spill302_133;
        forestValue302_1577_1 = spill302_134;
        forestValue302_1577_2 = __integerCategory302_282(spill302_135);
        break forest_join_1577;
    }
    if (!((!spill302_135))) {
        forestValue302_1578_0 = spill302_133;
        forestValue302_1578_1 = spill302_134;
        break forest_join_1578;
    }
    forestValue302_1577_0 = spill302_133;
    forestValue302_1577_1 = spill302_134;
    forestValue302_1577_2 = 1;
    }
    forestValue302_1579_0 = forestValue302_1577_0;
    forestValue302_1579_1 = forestValue302_1577_1;
    forestValue302_1579_2 = forestValue302_1577_2;
    break forest_join_1579;
    }
    forestValue302_1579_0 = forestValue302_1578_0;
    forestValue302_1579_1 = forestValue302_1578_1;
    forestValue302_1579_2 = 0;
    }
    (forestValue302_1579_0)[forestValue302_1579_1] = __integerCategory302_283(forestValue302_1579_2);
    spill302_136 = life12_7;
    spill302_137 = 3;
    spill302_138 = __call302_286(p0, p1, p2, __call302_285(__call302_284(p3)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_1596_0 = spill302_136;
        forestValue302_1596_1 = spill302_137;
        forestValue302_1596_2 = __integerCategory302_287(spill302_138);
        break forest_join_1596;
    }
    if (!((!spill302_138))) {
        forestValue302_1597_0 = spill302_136;
        forestValue302_1597_1 = spill302_137;
        break forest_join_1597;
    }
    forestValue302_1596_0 = spill302_136;
    forestValue302_1596_1 = spill302_137;
    forestValue302_1596_2 = 1;
    }
    forestValue302_1598_0 = forestValue302_1596_0;
    forestValue302_1598_1 = forestValue302_1596_1;
    forestValue302_1598_2 = forestValue302_1596_2;
    break forest_join_1598;
    }
    forestValue302_1598_0 = forestValue302_1597_0;
    forestValue302_1598_1 = forestValue302_1597_1;
    forestValue302_1598_2 = 0;
    }
    (forestValue302_1598_0)[forestValue302_1598_1] = __integerCategory302_288(forestValue302_1598_2);
    spill302_139 = __fieldRead302_289(p0);
    if (!((life11_8 != null))) {
        forestValue302_2664_0 = __integerCategory302_290(spill302_139);
        break forest_join_2664;
    }
    if (!(spill302_139)) {
        break forest_join_2663;
    }
    life14_1759 = __call302_291(p3);
    spill302_140 = life12_7;
    spill302_141 = 0;
    spill302_142 = (life12_7)[0];
    if (!((life11_8 != null))) {
        forestValue302_1629_0 = spill302_140;
        forestValue302_1629_1 = spill302_141;
        forestValue302_1629_2 = __integerCategory302_292(spill302_142);
        break forest_join_1629;
    }
    if (!((!spill302_142))) {
        forestValue302_1628_0 = spill302_140;
        forestValue302_1628_1 = spill302_141;
        break forest_join_1628;
    }
    spill302_143 = __call302_295(p0, p1, p2, __call302_294(__call302_293(life14_1759)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_1629_0 = spill302_140;
        forestValue302_1629_1 = spill302_141;
        forestValue302_1629_2 = __integerCategory302_296(spill302_143);
        break forest_join_1629;
    }
    if (!(spill302_143)) {
        forestValue302_1630_0 = spill302_140;
        forestValue302_1630_1 = spill302_141;
        break forest_join_1630;
    }
    forestValue302_1628_0 = spill302_140;
    forestValue302_1628_1 = spill302_141;
    }
    forestValue302_1629_0 = forestValue302_1628_0;
    forestValue302_1629_1 = forestValue302_1628_1;
    forestValue302_1629_2 = 1;
    }
    forestValue302_1631_0 = forestValue302_1629_0;
    forestValue302_1631_1 = forestValue302_1629_1;
    forestValue302_1631_2 = forestValue302_1629_2;
    break forest_join_1631;
    }
    forestValue302_1631_0 = forestValue302_1630_0;
    forestValue302_1631_1 = forestValue302_1630_1;
    forestValue302_1631_2 = 0;
    }
    (forestValue302_1631_0)[forestValue302_1631_1] = __integerCategory302_297(forestValue302_1631_2);
    spill302_144 = life12_7;
    spill302_145 = 1;
    spill302_146 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_1654_0 = spill302_144;
        forestValue302_1654_1 = spill302_145;
        forestValue302_1654_2 = __integerCategory302_298(spill302_146);
        break forest_join_1654;
    }
    if (!((!spill302_146))) {
        forestValue302_1653_0 = spill302_144;
        forestValue302_1653_1 = spill302_145;
        break forest_join_1653;
    }
    spill302_147 = __call302_301(p0, p1, p2, __call302_300(__call302_299(life14_1759)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_1654_0 = spill302_144;
        forestValue302_1654_1 = spill302_145;
        forestValue302_1654_2 = __integerCategory302_302(spill302_147);
        break forest_join_1654;
    }
    if (!(spill302_147)) {
        forestValue302_1655_0 = spill302_144;
        forestValue302_1655_1 = spill302_145;
        break forest_join_1655;
    }
    forestValue302_1653_0 = spill302_144;
    forestValue302_1653_1 = spill302_145;
    }
    forestValue302_1654_0 = forestValue302_1653_0;
    forestValue302_1654_1 = forestValue302_1653_1;
    forestValue302_1654_2 = 1;
    }
    forestValue302_1656_0 = forestValue302_1654_0;
    forestValue302_1656_1 = forestValue302_1654_1;
    forestValue302_1656_2 = forestValue302_1654_2;
    break forest_join_1656;
    }
    forestValue302_1656_0 = forestValue302_1655_0;
    forestValue302_1656_1 = forestValue302_1655_1;
    forestValue302_1656_2 = 0;
    }
    (forestValue302_1656_0)[forestValue302_1656_1] = __integerCategory302_303(forestValue302_1656_2);
    spill302_148 = life12_7;
    spill302_149 = 2;
    spill302_150 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_1679_0 = spill302_148;
        forestValue302_1679_1 = spill302_149;
        forestValue302_1679_2 = __integerCategory302_304(spill302_150);
        break forest_join_1679;
    }
    if (!((!spill302_150))) {
        forestValue302_1678_0 = spill302_148;
        forestValue302_1678_1 = spill302_149;
        break forest_join_1678;
    }
    spill302_151 = __call302_307(p0, p1, p2, __call302_306(__call302_305(life14_1759)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_1679_0 = spill302_148;
        forestValue302_1679_1 = spill302_149;
        forestValue302_1679_2 = __integerCategory302_308(spill302_151);
        break forest_join_1679;
    }
    if (!(spill302_151)) {
        forestValue302_1680_0 = spill302_148;
        forestValue302_1680_1 = spill302_149;
        break forest_join_1680;
    }
    forestValue302_1678_0 = spill302_148;
    forestValue302_1678_1 = spill302_149;
    }
    forestValue302_1679_0 = forestValue302_1678_0;
    forestValue302_1679_1 = forestValue302_1678_1;
    forestValue302_1679_2 = 1;
    }
    forestValue302_1681_0 = forestValue302_1679_0;
    forestValue302_1681_1 = forestValue302_1679_1;
    forestValue302_1681_2 = forestValue302_1679_2;
    break forest_join_1681;
    }
    forestValue302_1681_0 = forestValue302_1680_0;
    forestValue302_1681_1 = forestValue302_1680_1;
    forestValue302_1681_2 = 0;
    }
    (forestValue302_1681_0)[forestValue302_1681_1] = __integerCategory302_309(forestValue302_1681_2);
    spill302_152 = life12_7;
    spill302_153 = 3;
    spill302_154 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_1704_0 = spill302_152;
        forestValue302_1704_1 = spill302_153;
        forestValue302_1704_2 = __integerCategory302_310(spill302_154);
        break forest_join_1704;
    }
    if (!((!spill302_154))) {
        forestValue302_1703_0 = spill302_152;
        forestValue302_1703_1 = spill302_153;
        break forest_join_1703;
    }
    spill302_155 = __call302_313(p0, p1, p2, __call302_312(__call302_311(life14_1759)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_1704_0 = spill302_152;
        forestValue302_1704_1 = spill302_153;
        forestValue302_1704_2 = __integerCategory302_314(spill302_155);
        break forest_join_1704;
    }
    if (!(spill302_155)) {
        forestValue302_1705_0 = spill302_152;
        forestValue302_1705_1 = spill302_153;
        break forest_join_1705;
    }
    forestValue302_1703_0 = spill302_152;
    forestValue302_1703_1 = spill302_153;
    }
    forestValue302_1704_0 = forestValue302_1703_0;
    forestValue302_1704_1 = forestValue302_1703_1;
    forestValue302_1704_2 = 1;
    }
    forestValue302_1706_0 = forestValue302_1704_0;
    forestValue302_1706_1 = forestValue302_1704_1;
    forestValue302_1706_2 = forestValue302_1704_2;
    break forest_join_1706;
    }
    forestValue302_1706_0 = forestValue302_1705_0;
    forestValue302_1706_1 = forestValue302_1705_1;
    forestValue302_1706_2 = 0;
    }
    (forestValue302_1706_0)[forestValue302_1706_1] = __integerCategory302_315(forestValue302_1706_2);
    if (!((life11_8 == null))) {
        break forest_join_2663;
    }
    }
    spill302_156 = life12_7;
    spill302_157 = 0;
    spill302_158 = __call302_318(p0, p1, p2, __call302_317(__call302_316(p3)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_1725_0 = spill302_156;
        forestValue302_1725_1 = spill302_157;
        forestValue302_1725_2 = __integerCategory302_319(spill302_158);
        break forest_join_1725;
    }
    if (!((!spill302_158))) {
        forestValue302_1726_0 = spill302_156;
        forestValue302_1726_1 = spill302_157;
        break forest_join_1726;
    }
    forestValue302_1725_0 = spill302_156;
    forestValue302_1725_1 = spill302_157;
    forestValue302_1725_2 = 1;
    }
    forestValue302_1727_0 = forestValue302_1725_0;
    forestValue302_1727_1 = forestValue302_1725_1;
    forestValue302_1727_2 = forestValue302_1725_2;
    break forest_join_1727;
    }
    forestValue302_1727_0 = forestValue302_1726_0;
    forestValue302_1727_1 = forestValue302_1726_1;
    forestValue302_1727_2 = 0;
    }
    (forestValue302_1727_0)[forestValue302_1727_1] = __integerCategory302_320(forestValue302_1727_2);
    spill302_159 = life12_7;
    spill302_160 = 1;
    spill302_161 = __call302_323(p0, p1, p2, __call302_322(__call302_321(p3)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_1744_0 = spill302_159;
        forestValue302_1744_1 = spill302_160;
        forestValue302_1744_2 = __integerCategory302_324(spill302_161);
        break forest_join_1744;
    }
    if (!((!spill302_161))) {
        forestValue302_1745_0 = spill302_159;
        forestValue302_1745_1 = spill302_160;
        break forest_join_1745;
    }
    forestValue302_1744_0 = spill302_159;
    forestValue302_1744_1 = spill302_160;
    forestValue302_1744_2 = 1;
    }
    forestValue302_1746_0 = forestValue302_1744_0;
    forestValue302_1746_1 = forestValue302_1744_1;
    forestValue302_1746_2 = forestValue302_1744_2;
    break forest_join_1746;
    }
    forestValue302_1746_0 = forestValue302_1745_0;
    forestValue302_1746_1 = forestValue302_1745_1;
    forestValue302_1746_2 = 0;
    }
    (forestValue302_1746_0)[forestValue302_1746_1] = __integerCategory302_325(forestValue302_1746_2);
    spill302_162 = life12_7;
    spill302_163 = 2;
    spill302_164 = __call302_328(p0, p1, p2, __call302_327(__call302_326(p3)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_1763_0 = spill302_162;
        forestValue302_1763_1 = spill302_163;
        forestValue302_1763_2 = __integerCategory302_329(spill302_164);
        break forest_join_1763;
    }
    if (!((!spill302_164))) {
        forestValue302_1764_0 = spill302_162;
        forestValue302_1764_1 = spill302_163;
        break forest_join_1764;
    }
    forestValue302_1763_0 = spill302_162;
    forestValue302_1763_1 = spill302_163;
    forestValue302_1763_2 = 1;
    }
    forestValue302_1765_0 = forestValue302_1763_0;
    forestValue302_1765_1 = forestValue302_1763_1;
    forestValue302_1765_2 = forestValue302_1763_2;
    break forest_join_1765;
    }
    forestValue302_1765_0 = forestValue302_1764_0;
    forestValue302_1765_1 = forestValue302_1764_1;
    forestValue302_1765_2 = 0;
    }
    (forestValue302_1765_0)[forestValue302_1765_1] = __integerCategory302_330(forestValue302_1765_2);
    spill302_165 = life12_7;
    spill302_166 = 3;
    spill302_167 = __call302_333(p0, p1, p2, __call302_332(__call302_331(p3)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_1782_0 = spill302_165;
        forestValue302_1782_1 = spill302_166;
        forestValue302_1782_2 = __integerCategory302_334(spill302_167);
        break forest_join_1782;
    }
    if (!((!spill302_167))) {
        forestValue302_1783_0 = spill302_165;
        forestValue302_1783_1 = spill302_166;
        break forest_join_1783;
    }
    forestValue302_1782_0 = spill302_165;
    forestValue302_1782_1 = spill302_166;
    forestValue302_1782_2 = 1;
    }
    forestValue302_1784_0 = forestValue302_1782_0;
    forestValue302_1784_1 = forestValue302_1782_1;
    forestValue302_1784_2 = forestValue302_1782_2;
    break forest_join_1784;
    }
    forestValue302_1784_0 = forestValue302_1783_0;
    forestValue302_1784_1 = forestValue302_1783_1;
    forestValue302_1784_2 = 0;
    }
    (forestValue302_1784_0)[forestValue302_1784_1] = __integerCategory302_335(forestValue302_1784_2);
    spill302_168 = __fieldRead302_336(p0);
    if (!((life11_8 != null))) {
        forestValue302_2664_0 = __integerCategory302_337(spill302_168);
        break forest_join_2664;
    }
    if (!(spill302_168)) {
        break forest_join_2663;
    }
    life14_1963 = __call302_338(p3);
    spill302_169 = life12_7;
    spill302_170 = 0;
    spill302_171 = (life12_7)[0];
    if (!((life11_8 != null))) {
        forestValue302_1815_0 = spill302_169;
        forestValue302_1815_1 = spill302_170;
        forestValue302_1815_2 = __integerCategory302_339(spill302_171);
        break forest_join_1815;
    }
    if (!((!spill302_171))) {
        forestValue302_1814_0 = spill302_169;
        forestValue302_1814_1 = spill302_170;
        break forest_join_1814;
    }
    spill302_172 = __call302_342(p0, p1, p2, __call302_341(__call302_340(life14_1963)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_1815_0 = spill302_169;
        forestValue302_1815_1 = spill302_170;
        forestValue302_1815_2 = __integerCategory302_343(spill302_172);
        break forest_join_1815;
    }
    if (!(spill302_172)) {
        forestValue302_1816_0 = spill302_169;
        forestValue302_1816_1 = spill302_170;
        break forest_join_1816;
    }
    forestValue302_1814_0 = spill302_169;
    forestValue302_1814_1 = spill302_170;
    }
    forestValue302_1815_0 = forestValue302_1814_0;
    forestValue302_1815_1 = forestValue302_1814_1;
    forestValue302_1815_2 = 1;
    }
    forestValue302_1817_0 = forestValue302_1815_0;
    forestValue302_1817_1 = forestValue302_1815_1;
    forestValue302_1817_2 = forestValue302_1815_2;
    break forest_join_1817;
    }
    forestValue302_1817_0 = forestValue302_1816_0;
    forestValue302_1817_1 = forestValue302_1816_1;
    forestValue302_1817_2 = 0;
    }
    (forestValue302_1817_0)[forestValue302_1817_1] = __integerCategory302_344(forestValue302_1817_2);
    spill302_173 = life12_7;
    spill302_174 = 1;
    spill302_175 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_1840_0 = spill302_173;
        forestValue302_1840_1 = spill302_174;
        forestValue302_1840_2 = __integerCategory302_345(spill302_175);
        break forest_join_1840;
    }
    if (!((!spill302_175))) {
        forestValue302_1839_0 = spill302_173;
        forestValue302_1839_1 = spill302_174;
        break forest_join_1839;
    }
    spill302_176 = __call302_348(p0, p1, p2, __call302_347(__call302_346(life14_1963)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_1840_0 = spill302_173;
        forestValue302_1840_1 = spill302_174;
        forestValue302_1840_2 = __integerCategory302_349(spill302_176);
        break forest_join_1840;
    }
    if (!(spill302_176)) {
        forestValue302_1841_0 = spill302_173;
        forestValue302_1841_1 = spill302_174;
        break forest_join_1841;
    }
    forestValue302_1839_0 = spill302_173;
    forestValue302_1839_1 = spill302_174;
    }
    forestValue302_1840_0 = forestValue302_1839_0;
    forestValue302_1840_1 = forestValue302_1839_1;
    forestValue302_1840_2 = 1;
    }
    forestValue302_1842_0 = forestValue302_1840_0;
    forestValue302_1842_1 = forestValue302_1840_1;
    forestValue302_1842_2 = forestValue302_1840_2;
    break forest_join_1842;
    }
    forestValue302_1842_0 = forestValue302_1841_0;
    forestValue302_1842_1 = forestValue302_1841_1;
    forestValue302_1842_2 = 0;
    }
    (forestValue302_1842_0)[forestValue302_1842_1] = __integerCategory302_350(forestValue302_1842_2);
    spill302_177 = life12_7;
    spill302_178 = 2;
    spill302_179 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_1865_0 = spill302_177;
        forestValue302_1865_1 = spill302_178;
        forestValue302_1865_2 = __integerCategory302_351(spill302_179);
        break forest_join_1865;
    }
    if (!((!spill302_179))) {
        forestValue302_1864_0 = spill302_177;
        forestValue302_1864_1 = spill302_178;
        break forest_join_1864;
    }
    spill302_180 = __call302_354(p0, p1, p2, __call302_353(__call302_352(life14_1963)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_1865_0 = spill302_177;
        forestValue302_1865_1 = spill302_178;
        forestValue302_1865_2 = __integerCategory302_355(spill302_180);
        break forest_join_1865;
    }
    if (!(spill302_180)) {
        forestValue302_1866_0 = spill302_177;
        forestValue302_1866_1 = spill302_178;
        break forest_join_1866;
    }
    forestValue302_1864_0 = spill302_177;
    forestValue302_1864_1 = spill302_178;
    }
    forestValue302_1865_0 = forestValue302_1864_0;
    forestValue302_1865_1 = forestValue302_1864_1;
    forestValue302_1865_2 = 1;
    }
    forestValue302_1867_0 = forestValue302_1865_0;
    forestValue302_1867_1 = forestValue302_1865_1;
    forestValue302_1867_2 = forestValue302_1865_2;
    break forest_join_1867;
    }
    forestValue302_1867_0 = forestValue302_1866_0;
    forestValue302_1867_1 = forestValue302_1866_1;
    forestValue302_1867_2 = 0;
    }
    (forestValue302_1867_0)[forestValue302_1867_1] = __integerCategory302_356(forestValue302_1867_2);
    spill302_181 = life12_7;
    spill302_182 = 3;
    spill302_183 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_1890_0 = spill302_181;
        forestValue302_1890_1 = spill302_182;
        forestValue302_1890_2 = __integerCategory302_357(spill302_183);
        break forest_join_1890;
    }
    if (!((!spill302_183))) {
        forestValue302_1889_0 = spill302_181;
        forestValue302_1889_1 = spill302_182;
        break forest_join_1889;
    }
    spill302_184 = __call302_360(p0, p1, p2, __call302_359(__call302_358(life14_1963)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_1890_0 = spill302_181;
        forestValue302_1890_1 = spill302_182;
        forestValue302_1890_2 = __integerCategory302_361(spill302_184);
        break forest_join_1890;
    }
    if (!(spill302_184)) {
        forestValue302_1891_0 = spill302_181;
        forestValue302_1891_1 = spill302_182;
        break forest_join_1891;
    }
    forestValue302_1889_0 = spill302_181;
    forestValue302_1889_1 = spill302_182;
    }
    forestValue302_1890_0 = forestValue302_1889_0;
    forestValue302_1890_1 = forestValue302_1889_1;
    forestValue302_1890_2 = 1;
    }
    forestValue302_1892_0 = forestValue302_1890_0;
    forestValue302_1892_1 = forestValue302_1890_1;
    forestValue302_1892_2 = forestValue302_1890_2;
    break forest_join_1892;
    }
    forestValue302_1892_0 = forestValue302_1891_0;
    forestValue302_1892_1 = forestValue302_1891_1;
    forestValue302_1892_2 = 0;
    }
    (forestValue302_1892_0)[forestValue302_1892_1] = __integerCategory302_362(forestValue302_1892_2);
    if (!((life11_8 == null))) {
        break forest_join_2663;
    }
    }
    spill302_185 = life12_7;
    spill302_186 = 0;
    spill302_187 = __call302_365(p0, p1, p2, __call302_364(__call302_363(p3)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_1911_0 = spill302_185;
        forestValue302_1911_1 = spill302_186;
        forestValue302_1911_2 = __integerCategory302_366(spill302_187);
        break forest_join_1911;
    }
    if (!((!spill302_187))) {
        forestValue302_1912_0 = spill302_185;
        forestValue302_1912_1 = spill302_186;
        break forest_join_1912;
    }
    forestValue302_1911_0 = spill302_185;
    forestValue302_1911_1 = spill302_186;
    forestValue302_1911_2 = 1;
    }
    forestValue302_1913_0 = forestValue302_1911_0;
    forestValue302_1913_1 = forestValue302_1911_1;
    forestValue302_1913_2 = forestValue302_1911_2;
    break forest_join_1913;
    }
    forestValue302_1913_0 = forestValue302_1912_0;
    forestValue302_1913_1 = forestValue302_1912_1;
    forestValue302_1913_2 = 0;
    }
    (forestValue302_1913_0)[forestValue302_1913_1] = __integerCategory302_367(forestValue302_1913_2);
    spill302_188 = life12_7;
    spill302_189 = 1;
    spill302_190 = __call302_370(p0, p1, p2, __call302_369(__call302_368(p3)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_1930_0 = spill302_188;
        forestValue302_1930_1 = spill302_189;
        forestValue302_1930_2 = __integerCategory302_371(spill302_190);
        break forest_join_1930;
    }
    if (!((!spill302_190))) {
        forestValue302_1931_0 = spill302_188;
        forestValue302_1931_1 = spill302_189;
        break forest_join_1931;
    }
    forestValue302_1930_0 = spill302_188;
    forestValue302_1930_1 = spill302_189;
    forestValue302_1930_2 = 1;
    }
    forestValue302_1932_0 = forestValue302_1930_0;
    forestValue302_1932_1 = forestValue302_1930_1;
    forestValue302_1932_2 = forestValue302_1930_2;
    break forest_join_1932;
    }
    forestValue302_1932_0 = forestValue302_1931_0;
    forestValue302_1932_1 = forestValue302_1931_1;
    forestValue302_1932_2 = 0;
    }
    (forestValue302_1932_0)[forestValue302_1932_1] = __integerCategory302_372(forestValue302_1932_2);
    spill302_191 = life12_7;
    spill302_192 = 2;
    spill302_193 = __call302_375(p0, p1, p2, __call302_374(__call302_373(p3)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_1949_0 = spill302_191;
        forestValue302_1949_1 = spill302_192;
        forestValue302_1949_2 = __integerCategory302_376(spill302_193);
        break forest_join_1949;
    }
    if (!((!spill302_193))) {
        forestValue302_1950_0 = spill302_191;
        forestValue302_1950_1 = spill302_192;
        break forest_join_1950;
    }
    forestValue302_1949_0 = spill302_191;
    forestValue302_1949_1 = spill302_192;
    forestValue302_1949_2 = 1;
    }
    forestValue302_1951_0 = forestValue302_1949_0;
    forestValue302_1951_1 = forestValue302_1949_1;
    forestValue302_1951_2 = forestValue302_1949_2;
    break forest_join_1951;
    }
    forestValue302_1951_0 = forestValue302_1950_0;
    forestValue302_1951_1 = forestValue302_1950_1;
    forestValue302_1951_2 = 0;
    }
    (forestValue302_1951_0)[forestValue302_1951_1] = __integerCategory302_377(forestValue302_1951_2);
    spill302_194 = life12_7;
    spill302_195 = 3;
    spill302_196 = __call302_380(p0, p1, p2, __call302_379(__call302_378(p3)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_1968_0 = spill302_194;
        forestValue302_1968_1 = spill302_195;
        forestValue302_1968_2 = __integerCategory302_381(spill302_196);
        break forest_join_1968;
    }
    if (!((!spill302_196))) {
        forestValue302_1969_0 = spill302_194;
        forestValue302_1969_1 = spill302_195;
        break forest_join_1969;
    }
    forestValue302_1968_0 = spill302_194;
    forestValue302_1968_1 = spill302_195;
    forestValue302_1968_2 = 1;
    }
    forestValue302_1970_0 = forestValue302_1968_0;
    forestValue302_1970_1 = forestValue302_1968_1;
    forestValue302_1970_2 = forestValue302_1968_2;
    break forest_join_1970;
    }
    forestValue302_1970_0 = forestValue302_1969_0;
    forestValue302_1970_1 = forestValue302_1969_1;
    forestValue302_1970_2 = 0;
    }
    (forestValue302_1970_0)[forestValue302_1970_1] = __integerCategory302_382(forestValue302_1970_2);
    spill302_197 = __fieldRead302_383(p0);
    if (!((life11_8 != null))) {
        forestValue302_2080_0 = __integerCategory302_384(spill302_197);
        break forest_join_2080;
    }
    if (!(spill302_197)) {
        break forest_join_2079;
    }
    life14_2167 = __call302_385(p3);
    spill302_198 = life12_7;
    spill302_199 = 0;
    spill302_200 = (life12_7)[0];
    if (!((life11_8 != null))) {
        forestValue302_2001_0 = spill302_198;
        forestValue302_2001_1 = spill302_199;
        forestValue302_2001_2 = __integerCategory302_386(spill302_200);
        break forest_join_2001;
    }
    if (!((!spill302_200))) {
        forestValue302_2000_0 = spill302_198;
        forestValue302_2000_1 = spill302_199;
        break forest_join_2000;
    }
    spill302_201 = __call302_389(p0, p1, p2, __call302_388(__call302_387(life14_2167)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_2001_0 = spill302_198;
        forestValue302_2001_1 = spill302_199;
        forestValue302_2001_2 = __integerCategory302_390(spill302_201);
        break forest_join_2001;
    }
    if (!(spill302_201)) {
        forestValue302_2002_0 = spill302_198;
        forestValue302_2002_1 = spill302_199;
        break forest_join_2002;
    }
    forestValue302_2000_0 = spill302_198;
    forestValue302_2000_1 = spill302_199;
    }
    forestValue302_2001_0 = forestValue302_2000_0;
    forestValue302_2001_1 = forestValue302_2000_1;
    forestValue302_2001_2 = 1;
    }
    forestValue302_2003_0 = forestValue302_2001_0;
    forestValue302_2003_1 = forestValue302_2001_1;
    forestValue302_2003_2 = forestValue302_2001_2;
    break forest_join_2003;
    }
    forestValue302_2003_0 = forestValue302_2002_0;
    forestValue302_2003_1 = forestValue302_2002_1;
    forestValue302_2003_2 = 0;
    }
    (forestValue302_2003_0)[forestValue302_2003_1] = __integerCategory302_391(forestValue302_2003_2);
    spill302_202 = life12_7;
    spill302_203 = 1;
    spill302_204 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_2026_0 = spill302_202;
        forestValue302_2026_1 = spill302_203;
        forestValue302_2026_2 = __integerCategory302_392(spill302_204);
        break forest_join_2026;
    }
    if (!((!spill302_204))) {
        forestValue302_2025_0 = spill302_202;
        forestValue302_2025_1 = spill302_203;
        break forest_join_2025;
    }
    spill302_205 = __call302_395(p0, p1, p2, __call302_394(__call302_393(life14_2167)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_2026_0 = spill302_202;
        forestValue302_2026_1 = spill302_203;
        forestValue302_2026_2 = __integerCategory302_396(spill302_205);
        break forest_join_2026;
    }
    if (!(spill302_205)) {
        forestValue302_2027_0 = spill302_202;
        forestValue302_2027_1 = spill302_203;
        break forest_join_2027;
    }
    forestValue302_2025_0 = spill302_202;
    forestValue302_2025_1 = spill302_203;
    }
    forestValue302_2026_0 = forestValue302_2025_0;
    forestValue302_2026_1 = forestValue302_2025_1;
    forestValue302_2026_2 = 1;
    }
    forestValue302_2028_0 = forestValue302_2026_0;
    forestValue302_2028_1 = forestValue302_2026_1;
    forestValue302_2028_2 = forestValue302_2026_2;
    break forest_join_2028;
    }
    forestValue302_2028_0 = forestValue302_2027_0;
    forestValue302_2028_1 = forestValue302_2027_1;
    forestValue302_2028_2 = 0;
    }
    (forestValue302_2028_0)[forestValue302_2028_1] = __integerCategory302_397(forestValue302_2028_2);
    spill302_206 = life12_7;
    spill302_207 = 2;
    spill302_208 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_2051_0 = spill302_206;
        forestValue302_2051_1 = spill302_207;
        forestValue302_2051_2 = __integerCategory302_398(spill302_208);
        break forest_join_2051;
    }
    if (!((!spill302_208))) {
        forestValue302_2050_0 = spill302_206;
        forestValue302_2050_1 = spill302_207;
        break forest_join_2050;
    }
    spill302_209 = __call302_401(p0, p1, p2, __call302_400(__call302_399(life14_2167)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_2051_0 = spill302_206;
        forestValue302_2051_1 = spill302_207;
        forestValue302_2051_2 = __integerCategory302_402(spill302_209);
        break forest_join_2051;
    }
    if (!(spill302_209)) {
        forestValue302_2052_0 = spill302_206;
        forestValue302_2052_1 = spill302_207;
        break forest_join_2052;
    }
    forestValue302_2050_0 = spill302_206;
    forestValue302_2050_1 = spill302_207;
    }
    forestValue302_2051_0 = forestValue302_2050_0;
    forestValue302_2051_1 = forestValue302_2050_1;
    forestValue302_2051_2 = 1;
    }
    forestValue302_2053_0 = forestValue302_2051_0;
    forestValue302_2053_1 = forestValue302_2051_1;
    forestValue302_2053_2 = forestValue302_2051_2;
    break forest_join_2053;
    }
    forestValue302_2053_0 = forestValue302_2052_0;
    forestValue302_2053_1 = forestValue302_2052_1;
    forestValue302_2053_2 = 0;
    }
    (forestValue302_2053_0)[forestValue302_2053_1] = __integerCategory302_403(forestValue302_2053_2);
    spill302_210 = life12_7;
    spill302_211 = 3;
    spill302_212 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_2076_0 = spill302_210;
        forestValue302_2076_1 = spill302_211;
        forestValue302_2076_2 = __integerCategory302_404(spill302_212);
        break forest_join_2076;
    }
    if (!((!spill302_212))) {
        forestValue302_2075_0 = spill302_210;
        forestValue302_2075_1 = spill302_211;
        break forest_join_2075;
    }
    spill302_213 = __call302_407(p0, p1, p2, __call302_406(__call302_405(life14_2167)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_2076_0 = spill302_210;
        forestValue302_2076_1 = spill302_211;
        forestValue302_2076_2 = __integerCategory302_408(spill302_213);
        break forest_join_2076;
    }
    if (!(spill302_213)) {
        forestValue302_2077_0 = spill302_210;
        forestValue302_2077_1 = spill302_211;
        break forest_join_2077;
    }
    forestValue302_2075_0 = spill302_210;
    forestValue302_2075_1 = spill302_211;
    }
    forestValue302_2076_0 = forestValue302_2075_0;
    forestValue302_2076_1 = forestValue302_2075_1;
    forestValue302_2076_2 = 1;
    }
    forestValue302_2078_0 = forestValue302_2076_0;
    forestValue302_2078_1 = forestValue302_2076_1;
    forestValue302_2078_2 = forestValue302_2076_2;
    break forest_join_2078;
    }
    forestValue302_2078_0 = forestValue302_2077_0;
    forestValue302_2078_1 = forestValue302_2077_1;
    forestValue302_2078_2 = 0;
    }
    (forestValue302_2078_0)[forestValue302_2078_1] = __integerCategory302_409(forestValue302_2078_2);
    }
    forestValue302_2080_0 = p4;
    }
    spill302_214 = 1;
    if (!((life11_8 != null))) {
        forestValue302_2669_0 = forestValue302_2080_0;
        forestValue302_2669_1 = spill302_214;
        break forest_join_2669;
    }
    if (!((forestValue302_2080_0 == spill302_214))) {
        break forest_join_2663;
    }
    __call302_410(0, 3, life12_7);
    __call302_411(1, 2, life12_7);
    if (!((life11_8 == null))) {
        break forest_join_2663;
    }
    }
    spill302_215 = life12_7;
    spill302_216 = 0;
    spill302_217 = __call302_414(p0, p1, p2, __call302_413(__call302_412(p3)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_2110_0 = spill302_215;
        forestValue302_2110_1 = spill302_216;
        forestValue302_2110_2 = __integerCategory302_415(spill302_217);
        break forest_join_2110;
    }
    if (!((!spill302_217))) {
        forestValue302_2111_0 = spill302_215;
        forestValue302_2111_1 = spill302_216;
        break forest_join_2111;
    }
    forestValue302_2110_0 = spill302_215;
    forestValue302_2110_1 = spill302_216;
    forestValue302_2110_2 = 1;
    }
    forestValue302_2112_0 = forestValue302_2110_0;
    forestValue302_2112_1 = forestValue302_2110_1;
    forestValue302_2112_2 = forestValue302_2110_2;
    break forest_join_2112;
    }
    forestValue302_2112_0 = forestValue302_2111_0;
    forestValue302_2112_1 = forestValue302_2111_1;
    forestValue302_2112_2 = 0;
    }
    (forestValue302_2112_0)[forestValue302_2112_1] = __integerCategory302_416(forestValue302_2112_2);
    spill302_218 = life12_7;
    spill302_219 = 1;
    spill302_220 = __call302_419(p0, p1, p2, __call302_418(__call302_417(p3)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_2129_0 = spill302_218;
        forestValue302_2129_1 = spill302_219;
        forestValue302_2129_2 = __integerCategory302_420(spill302_220);
        break forest_join_2129;
    }
    if (!((!spill302_220))) {
        forestValue302_2130_0 = spill302_218;
        forestValue302_2130_1 = spill302_219;
        break forest_join_2130;
    }
    forestValue302_2129_0 = spill302_218;
    forestValue302_2129_1 = spill302_219;
    forestValue302_2129_2 = 1;
    }
    forestValue302_2131_0 = forestValue302_2129_0;
    forestValue302_2131_1 = forestValue302_2129_1;
    forestValue302_2131_2 = forestValue302_2129_2;
    break forest_join_2131;
    }
    forestValue302_2131_0 = forestValue302_2130_0;
    forestValue302_2131_1 = forestValue302_2130_1;
    forestValue302_2131_2 = 0;
    }
    (forestValue302_2131_0)[forestValue302_2131_1] = __integerCategory302_421(forestValue302_2131_2);
    spill302_221 = life12_7;
    spill302_222 = 2;
    spill302_223 = __call302_424(p0, p1, p2, __call302_423(__call302_422(p3)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_2148_0 = spill302_221;
        forestValue302_2148_1 = spill302_222;
        forestValue302_2148_2 = __integerCategory302_425(spill302_223);
        break forest_join_2148;
    }
    if (!((!spill302_223))) {
        forestValue302_2149_0 = spill302_221;
        forestValue302_2149_1 = spill302_222;
        break forest_join_2149;
    }
    forestValue302_2148_0 = spill302_221;
    forestValue302_2148_1 = spill302_222;
    forestValue302_2148_2 = 1;
    }
    forestValue302_2150_0 = forestValue302_2148_0;
    forestValue302_2150_1 = forestValue302_2148_1;
    forestValue302_2150_2 = forestValue302_2148_2;
    break forest_join_2150;
    }
    forestValue302_2150_0 = forestValue302_2149_0;
    forestValue302_2150_1 = forestValue302_2149_1;
    forestValue302_2150_2 = 0;
    }
    (forestValue302_2150_0)[forestValue302_2150_1] = __integerCategory302_426(forestValue302_2150_2);
    spill302_224 = life12_7;
    spill302_225 = 3;
    spill302_226 = __call302_429(p0, p1, p2, __call302_428(__call302_427(p3)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_2167_0 = spill302_224;
        forestValue302_2167_1 = spill302_225;
        forestValue302_2167_2 = __integerCategory302_430(spill302_226);
        break forest_join_2167;
    }
    if (!((!spill302_226))) {
        forestValue302_2168_0 = spill302_224;
        forestValue302_2168_1 = spill302_225;
        break forest_join_2168;
    }
    forestValue302_2167_0 = spill302_224;
    forestValue302_2167_1 = spill302_225;
    forestValue302_2167_2 = 1;
    }
    forestValue302_2169_0 = forestValue302_2167_0;
    forestValue302_2169_1 = forestValue302_2167_1;
    forestValue302_2169_2 = forestValue302_2167_2;
    break forest_join_2169;
    }
    forestValue302_2169_0 = forestValue302_2168_0;
    forestValue302_2169_1 = forestValue302_2168_1;
    forestValue302_2169_2 = 0;
    }
    (forestValue302_2169_0)[forestValue302_2169_1] = __integerCategory302_431(forestValue302_2169_2);
    spill302_227 = __fieldRead302_432(p0);
    if (!((life11_8 != null))) {
        forestValue302_2664_0 = __integerCategory302_433(spill302_227);
        break forest_join_2664;
    }
    if (!(spill302_227)) {
        break forest_join_2663;
    }
    life14_2386 = __call302_434(p3);
    spill302_228 = life12_7;
    spill302_229 = 0;
    spill302_230 = (life12_7)[0];
    if (!((life11_8 != null))) {
        forestValue302_2200_0 = spill302_228;
        forestValue302_2200_1 = spill302_229;
        forestValue302_2200_2 = __integerCategory302_435(spill302_230);
        break forest_join_2200;
    }
    if (!((!spill302_230))) {
        forestValue302_2199_0 = spill302_228;
        forestValue302_2199_1 = spill302_229;
        break forest_join_2199;
    }
    spill302_231 = __call302_438(p0, p1, p2, __call302_437(__call302_436(life14_2386)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_2200_0 = spill302_228;
        forestValue302_2200_1 = spill302_229;
        forestValue302_2200_2 = __integerCategory302_439(spill302_231);
        break forest_join_2200;
    }
    if (!(spill302_231)) {
        forestValue302_2201_0 = spill302_228;
        forestValue302_2201_1 = spill302_229;
        break forest_join_2201;
    }
    forestValue302_2199_0 = spill302_228;
    forestValue302_2199_1 = spill302_229;
    }
    forestValue302_2200_0 = forestValue302_2199_0;
    forestValue302_2200_1 = forestValue302_2199_1;
    forestValue302_2200_2 = 1;
    }
    forestValue302_2202_0 = forestValue302_2200_0;
    forestValue302_2202_1 = forestValue302_2200_1;
    forestValue302_2202_2 = forestValue302_2200_2;
    break forest_join_2202;
    }
    forestValue302_2202_0 = forestValue302_2201_0;
    forestValue302_2202_1 = forestValue302_2201_1;
    forestValue302_2202_2 = 0;
    }
    (forestValue302_2202_0)[forestValue302_2202_1] = __integerCategory302_440(forestValue302_2202_2);
    spill302_232 = life12_7;
    spill302_233 = 1;
    spill302_234 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_2225_0 = spill302_232;
        forestValue302_2225_1 = spill302_233;
        forestValue302_2225_2 = __integerCategory302_441(spill302_234);
        break forest_join_2225;
    }
    if (!((!spill302_234))) {
        forestValue302_2224_0 = spill302_232;
        forestValue302_2224_1 = spill302_233;
        break forest_join_2224;
    }
    spill302_235 = __call302_444(p0, p1, p2, __call302_443(__call302_442(life14_2386)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_2225_0 = spill302_232;
        forestValue302_2225_1 = spill302_233;
        forestValue302_2225_2 = __integerCategory302_445(spill302_235);
        break forest_join_2225;
    }
    if (!(spill302_235)) {
        forestValue302_2226_0 = spill302_232;
        forestValue302_2226_1 = spill302_233;
        break forest_join_2226;
    }
    forestValue302_2224_0 = spill302_232;
    forestValue302_2224_1 = spill302_233;
    }
    forestValue302_2225_0 = forestValue302_2224_0;
    forestValue302_2225_1 = forestValue302_2224_1;
    forestValue302_2225_2 = 1;
    }
    forestValue302_2227_0 = forestValue302_2225_0;
    forestValue302_2227_1 = forestValue302_2225_1;
    forestValue302_2227_2 = forestValue302_2225_2;
    break forest_join_2227;
    }
    forestValue302_2227_0 = forestValue302_2226_0;
    forestValue302_2227_1 = forestValue302_2226_1;
    forestValue302_2227_2 = 0;
    }
    (forestValue302_2227_0)[forestValue302_2227_1] = __integerCategory302_446(forestValue302_2227_2);
    spill302_236 = life12_7;
    spill302_237 = 2;
    spill302_238 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_2250_0 = spill302_236;
        forestValue302_2250_1 = spill302_237;
        forestValue302_2250_2 = __integerCategory302_447(spill302_238);
        break forest_join_2250;
    }
    if (!((!spill302_238))) {
        forestValue302_2249_0 = spill302_236;
        forestValue302_2249_1 = spill302_237;
        break forest_join_2249;
    }
    spill302_239 = __call302_450(p0, p1, p2, __call302_449(__call302_448(life14_2386)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_2250_0 = spill302_236;
        forestValue302_2250_1 = spill302_237;
        forestValue302_2250_2 = __integerCategory302_451(spill302_239);
        break forest_join_2250;
    }
    if (!(spill302_239)) {
        forestValue302_2251_0 = spill302_236;
        forestValue302_2251_1 = spill302_237;
        break forest_join_2251;
    }
    forestValue302_2249_0 = spill302_236;
    forestValue302_2249_1 = spill302_237;
    }
    forestValue302_2250_0 = forestValue302_2249_0;
    forestValue302_2250_1 = forestValue302_2249_1;
    forestValue302_2250_2 = 1;
    }
    forestValue302_2252_0 = forestValue302_2250_0;
    forestValue302_2252_1 = forestValue302_2250_1;
    forestValue302_2252_2 = forestValue302_2250_2;
    break forest_join_2252;
    }
    forestValue302_2252_0 = forestValue302_2251_0;
    forestValue302_2252_1 = forestValue302_2251_1;
    forestValue302_2252_2 = 0;
    }
    (forestValue302_2252_0)[forestValue302_2252_1] = __integerCategory302_452(forestValue302_2252_2);
    spill302_240 = life12_7;
    spill302_241 = 3;
    spill302_242 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_2275_0 = spill302_240;
        forestValue302_2275_1 = spill302_241;
        forestValue302_2275_2 = __integerCategory302_453(spill302_242);
        break forest_join_2275;
    }
    if (!((!spill302_242))) {
        forestValue302_2274_0 = spill302_240;
        forestValue302_2274_1 = spill302_241;
        break forest_join_2274;
    }
    spill302_243 = __call302_456(p0, p1, p2, __call302_455(__call302_454(life14_2386)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_2275_0 = spill302_240;
        forestValue302_2275_1 = spill302_241;
        forestValue302_2275_2 = __integerCategory302_457(spill302_243);
        break forest_join_2275;
    }
    if (!(spill302_243)) {
        forestValue302_2276_0 = spill302_240;
        forestValue302_2276_1 = spill302_241;
        break forest_join_2276;
    }
    forestValue302_2274_0 = spill302_240;
    forestValue302_2274_1 = spill302_241;
    }
    forestValue302_2275_0 = forestValue302_2274_0;
    forestValue302_2275_1 = forestValue302_2274_1;
    forestValue302_2275_2 = 1;
    }
    forestValue302_2277_0 = forestValue302_2275_0;
    forestValue302_2277_1 = forestValue302_2275_1;
    forestValue302_2277_2 = forestValue302_2275_2;
    break forest_join_2277;
    }
    forestValue302_2277_0 = forestValue302_2276_0;
    forestValue302_2277_1 = forestValue302_2276_1;
    forestValue302_2277_2 = 0;
    }
    (forestValue302_2277_0)[forestValue302_2277_1] = __integerCategory302_458(forestValue302_2277_2);
    if (!((life11_8 == null))) {
        break forest_join_2663;
    }
    }
    spill302_244 = life12_7;
    spill302_245 = 0;
    spill302_246 = __call302_461(p0, p1, p2, __call302_460(__call302_459(p3)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_2296_0 = spill302_244;
        forestValue302_2296_1 = spill302_245;
        forestValue302_2296_2 = __integerCategory302_462(spill302_246);
        break forest_join_2296;
    }
    if (!((!spill302_246))) {
        forestValue302_2297_0 = spill302_244;
        forestValue302_2297_1 = spill302_245;
        break forest_join_2297;
    }
    forestValue302_2296_0 = spill302_244;
    forestValue302_2296_1 = spill302_245;
    forestValue302_2296_2 = 1;
    }
    forestValue302_2298_0 = forestValue302_2296_0;
    forestValue302_2298_1 = forestValue302_2296_1;
    forestValue302_2298_2 = forestValue302_2296_2;
    break forest_join_2298;
    }
    forestValue302_2298_0 = forestValue302_2297_0;
    forestValue302_2298_1 = forestValue302_2297_1;
    forestValue302_2298_2 = 0;
    }
    (forestValue302_2298_0)[forestValue302_2298_1] = __integerCategory302_463(forestValue302_2298_2);
    spill302_247 = life12_7;
    spill302_248 = 1;
    spill302_249 = __call302_466(p0, p1, p2, __call302_465(__call302_464(p3)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_2315_0 = spill302_247;
        forestValue302_2315_1 = spill302_248;
        forestValue302_2315_2 = __integerCategory302_467(spill302_249);
        break forest_join_2315;
    }
    if (!((!spill302_249))) {
        forestValue302_2316_0 = spill302_247;
        forestValue302_2316_1 = spill302_248;
        break forest_join_2316;
    }
    forestValue302_2315_0 = spill302_247;
    forestValue302_2315_1 = spill302_248;
    forestValue302_2315_2 = 1;
    }
    forestValue302_2317_0 = forestValue302_2315_0;
    forestValue302_2317_1 = forestValue302_2315_1;
    forestValue302_2317_2 = forestValue302_2315_2;
    break forest_join_2317;
    }
    forestValue302_2317_0 = forestValue302_2316_0;
    forestValue302_2317_1 = forestValue302_2316_1;
    forestValue302_2317_2 = 0;
    }
    (forestValue302_2317_0)[forestValue302_2317_1] = __integerCategory302_468(forestValue302_2317_2);
    spill302_250 = life12_7;
    spill302_251 = 2;
    spill302_252 = __call302_471(p0, p1, p2, __call302_470(__call302_469(p3)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_2334_0 = spill302_250;
        forestValue302_2334_1 = spill302_251;
        forestValue302_2334_2 = __integerCategory302_472(spill302_252);
        break forest_join_2334;
    }
    if (!((!spill302_252))) {
        forestValue302_2335_0 = spill302_250;
        forestValue302_2335_1 = spill302_251;
        break forest_join_2335;
    }
    forestValue302_2334_0 = spill302_250;
    forestValue302_2334_1 = spill302_251;
    forestValue302_2334_2 = 1;
    }
    forestValue302_2336_0 = forestValue302_2334_0;
    forestValue302_2336_1 = forestValue302_2334_1;
    forestValue302_2336_2 = forestValue302_2334_2;
    break forest_join_2336;
    }
    forestValue302_2336_0 = forestValue302_2335_0;
    forestValue302_2336_1 = forestValue302_2335_1;
    forestValue302_2336_2 = 0;
    }
    (forestValue302_2336_0)[forestValue302_2336_1] = __integerCategory302_473(forestValue302_2336_2);
    spill302_253 = life12_7;
    spill302_254 = 3;
    spill302_255 = __call302_476(p0, p1, p2, __call302_475(__call302_474(p3)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_2353_0 = spill302_253;
        forestValue302_2353_1 = spill302_254;
        forestValue302_2353_2 = __integerCategory302_477(spill302_255);
        break forest_join_2353;
    }
    if (!((!spill302_255))) {
        forestValue302_2354_0 = spill302_253;
        forestValue302_2354_1 = spill302_254;
        break forest_join_2354;
    }
    forestValue302_2353_0 = spill302_253;
    forestValue302_2353_1 = spill302_254;
    forestValue302_2353_2 = 1;
    }
    forestValue302_2355_0 = forestValue302_2353_0;
    forestValue302_2355_1 = forestValue302_2353_1;
    forestValue302_2355_2 = forestValue302_2353_2;
    break forest_join_2355;
    }
    forestValue302_2355_0 = forestValue302_2354_0;
    forestValue302_2355_1 = forestValue302_2354_1;
    forestValue302_2355_2 = 0;
    }
    (forestValue302_2355_0)[forestValue302_2355_1] = __integerCategory302_478(forestValue302_2355_2);
    spill302_256 = __fieldRead302_479(p0);
    if (!((life11_8 != null))) {
        forestValue302_2664_0 = __integerCategory302_480(spill302_256);
        break forest_join_2664;
    }
    if (!(spill302_256)) {
        break forest_join_2663;
    }
    life14_2590 = __call302_481(p3);
    spill302_257 = life12_7;
    spill302_258 = 0;
    spill302_259 = (life12_7)[0];
    if (!((life11_8 != null))) {
        forestValue302_2386_0 = spill302_257;
        forestValue302_2386_1 = spill302_258;
        forestValue302_2386_2 = __integerCategory302_482(spill302_259);
        break forest_join_2386;
    }
    if (!((!spill302_259))) {
        forestValue302_2385_0 = spill302_257;
        forestValue302_2385_1 = spill302_258;
        break forest_join_2385;
    }
    spill302_260 = __call302_485(p0, p1, p2, __call302_484(__call302_483(life14_2590)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_2386_0 = spill302_257;
        forestValue302_2386_1 = spill302_258;
        forestValue302_2386_2 = __integerCategory302_486(spill302_260);
        break forest_join_2386;
    }
    if (!(spill302_260)) {
        forestValue302_2387_0 = spill302_257;
        forestValue302_2387_1 = spill302_258;
        break forest_join_2387;
    }
    forestValue302_2385_0 = spill302_257;
    forestValue302_2385_1 = spill302_258;
    }
    forestValue302_2386_0 = forestValue302_2385_0;
    forestValue302_2386_1 = forestValue302_2385_1;
    forestValue302_2386_2 = 1;
    }
    forestValue302_2388_0 = forestValue302_2386_0;
    forestValue302_2388_1 = forestValue302_2386_1;
    forestValue302_2388_2 = forestValue302_2386_2;
    break forest_join_2388;
    }
    forestValue302_2388_0 = forestValue302_2387_0;
    forestValue302_2388_1 = forestValue302_2387_1;
    forestValue302_2388_2 = 0;
    }
    (forestValue302_2388_0)[forestValue302_2388_1] = __integerCategory302_487(forestValue302_2388_2);
    spill302_261 = life12_7;
    spill302_262 = 1;
    spill302_263 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_2411_0 = spill302_261;
        forestValue302_2411_1 = spill302_262;
        forestValue302_2411_2 = __integerCategory302_488(spill302_263);
        break forest_join_2411;
    }
    if (!((!spill302_263))) {
        forestValue302_2410_0 = spill302_261;
        forestValue302_2410_1 = spill302_262;
        break forest_join_2410;
    }
    spill302_264 = __call302_491(p0, p1, p2, __call302_490(__call302_489(life14_2590)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_2411_0 = spill302_261;
        forestValue302_2411_1 = spill302_262;
        forestValue302_2411_2 = __integerCategory302_492(spill302_264);
        break forest_join_2411;
    }
    if (!(spill302_264)) {
        forestValue302_2412_0 = spill302_261;
        forestValue302_2412_1 = spill302_262;
        break forest_join_2412;
    }
    forestValue302_2410_0 = spill302_261;
    forestValue302_2410_1 = spill302_262;
    }
    forestValue302_2411_0 = forestValue302_2410_0;
    forestValue302_2411_1 = forestValue302_2410_1;
    forestValue302_2411_2 = 1;
    }
    forestValue302_2413_0 = forestValue302_2411_0;
    forestValue302_2413_1 = forestValue302_2411_1;
    forestValue302_2413_2 = forestValue302_2411_2;
    break forest_join_2413;
    }
    forestValue302_2413_0 = forestValue302_2412_0;
    forestValue302_2413_1 = forestValue302_2412_1;
    forestValue302_2413_2 = 0;
    }
    (forestValue302_2413_0)[forestValue302_2413_1] = __integerCategory302_493(forestValue302_2413_2);
    spill302_265 = life12_7;
    spill302_266 = 2;
    spill302_267 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_2436_0 = spill302_265;
        forestValue302_2436_1 = spill302_266;
        forestValue302_2436_2 = __integerCategory302_494(spill302_267);
        break forest_join_2436;
    }
    if (!((!spill302_267))) {
        forestValue302_2435_0 = spill302_265;
        forestValue302_2435_1 = spill302_266;
        break forest_join_2435;
    }
    spill302_268 = __call302_497(p0, p1, p2, __call302_496(__call302_495(life14_2590)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_2436_0 = spill302_265;
        forestValue302_2436_1 = spill302_266;
        forestValue302_2436_2 = __integerCategory302_498(spill302_268);
        break forest_join_2436;
    }
    if (!(spill302_268)) {
        forestValue302_2437_0 = spill302_265;
        forestValue302_2437_1 = spill302_266;
        break forest_join_2437;
    }
    forestValue302_2435_0 = spill302_265;
    forestValue302_2435_1 = spill302_266;
    }
    forestValue302_2436_0 = forestValue302_2435_0;
    forestValue302_2436_1 = forestValue302_2435_1;
    forestValue302_2436_2 = 1;
    }
    forestValue302_2438_0 = forestValue302_2436_0;
    forestValue302_2438_1 = forestValue302_2436_1;
    forestValue302_2438_2 = forestValue302_2436_2;
    break forest_join_2438;
    }
    forestValue302_2438_0 = forestValue302_2437_0;
    forestValue302_2438_1 = forestValue302_2437_1;
    forestValue302_2438_2 = 0;
    }
    (forestValue302_2438_0)[forestValue302_2438_1] = __integerCategory302_499(forestValue302_2438_2);
    spill302_269 = life12_7;
    spill302_270 = 3;
    spill302_271 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_2461_0 = spill302_269;
        forestValue302_2461_1 = spill302_270;
        forestValue302_2461_2 = __integerCategory302_500(spill302_271);
        break forest_join_2461;
    }
    if (!((!spill302_271))) {
        forestValue302_2460_0 = spill302_269;
        forestValue302_2460_1 = spill302_270;
        break forest_join_2460;
    }
    spill302_272 = __call302_503(p0, p1, p2, __call302_502(__call302_501(life14_2590)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_2461_0 = spill302_269;
        forestValue302_2461_1 = spill302_270;
        forestValue302_2461_2 = __integerCategory302_504(spill302_272);
        break forest_join_2461;
    }
    if (!(spill302_272)) {
        forestValue302_2462_0 = spill302_269;
        forestValue302_2462_1 = spill302_270;
        break forest_join_2462;
    }
    forestValue302_2460_0 = spill302_269;
    forestValue302_2460_1 = spill302_270;
    }
    forestValue302_2461_0 = forestValue302_2460_0;
    forestValue302_2461_1 = forestValue302_2460_1;
    forestValue302_2461_2 = 1;
    }
    forestValue302_2463_0 = forestValue302_2461_0;
    forestValue302_2463_1 = forestValue302_2461_1;
    forestValue302_2463_2 = forestValue302_2461_2;
    break forest_join_2463;
    }
    forestValue302_2463_0 = forestValue302_2462_0;
    forestValue302_2463_1 = forestValue302_2462_1;
    forestValue302_2463_2 = 0;
    }
    (forestValue302_2463_0)[forestValue302_2463_1] = __integerCategory302_505(forestValue302_2463_2);
    if (!((life11_8 == null))) {
        break forest_join_2663;
    }
    }
    spill302_273 = life12_7;
    spill302_274 = 0;
    spill302_275 = __call302_508(p0, p1, p2, __call302_507(__call302_506(p3)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_2482_0 = spill302_273;
        forestValue302_2482_1 = spill302_274;
        forestValue302_2482_2 = __integerCategory302_509(spill302_275);
        break forest_join_2482;
    }
    if (!((!spill302_275))) {
        forestValue302_2483_0 = spill302_273;
        forestValue302_2483_1 = spill302_274;
        break forest_join_2483;
    }
    forestValue302_2482_0 = spill302_273;
    forestValue302_2482_1 = spill302_274;
    forestValue302_2482_2 = 1;
    }
    forestValue302_2484_0 = forestValue302_2482_0;
    forestValue302_2484_1 = forestValue302_2482_1;
    forestValue302_2484_2 = forestValue302_2482_2;
    break forest_join_2484;
    }
    forestValue302_2484_0 = forestValue302_2483_0;
    forestValue302_2484_1 = forestValue302_2483_1;
    forestValue302_2484_2 = 0;
    }
    (forestValue302_2484_0)[forestValue302_2484_1] = __integerCategory302_510(forestValue302_2484_2);
    spill302_276 = life12_7;
    spill302_277 = 1;
    spill302_278 = __call302_513(p0, p1, p2, __call302_512(__call302_511(p3)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_2501_0 = spill302_276;
        forestValue302_2501_1 = spill302_277;
        forestValue302_2501_2 = __integerCategory302_514(spill302_278);
        break forest_join_2501;
    }
    if (!((!spill302_278))) {
        forestValue302_2502_0 = spill302_276;
        forestValue302_2502_1 = spill302_277;
        break forest_join_2502;
    }
    forestValue302_2501_0 = spill302_276;
    forestValue302_2501_1 = spill302_277;
    forestValue302_2501_2 = 1;
    }
    forestValue302_2503_0 = forestValue302_2501_0;
    forestValue302_2503_1 = forestValue302_2501_1;
    forestValue302_2503_2 = forestValue302_2501_2;
    break forest_join_2503;
    }
    forestValue302_2503_0 = forestValue302_2502_0;
    forestValue302_2503_1 = forestValue302_2502_1;
    forestValue302_2503_2 = 0;
    }
    (forestValue302_2503_0)[forestValue302_2503_1] = __integerCategory302_515(forestValue302_2503_2);
    spill302_279 = life12_7;
    spill302_280 = 2;
    spill302_281 = __call302_518(p0, p1, p2, __call302_517(__call302_516(p3)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_2520_0 = spill302_279;
        forestValue302_2520_1 = spill302_280;
        forestValue302_2520_2 = __integerCategory302_519(spill302_281);
        break forest_join_2520;
    }
    if (!((!spill302_281))) {
        forestValue302_2521_0 = spill302_279;
        forestValue302_2521_1 = spill302_280;
        break forest_join_2521;
    }
    forestValue302_2520_0 = spill302_279;
    forestValue302_2520_1 = spill302_280;
    forestValue302_2520_2 = 1;
    }
    forestValue302_2522_0 = forestValue302_2520_0;
    forestValue302_2522_1 = forestValue302_2520_1;
    forestValue302_2522_2 = forestValue302_2520_2;
    break forest_join_2522;
    }
    forestValue302_2522_0 = forestValue302_2521_0;
    forestValue302_2522_1 = forestValue302_2521_1;
    forestValue302_2522_2 = 0;
    }
    (forestValue302_2522_0)[forestValue302_2522_1] = __integerCategory302_520(forestValue302_2522_2);
    spill302_282 = life12_7;
    spill302_283 = 3;
    spill302_284 = __call302_523(p0, p1, p2, __call302_522(__call302_521(p3)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_2539_0 = spill302_282;
        forestValue302_2539_1 = spill302_283;
        forestValue302_2539_2 = __integerCategory302_524(spill302_284);
        break forest_join_2539;
    }
    if (!((!spill302_284))) {
        forestValue302_2540_0 = spill302_282;
        forestValue302_2540_1 = spill302_283;
        break forest_join_2540;
    }
    forestValue302_2539_0 = spill302_282;
    forestValue302_2539_1 = spill302_283;
    forestValue302_2539_2 = 1;
    }
    forestValue302_2541_0 = forestValue302_2539_0;
    forestValue302_2541_1 = forestValue302_2539_1;
    forestValue302_2541_2 = forestValue302_2539_2;
    break forest_join_2541;
    }
    forestValue302_2541_0 = forestValue302_2540_0;
    forestValue302_2541_1 = forestValue302_2540_1;
    forestValue302_2541_2 = 0;
    }
    (forestValue302_2541_0)[forestValue302_2541_1] = __integerCategory302_525(forestValue302_2541_2);
    spill302_285 = __fieldRead302_526(p0);
    if (!((life11_8 != null))) {
        forestValue302_2651_0 = __integerCategory302_527(spill302_285);
        break forest_join_2651;
    }
    if (!(spill302_285)) {
        break forest_join_2650;
    }
    life14_2794 = __call302_528(p3);
    spill302_286 = life12_7;
    spill302_287 = 0;
    spill302_288 = (life12_7)[0];
    if (!((life11_8 != null))) {
        forestValue302_2572_0 = spill302_286;
        forestValue302_2572_1 = spill302_287;
        forestValue302_2572_2 = __integerCategory302_529(spill302_288);
        break forest_join_2572;
    }
    if (!((!spill302_288))) {
        forestValue302_2571_0 = spill302_286;
        forestValue302_2571_1 = spill302_287;
        break forest_join_2571;
    }
    spill302_289 = __call302_532(p0, p1, p2, __call302_531(__call302_530(life14_2794)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_2572_0 = spill302_286;
        forestValue302_2572_1 = spill302_287;
        forestValue302_2572_2 = __integerCategory302_533(spill302_289);
        break forest_join_2572;
    }
    if (!(spill302_289)) {
        forestValue302_2573_0 = spill302_286;
        forestValue302_2573_1 = spill302_287;
        break forest_join_2573;
    }
    forestValue302_2571_0 = spill302_286;
    forestValue302_2571_1 = spill302_287;
    }
    forestValue302_2572_0 = forestValue302_2571_0;
    forestValue302_2572_1 = forestValue302_2571_1;
    forestValue302_2572_2 = 1;
    }
    forestValue302_2574_0 = forestValue302_2572_0;
    forestValue302_2574_1 = forestValue302_2572_1;
    forestValue302_2574_2 = forestValue302_2572_2;
    break forest_join_2574;
    }
    forestValue302_2574_0 = forestValue302_2573_0;
    forestValue302_2574_1 = forestValue302_2573_1;
    forestValue302_2574_2 = 0;
    }
    (forestValue302_2574_0)[forestValue302_2574_1] = __integerCategory302_534(forestValue302_2574_2);
    spill302_290 = life12_7;
    spill302_291 = 1;
    spill302_292 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_2597_0 = spill302_290;
        forestValue302_2597_1 = spill302_291;
        forestValue302_2597_2 = __integerCategory302_535(spill302_292);
        break forest_join_2597;
    }
    if (!((!spill302_292))) {
        forestValue302_2596_0 = spill302_290;
        forestValue302_2596_1 = spill302_291;
        break forest_join_2596;
    }
    spill302_293 = __call302_538(p0, p1, p2, __call302_537(__call302_536(life14_2794)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_2597_0 = spill302_290;
        forestValue302_2597_1 = spill302_291;
        forestValue302_2597_2 = __integerCategory302_539(spill302_293);
        break forest_join_2597;
    }
    if (!(spill302_293)) {
        forestValue302_2598_0 = spill302_290;
        forestValue302_2598_1 = spill302_291;
        break forest_join_2598;
    }
    forestValue302_2596_0 = spill302_290;
    forestValue302_2596_1 = spill302_291;
    }
    forestValue302_2597_0 = forestValue302_2596_0;
    forestValue302_2597_1 = forestValue302_2596_1;
    forestValue302_2597_2 = 1;
    }
    forestValue302_2599_0 = forestValue302_2597_0;
    forestValue302_2599_1 = forestValue302_2597_1;
    forestValue302_2599_2 = forestValue302_2597_2;
    break forest_join_2599;
    }
    forestValue302_2599_0 = forestValue302_2598_0;
    forestValue302_2599_1 = forestValue302_2598_1;
    forestValue302_2599_2 = 0;
    }
    (forestValue302_2599_0)[forestValue302_2599_1] = __integerCategory302_540(forestValue302_2599_2);
    spill302_294 = life12_7;
    spill302_295 = 2;
    spill302_296 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_2622_0 = spill302_294;
        forestValue302_2622_1 = spill302_295;
        forestValue302_2622_2 = __integerCategory302_541(spill302_296);
        break forest_join_2622;
    }
    if (!((!spill302_296))) {
        forestValue302_2621_0 = spill302_294;
        forestValue302_2621_1 = spill302_295;
        break forest_join_2621;
    }
    spill302_297 = __call302_544(p0, p1, p2, __call302_543(__call302_542(life14_2794)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_2622_0 = spill302_294;
        forestValue302_2622_1 = spill302_295;
        forestValue302_2622_2 = __integerCategory302_545(spill302_297);
        break forest_join_2622;
    }
    if (!(spill302_297)) {
        forestValue302_2623_0 = spill302_294;
        forestValue302_2623_1 = spill302_295;
        break forest_join_2623;
    }
    forestValue302_2621_0 = spill302_294;
    forestValue302_2621_1 = spill302_295;
    }
    forestValue302_2622_0 = forestValue302_2621_0;
    forestValue302_2622_1 = forestValue302_2621_1;
    forestValue302_2622_2 = 1;
    }
    forestValue302_2624_0 = forestValue302_2622_0;
    forestValue302_2624_1 = forestValue302_2622_1;
    forestValue302_2624_2 = forestValue302_2622_2;
    break forest_join_2624;
    }
    forestValue302_2624_0 = forestValue302_2623_0;
    forestValue302_2624_1 = forestValue302_2623_1;
    forestValue302_2624_2 = 0;
    }
    (forestValue302_2624_0)[forestValue302_2624_1] = __integerCategory302_546(forestValue302_2624_2);
    spill302_298 = life12_7;
    spill302_299 = 3;
    spill302_300 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_2647_0 = spill302_298;
        forestValue302_2647_1 = spill302_299;
        forestValue302_2647_2 = __integerCategory302_547(spill302_300);
        break forest_join_2647;
    }
    if (!((!spill302_300))) {
        forestValue302_2646_0 = spill302_298;
        forestValue302_2646_1 = spill302_299;
        break forest_join_2646;
    }
    spill302_301 = __call302_550(p0, p1, p2, __call302_549(__call302_548(life14_2794)), p5, p6, p7);
    if (!((life11_8 != null))) {
        forestValue302_2647_0 = spill302_298;
        forestValue302_2647_1 = spill302_299;
        forestValue302_2647_2 = __integerCategory302_551(spill302_301);
        break forest_join_2647;
    }
    if (!(spill302_301)) {
        forestValue302_2648_0 = spill302_298;
        forestValue302_2648_1 = spill302_299;
        break forest_join_2648;
    }
    forestValue302_2646_0 = spill302_298;
    forestValue302_2646_1 = spill302_299;
    }
    forestValue302_2647_0 = forestValue302_2646_0;
    forestValue302_2647_1 = forestValue302_2646_1;
    forestValue302_2647_2 = 1;
    }
    forestValue302_2649_0 = forestValue302_2647_0;
    forestValue302_2649_1 = forestValue302_2647_1;
    forestValue302_2649_2 = forestValue302_2647_2;
    break forest_join_2649;
    }
    forestValue302_2649_0 = forestValue302_2648_0;
    forestValue302_2649_1 = forestValue302_2648_1;
    forestValue302_2649_2 = 0;
    }
    (forestValue302_2649_0)[forestValue302_2649_1] = __integerCategory302_552(forestValue302_2649_2);
    }
    forestValue302_2651_0 = p4;
    }
    spill302_302 = 2;
    if (!((life11_8 != null))) {
        forestValue302_2669_0 = forestValue302_2651_0;
        forestValue302_2669_1 = spill302_302;
        break forest_join_2669;
    }
    if (!((forestValue302_2651_0 == spill302_302))) {
        break forest_join_2663;
    }
    __call302_553(0, 3, life12_7);
    __call302_554(1, 2, life12_7);
    }
    forestValue302_2664_0 = life13_1050;
    }
    forestValue302_2669_0 = forestValue302_2664_0;
    forestValue302_2669_1 = __invokedynamic302_555(12886, (7250764318805149737L ^ life9_3));
    }
    if (!((life11_8 != null))) {
        forestValue302_2688_0 = forestValue302_2669_0;
        forestValue302_2688_1 = forestValue302_2669_1;
        break forest_join_2688;
    }
    if (!((forestValue302_2669_0 == forestValue302_2669_1))) {
        break forest_join_2682;
    }
    spill302_303 = (life12_7)[0];
    if (!((life11_8 != null))) {
        forestValue302_2683_0 = __integerCategory302_556(spill302_303);
        break forest_join_2683;
    }
    if (!(spill302_303)) {
        break forest_join_2682;
    }
    life13_1050 = 4;
    if (!((life11_8 == null))) {
        break forest_join_3708;
    }
    }
    forestValue302_2683_0 = life13_1050;
    }
    forestValue302_2688_0 = forestValue302_2683_0;
    forestValue302_2688_1 = __invokedynamic302_557(14714, (6978178734411334450L ^ life9_3));
    }
    if (!((life11_8 != null))) {
        forestValue302_2707_0 = forestValue302_2688_0;
        forestValue302_2707_1 = forestValue302_2688_1;
        break forest_join_2707;
    }
    if (!((forestValue302_2688_0 == forestValue302_2688_1))) {
        break forest_join_2701;
    }
    spill302_304 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_2702_0 = __integerCategory302_558(spill302_304);
        break forest_join_2702;
    }
    if (!(spill302_304)) {
        break forest_join_2701;
    }
    life13_1050 = 5;
    if (!((life11_8 == null))) {
        break forest_join_3708;
    }
    }
    forestValue302_2702_0 = life13_1050;
    }
    forestValue302_2707_0 = forestValue302_2702_0;
    forestValue302_2707_1 = __invokedynamic302_559(32450, (2612358358406857883L ^ life9_3));
    }
    if (!((life11_8 != null))) {
        forestValue302_2730_0 = forestValue302_2707_0;
        forestValue302_2730_1 = forestValue302_2707_1;
        break forest_join_2730;
    }
    if (!((forestValue302_2707_0 == forestValue302_2707_1))) {
        break forest_join_2724;
    }
    spill302_305 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_2725_0 = __integerCategory302_560(spill302_305);
        break forest_join_2725;
    }
    if (!(spill302_305)) {
        break forest_join_2724;
    }
    life13_1050 = __invokedynamic302_561(18126, (7862943088316333196L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_3708;
    }
    }
    forestValue302_2725_0 = life13_1050;
    }
    forestValue302_2730_0 = forestValue302_2725_0;
    forestValue302_2730_1 = __invokedynamic302_562(21712, (4066089003846905488L ^ life9_3));
    }
    if (!((life11_8 != null))) {
        forestValue302_2753_0 = forestValue302_2730_0;
        forestValue302_2753_1 = forestValue302_2730_1;
        break forest_join_2753;
    }
    if (!((forestValue302_2730_0 == forestValue302_2730_1))) {
        break forest_join_2747;
    }
    spill302_306 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_2748_0 = __integerCategory302_563(spill302_306);
        break forest_join_2748;
    }
    if (!(spill302_306)) {
        break forest_join_2747;
    }
    life13_1050 = __invokedynamic302_564(9566, (7715952344173272849L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_3708;
    }
    }
    forestValue302_2748_0 = life13_1050;
    }
    forestValue302_2753_0 = forestValue302_2748_0;
    forestValue302_2753_1 = __invokedynamic302_565(23808, (7821722241826465616L ^ life9_3));
    }
    if (!((life11_8 != null))) {
        forestValue302_2782_0 = forestValue302_2753_0;
        forestValue302_2782_1 = forestValue302_2753_1;
        break forest_join_2782;
    }
    if (!((forestValue302_2753_0 == forestValue302_2753_1))) {
        break forest_join_2776;
    }
    spill302_307 = (life12_7)[0];
    if (!((life11_8 != null))) {
        forestValue302_2777_0 = __integerCategory302_566(spill302_307);
        break forest_join_2777;
    }
    if (!(spill302_307)) {
        break forest_join_2776;
    }
    spill302_308 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_2777_0 = __integerCategory302_567(spill302_308);
        break forest_join_2777;
    }
    if (!(spill302_308)) {
        break forest_join_2776;
    }
    life13_1050 = __invokedynamic302_568(18195, (4571649334609427809L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_3708;
    }
    }
    forestValue302_2777_0 = life13_1050;
    }
    forestValue302_2782_0 = forestValue302_2777_0;
    forestValue302_2782_1 = __invokedynamic302_569(25366, (8356309775788972395L ^ life9_3));
    }
    if (!((life11_8 != null))) {
        forestValue302_2811_0 = forestValue302_2782_0;
        forestValue302_2811_1 = forestValue302_2782_1;
        break forest_join_2811;
    }
    if (!((forestValue302_2782_0 == forestValue302_2782_1))) {
        break forest_join_2805;
    }
    spill302_309 = (life12_7)[0];
    if (!((life11_8 != null))) {
        forestValue302_2806_0 = __integerCategory302_570(spill302_309);
        break forest_join_2806;
    }
    if (!(spill302_309)) {
        break forest_join_2805;
    }
    spill302_310 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_2806_0 = __integerCategory302_571(spill302_310);
        break forest_join_2806;
    }
    if (!(spill302_310)) {
        break forest_join_2805;
    }
    life13_1050 = __invokedynamic302_572(5985, (6161391437577317648L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_3708;
    }
    }
    forestValue302_2806_0 = life13_1050;
    }
    forestValue302_2811_0 = forestValue302_2806_0;
    forestValue302_2811_1 = __invokedynamic302_573(14831, (7171352651990647715L ^ life9_3));
    }
    if (!((life11_8 != null))) {
        forestValue302_2840_0 = forestValue302_2811_0;
        forestValue302_2840_1 = forestValue302_2811_1;
        break forest_join_2840;
    }
    if (!((forestValue302_2811_0 == forestValue302_2811_1))) {
        break forest_join_2834;
    }
    spill302_311 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_2835_0 = __integerCategory302_574(spill302_311);
        break forest_join_2835;
    }
    if (!(spill302_311)) {
        break forest_join_2834;
    }
    spill302_312 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_2835_0 = __integerCategory302_575(spill302_312);
        break forest_join_2835;
    }
    if (!(spill302_312)) {
        break forest_join_2834;
    }
    life13_1050 = __invokedynamic302_576(30234, (8140736655738080333L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_3708;
    }
    }
    forestValue302_2835_0 = life13_1050;
    }
    forestValue302_2840_0 = forestValue302_2835_0;
    forestValue302_2840_1 = __invokedynamic302_577(15677, (1235683529631057756L ^ life9_3));
    }
    if (!((life11_8 != null))) {
        forestValue302_2869_0 = forestValue302_2840_0;
        forestValue302_2869_1 = forestValue302_2840_1;
        break forest_join_2869;
    }
    if (!((forestValue302_2840_0 == forestValue302_2840_1))) {
        break forest_join_2863;
    }
    spill302_313 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_2864_0 = __integerCategory302_578(spill302_313);
        break forest_join_2864;
    }
    if (!(spill302_313)) {
        break forest_join_2863;
    }
    spill302_314 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_2864_0 = __integerCategory302_579(spill302_314);
        break forest_join_2864;
    }
    if (!(spill302_314)) {
        break forest_join_2863;
    }
    life13_1050 = __invokedynamic302_580(11820, (233201238723384405L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_3708;
    }
    }
    forestValue302_2864_0 = life13_1050;
    }
    forestValue302_2869_0 = forestValue302_2864_0;
    forestValue302_2869_1 = __invokedynamic302_581(23808, (7821722241826465616L ^ life9_3));
    }
    if (!((life11_8 != null))) {
        forestValue302_2898_0 = forestValue302_2869_0;
        forestValue302_2898_1 = forestValue302_2869_1;
        break forest_join_2898;
    }
    if (!((forestValue302_2869_0 == forestValue302_2869_1))) {
        break forest_join_2892;
    }
    spill302_315 = (life12_7)[0];
    if (!((life11_8 != null))) {
        forestValue302_2893_0 = __integerCategory302_582(spill302_315);
        break forest_join_2893;
    }
    if (!((!spill302_315))) {
        break forest_join_2892;
    }
    spill302_316 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_2893_0 = __integerCategory302_583(spill302_316);
        break forest_join_2893;
    }
    if (!(spill302_316)) {
        break forest_join_2892;
    }
    life13_1050 = __invokedynamic302_584(26262, (1109949681628421343L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_3708;
    }
    }
    forestValue302_2893_0 = life13_1050;
    }
    forestValue302_2898_0 = forestValue302_2893_0;
    forestValue302_2898_1 = __invokedynamic302_585(25366, (8356309775788972395L ^ life9_3));
    }
    if (!((life11_8 != null))) {
        forestValue302_2927_0 = forestValue302_2898_0;
        forestValue302_2927_1 = forestValue302_2898_1;
        break forest_join_2927;
    }
    if (!((forestValue302_2898_0 == forestValue302_2898_1))) {
        break forest_join_2921;
    }
    spill302_317 = (life12_7)[0];
    if (!((life11_8 != null))) {
        forestValue302_2922_0 = __integerCategory302_586(spill302_317);
        break forest_join_2922;
    }
    if (!(spill302_317)) {
        break forest_join_2921;
    }
    spill302_318 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_2922_0 = __integerCategory302_587(spill302_318);
        break forest_join_2922;
    }
    if (!((!spill302_318))) {
        break forest_join_2921;
    }
    life13_1050 = __invokedynamic302_588(21258, (1852346182786820446L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_3708;
    }
    }
    forestValue302_2922_0 = life13_1050;
    }
    forestValue302_2927_0 = forestValue302_2922_0;
    forestValue302_2927_1 = __invokedynamic302_589(14831, (7171352651990647715L ^ life9_3));
    }
    if (!((life11_8 != null))) {
        forestValue302_2956_0 = forestValue302_2927_0;
        forestValue302_2956_1 = forestValue302_2927_1;
        break forest_join_2956;
    }
    if (!((forestValue302_2927_0 == forestValue302_2927_1))) {
        break forest_join_2950;
    }
    spill302_319 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_2951_0 = __integerCategory302_590(spill302_319);
        break forest_join_2951;
    }
    if (!((!spill302_319))) {
        break forest_join_2950;
    }
    spill302_320 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_2951_0 = __integerCategory302_591(spill302_320);
        break forest_join_2951;
    }
    if (!(spill302_320)) {
        break forest_join_2950;
    }
    life13_1050 = __invokedynamic302_592(26738, (839605060090794547L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_3708;
    }
    }
    forestValue302_2951_0 = life13_1050;
    }
    forestValue302_2956_0 = forestValue302_2951_0;
    forestValue302_2956_1 = __invokedynamic302_593(15677, (1235683529631057756L ^ life9_3));
    }
    if (!((life11_8 != null))) {
        forestValue302_2985_0 = forestValue302_2956_0;
        forestValue302_2985_1 = forestValue302_2956_1;
        break forest_join_2985;
    }
    if (!((forestValue302_2956_0 == forestValue302_2956_1))) {
        break forest_join_2979;
    }
    spill302_321 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_2980_0 = __integerCategory302_594(spill302_321);
        break forest_join_2980;
    }
    if (!(spill302_321)) {
        break forest_join_2979;
    }
    spill302_322 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_2980_0 = __integerCategory302_595(spill302_322);
        break forest_join_2980;
    }
    if (!((!spill302_322))) {
        break forest_join_2979;
    }
    life13_1050 = __invokedynamic302_596(26921, (9015302541829378916L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_3708;
    }
    }
    forestValue302_2980_0 = life13_1050;
    }
    forestValue302_2985_0 = forestValue302_2980_0;
    forestValue302_2985_1 = __invokedynamic302_597(23808, (7821722241826465616L ^ life9_3));
    }
    if (!((life11_8 != null))) {
        forestValue302_3014_0 = forestValue302_2985_0;
        forestValue302_3014_1 = forestValue302_2985_1;
        break forest_join_3014;
    }
    if (!((forestValue302_2985_0 == forestValue302_2985_1))) {
        break forest_join_3008;
    }
    spill302_323 = (life12_7)[0];
    if (!((life11_8 != null))) {
        forestValue302_3009_0 = __integerCategory302_598(spill302_323);
        break forest_join_3009;
    }
    if (!(spill302_323)) {
        break forest_join_3008;
    }
    spill302_324 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_3009_0 = __integerCategory302_599(spill302_324);
        break forest_join_3009;
    }
    if (!((!spill302_324))) {
        break forest_join_3008;
    }
    life13_1050 = __invokedynamic302_600(11395, (2611723435225306873L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_3708;
    }
    }
    forestValue302_3009_0 = life13_1050;
    }
    forestValue302_3014_0 = forestValue302_3009_0;
    forestValue302_3014_1 = __invokedynamic302_601(25366, (8356309775788972395L ^ life9_3));
    }
    if (!((life11_8 != null))) {
        forestValue302_3043_0 = forestValue302_3014_0;
        forestValue302_3043_1 = forestValue302_3014_1;
        break forest_join_3043;
    }
    if (!((forestValue302_3014_0 == forestValue302_3014_1))) {
        break forest_join_3037;
    }
    spill302_325 = (life12_7)[0];
    if (!((life11_8 != null))) {
        forestValue302_3038_0 = __integerCategory302_602(spill302_325);
        break forest_join_3038;
    }
    if (!((!spill302_325))) {
        break forest_join_3037;
    }
    spill302_326 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_3038_0 = __integerCategory302_603(spill302_326);
        break forest_join_3038;
    }
    if (!(spill302_326)) {
        break forest_join_3037;
    }
    life13_1050 = __invokedynamic302_604(18070, (7862319467139284181L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_3708;
    }
    }
    forestValue302_3038_0 = life13_1050;
    }
    forestValue302_3043_0 = forestValue302_3038_0;
    forestValue302_3043_1 = __invokedynamic302_605(14831, (7171352651990647715L ^ life9_3));
    }
    if (!((life11_8 != null))) {
        forestValue302_3072_0 = forestValue302_3043_0;
        forestValue302_3072_1 = forestValue302_3043_1;
        break forest_join_3072;
    }
    if (!((forestValue302_3043_0 == forestValue302_3043_1))) {
        break forest_join_3066;
    }
    spill302_327 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_3067_0 = __integerCategory302_606(spill302_327);
        break forest_join_3067;
    }
    if (!(spill302_327)) {
        break forest_join_3066;
    }
    spill302_328 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_3067_0 = __integerCategory302_607(spill302_328);
        break forest_join_3067;
    }
    if (!((!spill302_328))) {
        break forest_join_3066;
    }
    life13_1050 = __invokedynamic302_608(26887, (553787821508989785L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_3708;
    }
    }
    forestValue302_3067_0 = life13_1050;
    }
    forestValue302_3072_0 = forestValue302_3067_0;
    forestValue302_3072_1 = __invokedynamic302_609(15677, (1235683529631057756L ^ life9_3));
    }
    if (!((life11_8 != null))) {
        forestValue302_3101_0 = forestValue302_3072_0;
        forestValue302_3101_1 = forestValue302_3072_1;
        break forest_join_3101;
    }
    if (!((forestValue302_3072_0 == forestValue302_3072_1))) {
        break forest_join_3095;
    }
    spill302_329 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_3096_0 = __integerCategory302_610(spill302_329);
        break forest_join_3096;
    }
    if (!((!spill302_329))) {
        break forest_join_3095;
    }
    spill302_330 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_3096_0 = __integerCategory302_611(spill302_330);
        break forest_join_3096;
    }
    if (!(spill302_330)) {
        break forest_join_3095;
    }
    life13_1050 = __invokedynamic302_612(3024, (791948010010603966L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_3708;
    }
    }
    forestValue302_3096_0 = life13_1050;
    }
    forestValue302_3101_0 = forestValue302_3096_0;
    forestValue302_3101_1 = __invokedynamic302_613(16051, (1963038319806170341L ^ life9_3));
    }
    if (!((life11_8 != null))) {
        forestValue302_3142_0 = forestValue302_3101_0;
        forestValue302_3142_1 = forestValue302_3101_1;
        break forest_join_3142;
    }
    if (!((forestValue302_3101_0 == forestValue302_3101_1))) {
        break forest_join_3136;
    }
    spill302_331 = (life12_7)[0];
    if (!((life11_8 != null))) {
        forestValue302_3137_0 = __integerCategory302_614(spill302_331);
        break forest_join_3137;
    }
    if (!(spill302_331)) {
        break forest_join_3136;
    }
    spill302_332 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_3137_0 = __integerCategory302_615(spill302_332);
        break forest_join_3137;
    }
    if (!(spill302_332)) {
        break forest_join_3136;
    }
    spill302_333 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_3137_0 = __integerCategory302_616(spill302_333);
        break forest_join_3137;
    }
    if (!(spill302_333)) {
        break forest_join_3136;
    }
    spill302_334 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_3137_0 = __integerCategory302_617(spill302_334);
        break forest_join_3137;
    }
    if (!(spill302_334)) {
        break forest_join_3136;
    }
    life13_1050 = __invokedynamic302_618(9844, (3899385143321287719L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_3708;
    }
    }
    forestValue302_3137_0 = life13_1050;
    }
    forestValue302_3142_0 = forestValue302_3137_0;
    forestValue302_3142_1 = __invokedynamic302_619(16051, (1963038319806170341L ^ life9_3));
    }
    if (!((life11_8 != null))) {
        forestValue302_3183_0 = forestValue302_3142_0;
        forestValue302_3183_1 = forestValue302_3142_1;
        break forest_join_3183;
    }
    if (!((forestValue302_3142_0 == forestValue302_3142_1))) {
        break forest_join_3177;
    }
    spill302_335 = (life12_7)[0];
    if (!((life11_8 != null))) {
        forestValue302_3178_0 = __integerCategory302_620(spill302_335);
        break forest_join_3178;
    }
    if (!((!spill302_335))) {
        break forest_join_3177;
    }
    spill302_336 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_3178_0 = __integerCategory302_621(spill302_336);
        break forest_join_3178;
    }
    if (!(spill302_336)) {
        break forest_join_3177;
    }
    spill302_337 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_3178_0 = __integerCategory302_622(spill302_337);
        break forest_join_3178;
    }
    if (!(spill302_337)) {
        break forest_join_3177;
    }
    spill302_338 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_3178_0 = __integerCategory302_623(spill302_338);
        break forest_join_3178;
    }
    if (!(spill302_338)) {
        break forest_join_3177;
    }
    life13_1050 = __invokedynamic302_624(4762, (7014727841428662498L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_3708;
    }
    }
    forestValue302_3178_0 = life13_1050;
    }
    forestValue302_3183_0 = forestValue302_3178_0;
    forestValue302_3183_1 = __invokedynamic302_625(16051, (1963038319806170341L ^ life9_3));
    }
    if (!((life11_8 != null))) {
        forestValue302_3224_0 = forestValue302_3183_0;
        forestValue302_3224_1 = forestValue302_3183_1;
        break forest_join_3224;
    }
    if (!((forestValue302_3183_0 == forestValue302_3183_1))) {
        break forest_join_3218;
    }
    spill302_339 = (life12_7)[0];
    if (!((life11_8 != null))) {
        forestValue302_3219_0 = __integerCategory302_626(spill302_339);
        break forest_join_3219;
    }
    if (!(spill302_339)) {
        break forest_join_3218;
    }
    spill302_340 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_3219_0 = __integerCategory302_627(spill302_340);
        break forest_join_3219;
    }
    if (!((!spill302_340))) {
        break forest_join_3218;
    }
    spill302_341 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_3219_0 = __integerCategory302_628(spill302_341);
        break forest_join_3219;
    }
    if (!(spill302_341)) {
        break forest_join_3218;
    }
    spill302_342 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_3219_0 = __integerCategory302_629(spill302_342);
        break forest_join_3219;
    }
    if (!(spill302_342)) {
        break forest_join_3218;
    }
    life13_1050 = __invokedynamic302_630(23702, (2505926576123356899L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_3708;
    }
    }
    forestValue302_3219_0 = life13_1050;
    }
    forestValue302_3224_0 = forestValue302_3219_0;
    forestValue302_3224_1 = __invokedynamic302_631(16051, (1963038319806170341L ^ life9_3));
    }
    if (!((life11_8 != null))) {
        forestValue302_3265_0 = forestValue302_3224_0;
        forestValue302_3265_1 = forestValue302_3224_1;
        break forest_join_3265;
    }
    if (!((forestValue302_3224_0 == forestValue302_3224_1))) {
        break forest_join_3259;
    }
    spill302_343 = (life12_7)[0];
    if (!((life11_8 != null))) {
        forestValue302_3260_0 = __integerCategory302_632(spill302_343);
        break forest_join_3260;
    }
    if (!(spill302_343)) {
        break forest_join_3259;
    }
    spill302_344 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_3260_0 = __integerCategory302_633(spill302_344);
        break forest_join_3260;
    }
    if (!(spill302_344)) {
        break forest_join_3259;
    }
    spill302_345 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_3260_0 = __integerCategory302_634(spill302_345);
        break forest_join_3260;
    }
    if (!((!spill302_345))) {
        break forest_join_3259;
    }
    spill302_346 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_3260_0 = __integerCategory302_635(spill302_346);
        break forest_join_3260;
    }
    if (!(spill302_346)) {
        break forest_join_3259;
    }
    life13_1050 = __invokedynamic302_636(24250, (3092973873996080342L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_3708;
    }
    }
    forestValue302_3260_0 = life13_1050;
    }
    forestValue302_3265_0 = forestValue302_3260_0;
    forestValue302_3265_1 = __invokedynamic302_637(16051, (1963038319806170341L ^ life9_3));
    }
    if (!((life11_8 != null))) {
        forestValue302_3306_0 = forestValue302_3265_0;
        forestValue302_3306_1 = forestValue302_3265_1;
        break forest_join_3306;
    }
    if (!((forestValue302_3265_0 == forestValue302_3265_1))) {
        break forest_join_3300;
    }
    spill302_347 = (life12_7)[0];
    if (!((life11_8 != null))) {
        forestValue302_3301_0 = __integerCategory302_638(spill302_347);
        break forest_join_3301;
    }
    if (!(spill302_347)) {
        break forest_join_3300;
    }
    spill302_348 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_3301_0 = __integerCategory302_639(spill302_348);
        break forest_join_3301;
    }
    if (!(spill302_348)) {
        break forest_join_3300;
    }
    spill302_349 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_3301_0 = __integerCategory302_640(spill302_349);
        break forest_join_3301;
    }
    if (!(spill302_349)) {
        break forest_join_3300;
    }
    spill302_350 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_3301_0 = __integerCategory302_641(spill302_350);
        break forest_join_3301;
    }
    if (!((!spill302_350))) {
        break forest_join_3300;
    }
    life13_1050 = __invokedynamic302_642(26881, (339261400230499179L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_3708;
    }
    }
    forestValue302_3301_0 = life13_1050;
    }
    forestValue302_3306_0 = forestValue302_3301_0;
    forestValue302_3306_1 = __invokedynamic302_643(16051, (1963038319806170341L ^ life9_3));
    }
    if (!((life11_8 != null))) {
        forestValue302_3347_0 = forestValue302_3306_0;
        forestValue302_3347_1 = forestValue302_3306_1;
        break forest_join_3347;
    }
    if (!((forestValue302_3306_0 == forestValue302_3306_1))) {
        break forest_join_3341;
    }
    spill302_351 = (life12_7)[0];
    if (!((life11_8 != null))) {
        forestValue302_3342_0 = __integerCategory302_644(spill302_351);
        break forest_join_3342;
    }
    if (!(spill302_351)) {
        break forest_join_3341;
    }
    spill302_352 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_3342_0 = __integerCategory302_645(spill302_352);
        break forest_join_3342;
    }
    if (!(spill302_352)) {
        break forest_join_3341;
    }
    spill302_353 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_3342_0 = __integerCategory302_646(spill302_353);
        break forest_join_3342;
    }
    if (!((!spill302_353))) {
        break forest_join_3341;
    }
    spill302_354 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_3342_0 = __integerCategory302_647(spill302_354);
        break forest_join_3342;
    }
    if (!((!spill302_354))) {
        break forest_join_3341;
    }
    life13_1050 = __invokedynamic302_648(14704, (7335138023765459752L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_3708;
    }
    }
    forestValue302_3342_0 = life13_1050;
    }
    forestValue302_3347_0 = forestValue302_3342_0;
    forestValue302_3347_1 = __invokedynamic302_649(16051, (1963038319806170341L ^ life9_3));
    }
    if (!((life11_8 != null))) {
        forestValue302_3388_0 = forestValue302_3347_0;
        forestValue302_3388_1 = forestValue302_3347_1;
        break forest_join_3388;
    }
    if (!((forestValue302_3347_0 == forestValue302_3347_1))) {
        break forest_join_3382;
    }
    spill302_355 = (life12_7)[0];
    if (!((life11_8 != null))) {
        forestValue302_3383_0 = __integerCategory302_650(spill302_355);
        break forest_join_3383;
    }
    if (!((!spill302_355))) {
        break forest_join_3382;
    }
    spill302_356 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_3383_0 = __integerCategory302_651(spill302_356);
        break forest_join_3383;
    }
    if (!((!spill302_356))) {
        break forest_join_3382;
    }
    spill302_357 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_3383_0 = __integerCategory302_652(spill302_357);
        break forest_join_3383;
    }
    if (!(spill302_357)) {
        break forest_join_3382;
    }
    spill302_358 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_3383_0 = __integerCategory302_653(spill302_358);
        break forest_join_3383;
    }
    if (!(spill302_358)) {
        break forest_join_3382;
    }
    life13_1050 = __invokedynamic302_654(27270, (478834402949075163L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_3708;
    }
    }
    forestValue302_3383_0 = life13_1050;
    }
    forestValue302_3388_0 = forestValue302_3383_0;
    forestValue302_3388_1 = __invokedynamic302_655(16051, (1963038319806170341L ^ life9_3));
    }
    if (!((life11_8 != null))) {
        forestValue302_3429_0 = forestValue302_3388_0;
        forestValue302_3429_1 = forestValue302_3388_1;
        break forest_join_3429;
    }
    if (!((forestValue302_3388_0 == forestValue302_3388_1))) {
        break forest_join_3423;
    }
    spill302_359 = (life12_7)[0];
    if (!((life11_8 != null))) {
        forestValue302_3424_0 = __integerCategory302_656(spill302_359);
        break forest_join_3424;
    }
    if (!((!spill302_359))) {
        break forest_join_3423;
    }
    spill302_360 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_3424_0 = __integerCategory302_657(spill302_360);
        break forest_join_3424;
    }
    if (!(spill302_360)) {
        break forest_join_3423;
    }
    spill302_361 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_3424_0 = __integerCategory302_658(spill302_361);
        break forest_join_3424;
    }
    if (!((!spill302_361))) {
        break forest_join_3423;
    }
    spill302_362 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_3424_0 = __integerCategory302_659(spill302_362);
        break forest_join_3424;
    }
    if (!(spill302_362)) {
        break forest_join_3423;
    }
    life13_1050 = __invokedynamic302_660(14093, (6434694154123038063L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_3708;
    }
    }
    forestValue302_3424_0 = life13_1050;
    }
    forestValue302_3429_0 = forestValue302_3424_0;
    forestValue302_3429_1 = __invokedynamic302_661(16051, (1963038319806170341L ^ life9_3));
    }
    if (!((life11_8 != null))) {
        forestValue302_3470_0 = forestValue302_3429_0;
        forestValue302_3470_1 = forestValue302_3429_1;
        break forest_join_3470;
    }
    if (!((forestValue302_3429_0 == forestValue302_3429_1))) {
        break forest_join_3464;
    }
    spill302_363 = (life12_7)[0];
    if (!((life11_8 != null))) {
        forestValue302_3465_0 = __integerCategory302_662(spill302_363);
        break forest_join_3465;
    }
    if (!(spill302_363)) {
        break forest_join_3464;
    }
    spill302_364 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_3465_0 = __integerCategory302_663(spill302_364);
        break forest_join_3465;
    }
    if (!((!spill302_364))) {
        break forest_join_3464;
    }
    spill302_365 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_3465_0 = __integerCategory302_664(spill302_365);
        break forest_join_3465;
    }
    if (!(spill302_365)) {
        break forest_join_3464;
    }
    spill302_366 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_3465_0 = __integerCategory302_665(spill302_366);
        break forest_join_3465;
    }
    if (!((!spill302_366))) {
        break forest_join_3464;
    }
    life13_1050 = __invokedynamic302_666(12378, (590413113137023519L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_3708;
    }
    }
    forestValue302_3465_0 = life13_1050;
    }
    forestValue302_3470_0 = forestValue302_3465_0;
    forestValue302_3470_1 = __invokedynamic302_667(16051, (1963038319806170341L ^ life9_3));
    }
    if (!((life11_8 != null))) {
        forestValue302_3511_0 = forestValue302_3470_0;
        forestValue302_3511_1 = forestValue302_3470_1;
        break forest_join_3511;
    }
    if (!((forestValue302_3470_0 == forestValue302_3470_1))) {
        break forest_join_3505;
    }
    spill302_367 = (life12_7)[0];
    if (!((life11_8 != null))) {
        forestValue302_3506_0 = __integerCategory302_668(spill302_367);
        break forest_join_3506;
    }
    if (!(spill302_367)) {
        break forest_join_3505;
    }
    spill302_368 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_3506_0 = __integerCategory302_669(spill302_368);
        break forest_join_3506;
    }
    if (!((!spill302_368))) {
        break forest_join_3505;
    }
    spill302_369 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_3506_0 = __integerCategory302_670(spill302_369);
        break forest_join_3506;
    }
    if (!((!spill302_369))) {
        break forest_join_3505;
    }
    spill302_370 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_3506_0 = __integerCategory302_671(spill302_370);
        break forest_join_3506;
    }
    if (!(spill302_370)) {
        break forest_join_3505;
    }
    life13_1050 = __invokedynamic302_672(2732, (2578692351369670910L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_3708;
    }
    }
    forestValue302_3506_0 = life13_1050;
    }
    forestValue302_3511_0 = forestValue302_3506_0;
    forestValue302_3511_1 = __invokedynamic302_673(16051, (1963038319806170341L ^ life9_3));
    }
    if (!((life11_8 != null))) {
        forestValue302_3552_0 = forestValue302_3511_0;
        forestValue302_3552_1 = forestValue302_3511_1;
        break forest_join_3552;
    }
    if (!((forestValue302_3511_0 == forestValue302_3511_1))) {
        break forest_join_3546;
    }
    spill302_371 = (life12_7)[0];
    if (!((life11_8 != null))) {
        forestValue302_3547_0 = __integerCategory302_674(spill302_371);
        break forest_join_3547;
    }
    if (!((!spill302_371))) {
        break forest_join_3546;
    }
    spill302_372 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_3547_0 = __integerCategory302_675(spill302_372);
        break forest_join_3547;
    }
    if (!(spill302_372)) {
        break forest_join_3546;
    }
    spill302_373 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_3547_0 = __integerCategory302_676(spill302_373);
        break forest_join_3547;
    }
    if (!(spill302_373)) {
        break forest_join_3546;
    }
    spill302_374 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_3547_0 = __integerCategory302_677(spill302_374);
        break forest_join_3547;
    }
    if (!((!spill302_374))) {
        break forest_join_3546;
    }
    life13_1050 = __invokedynamic302_678(30018, (4708602699597549346L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_3708;
    }
    }
    forestValue302_3547_0 = life13_1050;
    }
    forestValue302_3552_0 = forestValue302_3547_0;
    forestValue302_3552_1 = __invokedynamic302_679(16051, (1963038319806170341L ^ life9_3));
    }
    if (!((life11_8 != null))) {
        forestValue302_3593_0 = forestValue302_3552_0;
        forestValue302_3593_1 = forestValue302_3552_1;
        break forest_join_3593;
    }
    if (!((forestValue302_3552_0 == forestValue302_3552_1))) {
        break forest_join_3587;
    }
    spill302_375 = (life12_7)[0];
    if (!((life11_8 != null))) {
        forestValue302_3588_0 = __integerCategory302_680(spill302_375);
        break forest_join_3588;
    }
    if (!(spill302_375)) {
        break forest_join_3587;
    }
    spill302_376 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_3588_0 = __integerCategory302_681(spill302_376);
        break forest_join_3588;
    }
    if (!((!spill302_376))) {
        break forest_join_3587;
    }
    spill302_377 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_3588_0 = __integerCategory302_682(spill302_377);
        break forest_join_3588;
    }
    if (!((!spill302_377))) {
        break forest_join_3587;
    }
    spill302_378 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_3588_0 = __integerCategory302_683(spill302_378);
        break forest_join_3588;
    }
    if (!((!spill302_378))) {
        break forest_join_3587;
    }
    life13_1050 = __invokedynamic302_684(687, (5458412753728305350L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_3708;
    }
    }
    forestValue302_3588_0 = life13_1050;
    }
    forestValue302_3593_0 = forestValue302_3588_0;
    forestValue302_3593_1 = __invokedynamic302_685(16051, (1963038319806170341L ^ life9_3));
    }
    if (!((life11_8 != null))) {
        forestValue302_3634_0 = forestValue302_3593_0;
        forestValue302_3634_1 = forestValue302_3593_1;
        break forest_join_3634;
    }
    if (!((forestValue302_3593_0 == forestValue302_3593_1))) {
        break forest_join_3628;
    }
    spill302_379 = (life12_7)[0];
    if (!((life11_8 != null))) {
        forestValue302_3629_0 = __integerCategory302_686(spill302_379);
        break forest_join_3629;
    }
    if (!((!spill302_379))) {
        break forest_join_3628;
    }
    spill302_380 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_3629_0 = __integerCategory302_687(spill302_380);
        break forest_join_3629;
    }
    if (!(spill302_380)) {
        break forest_join_3628;
    }
    spill302_381 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_3629_0 = __integerCategory302_688(spill302_381);
        break forest_join_3629;
    }
    if (!((!spill302_381))) {
        break forest_join_3628;
    }
    spill302_382 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_3629_0 = __integerCategory302_689(spill302_382);
        break forest_join_3629;
    }
    if (!((!spill302_382))) {
        break forest_join_3628;
    }
    life13_1050 = __invokedynamic302_690(11767, (8857148385347131268L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_3708;
    }
    }
    forestValue302_3629_0 = life13_1050;
    }
    forestValue302_3634_0 = forestValue302_3629_0;
    forestValue302_3634_1 = __invokedynamic302_691(16051, (1963038319806170341L ^ life9_3));
    }
    if (!((life11_8 != null))) {
        forestValue302_3677_0 = forestValue302_3634_0;
        forestValue302_3677_1 = forestValue302_3634_1;
        break forest_join_3677;
    }
    if (!((forestValue302_3634_0 == forestValue302_3634_1))) {
        break forest_join_3669;
    }
    spill302_383 = (life12_7)[0];
    if (!((life11_8 != null))) {
        forestValue302_3670_0 = __integerCategory302_692(spill302_383);
        break forest_join_3670;
    }
    if (!((!spill302_383))) {
        break forest_join_3669;
    }
    spill302_384 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_3670_0 = __integerCategory302_693(spill302_384);
        break forest_join_3670;
    }
    if (!((!spill302_384))) {
        break forest_join_3669;
    }
    spill302_385 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_3670_0 = __integerCategory302_694(spill302_385);
        break forest_join_3670;
    }
    if (!(spill302_385)) {
        break forest_join_3669;
    }
    spill302_386 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_3670_0 = __integerCategory302_695(spill302_386);
        break forest_join_3670;
    }
    if (!((!spill302_386))) {
        break forest_join_3669;
    }
    life13_1050 = __invokedynamic302_696(3850, (7972211110808843618L ^ life9_3));
    if (!((life11_8 == null))) {
        break forest_join_3708;
    }
    }
    forestValue302_3670_0 = life13_1050;
    }
    if (!((life11_8 != null))) {
        forestValue302_3709_0 = forestValue302_3670_0;
        break forest_join_3709;
    }
    forestValue302_3677_0 = forestValue302_3670_0;
    forestValue302_3677_1 = __invokedynamic302_697(16051, (1963038319806170341L ^ life9_3));
    }
    if (!((forestValue302_3677_0 == forestValue302_3677_1))) {
        break forest_join_3708;
    }
    spill302_387 = (life12_7)[0];
    if (!((life11_8 != null))) {
        forestValue302_3709_0 = __integerCategory302_698(spill302_387);
        break forest_join_3709;
    }
    if (!((!spill302_387))) {
        break forest_join_3708;
    }
    spill302_388 = (life12_7)[1];
    if (!((life11_8 != null))) {
        forestValue302_3709_0 = __integerCategory302_699(spill302_388);
        break forest_join_3709;
    }
    if (!((!spill302_388))) {
        break forest_join_3708;
    }
    spill302_389 = (life12_7)[2];
    if (!((life11_8 != null))) {
        forestValue302_3709_0 = __integerCategory302_700(spill302_389);
        break forest_join_3709;
    }
    if (!((!spill302_389))) {
        break forest_join_3708;
    }
    spill302_390 = (life12_7)[3];
    if (!((life11_8 != null))) {
        forestValue302_3709_0 = __integerCategory302_701(spill302_390);
        break forest_join_3709;
    }
    if (!(spill302_390)) {
        break forest_join_3708;
    }
    life13_1050 = __invokedynamic302_702(25923, (8819079903824256790L ^ life9_3));
    }
    forestValue302_3709_0 = life13_1050;
    }
    return forestValue302_3709_0;
}
public static int h302_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030200_0(p0);
}
public static int h302_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030201_0(p0);
}
public static int h302_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030202_0(p0);
}
public static int h302_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030203_0(p0);
}
public static int h302_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030204_0(p0);
}
public static int h302_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030205_0(p0);
}
public static int h302_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030206_0(p0);
}
public static int h302_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030207_0(p0);
}
public static int h302_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030208_0(p0);
}
public static int h302_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030209_0(p0);
}
public static int h302_10(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030210_0(p0);
}
public static int h302_11(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030211_0(p0);
}
public static int h302_12(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030212_0(p0);
}
public static int h302_13(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030213_0(p0);
}
public static int h302_14(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030214_0(p0);
}
public static int h302_15(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030215_0(p0);
}
public static int h302_16(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030216_0(p0);
}
public static int h302_17(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030217_0(p0);
}
public static int h302_18(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030218_0(p0);
}
public static int h302_19(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030219_0(p0);
}
public static int h302_20(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030220_0(p0);
}
public static int h302_21(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030221_0(p0);
}
public static int h302_22(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030222_0(p0);
}
public static int h302_23(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030223_0(p0);
}
public static int h302_24(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030224_0(p0);
}
public static int h302_25(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030225_0(p0);
}
public static int h302_26(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030226_0(p0);
}
public static int h302_27(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030227_0(p0);
}
public static int h302_28(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030228_0(p0);
}
public static int h302_29(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030229_0(p0);
}
public static int h302_30(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030230_0(p0);
}
public static int h302_31(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030231_0(p0);
}
public static int h302_32(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030232_0(p0);
}
public static int h302_33(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030233_0(p0);
}
public static int h302_34(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030234_0(p0);
}
public static int h302_35(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030235_0(p0);
}
public static int h302_36(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030236_0(p0);
}
public static int h302_37(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030237_0(p0);
}
public static int h302_38(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030238_0(p0);
}
public static int h302_39(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030239_0(p0);
}
public static int h302_40(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030240_0(p0);
}
public static int h302_41(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030241_0(p0);
}
public static int h302_42(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030242_0(p0);
}
public static int h302_43(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030243_0(p0);
}
public static int h302_44(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030244_0(p0);
}
public static int h302_45(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030245_0(p0);
}
public static int h302_46(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030246_0(p0);
}
public static int h302_47(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030247_0(p0);
}
public static int h302_48(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030248_0(p0);
}
public static int h302_49(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030249_0(p0);
}
public static int h302_50(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030250_0(p0);
}
public static int h302_51(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030251_0(p0);
}
public static int h302_52(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030252_0(p0);
}
public static int h302_53(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030253_0(p0);
}
public static int h302_54(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030254_0(p0);
}
public static int h302_55(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030255_0(p0);
}
public static int h302_56(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030256_0(p0);
}
public static int h302_57(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030257_0(p0);
}
public static int h302_58(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030258_0(p0);
}
public static int h302_59(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030259_0(p0);
}
public static int h302_60(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030260_0(p0);
}
public static int h302_61(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030261_0(p0);
}
public static int h302_62(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030262_0(p0);
}
public static int h302_63(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030263_0(p0);
}
public static int h302_64(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030264_0(p0);
}
public static int h302_65(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030265_0(p0);
}
public static int h302_66(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030266_0(p0);
}
public static int h302_67(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030267_0(p0);
}
public static int h302_68(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030268_0(p0);
}
public static int h302_69(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030269_0(p0);
}
public static int h302_70(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030270_0(p0);
}
public static int h302_71(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030271_0(p0);
}
public static int h302_72(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030272_0(p0);
}
public static int h302_73(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030273_0(p0);
}
public static int h302_74(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030274_0(p0);
}
public static int h302_75(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030275_0(p0);
}
public static int h302_76(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030276_0(p0);
}
public static int h302_77(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030277_0(p0);
}
public static int h302_78(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030278_0(p0);
}
public static int h302_79(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030279_0(p0);
}
public static int h302_80(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030280_0(p0);
}
public static int h302_81(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030281_0(p0);
}
public static int h302_82(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030282_0(p0);
}
public static int h302_83(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030283_0(p0);
}
public static int h302_84(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030284_0(p0);
}
public static int h302_85(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030285_0(p0);
}
public static int h302_86(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030286_0(p0);
}
public static int h302_87(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030287_0(p0);
}
public static int h302_88(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030288_0(p0);
}
public static int h302_89(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030289_0(p0);
}
public static int h302_90(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030290_0(p0);
}
public static int h302_91(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030291_0(p0);
}
public static int h302_92(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030292_0(p0);
}
public static int h302_93(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030293_0(p0);
}
public static int h302_94(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030294_0(p0);
}
public static int h302_95(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030295_0(p0);
}
public static int h302_96(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030296_0(p0);
}
public static int h302_97(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030297_0(p0);
}
public static int h302_98(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030298_0(p0);
}
public static int h302_99(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030299_0(p0);
}
public static int h302_100(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030300_0(p0);
}
public static int h302_101(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030301_0(p0);
}
public static int h302_102(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030302_0(p0);
}
public static int h302_103(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030303_0(p0);
}
public static int h302_104(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030304_0(p0);
}
public static int h302_105(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030305_0(p0);
}
public static int h302_106(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030306_0(p0);
}
public static int h302_107(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030307_0(p0);
}
public static int h302_108(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030308_0(p0);
}
public static int h302_109(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030309_0(p0);
}
public static int h302_110(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030310_0(p0);
}
public static int h302_111(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030311_0(p0);
}
public static int h302_112(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030312_0(p0);
}
public static int h302_113(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030313_0(p0);
}
public static int h302_114(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030314_0(p0);
}
public static int h302_115(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030315_0(p0);
}
public static int h302_116(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030316_0(p0);
}
public static int h302_117(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030317_0(p0);
}
public static int h302_118(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030318_0(p0);
}
public static int h302_119(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030319_0(p0);
}
public static int h302_120(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030320_0(p0);
}
public static int h302_121(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030321_0(p0);
}
public static int h302_122(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030322_0(p0);
}
public static int h302_123(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030323_0(p0);
}
public static int h302_124(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030324_0(p0);
}
public static int h302_125(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030325_0(p0);
}
public static int h302_126(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030326_0(p0);
}
public static int h302_127(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030327_0(p0);
}
public static int h302_128(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030328_0(p0);
}
public static int h302_129(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030329_0(p0);
}
public static int h302_130(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030330_0(p0);
}
public static int h302_131(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030331_0(p0);
}
public static int h302_132(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030332_0(p0);
}
public static int h302_133(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030333_0(p0);
}
public static int h302_134(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030334_0(p0);
}
public static int h302_135(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030335_0(p0);
}
public static int h302_136(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030336_0(p0);
}
public static int h302_137(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030337_0(p0);
}
public static int h302_138(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030338_0(p0);
}
public static int h302_139(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030339_0(p0);
}
public static int h302_140(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030340_0(p0);
}
public static int h302_141(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030341_0(p0);
}
public static int h302_142(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030342_0(p0);
}
public static int h302_143(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030343_0(p0);
}
public static int h302_144(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030344_0(p0);
}
public static int h302_145(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030345_0(p0);
}
public static int h302_146(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030346_0(p0);
}
public static int h302_147(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030347_0(p0);
}
public static int h302_148(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030348_0(p0);
}
public static int h302_149(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030349_0(p0);
}
public static int h302_150(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030350_0(p0);
}
public static int h302_151(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030351_0(p0);
}
public static int h302_152(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030352_0(p0);
}
public static int h302_153(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030353_0(p0);
}
public static int h302_154(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030354_0(p0);
}
public static int h302_155(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030355_0(p0);
}
public static int h302_156(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030356_0(p0);
}
public static int h302_157(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030357_0(p0);
}
public static int h302_158(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030358_0(p0);
}
public static int h302_159(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030359_0(p0);
}
public static int h302_160(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030360_0(p0);
}
public static int h302_161(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030361_0(p0);
}
public static int h302_162(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030362_0(p0);
}
public static int h302_163(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030363_0(p0);
}
public static int h302_164(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030364_0(p0);
}
public static int h302_165(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030365_0(p0);
}
public static int h302_166(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030366_0(p0);
}
public static int h302_167(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030367_0(p0);
}
public static int h302_168(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030368_0(p0);
}
public static int h302_169(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030369_0(p0);
}
public static int h302_170(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030370_0(p0);
}
public static int h302_171(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030371_0(p0);
}
public static int h302_172(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030372_0(p0);
}
public static int h302_173(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030373_0(p0);
}
public static int h302_174(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030374_0(p0);
}
public static int h302_175(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030375_0(p0);
}
public static int h302_176(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030376_0(p0);
}
public static int h302_177(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030377_0(p0);
}
public static int h302_178(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030378_0(p0);
}
public static int h302_179(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030379_0(p0);
}
public static int h302_180(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030380_0(p0);
}
public static int h302_181(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030381_0(p0);
}
public static int h302_182(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030382_0(p0);
}
public static int h302_183(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030383_0(p0);
}
public static int h302_184(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030384_0(p0);
}
public static int h302_185(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030385_0(p0);
}
public static int h302_186(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030386_0(p0);
}
public static int h302_187(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030387_0(p0);
}
public static int h302_188(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030388_0(p0);
}
public static int h302_189(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030389_0(p0);
}
public static int h302_190(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030390_0(p0);
}
public static int h302_191(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030391_0(p0);
}
public static int h302_192(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030392_0(p0);
}
public static int h302_193(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030393_0(p0);
}
public static int h302_194(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030394_0(p0);
}
public static int h302_195(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030395_0(p0);
}
public static int h302_196(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030396_0(p0);
}
public static int h302_197(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030397_0(p0);
}
public static int h302_198(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030398_0(p0);
}
public static int h302_199(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030399_0(p0);
}
public static int h302_200(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030400_0(p0);
}
public static int h302_201(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030401_0(p0);
}
public static int h302_202(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030402_0(p0);
}
public static int h302_203(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030403_0(p0);
}
public static int h302_204(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030404_0(p0);
}
public static int h302_205(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030405_0(p0);
}
public static int h302_206(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030406_0(p0);
}
public static int h302_207(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030407_0(p0);
}
public static int h302_208(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030408_0(p0);
}
public static int h302_209(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030409_0(p0);
}
public static int h302_210(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030410_0(p0);
}
public static int h302_211(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030411_0(p0);
}
public static int h302_212(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030412_0(p0);
}
public static int h302_213(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030413_0(p0);
}
public static int h302_214(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030414_0(p0);
}
public static int h302_215(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030415_0(p0);
}
public static int h302_216(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030416_0(p0);
}
public static int h302_217(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030417_0(p0);
}
public static int h302_218(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030418_0(p0);
}
public static int h302_219(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030419_0(p0);
}
public static int h302_220(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030420_0(p0);
}
public static int h302_221(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030421_0(p0);
}
public static int h302_222(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030422_0(p0);
}
public static int h302_223(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030423_0(p0);
}
public static int h302_224(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030424_0(p0);
}
public static int h302_225(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030425_0(p0);
}
public static int h302_226(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030426_0(p0);
}
public static int h302_227(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030427_0(p0);
}
public static int h302_228(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030428_0(p0);
}
public static int h302_229(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030429_0(p0);
}
public static int h302_230(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030430_0(p0);
}
public static int h302_231(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030431_0(p0);
}
public static int h302_232(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030432_0(p0);
}
public static int h302_233(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030433_0(p0);
}
public static int h302_234(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030434_0(p0);
}
public static int h302_235(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030435_0(p0);
}
public static int h302_236(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030436_0(p0);
}
public static int h302_237(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030437_0(p0);
}
public static int h302_238(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030438_0(p0);
}
public static int h302_239(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030439_0(p0);
}
public static int h302_240(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030440_0(p0);
}
public static int h302_241(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030441_0(p0);
}
public static int h302_242(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030442_0(p0);
}
public static int h302_243(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030443_0(p0);
}
public static int h302_244(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030444_0(p0);
}
public static int h302_245(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030445_0(p0);
}
public static int h302_246(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030446_0(p0);
}
public static int h302_247(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030447_0(p0);
}
public static int h302_248(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030448_0(p0);
}
public static int h302_249(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030449_0(p0);
}
public static int h302_250(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030450_0(p0);
}
public static int h302_251(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030451_0(p0);
}
public static int h302_252(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030452_0(p0);
}
public static int h302_253(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030453_0(p0);
}
public static int h302_254(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030454_0(p0);
}
public static int h302_255(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030455_0(p0);
}
public static int h302_256(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030456_0(p0);
}
public static int h302_257(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030457_0(p0);
}
public static int h302_258(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030458_0(p0);
}
public static int h302_259(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030459_0(p0);
}
public static int h302_260(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030460_0(p0);
}
public static int h302_261(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030461_0(p0);
}
public static int h302_262(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030462_0(p0);
}
public static int h302_263(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030463_0(p0);
}
public static int h302_264(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030464_0(p0);
}
public static int h302_265(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030465_0(p0);
}
public static int h302_266(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030466_0(p0);
}
public static int h302_267(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030467_0(p0);
}
public static int h302_268(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030468_0(p0);
}
public static int h302_269(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030469_0(p0);
}
public static int h302_270(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030470_0(p0);
}
public static int h302_271(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030471_0(p0);
}
public static int h302_272(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030472_0(p0);
}
public static int h302_273(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030473_0(p0);
}
public static int h302_274(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030474_0(p0);
}
public static int h302_275(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030475_0(p0);
}
public static int h302_276(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030476_0(p0);
}
public static int h302_277(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030477_0(p0);
}
public static int h302_278(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030478_0(p0);
}
public static int h302_279(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030479_0(p0);
}
public static int h302_280(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030480_0(p0);
}
public static int h302_281(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030481_0(p0);
}
public static int h302_282(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030482_0(p0);
}
public static int h302_283(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030483_0(p0);
}
public static int h302_284(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030484_0(p0);
}
public static int h302_285(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030485_0(p0);
}
public static int h302_286(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030486_0(p0);
}
public static int h302_287(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030487_0(p0);
}
public static int h302_288(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030488_0(p0);
}
public static int h302_289(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030489_0(p0);
}
public static int h302_290(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030490_0(p0);
}
public static int h302_291(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030491_0(p0);
}
public static int h302_292(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030492_0(p0);
}
public static int h302_293(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030493_0(p0);
}
public static int h302_294(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030494_0(p0);
}
public static int h302_295(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030495_0(p0);
}
public static int h302_296(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030496_0(p0);
}
public static int h302_297(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030497_0(p0);
}
public static int h302_298(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030498_0(p0);
}
public static int h302_299(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030499_0(p0);
}
public static int h302_300(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030500_0(p0);
}
public static int h302_301(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030501_0(p0);
}
public static int h302_302(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030502_0(p0);
}
public static int h302_303(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030503_0(p0);
}
public static int h302_304(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030504_0(p0);
}
public static int h302_305(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030505_0(p0);
}
public static int h302_306(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030506_0(p0);
}
public static int h302_307(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030507_0(p0);
}
public static int h302_308(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030508_0(p0);
}
public static int h302_309(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030509_0(p0);
}
public static int h302_310(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030510_0(p0);
}
public static int h302_311(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030511_0(p0);
}
public static int h302_312(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030512_0(p0);
}
public static int h302_313(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030513_0(p0);
}
public static int h302_314(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030514_0(p0);
}
public static int h302_315(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030515_0(p0);
}
public static int h302_316(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030516_0(p0);
}
public static int h302_317(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030517_0(p0);
}
public static int h302_318(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030518_0(p0);
}
public static int h302_319(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030519_0(p0);
}
public static int h302_320(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030520_0(p0);
}
public static int h302_321(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030521_0(p0);
}
public static int h302_322(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030522_0(p0);
}
public static int h302_323(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030523_0(p0);
}
public static int h302_324(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030524_0(p0);
}
public static int h302_325(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030525_0(p0);
}
public static int h302_326(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030526_0(p0);
}
public static int h302_327(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030527_0(p0);
}
public static int h302_328(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030528_0(p0);
}
public static int h302_329(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030529_0(p0);
}
public static int h302_330(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030530_0(p0);
}
public static int h302_331(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030531_0(p0);
}
public static int h302_332(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030532_0(p0);
}
public static int h302_333(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030533_0(p0);
}
public static int h302_334(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030534_0(p0);
}
public static int h302_335(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030535_0(p0);
}
public static int h302_336(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030536_0(p0);
}
public static int h302_337(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030537_0(p0);
}
public static int h302_338(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030538_0(p0);
}
public static int h302_339(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030539_0(p0);
}
public static int h302_340(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030540_0(p0);
}
public static int h302_341(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030541_0(p0);
}
public static int h302_342(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030542_0(p0);
}
public static int h302_343(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030543_0(p0);
}
public static int h302_344(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030544_0(p0);
}
public static int h302_345(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030545_0(p0);
}
public static int h302_346(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030546_0(p0);
}
public static int h302_347(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030547_0(p0);
}
public static int h302_348(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030548_0(p0);
}
public static int h302_349(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030549_0(p0);
}
public static int h302_350(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030550_0(p0);
}
public static int h302_351(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030551_0(p0);
}
public static int h302_352(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030552_0(p0);
}
public static int h302_353(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030553_0(p0);
}
public static int h302_354(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030554_0(p0);
}
public static int h302_355(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030555_0(p0);
}
public static int h302_356(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030556_0(p0);
}
public static int h302_357(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030557_0(p0);
}
public static int h302_358(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030558_0(p0);
}
public static int h302_359(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030559_0(p0);
}
public static int h302_360(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030560_0(p0);
}
public static int h302_361(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030561_0(p0);
}
public static int h302_362(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030562_0(p0);
}
public static int h302_363(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030563_0(p0);
}
public static int h302_364(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030564_0(p0);
}
public static int h302_365(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030565_0(p0);
}
public static int h302_366(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030566_0(p0);
}
public static int h302_367(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030567_0(p0);
}
public static int h302_368(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030568_0(p0);
}
public static int h302_369(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030569_0(p0);
}
public static int h302_370(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030570_0(p0);
}
public static int h302_371(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030571_0(p0);
}
public static int h302_372(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030572_0(p0);
}
public static int h302_373(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030573_0(p0);
}
public static int h302_374(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030574_0(p0);
}
public static int h302_375(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030575_0(p0);
}
public static int h302_376(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030576_0(p0);
}
public static int h302_377(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030577_0(p0);
}
public static int h302_378(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030578_0(p0);
}
public static int h302_379(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030579_0(p0);
}
public static int h302_380(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030580_0(p0);
}
public static int h302_381(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030581_0(p0);
}
public static int h302_382(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030582_0(p0);
}
public static int h302_383(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030583_0(p0);
}
public static int h302_384(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030584_0(p0);
}
public static int h302_385(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030585_0(p0);
}
public static int h302_386(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030586_0(p0);
}
public static int h302_387(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030587_0(p0);
}
public static int h302_388(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030588_0(p0);
}
public static int h302_389(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030589_0(p0);
}
public static int h302_390(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030590_0(p0);
}
public static int h302_391(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030591_0(p0);
}
public static int h302_392(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030592_0(p0);
}
public static int h302_393(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030593_0(p0);
}
public static int h302_394(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030594_0(p0);
}
public static int h302_395(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030595_0(p0);
}
public static int h302_396(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030596_0(p0);
}
public static int h302_397(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030597_0(p0);
}
public static int h302_398(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030598_0(p0);
}
public static int h302_399(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030599_0(p0);
}
public static int h302_400(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030600_0(p0);
}
public static int h302_401(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030601_0(p0);
}
public static int h302_402(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030602_0(p0);
}
public static int h302_403(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030603_0(p0);
}
public static int h302_404(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030604_0(p0);
}
public static int h302_405(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030605_0(p0);
}
public static int h302_406(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030606_0(p0);
}
public static int h302_407(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030607_0(p0);
}
public static int h302_408(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030608_0(p0);
}
public static int h302_409(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030609_0(p0);
}
public static int h302_410(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030610_0(p0);
}
public static int h302_411(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030611_0(p0);
}
public static int h302_412(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030612_0(p0);
}
public static int h302_413(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030613_0(p0);
}
public static int h302_414(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030614_0(p0);
}
public static int h302_415(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030615_0(p0);
}
public static int h302_416(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030616_0(p0);
}
public static int h302_417(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030617_0(p0);
}
public static int h302_418(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030618_0(p0);
}
public static int h302_419(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030619_0(p0);
}
public static int h302_420(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030620_0(p0);
}
public static int h302_421(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030621_0(p0);
}
public static int h302_422(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030622_0(p0);
}
public static int h302_423(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030623_0(p0);
}
public static int h302_424(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030624_0(p0);
}
public static int h302_425(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030625_0(p0);
}
public static int h302_426(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030626_0(p0);
}
public static int h302_427(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030627_0(p0);
}
public static int h302_428(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030628_0(p0);
}
public static int h302_429(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030629_0(p0);
}
public static int h302_430(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030630_0(p0);
}
public static int h302_431(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030631_0(p0);
}
public static int h302_432(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030632_0(p0);
}
public static int h302_433(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030633_0(p0);
}
public static int h302_434(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030634_0(p0);
}
public static int h302_435(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030635_0(p0);
}
public static int h302_436(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030636_0(p0);
}
public static int h302_437(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030637_0(p0);
}
public static int h302_438(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030638_0(p0);
}
public static int h302_439(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030639_0(p0);
}
public static int h302_440(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030640_0(p0);
}
public static int h302_441(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030641_0(p0);
}
public static int h302_442(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030642_0(p0);
}
public static int h302_443(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030643_0(p0);
}
public static int h302_444(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030644_0(p0);
}
public static int h302_445(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030645_0(p0);
}
public static int h302_446(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030646_0(p0);
}
public static int h302_447(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030647_0(p0);
}
public static int h302_448(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030648_0(p0);
}
public static int h302_449(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030649_0(p0);
}
public static int h302_450(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030650_0(p0);
}
public static int h302_451(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030651_0(p0);
}
public static int h302_452(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030652_0(p0);
}
public static int h302_453(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030653_0(p0);
}
public static int h302_454(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030654_0(p0);
}
public static int h302_455(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030655_0(p0);
}
public static int h302_456(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030656_0(p0);
}
public static int h302_457(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030657_0(p0);
}
public static int h302_458(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030658_0(p0);
}
public static int h302_459(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030659_0(p0);
}
public static int h302_460(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030660_0(p0);
}
public static int h302_461(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030661_0(p0);
}
public static int h302_462(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030662_0(p0);
}
public static int h302_463(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030663_0(p0);
}
public static int h302_464(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030664_0(p0);
}
public static int h302_465(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030665_0(p0);
}
public static int h302_466(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030666_0(p0);
}
public static int h302_467(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030667_0(p0);
}
public static int h302_468(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030668_0(p0);
}
public static int h302_469(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030669_0(p0);
}
public static int h302_470(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030670_0(p0);
}
public static int h302_471(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030671_0(p0);
}
public static int h302_472(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030672_0(p0);
}
public static int h302_473(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030673_0(p0);
}
public static int h302_474(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030674_0(p0);
}
public static int h302_475(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030675_0(p0);
}
public static int h302_476(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030676_0(p0);
}
public static int h302_477(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030677_0(p0);
}
public static int h302_478(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030678_0(p0);
}
public static int h302_479(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030679_0(p0);
}
public static int h302_480(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030680_0(p0);
}
public static int h302_481(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030681_0(p0);
}
public static int h302_482(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030682_0(p0);
}
public static int h302_483(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030683_0(p0);
}
public static int h302_484(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030684_0(p0);
}
public static int h302_485(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030685_0(p0);
}
public static int h302_486(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030686_0(p0);
}
public static int h302_487(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030687_0(p0);
}
public static int h302_488(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030688_0(p0);
}
public static int h302_489(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030689_0(p0);
}
public static int h302_490(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030690_0(p0);
}
public static int h302_491(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030691_0(p0);
}
public static int h302_492(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030692_0(p0);
}
public static int h302_493(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030693_0(p0);
}
public static int h302_494(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030694_0(p0);
}
public static int h302_495(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030695_0(p0);
}
public static int h302_496(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030696_0(p0);
}
public static int h302_497(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030697_0(p0);
}
public static int h302_498(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030698_0(p0);
}
public static int h302_499(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3030699_0(p0);
}
private static native long __fieldRead302_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call302_1() throws Throwable;
private static native boolean[] __call302_2(moom.Mi a0) throws Throwable;
private static native moom.DT __call302_3(moom.DT a0) throws Throwable;
private static native boolean __call302_4(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native moom.DT __call302_5(moom.DT a0) throws Throwable;
private static native boolean __call302_6(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native moom.DT __call302_7(moom.DT a0) throws Throwable;
private static native boolean __call302_8(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native moom.DT __call302_9(moom.DT a0) throws Throwable;
private static native boolean __call302_10(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native boolean __fieldRead302_11(moom.Jc a0) throws Throwable;
private static native int __integerCategory302_12(boolean value) throws Throwable;
private static native moom.DT __call302_13(moom.DT a0) throws Throwable;
private static native int __integerCategory302_14(boolean value) throws Throwable;
private static native moom.DT __call302_15(moom.DT a0) throws Throwable;
private static native boolean __call302_16(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_17(boolean value) throws Throwable;
private static native boolean __integerCategory302_18(int value) throws Throwable;
private static native int __integerCategory302_19(boolean value) throws Throwable;
private static native moom.DT __call302_20(moom.DT a0) throws Throwable;
private static native boolean __call302_21(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_22(boolean value) throws Throwable;
private static native boolean __integerCategory302_23(int value) throws Throwable;
private static native int __integerCategory302_24(boolean value) throws Throwable;
private static native moom.DT __call302_25(moom.DT a0) throws Throwable;
private static native boolean __call302_26(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_27(boolean value) throws Throwable;
private static native boolean __integerCategory302_28(int value) throws Throwable;
private static native int __integerCategory302_29(boolean value) throws Throwable;
private static native moom.DT __call302_30(moom.DT a0) throws Throwable;
private static native boolean __call302_31(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_32(boolean value) throws Throwable;
private static native boolean __integerCategory302_33(int value) throws Throwable;
private static native moom.DT __call302_34(moom.DT a0) throws Throwable;
private static native boolean __call302_35(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native moom.DT __call302_36(moom.DT a0) throws Throwable;
private static native boolean __call302_37(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native moom.DT __call302_38(moom.DT a0) throws Throwable;
private static native boolean __call302_39(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native moom.DT __call302_40(moom.DT a0) throws Throwable;
private static native boolean __call302_41(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native boolean __fieldRead302_42(moom.Jc a0) throws Throwable;
private static native int __integerCategory302_43(boolean value) throws Throwable;
private static native moom.DT __call302_44(moom.DT a0) throws Throwable;
private static native int __integerCategory302_45(boolean value) throws Throwable;
private static native moom.DT __call302_46(moom.DT a0) throws Throwable;
private static native boolean __call302_47(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_48(boolean value) throws Throwable;
private static native boolean __integerCategory302_49(int value) throws Throwable;
private static native int __integerCategory302_50(boolean value) throws Throwable;
private static native moom.DT __call302_51(moom.DT a0) throws Throwable;
private static native boolean __call302_52(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_53(boolean value) throws Throwable;
private static native boolean __integerCategory302_54(int value) throws Throwable;
private static native int __integerCategory302_55(boolean value) throws Throwable;
private static native moom.DT __call302_56(moom.DT a0) throws Throwable;
private static native boolean __call302_57(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_58(boolean value) throws Throwable;
private static native boolean __integerCategory302_59(int value) throws Throwable;
private static native int __integerCategory302_60(boolean value) throws Throwable;
private static native moom.DT __call302_61(moom.DT a0) throws Throwable;
private static native boolean __call302_62(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_63(boolean value) throws Throwable;
private static native boolean __integerCategory302_64(int value) throws Throwable;
private static native moom.DT __call302_65(moom.DT a0) throws Throwable;
private static native boolean __call302_66(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native moom.DT __call302_67(moom.DT a0) throws Throwable;
private static native boolean __call302_68(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native moom.DT __call302_69(moom.DT a0) throws Throwable;
private static native boolean __call302_70(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native moom.DT __call302_71(moom.DT a0) throws Throwable;
private static native boolean __call302_72(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native boolean __fieldRead302_73(moom.Jc a0) throws Throwable;
private static native int __integerCategory302_74(boolean value) throws Throwable;
private static native moom.DT __call302_75(moom.DT a0) throws Throwable;
private static native int __integerCategory302_76(boolean value) throws Throwable;
private static native moom.DT __call302_77(moom.DT a0) throws Throwable;
private static native boolean __call302_78(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_79(boolean value) throws Throwable;
private static native boolean __integerCategory302_80(int value) throws Throwable;
private static native int __integerCategory302_81(boolean value) throws Throwable;
private static native moom.DT __call302_82(moom.DT a0) throws Throwable;
private static native boolean __call302_83(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_84(boolean value) throws Throwable;
private static native boolean __integerCategory302_85(int value) throws Throwable;
private static native int __integerCategory302_86(boolean value) throws Throwable;
private static native moom.DT __call302_87(moom.DT a0) throws Throwable;
private static native boolean __call302_88(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_89(boolean value) throws Throwable;
private static native boolean __integerCategory302_90(int value) throws Throwable;
private static native int __integerCategory302_91(boolean value) throws Throwable;
private static native moom.DT __call302_92(moom.DT a0) throws Throwable;
private static native boolean __call302_93(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_94(boolean value) throws Throwable;
private static native boolean __integerCategory302_95(int value) throws Throwable;
private static native void __call302_96(int a0, int a1, boolean[] a2) throws Throwable;
private static native void __call302_97(int a0, int a1, boolean[] a2) throws Throwable;
private static native moom.DT __call302_98(moom.DT a0) throws Throwable;
private static native boolean __call302_99(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native moom.DT __call302_100(moom.DT a0) throws Throwable;
private static native boolean __call302_101(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native moom.DT __call302_102(moom.DT a0) throws Throwable;
private static native boolean __call302_103(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native moom.DT __call302_104(moom.DT a0) throws Throwable;
private static native boolean __call302_105(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native boolean __fieldRead302_106(moom.Jc a0) throws Throwable;
private static native int __integerCategory302_107(boolean value) throws Throwable;
private static native moom.DT __call302_108(moom.DT a0) throws Throwable;
private static native int __integerCategory302_109(boolean value) throws Throwable;
private static native moom.DT __call302_110(moom.DT a0) throws Throwable;
private static native boolean __call302_111(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_112(boolean value) throws Throwable;
private static native boolean __integerCategory302_113(int value) throws Throwable;
private static native int __integerCategory302_114(boolean value) throws Throwable;
private static native moom.DT __call302_115(moom.DT a0) throws Throwable;
private static native boolean __call302_116(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_117(boolean value) throws Throwable;
private static native boolean __integerCategory302_118(int value) throws Throwable;
private static native int __integerCategory302_119(boolean value) throws Throwable;
private static native moom.DT __call302_120(moom.DT a0) throws Throwable;
private static native boolean __call302_121(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_122(boolean value) throws Throwable;
private static native boolean __integerCategory302_123(int value) throws Throwable;
private static native int __integerCategory302_124(boolean value) throws Throwable;
private static native moom.DT __call302_125(moom.DT a0) throws Throwable;
private static native boolean __call302_126(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_127(boolean value) throws Throwable;
private static native boolean __integerCategory302_128(int value) throws Throwable;
private static native moom.DT __call302_129(moom.DT a0) throws Throwable;
private static native boolean __call302_130(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native moom.DT __call302_131(moom.DT a0) throws Throwable;
private static native boolean __call302_132(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native moom.DT __call302_133(moom.DT a0) throws Throwable;
private static native boolean __call302_134(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native moom.DT __call302_135(moom.DT a0) throws Throwable;
private static native boolean __call302_136(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native boolean __fieldRead302_137(moom.Jc a0) throws Throwable;
private static native int __integerCategory302_138(boolean value) throws Throwable;
private static native moom.DT __call302_139(moom.DT a0) throws Throwable;
private static native int __integerCategory302_140(boolean value) throws Throwable;
private static native moom.DT __call302_141(moom.DT a0) throws Throwable;
private static native boolean __call302_142(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_143(boolean value) throws Throwable;
private static native boolean __integerCategory302_144(int value) throws Throwable;
private static native int __integerCategory302_145(boolean value) throws Throwable;
private static native moom.DT __call302_146(moom.DT a0) throws Throwable;
private static native boolean __call302_147(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_148(boolean value) throws Throwable;
private static native boolean __integerCategory302_149(int value) throws Throwable;
private static native int __integerCategory302_150(boolean value) throws Throwable;
private static native moom.DT __call302_151(moom.DT a0) throws Throwable;
private static native boolean __call302_152(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_153(boolean value) throws Throwable;
private static native boolean __integerCategory302_154(int value) throws Throwable;
private static native int __integerCategory302_155(boolean value) throws Throwable;
private static native moom.DT __call302_156(moom.DT a0) throws Throwable;
private static native boolean __call302_157(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_158(boolean value) throws Throwable;
private static native boolean __integerCategory302_159(int value) throws Throwable;
private static native moom.DT __call302_160(moom.DT a0) throws Throwable;
private static native boolean __call302_161(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native moom.DT __call302_162(moom.DT a0) throws Throwable;
private static native boolean __call302_163(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native moom.DT __call302_164(moom.DT a0) throws Throwable;
private static native boolean __call302_165(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native moom.DT __call302_166(moom.DT a0) throws Throwable;
private static native boolean __call302_167(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native boolean __fieldRead302_168(moom.Jc a0) throws Throwable;
private static native int __integerCategory302_169(boolean value) throws Throwable;
private static native moom.DT __call302_170(moom.DT a0) throws Throwable;
private static native int __integerCategory302_171(boolean value) throws Throwable;
private static native moom.DT __call302_172(moom.DT a0) throws Throwable;
private static native boolean __call302_173(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_174(boolean value) throws Throwable;
private static native boolean __integerCategory302_175(int value) throws Throwable;
private static native int __integerCategory302_176(boolean value) throws Throwable;
private static native moom.DT __call302_177(moom.DT a0) throws Throwable;
private static native boolean __call302_178(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_179(boolean value) throws Throwable;
private static native boolean __integerCategory302_180(int value) throws Throwable;
private static native int __integerCategory302_181(boolean value) throws Throwable;
private static native moom.DT __call302_182(moom.DT a0) throws Throwable;
private static native boolean __call302_183(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_184(boolean value) throws Throwable;
private static native boolean __integerCategory302_185(int value) throws Throwable;
private static native int __integerCategory302_186(boolean value) throws Throwable;
private static native moom.DT __call302_187(moom.DT a0) throws Throwable;
private static native boolean __call302_188(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_189(boolean value) throws Throwable;
private static native boolean __integerCategory302_190(int value) throws Throwable;
private static native void __call302_191(int a0, int a1, boolean[] a2) throws Throwable;
private static native void __call302_192(int a0, int a1, boolean[] a2) throws Throwable;
private static native int __integerCategory302_193(boolean value) throws Throwable;
private static native int __integerCategory302_194(boolean value) throws Throwable;
private static native int __integerCategory302_195(boolean value) throws Throwable;
private static native int __integerCategory302_196(boolean value) throws Throwable;
private static native int __integerCategory302_197(boolean value) throws Throwable;
private static native int __integerCategory302_198(boolean value) throws Throwable;
private static native int __integerCategory302_199(boolean value) throws Throwable;
private static native int __integerCategory302_200(boolean value) throws Throwable;
private static native int __integerCategory302_201(boolean value) throws Throwable;
private static native int __integerCategory302_202(boolean value) throws Throwable;
private static native int __integerCategory302_203(boolean value) throws Throwable;
private static native int __integerCategory302_204(boolean value) throws Throwable;
private static native int __integerCategory302_205(boolean value) throws Throwable;
private static native int __integerCategory302_206(boolean value) throws Throwable;
private static native int __invokedynamic302_207(int a0, long a1) throws Throwable;
private static native int __integerCategory302_208(boolean value) throws Throwable;
private static native int __integerCategory302_209(boolean value) throws Throwable;
private static native int __integerCategory302_210(boolean value) throws Throwable;
private static native int __integerCategory302_211(boolean value) throws Throwable;
private static native int __invokedynamic302_212(int a0, long a1) throws Throwable;
private static native int __integerCategory302_213(boolean value) throws Throwable;
private static native int __integerCategory302_214(boolean value) throws Throwable;
private static native int __integerCategory302_215(boolean value) throws Throwable;
private static native int __integerCategory302_216(boolean value) throws Throwable;
private static native int __integerCategory302_217(boolean value) throws Throwable;
private static native int __integerCategory302_218(boolean value) throws Throwable;
private static native int __integerCategory302_219(boolean value) throws Throwable;
private static native int __integerCategory302_220(boolean value) throws Throwable;
private static native int __invokedynamic302_221(int a0, long a1) throws Throwable;
private static native int __integerCategory302_222(boolean value) throws Throwable;
private static native int __integerCategory302_223(boolean value) throws Throwable;
private static native int __integerCategory302_224(boolean value) throws Throwable;
private static native int __integerCategory302_225(boolean value) throws Throwable;
private static native int __invokedynamic302_226(int a0, long a1) throws Throwable;
private static native int __integerCategory302_227(boolean value) throws Throwable;
private static native int __integerCategory302_228(boolean value) throws Throwable;
private static native int __integerCategory302_229(boolean value) throws Throwable;
private static native int __integerCategory302_230(boolean value) throws Throwable;
private static native int __invokedynamic302_231(int a0, long a1) throws Throwable;
private static native int __integerCategory302_232(boolean value) throws Throwable;
private static native int __integerCategory302_233(boolean value) throws Throwable;
private static native int __integerCategory302_234(boolean value) throws Throwable;
private static native int __integerCategory302_235(boolean value) throws Throwable;
private static native int __invokedynamic302_236(int a0, long a1) throws Throwable;
private static native int __integerCategory302_237(boolean value) throws Throwable;
private static native int __integerCategory302_238(boolean value) throws Throwable;
private static native int __integerCategory302_239(boolean value) throws Throwable;
private static native int __integerCategory302_240(boolean value) throws Throwable;
private static native int __invokedynamic302_241(int a0, long a1) throws Throwable;
private static native int __integerCategory302_242(boolean value) throws Throwable;
private static native int __integerCategory302_243(boolean value) throws Throwable;
private static native int __integerCategory302_244(boolean value) throws Throwable;
private static native int __integerCategory302_245(boolean value) throws Throwable;
private static native int __invokedynamic302_246(int a0, long a1) throws Throwable;
private static native int __integerCategory302_247(boolean value) throws Throwable;
private static native int __integerCategory302_248(boolean value) throws Throwable;
private static native int __integerCategory302_249(boolean value) throws Throwable;
private static native int __integerCategory302_250(boolean value) throws Throwable;
private static native int __invokedynamic302_251(int a0, long a1) throws Throwable;
private static native int __integerCategory302_252(boolean value) throws Throwable;
private static native int __integerCategory302_253(boolean value) throws Throwable;
private static native int __integerCategory302_254(boolean value) throws Throwable;
private static native int __integerCategory302_255(boolean value) throws Throwable;
private static native int __invokedynamic302_256(int a0, long a1) throws Throwable;
private static native int __integerCategory302_257(boolean value) throws Throwable;
private static native int __integerCategory302_258(boolean value) throws Throwable;
private static native int __integerCategory302_259(boolean value) throws Throwable;
private static native int __integerCategory302_260(boolean value) throws Throwable;
private static native int __invokedynamic302_261(int a0, long a1) throws Throwable;
private static native int __integerCategory302_262(boolean value) throws Throwable;
private static native int __integerCategory302_263(boolean value) throws Throwable;
private static native int __integerCategory302_264(boolean value) throws Throwable;
private static native int __integerCategory302_265(boolean value) throws Throwable;
private static native int __invokedynamic302_266(int a0, long a1) throws Throwable;
private static native boolean __call302_267() throws Throwable;
private static native int __integerCategory302_268(boolean value) throws Throwable;
private static native moom.DT __call302_269(moom.DT a0) throws Throwable;
private static native moom.DT __call302_270(moom.DT a0) throws Throwable;
private static native boolean __call302_271(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_272(boolean value) throws Throwable;
private static native boolean __integerCategory302_273(int value) throws Throwable;
private static native moom.DT __call302_274(moom.DT a0) throws Throwable;
private static native moom.DT __call302_275(moom.DT a0) throws Throwable;
private static native boolean __call302_276(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_277(boolean value) throws Throwable;
private static native boolean __integerCategory302_278(int value) throws Throwable;
private static native moom.DT __call302_279(moom.DT a0) throws Throwable;
private static native moom.DT __call302_280(moom.DT a0) throws Throwable;
private static native boolean __call302_281(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_282(boolean value) throws Throwable;
private static native boolean __integerCategory302_283(int value) throws Throwable;
private static native moom.DT __call302_284(moom.DT a0) throws Throwable;
private static native moom.DT __call302_285(moom.DT a0) throws Throwable;
private static native boolean __call302_286(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_287(boolean value) throws Throwable;
private static native boolean __integerCategory302_288(int value) throws Throwable;
private static native boolean __fieldRead302_289(moom.Jc a0) throws Throwable;
private static native int __integerCategory302_290(boolean value) throws Throwable;
private static native moom.DT __call302_291(moom.DT a0) throws Throwable;
private static native int __integerCategory302_292(boolean value) throws Throwable;
private static native moom.DT __call302_293(moom.DT a0) throws Throwable;
private static native moom.DT __call302_294(moom.DT a0) throws Throwable;
private static native boolean __call302_295(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_296(boolean value) throws Throwable;
private static native boolean __integerCategory302_297(int value) throws Throwable;
private static native int __integerCategory302_298(boolean value) throws Throwable;
private static native moom.DT __call302_299(moom.DT a0) throws Throwable;
private static native moom.DT __call302_300(moom.DT a0) throws Throwable;
private static native boolean __call302_301(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_302(boolean value) throws Throwable;
private static native boolean __integerCategory302_303(int value) throws Throwable;
private static native int __integerCategory302_304(boolean value) throws Throwable;
private static native moom.DT __call302_305(moom.DT a0) throws Throwable;
private static native moom.DT __call302_306(moom.DT a0) throws Throwable;
private static native boolean __call302_307(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_308(boolean value) throws Throwable;
private static native boolean __integerCategory302_309(int value) throws Throwable;
private static native int __integerCategory302_310(boolean value) throws Throwable;
private static native moom.DT __call302_311(moom.DT a0) throws Throwable;
private static native moom.DT __call302_312(moom.DT a0) throws Throwable;
private static native boolean __call302_313(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_314(boolean value) throws Throwable;
private static native boolean __integerCategory302_315(int value) throws Throwable;
private static native moom.DT __call302_316(moom.DT a0) throws Throwable;
private static native moom.DT __call302_317(moom.DT a0) throws Throwable;
private static native boolean __call302_318(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_319(boolean value) throws Throwable;
private static native boolean __integerCategory302_320(int value) throws Throwable;
private static native moom.DT __call302_321(moom.DT a0) throws Throwable;
private static native moom.DT __call302_322(moom.DT a0) throws Throwable;
private static native boolean __call302_323(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_324(boolean value) throws Throwable;
private static native boolean __integerCategory302_325(int value) throws Throwable;
private static native moom.DT __call302_326(moom.DT a0) throws Throwable;
private static native moom.DT __call302_327(moom.DT a0) throws Throwable;
private static native boolean __call302_328(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_329(boolean value) throws Throwable;
private static native boolean __integerCategory302_330(int value) throws Throwable;
private static native moom.DT __call302_331(moom.DT a0) throws Throwable;
private static native moom.DT __call302_332(moom.DT a0) throws Throwable;
private static native boolean __call302_333(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_334(boolean value) throws Throwable;
private static native boolean __integerCategory302_335(int value) throws Throwable;
private static native boolean __fieldRead302_336(moom.Jc a0) throws Throwable;
private static native int __integerCategory302_337(boolean value) throws Throwable;
private static native moom.DT __call302_338(moom.DT a0) throws Throwable;
private static native int __integerCategory302_339(boolean value) throws Throwable;
private static native moom.DT __call302_340(moom.DT a0) throws Throwable;
private static native moom.DT __call302_341(moom.DT a0) throws Throwable;
private static native boolean __call302_342(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_343(boolean value) throws Throwable;
private static native boolean __integerCategory302_344(int value) throws Throwable;
private static native int __integerCategory302_345(boolean value) throws Throwable;
private static native moom.DT __call302_346(moom.DT a0) throws Throwable;
private static native moom.DT __call302_347(moom.DT a0) throws Throwable;
private static native boolean __call302_348(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_349(boolean value) throws Throwable;
private static native boolean __integerCategory302_350(int value) throws Throwable;
private static native int __integerCategory302_351(boolean value) throws Throwable;
private static native moom.DT __call302_352(moom.DT a0) throws Throwable;
private static native moom.DT __call302_353(moom.DT a0) throws Throwable;
private static native boolean __call302_354(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_355(boolean value) throws Throwable;
private static native boolean __integerCategory302_356(int value) throws Throwable;
private static native int __integerCategory302_357(boolean value) throws Throwable;
private static native moom.DT __call302_358(moom.DT a0) throws Throwable;
private static native moom.DT __call302_359(moom.DT a0) throws Throwable;
private static native boolean __call302_360(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_361(boolean value) throws Throwable;
private static native boolean __integerCategory302_362(int value) throws Throwable;
private static native moom.DT __call302_363(moom.DT a0) throws Throwable;
private static native moom.DT __call302_364(moom.DT a0) throws Throwable;
private static native boolean __call302_365(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_366(boolean value) throws Throwable;
private static native boolean __integerCategory302_367(int value) throws Throwable;
private static native moom.DT __call302_368(moom.DT a0) throws Throwable;
private static native moom.DT __call302_369(moom.DT a0) throws Throwable;
private static native boolean __call302_370(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_371(boolean value) throws Throwable;
private static native boolean __integerCategory302_372(int value) throws Throwable;
private static native moom.DT __call302_373(moom.DT a0) throws Throwable;
private static native moom.DT __call302_374(moom.DT a0) throws Throwable;
private static native boolean __call302_375(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_376(boolean value) throws Throwable;
private static native boolean __integerCategory302_377(int value) throws Throwable;
private static native moom.DT __call302_378(moom.DT a0) throws Throwable;
private static native moom.DT __call302_379(moom.DT a0) throws Throwable;
private static native boolean __call302_380(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_381(boolean value) throws Throwable;
private static native boolean __integerCategory302_382(int value) throws Throwable;
private static native boolean __fieldRead302_383(moom.Jc a0) throws Throwable;
private static native int __integerCategory302_384(boolean value) throws Throwable;
private static native moom.DT __call302_385(moom.DT a0) throws Throwable;
private static native int __integerCategory302_386(boolean value) throws Throwable;
private static native moom.DT __call302_387(moom.DT a0) throws Throwable;
private static native moom.DT __call302_388(moom.DT a0) throws Throwable;
private static native boolean __call302_389(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_390(boolean value) throws Throwable;
private static native boolean __integerCategory302_391(int value) throws Throwable;
private static native int __integerCategory302_392(boolean value) throws Throwable;
private static native moom.DT __call302_393(moom.DT a0) throws Throwable;
private static native moom.DT __call302_394(moom.DT a0) throws Throwable;
private static native boolean __call302_395(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_396(boolean value) throws Throwable;
private static native boolean __integerCategory302_397(int value) throws Throwable;
private static native int __integerCategory302_398(boolean value) throws Throwable;
private static native moom.DT __call302_399(moom.DT a0) throws Throwable;
private static native moom.DT __call302_400(moom.DT a0) throws Throwable;
private static native boolean __call302_401(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_402(boolean value) throws Throwable;
private static native boolean __integerCategory302_403(int value) throws Throwable;
private static native int __integerCategory302_404(boolean value) throws Throwable;
private static native moom.DT __call302_405(moom.DT a0) throws Throwable;
private static native moom.DT __call302_406(moom.DT a0) throws Throwable;
private static native boolean __call302_407(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_408(boolean value) throws Throwable;
private static native boolean __integerCategory302_409(int value) throws Throwable;
private static native void __call302_410(int a0, int a1, boolean[] a2) throws Throwable;
private static native void __call302_411(int a0, int a1, boolean[] a2) throws Throwable;
private static native moom.DT __call302_412(moom.DT a0) throws Throwable;
private static native moom.DT __call302_413(moom.DT a0) throws Throwable;
private static native boolean __call302_414(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_415(boolean value) throws Throwable;
private static native boolean __integerCategory302_416(int value) throws Throwable;
private static native moom.DT __call302_417(moom.DT a0) throws Throwable;
private static native moom.DT __call302_418(moom.DT a0) throws Throwable;
private static native boolean __call302_419(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_420(boolean value) throws Throwable;
private static native boolean __integerCategory302_421(int value) throws Throwable;
private static native moom.DT __call302_422(moom.DT a0) throws Throwable;
private static native moom.DT __call302_423(moom.DT a0) throws Throwable;
private static native boolean __call302_424(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_425(boolean value) throws Throwable;
private static native boolean __integerCategory302_426(int value) throws Throwable;
private static native moom.DT __call302_427(moom.DT a0) throws Throwable;
private static native moom.DT __call302_428(moom.DT a0) throws Throwable;
private static native boolean __call302_429(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_430(boolean value) throws Throwable;
private static native boolean __integerCategory302_431(int value) throws Throwable;
private static native boolean __fieldRead302_432(moom.Jc a0) throws Throwable;
private static native int __integerCategory302_433(boolean value) throws Throwable;
private static native moom.DT __call302_434(moom.DT a0) throws Throwable;
private static native int __integerCategory302_435(boolean value) throws Throwable;
private static native moom.DT __call302_436(moom.DT a0) throws Throwable;
private static native moom.DT __call302_437(moom.DT a0) throws Throwable;
private static native boolean __call302_438(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_439(boolean value) throws Throwable;
private static native boolean __integerCategory302_440(int value) throws Throwable;
private static native int __integerCategory302_441(boolean value) throws Throwable;
private static native moom.DT __call302_442(moom.DT a0) throws Throwable;
private static native moom.DT __call302_443(moom.DT a0) throws Throwable;
private static native boolean __call302_444(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_445(boolean value) throws Throwable;
private static native boolean __integerCategory302_446(int value) throws Throwable;
private static native int __integerCategory302_447(boolean value) throws Throwable;
private static native moom.DT __call302_448(moom.DT a0) throws Throwable;
private static native moom.DT __call302_449(moom.DT a0) throws Throwable;
private static native boolean __call302_450(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_451(boolean value) throws Throwable;
private static native boolean __integerCategory302_452(int value) throws Throwable;
private static native int __integerCategory302_453(boolean value) throws Throwable;
private static native moom.DT __call302_454(moom.DT a0) throws Throwable;
private static native moom.DT __call302_455(moom.DT a0) throws Throwable;
private static native boolean __call302_456(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_457(boolean value) throws Throwable;
private static native boolean __integerCategory302_458(int value) throws Throwable;
private static native moom.DT __call302_459(moom.DT a0) throws Throwable;
private static native moom.DT __call302_460(moom.DT a0) throws Throwable;
private static native boolean __call302_461(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_462(boolean value) throws Throwable;
private static native boolean __integerCategory302_463(int value) throws Throwable;
private static native moom.DT __call302_464(moom.DT a0) throws Throwable;
private static native moom.DT __call302_465(moom.DT a0) throws Throwable;
private static native boolean __call302_466(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_467(boolean value) throws Throwable;
private static native boolean __integerCategory302_468(int value) throws Throwable;
private static native moom.DT __call302_469(moom.DT a0) throws Throwable;
private static native moom.DT __call302_470(moom.DT a0) throws Throwable;
private static native boolean __call302_471(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_472(boolean value) throws Throwable;
private static native boolean __integerCategory302_473(int value) throws Throwable;
private static native moom.DT __call302_474(moom.DT a0) throws Throwable;
private static native moom.DT __call302_475(moom.DT a0) throws Throwable;
private static native boolean __call302_476(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_477(boolean value) throws Throwable;
private static native boolean __integerCategory302_478(int value) throws Throwable;
private static native boolean __fieldRead302_479(moom.Jc a0) throws Throwable;
private static native int __integerCategory302_480(boolean value) throws Throwable;
private static native moom.DT __call302_481(moom.DT a0) throws Throwable;
private static native int __integerCategory302_482(boolean value) throws Throwable;
private static native moom.DT __call302_483(moom.DT a0) throws Throwable;
private static native moom.DT __call302_484(moom.DT a0) throws Throwable;
private static native boolean __call302_485(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_486(boolean value) throws Throwable;
private static native boolean __integerCategory302_487(int value) throws Throwable;
private static native int __integerCategory302_488(boolean value) throws Throwable;
private static native moom.DT __call302_489(moom.DT a0) throws Throwable;
private static native moom.DT __call302_490(moom.DT a0) throws Throwable;
private static native boolean __call302_491(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_492(boolean value) throws Throwable;
private static native boolean __integerCategory302_493(int value) throws Throwable;
private static native int __integerCategory302_494(boolean value) throws Throwable;
private static native moom.DT __call302_495(moom.DT a0) throws Throwable;
private static native moom.DT __call302_496(moom.DT a0) throws Throwable;
private static native boolean __call302_497(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_498(boolean value) throws Throwable;
private static native boolean __integerCategory302_499(int value) throws Throwable;
private static native int __integerCategory302_500(boolean value) throws Throwable;
private static native moom.DT __call302_501(moom.DT a0) throws Throwable;
private static native moom.DT __call302_502(moom.DT a0) throws Throwable;
private static native boolean __call302_503(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_504(boolean value) throws Throwable;
private static native boolean __integerCategory302_505(int value) throws Throwable;
private static native moom.DT __call302_506(moom.DT a0) throws Throwable;
private static native moom.DT __call302_507(moom.DT a0) throws Throwable;
private static native boolean __call302_508(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_509(boolean value) throws Throwable;
private static native boolean __integerCategory302_510(int value) throws Throwable;
private static native moom.DT __call302_511(moom.DT a0) throws Throwable;
private static native moom.DT __call302_512(moom.DT a0) throws Throwable;
private static native boolean __call302_513(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_514(boolean value) throws Throwable;
private static native boolean __integerCategory302_515(int value) throws Throwable;
private static native moom.DT __call302_516(moom.DT a0) throws Throwable;
private static native moom.DT __call302_517(moom.DT a0) throws Throwable;
private static native boolean __call302_518(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_519(boolean value) throws Throwable;
private static native boolean __integerCategory302_520(int value) throws Throwable;
private static native moom.DT __call302_521(moom.DT a0) throws Throwable;
private static native moom.DT __call302_522(moom.DT a0) throws Throwable;
private static native boolean __call302_523(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_524(boolean value) throws Throwable;
private static native boolean __integerCategory302_525(int value) throws Throwable;
private static native boolean __fieldRead302_526(moom.Jc a0) throws Throwable;
private static native int __integerCategory302_527(boolean value) throws Throwable;
private static native moom.DT __call302_528(moom.DT a0) throws Throwable;
private static native int __integerCategory302_529(boolean value) throws Throwable;
private static native moom.DT __call302_530(moom.DT a0) throws Throwable;
private static native moom.DT __call302_531(moom.DT a0) throws Throwable;
private static native boolean __call302_532(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_533(boolean value) throws Throwable;
private static native boolean __integerCategory302_534(int value) throws Throwable;
private static native int __integerCategory302_535(boolean value) throws Throwable;
private static native moom.DT __call302_536(moom.DT a0) throws Throwable;
private static native moom.DT __call302_537(moom.DT a0) throws Throwable;
private static native boolean __call302_538(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_539(boolean value) throws Throwable;
private static native boolean __integerCategory302_540(int value) throws Throwable;
private static native int __integerCategory302_541(boolean value) throws Throwable;
private static native moom.DT __call302_542(moom.DT a0) throws Throwable;
private static native moom.DT __call302_543(moom.DT a0) throws Throwable;
private static native boolean __call302_544(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_545(boolean value) throws Throwable;
private static native boolean __integerCategory302_546(int value) throws Throwable;
private static native int __integerCategory302_547(boolean value) throws Throwable;
private static native moom.DT __call302_548(moom.DT a0) throws Throwable;
private static native moom.DT __call302_549(moom.DT a0) throws Throwable;
private static native boolean __call302_550(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory302_551(boolean value) throws Throwable;
private static native boolean __integerCategory302_552(int value) throws Throwable;
private static native void __call302_553(int a0, int a1, boolean[] a2) throws Throwable;
private static native void __call302_554(int a0, int a1, boolean[] a2) throws Throwable;
private static native int __invokedynamic302_555(int a0, long a1) throws Throwable;
private static native int __integerCategory302_556(boolean value) throws Throwable;
private static native int __invokedynamic302_557(int a0, long a1) throws Throwable;
private static native int __integerCategory302_558(boolean value) throws Throwable;
private static native int __invokedynamic302_559(int a0, long a1) throws Throwable;
private static native int __integerCategory302_560(boolean value) throws Throwable;
private static native int __invokedynamic302_561(int a0, long a1) throws Throwable;
private static native int __invokedynamic302_562(int a0, long a1) throws Throwable;
private static native int __integerCategory302_563(boolean value) throws Throwable;
private static native int __invokedynamic302_564(int a0, long a1) throws Throwable;
private static native int __invokedynamic302_565(int a0, long a1) throws Throwable;
private static native int __integerCategory302_566(boolean value) throws Throwable;
private static native int __integerCategory302_567(boolean value) throws Throwable;
private static native int __invokedynamic302_568(int a0, long a1) throws Throwable;
private static native int __invokedynamic302_569(int a0, long a1) throws Throwable;
private static native int __integerCategory302_570(boolean value) throws Throwable;
private static native int __integerCategory302_571(boolean value) throws Throwable;
private static native int __invokedynamic302_572(int a0, long a1) throws Throwable;
private static native int __invokedynamic302_573(int a0, long a1) throws Throwable;
private static native int __integerCategory302_574(boolean value) throws Throwable;
private static native int __integerCategory302_575(boolean value) throws Throwable;
private static native int __invokedynamic302_576(int a0, long a1) throws Throwable;
private static native int __invokedynamic302_577(int a0, long a1) throws Throwable;
private static native int __integerCategory302_578(boolean value) throws Throwable;
private static native int __integerCategory302_579(boolean value) throws Throwable;
private static native int __invokedynamic302_580(int a0, long a1) throws Throwable;
private static native int __invokedynamic302_581(int a0, long a1) throws Throwable;
private static native int __integerCategory302_582(boolean value) throws Throwable;
private static native int __integerCategory302_583(boolean value) throws Throwable;
private static native int __invokedynamic302_584(int a0, long a1) throws Throwable;
private static native int __invokedynamic302_585(int a0, long a1) throws Throwable;
private static native int __integerCategory302_586(boolean value) throws Throwable;
private static native int __integerCategory302_587(boolean value) throws Throwable;
private static native int __invokedynamic302_588(int a0, long a1) throws Throwable;
private static native int __invokedynamic302_589(int a0, long a1) throws Throwable;
private static native int __integerCategory302_590(boolean value) throws Throwable;
private static native int __integerCategory302_591(boolean value) throws Throwable;
private static native int __invokedynamic302_592(int a0, long a1) throws Throwable;
private static native int __invokedynamic302_593(int a0, long a1) throws Throwable;
private static native int __integerCategory302_594(boolean value) throws Throwable;
private static native int __integerCategory302_595(boolean value) throws Throwable;
private static native int __invokedynamic302_596(int a0, long a1) throws Throwable;
private static native int __invokedynamic302_597(int a0, long a1) throws Throwable;
private static native int __integerCategory302_598(boolean value) throws Throwable;
private static native int __integerCategory302_599(boolean value) throws Throwable;
private static native int __invokedynamic302_600(int a0, long a1) throws Throwable;
private static native int __invokedynamic302_601(int a0, long a1) throws Throwable;
private static native int __integerCategory302_602(boolean value) throws Throwable;
private static native int __integerCategory302_603(boolean value) throws Throwable;
private static native int __invokedynamic302_604(int a0, long a1) throws Throwable;
private static native int __invokedynamic302_605(int a0, long a1) throws Throwable;
private static native int __integerCategory302_606(boolean value) throws Throwable;
private static native int __integerCategory302_607(boolean value) throws Throwable;
private static native int __invokedynamic302_608(int a0, long a1) throws Throwable;
private static native int __invokedynamic302_609(int a0, long a1) throws Throwable;
private static native int __integerCategory302_610(boolean value) throws Throwable;
private static native int __integerCategory302_611(boolean value) throws Throwable;
private static native int __invokedynamic302_612(int a0, long a1) throws Throwable;
private static native int __invokedynamic302_613(int a0, long a1) throws Throwable;
private static native int __integerCategory302_614(boolean value) throws Throwable;
private static native int __integerCategory302_615(boolean value) throws Throwable;
private static native int __integerCategory302_616(boolean value) throws Throwable;
private static native int __integerCategory302_617(boolean value) throws Throwable;
private static native int __invokedynamic302_618(int a0, long a1) throws Throwable;
private static native int __invokedynamic302_619(int a0, long a1) throws Throwable;
private static native int __integerCategory302_620(boolean value) throws Throwable;
private static native int __integerCategory302_621(boolean value) throws Throwable;
private static native int __integerCategory302_622(boolean value) throws Throwable;
private static native int __integerCategory302_623(boolean value) throws Throwable;
private static native int __invokedynamic302_624(int a0, long a1) throws Throwable;
private static native int __invokedynamic302_625(int a0, long a1) throws Throwable;
private static native int __integerCategory302_626(boolean value) throws Throwable;
private static native int __integerCategory302_627(boolean value) throws Throwable;
private static native int __integerCategory302_628(boolean value) throws Throwable;
private static native int __integerCategory302_629(boolean value) throws Throwable;
private static native int __invokedynamic302_630(int a0, long a1) throws Throwable;
private static native int __invokedynamic302_631(int a0, long a1) throws Throwable;
private static native int __integerCategory302_632(boolean value) throws Throwable;
private static native int __integerCategory302_633(boolean value) throws Throwable;
private static native int __integerCategory302_634(boolean value) throws Throwable;
private static native int __integerCategory302_635(boolean value) throws Throwable;
private static native int __invokedynamic302_636(int a0, long a1) throws Throwable;
private static native int __invokedynamic302_637(int a0, long a1) throws Throwable;
private static native int __integerCategory302_638(boolean value) throws Throwable;
private static native int __integerCategory302_639(boolean value) throws Throwable;
private static native int __integerCategory302_640(boolean value) throws Throwable;
private static native int __integerCategory302_641(boolean value) throws Throwable;
private static native int __invokedynamic302_642(int a0, long a1) throws Throwable;
private static native int __invokedynamic302_643(int a0, long a1) throws Throwable;
private static native int __integerCategory302_644(boolean value) throws Throwable;
private static native int __integerCategory302_645(boolean value) throws Throwable;
private static native int __integerCategory302_646(boolean value) throws Throwable;
private static native int __integerCategory302_647(boolean value) throws Throwable;
private static native int __invokedynamic302_648(int a0, long a1) throws Throwable;
private static native int __invokedynamic302_649(int a0, long a1) throws Throwable;
private static native int __integerCategory302_650(boolean value) throws Throwable;
private static native int __integerCategory302_651(boolean value) throws Throwable;
private static native int __integerCategory302_652(boolean value) throws Throwable;
private static native int __integerCategory302_653(boolean value) throws Throwable;
private static native int __invokedynamic302_654(int a0, long a1) throws Throwable;
private static native int __invokedynamic302_655(int a0, long a1) throws Throwable;
private static native int __integerCategory302_656(boolean value) throws Throwable;
private static native int __integerCategory302_657(boolean value) throws Throwable;
private static native int __integerCategory302_658(boolean value) throws Throwable;
private static native int __integerCategory302_659(boolean value) throws Throwable;
private static native int __invokedynamic302_660(int a0, long a1) throws Throwable;
private static native int __invokedynamic302_661(int a0, long a1) throws Throwable;
private static native int __integerCategory302_662(boolean value) throws Throwable;
private static native int __integerCategory302_663(boolean value) throws Throwable;
private static native int __integerCategory302_664(boolean value) throws Throwable;
private static native int __integerCategory302_665(boolean value) throws Throwable;
private static native int __invokedynamic302_666(int a0, long a1) throws Throwable;
private static native int __invokedynamic302_667(int a0, long a1) throws Throwable;
private static native int __integerCategory302_668(boolean value) throws Throwable;
private static native int __integerCategory302_669(boolean value) throws Throwable;
private static native int __integerCategory302_670(boolean value) throws Throwable;
private static native int __integerCategory302_671(boolean value) throws Throwable;
private static native int __invokedynamic302_672(int a0, long a1) throws Throwable;
private static native int __invokedynamic302_673(int a0, long a1) throws Throwable;
private static native int __integerCategory302_674(boolean value) throws Throwable;
private static native int __integerCategory302_675(boolean value) throws Throwable;
private static native int __integerCategory302_676(boolean value) throws Throwable;
private static native int __integerCategory302_677(boolean value) throws Throwable;
private static native int __invokedynamic302_678(int a0, long a1) throws Throwable;
private static native int __invokedynamic302_679(int a0, long a1) throws Throwable;
private static native int __integerCategory302_680(boolean value) throws Throwable;
private static native int __integerCategory302_681(boolean value) throws Throwable;
private static native int __integerCategory302_682(boolean value) throws Throwable;
private static native int __integerCategory302_683(boolean value) throws Throwable;
private static native int __invokedynamic302_684(int a0, long a1) throws Throwable;
private static native int __invokedynamic302_685(int a0, long a1) throws Throwable;
private static native int __integerCategory302_686(boolean value) throws Throwable;
private static native int __integerCategory302_687(boolean value) throws Throwable;
private static native int __integerCategory302_688(boolean value) throws Throwable;
private static native int __integerCategory302_689(boolean value) throws Throwable;
private static native int __invokedynamic302_690(int a0, long a1) throws Throwable;
private static native int __invokedynamic302_691(int a0, long a1) throws Throwable;
private static native int __integerCategory302_692(boolean value) throws Throwable;
private static native int __integerCategory302_693(boolean value) throws Throwable;
private static native int __integerCategory302_694(boolean value) throws Throwable;
private static native int __integerCategory302_695(boolean value) throws Throwable;
private static native int __invokedynamic302_696(int a0, long a1) throws Throwable;
private static native int __invokedynamic302_697(int a0, long a1) throws Throwable;
private static native int __integerCategory302_698(boolean value) throws Throwable;
private static native int __integerCategory302_699(boolean value) throws Throwable;
private static native int __integerCategory302_700(boolean value) throws Throwable;
private static native int __integerCategory302_701(boolean value) throws Throwable;
private static native int __invokedynamic302_702(int a0, long a1) throws Throwable;
private static native java.lang.Exception __call3030200_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030201_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030202_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030203_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030204_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030205_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030206_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030207_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030208_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030209_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030210_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030211_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030212_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030213_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030214_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030215_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030216_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030217_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030218_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030219_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030220_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030221_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030222_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030223_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030224_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030225_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030226_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030227_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030228_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030229_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030230_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030231_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030232_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030233_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030234_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030235_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030236_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030237_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030238_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030239_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030240_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030241_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030242_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030243_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030244_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030245_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030246_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030247_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030248_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030249_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030250_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030251_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030252_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030253_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030254_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030255_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030256_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030257_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030258_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030259_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030260_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030261_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030262_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030263_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030264_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030265_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030266_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030267_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030268_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030269_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030270_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030271_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030272_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030273_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030274_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030275_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030276_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030277_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030278_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030279_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030280_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030281_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030282_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030283_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030284_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030285_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030286_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030287_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030288_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030289_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030290_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030291_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030292_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030293_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030294_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030295_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030296_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030297_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030298_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030299_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030300_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030301_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030302_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030303_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030304_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030305_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030306_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030307_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030308_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030309_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030310_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030311_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030312_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030313_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030314_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030315_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030316_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030317_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030318_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030319_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030320_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030321_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030322_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030323_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030324_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030325_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030326_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030327_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030328_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030329_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030330_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030331_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030332_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030333_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030334_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030335_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030336_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030337_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030338_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030339_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030340_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030341_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030342_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030343_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030344_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030345_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030346_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030347_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030348_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030349_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030350_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030351_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030352_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030353_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030354_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030355_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030356_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030357_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030358_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030359_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030360_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030361_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030362_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030363_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030364_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030365_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030366_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030367_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030368_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030369_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030370_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030371_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030372_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030373_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030374_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030375_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030376_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030377_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030378_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030379_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030380_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030381_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030382_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030383_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030384_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030385_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030386_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030387_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030388_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030389_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030390_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030391_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030392_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030393_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030394_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030395_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030396_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030397_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030398_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030399_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030400_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030401_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030402_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030403_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030404_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030405_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030406_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030407_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030408_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030409_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030410_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030411_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030412_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030413_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030414_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030415_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030416_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030417_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030418_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030419_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030420_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030421_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030422_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030423_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030424_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030425_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030426_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030427_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030428_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030429_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030430_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030431_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030432_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030433_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030434_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030435_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030436_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030437_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030438_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030439_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030440_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030441_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030442_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030443_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030444_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030445_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030446_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030447_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030448_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030449_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030450_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030451_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030452_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030453_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030454_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030455_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030456_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030457_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030458_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030459_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030460_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030461_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030462_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030463_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030464_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030465_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030466_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030467_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030468_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030469_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030470_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030471_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030472_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030473_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030474_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030475_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030476_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030477_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030478_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030479_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030480_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030481_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030482_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030483_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030484_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030485_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030486_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030487_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030488_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030489_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030490_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030491_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030492_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030493_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030494_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030495_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030496_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030497_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030498_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030499_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030500_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030501_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030502_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030503_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030504_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030505_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030506_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030507_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030508_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030509_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030510_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030511_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030512_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030513_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030514_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030515_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030516_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030517_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030518_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030519_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030520_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030521_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030522_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030523_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030524_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030525_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030526_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030527_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030528_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030529_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030530_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030531_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030532_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030533_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030534_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030535_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030536_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030537_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030538_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030539_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030540_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030541_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030542_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030543_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030544_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030545_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030546_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030547_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030548_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030549_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030550_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030551_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030552_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030553_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030554_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030555_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030556_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030557_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030558_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030559_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030560_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030561_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030562_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030563_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030564_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030565_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030566_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030567_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030568_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030569_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030570_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030571_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030572_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030573_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030574_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030575_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030576_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030577_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030578_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030579_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030580_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030581_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030582_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030583_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030584_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030585_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030586_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030587_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030588_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030589_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030590_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030591_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030592_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030593_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030594_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030595_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030596_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030597_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030598_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030599_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030600_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030601_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030602_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030603_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030604_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030605_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030606_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030607_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030608_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030609_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030610_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030611_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030612_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030613_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030614_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030615_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030616_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030617_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030618_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030619_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030620_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030621_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030622_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030623_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030624_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030625_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030626_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030627_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030628_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030629_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030630_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030631_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030632_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030633_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030634_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030635_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030636_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030637_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030638_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030639_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030640_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030641_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030642_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030643_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030644_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030645_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030646_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030647_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030648_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030649_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030650_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030651_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030652_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030653_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030654_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030655_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030656_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030657_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030658_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030659_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030660_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030661_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030662_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030663_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030664_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030665_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030666_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030667_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030668_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030669_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030670_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030671_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030672_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030673_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030674_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030675_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030676_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030677_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030678_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030679_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030680_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030681_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030682_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030683_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030684_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030685_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030686_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030687_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030688_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030689_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030690_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030691_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030692_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030693_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030694_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030695_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030696_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030697_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030698_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3030699_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_9b2d9edd35a5fb266018(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws E;
private static final class __SourceHandler_9b2d9edd35a5fb266018 {

public static boolean f686(moom.Jc p0, net.minecraft.world.IBlockAccess p1, net.minecraft.block.state.IBlockState p2, moom.DT p3, int p4, net.minecraft.client.renderer.texture.TextureAtlasSprite p5, int p6) throws Throwable {
    int forwardValue686_16_0;
    int forwardValue686_36_0;
    moom.Jc forwardValue686_38_0;
    net.minecraft.world.IBlockAccess forwardValue686_57_0;
    int forwardValue686_70_0;
    int forwardValue686_87_0;
    int forwardValue686_91_0;
    int forwardValue686_93_0;
    net.minecraft.entity.Entity[] spill686_0;
    boolean spill686_1;
    moom.Jc spill686_2;
    boolean spill686_3;
    net.minecraft.world.IBlockAccess spill686_4;
    boolean spill686_5;
    long life7_3;
    net.minecraft.block.state.IBlockState life10_8;
    net.minecraft.entity.Entity[] life9_9;
    moom.fB life11_30;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life11_60;
    net.minecraft.block.state.IBlockState life11_76;
    forward_join_93: {
    forward_join_92: {
    forward_join_91: {
    forward_join_87: {
    forward_join_78: {
    forward_join_70: {
    forward_join_57: {
    forward_join_56: {
    forward_join_38: {
    forward_join_37: {
    forward_join_36: {
    forward_join_17: {
    forward_join_16: {
    life7_3 = (__fieldRead686_0() ^ 115289936841866L);
    spill686_0 = __call686_1();
    life10_8 = __call686_2(p1, p3);
    life9_9 = spill686_0;
    spill686_1 = __call686_3(life10_8);
    if (!((life9_9 != null))) {
        forwardValue686_16_0 = __integerCategory686_4(spill686_1);
        break forward_join_16;
    }
    if (!((!spill686_1))) {
        break forward_join_17;
    }
    forwardValue686_16_0 = 0;
    }
    return __integerCategory686_5(forwardValue686_16_0);
    }
    spill686_2 = p0;
    if (!((life9_9 != null))) {
        forwardValue686_38_0 = spill686_2;
        break forward_join_38;
    }
    if (!((__fieldRead686_6(spill686_2) != null))) {
        break forward_join_37;
    }
    life11_30 = __cast686_7(life10_8);
    spill686_3 = __call686_11(__call686_8(life11_30), __call686_9(life11_30), __fieldRead686_10(p0));
    if (!((life9_9 != null))) {
        forwardValue686_36_0 = __integerCategory686_12(spill686_3);
        break forward_join_36;
    }
    if (!((!spill686_3))) {
        break forward_join_37;
    }
    forwardValue686_36_0 = 0;
    }
    return __integerCategory686_13(forwardValue686_36_0);
    }
    forwardValue686_38_0 = p0;
    }
    if (!((__fieldRead686_14(forwardValue686_38_0) != null))) {
        break forward_join_56;
    }
    spill686_4 = p1;
    if (!((life9_9 != null))) {
        forwardValue686_57_0 = spill686_4;
        break forward_join_57;
    }
    life11_60 = __call686_15(spill686_4, p2, p3, life10_8, p4);
    if (!((!__call686_17(life11_60, __fieldRead686_16(p0))))) {
        break forward_join_56;
    }
    return __integerCategory686_18(0);
    }
    forwardValue686_57_0 = p1;
    }
    life11_76 = __call686_21(forwardValue686_57_0, __call686_20(p3, __call686_19(p4)));
    spill686_5 = __call686_23(__call686_22(life11_76));
    if (!((life9_9 != null))) {
        forwardValue686_70_0 = __integerCategory686_24(spill686_5);
        break forward_join_70;
    }
    if (!((!spill686_5))) {
        break forward_join_92;
    }
    forwardValue686_70_0 = p4;
    }
    if (!((life9_9 != null))) {
        forwardValue686_87_0 = forwardValue686_70_0;
        break forward_join_87;
    }
    if (!((forwardValue686_70_0 == 1))) {
        break forward_join_78;
    }
    if (!((__call686_25(life11_76) != __fieldRead686_26()))) {
        break forward_join_92;
    }
    }
    forwardValue686_87_0 = __integerCategory686_28(__call686_27(p0, p1, p2, p3, life10_8, p4, p5, p6));
    }
    if (!((life9_9 != null))) {
        forwardValue686_91_0 = forwardValue686_87_0;
        break forward_join_91;
    }
    if (!((forwardValue686_87_0 == 0))) {
        break forward_join_92;
    }
    forwardValue686_91_0 = 1;
    }
    forwardValue686_93_0 = forwardValue686_91_0;
    break forward_join_93;
    }
    forwardValue686_93_0 = 0;
    }
    return __integerCategory686_29(forwardValue686_93_0);
}
public static void h686_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068600_0(p0);
}
public static void h686_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068601_0(p0);
}
public static void h686_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068602_0(p0);
}
public static void h686_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068603_0(p0);
}
public static void h686_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068604_0(p0);
}
public static void h686_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068605_0(p0);
}
public static void h686_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068606_0(p0);
}
public static void h686_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068607_0(p0);
}
public static void h686_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068608_0(p0);
}
public static void h686_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068609_0(p0);
}
private static native long __fieldRead686_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call686_1() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call686_2(net.minecraft.world.IBlockAccess a0, moom.DT a1) throws Throwable;
private static native boolean __call686_3(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __integerCategory686_4(boolean value) throws Throwable;
private static native boolean __integerCategory686_5(int value) throws Throwable;
private static native moom.J_[] __fieldRead686_6(moom.Jc a0) throws Throwable;
private static native moom.fB __cast686_7(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __call686_8(moom.fB a0) throws Throwable;
private static native int __call686_9(moom.fB a0) throws Throwable;
private static native moom.J_[] __fieldRead686_10(moom.Jc a0) throws Throwable;
private static native boolean __call686_11(int a0, int a1, moom.J_[] a2) throws Throwable;
private static native int __integerCategory686_12(boolean value) throws Throwable;
private static native boolean __integerCategory686_13(int value) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead686_14(moom.Jc a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call686_15(net.minecraft.world.IBlockAccess a0, net.minecraft.block.state.IBlockState a1, moom.DT a2, net.minecraft.block.state.IBlockState a3, int a4) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead686_16(moom.Jc a0) throws Throwable;
private static native boolean __call686_17(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, net.minecraft.client.renderer.texture.TextureAtlasSprite[] a1) throws Throwable;
private static native boolean __integerCategory686_18(int value) throws Throwable;
private static native moom.bs __call686_19(int a0) throws Throwable;
private static native moom.DT __call686_20(moom.DT a0, moom.bs a1) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call686_21(net.minecraft.world.IBlockAccess a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call686_22(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native boolean __call686_23(net.minecraft.block.Block a0) throws Throwable;
private static native int __integerCategory686_24(boolean value) throws Throwable;
private static native net.minecraft.block.Block __call686_25(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead686_26() throws Throwable;
private static native boolean __call686_27(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, net.minecraft.block.state.IBlockState a4, int a5, net.minecraft.client.renderer.texture.TextureAtlasSprite a6, int a7) throws Throwable;
private static native int __integerCategory686_28(boolean value) throws Throwable;
private static native boolean __integerCategory686_29(int value) throws Throwable;
private static native java.lang.Exception __call1068600_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068601_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068602_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068603_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068604_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068605_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068606_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068607_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068608_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068609_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_e56d0a397f4d6c84c835(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, net.minecraft.block.state.IBlockState a4, int a5, net.minecraft.client.renderer.texture.TextureAtlasSprite a6, int a7) throws E;
private static final class __SourceHandler_e56d0a397f4d6c84c835 {

public static boolean f687(moom.Jc p0, net.minecraft.world.IBlockAccess p1, net.minecraft.block.state.IBlockState p2, moom.DT p3, net.minecraft.block.state.IBlockState p4, int p5, net.minecraft.client.renderer.texture.TextureAtlasSprite p6, int p7) throws Throwable {
    net.minecraft.block.state.IBlockState forwardValue687_24_0;
    int forwardValue687_41_0;
    int forwardValue687_47_0;
    int forwardValue687_47_1;
    net.minecraft.block.state.IBlockState forwardValue687_53_0;
    net.minecraft.block.state.IBlockState forwardValue687_58_0;
    int forwardValue687_67_0;
    int forwardValue687_70_0;
    int forwardValue687_79_0;
    int forwardValue687_96_0;
    int forwardValue687_98_0;
    int spill687_0;
    int spill687_1;
    net.minecraft.block.state.IBlockState spill687_2;
    int spill687_3;
    net.minecraft.block.state.IBlockState spill687_4;
    int spill687_5;
    long life8_3;
    net.minecraft.entity.Entity[] life10_5;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life12_49;
    moom.fB life11_112;
    net.minecraft.block.Block life12_122;
    int life13_125;
    forward_join_98: {
    forward_join_97: {
    forward_join_96: {
    forward_join_80: {
    forward_join_79: {
    forward_join_78: {
    forward_join_70: {
    forward_join_68: {
    forward_join_67: {
    forward_join_66: {
    forward_join_58: {
    forward_join_53: {
    forward_join_47: {
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    forward_join_28: {
    forward_join_24: {
    forward_join_23: {
    forward_join_11: {
    life8_3 = (__fieldRead687_0() ^ 30639713635954L);
    life10_5 = __call687_1();
    if (!((p2 == p4))) {
        break forward_join_11;
    }
    return __integerCategory687_2(1);
    }
    spill687_0 = __fieldRead687_3(p0);
    spill687_1 = 2;
    if (!((life10_5 != null))) {
        forwardValue687_47_0 = spill687_0;
        forwardValue687_47_1 = spill687_1;
        break forward_join_47;
    }
    if (!((spill687_0 == spill687_1))) {
        break forward_join_42;
    }
    spill687_2 = p4;
    if (!((life10_5 != null))) {
        forwardValue687_24_0 = spill687_2;
        break forward_join_24;
    }
    if (!((spill687_2 == null))) {
        break forward_join_23;
    }
    return __integerCategory687_4(0);
    }
    forwardValue687_24_0 = p4;
    }
    if (!((forwardValue687_24_0 == __fieldRead687_5()))) {
        break forward_join_28;
    }
    return __integerCategory687_6(0);
    }
    life12_49 = __call687_7(p1, p2, p3, p4, p5);
    if (!((life12_49 == p6))) {
        break forward_join_40;
    }
    forwardValue687_41_0 = 1;
    break forward_join_41;
    }
    forwardValue687_41_0 = 0;
    }
    return __integerCategory687_8(forwardValue687_41_0);
    }
    spill687_3 = __fieldRead687_9(p0);
    if (!((life10_5 != null))) {
        forwardValue687_70_0 = spill687_3;
        break forward_join_70;
    }
    forwardValue687_47_0 = spill687_3;
    forwardValue687_47_1 = 3;
    }
    if (!((forwardValue687_47_0 == forwardValue687_47_1))) {
        break forward_join_68;
    }
    spill687_4 = p4;
    if (!((life10_5 != null))) {
        forwardValue687_53_0 = spill687_4;
        break forward_join_53;
    }
    if (!((spill687_4 != null))) {
        break forward_join_66;
    }
    forwardValue687_53_0 = p4;
    }
    if (!((life10_5 != null))) {
        forwardValue687_58_0 = forwardValue687_53_0;
        break forward_join_58;
    }
    if (!((forwardValue687_53_0 != __fieldRead687_10()))) {
        break forward_join_66;
    }
    forwardValue687_58_0 = p4;
    }
    if (!((__call687_12(__call687_11(forwardValue687_58_0)) == __call687_14(__call687_13(p2))))) {
        break forward_join_66;
    }
    forwardValue687_67_0 = 1;
    break forward_join_67;
    }
    forwardValue687_67_0 = 0;
    }
    return __integerCategory687_15(forwardValue687_67_0);
    }
    forwardValue687_70_0 = __instanceOf687_16(p4);
    }
    if (!((life10_5 != null))) {
        forwardValue687_79_0 = forwardValue687_70_0;
        break forward_join_79;
    }
    if (!((forwardValue687_70_0 != 0))) {
        break forward_join_78;
    }
    life11_112 = __cast687_17(p4);
    if (!((life10_5 == null))) {
        break forward_join_80;
    }
    }
    forwardValue687_79_0 = 0;
    }
    return __integerCategory687_18(forwardValue687_79_0);
    }
    life12_122 = __call687_19(life11_112);
    life13_125 = __call687_20(life11_112);
    if (!((life12_122 == __call687_21(p2)))) {
        break forward_join_97;
    }
    spill687_5 = life13_125;
    if (!((life10_5 != null))) {
        forwardValue687_96_0 = spill687_5;
        break forward_join_96;
    }
    if (!((spill687_5 == p7))) {
        break forward_join_97;
    }
    forwardValue687_96_0 = 1;
    }
    forwardValue687_98_0 = forwardValue687_96_0;
    break forward_join_98;
    }
    forwardValue687_98_0 = 0;
    }
    return __integerCategory687_22(forwardValue687_98_0);
}
public static void h687_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068700_0(p0);
}
public static void h687_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068701_0(p0);
}
public static void h687_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068702_0(p0);
}
public static void h687_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068703_0(p0);
}
public static void h687_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068704_0(p0);
}
public static void h687_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068705_0(p0);
}
public static void h687_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068706_0(p0);
}
public static void h687_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068707_0(p0);
}
public static void h687_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068708_0(p0);
}
public static void h687_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068709_0(p0);
}
public static void h687_10(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068710_0(p0);
}
public static void h687_11(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068711_0(p0);
}
public static void h687_12(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068712_0(p0);
}
public static void h687_13(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068713_0(p0);
}
public static void h687_14(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068714_0(p0);
}
public static void h687_15(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068715_0(p0);
}
public static void h687_16(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068716_0(p0);
}
public static void h687_17(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068717_0(p0);
}
private static native long __fieldRead687_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call687_1() throws Throwable;
private static native boolean __integerCategory687_2(int value) throws Throwable;
private static native int __fieldRead687_3(moom.Jc a0) throws Throwable;
private static native boolean __integerCategory687_4(int value) throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead687_5() throws Throwable;
private static native boolean __integerCategory687_6(int value) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call687_7(net.minecraft.world.IBlockAccess a0, net.minecraft.block.state.IBlockState a1, moom.DT a2, net.minecraft.block.state.IBlockState a3, int a4) throws Throwable;
private static native boolean __integerCategory687_8(int value) throws Throwable;
private static native int __fieldRead687_9(moom.Jc a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead687_10() throws Throwable;
private static native net.minecraft.block.Block __call687_11(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.fn __call687_12(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __call687_13(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.fn __call687_14(net.minecraft.block.Block a0) throws Throwable;
private static native boolean __integerCategory687_15(int value) throws Throwable;
private static native int __instanceOf687_16(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.fB __cast687_17(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native boolean __integerCategory687_18(int value) throws Throwable;
private static native net.minecraft.block.Block __call687_19(moom.fB a0) throws Throwable;
private static native int __call687_20(moom.fB a0) throws Throwable;
private static native net.minecraft.block.Block __call687_21(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native boolean __integerCategory687_22(int value) throws Throwable;
private static native java.lang.Exception __call1068700_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068701_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068702_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068703_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068704_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068705_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068706_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068707_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068708_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068709_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068710_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068711_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068712_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068713_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068714_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068715_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068716_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068717_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_5e4c15e35d08d71b63ab(moom.bs a0) throws E;
private static final class __SourceHandler_5e4c15e35d08d71b63ab {

public static int f698(moom.bs p0) throws Throwable {
    int forestValue698_30_0;
    int spill698_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forest_join_30: {
    forest_join_29: {
    forest_join_27: {
    forest_join_25: {
    forest_join_23: {
    forest_join_21: {
    forest_join_19: {
    forest_join_17: {
    forest_join_10: {
    life1_3 = (__fieldRead698_0() ^ 21351884095441L);
    life3_5 = __call698_1();
    if (!((p0 == null))) {
        break forest_join_10;
    }
    return -1;
    }
    spill698_0 = (__fieldRead698_2())[__call698_3(p0)];
    if (!((life3_5 != null))) {
        forestValue698_30_0 = spill698_0;
        break forest_join_30;
    }
    switch (spill698_0) {
case 1:
{
        break forest_join_17;
    }
case 2:
{
        break forest_join_19;
    }
case 3:
{
        break forest_join_21;
    }
case 4:
{
        break forest_join_23;
    }
case 5:
{
        break forest_join_25;
    }
case 6:
{
        break forest_join_27;
    }
default:
{
        break forest_join_29;
    }
}
    }
    return 0;
    }
    return 1;
    }
    return 5;
    }
    return 4;
    }
    return 2;
    }
    return 3;
    }
    forestValue698_30_0 = -1;
    }
    return forestValue698_30_0;
}
public static int h698_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069800_0(p0);
}
public static int h698_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069801_0(p0);
}
public static int h698_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069802_0(p0);
}
private static native long __fieldRead698_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call698_1() throws Throwable;
private static native int[] __fieldRead698_2() throws Throwable;
private static native int __call698_3(moom.bs a0) throws Throwable;
private static native java.lang.Exception __call3069800_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069801_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069802_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_44e0e6d4be57701183eb(net.minecraft.block.state.IBlockState a0) throws E;
private static final class __SourceHandler_44e0e6d4be57701183eb {

public static boolean f688(net.minecraft.block.state.IBlockState p0) throws Throwable {
    net.minecraft.block.Block forwardValue688_16_0;
    int forwardValue688_28_0;
    int forwardValue688_30_0;
    net.minecraft.block.Block spill688_0;
    int spill688_1;
    int spill688_2;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    net.minecraft.block.Block life4_21;
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_27: {
    forward_join_16: {
    forward_join_14: {
    life1_3 = (__fieldRead688_0() ^ 97886735275181L);
    life3_5 = __call688_1();
    spill688_0 = __call688_2(p0);
    if (!((life3_5 != null))) {
        forwardValue688_16_0 = spill688_0;
        break forward_join_16;
    }
    if (!(__call688_3(spill688_0))) {
        break forward_join_14;
    }
    return __integerCategory688_4(1);
    }
    forwardValue688_16_0 = __call688_5(p0);
    }
    life4_21 = forwardValue688_16_0;
    spill688_1 = __instanceOf688_6(life4_21);
    if (!((life3_5 != null))) {
        forwardValue688_28_0 = spill688_1;
        break forward_join_28;
    }
    if (!((spill688_1 == 0))) {
        break forward_join_27;
    }
    spill688_2 = __instanceOf688_7(life4_21);
    if (!((life3_5 != null))) {
        forwardValue688_28_0 = spill688_2;
        break forward_join_28;
    }
    if (!((spill688_2 != 0))) {
        break forward_join_29;
    }
    }
    forwardValue688_28_0 = 1;
    }
    forwardValue688_30_0 = forwardValue688_28_0;
    break forward_join_30;
    }
    forwardValue688_30_0 = 0;
    }
    return __integerCategory688_8(forwardValue688_30_0);
}
public static void h688_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068800_0(p0);
}
public static void h688_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068801_0(p0);
}
public static void h688_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068802_0(p0);
}
public static void h688_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068803_0(p0);
}
public static void h688_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068804_0(p0);
}
private static native long __fieldRead688_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call688_1() throws Throwable;
private static native net.minecraft.block.Block __call688_2(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native boolean __call688_3(net.minecraft.block.Block a0) throws Throwable;
private static native boolean __integerCategory688_4(int value) throws Throwable;
private static native net.minecraft.block.Block __call688_5(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __instanceOf688_6(net.minecraft.block.Block a0) throws Throwable;
private static native int __instanceOf688_7(net.minecraft.block.Block a0) throws Throwable;
private static native boolean __integerCategory688_8(int value) throws Throwable;
private static native java.lang.Exception __call1068800_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068801_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068802_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068803_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068804_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> moom.lC __sourceHandlerCall_3ba98a796795b6d92fac(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1) throws E;
private static final class __SourceHandler_3ba98a796795b6d92fac {

public static moom.lC f37(net.minecraft.client.renderer.texture.TextureAtlasSprite p0, moom.lC p1) throws Throwable {
    int forestValue37_18_0;
    java.lang.Object forestValue37_41_0;
    moom.lC forestValue37_57_0;
    int spill37_0;
    java.util.Map spill37_1;
    moom.lC spill37_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    int life5_13;
    java.util.Map life6_30;
    moom.lC life7_53;
    forest_join_58: {
    forest_join_57: {
    forest_join_56: {
    forest_join_41: {
    forest_join_38: {
    forest_join_18: {
    forest_join_10: {
    life2_3 = (__fieldRead37_0() ^ 130451392358577L);
    life4_5 = __call37_1();
    if (!((__fieldRead37_2() == null))) {
        break forest_join_10;
    }
    return p1;
    }
    life5_13 = __call37_3(p0);
    spill37_0 = life5_13;
    if (!((life4_5 != null))) {
        forestValue37_18_0 = spill37_0;
        break forest_join_18;
    }
    if (!((spill37_0 >= 0))) {
        break forest_join_58;
    }
    forestValue37_18_0 = life5_13;
    }
    if (!((forestValue37_18_0 < (__fieldRead37_4()).length))) {
        break forest_join_58;
    }
    life6_30 = (__fieldRead37_5())[life5_13];
    spill37_1 = life6_30;
    if (!((life4_5 != null))) {
        forestValue37_41_0 = spill37_1;
        break forest_join_41;
    }
    if (!((spill37_1 == null))) {
        break forest_join_38;
    }
    life6_30 = new java.util.IdentityHashMap(1);
    (__fieldRead37_6())[life5_13] = life6_30;
    }
    forestValue37_41_0 = __call37_7(life6_30, p1);
    }
    life7_53 = __cast37_8(forestValue37_41_0);
    spill37_2 = life7_53;
    if (!((life4_5 != null))) {
        forestValue37_57_0 = spill37_2;
        break forest_join_57;
    }
    if (!((spill37_2 == null))) {
        break forest_join_56;
    }
    life7_53 = __call37_9(p1, p0);
    __call37_10(life6_30, p1, life7_53);
    }
    forestValue37_57_0 = life7_53;
    }
    return forestValue37_57_0;
    }
    return p1;
}
public static moom.lC h37_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3003700_0(p0);
}
public static moom.lC h37_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3003701_0(p0);
}
public static moom.lC h37_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3003702_0(p0);
}
public static moom.lC h37_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3003703_0(p0);
}
private static native long __fieldRead37_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call37_1() throws Throwable;
private static native java.util.Map[] __fieldRead37_2() throws Throwable;
private static native int __call37_3(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.util.Map[] __fieldRead37_4() throws Throwable;
private static native java.util.Map[] __fieldRead37_5() throws Throwable;
private static native java.util.Map[] __fieldRead37_6() throws Throwable;
private static native java.lang.Object __call37_7(java.util.Map a0, moom.lC a1) throws Throwable;
private static native moom.lC __cast37_8(java.lang.Object a0) throws Throwable;
private static native moom.lC __call37_9(moom.lC a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native java.lang.Object __call37_10(java.util.Map a0, moom.lC a1, moom.lC a2) throws Throwable;
private static native java.lang.Exception __call3003700_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3003701_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3003702_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3003703_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> moom.lC __sourceHandlerCall_a37ac2bee4f85e60a42f(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, int a2) throws E;
private static final class __SourceHandler_a37ac2bee4f85e60a42f {

public static moom.lC f7(net.minecraft.client.renderer.texture.TextureAtlasSprite p0, moom.lC p1, int p2) throws Throwable {
    net.minecraft.client.renderer.texture.TextureAtlasSprite forestValue7_17_0;
    int forestValue7_24_0;
    moom.lC forestValue7_65_0;
    net.minecraft.client.renderer.texture.TextureAtlasSprite spill7_0;
    int spill7_1;
    moom.lC spill7_2;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    int life6_23;
    java.util.Map life7_40;
    moom.bs life8_56;
    moom.lC life9_61;
    forest_join_66: {
    forest_join_65: {
    forest_join_64: {
    forest_join_42: {
    forest_join_24: {
    forest_join_17: {
    forest_join_16: {
    forest_join_10: {
    life3_3 = (__fieldRead7_0() ^ 68261215766594L);
    life5_5 = __call7_1();
    if (!((__fieldRead7_2() == null))) {
        break forest_join_10;
    }
    return null;
    }
    spill7_0 = p0;
    if (!((life5_5 != null))) {
        forestValue7_17_0 = spill7_0;
        break forest_join_17;
    }
    if (!((spill7_0 == null))) {
        break forest_join_16;
    }
    return null;
    }
    forestValue7_17_0 = p0;
    }
    life6_23 = __call7_3(forestValue7_17_0);
    spill7_1 = life6_23;
    if (!((life5_5 != null))) {
        forestValue7_24_0 = spill7_1;
        break forest_join_24;
    }
    if (!((spill7_1 >= 0))) {
        break forest_join_66;
    }
    forestValue7_24_0 = life6_23;
    }
    if (!((forestValue7_24_0 < (__fieldRead7_4()).length))) {
        break forest_join_66;
    }
    life7_40 = (__fieldRead7_5())[life6_23];
    if (!((life7_40 == null))) {
        break forest_join_42;
    }
    life7_40 = new java.util.EnumMap(__classLiteral7_6());
    (__fieldRead7_7())[life6_23] = life7_40;
    }
    life8_56 = __call7_8(p1);
    life9_61 = __cast7_10(__call7_9(life7_40, life8_56));
    spill7_2 = life9_61;
    if (!((life5_5 != null))) {
        forestValue7_65_0 = spill7_2;
        break forest_join_65;
    }
    if (!((spill7_2 == null))) {
        break forest_join_64;
    }
    life9_61 = __call7_11(life8_56, p0, p2);
    __call7_12(life7_40, life8_56, life9_61);
    }
    forestValue7_65_0 = life9_61;
    }
    return forestValue7_65_0;
    }
    return null;
}
public static moom.lC h7_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3000700_0(p0);
}
public static moom.lC h7_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3000701_0(p0);
}
public static moom.lC h7_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3000702_0(p0);
}
public static moom.lC h7_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3000703_0(p0);
}
public static moom.lC h7_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3000704_0(p0);
}
private static native long __fieldRead7_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call7_1() throws Throwable;
private static native java.util.Map[] __fieldRead7_2() throws Throwable;
private static native int __call7_3(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.util.Map[] __fieldRead7_4() throws Throwable;
private static native java.util.Map[] __fieldRead7_5() throws Throwable;
private static native java.lang.Class __classLiteral7_6() throws Throwable;
private static native java.util.Map[] __fieldRead7_7() throws Throwable;
private static native moom.bs __call7_8(moom.lC a0) throws Throwable;
private static native java.lang.Object __call7_9(java.util.Map a0, moom.bs a1) throws Throwable;
private static native moom.lC __cast7_10(java.lang.Object a0) throws Throwable;
private static native moom.lC __call7_11(moom.bs a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1, int a2) throws Throwable;
private static native java.lang.Object __call7_12(java.util.Map a0, moom.bs a1, moom.lC a2) throws Throwable;
private static native java.lang.Exception __call3000700_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3000701_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3000702_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3000703_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3000704_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> moom.lC[] __sourceHandlerCall_fbe06dc717dba3a678ca(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, moom.Mi a2) throws E;
private static final class __SourceHandler_fbe06dc717dba3a678ca {

public static moom.lC[] f689(net.minecraft.client.renderer.texture.TextureAtlasSprite p0, moom.lC p1, moom.Mi p2) throws Throwable {
    net.minecraft.client.renderer.texture.TextureAtlasSprite forwardValue689_13_0;
    net.minecraft.client.renderer.texture.TextureAtlasSprite forwardValue689_22_0;
    net.minecraft.client.renderer.texture.TextureAtlasSprite spill689_0;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    moom.lC life6_34;
    forward_join_22: {
    forward_join_21: {
    forward_join_13: {
    forward_join_12: {
    life3_3 = (__fieldRead689_0() ^ 97324865770660L);
    life5_5 = __call689_1();
    spill689_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue689_13_0 = spill689_0;
        break forward_join_13;
    }
    if (!((spill689_0 == null))) {
        break forward_join_12;
    }
    return null;
    }
    forwardValue689_13_0 = p0;
    }
    if (!((life5_5 != null))) {
        forwardValue689_22_0 = forwardValue689_13_0;
        break forward_join_22;
    }
    if (!((forwardValue689_13_0 == __fieldRead689_2()))) {
        break forward_join_21;
    }
    return __call689_3(p2, p1);
    }
    forwardValue689_22_0 = p0;
    }
    life6_34 = __call689_4(forwardValue689_22_0, p1);
    return __call689_5(p2, life6_34);
}
public static void h689_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068900_0(p0);
}
public static void h689_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068901_0(p0);
}
public static void h689_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068902_0(p0);
}
public static void h689_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1068903_0(p0);
}
private static native long __fieldRead689_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call689_1() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead689_2() throws Throwable;
private static native moom.lC[] __call689_3(moom.Mi a0, moom.lC a1) throws Throwable;
private static native moom.lC __call689_4(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1) throws Throwable;
private static native moom.lC[] __call689_5(moom.Mi a0, moom.lC a1) throws Throwable;
private static native java.lang.Exception __call1068900_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068901_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068902_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1068903_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_ec6acb75fd0e5183aa81(net.minecraft.client.renderer.texture.TextureMap a0) throws E;
private static final class __SourceHandler_ec6acb75fd0e5183aa81 {

public static void f690(net.minecraft.client.renderer.texture.TextureMap p0) throws Throwable {
    int lexicalValue690_80_0;
    net.minecraft.entity.Entity[] spill690_0;
    int spill690_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_7;
    net.minecraft.client.resources.IResourcePack[] life4_17;
    int life5_22;
    net.minecraft.client.resources.IResourcePack life6_28;
    moom.DD life5_51;
    lexical_join_83: {
    lexical_join_80: {
    lexical_join_78: {
    lexical_join_40: {
    lexical_join_37: {
    life1_3 = (__fieldRead690_0() ^ 64632921886293L);
    spill690_0 = __call690_1();
    __fieldWrite690_2(null);
    life3_7 = spill690_0;
    __fieldWrite690_3(null);
    __fieldWrite690_4(null);
    __fieldWrite690_5(null);
    if (!(__call690_6())) {
        break lexical_join_83;
    }
    life4_17 = __call690_7();
    life5_22 = ((life4_17).length - 1);
    lexical_cycle_23: while (true) {
    if (!((life5_22 >= 0))) {
        break lexical_join_37;
    }
    life6_28 = (life4_17)[life5_22];
    __call690_8(p0, life6_28);
    life5_22 += -1;
    if (!((life3_7 != null))) {
        break lexical_join_40;
    }
    if (!((life3_7 == null))) { continue lexical_cycle_23; }
    break lexical_cycle_23;
    }
    }
    __call690_10(p0, __call690_9());
    }
    life5_51 = new moom.DD(__invokedynamic690_11(29203, (5008771163742692850L ^ life1_3)));
    __fieldWrite690_13(__call690_12(p0, life5_51));
    __fieldWrite690_15(new java.util.Map[(__call690_14(p0) + 1)]);
    __fieldWrite690_17(new java.util.Map[(__call690_16(p0) + 1)]);
    __fieldWrite690_19(new java.util.Map[(__call690_18(p0) + 1)][]);
    spill690_1 = (__fieldRead690_20()).length;
    if (!((life3_7 != null))) {
        lexicalValue690_80_0 = spill690_1;
        break lexical_join_80;
    }
    if (!((spill690_1 == 0))) {
        break lexical_join_78;
    }
    __fieldWrite690_21(null);
    }
    lexicalValue690_80_0 = (__fieldRead690_22()).length;
    }
    if (!((lexicalValue690_80_0 == 0))) {
        break lexical_join_83;
    }
    __fieldWrite690_23(null);
    }
    return;
}
public static void h690_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069000_0(p0);
}
public static void h690_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069001_0(p0);
}
public static void h690_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069002_0(p0);
}
public static void h690_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069003_0(p0);
}
private static native long __fieldRead690_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call690_1() throws Throwable;
private static native void __fieldWrite690_2(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite690_3(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite690_4(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite690_5(java.lang.Object a0) throws Throwable;
private static native boolean __call690_6() throws Throwable;
private static native net.minecraft.client.resources.IResourcePack[] __call690_7() throws Throwable;
private static native void __call690_8(net.minecraft.client.renderer.texture.TextureMap a0, net.minecraft.client.resources.IResourcePack a1) throws Throwable;
private static native moom.oK __call690_9() throws Throwable;
private static native void __call690_10(net.minecraft.client.renderer.texture.TextureMap a0, moom.oK a1) throws Throwable;
private static native java.lang.String __invokedynamic690_11(int a0, long a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call690_12(net.minecraft.client.renderer.texture.TextureMap a0, moom.DD a1) throws Throwable;
private static native void __fieldWrite690_13(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call690_14(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __fieldWrite690_15(java.util.Map[] a0) throws Throwable;
private static native int __call690_16(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __fieldWrite690_17(java.util.Map[] a0) throws Throwable;
private static native int __call690_18(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __fieldWrite690_19(java.util.Map[][] a0) throws Throwable;
private static native moom.Jc[][] __fieldRead690_20() throws Throwable;
private static native void __fieldWrite690_21(java.lang.Object a0) throws Throwable;
private static native moom.Jc[][] __fieldRead690_22() throws Throwable;
private static native void __fieldWrite690_23(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1069000_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069001_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069002_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069003_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_9d0da5f0cbd92e5ae85d(net.minecraft.client.renderer.texture.TextureMap a0, net.minecraft.client.resources.IResourcePack a1) throws E;
private static final class __SourceHandler_9d0da5f0cbd92e5ae85d {

public static void f696(net.minecraft.client.renderer.texture.TextureMap p0, net.minecraft.client.resources.IResourcePack p1) throws Throwable {
    moom.Jc forestValue696_105_0;
    net.minecraft.entity.Entity[] spill696_0;
    moom.Jc spill696_1;
    long life2_3;
    java.lang.String[] life5_17;
    java.util.List life6_23;
    java.util.List life7_26;
    java.lang.String[] life8_28;
    int life9_31;
    int life10_33;
    net.minecraft.entity.Entity[] life4_34;
    java.lang.String life11_41;
    moom.DD life12_55;
    java.io.InputStream life13_59;
    moom.OH life14_83;
    moom.Jc life15_94;
    forest_join_127: {
    forest_join_110: {
    life2_3 = (__fieldRead696_0() ^ 65819988892886L);
    life5_17 = __call696_4(p1, __invokedynamic696_1(4149, (3939539617333450068L ^ life2_3)), __invokedynamic696_2(31293, (2089042629159944048L ^ life2_3)), __call696_3());
    spill696_0 = __call696_5();
    __call696_6(life5_17);
    life6_23 = __call696_8(__fieldRead696_7());
    life7_26 = __call696_10(__fieldRead696_9());
    life8_28 = life5_17;
    life9_31 = (life8_28).length;
    life10_33 = 0;
    life4_34 = spill696_0;
    forest_cycle_35: while (true) {
    forest_join_107: {
    forest_join_105: {
    forest_join_77: {
    forest_join_75: {
    if (!((life10_33 < life9_31))) {
        break forest_join_110;
    }
    life11_41 = (life8_28)[life10_33];
    java.lang.String __stackOp696_12_0 = life11_41;
    java.lang.String __stackOp696_12_1 = __invokedynamic696_11(14327, (2624378789236421297L ^ life2_3));
    __call696_14(__invokedynamic696_13(__stackOp696_12_1, __stackOp696_12_0));
    life12_55 = new moom.DD(life11_41);
    life13_59 = __call696_15(p1, life12_55);
    if (!((life4_34 != null))) {
        break forest_join_127;
    }
    if (!((life4_34 != null))) {
        break forest_join_75;
    }
    if (!((life13_59 == null))) {
        break forest_join_77;
    }
    java.lang.String __stackOp696_17_0 = life11_41;
    java.lang.String __stackOp696_17_1 = __invokedynamic696_16(10309, (6292479639913508111L ^ life2_3));
    __call696_19(__invokedynamic696_18(__stackOp696_17_1, __stackOp696_17_0));
    }
    if (!((life4_34 == null))) {
        break forest_join_107;
    }
    }
    life14_83 = new moom.OH();
    __call696_20(life14_83, life13_59);
    __call696_21(life13_59);
    life15_94 = new moom.Jc(life14_83, life11_41);
    spill696_1 = life15_94;
    if (!((life4_34 != null))) {
        forestValue696_105_0 = spill696_1;
        break forest_join_105;
    }
    if (!(__call696_22(spill696_1, life11_41))) {
        break forest_join_107;
    }
    __call696_23(life15_94, p0);
    __call696_24(life15_94, life6_23);
    forestValue696_105_0 = life15_94;
    }
    __call696_25(forestValue696_105_0, life7_26);
    }
    life10_33 += 1;
    if (!((life4_34 == null))) {
        continue forest_cycle_35;
    }
    break forest_cycle_35;
    }
    }
    __fieldWrite696_27(__call696_26(life7_26));
    __fieldWrite696_29(__call696_28(life6_23));
    __fieldWrite696_31(__call696_30());
    boolean __stackOp696_34_0 = __fieldRead696_32();
    java.lang.String __stackOp696_34_1 = __invokedynamic696_33(25437, (3344441495916668470L ^ life2_3));
    __call696_36(__invokedynamic696_35(__stackOp696_34_1, __stackOp696_34_0));
    }
    return;
}
public static void h696_0(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3069600_0(p0);
}
public static void h696_1(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3069601_0(p0);
}
public static void h696_2(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3069602_0(p0);
}
public static void h696_3(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3069603_0(p0);
}
public static void h696_4(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3069604_0(p0);
}
public static void h696_5(java.io.FileNotFoundException p0, net.minecraft.client.renderer.texture.TextureMap p1, net.minecraft.client.resources.IResourcePack p2, long p3, net.minecraft.entity.Entity[] p4, java.util.List p5, java.util.List p6, java.lang.String[] p7, int p8, int p9, java.lang.String p10, moom.DD p11, java.io.InputStream p12, moom.OH p13, moom.Jc p14) throws Throwable {
    moom.Jc forestValue3069605_85_0;
    moom.Jc spill3069605_0;
    java.io.FileNotFoundException life12_2;
    java.lang.String life11_23;
    moom.DD life12_37;
    java.io.InputStream life13_41;
    moom.OH life14_65;
    moom.Jc life15_76;
    forest_join_105: {
    forest_join_88: {
    life12_2 = p0;
    java.lang.String __stackOp3069605_1_0 = p10;
    java.lang.String __stackOp3069605_1_1 = __invokedynamic3069605_0(27127, (8312700710040825008L ^ p3));
    __call3069605_3(__invokedynamic3069605_2(__stackOp3069605_1_1, __stackOp3069605_1_0));
    forest_cycle_11: while (true) {
    forest_join_87: {
    forest_join_85: {
    forest_join_57: {
    forest_join_55: {
    forest_join_15: {
    p9 += 1;
    if (!((p4 == null))) {
        break forest_join_15;
    }
    break forest_join_88;
    }
    if (!((p9 < p8))) {
        break forest_join_88;
    }
    life11_23 = (p7)[p9];
    java.lang.String __stackOp3069605_5_0 = life11_23;
    java.lang.String __stackOp3069605_5_1 = __invokedynamic3069605_4(14327, (2624378789236421297L ^ p3));
    __call3069605_7(__invokedynamic3069605_6(__stackOp3069605_5_1, __stackOp3069605_5_0));
    life12_37 = new moom.DD(life11_23);
    life13_41 = __call3069605_8(p2, life12_37);
    if (!((p4 != null))) {
        break forest_join_105;
    }
    if (!((p4 != null))) {
        break forest_join_55;
    }
    if (!((life13_41 == null))) {
        break forest_join_57;
    }
    java.lang.String __stackOp3069605_10_0 = life11_23;
    java.lang.String __stackOp3069605_10_1 = __invokedynamic3069605_9(10309, (6292479639913508111L ^ p3));
    __call3069605_12(__invokedynamic3069605_11(__stackOp3069605_10_1, __stackOp3069605_10_0));
    }
    if (!((p4 == null))) {
        break forest_join_87;
    }
    }
    life14_65 = new moom.OH();
    __call3069605_13(life14_65, life13_41);
    __call3069605_14(life13_41);
    life15_76 = new moom.Jc(life14_65, life11_23);
    spill3069605_0 = life15_76;
    if (!((p4 != null))) {
        forestValue3069605_85_0 = spill3069605_0;
        break forest_join_85;
    }
    if (!(__call3069605_15(spill3069605_0, life11_23))) {
        break forest_join_87;
    }
    __call3069605_16(life15_76, p1);
    __call3069605_17(life15_76, p5);
    forestValue3069605_85_0 = life15_76;
    }
    __call3069605_18(forestValue3069605_85_0, p6);
    }
    continue forest_cycle_11;
    }
    }
    __fieldWrite3069605_20(__call3069605_19(p6));
    __fieldWrite3069605_22(__call3069605_21(p5));
    __fieldWrite3069605_24(__call3069605_23());
    boolean __stackOp3069605_27_0 = __fieldRead3069605_25();
    java.lang.String __stackOp3069605_27_1 = __invokedynamic3069605_26(25437, (3344441495916668470L ^ p3));
    __call3069605_29(__invokedynamic3069605_28(__stackOp3069605_27_1, __stackOp3069605_27_0));
    }
    return;
}
public static void h696_6(java.lang.Exception p0, net.minecraft.client.renderer.texture.TextureMap p1, net.minecraft.client.resources.IResourcePack p2, long p3, net.minecraft.entity.Entity[] p4, java.util.List p5, java.util.List p6, java.lang.String[] p7, int p8, int p9, java.lang.String p10, moom.DD p11, java.io.InputStream p12, moom.OH p13, moom.Jc p14) throws Throwable {
    moom.Jc forestValue3069606_78_0;
    moom.Jc spill3069606_0;
    java.lang.Exception life12_2;
    java.lang.String life11_15;
    moom.DD life12_29;
    java.io.InputStream life13_33;
    moom.OH life14_57;
    moom.Jc life15_68;
    forest_join_98: {
    forest_join_81: {
    life12_2 = p0;
    __call3069606_0(life12_2);
    forest_cycle_4: while (true) {
    forest_join_80: {
    forest_join_78: {
    forest_join_50: {
    forest_join_48: {
    forest_join_8: {
    p9 += 1;
    if (!((p4 == null))) {
        break forest_join_8;
    }
    break forest_join_81;
    }
    if (!((p9 < p8))) {
        break forest_join_81;
    }
    life11_15 = (p7)[p9];
    java.lang.String __stackOp3069606_2_0 = life11_15;
    java.lang.String __stackOp3069606_2_1 = __invokedynamic3069606_1(14327, (2624378789236421297L ^ p3));
    __call3069606_4(__invokedynamic3069606_3(__stackOp3069606_2_1, __stackOp3069606_2_0));
    life12_29 = new moom.DD(life11_15);
    life13_33 = __call3069606_5(p2, life12_29);
    if (!((p4 != null))) {
        break forest_join_98;
    }
    if (!((p4 != null))) {
        break forest_join_48;
    }
    if (!((life13_33 == null))) {
        break forest_join_50;
    }
    java.lang.String __stackOp3069606_7_0 = life11_15;
    java.lang.String __stackOp3069606_7_1 = __invokedynamic3069606_6(10309, (6292479639913508111L ^ p3));
    __call3069606_9(__invokedynamic3069606_8(__stackOp3069606_7_1, __stackOp3069606_7_0));
    }
    if (!((p4 == null))) {
        break forest_join_80;
    }
    }
    life14_57 = new moom.OH();
    __call3069606_10(life14_57, life13_33);
    __call3069606_11(life13_33);
    life15_68 = new moom.Jc(life14_57, life11_15);
    spill3069606_0 = life15_68;
    if (!((p4 != null))) {
        forestValue3069606_78_0 = spill3069606_0;
        break forest_join_78;
    }
    if (!(__call3069606_12(spill3069606_0, life11_15))) {
        break forest_join_80;
    }
    __call3069606_13(life15_68, p1);
    __call3069606_14(life15_68, p5);
    forestValue3069606_78_0 = life15_68;
    }
    __call3069606_15(forestValue3069606_78_0, p6);
    }
    continue forest_cycle_4;
    }
    }
    __fieldWrite3069606_17(__call3069606_16(p6));
    __fieldWrite3069606_19(__call3069606_18(p5));
    __fieldWrite3069606_21(__call3069606_20());
    boolean __stackOp3069606_24_0 = __fieldRead3069606_22();
    java.lang.String __stackOp3069606_24_1 = __invokedynamic3069606_23(25437, (3344441495916668470L ^ p3));
    __call3069606_26(__invokedynamic3069606_25(__stackOp3069606_24_1, __stackOp3069606_24_0));
    }
    return;
}
private static native long __fieldRead696_0() throws Throwable;
private static native java.lang.String __invokedynamic696_1(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic696_2(int a0, long a1) throws Throwable;
private static native java.lang.String[] __call696_3() throws Throwable;
private static native java.lang.String[] __call696_4(net.minecraft.client.resources.IResourcePack a0, java.lang.String a1, java.lang.String a2, java.lang.String[] a3) throws Throwable;
private static native net.minecraft.entity.Entity[] __call696_5() throws Throwable;
private static native void __call696_6(java.lang.String[] a0) throws Throwable;
private static native moom.Jc[][] __fieldRead696_7() throws Throwable;
private static native java.util.List __call696_8(moom.Jc[][] a0) throws Throwable;
private static native moom.Jc[][] __fieldRead696_9() throws Throwable;
private static native java.util.List __call696_10(moom.Jc[][] a0) throws Throwable;
private static native java.lang.String __invokedynamic696_11(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic696_13(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call696_14(java.lang.String a0) throws Throwable;
private static native java.io.InputStream __call696_15(net.minecraft.client.resources.IResourcePack a0, moom.DD a1) throws Throwable;
private static native java.lang.String __invokedynamic696_16(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic696_18(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call696_19(java.lang.String a0) throws Throwable;
private static native void __call696_20(moom.OH a0, java.io.InputStream a1) throws Throwable;
private static native void __call696_21(java.io.InputStream a0) throws Throwable;
private static native boolean __call696_22(moom.Jc a0, java.lang.String a1) throws Throwable;
private static native void __call696_23(moom.Jc a0, net.minecraft.client.renderer.texture.TextureMap a1) throws Throwable;
private static native void __call696_24(moom.Jc a0, java.util.List a1) throws Throwable;
private static native void __call696_25(moom.Jc a0, java.util.List a1) throws Throwable;
private static native moom.Jc[][] __call696_26(java.util.List a0) throws Throwable;
private static native void __fieldWrite696_27(moom.Jc[][] a0) throws Throwable;
private static native moom.Jc[][] __call696_28(java.util.List a0) throws Throwable;
private static native void __fieldWrite696_29(moom.Jc[][] a0) throws Throwable;
private static native boolean __call696_30() throws Throwable;
private static native void __fieldWrite696_31(boolean a0) throws Throwable;
private static native boolean __fieldRead696_32() throws Throwable;
private static native java.lang.String __invokedynamic696_33(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic696_35(java.lang.String a0, boolean a1) throws Throwable;
private static native void __call696_36(java.lang.String a0) throws Throwable;
private static native java.lang.Exception __call3069600_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3069601_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3069602_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3069603_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3069604_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.String __invokedynamic3069605_0(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3069605_2(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call3069605_3(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic3069605_4(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3069605_6(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call3069605_7(java.lang.String a0) throws Throwable;
private static native java.io.InputStream __call3069605_8(net.minecraft.client.resources.IResourcePack a0, moom.DD a1) throws Throwable;
private static native java.lang.String __invokedynamic3069605_9(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3069605_11(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call3069605_12(java.lang.String a0) throws Throwable;
private static native void __call3069605_13(moom.OH a0, java.io.InputStream a1) throws Throwable;
private static native void __call3069605_14(java.io.InputStream a0) throws Throwable;
private static native boolean __call3069605_15(moom.Jc a0, java.lang.String a1) throws Throwable;
private static native void __call3069605_16(moom.Jc a0, net.minecraft.client.renderer.texture.TextureMap a1) throws Throwable;
private static native void __call3069605_17(moom.Jc a0, java.util.List a1) throws Throwable;
private static native void __call3069605_18(moom.Jc a0, java.util.List a1) throws Throwable;
private static native moom.Jc[][] __call3069605_19(java.util.List a0) throws Throwable;
private static native void __fieldWrite3069605_20(moom.Jc[][] a0) throws Throwable;
private static native moom.Jc[][] __call3069605_21(java.util.List a0) throws Throwable;
private static native void __fieldWrite3069605_22(moom.Jc[][] a0) throws Throwable;
private static native boolean __call3069605_23() throws Throwable;
private static native void __fieldWrite3069605_24(boolean a0) throws Throwable;
private static native boolean __fieldRead3069605_25() throws Throwable;
private static native java.lang.String __invokedynamic3069605_26(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3069605_28(java.lang.String a0, boolean a1) throws Throwable;
private static native void __call3069605_29(java.lang.String a0) throws Throwable;
private static native void __call3069606_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __invokedynamic3069606_1(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3069606_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call3069606_4(java.lang.String a0) throws Throwable;
private static native java.io.InputStream __call3069606_5(net.minecraft.client.resources.IResourcePack a0, moom.DD a1) throws Throwable;
private static native java.lang.String __invokedynamic3069606_6(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3069606_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call3069606_9(java.lang.String a0) throws Throwable;
private static native void __call3069606_10(moom.OH a0, java.io.InputStream a1) throws Throwable;
private static native void __call3069606_11(java.io.InputStream a0) throws Throwable;
private static native boolean __call3069606_12(moom.Jc a0, java.lang.String a1) throws Throwable;
private static native void __call3069606_13(moom.Jc a0, net.minecraft.client.renderer.texture.TextureMap a1) throws Throwable;
private static native void __call3069606_14(moom.Jc a0, java.util.List a1) throws Throwable;
private static native void __call3069606_15(moom.Jc a0, java.util.List a1) throws Throwable;
private static native moom.Jc[][] __call3069606_16(java.util.List a0) throws Throwable;
private static native void __fieldWrite3069606_17(moom.Jc[][] a0) throws Throwable;
private static native moom.Jc[][] __call3069606_18(java.util.List a0) throws Throwable;
private static native void __fieldWrite3069606_19(moom.Jc[][] a0) throws Throwable;
private static native boolean __call3069606_20() throws Throwable;
private static native void __fieldWrite3069606_21(boolean a0) throws Throwable;
private static native boolean __fieldRead3069606_22() throws Throwable;
private static native java.lang.String __invokedynamic3069606_23(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3069606_25(java.lang.String a0, boolean a1) throws Throwable;
private static native void __call3069606_26(java.lang.String a0) throws Throwable;

}

private static native <E extends Throwable> moom.lC[] __sourceHandlerCall_6e55caa29d96a73a1d63(net.minecraft.world.IBlockAccess a0, net.minecraft.block.state.IBlockState a1, moom.DT a2, moom.bs a3, moom.lC a4, moom.Mi a5) throws E;
private static final class __SourceHandler_6e55caa29d96a73a1d63 {

public static moom.lC[] f704(net.minecraft.world.IBlockAccess p0, net.minecraft.block.state.IBlockState p1, moom.DT p2, moom.bs p3, moom.lC p4, moom.Mi p5) throws Throwable {
    int forestValue704_26_0;
    moom.lC[] forestValue704_29_0;
    moom.lC[] forestValue704_36_0;
    int forestValue704_46_0;
    int forestValue704_46_1;
    moom.lC forestValue704_91_0;
    java.lang.Object forestValue704_99_0;
    int forestValue704_104_0;
    moom.lC[] forestValue704_122_0;
    net.minecraft.entity.Entity[] spill704_0;
    boolean spill704_1;
    moom.lC[] spill704_2;
    int spill704_3;
    moom.lC[] spill704_4;
    int spill704_5;
    int spill704_6;
    moom.lC spill704_7;
    moom.lC[] spill704_8;
    long life6_3;
    moom.lC[] life9_14;
    net.minecraft.entity.Entity[] life8_15;
    java.util.List life10_45;
    int life11_47;
    moom.lC life12_56;
    int life13_60;
    moom.lC[] life14_75;
    int life11_114;
    forest_join_122: {
    forest_join_121: {
    forest_join_104: {
    forest_join_103: {
    forest_join_37: {
    forest_join_36: {
    forest_join_29: {
    forest_join_26: {
    forest_join_22: {
    life6_3 = (__fieldRead704_0() ^ 30188463721064L);
    spill704_0 = __call704_1();
    life9_14 = __call704_2(p0, p1, p2, p3, p4, 1, 0, p5);
    life8_15 = spill704_0;
    spill704_1 = __fieldRead704_3();
    if (!((life8_15 != null))) {
        forestValue704_26_0 = __integerCategory704_4(spill704_1);
        break forest_join_26;
    }
    if (!((!spill704_1))) {
        break forest_join_22;
    }
    return life9_14;
    }
    spill704_2 = life9_14;
    if (!((life8_15 != null))) {
        forestValue704_29_0 = spill704_2;
        break forest_join_29;
    }
    forestValue704_26_0 = (spill704_2).length;
    }
    if (!((forestValue704_26_0 == 1))) {
        break forest_join_37;
    }
    forestValue704_29_0 = life9_14;
    }
    if (!((life8_15 != null))) {
        forestValue704_36_0 = forestValue704_29_0;
        break forest_join_36;
    }
    if (!(((forestValue704_29_0)[0] == p4))) {
        break forest_join_37;
    }
    forestValue704_36_0 = life9_14;
    }
    return forestValue704_36_0;
    }
    life10_45 = __call704_5(p5, life9_14);
    life11_47 = 0;
    forest_cycle_43: while (true) {
    forest_join_99: {
    forest_join_95: {
    forestValue704_46_0 = life11_47;
    forestValue704_46_1 = __call704_6(life10_45);
    forest_cycle_46: while (true) {
    if (!((forestValue704_46_0 < forestValue704_46_1))) {
        break forest_join_103;
    }
    life12_56 = __cast704_8(__call704_7(life10_45, life11_47));
    spill704_3 = 0;
    if (!((life8_15 != null))) {
        forestValue704_104_0 = spill704_3;
        break forest_join_104;
    }
    life13_60 = spill704_3;
    forest_cycle_56: while (true) {
    forest_join_91: {
    forest_join_88: {
    if (!((life13_60 < 3))) {
        break forest_join_95;
    }
    life14_75 = __call704_9(p0, p1, p2, p3, life12_56, 0, (life13_60 + 1), p5);
    spill704_4 = life14_75;
    if (!((life8_15 != null))) {
        forestValue704_99_0 = spill704_4;
        break forest_join_99;
    }
    spill704_5 = (spill704_4).length;
    spill704_6 = 1;
    if (!((life8_15 != null))) {
        forestValue704_46_0 = spill704_5;
        forestValue704_46_1 = spill704_6;
        continue forest_cycle_46;
    }
    if (!((spill704_5 == spill704_6))) {
        break forest_join_95;
    }
    spill704_7 = (life14_75)[0];
    if (!((life8_15 != null))) {
        forestValue704_91_0 = spill704_7;
        break forest_join_91;
    }
    if (!((spill704_7 == life12_56))) {
        break forest_join_88;
    }
    if (!((life8_15 == null))) {
        break forest_join_95;
    }
    }
    forestValue704_91_0 = (life14_75)[0];
    }
    life12_56 = forestValue704_91_0;
    life13_60 += 1;
    if (!((life8_15 == null))) {
        continue forest_cycle_56;
    }
    break forest_cycle_56;
    }
    break forest_cycle_46;
    }
    }
    forestValue704_99_0 = __call704_10(life10_45, life11_47, life12_56);
    }
    __discardScalar704_11(forestValue704_99_0);
    life11_47 += 1;
    if (!((life8_15 == null))) {
        continue forest_cycle_43;
    }
    break forest_cycle_43;
    }
    }
    forestValue704_104_0 = 0;
    }
    life11_114 = forestValue704_104_0;
    forest_cycle_105: while (true) {
    if (!((life11_114 < (life9_14).length))) {
        break forest_join_121;
    }
    spill704_8 = life9_14;
    if (!((life8_15 != null))) {
        forestValue704_122_0 = spill704_8;
        break forest_join_122;
    }
    (spill704_8)[life11_114] = __cast704_13(__call704_12(life10_45, life11_114));
    life11_114 += 1;
    if (!((life8_15 == null))) {
        continue forest_cycle_105;
    }
    break forest_cycle_105;
    }
    }
    forestValue704_122_0 = life9_14;
    }
    return forestValue704_122_0;
}
public static moom.lC[] h704_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070400_0(p0);
}
public static moom.lC[] h704_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070401_0(p0);
}
public static moom.lC[] h704_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070402_0(p0);
}
public static moom.lC[] h704_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070403_0(p0);
}
public static moom.lC[] h704_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070404_0(p0);
}
public static moom.lC[] h704_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070405_0(p0);
}
public static moom.lC[] h704_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070406_0(p0);
}
public static moom.lC[] h704_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070407_0(p0);
}
public static moom.lC[] h704_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070408_0(p0);
}
public static moom.lC[] h704_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070409_0(p0);
}
public static moom.lC[] h704_10(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070410_0(p0);
}
public static moom.lC[] h704_11(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070411_0(p0);
}
private static native long __fieldRead704_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call704_1() throws Throwable;
private static native moom.lC[] __call704_2(net.minecraft.world.IBlockAccess a0, net.minecraft.block.state.IBlockState a1, moom.DT a2, moom.bs a3, moom.lC a4, int a5, int a6, moom.Mi a7) throws Throwable;
private static native boolean __fieldRead704_3() throws Throwable;
private static native int __integerCategory704_4(boolean value) throws Throwable;
private static native java.util.List __call704_5(moom.Mi a0, moom.lC[] a1) throws Throwable;
private static native int __call704_6(java.util.List a0) throws Throwable;
private static native java.lang.Object __call704_7(java.util.List a0, int a1) throws Throwable;
private static native moom.lC __cast704_8(java.lang.Object a0) throws Throwable;
private static native moom.lC[] __call704_9(net.minecraft.world.IBlockAccess a0, net.minecraft.block.state.IBlockState a1, moom.DT a2, moom.bs a3, moom.lC a4, int a5, int a6, moom.Mi a7) throws Throwable;
private static native java.lang.Object __call704_10(java.util.List a0, int a1, moom.lC a2) throws Throwable;
private static native void __discardScalar704_11(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call704_12(java.util.List a0, int a1) throws Throwable;
private static native moom.lC __cast704_13(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call3070400_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070401_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070402_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070403_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070404_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070405_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070406_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070407_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070408_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070409_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070410_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070411_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> moom.lC[] __sourceHandlerCall_a0e8cd25a9e3514e3f19(net.minecraft.world.IBlockAccess a0, net.minecraft.block.state.IBlockState a1, moom.DT a2, moom.bs a3, moom.lC a4, boolean a5, int a6, moom.Mi a7) throws E;
private static final class __SourceHandler_a0e8cd25a9e3514e3f19 {

public static moom.lC[] f703(net.minecraft.world.IBlockAccess p0, net.minecraft.block.state.IBlockState p1, moom.DT p2, moom.bs p3, moom.lC p4, boolean p5, int p6, moom.Mi p7) throws Throwable {
    net.minecraft.block.state.IBlockState forestValue703_15_0;
    int forestValue703_38_0;
    moom.Jc forestValue703_80_0;
    moom.Jc[][] forestValue703_101_0;
    int forestValue703_110_0;
    moom.Jc forestValue703_151_0;
    moom.Jc forestValue703_171_0;
    moom.Jc forestValue703_179_0;
    moom.Mi forestValue703_211_0;
    net.minecraft.entity.Entity[] spill703_0;
    net.minecraft.block.state.IBlockState spill703_1;
    moom.Jc[][] spill703_2;
    int spill703_3;
    moom.Jc[][] spill703_4;
    moom.Jc spill703_5;
    moom.Jc spill703_6;
    boolean spill703_7;
    moom.Mi spill703_8;
    moom.Jc spill703_9;
    moom.Jc spill703_10;
    moom.Jc spill703_11;
    long life8_3;
    net.minecraft.block.Block life11_7;
    net.minecraft.entity.Entity[] life10_8;
    moom.fB life12_20;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life13_30;
    int life14_40;
    moom.Jc[] life15_61;
    int life16_67;
    moom.Jc[] life17_69;
    int life18_72;
    int life19_74;
    moom.Jc life20_83;
    moom.lC[] life21_116;
    int life14_152;
    moom.Jc[] life15_165;
    int life16_171;
    moom.Jc[] life17_173;
    int life18_176;
    int life19_178;
    moom.Jc life20_187;
    moom.lC[] life21_215;
    forest_join_211: {
    forest_join_210: {
    forest_join_208: {
    forest_join_171: {
    forest_join_170: {
    forest_join_169: {
    forest_join_110: {
    forest_join_101: {
    forest_join_100: {
    forest_join_98: {
    forest_join_38: {
    forest_join_23: {
    forest_join_19: {
    forest_join_15: {
    life8_3 = (__fieldRead703_0() ^ 21137492459475L);
    spill703_0 = __call703_1();
    life11_7 = __call703_2(p1);
    life10_8 = spill703_0;
    spill703_1 = p1;
    if (!((life10_8 != null))) {
        forestValue703_15_0 = spill703_1;
        break forest_join_15;
    }
    if (!((__instanceOf703_3(spill703_1) != 0))) {
        break forest_join_19;
    }
    forestValue703_15_0 = p1;
    }
    life12_20 = __cast703_4(forestValue703_15_0);
    if (!((life10_8 == null))) {
        break forest_join_23;
    }
    }
    return __call703_5(p7, p4);
    }
    life13_30 = __call703_6(p4);
    spill703_2 = __fieldRead703_7();
    if (!((life10_8 != null))) {
        forestValue703_101_0 = spill703_2;
        break forest_join_101;
    }
    if (!((spill703_2 != null))) {
        break forest_join_100;
    }
    life14_40 = __call703_8(life13_30);
    spill703_3 = life14_40;
    if (!((life10_8 != null))) {
        forestValue703_38_0 = spill703_3;
        break forest_join_38;
    }
    if (!((spill703_3 >= 0))) {
        break forest_join_100;
    }
    forestValue703_38_0 = life14_40;
    }
    if (!((forestValue703_38_0 < (__fieldRead703_9()).length))) {
        break forest_join_100;
    }
    spill703_4 = __fieldRead703_10();
    if (!((life10_8 != null))) {
        forestValue703_101_0 = spill703_4;
        break forest_join_101;
    }
    life15_61 = (spill703_4)[life14_40];
    if (!((life15_61 != null))) {
        break forest_join_100;
    }
    life16_67 = __call703_11(p3);
    life17_69 = life15_61;
    life18_72 = (life17_69).length;
    life19_74 = 0;
    forest_cycle_59: while (true) {
    forest_join_95: {
    forest_join_94: {
    forest_join_80: {
    if (!((life19_74 < life18_72))) {
        break forest_join_100;
    }
    life20_83 = (life17_69)[life19_74];
    if (!((life10_8 != null))) {
        break forest_join_95;
    }
    spill703_5 = life20_83;
    if (!((life10_8 != null))) {
        forestValue703_171_0 = spill703_5;
        break forest_join_171;
    }
    if (!((spill703_5 != null))) {
        break forest_join_94;
    }
    spill703_6 = life20_83;
    if (!((life10_8 != null))) {
        forestValue703_80_0 = spill703_6;
        break forest_join_80;
    }
    if (!(__call703_13(spill703_6, __call703_12(life12_20)))) {
        break forest_join_94;
    }
    forestValue703_80_0 = life20_83;
    }
    life21_116 = __call703_14(forestValue703_80_0, p0, life12_20, p2, life16_67, p4, p6, p7);
    if (!((life10_8 != null))) {
        break forest_join_95;
    }
    if (!((life21_116 != null))) {
        break forest_join_94;
    }
    break forest_join_98;
    }
    life19_74 += 1;
    }
    if (!((life10_8 == null))) {
        continue forest_cycle_59;
    }
    break forest_cycle_59;
    }
    break forest_join_100;
    }
    return life21_116;
    }
    forestValue703_101_0 = __fieldRead703_15();
    }
    if (!((forestValue703_101_0 != null))) {
        break forest_join_210;
    }
    spill703_7 = p5;
    if (!((life10_8 != null))) {
        forestValue703_110_0 = __integerCategory703_16(spill703_7);
        break forest_join_110;
    }
    if (!(spill703_7)) {
        break forest_join_210;
    }
    spill703_8 = p7;
    if (!((life10_8 != null))) {
        forestValue703_211_0 = spill703_8;
        break forest_join_211;
    }
    forestValue703_110_0 = __call703_17(spill703_8);
    }
    life14_152 = forestValue703_110_0;
    if (!((life14_152 >= 0))) {
        break forest_join_210;
    }
    if (!((life14_152 < (__fieldRead703_18()).length))) {
        break forest_join_210;
    }
    life15_165 = (__fieldRead703_19())[life14_152];
    if (!((life15_165 != null))) {
        break forest_join_210;
    }
    life16_171 = __call703_20(p3);
    life17_173 = life15_165;
    life18_176 = (life17_173).length;
    life19_178 = 0;
    forest_cycle_133: while (true) {
    forest_join_166: {
    forest_join_165: {
    forest_join_151: {
    if (!((life19_178 < life18_176))) {
        break forest_join_210;
    }
    life20_187 = (life17_173)[life19_178];
    if (!((life10_8 != null))) {
        break forest_join_166;
    }
    if (!((life20_187 != null))) {
        break forest_join_165;
    }
    spill703_9 = life20_187;
    if (!((life10_8 != null))) {
        forestValue703_151_0 = spill703_9;
        break forest_join_151;
    }
    if (!(__call703_21(spill703_9, life13_30))) {
        break forest_join_165;
    }
    forestValue703_151_0 = life20_187;
    }
    life21_215 = __call703_22(forestValue703_151_0, p0, life12_20, p2, life16_171, p4, p6, p7);
    if (!((life10_8 != null))) {
        break forest_join_166;
    }
    if (!((life21_215 != null))) {
        break forest_join_165;
    }
    break forest_join_169;
    }
    life19_178 += 1;
    }
    if (!((life10_8 == null))) {
        continue forest_cycle_133;
    }
    break forest_cycle_133;
    }
    break forest_join_170;
    }
    break forest_join_208;
    }
    break forest_join_210;
    }
    forest_cycle_171: while (true) {
    forest_join_194: {
    forest_join_193: {
    forest_join_179: {
    if (!((forestValue703_171_0 != null))) {
        break forest_join_193;
    }
    spill703_10 = life20_83;
    if (!((life10_8 != null))) {
        forestValue703_179_0 = spill703_10;
        break forest_join_179;
    }
    if (!(__call703_23(spill703_10, life13_30))) {
        break forest_join_193;
    }
    forestValue703_179_0 = life20_83;
    }
    life21_215 = __call703_24(forestValue703_179_0, p0, life12_20, p2, life16_67, p4, p6, p7);
    if (!((life10_8 != null))) {
        break forest_join_194;
    }
    if (!((life21_215 != null))) {
        break forest_join_193;
    }
    break forest_join_208;
    }
    life19_74 += 1;
    }
    forest_cycle_194: while (true) {
    forest_join_197: {
    if (!((life10_8 == null))) {
        break forest_join_197;
    }
    break forest_join_210;
    }
    if (!((life19_74 < life18_72))) {
        break forest_join_210;
    }
    life20_83 = (life17_69)[life19_74];
    if (!((life10_8 != null))) {
        continue forest_cycle_194;
    }
    break forest_cycle_194;
    }
    spill703_11 = life20_83;
    forestValue703_171_0 = spill703_11;
    continue forest_cycle_171;
    }
    }
    return life21_215;
    }
    forestValue703_211_0 = p7;
    }
    return __call703_25(forestValue703_211_0, p4);
}
public static moom.lC[] h703_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070300_0(p0);
}
public static moom.lC[] h703_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070301_0(p0);
}
public static moom.lC[] h703_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070302_0(p0);
}
public static moom.lC[] h703_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070303_0(p0);
}
public static moom.lC[] h703_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070304_0(p0);
}
public static moom.lC[] h703_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070305_0(p0);
}
public static moom.lC[] h703_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070306_0(p0);
}
public static moom.lC[] h703_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070307_0(p0);
}
public static moom.lC[] h703_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070308_0(p0);
}
public static moom.lC[] h703_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070309_0(p0);
}
public static moom.lC[] h703_10(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070310_0(p0);
}
public static moom.lC[] h703_11(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070311_0(p0);
}
public static moom.lC[] h703_12(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070312_0(p0);
}
public static moom.lC[] h703_13(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070313_0(p0);
}
public static moom.lC[] h703_14(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070314_0(p0);
}
public static moom.lC[] h703_15(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070315_0(p0);
}
public static moom.lC[] h703_16(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070316_0(p0);
}
public static moom.lC[] h703_17(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070317_0(p0);
}
public static moom.lC[] h703_18(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070318_0(p0);
}
public static moom.lC[] h703_19(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070319_0(p0);
}
public static moom.lC[] h703_20(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070320_0(p0);
}
public static moom.lC[] h703_21(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070321_0(p0);
}
public static moom.lC[] h703_22(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070322_0(p0);
}
public static moom.lC[] h703_23(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3070323_0(p0);
}
private static native long __fieldRead703_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call703_1() throws Throwable;
private static native net.minecraft.block.Block __call703_2(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __instanceOf703_3(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.fB __cast703_4(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.lC[] __call703_5(moom.Mi a0, moom.lC a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call703_6(moom.lC a0) throws Throwable;
private static native moom.Jc[][] __fieldRead703_7() throws Throwable;
private static native int __call703_8(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native moom.Jc[][] __fieldRead703_9() throws Throwable;
private static native moom.Jc[][] __fieldRead703_10() throws Throwable;
private static native int __call703_11(moom.bs a0) throws Throwable;
private static native int __call703_12(moom.fB a0) throws Throwable;
private static native boolean __call703_13(moom.Jc a0, int a1) throws Throwable;
private static native moom.lC[] __call703_14(moom.Jc a0, net.minecraft.world.IBlockAccess a1, moom.fB a2, moom.DT a3, int a4, moom.lC a5, int a6, moom.Mi a7) throws Throwable;
private static native moom.Jc[][] __fieldRead703_15() throws Throwable;
private static native int __integerCategory703_16(boolean value) throws Throwable;
private static native int __call703_17(moom.Mi a0) throws Throwable;
private static native moom.Jc[][] __fieldRead703_18() throws Throwable;
private static native moom.Jc[][] __fieldRead703_19() throws Throwable;
private static native int __call703_20(moom.bs a0) throws Throwable;
private static native boolean __call703_21(moom.Jc a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native moom.lC[] __call703_22(moom.Jc a0, net.minecraft.world.IBlockAccess a1, moom.fB a2, moom.DT a3, int a4, moom.lC a5, int a6, moom.Mi a7) throws Throwable;
private static native boolean __call703_23(moom.Jc a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native moom.lC[] __call703_24(moom.Jc a0, net.minecraft.world.IBlockAccess a1, moom.fB a2, moom.DT a3, int a4, moom.lC a5, int a6, moom.Mi a7) throws Throwable;
private static native moom.lC[] __call703_25(moom.Mi a0, moom.lC a1) throws Throwable;
private static native java.lang.Exception __call3070300_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070301_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070302_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070303_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070304_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070305_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070306_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070307_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070308_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070309_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070310_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070311_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070312_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070313_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070314_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070315_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070316_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070317_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070318_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070319_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070320_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070321_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070322_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3070323_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_68c1ca44f92342c3f877(net.minecraft.world.IBlockAccess a0, net.minecraft.block.state.IBlockState a1, moom.DT a2, moom.lC a3, moom.Mi a4) throws E;
private static final class __SourceHandler_68c1ca44f92342c3f877 {

public static boolean f693(net.minecraft.world.IBlockAccess p0, net.minecraft.block.state.IBlockState p1, moom.DT p2, moom.lC p3, moom.Mi p4) throws Throwable {
    int forwardValue693_41_0;
    int forwardValue693_44_0;
    moom.bs forwardValue693_57_0;
    moom.bs forwardValue693_57_1;
    int forwardValue693_66_0;
    net.minecraft.block.Block forwardValue693_85_0;
    net.minecraft.block.Block forwardValue693_102_0;
    net.minecraft.block.state.IBlockState forwardValue693_106_0;
    int forwardValue693_128_0;
    double forwardValue693_137_0;
    int forwardValue693_153_0;
    int forwardValue693_163_0;
    int forwardValue693_165_0;
    net.minecraft.entity.Entity[] spill693_0;
    int spill693_1;
    boolean spill693_2;
    moom.bs spill693_3;
    moom.bs spill693_4;
    boolean spill693_5;
    net.minecraft.block.Block spill693_6;
    net.minecraft.block.state.IBlockState spill693_7;
    int spill693_8;
    double spill693_9;
    int spill693_10;
    long life5_3;
    net.minecraft.block.Block life8_7;
    net.minecraft.entity.Entity[] life7_8;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life9_19;
    net.minecraft.block.state.IBlockState life10_40;
    moom.bs life9_60;
    moom.DT life10_93;
    net.minecraft.block.state.IBlockState life11_97;
    net.minecraft.block.state.IBlockState life11_144;
    double life12_148;
    double life14_185;
    forward_join_165: {
    forward_join_164: {
    forward_join_163: {
    forward_join_158: {
    forward_join_153: {
    forward_join_150: {
    forward_join_137: {
    forward_join_135: {
    forward_join_128: {
    forward_join_123: {
    forward_join_106: {
    forward_join_102: {
    forward_join_100: {
    forward_join_85: {
    forward_join_84: {
    forward_join_67: {
    forward_join_66: {
    forward_join_60: {
    forward_join_57: {
    forward_join_44: {
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    life5_3 = (__fieldRead693_0() ^ 113705796582956L);
    spill693_0 = __call693_1();
    life8_7 = __call693_2(p1);
    life7_8 = spill693_0;
    spill693_1 = __instanceOf693_3(life8_7);
    if (!((life7_8 != null))) {
        forwardValue693_44_0 = spill693_1;
        break forward_join_44;
    }
    if (!((spill693_1 != 0))) {
        break forward_join_42;
    }
    life9_19 = __call693_4(p3);
    spill693_2 = __call693_7(__call693_5(life9_19), __invokedynamic693_6(24946, (784551343779170037L ^ life5_3)));
    if (!((life7_8 != null))) {
        forwardValue693_44_0 = __integerCategory693_8(spill693_2);
        break forward_join_44;
    }
    if (!(spill693_2)) {
        break forward_join_42;
    }
    life10_40 = __call693_11(p0, __call693_10(p2, __call693_9(p3)));
    if (!((life10_40 == p1))) {
        break forward_join_40;
    }
    forwardValue693_41_0 = 1;
    break forward_join_41;
    }
    forwardValue693_41_0 = 0;
    }
    return __integerCategory693_12(forwardValue693_41_0);
    }
    forwardValue693_44_0 = __instanceOf693_13(life8_7);
    }
    if (!((life7_8 != null))) {
        forwardValue693_165_0 = forwardValue693_44_0;
        break forward_join_165;
    }
    if (!((forwardValue693_44_0 != 0))) {
        break forward_join_164;
    }
    life9_60 = __call693_14(p3);
    spill693_3 = life9_60;
    spill693_4 = __fieldRead693_15();
    if (!((life7_8 != null))) {
        forwardValue693_57_0 = spill693_3;
        forwardValue693_57_1 = spill693_4;
        break forward_join_57;
    }
    if (!((spill693_3 != spill693_4))) {
        break forward_join_60;
    }
    forwardValue693_57_0 = life9_60;
    forwardValue693_57_1 = __fieldRead693_16();
    }
    if (!((forwardValue693_57_0 != forwardValue693_57_1))) {
        break forward_join_60;
    }
    return __integerCategory693_17(0);
    }
    spill693_5 = __call693_18(p3);
    if (!((life7_8 != null))) {
        forwardValue693_66_0 = __integerCategory693_19(spill693_5);
        break forward_join_66;
    }
    if (!((!spill693_5))) {
        break forward_join_67;
    }
    forwardValue693_66_0 = 0;
    }
    return __integerCategory693_20(forwardValue693_66_0);
    }
    life10_93 = __call693_22(p2, __call693_21(p3));
    life11_97 = __call693_23(p0, life10_93);
    spill693_6 = __call693_24(life11_97);
    if (!((life7_8 != null))) {
        forwardValue693_85_0 = spill693_6;
        break forward_join_85;
    }
    if (!((spill693_6 != life8_7))) {
        break forward_join_84;
    }
    return __integerCategory693_25(0);
    }
    forwardValue693_85_0 = life8_7;
    }
    if (!((life7_8 != null))) {
        forwardValue693_102_0 = forwardValue693_85_0;
        break forward_join_102;
    }
    if (!((forwardValue693_85_0 == __fieldRead693_26()))) {
        break forward_join_100;
    }
    spill693_7 = life11_97;
    if (!((life7_8 != null))) {
        forwardValue693_106_0 = spill693_7;
        break forward_join_106;
    }
    if (!((__call693_28(spill693_7, __fieldRead693_27()) != __call693_30(p1, __fieldRead693_29())))) {
        break forward_join_100;
    }
    return __integerCategory693_31(0);
    }
    forwardValue693_102_0 = __call693_32(life11_97);
    }
    forwardValue693_106_0 = __call693_33(forwardValue693_102_0, life11_97, p0, life10_93);
    }
    life11_144 = forwardValue693_106_0;
    life12_148 = ((double) __call693_34(p3));
    spill693_8 = __numericCompare693_35(life12_148, 0x1.999999999999ap-2d);
    if (!((life7_8 != null))) {
        forwardValue693_128_0 = spill693_8;
        break forward_join_128;
    }
    if (!((spill693_8 < 0))) {
        break forward_join_123;
    }
    return __call693_39(__cast693_38(__call693_37(life11_144, __fieldRead693_36())));
    }
    spill693_9 = life12_148;
    if (!((life7_8 != null))) {
        forwardValue693_137_0 = spill693_9;
        break forward_join_137;
    }
    forwardValue693_128_0 = __numericCompare693_40(spill693_9, 0x1.3333333333333p-1d);
    }
    if (!((forwardValue693_128_0 > 0))) {
        break forward_join_135;
    }
    return __call693_44(__cast693_43(__call693_42(life11_144, __fieldRead693_41())));
    }
    forwardValue693_137_0 = __call693_45(p3);
    }
    life14_185 = forwardValue693_137_0;
    spill693_10 = __numericCompare693_46(life14_185, 0x1.999999999999ap-2d);
    if (!((life7_8 != null))) {
        forwardValue693_153_0 = spill693_10;
        break forward_join_153;
    }
    if (!((spill693_10 < 0))) {
        break forward_join_150;
    }
    return __call693_50(__cast693_49(__call693_48(life11_144, __fieldRead693_47())));
    }
    forwardValue693_153_0 = __numericCompare693_51(life14_185, 0x1.3333333333333p-1d);
    }
    if (!((life7_8 != null))) {
        forwardValue693_163_0 = forwardValue693_153_0;
        break forward_join_163;
    }
    if (!((forwardValue693_153_0 <= 0))) {
        break forward_join_158;
    }
    return __integerCategory693_52(1);
    }
    forwardValue693_163_0 = __integerCategory693_57(__call693_56(__cast693_55(__call693_54(life11_144, __fieldRead693_53()))));
    }
    return __integerCategory693_58(forwardValue693_163_0);
    }
    forwardValue693_165_0 = 0;
    }
    return __integerCategory693_59(forwardValue693_165_0);
}
public static void h693_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069300_0(p0);
}
public static void h693_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069301_0(p0);
}
public static void h693_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069302_0(p0);
}
public static void h693_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069303_0(p0);
}
public static void h693_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069304_0(p0);
}
public static void h693_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069305_0(p0);
}
public static void h693_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069306_0(p0);
}
public static void h693_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069307_0(p0);
}
public static void h693_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069308_0(p0);
}
public static void h693_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069309_0(p0);
}
public static void h693_10(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069310_0(p0);
}
public static void h693_11(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069311_0(p0);
}
public static void h693_12(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069312_0(p0);
}
public static void h693_13(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069313_0(p0);
}
public static void h693_14(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069314_0(p0);
}
public static void h693_15(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069315_0(p0);
}
public static void h693_16(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069316_0(p0);
}
public static void h693_17(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069317_0(p0);
}
public static void h693_18(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069318_0(p0);
}
public static void h693_19(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069319_0(p0);
}
public static void h693_20(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069320_0(p0);
}
public static void h693_21(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069321_0(p0);
}
private static native long __fieldRead693_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call693_1() throws Throwable;
private static native net.minecraft.block.Block __call693_2(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __instanceOf693_3(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call693_4(moom.lC a0) throws Throwable;
private static native java.lang.String __call693_5(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.String __invokedynamic693_6(int a0, long a1) throws Throwable;
private static native boolean __call693_7(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory693_8(boolean value) throws Throwable;
private static native moom.bs __call693_9(moom.lC a0) throws Throwable;
private static native moom.DT __call693_10(moom.DT a0, moom.bs a1) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call693_11(net.minecraft.world.IBlockAccess a0, moom.DT a1) throws Throwable;
private static native boolean __integerCategory693_12(int value) throws Throwable;
private static native int __instanceOf693_13(net.minecraft.block.Block a0) throws Throwable;
private static native moom.bs __call693_14(moom.lC a0) throws Throwable;
private static native moom.bs __fieldRead693_15() throws Throwable;
private static native moom.bs __fieldRead693_16() throws Throwable;
private static native boolean __integerCategory693_17(int value) throws Throwable;
private static native boolean __call693_18(moom.lC a0) throws Throwable;
private static native int __integerCategory693_19(boolean value) throws Throwable;
private static native boolean __integerCategory693_20(int value) throws Throwable;
private static native moom.bs __call693_21(moom.lC a0) throws Throwable;
private static native moom.DT __call693_22(moom.DT a0, moom.bs a1) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call693_23(net.minecraft.world.IBlockAccess a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call693_24(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native boolean __integerCategory693_25(int value) throws Throwable;
private static native moom.dW __fieldRead693_26() throws Throwable;
private static native moom.fw __fieldRead693_27() throws Throwable;
private static native java.lang.Comparable __call693_28(net.minecraft.block.state.IBlockState a0, moom.fw a1) throws Throwable;
private static native moom.fw __fieldRead693_29() throws Throwable;
private static native java.lang.Comparable __call693_30(net.minecraft.block.state.IBlockState a0, moom.fw a1) throws Throwable;
private static native boolean __integerCategory693_31(int value) throws Throwable;
private static native net.minecraft.block.Block __call693_32(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call693_33(net.minecraft.block.Block a0, net.minecraft.block.state.IBlockState a1, net.minecraft.world.IBlockAccess a2, moom.DT a3) throws Throwable;
private static native float __call693_34(moom.lC a0) throws Throwable;
private static native int __numericCompare693_35(double a0, double a1) throws Throwable;
private static native moom.fv __fieldRead693_36() throws Throwable;
private static native java.lang.Comparable __call693_37(net.minecraft.block.state.IBlockState a0, moom.fv a1) throws Throwable;
private static native java.lang.Boolean __cast693_38(java.lang.Comparable a0) throws Throwable;
private static native boolean __call693_39(java.lang.Boolean a0) throws Throwable;
private static native int __numericCompare693_40(double a0, double a1) throws Throwable;
private static native moom.fv __fieldRead693_41() throws Throwable;
private static native java.lang.Comparable __call693_42(net.minecraft.block.state.IBlockState a0, moom.fv a1) throws Throwable;
private static native java.lang.Boolean __cast693_43(java.lang.Comparable a0) throws Throwable;
private static native boolean __call693_44(java.lang.Boolean a0) throws Throwable;
private static native double __call693_45(moom.lC a0) throws Throwable;
private static native int __numericCompare693_46(double a0, double a1) throws Throwable;
private static native moom.fv __fieldRead693_47() throws Throwable;
private static native java.lang.Comparable __call693_48(net.minecraft.block.state.IBlockState a0, moom.fv a1) throws Throwable;
private static native java.lang.Boolean __cast693_49(java.lang.Comparable a0) throws Throwable;
private static native boolean __call693_50(java.lang.Boolean a0) throws Throwable;
private static native int __numericCompare693_51(double a0, double a1) throws Throwable;
private static native boolean __integerCategory693_52(int value) throws Throwable;
private static native moom.fv __fieldRead693_53() throws Throwable;
private static native java.lang.Comparable __call693_54(net.minecraft.block.state.IBlockState a0, moom.fv a1) throws Throwable;
private static native java.lang.Boolean __cast693_55(java.lang.Comparable a0) throws Throwable;
private static native boolean __call693_56(java.lang.Boolean a0) throws Throwable;
private static native int __integerCategory693_57(boolean value) throws Throwable;
private static native boolean __integerCategory693_58(int value) throws Throwable;
private static native boolean __integerCategory693_59(int value) throws Throwable;
private static native java.lang.Exception __call1069300_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069301_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069302_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069303_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069304_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069305_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069306_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069307_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069308_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069309_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069310_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069311_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069312_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069313_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069314_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069315_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069316_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069317_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069318_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069319_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069320_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069321_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.client.renderer.texture.TextureAtlasSprite __sourceHandlerCall_3c179327d374b951ec30(net.minecraft.world.IBlockAccess a0, net.minecraft.block.state.IBlockState a1, moom.DT a2, net.minecraft.block.state.IBlockState a3, int a4) throws E;
private static final class __SourceHandler_3c179327d374b951ec30 {

public static net.minecraft.client.renderer.texture.TextureAtlasSprite f694(net.minecraft.world.IBlockAccess p0, net.minecraft.block.state.IBlockState p1, moom.DT p2, net.minecraft.block.state.IBlockState p3, int p4) throws Throwable {
    int lexicalValue694_49_0;
    java.util.List lexicalValue694_60_0;
    java.util.List lexicalValue694_66_0;
    moom.lC lexicalValue694_84_0;
    net.minecraft.entity.Entity[] spill694_0;
    boolean spill694_1;
    java.util.List spill694_2;
    java.util.List spill694_3;
    moom.lC spill694_4;
    long life5_3;
    net.minecraft.block.state.IBlockState life3_11;
    net.minecraft.entity.Entity[] life7_12;
    net.minecraft.client.resources.model.IBakedModel life8_18;
    moom.bs life9_27;
    java.util.List life10_31;
    moom.lC life11_64;
    java.util.List life11_70;
    java.util.Iterator life12_80;
    java.lang.Object life13_86;
    moom.lC life14_89;
    lexical_join_88: {
    lexical_join_66: {
    lexical_join_60: {
    lexical_join_58: {
    lexical_join_49: {
    lexical_join_45: {
    lexical_join_34: {
    lexical_join_23: {
    life5_3 = (__fieldRead694_0() ^ 5409735918271L);
    spill694_0 = __call694_1();
    life3_11 = __call694_3(__call694_2(p3), p3, p0, p2);
    life7_12 = spill694_0;
    life8_18 = __call694_7(__call694_6(__call694_5(__call694_4())), life3_11);
    if (!((life8_18 == null))) {
        break lexical_join_23;
    }
    return null;
    }
    life9_27 = __call694_8(p4);
    life10_31 = __call694_9(life8_18, life9_27);
    if (!((life10_31 == null))) {
        break lexical_join_34;
    }
    return null;
    }
    spill694_1 = __call694_10();
    if (!((life7_12 != null))) {
        lexicalValue694_49_0 = __integerCategory694_11(spill694_1);
        break lexical_join_49;
    }
    if (!(spill694_1)) {
        break lexical_join_45;
    }
    life10_31 = __call694_12(p0, life3_11, p2, life9_27, life10_31);
    }
    spill694_2 = life10_31;
    if (!((life7_12 != null))) {
        lexicalValue694_60_0 = spill694_2;
        break lexical_join_60;
    }
    lexicalValue694_49_0 = __call694_13(spill694_2);
    }
    if (!((lexicalValue694_49_0 > 0))) {
        break lexical_join_58;
    }
    life11_64 = __cast694_15(__call694_14(life10_31, 0));
    return __call694_16(life11_64);
    }
    lexicalValue694_60_0 = __call694_17(life8_18);
    }
    life11_70 = lexicalValue694_60_0;
    spill694_3 = life11_70;
    if (!((life7_12 != null))) {
        lexicalValue694_66_0 = spill694_3;
        break lexical_join_66;
    }
    if (!((spill694_3 != null))) {
        break lexical_join_88;
    }
    lexicalValue694_66_0 = life11_70;
    }
    life12_80 = __call694_18(lexicalValue694_66_0);
    lexical_cycle_68: while (true) {
    lexical_join_86: {
    lexical_join_84: {
    if (!(__call694_19(life12_80))) {
        break lexical_join_88;
    }
    life13_86 = __call694_20(life12_80);
    life14_89 = __cast694_21(life13_86);
    spill694_4 = life14_89;
    if (!((life7_12 != null))) {
        lexicalValue694_84_0 = spill694_4;
        break lexical_join_84;
    }
    if (!((__call694_22(spill694_4) == life9_27))) {
        break lexical_join_86;
    }
    lexicalValue694_84_0 = life14_89;
    }
    return __call694_23(lexicalValue694_84_0);
    }
    if (!((life7_12 == null))) { continue lexical_cycle_68; }
    break lexical_cycle_68;
    }
    }
    return null;
}
public static void h694_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069400_0(p0);
}
public static void h694_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069401_0(p0);
}
public static void h694_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069402_0(p0);
}
public static void h694_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069403_0(p0);
}
public static void h694_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069404_0(p0);
}
public static void h694_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069405_0(p0);
}
public static void h694_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069406_0(p0);
}
private static native long __fieldRead694_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call694_1() throws Throwable;
private static native net.minecraft.block.Block __call694_2(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call694_3(net.minecraft.block.Block a0, net.minecraft.block.state.IBlockState a1, net.minecraft.world.IBlockAccess a2, moom.DT a3) throws Throwable;
private static native net.minecraft.client.Minecraft __call694_4() throws Throwable;
private static native net.minecraft.client.renderer.BlockRendererDispatcher __call694_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.renderer.BlockModelShapes __call694_6(net.minecraft.client.renderer.BlockRendererDispatcher a0) throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __call694_7(net.minecraft.client.renderer.BlockModelShapes a0, net.minecraft.block.state.IBlockState a1) throws Throwable;
private static native moom.bs __call694_8(int a0) throws Throwable;
private static native java.util.List __call694_9(net.minecraft.client.resources.model.IBakedModel a0, moom.bs a1) throws Throwable;
private static native boolean __call694_10() throws Throwable;
private static native int __integerCategory694_11(boolean value) throws Throwable;
private static native java.util.List __call694_12(net.minecraft.world.IBlockAccess a0, net.minecraft.block.state.IBlockState a1, moom.DT a2, moom.bs a3, java.util.List a4) throws Throwable;
private static native int __call694_13(java.util.List a0) throws Throwable;
private static native java.lang.Object __call694_14(java.util.List a0, int a1) throws Throwable;
private static native moom.lC __cast694_15(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call694_16(moom.lC a0) throws Throwable;
private static native java.util.List __call694_17(net.minecraft.client.resources.model.IBakedModel a0) throws Throwable;
private static native java.util.Iterator __call694_18(java.util.List a0) throws Throwable;
private static native boolean __call694_19(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call694_20(java.util.Iterator a0) throws Throwable;
private static native moom.lC __cast694_21(java.lang.Object a0) throws Throwable;
private static native moom.bs __call694_22(moom.lC a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call694_23(moom.lC a0) throws Throwable;
private static native java.lang.Exception __call1069400_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069401_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069402_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069403_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069404_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069405_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069406_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_1ba174d67ba3d53cd359(moom.Jc[][] a0) throws E;
private static final class __SourceHandler_1ba174d67ba3d53cd359 {

public static java.util.List f695(moom.Jc[][] p0) throws Throwable {
    moom.Jc[][] lexicalValue695_15_0;
    net.minecraft.entity.Entity[] spill695_0;
    moom.Jc[][] spill695_1;
    long life1_3;
    java.util.ArrayList life4_8;
    net.minecraft.entity.Entity[] life3_9;
    moom.Jc[][] life5_18;
    int life6_21;
    int life7_23;
    moom.Jc[] life8_30;
    java.util.ArrayList life9_32;
    lexical_join_45: {
    lexical_join_15: {
    life1_3 = (__fieldRead695_0() ^ 40657093934106L);
    spill695_0 = __call695_1();
    life4_8 = new java.util.ArrayList();
    life3_9 = spill695_0;
    spill695_1 = p0;
    if (!((life3_9 != null))) {
        lexicalValue695_15_0 = spill695_1;
        break lexical_join_15;
    }
    if (!((spill695_1 != null))) {
        break lexical_join_45;
    }
    lexicalValue695_15_0 = p0;
    }
    life5_18 = lexicalValue695_15_0;
    life6_21 = (life5_18).length;
    life7_23 = 0;
    lexical_cycle_21: while (true) {
    lexical_join_38: {
    if (!((life7_23 < life6_21))) {
        break lexical_join_45;
    }
    life8_30 = (life5_18)[life7_23];
    life9_32 = null;
    if (!((life8_30 != null))) {
        break lexical_join_38;
    }
    life9_32 = new java.util.ArrayList(__call695_2(life8_30));
    }
    __call695_3(life4_8, life9_32);
    life7_23 += 1;
    if (!((life3_9 == null))) { continue lexical_cycle_21; }
    break lexical_cycle_21;
    }
    }
    return life4_8;
}
public static void h695_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069500_0(p0);
}
private static native long __fieldRead695_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call695_1() throws Throwable;
private static native java.util.List __call695_2(moom.Jc[] a0) throws Throwable;
private static native boolean __call695_3(java.util.ArrayList a0, java.util.ArrayList a1) throws Throwable;
private static native java.lang.Exception __call1069500_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String[] __sourceHandlerCall_ff5687a7ea307bcb3961() throws E;
private static final class __SourceHandler_ff5687a7ea307bcb3961 {

public static java.lang.String[] f29() throws Throwable {
    int lexicalValue29_57_0;
    int lexicalValue29_79_0;
    int lexicalValue29_97_0;
    java.lang.String[] lexicalValue29_359_0;
    net.minecraft.entity.Entity[] spill29_0;
    boolean spill29_1;
    java.lang.String[] spill29_2;
    java.lang.String[] spill29_3;
    java.lang.String[] spill29_4;
    java.lang.String[] spill29_5;
    java.lang.String[] spill29_6;
    java.lang.String[] spill29_7;
    java.lang.String[] spill29_8;
    java.lang.String[] spill29_9;
    java.lang.String[] spill29_10;
    java.lang.String[] spill29_11;
    java.lang.String[] spill29_12;
    java.lang.String[] spill29_13;
    java.lang.String[] spill29_14;
    java.lang.String[] spill29_15;
    java.lang.String[] spill29_16;
    java.lang.String[] spill29_17;
    java.lang.String[] spill29_18;
    java.util.ArrayList spill29_19;
    java.lang.String spill29_20;
    int spill29_21;
    java.lang.String spill29_22;
    java.lang.String spill29_23;
    java.lang.String spill29_24;
    java.util.ArrayList spill29_25;
    java.lang.String spill29_26;
    int spill29_27;
    java.lang.String spill29_28;
    java.lang.String spill29_29;
    java.lang.String spill29_30;
    long life0_3;
    java.util.ArrayList life3_7;
    java.lang.String life4_14;
    net.minecraft.entity.Entity[] life2_15;
    java.lang.String[] life5_284;
    int life6_286;
    java.lang.String life7_296;
    lexical_join_359: {
    lexical_join_354: {
    lexical_join_97: {
    lexical_join_92: {
    lexical_join_79: {
    lexical_join_70: {
    lexical_join_57: {
    lexical_join_48: {
    life0_3 = (__fieldRead29_0() ^ 15291380505685L);
    life3_7 = new java.util.ArrayList();
    spill29_0 = __call29_1();
    life4_14 = __invokedynamic29_2(10487, (6670942618904243510L ^ life0_3));
    life2_15 = spill29_0;
    spill29_1 = __call29_4(new moom.DD(__invokedynamic29_3(31038, (7047429950350163198L ^ life0_3))));
    if (!((life2_15 != null))) {
        lexicalValue29_57_0 = __integerCategory29_5(spill29_1);
        break lexical_join_57;
    }
    if (!(spill29_1)) {
        break lexical_join_48;
    }
    __call29_8(life3_7, __invokedynamic29_7(life4_14, __invokedynamic29_6(13340, (4855956828823564771L ^ life0_3))));
    __call29_11(life3_7, __invokedynamic29_10(life4_14, __invokedynamic29_9(28839, (8750582264868992339L ^ life0_3))));
    }
    lexicalValue29_57_0 = __integerCategory29_14(__call29_13(new moom.DD(__invokedynamic29_12(29752, (5837130064766792151L ^ life0_3)))));
    }
    if (!((life2_15 != null))) {
        lexicalValue29_79_0 = lexicalValue29_57_0;
        break lexical_join_79;
    }
    if (!((lexicalValue29_57_0 != 0))) {
        break lexical_join_70;
    }
    __call29_17(life3_7, __invokedynamic29_16(life4_14, __invokedynamic29_15(15984, (7330343696914660234L ^ life0_3))));
    }
    lexicalValue29_79_0 = __integerCategory29_20(__call29_19(new moom.DD(__invokedynamic29_18(16414, (9088418521885656564L ^ life0_3)))));
    }
    if (!((life2_15 != null))) {
        lexicalValue29_97_0 = lexicalValue29_79_0;
        break lexical_join_97;
    }
    if (!((lexicalValue29_79_0 != 0))) {
        break lexical_join_92;
    }
    __call29_23(life3_7, __invokedynamic29_22(life4_14, __invokedynamic29_21(9469, (4780079322481598728L ^ life0_3))));
    }
    lexicalValue29_97_0 = __invokedynamic29_24(5260, (3744667437230270149L ^ life0_3));
    }
    java.lang.String[] __stackOp29_25_0 = new java.lang.String[lexicalValue29_97_0];
    spill29_2 = __stackOp29_25_0;
    (__stackOp29_25_0)[0] = __invokedynamic29_26(8213, (8088449424809731539L ^ life0_3));
    java.lang.String[] __stackOp29_27_0 = spill29_2;
    spill29_3 = __stackOp29_27_0;
    (__stackOp29_27_0)[1] = __invokedynamic29_28(21029, (5925626163251075014L ^ life0_3));
    java.lang.String[] __stackOp29_29_0 = spill29_3;
    spill29_4 = __stackOp29_29_0;
    (__stackOp29_29_0)[2] = __invokedynamic29_30(20641, (5273101974054098255L ^ life0_3));
    java.lang.String[] __stackOp29_31_0 = spill29_4;
    spill29_5 = __stackOp29_31_0;
    (__stackOp29_31_0)[3] = __invokedynamic29_32(26306, (6161252130836734759L ^ life0_3));
    java.lang.String[] __stackOp29_33_0 = spill29_5;
    spill29_6 = __stackOp29_33_0;
    (__stackOp29_33_0)[4] = __invokedynamic29_34(14137, (3592638878274925307L ^ life0_3));
    java.lang.String[] __stackOp29_35_0 = spill29_6;
    spill29_7 = __stackOp29_35_0;
    (__stackOp29_35_0)[5] = __invokedynamic29_36(26964, (4455193523013774516L ^ life0_3));
    java.lang.String[] __stackOp29_37_0 = spill29_7;
    spill29_8 = __stackOp29_37_0;
    (__stackOp29_37_0)[__invokedynamic29_38(5985, (6161400672371516717L ^ life0_3))] = __invokedynamic29_39(24058, (7283375422230910989L ^ life0_3));
    java.lang.String[] __stackOp29_40_0 = spill29_8;
    spill29_9 = __stackOp29_40_0;
    (__stackOp29_40_0)[__invokedynamic29_41(14029, (933219869287154860L ^ life0_3))] = __invokedynamic29_42(10130, (1058687444029874778L ^ life0_3));
    java.lang.String[] __stackOp29_43_0 = spill29_9;
    spill29_10 = __stackOp29_43_0;
    (__stackOp29_43_0)[__invokedynamic29_44(11927, (550515991698644169L ^ life0_3))] = __invokedynamic29_45(13790, (6556791376668471343L ^ life0_3));
    java.lang.String[] __stackOp29_46_0 = spill29_10;
    spill29_11 = __stackOp29_46_0;
    (__stackOp29_46_0)[__invokedynamic29_47(10834, (3110857590014941215L ^ life0_3))] = __invokedynamic29_48(30144, (6325224229485834301L ^ life0_3));
    java.lang.String[] __stackOp29_49_0 = spill29_11;
    spill29_12 = __stackOp29_49_0;
    (__stackOp29_49_0)[__invokedynamic29_50(1514, (3764619396134287249L ^ life0_3))] = __invokedynamic29_51(10803, (969143878774173658L ^ life0_3));
    java.lang.String[] __stackOp29_52_0 = spill29_12;
    spill29_13 = __stackOp29_52_0;
    (__stackOp29_52_0)[__invokedynamic29_53(10532, (8544764028558089030L ^ life0_3))] = __invokedynamic29_54(25864, (743704272936263918L ^ life0_3));
    java.lang.String[] __stackOp29_55_0 = spill29_13;
    spill29_14 = __stackOp29_55_0;
    (__stackOp29_55_0)[__invokedynamic29_56(235, (7234512075445777048L ^ life0_3))] = __invokedynamic29_57(12337, (1611108929457370588L ^ life0_3));
    java.lang.String[] __stackOp29_58_0 = spill29_14;
    spill29_15 = __stackOp29_58_0;
    (__stackOp29_58_0)[__invokedynamic29_59(12886, (7250788945688395796L ^ life0_3))] = __invokedynamic29_60(23748, (8786428606115109160L ^ life0_3));
    java.lang.String[] __stackOp29_61_0 = spill29_15;
    spill29_16 = __stackOp29_61_0;
    (__stackOp29_61_0)[__invokedynamic29_62(23808, (7821713971244035949L ^ life0_3))] = __invokedynamic29_63(31504, (2868413415166738156L ^ life0_3));
    java.lang.String[] __stackOp29_64_0 = spill29_16;
    spill29_17 = __stackOp29_64_0;
    (__stackOp29_64_0)[__invokedynamic29_65(14714, (6978152852584041231L ^ life0_3))] = __invokedynamic29_66(1546, (5886897094921880562L ^ life0_3));
    life5_284 = spill29_17;
    life6_286 = 0;
    lexical_cycle_269: while (true) {
    lexical_join_352: {
    lexical_join_351: {
    if (!((life6_286 < (life5_284).length))) {
        break lexical_join_354;
    }
    spill29_18 = life5_284;
    if (!((life2_15 != null))) {
        lexicalValue29_359_0 = spill29_18;
        break lexical_join_359;
    }
    life7_296 = (spill29_18)[life6_286];
    if (!((life2_15 != null))) {
        break lexical_join_352;
    }
    java.lang.Object __inlineStack29_68Token;
    if (!(__call29_71(new moom.DD(__invokedynamic29_70(__inlineStack29_68Output0((__inlineStack29_68Token = __inlineStack29_68Pack(life7_296, __invokedynamic29_67(28248, (6293224204179991464L ^ life0_3))))), __inlineStack29_68Output1(__inlineStack29_68Token), __invokedynamic29_69(5464, (9000554369668354222L ^ life0_3))))))) {
        break lexical_join_351;
    }
    spill29_19 = life3_7;
    spill29_20 = life4_14;
    spill29_21 = life6_286;
    java.lang.String __stackOp29_73_0 = life7_296;
    java.lang.String __stackOp29_73_1 = life7_296;
    java.lang.String __stackOp29_73_2 = __invokedynamic29_72(23967, (1807792262035462228L ^ life0_3));
    spill29_22 = __stackOp29_73_2;
    spill29_23 = __stackOp29_73_0;
    spill29_24 = __stackOp29_73_1;
    __discardScalar29_74(__stackOp29_73_2);
    java.lang.String __stackOp29_76_0 = spill29_24;
    java.lang.String __stackOp29_76_1 = __invokedynamic29_75(15727, (4264210647322245256L ^ life0_3));
    __call29_79(spill29_19, __invokedynamic29_78(spill29_20, spill29_21, spill29_22, spill29_23, __stackOp29_76_1, __stackOp29_76_0, __invokedynamic29_77(4722, (2315325402401019801L ^ life0_3))));
    spill29_25 = life3_7;
    spill29_26 = life4_14;
    spill29_27 = life6_286;
    java.lang.String __stackOp29_81_0 = life7_296;
    java.lang.String __stackOp29_81_1 = life7_296;
    java.lang.String __stackOp29_81_2 = __invokedynamic29_80(25952, (1356237935411060908L ^ life0_3));
    spill29_28 = __stackOp29_81_2;
    spill29_29 = __stackOp29_81_0;
    spill29_30 = __stackOp29_81_1;
    __discardScalar29_82(__stackOp29_81_2);
    java.lang.String __stackOp29_84_0 = spill29_30;
    java.lang.String __stackOp29_84_1 = __invokedynamic29_83(31529, (1951590416162389714L ^ life0_3));
    __call29_87(spill29_25, __invokedynamic29_86(spill29_26, spill29_27, spill29_28, spill29_29, __stackOp29_84_1, __stackOp29_84_0, __invokedynamic29_85(4722, (2315325402401019801L ^ life0_3))));
    }
    life6_286 += 1;
    }
    if (!((life2_15 == null))) { continue lexical_cycle_269; }
    break lexical_cycle_269;
    }
    }
    lexicalValue29_359_0 = __cast29_89(__call29_88(life3_7, new java.lang.String[0]));
    }
    return lexicalValue29_359_0;
}
public static java.lang.String[] h29_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3002900_0(p0);
}
public static java.lang.String[] h29_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3002901_0(p0);
}
public static java.lang.String[] h29_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3002902_0(p0);
}
public static java.lang.String[] h29_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3002903_0(p0);
}
public static java.lang.String[] h29_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3002904_0(p0);
}
public static java.lang.String[] h29_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3002905_0(p0);
}
public static java.lang.String[] h29_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3002906_0(p0);
}
private static native long __fieldRead29_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call29_1() throws Throwable;
private static native java.lang.String __invokedynamic29_2(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic29_3(int a0, long a1) throws Throwable;
private static native boolean __call29_4(moom.DD a0) throws Throwable;
private static native int __integerCategory29_5(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic29_6(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic29_7(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __call29_8(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic29_9(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic29_10(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __call29_11(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic29_12(int a0, long a1) throws Throwable;
private static native boolean __call29_13(moom.DD a0) throws Throwable;
private static native int __integerCategory29_14(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic29_15(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic29_16(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __call29_17(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic29_18(int a0, long a1) throws Throwable;
private static native boolean __call29_19(moom.DD a0) throws Throwable;
private static native int __integerCategory29_20(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic29_21(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic29_22(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __call29_23(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic29_24(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic29_26(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic29_28(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic29_30(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic29_32(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic29_34(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic29_36(int a0, long a1) throws Throwable;
private static native int __invokedynamic29_38(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic29_39(int a0, long a1) throws Throwable;
private static native int __invokedynamic29_41(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic29_42(int a0, long a1) throws Throwable;
private static native int __invokedynamic29_44(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic29_45(int a0, long a1) throws Throwable;
private static native int __invokedynamic29_47(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic29_48(int a0, long a1) throws Throwable;
private static native int __invokedynamic29_50(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic29_51(int a0, long a1) throws Throwable;
private static native int __invokedynamic29_53(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic29_54(int a0, long a1) throws Throwable;
private static native int __invokedynamic29_56(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic29_57(int a0, long a1) throws Throwable;
private static native int __invokedynamic29_59(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic29_60(int a0, long a1) throws Throwable;
private static native int __invokedynamic29_62(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic29_63(int a0, long a1) throws Throwable;
private static native int __invokedynamic29_65(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic29_66(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic29_67(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack29_68Pack(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack29_68Output0(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack29_68Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic29_69(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic29_70(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native boolean __call29_71(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic29_72(int a0, long a1) throws Throwable;
private static native void __discardScalar29_74(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic29_75(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic29_77(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic29_78(java.lang.String a0, int a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, java.lang.String a5, java.lang.String a6) throws Throwable;
private static native boolean __call29_79(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic29_80(int a0, long a1) throws Throwable;
private static native void __discardScalar29_82(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic29_83(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic29_85(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic29_86(java.lang.String a0, int a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, java.lang.String a5, java.lang.String a6) throws Throwable;
private static native boolean __call29_87(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object[] __call29_88(java.util.ArrayList a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.String[] __cast29_89(java.lang.Object[] a0) throws Throwable;
private static native java.lang.Exception __call3002900_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3002901_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3002902_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3002903_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3002904_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3002905_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3002906_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> moom.bK[] __sourceHandlerCall_10dcd6a818e8dd62a717(int a0, int a1) throws E;
private static final class __SourceHandler_10dcd6a818e8dd62a717 {

public static moom.bK[] f101(int p0, int p1) throws Throwable {
    long life2_3;
    life2_3 = (__fieldRead101_0() ^ 52454870070225L);
    switch (p0) {
case 0:
{
        return __fieldRead101_1();
    }
case 1:
{
        return __fieldRead101_2();
    }
case 2:
{
        if ((p1 == 1)) {
        return __fieldRead101_3();
    }
        return __fieldRead101_4();
    }
case 3:
{
        return __fieldRead101_5();
    }
case 4:
{
        return __fieldRead101_6();
    }
case 5:
{
        if ((p1 == 2)) {
        return __fieldRead101_7();
    }
        return __fieldRead101_8();
    }
default:
{
        java.lang.Object __inlineStack101_10Token;
        throw new java.lang.IllegalArgumentException(__invokedynamic101_11(__inlineStack101_10Output0((__inlineStack101_10Token = __inlineStack101_10Pack(p0, __invokedynamic101_9(7615, (5312571996179412982L ^ life2_3))))), __inlineStack101_10Output1(__inlineStack101_10Token)));
    }
}
}
public static moom.bK[] h101_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3010100_0(p0);
}
public static moom.bK[] h101_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3010101_0(p0);
}
public static moom.bK[] h101_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3010102_0(p0);
}
private static native long __fieldRead101_0() throws Throwable;
private static native moom.bK[] __fieldRead101_1() throws Throwable;
private static native moom.bK[] __fieldRead101_2() throws Throwable;
private static native moom.bK[] __fieldRead101_3() throws Throwable;
private static native moom.bK[] __fieldRead101_4() throws Throwable;
private static native moom.bK[] __fieldRead101_5() throws Throwable;
private static native moom.bK[] __fieldRead101_6() throws Throwable;
private static native moom.bK[] __fieldRead101_7() throws Throwable;
private static native moom.bK[] __fieldRead101_8() throws Throwable;
private static native java.lang.String __invokedynamic101_9(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack101_10Pack(int a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack101_10Output0(java.lang.Object token) throws Throwable;
private static native int __inlineStack101_10Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic101_11(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.Exception __call3010100_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3010101_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3010102_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> moom.lC[] __sourceHandlerCall_71a7f27cc44f3c12f7b3(net.minecraft.world.IBlockAccess a0, net.minecraft.block.state.IBlockState a1, moom.DT a2, moom.lC a3, moom.Mi a4) throws E;
private static final class __SourceHandler_71a7f27cc44f3c12f7b3 {

public static moom.lC[] f697(net.minecraft.world.IBlockAccess p0, net.minecraft.block.state.IBlockState p1, moom.DT p2, moom.lC p3, moom.Mi p4) throws Throwable {
    long life5_3;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life8_7;
    net.minecraft.entity.Entity[] life7_8;
    net.minecraft.block.Block life9_19;
    moom.bs life10_42;
    forward_join_35: {
    forward_join_31: {
    forward_join_15: {
    life5_3 = (__fieldRead697_0() ^ 89009719556289L);
    net.minecraft.entity.Entity[] spill697_0 = __call697_1();
    life8_7 = __call697_2(p3);
    life7_8 = spill697_0;
    if (!((life8_7 == null))) { break forward_join_15; }
    return __call697_3(p4, p3);
    }
    life9_19 = __call697_4(p1);
    if (!((life7_8 != null))) { break forward_join_31; }
    if (!(__call697_5(p0, p1, p2, p3, p4))) { break forward_join_35; }
    p3 = __call697_7(__fieldRead697_6(), p3);
    }
    return __call697_8(p4, p3);
    }
    life10_42 = __call697_9(p3);
    return __call697_10(p0, p1, p2, life10_42, p3, p4);
}
public static void h697_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069700_0(p0);
}
public static void h697_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069701_0(p0);
}
private static native long __fieldRead697_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call697_1() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call697_2(moom.lC a0) throws Throwable;
private static native moom.lC[] __call697_3(moom.Mi a0, moom.lC a1) throws Throwable;
private static native net.minecraft.block.Block __call697_4(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native boolean __call697_5(net.minecraft.world.IBlockAccess a0, net.minecraft.block.state.IBlockState a1, moom.DT a2, moom.lC a3, moom.Mi a4) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead697_6() throws Throwable;
private static native moom.lC __call697_7(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1) throws Throwable;
private static native moom.lC[] __call697_8(moom.Mi a0, moom.lC a1) throws Throwable;
private static native moom.bs __call697_9(moom.lC a0) throws Throwable;
private static native moom.lC[] __call697_10(net.minecraft.world.IBlockAccess a0, net.minecraft.block.state.IBlockState a1, moom.DT a2, moom.bs a3, moom.lC a4, moom.Mi a5) throws Throwable;
private static native java.lang.Exception __call1069700_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069701_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_beb321a97a743d9625f5(int a0, int a1) throws E;
private static final class __SourceHandler_beb321a97a743d9625f5 {

public static int f691(int p0, int p1) throws Throwable {
    int forestValue691_25_0;
    net.minecraft.entity.Entity[] spill691_0;
    int spill691_1;
    long life2_3;
    int life5_14;
    net.minecraft.entity.Entity[] life4_15;
    forest_join_25: {
    forest_join_24: {
    forest_join_22: {
    forest_join_20: {
    life2_3 = (__fieldRead691_0() ^ 16329602648717L);
    spill691_0 = __call691_1();
    life5_14 = ((p1 & __invokedynamic691_2(6449, (6941785540883316112L ^ life2_3))) >> 2);
    life4_15 = spill691_0;
    spill691_1 = life5_14;
    if (!((life4_15 != null))) {
        forestValue691_25_0 = spill691_1;
        break forest_join_25;
    }
    switch (spill691_1) {
case 1:
{
        break forest_join_20;
    }
case 2:
{
        break forest_join_22;
    }
default:
{
        break forest_join_24;
    }
}
    }
    return 2;
    }
    return 1;
    }
    forestValue691_25_0 = 0;
    }
    return forestValue691_25_0;
}
public static int h691_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069100_0(p0);
}
public static int h691_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069101_0(p0);
}
private static native long __fieldRead691_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call691_1() throws Throwable;
private static native int __invokedynamic691_2(int a0, long a1) throws Throwable;
private static native java.lang.Exception __call3069100_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069101_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_6e1e4708bbb912c2ad97(moom.Jc a0, java.util.List a1) throws E;
private static final class __SourceHandler_6e1e4708bbb912c2ad97 {

public static void f76(moom.Jc p0, java.util.List p1) throws Throwable {
    int lexicalValue76_27_0;
    int spill76_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    int life5_10;
    int life6_21;
    lexical_join_44: {
    life2_3 = (__fieldRead76_0() ^ 24953097442570L);
    life4_5 = __call76_1();
    if (!((__fieldRead76_2(p0) != null))) {
        break lexical_join_44;
    }
    life5_10 = 0;
    lexical_cycle_11: while (true) {
    lexical_join_41: {
    lexical_join_37: {
    lexical_join_27: {
    if (!((life5_10 < (__fieldRead76_3(p0)).length))) {
        break lexical_join_44;
    }
    life6_21 = __call76_5((__fieldRead76_4(p0))[life5_10]);
    spill76_0 = life6_21;
    if (!((life4_5 != null))) {
        lexicalValue76_27_0 = spill76_0;
        break lexical_join_27;
    }
    if (!((spill76_0 < 0))) {
        break lexical_join_37;
    }
    lexicalValue76_27_0 = life6_21;
    }
    int __stackOp76_7_0 = lexicalValue76_27_0;
    java.lang.String __stackOp76_7_1 = __invokedynamic76_6(2586, (344638783539300023L ^ life2_3));
    __call76_9(__invokedynamic76_8(__stackOp76_7_1, __stackOp76_7_0));
    if (!((life4_5 == null))) {
        break lexical_join_41;
    }
    }
    __call76_10(p0, p1, life6_21);
    }
    life5_10 += 1;
    if (!((life4_5 == null))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    return;
}
public static void h76_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007600_0(p0);
}
public static void h76_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007601_0(p0);
}
private static native long __fieldRead76_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call76_1() throws Throwable;
private static native moom.J_[] __fieldRead76_2(moom.Jc a0) throws Throwable;
private static native moom.J_[] __fieldRead76_3(moom.Jc a0) throws Throwable;
private static native moom.J_[] __fieldRead76_4(moom.Jc a0) throws Throwable;
private static native int __call76_5(moom.J_ a0) throws Throwable;
private static native java.lang.String __invokedynamic76_6(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic76_8(java.lang.String a0, int a1) throws Throwable;
private static native void __call76_9(java.lang.String a0) throws Throwable;
private static native void __call76_10(moom.Jc a0, java.util.List a1, int a2) throws Throwable;
private static native java.lang.Exception __call1007600_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1007601_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> moom.lC[] __sourceHandlerCall_134486faa8bb1cd52cef(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, int a5, moom.lC a6, int a7, moom.Mi a8) throws E;
private static final class __SourceHandler_134486faa8bb1cd52cef {

public static moom.lC[] f900150(moom.Jc p0, net.minecraft.world.IBlockAccess p1, net.minecraft.block.state.IBlockState p2, moom.DT p3, int p4, int p5, moom.lC p6, int p7, moom.Mi p8) throws Throwable {
    moom.lC forestValue900150_14_0;
    int forestValue900150_78_0;
    int forestValue900150_121_0;
    int forestValue900150_168_0;
    int forestValue900150_215_0;
    int forestValue900150_260_0;
    moom.LZ forestValue900150_336_0;
    moom.lC forestValue900150_336_1;
    net.minecraft.block.state.IBlockState forestValue900150_336_2;
    int forestValue900150_353_0;
    moom.LZ forestValue900150_395_0;
    moom.lC forestValue900150_395_1;
    net.minecraft.block.state.IBlockState forestValue900150_395_2;
    int forestValue900150_412_0;
    moom.LZ forestValue900150_454_0;
    moom.lC forestValue900150_454_1;
    net.minecraft.block.state.IBlockState forestValue900150_454_2;
    int forestValue900150_473_0;
    moom.LZ forestValue900150_513_0;
    moom.lC forestValue900150_513_1;
    net.minecraft.block.state.IBlockState forestValue900150_513_2;
    boolean[] forestValue900150_529_0;
    int forestValue900150_580_0;
    int forestValue900150_602_0;
    int forestValue900150_620_0;
    int forestValue900150_642_0;
    int forestValue900150_660_0;
    int forestValue900150_684_0;
    int forestValue900150_702_0;
    int forestValue900150_726_0;
    int forestValue900150_744_0;
    int forestValue900150_772_0;
    int forestValue900150_778_0;
    int forestValue900150_790_0;
    int forestValue900150_796_0;
    moom.lC spill900150_0;
    boolean spill900150_1;
    boolean spill900150_2;
    boolean spill900150_3;
    boolean spill900150_4;
    boolean spill900150_5;
    boolean spill900150_6;
    boolean spill900150_7;
    boolean spill900150_8;
    boolean spill900150_9;
    boolean spill900150_10;
    boolean spill900150_11;
    boolean spill900150_12;
    boolean spill900150_13;
    boolean spill900150_14;
    moom.LZ spill900150_15;
    moom.lC spill900150_16;
    net.minecraft.block.state.IBlockState spill900150_17;
    boolean spill900150_18;
    moom.LZ spill900150_19;
    moom.lC spill900150_20;
    net.minecraft.block.state.IBlockState spill900150_21;
    boolean spill900150_22;
    moom.LZ spill900150_23;
    moom.lC spill900150_24;
    net.minecraft.block.state.IBlockState spill900150_25;
    boolean[] spill900150_26;
    boolean[] spill900150_27;
    moom.LZ spill900150_28;
    moom.lC spill900150_29;
    net.minecraft.block.state.IBlockState spill900150_30;
    boolean spill900150_31;
    boolean spill900150_32;
    boolean spill900150_33;
    boolean spill900150_34;
    boolean spill900150_35;
    boolean spill900150_36;
    boolean spill900150_37;
    boolean spill900150_38;
    boolean spill900150_39;
    boolean spill900150_40;
    boolean spill900150_41;
    long life9_3;
    net.minecraft.entity.Entity[] life11_5;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life12_19;
    moom.bK[] life13_23;
    boolean[] life14_26;
    int life15_28;
    moom.LZ life15_57;
    java.lang.Object life16_140;
    moom.lC[] life17_143;
    java.lang.Object life16_201;
    moom.lC[] life17_204;
    java.lang.Object life16_262;
    moom.lC[] life17_265;
    java.lang.Object life16_323;
    moom.lC[] life17_326;
    moom.bK[] life17_341;
    boolean[] life18_344;
    int life19_346;
    java.lang.Object life19_435;
    moom.lC[] life20_438;
    java.lang.Object life19_510;
    moom.lC[] life20_513;
    java.lang.Object life19_585;
    moom.lC[] life20_588;
    java.lang.Object life19_659;
    moom.lC[] life20_662;
    boolean[] life19_676;
    int life20_678;
    java.lang.Object life20_1067;
    moom.lC[] life21_1070;
    java.lang.Object life16_1098;
    forest_join_852: {
    forest_join_826: {
    forest_join_824: {
    forest_join_813: {
    forest_join_796: {
    forest_join_790: {
    forest_join_787: {
    forest_join_778: {
    forest_join_772: {
    forest_join_769: {
    forest_join_744: {
    forest_join_741: {
    forest_join_726: {
    forest_join_723: {
    forest_join_702: {
    forest_join_699: {
    forest_join_684: {
    forest_join_681: {
    forest_join_660: {
    forest_join_657: {
    forest_join_642: {
    forest_join_639: {
    forest_join_620: {
    forest_join_617: {
    forest_join_602: {
    forest_join_599: {
    forest_join_580: {
    forest_join_577: {
    forest_join_555: {
    forest_join_529: {
    forest_join_527: {
    forest_join_525: {
    forest_join_514: {
    forest_join_513: {
    forest_join_473: {
    forest_join_468: {
    forest_join_466: {
    forest_join_455: {
    forest_join_454: {
    forest_join_412: {
    forest_join_409: {
    forest_join_407: {
    forest_join_396: {
    forest_join_395: {
    forest_join_353: {
    forest_join_350: {
    forest_join_348: {
    forest_join_337: {
    forest_join_336: {
    forest_join_291: {
    forest_join_260: {
    forest_join_259: {
    forest_join_257: {
    forest_join_215: {
    forest_join_212: {
    forest_join_210: {
    forest_join_168: {
    forest_join_165: {
    forest_join_163: {
    forest_join_121: {
    forest_join_118: {
    forest_join_116: {
    forest_join_78: {
    forest_join_75: {
    forest_join_46: {
    forest_join_14: {
    forest_join_13: {
    life9_3 = (__fieldRead900150_0() ^ 70020152784936L);
    life11_5 = __call900150_1();
    spill900150_0 = p6;
    if (!((life11_5 != null))) {
        forestValue900150_14_0 = spill900150_0;
        break forest_join_14;
    }
    if (!((!__call900150_2(spill900150_0)))) {
        break forest_join_13;
    }
    return null;
    }
    forestValue900150_14_0 = p6;
    }
    life12_19 = __call900150_3(forestValue900150_14_0);
    life13_23 = __call900150_4(p5, p4);
    life14_26 = __call900150_5(p8);
    life15_28 = 0;
    forest_cycle_25: while (true) {
    if (!((life15_28 < 4))) {
        break forest_join_46;
    }
    (life14_26)[life15_28] = __call900150_7(p0, p1, p2, __call900150_6((life13_23)[life15_28], p3), p5, life12_19, p7);
    life15_28 += 1;
    if (!((life11_5 == null))) {
        continue forest_cycle_25;
    }
    break forest_cycle_25;
    }
    }
    life15_57 = __call900150_9(p8, __fieldRead900150_8(p0));
    spill900150_1 = (life14_26)[0];
    if (!((life11_5 != null))) {
        forestValue900150_78_0 = __integerCategory900150_10(spill900150_1);
        break forest_join_78;
    }
    if (!(spill900150_1)) {
        break forest_join_75;
    }
    spill900150_2 = (life14_26)[1];
    if (!((life11_5 != null))) {
        forestValue900150_78_0 = __integerCategory900150_11(spill900150_2);
        break forest_join_78;
    }
    if (!(spill900150_2)) {
        break forest_join_75;
    }
    spill900150_3 = (life14_26)[2];
    if (!((life11_5 != null))) {
        forestValue900150_78_0 = __integerCategory900150_12(spill900150_3);
        break forest_join_78;
    }
    if (!(spill900150_3)) {
        break forest_join_75;
    }
    spill900150_4 = (life14_26)[3];
    if (!((life11_5 != null))) {
        forestValue900150_78_0 = __integerCategory900150_13(spill900150_4);
        break forest_join_78;
    }
    if (!((!spill900150_4))) {
        break forest_join_826;
    }
    }
    forestValue900150_78_0 = __integerCategory900150_14((life14_26)[0]);
    }
    if (!((life11_5 != null))) {
        forestValue900150_121_0 = forestValue900150_78_0;
        break forest_join_121;
    }
    if (!((forestValue900150_78_0 != 0))) {
        break forest_join_118;
    }
    spill900150_5 = (life14_26)[1];
    if (!((life11_5 != null))) {
        forestValue900150_121_0 = __integerCategory900150_15(spill900150_5);
        break forest_join_121;
    }
    if (!(spill900150_5)) {
        break forest_join_118;
    }
    spill900150_6 = (life14_26)[2];
    if (!((life11_5 != null))) {
        forestValue900150_121_0 = __integerCategory900150_16(spill900150_6);
        break forest_join_121;
    }
    if (!(spill900150_6)) {
        break forest_join_118;
    }
    __call900150_21(life15_57, __call900150_19((__fieldRead900150_17(p0))[5], p6, __fieldRead900150_18(p0)), __fieldRead900150_20(p0));
    life16_140 = null;
    life17_143 = __cast900150_22(life16_140);
    if (!((__call900150_23(life15_57) > 0))) {
        break forest_join_116;
    }
    __call900150_24(p8, 1);
    }
    return life17_143;
    }
    forestValue900150_121_0 = __integerCategory900150_25((life14_26)[0]);
    }
    if (!((life11_5 != null))) {
        forestValue900150_168_0 = forestValue900150_121_0;
        break forest_join_168;
    }
    if (!((forestValue900150_121_0 != 0))) {
        break forest_join_165;
    }
    spill900150_7 = (life14_26)[2];
    if (!((life11_5 != null))) {
        forestValue900150_168_0 = __integerCategory900150_26(spill900150_7);
        break forest_join_168;
    }
    if (!(spill900150_7)) {
        break forest_join_165;
    }
    spill900150_8 = (life14_26)[3];
    if (!((life11_5 != null))) {
        forestValue900150_168_0 = __integerCategory900150_27(spill900150_8);
        break forest_join_168;
    }
    if (!(spill900150_8)) {
        break forest_join_165;
    }
    __call900150_33(life15_57, __call900150_31((__fieldRead900150_28(p0))[__invokedynamic900150_29(5985, (6161349813063795024L ^ life9_3))], p6, __fieldRead900150_30(p0)), __fieldRead900150_32(p0));
    life16_201 = null;
    life17_204 = __cast900150_34(life16_201);
    if (!((__call900150_35(life15_57) > 0))) {
        break forest_join_163;
    }
    __call900150_36(p8, 1);
    }
    return life17_204;
    }
    forestValue900150_168_0 = __integerCategory900150_37((life14_26)[1]);
    }
    if (!((life11_5 != null))) {
        forestValue900150_215_0 = forestValue900150_168_0;
        break forest_join_215;
    }
    if (!((forestValue900150_168_0 != 0))) {
        break forest_join_212;
    }
    spill900150_9 = (life14_26)[2];
    if (!((life11_5 != null))) {
        forestValue900150_215_0 = __integerCategory900150_38(spill900150_9);
        break forest_join_215;
    }
    if (!(spill900150_9)) {
        break forest_join_212;
    }
    spill900150_10 = (life14_26)[3];
    if (!((life11_5 != null))) {
        forestValue900150_215_0 = __integerCategory900150_39(spill900150_10);
        break forest_join_215;
    }
    if (!(spill900150_10)) {
        break forest_join_212;
    }
    __call900150_45(life15_57, __call900150_43((__fieldRead900150_40(p0))[__invokedynamic900150_41(235, (7234491985919268581L ^ life9_3))], p6, __fieldRead900150_42(p0)), __fieldRead900150_44(p0));
    life16_262 = null;
    life17_265 = __cast900150_46(life16_262);
    if (!((__call900150_47(life15_57) > 0))) {
        break forest_join_210;
    }
    __call900150_48(p8, 1);
    }
    return life17_265;
    }
    forestValue900150_215_0 = __integerCategory900150_49((life14_26)[0]);
    }
    if (!((life11_5 != null))) {
        forestValue900150_260_0 = forestValue900150_215_0;
        break forest_join_260;
    }
    if (!((forestValue900150_215_0 != 0))) {
        break forest_join_259;
    }
    spill900150_11 = (life14_26)[1];
    if (!((life11_5 != null))) {
        forestValue900150_260_0 = __integerCategory900150_50(spill900150_11);
        break forest_join_260;
    }
    if (!(spill900150_11)) {
        break forest_join_259;
    }
    spill900150_12 = (life14_26)[3];
    if (!((life11_5 != null))) {
        forestValue900150_260_0 = __integerCategory900150_51(spill900150_12);
        break forest_join_260;
    }
    if (!(spill900150_12)) {
        break forest_join_259;
    }
    __call900150_57(life15_57, __call900150_55((__fieldRead900150_52(p0))[__invokedynamic900150_53(12886, (7250734272515859561L ^ life9_3))], p6, __fieldRead900150_54(p0)), __fieldRead900150_56(p0));
    life16_323 = null;
    life17_326 = __cast900150_58(life16_323);
    if (!((__call900150_59(life15_57) > 0))) {
        break forest_join_257;
    }
    __call900150_60(p8, 1);
    }
    return life17_326;
    }
    forestValue900150_260_0 = p5;
    }
    life17_341 = __call900150_61(forestValue900150_260_0, p4);
    life18_344 = __call900150_62(p8);
    life19_346 = 0;
    forest_cycle_268: while (true) {
    if (!((life19_346 < 4))) {
        break forest_join_291;
    }
    (life18_344)[life19_346] = __call900150_64(p0, p1, p2, __call900150_63((life17_341)[life19_346], p3), p5, life12_19, p7);
    life19_346 += 1;
    if (!((life11_5 != null))) {
        break forest_join_350;
    }
    if (!((life11_5 == null))) {
        continue forest_cycle_268;
    }
    break forest_cycle_268;
    }
    }
    spill900150_13 = (life14_26)[1];
    if (!((life11_5 != null))) {
        forestValue900150_353_0 = __integerCategory900150_65(spill900150_13);
        break forest_join_353;
    }
    if (!(spill900150_13)) {
        break forest_join_350;
    }
    spill900150_14 = (life14_26)[2];
    if (!((life11_5 != null))) {
        forestValue900150_353_0 = __integerCategory900150_66(spill900150_14);
        break forest_join_353;
    }
    if (!(spill900150_14)) {
        break forest_join_350;
    }
    spill900150_15 = life15_57;
    spill900150_16 = __call900150_69((__fieldRead900150_67(p0))[3], p6, __fieldRead900150_68(p0));
    spill900150_17 = __fieldRead900150_70(p0);
    if (!((life11_5 != null))) {
        forestValue900150_336_0 = spill900150_15;
        forestValue900150_336_1 = spill900150_16;
        forestValue900150_336_2 = spill900150_17;
        break forest_join_336;
    }
    __call900150_71(spill900150_15, spill900150_16, spill900150_17);
    if (!((life18_344)[3])) {
        break forest_join_337;
    }
    forestValue900150_336_0 = life15_57;
    forestValue900150_336_1 = __call900150_75((__fieldRead900150_72(p0))[__invokedynamic900150_73(5260, (3744612760266064568L ^ life9_3))], p6, __fieldRead900150_74(p0));
    forestValue900150_336_2 = __fieldRead900150_76(p0);
    }
    __call900150_77(forestValue900150_336_0, forestValue900150_336_1, forestValue900150_336_2);
    }
    life19_435 = null;
    life20_438 = __cast900150_78(life19_435);
    if (!((__call900150_79(life15_57) > 0))) {
        break forest_join_348;
    }
    __call900150_80(p8, 1);
    }
    return life20_438;
    }
    forestValue900150_353_0 = __integerCategory900150_81((life14_26)[0]);
    }
    if (!((life11_5 != null))) {
        forestValue900150_412_0 = forestValue900150_353_0;
        break forest_join_412;
    }
    if (!((forestValue900150_353_0 != 0))) {
        break forest_join_409;
    }
    spill900150_18 = (life14_26)[2];
    if (!((life11_5 != null))) {
        forestValue900150_412_0 = __integerCategory900150_82(spill900150_18);
        break forest_join_412;
    }
    if (!(spill900150_18)) {
        break forest_join_409;
    }
    spill900150_19 = life15_57;
    spill900150_20 = __call900150_85((__fieldRead900150_83(p0))[4], p6, __fieldRead900150_84(p0));
    spill900150_21 = __fieldRead900150_86(p0);
    if (!((life11_5 != null))) {
        forestValue900150_395_0 = spill900150_19;
        forestValue900150_395_1 = spill900150_20;
        forestValue900150_395_2 = spill900150_21;
        break forest_join_395;
    }
    __call900150_87(spill900150_19, spill900150_20, spill900150_21);
    if (!((life18_344)[2])) {
        break forest_join_396;
    }
    forestValue900150_395_0 = life15_57;
    forestValue900150_395_1 = __call900150_91((__fieldRead900150_88(p0))[__invokedynamic900150_89(23808, (7821764285023718160L ^ life9_3))], p6, __fieldRead900150_90(p0));
    forestValue900150_395_2 = __fieldRead900150_92(p0);
    }
    __call900150_93(forestValue900150_395_0, forestValue900150_395_1, forestValue900150_395_2);
    }
    life19_510 = null;
    life20_513 = __cast900150_94(life19_510);
    if (!((__call900150_95(life15_57) > 0))) {
        break forest_join_407;
    }
    __call900150_96(p8, 1);
    }
    return life20_513;
    }
    forestValue900150_412_0 = __integerCategory900150_97((life14_26)[1]);
    }
    if (!((life11_5 != null))) {
        forestValue900150_473_0 = forestValue900150_412_0;
        break forest_join_473;
    }
    if (!((forestValue900150_412_0 != 0))) {
        break forest_join_468;
    }
    spill900150_22 = (life14_26)[3];
    if (!((life11_5 != null))) {
        forestValue900150_473_0 = __integerCategory900150_98(spill900150_22);
        break forest_join_473;
    }
    if (!(spill900150_22)) {
        break forest_join_468;
    }
    spill900150_23 = life15_57;
    spill900150_24 = __call900150_102((__fieldRead900150_99(p0))[__invokedynamic900150_100(1514, (3764638905638966252L ^ life9_3))], p6, __fieldRead900150_101(p0));
    spill900150_25 = __fieldRead900150_103(p0);
    if (!((life11_5 != null))) {
        forestValue900150_454_0 = spill900150_23;
        forestValue900150_454_1 = spill900150_24;
        forestValue900150_454_2 = spill900150_25;
        break forest_join_454;
    }
    __call900150_104(spill900150_23, spill900150_24, spill900150_25);
    if (!((life18_344)[1])) {
        break forest_join_455;
    }
    forestValue900150_454_0 = life15_57;
    forestValue900150_454_1 = __call900150_107((__fieldRead900150_105(p0))[2], p6, __fieldRead900150_106(p0));
    forestValue900150_454_2 = __fieldRead900150_108(p0);
    }
    __call900150_109(forestValue900150_454_0, forestValue900150_454_1, forestValue900150_454_2);
    }
    life19_585 = null;
    life20_588 = __cast900150_110(life19_585);
    if (!((__call900150_111(life15_57) > 0))) {
        break forest_join_466;
    }
    __call900150_112(p8, 1);
    }
    return life20_588;
    }
    spill900150_26 = life14_26;
    if (!((life11_5 != null))) {
        forestValue900150_529_0 = spill900150_26;
        break forest_join_529;
    }
    forestValue900150_473_0 = __integerCategory900150_113((spill900150_26)[0]);
    }
    if (!((forestValue900150_473_0 != 0))) {
        break forest_join_527;
    }
    spill900150_27 = life14_26;
    if (!((life11_5 != null))) {
        forestValue900150_529_0 = spill900150_27;
        break forest_join_529;
    }
    if (!((spill900150_27)[3])) {
        break forest_join_527;
    }
    spill900150_28 = life15_57;
    spill900150_29 = __call900150_117((__fieldRead900150_114(p0))[__invokedynamic900150_115(10532, (8544784084258619195L ^ life9_3))], p6, __fieldRead900150_116(p0));
    spill900150_30 = __fieldRead900150_118(p0);
    if (!((life11_5 != null))) {
        forestValue900150_513_0 = spill900150_28;
        forestValue900150_513_1 = spill900150_29;
        forestValue900150_513_2 = spill900150_30;
        break forest_join_513;
    }
    __call900150_119(spill900150_28, spill900150_29, spill900150_30);
    if (!((life18_344)[0])) {
        break forest_join_514;
    }
    forestValue900150_513_0 = life15_57;
    forestValue900150_513_1 = __call900150_122((__fieldRead900150_120(p0))[0], p6, __fieldRead900150_121(p0));
    forestValue900150_513_2 = __fieldRead900150_123(p0);
    }
    __call900150_124(forestValue900150_513_0, forestValue900150_513_1, forestValue900150_513_2);
    }
    life19_659 = null;
    life20_662 = __cast900150_125(life19_659);
    if (!((__call900150_126(life15_57) > 0))) {
        break forest_join_525;
    }
    __call900150_127(p8, 1);
    }
    return life20_662;
    }
    forestValue900150_529_0 = __call900150_128(p8);
    }
    life19_676 = forestValue900150_529_0;
    life20_678 = 0;
    forest_cycle_532: while (true) {
    if (!((life20_678 < 4))) {
        break forest_join_555;
    }
    (life19_676)[life20_678] = __call900150_130(p0, p1, p2, __call900150_129((life13_23)[life20_678], p3), p5, life12_19, p7);
    life20_678 += 1;
    if (!((life11_5 != null))) {
        break forest_join_577;
    }
    if (!((life11_5 == null))) {
        continue forest_cycle_532;
    }
    break forest_cycle_532;
    }
    }
    spill900150_31 = (life14_26)[0];
    if (!((life11_5 != null))) {
        forestValue900150_580_0 = __integerCategory900150_131(spill900150_31);
        break forest_join_580;
    }
    if (!(spill900150_31)) {
        break forest_join_577;
    }
    __call900150_137(life15_57, __call900150_135((__fieldRead900150_132(p0))[__invokedynamic900150_133(10834, (3110806709232467042L ^ life9_3))], p6, __fieldRead900150_134(p0)), __fieldRead900150_136(p0));
    }
    forestValue900150_580_0 = __integerCategory900150_138((life14_26)[1]);
    }
    if (!((life11_5 != null))) {
        forestValue900150_602_0 = forestValue900150_580_0;
        break forest_join_602;
    }
    if (!((forestValue900150_580_0 != 0))) {
        break forest_join_599;
    }
    __call900150_144(life15_57, __call900150_142((__fieldRead900150_139(p0))[__invokedynamic900150_140(14029, (933165140514857169L ^ life9_3))], p6, __fieldRead900150_141(p0)), __fieldRead900150_143(p0));
    }
    forestValue900150_602_0 = __integerCategory900150_145((life14_26)[2]);
    }
    if (!((life11_5 != null))) {
        forestValue900150_620_0 = forestValue900150_602_0;
        break forest_join_620;
    }
    if (!((forestValue900150_602_0 != 0))) {
        break forest_join_617;
    }
    __call900150_150(life15_57, __call900150_148((__fieldRead900150_146(p0))[1], p6, __fieldRead900150_147(p0)), __fieldRead900150_149(p0));
    }
    forestValue900150_620_0 = __integerCategory900150_151((life14_26)[3]);
    }
    if (!((life11_5 != null))) {
        forestValue900150_642_0 = forestValue900150_620_0;
        break forest_join_642;
    }
    if (!((forestValue900150_620_0 != 0))) {
        break forest_join_639;
    }
    __call900150_157(life15_57, __call900150_155((__fieldRead900150_152(p0))[__invokedynamic900150_153(14714, (6978137727975714674L ^ life9_3))], p6, __fieldRead900150_154(p0)), __fieldRead900150_156(p0));
    }
    forestValue900150_642_0 = __integerCategory900150_158((life18_344)[0]);
    }
    if (!((life11_5 != null))) {
        forestValue900150_684_0 = forestValue900150_642_0;
        break forest_join_684;
    }
    if (!((forestValue900150_642_0 != 0))) {
        break forest_join_681;
    }
    spill900150_32 = (life19_676)[1];
    if (!((life11_5 != null))) {
        forestValue900150_660_0 = __integerCategory900150_159(spill900150_32);
        break forest_join_660;
    }
    if (!((!spill900150_32))) {
        break forest_join_657;
    }
    spill900150_33 = (life19_676)[2];
    if (!((life11_5 != null))) {
        forestValue900150_684_0 = __integerCategory900150_160(spill900150_33);
        break forest_join_684;
    }
    if (!(spill900150_33)) {
        break forest_join_681;
    }
    }
    forestValue900150_660_0 = __integerCategory900150_161((life14_26)[1]);
    }
    if (!((life11_5 != null))) {
        forestValue900150_684_0 = forestValue900150_660_0;
        break forest_join_684;
    }
    if (!((forestValue900150_660_0 == 0))) {
        break forest_join_681;
    }
    spill900150_34 = (life14_26)[2];
    if (!((life11_5 != null))) {
        forestValue900150_684_0 = __integerCategory900150_162(spill900150_34);
        break forest_join_684;
    }
    if (!((!spill900150_34))) {
        break forest_join_681;
    }
    __call900150_167(life15_57, __call900150_165((__fieldRead900150_163(p0))[0], p6, __fieldRead900150_164(p0)), __fieldRead900150_166(p0));
    }
    forestValue900150_684_0 = __integerCategory900150_168((life18_344)[1]);
    }
    if (!((life11_5 != null))) {
        forestValue900150_726_0 = forestValue900150_684_0;
        break forest_join_726;
    }
    if (!((forestValue900150_684_0 != 0))) {
        break forest_join_723;
    }
    spill900150_35 = (life19_676)[0];
    if (!((life11_5 != null))) {
        forestValue900150_702_0 = __integerCategory900150_169(spill900150_35);
        break forest_join_702;
    }
    if (!((!spill900150_35))) {
        break forest_join_699;
    }
    spill900150_36 = (life19_676)[2];
    if (!((life11_5 != null))) {
        forestValue900150_726_0 = __integerCategory900150_170(spill900150_36);
        break forest_join_726;
    }
    if (!(spill900150_36)) {
        break forest_join_723;
    }
    }
    forestValue900150_702_0 = __integerCategory900150_171((life14_26)[0]);
    }
    if (!((life11_5 != null))) {
        forestValue900150_726_0 = forestValue900150_702_0;
        break forest_join_726;
    }
    if (!((forestValue900150_702_0 == 0))) {
        break forest_join_723;
    }
    spill900150_37 = (life14_26)[2];
    if (!((life11_5 != null))) {
        forestValue900150_726_0 = __integerCategory900150_172(spill900150_37);
        break forest_join_726;
    }
    if (!((!spill900150_37))) {
        break forest_join_723;
    }
    __call900150_177(life15_57, __call900150_175((__fieldRead900150_173(p0))[2], p6, __fieldRead900150_174(p0)), __fieldRead900150_176(p0));
    }
    forestValue900150_726_0 = __integerCategory900150_178((life18_344)[2]);
    }
    if (!((life11_5 != null))) {
        forestValue900150_772_0 = forestValue900150_726_0;
        break forest_join_772;
    }
    if (!((forestValue900150_726_0 != 0))) {
        break forest_join_769;
    }
    spill900150_38 = (life19_676)[1];
    if (!((life11_5 != null))) {
        forestValue900150_744_0 = __integerCategory900150_179(spill900150_38);
        break forest_join_744;
    }
    if (!((!spill900150_38))) {
        break forest_join_741;
    }
    spill900150_39 = (life19_676)[3];
    if (!((life11_5 != null))) {
        forestValue900150_772_0 = __integerCategory900150_180(spill900150_39);
        break forest_join_772;
    }
    if (!(spill900150_39)) {
        break forest_join_769;
    }
    }
    forestValue900150_744_0 = __integerCategory900150_181((life14_26)[1]);
    }
    if (!((life11_5 != null))) {
        forestValue900150_772_0 = forestValue900150_744_0;
        break forest_join_772;
    }
    if (!((forestValue900150_744_0 == 0))) {
        break forest_join_769;
    }
    spill900150_40 = (life14_26)[3];
    if (!((life11_5 != null))) {
        forestValue900150_772_0 = __integerCategory900150_182(spill900150_40);
        break forest_join_772;
    }
    if (!((!spill900150_40))) {
        break forest_join_769;
    }
    __call900150_188(life15_57, __call900150_186((__fieldRead900150_183(p0))[__invokedynamic900150_184(23808, (7821764285023718160L ^ life9_3))], p6, __fieldRead900150_185(p0)), __fieldRead900150_187(p0));
    }
    forestValue900150_772_0 = __integerCategory900150_189((life18_344)[3]);
    }
    if (!((life11_5 != null))) {
        forestValue900150_778_0 = forestValue900150_772_0;
        break forest_join_778;
    }
    if (!((forestValue900150_772_0 != 0))) {
        break forest_join_813;
    }
    forestValue900150_778_0 = __integerCategory900150_190((life19_676)[0]);
    }
    if (!((life11_5 != null))) {
        forestValue900150_790_0 = forestValue900150_778_0;
        break forest_join_790;
    }
    if (!((forestValue900150_778_0 == 0))) {
        break forest_join_787;
    }
    spill900150_41 = (life19_676)[3];
    if (!((life11_5 != null))) {
        forestValue900150_790_0 = __integerCategory900150_191(spill900150_41);
        break forest_join_790;
    }
    if (!(spill900150_41)) {
        break forest_join_813;
    }
    }
    forestValue900150_790_0 = __integerCategory900150_192((life14_26)[0]);
    }
    if (!((life11_5 != null))) {
        forestValue900150_796_0 = forestValue900150_790_0;
        break forest_join_796;
    }
    if (!((forestValue900150_790_0 == 0))) {
        break forest_join_813;
    }
    forestValue900150_796_0 = __integerCategory900150_193((life14_26)[3]);
    }
    if (!((forestValue900150_796_0 == 0))) {
        break forest_join_813;
    }
    __call900150_199(life15_57, __call900150_197((__fieldRead900150_194(p0))[__invokedynamic900150_195(5260, (3744612760266064568L ^ life9_3))], p6, __fieldRead900150_196(p0)), __fieldRead900150_198(p0));
    }
    life20_1067 = null;
    life21_1070 = __cast900150_200(life20_1067);
    if (!((__call900150_201(life15_57) > 0))) {
        break forest_join_824;
    }
    __call900150_202(p8, 1);
    }
    return life21_1070;
    }
    __call900150_208(life15_57, __call900150_206((__fieldRead900150_203(p0))[__invokedynamic900150_204(11927, (550531133520378036L ^ life9_3))], p6, __fieldRead900150_205(p0)), __fieldRead900150_207(p0));
    life16_1098 = null;
    if (!((life11_5 != null))) {
        break forest_join_852;
    }
    if (!((__call900150_209(life15_57) > 0))) {
        break forest_join_852;
    }
    __call900150_210(p8, 1);
    }
    return __cast900150_211(life16_1098);
}
public static moom.lC[] h900150_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015000_0(p0);
}
public static moom.lC[] h900150_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015001_0(p0);
}
public static moom.lC[] h900150_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015002_0(p0);
}
public static moom.lC[] h900150_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015003_0(p0);
}
public static moom.lC[] h900150_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015004_0(p0);
}
public static moom.lC[] h900150_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015005_0(p0);
}
public static moom.lC[] h900150_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015006_0(p0);
}
public static moom.lC[] h900150_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015007_0(p0);
}
public static moom.lC[] h900150_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015008_0(p0);
}
public static moom.lC[] h900150_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015009_0(p0);
}
public static moom.lC[] h900150_10(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015010_0(p0);
}
public static moom.lC[] h900150_11(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015011_0(p0);
}
public static moom.lC[] h900150_12(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015012_0(p0);
}
public static moom.lC[] h900150_13(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015013_0(p0);
}
public static moom.lC[] h900150_14(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015014_0(p0);
}
public static moom.lC[] h900150_15(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015015_0(p0);
}
public static moom.lC[] h900150_16(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015016_0(p0);
}
public static moom.lC[] h900150_17(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015017_0(p0);
}
public static moom.lC[] h900150_18(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015018_0(p0);
}
public static moom.lC[] h900150_19(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015019_0(p0);
}
public static moom.lC[] h900150_20(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015020_0(p0);
}
public static moom.lC[] h900150_21(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015021_0(p0);
}
public static moom.lC[] h900150_22(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015022_0(p0);
}
public static moom.lC[] h900150_23(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015023_0(p0);
}
public static moom.lC[] h900150_24(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015024_0(p0);
}
public static moom.lC[] h900150_25(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015025_0(p0);
}
public static moom.lC[] h900150_26(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015026_0(p0);
}
public static moom.lC[] h900150_27(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015027_0(p0);
}
public static moom.lC[] h900150_28(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015028_0(p0);
}
public static moom.lC[] h900150_29(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015029_0(p0);
}
public static moom.lC[] h900150_30(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015030_0(p0);
}
public static moom.lC[] h900150_31(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015031_0(p0);
}
public static moom.lC[] h900150_32(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015032_0(p0);
}
public static moom.lC[] h900150_33(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015033_0(p0);
}
public static moom.lC[] h900150_34(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015034_0(p0);
}
public static moom.lC[] h900150_35(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015035_0(p0);
}
public static moom.lC[] h900150_36(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015036_0(p0);
}
public static moom.lC[] h900150_37(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015037_0(p0);
}
public static moom.lC[] h900150_38(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015038_0(p0);
}
public static moom.lC[] h900150_39(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015039_0(p0);
}
public static moom.lC[] h900150_40(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015040_0(p0);
}
public static moom.lC[] h900150_41(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015041_0(p0);
}
public static moom.lC[] h900150_42(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015042_0(p0);
}
public static moom.lC[] h900150_43(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015043_0(p0);
}
public static moom.lC[] h900150_44(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015044_0(p0);
}
public static moom.lC[] h900150_45(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015045_0(p0);
}
public static moom.lC[] h900150_46(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015046_0(p0);
}
public static moom.lC[] h900150_47(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015047_0(p0);
}
public static moom.lC[] h900150_48(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015048_0(p0);
}
public static moom.lC[] h900150_49(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015049_0(p0);
}
public static moom.lC[] h900150_50(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015050_0(p0);
}
public static moom.lC[] h900150_51(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015051_0(p0);
}
public static moom.lC[] h900150_52(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015052_0(p0);
}
public static moom.lC[] h900150_53(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015053_0(p0);
}
public static moom.lC[] h900150_54(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015054_0(p0);
}
public static moom.lC[] h900150_55(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015055_0(p0);
}
public static moom.lC[] h900150_56(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015056_0(p0);
}
public static moom.lC[] h900150_57(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015057_0(p0);
}
public static moom.lC[] h900150_58(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015058_0(p0);
}
public static moom.lC[] h900150_59(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015059_0(p0);
}
public static moom.lC[] h900150_60(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015060_0(p0);
}
public static moom.lC[] h900150_61(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015061_0(p0);
}
public static moom.lC[] h900150_62(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015062_0(p0);
}
public static moom.lC[] h900150_63(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015063_0(p0);
}
public static moom.lC[] h900150_64(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015064_0(p0);
}
public static moom.lC[] h900150_65(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015065_0(p0);
}
public static moom.lC[] h900150_66(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015066_0(p0);
}
public static moom.lC[] h900150_67(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015067_0(p0);
}
public static moom.lC[] h900150_68(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015068_0(p0);
}
public static moom.lC[] h900150_69(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015069_0(p0);
}
public static moom.lC[] h900150_70(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015070_0(p0);
}
public static moom.lC[] h900150_71(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015071_0(p0);
}
public static moom.lC[] h900150_72(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015072_0(p0);
}
public static moom.lC[] h900150_73(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015073_0(p0);
}
public static moom.lC[] h900150_74(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015074_0(p0);
}
public static moom.lC[] h900150_75(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015075_0(p0);
}
public static moom.lC[] h900150_76(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015076_0(p0);
}
public static moom.lC[] h900150_77(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015077_0(p0);
}
public static moom.lC[] h900150_78(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015078_0(p0);
}
public static moom.lC[] h900150_79(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015079_0(p0);
}
public static moom.lC[] h900150_80(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015080_0(p0);
}
public static moom.lC[] h900150_81(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015081_0(p0);
}
public static moom.lC[] h900150_82(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015082_0(p0);
}
public static moom.lC[] h900150_83(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015083_0(p0);
}
public static moom.lC[] h900150_84(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015084_0(p0);
}
public static moom.lC[] h900150_85(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015085_0(p0);
}
public static moom.lC[] h900150_86(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015086_0(p0);
}
public static moom.lC[] h900150_87(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015087_0(p0);
}
public static moom.lC[] h900150_88(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015088_0(p0);
}
public static moom.lC[] h900150_89(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015089_0(p0);
}
public static moom.lC[] h900150_90(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015090_0(p0);
}
public static moom.lC[] h900150_91(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015091_0(p0);
}
public static moom.lC[] h900150_92(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015092_0(p0);
}
public static moom.lC[] h900150_93(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015093_0(p0);
}
public static moom.lC[] h900150_94(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015094_0(p0);
}
public static moom.lC[] h900150_95(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015095_0(p0);
}
public static moom.lC[] h900150_96(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015096_0(p0);
}
public static moom.lC[] h900150_97(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015097_0(p0);
}
public static moom.lC[] h900150_98(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015098_0(p0);
}
public static moom.lC[] h900150_99(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015099_0(p0);
}
public static moom.lC[] h900150_100(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015100_0(p0);
}
public static moom.lC[] h900150_101(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015101_0(p0);
}
public static moom.lC[] h900150_102(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015102_0(p0);
}
public static moom.lC[] h900150_103(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015103_0(p0);
}
public static moom.lC[] h900150_104(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015104_0(p0);
}
public static moom.lC[] h900150_105(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015105_0(p0);
}
public static moom.lC[] h900150_106(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015106_0(p0);
}
public static moom.lC[] h900150_107(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015107_0(p0);
}
public static moom.lC[] h900150_108(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015108_0(p0);
}
public static moom.lC[] h900150_109(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015109_0(p0);
}
public static moom.lC[] h900150_110(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015110_0(p0);
}
public static moom.lC[] h900150_111(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015111_0(p0);
}
public static moom.lC[] h900150_112(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015112_0(p0);
}
public static moom.lC[] h900150_113(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015113_0(p0);
}
public static moom.lC[] h900150_114(java.lang.Throwable p0, moom.Mi p1, moom.LZ p2) throws Throwable {
    java.lang.Throwable life3_2;
    forest_join_8: {
    life3_2 = p0;
    if (!((__call93015114_0(p2) > 0))) {
        break forest_join_8;
    }
    __call93015114_1(p1, 1);
    }
    throw life3_2;
}
public static moom.lC[] h900150_115(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call93015115_0(p0);
}
private static native long __fieldRead900150_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call900150_1() throws Throwable;
private static native boolean __call900150_2(moom.lC a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call900150_3(moom.lC a0) throws Throwable;
private static native moom.bK[] __call900150_4(int a0, int a1) throws Throwable;
private static native boolean[] __call900150_5(moom.Mi a0) throws Throwable;
private static native moom.DT __call900150_6(moom.bK a0, moom.DT a1) throws Throwable;
private static native boolean __call900150_7(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native net.minecraft.util.EnumWorldBlockLayer __fieldRead900150_8(moom.Jc a0) throws Throwable;
private static native moom.LZ __call900150_9(moom.Mi a0, net.minecraft.util.EnumWorldBlockLayer a1) throws Throwable;
private static native int __integerCategory900150_10(boolean value) throws Throwable;
private static native int __integerCategory900150_11(boolean value) throws Throwable;
private static native int __integerCategory900150_12(boolean value) throws Throwable;
private static native int __integerCategory900150_13(boolean value) throws Throwable;
private static native int __integerCategory900150_14(boolean value) throws Throwable;
private static native int __integerCategory900150_15(boolean value) throws Throwable;
private static native int __integerCategory900150_16(boolean value) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead900150_17(moom.Jc a0) throws Throwable;
private static native int __fieldRead900150_18(moom.Jc a0) throws Throwable;
private static native moom.lC __call900150_19(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, int a2) throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead900150_20(moom.Jc a0) throws Throwable;
private static native void __call900150_21(moom.LZ a0, moom.lC a1, net.minecraft.block.state.IBlockState a2) throws Throwable;
private static native moom.lC[] __cast900150_22(java.lang.Object a0) throws Throwable;
private static native int __call900150_23(moom.LZ a0) throws Throwable;
private static native void __call900150_24(moom.Mi a0, int a1) throws Throwable;
private static native int __integerCategory900150_25(boolean value) throws Throwable;
private static native int __integerCategory900150_26(boolean value) throws Throwable;
private static native int __integerCategory900150_27(boolean value) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead900150_28(moom.Jc a0) throws Throwable;
private static native int __invokedynamic900150_29(int a0, long a1) throws Throwable;
private static native int __fieldRead900150_30(moom.Jc a0) throws Throwable;
private static native moom.lC __call900150_31(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, int a2) throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead900150_32(moom.Jc a0) throws Throwable;
private static native void __call900150_33(moom.LZ a0, moom.lC a1, net.minecraft.block.state.IBlockState a2) throws Throwable;
private static native moom.lC[] __cast900150_34(java.lang.Object a0) throws Throwable;
private static native int __call900150_35(moom.LZ a0) throws Throwable;
private static native void __call900150_36(moom.Mi a0, int a1) throws Throwable;
private static native int __integerCategory900150_37(boolean value) throws Throwable;
private static native int __integerCategory900150_38(boolean value) throws Throwable;
private static native int __integerCategory900150_39(boolean value) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead900150_40(moom.Jc a0) throws Throwable;
private static native int __invokedynamic900150_41(int a0, long a1) throws Throwable;
private static native int __fieldRead900150_42(moom.Jc a0) throws Throwable;
private static native moom.lC __call900150_43(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, int a2) throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead900150_44(moom.Jc a0) throws Throwable;
private static native void __call900150_45(moom.LZ a0, moom.lC a1, net.minecraft.block.state.IBlockState a2) throws Throwable;
private static native moom.lC[] __cast900150_46(java.lang.Object a0) throws Throwable;
private static native int __call900150_47(moom.LZ a0) throws Throwable;
private static native void __call900150_48(moom.Mi a0, int a1) throws Throwable;
private static native int __integerCategory900150_49(boolean value) throws Throwable;
private static native int __integerCategory900150_50(boolean value) throws Throwable;
private static native int __integerCategory900150_51(boolean value) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead900150_52(moom.Jc a0) throws Throwable;
private static native int __invokedynamic900150_53(int a0, long a1) throws Throwable;
private static native int __fieldRead900150_54(moom.Jc a0) throws Throwable;
private static native moom.lC __call900150_55(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, int a2) throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead900150_56(moom.Jc a0) throws Throwable;
private static native void __call900150_57(moom.LZ a0, moom.lC a1, net.minecraft.block.state.IBlockState a2) throws Throwable;
private static native moom.lC[] __cast900150_58(java.lang.Object a0) throws Throwable;
private static native int __call900150_59(moom.LZ a0) throws Throwable;
private static native void __call900150_60(moom.Mi a0, int a1) throws Throwable;
private static native moom.bK[] __call900150_61(int a0, int a1) throws Throwable;
private static native boolean[] __call900150_62(moom.Mi a0) throws Throwable;
private static native moom.DT __call900150_63(moom.bK a0, moom.DT a1) throws Throwable;
private static native boolean __call900150_64(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory900150_65(boolean value) throws Throwable;
private static native int __integerCategory900150_66(boolean value) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead900150_67(moom.Jc a0) throws Throwable;
private static native int __fieldRead900150_68(moom.Jc a0) throws Throwable;
private static native moom.lC __call900150_69(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, int a2) throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead900150_70(moom.Jc a0) throws Throwable;
private static native void __call900150_71(moom.LZ a0, moom.lC a1, net.minecraft.block.state.IBlockState a2) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead900150_72(moom.Jc a0) throws Throwable;
private static native int __invokedynamic900150_73(int a0, long a1) throws Throwable;
private static native int __fieldRead900150_74(moom.Jc a0) throws Throwable;
private static native moom.lC __call900150_75(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, int a2) throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead900150_76(moom.Jc a0) throws Throwable;
private static native void __call900150_77(moom.LZ a0, moom.lC a1, net.minecraft.block.state.IBlockState a2) throws Throwable;
private static native moom.lC[] __cast900150_78(java.lang.Object a0) throws Throwable;
private static native int __call900150_79(moom.LZ a0) throws Throwable;
private static native void __call900150_80(moom.Mi a0, int a1) throws Throwable;
private static native int __integerCategory900150_81(boolean value) throws Throwable;
private static native int __integerCategory900150_82(boolean value) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead900150_83(moom.Jc a0) throws Throwable;
private static native int __fieldRead900150_84(moom.Jc a0) throws Throwable;
private static native moom.lC __call900150_85(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, int a2) throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead900150_86(moom.Jc a0) throws Throwable;
private static native void __call900150_87(moom.LZ a0, moom.lC a1, net.minecraft.block.state.IBlockState a2) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead900150_88(moom.Jc a0) throws Throwable;
private static native int __invokedynamic900150_89(int a0, long a1) throws Throwable;
private static native int __fieldRead900150_90(moom.Jc a0) throws Throwable;
private static native moom.lC __call900150_91(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, int a2) throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead900150_92(moom.Jc a0) throws Throwable;
private static native void __call900150_93(moom.LZ a0, moom.lC a1, net.minecraft.block.state.IBlockState a2) throws Throwable;
private static native moom.lC[] __cast900150_94(java.lang.Object a0) throws Throwable;
private static native int __call900150_95(moom.LZ a0) throws Throwable;
private static native void __call900150_96(moom.Mi a0, int a1) throws Throwable;
private static native int __integerCategory900150_97(boolean value) throws Throwable;
private static native int __integerCategory900150_98(boolean value) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead900150_99(moom.Jc a0) throws Throwable;
private static native int __invokedynamic900150_100(int a0, long a1) throws Throwable;
private static native int __fieldRead900150_101(moom.Jc a0) throws Throwable;
private static native moom.lC __call900150_102(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, int a2) throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead900150_103(moom.Jc a0) throws Throwable;
private static native void __call900150_104(moom.LZ a0, moom.lC a1, net.minecraft.block.state.IBlockState a2) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead900150_105(moom.Jc a0) throws Throwable;
private static native int __fieldRead900150_106(moom.Jc a0) throws Throwable;
private static native moom.lC __call900150_107(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, int a2) throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead900150_108(moom.Jc a0) throws Throwable;
private static native void __call900150_109(moom.LZ a0, moom.lC a1, net.minecraft.block.state.IBlockState a2) throws Throwable;
private static native moom.lC[] __cast900150_110(java.lang.Object a0) throws Throwable;
private static native int __call900150_111(moom.LZ a0) throws Throwable;
private static native void __call900150_112(moom.Mi a0, int a1) throws Throwable;
private static native int __integerCategory900150_113(boolean value) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead900150_114(moom.Jc a0) throws Throwable;
private static native int __invokedynamic900150_115(int a0, long a1) throws Throwable;
private static native int __fieldRead900150_116(moom.Jc a0) throws Throwable;
private static native moom.lC __call900150_117(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, int a2) throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead900150_118(moom.Jc a0) throws Throwable;
private static native void __call900150_119(moom.LZ a0, moom.lC a1, net.minecraft.block.state.IBlockState a2) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead900150_120(moom.Jc a0) throws Throwable;
private static native int __fieldRead900150_121(moom.Jc a0) throws Throwable;
private static native moom.lC __call900150_122(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, int a2) throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead900150_123(moom.Jc a0) throws Throwable;
private static native void __call900150_124(moom.LZ a0, moom.lC a1, net.minecraft.block.state.IBlockState a2) throws Throwable;
private static native moom.lC[] __cast900150_125(java.lang.Object a0) throws Throwable;
private static native int __call900150_126(moom.LZ a0) throws Throwable;
private static native void __call900150_127(moom.Mi a0, int a1) throws Throwable;
private static native boolean[] __call900150_128(moom.Mi a0) throws Throwable;
private static native moom.DT __call900150_129(moom.bK a0, moom.DT a1) throws Throwable;
private static native boolean __call900150_130(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory900150_131(boolean value) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead900150_132(moom.Jc a0) throws Throwable;
private static native int __invokedynamic900150_133(int a0, long a1) throws Throwable;
private static native int __fieldRead900150_134(moom.Jc a0) throws Throwable;
private static native moom.lC __call900150_135(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, int a2) throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead900150_136(moom.Jc a0) throws Throwable;
private static native void __call900150_137(moom.LZ a0, moom.lC a1, net.minecraft.block.state.IBlockState a2) throws Throwable;
private static native int __integerCategory900150_138(boolean value) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead900150_139(moom.Jc a0) throws Throwable;
private static native int __invokedynamic900150_140(int a0, long a1) throws Throwable;
private static native int __fieldRead900150_141(moom.Jc a0) throws Throwable;
private static native moom.lC __call900150_142(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, int a2) throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead900150_143(moom.Jc a0) throws Throwable;
private static native void __call900150_144(moom.LZ a0, moom.lC a1, net.minecraft.block.state.IBlockState a2) throws Throwable;
private static native int __integerCategory900150_145(boolean value) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead900150_146(moom.Jc a0) throws Throwable;
private static native int __fieldRead900150_147(moom.Jc a0) throws Throwable;
private static native moom.lC __call900150_148(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, int a2) throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead900150_149(moom.Jc a0) throws Throwable;
private static native void __call900150_150(moom.LZ a0, moom.lC a1, net.minecraft.block.state.IBlockState a2) throws Throwable;
private static native int __integerCategory900150_151(boolean value) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead900150_152(moom.Jc a0) throws Throwable;
private static native int __invokedynamic900150_153(int a0, long a1) throws Throwable;
private static native int __fieldRead900150_154(moom.Jc a0) throws Throwable;
private static native moom.lC __call900150_155(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, int a2) throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead900150_156(moom.Jc a0) throws Throwable;
private static native void __call900150_157(moom.LZ a0, moom.lC a1, net.minecraft.block.state.IBlockState a2) throws Throwable;
private static native int __integerCategory900150_158(boolean value) throws Throwable;
private static native int __integerCategory900150_159(boolean value) throws Throwable;
private static native int __integerCategory900150_160(boolean value) throws Throwable;
private static native int __integerCategory900150_161(boolean value) throws Throwable;
private static native int __integerCategory900150_162(boolean value) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead900150_163(moom.Jc a0) throws Throwable;
private static native int __fieldRead900150_164(moom.Jc a0) throws Throwable;
private static native moom.lC __call900150_165(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, int a2) throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead900150_166(moom.Jc a0) throws Throwable;
private static native void __call900150_167(moom.LZ a0, moom.lC a1, net.minecraft.block.state.IBlockState a2) throws Throwable;
private static native int __integerCategory900150_168(boolean value) throws Throwable;
private static native int __integerCategory900150_169(boolean value) throws Throwable;
private static native int __integerCategory900150_170(boolean value) throws Throwable;
private static native int __integerCategory900150_171(boolean value) throws Throwable;
private static native int __integerCategory900150_172(boolean value) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead900150_173(moom.Jc a0) throws Throwable;
private static native int __fieldRead900150_174(moom.Jc a0) throws Throwable;
private static native moom.lC __call900150_175(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, int a2) throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead900150_176(moom.Jc a0) throws Throwable;
private static native void __call900150_177(moom.LZ a0, moom.lC a1, net.minecraft.block.state.IBlockState a2) throws Throwable;
private static native int __integerCategory900150_178(boolean value) throws Throwable;
private static native int __integerCategory900150_179(boolean value) throws Throwable;
private static native int __integerCategory900150_180(boolean value) throws Throwable;
private static native int __integerCategory900150_181(boolean value) throws Throwable;
private static native int __integerCategory900150_182(boolean value) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead900150_183(moom.Jc a0) throws Throwable;
private static native int __invokedynamic900150_184(int a0, long a1) throws Throwable;
private static native int __fieldRead900150_185(moom.Jc a0) throws Throwable;
private static native moom.lC __call900150_186(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, int a2) throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead900150_187(moom.Jc a0) throws Throwable;
private static native void __call900150_188(moom.LZ a0, moom.lC a1, net.minecraft.block.state.IBlockState a2) throws Throwable;
private static native int __integerCategory900150_189(boolean value) throws Throwable;
private static native int __integerCategory900150_190(boolean value) throws Throwable;
private static native int __integerCategory900150_191(boolean value) throws Throwable;
private static native int __integerCategory900150_192(boolean value) throws Throwable;
private static native int __integerCategory900150_193(boolean value) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead900150_194(moom.Jc a0) throws Throwable;
private static native int __invokedynamic900150_195(int a0, long a1) throws Throwable;
private static native int __fieldRead900150_196(moom.Jc a0) throws Throwable;
private static native moom.lC __call900150_197(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, int a2) throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead900150_198(moom.Jc a0) throws Throwable;
private static native void __call900150_199(moom.LZ a0, moom.lC a1, net.minecraft.block.state.IBlockState a2) throws Throwable;
private static native moom.lC[] __cast900150_200(java.lang.Object a0) throws Throwable;
private static native int __call900150_201(moom.LZ a0) throws Throwable;
private static native void __call900150_202(moom.Mi a0, int a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead900150_203(moom.Jc a0) throws Throwable;
private static native int __invokedynamic900150_204(int a0, long a1) throws Throwable;
private static native int __fieldRead900150_205(moom.Jc a0) throws Throwable;
private static native moom.lC __call900150_206(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, int a2) throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead900150_207(moom.Jc a0) throws Throwable;
private static native void __call900150_208(moom.LZ a0, moom.lC a1, net.minecraft.block.state.IBlockState a2) throws Throwable;
private static native int __call900150_209(moom.LZ a0) throws Throwable;
private static native void __call900150_210(moom.Mi a0, int a1) throws Throwable;
private static native moom.lC[] __cast900150_211(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call93015000_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015001_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015002_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015003_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015004_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015005_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015006_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015007_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015008_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015009_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015010_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015011_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015012_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015013_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015014_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015015_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015016_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015017_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015018_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015019_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015020_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015021_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015022_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015023_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015024_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015025_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015026_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015027_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015028_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015029_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015030_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015031_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015032_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015033_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015034_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015035_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015036_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015037_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015038_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015039_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015040_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015041_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015042_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015043_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015044_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015045_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015046_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015047_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015048_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015049_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015050_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015051_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015052_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015053_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015054_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015055_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015056_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015057_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015058_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015059_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015060_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015061_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015062_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015063_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015064_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015065_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015066_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015067_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015068_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015069_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015070_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015071_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015072_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015073_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015074_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015075_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015076_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015077_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015078_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015079_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015080_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015081_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015082_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015083_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015084_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015085_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015086_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015087_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015088_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015089_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015090_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015091_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015092_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015093_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015094_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015095_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015096_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015097_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015098_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015099_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015100_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015101_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015102_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015103_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015104_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015105_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015106_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015107_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015108_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015109_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015110_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015111_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015112_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call93015113_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native int __call93015114_0(moom.LZ a0) throws Throwable;
private static native void __call93015114_1(moom.Mi a0, int a1) throws Throwable;
private static native java.lang.Exception __call93015115_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.client.renderer.texture.TextureAtlasSprite __sourceHandlerCall_d19c3b94bb1ccc5f71a7(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, int a5, net.minecraft.client.renderer.texture.TextureAtlasSprite a6, int a7) throws E;
private static final class __SourceHandler_d19c3b94bb1ccc5f71a7 {

public static net.minecraft.client.renderer.texture.TextureAtlasSprite f692(moom.Jc p0, net.minecraft.world.IBlockAccess p1, net.minecraft.block.state.IBlockState p2, moom.DT p3, int p4, int p5, net.minecraft.client.renderer.texture.TextureAtlasSprite p6, int p7) throws Throwable {
    int forestValue692_42_0;
    int forestValue692_86_0;
    int forestValue692_120_0;
    int forestValue692_120_1;
    int forestValue692_162_0;
    int forestValue692_196_0;
    int forestValue692_196_1;
    int forestValue692_238_0;
    int forestValue692_240_0;
    int forestValue692_254_0;
    int forestValue692_258_0;
    int forestValue692_266_0;
    net.minecraft.entity.Entity[] spill692_0;
    int spill692_1;
    int spill692_2;
    int spill692_3;
    int spill692_4;
    int spill692_5;
    int spill692_6;
    int spill692_7;
    int spill692_8;
    int spill692_9;
    int spill692_10;
    long life8_3;
    int life11_5;
    int life12_8;
    net.minecraft.entity.Entity[] life10_9;
    int life13_252;
    int life13_265;
    forest_join_267: {
    forest_join_266: {
    forest_join_265: {
    forest_join_258: {
    forest_join_257: {
    forest_join_254: {
    forest_join_253: {
    forest_join_240: {
    forest_join_239: {
    forest_join_238: {
    forest_join_219: {
    forest_join_196: {
    forest_join_192: {
    forest_join_165: {
    forest_join_162: {
    forest_join_143: {
    forest_join_120: {
    forest_join_116: {
    forest_join_89: {
    forest_join_86: {
    forest_join_67: {
    forest_join_42: {
    forest_join_41: {
    forest_join_14: {
    life8_3 = (__fieldRead692_0() ^ 11018900470350L);
    life11_5 = 0;
    spill692_0 = __call692_1();
    life12_8 = 0;
    life10_9 = spill692_0;
    spill692_1 = p4;
    if (!((life10_9 != null))) {
        forestValue692_240_0 = spill692_1;
        break forest_join_240;
    }
    switch (spill692_1) {
case 0:
{
        break forest_join_14;
    }
case 1:
{
        break forest_join_89;
    }
case 2:
{
        break forest_join_165;
    }
default:
{
        break forest_join_239;
    }
}
    }
    spill692_2 = p5;
    if (!((life10_9 != null))) {
        forestValue692_42_0 = spill692_2;
        break forest_join_42;
    }
    if (!((spill692_2 == 1))) {
        break forest_join_41;
    }
    life11_5 = __integerCategory692_4(__call692_3(p0, p1, p2, __call692_2(p3), p5, p6, p7));
    life12_8 = __integerCategory692_7(__call692_6(p0, p1, p2, __call692_5(p3), p5, p6, p7));
    if (!((life10_9 == null))) {
        break forest_join_239;
    }
    }
    forestValue692_42_0 = p5;
    }
    if (!((life10_9 != null))) {
        forestValue692_86_0 = forestValue692_42_0;
        break forest_join_86;
    }
    if (!((forestValue692_42_0 == 0))) {
        break forest_join_67;
    }
    life11_5 = __integerCategory692_10(__call692_9(p0, p1, p2, __call692_8(p3), p5, p6, p7));
    life12_8 = __integerCategory692_13(__call692_12(p0, p1, p2, __call692_11(p3), p5, p6, p7));
    if (!((life10_9 == null))) {
        break forest_join_239;
    }
    }
    life11_5 = __integerCategory692_16(__call692_15(p0, p1, p2, __call692_14(p3), p5, p6, p7));
    forestValue692_86_0 = __integerCategory692_19(__call692_18(p0, p1, p2, __call692_17(p3), p5, p6, p7));
    }
    life12_8 = forestValue692_86_0;
    if (!((life10_9 == null))) {
        break forest_join_239;
    }
    }
    spill692_3 = p5;
    spill692_4 = 3;
    if (!((life10_9 != null))) {
        forestValue692_120_0 = spill692_3;
        forestValue692_120_1 = spill692_4;
        break forest_join_120;
    }
    if (!((spill692_3 == spill692_4))) {
        break forest_join_116;
    }
    life11_5 = __integerCategory692_22(__call692_21(p0, p1, p2, __call692_20(p3), p5, p6, p7));
    life12_8 = __integerCategory692_25(__call692_24(p0, p1, p2, __call692_23(p3), p5, p6, p7));
    if (!((life10_9 == null))) {
        break forest_join_239;
    }
    }
    spill692_5 = p5;
    if (!((life10_9 != null))) {
        forestValue692_162_0 = spill692_5;
        break forest_join_162;
    }
    forestValue692_120_0 = spill692_5;
    forestValue692_120_1 = 2;
    }
    if (!((forestValue692_120_0 == forestValue692_120_1))) {
        break forest_join_143;
    }
    life11_5 = __integerCategory692_28(__call692_27(p0, p1, p2, __call692_26(p3), p5, p6, p7));
    life12_8 = __integerCategory692_31(__call692_30(p0, p1, p2, __call692_29(p3), p5, p6, p7));
    if (!((life10_9 == null))) {
        break forest_join_239;
    }
    }
    life11_5 = __integerCategory692_34(__call692_33(p0, p1, p2, __call692_32(p3), p5, p6, p7));
    forestValue692_162_0 = __integerCategory692_37(__call692_36(p0, p1, p2, __call692_35(p3), p5, p6, p7));
    }
    life12_8 = forestValue692_162_0;
    if (!((life10_9 == null))) {
        break forest_join_239;
    }
    }
    spill692_6 = p5;
    spill692_7 = 5;
    if (!((life10_9 != null))) {
        forestValue692_196_0 = spill692_6;
        forestValue692_196_1 = spill692_7;
        break forest_join_196;
    }
    if (!((spill692_6 == spill692_7))) {
        break forest_join_192;
    }
    life11_5 = __integerCategory692_40(__call692_39(p0, p1, p2, __call692_38(p3), p5, p6, p7));
    life12_8 = __integerCategory692_43(__call692_42(p0, p1, p2, __call692_41(p3), p5, p6, p7));
    if (!((life10_9 == null))) {
        break forest_join_239;
    }
    }
    spill692_8 = p5;
    if (!((life10_9 != null))) {
        forestValue692_238_0 = spill692_8;
        break forest_join_238;
    }
    forestValue692_196_0 = spill692_8;
    forestValue692_196_1 = 4;
    }
    if (!((forestValue692_196_0 == forestValue692_196_1))) {
        break forest_join_219;
    }
    life11_5 = __integerCategory692_46(__call692_45(p0, p1, p2, __call692_44(p3), p5, p6, p7));
    life12_8 = __integerCategory692_49(__call692_48(p0, p1, p2, __call692_47(p3), p5, p6, p7));
    if (!((life10_9 == null))) {
        break forest_join_239;
    }
    }
    life11_5 = __integerCategory692_52(__call692_51(p0, p1, p2, __call692_50(p3), p5, p6, p7));
    forestValue692_238_0 = __integerCategory692_55(__call692_54(p0, p1, p2, __call692_53(p3), p5, p6, p7));
    }
    life12_8 = forestValue692_238_0;
    }
    forestValue692_240_0 = 3;
    }
    life13_252 = forestValue692_240_0;
    spill692_9 = life11_5;
    if (!((life10_9 != null))) {
        forestValue692_258_0 = spill692_9;
        break forest_join_258;
    }
    if (!((spill692_9 != 0))) {
        break forest_join_257;
    }
    spill692_10 = life12_8;
    if (!((life10_9 != null))) {
        forestValue692_254_0 = spill692_10;
        break forest_join_254;
    }
    if (!((spill692_10 != 0))) {
        break forest_join_253;
    }
    life13_265 = 1;
    if (!((life10_9 == null))) {
        break forest_join_267;
    }
    }
    forestValue692_254_0 = 2;
    }
    life13_265 = forestValue692_254_0;
    if (!((life10_9 == null))) {
        break forest_join_267;
    }
    }
    forestValue692_258_0 = life12_8;
    }
    if (!((life10_9 != null))) {
        forestValue692_266_0 = forestValue692_258_0;
        break forest_join_266;
    }
    if (!((forestValue692_258_0 != 0))) {
        break forest_join_265;
    }
    life13_265 = 0;
    if (!((life10_9 == null))) {
        break forest_join_267;
    }
    }
    forestValue692_266_0 = 3;
    }
    life13_265 = forestValue692_266_0;
    }
    return (__fieldRead692_56(p0))[life13_265];
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h692_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069200_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h692_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069201_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h692_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069202_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h692_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069203_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h692_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069204_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h692_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069205_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h692_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069206_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h692_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069207_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h692_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069208_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h692_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069209_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h692_10(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069210_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h692_11(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069211_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h692_12(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069212_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h692_13(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069213_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h692_14(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069214_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h692_15(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069215_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h692_16(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069216_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h692_17(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069217_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h692_18(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069218_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h692_19(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069219_0(p0);
}
private static native long __fieldRead692_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call692_1() throws Throwable;
private static native moom.DT __call692_2(moom.DT a0) throws Throwable;
private static native boolean __call692_3(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory692_4(boolean value) throws Throwable;
private static native moom.DT __call692_5(moom.DT a0) throws Throwable;
private static native boolean __call692_6(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory692_7(boolean value) throws Throwable;
private static native moom.DT __call692_8(moom.DT a0) throws Throwable;
private static native boolean __call692_9(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory692_10(boolean value) throws Throwable;
private static native moom.DT __call692_11(moom.DT a0) throws Throwable;
private static native boolean __call692_12(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory692_13(boolean value) throws Throwable;
private static native moom.DT __call692_14(moom.DT a0) throws Throwable;
private static native boolean __call692_15(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory692_16(boolean value) throws Throwable;
private static native moom.DT __call692_17(moom.DT a0) throws Throwable;
private static native boolean __call692_18(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory692_19(boolean value) throws Throwable;
private static native moom.DT __call692_20(moom.DT a0) throws Throwable;
private static native boolean __call692_21(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory692_22(boolean value) throws Throwable;
private static native moom.DT __call692_23(moom.DT a0) throws Throwable;
private static native boolean __call692_24(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory692_25(boolean value) throws Throwable;
private static native moom.DT __call692_26(moom.DT a0) throws Throwable;
private static native boolean __call692_27(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory692_28(boolean value) throws Throwable;
private static native moom.DT __call692_29(moom.DT a0) throws Throwable;
private static native boolean __call692_30(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory692_31(boolean value) throws Throwable;
private static native moom.DT __call692_32(moom.DT a0) throws Throwable;
private static native boolean __call692_33(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory692_34(boolean value) throws Throwable;
private static native moom.DT __call692_35(moom.DT a0) throws Throwable;
private static native boolean __call692_36(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory692_37(boolean value) throws Throwable;
private static native moom.DT __call692_38(moom.DT a0) throws Throwable;
private static native boolean __call692_39(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory692_40(boolean value) throws Throwable;
private static native moom.DT __call692_41(moom.DT a0) throws Throwable;
private static native boolean __call692_42(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory692_43(boolean value) throws Throwable;
private static native moom.DT __call692_44(moom.DT a0) throws Throwable;
private static native boolean __call692_45(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory692_46(boolean value) throws Throwable;
private static native moom.DT __call692_47(moom.DT a0) throws Throwable;
private static native boolean __call692_48(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory692_49(boolean value) throws Throwable;
private static native moom.DT __call692_50(moom.DT a0) throws Throwable;
private static native boolean __call692_51(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory692_52(boolean value) throws Throwable;
private static native moom.DT __call692_53(moom.DT a0) throws Throwable;
private static native boolean __call692_54(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory692_55(boolean value) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead692_56(moom.Jc a0) throws Throwable;
private static native java.lang.Exception __call3069200_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069201_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069202_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069203_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069204_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069205_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069206_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069207_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069208_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069209_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069210_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069211_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069212_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069213_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069214_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069215_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069216_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069217_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069218_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069219_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_8051e604bd5839b7655a(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws E;
private static final class __SourceHandler_8051e604bd5839b7655a {

public static boolean f699(moom.Jc p0, net.minecraft.world.IBlockAccess p1, net.minecraft.block.state.IBlockState p2, moom.DT p3, int p4, net.minecraft.client.renderer.texture.TextureAtlasSprite p5, int p6) throws Throwable {
    net.minecraft.block.state.IBlockState forwardValue699_26_0;
    moom.Jc forwardValue699_40_0;
    net.minecraft.world.IBlockAccess forwardValue699_57_0;
    int forwardValue699_70_0;
    int forwardValue699_79_0;
    int forwardValue699_81_0;
    net.minecraft.entity.Entity[] spill699_0;
    moom.Jc spill699_1;
    net.minecraft.block.state.IBlockState spill699_2;
    moom.Jc spill699_3;
    net.minecraft.world.IBlockAccess spill699_4;
    boolean spill699_5;
    long life7_3;
    net.minecraft.block.state.IBlockState life10_8;
    net.minecraft.entity.Entity[] life9_9;
    moom.fB life11_41;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life11_72;
    net.minecraft.block.state.IBlockState life11_86;
    forward_join_81: {
    forward_join_80: {
    forward_join_79: {
    forward_join_78: {
    forward_join_70: {
    forward_join_57: {
    forward_join_56: {
    forward_join_40: {
    forward_join_39: {
    forward_join_26: {
    forward_join_15: {
    life7_3 = (__fieldRead699_0() ^ 83402271189178L);
    spill699_0 = __call699_1();
    life10_8 = __call699_2(p1, p3);
    life9_9 = spill699_0;
    if (!((life10_8 == __fieldRead699_3()))) {
        break forward_join_15;
    }
    return __integerCategory699_4(0);
    }
    spill699_1 = p0;
    if (!((life9_9 != null))) {
        forwardValue699_40_0 = spill699_1;
        break forward_join_40;
    }
    if (!((__fieldRead699_5(spill699_1) != null))) {
        break forward_join_39;
    }
    spill699_2 = life10_8;
    if (!((life9_9 != null))) {
        forwardValue699_26_0 = spill699_2;
        break forward_join_26;
    }
    if (!((__instanceOf699_6(spill699_2) != 0))) {
        break forward_join_39;
    }
    forwardValue699_26_0 = life10_8;
    }
    life11_41 = __cast699_7(forwardValue699_26_0);
    spill699_3 = p0;
    if (!((life9_9 != null))) {
        forwardValue699_40_0 = spill699_3;
        break forward_join_40;
    }
    if (!((!__call699_10(spill699_3, __call699_8(life11_41), __call699_9(life11_41))))) {
        break forward_join_39;
    }
    return __integerCategory699_11(0);
    }
    forwardValue699_40_0 = p0;
    }
    if (!((__fieldRead699_12(forwardValue699_40_0) != null))) {
        break forward_join_56;
    }
    spill699_4 = p1;
    if (!((life9_9 != null))) {
        forwardValue699_57_0 = spill699_4;
        break forward_join_57;
    }
    life11_72 = __call699_13(spill699_4, p2, p3, life10_8, p4);
    if (!((life11_72 != p5))) {
        break forward_join_56;
    }
    return __integerCategory699_14(0);
    }
    forwardValue699_57_0 = p1;
    }
    life11_86 = __call699_17(forwardValue699_57_0, __call699_16(p3, __call699_15(p4)));
    spill699_5 = __call699_19(__call699_18(life11_86));
    if (!((life9_9 != null))) {
        forwardValue699_70_0 = __integerCategory699_20(spill699_5);
        break forward_join_70;
    }
    if (!((!spill699_5))) {
        break forward_join_80;
    }
    forwardValue699_70_0 = p4;
    }
    if (!((life9_9 != null))) {
        forwardValue699_79_0 = forwardValue699_70_0;
        break forward_join_79;
    }
    if (!((forwardValue699_70_0 == 1))) {
        break forward_join_78;
    }
    if (!((__call699_21(life11_86) != __fieldRead699_22()))) {
        break forward_join_80;
    }
    }
    forwardValue699_79_0 = 1;
    }
    forwardValue699_81_0 = forwardValue699_79_0;
    break forward_join_81;
    }
    forwardValue699_81_0 = 0;
    }
    return __integerCategory699_23(forwardValue699_81_0);
}
public static void h699_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069900_0(p0);
}
public static void h699_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069901_0(p0);
}
public static void h699_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069902_0(p0);
}
public static void h699_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069903_0(p0);
}
public static void h699_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069904_0(p0);
}
public static void h699_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069905_0(p0);
}
public static void h699_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069906_0(p0);
}
public static void h699_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069907_0(p0);
}
public static void h699_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069908_0(p0);
}
public static void h699_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069909_0(p0);
}
public static void h699_10(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069910_0(p0);
}
public static void h699_11(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069911_0(p0);
}
public static void h699_12(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1069912_0(p0);
}
private static native long __fieldRead699_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call699_1() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call699_2(net.minecraft.world.IBlockAccess a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead699_3() throws Throwable;
private static native boolean __integerCategory699_4(int value) throws Throwable;
private static native moom.J_[] __fieldRead699_5(moom.Jc a0) throws Throwable;
private static native int __instanceOf699_6(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.fB __cast699_7(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __call699_8(moom.fB a0) throws Throwable;
private static native int __call699_9(moom.fB a0) throws Throwable;
private static native boolean __call699_10(moom.Jc a0, int a1, int a2) throws Throwable;
private static native boolean __integerCategory699_11(int value) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead699_12(moom.Jc a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call699_13(net.minecraft.world.IBlockAccess a0, net.minecraft.block.state.IBlockState a1, moom.DT a2, net.minecraft.block.state.IBlockState a3, int a4) throws Throwable;
private static native boolean __integerCategory699_14(int value) throws Throwable;
private static native moom.bs __call699_15(int a0) throws Throwable;
private static native moom.DT __call699_16(moom.DT a0, moom.bs a1) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call699_17(net.minecraft.world.IBlockAccess a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call699_18(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native boolean __call699_19(net.minecraft.block.Block a0) throws Throwable;
private static native int __integerCategory699_20(boolean value) throws Throwable;
private static native net.minecraft.block.Block __call699_21(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead699_22() throws Throwable;
private static native boolean __integerCategory699_23(int value) throws Throwable;
private static native java.lang.Exception __call1069900_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069901_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069902_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069903_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069904_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069905_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069906_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069907_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069908_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069909_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069910_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069911_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1069912_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> moom.bK[] __sourceHandlerCall_0a02c0f0e080d7b5f5bc(int a0, int a1) throws E;
private static final class __SourceHandler_0a02c0f0e080d7b5f5bc {

public static moom.bK[] f100(int p0, int p1) throws Throwable {
    long life2_3;
    life2_3 = (__fieldRead100_0() ^ 18951560351868L);
    switch (p0) {
case 0:
{
        return __fieldRead100_1();
    }
case 1:
{
        return __fieldRead100_2();
    }
case 2:
{
        if ((p1 == 1)) {
        return __fieldRead100_3();
    }
        return __fieldRead100_4();
    }
case 3:
{
        return __fieldRead100_5();
    }
case 4:
{
        return __fieldRead100_6();
    }
case 5:
{
        if ((p1 == 2)) {
        return __fieldRead100_7();
    }
        return __fieldRead100_8();
    }
default:
{
        java.lang.Object __inlineStack100_10Token;
        throw new java.lang.IllegalArgumentException(__invokedynamic100_11(__inlineStack100_10Output0((__inlineStack100_10Token = __inlineStack100_10Pack(p0, __invokedynamic100_9(108, (8887634839047358858L ^ life2_3))))), __inlineStack100_10Output1(__inlineStack100_10Token)));
    }
}
}
public static moom.bK[] h100_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3010000_0(p0);
}
public static moom.bK[] h100_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3010001_0(p0);
}
public static moom.bK[] h100_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3010002_0(p0);
}
private static native long __fieldRead100_0() throws Throwable;
private static native moom.bK[] __fieldRead100_1() throws Throwable;
private static native moom.bK[] __fieldRead100_2() throws Throwable;
private static native moom.bK[] __fieldRead100_3() throws Throwable;
private static native moom.bK[] __fieldRead100_4() throws Throwable;
private static native moom.bK[] __fieldRead100_5() throws Throwable;
private static native moom.bK[] __fieldRead100_6() throws Throwable;
private static native moom.bK[] __fieldRead100_7() throws Throwable;
private static native moom.bK[] __fieldRead100_8() throws Throwable;
private static native java.lang.String __invokedynamic100_9(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack100_10Pack(int a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack100_10Output0(java.lang.Object token) throws Throwable;
private static native int __inlineStack100_10Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic100_11(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.Exception __call3010000_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3010001_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3010002_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_80a72bf8f6b3e220c8ed(int a0, int a1) throws E;
private static final class __SourceHandler_80a72bf8f6b3e220c8ed {

public static int f694(int p0, int p1) throws Throwable {
    int forestValue694_15_0;
    int spill694_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forest_join_15: {
    forest_join_14: {
    forest_join_12: {
    forest_join_10: {
    life2_3 = (__fieldRead694_0() ^ 88593299714072L);
    life4_5 = __call694_1();
    spill694_0 = p1;
    if (!((life4_5 != null))) {
        forestValue694_15_0 = spill694_0;
        break forest_join_15;
    }
    switch (spill694_0) {
case 3:
{
        break forest_join_10;
    }
case 4:
{
        break forest_join_12;
    }
default:
{
        break forest_join_14;
    }
}
    }
    return 2;
    }
    return 1;
    }
    forestValue694_15_0 = 0;
    }
    return forestValue694_15_0;
}
public static int h694_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069400_0(p0);
}
public static int h694_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069401_0(p0);
}
private static native long __fieldRead694_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call694_1() throws Throwable;
private static native java.lang.Exception __call3069400_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069401_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> moom.lC[] __sourceHandlerCall_1dbc8ff7e286532274c9(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, int a5, moom.lC a6, int a7, moom.Mi a8) throws E;
private static final class __SourceHandler_1dbc8ff7e286532274c9 {

public static moom.lC[] f45(moom.Jc p0, net.minecraft.world.IBlockAccess p1, net.minecraft.block.state.IBlockState p2, moom.DT p3, int p4, int p5, moom.lC p6, int p7, moom.Mi p8) throws Throwable {
    long life9_3;
    net.minecraft.entity.Entity[] life11_5;
    moom.LZ life12_17;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life14_29;
    java.lang.Object life13_45;
    life9_3 = (__fieldRead45_0() ^ 16596595954487L);
    life11_5 = __call45_1();
    if ((!__call45_2(p6))) {
        return null;
    }
    life12_17 = __call45_4(p8, __fieldRead45_3(p0));
    life14_29 = __call45_6(p0, p1, p2, p3, p4, p5, __call45_5(p6), p7, p8);
    if ((life14_29 != null)) {
        __call45_10(life12_17, __call45_8(life14_29, p6, __fieldRead45_7(p0)), __fieldRead45_9(p0));
    }
    life13_45 = null;
    if ((life11_5 != null)) {
        if ((__call45_11(life12_17) > 0)) {
        __call45_12(p8, 1);
    }
    }
    return __cast45_13(life13_45);
}
public static moom.lC[] h45_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2004500_0(p0);
}
public static moom.lC[] h45_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2004501_0(p0);
}
public static moom.lC[] h45_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2004502_0(p0);
}
public static moom.lC[] h45_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2004503_0(p0);
}
public static moom.lC[] h45_4(java.lang.Throwable p0, moom.Mi p1, moom.LZ p2) throws Throwable {
    java.lang.Throwable local3 = p0;
    if ((__call2004504_0(p2) > 0)) {
        __call2004504_1(p1, 1);
    }
    throw local3;
}
public static moom.lC[] h45_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2004505_0(p0);
}
private static native long __fieldRead45_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call45_1() throws Throwable;
private static native boolean __call45_2(moom.lC a0) throws Throwable;
private static native net.minecraft.util.EnumWorldBlockLayer __fieldRead45_3(moom.Jc a0) throws Throwable;
private static native moom.LZ __call45_4(moom.Mi a0, net.minecraft.util.EnumWorldBlockLayer a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call45_5(moom.lC a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call45_6(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, int a5, net.minecraft.client.renderer.texture.TextureAtlasSprite a6, int a7, moom.Mi a8) throws Throwable;
private static native int __fieldRead45_7(moom.Jc a0) throws Throwable;
private static native moom.lC __call45_8(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, moom.lC a1, int a2) throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead45_9(moom.Jc a0) throws Throwable;
private static native void __call45_10(moom.LZ a0, moom.lC a1, net.minecraft.block.state.IBlockState a2) throws Throwable;
private static native int __call45_11(moom.LZ a0) throws Throwable;
private static native void __call45_12(moom.Mi a0, int a1) throws Throwable;
private static native moom.lC[] __cast45_13(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call2004500_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call2004501_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call2004502_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call2004503_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native int __call2004504_0(moom.LZ a0) throws Throwable;
private static native void __call2004504_1(moom.Mi a0, int a1) throws Throwable;
private static native java.lang.Exception __call2004505_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.client.renderer.texture.TextureAtlasSprite __sourceHandlerCall_0dac4b1ba5495eb2dd51(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, int a5, net.minecraft.client.renderer.texture.TextureAtlasSprite a6, int a7) throws E;
private static final class __SourceHandler_0dac4b1ba5495eb2dd51 {

public static net.minecraft.client.renderer.texture.TextureAtlasSprite f700(moom.Jc p0, net.minecraft.world.IBlockAccess p1, net.minecraft.block.state.IBlockState p2, moom.DT p3, int p4, int p5, net.minecraft.client.renderer.texture.TextureAtlasSprite p6, int p7) throws Throwable {
    net.minecraft.client.renderer.texture.TextureAtlasSprite forwardValue700_46_0;
    net.minecraft.client.renderer.texture.TextureAtlasSprite forwardValue700_62_0;
    net.minecraft.client.renderer.texture.TextureAtlasSprite forwardValue700_62_1;
    net.minecraft.client.renderer.texture.TextureAtlasSprite forwardValue700_75_0;
    net.minecraft.client.renderer.texture.TextureAtlasSprite forwardValue700_75_1;
    net.minecraft.client.renderer.texture.TextureAtlasSprite forwardValue700_83_0;
    net.minecraft.client.renderer.texture.TextureAtlasSprite forwardValue700_85_0;
    net.minecraft.entity.Entity[] spill700_0;
    net.minecraft.client.renderer.texture.TextureAtlasSprite spill700_1;
    net.minecraft.client.renderer.texture.TextureAtlasSprite spill700_2;
    net.minecraft.client.renderer.texture.TextureAtlasSprite spill700_3;
    net.minecraft.client.renderer.texture.TextureAtlasSprite spill700_4;
    net.minecraft.client.renderer.texture.TextureAtlasSprite spill700_5;
    net.minecraft.client.renderer.texture.TextureAtlasSprite spill700_6;
    long life8_3;
    net.minecraft.client.renderer.texture.TextureAtlasSprite[] life11_7;
    net.minecraft.entity.Entity[] life10_8;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life12_18;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life13_63;
    forward_join_85: {
    forward_join_84: {
    forward_join_83: {
    forward_join_75: {
    forward_join_69: {
    forward_join_62: {
    forward_join_58: {
    forward_join_46: {
    forward_join_37: {
    life8_3 = (__fieldRead700_0() ^ 129459866553705L);
    spill700_0 = __call700_1();
    life11_7 = __fieldRead700_2(p0);
    life10_8 = spill700_0;
    life12_18 = __call700_3(p0, p1, p2, p3, p4, p5, p6, p7);
    spill700_1 = life12_18;
    if (!((life10_8 != null))) {
        forwardValue700_46_0 = spill700_1;
        break forward_join_46;
    }
    if (!((spill700_1 != null))) {
        break forward_join_37;
    }
    spill700_2 = life12_18;
    if (!((life10_8 != null))) {
        forwardValue700_46_0 = spill700_2;
        break forward_join_46;
    }
    if (!((spill700_2 != p6))) {
        break forward_join_37;
    }
    spill700_3 = life12_18;
    if (!((life10_8 != null))) {
        forwardValue700_46_0 = spill700_3;
        break forward_join_46;
    }
    if (!((spill700_3 != (life11_7)[3]))) {
        break forward_join_37;
    }
    return life12_18;
    }
    forwardValue700_46_0 = __call700_4(p0, p1, p2, p3, p4, p5, p6, p7);
    }
    life13_63 = forwardValue700_46_0;
    spill700_4 = life13_63;
    spill700_5 = (life11_7)[0];
    if (!((life10_8 != null))) {
        forwardValue700_62_0 = spill700_4;
        forwardValue700_62_1 = spill700_5;
        break forward_join_62;
    }
    if (!((spill700_4 == spill700_5))) {
        break forward_join_58;
    }
    forwardValue700_85_0 = (life11_7)[4];
    break forward_join_85;
    }
    forwardValue700_62_0 = life13_63;
    forwardValue700_62_1 = (life11_7)[1];
    }
    if (!((life10_8 != null))) {
        forwardValue700_75_0 = forwardValue700_62_0;
        forwardValue700_75_1 = forwardValue700_62_1;
        break forward_join_75;
    }
    if (!((forwardValue700_62_0 == forwardValue700_62_1))) {
        break forward_join_69;
    }
    forwardValue700_85_0 = (life11_7)[5];
    break forward_join_85;
    }
    spill700_6 = life13_63;
    if (!((life10_8 != null))) {
        forwardValue700_83_0 = spill700_6;
        break forward_join_83;
    }
    forwardValue700_75_0 = spill700_6;
    forwardValue700_75_1 = (life11_7)[2];
    }
    if (!((forwardValue700_75_0 == forwardValue700_75_1))) {
        break forward_join_84;
    }
    forwardValue700_83_0 = (life11_7)[__invokedynamic700_5(6465, (796144705973746187L ^ life8_3))];
    }
    forwardValue700_85_0 = forwardValue700_83_0;
    break forward_join_85;
    }
    forwardValue700_85_0 = life13_63;
    }
    return forwardValue700_85_0;
}
public static void h700_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1070000_0(p0);
}
public static void h700_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1070001_0(p0);
}
public static void h700_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1070002_0(p0);
}
public static void h700_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1070003_0(p0);
}
public static void h700_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1070004_0(p0);
}
public static void h700_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1070005_0(p0);
}
public static void h700_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1070006_0(p0);
}
public static void h700_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1070007_0(p0);
}
public static void h700_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1070008_0(p0);
}
public static void h700_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1070009_0(p0);
}
public static void h700_10(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1070010_0(p0);
}
public static void h700_11(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1070011_0(p0);
}
private static native long __fieldRead700_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call700_1() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead700_2(moom.Jc a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call700_3(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, int a5, net.minecraft.client.renderer.texture.TextureAtlasSprite a6, int a7) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call700_4(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, int a5, net.minecraft.client.renderer.texture.TextureAtlasSprite a6, int a7) throws Throwable;
private static native int __invokedynamic700_5(int a0, long a1) throws Throwable;
private static native java.lang.Exception __call1070000_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1070001_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1070002_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1070003_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1070004_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1070005_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1070006_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1070007_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1070008_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1070009_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1070010_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1070011_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.client.renderer.texture.TextureAtlasSprite __sourceHandlerCall_360b9315ee7e58c0a160(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, int a5, net.minecraft.client.renderer.texture.TextureAtlasSprite a6, int a7) throws E;
private static final class __SourceHandler_360b9315ee7e58c0a160 {

public static net.minecraft.client.renderer.texture.TextureAtlasSprite f701(moom.Jc p0, net.minecraft.world.IBlockAccess p1, net.minecraft.block.state.IBlockState p2, moom.DT p3, int p4, int p5, net.minecraft.client.renderer.texture.TextureAtlasSprite p6, int p7) throws Throwable {
    net.minecraft.client.renderer.texture.TextureAtlasSprite forwardValue701_46_0;
    net.minecraft.client.renderer.texture.TextureAtlasSprite forwardValue701_62_0;
    net.minecraft.client.renderer.texture.TextureAtlasSprite forwardValue701_62_1;
    net.minecraft.client.renderer.texture.TextureAtlasSprite forwardValue701_75_0;
    net.minecraft.client.renderer.texture.TextureAtlasSprite forwardValue701_75_1;
    net.minecraft.client.renderer.texture.TextureAtlasSprite forwardValue701_83_0;
    net.minecraft.client.renderer.texture.TextureAtlasSprite forwardValue701_85_0;
    net.minecraft.entity.Entity[] spill701_0;
    net.minecraft.client.renderer.texture.TextureAtlasSprite spill701_1;
    net.minecraft.client.renderer.texture.TextureAtlasSprite spill701_2;
    net.minecraft.client.renderer.texture.TextureAtlasSprite spill701_3;
    net.minecraft.client.renderer.texture.TextureAtlasSprite spill701_4;
    net.minecraft.client.renderer.texture.TextureAtlasSprite spill701_5;
    net.minecraft.client.renderer.texture.TextureAtlasSprite spill701_6;
    long life8_3;
    net.minecraft.client.renderer.texture.TextureAtlasSprite[] life11_7;
    net.minecraft.entity.Entity[] life10_8;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life12_18;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life13_63;
    forward_join_85: {
    forward_join_84: {
    forward_join_83: {
    forward_join_75: {
    forward_join_69: {
    forward_join_62: {
    forward_join_58: {
    forward_join_46: {
    forward_join_37: {
    life8_3 = (__fieldRead701_0() ^ 74713667832321L);
    spill701_0 = __call701_1();
    life11_7 = __fieldRead701_2(p0);
    life10_8 = spill701_0;
    life12_18 = __call701_3(p0, p1, p2, p3, p4, p5, p6, p7);
    spill701_1 = life12_18;
    if (!((life10_8 != null))) {
        forwardValue701_46_0 = spill701_1;
        break forward_join_46;
    }
    if (!((spill701_1 != null))) {
        break forward_join_37;
    }
    spill701_2 = life12_18;
    if (!((life10_8 != null))) {
        forwardValue701_46_0 = spill701_2;
        break forward_join_46;
    }
    if (!((spill701_2 != p6))) {
        break forward_join_37;
    }
    spill701_3 = life12_18;
    if (!((life10_8 != null))) {
        forwardValue701_46_0 = spill701_3;
        break forward_join_46;
    }
    if (!((spill701_3 != (life11_7)[3]))) {
        break forward_join_37;
    }
    return life12_18;
    }
    forwardValue701_46_0 = __call701_4(p0, p1, p2, p3, p4, p5, p6, p7);
    }
    life13_63 = forwardValue701_46_0;
    spill701_4 = life13_63;
    spill701_5 = (life11_7)[0];
    if (!((life10_8 != null))) {
        forwardValue701_62_0 = spill701_4;
        forwardValue701_62_1 = spill701_5;
        break forward_join_62;
    }
    if (!((spill701_4 == spill701_5))) {
        break forward_join_58;
    }
    forwardValue701_85_0 = (life11_7)[4];
    break forward_join_85;
    }
    forwardValue701_62_0 = life13_63;
    forwardValue701_62_1 = (life11_7)[1];
    }
    if (!((life10_8 != null))) {
        forwardValue701_75_0 = forwardValue701_62_0;
        forwardValue701_75_1 = forwardValue701_62_1;
        break forward_join_75;
    }
    if (!((forwardValue701_62_0 == forwardValue701_62_1))) {
        break forward_join_69;
    }
    forwardValue701_85_0 = (life11_7)[5];
    break forward_join_85;
    }
    spill701_6 = life13_63;
    if (!((life10_8 != null))) {
        forwardValue701_83_0 = spill701_6;
        break forward_join_83;
    }
    forwardValue701_75_0 = spill701_6;
    forwardValue701_75_1 = (life11_7)[2];
    }
    if (!((forwardValue701_75_0 == forwardValue701_75_1))) {
        break forward_join_84;
    }
    forwardValue701_83_0 = (life11_7)[__invokedynamic701_5(5985, (6161486551783224185L ^ life8_3))];
    }
    forwardValue701_85_0 = forwardValue701_83_0;
    break forward_join_85;
    }
    forwardValue701_85_0 = life13_63;
    }
    return forwardValue701_85_0;
}
public static void h701_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1070100_0(p0);
}
public static void h701_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1070101_0(p0);
}
public static void h701_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1070102_0(p0);
}
public static void h701_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1070103_0(p0);
}
public static void h701_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1070104_0(p0);
}
public static void h701_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1070105_0(p0);
}
public static void h701_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1070106_0(p0);
}
public static void h701_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1070107_0(p0);
}
public static void h701_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1070108_0(p0);
}
public static void h701_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1070109_0(p0);
}
public static void h701_10(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1070110_0(p0);
}
public static void h701_11(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1070111_0(p0);
}
private static native long __fieldRead701_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call701_1() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead701_2(moom.Jc a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call701_3(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, int a5, net.minecraft.client.renderer.texture.TextureAtlasSprite a6, int a7) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call701_4(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, int a5, net.minecraft.client.renderer.texture.TextureAtlasSprite a6, int a7) throws Throwable;
private static native int __invokedynamic701_5(int a0, long a1) throws Throwable;
private static native java.lang.Exception __call1070100_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1070101_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1070102_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1070103_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1070104_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1070105_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1070106_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1070107_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1070108_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1070109_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1070110_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1070111_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.client.renderer.texture.TextureAtlasSprite __sourceHandlerCall_2a1731821f66fd567f3e(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, int a5, net.minecraft.client.renderer.texture.TextureAtlasSprite a6, int a7) throws E;
private static final class __SourceHandler_2a1731821f66fd567f3e {

public static net.minecraft.client.renderer.texture.TextureAtlasSprite f693(moom.Jc p0, net.minecraft.world.IBlockAccess p1, net.minecraft.block.state.IBlockState p2, moom.DT p3, int p4, int p5, net.minecraft.client.renderer.texture.TextureAtlasSprite p6, int p7) throws Throwable {
    int forestValue693_18_0;
    int forestValue693_32_0;
    int forestValue693_44_0;
    int forestValue693_44_1;
    int forestValue693_56_0;
    int forestValue693_68_0;
    int forestValue693_68_1;
    int forestValue693_80_0;
    int forestValue693_82_0;
    net.minecraft.entity.Entity[] spill693_0;
    int spill693_1;
    int spill693_2;
    int spill693_3;
    int spill693_4;
    int spill693_5;
    int spill693_6;
    int spill693_7;
    int spill693_8;
    long life8_3;
    int life11_6;
    net.minecraft.entity.Entity[] life10_7;
    forest_join_88: {
    forest_join_82: {
    forest_join_81: {
    forest_join_80: {
    forest_join_71: {
    forest_join_69: {
    forest_join_68: {
    forest_join_59: {
    forest_join_56: {
    forest_join_47: {
    forest_join_45: {
    forest_join_44: {
    forest_join_35: {
    forest_join_32: {
    forest_join_23: {
    forest_join_21: {
    forest_join_18: {
    forest_join_12: {
    life8_3 = (__fieldRead693_0() ^ 16840023314272L);
    spill693_0 = __call693_1();
    life11_6 = 0;
    life10_7 = spill693_0;
    spill693_1 = p4;
    if (!((life10_7 != null))) {
        forestValue693_82_0 = spill693_1;
        break forest_join_82;
    }
    switch (spill693_1) {
case 0:
{
        break forest_join_12;
    }
case 1:
{
        break forest_join_35;
    }
case 2:
{
        break forest_join_59;
    }
default:
{
        break forest_join_81;
    }
}
    }
    spill693_2 = p5;
    if (!((life10_7 != null))) {
        forestValue693_18_0 = spill693_2;
        break forest_join_18;
    }
    if (!((spill693_2 != 1))) {
        break forest_join_21;
    }
    forestValue693_18_0 = p5;
    }
    if (!((life10_7 != null))) {
        forestValue693_32_0 = forestValue693_18_0;
        break forest_join_32;
    }
    if (!((forestValue693_18_0 == 0))) {
        break forest_join_23;
    }
    }
    return null;
    }
    forestValue693_32_0 = __integerCategory693_4(__call693_3(p0, p1, p2, __call693_2(p3), p5, p6, p7));
    }
    life11_6 = forestValue693_32_0;
    if (!((life10_7 == null))) {
        break forest_join_81;
    }
    }
    spill693_3 = p5;
    spill693_4 = 3;
    if (!((life10_7 != null))) {
        forestValue693_44_0 = spill693_3;
        forestValue693_44_1 = spill693_4;
        break forest_join_44;
    }
    if (!((spill693_3 != spill693_4))) {
        break forest_join_45;
    }
    spill693_5 = p5;
    if (!((life10_7 != null))) {
        forestValue693_56_0 = spill693_5;
        break forest_join_56;
    }
    forestValue693_44_0 = spill693_5;
    forestValue693_44_1 = 2;
    }
    if (!((forestValue693_44_0 == forestValue693_44_1))) {
        break forest_join_47;
    }
    }
    return null;
    }
    forestValue693_56_0 = __integerCategory693_7(__call693_6(p0, p1, p2, __call693_5(p3), p5, p6, p7));
    }
    life11_6 = forestValue693_56_0;
    if (!((life10_7 == null))) {
        break forest_join_81;
    }
    }
    spill693_6 = p5;
    spill693_7 = 5;
    if (!((life10_7 != null))) {
        forestValue693_68_0 = spill693_6;
        forestValue693_68_1 = spill693_7;
        break forest_join_68;
    }
    if (!((spill693_6 != spill693_7))) {
        break forest_join_69;
    }
    spill693_8 = p5;
    if (!((life10_7 != null))) {
        forestValue693_80_0 = spill693_8;
        break forest_join_80;
    }
    forestValue693_68_0 = spill693_8;
    forestValue693_68_1 = 4;
    }
    if (!((forestValue693_68_0 == forestValue693_68_1))) {
        break forest_join_71;
    }
    }
    return null;
    }
    forestValue693_80_0 = __integerCategory693_10(__call693_9(p0, p1, p2, __call693_8(p3), p5, p6, p7));
    }
    life11_6 = forestValue693_80_0;
    }
    forestValue693_82_0 = life11_6;
    }
    if (!((forestValue693_82_0 != 0))) {
        break forest_join_88;
    }
    return (__fieldRead693_11(p0))[0];
    }
    return null;
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h693_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069300_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h693_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069301_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h693_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069302_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h693_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069303_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h693_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069304_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h693_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069305_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h693_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069306_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h693_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069307_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h693_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069308_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h693_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069309_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h693_10(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069310_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h693_11(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069311_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h693_12(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069312_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h693_13(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069313_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h693_14(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069314_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h693_15(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069315_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h693_16(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069316_0(p0);
}
private static native long __fieldRead693_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call693_1() throws Throwable;
private static native moom.DT __call693_2(moom.DT a0) throws Throwable;
private static native boolean __call693_3(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory693_4(boolean value) throws Throwable;
private static native moom.DT __call693_5(moom.DT a0) throws Throwable;
private static native boolean __call693_6(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory693_7(boolean value) throws Throwable;
private static native moom.DT __call693_8(moom.DT a0) throws Throwable;
private static native boolean __call693_9(moom.Jc a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, int a4, net.minecraft.client.renderer.texture.TextureAtlasSprite a5, int a6) throws Throwable;
private static native int __integerCategory693_10(boolean value) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead693_11(moom.Jc a0) throws Throwable;
private static native java.lang.Exception __call3069300_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069301_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069302_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069303_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069304_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069305_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069306_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069307_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069308_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069309_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069310_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069311_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069312_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069313_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069314_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069315_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069316_0(java.lang.IllegalArgumentException a0) throws Throwable;

}


private static boolean b(moom.Jc p0, net.minecraft.world.IBlockAccess p1, net.minecraft.block.state.IBlockState p2, moom.DT p3, int p4, net.minecraft.client.renderer.texture.TextureAtlasSprite p5, int p6) { return __sourceHandlerCall_8051e604bd5839b7655a(p0, p1, p2, p3, p4, p5, p6); }


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5283_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Jd"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.bK[] b__ArraybK(int p0, int p1) { return __sourceHandlerCall_0a02c0f0e080d7b5f5bc(p0, p1); }


private static int b(int p0, int p1) { return __sourceHandlerCall_beb321a97a743d9625f5(p0, p1); }


private static moom.lC[] b(moom.Jc p0, net.minecraft.world.IBlockAccess p1, net.minecraft.block.state.IBlockState p2, moom.DT p3, int p4, int p5, moom.lC p6, int p7, moom.Mi p8) { return __sourceHandlerCall_134486faa8bb1cd52cef(p0, p1, p2, p3, p4, p5, p6, p7, p8); }


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Jd.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 7536;
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
            throw new RuntimeException("moom/Jd", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         E[var3] = var15;
      }

      return E[var3];
}


private static void b(moom.Jc p0, java.util.List p1) { __sourceHandlerCall_6e1e4708bbb912c2ad97(p0, p1); }


private static void b(net.minecraft.client.renderer.texture.TextureMap p0) {
return;
}


private static net.minecraft.client.renderer.texture.TextureAtlasSprite b(moom.Jc p0, net.minecraft.world.IBlockAccess p1, net.minecraft.block.state.IBlockState p2, moom.DT p3, int p4, int p5, net.minecraft.client.renderer.texture.TextureAtlasSprite p6, int p7) { return __sourceHandlerCall_d19c3b94bb1ccc5f71a7(p0, p1, p2, p3, p4, p5, p6, p7); }


private static net.minecraft.client.renderer.texture.TextureAtlasSprite e(moom.Jc p0, net.minecraft.world.IBlockAccess p1, net.minecraft.block.state.IBlockState p2, moom.DT p3, int p4, int p5, net.minecraft.client.renderer.texture.TextureAtlasSprite p6, int p7) { return __sourceHandlerCall_2a1731821f66fd567f3e(p0, p1, p2, p3, p4, p5, p6, p7); }


private static boolean c(moom.Jc p0, net.minecraft.world.IBlockAccess p1, net.minecraft.block.state.IBlockState p2, moom.DT p3, int p4, net.minecraft.client.renderer.texture.TextureAtlasSprite p5, int p6) {
java.lang.Object local7 = ((net.minecraft.world.IBlockAccess)(p1)).a__fE(((moom.DT)(p3)));
    return (__sourceIntrinsic_booleanComparison((moom.Jd.a(((moom.Jc)(p0)), ((net.minecraft.world.IBlockAccess)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.DT)(p3)), ((net.minecraft.block.state.IBlockState)(local7)), ((int)(p4)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p5)), ((int)(p6))))) != 0);
}


private static int c(int p0, int p1) { return __sourceHandlerCall_80a72bf8f6b3e220c8ed(p0, p1); }


private static moom.lC[] c(moom.Jc p0, net.minecraft.world.IBlockAccess p1, net.minecraft.block.state.IBlockState p2, moom.DT p3, int p4, int p5, moom.lC p6, int p7, moom.Mi p8) { return __sourceHandlerCall_1dbc8ff7e286532274c9(p0, p1, p2, p3, p4, p5, p6, p7, p8); }


private static net.minecraft.client.renderer.texture.TextureAtlasSprite c(moom.Jc p0, net.minecraft.world.IBlockAccess p1, net.minecraft.block.state.IBlockState p2, moom.DT p3, int p4, int p5, net.minecraft.client.renderer.texture.TextureAtlasSprite p6, int p7) { return __sourceHandlerCall_0dac4b1ba5495eb2dd51(p0, p1, p2, p3, p4, p5, p6, p7); }


private static net.minecraft.client.renderer.texture.TextureAtlasSprite d(moom.Jc p0, net.minecraft.world.IBlockAccess p1, net.minecraft.block.state.IBlockState p2, moom.DT p3, int p4, int p5, net.minecraft.client.renderer.texture.TextureAtlasSprite p6, int p7) { return __sourceHandlerCall_360b9315ee7e58c0a160(p0, p1, p2, p3, p4, p5, p6, p7); }


private static java.util.List a(moom.Jc[][] p0) { return __sourceHandlerCall_1ba174d67ba3d53cd359(p0); }


private static boolean a() { return __sourceHandlerCall_00037f592a669492c948(); }


private static moom.Jc[][] a(java.util.List p0) { return __sourceHandlerCall_284fe5892a72b60fc6f1(p0); }


private static void a(moom.Jc p0, java.util.List p1) { __sourceHandlerCall_be624a1c5208d8bcd6a3(p0, p1); }


private static moom.lC a(moom.lC p0, net.minecraft.client.renderer.texture.TextureAtlasSprite p1) {
net.minecraft.entity.Entity[] spill861_0;
    long life2_3;
    int[] life5_8;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life6_12;
    net.minecraft.entity.Entity[] life4_13;
    int life7_15;
    lexical_join_27: {
    life2_3 = (moom.Jd.z ^ 43391885050817L);
    life5_8 = ((int[])(((int[])(((moom.lC)(p0)).a__ArrayInt())).clone()));
    spill861_0 = moom.JM.b__Arrayr3();
    life6_12 = ((moom.lC)(p0)).a__oh();
    life4_13 = spill861_0;
    life7_15 = 0;
    lexical_cycle_16: while (true) {
    if (!((life7_15 < 4))) {
        break lexical_join_27;
    }
    moom.Jd.a(((int[])(life5_8)), ((int)(life7_15)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(life6_12)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p1)));
    life7_15 += 1;
    if (!((life4_13 == null))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    return new moom.lC(life5_8, ((moom.lC)(p0)).a__Int(), ((moom.lC)(p0)).a__bs(), p1);
}


public static void a(net.minecraft.client.renderer.texture.TextureMap p0) { __sourceHandlerCall_ec6acb75fd0e5183aa81(p0); }


private static synchronized moom.lC a(net.minecraft.client.renderer.texture.TextureAtlasSprite p0, moom.lC p1, int p2) { return __sourceHandlerCall_a37ac2bee4f85e60a42f(p0, p1, p2); }


public static void a(net.minecraft.client.renderer.texture.TextureMap p0, net.minecraft.client.resources.IResourcePack p1) { __sourceHandlerCall_9d0da5f0cbd92e5ae85d(p0, p1); }


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
        byte[] spill2752_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2752_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2752_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2752_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2752_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2752_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 10995);
    if (((moom.Jd.B)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Jd.C)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Jd.C)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Jd", life9_51);
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
        life9_116 = ((java.lang.String)((moom.Jd.A)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Jd.B)[life5_8] = moom.Jd.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Jd.B)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Jd.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5304_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Jd"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static boolean a(net.minecraft.world.IBlockAccess p0, net.minecraft.block.state.IBlockState p1, moom.DT p2, moom.lC p3, moom.Mi p4) { return __sourceHandlerCall_68c1ca44f92342c3f877(p0, p1, p2, p3, p4); }


public static moom.lC[] a__ArraylC(net.minecraft.world.IBlockAccess p0, net.minecraft.block.state.IBlockState p1, moom.DT p2, moom.lC p3, moom.Mi p4) { return __sourceHandlerCall_71a7f27cc44f3c12f7b3(p0, p1, p2, p3, p4); }


private static void a(int p0, int p1, boolean[] p2) {
boolean local3 = (p2)[p0];
    (p2)[p0] = (p2)[p1];
    (p2)[p1] = local3;
    return;
}


private static synchronized moom.lC a(net.minecraft.client.renderer.texture.TextureAtlasSprite p0, moom.lC p1) { return __sourceHandlerCall_3ba98a796795b6d92fac(p0, p1); }


private static void a(moom.Jc p0, java.util.List p1, int p2) { __sourceHandlerCall_edc6f7aa6acea46d26d8(p0, p1, p2); }


private static java.lang.String[] a__ArrayString() { return __sourceHandlerCall_ff5687a7ea307bcb3961(); }


protected static moom.lC[] a(net.minecraft.client.renderer.texture.TextureAtlasSprite p0, moom.lC p1, moom.Mi p2) { return __sourceHandlerCall_fbe06dc717dba3a678ca(p0, p1, p2); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static net.minecraft.client.renderer.texture.TextureAtlasSprite a__oh(moom.Jc p0, net.minecraft.world.IBlockAccess p1, net.minecraft.block.state.IBlockState p2, moom.DT p3, int p4, int p5, net.minecraft.client.renderer.texture.TextureAtlasSprite p6, int p7, moom.Mi p8) {
int local9 = moom.Jd.a(((moom.Jc)(p0)), ((net.minecraft.world.IBlockAccess)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.DT)(p3)), ((int)(p4)), ((int)(p5)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p6)), ((int)(p7)), ((moom.Mi)(p8)));
    return (((moom.Jc)(p0)).y)[local9];
}


private static synchronized moom.lC[] a(moom.Jc p0, net.minecraft.world.IBlockAccess p1, net.minecraft.block.state.IBlockState p2, moom.DT p3, int p4, int p5, moom.lC p6, int p7, moom.Mi p8) {
java.lang.Object local9 = ((moom.lC)(p6)).a__oh();
    int local10 = moom.Jd.a(((moom.Jc)(p0)), ((net.minecraft.world.IBlockAccess)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.DT)(p3)), ((int)(p4)), ((int)(p5)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(local9)), ((int)(p7)), ((moom.Mi)(p8)));
    return moom.Jf.a(((int)(local10)), ((moom.Jc)(p0)), ((int)(p5)), ((moom.lC)(p6)), ((moom.Mi)(p8)));
}


public static int a(moom.bs p0) { return __sourceHandlerCall_5e4c15e35d08d71b63ab(p0); }


private static moom.lC[] a(moom.Jc p0, moom.lC p1, moom.Mi p2) { return __sourceHandlerCall_03b21c9eef301c88028f(p0, p1, p2); }


private static moom.lC[] a(moom.Jc p0, net.minecraft.world.IBlockAccess p1, moom.fB p2, moom.DT p3, int p4, moom.lC p5, moom.Mi p6) { return __sourceHandlerCall_3f004db9132d94fbc73a(p0, p1, p2, p3, p4, p5, p6); }


private static moom.lC[] a(moom.Jc p0, moom.DT p1, int p2, moom.lC p3, moom.Mi p4) { return __sourceHandlerCall_ef39749226ca650dcd2d(p0, p1, p2, p3, p4); }


private static moom.lC[] a(moom.Jc p0, net.minecraft.world.IBlockAccess p1, moom.fB p2, moom.DT p3, int p4, moom.lC p5, int p6, moom.Mi p7) { return __sourceHandlerCall_1ec1b19ea60714a66d83(p0, p1, p2, p3, p4, p5, p6, p7); }


private static int a(int p0, int p1) { return __sourceHandlerCall_6c267aefb62426dad0fc(p0, p1); }


private static moom.bs a(int p0) { return __sourceHandlerCall_611c91cc7955f3ba0816(p0); }


private static net.minecraft.client.renderer.texture.TextureAtlasSprite a(moom.Jc p0, net.minecraft.world.IBlockAccess p1, moom.fB p2, moom.DT p3, int p4) { return __sourceHandlerCall_ff509c0803fdc53dbe44(p0, p1, p2, p3, p4); }


private static net.minecraft.client.renderer.texture.TextureAtlasSprite a(moom.Jc p0) {
return (((moom.Jc)(p0)).y)[0];
}


private static net.minecraft.client.renderer.texture.TextureAtlasSprite a(moom.Jc p0, moom.DT p1, int p2) { return __sourceHandlerCall_f8e1b004a55defa18788(p0, p1, p2); }


private static boolean a(moom.Jc p0, net.minecraft.world.IBlockAccess p1, net.minecraft.block.state.IBlockState p2, moom.DT p3, int p4, net.minecraft.client.renderer.texture.TextureAtlasSprite p5, int p6) { return __sourceHandlerCall_9b2d9edd35a5fb266018(p0, p1, p2, p3, p4, p5, p6); }


private static boolean a(net.minecraft.block.state.IBlockState p0) { return __sourceHandlerCall_44e0e6d4be57701183eb(p0); }


private static void a(int[] p0, int p1, net.minecraft.client.renderer.texture.TextureAtlasSprite p2, net.minecraft.client.renderer.texture.TextureAtlasSprite p3) {
int local4 = ((p0).length / 4);
    int local5 = (local4 * p1);
    float local6 = java.lang.Float.intBitsToFloat(((int)((p0)[(local5 + 4)])));
    float local7 = java.lang.Float.intBitsToFloat(((int)((p0)[((local5 + 4) + 1)])));
    double local8 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p2)).a(((float)(local6)));
    double local10 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p2)).b(((float)(local7)));
    (p0)[(local5 + 4)] = java.lang.Float.floatToRawIntBits(((float)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p3)).a(((double)(local8))))));
    (p0)[((local5 + 4) + 1)] = java.lang.Float.floatToRawIntBits(((float)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p3)).b(((double)(local10))))));
    return;
}


private static boolean a(moom.Jc p0, net.minecraft.world.IBlockAccess p1, net.minecraft.block.state.IBlockState p2, moom.DT p3, net.minecraft.block.state.IBlockState p4, int p5, net.minecraft.client.renderer.texture.TextureAtlasSprite p6, int p7) { return __sourceHandlerCall_e56d0a397f4d6c84c835(p0, p1, p2, p3, p4, p5, p6, p7); }


private static net.minecraft.client.renderer.texture.TextureAtlasSprite a(net.minecraft.world.IBlockAccess p0, net.minecraft.block.state.IBlockState p1, moom.DT p2, net.minecraft.block.state.IBlockState p3, int p4) { return __sourceHandlerCall_3c179327d374b951ec30(p0, p1, p2, p3, p4); }


private static net.minecraft.client.renderer.texture.TextureAtlasSprite a(moom.Jc p0, net.minecraft.world.IBlockAccess p1, net.minecraft.block.state.IBlockState p2, moom.DT p3, int p4, int p5, net.minecraft.client.renderer.texture.TextureAtlasSprite p6, int p7) { return __sourceHandlerCall_34c47a0ec9e7da1b0a83(p0, p1, p2, p3, p4, p5, p6, p7); }


private static moom.bK[] a__ArraybK(int p0, int p1) { return __sourceHandlerCall_10dcd6a818e8dd62a717(p0, p1); }


public static moom.lC[] a(net.minecraft.world.IBlockAccess p0, net.minecraft.block.state.IBlockState p1, moom.DT p2, moom.bs p3, moom.lC p4, boolean p5, int p6, moom.Mi p7) { return __sourceHandlerCall_a0e8cd25a9e3514e3f19(p0, p1, p2, p3, p4, p5, p6, p7); }


protected static java.util.Map[][] a__ArrayArrayMap() {
return moom.Jd.c;
}


private static int a(moom.Jc p0, net.minecraft.world.IBlockAccess p1, net.minecraft.block.state.IBlockState p2, moom.DT p3, int p4, int p5, net.minecraft.client.renderer.texture.TextureAtlasSprite p6, int p7, moom.Mi p8) { return __sourceHandlerCall_8059381de0489b03af92(p0, p1, p2, p3, p4, p5, p6, p7, p8); }


private static moom.lC[] a(net.minecraft.world.IBlockAccess p0, net.minecraft.block.state.IBlockState p1, moom.DT p2, moom.bs p3, moom.lC p4, moom.Mi p5) { return __sourceHandlerCall_6e55caa29d96a73a1d63(p0, p1, p2, p3, p4, p5); }


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite609_204(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5304_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5283_0() throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
