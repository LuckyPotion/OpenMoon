package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class n6 {

private static net.minecraft.client.Minecraft a;

private java.util.ArrayList<moom.DR> b;

private net.minecraft.entity.EntityLivingBase c;

private float d;

private float e;

private float f;

private float g;

private float h;

private float i;

private float j;

private float k;

private float l;

private float m;

private float n;

private float o;

private float p;

private float q;

private boolean r;

private boolean s;

private boolean t;

private boolean u;

private boolean v;

private boolean w;

private static long x;

private static java.lang.String[] y;

private static java.lang.String[] z;

private static java.util.Map A;

private static long[] B;

private static java.lang.Integer[] C;

private static java.util.Map D;

public n6(net.minecraft.entity.EntityLivingBase p0) { this((net.minecraft.entity.EntityLivingBase)null, 0.0F, 0.0F); }


private static void __sourceConstructorBody_f6ef1096222100ec(com.moon.n6 receiver, net.minecraft.entity.EntityLivingBase p0) throws Throwable {

int forwardValue44_24_0;

    int forwardValue44_41_0;

    com.moon.n6 forwardValue44_51_0;

    com.moon.n6 forwardValue44_95_0;

    int forwardValue44_95_1;

    com.moon.n6 forwardValue44_96_0;

    com.moon.n6 forwardValue44_97_0;

    int forwardValue44_97_1;

    boolean spill44_0;

    boolean spill44_1;

    boolean spill44_2;

    com.moon.n6 spill44_3;

    com.moon.n6 spill44_4;

    com.moon.n6 spill44_5;

    int spill44_6;

    long life2_3;

    float life5_11;

    int life4_12;

    float[] life6_85;

    float life7_88;

    forward_join_97: {

    forward_join_96: {

    forward_join_95: {

    forward_join_51: {

    forward_join_50: {

    forward_join_41: {

    forward_join_37: {

    forward_join_24: {

    forward_join_22: {

    life2_3 = (com.moon.n6.x ^ 97708303331919L);

    spill44_0 = moom.fw.a__Boolean();

    com.moon.n6.__sourceConstructorInit_f6ef1096222100ec_0(((com.moon.n6)(receiver)), ((net.minecraft.entity.EntityLivingBase)(p0)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));

    life5_11 = 0x1.f5c29p-1f;

    life4_12 = ((spill44_0) ? 1 : 0);

    spill44_1 = ((com.moon.n6)(receiver)).v;

    if (!((life4_12 == 0))) {

        forwardValue44_24_0 = ((spill44_1) ? 1 : 0);

        break forward_join_24;

    }

    if (!(spill44_1)) {

        break forward_join_22;

    }

    life5_11 = (life5_11 * 0x1.333334p-2f);

    }

    forwardValue44_24_0 = ((p0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);

    }

    if (!((life4_12 == 0))) {

        forwardValue44_41_0 = forwardValue44_24_0;

        break forward_join_41;

    }

    if (!((forwardValue44_24_0 != 0))) {

        break forward_join_37;

    }

    spill44_2 = ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)))).M();

    if (!((life4_12 == 0))) {

        forwardValue44_41_0 = ((spill44_2) ? 1 : 0);

        break forward_join_41;

    }

    if (!(spill44_2)) {

        break forward_join_37;

    }

    life5_11 = (life5_11 * 0x1.99999ap-3f);

    }

    spill44_3 = receiver;

    if (!((life4_12 == 0))) {

        forwardValue44_51_0 = spill44_3;

        break forward_join_51;

    }

    forwardValue44_41_0 = ((((com.moon.n6)(spill44_3)).v) ? 1 : 0);

    }

    if (!((forwardValue44_41_0 == 0))) {

        break forward_join_50;

    }

    spill44_4 = receiver;

    if (!((life4_12 == 0))) {

        forwardValue44_51_0 = spill44_4;

        break forward_join_51;

    }

    if (!(((com.moon.n6)(spill44_4)).u)) {

        break forward_join_50;

    }

    ((com.moon.n6)(receiver)).w = ((boolean)(true));

    }

    forwardValue44_51_0 = receiver;

    }

    life6_85 = com.moon.n8.a(((float)((((com.moon.n6)(forwardValue44_51_0)).d * com.moon.nI.e))), ((float)(((com.moon.n6)(receiver)).i)), ((float)(((com.moon.n6)(receiver)).k)), ((float)(0x1.820c4ap-1f)), ((float)(life5_11)));

    life7_88 = com.moon.nI.a(((float[])(life6_85)));

    ((com.moon.n6)(receiver)).p = ((float)(((life5_11 * (life6_85)[0]) / life7_88)));

    ((com.moon.n6)(receiver)).q = ((float)(((life5_11 * (life6_85)[1]) / life7_88)));

    spill44_5 = receiver;

    spill44_6 = recovery.source.CarrierOps.dcmpl(((double)((((double) ((com.moon.n6)(receiver)).g) % 0x1.0p-6d))), ((double)(0x0.0p0d)));

    if (!((life4_12 == 0))) {

        forwardValue44_95_0 = spill44_5;

        forwardValue44_95_1 = spill44_6;

        break forward_join_95;

    }

    if (!((spill44_6 == 0))) {

        forwardValue44_96_0 = spill44_5;

        break forward_join_96;

    }

    forwardValue44_95_0 = spill44_5;

    forwardValue44_95_1 = 1;

    }

    forwardValue44_97_0 = forwardValue44_95_0;

    forwardValue44_97_1 = forwardValue44_95_1;

    break forward_join_97;

    }

    forwardValue44_97_0 = forwardValue44_96_0;

    forwardValue44_97_1 = 0;

    }

    ((com.moon.n6)(forwardValue44_97_0)).t = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue44_97_1)));

    return;

}



public n6(net.minecraft.entity.EntityLivingBase p0, float p1, float p2) { super(); }


private static void __sourceConstructorBody_71cbc2b9f02a5bc7(com.moon.n6 receiver, net.minecraft.entity.EntityLivingBase p0, float p1, float p2) throws Throwable {

boolean spill45_0;

    com.moon.n6 spill45_1;

    com.moon.n6 joinValue45_1_0;

    long life4_3;

    int life6_39;

    life4_3 = (com.moon.n6.x ^ 24345937246521L);

    com.moon.n6.__sourceConstructorInit_71cbc2b9f02a5bc7_0(((com.moon.n6)(receiver)));

    ((com.moon.n6)(receiver)).b = ((java.util.ArrayList)(new java.util.ArrayList()));

    ((com.moon.n6)(receiver)).c = ((net.minecraft.entity.EntityLivingBase)(p0));

    ((com.moon.n6)(receiver)).f = ((float)(((float) ((net.minecraft.entity.EntityLivingBase)(p0)).n)));

    ((com.moon.n6)(receiver)).g = ((float)(((float) ((moom.CA)(((net.minecraft.entity.EntityLivingBase)(p0)).b())).c)));

    ((com.moon.n6)(receiver)).h = ((float)(((float) ((net.minecraft.entity.EntityLivingBase)(p0)).p)));

    spill45_0 = moom.fw.a__Boolean();

    ((com.moon.n6)(receiver)).i = ((float)(((float) (((net.minecraft.entity.EntityLivingBase)(p0)).n - ((net.minecraft.entity.EntityLivingBase)(p0)).M))));

    life6_39 = ((spill45_0) ? 1 : 0);

    ((com.moon.n6)(receiver)).j = ((float)(((float) (((net.minecraft.entity.EntityLivingBase)(p0)).o - ((net.minecraft.entity.EntityLivingBase)(p0)).N))));

    ((com.moon.n6)(receiver)).k = ((float)(((float) (((net.minecraft.entity.EntityLivingBase)(p0)).p - ((net.minecraft.entity.EntityLivingBase)(p0)).O))));

    ((com.moon.n6)(receiver)).l = ((float)(((net.minecraft.entity.EntityLivingBase)(p0)).G));

    ((com.moon.n6)(receiver)).m = ((float)(((net.minecraft.entity.EntityLivingBase)(p0)).H));

    ((com.moon.n6)(receiver)).d = ((float)(((net.minecraft.entity.EntityLivingBase)(p0)).w));

    ((com.moon.n6)(receiver)).u = ((boolean)(((net.minecraft.entity.EntityLivingBase)(p0)).u__Boolean()));

    ((com.moon.n6)(receiver)).v = ((boolean)(((net.minecraft.entity.EntityLivingBase)(p0)).t__Boolean()));

    ((com.moon.n6)(receiver)).p = ((float)(p1));

    ((com.moon.n6)(receiver)).q = ((float)(p2));

    spill45_1 = receiver;

    if ((life6_39 == 0)) {

        if ((((com.moon.n6)(spill45_1)).p < 0x0.0p0f)) {

        ((com.moon.n6)(receiver)).u = ((boolean)(false));

    } else {

        

    }

        joinValue45_1_0 = receiver;

    } else {

        joinValue45_1_0 = spill45_1;

    }

    ((com.moon.n6)(joinValue45_1_0)).n = ((float)(0x1.333334p-1f));

    return;

}



