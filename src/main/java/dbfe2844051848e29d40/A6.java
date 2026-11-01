package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class A6 {

public static final java.lang.String a;

private static final java.util.Map<java.lang.Integer, java.lang.String> b;

private static final java.util.Map<java.lang.Integer, java.lang.String> c;

private static final java.util.Map<java.lang.Integer, java.lang.Integer> d;

private static final java.lang.String[] e;

private static final long f;

private static final long[] g;

private static final java.lang.Integer[] h;

private static final java.util.Map i;

public A6() {
super();
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(4101653023520993073L)), ((long)(-7560677725971212184L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(192059501863694L)))));
    long local11_life6 = (moom.A6.f ^ 10322286979120L);
    i = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill632_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill632_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill632_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill632_14 = new byte[8];
    (__sourceSpill632_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill632_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation632_16 = __sourceSpill632_14;
    ((javax.crypto.Cipher)(__sourceSpill632_11)).init(((int)(__sourceSpill632_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill632_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation632_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[57];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "K| øonÜiC|\17733[\024Å!\013#F¿ç\022à½6*âÄ\035=duï\177\034\016§7s\026lWîIP¥\033Ç\000Ä¿ÊÔ?ßBA\033æÇYyÑ¶®`ã<[ëù¾© Þ\râ\007cQ;\035\021\003A|j×ÅN¼\022\017]öÒñø×*\007#_äVºÃsQE¢ÐwÂd0Ñ×\r¬ûÒ\027\035×¾\020ºµ=Õq]²\022YÈáÍ\025ð{_\000AºhûyB]7zþ³g\"\016Q0[kØQ=ò<U\026J\034æ\024y³>­xo*\fãv*¶tÚe\f¾ù[pÅ\004yXài4Ñ«¸SÐÅJê¿\036\026R2½\rå+\\[®¢ýV¸¾\031íf¥ÏÊå[c­v:,ÈÎ\035ØB \024WøFrºîü|­=½6¶m\n$ÁôïVPøý0Ôå÷Ñv-³\005øãPm×®ëãPö\007éÜÄC|¢\037êóç[~Å¼]\003©ºI§ºô\030Y&Ìj\025­X\032g3òaûN\b^3\\¹ºx¾À\032ªÿ\017F Ü³ÖÒ3a ¸`uwY¨;M9\024ïw?Ì&²f\003àÞëLMhÑ\022\f\017\000Í/BÈ]\"\020ÁÙÉøù"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill632_25 = local4_life21;
        int __sourceSpill632_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill632_25)).substring(((int)(__sourceSpill632_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill632_30 = local6_life19;
        int __sourceSpill632_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill632_33 = new byte[8];
        (__sourceSpill632_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill632_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill632_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill632_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill632_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill632_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill632_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill632_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill632_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill632_34)).doFinal(((byte[])(__sourceSpill632_33)));
        (__sourceSpill632_30)[__sourceSpill632_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "iê6[1­ïóIX\036ÊÈÈ\007"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill632_38 = local4_life21;
        int __sourceSpill632_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill632_38)).substring(((int)(__sourceSpill632_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill632_43 = local6_life19;
        int __sourceSpill632_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill632_46 = new byte[8];
        (__sourceSpill632_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill632_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill632_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill632_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill632_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill632_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill632_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill632_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill632_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill632_47)).doFinal(((byte[])(__sourceSpill632_46)));
        (__sourceSpill632_43)[__sourceSpill632_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    g = ((long[])(local6_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[57]));
    a = ((java.lang.String)(null));
    b = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    c = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    d = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    java.lang.String[] __sourceSpill632_60 = new java.lang.String[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_59(22663, (5424654760206860293L ^ local11_life6))];
    (__sourceSpill632_60)[0] = "potion.prefix.mundane";
    (__sourceSpill632_60)[1] = "potion.prefix.uninteresting";
    (__sourceSpill632_60)[2] = "potion.prefix.bland";
    (__sourceSpill632_60)[3] = "potion.prefix.clear";
    (__sourceSpill632_60)[4] = "potion.prefix.milky";
    (__sourceSpill632_60)[5] = "potion.prefix.diffuse";
    (__sourceSpill632_60)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_61(693, (6551917014377978421L ^ local11_life6))] = "potion.prefix.artless";
    (__sourceSpill632_60)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_62(61, (720655579999983782L ^ local11_life6))] = "potion.prefix.thin";
    (__sourceSpill632_60)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_63(32728, (4847010123344914252L ^ local11_life6))] = "potion.prefix.awkward";
    (__sourceSpill632_60)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_64(20157, (5781020000376133128L ^ local11_life6))] = "potion.prefix.flat";
    (__sourceSpill632_60)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_65(1380, (7919630528507534788L ^ local11_life6))] = "potion.prefix.bulky";
    (__sourceSpill632_60)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_66(15345, (7282147698815066947L ^ local11_life6))] = "potion.prefix.bungling";
    (__sourceSpill632_60)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_67(28953, (2805296775492020648L ^ local11_life6))] = "potion.prefix.buttered";
    (__sourceSpill632_60)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_68(8603, (365091536596531500L ^ local11_life6))] = "potion.prefix.smooth";
    (__sourceSpill632_60)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_69(27326, (5155757315161731623L ^ local11_life6))] = "potion.prefix.suave";
    (__sourceSpill632_60)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_70(15490, (6395506820827604007L ^ local11_life6))] = "potion.prefix.debonair";
    (__sourceSpill632_60)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_71(22166, (958168183404924466L ^ local11_life6))] = "potion.prefix.thick";
    (__sourceSpill632_60)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_72(6971, (4403947351154738097L ^ local11_life6))] = "potion.prefix.elegant";
    (__sourceSpill632_60)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_73(28138, (5309515015015511371L ^ local11_life6))] = "potion.prefix.fancy";
    (__sourceSpill632_60)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_74(4621, (9024212146849991307L ^ local11_life6))] = "potion.prefix.charming";
    (__sourceSpill632_60)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_75(8277, (5648051695683664122L ^ local11_life6))] = "potion.prefix.dashing";
    (__sourceSpill632_60)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_76(8435, (6099753473323104383L ^ local11_life6))] = "potion.prefix.refined";
    (__sourceSpill632_60)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_77(12547, (1614799883230701994L ^ local11_life6))] = "potion.prefix.cordial";
    (__sourceSpill632_60)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_78(32142, (7329859829702468926L ^ local11_life6))] = "potion.prefix.sparkling";
    (__sourceSpill632_60)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_79(7654, (3049817610485581173L ^ local11_life6))] = "potion.prefix.potent";
    (__sourceSpill632_60)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_80(18183, (3690766376798658438L ^ local11_life6))] = "potion.prefix.foul";
    (__sourceSpill632_60)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_81(25042, (4352095349708241220L ^ local11_life6))] = "potion.prefix.odorless";
    (__sourceSpill632_60)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_82(3402, (4091324242072425943L ^ local11_life6))] = "potion.prefix.rank";
    (__sourceSpill632_60)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_83(24960, (2765687663813540136L ^ local11_life6))] = "potion.prefix.harsh";
    (__sourceSpill632_60)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_84(18742, (2545589804682351033L ^ local11_life6))] = "potion.prefix.acrid";
    (__sourceSpill632_60)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_85(4331, (8290407356430239854L ^ local11_life6))] = "potion.prefix.gross";
    (__sourceSpill632_60)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_86(9869, (2475765341386014222L ^ local11_life6))] = "potion.prefix.stinky";
    e = ((java.lang.String[])(__sourceSpill632_60));
    ((java.util.Map)(moom.A6.b)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.m)).a__Int()))))), ((java.lang.Object)("0 & !1 & !2 & !3 & 0+6")));
    ((java.util.Map)(moom.A6.b)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.d)).a__Int()))))), ((java.lang.Object)("!0 & 1 & !2 & !3 & 1+6")));
    ((java.util.Map)(moom.A6.b)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.o)).a__Int()))))), ((java.lang.Object)("0 & 1 & !2 & !3 & 0+6")));
    ((java.util.Map)(moom.A6.b)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.i)).a__Int()))))), ((java.lang.Object)("0 & !1 & 2 & !3")));
    ((java.util.Map)(moom.A6.b)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.v)).a__Int()))))), ((java.lang.Object)("!0 & !1 & 2 & !3 & 2+6")));
    ((java.util.Map)(moom.A6.b)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.u)).a__Int()))))), ((java.lang.Object)("!0 & !1 & !2 & 3 & 3+6")));
    ((java.util.Map)(moom.A6.b)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.j)).a__Int()))))), ((java.lang.Object)("!0 & !1 & 2 & 3")));
    ((java.util.Map)(moom.A6.b)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.e)).a__Int()))))), ((java.lang.Object)("!0 & 1 & !2 & 3 & 3+6")));
    ((java.util.Map)(moom.A6.b)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.h)).a__Int()))))), ((java.lang.Object)("0 & !1 & !2 & 3 & 3+6")));
    ((java.util.Map)(moom.A6.b)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.s)).a__Int()))))), ((java.lang.Object)("!0 & 1 & 2 & !3 & 2+6")));
    ((java.util.Map)(moom.A6.b)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.q)).a__Int()))))), ((java.lang.Object)("!0 & 1 & 2 & 3 & 2+6")));
    ((java.util.Map)(moom.A6.b)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.p)).a__Int()))))), ((java.lang.Object)("0 & !1 & 2 & 3 & 2+6")));
    ((java.util.Map)(moom.A6.b)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.k)).a__Int()))))), ((java.lang.Object)("0 & 1 & !2 & 3 & 3+6")));
    ((java.util.Map)(moom.A6.c)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.d)).a__Int()))))), ((java.lang.Object)("5")));
    ((java.util.Map)(moom.A6.c)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.f)).a__Int()))))), ((java.lang.Object)("5")));
    ((java.util.Map)(moom.A6.c)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.h)).a__Int()))))), ((java.lang.Object)("5")));
    ((java.util.Map)(moom.A6.c)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.m)).a__Int()))))), ((java.lang.Object)("5")));
    ((java.util.Map)(moom.A6.c)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.j)).a__Int()))))), ((java.lang.Object)("5")));
    ((java.util.Map)(moom.A6.c)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.i)).a__Int()))))), ((java.lang.Object)("5")));
    ((java.util.Map)(moom.A6.c)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.n)).a__Int()))))), ((java.lang.Object)("5")));
    ((java.util.Map)(moom.A6.c)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.v)).a__Int()))))), ((java.lang.Object)("5")));
    ((java.util.Map)(moom.A6.c)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.k)).a__Int()))))), ((java.lang.Object)("5")));
}


