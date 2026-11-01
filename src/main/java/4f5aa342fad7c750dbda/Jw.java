package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Jw {

private static moom.Jv[][] a;

private static moom.Jv[][] b;

private static java.util.Map c;

private static net.minecraft.client.renderer.block.model.ItemModelGenerator d;

private static boolean e;

private static int[][] f;

private static long g;

private static java.lang.String[] h;

private static java.lang.String[] i;

private static java.util.Map j;

private static long[] k;

private static java.lang.Integer[] l;

private static java.util.Map m;

private static long[] n;

private static java.lang.Long[] o;

private static java.util.Map p;

public Jw() {
super();
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(5307208904320646717L)), ((long)(-7761706932325058699L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(221364775644296L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local22_life7 = (moom.Jw.g ^ 55465008119006L);
    javax.crypto.Cipher local24_life9;
    javax.crypto.Cipher __sourceSpill616_11 = (local24_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill616_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill616_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill616_14 = new byte[8];
    (__sourceSpill616_14)[0] = ((byte) ((int) (local22_life7 >>> 56)));
    int local25_life15 = 1;
    while ((local25_life15 < 8)) {
        (__sourceSpill616_14)[local25_life15] = ((byte) ((int) ((local22_life7 << (local25_life15 * 8)) >>> 56)));
        local25_life15 += 1;
    }
    byte[] __sourcePreallocation616_16 = __sourceSpill616_14;
    ((javax.crypto.Cipher)(__sourceSpill616_11)).init(((int)(__sourceSpill616_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill616_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation616_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local31_life19 = new java.lang.String[81];
    int local29_life20 = 0;
    java.lang.String local28_life21;
    int local30_life23 = ((java.lang.String)((local28_life21 = "umkõe+'Âk*áþOlç\020&-\bØ¥n\031ÄJå\021hûÍ(gcn_!ºì\tåÿp·íq\004¹o&ÌH\016P\013ïþï¦+\f½Jbèz¬yÉ1D\020OõD´­F`Jí\002&ÄÁ(õ\017¶Ç\n¦D\035g#´oýÕ5\036ï¦1ý\013\034º\007Ó\024#$\036¯M\020da u¡[<)ÈýÍRí7\030.¾¿/õÂ%pËýÔì\0372$»²;\006\020Vc\037SÑ.¨¼U`¨S\021\0075¡(ËS\003á©°Ï¤j¸¶u­ò\013\t^\032r3Ka,\006\021âÍGà«R\022§¥\020ë°\"9âÊêæ@/¡al0àö'\022¿\017¤ûëSGÔgQîá2:p¾Ú\003\000ýÜ¡\005t7r\030ÏÖM?¡WNè\020lÊNíÌË\025þDðjgö}Â­\020H8\030\004ìÚ\033ð¹hý\034ö$£\020\rxÎâ\026»÷òopm8£ â@Ú\027G\033ìn&\020\003é¯Õ¤Bî°4\037\0211J\b@É%\017\r§\020\001Æ@û\031éy­k}õvep\030jÊè\030ô)\016ºÜh\034ÁØuøJ\"_<\033QÆ\020\001ZJJ6µ¤øJªÀ¡oÿ\020\022\037?»PJ$½çõÅêlá\030F¨*ÉwRvÒÃèÅ0\\¼KÆ\026¹ Âá©Û\004ÎSN|1`Ç\000\r)W\004ö\020ìúªþæ\032ZX\020¤$âñgQIx÷+Å\027\026à0\020<\013Ûhc×½ìÓNXª3n¦C\0206øãç\006[pËóÑ§Råh¾\034\030\037+¹öÚjózð~KåWC\022>Ùª~\001ï dûÁ¤%©,\035\006ö\fO\r~qÙ8 _Ï\004iBPyRrn©\020YZ\\\031H,pC5h%°\007\030ý\fÇWl®èõ¸\033ù» c\0009N^\020@èþÍô!ë\031È+0O¦;\020æNBjr\037vÔ`3íåvsÄû\030,L\rÛq\r\024À0!ç %@¹N\027ÕñK?>\020Ð%ÕQM´7±~Éo\035\030×Ur)¢Á¹ÃAW¬¯t¨<-Ux\177N<\034\013\020ÂªÓàn\004tfw£Ææ m+*ßüÛÍ\\\005\021ÜËöêïû~\001«ÔR´ñªa$Ó+mÔ ¨\016Í \037Ø_\017ý\004üUC°E¦á\b\006\"pØû\004xp}%Ç\020}P\034Ùûá\t$»W­a\021ý #Ì8Ä\177¿\tªù\034Þ¬ÊÈ\nôòþ&øaÖW\004×iÓ§ ÔS\001+ÍÐH£á\"À¹Eý\b\027òÜeln÷´Xnµ/\030¶cX1VÍ¿P\001Ñ1l\033Ò\034äÖþ\007\020}kDë£ü\034ïG\003Ñ,\020Ç¸\021ØTÀõ!&¢òÔ\013 Èÿñò{êô:]3ó«»!Ð/T\bû\035\0300:v\006ò>Îçaá\020wýi\020!4jQFc\0375¼\0318LsaY\\Q\001ù-»[ä§·'\bÏ©v\177\023·¨±ô®u\030´_¡±WB=à ·H_rt+}?¶Û\020ÐíK»ðv5y\0164ÚPÅWÿÃ\030\035uÜê#\034°æïÁDîBX}lñ\034?0z6Ô§ONèE¿iëÑ 'ònÁr¾¡TX¿§ßÕ­'\022I.(ì\000\036qêwV´Ûñà â½ü1Z¨ÔÛ1nÅü>á_»\021BIÅ£ØeB-6\177\003\030Ò8]Dì4hNØZñ\037¶rHÃÝa\036ìÅãÆµ®Ä½ÇE\020WÃ5éÕ5\\7D¬,Ó®F.àÑtïÒ\020üúº\033ÐaðöLØ÷Q\020Y\rª?Õ)ø¯\024b\030\001dª'\030=SOs_º[DU×ì!\037¯M0Ò3¤ b#ùË³G÷øî]â¢ÜôàÛl\003åà»VöüòR~\034¡\rµ UA| ¡ówéCÚÕ\007Òu\f\024Oprºt\034ÎµDÄy\016$Ì\020\022`®o«P`Ä¥Ö\032k\177 ¥U\017Ü¨I\024sça\002\020\017vËÐÐP\006r¢´§°\bh1\020\026´|jk-IôWÙ(mmKõÖ\020Jª\021âÏAqê\021\004SîÕ\013 \017Ó¬/U:\020}`r\022ÿ\025«4\026¸Ôá\022ðÞj©,l¤1BÏ I}¶åà1Ýãx¡4]yÂt[Ç·\\U\030è¸_NL`YÑ\0300ýéÝ´rý\0014¥\033Ó¤4ï>À4:Ñ8©&\033?\007\"éED®ªcE\nöÃß@\"\027 ­'ãýN½rqþ'ñ'(\f\001?AQOÀ½e¦Ñ¤d£fã6\020\026Û(¢{\001O\005þ§g\034à\005D¡\020Û·Åc\037]4\000©*âÝfr \001Æ\034j.Fz@ÿ:Îá¥ Âm{\035vö}@Xnñ\004Èr\020ßÔ}PÈ\004}±\001´DNCRM zù\002Ag@xôEOÊé\0320aº«2æ:c^òÔ+#Æ©\030'Ê\007\021H°q\fÔ\0255Ý21%ÅãÛÚ \013{\fûè\003\t%33ÂµR7\031üsäöÂÀß§\035Y.0Ð\020+0G¹¸Òáô¤JNeÄ\030Ä\033¿±\021É£ø\"#h<\027+Hß¾©è\020\025ÀSÆÊ{Ï\023\177+¹(\026øÍû\177Þ:.\\\025kÇ\t5°l\035ó¡Vö³þçjüêrn±ÔC\030rÇT\0210#\tÞØ>\016\177º6èí¤¢Õ60E;,\001rJ¢7\001õ)ì3¢ìî\016Ojâ\021\bà,Âæ ¯¶9ÙÓ¿Ñ5¨uìl\bt´%\020Bê\021&wÄD´Ct\026ÜeÇþ\020àÞ¨\023ë\017qëØÏ ¡æ \tê§ T¯ÏúÂ¬\034ú3®\000-2¨%Û7n&#üà»\177ë£"))).length();
    int local27_life24 = 16;
    int local26_life25 = -1;
    while (true) {
        local26_life25 += 1;
        byte[] __sourceSpill616_28 = ((java.lang.String)(((java.lang.String)(local28_life21)).substring(((int)(local26_life25)), ((int)((local26_life25 + local27_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill616_29 = local24_life9;
        byte[] local32_life31 = ((javax.crypto.Cipher)(__sourceSpill616_29)).doFinal(((byte[])(__sourceSpill616_28)));
        java.lang.String __sourceSpill616_34 = ((java.lang.String)(moom.Jw.a(((byte[])(local32_life31))))).intern();
        java.lang.String[] __sourceSpill616_35 = local31_life19;
        int __sourceSpill616_36 = local29_life20;
        local29_life20 += 1;
        (__sourceSpill616_35)[__sourceSpill616_36] = __sourceSpill616_34;
        if (!(((local26_life25 = (local26_life25 + local27_life24)) < local30_life23))) { break; }
        local27_life24 = ((java.lang.String)(local28_life21)).charAt(((int)(local26_life25)));
    }
    local30_life23 = ((java.lang.String)((local28_life21 = "øvNdÃ%ºò8Å£4ÊÒ\030¤W1¾¤NXx3úý;\036Y\027þ^\003ÚÓ"))).length();
    local27_life24 = 16;
    local26_life25 = -1;
    while (true) {
        local26_life25 += 1;
        byte[] __sourceSpill616_41 = ((java.lang.String)(((java.lang.String)(local28_life21)).substring(((int)(local26_life25)), ((int)((local26_life25 + local27_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill616_42 = local24_life9;
        byte[] local32_life44 = ((javax.crypto.Cipher)(__sourceSpill616_42)).doFinal(((byte[])(__sourceSpill616_41)));
        java.lang.String __sourceSpill616_47 = ((java.lang.String)(moom.Jw.a(((byte[])(local32_life44))))).intern();
        java.lang.String[] __sourceSpill616_48 = local31_life19;
        int __sourceSpill616_49 = local29_life20;
        local29_life20 += 1;
        (__sourceSpill616_48)[__sourceSpill616_49] = __sourceSpill616_47;
        if (!(((local26_life25 = (local26_life25 + local27_life24)) < local30_life23))) { break; }
        local27_life24 = ((java.lang.String)(local28_life21)).charAt(((int)(local26_life25)));
    }
    h = ((java.lang.String[])(local31_life19));
    i = ((java.lang.String[])(new java.lang.String[81]));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life55;
    javax.crypto.Cipher __sourceSpill616_57 = (local11_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill616_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill616_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill616_60 = new byte[8];
    (__sourceSpill616_60)[0] = ((byte) ((int) (local22_life7 >>> 56)));
    int local12_life61 = 1;
    while ((local12_life61 < 8)) {
        (__sourceSpill616_60)[local12_life61] = ((byte) ((int) ((local22_life7 << (local12_life61 * 8)) >>> 56)));
        local12_life61 += 1;
    }
    byte[] __sourcePreallocation616_62 = __sourceSpill616_60;
    ((javax.crypto.Cipher)(__sourceSpill616_57)).init(((int)(__sourceSpill616_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill616_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation616_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local17_life65 = new long[33];
    int local14_life66 = 0;
    java.lang.String local15_life67;
    int local16_life69 = ((java.lang.String)((local15_life67 = "µ0³Wsô'uÉ\tÝE\001\000µw\030h¶=¨ÍÜ\tïPø\020Ï\bC½Ã<yû5Í<ßþ#o¶\tEÅ\006e±lÿ!¸½\003ÍÆ½«\"ÄùiÆò£©îVÈ 1ö -NÌÒW¯³(çHr\fé¤\n~¹\nOZcL\036\031ñ$Í5-W<µ\007Têõ°îS\030\000Î\b&d¥\013[\"ú÷Ë\t>¯µpê]0:·H¯Á/óð\023ûÙ\tà16^ôt\\\\rÜáÙÒeÙr¡Õ½>õñæ9ÎÕR­\006\024qyË9mK­_7\022\003Õ/Vþ²¸\t\017x\005Õ+Ï_¤\fQP0·×+Ëqª×Y?ª\\"))).length();
    int local13_life70 = 0;
    do {
        java.lang.String __sourceSpill616_71 = local15_life67;
        int __sourceSpill616_72 = local13_life70;
        local13_life70 += 8;
        byte[] local18_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill616_71)).substring(((int)(__sourceSpill616_72)), ((int)(local13_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill616_76 = local17_life65;
        int __sourceSpill616_77 = local14_life66;
        local14_life66 += 1;
        long local19_life78 = (((((((((((long) (local18_life75)[0]) & 255L) << 56) | ((((long) (local18_life75)[1]) & 255L) << 48)) | ((((long) (local18_life75)[2]) & 255L) << 40)) | ((((long) (local18_life75)[3]) & 255L) << 32)) | ((((long) (local18_life75)[4]) & 255L) << 24)) | ((((long) (local18_life75)[5]) & 255L) << 16)) | ((((long) (local18_life75)[6]) & 255L) << 8)) | (((long) (local18_life75)[7]) & 255L));
        byte[] __sourceSpill616_79 = new byte[8];
        (__sourceSpill616_79)[0] = ((byte) ((int) (local19_life78 >>> 56)));
        (__sourceSpill616_79)[1] = ((byte) ((int) (local19_life78 >>> 48)));
        (__sourceSpill616_79)[2] = ((byte) ((int) (local19_life78 >>> 40)));
        (__sourceSpill616_79)[3] = ((byte) ((int) (local19_life78 >>> 32)));
        (__sourceSpill616_79)[4] = ((byte) ((int) (local19_life78 >>> 24)));
        (__sourceSpill616_79)[5] = ((byte) ((int) (local19_life78 >>> 16)));
        (__sourceSpill616_79)[6] = ((byte) ((int) (local19_life78 >>> 8)));
        (__sourceSpill616_79)[7] = ((byte) ((int) local19_life78));
        javax.crypto.Cipher __sourceSpill616_80 = local11_life55;
        byte[] local21_life82 = ((javax.crypto.Cipher)(__sourceSpill616_80)).doFinal(((byte[])(__sourceSpill616_79)));
        (__sourceSpill616_76)[__sourceSpill616_77] = (((((((((((long) (local21_life82)[0]) & 255L) << 56) | ((((long) (local21_life82)[1]) & 255L) << 48)) | ((((long) (local21_life82)[2]) & 255L) << 40)) | ((((long) (local21_life82)[3]) & 255L) << 32)) | ((((long) (local21_life82)[4]) & 255L) << 24)) | ((((long) (local21_life82)[5]) & 255L) << 16)) | ((((long) (local21_life82)[6]) & 255L) << 8)) | (((long) (local21_life82)[7]) & 255L));
    } while ((!(local13_life70 >= local16_life69)));
    local16_life69 = ((java.lang.String)((local15_life67 = "Ã\tÒ]­ßV|\022ýAI\bäl"))).length();
    local13_life70 = 0;
    do {
        java.lang.String __sourceSpill616_84 = local15_life67;
        int __sourceSpill616_85 = local13_life70;
        local13_life70 += 8;
        byte[] local18_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill616_84)).substring(((int)(__sourceSpill616_85)), ((int)(local13_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill616_89 = local17_life65;
        int __sourceSpill616_90 = local14_life66;
        local14_life66 += 1;
        long local19_life91 = (((((((((((long) (local18_life88)[0]) & 255L) << 56) | ((((long) (local18_life88)[1]) & 255L) << 48)) | ((((long) (local18_life88)[2]) & 255L) << 40)) | ((((long) (local18_life88)[3]) & 255L) << 32)) | ((((long) (local18_life88)[4]) & 255L) << 24)) | ((((long) (local18_life88)[5]) & 255L) << 16)) | ((((long) (local18_life88)[6]) & 255L) << 8)) | (((long) (local18_life88)[7]) & 255L));
        byte[] __sourceSpill616_92 = new byte[8];
        (__sourceSpill616_92)[0] = ((byte) ((int) (local19_life91 >>> 56)));
        (__sourceSpill616_92)[1] = ((byte) ((int) (local19_life91 >>> 48)));
        (__sourceSpill616_92)[2] = ((byte) ((int) (local19_life91 >>> 40)));
        (__sourceSpill616_92)[3] = ((byte) ((int) (local19_life91 >>> 32)));
        (__sourceSpill616_92)[4] = ((byte) ((int) (local19_life91 >>> 24)));
        (__sourceSpill616_92)[5] = ((byte) ((int) (local19_life91 >>> 16)));
        (__sourceSpill616_92)[6] = ((byte) ((int) (local19_life91 >>> 8)));
        (__sourceSpill616_92)[7] = ((byte) ((int) local19_life91));
        javax.crypto.Cipher __sourceSpill616_93 = local11_life55;
        byte[] local21_life95 = ((javax.crypto.Cipher)(__sourceSpill616_93)).doFinal(((byte[])(__sourceSpill616_92)));
        (__sourceSpill616_89)[__sourceSpill616_90] = (((((((((((long) (local21_life95)[0]) & 255L) << 56) | ((((long) (local21_life95)[1]) & 255L) << 48)) | ((((long) (local21_life95)[2]) & 255L) << 40)) | ((((long) (local21_life95)[3]) & 255L) << 32)) | ((((long) (local21_life95)[4]) & 255L) << 24)) | ((((long) (local21_life95)[5]) & 255L) << 16)) | ((((long) (local21_life95)[6]) & 255L) << 8)) | (((long) (local21_life95)[7]) & 255L));
    } while ((!(local13_life70 >= local16_life69)));
    k = ((long[])(local17_life65));
    l = ((java.lang.Integer[])(new java.lang.Integer[33]));
    p = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life100;
    javax.crypto.Cipher __sourceSpill616_102 = (local0_life100 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill616_103 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill616_104 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill616_105 = new byte[8];
    (__sourceSpill616_105)[0] = ((byte) ((int) (local22_life7 >>> 56)));
    int local1_life106 = 1;
    while ((local1_life106 < 8)) {
        (__sourceSpill616_105)[local1_life106] = ((byte) ((int) ((local22_life7 << (local1_life106 * 8)) >>> 56)));
        local1_life106 += 1;
    }
    byte[] __sourcePreallocation616_107 = __sourceSpill616_105;
    ((javax.crypto.Cipher)(__sourceSpill616_102)).init(((int)(__sourceSpill616_103)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill616_104)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation616_107)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life110 = new long[2];
    int local3_life111 = 0;
    java.lang.String local4_life112;
    int local5_life114 = ((java.lang.String)((local4_life112 = "àÔ§×~k\"*nê¨=ë~"))).length();
    int local2_life115 = 0;
    do {
        java.lang.String __sourceSpill616_116 = local4_life112;
        int __sourceSpill616_117 = local2_life115;
        local2_life115 += 8;
        byte[] local7_life120 = ((java.lang.String)(((java.lang.String)(__sourceSpill616_116)).substring(((int)(__sourceSpill616_117)), ((int)(local2_life115))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill616_121 = local6_life110;
        int __sourceSpill616_122 = local3_life111;
        local3_life111 += 1;
        long local8_life123 = (((((((((((long) (local7_life120)[0]) & 255L) << 56) | ((((long) (local7_life120)[1]) & 255L) << 48)) | ((((long) (local7_life120)[2]) & 255L) << 40)) | ((((long) (local7_life120)[3]) & 255L) << 32)) | ((((long) (local7_life120)[4]) & 255L) << 24)) | ((((long) (local7_life120)[5]) & 255L) << 16)) | ((((long) (local7_life120)[6]) & 255L) << 8)) | (((long) (local7_life120)[7]) & 255L));
        byte[] __sourceSpill616_124 = new byte[8];
        (__sourceSpill616_124)[0] = ((byte) ((int) (local8_life123 >>> 56)));
        (__sourceSpill616_124)[1] = ((byte) ((int) (local8_life123 >>> 48)));
        (__sourceSpill616_124)[2] = ((byte) ((int) (local8_life123 >>> 40)));
        (__sourceSpill616_124)[3] = ((byte) ((int) (local8_life123 >>> 32)));
        (__sourceSpill616_124)[4] = ((byte) ((int) (local8_life123 >>> 24)));
        (__sourceSpill616_124)[5] = ((byte) ((int) (local8_life123 >>> 16)));
        (__sourceSpill616_124)[6] = ((byte) ((int) (local8_life123 >>> 8)));
        (__sourceSpill616_124)[7] = ((byte) ((int) local8_life123));
        javax.crypto.Cipher __sourceSpill616_125 = local0_life100;
        byte[] local10_life127 = ((javax.crypto.Cipher)(__sourceSpill616_125)).doFinal(((byte[])(__sourceSpill616_124)));
        (__sourceSpill616_121)[__sourceSpill616_122] = (((((((((((long) (local10_life127)[0]) & 255L) << 56) | ((((long) (local10_life127)[1]) & 255L) << 48)) | ((((long) (local10_life127)[2]) & 255L) << 40)) | ((((long) (local10_life127)[3]) & 255L) << 32)) | ((((long) (local10_life127)[4]) & 255L) << 24)) | ((((long) (local10_life127)[5]) & 255L) << 16)) | ((((long) (local10_life127)[6]) & 255L) << 8)) | (((long) (local10_life127)[7]) & 255L));
    } while ((!(local2_life115 >= local5_life114)));
    n = ((long[])(local6_life110));
    o = ((java.lang.Long[])(new java.lang.Long[2]));
    a = ((moom.Jv[][])(null));
    b = ((moom.Jv[][])(null));
    c = ((java.util.Map)(null));
    d = ((net.minecraft.client.renderer.block.model.ItemModelGenerator)(new net.minecraft.client.renderer.block.model.ItemModelGenerator()));
    e = ((boolean)(true));
    f = ((int[][])(new int[0][]));
}

private static native <E extends Throwable> int __sourceHandlerCall_4be891ef043b9f2aaffa(java.lang.String a0) throws E;
private static final class __SourceHandler_4be891ef043b9f2aaffa {

public static int f91(java.lang.String p0) throws Throwable {
    net.minecraft.entity.Entity[] spill91_0;
    long life1_3;
    java.lang.String life4_12;
    net.minecraft.potion.Potion[] life5_14;
    net.minecraft.potion.Potion[] life6_16;
    int life7_20;
    int life8_22;
    net.minecraft.entity.Entity[] life3_23;
    net.minecraft.potion.Potion life9_30;
    java.lang.String life10_40;
    lexical_join_50: {
    life1_3 = (__fieldRead91_0() ^ 112029449054864L);
    java.lang.String __stackOp91_2_0 = p0;
    java.lang.String __stackOp91_2_1 = __invokedynamic91_1(10129, (8492345392262574408L ^ life1_3));
    life4_12 = __invokedynamic91_3(__stackOp91_2_1, __stackOp91_2_0);
    life5_14 = __fieldRead91_4();
    life6_16 = life5_14;
    spill91_0 = __call91_5();
    life7_20 = (life6_16).length;
    life8_22 = 0;
    life3_23 = spill91_0;
    lexical_cycle_24: while (true) {
    lexical_join_48: {
    lexical_join_47: {
    if (!((life8_22 < life7_20))) {
        break lexical_join_50;
    }
    life9_30 = (life6_16)[life8_22];
    if (!((life3_23 != null))) {
        break lexical_join_48;
    }
    if (!((life9_30 != null))) {
        break lexical_join_47;
    }
    life10_40 = __call91_6(life9_30);
    if (!((life3_23 != null))) {
        break lexical_join_48;
    }
    if (!(__call91_7(life4_12, life10_40))) {
        break lexical_join_47;
    }
    return __call91_8(life9_30);
    }
    life8_22 += 1;
    }
    if (!((life3_23 == null))) { continue lexical_cycle_24; }
    break lexical_cycle_24;
    }
    }
    return -1;
}
public static void h91_0(moom.Oo p0) throws Throwable {
    throw __call1009100_0(p0);
}
public static void h91_1(moom.Oo p0) throws Throwable {
    throw __call1009101_0(p0);
}
public static void h91_2(moom.Oo p0) throws Throwable {
    throw __call1009102_0(p0);
}
private static native long __fieldRead91_0() throws Throwable;
private static native java.lang.String __invokedynamic91_1(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic91_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.potion.Potion[] __fieldRead91_4() throws Throwable;
private static native net.minecraft.entity.Entity[] __call91_5() throws Throwable;
private static native java.lang.String __call91_6(net.minecraft.potion.Potion a0) throws Throwable;
private static native boolean __call91_7(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __call91_8(net.minecraft.potion.Potion a0) throws Throwable;
private static native java.lang.Exception __call1009100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1009101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1009102_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.util.Properties __sourceHandlerCall_6a5dbee4fd8dfd8b368d(java.lang.String a0, java.lang.String a1, int a2, java.lang.String a3) throws E;
private static final class __SourceHandler_6a5dbee4fd8dfd8b368d {

public static java.util.Properties f92(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3) throws Throwable {
    int lexicalValue92_40_0;
    java.lang.Object lexicalValue92_86_0;
    int lexicalValue92_138_0;
    int lexicalValue92_163_0;
    int lexicalValue92_183_0;
    java.lang.Object lexicalValue92_260_0;
    java.lang.String spill92_0;
    java.lang.String[] spill92_1;
    java.lang.String[] spill92_2;
    boolean spill92_3;
    java.lang.String spill92_4;
    java.lang.String spill92_5;
    boolean spill92_6;
    boolean spill92_7;
    java.lang.String spill92_8;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    int life2_67;
    moom.OH life7_71;
    int[] life7_101;
    java.lang.StringBuilder life8_126;
    int life9_128;
    int life10_136;
    moom.OH life10_228;
    lexical_join_261: {
    lexical_join_260: {
    lexical_join_252: {
    lexical_join_184: {
    lexical_join_183: {
    lexical_join_176: {
    lexical_join_163: {
    lexical_join_150: {
    lexical_join_103: {
    lexical_join_101: {
    lexical_join_86: {
    lexical_join_83: {
    lexical_join_40: {
    lexical_join_31: {
    life4_3 = (__fieldRead92_0() ^ 89672842879638L);
    life6_5 = __call92_1();
    spill92_0 = p0;
    java.lang.String[] __stackOp92_2_0 = new java.lang.String[2];
    spill92_1 = __stackOp92_2_0;
    (__stackOp92_2_0)[0] = __invokedynamic92_3(17580, (1430528587115190819L ^ life4_3));
    java.lang.String[] __stackOp92_4_0 = spill92_1;
    spill92_2 = __stackOp92_4_0;
    (__stackOp92_4_0)[1] = __invokedynamic92_5(27654, (9069370328494928518L ^ life4_3));
    spill92_3 = __call92_6(spill92_0, spill92_2);
    if (!((life6_5 != null))) {
        lexicalValue92_40_0 = __integerCategory92_7(spill92_3);
        break lexical_join_40;
    }
    if (!(spill92_3)) {
        break lexical_join_31;
    }
    return null;
    }
    spill92_4 = p0;
    if (!((life6_5 != null))) {
        lexicalValue92_86_0 = spill92_4;
        break lexical_join_86;
    }
    lexicalValue92_40_0 = __integerCategory92_10(__call92_9(spill92_4, __invokedynamic92_8(12596, (8968326203752624098L ^ life4_3))));
    }
    if (!((lexicalValue92_40_0 != 0))) {
        break lexical_join_83;
    }
    spill92_5 = p1;
    if (!((life6_5 != null))) {
        lexicalValue92_86_0 = spill92_5;
        break lexical_join_86;
    }
    if (!(__call92_12(spill92_5, __invokedynamic92_11(31244, (4775973541886584027L ^ life4_3))))) {
        break lexical_join_83;
    }
    life2_67 = __call92_14(__fieldRead92_13());
    life7_71 = new moom.OH();
    __call92_17(life7_71, __invokedynamic92_15(9989, (312410891273091463L ^ life4_3)), __invokedynamic92_16(24893, (3239980754736316380L ^ life4_3)));
    __call92_20(life7_71, __invokedynamic92_18(24424, (4391038450649547163L ^ life4_3)), __invokedynamic92_19(life2_67));
    return life7_71;
    }
    lexicalValue92_86_0 = __call92_22(__call92_21(), p0);
    }
    life7_101 = __cast92_23(lexicalValue92_86_0);
    if (!((life6_5 != null))) {
        break lexical_join_101;
    }
    if (!((life7_101 == null))) {
        break lexical_join_103;
    }
    java.lang.String __stackOp92_25_0 = p3;
    java.lang.String __stackOp92_25_1 = __invokedynamic92_24(1881, (9016517873900034472L ^ life4_3));
    __call92_27(__invokedynamic92_26(__stackOp92_25_1, __stackOp92_25_0));
    }
    return null;
    }
    life8_126 = new java.lang.StringBuilder();
    life9_128 = 0;
    lexical_cycle_109: while (true) {
    lexical_join_143: {
    lexical_join_138: {
    lexical_join_137: {
    if (!((life9_128 < (life7_101).length))) {
        break lexical_join_150;
    }
    life10_136 = (life7_101)[life9_128];
    spill92_6 = __call92_29(p1, __invokedynamic92_28(27371, (4981470977020032040L ^ life4_3)));
    if (!((life6_5 != null))) {
        lexicalValue92_163_0 = __integerCategory92_30(spill92_6);
        break lexical_join_163;
    }
    if (!((life6_5 != null))) {
        lexicalValue92_138_0 = __integerCategory92_31(spill92_6);
        break lexical_join_138;
    }
    if (!(spill92_6)) {
        break lexical_join_137;
    }
    life10_136 = (life10_136 | __invokedynamic92_32(17373, (1660944314797648522L ^ life4_3)));
    }
    lexicalValue92_138_0 = life9_128;
    }
    if (!((lexicalValue92_138_0 > 0))) {
        break lexical_join_143;
    }
    __call92_33(life8_126, " ");
    }
    __call92_34(life8_126, life10_136);
    life9_128 += 1;
    if (!((life6_5 == null))) { continue lexical_cycle_109; }
    break lexical_cycle_109;
    }
    }
    life9_128 = __invokedynamic92_35(24231, (5278605325827962869L ^ life4_3));
    lexicalValue92_163_0 = __integerCategory92_38(__call92_37(p0, __invokedynamic92_36(30994, (8188595568520816621L ^ life4_3))));
    }
    if (!((life6_5 != null))) {
        lexicalValue92_183_0 = lexicalValue92_163_0;
        break lexical_join_183;
    }
    if (!((lexicalValue92_163_0 == 0))) {
        break lexical_join_176;
    }
    spill92_7 = __call92_40(p0, __invokedynamic92_39(4098, (94348415273799407L ^ life4_3)));
    if (!((life6_5 != null))) {
        lexicalValue92_183_0 = __integerCategory92_41(spill92_7);
        break lexical_join_183;
    }
    if (!(spill92_7)) {
        break lexical_join_184;
    }
    }
    lexicalValue92_183_0 = (life9_128 | __invokedynamic92_42(24722, (4666224073174632915L ^ life4_3)));
    }
    life9_128 = lexicalValue92_183_0;
    }
    life10_228 = new moom.OH();
    __call92_45(life10_228, __invokedynamic92_43(17049, (3363554631693884485L ^ life4_3)), __invokedynamic92_44(1815, (3236529702533536205L ^ life4_3)));
    __call92_48(life10_228, __invokedynamic92_46(26734, (2621252261511558809L ^ life4_3)), __invokedynamic92_47(p2));
    __call92_51(life10_228, __invokedynamic92_49(15511, (4741042260584079962L ^ life4_3)), __invokedynamic92_50(life8_126));
    __call92_54(life10_228, __invokedynamic92_52(22036, (6174443569875699966L ^ life4_3)), __invokedynamic92_53(life9_128));
    spill92_8 = p1;
    if (!((life6_5 != null))) {
        lexicalValue92_260_0 = spill92_8;
        break lexical_join_260;
    }
    if (!(__call92_56(spill92_8, __invokedynamic92_55(17342, (7681033635630996821L ^ life4_3))))) {
        break lexical_join_252;
    }
    __call92_58(life10_228, __invokedynamic92_57(15238, (301027739853628685L ^ life4_3)), p0);
    if (!((life6_5 == null))) {
        break lexical_join_261;
    }
    }
    lexicalValue92_260_0 = __call92_60(life10_228, __invokedynamic92_59(20794, (8413044532353978325L ^ life4_3)), p0);
    }
    __discardScalar92_61(lexicalValue92_260_0);
    }
    return life10_228;
}
public static void h92_0(moom.Oo p0) throws Throwable {
    throw __call1009200_0(p0);
}
public static void h92_1(moom.Oo p0) throws Throwable {
    throw __call1009201_0(p0);
}
public static void h92_2(moom.Oo p0) throws Throwable {
    throw __call1009202_0(p0);
}
public static void h92_3(moom.Oo p0) throws Throwable {
    throw __call1009203_0(p0);
}
public static void h92_4(moom.Oo p0) throws Throwable {
    throw __call1009204_0(p0);
}
public static void h92_5(moom.Oo p0) throws Throwable {
    throw __call1009205_0(p0);
}
public static void h92_6(moom.Oo p0) throws Throwable {
    throw __call1009206_0(p0);
}
public static void h92_7(moom.Oo p0) throws Throwable {
    throw __call1009207_0(p0);
}
public static void h92_8(moom.Oo p0) throws Throwable {
    throw __call1009208_0(p0);
}
public static void h92_9(moom.Oo p0) throws Throwable {
    throw __call1009209_0(p0);
}
public static void h92_10(moom.Oo p0) throws Throwable {
    throw __call1009210_0(p0);
}
public static void h92_11(moom.Oo p0) throws Throwable {
    throw __call1009211_0(p0);
}
public static void h92_12(moom.Oo p0) throws Throwable {
    throw __call1009212_0(p0);
}
public static void h92_13(moom.Oo p0) throws Throwable {
    throw __call1009213_0(p0);
}
public static void h92_14(moom.Oo p0) throws Throwable {
    throw __call1009214_0(p0);
}
public static void h92_15(moom.Oo p0) throws Throwable {
    throw __call1009215_0(p0);
}
public static void h92_16(moom.Oo p0) throws Throwable {
    throw __call1009216_0(p0);
}
private static native long __fieldRead92_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call92_1() throws Throwable;
private static native java.lang.String __invokedynamic92_3(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic92_5(int a0, long a1) throws Throwable;
private static native boolean __call92_6(java.lang.String a0, java.lang.String[] a1) throws Throwable;
private static native int __integerCategory92_7(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic92_8(int a0, long a1) throws Throwable;
private static native boolean __call92_9(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory92_10(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic92_11(int a0, long a1) throws Throwable;
private static native boolean __call92_12(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __fieldRead92_13() throws Throwable;
private static native int __call92_14(net.minecraft.item.Item a0) throws Throwable;
private static native java.lang.String __invokedynamic92_15(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic92_16(int a0, long a1) throws Throwable;
private static native java.lang.Object __call92_17(moom.OH a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic92_18(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic92_19(int a0) throws Throwable;
private static native java.lang.Object __call92_20(moom.OH a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.util.Map __call92_21() throws Throwable;
private static native java.lang.Object __call92_22(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native int[] __cast92_23(java.lang.Object a0) throws Throwable;
private static native java.lang.String __invokedynamic92_24(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic92_26(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call92_27(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic92_28(int a0, long a1) throws Throwable;
private static native boolean __call92_29(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory92_30(boolean value) throws Throwable;
private static native int __integerCategory92_31(boolean value) throws Throwable;
private static native int __invokedynamic92_32(int a0, long a1) throws Throwable;
private static native java.lang.StringBuilder __call92_33(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call92_34(java.lang.StringBuilder a0, int a1) throws Throwable;
private static native int __invokedynamic92_35(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic92_36(int a0, long a1) throws Throwable;
private static native boolean __call92_37(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory92_38(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic92_39(int a0, long a1) throws Throwable;
private static native boolean __call92_40(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory92_41(boolean value) throws Throwable;
private static native int __invokedynamic92_42(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic92_43(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic92_44(int a0, long a1) throws Throwable;
private static native java.lang.Object __call92_45(moom.OH a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic92_46(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic92_47(int a0) throws Throwable;
private static native java.lang.Object __call92_48(moom.OH a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic92_49(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic92_50(java.lang.StringBuilder a0) throws Throwable;
private static native java.lang.Object __call92_51(moom.OH a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic92_52(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic92_53(int a0) throws Throwable;
private static native java.lang.Object __call92_54(moom.OH a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic92_55(int a0, long a1) throws Throwable;
private static native boolean __call92_56(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic92_57(int a0, long a1) throws Throwable;
private static native java.lang.Object __call92_58(moom.OH a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic92_59(int a0, long a1) throws Throwable;
private static native java.lang.Object __call92_60(moom.OH a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __discardScalar92_61(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1009200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1009201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1009202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1009203_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1009204_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1009205_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1009206_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1009207_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1009208_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1009209_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1009210_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1009211_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1009212_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1009213_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1009214_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1009215_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1009216_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.Jv[][] __sourceHandlerCall_9e9ca3da27bfefe71612(java.util.List a0) throws E;
private static final class __SourceHandler_9e9ca3da27bfefe71612 {

public static moom.Jv[][] f771(java.util.List p0) throws Throwable {
    net.minecraft.entity.Entity[] spill771_0;
    long life1_3;
    moom.Jv[][] life4_8;
    net.minecraft.entity.Entity[] life3_9;
    int life5_11;
    java.util.List life6_20;
    moom.Jv[] life7_33;
    lexical_join_43: {
    life1_3 = (__fieldRead771_0() ^ 118091992577917L);
    spill771_0 = __call771_1();
    life4_8 = new moom.Jv[__call771_2(p0)][];
    life3_9 = spill771_0;
    life5_11 = 0;
    lexical_cycle_12: while (true) {
    lexical_join_41: {
    lexical_join_40: {
    if (!((life5_11 < __call771_3(p0)))) {
        break lexical_join_43;
    }
    life6_20 = __cast771_5(__call771_4(p0, life5_11));
    if (!((life3_9 != null))) {
        break lexical_join_41;
    }
    if (!((life6_20 != null))) {
        break lexical_join_40;
    }
    life7_33 = __cast771_7(__call771_6(life6_20, new moom.Jv[0]));
    __call771_8(life7_33, new moom.Jx());
    (life4_8)[life5_11] = life7_33;
    }
    life5_11 += 1;
    }
    if (!((life3_9 == null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    return life4_8;
}
public static void h771_0(moom.Oo p0) throws Throwable {
    throw __call1077100_0(p0);
}
private static native long __fieldRead771_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call771_1() throws Throwable;
private static native int __call771_2(java.util.List a0) throws Throwable;
private static native int __call771_3(java.util.List a0) throws Throwable;
private static native java.lang.Object __call771_4(java.util.List a0, int a1) throws Throwable;
private static native java.util.List __cast771_5(java.lang.Object a0) throws Throwable;
private static native java.lang.Object[] __call771_6(java.util.List a0, moom.Jv[] a1) throws Throwable;
private static native moom.Jv[] __cast771_7(java.lang.Object[] a0) throws Throwable;
private static native void __call771_8(moom.Jv[] a0, moom.Jx a1) throws Throwable;
private static native java.lang.Exception __call1077100_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_aeccf787599c658ea987(moom.Jv a0, java.util.List a1) throws E;
private static final class __SourceHandler_aeccf787599c658ea987 {

public static void f93(moom.Jv p0, java.util.List p1) throws Throwable {
    int lexicalValue93_26_0;
    int spill93_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    int life5_10;
    int life6_20;
    lexical_join_43: {
    life2_3 = (__fieldRead93_0() ^ 55159217096170L);
    life4_5 = __call93_1();
    if (!((__fieldRead93_2(p0) != null))) {
        break lexical_join_43;
    }
    life5_10 = 0;
    lexical_cycle_11: while (true) {
    lexical_join_40: {
    lexical_join_36: {
    lexical_join_26: {
    if (!((life5_10 < (__fieldRead93_3(p0)).length))) {
        break lexical_join_43;
    }
    life6_20 = (__fieldRead93_4(p0))[life5_10];
    spill93_0 = life6_20;
    if (!((life4_5 != null))) {
        lexicalValue93_26_0 = spill93_0;
        break lexical_join_26;
    }
    if (!((spill93_0 <= 0))) {
        break lexical_join_36;
    }
    lexicalValue93_26_0 = life6_20;
    }
    int __stackOp93_6_0 = lexicalValue93_26_0;
    java.lang.String __stackOp93_6_1 = __invokedynamic93_5(4770, (4929300750294297366L ^ life2_3));
    __call93_8(__invokedynamic93_7(__stackOp93_6_1, __stackOp93_6_0));
    if (!((life4_5 == null))) {
        break lexical_join_40;
    }
    }
    __call93_9(p0, p1, life6_20);
    }
    life5_10 += 1;
    if (!((life4_5 == null))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    return;
}
public static void h93_0(moom.Oo p0) throws Throwable {
    throw __call1009300_0(p0);
}
public static void h93_1(moom.Oo p0) throws Throwable {
    throw __call1009301_0(p0);
}
private static native long __fieldRead93_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call93_1() throws Throwable;
private static native int[] __fieldRead93_2(moom.Jv a0) throws Throwable;
private static native int[] __fieldRead93_3(moom.Jv a0) throws Throwable;
private static native int[] __fieldRead93_4(moom.Jv a0) throws Throwable;
private static native java.lang.String __invokedynamic93_5(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic93_7(java.lang.String a0, int a1) throws Throwable;
private static native void __call93_8(java.lang.String a0) throws Throwable;
private static native void __call93_9(moom.Jv a0, java.util.List a1, int a2) throws Throwable;
private static native java.lang.Exception __call1009300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1009301_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_829063f39d12a884402d(moom.Jv a0, java.util.List a1, int a2) throws E;
private static final class __SourceHandler_829063f39d12a884402d {

public static void f42(moom.Jv p0, java.util.List p1, int p2) throws Throwable {
    java.util.List forestValue42_22_0;
    java.util.List forestValue42_37_0;
    java.util.List spill42_0;
    java.util.List spill42_1;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    java.util.List life6_28;
    forest_join_37: {
    forest_join_36: {
    forest_join_22: {
    forest_join_18: {
    life3_3 = (__fieldRead42_0() ^ 26346456057688L);
    life5_5 = __call42_1();
    forest_cycle_6: while (true) {
    if (!((p2 >= __call42_2(p1)))) {
        break forest_join_18;
    }
    spill42_0 = p1;
    if (!((life5_5 != null))) {
        forestValue42_22_0 = spill42_0;
        break forest_join_22;
    }
    __call42_3(spill42_0, null);
    if (!((life5_5 == null))) {
        continue forest_cycle_6;
    }
    break forest_cycle_6;
    }
    }
    forestValue42_22_0 = __cast42_5(__call42_4(p1, p2));
    }
    life6_28 = forestValue42_22_0;
    spill42_1 = life6_28;
    if (!((life5_5 != null))) {
        forestValue42_37_0 = spill42_1;
        break forest_join_37;
    }
    if (!((spill42_1 == null))) {
        break forest_join_36;
    }
    life6_28 = new java.util.ArrayList();
    __call42_6(p1, p2, life6_28);
    }
    forestValue42_37_0 = life6_28;
    }
    __call42_7(forestValue42_37_0, p0);
    return;
}
public static void h42_0(moom.Oo p0) throws Throwable {
    throw __call3004200_0(p0);
}
public static void h42_1(moom.Oo p0) throws Throwable {
    throw __call3004201_0(p0);
}
private static native long __fieldRead42_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call42_1() throws Throwable;
private static native int __call42_2(java.util.List a0) throws Throwable;
private static native boolean __call42_3(java.util.List a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Object __call42_4(java.util.List a0, int a1) throws Throwable;
private static native java.util.List __cast42_5(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call42_6(java.util.List a0, int a1, java.util.List a2) throws Throwable;
private static native boolean __call42_7(java.util.List a0, moom.Jv a1) throws Throwable;
private static native java.lang.Exception __call3004200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3004201_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_58454ae19e366f75b667(moom.Jv a0, net.minecraft.item.ItemStack a1, int[][] a2) throws E;
private static final class __SourceHandler_58454ae19e366f75b667 {

public static boolean f314(moom.Jv p0, net.minecraft.item.ItemStack p1, int[][] p2) throws Throwable {
    int forestValue314_29_0;
    int forestValue314_54_0;
    moom.Ke forestValue314_59_0;
    moom.Ke forestValue314_64_0;
    int forestValue314_71_0;
    int[][] forestValue314_85_0;
    int forestValue314_123_0;
    int forestValue314_127_0;
    moom.Ke forestValue314_132_0;
    int[][] forestValue314_139_0;
    int forestValue314_177_0;
    int forestValue314_181_0;
    moom.Jv forestValue314_183_0;
    moom.Jv forestValue314_218_0;
    int forestValue314_219_0;
    int forestValue314_234_0;
    int forestValue314_236_0;
    int forestValue314_238_0;
    net.minecraft.entity.Entity[] spill314_0;
    moom.Ke spill314_1;
    int spill314_2;
    moom.Ke spill314_3;
    boolean spill314_4;
    moom.Ke spill314_5;
    int[][] spill314_6;
    boolean spill314_7;
    moom.Jv spill314_8;
    int[][] spill314_9;
    boolean spill314_10;
    boolean spill314_11;
    int spill314_12;
    long life3_3;
    net.minecraft.item.Item life6_7;
    net.minecraft.entity.Entity[] life5_8;
    int life7_17;
    int life8_37;
    int[][] life7_80;
    int life8_98;
    int[][] life9_100;
    int life10_103;
    int life11_105;
    int[] life12_112;
    int life13_116;
    int life8_160;
    int[][] life9_162;
    int life10_165;
    int life11_167;
    int[] life12_174;
    int life13_178;
    net.minecraft.nbt.NBTTagCompound life8_213;
    int life9_215;
    moom.Kb life10_225;
    forest_join_238: {
    forest_join_237: {
    forest_join_236: {
    forest_join_235: {
    forest_join_234: {
    forest_join_233: {
    forest_join_226: {
    forest_join_219: {
    forest_join_218: {
    forest_join_217: {
    forest_join_215: {
    forest_join_183: {
    forest_join_182: {
    forest_join_181: {
    forest_join_177: {
    forest_join_176: {
    forest_join_140: {
    forest_join_139: {
    forest_join_132: {
    forest_join_128: {
    forest_join_127: {
    forest_join_123: {
    forest_join_122: {
    forest_join_86: {
    forest_join_85: {
    forest_join_72: {
    forest_join_71: {
    forest_join_64: {
    forest_join_59: {
    forest_join_57: {
    forest_join_54: {
    forest_join_48: {
    forest_join_29: {
    forest_join_27: {
    life3_3 = (__fieldRead314_0() ^ 88864877819809L);
    spill314_0 = __call314_1();
    life6_7 = __call314_2(p1);
    life5_8 = spill314_0;
    spill314_1 = __fieldRead314_3(p0);
    if (!((life5_8 != null))) {
        forestValue314_59_0 = spill314_1;
        break forest_join_59;
    }
    if (!((spill314_1 != null))) {
        break forest_join_57;
    }
    life7_17 = __call314_4(p1);
    spill314_2 = __fieldRead314_5(p0);
    if (!((life5_8 != null))) {
        forestValue314_29_0 = spill314_2;
        break forest_join_29;
    }
    if (!((spill314_2 != 0))) {
        break forest_join_27;
    }
    life7_17 = (life7_17 & __fieldRead314_6(p0));
    }
    forestValue314_29_0 = __integerCategory314_8(__fieldRead314_7(p0));
    }
    if (!((life5_8 != null))) {
        forestValue314_54_0 = forestValue314_29_0;
        break forest_join_54;
    }
    if (!((forestValue314_29_0 != 0))) {
        break forest_join_48;
    }
    life8_37 = __call314_9(life6_7);
    life7_17 = ((int) (((double) (life7_17 * __invokedynamic314_10(20965, (3411652502817861005L ^ life3_3)))) / ((double) life8_37)));
    }
    spill314_3 = __fieldRead314_11(p0);
    if (!((life5_8 != null))) {
        forestValue314_59_0 = spill314_3;
        break forest_join_59;
    }
    forestValue314_54_0 = __integerCategory314_13(__call314_12(spill314_3, life7_17));
    }
    if (!((forestValue314_54_0 == 0))) {
        break forest_join_57;
    }
    return __integerCategory314_14(0);
    }
    forestValue314_59_0 = __fieldRead314_15(p0);
    }
    if (!((life5_8 != null))) {
        forestValue314_64_0 = forestValue314_59_0;
        break forest_join_64;
    }
    if (!((forestValue314_59_0 != null))) {
        break forest_join_72;
    }
    forestValue314_64_0 = __fieldRead314_16(p0);
    }
    spill314_4 = __call314_18(forestValue314_64_0, __fieldRead314_17(p1));
    if (!((life5_8 != null))) {
        forestValue314_71_0 = __integerCategory314_19(spill314_4);
        break forest_join_71;
    }
    if (!((!spill314_4))) {
        break forest_join_72;
    }
    forestValue314_71_0 = 0;
    }
    return __integerCategory314_20(forestValue314_71_0);
    }
    life7_80 = p2;
    spill314_5 = __fieldRead314_21(p0);
    if (!((life5_8 != null))) {
        forestValue314_132_0 = spill314_5;
        break forest_join_132;
    }
    if (!((spill314_5 != null))) {
        break forest_join_128;
    }
    spill314_6 = p2;
    if (!((life5_8 != null))) {
        forestValue314_85_0 = spill314_6;
        break forest_join_85;
    }
    if (!((spill314_6 == null))) {
        break forest_join_86;
    }
    forestValue314_85_0 = __call314_22(p1);
    }
    life7_80 = forestValue314_85_0;
    }
    life8_98 = 0;
    life9_100 = life7_80;
    life10_103 = (life9_100).length;
    life11_105 = 0;
    forest_cycle_95: while (true) {
    forest_join_120: {
    forest_join_119: {
    if (!((life11_105 < life10_103))) {
        break forest_join_122;
    }
    life12_112 = (life9_100)[life11_105];
    life13_116 = (life12_112)[0];
    if (!((life5_8 != null))) {
        break forest_join_120;
    }
    spill314_7 = __call314_24(__fieldRead314_23(p0), life13_116);
    if (!((life5_8 != null))) {
        forestValue314_123_0 = __integerCategory314_25(spill314_7);
        break forest_join_123;
    }
    if (!(spill314_7)) {
        break forest_join_119;
    }
    life8_98 = 1;
    if (!((life5_8 == null))) {
        break forest_join_122;
    }
    }
    life11_105 += 1;
    }
    if (!((life5_8 == null))) {
        continue forest_cycle_95;
    }
    break forest_cycle_95;
    }
    }
    forestValue314_123_0 = life8_98;
    }
    if (!((life5_8 != null))) {
        forestValue314_127_0 = forestValue314_123_0;
        break forest_join_127;
    }
    if (!((forestValue314_123_0 == 0))) {
        break forest_join_128;
    }
    forestValue314_127_0 = 0;
    }
    return __integerCategory314_26(forestValue314_127_0);
    }
    spill314_8 = p0;
    if (!((life5_8 != null))) {
        forestValue314_183_0 = spill314_8;
        break forest_join_183;
    }
    forestValue314_132_0 = __fieldRead314_27(spill314_8);
    }
    if (!((forestValue314_132_0 != null))) {
        break forest_join_182;
    }
    spill314_9 = life7_80;
    if (!((life5_8 != null))) {
        forestValue314_139_0 = spill314_9;
        break forest_join_139;
    }
    if (!((spill314_9 == null))) {
        break forest_join_140;
    }
    forestValue314_139_0 = __call314_28(p1);
    }
    life7_80 = forestValue314_139_0;
    }
    life8_160 = 0;
    life9_162 = life7_80;
    life10_165 = (life9_162).length;
    life11_167 = 0;
    forest_cycle_149: while (true) {
    forest_join_174: {
    forest_join_173: {
    if (!((life11_167 < life10_165))) {
        break forest_join_176;
    }
    life12_174 = (life9_162)[life11_167];
    life13_178 = (life12_174)[1];
    if (!((life5_8 != null))) {
        break forest_join_174;
    }
    spill314_10 = __call314_30(__fieldRead314_29(p0), life13_178);
    if (!((life5_8 != null))) {
        forestValue314_177_0 = __integerCategory314_31(spill314_10);
        break forest_join_177;
    }
    if (!(spill314_10)) {
        break forest_join_173;
    }
    life8_160 = 1;
    if (!((life5_8 == null))) {
        break forest_join_176;
    }
    }
    life11_167 += 1;
    }
    if (!((life5_8 == null))) {
        continue forest_cycle_149;
    }
    break forest_cycle_149;
    }
    }
    forestValue314_177_0 = life8_160;
    }
    if (!((life5_8 != null))) {
        forestValue314_181_0 = forestValue314_177_0;
        break forest_join_181;
    }
    if (!((forestValue314_177_0 == 0))) {
        break forest_join_182;
    }
    forestValue314_181_0 = 0;
    }
    return __integerCategory314_32(forestValue314_181_0);
    }
    forestValue314_183_0 = p0;
    }
    if (!((life5_8 != null))) {
        forestValue314_218_0 = forestValue314_183_0;
        break forest_join_218;
    }
    if (!((__fieldRead314_33(forestValue314_183_0) != null))) {
        break forest_join_217;
    }
    life8_213 = __call314_34(p1);
    life9_215 = 0;
    forest_cycle_192: while (true) {
    forest_join_212: {
    forest_join_211: {
    if (!((life9_215 < (__fieldRead314_35(p0)).length))) {
        break forest_join_217;
    }
    life10_225 = (__fieldRead314_36(p0))[life9_215];
    if (!((life5_8 != null))) {
        break forest_join_212;
    }
    spill314_11 = __call314_37(life10_225, life8_213);
    if (!((life5_8 != null))) {
        forestValue314_219_0 = __integerCategory314_38(spill314_11);
        break forest_join_219;
    }
    if (!((!spill314_11))) {
        break forest_join_211;
    }
    break forest_join_215;
    }
    life9_215 += 1;
    }
    if (!((life5_8 == null))) {
        continue forest_cycle_192;
    }
    break forest_cycle_192;
    }
    break forest_join_217;
    }
    return __integerCategory314_39(0);
    }
    forestValue314_218_0 = p0;
    }
    forestValue314_219_0 = __fieldRead314_40(forestValue314_218_0);
    }
    if (!((life5_8 != null))) {
        forestValue314_238_0 = forestValue314_219_0;
        break forest_join_238;
    }
    if (!((forestValue314_219_0 != 0))) {
        break forest_join_237;
    }
    if (!((__fieldRead314_41(p0) == 1))) {
        break forest_join_226;
    }
    }
    spill314_12 = __fieldRead314_42(p0);
    if (!((life5_8 != null))) {
        forestValue314_234_0 = spill314_12;
        break forest_join_234;
    }
    if (!((spill314_12 == 2))) {
        break forest_join_233;
    }
    break forest_join_235;
    }
    forestValue314_234_0 = 1;
    }
    forestValue314_236_0 = forestValue314_234_0;
    break forest_join_236;
    }
    forestValue314_236_0 = 0;
    }
    return __integerCategory314_43(forestValue314_236_0);
    }
    forestValue314_238_0 = 1;
    }
    return __integerCategory314_44(forestValue314_238_0);
}
public static boolean h314_0(moom.Oo p0) throws Throwable {
    throw __call3031400_0(p0);
}
public static boolean h314_1(moom.Oo p0) throws Throwable {
    throw __call3031401_0(p0);
}
public static boolean h314_2(moom.Oo p0) throws Throwable {
    throw __call3031402_0(p0);
}
public static boolean h314_3(moom.Oo p0) throws Throwable {
    throw __call3031403_0(p0);
}
public static boolean h314_4(moom.Oo p0) throws Throwable {
    throw __call3031404_0(p0);
}
public static boolean h314_5(moom.Oo p0) throws Throwable {
    throw __call3031405_0(p0);
}
public static boolean h314_6(moom.Oo p0) throws Throwable {
    throw __call3031406_0(p0);
}
public static boolean h314_7(moom.Oo p0) throws Throwable {
    throw __call3031407_0(p0);
}
public static boolean h314_8(moom.Oo p0) throws Throwable {
    throw __call3031408_0(p0);
}
public static boolean h314_9(moom.Oo p0) throws Throwable {
    throw __call3031409_0(p0);
}
public static boolean h314_10(moom.Oo p0) throws Throwable {
    throw __call3031410_0(p0);
}
public static boolean h314_11(moom.Oo p0) throws Throwable {
    throw __call3031411_0(p0);
}
public static boolean h314_12(moom.Oo p0) throws Throwable {
    throw __call3031412_0(p0);
}
public static boolean h314_13(moom.Oo p0) throws Throwable {
    throw __call3031413_0(p0);
}
public static boolean h314_14(moom.Oo p0) throws Throwable {
    throw __call3031414_0(p0);
}
public static boolean h314_15(moom.Oo p0) throws Throwable {
    throw __call3031415_0(p0);
}
public static boolean h314_16(moom.Oo p0) throws Throwable {
    throw __call3031416_0(p0);
}
public static boolean h314_17(moom.Oo p0) throws Throwable {
    throw __call3031417_0(p0);
}
public static boolean h314_18(moom.Oo p0) throws Throwable {
    throw __call3031418_0(p0);
}
public static boolean h314_19(moom.Oo p0) throws Throwable {
    throw __call3031419_0(p0);
}
public static boolean h314_20(moom.Oo p0) throws Throwable {
    throw __call3031420_0(p0);
}
public static boolean h314_21(moom.Oo p0) throws Throwable {
    throw __call3031421_0(p0);
}
public static boolean h314_22(moom.Oo p0) throws Throwable {
    throw __call3031422_0(p0);
}
public static boolean h314_23(moom.Oo p0) throws Throwable {
    throw __call3031423_0(p0);
}
public static boolean h314_24(moom.Oo p0) throws Throwable {
    throw __call3031424_0(p0);
}
public static boolean h314_25(moom.Oo p0) throws Throwable {
    throw __call3031425_0(p0);
}
public static boolean h314_26(moom.Oo p0) throws Throwable {
    throw __call3031426_0(p0);
}
public static boolean h314_27(moom.Oo p0) throws Throwable {
    throw __call3031427_0(p0);
}
public static boolean h314_28(moom.Oo p0) throws Throwable {
    throw __call3031428_0(p0);
}
public static boolean h314_29(moom.Oo p0) throws Throwable {
    throw __call3031429_0(p0);
}
public static boolean h314_30(moom.Oo p0) throws Throwable {
    throw __call3031430_0(p0);
}
public static boolean h314_31(moom.Oo p0) throws Throwable {
    throw __call3031431_0(p0);
}
private static native long __fieldRead314_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call314_1() throws Throwable;
private static native net.minecraft.item.Item __call314_2(net.minecraft.item.ItemStack a0) throws Throwable;
private static native moom.Ke __fieldRead314_3(moom.Jv a0) throws Throwable;
private static native int __call314_4(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __fieldRead314_5(moom.Jv a0) throws Throwable;
private static native int __fieldRead314_6(moom.Jv a0) throws Throwable;
private static native boolean __fieldRead314_7(moom.Jv a0) throws Throwable;
private static native int __integerCategory314_8(boolean value) throws Throwable;
private static native int __call314_9(net.minecraft.item.Item a0) throws Throwable;
private static native int __invokedynamic314_10(int a0, long a1) throws Throwable;
private static native moom.Ke __fieldRead314_11(moom.Jv a0) throws Throwable;
private static native boolean __call314_12(moom.Ke a0, int a1) throws Throwable;
private static native int __integerCategory314_13(boolean value) throws Throwable;
private static native boolean __integerCategory314_14(int value) throws Throwable;
private static native moom.Ke __fieldRead314_15(moom.Jv a0) throws Throwable;
private static native moom.Ke __fieldRead314_16(moom.Jv a0) throws Throwable;
private static native int __fieldRead314_17(net.minecraft.item.ItemStack a0) throws Throwable;
private static native boolean __call314_18(moom.Ke a0, int a1) throws Throwable;
private static native int __integerCategory314_19(boolean value) throws Throwable;
private static native boolean __integerCategory314_20(int value) throws Throwable;
private static native moom.Ke __fieldRead314_21(moom.Jv a0) throws Throwable;
private static native int[][] __call314_22(net.minecraft.item.ItemStack a0) throws Throwable;
private static native moom.Ke __fieldRead314_23(moom.Jv a0) throws Throwable;
private static native boolean __call314_24(moom.Ke a0, int a1) throws Throwable;
private static native int __integerCategory314_25(boolean value) throws Throwable;
private static native boolean __integerCategory314_26(int value) throws Throwable;
private static native moom.Ke __fieldRead314_27(moom.Jv a0) throws Throwable;
private static native int[][] __call314_28(net.minecraft.item.ItemStack a0) throws Throwable;
private static native moom.Ke __fieldRead314_29(moom.Jv a0) throws Throwable;
private static native boolean __call314_30(moom.Ke a0, int a1) throws Throwable;
private static native int __integerCategory314_31(boolean value) throws Throwable;
private static native boolean __integerCategory314_32(int value) throws Throwable;
private static native moom.Kb[] __fieldRead314_33(moom.Jv a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call314_34(net.minecraft.item.ItemStack a0) throws Throwable;
private static native moom.Kb[] __fieldRead314_35(moom.Jv a0) throws Throwable;
private static native moom.Kb[] __fieldRead314_36(moom.Jv a0) throws Throwable;
private static native boolean __call314_37(moom.Kb a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native int __integerCategory314_38(boolean value) throws Throwable;
private static native boolean __integerCategory314_39(int value) throws Throwable;
private static native int __fieldRead314_40(moom.Jv a0) throws Throwable;
private static native int __fieldRead314_41(moom.Jv a0) throws Throwable;
private static native int __fieldRead314_42(moom.Jv a0) throws Throwable;
private static native boolean __integerCategory314_43(int value) throws Throwable;
private static native boolean __integerCategory314_44(int value) throws Throwable;
private static native java.lang.Exception __call3031400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3031401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3031402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3031403_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3031404_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3031405_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3031406_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3031407_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3031408_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3031409_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3031410_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3031411_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3031412_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3031413_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3031414_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3031415_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3031416_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3031417_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3031418_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3031419_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3031420_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3031421_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3031422_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3031423_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3031424_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3031425_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3031426_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3031427_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3031428_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3031429_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3031430_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3031431_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_758c3721c30de8363ea9(net.minecraft.client.renderer.entity.RenderItem a0, net.minecraft.item.ItemStack a1, net.minecraft.client.resources.model.IBakedModel a2) throws E;
private static final class __SourceHandler_758c3721c30de8363ea9 {

public static boolean f774(net.minecraft.client.renderer.entity.RenderItem p0, net.minecraft.item.ItemStack p1, net.minecraft.client.resources.model.IBakedModel p2) throws Throwable {
    net.minecraft.item.ItemStack lexicalValue774_17_0;
    int lexicalValue774_25_0;
    java.util.HashSet lexicalValue774_93_0;
    int lexicalValue774_105_0;
    moom.Jv lexicalValue774_107_0;
    moom.Jv lexicalValue774_116_0;
    int lexicalValue774_142_0;
    int lexicalValue774_193_0;
    int lexicalValue774_233_0;
    net.minecraft.item.ItemStack spill774_0;
    int spill774_1;
    int spill774_2;
    java.util.HashSet spill774_3;
    boolean spill774_4;
    moom.Jv spill774_5;
    int spill774_6;
    int spill774_7;
    int spill774_8;
    int spill774_9;
    int spill774_10;
    int spill774_11;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    int[][] life6_25;
    java.util.HashSet life7_37;
    int life8_39;
    net.minecraft.client.renderer.texture.TextureManager life9_41;
    int[][] life10_43;
    int life11_46;
    int life12_48;
    int[] life13_55;
    int life14_59;
    moom.Jv[] life15_82;
    moom.Jv[] life16_91;
    int life17_94;
    int life18_96;
    moom.Jv life19_103;
    float life20_161;
    float life21_216;
    lexical_join_233: {
    lexical_join_232: {
    lexical_join_193: {
    lexical_join_192: {
    lexical_join_26: {
    lexical_join_25: {
    lexical_join_17: {
    lexical_join_16: {
    lexical_join_10: {
    life3_3 = (__fieldRead774_0() ^ 3336771284218L);
    life5_5 = __call774_1();
    if (!((__fieldRead774_2() == null))) {
        break lexical_join_10;
    }
    return __integerCategory774_3(0);
    }
    spill774_0 = p1;
    if (!((life5_5 != null))) {
        lexicalValue774_17_0 = spill774_0;
        break lexical_join_17;
    }
    if (!((spill774_0 == null))) {
        break lexical_join_16;
    }
    return __integerCategory774_4(0);
    }
    lexicalValue774_17_0 = p1;
    }
    life6_25 = __call774_5(lexicalValue774_17_0);
    spill774_1 = (life6_25).length;
    if (!((life5_5 != null))) {
        lexicalValue774_25_0 = spill774_1;
        break lexical_join_25;
    }
    if (!((spill774_1 == 0))) {
        break lexical_join_26;
    }
    lexicalValue774_25_0 = 0;
    }
    return __integerCategory774_6(lexicalValue774_25_0);
    }
    life7_37 = null;
    life8_39 = 0;
    life9_41 = __call774_7();
    life10_43 = life6_25;
    life11_46 = (life10_43).length;
    life12_48 = 0;
    lexical_cycle_39: while (true) {
    lexical_join_190: {
    lexical_join_189: {
    if (!((life12_48 < life11_46))) {
        break lexical_join_192;
    }
    life13_55 = (life10_43)[life12_48];
    life14_59 = (life13_55)[0];
    if (!((life5_5 != null))) {
        break lexical_join_190;
    }
    spill774_2 = life14_59;
    if (!((life5_5 != null))) {
        lexicalValue774_193_0 = spill774_2;
        break lexical_join_193;
    }
    if (!((spill774_2 >= 0))) {
        break lexical_join_189;
    }
    if (!((life14_59 < (__fieldRead774_8()).length))) {
        break lexical_join_189;
    }
    life15_82 = (__fieldRead774_9())[life14_59];
    if (!((life5_5 != null))) {
        break lexical_join_190;
    }
    if (!((life15_82 != null))) {
        break lexical_join_189;
    }
    life16_91 = life15_82;
    life17_94 = (life16_91).length;
    life18_96 = 0;
    lexical_cycle_75: while (true) {
    lexical_join_186: {
    lexical_join_142: {
    lexical_join_140: {
    lexical_join_116: {
    lexical_join_107: {
    lexical_join_105: {
    lexical_join_93: {
    lexical_join_92: {
    if (!((life18_96 < life17_94))) {
        break lexical_join_189;
    }
    life19_103 = (life16_91)[life18_96];
    if (!((life5_5 != null))) {
        break lexical_join_190;
    }
    spill774_3 = life7_37;
    if (!((life5_5 != null))) {
        lexicalValue774_93_0 = spill774_3;
        break lexical_join_93;
    }
    if (!((spill774_3 == null))) {
        break lexical_join_92;
    }
    life7_37 = new java.util.HashSet();
    }
    lexicalValue774_93_0 = life7_37;
    }
    spill774_4 = __call774_11(lexicalValue774_93_0, __call774_10(life14_59));
    if (!((life5_5 != null))) {
        lexicalValue774_105_0 = __integerCategory774_12(spill774_4);
        break lexical_join_105;
    }
    if (!(spill774_4)) {
        break lexical_join_186;
    }
    spill774_5 = life19_103;
    if (!((life5_5 != null))) {
        lexicalValue774_107_0 = spill774_5;
        break lexical_join_107;
    }
    lexicalValue774_105_0 = __integerCategory774_14(__call774_13(spill774_5, p1, life6_25));
    }
    if (!((lexicalValue774_105_0 != 0))) {
        break lexical_join_186;
    }
    lexicalValue774_107_0 = life19_103;
    }
    if (!((life5_5 != null))) {
        lexicalValue774_116_0 = lexicalValue774_107_0;
        break lexical_join_116;
    }
    if (!((__fieldRead774_15(lexicalValue774_107_0) != null))) {
        break lexical_join_186;
    }
    __call774_17(life9_41, __fieldRead774_16(life19_103));
    lexicalValue774_116_0 = life19_103;
    }
    life20_161 = __call774_18(lexicalValue774_116_0, life9_41);
    spill774_6 = life8_39;
    if (!((life5_5 != null))) {
        lexicalValue774_142_0 = spill774_6;
        break lexical_join_142;
    }
    if (!((spill774_6 == 0))) {
        break lexical_join_140;
    }
    life8_39 = 1;
    spill774_7 = 9685;
    __call774_19(0);
    __call774_21(__invokedynamic774_20(spill774_7, (8059011144347714291L ^ life3_3)));
    spill774_8 = 236;
    __call774_22();
    __call774_24(__invokedynamic774_23(spill774_8, (5008891019509442499L ^ life3_3)));
    }
    lexicalValue774_142_0 = __fieldRead774_25(life19_103);
    }
    __call774_26(lexicalValue774_142_0, 0x1.0p0f);
    __call774_27();
    __call774_28((life20_161 / 0x1.0p1f), (life20_161 / 0x1.0p1f), (life20_161 / 0x1.0p1f));
    life21_216 = (((__fieldRead774_29(life19_103) * ((float) (__call774_30() % __invokedynamic774_31(32335, (3707943841561943488L ^ life3_3))))) / 0x1.77p11f) / 0x1.0p3f);
    __call774_32(life21_216, 0x0.0p0f, 0x0.0p0f);
    __call774_34(__fieldRead774_33(life19_103), 0x0.0p0f, 0x0.0p0f, 0x1.0p0f);
    __call774_35(p0, p2, -1);
    __call774_36();
    }
    life18_96 += 1;
    if (!((life5_5 == null))) { continue lexical_cycle_75; }
    break lexical_cycle_75;
    }
    }
    life12_48 += 1;
    }
    if (!((life5_5 == null))) { continue lexical_cycle_39; }
    break lexical_cycle_39;
    }
    }
    lexicalValue774_193_0 = life8_39;
    }
    if (!((life5_5 != null))) {
        lexicalValue774_233_0 = lexicalValue774_193_0;
        break lexical_join_233;
    }
    if (!((lexicalValue774_193_0 != 0))) {
        break lexical_join_232;
    }
    __call774_37();
    spill774_9 = 13260;
    __call774_38();
    __call774_41(__invokedynamic774_39(spill774_9, (3086826114678559985L ^ life3_3)), __invokedynamic774_40(22417, (8352680289135521966L ^ life3_3)));
    spill774_10 = 13788;
    __call774_42(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    __call774_44(__invokedynamic774_43(spill774_10, (1805106614065959676L ^ life3_3)));
    spill774_11 = 1617;
    __call774_45();
    __call774_47(__invokedynamic774_46(spill774_11, (720470054778708340L ^ life3_3)));
    __call774_48(1);
    __call774_50(life9_41, __fieldRead774_49());
    }
    lexicalValue774_233_0 = life8_39;
    }
    return __integerCategory774_51(lexicalValue774_233_0);
}
public static void h774_0(moom.Oo p0) throws Throwable {
    throw __call1077400_0(p0);
}
public static void h774_1(moom.Oo p0) throws Throwable {
    throw __call1077401_0(p0);
}
public static void h774_2(moom.Oo p0) throws Throwable {
    throw __call1077402_0(p0);
}
public static void h774_3(moom.Oo p0) throws Throwable {
    throw __call1077403_0(p0);
}
public static void h774_4(moom.Oo p0) throws Throwable {
    throw __call1077404_0(p0);
}
public static void h774_5(moom.Oo p0) throws Throwable {
    throw __call1077405_0(p0);
}
public static void h774_6(moom.Oo p0) throws Throwable {
    throw __call1077406_0(p0);
}
public static void h774_7(moom.Oo p0) throws Throwable {
    throw __call1077407_0(p0);
}
public static void h774_8(moom.Oo p0) throws Throwable {
    throw __call1077408_0(p0);
}
public static void h774_9(moom.Oo p0) throws Throwable {
    throw __call1077409_0(p0);
}
public static void h774_10(moom.Oo p0) throws Throwable {
    throw __call1077410_0(p0);
}
public static void h774_11(moom.Oo p0) throws Throwable {
    throw __call1077411_0(p0);
}
public static void h774_12(moom.Oo p0) throws Throwable {
    throw __call1077412_0(p0);
}
public static void h774_13(moom.Oo p0) throws Throwable {
    throw __call1077413_0(p0);
}
public static void h774_14(moom.Oo p0) throws Throwable {
    throw __call1077414_0(p0);
}
public static void h774_15(moom.Oo p0) throws Throwable {
    throw __call1077415_0(p0);
}
public static void h774_16(moom.Oo p0) throws Throwable {
    throw __call1077416_0(p0);
}
public static void h774_17(moom.Oo p0) throws Throwable {
    throw __call1077417_0(p0);
}
private static native long __fieldRead774_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call774_1() throws Throwable;
private static native moom.Jv[][] __fieldRead774_2() throws Throwable;
private static native boolean __integerCategory774_3(int value) throws Throwable;
private static native boolean __integerCategory774_4(int value) throws Throwable;
private static native int[][] __call774_5(net.minecraft.item.ItemStack a0) throws Throwable;
private static native boolean __integerCategory774_6(int value) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call774_7() throws Throwable;
private static native moom.Jv[][] __fieldRead774_8() throws Throwable;
private static native moom.Jv[][] __fieldRead774_9() throws Throwable;
private static native java.lang.Integer __call774_10(int a0) throws Throwable;
private static native boolean __call774_11(java.util.HashSet a0, java.lang.Integer a1) throws Throwable;
private static native int __integerCategory774_12(boolean value) throws Throwable;
private static native boolean __call774_13(moom.Jv a0, net.minecraft.item.ItemStack a1, int[][] a2) throws Throwable;
private static native int __integerCategory774_14(boolean value) throws Throwable;
private static native moom.DD __fieldRead774_15(moom.Jv a0) throws Throwable;
private static native moom.DD __fieldRead774_16(moom.Jv a0) throws Throwable;
private static native void __call774_17(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native float __call774_18(moom.Jv a0, net.minecraft.client.renderer.texture.TextureManager a1) throws Throwable;
private static native void __call774_19(int a0) throws Throwable;
private static native int __invokedynamic774_20(int a0, long a1) throws Throwable;
private static native void __call774_21(int a0) throws Throwable;
private static native void __call774_22() throws Throwable;
private static native int __invokedynamic774_23(int a0, long a1) throws Throwable;
private static native void __call774_24(int a0) throws Throwable;
private static native int __fieldRead774_25(moom.Jv a0) throws Throwable;
private static native void __call774_26(int a0, float a1) throws Throwable;
private static native void __call774_27() throws Throwable;
private static native void __call774_28(float a0, float a1, float a2) throws Throwable;
private static native float __fieldRead774_29(moom.Jv a0) throws Throwable;
private static native long __call774_30() throws Throwable;
private static native long __invokedynamic774_31(int a0, long a1) throws Throwable;
private static native void __call774_32(float a0, float a1, float a2) throws Throwable;
private static native float __fieldRead774_33(moom.Jv a0) throws Throwable;
private static native void __call774_34(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call774_35(net.minecraft.client.renderer.entity.RenderItem a0, net.minecraft.client.resources.model.IBakedModel a1, int a2) throws Throwable;
private static native void __call774_36() throws Throwable;
private static native void __call774_37() throws Throwable;
private static native void __call774_38() throws Throwable;
private static native int __invokedynamic774_39(int a0, long a1) throws Throwable;
private static native int __invokedynamic774_40(int a0, long a1) throws Throwable;
private static native void __call774_41(int a0, int a1) throws Throwable;
private static native void __call774_42(float a0, float a1, float a2, float a3) throws Throwable;
private static native int __invokedynamic774_43(int a0, long a1) throws Throwable;
private static native void __call774_44(int a0) throws Throwable;
private static native void __call774_45() throws Throwable;
private static native int __invokedynamic774_46(int a0, long a1) throws Throwable;
private static native void __call774_47(int a0) throws Throwable;
private static native void __call774_48(int a0) throws Throwable;
private static native moom.DD __fieldRead774_49() throws Throwable;
private static native void __call774_50(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native boolean __integerCategory774_51(int value) throws Throwable;
private static native java.lang.Exception __call1077400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077403_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077404_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077405_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077406_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077407_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077408_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077409_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077410_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077411_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077412_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077413_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077414_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077415_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077416_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077417_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.util.Map __sourceHandlerCall_50fdca2e56c2d8bf7751(net.minecraft.client.resources.IResourcePack a0, java.lang.String a1, int a2) throws E;
private static final class __SourceHandler_50fdca2e56c2d8bf7751 {

public static java.util.Map f94(net.minecraft.client.resources.IResourcePack p0, java.lang.String p1, int p2) throws Throwable {
    net.minecraft.entity.Entity[] spill94_0;
    java.lang.String[] spill94_1;
    java.lang.String[] spill94_2;
    int spill94_3;
    java.lang.String[] spill94_4;
    java.lang.String[] spill94_5;
    int spill94_6;
    java.lang.String[] spill94_7;
    long life3_3;
    java.util.HashMap life6_7;
    java.lang.String life7_10;
    java.lang.String[] life8_36;
    java.lang.String[] life9_47;
    java.lang.String[] life10_52;
    net.minecraft.entity.Entity[] life5_53;
    java.lang.String[] life11_55;
    int life12_58;
    int life13_60;
    java.lang.String life14_67;
    java.lang.String life15_72;
    java.util.Properties life16_78;
    java.lang.String life17_95;
    moom.Jv life18_101;
    lexical_join_107: {
    life3_3 = (__fieldRead94_0() ^ 45397803756884L);
    life6_7 = new java.util.HashMap();
    life7_10 = __invokedynamic94_1(p1);
    spill94_0 = __call94_2();
    java.lang.String[] __stackOp94_3_0 = new java.lang.String[2];
    spill94_1 = __stackOp94_3_0;
    spill94_2 = __stackOp94_3_0;
    spill94_3 = 0;
    java.lang.String __stackOp94_5_0 = life7_10;
    java.lang.String __stackOp94_5_1 = __invokedynamic94_4(3638, (4466867287916470141L ^ life3_3));
    (spill94_2)[spill94_3] = __invokedynamic94_6(__stackOp94_5_1, __stackOp94_5_0);
    java.lang.String[] __stackOp94_7_0 = spill94_1;
    spill94_4 = __stackOp94_7_0;
    spill94_5 = __stackOp94_7_0;
    spill94_6 = 1;
    java.lang.String __stackOp94_9_0 = life7_10;
    java.lang.String __stackOp94_9_1 = __invokedynamic94_8(28883, (8129173939926213075L ^ life3_3));
    (spill94_5)[spill94_6] = __invokedynamic94_10(__stackOp94_9_1, __stackOp94_9_0);
    life8_36 = spill94_4;
    java.lang.String[] __stackOp94_11_0 = new java.lang.String[1];
    spill94_7 = __stackOp94_11_0;
    (__stackOp94_11_0)[0] = __invokedynamic94_12(7651, (1152521786079726808L ^ life3_3));
    life9_47 = spill94_7;
    life10_52 = __call94_13(p0, life8_36, life9_47);
    life5_53 = spill94_0;
    life11_55 = life10_52;
    life12_58 = (life11_55).length;
    life13_60 = 0;
    lexical_cycle_61: while (true) {
    lexical_join_105: {
    lexical_join_104: {
    if (!((life13_60 < life12_58))) {
        break lexical_join_107;
    }
    life14_67 = (life11_55)[life13_60];
    life15_72 = __call94_14(life14_67, life8_36, life9_47);
    life16_78 = __call94_15(life15_72, p1, p2, life14_67);
    if (!((life5_53 != null))) {
        break lexical_join_105;
    }
    if (!((life16_78 != null))) {
        break lexical_join_104;
    }
    life17_95 = __invokedynamic94_18(__call94_16(life14_67, life9_47), __invokedynamic94_17(31086, (4659854194004371580L ^ life3_3)));
    life18_101 = new moom.Jv(life16_78, life17_95);
    __call94_19(life6_7, life17_95, life18_101);
    }
    life13_60 += 1;
    }
    if (!((life5_53 == null))) { continue lexical_cycle_61; }
    break lexical_cycle_61;
    }
    }
    return life6_7;
}
public static void h94_0(moom.Oo p0) throws Throwable {
    throw __call1009400_0(p0);
}
private static native long __fieldRead94_0() throws Throwable;
private static native java.lang.String __invokedynamic94_1(java.lang.String a0) throws Throwable;
private static native net.minecraft.entity.Entity[] __call94_2() throws Throwable;
private static native java.lang.String __invokedynamic94_4(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic94_6(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic94_8(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic94_10(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic94_12(int a0, long a1) throws Throwable;
private static native java.lang.String[] __call94_13(net.minecraft.client.resources.IResourcePack a0, java.lang.String[] a1, java.lang.String[] a2) throws Throwable;
private static native java.lang.String __call94_14(java.lang.String a0, java.lang.String[] a1, java.lang.String[] a2) throws Throwable;
private static native java.util.Properties __call94_15(java.lang.String a0, java.lang.String a1, int a2, java.lang.String a3) throws Throwable;
private static native java.lang.String __call94_16(java.lang.String a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.String __invokedynamic94_17(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic94_18(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call94_19(java.util.HashMap a0, java.lang.String a1, moom.Jv a2) throws Throwable;
private static native java.lang.Exception __call1009400_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_0e73f114758346234932(net.minecraft.entity.EntityLivingBase a0, net.minecraft.item.ItemStack a1, moom.iQ a2, float a3, float a4, float a5, float a6, float a7, float a8, float a9) throws E;
private static final class __SourceHandler_0e73f114758346234932 {

public static boolean f775(net.minecraft.entity.EntityLivingBase p0, net.minecraft.item.ItemStack p1, moom.iQ p2, float p3, float p4, float p5, float p6, float p7, float p8, float p9) throws Throwable {
    int lexicalValue775_15_0;
    int lexicalValue775_19_0;
    net.minecraft.item.ItemStack lexicalValue775_27_0;
    int lexicalValue775_35_0;
    java.util.HashSet lexicalValue775_103_0;
    int lexicalValue775_115_0;
    moom.Jv lexicalValue775_117_0;
    moom.Jv lexicalValue775_126_0;
    int lexicalValue775_148_0;
    int lexicalValue775_159_0;
    int lexicalValue775_219_0;
    int lexicalValue775_269_0;
    boolean spill775_0;
    net.minecraft.item.ItemStack spill775_1;
    int spill775_2;
    int spill775_3;
    java.util.HashSet spill775_4;
    boolean spill775_5;
    moom.Jv spill775_6;
    int spill775_7;
    boolean spill775_8;
    int spill775_9;
    int spill775_10;
    long spill775_11;
    int spill775_12;
    int spill775_13;
    int spill775_14;
    int spill775_15;
    long spill775_16;
    boolean spill775_17;
    long life10_3;
    net.minecraft.entity.Entity[] life12_5;
    int[][] life13_41;
    java.util.HashSet life14_53;
    int life15_55;
    net.minecraft.client.renderer.texture.TextureManager life16_57;
    int[][] life17_59;
    int life18_62;
    int life19_64;
    int[] life20_71;
    int life21_75;
    moom.Jv[] life22_98;
    moom.Jv[] life23_107;
    int life24_110;
    int life25_112;
    moom.Jv life26_119;
    float life27_177;
    float life28_229;
    float life29_251;
    lexical_join_269: {
    lexical_join_268: {
    lexical_join_219: {
    lexical_join_218: {
    lexical_join_36: {
    lexical_join_35: {
    lexical_join_27: {
    lexical_join_26: {
    lexical_join_20: {
    lexical_join_19: {
    lexical_join_15: {
    lexical_join_10: {
    life10_3 = (__fieldRead775_0() ^ 83369575191664L);
    life12_5 = __call775_1();
    if (!((__fieldRead775_2() == null))) {
        break lexical_join_10;
    }
    return __integerCategory775_3(0);
    }
    spill775_0 = __call775_4();
    if (!((life12_5 != null))) {
        lexicalValue775_15_0 = __integerCategory775_5(spill775_0);
        break lexical_join_15;
    }
    if (!(spill775_0)) {
        break lexical_join_20;
    }
    lexicalValue775_15_0 = __integerCategory775_7(__fieldRead775_6());
    }
    if (!((life12_5 != null))) {
        lexicalValue775_19_0 = lexicalValue775_15_0;
        break lexical_join_19;
    }
    if (!((lexicalValue775_15_0 != 0))) {
        break lexical_join_20;
    }
    lexicalValue775_19_0 = 0;
    }
    return __integerCategory775_8(lexicalValue775_19_0);
    }
    spill775_1 = p1;
    if (!((life12_5 != null))) {
        lexicalValue775_27_0 = spill775_1;
        break lexical_join_27;
    }
    if (!((spill775_1 == null))) {
        break lexical_join_26;
    }
    return __integerCategory775_9(0);
    }
    lexicalValue775_27_0 = p1;
    }
    life13_41 = __call775_10(lexicalValue775_27_0);
    spill775_2 = (life13_41).length;
    if (!((life12_5 != null))) {
        lexicalValue775_35_0 = spill775_2;
        break lexical_join_35;
    }
    if (!((spill775_2 == 0))) {
        break lexical_join_36;
    }
    lexicalValue775_35_0 = 0;
    }
    return __integerCategory775_11(lexicalValue775_35_0);
    }
    life14_53 = null;
    life15_55 = 0;
    life16_57 = __call775_12();
    life17_59 = life13_41;
    life18_62 = (life17_59).length;
    life19_64 = 0;
    lexical_cycle_49: while (true) {
    lexical_join_216: {
    lexical_join_215: {
    if (!((life19_64 < life18_62))) {
        break lexical_join_218;
    }
    life20_71 = (life17_59)[life19_64];
    life21_75 = (life20_71)[0];
    if (!((life12_5 != null))) {
        break lexical_join_216;
    }
    spill775_3 = life21_75;
    if (!((life12_5 != null))) {
        lexicalValue775_219_0 = spill775_3;
        break lexical_join_219;
    }
    if (!((spill775_3 >= 0))) {
        break lexical_join_215;
    }
    if (!((life21_75 < (__fieldRead775_13()).length))) {
        break lexical_join_215;
    }
    life22_98 = (__fieldRead775_14())[life21_75];
    if (!((life12_5 != null))) {
        break lexical_join_216;
    }
    if (!((life22_98 != null))) {
        break lexical_join_215;
    }
    life23_107 = life22_98;
    life24_110 = (life23_107).length;
    life25_112 = 0;
    lexical_cycle_85: while (true) {
    lexical_join_212: {
    lexical_join_159: {
    lexical_join_149: {
    lexical_join_148: {
    lexical_join_140: {
    lexical_join_126: {
    lexical_join_117: {
    lexical_join_115: {
    lexical_join_103: {
    lexical_join_102: {
    if (!((life25_112 < life24_110))) {
        break lexical_join_215;
    }
    life26_119 = (life23_107)[life25_112];
    if (!((life12_5 != null))) {
        break lexical_join_216;
    }
    spill775_4 = life14_53;
    if (!((life12_5 != null))) {
        lexicalValue775_103_0 = spill775_4;
        break lexical_join_103;
    }
    if (!((spill775_4 == null))) {
        break lexical_join_102;
    }
    life14_53 = new java.util.HashSet();
    }
    lexicalValue775_103_0 = life14_53;
    }
    spill775_5 = __call775_16(lexicalValue775_103_0, __call775_15(life21_75));
    if (!((life12_5 != null))) {
        lexicalValue775_115_0 = __integerCategory775_17(spill775_5);
        break lexical_join_115;
    }
    if (!(spill775_5)) {
        break lexical_join_212;
    }
    spill775_6 = life26_119;
    if (!((life12_5 != null))) {
        lexicalValue775_117_0 = spill775_6;
        break lexical_join_117;
    }
    lexicalValue775_115_0 = __integerCategory775_19(__call775_18(spill775_6, p1, life13_41));
    }
    if (!((lexicalValue775_115_0 != 0))) {
        break lexical_join_212;
    }
    lexicalValue775_117_0 = life26_119;
    }
    if (!((life12_5 != null))) {
        lexicalValue775_126_0 = lexicalValue775_117_0;
        break lexical_join_126;
    }
    if (!((__fieldRead775_20(lexicalValue775_117_0) != null))) {
        break lexical_join_212;
    }
    __call775_22(life16_57, __fieldRead775_21(life26_119));
    lexicalValue775_126_0 = life26_119;
    }
    life27_177 = __call775_23(lexicalValue775_126_0, life16_57);
    spill775_7 = life15_55;
    if (!((life12_5 != null))) {
        lexicalValue775_159_0 = spill775_7;
        break lexical_join_159;
    }
    if (!((spill775_7 == 0))) {
        break lexical_join_149;
    }
    life15_55 = 1;
    spill775_8 = __call775_24();
    if (!((life12_5 != null))) {
        lexicalValue775_148_0 = __integerCategory775_25(spill775_8);
        break lexical_join_148;
    }
    if (!(spill775_8)) {
        break lexical_join_140;
    }
    __call775_26();
    }
    __call775_27();
    __call775_29(__invokedynamic775_28(26812, (1772540048454547226L ^ life10_3)));
    lexicalValue775_148_0 = 0;
    }
    __call775_30(lexicalValue775_148_0);
    }
    __call775_32(__fieldRead775_31(life26_119), 0x1.0p0f);
    spill775_9 = 27328;
    __call775_33();
    lexicalValue775_159_0 = __invokedynamic775_34(spill775_9, (6741291038117885293L ^ life10_3));
    }
    __call775_35(lexicalValue775_159_0);
    spill775_10 = 23590;
    __call775_36();
    spill775_11 = (7805465263878816646L ^ life10_3);
    __call775_38(__fieldRead775_37(life26_119), 0x0.0p0f, 0x0.0p0f, 0x1.0p0f);
    life28_229 = (life27_177 / 0x1.0p3f);
    __call775_39(life28_229, (life28_229 / 0x1.0p1f), life28_229);
    life29_251 = (((__fieldRead775_40(life26_119) * ((float) (__call775_41() % __invokedynamic775_42(31590, (8315696562550841442L ^ life10_3))))) / 0x1.77p11f) / 0x1.0p3f);
    __call775_43(0x0.0p0f, life29_251, 0x0.0p0f);
    __call775_45(__invokedynamic775_44(spill775_10, spill775_11));
    __call775_46(p2, p0, p3, p4, p6, p7, p8, p9);
    }
    life25_112 += 1;
    if (!((life12_5 == null))) { continue lexical_cycle_85; }
    break lexical_cycle_85;
    }
    }
    life19_64 += 1;
    }
    if (!((life12_5 == null))) { continue lexical_cycle_49; }
    break lexical_cycle_49;
    }
    }
    lexicalValue775_219_0 = life15_55;
    }
    if (!((life12_5 != null))) {
        lexicalValue775_269_0 = lexicalValue775_219_0;
        break lexical_join_269;
    }
    if (!((lexicalValue775_219_0 != 0))) {
        break lexical_join_268;
    }
    __call775_47();
    spill775_12 = 16307;
    __call775_48();
    __call775_51(__invokedynamic775_49(spill775_12, (2678247905561223177L ^ life10_3)), __invokedynamic775_50(11318, (1027382641260999575L ^ life10_3)));
    spill775_13 = 27328;
    __call775_52(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    __call775_54(__invokedynamic775_53(spill775_13, (6741291038117885293L ^ life10_3)));
    spill775_14 = 23590;
    __call775_55();
    __call775_57(__invokedynamic775_56(spill775_14, (7805465263878816646L ^ life10_3)));
    spill775_15 = 18348;
    __call775_58();
    spill775_16 = (3726941492137908250L ^ life10_3);
    __call775_59(1);
    __call775_61(__invokedynamic775_60(spill775_15, spill775_16));
    __call775_62();
    spill775_17 = __call775_63();
    if (!((life12_5 != null))) {
        lexicalValue775_269_0 = __integerCategory775_64(spill775_17);
        break lexical_join_269;
    }
    if (!(spill775_17)) {
        break lexical_join_268;
    }
    __call775_65();
    }
    lexicalValue775_269_0 = life15_55;
    }
    return __integerCategory775_66(lexicalValue775_269_0);
}
public static void h775_0(moom.Oo p0) throws Throwable {
    throw __call1077500_0(p0);
}
public static void h775_1(moom.Oo p0) throws Throwable {
    throw __call1077501_0(p0);
}
public static void h775_2(moom.Oo p0) throws Throwable {
    throw __call1077502_0(p0);
}
public static void h775_3(moom.Oo p0) throws Throwable {
    throw __call1077503_0(p0);
}
public static void h775_4(moom.Oo p0) throws Throwable {
    throw __call1077504_0(p0);
}
public static void h775_5(moom.Oo p0) throws Throwable {
    throw __call1077505_0(p0);
}
public static void h775_6(moom.Oo p0) throws Throwable {
    throw __call1077506_0(p0);
}
public static void h775_7(moom.Oo p0) throws Throwable {
    throw __call1077507_0(p0);
}
public static void h775_8(moom.Oo p0) throws Throwable {
    throw __call1077508_0(p0);
}
public static void h775_9(moom.Oo p0) throws Throwable {
    throw __call1077509_0(p0);
}
public static void h775_10(moom.Oo p0) throws Throwable {
    throw __call1077510_0(p0);
}
public static void h775_11(moom.Oo p0) throws Throwable {
    throw __call1077511_0(p0);
}
public static void h775_12(moom.Oo p0) throws Throwable {
    throw __call1077512_0(p0);
}
public static void h775_13(moom.Oo p0) throws Throwable {
    throw __call1077513_0(p0);
}
public static void h775_14(moom.Oo p0) throws Throwable {
    throw __call1077514_0(p0);
}
public static void h775_15(moom.Oo p0) throws Throwable {
    throw __call1077515_0(p0);
}
public static void h775_16(moom.Oo p0) throws Throwable {
    throw __call1077516_0(p0);
}
public static void h775_17(moom.Oo p0) throws Throwable {
    throw __call1077517_0(p0);
}
public static void h775_18(moom.Oo p0) throws Throwable {
    throw __call1077518_0(p0);
}
public static void h775_19(moom.Oo p0) throws Throwable {
    throw __call1077519_0(p0);
}
public static void h775_20(moom.Oo p0) throws Throwable {
    throw __call1077520_0(p0);
}
public static void h775_21(moom.Oo p0) throws Throwable {
    throw __call1077521_0(p0);
}
private static native long __fieldRead775_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call775_1() throws Throwable;
private static native moom.Jv[][] __fieldRead775_2() throws Throwable;
private static native boolean __integerCategory775_3(int value) throws Throwable;
private static native boolean __call775_4() throws Throwable;
private static native int __integerCategory775_5(boolean value) throws Throwable;
private static native boolean __fieldRead775_6() throws Throwable;
private static native int __integerCategory775_7(boolean value) throws Throwable;
private static native boolean __integerCategory775_8(int value) throws Throwable;
private static native boolean __integerCategory775_9(int value) throws Throwable;
private static native int[][] __call775_10(net.minecraft.item.ItemStack a0) throws Throwable;
private static native boolean __integerCategory775_11(int value) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call775_12() throws Throwable;
private static native moom.Jv[][] __fieldRead775_13() throws Throwable;
private static native moom.Jv[][] __fieldRead775_14() throws Throwable;
private static native java.lang.Integer __call775_15(int a0) throws Throwable;
private static native boolean __call775_16(java.util.HashSet a0, java.lang.Integer a1) throws Throwable;
private static native int __integerCategory775_17(boolean value) throws Throwable;
private static native boolean __call775_18(moom.Jv a0, net.minecraft.item.ItemStack a1, int[][] a2) throws Throwable;
private static native int __integerCategory775_19(boolean value) throws Throwable;
private static native moom.DD __fieldRead775_20(moom.Jv a0) throws Throwable;
private static native moom.DD __fieldRead775_21(moom.Jv a0) throws Throwable;
private static native void __call775_22(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native float __call775_23(moom.Jv a0, net.minecraft.client.renderer.texture.TextureManager a1) throws Throwable;
private static native boolean __call775_24() throws Throwable;
private static native int __integerCategory775_25(boolean value) throws Throwable;
private static native void __call775_26() throws Throwable;
private static native void __call775_27() throws Throwable;
private static native int __invokedynamic775_28(int a0, long a1) throws Throwable;
private static native void __call775_29(int a0) throws Throwable;
private static native void __call775_30(int a0) throws Throwable;
private static native int __fieldRead775_31(moom.Jv a0) throws Throwable;
private static native void __call775_32(int a0, float a1) throws Throwable;
private static native void __call775_33() throws Throwable;
private static native int __invokedynamic775_34(int a0, long a1) throws Throwable;
private static native void __call775_35(int a0) throws Throwable;
private static native void __call775_36() throws Throwable;
private static native float __fieldRead775_37(moom.Jv a0) throws Throwable;
private static native void __call775_38(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call775_39(float a0, float a1, float a2) throws Throwable;
private static native float __fieldRead775_40(moom.Jv a0) throws Throwable;
private static native long __call775_41() throws Throwable;
private static native long __invokedynamic775_42(int a0, long a1) throws Throwable;
private static native void __call775_43(float a0, float a1, float a2) throws Throwable;
private static native int __invokedynamic775_44(int a0, long a1) throws Throwable;
private static native void __call775_45(int a0) throws Throwable;
private static native void __call775_46(moom.iQ a0, net.minecraft.entity.EntityLivingBase a1, float a2, float a3, float a4, float a5, float a6, float a7) throws Throwable;
private static native void __call775_47() throws Throwable;
private static native void __call775_48() throws Throwable;
private static native int __invokedynamic775_49(int a0, long a1) throws Throwable;
private static native int __invokedynamic775_50(int a0, long a1) throws Throwable;
private static native void __call775_51(int a0, int a1) throws Throwable;
private static native void __call775_52(float a0, float a1, float a2, float a3) throws Throwable;
private static native int __invokedynamic775_53(int a0, long a1) throws Throwable;
private static native void __call775_54(int a0) throws Throwable;
private static native void __call775_55() throws Throwable;
private static native int __invokedynamic775_56(int a0, long a1) throws Throwable;
private static native void __call775_57(int a0) throws Throwable;
private static native void __call775_58() throws Throwable;
private static native void __call775_59(int a0) throws Throwable;
private static native int __invokedynamic775_60(int a0, long a1) throws Throwable;
private static native void __call775_61(int a0) throws Throwable;
private static native void __call775_62() throws Throwable;
private static native boolean __call775_63() throws Throwable;
private static native int __integerCategory775_64(boolean value) throws Throwable;
private static native void __call775_65() throws Throwable;
private static native boolean __integerCategory775_66(int value) throws Throwable;
private static native java.lang.Exception __call1077500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077504_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077505_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077506_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077507_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077508_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077509_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077510_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077511_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077512_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077513_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077514_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077515_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077516_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077517_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077518_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077519_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077520_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077521_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int[][] __sourceHandlerCall_9b1d1ed9beb93b45bdf7(net.minecraft.item.ItemStack a0) throws E;
private static final class __SourceHandler_9b1d1ed9beb93b45bdf7 {

public static int[][] f100089(net.minecraft.item.ItemStack p0) throws Throwable {
    net.minecraft.nbt.NBTTagList forestValue100089_18_0;
    net.minecraft.nbt.NBTTagList forestValue100089_24_0;
    int forestValue100089_30_0;
    int[][] forestValue100089_77_0;
    net.minecraft.entity.Entity[] spill100089_0;
    net.minecraft.nbt.NBTTagList spill100089_1;
    int spill100089_2;
    int[][] spill100089_3;
    long life1_3;
    net.minecraft.item.Item life4_7;
    net.minecraft.entity.Entity[] life3_8;
    net.minecraft.nbt.NBTTagList life5_18;
    int[][] life6_35;
    int life7_37;
    net.minecraft.nbt.NBTTagCompound life8_45;
    int life9_53;
    int life10_61;
    forest_join_78: {
    forest_join_77: {
    forest_join_76: {
    forest_join_30: {
    forest_join_24: {
    forest_join_18: {
    forest_join_16: {
    life1_3 = (__fieldRead100089_0() ^ 12066708245421L);
    spill100089_0 = __call100089_1();
    life4_7 = __call100089_2(p0);
    life3_8 = spill100089_0;
    if (!((life4_7 == __fieldRead100089_3()))) {
        break forest_join_16;
    }
    forestValue100089_18_0 = __call100089_5(__fieldRead100089_4(), p0);
    break forest_join_18;
    }
    forestValue100089_18_0 = __call100089_6(p0);
    }
    life5_18 = forestValue100089_18_0;
    spill100089_1 = life5_18;
    if (!((life3_8 != null))) {
        forestValue100089_24_0 = spill100089_1;
        break forest_join_24;
    }
    if (!((spill100089_1 != null))) {
        break forest_join_78;
    }
    forestValue100089_24_0 = life5_18;
    }
    spill100089_2 = __call100089_7(forestValue100089_24_0);
    if (!((life3_8 != null))) {
        forestValue100089_30_0 = spill100089_2;
        break forest_join_30;
    }
    if (!((spill100089_2 > 0))) {
        break forest_join_78;
    }
    forestValue100089_30_0 = __call100089_8(life5_18);
    }
    life6_35 = __call100089_9(forestValue100089_30_0, 2);
    life7_37 = 0;
    forest_cycle_35: while (true) {
    if (!((life7_37 < __call100089_10(life5_18)))) {
        break forest_join_76;
    }
    life8_45 = __call100089_11(life5_18, life7_37);
    life9_53 = __call100089_13(life8_45, __invokedynamic100089_12(8558, (504641078841792189L ^ life1_3)));
    life10_61 = __call100089_15(life8_45, __invokedynamic100089_14(27847, (3396691797843483452L ^ life1_3)));
    ((life6_35)[life7_37])[0] = life9_53;
    spill100089_3 = life6_35;
    if (!((life3_8 != null))) {
        forestValue100089_77_0 = spill100089_3;
        break forest_join_77;
    }
    ((spill100089_3)[life7_37])[1] = life10_61;
    life7_37 += 1;
    if (!((life3_8 == null))) {
        continue forest_cycle_35;
    }
    break forest_cycle_35;
    }
    }
    forestValue100089_77_0 = life6_35;
    }
    return forestValue100089_77_0;
    }
    return __fieldRead100089_16();
}
public static int[][] h100089_0(moom.Oo p0) throws Throwable {
    throw __call13008900_0(p0);
}
public static int[][] h100089_1(moom.Oo p0) throws Throwable {
    throw __call13008901_0(p0);
}
public static int[][] h100089_2(moom.Oo p0) throws Throwable {
    throw __call13008902_0(p0);
}
public static int[][] h100089_3(moom.Oo p0) throws Throwable {
    throw __call13008903_0(p0);
}
public static int[][] h100089_4(moom.Oo p0) throws Throwable {
    throw __call13008904_0(p0);
}
private static native long __fieldRead100089_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call100089_1() throws Throwable;
private static native net.minecraft.item.Item __call100089_2(net.minecraft.item.ItemStack a0) throws Throwable;
private static native moom.xg __fieldRead100089_3() throws Throwable;
private static native moom.xg __fieldRead100089_4() throws Throwable;
private static native net.minecraft.nbt.NBTTagList __call100089_5(moom.xg a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __call100089_6(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call100089_7(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native int __call100089_8(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native int[][] __call100089_9(int a0, int a1) throws Throwable;
private static native int __call100089_10(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call100089_11(net.minecraft.nbt.NBTTagList a0, int a1) throws Throwable;
private static native java.lang.String __invokedynamic100089_12(int a0, long a1) throws Throwable;
private static native short __call100089_13(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic100089_14(int a0, long a1) throws Throwable;
private static native short __call100089_15(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int[][] __fieldRead100089_16() throws Throwable;
private static native java.lang.Exception __call13008900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13008901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13008902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13008903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13008904_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.Jv __sourceHandlerCall_3ba492333b96f08e7c97(net.minecraft.item.ItemStack a0, int a1) throws E;
private static final class __SourceHandler_3ba492333b96f08e7c97 {

public static moom.Jv f777(net.minecraft.item.ItemStack p0, int p1) throws Throwable {
    net.minecraft.item.ItemStack lexicalValue777_17_0;
    int lexicalValue777_27_0;
    moom.Jv[] lexicalValue777_39_0;
    moom.Jv lexicalValue777_66_0;
    net.minecraft.item.ItemStack spill777_0;
    int spill777_1;
    moom.Jv[] spill777_2;
    moom.Jv spill777_3;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    net.minecraft.item.Item life5_25;
    int life6_28;
    moom.Jv[] life7_43;
    moom.Jv[] life8_52;
    int life9_55;
    int life10_57;
    moom.Jv life11_64;
    lexical_join_70: {
    lexical_join_39: {
    lexical_join_27: {
    lexical_join_17: {
    lexical_join_16: {
    lexical_join_10: {
    life2_3 = (__fieldRead777_0() ^ 20662153540356L);
    life4_5 = __call777_1();
    if (!((__fieldRead777_2() == null))) {
        break lexical_join_10;
    }
    return null;
    }
    spill777_0 = p0;
    if (!((life4_5 != null))) {
        lexicalValue777_17_0 = spill777_0;
        break lexical_join_17;
    }
    if (!((spill777_0 == null))) {
        break lexical_join_16;
    }
    return null;
    }
    lexicalValue777_17_0 = p0;
    }
    life5_25 = __call777_3(lexicalValue777_17_0);
    life6_28 = __call777_4(life5_25);
    spill777_1 = life6_28;
    if (!((life4_5 != null))) {
        lexicalValue777_27_0 = spill777_1;
        break lexical_join_27;
    }
    if (!((spill777_1 >= 0))) {
        break lexical_join_70;
    }
    lexicalValue777_27_0 = life6_28;
    }
    if (!((lexicalValue777_27_0 < (__fieldRead777_5()).length))) {
        break lexical_join_70;
    }
    life7_43 = (__fieldRead777_6())[life6_28];
    spill777_2 = life7_43;
    if (!((life4_5 != null))) {
        lexicalValue777_39_0 = spill777_2;
        break lexical_join_39;
    }
    if (!((spill777_2 != null))) {
        break lexical_join_70;
    }
    lexicalValue777_39_0 = life7_43;
    }
    life8_52 = lexicalValue777_39_0;
    life9_55 = (life8_52).length;
    life10_57 = 0;
    lexical_cycle_45: while (true) {
    lexical_join_68: {
    lexical_join_67: {
    lexical_join_66: {
    if (!((life10_57 < life9_55))) {
        break lexical_join_70;
    }
    life11_64 = (life8_52)[life10_57];
    if (!((life4_5 != null))) {
        break lexical_join_68;
    }
    if (!((__fieldRead777_7(life11_64) == p1))) {
        break lexical_join_67;
    }
    spill777_3 = life11_64;
    if (!((life4_5 != null))) {
        lexicalValue777_66_0 = spill777_3;
        break lexical_join_66;
    }
    if (!(__call777_8(spill777_3, p0, null))) {
        break lexical_join_67;
    }
    lexicalValue777_66_0 = life11_64;
    }
    return lexicalValue777_66_0;
    }
    life10_57 += 1;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_45; }
    break lexical_cycle_45;
    }
    }
    return null;
}
public static void h777_0(moom.Oo p0) throws Throwable {
    throw __call1077700_0(p0);
}
public static void h777_1(moom.Oo p0) throws Throwable {
    throw __call1077701_0(p0);
}
public static void h777_2(moom.Oo p0) throws Throwable {
    throw __call1077702_0(p0);
}
public static void h777_3(moom.Oo p0) throws Throwable {
    throw __call1077703_0(p0);
}
public static void h777_4(moom.Oo p0) throws Throwable {
    throw __call1077704_0(p0);
}
public static void h777_5(moom.Oo p0) throws Throwable {
    throw __call1077705_0(p0);
}
public static void h777_6(moom.Oo p0) throws Throwable {
    throw __call1077706_0(p0);
}
public static void h777_7(moom.Oo p0) throws Throwable {
    throw __call1077707_0(p0);
}
public static void h777_8(moom.Oo p0) throws Throwable {
    throw __call1077708_0(p0);
}
private static native long __fieldRead777_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call777_1() throws Throwable;
private static native moom.Jv[][] __fieldRead777_2() throws Throwable;
private static native net.minecraft.item.Item __call777_3(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call777_4(net.minecraft.item.Item a0) throws Throwable;
private static native moom.Jv[][] __fieldRead777_5() throws Throwable;
private static native moom.Jv[][] __fieldRead777_6() throws Throwable;
private static native int __fieldRead777_7(moom.Jv a0) throws Throwable;
private static native boolean __call777_8(moom.Jv a0, net.minecraft.item.ItemStack a1, java.lang.Object a2) throws Throwable;
private static native java.lang.Exception __call1077700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077703_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077704_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077705_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077706_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077707_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077708_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.DD __sourceHandlerCall_4edbc7ce132e487fac8b(net.minecraft.item.ItemStack a0, int a1, java.lang.String a2) throws E;
private static final class __SourceHandler_4edbc7ce132e487fac8b {

public static moom.DD f778(net.minecraft.item.ItemStack p0, int p1, java.lang.String p2) throws Throwable {
    moom.Jv forwardValue778_17_0;
    moom.Jv forwardValue778_22_0;
    net.minecraft.item.Item forwardValue778_33_0;
    java.lang.String forwardValue778_85_0;
    moom.DD forwardValue778_98_0;
    moom.DD forwardValue778_100_0;
    net.minecraft.entity.Entity[] spill778_0;
    moom.Jv spill778_1;
    net.minecraft.item.Item spill778_2;
    java.lang.String spill778_3;
    moom.DD spill778_4;
    long life3_3;
    moom.Jv life6_8;
    net.minecraft.entity.Entity[] life5_9;
    net.minecraft.item.Item life7_37;
    net.minecraft.item.ItemArmor life8_51;
    java.lang.String life9_61;
    java.lang.StringBuilder life10_65;
    java.lang.String life11_110;
    moom.DD life12_116;
    forward_join_100: {
    forward_join_99: {
    forward_join_98: {
    forward_join_85: {
    forward_join_83: {
    forward_join_39: {
    forward_join_37: {
    forward_join_33: {
    forward_join_24: {
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life3_3 = (__fieldRead778_0() ^ 134886327327133L);
    spill778_0 = __call778_1();
    life6_8 = __call778_2(p0, 3);
    life5_9 = spill778_0;
    spill778_1 = life6_8;
    if (!((life5_9 != null))) {
        forwardValue778_17_0 = spill778_1;
        break forward_join_17;
    }
    if (!((spill778_1 == null))) {
        break forward_join_16;
    }
    return null;
    }
    forwardValue778_17_0 = life6_8;
    }
    if (!((life5_9 != null))) {
        forwardValue778_22_0 = forwardValue778_17_0;
        break forward_join_22;
    }
    if (!((__fieldRead778_3(forwardValue778_17_0) == null))) {
        break forward_join_24;
    }
    forwardValue778_22_0 = life6_8;
    }
    return __fieldRead778_4(forwardValue778_22_0);
    }
    life7_37 = __call778_5(p0);
    spill778_2 = life7_37;
    if (!((life5_9 != null))) {
        forwardValue778_33_0 = spill778_2;
        break forward_join_33;
    }
    if (!((__instanceOf778_6(spill778_2) != 0))) {
        break forward_join_37;
    }
    forwardValue778_33_0 = life7_37;
    }
    life8_51 = __cast778_7(forwardValue778_33_0);
    if (!((life5_9 == null))) {
        break forward_join_39;
    }
    }
    return null;
    }
    life9_61 = __call778_9(__call778_8(life8_51));
    life10_65 = new java.lang.StringBuilder();
    __call778_11(life10_65, __invokedynamic778_10(25610, (575874802570117594L ^ life3_3)));
    __call778_12(life10_65, life9_61);
    __call778_14(life10_65, __invokedynamic778_13(10958, (4077354596581281545L ^ life3_3)));
    __call778_15(life10_65, p1);
    spill778_3 = p2;
    if (!((life5_9 != null))) {
        forwardValue778_85_0 = spill778_3;
        break forward_join_85;
    }
    if (!((spill778_3 != null))) {
        break forward_join_83;
    }
    __call778_16(life10_65, "_");
    __call778_17(life10_65, p2);
    }
    forwardValue778_85_0 = __call778_18(life10_65);
    }
    life11_110 = forwardValue778_85_0;
    life12_116 = __cast778_21(__call778_20(__fieldRead778_19(life6_8), life11_110));
    spill778_4 = life12_116;
    if (!((life5_9 != null))) {
        forwardValue778_98_0 = spill778_4;
        break forward_join_98;
    }
    if (!((spill778_4 == null))) {
        break forward_join_99;
    }
    forwardValue778_98_0 = __fieldRead778_22(life6_8);
    }
    forwardValue778_100_0 = forwardValue778_98_0;
    break forward_join_100;
    }
    forwardValue778_100_0 = life12_116;
    }
    return forwardValue778_100_0;
}
public static void h778_0(moom.Oo p0) throws Throwable {
    throw __call1077800_0(p0);
}
public static void h778_1(moom.Oo p0) throws Throwable {
    throw __call1077801_0(p0);
}
public static void h778_2(moom.Oo p0) throws Throwable {
    throw __call1077802_0(p0);
}
public static void h778_3(moom.Oo p0) throws Throwable {
    throw __call1077803_0(p0);
}
public static void h778_4(moom.Oo p0) throws Throwable {
    throw __call1077804_0(p0);
}
public static void h778_5(moom.Oo p0) throws Throwable {
    throw __call1077805_0(p0);
}
public static void h778_6(moom.Oo p0) throws Throwable {
    throw __call1077806_0(p0);
}
public static void h778_7(moom.Oo p0) throws Throwable {
    throw __call1077807_0(p0);
}
public static void h778_8(moom.Oo p0) throws Throwable {
    throw __call1077808_0(p0);
}
public static void h778_9(moom.Oo p0) throws Throwable {
    throw __call1077809_0(p0);
}
public static void h778_10(moom.Oo p0) throws Throwable {
    throw __call1077810_0(p0);
}
private static native long __fieldRead778_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call778_1() throws Throwable;
private static native moom.Jv __call778_2(net.minecraft.item.ItemStack a0, int a1) throws Throwable;
private static native java.util.Map __fieldRead778_3(moom.Jv a0) throws Throwable;
private static native moom.DD __fieldRead778_4(moom.Jv a0) throws Throwable;
private static native net.minecraft.item.Item __call778_5(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __instanceOf778_6(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.ItemArmor __cast778_7(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.ItemArmor$ArmorMaterial __call778_8(net.minecraft.item.ItemArmor a0) throws Throwable;
private static native java.lang.String __call778_9(net.minecraft.item.ItemArmor$ArmorMaterial a0) throws Throwable;
private static native java.lang.String __invokedynamic778_10(int a0, long a1) throws Throwable;
private static native java.lang.StringBuilder __call778_11(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call778_12(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic778_13(int a0, long a1) throws Throwable;
private static native java.lang.StringBuilder __call778_14(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call778_15(java.lang.StringBuilder a0, int a1) throws Throwable;
private static native java.lang.StringBuilder __call778_16(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call778_17(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call778_18(java.lang.StringBuilder a0) throws Throwable;
private static native java.util.Map __fieldRead778_19(moom.Jv a0) throws Throwable;
private static native java.lang.Object __call778_20(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native moom.DD __cast778_21(java.lang.Object a0) throws Throwable;
private static native moom.DD __fieldRead778_22(moom.Jv a0) throws Throwable;
private static native java.lang.Exception __call1077800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077804_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077805_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077806_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077807_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077808_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077809_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077810_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.client.resources.model.IBakedModel __sourceHandlerCall_4dd679f30d3cdab50d5d(net.minecraft.item.ItemStack a0, net.minecraft.client.resources.model.IBakedModel a1, moom.DD a2, boolean a3) throws E;
private static final class __SourceHandler_4dd679f30d3cdab50d5d {

public static net.minecraft.client.resources.model.IBakedModel f779(net.minecraft.item.ItemStack p0, net.minecraft.client.resources.model.IBakedModel p1, moom.DD p2, boolean p3) throws Throwable {
    int forwardValue779_14_0;
    net.minecraft.client.resources.model.IBakedModel forwardValue779_16_0;
    moom.Jv forwardValue779_32_0;
    net.minecraft.client.resources.model.IBakedModel forwardValue779_41_0;
    net.minecraft.client.resources.model.IBakedModel forwardValue779_43_0;
    boolean spill779_0;
    net.minecraft.client.resources.model.IBakedModel spill779_1;
    moom.Jv spill779_2;
    net.minecraft.client.resources.model.IBakedModel spill779_3;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    moom.Jv life7_35;
    net.minecraft.client.resources.model.IBakedModel life8_51;
    forward_join_43: {
    forward_join_42: {
    forward_join_41: {
    forward_join_32: {
    forward_join_31: {
    forward_join_21: {
    forward_join_17: {
    forward_join_16: {
    forward_join_14: {
    life4_3 = (__fieldRead779_0() ^ 45783588924180L);
    life6_5 = __call779_1();
    spill779_0 = p3;
    if (!((life6_5 != null))) {
        forwardValue779_14_0 = __integerCategory779_2(spill779_0);
        break forward_join_14;
    }
    if (!((!spill779_0))) {
        break forward_join_17;
    }
    spill779_1 = p1;
    if (!((life6_5 != null))) {
        forwardValue779_16_0 = spill779_1;
        break forward_join_16;
    }
    forwardValue779_14_0 = __integerCategory779_4(__call779_3(spill779_1));
    }
    if (!((forwardValue779_14_0 != 0))) {
        break forward_join_17;
    }
    forwardValue779_16_0 = p1;
    }
    return forwardValue779_16_0;
    }
    if (!((__fieldRead779_5() == null))) {
        break forward_join_21;
    }
    return p1;
    }
    life7_35 = __call779_6(p0, 1);
    spill779_2 = life7_35;
    if (!((life6_5 != null))) {
        forwardValue779_32_0 = spill779_2;
        break forward_join_32;
    }
    if (!((spill779_2 == null))) {
        break forward_join_31;
    }
    return p1;
    }
    forwardValue779_32_0 = life7_35;
    }
    life8_51 = __call779_7(forwardValue779_32_0, p2, p3);
    spill779_3 = life8_51;
    if (!((life6_5 != null))) {
        forwardValue779_41_0 = spill779_3;
        break forward_join_41;
    }
    if (!((spill779_3 != null))) {
        break forward_join_42;
    }
    forwardValue779_41_0 = life8_51;
    }
    forwardValue779_43_0 = forwardValue779_41_0;
    break forward_join_43;
    }
    forwardValue779_43_0 = p1;
    }
    return forwardValue779_43_0;
}
public static void h779_0(moom.Oo p0) throws Throwable {
    throw __call1077900_0(p0);
}
public static void h779_1(moom.Oo p0) throws Throwable {
    throw __call1077901_0(p0);
}
public static void h779_2(moom.Oo p0) throws Throwable {
    throw __call1077902_0(p0);
}
public static void h779_3(moom.Oo p0) throws Throwable {
    throw __call1077903_0(p0);
}
public static void h779_4(moom.Oo p0) throws Throwable {
    throw __call1077904_0(p0);
}
public static void h779_5(moom.Oo p0) throws Throwable {
    throw __call1077905_0(p0);
}
public static void h779_6(moom.Oo p0) throws Throwable {
    throw __call1077906_0(p0);
}
private static native long __fieldRead779_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call779_1() throws Throwable;
private static native int __integerCategory779_2(boolean value) throws Throwable;
private static native boolean __call779_3(net.minecraft.client.resources.model.IBakedModel a0) throws Throwable;
private static native int __integerCategory779_4(boolean value) throws Throwable;
private static native moom.Jv[][] __fieldRead779_5() throws Throwable;
private static native moom.Jv __call779_6(net.minecraft.item.ItemStack a0, int a1) throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __call779_7(moom.Jv a0, moom.DD a1, boolean a2) throws Throwable;
private static native java.lang.Exception __call1077900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077905_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1077906_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_28f02647ff8f4031483b(moom.Jv[][] a0) throws E;
private static final class __SourceHandler_28f02647ff8f4031483b {

public static java.util.List f780(moom.Jv[][] p0) throws Throwable {
    moom.Jv[][] lexicalValue780_15_0;
    net.minecraft.entity.Entity[] spill780_0;
    moom.Jv[][] spill780_1;
    long life1_3;
    java.util.ArrayList life4_8;
    net.minecraft.entity.Entity[] life3_9;
    moom.Jv[][] life5_18;
    int life6_21;
    int life7_23;
    moom.Jv[] life8_30;
    java.util.ArrayList life9_32;
    lexical_join_45: {
    lexical_join_15: {
    life1_3 = (__fieldRead780_0() ^ 39649123501655L);
    spill780_0 = __call780_1();
    life4_8 = new java.util.ArrayList();
    life3_9 = spill780_0;
    spill780_1 = p0;
    if (!((life3_9 != null))) {
        lexicalValue780_15_0 = spill780_1;
        break lexical_join_15;
    }
    if (!((spill780_1 != null))) {
        break lexical_join_45;
    }
    lexicalValue780_15_0 = p0;
    }
    life5_18 = lexicalValue780_15_0;
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
    life9_32 = new java.util.ArrayList(__call780_2(life8_30));
    }
    __call780_3(life4_8, life9_32);
    life7_23 += 1;
    if (!((life3_9 == null))) { continue lexical_cycle_21; }
    break lexical_cycle_21;
    }
    }
    return life4_8;
}
public static void h780_0(moom.Oo p0) throws Throwable {
    throw __call1078000_0(p0);
}
private static native long __fieldRead780_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call780_1() throws Throwable;
private static native java.util.List __call780_2(moom.Jv[] a0) throws Throwable;
private static native boolean __call780_3(java.util.ArrayList a0, java.util.ArrayList a1) throws Throwable;
private static native java.lang.Exception __call1078000_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_00cd56ce0eccadddf566(moom.Jv[][] a0, java.util.List a1) throws E;
private static final class __SourceHandler_00cd56ce0eccadddf566 {

public static void f781(moom.Jv[][] p0, java.util.List p1) throws Throwable {
    moom.Jv[][] lexicalValue781_11_0;
    moom.Jv[][] spill781_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    moom.Jv[][] life5_14;
    int life6_17;
    int life7_19;
    moom.Jv[] life8_26;
    moom.Jv[] life9_35;
    int life10_38;
    int life11_40;
    moom.Jv life12_47;
    lexical_join_58: {
    lexical_join_11: {
    life2_3 = (__fieldRead781_0() ^ 9947492487954L);
    life4_5 = __call781_1();
    spill781_0 = p0;
    if (!((life4_5 != null))) {
        lexicalValue781_11_0 = spill781_0;
        break lexical_join_11;
    }
    if (!((spill781_0 != null))) {
        break lexical_join_58;
    }
    lexicalValue781_11_0 = p0;
    }
    life5_14 = lexicalValue781_11_0;
    life6_17 = (life5_14).length;
    life7_19 = 0;
    lexical_cycle_17: while (true) {
    lexical_join_56: {
    lexical_join_55: {
    if (!((life7_19 < life6_17))) {
        break lexical_join_58;
    }
    life8_26 = (life5_14)[life7_19];
    if (!((life4_5 != null))) {
        break lexical_join_56;
    }
    if (!((life8_26 != null))) {
        break lexical_join_55;
    }
    life9_35 = life8_26;
    life10_38 = (life9_35).length;
    life11_40 = 0;
    lexical_cycle_35: while (true) {
    lexical_join_53: {
    lexical_join_52: {
    if (!((life11_40 < life10_38))) {
        break lexical_join_55;
    }
    life12_47 = (life9_35)[life11_40];
    if (!((life4_5 != null))) {
        break lexical_join_56;
    }
    if (!((life4_5 != null))) {
        break lexical_join_53;
    }
    if (!((life12_47 != null))) {
        break lexical_join_52;
    }
    __call781_2(p1, life12_47);
    }
    life11_40 += 1;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_35; }
    break lexical_cycle_35;
    }
    }
    life7_19 += 1;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    return;
}
public static void h781_0(moom.Oo p0) throws Throwable {
    throw __call1078100_0(p0);
}
public static void h781_1(moom.Oo p0) throws Throwable {
    throw __call1078101_0(p0);
}
public static void h781_2(moom.Oo p0) throws Throwable {
    throw __call1078102_0(p0);
}
public static void h781_3(moom.Oo p0) throws Throwable {
    throw __call1078103_0(p0);
}
public static void h781_4(moom.Oo p0) throws Throwable {
    throw __call1078104_0(p0);
}
private static native long __fieldRead781_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call781_1() throws Throwable;
private static native boolean __call781_2(java.util.List a0, moom.Jv a1) throws Throwable;
private static native java.lang.Exception __call1078100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1078101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1078102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1078103_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1078104_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_371a2b2d014dded8d843(net.minecraft.item.ItemStack a0, int a1, java.lang.String a2) throws E;
private static final class __SourceHandler_371a2b2d014dded8d843 {

public static boolean f1353(net.minecraft.item.ItemStack p0, int p1, java.lang.String p2) throws Throwable {
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    moom.DD life6_16;
    life3_3 = (__fieldRead1353_0() ^ 122860050789958L);
    life5_5 = __call1353_1();
    if ((__fieldRead1353_2() == null)) {
        return false;
    }
    life6_16 = __call1353_3(p0, p1, p2);
    if ((life5_5 != null)) {
        if ((life6_16 == null)) {
        return false;
    }
        __call1353_5(__call1353_4(), life6_16);
    }
    return true;
}
public static void h1353_0(moom.Oo p0) throws Throwable {
    throw __call1135300_0(p0);
}
public static void h1353_1(moom.Oo p0) throws Throwable {
    throw __call1135301_0(p0);
}
public static void h1353_2(moom.Oo p0) throws Throwable {
    throw __call1135302_0(p0);
}
private static native long __fieldRead1353_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call1353_1() throws Throwable;
private static native moom.Jv[][] __fieldRead1353_2() throws Throwable;
private static native moom.DD __call1353_3(net.minecraft.item.ItemStack a0, int a1, java.lang.String a2) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call1353_4() throws Throwable;
private static native void __call1353_5(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native java.lang.Exception __call1135300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1135301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1135302_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.util.Map __sourceHandlerCall_6f66fcf73bd8fe69cb34() throws E;
private static final class __SourceHandler_6f66fcf73bd8fe69cb34 {

public static java.util.Map f782() throws Throwable {
    java.util.Map forwardValue782_472_0;
    java.util.Map spill782_0;
    long life0_3;
    net.minecraft.entity.Entity[] life2_5;
    forward_join_472: {
    forward_join_471: {
    life0_3 = (__fieldRead782_0() ^ 45115790549280L);
    life2_5 = __call782_1();
    spill782_0 = __fieldRead782_2();
    if (!((life2_5 != null))) {
        forwardValue782_472_0 = spill782_0;
        break forward_join_472;
    }
    if (!((spill782_0 == null))) {
        break forward_join_471;
    }
    __fieldWrite782_3(new java.util.LinkedHashMap());
    __call782_7(__fieldRead782_4(), __invokedynamic782_5(8598, (7897169747672333565L ^ life0_3)), __call782_6(0, 0));
    __call782_11(__fieldRead782_8(), __invokedynamic782_9(14643, (7521224792552989774L ^ life0_3)), __call782_10(0, 1));
    __call782_15(__fieldRead782_12(), __invokedynamic782_13(24996, (3015980360979430615L ^ life0_3)), __call782_14(0, 2));
    __call782_19(__fieldRead782_16(), __invokedynamic782_17(10615, (717867641424639027L ^ life0_3)), __call782_18(0, 3));
    __call782_23(__fieldRead782_20(), __invokedynamic782_21(25596, (2851685324776816298L ^ life0_3)), __call782_22(1));
    __call782_27(__fieldRead782_24(), __invokedynamic782_25(7237, (621145652423639312L ^ life0_3)), __call782_26(2));
    __call782_31(__fieldRead782_28(), __invokedynamic782_29(17964, (1966505020455197471L ^ life0_3)), __call782_30(3));
    __call782_35(__fieldRead782_32(), __invokedynamic782_33(17595, (8407101823637428684L ^ life0_3)), __call782_34(4));
    __call782_39(__fieldRead782_36(), __invokedynamic782_37(15072, (8720587792759646124L ^ life0_3)), __call782_38(5));
    __call782_44(__fieldRead782_40(), __invokedynamic782_41(14715, (7649036552807932971L ^ life0_3)), __call782_43(__invokedynamic782_42(6733, (4171336744707125413L ^ life0_3))));
    __call782_49(__fieldRead782_45(), __invokedynamic782_46(17508, (5362289754938120542L ^ life0_3)), __call782_48(__invokedynamic782_47(3196, (8647841815218382487L ^ life0_3)), 0));
    __call782_54(__fieldRead782_50(), __invokedynamic782_51(22871, (8856700090415842343L ^ life0_3)), __call782_53(__invokedynamic782_52(31491, (2063259756862673392L ^ life0_3)), 1));
    __call782_59(__fieldRead782_55(), __invokedynamic782_56(26189, (5324898395803433848L ^ life0_3)), __call782_58(__invokedynamic782_57(31491, (2063259756862673392L ^ life0_3)), 2));
    __call782_64(__fieldRead782_60(), __invokedynamic782_61(11317, (3950408223892467982L ^ life0_3)), __call782_63(__invokedynamic782_62(31491, (2063259756862673392L ^ life0_3)), 3));
    __call782_69(__fieldRead782_65(), __invokedynamic782_66(7864, (7960961085552018391L ^ life0_3)), __call782_68(__invokedynamic782_67(28993, (2753959097047849889L ^ life0_3))));
    __call782_74(__fieldRead782_70(), __invokedynamic782_71(17936, (378325067119369051L ^ life0_3)), __call782_73(__invokedynamic782_72(81, (8540060525860580030L ^ life0_3))));
    __call782_79(__fieldRead782_75(), __invokedynamic782_76(19572, (467673877610303801L ^ life0_3)), __call782_78(__invokedynamic782_77(27828, (1097158705222616664L ^ life0_3))));
    __call782_84(__fieldRead782_80(), __invokedynamic782_81(22486, (7520816323660089988L ^ life0_3)), __call782_83(__invokedynamic782_82(7695, (5916252035978622193L ^ life0_3))));
    __call782_89(__fieldRead782_85(), __invokedynamic782_86(24850, (1941823702081846390L ^ life0_3)), __call782_88(__invokedynamic782_87(20746, (4720852903745600499L ^ life0_3))));
    __call782_94(__fieldRead782_90(), __invokedynamic782_91(9987, (6725627130792573477L ^ life0_3)), __call782_93(__invokedynamic782_92(26412, (8138814184516455896L ^ life0_3))));
    __call782_99(__fieldRead782_95(), __invokedynamic782_96(22351, (3559557823518280219L ^ life0_3)), __call782_98(__invokedynamic782_97(18875, (6714983723724219225L ^ life0_3))));
    __call782_104(__fieldRead782_100(), __invokedynamic782_101(32609, (7748587541395513862L ^ life0_3)), __call782_103(__invokedynamic782_102(24835, (2046691892305005536L ^ life0_3)), 0));
    __call782_109(__fieldRead782_105(), __invokedynamic782_106(17520, (94321592432597269L ^ life0_3)), __call782_108(__invokedynamic782_107(13929, (8247806863527894191L ^ life0_3)), 1));
    __call782_114(__fieldRead782_110(), __invokedynamic782_111(10048, (7188683473475697152L ^ life0_3)), __call782_113(__invokedynamic782_112(13929, (8247806863527894191L ^ life0_3)), 2));
    __call782_119(__fieldRead782_115(), __invokedynamic782_116(5062, (7836451123115151094L ^ life0_3)), __call782_118(__invokedynamic782_117(13929, (8247806863527894191L ^ life0_3)), 3));
    __call782_123(__fieldRead782_120(), __invokedynamic782_121(17401, (7188589904632454792L ^ life0_3)), __call782_122(0, 4));
    __call782_129(__fieldRead782_124(), __invokedynamic782_125(21077, (6895217063043010314L ^ life0_3)), __call782_128(__fieldRead782_126(), __invokedynamic782_127(21190, (5624774475190341540L ^ life0_3))));
    __call782_135(__fieldRead782_130(), __invokedynamic782_131(27666, (9163763930515059066L ^ life0_3)), __call782_134(__fieldRead782_132(), __invokedynamic782_133(27096, (6549956107330106528L ^ life0_3))));
    __call782_141(__fieldRead782_136(), __invokedynamic782_137(32556, (4568566151140713076L ^ life0_3)), __call782_140(__fieldRead782_138(), __invokedynamic782_139(31378, (3221931445989713905L ^ life0_3))));
    __call782_147(__fieldRead782_142(), __invokedynamic782_143(13463, (3661526698979486150L ^ life0_3)), __call782_146(__fieldRead782_144(), __invokedynamic782_145(14003, (203043447029951477L ^ life0_3))));
    __call782_153(__fieldRead782_148(), __invokedynamic782_149(5740, (2578991940628106068L ^ life0_3)), __call782_152(__fieldRead782_150(), __invokedynamic782_151(19480, (153874445323145547L ^ life0_3))));
    __call782_159(__fieldRead782_154(), __invokedynamic782_155(24760, (8158804688337354234L ^ life0_3)), __call782_158(__fieldRead782_156(), __invokedynamic782_157(16656, (7670316343924333651L ^ life0_3))));
    __call782_165(__fieldRead782_160(), __invokedynamic782_161(21736, (5998717521375005145L ^ life0_3)), __call782_164(__fieldRead782_162(), __invokedynamic782_163(2187, (996676080795014581L ^ life0_3))));
    __call782_171(__fieldRead782_166(), __invokedynamic782_167(28163, (3364060546320380724L ^ life0_3)), __call782_170(__fieldRead782_168(), __invokedynamic782_169(13353, (5566481295564859751L ^ life0_3))));
    }
    forwardValue782_472_0 = __fieldRead782_172();
    }
    return forwardValue782_472_0;
}
public static void h782_0(moom.Oo p0) throws Throwable {
    throw __call1078200_0(p0);
}
public static void h782_1(moom.Oo p0) throws Throwable {
    throw __call1078201_0(p0);
}
private static native long __fieldRead782_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call782_1() throws Throwable;
private static native java.util.Map __fieldRead782_2() throws Throwable;
private static native void __fieldWrite782_3(java.util.LinkedHashMap a0) throws Throwable;
private static native java.util.Map __fieldRead782_4() throws Throwable;
private static native java.lang.String __invokedynamic782_5(int a0, long a1) throws Throwable;
private static native int[] __call782_6(int a0, int a1) throws Throwable;
private static native java.lang.Object __call782_7(java.util.Map a0, java.lang.String a1, int[] a2) throws Throwable;
private static native java.util.Map __fieldRead782_8() throws Throwable;
private static native java.lang.String __invokedynamic782_9(int a0, long a1) throws Throwable;
private static native int[] __call782_10(int a0, int a1) throws Throwable;
private static native java.lang.Object __call782_11(java.util.Map a0, java.lang.String a1, int[] a2) throws Throwable;
private static native java.util.Map __fieldRead782_12() throws Throwable;
private static native java.lang.String __invokedynamic782_13(int a0, long a1) throws Throwable;
private static native int[] __call782_14(int a0, int a1) throws Throwable;
private static native java.lang.Object __call782_15(java.util.Map a0, java.lang.String a1, int[] a2) throws Throwable;
private static native java.util.Map __fieldRead782_16() throws Throwable;
private static native java.lang.String __invokedynamic782_17(int a0, long a1) throws Throwable;
private static native int[] __call782_18(int a0, int a1) throws Throwable;
private static native java.lang.Object __call782_19(java.util.Map a0, java.lang.String a1, int[] a2) throws Throwable;
private static native java.util.Map __fieldRead782_20() throws Throwable;
private static native java.lang.String __invokedynamic782_21(int a0, long a1) throws Throwable;
private static native int[] __call782_22(int a0) throws Throwable;
private static native java.lang.Object __call782_23(java.util.Map a0, java.lang.String a1, int[] a2) throws Throwable;
private static native java.util.Map __fieldRead782_24() throws Throwable;
private static native java.lang.String __invokedynamic782_25(int a0, long a1) throws Throwable;
private static native int[] __call782_26(int a0) throws Throwable;
private static native java.lang.Object __call782_27(java.util.Map a0, java.lang.String a1, int[] a2) throws Throwable;
private static native java.util.Map __fieldRead782_28() throws Throwable;
private static native java.lang.String __invokedynamic782_29(int a0, long a1) throws Throwable;
private static native int[] __call782_30(int a0) throws Throwable;
private static native java.lang.Object __call782_31(java.util.Map a0, java.lang.String a1, int[] a2) throws Throwable;
private static native java.util.Map __fieldRead782_32() throws Throwable;
private static native java.lang.String __invokedynamic782_33(int a0, long a1) throws Throwable;
private static native int[] __call782_34(int a0) throws Throwable;
private static native java.lang.Object __call782_35(java.util.Map a0, java.lang.String a1, int[] a2) throws Throwable;
private static native java.util.Map __fieldRead782_36() throws Throwable;
private static native java.lang.String __invokedynamic782_37(int a0, long a1) throws Throwable;
private static native int[] __call782_38(int a0) throws Throwable;
private static native java.lang.Object __call782_39(java.util.Map a0, java.lang.String a1, int[] a2) throws Throwable;
private static native java.util.Map __fieldRead782_40() throws Throwable;
private static native java.lang.String __invokedynamic782_41(int a0, long a1) throws Throwable;
private static native int __invokedynamic782_42(int a0, long a1) throws Throwable;
private static native int[] __call782_43(int a0) throws Throwable;
private static native java.lang.Object __call782_44(java.util.Map a0, java.lang.String a1, int[] a2) throws Throwable;
private static native java.util.Map __fieldRead782_45() throws Throwable;
private static native java.lang.String __invokedynamic782_46(int a0, long a1) throws Throwable;
private static native int __invokedynamic782_47(int a0, long a1) throws Throwable;
private static native int[] __call782_48(int a0, int a1) throws Throwable;
private static native java.lang.Object __call782_49(java.util.Map a0, java.lang.String a1, int[] a2) throws Throwable;
private static native java.util.Map __fieldRead782_50() throws Throwable;
private static native java.lang.String __invokedynamic782_51(int a0, long a1) throws Throwable;
private static native int __invokedynamic782_52(int a0, long a1) throws Throwable;
private static native int[] __call782_53(int a0, int a1) throws Throwable;
private static native java.lang.Object __call782_54(java.util.Map a0, java.lang.String a1, int[] a2) throws Throwable;
private static native java.util.Map __fieldRead782_55() throws Throwable;
private static native java.lang.String __invokedynamic782_56(int a0, long a1) throws Throwable;
private static native int __invokedynamic782_57(int a0, long a1) throws Throwable;
private static native int[] __call782_58(int a0, int a1) throws Throwable;
private static native java.lang.Object __call782_59(java.util.Map a0, java.lang.String a1, int[] a2) throws Throwable;
private static native java.util.Map __fieldRead782_60() throws Throwable;
private static native java.lang.String __invokedynamic782_61(int a0, long a1) throws Throwable;
private static native int __invokedynamic782_62(int a0, long a1) throws Throwable;
private static native int[] __call782_63(int a0, int a1) throws Throwable;
private static native java.lang.Object __call782_64(java.util.Map a0, java.lang.String a1, int[] a2) throws Throwable;
private static native java.util.Map __fieldRead782_65() throws Throwable;
private static native java.lang.String __invokedynamic782_66(int a0, long a1) throws Throwable;
private static native int __invokedynamic782_67(int a0, long a1) throws Throwable;
private static native int[] __call782_68(int a0) throws Throwable;
private static native java.lang.Object __call782_69(java.util.Map a0, java.lang.String a1, int[] a2) throws Throwable;
private static native java.util.Map __fieldRead782_70() throws Throwable;
private static native java.lang.String __invokedynamic782_71(int a0, long a1) throws Throwable;
private static native int __invokedynamic782_72(int a0, long a1) throws Throwable;
private static native int[] __call782_73(int a0) throws Throwable;
private static native java.lang.Object __call782_74(java.util.Map a0, java.lang.String a1, int[] a2) throws Throwable;
private static native java.util.Map __fieldRead782_75() throws Throwable;
private static native java.lang.String __invokedynamic782_76(int a0, long a1) throws Throwable;
private static native int __invokedynamic782_77(int a0, long a1) throws Throwable;
private static native int[] __call782_78(int a0) throws Throwable;
private static native java.lang.Object __call782_79(java.util.Map a0, java.lang.String a1, int[] a2) throws Throwable;
private static native java.util.Map __fieldRead782_80() throws Throwable;
private static native java.lang.String __invokedynamic782_81(int a0, long a1) throws Throwable;
private static native int __invokedynamic782_82(int a0, long a1) throws Throwable;
private static native int[] __call782_83(int a0) throws Throwable;
private static native java.lang.Object __call782_84(java.util.Map a0, java.lang.String a1, int[] a2) throws Throwable;
private static native java.util.Map __fieldRead782_85() throws Throwable;
private static native java.lang.String __invokedynamic782_86(int a0, long a1) throws Throwable;
private static native int __invokedynamic782_87(int a0, long a1) throws Throwable;
private static native int[] __call782_88(int a0) throws Throwable;
private static native java.lang.Object __call782_89(java.util.Map a0, java.lang.String a1, int[] a2) throws Throwable;
private static native java.util.Map __fieldRead782_90() throws Throwable;
private static native java.lang.String __invokedynamic782_91(int a0, long a1) throws Throwable;
private static native int __invokedynamic782_92(int a0, long a1) throws Throwable;
private static native int[] __call782_93(int a0) throws Throwable;
private static native java.lang.Object __call782_94(java.util.Map a0, java.lang.String a1, int[] a2) throws Throwable;
private static native java.util.Map __fieldRead782_95() throws Throwable;
private static native java.lang.String __invokedynamic782_96(int a0, long a1) throws Throwable;
private static native int __invokedynamic782_97(int a0, long a1) throws Throwable;
private static native int[] __call782_98(int a0) throws Throwable;
private static native java.lang.Object __call782_99(java.util.Map a0, java.lang.String a1, int[] a2) throws Throwable;
private static native java.util.Map __fieldRead782_100() throws Throwable;
private static native java.lang.String __invokedynamic782_101(int a0, long a1) throws Throwable;
private static native int __invokedynamic782_102(int a0, long a1) throws Throwable;
private static native int[] __call782_103(int a0, int a1) throws Throwable;
private static native java.lang.Object __call782_104(java.util.Map a0, java.lang.String a1, int[] a2) throws Throwable;
private static native java.util.Map __fieldRead782_105() throws Throwable;
private static native java.lang.String __invokedynamic782_106(int a0, long a1) throws Throwable;
private static native int __invokedynamic782_107(int a0, long a1) throws Throwable;
private static native int[] __call782_108(int a0, int a1) throws Throwable;
private static native java.lang.Object __call782_109(java.util.Map a0, java.lang.String a1, int[] a2) throws Throwable;
private static native java.util.Map __fieldRead782_110() throws Throwable;
private static native java.lang.String __invokedynamic782_111(int a0, long a1) throws Throwable;
private static native int __invokedynamic782_112(int a0, long a1) throws Throwable;
private static native int[] __call782_113(int a0, int a1) throws Throwable;
private static native java.lang.Object __call782_114(java.util.Map a0, java.lang.String a1, int[] a2) throws Throwable;
private static native java.util.Map __fieldRead782_115() throws Throwable;
private static native java.lang.String __invokedynamic782_116(int a0, long a1) throws Throwable;
private static native int __invokedynamic782_117(int a0, long a1) throws Throwable;
private static native int[] __call782_118(int a0, int a1) throws Throwable;
private static native java.lang.Object __call782_119(java.util.Map a0, java.lang.String a1, int[] a2) throws Throwable;
private static native java.util.Map __fieldRead782_120() throws Throwable;
private static native java.lang.String __invokedynamic782_121(int a0, long a1) throws Throwable;
private static native int[] __call782_122(int a0, int a1) throws Throwable;
private static native java.lang.Object __call782_123(java.util.Map a0, java.lang.String a1, int[] a2) throws Throwable;
private static native java.util.Map __fieldRead782_124() throws Throwable;
private static native java.lang.String __invokedynamic782_125(int a0, long a1) throws Throwable;
private static native java.util.Map __fieldRead782_126() throws Throwable;
private static native java.lang.String __invokedynamic782_127(int a0, long a1) throws Throwable;
private static native java.lang.Object __call782_128(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call782_129(java.util.Map a0, java.lang.String a1, java.lang.Object a2) throws Throwable;
private static native java.util.Map __fieldRead782_130() throws Throwable;
private static native java.lang.String __invokedynamic782_131(int a0, long a1) throws Throwable;
private static native java.util.Map __fieldRead782_132() throws Throwable;
private static native java.lang.String __invokedynamic782_133(int a0, long a1) throws Throwable;
private static native java.lang.Object __call782_134(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call782_135(java.util.Map a0, java.lang.String a1, java.lang.Object a2) throws Throwable;
private static native java.util.Map __fieldRead782_136() throws Throwable;
private static native java.lang.String __invokedynamic782_137(int a0, long a1) throws Throwable;
private static native java.util.Map __fieldRead782_138() throws Throwable;
private static native java.lang.String __invokedynamic782_139(int a0, long a1) throws Throwable;
private static native java.lang.Object __call782_140(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call782_141(java.util.Map a0, java.lang.String a1, java.lang.Object a2) throws Throwable;
private static native java.util.Map __fieldRead782_142() throws Throwable;
private static native java.lang.String __invokedynamic782_143(int a0, long a1) throws Throwable;
private static native java.util.Map __fieldRead782_144() throws Throwable;
private static native java.lang.String __invokedynamic782_145(int a0, long a1) throws Throwable;
private static native java.lang.Object __call782_146(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call782_147(java.util.Map a0, java.lang.String a1, java.lang.Object a2) throws Throwable;
private static native java.util.Map __fieldRead782_148() throws Throwable;
private static native java.lang.String __invokedynamic782_149(int a0, long a1) throws Throwable;
private static native java.util.Map __fieldRead782_150() throws Throwable;
private static native java.lang.String __invokedynamic782_151(int a0, long a1) throws Throwable;
private static native java.lang.Object __call782_152(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call782_153(java.util.Map a0, java.lang.String a1, java.lang.Object a2) throws Throwable;
private static native java.util.Map __fieldRead782_154() throws Throwable;
private static native java.lang.String __invokedynamic782_155(int a0, long a1) throws Throwable;
private static native java.util.Map __fieldRead782_156() throws Throwable;
private static native java.lang.String __invokedynamic782_157(int a0, long a1) throws Throwable;
private static native java.lang.Object __call782_158(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call782_159(java.util.Map a0, java.lang.String a1, java.lang.Object a2) throws Throwable;
private static native java.util.Map __fieldRead782_160() throws Throwable;
private static native java.lang.String __invokedynamic782_161(int a0, long a1) throws Throwable;
private static native java.util.Map __fieldRead782_162() throws Throwable;
private static native java.lang.String __invokedynamic782_163(int a0, long a1) throws Throwable;
private static native java.lang.Object __call782_164(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call782_165(java.util.Map a0, java.lang.String a1, java.lang.Object a2) throws Throwable;
private static native java.util.Map __fieldRead782_166() throws Throwable;
private static native java.lang.String __invokedynamic782_167(int a0, long a1) throws Throwable;
private static native java.util.Map __fieldRead782_168() throws Throwable;
private static native java.lang.String __invokedynamic782_169(int a0, long a1) throws Throwable;
private static native java.lang.Object __call782_170(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call782_171(java.util.Map a0, java.lang.String a1, java.lang.Object a2) throws Throwable;
private static native java.util.Map __fieldRead782_172() throws Throwable;
private static native java.lang.Exception __call1078200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1078201_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d6d8a6f0d0559ecef472() throws E;
private static final class __SourceHandler_d6d8a6f0d0559ecef472 {

public static void f783() throws Throwable {
    int lexicalValue783_53_0;
    net.minecraft.entity.Entity[] spill783_0;
    int spill783_1;
    long life0_3;
    net.minecraft.entity.Entity[] life2_11;
    net.minecraft.client.resources.IResourcePack[] life3_29;
    int life4_34;
    net.minecraft.client.resources.IResourcePack life5_40;
    lexical_join_56: {
    lexical_join_53: {
    lexical_join_51: {
    lexical_join_44: {
    lexical_join_42: {
    lexical_join_22: {
    life0_3 = (__fieldRead783_0() ^ 116560519214899L);
    __fieldWrite783_1(null);
    __fieldWrite783_2(null);
    spill783_0 = __call783_3();
    __fieldWrite783_4(1);
    life2_11 = spill783_0;
    if (!((life2_11 != null))) {
        break lexical_join_22;
    }
    if (!(__call783_5())) {
        break lexical_join_56;
    }
    __call783_7(__invokedynamic783_6(26690, (3424850730347062061L ^ life0_3)));
    }
    life3_29 = __call783_8();
    life4_34 = ((life3_29).length - 1);
    lexical_cycle_29: while (true) {
    if (!((life4_34 >= 0))) {
        break lexical_join_42;
    }
    life5_40 = (life3_29)[life4_34];
    __call783_9(life5_40);
    life4_34 += -1;
    if (!((life2_11 != null))) {
        break lexical_join_44;
    }
    if (!((life2_11 == null))) { continue lexical_cycle_29; }
    break lexical_cycle_29;
    }
    }
    __call783_11(__call783_10());
    }
    spill783_1 = (__fieldRead783_12()).length;
    if (!((life2_11 != null))) {
        lexicalValue783_53_0 = spill783_1;
        break lexical_join_53;
    }
    if (!((spill783_1 == 0))) {
        break lexical_join_51;
    }
    __fieldWrite783_13(null);
    }
    lexicalValue783_53_0 = (__fieldRead783_14()).length;
    }
    if (!((lexicalValue783_53_0 == 0))) {
        break lexical_join_56;
    }
    __fieldWrite783_15(null);
    }
    return;
}
public static void h783_0(moom.Oo p0) throws Throwable {
    throw __call1078300_0(p0);
}
public static void h783_1(moom.Oo p0) throws Throwable {
    throw __call1078301_0(p0);
}
public static void h783_2(moom.Oo p0) throws Throwable {
    throw __call1078302_0(p0);
}
public static void h783_3(moom.Oo p0) throws Throwable {
    throw __call1078303_0(p0);
}
public static void h783_4(moom.Oo p0) throws Throwable {
    throw __call1078304_0(p0);
}
public static void h783_5(moom.Oo p0) throws Throwable {
    throw __call1078305_0(p0);
}
private static native long __fieldRead783_0() throws Throwable;
private static native void __fieldWrite783_1(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite783_2(java.lang.Object a0) throws Throwable;
private static native net.minecraft.entity.Entity[] __call783_3() throws Throwable;
private static native void __fieldWrite783_4(int a0) throws Throwable;
private static native boolean __call783_5() throws Throwable;
private static native java.lang.String __invokedynamic783_6(int a0, long a1) throws Throwable;
private static native void __call783_7(java.lang.String a0) throws Throwable;
private static native net.minecraft.client.resources.IResourcePack[] __call783_8() throws Throwable;
private static native void __call783_9(net.minecraft.client.resources.IResourcePack a0) throws Throwable;
private static native moom.oK __call783_10() throws Throwable;
private static native void __call783_11(moom.oK a0) throws Throwable;
private static native moom.Jv[][] __fieldRead783_12() throws Throwable;
private static native void __fieldWrite783_13(java.lang.Object a0) throws Throwable;
private static native moom.Jv[][] __fieldRead783_14() throws Throwable;
private static native void __fieldWrite783_15(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1078300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1078301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1078302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1078303_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1078304_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1078305_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5dac1f0073cbfff68488(java.lang.String a0) throws E;
private static final class __SourceHandler_5dac1f0073cbfff68488 {

public static void f315(java.lang.String p0) throws Throwable {
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    moom.DD life4_10;
    java.io.InputStream life5_13;
    moom.OH life6_34;
    life1_3 = (__fieldRead315_0() ^ 15576007764726L);
    life3_5 = __call315_1();
    life4_10 = new moom.DD(p0);
    life5_13 = __call315_2(life4_10);
    if ((life3_5 != null)) {
        if ((life5_13 == null)) {
        return;
    }
        java.lang.String __stackOp315_4_0 = p0;
        java.lang.String __stackOp315_4_1 = __invokedynamic315_3(23896, (7160325534980869116L ^ life1_3));
        __call315_6(__invokedynamic315_5(__stackOp315_4_1, __stackOp315_4_0));
    } else {
        
    }
    life6_34 = new moom.OH();
    __call315_7(life6_34, life5_13);
    __call315_8(life5_13);
    __fieldWrite315_12(__call315_11(__call315_10(life6_34, __invokedynamic315_9(5252, (1273462715642954350L ^ life1_3))), 1));
    return;
}
public static void h315_0(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3031500_0(p0);
}
public static void h315_1(java.io.FileNotFoundException p0, moom.DD p1) throws Throwable {
    java.io.FileNotFoundException life1_2;
    life1_2 = p0;
    return;
}
public static void h315_2(java.io.IOException p0, moom.DD p1) throws Throwable {
    java.io.IOException life1_2;
    life1_2 = p0;
    __call3031502_0(life1_2);
    return;
}
private static native long __fieldRead315_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call315_1() throws Throwable;
private static native java.io.InputStream __call315_2(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic315_3(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic315_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call315_6(java.lang.String a0) throws Throwable;
private static native void __call315_7(moom.OH a0, java.io.InputStream a1) throws Throwable;
private static native void __call315_8(java.io.InputStream a0) throws Throwable;
private static native java.lang.String __invokedynamic315_9(int a0, long a1) throws Throwable;
private static native java.lang.String __call315_10(moom.OH a0, java.lang.String a1) throws Throwable;
private static native boolean __call315_11(java.lang.String a0, int a1) throws Throwable;
private static native void __fieldWrite315_12(boolean a0) throws Throwable;
private static native java.lang.Exception __call3031500_0(java.io.FileNotFoundException a0) throws Throwable;
private static native void __call3031502_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_8b90615734c645bcec71(net.minecraft.client.resources.IResourcePack a0) throws E;
private static final class __SourceHandler_8b90615734c645bcec71 {

public static void f100090(net.minecraft.client.resources.IResourcePack p0) throws Throwable {
    java.util.Map forestValue100090_85_0;
    java.lang.String forestValue100090_85_1;
    moom.Jv forestValue100090_132_0;
    moom.Jv forestValue100090_141_0;
    moom.Jv[] forestValue100090_205_0;
    net.minecraft.entity.Entity[] spill100090_0;
    java.util.Map spill100090_1;
    java.lang.String spill100090_2;
    moom.Jv spill100090_3;
    moom.Jv[] spill100090_4;
    moom.Jv[] spill100090_5;
    long life1_3;
    java.lang.String[] life4_18;
    net.minecraft.entity.Entity[] life3_19;
    java.util.Map life5_22;
    java.util.Set life6_33;
    java.lang.String[] life7_39;
    java.util.List life6_51;
    java.util.List life7_54;
    java.lang.String[] life8_56;
    int life9_59;
    int life10_61;
    java.lang.String life11_70;
    moom.Jv life12_81;
    moom.DD life13_113;
    java.io.InputStream life14_117;
    moom.OH life15_141;
    java.util.Comparator life8_185;
    moom.Jv[][] life9_187;
    int life10_190;
    int life11_192;
    moom.Jv[] life12_201;
    moom.Jv[][] life9_223;
    int life10_226;
    int life11_228;
    moom.Jv[] life12_237;
    forest_join_224: {
    forest_join_205: {
    forest_join_180: {
    forest_join_152: {
    forest_join_146: {
    forest_join_44: {
    forest_join_42: {
    life1_3 = (__fieldRead100090_0() ^ 136998637998156L);
    spill100090_0 = __call100090_1();
    life4_18 = __call100090_4(p0, __invokedynamic100090_2(6371, (8685654473018094781L ^ life1_3)), __invokedynamic100090_3(4695, (1684963357117431381L ^ life1_3)), null);
    life3_19 = spill100090_0;
    life5_22 = __call100090_5(p0);
    if (!((life3_19 != null))) {
        break forest_join_44;
    }
    if (!((__call100090_6(life5_22) > 0))) {
        break forest_join_42;
    }
    life6_33 = __call100090_7(life5_22);
    life7_39 = __cast100090_9(__call100090_8(life6_33, new java.lang.String[0]));
    life4_18 = __cast100090_11(__call100090_10(life4_18, life7_39));
    }
    __call100090_12(life4_18);
    }
    life6_51 = __call100090_14(__fieldRead100090_13());
    life7_54 = __call100090_16(__fieldRead100090_15());
    life8_56 = life4_18;
    life9_59 = (life8_56).length;
    life10_61 = 0;
    forest_cycle_57: while (true) {
    forest_join_143: {
    forest_join_141: {
    forest_join_132: {
    forest_join_131: {
    forest_join_116: {
    forest_join_114: {
    forest_join_88: {
    forest_join_85: {
    if (!((life10_61 < life9_59))) {
        break forest_join_146;
    }
    life11_70 = (life8_56)[life10_61];
    java.lang.String __stackOp100090_18_0 = life11_70;
    java.lang.String __stackOp100090_18_1 = __invokedynamic100090_17(4823, (559154026595794673L ^ life1_3));
    __call100090_20(__invokedynamic100090_19(__stackOp100090_18_1, __stackOp100090_18_0));
    life12_81 = null;
    if (!((life3_19 != null))) {
        break forest_join_152;
    }
    spill100090_1 = life5_22;
    spill100090_2 = life11_70;
    if (!((life3_19 != null))) {
        forestValue100090_85_0 = spill100090_1;
        forestValue100090_85_1 = spill100090_2;
        break forest_join_85;
    }
    if (!(__call100090_21(spill100090_1, spill100090_2))) {
        break forest_join_88;
    }
    forestValue100090_85_0 = life5_22;
    forestValue100090_85_1 = life11_70;
    }
    life12_81 = __cast100090_23(__call100090_22(forestValue100090_85_0, forestValue100090_85_1));
    }
    spill100090_3 = life12_81;
    if (!((life3_19 != null))) {
        forestValue100090_132_0 = spill100090_3;
        break forest_join_132;
    }
    if (!((spill100090_3 == null))) {
        break forest_join_131;
    }
    life13_113 = new moom.DD(life11_70);
    life14_117 = __call100090_24(p0, life13_113);
    if (!((life3_19 != null))) {
        break forest_join_114;
    }
    if (!((life14_117 == null))) {
        break forest_join_116;
    }
    java.lang.String __stackOp100090_26_0 = life11_70;
    java.lang.String __stackOp100090_26_1 = __invokedynamic100090_25(23209, (3554394539026347679L ^ life1_3));
    __call100090_28(__invokedynamic100090_27(__stackOp100090_26_1, __stackOp100090_26_0));
    }
    if (!((life3_19 == null))) {
        break forest_join_143;
    }
    }
    life15_141 = new moom.OH();
    __call100090_29(life15_141, life14_117);
    __call100090_30(life14_117);
    life12_81 = new moom.Jv(life15_141, life11_70);
    }
    forestValue100090_132_0 = life12_81;
    }
    if (!((life3_19 != null))) {
        forestValue100090_141_0 = forestValue100090_132_0;
        break forest_join_141;
    }
    if (!(__call100090_31(forestValue100090_132_0, life11_70))) {
        break forest_join_143;
    }
    __call100090_32(life12_81, life6_51);
    forestValue100090_141_0 = life12_81;
    }
    __call100090_33(forestValue100090_141_0, life7_54);
    }
    life10_61 += 1;
    if (!((life3_19 == null))) {
        continue forest_cycle_57;
    }
    break forest_cycle_57;
    }
    }
    __fieldWrite100090_35(__call100090_34(life6_51));
    __fieldWrite100090_37(__call100090_36(life7_54));
    }
    life8_185 = __call100090_38();
    life9_187 = __fieldRead100090_39();
    life10_190 = (life9_187).length;
    life11_192 = 0;
    forest_cycle_161: while (true) {
    forest_join_178: {
    forest_join_177: {
    if (!((life11_192 < life10_190))) {
        break forest_join_180;
    }
    life12_201 = (life9_187)[life11_192];
    if (!((life3_19 != null))) {
        break forest_join_178;
    }
    spill100090_4 = life12_201;
    if (!((life3_19 != null))) {
        forestValue100090_205_0 = spill100090_4;
        break forest_join_205;
    }
    if (!((spill100090_4 != null))) {
        break forest_join_177;
    }
    __call100090_40(life12_201, life8_185);
    }
    life11_192 += 1;
    }
    if (!((life3_19 == null))) {
        continue forest_cycle_161;
    }
    break forest_cycle_161;
    }
    }
    life9_223 = __fieldRead100090_41();
    life10_226 = (life9_223).length;
    life11_228 = 0;
    forest_cycle_187: while (true) {
    forest_join_202: {
    forest_join_201: {
    if (!((life11_228 < life10_226))) {
        break forest_join_224;
    }
    life12_237 = (life9_223)[life11_228];
    if (!((life3_19 != null))) {
        break forest_join_202;
    }
    if (!((life12_237 != null))) {
        break forest_join_201;
    }
    __call100090_42(life12_237, life8_185);
    }
    life11_228 += 1;
    }
    if (!((life3_19 == null))) {
        continue forest_cycle_187;
    }
    break forest_cycle_187;
    }
    break forest_join_224;
    }
    forest_cycle_205: while (true) {
    forest_join_209: {
    if (!((forestValue100090_205_0 != null))) {
        break forest_join_209;
    }
    __call100090_43(life12_201, life8_185);
    }
    life11_192 += 1;
    forest_cycle_210: while (true) {
    forest_join_213: {
    if (!((life3_19 == null))) {
        break forest_join_213;
    }
    break forest_join_224;
    }
    if (!((life11_192 < life10_190))) {
        break forest_join_224;
    }
    life12_201 = (life9_187)[life11_192];
    if (!((life3_19 != null))) {
        continue forest_cycle_210;
    }
    break forest_cycle_210;
    }
    spill100090_5 = life12_201;
    forestValue100090_205_0 = spill100090_5;
    continue forest_cycle_205;
    }
    }
    return;
}
public static void h100090_0(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13009000_0(p0);
}
public static void h100090_1(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13009001_0(p0);
}
public static void h100090_2(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13009002_0(p0);
}
public static void h100090_3(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13009003_0(p0);
}
public static void h100090_4(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13009004_0(p0);
}
public static void h100090_5(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13009005_0(p0);
}
public static void h100090_6(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13009006_0(p0);
}
public static void h100090_7(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13009007_0(p0);
}
public static void h100090_8(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13009008_0(p0);
}
public static void h100090_9(java.io.FileNotFoundException p0, net.minecraft.client.resources.IResourcePack p1, long p2, net.minecraft.entity.Entity[] p3, java.util.Map p4, java.util.List p5, java.util.List p6, java.lang.String[] p7, int p8, int p9, java.lang.String p10) throws Throwable {
    java.util.Map forestValue13009009_43_0;
    java.lang.String forestValue13009009_43_1;
    moom.Jv forestValue13009009_90_0;
    moom.Jv forestValue13009009_99_0;
    moom.Jv[] forestValue13009009_161_0;
    java.util.Map spill13009009_0;
    java.lang.String spill13009009_1;
    moom.Jv spill13009009_2;
    moom.Jv[] spill13009009_3;
    moom.Jv[] spill13009009_4;
    java.io.FileNotFoundException life12_2;
    java.lang.String life11_24;
    moom.Jv life12_35;
    moom.DD life13_67;
    java.io.InputStream life14_71;
    moom.OH life15_95;
    java.util.Comparator life8_136;
    moom.Jv[][] life9_138;
    int life10_141;
    int life11_143;
    moom.Jv[] life12_152;
    moom.Jv[][] life9_174;
    int life10_177;
    int life11_179;
    moom.Jv[] life12_188;
    forest_join_180: {
    forest_join_161: {
    forest_join_136: {
    forest_join_108: {
    forest_join_102: {
    life12_2 = p0;
    java.lang.String __stackOp13009009_1_0 = p10;
    java.lang.String __stackOp13009009_1_1 = __invokedynamic13009009_0(14429, (2856758042706056313L ^ p2));
    __call13009009_3(__invokedynamic13009009_2(__stackOp13009009_1_1, __stackOp13009009_1_0));
    forest_cycle_11: while (true) {
    forest_join_101: {
    forest_join_99: {
    forest_join_90: {
    forest_join_89: {
    forest_join_74: {
    forest_join_72: {
    forest_join_46: {
    forest_join_43: {
    forest_join_15: {
    p9 += 1;
    if (!((p3 == null))) {
        break forest_join_15;
    }
    break forest_join_102;
    }
    if (!((p9 < p8))) {
        break forest_join_102;
    }
    life11_24 = (p7)[p9];
    java.lang.String __stackOp13009009_5_0 = life11_24;
    java.lang.String __stackOp13009009_5_1 = __invokedynamic13009009_4(4823, (559154026595794673L ^ p2));
    __call13009009_7(__invokedynamic13009009_6(__stackOp13009009_5_1, __stackOp13009009_5_0));
    life12_35 = null;
    if (!((p3 != null))) {
        break forest_join_108;
    }
    spill13009009_0 = p4;
    spill13009009_1 = life11_24;
    if (!((p3 != null))) {
        forestValue13009009_43_0 = spill13009009_0;
        forestValue13009009_43_1 = spill13009009_1;
        break forest_join_43;
    }
    if (!(__call13009009_8(spill13009009_0, spill13009009_1))) {
        break forest_join_46;
    }
    forestValue13009009_43_0 = p4;
    forestValue13009009_43_1 = life11_24;
    }
    life12_35 = __cast13009009_10(__call13009009_9(forestValue13009009_43_0, forestValue13009009_43_1));
    }
    spill13009009_2 = life12_35;
    if (!((p3 != null))) {
        forestValue13009009_90_0 = spill13009009_2;
        break forest_join_90;
    }
    if (!((spill13009009_2 == null))) {
        break forest_join_89;
    }
    life13_67 = new moom.DD(life11_24);
    life14_71 = __call13009009_11(p1, life13_67);
    if (!((p3 != null))) {
        break forest_join_72;
    }
    if (!((life14_71 == null))) {
        break forest_join_74;
    }
    java.lang.String __stackOp13009009_13_0 = life11_24;
    java.lang.String __stackOp13009009_13_1 = __invokedynamic13009009_12(23209, (3554394539026347679L ^ p2));
    __call13009009_15(__invokedynamic13009009_14(__stackOp13009009_13_1, __stackOp13009009_13_0));
    }
    if (!((p3 == null))) {
        continue forest_cycle_11;
    }
    }
    life15_95 = new moom.OH();
    __call13009009_16(life15_95, life14_71);
    __call13009009_17(life14_71);
    life12_35 = new moom.Jv(life15_95, life11_24);
    }
    forestValue13009009_90_0 = life12_35;
    }
    if (!((p3 != null))) {
        forestValue13009009_99_0 = forestValue13009009_90_0;
        break forest_join_99;
    }
    if (!(__call13009009_18(forestValue13009009_90_0, life11_24))) {
        break forest_join_101;
    }
    __call13009009_19(life12_35, p5);
    forestValue13009009_99_0 = life12_35;
    }
    __call13009009_20(forestValue13009009_99_0, p6);
    }
    continue forest_cycle_11;
    }
    }
    __fieldWrite13009009_22(__call13009009_21(p5));
    __fieldWrite13009009_24(__call13009009_23(p6));
    }
    life8_136 = __call13009009_25();
    life9_138 = __fieldRead13009009_26();
    life10_141 = (life9_138).length;
    life11_143 = 0;
    forest_cycle_117: while (true) {
    forest_join_134: {
    forest_join_133: {
    if (!((life11_143 < life10_141))) {
        break forest_join_136;
    }
    life12_152 = (life9_138)[life11_143];
    if (!((p3 != null))) {
        break forest_join_134;
    }
    spill13009009_3 = life12_152;
    if (!((p3 != null))) {
        forestValue13009009_161_0 = spill13009009_3;
        break forest_join_161;
    }
    if (!((spill13009009_3 != null))) {
        break forest_join_133;
    }
    __call13009009_27(life12_152, life8_136);
    }
    life11_143 += 1;
    }
    if (!((p3 == null))) {
        continue forest_cycle_117;
    }
    break forest_cycle_117;
    }
    }
    life9_174 = __fieldRead13009009_28();
    life10_177 = (life9_174).length;
    life11_179 = 0;
    forest_cycle_143: while (true) {
    forest_join_158: {
    forest_join_157: {
    if (!((life11_179 < life10_177))) {
        break forest_join_180;
    }
    life12_188 = (life9_174)[life11_179];
    if (!((p3 != null))) {
        break forest_join_158;
    }
    if (!((life12_188 != null))) {
        break forest_join_157;
    }
    __call13009009_29(life12_188, life8_136);
    }
    life11_179 += 1;
    }
    if (!((p3 == null))) {
        continue forest_cycle_143;
    }
    break forest_cycle_143;
    }
    break forest_join_180;
    }
    forest_cycle_161: while (true) {
    forest_join_165: {
    if (!((forestValue13009009_161_0 != null))) {
        break forest_join_165;
    }
    __call13009009_30(life12_152, life8_136);
    }
    life11_143 += 1;
    forest_cycle_166: while (true) {
    forest_join_169: {
    if (!((p3 == null))) {
        break forest_join_169;
    }
    break forest_join_180;
    }
    if (!((life11_143 < life10_141))) {
        break forest_join_180;
    }
    life12_152 = (life9_138)[life11_143];
    if (!((p3 != null))) {
        continue forest_cycle_166;
    }
    break forest_cycle_166;
    }
    spill13009009_4 = life12_152;
    forestValue13009009_161_0 = spill13009009_4;
    continue forest_cycle_161;
    }
    }
    return;
}
public static void h100090_10(java.lang.Exception p0, net.minecraft.client.resources.IResourcePack p1, long p2, net.minecraft.entity.Entity[] p3, java.util.Map p4, java.util.List p5, java.util.List p6, java.lang.String[] p7, int p8, int p9) throws Throwable {
    java.util.Map forestValue13009010_36_0;
    java.lang.String forestValue13009010_36_1;
    moom.Jv forestValue13009010_83_0;
    moom.Jv forestValue13009010_92_0;
    moom.Jv[] forestValue13009010_154_0;
    java.util.Map spill13009010_0;
    java.lang.String spill13009010_1;
    moom.Jv spill13009010_2;
    moom.Jv[] spill13009010_3;
    moom.Jv[] spill13009010_4;
    java.lang.Exception life12_2;
    java.lang.String life11_17;
    moom.Jv life12_28;
    moom.DD life13_60;
    java.io.InputStream life14_64;
    moom.OH life15_88;
    java.util.Comparator life8_129;
    moom.Jv[][] life9_131;
    int life10_134;
    int life11_136;
    moom.Jv[] life12_145;
    moom.Jv[][] life9_167;
    int life10_170;
    int life11_172;
    moom.Jv[] life12_181;
    forest_join_173: {
    forest_join_154: {
    forest_join_129: {
    forest_join_101: {
    forest_join_95: {
    life12_2 = p0;
    __call13009010_0(life12_2);
    forest_cycle_4: while (true) {
    forest_join_94: {
    forest_join_92: {
    forest_join_83: {
    forest_join_82: {
    forest_join_67: {
    forest_join_65: {
    forest_join_39: {
    forest_join_36: {
    forest_join_8: {
    p9 += 1;
    if (!((p3 == null))) {
        break forest_join_8;
    }
    break forest_join_95;
    }
    if (!((p9 < p8))) {
        break forest_join_95;
    }
    life11_17 = (p7)[p9];
    java.lang.String __stackOp13009010_2_0 = life11_17;
    java.lang.String __stackOp13009010_2_1 = __invokedynamic13009010_1(4823, (559154026595794673L ^ p2));
    __call13009010_4(__invokedynamic13009010_3(__stackOp13009010_2_1, __stackOp13009010_2_0));
    life12_28 = null;
    if (!((p3 != null))) {
        break forest_join_101;
    }
    spill13009010_0 = p4;
    spill13009010_1 = life11_17;
    if (!((p3 != null))) {
        forestValue13009010_36_0 = spill13009010_0;
        forestValue13009010_36_1 = spill13009010_1;
        break forest_join_36;
    }
    if (!(__call13009010_5(spill13009010_0, spill13009010_1))) {
        break forest_join_39;
    }
    forestValue13009010_36_0 = p4;
    forestValue13009010_36_1 = life11_17;
    }
    life12_28 = __cast13009010_7(__call13009010_6(forestValue13009010_36_0, forestValue13009010_36_1));
    }
    spill13009010_2 = life12_28;
    if (!((p3 != null))) {
        forestValue13009010_83_0 = spill13009010_2;
        break forest_join_83;
    }
    if (!((spill13009010_2 == null))) {
        break forest_join_82;
    }
    life13_60 = new moom.DD(life11_17);
    life14_64 = __call13009010_8(p1, life13_60);
    if (!((p3 != null))) {
        break forest_join_65;
    }
    if (!((life14_64 == null))) {
        break forest_join_67;
    }
    java.lang.String __stackOp13009010_10_0 = life11_17;
    java.lang.String __stackOp13009010_10_1 = __invokedynamic13009010_9(23209, (3554394539026347679L ^ p2));
    __call13009010_12(__invokedynamic13009010_11(__stackOp13009010_10_1, __stackOp13009010_10_0));
    }
    if (!((p3 == null))) {
        continue forest_cycle_4;
    }
    }
    life15_88 = new moom.OH();
    __call13009010_13(life15_88, life14_64);
    __call13009010_14(life14_64);
    life12_28 = new moom.Jv(life15_88, life11_17);
    }
    forestValue13009010_83_0 = life12_28;
    }
    if (!((p3 != null))) {
        forestValue13009010_92_0 = forestValue13009010_83_0;
        break forest_join_92;
    }
    if (!(__call13009010_15(forestValue13009010_83_0, life11_17))) {
        break forest_join_94;
    }
    __call13009010_16(life12_28, p5);
    forestValue13009010_92_0 = life12_28;
    }
    __call13009010_17(forestValue13009010_92_0, p6);
    }
    continue forest_cycle_4;
    }
    }
    __fieldWrite13009010_19(__call13009010_18(p5));
    __fieldWrite13009010_21(__call13009010_20(p6));
    }
    life8_129 = __call13009010_22();
    life9_131 = __fieldRead13009010_23();
    life10_134 = (life9_131).length;
    life11_136 = 0;
    forest_cycle_110: while (true) {
    forest_join_127: {
    forest_join_126: {
    if (!((life11_136 < life10_134))) {
        break forest_join_129;
    }
    life12_145 = (life9_131)[life11_136];
    if (!((p3 != null))) {
        break forest_join_127;
    }
    spill13009010_3 = life12_145;
    if (!((p3 != null))) {
        forestValue13009010_154_0 = spill13009010_3;
        break forest_join_154;
    }
    if (!((spill13009010_3 != null))) {
        break forest_join_126;
    }
    __call13009010_24(life12_145, life8_129);
    }
    life11_136 += 1;
    }
    if (!((p3 == null))) {
        continue forest_cycle_110;
    }
    break forest_cycle_110;
    }
    }
    life9_167 = __fieldRead13009010_25();
    life10_170 = (life9_167).length;
    life11_172 = 0;
    forest_cycle_136: while (true) {
    forest_join_151: {
    forest_join_150: {
    if (!((life11_172 < life10_170))) {
        break forest_join_173;
    }
    life12_181 = (life9_167)[life11_172];
    if (!((p3 != null))) {
        break forest_join_151;
    }
    if (!((life12_181 != null))) {
        break forest_join_150;
    }
    __call13009010_26(life12_181, life8_129);
    }
    life11_172 += 1;
    }
    if (!((p3 == null))) {
        continue forest_cycle_136;
    }
    break forest_cycle_136;
    }
    break forest_join_173;
    }
    forest_cycle_154: while (true) {
    forest_join_158: {
    if (!((forestValue13009010_154_0 != null))) {
        break forest_join_158;
    }
    __call13009010_27(life12_145, life8_129);
    }
    life11_136 += 1;
    forest_cycle_159: while (true) {
    forest_join_162: {
    if (!((p3 == null))) {
        break forest_join_162;
    }
    break forest_join_173;
    }
    if (!((life11_136 < life10_134))) {
        break forest_join_173;
    }
    life12_145 = (life9_131)[life11_136];
    if (!((p3 != null))) {
        continue forest_cycle_159;
    }
    break forest_cycle_159;
    }
    spill13009010_4 = life12_145;
    forestValue13009010_154_0 = spill13009010_4;
    continue forest_cycle_154;
    }
    }
    return;
}
public static void h100090_11(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13009011_0(p0);
}
public static void h100090_12(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13009012_0(p0);
}
public static void h100090_13(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13009013_0(p0);
}
public static void h100090_14(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13009014_0(p0);
}
public static void h100090_15(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13009015_0(p0);
}
private static native long __fieldRead100090_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call100090_1() throws Throwable;
private static native java.lang.String __invokedynamic100090_2(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic100090_3(int a0, long a1) throws Throwable;
private static native java.lang.String[] __call100090_4(net.minecraft.client.resources.IResourcePack a0, java.lang.String a1, java.lang.String a2, java.lang.Object a3) throws Throwable;
private static native java.util.Map __call100090_5(net.minecraft.client.resources.IResourcePack a0) throws Throwable;
private static native int __call100090_6(java.util.Map a0) throws Throwable;
private static native java.util.Set __call100090_7(java.util.Map a0) throws Throwable;
private static native java.lang.Object[] __call100090_8(java.util.Set a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.String[] __cast100090_9(java.lang.Object[] a0) throws Throwable;
private static native java.lang.Object[] __call100090_10(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.String[] __cast100090_11(java.lang.Object[] a0) throws Throwable;
private static native void __call100090_12(java.lang.String[] a0) throws Throwable;
private static native moom.Jv[][] __fieldRead100090_13() throws Throwable;
private static native java.util.List __call100090_14(moom.Jv[][] a0) throws Throwable;
private static native moom.Jv[][] __fieldRead100090_15() throws Throwable;
private static native java.util.List __call100090_16(moom.Jv[][] a0) throws Throwable;
private static native java.lang.String __invokedynamic100090_17(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic100090_19(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call100090_20(java.lang.String a0) throws Throwable;
private static native boolean __call100090_21(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call100090_22(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native moom.Jv __cast100090_23(java.lang.Object a0) throws Throwable;
private static native java.io.InputStream __call100090_24(net.minecraft.client.resources.IResourcePack a0, moom.DD a1) throws Throwable;
private static native java.lang.String __invokedynamic100090_25(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic100090_27(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call100090_28(java.lang.String a0) throws Throwable;
private static native void __call100090_29(moom.OH a0, java.io.InputStream a1) throws Throwable;
private static native void __call100090_30(java.io.InputStream a0) throws Throwable;
private static native boolean __call100090_31(moom.Jv a0, java.lang.String a1) throws Throwable;
private static native void __call100090_32(moom.Jv a0, java.util.List a1) throws Throwable;
private static native void __call100090_33(moom.Jv a0, java.util.List a1) throws Throwable;
private static native moom.Jv[][] __call100090_34(java.util.List a0) throws Throwable;
private static native void __fieldWrite100090_35(moom.Jv[][] a0) throws Throwable;
private static native moom.Jv[][] __call100090_36(java.util.List a0) throws Throwable;
private static native void __fieldWrite100090_37(moom.Jv[][] a0) throws Throwable;
private static native java.util.Comparator __call100090_38() throws Throwable;
private static native moom.Jv[][] __fieldRead100090_39() throws Throwable;
private static native void __call100090_40(moom.Jv[] a0, java.util.Comparator a1) throws Throwable;
private static native moom.Jv[][] __fieldRead100090_41() throws Throwable;
private static native void __call100090_42(moom.Jv[] a0, java.util.Comparator a1) throws Throwable;
private static native void __call100090_43(moom.Jv[] a0, java.util.Comparator a1) throws Throwable;
private static native java.lang.Exception __call13009000_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call13009001_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call13009002_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call13009003_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call13009004_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call13009005_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call13009006_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call13009007_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call13009008_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.String __invokedynamic13009009_0(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic13009009_2(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call13009009_3(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic13009009_4(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic13009009_6(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call13009009_7(java.lang.String a0) throws Throwable;
private static native boolean __call13009009_8(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call13009009_9(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native moom.Jv __cast13009009_10(java.lang.Object a0) throws Throwable;
private static native java.io.InputStream __call13009009_11(net.minecraft.client.resources.IResourcePack a0, moom.DD a1) throws Throwable;
private static native java.lang.String __invokedynamic13009009_12(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic13009009_14(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call13009009_15(java.lang.String a0) throws Throwable;
private static native void __call13009009_16(moom.OH a0, java.io.InputStream a1) throws Throwable;
private static native void __call13009009_17(java.io.InputStream a0) throws Throwable;
private static native boolean __call13009009_18(moom.Jv a0, java.lang.String a1) throws Throwable;
private static native void __call13009009_19(moom.Jv a0, java.util.List a1) throws Throwable;
private static native void __call13009009_20(moom.Jv a0, java.util.List a1) throws Throwable;
private static native moom.Jv[][] __call13009009_21(java.util.List a0) throws Throwable;
private static native void __fieldWrite13009009_22(moom.Jv[][] a0) throws Throwable;
private static native moom.Jv[][] __call13009009_23(java.util.List a0) throws Throwable;
private static native void __fieldWrite13009009_24(moom.Jv[][] a0) throws Throwable;
private static native java.util.Comparator __call13009009_25() throws Throwable;
private static native moom.Jv[][] __fieldRead13009009_26() throws Throwable;
private static native void __call13009009_27(moom.Jv[] a0, java.util.Comparator a1) throws Throwable;
private static native moom.Jv[][] __fieldRead13009009_28() throws Throwable;
private static native void __call13009009_29(moom.Jv[] a0, java.util.Comparator a1) throws Throwable;
private static native void __call13009009_30(moom.Jv[] a0, java.util.Comparator a1) throws Throwable;
private static native void __call13009010_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __invokedynamic13009010_1(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic13009010_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call13009010_4(java.lang.String a0) throws Throwable;
private static native boolean __call13009010_5(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call13009010_6(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native moom.Jv __cast13009010_7(java.lang.Object a0) throws Throwable;
private static native java.io.InputStream __call13009010_8(net.minecraft.client.resources.IResourcePack a0, moom.DD a1) throws Throwable;
private static native java.lang.String __invokedynamic13009010_9(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic13009010_11(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call13009010_12(java.lang.String a0) throws Throwable;
private static native void __call13009010_13(moom.OH a0, java.io.InputStream a1) throws Throwable;
private static native void __call13009010_14(java.io.InputStream a0) throws Throwable;
private static native boolean __call13009010_15(moom.Jv a0, java.lang.String a1) throws Throwable;
private static native void __call13009010_16(moom.Jv a0, java.util.List a1) throws Throwable;
private static native void __call13009010_17(moom.Jv a0, java.util.List a1) throws Throwable;
private static native moom.Jv[][] __call13009010_18(java.util.List a0) throws Throwable;
private static native void __fieldWrite13009010_19(moom.Jv[][] a0) throws Throwable;
private static native moom.Jv[][] __call13009010_20(java.util.List a0) throws Throwable;
private static native void __fieldWrite13009010_21(moom.Jv[][] a0) throws Throwable;
private static native java.util.Comparator __call13009010_22() throws Throwable;
private static native moom.Jv[][] __fieldRead13009010_23() throws Throwable;
private static native void __call13009010_24(moom.Jv[] a0, java.util.Comparator a1) throws Throwable;
private static native moom.Jv[][] __fieldRead13009010_25() throws Throwable;
private static native void __call13009010_26(moom.Jv[] a0, java.util.Comparator a1) throws Throwable;
private static native void __call13009010_27(moom.Jv[] a0, java.util.Comparator a1) throws Throwable;
private static native java.lang.Exception __call13009011_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call13009012_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call13009013_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call13009014_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call13009015_0(java.io.FileNotFoundException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4f0814a6e269a8d4cae5(moom.Jv a0, java.util.List a1) throws E;
private static final class __SourceHandler_4f0814a6e269a8d4cae5 {

public static void f784(moom.Jv p0, java.util.List p1) throws Throwable {
    moom.Jv lexicalValue784_13_0;
    moom.Jv lexicalValue784_32_0;
    moom.Jv spill784_0;
    moom.Jv spill784_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    int life5_22;
    lexical_join_38: {
    lexical_join_13: {
    life2_3 = (__fieldRead784_0() ^ 128786182149864L);
    life4_5 = __call784_1();
    spill784_0 = p0;
    if (!((life4_5 != null))) {
        lexicalValue784_13_0 = spill784_0;
        break lexical_join_13;
    }
    if (!((__fieldRead784_2(spill784_0) == 2))) {
        break lexical_join_38;
    }
    lexicalValue784_13_0 = p0;
    }
    if (!((__fieldRead784_3(lexicalValue784_13_0) != null))) {
        break lexical_join_38;
    }
    life5_22 = 0;
    lexical_cycle_17: while (true) {
    lexical_join_35: {
    lexical_join_32: {
    if (!((life5_22 < __invokedynamic784_4(24321, (8297184004386767396L ^ life2_3))))) {
        break lexical_join_38;
    }
    spill784_1 = p0;
    if (!((life4_5 != null))) {
        lexicalValue784_32_0 = spill784_1;
        break lexical_join_32;
    }
    if (!(__call784_6(__fieldRead784_5(spill784_1), life5_22))) {
        break lexical_join_35;
    }
    lexicalValue784_32_0 = p0;
    }
    __call784_7(lexicalValue784_32_0, p1, life5_22);
    }
    life5_22 += 1;
    if (!((life4_5 == null))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    return;
}
public static void h784_0(moom.Oo p0) throws Throwable {
    throw __call1078400_0(p0);
}
public static void h784_1(moom.Oo p0) throws Throwable {
    throw __call1078401_0(p0);
}
public static void h784_2(moom.Oo p0) throws Throwable {
    throw __call1078402_0(p0);
}
public static void h784_3(moom.Oo p0) throws Throwable {
    throw __call1078403_0(p0);
}
private static native long __fieldRead784_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call784_1() throws Throwable;
private static native int __fieldRead784_2(moom.Jv a0) throws Throwable;
private static native moom.Ke __fieldRead784_3(moom.Jv a0) throws Throwable;
private static native int __invokedynamic784_4(int a0, long a1) throws Throwable;
private static native moom.Ke __fieldRead784_5(moom.Jv a0) throws Throwable;
private static native boolean __call784_6(moom.Ke a0, int a1) throws Throwable;
private static native void __call784_7(moom.Jv a0, java.util.List a1, int a2) throws Throwable;
private static native java.lang.Exception __call1078400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1078401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1078402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1078403_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_0bbdc0a2ce0f72f916e0(java.lang.Object a0, java.lang.Object a1) throws E;
private static final class __SourceHandler_0bbdc0a2ce0f72f916e0 {

public static int f785(java.lang.Object p0, java.lang.Object p1) throws Throwable {
    int forwardValue785_31_0;
    int forwardValue785_31_1;
    int forwardValue785_45_0;
    java.lang.String forwardValue785_56_0;
    java.lang.String forwardValue785_56_1;
    int forwardValue785_57_0;
    net.minecraft.entity.Entity[] spill785_0;
    int spill785_1;
    int spill785_2;
    int spill785_3;
    java.lang.String spill785_4;
    java.lang.String spill785_5;
    long life2_3;
    moom.Jv life5_7;
    moom.Jv life6_10;
    net.minecraft.entity.Entity[] life4_11;
    forward_join_57: {
    forward_join_56: {
    forward_join_52: {
    forward_join_45: {
    forward_join_38: {
    forward_join_31: {
    forward_join_25: {
    life2_3 = (__fieldRead785_0() ^ 81016669264492L);
    spill785_0 = __call785_1();
    life5_7 = __cast785_2(p0);
    life6_10 = __cast785_3(p1);
    life4_11 = spill785_0;
    spill785_1 = __fieldRead785_4(life5_7);
    spill785_2 = __fieldRead785_5(life6_10);
    if (!((life4_11 != null))) {
        forwardValue785_31_0 = spill785_1;
        forwardValue785_31_1 = spill785_2;
        break forward_join_31;
    }
    if (!((spill785_1 != spill785_2))) {
        break forward_join_25;
    }
    forwardValue785_57_0 = (__fieldRead785_6(life5_7) - __fieldRead785_7(life6_10));
    break forward_join_57;
    }
    spill785_3 = __fieldRead785_8(life5_7);
    if (!((life4_11 != null))) {
        forwardValue785_45_0 = spill785_3;
        break forward_join_45;
    }
    forwardValue785_31_0 = spill785_3;
    forwardValue785_31_1 = __fieldRead785_9(life6_10);
    }
    if (!((forwardValue785_31_0 != forwardValue785_31_1))) {
        break forward_join_38;
    }
    forwardValue785_57_0 = (__fieldRead785_10(life6_10) - __fieldRead785_11(life5_7));
    break forward_join_57;
    }
    spill785_4 = __fieldRead785_12(life5_7);
    spill785_5 = __fieldRead785_13(life6_10);
    if (!((life4_11 != null))) {
        forwardValue785_56_0 = spill785_4;
        forwardValue785_56_1 = spill785_5;
        break forward_join_56;
    }
    forwardValue785_45_0 = __integerCategory785_15(__call785_14(spill785_4, spill785_5));
    }
    if (!((forwardValue785_45_0 == 0))) {
        break forward_join_52;
    }
    forwardValue785_57_0 = __call785_18(__fieldRead785_16(life5_7), __fieldRead785_17(life6_10));
    break forward_join_57;
    }
    forwardValue785_56_0 = __fieldRead785_19(life5_7);
    forwardValue785_56_1 = __fieldRead785_20(life6_10);
    }
    forwardValue785_57_0 = __call785_21(forwardValue785_56_0, forwardValue785_56_1);
    }
    return forwardValue785_57_0;
}
public static void h785_0(moom.Oo p0) throws Throwable {
    throw __call1078500_0(p0);
}
public static void h785_1(moom.Oo p0) throws Throwable {
    throw __call1078501_0(p0);
}
public static void h785_2(moom.Oo p0) throws Throwable {
    throw __call1078502_0(p0);
}
public static void h785_3(moom.Oo p0) throws Throwable {
    throw __call1078503_0(p0);
}
public static void h785_4(moom.Oo p0) throws Throwable {
    throw __call1078504_0(p0);
}
public static void h785_5(moom.Oo p0) throws Throwable {
    throw __call1078505_0(p0);
}
private static native long __fieldRead785_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call785_1() throws Throwable;
private static native moom.Jv __cast785_2(java.lang.Object a0) throws Throwable;
private static native moom.Jv __cast785_3(java.lang.Object a0) throws Throwable;
private static native int __fieldRead785_4(moom.Jv a0) throws Throwable;
private static native int __fieldRead785_5(moom.Jv a0) throws Throwable;
private static native int __fieldRead785_6(moom.Jv a0) throws Throwable;
private static native int __fieldRead785_7(moom.Jv a0) throws Throwable;
private static native int __fieldRead785_8(moom.Jv a0) throws Throwable;
private static native int __fieldRead785_9(moom.Jv a0) throws Throwable;
private static native int __fieldRead785_10(moom.Jv a0) throws Throwable;
private static native int __fieldRead785_11(moom.Jv a0) throws Throwable;
private static native java.lang.String __fieldRead785_12(moom.Jv a0) throws Throwable;
private static native java.lang.String __fieldRead785_13(moom.Jv a0) throws Throwable;
private static native boolean __call785_14(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory785_15(boolean value) throws Throwable;
private static native java.lang.String __fieldRead785_16(moom.Jv a0) throws Throwable;
private static native java.lang.String __fieldRead785_17(moom.Jv a0) throws Throwable;
private static native int __call785_18(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead785_19(moom.Jv a0) throws Throwable;
private static native java.lang.String __fieldRead785_20(moom.Jv a0) throws Throwable;
private static native int __call785_21(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1078500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1078501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1078502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1078503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1078504_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1078505_0(moom.Oo a0) throws Throwable;

}


private static int b(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x29A6;
        if (Jw.l[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = k[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])m.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    m.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Jw", exception);
            }
            int n8 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Jw.l[n4] = n8;
        }
        return Jw.l[n4];
}


public static void b() {
net.minecraft.entity.Entity[] spill885_0;
    long life0_3;
    java.util.Iterator life3_7;
    net.minecraft.entity.Entity[] life2_8;
    moom.Jv life4_15;
    net.minecraft.client.renderer.texture.TextureMap life5_22;
    lexical_join_31: {
    life0_3 = (moom.Jw.g ^ 140384941119596L);
    spill885_0 = moom.JM.b__Arrayr3();
    life3_7 = ((java.util.List)(moom.Jw.a__List())).iterator();
    life2_8 = spill885_0;
    lexical_cycle_9: while (true) {
    lexical_join_29: {
    if (!(((java.util.Iterator)(life3_7)).hasNext())) {
        break lexical_join_31;
    }
    life4_15 = ((moom.Jv)(((java.util.Iterator)(life3_7)).next()));
    if (!((((moom.Jv)(life4_15)).c == 1))) {
        break lexical_join_29;
    }
    life5_22 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__n8();
    ((moom.Jv)(life4_15)).a(((net.minecraft.client.renderer.texture.TextureMap)(life5_22)), ((net.minecraft.client.renderer.block.model.ItemModelGenerator)(moom.Jw.d)));
    ((moom.Jv)(life4_15)).a();
    }
    if (!((life2_8 == null))) { continue lexical_cycle_9; }
    break lexical_cycle_9;
    }
    }
    return;
}


private static void b(moom.Jv p0, java.util.List p1) { __sourceHandlerCall_4f0814a6e269a8d4cae5(p0, p1); }


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Jw.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5516_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Jw"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral5517_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Jw"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.Jw.c(((int)(local4)), ((long)(local5)));
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 27925);
    if (((moom.Jw.o)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.Jw.n)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.Jw.p)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Jw.p)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/Jw", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.Jw.o)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.Jw.o)[life3_8])).longValue();
}


public static boolean a__Boolean() {
return ((((moom.Jw.e) ? 1 : 0)) != 0);
}


public static void a(net.minecraft.client.resources.model.ModelBakery p0) {
net.minecraft.entity.Entity[] spill884_0;
    long life1_3;
    java.util.Iterator life4_7;
    net.minecraft.entity.Entity[] life3_8;
    moom.Jv life5_15;
    lexical_join_21: {
    life1_3 = (moom.Jw.g ^ 105125383180014L);
    spill884_0 = moom.JM.b__Arrayr3();
    life4_7 = ((java.util.List)(moom.Jw.a__List())).iterator();
    life3_8 = spill884_0;
    lexical_cycle_9: while (true) {
    if (!(((java.util.Iterator)(life4_7)).hasNext())) {
        break lexical_join_21;
    }
    life5_15 = ((moom.Jv)(((java.util.Iterator)(life4_7)).next()));
    ((moom.Jv)(life5_15)).a(((net.minecraft.client.resources.model.ModelBakery)(p0)));
    if (!((life3_8 == null))) { continue lexical_cycle_9; }
    break lexical_cycle_9;
    }
    }
    return;
}


private static java.lang.Exception a(java.lang.Exception p0) {
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
        byte[] spill2828_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2828_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2828_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2828_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2828_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2828_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 7734);
    if (((moom.Jw.i)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Jw.j)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Jw.j)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Jw", life9_51);
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
        life9_116 = ((java.lang.String)((moom.Jw.h)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Jw.i)[life5_8] = moom.Jw.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Jw.i)[life5_8];
}


private static boolean a(moom.Jv p0, net.minecraft.item.ItemStack p1, int[][] p2) { return __sourceHandlerCall_58454ae19e366f75b667(p0, p1, p2); }


private static int[][] a(net.minecraft.item.ItemStack p0) { return __sourceHandlerCall_9b1d1ed9beb93b45bdf7(p0); }


public static boolean a(net.minecraft.client.renderer.entity.RenderItem p0, net.minecraft.item.ItemStack p1, net.minecraft.client.resources.model.IBakedModel p2) { return __sourceHandlerCall_758c3721c30de8363ea9(p0, p1, p2); }


public static boolean a(net.minecraft.entity.EntityLivingBase p0, net.minecraft.item.ItemStack p1, moom.iQ p2, float p3, float p4, float p5, float p6, float p7, float p8, float p9) { return __sourceHandlerCall_0e73f114758346234932(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9); }


private static void a__Void(net.minecraft.client.resources.IResourcePack p0) { __sourceHandlerCall_8b90615734c645bcec71(p0); }


private static void a__Void(java.lang.String p0) { __sourceHandlerCall_5dac1f0073cbfff68488(p0); }


public static void a__Void() { __sourceHandlerCall_d6d8a6f0d0559ecef472(); }


public static net.minecraft.client.resources.model.IBakedModel a(net.minecraft.item.ItemStack p0, net.minecraft.client.resources.model.IBakedModel p1, moom.DD p2, boolean p3) { return __sourceHandlerCall_4dd679f30d3cdab50d5d(p0, p1, p2, p3); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Jw.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5530_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Jw"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static void a(net.minecraft.client.renderer.texture.TextureMap p0) {
net.minecraft.entity.Entity[] spill883_0;
    long life1_3;
    java.util.Iterator life4_7;
    net.minecraft.entity.Entity[] life3_8;
    moom.Jv life5_15;
    lexical_join_21: {
    life1_3 = (moom.Jw.g ^ 53020072322227L);
    spill883_0 = moom.JM.b__Arrayr3();
    life4_7 = ((java.util.List)(moom.Jw.a__List())).iterator();
    life3_8 = spill883_0;
    lexical_cycle_9: while (true) {
    if (!(((java.util.Iterator)(life4_7)).hasNext())) {
        break lexical_join_21;
    }
    life5_15 = ((moom.Jv)(((java.util.Iterator)(life4_7)).next()));
    ((moom.Jv)(life5_15)).a(((net.minecraft.client.renderer.texture.TextureMap)(p0)));
    if (!((life3_8 == null))) { continue lexical_cycle_9; }
    break lexical_cycle_9;
    }
    }
    return;
}


private static java.util.Comparator a() {
return __sourceIntrinsic_7226b1c76b43_originalDynamicSite1215_0();
}


private static int[] a(int p0) {
long local1 = (moom.Jw.g ^ 32164841973677L);
    return new int[] {p0, (p0 + __sourceIntrinsic_11c0cdb8aa5e_originalDynamicSite1216_1(14683, (4928234708529141028L ^ local1))), (p0 + __sourceIntrinsic_11c0cdb8aa5e_originalDynamicSite1216_2(9651, (8875587259812104656L ^ local1))), (p0 + __sourceIntrinsic_11c0cdb8aa5e_originalDynamicSite1216_3(19151, (4229281151720138426L ^ local1)))};
}


private static int[] a(int p0, int p1) {
long local2 = (moom.Jw.g ^ 114176566874653L);
    return new int[] {(p0 + (p1 * __sourceIntrinsic_24455665f241_originalDynamicSite1217_1(10180, (3467703547960360450L ^ local2))))};
}


private static int a(java.lang.String p0) { return __sourceHandlerCall_4be891ef043b9f2aaffa(p0); }


private static java.util.List a(moom.Jv[][] p0) { return __sourceHandlerCall_28f02647ff8f4031483b(p0); }


private static moom.Jv[][] a(java.util.List p0) { return __sourceHandlerCall_9e9ca3da27bfefe71612(p0); }


private static java.util.Map a(net.minecraft.client.resources.IResourcePack p0) {
long local1 = (moom.Jw.g ^ 80107067525984L);
    java.util.HashMap local3 = new java.util.HashMap();
    ((java.util.Map)(local3)).putAll(((java.util.Map)(moom.Jw.a(((net.minecraft.client.resources.IResourcePack)(p0)), ((java.lang.String)(__sourceIntrinsic_946eb51c2c7b_originalDynamicSite1218_1(2024, (2449976057902133463L ^ local1)))), ((int)(net.minecraft.item.Item.a(((net.minecraft.item.Item)(net.minecraft.init.Items.bo)))))))));
    ((java.util.Map)(local3)).putAll(((java.util.Map)(moom.Jw.a(((net.minecraft.client.resources.IResourcePack)(p0)), ((java.lang.String)(__sourceIntrinsic_946eb51c2c7b_originalDynamicSite1218_6(17342, (7681058698569135267L ^ local1)))), ((int)(net.minecraft.item.Item.a(((net.minecraft.item.Item)(net.minecraft.init.Items.bo)))))))));
    ((java.util.Map)(local3)).putAll(((java.util.Map)(moom.Jw.a(((net.minecraft.client.resources.IResourcePack)(p0)), ((java.lang.String)(__sourceIntrinsic_946eb51c2c7b_originalDynamicSite1218_11(7279, (1426864970249792342L ^ local1)))), ((int)(net.minecraft.item.Item.a(((net.minecraft.item.Item)(net.minecraft.init.Items.bo)))))))));
    return local3;
}


private static java.util.Map a(net.minecraft.client.resources.IResourcePack p0, java.lang.String p1, int p2) { return __sourceHandlerCall_50fdca2e56c2d8bf7751(p0, p1, p2); }


private static java.util.Properties a(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3) { return __sourceHandlerCall_6a5dbee4fd8dfd8b368d(p0, p1, p2, p3); }


private static java.util.Map a__Map() { return __sourceHandlerCall_6f66fcf73bd8fe69cb34(); }


private static java.util.List<moom.Jv> a__List() {
java.util.ArrayList local0 = new java.util.ArrayList();
    moom.Jw.a(((moom.Jv[][])(moom.Jw.a)), ((java.util.List)(local0)));
    moom.Jw.a(((moom.Jv[][])(moom.Jw.b)), ((java.util.List)(local0)));
    return local0;
}


public static boolean a__Boolean(net.minecraft.item.ItemStack p0, int p1, java.lang.String p2) { return __sourceHandlerCall_371a2b2d014dded8d843(p0, p1, p2); }


private static moom.DD a(net.minecraft.item.ItemStack p0, int p1, java.lang.String p2) { return __sourceHandlerCall_4edbc7ce132e487fac8b(p0, p1, p2); }


private static moom.Jv a(net.minecraft.item.ItemStack p0, int p1) { return __sourceHandlerCall_3ba492333b96f08e7c97(p0, p1); }


private static void a(moom.Jv p0, java.util.List p1) { __sourceHandlerCall_aeccf787599c658ea987(p0, p1); }


private static void a(moom.Jv p0, java.util.List p1, int p2) { __sourceHandlerCall_829063f39d12a884402d(p0, p1, p2); }


private static void a(moom.Jv[][] p0, java.util.List<moom.Jv> p1) { __sourceHandlerCall_00cd56ce0eccadddf566(p0, p1); }


private static int lambda$getPropertiesComparator$0(java.lang.Object p0, java.lang.Object p1) { return __sourceHandlerCall_0bbdc0a2ce0f72f916e0(p0, p1); }


private static native <E extends Throwable> java.util.Comparator __sourceIntrinsic_7226b1c76b43_originalDynamicSite1215_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_11c0cdb8aa5e_originalDynamicSite1216_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_11c0cdb8aa5e_originalDynamicSite1216_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_11c0cdb8aa5e_originalDynamicSite1216_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_24455665f241_originalDynamicSite1217_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5530_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_946eb51c2c7b_originalDynamicSite1218_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_946eb51c2c7b_originalDynamicSite1218_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_946eb51c2c7b_originalDynamicSite1218_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5516_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral5517_0() throws E;
}
