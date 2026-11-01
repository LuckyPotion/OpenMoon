package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class bY extends sourcebuild.EnumConstructor<moom.bY> {

public static moom.bY BIOME;

public static moom.bY TEMPERATURE;

public static moom.bY RAINFALL;

public static moom.bY HELD_ITEM_ID;

public static moom.bY HELD_BLOCK_LIGHT_VALUE;

public static moom.bY HELD_ITEM_ID2;

public static moom.bY HELD_BLOCK_LIGHT_VALUE2;

public static moom.bY WORLD_TIME;

public static moom.bY WORLD_DAY;

public static moom.bY MOON_PHASE;

public static moom.bY FRAME_COUNTER;

public static moom.bY FRAME_TIME;

public static moom.bY FRAME_TIME_COUNTER;

public static moom.bY SUN_ANGLE;

public static moom.bY SHADOW_ANGLE;

public static moom.bY RAIN_STRENGTH;

public static moom.bY ASPECT_RATIO;

public static moom.bY VIEW_WIDTH;

public static moom.bY VIEW_HEIGHT;

public static moom.bY NEAR;

public static moom.bY FAR;

public static moom.bY WETNESS;

public static moom.bY EYE_ALTITUDE;

public static moom.bY EYE_BRIGHTNESS;

public static moom.bY TERRAIN_TEXTURE_SIZE;

public static moom.bY TERRRAIN_ICON_SIZE;

public static moom.bY IS_EYE_IN_WATER;

public static moom.bY NIGHT_VISION;

public static moom.bY BLINDNESS;

public static moom.bY SCREEN_BRIGHTNESS;

public static moom.bY HIDE_GUI;

public static moom.bY CENTER_DEPT_SMOOTH;

public static moom.bY ATLAS_SIZE;

public static moom.bY CAMERA_POSITION;

public static moom.bY PREVIOUS_CAMERA_POSITION;

public static moom.bY SUN_POSITION;

public static moom.bY MOON_POSITION;

public static moom.bY SHADOW_LIGHT_POSITION;

public static moom.bY UP_POSITION;

public static moom.bY SKY_COLOR;

public static moom.bY GBUFFER_PROJECTION;

public static moom.bY GBUFFER_PROJECTION_INVERSE;

public static moom.bY GBUFFER_PREVIOUS_PROJECTION;

public static moom.bY GBUFFER_MODEL_VIEW;

public static moom.bY GBUFFER_MODEL_VIEW_INVERSE;

public static moom.bY GBUFFER_PREVIOUS_MODEL_VIEW;

public static moom.bY SHADOW_PROJECTION;

public static moom.bY SHADOW_PROJECTION_INVERSE;

public static moom.bY SHADOW_MODEL_VIEW;

public static moom.bY SHADOW_MODEL_VIEW_INVERSE;

private java.lang.String a;

private moom.Nq b;

private java.lang.String[] c;

private java.lang.String[] d;

private static moom.bY[] e;

private static long f;

private static java.lang.String[] g;

private static java.lang.String[] h;

private static java.util.Map i;

private static long[] j;

private static java.lang.Integer[] k;

private static java.util.Map l;

private bY(java.lang.String p0, int p1, moom.Nq p2, java.lang.String[] p3) { super((java.lang.String)null, 0); __sourceHandlerCall_e8edb6d7fa20e2a804a5(this, p0, p1, p2, p3); }


private bY(java.lang.String p0, int p1, moom.Nq p2) { super((java.lang.String)null, 0); __sourceHandlerCall_46f66163718456613011(this, p0, p1, p2); }


private bY(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);
    this.a = p2;
}


private bY(java.lang.String p0, int p1, moom.Nq p2, java.lang.String[] p3, java.lang.String[] p4) { super((java.lang.String)null, 0); __sourceHandlerCall_d4110d7651f7470f5ad0(this, p0, p1, p2, p3, p4); }