private static int b(int p0, int p1) {
int forwardValue1417_13_0;
    int forwardValue1417_15_0;
    boolean spill1417_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (moom.A6.f ^ 111031875294167L);
    life4_5 = net.minecraft.potion.PotionEffect.b__ArrayString();
    spill1417_0 = moom.A6.a__Boolean(((int)(p0)), ((int)(p1)));
    if (!((life4_5 != null))) {
        forwardValue1417_13_0 = ((spill1417_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!(spill1417_0)) {
        break forward_join_14;
    }
    forwardValue1417_13_0 = 0;
    }
    forwardValue1417_15_0 = forwardValue1417_13_0;
    break forward_join_15;
    }
    forwardValue1417_15_0 = 1;
    }
    return forwardValue1417_15_0;
}


private static int b(int p0) {
int lexicalValue465_22_0;
    java.lang.String[] spill465_0;
    int spill465_1;
    long life1_3;
    int life4_6;
    java.lang.String[] life3_7;
    lexical_join_22: {
    lexical_join_21: {
    life1_3 = (moom.A6.f ^ 32940699640198L);
    spill465_0 = net.minecraft.potion.PotionEffect.b__ArrayString();
    life4_6 = 0;
    life3_7 = spill465_0;
    lexical_cycle_8: while (true) {
    if (!((p0 > 0))) {
        break lexical_join_21;
    }
    spill465_1 = (p0 & (p0 - 1));
    if (!((life3_7 != null))) {
        lexicalValue465_22_0 = spill465_1;
        break lexical_join_22;
    }
    p0 = spill465_1;
    life4_6 += 1;
    if (!((life3_7 == null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    lexicalValue465_22_0 = life4_6;
    }
    return lexicalValue465_22_0;
}


public static boolean a__Boolean(int p0, int p1) {
int forwardValue1413_15_0;
    int forwardValue1413_17_0;
    int spill1413_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life2_3 = (moom.A6.f ^ 91679086374478L);
    life4_5 = net.minecraft.potion.PotionEffect.b__ArrayString();
    spill1413_0 = (p0 & (1 << p1));
    if (!((life4_5 != null))) {
        forwardValue1413_15_0 = spill1413_0;
        break forward_join_15;
    }
    if (!((spill1413_0 != 0))) {
        break forward_join_16;
    }
    forwardValue1413_15_0 = 1;
    }
    forwardValue1413_17_0 = forwardValue1413_15_0;
    break forward_join_17;
    }
    forwardValue1413_17_0 = 0;
    }
    return ((forwardValue1413_17_0) != 0);
}


public static int a(int p0, int p1, int p2, int p3, int p4, int p5) {
int forwardValue1406_17_0;
    int forwardValue1406_19_0;
    int forwardValue1406_30_0;
    int forwardValue1406_30_1;
    int forwardValue1406_31_0;
    int forwardValue1406_32_0;
    int forwardValue1406_32_1;
    int forwardValue1406_40_0;
    int forwardValue1406_40_1;
    int forwardValue1406_41_0;
    int forwardValue1406_42_0;
    int forwardValue1406_42_1;
    int forwardValue1406_50_0;
    int forwardValue1406_50_1;
    int forwardValue1406_51_0;
    int forwardValue1406_52_0;
    int forwardValue1406_52_1;
    int forwardValue1406_60_0;
    int forwardValue1406_60_1;
    int forwardValue1406_61_0;
    int forwardValue1406_62_0;
    int forwardValue1406_62_1;
    int forwardValue1406_68_0;
    boolean spill1406_0;
    boolean spill1406_1;
    int spill1406_2;
    boolean spill1406_3;
    int spill1406_4;
    boolean spill1406_5;
    int spill1406_6;
    boolean spill1406_7;
    int spill1406_8;
    long life6_3;
    java.lang.String[] life8_5;
    forward_join_68: {
    forward_join_62: {
    forward_join_61: {
    forward_join_60: {
    forward_join_52: {
    forward_join_51: {
    forward_join_50: {
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life6_3 = (moom.A6.f ^ 87166388434604L);
    life8_5 = net.minecraft.potion.PotionEffect.b__ArrayString();
    spill1406_0 = moom.A6.a__Boolean(((int)(p0)), ((int)(p1)));
    if (!((life8_5 != null))) {
        forwardValue1406_17_0 = ((spill1406_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill1406_0)) {
        break forward_join_18;
    }
    forwardValue1406_17_0 = __sourceIntrinsic_a7c3f45e989c_invokedynamic1406_4(22166, (958245027489730734L ^ life6_3));
    }
    forwardValue1406_19_0 = forwardValue1406_17_0;
    break forward_join_19;
    }
    forwardValue1406_19_0 = 0;
    }
    spill1406_1 = moom.A6.a__Boolean(((int)(p0)), ((int)(p2)));
    if (!((life8_5 != null))) {
        forwardValue1406_30_0 = forwardValue1406_19_0;
        forwardValue1406_30_1 = ((spill1406_1) ? 1 : 0);
        break forward_join_30;
    }
    if (!(spill1406_1)) {
        forwardValue1406_31_0 = forwardValue1406_19_0;
        break forward_join_31;
    }
    forwardValue1406_30_0 = forwardValue1406_19_0;
    forwardValue1406_30_1 = __sourceIntrinsic_a7c3f45e989c_invokedynamic1406_7(32728, (4847082810169883088L ^ life6_3));
    }
    forwardValue1406_32_0 = forwardValue1406_30_0;
    forwardValue1406_32_1 = forwardValue1406_30_1;
    break forward_join_32;
    }
    forwardValue1406_32_0 = forwardValue1406_31_0;
    forwardValue1406_32_1 = 0;
    }
    spill1406_2 = (forwardValue1406_32_0 | forwardValue1406_32_1);
    spill1406_3 = moom.A6.a__Boolean(((int)(p0)), ((int)(p3)));
    if (!((life8_5 != null))) {
        forwardValue1406_40_0 = spill1406_2;
        forwardValue1406_40_1 = ((spill1406_3) ? 1 : 0);
        break forward_join_40;
    }
    if (!(spill1406_3)) {
        forwardValue1406_41_0 = spill1406_2;
        break forward_join_41;
    }
    forwardValue1406_40_0 = spill1406_2;
    forwardValue1406_40_1 = 4;
    }
    forwardValue1406_42_0 = forwardValue1406_40_0;
    forwardValue1406_42_1 = forwardValue1406_40_1;
    break forward_join_42;
    }
    forwardValue1406_42_0 = forwardValue1406_41_0;
    forwardValue1406_42_1 = 0;
    }
    spill1406_4 = (forwardValue1406_42_0 | forwardValue1406_42_1);
    spill1406_5 = moom.A6.a__Boolean(((int)(p0)), ((int)(p4)));
    if (!((life8_5 != null))) {
        forwardValue1406_50_0 = spill1406_4;
        forwardValue1406_50_1 = ((spill1406_5) ? 1 : 0);
        break forward_join_50;
    }
    if (!(spill1406_5)) {
        forwardValue1406_51_0 = spill1406_4;
        break forward_join_51;
    }
    forwardValue1406_50_0 = spill1406_4;
    forwardValue1406_50_1 = 2;
    }
    forwardValue1406_52_0 = forwardValue1406_50_0;
    forwardValue1406_52_1 = forwardValue1406_50_1;
    break forward_join_52;
    }
    forwardValue1406_52_0 = forwardValue1406_51_0;
    forwardValue1406_52_1 = 0;
    }
    spill1406_6 = (forwardValue1406_52_0 | forwardValue1406_52_1);
    spill1406_7 = moom.A6.a__Boolean(((int)(p0)), ((int)(p5)));
    if (!((life8_5 != null))) {
        forwardValue1406_60_0 = spill1406_6;
        forwardValue1406_60_1 = ((spill1406_7) ? 1 : 0);
        break forward_join_60;
    }
    if (!(spill1406_7)) {
        forwardValue1406_61_0 = spill1406_6;
        break forward_join_61;
    }
    forwardValue1406_60_0 = spill1406_6;
    forwardValue1406_60_1 = 1;
    }
    forwardValue1406_62_0 = forwardValue1406_60_0;
    forwardValue1406_62_1 = forwardValue1406_60_1;
    break forward_join_62;
    }
    forwardValue1406_62_0 = forwardValue1406_61_0;
    forwardValue1406_62_1 = 0;
    }
    spill1406_8 = (forwardValue1406_62_0 | forwardValue1406_62_1);
    if (!((life8_5 == null))) {
        forwardValue1406_68_0 = spill1406_8;
        break forward_join_68;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[1])));
    forwardValue1406_68_0 = spill1406_8;
    }
    return forwardValue1406_68_0;
}


