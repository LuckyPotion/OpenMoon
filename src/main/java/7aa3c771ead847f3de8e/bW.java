package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class bW extends sourcebuild.EnumConstructor<moom.bW> {

public static moom.bW ANTIALIASING;

public static moom.bW NORMAL_MAP;

public static moom.bW SPECULAR_MAP;

public static moom.bW RENDER_RES_MUL;

public static moom.bW SHADOW_RES_MUL;

public static moom.bW HAND_DEPTH_MUL;

public static moom.bW CLOUD_SHADOW;

public static moom.bW OLD_HAND_LIGHT;

public static moom.bW OLD_LIGHTING;

public static moom.bW SHADER_PACK;

public static moom.bW TWEAK_BLOCK_DAMAGE;

public static moom.bW SHADOW_CLIP_FRUSTRUM;

public static moom.bW TEX_MIN_FIL_B;

public static moom.bW TEX_MIN_FIL_N;

public static moom.bW TEX_MIN_FIL_S;

public static moom.bW TEX_MAG_FIL_B;

public static moom.bW TEX_MAG_FIL_N;

public static moom.bW TEX_MAG_FIL_S;

private java.lang.String a;

private java.lang.String b;

private java.lang.String c;

private static moom.bW[] d;

private static long e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

private bW(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) {
super(p0, p1);
    this.a = null;
    this.b = null;
    this.c = null;
    this.a = p2;
    this.b = p3;
    this.c = p4;
}


private static void initialize() {
e = ((long)(((moom._a)(moom._c.a(((long)(-7961094227688425996L)), ((long)(575108350607508720L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(9258574227569L)))));
    long local20_life6 = (moom.bW.e ^ 26242497237618L);
    javax.crypto.Cipher local12_life8;
    javax.crypto.Cipher __sourceSpill773_10 = (local12_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill773_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill773_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill773_13 = new byte[8];
    (__sourceSpill773_13)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local13_life14 = 1;
    while ((local13_life14 < 8)) {
        (__sourceSpill773_13)[local13_life14] = ((byte) ((int) ((local20_life6 << (local13_life14 * 8)) >>> 56)));
        local13_life14 += 1;
    }
    byte[] __sourcePreallocation773_15 = __sourceSpill773_13;
    ((javax.crypto.Cipher)(__sourceSpill773_10)).init(((int)(__sourceSpill773_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill773_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation773_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local11_life18 = new java.lang.String[62];
    int local17_life19 = 0;
    java.lang.String local16_life20;
    int local18_life22 = ((java.lang.String)((local16_life20 = "³%&~p¥_wgí®æ\004à¢5wd3)ì\020à¿]\002¤ª(³%&~p¥_wgí®ææ¿±29··NC1÷ ßYs4\005ºÎ-Mú®\020½&XJ{ÅeÑéx\025ä.\020[¡Òè,ÔIJÂHq^JKU\bË|\001®xC6` ³%&~p¥_wgí®æ¹(ÕÐr-ú»J0\027\007Hû\b\177­_\025¨ð~\020ð_Lì£Lç\023Îñ\013 ÅåÙ(³%&~p¥_wgí®æÚy\026{ºÍ;ÂÈè\002R³d\fÍæ¹Øm(¼\030^_Å0öú¯¢:ª!?\005\037§½ù57\036*tèô\b}\032½=ù.\b\034\016È\016ââu\bË|\001®xC6`\0204áváfwXt¨V}MÊ\007\020ZÂr¡J¹y\026µ±ã\\\020rÃ\021S%\007\030WNqùÿ\013\035$\020/^Ü\020n?ò>eH\032\021f%\020uÁìH/xÊ§\005É¾®ÓÇ\013Ù\030¯\026ðÃÝäÿCèÅ[Hí²Ø\021TÀ7\025\030ú;¿k@mNÌãkX\032B§ Ù¡\017x|f\bþpÛÌp­(³%&~p¥_wgí®æ>I\003¿ÙI;õ®1ÀP$£#Jz9O]¹\020[¡Òè,ÔIÚÇï\026[×\020êÔ|n´èÝs^\001°\026í.ù(³%&~p¥_wgí®ææ¿±29··N\013Û6\022\006\rÎ×ñ\030.°~â\024\020ô%Ë^)Óÿ*:´\005l(³%&~p¥_wgí®æäõ÷§p\004¦8ÊD\013O©À\032Â\026Ún\025[)9(³%&~p¥_wgí®ææ¿±29··NºîkëÎµùtÛL&ñ ³%&~p¥_wgí®æo\007ð¹'=h6ùY{\0351&\bþpÛÌp­(³%&~p¥_wgí®æäõ÷§p\004¦8E2\006zW_¿\\°zZÎ¹Î(³%&~p¥_wgí®æHÜ¶Àìü¢Cdk4°TFfåå4ÈËæ|O(³%&~p¥_wgí®ææ¿±29··N3\037á]\"º°@>KI¬Í)k\030ïE\fÙf\005s\002ÅVºx\b\016ÔËµ¾Le\006k\030Ì)óP\002 +T7~¬ÇYs©ÂýPîoÿw(³%&~p¥_wgí®ææ¿±29··No\177¹d>;ê\013õ4å<¶¸Þ\020rÃ\021S%\007\030W|Og*/¼¢\020k&\177õ-NÎ\036:\177ªÈ}J\022\020\000+\036Ùk6ëÈ\013DKJþV\020Á\177Ðé\\·ÅÁÁPí2:äýd ³%&~p¥_wgí®æ4¯É{\003ØY¥,*c\bL>(³%&~p¥_wgí®æQ\007sàvþR¥ÒÞd¿25C\004ú\033j\034>(³%&~p¥_wgí®ææ¿±29··N¸ÄÎ6«Ø\026¸3øsÌ_MÍ ³%&~p¥_wgí®æ\177¨\034\034\031R\\\0170á\0174\020! O\027§\006\n tD£\020Á\177Ðé\\·ÅÁðä=·\023Ð\017\020)Æ\005?H\\ ²;\tWêe¦\020ü#*tÛË#/Ûò­Ê\020\000+\036Ùk6\027y[[*ä\026\020Yýe\ncM¡Ê\fv[¶ã\020[¡Òè,ÔI=7¢\016¼r\037Ñ\030\n\035PÐ\022SÃYÿÁ0kîéèý4ç\023\b\034\016È\016ââu\020Ùdd\022G\035Êæli\bNU3 ³%&~p¥_wgí®æQ¢¥T'>\024ä\023å\034Ü\021\020ìÂ¯îí}?1`çc.ù¹\020rÃ\021S%\007\030WgE]nÑ,e¸\020÷Ù¯ÄSöCt\006<\031¥Õ¢\020Á\177Ðé\\·ÅÁ\004qÒë~õ\020§R#§ïÕ®Jlå\021)kS|"))).length();
    int local15_life23 = 32;
    int local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill773_27 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill773_28 = local12_life8;
        byte[] local19_life30 = ((javax.crypto.Cipher)(__sourceSpill773_28)).doFinal(((byte[])(__sourceSpill773_27)));
        java.lang.String __sourceSpill773_33 = ((java.lang.String)(moom.bW.a(((byte[])(local19_life30))))).intern();
        java.lang.String[] __sourceSpill773_34 = local11_life18;
        int __sourceSpill773_35 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill773_34)[__sourceSpill773_35] = __sourceSpill773_33;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    local18_life22 = ((java.lang.String)((local16_life20 = "í\007È¯ïàî\025àÕb\013S=a~\024¢jò°Å\\I\020\000+\036Ùk6\0177Nô²TU"))).length();
    local15_life23 = 24;
    local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill773_40 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill773_41 = local12_life8;
        byte[] local19_life43 = ((javax.crypto.Cipher)(__sourceSpill773_41)).doFinal(((byte[])(__sourceSpill773_40)));
        java.lang.String __sourceSpill773_46 = ((java.lang.String)(moom.bW.a(((byte[])(local19_life43))))).intern();
        java.lang.String[] __sourceSpill773_47 = local11_life18;
        int __sourceSpill773_48 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill773_47)[__sourceSpill773_48] = __sourceSpill773_46;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    h = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life52;
    javax.crypto.Cipher __sourceSpill773_54 = (local0_life52 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill773_55 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill773_56 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill773_57 = new byte[8];
    (__sourceSpill773_57)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life58 = 1;
    while ((local1_life58 < 8)) {
        (__sourceSpill773_57)[local1_life58] = ((byte) ((int) ((local20_life6 << (local1_life58 * 8)) >>> 56)));
        local1_life58 += 1;
    }
    byte[] __sourcePreallocation773_59 = __sourceSpill773_57;
    ((javax.crypto.Cipher)(__sourceSpill773_54)).init(((int)(__sourceSpill773_55)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill773_56)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation773_59)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life62 = new long[25];
    int local3_life63 = 0;
    java.lang.String local4_life64;
    int local5_life66 = ((java.lang.String)((local4_life64 = "Üá@«¾Àc\024\007?\004åõß¤¾ÿ<ÈØØß\\A¬[­_Ôò1í#äO$õ\036Mù<S\024\016k ÷\021Ïgº)ÆYSwL\017@æ¹²êH\013@î!\bÅ2+x¯³ÄeváªCùÄÞç\035Ý\005ÿ·Ñã«öîÜ©ç\r)=Z<ÐåsLg*eqeì¸­\tÌ­\013p¹\035\f£Þá?ùµõ\026è1@e}Jþb\025ÞMÑæu\017)YM¼/f±ÔVc`ÀÛ!UÙ0\036"))).length();
    int local2_life67 = 0;
    do {
        java.lang.String __sourceSpill773_68 = local4_life64;
        int __sourceSpill773_69 = local2_life67;
        local2_life67 += 8;
        byte[] local7_life72 = ((java.lang.String)(((java.lang.String)(__sourceSpill773_68)).substring(((int)(__sourceSpill773_69)), ((int)(local2_life67))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill773_73 = local6_life62;
        int __sourceSpill773_74 = local3_life63;
        local3_life63 += 1;
        long local8_life75 = (((((((((((long) (local7_life72)[0]) & 255L) << 56) | ((((long) (local7_life72)[1]) & 255L) << 48)) | ((((long) (local7_life72)[2]) & 255L) << 40)) | ((((long) (local7_life72)[3]) & 255L) << 32)) | ((((long) (local7_life72)[4]) & 255L) << 24)) | ((((long) (local7_life72)[5]) & 255L) << 16)) | ((((long) (local7_life72)[6]) & 255L) << 8)) | (((long) (local7_life72)[7]) & 255L));
        byte[] __sourceSpill773_76 = new byte[8];
        (__sourceSpill773_76)[0] = ((byte) ((int) (local8_life75 >>> 56)));
        (__sourceSpill773_76)[1] = ((byte) ((int) (local8_life75 >>> 48)));
        (__sourceSpill773_76)[2] = ((byte) ((int) (local8_life75 >>> 40)));
        (__sourceSpill773_76)[3] = ((byte) ((int) (local8_life75 >>> 32)));
        (__sourceSpill773_76)[4] = ((byte) ((int) (local8_life75 >>> 24)));
        (__sourceSpill773_76)[5] = ((byte) ((int) (local8_life75 >>> 16)));
        (__sourceSpill773_76)[6] = ((byte) ((int) (local8_life75 >>> 8)));
        (__sourceSpill773_76)[7] = ((byte) ((int) local8_life75));
        javax.crypto.Cipher __sourceSpill773_77 = local0_life52;
        byte[] local10_life79 = ((javax.crypto.Cipher)(__sourceSpill773_77)).doFinal(((byte[])(__sourceSpill773_76)));
        (__sourceSpill773_73)[__sourceSpill773_74] = (((((((((((long) (local10_life79)[0]) & 255L) << 56) | ((((long) (local10_life79)[1]) & 255L) << 48)) | ((((long) (local10_life79)[2]) & 255L) << 40)) | ((((long) (local10_life79)[3]) & 255L) << 32)) | ((((long) (local10_life79)[4]) & 255L) << 24)) | ((((long) (local10_life79)[5]) & 255L) << 16)) | ((((long) (local10_life79)[6]) & 255L) << 8)) | (((long) (local10_life79)[7]) & 255L));
    } while ((!(local2_life67 >= local5_life66)));
    local5_life66 = ((java.lang.String)((local4_life64 = "ñf\\áÚ÷j\\ÊkÅÍXÇ#ñ"))).length();
    local2_life67 = 0;
    do {
        java.lang.String __sourceSpill773_81 = local4_life64;
        int __sourceSpill773_82 = local2_life67;
        local2_life67 += 8;
        byte[] local7_life85 = ((java.lang.String)(((java.lang.String)(__sourceSpill773_81)).substring(((int)(__sourceSpill773_82)), ((int)(local2_life67))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill773_86 = local6_life62;
        int __sourceSpill773_87 = local3_life63;
        local3_life63 += 1;
        long local8_life88 = (((((((((((long) (local7_life85)[0]) & 255L) << 56) | ((((long) (local7_life85)[1]) & 255L) << 48)) | ((((long) (local7_life85)[2]) & 255L) << 40)) | ((((long) (local7_life85)[3]) & 255L) << 32)) | ((((long) (local7_life85)[4]) & 255L) << 24)) | ((((long) (local7_life85)[5]) & 255L) << 16)) | ((((long) (local7_life85)[6]) & 255L) << 8)) | (((long) (local7_life85)[7]) & 255L));
        byte[] __sourceSpill773_89 = new byte[8];
        (__sourceSpill773_89)[0] = ((byte) ((int) (local8_life88 >>> 56)));
        (__sourceSpill773_89)[1] = ((byte) ((int) (local8_life88 >>> 48)));
        (__sourceSpill773_89)[2] = ((byte) ((int) (local8_life88 >>> 40)));
        (__sourceSpill773_89)[3] = ((byte) ((int) (local8_life88 >>> 32)));
        (__sourceSpill773_89)[4] = ((byte) ((int) (local8_life88 >>> 24)));
        (__sourceSpill773_89)[5] = ((byte) ((int) (local8_life88 >>> 16)));
        (__sourceSpill773_89)[6] = ((byte) ((int) (local8_life88 >>> 8)));
        (__sourceSpill773_89)[7] = ((byte) ((int) local8_life88));
        javax.crypto.Cipher __sourceSpill773_90 = local0_life52;
        byte[] local10_life92 = ((javax.crypto.Cipher)(__sourceSpill773_90)).doFinal(((byte[])(__sourceSpill773_89)));
        (__sourceSpill773_86)[__sourceSpill773_87] = (((((((((((long) (local10_life92)[0]) & 255L) << 56) | ((((long) (local10_life92)[1]) & 255L) << 48)) | ((((long) (local10_life92)[2]) & 255L) << 40)) | ((((long) (local10_life92)[3]) & 255L) << 32)) | ((((long) (local10_life92)[4]) & 255L) << 24)) | ((((long) (local10_life92)[5]) & 255L) << 16)) | ((((long) (local10_life92)[6]) & 255L) << 8)) | (((long) (local10_life92)[7]) & 255L));
    } while ((!(local2_life67 >= local5_life66)));
    f = ((long[])(local6_life62));
    g = ((java.lang.Integer[])(new java.lang.Integer[25]));
    ANTIALIASING = ((moom.bW)(new moom.bW((local11_life18)[59], 0, (local11_life18)[28], (local11_life18)[9], "0")));
    NORMAL_MAP = ((moom.bW)(new moom.bW((local11_life18)[7], 1, (local11_life18)[43], (local11_life18)[19], (local11_life18)[29])));
    SPECULAR_MAP = ((moom.bW)(new moom.bW((local11_life18)[53], 2, (local11_life18)[54], (local11_life18)[51], (local11_life18)[20])));
    RENDER_RES_MUL = ((moom.bW)(new moom.bW((local11_life18)[16], 3, (local11_life18)[31], (local11_life18)[44], (local11_life18)[4])));
    SHADOW_RES_MUL = ((moom.bW)(new moom.bW((local11_life18)[14], 4, (local11_life18)[30], (local11_life18)[2], (local11_life18)[12])));
    HAND_DEPTH_MUL = ((moom.bW)(new moom.bW((local11_life18)[23], 5, (local11_life18)[8], (local11_life18)[37], (local11_life18)[10])));
    CLOUD_SHADOW = ((moom.bW)(new moom.bW((local11_life18)[49], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite773_101(29425, (3123546537090384919L ^ local20_life6)), (local11_life18)[0], (local11_life18)[13], (local11_life18)[20])));
    OLD_HAND_LIGHT = ((moom.bW)(new moom.bW((local11_life18)[46], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite773_103(25406, (2507831984079443414L ^ local20_life6)), (local11_life18)[21], (local11_life18)[55], (local11_life18)[11])));
    OLD_LIGHTING = ((moom.bW)(new moom.bW((local11_life18)[25], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite773_105(11273, (1789888933969386212L ^ local20_life6)), (local11_life18)[5], (local11_life18)[17], (local11_life18)[52])));
    SHADER_PACK = ((moom.bW)(new moom.bW((local11_life18)[57], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite773_107(25618, (5710101164307387121L ^ local20_life6)), (local11_life18)[40], (local11_life18)[47], "")));
    TWEAK_BLOCK_DAMAGE = ((moom.bW)(new moom.bW((local11_life18)[18], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite773_109(15313, (1598043718028348715L ^ local20_life6)), (local11_life18)[41], (local11_life18)[60], (local11_life18)[6])));
    SHADOW_CLIP_FRUSTRUM = ((moom.bW)(new moom.bW((local11_life18)[33], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite773_111(18415, (7270029123931287825L ^ local20_life6)), (local11_life18)[26], (local11_life18)[34], (local11_life18)[20])));
    TEX_MIN_FIL_B = ((moom.bW)(new moom.bW((local11_life18)[22], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite773_113(14481, (292313321122942569L ^ local20_life6)), (local11_life18)[35], (local11_life18)[48], "0")));
    TEX_MIN_FIL_N = ((moom.bW)(new moom.bW((local11_life18)[50], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite773_115(7106, (3221081765044514091L ^ local20_life6)), (local11_life18)[27], (local11_life18)[61], "0")));
    TEX_MIN_FIL_S = ((moom.bW)(new moom.bW((local11_life18)[3], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite773_117(31186, (7440183114699280188L ^ local20_life6)), (local11_life18)[42], (local11_life18)[38], "0")));
    TEX_MAG_FIL_B = ((moom.bW)(new moom.bW((local11_life18)[39], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite773_119(4863, (638338421881824285L ^ local20_life6)), (local11_life18)[24], (local11_life18)[15], "0")));
    TEX_MAG_FIL_N = ((moom.bW)(new moom.bW((local11_life18)[58], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite773_121(5153, (5969771614015021764L ^ local20_life6)), (local11_life18)[1], (local11_life18)[56], "0")));
    TEX_MAG_FIL_S = ((moom.bW)(new moom.bW((local11_life18)[45], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite773_123(11352, (4381594389003786943L ^ local20_life6)), (local11_life18)[32], (local11_life18)[36], "0")));
    d = ((moom.bW[])(moom.bW.a__ArraybW()));
}


public static moom.bW[] values() {
return ((moom.bW[])(((moom.bW[])(moom.bW.d)).clone()));
}


public static moom.bW valueOf(java.lang.String p0) {
return ((moom.bW)(java.lang.Enum.valueOf(((java.lang.Class)(moom.bW.class)), ((java.lang.String)(p0)))));
}


public java.lang.String b() {
return this.b;
}


public java.lang.String c() {
return this.c;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 27302;
      if (g[var3] == null) {
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
         long var5 = f[var3];
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
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/bW", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6959_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/bW"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.bW.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
        byte[] spill3527_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3527_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3527_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3527_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3527_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3527_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.bW[] a__ArraybW() {
long local0_life1 = (moom.bW.e ^ 124858307255049L);
    moom.bW[] __sourceSharedArray764_4 = new moom.bW[__sourceIntrinsic_69014928e493_originalDynamicSite764_2(25657, (5693916423387536301L ^ local0_life1))];
    __sourceSharedArray764_4[0] = moom.bW.ANTIALIASING;
    __sourceSharedArray764_4[1] = moom.bW.NORMAL_MAP;
    __sourceSharedArray764_4[2] = moom.bW.SPECULAR_MAP;
    __sourceSharedArray764_4[3] = moom.bW.RENDER_RES_MUL;
    __sourceSharedArray764_4[4] = moom.bW.SHADOW_RES_MUL;
    __sourceSharedArray764_4[5] = moom.bW.HAND_DEPTH_MUL;
    __sourceSharedArray764_4[__sourceIntrinsic_69014928e493_originalDynamicSite764_10(24460, (7385081886347419671L ^ local0_life1))] = moom.bW.CLOUD_SHADOW;
    __sourceSharedArray764_4[__sourceIntrinsic_69014928e493_originalDynamicSite764_12(31739, (1755544171935974527L ^ local0_life1))] = moom.bW.OLD_HAND_LIGHT;
    __sourceSharedArray764_4[__sourceIntrinsic_69014928e493_originalDynamicSite764_14(16830, (8010449078065888809L ^ local0_life1))] = moom.bW.OLD_LIGHTING;
    __sourceSharedArray764_4[__sourceIntrinsic_69014928e493_originalDynamicSite764_16(23341, (1700603411964191932L ^ local0_life1))] = moom.bW.SHADER_PACK;
    __sourceSharedArray764_4[__sourceIntrinsic_69014928e493_originalDynamicSite764_18(10455, (4791252670193669960L ^ local0_life1))] = moom.bW.TWEAK_BLOCK_DAMAGE;
    __sourceSharedArray764_4[__sourceIntrinsic_69014928e493_originalDynamicSite764_20(20721, (5927433443424661366L ^ local0_life1))] = moom.bW.SHADOW_CLIP_FRUSTRUM;
    __sourceSharedArray764_4[__sourceIntrinsic_69014928e493_originalDynamicSite764_22(20328, (1804981980922245349L ^ local0_life1))] = moom.bW.TEX_MIN_FIL_B;
    __sourceSharedArray764_4[__sourceIntrinsic_69014928e493_originalDynamicSite764_24(29772, (4627109774728776662L ^ local0_life1))] = moom.bW.TEX_MIN_FIL_N;
    __sourceSharedArray764_4[__sourceIntrinsic_69014928e493_originalDynamicSite764_26(21898, (6678145606038317580L ^ local0_life1))] = moom.bW.TEX_MIN_FIL_S;
    __sourceSharedArray764_4[__sourceIntrinsic_69014928e493_originalDynamicSite764_28(17176, (8353128897197341848L ^ local0_life1))] = moom.bW.TEX_MAG_FIL_B;
    __sourceSharedArray764_4[__sourceIntrinsic_69014928e493_originalDynamicSite764_30(27708, (9102795142994056126L ^ local0_life1))] = moom.bW.TEX_MAG_FIL_N;
    __sourceSharedArray764_4[__sourceIntrinsic_69014928e493_originalDynamicSite764_32(3688, (8464084175681991160L ^ local0_life1))] = moom.bW.TEX_MAG_FIL_S;
    return __sourceSharedArray764_4;
}


public java.lang.String a() {
return this.a;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite773_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite773_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite773_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite773_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite773_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite773_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite773_113(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite773_115(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite773_117(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite773_119(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite773_121(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite773_123(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6959_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_69014928e493_originalDynamicSite764_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_69014928e493_originalDynamicSite764_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_69014928e493_originalDynamicSite764_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_69014928e493_originalDynamicSite764_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_69014928e493_originalDynamicSite764_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_69014928e493_originalDynamicSite764_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_69014928e493_originalDynamicSite764_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_69014928e493_originalDynamicSite764_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_69014928e493_originalDynamicSite764_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_69014928e493_originalDynamicSite764_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_69014928e493_originalDynamicSite764_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_69014928e493_originalDynamicSite764_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_69014928e493_originalDynamicSite764_32(int a0, long a1) throws E;
}