static {
x = ((long)(((moom._a)(moom._c.a(((long)(-1051438113402996743L)), ((long)(1250067099329667952L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(41871969199465L)))));
    A = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.n6.x ^ 76461762351267L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill302_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill302_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill302_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill302_14 = new byte[8];
    (__sourceSpill302_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill302_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation302_16 = __sourceSpill302_14;
    ((javax.crypto.Cipher)(__sourceSpill302_11)).init(((int)(__sourceSpill302_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill302_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation302_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[22];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "tvß\022qxþkc*×ÐxÔÜK¤ö\033ª g\\­ºÛ,ò\177'?kyÊ4®ôÄ;5\\Üb¸M-È3¹Ë\030$ÿçÞÛw6õ¼Ù\003}Üî@J°¦ÏÊCt !L(\005pö¯yØ2ÅÝÓ\001«\006¸3V\004ÌÝÝzÑÐ\002¯\017\020¬¶<0æËvJ\017<É_³\037W t¹\037h\002=L×:úm\024}u¡àÙþ#E¬\rC¯%ýîéz\020î\004\t#\nÀkDø/\027á@÷)\002õC­\026ãÈ¡ÿ­FÙßÌo\037jD¶÷ñ1rËø\tfËðE~iÿ\n¡\030¦bà.>_Î \177\021Ëè¯c¹7¼\035éUÔs\020SN7µýàíf¬ú¯\0174@\036 \035\030ÓÑWä,9}eñùúP¶>t\027=¯'\017â\020I½åÏÜÞ\"Ó§Wó£Ââ(Ô\r®6\021Cåä\016i{-BäBN·XÊä¬\004hhX{E\tÍ\035q\be%§\0301Ùô¦Á9á´¬ª\013À>C\037==ÃkJf\020íñ¤ç\031E,\rD°îÖ\025zÙ;\030rêeg¡`H\0375YÆ`ò¹QìÿþOM(\022G¶Û*\031TOCÓ#é2\022ö»ÑSª:j;ÄE5`wÊ£Üµ{\0050FOh§¦ ÖòSû÷Lþ\026Ý\0168A¨¢0M¿ÕÍOWKZ\025|ë, Cÿ&ÜðËÞ/\016³'u-ö\030§»n;:ÕqÒ\005Î\023{\013Ô\fü»\020H\000|XÏG5¡\021¹\026,X£(¿\034æÇ¬ì:ÅTÃ4'\027Îw¶Kÿ \tw3ÀÜ\001XÃAóê6»¥w¥"))).length();
    int local16_life24 = 24;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill302_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill302_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill302_29)).doFinal(((byte[])(__sourceSpill302_28)));
        java.lang.String __sourceSpill302_34 = ((java.lang.String)(com.moon.n6.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill302_35 = local20_life19;
        int __sourceSpill302_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill302_35)[__sourceSpill302_36] = __sourceSpill302_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "Ñ,î\003ÜëQZÄMrr(¼={FP×z\\Oü\\\035é\035á\020é\004-Un³ì\037\037Ùùª"))).length();
    local16_life24 = 32;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill302_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill302_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill302_42)).doFinal(((byte[])(__sourceSpill302_41)));
        java.lang.String __sourceSpill302_47 = ((java.lang.String)(com.moon.n6.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill302_48 = local20_life19;
        int __sourceSpill302_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill302_48)[__sourceSpill302_49] = __sourceSpill302_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    y = ((java.lang.String[])(local20_life19));
    z = ((java.lang.String[])(new java.lang.String[22]));
    D = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill302_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill302_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill302_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill302_60 = new byte[8];
    (__sourceSpill302_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill302_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation302_62 = __sourceSpill302_60;
    ((javax.crypto.Cipher)(__sourceSpill302_57)).init(((int)(__sourceSpill302_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill302_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation302_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[8];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "ÊB\025d¨V(@T­\b\026ËüRN¦mÃüf\0306æ\006Zk7y\025DfÕ¤iz¯RX.µ"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill302_71 = local4_life67;
        int __sourceSpill302_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill302_71)).substring(((int)(__sourceSpill302_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill302_76 = local6_life65;
        int __sourceSpill302_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill302_79 = new byte[8];
        (__sourceSpill302_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill302_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill302_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill302_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill302_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill302_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill302_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill302_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill302_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill302_80)).doFinal(((byte[])(__sourceSpill302_79)));
        (__sourceSpill302_76)[__sourceSpill302_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "Âyg®ÅÂÕ\031è8ËGNÙj"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill302_84 = local4_life67;
        int __sourceSpill302_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill302_84)).substring(((int)(__sourceSpill302_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill302_89 = local6_life65;
        int __sourceSpill302_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill302_92 = new byte[8];
        (__sourceSpill302_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill302_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill302_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill302_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill302_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill302_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill302_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill302_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill302_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill302_93)).doFinal(((byte[])(__sourceSpill302_92)));
        (__sourceSpill302_89)[__sourceSpill302_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    B = ((long[])(local6_life65));
    C = ((java.lang.Integer[])(new java.lang.Integer[8]));
    a = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));
}

private static native <E extends Throwable> void __sourceConstructorInit_f6ef1096222100ec_0(com.moon.n6 a0, net.minecraft.entity.EntityLivingBase a1, float a2, float a3) throws E;
private static native <E extends Throwable> void __sourceConstructorInit_71cbc2b9f02a5bc7_0(com.moon.n6 a0) throws E;

public boolean equals(java.lang.Object p0) {
java.lang.Object forestValue720001_14_0;
    java.lang.Object forestValue720001_21_0;
    int forestValue720001_36_0;
    int forestValue720001_46_0;
    int forestValue720001_56_0;
    int forestValue720001_66_0;
    int forestValue720001_76_0;
    int forestValue720001_86_0;
    int forestValue720001_96_0;
    int forestValue720001_106_0;
    int forestValue720001_116_0;
    int forestValue720001_126_0;
    int forestValue720001_136_0;
    int forestValue720001_146_0;
    int forestValue720001_156_0;
    int forestValue720001_166_0;
    int forestValue720001_173_0;
    int forestValue720001_184_0;
    int forestValue720001_184_1;
    int forestValue720001_193_0;
    int forestValue720001_193_1;
    int forestValue720001_202_0;
    int forestValue720001_202_1;
    int forestValue720001_211_0;
    int forestValue720001_211_1;
    int forestValue720001_222_0;
    int forestValue720001_222_1;
    com.moon.n6 forestValue720001_226_0;
    java.util.ArrayList forestValue720001_239_0;
    int forestValue720001_245_0;
    net.minecraft.entity.EntityLivingBase forestValue720001_260_0;
    int forestValue720001_268_0;
    java.lang.Object spill720001_0;
    boolean spill720001_1;
    boolean spill720001_2;
    com.moon.n6 spill720001_3;
    java.util.ArrayList spill720001_4;
    boolean spill720001_5;
    net.minecraft.entity.EntityLivingBase spill720001_6;
    boolean spill720001_7;
    long life2_3;
    int life4_5;
    com.moon.n6 life5_24;
    java.util.ArrayList life6_250;
    java.util.ArrayList life7_253;
    net.minecraft.entity.EntityLivingBase life8_274;
    net.minecraft.entity.EntityLivingBase life9_277;
    forest_join_268: {
    forest_join_267: {
    forest_join_265: {
    forest_join_260: {
    forest_join_259: {
    forest_join_246: {
    forest_join_245: {
    forest_join_244: {
    forest_join_239: {
    forest_join_238: {
    forest_join_226: {
    forest_join_225: {
    forest_join_222: {
    forest_join_216: {
    forest_join_211: {
    forest_join_207: {
    forest_join_202: {
    forest_join_198: {
    forest_join_193: {
    forest_join_189: {
    forest_join_184: {
    forest_join_180: {
    forest_join_173: {
    forest_join_171: {
    forest_join_166: {
    forest_join_161: {
    forest_join_156: {
    forest_join_151: {
    forest_join_146: {
    forest_join_141: {
    forest_join_136: {
    forest_join_131: {
    forest_join_126: {
    forest_join_121: {
    forest_join_116: {
    forest_join_111: {
    forest_join_106: {
    forest_join_101: {
    forest_join_96: {
    forest_join_91: {
    forest_join_86: {
    forest_join_81: {
    forest_join_76: {
    forest_join_71: {
    forest_join_66: {
    forest_join_61: {
    forest_join_56: {
    forest_join_51: {
    forest_join_46: {
    forest_join_41: {
    forest_join_36: {
    forest_join_31: {
    forest_join_21: {
    forest_join_20: {
    forest_join_14: {
    forest_join_13: {
    life2_3 = (com.moon.n6.x ^ 7148904398481L);
    life4_5 = ((__sourceExactCall_947f444da39f47()) ? 1 : 0);
    spill720001_0 = p0;
    if (!((life4_5 != 0))) {
        forestValue720001_14_0 = spill720001_0;
        break forest_join_14;
    }
    if (!((spill720001_0 == this))) {
        break forest_join_13;
    }
    return ((1) != 0);
    }
    forestValue720001_14_0 = p0;
    }
    if (!((life4_5 != 0))) {
        forestValue720001_21_0 = forestValue720001_14_0;
        break forest_join_21;
    }
    if (!((((forestValue720001_14_0 instanceof com.moon.n6) ? 1 : 0) == 0))) {
        break forest_join_20;
    }
    return ((0) != 0);
    }
    forestValue720001_21_0 = p0;
    }
    life5_24 = ((com.moon.n6)(forestValue720001_21_0));
    spill720001_1 = ((com.moon.n6)(life5_24)).a(((java.lang.Object)(this)));
    if (!((life4_5 != 0))) {
        forestValue720001_36_0 = ((spill720001_1) ? 1 : 0);
        break forest_join_36;
    }
    if (!((!spill720001_1))) {
        break forest_join_31;
    }
    return ((0) != 0);
    }
    forestValue720001_36_0 = java.lang.Float.compare(((float)(((com.moon.n6)(this)).a())), ((float)(((com.moon.n6)(life5_24)).a())));
    }
    if (!((life4_5 != 0))) {
        forestValue720001_46_0 = forestValue720001_36_0;
        break forest_join_46;
    }
    if (!((forestValue720001_36_0 != 0))) {
        break forest_join_41;
    }
    return ((0) != 0);
    }
    forestValue720001_46_0 = java.lang.Float.compare(((float)(((com.moon.n6)(this)).b())), ((float)(((com.moon.n6)(life5_24)).b())));
    }
    if (!((life4_5 != 0))) {
        forestValue720001_56_0 = forestValue720001_46_0;
        break forest_join_56;
    }
    if (!((forestValue720001_46_0 != 0))) {
        break forest_join_51;
    }
    return ((0) != 0);
    }
    forestValue720001_56_0 = java.lang.Float.compare(((float)(((com.moon.n6)(this)).c())), ((float)(((com.moon.n6)(life5_24)).c())));
    }
    if (!((life4_5 != 0))) {
        forestValue720001_66_0 = forestValue720001_56_0;
        break forest_join_66;
    }
    if (!((forestValue720001_56_0 != 0))) {
        break forest_join_61;
    }
    return ((0) != 0);
    }
    forestValue720001_66_0 = java.lang.Float.compare(((float)(((com.moon.n6)(this)).d())), ((float)(((com.moon.n6)(life5_24)).d())));
    }
    if (!((life4_5 != 0))) {
        forestValue720001_76_0 = forestValue720001_66_0;
        break forest_join_76;
    }
    if (!((forestValue720001_66_0 != 0))) {
        break forest_join_71;
    }
    return ((0) != 0);
    }
    forestValue720001_76_0 = java.lang.Float.compare(((float)(((com.moon.n6)(this)).e())), ((float)(((com.moon.n6)(life5_24)).e())));
    }
    if (!((life4_5 != 0))) {
        forestValue720001_86_0 = forestValue720001_76_0;
        break forest_join_86;
    }
    if (!((forestValue720001_76_0 != 0))) {
        break forest_join_81;
    }
    return ((0) != 0);
    }
    forestValue720001_86_0 = java.lang.Float.compare(((float)(((com.moon.n6)(this)).f())), ((float)(((com.moon.n6)(life5_24)).f())));
    }
    if (!((life4_5 != 0))) {
        forestValue720001_96_0 = forestValue720001_86_0;
        break forest_join_96;
    }
    if (!((forestValue720001_86_0 != 0))) {
        break forest_join_91;
    }
    return ((0) != 0);
    }
    forestValue720001_96_0 = java.lang.Float.compare(((float)(((com.moon.n6)(this)).g())), ((float)(((com.moon.n6)(life5_24)).g())));
    }
    if (!((life4_5 != 0))) {
        forestValue720001_106_0 = forestValue720001_96_0;
        break forest_join_106;
    }
    if (!((forestValue720001_96_0 != 0))) {
        break forest_join_101;
    }
    return ((0) != 0);
    }
    forestValue720001_106_0 = java.lang.Float.compare(((float)(((com.moon.n6)(this)).h())), ((float)(((com.moon.n6)(life5_24)).h())));
    }
    if (!((life4_5 != 0))) {
        forestValue720001_116_0 = forestValue720001_106_0;
        break forest_join_116;
    }
    if (!((forestValue720001_106_0 != 0))) {
        break forest_join_111;
    }
    return ((0) != 0);
    }
    forestValue720001_116_0 = java.lang.Float.compare(((float)(((com.moon.n6)(this)).i())), ((float)(((com.moon.n6)(life5_24)).i())));
    }
    if (!((life4_5 != 0))) {
        forestValue720001_126_0 = forestValue720001_116_0;
        break forest_join_126;
    }
    if (!((forestValue720001_116_0 != 0))) {
        break forest_join_121;
    }
    return ((0) != 0);
    }
    forestValue720001_126_0 = java.lang.Float.compare(((float)(((com.moon.n6)(this)).j())), ((float)(((com.moon.n6)(life5_24)).j())));
    }
    if (!((life4_5 != 0))) {
        forestValue720001_136_0 = forestValue720001_126_0;
        break forest_join_136;
    }
    if (!((forestValue720001_126_0 != 0))) {
        break forest_join_131;
    }
    return ((0) != 0);
    }
    forestValue720001_136_0 = java.lang.Float.compare(((float)(((com.moon.n6)(this)).k())), ((float)(((com.moon.n6)(life5_24)).k())));
    }
    if (!((life4_5 != 0))) {
        forestValue720001_146_0 = forestValue720001_136_0;
        break forest_join_146;
    }
    if (!((forestValue720001_136_0 != 0))) {
        break forest_join_141;
    }
    return ((0) != 0);
    }
    forestValue720001_146_0 = java.lang.Float.compare(((float)(((com.moon.n6)(this)).l())), ((float)(((com.moon.n6)(life5_24)).l())));
    }
    if (!((life4_5 != 0))) {
        forestValue720001_156_0 = forestValue720001_146_0;
        break forest_join_156;
    }
    if (!((forestValue720001_146_0 != 0))) {
        break forest_join_151;
    }
    return ((0) != 0);
    }
    forestValue720001_156_0 = java.lang.Float.compare(((float)(((com.moon.n6)(this)).m())), ((float)(((com.moon.n6)(life5_24)).m())));
    }
    if (!((life4_5 != 0))) {
        forestValue720001_166_0 = forestValue720001_156_0;
        break forest_join_166;
    }
    if (!((forestValue720001_156_0 != 0))) {
        break forest_join_161;
    }
    return ((0) != 0);
    }
    forestValue720001_166_0 = java.lang.Float.compare(((float)(((com.moon.n6)(this)).n())), ((float)(((com.moon.n6)(life5_24)).n())));
    }
    if (!((life4_5 != 0))) {
        forestValue720001_173_0 = forestValue720001_166_0;
        break forest_join_173;
    }
    if (!((forestValue720001_166_0 != 0))) {
        break forest_join_171;
    }
    return ((0) != 0);
    }
    forestValue720001_173_0 = ((((com.moon.n6)(this)).e__Boolean()) ? 1 : 0);
    }
    spill720001_2 = ((com.moon.n6)(life5_24)).e__Boolean();
    if (!((life4_5 != 0))) {
        forestValue720001_184_0 = forestValue720001_173_0;
        forestValue720001_184_1 = ((spill720001_2) ? 1 : 0);
        break forest_join_184;
    }
    if (!((forestValue720001_173_0 != ((spill720001_2) ? 1 : 0)))) {
        break forest_join_180;
    }
    return ((0) != 0);
    }
    forestValue720001_184_0 = ((((com.moon.n6)(this)).f__Boolean()) ? 1 : 0);
    forestValue720001_184_1 = ((((com.moon.n6)(life5_24)).f__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forestValue720001_193_0 = forestValue720001_184_0;
        forestValue720001_193_1 = forestValue720001_184_1;
        break forest_join_193;
    }
    if (!((forestValue720001_184_0 != forestValue720001_184_1))) {
        break forest_join_189;
    }
    return ((0) != 0);
    }
    forestValue720001_193_0 = ((((com.moon.n6)(this)).g__Boolean()) ? 1 : 0);
    forestValue720001_193_1 = ((((com.moon.n6)(life5_24)).g__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forestValue720001_202_0 = forestValue720001_193_0;
        forestValue720001_202_1 = forestValue720001_193_1;
        break forest_join_202;
    }
    if (!((forestValue720001_193_0 != forestValue720001_193_1))) {
        break forest_join_198;
    }
    return ((0) != 0);
    }
    forestValue720001_202_0 = ((((com.moon.n6)(this)).h__Boolean()) ? 1 : 0);
    forestValue720001_202_1 = ((((com.moon.n6)(life5_24)).h__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forestValue720001_211_0 = forestValue720001_202_0;
        forestValue720001_211_1 = forestValue720001_202_1;
        break forest_join_211;
    }
    if (!((forestValue720001_202_0 != forestValue720001_202_1))) {
        break forest_join_207;
    }
    return ((0) != 0);
    }
    forestValue720001_211_0 = ((((com.moon.n6)(this)).i__Boolean()) ? 1 : 0);
    forestValue720001_211_1 = ((((com.moon.n6)(life5_24)).i__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forestValue720001_222_0 = forestValue720001_211_0;
        forestValue720001_222_1 = forestValue720001_211_1;
        break forest_join_222;
    }
    if (!((forestValue720001_211_0 != forestValue720001_211_1))) {
        break forest_join_216;
    }
    return ((0) != 0);
    }
    spill720001_3 = this;
    if (!((life4_5 != 0))) {
        forestValue720001_226_0 = spill720001_3;
        break forest_join_226;
    }
    forestValue720001_222_0 = ((((com.moon.n6)(spill720001_3)).j__Boolean()) ? 1 : 0);
    forestValue720001_222_1 = ((((com.moon.n6)(life5_24)).j__Boolean()) ? 1 : 0);
    }
    if (!((forestValue720001_222_0 != forestValue720001_222_1))) {
        break forest_join_225;
    }
    return ((0) != 0);
    }
    forestValue720001_226_0 = this;
    }
    life6_250 = ((com.moon.n6)(forestValue720001_226_0)).a__ArrayList();
    life7_253 = ((com.moon.n6)(life5_24)).a__ArrayList();
    spill720001_4 = life6_250;
    if (!((life4_5 != 0))) {
        forestValue720001_239_0 = spill720001_4;
        break forest_join_239;
    }
    if (!((spill720001_4 == null))) {
        break forest_join_238;
    }
    if (!((life7_253 != null))) {
        break forest_join_246;
    }
    break forest_join_244;
    }
    forestValue720001_239_0 = life6_250;
    }
    spill720001_5 = ((java.lang.Object)(forestValue720001_239_0)).equals(((java.lang.Object)(life7_253)));
    if (!((life4_5 != 0))) {
        forestValue720001_245_0 = ((spill720001_5) ? 1 : 0);
        break forest_join_245;
    }
    if (!((!spill720001_5))) {
        break forest_join_246;
    }
    }
    forestValue720001_245_0 = 0;
    }
    return ((forestValue720001_245_0) != 0);
    }
    life8_274 = ((com.moon.n6)(this)).a__sG();
    life9_277 = ((com.moon.n6)(life5_24)).a__sG();
    spill720001_6 = life8_274;
    if (!((life4_5 != 0))) {
        forestValue720001_260_0 = spill720001_6;
        break forest_join_260;
    }
    if (!((spill720001_6 == null))) {
        break forest_join_259;
    }
    if (!((life9_277 != null))) {
        break forest_join_267;
    }
    break forest_join_265;
    }
    forestValue720001_260_0 = life8_274;
    }
    spill720001_7 = ((java.lang.Object)(forestValue720001_260_0)).equals(((java.lang.Object)(life9_277)));
    if (!((life4_5 != 0))) {
        forestValue720001_268_0 = ((spill720001_7) ? 1 : 0);
        break forest_join_268;
    }
    if (!((!spill720001_7))) {
        break forest_join_267;
    }
    }
    return ((0) != 0);
    }
    forestValue720001_268_0 = 1;
    }
    return ((forestValue720001_268_0) != 0);
}


public java.lang.String toString() {
long local1 = (com.moon.n6.x ^ 122290052591757L);
    java.util.ArrayList __sourceSpill841_23 = ((com.moon.n6)(this)).a__ArrayList();
    net.minecraft.entity.EntityLivingBase __sourceSpill841_24 = ((com.moon.n6)(this)).a__sG();
    float __sourceSpill841_25 = ((com.moon.n6)(this)).a();
    float __sourceSpill841_26 = ((com.moon.n6)(this)).b();
    float __sourceSpill841_27 = ((com.moon.n6)(this)).c();
    float __sourceSpill841_28 = ((com.moon.n6)(this)).d();
    float __sourceSpill841_29 = ((com.moon.n6)(this)).e();
    float __sourceSpill841_30 = ((com.moon.n6)(this)).f();
    float __sourceSpill841_31 = ((com.moon.n6)(this)).g();
    float __sourceSpill841_32 = ((com.moon.n6)(this)).h();
    float __sourceSpill841_33 = ((com.moon.n6)(this)).i();
    float __sourceSpill841_34 = ((com.moon.n6)(this)).j();
    float __sourceSpill841_35 = ((com.moon.n6)(this)).k();
    float __sourceSpill841_36 = ((com.moon.n6)(this)).l();
    float __sourceSpill841_37 = ((com.moon.n6)(this)).m();
    float __sourceSpill841_38 = ((com.moon.n6)(this)).n();
    boolean __sourceSpill841_39 = ((com.moon.n6)(this)).e__Boolean();
    boolean __sourceSpill841_40 = ((com.moon.n6)(this)).f__Boolean();
    boolean __sourceSpill841_41 = ((com.moon.n6)(this)).g__Boolean();
    boolean __sourceSpill841_42 = ((com.moon.n6)(this)).h__Boolean();
    boolean __sourceSpill841_43 = ((com.moon.n6)(this)).i__Boolean();
    boolean local3 = ((com.moon.n6)(this)).j__Boolean();
    boolean local4 = __sourceSpill841_43;
    boolean local5 = __sourceSpill841_42;
    boolean local6 = __sourceSpill841_41;
    boolean local7 = __sourceSpill841_40;
    boolean local8 = __sourceSpill841_39;
    float local9 = __sourceSpill841_38;
    float local10 = __sourceSpill841_37;
    float local11 = __sourceSpill841_36;
    float local12 = __sourceSpill841_35;
    float local13 = __sourceSpill841_34;
    float local14 = __sourceSpill841_33;
    float local15 = __sourceSpill841_32;
    float local16 = __sourceSpill841_31;
    float local17 = __sourceSpill841_30;
    float local18 = __sourceSpill841_29;
    float local19 = __sourceSpill841_28;
    float local20 = __sourceSpill841_27;
    float local21 = __sourceSpill841_26;
    float local22 = __sourceSpill841_25;
    net.minecraft.entity.EntityLivingBase local23 = __sourceSpill841_24;
    java.util.ArrayList local24 = __sourceSpill841_23;
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_66(__sourceIntrinsic_a86c261fcdee_originalDynamicSite841_44(27209, (3533620262073123805L ^ local1)), local24, __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_45(19600, (2137922596569277714L ^ local1)), local23, __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_46(30643, (2127815296189652518L ^ local1)), local22, __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_47(23173, (8300245750015259414L ^ local1)), local21, __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_48(23654, (1116493587967768061L ^ local1)), local20, __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_49(15936, (5223502304994924505L ^ local1)), local19, __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_50(27870, (3209867416502420809L ^ local1)), local18, __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_51(2076, (8883313507157320093L ^ local1)), local17, __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_52(2657, (7612909211767284735L ^ local1)), local16, __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_53(880, (6944579073738386166L ^ local1)), local15, __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_54(25921, (5605477444957752535L ^ local1)), local14, __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_55(30374, (4224119706334158651L ^ local1)), local13, __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_56(9699, (5629460345246583904L ^ local1)), local12, __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_57(17145, (645377443713575777L ^ local1)), local11, __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_58(28252, (4611213818434996172L ^ local1)), local10, __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_59(4227, (7964525784844450065L ^ local1)), local9, __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_60(26972, (3689416719812182236L ^ local1)), local8, __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_61(15583, (6663545231196984643L ^ local1)), local7, __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_62(4562, (2865401066106566733L ^ local1)), local6, __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_63(19326, (1431445525509268217L ^ local1)), local5, __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_64(2666, (3221756752503383024L ^ local1)), local4, __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_65(21443, (4307877718896114258L ^ local1)), local3, ")");
}


public int hashCode() {
int forwardValue1001_199_0;
    int forwardValue1001_199_1;
    int forwardValue1001_200_0;
    int forwardValue1001_205_0;
    int forwardValue1001_205_1;
    int forwardValue1001_224_0;
    int forwardValue1001_224_1;
    int forwardValue1001_225_0;
    int forwardValue1001_230_0;
    int forwardValue1001_230_1;
    int forwardValue1001_249_0;
    int forwardValue1001_249_1;
    int forwardValue1001_250_0;
    int forwardValue1001_255_0;
    int forwardValue1001_255_1;
    int forwardValue1001_274_0;
    int forwardValue1001_274_1;
    int forwardValue1001_275_0;
    int forwardValue1001_280_0;
    int forwardValue1001_280_1;
    int forwardValue1001_299_0;
    int forwardValue1001_299_1;
    int forwardValue1001_300_0;
    int forwardValue1001_305_0;
    int forwardValue1001_305_1;
    int forwardValue1001_324_0;
    int forwardValue1001_324_1;
    int forwardValue1001_325_0;
    int forwardValue1001_330_0;
    int forwardValue1001_330_1;
    int forwardValue1001_352_0;
    int forwardValue1001_353_0;
    java.util.ArrayList forwardValue1001_353_1;
    int forwardValue1001_354_0;
    int forwardValue1001_354_1;
    int forwardValue1001_376_0;
    int forwardValue1001_377_0;
    net.minecraft.entity.EntityLivingBase forwardValue1001_377_1;
    int forwardValue1001_378_0;
    int forwardValue1001_378_1;
    int forwardValue1001_386_0;
    boolean spill1001_0;
    int spill1001_1;
    boolean spill1001_2;
    int spill1001_3;
    boolean spill1001_4;
    int spill1001_5;
    boolean spill1001_6;
    int spill1001_7;
    boolean spill1001_8;
    int spill1001_9;
    boolean spill1001_10;
    int spill1001_11;
    boolean spill1001_12;
    int spill1001_13;
    java.util.ArrayList spill1001_14;
    int spill1001_15;
    net.minecraft.entity.EntityLivingBase spill1001_16;
    int spill1001_17;
    long life1_3;
    int life4_9;
    int life5_11;
    int life5_23;
    int life5_35;
    int life5_48;
    int life3_49;
    int life5_61;
    int life5_73;
    int life5_85;
    int life5_97;
    int life5_109;
    int life5_121;
    int life5_133;
    int life5_145;
    int life5_157;
    int life5_169;
    int life5_181;
    int life5_209;
    int life5_237;
    int life5_265;
    int life5_293;
    int life5_321;
    int life5_349;
    java.util.ArrayList life6_352;
    int life5_378;
    net.minecraft.entity.EntityLivingBase life7_381;
    int life5_407;
    forward_join_386: {
    forward_join_378: {
    forward_join_377: {
    forward_join_376: {
    forward_join_354: {
    forward_join_353: {
    forward_join_352: {
    forward_join_330: {
    forward_join_325: {
    forward_join_324: {
    forward_join_305: {
    forward_join_300: {
    forward_join_299: {
    forward_join_280: {
    forward_join_275: {
    forward_join_274: {
    forward_join_255: {
    forward_join_250: {
    forward_join_249: {
    forward_join_230: {
    forward_join_225: {
    forward_join_224: {
    forward_join_205: {
    forward_join_200: {
    forward_join_199: {
    life1_3 = (com.moon.n6.x ^ 18303962769491L);
    life4_9 = __sourceIntrinsic_1861091996aa_invokedynamic1001_1(6284, (6348966616270538093L ^ life1_3));
    life5_11 = 1;
    life5_23 = ((life5_11 * __sourceIntrinsic_1861091996aa_invokedynamic1001_2(20210, (7911339635044766484L ^ life1_3))) + java.lang.Float.floatToIntBits(((float)(((com.moon.n6)(this)).a()))));
    life5_35 = ((life5_23 * __sourceIntrinsic_1861091996aa_invokedynamic1001_5(20210, (7911339635044766484L ^ life1_3))) + java.lang.Float.floatToIntBits(((float)(((com.moon.n6)(this)).b()))));
    spill1001_0 = moom.fw.a__Boolean();
    life5_48 = ((life5_35 * __sourceIntrinsic_1861091996aa_invokedynamic1001_9(20210, (7911339635044766484L ^ life1_3))) + java.lang.Float.floatToIntBits(((float)(((com.moon.n6)(this)).c()))));
    life3_49 = ((spill1001_0) ? 1 : 0);
    life5_61 = ((life5_48 * __sourceIntrinsic_1861091996aa_invokedynamic1001_13(20210, (7911339635044766484L ^ life1_3))) + java.lang.Float.floatToIntBits(((float)(((com.moon.n6)(this)).d()))));
    life5_73 = ((life5_61 * __sourceIntrinsic_1861091996aa_invokedynamic1001_16(20210, (7911339635044766484L ^ life1_3))) + java.lang.Float.floatToIntBits(((float)(((com.moon.n6)(this)).e()))));
    life5_85 = ((life5_73 * __sourceIntrinsic_1861091996aa_invokedynamic1001_19(20210, (7911339635044766484L ^ life1_3))) + java.lang.Float.floatToIntBits(((float)(((com.moon.n6)(this)).f()))));
    life5_97 = ((life5_85 * __sourceIntrinsic_1861091996aa_invokedynamic1001_22(20210, (7911339635044766484L ^ life1_3))) + java.lang.Float.floatToIntBits(((float)(((com.moon.n6)(this)).g()))));
    life5_109 = ((life5_97 * __sourceIntrinsic_1861091996aa_invokedynamic1001_25(20210, (7911339635044766484L ^ life1_3))) + java.lang.Float.floatToIntBits(((float)(((com.moon.n6)(this)).h()))));
    life5_121 = ((life5_109 * __sourceIntrinsic_1861091996aa_invokedynamic1001_28(20210, (7911339635044766484L ^ life1_3))) + java.lang.Float.floatToIntBits(((float)(((com.moon.n6)(this)).i()))));
    life5_133 = ((life5_121 * __sourceIntrinsic_1861091996aa_invokedynamic1001_31(20210, (7911339635044766484L ^ life1_3))) + java.lang.Float.floatToIntBits(((float)(((com.moon.n6)(this)).j()))));
    life5_145 = ((life5_133 * __sourceIntrinsic_1861091996aa_invokedynamic1001_34(20210, (7911339635044766484L ^ life1_3))) + java.lang.Float.floatToIntBits(((float)(((com.moon.n6)(this)).k()))));
    life5_157 = ((life5_145 * __sourceIntrinsic_1861091996aa_invokedynamic1001_37(20210, (7911339635044766484L ^ life1_3))) + java.lang.Float.floatToIntBits(((float)(((com.moon.n6)(this)).l()))));
    life5_169 = ((life5_157 * __sourceIntrinsic_1861091996aa_invokedynamic1001_40(20210, (7911339635044766484L ^ life1_3))) + java.lang.Float.floatToIntBits(((float)(((com.moon.n6)(this)).m()))));
    life5_181 = ((life5_169 * __sourceIntrinsic_1861091996aa_invokedynamic1001_43(20210, (7911339635044766484L ^ life1_3))) + java.lang.Float.floatToIntBits(((float)(((com.moon.n6)(this)).n()))));
    spill1001_1 = (life5_181 * __sourceIntrinsic_1861091996aa_invokedynamic1001_46(20210, (7911339635044766484L ^ life1_3)));
    spill1001_2 = ((com.moon.n6)(this)).e__Boolean();
    if (!((life3_49 == 0))) {
        forwardValue1001_199_0 = spill1001_1;
        forwardValue1001_199_1 = ((spill1001_2) ? 1 : 0);
        break forward_join_199;
    }
    if (!(spill1001_2)) {
        forwardValue1001_200_0 = spill1001_1;
        break forward_join_200;
    }
    forwardValue1001_199_0 = spill1001_1;
    forwardValue1001_199_1 = __sourceIntrinsic_1861091996aa_invokedynamic1001_49(17576, (3725395153225603403L ^ life1_3));
    }
    forwardValue1001_205_0 = forwardValue1001_199_0;
    forwardValue1001_205_1 = forwardValue1001_199_1;
    break forward_join_205;
    }
    forwardValue1001_205_0 = forwardValue1001_200_0;
    forwardValue1001_205_1 = __sourceIntrinsic_1861091996aa_invokedynamic1001_50(32744, (5700345578431078924L ^ life1_3));
    }
    life5_209 = (forwardValue1001_205_0 + forwardValue1001_205_1);
    spill1001_3 = (life5_209 * __sourceIntrinsic_1861091996aa_invokedynamic1001_51(20210, (7911339635044766484L ^ life1_3)));
    spill1001_4 = ((com.moon.n6)(this)).f__Boolean();
    if (!((life3_49 == 0))) {
        forwardValue1001_224_0 = spill1001_3;
        forwardValue1001_224_1 = ((spill1001_4) ? 1 : 0);
        break forward_join_224;
    }
    if (!(spill1001_4)) {
        forwardValue1001_225_0 = spill1001_3;
        break forward_join_225;
    }
    forwardValue1001_224_0 = spill1001_3;
    forwardValue1001_224_1 = __sourceIntrinsic_1861091996aa_invokedynamic1001_54(12870, (7956908548551618465L ^ life1_3));
    }
    forwardValue1001_230_0 = forwardValue1001_224_0;
    forwardValue1001_230_1 = forwardValue1001_224_1;
    break forward_join_230;
    }
    forwardValue1001_230_0 = forwardValue1001_225_0;
    forwardValue1001_230_1 = __sourceIntrinsic_1861091996aa_invokedynamic1001_55(17226, (6625223904640753322L ^ life1_3));
    }
    life5_237 = (forwardValue1001_230_0 + forwardValue1001_230_1);
    spill1001_5 = (life5_237 * __sourceIntrinsic_1861091996aa_invokedynamic1001_56(20210, (7911339635044766484L ^ life1_3)));
    spill1001_6 = ((com.moon.n6)(this)).g__Boolean();
    if (!((life3_49 == 0))) {
        forwardValue1001_249_0 = spill1001_5;
        forwardValue1001_249_1 = ((spill1001_6) ? 1 : 0);
        break forward_join_249;
    }
    if (!(spill1001_6)) {
        forwardValue1001_250_0 = spill1001_5;
        break forward_join_250;
    }
    forwardValue1001_249_0 = spill1001_5;
    forwardValue1001_249_1 = __sourceIntrinsic_1861091996aa_invokedynamic1001_59(12870, (7956908548551618465L ^ life1_3));
    }
    forwardValue1001_255_0 = forwardValue1001_249_0;
    forwardValue1001_255_1 = forwardValue1001_249_1;
    break forward_join_255;
    }
    forwardValue1001_255_0 = forwardValue1001_250_0;
    forwardValue1001_255_1 = __sourceIntrinsic_1861091996aa_invokedynamic1001_60(17226, (6625223904640753322L ^ life1_3));
    }
    life5_265 = (forwardValue1001_255_0 + forwardValue1001_255_1);
    spill1001_7 = (life5_265 * __sourceIntrinsic_1861091996aa_invokedynamic1001_61(20210, (7911339635044766484L ^ life1_3)));
    spill1001_8 = ((com.moon.n6)(this)).h__Boolean();
    if (!((life3_49 == 0))) {
        forwardValue1001_274_0 = spill1001_7;
        forwardValue1001_274_1 = ((spill1001_8) ? 1 : 0);
        break forward_join_274;
    }
    if (!(spill1001_8)) {
        forwardValue1001_275_0 = spill1001_7;
        break forward_join_275;
    }
    forwardValue1001_274_0 = spill1001_7;
    forwardValue1001_274_1 = __sourceIntrinsic_1861091996aa_invokedynamic1001_64(12870, (7956908548551618465L ^ life1_3));
    }
    forwardValue1001_280_0 = forwardValue1001_274_0;
    forwardValue1001_280_1 = forwardValue1001_274_1;
    break forward_join_280;
    }
    forwardValue1001_280_0 = forwardValue1001_275_0;
    forwardValue1001_280_1 = __sourceIntrinsic_1861091996aa_invokedynamic1001_65(17226, (6625223904640753322L ^ life1_3));
    }
    life5_293 = (forwardValue1001_280_0 + forwardValue1001_280_1);
    spill1001_9 = (life5_293 * __sourceIntrinsic_1861091996aa_invokedynamic1001_66(20210, (7911339635044766484L ^ life1_3)));
    spill1001_10 = ((com.moon.n6)(this)).i__Boolean();
    if (!((life3_49 == 0))) {
        forwardValue1001_299_0 = spill1001_9;
        forwardValue1001_299_1 = ((spill1001_10) ? 1 : 0);
        break forward_join_299;
    }
    if (!(spill1001_10)) {
        forwardValue1001_300_0 = spill1001_9;
        break forward_join_300;
    }
    forwardValue1001_299_0 = spill1001_9;
    forwardValue1001_299_1 = __sourceIntrinsic_1861091996aa_invokedynamic1001_69(12870, (7956908548551618465L ^ life1_3));
    }
    forwardValue1001_305_0 = forwardValue1001_299_0;
    forwardValue1001_305_1 = forwardValue1001_299_1;
    break forward_join_305;
    }
    forwardValue1001_305_0 = forwardValue1001_300_0;
    forwardValue1001_305_1 = __sourceIntrinsic_1861091996aa_invokedynamic1001_70(17226, (6625223904640753322L ^ life1_3));
    }
    life5_321 = (forwardValue1001_305_0 + forwardValue1001_305_1);
    spill1001_11 = (life5_321 * __sourceIntrinsic_1861091996aa_invokedynamic1001_71(20210, (7911339635044766484L ^ life1_3)));
    spill1001_12 = ((com.moon.n6)(this)).j__Boolean();
    if (!((life3_49 == 0))) {
        forwardValue1001_324_0 = spill1001_11;
        forwardValue1001_324_1 = ((spill1001_12) ? 1 : 0);
        break forward_join_324;
    }
    if (!(spill1001_12)) {
        forwardValue1001_325_0 = spill1001_11;
        break forward_join_325;
    }
    forwardValue1001_324_0 = spill1001_11;
    forwardValue1001_324_1 = __sourceIntrinsic_1861091996aa_invokedynamic1001_74(12870, (7956908548551618465L ^ life1_3));
    }
    forwardValue1001_330_0 = forwardValue1001_324_0;
    forwardValue1001_330_1 = forwardValue1001_324_1;
    break forward_join_330;
    }
    forwardValue1001_330_0 = forwardValue1001_325_0;
    forwardValue1001_330_1 = __sourceIntrinsic_1861091996aa_invokedynamic1001_75(17226, (6625223904640753322L ^ life1_3));
    }
    life5_349 = (forwardValue1001_330_0 + forwardValue1001_330_1);
    life6_352 = ((com.moon.n6)(this)).a__ArrayList();
    spill1001_13 = (life5_349 * __sourceIntrinsic_1861091996aa_invokedynamic1001_77(20210, (7911339635044766484L ^ life1_3)));
    spill1001_14 = life6_352;
    if (!((life3_49 == 0))) {
        forwardValue1001_353_0 = spill1001_13;
        forwardValue1001_353_1 = spill1001_14;
        break forward_join_353;
    }
    if (!((spill1001_14 == null))) {
        forwardValue1001_352_0 = spill1001_13;
        break forward_join_352;
    }
    forwardValue1001_354_0 = spill1001_13;
    forwardValue1001_354_1 = __sourceIntrinsic_1861091996aa_invokedynamic1001_78(27025, (1478802509702362227L ^ life1_3));
    break forward_join_354;
    }
    forwardValue1001_353_0 = forwardValue1001_352_0;
    forwardValue1001_353_1 = life6_352;
    }
    forwardValue1001_354_0 = forwardValue1001_353_0;
    forwardValue1001_354_1 = ((java.lang.Object)(forwardValue1001_353_1)).hashCode();
    }
    life5_378 = (forwardValue1001_354_0 + forwardValue1001_354_1);
    life7_381 = ((com.moon.n6)(this)).a__sG();
    spill1001_15 = (life5_378 * __sourceIntrinsic_1861091996aa_invokedynamic1001_81(20210, (7911339635044766484L ^ life1_3)));
    spill1001_16 = life7_381;
    if (!((life3_49 == 0))) {
        forwardValue1001_377_0 = spill1001_15;
        forwardValue1001_377_1 = spill1001_16;
        break forward_join_377;
    }
    if (!((spill1001_16 == null))) {
        forwardValue1001_376_0 = spill1001_15;
        break forward_join_376;
    }
    forwardValue1001_378_0 = spill1001_15;
    forwardValue1001_378_1 = __sourceIntrinsic_1861091996aa_invokedynamic1001_82(5300, (7440022152047888721L ^ life1_3));
    break forward_join_378;
    }
    forwardValue1001_377_0 = forwardValue1001_376_0;
    forwardValue1001_377_1 = life7_381;
    }
    forwardValue1001_378_0 = forwardValue1001_377_0;
    forwardValue1001_378_1 = ((java.lang.Object)(forwardValue1001_377_1)).hashCode();
    }
    life5_407 = (forwardValue1001_378_0 + forwardValue1001_378_1);
    spill1001_17 = life5_407;
    if (!((life3_49 != 0))) {
        forwardValue1001_386_0 = spill1001_17;
        break forward_join_386;
    }
    __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[5])));
    forwardValue1001_386_0 = spill1001_17;
    }
    return forwardValue1001_386_0;
}


public boolean i__Boolean() {
return ((((this.v) ? 1 : 0)) != 0);
}


public float i() {
return this.l;
}


public com.moon.n6 i(float p0) {
this.l = ((float)(p0));
    return this;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral2807_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/n6"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public float b() {
return this.e;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.n6.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public com.moon.n6 b(boolean p0) {
this.s = ((boolean)(p0));
    return this;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 31638;
      if (C[var3] == null) {
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
         long var5 = B[var3];
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
         Object[] var9 = (Object[])D.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               D.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/n6", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         C[var3] = var15;
      }

      return C[var3];
}


public com.moon.n6 b(float p0) {
this.e = ((float)(p0));
    return this;
}


private boolean b__Boolean() {
java.lang.Object local1 = ((com.moon.n6)(this)).a__CA();
    return (__sourceIntrinsic_booleanComparison((((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.n6.a)).I)).a(((moom.CA)(((moom.CA)(local1)).b(((double)(-0x1.99999ap-4d)), ((double)(-0x1.99999ap-2d)), ((double)(-0x1.99999ap-4d))))), ((moom.fn)(moom.fn.i))))) != 0);
}


private void b__Void() {
int forwardValue997_22_0;
    int forwardValue997_33_0;
    int forwardValue997_46_0;
    com.moon.n6 forwardValue997_54_0;
    com.moon.n6 forwardValue997_77_0;
    int spill997_0;
    com.moon.n6 spill997_1;
    com.moon.n6 spill997_2;
    long life1_3;
    int life3_5;
    float life4_81;
    float life5_86;
    forward_join_77: {
    forward_join_76: {
    forward_join_54: {
    forward_join_53: {
    forward_join_46: {
    forward_join_39: {
    forward_join_33: {
    forward_join_28: {
    forward_join_22: {
    forward_join_17: {
    life1_3 = (com.moon.n6.x ^ 111210628643702L);
    life3_5 = ((__sourceExactCall_947f444da39f47()) ? 1 : 0);
    spill997_0 = recovery.source.CarrierOps.fcmpg(((float)(java.lang.Math.abs(((float)(this.i))))), ((float)(0x1.47ae14p-8f)));
    if (!((life3_5 != 0))) {
        forwardValue997_22_0 = spill997_0;
        break forward_join_22;
    }
    if (!((spill997_0 < 0))) {
        break forward_join_17;
    }
    this.i = ((float)(0x0.0p0f));
    }
    forwardValue997_22_0 = recovery.source.CarrierOps.fcmpg(((float)(java.lang.Math.abs(((float)(this.j))))), ((float)(0x1.47ae14p-8f)));
    }
    if (!((life3_5 != 0))) {
        forwardValue997_33_0 = forwardValue997_22_0;
        break forward_join_33;
    }
    if (!((forwardValue997_22_0 < 0))) {
        break forward_join_28;
    }
    this.j = ((float)(0x0.0p0f));
    }
    forwardValue997_33_0 = recovery.source.CarrierOps.fcmpg(((float)(java.lang.Math.abs(((float)(this.k))))), ((float)(0x1.47ae14p-8f)));
    }
    if (!((life3_5 != 0))) {
        forwardValue997_46_0 = forwardValue997_33_0;
        break forward_join_46;
    }
    if (!((forwardValue997_33_0 < 0))) {
        break forward_join_39;
    }
    this.k = ((float)(0x0.0p0f));
    }
    this.o = ((float)(0x1.47ae14p-6f));
    spill997_1 = this;
    if (!((life3_5 != 0))) {
        forwardValue997_54_0 = spill997_1;
        break forward_join_54;
    }
    forwardValue997_46_0 = ((((com.moon.n6)(spill997_1)).u) ? 1 : 0);
    }
    if (!((forwardValue997_46_0 != 0))) {
        break forward_join_53;
    }
    com.moon.n6 __stackOp997_18_0 = this;
    ((com.moon.n6)(__stackOp997_18_0)).o = ((float)((((com.moon.n6)(__stackOp997_18_0)).o + 0x1.89374cp-8f)));
    }
    forwardValue997_54_0 = this;
    }
    life4_81 = (((com.moon.n6)(forwardValue997_54_0)).q * 0x1.f5c29p-1f);
    life5_86 = (this.p * 0x1.f5c29p-1f);
    spill997_2 = this;
    if (!((life3_5 != 0))) {
        forwardValue997_77_0 = spill997_2;
        break forward_join_77;
    }
    if (!(((com.moon.n6)(spill997_2)).v)) {
        break forward_join_76;
    }
    life5_86 = (life5_86 * 0x1.99999ap-3f);
    life4_81 = (life4_81 * 0x1.99999ap-3f);
    }
    forwardValue997_77_0 = this;
    }
    ((com.moon.n6)(forwardValue997_77_0)).a(((float)(life4_81)), ((float)(life5_86)));
    return;
}


public float e() {
return this.h;
}


public com.moon.n6 e(boolean p0) {
this.v = ((boolean)(p0));
    return this;
}


public com.moon.n6 e(float p0) {
this.h = ((float)(p0));
    return this;
}


public boolean e__Boolean() {
return ((((this.r) ? 1 : 0)) != 0);
}


private void c__Void() {
com.moon.n6 forwardValue999_42_0;
    boolean spill999_0;
    com.moon.n6 spill999_1;
    long life1_3;
    float life4_6;
    int life3_7;
    float life5_20;
    float life6_26;
    float life7_31;
    forward_join_42: {
    forward_join_41: {
    life1_3 = (com.moon.n6.x ^ 60691495813047L);
    spill999_0 = __sourceExactCall_947f444da39f47();
    life4_6 = 0x1.ae147ap-2f;
    life3_7 = ((spill999_0) ? 1 : 0);
    spill999_1 = this;
    if (!((life3_7 != 0))) {
        forwardValue999_42_0 = spill999_1;
        break forward_join_42;
    }
    if (!(((com.moon.n6)(spill999_1)).u)) {
        break forward_join_41;
    }
    life5_20 = (this.d * com.moon.nI.e);
    life6_26 = ((-moom.Dr.a(((float)(life5_20)))) * 0x1.99999ap-3f);
    life7_31 = (moom.Dr.b(((float)(life5_20))) * 0x1.99999ap-3f);
    com.moon.n6 __stackOp999_8_0 = this;
    ((com.moon.n6)(__stackOp999_8_0)).i = ((float)((((com.moon.n6)(__stackOp999_8_0)).i + life6_26)));
    com.moon.n6 __stackOp999_11_0 = this;
    ((com.moon.n6)(__stackOp999_11_0)).k = ((float)((((com.moon.n6)(__stackOp999_11_0)).k + life7_31)));
    }
    forwardValue999_42_0 = this;
    }
    ((com.moon.n6)(forwardValue999_42_0)).j = ((float)(0x1.ae147ap-2f));
    return;
}


public com.moon.n6 c(float p0) {
this.f = ((float)(p0));
    return this;
}


public float c() {
return this.f;
}


private boolean c__Boolean() {
net.minecraft.block.Block forwardValue998_32_0;
    net.minecraft.block.Block forwardValue998_32_1;
    int forwardValue998_36_0;
    boolean spill998_0;
    net.minecraft.block.Block spill998_1;
    net.minecraft.block.Block spill998_2;
    long life1_3;
    moom.DT life4_17;
    int life3_18;
    net.minecraft.block.Block life5_24;
    forward_join_36: {
    forward_join_35: {
    forward_join_33: {
    forward_join_32: {
    life1_3 = (com.moon.n6.x ^ 32965588100436L);
    spill998_0 = moom.fw.a__Boolean();
    life4_17 = new moom.DT(moom.Dr.a__Int(((float)(this.f))), moom.Dr.a__Int(((float)(this.g))), moom.Dr.a__Int(((float)(this.h))));
    life3_18 = ((spill998_0) ? 1 : 0);
    life5_24 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.n6.a)).I)).a__fE(((moom.DT)(life4_17))))).a__ch();
    spill998_1 = life5_24;
    spill998_2 = net.minecraft.init.Blocks.au;
    if (!((life3_18 == 0))) {
        forwardValue998_32_0 = spill998_1;
        forwardValue998_32_1 = spill998_2;
        break forward_join_32;
    }
    if (!((spill998_1 != spill998_2))) {
        break forward_join_33;
    }
    forwardValue998_32_0 = life5_24;
    forwardValue998_32_1 = net.minecraft.init.Blocks.bc;
    }
    if (!((forwardValue998_32_0 == forwardValue998_32_1))) {
        break forward_join_35;
    }
    }
    forwardValue998_36_0 = 1;
    break forward_join_36;
    }
    forwardValue998_36_0 = 0;
    }
    return ((forwardValue998_36_0) != 0);
}


public com.moon.n6 c(boolean p0) {
this.t = ((boolean)(p0));
    return this;
}


public float n() {
return this.q;
}


public boolean h__Boolean() {
return ((((this.u) ? 1 : 0)) != 0);
}


public float h() {
return this.k;
}


public com.moon.n6 h(float p0) {
this.k = ((float)(p0));
    return this;
}


public boolean f__Boolean() {
return ((((this.s) ? 1 : 0)) != 0);
}


public com.moon.n6 f(boolean p0) {
this.w = ((boolean)(p0));
    return this;
}


public com.moon.n6 f(float p0) {
this.i = ((float)(p0));
    return this;
}


public float f() {
return this.i;
}


public com.moon.n6 l(float p0) {
this.p = ((float)(p0));
    return this;
}


public float l() {
return this.o;
}


private boolean d__Boolean() {
return ((0) != 0);
}


public com.moon.n6 d(float p0) {
this.g = ((float)(p0));
    return this;
}


public float d() {
return this.g;
}


public com.moon.n6 d(boolean p0) {
this.u = ((boolean)(p0));
    return this;
}


public float a() {
return this.d;
}


protected boolean a(java.lang.Object p0) {
return ((((p0 instanceof com.moon.n6) ? 1 : 0)) != 0);
}


private void a(float p0, float p1) {
int forwardValue992_18_0;
    int forwardValue992_25_0;
    com.moon.n6 forwardValue992_63_0;
    com.moon.n6 forwardValue992_85_0;
    float forwardValue992_86_0;
    int forwardValue992_127_0;
    int forwardValue992_148_0;
    com.moon.n6 forwardValue992_172_0;
    com.moon.n6 forwardValue992_208_0;
    com.moon.n6 forwardValue992_246_0;
    boolean spill992_0;
    com.moon.n6 spill992_1;
    com.moon.n6 spill992_2;
    com.moon.n6 spill992_3;
    com.moon.n6 spill992_4;
    boolean spill992_5;
    boolean spill992_6;
    com.moon.n6 spill992_7;
    com.moon.n6 spill992_8;
    long life3_3;
    int life5_5;
    float life6_48;
    moom.DT life7_74;
    net.minecraft.block.state.IBlockState life8_79;
    float life7_92;
    float life8_115;
    float life9_130;
    forward_join_253: {
    forward_join_246: {
    forward_join_217: {
    forward_join_208: {
    forward_join_179: {
    forward_join_172: {
    forward_join_157: {
    forward_join_148: {
    forward_join_133: {
    forward_join_127: {
    forward_join_123: {
    forward_join_86: {
    forward_join_85: {
    forward_join_84: {
    forward_join_63: {
    forward_join_62: {
    forward_join_26: {
    forward_join_25: {
    forward_join_18: {
    forward_join_16: {
    life3_3 = (com.moon.n6.x ^ 64115753378823L);
    life5_5 = ((moom.fw.a__Boolean()) ? 1 : 0);
    spill992_0 = ((com.moon.n6)(this)).a__Boolean();
    if (!((life5_5 == 0))) {
        forwardValue992_18_0 = ((spill992_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill992_0)) {
        break forward_join_16;
    }
    spill992_1 = this;
    if (!((life5_5 == 0))) {
        forwardValue992_246_0 = spill992_1;
        break forward_join_246;
    }
    if (!(((com.moon.n6)(spill992_1)).d__Boolean())) {
        break forward_join_217;
    }
    }
    forwardValue992_18_0 = ((((com.moon.n6)(this)).b__Boolean()) ? 1 : 0);
    }
    if (!((life5_5 == 0))) {
        forwardValue992_25_0 = forwardValue992_18_0;
        break forward_join_25;
    }
    if (!((forwardValue992_18_0 != 0))) {
        break forward_join_26;
    }
    spill992_2 = this;
    if (!((life5_5 == 0))) {
        forwardValue992_208_0 = spill992_2;
        break forward_join_208;
    }
    forwardValue992_25_0 = ((((com.moon.n6)(spill992_2)).d__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue992_25_0 != 0))) {
        break forward_join_179;
    }
    }
    life6_48 = 0x1.d1eb86p-1f;
    spill992_3 = this;
    if (!((life5_5 == 0))) {
        forwardValue992_63_0 = spill992_3;
        break forward_join_63;
    }
    if (!(((com.moon.n6)(spill992_3)).t)) {
        break forward_join_62;
    }
    life7_74 = new moom.DT(moom.Dr.b__Int(((double)(((double) this.f)))), moom.Dr.b__Int(((double)(((double) (this.g - 0x1.0p0f))))), moom.Dr.b__Int(((double)(((double) this.h)))));
    life8_79 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.n6.a)).I)).a__fE(((moom.DT)(life7_74)));
    life6_48 = (life6_48 * ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life8_79)).a__ch())).L);
    }
    forwardValue992_63_0 = this;
    }
    life7_92 = ((float) ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.EntityLivingBase)(((com.moon.n6)(forwardValue992_63_0)).c)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).b());
    spill992_4 = this;
    if (!((life5_5 == 0))) {
        forwardValue992_85_0 = spill992_4;
        break forward_join_85;
    }
    if (!(((com.moon.n6)(spill992_4)).t)) {
        break forward_join_84;
    }
    forwardValue992_86_0 = ((life7_92 * 0x1.4d5b12p-3f) / ((life6_48 * life6_48) * life6_48));
    break forward_join_86;
    }
    forwardValue992_85_0 = this;
    }
    forwardValue992_86_0 = ((com.moon.n6)(forwardValue992_85_0)).o;
    }
    life8_115 = forwardValue992_86_0;
    ((com.moon.n6)(this)).a(((float)(p0)), ((float)(p1)), ((float)(life8_115)));
    spill992_5 = ((com.moon.n6)(this)).c__Boolean();
    if (!((life5_5 == 0))) {
        forwardValue992_148_0 = ((spill992_5) ? 1 : 0);
        break forward_join_148;
    }
    if (!(spill992_5)) {
        break forward_join_133;
    }
    life9_130 = 0x1.333334p-3f;
    this.i = ((float)(moom.Dr.a(((float)(this.i)), ((float)(-0x1.333334p-3f)), ((float)(0x1.333334p-3f)))));
    this.k = ((float)(moom.Dr.a(((float)(this.k)), ((float)(-0x1.333334p-3f)), ((float)(0x1.333334p-3f)))));
    spill992_6 = this.v;
    if (!((life5_5 == 0))) {
        forwardValue992_127_0 = ((spill992_6) ? 1 : 0);
        break forward_join_127;
    }
    if (!(spill992_6)) {
        break forward_join_123;
    }
    this.j = ((float)(0x0.0p0f));
    if (!((life5_5 != 0))) {
        break forward_join_133;
    }
    }
    forwardValue992_127_0 = recovery.source.CarrierOps.fcmpg(((float)(this.j)), ((float)(-0x1.333334p-3f)));
    }
    if (!((life5_5 == 0))) {
        forwardValue992_148_0 = forwardValue992_127_0;
        break forward_join_148;
    }
    if (!((forwardValue992_127_0 < 0))) {
        break forward_join_133;
    }
    this.j = ((float)(0x1.333334p-3f));
    }
    ((com.moon.n6)(this)).a(((double)(((double) this.i))), ((double)(((double) this.j))), ((double)(((double) this.k))));
    spill992_7 = this;
    if (!((life5_5 == 0))) {
        forwardValue992_172_0 = spill992_7;
        break forward_join_172;
    }
    forwardValue992_148_0 = ((((com.moon.n6)(spill992_7)).c__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue992_148_0 != 0))) {
        break forward_join_157;
    }
    spill992_8 = this;
    if (!((life5_5 == 0))) {
        forwardValue992_172_0 = spill992_8;
        break forward_join_172;
    }
    if (!(((com.moon.n6)(spill992_8)).s)) {
        break forward_join_157;
    }
    this.j = ((float)(0x1.99999ap-3f));
    }
    this.j = ((float)(((this.j - 0x1.47ae14p-4f) * 0x1.f5c29p-1f)));
    com.moon.n6 __stackOp992_53_0 = this;
    ((com.moon.n6)(__stackOp992_53_0)).i = ((float)((((com.moon.n6)(__stackOp992_53_0)).i * life6_48)));
    forwardValue992_172_0 = this;
    }
    com.moon.n6 __stackOp992_56_0 = forwardValue992_172_0;
    ((com.moon.n6)(__stackOp992_56_0)).k = ((float)((((com.moon.n6)(__stackOp992_56_0)).k * life6_48)));
    if (!((life5_5 != 0))) {
        break forward_join_253;
    }
    }
    ((com.moon.n6)(this)).a(((float)(p0)), ((float)(p1)), ((float)(0x1.47ae14p-6f)));
    ((com.moon.n6)(this)).a(((double)(((double) this.i))), ((double)(((double) this.j))), ((double)(((double) this.k))));
    com.moon.n6 __stackOp992_64_0 = this;
    ((com.moon.n6)(__stackOp992_64_0)).i = ((float)((((com.moon.n6)(__stackOp992_64_0)).i * 0x1.0p-1f)));
    com.moon.n6 __stackOp992_67_0 = this;
    ((com.moon.n6)(__stackOp992_67_0)).k = ((float)((((com.moon.n6)(__stackOp992_67_0)).k * 0x1.0p-1f)));
    forwardValue992_208_0 = this;
    }
    ((com.moon.n6)(forwardValue992_208_0)).j = ((float)(((this.j - 0x1.47ae14p-6f) * 0x1.0p-1f)));
    if (!((life5_5 != 0))) {
        break forward_join_253;
    }
    }
    ((com.moon.n6)(this)).a(((float)(p0)), ((float)(p1)), ((float)(0x1.47ae14p-6f)));
    ((com.moon.n6)(this)).a(((double)(((double) this.i))), ((double)(((double) this.j))), ((double)(((double) this.k))));
    com.moon.n6 __stackOp992_77_0 = this;
    ((com.moon.n6)(__stackOp992_77_0)).i = ((float)((((com.moon.n6)(__stackOp992_77_0)).i * 0x1.99999ap-1f)));
    com.moon.n6 __stackOp992_80_0 = this;
    ((com.moon.n6)(__stackOp992_80_0)).k = ((float)((((com.moon.n6)(__stackOp992_80_0)).k * 0x1.99999ap-1f)));
    forwardValue992_246_0 = this;
    }
    ((com.moon.n6)(forwardValue992_246_0)).j = ((float)(((this.j - 0x1.47ae14p-6f) * 0x1.99999ap-1f)));
    }
    return;
}