private static void initialize() {
javax.crypto.Cipher forestValue400014_36_0;
    int forestValue400014_36_1;
    javax.crypto.SecretKeyFactory forestValue400014_36_2;
    byte[] forestValue400014_36_3;
    javax.crypto.Cipher forestValue400014_53_0;
    int forestValue400014_53_1;
    javax.crypto.SecretKeyFactory forestValue400014_53_2;
    byte[] forestValue400014_53_3;
    java.lang.String forestValue400014_86_0;
    int forestValue400014_86_1;
    java.lang.String forestValue400014_98_0;
    java.lang.String forestValue400014_122_0;
    javax.crypto.Cipher forestValue400014_182_0;
    int forestValue400014_182_1;
    javax.crypto.SecretKeyFactory forestValue400014_182_2;
    byte[] forestValue400014_182_3;
    javax.crypto.Cipher forestValue400014_199_0;
    int forestValue400014_199_1;
    javax.crypto.SecretKeyFactory forestValue400014_199_2;
    byte[] forestValue400014_199_3;
    long[] forestValue400014_303_0;
    int forestValue400014_303_1;
    long forestValue400014_303_2;
    int forestValue400014_303_3;
    long[] forestValue400014_446_0;
    int forestValue400014_446_1;
    long forestValue400014_446_2;
    long[] forestValue400014_458_0;
    int forestValue400014_458_1;
    long forestValue400014_458_2;
    javax.crypto.Cipher spill400014_0;
    int spill400014_1;
    javax.crypto.SecretKeyFactory spill400014_2;
    byte[] spill400014_3;
    byte[] spill400014_4;
    java.lang.String spill400014_5;
    int spill400014_6;
    java.lang.String spill400014_7;
    java.lang.String[] spill400014_8;
    java.lang.String[] spill400014_9;
    java.lang.String spill400014_10;
    java.lang.String spill400014_11;
    int spill400014_12;
    javax.crypto.Cipher spill400014_13;
    int spill400014_14;
    javax.crypto.SecretKeyFactory spill400014_15;
    byte[] spill400014_16;
    byte[] spill400014_17;
    java.lang.String spill400014_18;
    int spill400014_19;
    int spill400014_20;
    long spill400014_21;
    long spill400014_22;
    int spill400014_23;
    java.lang.String spill400014_24;
    int spill400014_25;
    long[] spill400014_26;
    int spill400014_27;
    long spill400014_28;
    int spill400014_29;
    long life20_11;
    javax.crypto.Cipher life11_20;
    int life12_35;
    java.lang.String[] life18_66;
    int life16_68;
    java.lang.String life15_71;
    int life17_73;
    int life14_75;
    int life13_77;
    byte[] life19_93;
    javax.crypto.Cipher life0_169;
    int life1_184;
    long[] life6_215;
    int life3_217;
    java.lang.String life4_220;
    int life5_222;
    int life2_224;
    byte[] life7_232;
    long life8_309;
    byte[] life10_377;
    byte[] life7_474;
    forest_join_545: {
    forest_join_199: {
    forest_join_153: {
    forest_join_53: {
    f = ((long)(((moom._a)(moom._c.a(((long)(-3923617559408459379L)), ((long)(3676369307023574949L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(76724469252155L)))));
    life20_11 = (moom.bY.f ^ 47563323782634L);
    i = ((java.util.Map)(new java.util.HashMap(13)));
    spill400014_0 = (life11_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill400014_1 = 2;
    spill400014_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp400014_9_0 = new byte[8];
    spill400014_3 = __stackOp400014_9_0;
    (__stackOp400014_9_0)[0] = ((byte) ((int) (life20_11 >>> 56)));
    life12_35 = 1;
    forestValue400014_36_0 = spill400014_0;
    forestValue400014_36_1 = spill400014_1;
    forestValue400014_36_2 = spill400014_2;
    forestValue400014_36_3 = spill400014_3;
    forest_cycle_36: while (true) {
    if (!((life12_35 < 8))) {
        forestValue400014_53_0 = forestValue400014_36_0;
        forestValue400014_53_1 = forestValue400014_36_1;
        forestValue400014_53_2 = forestValue400014_36_2;
        forestValue400014_53_3 = forestValue400014_36_3;
        break forest_join_53;
    }
    byte[] __stackOp400014_10_0 = forestValue400014_36_3;
    spill400014_4 = __stackOp400014_10_0;
    (__stackOp400014_10_0)[life12_35] = ((byte) ((int) ((life20_11 << (life12_35 * 8)) >>> 56)));
    life12_35 += 1;
    forestValue400014_36_3 = spill400014_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue400014_53_0)).init(((int)(forestValue400014_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue400014_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue400014_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life18_66 = new java.lang.String[62];
    life16_68 = 0;
    life17_73 = ((java.lang.String)((life15_71 = "ÿçPÕ¨_®x\"¯éO3aé­Ï\016[Û×\177\026ý)&iô¯(\030i\037\005çö°Ms}\003\023ø\002©âêp¥rµïÀsy\022N\037\026\001\rC(·5Í\030S-¶t¬R õêwIh~É\003ß+Ã;\003_10¯²z;@\nU#\177µ\tî\t-)\031£4¨ëF+í/Å;dH¬4m\\\025f\031\026öÜ·5t\tð\020]\b>\tG£\003>4zê¶e \027xm¾ò\035¥#©\177óPwo\037ô\016Ê£\032 #ä\\ôW×øç\030ÉÕ{ªÆÕ@\026^éþ»Ó\027À\006 ¶(OäòØ\"ã>\002\030Uß8½Ü­a\016XUgyûJÃ{QNí\0052èÛ´W:\030yÿEáUq\035.P}EFÚê?¨\fþ¼f\002=á(µ¢+RÇ«ÂìÚ{Ô[åê¤öùÅt\020ý\025ÌjhOÄPH±MdªFEß\021\177(Ñû\002Þ\016Y½ ÎØï#``W6ÝU?\0071\003\031:G±^àþØå{ã\030v\037|\râ\005oüuP\003Ü­âã·:\027Bg:8==þZÝ\006©$O\b\0333Ìhìä\017AÆ·ýfiÜëri?uëåGÎ\037³«Lj\021þ?²Ê(ØWl\0260\036Z:6¯ÑQ\032ÀÑ)Ò¥«Õ¤¡'îâ!ÕAÂ¼Ï\030\027]èwF® {B¤\016-Ù £O£jÐGGùóh\026A±eiXºêÉÉ¶±øÞd@WÌ0hæ3\rÌLt'xÚðnäùíÄ\177Þ\tO\004\000Ñ\004\\ìX®\021tM{k\021â\037bÝG8t\032\026!\f÷í¼=S³4D\016Q2È|p\020&_åórF#\\¿ë*\001²W NsÃª\006Î9ÓkÉ¹É4Þ@°0ë\003¥\030\032/Ð½\037Î\000Ý?ÛqfÒóåV\002 \013§Y#\033 Wâ\177v%{ò´¢Â\026s\0302ªè¯©°æ;#Ëª\004©É\033Æ\020\017RÈy0zãsÍ¶Óq\\\000\r¸ï\b¢ö\fQQÄ¿£@pKü\b¶iµmÿùrB{\003À^² ¦\006ÞZ\"#FTô\033ý}xRrb\0061T4\\ú\006A®Ðö,K ù¶rMÆ«-\007;É¼~ïT\030¡Z/RíKáÜ£ü¶ì\007Z± ÚíSóýÔ\033æÂ¯=£±$/ÌôeÝ¯ê°$±Õ(ÙWõ@\023¿¸¿J-~6\000`³\030SRÝG)¯u\017x¾Ã\017ä5¨.^òýr(3j/Qà\013l\013n\002²>C°xw 9üÏrÉà:\033)Ê|Ø8\034_cL¥ð\030Ùünt^[\\P\bmS\037km\026ö\"*$¢º(x¾öb Ú|*S#ßë\034ª¨þ/§\021ÛòM?5j0+é¼&_Ñ\035³!Ì\030VQ¹\025q÷hdÉ±µ1Q1î°±ªlÇ½\030â\001fsó¼ÏCtÌLÂ~Tíâ\017ø>\003´(Ôì5w®Þ\"n\021Ó8q{eF<\0217Àvôø^\013ô\013¬ÕÉ¤|T5áeÔÖ8¡ó:`MG\037?7F\177dÈN=\177©ÎáP¸å\035¢\007BkOl¿b-Úªm\025·K`4P\016bv\007Þô²%\020&©±õîgE\r)\002eïw)}è ±ãæí\027.Ë&E\034\002aÙ7|Ó\007^\034Å¾BÔÀ\000\032L\0064\030M+ÎEsIA^´T(\016Zg\027-Z\177Ë\\ ¥Ba_C5]\032¹\005òÄ\0252\007\036éio3BÃÓÚ$¼C(±]\025Æp\001$/nòÇ¾Ô4g\rÚ½\rWù¹á\017Ì\035äâxLÜÑ >»ÍßÝì¥o4âÿ\"¸ãjgIÄg°ñ¾\006Ê>«\020\020¤n\025½¥áì[óÖ\177ÞæÞ á\n\005!Þ[T\020\025¤B\027|i!\016d´J+óP\017à\003ìë+z0»QWãR©\035©yS\001k³!\033ZÊð}:îÄ@àîÕUëoÛy\027Òh]*6éo\030\026ùP \023Z³ù G\020-ã­}\031¾\rà\002N¥¢£~\036À¤T\022[¿PÓ\030\177+njeèÚ÷k/zÄ\027Ý,RuÒr(Ù¤Êb\001;¿Y\1771Oãë´C4­»¬BEåÐ/\022`ÔPg\"Í¾dFÞ\026 \005ªxPÌËÊ@L'{çâ\022@\0340º>¦²\007:¯xçÁÔE^Öð\030ò;Âañ75hÍK^`ÔZKíþ;8æè¶Å\013A7¬[9*RXë9Ñ°=\"¤rU^ú\024ý\030£¾Þx\\§\r¹a%U³ÀG\007\025\021ã`¾}â o,!ôÛ¯'!@T/«fý(øü=G\t)Gù\021Uº0ÒÀ\020LSÕæa}ßæÎ¨c-b¥\036nkÁÔö¼µò\023\003¨Î¾ù¯\0368Û\n\024T¿`^#° `¨[[öø\020ßV\026~$8e\003ñ4Dyª¶\001\bî;»gØ\030 ³\036\t~Ã2Çù¡d3ø5¨7~n\007©äó\025'X­XCí\037ûí é­,fgÅC8-xñÌpÆ!TLÑ×Ò÷Èn±â$\024\030³(èc35ÀÙM\177ogÎÖ\\i\177\bD$ã0<je#J[Îº»Ôî\004&Û5G·\033¤RI¡\r¬\031üº¤\037«\027\017¸íb_k°ÆX 5[Ü(¬«ËøÌÃ½@ÝÄö\027LQJ 3?þÏ\"´\t\017êÉ¾aÏMaÍÇÚ£\020óâRM\000êâ®A²\036qöÖ³\020[,\023\024»<\027C\031vjÔ\fÕù8 Ð&=|È\0072¶NU u¸£½­¥\fâûËUíNÓG3L UòO¶\031Õîim ¦94Ì©yê\005vÉltÒcÏ,ÅOöÒ¥\0030¾²ëXsAºgí&N«¿ðÞ¨a§æW0mÿMäÃxÀÏTÚRn¦Ô\006\007ÞbzJ\030{<@Ã\036t«F\0324\025Øù\017¨íÅM53Q\\"))).length();
    life14_75 = 32;
    life13_77 = -1;
    forest_cycle_78: while (true) {
    forest_join_148: {
    life13_77 += 1;
    spill400014_5 = life15_71;
    int __stackOp400014_14_0 = life13_77;
    forestValue400014_86_0 = ((java.lang.String)(spill400014_5)).substring(((int)(__stackOp400014_14_0)), ((int)((__stackOp400014_14_0 + life14_75))));
    forestValue400014_86_1 = -1;
    forest_cycle_86: while (true) {
    forest_join_139: {
    forest_join_122: {
    forest_join_112: {
    forest_join_98: {
    java.lang.String __stackOp400014_16_0 = forestValue400014_86_0;
    int __stackOp400014_16_1 = forestValue400014_86_1;
    spill400014_6 = __stackOp400014_16_1;
    byte[] __stackOp400014_18_0 = ((java.lang.String)(__stackOp400014_16_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp400014_18_1 = life11_20;
    life19_93 = ((javax.crypto.Cipher)(__stackOp400014_18_1)).doFinal(((byte[])(__stackOp400014_18_0)));
    int __stackOp400014_22_0 = spill400014_6;
    java.lang.String __stackOp400014_22_1 = ((java.lang.String)(moom.bY.a(((byte[])(life19_93))))).intern();
    spill400014_7 = __stackOp400014_22_1;
    switch (__stackOp400014_22_0) {
default:
{
        forestValue400014_98_0 = spill400014_7;
        break forest_join_98;
    }
case 0:
{
        forestValue400014_122_0 = spill400014_7;
        break forest_join_122;
    }
}
    }
    java.lang.String __stackOp400014_23_0 = forestValue400014_98_0;
    java.lang.String[] __stackOp400014_23_1 = life18_66;
    spill400014_8 = __stackOp400014_23_1;
    java.lang.String __stackOp400014_24_0 = __stackOp400014_23_0;
    int __stackOp400014_24_1 = (life16_68++);
    (spill400014_8)[__stackOp400014_24_1] = __stackOp400014_24_0;
    if (!(((life13_77 = (life13_77 + life14_75)) < life17_73))) {
        break forest_join_112;
    }
    break forest_join_148;
    }
    life17_73 = ((java.lang.String)((life15_71 = "õïdç[¯4bR\030º¦Éç\021vÃï\177Y û_\030j}_l¸0¿åóÆN*QHçµw\rÁáÒ£é"))).length();
    life14_75 = 32;
    life13_77 = -1;
    break forest_join_139;
    }
    java.lang.String __stackOp400014_26_0 = forestValue400014_122_0;
    java.lang.String[] __stackOp400014_26_1 = life18_66;
    spill400014_9 = __stackOp400014_26_1;
    java.lang.String __stackOp400014_27_0 = __stackOp400014_26_0;
    int __stackOp400014_27_1 = (life16_68++);
    (spill400014_9)[__stackOp400014_27_1] = __stackOp400014_27_0;
    if (!(((life13_77 = (life13_77 + life14_75)) < life17_73))) {
        break forest_join_153;
    }
    life14_75 = ((int)(((java.lang.String)(life15_71)).charAt(((int)(life13_77)))));
    }
    life13_77 += 1;
    spill400014_10 = life15_71;
    int __stackOp400014_30_0 = life13_77;
    spill400014_11 = ((java.lang.String)(spill400014_10)).substring(((int)(__stackOp400014_30_0)), ((int)((__stackOp400014_30_0 + life14_75))));
    spill400014_12 = 0;
    forestValue400014_86_0 = spill400014_11;
    forestValue400014_86_1 = spill400014_12;
    continue forest_cycle_86;
    }
    }
    life14_75 = ((int)(((java.lang.String)(life15_71)).charAt(((int)(life13_77)))));
    continue forest_cycle_78;
    }
    }
    g = ((java.lang.String[])(life18_66));
    h = ((java.lang.String[])(new java.lang.String[62]));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    spill400014_13 = (life0_169 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill400014_14 = 2;
    spill400014_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp400014_39_0 = new byte[8];
    spill400014_16 = __stackOp400014_39_0;
    (__stackOp400014_39_0)[0] = ((byte) ((int) (life20_11 >>> 56)));
    life1_184 = 1;
    forestValue400014_182_0 = spill400014_13;
    forestValue400014_182_1 = spill400014_14;
    forestValue400014_182_2 = spill400014_15;
    forestValue400014_182_3 = spill400014_16;
    forest_cycle_182: while (true) {
    if (!((life1_184 < 8))) {
        forestValue400014_199_0 = forestValue400014_182_0;
        forestValue400014_199_1 = forestValue400014_182_1;
        forestValue400014_199_2 = forestValue400014_182_2;
        forestValue400014_199_3 = forestValue400014_182_3;
        break forest_join_199;
    }
    byte[] __stackOp400014_40_0 = forestValue400014_182_3;
    spill400014_17 = __stackOp400014_40_0;
    (__stackOp400014_40_0)[life1_184] = ((byte) ((int) ((life20_11 << (life1_184 * 8)) >>> 56)));
    life1_184 += 1;
    forestValue400014_182_3 = spill400014_17;
    continue forest_cycle_182;
    }
    }
    ((javax.crypto.Cipher)(forestValue400014_199_0)).init(((int)(forestValue400014_199_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue400014_199_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue400014_199_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life6_215 = new long[89];
    life3_217 = 0;
    life5_222 = ((java.lang.String)((life4_220 = "á}zagFÿ\"Å©@Ê;¥øã'&·ø4óéËî\020k+å!}v@\017b8ÄÝmdé÷\007'¯\002hiÙÓ±\027;O/¬¿g[¸±<Ê{äK\001_\024ìz.Ë¨xLµs>±¤ât)0%£çÔÍ%Õ^\017\030õD=¡©;\020w#\007MóMTcújäíø2o4³;\006\033t¦Úx]>ôP\017S\036Û-à\013\034$0(\033\n£s=z8áÄ9ònU\033#.áÜE@ rk{@OhµË¹üÝ±º\035urÅ7U9\000\032Àå\003¸Ê¹ñ\000PÏÔ\020øËä®«\022J\nïÌ\021C=+Ñ\027¨_CÕ&\n:Ùµ2³Ö4:P¦\0024¹gä\020G\f/õ(¾è\002\013\0015\003B/0\033Áé\016\003ú\035¢0Å3\032[ÿÛ%LRéëÿLpO~q\033\035}ò\000ö\022\022g®|1{\034d¢üÔEgÝ§D\036®\r¶\023©\033ÄGTuMÅ³Oß½ù\r6ÅÇ\024Ø0>\t¼\001¶Bg³z\\2¼IÓjT[ªtã»H^Sô3\002\000ëK\f\b$ò\b,6ÿpÑÆ\\\034Ý^U ¥ÌÝ Ï+ºÛ\034?d\005wÿ±à\034o\013^Çs\177èà\nú0m*B\030ÿ;Ü@ÒË\002*h\030ÖuÝ\035 9Kx;\026\023%«Vmôù\0166ùÓ k(Ú=%³ÏeÝ  í¾¢\021}YÓ\017\\7,\0353ÀòÈõÛ@B®]E\026ß\n.¯­\000~3\016Ø¢']Æ\017 Á-¦kÝ\027\027AnÊØsÏåÊPìÑ$#Z>\004;ò½ãèQq\022O´wû(\022&!O¯?\r| \t.hVË¼(Ë¾\037fè\025 à\1777p/I·Óeód\005Lë\027]£`FtKæó¥\030!\032x\0347[ÍµãA\003{Á­0M&Äï¡°®³ý\të34"))).length();
    life2_224 = 0;
    forest_cycle_222: while (true) {
    spill400014_18 = life4_220;
    spill400014_19 = life2_224;
    life2_224 += 8;
    life7_232 = ((java.lang.String)(((java.lang.String)(spill400014_18)).substring(((int)(spill400014_19)), ((int)(life2_224))))).getBytes(((java.lang.String)("ISO-8859-1")));
    forestValue400014_303_0 = life6_215;
    forestValue400014_303_1 = (life3_217++);
    forestValue400014_303_2 = (((((((((((long) (life7_232)[0]) & 255L) << 56) | ((((long) (life7_232)[1]) & 255L) << 48)) | ((((long) (life7_232)[2]) & 255L) << 40)) | ((((long) (life7_232)[3]) & 255L) << 32)) | ((((long) (life7_232)[4]) & 255L) << 24)) | ((((long) (life7_232)[5]) & 255L) << 16)) | ((((long) (life7_232)[6]) & 255L) << 8)) | (((long) (life7_232)[7]) & 255L));
    forestValue400014_303_3 = -1;
    forest_cycle_303: while (true) {
    forest_join_463: {
    forest_join_458: {
    forest_join_446: {
    long __stackOp400014_46_0 = forestValue400014_303_2;
    int __stackOp400014_46_1 = forestValue400014_303_3;
    spill400014_20 = __stackOp400014_46_1;
    spill400014_21 = __stackOp400014_46_0;
    recovery.source.CarrierOps.discard(__stackOp400014_46_1);
    life8_309 = spill400014_21;
    byte[] __stackOp400014_48_0 = new byte[] {((byte) ((int) (life8_309 >>> 56))), ((byte) ((int) (life8_309 >>> 48))), ((byte) ((int) (life8_309 >>> 40))), ((byte) ((int) (life8_309 >>> 32))), ((byte) ((int) (life8_309 >>> 24))), ((byte) ((int) (life8_309 >>> 16))), ((byte) ((int) (life8_309 >>> 8))), ((byte) ((int) life8_309))};
    javax.crypto.Cipher __stackOp400014_48_1 = life0_169;
    life10_377 = ((javax.crypto.Cipher)(__stackOp400014_48_1)).doFinal(((byte[])(__stackOp400014_48_0)));
    int __stackOp400014_50_0 = spill400014_20;
    long __stackOp400014_50_1 = (((((((((((long) (life10_377)[0]) & 255L) << 56) | ((((long) (life10_377)[1]) & 255L) << 48)) | ((((long) (life10_377)[2]) & 255L) << 40)) | ((((long) (life10_377)[3]) & 255L) << 32)) | ((((long) (life10_377)[4]) & 255L) << 24)) | ((((long) (life10_377)[5]) & 255L) << 16)) | ((((long) (life10_377)[6]) & 255L) << 8)) | (((long) (life10_377)[7]) & 255L));
    spill400014_22 = __stackOp400014_50_1;
    spill400014_23 = __stackOp400014_50_0;
    recovery.source.CarrierOps.discard(__stackOp400014_50_1);
    switch (spill400014_23) {
default:
{
        forestValue400014_446_0 = forestValue400014_303_0;
        forestValue400014_446_1 = forestValue400014_303_1;
        forestValue400014_446_2 = spill400014_22;
        break forest_join_446;
    }
case 0:
{
        forestValue400014_458_0 = forestValue400014_303_0;
        forestValue400014_458_1 = forestValue400014_303_1;
        forestValue400014_458_2 = spill400014_22;
        break forest_join_458;
    }
}
    }
    (forestValue400014_446_0)[forestValue400014_446_1] = forestValue400014_446_2;
    if (!((life2_224 >= life5_222))) {
        continue forest_cycle_222;
    }
    life5_222 = ((java.lang.String)((life4_220 = "í\fÑf{4G-ãù\020Õ|\024B"))).length();
    life2_224 = 0;
    break forest_join_463;
    }
    (forestValue400014_458_0)[forestValue400014_458_1] = forestValue400014_458_2;
    if (!((life2_224 >= life5_222))) {
        break forest_join_463;
    }
    break forest_join_545;
    }
    spill400014_24 = life4_220;
    spill400014_25 = life2_224;
    life2_224 += 8;
    life7_474 = ((java.lang.String)(((java.lang.String)(spill400014_24)).substring(((int)(spill400014_25)), ((int)(life2_224))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill400014_26 = life6_215;
    spill400014_27 = (life3_217++);
    spill400014_28 = (((((((((((long) (life7_474)[0]) & 255L) << 56) | ((((long) (life7_474)[1]) & 255L) << 48)) | ((((long) (life7_474)[2]) & 255L) << 40)) | ((((long) (life7_474)[3]) & 255L) << 32)) | ((((long) (life7_474)[4]) & 255L) << 24)) | ((((long) (life7_474)[5]) & 255L) << 16)) | ((((long) (life7_474)[6]) & 255L) << 8)) | (((long) (life7_474)[7]) & 255L));
    spill400014_29 = 0;
    forestValue400014_303_0 = spill400014_26;
    forestValue400014_303_1 = spill400014_27;
    forestValue400014_303_2 = spill400014_28;
    forestValue400014_303_3 = spill400014_29;
    continue forest_cycle_303;
    }
    }
    }
    j = ((long[])(life6_215));
    k = ((java.lang.Integer[])(new java.lang.Integer[89]));
    BIOME = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_57(9502, (8702197165009219079L ^ life20_11)), 0, __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_58(6294, (6313531895104115604L ^ life20_11)))));
    TEMPERATURE = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_60(27972, (6389426532716963409L ^ life20_11)), 1, __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_61(36, (4757279171466595117L ^ life20_11)))));
    RAINFALL = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_63(20425, (6210019482518701295L ^ life20_11)), 2, __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_64(13798, (8304213185698152160L ^ life20_11)))));
    HELD_ITEM_ID = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_66(20591, (4060509909750864719L ^ life20_11)), 3, moom.MP.bo)));
    HELD_BLOCK_LIGHT_VALUE = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_69(27969, (6264022812870075979L ^ life20_11)), 4, moom.MP.bp)));
    HELD_ITEM_ID2 = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_72(14707, (8930851972244714066L ^ life20_11)), 5, moom.MP.bq)));
    HELD_BLOCK_LIGHT_VALUE2 = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_75(10838, (3866682260659609932L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_76(27122, (7395942027040420502L ^ life20_11)), moom.MP.br)));
    WORLD_TIME = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_79(31315, (6356084423736783200L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_80(1439, (4135280538986979044L ^ life20_11)), moom.MP.bw)));
    WORLD_DAY = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_83(20536, (4963579739478252323L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_84(14801, (664322086379987645L ^ life20_11)), moom.MP.bx)));
    MOON_PHASE = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_87(19030, (8412519687818068297L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_88(5442, (4941401528390127137L ^ life20_11)), moom.MP.by)));
    FRAME_COUNTER = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_91(11182, (5283149005007003779L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_92(17499, (5408503550898560808L ^ life20_11)), moom.MP.bz)));
    FRAME_TIME = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_95(19043, (4566642419463668063L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_96(15908, (8589681859080037751L ^ life20_11)), moom.MP.bA)));
    FRAME_TIME_COUNTER = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_99(5301, (978081144382365575L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_100(27039, (1135120721397838500L ^ life20_11)), moom.MP.bB)));
    SUN_ANGLE = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_103(32528, (4152513982924190740L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_104(20140, (6659203206666212756L ^ life20_11)), moom.MP.bC)));
    SHADOW_ANGLE = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_107(11045, (1649415242232078360L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_108(17285, (4304607242305263863L ^ life20_11)), moom.MP.bD)));
    RAIN_STRENGTH = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_111(4464, (5098687170368084545L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_112(14745, (8895945180842762927L ^ life20_11)), moom.MP.bE)));
    ASPECT_RATIO = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_115(15775, (4063890814753060531L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_116(15912, (5686649653862114686L ^ life20_11)), moom.MP.bF)));
    VIEW_WIDTH = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_119(17510, (2515664470910586727L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_120(25387, (7383070924608698476L ^ life20_11)), moom.MP.bG)));
    VIEW_HEIGHT = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_123(23246, (6589272216846193121L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_124(12163, (4117769430163764406L ^ life20_11)), moom.MP.bH)));
    NEAR = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_127(31972, (2218231446351574991L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_128(23142, (8243869301113733401L ^ life20_11)), moom.MP.bI)));
    FAR = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_131(5039, (6750436982221478021L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_132(16452, (3009619486097726222L ^ life20_11)), moom.MP.bJ)));
    WETNESS = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_135(19052, (1407896669794287956L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_136(4290, (2350537460340984821L ^ life20_11)), moom.MP.b0)));
    EYE_ALTITUDE = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_139(15180, (5817045381735428200L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_140(14944, (7781767556451246358L ^ life20_11)), moom.MP.b1)));
    EYE_BRIGHTNESS = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_143(12518, (8298012151901207504L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_144(22840, (4521599560047149694L ^ life20_11)), moom.MP.b2, new java.lang.String[] {"x", "y"})));
    TERRAIN_TEXTURE_SIZE = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_147(10657, (4753393578793640612L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_148(13139, (7761595021141977200L ^ life20_11)), moom.MP.b4, new java.lang.String[] {"x", "y"})));
    TERRRAIN_ICON_SIZE = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_151(29518, (6896929741558839369L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_152(32229, (2822699340972222121L ^ life20_11)), moom.MP.b5)));
    IS_EYE_IN_WATER = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_155(16769, (452104054224374456L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_156(21093, (3394199961305925957L ^ life20_11)), moom.MP.b6)));
    NIGHT_VISION = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_159(20671, (6870359396720499632L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_160(20425, (4708899920674247923L ^ life20_11)), moom.MP.b7)));
    BLINDNESS = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_163(6722, (4842812888418062666L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_164(9907, (4475814291478363638L ^ life20_11)), moom.MP.b8)));
    SCREEN_BRIGHTNESS = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_167(31667, (2304103150312681639L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_168(6287, (7439567963576533999L ^ life20_11)), moom.MP.b9)));
    HIDE_GUI = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_171(18759, (7935976363704795732L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_172(2730, (8956969143996354952L ^ life20_11)), moom.MP.b_)));
    CENTER_DEPT_SMOOTH = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_175(23254, (421186261302170058L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_176(15779, (659153015852246679L ^ life20_11)), moom.MP.ca)));
    ATLAS_SIZE = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_179(20229, (650669881355617309L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_180(5290, (7494221454681804785L ^ life20_11)), moom.MP.cb, new java.lang.String[] {"x", "y"})));
    CAMERA_POSITION = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_183(18060, (5102295228394065331L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_184(1057, (1617221486138859264L ^ life20_11)), moom.MP.bP, new java.lang.String[] {"x", "y", "z"})));
    PREVIOUS_CAMERA_POSITION = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_187(24371, (3428321688079946772L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_188(4181, (222879279050427138L ^ life20_11)), moom.MP.bO, new java.lang.String[] {"x", "y", "z"})));
    SUN_POSITION = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_191(29537, (21596016805771388L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_192(24179, (2186547999103534364L ^ life20_11)), moom.MP.bK, new java.lang.String[] {"x", "y", "z"})));
    MOON_POSITION = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_195(24025, (5745674553522149090L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_196(16496, (2755628981011110661L ^ life20_11)), moom.MP.bL, new java.lang.String[] {"x", "y", "z"})));
    SHADOW_LIGHT_POSITION = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_199(2377, (7980841185230848638L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_200(1131, (2878217456467910436L ^ life20_11)), moom.MP.bM, new java.lang.String[] {"x", "y", "z"})));
    UP_POSITION = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_203(1345, (8140403133588606551L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_204(10471, (517759183287694247L ^ life20_11)), moom.MP.bN, new java.lang.String[] {"x", "y", "z"})));
    SKY_COLOR = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_207(6866, (2924799590782439897L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_208(9377, (1675677483060674527L ^ life20_11)), moom.MP.bv, new java.lang.String[] {"r", "g", "b"})));
    GBUFFER_PROJECTION = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_211(11388, (8613412871106668354L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_212(28527, (582170218675729409L ^ life20_11)), moom.MP.bT, new java.lang.String[] {"0", "1", "2", "3"}, new java.lang.String[] {"0", "1", "2", "3"})));
    GBUFFER_PROJECTION_INVERSE = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_215(5444, (247968455720312406L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_216(9531, (1777529383310933534L ^ life20_11)), moom.MP.bU, new java.lang.String[] {"0", "1", "2", "3"}, new java.lang.String[] {"0", "1", "2", "3"})));
    GBUFFER_PREVIOUS_PROJECTION = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_219(12201, (8468830751763571897L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_220(3794, (2600528096879252872L ^ life20_11)), moom.MP.bS, new java.lang.String[] {"0", "1", "2", "3"}, new java.lang.String[] {"0", "1", "2", "3"})));
    GBUFFER_MODEL_VIEW = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_223(22681, (2509130746664965006L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_224(27816, (5522213918617663424L ^ life20_11)), moom.MP.bQ, new java.lang.String[] {"0", "1", "2", "3"}, new java.lang.String[] {"0", "1", "2", "3"})));
    GBUFFER_MODEL_VIEW_INVERSE = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_227(20280, (2544401962016097321L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_228(25175, (2593261230203173225L ^ life20_11)), moom.MP.bR, new java.lang.String[] {"0", "1", "2", "3"}, new java.lang.String[] {"0", "1", "2", "3"})));
    GBUFFER_PREVIOUS_MODEL_VIEW = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_231(26783, (5720666118689481619L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_232(4062, (8269111411758175481L ^ life20_11)), moom.MP.bV, new java.lang.String[] {"0", "1", "2", "3"}, new java.lang.String[] {"0", "1", "2", "3"})));
    SHADOW_PROJECTION = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_235(32286, (2985478212683199760L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_236(16911, (8863923038768027979L ^ life20_11)), moom.MP.bW, new java.lang.String[] {"0", "1", "2", "3"}, new java.lang.String[] {"0", "1", "2", "3"})));
    SHADOW_PROJECTION_INVERSE = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_239(17162, (3243664056678631444L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_240(27623, (6309809676734165146L ^ life20_11)), moom.MP.bX, new java.lang.String[] {"0", "1", "2", "3"}, new java.lang.String[] {"0", "1", "2", "3"})));
    SHADOW_MODEL_VIEW = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_243(6828, (9089745838940918148L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_244(22025, (153790239382523222L ^ life20_11)), moom.MP.bY, new java.lang.String[] {"0", "1", "2", "3"}, new java.lang.String[] {"0", "1", "2", "3"})));
    SHADOW_MODEL_VIEW_INVERSE = ((moom.bY)(new moom.bY(__sourceIntrinsic_eb8803ad1f63_invokedynamic400014_247(17714, (4947494269428026888L ^ life20_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_248(11165, (8900902210660905188L ^ life20_11)), moom.MP.bZ, new java.lang.String[] {"0", "1", "2", "3"}, new java.lang.String[] {"0", "1", "2", "3"})));
    e = ((moom.bY[])(moom.bY.a__ArraybY()));
}

private static native <E extends Throwable> void __sourceHandlerCall_46f66163718456613011(moom.bY a0, java.lang.String a1, int a2, moom.Nq a3) throws E;
private static final class __SourceHandler_46f66163718456613011 {

public static void f200025(moom.bY receiver, java.lang.String p0, int p1, moom.Nq p2) throws Throwable {
    moom.Nq spill200025_0;
    java.lang.Class[] spill200025_1;
    java.lang.Class[] spill200025_2;
    long life4_3;
    life4_3 = (__fieldRead200025_0() ^ 62236226783023L);
    __directSuperInit200025_1(receiver, p0, p1);
    __fieldWrite200025_3(receiver, __call200025_2(p2));
    __fieldWrite200025_4(receiver, p2);
    spill200025_0 = p2;
    java.lang.Class[] __stackOp200025_5_0 = new java.lang.Class[2];
    spill200025_1 = __stackOp200025_5_0;
    (__stackOp200025_5_0)[0] = __classLiteral200025_6();
    java.lang.Class[] __stackOp200025_7_0 = spill200025_1;
    spill200025_2 = __stackOp200025_7_0;
    (__stackOp200025_7_0)[1] = __classLiteral200025_8();
    if ((!__call200025_9(spill200025_0, spill200025_2))) {
        java.lang.Object __inlineStack200025_13Token;
        java.lang.Object __inlineStack200025_15Token;
        throw new java.lang.IllegalArgumentException(__invokedynamic200025_16(__inlineStack200025_13Output0((__inlineStack200025_13Token = __inlineStack200025_13Pack(receiver, __call200025_11(__call200025_10(p2)), __invokedynamic200025_12(27119, (8640167742580805635L ^ life4_3))))), __inlineStack200025_13Output1(__inlineStack200025_13Token), __inlineStack200025_15Output0((__inlineStack200025_15Token = __inlineStack200025_15Pack(__inlineStack200025_13Output2(__inlineStack200025_13Token), __invokedynamic200025_14(5427, (9135763249720503507L ^ life4_3))))), __inlineStack200025_15Output1(__inlineStack200025_15Token)));
    }
    return;
}
private static native long __fieldRead200025_0() throws Throwable;
private static native void __directSuperInit200025_1(moom.bY a0, java.lang.String a1, int a2) throws Throwable;
private static native java.lang.String __call200025_2(moom.Nq a0) throws Throwable;
private static native void __fieldWrite200025_3(moom.bY a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite200025_4(moom.bY a0, moom.Nq a1) throws Throwable;
private static native java.lang.Class __classLiteral200025_6() throws Throwable;
private static native java.lang.Class __classLiteral200025_8() throws Throwable;
private static native boolean __call200025_9(moom.Nq a0, java.lang.Class[] a1) throws Throwable;
private static native java.lang.Class __call200025_10(moom.Nq a0) throws Throwable;
private static native java.lang.String __call200025_11(java.lang.Class a0) throws Throwable;
private static native java.lang.String __invokedynamic200025_12(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack200025_13Pack(moom.bY a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __inlineStack200025_13Output0(java.lang.Object token) throws Throwable;
private static native moom.bY __inlineStack200025_13Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack200025_13Output2(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic200025_14(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack200025_15Pack(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack200025_15Output0(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack200025_15Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic200025_16(java.lang.String a0, moom.bY a1, java.lang.String a2, java.lang.String a3) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e8edb6d7fa20e2a804a5(moom.bY a0, java.lang.String a1, int a2, moom.Nq a3, java.lang.String[] a4) throws E;
private static final class __SourceHandler_e8edb6d7fa20e2a804a5 {

public static void f200026(moom.bY receiver, java.lang.String p0, int p1, moom.Nq p2, java.lang.String[] p3) throws Throwable {
    moom.Nq spill200026_0;
    java.lang.Class[] spill200026_1;
    java.lang.Class[] spill200026_2;
    java.lang.Class[] spill200026_3;
    java.lang.Class[] spill200026_4;
    long life5_3;
    life5_3 = (__fieldRead200026_0() ^ 88263987198784L);
    __directSuperInit200026_1(receiver, p0, p1);
    __fieldWrite200026_3(receiver, __call200026_2(p2));
    __fieldWrite200026_4(receiver, p2);
    __fieldWrite200026_5(receiver, p3);
    spill200026_0 = p2;
    java.lang.Class[] __stackOp200026_6_0 = new java.lang.Class[4];
    spill200026_1 = __stackOp200026_6_0;
    (__stackOp200026_6_0)[0] = __classLiteral200026_7();
    java.lang.Class[] __stackOp200026_8_0 = spill200026_1;
    spill200026_2 = __stackOp200026_8_0;
    (__stackOp200026_8_0)[1] = __classLiteral200026_9();
    java.lang.Class[] __stackOp200026_10_0 = spill200026_2;
    spill200026_3 = __stackOp200026_10_0;
    (__stackOp200026_10_0)[2] = __classLiteral200026_11();
    java.lang.Class[] __stackOp200026_12_0 = spill200026_3;
    spill200026_4 = __stackOp200026_12_0;
    (__stackOp200026_12_0)[3] = __classLiteral200026_13();
    if ((!__call200026_14(spill200026_0, spill200026_4))) {
        java.lang.Object __inlineStack200026_18Token;
        java.lang.Object __inlineStack200026_20Token;
        throw new java.lang.IllegalArgumentException(__invokedynamic200026_21(__inlineStack200026_18Output0((__inlineStack200026_18Token = __inlineStack200026_18Pack(receiver, __call200026_16(__call200026_15(p2)), __invokedynamic200026_17(20998, (2363912291635173295L ^ life5_3))))), __inlineStack200026_18Output1(__inlineStack200026_18Token), __inlineStack200026_20Output0((__inlineStack200026_20Token = __inlineStack200026_20Pack(__inlineStack200026_18Output2(__inlineStack200026_18Token), __invokedynamic200026_19(5019, (5085224458840692255L ^ life5_3))))), __inlineStack200026_20Output1(__inlineStack200026_20Token)));
    }
    return;
}
private static native long __fieldRead200026_0() throws Throwable;
private static native void __directSuperInit200026_1(moom.bY a0, java.lang.String a1, int a2) throws Throwable;
private static native java.lang.String __call200026_2(moom.Nq a0) throws Throwable;
private static native void __fieldWrite200026_3(moom.bY a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite200026_4(moom.bY a0, moom.Nq a1) throws Throwable;
private static native void __fieldWrite200026_5(moom.bY a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.Class __classLiteral200026_7() throws Throwable;
private static native java.lang.Class __classLiteral200026_9() throws Throwable;
private static native java.lang.Class __classLiteral200026_11() throws Throwable;
private static native java.lang.Class __classLiteral200026_13() throws Throwable;
private static native boolean __call200026_14(moom.Nq a0, java.lang.Class[] a1) throws Throwable;
private static native java.lang.Class __call200026_15(moom.Nq a0) throws Throwable;
private static native java.lang.String __call200026_16(java.lang.Class a0) throws Throwable;
private static native java.lang.String __invokedynamic200026_17(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack200026_18Pack(moom.bY a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __inlineStack200026_18Output0(java.lang.Object token) throws Throwable;
private static native moom.bY __inlineStack200026_18Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack200026_18Output2(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic200026_19(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack200026_20Pack(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack200026_20Output0(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack200026_20Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic200026_21(java.lang.String a0, moom.bY a1, java.lang.String a2, java.lang.String a3) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d4110d7651f7470f5ad0(moom.bY a0, java.lang.String a1, int a2, moom.Nq a3, java.lang.String[] a4, java.lang.String[] a5) throws E;
private static final class __SourceHandler_d4110d7651f7470f5ad0 {

public static void f200027(moom.bY receiver, java.lang.String p0, int p1, moom.Nq p2, java.lang.String[] p3, java.lang.String[] p4) throws Throwable {
    moom.Nq spill200027_0;
    java.lang.Class[] spill200027_1;
    long life6_3;
    life6_3 = (__fieldRead200027_0() ^ 107330039060523L);
    __directSuperInit200027_1(receiver, p0, p1);
    __fieldWrite200027_3(receiver, __call200027_2(p2));
    __fieldWrite200027_4(receiver, p2);
    __fieldWrite200027_5(receiver, p3);
    __fieldWrite200027_6(receiver, p4);
    spill200027_0 = p2;
    java.lang.Class[] __stackOp200027_7_0 = new java.lang.Class[1];
    spill200027_1 = __stackOp200027_7_0;
    (__stackOp200027_7_0)[0] = __classLiteral200027_8();
    if ((!__call200027_9(spill200027_0, spill200027_1))) {
        java.lang.Object __inlineStack200027_13Token;
        java.lang.Object __inlineStack200027_15Token;
        throw new java.lang.IllegalArgumentException(__invokedynamic200027_16(__inlineStack200027_13Output0((__inlineStack200027_13Token = __inlineStack200027_13Pack(receiver, __call200027_11(__call200027_10(p2)), __invokedynamic200027_12(20998, (2363963671947277508L ^ life6_3))))), __inlineStack200027_13Output1(__inlineStack200027_13Token), __inlineStack200027_15Output0((__inlineStack200027_15Token = __inlineStack200027_15Pack(__inlineStack200027_13Output2(__inlineStack200027_13Token), __invokedynamic200027_14(5019, (5085242828260619636L ^ life6_3))))), __inlineStack200027_15Output1(__inlineStack200027_15Token)));
    }
    return;
}
private static native long __fieldRead200027_0() throws Throwable;
private static native void __directSuperInit200027_1(moom.bY a0, java.lang.String a1, int a2) throws Throwable;
private static native java.lang.String __call200027_2(moom.Nq a0) throws Throwable;
private static native void __fieldWrite200027_3(moom.bY a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite200027_4(moom.bY a0, moom.Nq a1) throws Throwable;
private static native void __fieldWrite200027_5(moom.bY a0, java.lang.String[] a1) throws Throwable;
private static native void __fieldWrite200027_6(moom.bY a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.Class __classLiteral200027_8() throws Throwable;
private static native boolean __call200027_9(moom.Nq a0, java.lang.Class[] a1) throws Throwable;
private static native java.lang.Class __call200027_10(moom.Nq a0) throws Throwable;
private static native java.lang.String __call200027_11(java.lang.Class a0) throws Throwable;
private static native java.lang.String __invokedynamic200027_12(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack200027_13Pack(moom.bY a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __inlineStack200027_13Output0(java.lang.Object token) throws Throwable;
private static native moom.bY __inlineStack200027_13Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack200027_13Output2(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic200027_14(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack200027_15Pack(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack200027_15Output0(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack200027_15Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic200027_16(java.lang.String a0, moom.bY a1, java.lang.String a2, java.lang.String a3) throws Throwable;

}

private static native <E extends Throwable> float __sourceHandlerCall_fd6a6408f12dada12f3b(moom.bY a0, int a1, int a2) throws E;
private static final class __SourceHandler_fd6a6408f12dada12f3b {

public static float f136(moom.bY receiver, int p0, int p1) throws Throwable {
    int forwardValue136_16_0;
    java.lang.String[] forwardValue136_22_0;
    int forwardValue136_28_0;
    int forwardValue136_38_0;
    net.minecraft.world.biome.BiomeGenBase forwardValue136_62_0;
    float forwardValue136_66_0;
    net.minecraft.world.biome.BiomeGenBase forwardValue136_78_0;
    float forwardValue136_81_0;
    int forwardValue136_85_0;
    int forwardValue136_96_0;
    int forwardValue136_108_0;
    int forwardValue136_122_0;
    int forwardValue136_135_0;
    int forwardValue136_148_0;
    int forwardValue136_163_0;
    moom.Nq forwardValue136_166_0;
    java.lang.String[] spill136_0;
    int spill136_1;
    int spill136_2;
    net.minecraft.world.biome.BiomeGenBase spill136_3;
    net.minecraft.world.biome.BiomeGenBase spill136_4;
    moom.Nq spill136_5;
    java.lang.String spill136_6;
    moom.bY spill136_7;
    int spill136_8;
    java.lang.String spill136_9;
    moom.bY spill136_10;
    int spill136_11;
    long life3_3;
    java.lang.String life5_5;
    moom.DT life6_68;
    net.minecraft.world.biome.BiomeGenBase life7_72;
    moom.DT life8_78;
    net.minecraft.world.biome.BiomeGenBase life9_82;
    moom.DT life10_97;
    net.minecraft.world.biome.BiomeGenBase life11_101;
    forward_join_202: {
    forward_join_183: {
    forward_join_171: {
    forward_join_166: {
    forward_join_163: {
    forward_join_158: {
    forward_join_148: {
    forward_join_145: {
    forward_join_135: {
    forward_join_132: {
    forward_join_122: {
    forward_join_119: {
    forward_join_108: {
    forward_join_105: {
    forward_join_96: {
    forward_join_93: {
    forward_join_85: {
    forward_join_82: {
    forward_join_81: {
    forward_join_80: {
    forward_join_78: {
    forward_join_67: {
    forward_join_66: {
    forward_join_65: {
    forward_join_62: {
    forward_join_51: {
    forward_join_41: {
    forward_join_38: {
    forward_join_34: {
    forward_join_28: {
    forward_join_22: {
    forward_join_20: {
    forward_join_16: {
    life3_3 = (__fieldRead136_0() ^ 4652303992312L);
    life5_5 = __call136_1();
    spill136_0 = __fieldRead136_2(receiver);
    if (!((life5_5 != null))) {
        forwardValue136_22_0 = spill136_0;
        break forward_join_22;
    }
    if (!((spill136_0 != null))) {
        break forward_join_20;
    }
    spill136_1 = p0;
    if (!((life5_5 != null))) {
        forwardValue136_16_0 = spill136_1;
        break forward_join_16;
    }
    if (!((spill136_1 >= 0))) {
        break forward_join_202;
    }
    forwardValue136_16_0 = p0;
    }
    if (!((forwardValue136_16_0 <= (__fieldRead136_3(receiver)).length))) {
        break forward_join_202;
    }
    }
    forwardValue136_22_0 = __fieldRead136_4(receiver);
    }
    if (!((forwardValue136_22_0 != null))) {
        break forward_join_34;
    }
    spill136_2 = p1;
    if (!((life5_5 != null))) {
        forwardValue136_28_0 = spill136_2;
        break forward_join_28;
    }
    if (!((spill136_2 >= 0))) {
        break forward_join_183;
    }
    forwardValue136_28_0 = p1;
    }
    if (!((life5_5 != null))) {
        forwardValue136_38_0 = forwardValue136_28_0;
        break forward_join_38;
    }
    if (!((forwardValue136_28_0 <= (__fieldRead136_5(receiver)).length))) {
        break forward_join_183;
    }
    }
    forwardValue136_38_0 = (__fieldRead136_6())[__call136_7(receiver)];
    }
    if (!((life5_5 != null))) {
        forwardValue136_85_0 = forwardValue136_38_0;
        break forward_join_85;
    }
    switch (forwardValue136_38_0) {
case 1:
{
        break forward_join_41;
    }
case 2:
{
        break forward_join_51;
    }
case 3:
{
        break forward_join_67;
    }
default:
{
        break forward_join_82;
    }
}
    }
    life6_68 = __call136_8();
    life7_72 = __call136_10(__call136_9(), life6_68);
    return ((float) __fieldRead136_11(life7_72));
    }
    life8_78 = __call136_12();
    life9_82 = __call136_14(__call136_13(), life8_78);
    spill136_3 = life9_82;
    if (!((life5_5 != null))) {
        forwardValue136_62_0 = spill136_3;
        break forward_join_62;
    }
    if (!((spill136_3 != null))) {
        break forward_join_65;
    }
    forwardValue136_62_0 = life9_82;
    }
    forwardValue136_66_0 = __call136_15(forwardValue136_62_0, life8_78);
    break forward_join_66;
    }
    forwardValue136_66_0 = 0x0.0p0f;
    }
    return forwardValue136_66_0;
    }
    life10_97 = __call136_16();
    life11_101 = __call136_18(__call136_17(), life10_97);
    spill136_4 = life11_101;
    if (!((life5_5 != null))) {
        forwardValue136_78_0 = spill136_4;
        break forward_join_78;
    }
    if (!((spill136_4 != null))) {
        break forward_join_80;
    }
    forwardValue136_78_0 = life11_101;
    }
    forwardValue136_81_0 = __call136_19(forwardValue136_78_0);
    break forward_join_81;
    }
    forwardValue136_81_0 = 0x0.0p0f;
    }
    return forwardValue136_81_0;
    }
    forwardValue136_85_0 = __instanceOf136_21(__fieldRead136_20(receiver));
    }
    if (!((life5_5 != null))) {
        forwardValue136_96_0 = forwardValue136_85_0;
        break forward_join_96;
    }
    if (!((forwardValue136_85_0 != 0))) {
        break forward_join_93;
    }
    return __call136_24(__cast136_23(__fieldRead136_22(receiver)));
    }
    forwardValue136_96_0 = __instanceOf136_26(__fieldRead136_25(receiver));
    }
    if (!((life5_5 != null))) {
        forwardValue136_108_0 = forwardValue136_96_0;
        break forward_join_108;
    }
    if (!((forwardValue136_96_0 != 0))) {
        break forward_join_105;
    }
    return ((float) __call136_29(__cast136_28(__fieldRead136_27(receiver))));
    }
    forwardValue136_108_0 = __instanceOf136_31(__fieldRead136_30(receiver));
    }
    if (!((life5_5 != null))) {
        forwardValue136_122_0 = forwardValue136_108_0;
        break forward_join_122;
    }
    if (!((forwardValue136_108_0 != 0))) {
        break forward_join_119;
    }
    return ((float) (__call136_34(__cast136_33(__fieldRead136_32(receiver))))[p0]);
    }
    forwardValue136_122_0 = __instanceOf136_36(__fieldRead136_35(receiver));
    }
    if (!((life5_5 != null))) {
        forwardValue136_135_0 = forwardValue136_122_0;
        break forward_join_135;
    }
    if (!((forwardValue136_122_0 != 0))) {
        break forward_join_132;
    }
    return (__call136_39(__cast136_38(__fieldRead136_37(receiver))))[p0];
    }
    forwardValue136_135_0 = __instanceOf136_41(__fieldRead136_40(receiver));
    }
    if (!((life5_5 != null))) {
        forwardValue136_148_0 = forwardValue136_135_0;
        break forward_join_148;
    }
    if (!((forwardValue136_135_0 != 0))) {
        break forward_join_145;
    }
    return (__call136_44(__cast136_43(__fieldRead136_42(receiver))))[p0];
    }
    forwardValue136_148_0 = __instanceOf136_46(__fieldRead136_45(receiver));
    }
    if (!((life5_5 != null))) {
        forwardValue136_163_0 = forwardValue136_148_0;
        break forward_join_163;
    }
    if (!((forwardValue136_148_0 != 0))) {
        break forward_join_158;
    }
    return (__call136_49(__cast136_48(__fieldRead136_47(receiver))))[p0];
    }
    spill136_5 = __fieldRead136_50(receiver);
    if (!((life5_5 != null))) {
        forwardValue136_166_0 = spill136_5;
        break forward_join_166;
    }
    forwardValue136_163_0 = __instanceOf136_51(spill136_5);
    }
    if (!((forwardValue136_163_0 != 0))) {
        break forward_join_171;
    }
    forwardValue136_166_0 = __fieldRead136_52(receiver);
    }
    return __call136_54(__cast136_53(forwardValue136_166_0), p0, p1);
    }
    java.lang.Object __inlineStack136_56Token;
    throw new java.lang.IllegalArgumentException(__invokedynamic136_57(__inlineStack136_56Output0((__inlineStack136_56Token = __inlineStack136_56Pack(receiver, __invokedynamic136_55(16654, (3115779018289723932L ^ life3_3))))), __inlineStack136_56Output1(__inlineStack136_56Token)));
    }
    moom.bY __stackOp136_59_0 = receiver;
    int __stackOp136_59_1 = p1;
    java.lang.String __stackOp136_59_2 = __invokedynamic136_58(13311, (1376357491063671005L ^ life3_3));
    spill136_6 = __stackOp136_59_2;
    spill136_7 = __stackOp136_59_0;
    spill136_8 = __stackOp136_59_1;
    __discardScalar136_60(__stackOp136_59_2);
    int __stackOp136_62_0 = spill136_8;
    java.lang.String __stackOp136_62_1 = __invokedynamic136_61(32258, (8240856965226792228L ^ life3_3));
    __call136_64(__invokedynamic136_63(spill136_6, spill136_7, __stackOp136_62_1, __stackOp136_62_0));
    return 0x0.0p0f;
    }
    moom.bY __stackOp136_66_0 = receiver;
    int __stackOp136_66_1 = p0;
    java.lang.String __stackOp136_66_2 = __invokedynamic136_65(11891, (8930672526292243820L ^ life3_3));
    spill136_9 = __stackOp136_66_2;
    spill136_10 = __stackOp136_66_0;
    spill136_11 = __stackOp136_66_1;
    __discardScalar136_67(__stackOp136_66_2);
    int __stackOp136_69_0 = spill136_11;
    java.lang.String __stackOp136_69_1 = __invokedynamic136_68(23794, (8815284160915023829L ^ life3_3));
    __call136_71(__invokedynamic136_70(spill136_9, spill136_10, __stackOp136_69_1, __stackOp136_69_0));
    return 0x0.0p0f;
}
private static native long __fieldRead136_0() throws Throwable;
private static native java.lang.String __call136_1() throws Throwable;
private static native java.lang.String[] __fieldRead136_2(moom.bY a0) throws Throwable;
private static native java.lang.String[] __fieldRead136_3(moom.bY a0) throws Throwable;
private static native java.lang.String[] __fieldRead136_4(moom.bY a0) throws Throwable;
private static native java.lang.String[] __fieldRead136_5(moom.bY a0) throws Throwable;
private static native int[] __fieldRead136_6() throws Throwable;
private static native int __call136_7(moom.bY a0) throws Throwable;
private static native moom.DT __call136_8() throws Throwable;
private static native net.minecraft.world.World __call136_9() throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __call136_10(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __fieldRead136_11(net.minecraft.world.biome.BiomeGenBase a0) throws Throwable;
private static native moom.DT __call136_12() throws Throwable;
private static native net.minecraft.world.World __call136_13() throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __call136_14(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native float __call136_15(net.minecraft.world.biome.BiomeGenBase a0, moom.DT a1) throws Throwable;
private static native moom.DT __call136_16() throws Throwable;
private static native net.minecraft.world.World __call136_17() throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __call136_18(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native float __call136_19(net.minecraft.world.biome.BiomeGenBase a0) throws Throwable;
private static native moom.Nq __fieldRead136_20(moom.bY a0) throws Throwable;
private static native int __instanceOf136_21(moom.Nq a0) throws Throwable;
private static native moom.Nq __fieldRead136_22(moom.bY a0) throws Throwable;
private static native moom.Nr __cast136_23(moom.Nq a0) throws Throwable;
private static native float __call136_24(moom.Nr a0) throws Throwable;
private static native moom.Nq __fieldRead136_25(moom.bY a0) throws Throwable;
private static native int __instanceOf136_26(moom.Nq a0) throws Throwable;
private static native moom.Nq __fieldRead136_27(moom.bY a0) throws Throwable;
private static native moom.Ns __cast136_28(moom.Nq a0) throws Throwable;
private static native int __call136_29(moom.Ns a0) throws Throwable;
private static native moom.Nq __fieldRead136_30(moom.bY a0) throws Throwable;
private static native int __instanceOf136_31(moom.Nq a0) throws Throwable;
private static native moom.Nq __fieldRead136_32(moom.bY a0) throws Throwable;
private static native moom.Nu __cast136_33(moom.Nq a0) throws Throwable;
private static native int[] __call136_34(moom.Nu a0) throws Throwable;
private static native moom.Nq __fieldRead136_35(moom.bY a0) throws Throwable;
private static native int __instanceOf136_36(moom.Nq a0) throws Throwable;
private static native moom.Nq __fieldRead136_37(moom.bY a0) throws Throwable;
private static native moom.Nt __cast136_38(moom.Nq a0) throws Throwable;
private static native float[] __call136_39(moom.Nt a0) throws Throwable;
private static native moom.Nq __fieldRead136_40(moom.bY a0) throws Throwable;
private static native int __instanceOf136_41(moom.Nq a0) throws Throwable;
private static native moom.Nq __fieldRead136_42(moom.bY a0) throws Throwable;
private static native moom.Nv __cast136_43(moom.Nq a0) throws Throwable;
private static native float[] __call136_44(moom.Nv a0) throws Throwable;
private static native moom.Nq __fieldRead136_45(moom.bY a0) throws Throwable;
private static native int __instanceOf136_46(moom.Nq a0) throws Throwable;
private static native moom.Nq __fieldRead136_47(moom.bY a0) throws Throwable;
private static native moom.Nw __cast136_48(moom.Nq a0) throws Throwable;
private static native float[] __call136_49(moom.Nw a0) throws Throwable;
private static native moom.Nq __fieldRead136_50(moom.bY a0) throws Throwable;
private static native int __instanceOf136_51(moom.Nq a0) throws Throwable;
private static native moom.Nq __fieldRead136_52(moom.bY a0) throws Throwable;
private static native moom.Ny __cast136_53(moom.Nq a0) throws Throwable;
private static native float __call136_54(moom.Ny a0, int a1, int a2) throws Throwable;
private static native java.lang.String __invokedynamic136_55(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack136_56Pack(moom.bY a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack136_56Output0(java.lang.Object token) throws Throwable;
private static native moom.bY __inlineStack136_56Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic136_57(java.lang.String a0, moom.bY a1) throws Throwable;
private static native java.lang.String __invokedynamic136_58(int a0, long a1) throws Throwable;
private static native void __discardScalar136_60(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic136_61(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic136_63(java.lang.String a0, moom.bY a1, java.lang.String a2, int a3) throws Throwable;
private static native void __call136_64(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic136_65(int a0, long a1) throws Throwable;
private static native void __discardScalar136_67(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic136_68(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic136_70(java.lang.String a0, moom.bY a1, java.lang.String a2, int a3) throws Throwable;
private static native void __call136_71(java.lang.String a0) throws Throwable;

}


public static moom.bY[] values() {
return ((moom.bY[])(((moom.bY[])(moom.bY.e)).clone()));
}


public static moom.bY valueOf(java.lang.String p0) {
return ((moom.bY)(java.lang.Enum.valueOf(((java.lang.Class)(moom.bY.class)), ((java.lang.String)(p0)))));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6965_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/bY"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.bY.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 10209;
      if (k[var3] == null) {
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
         long var5 = j[var3];
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
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/bY", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
}


public java.lang.String[] b() {
return this.d;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6966_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/bY"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = __sourceExactCall_6ffbd9aeb93d8f(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 14223);
    if (((moom.bY.h)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.bY.i)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.bY.i)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/bY", life9_51);
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
        life9_116 = ((java.lang.String)((moom.bY.g)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.bY.h)[life5_8] = moom.bY.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.bY.h)[life5_8];
}


public moom.Nq a__Nq() {
return this.b;
}


public java.lang.String a() {
return this.a;
}


private static boolean a(java.lang.Object p0, java.lang.Class[] p1) {
long life2_3;
    java.lang.Class life4_8;
    java.lang.Class[] life5_10;
    int life6_13;
    int life7_15;
    java.lang.Class life8_22;
    life2_3 = (moom.bY.f ^ 5109973194255L);
    if ((p0 != null)) {
        life4_8 = ((java.lang.Object)(p0)).getClass();
        life5_10 = p1;
        life6_13 = (life5_10).length;
        life7_15 = 0;
        loop_region_16: while ((life7_15 < life6_13)) {
        life8_22 = (life5_10)[life7_15];
        if (((java.lang.Class)(life8_22)).isAssignableFrom(((java.lang.Class)(life4_8)))) {
        return true;
    }
        life7_15 += 1;
    }
    }
    return false;
}


public float a(int p0, int p1) { return __sourceHandlerCall_fd6a6408f12dada12f3b(this, p0, p1); }


private static moom.bY[] a__ArraybY() {
long local0_life1 = (moom.bY.f ^ 126771016571946L);
    moom.bY[] __sourceSharedArray769_4 = new moom.bY[__sourceIntrinsic_1734e138d344_originalDynamicSite769_2(28561, (932438096807648634L ^ local0_life1))];
    __sourceSharedArray769_4[0] = moom.bY.BIOME;
    __sourceSharedArray769_4[1] = moom.bY.TEMPERATURE;
    __sourceSharedArray769_4[2] = moom.bY.RAINFALL;
    __sourceSharedArray769_4[3] = moom.bY.HELD_ITEM_ID;
    __sourceSharedArray769_4[4] = moom.bY.HELD_BLOCK_LIGHT_VALUE;
    __sourceSharedArray769_4[5] = moom.bY.HELD_ITEM_ID2;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_10(3992, (5182109265439079707L ^ local0_life1))] = moom.bY.HELD_BLOCK_LIGHT_VALUE2;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_12(3951, (5188464659669204465L ^ local0_life1))] = moom.bY.WORLD_TIME;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_14(26949, (1000563363920927715L ^ local0_life1))] = moom.bY.WORLD_DAY;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_16(23205, (8659751287220987904L ^ local0_life1))] = moom.bY.MOON_PHASE;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_18(16070, (8679896815903116359L ^ local0_life1))] = moom.bY.FRAME_COUNTER;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_20(1404, (4972765378053158808L ^ local0_life1))] = moom.bY.FRAME_TIME;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_22(9343, (9001383232676173550L ^ local0_life1))] = moom.bY.FRAME_TIME_COUNTER;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_24(30326, (3408651317013398667L ^ local0_life1))] = moom.bY.SUN_ANGLE;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_26(21000, (8313669372302123186L ^ local0_life1))] = moom.bY.SHADOW_ANGLE;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_28(4130, (1339053122630722234L ^ local0_life1))] = moom.bY.RAIN_STRENGTH;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_30(9829, (918574001557640398L ^ local0_life1))] = moom.bY.ASPECT_RATIO;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_32(22773, (1523815299848989308L ^ local0_life1))] = moom.bY.VIEW_WIDTH;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_34(16789, (4556017152621310743L ^ local0_life1))] = moom.bY.VIEW_HEIGHT;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_36(11658, (771969620982112058L ^ local0_life1))] = moom.bY.NEAR;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_38(24580, (3905726154611643020L ^ local0_life1))] = moom.bY.FAR;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_40(21761, (6862762630575515633L ^ local0_life1))] = moom.bY.WETNESS;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_42(17645, (5252813215004816985L ^ local0_life1))] = moom.bY.EYE_ALTITUDE;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_44(8635, (37696080403665681L ^ local0_life1))] = moom.bY.EYE_BRIGHTNESS;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_46(9322, (3050827703621031571L ^ local0_life1))] = moom.bY.TERRAIN_TEXTURE_SIZE;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_48(5209, (7638381531001726655L ^ local0_life1))] = moom.bY.TERRRAIN_ICON_SIZE;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_50(5121, (341271458242995954L ^ local0_life1))] = moom.bY.IS_EYE_IN_WATER;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_52(32212, (8414390699067133766L ^ local0_life1))] = moom.bY.NIGHT_VISION;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_54(6913, (156968578540481011L ^ local0_life1))] = moom.bY.BLINDNESS;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_56(16882, (2058565208798130957L ^ local0_life1))] = moom.bY.SCREEN_BRIGHTNESS;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_58(8611, (6436936554321318702L ^ local0_life1))] = moom.bY.HIDE_GUI;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_60(26713, (1471890256202619646L ^ local0_life1))] = moom.bY.CENTER_DEPT_SMOOTH;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_62(8474, (4803041211309560760L ^ local0_life1))] = moom.bY.ATLAS_SIZE;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_64(12279, (5419101346392939886L ^ local0_life1))] = moom.bY.CAMERA_POSITION;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_66(32556, (214195360121933213L ^ local0_life1))] = moom.bY.PREVIOUS_CAMERA_POSITION;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_68(29874, (9113183654862505550L ^ local0_life1))] = moom.bY.SUN_POSITION;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_70(21973, (8173525503383955305L ^ local0_life1))] = moom.bY.MOON_POSITION;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_72(10916, (1056286995544119352L ^ local0_life1))] = moom.bY.SHADOW_LIGHT_POSITION;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_74(14444, (4282390925523028721L ^ local0_life1))] = moom.bY.UP_POSITION;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_76(159, (7232248061162435126L ^ local0_life1))] = moom.bY.SKY_COLOR;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_78(25472, (6602754326760411505L ^ local0_life1))] = moom.bY.GBUFFER_PROJECTION;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_80(28471, (8189415157952535970L ^ local0_life1))] = moom.bY.GBUFFER_PROJECTION_INVERSE;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_82(12903, (4882627233298645215L ^ local0_life1))] = moom.bY.GBUFFER_PREVIOUS_PROJECTION;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_84(18988, (9198782926827714715L ^ local0_life1))] = moom.bY.GBUFFER_MODEL_VIEW;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_86(184, (2875647903312720428L ^ local0_life1))] = moom.bY.GBUFFER_MODEL_VIEW_INVERSE;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_88(3999, (6883829916220603698L ^ local0_life1))] = moom.bY.GBUFFER_PREVIOUS_MODEL_VIEW;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_90(16711, (4535775631626761175L ^ local0_life1))] = moom.bY.SHADOW_PROJECTION;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_92(2264, (6315759954697894483L ^ local0_life1))] = moom.bY.SHADOW_PROJECTION_INVERSE;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_94(5497, (2656613491225077751L ^ local0_life1))] = moom.bY.SHADOW_MODEL_VIEW;
    __sourceSharedArray769_4[__sourceIntrinsic_1734e138d344_originalDynamicSite769_96(1188, (5678165074160662021L ^ local0_life1))] = moom.bY.SHADOW_MODEL_VIEW_INVERSE;
    return __sourceSharedArray769_4;
}


