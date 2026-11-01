package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class JD {

public java.lang.String a;

private int b;

private int c;

private int d;

private int e;

private int f;

private boolean g;

private float h;

private float[] i;

private moom.Ke j;

private int k;

private boolean l;

private boolean m;

private boolean n;

public net.minecraft.world.biome.BiomeGenBase[] o;

public moom.Ke p;

private float q;

private moom.Oa r;

public int s;

private net.minecraft.world.World t;

public static float[] u;

private static long v;

private static java.lang.String[] w;

private static java.lang.String[] x;

private static java.util.Map y;

private static long[] z;

private static java.lang.Integer[] A;

private static java.util.Map B;

private static long[] C;

private static java.lang.Long[] D;

private static java.util.Map E;

public JD(java.util.Properties p0, java.lang.String p1) { super(); }


private static void __sourceConstructorBody_2ccb21fb52e3a410(moom.JD receiver, java.util.Properties p0, java.lang.String p1) throws Throwable {

long local3 = (moom.JD.v ^ 56295745503884L);

    moom.JD.__sourceConstructorInit_2ccb21fb52e3a410_0(((moom.JD)(receiver)));

    ((moom.JD)(receiver)).a = ((java.lang.String)(null));

    ((moom.JD)(receiver)).b = ((int)(-1));

    ((moom.JD)(receiver)).c = ((int)(-1));

    ((moom.JD)(receiver)).d = ((int)(-1));

    ((moom.JD)(receiver)).e = ((int)(-1));

    ((moom.JD)(receiver)).f = ((int)(1));

    ((moom.JD)(receiver)).g = ((boolean)(false));

    ((moom.JD)(receiver)).h = ((float)(0x1.0p0f));

    ((moom.JD)(receiver)).i = ((float[])(moom.JD.u));

    ((moom.JD)(receiver)).j = ((moom.Ke)(null));

    ((moom.JD)(receiver)).k = ((int)(__sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_13(292, (8488628942418918451L ^ local3))));

    ((moom.JD)(receiver)).l = ((boolean)(true));

    ((moom.JD)(receiver)).m = ((boolean)(false));

    ((moom.JD)(receiver)).n = ((boolean)(false));

    ((moom.JD)(receiver)).o = ((net.minecraft.world.biome.BiomeGenBase[])(null));

    ((moom.JD)(receiver)).p = ((moom.Ke)(null));

    ((moom.JD)(receiver)).q = ((float)(0x1.0p0f));

    ((moom.JD)(receiver)).r = ((moom.Oa)(null));

    ((moom.JD)(receiver)).s = ((int)(-1));

    ((moom.JD)(receiver)).t = ((net.minecraft.world.World)(null));

    moom.J3 local5 = new moom.J3(__sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_24(22850, (1691361180057956275L ^ local3)));

    ((moom.JD)(receiver)).a = ((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_25(4973, (3147640387721373092L ^ local3)))), ((java.lang.String)(p1)))));

    ((moom.JD)(receiver)).b = ((int)(((moom.JD)(receiver)).a(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_28(26077, (8368209714108289819L ^ local3))))))))));

    ((moom.JD)(receiver)).c = ((int)(((moom.JD)(receiver)).a(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_32(28666, (1615619531019901233L ^ local3))))))))));

    ((moom.JD)(receiver)).d = ((int)(((moom.JD)(receiver)).a(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_36(22373, (17995245150495140L ^ local3))))))))));

    ((moom.JD)(receiver)).e = ((int)(((moom.JD)(receiver)).a(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_40(26144, (5692836531162108136L ^ local3))))))))));

    ((moom.JD)(receiver)).f = ((int)(moom.Md.a(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_44(751, (1957408095771636773L ^ local3))))))))));

    ((moom.JD)(receiver)).g = ((boolean)(((moom.JD)(receiver)).a(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_48(12792, (1978734286726072098L ^ local3))))))), ((boolean)(true)))));

    ((moom.JD)(receiver)).h = ((float)(((moom.JD)(receiver)).a(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_52(14844, (5596682070322614055L ^ local3))))))), ((float)(0x1.0p0f)))));

    ((moom.JD)(receiver)).i = ((float[])(((moom.JD)(receiver)).a(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_56(9826, (5660507754766209204L ^ local3))))))), ((float[])(moom.JD.u)))));

    ((moom.JD)(receiver)).j = ((moom.Ke)(((moom.J3)(local5)).a__Ke(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_61(11, (1433444385534949080L ^ local3))))))))));

    ((moom.JD)(receiver)).k = ((int)(((moom.J3)(local5)).a(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_65(2170, (2527802147189702311L ^ local3))))))), ((int)(__sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_67(7120, (3105032602245539521L ^ local3)))))));

    java.util.List local6 = ((moom.JD)(receiver)).a__List(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_70(5777, (844119386603954269L ^ local3)))), ((java.lang.String)(__sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_71(23516, (7517947011974491420L ^ local3))))))));

    ((moom.JD)(receiver)).l = ((boolean)(((java.util.List)(local6)).contains(((java.lang.Object)(__sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_74(23516, (7517947011974491420L ^ local3)))))));

    ((moom.JD)(receiver)).m = ((boolean)(((java.util.List)(local6)).contains(((java.lang.Object)(__sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_77(25815, (1256664793003807267L ^ local3)))))));

    ((moom.JD)(receiver)).n = ((boolean)(((java.util.List)(local6)).contains(((java.lang.Object)(__sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_80(302, (2878572653348534267L ^ local3)))))));

    ((moom.JD)(receiver)).o = ((net.minecraft.world.biome.BiomeGenBase[])(((moom.J3)(local5)).a__ArrayES(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_83(23615, (7042418407244589806L ^ local3))))))))));

    ((moom.JD)(receiver)).p = ((moom.Ke)(((moom.J3)(local5)).a__Ke(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_87(3421, (8749545548228115337L ^ local3))))))))));

    ((moom.JD)(receiver)).q = ((float)(((moom.JD)(receiver)).a(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_91(6789, (977101335148375154L ^ local3))))))), ((float)(0x1.0p0f)))));

    return;

}