public static int a(int p0, java.lang.String p1) {
int lexicalValue460_78_0;
    int lexicalValue460_78_1;
    int lexicalValue460_103_0;
    int lexicalValue460_112_0;
    int lexicalValue460_112_1;
    int lexicalValue460_137_0;
    int lexicalValue460_146_0;
    int lexicalValue460_146_1;
    int lexicalValue460_169_0;
    int lexicalValue460_180_0;
    int lexicalValue460_180_1;
    int lexicalValue460_182_0;
    int lexicalValue460_203_0;
    int lexicalValue460_224_0;
    int lexicalValue460_224_1;
    int lexicalValue460_225_0;
    int lexicalValue460_230_0;
    java.lang.String[] spill460_0;
    int spill460_1;
    int spill460_2;
    int spill460_3;
    int spill460_4;
    int spill460_5;
    int spill460_6;
    int spill460_7;
    int spill460_8;
    int spill460_9;
    long life2_3;
    int life5_5;
    int life6_9;
    int life7_11;
    java.lang.String[] life4_12;
    int life8_14;
    int life9_16;
    int life10_18;
    int life11_20;
    int life12_22;
    int life13_29;
    int life11_69;
    int life8_119;
    int life9_167;
    int life10_250;
    lexical_join_230: {
    lexical_join_225: {
    lexical_join_224: {
    lexical_join_218: {
    lexical_join_207: {
    life2_3 = (moom.A6.f ^ 140290668247561L);
    life5_5 = 0;
    spill460_0 = net.minecraft.potion.PotionEffect.b__ArrayString();
    life6_9 = ((java.lang.String)(p1)).length();
    life7_11 = 0;
    life4_12 = spill460_0;
    life8_14 = 0;
    life9_16 = 0;
    life10_18 = 0;
    life11_20 = 0;
    life12_22 = life5_5;
    lexical_cycle_23: while (true) {
    lexical_join_204: {
    lexical_join_203: {
    lexical_join_202: {
    lexical_join_182: {
    lexical_join_180: {
    lexical_join_172: {
    lexical_join_169: {
    lexical_join_146: {
    lexical_join_140: {
    lexical_join_137: {
    lexical_join_136: {
    lexical_join_112: {
    lexical_join_106: {
    lexical_join_103: {
    lexical_join_102: {
    lexical_join_78: {
    lexical_join_72: {
    if (!((life12_22 < life6_9))) {
        break lexical_join_207;
    }
    life13_29 = ((int)(((java.lang.String)(p1)).charAt(((int)(life12_22)))));
    spill460_1 = life13_29;
    spill460_2 = __sourceIntrinsic_60f4bcb8bd52_invokedynamic460_5(19461, (3809072699259586198L ^ life2_3));
    if (!((life4_12 != null))) {
        lexicalValue460_224_0 = spill460_1;
        lexicalValue460_224_1 = spill460_2;
        break lexical_join_224;
    }
    if (!((life4_12 != null))) {
        lexicalValue460_78_0 = spill460_1;
        lexicalValue460_78_1 = spill460_2;
        break lexical_join_78;
    }
    if (!((spill460_1 >= spill460_2))) {
        break lexical_join_72;
    }
    spill460_3 = life13_29;
    spill460_4 = __sourceIntrinsic_60f4bcb8bd52_invokedynamic460_6(23702, (5315807746689472062L ^ life2_3));
    if (!((life4_12 != null))) {
        lexicalValue460_78_0 = spill460_3;
        lexicalValue460_78_1 = spill460_4;
        break lexical_join_78;
    }
    if (!((spill460_3 <= spill460_4))) {
        break lexical_join_72;
    }
    life11_69 = (life11_20 * __sourceIntrinsic_60f4bcb8bd52_invokedynamic460_7(1380, (7919677757700329469L ^ life2_3)));
    life11_20 = (life11_69 + (life13_29 - __sourceIntrinsic_60f4bcb8bd52_invokedynamic460_8(19461, (3809072699259586198L ^ life2_3))));
    life7_11 = 1;
    if (!((life4_12 == null))) {
        break lexical_join_204;
    }
    }
    lexicalValue460_78_0 = life13_29;
    lexicalValue460_78_1 = __sourceIntrinsic_60f4bcb8bd52_invokedynamic460_9(19495, (1008907646577706680L ^ life2_3));
    }
    if (!((life4_12 != null))) {
        lexicalValue460_112_0 = lexicalValue460_78_0;
        lexicalValue460_112_1 = lexicalValue460_78_1;
        break lexical_join_112;
    }
    if (!((lexicalValue460_78_0 == lexicalValue460_78_1))) {
        break lexical_join_106;
    }
    spill460_5 = life7_11;
    if (!((life4_12 != null))) {
        lexicalValue460_103_0 = spill460_5;
        break lexical_join_103;
    }
    if (!((spill460_5 != 0))) {
        break lexical_join_102;
    }
    p0 = moom.A6.a(((int)(p0)), ((int)(life11_20)), ((boolean)__sourceIntrinsic_integerToBoolean((life9_16))), ((boolean)__sourceIntrinsic_integerToBoolean((life8_14))), ((boolean)__sourceIntrinsic_integerToBoolean((life10_18))));
    life10_18 = 0;
    life8_119 = 0;
    life9_16 = 0;
    life7_11 = 0;
    life11_20 = 0;
    }
    lexicalValue460_103_0 = 1;
    }
    life8_14 = lexicalValue460_103_0;
    if (!((life4_12 == null))) {
        break lexical_join_204;
    }
    }
    lexicalValue460_112_0 = life13_29;
    lexicalValue460_112_1 = __sourceIntrinsic_60f4bcb8bd52_invokedynamic460_11(13025, (3400820800500136019L ^ life2_3));
    }
    if (!((life4_12 != null))) {
        lexicalValue460_146_0 = lexicalValue460_112_0;
        lexicalValue460_146_1 = lexicalValue460_112_1;
        break lexical_join_146;
    }
    if (!((lexicalValue460_112_0 == lexicalValue460_112_1))) {
        break lexical_join_140;
    }
    spill460_6 = life7_11;
    if (!((life4_12 != null))) {
        lexicalValue460_137_0 = spill460_6;
        break lexical_join_137;
    }
    if (!((spill460_6 != 0))) {
        break lexical_join_136;
    }
    p0 = moom.A6.a(((int)(p0)), ((int)(life11_20)), ((boolean)__sourceIntrinsic_integerToBoolean((life9_16))), ((boolean)__sourceIntrinsic_integerToBoolean((life8_14))), ((boolean)__sourceIntrinsic_integerToBoolean((life10_18))));
    life10_18 = 0;
    life8_14 = 0;
    life9_167 = 0;
    life7_11 = 0;
    life11_20 = 0;
    }
    lexicalValue460_137_0 = 1;
    }
    life9_16 = lexicalValue460_137_0;
    if (!((life4_12 == null))) {
        break lexical_join_204;
    }
    }
    lexicalValue460_146_0 = life13_29;
    lexicalValue460_146_1 = __sourceIntrinsic_60f4bcb8bd52_invokedynamic460_13(30130, (175596229516345105L ^ life2_3));
    }
    if (!((life4_12 != null))) {
        lexicalValue460_180_0 = lexicalValue460_146_0;
        lexicalValue460_180_1 = lexicalValue460_146_1;
        break lexical_join_180;
    }
    if (!((lexicalValue460_146_0 == lexicalValue460_146_1))) {
        break lexical_join_172;
    }
    spill460_7 = life7_11;
    if (!((life4_12 != null))) {
        lexicalValue460_169_0 = spill460_7;
        break lexical_join_169;
    }
    if (!((spill460_7 != 0))) {
        break lexical_join_204;
    }
    p0 = moom.A6.a(((int)(p0)), ((int)(life11_20)), ((boolean)__sourceIntrinsic_integerToBoolean((life9_16))), ((boolean)__sourceIntrinsic_integerToBoolean((life8_14))), ((boolean)__sourceIntrinsic_integerToBoolean((life10_18))));
    life10_18 = 0;
    life8_14 = 0;
    life9_16 = 0;
    life7_11 = 0;
    lexicalValue460_169_0 = 0;
    }
    life11_20 = lexicalValue460_169_0;
    if (!((life4_12 == null))) {
        break lexical_join_204;
    }
    }
    spill460_8 = life13_29;
    if (!((life4_12 != null))) {
        lexicalValue460_182_0 = spill460_8;
        break lexical_join_182;
    }
    lexicalValue460_180_0 = spill460_8;
    lexicalValue460_180_1 = __sourceIntrinsic_60f4bcb8bd52_invokedynamic460_15(26328, (3729304397088926794L ^ life2_3));
    }
    if (!((lexicalValue460_180_0 == lexicalValue460_180_1))) {
        break lexical_join_204;
    }
    lexicalValue460_182_0 = life7_11;
    }
    if (!((life4_12 != null))) {
        lexicalValue460_203_0 = lexicalValue460_182_0;
        break lexical_join_203;
    }
    if (!((lexicalValue460_182_0 != 0))) {
        break lexical_join_202;
    }
    p0 = moom.A6.a(((int)(p0)), ((int)(life11_20)), ((boolean)__sourceIntrinsic_integerToBoolean((life9_16))), ((boolean)__sourceIntrinsic_integerToBoolean((life8_14))), ((boolean)__sourceIntrinsic_integerToBoolean((life10_18))));
    life10_250 = 0;
    life8_14 = 0;
    life9_16 = 0;
    life7_11 = 0;
    life11_20 = 0;
    }
    lexicalValue460_203_0 = 1;
    }
    life10_18 = lexicalValue460_203_0;
    }
    life12_22 += 1;
    if (!((life4_12 == null))) { continue lexical_cycle_23; }
    break lexical_cycle_23;
    }
    }
    spill460_9 = life7_11;
    if (!((life4_12 != null))) {
        lexicalValue460_225_0 = spill460_9;
        break lexical_join_225;
    }
    if (!((spill460_9 != 0))) {
        break lexical_join_218;
    }
    p0 = moom.A6.a(((int)(p0)), ((int)(life11_20)), ((boolean)__sourceIntrinsic_integerToBoolean((life9_16))), ((boolean)__sourceIntrinsic_integerToBoolean((life8_14))), ((boolean)__sourceIntrinsic_integerToBoolean((life10_18))));
    }
    lexicalValue460_224_0 = p0;
    lexicalValue460_224_1 = __sourceIntrinsic_60f4bcb8bd52_invokedynamic460_18(14004, (582126842288339989L ^ life2_3));
    }
    lexicalValue460_225_0 = (lexicalValue460_224_0 & lexicalValue460_224_1);
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        lexicalValue460_230_0 = lexicalValue460_225_0;
        break lexical_join_230;
    }
    net.minecraft.potion.PotionEffect.b(((java.lang.String[])(new java.lang.String[2])));
    lexicalValue460_230_0 = lexicalValue460_225_0;
    }
    return lexicalValue460_230_0;
}


