package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class hx extends net.minecraft.client.gui.GuiScreen {

private final net.minecraft.client.gui.GuiScreen w;

protected java.lang.String x;

private final net.minecraft.client.settings.GameSettings y;

private static final net.minecraft.client.settings.GameSettings$Options[] z;

private static final long A;

private static final java.lang.String[] B;

private static final java.lang.String[] C;

private static final java.util.Map D;

private static final long[] E;

private static final java.lang.Integer[] F;

private static final java.util.Map G;

public hx(net.minecraft.client.gui.GuiScreen p0, net.minecraft.client.settings.GameSettings p1) {
super();
    this.w = p0;
    this.y = p1;
}


static {
A = ((long)(((moom._a)(moom._c.a(((long)(-1110661259473193007L)), ((long)(-1290512245969084239L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(22512899721650L)))));
    long local20_life6 = (moom.hx.A ^ 103244302174999L);
    D = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life9;
    javax.crypto.Cipher __sourceSpill870_11 = (local11_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill870_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill870_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill870_14 = new byte[8];
    (__sourceSpill870_14)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local12_life15 = 1;
    while ((local12_life15 < 8)) {
        (__sourceSpill870_14)[local12_life15] = ((byte) ((int) ((local20_life6 << (local12_life15 * 8)) >>> 56)));
        local12_life15 += 1;
    }
    byte[] __sourcePreallocation870_16 = __sourceSpill870_14;
    ((javax.crypto.Cipher)(__sourceSpill870_11)).init(((int)(__sourceSpill870_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill870_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation870_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local18_life19 = new java.lang.String[4];
    int local16_life20 = 0;
    java.lang.String local15_life21;
    int local17_life23 = ((java.lang.String)((local15_life21 = "©&.9t\004\004Òþ«\t;ÈßÉÉÆGË=o©ÖSw[3zw:}­±³»Yàx<Ê¶ÁV\000Sd,\024?8]¤þv%ïhL\bTIÑZÈ´\023ßÇd3i²UëÆøÃ.\016:½Åª¹Ü\000tFåaBYá<?öçFZ\027P"))).length();
    int local14_life24 = 56;
    int local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill870_28 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill870_29 = local11_life9;
        byte[] local19_life31 = ((javax.crypto.Cipher)(__sourceSpill870_29)).doFinal(((byte[])(__sourceSpill870_28)));
        java.lang.String __sourceSpill870_34 = ((java.lang.String)(moom.hx.a(((byte[])(local19_life31))))).intern();
        java.lang.String[] __sourceSpill870_35 = local18_life19;
        int __sourceSpill870_36 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill870_35)[__sourceSpill870_36] = __sourceSpill870_34;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    local17_life23 = ((java.lang.String)((local15_life21 = "l8*D\\.Ö`\nÎ(wÂ?\020Dî&8:8\"ncõàØ(gÐfèFÙnûg5\030\"\br#ÀûXi.+Æ=\bËÈÂ½qÐ^Ë£VÜô«=Â\031"))).length();
    local14_life24 = 24;
    local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill870_41 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill870_42 = local11_life9;
        byte[] local19_life44 = ((javax.crypto.Cipher)(__sourceSpill870_42)).doFinal(((byte[])(__sourceSpill870_41)));
        java.lang.String __sourceSpill870_47 = ((java.lang.String)(moom.hx.a(((byte[])(local19_life44))))).intern();
        java.lang.String[] __sourceSpill870_48 = local18_life19;
        int __sourceSpill870_49 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill870_48)[__sourceSpill870_49] = __sourceSpill870_47;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    B = ((java.lang.String[])(local18_life19));
    C = ((java.lang.String[])(new java.lang.String[4]));
    G = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill870_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill870_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill870_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill870_60 = new byte[8];
    (__sourceSpill870_60)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill870_60)[local1_life61] = ((byte) ((int) ((local20_life6 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation870_62 = __sourceSpill870_60;
    ((javax.crypto.Cipher)(__sourceSpill870_57)).init(((int)(__sourceSpill870_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill870_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation870_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[35];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "\013:Nq û~ \033æ\r\rÀ9Uæ¸R+I\nÓ\003AMÔeóg7wsÔrôßnÛóÂ0\034É\020í¾áYMQ·¸q1¥Hjcoë\007Y-ÉZ\007¨¤,¹Û\027eKIº÷yÒhä«ïµ\nùªX\016mJ¬ÒY+\032ÅçÞ\005h¿NSÁâkx·0Ã¢µw\024@¯9\021\021 üYNO-\021¹\003UË\016\020Ø»Á¦\017ÙoG\016oà«K\001ãq(5Ää4¿ÞZsvèb\032\022uÜ\025%ÞÜèBr«ÄK2M`æÄ³d[ù8g±%×\034°1ßÐ7¬\024N×\003ÙIu¯W\004f\003¶¶(½nZ<\030@\fo'\002{ºÃtÔ>ú{ãðë@DF#"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill870_71 = local4_life67;
        int __sourceSpill870_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill870_71)).substring(((int)(__sourceSpill870_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill870_76 = local6_life65;
        int __sourceSpill870_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill870_79 = new byte[8];
        (__sourceSpill870_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill870_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill870_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill870_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill870_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill870_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill870_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill870_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill870_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill870_80)).doFinal(((byte[])(__sourceSpill870_79)));
        (__sourceSpill870_76)[__sourceSpill870_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = ",l®\021ûòhÐ\002:A?ÉØ¦"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill870_84 = local4_life67;
        int __sourceSpill870_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill870_84)).substring(((int)(__sourceSpill870_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill870_89 = local6_life65;
        int __sourceSpill870_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill870_92 = new byte[8];
        (__sourceSpill870_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill870_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill870_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill870_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill870_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill870_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill870_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill870_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill870_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill870_93)).doFinal(((byte[])(__sourceSpill870_92)));
        (__sourceSpill870_89)[__sourceSpill870_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    E = ((long[])(local6_life65));
    F = ((java.lang.Integer[])(new java.lang.Integer[35]));
    net.minecraft.client.settings.GameSettings$Options[] __sourceSpill870_100 = new net.minecraft.client.settings.GameSettings$Options[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite870_98(17566, (7429554392622294587L ^ local20_life6))];
    (__sourceSpill870_100)[0] = net.minecraft.client.settings.GameSettings$Options.ANIMATED_WATER;
    (__sourceSpill870_100)[1] = net.minecraft.client.settings.GameSettings$Options.ANIMATED_LAVA;
    (__sourceSpill870_100)[2] = net.minecraft.client.settings.GameSettings$Options.ANIMATED_FIRE;
    (__sourceSpill870_100)[3] = net.minecraft.client.settings.GameSettings$Options.ANIMATED_PORTAL;
    (__sourceSpill870_100)[4] = net.minecraft.client.settings.GameSettings$Options.ANIMATED_REDSTONE;
    (__sourceSpill870_100)[5] = net.minecraft.client.settings.GameSettings$Options.ANIMATED_EXPLOSION;
    (__sourceSpill870_100)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite870_106(110, (1898557805658317522L ^ local20_life6))] = net.minecraft.client.settings.GameSettings$Options.ANIMATED_FLAME;
    (__sourceSpill870_100)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite870_108(24800, (3741939862989718107L ^ local20_life6))] = net.minecraft.client.settings.GameSettings$Options.ANIMATED_SMOKE;
    (__sourceSpill870_100)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite870_110(27660, (3464433536518868648L ^ local20_life6))] = net.minecraft.client.settings.GameSettings$Options.VOID_PARTICLES;
    (__sourceSpill870_100)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite870_112(19084, (6242140135797680191L ^ local20_life6))] = net.minecraft.client.settings.GameSettings$Options.WATER_PARTICLES;
    (__sourceSpill870_100)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite870_114(13634, (4970227514525652989L ^ local20_life6))] = net.minecraft.client.settings.GameSettings$Options.RAIN_SPLASH;
    (__sourceSpill870_100)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite870_116(2619, (2591070219788331153L ^ local20_life6))] = net.minecraft.client.settings.GameSettings$Options.PORTAL_PARTICLES;
    (__sourceSpill870_100)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite870_118(13680, (156404399854524375L ^ local20_life6))] = net.minecraft.client.settings.GameSettings$Options.POTION_PARTICLES;
    (__sourceSpill870_100)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite870_120(18785, (7336552937787354049L ^ local20_life6))] = net.minecraft.client.settings.GameSettings$Options.DRIPPING_WATER_LAVA;
    (__sourceSpill870_100)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite870_122(17985, (1171289726903313659L ^ local20_life6))] = net.minecraft.client.settings.GameSettings$Options.ANIMATED_TERRAIN;
    (__sourceSpill870_100)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite870_124(20423, (1133645991361965434L ^ local20_life6))] = net.minecraft.client.settings.GameSettings$Options.ANIMATED_TEXTURES;
    (__sourceSpill870_100)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite870_126(14277, (2360127821057463623L ^ local20_life6))] = net.minecraft.client.settings.GameSettings$Options.FIREWORK_PARTICLES;
    (__sourceSpill870_100)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite870_128(4744, (1584727219465957413L ^ local20_life6))] = net.minecraft.client.settings.GameSettings$Options.PARTICLES;
    z = ((net.minecraft.client.settings.GameSettings$Options[])(__sourceSpill870_100));
}


public void c__Void() {
int lexicalValue1193_111_0;
    int lexicalValue1193_282_0;
    int[] spill1193_0;
    boolean spill1193_1;
    long life1_3;
    int life4_19;
    int[] life3_20;
    net.minecraft.client.settings.GameSettings$Options life5_28;
    int life6_49;
    int life7_74;
    lexical_join_288: {
    lexical_join_282: {
    lexical_join_115: {
    life1_3 = (moom.hx.A ^ 46783844097153L);
    this.x = ((java.lang.String)(moom.oO.a(((java.lang.String)(__sourceIntrinsic_7ac46ee229a8_invokedynamic1193_1(591, (2728596093700230482L ^ life1_3)))), ((java.lang.Object[])(new java.lang.Object[0])))));
    ((java.util.List)(((moom.hx)(this)).m)).clear();
    spill1193_0 = moom.LL.b();
    life4_19 = 0;
    life3_20 = spill1193_0;
    lexical_cycle_21: while (true) {
    lexical_join_112: {
    lexical_join_111: {
    lexical_join_100: {
    if (!((life4_19 < (moom.hx.z).length))) {
        break lexical_join_115;
    }
    life5_28 = (moom.hx.z)[life4_19];
    life6_49 = (((((moom.hx)(this)).k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_10(13806, (3848456680607465664L ^ life1_3))) + ((life4_19 % 2) * __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_11(9441, (4400186799162773955L ^ life1_3))));
    life7_74 = (((((moom.hx)(this)).l / __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_13(7761, (3574853050073344879L ^ life1_3))) + (__sourceIntrinsic_7ac46ee229a8_invokedynamic1193_14(10345, (6308201537109646681L ^ life1_3)) * (life4_19 / 2))) - __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_15(15883, (5138952026481281834L ^ life1_3)));
    spill1193_1 = ((net.minecraft.client.settings.GameSettings$Options)(life5_28)).a__Boolean();
    if (!((life3_20 == null))) {
        lexicalValue1193_282_0 = ((spill1193_1) ? 1 : 0);
        break lexical_join_282;
    }
    if (!((life3_20 == null))) {
        lexicalValue1193_111_0 = ((spill1193_1) ? 1 : 0);
        break lexical_join_111;
    }
    if (!((!spill1193_1))) {
        break lexical_join_100;
    }
    ((java.util.List)(((moom.hx)(this)).m)).add(((java.lang.Object)(new moom.gj(((net.minecraft.client.settings.GameSettings$Options)(life5_28)).a__Int(), life6_49, life7_74, life5_28, ((net.minecraft.client.settings.GameSettings)(this.y)).a__String(((net.minecraft.client.settings.GameSettings$Options)(life5_28)))))));
    if (!((life3_20 != null))) {
        break lexical_join_112;
    }
    }
    lexicalValue1193_111_0 = ((((java.util.List)(((moom.hx)(this)).m)).add(((java.lang.Object)(new moom.gl(((net.minecraft.client.settings.GameSettings$Options)(life5_28)).a__Int(), life6_49, life7_74, life5_28))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1193_111_0);
    }
    life4_19 += 1;
    if (!((life3_20 != null))) { continue lexical_cycle_21; }
    break lexical_cycle_21;
    }
    }
    ((java.util.List)(((moom.hx)(this)).m)).add(((java.lang.Object)(new moom.gc(__sourceIntrinsic_7ac46ee229a8_invokedynamic1193_30(20100, (7842916419253943227L ^ life1_3)), ((((moom.hx)(this)).k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_32(15920, (2595685791804345096L ^ life1_3))), (((((moom.hx)(this)).l / __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_34(7761, (3574853050073344879L ^ life1_3))) + __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_35(1837, (378220060301521424L ^ life1_3))) + __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_36(26281, (930558787824980870L ^ life1_3))), __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_37(27534, (7438732118250299063L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_38(27946, (4157928900147157021L ^ life1_3)), moom.JM.a(((java.lang.String)(__sourceIntrinsic_7ac46ee229a8_invokedynamic1193_39(27353, (2807693676465169861L ^ life1_3)))))))));
    ((java.util.List)(((moom.hx)(this)).m)).add(((java.lang.Object)(new moom.gc(__sourceIntrinsic_7ac46ee229a8_invokedynamic1193_43(26522, (6055523847989531296L ^ life1_3)), (((((moom.hx)(this)).k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_45(15920, (2595685791804345096L ^ life1_3))) + __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_46(1927, (2190009795021533871L ^ life1_3))), (((((moom.hx)(this)).l / __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_48(7761, (3574853050073344879L ^ life1_3))) + __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_49(10780, (6405770379738505023L ^ life1_3))) + __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_50(26281, (930558787824980870L ^ life1_3))), __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_51(24297, (4468530416668158940L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_52(1486, (8822162142451822830L ^ life1_3)), moom.JM.a(((java.lang.String)(__sourceIntrinsic_7ac46ee229a8_invokedynamic1193_53(30673, (453020732150855886L ^ life1_3)))))))));
    lexicalValue1193_282_0 = ((((java.util.List)(((moom.hx)(this)).m)).add(((java.lang.Object)(new moom.gi(__sourceIntrinsic_7ac46ee229a8_invokedynamic1193_57(16689, (6396437455999480853L ^ life1_3)), ((((moom.hx)(this)).k / 2) + 5), (((((moom.hx)(this)).l / __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_60(7761, (3574853050073344879L ^ life1_3))) + __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_61(10780, (6405770379738505023L ^ life1_3))) + __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_62(26281, (930558787824980870L ^ life1_3))), moom.oO.a(((java.lang.String)(__sourceIntrinsic_7ac46ee229a8_invokedynamic1193_63(2700, (5862970340536993170L ^ life1_3)))), ((java.lang.Object[])(new java.lang.Object[0])))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1193_282_0);
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break lexical_join_288;
    }
    moom.LL.b(((int[])(new int[3])));
    }
    return;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral7967_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hx"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 9793;
      if (F[var3] == null) {
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
         long var5 = E[var3];
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
         Object[] var9 = (Object[])G.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               G.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/hx", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         F[var3] = var15;
      }

      return F[var3];
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.hx.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7968_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hx"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(int p0, int p1, float p2) {
long local4 = (moom.hx.A ^ 26183037688071L);
    ((moom.hx)(this)).i();
    ((moom.hx)(this)).a(((net.minecraft.client.gui.FontRenderer)(((moom.hx)(this)).p)), ((java.lang.String)(this.x)), ((int)((((moom.hx)(this)).k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1506_5(29320, (7457583872703037992L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1506_6(25612, (1519611360898454684L ^ local4)))));
    super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    return;
}


protected void a__Void(moom.gc p0) {
int forwardValue3611_13_0;
    int forwardValue3611_43_0;
    int forwardValue3611_48_0;
    int forwardValue3611_48_1;
    int forwardValue3611_67_0;
    int forwardValue3611_67_1;
    int forwardValue3611_82_0;
    int forwardValue3611_82_1;
    boolean spill3611_0;
    int spill3611_1;
    int spill3611_2;
    long life2_3;
    int[] life4_5;
    moom.ir life5_126;
    forward_join_102: {
    forward_join_88: {
    forward_join_82: {
    forward_join_75: {
    forward_join_67: {
    forward_join_60: {
    forward_join_48: {
    forward_join_43: {
    forward_join_41: {
    forward_join_13: {
    life2_3 = (moom.hx.A ^ 115451334692192L);
    life4_5 = moom.LL.b();
    spill3611_0 = ((moom.gc)(p0)).m;
    if (!((life4_5 == null))) {
        forwardValue3611_13_0 = ((spill3611_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!(spill3611_0)) {
        break forward_join_102;
    }
    forwardValue3611_13_0 = ((moom.gc)(p0)).l;
    }
    spill3611_1 = __sourceIntrinsic_60da6f6f15c0_invokedynamic3611_5(6651, (6059161472789511485L ^ life2_3));
    if (!((life4_5 == null))) {
        forwardValue3611_48_0 = forwardValue3611_13_0;
        forwardValue3611_48_1 = spill3611_1;
        break forward_join_48;
    }
    if (!((forwardValue3611_13_0 < spill3611_1))) {
        break forward_join_41;
    }
    spill3611_2 = ((p0 instanceof moom.gi) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue3611_43_0 = spill3611_2;
        break forward_join_43;
    }
    if (!((spill3611_2 != 0))) {
        break forward_join_41;
    }
    ((net.minecraft.client.settings.GameSettings)(this.y)).a(((net.minecraft.client.settings.GameSettings$Options)(((moom.gi)(((moom.gi)(p0)))).b())), ((int)(1)));
    ((moom.gc)(p0)).k = ((java.lang.String)(((net.minecraft.client.settings.GameSettings)(this.y)).a__String(((net.minecraft.client.settings.GameSettings$Options)(net.minecraft.client.settings.GameSettings$Options.a(((int)(((moom.gc)(p0)).l))))))));
    }
    forwardValue3611_43_0 = ((moom.gc)(p0)).l;
    }
    forwardValue3611_48_0 = forwardValue3611_43_0;
    forwardValue3611_48_1 = __sourceIntrinsic_60da6f6f15c0_invokedynamic3611_17(16689, (6396508356726072820L ^ life2_3));
    }
    if (!((life4_5 == null))) {
        forwardValue3611_67_0 = forwardValue3611_48_0;
        forwardValue3611_67_1 = forwardValue3611_48_1;
        break forward_join_67;
    }
    if (!((forwardValue3611_48_0 == forwardValue3611_48_1))) {
        break forward_join_60;
    }
    ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(((moom.hx)(this)).i)).W)).b();
    ((net.minecraft.client.Minecraft)(((moom.hx)(this)).i)).a(((net.minecraft.client.gui.GuiScreen)(this.w)));
    }
    forwardValue3611_67_0 = ((moom.gc)(p0)).l;
    forwardValue3611_67_1 = __sourceIntrinsic_60da6f6f15c0_invokedynamic3611_25(18845, (1338489513020304747L ^ life2_3));
    }
    if (!((life4_5 == null))) {
        forwardValue3611_82_0 = forwardValue3611_67_0;
        forwardValue3611_82_1 = forwardValue3611_67_1;
        break forward_join_82;
    }
    if (!((forwardValue3611_67_0 == forwardValue3611_67_1))) {
        break forward_join_75;
    }
    ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(((moom.hx)(this)).i)).W)).a(((boolean)(true)));
    }
    forwardValue3611_82_0 = ((moom.gc)(p0)).l;
    forwardValue3611_82_1 = __sourceIntrinsic_60da6f6f15c0_invokedynamic3611_30(1926, (6770505280301785939L ^ life2_3));
    }
    if (!((forwardValue3611_82_0 == forwardValue3611_82_1))) {
        break forward_join_88;
    }
    ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(((moom.hx)(this)).i)).W)).a(((boolean)(false)));
    }
    life5_126 = new moom.ir(((moom.hx)(this)).i);
    ((moom.hx)(this)).a(((net.minecraft.client.Minecraft)(((moom.hx)(this)).i)), ((int)(((moom.ir)(life5_126)).a__Int())), ((int)(((moom.ir)(life5_126)).b__Int())));
    }
    return;
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
        byte[] spill4187_0 = p0;
        life4_9 += 1;
        life5_44 = (spill4187_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill4187_1 = p0;
        life4_9 += 1;
        life5_76 = (spill4187_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill4187_2 = p0;
        life4_9 += 1;
        life5_91 = (spill4187_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.hx.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 7275);
    if (((moom.hx.C)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.hx.D)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.hx.D)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/hx", life9_51);
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
        life9_116 = ((java.lang.String)((moom.hx.B)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.hx.C)[life5_8] = moom.hx.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.hx.C)[life5_8];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite870_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite870_106(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite870_108(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite870_110(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite870_112(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite870_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite870_116(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite870_118(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite870_120(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite870_122(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite870_124(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite870_126(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite870_128(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_38(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_52(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_62(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_invokedynamic1193_63(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral7967_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7968_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1506_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1506_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60da6f6f15c0_invokedynamic3611_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60da6f6f15c0_invokedynamic3611_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60da6f6f15c0_invokedynamic3611_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60da6f6f15c0_invokedynamic3611_30(int a0, long a1) throws E;
}
