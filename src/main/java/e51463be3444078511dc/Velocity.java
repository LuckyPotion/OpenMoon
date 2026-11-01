package com.moon.module.impl;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Velocity extends com.moon.module.Module {

private com.moon.setting.EnumSetting<com.moon.bf> s;

public com.moon.setting.IntegerSetting t;

public com.moon.setting.IntegerSetting u;

public com.moon.setting.IntegerSetting v;

public com.moon.setting.IntegerSetting w;

public com.moon.setting.BooleanSetting x;

public com.moon.setting.BooleanSetting y;

public com.moon.setting.BooleanSetting z;

public com.moon.setting.BooleanSetting A;

public com.moon.setting.IntegerSetting B;

public com.moon.setting.BooleanSetting C;

private static long D;

private static java.lang.String[] E;

private static java.lang.String[] F;

private static java.util.Map G;

private static long[] H;

private static java.lang.Integer[] I;

private static java.util.Map J;

public Velocity(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_9aa41cdda8e055e4(com.moon.module.impl.Velocity receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5_life1 = (com.moon.module.impl.Velocity.D ^ 114283997780102L);

    com.moon.module.impl.Velocity.__sourceConstructorInit_9aa41cdda8e055e4_0(((com.moon.module.impl.Velocity)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.Velocity)(receiver)).s = ((com.moon.setting.EnumSetting)(((com.moon.mg)(((com.moon.mg)(com.moon.setting.EnumSetting.builder(((java.lang.String)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_3(10341, (7818372301307214282L ^ local5_life1)))), ((java.lang.Class)(com.moon.bf.class)), ((com.moon.module.Module)(receiver))))).a(((java.lang.String)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_6(4171, (9085620357142004209L ^ local5_life1)))), ((java.lang.Enum)(com.moon.bf.NORMAL))))).a()));

    ((com.moon.module.impl.Velocity)(receiver)).t = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_11(6719, (467213767790218130L ^ local5_life1))))))).a(((java.lang.String)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_13(6525, (5083669346996013254L ^ local5_life1)))), ((int)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_14(12660, (6683870698956273856L ^ local5_life1)))), ((int)(0)), ((int)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_15(18274, (5407145155277344471L ^ local5_life1)))), ((int)(1))))).a(((java.util.function.Supplier)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_17(receiver)))))).a()));

    ((com.moon.module.impl.Velocity)(receiver)).u = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_21(4340, (2124809034285334868L ^ local5_life1))))))).a(((java.lang.String)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_23(9040, (2243193590277042934L ^ local5_life1)))), ((int)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_24(31014, (6705585750639603860L ^ local5_life1)))), ((int)(0)), ((int)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_25(1180, (5494713990355225898L ^ local5_life1)))), ((int)(1))))).a(((java.util.function.Supplier)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_27(receiver)))))).a()));

    ((com.moon.module.impl.Velocity)(receiver)).v = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_31(3930, (3738181777089257214L ^ local5_life1))))))).a(((java.lang.String)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_33(13182, (57035647558050497L ^ local5_life1)))), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_34(23415, (126941341491188423L ^ local5_life1)))), ((int)(1))))).a(((java.util.function.Supplier)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_36(receiver)))))).a()));

    ((com.moon.module.impl.Velocity)(receiver)).w = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_40(19595, (1635125594864459062L ^ local5_life1))))))).a(((java.lang.String)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_42(17630, (6827827097786422652L ^ local5_life1)))), ((int)(0)), ((int)(1)), ((int)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_43(16768, (8535881326813956151L ^ local5_life1)))), ((int)(1))))).a(((java.util.function.Supplier)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_45(receiver)))))).a()));

    ((com.moon.module.impl.Velocity)(receiver)).x = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_49(11143, (3053101156923046457L ^ local5_life1))))))).a(((java.lang.String)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_51(9916, (5425610285489190681L ^ local5_life1)))), ((boolean)(false))))).a(((java.util.function.Supplier)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_53(receiver)))))).a()));

    ((com.moon.module.impl.Velocity)(receiver)).y = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_57(24619, (4407498347249480087L ^ local5_life1))))))).a(((java.lang.String)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_59(6591, (326485115751057429L ^ local5_life1)))), ((boolean)(false))))).a(((java.util.function.Supplier)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_61(receiver)))))).a()));

    ((com.moon.module.impl.Velocity)(receiver)).z = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_65(26370, (5251531852983776940L ^ local5_life1))))))).a(((java.lang.String)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_67(32466, (6073613795991727989L ^ local5_life1)))), ((boolean)(false))))).a(((java.util.function.Supplier)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_69(receiver)))))).a()));

    ((com.moon.module.impl.Velocity)(receiver)).A = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_73(20352, (4857238393154379305L ^ local5_life1))))))).a(((java.lang.String)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_75(23103, (2517930695914851223L ^ local5_life1)))), ((boolean)(true))))).a(((java.util.function.Supplier)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_77(receiver)))))).a()));

    boolean __sourceSpill215_92 = com.moon.bg.b();

    ((com.moon.module.impl.Velocity)(receiver)).B = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_82(15153, (2433215534289382042L ^ local5_life1))))))).a(((java.lang.String)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_84(22121, (3309287409876076490L ^ local5_life1)))), ((int)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_85(2845, (433823971779084974L ^ local5_life1)))), ((int)(1)), ((int)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_86(6907, (2354961321563624266L ^ local5_life1)))), ((int)(1))))).a(((java.util.function.Supplier)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_88(receiver)))))).a()));

    ((com.moon.module.impl.Velocity)(receiver)).C = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_93(8847, (5187591920548999971L ^ local5_life1))))))).a(((java.lang.String)(__sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_95(25949, (4171913119171097852L ^ local5_life1)))), ((boolean)(true))))).a()));

    boolean local7_life99 = __sourceSpill215_92;

    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {

        com.moon.bg.b(((boolean)__sourceIntrinsic_integerToBoolean(((local7_life99 ? 0 : 1)))));

    }

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_9aa41cdda8e055e4_0(com.moon.module.impl.Velocity a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

static {
D = ((long)(((moom._a)(moom._c.a(((long)(7554072605766781496L)), ((long)(733845014251914765L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(245415691441774L)))));
    G = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.module.impl.Velocity.D ^ 23604092840323L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill296_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill296_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill296_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill296_14 = new byte[8];
    (__sourceSpill296_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill296_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation296_16 = __sourceSpill296_14;
    ((javax.crypto.Cipher)(__sourceSpill296_11)).init(((int)(__sourceSpill296_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill296_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation296_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[22];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "_þzaÛeêÀvÔnTr\006¦ú E,Ø0Ñ$!<£úXx9~¨¥SÎwX{WYHbtâ£ÿ 4Å\020ön\037¶ëïìe\016pDµt°¼ÐBßz«|\022\034u{(0ðºÖïlW\027~Ý$H\rº/©zy\007v·B\0366¥2\016±j\017ØÊQ¿(HÀÔ[ç×aÙ~ZÐÌ[¨4\026,ÏQ¾jqØÂ\1779uÿEóÝ´H\004(\017\022A²º¸uÝÿªÂ74\021\021æ\006ÞW´¼¯R,ßx\000K\f'ÄªìP68oä´Ó\\sS\0027xCVL^Á\013,Ðc\000#¤hgLã-\034\030K·\023Ö­[©fÆÛl;eüîÁý%:oT¹º()r²h\\ª'ï\r¥Õd¢ð¤,mÈ0\002¸\036Y\027¶X\032\034\020Pþ%´-\035\030&x\024¯\0376\005lr§ó\017Õê!UK(ªCÍÕ\0037Lta@Ð3ô\036ÔÂ8Â_Í5ª½%=JÿîâéK{%±Ý(¨.y/KÑ\037P${B¼@\f&u+XoR.zpÈÏåÒ~\177×5\fìÅCèw Ëäð¼¿¡uLâ\002þÓP\032,Ø\022+¼¿ÀÍ£\tì\r\022 » \016zý{4#yãÂ#Í~Ñ\006éN©{z CWkçÀ>(dìn\001[W\\G\006ÚÙ\004\022\rðÔò\177Fàð&»Ö*zp>§\b&ü.^ 7\tsÌÐE\034\0045ü?Q\022à&ÿÅ»\016-¦<Ôm<\030\006uñ6»ñÀ\022\033Ï%\024c\021Æ7í «R\020/EA\fü\037ôá.ãòÜu¹·À(ôøVùø\fó3®TUï£P´¢R\007\\\030cc=\001±âº¥ÁB»w\027ÁY°(Oõ\035Öï*(ÅNÄë\017Â\021vº­ß@\177¢uS«aïÏ­6E­.XõþmI ×s²*å\030BU»LZ<\016\007I¾ a9çen®VÁÆ\027"))).length();
    int local16_life24 = 16;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill296_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill296_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill296_29)).doFinal(((byte[])(__sourceSpill296_28)));
        java.lang.String __sourceSpill296_34 = ((java.lang.String)(com.moon.module.impl.Velocity.c(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill296_35 = local20_life19;
        int __sourceSpill296_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill296_35)[__sourceSpill296_36] = __sourceSpill296_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "¿\013Q ^<\037Ð£zþU\016¼=êÃ\026]\030Ø8-'/.JW½¢Õ//ô$oÃ\031\020IØM$\017+\005/wç"))).length();
    local16_life24 = 48;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill296_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill296_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill296_42)).doFinal(((byte[])(__sourceSpill296_41)));
        java.lang.String __sourceSpill296_47 = ((java.lang.String)(com.moon.module.impl.Velocity.c(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill296_48 = local20_life19;
        int __sourceSpill296_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill296_48)[__sourceSpill296_49] = __sourceSpill296_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    E = ((java.lang.String[])(local20_life19));
    F = ((java.lang.String[])(new java.lang.String[22]));
    J = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill296_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill296_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill296_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill296_60 = new byte[8];
    (__sourceSpill296_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill296_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation296_62 = __sourceSpill296_60;
    ((javax.crypto.Cipher)(__sourceSpill296_57)).init(((int)(__sourceSpill296_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill296_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation296_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[8];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "z\027È\nÁf­ÂÍ·S\003/\0257É÷q«\026\017\013\020\000éï\034\by\017pÛ7¢ÂsÒù¸ld¼ "))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill296_71 = local4_life67;
        int __sourceSpill296_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill296_71)).substring(((int)(__sourceSpill296_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill296_76 = local6_life65;
        int __sourceSpill296_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill296_79 = new byte[8];
        (__sourceSpill296_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill296_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill296_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill296_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill296_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill296_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill296_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill296_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill296_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill296_80)).doFinal(((byte[])(__sourceSpill296_79)));
        (__sourceSpill296_76)[__sourceSpill296_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "7n^u{Ô\033\037/+ùæ"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill296_84 = local4_life67;
        int __sourceSpill296_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill296_84)).substring(((int)(__sourceSpill296_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill296_89 = local6_life65;
        int __sourceSpill296_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill296_92 = new byte[8];
        (__sourceSpill296_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill296_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill296_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill296_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill296_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill296_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill296_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill296_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill296_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill296_93)).doFinal(((byte[])(__sourceSpill296_92)));
        (__sourceSpill296_89)[__sourceSpill296_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    H = ((long[])(local6_life65));
    I = ((java.lang.Integer[])(new java.lang.Integer[8]));
}


private static java.lang.String c(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 9024);
    if (((com.moon.module.impl.Velocity.F)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.Velocity.G)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.Velocity.G)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/le", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.Velocity.E)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.Velocity.F)[life5_8] = com.moon.module.impl.Velocity.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.Velocity.F)[life5_8];
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.Velocity.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String c(byte[] p0) {
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
        byte[] spill1256_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1256_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1256_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1256_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1256_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1256_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2750_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/le"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2751_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/le"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.module.impl.Velocity.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 31581;
      if (I[var3] == null) {
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
         long var5 = H[var3];
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
         Object[] var9 = (Object[])J.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               J.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/le", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         I[var3] = var15;
      }

      return I[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private java.lang.Boolean lambda$new$0() {
long local1 = (com.moon.module.impl.Velocity.D ^ 91039766668120L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.EnumSetting)(this.s)).getValue() == com.moon.bf.NORMAL) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$1() {
long local1 = (com.moon.module.impl.Velocity.D ^ 67036016905867L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.EnumSetting)(this.s)).getValue() == com.moon.bf.NORMAL) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$3() {
long local1 = (com.moon.module.impl.Velocity.D ^ 119982173828878L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.EnumSetting)(this.s)).getValue() == com.moon.bf.NORMAL) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$2() {
long local1 = (com.moon.module.impl.Velocity.D ^ 22668192313780L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.EnumSetting)(this.s)).getValue() == com.moon.bf.NORMAL) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$4() {
long local1 = (com.moon.module.impl.Velocity.D ^ 14364819645077L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.EnumSetting)(this.s)).getValue() == com.moon.bf.NORMAL) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$8() {
long local1 = (com.moon.module.impl.Velocity.D ^ 138286045486927L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.EnumSetting)(this.s)).getValue() == com.moon.bf.DELAYED) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$6() {
long local1 = (com.moon.module.impl.Velocity.D ^ 37052808787689L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.EnumSetting)(this.s)).getValue() == com.moon.bf.NORMAL) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$5() {
long local1 = (com.moon.module.impl.Velocity.D ^ 89910808312700L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.EnumSetting)(this.s)).getValue() == com.moon.bf.NORMAL) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$7() {
long local1 = (com.moon.module.impl.Velocity.D ^ 22406621248173L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.EnumSetting)(this.s)).getValue() == com.moon.bf.DELAYED) ? 1 : 0)))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_17(com.moon.module.impl.Velocity a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_25(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_27(com.moon.module.impl.Velocity a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_31(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_34(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_36(com.moon.module.impl.Velocity a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_40(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_43(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_45(com.moon.module.impl.Velocity a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_49(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_51(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_53(com.moon.module.impl.Velocity a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_57(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_59(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_61(com.moon.module.impl.Velocity a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_65(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_67(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_69(com.moon.module.impl.Velocity a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_73(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_75(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_77(com.moon.module.impl.Velocity a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_82(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_86(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_88(com.moon.module.impl.Velocity a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_93(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9aa41cdda8e055e4_originalDynamicSite215_95(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2750_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2751_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