private static int a(int p0, int p1, boolean p2, boolean p3, boolean p4) {
int forwardValue1407_19_0;
    int forwardValue1407_33_0;
    int forwardValue1407_59_0;
    int forwardValue1407_67_0;
    int forwardValue1407_69_0;
    boolean spill1407_0;
    boolean spill1407_1;
    int spill1407_2;
    long life5_3;
    java.lang.String[] life7_5;
    forward_join_69: {
    forward_join_68: {
    forward_join_67: {
    forward_join_62: {
    forward_join_59: {
    forward_join_52: {
    forward_join_33: {
    forward_join_32: {
    forward_join_19: {
    forward_join_18: {
    life5_3 = (moom.A6.f ^ 114425935944378L);
    life7_5 = net.minecraft.potion.PotionEffect.b__ArrayString();
    spill1407_0 = p4;
    if (!((life7_5 != null))) {
        forwardValue1407_19_0 = ((spill1407_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill1407_0)) {
        break forward_join_18;
    }
    spill1407_1 = moom.A6.a__Boolean(((int)(p0)), ((int)(p1)));
    if (!((life7_5 != null))) {
        forwardValue1407_69_0 = ((spill1407_1) ? 1 : 0);
        break forward_join_69;
    }
    if (!((!spill1407_1))) {
        break forward_join_68;
    }
    return 0;
    }
    forwardValue1407_19_0 = ((p2) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        forwardValue1407_33_0 = forwardValue1407_19_0;
        break forward_join_33;
    }
    if (!((forwardValue1407_19_0 != 0))) {
        break forward_join_32;
    }
    p0 = (p0 & ((1 << p1) ^ -1));
    if (!((life7_5 == null))) {
        break forward_join_68;
    }
    }
    forwardValue1407_33_0 = ((p3) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        forwardValue1407_67_0 = forwardValue1407_33_0;
        break forward_join_67;
    }
    if (!((forwardValue1407_33_0 != 0))) {
        break forward_join_62;
    }
    spill1407_2 = (p0 & (1 << p1));
    if (!((life7_5 != null))) {
        forwardValue1407_59_0 = spill1407_2;
        break forward_join_59;
    }
    if (!((spill1407_2 == 0))) {
        break forward_join_52;
    }
    p0 = (p0 | (1 << p1));
    if (!((life7_5 == null))) {
        break forward_join_68;
    }
    }
    forwardValue1407_59_0 = (p0 & ((1 << p1) ^ -1));
    }
    p0 = forwardValue1407_59_0;
    if (!((life7_5 == null))) {
        break forward_join_68;
    }
    }
    forwardValue1407_67_0 = (p0 | (1 << p1));
    }
    p0 = forwardValue1407_67_0;
    }
    forwardValue1407_69_0 = p0;
    }
    return forwardValue1407_69_0;
}


public static java.util.List<net.minecraft.potion.PotionEffect> a__List(int p0, boolean p1) {
java.lang.Object lexicalValue464_38_0;
    java.lang.String lexicalValue464_69_0;
    int lexicalValue464_83_0;
    int lexicalValue464_125_0;
    int lexicalValue464_136_0;
    java.util.ArrayList lexicalValue464_142_0;
    int lexicalValue464_167_0;
    java.lang.String[] spill464_0;
    net.minecraft.potion.Potion spill464_1;
    java.lang.String spill464_2;
    int spill464_3;
    java.util.ArrayList spill464_4;
    int spill464_5;
    long life2_3;
    java.util.ArrayList life5_5;
    net.minecraft.potion.Potion[] life6_8;
    java.lang.String[] life4_9;
    int life7_12;
    int life8_14;
    net.minecraft.potion.Potion life9_21;
    java.lang.String life10_54;
    int life11_68;
    int life12_77;
    java.lang.String life13_84;
    int life11_135;
    int life11_139;
    net.minecraft.potion.PotionEffect life14_189;
    lexical_join_171: {
    life2_3 = (moom.A6.f ^ 126535718712922L);
    life5_5 = null;
    spill464_0 = net.minecraft.potion.PotionEffect.b__ArrayString();
    life6_8 = net.minecraft.potion.Potion.a;
    life4_9 = spill464_0;
    life7_12 = (life6_8).length;
    life8_14 = 0;
    lexical_cycle_15: while (true) {
    lexical_join_169: {
    lexical_join_168: {
    lexical_join_167: {
    lexical_join_164: {
    lexical_join_143: {
    lexical_join_142: {
    lexical_join_137: {
    lexical_join_136: {
    lexical_join_125: {
    lexical_join_90: {
    lexical_join_83: {
    lexical_join_81: {
    lexical_join_69: {
    lexical_join_38: {
    lexical_join_33: {
    if (!((life8_14 < life7_12))) {
        break lexical_join_171;
    }
    life9_21 = (life6_8)[life8_14];
    if (!((life4_9 != null))) {
        break lexical_join_169;
    }
    if (!((life9_21 != null))) {
        break lexical_join_168;
    }
    spill464_1 = life9_21;
    if (!((life4_9 != null))) {
        lexicalValue464_38_0 = spill464_1;
        break lexical_join_38;
    }
    if (!(((net.minecraft.potion.Potion)(spill464_1)).d())) {
        break lexical_join_33;
    }
    if (!(p1)) {
        break lexical_join_168;
    }
    }
    lexicalValue464_38_0 = ((java.util.Map)(moom.A6.b)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.potion.Potion)(life9_21)).a__Int()))))));
    }
    life10_54 = ((java.lang.String)(lexicalValue464_38_0));
    if (!((life4_9 != null))) {
        break lexical_join_169;
    }
    if (!((life10_54 != null))) {
        break lexical_join_168;
    }
    life11_68 = moom.A6.a(((java.lang.String)(life10_54)), ((int)(0)), ((int)(((java.lang.String)(life10_54)).length())), ((int)(p0)));
    if (!((life4_9 != null))) {
        break lexical_join_169;
    }
    if (!((life11_68 > 0))) {
        break lexical_join_168;
    }
    life12_77 = 0;
    life13_84 = ((java.lang.String)(((java.util.Map)(moom.A6.c)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.potion.Potion)(life9_21)).a__Int()))))))));
    spill464_2 = life13_84;
    if (!((life4_9 != null))) {
        lexicalValue464_69_0 = spill464_2;
        break lexical_join_69;
    }
    if (!((spill464_2 != null))) {
        break lexical_join_81;
    }
    lexicalValue464_69_0 = life13_84;
    }
    life12_77 = moom.A6.a(((java.lang.String)(lexicalValue464_69_0)), ((int)(0)), ((int)(((java.lang.String)(life13_84)).length())), ((int)(p0)));
    spill464_3 = life12_77;
    if (!((life4_9 != null))) {
        lexicalValue464_83_0 = spill464_3;
        break lexical_join_83;
    }
    if (!((spill464_3 < 0))) {
        break lexical_join_81;
    }
    life12_77 = 0;
    }
    lexicalValue464_83_0 = ((((net.minecraft.potion.Potion)(life9_21)).a__Boolean()) ? 1 : 0);
    }
    if (!((life4_9 != null))) {
        lexicalValue464_125_0 = lexicalValue464_83_0;
        break lexical_join_125;
    }
    if (!((lexicalValue464_83_0 != 0))) {
        break lexical_join_90;
    }
    life11_68 = 1;
    if (!((life4_9 == null))) {
        break lexical_join_137;
    }
    }
    life11_135 = (__sourceIntrinsic_4c098030449d_invokedynamic464_20(5100, (5882050490164368677L ^ life2_3)) * ((life11_68 * 3) + ((life11_68 - 1) * 2)));
    life11_139 = (life11_135 >> life12_77);
    life11_68 = ((int) java.lang.Math.round(((double)((((double) life11_139) * ((net.minecraft.potion.Potion)(life9_21)).a())))));
    lexicalValue464_125_0 = (p0 & __sourceIntrinsic_4c098030449d_invokedynamic464_23(6888, (5241217449661717515L ^ life2_3)));
    }
    if (!((life4_9 != null))) {
        lexicalValue464_136_0 = lexicalValue464_125_0;
        break lexical_join_136;
    }
    if (!((lexicalValue464_125_0 != 0))) {
        break lexical_join_137;
    }
    lexicalValue464_136_0 = ((int) java.lang.Math.round(((double)(((((double) life11_68) * 0x1.8p-1d) + 0x1.0p-1d)))));
    }
    life11_68 = lexicalValue464_136_0;
    }
    spill464_4 = life5_5;
    if (!((life4_9 != null))) {
        lexicalValue464_142_0 = spill464_4;
        break lexical_join_142;
    }
    if (!((spill464_4 == null))) {
        break lexical_join_143;
    }
    lexicalValue464_142_0 = com.google.common.collect.Lists.newArrayList();
    }
    life5_5 = lexicalValue464_142_0;
    }
    life14_189 = new net.minecraft.potion.PotionEffect(((net.minecraft.potion.Potion)(life9_21)).a__Int(), life11_68, life12_77);
    spill464_5 = (p0 & __sourceIntrinsic_4c098030449d_invokedynamic464_27(13232, (8538987053582677373L ^ life2_3)));
    if (!((life4_9 != null))) {
        lexicalValue464_167_0 = spill464_5;
        break lexical_join_167;
    }
    if (!((spill464_5 != 0))) {
        break lexical_join_164;
    }
    ((net.minecraft.potion.PotionEffect)(life14_189)).a(((boolean)(true)));
    }
    lexicalValue464_167_0 = ((((java.util.List)(life5_5)).add(((java.lang.Object)(life14_189)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue464_167_0);
    }
    life8_14 += 1;
    }
    if (!((life4_9 == null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    return life5_5;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3642_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/A6"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.A6.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 27030;
      if (h[var3] == null) {
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
         long var5 = g[var3];
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/A6", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static int a(int p0, boolean p1) {
int forwardValue1409_30_0;
    int forwardValue1409_44_0;
    java.lang.String[] spill1409_0;
    boolean spill1409_1;
    boolean spill1409_2;
    long life2_3;
    java.lang.Integer life5_7;
    java.lang.String[] life4_8;
    int life6_41;
    forward_join_44: {
    forward_join_39: {
    forward_join_30: {
    forward_join_25: {
    life2_3 = (moom.A6.f ^ 70195347488222L);
    spill1409_0 = net.minecraft.potion.PotionEffect.b__ArrayString();
    life5_7 = moom.Df.a(((int)(p0)));
    life4_8 = spill1409_0;
    spill1409_1 = p1;
    if (!((life4_8 != null))) {
        forwardValue1409_44_0 = ((spill1409_1) ? 1 : 0);
        break forward_join_44;
    }
    if (!((!spill1409_1))) {
        break forward_join_39;
    }
    spill1409_2 = ((java.util.Map)(moom.A6.d)).containsKey(((java.lang.Object)(life5_7)));
    if (!((life4_8 != null))) {
        forwardValue1409_30_0 = ((spill1409_2) ? 1 : 0);
        break forward_join_30;
    }
    if (!(spill1409_2)) {
        break forward_join_25;
    }
    return ((java.lang.Integer)(((java.lang.Integer)(((java.util.Map)(moom.A6.d)).get(((java.lang.Object)(life5_7))))))).intValue();
    }
    forwardValue1409_30_0 = moom.A6.a(((java.util.Collection)(moom.A6.a__List(((int)(((java.lang.Integer)(life5_7)).intValue())), ((boolean)(false))))));
    }
    life6_41 = forwardValue1409_30_0;
    ((java.util.Map)(moom.A6.d)).put(((java.lang.Object)(life5_7)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(life6_41))))));
    return life6_41;
    }
    forwardValue1409_44_0 = moom.A6.a(((java.util.Collection)(moom.A6.a__List(((int)(((java.lang.Integer)(life5_7)).intValue())), ((boolean)(true))))));
    }
    return forwardValue1409_44_0;
}


public static boolean a__Boolean(java.util.Collection<net.minecraft.potion.PotionEffect> p0) {
int lexicalValue463_24_0;
    int lexicalValue463_28_0;
    java.lang.String[] spill463_0;
    boolean spill463_1;
    long life1_3;
    java.util.Iterator life4_7;
    java.lang.String[] life3_8;
    net.minecraft.potion.PotionEffect life5_15;
    lexical_join_28: {
    lexical_join_27: {
    life1_3 = (moom.A6.f ^ 56384363486001L);
    spill463_0 = net.minecraft.potion.PotionEffect.b__ArrayString();
    life4_7 = ((java.util.Collection)(p0)).iterator();
    life3_8 = spill463_0;
    lexical_cycle_9: while (true) {
    lexical_join_25: {
    lexical_join_24: {
    if (!(((java.util.Iterator)(life4_7)).hasNext())) {
        break lexical_join_27;
    }
    life5_15 = ((net.minecraft.potion.PotionEffect)(((java.util.Iterator)(life4_7)).next()));
    spill463_1 = ((net.minecraft.potion.PotionEffect)(life5_15)).a__Boolean();
    if (!((life3_8 != null))) {
        lexicalValue463_28_0 = ((spill463_1) ? 1 : 0);
        break lexical_join_28;
    }
    if (!((life3_8 != null))) {
        lexicalValue463_24_0 = ((spill463_1) ? 1 : 0);
        break lexical_join_24;
    }
    if (!((!spill463_1))) {
        break lexical_join_25;
    }
    lexicalValue463_24_0 = 0;
    }
    return ((lexicalValue463_24_0) != 0);
    }
    if (!((life3_8 == null))) { continue lexical_cycle_9; }
    break lexical_cycle_9;
    }
    }
    lexicalValue463_28_0 = 1;
    }
    return ((lexicalValue463_28_0) != 0);
}


public static int a(java.util.Collection<net.minecraft.potion.PotionEffect> p0) {
java.util.Collection lexicalValue462_17_0;
    int lexicalValue462_51_0;
    int lexicalValue462_62_0;
    int lexicalValue462_132_0;
    int lexicalValue462_175_0;
    int lexicalValue462_177_0;
    int lexicalValue462_183_0;
    int lexicalValue462_185_0;
    java.lang.String[] spill462_0;
    java.util.Collection spill462_1;
    boolean spill462_2;
    boolean spill462_3;
    boolean spill462_4;
    long life1_3;
    int life4_10;
    java.lang.String[] life3_11;
    float life5_28;
    float life6_30;
    float life7_32;
    float life8_34;
    java.util.Iterator life9_37;
    net.minecraft.potion.PotionEffect life10_44;
    int life11_66;
    int life12_80;
    float life5_165;
    float life6_171;
    float life7_177;
    lexical_join_185: {
    lexical_join_184: {
    lexical_join_183: {
    lexical_join_177: {
    lexical_join_176: {
    lexical_join_175: {
    lexical_join_137: {
    lexical_join_132: {
    lexical_join_129: {
    lexical_join_17: {
    life1_3 = (moom.A6.f ^ 48307492623447L);
    spill462_0 = net.minecraft.potion.PotionEffect.b__ArrayString();
    life4_10 = __sourceIntrinsic_beeaf17d0dbd_invokedynamic462_2(3200, (8306107104119023737L ^ life1_3));
    life3_11 = spill462_0;
    spill462_1 = p0;
    if (!((life3_11 != null))) {
        lexicalValue462_17_0 = spill462_1;
        break lexical_join_17;
    }
    if (!((spill462_1 != null))) {
        break lexical_join_176;
    }
    lexicalValue462_17_0 = p0;
    }
    spill462_2 = ((java.util.Collection)(lexicalValue462_17_0)).isEmpty();
    if (!((life3_11 != null))) {
        lexicalValue462_177_0 = ((spill462_2) ? 1 : 0);
        break lexical_join_177;
    }
    if (!((!spill462_2))) {
        break lexical_join_176;
    }
    life5_28 = 0x0.0p0f;
    life6_30 = 0x0.0p0f;
    life7_32 = 0x0.0p0f;
    life8_34 = 0x0.0p0f;
    life9_37 = ((java.util.Collection)(p0)).iterator();
    lexical_cycle_32: while (true) {
    lexical_join_127: {
    lexical_join_62: {
    lexical_join_61: {
    lexical_join_51: {
    if (!(((java.util.Iterator)(life9_37)).hasNext())) {
        break lexical_join_129;
    }
    life10_44 = ((net.minecraft.potion.PotionEffect)(((java.util.Iterator)(life9_37)).next()));
    spill462_3 = ((net.minecraft.potion.PotionEffect)(life10_44)).b__Boolean();
    if (!((life3_11 != null))) {
        lexicalValue462_132_0 = ((spill462_3) ? 1 : 0);
        break lexical_join_132;
    }
    if (!((life3_11 != null))) {
        lexicalValue462_51_0 = ((spill462_3) ? 1 : 0);
        break lexical_join_51;
    }
    if (!(spill462_3)) {
        break lexical_join_127;
    }
    lexicalValue462_51_0 = ((net.minecraft.potion.Potion)((net.minecraft.potion.Potion.a)[((net.minecraft.potion.PotionEffect)(life10_44)).a()])).c();
    }
    life11_66 = lexicalValue462_51_0;
    spill462_4 = moom.BU.ag();
    if (!((life3_11 != null))) {
        lexicalValue462_62_0 = ((spill462_4) ? 1 : 0);
        break lexical_join_62;
    }
    if (!(spill462_4)) {
        break lexical_join_61;
    }
    life11_66 = moom.Jl.b(((int)(((net.minecraft.potion.PotionEffect)(life10_44)).a())), ((int)(life11_66)));
    }
    lexicalValue462_62_0 = 0;
    }
    life12_80 = lexicalValue462_62_0;
    lexical_cycle_63: while (true) {
    if (!((life12_80 <= ((net.minecraft.potion.PotionEffect)(life10_44)).c()))) {
        break lexical_join_127;
    }
    life5_28 = (life5_28 + (((float) ((life11_66 >> __sourceIntrinsic_beeaf17d0dbd_invokedynamic462_20(68, (9206929035066958977L ^ life1_3))) & __sourceIntrinsic_beeaf17d0dbd_invokedynamic462_21(9791, (2258773059455861462L ^ life1_3)))) / 0x1.fep7f));
    life6_30 = (life6_30 + (((float) ((life11_66 >> __sourceIntrinsic_beeaf17d0dbd_invokedynamic462_22(15239, (3223442365269892947L ^ life1_3))) & __sourceIntrinsic_beeaf17d0dbd_invokedynamic462_23(18785, (1781782821656735130L ^ life1_3)))) / 0x1.fep7f));
    life7_32 = (life7_32 + (((float) (life11_66 & __sourceIntrinsic_beeaf17d0dbd_invokedynamic462_24(18785, (1781782821656735130L ^ life1_3)))) / 0x1.fep7f));
    life8_34 = (life8_34 + 0x1.0p0f);
    life12_80 += 1;
    if (!((life3_11 != null))) { continue lexical_cycle_32; }
    if (!((life3_11 == null))) { continue lexical_cycle_63; }
    break lexical_cycle_63;
    }
    }
    if (!((life3_11 == null))) { continue lexical_cycle_32; }
    break lexical_cycle_32;
    }
    }
    lexicalValue462_132_0 = recovery.source.CarrierOps.fcmpl(((float)(life8_34)), ((float)(0x0.0p0f)));
    }
    if (!((life3_11 != null))) {
        lexicalValue462_175_0 = lexicalValue462_132_0;
        break lexical_join_175;
    }
    if (!((lexicalValue462_132_0 == 0))) {
        break lexical_join_137;
    }
    return 0;
    }
    life5_165 = ((life5_28 / life8_34) * 0x1.fep7f);
    life6_171 = ((life6_30 / life8_34) * 0x1.fep7f);
    life7_177 = ((life7_32 / life8_34) * 0x1.fep7f);
    lexicalValue462_175_0 = (((((int) life5_165) << __sourceIntrinsic_beeaf17d0dbd_invokedynamic462_26(22166, (958205068872594005L ^ life1_3))) | (((int) life6_171) << __sourceIntrinsic_beeaf17d0dbd_invokedynamic462_27(32728, (4847043676397738795L ^ life1_3)))) | ((int) life7_177));
    }
    return lexicalValue462_175_0;
    }
    lexicalValue462_177_0 = ((moom.BU.ag()) ? 1 : 0);
    }
    if (!((life3_11 != null))) {
        lexicalValue462_183_0 = lexicalValue462_177_0;
        break lexical_join_183;
    }
    if (!((lexicalValue462_177_0 != 0))) {
        break lexical_join_184;
    }
    lexicalValue462_183_0 = moom.Jl.b(((int)(0)), ((int)(life4_10)));
    }
    lexicalValue462_185_0 = lexicalValue462_183_0;
    break lexical_join_185;
    }
    lexicalValue462_185_0 = life4_10;
    }
    return lexicalValue462_185_0;
}


public static int a(int p0) {
return moom.A6.a(((int)(p0)), ((int)(5)), ((int)(4)), ((int)(3)), ((int)(2)), ((int)(1)));
}


private static int a(java.lang.String p0, int p1, int p2, int p3) {
int lexicalValue461_60_0;
    int lexicalValue461_73_0;
    int lexicalValue461_104_0;
    int lexicalValue461_112_0;
    int lexicalValue461_114_0;
    int lexicalValue461_116_0;
    int lexicalValue461_197_0;
    int lexicalValue461_206_0;
    int lexicalValue461_206_1;
    int lexicalValue461_219_0;
    int lexicalValue461_219_1;
    int lexicalValue461_254_0;
    int lexicalValue461_263_0;
    int lexicalValue461_263_1;
    int lexicalValue461_298_0;
    int lexicalValue461_309_0;
    int lexicalValue461_309_1;
    int lexicalValue461_338_0;
    int lexicalValue461_367_0;
    int lexicalValue461_371_0;
    int lexicalValue461_402_0;
    int lexicalValue461_420_0;
    int lexicalValue461_420_1;
    int lexicalValue461_435_0;
    int lexicalValue461_435_1;
    int lexicalValue461_437_0;
    int lexicalValue461_454_0;
    int lexicalValue461_454_1;
    int lexicalValue461_457_0;
    int lexicalValue461_459_0;
    int spill461_0;
    int spill461_1;
    int spill461_2;
    int spill461_3;
    int spill461_4;
    int spill461_5;
    int spill461_6;
    int spill461_7;
    int spill461_8;
    int spill461_9;
    int spill461_10;
    int spill461_11;
    int spill461_12;
    int spill461_13;
    int spill461_14;
    int spill461_15;
    int spill461_16;
    int spill461_17;
    int spill461_18;
    int spill461_19;
    int spill461_20;
    int spill461_21;
    int spill461_22;
    int spill461_23;
    long life4_3;
    java.lang.String[] life6_5;
    int life7_44;
    int life8_70;
    int life9_89;
    int life8_102;
    int life9_128;
    int life10_147;
    int life9_164;
    int life10_166;
    int life11_168;
    int life12_170;
    int life13_172;
    int life14_174;
    int life15_176;
    int life16_178;
    int life17_180;
    int life18_182;
    int life19_189;
    int life15_251;
    int life12_322;
    int life13_380;
    lexical_join_459: {
    lexical_join_458: {
    lexical_join_457: {
    lexical_join_456: {
    lexical_join_454: {
    lexical_join_441: {
    lexical_join_116: {
    lexical_join_115: {
    lexical_join_114: {
    lexical_join_112: {
    lexical_join_111: {
    lexical_join_104: {
    lexical_join_97: {
    lexical_join_73: {
    lexical_join_65: {
    lexical_join_60: {
    lexical_join_53: {
    life4_3 = (moom.A6.f ^ 70482294401484L);
    life6_5 = net.minecraft.potion.PotionEffect.b__ArrayString();
    spill461_0 = p1;
    if (!((life6_5 != null))) {
        lexicalValue461_459_0 = spill461_0;
        break lexical_join_459;
    }
    if (!((spill461_0 < ((java.lang.String)(p0)).length()))) {
        break lexical_join_458;
    }
    spill461_1 = p2;
    if (!((life6_5 != null))) {
        lexicalValue461_459_0 = spill461_1;
        break lexical_join_459;
    }
    if (!((spill461_1 >= 0))) {
        break lexical_join_458;
    }
    spill461_2 = p1;
    if (!((life6_5 != null))) {
        lexicalValue461_459_0 = spill461_2;
        break lexical_join_459;
    }
    if (!((spill461_2 < p2))) {
        break lexical_join_458;
    }
    life7_44 = ((java.lang.String)(p0)).indexOf(((int)(__sourceIntrinsic_db7ee6a60a8e_invokedynamic461_3(1952, (893873966791827185L ^ life4_3)))), ((int)(p1)));
    spill461_3 = life7_44;
    if (!((life6_5 != null))) {
        lexicalValue461_73_0 = spill461_3;
        break lexical_join_73;
    }
    if (!((spill461_3 >= 0))) {
        break lexical_join_65;
    }
    spill461_4 = life7_44;
    if (!((life6_5 != null))) {
        lexicalValue461_73_0 = spill461_4;
        break lexical_join_73;
    }
    if (!((spill461_4 < p2))) {
        break lexical_join_65;
    }
    life8_70 = moom.A6.a(((java.lang.String)(p0)), ((int)(p1)), ((int)((life7_44 - 1))), ((int)(p3)));
    spill461_5 = life8_70;
    if (!((life6_5 != null))) {
        lexicalValue461_60_0 = spill461_5;
        break lexical_join_60;
    }
    if (!((spill461_5 > 0))) {
        break lexical_join_53;
    }
    return life8_70;
    }
    lexicalValue461_60_0 = moom.A6.a(((java.lang.String)(p0)), ((int)((life7_44 + 1))), ((int)(p2)), ((int)(p3)));
    }
    life9_89 = lexicalValue461_60_0;
    return java.lang.Math.max(((int)(life9_89)), ((int)(0)));
    }
    lexicalValue461_73_0 = ((java.lang.String)(p0)).indexOf(((int)(__sourceIntrinsic_db7ee6a60a8e_invokedynamic461_8(10639, (8251850156338196724L ^ life4_3)))), ((int)(p1)));
    }
    life8_102 = lexicalValue461_73_0;
    spill461_6 = life8_102;
    if (!((life6_5 != null))) {
        lexicalValue461_116_0 = spill461_6;
        break lexical_join_116;
    }
    if (!((spill461_6 >= 0))) {
        break lexical_join_115;
    }
    spill461_7 = life8_102;
    if (!((life6_5 != null))) {
        lexicalValue461_116_0 = spill461_7;
        break lexical_join_116;
    }
    if (!((spill461_7 < p2))) {
        break lexical_join_115;
    }
    life9_128 = moom.A6.a(((java.lang.String)(p0)), ((int)(p1)), ((int)((life8_102 - 1))), ((int)(p3)));
    spill461_8 = life9_128;
    if (!((life6_5 != null))) {
        lexicalValue461_104_0 = spill461_8;
        break lexical_join_104;
    }
    if (!((spill461_8 <= 0))) {
        break lexical_join_97;
    }
    return 0;
    }
    lexicalValue461_104_0 = moom.A6.a(((java.lang.String)(p0)), ((int)((life8_102 + 1))), ((int)(p2)), ((int)(p3)));
    }
    life10_147 = lexicalValue461_104_0;
    spill461_9 = life10_147;
    if (!((life6_5 != null))) {
        lexicalValue461_112_0 = spill461_9;
        break lexical_join_112;
    }
    if (!((spill461_9 <= 0))) {
        break lexical_join_111;
    }
    lexicalValue461_114_0 = 0;
    break lexical_join_114;
    }
    lexicalValue461_112_0 = life9_128;
    }
    lexicalValue461_114_0 = java.lang.Math.max(((int)(lexicalValue461_112_0)), ((int)(life10_147)));
    }
    return lexicalValue461_114_0;
    }
    lexicalValue461_116_0 = 0;
    }
    life9_164 = lexicalValue461_116_0;
    life10_166 = 0;
    life11_168 = 0;
    life12_170 = 0;
    life13_172 = 0;
    life14_174 = -1;
    life15_176 = 0;
    life16_178 = 0;
    life17_180 = 0;
    life18_182 = p1;
    lexical_cycle_135: while (true) {
    lexical_join_438: {
    lexical_join_437: {
    lexical_join_435: {
    lexical_join_427: {
    lexical_join_420: {
    lexical_join_414: {
    lexical_join_402: {
    lexical_join_401: {
    lexical_join_371: {
    lexical_join_370: {
    lexical_join_367: {
    lexical_join_338: {
    lexical_join_309: {
    lexical_join_301: {
    lexical_join_298: {
    lexical_join_297: {
    lexical_join_263: {
    lexical_join_257: {
    lexical_join_254: {
    lexical_join_253: {
    lexical_join_219: {
    lexical_join_213: {
    lexical_join_206: {
    lexical_join_200: {
    lexical_join_197: {
    lexical_join_178: {
    if (!((life18_182 < p2))) {
        break lexical_join_441;
    }
    life19_189 = ((int)(((java.lang.String)(p0)).charAt(((int)(life18_182)))));
    spill461_10 = life19_189;
    spill461_11 = __sourceIntrinsic_db7ee6a60a8e_invokedynamic461_15(29805, (511497861487979782L ^ life4_3));
    if (!((life6_5 != null))) {
        lexicalValue461_454_0 = spill461_10;
        lexicalValue461_454_1 = spill461_11;
        break lexical_join_454;
    }
    if (!((life6_5 != null))) {
        lexicalValue461_206_0 = spill461_10;
        lexicalValue461_206_1 = spill461_11;
        break lexical_join_206;
    }
    if (!((spill461_10 >= spill461_11))) {
        break lexical_join_200;
    }
    spill461_12 = life19_189;
    spill461_13 = __sourceIntrinsic_db7ee6a60a8e_invokedynamic461_16(6717, (2021291365559501652L ^ life4_3));
    if (!((life6_5 != null))) {
        lexicalValue461_206_0 = spill461_12;
        lexicalValue461_206_1 = spill461_13;
        break lexical_join_206;
    }
    if (!((spill461_12 <= spill461_13))) {
        break lexical_join_200;
    }
    spill461_14 = life9_164;
    if (!((life6_5 != null))) {
        lexicalValue461_197_0 = spill461_14;
        break lexical_join_197;
    }
    if (!((spill461_14 != 0))) {
        break lexical_join_178;
    }
    life16_178 = (life19_189 - __sourceIntrinsic_db7ee6a60a8e_invokedynamic461_17(19461, (3809118386998039891L ^ life4_3)));
    life10_166 = 1;
    if (!((life6_5 == null))) {
        break lexical_join_438;
    }
    }
    life15_251 = (life15_176 * __sourceIntrinsic_db7ee6a60a8e_invokedynamic461_18(5791, (694346753525321695L ^ life4_3)));
    life15_176 = (life15_251 + (life19_189 - __sourceIntrinsic_db7ee6a60a8e_invokedynamic461_19(19461, (3809118386998039891L ^ life4_3))));
    lexicalValue461_197_0 = 1;
    }
    life11_168 = lexicalValue461_197_0;
    if (!((life6_5 == null))) {
        break lexical_join_438;
    }
    }
    lexicalValue461_206_0 = life19_189;
    lexicalValue461_206_1 = __sourceIntrinsic_db7ee6a60a8e_invokedynamic461_20(21899, (5285500831629593795L ^ life4_3));
    }
    if (!((life6_5 != null))) {
        lexicalValue461_219_0 = lexicalValue461_206_0;
        lexicalValue461_219_1 = lexicalValue461_206_1;
        break lexical_join_219;
    }
    if (!((lexicalValue461_206_0 == lexicalValue461_206_1))) {
        break lexical_join_213;
    }
    life9_164 = 1;
    if (!((life6_5 == null))) {
        break lexical_join_438;
    }
    }
    lexicalValue461_219_0 = life19_189;
    lexicalValue461_219_1 = __sourceIntrinsic_db7ee6a60a8e_invokedynamic461_21(30638, (5122539878364114660L ^ life4_3));
    }
    if (!((life6_5 != null))) {
        lexicalValue461_263_0 = lexicalValue461_219_0;
        lexicalValue461_263_1 = lexicalValue461_219_1;
        break lexical_join_263;
    }
    if (!((lexicalValue461_219_0 == lexicalValue461_219_1))) {
        break lexical_join_257;
    }
    spill461_15 = life11_168;
    if (!((life6_5 != null))) {
        lexicalValue461_254_0 = spill461_15;
        break lexical_join_254;
    }
    if (!((spill461_15 != 0))) {
        break lexical_join_253;
    }
    life17_180 = (life17_180 + moom.A6.a(((boolean)__sourceIntrinsic_integerToBoolean((life12_170))), ((boolean)__sourceIntrinsic_integerToBoolean((life10_166))), ((boolean)__sourceIntrinsic_integerToBoolean((life13_172))), ((int)(life14_174)), ((int)(life15_176)), ((int)(life16_178)), ((int)(p3))));
    life12_322 = 0;
    life13_172 = 0;
    life9_164 = 0;
    life10_166 = 0;
    life11_168 = 0;
    life16_178 = 0;
    life15_176 = 0;
    life14_174 = -1;
    }
    lexicalValue461_254_0 = 1;
    }
    life12_170 = lexicalValue461_254_0;
    if (!((life6_5 == null))) {
        break lexical_join_438;
    }
    }
    lexicalValue461_263_0 = life19_189;
    lexicalValue461_263_1 = __sourceIntrinsic_db7ee6a60a8e_invokedynamic461_23(1401, (5798697483425651720L ^ life4_3));
    }
    if (!((life6_5 != null))) {
        lexicalValue461_309_0 = lexicalValue461_263_0;
        lexicalValue461_309_1 = lexicalValue461_263_1;
        break lexical_join_309;
    }
    if (!((lexicalValue461_263_0 == lexicalValue461_263_1))) {
        break lexical_join_301;
    }
    spill461_16 = life11_168;
    if (!((life6_5 != null))) {
        lexicalValue461_298_0 = spill461_16;
        break lexical_join_298;
    }
    if (!((spill461_16 != 0))) {
        break lexical_join_297;
    }
    life17_180 = (life17_180 + moom.A6.a(((boolean)__sourceIntrinsic_integerToBoolean((life12_170))), ((boolean)__sourceIntrinsic_integerToBoolean((life10_166))), ((boolean)__sourceIntrinsic_integerToBoolean((life13_172))), ((int)(life14_174)), ((int)(life15_176)), ((int)(life16_178)), ((int)(p3))));
    life12_170 = 0;
    life13_380 = 0;
    life9_164 = 0;
    life10_166 = 0;
    life11_168 = 0;
    life16_178 = 0;
    life15_176 = 0;
    life14_174 = -1;
    }
    lexicalValue461_298_0 = 1;
    }
    life13_172 = lexicalValue461_298_0;
    if (!((life6_5 == null))) {
        break lexical_join_438;
    }
    }
    spill461_17 = life19_189;
    if (!((life6_5 != null))) {
        lexicalValue461_371_0 = spill461_17;
        break lexical_join_371;
    }
    lexicalValue461_309_0 = spill461_17;
    lexicalValue461_309_1 = __sourceIntrinsic_db7ee6a60a8e_invokedynamic461_25(17877, (2241395679652043909L ^ life4_3));
    }
    if (!((lexicalValue461_309_0 != lexicalValue461_309_1))) {
        break lexical_join_370;
    }
    spill461_18 = life19_189;
    if (!((life6_5 != null))) {
        lexicalValue461_371_0 = spill461_18;
        break lexical_join_371;
    }
    if (!((spill461_18 != __sourceIntrinsic_db7ee6a60a8e_invokedynamic461_26(31486, (930244311408731052L ^ life4_3))))) {
        break lexical_join_370;
    }
    spill461_19 = life19_189;
    if (!((life6_5 != null))) {
        lexicalValue461_371_0 = spill461_19;
        break lexical_join_371;
    }
    if (!((spill461_19 != __sourceIntrinsic_db7ee6a60a8e_invokedynamic461_27(1132, (8487182096651984130L ^ life4_3))))) {
        break lexical_join_370;
    }
    spill461_20 = life19_189;
    if (!((life6_5 != null))) {
        lexicalValue461_338_0 = spill461_20;
        break lexical_join_338;
    }
    if (!((spill461_20 == __sourceIntrinsic_db7ee6a60a8e_invokedynamic461_28(1551, (7401208412228951907L ^ life4_3))))) {
        break lexical_join_438;
    }
    lexicalValue461_338_0 = life11_168;
    }
    if (!((life6_5 != null))) {
        lexicalValue461_367_0 = lexicalValue461_338_0;
        break lexical_join_367;
    }
    if (!((lexicalValue461_338_0 != 0))) {
        break lexical_join_438;
    }
    life17_180 = (life17_180 + moom.A6.a(((boolean)__sourceIntrinsic_integerToBoolean((life12_170))), ((boolean)__sourceIntrinsic_integerToBoolean((life10_166))), ((boolean)__sourceIntrinsic_integerToBoolean((life13_172))), ((int)(life14_174)), ((int)(life15_176)), ((int)(life16_178)), ((int)(p3))));
    life12_170 = 0;
    life13_172 = 0;
    life9_164 = 0;
    life10_166 = 0;
    life11_168 = 0;
    life16_178 = 0;
    life15_176 = 0;
    lexicalValue461_367_0 = -1;
    }
    life14_174 = lexicalValue461_367_0;
    if (!((life6_5 == null))) {
        break lexical_join_438;
    }
    }
    lexicalValue461_371_0 = life11_168;
    }
    if (!((life6_5 != null))) {
        lexicalValue461_402_0 = lexicalValue461_371_0;
        break lexical_join_402;
    }
    if (!((lexicalValue461_371_0 != 0))) {
        break lexical_join_401;
    }
    life17_180 = (life17_180 + moom.A6.a(((boolean)__sourceIntrinsic_integerToBoolean((life12_170))), ((boolean)__sourceIntrinsic_integerToBoolean((life10_166))), ((boolean)__sourceIntrinsic_integerToBoolean((life13_172))), ((int)(life14_174)), ((int)(life15_176)), ((int)(life16_178)), ((int)(p3))));
    life12_170 = 0;
    life13_172 = 0;
    life9_164 = 0;
    life10_166 = 0;
    life11_168 = 0;
    life16_178 = 0;
    life15_176 = 0;
    life14_174 = -1;
    }
    lexicalValue461_402_0 = life19_189;
    }
    spill461_21 = __sourceIntrinsic_db7ee6a60a8e_invokedynamic461_31(25325, (9089311703214685081L ^ life4_3));
    if (!((life6_5 != null))) {
        lexicalValue461_420_0 = lexicalValue461_402_0;
        lexicalValue461_420_1 = spill461_21;
        break lexical_join_420;
    }
    if (!((lexicalValue461_402_0 == spill461_21))) {
        break lexical_join_414;
    }
    life14_174 = 0;
    if (!((life6_5 == null))) {
        break lexical_join_438;
    }
    }
    lexicalValue461_420_0 = life19_189;
    lexicalValue461_420_1 = __sourceIntrinsic_db7ee6a60a8e_invokedynamic461_32(5624, (8672250554243943552L ^ life4_3));
    }
    if (!((life6_5 != null))) {
        lexicalValue461_435_0 = lexicalValue461_420_0;
        lexicalValue461_435_1 = lexicalValue461_420_1;
        break lexical_join_435;
    }
    if (!((lexicalValue461_420_0 == lexicalValue461_420_1))) {
        break lexical_join_427;
    }
    life14_174 = 2;
    if (!((life6_5 == null))) {
        break lexical_join_438;
    }
    }
    spill461_22 = life19_189;
    if (!((life6_5 != null))) {
        lexicalValue461_437_0 = spill461_22;
        break lexical_join_437;
    }
    lexicalValue461_435_0 = spill461_22;
    lexicalValue461_435_1 = __sourceIntrinsic_db7ee6a60a8e_invokedynamic461_33(445, (3873997369876781278L ^ life4_3));
    }
    if (!((lexicalValue461_435_0 == lexicalValue461_435_1))) {
        break lexical_join_438;
    }
    lexicalValue461_437_0 = 1;
    }
    life14_174 = lexicalValue461_437_0;
    }
    life18_182 += 1;
    if (!((life6_5 == null))) { continue lexical_cycle_135; }
    break lexical_cycle_135;
    }
    }
    spill461_23 = life11_168;
    if (!((life6_5 != null))) {
        lexicalValue461_457_0 = spill461_23;
        break lexical_join_457;
    }
    if (!((spill461_23 != 0))) {
        break lexical_join_456;
    }
    lexicalValue461_454_0 = life17_180;
    lexicalValue461_454_1 = moom.A6.a(((boolean)__sourceIntrinsic_integerToBoolean((life12_170))), ((boolean)__sourceIntrinsic_integerToBoolean((life10_166))), ((boolean)__sourceIntrinsic_integerToBoolean((life13_172))), ((int)(life14_174)), ((int)(life15_176)), ((int)(life16_178)), ((int)(p3)));
    }
    life17_180 = (lexicalValue461_454_0 + lexicalValue461_454_1);
    }
    lexicalValue461_457_0 = life17_180;
    }
    return lexicalValue461_457_0;
    }
    lexicalValue461_459_0 = 0;
    }
    return lexicalValue461_459_0;
}


private static int a(int p0, int p1) {
int forwardValue1405_13_0;
    int forwardValue1405_15_0;
    boolean spill1405_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (moom.A6.f ^ 118201263500908L);
    life4_5 = net.minecraft.potion.PotionEffect.b__ArrayString();
    spill1405_0 = moom.A6.a__Boolean(((int)(p0)), ((int)(p1)));
    if (!((life4_5 != null))) {
        forwardValue1405_13_0 = ((spill1405_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!(spill1405_0)) {
        break forward_join_14;
    }
    forwardValue1405_13_0 = 1;
    }
    forwardValue1405_15_0 = forwardValue1405_13_0;
    break forward_join_15;
    }
    forwardValue1405_15_0 = 0;
    }
    return forwardValue1405_15_0;
}


