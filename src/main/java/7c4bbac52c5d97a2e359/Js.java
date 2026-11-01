package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Js {

private java.lang.String a;

private java.lang.String b;

private moom.bM c;

private java.util.Map<moom.DD, moom.DD> d;

private moom.Kb e;

private net.minecraft.world.biome.BiomeGenBase[] f;

private moom.Ke g;

private java.lang.Boolean h;

private java.lang.Boolean i;

private java.lang.Boolean j;

private java.lang.Boolean k;

private moom.Ke l;

private moom.Kf[] m;

private moom.bN[] n;

private net.minecraft.item.EnumDyeColor[] o;

private static moom.bN[] p;

private static moom.bN[] q;

private static moom.bN[] r;

private static net.minecraft.item.EnumDyeColor[] s;

private static moom.DD t;

private static moom.DD u;

private static moom.DD v;

private static moom.DD w;

private static moom.DD x;

private static moom.DD y;

private static moom.DD z;

private static moom.DD A;

private static moom.DD B;

private static moom.DD C;

private static moom.DD D;

private static moom.DD E;

private static moom.DD F;

private static long G;

private static java.lang.String[] H;

private static java.lang.String[] I;

private static java.util.Map J;

private static long[] K;

private static java.lang.Integer[] L;

private static java.util.Map M;

public Js(java.util.Properties p0, java.lang.String p1) { super(); }


private static void __sourceConstructorBody_82bd185427a29917(moom.Js receiver, java.util.Properties p0, java.lang.String p1) throws Throwable {

long local3 = (moom.Js.G ^ 53598555475271L);

    moom.Js.__sourceConstructorInit_82bd185427a29917_0(((moom.Js)(receiver)));

    ((moom.Js)(receiver)).a = ((java.lang.String)(null));

    ((moom.Js)(receiver)).b = ((java.lang.String)(null));

    ((moom.Js)(receiver)).c = ((moom.bM)(null));

    ((moom.Js)(receiver)).d = ((java.util.Map)(null));

    ((moom.Js)(receiver)).e = ((moom.Kb)(null));

    ((moom.Js)(receiver)).f = ((net.minecraft.world.biome.BiomeGenBase[])(null));

    ((moom.Js)(receiver)).g = ((moom.Ke)(null));

    ((moom.Js)(receiver)).h = ((java.lang.Boolean)(null));

    ((moom.Js)(receiver)).i = ((java.lang.Boolean)(null));

    ((moom.Js)(receiver)).j = ((java.lang.Boolean)(null));

    ((moom.Js)(receiver)).k = ((java.lang.Boolean)(null));

    ((moom.Js)(receiver)).l = ((moom.Ke)(null));

    ((moom.Js)(receiver)).m = ((moom.Kf[])(null));

    ((moom.Js)(receiver)).n = ((moom.bN[])(null));

    ((moom.Js)(receiver)).o = ((net.minecraft.item.EnumDyeColor[])(null));

    moom.J3 local5 = new moom.J3(__sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_17(21425, (8359048807679155339L ^ local3)));

    ((moom.Js)(receiver)).a = ((java.lang.String)(((moom.J3)(local5)).a__String(((java.lang.String)(p1)))));

    ((moom.Js)(receiver)).b = ((java.lang.String)(((moom.J3)(local5)).b(((java.lang.String)(p1)))));

    ((moom.Js)(receiver)).c = ((moom.bM)(((moom.bM)(((moom.J3)(local5)).a(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_22(11022, (207737177879356461L ^ local3))))))), ((java.lang.Enum[])(moom.bM.values())), ((java.lang.String)(__sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_25(14096, (957093004993738802L ^ local3)))))))));

    ((moom.Js)(receiver)).d = ((java.util.Map)(moom.Js.a(((java.util.Properties)(p0)), ((java.lang.String)(__sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_29(15582, (7450649747707311048L ^ local3)))), ((moom.bM)(((moom.Js)(receiver)).c)), ((java.lang.String)(__sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_31(2633, (5547352196884202869L ^ local3)))), ((java.lang.String)(((moom.Js)(receiver)).b)))));

    ((moom.Js)(receiver)).e = ((moom.Kb)(((moom.J3)(local5)).a(((java.lang.String)(__sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_35(16511, (4073692790182465370L ^ local3)))), ((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_36(4797, (1177255092884741512L ^ local3))))))))));

    ((moom.Js)(receiver)).f = ((net.minecraft.world.biome.BiomeGenBase[])(((moom.J3)(local5)).a__ArrayES(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_40(23624, (106131136679400290L ^ local3))))))))));

    ((moom.Js)(receiver)).g = ((moom.Ke)(((moom.J3)(local5)).a__Ke(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_44(30335, (501359365820021093L ^ local3))))))))));

    ((moom.Js)(receiver)).h = ((java.lang.Boolean)(((moom.J3)(local5)).a__Boolean(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_48(31856, (7013837427327071040L ^ local3))))))))));

    ((moom.Js)(receiver)).i = ((java.lang.Boolean)(((moom.J3)(local5)).a__Boolean(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_52(15473, (1741513328149672800L ^ local3))))))))));

    ((moom.Js)(receiver)).j = ((java.lang.Boolean)(((moom.J3)(local5)).a__Boolean(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_56(28551, (2125869769057525918L ^ local3))))))))));

    ((moom.Js)(receiver)).k = ((java.lang.Boolean)(((moom.J3)(local5)).a__Boolean(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_60(24348, (1489787511897346094L ^ local3))))))))));

    ((moom.Js)(receiver)).l = ((moom.Ke)(((moom.J3)(local5)).a__Ke(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_64(10994, (1317274298096559591L ^ local3))))))))));

    ((moom.Js)(receiver)).m = ((moom.Kf[])(((moom.J3)(local5)).a__ArrayKf(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_68(18238, (8013340506832193567L ^ local3))))))))));

    moom.bN[] local6 = moom.Js.a__ArraybN(((moom.bM)(((moom.Js)(receiver)).c)));

    ((moom.Js)(receiver)).n = ((moom.bN[])(((moom.bN[])(((moom.J3)(local5)).a(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_74(7872, (5588233523332616668L ^ local3))))))), ((java.lang.Enum[])(local6)), ((java.lang.String)(__sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_76(10192, (7102610336114452707L ^ local3)))), ((java.lang.Enum[])(moom.Js.r)))))));

    ((moom.Js)(receiver)).o = ((net.minecraft.item.EnumDyeColor[])(moom.Js.a__Arraya2(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_81(8822, (3136922283000573273L ^ local3))))))))));

    return;

}