static {
v = ((long)(((moom._a)(moom._c.a(((long)(4257398321794273104L)), ((long)(9108782260993632297L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(151222251175070L)))));
    y = ((java.util.Map)(new java.util.HashMap(13)));
    long local22_life7 = (moom.JD.v ^ 29486848030996L);
    javax.crypto.Cipher local24_life9;
    javax.crypto.Cipher __sourceSpill592_11 = (local24_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill592_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill592_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill592_14 = new byte[8];
    (__sourceSpill592_14)[0] = ((byte) ((int) (local22_life7 >>> 56)));
    int local25_life15 = 1;
    while ((local25_life15 < 8)) {
        (__sourceSpill592_14)[local25_life15] = ((byte) ((int) ((local22_life7 << (local25_life15 * 8)) >>> 56)));
        local25_life15 += 1;
    }
    byte[] __sourcePreallocation592_16 = __sourceSpill592_14;
    ((javax.crypto.Cipher)(__sourceSpill592_11)).init(((int)(__sourceSpill592_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill592_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation592_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local31_life19 = new java.lang.String[39];
    int local29_life20 = 0;
    java.lang.String local28_life21;
    int local30_life23 = ((java.lang.String)((local28_life21 = "ñÃ<$3-{¾ñA£Ì ú\036Ç!H\020\027.nÂ¨\003\006¶)¶þT\022}îÄFPÄ¶yµ\013\020ÇÃ)xÎlK´V1mmÇ\fö ÿ¹PPÖ\034±$æ\034©ÕÈ¨_j¶ûÞí³cµsçÈ\020Û£Ê\"×,ú.§\013ËÍC\020ß\000ÅãB÷^C;¹mP2-¹øÔÐ\b\002ßÌ¾/äL\0201ÀI²cÒP\177ªðEç­\000¢\004EF6c\006O·\\øÃÓþ¾ïSaîUÀvóû2\005?Ö3\bÖÿ½º\013ñ\"é_ñìñ+\020oÃ[(Ó\\8£\177\017Ë^*2\030:òî\000æòÌ§Þ¸¤«%q\027wsSÀØÆÒÌ(Û´s1\035A\021>KÜ\027;ø\016g\020\006in^\031\033\007]¨ýÝ7ø^Öé.eÞ\0205¢F÷\034\032MÑÏs,\t\tb\020L\036]T\004\016­\177-z\032[ßõÕ ­2l=ÈöÞu³\nÊ^ôq¹3$bh\rc×ØmpÜSOtTu·6*nØ^\027\000ç±ðe\"\031i¤_lx§¿b;ä\003\0348TêÄ>Ð\026¡ñ2X \t\003\022iÃØ)¹x<ü¼í¯$\024eÇ$Qfy°Yñ©\007'\177\013ï{\007.e¬û\fÜ8ç£^\031±\034S×¦eË ÷|Û¥­UjhSëFîä²ü¹Ï«.´Y8^ð?@½ÕÚ{\020)ô,Ø)öçþ\"\000SçÅ Û:\006¤¯dA\ryW\031®Ø\râE¼¬#ÿ³]\027?¥ÛPå\020Ëxw\t-¾:Ú\030!ø#u\003r Ç¹ºé%\bÃ)kï¬«F§ÃgGbCXô\027(A¥wG \027h\006j^°Þ\003\r>\005)öÓÂ\035¾ÿIN|ù{áð~Ü\000=8J\030ØÝ\023»\017][ö*R.Ä¡~§\nËö\033<\020½\024ç,ö½)oÕ1]S¬¶(ÅÝ­-²Þ|IW¥ñ³\"HÝi¬\rd\026\003²ËúM\r»k2þ/\004£\030ëâGD\nT+ÖîûðÔ,hY\004ÐP UÖÿ=\020Ú\r\177Hoùw7>IíöÛöº \021t;Ý\024;®õ^åÑ½ ÐÊ\003¢Í\0366\035}©ôG\0301ëX_¨Ñ~5êÿXÝp19oÛ<\0259\020óHá\033?FD\036hH\035Èt\t\035P(\017XÏéy}Ê¯È\002iíe)ODÕV?\024ÖÇ\006v\\(xÇê>ÞjYT\020MµKóÕÃ\000K?¿Ð\035\020\027Y\022´P: %Jâ\022sy­÷ï\020©Ök¯-\000Ñ\016\022\021ôºé<Ç *\016Ùý&p}ÐÅKÐ\026}Ð#ùb\004Rw.½\024\030\177Ô<p\020¡®½\r¹\fªùpz\037ÜËzõ(+ÇD'Sðì\02364Fæo@ÕêwqSZn³ñâ\002§åê7Gª=Åï'\020\016y}g{øXØv\035GÜ#(\026ÞÒOÖ^\026ÊµÜBÍfÍ&Áóh¸ìâZ2Íµ\177â·NÚ[²ÂÉð"))).length();
    int local27_life24 = 16;
    int local26_life25 = -1;
    while (true) {
        local26_life25 += 1;
        byte[] __sourceSpill592_28 = ((java.lang.String)(((java.lang.String)(local28_life21)).substring(((int)(local26_life25)), ((int)((local26_life25 + local27_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill592_29 = local24_life9;
        byte[] local32_life31 = ((javax.crypto.Cipher)(__sourceSpill592_29)).doFinal(((byte[])(__sourceSpill592_28)));
        java.lang.String __sourceSpill592_34 = ((java.lang.String)(moom.JD.a(((byte[])(local32_life31))))).intern();
        java.lang.String[] __sourceSpill592_35 = local31_life19;
        int __sourceSpill592_36 = local29_life20;
        local29_life20 += 1;
        (__sourceSpill592_35)[__sourceSpill592_36] = __sourceSpill592_34;
        if (!(((local26_life25 = (local26_life25 + local27_life24)) < local30_life23))) { break; }
        local27_life24 = ((java.lang.String)(local28_life21)).charAt(((int)(local26_life25)));
    }
    local30_life23 = ((java.lang.String)((local28_life21 = "´\001±>)m&\n\177¤¥Ï c®º6çQ³ÕgÝbÛ\\d©nÏñÑ\027¯©Ä"))).length();
    local27_life24 = 16;
    local26_life25 = -1;
    while (true) {
        local26_life25 += 1;
        byte[] __sourceSpill592_41 = ((java.lang.String)(((java.lang.String)(local28_life21)).substring(((int)(local26_life25)), ((int)((local26_life25 + local27_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill592_42 = local24_life9;
        byte[] local32_life44 = ((javax.crypto.Cipher)(__sourceSpill592_42)).doFinal(((byte[])(__sourceSpill592_41)));
        java.lang.String __sourceSpill592_47 = ((java.lang.String)(moom.JD.a(((byte[])(local32_life44))))).intern();
        java.lang.String[] __sourceSpill592_48 = local31_life19;
        int __sourceSpill592_49 = local29_life20;
        local29_life20 += 1;
        (__sourceSpill592_48)[__sourceSpill592_49] = __sourceSpill592_47;
        if (!(((local26_life25 = (local26_life25 + local27_life24)) < local30_life23))) { break; }
        local27_life24 = ((java.lang.String)(local28_life21)).charAt(((int)(local26_life25)));
    }
    w = ((java.lang.String[])(local31_life19));
    x = ((java.lang.String[])(new java.lang.String[39]));
    B = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life55;
    javax.crypto.Cipher __sourceSpill592_57 = (local11_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill592_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill592_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill592_60 = new byte[8];
    (__sourceSpill592_60)[0] = ((byte) ((int) (local22_life7 >>> 56)));
    int local12_life61 = 1;
    while ((local12_life61 < 8)) {
        (__sourceSpill592_60)[local12_life61] = ((byte) ((int) ((local22_life7 << (local12_life61 * 8)) >>> 56)));
        local12_life61 += 1;
    }
    byte[] __sourcePreallocation592_62 = __sourceSpill592_60;
    ((javax.crypto.Cipher)(__sourceSpill592_57)).init(((int)(__sourceSpill592_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill592_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation592_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local17_life65 = new long[9];
    int local14_life66 = 0;
    java.lang.String local15_life67;
    int local16_life69 = ((java.lang.String)((local15_life67 = "­x\006\tÔ^4¦/¹\024æÙÊ&lµJB*5ù\022Õ2¸\000üQ7í3ÛâHûaò:\004,h:BÞÌÓ3y"))).length();
    int local13_life70 = 0;
    do {
        java.lang.String __sourceSpill592_71 = local15_life67;
        int __sourceSpill592_72 = local13_life70;
        local13_life70 += 8;
        byte[] local18_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill592_71)).substring(((int)(__sourceSpill592_72)), ((int)(local13_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill592_76 = local17_life65;
        int __sourceSpill592_77 = local14_life66;
        local14_life66 += 1;
        long local19_life78 = (((((((((((long) (local18_life75)[0]) & 255L) << 56) | ((((long) (local18_life75)[1]) & 255L) << 48)) | ((((long) (local18_life75)[2]) & 255L) << 40)) | ((((long) (local18_life75)[3]) & 255L) << 32)) | ((((long) (local18_life75)[4]) & 255L) << 24)) | ((((long) (local18_life75)[5]) & 255L) << 16)) | ((((long) (local18_life75)[6]) & 255L) << 8)) | (((long) (local18_life75)[7]) & 255L));
        byte[] __sourceSpill592_79 = new byte[8];
        (__sourceSpill592_79)[0] = ((byte) ((int) (local19_life78 >>> 56)));
        (__sourceSpill592_79)[1] = ((byte) ((int) (local19_life78 >>> 48)));
        (__sourceSpill592_79)[2] = ((byte) ((int) (local19_life78 >>> 40)));
        (__sourceSpill592_79)[3] = ((byte) ((int) (local19_life78 >>> 32)));
        (__sourceSpill592_79)[4] = ((byte) ((int) (local19_life78 >>> 24)));
        (__sourceSpill592_79)[5] = ((byte) ((int) (local19_life78 >>> 16)));
        (__sourceSpill592_79)[6] = ((byte) ((int) (local19_life78 >>> 8)));
        (__sourceSpill592_79)[7] = ((byte) ((int) local19_life78));
        javax.crypto.Cipher __sourceSpill592_80 = local11_life55;
        byte[] local21_life82 = ((javax.crypto.Cipher)(__sourceSpill592_80)).doFinal(((byte[])(__sourceSpill592_79)));
        (__sourceSpill592_76)[__sourceSpill592_77] = (((((((((((long) (local21_life82)[0]) & 255L) << 56) | ((((long) (local21_life82)[1]) & 255L) << 48)) | ((((long) (local21_life82)[2]) & 255L) << 40)) | ((((long) (local21_life82)[3]) & 255L) << 32)) | ((((long) (local21_life82)[4]) & 255L) << 24)) | ((((long) (local21_life82)[5]) & 255L) << 16)) | ((((long) (local21_life82)[6]) & 255L) << 8)) | (((long) (local21_life82)[7]) & 255L));
    } while ((!(local13_life70 >= local16_life69)));
    local16_life69 = ((java.lang.String)((local15_life67 = "h²LKN`¦Àê\003aÛ4-8"))).length();
    local13_life70 = 0;
    do {
        java.lang.String __sourceSpill592_84 = local15_life67;
        int __sourceSpill592_85 = local13_life70;
        local13_life70 += 8;
        byte[] local18_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill592_84)).substring(((int)(__sourceSpill592_85)), ((int)(local13_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill592_89 = local17_life65;
        int __sourceSpill592_90 = local14_life66;
        local14_life66 += 1;
        long local19_life91 = (((((((((((long) (local18_life88)[0]) & 255L) << 56) | ((((long) (local18_life88)[1]) & 255L) << 48)) | ((((long) (local18_life88)[2]) & 255L) << 40)) | ((((long) (local18_life88)[3]) & 255L) << 32)) | ((((long) (local18_life88)[4]) & 255L) << 24)) | ((((long) (local18_life88)[5]) & 255L) << 16)) | ((((long) (local18_life88)[6]) & 255L) << 8)) | (((long) (local18_life88)[7]) & 255L));
        byte[] __sourceSpill592_92 = new byte[8];
        (__sourceSpill592_92)[0] = ((byte) ((int) (local19_life91 >>> 56)));
        (__sourceSpill592_92)[1] = ((byte) ((int) (local19_life91 >>> 48)));
        (__sourceSpill592_92)[2] = ((byte) ((int) (local19_life91 >>> 40)));
        (__sourceSpill592_92)[3] = ((byte) ((int) (local19_life91 >>> 32)));
        (__sourceSpill592_92)[4] = ((byte) ((int) (local19_life91 >>> 24)));
        (__sourceSpill592_92)[5] = ((byte) ((int) (local19_life91 >>> 16)));
        (__sourceSpill592_92)[6] = ((byte) ((int) (local19_life91 >>> 8)));
        (__sourceSpill592_92)[7] = ((byte) ((int) local19_life91));
        javax.crypto.Cipher __sourceSpill592_93 = local11_life55;
        byte[] local21_life95 = ((javax.crypto.Cipher)(__sourceSpill592_93)).doFinal(((byte[])(__sourceSpill592_92)));
        (__sourceSpill592_89)[__sourceSpill592_90] = (((((((((((long) (local21_life95)[0]) & 255L) << 56) | ((((long) (local21_life95)[1]) & 255L) << 48)) | ((((long) (local21_life95)[2]) & 255L) << 40)) | ((((long) (local21_life95)[3]) & 255L) << 32)) | ((((long) (local21_life95)[4]) & 255L) << 24)) | ((((long) (local21_life95)[5]) & 255L) << 16)) | ((((long) (local21_life95)[6]) & 255L) << 8)) | (((long) (local21_life95)[7]) & 255L));
    } while ((!(local13_life70 >= local16_life69)));
    z = ((long[])(local17_life65));
    A = ((java.lang.Integer[])(new java.lang.Integer[9]));
    E = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life100;
    javax.crypto.Cipher __sourceSpill592_102 = (local0_life100 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill592_103 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill592_104 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill592_105 = new byte[8];
    (__sourceSpill592_105)[0] = ((byte) ((int) (local22_life7 >>> 56)));
    int local1_life106 = 1;
    while ((local1_life106 < 8)) {
        (__sourceSpill592_105)[local1_life106] = ((byte) ((int) ((local22_life7 << (local1_life106 * 8)) >>> 56)));
        local1_life106 += 1;
    }
    byte[] __sourcePreallocation592_107 = __sourceSpill592_105;
    ((javax.crypto.Cipher)(__sourceSpill592_102)).init(((int)(__sourceSpill592_103)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill592_104)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation592_107)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life110 = new long[3];
    int local3_life111 = 0;
    java.lang.String local4_life112;
    int local5_life114 = ((java.lang.String)((local4_life112 = "_\nõÇ³|\032OÄ\033/Ü/Vow\007ÐÁ-"))).length();
    int local2_life115 = 0;
    do {
        java.lang.String __sourceSpill592_116 = local4_life112;
        int __sourceSpill592_117 = local2_life115;
        local2_life115 += 8;
        byte[] local7_life120 = ((java.lang.String)(((java.lang.String)(__sourceSpill592_116)).substring(((int)(__sourceSpill592_117)), ((int)(local2_life115))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill592_121 = local6_life110;
        int __sourceSpill592_122 = local3_life111;
        local3_life111 += 1;
        long local8_life123 = (((((((((((long) (local7_life120)[0]) & 255L) << 56) | ((((long) (local7_life120)[1]) & 255L) << 48)) | ((((long) (local7_life120)[2]) & 255L) << 40)) | ((((long) (local7_life120)[3]) & 255L) << 32)) | ((((long) (local7_life120)[4]) & 255L) << 24)) | ((((long) (local7_life120)[5]) & 255L) << 16)) | ((((long) (local7_life120)[6]) & 255L) << 8)) | (((long) (local7_life120)[7]) & 255L));
        byte[] __sourceSpill592_124 = new byte[8];
        (__sourceSpill592_124)[0] = ((byte) ((int) (local8_life123 >>> 56)));
        (__sourceSpill592_124)[1] = ((byte) ((int) (local8_life123 >>> 48)));
        (__sourceSpill592_124)[2] = ((byte) ((int) (local8_life123 >>> 40)));
        (__sourceSpill592_124)[3] = ((byte) ((int) (local8_life123 >>> 32)));
        (__sourceSpill592_124)[4] = ((byte) ((int) (local8_life123 >>> 24)));
        (__sourceSpill592_124)[5] = ((byte) ((int) (local8_life123 >>> 16)));
        (__sourceSpill592_124)[6] = ((byte) ((int) (local8_life123 >>> 8)));
        (__sourceSpill592_124)[7] = ((byte) ((int) local8_life123));
        javax.crypto.Cipher __sourceSpill592_125 = local0_life100;
        byte[] local10_life127 = ((javax.crypto.Cipher)(__sourceSpill592_125)).doFinal(((byte[])(__sourceSpill592_124)));
        (__sourceSpill592_121)[__sourceSpill592_122] = (((((((((((long) (local10_life127)[0]) & 255L) << 56) | ((((long) (local10_life127)[1]) & 255L) << 48)) | ((((long) (local10_life127)[2]) & 255L) << 40)) | ((((long) (local10_life127)[3]) & 255L) << 32)) | ((((long) (local10_life127)[4]) & 255L) << 24)) | ((((long) (local10_life127)[5]) & 255L) << 16)) | ((((long) (local10_life127)[6]) & 255L) << 8)) | (((long) (local10_life127)[7]) & 255L));
    } while ((!(local2_life115 >= local5_life114)));
    C = ((long[])(local6_life110));
    D = ((java.lang.Long[])(new java.lang.Long[3]));
    float[] __sourceSpill592_130 = new float[3];
    (__sourceSpill592_130)[0] = 0x1.0p0f;
    (__sourceSpill592_130)[1] = 0x0.0p0f;
    (__sourceSpill592_130)[2] = 0x0.0p0f;
    u = ((float[])(__sourceSpill592_130));
}

private static native <E extends Throwable> void __sourceConstructorInit_2ccb21fb52e3a410_0(moom.JD a0) throws E;

public java.lang.String toString() {
long local1 = (moom.JD.v ^ 39256495590816L);
    java.lang.String __sourceSpill1691_6 = this.a;
    int __sourceSpill1691_7 = this.b;
    int __sourceSpill1691_8 = this.c;
    int __sourceSpill1691_9 = this.d;
    int local3 = this.e;
    int local4 = __sourceSpill1691_9;
    int local5 = __sourceSpill1691_8;
    int local6 = __sourceSpill1691_7;
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1691_11(__sourceSpill1691_6, __sourceIntrinsic_a86c261fcdee_originalDynamicSite1691_10(25317, (3455035646998813453L ^ local1)), local6, "-", local5, " ", local4, "-", local3);
}


private float b(net.minecraft.world.World p0) {
net.minecraft.entity.Entity forwardValue2276_16_0;
    net.minecraft.world.biome.BiomeGenBase forwardValue2276_34_0;
    moom.JD forwardValue2276_41_0;
    moom.Ke forwardValue2276_47_0;
    float forwardValue2276_54_0;
    net.minecraft.entity.Entity[] spill2276_0;
    net.minecraft.entity.Entity spill2276_1;
    moom.JD spill2276_2;
    net.minecraft.world.biome.BiomeGenBase spill2276_3;
    moom.Ke spill2276_4;
    long life2_3;
    net.minecraft.entity.Entity life5_7;
    net.minecraft.entity.Entity[] life4_8;
    moom.DT life6_22;
    net.minecraft.world.biome.BiomeGenBase life7_34;
    forward_join_54: {
    forward_join_53: {
    forward_join_47: {
    forward_join_41: {
    forward_join_40: {
    forward_join_34: {
    forward_join_33: {
    forward_join_16: {
    forward_join_15: {
    life2_3 = (moom.JD.v ^ 71200452751354L);
    spill2276_0 = moom.JM.b__Arrayr3();
    life5_7 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__r3();
    life4_8 = spill2276_0;
    spill2276_1 = life5_7;
    if (!((life4_8 != null))) {
        forwardValue2276_16_0 = spill2276_1;
        break forward_join_16;
    }
    if (!((spill2276_1 == null))) {
        break forward_join_15;
    }
    return 0x0.0p0f;
    }
    forwardValue2276_16_0 = life5_7;
    }
    life6_22 = ((net.minecraft.entity.Entity)(forwardValue2276_16_0)).a__DT();
    spill2276_2 = this;
    if (!((life4_8 != null))) {
        forwardValue2276_41_0 = spill2276_2;
        break forward_join_41;
    }
    if (!((((moom.JD)(spill2276_2)).o != null))) {
        break forward_join_40;
    }
    life7_34 = ((net.minecraft.world.World)(p0)).a__ES(((moom.DT)(life6_22)));
    spill2276_3 = life7_34;
    if (!((life4_8 != null))) {
        forwardValue2276_34_0 = spill2276_3;
        break forward_join_34;
    }
    if (!((spill2276_3 == null))) {
        break forward_join_33;
    }
    return 0x0.0p0f;
    }
    forwardValue2276_34_0 = life7_34;
    }
    if (!((!moom.Ka.a(((net.minecraft.world.biome.BiomeGenBase)(forwardValue2276_34_0)), ((net.minecraft.world.biome.BiomeGenBase[])(this.o)))))) {
        break forward_join_40;
    }
    return 0x0.0p0f;
    }
    forwardValue2276_41_0 = this;
    }
    spill2276_4 = ((moom.JD)(forwardValue2276_41_0)).p;
    if (!((life4_8 != null))) {
        forwardValue2276_47_0 = spill2276_4;
        break forward_join_47;
    }
    if (!((spill2276_4 != null))) {
        break forward_join_53;
    }
    forwardValue2276_47_0 = this.p;
    }
    if (!((!((moom.Ke)(forwardValue2276_47_0)).a__Boolean(((int)(((moom.DT)(life6_22)).b())))))) {
        break forward_join_53;
    }
    forwardValue2276_54_0 = 0x0.0p0f;
    break forward_join_54;
    }
    forwardValue2276_54_0 = 0x1.0p0f;
    }
    return forwardValue2276_54_0;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x4FBF;
        if (A[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = z[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])B.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    B.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/JD", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            JD.A[n2] = n4;
        }
        return A[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.JD.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5060_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/JD"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral5061_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/JD"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.JD.c(((int)(local4)), ((long)(local5)));
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 15172);
    if (((moom.JD.D)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.JD.C)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.JD.E)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.JD.E)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/JD", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.JD.D)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.JD.D)[life3_8])).longValue();
}


private float[] a(java.lang.String p0, float[] p1) {
java.lang.String lexicalValue822_13_0;
    int lexicalValue822_34_0;
    int lexicalValue822_78_0;
    float[] lexicalValue822_97_0;
    float lexicalValue822_104_0;
    int lexicalValue822_141_0;
    java.lang.String spill822_0;
    int spill822_1;
    float spill822_2;
    int spill822_3;
    float[] spill822_4;
    float[] spill822_5;
    int spill822_6;
    float[] spill822_7;
    float[] spill822_8;
    float[] spill822_9;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    java.lang.String[] life6_20;
    float[] life7_45;
    int life8_47;
    float life8_134;
    float life9_138;
    float life10_142;
    lexical_join_141: {
    lexical_join_140: {
    lexical_join_104: {
    lexical_join_101: {
    lexical_join_34: {
    lexical_join_33: {
    lexical_join_13: {
    lexical_join_12: {
    life3_3 = (moom.JD.v ^ 41498046500872L);
    life5_5 = moom.JM.b__Arrayr3();
    spill822_0 = p0;
    if (!((life5_5 != null))) {
        lexicalValue822_13_0 = spill822_0;
        break lexical_join_13;
    }
    if (!((spill822_0 == null))) {
        break lexical_join_12;
    }
    return p1;
    }
    lexicalValue822_13_0 = p0;
    }
    life6_20 = moom.BU.a__ArrayString(((java.lang.String)(lexicalValue822_13_0)), ((java.lang.String)(" ")));
    spill822_1 = (life6_20).length;
    if (!((life5_5 != null))) {
        lexicalValue822_34_0 = spill822_1;
        break lexical_join_34;
    }
    if (!((spill822_1 != 3))) {
        break lexical_join_33;
    }
    java.lang.String __stackOp822_4_0 = p0;
    java.lang.String __stackOp822_4_1 = __sourceIntrinsic_127d2b0d7565_invokedynamic822_3(29197, (2874625882417894987L ^ life3_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_127d2b0d7565_invokedynamic822_5(__stackOp822_4_1, __stackOp822_4_0))));
    return p1;
    }
    lexicalValue822_34_0 = 3;
    }
    life7_45 = new float[lexicalValue822_34_0];
    life8_47 = 0;
    lexical_cycle_38: while (true) {
    lexical_join_98: {
    lexical_join_97: {
    lexical_join_87: {
    lexical_join_78: {
    lexical_join_71: {
    if (!((life8_47 < (life6_20).length))) {
        break lexical_join_101;
    }
    (life7_45)[life8_47] = moom.BU.a(((java.lang.String)((life6_20)[life8_47])), ((float)(0x0.000002p-126f)));
    spill822_2 = (life7_45)[life8_47];
    if (!((life5_5 != null))) {
        lexicalValue822_104_0 = spill822_2;
        break lexical_join_104;
    }
    spill822_3 = recovery.source.CarrierOps.fcmpl(((float)(spill822_2)), ((float)(0x0.000002p-126f)));
    if (!((life5_5 != null))) {
        lexicalValue822_78_0 = spill822_3;
        break lexical_join_78;
    }
    if (!((spill822_3 == 0))) {
        break lexical_join_71;
    }
    java.lang.String __stackOp822_10_0 = p0;
    java.lang.String __stackOp822_10_1 = __sourceIntrinsic_127d2b0d7565_invokedynamic822_9(3655, (2549768583226092051L ^ life3_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_127d2b0d7565_invokedynamic822_11(__stackOp822_10_1, __stackOp822_10_0))));
    return p1;
    }
    spill822_4 = life7_45;
    if (!((life5_5 != null))) {
        lexicalValue822_97_0 = spill822_4;
        break lexical_join_97;
    }
    lexicalValue822_78_0 = recovery.source.CarrierOps.fcmpg(((float)((spill822_4)[life8_47])), ((float)(-0x1.0p0f)));
    }
    if (!((lexicalValue822_78_0 >= 0))) {
        break lexical_join_87;
    }
    spill822_5 = life7_45;
    if (!((life5_5 != null))) {
        lexicalValue822_97_0 = spill822_5;
        break lexical_join_97;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)((spill822_5)[life8_47])), ((float)(0x1.0p0f))) > 0))) {
        break lexical_join_98;
    }
    }
    java.lang.String __stackOp822_16_0 = p0;
    java.lang.String __stackOp822_16_1 = __sourceIntrinsic_127d2b0d7565_invokedynamic822_15(13143, (8308890366364243732L ^ life3_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_127d2b0d7565_invokedynamic822_17(__stackOp822_16_1, __stackOp822_16_0))));
    lexicalValue822_97_0 = p1;
    }
    return lexicalValue822_97_0;
    }
    life8_47 += 1;
    if (!((life5_5 == null))) { continue lexical_cycle_38; }
    break lexical_cycle_38;
    }
    }
    lexicalValue822_104_0 = (life7_45)[0];
    }
    life8_134 = lexicalValue822_104_0;
    life9_138 = (life7_45)[1];
    life10_142 = (life7_45)[2];
    spill822_6 = recovery.source.CarrierOps.fcmpg(((float)((((life8_134 * life8_134) + (life9_138 * life9_138)) + (life10_142 * life10_142)))), ((float)(0x1.4f8b58p-17f)));
    if (!((life5_5 != null))) {
        lexicalValue822_141_0 = spill822_6;
        break lexical_join_141;
    }
    if (!((spill822_6 < 0))) {
        break lexical_join_140;
    }
    java.lang.String __stackOp822_21_0 = p0;
    java.lang.String __stackOp822_21_1 = __sourceIntrinsic_127d2b0d7565_invokedynamic822_20(18365, (8536621276162991073L ^ life3_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_127d2b0d7565_invokedynamic822_22(__stackOp822_21_1, __stackOp822_21_0))));
    return p1;
    }
    lexicalValue822_141_0 = 3;
    }
    float[] __stackOp822_24_0 = new float[lexicalValue822_141_0];
    spill822_7 = __stackOp822_24_0;
    (__stackOp822_24_0)[0] = life10_142;
    float[] __stackOp822_25_0 = spill822_7;
    spill822_8 = __stackOp822_25_0;
    (__stackOp822_25_0)[1] = life9_138;
    float[] __stackOp822_26_0 = spill822_8;
    spill822_9 = __stackOp822_26_0;
    (__stackOp822_26_0)[2] = (-life8_134);
    return spill822_9;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5064_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/JD"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.JD.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 17534);
    if (((moom.JD.x)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.JD.y)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.JD.y)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/JD", life9_51);
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
        life9_116 = ((java.lang.String)((moom.JD.w)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.JD.x)[life5_8] = moom.JD.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.JD.x)[life5_8];
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
        byte[] spill2630_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2630_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2630_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2630_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2630_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2630_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public boolean a(net.minecraft.world.World p0, int p1) {
moom.JD lexicalValue823_31_0;
    long lexicalValue823_69_0;
    moom.JD spill823_0;
    long spill823_1;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    long life6_46;
    long life8_52;
    int life10_81;
    int life11_86;
    lexical_join_81: {
    lexical_join_69: {
    lexical_join_62: {
    lexical_join_31: {
    lexical_join_30: {
    lexical_join_18: {
    lexical_join_15: {
    life3_3 = (moom.JD.v ^ 48881935367424L);
    life5_5 = moom.JM.b__Arrayr3();
    if (!((life5_5 != null))) {
        break lexical_join_15;
    }
    if (!((p0 != this.t))) {
        break lexical_join_18;
    }
    this.t = ((net.minecraft.world.World)(p0));
    }
    this.r = ((moom.Oa)(null));
    }
    spill823_0 = this;
    if (!((life5_5 != null))) {
        lexicalValue823_31_0 = spill823_0;
        break lexical_join_31;
    }
    if (!(((moom.JD)(spill823_0)).a(((int)(p1)), ((int)(this.e)), ((int)(this.b))))) {
        break lexical_join_30;
    }
    return ((0) != 0);
    }
    lexicalValue823_31_0 = this;
    }
    if (!((((moom.JD)(lexicalValue823_31_0)).j != null))) {
        break lexical_join_81;
    }
    life6_46 = ((net.minecraft.world.World)(p0)).c__Long();
    life8_52 = (life6_46 - ((long) this.b));
    lexical_cycle_42: while (true) {
    if (!((recovery.source.CarrierOps.lcmp(((long)(life8_52)), ((long)(0L))) < 0))) {
        break lexical_join_62;
    }
    spill823_1 = (life8_52 + (__sourceIntrinsic_261a7011aebb_invokedynamic823_13(29273, (3375633362113840191L ^ life3_3)) * ((long) this.k)));
    if (!((life5_5 != null))) {
        lexicalValue823_69_0 = spill823_1;
        break lexical_join_69;
    }
    life8_52 = spill823_1;
    if (!((life5_5 == null))) { continue lexical_cycle_42; }
    break lexical_cycle_42;
    }
    }
    lexicalValue823_69_0 = (life8_52 / __sourceIntrinsic_261a7011aebb_invokedynamic823_15(21450, (5720442477999023535L ^ life3_3)));
    }
    life10_81 = ((int) lexicalValue823_69_0);
    life11_86 = (life10_81 % this.k);
    return ((moom.Ke)(this.j)).a__Boolean(((int)(life11_86)));
    }
    return ((1) != 0);
}


private java.util.List<java.lang.String> a__List(java.lang.String p0) {
int lexicalValue825_76_0;
    java.lang.String[] spill825_0;
    java.lang.String[] spill825_1;
    java.lang.String[] spill825_2;
    net.minecraft.entity.Entity[] spill825_3;
    boolean spill825_4;
    long life2_3;
    java.util.List life5_31;
    java.util.ArrayList life6_35;
    java.lang.String[] life7_39;
    java.lang.String[] life8_42;
    net.minecraft.entity.Entity[] life4_43;
    int life9_46;
    int life10_48;
    java.lang.String life11_55;
    lexical_join_80: {
    life2_3 = (moom.JD.v ^ 65122204792204L);
    java.lang.String[] __stackOp825_1_0 = new java.lang.String[3];
    spill825_0 = __stackOp825_1_0;
    (__stackOp825_1_0)[0] = __sourceIntrinsic_6a817abd23fb_invokedynamic825_2(12995, (3533717651125072691L ^ life2_3));
    java.lang.String[] __stackOp825_3_0 = spill825_0;
    spill825_1 = __stackOp825_3_0;
    (__stackOp825_3_0)[1] = __sourceIntrinsic_6a817abd23fb_invokedynamic825_4(510, (1940423127833428000L ^ life2_3));
    java.lang.String[] __stackOp825_5_0 = spill825_1;
    spill825_2 = __stackOp825_5_0;
    (__stackOp825_5_0)[2] = __sourceIntrinsic_6a817abd23fb_invokedynamic825_6(22312, (6849241830760879846L ^ life2_3));
    life5_31 = java.util.Arrays.asList(((java.lang.Object[])(spill825_2)));
    life6_35 = new java.util.ArrayList();
    life7_39 = moom.BU.a__ArrayString(((java.lang.String)(p0)), ((java.lang.String)(" ")));
    spill825_3 = moom.JM.b__Arrayr3();
    life8_42 = life7_39;
    life4_43 = spill825_3;
    life9_46 = (life8_42).length;
    life10_48 = 0;
    lexical_cycle_49: while (true) {
    lexical_join_77: {
    lexical_join_76: {
    lexical_join_73: {
    if (!((life10_48 < life9_46))) {
        break lexical_join_80;
    }
    life11_55 = (life8_42)[life10_48];
    spill825_4 = ((java.util.List)(life5_31)).contains(((java.lang.Object)(life11_55)));
    if (!((life4_43 != null))) {
        lexicalValue825_76_0 = ((spill825_4) ? 1 : 0);
        break lexical_join_76;
    }
    if (!((!spill825_4))) {
        break lexical_join_73;
    }
    java.lang.String __stackOp825_13_0 = life11_55;
    java.lang.String __stackOp825_13_1 = __sourceIntrinsic_6a817abd23fb_invokedynamic825_12(8485, (3195957381758705911L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_6a817abd23fb_invokedynamic825_14(__stackOp825_13_1, __stackOp825_13_0))));
    if (!((life4_43 == null))) {
        break lexical_join_77;
    }
    }
    lexicalValue825_76_0 = ((((java.util.List)(life6_35)).add(((java.lang.Object)(life11_55)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue825_76_0);
    }
    life10_48 += 1;
    if (!((life4_43 == null))) { continue lexical_cycle_49; }
    break lexical_cycle_49;
    }
    }
    return life6_35;
}


private int a(java.lang.String p0) {
java.lang.String forwardValue2266_13_0;
    java.lang.String[] forwardValue2266_34_0;
    int forwardValue2266_103_0;
    int forwardValue2266_114_0;
    java.lang.String spill2266_0;
    java.lang.String[] spill2266_1;
    int spill2266_2;
    int spill2266_3;
    int spill2266_4;
    int spill2266_5;
    int spill2266_6;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    java.lang.String[] life5_20;
    java.lang.String life6_46;
    java.lang.String life7_50;
    int life8_54;
    int life9_58;
    int life8_113;
    forward_join_114: {
    forward_join_104: {
    forward_join_103: {
    forward_join_88: {
    forward_join_34: {
    forward_join_33: {
    forward_join_13: {
    forward_join_12: {
    life2_3 = (moom.JD.v ^ 134713329356890L);
    life4_5 = moom.JM.b__Arrayr3();
    spill2266_0 = p0;
    if (!((life4_5 != null))) {
        forwardValue2266_13_0 = spill2266_0;
        break forward_join_13;
    }
    if (!((spill2266_0 == null))) {
        break forward_join_12;
    }
    return -1;
    }
    forwardValue2266_13_0 = p0;
    }
    life5_20 = moom.BU.a__ArrayString(((java.lang.String)(forwardValue2266_13_0)), ((java.lang.String)(":")));
    spill2266_1 = life5_20;
    if (!((life4_5 != null))) {
        forwardValue2266_34_0 = spill2266_1;
        break forward_join_34;
    }
    if (!(((spill2266_1).length != 2))) {
        break forward_join_33;
    }
    java.lang.String __stackOp2266_4_0 = p0;
    java.lang.String __stackOp2266_4_1 = __sourceIntrinsic_599c5f800586_invokedynamic2266_3(11069, (4206930119928074034L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_599c5f800586_invokedynamic2266_5(__stackOp2266_4_1, __stackOp2266_4_0))));
    return -1;
    }
    forwardValue2266_34_0 = life5_20;
    }
    life6_46 = (forwardValue2266_34_0)[0];
    life7_50 = (life5_20)[1];
    life8_54 = moom.BU.a(((java.lang.String)(life6_46)), ((int)(-1)));
    life9_58 = moom.BU.a(((java.lang.String)(life7_50)), ((int)(-1)));
    spill2266_2 = life8_54;
    if (!((life4_5 != null))) {
        forwardValue2266_114_0 = spill2266_2;
        break forward_join_114;
    }
    if (!((spill2266_2 >= 0))) {
        break forward_join_104;
    }
    spill2266_3 = life8_54;
    if (!((life4_5 != null))) {
        forwardValue2266_114_0 = spill2266_3;
        break forward_join_114;
    }
    if (!((spill2266_3 <= __sourceIntrinsic_599c5f800586_invokedynamic2266_9(8174, (450886261998678060L ^ life2_3))))) {
        break forward_join_104;
    }
    spill2266_4 = life9_58;
    if (!((life4_5 != null))) {
        forwardValue2266_114_0 = spill2266_4;
        break forward_join_114;
    }
    if (!((spill2266_4 >= 0))) {
        break forward_join_104;
    }
    spill2266_5 = life9_58;
    if (!((life4_5 != null))) {
        forwardValue2266_114_0 = spill2266_5;
        break forward_join_114;
    }
    if (!((spill2266_5 <= __sourceIntrinsic_599c5f800586_invokedynamic2266_10(15945, (2515488259610661258L ^ life2_3))))) {
        break forward_join_104;
    }
    life8_113 = (life8_54 - __sourceIntrinsic_599c5f800586_invokedynamic2266_11(23409, (4895242867509966007L ^ life2_3)));
    spill2266_6 = life8_113;
    if (!((life4_5 != null))) {
        forwardValue2266_103_0 = spill2266_6;
        break forward_join_103;
    }
    if (!((spill2266_6 < 0))) {
        break forward_join_88;
    }
    life8_113 += 24;
    }
    forwardValue2266_103_0 = ((life8_113 * __sourceIntrinsic_599c5f800586_invokedynamic2266_12(29323, (8711789116855295301L ^ life2_3))) + ((int) ((((double) life9_58) / 0x1.ep5d) * 0x1.f4p9d)));
    }
    return forwardValue2266_103_0;
    }
    java.lang.String __stackOp2266_14_0 = p0;
    java.lang.String __stackOp2266_14_1 = __sourceIntrinsic_599c5f800586_invokedynamic2266_13(2265, (922105060000591052L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_599c5f800586_invokedynamic2266_15(__stackOp2266_14_1, __stackOp2266_14_0))));
    forwardValue2266_114_0 = -1;
    }
    return forwardValue2266_114_0;
}


private boolean a(java.lang.String p0, boolean p1) {
java.lang.String forwardValue2268_13_0;
    int forwardValue2268_31_0;
    int forwardValue2268_46_0;
    java.lang.String spill2268_0;
    boolean spill2268_1;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    forward_join_46: {
    forward_join_36: {
    forward_join_31: {
    forward_join_24: {
    forward_join_13: {
    forward_join_12: {
    life3_3 = (moom.JD.v ^ 69062582051354L);
    life5_5 = moom.JM.b__Arrayr3();
    spill2268_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue2268_13_0 = spill2268_0;
        break forward_join_13;
    }
    if (!((spill2268_0 == null))) {
        break forward_join_12;
    }
    return p1;
    }
    forwardValue2268_13_0 = p0;
    }
    spill2268_1 = ((java.lang.String)(forwardValue2268_13_0)).equalsIgnoreCase(((java.lang.String)(__sourceIntrinsic_4b80208140b2_invokedynamic2268_2(24354, (1998062011320273222L ^ life3_3)))));
    if (!((life5_5 != null))) {
        forwardValue2268_31_0 = ((spill2268_1) ? 1 : 0);
        break forward_join_31;
    }
    if (!(spill2268_1)) {
        break forward_join_24;
    }
    return ((1) != 0);
    }
    forwardValue2268_31_0 = ((((java.lang.String)(p0)).equalsIgnoreCase(((java.lang.String)(__sourceIntrinsic_4b80208140b2_invokedynamic2268_6(10670, (5793755455575195639L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2268_46_0 = forwardValue2268_31_0;
        break forward_join_46;
    }
    if (!((forwardValue2268_31_0 != 0))) {
        break forward_join_36;
    }
    return ((0) != 0);
    }
    java.lang.String __stackOp2268_11_0 = p0;
    java.lang.String __stackOp2268_11_1 = __sourceIntrinsic_4b80208140b2_invokedynamic2268_10(16993, (3376491242659714106L ^ life3_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_4b80208140b2_invokedynamic2268_12(__stackOp2268_11_1, __stackOp2268_11_0))));
    forwardValue2268_46_0 = ((p1) ? 1 : 0);
    }
    return ((forwardValue2268_46_0) != 0);
}


private float a(java.lang.String p0, float p1) {
java.lang.String forwardValue2267_13_0;
    float forwardValue2267_34_0;
    java.lang.String spill2267_0;
    float spill2267_1;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    float life6_20;
    forward_join_34: {
    forward_join_33: {
    forward_join_13: {
    forward_join_12: {
    life3_3 = (moom.JD.v ^ 50790668580140L);
    life5_5 = moom.JM.b__Arrayr3();
    spill2267_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue2267_13_0 = spill2267_0;
        break forward_join_13;
    }
    if (!((spill2267_0 == null))) {
        break forward_join_12;
    }
    return p1;
    }
    forwardValue2267_13_0 = p0;
    }
    life6_20 = moom.BU.a(((java.lang.String)(forwardValue2267_13_0)), ((float)(0x0.000002p-126f)));
    spill2267_1 = life6_20;
    if (!((life5_5 != null))) {
        forwardValue2267_34_0 = spill2267_1;
        break forward_join_34;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill2267_1)), ((float)(0x0.000002p-126f))) == 0))) {
        break forward_join_33;
    }
    java.lang.String __stackOp2267_5_0 = p0;
    java.lang.String __stackOp2267_5_1 = __sourceIntrinsic_b06d1ace241d_invokedynamic2267_4(8662, (7670079232162521267L ^ life3_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_b06d1ace241d_invokedynamic2267_6(__stackOp2267_5_1, __stackOp2267_5_0))));
    return p1;
    }
    forwardValue2267_34_0 = life6_20;
    }
    return forwardValue2267_34_0;
}


public void a(net.minecraft.world.World p0, int p1, float p2, float p3, float p4) {
int forwardValue2272_46_0;
    float forwardValue2272_102_0;
    float forwardValue2272_102_1;
    net.minecraft.entity.Entity[] spill2272_0;
    int spill2272_1;
    float spill2272_2;
    float spill2272_3;
    long life6_3;
    float life9_7;
    float life10_13;
    net.minecraft.entity.Entity[] life8_14;
    float life11_18;
    float life12_24;
    float life12_29;
    float life13_54;
    long life14_82;
    double life16_88;
    double life18_93;
    net.minecraft.client.renderer.Tessellator life13_121;
    forward_join_177: {
    forward_join_111: {
    forward_join_102: {
    forward_join_90: {
    forward_join_46: {
    life6_3 = (moom.JD.v ^ 94277900393992L);
    life9_7 = ((moom.JD)(this)).a(((net.minecraft.world.World)(p0)));
    spill2272_0 = moom.JM.b__Arrayr3();
    life10_13 = ((moom.JD)(this)).a(((float)(p3)), ((float)(p4)));
    life8_14 = spill2272_0;
    life11_18 = ((moom.JD)(this)).a(((int)(p1)));
    life12_24 = ((life9_7 * life10_13) * life11_18);
    life12_29 = moom.BU.a(((float)(life12_24)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    spill2272_1 = recovery.source.CarrierOps.fcmpl(((float)(life12_29)), ((float)(0x1.a36e2ep-14f)));
    if (!((life8_14 != null))) {
        forwardValue2272_46_0 = spill2272_1;
        break forward_join_46;
    }
    if (!((spill2272_1 >= 0))) {
        break forward_join_177;
    }
    moom.kZ.i(((int)(this.s)));
    moom.Md.a(((int)(this.f)), ((float)(life12_29)));
    moom.kZ.B();
    forwardValue2272_46_0 = ((this.g) ? 1 : 0);
    }
    if (!((forwardValue2272_46_0 != 0))) {
        break forward_join_111;
    }
    life13_54 = 0x0.0p0f;
    spill2272_2 = this.h;
    spill2272_3 = ((float) java.lang.Math.round(((float)(this.h))));
    if (!((life8_14 != null))) {
        forwardValue2272_102_0 = spill2272_2;
        forwardValue2272_102_1 = spill2272_3;
        break forward_join_102;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill2272_2)), ((float)(spill2272_3))) != 0))) {
        break forward_join_90;
    }
    life14_82 = ((((net.minecraft.world.World)(p0)).c__Long() + __sourceIntrinsic_7ff6b1a87549_invokedynamic2272_19(15847, (4509715392527526024L ^ life6_3))) / __sourceIntrinsic_7ff6b1a87549_invokedynamic2272_20(21450, (5720523617352550055L ^ life6_3)));
    life16_88 = ((double) (this.h % 0x1.0p0f));
    life18_93 = (((double) life14_82) * life16_88);
    life13_54 = ((float) (life18_93 % 0x1.0p0d));
    }
    forwardValue2272_102_0 = (0x1.68p8f * (life13_54 + (p2 * this.h)));
    forwardValue2272_102_1 = (this.i)[0];
    }
    moom.kZ.b(((float)(forwardValue2272_102_0)), ((float)(forwardValue2272_102_1)), ((float)((this.i)[1])), ((float)((this.i)[2])));
    }
    life13_121 = net.minecraft.client.renderer.Tessellator.a();
    moom.kZ.b(((float)(0x1.68p6f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)(-0x1.68p6f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    ((moom.JD)(this)).a(((net.minecraft.client.renderer.Tessellator)(life13_121)), ((int)(4)));
    moom.kZ.B();
    moom.kZ.b(((float)(0x1.68p6f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    ((moom.JD)(this)).a(((net.minecraft.client.renderer.Tessellator)(life13_121)), ((int)(1)));
    moom.kZ.C();
    moom.kZ.B();
    moom.kZ.b(((float)(-0x1.68p6f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    ((moom.JD)(this)).a(((net.minecraft.client.renderer.Tessellator)(life13_121)), ((int)(0)));
    moom.kZ.C();
    moom.kZ.b(((float)(0x1.68p6f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    ((moom.JD)(this)).a(((net.minecraft.client.renderer.Tessellator)(life13_121)), ((int)(5)));
    moom.kZ.b(((float)(0x1.68p6f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    ((moom.JD)(this)).a(((net.minecraft.client.renderer.Tessellator)(life13_121)), ((int)(2)));
    moom.kZ.b(((float)(0x1.68p6f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    ((moom.JD)(this)).a(((net.minecraft.client.renderer.Tessellator)(life13_121)), ((int)(3)));
    moom.kZ.C();
    }
    return;
}


private void a(net.minecraft.client.renderer.Tessellator p0, int p1) {
long local3 = (moom.JD.v ^ 24490509502346L);
    moom.lw local5 = ((net.minecraft.client.renderer.Tessellator)(p0)).a__lw();
    double local6 = (((double) (p1 % 3)) / 0x1.8p1d);
    double local8 = (((double) (p1 / 3)) / 0x1.0p1d);
    ((moom.lw)(local5)).a(((int)(__sourceIntrinsic_a4476cbdb134_originalDynamicSite1177_2(30066, (3193448219337133414L ^ local3)))), ((moom.oD)(moom.oB.i)));
    ((moom.lw)(((moom.lw)(((moom.lw)(local5)).a(((double)(-0x1.9p6d)), ((double)(-0x1.9p6d)), ((double)(-0x1.9p6d))))).a(((double)(local6)), ((double)(local8))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local5)).a(((double)(-0x1.9p6d)), ((double)(-0x1.9p6d)), ((double)(0x1.9p6d))))).a(((double)(local6)), ((double)((local8 + 0x1.0p-1d)))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local5)).a(((double)(0x1.9p6d)), ((double)(-0x1.9p6d)), ((double)(0x1.9p6d))))).a(((double)((local6 + 0x1.5555555555555p-2d))), ((double)((local8 + 0x1.0p-1d)))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local5)).a(((double)(0x1.9p6d)), ((double)(-0x1.9p6d)), ((double)(-0x1.9p6d))))).a(((double)((local6 + 0x1.5555555555555p-2d))), ((double)(local8))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(p0)).a__Void();
    return;
}


private float a(int p0) {
int forwardValue2264_44_0;
    int forwardValue2264_56_0;
    int forwardValue2264_66_0;
    boolean spill2264_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    int life5_26;
    int life6_33;
    int life5_80;
    int life6_87;
    forward_join_82: {
    forward_join_66: {
    forward_join_56: {
    forward_join_49: {
    forward_join_44: {
    forward_join_37: {
    life2_3 = (moom.JD.v ^ 73144062593956L);
    life4_5 = moom.JM.b__Arrayr3();
    spill2264_0 = ((moom.JD)(this)).a(((int)(p0)), ((int)(this.b)), ((int)(this.c)));
    if (!((life4_5 != null))) {
        forwardValue2264_44_0 = ((spill2264_0) ? 1 : 0);
        break forward_join_44;
    }
    if (!(spill2264_0)) {
        break forward_join_37;
    }
    life5_26 = ((moom.JD)(this)).a__Int(((int)((this.c - this.b))));
    life6_33 = ((moom.JD)(this)).a__Int(((int)((p0 - this.b))));
    return (((float) life6_33) / ((float) life5_26));
    }
    forwardValue2264_44_0 = ((((moom.JD)(this)).a(((int)(p0)), ((int)(this.c)), ((int)(this.d)))) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue2264_56_0 = forwardValue2264_44_0;
        break forward_join_56;
    }
    if (!((forwardValue2264_44_0 != 0))) {
        break forward_join_49;
    }
    return 0x1.0p0f;
    }
    forwardValue2264_56_0 = ((((moom.JD)(this)).a(((int)(p0)), ((int)(this.d)), ((int)(this.e)))) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue2264_66_0 = forwardValue2264_56_0;
        break forward_join_66;
    }
    if (!((forwardValue2264_56_0 != 0))) {
        break forward_join_82;
    }
    forwardValue2264_66_0 = ((moom.JD)(this)).a__Int(((int)((this.e - this.d))));
    }
    life5_80 = forwardValue2264_66_0;
    life6_87 = ((moom.JD)(this)).a__Int(((int)((p0 - this.d))));
    return (0x1.0p0f - (((float) life6_87) / ((float) life5_80)));
    }
    return 0x0.0p0f;
}


private float a(float p0, float p1) {
int forwardValue2263_27_0;
    int forwardValue2263_36_0;
    net.minecraft.entity.Entity[] spill2263_0;
    boolean spill2263_1;
    long life3_3;
    float life6_8;
    net.minecraft.entity.Entity[] life5_9;
    float life7_13;
    float life8_15;
    float life8_51;
    forward_join_41: {
    forward_join_36: {
    forward_join_34: {
    forward_join_27: {
    forward_join_25: {
    life3_3 = (moom.JD.v ^ 42178329632706L);
    spill2263_0 = moom.JM.b__Arrayr3();
    life6_8 = (0x1.0p0f - p0);
    life5_9 = spill2263_0;
    life7_13 = (p0 - p1);
    life8_15 = 0x0.0p0f;
    spill2263_1 = this.l;
    if (!((life5_9 != null))) {
        forwardValue2263_27_0 = ((spill2263_1) ? 1 : 0);
        break forward_join_27;
    }
    if (!(spill2263_1)) {
        break forward_join_25;
    }
    life8_15 = (life8_15 + life6_8);
    }
    forwardValue2263_27_0 = ((this.m) ? 1 : 0);
    }
    if (!((life5_9 != null))) {
        forwardValue2263_36_0 = forwardValue2263_27_0;
        break forward_join_36;
    }
    if (!((forwardValue2263_27_0 != 0))) {
        break forward_join_34;
    }
    life8_15 = (life8_15 + life7_13);
    }
    forwardValue2263_36_0 = ((this.n) ? 1 : 0);
    }
    if (!((forwardValue2263_36_0 != 0))) {
        break forward_join_41;
    }
    life8_15 = (life8_15 + p1);
    }
    life8_51 = moom.N8.a(((float)(life8_15)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    return life8_51;
}


private float a(net.minecraft.world.World p0) {
moom.JD forwardValue2270_19_0;
    moom.Oa forwardValue2270_37_0;
    moom.JD spill2270_0;
    moom.JD spill2270_1;
    moom.Oa spill2270_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    float life5_32;
    float life5_56;
    forward_join_37: {
    forward_join_35: {
    forward_join_19: {
    forward_join_18: {
    life2_3 = (moom.JD.v ^ 92546465505625L);
    life4_5 = moom.JM.b__Arrayr3();
    spill2270_0 = this;
    if (!((life4_5 != null))) {
        forwardValue2270_19_0 = spill2270_0;
        break forward_join_19;
    }
    if (!((((moom.JD)(spill2270_0)).o == null))) {
        break forward_join_18;
    }
    spill2270_1 = this;
    if (!((life4_5 != null))) {
        forwardValue2270_19_0 = spill2270_1;
        break forward_join_19;
    }
    if (!((((moom.JD)(spill2270_1)).p == null))) {
        break forward_join_18;
    }
    return 0x1.0p0f;
    }
    forwardValue2270_19_0 = this;
    }
    life5_32 = ((moom.JD)(forwardValue2270_19_0)).b(((net.minecraft.world.World)(p0)));
    spill2270_2 = this.r;
    if (!((life4_5 != null))) {
        forwardValue2270_37_0 = spill2270_2;
        break forward_join_37;
    }
    if (!((spill2270_2 == null))) {
        break forward_join_35;
    }
    this.r = ((moom.Oa)(new moom.Oa(life5_32, this.q)));
    }
    forwardValue2270_37_0 = this.r;
    }
    life5_56 = ((moom.Oa)(forwardValue2270_37_0)).a(((float)(life5_32)));
    return life5_56;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(java.lang.String p0) {
moom.JD forwardValue2273_30_0;
    int forwardValue2273_87_0;
    int forwardValue2273_136_0;
    int forwardValue2273_153_0;
    int forwardValue2273_169_0;
    int forwardValue2273_177_0;
    moom.JD spill2273_0;
    int spill2273_1;
    int spill2273_2;
    int spill2273_3;
    int spill2273_4;
    boolean spill2273_5;
    int spill2273_6;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    int life5_71;
    int life6_119;
    int life7_127;
    int life8_135;
    int life9_143;
    forward_join_177: {
    forward_join_170: {
    forward_join_169: {
    forward_join_168: {
    forward_join_153: {
    forward_join_151: {
    forward_join_136: {
    forward_join_132: {
    forward_join_87: {
    forward_join_80: {
    forward_join_30: {
    forward_join_22: {
    life2_3 = (moom.JD.v ^ 80678503306005L);
    life4_5 = moom.JM.b__Arrayr3();
    spill2273_0 = this;
    if (!((life4_5 != null))) {
        forwardValue2273_30_0 = spill2273_0;
        break forward_join_30;
    }
    if (!((((moom.JD)(spill2273_0)).a == null))) {
        break forward_join_22;
    }
    java.lang.String __stackOp2273_4_0 = p0;
    java.lang.String __stackOp2273_4_1 = __sourceIntrinsic_051b43f8cbc1_invokedynamic2273_3(4800, (7842811128119014828L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_051b43f8cbc1_invokedynamic2273_5(__stackOp2273_4_1, __stackOp2273_4_0))));
    return ((0) != 0);
    }
    this.a = ((java.lang.String)(moom.Oc.a(((java.lang.String)(this.a)), ((java.lang.String)(moom.Oc.a(((java.lang.String)(p0))))))));
    forwardValue2273_30_0 = this;
    }
    spill2273_1 = ((moom.JD)(forwardValue2273_30_0)).b;
    if (!((life4_5 != null))) {
        forwardValue2273_177_0 = spill2273_1;
        break forward_join_177;
    }
    if (!((spill2273_1 >= 0))) {
        break forward_join_170;
    }
    spill2273_2 = this.c;
    if (!((life4_5 != null))) {
        forwardValue2273_177_0 = spill2273_2;
        break forward_join_177;
    }
    if (!((spill2273_2 >= 0))) {
        break forward_join_170;
    }
    spill2273_3 = this.e;
    if (!((life4_5 != null))) {
        forwardValue2273_177_0 = spill2273_3;
        break forward_join_177;
    }
    if (!((spill2273_3 >= 0))) {
        break forward_join_170;
    }
    life5_71 = ((moom.JD)(this)).a__Int(((int)((this.c - this.b))));
    spill2273_4 = this.d;
    if (!((life4_5 != null))) {
        forwardValue2273_87_0 = spill2273_4;
        break forward_join_87;
    }
    if (!((spill2273_4 < 0))) {
        break forward_join_80;
    }
    this.d = ((int)(((moom.JD)(this)).a__Int(((int)((this.e - life5_71))))));
    spill2273_5 = ((moom.JD)(this)).a(((int)(this.d)), ((int)(this.b)), ((int)(this.c)));
    if (!((life4_5 != null))) {
        forwardValue2273_87_0 = ((spill2273_5) ? 1 : 0);
        break forward_join_87;
    }
    if (!(spill2273_5)) {
        break forward_join_80;
    }
    this.d = ((int)(this.c));
    }
    forwardValue2273_87_0 = ((moom.JD)(this)).a__Int(((int)((this.d - this.c))));
    }
    life6_119 = forwardValue2273_87_0;
    life7_127 = ((moom.JD)(this)).a__Int(((int)((this.e - this.d))));
    life8_135 = ((moom.JD)(this)).a__Int(((int)((this.b - this.e))));
    life9_143 = (((life5_71 + life6_119) + life7_127) + life8_135);
    spill2273_6 = life9_143;
    if (!((life4_5 != null))) {
        forwardValue2273_136_0 = spill2273_6;
        break forward_join_136;
    }
    if (!((spill2273_6 != __sourceIntrinsic_051b43f8cbc1_invokedynamic2273_38(11165, (3231425833523611410L ^ life2_3))))) {
        break forward_join_132;
    }
    int __stackOp2273_40_0 = life9_143;
    java.lang.String __stackOp2273_40_1 = __sourceIntrinsic_051b43f8cbc1_invokedynamic2273_39(7688, (8372002767528081734L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_051b43f8cbc1_invokedynamic2273_41(__stackOp2273_40_1, __stackOp2273_40_0))));
    return ((0) != 0);
    }
    forwardValue2273_136_0 = recovery.source.CarrierOps.fcmpg(((float)(this.h)), ((float)(0x0.0p0f)));
    }
    if (!((life4_5 != null))) {
        forwardValue2273_153_0 = forwardValue2273_136_0;
        break forward_join_153;
    }
    if (!((forwardValue2273_136_0 < 0))) {
        break forward_join_151;
    }
    float __stackOp2273_48_0 = this.h;
    java.lang.String __stackOp2273_48_1 = __sourceIntrinsic_051b43f8cbc1_invokedynamic2273_47(27703, (2524077748487375729L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_051b43f8cbc1_invokedynamic2273_49(__stackOp2273_48_1, __stackOp2273_48_0))));
    return ((0) != 0);
    }
    forwardValue2273_153_0 = this.k;
    }
    if (!((life4_5 != null))) {
        forwardValue2273_169_0 = forwardValue2273_153_0;
        break forward_join_169;
    }
    if (!((forwardValue2273_153_0 <= 0))) {
        break forward_join_168;
    }
    int __stackOp2273_55_0 = this.k;
    java.lang.String __stackOp2273_55_1 = __sourceIntrinsic_051b43f8cbc1_invokedynamic2273_54(18789, (7912724833066216975L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_051b43f8cbc1_invokedynamic2273_56(__stackOp2273_55_1, __stackOp2273_55_0))));
    return ((0) != 0);
    }
    forwardValue2273_169_0 = 1;
    }
    return ((forwardValue2273_169_0) != 0);
    }
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_051b43f8cbc1_invokedynamic2273_60(23985, (2603468976948574964L ^ life2_3)))));
    forwardValue2273_177_0 = 0;
    }
    return ((forwardValue2273_177_0) != 0);
}


private int a__Int(int p0) {
long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    lexical_join_23: {
    lexical_join_18: {
    life2_3 = (moom.JD.v ^ 37616038232280L);
    life4_5 = moom.JM.b__Arrayr3();
    lexical_cycle_6: while (true) {
    if (!((p0 >= __sourceIntrinsic_14567322fa59_invokedynamic824_2(5110, (3763094104565656753L ^ life2_3))))) {
        break lexical_join_18;
    }
    p0 += -24000;
    if (!((life4_5 != null))) {
        break lexical_join_23;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_6; }
    break lexical_cycle_6;
    }
    }
    lexical_cycle_18: while (true) {
    if (!((p0 < 0))) {
        break lexical_join_23;
    }
    p0 += 24000;
    if (!((life4_5 == null))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    return p0;
}


private boolean a(int p0, int p1, int p2) {
int forwardValue2265_24_0;
    int forwardValue2265_29_0;
    int forwardValue2265_29_1;
    int forwardValue2265_36_0;
    int forwardValue2265_38_0;
    int spill2265_0;
    int spill2265_1;
    int spill2265_2;
    int spill2265_3;
    int spill2265_4;
    int spill2265_5;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    forward_join_38: {
    forward_join_37: {
    forward_join_36: {
    forward_join_35: {
    forward_join_29: {
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    life4_3 = (moom.JD.v ^ 48936516982931L);
    life6_5 = moom.JM.b__Arrayr3();
    spill2265_0 = p1;
    spill2265_1 = p2;
    if (!((life6_5 != null))) {
        forwardValue2265_29_0 = spill2265_0;
        forwardValue2265_29_1 = spill2265_1;
        break forward_join_29;
    }
    if (!((spill2265_0 <= spill2265_1))) {
        break forward_join_25;
    }
    spill2265_2 = p0;
    if (!((life6_5 != null))) {
        forwardValue2265_24_0 = spill2265_2;
        break forward_join_24;
    }
    if (!((spill2265_2 >= p1))) {
        break forward_join_23;
    }
    spill2265_3 = p0;
    if (!((life6_5 != null))) {
        forwardValue2265_24_0 = spill2265_3;
        break forward_join_24;
    }
    if (!((spill2265_3 <= p2))) {
        break forward_join_23;
    }
    forwardValue2265_38_0 = 1;
    break forward_join_38;
    }
    forwardValue2265_24_0 = 0;
    }
    forwardValue2265_38_0 = forwardValue2265_24_0;
    break forward_join_38;
    }
    spill2265_4 = p0;
    if (!((life6_5 != null))) {
        forwardValue2265_36_0 = spill2265_4;
        break forward_join_36;
    }
    forwardValue2265_29_0 = spill2265_4;
    forwardValue2265_29_1 = p1;
    }
    if (!((forwardValue2265_29_0 < forwardValue2265_29_1))) {
        break forward_join_35;
    }
    spill2265_5 = p0;
    if (!((life6_5 != null))) {
        forwardValue2265_36_0 = spill2265_5;
        break forward_join_36;
    }
    if (!((spill2265_5 <= p2))) {
        break forward_join_37;
    }
    }
    forwardValue2265_36_0 = 1;
    }
    forwardValue2265_38_0 = forwardValue2265_36_0;
    break forward_join_38;
    }
    forwardValue2265_38_0 = 0;
    }
    return ((forwardValue2265_38_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_25(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_28(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_32(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_36(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_40(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_44(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_48(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_52(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_56(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_61(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_67(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_70(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_71(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_74(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_77(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_80(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_83(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_87(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2ccb21fb52e3a410_originalDynamicSite2202_91(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_599c5f800586_invokedynamic2266_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_599c5f800586_invokedynamic2266_5(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_599c5f800586_invokedynamic2266_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_599c5f800586_invokedynamic2266_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_599c5f800586_invokedynamic2266_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_599c5f800586_invokedynamic2266_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_599c5f800586_invokedynamic2266_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_599c5f800586_invokedynamic2266_15(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b06d1ace241d_invokedynamic2267_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b06d1ace241d_invokedynamic2267_6(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4b80208140b2_invokedynamic2268_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4b80208140b2_invokedynamic2268_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4b80208140b2_invokedynamic2268_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4b80208140b2_invokedynamic2268_12(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_127d2b0d7565_invokedynamic822_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_127d2b0d7565_invokedynamic822_5(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_127d2b0d7565_invokedynamic822_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_127d2b0d7565_invokedynamic822_11(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_127d2b0d7565_invokedynamic822_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_127d2b0d7565_invokedynamic822_17(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_127d2b0d7565_invokedynamic822_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_127d2b0d7565_invokedynamic822_22(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5064_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a4476cbdb134_originalDynamicSite1177_2(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_261a7011aebb_invokedynamic823_13(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_261a7011aebb_invokedynamic823_15(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_7ff6b1a87549_invokedynamic2272_19(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_7ff6b1a87549_invokedynamic2272_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic2273_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic2273_5(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_051b43f8cbc1_invokedynamic2273_38(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic2273_39(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic2273_41(java.lang.String a0, int a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic2273_47(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic2273_49(java.lang.String a0, float a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic2273_54(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic2273_56(java.lang.String a0, int a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic2273_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_14567322fa59_invokedynamic824_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6a817abd23fb_invokedynamic825_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6a817abd23fb_invokedynamic825_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6a817abd23fb_invokedynamic825_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6a817abd23fb_invokedynamic825_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6a817abd23fb_invokedynamic825_14(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5060_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral5061_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1691_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1691_11(java.lang.String a0, java.lang.String a1, int a2, java.lang.String a3, int a4, java.lang.String a5, int a6, java.lang.String a7, int a8) throws E;
}