private moom.CA a__CA() {
return new moom.CA(((double) (this.f - (this.l / 0x1.0p1f))), ((double) this.g), ((double) (this.h - (this.l / 0x1.0p1f))), ((double) (this.f + (this.l / 0x1.0p1f))), ((double) (this.g + this.m)), ((double) (this.h + (this.l / 0x1.0p1f))));
}


public void a__Void() {
int forwardValue996_39_0;
    com.moon.n6 forwardValue996_56_0;
    boolean spill996_0;
    boolean spill996_1;
    boolean spill996_2;
    com.moon.n6 spill996_3;
    com.moon.n6 spill996_4;
    com.moon.n6 spill996_5;
    long life1_3;
    int life3_21;
    forward_join_56: {
    forward_join_55: {
    forward_join_39: {
    forward_join_35: {
    life1_3 = (com.moon.n6.x ^ 24016964086949L);
    spill996_0 = moom.fw.a__Boolean();
    ((java.util.ArrayList)(this.b)).add(((java.lang.Object)(new moom.DR(((double) this.f), ((double) this.g), ((double) this.h)))));
    life3_21 = ((spill996_0) ? 1 : 0);
    spill996_1 = this.u;
    if (!((life3_21 == 0))) {
        forwardValue996_39_0 = ((spill996_1) ? 1 : 0);
        break forward_join_39;
    }
    if (!(spill996_1)) {
        break forward_join_35;
    }
    spill996_2 = this.s;
    if (!((life3_21 == 0))) {
        forwardValue996_39_0 = ((spill996_2) ? 1 : 0);
        break forward_join_39;
    }
    if (!(spill996_2)) {
        break forward_join_35;
    }
    this.u = ((boolean)(false));
    }
    spill996_3 = this;
    if (!((life3_21 == 0))) {
        forwardValue996_56_0 = spill996_3;
        break forward_join_56;
    }
    forwardValue996_39_0 = ((((com.moon.n6)(spill996_3)).u) ? 1 : 0);
    }
    if (!((forwardValue996_39_0 == 0))) {
        break forward_join_55;
    }
    spill996_4 = this;
    if (!((life3_21 == 0))) {
        forwardValue996_56_0 = spill996_4;
        break forward_join_56;
    }
    if (!((!((com.moon.n6)(spill996_4)).s))) {
        break forward_join_55;
    }
    spill996_5 = this;
    if (!((life3_21 == 0))) {
        forwardValue996_56_0 = spill996_5;
        break forward_join_56;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(((com.moon.n6)(spill996_5)).p)), ((float)(0x0.0p0f))) > 0))) {
        break forward_join_55;
    }
    this.u = ((boolean)(true));
    }
    forwardValue996_56_0 = this;
    }
    ((com.moon.n6)(forwardValue996_56_0)).b__Void();
    return;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 22331);
    if (((com.moon.n6.z)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.n6.A)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.n6.A)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/n6", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.n6.y)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.n6.z)[life5_8] = __sourceExactCall_b87a38a1827870(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.n6.z)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = __sourceExactCall_c38dccba43e63c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2814_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/n6"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.entity.EntityLivingBase a__sG() {
return this.c;
}


