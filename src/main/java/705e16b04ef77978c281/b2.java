package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class b2 extends sourcebuild.EnumConstructor<moom.b2> {

public static moom.b2 BYTE;

public static moom.b2 SHORT;

public static moom.b2 INT;

public static moom.b2 HALF_FLOAT;

public static moom.b2 FLOAT;

public static moom.b2 UNSIGNED_BYTE;

public static moom.b2 UNSIGNED_BYTE_3_3_2;

public static moom.b2 UNSIGNED_BYTE_2_3_3_REV;

public static moom.b2 UNSIGNED_SHORT;

public static moom.b2 UNSIGNED_SHORT_5_6_5;

public static moom.b2 UNSIGNED_SHORT_5_6_5_REV;

public static moom.b2 UNSIGNED_SHORT_4_4_4_4;

public static moom.b2 UNSIGNED_SHORT_4_4_4_4_REV;

public static moom.b2 UNSIGNED_SHORT_5_5_5_1;

public static moom.b2 UNSIGNED_SHORT_1_5_5_5_REV;

public static moom.b2 UNSIGNED_INT;

public static moom.b2 UNSIGNED_INT_8_8_8_8;

public static moom.b2 UNSIGNED_INT_8_8_8_8_REV;

public static moom.b2 UNSIGNED_INT_10_10_10_2;

public static moom.b2 UNSIGNED_INT_2_10_10_10_REV;

private int a;

private static moom.b2[] b;

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map f;

private b2(java.lang.String p0, int p1, int p2) {
super(p0, p1);
    this.a = p2;
}


private static void initialize() {
c = ((long)(((moom._a)(moom._c.a(((long)(4357949276927008532L)), ((long)(-5536706255221475843L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(255225051490703L)))));
    long local20_life6 = (moom.b2.c ^ 35439554769944L);
    javax.crypto.Cipher local12_life8;
    javax.crypto.Cipher __sourceSpill761_10 = (local12_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill761_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill761_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill761_13 = new byte[8];
    (__sourceSpill761_13)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local13_life14 = 1;
    while ((local13_life14 < 8)) {
        (__sourceSpill761_13)[local13_life14] = ((byte) ((int) ((local20_life6 << (local13_life14 * 8)) >>> 56)));
        local13_life14 += 1;
    }
    byte[] __sourcePreallocation761_15 = __sourceSpill761_13;
    ((javax.crypto.Cipher)(__sourceSpill761_10)).init(((int)(__sourceSpill761_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill761_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation761_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local11_life18 = new java.lang.String[20];
    int local17_life19 = 0;
    java.lang.String local16_life20;
    int local18_life22 = ((java.lang.String)((local16_life20 = "\nC¡æñôK\035eTà©NF\021(õ)½T5\030\nC¡æñôK\035Î;\013Õ\035<ÕõÄï³ \nC¡æñôK\035eTà©N6M\002¢ós\000\005÷÷w«\ráâ\b3Þ\"\000¸Ñ\020\nC¡æñôK\035ú|Ñ÷l:\030\nC¡æñôK\035&Ú~ë1;´\fº\f\177\035Ó8\020\nC¡æñôK\035\022[r,3¹\020b\030\nC¡æñôK\035¢ö\fÑ\036\034z|î?~ä è\030\nC¡æñôK\035U~äHñ}m§~³å]\n*^\bÁ¼U­\001Ú\036\030\nC¡æñôK\035Y}Æ©\005xûYsØTà8I§ \nC¡æñôK\035¡9\t0¢EUOê\007àË¼ÙFöG;§\030\nC¡æñôK\035eTà©Nw\003´>Ð=\020\nC¡æñôK\035´\nc¦Ú\013u \nC¡æñôK\035Y}Æ©\005xû!ÙË \025SºÃü\017ÃØÔ\177\bÞ(¨¥ßÛÜ\020$pdÁ%¿>\021»\013{B°ùYP\bG\000¯ß]"))).length();
    int local15_life23 = 24;
    int local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill761_27 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill761_28 = local12_life8;
        byte[] local19_life30 = ((javax.crypto.Cipher)(__sourceSpill761_28)).doFinal(((byte[])(__sourceSpill761_27)));
        java.lang.String __sourceSpill761_33 = ((java.lang.String)(moom.b2.a(((byte[])(local19_life30))))).intern();
        java.lang.String[] __sourceSpill761_34 = local11_life18;
        int __sourceSpill761_35 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill761_34)[__sourceSpill761_35] = __sourceSpill761_33;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    local18_life22 = ((java.lang.String)((local16_life20 = "\nC¡æñôK\035Î;\013Õ\035<à«\003F4Ä/<¥>\r\"\b~ \nC¡æñôK\035\037ôFª&Ë£hM­Ù\fG\027|z¿îâ"))).length();
    local15_life23 = 32;
    local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill761_40 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill761_41 = local12_life8;
        byte[] local19_life43 = ((javax.crypto.Cipher)(__sourceSpill761_41)).doFinal(((byte[])(__sourceSpill761_40)));
        java.lang.String __sourceSpill761_46 = ((java.lang.String)(moom.b2.a(((byte[])(local19_life43))))).intern();
        java.lang.String[] __sourceSpill761_47 = local11_life18;
        int __sourceSpill761_48 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill761_47)[__sourceSpill761_48] = __sourceSpill761_46;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    f = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life52;
    javax.crypto.Cipher __sourceSpill761_54 = (local0_life52 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill761_55 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill761_56 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill761_57 = new byte[8];
    (__sourceSpill761_57)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life58 = 1;
    while ((local1_life58 < 8)) {
        (__sourceSpill761_57)[local1_life58] = ((byte) ((int) ((local20_life6 << (local1_life58 * 8)) >>> 56)));
        local1_life58 += 1;
    }
    byte[] __sourcePreallocation761_59 = __sourceSpill761_57;
    ((javax.crypto.Cipher)(__sourceSpill761_54)).init(((int)(__sourceSpill761_55)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill761_56)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation761_59)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life62 = new long[49];
    int local3_life63 = 0;
    java.lang.String local4_life64;
    int local5_life66 = ((java.lang.String)((local4_life64 = "\030Mè¼\fq.Oz\f_>ÄGýòtüÓ\024\fu®\036å\025\001?é²ý¬­%w¬¿çVâ\0068îFJ&U0Eí&Û4\033H_R ºOt\007>OfDÙqò6§\"ìëø\031>y­¡\023b\177\nH\003f,}\001u\\ýìÒÇê$á,fåOD`I\bÈôfð¹\021R-ÞõÁC\034yxnì)#OÆ\001$\004´o\003ÏæzJf°ªW\005ADuïÈ²\rsI\017-Ç­c\032&9\005\004ï¨û\030åB ;Äë\177\013érvI\026*\0217;Ö6!\031y\001ó\025sÝ/þ$BØÚ\000\025ÉýZØÜ¾éL{ä­*ÕIJ\013@h6¢Õú8sz;Å\r¡i?£Ñ\036ÉÏüî\036¾Õ\020ýu\n3Æ©Ñï¸ £Ëçêöõe©'QìÛoAGà½ÃµÏ4Þ0\fJpí~i &ÂKT\n@¤öÊ7´Z\016u~l\036?..þw\tMê\006Ó#ÖMTu\026Í\026\030#}4BêÙù"))).length();
    int local2_life67 = 0;
    do {
        java.lang.String __sourceSpill761_68 = local4_life64;
        int __sourceSpill761_69 = local2_life67;
        local2_life67 += 8;
        byte[] local7_life72 = ((java.lang.String)(((java.lang.String)(__sourceSpill761_68)).substring(((int)(__sourceSpill761_69)), ((int)(local2_life67))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill761_73 = local6_life62;
        int __sourceSpill761_74 = local3_life63;
        local3_life63 += 1;
        long local8_life75 = (((((((((((long) (local7_life72)[0]) & 255L) << 56) | ((((long) (local7_life72)[1]) & 255L) << 48)) | ((((long) (local7_life72)[2]) & 255L) << 40)) | ((((long) (local7_life72)[3]) & 255L) << 32)) | ((((long) (local7_life72)[4]) & 255L) << 24)) | ((((long) (local7_life72)[5]) & 255L) << 16)) | ((((long) (local7_life72)[6]) & 255L) << 8)) | (((long) (local7_life72)[7]) & 255L));
        byte[] __sourceSpill761_76 = new byte[8];
        (__sourceSpill761_76)[0] = ((byte) ((int) (local8_life75 >>> 56)));
        (__sourceSpill761_76)[1] = ((byte) ((int) (local8_life75 >>> 48)));
        (__sourceSpill761_76)[2] = ((byte) ((int) (local8_life75 >>> 40)));
        (__sourceSpill761_76)[3] = ((byte) ((int) (local8_life75 >>> 32)));
        (__sourceSpill761_76)[4] = ((byte) ((int) (local8_life75 >>> 24)));
        (__sourceSpill761_76)[5] = ((byte) ((int) (local8_life75 >>> 16)));
        (__sourceSpill761_76)[6] = ((byte) ((int) (local8_life75 >>> 8)));
        (__sourceSpill761_76)[7] = ((byte) ((int) local8_life75));
        javax.crypto.Cipher __sourceSpill761_77 = local0_life52;
        byte[] local10_life79 = ((javax.crypto.Cipher)(__sourceSpill761_77)).doFinal(((byte[])(__sourceSpill761_76)));
        (__sourceSpill761_73)[__sourceSpill761_74] = (((((((((((long) (local10_life79)[0]) & 255L) << 56) | ((((long) (local10_life79)[1]) & 255L) << 48)) | ((((long) (local10_life79)[2]) & 255L) << 40)) | ((((long) (local10_life79)[3]) & 255L) << 32)) | ((((long) (local10_life79)[4]) & 255L) << 24)) | ((((long) (local10_life79)[5]) & 255L) << 16)) | ((((long) (local10_life79)[6]) & 255L) << 8)) | (((long) (local10_life79)[7]) & 255L));
    } while ((!(local2_life67 >= local5_life66)));
    local5_life66 = ((java.lang.String)((local4_life64 = "~Èæ#÷ýßÏ\016\026d÷\000Úx#"))).length();
    local2_life67 = 0;
    do {
        java.lang.String __sourceSpill761_81 = local4_life64;
        int __sourceSpill761_82 = local2_life67;
        local2_life67 += 8;
        byte[] local7_life85 = ((java.lang.String)(((java.lang.String)(__sourceSpill761_81)).substring(((int)(__sourceSpill761_82)), ((int)(local2_life67))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill761_86 = local6_life62;
        int __sourceSpill761_87 = local3_life63;
        local3_life63 += 1;
        long local8_life88 = (((((((((((long) (local7_life85)[0]) & 255L) << 56) | ((((long) (local7_life85)[1]) & 255L) << 48)) | ((((long) (local7_life85)[2]) & 255L) << 40)) | ((((long) (local7_life85)[3]) & 255L) << 32)) | ((((long) (local7_life85)[4]) & 255L) << 24)) | ((((long) (local7_life85)[5]) & 255L) << 16)) | ((((long) (local7_life85)[6]) & 255L) << 8)) | (((long) (local7_life85)[7]) & 255L));
        byte[] __sourceSpill761_89 = new byte[8];
        (__sourceSpill761_89)[0] = ((byte) ((int) (local8_life88 >>> 56)));
        (__sourceSpill761_89)[1] = ((byte) ((int) (local8_life88 >>> 48)));
        (__sourceSpill761_89)[2] = ((byte) ((int) (local8_life88 >>> 40)));
        (__sourceSpill761_89)[3] = ((byte) ((int) (local8_life88 >>> 32)));
        (__sourceSpill761_89)[4] = ((byte) ((int) (local8_life88 >>> 24)));
        (__sourceSpill761_89)[5] = ((byte) ((int) (local8_life88 >>> 16)));
        (__sourceSpill761_89)[6] = ((byte) ((int) (local8_life88 >>> 8)));
        (__sourceSpill761_89)[7] = ((byte) ((int) local8_life88));
        javax.crypto.Cipher __sourceSpill761_90 = local0_life52;
        byte[] local10_life92 = ((javax.crypto.Cipher)(__sourceSpill761_90)).doFinal(((byte[])(__sourceSpill761_89)));
        (__sourceSpill761_86)[__sourceSpill761_87] = (((((((((((long) (local10_life92)[0]) & 255L) << 56) | ((((long) (local10_life92)[1]) & 255L) << 48)) | ((((long) (local10_life92)[2]) & 255L) << 40)) | ((((long) (local10_life92)[3]) & 255L) << 32)) | ((((long) (local10_life92)[4]) & 255L) << 24)) | ((((long) (local10_life92)[5]) & 255L) << 16)) | ((((long) (local10_life92)[6]) & 255L) << 8)) | (((long) (local10_life92)[7]) & 255L));
    } while ((!(local2_life67 >= local5_life66)));
    d = ((long[])(local6_life62));
    e = ((java.lang.Integer[])(new java.lang.Integer[49]));
    BYTE = ((moom.b2)(new moom.b2((local11_life18)[3], 0, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_95(28721, (2315907784139775298L ^ local20_life6)))));
    SHORT = ((moom.b2)(new moom.b2((local11_life18)[9], 1, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_97(30606, (6769081759901981381L ^ local20_life6)))));
    INT = ((moom.b2)(new moom.b2((local11_life18)[15], 2, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_99(8488, (7722069105878649940L ^ local20_life6)))));
    HALF_FLOAT = ((moom.b2)(new moom.b2((local11_life18)[16], 3, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_101(8687, (6559491057139633293L ^ local20_life6)))));
    FLOAT = ((moom.b2)(new moom.b2((local11_life18)[17], 4, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_103(15998, (6954598566308958990L ^ local20_life6)))));
    UNSIGNED_BYTE = ((moom.b2)(new moom.b2((local11_life18)[4], 5, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_105(12920, (52802859287535391L ^ local20_life6)))));
    UNSIGNED_BYTE_3_3_2 = ((moom.b2)(new moom.b2((local11_life18)[8], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_107(30730, (4146792935630968134L ^ local20_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_108(1156, (3264440150831360480L ^ local20_life6)))));
    UNSIGNED_BYTE_2_3_3_REV = ((moom.b2)(new moom.b2((local11_life18)[7], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_110(26878, (483425840547694014L ^ local20_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_111(6658, (7334440864345487201L ^ local20_life6)))));
    UNSIGNED_SHORT = ((moom.b2)(new moom.b2((local11_life18)[13], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_113(8287, (5680940431347043635L ^ local20_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_114(19692, (8158149919182234022L ^ local20_life6)))));
    UNSIGNED_SHORT_5_6_5 = ((moom.b2)(new moom.b2((local11_life18)[12], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_116(30801, (6895248540348388670L ^ local20_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_117(1466, (1151275255338559687L ^ local20_life6)))));
    UNSIGNED_SHORT_5_6_5_REV = ((moom.b2)(new moom.b2((local11_life18)[2], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_119(4852, (4402467844959567747L ^ local20_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_120(13572, (947558963627415618L ^ local20_life6)))));
    UNSIGNED_SHORT_4_4_4_4 = ((moom.b2)(new moom.b2((local11_life18)[1], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_122(30325, (5936368410912103195L ^ local20_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_123(31044, (5108430262907999286L ^ local20_life6)))));
    UNSIGNED_SHORT_4_4_4_4_REV = ((moom.b2)(new moom.b2((local11_life18)[18], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_125(29947, (1610695530897643964L ^ local20_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_126(18166, (8240694055834856350L ^ local20_life6)))));
    UNSIGNED_SHORT_5_5_5_1 = ((moom.b2)(new moom.b2((local11_life18)[0], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_128(10150, (5349583136954796783L ^ local20_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_129(18221, (788411942516140640L ^ local20_life6)))));
    UNSIGNED_SHORT_1_5_5_5_REV = ((moom.b2)(new moom.b2((local11_life18)[11], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_131(17730, (5152915839845640248L ^ local20_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_132(19399, (1369357710197696133L ^ local20_life6)))));
    UNSIGNED_INT = ((moom.b2)(new moom.b2((local11_life18)[6], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_134(15229, (2217521339798476339L ^ local20_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_135(13546, (8259632591546276244L ^ local20_life6)))));
    UNSIGNED_INT_8_8_8_8 = ((moom.b2)(new moom.b2((local11_life18)[10], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_137(3180, (3666446270174191893L ^ local20_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_138(29545, (6498662543335104015L ^ local20_life6)))));
    UNSIGNED_INT_8_8_8_8_REV = ((moom.b2)(new moom.b2((local11_life18)[14], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_140(9624, (3684493605922588925L ^ local20_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_141(30026, (8709308532653758475L ^ local20_life6)))));
    UNSIGNED_INT_10_10_10_2 = ((moom.b2)(new moom.b2((local11_life18)[5], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_143(5858, (8112776859825634201L ^ local20_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_144(20224, (1315015859217769067L ^ local20_life6)))));
    UNSIGNED_INT_2_10_10_10_REV = ((moom.b2)(new moom.b2((local11_life18)[19], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_146(13320, (3584868824901376338L ^ local20_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_147(17058, (3609023805308579778L ^ local20_life6)))));
    b = ((moom.b2[])(moom.b2.a__Arrayb2()));
}


public static moom.b2[] values() {
return ((moom.b2[])(((moom.b2[])(moom.b2.b)).clone()));
}


public static moom.b2 valueOf(java.lang.String p0) {
return ((moom.b2)(java.lang.Enum.valueOf(((java.lang.Class)(moom.b2.class)), ((java.lang.String)(p0)))));
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 32298;
      if (e[var3] == null) {
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
         long var5 = d[var3];
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
         Object[] var9 = (Object[])f.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               f.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/b2", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6915_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/b2"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.b2.a(((int)(local4)), ((long)(local5)));
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
        byte[] spill3495_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3495_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3495_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3495_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3495_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3495_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.b2[] a__Arrayb2() {
long local0_life1 = (moom.b2.c ^ 133964353731630L);
    moom.b2[] __sourceSharedArray752_4 = new moom.b2[__sourceIntrinsic_560daf7ac0a9_originalDynamicSite752_2(4370, (7560791618942743633L ^ local0_life1))];
    __sourceSharedArray752_4[0] = moom.b2.BYTE;
    __sourceSharedArray752_4[1] = moom.b2.SHORT;
    __sourceSharedArray752_4[2] = moom.b2.INT;
    __sourceSharedArray752_4[3] = moom.b2.HALF_FLOAT;
    __sourceSharedArray752_4[4] = moom.b2.FLOAT;
    __sourceSharedArray752_4[5] = moom.b2.UNSIGNED_BYTE;
    __sourceSharedArray752_4[__sourceIntrinsic_560daf7ac0a9_originalDynamicSite752_10(24981, (4537596099695527143L ^ local0_life1))] = moom.b2.UNSIGNED_BYTE_3_3_2;
    __sourceSharedArray752_4[__sourceIntrinsic_560daf7ac0a9_originalDynamicSite752_12(13792, (1499414768864727193L ^ local0_life1))] = moom.b2.UNSIGNED_BYTE_2_3_3_REV;
    __sourceSharedArray752_4[__sourceIntrinsic_560daf7ac0a9_originalDynamicSite752_14(2578, (4302061587753578348L ^ local0_life1))] = moom.b2.UNSIGNED_SHORT;
    __sourceSharedArray752_4[__sourceIntrinsic_560daf7ac0a9_originalDynamicSite752_16(18358, (4912569610333512447L ^ local0_life1))] = moom.b2.UNSIGNED_SHORT_5_6_5;
    __sourceSharedArray752_4[__sourceIntrinsic_560daf7ac0a9_originalDynamicSite752_18(537, (566542094835820382L ^ local0_life1))] = moom.b2.UNSIGNED_SHORT_5_6_5_REV;
    __sourceSharedArray752_4[__sourceIntrinsic_560daf7ac0a9_originalDynamicSite752_20(28876, (3338474902983169427L ^ local0_life1))] = moom.b2.UNSIGNED_SHORT_4_4_4_4;
    __sourceSharedArray752_4[__sourceIntrinsic_560daf7ac0a9_originalDynamicSite752_22(31201, (2779799023863323811L ^ local0_life1))] = moom.b2.UNSIGNED_SHORT_4_4_4_4_REV;
    __sourceSharedArray752_4[__sourceIntrinsic_560daf7ac0a9_originalDynamicSite752_24(21212, (8189001205634496431L ^ local0_life1))] = moom.b2.UNSIGNED_SHORT_5_5_5_1;
    __sourceSharedArray752_4[__sourceIntrinsic_560daf7ac0a9_originalDynamicSite752_26(28893, (7988805871752107421L ^ local0_life1))] = moom.b2.UNSIGNED_SHORT_1_5_5_5_REV;
    __sourceSharedArray752_4[__sourceIntrinsic_560daf7ac0a9_originalDynamicSite752_28(13081, (8650030588078265925L ^ local0_life1))] = moom.b2.UNSIGNED_INT;
    __sourceSharedArray752_4[__sourceIntrinsic_560daf7ac0a9_originalDynamicSite752_30(26685, (6396808236338236744L ^ local0_life1))] = moom.b2.UNSIGNED_INT_8_8_8_8;
    __sourceSharedArray752_4[__sourceIntrinsic_560daf7ac0a9_originalDynamicSite752_32(23402, (7199461704959131185L ^ local0_life1))] = moom.b2.UNSIGNED_INT_8_8_8_8_REV;
    __sourceSharedArray752_4[__sourceIntrinsic_560daf7ac0a9_originalDynamicSite752_34(22877, (3445914571885083667L ^ local0_life1))] = moom.b2.UNSIGNED_INT_10_10_10_2;
    __sourceSharedArray752_4[__sourceIntrinsic_560daf7ac0a9_originalDynamicSite752_36(32648, (8634094468445231839L ^ local0_life1))] = moom.b2.UNSIGNED_INT_2_10_10_10_REV;
    return __sourceSharedArray752_4;
}


public int a() {
return this.a;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_97(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_99(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_108(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_110(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_113(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_116(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_117(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_119(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_120(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_122(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_123(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_125(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_126(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_128(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_129(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_131(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_132(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_134(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_135(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_137(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_138(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_140(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_141(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_143(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_144(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_146(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite761_147(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6915_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_560daf7ac0a9_originalDynamicSite752_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_560daf7ac0a9_originalDynamicSite752_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_560daf7ac0a9_originalDynamicSite752_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_560daf7ac0a9_originalDynamicSite752_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_560daf7ac0a9_originalDynamicSite752_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_560daf7ac0a9_originalDynamicSite752_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_560daf7ac0a9_originalDynamicSite752_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_560daf7ac0a9_originalDynamicSite752_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_560daf7ac0a9_originalDynamicSite752_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_560daf7ac0a9_originalDynamicSite752_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_560daf7ac0a9_originalDynamicSite752_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_560daf7ac0a9_originalDynamicSite752_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_560daf7ac0a9_originalDynamicSite752_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_560daf7ac0a9_originalDynamicSite752_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_560daf7ac0a9_originalDynamicSite752_36(int a0, long a1) throws E;
}
