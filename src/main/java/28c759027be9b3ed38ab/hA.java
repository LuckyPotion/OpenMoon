package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class hA extends net.minecraft.client.gui.GuiScreen implements net.minecraft.client.gui.GuiYesNoCallback {

private final net.minecraft.client.gui.GuiScreen w;

protected java.lang.String x;

private final net.minecraft.client.settings.GameSettings y;

private static final net.minecraft.client.settings.GameSettings$Options[] z;

private final moom.LI A;

private static final long B;

private static final java.lang.String[] C;

private static final java.lang.String[] D;

private static final java.util.Map E;

private static final long[] F;

private static final java.lang.Integer[] G;

private static final java.util.Map H;

public hA(net.minecraft.client.gui.GuiScreen p0, net.minecraft.client.settings.GameSettings p1) {
super();
    this.A = new moom.LI(this, new moom.LL());
    this.w = p0;
    this.y = p1;
}


static {
B = ((long)(((moom._a)(moom._c.a(((long)(-7654483698103719169L)), ((long)(-6699763084156126448L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(201535280669548L)))));
    long local20_life6 = (moom.hA.B ^ 6410822559354L);
    E = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life9;
    javax.crypto.Cipher __sourceSpill858_11 = (local11_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill858_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill858_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill858_14 = new byte[8];
    (__sourceSpill858_14)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local12_life15 = 1;
    while ((local12_life15 < 8)) {
        (__sourceSpill858_14)[local12_life15] = ((byte) ((int) ((local20_life6 << (local12_life15 * 8)) >>> 56)));
        local12_life15 += 1;
    }
    byte[] __sourcePreallocation858_16 = __sourceSpill858_14;
    ((javax.crypto.Cipher)(__sourceSpill858_11)).init(((int)(__sourceSpill858_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill858_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation858_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local18_life19 = new java.lang.String[4];
    int local16_life20 = 0;
    java.lang.String local15_life21;
    int local17_life23 = ((java.lang.String)((local15_life21 = "gó§óneáHÜØÛö½\017oxb2¾¼ÞÇ±-W_\037\023YÀL((;\017AäÌ'À¯uBÑA\n%ßb9µ\027[??áÙ×Ãà,¶ÀÅ\033I"))).length();
    int local14_life24 = 32;
    int local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill858_28 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill858_29 = local11_life9;
        byte[] local19_life31 = ((javax.crypto.Cipher)(__sourceSpill858_29)).doFinal(((byte[])(__sourceSpill858_28)));
        java.lang.String __sourceSpill858_34 = ((java.lang.String)(moom.hA.a(((byte[])(local19_life31))))).intern();
        java.lang.String[] __sourceSpill858_35 = local18_life19;
        int __sourceSpill858_36 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill858_35)[__sourceSpill858_36] = __sourceSpill858_34;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    local17_life23 = ((java.lang.String)((local15_life21 = "(Ë_êò|U{ó\035Y\005ÅÙ\020Û=8rÒ@_ìÖÕí\000S\024ÅxÇñZåI(A\022`d:yàÀ§ºE\036{D3æÝó»Ìp}-ùLkDwÆü¸UYu"))).length();
    local14_life24 = 40;
    local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill858_41 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill858_42 = local11_life9;
        byte[] local19_life44 = ((javax.crypto.Cipher)(__sourceSpill858_42)).doFinal(((byte[])(__sourceSpill858_41)));
        java.lang.String __sourceSpill858_47 = ((java.lang.String)(moom.hA.a(((byte[])(local19_life44))))).intern();
        java.lang.String[] __sourceSpill858_48 = local18_life19;
        int __sourceSpill858_49 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill858_48)[__sourceSpill858_49] = __sourceSpill858_47;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    C = ((java.lang.String[])(local18_life19));
    D = ((java.lang.String[])(new java.lang.String[4]));
    H = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill858_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill858_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill858_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill858_60 = new byte[8];
    (__sourceSpill858_60)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill858_60)[local1_life61] = ((byte) ((int) ((local20_life6 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation858_62 = __sourceSpill858_60;
    ((javax.crypto.Cipher)(__sourceSpill858_57)).init(((int)(__sourceSpill858_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill858_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation858_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[25];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "Ü1gv5LAªûÈWý£ªöÛBÇY\002E|RnÁh\022\024âF­]nº\177àR&\034ÈâÔ*\036\004@\nâ¸ À¬.uP,¯ôóÍG£úÿÀ\177\030¯e\032yoÁ\030\017\024g£\005\002®òó½\031Ð¼ñ:8\"\b=³X\026Ý{\nWö½Ô8Fo\024Òí\031£Ø\024HK*&*~`\n\023`\023ï©\024¤ÞTªÿKGÖ§±\0322ÄoÀ2ªîÇºú%\020L\01702\000¿õsÇ´ÔÁ>7)Eh"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill858_71 = local4_life67;
        int __sourceSpill858_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill858_71)).substring(((int)(__sourceSpill858_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill858_76 = local6_life65;
        int __sourceSpill858_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill858_79 = new byte[8];
        (__sourceSpill858_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill858_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill858_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill858_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill858_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill858_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill858_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill858_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill858_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill858_80)).doFinal(((byte[])(__sourceSpill858_79)));
        (__sourceSpill858_76)[__sourceSpill858_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "ÙÕ&(QN\022¿@ù\004"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill858_84 = local4_life67;
        int __sourceSpill858_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill858_84)).substring(((int)(__sourceSpill858_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill858_89 = local6_life65;
        int __sourceSpill858_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill858_92 = new byte[8];
        (__sourceSpill858_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill858_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill858_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill858_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill858_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill858_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill858_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill858_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill858_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill858_93)).doFinal(((byte[])(__sourceSpill858_92)));
        (__sourceSpill858_89)[__sourceSpill858_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    F = ((long[])(local6_life65));
    G = ((java.lang.Integer[])(new java.lang.Integer[25]));
    net.minecraft.client.settings.GameSettings$Options[] __sourceSpill858_100 = new net.minecraft.client.settings.GameSettings$Options[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite858_98(25953, (5129065517697404116L ^ local20_life6))];
    (__sourceSpill858_100)[0] = net.minecraft.client.settings.GameSettings$Options.LAGOMETER;
    (__sourceSpill858_100)[1] = net.minecraft.client.settings.GameSettings$Options.PROFILER;
    (__sourceSpill858_100)[2] = net.minecraft.client.settings.GameSettings$Options.SHOW_FPS;
    (__sourceSpill858_100)[3] = net.minecraft.client.settings.GameSettings$Options.ADVANCED_TOOLTIPS;
    (__sourceSpill858_100)[4] = net.minecraft.client.settings.GameSettings$Options.WEATHER;
    (__sourceSpill858_100)[5] = net.minecraft.client.settings.GameSettings$Options.TIME;
    (__sourceSpill858_100)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite858_106(22130, (9121282870966992856L ^ local20_life6))] = net.minecraft.client.settings.GameSettings$Options.USE_FULLSCREEN;
    (__sourceSpill858_100)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite858_108(9108, (7318575736868424249L ^ local20_life6))] = net.minecraft.client.settings.GameSettings$Options.FULLSCREEN_MODE;
    (__sourceSpill858_100)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite858_110(14960, (2387686184111756241L ^ local20_life6))] = net.minecraft.client.settings.GameSettings$Options.ANAGLYPH;
    (__sourceSpill858_100)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite858_112(21761, (5013113206741875877L ^ local20_life6))] = net.minecraft.client.settings.GameSettings$Options.AUTOSAVE_TICKS;
    (__sourceSpill858_100)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite858_114(11176, (4584928258619916810L ^ local20_life6))] = net.minecraft.client.settings.GameSettings$Options.SCREENSHOT_SIZE;
    (__sourceSpill858_100)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite858_116(2449, (3685485473252630585L ^ local20_life6))] = net.minecraft.client.settings.GameSettings$Options.SHOW_GL_ERRORS;
    z = ((net.minecraft.client.settings.GameSettings$Options[])(__sourceSpill858_100));
}


public void c__Void() {
int lexicalValue1183_111_0;
    int lexicalValue1183_220_0;
    int[] spill1183_0;
    boolean spill1183_1;
    long life1_3;
    int[] life3_18;
    int life4_20;
    net.minecraft.client.settings.GameSettings$Options life5_28;
    int life6_49;
    int life7_74;
    lexical_join_220: {
    lexical_join_115: {
    life1_3 = (moom.hA.B ^ 27989217223179L);
    spill1183_0 = moom.LL.b();
    this.x = ((java.lang.String)(moom.oO.a(((java.lang.String)(__sourceIntrinsic_7ac46ee229a8_invokedynamic1183_2(13546, (3672979012419872383L ^ life1_3)))), ((java.lang.Object[])(new java.lang.Object[0])))));
    ((java.util.List)(((moom.hA)(this)).m)).clear();
    life3_18 = spill1183_0;
    life4_20 = 0;
    lexical_cycle_21: while (true) {
    lexical_join_112: {
    lexical_join_111: {
    lexical_join_100: {
    if (!((life4_20 < (moom.hA.z).length))) {
        break lexical_join_115;
    }
    life5_28 = (moom.hA.z)[life4_20];
    life6_49 = (((((moom.hA)(this)).k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic1183_10(24786, (2846049144317742355L ^ life1_3))) + ((life4_20 % 2) * __sourceIntrinsic_7ac46ee229a8_invokedynamic1183_11(28931, (3520540617207979220L ^ life1_3))));
    life7_74 = (((((moom.hA)(this)).l / __sourceIntrinsic_7ac46ee229a8_invokedynamic1183_13(32134, (8668937243001622615L ^ life1_3))) + (__sourceIntrinsic_7ac46ee229a8_invokedynamic1183_14(10683, (3977753540346954873L ^ life1_3)) * (life4_20 / 2))) - __sourceIntrinsic_7ac46ee229a8_invokedynamic1183_15(14524, (4637843194091656550L ^ life1_3)));
    spill1183_1 = ((net.minecraft.client.settings.GameSettings$Options)(life5_28)).a__Boolean();
    if (!((life3_18 == null))) {
        lexicalValue1183_220_0 = ((spill1183_1) ? 1 : 0);
        break lexical_join_220;
    }
    if (!((life3_18 == null))) {
        lexicalValue1183_111_0 = ((spill1183_1) ? 1 : 0);
        break lexical_join_111;
    }
    if (!((!spill1183_1))) {
        break lexical_join_100;
    }
    ((java.util.List)(((moom.hA)(this)).m)).add(((java.lang.Object)(new moom.gj(((net.minecraft.client.settings.GameSettings$Options)(life5_28)).a__Int(), life6_49, life7_74, life5_28, ((net.minecraft.client.settings.GameSettings)(this.y)).a__String(((net.minecraft.client.settings.GameSettings$Options)(life5_28)))))));
    if (!((life3_18 != null))) {
        break lexical_join_112;
    }
    }
    lexicalValue1183_111_0 = ((((java.util.List)(((moom.hA)(this)).m)).add(((java.lang.Object)(new moom.gl(((net.minecraft.client.settings.GameSettings$Options)(life5_28)).a__Int(), life6_49, life7_74, life5_28))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1183_111_0);
    }
    life4_20 += 1;
    if (!((life3_18 != null))) { continue lexical_cycle_21; }
    break lexical_cycle_21;
    }
    }
    ((java.util.List)(((moom.hA)(this)).m)).add(((java.lang.Object)(new moom.gc(__sourceIntrinsic_7ac46ee229a8_invokedynamic1183_30(3801, (3727571045438907143L ^ life1_3)), ((((moom.hA)(this)).k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic1183_32(30200, (2975724160897357870L ^ life1_3))), ((((((moom.hA)(this)).l / __sourceIntrinsic_7ac46ee229a8_invokedynamic1183_34(32134, (8668937243001622615L ^ life1_3))) + __sourceIntrinsic_7ac46ee229a8_invokedynamic1183_35(19624, (3146440151655555450L ^ life1_3))) + __sourceIntrinsic_7ac46ee229a8_invokedynamic1183_36(9575, (5485781257047263418L ^ life1_3))) - __sourceIntrinsic_7ac46ee229a8_invokedynamic1183_37(17675, (3349679969729390795L ^ life1_3))), moom.oO.a(((java.lang.String)(__sourceIntrinsic_7ac46ee229a8_invokedynamic1183_38(2606, (6444741063353260216L ^ life1_3)))), ((java.lang.Object[])(new java.lang.Object[0])))))));
    lexicalValue1183_220_0 = ((((java.util.List)(((moom.hA)(this)).m)).add(((java.lang.Object)(new moom.gc(__sourceIntrinsic_7ac46ee229a8_invokedynamic1183_42(5804, (874558895433415529L ^ life1_3)), ((((moom.hA)(this)).k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic1183_44(4061, (4821802962123055636L ^ life1_3))), (((((moom.hA)(this)).l / __sourceIntrinsic_7ac46ee229a8_invokedynamic1183_46(32134, (8668937243001622615L ^ life1_3))) + __sourceIntrinsic_7ac46ee229a8_invokedynamic1183_47(22758, (7446388190228919589L ^ life1_3))) + __sourceIntrinsic_7ac46ee229a8_invokedynamic1183_48(9575, (5485781257047263418L ^ life1_3))), moom.oO.a(((java.lang.String)(__sourceIntrinsic_7ac46ee229a8_invokedynamic1183_49(4559, (1742823351381508955L ^ life1_3)))), ((java.lang.Object[])(new java.lang.Object[0])))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1183_220_0);
    return;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 16038;
      if (G[var3] == null) {
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
         long var5 = F[var3];
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
         Object[] var9 = (Object[])H.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               H.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/hA", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         G[var3] = var15;
      }

      return G[var3];
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral7818_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hA"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.hA.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7819_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hA"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(boolean p0, int p1) {
long local3 = (moom.hA.B ^ 84582550841060L);
    int[] local5 = moom.LL.b();
    if ((local5 == null)) {
        if ((__sourceIntrinsic_booleanComparison(p0) != 0)) {
        ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(((moom.hA)(this)).i)).W)).g();
    }
        ((net.minecraft.client.Minecraft)(((moom.hA)(this)).i)).a(((net.minecraft.client.gui.GuiScreen)(this)));
    }
    return;
}


protected void a__Void(moom.gc p0) {
int forwardValue3586_13_0;
    int forwardValue3586_43_0;
    int forwardValue3586_48_0;
    int forwardValue3586_48_1;
    int forwardValue3586_67_0;
    int forwardValue3586_67_1;
    boolean spill3586_0;
    int spill3586_1;
    int spill3586_2;
    long life2_3;
    int[] life4_5;
    moom.hb life5_114;
    forward_join_95: {
    forward_join_67: {
    forward_join_60: {
    forward_join_48: {
    forward_join_43: {
    forward_join_41: {
    forward_join_13: {
    life2_3 = (moom.hA.B ^ 100023664260074L);
    life4_5 = moom.LL.b();
    spill3586_0 = ((moom.gc)(p0)).m;
    if (!((life4_5 == null))) {
        forwardValue3586_13_0 = ((spill3586_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!(spill3586_0)) {
        break forward_join_95;
    }
    forwardValue3586_13_0 = ((moom.gc)(p0)).l;
    }
    spill3586_1 = __sourceIntrinsic_60da6f6f15c0_invokedynamic3586_5(871, (9002506230567534430L ^ life2_3));
    if (!((life4_5 == null))) {
        forwardValue3586_48_0 = forwardValue3586_13_0;
        forwardValue3586_48_1 = spill3586_1;
        break forward_join_48;
    }
    if (!((forwardValue3586_13_0 < spill3586_1))) {
        break forward_join_41;
    }
    spill3586_2 = ((p0 instanceof moom.gi) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue3586_43_0 = spill3586_2;
        break forward_join_43;
    }
    if (!((spill3586_2 != 0))) {
        break forward_join_41;
    }
    ((net.minecraft.client.settings.GameSettings)(this.y)).a(((net.minecraft.client.settings.GameSettings$Options)(((moom.gi)(((moom.gi)(p0)))).b())), ((int)(1)));
    ((moom.gc)(p0)).k = ((java.lang.String)(((net.minecraft.client.settings.GameSettings)(this.y)).a__String(((net.minecraft.client.settings.GameSettings$Options)(net.minecraft.client.settings.GameSettings$Options.a(((int)(((moom.gc)(p0)).l))))))));
    }
    forwardValue3586_43_0 = ((moom.gc)(p0)).l;
    }
    forwardValue3586_48_0 = forwardValue3586_43_0;
    forwardValue3586_48_1 = __sourceIntrinsic_60da6f6f15c0_invokedynamic3586_17(871, (9002506230567534430L ^ life2_3));
    }
    if (!((life4_5 == null))) {
        forwardValue3586_67_0 = forwardValue3586_48_0;
        forwardValue3586_67_1 = forwardValue3586_48_1;
        break forward_join_67;
    }
    if (!((forwardValue3586_48_0 == forwardValue3586_48_1))) {
        break forward_join_60;
    }
    ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(((moom.hA)(this)).i)).W)).b();
    ((net.minecraft.client.Minecraft)(((moom.hA)(this)).i)).a(((net.minecraft.client.gui.GuiScreen)(this.w)));
    }
    forwardValue3586_67_0 = ((moom.gc)(p0)).l;
    forwardValue3586_67_1 = __sourceIntrinsic_60da6f6f15c0_invokedynamic3586_25(30925, (3773771772410823923L ^ life2_3));
    }
    if (!((forwardValue3586_67_0 == forwardValue3586_67_1))) {
        break forward_join_95;
    }
    ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(((moom.hA)(this)).i)).W)).b();
    life5_114 = new moom.hb(this, moom.oO.a(((java.lang.String)(__sourceIntrinsic_60da6f6f15c0_invokedynamic3586_29(4436, (6214176524527456802L ^ life2_3)))), ((java.lang.Object[])(new java.lang.Object[0]))), "", __sourceIntrinsic_60da6f6f15c0_invokedynamic3586_31(10072, (398242338896894847L ^ life2_3)));
    ((net.minecraft.client.Minecraft)(((moom.hA)(this)).i)).a(((net.minecraft.client.gui.GuiScreen)(life5_114)));
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
        byte[] spill4155_0 = p0;
        life4_9 += 1;
        life5_44 = (spill4155_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill4155_1 = p0;
        life4_9 += 1;
        life5_76 = (spill4155_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill4155_2 = p0;
        life4_9 += 1;
        life5_91 = (spill4155_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(int p0, int p1, float p2) {
long local4 = (moom.hA.B ^ 39755284227981L);
    ((moom.hA)(this)).i();
    ((moom.hA)(this)).a(((net.minecraft.client.gui.FontRenderer)(((moom.hA)(this)).p)), ((java.lang.String)(this.x)), ((int)((((moom.hA)(this)).k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1481_5(4741, (3861173031594162884L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1481_6(23103, (7430862880843182701L ^ local4)))));
    super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    ((moom.LI)(this.A)).a(((int)(p0)), ((int)(p1)), ((java.util.List)(((moom.hA)(this)).m)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 483);
    if (((moom.hA.D)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.hA.E)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.hA.E)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/hA", life9_51);
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
        life9_116 = ((java.lang.String)((moom.hA.C)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.hA.D)[life5_8] = moom.hA.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.hA.D)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.hA.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite858_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite858_106(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite858_108(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite858_110(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite858_112(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite858_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite858_116(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_invokedynamic1183_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1183_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1183_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1183_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1183_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1183_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1183_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1183_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1183_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1183_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1183_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1183_37(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_invokedynamic1183_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1183_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1183_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1183_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1183_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1183_48(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_invokedynamic1183_49(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral7818_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7819_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60da6f6f15c0_invokedynamic3586_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60da6f6f15c0_invokedynamic3586_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60da6f6f15c0_invokedynamic3586_25(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_60da6f6f15c0_invokedynamic3586_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60da6f6f15c0_invokedynamic3586_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1481_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1481_6(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