private void a(double p0, double p1, double p2) {
int forestValue134_22_0;
    int forestValue134_26_0;
    int forestValue134_28_0;
    int forestValue134_71_0;
    double forestValue134_80_0;
    double forestValue134_80_1;
    int forestValue134_124_0;
    double forestValue134_133_0;
    double forestValue134_133_1;
    int forestValue134_140_0;
    int forestValue134_175_0;
    double forestValue134_184_0;
    double forestValue134_184_1;
    int forestValue134_195_0;
    int forestValue134_211_0;
    int forestValue134_234_0;
    double forestValue134_243_0;
    double forestValue134_243_1;
    int forestValue134_269_0;
    double forestValue134_278_0;
    double forestValue134_278_1;
    int forestValue134_309_0;
    int forestValue134_332_0;
    double forestValue134_341_0;
    double forestValue134_341_1;
    int forestValue134_367_0;
    double forestValue134_376_0;
    double forestValue134_376_1;
    java.util.List forestValue134_388_0;
    int forestValue134_430_0;
    int forestValue134_434_0;
    int forestValue134_436_0;
    int forestValue134_503_0;
    double forestValue134_511_0;
    double forestValue134_742_0;
    double forestValue134_793_0;
    com.moon.n6 forestValue134_797_0;
    com.moon.n6 forestValue134_809_0;
    com.moon.n6 forestValue134_810_0;
    int forestValue134_810_1;
    com.moon.n6 forestValue134_811_0;
    com.moon.n6 forestValue134_812_0;
    int forestValue134_812_1;
    com.moon.n6 forestValue134_821_0;
    int forestValue134_821_1;
    com.moon.n6 forestValue134_822_0;
    com.moon.n6 forestValue134_823_0;
    int forestValue134_823_1;
    com.moon.n6 forestValue134_835_0;
    int forestValue134_835_1;
    com.moon.n6 forestValue134_839_0;
    int forestValue134_839_1;
    com.moon.n6 forestValue134_840_0;
    com.moon.n6 forestValue134_841_0;
    int forestValue134_841_1;
    int forestValue134_854_0;
    int forestValue134_863_0;
    boolean spill134_0;
    boolean spill134_1;
    boolean spill134_2;
    int spill134_3;
    int spill134_4;
    double spill134_5;
    double spill134_6;
    boolean spill134_7;
    int spill134_8;
    int spill134_9;
    double spill134_10;
    double spill134_11;
    boolean spill134_12;
    int spill134_13;
    int spill134_14;
    double spill134_15;
    double spill134_16;
    int spill134_17;
    int spill134_18;
    java.util.List spill134_19;
    int spill134_20;
    int spill134_21;
    double spill134_22;
    double spill134_23;
    int spill134_24;
    int spill134_25;
    double spill134_26;
    double spill134_27;
    int spill134_28;
    int spill134_29;
    java.util.List spill134_30;
    int spill134_31;
    int spill134_32;
    double spill134_33;
    double spill134_34;
    int spill134_35;
    int spill134_36;
    double spill134_37;
    double spill134_38;
    boolean spill134_39;
    int spill134_40;
    com.moon.n6 spill134_41;
    int spill134_42;
    double spill134_43;
    double spill134_44;
    double spill134_45;
    double spill134_46;
    int spill134_47;
    int spill134_48;
    com.moon.n6 spill134_49;
    int spill134_50;
    com.moon.n6 spill134_51;
    boolean spill134_52;
    int spill134_53;
    long life7_3;
    moom.CA life10_7;
    double life11_9;
    int life9_10;
    double life13_12;
    double life15_14;
    int life17_37;
    double life18_42;
    java.util.List life18_553;
    moom.CA life19_555;
    java.util.Iterator life20_558;
    moom.CA life21_567;
    int life20_620;
    java.util.Iterator life21_623;
    moom.CA life22_632;
    java.util.Iterator life21_654;
    moom.CA life22_663;
    double life21_723;
    double life23_725;
    double life25_727;
    moom.CA life27_729;
    moom.CA life10_731;
    double life3_735;
    java.util.List life28_742;
    moom.CA life29_744;
    moom.CA life30_750;
    double life31_752;
    java.util.Iterator life33_755;
    moom.CA life34_764;
    double life33_785;
    java.util.Iterator life35_788;
    moom.CA life36_797;
    double life35_818;
    java.util.Iterator life37_821;
    moom.CA life38_830;
    moom.CA life37_851;
    double life38_853;
    java.util.Iterator life40_856;
    moom.CA life41_865;
    double life40_886;
    java.util.Iterator life42_889;
    moom.CA life43_898;
    double life42_919;
    java.util.Iterator life44_922;
    moom.CA life45_931;
    double life44_958;
    double life46_966;
    java.util.Iterator life48_1001;
    moom.CA life49_1010;
    forest_join_867: {
    forest_join_863: {
    forest_join_860: {
    forest_join_854: {
    forest_join_851: {
    forest_join_841: {
    forest_join_840: {
    forest_join_839: {
    forest_join_835: {
    forest_join_823: {
    forest_join_822: {
    forest_join_821: {
    forest_join_812: {
    forest_join_811: {
    forest_join_810: {
    forest_join_809: {
    forest_join_797: {
    forest_join_796: {
    forest_join_793: {
    forest_join_770: {
    forest_join_764: {
    forest_join_745: {
    forest_join_742: {
    forest_join_736: {
    forest_join_703: {
    forest_join_697: {
    forest_join_676: {
    forest_join_670: {
    forest_join_649: {
    forest_join_643: {
    forest_join_620: {
    forest_join_614: {
    forest_join_593: {
    forest_join_587: {
    forest_join_566: {
    forest_join_560: {
    forest_join_511: {
    forest_join_510: {
    forest_join_503: {
    forest_join_487: {
    forest_join_481: {
    forest_join_462: {
    forest_join_456: {
    forest_join_436: {
    forest_join_435: {
    forest_join_434: {
    forest_join_433: {
    forest_join_430: {
    forest_join_416: {
    forest_join_410: {
    forest_join_388: {
    forest_join_382: {
    forest_join_290: {
    forest_join_289: {
    forest_join_195: {
    forest_join_140: {
    forest_join_86: {
    forest_join_28: {
    forest_join_27: {
    forest_join_26: {
    forest_join_22: {
    life7_3 = (com.moon.n6.x ^ 20679255210147L);
    spill134_0 = moom.fw.a__Boolean();
    life10_7 = ((com.moon.n6)(this)).a__CA();
    life11_9 = p0;
    life9_10 = ((spill134_0) ? 1 : 0);
    life13_12 = p1;
    life15_14 = p2;
    spill134_1 = this.t;
    if (!((life9_10 == 0))) {
        forestValue134_22_0 = ((spill134_1) ? 1 : 0);
        break forest_join_22;
    }
    if (!(spill134_1)) {
        break forest_join_27;
    }
    forestValue134_22_0 = ((this.v) ? 1 : 0);
    }
    if (!((life9_10 == 0))) {
        forestValue134_26_0 = forestValue134_22_0;
        break forest_join_26;
    }
    if (!((forestValue134_22_0 != 0))) {
        break forest_join_27;
    }
    forestValue134_26_0 = 1;
    }
    forestValue134_28_0 = forestValue134_26_0;
    break forest_join_28;
    }
    forestValue134_28_0 = 0;
    }
    life17_37 = forestValue134_28_0;
    if (!((life17_37 != 0))) {
        break forest_join_382;
    }
    life18_42 = 0x1.999999999999ap-5d;
    forest_cycle_33: while (true) {
    forest_join_82: {
    forest_join_80: {
    forest_join_78: {
    forest_join_71: {
    forest_join_66: {
    if (!((recovery.source.CarrierOps.dcmpl(((double)(p0)), ((double)(0x0.0p0d))) != 0))) {
        break forest_join_86;
    }
    spill134_2 = ((java.util.List)(__sourceExactCall_f2803f650758c8(((moom.CA)(((moom.CA)(life10_7)).c(((double)(p0)), ((double)(-0x1.0p0d)), ((double)(0x0.0p0d)))))))).isEmpty();
    if (!((life9_10 == 0))) {
        forestValue134_140_0 = ((spill134_2) ? 1 : 0);
        break forest_join_140;
    }
    if (!((life9_10 == 0))) {
        forestValue134_140_0 = ((spill134_2) ? 1 : 0);
        break forest_join_140;
    }
    if (!(spill134_2)) {
        break forest_join_86;
    }
    spill134_3 = recovery.source.CarrierOps.dcmpg(((double)(p0)), ((double)(life18_42)));
    if (!((life9_10 == 0))) {
        forestValue134_71_0 = spill134_3;
        break forest_join_71;
    }
    if (!((spill134_3 < 0))) {
        break forest_join_66;
    }
    spill134_4 = recovery.source.CarrierOps.dcmpl(((double)(p0)), ((double)((-life18_42))));
    if (!((life9_10 == 0))) {
        forestValue134_71_0 = spill134_4;
        break forest_join_71;
    }
    if (!((spill134_4 >= 0))) {
        break forest_join_66;
    }
    p0 = 0x0.0p0d;
    if (!((life9_10 != 0))) {
        break forest_join_82;
    }
    }
    spill134_5 = p0;
    spill134_6 = 0x0.0p0d;
    if (!((life9_10 == 0))) {
        forestValue134_80_0 = spill134_5;
        forestValue134_80_1 = spill134_6;
        break forest_join_80;
    }
    forestValue134_71_0 = recovery.source.CarrierOps.dcmpl(((double)(spill134_5)), ((double)(spill134_6)));
    }
    if (!((forestValue134_71_0 > 0))) {
        break forest_join_78;
    }
    p0 = (p0 - life18_42);
    if (!((life9_10 != 0))) {
        break forest_join_82;
    }
    }
    forestValue134_80_0 = p0;
    forestValue134_80_1 = life18_42;
    }
    p0 = (forestValue134_80_0 + forestValue134_80_1);
    }
    life11_9 = p0;
    if (!((life9_10 != 0))) {
        continue forest_cycle_33;
    }
    break forest_cycle_33;
    }
    }
    forest_cycle_86: while (true) {
    forest_join_135: {
    forest_join_133: {
    forest_join_131: {
    forest_join_124: {
    forest_join_119: {
    if (!((recovery.source.CarrierOps.dcmpl(((double)(p2)), ((double)(0x0.0p0d))) != 0))) {
        break forest_join_290;
    }
    spill134_7 = ((java.util.List)(__sourceExactCall_f2803f650758c8(((moom.CA)(((moom.CA)(life10_7)).c(((double)(0x0.0p0d)), ((double)(-0x1.0p0d)), ((double)(p2)))))))).isEmpty();
    if (!((life9_10 == 0))) {
        forestValue134_195_0 = ((spill134_7) ? 1 : 0);
        break forest_join_195;
    }
    if (!((life9_10 == 0))) {
        forestValue134_195_0 = ((spill134_7) ? 1 : 0);
        break forest_join_195;
    }
    if (!(spill134_7)) {
        break forest_join_290;
    }
    spill134_8 = recovery.source.CarrierOps.dcmpg(((double)(p2)), ((double)(life18_42)));
    if (!((life9_10 == 0))) {
        forestValue134_124_0 = spill134_8;
        break forest_join_124;
    }
    if (!((spill134_8 < 0))) {
        break forest_join_119;
    }
    spill134_9 = recovery.source.CarrierOps.dcmpl(((double)(p2)), ((double)((-life18_42))));
    if (!((life9_10 == 0))) {
        forestValue134_124_0 = spill134_9;
        break forest_join_124;
    }
    if (!((spill134_9 >= 0))) {
        break forest_join_119;
    }
    p2 = 0x0.0p0d;
    if (!((life9_10 != 0))) {
        break forest_join_135;
    }
    }
    spill134_10 = p2;
    spill134_11 = 0x0.0p0d;
    if (!((life9_10 == 0))) {
        forestValue134_133_0 = spill134_10;
        forestValue134_133_1 = spill134_11;
        break forest_join_133;
    }
    forestValue134_124_0 = recovery.source.CarrierOps.dcmpl(((double)(spill134_10)), ((double)(spill134_11)));
    }
    if (!((forestValue134_124_0 > 0))) {
        break forest_join_131;
    }
    p2 = (p2 - life18_42);
    if (!((life9_10 != 0))) {
        break forest_join_135;
    }
    }
    forestValue134_133_0 = p2;
    forestValue134_133_1 = life18_42;
    }
    p2 = (forestValue134_133_0 + forestValue134_133_1);
    }
    life15_14 = p2;
    if (!((life9_10 != 0))) {
        continue forest_cycle_86;
    }
    break forest_cycle_86;
    }
    break forest_join_290;
    }
    forest_cycle_140: while (true) {
    forest_join_191: {
    forest_join_186: {
    forest_join_184: {
    forest_join_182: {
    forest_join_175: {
    forest_join_170: {
    if (!((forestValue134_140_0 != 0))) {
        break forest_join_290;
    }
    spill134_12 = ((java.util.List)(__sourceExactCall_f2803f650758c8(((moom.CA)(((moom.CA)(life10_7)).c(((double)(0x0.0p0d)), ((double)(-0x1.0p0d)), ((double)(p2)))))))).isEmpty();
    if (!((life9_10 == 0))) {
        forestValue134_195_0 = ((spill134_12) ? 1 : 0);
        break forest_join_195;
    }
    if (!((life9_10 == 0))) {
        forestValue134_195_0 = ((spill134_12) ? 1 : 0);
        break forest_join_195;
    }
    if (!(spill134_12)) {
        break forest_join_290;
    }
    spill134_13 = recovery.source.CarrierOps.dcmpg(((double)(p2)), ((double)(life18_42)));
    if (!((life9_10 == 0))) {
        forestValue134_175_0 = spill134_13;
        break forest_join_175;
    }
    if (!((spill134_13 < 0))) {
        break forest_join_170;
    }
    spill134_14 = recovery.source.CarrierOps.dcmpl(((double)(p2)), ((double)((-life18_42))));
    if (!((life9_10 == 0))) {
        forestValue134_175_0 = spill134_14;
        break forest_join_175;
    }
    if (!((spill134_14 >= 0))) {
        break forest_join_170;
    }
    p2 = 0x0.0p0d;
    if (!((life9_10 != 0))) {
        break forest_join_186;
    }
    }
    spill134_15 = p2;
    spill134_16 = 0x0.0p0d;
    if (!((life9_10 == 0))) {
        forestValue134_184_0 = spill134_15;
        forestValue134_184_1 = spill134_16;
        break forest_join_184;
    }
    forestValue134_175_0 = recovery.source.CarrierOps.dcmpl(((double)(spill134_15)), ((double)(spill134_16)));
    }
    if (!((forestValue134_175_0 > 0))) {
        break forest_join_182;
    }
    p2 = (p2 - life18_42);
    if (!((life9_10 != 0))) {
        break forest_join_186;
    }
    }
    forestValue134_184_0 = p2;
    forestValue134_184_1 = life18_42;
    }
    p2 = (forestValue134_184_0 + forestValue134_184_1);
    }
    life15_14 = p2;
    if (!((life9_10 != 0))) {
        break forest_join_191;
    }
    break forest_join_290;
    }
    spill134_17 = recovery.source.CarrierOps.dcmpl(((double)(p2)), ((double)(0x0.0p0d)));
    forestValue134_140_0 = spill134_17;
    continue forest_cycle_140;
    }
    }
    forest_cycle_195: while (true) {
    forest_join_285: {
    forest_join_280: {
    forest_join_278: {
    forest_join_276: {
    forest_join_269: {
    forest_join_264: {
    forest_join_245: {
    forest_join_243: {
    forest_join_241: {
    forest_join_234: {
    forest_join_229: {
    forest_join_211: {
    if (!((forestValue134_195_0 != 0))) {
        break forest_join_382;
    }
    spill134_18 = recovery.source.CarrierOps.dcmpl(((double)(p2)), ((double)(0x0.0p0d)));
    if (!((life9_10 == 0))) {
        forestValue134_211_0 = spill134_18;
        break forest_join_211;
    }
    if (!((spill134_18 != 0))) {
        break forest_join_382;
    }
    spill134_19 = __sourceExactCall_f2803f650758c8(((moom.CA)(((moom.CA)(life10_7)).c(((double)(p0)), ((double)(-0x1.0p0d)), ((double)(p2))))));
    if (!((life9_10 == 0))) {
        forestValue134_388_0 = spill134_19;
        break forest_join_388;
    }
    forestValue134_211_0 = ((((java.util.List)(spill134_19)).isEmpty()) ? 1 : 0);
    }
    if (!((forestValue134_211_0 != 0))) {
        break forest_join_382;
    }
    spill134_20 = recovery.source.CarrierOps.dcmpg(((double)(p0)), ((double)(life18_42)));
    if (!((life9_10 == 0))) {
        forestValue134_234_0 = spill134_20;
        break forest_join_234;
    }
    if (!((spill134_20 < 0))) {
        break forest_join_229;
    }
    spill134_21 = recovery.source.CarrierOps.dcmpl(((double)(p0)), ((double)((-life18_42))));
    if (!((life9_10 == 0))) {
        forestValue134_234_0 = spill134_21;
        break forest_join_234;
    }
    if (!((spill134_21 >= 0))) {
        break forest_join_229;
    }
    p0 = 0x0.0p0d;
    if (!((life9_10 != 0))) {
        break forest_join_245;
    }
    }
    spill134_22 = p0;
    spill134_23 = 0x0.0p0d;
    if (!((life9_10 == 0))) {
        forestValue134_243_0 = spill134_22;
        forestValue134_243_1 = spill134_23;
        break forest_join_243;
    }
    forestValue134_234_0 = recovery.source.CarrierOps.dcmpl(((double)(spill134_22)), ((double)(spill134_23)));
    }
    if (!((forestValue134_234_0 > 0))) {
        break forest_join_241;
    }
    p0 = (p0 - life18_42);
    if (!((life9_10 != 0))) {
        break forest_join_245;
    }
    }
    forestValue134_243_0 = p0;
    forestValue134_243_1 = life18_42;
    }
    p0 = (forestValue134_243_0 + forestValue134_243_1);
    }
    life11_9 = p0;
    spill134_24 = recovery.source.CarrierOps.dcmpg(((double)(p2)), ((double)(life18_42)));
    if (!((life9_10 == 0))) {
        forestValue134_269_0 = spill134_24;
        break forest_join_269;
    }
    if (!((spill134_24 < 0))) {
        break forest_join_264;
    }
    spill134_25 = recovery.source.CarrierOps.dcmpl(((double)(p2)), ((double)((-life18_42))));
    if (!((life9_10 == 0))) {
        forestValue134_269_0 = spill134_25;
        break forest_join_269;
    }
    if (!((spill134_25 >= 0))) {
        break forest_join_264;
    }
    p2 = 0x0.0p0d;
    if (!((life9_10 != 0))) {
        break forest_join_280;
    }
    }
    spill134_26 = p2;
    spill134_27 = 0x0.0p0d;
    if (!((life9_10 == 0))) {
        forestValue134_278_0 = spill134_26;
        forestValue134_278_1 = spill134_27;
        break forest_join_278;
    }
    forestValue134_269_0 = recovery.source.CarrierOps.dcmpl(((double)(spill134_26)), ((double)(spill134_27)));
    }
    if (!((forestValue134_269_0 > 0))) {
        break forest_join_276;
    }
    p2 = (p2 - life18_42);
    if (!((life9_10 != 0))) {
        break forest_join_280;
    }
    }
    forestValue134_278_0 = p2;
    forestValue134_278_1 = life18_42;
    }
    p2 = (forestValue134_278_0 + forestValue134_278_1);
    }
    life15_14 = p2;
    if (!((life9_10 != 0))) {
        break forest_join_285;
    }
    break forest_join_289;
    }
    spill134_28 = recovery.source.CarrierOps.dcmpl(((double)(p0)), ((double)(0x0.0p0d)));
    forestValue134_195_0 = spill134_28;
    continue forest_cycle_195;
    }
    }
    break forest_join_382;
    }
    forest_cycle_290: while (true) {
    forest_join_378: {
    forest_join_376: {
    forest_join_374: {
    forest_join_367: {
    forest_join_362: {
    forest_join_343: {
    forest_join_341: {
    forest_join_339: {
    forest_join_332: {
    forest_join_327: {
    forest_join_309: {
    if (!((recovery.source.CarrierOps.dcmpl(((double)(p0)), ((double)(0x0.0p0d))) != 0))) {
        break forest_join_382;
    }
    spill134_29 = recovery.source.CarrierOps.dcmpl(((double)(p2)), ((double)(0x0.0p0d)));
    if (!((life9_10 == 0))) {
        forestValue134_309_0 = spill134_29;
        break forest_join_309;
    }
    if (!((spill134_29 != 0))) {
        break forest_join_382;
    }
    spill134_30 = __sourceExactCall_f2803f650758c8(((moom.CA)(((moom.CA)(life10_7)).c(((double)(p0)), ((double)(-0x1.0p0d)), ((double)(p2))))));
    if (!((life9_10 == 0))) {
        forestValue134_388_0 = spill134_30;
        break forest_join_388;
    }
    forestValue134_309_0 = ((((java.util.List)(spill134_30)).isEmpty()) ? 1 : 0);
    }
    if (!((forestValue134_309_0 != 0))) {
        break forest_join_382;
    }
    spill134_31 = recovery.source.CarrierOps.dcmpg(((double)(p0)), ((double)(life18_42)));
    if (!((life9_10 == 0))) {
        forestValue134_332_0 = spill134_31;
        break forest_join_332;
    }
    if (!((spill134_31 < 0))) {
        break forest_join_327;
    }
    spill134_32 = recovery.source.CarrierOps.dcmpl(((double)(p0)), ((double)((-life18_42))));
    if (!((life9_10 == 0))) {
        forestValue134_332_0 = spill134_32;
        break forest_join_332;
    }
    if (!((spill134_32 >= 0))) {
        break forest_join_327;
    }
    p0 = 0x0.0p0d;
    if (!((life9_10 != 0))) {
        break forest_join_343;
    }
    }
    spill134_33 = p0;
    spill134_34 = 0x0.0p0d;
    if (!((life9_10 == 0))) {
        forestValue134_341_0 = spill134_33;
        forestValue134_341_1 = spill134_34;
        break forest_join_341;
    }
    forestValue134_332_0 = recovery.source.CarrierOps.dcmpl(((double)(spill134_33)), ((double)(spill134_34)));
    }
    if (!((forestValue134_332_0 > 0))) {
        break forest_join_339;
    }
    p0 = (p0 - life18_42);
    if (!((life9_10 != 0))) {
        break forest_join_343;
    }
    }
    forestValue134_341_0 = p0;
    forestValue134_341_1 = life18_42;
    }
    p0 = (forestValue134_341_0 + forestValue134_341_1);
    }
    life11_9 = p0;
    spill134_35 = recovery.source.CarrierOps.dcmpg(((double)(p2)), ((double)(life18_42)));
    if (!((life9_10 == 0))) {
        forestValue134_367_0 = spill134_35;
        break forest_join_367;
    }
    if (!((spill134_35 < 0))) {
        break forest_join_362;
    }
    spill134_36 = recovery.source.CarrierOps.dcmpl(((double)(p2)), ((double)((-life18_42))));
    if (!((life9_10 == 0))) {
        forestValue134_367_0 = spill134_36;
        break forest_join_367;
    }
    if (!((spill134_36 >= 0))) {
        break forest_join_362;
    }
    p2 = 0x0.0p0d;
    if (!((life9_10 != 0))) {
        break forest_join_378;
    }
    }
    spill134_37 = p2;
    spill134_38 = 0x0.0p0d;
    if (!((life9_10 == 0))) {
        forestValue134_376_0 = spill134_37;
        forestValue134_376_1 = spill134_38;
        break forest_join_376;
    }
    forestValue134_367_0 = recovery.source.CarrierOps.dcmpl(((double)(spill134_37)), ((double)(spill134_38)));
    }
    if (!((forestValue134_367_0 > 0))) {
        break forest_join_374;
    }
    p2 = (p2 - life18_42);
    if (!((life9_10 != 0))) {
        break forest_join_378;
    }
    }
    forestValue134_376_0 = p2;
    forestValue134_376_1 = life18_42;
    }
    p2 = (forestValue134_376_0 + forestValue134_376_1);
    }
    life15_14 = p2;
    if (!((life9_10 != 0))) {
        continue forest_cycle_290;
    }
    break forest_cycle_290;
    }
    }
    forestValue134_388_0 = __sourceExactCall_f2803f650758c8(((moom.CA)(((moom.CA)(life10_7)).a(((double)(p0)), ((double)(p1)), ((double)(p2))))));
    }
    life18_553 = forestValue134_388_0;
    life19_555 = life10_7;
    life20_558 = ((java.util.List)(life18_553)).iterator();
    forest_cycle_394: while (true) {
    if (!(((java.util.Iterator)(life20_558)).hasNext())) {
        break forest_join_410;
    }
    life21_567 = ((moom.CA)(((java.util.Iterator)(life20_558)).next()));
    p1 = ((moom.CA)(life21_567)).b(((moom.CA)(life10_7)), ((double)(p1)));
    if (!((life9_10 == 0))) {
        break forest_join_416;
    }
    if (!((life9_10 != 0))) {
        continue forest_cycle_394;
    }
    break forest_cycle_394;
    }
    }
    life10_7 = ((moom.CA)(life10_7)).c(((double)(0x0.0p0d)), ((double)(p1)), ((double)(0x0.0p0d)));
    }
    spill134_39 = this.t;
    if (!((life9_10 == 0))) {
        forestValue134_434_0 = ((spill134_39) ? 1 : 0);
        break forest_join_434;
    }
    if (!((!spill134_39))) {
        break forest_join_433;
    }
    spill134_40 = recovery.source.CarrierOps.dcmpl(((double)(life13_12)), ((double)(p1)));
    if (!((life9_10 == 0))) {
        forestValue134_430_0 = spill134_40;
        break forest_join_430;
    }
    if (!((spill134_40 != 0))) {
        break forest_join_435;
    }
    forestValue134_430_0 = recovery.source.CarrierOps.dcmpg(((double)(life13_12)), ((double)(0x0.0p0d)));
    }
    if (!((life9_10 == 0))) {
        forestValue134_434_0 = forestValue134_430_0;
        break forest_join_434;
    }
    if (!((forestValue134_430_0 < 0))) {
        break forest_join_435;
    }
    }
    forestValue134_434_0 = 1;
    }
    forestValue134_436_0 = forestValue134_434_0;
    break forest_join_436;
    }
    forestValue134_436_0 = 0;
    }
    life20_620 = forestValue134_436_0;
    life21_623 = ((java.util.List)(life18_553)).iterator();
    forest_cycle_440: while (true) {
    if (!(((java.util.Iterator)(life21_623)).hasNext())) {
        break forest_join_456;
    }
    life22_632 = ((moom.CA)(((java.util.Iterator)(life21_623)).next()));
    p0 = ((moom.CA)(life22_632)).a(((moom.CA)(life10_7)), ((double)(p0)));
    if (!((life9_10 == 0))) {
        break forest_join_462;
    }
    if (!((life9_10 != 0))) {
        continue forest_cycle_440;
    }
    break forest_cycle_440;
    }
    }
    life10_7 = ((moom.CA)(life10_7)).c(((double)(p0)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)));
    }
    life21_654 = ((java.util.List)(life18_553)).iterator();
    forest_cycle_465: while (true) {
    if (!(((java.util.Iterator)(life21_654)).hasNext())) {
        break forest_join_481;
    }
    life22_663 = ((moom.CA)(((java.util.Iterator)(life21_654)).next()));
    p2 = ((moom.CA)(life22_663)).c(((moom.CA)(life10_7)), ((double)(p2)));
    if (!((life9_10 == 0))) {
        break forest_join_487;
    }
    if (!((life9_10 != 0))) {
        continue forest_cycle_465;
    }
    break forest_cycle_465;
    }
    }
    life10_7 = ((moom.CA)(life10_7)).c(((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(p2)));
    }
    spill134_41 = this;
    if (!((life9_10 == 0))) {
        forestValue134_797_0 = spill134_41;
        break forest_join_797;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(((com.moon.n6)(spill134_41)).n)), ((float)(0x0.0p0f))) > 0))) {
        break forest_join_796;
    }
    spill134_42 = life20_620;
    if (!((life9_10 == 0))) {
        forestValue134_503_0 = spill134_42;
        break forest_join_503;
    }
    if (!((spill134_42 != 0))) {
        break forest_join_796;
    }
    spill134_43 = life11_9;
    if (!((life9_10 == 0))) {
        forestValue134_511_0 = spill134_43;
        break forest_join_511;
    }
    forestValue134_503_0 = recovery.source.CarrierOps.dcmpl(((double)(spill134_43)), ((double)(p0)));
    }
    if (!((forestValue134_503_0 == 0))) {
        break forest_join_510;
    }
    spill134_44 = life15_14;
    if (!((life9_10 == 0))) {
        forestValue134_511_0 = spill134_44;
        break forest_join_511;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill134_44)), ((double)(p2))) != 0))) {
        break forest_join_796;
    }
    }
    forestValue134_511_0 = p0;
    }
    life21_723 = forestValue134_511_0;
    life23_725 = p1;
    life25_727 = p2;
    life27_729 = life10_7;
    life10_731 = life19_555;
    life3_735 = ((double) this.n);
    life28_742 = __sourceExactCall_f2803f650758c8(((moom.CA)(((moom.CA)(life10_731)).a(((double)(life11_9)), ((double)(life3_735)), ((double)(life15_14))))));
    life29_744 = life10_731;
    life30_750 = ((moom.CA)(life29_744)).a(((double)(life11_9)), ((double)(0x0.0p0d)), ((double)(life15_14)));
    life31_752 = life3_735;
    life33_755 = ((java.util.List)(life28_742)).iterator();
    forest_cycle_544: while (true) {
    if (!(((java.util.Iterator)(life33_755)).hasNext())) {
        break forest_join_560;
    }
    life34_764 = ((moom.CA)(((java.util.Iterator)(life33_755)).next()));
    life31_752 = ((moom.CA)(life34_764)).b(((moom.CA)(life30_750)), ((double)(life31_752)));
    if (!((life9_10 == 0))) {
        break forest_join_566;
    }
    if (!((life9_10 != 0))) {
        continue forest_cycle_544;
    }
    break forest_cycle_544;
    }
    }
    life29_744 = ((moom.CA)(life29_744)).c(((double)(0x0.0p0d)), ((double)(life31_752)), ((double)(0x0.0p0d)));
    }
    life33_785 = life11_9;
    life35_788 = ((java.util.List)(life28_742)).iterator();
    forest_cycle_571: while (true) {
    if (!(((java.util.Iterator)(life35_788)).hasNext())) {
        break forest_join_587;
    }
    life36_797 = ((moom.CA)(((java.util.Iterator)(life35_788)).next()));
    life33_785 = ((moom.CA)(life36_797)).a(((moom.CA)(life29_744)), ((double)(life33_785)));
    if (!((life9_10 == 0))) {
        break forest_join_593;
    }
    if (!((life9_10 != 0))) {
        continue forest_cycle_571;
    }
    break forest_cycle_571;
    }
    }
    life29_744 = ((moom.CA)(life29_744)).c(((double)(life33_785)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)));
    }
    life35_818 = life15_14;
    life37_821 = ((java.util.List)(life28_742)).iterator();
    forest_cycle_598: while (true) {
    if (!(((java.util.Iterator)(life37_821)).hasNext())) {
        break forest_join_614;
    }
    life38_830 = ((moom.CA)(((java.util.Iterator)(life37_821)).next()));
    life35_818 = ((moom.CA)(life38_830)).c(((moom.CA)(life29_744)), ((double)(life35_818)));
    if (!((life9_10 == 0))) {
        break forest_join_620;
    }
    if (!((life9_10 != 0))) {
        continue forest_cycle_598;
    }
    break forest_cycle_598;
    }
    }
    life29_744 = ((moom.CA)(life29_744)).c(((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(life35_818)));
    }
    life37_851 = life10_731;
    life38_853 = life3_735;
    life40_856 = ((java.util.List)(life28_742)).iterator();
    forest_cycle_627: while (true) {
    if (!(((java.util.Iterator)(life40_856)).hasNext())) {
        break forest_join_643;
    }
    life41_865 = ((moom.CA)(((java.util.Iterator)(life40_856)).next()));
    life38_853 = ((moom.CA)(life41_865)).b(((moom.CA)(life37_851)), ((double)(life38_853)));
    if (!((life9_10 == 0))) {
        break forest_join_649;
    }
    if (!((life9_10 != 0))) {
        continue forest_cycle_627;
    }
    break forest_cycle_627;
    }
    }
    life37_851 = ((moom.CA)(life37_851)).c(((double)(0x0.0p0d)), ((double)(life38_853)), ((double)(0x0.0p0d)));
    }
    life40_886 = life11_9;
    life42_889 = ((java.util.List)(life28_742)).iterator();
    forest_cycle_654: while (true) {
    if (!(((java.util.Iterator)(life42_889)).hasNext())) {
        break forest_join_670;
    }
    life43_898 = ((moom.CA)(((java.util.Iterator)(life42_889)).next()));
    life40_886 = ((moom.CA)(life43_898)).a(((moom.CA)(life37_851)), ((double)(life40_886)));
    if (!((life9_10 == 0))) {
        break forest_join_676;
    }
    if (!((life9_10 != 0))) {
        continue forest_cycle_654;
    }
    break forest_cycle_654;
    }
    }
    life37_851 = ((moom.CA)(life37_851)).c(((double)(life40_886)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)));
    }
    life42_919 = life15_14;
    life44_922 = ((java.util.List)(life28_742)).iterator();
    forest_cycle_681: while (true) {
    if (!(((java.util.Iterator)(life44_922)).hasNext())) {
        break forest_join_697;
    }
    life45_931 = ((moom.CA)(((java.util.Iterator)(life44_922)).next()));
    life42_919 = ((moom.CA)(life45_931)).c(((moom.CA)(life37_851)), ((double)(life42_919)));
    if (!((life9_10 == 0))) {
        break forest_join_703;
    }
    if (!((life9_10 != 0))) {
        continue forest_cycle_681;
    }
    break forest_cycle_681;
    }
    }
    life37_851 = ((moom.CA)(life37_851)).c(((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(life42_919)));
    }
    life44_958 = ((life33_785 * life33_785) + (life35_818 * life35_818));
    life46_966 = ((life40_886 * life40_886) + (life42_919 * life42_919));
    spill134_45 = life44_958;
    if (!((life9_10 == 0))) {
        forestValue134_742_0 = spill134_45;
        break forest_join_742;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill134_45)), ((double)(life46_966))) > 0))) {
        break forest_join_736;
    }
    p0 = life33_785;
    p2 = life35_818;
    p1 = (-life31_752);
    life10_7 = life29_744;
    if (!((life9_10 != 0))) {
        break forest_join_745;
    }
    }
    p0 = life40_886;
    p2 = life42_919;
    forestValue134_742_0 = (-life38_853);
    }
    p1 = forestValue134_742_0;
    life10_7 = life37_851;
    }
    life48_1001 = ((java.util.List)(life28_742)).iterator();
    forest_cycle_748: while (true) {
    if (!(((java.util.Iterator)(life48_1001)).hasNext())) {
        break forest_join_764;
    }
    life49_1010 = ((moom.CA)(((java.util.Iterator)(life48_1001)).next()));
    p1 = ((moom.CA)(life49_1010)).b(((moom.CA)(life10_7)), ((double)(p1)));
    if (!((life9_10 == 0))) {
        break forest_join_770;
    }
    if (!((life9_10 != 0))) {
        continue forest_cycle_748;
    }
    break forest_cycle_748;
    }
    }
    life10_7 = ((moom.CA)(life10_7)).c(((double)(0x0.0p0d)), ((double)(p1)), ((double)(0x0.0p0d)));
    }
    spill134_46 = ((life21_723 * life21_723) + (life25_727 * life25_727));
    if (!((life9_10 == 0))) {
        forestValue134_793_0 = spill134_46;
        break forest_join_793;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill134_46)), ((double)(((p0 * p0) + (p2 * p2))))) >= 0))) {
        break forest_join_796;
    }
    p0 = life21_723;
    p1 = life23_725;
    forestValue134_793_0 = life25_727;
    }
    p2 = forestValue134_793_0;
    life10_7 = life27_729;
    }
    forestValue134_797_0 = this;
    }
    spill134_47 = recovery.source.CarrierOps.dcmpl(((double)(life11_9)), ((double)(p0)));
    if (!((life9_10 == 0))) {
        forestValue134_810_0 = forestValue134_797_0;
        forestValue134_810_1 = spill134_47;
        break forest_join_810;
    }
    if (!((spill134_47 == 0))) {
        forestValue134_809_0 = forestValue134_797_0;
        break forest_join_809;
    }
    spill134_48 = recovery.source.CarrierOps.dcmpl(((double)(life15_14)), ((double)(p2)));
    if (!((life9_10 == 0))) {
        forestValue134_810_0 = forestValue134_797_0;
        forestValue134_810_1 = spill134_48;
        break forest_join_810;
    }
    if (!((spill134_48 != 0))) {
        forestValue134_811_0 = forestValue134_797_0;
        break forest_join_811;
    }
    forestValue134_809_0 = forestValue134_797_0;
    }
    forestValue134_810_0 = forestValue134_809_0;
    forestValue134_810_1 = 1;
    }
    forestValue134_812_0 = forestValue134_810_0;
    forestValue134_812_1 = forestValue134_810_1;
    break forest_join_812;
    }
    forestValue134_812_0 = forestValue134_811_0;
    forestValue134_812_1 = 0;
    }
    ((com.moon.n6)(forestValue134_812_0)).s = ((boolean)__sourceIntrinsic_integerToBoolean((forestValue134_812_1)));
    spill134_49 = this;
    spill134_50 = recovery.source.CarrierOps.dcmpl(((double)(life13_12)), ((double)(p1)));
    if (!((life9_10 == 0))) {
        forestValue134_821_0 = spill134_49;
        forestValue134_821_1 = spill134_50;
        break forest_join_821;
    }
    if (!((spill134_50 != 0))) {
        forestValue134_822_0 = spill134_49;
        break forest_join_822;
    }
    forestValue134_821_0 = spill134_49;
    forestValue134_821_1 = 1;
    }
    forestValue134_823_0 = forestValue134_821_0;
    forestValue134_823_1 = forestValue134_821_1;
    break forest_join_823;
    }
    forestValue134_823_0 = forestValue134_822_0;
    forestValue134_823_1 = 0;
    }
    ((com.moon.n6)(forestValue134_823_0)).r = ((boolean)__sourceIntrinsic_integerToBoolean((forestValue134_823_1)));
    spill134_51 = this;
    spill134_52 = this.r;
    if (!((life9_10 == 0))) {
        forestValue134_835_0 = spill134_51;
        forestValue134_835_1 = ((spill134_52) ? 1 : 0);
        break forest_join_835;
    }
    if (!(spill134_52)) {
        forestValue134_840_0 = spill134_51;
        break forest_join_840;
    }
    forestValue134_835_0 = spill134_51;
    forestValue134_835_1 = recovery.source.CarrierOps.dcmpg(((double)(((double) this.j))), ((double)(0x0.0p0d)));
    }
    if (!((life9_10 == 0))) {
        forestValue134_839_0 = forestValue134_835_0;
        forestValue134_839_1 = forestValue134_835_1;
        break forest_join_839;
    }
    if (!((forestValue134_835_1 < 0))) {
        forestValue134_840_0 = forestValue134_835_0;
        break forest_join_840;
    }
    forestValue134_839_0 = forestValue134_835_0;
    forestValue134_839_1 = 1;
    }
    forestValue134_841_0 = forestValue134_839_0;
    forestValue134_841_1 = forestValue134_839_1;
    break forest_join_841;
    }
    forestValue134_841_0 = forestValue134_840_0;
    forestValue134_841_1 = 0;
    }
    ((com.moon.n6)(forestValue134_841_0)).t = ((boolean)__sourceIntrinsic_integerToBoolean((forestValue134_841_1)));
    spill134_53 = recovery.source.CarrierOps.dcmpl(((double)(life11_9)), ((double)(p0)));
    if (!((life9_10 == 0))) {
        forestValue134_854_0 = spill134_53;
        break forest_join_854;
    }
    if (!((spill134_53 != 0))) {
        break forest_join_851;
    }
    this.i = ((float)(0x0.0p0f));
    }
    forestValue134_854_0 = recovery.source.CarrierOps.dcmpl(((double)(life13_12)), ((double)(p1)));
    }
    if (!((life9_10 == 0))) {
        forestValue134_863_0 = forestValue134_854_0;
        break forest_join_863;
    }
    if (!((forestValue134_854_0 != 0))) {
        break forest_join_860;
    }
    this.j = ((float)(0x0.0p0f));
    }
    forestValue134_863_0 = recovery.source.CarrierOps.dcmpl(((double)(life15_14)), ((double)(p2)));
    }
    if (!((forestValue134_863_0 != 0))) {
        break forest_join_867;
    }
    this.k = ((float)(0x0.0p0f));
    }
    this.f = ((float)((((float) (((moom.CA)(life10_7)).b + ((moom.CA)(life10_7)).e)) / 0x1.0p1f)));
    this.g = ((float)(((float) ((moom.CA)(life10_7)).c)));
    this.h = ((float)((((float) (((moom.CA)(life10_7)).d + ((moom.CA)(life10_7)).g)) / 0x1.0p1f)));
    return;
}