public java.lang.String[] a__ArrayString() {
return this.c;
}


private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
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
        byte[] spill3532_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3532_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3532_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3532_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3532_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3532_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_57(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_58(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_60(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_61(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_63(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_64(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_66(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_69(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_72(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_76(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_80(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_84(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_87(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_88(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_92(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_96(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_99(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_100(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_104(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_108(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_112(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_115(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_116(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_119(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_120(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_123(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_124(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_127(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_128(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_131(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_132(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_135(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_136(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_139(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_140(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_143(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_144(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_147(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_148(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_151(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_152(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_155(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_156(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_159(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_160(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_163(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_164(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_167(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_168(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_171(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_172(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_175(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_176(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_179(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_180(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_183(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_184(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_187(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_188(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_191(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_192(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_195(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_196(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_199(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_200(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_203(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_204(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_207(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_208(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_211(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_212(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_215(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_216(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_219(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_220(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_223(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_224(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_227(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_228(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_231(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_232(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_235(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_236(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_239(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_240(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_243(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_244(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_247(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400014_248(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_146300b53d7f_invokedynamic200025_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ef123f848c4c_invokedynamic200026_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_126870df6f7a_invokedynamic200027_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cacc4c2e1646_invokedynamic136_55(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6966_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_88(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_92(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1734e138d344_originalDynamicSite769_96(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6965_0() throws E;

private static native java.lang.String __sourceExactCall_6ffbd9aeb93d8f(int p0, long p1);
}