static {
G = ((long)(((moom._a)(moom._c.a(((long)(2484125322565722984L)), ((long)(6478683366998894880L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(222891422831757L)))));
    long local20_life6 = (moom.Js.G ^ 13340860178625L);
    J = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life9;
    javax.crypto.Cipher __sourceSpill613_11 = (local11_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill613_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill613_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill613_14 = new byte[8];
    (__sourceSpill613_14)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local12_life15 = 1;
    while ((local12_life15 < 8)) {
        (__sourceSpill613_14)[local12_life15] = ((byte) ((int) ((local20_life6 << (local12_life15 * 8)) >>> 56)));
        local12_life15 += 1;
    }
    byte[] __sourcePreallocation613_16 = __sourceSpill613_14;
    ((javax.crypto.Cipher)(__sourceSpill613_11)).init(((int)(__sourceSpill613_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill613_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation613_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local18_life19 = new java.lang.String[46];
    int local16_life20 = 0;
    java.lang.String local15_life21;
    int local17_life23 = ((java.lang.String)((local15_life21 = "·ú¹°\005<°ÐÝ\007p¥û ·÷¤mTÌ£Î^u\037âºë®\034æaþã\037\bEA\b-- ÈVÏÄÉ\035£ÑPþãTú<ÍùCÐ\030+ûahÆÀ½ß=Ü!\035ýD'_}ü,[ßé\020ÿÝÌCÍõ+ä\004ªN\006é\006PhËãq>½¹°L+Áù'\bÄIòÛÎcx\026å\000E/ñ{´ö\023Tä·S³Ë¸ÁØJo`\"M\003úÎ$8]`pRa¥ÓÑïÓjeâ_å¸½\r¤ö5\013÷Ì(¡A«Öø.x°Æþû\b\027ýº9cL0óP`\033äüÔ.MB\007XkßíyT£²(N?r~&sóBW\016gGæ\032­Ô:BÜVÎ°®qË/énØu<Sv'@_Ð}M;Qò1§\tû7íKåbA«CRµ´\022Í1¼i²ÄñàÖ¦¤\013]8MTãDÝQâ¿\004NÃ\003è¿zÑ@\001Z@ Æ#VØä­Z´õp\005\\\016°k\001\t£Xr?Æ\007¢ÉÎräªY\020³EÈPôpê/\026aÂ\002\033@z»Kå/é\023LÆÖ\005/n!NC?®Ä)£A\016\\K\032a?.ðò\t{ Ö.XðÞædF­Ùq}T\031$4û\016Tþú8q¶\002Ìs7\032ðCÏÓÿ3ZÖ|älF7yÁÉÚ\030w*ã&-jÇdòh¼âí^¤KÒÂØW]|¶.g\004úH_26\007Ø=\021\037-Ï\022¸\033ÅÓ'%ìVü\000\004· ÿ'N^9nÀòÅÒ±¡\006`\0040\037§ØíÁd0ÑèR\017®Ïox=J&ºV(Âùê\006õ«Y.Û£chÆ{\0236\bâk\000m5^AEãáüÌ²\031zÏi\020\025ÕWC&áh\t\004åLO»çU |\000ªÚû-û*°Jr\033KÈ±)¢}\036DÇà4@\020ÊÐ\0313ºÖ¯´3\03492@P)¶q¦Ô=\024\006Zïj¢Îlÿâ?AäínuE\024ÓãÓ\\\007\177\fI+?ç}½«æQ\032ë¯S_FÑà·yø\002H\tmý\007\020´û\000_¯LÛôE6WrÀú>\020óð\016ÞU\022÷Kü\005XÑA\0202H\002\016ÐóðK2@<.û_RP\t7è\001\177\004D¬£÷Lxõö\n´!ùù3´±£wîúð$¦³ú\"\031U\032\023Æ\f%ì¸Ð\031µÉî±ýã8¨\036,íYÎV\025ÿ»\034\033ÌßÅH¡¦\tÐó\"m\016\034\b\006Îú\032\005Æ\021l¾\031\fQïíb_Q\006RÊ¡uÅ¥ø¦\003\032ï@ú\007]ÉBèÙcÐX\021¨L\\\000\016H\032 \001\004\034åÑ\006Å×2Ñ£ã\032)ÞR·\020ô'kNrL_5*¹¦\003bÌ\025ö9±<¹8Ñ9s%M¤wåqÝX9Èr(!3\013j~Go\027?yJô>t7\024oN1¡ËÚ³BÇ÷:¶\034éÐsLfäyº\020ÉN@¢\177\"·Û:Vµ\nì¬~\020r\n\027}\036ÄÙùïç\020d¥)Ö@[°pðe£¾n[©õæÍ\n6Wy\037r¼1IÐ\013gI\003J \rãÑ+7ËªÜüpÅìúßæJÝ¯ã\t\025óº \bwÌKb\020ºÈ\001|\036sm¡néA;´ ¥vâÑÉË¸VU÷Ý´®¤Þn#m¤ÑWÀÈY¨÷ËÁ;\030^´\020×\006½OæÉtt²\013\000 y\007\007K\030[\030?{jÕ7ßÁ\031î0ÉÅNÃ½êä\031\030ñý<Üþé\007øøåV\"+ÞOªªz{\030ÛHÊ/»]Ñ°HøI/^-\006\002B\016uÎß; îo\021øÌÎ\005\023é\007/íR@'ÛëñF\020Oå4ãéVÎ ò}v\022èÝ-×|îA¬õb)b¿¦{úÏ½À%¼d¶Õ1\016Ü\020ñ²Li\007ãÑþ¼±r(r(,Ñ®I,ÅGø­âoA.)]mv½ôTÃë*\023+xLëÌê}/ÐÄn ÿ\030&@\035JkO5Yf/Uwµ%àì0óØY@òs=Vi\030Pj8«³ÑÖ,|6ªÔ@7\007°û¢ÆA\báîvíà#\021\177\0301^¸Ü\026RjK\"ò\"\027`ºî\030\031´\031(AI*#fÀÃì9Vì\025¹æ%\005\001?»£g¨øøÒ<ÏÏ0>»¬Q\020\0070\\N\n\007bÞ\024¯RX¾À\177\020(m=¬!©*JÿzÝs³Y\030ÙF}-\007e9P\fÇ]\034ª\036i\003\034\177ÙS>\024H:\025üèq9?¦¿0¬aëEUØ,cÂë\034X ÁÒv\004\020G\027[Xñów/6Ó/±~µÌ?F\002®Ø\0358\\\024\033õ1FWs\017\020ß1z_\031õ¨\017\016\020È"))).length();
    int local14_life24 = 64;
    int local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill613_28 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill613_29 = local11_life9;
        byte[] local19_life31 = ((javax.crypto.Cipher)(__sourceSpill613_29)).doFinal(((byte[])(__sourceSpill613_28)));
        java.lang.String __sourceSpill613_34 = ((java.lang.String)(moom.Js.a(((byte[])(local19_life31))))).intern();
        java.lang.String[] __sourceSpill613_35 = local18_life19;
        int __sourceSpill613_36 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill613_35)[__sourceSpill613_36] = __sourceSpill613_34;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    local17_life23 = ((java.lang.String)((local15_life21 = "Ï¦nØ\bÚï %\002Å1±Ð ã6(isPðfëRÑG\n»¥\024\003\030Ð}öÑäFµÄkÖ"))).length();
    local14_life24 = 16;
    local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill613_41 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill613_42 = local11_life9;
        byte[] local19_life44 = ((javax.crypto.Cipher)(__sourceSpill613_42)).doFinal(((byte[])(__sourceSpill613_41)));
        java.lang.String __sourceSpill613_47 = ((java.lang.String)(moom.Js.a(((byte[])(local19_life44))))).intern();
        java.lang.String[] __sourceSpill613_48 = local18_life19;
        int __sourceSpill613_49 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill613_48)[__sourceSpill613_49] = __sourceSpill613_47;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    H = ((java.lang.String[])(local18_life19));
    I = ((java.lang.String[])(new java.lang.String[46]));
    M = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill613_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill613_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill613_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill613_60 = new byte[8];
    (__sourceSpill613_60)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill613_60)[local1_life61] = ((byte) ((int) ((local20_life6 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation613_62 = __sourceSpill613_60;
    ((javax.crypto.Cipher)(__sourceSpill613_57)).init(((int)(__sourceSpill613_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill613_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation613_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[2];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "­yÉm&£ÔS\005<£m÷"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill613_71 = local4_life67;
        int __sourceSpill613_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill613_71)).substring(((int)(__sourceSpill613_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill613_76 = local6_life65;
        int __sourceSpill613_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill613_79 = new byte[8];
        (__sourceSpill613_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill613_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill613_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill613_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill613_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill613_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill613_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill613_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill613_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill613_80)).doFinal(((byte[])(__sourceSpill613_79)));
        (__sourceSpill613_76)[__sourceSpill613_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    K = ((long[])(local6_life65));
    L = ((java.lang.Integer[])(new java.lang.Integer[2]));
    moom.bN[] __sourceSpill613_86 = new moom.bN[4];
    (__sourceSpill613_86)[0] = moom.bN.HORSE;
    (__sourceSpill613_86)[1] = moom.bN.DONKEY;
    (__sourceSpill613_86)[2] = moom.bN.MULE;
    (__sourceSpill613_86)[3] = moom.bN.LLAMA;
    p = ((moom.bN[])(__sourceSpill613_86));
    moom.bN[] __sourceSpill613_92 = new moom.bN[2];
    (__sourceSpill613_92)[0] = moom.bN.DISPENSER;
    (__sourceSpill613_92)[1] = moom.bN.DROPPER;
    q = ((moom.bN[])(__sourceSpill613_92));
    r = ((moom.bN[])(new moom.bN[0]));
    s = ((net.minecraft.item.EnumDyeColor[])(new net.minecraft.item.EnumDyeColor[0]));
    t = ((moom.DD)(new moom.DD(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite613_97(20160, (3188457363683552354L ^ local20_life6)))));
    u = ((moom.DD)(new moom.DD(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite613_99(7451, (626793503724175264L ^ local20_life6)))));
    v = ((moom.DD)(new moom.DD(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite613_101(22660, (3302604604809165372L ^ local20_life6)))));
    w = ((moom.DD)(new moom.DD(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite613_103(8903, (6507625436206678127L ^ local20_life6)))));
    x = ((moom.DD)(new moom.DD(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite613_105(2577, (206938167928055969L ^ local20_life6)))));
    y = ((moom.DD)(new moom.DD(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite613_107(192, (4926791492224082526L ^ local20_life6)))));
    z = ((moom.DD)(new moom.DD(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite613_109(19340, (6479714643749710115L ^ local20_life6)))));
    A = ((moom.DD)(new moom.DD(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite613_111(6523, (630027883333811178L ^ local20_life6)))));
    B = ((moom.DD)(new moom.DD(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite613_113(31272, (557876619231467669L ^ local20_life6)))));
    C = ((moom.DD)(new moom.DD(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite613_115(20450, (6689028355900681545L ^ local20_life6)))));
    D = ((moom.DD)(new moom.DD(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite613_117(2821, (4637546865649084840L ^ local20_life6)))));
    E = ((moom.DD)(new moom.DD(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite613_119(1518, (6689586417977255744L ^ local20_life6)))));
    F = ((moom.DD)(new moom.DD(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite613_121(18626, (7440430292585130611L ^ local20_life6)))));
}

private static native <E extends Throwable> void __sourceConstructorInit_82bd185427a29917_0(moom.Js a0) throws E;

public java.lang.String toString() {
long local1 = (moom.Js.G ^ 97784547420556L);
    java.lang.String __sourceSpill1748_4 = this.a;
    moom.bM __sourceSpill1748_5 = this.c;
    java.util.Map local3 = this.d;
    moom.bM local4 = __sourceSpill1748_5;
    java.lang.String local5 = __sourceSpill1748_4;
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1748_9(__sourceIntrinsic_a86c261fcdee_originalDynamicSite1748_6(26879, (3687888908558091027L ^ local1)), local5, __sourceIntrinsic_a86c261fcdee_originalDynamicSite1748_7(22691, (1640285495660835656L ^ local1)), local4, __sourceIntrinsic_a86c261fcdee_originalDynamicSite1748_8(29770, (2035884803972554645L ^ local1)), local3);
}


private boolean b(moom.DT p0, net.minecraft.world.IBlockAccess p1) {
int forwardValue2409_26_0;
    int forwardValue2409_39_0;
    net.minecraft.entity.Entity[] spill2409_0;
    int spill2409_1;
    long life3_3;
    net.minecraft.tileentity.TileEntity life6_8;
    net.minecraft.entity.Entity[] life5_9;
    net.minecraft.tileentity.TileEntityChest life7_20;
    moom.Cg life8_37;
    forward_join_39: {
    forward_join_38: {
    forward_join_26: {
    forward_join_24: {
    life3_3 = (moom.Js.G ^ 28476919555390L);
    spill2409_0 = moom.JM.b__Arrayr3();
    life6_8 = ((net.minecraft.world.IBlockAccess)(p1)).a__B9(((moom.DT)(p0)));
    life5_9 = spill2409_0;
    spill2409_1 = ((life6_8 instanceof net.minecraft.tileentity.TileEntityChest) ? 1 : 0);
    if (!((life5_9 != null))) {
        forwardValue2409_26_0 = spill2409_1;
        break forward_join_26;
    }
    if (!((spill2409_1 != 0))) {
        break forward_join_24;
    }
    life7_20 = ((net.minecraft.tileentity.TileEntityChest)(life6_8));
    return ((moom.Js)(this)).a(((net.minecraft.tileentity.TileEntityChest)(life7_20)), ((moom.DT)(p0)), ((net.minecraft.world.IBlockAccess)(p1)));
    }
    forwardValue2409_26_0 = ((life6_8 instanceof moom.Cg) ? 1 : 0);
    }
    if (!((life5_9 != null))) {
        forwardValue2409_39_0 = forwardValue2409_26_0;
        break forward_join_39;
    }
    if (!((forwardValue2409_26_0 != 0))) {
        break forward_join_38;
    }
    life8_37 = ((moom.Cg)(life6_8));
    return ((moom.Js)(this)).a(((moom.Cg)(life8_37)), ((moom.DT)(p0)), ((net.minecraft.world.IBlockAccess)(p1)));
    }
    forwardValue2409_39_0 = 0;
    }
    return ((forwardValue2409_39_0) != 0);
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5441_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Js"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private boolean b(net.minecraft.entity.Entity p0, net.minecraft.world.IBlockAccess p1) {
int forwardValue2410_17_0;
    moom.Js forwardValue2410_24_0;
    int spill2410_0;
    moom.Js spill2410_1;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    net.minecraft.entity.passive.EntityHorse life6_16;
    moom.bN life7_38;
    forward_join_32: {
    forward_join_24: {
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life3_3 = (moom.Js.G ^ 117502230383303L);
    life5_5 = moom.JM.b__Arrayr3();
    spill2410_0 = ((p0 instanceof net.minecraft.entity.passive.EntityHorse) ? 1 : 0);
    if (!((life5_5 != null))) {
        forwardValue2410_17_0 = spill2410_0;
        break forward_join_17;
    }
    if (!((spill2410_0 != 0))) {
        break forward_join_16;
    }
    life6_16 = ((net.minecraft.entity.passive.EntityHorse)(p0));
    if (!((life5_5 == null))) {
        break forward_join_18;
    }
    }
    forwardValue2410_17_0 = 0;
    }
    return ((forwardValue2410_17_0) != 0);
    }
    spill2410_1 = this;
    if (!((life5_5 != null))) {
        forwardValue2410_24_0 = spill2410_1;
        break forward_join_24;
    }
    if (!((((moom.Js)(spill2410_1)).n != null))) {
        break forward_join_32;
    }
    forwardValue2410_24_0 = this;
    }
    life7_38 = ((moom.Js)(forwardValue2410_24_0)).a(((net.minecraft.entity.passive.EntityHorse)(life6_16)));
    return moom.BU.a(((java.lang.Object)(life7_38)), ((java.lang.Object[])(this.n)));
    }
    return ((1) != 0);
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Js.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x5EA4;
        if (L[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = K[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])M.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    M.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Js", exception);
            }
            int n7 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Js.L[n4] = n7;
        }
        return L[n4];
}


private boolean c(moom.DT p0, net.minecraft.world.IBlockAccess p1) {
int forwardValue2411_21_0;
    moom.Js forwardValue2411_28_0;
    net.minecraft.entity.Entity[] spill2411_0;
    int spill2411_1;
    moom.Js spill2411_2;
    long life3_3;
    net.minecraft.tileentity.TileEntity life6_8;
    net.minecraft.entity.Entity[] life5_9;
    moom.Cm life7_20;
    moom.bN life8_42;
    forward_join_36: {
    forward_join_28: {
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life3_3 = (moom.Js.G ^ 124913989989815L);
    spill2411_0 = moom.JM.b__Arrayr3();
    life6_8 = ((net.minecraft.world.IBlockAccess)(p1)).a__B9(((moom.DT)(p0)));
    life5_9 = spill2411_0;
    spill2411_1 = ((life6_8 instanceof moom.Cm) ? 1 : 0);
    if (!((life5_9 != null))) {
        forwardValue2411_21_0 = spill2411_1;
        break forward_join_21;
    }
    if (!((spill2411_1 != 0))) {
        break forward_join_20;
    }
    life7_20 = ((moom.Cm)(life6_8));
    if (!((life5_9 == null))) {
        break forward_join_22;
    }
    }
    forwardValue2411_21_0 = 0;
    }
    return ((forwardValue2411_21_0) != 0);
    }
    spill2411_2 = this;
    if (!((life5_9 != null))) {
        forwardValue2411_28_0 = spill2411_2;
        break forward_join_28;
    }
    if (!((((moom.Js)(spill2411_2)).n != null))) {
        break forward_join_36;
    }
    forwardValue2411_28_0 = this;
    }
    life8_42 = ((moom.Js)(forwardValue2411_28_0)).a(((moom.Cm)(life7_20)));
    return moom.BU.a(((java.lang.Object)(life8_42)), ((java.lang.Object[])(this.n)));
    }
    return ((1) != 0);
}


public moom.DD a(moom.DD p0) {
moom.DD forwardValue2396_17_0;
    moom.DD forwardValue2396_19_0;
    net.minecraft.entity.Entity[] spill2396_0;
    moom.DD spill2396_1;
    long life2_3;
    moom.DD life5_10;
    net.minecraft.entity.Entity[] life4_11;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life2_3 = (moom.Js.G ^ 95009611997427L);
    spill2396_0 = moom.JM.b__Arrayr3();
    life5_10 = ((moom.DD)(((java.util.Map)(this.d)).get(((java.lang.Object)(p0)))));
    life4_11 = spill2396_0;
    spill2396_1 = life5_10;
    if (!((life4_11 != null))) {
        forwardValue2396_17_0 = spill2396_1;
        break forward_join_17;
    }
    if (!((spill2396_1 == null))) {
        break forward_join_18;
    }
    forwardValue2396_17_0 = p0;
    }
    forwardValue2396_19_0 = forwardValue2396_17_0;
    break forward_join_19;
    }
    forwardValue2396_19_0 = life5_10;
    }
    return forwardValue2396_19_0;
}


private static moom.DD a(java.lang.String p0, java.lang.String p1) {
java.lang.String forwardValue2394_18_0;
    java.lang.String forwardValue2394_36_0;
    java.lang.String spill2394_0;
    java.lang.String spill2394_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    java.lang.String life0_19;
    java.lang.String life5_23;
    forward_join_37: {
    forward_join_36: {
    forward_join_18: {
    forward_join_12: {
    life2_3 = (moom.Js.G ^ 79758291125706L);
    life4_5 = moom.JM.b__Arrayr3();
    spill2394_0 = p0;
    if (!((life4_5 != null))) {
        forwardValue2394_18_0 = spill2394_0;
        break forward_join_18;
    }
    if (!((spill2394_0 == null))) {
        break forward_join_12;
    }
    return null;
    }
    life0_19 = ((java.lang.String)(p0)).trim();
    forwardValue2394_18_0 = moom.Oc.a(((java.lang.String)(life0_19)), ((java.lang.String)(p1)));
    }
    life5_23 = forwardValue2394_18_0;
    spill2394_1 = life5_23;
    if (!((life4_5 != null))) {
        forwardValue2394_36_0 = spill2394_1;
        break forward_join_36;
    }
    if (!((!((java.lang.String)(spill2394_1)).endsWith(((java.lang.String)(__sourceIntrinsic_ab822d989da3_invokedynamic2394_4(9262, (6054272689423180687L ^ life2_3)))))))) {
        break forward_join_37;
    }
    forwardValue2394_36_0 = __sourceIntrinsic_ab822d989da3_invokedynamic2394_7(life5_23, __sourceIntrinsic_ab822d989da3_invokedynamic2394_6(9262, (6054272689423180687L ^ life2_3)));
    }
    life5_23 = forwardValue2394_36_0;
    }
    return new moom.DD(__sourceIntrinsic_ab822d989da3_invokedynamic2394_8(p1, life5_23));
}


private static net.minecraft.item.EnumDyeColor a(java.lang.String p0) {
int lexicalValue865_39_0;
    net.minecraft.item.EnumDyeColor lexicalValue865_41_0;
    boolean spill865_0;
    net.minecraft.item.EnumDyeColor spill865_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    net.minecraft.item.EnumDyeColor[] life4_9;
    net.minecraft.item.EnumDyeColor[] life5_11;
    int life6_14;
    int life7_16;
    net.minecraft.item.EnumDyeColor life8_23;
    lexical_join_45: {
    life1_3 = (moom.Js.G ^ 121021241254372L);
    life3_5 = moom.JM.b__Arrayr3();
    if (!((p0 != null))) {
        break lexical_join_45;
    }
    life4_9 = net.minecraft.item.EnumDyeColor.values();
    life5_11 = life4_9;
    life6_14 = (life5_11).length;
    life7_16 = 0;
    lexical_cycle_17: while (true) {
    lexical_join_42: {
    lexical_join_41: {
    lexical_join_39: {
    lexical_join_33: {
    if (!((life7_16 < life6_14))) {
        break lexical_join_45;
    }
    life8_23 = (life5_11)[life7_16];
    spill865_0 = ((java.lang.String)(((net.minecraft.item.EnumDyeColor)(life8_23)).a__String())).equals(((java.lang.Object)(p0)));
    if (!((life3_5 != null))) {
        lexicalValue865_39_0 = ((spill865_0) ? 1 : 0);
        break lexical_join_39;
    }
    if (!(spill865_0)) {
        break lexical_join_33;
    }
    return life8_23;
    }
    spill865_1 = life8_23;
    if (!((life3_5 != null))) {
        lexicalValue865_41_0 = spill865_1;
        break lexical_join_41;
    }
    lexicalValue865_39_0 = ((((java.lang.String)(((net.minecraft.item.EnumDyeColor)(spill865_1)).b__String())).equals(((java.lang.Object)(p0)))) ? 1 : 0);
    }
    if (!((lexicalValue865_39_0 != 0))) {
        break lexical_join_42;
    }
    lexicalValue865_41_0 = life8_23;
    }
    return lexicalValue865_41_0;
    }
    life7_16 += 1;
    if (!((life3_5 == null))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    return null;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public moom.bM a() {
return this.c;
}


private moom.bN a(net.minecraft.entity.passive.EntityHorse p0) {
long local2 = (moom.Js.G ^ 130611392680480L);
    int local4 = ((net.minecraft.entity.passive.EntityHorse)(p0)).t();
    switch (local4) {
case 0:
{
        return moom.bN.HORSE;
    }
case 1:
{
        return moom.bN.DONKEY;
    }
case 2:
{
        return moom.bN.MULE;
    }
default:
{
        return null;
    }
}
}


private static java.util.Map<moom.DD, moom.DD> a(java.util.Properties p0, java.lang.String p1, moom.bM p2, java.lang.String p3, java.lang.String p4) {
java.lang.Object lexicalValue866_37_0;
    java.lang.String lexicalValue866_40_0;
    java.lang.String lexicalValue866_60_0;
    java.lang.String lexicalValue866_60_1;
    net.minecraft.entity.Entity[] spill866_0;
    java.lang.String spill866_1;
    java.lang.String spill866_2;
    moom.DD spill866_3;
    java.lang.String spill866_4;
    java.lang.String spill866_5;
    long life5_3;
    java.util.HashMap life8_8;
    net.minecraft.entity.Entity[] life7_9;
    java.lang.String life9_13;
    moom.DD life10_23;
    moom.DD life11_29;
    java.lang.String life10_52;
    java.util.Iterator life11_56;
    java.lang.String life12_63;
    java.lang.String life13_80;
    java.lang.String life13_93;
    java.lang.String life13_102;
    java.lang.String life14_111;
    java.lang.String life15_115;
    moom.DD life16_120;
    moom.DD life17_124;
    lexical_join_114: {
    lexical_join_40: {
    lexical_join_38: {
    lexical_join_37: {
    life5_3 = (moom.Js.G ^ 41608806058123L);
    spill866_0 = moom.JM.b__Arrayr3();
    life8_8 = new java.util.HashMap();
    life7_9 = spill866_0;
    life9_13 = ((java.util.Properties)(p0)).getProperty(((java.lang.String)(p1)));
    spill866_1 = life9_13;
    if (!((life7_9 != null))) {
        lexicalValue866_40_0 = spill866_1;
        break lexical_join_40;
    }
    if (!((spill866_1 != null))) {
        break lexical_join_38;
    }
    life10_23 = moom.Js.a(((moom.bM)(p2)));
    spill866_2 = life9_13;
    if (!((life7_9 != null))) {
        lexicalValue866_40_0 = spill866_2;
        break lexical_join_40;
    }
    life11_29 = moom.Js.a(((java.lang.String)(spill866_2)), ((java.lang.String)(p4)));
    if (!((life10_23 != null))) {
        break lexical_join_38;
    }
    spill866_3 = life11_29;
    if (!((life7_9 != null))) {
        lexicalValue866_37_0 = spill866_3;
        break lexical_join_37;
    }
    if (!((spill866_3 != null))) {
        break lexical_join_38;
    }
    lexicalValue866_37_0 = ((java.util.Map)(life8_8)).put(((java.lang.Object)(life10_23)), ((java.lang.Object)(life11_29)));
    }
    recovery.source.CarrierOps.discard(lexicalValue866_37_0);
    }
    lexicalValue866_40_0 = __sourceIntrinsic_6174378250d0_invokedynamic866_7(p1);
    }
    life10_52 = lexicalValue866_40_0;
    life11_56 = ((java.util.Set)(((java.util.Properties)(p0)).keySet())).iterator();
    lexical_cycle_45: while (true) {
    lexical_join_112: {
    lexical_join_60: {
    if (!(((java.util.Iterator)(life11_56)).hasNext())) {
        break lexical_join_114;
    }
    life12_63 = ((java.lang.String)(((java.util.Iterator)(life11_56)).next()));
    spill866_4 = life12_63;
    spill866_5 = life10_52;
    if (!((life7_9 != null))) {
        lexicalValue866_60_0 = spill866_4;
        lexicalValue866_60_1 = spill866_5;
        break lexical_join_60;
    }
    if (!(((java.lang.String)(spill866_4)).startsWith(((java.lang.String)(spill866_5))))) {
        break lexical_join_112;
    }
    lexicalValue866_60_0 = life12_63;
    lexicalValue866_60_1 = life10_52;
    }
    life13_80 = ((java.lang.String)(lexicalValue866_60_0)).substring(((int)(((java.lang.String)(lexicalValue866_60_1)).length())));
    life13_93 = ((java.lang.String)(life13_80)).replace(((char)(__sourceIntrinsic_6174378250d0_invokedynamic866_16(22762, (6691994399915015020L ^ life5_3)))), ((char)(__sourceIntrinsic_6174378250d0_invokedynamic866_17(20614, (1564192887057085185L ^ life5_3)))));
    life13_102 = moom.Ob.c(((java.lang.String)(life13_93)), ((java.lang.String)("/")), ((java.lang.String)(__sourceIntrinsic_6174378250d0_invokedynamic866_19(19021, (5437266607743500446L ^ life5_3)))));
    life14_111 = __sourceIntrinsic_6174378250d0_invokedynamic866_22(p3, life13_102, __sourceIntrinsic_6174378250d0_invokedynamic866_21(9262, (6054374684670848718L ^ life5_3)));
    life15_115 = ((java.util.Properties)(p0)).getProperty(((java.lang.String)(life12_63)));
    life16_120 = new moom.DD(life14_111);
    life17_124 = moom.Js.a(((java.lang.String)(life15_115)), ((java.lang.String)(p4)));
    ((java.util.Map)(life8_8)).put(((java.lang.Object)(life16_120)), ((java.lang.Object)(life17_124)));
    }
    if (!((life7_9 == null))) { continue lexical_cycle_45; }
    break lexical_cycle_45;
    }
    }
    return life8_8;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5449_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Js"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static net.minecraft.item.EnumDyeColor[] a__Arraya2(java.lang.String p0) {
java.lang.String lexicalValue868_16_0;
    java.lang.String spill868_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    java.lang.String life0_19;
    java.lang.String[] life4_23;
    net.minecraft.item.EnumDyeColor[] life5_27;
    int life6_29;
    java.lang.String life7_37;
    net.minecraft.item.EnumDyeColor life8_40;
    lexical_join_58: {
    lexical_join_16: {
    lexical_join_12: {
    life1_3 = (moom.Js.G ^ 37106290670466L);
    life3_5 = moom.JM.b__Arrayr3();
    spill868_0 = p0;
    if (!((life3_5 != null))) {
        lexicalValue868_16_0 = spill868_0;
        break lexical_join_16;
    }
    if (!((spill868_0 == null))) {
        break lexical_join_12;
    }
    return null;
    }
    life0_19 = ((java.lang.String)(p0)).toLowerCase();
    lexicalValue868_16_0 = life0_19;
    }
    life4_23 = moom.BU.a__ArrayString(((java.lang.String)(lexicalValue868_16_0)), ((java.lang.String)(" ")));
    life5_27 = new net.minecraft.item.EnumDyeColor[(life4_23).length];
    life6_29 = 0;
    lexical_cycle_25: while (true) {
    lexical_join_56: {
    lexical_join_51: {
    if (!((life6_29 < (life4_23).length))) {
        break lexical_join_58;
    }
    life7_37 = (life4_23)[life6_29];
    life8_40 = moom.Js.a(((java.lang.String)(life7_37)));
    if (!((life3_5 != null))) {
        break lexical_join_56;
    }
    if (!((life8_40 == null))) {
        break lexical_join_51;
    }
    java.lang.String __stackOp868_6_0 = life7_37;
    java.lang.String __stackOp868_6_1 = __sourceIntrinsic_2c48b014dab3_invokedynamic868_5(27715, (2826848813636081051L ^ life1_3));
    moom.Js.a__Void(((java.lang.String)(__sourceIntrinsic_2c48b014dab3_invokedynamic868_7(__stackOp868_6_1, __stackOp868_6_0))));
    return moom.Js.s;
    }
    (life5_27)[life6_29] = life8_40;
    life6_29 += 1;
    }
    if (!((life3_5 == null))) { continue lexical_cycle_25; }
    break lexical_cycle_25;
    }
    }
    return life5_27;
}


private static moom.bN[] a__ArraybN(moom.bM p0) {
moom.bM forwardValue2406_15_0;
    moom.bM forwardValue2406_15_1;
    moom.bN[] forwardValue2406_20_0;
    moom.bM spill2406_0;
    moom.bM spill2406_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_20: {
    forward_join_18: {
    forward_join_15: {
    forward_join_13: {
    life1_3 = (moom.Js.G ^ 117865338716330L);
    life3_5 = moom.JM.b__Arrayr3();
    spill2406_0 = p0;
    spill2406_1 = moom.bM.HORSE;
    if (!((life3_5 != null))) {
        forwardValue2406_15_0 = spill2406_0;
        forwardValue2406_15_1 = spill2406_1;
        break forward_join_15;
    }
    if (!((spill2406_0 == spill2406_1))) {
        break forward_join_13;
    }
    forwardValue2406_20_0 = moom.Js.p;
    break forward_join_20;
    }
    forwardValue2406_15_0 = p0;
    forwardValue2406_15_1 = moom.bM.DISPENSER;
    }
    if (!((forwardValue2406_15_0 == forwardValue2406_15_1))) {
        break forward_join_18;
    }
    forwardValue2406_20_0 = moom.Js.q;
    break forward_join_20;
    }
    forwardValue2406_20_0 = new moom.bN[0];
    }
    return forwardValue2406_20_0;
}


private static void a__Void(java.lang.String p0) {
long local1_life2 = (moom.Js.G ^ 36999777687465L);
    java.lang.String __stackOp545_5_0 = p0;
    java.lang.String __stackOp545_5_1 = __sourceIntrinsic_e2d81269afae_originalDynamicSite545_4(12800, (5711975979462141950L ^ local1_life2));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_e2d81269afae_originalDynamicSite545_6(__stackOp545_5_1, __stackOp545_5_0))));
    return;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Js.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 14290);
    if (((moom.Js.I)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Js.J)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Js.J)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Js", life9_51);
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
        life9_116 = ((java.lang.String)((moom.Js.H)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Js.I)[life5_8] = moom.Js.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Js.I)[life5_8];
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
        byte[] spill2785_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2785_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2785_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2785_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2785_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2785_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static net.minecraft.world.IWorldNameable a__Ep(net.minecraft.client.gui.GuiScreen p0) {
int forwardValue2408_17_0;
    int forwardValue2408_26_0;
    int forwardValue2408_35_0;
    int forwardValue2408_44_0;
    int forwardValue2408_53_0;
    int forwardValue2408_64_0;
    net.minecraft.client.gui.GuiScreen forwardValue2408_66_0;
    net.minecraft.world.IWorldNameable forwardValue2408_70_0;
    int spill2408_0;
    net.minecraft.client.gui.GuiScreen spill2408_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_70: {
    forward_join_69: {
    forward_join_66: {
    forward_join_64: {
    forward_join_60: {
    forward_join_53: {
    forward_join_51: {
    forward_join_44: {
    forward_join_42: {
    forward_join_35: {
    forward_join_33: {
    forward_join_26: {
    forward_join_24: {
    forward_join_17: {
    forward_join_15: {
    life1_3 = (moom.Js.G ^ 66658130332487L);
    life3_5 = moom.JM.b__Arrayr3();
    spill2408_0 = ((p0 instanceof net.minecraft.client.gui.inventory.GuiBeacon) ? 1 : 0);
    if (!((life3_5 != null))) {
        forwardValue2408_17_0 = spill2408_0;
        break forward_join_17;
    }
    if (!((spill2408_0 != 0))) {
        break forward_join_15;
    }
    forwardValue2408_70_0 = ((net.minecraft.client.gui.inventory.GuiBeacon)(((net.minecraft.client.gui.inventory.GuiBeacon)(p0)))).ab;
    break forward_join_70;
    }
    forwardValue2408_17_0 = ((p0 instanceof moom.hm) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2408_26_0 = forwardValue2408_17_0;
        break forward_join_26;
    }
    if (!((forwardValue2408_17_0 != 0))) {
        break forward_join_24;
    }
    forwardValue2408_70_0 = ((moom.hm)(((moom.hm)(p0)))).ab;
    break forward_join_70;
    }
    forwardValue2408_26_0 = ((p0 instanceof moom.hn) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2408_35_0 = forwardValue2408_26_0;
        break forward_join_35;
    }
    if (!((forwardValue2408_26_0 != 0))) {
        break forward_join_33;
    }
    forwardValue2408_70_0 = ((moom.hn)(((moom.hn)(p0)))).ab;
    break forward_join_70;
    }
    forwardValue2408_35_0 = ((p0 instanceof moom.hp) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2408_44_0 = forwardValue2408_35_0;
        break forward_join_44;
    }
    if (!((forwardValue2408_35_0 != 0))) {
        break forward_join_42;
    }
    forwardValue2408_70_0 = ((moom.hp)(((moom.hp)(p0)))).ab;
    break forward_join_70;
    }
    forwardValue2408_44_0 = ((p0 instanceof net.minecraft.client.gui.GuiEnchantment) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2408_53_0 = forwardValue2408_44_0;
        break forward_join_53;
    }
    if (!((forwardValue2408_44_0 != 0))) {
        break forward_join_51;
    }
    forwardValue2408_70_0 = ((net.minecraft.client.gui.GuiEnchantment)(((net.minecraft.client.gui.GuiEnchantment)(p0)))).an;
    break forward_join_70;
    }
    forwardValue2408_53_0 = ((p0 instanceof moom.hq) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2408_64_0 = forwardValue2408_53_0;
        break forward_join_64;
    }
    if (!((forwardValue2408_53_0 != 0))) {
        break forward_join_60;
    }
    forwardValue2408_70_0 = ((moom.hq)(((moom.hq)(p0)))).ab;
    break forward_join_70;
    }
    spill2408_1 = p0;
    if (!((life3_5 != null))) {
        forwardValue2408_66_0 = spill2408_1;
        break forward_join_66;
    }
    forwardValue2408_64_0 = ((spill2408_1 instanceof moom.hi) ? 1 : 0);
    }
    if (!((forwardValue2408_64_0 != 0))) {
        break forward_join_69;
    }
    forwardValue2408_66_0 = p0;
    }
    forwardValue2408_70_0 = ((moom.hi)(((moom.hi)(forwardValue2408_66_0)))).ab;
    break forward_join_70;
    }
    forwardValue2408_70_0 = null;
    }
    return forwardValue2408_70_0;
}


private boolean a(moom.DT p0, net.minecraft.world.IBlockAccess p1) {
int forwardValue2397_21_0;
    net.minecraft.entity.Entity[] spill2397_0;
    int spill2397_1;
    long life3_3;
    net.minecraft.tileentity.TileEntity life6_8;
    net.minecraft.entity.Entity[] life5_9;
    net.minecraft.tileentity.TileEntityBeacon life7_20;
    net.minecraft.nbt.NBTTagCompound life8_34;
    int life9_45;
    forward_join_45: {
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life3_3 = (moom.Js.G ^ 126322331657135L);
    spill2397_0 = moom.JM.b__Arrayr3();
    life6_8 = ((net.minecraft.world.IBlockAccess)(p1)).a__B9(((moom.DT)(p0)));
    life5_9 = spill2397_0;
    spill2397_1 = ((life6_8 instanceof net.minecraft.tileentity.TileEntityBeacon) ? 1 : 0);
    if (!((life5_9 != null))) {
        forwardValue2397_21_0 = spill2397_1;
        break forward_join_21;
    }
    if (!((spill2397_1 != 0))) {
        break forward_join_20;
    }
    life7_20 = ((net.minecraft.tileentity.TileEntityBeacon)(life6_8));
    if (!((life5_9 == null))) {
        break forward_join_22;
    }
    }
    forwardValue2397_21_0 = 0;
    }
    return ((forwardValue2397_21_0) != 0);
    }
    if (!((this.l != null))) {
        break forward_join_45;
    }
    life8_34 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.tileentity.TileEntityBeacon)(life7_20)).b(((net.minecraft.nbt.NBTTagCompound)(life8_34)));
    life9_45 = ((net.minecraft.nbt.NBTTagCompound)(life8_34)).a__Int(((java.lang.String)(__sourceIntrinsic_959eb7fbd3c0_invokedynamic2397_8(27154, (8061603215159446469L ^ life3_3)))));
    return ((moom.Ke)(this.l)).a__Boolean(((int)(life9_45)));
    }
    return ((1) != 0);
}


public boolean a__Boolean(java.lang.String p0) {
moom.Js forwardValue2407_34_0;
    moom.Js forwardValue2407_50_0;
    moom.Js forwardValue2407_67_0;
    moom.Js forwardValue2407_84_0;
    moom.Js forwardValue2407_101_0;
    java.lang.String forwardValue2407_125_0;
    int forwardValue2407_127_0;
    java.lang.String spill2407_0;
    int spill2407_1;
    moom.Js spill2407_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_127: {
    forward_join_125: {
    forward_join_117: {
    forward_join_115: {
    forward_join_101: {
    forward_join_100: {
    forward_join_84: {
    forward_join_83: {
    forward_join_67: {
    forward_join_66: {
    forward_join_50: {
    forward_join_49: {
    forward_join_34: {
    forward_join_33: {
    life2_3 = (moom.Js.G ^ 26064926742240L);
    life4_5 = moom.JM.b__Arrayr3();
    spill2407_0 = this.a;
    if (!((life4_5 != null))) {
        forwardValue2407_125_0 = spill2407_0;
        break forward_join_125;
    }
    if (!((spill2407_0 != null))) {
        break forward_join_117;
    }
    spill2407_1 = ((java.lang.String)(this.a)).length();
    if (!((life4_5 != null))) {
        forwardValue2407_127_0 = spill2407_1;
        break forward_join_127;
    }
    if (!((spill2407_1 > 0))) {
        break forward_join_117;
    }
    spill2407_2 = this;
    if (!((life4_5 != null))) {
        forwardValue2407_34_0 = spill2407_2;
        break forward_join_34;
    }
    if (!((((moom.Js)(spill2407_2)).b == null))) {
        break forward_join_33;
    }
    java.lang.String __stackOp2407_7_0 = p0;
    java.lang.String __stackOp2407_7_1 = __sourceIntrinsic_051b43f8cbc1_invokedynamic2407_6(2312, (2247118795182218673L ^ life2_3));
    moom.Js.a__Void(((java.lang.String)(__sourceIntrinsic_051b43f8cbc1_invokedynamic2407_8(__stackOp2407_7_1, __stackOp2407_7_0))));
    return ((0) != 0);
    }
    forwardValue2407_34_0 = this;
    }
    if (!((life4_5 != null))) {
        forwardValue2407_50_0 = forwardValue2407_34_0;
        break forward_join_50;
    }
    if (!((((moom.Js)(forwardValue2407_34_0)).c == null))) {
        break forward_join_49;
    }
    java.lang.String __stackOp2407_13_0 = p0;
    java.lang.String __stackOp2407_13_1 = __sourceIntrinsic_051b43f8cbc1_invokedynamic2407_12(30907, (2947198442278743077L ^ life2_3));
    moom.Js.a__Void(((java.lang.String)(__sourceIntrinsic_051b43f8cbc1_invokedynamic2407_14(__stackOp2407_13_1, __stackOp2407_13_0))));
    return ((0) != 0);
    }
    forwardValue2407_50_0 = this;
    }
    if (!((life4_5 != null))) {
        forwardValue2407_67_0 = forwardValue2407_50_0;
        break forward_join_67;
    }
    if (!(((java.util.Map)(((moom.Js)(forwardValue2407_50_0)).d)).isEmpty())) {
        break forward_join_66;
    }
    java.lang.String __stackOp2407_20_0 = p0;
    java.lang.String __stackOp2407_20_1 = __sourceIntrinsic_051b43f8cbc1_invokedynamic2407_19(17780, (207686727676514795L ^ life2_3));
    moom.Js.a__Void(((java.lang.String)(__sourceIntrinsic_051b43f8cbc1_invokedynamic2407_21(__stackOp2407_20_1, __stackOp2407_20_0))));
    return ((0) != 0);
    }
    forwardValue2407_67_0 = this;
    }
    if (!((life4_5 != null))) {
        forwardValue2407_84_0 = forwardValue2407_67_0;
        break forward_join_84;
    }
    if (!((((moom.Js)(forwardValue2407_67_0)).m == moom.J3.b))) {
        break forward_join_83;
    }
    java.lang.String __stackOp2407_27_0 = p0;
    java.lang.String __stackOp2407_27_1 = __sourceIntrinsic_051b43f8cbc1_invokedynamic2407_26(29454, (6870370119925393309L ^ life2_3));
    moom.Js.a__Void(((java.lang.String)(__sourceIntrinsic_051b43f8cbc1_invokedynamic2407_28(__stackOp2407_27_1, __stackOp2407_27_0))));
    return ((0) != 0);
    }
    forwardValue2407_84_0 = this;
    }
    if (!((life4_5 != null))) {
        forwardValue2407_101_0 = forwardValue2407_84_0;
        break forward_join_101;
    }
    if (!((((moom.Js)(forwardValue2407_84_0)).n == moom.Js.r))) {
        break forward_join_100;
    }
    java.lang.String __stackOp2407_34_0 = p0;
    java.lang.String __stackOp2407_34_1 = __sourceIntrinsic_051b43f8cbc1_invokedynamic2407_33(12310, (8966705339971052714L ^ life2_3));
    moom.Js.a__Void(((java.lang.String)(__sourceIntrinsic_051b43f8cbc1_invokedynamic2407_35(__stackOp2407_34_1, __stackOp2407_34_0))));
    return ((0) != 0);
    }
    forwardValue2407_101_0 = this;
    }
    if (!((((moom.Js)(forwardValue2407_101_0)).o == moom.Js.s))) {
        break forward_join_115;
    }
    java.lang.String __stackOp2407_41_0 = p0;
    java.lang.String __stackOp2407_41_1 = __sourceIntrinsic_051b43f8cbc1_invokedynamic2407_40(10620, (4838491503002500586L ^ life2_3));
    moom.Js.a__Void(((java.lang.String)(__sourceIntrinsic_051b43f8cbc1_invokedynamic2407_42(__stackOp2407_41_1, __stackOp2407_41_0))));
    return ((0) != 0);
    }
    return ((1) != 0);
    }
    java.lang.String __stackOp2407_47_0 = p0;
    java.lang.String __stackOp2407_47_1 = __sourceIntrinsic_051b43f8cbc1_invokedynamic2407_46(15346, (3919043742915637107L ^ life2_3));
    forwardValue2407_125_0 = __sourceIntrinsic_051b43f8cbc1_invokedynamic2407_48(__stackOp2407_47_1, __stackOp2407_47_0);
    }
    moom.Js.a__Void(((java.lang.String)(forwardValue2407_125_0)));
    forwardValue2407_127_0 = 0;
    }
    return ((forwardValue2407_127_0) != 0);
}


private boolean a(net.minecraft.tileentity.TileEntityChest p0, moom.DT p1, net.minecraft.world.IBlockAccess p2) {
net.minecraft.tileentity.TileEntityChest forwardValue2403_13_0;
    net.minecraft.tileentity.TileEntityChest forwardValue2403_18_0;
    net.minecraft.tileentity.TileEntityChest forwardValue2403_23_0;
    int forwardValue2403_27_0;
    int forwardValue2403_35_0;
    int forwardValue2403_37_0;
    net.minecraft.tileentity.TileEntityChest spill2403_0;
    int spill2403_1;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    int life7_47;
    int life8_63;
    int life9_65;
    int life10_67;
    forward_join_37: {
    forward_join_36: {
    forward_join_35: {
    forward_join_27: {
    forward_join_26: {
    forward_join_24: {
    forward_join_23: {
    forward_join_18: {
    forward_join_13: {
    life4_3 = (moom.Js.G ^ 71775258023862L);
    life6_5 = moom.JM.b__Arrayr3();
    spill2403_0 = ((net.minecraft.tileentity.TileEntityChest)(p0)).r;
    if (!((life6_5 != null))) {
        forwardValue2403_13_0 = spill2403_0;
        break forward_join_13;
    }
    if (!((spill2403_0 == null))) {
        break forward_join_24;
    }
    forwardValue2403_13_0 = ((net.minecraft.tileentity.TileEntityChest)(p0)).q;
    }
    if (!((life6_5 != null))) {
        forwardValue2403_18_0 = forwardValue2403_13_0;
        break forward_join_18;
    }
    if (!((forwardValue2403_13_0 == null))) {
        break forward_join_24;
    }
    forwardValue2403_18_0 = ((net.minecraft.tileentity.TileEntityChest)(p0)).p;
    }
    if (!((life6_5 != null))) {
        forwardValue2403_23_0 = forwardValue2403_18_0;
        break forward_join_23;
    }
    if (!((forwardValue2403_18_0 == null))) {
        break forward_join_24;
    }
    forwardValue2403_23_0 = ((net.minecraft.tileentity.TileEntityChest)(p0)).s;
    }
    if (!((forwardValue2403_23_0 != null))) {
        break forward_join_26;
    }
    }
    forwardValue2403_27_0 = 1;
    break forward_join_27;
    }
    forwardValue2403_27_0 = 0;
    }
    life7_47 = forwardValue2403_27_0;
    spill2403_1 = ((net.minecraft.tileentity.TileEntityChest)(p0)).h();
    if (!((life6_5 != null))) {
        forwardValue2403_35_0 = spill2403_1;
        break forward_join_35;
    }
    if (!((spill2403_1 == 1))) {
        break forward_join_36;
    }
    forwardValue2403_35_0 = 1;
    }
    forwardValue2403_37_0 = forwardValue2403_35_0;
    break forward_join_37;
    }
    forwardValue2403_37_0 = 0;
    }
    life8_63 = forwardValue2403_37_0;
    life9_65 = ((moom.Ju.d) ? 1 : 0);
    life10_67 = 0;
    return ((moom.Js)(this)).a(((boolean)__sourceIntrinsic_integerToBoolean((life7_47))), ((boolean)__sourceIntrinsic_integerToBoolean((life8_63))), ((boolean)__sourceIntrinsic_integerToBoolean((life9_65))), ((boolean)__sourceIntrinsic_integerToBoolean((life10_67))));
}


public static java.lang.String a(net.minecraft.client.gui.GuiScreen p0) {
net.minecraft.world.IWorldNameable forwardValue2401_16_0;
    java.lang.String forwardValue2401_18_0;
    net.minecraft.entity.Entity[] spill2401_0;
    net.minecraft.world.IWorldNameable spill2401_1;
    long life1_3;
    net.minecraft.world.IWorldNameable life4_7;
    net.minecraft.entity.Entity[] life3_8;
    forward_join_18: {
    forward_join_16: {
    forward_join_15: {
    life1_3 = (moom.Js.G ^ 114753776405643L);
    spill2401_0 = moom.JM.b__Arrayr3();
    life4_7 = moom.Js.a__Ep(((net.minecraft.client.gui.GuiScreen)(p0)));
    life3_8 = spill2401_0;
    spill2401_1 = life4_7;
    if (!((life3_8 != null))) {
        forwardValue2401_16_0 = spill2401_1;
        break forward_join_16;
    }
    if (!((spill2401_1 == null))) {
        break forward_join_15;
    }
    forwardValue2401_18_0 = null;
    break forward_join_18;
    }
    forwardValue2401_16_0 = life4_7;
    }
    forwardValue2401_18_0 = ((net.minecraft.util.IChatComponent)(((net.minecraft.world.IWorldNameable)(forwardValue2401_16_0)).a__C5())).b();
    }
    return forwardValue2401_18_0;
}


public boolean a(moom.bM p0, moom.DT p1, net.minecraft.world.IBlockAccess p2, net.minecraft.client.gui.GuiScreen p3) {
moom.Js forwardValue248_17_0;
    int forwardValue248_35_0;
    int forwardValue248_54_0;
    moom.Js spill248_0;
    boolean spill248_1;
    long life5_3;
    net.minecraft.entity.Entity[] life7_5;
    java.lang.String life8_26;
    forward_join_54: {
    forward_join_53: {
    forward_join_48: {
    forward_join_43: {
    forward_join_38: {
    forward_join_35: {
    forward_join_31: {
    forward_join_17: {
    forward_join_16: {
    life5_3 = (moom.Js.G ^ 99802679272089L);
    life7_5 = moom.JM.b__Arrayr3();
    spill248_0 = this;
    if (!((life7_5 != null))) {
        forwardValue248_17_0 = spill248_0;
        break forward_join_17;
    }
    if (!((!((moom.Js)(spill248_0)).a(((moom.bM)(p0)), ((moom.DT)(p1)), ((net.minecraft.world.IBlockAccess)(p2)))))) {
        break forward_join_16;
    }
    return ((0) != 0);
    }
    forwardValue248_17_0 = this;
    }
    if (!((((moom.Js)(forwardValue248_17_0)).e != null))) {
        break forward_join_31;
    }
    life8_26 = moom.Js.a(((net.minecraft.client.gui.GuiScreen)(p3)));
    spill248_1 = ((moom.Kb)(this.e)).a(((java.lang.String)(life8_26)));
    if (!((life7_5 != null))) {
        forwardValue248_35_0 = ((spill248_1) ? 1 : 0);
        break forward_join_35;
    }
    if (!((!spill248_1))) {
        break forward_join_31;
    }
    return ((0) != 0);
    }
    forwardValue248_35_0 = (moom.Jt.a)[((moom.bM)(p0)).ordinal()];
    }
    if (!((life7_5 != null))) {
        forwardValue248_54_0 = forwardValue248_35_0;
        break forward_join_54;
    }
    switch (forwardValue248_35_0) {
case 2:
{
        break forward_join_38;
    }
case 4:
{
        break forward_join_43;
    }
case 6:
{
        break forward_join_48;
    }
case 3:
case 5:
default:
{
        break forward_join_53;
    }
}
    }
    return ((moom.Js)(this)).a(((moom.DT)(p1)), ((net.minecraft.world.IBlockAccess)(p2)));
    }
    return ((moom.Js)(this)).b(((moom.DT)(p1)), ((net.minecraft.world.IBlockAccess)(p2)));
    }
    return ((moom.Js)(this)).c(((moom.DT)(p1)), ((net.minecraft.world.IBlockAccess)(p2)));
    }
    forwardValue248_54_0 = 1;
    }
    return ((forwardValue248_54_0) != 0);
}


private boolean a(moom.bM p0, moom.DT p1, net.minecraft.world.IBlockAccess p2) {
moom.Js forwardValue2398_15_0;
    int forwardValue2398_31_0;
    moom.Js forwardValue2398_33_0;
    moom.Ke forwardValue2398_39_0;
    int forwardValue2398_46_0;
    int forwardValue2398_48_0;
    moom.Js spill2398_0;
    boolean spill2398_1;
    moom.Ke spill2398_2;
    boolean spill2398_3;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    net.minecraft.world.biome.BiomeGenBase life7_30;
    forward_join_48: {
    forward_join_47: {
    forward_join_46: {
    forward_join_45: {
    forward_join_39: {
    forward_join_33: {
    forward_join_32: {
    forward_join_31: {
    forward_join_15: {
    forward_join_14: {
    life4_3 = (moom.Js.G ^ 612917297872L);
    life6_5 = moom.JM.b__Arrayr3();
    spill2398_0 = this;
    if (!((life6_5 != null))) {
        forwardValue2398_15_0 = spill2398_0;
        break forward_join_15;
    }
    if (!((((moom.Js)(spill2398_0)).c != p0))) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    forwardValue2398_15_0 = this;
    }
    if (!((life6_5 != null))) {
        forwardValue2398_33_0 = forwardValue2398_15_0;
        break forward_join_33;
    }
    if (!((((moom.Js)(forwardValue2398_15_0)).f != null))) {
        break forward_join_32;
    }
    life7_30 = ((net.minecraft.world.IBlockAccess)(p2)).a__ES(((moom.DT)(p1)));
    spill2398_1 = moom.Ka.a(((net.minecraft.world.biome.BiomeGenBase)(life7_30)), ((net.minecraft.world.biome.BiomeGenBase[])(this.f)));
    if (!((life6_5 != null))) {
        forwardValue2398_31_0 = ((spill2398_1) ? 1 : 0);
        break forward_join_31;
    }
    if (!((!spill2398_1))) {
        break forward_join_32;
    }
    forwardValue2398_31_0 = 0;
    }
    return ((forwardValue2398_31_0) != 0);
    }
    forwardValue2398_33_0 = this;
    }
    spill2398_2 = ((moom.Js)(forwardValue2398_33_0)).g;
    if (!((life6_5 != null))) {
        forwardValue2398_39_0 = spill2398_2;
        break forward_join_39;
    }
    if (!((spill2398_2 != null))) {
        break forward_join_45;
    }
    forwardValue2398_39_0 = this.g;
    }
    spill2398_3 = ((moom.Ke)(forwardValue2398_39_0)).a__Boolean(((int)(((moom.DT)(p1)).b())));
    if (!((life6_5 != null))) {
        forwardValue2398_46_0 = ((spill2398_3) ? 1 : 0);
        break forward_join_46;
    }
    if (!(spill2398_3)) {
        break forward_join_47;
    }
    }
    forwardValue2398_46_0 = 1;
    }
    forwardValue2398_48_0 = forwardValue2398_46_0;
    break forward_join_48;
    }
    forwardValue2398_48_0 = 0;
    }
    return ((forwardValue2398_48_0) != 0);
}


private boolean a(net.minecraft.entity.Entity p0, net.minecraft.world.IBlockAccess p1) {
int lexicalValue867_17_0;
    int lexicalValue867_35_0;
    int lexicalValue867_68_0;
    int spill867_0;
    int spill867_1;
    boolean spill867_2;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    net.minecraft.entity.passive.EntityVillager life6_16;
    int life7_29;
    int life8_33;
    int life9_46;
    moom.Kf[] life10_49;
    int life11_52;
    int life12_54;
    moom.Kf life13_61;
    lexical_join_69: {
    lexical_join_68: {
    lexical_join_67: {
    lexical_join_35: {
    lexical_join_34: {
    lexical_join_18: {
    lexical_join_17: {
    lexical_join_16: {
    life3_3 = (moom.Js.G ^ 77004483544357L);
    life5_5 = moom.JM.b__Arrayr3();
    spill867_0 = ((p0 instanceof net.minecraft.entity.passive.EntityVillager) ? 1 : 0);
    if (!((life5_5 != null))) {
        lexicalValue867_17_0 = spill867_0;
        break lexical_join_17;
    }
    if (!((spill867_0 != 0))) {
        break lexical_join_16;
    }
    life6_16 = ((net.minecraft.entity.passive.EntityVillager)(p0));
    if (!((life5_5 == null))) {
        break lexical_join_18;
    }
    }
    lexicalValue867_17_0 = 0;
    }
    return ((lexicalValue867_17_0) != 0);
    }
    if (!((this.m != null))) {
        break lexical_join_69;
    }
    life7_29 = ((net.minecraft.entity.passive.EntityVillager)(life6_16)).r__sourceReturn_8abf5c6871();
    life8_33 = ((net.minecraft.entity.passive.EntityVillager)(((net.minecraft.entity.passive.EntityVillager)(p0)))).ck;
    spill867_1 = life8_33;
    if (!((life5_5 != null))) {
        lexicalValue867_35_0 = spill867_1;
        break lexical_join_35;
    }
    if (!((spill867_1 < 0))) {
        break lexical_join_34;
    }
    return ((0) != 0);
    }
    lexicalValue867_35_0 = 0;
    }
    life9_46 = lexicalValue867_35_0;
    life10_49 = this.m;
    life11_52 = (life10_49).length;
    life12_54 = 0;
    lexical_cycle_44: while (true) {
    lexical_join_65: {
    lexical_join_64: {
    if (!((life12_54 < life11_52))) {
        break lexical_join_67;
    }
    life13_61 = (life10_49)[life12_54];
    if (!((life5_5 != null))) {
        break lexical_join_65;
    }
    spill867_2 = ((moom.Kf)(life13_61)).a(((int)(life7_29)), ((int)(life8_33)));
    if (!((life5_5 != null))) {
        lexicalValue867_68_0 = ((spill867_2) ? 1 : 0);
        break lexical_join_68;
    }
    if (!(spill867_2)) {
        break lexical_join_64;
    }
    life9_46 = 1;
    if (!((life5_5 == null))) {
        break lexical_join_67;
    }
    }
    life12_54 += 1;
    }
    if (!((life5_5 == null))) { continue lexical_cycle_44; }
    break lexical_cycle_44;
    }
    }
    lexicalValue867_68_0 = life9_46;
    }
    return ((lexicalValue867_68_0) != 0);
    }
    return ((1) != 0);
}


public boolean a(moom.bM p0, net.minecraft.entity.Entity p1, net.minecraft.world.IBlockAccess p2) {
moom.Js forwardValue249_18_0;
    int forwardValue249_36_0;
    int forwardValue249_50_0;
    moom.Js spill249_0;
    boolean spill249_1;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    java.lang.String life7_27;
    forward_join_50: {
    forward_join_49: {
    forward_join_44: {
    forward_join_39: {
    forward_join_36: {
    forward_join_32: {
    forward_join_18: {
    forward_join_17: {
    life4_3 = (moom.Js.G ^ 29678135717107L);
    life6_5 = moom.JM.b__Arrayr3();
    spill249_0 = this;
    if (!((life6_5 != null))) {
        forwardValue249_18_0 = spill249_0;
        break forward_join_18;
    }
    if (!((!((moom.Js)(spill249_0)).a(((moom.bM)(p0)), ((moom.DT)(((net.minecraft.entity.Entity)(p1)).a__DT())), ((net.minecraft.world.IBlockAccess)(p2)))))) {
        break forward_join_17;
    }
    return ((0) != 0);
    }
    forwardValue249_18_0 = this;
    }
    if (!((((moom.Js)(forwardValue249_18_0)).e != null))) {
        break forward_join_32;
    }
    life7_27 = ((net.minecraft.entity.Entity)(p1)).a__String();
    spill249_1 = ((moom.Kb)(this.e)).a(((java.lang.String)(life7_27)));
    if (!((life6_5 != null))) {
        forwardValue249_36_0 = ((spill249_1) ? 1 : 0);
        break forward_join_36;
    }
    if (!((!spill249_1))) {
        break forward_join_32;
    }
    return ((0) != 0);
    }
    forwardValue249_36_0 = (moom.Jt.a)[((moom.bM)(p0)).ordinal()];
    }
    if (!((life6_5 != null))) {
        forwardValue249_50_0 = forwardValue249_36_0;
        break forward_join_50;
    }
    switch (forwardValue249_36_0) {
case 10:
{
        break forward_join_39;
    }
case 13:
{
        break forward_join_44;
    }
default:
{
        break forward_join_49;
    }
}
    }
    return ((moom.Js)(this)).b(((net.minecraft.entity.Entity)(p1)), ((net.minecraft.world.IBlockAccess)(p2)));
    }
    return ((moom.Js)(this)).a(((net.minecraft.entity.Entity)(p1)), ((net.minecraft.world.IBlockAccess)(p2)));
    }
    forwardValue249_50_0 = 1;
    }
    return ((forwardValue249_50_0) != 0);
}


private moom.bN a(moom.Cm p0) {
long local2 = (moom.Js.G ^ 21086629992914L);
    return ((((p0 instanceof moom.Cn) ? 1 : 0) != 0) ? moom.bN.DROPPER : moom.bN.DISPENSER);
}


private static moom.DD a(moom.bM p0) {
long local1 = (moom.Js.G ^ 49635262847271L);
    if ((p0 == null)) {
        return null;
    }
    switch ((moom.Jt.a)[((moom.bM)(p0)).ordinal()]) {
case 1:
{
        return moom.Js.t;
    }
case 2:
{
        return moom.Js.u;
    }
case 3:
{
        return moom.Js.v;
    }
case 4:
{
        return moom.Js.w;
    }
case 5:
{
        return moom.Js.x;
    }
case 6:
{
        return moom.Js.z;
    }
case 7:
{
        return moom.Js.A;
    }
case 8:
{
        return moom.Js.B;
    }
case 9:
{
        return moom.Js.C;
    }
case 10:
{
        return moom.Js.y;
    }
case 11:
{
        return moom.Js.D;
    }
case 12:
{
        return moom.Js.E;
    }
case 13:
{
        return moom.Js.F;
    }
default:
{
        return null;
    }
}
}


private boolean a(boolean p0, boolean p1, boolean p2, boolean p3) {
java.lang.Boolean forwardValue2404_20_0;
    java.lang.Boolean forwardValue2404_32_0;
    java.lang.Boolean forwardValue2404_44_0;
    java.lang.Boolean forwardValue2404_49_0;
    int forwardValue2404_55_0;
    int forwardValue2404_57_0;
    java.lang.Boolean spill2404_0;
    java.lang.Boolean spill2404_1;
    java.lang.Boolean spill2404_2;
    java.lang.Boolean spill2404_3;
    boolean spill2404_4;
    long life5_3;
    net.minecraft.entity.Entity[] life7_5;
    forward_join_57: {
    forward_join_56: {
    forward_join_55: {
    forward_join_54: {
    forward_join_49: {
    forward_join_44: {
    forward_join_42: {
    forward_join_32: {
    forward_join_30: {
    forward_join_20: {
    forward_join_18: {
    life5_3 = (moom.Js.G ^ 77102361940724L);
    life7_5 = moom.JM.b__Arrayr3();
    spill2404_0 = this.h;
    if (!((life7_5 != null))) {
        forwardValue2404_20_0 = spill2404_0;
        break forward_join_20;
    }
    if (!((spill2404_0 != null))) {
        break forward_join_18;
    }
    spill2404_1 = this.h;
    if (!((life7_5 != null))) {
        forwardValue2404_20_0 = spill2404_1;
        break forward_join_20;
    }
    if (!((((java.lang.Boolean)(spill2404_1)).booleanValue() == p0))) {
        break forward_join_56;
    }
    }
    forwardValue2404_20_0 = this.i;
    }
    if (!((life7_5 != null))) {
        forwardValue2404_32_0 = forwardValue2404_20_0;
        break forward_join_32;
    }
    if (!((forwardValue2404_20_0 != null))) {
        break forward_join_30;
    }
    spill2404_2 = this.i;
    if (!((life7_5 != null))) {
        forwardValue2404_32_0 = spill2404_2;
        break forward_join_32;
    }
    if (!((((java.lang.Boolean)(spill2404_2)).booleanValue() == p1))) {
        break forward_join_56;
    }
    }
    forwardValue2404_32_0 = this.j;
    }
    if (!((life7_5 != null))) {
        forwardValue2404_44_0 = forwardValue2404_32_0;
        break forward_join_44;
    }
    if (!((forwardValue2404_32_0 != null))) {
        break forward_join_42;
    }
    spill2404_3 = this.j;
    if (!((life7_5 != null))) {
        forwardValue2404_44_0 = spill2404_3;
        break forward_join_44;
    }
    if (!((((java.lang.Boolean)(spill2404_3)).booleanValue() == p2))) {
        break forward_join_56;
    }
    }
    forwardValue2404_44_0 = this.k;
    }
    if (!((life7_5 != null))) {
        forwardValue2404_49_0 = forwardValue2404_44_0;
        break forward_join_49;
    }
    if (!((forwardValue2404_44_0 != null))) {
        break forward_join_54;
    }
    forwardValue2404_49_0 = this.k;
    }
    spill2404_4 = ((java.lang.Boolean)(forwardValue2404_49_0)).booleanValue();
    if (!((life7_5 != null))) {
        forwardValue2404_55_0 = ((spill2404_4) ? 1 : 0);
        break forward_join_55;
    }
    if (!((spill2404_4 == p3))) {
        break forward_join_56;
    }
    }
    forwardValue2404_55_0 = 1;
    }
    forwardValue2404_57_0 = forwardValue2404_55_0;
    break forward_join_57;
    }
    forwardValue2404_57_0 = 0;
    }
    return ((forwardValue2404_57_0) != 0);
}


private boolean a(moom.Cg p0, moom.DT p1, net.minecraft.world.IBlockAccess p2) {
return (__sourceIntrinsic_booleanComparison((((moom.Js)(this)).a(((boolean)(false)), ((boolean)(false)), ((boolean)(false)), ((boolean)(true))))) != 0);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite613_97(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite613_99(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite613_101(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite613_103(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite613_105(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite613_107(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite613_109(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite613_111(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite613_113(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite613_115(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite613_117(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite613_119(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite613_121(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_25(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_29(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_31(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_35(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_36(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_40(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_44(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_48(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_52(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_56(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_60(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_64(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_68(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_74(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_76(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_82bd185427a29917_originalDynamicSite2242_81(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ab822d989da3_invokedynamic2394_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ab822d989da3_invokedynamic2394_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ab822d989da3_invokedynamic2394_7(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ab822d989da3_invokedynamic2394_8(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5449_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6174378250d0_invokedynamic866_7(java.lang.String a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6174378250d0_invokedynamic866_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6174378250d0_invokedynamic866_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6174378250d0_invokedynamic866_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6174378250d0_invokedynamic866_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6174378250d0_invokedynamic866_22(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_959eb7fbd3c0_invokedynamic2397_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2c48b014dab3_invokedynamic868_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2c48b014dab3_invokedynamic868_7(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic2407_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic2407_8(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic2407_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic2407_14(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic2407_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic2407_21(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic2407_26(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic2407_28(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic2407_33(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic2407_35(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic2407_40(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic2407_42(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic2407_46(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_051b43f8cbc1_invokedynamic2407_48(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e2d81269afae_originalDynamicSite545_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e2d81269afae_originalDynamicSite545_6(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5441_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1748_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1748_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1748_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1748_9(java.lang.String a0, java.lang.String a1, java.lang.String a2, moom.bM a3, java.lang.String a4, java.util.Map a5) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