private void a(float p0, float p1, float p2) {
float forwardValue993_40_0;
    float forwardValue993_40_1;
    boolean spill993_0;
    float spill993_1;
    float spill993_2;
    long life4_3;
    float life7_12;
    int life6_13;
    float life7_27;
    float life7_31;
    float life8_45;
    float life9_51;
    forward_join_73: {
    forward_join_40: {
    life4_3 = (com.moon.n6.x ^ 3330099886223L);
    spill993_0 = moom.fw.a__Boolean();
    life7_12 = ((p0 * p0) + (p1 * p1));
    life6_13 = ((spill993_0) ? 1 : 0);
    spill993_1 = life7_12;
    spill993_2 = 0x1.a36e2ep-14f;
    if (!((life6_13 == 0))) {
        forwardValue993_40_0 = spill993_1;
        forwardValue993_40_1 = spill993_2;
        break forward_join_40;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill993_1)), ((float)(spill993_2))) >= 0))) {
        break forward_join_73;
    }
    life7_27 = java.lang.Math.max(((float)(0x1.0p0f)), ((float)(moom.Dr.c(((float)(life7_12))))));
    life7_31 = (p2 / life7_27);
    p0 = (p0 * life7_31);
    p1 = (p1 * life7_31);
    forwardValue993_40_0 = this.d;
    forwardValue993_40_1 = com.moon.nI.e;
    }
    life8_45 = moom.Dr.a(((float)((forwardValue993_40_0 * forwardValue993_40_1))));
    life9_51 = moom.Dr.b(((float)((this.d * com.moon.nI.e))));
    com.moon.n6 __stackOp993_12_0 = this;
    ((com.moon.n6)(__stackOp993_12_0)).i = ((float)((((com.moon.n6)(__stackOp993_12_0)).i + ((p0 * life9_51) - (p1 * life8_45)))));
    com.moon.n6 __stackOp993_15_0 = this;
    ((com.moon.n6)(__stackOp993_15_0)).k = ((float)((((com.moon.n6)(__stackOp993_15_0)).k + ((p1 * life9_51) + (p0 * life8_45)))));
    }
    return;
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
        byte[] spill1292_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1292_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1292_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1292_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1292_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1292_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private boolean a__Boolean() {
java.lang.Object local1 = ((com.moon.n6)(this)).a__CA();
    return (__sourceIntrinsic_booleanComparison((((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.n6.a)).I)).a(((moom.CA)(((moom.CA)(local1)).b(((double)(-0x1.99999ap-4d)), ((double)(-0x1.99999ap-2d)), ((double)(-0x1.99999ap-4d))))), ((moom.fn)(moom.fn.h))))) != 0);
}