private static int a(boolean p0, boolean p1, boolean p2, int p3, int p4, int p5, int p6) {
int forwardValue1412_19_0;
    int forwardValue1412_38_0;
    int forwardValue1412_39_0;
    int forwardValue1412_39_1;
    int forwardValue1412_56_0;
    int forwardValue1412_56_1;
    int forwardValue1412_69_0;
    int forwardValue1412_69_1;
    int forwardValue1412_72_0;
    int forwardValue1412_80_0;
    int forwardValue1412_88_0;
    java.lang.String[] spill1412_0;
    boolean spill1412_1;
    int spill1412_2;
    int spill1412_3;
    int spill1412_4;
    int spill1412_5;
    int spill1412_6;
    int spill1412_7;
    int spill1412_8;
    int spill1412_9;
    long life7_3;
    int life10_6;
    java.lang.String[] life9_7;
    forward_join_88: {
    forward_join_87: {
    forward_join_80: {
    forward_join_79: {
    forward_join_72: {
    forward_join_71: {
    forward_join_69: {
    forward_join_67: {
    forward_join_56: {
    forward_join_52: {
    forward_join_39: {
    forward_join_38: {
    forward_join_37: {
    forward_join_19: {
    forward_join_18: {
    life7_3 = (moom.A6.f ^ 42405113329405L);
    spill1412_0 = net.minecraft.potion.PotionEffect.b__ArrayString();
    life10_6 = 0;
    life9_7 = spill1412_0;
    spill1412_1 = p0;
    if (!((life9_7 != null))) {
        forwardValue1412_19_0 = ((spill1412_1) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill1412_1)) {
        break forward_join_18;
    }
    life10_6 = moom.A6.b(((int)(p6)), ((int)(p4)));
    if (!((life9_7 == null))) {
        break forward_join_71;
    }
    }
    forwardValue1412_19_0 = p3;
    }
    spill1412_2 = -1;
    if (!((life9_7 != null))) {
        forwardValue1412_69_0 = forwardValue1412_19_0;
        forwardValue1412_69_1 = spill1412_2;
        break forward_join_69;
    }
    if (!((forwardValue1412_19_0 != spill1412_2))) {
        break forward_join_67;
    }
    spill1412_3 = p3;
    if (!((life9_7 != null))) {
        forwardValue1412_38_0 = spill1412_3;
        break forward_join_38;
    }
    if (!((spill1412_3 == 0))) {
        break forward_join_37;
    }
    spill1412_4 = moom.A6.b(((int)(p6)));
    spill1412_5 = p4;
    if (!((life9_7 != null))) {
        forwardValue1412_39_0 = spill1412_4;
        forwardValue1412_39_1 = spill1412_5;
        break forward_join_39;
    }
    if (!((spill1412_4 == spill1412_5))) {
        break forward_join_37;
    }
    life10_6 = 1;
    if (!((life9_7 == null))) {
        break forward_join_71;
    }
    }
    forwardValue1412_38_0 = p3;
    }
    forwardValue1412_39_0 = forwardValue1412_38_0;
    forwardValue1412_39_1 = 1;
    }
    if (!((life9_7 != null))) {
        forwardValue1412_56_0 = forwardValue1412_39_0;
        forwardValue1412_56_1 = forwardValue1412_39_1;
        break forward_join_56;
    }
    if (!((forwardValue1412_39_0 == forwardValue1412_39_1))) {
        break forward_join_52;
    }
    spill1412_6 = moom.A6.b(((int)(p6)));
    spill1412_7 = p4;
    if (!((life9_7 != null))) {
        forwardValue1412_56_0 = spill1412_6;
        forwardValue1412_56_1 = spill1412_7;
        break forward_join_56;
    }
    if (!((spill1412_6 > spill1412_7))) {
        break forward_join_52;
    }
    life10_6 = 1;
    if (!((life9_7 == null))) {
        break forward_join_71;
    }
    }
    spill1412_8 = p3;
    if (!((life9_7 != null))) {
        forwardValue1412_72_0 = spill1412_8;
        break forward_join_72;
    }
    forwardValue1412_56_0 = spill1412_8;
    forwardValue1412_56_1 = 2;
    }
    if (!((forwardValue1412_56_0 == forwardValue1412_56_1))) {
        break forward_join_71;
    }
    spill1412_9 = moom.A6.b(((int)(p6)));
    if (!((life9_7 != null))) {
        forwardValue1412_72_0 = spill1412_9;
        break forward_join_72;
    }
    if (!((spill1412_9 < p4))) {
        break forward_join_71;
    }
    life10_6 = 1;
    if (!((life9_7 == null))) {
        break forward_join_71;
    }
    }
    forwardValue1412_69_0 = p6;
    forwardValue1412_69_1 = p4;
    }
    life10_6 = moom.A6.a(((int)(forwardValue1412_69_0)), ((int)(forwardValue1412_69_1)));
    }
    forwardValue1412_72_0 = ((p1) ? 1 : 0);
    }
    if (!((life9_7 != null))) {
        forwardValue1412_80_0 = forwardValue1412_72_0;
        break forward_join_80;
    }
    if (!((forwardValue1412_72_0 != 0))) {
        break forward_join_79;
    }
    life10_6 = (life10_6 * p5);
    }
    forwardValue1412_80_0 = ((p2) ? 1 : 0);
    }
    if (!((life9_7 != null))) {
        forwardValue1412_88_0 = forwardValue1412_80_0;
        break forward_join_88;
    }
    if (!((forwardValue1412_80_0 != 0))) {
        break forward_join_87;
    }
    life10_6 = (life10_6 * -1);
    }
    forwardValue1412_88_0 = life10_6;
    }
    return forwardValue1412_88_0;
}


