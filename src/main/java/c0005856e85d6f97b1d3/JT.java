package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class JT {

private static java.util.Map<java.lang.String, moom.JV> a;

private static boolean b;

private static net.minecraft.client.renderer.RenderGlobal c;

private static moom.JU d;

private static moom.oo e;

private static moom.JX f;

private static boolean g;

private static java.lang.String[] h;

private static java.lang.String[] i;

private static java.lang.String[] j;

private static long k;

private static java.lang.String[] l;

private static java.lang.String[] m;

private static java.util.Map n;

private static long[] o;

private static java.lang.Integer[] p;

private static java.util.Map q;

public JT() {
super();
}


static {
k = ((long)(((moom._a)(moom._c.a(((long)(-6442540422728477935L)), ((long)(-2067690130138372244L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(245868017691543L)))));
    long local20_life6 = (moom.JT.k ^ 32669802525249L);
    n = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life9;
    javax.crypto.Cipher __sourceSpill602_11 = (local11_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill602_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill602_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill602_14 = new byte[8];
    (__sourceSpill602_14)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local12_life15 = 1;
    while ((local12_life15 < 8)) {
        (__sourceSpill602_14)[local12_life15] = ((byte) ((int) ((local20_life6 << (local12_life15 * 8)) >>> 56)));
        local12_life15 += 1;
    }
    byte[] __sourcePreallocation602_16 = __sourceSpill602_14;
    ((javax.crypto.Cipher)(__sourceSpill602_11)).init(((int)(__sourceSpill602_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill602_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation602_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local18_life19 = new java.lang.String[32];
    int local16_life20 = 0;
    java.lang.String local15_life21;
    int local17_life23 = ((java.lang.String)((local15_life21 = "ë\030\023 \r\020ÕqIr\002¬»B\020Suìæ)S\024^óáç4\177\002¼\007(ËÞe<*m4íì¸éüu¦2§üÒm\nÂ¥¦Øª½\177ps6ÌKXõ \022Â¨û\025)`?5®w$ÜÁ&\003®\b\005\\?ãÉ4#ÿÑå\020¬¤0>øz>8D'S¹×\004(J*ÓÜæágsU*Ìz\001Ï\007Nó,Z5àcªï\022±Ëõ\004½åYÕtç^y\021\030EZå\017Å-.\003´òóýÊ~w\016\004@é[b\016(HC?Úåmf£ò\003=h\031ý©}«â\006\nKx±àeê¼|¼ :4\030¡óm\r2WÏ91E&0£=|y/Yj(Á\024$ZÍA¸e8ó\007A\n¤c8¨÷å¤\002\"èAEÞÃ\020Ï.Ìõ\002ÁE âI-=Bª7Á£,'»\021ø\024ñJ\007öN@F\027\033\036Ü\013f\020\017bÌ©\032K ×\n!éZÓ\024\030\032\\\022\025»  GÝX¡&:\037(ãeª¨ ÖDÈÈpõ\020³\t½Ýç4WÙ\017óý®óYç\034ã©6Yn(¯=qE%Ø\000]ñ\016¦&\027l b\0051\005ËÚí21&ot>Lh\025,îe¬DÊ\007}\020âÝ»¡\023Å¥àÄ÷,\017F;¡\020øR>ÿ,ÞãíÔê¹8¦T(5 Æûvïc5Ïû\023¢`}kj\bx£µ¶4&\017´\026öí\0335\037â\021\034<(QÐ{­`QÛ®\023\b\002â/½uòômYÙã\013p¶KîDT\033½\177T\000\036 \020\035Á·#Fï¬Kû`Ej_(\031\004W\037\027¬\017\n\002c²B¥IÞa\r\033)v\036¢uÃ\005MÔßÌch_\032ó¿ b\033\004,7¥æïQg\013\rÈágtF\025ÇJé\037mà¥ZÝ CW\000B\tØ¸\024²ÙõzªÐô$°|ëw\022§\001ý±W¹(\005$\\¬µGq2\022\035>\004ÏuôÄ}Ã}Ss*\004«¾(\177RqpW#{×j[\020ó+,Kn'ö\"±\021\001¶}\b Þ6NÑ5TR\024}\022EM\002H] NêË`þËRiß¯+4& öÊ_¶)æip¨÷­Å±V\026UÏ\036Äìï\000\027\020¡¼¸\020\022¶»ý2\031E9~ÛßCh âiWkËì«/ÞO$Þ\022\033iÂ/»\177ïï)\fýÎ3_RÝ\020ëµ3Úa¼üYiXr8ÈÕ"))).length();
    int local14_life24 = 16;
    int local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill602_28 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill602_29 = local11_life9;
        byte[] local19_life31 = ((javax.crypto.Cipher)(__sourceSpill602_29)).doFinal(((byte[])(__sourceSpill602_28)));
        java.lang.String __sourceSpill602_34 = ((java.lang.String)(moom.JT.a(((byte[])(local19_life31))))).intern();
        java.lang.String[] __sourceSpill602_35 = local18_life19;
        int __sourceSpill602_36 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill602_35)[__sourceSpill602_36] = __sourceSpill602_34;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    local17_life23 = ((java.lang.String)((local15_life21 = "àè(×=\036¤Þrðï÷ùÀÆ0±ÌÑÎs@ËBïÉ!\020èç7\016b\"è\016ÌÊÕ^ \001É"))).length();
    local14_life24 = 32;
    local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill602_41 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill602_42 = local11_life9;
        byte[] local19_life44 = ((javax.crypto.Cipher)(__sourceSpill602_42)).doFinal(((byte[])(__sourceSpill602_41)));
        java.lang.String __sourceSpill602_47 = ((java.lang.String)(moom.JT.a(((byte[])(local19_life44))))).intern();
        java.lang.String[] __sourceSpill602_48 = local18_life19;
        int __sourceSpill602_49 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill602_48)[__sourceSpill602_49] = __sourceSpill602_47;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    l = ((java.lang.String[])(local18_life19));
    m = ((java.lang.String[])(new java.lang.String[32]));
    q = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill602_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill602_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill602_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill602_60 = new byte[8];
    (__sourceSpill602_60)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill602_60)[local1_life61] = ((byte) ((int) ((local20_life6 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation602_62 = __sourceSpill602_60;
    ((javax.crypto.Cipher)(__sourceSpill602_57)).init(((int)(__sourceSpill602_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill602_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation602_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[7];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "j3²ÖA\013*Á[Ã`þæÑr\020ø­a>ó§\n ÌÑºVå\035B[Ûþ"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill602_71 = local4_life67;
        int __sourceSpill602_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill602_71)).substring(((int)(__sourceSpill602_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill602_76 = local6_life65;
        int __sourceSpill602_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill602_79 = new byte[8];
        (__sourceSpill602_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill602_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill602_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill602_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill602_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill602_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill602_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill602_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill602_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill602_80)).doFinal(((byte[])(__sourceSpill602_79)));
        (__sourceSpill602_76)[__sourceSpill602_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "P\t\003®.iºú\nåôÇ\003Ç"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill602_84 = local4_life67;
        int __sourceSpill602_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill602_84)).substring(((int)(__sourceSpill602_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill602_89 = local6_life65;
        int __sourceSpill602_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill602_92 = new byte[8];
        (__sourceSpill602_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill602_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill602_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill602_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill602_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill602_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill602_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill602_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill602_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill602_93)).doFinal(((byte[])(__sourceSpill602_92)));
        (__sourceSpill602_89)[__sourceSpill602_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    o = ((long[])(local6_life65));
    p = ((java.lang.Integer[])(new java.lang.Integer[7]));
    a = ((java.util.Map)(new java.util.HashMap()));
    int __sourceSpill602_100 = 4954;
    b = ((boolean)(false));
    long __sourceSpill602_102 = (7569222232714436953L ^ local20_life6);
    d = ((moom.JU)(new moom.JU()));
    f = ((moom.JX)(new moom.JX()));
    g = ((boolean)(false));
    java.lang.String[] __sourceSpill602_107 = new java.lang.String[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite602_105(__sourceSpill602_100, __sourceSpill602_102)];
    (__sourceSpill602_107)[0] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite602_106(31122, (5863731838911919469L ^ local20_life6));
    (__sourceSpill602_107)[1] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite602_108(29713, (6579513926122846441L ^ local20_life6));
    (__sourceSpill602_107)[2] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite602_109(1726, (5690495990741584463L ^ local20_life6));
    (__sourceSpill602_107)[3] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite602_110(16619, (6190012716637228032L ^ local20_life6));
    (__sourceSpill602_107)[4] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite602_111(31135, (2183953505476064632L ^ local20_life6));
    (__sourceSpill602_107)[5] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite602_112(9173, (3345380710895939369L ^ local20_life6));
    (__sourceSpill602_107)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite602_113(31715, (4913013795011660258L ^ local20_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite602_114(31233, (6912460616228779749L ^ local20_life6));
    (__sourceSpill602_107)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite602_115(4730, (5945977501726367870L ^ local20_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite602_116(3137, (1555131046032031925L ^ local20_life6));
    (__sourceSpill602_107)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite602_117(25717, (2161749592957032055L ^ local20_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite602_118(26626, (4051844540524963044L ^ local20_life6));
    (__sourceSpill602_107)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite602_119(25583, (3088132525674009066L ^ local20_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite602_120(12264, (7467384231962436356L ^ local20_life6));
    h = ((java.lang.String[])(__sourceSpill602_107));
    i = ((java.lang.String[])(net.minecraft.entity.passive.EntityHorse.ci));
    j = ((java.lang.String[])(net.minecraft.entity.passive.EntityHorse.cj));
}

private static native <E extends Throwable> moom.JJ __sourceHandlerCall_5741397de4c6baac115f() throws E;
private static final class __SourceHandler_5741397de4c6baac115f {

public static moom.JJ f668() throws Throwable {
    net.minecraft.tileentity.TileEntity forwardValue668_22_0;
    net.minecraft.tileentity.TileEntity spill668_0;
    long life0_3;
    net.minecraft.entity.Entity[] life2_5;
    net.minecraft.tileentity.TileEntity life3_30;
    forward_join_33: {
    forward_join_31: {
    forward_join_22: {
    forward_join_15: {
    life0_3 = (__fieldRead668_0() ^ 28000248988600L);
    life2_5 = __call668_1();
    if (!((__fieldRead668_3(__fieldRead668_2()) != null))) {
        break forward_join_15;
    }
    __call668_7(__fieldRead668_4(), __fieldRead668_6(__fieldRead668_5()));
    return __fieldRead668_8();
    }
    spill668_0 = __fieldRead668_10(__fieldRead668_9());
    if (!((life2_5 != null))) {
        forwardValue668_22_0 = spill668_0;
        break forward_join_22;
    }
    if (!((spill668_0 != null))) {
        break forward_join_33;
    }
    forwardValue668_22_0 = __fieldRead668_12(__fieldRead668_11());
    }
    life3_30 = forwardValue668_22_0;
    if (!((life2_5 != null))) {
        break forward_join_31;
    }
    if (!((__call668_13(life3_30) != null))) {
        break forward_join_33;
    }
    __call668_15(__fieldRead668_14(), life3_30);
    }
    return __fieldRead668_16();
    }
    return null;
}
public static void h668_0(moom.Oo p0) throws Throwable {
    throw __call1066800_0(p0);
}
public static void h668_1(moom.Oo p0) throws Throwable {
    throw __call1066801_0(p0);
}
public static void h668_2(moom.Oo p0) throws Throwable {
    throw __call1066802_0(p0);
}
public static void h668_3(moom.Oo p0) throws Throwable {
    throw __call1066803_0(p0);
}
public static void h668_4(moom.Oo p0) throws Throwable {
    throw __call1066804_0(p0);
}
private static native long __fieldRead668_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call668_1() throws Throwable;
private static native net.minecraft.client.renderer.RenderGlobal __fieldRead668_2() throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead668_3(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.JU __fieldRead668_4() throws Throwable;
private static native net.minecraft.client.renderer.RenderGlobal __fieldRead668_5() throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead668_6(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call668_7(moom.JU a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native moom.JU __fieldRead668_8() throws Throwable;
private static native moom.oo __fieldRead668_9() throws Throwable;
private static native net.minecraft.tileentity.TileEntity __fieldRead668_10(moom.oo a0) throws Throwable;
private static native moom.oo __fieldRead668_11() throws Throwable;
private static native net.minecraft.tileentity.TileEntity __fieldRead668_12(moom.oo a0) throws Throwable;
private static native net.minecraft.world.World __call668_13(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.JX __fieldRead668_14() throws Throwable;
private static native void __call668_15(moom.JX a0, net.minecraft.tileentity.TileEntity a1) throws Throwable;
private static native moom.JX __fieldRead668_16() throws Throwable;
private static native java.lang.Exception __call1066800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066804_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_63e2ab44d6d8fdb8fbcb(java.lang.String a0) throws E;
private static final class __SourceHandler_63e2ab44d6d8fdb8fbcb {

public static java.lang.String f669(java.lang.String p0) throws Throwable {
    int forwardValue669_38_0;
    java.lang.String forwardValue669_45_0;
    java.lang.String forwardValue669_45_1;
    java.lang.String forwardValue669_53_0;
    boolean spill669_0;
    java.lang.String spill669_1;
    java.lang.String spill669_2;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_53: {
    forward_join_52: {
    forward_join_45: {
    forward_join_38: {
    forward_join_29: {
    life1_3 = (__fieldRead669_0() ^ 90859882224000L);
    life3_5 = __call669_1();
    spill669_0 = __call669_3(p0, __invokedynamic669_2(9846, (9145306633703424322L ^ life1_3)));
    if (!((life3_5 != null))) {
        forwardValue669_38_0 = __integerCategory669_4(spill669_0);
        break forward_join_38;
    }
    if (!(spill669_0)) {
        break forward_join_29;
    }
    forwardValue669_53_0 = __call669_7(p0, __invokedynamic669_5(9846, (9145306633703424322L ^ life1_3)), __invokedynamic669_6(27261, (4008875238303157582L ^ life1_3)));
    break forward_join_53;
    }
    spill669_1 = p0;
    spill669_2 = __invokedynamic669_8(1601, (5468853168496320893L ^ life1_3));
    if (!((life3_5 != null))) {
        forwardValue669_45_0 = spill669_1;
        forwardValue669_45_1 = spill669_2;
        break forward_join_45;
    }
    forwardValue669_38_0 = __integerCategory669_10(__call669_9(spill669_1, spill669_2));
    }
    if (!((forwardValue669_38_0 != 0))) {
        break forward_join_52;
    }
    forwardValue669_45_0 = p0;
    forwardValue669_45_1 = __invokedynamic669_11(1601, (5468853168496320893L ^ life1_3));
    }
    forwardValue669_53_0 = __call669_13(forwardValue669_45_0, forwardValue669_45_1, __invokedynamic669_12(27164, (2114794248843840820L ^ life1_3)));
    break forward_join_53;
    }
    forwardValue669_53_0 = null;
    }
    return forwardValue669_53_0;
}
public static void h669_0(moom.Oo p0) throws Throwable {
    throw __call1066900_0(p0);
}
public static void h669_1(moom.Oo p0) throws Throwable {
    throw __call1066901_0(p0);
}
public static void h669_2(moom.Oo p0) throws Throwable {
    throw __call1066902_0(p0);
}
public static void h669_3(moom.Oo p0) throws Throwable {
    throw __call1066903_0(p0);
}
private static native long __fieldRead669_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call669_1() throws Throwable;
private static native java.lang.String __invokedynamic669_2(int a0, long a1) throws Throwable;
private static native boolean __call669_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory669_4(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic669_5(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic669_6(int a0, long a1) throws Throwable;
private static native java.lang.String __call669_7(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic669_8(int a0, long a1) throws Throwable;
private static native boolean __call669_9(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory669_10(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic669_11(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic669_12(int a0, long a1) throws Throwable;
private static native java.lang.String __call669_13(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.Exception __call1066900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066903_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_4d02471db6623bba6397(java.lang.String a0, int a1) throws E;
private static final class __SourceHandler_4d02471db6623bba6397 {

public static java.lang.String f670(java.lang.String p0, int p1) throws Throwable {
    java.lang.String[] lexicalValue670_11_0;
    java.lang.String lexicalValue670_39_0;
    java.lang.String[] spill670_0;
    java.lang.String spill670_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    int life5_16;
    java.lang.String life6_24;
    lexical_join_39: {
    lexical_join_38: {
    lexical_join_11: {
    life2_3 = (__fieldRead670_0() ^ 58791728875490L);
    life4_5 = __call670_1();
    spill670_0 = __fieldRead670_2();
    if (!((life4_5 != null))) {
        lexicalValue670_11_0 = spill670_0;
        break lexical_join_11;
    }
    if (!((spill670_0 != null))) {
        break lexical_join_38;
    }
    lexicalValue670_11_0 = __fieldRead670_3();
    }
    if (!((lexicalValue670_11_0 != null))) {
        break lexical_join_38;
    }
    life5_16 = 0;
    lexical_cycle_14: while (true) {
    lexical_join_36: {
    lexical_join_35: {
    if (!((life5_16 < (__fieldRead670_4()).length))) {
        break lexical_join_38;
    }
    life6_24 = (__fieldRead670_5())[life5_16];
    if (!((life4_5 != null))) {
        break lexical_join_36;
    }
    spill670_1 = p0;
    if (!((life4_5 != null))) {
        lexicalValue670_39_0 = spill670_1;
        break lexical_join_39;
    }
    if (!(__call670_6(spill670_1, life6_24, p1))) {
        break lexical_join_35;
    }
    return (__fieldRead670_7())[life5_16];
    }
    life5_16 += 1;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    lexicalValue670_39_0 = p0;
    }
    return lexicalValue670_39_0;
}
public static void h670_0(moom.Oo p0) throws Throwable {
    throw __call1067000_0(p0);
}
public static void h670_1(moom.Oo p0) throws Throwable {
    throw __call1067001_0(p0);
}
public static void h670_2(moom.Oo p0) throws Throwable {
    throw __call1067002_0(p0);
}
public static void h670_3(moom.Oo p0) throws Throwable {
    throw __call1067003_0(p0);
}
private static native long __fieldRead670_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call670_1() throws Throwable;
private static native java.lang.String[] __fieldRead670_2() throws Throwable;
private static native java.lang.String[] __fieldRead670_3() throws Throwable;
private static native java.lang.String[] __fieldRead670_4() throws Throwable;
private static native java.lang.String[] __fieldRead670_5() throws Throwable;
private static native boolean __call670_6(java.lang.String a0, java.lang.String a1, int a2) throws Throwable;
private static native java.lang.String[] __fieldRead670_7() throws Throwable;
private static native java.lang.Exception __call1067000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1067001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1067002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1067003_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_34e52b719bbba88cc878(java.util.UUID a0, net.minecraft.entity.passive.EntityVillager a1) throws E;
private static final class __SourceHandler_34e52b719bbba88cc878 {

public static void f671(java.util.UUID p0, net.minecraft.entity.passive.EntityVillager p1) throws Throwable {
    net.minecraft.entity.Entity forwardValue671_15_0;
    net.minecraft.entity.Entity[] spill671_0;
    net.minecraft.entity.Entity spill671_1;
    long life2_3;
    net.minecraft.entity.Entity life5_7;
    net.minecraft.entity.Entity[] life4_8;
    net.minecraft.entity.passive.EntityVillager life6_22;
    int life7_25;
    forward_join_31: {
    forward_join_15: {
    life2_3 = (__fieldRead671_0() ^ 63206543275408L);
    spill671_0 = __call671_1();
    life5_7 = __call671_2(p0);
    life4_8 = spill671_0;
    spill671_1 = life5_7;
    if (!((life4_8 != null))) {
        forwardValue671_15_0 = spill671_1;
        break forward_join_15;
    }
    if (!((__instanceOf671_3(spill671_1) != 0))) {
        break forward_join_31;
    }
    forwardValue671_15_0 = life5_7;
    }
    life6_22 = __cast671_4(forwardValue671_15_0);
    life7_25 = __call671_5(life6_22);
    __call671_6(p1, life7_25);
    __fieldWrite671_8(p1, __fieldRead671_7(life6_22));
    __fieldWrite671_10(p1, __fieldRead671_9(life6_22));
    }
    return;
}
public static void h671_0(moom.Oo p0) throws Throwable {
    throw __call1067100_0(p0);
}
public static void h671_1(moom.Oo p0) throws Throwable {
    throw __call1067101_0(p0);
}
private static native long __fieldRead671_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call671_1() throws Throwable;
private static native net.minecraft.entity.Entity __call671_2(java.util.UUID a0) throws Throwable;
private static native int __instanceOf671_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.passive.EntityVillager __cast671_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call671_5(net.minecraft.entity.passive.EntityVillager a0) throws Throwable;
private static native void __call671_6(net.minecraft.entity.passive.EntityVillager a0, int a1) throws Throwable;
private static native int __fieldRead671_7(net.minecraft.entity.passive.EntityVillager a0) throws Throwable;
private static native void __fieldWrite671_8(net.minecraft.entity.passive.EntityVillager a0, int a1) throws Throwable;
private static native int __fieldRead671_9(net.minecraft.entity.passive.EntityVillager a0) throws Throwable;
private static native void __fieldWrite671_10(net.minecraft.entity.passive.EntityVillager a0, int a1) throws Throwable;
private static native java.lang.Exception __call1067100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1067101_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.DD __sourceHandlerCall_a33a33855e25d868c6dd(moom.DD a0) throws E;
private static final class __SourceHandler_a33a33855e25d868c6dd {

public static moom.DD f298(moom.DD p0) throws Throwable {
    int forwardValue298_13_0;
    int forwardValue298_19_0;
    int forwardValue298_55_0;
    java.lang.Object forwardValue298_75_0;
    moom.JV forwardValue298_88_0;
    boolean spill298_0;
    boolean spill298_1;
    java.lang.String spill298_2;
    java.lang.String spill298_3;
    moom.JV spill298_4;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    moom.JJ life5_31;
    java.lang.String life6_36;
    moom.DD life7_89;
    moom.JV life7_98;
    moom.DD life8_107;
    moom.DD life8_116;
    moom.DD life4_122;
    forward_join_96: {
    forward_join_88: {
    forward_join_87: {
    forward_join_75: {
    forward_join_72: {
    forward_join_55: {
    forward_join_46: {
    forward_join_19: {
    forward_join_18: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (__fieldRead298_0() ^ 2929307220895L);
    life3_5 = __call298_1();
    spill298_0 = __fieldRead298_2();
    if (!((life3_5 != null))) {
        forwardValue298_13_0 = __integerCategory298_3(spill298_0);
        break forward_join_13;
    }
    if (!((!spill298_0))) {
        break forward_join_12;
    }
    return p0;
    }
    forwardValue298_13_0 = __integerCategory298_5(__fieldRead298_4());
    }
    if (!((life3_5 != null))) {
        forwardValue298_19_0 = forwardValue298_13_0;
        break forward_join_19;
    }
    if (!((forwardValue298_13_0 != 0))) {
        break forward_join_18;
    }
    return p0;
    }
    forwardValue298_19_0 = 1;
    }
    __fieldWrite298_6(forwardValue298_19_0);
    life5_31 = __call298_7();
    if (!((life5_31 != null))) {
        break forward_join_96;
    }
    life6_36 = __call298_8(p0);
    spill298_1 = __call298_10(life6_36, __invokedynamic298_9(21533, (2769323435361603872L ^ life1_3)));
    if (!((life3_5 != null))) {
        forwardValue298_55_0 = __integerCategory298_11(spill298_1);
        break forward_join_55;
    }
    if (!(spill298_1)) {
        break forward_join_46;
    }
    life6_36 = __call298_14(life6_36, __call298_13(__invokedynamic298_12(13985, (6699450755334566792L ^ life1_3))));
    }
    spill298_2 = life6_36;
    if (!((life3_5 != null))) {
        forwardValue298_75_0 = spill298_2;
        break forward_join_75;
    }
    forwardValue298_55_0 = __integerCategory298_17(__call298_16(spill298_2, __invokedynamic298_15(9205, (2838909364234053341L ^ life1_3))));
    }
    if (!((forwardValue298_55_0 == 0))) {
        break forward_join_72;
    }
    spill298_3 = life6_36;
    if (!((life3_5 != null))) {
        forwardValue298_75_0 = spill298_3;
        break forward_join_75;
    }
    if (!((!__call298_19(spill298_3, __invokedynamic298_18(13809, (2825136023382880476L ^ life1_3)))))) {
        break forward_join_72;
    }
    life7_89 = p0;
    __fieldWrite298_20(0);
    return life7_89;
    }
    forwardValue298_75_0 = __call298_22(__fieldRead298_21(), life6_36);
    }
    life7_98 = __cast298_23(forwardValue298_75_0);
    spill298_4 = life7_98;
    if (!((life3_5 != null))) {
        forwardValue298_88_0 = spill298_4;
        break forward_join_88;
    }
    if (!((spill298_4 == null))) {
        break forward_join_87;
    }
    life8_107 = p0;
    __fieldWrite298_24(0);
    return life8_107;
    }
    forwardValue298_88_0 = life7_98;
    }
    life8_116 = __call298_25(forwardValue298_88_0, p0, life5_31);
    __fieldWrite298_26(0);
    return life8_116;
    }
    life4_122 = p0;
    __fieldWrite298_27(0);
    return life4_122;
}
public static moom.DD h298_0(moom.Oo p0) throws Throwable {
    throw __call2029800_0(p0);
}
public static moom.DD h298_1(moom.Oo p0) throws Throwable {
    throw __call2029801_0(p0);
}
public static moom.DD h298_2(moom.Oo p0) throws Throwable {
    throw __call2029802_0(p0);
}
public static moom.DD h298_3(moom.Oo p0) throws Throwable {
    throw __call2029803_0(p0);
}
public static moom.DD h298_4(moom.Oo p0) throws Throwable {
    throw __call2029804_0(p0);
}
public static moom.DD h298_5(moom.Oo p0) throws Throwable {
    throw __call2029805_0(p0);
}
public static moom.DD h298_6(moom.Oo p0) throws Throwable {
    throw __call2029806_0(p0);
}
public static moom.DD h298_7(moom.Oo p0) throws Throwable {
    throw __call2029807_0(p0);
}
public static moom.DD h298_8(moom.Oo p0) throws Throwable {
    throw __call2029808_0(p0);
}
public static moom.DD h298_9(java.lang.Throwable p0) throws Throwable {
    java.lang.Throwable local1 = p0;
    __fieldWrite2029809_0(0);
    throw local1;
}
private static native long __fieldRead298_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call298_1() throws Throwable;
private static native boolean __fieldRead298_2() throws Throwable;
private static native int __integerCategory298_3(boolean value) throws Throwable;
private static native boolean __fieldRead298_4() throws Throwable;
private static native int __integerCategory298_5(boolean value) throws Throwable;
private static native void __fieldWrite298_6(int a0) throws Throwable;
private static native moom.JJ __call298_7() throws Throwable;
private static native java.lang.String __call298_8(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic298_9(int a0, long a1) throws Throwable;
private static native boolean __call298_10(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory298_11(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic298_12(int a0, long a1) throws Throwable;
private static native int __call298_13(java.lang.String a0) throws Throwable;
private static native java.lang.String __call298_14(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.String __invokedynamic298_15(int a0, long a1) throws Throwable;
private static native boolean __call298_16(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory298_17(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic298_18(int a0, long a1) throws Throwable;
private static native boolean __call298_19(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite298_20(int a0) throws Throwable;
private static native java.util.Map __fieldRead298_21() throws Throwable;
private static native java.lang.Object __call298_22(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native moom.JV __cast298_23(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite298_24(int a0) throws Throwable;
private static native moom.DD __call298_25(moom.JV a0, moom.DD a1, moom.JJ a2) throws Throwable;
private static native void __fieldWrite298_26(int a0) throws Throwable;
private static native void __fieldWrite298_27(int a0) throws Throwable;
private static native java.lang.Exception __call2029800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2029801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2029802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2029803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2029804_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2029805_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2029806_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2029807_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2029808_0(moom.Oo a0) throws Throwable;
private static native void __fieldWrite2029809_0(int a0) throws Throwable;

}

private static native <E extends Throwable> moom.DD __sourceHandlerCall_65c39279b50a01101c9c(moom.DD a0, int a1) throws E;
private static final class __SourceHandler_65c39279b50a01101c9c {

public static moom.DD f672(moom.DD p0, int p1) throws Throwable {
    moom.DD forwardValue672_13_0;
    moom.DD spill672_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    java.lang.String life5_19;
    int life6_27;
    java.lang.String life7_38;
    java.lang.String life8_42;
    java.lang.String life9_47;
    forward_join_27: {
    forward_join_13: {
    forward_join_12: {
    life2_3 = (__fieldRead672_0() ^ 42250009818633L);
    life4_5 = __call672_1();
    spill672_0 = p0;
    if (!((life4_5 != null))) {
        forwardValue672_13_0 = spill672_0;
        break forward_join_13;
    }
    if (!((spill672_0 == null))) {
        break forward_join_12;
    }
    return null;
    }
    forwardValue672_13_0 = p0;
    }
    life5_19 = __call672_2(forwardValue672_13_0);
    life6_27 = __call672_4(life5_19, __invokedynamic672_3(21720, (6375520583396844182L ^ life2_3)));
    if (!((life6_27 < 0))) {
        break forward_join_27;
    }
    return null;
    }
    life7_38 = __call672_5(life5_19, 0, life6_27);
    life8_42 = __call672_6(life5_19, life6_27);
    life9_47 = __invokedynamic672_7(life7_38, p1, life8_42);
    return new moom.DD(__call672_8(p0), life9_47);
}
public static void h672_0(moom.Oo p0) throws Throwable {
    throw __call1067200_0(p0);
}
public static void h672_1(moom.Oo p0) throws Throwable {
    throw __call1067201_0(p0);
}
public static void h672_2(moom.Oo p0) throws Throwable {
    throw __call1067202_0(p0);
}
private static native long __fieldRead672_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call672_1() throws Throwable;
private static native java.lang.String __call672_2(moom.DD a0) throws Throwable;
private static native int __invokedynamic672_3(int a0, long a1) throws Throwable;
private static native int __call672_4(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.String __call672_5(java.lang.String a0, int a1, int a2) throws Throwable;
private static native java.lang.String __call672_6(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.String __invokedynamic672_7(java.lang.String a0, int a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __call672_8(moom.DD a0) throws Throwable;
private static native java.lang.Exception __call1067200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1067201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1067202_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.JV __sourceHandlerCall_c9e7527e72bd6d8122d2(moom.DD a0, moom.DD a1) throws E;
private static final class __SourceHandler_c9e7527e72bd6d8122d2 {

public static moom.JV f292(moom.DD p0, moom.DD p1) throws Throwable {
    moom.JV forwardValue292_61_0;
    java.lang.String spill292_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    java.lang.String life5_8;
    java.io.InputStream life6_22;
    moom.OH life7_47;
    moom.JV life8_59;
    forward_join_61: {
    forward_join_60: {
    forward_join_38: {
    forward_join_36: {
    life2_3 = (__fieldRead292_0() ^ 115233010136752L);
    life4_5 = __call292_1();
    life5_8 = __call292_2(p0);
    spill292_0 = __call292_3(p1);
    java.lang.String __stackOp292_5_0 = life5_8;
    java.lang.String __stackOp292_5_1 = __invokedynamic292_4(11059, (1728284322130142011L ^ life2_3));
    __call292_7(__invokedynamic292_6(spill292_0, __stackOp292_5_1, __stackOp292_5_0));
    life6_22 = __call292_8(p0);
    if (!((life4_5 != null))) {
        break forward_join_36;
    }
    if (!((life6_22 == null))) {
        break forward_join_38;
    }
    java.lang.String __stackOp292_10_0 = life5_8;
    java.lang.String __stackOp292_10_1 = __invokedynamic292_9(17770, (2419075125967211902L ^ life2_3));
    __call292_12(__invokedynamic292_11(__stackOp292_10_1, __stackOp292_10_0));
    }
    return null;
    }
    life7_47 = new moom.OH();
    __call292_13(life7_47, life6_22);
    __call292_14(life6_22);
    life8_59 = new moom.JV(life7_47, life5_8, p1);
    if (!((!__call292_15(life8_59, life5_8)))) {
        break forward_join_60;
    }
    forwardValue292_61_0 = null;
    break forward_join_61;
    }
    forwardValue292_61_0 = life8_59;
    }
    return forwardValue292_61_0;
}
public static moom.JV h292_0(java.io.FileNotFoundException p0) throws Throwable {
    throw __call2029200_0(p0);
}
public static moom.JV h292_1(java.io.FileNotFoundException p0) throws Throwable {
    throw __call2029201_0(p0);
}
public static moom.JV h292_2(java.io.FileNotFoundException p0) throws Throwable {
    throw __call2029202_0(p0);
}
public static moom.JV h292_3(java.io.FileNotFoundException p0, moom.DD p1, long p2) throws Throwable {
    java.io.FileNotFoundException local4 = p0;
    java.lang.String __stackOp2029203_2_0 = __call2029203_0(p1);
    java.lang.String __stackOp2029203_2_1 = __invokedynamic2029203_1(17121, (3989947418621168368L ^ p2));
    __call2029203_4(__invokedynamic2029203_3(__stackOp2029203_2_1, __stackOp2029203_2_0));
    return null;
}
public static moom.JV h292_4(java.io.IOException p0) throws Throwable {
    java.io.IOException local1 = p0;
    __call2029204_0(local1);
    return null;
}
private static native long __fieldRead292_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call292_1() throws Throwable;
private static native java.lang.String __call292_2(moom.DD a0) throws Throwable;
private static native java.lang.String __call292_3(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic292_4(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic292_6(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call292_7(java.lang.String a0) throws Throwable;
private static native java.io.InputStream __call292_8(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic292_9(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic292_11(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call292_12(java.lang.String a0) throws Throwable;
private static native void __call292_13(moom.OH a0, java.io.InputStream a1) throws Throwable;
private static native void __call292_14(java.io.InputStream a0) throws Throwable;
private static native boolean __call292_15(moom.JV a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call2029200_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call2029201_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call2029202_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.String __call2029203_0(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic2029203_1(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic2029203_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call2029203_4(java.lang.String a0) throws Throwable;
private static native void __call2029204_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> moom.DD __sourceHandlerCall_be018c709010660b228a(moom.DD a0, boolean a1) throws E;
private static final class __SourceHandler_be018c709010660b228a {

public static moom.DD f673(moom.DD p0, boolean p1) throws Throwable {
    moom.DD forwardValue673_17_0;
    moom.DD forwardValue673_50_0;
    moom.DD forwardValue673_76_0;
    moom.DD forwardValue673_78_0;
    net.minecraft.entity.Entity[] spill673_0;
    moom.DD spill673_1;
    moom.DD spill673_2;
    moom.DD spill673_3;
    long life2_3;
    moom.DD life5_8;
    net.minecraft.entity.Entity[] life4_9;
    java.lang.String life6_23;
    java.lang.String life7_26;
    java.lang.String life8_34;
    java.lang.String life9_42;
    moom.DD life10_48;
    java.lang.String life11_64;
    moom.DD life12_82;
    forward_join_78: {
    forward_join_77: {
    forward_join_76: {
    forward_join_58: {
    forward_join_51: {
    forward_join_50: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (__fieldRead673_0() ^ 73839945775098L);
    spill673_0 = __call673_1();
    life5_8 = __call673_2(p0, p1);
    life4_9 = spill673_0;
    spill673_1 = life5_8;
    if (!((life4_9 != null))) {
        forwardValue673_17_0 = spill673_1;
        break forward_join_17;
    }
    if (!((spill673_1 == null))) {
        break forward_join_16;
    }
    return null;
    }
    forwardValue673_17_0 = life5_8;
    }
    life6_23 = __call673_3(forwardValue673_17_0);
    life7_26 = __call673_4(life5_8);
    life8_34 = __call673_6(life7_26, __invokedynamic673_5(17585, (8101357897918090736L ^ life2_3)));
    life9_42 = __invokedynamic673_8(life8_34, __invokedynamic673_7(25419, (1344741392716245518L ^ life2_3)));
    life10_48 = new moom.DD(life6_23, life9_42);
    spill673_2 = life10_48;
    if (!((life4_9 != null))) {
        forwardValue673_50_0 = spill673_2;
        break forward_join_50;
    }
    if (!(__call673_9(spill673_2))) {
        break forward_join_51;
    }
    forwardValue673_50_0 = life10_48;
    }
    return forwardValue673_50_0;
    }
    life11_64 = __call673_10(life8_34);
    if (!((life11_64 == null))) {
        break forward_join_58;
    }
    return null;
    }
    life12_82 = new moom.DD(life6_23, __invokedynamic673_12(life11_64, __invokedynamic673_11(23088, (7553501386461320038L ^ life2_3))));
    spill673_3 = life12_82;
    if (!((life4_9 != null))) {
        forwardValue673_76_0 = spill673_3;
        break forward_join_76;
    }
    if (!(__call673_13(spill673_3))) {
        break forward_join_77;
    }
    forwardValue673_76_0 = life12_82;
    }
    forwardValue673_78_0 = forwardValue673_76_0;
    break forward_join_78;
    }
    forwardValue673_78_0 = null;
    }
    return forwardValue673_78_0;
}
public static void h673_0(moom.Oo p0) throws Throwable {
    throw __call1067300_0(p0);
}
public static void h673_1(moom.Oo p0) throws Throwable {
    throw __call1067301_0(p0);
}
public static void h673_2(moom.Oo p0) throws Throwable {
    throw __call1067302_0(p0);
}
public static void h673_3(moom.Oo p0) throws Throwable {
    throw __call1067303_0(p0);
}
public static void h673_4(moom.Oo p0) throws Throwable {
    throw __call1067304_0(p0);
}
public static void h673_5(moom.Oo p0) throws Throwable {
    throw __call1067305_0(p0);
}
public static void h673_6(moom.Oo p0) throws Throwable {
    throw __call1067306_0(p0);
}
private static native long __fieldRead673_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call673_1() throws Throwable;
private static native moom.DD __call673_2(moom.DD a0, boolean a1) throws Throwable;
private static native java.lang.String __call673_3(moom.DD a0) throws Throwable;
private static native java.lang.String __call673_4(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic673_5(int a0, long a1) throws Throwable;
private static native java.lang.String __call673_6(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic673_7(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic673_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __call673_9(moom.DD a0) throws Throwable;
private static native java.lang.String __call673_10(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic673_11(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic673_12(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __call673_13(moom.DD a0) throws Throwable;
private static native java.lang.Exception __call1067300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1067301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1067302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1067303_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1067304_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1067305_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1067306_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_339d0e9a0c622edc14d5(net.minecraft.world.World a0, net.minecraft.world.World a1) throws E;
private static final class __SourceHandler_339d0e9a0c622edc14d5 {

public static void f674(net.minecraft.world.World p0, net.minecraft.world.World p1) throws Throwable {
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    java.util.List life5_15;
    java.util.Iterator life6_18;
    java.lang.Object life7_24;
    net.minecraft.entity.Entity life8_27;
    lexical_join_38: {
    lexical_join_32: {
    life2_3 = (__fieldRead674_0() ^ 33640733234977L);
    life4_5 = __call674_1();
    if (!((life4_5 != null))) {
        break lexical_join_38;
    }
    if (!((p1 != null))) {
        break lexical_join_32;
    }
    life5_15 = __call674_2(p1);
    life6_18 = __call674_3(life5_15);
    lexical_cycle_16: while (true) {
    if (!(__call674_4(life6_18))) {
        break lexical_join_32;
    }
    life7_24 = __call674_5(life6_18);
    life8_27 = __cast674_6(life7_24);
    __call674_7(life8_27, p1);
    if (!((life4_5 != null))) {
        break lexical_join_38;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    __call674_9(__fieldRead674_8(), null);
    __call674_11(__fieldRead674_10(), null);
    }
    return;
}
public static void h674_0(moom.Oo p0) throws Throwable {
    throw __call1067400_0(p0);
}
public static void h674_1(moom.Oo p0) throws Throwable {
    throw __call1067401_0(p0);
}
private static native long __fieldRead674_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call674_1() throws Throwable;
private static native java.util.List __call674_2(net.minecraft.world.World a0) throws Throwable;
private static native java.util.Iterator __call674_3(java.util.List a0) throws Throwable;
private static native boolean __call674_4(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call674_5(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.Entity __cast674_6(java.lang.Object a0) throws Throwable;
private static native void __call674_7(net.minecraft.entity.Entity a0, net.minecraft.world.World a1) throws Throwable;
private static native moom.JU __fieldRead674_8() throws Throwable;
private static native void __call674_9(moom.JU a0, java.lang.Object a1) throws Throwable;
private static native moom.JX __fieldRead674_10() throws Throwable;
private static native void __call674_11(moom.JX a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Exception __call1067400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1067401_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.DD[] __sourceHandlerCall_5f120341c9adfb9d969f(moom.DD a0, boolean a1) throws E;
private static final class __SourceHandler_5f120341c9adfb9d969f {

public static moom.DD[] f71(moom.DD p0, boolean p1) throws Throwable {
    int lexicalValue71_60_0;
    java.util.ArrayList lexicalValue71_65_0;
    net.minecraft.entity.Entity[] spill71_0;
    boolean spill71_1;
    java.util.ArrayList spill71_2;
    java.lang.String spill71_3;
    long life2_3;
    java.util.ArrayList life5_7;
    net.minecraft.entity.Entity[] life4_13;
    moom.DD life6_17;
    int life7_25;
    int life8_39;
    moom.DD life9_43;
    moom.DD[] life7_85;
    lexical_join_65: {
    lexical_join_64: {
    lexical_join_60: {
    lexical_join_56: {
    lexical_join_22: {
    life2_3 = (__fieldRead71_0() ^ 82486954118511L);
    life5_7 = new java.util.ArrayList();
    spill71_0 = __call71_1();
    __call71_2(life5_7, p0);
    life4_13 = spill71_0;
    life6_17 = __call71_3(p0, p1);
    if (!((life6_17 == null))) {
        break lexical_join_22;
    }
    return null;
    }
    life7_25 = 1;
    lexical_cycle_24: while (true) {
    lexical_join_54: {
    lexical_join_53: {
    if (!((life7_25 < (__call71_4(life5_7) + __invokedynamic71_5(30002, (5548949107366770715L ^ life2_3)))))) {
        break lexical_join_56;
    }
    life8_39 = (life7_25 + 1);
    life9_43 = __call71_6(life6_17, life8_39);
    if (!((life4_13 != null))) {
        break lexical_join_54;
    }
    spill71_1 = __call71_7(life9_43);
    if (!((life4_13 != null))) {
        lexicalValue71_60_0 = __integerCategory71_8(spill71_1);
        break lexical_join_60;
    }
    if (!(spill71_1)) {
        break lexical_join_53;
    }
    __call71_9(life5_7, life9_43);
    }
    life7_25 += 1;
    }
    if (!((life4_13 == null))) { continue lexical_cycle_24; }
    break lexical_cycle_24;
    }
    }
    spill71_2 = life5_7;
    if (!((life4_13 != null))) {
        lexicalValue71_65_0 = spill71_2;
        break lexical_join_65;
    }
    lexicalValue71_60_0 = __call71_10(spill71_2);
    }
    if (!((lexicalValue71_60_0 <= 1))) {
        break lexical_join_64;
    }
    return null;
    }
    lexicalValue71_65_0 = life5_7;
    }
    life7_85 = __cast71_12(__call71_11(lexicalValue71_65_0, new moom.DD[0]));
    spill71_3 = __call71_13(p0);
    int __stackOp71_15_0 = (life7_85).length;
    java.lang.String __stackOp71_15_1 = __invokedynamic71_14(9635, (5385701792625677942L ^ life2_3));
    __call71_17(__invokedynamic71_16(spill71_3, __stackOp71_15_1, __stackOp71_15_0));
    return life7_85;
}
public static void h71_0(moom.Oo p0) throws Throwable {
    throw __call1007100_0(p0);
}
public static void h71_1(moom.Oo p0) throws Throwable {
    throw __call1007101_0(p0);
}
public static void h71_2(moom.Oo p0) throws Throwable {
    throw __call1007102_0(p0);
}
public static void h71_3(moom.Oo p0) throws Throwable {
    throw __call1007103_0(p0);
}
public static void h71_4(moom.Oo p0) throws Throwable {
    throw __call1007104_0(p0);
}
public static void h71_5(moom.Oo p0) throws Throwable {
    throw __call1007105_0(p0);
}
private static native long __fieldRead71_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call71_1() throws Throwable;
private static native boolean __call71_2(java.util.ArrayList a0, moom.DD a1) throws Throwable;
private static native moom.DD __call71_3(moom.DD a0, boolean a1) throws Throwable;
private static native int __call71_4(java.util.ArrayList a0) throws Throwable;
private static native int __invokedynamic71_5(int a0, long a1) throws Throwable;
private static native moom.DD __call71_6(moom.DD a0, int a1) throws Throwable;
private static native boolean __call71_7(moom.DD a0) throws Throwable;
private static native int __integerCategory71_8(boolean value) throws Throwable;
private static native boolean __call71_9(java.util.ArrayList a0, moom.DD a1) throws Throwable;
private static native int __call71_10(java.util.ArrayList a0) throws Throwable;
private static native java.lang.Object[] __call71_11(java.util.ArrayList a0, moom.DD[] a1) throws Throwable;
private static native moom.DD[] __cast71_12(java.lang.Object[] a0) throws Throwable;
private static native java.lang.String __call71_13(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic71_14(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic71_16(java.lang.String a0, java.lang.String a1, int a2) throws Throwable;
private static native void __call71_17(java.lang.String a0) throws Throwable;
private static native java.lang.Exception __call1007100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1007101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1007102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1007103_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1007104_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1007105_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.JV __sourceHandlerCall_b1715c821af28a79e252(moom.DD a0, boolean a1) throws E;
private static final class __SourceHandler_b1715c821af28a79e252 {

public static moom.JV f676(moom.DD p0, boolean p1) throws Throwable {
    moom.DD forwardValue676_28_0;
    moom.JV forwardValue676_40_0;
    net.minecraft.entity.Entity[] spill676_0;
    moom.DD spill676_1;
    moom.DD spill676_2;
    long life2_3;
    java.lang.String life5_7;
    net.minecraft.entity.Entity[] life4_8;
    moom.DD life6_12;
    moom.JV life7_28;
    moom.DD[] life7_38;
    forward_join_40: {
    forward_join_35: {
    forward_join_28: {
    forward_join_27: {
    life2_3 = (__fieldRead676_0() ^ 9425266353966L);
    spill676_0 = __call676_1();
    life5_7 = __call676_2(p0);
    life4_8 = spill676_0;
    life6_12 = __call676_3(p0, p1);
    spill676_1 = life6_12;
    if (!((life4_8 != null))) {
        forwardValue676_28_0 = spill676_1;
        break forward_join_28;
    }
    if (!((spill676_1 != null))) {
        break forward_join_27;
    }
    spill676_2 = life6_12;
    if (!((life4_8 != null))) {
        forwardValue676_28_0 = spill676_2;
        break forward_join_28;
    }
    life7_28 = __call676_4(spill676_2, p0);
    if (!((life7_28 != null))) {
        break forward_join_27;
    }
    return life7_28;
    }
    forwardValue676_28_0 = p0;
    }
    life7_38 = __call676_5(forwardValue676_28_0, p1);
    if (!((life7_38 == null))) {
        break forward_join_35;
    }
    forwardValue676_40_0 = null;
    break forward_join_40;
    }
    forwardValue676_40_0 = new moom.JV(life5_7, life7_38);
    }
    return forwardValue676_40_0;
}
public static void h676_0(moom.Oo p0) throws Throwable {
    throw __call1067600_0(p0);
}
public static void h676_1(moom.Oo p0) throws Throwable {
    throw __call1067601_0(p0);
}
public static void h676_2(moom.Oo p0) throws Throwable {
    throw __call1067602_0(p0);
}
public static void h676_3(moom.Oo p0) throws Throwable {
    throw __call1067603_0(p0);
}
private static native long __fieldRead676_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call676_1() throws Throwable;
private static native java.lang.String __call676_2(moom.DD a0) throws Throwable;
private static native moom.DD __call676_3(moom.DD a0, boolean a1) throws Throwable;
private static native moom.JV __call676_4(moom.DD a0, moom.DD a1) throws Throwable;
private static native moom.DD[] __call676_5(moom.DD a0, boolean a1) throws Throwable;
private static native java.lang.Exception __call1067600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1067601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1067602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1067603_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_2323cdd6f745dcc07046() throws E;
private static final class __SourceHandler_2323cdd6f745dcc07046 {

public static void f72() throws Throwable {
    moom.JV lexicalValue72_139_0;
    java.lang.Object lexicalValue72_146_0;
    int lexicalValue72_152_0;
    int lexicalValue72_156_0;
    int lexicalValue72_158_0;
    java.lang.String[] spill72_0;
    java.lang.String[] spill72_1;
    net.minecraft.entity.Entity[] spill72_2;
    java.lang.String[] spill72_3;
    java.lang.String[] spill72_4;
    boolean spill72_5;
    moom.JV spill72_6;
    long life0_3;
    java.lang.String[] life3_26;
    java.lang.String[] life4_46;
    java.lang.String[] life5_50;
    java.util.HashSet life6_54;
    java.lang.String[] life7_56;
    int life8_59;
    int life9_61;
    net.minecraft.entity.Entity[] life2_62;
    java.lang.String life10_69;
    java.lang.String life11_71;
    java.lang.String life11_75;
    java.lang.String life11_83;
    java.lang.String life11_91;
    java.lang.String life12_94;
    moom.DD life13_117;
    moom.JV life14_130;
    moom.JV life14_141;
    lexical_join_158: {
    lexical_join_157: {
    lexical_join_156: {
    lexical_join_152: {
    lexical_join_150: {
    life0_3 = (__fieldRead72_0() ^ 5410993256001L);
    __fieldWrite72_2(__call72_1());
    __fieldWrite72_4(__fieldRead72_3());
    java.lang.String[] __stackOp72_5_0 = new java.lang.String[2];
    spill72_0 = __stackOp72_5_0;
    (__stackOp72_5_0)[0] = __invokedynamic72_6(11477, (2847229528540881975L ^ life0_3));
    java.lang.String[] __stackOp72_7_0 = spill72_0;
    spill72_1 = __stackOp72_7_0;
    (__stackOp72_7_0)[1] = __invokedynamic72_8(9631, (5526034909310299509L ^ life0_3));
    life3_26 = spill72_1;
    spill72_2 = __call72_9();
    java.lang.String[] __stackOp72_10_0 = new java.lang.String[2];
    spill72_3 = __stackOp72_10_0;
    (__stackOp72_10_0)[0] = __invokedynamic72_11(16172, (5746830669820901316L ^ life0_3));
    java.lang.String[] __stackOp72_12_0 = spill72_3;
    spill72_4 = __stackOp72_12_0;
    (__stackOp72_12_0)[1] = __invokedynamic72_13(23088, (7553427996864598749L ^ life0_3));
    life4_46 = spill72_4;
    life5_50 = __call72_14(life3_26, life4_46);
    life6_54 = new java.util.HashSet();
    life7_56 = life5_50;
    life8_59 = (life7_56).length;
    life9_61 = 0;
    life2_62 = spill72_2;
    lexical_cycle_63: while (true) {
    lexical_join_148: {
    lexical_join_147: {
    lexical_join_146: {
    lexical_join_139: {
    lexical_join_138: {
    if (!((life9_61 < life8_59))) {
        break lexical_join_150;
    }
    life10_69 = (life7_56)[life9_61];
    life11_71 = life10_69;
    life11_75 = __call72_15(life11_71, life4_46);
    life11_83 = __call72_17(life11_75, __invokedynamic72_16(1665, (8178306154151677536L ^ life0_3)));
    life11_91 = __invokedynamic72_19(life11_83, __invokedynamic72_18(16172, (5746830669820901316L ^ life0_3)));
    life12_94 = __call72_20(life11_91);
    if (!((life2_62 != null))) {
        break lexical_join_148;
    }
    spill72_5 = __call72_21(life6_54, life12_94);
    if (!((life2_62 != null))) {
        lexicalValue72_152_0 = __integerCategory72_22(spill72_5);
        break lexical_join_152;
    }
    if (!((!spill72_5))) {
        break lexical_join_147;
    }
    __call72_23(life6_54, life12_94);
    life13_117 = new moom.DD(life12_94);
    if (!((life2_62 != null))) {
        break lexical_join_148;
    }
    if (!(__call72_24(life13_117))) {
        break lexical_join_147;
    }
    life14_130 = __cast72_27(__call72_26(__fieldRead72_25(), life12_94));
    if (!((life2_62 != null))) {
        break lexical_join_148;
    }
    if (!((life14_130 == null))) {
        break lexical_join_147;
    }
    life14_141 = __call72_28(life13_117, 0);
    spill72_6 = life14_141;
    if (!((life2_62 != null))) {
        lexicalValue72_139_0 = spill72_6;
        break lexical_join_139;
    }
    if (!((spill72_6 == null))) {
        break lexical_join_138;
    }
    life14_141 = __call72_29(life13_117, 1);
    }
    lexicalValue72_139_0 = life14_141;
    }
    if (!((life2_62 != null))) {
        lexicalValue72_146_0 = lexicalValue72_139_0;
        break lexical_join_146;
    }
    if (!((lexicalValue72_139_0 != null))) {
        break lexical_join_147;
    }
    lexicalValue72_146_0 = __call72_31(__fieldRead72_30(), life12_94, life14_141);
    }
    __discardScalar72_32(lexicalValue72_146_0);
    }
    life9_61 += 1;
    }
    if (!((life2_62 == null))) { continue lexical_cycle_63; }
    break lexical_cycle_63;
    }
    }
    lexicalValue72_152_0 = __integerCategory72_35(__call72_34(__fieldRead72_33()));
    }
    if (!((life2_62 != null))) {
        lexicalValue72_156_0 = lexicalValue72_152_0;
        break lexical_join_156;
    }
    if (!((lexicalValue72_152_0 == 0))) {
        break lexical_join_157;
    }
    lexicalValue72_156_0 = 1;
    }
    lexicalValue72_158_0 = lexicalValue72_156_0;
    break lexical_join_158;
    }
    lexicalValue72_158_0 = 0;
    }
    __fieldWrite72_36(lexicalValue72_158_0);
    return;
}
public static void h72_0(moom.Oo p0) throws Throwable {
    throw __call1007200_0(p0);
}
public static void h72_1(moom.Oo p0) throws Throwable {
    throw __call1007201_0(p0);
}
public static void h72_2(moom.Oo p0) throws Throwable {
    throw __call1007202_0(p0);
}
public static void h72_3(moom.Oo p0) throws Throwable {
    throw __call1007203_0(p0);
}
public static void h72_4(moom.Oo p0) throws Throwable {
    throw __call1007204_0(p0);
}
public static void h72_5(moom.Oo p0) throws Throwable {
    throw __call1007205_0(p0);
}
public static void h72_6(moom.Oo p0) throws Throwable {
    throw __call1007206_0(p0);
}
public static void h72_7(moom.Oo p0) throws Throwable {
    throw __call1007207_0(p0);
}
private static native long __fieldRead72_0() throws Throwable;
private static native net.minecraft.client.renderer.RenderGlobal __call72_1() throws Throwable;
private static native void __fieldWrite72_2(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.oo __fieldRead72_3() throws Throwable;
private static native void __fieldWrite72_4(moom.oo a0) throws Throwable;
private static native java.lang.String __invokedynamic72_6(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic72_8(int a0, long a1) throws Throwable;
private static native net.minecraft.entity.Entity[] __call72_9() throws Throwable;
private static native java.lang.String __invokedynamic72_11(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic72_13(int a0, long a1) throws Throwable;
private static native java.lang.String[] __call72_14(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.String __call72_15(java.lang.String a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.String __invokedynamic72_16(int a0, long a1) throws Throwable;
private static native java.lang.String __call72_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic72_18(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic72_19(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call72_20(java.lang.String a0) throws Throwable;
private static native boolean __call72_21(java.util.HashSet a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory72_22(boolean value) throws Throwable;
private static native boolean __call72_23(java.util.HashSet a0, java.lang.String a1) throws Throwable;
private static native boolean __call72_24(moom.DD a0) throws Throwable;
private static native java.util.Map __fieldRead72_25() throws Throwable;
private static native java.lang.Object __call72_26(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native moom.JV __cast72_27(java.lang.Object a0) throws Throwable;
private static native moom.JV __call72_28(moom.DD a0, int a1) throws Throwable;
private static native moom.JV __call72_29(moom.DD a0, int a1) throws Throwable;
private static native java.util.Map __fieldRead72_30() throws Throwable;
private static native java.lang.Object __call72_31(java.util.Map a0, java.lang.String a1, moom.JV a2) throws Throwable;
private static native void __discardScalar72_32(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead72_33() throws Throwable;
private static native boolean __call72_34(java.util.Map a0) throws Throwable;
private static native int __integerCategory72_35(boolean value) throws Throwable;
private static native void __fieldWrite72_36(int a0) throws Throwable;
private static native java.lang.Exception __call1007200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1007201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1007202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1007203_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1007204_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1007205_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1007206_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1007207_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_c4553f9ad61d8775e474(java.lang.String a0) throws E;
private static final class __SourceHandler_c4553f9ad61d8775e474 {

public static java.lang.String f678(java.lang.String p0) throws Throwable {
    net.minecraft.entity.Entity[] spill678_0;
    long life1_3;
    java.lang.String[] life4_5;
    int life5_9;
    net.minecraft.entity.Entity[] life3_10;
    int life6_12;
    java.lang.String life7_19;
    lexical_join_33: {
    life1_3 = (__fieldRead678_0() ^ 14069734185536L);
    life4_5 = __fieldRead678_1();
    spill678_0 = __call678_2();
    life5_9 = (life4_5).length;
    life3_10 = spill678_0;
    life6_12 = 0;
    lexical_cycle_13: while (true) {
    lexical_join_31: {
    lexical_join_30: {
    if (!((life6_12 < life5_9))) {
        break lexical_join_33;
    }
    life7_19 = (life4_5)[life6_12];
    if (!((life3_10 != null))) {
        break lexical_join_31;
    }
    if (!(__call678_3(p0, life7_19))) {
        break lexical_join_30;
    }
    return __call678_4(p0, life7_19);
    }
    life6_12 += 1;
    }
    if (!((life3_10 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return null;
}
public static void h678_0(moom.Oo p0) throws Throwable {
    throw __call1067800_0(p0);
}
public static void h678_1(moom.Oo p0) throws Throwable {
    throw __call1067801_0(p0);
}
private static native long __fieldRead678_0() throws Throwable;
private static native java.lang.String[] __fieldRead678_1() throws Throwable;
private static native net.minecraft.entity.Entity[] __call678_2() throws Throwable;
private static native boolean __call678_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call678_4(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1067800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1067801_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.DD __sourceHandlerCall_0b2582d085ec61ce7fab(moom.DD a0, boolean a1) throws E;
private static final class __SourceHandler_0b2582d085ec61ce7fab {

public static moom.DD f679(moom.DD p0, boolean p1) throws Throwable {
    int forwardValue679_45_0;
    java.lang.String forwardValue679_50_0;
    java.lang.String forwardValue679_50_1;
    net.minecraft.entity.Entity[] spill679_0;
    boolean spill679_1;
    java.lang.String spill679_2;
    java.lang.String spill679_3;
    long life2_3;
    java.lang.String life5_7;
    net.minecraft.entity.Entity[] life4_8;
    java.lang.String life6_11;
    java.lang.String life7_17;
    java.lang.String life8_23;
    java.lang.String life9_60;
    forward_join_50: {
    forward_join_48: {
    forward_join_45: {
    forward_join_40: {
    life2_3 = (__fieldRead679_0() ^ 98264426158123L);
    spill679_0 = __call679_1();
    life5_7 = __call679_2(p0);
    life4_8 = spill679_0;
    life6_11 = __call679_3(p0);
    life7_17 = __invokedynamic679_4(17315, (2267562964758684966L ^ life2_3));
    life8_23 = __invokedynamic679_5(9846, (9145311186116182249L ^ life2_3));
    spill679_1 = p1;
    if (!((life4_8 != null))) {
        forwardValue679_45_0 = __integerCategory679_6(spill679_1);
        break forward_join_45;
    }
    if (!(spill679_1)) {
        break forward_join_40;
    }
    life7_17 = __invokedynamic679_7(27164, (2114802684175731871L ^ life2_3));
    life8_23 = __invokedynamic679_8(1601, (5468864215266107606L ^ life2_3));
    }
    spill679_2 = life6_11;
    spill679_3 = life7_17;
    if (!((life4_8 != null))) {
        forwardValue679_50_0 = spill679_2;
        forwardValue679_50_1 = spill679_3;
        break forward_join_50;
    }
    forwardValue679_45_0 = __integerCategory679_10(__call679_9(spill679_2, spill679_3));
    }
    if (!((forwardValue679_45_0 == 0))) {
        break forward_join_48;
    }
    return null;
    }
    forwardValue679_50_0 = life6_11;
    forwardValue679_50_1 = life7_17;
    }
    life9_60 = __call679_11(forwardValue679_50_0, forwardValue679_50_1, life8_23);
    return new moom.DD(life5_7, life9_60);
}
public static void h679_0(moom.Oo p0) throws Throwable {
    throw __call1067900_0(p0);
}
public static void h679_1(moom.Oo p0) throws Throwable {
    throw __call1067901_0(p0);
}
public static void h679_2(moom.Oo p0) throws Throwable {
    throw __call1067902_0(p0);
}
private static native long __fieldRead679_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call679_1() throws Throwable;
private static native java.lang.String __call679_2(moom.DD a0) throws Throwable;
private static native java.lang.String __call679_3(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic679_4(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic679_5(int a0, long a1) throws Throwable;
private static native int __integerCategory679_6(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic679_7(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic679_8(int a0, long a1) throws Throwable;
private static native boolean __call679_9(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory679_10(boolean value) throws Throwable;
private static native java.lang.String __call679_11(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.Exception __call1067900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1067901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1067902_0(moom.Oo a0) throws Throwable;

}


public static void b__Void(java.lang.String p0) {
long local1_life2 = (moom.JT.k ^ 121680799474013L);
    java.lang.String __stackOp534_5_0 = p0;
    java.lang.String __stackOp534_5_1 = __sourceIntrinsic_d09e7390a875_originalDynamicSite534_4(14557, (4288896532737107761L ^ local1_life2));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_d09e7390a875_originalDynamicSite534_6(__stackOp534_5_1, __stackOp534_5_0))));
    return;
}


private static void b() { __sourceHandlerCall_2323cdd6f745dcc07046(); }


private static java.lang.String b(java.lang.String p0) { return __sourceHandlerCall_c4553f9ad61d8775e474(p0); }


protected static moom.DD b(moom.DD p0, boolean p1) { return __sourceHandlerCall_0b2582d085ec61ce7fab(p0, p1); }


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5182_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/JT"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x1759;
        if (p[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = o[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])q.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    q.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/JT", exception);
            }
            int n7 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            JT.p[n4] = n7;
        }
        return p[n4];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.JT.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public static void b(net.minecraft.entity.Entity p0, net.minecraft.world.World p1) {
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
        byte[] spill2683_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2683_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2683_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2683_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2683_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2683_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 10681);
    if (((moom.JT.m)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.JT.n)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.JT.n)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/JT", life9_51);
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
        life9_116 = ((java.lang.String)((moom.JT.l)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.JT.m)[life5_8] = moom.JT.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.JT.m)[life5_8];
}


public static void a(net.minecraft.world.World p0, net.minecraft.world.World p1) { __sourceHandlerCall_339d0e9a0c622edc14d5(p0, p1); }


public static moom.DD a(moom.DD p0) { return __sourceHandlerCall_a33a33855e25d868c6dd(p0); }


public static void a(net.minecraft.entity.Entity p0, net.minecraft.world.World p1) {
long life2_3;
    net.minecraft.entity.DataWatcher life4_8;
    java.util.UUID life5_21;
    life2_3 = (moom.JT.k ^ 134031772757567L);
    if ((p1 != null)) {
        life4_8 = ((net.minecraft.entity.Entity)(p0)).a__r1();
        ((net.minecraft.entity.DataWatcher)(life4_8)).h = ((moom.DT)(((net.minecraft.entity.Entity)(p0)).a__DT()));
        ((net.minecraft.entity.DataWatcher)(life4_8)).g = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.World)(p1)).a__ES(((moom.DT)(((net.minecraft.entity.DataWatcher)(life4_8)).h)))));
        life5_21 = ((net.minecraft.entity.Entity)(p0)).a__UUID();
        try {
        if ((((p0 instanceof net.minecraft.entity.passive.EntityVillager) ? 1 : 0) != 0)) {
        moom.JT.a(((java.util.UUID)(life5_21)), ((net.minecraft.entity.passive.EntityVillager)(((net.minecraft.entity.passive.EntityVillager)(p0)))));
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw moom.JT.a(((java.lang.Exception)(caught_rethrow_0)));
    }
    }
    return;
}


private static void a(java.util.UUID p0, net.minecraft.entity.passive.EntityVillager p1) { __sourceHandlerCall_34e52b719bbba88cc878(p0, p1); }


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5189_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/JT"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.JT.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected static moom.DD a(moom.DD p0, int p1) { return __sourceHandlerCall_65c39279b50a01101c9c(p0, p1); }


private static java.lang.String a(java.lang.String p0) { return __sourceHandlerCall_63e2ab44d6d8fdb8fbcb(p0); }


private static moom.JV a__JV(moom.DD p0, boolean p1) { return __sourceHandlerCall_b1715c821af28a79e252(p0, p1); }


private static moom.DD a(moom.DD p0, boolean p1) { return __sourceHandlerCall_be018c709010660b228a(p0, p1); }


private static moom.JV a(moom.DD p0, moom.DD p1) { return __sourceHandlerCall_c9e7527e72bd6d8122d2(p0, p1); }


public static void a__Void(java.lang.String p0) {
long local1_life2 = (moom.JT.k ^ 47277120234138L);
    java.lang.String __stackOp533_5_0 = p0;
    java.lang.String __stackOp533_5_1 = __sourceIntrinsic_e2d81269afae_originalDynamicSite533_4(18809, (1338587950057936204L ^ local1_life2));
    moom.BU.b__Void(((java.lang.String)(__sourceIntrinsic_e2d81269afae_originalDynamicSite533_6(__stackOp533_5_1, __stackOp533_5_0))));
    return;
}


private static java.lang.String a(java.lang.String p0, int p1) { return __sourceHandlerCall_4d02471db6623bba6397(p0, p1); }


public static void a__Void() {
long life0_3;
    life0_3 = (moom.JT.k ^ 137630357648509L);
    try {
        ((java.util.Map)(moom.JT.a)).clear();
        b = ((boolean)(false));
        if (moom.BU.ae()) {
        moom.JT.b();
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw moom.JT.a(((java.lang.Exception)(caught_rethrow_0)));
    }
    return;
}


private static moom.DD[] a__ArrayDD(moom.DD p0, boolean p1) { return __sourceHandlerCall_5f120341c9adfb9d969f(p0, p1); }


private static moom.JJ a() { return __sourceHandlerCall_5741397de4c6baac115f(); }


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite602_105(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite602_106(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite602_108(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite602_109(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite602_110(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite602_111(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite602_112(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite602_113(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite602_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite602_115(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite602_116(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite602_117(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite602_118(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite602_119(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite602_120(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5189_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e2d81269afae_originalDynamicSite533_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e2d81269afae_originalDynamicSite533_6(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5182_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d09e7390a875_originalDynamicSite534_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d09e7390a875_originalDynamicSite534_6(java.lang.String a0, java.lang.String a1) throws E;
}