public moom.DR a(int p0) {
java.lang.Object lexicalValue267_26_0;
    boolean spill267_0;
    com.moon.n6 spill267_1;
    long life2_3;
    int life5_8;
    int life4_9;
    lexical_join_26: {
    lexical_join_22: {
    life2_3 = (com.moon.n6.x ^ 85471558511954L);
    spill267_0 = __sourceExactCall_947f444da39f47();
    life5_8 = ((java.util.ArrayList)(((com.moon.n6)(this)).a__ArrayList())).size();
    life4_9 = ((spill267_0) ? 1 : 0);
    lexical_cycle_10: while (true) {
    if (!((life5_8 <= (p0 + 1)))) {
        break lexical_join_22;
    }
    spill267_1 = this;
    if (!((life4_9 != 0))) {
        lexicalValue267_26_0 = spill267_1;
        break lexical_join_26;
    }
    ((com.moon.n6)(spill267_1)).a__Void();
    life5_8 += 1;
    if (!((life4_9 == 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    lexicalValue267_26_0 = ((java.util.ArrayList)(this.b)).get(((int)(p0)));
    }
    return ((moom.DR)(lexicalValue267_26_0));
}


public com.moon.n6 a(float p0) {
this.d = ((float)(p0));
    return this;
}


private static java.util.List<moom.CA> a(moom.CA p0) {
int forestValue227_50_0;
    boolean spill227_0;
    int spill227_1;
    long life1_3;
    java.util.ArrayList life4_7;
    int life5_11;
    int life6_16;
    int life7_20;
    int life8_26;
    int life9_32;
    int life10_38;
    moom.DX life11_45;
    int life12_47;
    int life3_48;
    int life13_53;
    int life14_62;
    net.minecraft.block.state.IBlockState life15_76;
    forest_join_99: {
    life1_3 = (com.moon.n6.x ^ 74290876022523L);
    life4_7 = new java.util.ArrayList();
    life5_11 = moom.Dr.b__Int(((double)(((moom.CA)(p0)).b)));
    spill227_0 = __sourceExactCall_947f444da39f47();
    life6_16 = moom.Dr.b__Int(((double)(((moom.CA)(p0)).c)));
    life7_20 = moom.Dr.b__Int(((double)(((moom.CA)(p0)).d)));
    life8_26 = moom.Dr.b__Int(((double)((((moom.CA)(p0)).e + 0x1.0p0d))));
    life9_32 = moom.Dr.b__Int(((double)((((moom.CA)(p0)).f + 0x1.0p0d))));
    life10_38 = moom.Dr.b__Int(((double)((((moom.CA)(p0)).g + 0x1.0p0d))));
    life11_45 = new moom.DX(0, 0, 0);
    life12_47 = life5_11;
    life3_48 = ((spill227_0) ? 1 : 0);
    forest_cycle_49: while (true) {
    forest_join_96: {
    forestValue227_50_0 = life12_47;
    forest_cycle_50: while (true) {
    if (!((forestValue227_50_0 < life8_26))) {
        break forest_join_99;
    }
    life13_53 = life7_20;
    forest_cycle_54: while (true) {
    forest_join_94: {
    forest_join_93: {
    if (!((life13_53 < life10_38))) {
        break forest_join_96;
    }
    spill227_1 = (life6_16 - 1);
    if (!((life3_48 != 0))) {
        forestValue227_50_0 = spill227_1;
        continue forest_cycle_50;
    }
    life14_62 = spill227_1;
    forest_cycle_63: while (true) {
    if (!((life14_62 < life9_32))) {
        break forest_join_93;
    }
    ((moom.DX)(life11_45)).a(((int)(life12_47)), ((int)(life14_62)), ((int)(life13_53)));
    life15_76 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.n6.a)).I)).a__fE(((moom.DT)(life11_45)));
    ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life15_76)).a__ch())).a(((net.minecraft.world.World)(((net.minecraft.client.Minecraft)(com.moon.n6.a)).I)), ((moom.DT)(life11_45)), ((net.minecraft.block.state.IBlockState)(life15_76)), ((moom.CA)(p0)), ((java.util.List)(life4_7)), ((net.minecraft.entity.Entity)(((net.minecraft.client.Minecraft)(com.moon.n6.a)).K)));
    life14_62 += 1;
    if (!((life3_48 != 0))) {
        break forest_join_94;
    }
    if (!((life3_48 == 0))) {
        continue forest_cycle_63;
    }
    break forest_cycle_63;
    }
    }
    life13_53 += 1;
    }
    if (!((life3_48 == 0))) {
        continue forest_cycle_54;
    }
    break forest_cycle_54;
    }
    break forest_cycle_50;
    }
    }
    life12_47 += 1;
    if (!((life3_48 == 0))) {
        continue forest_cycle_49;
    }
    break forest_cycle_49;
    }
    }
    return life4_7;
}


