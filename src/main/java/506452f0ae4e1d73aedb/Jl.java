package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Jl {

private static java.lang.String a;

private static moom.Jk b;

private static moom.Jk c;

private static moom.Jk d;

private static moom.Jk e;

private static moom.Jk f;

private static moom.Jk[] g;

private static moom.Jk[][] h;

private static moom.Jk i;

private static moom.Jj j;

private static moom.Jk k;

private static moom.Jj l;

private static moom.Jk m;

private static moom.Jj n;

private static moom.Jk o;

private static moom.Jj p;

private static moom.JO[] q;

private static int r;

private static moom.Jk s;

private static moom.Jk t;

private static int u;

private static moom.Jk v;

private static moom.Jk w;

private static moom.Jk x;

private static moom.Jk y;

private static moom.Jk z;

private static boolean A;

private static int B;

private static int C;

private static int D;

private static int E;

private static int F;

private static int G;

private static moom.DR H;

private static moom.DR I;

private static moom.DR J;

private static int[] K;

private static int[] L;

private static float[][] M;

private static float[][] N;

private static int[] O;

private static int[] P;

private static int[] Q;

private static net.minecraft.block.state.IBlockState R;

private static net.minecraft.block.state.IBlockState S;

public static java.util.Random T;

private static moom.Jr U;

private static moom.Jr V;

private static moom.Jr W;

private static moom.Jr X;

private static moom.Jr Y;

private static long Z;

private static java.lang.String[] ab;

private static java.lang.String[] bb;

private static java.util.Map cb;

private static long[] db;

private static java.lang.Integer[] eb;

private static java.util.Map fb;

public Jl() {
super();
}


static {
Z = ((long)(((moom._a)(moom._c.a(((long)(-8611066910351045675L)), ((long)(-6856841089690022116L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(254227713118341L)))));
    long local20_life6 = (moom.Jl.Z ^ 107596919041176L);
    cb = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life9;
    javax.crypto.Cipher __sourceSpill612_11 = (local11_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill612_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill612_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill612_14 = new byte[8];
    (__sourceSpill612_14)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local12_life15 = 1;
    while ((local12_life15 < 8)) {
        (__sourceSpill612_14)[local12_life15] = ((byte) ((int) ((local20_life6 << (local12_life15 * 8)) >>> 56)));
        local12_life15 += 1;
    }
    byte[] __sourcePreallocation612_16 = __sourceSpill612_14;
    ((javax.crypto.Cipher)(__sourceSpill612_11)).init(((int)(__sourceSpill612_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill612_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation612_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local18_life19 = new java.lang.String[142];
    int local16_life20 = 0;
    java.lang.String local15_life21;
    int local17_life23 = ((java.lang.String)((local15_life21 = "Ùfé×÷Ñæül=DW ÈNtËé}|ùÂ#(3óK<Å#{Ó×ÍiwÚæCÝN\026¯ ÖØAÇã­Ú4®äs¥tI\001g\031GG¾©\023âj\001Þ¿÷6Ûs[\030Å^ÔSP\037Ié¸5æL\\\005~{ð×ô-åTø(#bÇÇ|sIh\002CÝð¥î»[âp1ÝÎ0ÝÁµ,]¡ò\017õØé,\020\000\030·8ÀC\036lõò\024.!\177 \004¸£QÈÓc³hü Uj^«M Z\000?ÛòÀ)ÔÝ~Íö/ÚVÌçf\013\0174D(\006á\027\t\f\022ôz~A9t\002¾\024Þ\b¯Þj®=C\000±»f½r%\002ÿ\0365!À«S4 Cø»»³¹DrÀ}ù×\036Ï\031(\004ªò´z\021ÞáWÛ\0208÷µùHm\033 ÑHØ\025Ò\005ä\030,ÅÏÿ½ÅB\032Å}KnªûÀªÉ\025[Îà02äÝ7\"34&I/¤\024\035mQnÈ³QNW¤D\031K\021½p}\000Pi0¾Ð8Äx\013ø\021S}m\020×/J\177c\021ý\016#ßÏ_{\020-°\005\006Í=¢}D67Ad\020¾ wû³qÁ\036§ÈD]\020¹ûpþ\032÷<ä®Ò­ÖÚgm\020`\020 r\025çø9(n¤·úz\020Å¢~Î|<PgØDaû\023.\001\020<ÞÀ\020¹ÖÍI\025´ÍöÀÄ2 ÚUÞ¼c\020éö¢:»¯W\031EÄ\037ÎØÄ:i\030ròBþÁé0Á\016]ULÆÄ\177§4ÁëÁ_6WÏ\006d\032?bãÌ8.QfÌ^ÆüþG\002}ñ\034«³8c§µ\033I»+nRÕHÜÐzUÌ>ìÿÒÌ:âjÊ¿ÃÖîpë¼Â&(Ü~Å5\177.Ài Ô3¸.¸G\035\"/\036§vRa~?\003\024B\037?ÿßÇvæú ¼¤\024Uþ&:78x\003_\020\004¤cc¾ïßÅVJÿYùÎ&\000Ú§\030ÍZ\007ÃÑÅk\027¥³æ>[@a\013Ró\006\016&\r0®¨k\031(í9;hÂ4ãgø êåªéÀü áº~ ½ýï\"owÐÀåÀ\027 làPR 7ÊÌ\024·cy9Ñ<b-àú~ß¶°\177!\0262CÌ\nxÚ\026ïY\020>Ls·X!9Jz\0048yý\020!åí9O\bÖ£íG®õ\022ØsW\020\002\177W¦ÔßÚ9@¡lX\026n $Óó!ÀDjø,Íè_¿Ï+Û³«Ä#Ý:zñR\016<[ j;\t+\023;Ã\034Ðè©4óz9Áör(]Þ°ÿ\034HQ \023\033W<`þO±\034\004ë¢ B§3«Iò0D¸\"l\026^H/5\020ikå¤\022aùÎGR-z\026\020 ×±\036Ç×ZÁJ&\017\034LÚ\020\b7\177&G\021aøm®ÌN(Wrõ\020®º\026¹öÐº®­\023´=þ@]\t GQÍðA6Ëÿg\037\030H)ôýMÝ>N®J¤9~\032æ\006G ó,ÀS\031¿\036|,H+åËR%\022\013}þ6%ð®Zv\030þV\016¯\032\bWÝô\037qÆö/.i{\035\013Z\020\006a\037Áx¤µbx:¢uL&\020´\bY\030¬\024\033?ÒÁjÄ6Ñ\030ç¶Þv×ÎA¶R'2¢LÖ£*\nxW>ï#|\020ª÷G[ùG]\006ÁêG\b 0¿ôKúº«hý.²oF|ulô©>]È\"×`ÔZÐ£@~\030#áºYÂHÃD®\024³ëâ*3¼V5Ë2Êc\030\031ôÍ^ä$áÇ\fÕn\"Üuzq÷³Ã¤\024\t(÷iìÇ\nJE0x\027P«^\fñäörÅÖøÈU\"d±Xl¿Ï/^¥ Y_öO ão\002üß(ð~q±]\005¨Xô .\034}»\000(ZûÎ\030GKXG\037¼9üÖ\030Z!1A\027-ëå\0227 ò¬IL\020'8I\006\000Óªn7µ¦C&i®\022\001K©ø\030Y óéúñ\027ÐÚ5LÅ^Ö\002\024Õú·Ç\f¯Y\020çøÑUãH;\007M-\025d°åÅ §~\r\r³VL¬\001$:\001Ê\031\035 \0176e­Ä\024|¡ÍGõ¯\020í{Õê\\\005(\b\034\005.Ø÷s\020S\026[Z-hq3>\bÕ5\034£c J\034²®¬Ç°tÊ\006ö0÷í\006ú+3,\023\037Âêà TpµÚøB«-ªØ~\005ëAµì_$«`\006?ªf×4Û\n9ã(¯K\032p3¦t\\J©¬ßPÔ\bÎßX}\034W\016_®xwb*Urw|¡\004\030Ï5Òqlq\024üÃr´\032þW6Æ à\030\025¡\bÐëù(ø¡Ë±\001r­ñ\rÌæùÚ&\034\020ø\007Lªv«\020Á]x÷¨ÆS ,ã~J]¿\0347Æê\031+Ò2Zwd%¯\017îUÏr\036¯¦\000\030x\027»ìÃÜû\027YÅ\000\030ë/qÇº:M¬C× \002PC\031CÌºCE³ýß\027Ún>µ\013\002#Ä¶t\031\013`ÿÅ£\t ¢É\017¡QàDî\013@Ü*r×\"òÙ\035ö8r¤=m%±X\026\020®÷.iF°¶\"¦\033ß\006«ÿL ´KÀ\003Pl\013\002`°(Ûm¥=Ç@_\034¾aã+Úx@­ÝÆ\026÷¢\020b\f,9\016\004Û¥ØÜE\177ü\036-\020íÛoI~\000÷Ü·Ø,o~³ ¿vXt3\bJ'g£\037di§\017P\"µ\013ûÎÅS\\¥F+\037n(¢\"^©\025«G³\007K:­\02270 ²ÄçOú[ $]Ò×Ë\034¹Eç\024\020faL½<0ã\031Y:Æ,\020\f7nvÒ38_\025\"ì\033ßÎ¦\030Qåá\006¸Hâk!PÕØE<L=åx(!BÎËÐu¼D»ÍÖp\021ððaÂ(­\030\031Ìoÿ<OÖ(:Ã\030\0237\004á«2~\035\036\020\005<Ý\024Pq\036\rØÄ£&U\020\013\034Eú\013­»fåê!mî¶\030±fú5,·yyv\033óA¢]Ãîá\0307#o`\\\020Ë\007Áî\027y3^ùh=[\0004(Ý4A$\tøÙ\030L£2#c;ð&ÑÀÐWß¨¡\025Q\033Q´\002\016Ø^\020»\000\030¦Bµ ¥¦_¨àÂý2÷Åo\026ç\0336L8\037¾ãÅäj¡;¯\035\016ê­ w_[¸\023/VúêPüu{%Ì\r\026,>ur\001[\002SÃ5\005\nºr4­\004 zäÊ¤m5õéË!H]:Ê\tK\f1@\025¥ÓT\nPtxcä\020F·bÞ/A\035\\\026y\\\001åÕk(ÿñ(\\¶§÷ì\016#xÕéüSJ7@­\033\022É¦§\000\013\007B¸i\017oÓz(\016<2\021òéó4Ã>úÙÚ\002¹,ßßj­84¯Ûï8~d¤[¹GfèÅy$ò \007Ög\0251EÁ­d\022HòG¹·\"R\000\027ã\0135Õ¢ì£(cí\177'\0276Ås¨Å &­ù¹/\031¾¯\006c£/hh÷ï7¤;OÝD[\013 ¬â°öÚ#J\034F${ó­À`vA.h­k\034IÔÒÙü <@\\ò*®¾$V\016>ÔÞn\021­\0026?Ñòî\riÌçÁ\036² \027\036Ã\035\001Å²q½\"&&¨T±Â×f:ë]Ðwqãú[%\020´üìÝ(j«ªÃ@.\020\025\003ºq¾9!=\016\032¿«\020z\"Þ³èõvmÈMØc ³qñ\020Nf ~HÊ\027U2±jª\031Da u&zývôßî\t'm)Ì;væ ßï¡óÄý)áOói\020\000à3½\033³H8¾j5öö\020ê\030\t\037p­gãeÌKºÁt)\0200\016\021\002HÛcA\007ÕL\0204´0YÏÿ\031Tèl\tª(\023N.ÒÞ­òÿ4ÓÌ\001K½\031c¡~%gµî\\Îå\\UeµÈ\031z8X0±  ê\025\035ÖX®f³Ù¾u±\bÔ´\021~ÿ\bÙ\0020Yµä \000Ñ{¹ö(ûúy\b¿]uLÓ/JNy/Ñ\005þe\030¹¨ä\034ÿ\b®\007¯Fâ~ÆyLÐ£ÕßlaÆ\020M/ØO©û® Ú\t\020\rÅ\020µ6Ú99\n£FÜ\177ÖðÎ\005°8«B\n!\n\024ãÂî´Õ=ÐÔ¯\013]:\006Yew\022¦ïlãÅ(½êó\tÿ\0233`å¨PÔåÊ®;\020¦-¤Öã2ÂåÁEr\tRB\"\020\022þöÙ\177Xv°\r°ØzE\b\020=pu\003ín\023¥Ê\004\007Ùí¸ N\016ó*±9%\034PxºöóN}³Éq´\bö©`\005\b:¥\030è5\030/3JfXÏà·®?÷iá|\016I)F\020`\02076£©£\035÷\026\\7w\001\tqoy\02081*uäO[6Êkð\b½e£\020\022\021âx_P¤zºâÕö(Þ\n+q\025\033à¿F¿ç\bMcH*VKë\005\000\024Ád©ã[â¡èÞØú±ë _ûCº·Í>\003jBæj\0328`R9J\tþ¯ÿ(sÃ\004\020\022À¬aÄû¾YÄ42q ¤\020ÂáS²Ásùhgt½0\tÿq ½p'ÇÆ(&cÆíå¶\004D\033My»8èB\rh\0078\013»ÒyÂC½|hV%Ë'Vç*·ymq:cx \t\037tQEºûoâQ>Ísã\tH\021gò\177UT3(]È\020Slë\r²­Ò\016ÿkâä#\020óþ-OÄè\004eXz±=v\020h½\035\\üjÎÈ\035Vò\002 ßá/«zì\"a\023±\025éôxo<\n\004\017Äømøâi^ó(B×9´KdL¯lENu9Ö(\037êPZ©\\cFY©=Ë^+Rðäw·³\030ÒÆ\006³Í¿¯¤|ÃK\0243zSÛÄ^h(\"8.â+ K®d>à\025[\036JÛ\003%äyoFª¼\034@\020\021úëC\0039j1¾\024(±ìª4ïÔ%ÊÕ\001f\030ø L\017\177É,¼àÐ¡úÕáÒùD\023*ò\020[ Ê(ßëRï.ð\004!<,oñHÒ¿aÏ&í,¹Þ{yó=\020\027µß³9FQù'·pf\013 íÜtwlT×/¦\023:¨7nR}¢¤|×ZôÉ\017\nw? ²ß ×ÉZ\\éªØä*Òs{\003kÈçÑ0û¹ÎÇe^\021ªpá(*&TXµ¿Ô÷ôòµ\"H¾(üE\003\003a\021It0OU¸Eø¸ÎñfU5´\020¡eKoæµüU\026\013%> û\032\032\"Ä÷»}g¯QdËÂ x©\035n\020yÄ\006Æ\030 v!(t¡°Í¬ßh~\006>\t¯ÔA2~¿\004\023ó\026àÇ=)§¨\016_'àØH¤Eè>\030=ú\">êÅbãn\025\013uó\f¬\007X'\025\0200«èç\0355Ë\000G¶ÊÏ|*"))).length();
    int local14_life24 = 16;
    int local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill612_28 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill612_29 = local11_life9;
        byte[] local19_life31 = ((javax.crypto.Cipher)(__sourceSpill612_29)).doFinal(((byte[])(__sourceSpill612_28)));
        java.lang.String __sourceSpill612_34 = ((java.lang.String)(moom.Jl.a(((byte[])(local19_life31))))).intern();
        java.lang.String[] __sourceSpill612_35 = local18_life19;
        int __sourceSpill612_36 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill612_35)[__sourceSpill612_36] = __sourceSpill612_34;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    local17_life23 = ((java.lang.String)((local15_life21 = "\000'+±M çu°QQ?}!Ï \034T\022\027ïµ~\017\004º³=Ðâ/þ=Ä\021\0331:À\027Ï"))).length();
    local14_life24 = 16;
    local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill612_41 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill612_42 = local11_life9;
        byte[] local19_life44 = ((javax.crypto.Cipher)(__sourceSpill612_42)).doFinal(((byte[])(__sourceSpill612_41)));
        java.lang.String __sourceSpill612_47 = ((java.lang.String)(moom.Jl.a(((byte[])(local19_life44))))).intern();
        java.lang.String[] __sourceSpill612_48 = local18_life19;
        int __sourceSpill612_49 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill612_48)[__sourceSpill612_49] = __sourceSpill612_47;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    ab = ((java.lang.String[])(local18_life19));
    bb = ((java.lang.String[])(new java.lang.String[142]));
    fb = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill612_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill612_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill612_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill612_60 = new byte[8];
    (__sourceSpill612_60)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill612_60)[local1_life61] = ((byte) ((int) ((local20_life6 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation612_62 = __sourceSpill612_60;
    ((javax.crypto.Cipher)(__sourceSpill612_57)).init(((int)(__sourceSpill612_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill612_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation612_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[16];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "ý\té`w\034Ù.­\0221«£\032(ÔÀ1ÁàôWÚ¿½u8ÝÞÇaçw\bçä\013®Xm=ÚÇ\002ÞÀ\003ã²PÐéÅ*òÀ\"e_î:â<\036»\007iÜ3qäè?ÞÞXdvúîìSc\177 ^pÚ®c·øÙ¶kqÒ"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill612_71 = local4_life67;
        int __sourceSpill612_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill612_71)).substring(((int)(__sourceSpill612_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill612_76 = local6_life65;
        int __sourceSpill612_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill612_79 = new byte[8];
        (__sourceSpill612_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill612_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill612_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill612_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill612_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill612_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill612_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill612_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill612_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill612_80)).doFinal(((byte[])(__sourceSpill612_79)));
        (__sourceSpill612_76)[__sourceSpill612_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "4\ná³0VóÉí/Z/Ób"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill612_84 = local4_life67;
        int __sourceSpill612_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill612_84)).substring(((int)(__sourceSpill612_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill612_89 = local6_life65;
        int __sourceSpill612_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill612_92 = new byte[8];
        (__sourceSpill612_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill612_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill612_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill612_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill612_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill612_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill612_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill612_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill612_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill612_93)).doFinal(((byte[])(__sourceSpill612_92)));
        (__sourceSpill612_89)[__sourceSpill612_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    db = ((long[])(local6_life65));
    eb = ((java.lang.Integer[])(new java.lang.Integer[16]));
    a = ((java.lang.String)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite612_98(20560, (1628682762476585235L ^ local20_life6))));
    b = ((moom.Jk)(null));
    c = ((moom.Jk)(null));
    d = ((moom.Jk)(null));
    e = ((moom.Jk)(null));
    f = ((moom.Jk)(null));
    g = ((moom.Jk[])(null));
    h = ((moom.Jk[][])(null));
    i = ((moom.Jk)(null));
    j = ((moom.Jj)(new moom.Jj()));
    k = ((moom.Jk)(null));
    l = ((moom.Jj)(new moom.Jj()));
    m = ((moom.Jk)(null));
    n = ((moom.Jj)(new moom.Jj()));
    o = ((moom.Jk)(null));
    p = ((moom.Jj)(new moom.Jj()));
    q = ((moom.JO[])(null));
    r = ((int)(0));
    s = ((moom.Jk)(null));
    t = ((moom.Jk)(null));
    u = ((int)(-1));
    v = ((moom.Jk)(null));
    w = ((moom.Jk)(null));
    x = ((moom.Jk)(null));
    y = ((moom.Jk)(null));
    z = ((moom.Jk)(null));
    A = ((boolean)(true));
    B = ((int)(-1));
    C = ((int)(-1));
    D = ((int)(-1));
    E = ((int)(-1));
    F = ((int)(-1));
    G = ((int)(-1));
    H = ((moom.DR)(null));
    I = ((moom.DR)(null));
    J = ((moom.DR)(null));
    K = ((int[])(null));
    L = ((int[])(null));
    M = ((float[][])(null));
    N = ((float[][])(null));
    O = ((int[])(null));
    P = ((int[])(null));
    Q = ((int[])(null));
    R = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)).a__fE()));
    S = ((net.minecraft.block.state.IBlockState)(((moom.dN)(net.minecraft.init.Blocks.j)).a__fE()));
    T = ((java.util.Random)(new java.util.Random()));
    U = ((moom.Jr)(new moom.Jm()));
    V = ((moom.Jr)(new moom.Jn()));
    W = ((moom.Jr)(new moom.Jo()));
    X = ((moom.Jr)(new moom.Jp()));
    Y = ((moom.Jr)(new moom.Jq()));
}

private static native <E extends Throwable> org.apache.commons.lang3.tuple.Pair __sourceHandlerCall_acadd81eafb45d764159() throws E;
private static final class __SourceHandler_acadd81eafb45d764159 {

public static org.apache.commons.lang3.tuple.Pair f82() throws Throwable {
    int lexicalValue82_125_0;
    int lexicalValue82_196_0;
    int lexicalValue82_196_1;
    moom.JN lexicalValue82_270_0;
    moom.JN lexicalValue82_279_0;
    net.minecraft.entity.Entity[] spill82_0;
    java.lang.String spill82_1;
    java.lang.String spill82_2;
    java.lang.String spill82_3;
    int spill82_4;
    int spill82_5;
    int spill82_6;
    java.lang.String spill82_7;
    int spill82_8;
    java.lang.String spill82_9;
    java.lang.String spill82_10;
    java.lang.String spill82_11;
    long life0_3;
    java.lang.String life3_10;
    net.minecraft.entity.Entity[] life2_11;
    java.lang.String life4_17;
    java.lang.String[] life5_21;
    java.util.HashMap life6_25;
    java.lang.String[] life7_27;
    int life8_30;
    int life9_32;
    java.lang.String life10_39;
    java.lang.String life11_44;
    int life12_52;
    java.util.Set life7_101;
    java.lang.Integer[] life8_107;
    int life10_139;
    int life11_145;
    moom.Jk[] life12_148;
    java.lang.Integer[] life13_150;
    int life14_153;
    int life15_155;
    java.lang.Integer life16_162;
    java.lang.String life17_167;
    moom.Jk life18_172;
    int life19_226;
    moom.JO[] life13_237;
    int life14_239;
    moom.Jk life15_247;
    java.lang.String life16_257;
    java.lang.String life17_260;
    moom.Jk life18_274;
    moom.Jk life19_288;
    moom.JN life20_293;
    moom.JN life21_304;
    moom.JN life22_315;
    moom.JO life23_322;
    lexical_join_294: {
    lexical_join_205: {
    lexical_join_125: {
    lexical_join_113: {
    lexical_join_90: {
    life0_3 = (__fieldRead82_0() ^ 101801518282561L);
    spill82_0 = __call82_1();
    life3_10 = __invokedynamic82_2(23972, (4610166684238862094L ^ life0_3));
    life2_11 = spill82_0;
    life4_17 = __invokedynamic82_3(19565, (752624116684146367L ^ life0_3));
    life5_21 = __call82_4(life3_10, life4_17);
    life6_25 = new java.util.HashMap();
    life7_27 = life5_21;
    life8_30 = (life7_27).length;
    life9_32 = 0;
    lexical_cycle_33: while (true) {
    lexical_join_87: {
    lexical_join_81: {
    lexical_join_79: {
    if (!((life9_32 < life8_30))) {
        break lexical_join_90;
    }
    life10_39 = (life7_27)[life9_32];
    life11_44 = __call82_5(life10_39, life3_10, life4_17);
    life12_52 = __call82_7(life11_44, __invokedynamic82_6(20996, (5427604288278205341L ^ life0_3)));
    if (!((life2_11 != null))) {
        break lexical_join_79;
    }
    if (!((life12_52 == __invokedynamic82_8(27701, (3658422093025488293L ^ life0_3))))) {
        break lexical_join_81;
    }
    java.lang.String __stackOp82_10_0 = life11_44;
    java.lang.String __stackOp82_10_1 = life10_39;
    java.lang.String __stackOp82_10_2 = __invokedynamic82_9(12132, (5280044428367209871L ^ life0_3));
    spill82_1 = __stackOp82_10_2;
    spill82_2 = __stackOp82_10_0;
    spill82_3 = __stackOp82_10_1;
    __discardScalar82_11(__stackOp82_10_2);
    java.lang.String __stackOp82_13_0 = spill82_3;
    java.lang.String __stackOp82_13_1 = __invokedynamic82_12(30302, (6680735104639237343L ^ life0_3));
    __call82_15(__invokedynamic82_14(spill82_1, spill82_2, __stackOp82_13_1, __stackOp82_13_0));
    }
    if (!((life2_11 == null))) {
        break lexical_join_87;
    }
    }
    __call82_17(life6_25, __call82_16(life12_52), life10_39);
    }
    life9_32 += 1;
    if (!((life2_11 == null))) { continue lexical_cycle_33; }
    break lexical_cycle_33;
    }
    }
    life7_101 = __call82_18(life6_25);
    life8_107 = __cast82_20(__call82_19(life7_101, new java.lang.Integer[0]));
    __call82_21(life8_107);
    spill82_4 = (life8_107).length;
    if (!((life2_11 != null))) {
        lexicalValue82_125_0 = spill82_4;
        break lexical_join_125;
    }
    if (!((spill82_4 == 0))) {
        break lexical_join_113;
    }
    return new org.apache.commons.lang3.tuple.ImmutablePair(null, __call82_22(0));
    }
    life9_32 = __call82_23((life8_107)[0]);
    lexicalValue82_125_0 = __call82_24((life8_107)[((life8_107).length - 1)]);
    }
    life10_139 = lexicalValue82_125_0;
    life11_145 = ((life10_139 - life9_32) + 1);
    life12_148 = new moom.Jk[life11_145];
    life13_150 = life8_107;
    life14_153 = (life13_150).length;
    life15_155 = 0;
    lexical_cycle_142: while (true) {
    lexical_join_203: {
    lexical_join_202: {
    lexical_join_196: {
    lexical_join_193: {
    if (!((life15_155 < life14_153))) {
        break lexical_join_205;
    }
    life16_162 = (life13_150)[life15_155];
    life17_167 = __cast82_26(__call82_25(life6_25, life16_162));
    life18_172 = __call82_27(life17_167, -1, -1);
    if (!((life2_11 != null))) {
        break lexical_join_203;
    }
    if (!((life18_172 != null))) {
        break lexical_join_202;
    }
    spill82_5 = __call82_28(life18_172);
    spill82_6 = __invokedynamic82_29(13318, (4336585875454948756L ^ life0_3));
    if (!((life2_11 != null))) {
        lexicalValue82_196_0 = spill82_5;
        lexicalValue82_196_1 = spill82_6;
        break lexical_join_196;
    }
    if (!((spill82_5 < spill82_6))) {
        break lexical_join_193;
    }
    int __stackOp82_32_0 = __call82_30(life18_172);
    java.lang.String __stackOp82_32_1 = life17_167;
    java.lang.String __stackOp82_32_2 = __invokedynamic82_31(9868, (2645083854761962566L ^ life0_3));
    spill82_7 = __stackOp82_32_2;
    spill82_8 = __stackOp82_32_0;
    spill82_9 = __stackOp82_32_1;
    __discardScalar82_33(__stackOp82_32_2);
    java.lang.String __stackOp82_35_0 = spill82_9;
    java.lang.String __stackOp82_35_1 = __invokedynamic82_34(25395, (6802908014960961979L ^ life0_3));
    __call82_37(__invokedynamic82_36(spill82_7, spill82_8, __stackOp82_35_1, __stackOp82_35_0));
    if (!((life2_11 == null))) {
        break lexical_join_202;
    }
    }
    lexicalValue82_196_0 = __call82_38(life16_162);
    lexicalValue82_196_1 = life9_32;
    }
    life19_226 = (lexicalValue82_196_0 - lexicalValue82_196_1);
    (life12_148)[life19_226] = life18_172;
    }
    life15_155 += 1;
    }
    if (!((life2_11 == null))) { continue lexical_cycle_142; }
    break lexical_cycle_142;
    }
    }
    life13_237 = new moom.JO[(life12_148).length];
    life14_239 = 0;
    lexical_cycle_211: while (true) {
    lexical_join_292: {
    lexical_join_291: {
    lexical_join_279: {
    lexical_join_278: {
    lexical_join_270: {
    lexical_join_269: {
    if (!((life14_239 < (life12_148).length))) {
        break lexical_join_294;
    }
    life15_247 = (life12_148)[life14_239];
    if (!((life2_11 != null))) {
        break lexical_join_292;
    }
    if (!((life15_247 != null))) {
        break lexical_join_291;
    }
    life16_257 = __fieldRead82_39(life15_247);
    life17_260 = __fieldRead82_40(life15_247);
    spill82_10 = life17_260;
    java.lang.String __stackOp82_41_0 = life16_257;
    java.lang.String __stackOp82_41_1 = "/";
    life18_274 = __call82_44(__invokedynamic82_43(spill82_10, __stackOp82_41_1, __stackOp82_41_0, __invokedynamic82_42(1113, (575628289698696937L ^ life0_3))), -1, -1);
    spill82_11 = life17_260;
    java.lang.String __stackOp82_45_0 = life16_257;
    java.lang.String __stackOp82_45_1 = "/";
    life19_288 = __call82_48(__invokedynamic82_47(spill82_11, __stackOp82_45_1, __stackOp82_45_0, __invokedynamic82_46(25779, (4992772150304402988L ^ life0_3))), -1, -1);
    life20_293 = new moom.JN(life15_247);
    if (!((life18_274 != null))) {
        break lexical_join_269;
    }
    lexicalValue82_270_0 = new moom.JN(life18_274);
    break lexical_join_270;
    }
    lexicalValue82_270_0 = null;
    }
    life21_304 = lexicalValue82_270_0;
    if (!((life19_288 != null))) {
        break lexical_join_278;
    }
    lexicalValue82_279_0 = new moom.JN(life19_288);
    break lexical_join_279;
    }
    lexicalValue82_279_0 = null;
    }
    life22_315 = lexicalValue82_279_0;
    life23_322 = new moom.JO(life20_293, life21_304, life22_315);
    (life13_237)[life14_239] = life23_322;
    }
    life14_239 += 1;
    }
    if (!((life2_11 == null))) { continue lexical_cycle_211; }
    break lexical_cycle_211;
    }
    }
    return new org.apache.commons.lang3.tuple.ImmutablePair(life13_237, __call82_49(life9_32));
}
public static void h82_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008200_0(p0);
}
public static void h82_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008201_0(p0);
}
public static void h82_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008202_0(p0);
}
public static void h82_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008203_0(p0);
}
public static void h82_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008204_0(p0);
}
public static void h82_5(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008205_0(p0);
}
public static void h82_6(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008206_0(p0);
}
public static void h82_7(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008207_0(p0);
}
public static void h82_8(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008208_0(p0);
}
public static void h82_9(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008209_0(p0);
}
public static void h82_10(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008210_0(p0);
}
public static void h82_11(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008211_0(p0);
}
public static void h82_12(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008212_0(p0);
}
private static native long __fieldRead82_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call82_1() throws Throwable;
private static native java.lang.String __invokedynamic82_2(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic82_3(int a0, long a1) throws Throwable;
private static native java.lang.String[] __call82_4(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call82_5(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native int __invokedynamic82_6(int a0, long a1) throws Throwable;
private static native int __call82_7(java.lang.String a0, int a1) throws Throwable;
private static native int __invokedynamic82_8(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic82_9(int a0, long a1) throws Throwable;
private static native void __discardScalar82_11(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic82_12(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic82_14(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native void __call82_15(java.lang.String a0) throws Throwable;
private static native java.lang.Integer __call82_16(int a0) throws Throwable;
private static native java.lang.Object __call82_17(java.util.HashMap a0, java.lang.Integer a1, java.lang.String a2) throws Throwable;
private static native java.util.Set __call82_18(java.util.HashMap a0) throws Throwable;
private static native java.lang.Object[] __call82_19(java.util.Set a0, java.lang.Integer[] a1) throws Throwable;
private static native java.lang.Integer[] __cast82_20(java.lang.Object[] a0) throws Throwable;
private static native void __call82_21(java.lang.Integer[] a0) throws Throwable;
private static native java.lang.Integer __call82_22(int a0) throws Throwable;
private static native int __call82_23(java.lang.Integer a0) throws Throwable;
private static native int __call82_24(java.lang.Integer a0) throws Throwable;
private static native java.lang.Object __call82_25(java.util.HashMap a0, java.lang.Integer a1) throws Throwable;
private static native java.lang.String __cast82_26(java.lang.Object a0) throws Throwable;
private static native moom.Jk __call82_27(java.lang.String a0, int a1, int a2) throws Throwable;
private static native int __call82_28(moom.Jk a0) throws Throwable;
private static native int __invokedynamic82_29(int a0, long a1) throws Throwable;
private static native int __call82_30(moom.Jk a0) throws Throwable;
private static native java.lang.String __invokedynamic82_31(int a0, long a1) throws Throwable;
private static native void __discardScalar82_33(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic82_34(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic82_36(java.lang.String a0, int a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native void __call82_37(java.lang.String a0) throws Throwable;
private static native int __call82_38(java.lang.Integer a0) throws Throwable;
private static native java.lang.String __fieldRead82_39(moom.Jk a0) throws Throwable;
private static native java.lang.String __fieldRead82_40(moom.Jk a0) throws Throwable;
private static native java.lang.String __invokedynamic82_42(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic82_43(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native moom.Jk __call82_44(java.lang.String a0, int a1, int a2) throws Throwable;
private static native java.lang.String __invokedynamic82_46(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic82_47(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native moom.Jk __call82_48(java.lang.String a0, int a1, int a2) throws Throwable;
private static native java.lang.Integer __call82_49(int a0) throws Throwable;
private static native java.lang.Exception __call1008200_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008201_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008202_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008203_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008204_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008205_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008206_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008207_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008208_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008209_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008210_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008211_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008212_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> float __sourceHandlerCall_5a67fd17541838d4357e(float a0) throws E;
private static final class __SourceHandler_5a67fd17541838d4357e {

public static float f1274(float p0) throws Throwable {
    long life1_3;
    float life3_14;
    life1_3 = (__fieldRead1274_0() ^ 51414754907098L);
    if ((__fieldRead1274_1() <= 0)) {
        return p0;
    }
    life3_14 = (0x1.3ap9f / ((float) __fieldRead1274_2()));
    return (p0 * life3_14);
}
public static void h1274_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1127400_0(p0);
}
private static native long __fieldRead1274_0() throws Throwable;
private static native int __fieldRead1274_1() throws Throwable;
private static native int __fieldRead1274_2() throws Throwable;
private static native java.lang.Exception __call1127400_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_b8df8bbc293628e3d1bf(int a0) throws E;
private static final class __SourceHandler_b8df8bbc293628e3d1bf {

public static int f1275(int p0) throws Throwable {
    long life1_3;
    int life3_20;
    life1_3 = (__fieldRead1275_0() ^ 46576397165495L);
    if ((__fieldRead1275_1() == null)) {
        return -1;
    }
    life3_20 = ((p0 * __call1275_3(__fieldRead1275_2())) / __invokedynamic1275_4(9112, (7192288082104186608L ^ life1_3)));
    return __call1275_6(__fieldRead1275_5(), life3_20);
}
public static void h1275_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1127500_0(p0);
}
private static native long __fieldRead1275_0() throws Throwable;
private static native moom.Jk __fieldRead1275_1() throws Throwable;
private static native moom.Jk __fieldRead1275_2() throws Throwable;
private static native int __call1275_3(moom.Jk a0) throws Throwable;
private static native int __invokedynamic1275_4(int a0, long a1) throws Throwable;
private static native moom.Jk __fieldRead1275_5() throws Throwable;
private static native int __call1275_6(moom.Jk a0, int a1) throws Throwable;
private static native java.lang.Exception __call1127500_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_1cfca129f8d366901878(int a0, int a1) throws E;
private static final class __SourceHandler_1cfca129f8d366901878 {

public static int f721(int p0, int p1) throws Throwable {
    int forwardValue721_29_0;
    int forwardValue721_31_0;
    int forwardValue721_33_0;
    int spill721_0;
    int spill721_1;
    int spill721_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    int life5_34;
    forward_join_33: {
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    forward_join_29: {
    forward_join_10: {
    life2_3 = (__fieldRead721_0() ^ 112057632383201L);
    life4_5 = __call721_1();
    if (!((__fieldRead721_2() == null))) {
        break forward_join_10;
    }
    return p1;
    }
    spill721_0 = p0;
    if (!((life4_5 != null))) {
        forwardValue721_33_0 = spill721_0;
        break forward_join_33;
    }
    if (!((spill721_0 >= 0))) {
        break forward_join_32;
    }
    spill721_1 = p0;
    if (!((life4_5 != null))) {
        forwardValue721_33_0 = spill721_1;
        break forward_join_33;
    }
    if (!((spill721_1 < (__fieldRead721_3()).length))) {
        break forward_join_32;
    }
    life5_34 = (__fieldRead721_4())[p0];
    spill721_2 = life5_34;
    if (!((life4_5 != null))) {
        forwardValue721_29_0 = spill721_2;
        break forward_join_29;
    }
    if (!((spill721_2 < 0))) {
        break forward_join_30;
    }
    forwardValue721_29_0 = p1;
    }
    forwardValue721_31_0 = forwardValue721_29_0;
    break forward_join_31;
    }
    forwardValue721_31_0 = life5_34;
    }
    return forwardValue721_31_0;
    }
    forwardValue721_33_0 = p1;
    }
    return forwardValue721_33_0;
}
public static void h721_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1072100_0(p0);
}
public static void h721_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1072101_0(p0);
}
public static void h721_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1072102_0(p0);
}
public static void h721_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1072103_0(p0);
}
public static void h721_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1072104_0(p0);
}
private static native long __fieldRead721_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call721_1() throws Throwable;
private static native int[] __fieldRead721_2() throws Throwable;
private static native int[] __fieldRead721_3() throws Throwable;
private static native int[] __fieldRead721_4() throws Throwable;
private static native java.lang.Exception __call1072100_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1072101_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1072102_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1072103_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1072104_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_73482fe5d82eddc8c47c(java.lang.String a0) throws E;
private static final class __SourceHandler_73482fe5d82eddc8c47c {

public static int f301(java.lang.String p0) throws Throwable {
    java.lang.String forwardValue301_16_0;
    java.lang.String spill301_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    java.lang.String life0_19;
    forward_join_16: {
    forward_join_12: {
    life1_3 = (__fieldRead301_0() ^ 34086764214711L);
    life3_5 = __call301_1();
    spill301_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue301_16_0 = spill301_0;
        break forward_join_16;
    }
    if (!((spill301_0 == null))) {
        break forward_join_12;
    }
    return -1;
    }
    life0_19 = __call301_2(p0);
    forwardValue301_16_0 = life0_19;
    }
    return (__call301_4(forwardValue301_16_0, __invokedynamic301_3(28699, (2595831824518971259L ^ life1_3))) & __invokedynamic301_5(26795, (3209709015529613256L ^ life1_3)));
}
public static int h301_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call2030100_0(p0);
}
public static int h301_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call2030101_0(p0);
}
public static int h301_2(java.lang.NumberFormatException p0) throws Throwable {
    java.lang.NumberFormatException local1 = p0;
    return -1;
}
private static native long __fieldRead301_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call301_1() throws Throwable;
private static native java.lang.String __call301_2(java.lang.String a0) throws Throwable;
private static native int __invokedynamic301_3(int a0, long a1) throws Throwable;
private static native int __call301_4(java.lang.String a0, int a1) throws Throwable;
private static native int __invokedynamic301_5(int a0, long a1) throws Throwable;
private static native java.lang.Exception __call2030100_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call2030101_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_b0512a21b3064216539f(java.lang.String a0, int a1) throws E;
private static final class __SourceHandler_b0512a21b3064216539f {

public static int f302(java.lang.String p0, int p1) throws Throwable {
    java.io.InputStream forwardValue302_19_0;
    java.awt.image.BufferedImage forwardValue302_30_0;
    int forwardValue302_31_0;
    java.io.InputStream spill302_0;
    java.awt.image.BufferedImage spill302_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    java.io.InputStream life5_11;
    java.awt.image.BufferedImage life6_23;
    forward_join_31: {
    forward_join_30: {
    forward_join_29: {
    forward_join_19: {
    forward_join_18: {
    life2_3 = (__fieldRead302_0() ^ 23127066128517L);
    life4_5 = __call302_1();
    life5_11 = __call302_2(new moom.DD(p0));
    spill302_0 = life5_11;
    if (!((life4_5 != null))) {
        forwardValue302_19_0 = spill302_0;
        break forward_join_19;
    }
    if (!((spill302_0 == null))) {
        break forward_join_18;
    }
    return p1;
    }
    forwardValue302_19_0 = life5_11;
    }
    life6_23 = __call302_3(forwardValue302_19_0);
    __call302_4(life5_11);
    spill302_1 = life6_23;
    if (!((life4_5 != null))) {
        forwardValue302_30_0 = spill302_1;
        break forward_join_30;
    }
    if (!((spill302_1 == null))) {
        break forward_join_29;
    }
    forwardValue302_31_0 = p1;
    break forward_join_31;
    }
    forwardValue302_30_0 = life6_23;
    }
    forwardValue302_31_0 = __call302_5(forwardValue302_30_0);
    }
    return forwardValue302_31_0;
}
public static int h302_0(java.io.IOException p0) throws Throwable {
    throw __call2030200_0(p0);
}
public static int h302_1(java.io.IOException p0) throws Throwable {
    throw __call2030201_0(p0);
}
public static int h302_2(java.io.IOException p0) throws Throwable {
    throw __call2030202_0(p0);
}
public static int h302_3(java.io.IOException p0, int p1) throws Throwable {
    java.io.IOException local2 = p0;
    return p1;
}
private static native long __fieldRead302_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call302_1() throws Throwable;
private static native java.io.InputStream __call302_2(moom.DD a0) throws Throwable;
private static native java.awt.image.BufferedImage __call302_3(java.io.InputStream a0) throws Throwable;
private static native void __call302_4(java.io.InputStream a0) throws Throwable;
private static native int __call302_5(java.awt.image.BufferedImage a0) throws Throwable;
private static native java.lang.Exception __call2030200_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2030201_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2030202_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> moom.Jk __sourceHandlerCall_b3408dd5ca3ff510ceeb(java.lang.String a0, int a1, int a2) throws E;
private static final class __SourceHandler_b3408dd5ca3ff510ceeb {

public static moom.Jk f303(java.lang.String p0, int p1, int p2) throws Throwable {
    java.lang.Object forwardValue303_90_0;
    moom.Jk forwardValue303_109_0;
    moom.DD spill303_0;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    moom.DD life6_10;
    moom.OH life7_33;
    java.lang.String life8_46;
    moom.DD life9_51;
    java.io.InputStream life10_62;
    moom.Jk life10_110;
    forward_join_109: {
    forward_join_108: {
    forward_join_93: {
    forward_join_90: {
    forward_join_73: {
    forward_join_27: {
    forward_join_18: {
    life3_3 = (__fieldRead303_0() ^ 93171786945773L);
    life5_5 = __call303_1();
    life6_10 = new moom.DD(p0);
    if (!((life5_5 != null))) {
        break forward_join_27;
    }
    if (!((!__call303_2(life6_10)))) {
        break forward_join_18;
    }
    return null;
    }
    java.lang.String __stackOp303_4_0 = p0;
    java.lang.String __stackOp303_4_1 = __invokedynamic303_3(18063, (3692354025077206808L ^ life3_3));
    __call303_6(__invokedynamic303_5(__stackOp303_4_1, __stackOp303_4_0));
    }
    life7_33 = new moom.OH();
    life8_46 = __call303_9(p0, __invokedynamic303_7(5206, (5837073432826723629L ^ life3_3)), __invokedynamic303_8(15468, (447474167292269881L ^ life3_3)));
    life9_51 = new moom.DD(life8_46);
    spill303_0 = life9_51;
    if (!((life5_5 != null))) {
        forwardValue303_90_0 = spill303_0;
        break forward_join_90;
    }
    if (!(__call303_10(spill303_0))) {
        break forward_join_73;
    }
    life10_62 = __call303_11(life9_51);
    __call303_12(life7_33, life10_62);
    __call303_13(life10_62);
    java.lang.String __stackOp303_15_0 = life8_46;
    java.lang.String __stackOp303_15_1 = __invokedynamic303_14(17963, (1030788971195592496L ^ life3_3));
    __call303_17(__invokedynamic303_16(__stackOp303_15_1, __stackOp303_15_0));
    if (!((life5_5 == null))) {
        break forward_join_93;
    }
    }
    __call303_20(life7_33, __invokedynamic303_18(5035, (825781610680072832L ^ life3_3)), __fieldRead303_19());
    forwardValue303_90_0 = __call303_22(life7_33, __invokedynamic303_21(28706, (5089734328145991981L ^ life3_3)), p0);
    }
    __discardScalar303_23(forwardValue303_90_0);
    life8_46 = p0;
    }
    life10_110 = new moom.Jk(life7_33, life8_46, p1, p2, __fieldRead303_24());
    if (!((!__call303_25(life10_110, life8_46)))) {
        break forward_join_108;
    }
    forwardValue303_109_0 = null;
    break forward_join_109;
    }
    forwardValue303_109_0 = life10_110;
    }
    return forwardValue303_109_0;
}
public static moom.Jk h303_0(java.lang.Exception p0) throws Throwable {
    throw __call2030300_0(p0);
}
public static moom.Jk h303_1(java.lang.Exception p0) throws Throwable {
    throw __call2030301_0(p0);
}
public static moom.Jk h303_2(java.lang.Exception p0) throws Throwable {
    throw __call2030302_0(p0);
}
public static moom.Jk h303_3(java.lang.Exception p0) throws Throwable {
    throw __call2030303_0(p0);
}
public static moom.Jk h303_4(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    __call2030304_0(local1);
    return null;
}
private static native long __fieldRead303_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call303_1() throws Throwable;
private static native boolean __call303_2(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic303_3(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic303_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call303_6(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic303_7(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic303_8(int a0, long a1) throws Throwable;
private static native java.lang.String __call303_9(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native boolean __call303_10(moom.DD a0) throws Throwable;
private static native java.io.InputStream __call303_11(moom.DD a0) throws Throwable;
private static native void __call303_12(moom.OH a0, java.io.InputStream a1) throws Throwable;
private static native void __call303_13(java.io.InputStream a0) throws Throwable;
private static native java.lang.String __invokedynamic303_14(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic303_16(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call303_17(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic303_18(int a0, long a1) throws Throwable;
private static native java.lang.String __fieldRead303_19() throws Throwable;
private static native java.lang.Object __call303_20(moom.OH a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic303_21(int a0, long a1) throws Throwable;
private static native java.lang.Object __call303_22(moom.OH a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __discardScalar303_23(java.lang.Object a0) throws Throwable;
private static native java.lang.String __fieldRead303_24() throws Throwable;
private static native boolean __call303_25(moom.Jk a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call2030300_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2030301_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2030302_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2030303_0(java.lang.Exception a0) throws Throwable;
private static native void __call2030304_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_52c092533b3fc6dc2e2e(java.lang.String a0, java.lang.String a1, java.lang.String[] a2, java.lang.String a3) throws E;
private static final class __SourceHandler_52c092533b3fc6dc2e2e {

public static java.lang.String f304(java.lang.String p0, java.lang.String p1, java.lang.String[] p2, java.lang.String p3) throws Throwable {
    java.lang.String forwardValue304_36_0;
    java.lang.String spill304_0;
    java.lang.String spill304_1;
    java.lang.String spill304_2;
    java.lang.String spill304_3;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    moom.DD life7_10;
    java.io.InputStream life8_13;
    moom.OH life9_21;
    java.lang.String life10_30;
    java.util.List life11_42;
    forward_join_75: {
    forward_join_71: {
    forward_join_37: {
    forward_join_36: {
    forward_join_18: {
    life4_3 = (__fieldRead304_0() ^ 31719134356217L);
    life6_5 = __call304_1();
    life7_10 = new moom.DD(p0);
    life8_13 = __call304_2(life7_10);
    if (!((life8_13 == null))) {
        break forward_join_18;
    }
    return p3;
    }
    life9_21 = new moom.OH();
    __call304_3(life9_21, life8_13);
    __call304_4(life8_13);
    life10_30 = __call304_5(life9_21, p1);
    spill304_0 = life10_30;
    if (!((life6_5 != null))) {
        forwardValue304_36_0 = spill304_0;
        break forward_join_36;
    }
    if (!((spill304_0 == null))) {
        break forward_join_37;
    }
    forwardValue304_36_0 = p3;
    }
    return forwardValue304_36_0;
    }
    life11_42 = __call304_6(p2);
    if (!((life6_5 != null))) {
        break forward_join_75;
    }
    if (!((!__call304_7(life11_42, life10_30)))) {
        break forward_join_71;
    }
    java.lang.String __stackOp304_9_0 = p1;
    java.lang.String __stackOp304_9_1 = life10_30;
    java.lang.String __stackOp304_9_2 = __invokedynamic304_8(8622, (392733024364789437L ^ life4_3));
    spill304_1 = __stackOp304_9_2;
    spill304_2 = __stackOp304_9_0;
    spill304_3 = __stackOp304_9_1;
    __discardScalar304_10(__stackOp304_9_2);
    java.lang.String __stackOp304_11_0 = spill304_3;
    java.lang.String __stackOp304_11_1 = "=";
    __call304_13(__invokedynamic304_12(spill304_1, spill304_2, __stackOp304_11_1, __stackOp304_11_0));
    java.lang.String __stackOp304_16_0 = __call304_14(p2);
    java.lang.String __stackOp304_16_1 = __invokedynamic304_15(7576, (7014416911994798804L ^ life4_3));
    __call304_18(__invokedynamic304_17(__stackOp304_16_1, __stackOp304_16_0));
    return p3;
    }
    __call304_20(__invokedynamic304_19(p1, life10_30));
    }
    return life10_30;
}
public static java.lang.String h304_0(java.io.FileNotFoundException p0) throws Throwable {
    throw __call2030400_0(p0);
}
public static java.lang.String h304_1(java.io.FileNotFoundException p0) throws Throwable {
    throw __call2030401_0(p0);
}
public static java.lang.String h304_2(java.io.FileNotFoundException p0, java.lang.String p1) throws Throwable {
    java.io.FileNotFoundException local2 = p0;
    return p1;
}
public static java.lang.String h304_3(java.io.IOException p0, java.lang.String p1) throws Throwable {
    java.io.IOException local2 = p0;
    __call2030403_0(local2);
    return p1;
}
private static native long __fieldRead304_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call304_1() throws Throwable;
private static native java.io.InputStream __call304_2(moom.DD a0) throws Throwable;
private static native void __call304_3(moom.OH a0, java.io.InputStream a1) throws Throwable;
private static native void __call304_4(java.io.InputStream a0) throws Throwable;
private static native java.lang.String __call304_5(moom.OH a0, java.lang.String a1) throws Throwable;
private static native java.util.List __call304_6(java.lang.String[] a0) throws Throwable;
private static native boolean __call304_7(java.util.List a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic304_8(int a0, long a1) throws Throwable;
private static native void __discardScalar304_10(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic304_12(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native void __call304_13(java.lang.String a0) throws Throwable;
private static native java.lang.String __call304_14(java.lang.String[] a0) throws Throwable;
private static native java.lang.String __invokedynamic304_15(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic304_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call304_18(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic304_19(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call304_20(java.lang.String a0) throws Throwable;
private static native java.lang.Exception __call2030400_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call2030401_0(java.io.FileNotFoundException a0) throws Throwable;
private static native void __call2030403_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> moom.Jk __sourceHandlerCall_0aab98e65562a2249cbf(java.lang.String a0, java.lang.String[] a1, int a2, int a3) throws E;
private static final class __SourceHandler_0aab98e65562a2249cbf {

public static moom.Jk f722(java.lang.String p0, java.lang.String[] p1, int p2, int p3) throws Throwable {
    net.minecraft.entity.Entity[] spill722_0;
    long life4_3;
    java.lang.String[] life7_6;
    net.minecraft.entity.Entity[] life6_7;
    int life8_10;
    int life9_12;
    java.lang.String life10_19;
    java.lang.String life11_21;
    java.lang.String life11_25;
    moom.Jk life12_30;
    lexical_join_40: {
    life4_3 = (__fieldRead722_0() ^ 43446078602120L);
    spill722_0 = __call722_1();
    life7_6 = p1;
    life6_7 = spill722_0;
    life8_10 = (life7_6).length;
    life9_12 = 0;
    lexical_cycle_13: while (true) {
    lexical_join_38: {
    lexical_join_37: {
    if (!((life9_12 < life8_10))) {
        break lexical_join_40;
    }
    life10_19 = (life7_6)[life9_12];
    life11_21 = life10_19;
    life11_25 = __invokedynamic722_2(p0, life11_21);
    life12_30 = __call722_3(life11_25, p2, p3);
    if (!((life6_7 != null))) {
        break lexical_join_38;
    }
    if (!((life12_30 != null))) {
        break lexical_join_37;
    }
    return life12_30;
    }
    life9_12 += 1;
    }
    if (!((life6_7 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return null;
}
public static void h722_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1072200_0(p0);
}
public static void h722_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1072201_0(p0);
}
private static native long __fieldRead722_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call722_1() throws Throwable;
private static native java.lang.String __invokedynamic722_2(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native moom.Jk __call722_3(java.lang.String a0, int a1, int a2) throws Throwable;
private static native java.lang.Exception __call1072200_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1072201_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> moom.Jk[][] __sourceHandlerCall_b926d168acb9cac9469e(java.util.List a0) throws E;
private static final class __SourceHandler_b926d168acb9cac9469e {

public static moom.Jk[][] f723(java.util.List p0) throws Throwable {
    net.minecraft.entity.Entity[] spill723_0;
    long life1_3;
    moom.Jk[][] life4_8;
    net.minecraft.entity.Entity[] life3_9;
    int life5_11;
    java.util.List life6_20;
    moom.Jk[] life7_33;
    lexical_join_38: {
    life1_3 = (__fieldRead723_0() ^ 30667217183068L);
    spill723_0 = __call723_1();
    life4_8 = new moom.Jk[__call723_2(p0)][];
    life3_9 = spill723_0;
    life5_11 = 0;
    lexical_cycle_12: while (true) {
    lexical_join_36: {
    lexical_join_35: {
    if (!((life5_11 < __call723_3(p0)))) {
        break lexical_join_38;
    }
    life6_20 = __cast723_5(__call723_4(p0, life5_11));
    if (!((life3_9 != null))) {
        break lexical_join_36;
    }
    if (!((life6_20 != null))) {
        break lexical_join_35;
    }
    life7_33 = __cast723_7(__call723_6(life6_20, new moom.Jk[0]));
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
public static void h723_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1072300_0(p0);
}
private static native long __fieldRead723_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call723_1() throws Throwable;
private static native int __call723_2(java.util.List a0) throws Throwable;
private static native int __call723_3(java.util.List a0) throws Throwable;
private static native java.lang.Object __call723_4(java.util.List a0, int a1) throws Throwable;
private static native java.util.List __cast723_5(java.lang.Object a0) throws Throwable;
private static native java.lang.Object[] __call723_6(java.util.List a0, moom.Jk[] a1) throws Throwable;
private static native moom.Jk[] __cast723_7(java.lang.Object[] a0) throws Throwable;
private static native java.lang.Exception __call1072300_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_b99ca64143b8dfe82777(java.util.Properties a0, java.lang.String a1) throws E;
private static final class __SourceHandler_b99ca64143b8dfe82777 {

public static int f83(java.util.Properties p0, java.lang.String p1) throws Throwable {
    java.lang.String forwardValue83_20_0;
    net.minecraft.entity.Entity[] spill83_0;
    java.lang.String spill83_1;
    java.lang.String spill83_2;
    java.lang.String spill83_3;
    java.lang.String spill83_4;
    java.lang.String spill83_5;
    long life2_3;
    java.lang.String life5_8;
    net.minecraft.entity.Entity[] life4_9;
    int life6_26;
    forward_join_55: {
    forward_join_45: {
    forward_join_43: {
    forward_join_20: {
    forward_join_16: {
    life2_3 = (__fieldRead83_0() ^ 40302656562605L);
    spill83_0 = __call83_1();
    life5_8 = __call83_2(p0, p1);
    life4_9 = spill83_0;
    spill83_1 = life5_8;
    if (!((life4_9 != null))) {
        forwardValue83_20_0 = spill83_1;
        break forward_join_20;
    }
    if (!((spill83_1 == null))) {
        break forward_join_16;
    }
    return -1;
    }
    life5_8 = __call83_3(life5_8);
    forwardValue83_20_0 = life5_8;
    }
    life6_26 = __call83_4(forwardValue83_20_0);
    if (!((life4_9 != null))) {
        break forward_join_43;
    }
    if (!((life6_26 < 0))) {
        break forward_join_45;
    }
    java.lang.String __stackOp83_6_0 = p1;
    java.lang.String __stackOp83_6_1 = life5_8;
    java.lang.String __stackOp83_6_2 = __invokedynamic83_5(15051, (3748048083715072651L ^ life2_3));
    spill83_2 = __stackOp83_6_2;
    spill83_3 = __stackOp83_6_0;
    spill83_4 = __stackOp83_6_1;
    __discardScalar83_7(__stackOp83_6_2);
    java.lang.String __stackOp83_9_0 = spill83_4;
    java.lang.String __stackOp83_9_1 = __invokedynamic83_8(28502, (7830371303714649962L ^ life2_3));
    __call83_11(__invokedynamic83_10(spill83_2, spill83_3, __stackOp83_9_1, __stackOp83_9_0));
    }
    if (!((life4_9 == null))) {
        break forward_join_55;
    }
    }
    spill83_5 = p1;
    java.lang.String __stackOp83_13_0 = life5_8;
    java.lang.String __stackOp83_13_1 = __invokedynamic83_12(28502, (7830371303714649962L ^ life2_3));
    __call83_15(__invokedynamic83_14(spill83_5, __stackOp83_13_1, __stackOp83_13_0));
    }
    return life6_26;
}
public static void h83_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008300_0(p0);
}
public static void h83_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008301_0(p0);
}
public static void h83_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008302_0(p0);
}
public static void h83_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008303_0(p0);
}
public static void h83_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008304_0(p0);
}
private static native long __fieldRead83_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call83_1() throws Throwable;
private static native java.lang.String __call83_2(java.util.Properties a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call83_3(java.lang.String a0) throws Throwable;
private static native int __call83_4(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic83_5(int a0, long a1) throws Throwable;
private static native void __discardScalar83_7(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic83_8(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic83_10(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native void __call83_11(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic83_12(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic83_14(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call83_15(java.lang.String a0) throws Throwable;
private static native java.lang.Exception __call1008300_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008301_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008302_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008303_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008304_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int[] __sourceHandlerCall_6dac47ef1fbaa6eb8d41(java.util.Properties a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws E;
private static final class __SourceHandler_6dac47ef1fbaa6eb8d41 {

public static int[] f711(java.util.Properties p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws Throwable {
    java.lang.String forestValue711_39_0;
    java.lang.String forestValue711_39_1;
    int forestValue711_61_0;
    int forestValue711_99_0;
    int forestValue711_124_0;
    int forestValue711_141_0;
    int[] forestValue711_163_0;
    net.minecraft.entity.Entity[] spill711_0;
    java.lang.String spill711_1;
    java.lang.String spill711_2;
    boolean spill711_3;
    int spill711_4;
    int spill711_5;
    java.lang.String spill711_6;
    java.lang.String spill711_7;
    java.lang.String spill711_8;
    int spill711_9;
    java.lang.String spill711_10;
    int[] spill711_11;
    long life4_3;
    java.util.ArrayList life7_7;
    java.util.Set life8_11;
    int life9_13;
    net.minecraft.entity.Entity[] life6_14;
    java.util.Iterator life10_17;
    java.lang.String life11_26;
    java.lang.String life12_30;
    java.lang.String life13_48;
    int life14_51;
    int life15_75;
    int[] life10_178;
    int life11_180;
    forest_join_163: {
    forest_join_162: {
    forest_join_141: {
    forest_join_129: {
    forest_join_124: {
    forest_join_123: {
    life4_3 = (__fieldRead711_0() ^ 75921662671273L);
    life7_7 = new java.util.ArrayList();
    spill711_0 = __call711_1();
    life8_11 = __call711_2(p0);
    life9_13 = 0;
    life6_14 = spill711_0;
    life10_17 = __call711_3(life8_11);
    forest_cycle_18: while (true) {
    forest_join_121: {
    forest_join_120: {
    forest_join_114: {
    forest_join_99: {
    forest_join_85: {
    forest_join_61: {
    forest_join_59: {
    forest_join_39: {
    if (!(__call711_4(life10_17))) {
        break forest_join_123;
    }
    life11_26 = __cast711_6(__call711_5(life10_17));
    life12_30 = __call711_7(p0, life11_26);
    spill711_1 = life11_26;
    spill711_2 = p2;
    if (!((life6_14 != null))) {
        forestValue711_39_0 = spill711_1;
        forestValue711_39_1 = spill711_2;
        break forest_join_39;
    }
    spill711_3 = __call711_8(spill711_1, spill711_2);
    if (!((life6_14 != null))) {
        forestValue711_124_0 = __integerCategory711_9(spill711_3);
        break forest_join_124;
    }
    if (!(spill711_3)) {
        break forest_join_121;
    }
    forestValue711_39_0 = life11_26;
    forestValue711_39_1 = p2;
    }
    life13_48 = __call711_10(forestValue711_39_0, forestValue711_39_1);
    life14_51 = __call711_11(life13_48);
    spill711_4 = life14_51;
    if (!((life6_14 != null))) {
        forestValue711_61_0 = spill711_4;
        break forest_join_61;
    }
    if (!((spill711_4 < 0))) {
        break forest_join_59;
    }
    java.lang.String __stackOp711_13_0 = life11_26;
    java.lang.String __stackOp711_13_1 = __invokedynamic711_12(18383, (8154154901004026753L ^ life4_3));
    __call711_15(__invokedynamic711_14(__stackOp711_13_1, __stackOp711_13_0));
    if (!((life6_14 == null))) {
        break forest_join_121;
    }
    }
    forestValue711_61_0 = __call711_16(life12_30);
    }
    life15_75 = forestValue711_61_0;
    spill711_5 = life15_75;
    if (!((life6_14 != null))) {
        forestValue711_99_0 = spill711_5;
        break forest_join_99;
    }
    if (!((spill711_5 < 0))) {
        break forest_join_85;
    }
    java.lang.String __stackOp711_18_0 = life11_26;
    java.lang.String __stackOp711_18_1 = life12_30;
    java.lang.String __stackOp711_18_2 = __invokedynamic711_17(10888, (9038805904688934584L ^ life4_3));
    spill711_6 = __stackOp711_18_2;
    spill711_7 = __stackOp711_18_0;
    spill711_8 = __stackOp711_18_1;
    __discardScalar711_19(__stackOp711_18_2);
    java.lang.String __stackOp711_21_0 = spill711_8;
    java.lang.String __stackOp711_21_1 = __invokedynamic711_20(28502, (7830476200541563758L ^ life4_3));
    __call711_23(__invokedynamic711_22(spill711_6, spill711_7, __stackOp711_21_1, __stackOp711_21_0));
    if (!((life6_14 == null))) {
        break forest_join_121;
    }
    }
    forest_cycle_85: while (true) {
    if (!((__call711_24(life7_7) <= life14_51))) {
        break forest_join_114;
    }
    __call711_26(life7_7, __call711_25(-1));
    if (!((life6_14 != null))) {
        break forest_join_120;
    }
    if (!((life6_14 == null))) {
        continue forest_cycle_85;
    }
    break forest_cycle_85;
    }
    break forest_join_114;
    }
    forest_cycle_99: while (true) {
    forest_join_111: {
    if (!((forestValue711_99_0 <= life14_51))) {
        break forest_join_114;
    }
    __call711_28(life7_7, __call711_27(-1));
    if (!((life6_14 != null))) {
        break forest_join_120;
    }
    if (!((life6_14 == null))) {
        break forest_join_111;
    }
    break forest_join_114;
    }
    spill711_9 = __call711_29(life7_7);
    forestValue711_99_0 = spill711_9;
    continue forest_cycle_99;
    }
    }
    __call711_31(life7_7, life14_51, __call711_30(life15_75));
    }
    life9_13 += 1;
    }
    if (!((life6_14 == null))) {
        continue forest_cycle_18;
    }
    break forest_cycle_18;
    }
    }
    forestValue711_124_0 = life9_13;
    }
    if (!((life6_14 != null))) {
        forestValue711_141_0 = forestValue711_124_0;
        break forest_join_141;
    }
    if (!((forestValue711_124_0 <= 0))) {
        break forest_join_129;
    }
    return null;
    }
    spill711_10 = p3;
    int __stackOp711_33_0 = life9_13;
    java.lang.String __stackOp711_33_1 = __invokedynamic711_32(18284, (4385741635384443666L ^ life4_3));
    __call711_35(__invokedynamic711_34(spill711_10, __stackOp711_33_1, __stackOp711_33_0));
    forestValue711_141_0 = __call711_36(life7_7);
    }
    life10_178 = new int[forestValue711_141_0];
    life11_180 = 0;
    forest_cycle_145: while (true) {
    if (!((life11_180 < (life10_178).length))) {
        break forest_join_162;
    }
    spill711_11 = life10_178;
    if (!((life6_14 != null))) {
        forestValue711_163_0 = spill711_11;
        break forest_join_163;
    }
    (spill711_11)[life11_180] = __call711_39(__cast711_38(__call711_37(life7_7, life11_180)));
    life11_180 += 1;
    if (!((life6_14 == null))) {
        continue forest_cycle_145;
    }
    break forest_cycle_145;
    }
    }
    forestValue711_163_0 = life10_178;
    }
    return forestValue711_163_0;
}
public static int[] h711_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3071100_0(p0);
}
public static int[] h711_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3071101_0(p0);
}
public static int[] h711_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3071102_0(p0);
}
public static int[] h711_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3071103_0(p0);
}
public static int[] h711_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3071104_0(p0);
}
public static int[] h711_5(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3071105_0(p0);
}
public static int[] h711_6(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3071106_0(p0);
}
public static int[] h711_7(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3071107_0(p0);
}
public static int[] h711_8(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3071108_0(p0);
}
public static int[] h711_9(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3071109_0(p0);
}
public static int[] h711_10(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3071110_0(p0);
}
public static int[] h711_11(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3071111_0(p0);
}
public static int[] h711_12(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3071112_0(p0);
}
public static int[] h711_13(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3071113_0(p0);
}
private static native long __fieldRead711_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call711_1() throws Throwable;
private static native java.util.Set __call711_2(java.util.Properties a0) throws Throwable;
private static native java.util.Iterator __call711_3(java.util.Set a0) throws Throwable;
private static native boolean __call711_4(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call711_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast711_6(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call711_7(java.util.Properties a0, java.lang.String a1) throws Throwable;
private static native boolean __call711_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory711_9(boolean value) throws Throwable;
private static native java.lang.String __call711_10(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __call711_11(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic711_12(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic711_14(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call711_15(java.lang.String a0) throws Throwable;
private static native int __call711_16(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic711_17(int a0, long a1) throws Throwable;
private static native void __discardScalar711_19(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic711_20(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic711_22(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native void __call711_23(java.lang.String a0) throws Throwable;
private static native int __call711_24(java.util.ArrayList a0) throws Throwable;
private static native java.lang.Integer __call711_25(int a0) throws Throwable;
private static native boolean __call711_26(java.util.ArrayList a0, java.lang.Integer a1) throws Throwable;
private static native java.lang.Integer __call711_27(int a0) throws Throwable;
private static native boolean __call711_28(java.util.ArrayList a0, java.lang.Integer a1) throws Throwable;
private static native int __call711_29(java.util.ArrayList a0) throws Throwable;
private static native java.lang.Integer __call711_30(int a0) throws Throwable;
private static native java.lang.Object __call711_31(java.util.ArrayList a0, int a1, java.lang.Integer a2) throws Throwable;
private static native java.lang.String __invokedynamic711_32(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic711_34(java.lang.String a0, java.lang.String a1, int a2) throws Throwable;
private static native void __call711_35(java.lang.String a0) throws Throwable;
private static native int __call711_36(java.util.ArrayList a0) throws Throwable;
private static native java.lang.Object __call711_37(java.util.ArrayList a0, int a1) throws Throwable;
private static native java.lang.Integer __cast711_38(java.lang.Object a0) throws Throwable;
private static native int __call711_39(java.lang.Integer a0) throws Throwable;
private static native java.lang.Exception __call3071100_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3071101_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3071102_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3071103_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3071104_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3071105_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3071106_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3071107_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3071108_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3071109_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3071110_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3071111_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3071112_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3071113_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_c08f498964f630af487a(java.util.Properties a0, java.lang.String[] a1) throws E;
private static final class __SourceHandler_c08f498964f630af487a {

public static int f726(java.util.Properties p0, java.lang.String[] p1) throws Throwable {
    int lexicalValue726_36_0;
    net.minecraft.entity.Entity[] spill726_0;
    int spill726_1;
    long life2_3;
    java.lang.String[] life5_5;
    int life6_9;
    net.minecraft.entity.Entity[] life4_10;
    int life7_12;
    java.lang.String life8_19;
    int life9_23;
    lexical_join_36: {
    lexical_join_35: {
    life2_3 = (__fieldRead726_0() ^ 132343942605795L);
    life5_5 = p1;
    spill726_0 = __call726_1();
    life6_9 = (life5_5).length;
    life4_10 = spill726_0;
    life7_12 = 0;
    lexical_cycle_13: while (true) {
    lexical_join_33: {
    lexical_join_32: {
    if (!((life7_12 < life6_9))) {
        break lexical_join_35;
    }
    life8_19 = (life5_5)[life7_12];
    life9_23 = __call726_2(p0, life8_19);
    if (!((life4_10 != null))) {
        break lexical_join_33;
    }
    spill726_1 = life9_23;
    if (!((life4_10 != null))) {
        lexicalValue726_36_0 = spill726_1;
        break lexical_join_36;
    }
    if (!((spill726_1 >= 0))) {
        break lexical_join_32;
    }
    return life9_23;
    }
    life7_12 += 1;
    }
    if (!((life4_10 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    lexicalValue726_36_0 = -1;
    }
    return lexicalValue726_36_0;
}
public static void h726_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1072600_0(p0);
}
public static void h726_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1072601_0(p0);
}
public static void h726_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1072602_0(p0);
}
private static native long __fieldRead726_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call726_1() throws Throwable;
private static native int __call726_2(java.util.Properties a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1072600_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1072601_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1072602_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> moom.DR __sourceHandlerCall_8c12b41fd1a791aaa21f(moom.DR a0) throws E;
private static final class __SourceHandler_8c12b41fd1a791aaa21f {

public static moom.DR f727(moom.DR p0) throws Throwable {
    moom.DR forwardValue727_11_0;
    moom.DR forwardValue727_13_0;
    moom.DR spill727_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_13: {
    forward_join_12: {
    forward_join_11: {
    life1_3 = (__fieldRead727_0() ^ 136427773559848L);
    life3_5 = __call727_1();
    spill727_0 = __fieldRead727_2();
    if (!((life3_5 != null))) {
        forwardValue727_11_0 = spill727_0;
        break forward_join_11;
    }
    if (!((spill727_0 == null))) {
        break forward_join_12;
    }
    forwardValue727_11_0 = p0;
    }
    forwardValue727_13_0 = forwardValue727_11_0;
    break forward_join_13;
    }
    forwardValue727_13_0 = __fieldRead727_3();
    }
    return forwardValue727_13_0;
}
public static void h727_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1072700_0(p0);
}
private static native long __fieldRead727_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call727_1() throws Throwable;
private static native moom.DR __fieldRead727_2() throws Throwable;
private static native moom.DR __fieldRead727_3() throws Throwable;
private static native java.lang.Exception __call1072700_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> moom.DR __sourceHandlerCall_76f20c60a632e7032432(moom.DR a0, net.minecraft.world.IBlockAccess a1, double a2, double a3, double a4) throws E;
private static final class __SourceHandler_76f20c60a632e7032432 {

public static moom.DR f728(moom.DR p0, net.minecraft.world.IBlockAccess p1, double p2, double p3, double p4) throws Throwable {
    moom.Jk forwardValue728_13_0;
    moom.Jk spill728_0;
    long life8_3;
    net.minecraft.entity.Entity[] life10_5;
    int life11_24;
    int life12_38;
    int life13_52;
    int life14_60;
    float life15_65;
    float life16_70;
    float life17_75;
    float life18_81;
    float life19_87;
    float life20_91;
    float life15_95;
    float life16_99;
    float life17_103;
    forward_join_13: {
    forward_join_12: {
    life8_3 = (__fieldRead728_0() ^ 38803115308768L);
    life10_5 = __call728_1();
    spill728_0 = __fieldRead728_2();
    if (!((life10_5 != null))) {
        forwardValue728_13_0 = spill728_0;
        break forward_join_13;
    }
    if (!((spill728_0 == null))) {
        break forward_join_12;
    }
    return p0;
    }
    forwardValue728_13_0 = __fieldRead728_3();
    }
    life11_24 = __call728_4(forwardValue728_13_0, p1, p2, p3, p4, 3);
    life12_38 = ((life11_24 >> __invokedynamic728_5(28699, (2595765535799308332L ^ life8_3))) & __invokedynamic728_6(9112, (7192295821170484135L ^ life8_3)));
    life13_52 = ((life11_24 >> __invokedynamic728_7(1157, (2143290001358947509L ^ life8_3))) & __invokedynamic728_8(9112, (7192295821170484135L ^ life8_3)));
    life14_60 = (life11_24 & __invokedynamic728_9(9112, (7192295821170484135L ^ life8_3)));
    life15_65 = (((float) life12_38) / 0x1.fep7f);
    life16_70 = (((float) life13_52) / 0x1.fep7f);
    life17_75 = (((float) life14_60) / 0x1.fep7f);
    life18_81 = (((float) __fieldRead728_10(p0)) / 0x1.0p-1f);
    life19_87 = (((float) __fieldRead728_11(p0)) / 0x1.5353f8p-1f);
    life20_91 = ((float) __fieldRead728_12(p0));
    life15_95 = (life15_65 * life18_81);
    life16_99 = (life16_70 * life19_87);
    life17_103 = (life17_75 * life20_91);
    return __call728_14(__fieldRead728_13(), ((double) life15_95), ((double) life16_99), ((double) life17_103));
}
public static void h728_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1072800_0(p0);
}
public static void h728_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1072801_0(p0);
}
private static native long __fieldRead728_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call728_1() throws Throwable;
private static native moom.Jk __fieldRead728_2() throws Throwable;
private static native moom.Jk __fieldRead728_3() throws Throwable;
private static native int __call728_4(moom.Jk a0, net.minecraft.world.IBlockAccess a1, double a2, double a3, double a4, int a5) throws Throwable;
private static native int __invokedynamic728_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic728_6(int a0, long a1) throws Throwable;
private static native int __invokedynamic728_7(int a0, long a1) throws Throwable;
private static native int __invokedynamic728_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic728_9(int a0, long a1) throws Throwable;
private static native double __fieldRead728_10(moom.DR a0) throws Throwable;
private static native double __fieldRead728_11(moom.DR a0) throws Throwable;
private static native double __fieldRead728_12(moom.DR a0) throws Throwable;
private static native moom.Jj __fieldRead728_13() throws Throwable;
private static native moom.DR __call728_14(moom.Jj a0, double a1, double a2, double a3) throws Throwable;
private static native java.lang.Exception __call1072800_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1072801_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> moom.DR __sourceHandlerCall_c6ecd02ddd2807520b03(moom.DR a0, net.minecraft.world.World a1, net.minecraft.entity.Entity a2, float a3) throws E;
private static final class __SourceHandler_c6ecd02ddd2807520b03 {

public static moom.DR f246(moom.DR p0, net.minecraft.world.World p1, net.minecraft.entity.Entity p2, float p3) throws Throwable {
    net.minecraft.entity.Entity[] spill246_0;
    long life4_3;
    int life7_8;
    net.minecraft.entity.Entity[] life6_9;
    net.minecraft.client.Minecraft life8_22;
    forward_join_39: {
    forward_join_36: {
    forward_join_19: {
    forward_join_17: {
    forward_join_14: {
    life4_3 = (__fieldRead246_0() ^ 80645714297230L);
    spill246_0 = __call246_1();
    life7_8 = __call246_3(__fieldRead246_2(p1));
    life6_9 = spill246_0;
    if (!((life6_9 != null))) {
        break forward_join_17;
    }
    switch (life7_8) {
case -1:
{
        break forward_join_14;
    }
case 0:
{
        break forward_join_19;
    }
case 1:
{
        break forward_join_36;
    }
default:
{
        break forward_join_39;
    }
}
    }
    p0 = __call246_4(p0);
    }
    if (!((life6_9 == null))) {
        break forward_join_39;
    }
    }
    life8_22 = __call246_5();
    p0 = __call246_10(p0, __fieldRead246_6(life8_22), __fieldRead246_7(p2), (__fieldRead246_8(p2) + 0x1.0p0d), __fieldRead246_9(p2));
    if (!((life6_9 == null))) {
        break forward_join_39;
    }
    }
    p0 = __call246_11(p0);
    }
    return p0;
}
public static moom.DR h246_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call2024600_0(p0);
}
private static native long __fieldRead246_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call246_1() throws Throwable;
private static native moom.EA __fieldRead246_2(net.minecraft.world.World a0) throws Throwable;
private static native int __call246_3(moom.EA a0) throws Throwable;
private static native moom.DR __call246_4(moom.DR a0) throws Throwable;
private static native net.minecraft.client.Minecraft __call246_5() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead246_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead246_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead246_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead246_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.DR __call246_10(moom.DR a0, net.minecraft.client.multiplayer.WorldClient a1, double a2, double a3, double a4) throws Throwable;
private static native moom.DR __call246_11(moom.DR a0) throws Throwable;
private static native java.lang.Exception __call2024600_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_3cc4b0d1379d0b3d5c2f(moom.Jk a0, java.util.List a1) throws E;
private static final class __SourceHandler_3cc4b0d1379d0b3d5c2f {

public static void f84(moom.Jk p0, java.util.List p1) throws Throwable {
    int lexicalValue84_39_0;
    int[] lexicalValue84_59_0;
    net.minecraft.entity.Entity[] spill84_0;
    int[] spill84_1;
    int[] spill84_2;
    int spill84_3;
    long life2_3;
    int[] life5_7;
    net.minecraft.entity.Entity[] life4_8;
    int[] life6_28;
    int life7_31;
    int life8_33;
    int life9_40;
    lexical_join_68: {
    lexical_join_59: {
    lexical_join_58: {
    lexical_join_56: {
    life2_3 = (__fieldRead84_0() ^ 96638978148472L);
    spill84_0 = __call84_1();
    life5_7 = __call84_2(p0);
    life4_8 = spill84_0;
    spill84_1 = life5_7;
    if (!((life4_8 != null))) {
        lexicalValue84_59_0 = spill84_1;
        break lexical_join_59;
    }
    if (!((spill84_1 != null))) {
        break lexical_join_58;
    }
    spill84_2 = life5_7;
    if (!((life4_8 != null))) {
        lexicalValue84_59_0 = spill84_2;
        break lexical_join_59;
    }
    if (!(((spill84_2).length > 0))) {
        break lexical_join_58;
    }
    life6_28 = life5_7;
    life7_31 = (life6_28).length;
    life8_33 = 0;
    lexical_cycle_25: while (true) {
    lexical_join_53: {
    lexical_join_49: {
    lexical_join_39: {
    if (!((life8_33 < life7_31))) {
        break lexical_join_56;
    }
    life9_40 = (life6_28)[life8_33];
    if (!((life4_8 != null))) {
        break lexical_join_68;
    }
    spill84_3 = life9_40;
    if (!((life4_8 != null))) {
        lexicalValue84_39_0 = spill84_3;
        break lexical_join_39;
    }
    if (!((spill84_3 < 0))) {
        break lexical_join_49;
    }
    lexicalValue84_39_0 = life9_40;
    }
    int __stackOp84_4_0 = lexicalValue84_39_0;
    java.lang.String __stackOp84_4_1 = __invokedynamic84_3(23782, (4254857022356105558L ^ life2_3));
    __call84_6(__invokedynamic84_5(__stackOp84_4_1, __stackOp84_4_0));
    if (!((life4_8 == null))) {
        break lexical_join_53;
    }
    }
    __call84_7(p0, p1, life9_40);
    }
    life8_33 += 1;
    if (!((life4_8 == null))) { continue lexical_cycle_25; }
    break lexical_cycle_25;
    }
    }
    if (!((life4_8 == null))) {
        break lexical_join_68;
    }
    }
    lexicalValue84_59_0 = life5_7;
    }
    java.lang.String __stackOp84_10_0 = __call84_8(lexicalValue84_59_0);
    java.lang.String __stackOp84_10_1 = __invokedynamic84_9(13388, (6297699569664115137L ^ life2_3));
    __call84_12(__invokedynamic84_11(__stackOp84_10_1, __stackOp84_10_0));
    }
    return;
}
public static void h84_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008400_0(p0);
}
public static void h84_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008401_0(p0);
}
public static void h84_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008402_0(p0);
}
public static void h84_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008403_0(p0);
}
public static void h84_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008404_0(p0);
}
public static void h84_5(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008405_0(p0);
}
public static void h84_6(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008406_0(p0);
}
private static native long __fieldRead84_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call84_1() throws Throwable;
private static native int[] __call84_2(moom.Jk a0) throws Throwable;
private static native java.lang.String __invokedynamic84_3(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic84_5(java.lang.String a0, int a1) throws Throwable;
private static native void __call84_6(java.lang.String a0) throws Throwable;
private static native void __call84_7(moom.Jk a0, java.util.List a1, int a2) throws Throwable;
private static native java.lang.String __call84_8(int[] a0) throws Throwable;
private static native java.lang.String __invokedynamic84_9(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic84_11(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call84_12(java.lang.String a0) throws Throwable;
private static native java.lang.Exception __call1008400_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008401_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008402_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008403_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008404_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008405_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008406_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_fd56d66e2d742b9beaad(moom.Jk a0, java.util.List a1, int a2) throws E;
private static final class __SourceHandler_fd56d66e2d742b9beaad {

public static void f40(moom.Jk p0, java.util.List p1, int p2) throws Throwable {
    java.util.List forestValue40_22_0;
    java.util.List forestValue40_37_0;
    java.util.List spill40_0;
    java.util.List spill40_1;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    java.util.List life6_28;
    forest_join_37: {
    forest_join_36: {
    forest_join_22: {
    forest_join_18: {
    life3_3 = (__fieldRead40_0() ^ 39321480566058L);
    life5_5 = __call40_1();
    forest_cycle_6: while (true) {
    if (!((p2 >= __call40_2(p1)))) {
        break forest_join_18;
    }
    spill40_0 = p1;
    if (!((life5_5 != null))) {
        forestValue40_22_0 = spill40_0;
        break forest_join_22;
    }
    __call40_3(spill40_0, null);
    if (!((life5_5 == null))) {
        continue forest_cycle_6;
    }
    break forest_cycle_6;
    }
    }
    forestValue40_22_0 = __cast40_5(__call40_4(p1, p2));
    }
    life6_28 = forestValue40_22_0;
    spill40_1 = life6_28;
    if (!((life5_5 != null))) {
        forestValue40_37_0 = spill40_1;
        break forest_join_37;
    }
    if (!((spill40_1 == null))) {
        break forest_join_36;
    }
    life6_28 = new java.util.ArrayList();
    __call40_6(p1, p2, life6_28);
    }
    forestValue40_37_0 = life6_28;
    }
    __call40_7(forestValue40_37_0, p0);
    return;
}
public static void h40_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3004000_0(p0);
}
public static void h40_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3004001_0(p0);
}
private static native long __fieldRead40_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call40_1() throws Throwable;
private static native int __call40_2(java.util.List a0) throws Throwable;
private static native boolean __call40_3(java.util.List a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Object __call40_4(java.util.List a0, int a1) throws Throwable;
private static native java.util.List __cast40_5(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call40_6(java.util.List a0, int a1, java.util.List a2) throws Throwable;
private static native boolean __call40_7(java.util.List a0, moom.Jk a1) throws Throwable;
private static native java.lang.Exception __call3004000_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3004001_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_48140d2daa622cfe918a(moom.lC a0, net.minecraft.block.state.IBlockState a1, net.minecraft.world.IBlockAccess a2, moom.DT a3, moom.Mi a4) throws E;
private static final class __SourceHandler_48140d2daa622cfe918a {

public static int f709(moom.lC p0, net.minecraft.block.state.IBlockState p1, net.minecraft.world.IBlockAccess p2, moom.DT p3, moom.Mi p4) throws Throwable {
    net.minecraft.block.Block forestValue709_25_0;
    net.minecraft.block.Block forestValue709_32_0;
    int forestValue709_75_0;
    int forestValue709_82_0;
    net.minecraft.block.Block forestValue709_93_0;
    net.minecraft.block.Block forestValue709_102_0;
    int forestValue709_113_0;
    int forestValue709_120_0;
    net.minecraft.block.Block forestValue709_127_0;
    net.minecraft.block.Block forestValue709_132_0;
    net.minecraft.block.Block forestValue709_140_0;
    moom.cz forestValue709_140_1;
    net.minecraft.block.Block forestValue709_158_0;
    net.minecraft.block.Block forestValue709_180_0;
    moom.dH forestValue709_180_1;
    net.minecraft.block.Block forestValue709_189_0;
    net.minecraft.block.Block forestValue709_189_1;
    int forestValue709_199_0;
    int forestValue709_206_0;
    moom.Jr forestValue709_216_0;
    int forestValue709_220_0;
    net.minecraft.entity.Entity[] spill709_0;
    net.minecraft.block.Block spill709_1;
    boolean spill709_2;
    boolean spill709_3;
    boolean spill709_4;
    net.minecraft.block.Block spill709_5;
    int spill709_6;
    net.minecraft.block.Block spill709_7;
    moom.cz spill709_8;
    net.minecraft.block.Block spill709_9;
    int spill709_10;
    moom.dH spill709_11;
    moom.Jr spill709_12;
    long life5_3;
    net.minecraft.block.Block life8_7;
    net.minecraft.entity.Entity[] life7_8;
    net.minecraft.block.state.IBlockState life9_11;
    moom.Jk life10_56;
    int life10_134;
    moom.Jr life11_163;
    forest_join_220: {
    forest_join_216: {
    forest_join_215: {
    forest_join_206: {
    forest_join_199: {
    forest_join_198: {
    forest_join_196: {
    forest_join_192: {
    forest_join_189: {
    forest_join_187: {
    forest_join_180: {
    forest_join_178: {
    forest_join_174: {
    forest_join_170: {
    forest_join_166: {
    forest_join_158: {
    forest_join_157: {
    forest_join_140: {
    forest_join_132: {
    forest_join_127: {
    forest_join_120: {
    forest_join_118: {
    forest_join_113: {
    forest_join_112: {
    forest_join_102: {
    forest_join_101: {
    forest_join_93: {
    forest_join_92: {
    forest_join_83: {
    forest_join_82: {
    forest_join_76: {
    forest_join_75: {
    forest_join_71: {
    forest_join_49: {
    forest_join_32: {
    forest_join_31: {
    forest_join_25: {
    forest_join_24: {
    life5_3 = (__fieldRead709_0() ^ 97019853691129L);
    spill709_0 = __call709_1();
    life8_7 = __call709_2(p1);
    life7_8 = spill709_0;
    life9_11 = __call709_3(p4);
    if (!((__fieldRead709_4() != null))) {
        break forest_join_76;
    }
    if (!((!__call709_5(p0)))) {
        break forest_join_31;
    }
    spill709_1 = life8_7;
    if (!((life7_8 != null))) {
        forestValue709_25_0 = spill709_1;
        break forest_join_25;
    }
    if (!((spill709_1 == __fieldRead709_6()))) {
        break forest_join_24;
    }
    life9_11 = __fieldRead709_7();
    }
    forestValue709_25_0 = life8_7;
    }
    if (!((life7_8 != null))) {
        forestValue709_32_0 = forestValue709_25_0;
        break forest_join_32;
    }
    if (!((forestValue709_25_0 == __fieldRead709_8()))) {
        break forest_join_31;
    }
    return -1;
    }
    forestValue709_32_0 = life8_7;
    }
    if (!((forestValue709_32_0 == __fieldRead709_9()))) {
        break forest_join_49;
    }
    if (!((__call709_10(p4) >= __invokedynamic709_11(25644, (6859656570545424904L ^ life5_3))))) {
        break forest_join_49;
    }
    p3 = __call709_12(p3);
    life9_11 = __call709_13(p2, p3);
    }
    life10_56 = __call709_14(life9_11);
    if (!((life10_56 != null))) {
        break forest_join_76;
    }
    spill709_2 = __call709_15();
    if (!((life7_8 != null))) {
        forestValue709_75_0 = __integerCategory709_16(spill709_2);
        break forest_join_75;
    }
    if (!(spill709_2)) {
        break forest_join_71;
    }
    spill709_3 = __call709_17(life10_56);
    if (!((life7_8 != null))) {
        forestValue709_75_0 = __integerCategory709_18(spill709_3);
        break forest_join_75;
    }
    if (!((!spill709_3))) {
        break forest_join_71;
    }
    return __call709_20(p1, p2, p3, life10_56, __call709_19(p4));
    }
    forestValue709_75_0 = __call709_21(life10_56, p2, p3);
    }
    return forestValue709_75_0;
    }
    spill709_4 = __call709_22(p0);
    if (!((life7_8 != null))) {
        forestValue709_82_0 = __integerCategory709_23(spill709_4);
        break forest_join_82;
    }
    if (!((!spill709_4))) {
        break forest_join_83;
    }
    forestValue709_82_0 = -1;
    }
    return forestValue709_82_0;
    }
    spill709_5 = life8_7;
    if (!((life7_8 != null))) {
        forestValue709_93_0 = spill709_5;
        break forest_join_93;
    }
    if (!((spill709_5 == __fieldRead709_24()))) {
        break forest_join_92;
    }
    return __call709_25(p2, p3);
    }
    forestValue709_93_0 = life8_7;
    }
    if (!((life7_8 != null))) {
        forestValue709_102_0 = forestValue709_93_0;
        break forest_join_102;
    }
    if (!((forestValue709_93_0 == __fieldRead709_26()))) {
        break forest_join_101;
    }
    return __call709_28(__call709_27(p4));
    }
    forestValue709_102_0 = life8_7;
    }
    spill709_6 = __instanceOf709_29(forestValue709_102_0);
    if (!((life7_8 != null))) {
        forestValue709_113_0 = spill709_6;
        break forest_join_113;
    }
    if (!((spill709_6 != 0))) {
        break forest_join_112;
    }
    return __call709_30(life8_7, p2, p3, p4);
    }
    forestValue709_113_0 = __integerCategory709_32(__fieldRead709_31());
    }
    if (!((life7_8 != null))) {
        forestValue709_120_0 = forestValue709_113_0;
        break forest_join_120;
    }
    if (!((forestValue709_113_0 != 0))) {
        break forest_join_118;
    }
    return -1;
    }
    forestValue709_120_0 = __call709_33(p4);
    }
    life10_134 = forestValue709_120_0;
    spill709_7 = life8_7;
    if (!((life7_8 != null))) {
        forestValue709_127_0 = spill709_7;
        break forest_join_127;
    }
    if (!((spill709_7 != __fieldRead709_34()))) {
        break forest_join_196;
    }
    forestValue709_127_0 = life8_7;
    }
    if (!((life7_8 != null))) {
        forestValue709_132_0 = forestValue709_127_0;
        break forest_join_132;
    }
    if (!((forestValue709_127_0 != __fieldRead709_35()))) {
        break forest_join_196;
    }
    forestValue709_132_0 = life8_7;
    }
    spill709_8 = __fieldRead709_36();
    if (!((life7_8 != null))) {
        forestValue709_140_0 = forestValue709_132_0;
        forestValue709_140_1 = spill709_8;
        break forest_join_140;
    }
    if (!((forestValue709_132_0 != spill709_8))) {
        break forest_join_196;
    }
    spill709_9 = life8_7;
    if (!((life7_8 != null))) {
        forestValue709_158_0 = spill709_9;
        break forest_join_158;
    }
    forestValue709_140_0 = spill709_9;
    forestValue709_140_1 = __fieldRead709_37();
    }
    if (!((forestValue709_140_0 == forestValue709_140_1))) {
        break forest_join_157;
    }
    life11_163 = __fieldRead709_38();
    spill709_10 = life10_134;
    if (!((life7_8 != null))) {
        forestValue709_199_0 = spill709_10;
        break forest_join_199;
    }
    if (!((spill709_10 >= __invokedynamic709_39(1157, (2143156593836468908L ^ life5_3))))) {
        break forest_join_198;
    }
    p3 = __call709_40(p3);
    if (!((life7_8 == null))) {
        break forest_join_198;
    }
    }
    forestValue709_158_0 = life8_7;
    }
    spill709_11 = __fieldRead709_41();
    if (!((life7_8 != null))) {
        forestValue709_180_0 = forestValue709_158_0;
        forestValue709_180_1 = spill709_11;
        break forest_join_180;
    }
    if (!((forestValue709_158_0 == spill709_11))) {
        break forest_join_178;
    }
    switch ((life10_134 & 3)) {
case 1:
{
        break forest_join_166;
    }
case 2:
{
        break forest_join_170;
    }
default:
{
        break forest_join_174;
    }
}
    }
    life11_163 = __fieldRead709_42();
    if (!((life7_8 == null))) {
        break forest_join_198;
    }
    }
    life11_163 = __fieldRead709_43();
    if (!((life7_8 == null))) {
        break forest_join_198;
    }
    }
    life11_163 = __fieldRead709_44();
    if (!((life7_8 == null))) {
        break forest_join_198;
    }
    }
    forestValue709_180_0 = life8_7;
    forestValue709_180_1 = __fieldRead709_45();
    }
    if (!((life7_8 != null))) {
        forestValue709_189_0 = forestValue709_180_0;
        forestValue709_189_1 = forestValue709_180_1;
        break forest_join_189;
    }
    if (!((forestValue709_180_0 == forestValue709_180_1))) {
        break forest_join_187;
    }
    life11_163 = __fieldRead709_46();
    if (!((life7_8 == null))) {
        break forest_join_198;
    }
    }
    forestValue709_189_0 = life8_7;
    forestValue709_189_1 = __fieldRead709_47();
    }
    if (!((forestValue709_189_0 != forestValue709_189_1))) {
        break forest_join_192;
    }
    return -1;
    }
    life11_163 = __fieldRead709_48();
    if (!((life7_8 == null))) {
        break forest_join_198;
    }
    }
    life11_163 = __fieldRead709_49();
    }
    forestValue709_199_0 = __integerCategory709_51(__call709_50());
    }
    if (!((life7_8 != null))) {
        forestValue709_206_0 = forestValue709_199_0;
        break forest_join_206;
    }
    if (!((forestValue709_199_0 != 0))) {
        break forest_join_215;
    }
    spill709_12 = life11_163;
    if (!((life7_8 != null))) {
        forestValue709_216_0 = spill709_12;
        break forest_join_216;
    }
    forestValue709_206_0 = __integerCategory709_53(__call709_52(spill709_12));
    }
    if (!((forestValue709_206_0 == 0))) {
        break forest_join_215;
    }
    forestValue709_220_0 = __call709_55(p1, p2, p3, life11_163, __call709_54(p4));
    break forest_join_220;
    }
    forestValue709_216_0 = life11_163;
    }
    forestValue709_220_0 = __call709_56(forestValue709_216_0, life9_11, p2, p3);
    }
    return forestValue709_220_0;
}
public static int h709_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070900_0(p0);
}
public static int h709_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070901_0(p0);
}
public static int h709_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070902_0(p0);
}
public static int h709_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070903_0(p0);
}
public static int h709_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070904_0(p0);
}
public static int h709_5(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070905_0(p0);
}
public static int h709_6(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070906_0(p0);
}
public static int h709_7(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070907_0(p0);
}
public static int h709_8(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070908_0(p0);
}
public static int h709_9(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070909_0(p0);
}
public static int h709_10(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070910_0(p0);
}
public static int h709_11(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070911_0(p0);
}
public static int h709_12(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070912_0(p0);
}
public static int h709_13(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070913_0(p0);
}
public static int h709_14(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070914_0(p0);
}
public static int h709_15(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070915_0(p0);
}
public static int h709_16(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070916_0(p0);
}
public static int h709_17(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070917_0(p0);
}
public static int h709_18(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070918_0(p0);
}
public static int h709_19(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070919_0(p0);
}
public static int h709_20(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070920_0(p0);
}
public static int h709_21(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070921_0(p0);
}
public static int h709_22(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070922_0(p0);
}
public static int h709_23(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070923_0(p0);
}
public static int h709_24(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070924_0(p0);
}
public static int h709_25(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070925_0(p0);
}
public static int h709_26(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070926_0(p0);
}
public static int h709_27(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070927_0(p0);
}
public static int h709_28(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070928_0(p0);
}
public static int h709_29(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070929_0(p0);
}
public static int h709_30(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070930_0(p0);
}
public static int h709_31(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070931_0(p0);
}
public static int h709_32(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070932_0(p0);
}
public static int h709_33(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070933_0(p0);
}
public static int h709_34(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070934_0(p0);
}
public static int h709_35(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070935_0(p0);
}
public static int h709_36(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070936_0(p0);
}
public static int h709_37(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070937_0(p0);
}
public static int h709_38(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3070938_0(p0);
}
private static native long __fieldRead709_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call709_1() throws Throwable;
private static native net.minecraft.block.Block __call709_2(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call709_3(moom.Mi a0) throws Throwable;
private static native moom.Jk[][] __fieldRead709_4() throws Throwable;
private static native boolean __call709_5(moom.lC a0) throws Throwable;
private static native moom.dC __fieldRead709_6() throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead709_7() throws Throwable;
private static native moom.d9 __fieldRead709_8() throws Throwable;
private static native moom.cz __fieldRead709_9() throws Throwable;
private static native int __call709_10(moom.Mi a0) throws Throwable;
private static native int __invokedynamic709_11(int a0, long a1) throws Throwable;
private static native moom.DT __call709_12(moom.DT a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call709_13(net.minecraft.world.IBlockAccess a0, moom.DT a1) throws Throwable;
private static native moom.Jk __call709_14(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native boolean __call709_15() throws Throwable;
private static native int __integerCategory709_16(boolean value) throws Throwable;
private static native boolean __call709_17(moom.Jk a0) throws Throwable;
private static native int __integerCategory709_18(boolean value) throws Throwable;
private static native moom.DX __call709_19(moom.Mi a0) throws Throwable;
private static native int __call709_20(net.minecraft.block.state.IBlockState a0, net.minecraft.world.IBlockAccess a1, moom.DT a2, moom.Jk a3, moom.DX a4) throws Throwable;
private static native int __call709_21(moom.Jk a0, net.minecraft.world.IBlockAccess a1, moom.DT a2) throws Throwable;
private static native boolean __call709_22(moom.lC a0) throws Throwable;
private static native int __integerCategory709_23(boolean value) throws Throwable;
private static native net.minecraft.block.Block __fieldRead709_24() throws Throwable;
private static native int __call709_25(net.minecraft.world.IBlockAccess a0, moom.DT a1) throws Throwable;
private static native moom.d9 __fieldRead709_26() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call709_27(moom.Mi a0) throws Throwable;
private static native int __call709_28(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __instanceOf709_29(net.minecraft.block.Block a0) throws Throwable;
private static native int __call709_30(net.minecraft.block.Block a0, net.minecraft.world.IBlockAccess a1, moom.DT a2, moom.Mi a3) throws Throwable;
private static native boolean __fieldRead709_31() throws Throwable;
private static native int __integerCategory709_32(boolean value) throws Throwable;
private static native int __call709_33(moom.Mi a0) throws Throwable;
private static native moom.dC __fieldRead709_34() throws Throwable;
private static native moom.cI __fieldRead709_35() throws Throwable;
private static native moom.cz __fieldRead709_36() throws Throwable;
private static native moom.cz __fieldRead709_37() throws Throwable;
private static native moom.Jr __fieldRead709_38() throws Throwable;
private static native int __invokedynamic709_39(int a0, long a1) throws Throwable;
private static native moom.DT __call709_40(moom.DT a0) throws Throwable;
private static native moom.dH __fieldRead709_41() throws Throwable;
private static native moom.Jr __fieldRead709_42() throws Throwable;
private static native moom.Jr __fieldRead709_43() throws Throwable;
private static native moom.Jr __fieldRead709_44() throws Throwable;
private static native moom.dH __fieldRead709_45() throws Throwable;
private static native moom.Jr __fieldRead709_46() throws Throwable;
private static native net.minecraft.block.Block __fieldRead709_47() throws Throwable;
private static native moom.Jr __fieldRead709_48() throws Throwable;
private static native moom.Jr __fieldRead709_49() throws Throwable;
private static native boolean __call709_50() throws Throwable;
private static native int __integerCategory709_51(boolean value) throws Throwable;
private static native boolean __call709_52(moom.Jr a0) throws Throwable;
private static native int __integerCategory709_53(boolean value) throws Throwable;
private static native moom.DX __call709_54(moom.Mi a0) throws Throwable;
private static native int __call709_55(net.minecraft.block.state.IBlockState a0, net.minecraft.world.IBlockAccess a1, moom.DT a2, moom.Jr a3, moom.DX a4) throws Throwable;
private static native int __call709_56(moom.Jr a0, net.minecraft.block.state.IBlockState a1, net.minecraft.world.IBlockAccess a2, moom.DT a3) throws Throwable;
private static native java.lang.Exception __call3070900_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070901_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070902_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070903_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070904_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070905_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070906_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070907_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070908_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070909_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070910_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070911_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070912_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070913_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070914_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070915_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070916_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070917_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070918_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070919_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070920_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070921_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070922_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070923_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070924_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070925_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070926_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070927_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070928_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070929_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070930_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070931_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070932_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070933_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070934_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070935_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070936_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070937_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3070938_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_a3c105a18d6ba8c40607(moom.xC a0, net.minecraft.item.ItemStack a1, int a2, int a3) throws E;
private static final class __SourceHandler_a3c105a18d6ba8c40607 {

public static int f731(moom.xC p0, net.minecraft.item.ItemStack p1, int p2, int p3) throws Throwable {
    int[] forwardValue731_14_0;
    int forwardValue731_38_0;
    int forwardValue731_40_0;
    int forwardValue731_42_0;
    net.minecraft.entity.Entity[] spill731_0;
    int spill731_1;
    int spill731_2;
    int spill731_3;
    long life4_3;
    int life7_7;
    net.minecraft.entity.Entity[] life6_8;
    int[] life8_16;
    int life9_45;
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    forward_join_39: {
    forward_join_38: {
    forward_join_19: {
    forward_join_14: {
    forward_join_13: {
    life4_3 = (__fieldRead731_0() ^ 29892890806999L);
    spill731_0 = __call731_1();
    life7_7 = __call731_2(p1);
    life6_8 = spill731_0;
    if (!((p2 == 0))) {
        break forward_join_13;
    }
    forwardValue731_14_0 = __fieldRead731_3();
    break forward_join_14;
    }
    forwardValue731_14_0 = __fieldRead731_4();
    }
    life8_16 = forwardValue731_14_0;
    if (!((life8_16 == null))) {
        break forward_join_19;
    }
    return p3;
    }
    spill731_1 = life7_7;
    if (!((life6_8 != null))) {
        forwardValue731_42_0 = spill731_1;
        break forward_join_42;
    }
    if (!((spill731_1 >= 0))) {
        break forward_join_41;
    }
    spill731_2 = life7_7;
    if (!((life6_8 != null))) {
        forwardValue731_42_0 = spill731_2;
        break forward_join_42;
    }
    if (!((spill731_2 < (life8_16).length))) {
        break forward_join_41;
    }
    life9_45 = (life8_16)[life7_7];
    spill731_3 = life9_45;
    if (!((life6_8 != null))) {
        forwardValue731_38_0 = spill731_3;
        break forward_join_38;
    }
    if (!((spill731_3 < 0))) {
        break forward_join_39;
    }
    forwardValue731_38_0 = p3;
    }
    forwardValue731_40_0 = forwardValue731_38_0;
    break forward_join_40;
    }
    forwardValue731_40_0 = life9_45;
    }
    return forwardValue731_40_0;
    }
    forwardValue731_42_0 = p3;
    }
    return forwardValue731_42_0;
}
public static void h731_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1073100_0(p0);
}
public static void h731_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1073101_0(p0);
}
public static void h731_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1073102_0(p0);
}
public static void h731_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1073103_0(p0);
}
public static void h731_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1073104_0(p0);
}
public static void h731_5(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1073105_0(p0);
}
private static native long __fieldRead731_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call731_1() throws Throwable;
private static native int __call731_2(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int[] __fieldRead731_3() throws Throwable;
private static native int[] __fieldRead731_4() throws Throwable;
private static native java.lang.Exception __call1073100_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1073101_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1073102_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1073103_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1073104_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1073105_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_f26c7b753f7ad21dea38(net.minecraft.block.Block a0, net.minecraft.world.IBlockAccess a1, moom.DT a2, moom.Mi a3) throws E;
private static final class __SourceHandler_f26c7b753f7ad21dea38 {

public static int f732(net.minecraft.block.Block p0, net.minecraft.world.IBlockAccess p1, moom.DT p2, moom.Mi p3) throws Throwable {
    moom.Jk forwardValue732_18_0;
    net.minecraft.block.Block forwardValue732_21_0;
    net.minecraft.block.Block forwardValue732_21_1;
    moom.Jk forwardValue732_29_0;
    net.minecraft.entity.Entity[] spill732_0;
    net.minecraft.block.Block spill732_1;
    net.minecraft.block.Block spill732_2;
    moom.Jk spill732_3;
    moom.Jk spill732_4;
    long life4_3;
    moom.Jk life7_6;
    net.minecraft.entity.Entity[] life6_7;
    int life8_51;
    forward_join_32: {
    forward_join_29: {
    forward_join_28: {
    forward_join_21: {
    forward_join_19: {
    forward_join_18: {
    life4_3 = (__fieldRead732_0() ^ 11249818545048L);
    spill732_0 = __call732_1();
    life7_6 = __fieldRead732_2();
    life6_7 = spill732_0;
    spill732_1 = p0;
    spill732_2 = __fieldRead732_3();
    if (!((life6_7 != null))) {
        forwardValue732_21_0 = spill732_1;
        forwardValue732_21_1 = spill732_2;
        break forward_join_21;
    }
    if (!((spill732_1 == spill732_2))) {
        break forward_join_19;
    }
    spill732_3 = __fieldRead732_4();
    if (!((life6_7 != null))) {
        forwardValue732_18_0 = spill732_3;
        break forward_join_18;
    }
    if (!((spill732_3 != null))) {
        break forward_join_19;
    }
    forwardValue732_18_0 = __fieldRead732_5();
    }
    life7_6 = forwardValue732_18_0;
    }
    forwardValue732_21_0 = p0;
    forwardValue732_21_1 = __fieldRead732_6();
    }
    if (!((forwardValue732_21_0 == forwardValue732_21_1))) {
        break forward_join_28;
    }
    spill732_4 = __fieldRead732_7();
    if (!((life6_7 != null))) {
        forwardValue732_29_0 = spill732_4;
        break forward_join_29;
    }
    if (!((spill732_4 != null))) {
        break forward_join_28;
    }
    life7_6 = __fieldRead732_8();
    }
    forwardValue732_29_0 = life7_6;
    }
    if (!((forwardValue732_29_0 == null))) {
        break forward_join_32;
    }
    return -1;
    }
    life8_51 = __call732_9(p3);
    return __call732_10(life7_6, life8_51);
}
public static void h732_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1073200_0(p0);
}
public static void h732_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1073201_0(p0);
}
public static void h732_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1073202_0(p0);
}
public static void h732_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1073203_0(p0);
}
public static void h732_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1073204_0(p0);
}
public static void h732_5(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1073205_0(p0);
}
private static native long __fieldRead732_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call732_1() throws Throwable;
private static native moom.Jk __fieldRead732_2() throws Throwable;
private static native net.minecraft.block.Block __fieldRead732_3() throws Throwable;
private static native moom.Jk __fieldRead732_4() throws Throwable;
private static native moom.Jk __fieldRead732_5() throws Throwable;
private static native net.minecraft.block.Block __fieldRead732_6() throws Throwable;
private static native moom.Jk __fieldRead732_7() throws Throwable;
private static native moom.Jk __fieldRead732_8() throws Throwable;
private static native int __call732_9(moom.Mi a0) throws Throwable;
private static native int __call732_10(moom.Jk a0, int a1) throws Throwable;
private static native java.lang.Exception __call1073200_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1073201_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1073202_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1073203_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1073204_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1073205_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_0e51f2d43eab1bee967c(net.minecraft.block.state.IBlockState a0) throws E;
private static final class __SourceHandler_0e51f2d43eab1bee967c {

public static int f1294(net.minecraft.block.state.IBlockState p0) throws Throwable {
    long life1_3;
    int life3_17;
    life1_3 = (__fieldRead1294_0() ^ 97852223592127L);
    if ((__fieldRead1294_1() == null)) {
        return -1;
    }
    life3_17 = __call1294_3(p0, __invokedynamic1294_2(4991, (5279322997871407890L ^ life1_3)));
    return __call1294_5(__fieldRead1294_4(), life3_17);
}
public static void h1294_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1129400_0(p0);
}
private static native long __fieldRead1294_0() throws Throwable;
private static native moom.Jk __fieldRead1294_1() throws Throwable;
private static native int __invokedynamic1294_2(int a0, long a1) throws Throwable;
private static native int __call1294_3(net.minecraft.block.state.IBlockState a0, int a1) throws Throwable;
private static native moom.Jk __fieldRead1294_4() throws Throwable;
private static native int __call1294_5(moom.Jk a0, int a1) throws Throwable;
private static native java.lang.Exception __call1129400_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_eff369335605bcbde631(net.minecraft.block.state.IBlockState a0, int a1) throws E;
private static final class __SourceHandler_eff369335605bcbde631 {

public static int f733(net.minecraft.block.state.IBlockState p0, int p1) throws Throwable {
    int forwardValue733_15_0;
    int forwardValue733_31_0;
    net.minecraft.entity.Entity[] spill733_0;
    int spill733_1;
    int spill733_2;
    long life2_3;
    net.minecraft.block.Block life5_7;
    net.minecraft.entity.Entity[] life4_8;
    java.lang.Comparable life6_22;
    java.lang.Integer life7_33;
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    forward_join_16: {
    forward_join_15: {
    life2_3 = (__fieldRead733_0() ^ 10142864191345L);
    spill733_0 = __call733_1();
    life5_7 = __call733_2(p0);
    life4_8 = spill733_0;
    spill733_1 = __instanceOf733_3(life5_7);
    if (!((life4_8 != null))) {
        forwardValue733_15_0 = spill733_1;
        break forward_join_15;
    }
    if (!((spill733_1 == 0))) {
        break forward_join_16;
    }
    forwardValue733_15_0 = p1;
    }
    return forwardValue733_15_0;
    }
    life6_22 = __call733_5(p0, __fieldRead733_4());
    spill733_2 = __instanceOf733_6(life6_22);
    if (!((life4_8 != null))) {
        forwardValue733_31_0 = spill733_2;
        break forward_join_31;
    }
    if (!((spill733_2 != 0))) {
        break forward_join_30;
    }
    life7_33 = __cast733_7(life6_22);
    if (!((life4_8 == null))) {
        break forward_join_32;
    }
    }
    forwardValue733_31_0 = p1;
    }
    return forwardValue733_31_0;
    }
    return __call733_8(life7_33);
}
public static void h733_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1073300_0(p0);
}
public static void h733_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1073301_0(p0);
}
public static void h733_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1073302_0(p0);
}
private static native long __fieldRead733_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call733_1() throws Throwable;
private static native net.minecraft.block.Block __call733_2(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __instanceOf733_3(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fy __fieldRead733_4() throws Throwable;
private static native java.lang.Comparable __call733_5(net.minecraft.block.state.IBlockState a0, moom.fy a1) throws Throwable;
private static native int __instanceOf733_6(java.lang.Comparable a0) throws Throwable;
private static native java.lang.Integer __cast733_7(java.lang.Comparable a0) throws Throwable;
private static native int __call733_8(java.lang.Integer a0) throws Throwable;
private static native java.lang.Exception __call1073300_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1073301_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1073302_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_0d8a53f830094f4578ba(net.minecraft.block.state.IBlockState a0, net.minecraft.world.IBlockAccess a1, moom.DT a2, moom.Jr a3, moom.DX a4) throws E;
private static final class __SourceHandler_0d8a53f830094f4578ba {

public static int f734(net.minecraft.block.state.IBlockState p0, net.minecraft.world.IBlockAccess p1, moom.DT p2, moom.Jr p3, moom.DX p4) throws Throwable {
    int lexicalValue734_117_0;
    net.minecraft.entity.Entity[] spill734_0;
    int spill734_1;
    long life5_3;
    int life8_5;
    int life9_8;
    int life10_10;
    int life11_13;
    net.minecraft.entity.Entity[] life7_14;
    int life12_17;
    int life13_20;
    int life14_24;
    int life15_35;
    int life16_51;
    int life15_120;
    int life16_128;
    lexical_join_117: {
    lexical_join_102: {
    life5_3 = (__fieldRead734_0() ^ 32739433998006L);
    life8_5 = 0;
    spill734_0 = __call734_1();
    life9_8 = 0;
    life10_10 = 0;
    life11_13 = __call734_2(p2);
    life7_14 = spill734_0;
    life12_17 = __call734_3(p2);
    life13_20 = __call734_4(p2);
    life14_24 = (life11_13 - 1);
    lexical_cycle_25: while (true) {
    lexical_join_100: {
    lexical_join_99: {
    if (!((life14_24 <= (life11_13 + 1)))) {
        break lexical_join_102;
    }
    spill734_1 = (life13_20 - 1);
    if (!((life7_14 != null))) {
        lexicalValue734_117_0 = spill734_1;
        break lexical_join_117;
    }
    life15_35 = spill734_1;
    lexical_cycle_36: while (true) {
    if (!((life15_35 <= (life13_20 + 1)))) {
        break lexical_join_99;
    }
    __call734_5(p4, life14_24, life12_17, life15_35);
    life16_51 = __call734_6(p3, p0, p1, p4);
    life8_5 = (life8_5 + ((life16_51 >> __invokedynamic734_7(28699, (2595829907975495802L ^ life5_3))) & __invokedynamic734_8(9112, (7192271133487838193L ^ life5_3))));
    life9_8 = (life9_8 + ((life16_51 >> __invokedynamic734_9(1157, (2143221299874862307L ^ life5_3))) & __invokedynamic734_10(9112, (7192271133487838193L ^ life5_3))));
    life10_10 = (life10_10 + (life16_51 & __invokedynamic734_11(9112, (7192271133487838193L ^ life5_3))));
    life15_35 += 1;
    if (!((life7_14 != null))) {
        break lexical_join_100;
    }
    if (!((life7_14 == null))) { continue lexical_cycle_36; }
    break lexical_cycle_36;
    }
    }
    life14_24 += 1;
    }
    if (!((life7_14 == null))) { continue lexical_cycle_25; }
    break lexical_cycle_25;
    }
    }
    life14_24 = (life8_5 / __invokedynamic734_12(759, (5496615466489844375L ^ life5_3)));
    lexicalValue734_117_0 = (life9_8 / __invokedynamic734_13(823, (2540974961216361311L ^ life5_3)));
    }
    life15_120 = lexicalValue734_117_0;
    life16_128 = (life10_10 / __invokedynamic734_14(823, (2540974961216361311L ^ life5_3)));
    return (((life14_24 << __invokedynamic734_15(28699, (2595829907975495802L ^ life5_3))) | (life15_120 << __invokedynamic734_16(1157, (2143221299874862307L ^ life5_3)))) | life16_128);
}
public static void h734_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1073400_0(p0);
}
private static native long __fieldRead734_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call734_1() throws Throwable;
private static native int __call734_2(moom.DT a0) throws Throwable;
private static native int __call734_3(moom.DT a0) throws Throwable;
private static native int __call734_4(moom.DT a0) throws Throwable;
private static native void __call734_5(moom.DX a0, int a1, int a2, int a3) throws Throwable;
private static native int __call734_6(moom.Jr a0, net.minecraft.block.state.IBlockState a1, net.minecraft.world.IBlockAccess a2, moom.DX a3) throws Throwable;
private static native int __invokedynamic734_7(int a0, long a1) throws Throwable;
private static native int __invokedynamic734_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic734_9(int a0, long a1) throws Throwable;
private static native int __invokedynamic734_10(int a0, long a1) throws Throwable;
private static native int __invokedynamic734_11(int a0, long a1) throws Throwable;
private static native int __invokedynamic734_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic734_13(int a0, long a1) throws Throwable;
private static native int __invokedynamic734_14(int a0, long a1) throws Throwable;
private static native int __invokedynamic734_15(int a0, long a1) throws Throwable;
private static native int __invokedynamic734_16(int a0, long a1) throws Throwable;
private static native java.lang.Exception __call1073400_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5462ac5fcf442a242987(net.minecraft.client.particle.EntityFX a0) throws E;
private static final class __SourceHandler_5462ac5fcf442a242987 {

public static void f735(net.minecraft.client.particle.EntityFX p0) throws Throwable {
    int forwardValue735_11_0;
    int spill735_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    int life4_14;
    int life5_28;
    int life6_42;
    int life7_50;
    float life8_55;
    float life9_60;
    float life10_65;
    forward_join_68: {
    forward_join_11: {
    life1_3 = (__fieldRead735_0() ^ 133504435934172L);
    life3_5 = __call735_1();
    spill735_0 = __fieldRead735_2();
    if (!((life3_5 != null))) {
        forwardValue735_11_0 = spill735_0;
        break forward_join_11;
    }
    if (!((spill735_0 >= 0))) {
        break forward_join_68;
    }
    forwardValue735_11_0 = __fieldRead735_3();
    }
    life4_14 = forwardValue735_11_0;
    life5_28 = ((life4_14 >> __invokedynamic735_4(28699, (2595860233898775824L ^ life1_3))) & __invokedynamic735_5(9112, (7192372643666396827L ^ life1_3)));
    life6_42 = ((life4_14 >> __invokedynamic735_6(1157, (2143190913755128201L ^ life1_3))) & __invokedynamic735_7(9112, (7192372643666396827L ^ life1_3)));
    life7_50 = (life4_14 & __invokedynamic735_8(9112, (7192372643666396827L ^ life1_3)));
    life8_55 = (((float) life5_28) / 0x1.fep7f);
    life9_60 = (((float) life6_42) / 0x1.fep7f);
    life10_65 = (((float) life7_50) / 0x1.fep7f);
    __call735_9(p0, life8_55, life9_60, life10_65);
    }
    return;
}
public static void h735_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1073500_0(p0);
}
private static native long __fieldRead735_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call735_1() throws Throwable;
private static native int __fieldRead735_2() throws Throwable;
private static native int __fieldRead735_3() throws Throwable;
private static native int __invokedynamic735_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic735_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic735_6(int a0, long a1) throws Throwable;
private static native int __invokedynamic735_7(int a0, long a1) throws Throwable;
private static native int __invokedynamic735_8(int a0, long a1) throws Throwable;
private static native void __call735_9(net.minecraft.client.particle.EntityFX a0, float a1, float a2, float a3) throws Throwable;
private static native java.lang.Exception __call1073500_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_19f2d79c4e536a1d396a(net.minecraft.client.particle.EntityFX a0, net.minecraft.world.IBlockAccess a1, double a2, double a3, double a4, moom.Mi a5) throws E;
private static final class __SourceHandler_19f2d79c4e536a1d396a {

public static void f736(net.minecraft.client.particle.EntityFX p0, net.minecraft.world.IBlockAccess p1, double p2, double p3, double p4, moom.Mi p5) throws Throwable {
    int forwardValue736_97_0;
    int spill736_0;
    long life9_3;
    net.minecraft.entity.Entity[] life11_5;
    moom.DT life12_24;
    int life13_34;
    int life14_48;
    int life15_62;
    int life16_70;
    float life17_75;
    float life18_80;
    float life19_85;
    int life20_109;
    int life21_123;
    int life22_131;
    forward_join_146: {
    forward_join_141: {
    forward_join_97: {
    forward_join_12: {
    life9_3 = (__fieldRead736_0() ^ 97045026478714L);
    life11_5 = __call736_1();
    if (!((__fieldRead736_2() == null))) {
        break forward_join_12;
    }
    if (!((__fieldRead736_3() == null))) {
        break forward_join_12;
    }
    if (!((__fieldRead736_4() >= 0))) {
        break forward_join_146;
    }
    }
    life12_24 = new moom.DT(p2, p3, p4);
    __call736_6(p5, __fieldRead736_5(), life12_24);
    life13_34 = __call736_8(p1, __fieldRead736_7(), life12_24, p5);
    life14_48 = ((life13_34 >> __invokedynamic736_9(28699, (2595894219473624246L ^ life9_3))) & __invokedynamic736_10(9112, (7192338734394068797L ^ life9_3)));
    life15_62 = ((life13_34 >> __invokedynamic736_11(1157, (2143156996966606895L ^ life9_3))) & __invokedynamic736_12(9112, (7192338734394068797L ^ life9_3)));
    life16_70 = (life13_34 & __invokedynamic736_13(9112, (7192338734394068797L ^ life9_3)));
    life17_75 = (((float) life14_48) / 0x1.fep7f);
    life18_80 = (((float) life15_62) / 0x1.fep7f);
    life19_85 = (((float) life16_70) / 0x1.fep7f);
    spill736_0 = __fieldRead736_14();
    if (!((life11_5 != null))) {
        forwardValue736_97_0 = spill736_0;
        break forward_join_97;
    }
    if (!((spill736_0 >= 0))) {
        break forward_join_141;
    }
    forwardValue736_97_0 = ((__fieldRead736_15() >> __invokedynamic736_16(28699, (2595894219473624246L ^ life9_3))) & __invokedynamic736_17(9112, (7192338734394068797L ^ life9_3)));
    }
    life20_109 = forwardValue736_97_0;
    life21_123 = ((__fieldRead736_18() >> __invokedynamic736_19(1157, (2143156996966606895L ^ life9_3))) & __invokedynamic736_20(9112, (7192338734394068797L ^ life9_3)));
    life22_131 = (__fieldRead736_21() & __invokedynamic736_22(9112, (7192338734394068797L ^ life9_3)));
    life17_75 = (life17_75 * (((float) life20_109) / 0x1.fep7f));
    life18_80 = (life18_80 * (((float) life21_123) / 0x1.fep7f));
    life19_85 = (life19_85 * (((float) life22_131) / 0x1.fep7f));
    }
    __call736_23(p0, life17_75, life18_80, life19_85);
    }
    return;
}
public static void h736_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1073600_0(p0);
}
public static void h736_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1073601_0(p0);
}
public static void h736_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1073602_0(p0);
}
public static void h736_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1073603_0(p0);
}
private static native long __fieldRead736_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call736_1() throws Throwable;
private static native moom.Jk __fieldRead736_2() throws Throwable;
private static native moom.Jk[][] __fieldRead736_3() throws Throwable;
private static native int __fieldRead736_4() throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead736_5() throws Throwable;
private static native void __call736_6(moom.Mi a0, net.minecraft.block.state.IBlockState a1, moom.DT a2) throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead736_7() throws Throwable;
private static native int __call736_8(net.minecraft.world.IBlockAccess a0, net.minecraft.block.state.IBlockState a1, moom.DT a2, moom.Mi a3) throws Throwable;
private static native int __invokedynamic736_9(int a0, long a1) throws Throwable;
private static native int __invokedynamic736_10(int a0, long a1) throws Throwable;
private static native int __invokedynamic736_11(int a0, long a1) throws Throwable;
private static native int __invokedynamic736_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic736_13(int a0, long a1) throws Throwable;
private static native int __fieldRead736_14() throws Throwable;
private static native int __fieldRead736_15() throws Throwable;
private static native int __invokedynamic736_16(int a0, long a1) throws Throwable;
private static native int __invokedynamic736_17(int a0, long a1) throws Throwable;
private static native int __fieldRead736_18() throws Throwable;
private static native int __invokedynamic736_19(int a0, long a1) throws Throwable;
private static native int __invokedynamic736_20(int a0, long a1) throws Throwable;
private static native int __fieldRead736_21() throws Throwable;
private static native int __invokedynamic736_22(int a0, long a1) throws Throwable;
private static native void __call736_23(net.minecraft.client.particle.EntityFX a0, float a1, float a2, float a3) throws Throwable;
private static native java.lang.Exception __call1073600_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1073601_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1073602_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1073603_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> float[] __sourceHandlerCall_0af02799d8b515a247c0(net.minecraft.item.EnumDyeColor a0, float[][] a1, float[] a2) throws E;
private static final class __SourceHandler_0af02799d8b515a247c0 {

public static float[] f737(net.minecraft.item.EnumDyeColor p0, float[][] p1, float[] p2) throws Throwable {
    float[] forwardValue737_24_0;
    float[] forwardValue737_26_0;
    float[] spill737_0;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    float[] life6_22;
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    forward_join_14: {
    forward_join_10: {
    life3_3 = (__fieldRead737_0() ^ 118860032815041L);
    life5_5 = __call737_1();
    if (!((p1 == null))) {
        break forward_join_10;
    }
    return p2;
    }
    if (!((p0 == null))) {
        break forward_join_14;
    }
    return p2;
    }
    life6_22 = (p1)[__call737_2(p0)];
    spill737_0 = life6_22;
    if (!((life5_5 != null))) {
        forwardValue737_24_0 = spill737_0;
        break forward_join_24;
    }
    if (!((spill737_0 == null))) {
        break forward_join_25;
    }
    forwardValue737_24_0 = p2;
    }
    forwardValue737_26_0 = forwardValue737_24_0;
    break forward_join_26;
    }
    forwardValue737_26_0 = life6_22;
    }
    return forwardValue737_26_0;
}
public static void h737_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1073700_0(p0);
}
public static void h737_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1073701_0(p0);
}
public static void h737_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1073702_0(p0);
}
private static native long __fieldRead737_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call737_1() throws Throwable;
private static native int __call737_2(net.minecraft.item.EnumDyeColor a0) throws Throwable;
private static native java.lang.Exception __call1073700_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1073701_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1073702_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_6bd08d4a804277461707(net.minecraft.item.ItemStack a0, int a1, int a2) throws E;
private static final class __SourceHandler_6bd08d4a804277461707 {

public static int f738(net.minecraft.item.ItemStack p0, int p1, int p2) throws Throwable {
    net.minecraft.item.ItemStack forwardValue738_13_0;
    net.minecraft.item.Item forwardValue738_22_0;
    int forwardValue738_32_0;
    int forwardValue738_34_0;
    net.minecraft.item.ItemStack spill738_0;
    net.minecraft.item.Item spill738_1;
    int spill738_2;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    net.minecraft.item.Item life6_19;
    forward_join_34: {
    forward_join_33: {
    forward_join_32: {
    forward_join_22: {
    forward_join_21: {
    forward_join_13: {
    forward_join_12: {
    life3_3 = (__fieldRead738_0() ^ 77471115791397L);
    life5_5 = __call738_1();
    spill738_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue738_13_0 = spill738_0;
        break forward_join_13;
    }
    if (!((spill738_0 == null))) {
        break forward_join_12;
    }
    return p2;
    }
    forwardValue738_13_0 = p0;
    }
    life6_19 = __call738_2(forwardValue738_13_0);
    spill738_1 = life6_19;
    if (!((life5_5 != null))) {
        forwardValue738_22_0 = spill738_1;
        break forward_join_22;
    }
    if (!((spill738_1 == null))) {
        break forward_join_21;
    }
    forwardValue738_34_0 = p2;
    break forward_join_34;
    }
    forwardValue738_22_0 = life6_19;
    }
    spill738_2 = __instanceOf738_3(forwardValue738_22_0);
    if (!((life5_5 != null))) {
        forwardValue738_32_0 = spill738_2;
        break forward_join_32;
    }
    if (!((spill738_2 != 0))) {
        break forward_join_33;
    }
    forwardValue738_32_0 = __call738_5(__cast738_4(life6_19), p0, p1, p2);
    }
    forwardValue738_34_0 = forwardValue738_32_0;
    break forward_join_34;
    }
    forwardValue738_34_0 = p2;
    }
    return forwardValue738_34_0;
}
public static void h738_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1073800_0(p0);
}
public static void h738_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1073801_0(p0);
}
public static void h738_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1073802_0(p0);
}
public static void h738_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1073803_0(p0);
}
public static void h738_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1073804_0(p0);
}
public static void h738_5(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1073805_0(p0);
}
private static native long __fieldRead738_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call738_1() throws Throwable;
private static native net.minecraft.item.Item __call738_2(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __instanceOf738_3(net.minecraft.item.Item a0) throws Throwable;
private static native moom.xC __cast738_4(net.minecraft.item.Item a0) throws Throwable;
private static native int __call738_5(moom.xC a0, net.minecraft.item.ItemStack a1, int a2, int a3) throws Throwable;
private static native java.lang.Exception __call1073800_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1073801_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1073802_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1073803_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1073804_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1073805_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> moom.DR __sourceHandlerCall_a4c061d9b95b7ce170ac(net.minecraft.world.IBlockAccess a0, double a1, double a2, double a3, moom.Jk a4, moom.Jj a5) throws E;
private static final class __SourceHandler_a4c061d9b95b7ce170ac {

public static moom.DR f739(net.minecraft.world.IBlockAccess p0, double p1, double p2, double p3, moom.Jk p4, moom.Jj p5) throws Throwable {
    moom.Jk forwardValue739_13_0;
    moom.Jk spill739_0;
    long life9_3;
    net.minecraft.entity.Entity[] life11_5;
    int life12_24;
    int life13_38;
    int life14_52;
    int life15_60;
    float life16_65;
    float life17_70;
    float life18_75;
    forward_join_13: {
    forward_join_12: {
    life9_3 = (__fieldRead739_0() ^ 92217187327531L);
    life11_5 = __call739_1();
    spill739_0 = p4;
    if (!((life11_5 != null))) {
        forwardValue739_13_0 = spill739_0;
        break forward_join_13;
    }
    if (!((spill739_0 == null))) {
        break forward_join_12;
    }
    return null;
    }
    forwardValue739_13_0 = p4;
    }
    life12_24 = __call739_2(forwardValue739_13_0, p0, p1, p2, p3, 3);
    life13_38 = ((life12_24 >> __invokedynamic739_3(28699, (2595889314866059495L ^ life9_3))) & __invokedynamic739_4(10084, (77290385749381018L ^ life9_3)));
    life14_52 = ((life12_24 >> __invokedynamic739_5(1157, (2143166359707823230L ^ life9_3))) & __invokedynamic739_6(9112, (7192347995104512876L ^ life9_3)));
    life15_60 = (life12_24 & __invokedynamic739_7(9112, (7192347995104512876L ^ life9_3)));
    life16_65 = (((float) life13_38) / 0x1.fep7f);
    life17_70 = (((float) life14_52) / 0x1.fep7f);
    life18_75 = (((float) life15_60) / 0x1.fep7f);
    return __call739_8(p5, ((double) life16_65), ((double) life17_70), ((double) life18_75));
}
public static void h739_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1073900_0(p0);
}
public static void h739_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1073901_0(p0);
}
private static native long __fieldRead739_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call739_1() throws Throwable;
private static native int __call739_2(moom.Jk a0, net.minecraft.world.IBlockAccess a1, double a2, double a3, double a4, int a5) throws Throwable;
private static native int __invokedynamic739_3(int a0, long a1) throws Throwable;
private static native int __invokedynamic739_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic739_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic739_6(int a0, long a1) throws Throwable;
private static native int __invokedynamic739_7(int a0, long a1) throws Throwable;
private static native moom.DR __call739_8(moom.Jj a0, double a1, double a2, double a3) throws Throwable;
private static native java.lang.Exception __call1073900_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1073901_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_43e951e6a4af2a02bdbb(net.minecraft.world.IBlockAccess a0, moom.DT a1) throws E;
private static final class __SourceHandler_43e951e6a4af2a02bdbb {

public static int f740(net.minecraft.world.IBlockAccess p0, moom.DT p1) throws Throwable {
    int forwardValue740_14_0;
    int forwardValue740_16_0;
    int spill740_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_14: {
    life2_3 = (__fieldRead740_0() ^ 115938024078214L);
    life4_5 = __call740_1();
    spill740_0 = __fieldRead740_2();
    if (!((life4_5 != null))) {
        forwardValue740_14_0 = spill740_0;
        break forward_join_14;
    }
    if (!((spill740_0 < 0))) {
        break forward_join_15;
    }
    forwardValue740_14_0 = __call740_4(__fieldRead740_3(), p0, p1);
    }
    forwardValue740_16_0 = forwardValue740_14_0;
    break forward_join_16;
    }
    forwardValue740_16_0 = __fieldRead740_5();
    }
    return forwardValue740_16_0;
}
public static void h740_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1074000_0(p0);
}
public static void h740_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1074001_0(p0);
}
private static native long __fieldRead740_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call740_1() throws Throwable;
private static native int __fieldRead740_2() throws Throwable;
private static native net.minecraft.block.Block __fieldRead740_3() throws Throwable;
private static native int __call740_4(net.minecraft.block.Block a0, net.minecraft.world.IBlockAccess a1, moom.DT a2) throws Throwable;
private static native int __fieldRead740_5() throws Throwable;
private static native java.lang.Exception __call1074000_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1074001_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_f3091b7f15ba6e1d8c63(net.minecraft.world.IBlockAccess a0, net.minecraft.block.state.IBlockState a1, moom.DT a2, moom.Mi a3) throws E;
private static final class __SourceHandler_f3091b7f15ba6e1d8c63 {

public static int f8(net.minecraft.world.IBlockAccess p0, net.minecraft.block.state.IBlockState p1, moom.DT p2, moom.Mi p3) throws Throwable {
    moom.Jr forestValue8_24_0;
    int forestValue8_39_0;
    moom.Jr forestValue8_49_0;
    int forestValue8_53_0;
    net.minecraft.entity.Entity[] spill8_0;
    moom.Jr spill8_1;
    boolean spill8_2;
    moom.Jr spill8_3;
    long life4_3;
    net.minecraft.block.Block life7_7;
    net.minecraft.entity.Entity[] life6_8;
    moom.Jr life8_11;
    forest_join_53: {
    forest_join_49: {
    forest_join_48: {
    forest_join_39: {
    forest_join_31: {
    forest_join_24: {
    forest_join_23: {
    life4_3 = (__fieldRead8_0() ^ 115336055550625L);
    spill8_0 = __call8_1();
    life7_7 = __call8_2(p1);
    life6_8 = spill8_0;
    life8_11 = __call8_3(p1);
    spill8_1 = life8_11;
    if (!((life6_8 != null))) {
        forestValue8_24_0 = spill8_1;
        break forest_join_24;
    }
    if (!((spill8_1 == null))) {
        break forest_join_23;
    }
    if (!((__call8_5(__call8_4(p1)) == __fieldRead8_6()))) {
        break forest_join_23;
    }
    life8_11 = __fieldRead8_7();
    }
    forestValue8_24_0 = life8_11;
    }
    if (!((forestValue8_24_0 == null))) {
        break forest_join_31;
    }
    forestValue8_53_0 = __call8_8(life7_7, p0, p2, 0);
    break forest_join_53;
    }
    spill8_2 = __call8_9();
    if (!((life6_8 != null))) {
        forestValue8_39_0 = __integerCategory8_10(spill8_2);
        break forest_join_39;
    }
    if (!(spill8_2)) {
        break forest_join_48;
    }
    spill8_3 = life8_11;
    if (!((life6_8 != null))) {
        forestValue8_49_0 = spill8_3;
        break forest_join_49;
    }
    forestValue8_39_0 = __integerCategory8_12(__call8_11(spill8_3));
    }
    if (!((forestValue8_39_0 == 0))) {
        break forest_join_48;
    }
    forestValue8_53_0 = __call8_14(p1, p0, p2, life8_11, __call8_13(p3));
    break forest_join_53;
    }
    forestValue8_49_0 = life8_11;
    }
    forestValue8_53_0 = __call8_15(forestValue8_49_0, p1, p0, p2);
    }
    return forestValue8_53_0;
}
public static int h8_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3000800_0(p0);
}
public static int h8_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3000801_0(p0);
}
public static int h8_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3000802_0(p0);
}
public static int h8_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3000803_0(p0);
}
public static int h8_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3000804_0(p0);
}
public static int h8_5(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3000805_0(p0);
}
public static int h8_6(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3000806_0(p0);
}
private static native long __fieldRead8_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call8_1() throws Throwable;
private static native net.minecraft.block.Block __call8_2(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.Jk __call8_3(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.block.Block __call8_4(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.fn __call8_5(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead8_6() throws Throwable;
private static native moom.Jr __fieldRead8_7() throws Throwable;
private static native int __call8_8(net.minecraft.block.Block a0, net.minecraft.world.IBlockAccess a1, moom.DT a2, int a3) throws Throwable;
private static native boolean __call8_9() throws Throwable;
private static native int __integerCategory8_10(boolean value) throws Throwable;
private static native boolean __call8_11(moom.Jr a0) throws Throwable;
private static native int __integerCategory8_12(boolean value) throws Throwable;
private static native moom.DX __call8_13(moom.Mi a0) throws Throwable;
private static native int __call8_14(net.minecraft.block.state.IBlockState a0, net.minecraft.world.IBlockAccess a1, moom.DT a2, moom.Jr a3, moom.DX a4) throws Throwable;
private static native int __call8_15(moom.Jr a0, net.minecraft.block.state.IBlockState a1, net.minecraft.world.IBlockAccess a2, moom.DT a3) throws Throwable;
private static native java.lang.Exception __call3000800_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3000801_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3000802_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3000803_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3000804_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3000805_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3000806_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_174dc6e30df73fc32584(net.minecraft.world.World a0, float a1, int[] a2, boolean a3, float a4) throws E;
private static final class __SourceHandler_174dc6e30df73fc32584 {

public static boolean f741(net.minecraft.world.World p0, float p1, int[] p2, boolean p3, float p4) throws Throwable {
    moom.JO forwardValue741_41_0;
    int forwardValue741_51_0;
    int forwardValue741_53_0;
    int forwardValue741_55_0;
    int spill741_0;
    int spill741_1;
    moom.JO spill741_2;
    boolean spill741_3;
    long life5_3;
    net.minecraft.entity.Entity[] life7_5;
    int life8_21;
    int life9_25;
    moom.JO life10_48;
    forward_join_55: {
    forward_join_54: {
    forward_join_53: {
    forward_join_52: {
    forward_join_51: {
    forward_join_41: {
    forward_join_14: {
    forward_join_10: {
    life5_3 = (__fieldRead741_0() ^ 105770743027363L);
    life7_5 = __call741_1();
    if (!((p0 == null))) {
        break forward_join_10;
    }
    return __integerCategory741_2(0);
    }
    if (!((__fieldRead741_3() == null))) {
        break forward_join_14;
    }
    return __integerCategory741_4(0);
    }
    life8_21 = __call741_6(__fieldRead741_5(p0));
    life9_25 = (life8_21 - __fieldRead741_7());
    spill741_0 = life9_25;
    if (!((life7_5 != null))) {
        forwardValue741_55_0 = spill741_0;
        break forward_join_55;
    }
    if (!((spill741_0 >= 0))) {
        break forward_join_54;
    }
    spill741_1 = life9_25;
    if (!((life7_5 != null))) {
        forwardValue741_55_0 = spill741_1;
        break forward_join_55;
    }
    if (!((spill741_1 < (__fieldRead741_8()).length))) {
        break forward_join_54;
    }
    life10_48 = (__fieldRead741_9())[life9_25];
    spill741_2 = life10_48;
    if (!((life7_5 != null))) {
        forwardValue741_41_0 = spill741_2;
        break forward_join_41;
    }
    if (!((spill741_2 != null))) {
        break forward_join_52;
    }
    forwardValue741_41_0 = life10_48;
    }
    spill741_3 = __call741_10(forwardValue741_41_0, p0, p1, p2, p3, p4);
    if (!((life7_5 != null))) {
        forwardValue741_51_0 = __integerCategory741_11(spill741_3);
        break forward_join_51;
    }
    if (!(spill741_3)) {
        break forward_join_52;
    }
    forwardValue741_51_0 = 1;
    }
    forwardValue741_53_0 = forwardValue741_51_0;
    break forward_join_53;
    }
    forwardValue741_53_0 = 0;
    }
    return __integerCategory741_12(forwardValue741_53_0);
    }
    forwardValue741_55_0 = 0;
    }
    return __integerCategory741_13(forwardValue741_55_0);
}
public static void h741_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1074100_0(p0);
}
public static void h741_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1074101_0(p0);
}
public static void h741_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1074102_0(p0);
}
public static void h741_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1074103_0(p0);
}
public static void h741_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1074104_0(p0);
}
public static void h741_5(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1074105_0(p0);
}
public static void h741_6(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1074106_0(p0);
}
private static native long __fieldRead741_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call741_1() throws Throwable;
private static native boolean __integerCategory741_2(int value) throws Throwable;
private static native moom.JO[] __fieldRead741_3() throws Throwable;
private static native boolean __integerCategory741_4(int value) throws Throwable;
private static native moom.EA __fieldRead741_5(net.minecraft.world.World a0) throws Throwable;
private static native int __call741_6(moom.EA a0) throws Throwable;
private static native int __fieldRead741_7() throws Throwable;
private static native moom.JO[] __fieldRead741_8() throws Throwable;
private static native moom.JO[] __fieldRead741_9() throws Throwable;
private static native boolean __call741_10(moom.JO a0, net.minecraft.world.World a1, float a2, int[] a3, boolean a4, float a5) throws Throwable;
private static native int __integerCategory741_11(boolean value) throws Throwable;
private static native boolean __integerCategory741_12(int value) throws Throwable;
private static native boolean __integerCategory741_13(int value) throws Throwable;
private static native java.lang.Exception __call1074100_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1074101_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1074102_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1074103_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1074104_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1074105_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1074106_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_54334baf4ad0cb343bdf(int[] a0) throws E;
private static final class __SourceHandler_54334baf4ad0cb343bdf {

public static void f742(int[] p0) throws Throwable {
    int lexicalValue742_52_0;
    int lexicalValue742_57_0;
    int spill742_0;
    int spill742_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    moom.fm[] life4_9;
    int life5_11;
    int life6_13;
    moom.fm life7_35;
    int life8_46;
    lexical_join_61: {
    lexical_join_57: {
    lexical_join_56: {
    life1_3 = (__fieldRead742_0() ^ 71240132757666L);
    life3_5 = __call742_1();
    if (!((p0 != null))) {
        break lexical_join_61;
    }
    life4_9 = __fieldRead742_2();
    life5_11 = 0;
    life6_13 = 0;
    lexical_cycle_14: while (true) {
    lexical_join_54: {
    lexical_join_53: {
    lexical_join_52: {
    if (!((life6_13 < (life4_9).length))) {
        break lexical_join_56;
    }
    spill742_0 = life6_13;
    if (!((life3_5 != null))) {
        lexicalValue742_57_0 = spill742_0;
        break lexical_join_57;
    }
    if (!((life3_5 != null))) {
        lexicalValue742_57_0 = spill742_0;
        break lexical_join_57;
    }
    if (!((spill742_0 < (p0).length))) {
        break lexical_join_56;
    }
    life7_35 = (life4_9)[life6_13];
    if (!((life3_5 != null))) {
        break lexical_join_54;
    }
    if (!((life7_35 != null))) {
        break lexical_join_53;
    }
    life8_46 = (p0)[life6_13];
    if (!((life3_5 != null))) {
        break lexical_join_54;
    }
    if (!((life8_46 >= 0))) {
        break lexical_join_53;
    }
    spill742_1 = __fieldRead742_3(life7_35);
    if (!((life3_5 != null))) {
        lexicalValue742_52_0 = spill742_1;
        break lexical_join_52;
    }
    if (!((spill742_1 != life8_46))) {
        break lexical_join_53;
    }
    __fieldWrite742_4(life7_35, life8_46);
    lexicalValue742_52_0 = 1;
    }
    life5_11 = lexicalValue742_52_0;
    }
    life6_13 += 1;
    }
    if (!((life3_5 == null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    lexicalValue742_57_0 = life5_11;
    }
    if (!((lexicalValue742_57_0 != 0))) {
        break lexical_join_61;
    }
    __call742_7(__call742_6(__call742_5()));
    }
    return;
}
public static void h742_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1074200_0(p0);
}
public static void h742_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1074201_0(p0);
}
public static void h742_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1074202_0(p0);
}
public static void h742_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1074203_0(p0);
}
public static void h742_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1074204_0(p0);
}
public static void h742_5(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1074205_0(p0);
}
public static void h742_6(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1074206_0(p0);
}
public static void h742_7(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1074207_0(p0);
}
private static native long __fieldRead742_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call742_1() throws Throwable;
private static native moom.fm[] __fieldRead742_2() throws Throwable;
private static native int __fieldRead742_3(moom.fm a0) throws Throwable;
private static native void __fieldWrite742_4(moom.fm a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __call742_5() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call742_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call742_7(net.minecraft.client.renderer.texture.TextureManager a0) throws Throwable;
private static native java.lang.Exception __call1074200_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1074201_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1074202_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1074203_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1074204_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1074205_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1074206_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1074207_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> moom.Jk[][] __sourceHandlerCall_664e70a76a23c94a6e45(java.lang.String[] a0, moom.Jk[] a1, int a2, int a3) throws E;
private static final class __SourceHandler_664e70a76a23c94a6e45 {

public static moom.Jk[][] f100088(java.lang.String[] p0, moom.Jk[] p1, int p2, int p3) throws Throwable {
    int forestValue100088_107_0;
    moom.Jk forestValue100088_109_0;
    moom.Jk[] forestValue100088_119_0;
    java.util.ArrayList forestValue100088_148_0;
    java.lang.String[] spill100088_0;
    java.lang.String[] spill100088_1;
    net.minecraft.entity.Entity[] spill100088_2;
    boolean spill100088_3;
    moom.Jk spill100088_4;
    moom.Jk[] spill100088_5;
    java.util.ArrayList spill100088_6;
    long life4_3;
    java.lang.String[] life7_16;
    java.util.ArrayList life8_23;
    net.minecraft.entity.Entity[] life6_24;
    java.lang.String[] life9_26;
    int life10_29;
    int life11_31;
    java.lang.String life12_38;
    moom.DD life13_57;
    java.io.InputStream life14_60;
    moom.OH life15_84;
    moom.Jk life16_98;
    moom.Jk[] life9_127;
    int life10_130;
    int life11_132;
    moom.Jk life12_139;
    forest_join_148: {
    forest_join_147: {
    forest_join_140: {
    forest_join_119: {
    forest_join_114: {
    life4_3 = (__fieldRead100088_0() ^ 137474248048765L);
    spill100088_0 = p0;
    java.lang.String[] __stackOp100088_1_0 = new java.lang.String[1];
    spill100088_1 = __stackOp100088_1_0;
    (__stackOp100088_1_0)[0] = __invokedynamic100088_2(4490, (2251604839153642544L ^ life4_3));
    life7_16 = __call100088_3(spill100088_0, spill100088_1);
    spill100088_2 = __call100088_4();
    __call100088_5(life7_16);
    life8_23 = new java.util.ArrayList();
    life6_24 = spill100088_2;
    life9_26 = life7_16;
    life10_29 = (life9_26).length;
    life11_31 = 0;
    forest_cycle_32: while (true) {
    forest_join_111: {
    forest_join_109: {
    forest_join_107: {
    forest_join_78: {
    forest_join_76: {
    if (!((life11_31 < life10_29))) {
        break forest_join_114;
    }
    life12_38 = (life9_26)[life11_31];
    java.lang.String __stackOp100088_7_0 = life12_38;
    java.lang.String __stackOp100088_7_1 = __invokedynamic100088_6(11700, (5949154730622292154L ^ life4_3));
    __call100088_9(__invokedynamic100088_8(__stackOp100088_7_1, __stackOp100088_7_0));
    life13_57 = new moom.DD(__invokedynamic100088_10(19157, (2520838943777814311L ^ life4_3)), life12_38);
    life14_60 = __call100088_11(life13_57);
    if (!((life6_24 != null))) {
        break forest_join_140;
    }
    if (!((life6_24 != null))) {
        break forest_join_76;
    }
    if (!((life14_60 == null))) {
        break forest_join_78;
    }
    java.lang.String __stackOp100088_13_0 = life12_38;
    java.lang.String __stackOp100088_13_1 = __invokedynamic100088_12(2548, (2770766062950757460L ^ life4_3));
    __call100088_15(__invokedynamic100088_14(__stackOp100088_13_1, __stackOp100088_13_0));
    }
    if (!((life6_24 == null))) {
        break forest_join_111;
    }
    }
    life15_84 = new moom.OH();
    __call100088_16(life15_84, life14_60);
    __call100088_17(life14_60);
    life16_98 = new moom.Jk(life15_84, life12_38, p2, p3, __fieldRead100088_18());
    spill100088_3 = __call100088_19(life16_98, life12_38);
    if (!((life6_24 != null))) {
        forestValue100088_107_0 = __integerCategory100088_20(spill100088_3);
        break forest_join_107;
    }
    if (!(spill100088_3)) {
        break forest_join_111;
    }
    spill100088_4 = life16_98;
    if (!((life6_24 != null))) {
        forestValue100088_109_0 = spill100088_4;
        break forest_join_109;
    }
    forestValue100088_107_0 = __integerCategory100088_22(__call100088_21(spill100088_4, life12_38));
    }
    if (!((forestValue100088_107_0 != 0))) {
        break forest_join_111;
    }
    forestValue100088_109_0 = life16_98;
    }
    __call100088_23(forestValue100088_109_0, life8_23);
    }
    life11_31 += 1;
    if (!((life6_24 == null))) {
        continue forest_cycle_32;
    }
    break forest_cycle_32;
    }
    }
    spill100088_5 = p1;
    if (!((life6_24 != null))) {
        forestValue100088_119_0 = spill100088_5;
        break forest_join_119;
    }
    if (!((spill100088_5 != null))) {
        break forest_join_140;
    }
    forestValue100088_119_0 = p1;
    }
    life9_127 = forestValue100088_119_0;
    life10_130 = (life9_127).length;
    life11_132 = 0;
    forest_cycle_125: while (true) {
    if (!((life11_132 < life10_130))) {
        break forest_join_140;
    }
    life12_139 = (life9_127)[life11_132];
    __call100088_24(life12_139, life8_23);
    life11_132 += 1;
    if (!((life6_24 != null))) {
        break forest_join_147;
    }
    if (!((life6_24 == null))) {
        continue forest_cycle_125;
    }
    break forest_cycle_125;
    }
    }
    spill100088_6 = life8_23;
    if (!((life6_24 != null))) {
        forestValue100088_148_0 = spill100088_6;
        break forest_join_148;
    }
    if (!((__call100088_25(spill100088_6) == 0))) {
        break forest_join_147;
    }
    return null;
    }
    forestValue100088_148_0 = life8_23;
    }
    return __call100088_26(forestValue100088_148_0);
}
public static moom.Jk[][] h100088_0(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13008800_0(p0);
}
public static moom.Jk[][] h100088_1(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13008801_0(p0);
}
public static moom.Jk[][] h100088_2(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13008802_0(p0);
}
public static moom.Jk[][] h100088_3(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13008803_0(p0);
}
public static moom.Jk[][] h100088_4(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13008804_0(p0);
}
public static moom.Jk[][] h100088_5(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13008805_0(p0);
}
public static moom.Jk[][] h100088_6(java.io.FileNotFoundException p0, moom.Jk[] p1, int p2, int p3, long p4, net.minecraft.entity.Entity[] p5, java.util.ArrayList p6, java.lang.String[] p7, int p8, int p9, java.lang.String p10) throws Throwable {
    int forestValue13008806_90_0;
    moom.Jk forestValue13008806_92_0;
    moom.Jk[] forestValue13008806_100_0;
    java.util.ArrayList forestValue13008806_129_0;
    boolean spill13008806_0;
    moom.Jk spill13008806_1;
    moom.Jk[] spill13008806_2;
    java.util.ArrayList spill13008806_3;
    java.io.FileNotFoundException life12_2;
    java.lang.String life11_23;
    moom.DD life12_42;
    java.io.InputStream life13_45;
    moom.OH life14_69;
    moom.Jk life15_83;
    moom.Jk[] life8_109;
    int life9_112;
    int life10_114;
    moom.Jk life11_121;
    forest_join_129: {
    forest_join_128: {
    forest_join_121: {
    forest_join_100: {
    forest_join_95: {
    life12_2 = p0;
    java.lang.String __stackOp13008806_1_0 = p10;
    java.lang.String __stackOp13008806_1_1 = __invokedynamic13008806_0(12984, (2463332585279885180L ^ p4));
    __call13008806_3(__invokedynamic13008806_2(__stackOp13008806_1_1, __stackOp13008806_1_0));
    forest_cycle_11: while (true) {
    forest_join_94: {
    forest_join_92: {
    forest_join_90: {
    forest_join_61: {
    forest_join_59: {
    forest_join_15: {
    p9 += 1;
    if (!((p5 == null))) {
        break forest_join_15;
    }
    break forest_join_95;
    }
    if (!((p9 < p8))) {
        break forest_join_95;
    }
    life11_23 = (p7)[p9];
    java.lang.String __stackOp13008806_5_0 = life11_23;
    java.lang.String __stackOp13008806_5_1 = __invokedynamic13008806_4(11700, (5949154730622292154L ^ p4));
    __call13008806_7(__invokedynamic13008806_6(__stackOp13008806_5_1, __stackOp13008806_5_0));
    life12_42 = new moom.DD(__invokedynamic13008806_8(19157, (2520838943777814311L ^ p4)), life11_23);
    life13_45 = __call13008806_9(life12_42);
    if (!((p5 != null))) {
        break forest_join_121;
    }
    if (!((p5 != null))) {
        break forest_join_59;
    }
    if (!((life13_45 == null))) {
        break forest_join_61;
    }
    java.lang.String __stackOp13008806_11_0 = life11_23;
    java.lang.String __stackOp13008806_11_1 = __invokedynamic13008806_10(2548, (2770766062950757460L ^ p4));
    __call13008806_13(__invokedynamic13008806_12(__stackOp13008806_11_1, __stackOp13008806_11_0));
    }
    if (!((p5 == null))) {
        break forest_join_94;
    }
    }
    life14_69 = new moom.OH();
    __call13008806_14(life14_69, life13_45);
    __call13008806_15(life13_45);
    life15_83 = new moom.Jk(life14_69, life11_23, p2, p3, __fieldRead13008806_16());
    spill13008806_0 = __call13008806_17(life15_83, life11_23);
    if (!((p5 != null))) {
        forestValue13008806_90_0 = __integerCategory13008806_18(spill13008806_0);
        break forest_join_90;
    }
    if (!(spill13008806_0)) {
        break forest_join_94;
    }
    spill13008806_1 = life15_83;
    if (!((p5 != null))) {
        forestValue13008806_92_0 = spill13008806_1;
        break forest_join_92;
    }
    forestValue13008806_90_0 = __integerCategory13008806_20(__call13008806_19(spill13008806_1, life11_23));
    }
    if (!((forestValue13008806_90_0 != 0))) {
        break forest_join_94;
    }
    forestValue13008806_92_0 = life15_83;
    }
    __call13008806_21(forestValue13008806_92_0, p6);
    }
    continue forest_cycle_11;
    }
    }
    spill13008806_2 = p1;
    if (!((p5 != null))) {
        forestValue13008806_100_0 = spill13008806_2;
        break forest_join_100;
    }
    if (!((spill13008806_2 != null))) {
        break forest_join_121;
    }
    forestValue13008806_100_0 = p1;
    }
    life8_109 = forestValue13008806_100_0;
    life9_112 = (life8_109).length;
    life10_114 = 0;
    forest_cycle_106: while (true) {
    if (!((life10_114 < life9_112))) {
        break forest_join_121;
    }
    life11_121 = (life8_109)[life10_114];
    __call13008806_22(life11_121, p6);
    life10_114 += 1;
    if (!((p5 != null))) {
        break forest_join_128;
    }
    if (!((p5 == null))) {
        continue forest_cycle_106;
    }
    break forest_cycle_106;
    }
    }
    spill13008806_3 = p6;
    if (!((p5 != null))) {
        forestValue13008806_129_0 = spill13008806_3;
        break forest_join_129;
    }
    if (!((__call13008806_23(spill13008806_3) == 0))) {
        break forest_join_128;
    }
    return null;
    }
    forestValue13008806_129_0 = p6;
    }
    return __call13008806_24(forestValue13008806_129_0);
}
public static moom.Jk[][] h100088_7(java.lang.Exception p0, moom.Jk[] p1, int p2, int p3, long p4, net.minecraft.entity.Entity[] p5, java.util.ArrayList p6, java.lang.String[] p7, int p8, int p9) throws Throwable {
    int forestValue13008807_83_0;
    moom.Jk forestValue13008807_85_0;
    moom.Jk[] forestValue13008807_93_0;
    java.util.ArrayList forestValue13008807_122_0;
    boolean spill13008807_0;
    moom.Jk spill13008807_1;
    moom.Jk[] spill13008807_2;
    java.util.ArrayList spill13008807_3;
    java.lang.Exception life12_2;
    java.lang.String life11_15;
    moom.DD life12_34;
    java.io.InputStream life13_37;
    moom.OH life14_61;
    moom.Jk life15_75;
    moom.Jk[] life8_101;
    int life9_104;
    int life10_106;
    moom.Jk life11_113;
    forest_join_122: {
    forest_join_121: {
    forest_join_114: {
    forest_join_93: {
    forest_join_88: {
    life12_2 = p0;
    __call13008807_0(life12_2);
    forest_cycle_4: while (true) {
    forest_join_87: {
    forest_join_85: {
    forest_join_83: {
    forest_join_54: {
    forest_join_52: {
    forest_join_8: {
    p9 += 1;
    if (!((p5 == null))) {
        break forest_join_8;
    }
    break forest_join_88;
    }
    if (!((p9 < p8))) {
        break forest_join_88;
    }
    life11_15 = (p7)[p9];
    java.lang.String __stackOp13008807_2_0 = life11_15;
    java.lang.String __stackOp13008807_2_1 = __invokedynamic13008807_1(11700, (5949154730622292154L ^ p4));
    __call13008807_4(__invokedynamic13008807_3(__stackOp13008807_2_1, __stackOp13008807_2_0));
    life12_34 = new moom.DD(__invokedynamic13008807_5(19157, (2520838943777814311L ^ p4)), life11_15);
    life13_37 = __call13008807_6(life12_34);
    if (!((p5 != null))) {
        break forest_join_114;
    }
    if (!((p5 != null))) {
        break forest_join_52;
    }
    if (!((life13_37 == null))) {
        break forest_join_54;
    }
    java.lang.String __stackOp13008807_8_0 = life11_15;
    java.lang.String __stackOp13008807_8_1 = __invokedynamic13008807_7(2548, (2770766062950757460L ^ p4));
    __call13008807_10(__invokedynamic13008807_9(__stackOp13008807_8_1, __stackOp13008807_8_0));
    }
    if (!((p5 == null))) {
        break forest_join_87;
    }
    }
    life14_61 = new moom.OH();
    __call13008807_11(life14_61, life13_37);
    __call13008807_12(life13_37);
    life15_75 = new moom.Jk(life14_61, life11_15, p2, p3, __fieldRead13008807_13());
    spill13008807_0 = __call13008807_14(life15_75, life11_15);
    if (!((p5 != null))) {
        forestValue13008807_83_0 = __integerCategory13008807_15(spill13008807_0);
        break forest_join_83;
    }
    if (!(spill13008807_0)) {
        break forest_join_87;
    }
    spill13008807_1 = life15_75;
    if (!((p5 != null))) {
        forestValue13008807_85_0 = spill13008807_1;
        break forest_join_85;
    }
    forestValue13008807_83_0 = __integerCategory13008807_17(__call13008807_16(spill13008807_1, life11_15));
    }
    if (!((forestValue13008807_83_0 != 0))) {
        break forest_join_87;
    }
    forestValue13008807_85_0 = life15_75;
    }
    __call13008807_18(forestValue13008807_85_0, p6);
    }
    continue forest_cycle_4;
    }
    }
    spill13008807_2 = p1;
    if (!((p5 != null))) {
        forestValue13008807_93_0 = spill13008807_2;
        break forest_join_93;
    }
    if (!((spill13008807_2 != null))) {
        break forest_join_114;
    }
    forestValue13008807_93_0 = p1;
    }
    life8_101 = forestValue13008807_93_0;
    life9_104 = (life8_101).length;
    life10_106 = 0;
    forest_cycle_99: while (true) {
    if (!((life10_106 < life9_104))) {
        break forest_join_114;
    }
    life11_113 = (life8_101)[life10_106];
    __call13008807_19(life11_113, p6);
    life10_106 += 1;
    if (!((p5 != null))) {
        break forest_join_121;
    }
    if (!((p5 == null))) {
        continue forest_cycle_99;
    }
    break forest_cycle_99;
    }
    }
    spill13008807_3 = p6;
    if (!((p5 != null))) {
        forestValue13008807_122_0 = spill13008807_3;
        break forest_join_122;
    }
    if (!((__call13008807_20(spill13008807_3) == 0))) {
        break forest_join_121;
    }
    return null;
    }
    forestValue13008807_122_0 = p6;
    }
    return __call13008807_21(forestValue13008807_122_0);
}
public static moom.Jk[][] h100088_8(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13008808_0(p0);
}
public static moom.Jk[][] h100088_9(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13008809_0(p0);
}
public static moom.Jk[][] h100088_10(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13008810_0(p0);
}
public static moom.Jk[][] h100088_11(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13008811_0(p0);
}
private static native long __fieldRead100088_0() throws Throwable;
private static native java.lang.String __invokedynamic100088_2(int a0, long a1) throws Throwable;
private static native java.lang.String[] __call100088_3(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native net.minecraft.entity.Entity[] __call100088_4() throws Throwable;
private static native void __call100088_5(java.lang.String[] a0) throws Throwable;
private static native java.lang.String __invokedynamic100088_6(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic100088_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call100088_9(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic100088_10(int a0, long a1) throws Throwable;
private static native java.io.InputStream __call100088_11(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic100088_12(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic100088_14(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call100088_15(java.lang.String a0) throws Throwable;
private static native void __call100088_16(moom.OH a0, java.io.InputStream a1) throws Throwable;
private static native void __call100088_17(java.io.InputStream a0) throws Throwable;
private static native java.lang.String __fieldRead100088_18() throws Throwable;
private static native boolean __call100088_19(moom.Jk a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100088_20(boolean value) throws Throwable;
private static native boolean __call100088_21(moom.Jk a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100088_22(boolean value) throws Throwable;
private static native void __call100088_23(moom.Jk a0, java.util.ArrayList a1) throws Throwable;
private static native void __call100088_24(moom.Jk a0, java.util.ArrayList a1) throws Throwable;
private static native int __call100088_25(java.util.ArrayList a0) throws Throwable;
private static native moom.Jk[][] __call100088_26(java.util.ArrayList a0) throws Throwable;
private static native java.lang.Exception __call13008800_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call13008801_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call13008802_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call13008803_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call13008804_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call13008805_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.String __invokedynamic13008806_0(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic13008806_2(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call13008806_3(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic13008806_4(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic13008806_6(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call13008806_7(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic13008806_8(int a0, long a1) throws Throwable;
private static native java.io.InputStream __call13008806_9(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic13008806_10(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic13008806_12(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call13008806_13(java.lang.String a0) throws Throwable;
private static native void __call13008806_14(moom.OH a0, java.io.InputStream a1) throws Throwable;
private static native void __call13008806_15(java.io.InputStream a0) throws Throwable;
private static native java.lang.String __fieldRead13008806_16() throws Throwable;
private static native boolean __call13008806_17(moom.Jk a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory13008806_18(boolean value) throws Throwable;
private static native boolean __call13008806_19(moom.Jk a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory13008806_20(boolean value) throws Throwable;
private static native void __call13008806_21(moom.Jk a0, java.util.ArrayList a1) throws Throwable;
private static native void __call13008806_22(moom.Jk a0, java.util.ArrayList a1) throws Throwable;
private static native int __call13008806_23(java.util.ArrayList a0) throws Throwable;
private static native moom.Jk[][] __call13008806_24(java.util.ArrayList a0) throws Throwable;
private static native void __call13008807_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __invokedynamic13008807_1(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic13008807_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call13008807_4(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic13008807_5(int a0, long a1) throws Throwable;
private static native java.io.InputStream __call13008807_6(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic13008807_7(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic13008807_9(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call13008807_10(java.lang.String a0) throws Throwable;
private static native void __call13008807_11(moom.OH a0, java.io.InputStream a1) throws Throwable;
private static native void __call13008807_12(java.io.InputStream a0) throws Throwable;
private static native java.lang.String __fieldRead13008807_13() throws Throwable;
private static native boolean __call13008807_14(moom.Jk a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory13008807_15(boolean value) throws Throwable;
private static native boolean __call13008807_16(moom.Jk a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory13008807_17(boolean value) throws Throwable;
private static native void __call13008807_18(moom.Jk a0, java.util.ArrayList a1) throws Throwable;
private static native void __call13008807_19(moom.Jk a0, java.util.ArrayList a1) throws Throwable;
private static native int __call13008807_20(java.util.ArrayList a0) throws Throwable;
private static native moom.Jk[][] __call13008807_21(java.util.ArrayList a0) throws Throwable;
private static native java.lang.Exception __call13008808_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call13008809_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call13008810_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call13008811_0(java.io.FileNotFoundException a0) throws Throwable;

}

private static native <E extends Throwable> float[][] __sourceHandlerCall_2e25cfacbf39c609de5e(java.util.Properties a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws E;
private static final class __SourceHandler_2e25cfacbf39c609de5e {

public static float[][] f85(java.util.Properties p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws Throwable {
    net.minecraft.item.EnumDyeColor[] lexicalValue85_38_0;
    java.lang.String lexicalValue85_68_0;
    java.lang.String lexicalValue85_68_1;
    java.lang.Object lexicalValue85_89_0;
    int lexicalValue85_101_0;
    int lexicalValue85_182_0;
    net.minecraft.entity.Entity[] spill85_0;
    net.minecraft.item.EnumDyeColor[] spill85_1;
    java.lang.String spill85_2;
    java.lang.String spill85_3;
    boolean spill85_4;
    java.lang.String spill85_5;
    int spill85_6;
    float[] spill85_7;
    float[] spill85_8;
    float[] spill85_9;
    java.lang.String spill85_10;
    java.lang.String spill85_11;
    java.lang.String spill85_12;
    java.lang.String spill85_13;
    long life4_3;
    net.minecraft.item.EnumDyeColor[] life7_6;
    java.util.HashMap life8_10;
    net.minecraft.item.EnumDyeColor[] life9_12;
    net.minecraft.entity.Entity[] life6_13;
    int life10_16;
    int life11_18;
    net.minecraft.item.EnumDyeColor life12_27;
    float[][] life9_40;
    int life10_42;
    java.util.Iterator life11_46;
    java.lang.String life12_53;
    java.lang.String life13_57;
    java.lang.String life14_78;
    net.minecraft.item.EnumDyeColor life15_102;
    int life16_105;
    float[] life17_171;
    lexical_join_185: {
    lexical_join_182: {
    lexical_join_181: {
    lexical_join_38: {
    lexical_join_37: {
    life4_3 = (__fieldRead85_0() ^ 139653391049749L);
    spill85_0 = __call85_1();
    life7_6 = __call85_2();
    life8_10 = new java.util.HashMap();
    life9_12 = life7_6;
    life6_13 = spill85_0;
    life10_16 = (life9_12).length;
    life11_18 = 0;
    lexical_cycle_19: while (true) {
    if (!((life11_18 < life10_16))) {
        break lexical_join_37;
    }
    spill85_1 = life9_12;
    if (!((life6_13 != null))) {
        lexicalValue85_38_0 = spill85_1;
        break lexical_join_38;
    }
    life12_27 = (spill85_1)[life11_18];
    __call85_4(life8_10, __call85_3(life12_27), life12_27);
    life11_18 += 1;
    if (!((life6_13 == null))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    lexicalValue85_38_0 = life7_6;
    }
    life9_40 = new float[(lexicalValue85_38_0).length][];
    life10_42 = 0;
    life11_46 = __call85_6(__call85_5(p0));
    lexical_cycle_47: while (true) {
    lexical_join_179: {
    lexical_join_162: {
    lexical_join_101: {
    lexical_join_89: {
    lexical_join_86: {
    lexical_join_68: {
    if (!(__call85_7(life11_46))) {
        break lexical_join_181;
    }
    life12_53 = __cast85_9(__call85_8(life11_46));
    life13_57 = __call85_10(p0, life12_53);
    spill85_2 = life12_53;
    spill85_3 = p2;
    if (!((life6_13 != null))) {
        lexicalValue85_68_0 = spill85_2;
        lexicalValue85_68_1 = spill85_3;
        break lexical_join_68;
    }
    spill85_4 = __call85_11(spill85_2, spill85_3);
    if (!((life6_13 != null))) {
        lexicalValue85_182_0 = __integerCategory85_12(spill85_4);
        break lexical_join_182;
    }
    if (!(spill85_4)) {
        break lexical_join_179;
    }
    lexicalValue85_68_0 = life12_53;
    lexicalValue85_68_1 = p2;
    }
    life14_78 = __call85_13(lexicalValue85_68_0, lexicalValue85_68_1);
    spill85_5 = life14_78;
    if (!((life6_13 != null))) {
        lexicalValue85_89_0 = spill85_5;
        break lexical_join_89;
    }
    if (!(__call85_15(spill85_5, __invokedynamic85_14(1219, (3195860779447508327L ^ life4_3))))) {
        break lexical_join_86;
    }
    life14_78 = __invokedynamic85_16(28578, (3787349337673479762L ^ life4_3));
    }
    lexicalValue85_89_0 = __call85_17(life8_10, life14_78);
    }
    life15_102 = __cast85_18(lexicalValue85_89_0);
    life16_105 = __call85_19(life13_57);
    if (!((life15_102 != null))) {
        break lexical_join_162;
    }
    spill85_6 = life16_105;
    if (!((life6_13 != null))) {
        lexicalValue85_101_0 = spill85_6;
        break lexical_join_101;
    }
    if (!((spill85_6 >= 0))) {
        break lexical_join_162;
    }
    lexicalValue85_101_0 = 3;
    }
    float[] __stackOp85_20_0 = new float[lexicalValue85_101_0];
    spill85_7 = __stackOp85_20_0;
    (__stackOp85_20_0)[0] = (((float) ((life16_105 >> __invokedynamic85_21(28699, (2595867004017599193L ^ life4_3))) & __invokedynamic85_22(9112, (7192379139691655506L ^ life4_3)))) / 0x1.fep7f);
    float[] __stackOp85_23_0 = spill85_7;
    spill85_8 = __stackOp85_23_0;
    (__stackOp85_23_0)[1] = (((float) ((life16_105 >> __invokedynamic85_24(1157, (2143188610214598208L ^ life4_3))) & __invokedynamic85_25(9112, (7192379139691655506L ^ life4_3)))) / 0x1.fep7f);
    float[] __stackOp85_26_0 = spill85_8;
    spill85_9 = __stackOp85_26_0;
    (__stackOp85_26_0)[2] = (((float) (life16_105 & __invokedynamic85_27(9112, (7192379139691655506L ^ life4_3)))) / 0x1.fep7f);
    life17_171 = spill85_9;
    (life9_40)[__call85_28(life15_102)] = life17_171;
    life10_42 += 1;
    if (!((life6_13 == null))) {
        break lexical_join_179;
    }
    }
    java.lang.String __stackOp85_30_0 = life12_53;
    java.lang.String __stackOp85_30_1 = life13_57;
    java.lang.String __stackOp85_30_2 = __invokedynamic85_29(15051, (3748092734644118323L ^ life4_3));
    spill85_10 = __stackOp85_30_2;
    spill85_11 = __stackOp85_30_0;
    spill85_12 = __stackOp85_30_1;
    __discardScalar85_31(__stackOp85_30_2);
    java.lang.String __stackOp85_33_0 = spill85_12;
    java.lang.String __stackOp85_33_1 = __invokedynamic85_32(28502, (7830434370557458130L ^ life4_3));
    __call85_35(__invokedynamic85_34(spill85_10, spill85_11, __stackOp85_33_1, __stackOp85_33_0));
    }
    if (!((life6_13 == null))) { continue lexical_cycle_47; }
    break lexical_cycle_47;
    }
    }
    lexicalValue85_182_0 = life10_42;
    }
    if (!((lexicalValue85_182_0 <= 0))) {
        break lexical_join_185;
    }
    return null;
    }
    spill85_13 = p3;
    int __stackOp85_37_0 = life10_42;
    java.lang.String __stackOp85_37_1 = __invokedynamic85_36(18284, (4385787818279116462L ^ life4_3));
    __call85_39(__invokedynamic85_38(spill85_13, __stackOp85_37_1, __stackOp85_37_0));
    return life9_40;
}
public static void h85_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008500_0(p0);
}
public static void h85_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008501_0(p0);
}
public static void h85_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008502_0(p0);
}
public static void h85_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008503_0(p0);
}
public static void h85_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008504_0(p0);
}
public static void h85_5(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008505_0(p0);
}
public static void h85_6(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008506_0(p0);
}
public static void h85_7(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008507_0(p0);
}
private static native long __fieldRead85_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call85_1() throws Throwable;
private static native net.minecraft.item.EnumDyeColor[] __call85_2() throws Throwable;
private static native java.lang.String __call85_3(net.minecraft.item.EnumDyeColor a0) throws Throwable;
private static native java.lang.Object __call85_4(java.util.HashMap a0, java.lang.String a1, net.minecraft.item.EnumDyeColor a2) throws Throwable;
private static native java.util.Set __call85_5(java.util.Properties a0) throws Throwable;
private static native java.util.Iterator __call85_6(java.util.Set a0) throws Throwable;
private static native boolean __call85_7(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call85_8(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast85_9(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call85_10(java.util.Properties a0, java.lang.String a1) throws Throwable;
private static native boolean __call85_11(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory85_12(boolean value) throws Throwable;
private static native java.lang.String __call85_13(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic85_14(int a0, long a1) throws Throwable;
private static native boolean __call85_15(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic85_16(int a0, long a1) throws Throwable;
private static native java.lang.Object __call85_17(java.util.HashMap a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.EnumDyeColor __cast85_18(java.lang.Object a0) throws Throwable;
private static native int __call85_19(java.lang.String a0) throws Throwable;
private static native int __invokedynamic85_21(int a0, long a1) throws Throwable;
private static native int __invokedynamic85_22(int a0, long a1) throws Throwable;
private static native int __invokedynamic85_24(int a0, long a1) throws Throwable;
private static native int __invokedynamic85_25(int a0, long a1) throws Throwable;
private static native int __invokedynamic85_27(int a0, long a1) throws Throwable;
private static native int __call85_28(net.minecraft.item.EnumDyeColor a0) throws Throwable;
private static native java.lang.String __invokedynamic85_29(int a0, long a1) throws Throwable;
private static native void __discardScalar85_31(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic85_32(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic85_34(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native void __call85_35(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic85_36(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic85_38(java.lang.String a0, java.lang.String a1, int a2) throws Throwable;
private static native void __call85_39(java.lang.String a0) throws Throwable;
private static native java.lang.Exception __call1008500_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008501_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008502_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008503_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008504_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008505_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008506_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008507_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int[] __sourceHandlerCall_94874346f3189f1d97af() throws E;
private static final class __SourceHandler_94874346f3189f1d97af {

public static int[] f744() throws Throwable {
    net.minecraft.entity.Entity[] spill744_0;
    long life0_3;
    moom.fm[] life3_6;
    net.minecraft.entity.Entity[] life2_7;
    int[] life4_11;
    int life5_16;
    moom.fm life6_28;
    lexical_join_41: {
    life0_3 = (__fieldRead744_0() ^ 9756284754609L);
    spill744_0 = __call744_1();
    life3_6 = __fieldRead744_2();
    life2_7 = spill744_0;
    life4_11 = new int[(life3_6).length];
    __call744_3(life4_11, -1);
    life5_16 = 0;
    lexical_cycle_17: while (true) {
    lexical_join_39: {
    lexical_join_38: {
    if (!((life5_16 < (life3_6).length))) {
        break lexical_join_41;
    }
    if (!((life5_16 < (life4_11).length))) {
        break lexical_join_41;
    }
    life6_28 = (life3_6)[life5_16];
    if (!((life2_7 != null))) {
        break lexical_join_39;
    }
    if (!((life6_28 != null))) {
        break lexical_join_38;
    }
    (life4_11)[life5_16] = __fieldRead744_4(life6_28);
    }
    life5_16 += 1;
    }
    if (!((life2_7 == null))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    return life4_11;
}
public static void h744_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1074400_0(p0);
}
public static void h744_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1074401_0(p0);
}
private static native long __fieldRead744_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call744_1() throws Throwable;
private static native moom.fm[] __fieldRead744_2() throws Throwable;
private static native void __call744_3(int[] a0, int a1) throws Throwable;
private static native int __fieldRead744_4(moom.fm a0) throws Throwable;
private static native java.lang.Exception __call1074400_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1074401_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> moom.Jk[] __sourceHandlerCall_2647e4669ba843a85126(java.util.Properties a0, java.lang.String a1) throws E;
private static final class __SourceHandler_2647e4669ba843a85126 {

public static moom.Jk[] f86(java.util.Properties p0, java.lang.String p1) throws Throwable {
    java.lang.Object lexicalValue86_45_0;
    moom.J_[] lexicalValue86_150_0;
    moom.J_[] lexicalValue86_155_0;
    java.util.ArrayList lexicalValue86_202_0;
    net.minecraft.entity.Entity[] spill86_0;
    java.lang.String spill86_1;
    java.lang.String spill86_2;
    java.lang.String spill86_3;
    java.lang.String spill86_4;
    moom.J_[] spill86_5;
    java.util.ArrayList spill86_6;
    long life2_3;
    java.util.ArrayList life5_7;
    java.lang.String life6_14;
    java.util.HashMap life7_18;
    net.minecraft.entity.Entity[] life4_19;
    java.util.Iterator life8_23;
    java.lang.String life9_30;
    java.lang.String life10_34;
    java.lang.String[] life8_60;
    java.lang.String[] life9_62;
    int life10_65;
    int life11_67;
    java.lang.String life12_74;
    java.lang.String life13_78;
    java.lang.String life14_100;
    java.lang.String life15_103;
    java.lang.String life14_107;
    moom.Jk life16_120;
    moom.J3 life17_155;
    moom.J_[] life18_159;
    moom.J_[] life19_179;
    int life20_182;
    int life21_184;
    moom.J_ life22_191;
    lexical_join_202: {
    lexical_join_201: {
    lexical_join_194: {
    lexical_join_48: {
    life2_3 = (__fieldRead86_0() ^ 80845886423305L);
    life5_7 = new java.util.ArrayList();
    spill86_0 = __call86_1();
    life6_14 = __invokedynamic86_2(30963, (8905273511605191783L ^ life2_3));
    life7_18 = new java.util.HashMap();
    life4_19 = spill86_0;
    life8_23 = __call86_4(__call86_3(p0));
    lexical_cycle_24: while (true) {
    lexical_join_46: {
    lexical_join_45: {
    if (!(__call86_5(life8_23))) {
        break lexical_join_48;
    }
    life9_30 = __cast86_7(__call86_6(life8_23));
    life10_34 = __call86_8(p0, life9_30);
    spill86_1 = life9_30;
    if (!((life4_19 != null))) {
        lexicalValue86_45_0 = spill86_1;
        break lexical_join_45;
    }
    if (!(__call86_9(spill86_1, life6_14))) {
        break lexical_join_46;
    }
    lexicalValue86_45_0 = __call86_10(life7_18, life9_30, life10_34);
    }
    __discardScalar86_11(lexicalValue86_45_0);
    }
    if (!((life4_19 == null))) { continue lexical_cycle_24; }
    break lexical_cycle_24;
    }
    }
    life8_60 = __cast86_14(__call86_13(__call86_12(life7_18), new java.lang.String[0]));
    life9_62 = life8_60;
    life10_65 = (life9_62).length;
    life11_67 = 0;
    lexical_cycle_62: while (true) {
    lexical_join_191: {
    lexical_join_182: {
    lexical_join_180: {
    lexical_join_176: {
    lexical_join_155: {
    lexical_join_150: {
    lexical_join_132: {
    lexical_join_130: {
    if (!((life11_67 < life10_65))) {
        break lexical_join_194;
    }
    life12_74 = (life9_62)[life11_67];
    life13_78 = __call86_15(p0, life12_74);
    java.lang.String __stackOp86_17_0 = life12_74;
    java.lang.String __stackOp86_17_1 = life13_78;
    java.lang.String __stackOp86_17_2 = __invokedynamic86_16(9906, (2899724870412671683L ^ life2_3));
    spill86_2 = __stackOp86_17_2;
    spill86_3 = __stackOp86_17_0;
    spill86_4 = __stackOp86_17_1;
    __discardScalar86_18(__stackOp86_17_2);
    java.lang.String __stackOp86_20_0 = spill86_4;
    java.lang.String __stackOp86_20_1 = __invokedynamic86_19(28502, (7830488812764681166L ^ life2_3));
    __call86_22(__invokedynamic86_21(spill86_2, spill86_3, __stackOp86_20_1, __stackOp86_20_0));
    life14_100 = __call86_24(life12_74, __call86_23(life6_14));
    life15_103 = __call86_25(p1);
    life14_107 = __call86_26(life14_100, life15_103);
    life16_120 = __call86_29(life14_107, __invokedynamic86_27(29489, (444748833152926948L ^ life2_3)), __invokedynamic86_28(17867, (4088188056445202968L ^ life2_3)));
    if (!((life4_19 != null))) {
        break lexical_join_201;
    }
    if (!((life4_19 != null))) {
        break lexical_join_130;
    }
    if (!((life16_120 == null))) {
        break lexical_join_132;
    }
    java.lang.String __stackOp86_31_0 = life14_107;
    java.lang.String __stackOp86_31_1 = __invokedynamic86_30(27731, (6582910045106950190L ^ life2_3));
    __call86_33(__invokedynamic86_32(__stackOp86_31_1, __stackOp86_31_0));
    }
    if (!((life4_19 == null))) {
        break lexical_join_191;
    }
    }
    life17_155 = new moom.J3(__invokedynamic86_34(14229, (3399594780831320913L ^ life2_3)));
    life18_159 = __call86_35(life17_155, life13_78);
    spill86_5 = life18_159;
    if (!((life4_19 != null))) {
        lexicalValue86_150_0 = spill86_5;
        break lexical_join_150;
    }
    if (!((spill86_5 != null))) {
        break lexical_join_182;
    }
    lexicalValue86_150_0 = life18_159;
    }
    if (!((life4_19 != null))) {
        lexicalValue86_155_0 = lexicalValue86_150_0;
        break lexical_join_155;
    }
    if (!(((lexicalValue86_150_0).length > 0))) {
        break lexical_join_182;
    }
    lexicalValue86_155_0 = life18_159;
    }
    life19_179 = lexicalValue86_155_0;
    life20_182 = (life19_179).length;
    life21_184 = 0;
    lexical_cycle_161: while (true) {
    if (!((life21_184 < life20_182))) {
        break lexical_join_176;
    }
    life22_191 = (life19_179)[life21_184];
    __call86_36(life16_120, life22_191);
    life21_184 += 1;
    if (!((life4_19 != null))) {
        break lexical_join_180;
    }
    if (!((life4_19 == null))) { continue lexical_cycle_161; }
    break lexical_cycle_161;
    }
    }
    __call86_37(life5_7, life16_120);
    }
    if (!((life4_19 == null))) {
        break lexical_join_191;
    }
    }
    java.lang.String __stackOp86_39_0 = life13_78;
    java.lang.String __stackOp86_39_1 = __invokedynamic86_38(7508, (3907349427339829551L ^ life2_3));
    __call86_41(__invokedynamic86_40(__stackOp86_39_1, __stackOp86_39_0));
    }
    life11_67 += 1;
    if (!((life4_19 == null))) { continue lexical_cycle_62; }
    break lexical_cycle_62;
    }
    }
    spill86_6 = life5_7;
    if (!((life4_19 != null))) {
        lexicalValue86_202_0 = spill86_6;
        break lexical_join_202;
    }
    if (!((__call86_42(spill86_6) == 0))) {
        break lexical_join_201;
    }
    return null;
    }
    lexicalValue86_202_0 = life5_7;
    }
    return __cast86_44(__call86_43(lexicalValue86_202_0, new moom.Jk[0]));
}
public static void h86_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008600_0(p0);
}
public static void h86_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008601_0(p0);
}
public static void h86_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008602_0(p0);
}
public static void h86_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008603_0(p0);
}
public static void h86_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008604_0(p0);
}
public static void h86_5(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008605_0(p0);
}
public static void h86_6(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008606_0(p0);
}
public static void h86_7(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008607_0(p0);
}
public static void h86_8(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008608_0(p0);
}
public static void h86_9(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008609_0(p0);
}
public static void h86_10(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008610_0(p0);
}
public static void h86_11(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008611_0(p0);
}
private static native long __fieldRead86_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call86_1() throws Throwable;
private static native java.lang.String __invokedynamic86_2(int a0, long a1) throws Throwable;
private static native java.util.Set __call86_3(java.util.Properties a0) throws Throwable;
private static native java.util.Iterator __call86_4(java.util.Set a0) throws Throwable;
private static native boolean __call86_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call86_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast86_7(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call86_8(java.util.Properties a0, java.lang.String a1) throws Throwable;
private static native boolean __call86_9(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call86_10(java.util.HashMap a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __discardScalar86_11(java.lang.Object a0) throws Throwable;
private static native java.util.Set __call86_12(java.util.HashMap a0) throws Throwable;
private static native java.lang.Object[] __call86_13(java.util.Set a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.String[] __cast86_14(java.lang.Object[] a0) throws Throwable;
private static native java.lang.String __call86_15(java.util.Properties a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic86_16(int a0, long a1) throws Throwable;
private static native void __discardScalar86_18(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic86_19(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic86_21(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native void __call86_22(java.lang.String a0) throws Throwable;
private static native int __call86_23(java.lang.String a0) throws Throwable;
private static native java.lang.String __call86_24(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.String __call86_25(java.lang.String a0) throws Throwable;
private static native java.lang.String __call86_26(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic86_27(int a0, long a1) throws Throwable;
private static native int __invokedynamic86_28(int a0, long a1) throws Throwable;
private static native moom.Jk __call86_29(java.lang.String a0, int a1, int a2) throws Throwable;
private static native java.lang.String __invokedynamic86_30(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic86_32(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call86_33(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic86_34(int a0, long a1) throws Throwable;
private static native moom.J_[] __call86_35(moom.J3 a0, java.lang.String a1) throws Throwable;
private static native void __call86_36(moom.Jk a0, moom.J_ a1) throws Throwable;
private static native boolean __call86_37(java.util.ArrayList a0, moom.Jk a1) throws Throwable;
private static native java.lang.String __invokedynamic86_38(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic86_40(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call86_41(java.lang.String a0) throws Throwable;
private static native int __call86_42(java.util.ArrayList a0) throws Throwable;
private static native java.lang.Object[] __call86_43(java.util.ArrayList a0, moom.Jk[] a1) throws Throwable;
private static native moom.Jk[] __cast86_44(java.lang.Object[] a0) throws Throwable;
private static native java.lang.Exception __call1008600_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008601_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008602_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008603_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008604_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008605_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008606_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008607_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008608_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008609_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008610_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008611_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> moom.DR __sourceHandlerCall_948e03de1526ca427182(java.util.Properties a0, java.lang.String a1) throws E;
private static final class __SourceHandler_948e03de1526ca427182 {

public static moom.DR f746(java.util.Properties p0, java.lang.String p1) throws Throwable {
    int forwardValue746_29_0;
    net.minecraft.entity.Entity[] spill746_0;
    int spill746_1;
    long life2_3;
    int life5_8;
    net.minecraft.entity.Entity[] life4_9;
    int life6_34;
    int life7_48;
    int life8_56;
    float life9_61;
    float life10_66;
    float life11_71;
    forward_join_29: {
    forward_join_16: {
    life2_3 = (__fieldRead746_0() ^ 95506498444007L);
    spill746_0 = __call746_1();
    life5_8 = __call746_2(p0, p1);
    life4_9 = spill746_0;
    spill746_1 = life5_8;
    if (!((life4_9 != null))) {
        forwardValue746_29_0 = spill746_1;
        break forward_join_29;
    }
    if (!((spill746_1 < 0))) {
        break forward_join_16;
    }
    return null;
    }
    forwardValue746_29_0 = ((life5_8 >> __invokedynamic746_3(28699, (2595892622422334507L ^ life2_3))) & __invokedynamic746_4(9112, (7192353501960867744L ^ life2_3)));
    }
    life6_34 = forwardValue746_29_0;
    life7_48 = ((life5_8 >> __invokedynamic746_5(1157, (2143163051940718770L ^ life2_3))) & __invokedynamic746_6(9112, (7192353501960867744L ^ life2_3)));
    life8_56 = (life5_8 & __invokedynamic746_7(9112, (7192353501960867744L ^ life2_3)));
    life9_61 = (((float) life6_34) / 0x1.fep7f);
    life10_66 = (((float) life7_48) / 0x1.fep7f);
    life11_71 = (((float) life8_56) / 0x1.fep7f);
    return new moom.DR(((double) life9_61), ((double) life10_66), ((double) life11_71));
}
public static void h746_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1074600_0(p0);
}
public static void h746_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1074601_0(p0);
}
private static native long __fieldRead746_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call746_1() throws Throwable;
private static native int __call746_2(java.util.Properties a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic746_3(int a0, long a1) throws Throwable;
private static native int __invokedynamic746_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic746_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic746_6(int a0, long a1) throws Throwable;
private static native int __invokedynamic746_7(int a0, long a1) throws Throwable;
private static native java.lang.Exception __call1074600_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1074601_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.world.biome.BiomeGenBase __sourceHandlerCall_ff70a1f54ff8ee6436e7(net.minecraft.world.IBlockAccess a0, moom.DT a1) throws E;
private static final class __SourceHandler_ff70a1f54ff8ee6436e7 {

public static net.minecraft.world.biome.BiomeGenBase f747(net.minecraft.world.IBlockAccess p0, moom.DT p1) throws Throwable {
    net.minecraft.world.biome.BiomeGenBase forwardValue747_20_0;
    net.minecraft.entity.Entity[] spill747_0;
    net.minecraft.world.biome.BiomeGenBase spill747_1;
    long life2_3;
    net.minecraft.world.biome.BiomeGenBase life5_8;
    net.minecraft.entity.Entity[] life4_9;
    forward_join_20: {
    forward_join_19: {
    life2_3 = (__fieldRead747_0() ^ 7613511963018L);
    spill747_0 = __call747_1();
    life5_8 = __call747_2(p0, p1);
    life4_9 = spill747_0;
    spill747_1 = life5_8;
    if (!((life4_9 != null))) {
        forwardValue747_20_0 = spill747_1;
        break forward_join_20;
    }
    if (!((spill747_1 == __fieldRead747_3()))) {
        break forward_join_19;
    }
    if (!((!__call747_4()))) {
        break forward_join_19;
    }
    life5_8 = __fieldRead747_5();
    }
    forwardValue747_20_0 = life5_8;
    }
    return forwardValue747_20_0;
}
public static void h747_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1074700_0(p0);
}
public static void h747_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1074701_0(p0);
}
private static native long __fieldRead747_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call747_1() throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __call747_2(net.minecraft.world.IBlockAccess a0, moom.DT a1) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __fieldRead747_3() throws Throwable;
private static native boolean __call747_4() throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __fieldRead747_5() throws Throwable;
private static native java.lang.Exception __call1074700_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1074701_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_3110e256191912032428(float a0) throws E;
private static final class __SourceHandler_3110e256191912032428 {

public static int f1312(float p0) throws Throwable {
    long life1_3;
    int life3_25;
    life1_3 = (__fieldRead1312_0() ^ 56711108421978L);
    if ((__fieldRead1312_1() == null)) {
        return -1;
    }
    life3_25 = ((int) __call1312_5((((double) ((__call1312_2(p0) + 0x1.0p0f) * ((float) (__call1312_4(__fieldRead1312_3()) - 1)))) / 0x1.0p1d)));
    return __call1312_7(__fieldRead1312_6(), life3_25);
}
public static void h1312_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1131200_0(p0);
}
private static native long __fieldRead1312_0() throws Throwable;
private static native moom.Jk __fieldRead1312_1() throws Throwable;
private static native float __call1312_2(float a0) throws Throwable;
private static native moom.Jk __fieldRead1312_3() throws Throwable;
private static native int __call1312_4(moom.Jk a0) throws Throwable;
private static native long __call1312_5(double a0) throws Throwable;
private static native moom.Jk __fieldRead1312_6() throws Throwable;
private static native int __call1312_7(moom.Jk a0, int a1) throws Throwable;
private static native java.lang.Exception __call1131200_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> moom.Jk __sourceHandlerCall_6695e00778977801f11c(net.minecraft.block.state.IBlockState a0) throws E;
private static final class __SourceHandler_6695e00778977801f11c {

public static moom.Jk f748(net.minecraft.block.state.IBlockState p0) throws Throwable {
    net.minecraft.block.state.IBlockState lexicalValue748_16_0;
    int lexicalValue748_30_0;
    moom.Jk[] lexicalValue748_42_0;
    net.minecraft.block.state.IBlockState spill748_0;
    int spill748_1;
    moom.Jk[] spill748_2;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    moom.fB life4_25;
    int life5_34;
    moom.Jk[] life6_49;
    moom.Jk[] life7_58;
    int life8_61;
    int life9_63;
    moom.Jk life10_70;
    lexical_join_66: {
    lexical_join_42: {
    lexical_join_30: {
    lexical_join_22: {
    lexical_join_20: {
    lexical_join_16: {
    lexical_join_10: {
    life1_3 = (__fieldRead748_0() ^ 42155496644486L);
    life3_5 = __call748_1();
    if (!((__fieldRead748_2() == null))) {
        break lexical_join_10;
    }
    return null;
    }
    spill748_0 = p0;
    if (!((life3_5 != null))) {
        lexicalValue748_16_0 = spill748_0;
        break lexical_join_16;
    }
    if (!((__instanceOf748_3(spill748_0) != 0))) {
        break lexical_join_20;
    }
    lexicalValue748_16_0 = p0;
    }
    life4_25 = __cast748_4(lexicalValue748_16_0);
    if (!((life3_5 == null))) {
        break lexical_join_22;
    }
    }
    return null;
    }
    life5_34 = __call748_5(life4_25);
    spill748_1 = life5_34;
    if (!((life3_5 != null))) {
        lexicalValue748_30_0 = spill748_1;
        break lexical_join_30;
    }
    if (!((spill748_1 >= 0))) {
        break lexical_join_66;
    }
    lexicalValue748_30_0 = life5_34;
    }
    if (!((lexicalValue748_30_0 < (__fieldRead748_6()).length))) {
        break lexical_join_66;
    }
    life6_49 = (__fieldRead748_7())[life5_34];
    spill748_2 = life6_49;
    if (!((life3_5 != null))) {
        lexicalValue748_42_0 = spill748_2;
        break lexical_join_42;
    }
    if (!((spill748_2 != null))) {
        break lexical_join_66;
    }
    lexicalValue748_42_0 = life6_49;
    }
    life7_58 = lexicalValue748_42_0;
    life8_61 = (life7_58).length;
    life9_63 = 0;
    lexical_cycle_48: while (true) {
    lexical_join_64: {
    lexical_join_63: {
    if (!((life9_63 < life8_61))) {
        break lexical_join_66;
    }
    life10_70 = (life7_58)[life9_63];
    if (!((life3_5 != null))) {
        break lexical_join_64;
    }
    if (!(__call748_8(life10_70, life4_25))) {
        break lexical_join_63;
    }
    return life10_70;
    }
    life9_63 += 1;
    }
    if (!((life3_5 == null))) { continue lexical_cycle_48; }
    break lexical_cycle_48;
    }
    }
    return null;
}
public static void h748_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1074800_0(p0);
}
public static void h748_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1074801_0(p0);
}
public static void h748_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1074802_0(p0);
}
public static void h748_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1074803_0(p0);
}
public static void h748_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1074804_0(p0);
}
public static void h748_5(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1074805_0(p0);
}
public static void h748_6(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1074806_0(p0);
}
public static void h748_7(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1074807_0(p0);
}
private static native long __fieldRead748_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call748_1() throws Throwable;
private static native moom.Jk[][] __fieldRead748_2() throws Throwable;
private static native int __instanceOf748_3(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.fB __cast748_4(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __call748_5(moom.fB a0) throws Throwable;
private static native moom.Jk[][] __fieldRead748_6() throws Throwable;
private static native moom.Jk[][] __fieldRead748_7() throws Throwable;
private static native boolean __call748_8(moom.Jk a0, moom.fB a1) throws Throwable;
private static native java.lang.Exception __call1074800_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1074801_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1074802_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1074803_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1074804_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1074805_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1074806_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1074807_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_2c4c61eb565d4739d9f9() throws E;
private static final class __SourceHandler_2c4c61eb565d4739d9f9 {

public static void f87() throws Throwable {
    int forwardValue87_145_0;
    net.minecraft.entity.Entity[] spill87_0;
    java.lang.String[] spill87_1;
    java.lang.String[] spill87_2;
    boolean spill87_3;
    java.lang.String[] spill87_4;
    java.lang.String[] spill87_5;
    java.lang.String[] spill87_6;
    java.lang.String[] spill87_7;
    java.lang.String[] spill87_8;
    java.lang.String[] spill87_9;
    java.lang.String[] spill87_10;
    java.lang.String[] spill87_11;
    java.lang.String[] spill87_12;
    java.lang.String[] spill87_13;
    java.lang.String[] spill87_14;
    java.lang.String[] spill87_15;
    java.lang.String[] spill87_16;
    java.lang.String[] spill87_17;
    java.lang.String[] spill87_18;
    java.lang.String[] spill87_19;
    java.lang.String[] spill87_20;
    java.lang.String[] spill87_21;
    java.lang.String[] spill87_22;
    java.lang.String[] spill87_23;
    java.lang.String[] spill87_24;
    java.lang.String[] spill87_25;
    int spill87_26;
    long spill87_27;
    java.lang.String[] spill87_28;
    java.lang.String[] spill87_29;
    long life0_3;
    net.minecraft.entity.Entity[] life2_23;
    java.lang.String life3_105;
    java.lang.String[] life4_124;
    java.lang.String[] life5_165;
    java.lang.String[] life6_198;
    java.lang.String[] life7_231;
    java.lang.String[] life8_264;
    java.lang.String[] life9_297;
    java.lang.String[] life10_330;
    java.lang.String[] life11_363;
    java.lang.String[] life12_396;
    java.lang.String[] life13_429;
    java.lang.String[] life14_480;
    java.lang.String[] life15_539;
    org.apache.commons.lang3.tuple.Pair life16_551;
    forward_join_596: {
    forward_join_145: {
    life0_3 = (__fieldRead87_0() ^ 83216859522054L);
    __fieldWrite87_2(__invokedynamic87_1(24625, (5311024415798245848L ^ life0_3)));
    __fieldWrite87_3(null);
    spill87_0 = __call87_4();
    __fieldWrite87_5(null);
    __fieldWrite87_6(null);
    __fieldWrite87_7(null);
    __fieldWrite87_8(null);
    __fieldWrite87_9(null);
    life2_23 = spill87_0;
    __fieldWrite87_10(null);
    __fieldWrite87_11(null);
    __fieldWrite87_12(null);
    __fieldWrite87_13(null);
    __fieldWrite87_14(null);
    __fieldWrite87_15(-1);
    __fieldWrite87_16(null);
    __fieldWrite87_17(null);
    __fieldWrite87_18(null);
    __fieldWrite87_19(null);
    __fieldWrite87_20(-1);
    __fieldWrite87_21(-1);
    __fieldWrite87_22(-1);
    __fieldWrite87_23(-1);
    __fieldWrite87_24(-1);
    __fieldWrite87_25(-1);
    __fieldWrite87_26(null);
    __fieldWrite87_27(null);
    __fieldWrite87_28(null);
    __fieldWrite87_29(null);
    __fieldWrite87_30(null);
    __fieldWrite87_31(1);
    __fieldWrite87_32(null);
    __fieldWrite87_33(null);
    __fieldWrite87_34(null);
    __fieldWrite87_35(null);
    __fieldWrite87_36(null);
    __call87_38(__fieldRead87_37());
    __fieldWrite87_39(null);
    __fieldWrite87_45(__call87_44(__invokedynamic87_40(28801, (5649725549571320103L ^ life0_3)), __invokedynamic87_41(5914, (262855192582573763L ^ life0_3)), __fieldRead87_42(), __invokedynamic87_43(24625, (5311024415798245848L ^ life0_3))));
    life3_105 = __invokedynamic87_46(12416, (1257617674647038241L ^ life0_3));
    java.lang.String[] __stackOp87_47_0 = new java.lang.String[2];
    spill87_1 = __stackOp87_47_0;
    (__stackOp87_47_0)[0] = __invokedynamic87_48(31229, (5490607740271566874L ^ life0_3));
    java.lang.String[] __stackOp87_49_0 = spill87_1;
    spill87_2 = __stackOp87_49_0;
    (__stackOp87_49_0)[1] = __invokedynamic87_50(25539, (7147944470219242097L ^ life0_3));
    life4_124 = spill87_2;
    __fieldWrite87_54(__call87_53(life3_105, life4_124, __invokedynamic87_51(17867, (4088190152238126871L ^ life0_3)), __invokedynamic87_52(17867, (4088190152238126871L ^ life0_3))));
    __call87_55();
    spill87_3 = __call87_56();
    if (!((life2_23 != null))) {
        forwardValue87_145_0 = __integerCategory87_57(spill87_3);
        break forward_join_145;
    }
    if (!(spill87_3)) {
        break forward_join_596;
    }
    forwardValue87_145_0 = 2;
    }
    java.lang.String[] __stackOp87_58_0 = new java.lang.String[forwardValue87_145_0];
    spill87_4 = __stackOp87_58_0;
    (__stackOp87_58_0)[0] = __invokedynamic87_59(3386, (3442309448118981828L ^ life0_3));
    java.lang.String[] __stackOp87_60_0 = spill87_4;
    spill87_5 = __stackOp87_60_0;
    (__stackOp87_60_0)[1] = __invokedynamic87_61(2018, (6481265880417099283L ^ life0_3));
    life5_165 = spill87_5;
    __fieldWrite87_65(__call87_64(life3_105, life5_165, __invokedynamic87_62(17867, (4088190152238126871L ^ life0_3)), __invokedynamic87_63(17867, (4088190152238126871L ^ life0_3))));
    java.lang.String[] __stackOp87_66_0 = new java.lang.String[2];
    spill87_6 = __stackOp87_66_0;
    (__stackOp87_66_0)[0] = __invokedynamic87_67(3649, (1086087647584769848L ^ life0_3));
    java.lang.String[] __stackOp87_68_0 = spill87_6;
    spill87_7 = __stackOp87_68_0;
    (__stackOp87_68_0)[1] = __invokedynamic87_69(28778, (2615170343245654300L ^ life0_3));
    life6_198 = spill87_7;
    __fieldWrite87_73(__call87_72(life3_105, life6_198, __invokedynamic87_70(17867, (4088190152238126871L ^ life0_3)), __invokedynamic87_71(17867, (4088190152238126871L ^ life0_3))));
    java.lang.String[] __stackOp87_74_0 = new java.lang.String[2];
    spill87_8 = __stackOp87_74_0;
    (__stackOp87_74_0)[0] = __invokedynamic87_75(3285, (5398153562273305867L ^ life0_3));
    java.lang.String[] __stackOp87_76_0 = spill87_8;
    spill87_9 = __stackOp87_76_0;
    (__stackOp87_76_0)[1] = __invokedynamic87_77(24723, (211992185252264217L ^ life0_3));
    life7_231 = spill87_9;
    __fieldWrite87_81(__call87_80(life3_105, life7_231, __invokedynamic87_78(17867, (4088190152238126871L ^ life0_3)), __invokedynamic87_79(17867, (4088190152238126871L ^ life0_3))));
    java.lang.String[] __stackOp87_82_0 = new java.lang.String[2];
    spill87_10 = __stackOp87_82_0;
    (__stackOp87_82_0)[0] = __invokedynamic87_83(2456, (4719526094295289865L ^ life0_3));
    java.lang.String[] __stackOp87_84_0 = spill87_10;
    spill87_11 = __stackOp87_84_0;
    (__stackOp87_84_0)[1] = __invokedynamic87_85(25652, (6858625101655129488L ^ life0_3));
    life8_264 = spill87_11;
    __fieldWrite87_89(__call87_88(life3_105, life8_264, __invokedynamic87_86(17867, (4088190152238126871L ^ life0_3)), __invokedynamic87_87(17867, (4088190152238126871L ^ life0_3))));
    java.lang.String[] __stackOp87_90_0 = new java.lang.String[2];
    spill87_12 = __stackOp87_90_0;
    (__stackOp87_90_0)[0] = __invokedynamic87_91(20117, (6654062759727437691L ^ life0_3));
    java.lang.String[] __stackOp87_92_0 = spill87_12;
    spill87_13 = __stackOp87_92_0;
    (__stackOp87_92_0)[1] = __invokedynamic87_93(23464, (4783614120505934349L ^ life0_3));
    life9_297 = spill87_13;
    __fieldWrite87_97(__call87_96(life3_105, life9_297, __invokedynamic87_94(17867, (4088190152238126871L ^ life0_3)), __invokedynamic87_95(17867, (4088190152238126871L ^ life0_3))));
    java.lang.String[] __stackOp87_98_0 = new java.lang.String[2];
    spill87_14 = __stackOp87_98_0;
    (__stackOp87_98_0)[0] = __invokedynamic87_99(8186, (4934046380637046385L ^ life0_3));
    java.lang.String[] __stackOp87_100_0 = spill87_14;
    spill87_15 = __stackOp87_100_0;
    (__stackOp87_100_0)[1] = __invokedynamic87_101(21774, (8798960415487397066L ^ life0_3));
    life10_330 = spill87_15;
    __fieldWrite87_105(__call87_104(life3_105, life10_330, __invokedynamic87_102(17867, (4088190152238126871L ^ life0_3)), __invokedynamic87_103(17867, (4088190152238126871L ^ life0_3))));
    java.lang.String[] __stackOp87_106_0 = new java.lang.String[2];
    spill87_16 = __stackOp87_106_0;
    (__stackOp87_106_0)[0] = __invokedynamic87_107(16406, (8858457493442599355L ^ life0_3));
    java.lang.String[] __stackOp87_108_0 = spill87_16;
    spill87_17 = __stackOp87_108_0;
    (__stackOp87_108_0)[1] = __invokedynamic87_109(9149, (468827696914102845L ^ life0_3));
    life11_363 = spill87_17;
    __fieldWrite87_113(__call87_112(life3_105, life11_363, __invokedynamic87_110(17867, (4088190152238126871L ^ life0_3)), __invokedynamic87_111(17867, (4088190152238126871L ^ life0_3))));
    java.lang.String[] __stackOp87_114_0 = new java.lang.String[2];
    spill87_18 = __stackOp87_114_0;
    (__stackOp87_114_0)[0] = __invokedynamic87_115(12823, (2531427733691952052L ^ life0_3));
    java.lang.String[] __stackOp87_116_0 = spill87_18;
    spill87_19 = __stackOp87_116_0;
    (__stackOp87_116_0)[1] = __invokedynamic87_117(11595, (4761016456532227255L ^ life0_3));
    life12_396 = spill87_19;
    __fieldWrite87_121(__call87_120(life3_105, life12_396, __invokedynamic87_118(17867, (4088190152238126871L ^ life0_3)), __invokedynamic87_119(17867, (4088190152238126871L ^ life0_3))));
    java.lang.String[] __stackOp87_122_0 = new java.lang.String[2];
    spill87_20 = __stackOp87_122_0;
    (__stackOp87_122_0)[0] = __invokedynamic87_123(20991, (8175818232407361546L ^ life0_3));
    java.lang.String[] __stackOp87_124_0 = spill87_20;
    spill87_21 = __stackOp87_124_0;
    (__stackOp87_124_0)[1] = __invokedynamic87_125(1630, (5153911489415536636L ^ life0_3));
    life13_429 = spill87_21;
    __fieldWrite87_128(__call87_127(life3_105, life13_429, __invokedynamic87_126(28699, (2595880869121647306L ^ life0_3)), 1));
    __fieldWrite87_132(__call87_131(__invokedynamic87_130(life3_105, __invokedynamic87_129(31078, (6070997494610600178L ^ life0_3))), -1, -1));
    __fieldWrite87_136(__call87_135(__invokedynamic87_134(life3_105, __invokedynamic87_133(3069, (3114090142036709935L ^ life0_3))), -1, -1));
    java.lang.String[] __stackOp87_137_0 = new java.lang.String[2];
    spill87_22 = __stackOp87_137_0;
    (__stackOp87_137_0)[0] = __invokedynamic87_138(27840, (7345089170331514288L ^ life0_3));
    java.lang.String[] __stackOp87_139_0 = spill87_22;
    spill87_23 = __stackOp87_139_0;
    (__stackOp87_139_0)[1] = __invokedynamic87_140(32734, (7556044569475098194L ^ life0_3));
    life14_480 = spill87_23;
    __fieldWrite87_143(__call87_142(life3_105, life14_480, __invokedynamic87_141(1157, (2143174676679693907L ^ life0_3)), 1));
    __fieldWrite87_148(__call87_147(__invokedynamic87_145(life3_105, __invokedynamic87_144(26110, (5421852567923539019L ^ life0_3))), __invokedynamic87_146(1157, (2143174676679693907L ^ life0_3)), 1));
    __fieldWrite87_153(__call87_152(__invokedynamic87_150(life3_105, __invokedynamic87_149(11753, (6237476974980986008L ^ life0_3))), __invokedynamic87_151(1157, (2143174676679693907L ^ life0_3)), 1));
    java.lang.String[] __stackOp87_154_0 = new java.lang.String[2];
    spill87_24 = __stackOp87_154_0;
    (__stackOp87_154_0)[0] = __invokedynamic87_155(15157, (1614262590889484872L ^ life0_3));
    java.lang.String[] __stackOp87_156_0 = spill87_24;
    spill87_25 = __stackOp87_156_0;
    (__stackOp87_156_0)[1] = __invokedynamic87_157(11472, (2155305562327708975L ^ life0_3));
    life15_539 = spill87_25;
    spill87_26 = 19187;
    __fieldWrite87_159(__call87_158(life3_105, life15_539, -1, -1));
    spill87_27 = (3198636611608646419L ^ life0_3);
    life16_551 = __call87_160();
    __fieldWrite87_163(__cast87_162(__call87_161(life16_551)));
    __fieldWrite87_167(__call87_166(__cast87_165(__call87_164(life16_551))));
    __call87_169(__invokedynamic87_168(spill87_26, spill87_27));
    java.lang.String[] __stackOp87_170_0 = new java.lang.String[2];
    spill87_28 = __stackOp87_170_0;
    (__stackOp87_170_0)[0] = __invokedynamic87_172(life3_105, __invokedynamic87_171(9613, (579331607293918306L ^ life0_3)));
    java.lang.String[] __stackOp87_173_0 = spill87_28;
    spill87_29 = __stackOp87_173_0;
    (__stackOp87_173_0)[1] = __invokedynamic87_175(life3_105, __invokedynamic87_174(32722, (8970448267904689771L ^ life0_3)));
    __fieldWrite87_180(__call87_179(spill87_29, __fieldRead87_176(), __invokedynamic87_177(17867, (4088190152238126871L ^ life0_3)), __invokedynamic87_178(17867, (4088190152238126871L ^ life0_3))));
    __call87_181();
    }
    return;
}
public static void h87_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008700_0(p0);
}
private static native long __fieldRead87_0() throws Throwable;
private static native java.lang.String __invokedynamic87_1(int a0, long a1) throws Throwable;
private static native void __fieldWrite87_2(java.lang.String a0) throws Throwable;
private static native void __fieldWrite87_3(java.lang.Object a0) throws Throwable;
private static native net.minecraft.entity.Entity[] __call87_4() throws Throwable;
private static native void __fieldWrite87_5(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite87_6(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite87_7(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite87_8(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite87_9(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite87_10(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite87_11(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite87_12(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite87_13(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite87_14(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite87_15(int a0) throws Throwable;
private static native void __fieldWrite87_16(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite87_17(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite87_18(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite87_19(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite87_20(int a0) throws Throwable;
private static native void __fieldWrite87_21(int a0) throws Throwable;
private static native void __fieldWrite87_22(int a0) throws Throwable;
private static native void __fieldWrite87_23(int a0) throws Throwable;
private static native void __fieldWrite87_24(int a0) throws Throwable;
private static native void __fieldWrite87_25(int a0) throws Throwable;
private static native void __fieldWrite87_26(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite87_27(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite87_28(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite87_29(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite87_30(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite87_31(int a0) throws Throwable;
private static native void __fieldWrite87_32(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite87_33(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite87_34(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite87_35(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite87_36(java.lang.Object a0) throws Throwable;
private static native int[] __fieldRead87_37() throws Throwable;
private static native void __call87_38(int[] a0) throws Throwable;
private static native void __fieldWrite87_39(java.lang.Object a0) throws Throwable;
private static native java.lang.String __invokedynamic87_40(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic87_41(int a0, long a1) throws Throwable;
private static native java.lang.String[] __fieldRead87_42() throws Throwable;
private static native java.lang.String __invokedynamic87_43(int a0, long a1) throws Throwable;
private static native java.lang.String __call87_44(java.lang.String a0, java.lang.String a1, java.lang.String[] a2, java.lang.String a3) throws Throwable;
private static native void __fieldWrite87_45(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic87_46(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic87_48(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic87_50(int a0, long a1) throws Throwable;
private static native int __invokedynamic87_51(int a0, long a1) throws Throwable;
private static native int __invokedynamic87_52(int a0, long a1) throws Throwable;
private static native moom.Jk __call87_53(java.lang.String a0, java.lang.String[] a1, int a2, int a3) throws Throwable;
private static native void __fieldWrite87_54(moom.Jk a0) throws Throwable;
private static native void __call87_55() throws Throwable;
private static native boolean __call87_56() throws Throwable;
private static native int __integerCategory87_57(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic87_59(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic87_61(int a0, long a1) throws Throwable;
private static native int __invokedynamic87_62(int a0, long a1) throws Throwable;
private static native int __invokedynamic87_63(int a0, long a1) throws Throwable;
private static native moom.Jk __call87_64(java.lang.String a0, java.lang.String[] a1, int a2, int a3) throws Throwable;
private static native void __fieldWrite87_65(moom.Jk a0) throws Throwable;
private static native java.lang.String __invokedynamic87_67(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic87_69(int a0, long a1) throws Throwable;
private static native int __invokedynamic87_70(int a0, long a1) throws Throwable;
private static native int __invokedynamic87_71(int a0, long a1) throws Throwable;
private static native moom.Jk __call87_72(java.lang.String a0, java.lang.String[] a1, int a2, int a3) throws Throwable;
private static native void __fieldWrite87_73(moom.Jk a0) throws Throwable;
private static native java.lang.String __invokedynamic87_75(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic87_77(int a0, long a1) throws Throwable;
private static native int __invokedynamic87_78(int a0, long a1) throws Throwable;
private static native int __invokedynamic87_79(int a0, long a1) throws Throwable;
private static native moom.Jk __call87_80(java.lang.String a0, java.lang.String[] a1, int a2, int a3) throws Throwable;
private static native void __fieldWrite87_81(moom.Jk a0) throws Throwable;
private static native java.lang.String __invokedynamic87_83(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic87_85(int a0, long a1) throws Throwable;
private static native int __invokedynamic87_86(int a0, long a1) throws Throwable;
private static native int __invokedynamic87_87(int a0, long a1) throws Throwable;
private static native moom.Jk __call87_88(java.lang.String a0, java.lang.String[] a1, int a2, int a3) throws Throwable;
private static native void __fieldWrite87_89(moom.Jk a0) throws Throwable;
private static native java.lang.String __invokedynamic87_91(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic87_93(int a0, long a1) throws Throwable;
private static native int __invokedynamic87_94(int a0, long a1) throws Throwable;
private static native int __invokedynamic87_95(int a0, long a1) throws Throwable;
private static native moom.Jk __call87_96(java.lang.String a0, java.lang.String[] a1, int a2, int a3) throws Throwable;
private static native void __fieldWrite87_97(moom.Jk a0) throws Throwable;
private static native java.lang.String __invokedynamic87_99(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic87_101(int a0, long a1) throws Throwable;
private static native int __invokedynamic87_102(int a0, long a1) throws Throwable;
private static native int __invokedynamic87_103(int a0, long a1) throws Throwable;
private static native moom.Jk __call87_104(java.lang.String a0, java.lang.String[] a1, int a2, int a3) throws Throwable;
private static native void __fieldWrite87_105(moom.Jk a0) throws Throwable;
private static native java.lang.String __invokedynamic87_107(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic87_109(int a0, long a1) throws Throwable;
private static native int __invokedynamic87_110(int a0, long a1) throws Throwable;
private static native int __invokedynamic87_111(int a0, long a1) throws Throwable;
private static native moom.Jk __call87_112(java.lang.String a0, java.lang.String[] a1, int a2, int a3) throws Throwable;
private static native void __fieldWrite87_113(moom.Jk a0) throws Throwable;
private static native java.lang.String __invokedynamic87_115(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic87_117(int a0, long a1) throws Throwable;
private static native int __invokedynamic87_118(int a0, long a1) throws Throwable;
private static native int __invokedynamic87_119(int a0, long a1) throws Throwable;
private static native moom.Jk __call87_120(java.lang.String a0, java.lang.String[] a1, int a2, int a3) throws Throwable;
private static native void __fieldWrite87_121(moom.Jk a0) throws Throwable;
private static native java.lang.String __invokedynamic87_123(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic87_125(int a0, long a1) throws Throwable;
private static native int __invokedynamic87_126(int a0, long a1) throws Throwable;
private static native moom.Jk __call87_127(java.lang.String a0, java.lang.String[] a1, int a2, int a3) throws Throwable;
private static native void __fieldWrite87_128(moom.Jk a0) throws Throwable;
private static native java.lang.String __invokedynamic87_129(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic87_130(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native moom.Jk __call87_131(java.lang.String a0, int a1, int a2) throws Throwable;
private static native void __fieldWrite87_132(moom.Jk a0) throws Throwable;
private static native java.lang.String __invokedynamic87_133(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic87_134(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native moom.Jk __call87_135(java.lang.String a0, int a1, int a2) throws Throwable;
private static native void __fieldWrite87_136(moom.Jk a0) throws Throwable;
private static native java.lang.String __invokedynamic87_138(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic87_140(int a0, long a1) throws Throwable;
private static native int __invokedynamic87_141(int a0, long a1) throws Throwable;
private static native moom.Jk __call87_142(java.lang.String a0, java.lang.String[] a1, int a2, int a3) throws Throwable;
private static native void __fieldWrite87_143(moom.Jk a0) throws Throwable;
private static native java.lang.String __invokedynamic87_144(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic87_145(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic87_146(int a0, long a1) throws Throwable;
private static native moom.Jk __call87_147(java.lang.String a0, int a1, int a2) throws Throwable;
private static native void __fieldWrite87_148(moom.Jk a0) throws Throwable;
private static native java.lang.String __invokedynamic87_149(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic87_150(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic87_151(int a0, long a1) throws Throwable;
private static native moom.Jk __call87_152(java.lang.String a0, int a1, int a2) throws Throwable;
private static native void __fieldWrite87_153(moom.Jk a0) throws Throwable;
private static native java.lang.String __invokedynamic87_155(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic87_157(int a0, long a1) throws Throwable;
private static native moom.Jk __call87_158(java.lang.String a0, java.lang.String[] a1, int a2, int a3) throws Throwable;
private static native void __fieldWrite87_159(moom.Jk a0) throws Throwable;
private static native org.apache.commons.lang3.tuple.Pair __call87_160() throws Throwable;
private static native java.lang.Object __call87_161(org.apache.commons.lang3.tuple.Pair a0) throws Throwable;
private static native moom.JO[] __cast87_162(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite87_163(moom.JO[] a0) throws Throwable;
private static native java.lang.Object __call87_164(org.apache.commons.lang3.tuple.Pair a0) throws Throwable;
private static native java.lang.Integer __cast87_165(java.lang.Object a0) throws Throwable;
private static native int __call87_166(java.lang.Integer a0) throws Throwable;
private static native void __fieldWrite87_167(int a0) throws Throwable;
private static native java.lang.String __invokedynamic87_168(int a0, long a1) throws Throwable;
private static native void __call87_169(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic87_171(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic87_172(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic87_174(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic87_175(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native moom.Jk[] __fieldRead87_176() throws Throwable;
private static native int __invokedynamic87_177(int a0, long a1) throws Throwable;
private static native int __invokedynamic87_178(int a0, long a1) throws Throwable;
private static native moom.Jk[][] __call87_179(java.lang.String[] a0, moom.Jk[] a1, int a2, int a3) throws Throwable;
private static native void __fieldWrite87_180(moom.Jk[][] a0) throws Throwable;
private static native void __call87_181() throws Throwable;
private static native java.lang.Exception __call1008700_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_de2bf1b107b84f915326(java.lang.String a0) throws E;
private static final class __SourceHandler_de2bf1b107b84f915326 {

public static void f310(java.lang.String p0) throws Throwable {
    moom.OH spill310_0;
    java.lang.String[] spill310_1;
    java.lang.String[] spill310_2;
    int[] spill310_3;
    int[] spill310_4;
    int[] joinValue310_2_0;
    int[] joinValue310_4_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    moom.DD life4_10;
    java.io.InputStream life5_13;
    moom.OH life6_34;
    int[] life7_212;
    life1_3 = (__fieldRead310_0() ^ 97613596191990L);
    life3_5 = __call310_1();
    life4_10 = new moom.DD(p0);
    life5_13 = __call310_2(life4_10);
    if ((life3_5 != null)) {
        if ((life5_13 == null)) {
        return;
    }
        java.lang.String __stackOp310_4_0 = p0;
        java.lang.String __stackOp310_4_1 = __invokedynamic310_3(10668, (9211142016146471102L ^ life1_3));
        __call310_6(__invokedynamic310_5(__stackOp310_4_1, __stackOp310_4_0));
    } else {
        
    }
    life6_34 = new moom.OH();
    __call310_7(life6_34, life5_13);
    __call310_8(life5_13);
    spill310_0 = life6_34;
    java.lang.String[] __stackOp310_9_0 = new java.lang.String[2];
    spill310_1 = __stackOp310_9_0;
    (__stackOp310_9_0)[0] = __invokedynamic310_10(4857, (6263859004823520155L ^ life1_3));
    java.lang.String[] __stackOp310_11_0 = spill310_1;
    spill310_2 = __stackOp310_11_0;
    (__stackOp310_11_0)[1] = __invokedynamic310_12(2147, (7563729597183744256L ^ life1_3));
    __fieldWrite310_14(__call310_13(spill310_0, spill310_2));
    __fieldWrite310_17(__call310_16(life6_34, __invokedynamic310_15(16232, (5721425609608982111L ^ life1_3))));
    __fieldWrite310_20(__call310_19(life6_34, __invokedynamic310_18(2080, (8819135675897141557L ^ life1_3))));
    __fieldWrite310_23(__call310_22(life6_34, __invokedynamic310_21(21839, (3719021256460174353L ^ life1_3))));
    __fieldWrite310_26(__call310_25(life6_34, __invokedynamic310_24(9568, (6673461480106783799L ^ life1_3))));
    __fieldWrite310_29(__call310_28(life6_34, __invokedynamic310_27(7942, (711779017618640446L ^ life1_3))));
    __fieldWrite310_32(__call310_31(life6_34, __invokedynamic310_30(32427, (2918733389867462558L ^ life1_3))));
    __fieldWrite310_35(__call310_34(life6_34, __invokedynamic310_33(7532, (3437370140168932455L ^ life1_3))));
    __fieldWrite310_38(__call310_37(life6_34, __invokedynamic310_36(28564, (3950497204557201062L ^ life1_3))));
    __fieldWrite310_40(__call310_39(life6_34, p0));
    __fieldWrite310_44(__call310_43(life6_34, p0, __invokedynamic310_41(349, (2238980608724357239L ^ life1_3)), __invokedynamic310_42(1823, (3382140297740703292L ^ life1_3))));
    __fieldWrite310_48(__call310_47(life6_34, p0, __invokedynamic310_45(2698, (1244682330127358894L ^ life1_3)), __invokedynamic310_46(15864, (4762910210046946441L ^ life1_3))));
    __fieldWrite310_52(__call310_51(life6_34, p0, __invokedynamic310_49(15556, (5772803955217624457L ^ life1_3)), __invokedynamic310_50(5769, (3908559738269353871L ^ life1_3))));
    __fieldWrite310_56(__call310_55(life6_34, p0, __invokedynamic310_53(28315, (5144879886194687972L ^ life1_3)), __invokedynamic310_54(7449, (8276610082616036425L ^ life1_3))));
    __fieldWrite310_60(__call310_59(life6_34, p0, __invokedynamic310_57(28704, (3486792773834088780L ^ life1_3)), __invokedynamic310_58(10669, (978999167704725727L ^ life1_3))));
    life7_212 = __call310_63(life6_34, p0, __invokedynamic310_61(8303, (8167289758719177015L ^ life1_3)), __invokedynamic310_62(3489, (4168077085219151085L ^ life1_3)));
    spill310_3 = life7_212;
    if ((life3_5 != null)) {
        if ((spill310_3 != null)) {
        spill310_4 = __fieldRead310_64();
        if ((life3_5 != null)) {
        if ((spill310_4 == null)) {
        __fieldWrite310_66(__call310_65());
    } else {
        
    }
        joinValue310_2_0 = life7_212;
    } else {
        joinValue310_2_0 = spill310_4;
    }
        __call310_67(joinValue310_2_0);
    } else {
        
    }
        joinValue310_4_0 = __call310_70(life6_34, p0, __invokedynamic310_68(23725, (7538544810718957047L ^ life1_3)), __invokedynamic310_69(17731, (5044775787930653781L ^ life1_3)));
    } else {
        joinValue310_4_0 = spill310_3;
    }
    __fieldWrite310_71(joinValue310_4_0);
    __fieldWrite310_75(__call310_74(__call310_73(life6_34, __invokedynamic310_72(19657, (3504469165685120500L ^ life1_3))), -1));
    return;
}
public static void h310_0(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3031000_0(p0);
}
public static void h310_1(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3031001_0(p0);
}
public static void h310_2(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3031002_0(p0);
}
public static void h310_3(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3031003_0(p0);
}
public static void h310_4(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3031004_0(p0);
}
public static void h310_5(java.io.FileNotFoundException p0, moom.DD p1) throws Throwable {
    java.io.FileNotFoundException life1_2;
    life1_2 = p0;
    return;
}
public static void h310_6(java.io.IOException p0, moom.DD p1) throws Throwable {
    java.io.IOException life1_2;
    life1_2 = p0;
    __call3031006_0(life1_2);
    return;
}
private static native long __fieldRead310_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call310_1() throws Throwable;
private static native java.io.InputStream __call310_2(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic310_3(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic310_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call310_6(java.lang.String a0) throws Throwable;
private static native void __call310_7(moom.OH a0, java.io.InputStream a1) throws Throwable;
private static native void __call310_8(java.io.InputStream a0) throws Throwable;
private static native java.lang.String __invokedynamic310_10(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic310_12(int a0, long a1) throws Throwable;
private static native int __call310_13(moom.OH a0, java.lang.String[] a1) throws Throwable;
private static native void __fieldWrite310_14(int a0) throws Throwable;
private static native java.lang.String __invokedynamic310_15(int a0, long a1) throws Throwable;
private static native int __call310_16(moom.OH a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite310_17(int a0) throws Throwable;
private static native java.lang.String __invokedynamic310_18(int a0, long a1) throws Throwable;
private static native int __call310_19(moom.OH a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite310_20(int a0) throws Throwable;
private static native java.lang.String __invokedynamic310_21(int a0, long a1) throws Throwable;
private static native int __call310_22(moom.OH a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite310_23(int a0) throws Throwable;
private static native java.lang.String __invokedynamic310_24(int a0, long a1) throws Throwable;
private static native int __call310_25(moom.OH a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite310_26(int a0) throws Throwable;
private static native java.lang.String __invokedynamic310_27(int a0, long a1) throws Throwable;
private static native int __call310_28(moom.OH a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite310_29(int a0) throws Throwable;
private static native java.lang.String __invokedynamic310_30(int a0, long a1) throws Throwable;
private static native moom.DR __call310_31(moom.OH a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite310_32(moom.DR a0) throws Throwable;
private static native java.lang.String __invokedynamic310_33(int a0, long a1) throws Throwable;
private static native moom.DR __call310_34(moom.OH a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite310_35(moom.DR a0) throws Throwable;
private static native java.lang.String __invokedynamic310_36(int a0, long a1) throws Throwable;
private static native moom.DR __call310_37(moom.OH a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite310_38(moom.DR a0) throws Throwable;
private static native moom.Jk[] __call310_39(moom.OH a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite310_40(moom.Jk[] a0) throws Throwable;
private static native java.lang.String __invokedynamic310_41(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic310_42(int a0, long a1) throws Throwable;
private static native int[] __call310_43(moom.OH a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native void __fieldWrite310_44(int[] a0) throws Throwable;
private static native java.lang.String __invokedynamic310_45(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic310_46(int a0, long a1) throws Throwable;
private static native int[] __call310_47(moom.OH a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native void __fieldWrite310_48(int[] a0) throws Throwable;
private static native java.lang.String __invokedynamic310_49(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic310_50(int a0, long a1) throws Throwable;
private static native float[][] __call310_51(moom.OH a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native void __fieldWrite310_52(float[][] a0) throws Throwable;
private static native java.lang.String __invokedynamic310_53(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic310_54(int a0, long a1) throws Throwable;
private static native float[][] __call310_55(moom.OH a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native void __fieldWrite310_56(float[][] a0) throws Throwable;
private static native java.lang.String __invokedynamic310_57(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic310_58(int a0, long a1) throws Throwable;
private static native int[] __call310_59(moom.OH a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native void __fieldWrite310_60(int[] a0) throws Throwable;
private static native java.lang.String __invokedynamic310_61(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic310_62(int a0, long a1) throws Throwable;
private static native int[] __call310_63(moom.OH a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native int[] __fieldRead310_64() throws Throwable;
private static native int[] __call310_65() throws Throwable;
private static native void __fieldWrite310_66(int[] a0) throws Throwable;
private static native void __call310_67(int[] a0) throws Throwable;
private static native java.lang.String __invokedynamic310_68(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic310_69(int a0, long a1) throws Throwable;
private static native int[] __call310_70(moom.OH a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native void __fieldWrite310_71(int[] a0) throws Throwable;
private static native java.lang.String __invokedynamic310_72(int a0, long a1) throws Throwable;
private static native java.lang.String __call310_73(moom.OH a0, java.lang.String a1) throws Throwable;
private static native int __call310_74(java.lang.String a0, int a1) throws Throwable;
private static native void __fieldWrite310_75(int a0) throws Throwable;
private static native java.lang.Exception __call3031000_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3031001_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3031002_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3031003_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3031004_0(java.io.FileNotFoundException a0) throws Throwable;
private static native void __call3031006_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_fc715e57e96577a67949() throws E;
private static final class __SourceHandler_fc715e57e96577a67949 {

public static void f750() throws Throwable {
    moom.Jk forwardValue750_11_0;
    moom.Jk forwardValue750_15_0;
    moom.Jk forwardValue750_19_0;
    int forwardValue750_25_0;
    int forwardValue750_29_0;
    int forwardValue750_31_0;
    moom.Jk spill750_0;
    boolean spill750_1;
    long life0_3;
    net.minecraft.entity.Entity[] life2_5;
    forward_join_31: {
    forward_join_30: {
    forward_join_29: {
    forward_join_25: {
    forward_join_19: {
    forward_join_15: {
    forward_join_11: {
    life0_3 = (__fieldRead750_0() ^ 49940990986351L);
    life2_5 = __call750_1();
    spill750_0 = __fieldRead750_2();
    if (!((life2_5 != null))) {
        forwardValue750_11_0 = spill750_0;
        break forward_join_11;
    }
    if (!((spill750_0 == null))) {
        break forward_join_30;
    }
    forwardValue750_11_0 = __fieldRead750_3();
    }
    if (!((life2_5 != null))) {
        forwardValue750_15_0 = forwardValue750_11_0;
        break forward_join_15;
    }
    if (!((forwardValue750_11_0 == null))) {
        break forward_join_30;
    }
    forwardValue750_15_0 = __fieldRead750_4();
    }
    if (!((life2_5 != null))) {
        forwardValue750_19_0 = forwardValue750_15_0;
        break forward_join_19;
    }
    if (!((forwardValue750_15_0 == null))) {
        break forward_join_30;
    }
    forwardValue750_19_0 = __fieldRead750_5();
    }
    if (!((forwardValue750_19_0 == null))) {
        break forward_join_30;
    }
    spill750_1 = __call750_6();
    if (!((life2_5 != null))) {
        forwardValue750_25_0 = __integerCategory750_7(spill750_1);
        break forward_join_25;
    }
    if (!(spill750_1)) {
        break forward_join_30;
    }
    forwardValue750_25_0 = __integerCategory750_9(__call750_8());
    }
    if (!((life2_5 != null))) {
        forwardValue750_29_0 = forwardValue750_25_0;
        break forward_join_29;
    }
    if (!((forwardValue750_25_0 != 0))) {
        break forward_join_30;
    }
    forwardValue750_29_0 = 1;
    }
    forwardValue750_31_0 = forwardValue750_29_0;
    break forward_join_31;
    }
    forwardValue750_31_0 = 0;
    }
    __fieldWrite750_10(forwardValue750_31_0);
    return;
}
public static void h750_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075000_0(p0);
}
public static void h750_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075001_0(p0);
}
public static void h750_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075002_0(p0);
}
public static void h750_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075003_0(p0);
}
public static void h750_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075004_0(p0);
}
public static void h750_5(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075005_0(p0);
}
private static native long __fieldRead750_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call750_1() throws Throwable;
private static native moom.Jk __fieldRead750_2() throws Throwable;
private static native moom.Jk __fieldRead750_3() throws Throwable;
private static native moom.Jk __fieldRead750_4() throws Throwable;
private static native moom.Jk __fieldRead750_5() throws Throwable;
private static native boolean __call750_6() throws Throwable;
private static native int __integerCategory750_7(boolean value) throws Throwable;
private static native boolean __call750_8() throws Throwable;
private static native int __integerCategory750_9(boolean value) throws Throwable;
private static native void __fieldWrite750_10(int a0) throws Throwable;
private static native java.lang.Exception __call1075000_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075001_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075002_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075003_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075004_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075005_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_da50cbf6e4c6ba019c30(int a0) throws E;
private static final class __SourceHandler_da50cbf6e4c6ba019c30 {

public static int f751(int p0) throws Throwable {
    int forwardValue751_11_0;
    int forwardValue751_13_0;
    int spill751_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_13: {
    forward_join_12: {
    forward_join_11: {
    life1_3 = (__fieldRead751_0() ^ 58784696551621L);
    life3_5 = __call751_1();
    spill751_0 = __fieldRead751_2();
    if (!((life3_5 != null))) {
        forwardValue751_11_0 = spill751_0;
        break forward_join_11;
    }
    if (!((spill751_0 < 0))) {
        break forward_join_12;
    }
    forwardValue751_11_0 = p0;
    }
    forwardValue751_13_0 = forwardValue751_11_0;
    break forward_join_13;
    }
    forwardValue751_13_0 = __fieldRead751_3();
    }
    return forwardValue751_13_0;
}
public static void h751_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075100_0(p0);
}
private static native long __fieldRead751_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call751_1() throws Throwable;
private static native int __fieldRead751_2() throws Throwable;
private static native int __fieldRead751_3() throws Throwable;
private static native java.lang.Exception __call1075100_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_7b2e4793bafe3c683e4a(int a0, int a1) throws E;
private static final class __SourceHandler_7b2e4793bafe3c683e4a {

public static int f752(int p0, int p1) throws Throwable {
    int forwardValue752_29_0;
    int forwardValue752_31_0;
    int forwardValue752_33_0;
    int spill752_0;
    int spill752_1;
    int spill752_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    int life5_34;
    forward_join_33: {
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    forward_join_29: {
    forward_join_10: {
    life2_3 = (__fieldRead752_0() ^ 14396398429295L);
    life4_5 = __call752_1();
    if (!((__fieldRead752_2() == null))) {
        break forward_join_10;
    }
    return p1;
    }
    spill752_0 = p0;
    if (!((life4_5 != null))) {
        forwardValue752_33_0 = spill752_0;
        break forward_join_33;
    }
    if (!((spill752_0 >= 0))) {
        break forward_join_32;
    }
    spill752_1 = p0;
    if (!((life4_5 != null))) {
        forwardValue752_33_0 = spill752_1;
        break forward_join_33;
    }
    if (!((spill752_1 < (__fieldRead752_3()).length))) {
        break forward_join_32;
    }
    life5_34 = (__fieldRead752_4())[p0];
    spill752_2 = life5_34;
    if (!((life4_5 != null))) {
        forwardValue752_29_0 = spill752_2;
        break forward_join_29;
    }
    if (!((spill752_2 < 0))) {
        break forward_join_30;
    }
    forwardValue752_29_0 = p1;
    }
    forwardValue752_31_0 = forwardValue752_29_0;
    break forward_join_31;
    }
    forwardValue752_31_0 = life5_34;
    }
    return forwardValue752_31_0;
    }
    forwardValue752_33_0 = p1;
    }
    return forwardValue752_33_0;
}
public static void h752_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075200_0(p0);
}
public static void h752_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075201_0(p0);
}
public static void h752_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075202_0(p0);
}
public static void h752_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075203_0(p0);
}
public static void h752_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075204_0(p0);
}
private static native long __fieldRead752_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call752_1() throws Throwable;
private static native int[] __fieldRead752_2() throws Throwable;
private static native int[] __fieldRead752_3() throws Throwable;
private static native int[] __fieldRead752_4() throws Throwable;
private static native java.lang.Exception __call1075200_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075201_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075202_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075203_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075204_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_27e4f8fd06696f987f2a(java.lang.String a0) throws E;
private static final class __SourceHandler_27e4f8fd06696f987f2a {

public static int f753(java.lang.String p0) throws Throwable {
    int lexicalValue753_17_0;
    int lexicalValue753_47_0;
    boolean spill753_0;
    boolean spill753_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    net.minecraft.potion.Potion[] life4_22;
    net.minecraft.potion.Potion[] life5_24;
    int life6_27;
    int life7_29;
    net.minecraft.potion.Potion life8_36;
    lexical_join_51: {
    lexical_join_18: {
    lexical_join_17: {
    life1_3 = (__fieldRead753_0() ^ 52756177224929L);
    life3_5 = __call753_1();
    spill753_0 = __call753_3(p0, __invokedynamic753_2(1618, (4497610566961184513L ^ life1_3)));
    if (!((life3_5 != null))) {
        lexicalValue753_17_0 = __integerCategory753_4(spill753_0);
        break lexical_join_17;
    }
    if (!(spill753_0)) {
        break lexical_join_18;
    }
    lexicalValue753_17_0 = 0;
    }
    return lexicalValue753_17_0;
    }
    life4_22 = __fieldRead753_5();
    life5_24 = life4_22;
    life6_27 = (life5_24).length;
    life7_29 = 0;
    lexical_cycle_27: while (true) {
    lexical_join_49: {
    lexical_join_48: {
    lexical_join_47: {
    if (!((life7_29 < life6_27))) {
        break lexical_join_51;
    }
    life8_36 = (life5_24)[life7_29];
    if (!((life3_5 != null))) {
        break lexical_join_49;
    }
    if (!((life8_36 != null))) {
        break lexical_join_48;
    }
    spill753_1 = __call753_7(__call753_6(life8_36), p0);
    if (!((life3_5 != null))) {
        lexicalValue753_47_0 = __integerCategory753_8(spill753_1);
        break lexical_join_47;
    }
    if (!(spill753_1)) {
        break lexical_join_48;
    }
    lexicalValue753_47_0 = __call753_9(life8_36);
    }
    return lexicalValue753_47_0;
    }
    life7_29 += 1;
    }
    if (!((life3_5 == null))) { continue lexical_cycle_27; }
    break lexical_cycle_27;
    }
    }
    return -1;
}
public static void h753_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075300_0(p0);
}
public static void h753_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075301_0(p0);
}
public static void h753_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075302_0(p0);
}
public static void h753_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075303_0(p0);
}
public static void h753_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075304_0(p0);
}
private static native long __fieldRead753_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call753_1() throws Throwable;
private static native java.lang.String __invokedynamic753_2(int a0, long a1) throws Throwable;
private static native boolean __call753_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory753_4(boolean value) throws Throwable;
private static native net.minecraft.potion.Potion[] __fieldRead753_5() throws Throwable;
private static native java.lang.String __call753_6(net.minecraft.potion.Potion a0) throws Throwable;
private static native boolean __call753_7(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory753_8(boolean value) throws Throwable;
private static native int __call753_9(net.minecraft.potion.Potion a0) throws Throwable;
private static native java.lang.Exception __call1075300_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075301_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075302_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075303_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075304_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int[] __sourceHandlerCall_a9021ef89ec9de0e46a9(java.util.Properties a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws E;
private static final class __SourceHandler_a9021ef89ec9de0e46a9 {

public static int[] f88(java.util.Properties p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws Throwable {
    java.lang.String lexicalValue88_43_0;
    java.lang.String lexicalValue88_43_1;
    int lexicalValue88_57_0;
    int lexicalValue88_63_0;
    int lexicalValue88_91_0;
    net.minecraft.entity.Entity[] spill88_0;
    java.lang.String spill88_1;
    java.lang.String spill88_2;
    boolean spill88_3;
    int spill88_4;
    java.lang.String spill88_5;
    java.lang.String spill88_6;
    java.lang.String spill88_7;
    java.lang.String spill88_8;
    long life4_3;
    int[] life7_11;
    net.minecraft.entity.Entity[] life6_12;
    int life8_17;
    java.util.Iterator life9_21;
    java.lang.String life10_28;
    java.lang.String life11_32;
    java.lang.String life12_53;
    int life13_57;
    int life14_60;
    lexical_join_94: {
    lexical_join_91: {
    lexical_join_90: {
    life4_3 = (__fieldRead88_0() ^ 84714544686410L);
    spill88_0 = __call88_1();
    life7_11 = new int[__invokedynamic88_2(28485, (8186658206833867990L ^ life4_3))];
    life6_12 = spill88_0;
    __call88_3(life7_11, -1);
    life8_17 = 0;
    life9_21 = __call88_5(__call88_4(p0));
    lexical_cycle_22: while (true) {
    lexical_join_88: {
    lexical_join_71: {
    lexical_join_63: {
    lexical_join_57: {
    lexical_join_43: {
    if (!(__call88_6(life9_21))) {
        break lexical_join_90;
    }
    life10_28 = __cast88_8(__call88_7(life9_21));
    life11_32 = __call88_9(p0, life10_28);
    spill88_1 = life10_28;
    spill88_2 = p2;
    if (!((life6_12 != null))) {
        lexicalValue88_43_0 = spill88_1;
        lexicalValue88_43_1 = spill88_2;
        break lexical_join_43;
    }
    spill88_3 = __call88_10(spill88_1, spill88_2);
    if (!((life6_12 != null))) {
        lexicalValue88_91_0 = __integerCategory88_11(spill88_3);
        break lexical_join_91;
    }
    if (!(spill88_3)) {
        break lexical_join_88;
    }
    lexicalValue88_43_0 = life10_28;
    lexicalValue88_43_1 = p2;
    }
    life12_53 = __call88_12(lexicalValue88_43_0, lexicalValue88_43_1);
    life13_57 = __call88_13(life12_53, -1);
    life14_60 = __call88_14(life11_32);
    spill88_4 = life13_57;
    if (!((life6_12 != null))) {
        lexicalValue88_57_0 = spill88_4;
        break lexical_join_57;
    }
    if (!((spill88_4 >= 0))) {
        break lexical_join_71;
    }
    lexicalValue88_57_0 = life13_57;
    }
    if (!((life6_12 != null))) {
        lexicalValue88_63_0 = lexicalValue88_57_0;
        break lexical_join_63;
    }
    if (!((lexicalValue88_57_0 < (life7_11).length))) {
        break lexical_join_71;
    }
    lexicalValue88_63_0 = life14_60;
    }
    if (!((lexicalValue88_63_0 >= 0))) {
        break lexical_join_71;
    }
    (life7_11)[life13_57] = life14_60;
    life8_17 += 1;
    if (!((life6_12 == null))) {
        break lexical_join_88;
    }
    }
    java.lang.String __stackOp88_16_0 = life10_28;
    java.lang.String __stackOp88_16_1 = life11_32;
    java.lang.String __stackOp88_16_2 = __invokedynamic88_15(15051, (3748072910980080236L ^ life4_3));
    spill88_5 = __stackOp88_16_2;
    spill88_6 = __stackOp88_16_0;
    spill88_7 = __stackOp88_16_1;
    __discardScalar88_17(__stackOp88_16_2);
    java.lang.String __stackOp88_19_0 = spill88_7;
    java.lang.String __stackOp88_19_1 = __invokedynamic88_18(28502, (7830484993431451533L ^ life4_3));
    __call88_21(__invokedynamic88_20(spill88_5, spill88_6, __stackOp88_19_1, __stackOp88_19_0));
    }
    if (!((life6_12 == null))) { continue lexical_cycle_22; }
    break lexical_cycle_22;
    }
    }
    lexicalValue88_91_0 = life8_17;
    }
    if (!((lexicalValue88_91_0 <= 0))) {
        break lexical_join_94;
    }
    return null;
    }
    spill88_8 = p3;
    int __stackOp88_23_0 = life8_17;
    java.lang.String __stackOp88_23_1 = __invokedynamic88_22(18284, (4385732836013318129L ^ life4_3));
    __call88_25(__invokedynamic88_24(spill88_8, __stackOp88_23_1, __stackOp88_23_0));
    return life7_11;
}
public static void h88_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008800_0(p0);
}
public static void h88_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008801_0(p0);
}
public static void h88_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008802_0(p0);
}
public static void h88_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008803_0(p0);
}
public static void h88_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008804_0(p0);
}
public static void h88_5(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008805_0(p0);
}
public static void h88_6(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008806_0(p0);
}
public static void h88_7(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008807_0(p0);
}
public static void h88_8(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008808_0(p0);
}
private static native long __fieldRead88_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call88_1() throws Throwable;
private static native int __invokedynamic88_2(int a0, long a1) throws Throwable;
private static native void __call88_3(int[] a0, int a1) throws Throwable;
private static native java.util.Set __call88_4(java.util.Properties a0) throws Throwable;
private static native java.util.Iterator __call88_5(java.util.Set a0) throws Throwable;
private static native boolean __call88_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call88_7(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast88_8(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call88_9(java.util.Properties a0, java.lang.String a1) throws Throwable;
private static native boolean __call88_10(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory88_11(boolean value) throws Throwable;
private static native java.lang.String __call88_12(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __call88_13(java.lang.String a0, int a1) throws Throwable;
private static native int __call88_14(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic88_15(int a0, long a1) throws Throwable;
private static native void __discardScalar88_17(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic88_18(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic88_20(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native void __call88_21(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic88_22(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic88_24(java.lang.String a0, java.lang.String a1, int a2) throws Throwable;
private static native void __call88_25(java.lang.String a0) throws Throwable;
private static native java.lang.Exception __call1008800_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008801_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008802_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008803_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008804_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008805_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008806_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008807_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008808_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> moom.DR __sourceHandlerCall_d3ed44e262339207c31d(moom.DR a0) throws E;
private static final class __SourceHandler_d3ed44e262339207c31d {

public static moom.DR f755(moom.DR p0) throws Throwable {
    moom.DR forwardValue755_11_0;
    moom.DR forwardValue755_13_0;
    moom.DR spill755_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_13: {
    forward_join_12: {
    forward_join_11: {
    life1_3 = (__fieldRead755_0() ^ 63302909690678L);
    life3_5 = __call755_1();
    spill755_0 = __fieldRead755_2();
    if (!((life3_5 != null))) {
        forwardValue755_11_0 = spill755_0;
        break forward_join_11;
    }
    if (!((spill755_0 == null))) {
        break forward_join_12;
    }
    forwardValue755_11_0 = p0;
    }
    forwardValue755_13_0 = forwardValue755_11_0;
    break forward_join_13;
    }
    forwardValue755_13_0 = __fieldRead755_3();
    }
    return forwardValue755_13_0;
}
public static void h755_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075500_0(p0);
}
private static native long __fieldRead755_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call755_1() throws Throwable;
private static native moom.DR __fieldRead755_2() throws Throwable;
private static native moom.DR __fieldRead755_3() throws Throwable;
private static native java.lang.Exception __call1075500_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> moom.DR __sourceHandlerCall_3e10bc1e4e19c97acc25(moom.DR a0, net.minecraft.world.IBlockAccess a1, double a2, double a3, double a4) throws E;
private static final class __SourceHandler_3e10bc1e4e19c97acc25 {

public static moom.DR f756(moom.DR p0, net.minecraft.world.IBlockAccess p1, double p2, double p3, double p4) throws Throwable {
    moom.Jk forwardValue756_13_0;
    moom.Jk spill756_0;
    long life8_3;
    net.minecraft.entity.Entity[] life10_5;
    int life11_24;
    int life12_38;
    int life13_52;
    int life14_60;
    float life15_65;
    float life16_70;
    float life17_75;
    float life18_81;
    float life19_87;
    float life20_91;
    float life15_95;
    float life16_99;
    float life17_103;
    forward_join_13: {
    forward_join_12: {
    life8_3 = (__fieldRead756_0() ^ 70661651995668L);
    life10_5 = __call756_1();
    spill756_0 = __fieldRead756_2();
    if (!((life10_5 != null))) {
        forwardValue756_13_0 = spill756_0;
        break forward_join_13;
    }
    if (!((spill756_0 == null))) {
        break forward_join_12;
    }
    return p0;
    }
    forwardValue756_13_0 = __fieldRead756_3();
    }
    life11_24 = __call756_4(forwardValue756_13_0, p1, p2, p3, p4, 3);
    life12_38 = ((life11_24 >> __invokedynamic756_5(28699, (2595867851806546648L ^ life8_3))) & __invokedynamic756_6(9112, (7192329968153086291L ^ life8_3)));
    life13_52 = ((life11_24 >> __invokedynamic756_7(1157, (2143183355798646337L ^ life8_3))) & __invokedynamic756_8(9112, (7192329968153086291L ^ life8_3)));
    life14_60 = (life11_24 & __invokedynamic756_9(9112, (7192329968153086291L ^ life8_3)));
    life15_65 = (((float) life12_38) / 0x1.fep7f);
    life16_70 = (((float) life13_52) / 0x1.fep7f);
    life17_75 = (((float) life14_60) / 0x1.fep7f);
    life18_81 = (((float) __fieldRead756_10(p0)) / 0x1.818938p-1f);
    life19_87 = (((float) __fieldRead756_11(p0)) / 0x1.b1b718p-1f);
    life20_91 = ((float) __fieldRead756_12(p0));
    life15_95 = (life15_65 * life18_81);
    life16_99 = (life16_70 * life19_87);
    life17_103 = (life17_75 * life20_91);
    return __call756_14(__fieldRead756_13(), ((double) life15_95), ((double) life16_99), ((double) life17_103));
}
public static void h756_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075600_0(p0);
}
public static void h756_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075601_0(p0);
}
private static native long __fieldRead756_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call756_1() throws Throwable;
private static native moom.Jk __fieldRead756_2() throws Throwable;
private static native moom.Jk __fieldRead756_3() throws Throwable;
private static native int __call756_4(moom.Jk a0, net.minecraft.world.IBlockAccess a1, double a2, double a3, double a4, int a5) throws Throwable;
private static native int __invokedynamic756_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic756_6(int a0, long a1) throws Throwable;
private static native int __invokedynamic756_7(int a0, long a1) throws Throwable;
private static native int __invokedynamic756_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic756_9(int a0, long a1) throws Throwable;
private static native double __fieldRead756_10(moom.DR a0) throws Throwable;
private static native double __fieldRead756_11(moom.DR a0) throws Throwable;
private static native double __fieldRead756_12(moom.DR a0) throws Throwable;
private static native moom.Jj __fieldRead756_13() throws Throwable;
private static native moom.DR __call756_14(moom.Jj a0, double a1, double a2, double a3) throws Throwable;
private static native java.lang.Exception __call1075600_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075601_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_bfd723966dce5e473f1e(net.minecraft.client.particle.EntityFX a0) throws E;
private static final class __SourceHandler_bfd723966dce5e473f1e {

public static void f757(net.minecraft.client.particle.EntityFX p0) throws Throwable {
    moom.Jk forwardValue757_11_0;
    moom.Jk spill757_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    int life4_15;
    int life5_29;
    int life6_43;
    int life7_51;
    float life8_56;
    float life9_61;
    float life10_66;
    forward_join_69: {
    forward_join_11: {
    life1_3 = (__fieldRead757_0() ^ 75541665600105L);
    life3_5 = __call757_1();
    spill757_0 = __fieldRead757_2();
    if (!((life3_5 != null))) {
        forwardValue757_11_0 = spill757_0;
        break forward_join_11;
    }
    if (!((spill757_0 != null))) {
        break forward_join_69;
    }
    forwardValue757_11_0 = __fieldRead757_3();
    }
    life4_15 = __call757_4(forwardValue757_11_0);
    life5_29 = ((life4_15 >> __invokedynamic757_5(28699, (2595873279965615269L ^ life1_3))) & __invokedynamic757_6(9112, (7192333333939291950L ^ life1_3)));
    life6_43 = ((life4_15 >> __invokedynamic757_7(1157, (2143178065329922108L ^ life1_3))) & __invokedynamic757_8(9112, (7192333333939291950L ^ life1_3)));
    life7_51 = (life4_15 & __invokedynamic757_9(9112, (7192333333939291950L ^ life1_3)));
    life8_56 = (((float) life5_29) / 0x1.fep7f);
    life9_61 = (((float) life6_43) / 0x1.fep7f);
    life10_66 = (((float) life7_51) / 0x1.fep7f);
    __call757_10(p0, life8_56, life9_61, life10_66);
    }
    return;
}
public static void h757_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075700_0(p0);
}
private static native long __fieldRead757_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call757_1() throws Throwable;
private static native moom.Jk __fieldRead757_2() throws Throwable;
private static native moom.Jk __fieldRead757_3() throws Throwable;
private static native int __call757_4(moom.Jk a0) throws Throwable;
private static native int __invokedynamic757_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic757_6(int a0, long a1) throws Throwable;
private static native int __invokedynamic757_7(int a0, long a1) throws Throwable;
private static native int __invokedynamic757_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic757_9(int a0, long a1) throws Throwable;
private static native void __call757_10(net.minecraft.client.particle.EntityFX a0, float a1, float a2, float a3) throws Throwable;
private static native java.lang.Exception __call1075700_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_0a8095522b1654c7e901(int a0) throws E;
private static final class __SourceHandler_0a8095522b1654c7e901 {

public static int f758(int p0) throws Throwable {
    int forwardValue758_11_0;
    int forwardValue758_13_0;
    int spill758_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_13: {
    forward_join_12: {
    forward_join_11: {
    life1_3 = (__fieldRead758_0() ^ 39260680952880L);
    life3_5 = __call758_1();
    spill758_0 = __fieldRead758_2();
    if (!((life3_5 != null))) {
        forwardValue758_11_0 = spill758_0;
        break forward_join_11;
    }
    if (!((spill758_0 < 0))) {
        break forward_join_12;
    }
    forwardValue758_11_0 = p0;
    }
    forwardValue758_13_0 = forwardValue758_11_0;
    break forward_join_13;
    }
    forwardValue758_13_0 = __fieldRead758_3();
    }
    return forwardValue758_13_0;
}
public static void h758_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075800_0(p0);
}
private static native long __fieldRead758_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call758_1() throws Throwable;
private static native int __fieldRead758_2() throws Throwable;
private static native int __fieldRead758_3() throws Throwable;
private static native java.lang.Exception __call1075800_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_29c5702f54c09866bd3a(java.lang.String a0) throws E;
private static final class __SourceHandler_29c5702f54c09866bd3a {

public static int f759(java.lang.String p0) throws Throwable {
    java.lang.String forwardValue759_13_0;
    int forwardValue759_32_0;
    int forwardValue759_45_0;
    int forwardValue759_58_0;
    int forwardValue759_71_0;
    int forwardValue759_84_0;
    int forwardValue759_97_0;
    int forwardValue759_110_0;
    int forwardValue759_123_0;
    int forwardValue759_136_0;
    int forwardValue759_149_0;
    int forwardValue759_162_0;
    int forwardValue759_175_0;
    int forwardValue759_188_0;
    int forwardValue759_201_0;
    int forwardValue759_214_0;
    int forwardValue759_227_0;
    int forwardValue759_240_0;
    int forwardValue759_253_0;
    int forwardValue759_266_0;
    int forwardValue759_279_0;
    int forwardValue759_289_0;
    int forwardValue759_299_0;
    int forwardValue759_332_0;
    int forwardValue759_365_0;
    int forwardValue759_378_0;
    int forwardValue759_391_0;
    int forwardValue759_404_0;
    int forwardValue759_417_0;
    int forwardValue759_430_0;
    int forwardValue759_443_0;
    int forwardValue759_456_0;
    int forwardValue759_469_0;
    int forwardValue759_482_0;
    int forwardValue759_495_0;
    int forwardValue759_502_0;
    int forwardValue759_505_0;
    int forwardValue759_508_0;
    int forwardValue759_511_0;
    java.lang.String spill759_0;
    boolean spill759_1;
    boolean spill759_2;
    boolean spill759_3;
    boolean spill759_4;
    boolean spill759_5;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_511: {
    forward_join_509: {
    forward_join_508: {
    forward_join_506: {
    forward_join_505: {
    forward_join_503: {
    forward_join_502: {
    forward_join_501: {
    forward_join_495: {
    forward_join_488: {
    forward_join_482: {
    forward_join_475: {
    forward_join_469: {
    forward_join_462: {
    forward_join_456: {
    forward_join_449: {
    forward_join_443: {
    forward_join_436: {
    forward_join_430: {
    forward_join_423: {
    forward_join_417: {
    forward_join_410: {
    forward_join_404: {
    forward_join_397: {
    forward_join_391: {
    forward_join_384: {
    forward_join_378: {
    forward_join_371: {
    forward_join_365: {
    forward_join_358: {
    forward_join_332: {
    forward_join_325: {
    forward_join_299: {
    forward_join_289: {
    forward_join_279: {
    forward_join_272: {
    forward_join_266: {
    forward_join_259: {
    forward_join_253: {
    forward_join_246: {
    forward_join_240: {
    forward_join_233: {
    forward_join_227: {
    forward_join_220: {
    forward_join_214: {
    forward_join_207: {
    forward_join_201: {
    forward_join_194: {
    forward_join_188: {
    forward_join_181: {
    forward_join_175: {
    forward_join_168: {
    forward_join_162: {
    forward_join_155: {
    forward_join_149: {
    forward_join_142: {
    forward_join_136: {
    forward_join_129: {
    forward_join_123: {
    forward_join_116: {
    forward_join_110: {
    forward_join_103: {
    forward_join_97: {
    forward_join_90: {
    forward_join_84: {
    forward_join_77: {
    forward_join_71: {
    forward_join_64: {
    forward_join_58: {
    forward_join_51: {
    forward_join_45: {
    forward_join_38: {
    forward_join_32: {
    forward_join_25: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (__fieldRead759_0() ^ 30764919215295L);
    life3_5 = __call759_1();
    spill759_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue759_13_0 = spill759_0;
        break forward_join_13;
    }
    if (!((spill759_0 == null))) {
        break forward_join_12;
    }
    forwardValue759_511_0 = -1;
    break forward_join_511;
    }
    forwardValue759_13_0 = p0;
    }
    spill759_1 = __call759_3(forwardValue759_13_0, __invokedynamic759_2(10867, (7272368797100295026L ^ life1_3)));
    if (!((life3_5 != null))) {
        forwardValue759_32_0 = __integerCategory759_4(spill759_1);
        break forward_join_32;
    }
    if (!(spill759_1)) {
        break forward_join_25;
    }
    forwardValue759_511_0 = __fieldRead759_6(__fieldRead759_5());
    break forward_join_511;
    }
    forwardValue759_32_0 = __integerCategory759_9(__call759_8(p0, __invokedynamic759_7(5182, (3753347986675694973L ^ life1_3))));
    }
    if (!((life3_5 != null))) {
        forwardValue759_45_0 = forwardValue759_32_0;
        break forward_join_45;
    }
    if (!((forwardValue759_32_0 != 0))) {
        break forward_join_38;
    }
    forwardValue759_511_0 = __fieldRead759_11(__fieldRead759_10());
    break forward_join_511;
    }
    forwardValue759_45_0 = __integerCategory759_14(__call759_13(p0, __invokedynamic759_12(2920, (1732112005116289623L ^ life1_3))));
    }
    if (!((life3_5 != null))) {
        forwardValue759_58_0 = forwardValue759_45_0;
        break forward_join_58;
    }
    if (!((forwardValue759_45_0 != 0))) {
        break forward_join_51;
    }
    forwardValue759_511_0 = __fieldRead759_16(__fieldRead759_15());
    break forward_join_511;
    }
    forwardValue759_58_0 = __integerCategory759_19(__call759_18(p0, __invokedynamic759_17(18774, (1840161789238026308L ^ life1_3))));
    }
    if (!((life3_5 != null))) {
        forwardValue759_71_0 = forwardValue759_58_0;
        break forward_join_71;
    }
    if (!((forwardValue759_58_0 != 0))) {
        break forward_join_64;
    }
    forwardValue759_511_0 = __fieldRead759_21(__fieldRead759_20());
    break forward_join_511;
    }
    forwardValue759_71_0 = __integerCategory759_24(__call759_23(p0, __invokedynamic759_22(24619, (9204983033028184557L ^ life1_3))));
    }
    if (!((life3_5 != null))) {
        forwardValue759_84_0 = forwardValue759_71_0;
        break forward_join_84;
    }
    if (!((forwardValue759_71_0 != 0))) {
        break forward_join_77;
    }
    forwardValue759_511_0 = __fieldRead759_26(__fieldRead759_25());
    break forward_join_511;
    }
    forwardValue759_84_0 = __integerCategory759_29(__call759_28(p0, __invokedynamic759_27(10145, (1908449385777712817L ^ life1_3))));
    }
    if (!((life3_5 != null))) {
        forwardValue759_97_0 = forwardValue759_84_0;
        break forward_join_97;
    }
    if (!((forwardValue759_84_0 != 0))) {
        break forward_join_90;
    }
    forwardValue759_511_0 = __fieldRead759_31(__fieldRead759_30());
    break forward_join_511;
    }
    forwardValue759_97_0 = __integerCategory759_34(__call759_33(p0, __invokedynamic759_32(10881, (4159687411733840837L ^ life1_3))));
    }
    if (!((life3_5 != null))) {
        forwardValue759_110_0 = forwardValue759_97_0;
        break forward_join_110;
    }
    if (!((forwardValue759_97_0 != 0))) {
        break forward_join_103;
    }
    forwardValue759_511_0 = __fieldRead759_36(__fieldRead759_35());
    break forward_join_511;
    }
    forwardValue759_110_0 = __integerCategory759_39(__call759_38(p0, __invokedynamic759_37(30978, (2491400815447707751L ^ life1_3))));
    }
    if (!((life3_5 != null))) {
        forwardValue759_123_0 = forwardValue759_110_0;
        break forward_join_123;
    }
    if (!((forwardValue759_110_0 != 0))) {
        break forward_join_116;
    }
    forwardValue759_511_0 = __fieldRead759_41(__fieldRead759_40());
    break forward_join_511;
    }
    forwardValue759_123_0 = __integerCategory759_44(__call759_43(p0, __invokedynamic759_42(13887, (6828981133378543361L ^ life1_3))));
    }
    if (!((life3_5 != null))) {
        forwardValue759_136_0 = forwardValue759_123_0;
        break forward_join_136;
    }
    if (!((forwardValue759_123_0 != 0))) {
        break forward_join_129;
    }
    forwardValue759_511_0 = __fieldRead759_46(__fieldRead759_45());
    break forward_join_511;
    }
    forwardValue759_136_0 = __integerCategory759_49(__call759_48(p0, __invokedynamic759_47(21389, (7997800067369810685L ^ life1_3))));
    }
    if (!((life3_5 != null))) {
        forwardValue759_149_0 = forwardValue759_136_0;
        break forward_join_149;
    }
    if (!((forwardValue759_136_0 != 0))) {
        break forward_join_142;
    }
    forwardValue759_511_0 = __fieldRead759_51(__fieldRead759_50());
    break forward_join_511;
    }
    forwardValue759_149_0 = __integerCategory759_54(__call759_53(p0, __invokedynamic759_52(7724, (6023694860343506757L ^ life1_3))));
    }
    if (!((life3_5 != null))) {
        forwardValue759_162_0 = forwardValue759_149_0;
        break forward_join_162;
    }
    if (!((forwardValue759_149_0 != 0))) {
        break forward_join_155;
    }
    forwardValue759_511_0 = __fieldRead759_56(__fieldRead759_55());
    break forward_join_511;
    }
    forwardValue759_162_0 = __integerCategory759_59(__call759_58(p0, __invokedynamic759_57(12894, (7834085485818305393L ^ life1_3))));
    }
    if (!((life3_5 != null))) {
        forwardValue759_175_0 = forwardValue759_162_0;
        break forward_join_175;
    }
    if (!((forwardValue759_162_0 != 0))) {
        break forward_join_168;
    }
    forwardValue759_511_0 = __fieldRead759_61(__fieldRead759_60());
    break forward_join_511;
    }
    forwardValue759_175_0 = __integerCategory759_64(__call759_63(p0, __invokedynamic759_62(25795, (2290635720503889396L ^ life1_3))));
    }
    if (!((life3_5 != null))) {
        forwardValue759_188_0 = forwardValue759_175_0;
        break forward_join_188;
    }
    if (!((forwardValue759_175_0 != 0))) {
        break forward_join_181;
    }
    forwardValue759_511_0 = __fieldRead759_66(__fieldRead759_65());
    break forward_join_511;
    }
    forwardValue759_188_0 = __integerCategory759_69(__call759_68(p0, __invokedynamic759_67(30478, (5415522674757606991L ^ life1_3))));
    }
    if (!((life3_5 != null))) {
        forwardValue759_201_0 = forwardValue759_188_0;
        break forward_join_201;
    }
    if (!((forwardValue759_188_0 != 0))) {
        break forward_join_194;
    }
    forwardValue759_511_0 = __fieldRead759_71(__fieldRead759_70());
    break forward_join_511;
    }
    forwardValue759_201_0 = __integerCategory759_74(__call759_73(p0, __invokedynamic759_72(30289, (1661862839252131696L ^ life1_3))));
    }
    if (!((life3_5 != null))) {
        forwardValue759_214_0 = forwardValue759_201_0;
        break forward_join_214;
    }
    if (!((forwardValue759_201_0 != 0))) {
        break forward_join_207;
    }
    forwardValue759_511_0 = __fieldRead759_76(__fieldRead759_75());
    break forward_join_511;
    }
    forwardValue759_214_0 = __integerCategory759_79(__call759_78(p0, __invokedynamic759_77(8924, (7566332788308134880L ^ life1_3))));
    }
    if (!((life3_5 != null))) {
        forwardValue759_227_0 = forwardValue759_214_0;
        break forward_join_227;
    }
    if (!((forwardValue759_214_0 != 0))) {
        break forward_join_220;
    }
    forwardValue759_511_0 = __fieldRead759_81(__fieldRead759_80());
    break forward_join_511;
    }
    forwardValue759_227_0 = __integerCategory759_84(__call759_83(p0, __invokedynamic759_82(12343, (2377250809221404948L ^ life1_3))));
    }
    if (!((life3_5 != null))) {
        forwardValue759_240_0 = forwardValue759_227_0;
        break forward_join_240;
    }
    if (!((forwardValue759_227_0 != 0))) {
        break forward_join_233;
    }
    forwardValue759_511_0 = __fieldRead759_86(__fieldRead759_85());
    break forward_join_511;
    }
    forwardValue759_240_0 = __integerCategory759_89(__call759_88(p0, __invokedynamic759_87(10006, (3137008051829231153L ^ life1_3))));
    }
    if (!((life3_5 != null))) {
        forwardValue759_253_0 = forwardValue759_240_0;
        break forward_join_253;
    }
    if (!((forwardValue759_240_0 != 0))) {
        break forward_join_246;
    }
    forwardValue759_511_0 = __fieldRead759_91(__fieldRead759_90());
    break forward_join_511;
    }
    forwardValue759_253_0 = __integerCategory759_94(__call759_93(p0, __invokedynamic759_92(15502, (9107223240577471823L ^ life1_3))));
    }
    if (!((life3_5 != null))) {
        forwardValue759_266_0 = forwardValue759_253_0;
        break forward_join_266;
    }
    if (!((forwardValue759_253_0 != 0))) {
        break forward_join_259;
    }
    forwardValue759_511_0 = __fieldRead759_96(__fieldRead759_95());
    break forward_join_511;
    }
    forwardValue759_266_0 = __integerCategory759_99(__call759_98(p0, __invokedynamic759_97(23931, (1238527778969400328L ^ life1_3))));
    }
    if (!((life3_5 != null))) {
        forwardValue759_279_0 = forwardValue759_266_0;
        break forward_join_279;
    }
    if (!((forwardValue759_266_0 != 0))) {
        break forward_join_272;
    }
    forwardValue759_511_0 = __fieldRead759_101(__fieldRead759_100());
    break forward_join_511;
    }
    forwardValue759_279_0 = __integerCategory759_104(__call759_103(p0, __invokedynamic759_102(32134, (6304148422366172303L ^ life1_3))));
    }
    if (!((life3_5 != null))) {
        forwardValue759_289_0 = forwardValue759_279_0;
        break forward_join_289;
    }
    if (!((forwardValue759_279_0 == 0))) {
        break forward_join_509;
    }
    forwardValue759_289_0 = __integerCategory759_107(__call759_106(p0, __invokedynamic759_105(20928, (8026969347234314440L ^ life1_3))));
    }
    if (!((life3_5 != null))) {
        forwardValue759_299_0 = forwardValue759_289_0;
        break forward_join_299;
    }
    if (!((forwardValue759_289_0 == 0))) {
        break forward_join_509;
    }
    forwardValue759_299_0 = __integerCategory759_110(__call759_109(p0, __invokedynamic759_108(15855, (437384715953656969L ^ life1_3))));
    }
    if (!((life3_5 != null))) {
        forwardValue759_508_0 = forwardValue759_299_0;
        break forward_join_508;
    }
    if (!((forwardValue759_299_0 == 0))) {
        break forward_join_506;
    }
    spill759_2 = __call759_112(p0, __invokedynamic759_111(9944, (8076867296218631954L ^ life1_3)));
    if (!((life3_5 != null))) {
        forwardValue759_508_0 = __integerCategory759_113(spill759_2);
        break forward_join_508;
    }
    if (!((!spill759_2))) {
        break forward_join_506;
    }
    spill759_3 = __call759_115(p0, __invokedynamic759_114(27558, (2111434362327991004L ^ life1_3)));
    if (!((life3_5 != null))) {
        forwardValue759_332_0 = __integerCategory759_116(spill759_3);
        break forward_join_332;
    }
    if (!(spill759_3)) {
        break forward_join_325;
    }
    forwardValue759_511_0 = __fieldRead759_118(__fieldRead759_117());
    break forward_join_511;
    }
    forwardValue759_332_0 = __integerCategory759_121(__call759_120(p0, __invokedynamic759_119(32636, (1530278247236539959L ^ life1_3))));
    }
    if (!((life3_5 != null))) {
        forwardValue759_505_0 = forwardValue759_332_0;
        break forward_join_505;
    }
    if (!((forwardValue759_332_0 == 0))) {
        break forward_join_503;
    }
    spill759_4 = __call759_123(p0, __invokedynamic759_122(27157, (1228253587074417478L ^ life1_3)));
    if (!((life3_5 != null))) {
        forwardValue759_505_0 = __integerCategory759_124(spill759_4);
        break forward_join_505;
    }
    if (!((!spill759_4))) {
        break forward_join_503;
    }
    spill759_5 = __call759_126(p0, __invokedynamic759_125(10293, (7727763099833942362L ^ life1_3)));
    if (!((life3_5 != null))) {
        forwardValue759_365_0 = __integerCategory759_127(spill759_5);
        break forward_join_365;
    }
    if (!(spill759_5)) {
        break forward_join_358;
    }
    forwardValue759_511_0 = __fieldRead759_129(__fieldRead759_128());
    break forward_join_511;
    }
    forwardValue759_365_0 = __integerCategory759_132(__call759_131(p0, __invokedynamic759_130(10769, (4802232008804811647L ^ life1_3))));
    }
    if (!((life3_5 != null))) {
        forwardValue759_378_0 = forwardValue759_365_0;
        break forward_join_378;
    }
    if (!((forwardValue759_365_0 != 0))) {
        break forward_join_371;
    }
    forwardValue759_511_0 = __fieldRead759_134(__fieldRead759_133());
    break forward_join_511;
    }
    forwardValue759_378_0 = __integerCategory759_137(__call759_136(p0, __invokedynamic759_135(28976, (8357156042430027888L ^ life1_3))));
    }
    if (!((life3_5 != null))) {
        forwardValue759_391_0 = forwardValue759_378_0;
        break forward_join_391;
    }
    if (!((forwardValue759_378_0 != 0))) {
        break forward_join_384;
    }
    forwardValue759_511_0 = __fieldRead759_139(__fieldRead759_138());
    break forward_join_511;
    }
    forwardValue759_391_0 = __integerCategory759_142(__call759_141(p0, __invokedynamic759_140(2961, (3743315625154372256L ^ life1_3))));
    }
    if (!((life3_5 != null))) {
        forwardValue759_404_0 = forwardValue759_391_0;
        break forward_join_404;
    }
    if (!((forwardValue759_391_0 != 0))) {
        break forward_join_397;
    }
    forwardValue759_511_0 = __fieldRead759_144(__fieldRead759_143());
    break forward_join_511;
    }
    forwardValue759_404_0 = __integerCategory759_147(__call759_146(p0, __invokedynamic759_145(16930, (1124787116948269848L ^ life1_3))));
    }
    if (!((life3_5 != null))) {
        forwardValue759_417_0 = forwardValue759_404_0;
        break forward_join_417;
    }
    if (!((forwardValue759_404_0 != 0))) {
        break forward_join_410;
    }
    forwardValue759_511_0 = __fieldRead759_149(__fieldRead759_148());
    break forward_join_511;
    }
    forwardValue759_417_0 = __integerCategory759_152(__call759_151(p0, __invokedynamic759_150(14684, (2497702739474239608L ^ life1_3))));
    }
    if (!((life3_5 != null))) {
        forwardValue759_430_0 = forwardValue759_417_0;
        break forward_join_430;
    }
    if (!((forwardValue759_417_0 != 0))) {
        break forward_join_423;
    }
    forwardValue759_511_0 = __fieldRead759_154(__fieldRead759_153());
    break forward_join_511;
    }
    forwardValue759_430_0 = __integerCategory759_157(__call759_156(p0, __invokedynamic759_155(21500, (6642739329545747198L ^ life1_3))));
    }
    if (!((life3_5 != null))) {
        forwardValue759_443_0 = forwardValue759_430_0;
        break forward_join_443;
    }
    if (!((forwardValue759_430_0 != 0))) {
        break forward_join_436;
    }
    forwardValue759_511_0 = __fieldRead759_159(__fieldRead759_158());
    break forward_join_511;
    }
    forwardValue759_443_0 = __integerCategory759_162(__call759_161(p0, __invokedynamic759_160(28768, (4204086014298200369L ^ life1_3))));
    }
    if (!((life3_5 != null))) {
        forwardValue759_456_0 = forwardValue759_443_0;
        break forward_join_456;
    }
    if (!((forwardValue759_443_0 != 0))) {
        break forward_join_449;
    }
    forwardValue759_511_0 = __fieldRead759_164(__fieldRead759_163());
    break forward_join_511;
    }
    forwardValue759_456_0 = __integerCategory759_167(__call759_166(p0, __invokedynamic759_165(11264, (6600033226907075855L ^ life1_3))));
    }
    if (!((life3_5 != null))) {
        forwardValue759_469_0 = forwardValue759_456_0;
        break forward_join_469;
    }
    if (!((forwardValue759_456_0 != 0))) {
        break forward_join_462;
    }
    forwardValue759_511_0 = __fieldRead759_169(__fieldRead759_168());
    break forward_join_511;
    }
    forwardValue759_469_0 = __integerCategory759_172(__call759_171(p0, __invokedynamic759_170(16686, (5764473035486275683L ^ life1_3))));
    }
    if (!((life3_5 != null))) {
        forwardValue759_482_0 = forwardValue759_469_0;
        break forward_join_482;
    }
    if (!((forwardValue759_469_0 != 0))) {
        break forward_join_475;
    }
    forwardValue759_511_0 = __fieldRead759_174(__fieldRead759_173());
    break forward_join_511;
    }
    forwardValue759_482_0 = __integerCategory759_177(__call759_176(p0, __invokedynamic759_175(22672, (6876635062922981726L ^ life1_3))));
    }
    if (!((life3_5 != null))) {
        forwardValue759_495_0 = forwardValue759_482_0;
        break forward_join_495;
    }
    if (!((forwardValue759_482_0 != 0))) {
        break forward_join_488;
    }
    forwardValue759_511_0 = __fieldRead759_179(__fieldRead759_178());
    break forward_join_511;
    }
    forwardValue759_495_0 = __integerCategory759_182(__call759_181(p0, __invokedynamic759_180(24617, (8263815918934984969L ^ life1_3))));
    }
    if (!((life3_5 != null))) {
        forwardValue759_502_0 = forwardValue759_495_0;
        break forward_join_502;
    }
    if (!((forwardValue759_495_0 != 0))) {
        break forward_join_501;
    }
    forwardValue759_511_0 = __fieldRead759_184(__fieldRead759_183());
    break forward_join_511;
    }
    forwardValue759_502_0 = -1;
    }
    forwardValue759_511_0 = forwardValue759_502_0;
    break forward_join_511;
    }
    forwardValue759_505_0 = __fieldRead759_186(__fieldRead759_185());
    }
    forwardValue759_511_0 = forwardValue759_505_0;
    break forward_join_511;
    }
    forwardValue759_508_0 = __fieldRead759_188(__fieldRead759_187());
    }
    forwardValue759_511_0 = forwardValue759_508_0;
    break forward_join_511;
    }
    forwardValue759_511_0 = __fieldRead759_190(__fieldRead759_189());
    }
    return forwardValue759_511_0;
}
public static void h759_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075900_0(p0);
}
public static void h759_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075901_0(p0);
}
public static void h759_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075902_0(p0);
}
public static void h759_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075903_0(p0);
}
public static void h759_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075904_0(p0);
}
public static void h759_5(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075905_0(p0);
}
public static void h759_6(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075906_0(p0);
}
public static void h759_7(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075907_0(p0);
}
public static void h759_8(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075908_0(p0);
}
public static void h759_9(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075909_0(p0);
}
public static void h759_10(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075910_0(p0);
}
public static void h759_11(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075911_0(p0);
}
public static void h759_12(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075912_0(p0);
}
public static void h759_13(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075913_0(p0);
}
public static void h759_14(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075914_0(p0);
}
public static void h759_15(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075915_0(p0);
}
public static void h759_16(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075916_0(p0);
}
public static void h759_17(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075917_0(p0);
}
public static void h759_18(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075918_0(p0);
}
public static void h759_19(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075919_0(p0);
}
public static void h759_20(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075920_0(p0);
}
public static void h759_21(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075921_0(p0);
}
public static void h759_22(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075922_0(p0);
}
public static void h759_23(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075923_0(p0);
}
public static void h759_24(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075924_0(p0);
}
public static void h759_25(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075925_0(p0);
}
public static void h759_26(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075926_0(p0);
}
public static void h759_27(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075927_0(p0);
}
public static void h759_28(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075928_0(p0);
}
public static void h759_29(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075929_0(p0);
}
public static void h759_30(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075930_0(p0);
}
public static void h759_31(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075931_0(p0);
}
public static void h759_32(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075932_0(p0);
}
public static void h759_33(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075933_0(p0);
}
public static void h759_34(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075934_0(p0);
}
public static void h759_35(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075935_0(p0);
}
public static void h759_36(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075936_0(p0);
}
public static void h759_37(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075937_0(p0);
}
public static void h759_38(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075938_0(p0);
}
public static void h759_39(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075939_0(p0);
}
public static void h759_40(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075940_0(p0);
}
public static void h759_41(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075941_0(p0);
}
public static void h759_42(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075942_0(p0);
}
public static void h759_43(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075943_0(p0);
}
public static void h759_44(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075944_0(p0);
}
public static void h759_45(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075945_0(p0);
}
public static void h759_46(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075946_0(p0);
}
public static void h759_47(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075947_0(p0);
}
public static void h759_48(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075948_0(p0);
}
public static void h759_49(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075949_0(p0);
}
public static void h759_50(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075950_0(p0);
}
public static void h759_51(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075951_0(p0);
}
public static void h759_52(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075952_0(p0);
}
public static void h759_53(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075953_0(p0);
}
public static void h759_54(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075954_0(p0);
}
public static void h759_55(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075955_0(p0);
}
public static void h759_56(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075956_0(p0);
}
public static void h759_57(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075957_0(p0);
}
public static void h759_58(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075958_0(p0);
}
public static void h759_59(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075959_0(p0);
}
public static void h759_60(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075960_0(p0);
}
public static void h759_61(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075961_0(p0);
}
public static void h759_62(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075962_0(p0);
}
public static void h759_63(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075963_0(p0);
}
public static void h759_64(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075964_0(p0);
}
public static void h759_65(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075965_0(p0);
}
public static void h759_66(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075966_0(p0);
}
public static void h759_67(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075967_0(p0);
}
public static void h759_68(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075968_0(p0);
}
public static void h759_69(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075969_0(p0);
}
public static void h759_70(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075970_0(p0);
}
public static void h759_71(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075971_0(p0);
}
public static void h759_72(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075972_0(p0);
}
public static void h759_73(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075973_0(p0);
}
public static void h759_74(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075974_0(p0);
}
public static void h759_75(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075975_0(p0);
}
public static void h759_76(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075976_0(p0);
}
public static void h759_77(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075977_0(p0);
}
public static void h759_78(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075978_0(p0);
}
public static void h759_79(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1075979_0(p0);
}
private static native long __fieldRead759_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call759_1() throws Throwable;
private static native java.lang.String __invokedynamic759_2(int a0, long a1) throws Throwable;
private static native boolean __call759_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_4(boolean value) throws Throwable;
private static native moom.fm __fieldRead759_5() throws Throwable;
private static native int __fieldRead759_6(moom.fm a0) throws Throwable;
private static native java.lang.String __invokedynamic759_7(int a0, long a1) throws Throwable;
private static native boolean __call759_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_9(boolean value) throws Throwable;
private static native moom.fm __fieldRead759_10() throws Throwable;
private static native int __fieldRead759_11(moom.fm a0) throws Throwable;
private static native java.lang.String __invokedynamic759_12(int a0, long a1) throws Throwable;
private static native boolean __call759_13(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_14(boolean value) throws Throwable;
private static native moom.fm __fieldRead759_15() throws Throwable;
private static native int __fieldRead759_16(moom.fm a0) throws Throwable;
private static native java.lang.String __invokedynamic759_17(int a0, long a1) throws Throwable;
private static native boolean __call759_18(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_19(boolean value) throws Throwable;
private static native moom.fm __fieldRead759_20() throws Throwable;
private static native int __fieldRead759_21(moom.fm a0) throws Throwable;
private static native java.lang.String __invokedynamic759_22(int a0, long a1) throws Throwable;
private static native boolean __call759_23(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_24(boolean value) throws Throwable;
private static native moom.fm __fieldRead759_25() throws Throwable;
private static native int __fieldRead759_26(moom.fm a0) throws Throwable;
private static native java.lang.String __invokedynamic759_27(int a0, long a1) throws Throwable;
private static native boolean __call759_28(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_29(boolean value) throws Throwable;
private static native moom.fm __fieldRead759_30() throws Throwable;
private static native int __fieldRead759_31(moom.fm a0) throws Throwable;
private static native java.lang.String __invokedynamic759_32(int a0, long a1) throws Throwable;
private static native boolean __call759_33(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_34(boolean value) throws Throwable;
private static native moom.fm __fieldRead759_35() throws Throwable;
private static native int __fieldRead759_36(moom.fm a0) throws Throwable;
private static native java.lang.String __invokedynamic759_37(int a0, long a1) throws Throwable;
private static native boolean __call759_38(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_39(boolean value) throws Throwable;
private static native moom.fm __fieldRead759_40() throws Throwable;
private static native int __fieldRead759_41(moom.fm a0) throws Throwable;
private static native java.lang.String __invokedynamic759_42(int a0, long a1) throws Throwable;
private static native boolean __call759_43(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_44(boolean value) throws Throwable;
private static native moom.fm __fieldRead759_45() throws Throwable;
private static native int __fieldRead759_46(moom.fm a0) throws Throwable;
private static native java.lang.String __invokedynamic759_47(int a0, long a1) throws Throwable;
private static native boolean __call759_48(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_49(boolean value) throws Throwable;
private static native moom.fm __fieldRead759_50() throws Throwable;
private static native int __fieldRead759_51(moom.fm a0) throws Throwable;
private static native java.lang.String __invokedynamic759_52(int a0, long a1) throws Throwable;
private static native boolean __call759_53(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_54(boolean value) throws Throwable;
private static native moom.fm __fieldRead759_55() throws Throwable;
private static native int __fieldRead759_56(moom.fm a0) throws Throwable;
private static native java.lang.String __invokedynamic759_57(int a0, long a1) throws Throwable;
private static native boolean __call759_58(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_59(boolean value) throws Throwable;
private static native moom.fm __fieldRead759_60() throws Throwable;
private static native int __fieldRead759_61(moom.fm a0) throws Throwable;
private static native java.lang.String __invokedynamic759_62(int a0, long a1) throws Throwable;
private static native boolean __call759_63(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_64(boolean value) throws Throwable;
private static native moom.fm __fieldRead759_65() throws Throwable;
private static native int __fieldRead759_66(moom.fm a0) throws Throwable;
private static native java.lang.String __invokedynamic759_67(int a0, long a1) throws Throwable;
private static native boolean __call759_68(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_69(boolean value) throws Throwable;
private static native moom.fm __fieldRead759_70() throws Throwable;
private static native int __fieldRead759_71(moom.fm a0) throws Throwable;
private static native java.lang.String __invokedynamic759_72(int a0, long a1) throws Throwable;
private static native boolean __call759_73(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_74(boolean value) throws Throwable;
private static native moom.fm __fieldRead759_75() throws Throwable;
private static native int __fieldRead759_76(moom.fm a0) throws Throwable;
private static native java.lang.String __invokedynamic759_77(int a0, long a1) throws Throwable;
private static native boolean __call759_78(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_79(boolean value) throws Throwable;
private static native moom.fm __fieldRead759_80() throws Throwable;
private static native int __fieldRead759_81(moom.fm a0) throws Throwable;
private static native java.lang.String __invokedynamic759_82(int a0, long a1) throws Throwable;
private static native boolean __call759_83(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_84(boolean value) throws Throwable;
private static native moom.fm __fieldRead759_85() throws Throwable;
private static native int __fieldRead759_86(moom.fm a0) throws Throwable;
private static native java.lang.String __invokedynamic759_87(int a0, long a1) throws Throwable;
private static native boolean __call759_88(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_89(boolean value) throws Throwable;
private static native moom.fm __fieldRead759_90() throws Throwable;
private static native int __fieldRead759_91(moom.fm a0) throws Throwable;
private static native java.lang.String __invokedynamic759_92(int a0, long a1) throws Throwable;
private static native boolean __call759_93(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_94(boolean value) throws Throwable;
private static native moom.fm __fieldRead759_95() throws Throwable;
private static native int __fieldRead759_96(moom.fm a0) throws Throwable;
private static native java.lang.String __invokedynamic759_97(int a0, long a1) throws Throwable;
private static native boolean __call759_98(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_99(boolean value) throws Throwable;
private static native moom.fm __fieldRead759_100() throws Throwable;
private static native int __fieldRead759_101(moom.fm a0) throws Throwable;
private static native java.lang.String __invokedynamic759_102(int a0, long a1) throws Throwable;
private static native boolean __call759_103(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_104(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic759_105(int a0, long a1) throws Throwable;
private static native boolean __call759_106(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_107(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic759_108(int a0, long a1) throws Throwable;
private static native boolean __call759_109(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_110(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic759_111(int a0, long a1) throws Throwable;
private static native boolean __call759_112(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_113(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic759_114(int a0, long a1) throws Throwable;
private static native boolean __call759_115(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_116(boolean value) throws Throwable;
private static native moom.fm __fieldRead759_117() throws Throwable;
private static native int __fieldRead759_118(moom.fm a0) throws Throwable;
private static native java.lang.String __invokedynamic759_119(int a0, long a1) throws Throwable;
private static native boolean __call759_120(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_121(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic759_122(int a0, long a1) throws Throwable;
private static native boolean __call759_123(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_124(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic759_125(int a0, long a1) throws Throwable;
private static native boolean __call759_126(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_127(boolean value) throws Throwable;
private static native moom.fm __fieldRead759_128() throws Throwable;
private static native int __fieldRead759_129(moom.fm a0) throws Throwable;
private static native java.lang.String __invokedynamic759_130(int a0, long a1) throws Throwable;
private static native boolean __call759_131(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_132(boolean value) throws Throwable;
private static native moom.fm __fieldRead759_133() throws Throwable;
private static native int __fieldRead759_134(moom.fm a0) throws Throwable;
private static native java.lang.String __invokedynamic759_135(int a0, long a1) throws Throwable;
private static native boolean __call759_136(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_137(boolean value) throws Throwable;
private static native moom.fm __fieldRead759_138() throws Throwable;
private static native int __fieldRead759_139(moom.fm a0) throws Throwable;
private static native java.lang.String __invokedynamic759_140(int a0, long a1) throws Throwable;
private static native boolean __call759_141(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_142(boolean value) throws Throwable;
private static native moom.fm __fieldRead759_143() throws Throwable;
private static native int __fieldRead759_144(moom.fm a0) throws Throwable;
private static native java.lang.String __invokedynamic759_145(int a0, long a1) throws Throwable;
private static native boolean __call759_146(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_147(boolean value) throws Throwable;
private static native moom.fm __fieldRead759_148() throws Throwable;
private static native int __fieldRead759_149(moom.fm a0) throws Throwable;
private static native java.lang.String __invokedynamic759_150(int a0, long a1) throws Throwable;
private static native boolean __call759_151(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_152(boolean value) throws Throwable;
private static native moom.fm __fieldRead759_153() throws Throwable;
private static native int __fieldRead759_154(moom.fm a0) throws Throwable;
private static native java.lang.String __invokedynamic759_155(int a0, long a1) throws Throwable;
private static native boolean __call759_156(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_157(boolean value) throws Throwable;
private static native moom.fm __fieldRead759_158() throws Throwable;
private static native int __fieldRead759_159(moom.fm a0) throws Throwable;
private static native java.lang.String __invokedynamic759_160(int a0, long a1) throws Throwable;
private static native boolean __call759_161(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_162(boolean value) throws Throwable;
private static native moom.fm __fieldRead759_163() throws Throwable;
private static native int __fieldRead759_164(moom.fm a0) throws Throwable;
private static native java.lang.String __invokedynamic759_165(int a0, long a1) throws Throwable;
private static native boolean __call759_166(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_167(boolean value) throws Throwable;
private static native moom.fm __fieldRead759_168() throws Throwable;
private static native int __fieldRead759_169(moom.fm a0) throws Throwable;
private static native java.lang.String __invokedynamic759_170(int a0, long a1) throws Throwable;
private static native boolean __call759_171(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_172(boolean value) throws Throwable;
private static native moom.fm __fieldRead759_173() throws Throwable;
private static native int __fieldRead759_174(moom.fm a0) throws Throwable;
private static native java.lang.String __invokedynamic759_175(int a0, long a1) throws Throwable;
private static native boolean __call759_176(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_177(boolean value) throws Throwable;
private static native moom.fm __fieldRead759_178() throws Throwable;
private static native int __fieldRead759_179(moom.fm a0) throws Throwable;
private static native java.lang.String __invokedynamic759_180(int a0, long a1) throws Throwable;
private static native boolean __call759_181(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory759_182(boolean value) throws Throwable;
private static native moom.fm __fieldRead759_183() throws Throwable;
private static native int __fieldRead759_184(moom.fm a0) throws Throwable;
private static native moom.fm __fieldRead759_185() throws Throwable;
private static native int __fieldRead759_186(moom.fm a0) throws Throwable;
private static native moom.fm __fieldRead759_187() throws Throwable;
private static native int __fieldRead759_188(moom.fm a0) throws Throwable;
private static native moom.fm __fieldRead759_189() throws Throwable;
private static native int __fieldRead759_190(moom.fm a0) throws Throwable;
private static native java.lang.Exception __call1075900_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075901_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075902_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075903_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075904_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075905_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075906_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075907_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075908_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075909_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075910_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075911_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075912_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075913_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075914_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075915_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075916_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075917_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075918_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075919_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075920_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075921_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075922_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075923_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075924_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075925_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075926_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075927_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075928_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075929_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075930_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075931_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075932_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075933_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075934_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075935_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075936_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075937_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075938_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075939_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075940_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075941_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075942_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075943_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075944_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075945_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075946_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075947_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075948_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075949_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075950_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075951_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075952_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075953_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075954_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075955_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075956_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075957_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075958_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075959_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075960_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075961_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075962_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075963_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075964_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075965_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075966_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075967_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075968_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075969_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075970_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075971_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075972_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075973_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075974_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075975_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075976_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075977_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075978_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1075979_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int[] __sourceHandlerCall_0886e9a8490d12c7b97f(java.util.Properties a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws E;
private static final class __SourceHandler_0886e9a8490d12c7b97f {

public static int[] f89(java.util.Properties p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws Throwable {
    java.lang.String lexicalValue89_40_0;
    java.lang.String lexicalValue89_40_1;
    int lexicalValue89_53_0;
    int lexicalValue89_59_0;
    int lexicalValue89_87_0;
    net.minecraft.entity.Entity[] spill89_0;
    java.lang.String spill89_1;
    java.lang.String spill89_2;
    boolean spill89_3;
    int spill89_4;
    java.lang.String spill89_5;
    java.lang.String spill89_6;
    java.lang.String spill89_7;
    java.lang.String spill89_8;
    long life4_3;
    int[] life7_8;
    int life8_13;
    net.minecraft.entity.Entity[] life6_14;
    java.util.Iterator life9_18;
    java.lang.String life10_25;
    java.lang.String life11_29;
    java.lang.String life12_50;
    int life13_53;
    int life14_56;
    lexical_join_90: {
    lexical_join_87: {
    lexical_join_86: {
    life4_3 = (__fieldRead89_0() ^ 140204307039294L);
    spill89_0 = __call89_1();
    life7_8 = new int[(__fieldRead89_2()).length];
    __call89_3(life7_8, -1);
    life8_13 = 0;
    life6_14 = spill89_0;
    life9_18 = __call89_5(__call89_4(p0));
    lexical_cycle_19: while (true) {
    lexical_join_84: {
    lexical_join_67: {
    lexical_join_59: {
    lexical_join_53: {
    lexical_join_40: {
    if (!(__call89_6(life9_18))) {
        break lexical_join_86;
    }
    life10_25 = __cast89_8(__call89_7(life9_18));
    life11_29 = __call89_9(p0, life10_25);
    spill89_1 = life10_25;
    spill89_2 = p2;
    if (!((life6_14 != null))) {
        lexicalValue89_40_0 = spill89_1;
        lexicalValue89_40_1 = spill89_2;
        break lexical_join_40;
    }
    spill89_3 = __call89_10(spill89_1, spill89_2);
    if (!((life6_14 != null))) {
        lexicalValue89_87_0 = __integerCategory89_11(spill89_3);
        break lexical_join_87;
    }
    if (!(spill89_3)) {
        break lexical_join_84;
    }
    lexicalValue89_40_0 = life10_25;
    lexicalValue89_40_1 = p2;
    }
    life12_50 = __call89_12(lexicalValue89_40_0, lexicalValue89_40_1);
    life13_53 = __call89_13(life12_50);
    life14_56 = __call89_14(life11_29);
    spill89_4 = life13_53;
    if (!((life6_14 != null))) {
        lexicalValue89_53_0 = spill89_4;
        break lexical_join_53;
    }
    if (!((spill89_4 >= 0))) {
        break lexical_join_67;
    }
    lexicalValue89_53_0 = life13_53;
    }
    if (!((life6_14 != null))) {
        lexicalValue89_59_0 = lexicalValue89_53_0;
        break lexical_join_59;
    }
    if (!((lexicalValue89_53_0 < (life7_8).length))) {
        break lexical_join_67;
    }
    lexicalValue89_59_0 = life14_56;
    }
    if (!((lexicalValue89_59_0 >= 0))) {
        break lexical_join_67;
    }
    (life7_8)[life13_53] = life14_56;
    life8_13 += 1;
    if (!((life6_14 == null))) {
        break lexical_join_84;
    }
    }
    java.lang.String __stackOp89_16_0 = life10_25;
    java.lang.String __stackOp89_16_1 = life11_29;
    java.lang.String __stackOp89_16_2 = __invokedynamic89_15(16305, (1797598563140847117L ^ life4_3));
    spill89_5 = __stackOp89_16_2;
    spill89_6 = __stackOp89_16_0;
    spill89_7 = __stackOp89_16_1;
    __discardScalar89_17(__stackOp89_16_2);
    java.lang.String __stackOp89_19_0 = spill89_7;
    java.lang.String __stackOp89_19_1 = __invokedynamic89_18(24078, (8886732281988687843L ^ life4_3));
    __call89_21(__invokedynamic89_20(spill89_5, spill89_6, __stackOp89_19_1, __stackOp89_19_0));
    }
    if (!((life6_14 == null))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    lexicalValue89_87_0 = life8_13;
    }
    if (!((lexicalValue89_87_0 <= 0))) {
        break lexical_join_90;
    }
    return null;
    }
    spill89_8 = p3;
    int __stackOp89_23_0 = life8_13;
    java.lang.String __stackOp89_23_1 = __invokedynamic89_22(20486, (98170177045277060L ^ life4_3));
    __call89_25(__invokedynamic89_24(spill89_8, __stackOp89_23_1, __stackOp89_23_0));
    return life7_8;
}
public static void h89_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008900_0(p0);
}
public static void h89_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008901_0(p0);
}
public static void h89_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008902_0(p0);
}
public static void h89_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008903_0(p0);
}
public static void h89_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008904_0(p0);
}
public static void h89_5(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008905_0(p0);
}
public static void h89_6(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008906_0(p0);
}
public static void h89_7(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008907_0(p0);
}
public static void h89_8(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1008908_0(p0);
}
private static native long __fieldRead89_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call89_1() throws Throwable;
private static native moom.fm[] __fieldRead89_2() throws Throwable;
private static native void __call89_3(int[] a0, int a1) throws Throwable;
private static native java.util.Set __call89_4(java.util.Properties a0) throws Throwable;
private static native java.util.Iterator __call89_5(java.util.Set a0) throws Throwable;
private static native boolean __call89_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call89_7(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast89_8(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call89_9(java.util.Properties a0, java.lang.String a1) throws Throwable;
private static native boolean __call89_10(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory89_11(boolean value) throws Throwable;
private static native java.lang.String __call89_12(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __call89_13(java.lang.String a0) throws Throwable;
private static native int __call89_14(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic89_15(int a0, long a1) throws Throwable;
private static native void __discardScalar89_17(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic89_18(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic89_20(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native void __call89_21(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic89_22(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic89_24(java.lang.String a0, java.lang.String a1, int a2) throws Throwable;
private static native void __call89_25(java.lang.String a0) throws Throwable;
private static native java.lang.Exception __call1008900_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008901_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008902_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008903_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008904_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008905_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008906_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008907_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1008908_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> moom.DR __sourceHandlerCall_758eff155ec0070d80eb(moom.DR a0) throws E;
private static final class __SourceHandler_758eff155ec0070d80eb {

public static moom.DR f761(moom.DR p0) throws Throwable {
    moom.DR forwardValue761_11_0;
    moom.DR forwardValue761_13_0;
    moom.DR spill761_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_13: {
    forward_join_12: {
    forward_join_11: {
    life1_3 = (__fieldRead761_0() ^ 97132889996149L);
    life3_5 = __call761_1();
    spill761_0 = __fieldRead761_2();
    if (!((life3_5 != null))) {
        forwardValue761_11_0 = spill761_0;
        break forward_join_11;
    }
    if (!((spill761_0 == null))) {
        break forward_join_12;
    }
    forwardValue761_11_0 = p0;
    }
    forwardValue761_13_0 = forwardValue761_11_0;
    break forward_join_13;
    }
    forwardValue761_13_0 = __fieldRead761_3();
    }
    return forwardValue761_13_0;
}
public static void h761_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1076100_0(p0);
}
private static native long __fieldRead761_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call761_1() throws Throwable;
private static native moom.DR __fieldRead761_2() throws Throwable;
private static native moom.DR __fieldRead761_3() throws Throwable;
private static native java.lang.Exception __call1076100_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_4088863b12bf89f2c504(int a0) throws E;
private static final class __SourceHandler_4088863b12bf89f2c504 {

public static int f762(int p0) throws Throwable {
    int forwardValue762_11_0;
    int forwardValue762_13_0;
    int spill762_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_13: {
    forward_join_12: {
    forward_join_11: {
    life1_3 = (__fieldRead762_0() ^ 114943951328977L);
    life3_5 = __call762_1();
    spill762_0 = __fieldRead762_2();
    if (!((life3_5 != null))) {
        forwardValue762_11_0 = spill762_0;
        break forward_join_11;
    }
    if (!((spill762_0 < 0))) {
        break forward_join_12;
    }
    forwardValue762_11_0 = p0;
    }
    forwardValue762_13_0 = forwardValue762_11_0;
    break forward_join_13;
    }
    forwardValue762_13_0 = __fieldRead762_3();
    }
    return forwardValue762_13_0;
}
public static void h762_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1076200_0(p0);
}
private static native long __fieldRead762_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call762_1() throws Throwable;
private static native int __fieldRead762_2() throws Throwable;
private static native int __fieldRead762_3() throws Throwable;
private static native java.lang.Exception __call1076200_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int[] __sourceHandlerCall_904dabd61dedb79d74ec(java.util.Properties a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws E;
private static final class __SourceHandler_904dabd61dedb79d74ec {

public static int[] f90(java.util.Properties p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws Throwable {
    int lexicalValue90_40_0;
    int lexicalValue90_49_0;
    int lexicalValue90_55_0;
    int lexicalValue90_83_0;
    net.minecraft.entity.Entity[] spill90_0;
    boolean spill90_1;
    int spill90_2;
    java.lang.String spill90_3;
    java.lang.String spill90_4;
    java.lang.String spill90_5;
    java.lang.String spill90_6;
    long life4_3;
    int[] life7_7;
    int life8_12;
    java.util.Iterator life9_17;
    net.minecraft.entity.Entity[] life6_18;
    java.lang.String life10_25;
    java.lang.String life11_29;
    int life12_49;
    int life13_52;
    lexical_join_86: {
    lexical_join_83: {
    lexical_join_82: {
    life4_3 = (__fieldRead90_0() ^ 100250777959385L);
    life7_7 = new int[(__fieldRead90_1()).length];
    __call90_2(life7_7, -1);
    life8_12 = 0;
    spill90_0 = __call90_3();
    life9_17 = __call90_5(__call90_4(p0));
    life6_18 = spill90_0;
    lexical_cycle_19: while (true) {
    lexical_join_80: {
    lexical_join_63: {
    lexical_join_55: {
    lexical_join_49: {
    lexical_join_40: {
    if (!(__call90_6(life9_17))) {
        break lexical_join_82;
    }
    life10_25 = __cast90_8(__call90_7(life9_17));
    life11_29 = __call90_9(p0, life10_25);
    spill90_1 = __call90_10(life10_25, p2);
    if (!((life6_18 != null))) {
        lexicalValue90_83_0 = __integerCategory90_11(spill90_1);
        break lexical_join_83;
    }
    if (!((life6_18 != null))) {
        lexicalValue90_40_0 = __integerCategory90_12(spill90_1);
        break lexical_join_40;
    }
    if (!(spill90_1)) {
        break lexical_join_80;
    }
    lexicalValue90_40_0 = __call90_13(life10_25);
    }
    life12_49 = lexicalValue90_40_0;
    life13_52 = __call90_14(life11_29);
    spill90_2 = life12_49;
    if (!((life6_18 != null))) {
        lexicalValue90_49_0 = spill90_2;
        break lexical_join_49;
    }
    if (!((spill90_2 >= 0))) {
        break lexical_join_63;
    }
    lexicalValue90_49_0 = life12_49;
    }
    if (!((life6_18 != null))) {
        lexicalValue90_55_0 = lexicalValue90_49_0;
        break lexical_join_55;
    }
    if (!((lexicalValue90_49_0 < (life7_7).length))) {
        break lexical_join_63;
    }
    lexicalValue90_55_0 = life13_52;
    }
    if (!((lexicalValue90_55_0 >= 0))) {
        break lexical_join_63;
    }
    (life7_7)[life12_49] = life13_52;
    life8_12 += 1;
    if (!((life6_18 == null))) {
        break lexical_join_80;
    }
    }
    java.lang.String __stackOp90_16_0 = life10_25;
    java.lang.String __stackOp90_16_1 = life11_29;
    java.lang.String __stackOp90_16_2 = __invokedynamic90_15(15051, (3748052985287982335L ^ life4_3));
    spill90_3 = __stackOp90_16_2;
    spill90_4 = __stackOp90_16_0;
    spill90_5 = __stackOp90_16_1;
    __discardScalar90_17(__stackOp90_16_2);
    java.lang.String __stackOp90_19_0 = spill90_5;
    java.lang.String __stackOp90_19_1 = __invokedynamic90_18(28502, (7830474132806953246L ^ life4_3));
    __call90_21(__invokedynamic90_20(spill90_3, spill90_4, __stackOp90_19_1, __stackOp90_19_0));
    }
    if (!((life6_18 == null))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    lexicalValue90_83_0 = life8_12;
    }
    if (!((lexicalValue90_83_0 <= 0))) {
        break lexical_join_86;
    }
    return null;
    }
    spill90_6 = p3;
    int __stackOp90_23_0 = life8_12;
    java.lang.String __stackOp90_23_1 = __invokedynamic90_22(18284, (4385757159212892514L ^ life4_3));
    __call90_25(__invokedynamic90_24(spill90_6, __stackOp90_23_1, __stackOp90_23_0));
    return life7_7;
}
public static void h90_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1009000_0(p0);
}
public static void h90_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1009001_0(p0);
}
public static void h90_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1009002_0(p0);
}
public static void h90_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1009003_0(p0);
}
public static void h90_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1009004_0(p0);
}
public static void h90_5(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1009005_0(p0);
}
public static void h90_6(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1009006_0(p0);
}
public static void h90_7(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1009007_0(p0);
}
public static void h90_8(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1009008_0(p0);
}
private static native long __fieldRead90_0() throws Throwable;
private static native net.minecraft.potion.Potion[] __fieldRead90_1() throws Throwable;
private static native void __call90_2(int[] a0, int a1) throws Throwable;
private static native net.minecraft.entity.Entity[] __call90_3() throws Throwable;
private static native java.util.Set __call90_4(java.util.Properties a0) throws Throwable;
private static native java.util.Iterator __call90_5(java.util.Set a0) throws Throwable;
private static native boolean __call90_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call90_7(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast90_8(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call90_9(java.util.Properties a0, java.lang.String a1) throws Throwable;
private static native boolean __call90_10(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory90_11(boolean value) throws Throwable;
private static native int __integerCategory90_12(boolean value) throws Throwable;
private static native int __call90_13(java.lang.String a0) throws Throwable;
private static native int __call90_14(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic90_15(int a0, long a1) throws Throwable;
private static native void __discardScalar90_17(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic90_18(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic90_20(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native void __call90_21(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic90_22(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic90_24(java.lang.String a0, java.lang.String a1, int a2) throws Throwable;
private static native void __call90_25(java.lang.String a0) throws Throwable;
private static native java.lang.Exception __call1009000_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1009001_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1009002_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1009003_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1009004_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1009005_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1009006_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1009007_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1009008_0(java.lang.NumberFormatException a0) throws Throwable;

}


public static moom.DR b(net.minecraft.world.IBlockAccess p0, double p1, double p2, double p3) {
return moom.Jl.a(((net.minecraft.world.IBlockAccess)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((moom.Jk)(moom.Jl.o)), ((moom.Jj)(moom.Jl.p)));
}


public static moom.DR b(moom.DR p0, net.minecraft.world.World p1, net.minecraft.entity.Entity p2, float p3) {
net.minecraft.entity.Entity[] spill707_0;
    long life4_3;
    int life7_8;
    net.minecraft.entity.Entity[] life6_9;
    net.minecraft.client.Minecraft life8_13;
    forest_join_32: {
    forest_join_29: {
    forest_join_12: {
    life4_3 = (moom.Jl.Z ^ 54006608042853L);
    spill707_0 = moom.JM.b__Arrayr3();
    life7_8 = ((moom.EA)(((net.minecraft.world.World)(p1)).v)).b();
    life6_9 = spill707_0;
    switch (life7_8) {
case 0:
{
        break forest_join_12;
    }
case 1:
{
        break forest_join_29;
    }
default:
{
        break forest_join_32;
    }
}
    }
    life8_13 = net.minecraft.client.Minecraft.a__fM();
    p0 = moom.Jl.a(((moom.DR)(p0)), ((net.minecraft.world.IBlockAccess)(((net.minecraft.client.Minecraft)(life8_13)).I)), ((double)(((net.minecraft.entity.Entity)(p2)).n)), ((double)((((net.minecraft.entity.Entity)(p2)).o + 0x1.0p0d))), ((double)(((net.minecraft.entity.Entity)(p2)).p)));
    if (!((life6_9 == null))) {
        break forest_join_32;
    }
    }
    p0 = moom.Jl.c(((moom.DR)(p0)));
    }
    return p0;
}


public static float[] b(net.minecraft.item.EnumDyeColor p0, float[] p1) {
return moom.Jl.a(((net.minecraft.item.EnumDyeColor)(p0)), ((float[][])(moom.Jl.N)), ((float[])(p1)));
}


private static int[] b(java.util.Properties p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) { return __sourceHandlerCall_a9021ef89ec9de0e46a9(p0, p1, p2, p3); }


public static void b() { __sourceHandlerCall_fc715e57e96577a67949(); }


public static void b(net.minecraft.client.particle.EntityFX p0) { __sourceHandlerCall_bfd723966dce5e473f1e(p0); }


private static moom.DR b(moom.DR p0) { return __sourceHandlerCall_d3ed44e262339207c31d(p0); }


private static moom.DR b(moom.DR p0, net.minecraft.world.IBlockAccess p1, double p2, double p3, double p4) { return __sourceHandlerCall_3e10bc1e4e19c97acc25(p0, p1, p2, p3, p4); }


public static int b(int p0) { return __sourceHandlerCall_da50cbf6e4c6ba019c30(p0); }


private static int b(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x6E5C;
        if (eb[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = db[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])fb.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    fb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Jl", exception);
            }
            int n7 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Jl.eb[n4] = n7;
        }
        return eb[n4];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Jl.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5379_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Jl"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static void b__Void(java.lang.String p0) {
long local1_life2 = (moom.Jl.Z ^ 15849515376463L);
    java.lang.String __stackOp543_5_0 = p0;
    java.lang.String __stackOp543_5_1 = __sourceIntrinsic_d09e7390a875_originalDynamicSite543_4(25058, (5043284923737047812L ^ local1_life2));
    moom.BU.b__Void(((java.lang.String)(__sourceIntrinsic_d09e7390a875_originalDynamicSite543_6(__stackOp543_5_1, __stackOp543_5_0))));
    return;
}


public static int b(int p0, int p1) { return __sourceHandlerCall_7b2e4793bafe3c683e4a(p0, p1); }


private static int b(java.lang.String p0) { return __sourceHandlerCall_27e4f8fd06696f987f2a(p0); }


private static int c(java.lang.String p0) { return __sourceHandlerCall_29c5702f54c09866bd3a(p0); }


public static int c(int p0) { return __sourceHandlerCall_0a8095522b1654c7e901(p0); }


private static void c__Void(java.lang.String p0) {
long local1_life2 = (moom.Jl.Z ^ 8473928217043L);
    java.lang.String __stackOp544_5_0 = p0;
    java.lang.String __stackOp544_5_1 = __sourceIntrinsic_ba232779bc81_originalDynamicSite544_4(17605, (2198572012471240924L ^ local1_life2));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_ba232779bc81_originalDynamicSite544_6(__stackOp544_5_1, __stackOp544_5_0))));
    return;
}


private static moom.DR c(moom.DR p0) { return __sourceHandlerCall_758eff155ec0070d80eb(p0); }


private static int[] c(java.util.Properties p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) { return __sourceHandlerCall_0886e9a8490d12c7b97f(p0, p1, p2, p3); }


public static int d(int p0) { return __sourceHandlerCall_4088863b12bf89f2c504(p0); }


private static int[] d(java.util.Properties p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) { return __sourceHandlerCall_904dabd61dedb79d74ec(p0, p1, p2, p3); }


private static int a(moom.xC p0, net.minecraft.item.ItemStack p1, int p2, int p3) { return __sourceHandlerCall_a3c105a18d6ba8c40607(p0, p1, p2, p3); }


public static int a(net.minecraft.item.ItemStack p0, int p1, int p2) { return __sourceHandlerCall_6bd08d4a804277461707(p0, p1, p2); }


private static void a(moom.Jk p0, java.util.List p1) { __sourceHandlerCall_3cc4b0d1379d0b3d5c2f(p0, p1); }


private static moom.Jk[][] a(java.lang.String[] p0, moom.Jk[] p1, int p2, int p3) { return __sourceHandlerCall_664e70a76a23c94a6e45(p0, p1, p2, p3); }


public static float[] a(net.minecraft.item.EnumDyeColor p0, float[] p1) {
return moom.Jl.a(((net.minecraft.item.EnumDyeColor)(p0)), ((float[][])(moom.Jl.M)), ((float[])(p1)));
}


private static moom.Jk[][] a(java.util.List p0) { return __sourceHandlerCall_b926d168acb9cac9469e(p0); }


private static void a(moom.Jk p0, java.util.List p1, int p2) { __sourceHandlerCall_fd56d66e2d742b9beaad(p0, p1, p2); }


public static int a(int p0, int p1) { return __sourceHandlerCall_1cfca129f8d366901878(p0, p1); }


private static float[] a(net.minecraft.item.EnumDyeColor p0, float[][] p1, float[] p2) { return __sourceHandlerCall_0af02799d8b515a247c0(p0, p1, p2); }


private static float[][] a__ArrayArrayFloat(java.util.Properties p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) { return __sourceHandlerCall_2e25cfacbf39c609de5e(p0, p1, p2, p3); }


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5397_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Jl"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Jl.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 9585);
    if (((moom.Jl.bb)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Jl.cb)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Jl.cb)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Jl", life9_51);
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
        life9_116 = ((java.lang.String)((moom.Jl.ab)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Jl.bb)[life5_8] = moom.Jl.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Jl.bb)[life5_8];
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
        byte[] spill2766_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2766_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2766_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2766_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2766_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2766_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static org.apache.commons.lang3.tuple.Pair<moom.JO[], java.lang.Integer> a() { return __sourceHandlerCall_acadd81eafb45d764159(); }


private static java.lang.String a(java.lang.String p0, java.lang.String p1, java.lang.String[] p2, java.lang.String p3) { return __sourceHandlerCall_52c092533b3fc6dc2e2e(p0, p1, p2, p3); }


public static void a__Void() { __sourceHandlerCall_2c4c61eb565d4739d9f9(); }


private static int[] a__ArrayInt() { return __sourceHandlerCall_94874346f3189f1d97af(); }


private static void a(int[] p0) { __sourceHandlerCall_54334baf4ad0cb343bdf(p0); }


private static moom.Jk[] a__ArrayJk(java.util.Properties p0, java.lang.String p1) { return __sourceHandlerCall_2647e4669ba843a85126(p0, p1); }


private static void a__Void(java.lang.String p0) { __sourceHandlerCall_de2bf1b107b84f915326(p0); }


private static int a(java.lang.String p0, int p1) { return __sourceHandlerCall_b0512a21b3064216539f(p0, p1); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(net.minecraft.block.state.IBlockState p0, int p1) { return __sourceHandlerCall_eff369335605bcbde631(p0, p1); }


public static void a(net.minecraft.client.particle.EntityFX p0, net.minecraft.world.IBlockAccess p1, double p2, double p3, double p4) {
long life8_3;
    net.minecraft.block.state.IBlockState life10_14;
    int life11_22;
    int life12_26;
    int life13_40;
    int life14_54;
    int life15_62;
    float life16_67;
    float life17_72;
    float life18_77;
    life8_3 = (moom.Jl.Z ^ 129661504004891L);
    if ((moom.Jl.s != null)) {
        life10_14 = ((net.minecraft.world.IBlockAccess)(p1)).a__fE(((moom.DT)(new moom.DT(p2, p3, p4))));
        life11_22 = moom.Jl.a(((net.minecraft.block.state.IBlockState)(life10_14)), ((int)(__sourceIntrinsic_74d05e35c191_invokedynamic4487_3(19713, (3775929710178146497L ^ life8_3)))));
        life12_26 = ((moom.Jk)(moom.Jl.s)).a(((int)(life11_22)));
        life13_40 = ((life12_26 >> __sourceIntrinsic_74d05e35c191_invokedynamic4487_7(28699, (2595856414723319255L ^ life8_3))) & __sourceIntrinsic_74d05e35c191_invokedynamic4487_8(9112, (7192385316980848220L ^ life8_3)));
        life14_54 = ((life12_26 >> __sourceIntrinsic_74d05e35c191_invokedynamic4487_9(1157, (2143194733044945230L ^ life8_3))) & __sourceIntrinsic_74d05e35c191_invokedynamic4487_10(9112, (7192385316980848220L ^ life8_3)));
        life15_62 = (life12_26 & __sourceIntrinsic_74d05e35c191_invokedynamic4487_11(9112, (7192385316980848220L ^ life8_3)));
        life16_67 = (((float) life13_40) / 0x1.fep7f);
        life17_72 = (((float) life14_54) / 0x1.fep7f);
        life18_77 = (((float) life15_62) / 0x1.fep7f);
        ((net.minecraft.client.particle.EntityFX)(p0)).b(((float)(life16_67)), ((float)(life17_72)), ((float)(life18_77)));
    }
    return;
}


private static int a(net.minecraft.block.state.IBlockState p0) { return __sourceHandlerCall_0e51f2d43eab1bee967c(p0); }


private static moom.Jk a(java.lang.String p0, java.lang.String[] p1, int p2, int p3) { return __sourceHandlerCall_0aab98e65562a2249cbf(p0, p1, p2, p3); }


public static float a(float p0) { return __sourceHandlerCall_5a67fd17541838d4357e(p0); }


public static int a__Int(float p0) { return __sourceHandlerCall_3110e256191912032428(p0); }


public static int a(int p0) { return __sourceHandlerCall_b8df8bbc293628e3d1bf(p0); }


private static moom.Jk a__Jk(net.minecraft.block.state.IBlockState p0) { return __sourceHandlerCall_6695e00778977801f11c(p0); }


protected static net.minecraft.world.biome.BiomeGenBase a__ES(net.minecraft.world.IBlockAccess p0, moom.DT p1) { return __sourceHandlerCall_ff70a1f54ff8ee6436e7(p0, p1); }


public static int a(moom.lC p0, net.minecraft.block.state.IBlockState p1, net.minecraft.world.IBlockAccess p2, moom.DT p3, moom.Mi p4) { return __sourceHandlerCall_48140d2daa622cfe918a(p0, p1, p2, p3, p4); }


public static moom.Jk a(java.lang.String p0, int p1, int p2) { return __sourceHandlerCall_b3408dd5ca3ff510ceeb(p0, p1, p2); }


private static int a(net.minecraft.block.state.IBlockState p0, net.minecraft.world.IBlockAccess p1, moom.DT p2, moom.Jr p3, moom.DX p4) { return __sourceHandlerCall_0d8a53f830094f4578ba(p0, p1, p2, p3, p4); }


public static int a(net.minecraft.world.IBlockAccess p0, net.minecraft.block.state.IBlockState p1, moom.DT p2, moom.Mi p3) { return __sourceHandlerCall_f3091b7f15ba6e1d8c63(p0, p1, p2, p3); }


public static void a(net.minecraft.client.particle.EntityFX p0) { __sourceHandlerCall_5462ac5fcf442a242987(p0); }


public static boolean a(net.minecraft.world.World p0, float p1, int[] p2, boolean p3, float p4) { return __sourceHandlerCall_174dc6e30df73fc32584(p0, p1, p2, p3, p4); }


private static int a(net.minecraft.block.Block p0, net.minecraft.world.IBlockAccess p1, moom.DT p2, moom.Mi p3) { return __sourceHandlerCall_f26c7b753f7ad21dea38(p0, p1, p2, p3); }


public static moom.DR a(net.minecraft.world.IBlockAccess p0, double p1, double p2, double p3, moom.Jk p4, moom.Jj p5) { return __sourceHandlerCall_a4c061d9b95b7ce170ac(p0, p1, p2, p3, p4, p5); }


private static int a(java.util.Properties p0, java.lang.String p1) { return __sourceHandlerCall_b99ca64143b8dfe82777(p0, p1); }


public static moom.DR a(moom.DR p0, net.minecraft.world.World p1, net.minecraft.entity.Entity p2, float p3) { return __sourceHandlerCall_c6ecd02ddd2807520b03(p0, p1, p2, p3); }


private static int a(java.util.Properties p0, java.lang.String[] p1) { return __sourceHandlerCall_c08f498964f630af487a(p0, p1); }


private static int[] a(java.util.Properties p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) { return __sourceHandlerCall_6dac47ef1fbaa6eb8d41(p0, p1, p2, p3); }


private static moom.DR a__DR(java.util.Properties p0, java.lang.String p1) { return __sourceHandlerCall_948e03de1526ca427182(p0, p1); }


private static moom.DR a(moom.DR p0) { return __sourceHandlerCall_8c12b41fd1a791aaa21f(p0); }


private static int a(net.minecraft.world.IBlockAccess p0, moom.DT p1) { return __sourceHandlerCall_43e951e6a4af2a02bdbb(p0, p1); }


public static void a(net.minecraft.client.particle.EntityFX p0, net.minecraft.world.IBlockAccess p1, double p2, double p3, double p4, moom.Mi p5) { __sourceHandlerCall_19f2d79c4e536a1d396a(p0, p1, p2, p3, p4, p5); }


public static moom.DR a(moom.DR p0, net.minecraft.world.IBlockAccess p1, double p2, double p3, double p4) { return __sourceHandlerCall_76f20c60a632e7032432(p0, p1, p2, p3, p4); }


private static int a(java.lang.String p0) { return __sourceHandlerCall_73482fe5d82eddc8c47c(p0); }


public static moom.DR a(net.minecraft.world.IBlockAccess p0, double p1, double p2, double p3) {
return moom.Jl.a(((net.minecraft.world.IBlockAccess)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((moom.Jk)(moom.Jl.m)), ((moom.Jj)(moom.Jl.n)));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite612_98(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5397_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74d05e35c191_invokedynamic4487_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74d05e35c191_invokedynamic4487_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74d05e35c191_invokedynamic4487_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74d05e35c191_invokedynamic4487_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74d05e35c191_invokedynamic4487_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74d05e35c191_invokedynamic4487_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5379_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d09e7390a875_originalDynamicSite543_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d09e7390a875_originalDynamicSite543_6(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ba232779bc81_originalDynamicSite544_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ba232779bc81_originalDynamicSite544_6(java.lang.String a0, java.lang.String a1) throws E;
}
