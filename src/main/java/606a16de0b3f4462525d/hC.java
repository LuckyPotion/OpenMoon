package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class hC extends net.minecraft.client.gui.GuiScreen {

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

public hC(net.minecraft.client.gui.GuiScreen p0, net.minecraft.client.settings.GameSettings p1) {
super();
    this.A = new moom.LI(this, new moom.LL());
    this.w = p0;
    this.y = p1;
}


static {
B = ((long)(((moom._a)(moom._c.a(((long)(2215485182305293820L)), ((long)(-1733512044853269264L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(183471720020435L)))));
    long local20_life6 = (moom.hC.B ^ 18105208850957L);
    E = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life9;
    javax.crypto.Cipher __sourceSpill860_11 = (local11_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill860_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill860_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill860_14 = new byte[8];
    (__sourceSpill860_14)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local12_life15 = 1;
    while ((local12_life15 < 8)) {
        (__sourceSpill860_14)[local12_life15] = ((byte) ((int) ((local20_life6 << (local12_life15 * 8)) >>> 56)));
        local12_life15 += 1;
    }
    byte[] __sourcePreallocation860_16 = __sourceSpill860_14;
    ((javax.crypto.Cipher)(__sourceSpill860_11)).init(((int)(__sourceSpill860_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill860_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation860_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local18_life19 = new java.lang.String[2];
    int local16_life20 = 0;
    java.lang.String local15_life21;
    int local17_life23 = ((java.lang.String)((local15_life21 = "\026à\022ÛqÒNøI³\t¿×\022 i\027åBé­Gt°ÜÈ@D£výIä\030ñúÜÙJ1GÂñÏþ«®öè\001p\020à"))).length();
    int local14_life24 = 40;
    int local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill860_28 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill860_29 = local11_life9;
        byte[] local19_life31 = ((javax.crypto.Cipher)(__sourceSpill860_29)).doFinal(((byte[])(__sourceSpill860_28)));
        java.lang.String __sourceSpill860_34 = ((java.lang.String)(moom.hC.a(((byte[])(local19_life31))))).intern();
        java.lang.String[] __sourceSpill860_35 = local18_life19;
        int __sourceSpill860_36 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill860_35)[__sourceSpill860_36] = __sourceSpill860_34;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    C = ((java.lang.String[])(local18_life19));
    D = ((java.lang.String[])(new java.lang.String[2]));
    H = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life42;
    javax.crypto.Cipher __sourceSpill860_44 = (local0_life42 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill860_45 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill860_46 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill860_47 = new byte[8];
    (__sourceSpill860_47)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life48 = 1;
    while ((local1_life48 < 8)) {
        (__sourceSpill860_47)[local1_life48] = ((byte) ((int) ((local20_life6 << (local1_life48 * 8)) >>> 56)));
        local1_life48 += 1;
    }
    byte[] __sourcePreallocation860_49 = __sourceSpill860_47;
    ((javax.crypto.Cipher)(__sourceSpill860_44)).init(((int)(__sourceSpill860_45)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill860_46)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation860_49)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life52 = new long[24];
    int local3_life53 = 0;
    java.lang.String local4_life54;
    int local5_life56 = ((java.lang.String)((local4_life54 = "\0222Ú÷o)4\030##ær·x½;¯ æfUÉÝ£g\006\002ñ·ë?»½¥ACúP\tst§´Ãx1ê2-\003\0030È\001y?\022U]zôpMÙ\tþ¶B\031\0061][*\036Ü\006Îm¬\032b\fÜM¢`°ç¦×ÁcEÇCó2áÏX¾¾T/þË æ_Z*°Õ§xM0wx;/\rú(y$ßì\013\"pefÃE3ì¼.Û\000ÖE\026ï*n³\003µªÐåg>½"))).length();
    int local2_life57 = 0;
    do {
        java.lang.String __sourceSpill860_58 = local4_life54;
        int __sourceSpill860_59 = local2_life57;
        local2_life57 += 8;
        byte[] local7_life62 = ((java.lang.String)(((java.lang.String)(__sourceSpill860_58)).substring(((int)(__sourceSpill860_59)), ((int)(local2_life57))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill860_63 = local6_life52;
        int __sourceSpill860_64 = local3_life53;
        local3_life53 += 1;
        long local8_life65 = (((((((((((long) (local7_life62)[0]) & 255L) << 56) | ((((long) (local7_life62)[1]) & 255L) << 48)) | ((((long) (local7_life62)[2]) & 255L) << 40)) | ((((long) (local7_life62)[3]) & 255L) << 32)) | ((((long) (local7_life62)[4]) & 255L) << 24)) | ((((long) (local7_life62)[5]) & 255L) << 16)) | ((((long) (local7_life62)[6]) & 255L) << 8)) | (((long) (local7_life62)[7]) & 255L));
        byte[] __sourceSpill860_66 = new byte[8];
        (__sourceSpill860_66)[0] = ((byte) ((int) (local8_life65 >>> 56)));
        (__sourceSpill860_66)[1] = ((byte) ((int) (local8_life65 >>> 48)));
        (__sourceSpill860_66)[2] = ((byte) ((int) (local8_life65 >>> 40)));
        (__sourceSpill860_66)[3] = ((byte) ((int) (local8_life65 >>> 32)));
        (__sourceSpill860_66)[4] = ((byte) ((int) (local8_life65 >>> 24)));
        (__sourceSpill860_66)[5] = ((byte) ((int) (local8_life65 >>> 16)));
        (__sourceSpill860_66)[6] = ((byte) ((int) (local8_life65 >>> 8)));
        (__sourceSpill860_66)[7] = ((byte) ((int) local8_life65));
        javax.crypto.Cipher __sourceSpill860_67 = local0_life42;
        byte[] local10_life69 = ((javax.crypto.Cipher)(__sourceSpill860_67)).doFinal(((byte[])(__sourceSpill860_66)));
        (__sourceSpill860_63)[__sourceSpill860_64] = (((((((((((long) (local10_life69)[0]) & 255L) << 56) | ((((long) (local10_life69)[1]) & 255L) << 48)) | ((((long) (local10_life69)[2]) & 255L) << 40)) | ((((long) (local10_life69)[3]) & 255L) << 32)) | ((((long) (local10_life69)[4]) & 255L) << 24)) | ((((long) (local10_life69)[5]) & 255L) << 16)) | ((((long) (local10_life69)[6]) & 255L) << 8)) | (((long) (local10_life69)[7]) & 255L));
    } while ((!(local2_life57 >= local5_life56)));
    local5_life56 = ((java.lang.String)((local4_life54 = "\030|Ha\003Ð\026\027¬sÁÏ!²Û"))).length();
    local2_life57 = 0;
    do {
        java.lang.String __sourceSpill860_71 = local4_life54;
        int __sourceSpill860_72 = local2_life57;
        local2_life57 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill860_71)).substring(((int)(__sourceSpill860_72)), ((int)(local2_life57))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill860_76 = local6_life52;
        int __sourceSpill860_77 = local3_life53;
        local3_life53 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill860_79 = new byte[8];
        (__sourceSpill860_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill860_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill860_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill860_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill860_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill860_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill860_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill860_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill860_80 = local0_life42;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill860_80)).doFinal(((byte[])(__sourceSpill860_79)));
        (__sourceSpill860_76)[__sourceSpill860_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life57 >= local5_life56)));
    F = ((long[])(local6_life52));
    G = ((java.lang.Integer[])(new java.lang.Integer[24]));
    net.minecraft.client.settings.GameSettings$Options[] __sourceSpill860_87 = new net.minecraft.client.settings.GameSettings$Options[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite860_85(11787, (6014129429624746146L ^ local20_life6))];
    (__sourceSpill860_87)[0] = net.minecraft.client.settings.GameSettings$Options.MIPMAP_LEVELS;
    (__sourceSpill860_87)[1] = net.minecraft.client.settings.GameSettings$Options.MIPMAP_TYPE;
    (__sourceSpill860_87)[2] = net.minecraft.client.settings.GameSettings$Options.AF_LEVEL;
    (__sourceSpill860_87)[3] = net.minecraft.client.settings.GameSettings$Options.AA_LEVEL;
    (__sourceSpill860_87)[4] = net.minecraft.client.settings.GameSettings$Options.CLEAR_WATER;
    (__sourceSpill860_87)[5] = net.minecraft.client.settings.GameSettings$Options.RANDOM_ENTITIES;
    (__sourceSpill860_87)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite860_93(27741, (3445983210735383280L ^ local20_life6))] = net.minecraft.client.settings.GameSettings$Options.BETTER_GRASS;
    (__sourceSpill860_87)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite860_95(32128, (4017261097912312609L ^ local20_life6))] = net.minecraft.client.settings.GameSettings$Options.BETTER_SNOW;
    (__sourceSpill860_87)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite860_97(26289, (7791621111299913743L ^ local20_life6))] = net.minecraft.client.settings.GameSettings$Options.CUSTOM_FONTS;
    (__sourceSpill860_87)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite860_99(9168, (5007001175931256176L ^ local20_life6))] = net.minecraft.client.settings.GameSettings$Options.CUSTOM_COLORS;
    (__sourceSpill860_87)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite860_101(30997, (6970575747719210927L ^ local20_life6))] = net.minecraft.client.settings.GameSettings$Options.CONNECTED_TEXTURES;
    (__sourceSpill860_87)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite860_103(13725, (2120659566597172017L ^ local20_life6))] = net.minecraft.client.settings.GameSettings$Options.NATURAL_TEXTURES;
    (__sourceSpill860_87)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite860_105(13318, (4663329415317154467L ^ local20_life6))] = net.minecraft.client.settings.GameSettings$Options.CUSTOM_SKY;
    (__sourceSpill860_87)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite860_107(31233, (6126477889032103079L ^ local20_life6))] = net.minecraft.client.settings.GameSettings$Options.CUSTOM_ITEMS;
    (__sourceSpill860_87)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite860_109(3859, (2023796374986379707L ^ local20_life6))] = net.minecraft.client.settings.GameSettings$Options.CUSTOM_ENTITY_MODELS;
    (__sourceSpill860_87)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite860_111(12969, (9050594816860449809L ^ local20_life6))] = net.minecraft.client.settings.GameSettings$Options.CUSTOM_GUIS;
    (__sourceSpill860_87)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite860_113(842, (5673650055834394101L ^ local20_life6))] = net.minecraft.client.settings.GameSettings$Options.EMISSIVE_TEXTURES;
    z = ((net.minecraft.client.settings.GameSettings$Options[])(__sourceSpill860_87));
}