public java.util.ArrayList<moom.DR> a__ArrayList() {
return this.b;
}


public com.moon.n6 a(boolean p0) {
this.r = ((boolean)(p0));
    return this;
}


public com.moon.n6 m(float p0) {
this.q = ((float)(p0));
    return this;
}


public float m() {
return this.p;
}


public float k() {
return this.n;
}


public com.moon.n6 k(float p0) {
this.o = ((float)(p0));
    return this;
}


public boolean g__Boolean() {
return ((((this.t) ? 1 : 0)) != 0);
}


public com.moon.n6 g(float p0) {
this.j = ((float)(p0));
    return this;
}


public float g() {
return this.j;
}


public com.moon.n6 j(float p0) {
this.m = ((float)(p0));
    return this;
}


public float j() {
return this.m;
}


public boolean j__Boolean() {
return ((((this.w) ? 1 : 0)) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2814_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral2807_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1001_82(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_44(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_45(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_46(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_47(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_48(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_49(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_50(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_51(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_52(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_53(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_54(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_55(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_56(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_57(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_58(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_59(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_60(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_61(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_62(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_63(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_64(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_65(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite841_66(java.lang.String a0, java.util.ArrayList a1, java.lang.String a2, net.minecraft.entity.EntityLivingBase a3, java.lang.String a4, float a5, java.lang.String a6, float a7, java.lang.String a8, float a9, java.lang.String a10, float a11, java.lang.String a12, float a13, java.lang.String a14, float a15, java.lang.String a16, float a17, java.lang.String a18, float a19, java.lang.String a20, float a21, java.lang.String a22, float a23, java.lang.String a24, float a25, java.lang.String a26, float a27, java.lang.String a28, float a29, java.lang.String a30, float a31, java.lang.String a32, boolean a33, java.lang.String a34, boolean a35, java.lang.String a36, boolean a37, java.lang.String a38, boolean a39, java.lang.String a40, boolean a41, java.lang.String a42, boolean a43, java.lang.String a44) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native boolean __sourceExactCall_947f444da39f47();
private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);
private static native java.lang.String __sourceExactCall_b87a38a1827870(byte[] p0);
private static native java.lang.String __sourceExactCall_c38dccba43e63c(int p0, long p1);
private static native java.util.List __sourceExactCall_f2803f650758c8(moom.CA p0);
}