public static java.lang.String a__String(int p0) {
int local1 = moom.A6.a(((int)(p0)));
    return (moom.A6.e)[local1];
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a7c3f45e989c_invokedynamic1406_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a7c3f45e989c_invokedynamic1406_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60f4bcb8bd52_invokedynamic460_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60f4bcb8bd52_invokedynamic460_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60f4bcb8bd52_invokedynamic460_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60f4bcb8bd52_invokedynamic460_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60f4bcb8bd52_invokedynamic460_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60f4bcb8bd52_invokedynamic460_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60f4bcb8bd52_invokedynamic460_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60f4bcb8bd52_invokedynamic460_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60f4bcb8bd52_invokedynamic460_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4c098030449d_invokedynamic464_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4c098030449d_invokedynamic464_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4c098030449d_invokedynamic464_27(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3642_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_beeaf17d0dbd_invokedynamic462_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_beeaf17d0dbd_invokedynamic462_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_beeaf17d0dbd_invokedynamic462_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_beeaf17d0dbd_invokedynamic462_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_beeaf17d0dbd_invokedynamic462_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_beeaf17d0dbd_invokedynamic462_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_beeaf17d0dbd_invokedynamic462_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_beeaf17d0dbd_invokedynamic462_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_db7ee6a60a8e_invokedynamic461_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_db7ee6a60a8e_invokedynamic461_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_db7ee6a60a8e_invokedynamic461_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_db7ee6a60a8e_invokedynamic461_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_db7ee6a60a8e_invokedynamic461_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_db7ee6a60a8e_invokedynamic461_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_db7ee6a60a8e_invokedynamic461_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_db7ee6a60a8e_invokedynamic461_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_db7ee6a60a8e_invokedynamic461_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_db7ee6a60a8e_invokedynamic461_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_db7ee6a60a8e_invokedynamic461_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_db7ee6a60a8e_invokedynamic461_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_db7ee6a60a8e_invokedynamic461_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_db7ee6a60a8e_invokedynamic461_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_db7ee6a60a8e_invokedynamic461_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_db7ee6a60a8e_invokedynamic461_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_db7ee6a60a8e_invokedynamic461_33(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