public void c__Void() {
int lexicalValue1185_111_0;
    int lexicalValue1185_164_0;
    int[] spill1185_0;
    boolean spill1185_1;
    long life1_3;
    int[] life3_18;
    int life4_20;
    net.minecraft.client.settings.GameSettings$Options life5_28;
    int life6_49;
    int life7_74;
    lexical_join_164: {
    lexical_join_115: {
    life1_3 = (moom.hC.B ^ 138707429090871L);
    spill1185_0 = moom.LL.b();
    this.x = ((java.lang.String)(moom.oO.a(((java.lang.String)(__sourceIntrinsic_7ac46ee229a8_invokedynamic1185_2(32177, (1890764035291866504L ^ life1_3)))), ((java.lang.Object[])(new java.lang.Object[0])))));
    ((java.util.List)(((moom.hC)(this)).m)).clear();
    life3_18 = spill1185_0;
    life4_20 = 0;
    lexical_cycle_21: while (true) {
    lexical_join_112: {
    lexical_join_111: {
    lexical_join_100: {
    if (!((life4_20 < (moom.hC.z).length))) {
        break lexical_join_115;
    }
    life5_28 = (moom.hC.z)[life4_20];
    life6_49 = (((((moom.hC)(this)).k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic1185_10(22883, (2051236954292890614L ^ life1_3))) + ((life4_20 % 2) * __sourceIntrinsic_7ac46ee229a8_invokedynamic1185_11(18022, (3883958705804981479L ^ life1_3))));
    life7_74 = (((((moom.hC)(this)).l / __sourceIntrinsic_7ac46ee229a8_invokedynamic1185_13(1828, (6057353595557803445L ^ life1_3))) + (__sourceIntrinsic_7ac46ee229a8_invokedynamic1185_14(14953, (7892574874130532599L ^ life1_3)) * (life4_20 / 2))) - __sourceIntrinsic_7ac46ee229a8_invokedynamic1185_15(14803, (3872899690563849045L ^ life1_3)));
    spill1185_1 = ((net.minecraft.client.settings.GameSettings$Options)(life5_28)).a__Boolean();
    if (!((life3_18 == null))) {
        lexicalValue1185_164_0 = ((spill1185_1) ? 1 : 0);
        break lexical_join_164;
    }
    if (!((life3_18 == null))) {
        lexicalValue1185_111_0 = ((spill1185_1) ? 1 : 0);
        break lexical_join_111;
    }
    if (!((!spill1185_1))) {
        break lexical_join_100;
    }
    ((java.util.List)(((moom.hC)(this)).m)).add(((java.lang.Object)(new moom.gj(((net.minecraft.client.settings.GameSettings$Options)(life5_28)).a__Int(), life6_49, life7_74, life5_28, ((net.minecraft.client.settings.GameSettings)(this.y)).a__String(((net.minecraft.client.settings.GameSettings$Options)(life5_28)))))));
    if (!((life3_18 != null))) {
        break lexical_join_112;
    }
    }
    lexicalValue1185_111_0 = ((((java.util.List)(((moom.hC)(this)).m)).add(((java.lang.Object)(new moom.gl(((net.minecraft.client.settings.GameSettings$Options)(life5_28)).a__Int(), life6_49, life7_74, life5_28))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1185_111_0);
    }
    life4_20 += 1;
    if (!((life3_18 != null))) { continue lexical_cycle_21; }
    break lexical_cycle_21;
    }
    }
    lexicalValue1185_164_0 = ((((java.util.List)(((moom.hC)(this)).m)).add(((java.lang.Object)(new moom.gc(__sourceIntrinsic_7ac46ee229a8_invokedynamic1185_30(2936, (4473233529165150693L ^ life1_3)), ((((moom.hC)(this)).k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic1185_32(21692, (4843254669012739620L ^ life1_3))), (((((moom.hC)(this)).l / __sourceIntrinsic_7ac46ee229a8_invokedynamic1185_34(27741, (3446090618782392010L ^ life1_3))) + __sourceIntrinsic_7ac46ee229a8_invokedynamic1185_35(30473, (5330932497828447645L ^ life1_3))) + __sourceIntrinsic_7ac46ee229a8_invokedynamic1185_36(30675, (1067583820661523786L ^ life1_3))), moom.oO.a(((java.lang.String)(__sourceIntrinsic_7ac46ee229a8_invokedynamic1185_37(24735, (5200892040756426919L ^ life1_3)))), ((java.lang.Object[])(new java.lang.Object[0])))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1185_164_0);
    return;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral7830_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hC"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 8678;
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
            throw new RuntimeException("moom/hC", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         G[var3] = var15;
      }

      return G[var3];
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.hC.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7831_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hC"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(int p0, int p1, float p2) {
long local4 = (moom.hC.B ^ 74199180272561L);
    ((moom.hC)(this)).i();
    ((moom.hC)(this)).a(((net.minecraft.client.gui.FontRenderer)(((moom.hC)(this)).p)), ((java.lang.String)(this.x)), ((int)((((moom.hC)(this)).k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1483_5(5511, (1006265206529188486L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1483_6(22168, (3015441860097712526L ^ local4)))));
    super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    ((moom.LI)(this.A)).a(((int)(p0)), ((int)(p1)), ((java.util.List)(((moom.hC)(this)).m)));
    return;
}


protected void a__Void(moom.gc p0) {
int forwardValue3590_13_0;
    int forwardValue3590_43_0;
    int forwardValue3590_48_0;
    int forwardValue3590_48_1;
    int forwardValue3590_64_0;
    int forwardValue3590_64_1;
    boolean spill3590_0;
    int spill3590_1;
    int spill3590_2;
    long life2_3;
    int[] life4_5;
    moom.ir life5_94;
    forward_join_79: {
    forward_join_64: {
    forward_join_60: {
    forward_join_48: {
    forward_join_43: {
    forward_join_41: {
    forward_join_13: {
    life2_3 = (moom.hC.B ^ 67806706694102L);
    life4_5 = moom.LL.b();
    spill3590_0 = ((moom.gc)(p0)).m;
    if (!((life4_5 == null))) {
        forwardValue3590_13_0 = ((spill3590_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!(spill3590_0)) {
        break forward_join_79;
    }
    forwardValue3590_13_0 = ((moom.gc)(p0)).l;
    }
    spill3590_1 = __sourceIntrinsic_60da6f6f15c0_invokedynamic3590_5(7009, (2652696089181419523L ^ life2_3));
    if (!((life4_5 == null))) {
        forwardValue3590_48_0 = forwardValue3590_13_0;
        forwardValue3590_48_1 = spill3590_1;
        break forward_join_48;
    }
    if (!((forwardValue3590_13_0 < spill3590_1))) {
        break forward_join_41;
    }
    spill3590_2 = ((p0 instanceof moom.gi) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue3590_43_0 = spill3590_2;
        break forward_join_43;
    }
    if (!((spill3590_2 != 0))) {
        break forward_join_41;
    }
    ((net.minecraft.client.settings.GameSettings)(this.y)).a(((net.minecraft.client.settings.GameSettings$Options)(((moom.gi)(((moom.gi)(p0)))).b())), ((int)(1)));
    ((moom.gc)(p0)).k = ((java.lang.String)(((net.minecraft.client.settings.GameSettings)(this.y)).a__String(((net.minecraft.client.settings.GameSettings$Options)(net.minecraft.client.settings.GameSettings$Options.a(((int)(((moom.gc)(p0)).l))))))));
    }
    forwardValue3590_43_0 = ((moom.gc)(p0)).l;
    }
    forwardValue3590_48_0 = forwardValue3590_43_0;
    forwardValue3590_48_1 = __sourceIntrinsic_60da6f6f15c0_invokedynamic3590_17(7009, (2652696089181419523L ^ life2_3));
    }
    if (!((life4_5 == null))) {
        forwardValue3590_64_0 = forwardValue3590_48_0;
        forwardValue3590_64_1 = forwardValue3590_48_1;
        break forward_join_64;
    }
    if (!((forwardValue3590_48_0 == forwardValue3590_48_1))) {
        break forward_join_60;
    }
    ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(((moom.hC)(this)).i)).W)).b();
    ((net.minecraft.client.Minecraft)(((moom.hC)(this)).i)).a(((net.minecraft.client.gui.GuiScreen)(this.w)));
    }
    forwardValue3590_64_0 = ((moom.gc)(p0)).l;
    forwardValue3590_64_1 = ((net.minecraft.client.settings.GameSettings$Options)(net.minecraft.client.settings.GameSettings$Options.AA_LEVEL)).ordinal();
    }
    if (!((forwardValue3590_64_0 != forwardValue3590_64_1))) {
        break forward_join_79;
    }
    life5_94 = new moom.ir(((moom.hC)(this)).i);
    ((moom.hC)(this)).a(((net.minecraft.client.Minecraft)(((moom.hC)(this)).i)), ((int)(((moom.ir)(life5_94)).a__Int())), ((int)(((moom.ir)(life5_94)).b__Int())));
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
        byte[] spill4161_0 = p0;
        life4_9 += 1;
        life5_44 = (spill4161_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill4161_1 = p0;
        life4_9 += 1;
        life5_76 = (spill4161_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill4161_2 = p0;
        life4_9 += 1;
        life5_91 = (spill4161_2)[life4_9];
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
    java.lang.String local7 = moom.hC.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 19278);
    if (((moom.hC.D)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.hC.E)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.hC.E)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/hC", life9_51);
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
        life9_116 = ((java.lang.String)((moom.hC.C)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.hC.D)[life5_8] = moom.hC.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.hC.D)[life5_8];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite860_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite860_93(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite860_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite860_97(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite860_99(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite860_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite860_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite860_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite860_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite860_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite860_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite860_113(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_invokedynamic1185_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1185_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1185_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1185_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1185_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1185_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1185_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1185_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1185_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1185_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1185_36(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_invokedynamic1185_37(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral7830_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7831_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1483_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1483_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60da6f6f15c0_invokedynamic3590_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60da6f6f15c0_invokedynamic3590_17(int a0, long a1) throws E;
}
