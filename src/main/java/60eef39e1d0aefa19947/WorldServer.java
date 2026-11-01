package net.minecraft.world;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class WorldServer extends net.minecraft.world.World implements net.minecraft.util.IThreadListener {

private static org.apache.logging.log4j.Logger S;

private moom.Bl T;

private net.minecraft.entity.EntityTracker U;

private moom.Br V;

private java.util.Set<moom.Er> W;

private java.util.TreeSet<moom.Er> X;

private java.util.Map<java.util.UUID, net.minecraft.entity.Entity> Y;

public net.minecraft.world.gen.ChunkProviderServer Z;

public boolean aa;

private boolean ab;

private int ac;

private moom.Et ad;

private moom.Es ae;

protected moom.Eb af;

private moom.OG[] ag;

private int ah;

private static java.util.List<moom.D5> ai;

private java.util.List<moom.Er> aj;

private static long cb;

private static long[] hb;

private static java.lang.Integer[] ib;

private static java.util.Map jb;

private static long[] nb;

private static java.lang.Long[] ob;

private static java.util.Map pb;

public WorldServer(moom.Bl p0, net.minecraft.world.storage.ISaveHandler p1, net.minecraft.world.storage.WorldInfo p2, int p3, moom.A9 p4) {
super(p1, p2, moom.EA.a(((int)(p3))), p4, false);
    this.W = ((java.util.Set)(com.google.common.collect.Sets.newHashSet()));
    this.X = ((java.util.TreeSet)(new java.util.TreeSet()));
    this.Y = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    this.ae = ((moom.Es)(new moom.Es()));
    this.af = ((moom.Eb)(new moom.Eb(this)));
    this.ag = ((moom.OG[])(new moom.OG[] {new moom.OG(), new moom.OG()}));
    this.aj = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    this.T = ((moom.Bl)(p0));
    this.U = ((net.minecraft.entity.EntityTracker)(new net.minecraft.entity.EntityTracker(this)));
    this.V = ((moom.Br)(new moom.Br(this)));
    ((moom.EA)(this.v)).a(((net.minecraft.world.World)(this)));
    this.x = ((moom.Fn)(((net.minecraft.world.WorldServer)(this)).a__Fn()));
    this.ad = ((moom.Et)(new moom.Et(this)));
    ((net.minecraft.world.WorldServer)(this)).c__Void();
    ((net.minecraft.world.WorldServer)(this)).e__Void();
    ((net.minecraft.world.border.WorldBorder)(((net.minecraft.world.WorldServer)(this)).a__Fi())).a(((int)(((moom.Bl)(p0)).h())));
    return;
}


static {
cb = ((long)(((moom._a)(moom._c.a(((long)(2156244942520409531L)), ((long)(-7465024923964480216L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(148680105693584L)))));
    long local22_life6 = (net.minecraft.world.WorldServer.cb ^ 67702971815041L);
    jb = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life9;
    javax.crypto.Cipher __sourceSpill1365_11 = (local11_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1365_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1365_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1365_14 = new byte[8];
    (__sourceSpill1365_14)[0] = ((byte) ((int) (local22_life6 >>> 56)));
    int local12_life15 = 1;
    while ((local12_life15 < 8)) {
        (__sourceSpill1365_14)[local12_life15] = ((byte) ((int) ((local22_life6 << (local12_life15 * 8)) >>> 56)));
        local12_life15 += 1;
    }
    byte[] __sourcePreallocation1365_16 = __sourceSpill1365_14;
    ((javax.crypto.Cipher)(__sourceSpill1365_11)).init(((int)(__sourceSpill1365_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1365_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1365_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local17_life19 = new long[25];
    int local14_life20 = 0;
    java.lang.String local15_life21;
    int local16_life23 = ((java.lang.String)((local15_life21 = "\036ÆÀà\031G×ATèy\0349N¬E¼M{7»F7Ä«CE`ë\013Íù\032Y^¬S¶+Å\fyÀ*x-ÏìùtLd\rQ[vx$6ÿì\013[é.å\031\017õ¿¹Ê9\032)\034'¼á}1iÆt£\f¨bÂ\016rbÛ\020r_FÖx­Õ¦ßÞ©õkçGªØB\026d·Õåýn}iÍj»3!üPõÌFö(F0AÙ8lÐÎ'6YwKEh-éÄ÷yþñ\016`¦1\036"))).length();
    int local13_life24 = 0;
    do {
        java.lang.String __sourceSpill1365_25 = local15_life21;
        int __sourceSpill1365_26 = local13_life24;
        local13_life24 += 8;
        byte[] local18_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1365_25)).substring(((int)(__sourceSpill1365_26)), ((int)(local13_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1365_30 = local17_life19;
        int __sourceSpill1365_31 = local14_life20;
        local14_life20 += 1;
        long local19_life32 = (((((((((((long) (local18_life29)[0]) & 255L) << 56) | ((((long) (local18_life29)[1]) & 255L) << 48)) | ((((long) (local18_life29)[2]) & 255L) << 40)) | ((((long) (local18_life29)[3]) & 255L) << 32)) | ((((long) (local18_life29)[4]) & 255L) << 24)) | ((((long) (local18_life29)[5]) & 255L) << 16)) | ((((long) (local18_life29)[6]) & 255L) << 8)) | (((long) (local18_life29)[7]) & 255L));
        byte[] __sourceSpill1365_33 = new byte[8];
        (__sourceSpill1365_33)[0] = ((byte) ((int) (local19_life32 >>> 56)));
        (__sourceSpill1365_33)[1] = ((byte) ((int) (local19_life32 >>> 48)));
        (__sourceSpill1365_33)[2] = ((byte) ((int) (local19_life32 >>> 40)));
        (__sourceSpill1365_33)[3] = ((byte) ((int) (local19_life32 >>> 32)));
        (__sourceSpill1365_33)[4] = ((byte) ((int) (local19_life32 >>> 24)));
        (__sourceSpill1365_33)[5] = ((byte) ((int) (local19_life32 >>> 16)));
        (__sourceSpill1365_33)[6] = ((byte) ((int) (local19_life32 >>> 8)));
        (__sourceSpill1365_33)[7] = ((byte) ((int) local19_life32));
        javax.crypto.Cipher __sourceSpill1365_34 = local11_life9;
        byte[] local21_life36 = ((javax.crypto.Cipher)(__sourceSpill1365_34)).doFinal(((byte[])(__sourceSpill1365_33)));
        (__sourceSpill1365_30)[__sourceSpill1365_31] = (((((((((((long) (local21_life36)[0]) & 255L) << 56) | ((((long) (local21_life36)[1]) & 255L) << 48)) | ((((long) (local21_life36)[2]) & 255L) << 40)) | ((((long) (local21_life36)[3]) & 255L) << 32)) | ((((long) (local21_life36)[4]) & 255L) << 24)) | ((((long) (local21_life36)[5]) & 255L) << 16)) | ((((long) (local21_life36)[6]) & 255L) << 8)) | (((long) (local21_life36)[7]) & 255L));
    } while ((!(local13_life24 >= local16_life23)));
    local16_life23 = ((java.lang.String)((local15_life21 = "}Êc~4F#siszÖ\t\006`"))).length();
    local13_life24 = 0;
    do {
        java.lang.String __sourceSpill1365_38 = local15_life21;
        int __sourceSpill1365_39 = local13_life24;
        local13_life24 += 8;
        byte[] local18_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1365_38)).substring(((int)(__sourceSpill1365_39)), ((int)(local13_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1365_43 = local17_life19;
        int __sourceSpill1365_44 = local14_life20;
        local14_life20 += 1;
        long local19_life45 = (((((((((((long) (local18_life42)[0]) & 255L) << 56) | ((((long) (local18_life42)[1]) & 255L) << 48)) | ((((long) (local18_life42)[2]) & 255L) << 40)) | ((((long) (local18_life42)[3]) & 255L) << 32)) | ((((long) (local18_life42)[4]) & 255L) << 24)) | ((((long) (local18_life42)[5]) & 255L) << 16)) | ((((long) (local18_life42)[6]) & 255L) << 8)) | (((long) (local18_life42)[7]) & 255L));
        byte[] __sourceSpill1365_46 = new byte[8];
        (__sourceSpill1365_46)[0] = ((byte) ((int) (local19_life45 >>> 56)));
        (__sourceSpill1365_46)[1] = ((byte) ((int) (local19_life45 >>> 48)));
        (__sourceSpill1365_46)[2] = ((byte) ((int) (local19_life45 >>> 40)));
        (__sourceSpill1365_46)[3] = ((byte) ((int) (local19_life45 >>> 32)));
        (__sourceSpill1365_46)[4] = ((byte) ((int) (local19_life45 >>> 24)));
        (__sourceSpill1365_46)[5] = ((byte) ((int) (local19_life45 >>> 16)));
        (__sourceSpill1365_46)[6] = ((byte) ((int) (local19_life45 >>> 8)));
        (__sourceSpill1365_46)[7] = ((byte) ((int) local19_life45));
        javax.crypto.Cipher __sourceSpill1365_47 = local11_life9;
        byte[] local21_life49 = ((javax.crypto.Cipher)(__sourceSpill1365_47)).doFinal(((byte[])(__sourceSpill1365_46)));
        (__sourceSpill1365_43)[__sourceSpill1365_44] = (((((((((((long) (local21_life49)[0]) & 255L) << 56) | ((((long) (local21_life49)[1]) & 255L) << 48)) | ((((long) (local21_life49)[2]) & 255L) << 40)) | ((((long) (local21_life49)[3]) & 255L) << 32)) | ((((long) (local21_life49)[4]) & 255L) << 24)) | ((((long) (local21_life49)[5]) & 255L) << 16)) | ((((long) (local21_life49)[6]) & 255L) << 8)) | (((long) (local21_life49)[7]) & 255L));
    } while ((!(local13_life24 >= local16_life23)));
    hb = ((long[])(local17_life19));
    ib = ((java.lang.Integer[])(new java.lang.Integer[25]));
    pb = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill1365_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1365_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1365_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1365_59 = new byte[8];
    (__sourceSpill1365_59)[0] = ((byte) ((int) (local22_life6 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill1365_59)[local1_life60] = ((byte) ((int) ((local22_life6 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation1365_61 = __sourceSpill1365_59;
    ((javax.crypto.Cipher)(__sourceSpill1365_56)).init(((int)(__sourceSpill1365_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1365_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1365_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life64 = new long[4];
    int local3_life65 = 0;
    java.lang.String local4_life66;
    int local5_life68 = ((java.lang.String)((local4_life66 = "säý:o´W25\004¨'s*?"))).length();
    int local2_life69 = 0;
    do {
        java.lang.String __sourceSpill1365_70 = local4_life66;
        int __sourceSpill1365_71 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill1365_70)).substring(((int)(__sourceSpill1365_71)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1365_75 = local6_life64;
        int __sourceSpill1365_76 = local3_life65;
        local3_life65 += 1;
        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));
        byte[] __sourceSpill1365_78 = new byte[8];
        (__sourceSpill1365_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));
        (__sourceSpill1365_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));
        (__sourceSpill1365_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));
        (__sourceSpill1365_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));
        (__sourceSpill1365_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));
        (__sourceSpill1365_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));
        (__sourceSpill1365_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));
        (__sourceSpill1365_78)[7] = ((byte) ((int) local8_life77));
        javax.crypto.Cipher __sourceSpill1365_79 = local0_life54;
        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill1365_79)).doFinal(((byte[])(__sourceSpill1365_78)));
        (__sourceSpill1365_75)[__sourceSpill1365_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    local5_life68 = ((java.lang.String)((local4_life66 = "\036'u»\025>\b=\024ôxrèî~"))).length();
    local2_life69 = 0;
    do {
        java.lang.String __sourceSpill1365_83 = local4_life66;
        int __sourceSpill1365_84 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life87 = ((java.lang.String)(((java.lang.String)(__sourceSpill1365_83)).substring(((int)(__sourceSpill1365_84)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1365_88 = local6_life64;
        int __sourceSpill1365_89 = local3_life65;
        local3_life65 += 1;
        long local8_life90 = (((((((((((long) (local7_life87)[0]) & 255L) << 56) | ((((long) (local7_life87)[1]) & 255L) << 48)) | ((((long) (local7_life87)[2]) & 255L) << 40)) | ((((long) (local7_life87)[3]) & 255L) << 32)) | ((((long) (local7_life87)[4]) & 255L) << 24)) | ((((long) (local7_life87)[5]) & 255L) << 16)) | ((((long) (local7_life87)[6]) & 255L) << 8)) | (((long) (local7_life87)[7]) & 255L));
        byte[] __sourceSpill1365_91 = new byte[8];
        (__sourceSpill1365_91)[0] = ((byte) ((int) (local8_life90 >>> 56)));
        (__sourceSpill1365_91)[1] = ((byte) ((int) (local8_life90 >>> 48)));
        (__sourceSpill1365_91)[2] = ((byte) ((int) (local8_life90 >>> 40)));
        (__sourceSpill1365_91)[3] = ((byte) ((int) (local8_life90 >>> 32)));
        (__sourceSpill1365_91)[4] = ((byte) ((int) (local8_life90 >>> 24)));
        (__sourceSpill1365_91)[5] = ((byte) ((int) (local8_life90 >>> 16)));
        (__sourceSpill1365_91)[6] = ((byte) ((int) (local8_life90 >>> 8)));
        (__sourceSpill1365_91)[7] = ((byte) ((int) local8_life90));
        javax.crypto.Cipher __sourceSpill1365_92 = local0_life54;
        byte[] local10_life94 = ((javax.crypto.Cipher)(__sourceSpill1365_92)).doFinal(((byte[])(__sourceSpill1365_91)));
        (__sourceSpill1365_88)[__sourceSpill1365_89] = (((((((((((long) (local10_life94)[0]) & 255L) << 56) | ((((long) (local10_life94)[1]) & 255L) << 48)) | ((((long) (local10_life94)[2]) & 255L) << 40)) | ((((long) (local10_life94)[3]) & 255L) << 32)) | ((((long) (local10_life94)[4]) & 255L) << 24)) | ((((long) (local10_life94)[5]) & 255L) << 16)) | ((((long) (local10_life94)[6]) & 255L) << 8)) | (((long) (local10_life94)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    nb = ((long[])(local6_life64));
    ob = ((java.lang.Long[])(new java.lang.Long[4]));
    S = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
    moom.D5[] __sourceSpill1365_102 = new moom.D5[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1365_99(22723, (7716543884529251243L ^ local22_life6))];
    (__sourceSpill1365_102)[0] = new moom.D5(net.minecraft.init.Items.y, 0, 1, 3, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1365_101(2477, (7181326065849885388L ^ local22_life6)));
    (__sourceSpill1365_102)[1] = new moom.D5(net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f))), 0, 1, 3, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1365_105(2477, (7181326065849885388L ^ local22_life6)));
    (__sourceSpill1365_102)[2] = new moom.D5(net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r))), 0, 1, 3, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1365_108(2477, (7181326065849885388L ^ local22_life6)));
    (__sourceSpill1365_102)[3] = new moom.D5(net.minecraft.init.Items.t, 0, 1, 1, 3);
    (__sourceSpill1365_102)[4] = new moom.D5(net.minecraft.init.Items.p, 0, 1, 1, 5);
    (__sourceSpill1365_102)[5] = new moom.D5(net.minecraft.init.Items.s, 0, 1, 1, 3);
    (__sourceSpill1365_102)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1365_112(20484, (2377655667297139569L ^ local22_life6))] = new moom.D5(net.minecraft.init.Items.o, 0, 1, 1, 5);
    (__sourceSpill1365_102)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1365_114(15530, (251930533830186945L ^ local22_life6))] = new moom.D5(net.minecraft.init.Items.e, 0, 2, 3, 5);
    (__sourceSpill1365_102)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1365_116(18151, (5065218476214103432L ^ local22_life6))] = new moom.D5(net.minecraft.init.Items.P, 0, 2, 3, 3);
    (__sourceSpill1365_102)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1365_118(15174, (8443141140977111102L ^ local22_life6))] = new moom.D5(net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.s))), 0, 1, 3, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1365_121(2477, (7181326065849885388L ^ local22_life6)));
    ai = ((java.util.List)(com.google.common.collect.Lists.newArrayList(((java.lang.Object[])(__sourceSpill1365_102)))));
}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_093c33ff7605c5f026d6(net.minecraft.world.WorldServer a0, int a1, int a2, int a3, int a4, int a5, int a6) throws E;
private static final class __SourceHandler_093c33ff7605c5f026d6 {

public static java.util.List f285(net.minecraft.world.WorldServer receiver, int p0, int p1, int p2, int p3, int p4, int p5) throws Throwable {
    int lexicalValue285_31_0;
    int lexicalValue285_31_1;
    int lexicalValue285_37_0;
    int lexicalValue285_37_1;
    int lexicalValue285_43_0;
    int lexicalValue285_43_1;
    int lexicalValue285_49_0;
    int lexicalValue285_49_1;
    int lexicalValue285_57_0;
    int lexicalValue285_57_1;
    int lexicalValue285_61_0;
    java.lang.String spill285_0;
    int spill285_1;
    int spill285_2;
    int spill285_3;
    long life7_3;
    java.util.ArrayList life10_6;
    java.lang.String life9_7;
    java.util.Iterator life11_11;
    net.minecraft.tileentity.TileEntity life12_18;
    moom.DT life13_21;
    lexical_join_64: {
    life7_3 = (__fieldRead285_0() ^ 82115285911006L);
    spill285_0 = __call285_1();
    life10_6 = __call285_2();
    life9_7 = spill285_0;
    life11_11 = __call285_4(__fieldRead285_3(receiver));
    lexical_cycle_12: while (true) {
    lexical_join_62: {
    lexical_join_61: {
    lexical_join_57: {
    lexical_join_49: {
    lexical_join_43: {
    lexical_join_37: {
    lexical_join_31: {
    if (!(__call285_5(life11_11))) {
        break lexical_join_64;
    }
    life12_18 = __cast285_7(__call285_6(life11_11));
    life13_21 = __call285_8(life12_18);
    spill285_1 = __call285_9(life13_21);
    spill285_2 = p0;
    if (!((life9_7 == null))) {
        lexicalValue285_31_0 = spill285_1;
        lexicalValue285_31_1 = spill285_2;
        break lexical_join_31;
    }
    if (!((spill285_1 >= spill285_2))) {
        break lexical_join_62;
    }
    lexicalValue285_31_0 = __call285_10(life13_21);
    lexicalValue285_31_1 = p1;
    }
    if (!((life9_7 == null))) {
        lexicalValue285_37_0 = lexicalValue285_31_0;
        lexicalValue285_37_1 = lexicalValue285_31_1;
        break lexical_join_37;
    }
    if (!((lexicalValue285_31_0 >= lexicalValue285_31_1))) {
        break lexical_join_62;
    }
    lexicalValue285_37_0 = __call285_11(life13_21);
    lexicalValue285_37_1 = p2;
    }
    if (!((life9_7 == null))) {
        lexicalValue285_43_0 = lexicalValue285_37_0;
        lexicalValue285_43_1 = lexicalValue285_37_1;
        break lexical_join_43;
    }
    if (!((lexicalValue285_37_0 >= lexicalValue285_37_1))) {
        break lexical_join_62;
    }
    lexicalValue285_43_0 = __call285_12(life13_21);
    lexicalValue285_43_1 = p3;
    }
    if (!((life9_7 == null))) {
        lexicalValue285_49_0 = lexicalValue285_43_0;
        lexicalValue285_49_1 = lexicalValue285_43_1;
        break lexical_join_49;
    }
    if (!((lexicalValue285_43_0 < lexicalValue285_43_1))) {
        break lexical_join_62;
    }
    lexicalValue285_49_0 = __call285_13(life13_21);
    lexicalValue285_49_1 = p4;
    }
    if (!((life9_7 == null))) {
        lexicalValue285_57_0 = lexicalValue285_49_0;
        lexicalValue285_57_1 = lexicalValue285_49_1;
        break lexical_join_57;
    }
    if (!((lexicalValue285_49_0 < lexicalValue285_49_1))) {
        break lexical_join_62;
    }
    spill285_3 = __call285_14(life13_21);
    if (!((life9_7 == null))) {
        lexicalValue285_61_0 = spill285_3;
        break lexical_join_61;
    }
    lexicalValue285_57_0 = spill285_3;
    lexicalValue285_57_1 = p5;
    }
    if (!((lexicalValue285_57_0 < lexicalValue285_57_1))) {
        break lexical_join_62;
    }
    lexicalValue285_61_0 = __integerCategory285_16(__call285_15(life10_6, life12_18));
    }
    __discardScalar285_17(lexicalValue285_61_0);
    }
    if (!((life9_7 != null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    return life10_6;
}
public static void h285_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1028500_0(p0);
}
public static void h285_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1028501_0(p0);
}
public static void h285_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1028502_0(p0);
}
public static void h285_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1028503_0(p0);
}
public static void h285_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1028504_0(p0);
}
public static void h285_5(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1028505_0(p0);
}
public static void h285_6(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1028506_0(p0);
}
public static void h285_7(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1028507_0(p0);
}
public static void h285_8(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1028508_0(p0);
}
public static void h285_9(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1028509_0(p0);
}
public static void h285_10(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1028510_0(p0);
}
public static void h285_11(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1028511_0(p0);
}
private static native long __fieldRead285_0() throws Throwable;
private static native java.lang.String __call285_1() throws Throwable;
private static native java.util.ArrayList __call285_2() throws Throwable;
private static native java.util.List __fieldRead285_3(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.util.Iterator __call285_4(java.util.List a0) throws Throwable;
private static native boolean __call285_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call285_6(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __cast285_7(java.lang.Object a0) throws Throwable;
private static native moom.DT __call285_8(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native int __call285_9(moom.DT a0) throws Throwable;
private static native int __call285_10(moom.DT a0) throws Throwable;
private static native int __call285_11(moom.DT a0) throws Throwable;
private static native int __call285_12(moom.DT a0) throws Throwable;
private static native int __call285_13(moom.DT a0) throws Throwable;
private static native int __call285_14(moom.DT a0) throws Throwable;
private static native boolean __call285_15(java.util.ArrayList a0, net.minecraft.tileentity.TileEntity a1) throws Throwable;
private static native int __integerCategory285_16(boolean value) throws Throwable;
private static native void __discardScalar285_17(int a0) throws Throwable;
private static native java.lang.Throwable __call1028500_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1028501_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1028502_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1028503_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1028504_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1028505_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1028506_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1028507_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1028508_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1028509_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1028510_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1028511_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d5f34a22fd47ce7782dd(net.minecraft.world.WorldServer a0, moom.DT a1, net.minecraft.block.Block a2, int a3, int a4) throws E;
private static final class __SourceHandler_d5f34a22fd47ce7782dd {

public static void f286(net.minecraft.world.WorldServer receiver, moom.DT p0, net.minecraft.block.Block p1, int p2, int p3) throws Throwable {
    net.minecraft.block.Block forwardValue286_26_0;
    net.minecraft.world.WorldServer forwardValue286_59_0;
    moom.DT forwardValue286_59_1;
    net.minecraft.block.Block forwardValue286_70_0;
    net.minecraft.block.Block forwardValue286_77_0;
    int forwardValue286_86_0;
    int forwardValue286_102_0;
    int forwardValue286_135_0;
    java.lang.String spill286_0;
    boolean spill286_1;
    net.minecraft.block.Block spill286_2;
    boolean spill286_3;
    net.minecraft.world.WorldServer spill286_4;
    moom.DT spill286_5;
    net.minecraft.block.Block spill286_6;
    boolean spill286_7;
    long life5_3;
    moom.Er life8_10;
    java.lang.String life7_11;
    int life9_13;
    int life9_50;
    net.minecraft.block.state.IBlockState life10_81;
    forward_join_136: {
    forward_join_135: {
    forward_join_119: {
    forward_join_102: {
    forward_join_87: {
    forward_join_86: {
    forward_join_85: {
    forward_join_84: {
    forward_join_77: {
    forward_join_70: {
    forward_join_59: {
    forward_join_26: {
    life5_3 = (__fieldRead286_0() ^ 137953814115998L);
    spill286_0 = __call286_1();
    life8_10 = new moom.Er(p0, p1);
    life7_11 = spill286_0;
    life9_13 = 0;
    spill286_1 = __fieldRead286_2(receiver);
    if (!((life7_11 == null))) {
        forwardValue286_102_0 = __integerCategory286_3(spill286_1);
        break forward_join_102;
    }
    if (!(spill286_1)) {
        break forward_join_87;
    }
    spill286_2 = p1;
    if (!((life7_11 == null))) {
        forwardValue286_26_0 = spill286_2;
        break forward_join_26;
    }
    if (!((__call286_4(spill286_2) != __fieldRead286_5()))) {
        break forward_join_87;
    }
    forwardValue286_26_0 = p1;
    }
    spill286_3 = __call286_6(forwardValue286_26_0);
    if (!((life7_11 == null))) {
        forwardValue286_86_0 = __integerCategory286_7(spill286_3);
        break forward_join_86;
    }
    if (!(spill286_3)) {
        break forward_join_85;
    }
    life9_50 = __invokedynamic286_8(18151, (5065148505081548695L ^ life5_3));
    spill286_4 = receiver;
    spill286_5 = __call286_10(__fieldRead286_9(life8_10), (-life9_50), (-life9_50), (-life9_50));
    if (!((life7_11 == null))) {
        forwardValue286_59_0 = spill286_4;
        forwardValue286_59_1 = spill286_5;
        break forward_join_59;
    }
    if (!(__call286_13(spill286_4, spill286_5, __call286_12(__fieldRead286_11(life8_10), life9_50, life9_50, life9_50)))) {
        break forward_join_84;
    }
    forwardValue286_59_0 = receiver;
    forwardValue286_59_1 = __fieldRead286_14(life8_10);
    }
    life10_81 = __call286_15(forwardValue286_59_0, forwardValue286_59_1);
    spill286_6 = __call286_16(life10_81);
    if (!((life7_11 == null))) {
        forwardValue286_70_0 = spill286_6;
        break forward_join_70;
    }
    if (!((__call286_17(spill286_6) != __fieldRead286_18()))) {
        break forward_join_84;
    }
    forwardValue286_70_0 = __call286_19(life10_81);
    }
    if (!((life7_11 == null))) {
        forwardValue286_77_0 = forwardValue286_70_0;
        break forward_join_77;
    }
    if (!((forwardValue286_70_0 == __call286_20(life8_10)))) {
        break forward_join_84;
    }
    forwardValue286_77_0 = __call286_21(life10_81);
    }
    __call286_24(forwardValue286_77_0, receiver, __fieldRead286_22(life8_10), life10_81, __fieldRead286_23(receiver));
    }
    return;
    }
    forwardValue286_86_0 = 1;
    }
    p2 = forwardValue286_86_0;
    }
    forwardValue286_102_0 = __integerCategory286_28(__call286_27(receiver, __call286_25(p0, (-life9_13), (-life9_13), (-life9_13)), __call286_26(p0, life9_13, life9_13, life9_13)));
    }
    if (!((forwardValue286_102_0 != 0))) {
        break forward_join_136;
    }
    if (!((__call286_29(p1) != __fieldRead286_30()))) {
        break forward_join_119;
    }
    __call286_33(life8_10, (((long) p2) + __call286_32(__fieldRead286_31(receiver))));
    __call286_34(life8_10, p3);
    }
    spill286_7 = __call286_36(__fieldRead286_35(receiver), life8_10);
    if (!((life7_11 == null))) {
        forwardValue286_135_0 = __integerCategory286_37(spill286_7);
        break forward_join_135;
    }
    if (!((!spill286_7))) {
        break forward_join_136;
    }
    __call286_39(__fieldRead286_38(receiver), life8_10);
    forwardValue286_135_0 = __integerCategory286_42(__call286_41(__fieldRead286_40(receiver), life8_10));
    }
    __discardScalar286_43(forwardValue286_135_0);
    }
    return;
}
public static void h286_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1028600_0(p0);
}
public static void h286_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1028601_0(p0);
}
public static void h286_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1028602_0(p0);
}
public static void h286_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1028603_0(p0);
}
public static void h286_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1028604_0(p0);
}
public static void h286_5(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1028605_0(p0);
}
public static void h286_6(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1028606_0(p0);
}
public static void h286_7(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1028607_0(p0);
}
public static void h286_8(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1028608_0(p0);
}
public static void h286_9(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1028609_0(p0);
}
public static void h286_10(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1028610_0(p0);
}
public static void h286_11(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1028611_0(p0);
}
public static void h286_12(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1028612_0(p0);
}
public static void h286_13(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1028613_0(p0);
}
public static void h286_14(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1028614_0(p0);
}
private static native long __fieldRead286_0() throws Throwable;
private static native java.lang.String __call286_1() throws Throwable;
private static native boolean __fieldRead286_2(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __integerCategory286_3(boolean value) throws Throwable;
private static native moom.fn __call286_4(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead286_5() throws Throwable;
private static native boolean __call286_6(net.minecraft.block.Block a0) throws Throwable;
private static native int __integerCategory286_7(boolean value) throws Throwable;
private static native int __invokedynamic286_8(int a0, long a1) throws Throwable;
private static native moom.DT __fieldRead286_9(moom.Er a0) throws Throwable;
private static native moom.DT __call286_10(moom.DT a0, int a1, int a2, int a3) throws Throwable;
private static native moom.DT __fieldRead286_11(moom.Er a0) throws Throwable;
private static native moom.DT __call286_12(moom.DT a0, int a1, int a2, int a3) throws Throwable;
private static native boolean __call286_13(net.minecraft.world.WorldServer a0, moom.DT a1, moom.DT a2) throws Throwable;
private static native moom.DT __fieldRead286_14(moom.Er a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call286_15(net.minecraft.world.WorldServer a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call286_16(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.fn __call286_17(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead286_18() throws Throwable;
private static native net.minecraft.block.Block __call286_19(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.block.Block __call286_20(moom.Er a0) throws Throwable;
private static native net.minecraft.block.Block __call286_21(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.DT __fieldRead286_22(moom.Er a0) throws Throwable;
private static native java.util.Random __fieldRead286_23(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call286_24(net.minecraft.block.Block a0, net.minecraft.world.WorldServer a1, moom.DT a2, net.minecraft.block.state.IBlockState a3, java.util.Random a4) throws Throwable;
private static native moom.DT __call286_25(moom.DT a0, int a1, int a2, int a3) throws Throwable;
private static native moom.DT __call286_26(moom.DT a0, int a1, int a2, int a3) throws Throwable;
private static native boolean __call286_27(net.minecraft.world.WorldServer a0, moom.DT a1, moom.DT a2) throws Throwable;
private static native int __integerCategory286_28(boolean value) throws Throwable;
private static native moom.fn __call286_29(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead286_30() throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead286_31(net.minecraft.world.WorldServer a0) throws Throwable;
private static native long __call286_32(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native moom.Er __call286_33(moom.Er a0, long a1) throws Throwable;
private static native void __call286_34(moom.Er a0, int a1) throws Throwable;
private static native java.util.Set __fieldRead286_35(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call286_36(java.util.Set a0, moom.Er a1) throws Throwable;
private static native int __integerCategory286_37(boolean value) throws Throwable;
private static native java.util.Set __fieldRead286_38(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call286_39(java.util.Set a0, moom.Er a1) throws Throwable;
private static native java.util.TreeSet __fieldRead286_40(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call286_41(java.util.TreeSet a0, moom.Er a1) throws Throwable;
private static native int __integerCategory286_42(boolean value) throws Throwable;
private static native void __discardScalar286_43(int a0) throws Throwable;
private static native java.lang.Throwable __call1028600_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1028601_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1028602_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1028603_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1028604_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1028605_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1028606_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1028607_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1028608_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1028609_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1028610_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1028611_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1028612_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1028613_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1028614_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_2d7f76a551fb0206b41e(net.minecraft.world.WorldServer a0, moom.EK a1) throws E;
private static final class __SourceHandler_2d7f76a551fb0206b41e {

public static void f722(net.minecraft.world.WorldServer receiver, moom.EK p0) throws Throwable {
    net.minecraft.world.storage.WorldInfo forestValue722_19_0;
    net.minecraft.world.WorldServer forestValue722_25_0;
    net.minecraft.world.storage.WorldInfo spill722_0;
    net.minecraft.world.WorldServer spill722_1;
    long life2_3;
    java.lang.String life4_5;
    forest_join_31: {
    forest_join_25: {
    forest_join_24: {
    forest_join_19: {
    life2_3 = (__fieldRead722_0() ^ 57494757030903L);
    life4_5 = __call722_1();
    spill722_0 = __fieldRead722_2(receiver);
    if (!((life4_5 == null))) {
        forestValue722_19_0 = spill722_0;
        break forest_join_19;
    }
    if (!((!__call722_3(spill722_0)))) {
        break forest_join_31;
    }
    __call722_4(receiver, p0);
    spill722_1 = receiver;
    if (!((life4_5 == null))) {
        forestValue722_25_0 = spill722_1;
        break forest_join_25;
    }
    forestValue722_19_0 = __fieldRead722_5(spill722_1);
    }
    if (!((__call722_6(forestValue722_19_0) == __fieldRead722_7()))) {
        break forest_join_24;
    }
    __call722_8(receiver);
    }
    forestValue722_25_0 = receiver;
    }
    __call722_9(forestValue722_25_0, p0);
    __call722_11(__fieldRead722_10(receiver), 1);
    }
    return;
}
public static void h722_0(java.lang.Throwable p0) throws Throwable {
    throw __call3072200_0(p0);
}
public static void h722_1(java.lang.Throwable p0) throws Throwable {
    throw __call3072201_0(p0);
}
public static void h722_2(java.lang.Throwable p0) throws Throwable {
    throw __call3072202_0(p0);
}
public static void h722_3(java.lang.Throwable p0, net.minecraft.world.WorldServer p1) throws Throwable {
    java.lang.Throwable life2_2;
    moom.qY life3_6;
    life2_2 = p0;
    life3_6 = __call3072203_0(life2_2, "Exception initializing level");
    __call3072203_1(p1, life3_6);
    throw new moom.Oo(life3_6);
}
public static void h722_4(java.lang.Throwable p0, moom.qY p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    throw new moom.Oo(p1);
}
private static native long __fieldRead722_0() throws Throwable;
private static native java.lang.String __call722_1() throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead722_2(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call722_3(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call722_4(net.minecraft.world.WorldServer a0, moom.EK a1) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead722_5(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.world.WorldType __call722_6(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.world.WorldType __fieldRead722_7() throws Throwable;
private static native void __call722_8(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call722_9(net.minecraft.world.WorldServer a0, moom.EK a1) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead722_10(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call722_11(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native java.lang.Throwable __call3072200_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3072201_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3072202_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call3072203_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call3072203_1(net.minecraft.world.WorldServer a0, moom.qY a1) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_43994584ef6e9ab26770(net.minecraft.world.WorldServer a0, moom.G2 a1, boolean a2) throws E;
private static final class __SourceHandler_43994584ef6e9ab26770 {

public static java.util.List f1163(net.minecraft.world.WorldServer receiver, moom.G2 p0, boolean p1) throws Throwable {
    int forestValue1163_12_0;
    int forestValue1163_12_1;
    int forestValue1163_48_0;
    int forestValue1163_48_1;
    int forestValue1163_55_0;
    int forestValue1163_55_1;
    int forestValue1163_64_0;
    int forestValue1163_64_1;
    int forestValue1163_66_0;
    int forestValue1163_73_0;
    java.util.ArrayList forestValue1163_83_0;
    java.lang.String spill1163_0;
    int spill1163_1;
    int spill1163_2;
    int spill1163_3;
    java.util.ArrayList spill1163_4;
    long life3_3;
    java.util.ArrayList life6_6;
    int life7_8;
    java.lang.String life5_9;
    java.util.Iterator life8_18;
    moom.Er life9_31;
    moom.DT life10_34;
    forest_join_91: {
    life3_3 = (__fieldRead1163_0() ^ 30133676938360L);
    spill1163_0 = __call1163_1();
    life6_6 = null;
    life7_8 = 0;
    life5_9 = spill1163_0;
    forest_cycle_10: while (true) {
    forest_join_88: {
    forestValue1163_12_0 = life7_8;
    forestValue1163_12_1 = 2;
    forest_cycle_12: while (true) {
    forest_join_25: {
    forest_join_21: {
    if (!((forestValue1163_12_0 < forestValue1163_12_1))) {
        break forest_join_91;
    }
    if (!((life7_8 == 0))) {
        break forest_join_21;
    }
    life8_18 = __call1163_3(__fieldRead1163_2(receiver));
    if (!((life5_9 != null))) {
        break forest_join_25;
    }
    }
    life8_18 = __call1163_5(__fieldRead1163_4(receiver));
    }
    forest_cycle_25: while (true) {
    forest_join_86: {
    forest_join_83: {
    forest_join_82: {
    forest_join_76: {
    forest_join_73: {
    forest_join_66: {
    forest_join_64: {
    forest_join_55: {
    forest_join_48: {
    if (!(__call1163_6(life8_18))) {
        break forest_join_88;
    }
    life9_31 = __cast1163_8(__call1163_7(life8_18));
    life10_34 = __fieldRead1163_9(life9_31);
    spill1163_1 = __call1163_10(life10_34);
    spill1163_2 = __fieldRead1163_11(p0);
    if (!((life5_9 == null))) {
        forestValue1163_12_0 = spill1163_1;
        forestValue1163_12_1 = spill1163_2;
        continue forest_cycle_12;
    }
    if (!((life5_9 == null))) {
        forestValue1163_48_0 = spill1163_1;
        forestValue1163_48_1 = spill1163_2;
        break forest_join_48;
    }
    if (!((spill1163_1 >= spill1163_2))) {
        break forest_join_86;
    }
    forestValue1163_48_0 = __call1163_12(life10_34);
    forestValue1163_48_1 = __fieldRead1163_13(p0);
    }
    if (!((life5_9 == null))) {
        forestValue1163_55_0 = forestValue1163_48_0;
        forestValue1163_55_1 = forestValue1163_48_1;
        break forest_join_55;
    }
    if (!((forestValue1163_48_0 < forestValue1163_48_1))) {
        break forest_join_86;
    }
    forestValue1163_55_0 = __call1163_14(life10_34);
    forestValue1163_55_1 = __fieldRead1163_15(p0);
    }
    if (!((life5_9 == null))) {
        forestValue1163_64_0 = forestValue1163_55_0;
        forestValue1163_64_1 = forestValue1163_55_1;
        break forest_join_64;
    }
    if (!((forestValue1163_55_0 >= forestValue1163_55_1))) {
        break forest_join_86;
    }
    spill1163_3 = __call1163_16(life10_34);
    if (!((life5_9 == null))) {
        forestValue1163_66_0 = spill1163_3;
        break forest_join_66;
    }
    forestValue1163_64_0 = spill1163_3;
    forestValue1163_64_1 = __fieldRead1163_17(p0);
    }
    if (!((forestValue1163_64_0 < forestValue1163_64_1))) {
        break forest_join_86;
    }
    forestValue1163_66_0 = __integerCategory1163_18(p1);
    }
    if (!((life5_9 == null))) {
        forestValue1163_73_0 = forestValue1163_66_0;
        break forest_join_73;
    }
    if (!((forestValue1163_66_0 != 0))) {
        break forest_join_76;
    }
    forestValue1163_73_0 = __integerCategory1163_21(__call1163_20(__fieldRead1163_19(receiver), life9_31));
    }
    __discardScalar1163_22(forestValue1163_73_0);
    __call1163_23(life8_18);
    }
    spill1163_4 = life6_6;
    if (!((life5_9 == null))) {
        forestValue1163_83_0 = spill1163_4;
        break forest_join_83;
    }
    if (!((spill1163_4 == null))) {
        break forest_join_82;
    }
    life6_6 = __call1163_24();
    }
    forestValue1163_83_0 = life6_6;
    }
    __call1163_25(forestValue1163_83_0, life9_31);
    }
    if (!((life5_9 != null))) {
        continue forest_cycle_25;
    }
    break forest_cycle_25;
    }
    break forest_cycle_12;
    }
    }
    life7_8 += 1;
    if (!((life5_9 != null))) {
        continue forest_cycle_10;
    }
    break forest_cycle_10;
    }
    }
    return life6_6;
}
public static java.util.List h1163_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116300_0(p0);
}
public static java.util.List h1163_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116301_0(p0);
}
public static java.util.List h1163_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116302_0(p0);
}
public static java.util.List h1163_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116303_0(p0);
}
public static java.util.List h1163_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116304_0(p0);
}
public static java.util.List h1163_5(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116305_0(p0);
}
public static java.util.List h1163_6(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116306_0(p0);
}
public static java.util.List h1163_7(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116307_0(p0);
}
public static java.util.List h1163_8(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116308_0(p0);
}
public static java.util.List h1163_9(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116309_0(p0);
}
private static native long __fieldRead1163_0() throws Throwable;
private static native java.lang.String __call1163_1() throws Throwable;
private static native java.util.TreeSet __fieldRead1163_2(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.util.Iterator __call1163_3(java.util.TreeSet a0) throws Throwable;
private static native java.util.List __fieldRead1163_4(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.util.Iterator __call1163_5(java.util.List a0) throws Throwable;
private static native boolean __call1163_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1163_7(java.util.Iterator a0) throws Throwable;
private static native moom.Er __cast1163_8(java.lang.Object a0) throws Throwable;
private static native moom.DT __fieldRead1163_9(moom.Er a0) throws Throwable;
private static native int __call1163_10(moom.DT a0) throws Throwable;
private static native int __fieldRead1163_11(moom.G2 a0) throws Throwable;
private static native int __call1163_12(moom.DT a0) throws Throwable;
private static native int __fieldRead1163_13(moom.G2 a0) throws Throwable;
private static native int __call1163_14(moom.DT a0) throws Throwable;
private static native int __fieldRead1163_15(moom.G2 a0) throws Throwable;
private static native int __call1163_16(moom.DT a0) throws Throwable;
private static native int __fieldRead1163_17(moom.G2 a0) throws Throwable;
private static native int __integerCategory1163_18(boolean value) throws Throwable;
private static native java.util.Set __fieldRead1163_19(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call1163_20(java.util.Set a0, moom.Er a1) throws Throwable;
private static native int __integerCategory1163_21(boolean value) throws Throwable;
private static native void __discardScalar1163_22(int a0) throws Throwable;
private static native void __call1163_23(java.util.Iterator a0) throws Throwable;
private static native java.util.ArrayList __call1163_24() throws Throwable;
private static native boolean __call1163_25(java.util.ArrayList a0, moom.Er a1) throws Throwable;
private static native java.lang.Throwable __call3116300_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116301_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116302_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116303_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116304_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116305_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116306_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116307_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116308_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116309_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_cb62ccd45ba4758f099d(net.minecraft.world.WorldServer a0, moom.eS a1) throws E;
private static final class __SourceHandler_cb62ccd45ba4758f099d {

public static boolean f1763(net.minecraft.world.WorldServer receiver, moom.eS p0) throws Throwable {
    net.minecraft.block.Block forwardValue1763_20_0;
    int forwardValue1763_33_0;
    int forwardValue1763_35_0;
    java.lang.String spill1763_0;
    net.minecraft.block.Block spill1763_1;
    boolean spill1763_2;
    long life2_3;
    net.minecraft.block.state.IBlockState life5_9;
    java.lang.String life4_10;
    forward_join_35: {
    forward_join_34: {
    forward_join_33: {
    forward_join_20: {
    life2_3 = (__fieldRead1763_0() ^ 5550687518680L);
    spill1763_0 = __call1763_1();
    life5_9 = __call1763_3(receiver, __call1763_2(p0));
    life4_10 = spill1763_0;
    spill1763_1 = __call1763_4(life5_9);
    if (!((life4_10 == null))) {
        forwardValue1763_20_0 = spill1763_1;
        break forward_join_20;
    }
    if (!((spill1763_1 == __call1763_5(p0)))) {
        break forward_join_34;
    }
    forwardValue1763_20_0 = __call1763_6(life5_9);
    }
    spill1763_2 = __call1763_10(forwardValue1763_20_0, receiver, __call1763_7(p0), life5_9, __call1763_8(p0), __call1763_9(p0));
    if (!((life4_10 == null))) {
        forwardValue1763_33_0 = __integerCategory1763_11(spill1763_2);
        break forward_join_33;
    }
    if (!(spill1763_2)) {
        break forward_join_34;
    }
    forwardValue1763_33_0 = 1;
    }
    forwardValue1763_35_0 = forwardValue1763_33_0;
    break forward_join_35;
    }
    forwardValue1763_35_0 = 0;
    }
    return __integerCategory1763_12(forwardValue1763_35_0);
}
public static void h1763_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1176300_0(p0);
}
public static void h1763_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1176301_0(p0);
}
public static void h1763_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1176302_0(p0);
}
private static native long __fieldRead1763_0() throws Throwable;
private static native java.lang.String __call1763_1() throws Throwable;
private static native moom.DT __call1763_2(moom.eS a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1763_3(net.minecraft.world.WorldServer a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call1763_4(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.block.Block __call1763_5(moom.eS a0) throws Throwable;
private static native net.minecraft.block.Block __call1763_6(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.DT __call1763_7(moom.eS a0) throws Throwable;
private static native int __call1763_8(moom.eS a0) throws Throwable;
private static native int __call1763_9(moom.eS a0) throws Throwable;
private static native boolean __call1763_10(net.minecraft.block.Block a0, net.minecraft.world.WorldServer a1, moom.DT a2, net.minecraft.block.state.IBlockState a3, int a4, int a5) throws Throwable;
private static native int __integerCategory1763_11(boolean value) throws Throwable;
private static native boolean __integerCategory1763_12(int value) throws Throwable;
private static native java.lang.Throwable __call1176300_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1176301_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1176302_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_6050dddd9804df64643b(net.minecraft.world.WorldServer a0, net.minecraft.entity.Entity a1) throws E;
private static final class __SourceHandler_6050dddd9804df64643b {

public static void f1764(net.minecraft.world.WorldServer receiver, net.minecraft.entity.Entity p0) throws Throwable {
    net.minecraft.entity.Entity[] lexicalValue1764_30_0;
    java.lang.String spill1764_0;
    net.minecraft.entity.Entity[] spill1764_1;
    long life2_3;
    java.lang.String life4_14;
    net.minecraft.entity.Entity[] life5_24;
    net.minecraft.entity.Entity[] life6_33;
    int life7_36;
    int life8_38;
    net.minecraft.entity.Entity life9_45;
    lexical_join_52: {
    lexical_join_30: {
    life2_3 = (__fieldRead1764_0() ^ 54843336874784L);
    spill1764_0 = __call1764_1();
    __call1764_2(receiver, p0);
    __call1764_5(__fieldRead1764_3(receiver), __call1764_4(p0), p0);
    life4_14 = spill1764_0;
    __call1764_8(__fieldRead1764_6(receiver), __call1764_7(p0), p0);
    life5_24 = __call1764_9(p0);
    spill1764_1 = life5_24;
    if (!((life4_14 == null))) {
        lexicalValue1764_30_0 = spill1764_1;
        break lexical_join_30;
    }
    if (!((spill1764_1 != null))) {
        break lexical_join_52;
    }
    lexicalValue1764_30_0 = life5_24;
    }
    life6_33 = lexicalValue1764_30_0;
    life7_36 = (life6_33).length;
    life8_38 = 0;
    lexical_cycle_36: while (true) {
    if (!((life8_38 < life7_36))) {
        break lexical_join_52;
    }
    life9_45 = (life6_33)[life8_38];
    __call1764_12(__fieldRead1764_10(receiver), __call1764_11(life9_45), life9_45);
    life8_38 += 1;
    if (!((life4_14 != null))) { continue lexical_cycle_36; }
    break lexical_cycle_36;
    }
    }
    return;
}
public static void h1764_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1176400_0(p0);
}
private static native long __fieldRead1764_0() throws Throwable;
private static native java.lang.String __call1764_1() throws Throwable;
private static native void __call1764_2(net.minecraft.world.WorldServer a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native moom.Dd __fieldRead1764_3(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call1764_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call1764_5(moom.Dd a0, int a1, net.minecraft.entity.Entity a2) throws Throwable;
private static native java.util.Map __fieldRead1764_6(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.util.UUID __call1764_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.Object __call1764_8(java.util.Map a0, java.util.UUID a1, net.minecraft.entity.Entity a2) throws Throwable;
private static native net.minecraft.entity.Entity[] __call1764_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.Dd __fieldRead1764_10(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call1764_11(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call1764_12(moom.Dd a0, int a1, net.minecraft.entity.Entity a2) throws Throwable;
private static native java.lang.Throwable __call1176400_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> moom.Ei __sourceHandlerCall_f2aee02aa984c77cea84(net.minecraft.world.WorldServer a0, net.minecraft.entity.Entity a1, double a2, double a3, double a4, float a5, boolean a6, boolean a7) throws E;
private static final class __SourceHandler_f2aee02aa984c77cea84 {

public static moom.Ei f1765(net.minecraft.world.WorldServer receiver, net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4, boolean p5, boolean p6) throws Throwable {
    moom.Ei lexicalValue1765_28_0;
    net.minecraft.entity.player.EntityPlayer lexicalValue1765_51_0;
    java.lang.String spill1765_0;
    moom.Ei spill1765_1;
    net.minecraft.entity.player.EntityPlayer spill1765_2;
    long life11_3;
    moom.Ei life14_16;
    java.lang.String life13_17;
    java.util.Iterator life15_38;
    net.minecraft.entity.player.EntityPlayer life16_45;
    lexical_join_70: {
    lexical_join_29: {
    lexical_join_28: {
    life11_3 = (__fieldRead1765_0() ^ 110105657919005L);
    spill1765_0 = __call1765_1();
    life14_16 = new moom.Ei(receiver, p0, p1, p2, p3, p4, p5, p6);
    life13_17 = spill1765_0;
    __call1765_2(life14_16);
    spill1765_1 = life14_16;
    if (!((life13_17 == null))) {
        lexicalValue1765_28_0 = spill1765_1;
        break lexical_join_28;
    }
    __call1765_3(spill1765_1, 0);
    if (!((!p6))) {
        break lexical_join_29;
    }
    lexicalValue1765_28_0 = life14_16;
    }
    __call1765_4(lexicalValue1765_28_0);
    }
    life15_38 = __call1765_6(__fieldRead1765_5(receiver));
    lexical_cycle_33: while (true) {
    lexical_join_68: {
    lexical_join_51: {
    if (!(__call1765_7(life15_38))) {
        break lexical_join_70;
    }
    life16_45 = __cast1765_9(__call1765_8(life15_38));
    spill1765_2 = life16_45;
    if (!((life13_17 == null))) {
        lexicalValue1765_51_0 = spill1765_2;
        break lexical_join_51;
    }
    if (!((__numericCompare1765_11(__call1765_10(spill1765_2, p1, p2, p3), 0x1.0p12d) < 0))) {
        break lexical_join_68;
    }
    lexicalValue1765_51_0 = life16_45;
    }
    __call1765_18(__fieldRead1765_13(__cast1765_12(lexicalValue1765_51_0)), new moom.z9(p1, p2, p3, p4, __call1765_14(life14_16), __cast1765_17(__call1765_16(__call1765_15(life14_16), life16_45))));
    }
    if (!((life13_17 != null))) { continue lexical_cycle_33; }
    break lexical_cycle_33;
    }
    }
    return life14_16;
}
public static void h1765_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1176500_0(p0);
}
public static void h1765_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1176501_0(p0);
}
public static void h1765_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1176502_0(p0);
}
public static void h1765_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1176503_0(p0);
}
private static native long __fieldRead1765_0() throws Throwable;
private static native java.lang.String __call1765_1() throws Throwable;
private static native void __call1765_2(moom.Ei a0) throws Throwable;
private static native void __call1765_3(moom.Ei a0, int a1) throws Throwable;
private static native void __call1765_4(moom.Ei a0) throws Throwable;
private static native java.util.List __fieldRead1765_5(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.util.Iterator __call1765_6(java.util.List a0) throws Throwable;
private static native boolean __call1765_7(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1765_8(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast1765_9(java.lang.Object a0) throws Throwable;
private static native double __call1765_10(net.minecraft.entity.player.EntityPlayer a0, double a1, double a2, double a3) throws Throwable;
private static native int __numericCompare1765_11(double a0, double a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __cast1765_12(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead1765_13(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native java.util.List __call1765_14(moom.Ei a0) throws Throwable;
private static native java.util.Map __call1765_15(moom.Ei a0) throws Throwable;
private static native java.lang.Object __call1765_16(java.util.Map a0, net.minecraft.entity.player.EntityPlayer a1) throws Throwable;
private static native moom.DR __cast1765_17(java.lang.Object a0) throws Throwable;
private static native void __call1765_18(net.minecraft.network.NetHandlerPlayServer a0, moom.z9 a1) throws Throwable;
private static native java.lang.Throwable __call1176500_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1176501_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1176502_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1176503_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_8c85b0d148dd83dde79f(net.minecraft.world.WorldServer a0, net.minecraft.entity.Entity a1, boolean a2) throws E;
private static final class __SourceHandler_8c85b0d148dd83dde79f {

public static void f1766(net.minecraft.world.WorldServer receiver, net.minecraft.entity.Entity p0, boolean p1) throws Throwable {
    net.minecraft.entity.Entity forwardValue1766_22_0;
    int forwardValue1766_27_0;
    net.minecraft.entity.Entity forwardValue1766_34_0;
    net.minecraft.world.WorldServer forwardValue1766_36_0;
    boolean spill1766_0;
    net.minecraft.entity.Entity spill1766_1;
    int spill1766_2;
    net.minecraft.world.WorldServer spill1766_3;
    net.minecraft.entity.Entity spill1766_4;
    long life3_3;
    java.lang.String life5_5;
    forward_join_36: {
    forward_join_35: {
    forward_join_34: {
    forward_join_27: {
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    life3_3 = (__fieldRead1766_0() ^ 757831684903L);
    life5_5 = __call1766_1();
    spill1766_0 = __call1766_2(receiver);
    if (!((life5_5 == null))) {
        forwardValue1766_27_0 = __integerCategory1766_3(spill1766_0);
        break forward_join_27;
    }
    if (!((!spill1766_0))) {
        break forward_join_23;
    }
    spill1766_1 = p0;
    if (!((life5_5 == null))) {
        forwardValue1766_22_0 = spill1766_1;
        break forward_join_22;
    }
    if (!((__instanceOf1766_4(spill1766_1) == 0))) {
        break forward_join_21;
    }
    spill1766_2 = __instanceOf1766_5(p0);
    if (!((life5_5 == null))) {
        forwardValue1766_27_0 = spill1766_2;
        break forward_join_27;
    }
    if (!((spill1766_2 != 0))) {
        break forward_join_23;
    }
    }
    forwardValue1766_22_0 = p0;
    }
    __call1766_6(forwardValue1766_22_0);
    }
    spill1766_3 = receiver;
    if (!((life5_5 == null))) {
        forwardValue1766_36_0 = spill1766_3;
        break forward_join_36;
    }
    forwardValue1766_27_0 = __integerCategory1766_8(__call1766_7(spill1766_3));
    }
    if (!((forwardValue1766_27_0 == 0))) {
        break forward_join_35;
    }
    spill1766_4 = p0;
    if (!((life5_5 == null))) {
        forwardValue1766_34_0 = spill1766_4;
        break forward_join_34;
    }
    if (!((__instanceOf1766_9(spill1766_4) != 0))) {
        break forward_join_35;
    }
    forwardValue1766_34_0 = p0;
    }
    __call1766_10(forwardValue1766_34_0);
    }
    forwardValue1766_36_0 = receiver;
    }
    __call1766_11(forwardValue1766_36_0, p0, p1);
    return;
}
public static void h1766_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1176600_0(p0);
}
public static void h1766_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1176601_0(p0);
}
public static void h1766_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1176602_0(p0);
}
public static void h1766_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1176603_0(p0);
}
public static void h1766_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1176604_0(p0);
}
public static void h1766_5(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1176605_0(p0);
}
public static void h1766_6(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1176606_0(p0);
}
public static void h1766_7(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1176607_0(p0);
}
public static void h1766_8(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1176608_0(p0);
}
private static native long __fieldRead1766_0() throws Throwable;
private static native java.lang.String __call1766_1() throws Throwable;
private static native boolean __call1766_2(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __integerCategory1766_3(boolean value) throws Throwable;
private static native int __instanceOf1766_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __instanceOf1766_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call1766_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call1766_7(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __integerCategory1766_8(boolean value) throws Throwable;
private static native int __instanceOf1766_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call1766_10(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call1766_11(net.minecraft.world.WorldServer a0, net.minecraft.entity.Entity a1, boolean a2) throws Throwable;
private static native java.lang.Throwable __call1176600_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1176601_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1176602_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1176603_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1176604_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1176605_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1176606_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1176607_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1176608_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_d39376aa1df453161630(net.minecraft.world.WorldServer a0, net.minecraft.entity.EnumCreatureType a1, moom.D7 a2, moom.DT a3) throws E;
private static final class __SourceHandler_d39376aa1df453161630 {

public static boolean f1767(net.minecraft.world.WorldServer receiver, net.minecraft.entity.EnumCreatureType p0, moom.D7 p1, moom.DT p2) throws Throwable {
    java.util.List forwardValue1767_17_0;
    int forwardValue1767_24_0;
    int forwardValue1767_28_0;
    int forwardValue1767_30_0;
    java.lang.String spill1767_0;
    java.util.List spill1767_1;
    boolean spill1767_2;
    long life4_3;
    java.util.List life7_10;
    java.lang.String life6_11;
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_24: {
    forward_join_17: {
    life4_3 = (__fieldRead1767_0() ^ 43990803765632L);
    spill1767_0 = __call1767_1();
    life7_10 = __call1767_3(__call1767_2(receiver), p0, p2);
    life6_11 = spill1767_0;
    spill1767_1 = life7_10;
    if (!((life6_11 == null))) {
        forwardValue1767_17_0 = spill1767_1;
        break forward_join_17;
    }
    if (!((spill1767_1 != null))) {
        break forward_join_29;
    }
    forwardValue1767_17_0 = life7_10;
    }
    spill1767_2 = __call1767_4(forwardValue1767_17_0);
    if (!((life6_11 == null))) {
        forwardValue1767_24_0 = __integerCategory1767_5(spill1767_2);
        break forward_join_24;
    }
    if (!((!spill1767_2))) {
        break forward_join_29;
    }
    forwardValue1767_24_0 = __integerCategory1767_7(__call1767_6(life7_10, p1));
    }
    if (!((life6_11 == null))) {
        forwardValue1767_28_0 = forwardValue1767_24_0;
        break forward_join_28;
    }
    if (!((forwardValue1767_24_0 != 0))) {
        break forward_join_29;
    }
    forwardValue1767_28_0 = 1;
    }
    forwardValue1767_30_0 = forwardValue1767_28_0;
    break forward_join_30;
    }
    forwardValue1767_30_0 = 0;
    }
    return __integerCategory1767_8(forwardValue1767_30_0);
}
public static void h1767_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1176700_0(p0);
}
public static void h1767_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1176701_0(p0);
}
public static void h1767_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1176702_0(p0);
}
public static void h1767_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1176703_0(p0);
}
private static native long __fieldRead1767_0() throws Throwable;
private static native java.lang.String __call1767_1() throws Throwable;
private static native moom.Fn __call1767_2(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.util.List __call1767_3(moom.Fn a0, net.minecraft.entity.EnumCreatureType a1, moom.DT a2) throws Throwable;
private static native boolean __call1767_4(java.util.List a0) throws Throwable;
private static native int __integerCategory1767_5(boolean value) throws Throwable;
private static native boolean __call1767_6(java.util.List a0, moom.D7 a1) throws Throwable;
private static native int __integerCategory1767_7(boolean value) throws Throwable;
private static native boolean __integerCategory1767_8(int value) throws Throwable;
private static native java.lang.Throwable __call1176700_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1176701_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1176702_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1176703_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> moom.D7 __sourceHandlerCall_94f76dfeef1f52f20e0a(net.minecraft.world.WorldServer a0, net.minecraft.entity.EnumCreatureType a1, moom.DT a2) throws E;
private static final class __SourceHandler_94f76dfeef1f52f20e0a {

public static moom.D7 f1768(net.minecraft.world.WorldServer receiver, net.minecraft.entity.EnumCreatureType p0, moom.DT p1) throws Throwable {
    java.util.List forwardValue1768_17_0;
    moom.D7 forwardValue1768_26_0;
    java.lang.String spill1768_0;
    java.util.List spill1768_1;
    long life3_3;
    java.util.List life6_10;
    java.lang.String life5_11;
    forward_join_26: {
    forward_join_25: {
    forward_join_17: {
    life3_3 = (__fieldRead1768_0() ^ 92726892591450L);
    spill1768_0 = __call1768_1();
    life6_10 = __call1768_3(__call1768_2(receiver), p0, p1);
    life5_11 = spill1768_0;
    spill1768_1 = life6_10;
    if (!((life5_11 == null))) {
        forwardValue1768_17_0 = spill1768_1;
        break forward_join_17;
    }
    if (!((spill1768_1 != null))) {
        break forward_join_25;
    }
    forwardValue1768_17_0 = life6_10;
    }
    if (!((!__call1768_4(forwardValue1768_17_0)))) {
        break forward_join_25;
    }
    forwardValue1768_26_0 = __cast1768_7(__call1768_6(__fieldRead1768_5(receiver), life6_10));
    break forward_join_26;
    }
    forwardValue1768_26_0 = null;
    }
    return forwardValue1768_26_0;
}
public static void h1768_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1176800_0(p0);
}
public static void h1768_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1176801_0(p0);
}
private static native long __fieldRead1768_0() throws Throwable;
private static native java.lang.String __call1768_1() throws Throwable;
private static native moom.Fn __call1768_2(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.util.List __call1768_3(moom.Fn a0, net.minecraft.entity.EnumCreatureType a1, moom.DT a2) throws Throwable;
private static native boolean __call1768_4(java.util.List a0) throws Throwable;
private static native java.util.Random __fieldRead1768_5(net.minecraft.world.WorldServer a0) throws Throwable;
private static native moom.D1 __call1768_6(java.util.Random a0, java.util.List a1) throws Throwable;
private static native moom.D7 __cast1768_7(moom.D1 a0) throws Throwable;
private static native java.lang.Throwable __call1176800_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1176801_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_a1188a4c306949d9f5b3(net.minecraft.world.WorldServer a0, net.minecraft.entity.player.EntityPlayer a1, moom.DT a2) throws E;
private static final class __SourceHandler_a1188a4c306949d9f5b3 {

public static boolean f1769(net.minecraft.world.WorldServer receiver, net.minecraft.entity.player.EntityPlayer p0, moom.DT p1) throws Throwable {
    int forwardValue1769_19_0;
    int forwardValue1769_23_0;
    int forwardValue1769_25_0;
    boolean spill1769_0;
    long life3_3;
    java.lang.String life5_5;
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_19: {
    life3_3 = (__fieldRead1769_0() ^ 46615092797040L);
    life5_5 = __call1769_1();
    spill1769_0 = __call1769_3(__fieldRead1769_2(receiver), receiver, p1, p0);
    if (!((life5_5 == null))) {
        forwardValue1769_19_0 = __integerCategory1769_4(spill1769_0);
        break forward_join_19;
    }
    if (!((!spill1769_0))) {
        break forward_join_24;
    }
    forwardValue1769_19_0 = __integerCategory1769_7(__call1769_6(__call1769_5(receiver), p1));
    }
    if (!((life5_5 == null))) {
        forwardValue1769_23_0 = forwardValue1769_19_0;
        break forward_join_23;
    }
    if (!((forwardValue1769_19_0 != 0))) {
        break forward_join_24;
    }
    forwardValue1769_23_0 = 1;
    }
    forwardValue1769_25_0 = forwardValue1769_23_0;
    break forward_join_25;
    }
    forwardValue1769_25_0 = 0;
    }
    return __integerCategory1769_8(forwardValue1769_25_0);
}
public static void h1769_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1176900_0(p0);
}
public static void h1769_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1176901_0(p0);
}
public static void h1769_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1176902_0(p0);
}
private static native long __fieldRead1769_0() throws Throwable;
private static native java.lang.String __call1769_1() throws Throwable;
private static native moom.Bl __fieldRead1769_2(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call1769_3(moom.Bl a0, net.minecraft.world.WorldServer a1, moom.DT a2, net.minecraft.entity.player.EntityPlayer a3) throws Throwable;
private static native int __integerCategory1769_4(boolean value) throws Throwable;
private static native net.minecraft.world.border.WorldBorder __call1769_5(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call1769_6(net.minecraft.world.border.WorldBorder a0, moom.DT a1) throws Throwable;
private static native int __integerCategory1769_7(boolean value) throws Throwable;
private static native boolean __integerCategory1769_8(int value) throws Throwable;
private static native java.lang.Throwable __call1176900_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1176901_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1176902_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_6c89b1ac5afc8937a939(net.minecraft.world.WorldServer a0, net.minecraft.util.EnumParticleTypes a1, boolean a2, double a3, double a4, double a5, int a6, double a7, double a8, double a9, double a10, int[] a11) throws E;
private static final class __SourceHandler_6c89b1ac5afc8937a939 {

public static void f1770(net.minecraft.world.WorldServer receiver, net.minecraft.util.EnumParticleTypes p0, boolean p1, double p2, double p3, double p4, int p5, double p6, double p7, double p8, double p9, int[] p10) throws Throwable {
    int lexicalValue1770_58_0;
    int lexicalValue1770_64_0;
    java.lang.String spill1770_0;
    int spill1770_1;
    long life19_3;
    moom.Ab life22_26;
    java.util.Iterator life23_30;
    java.lang.String life21_31;
    net.minecraft.entity.player.EntityPlayer life24_38;
    net.minecraft.entity.player.EntityPlayerMP life25_41;
    moom.DT life26_44;
    double life27_50;
    lexical_join_71: {
    life19_3 = (__fieldRead1770_0() ^ 27241594547144L);
    spill1770_0 = __call1770_1();
    life22_26 = new moom.Ab(p0, p1, ((float) p2), ((float) p3), ((float) p4), ((float) p6), ((float) p7), ((float) p8), ((float) p9), p5, p10);
    life23_30 = __call1770_3(__fieldRead1770_2(receiver));
    life21_31 = spill1770_0;
    lexical_cycle_32: while (true) {
    lexical_join_69: {
    lexical_join_65: {
    lexical_join_64: {
    lexical_join_58: {
    if (!(__call1770_4(life23_30))) {
        break lexical_join_71;
    }
    life24_38 = __cast1770_6(__call1770_5(life23_30));
    life25_41 = __cast1770_7(life24_38);
    life26_44 = __call1770_8(life25_41);
    life27_50 = __call1770_9(life26_44, p2, p3, p4);
    spill1770_1 = __numericCompare1770_10(life27_50, 0x1.0p8d);
    if (!((life21_31 == null))) {
        lexicalValue1770_58_0 = spill1770_1;
        break lexical_join_58;
    }
    if (!((spill1770_1 > 0))) {
        break lexical_join_65;
    }
    lexicalValue1770_58_0 = __integerCategory1770_11(p1);
    }
    if (!((life21_31 == null))) {
        lexicalValue1770_64_0 = lexicalValue1770_58_0;
        break lexical_join_64;
    }
    if (!((lexicalValue1770_58_0 != 0))) {
        break lexical_join_69;
    }
    lexicalValue1770_64_0 = __numericCompare1770_12(life27_50, 0x1.0p16d);
    }
    if (!((lexicalValue1770_64_0 <= 0))) {
        break lexical_join_69;
    }
    }
    __call1770_14(__fieldRead1770_13(life25_41), life22_26);
    }
    if (!((life21_31 != null))) { continue lexical_cycle_32; }
    break lexical_cycle_32;
    }
    }
    return;
}
public static void h1770_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1177000_0(p0);
}
public static void h1770_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1177001_0(p0);
}
public static void h1770_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1177002_0(p0);
}
public static void h1770_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1177003_0(p0);
}
private static native long __fieldRead1770_0() throws Throwable;
private static native java.lang.String __call1770_1() throws Throwable;
private static native java.util.List __fieldRead1770_2(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.util.Iterator __call1770_3(java.util.List a0) throws Throwable;
private static native boolean __call1770_4(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1770_5(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast1770_6(java.lang.Object a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __cast1770_7(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native moom.DT __call1770_8(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native double __call1770_9(moom.DT a0, double a1, double a2, double a3) throws Throwable;
private static native int __numericCompare1770_10(double a0, double a1) throws Throwable;
private static native int __integerCategory1770_11(boolean value) throws Throwable;
private static native int __numericCompare1770_12(double a0, double a1) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead1770_13(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1770_14(net.minecraft.network.NetHandlerPlayServer a0, moom.Ab a1) throws Throwable;
private static native java.lang.Throwable __call1177000_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1177001_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1177002_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1177003_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_224c8654c563d46a045f(net.minecraft.world.WorldServer a0, boolean a1) throws E;
private static final class __SourceHandler_224c8654c563d46a045f {

public static boolean f614(net.minecraft.world.WorldServer receiver, boolean p0) throws Throwable {
    net.minecraft.world.WorldServer lexicalValue614_16_0;
    int lexicalValue614_39_0;
    int lexicalValue614_39_1;
    int lexicalValue614_51_0;
    int lexicalValue614_91_0;
    net.minecraft.block.Block lexicalValue614_153_0;
    net.minecraft.block.Block lexicalValue614_161_0;
    net.minecraft.world.WorldServer lexicalValue614_174_0;
    moom.DT lexicalValue614_174_1;
    moom.Er lexicalValue614_174_2;
    int lexicalValue614_188_0;
    int lexicalValue614_192_0;
    int lexicalValue614_194_0;
    net.minecraft.world.WorldServer spill614_0;
    int spill614_1;
    int spill614_2;
    int spill614_3;
    boolean spill614_4;
    int spill614_5;
    net.minecraft.world.WorldServer spill614_6;
    moom.DT spill614_7;
    moom.Er spill614_8;
    boolean spill614_9;
    net.minecraft.block.Block spill614_10;
    long life2_3;
    java.lang.String life4_5;
    int life5_23;
    int life6_64;
    moom.Er life7_72;
    java.util.Iterator life6_136;
    moom.Er life7_143;
    int life8_147;
    net.minecraft.block.state.IBlockState life9_180;
    lexical_join_194: {
    lexical_join_193: {
    lexical_join_192: {
    lexical_join_188: {
    lexical_join_179: {
    lexical_join_102: {
    lexical_join_95: {
    lexical_join_51: {
    lexical_join_46: {
    lexical_join_39: {
    lexical_join_31: {
    lexical_join_16: {
    lexical_join_15: {
    life2_3 = (__fieldRead614_0() ^ 62711349218217L);
    life4_5 = __call614_1();
    spill614_0 = receiver;
    if (!((life4_5 == null))) {
        lexicalValue614_16_0 = spill614_0;
        break lexical_join_16;
    }
    if (!((__call614_3(__fieldRead614_2(spill614_0)) == __fieldRead614_4()))) {
        break lexical_join_15;
    }
    return __integerCategory614_5(0);
    }
    lexicalValue614_16_0 = receiver;
    }
    life5_23 = __call614_7(__fieldRead614_6(lexicalValue614_16_0));
    spill614_1 = life5_23;
    spill614_2 = __call614_9(__fieldRead614_8(receiver));
    if (!((life4_5 == null))) {
        lexicalValue614_39_0 = spill614_1;
        lexicalValue614_39_1 = spill614_2;
        break lexical_join_39;
    }
    if (!((spill614_1 != spill614_2))) {
        break lexical_join_31;
    }
    throw new java.lang.IllegalStateException("TickNextTick list out of synch");
    }
    spill614_3 = life5_23;
    if (!((life4_5 == null))) {
        lexicalValue614_51_0 = spill614_3;
        break lexical_join_51;
    }
    lexicalValue614_39_0 = spill614_3;
    lexicalValue614_39_1 = __invokedynamic614_10(29143, (560428921258427785L ^ life2_3));
    }
    if (!((lexicalValue614_39_0 > lexicalValue614_39_1))) {
        break lexical_join_46;
    }
    life5_23 = __invokedynamic614_11(12274, (2925788873219316644L ^ life2_3));
    }
    __call614_13(__fieldRead614_12(receiver), "cleaning");
    lexicalValue614_51_0 = 0;
    }
    life6_64 = lexicalValue614_51_0;
    lexical_cycle_52: while (true) {
    lexical_join_91: {
    lexical_join_77: {
    if (!((life6_64 < life5_23))) {
        break lexical_join_95;
    }
    life7_72 = __cast614_16(__call614_15(__fieldRead614_14(receiver)));
    if (!((life4_5 == null))) {
        break lexical_join_102;
    }
    spill614_4 = p0;
    if (!((life4_5 == null))) {
        lexicalValue614_91_0 = __integerCategory614_17(spill614_4);
        break lexical_join_91;
    }
    if (!((!spill614_4))) {
        break lexical_join_77;
    }
    spill614_5 = __numericCompare614_21(__fieldRead614_18(life7_72), __call614_20(__fieldRead614_19(receiver)));
    if (!((life4_5 == null))) {
        lexicalValue614_91_0 = spill614_5;
        break lexical_join_91;
    }
    if (!((spill614_5 > 0))) {
        break lexical_join_77;
    }
    if (!((life4_5 != null))) {
        break lexical_join_95;
    }
    }
    __call614_23(__fieldRead614_22(receiver), life7_72);
    __call614_25(__fieldRead614_24(receiver), life7_72);
    lexicalValue614_91_0 = __integerCategory614_28(__call614_27(__fieldRead614_26(receiver), life7_72));
    }
    __discardScalar614_29(lexicalValue614_91_0);
    life6_64 += 1;
    if (!((life4_5 != null))) { continue lexical_cycle_52; }
    break lexical_cycle_52;
    }
    }
    __call614_31(__fieldRead614_30(receiver));
    __call614_33(__fieldRead614_32(receiver), "ticking");
    }
    life6_136 = __call614_35(__fieldRead614_34(receiver));
    lexical_cycle_106: while (true) {
    lexical_join_177: {
    lexical_join_174: {
    lexical_join_170: {
    lexical_join_168: {
    lexical_join_161: {
    lexical_join_153: {
    if (!(__call614_36(life6_136))) {
        break lexical_join_179;
    }
    life7_143 = __cast614_38(__call614_37(life6_136));
    __call614_39(life6_136);
    life8_147 = 0;
    spill614_6 = receiver;
    spill614_7 = __call614_41(__fieldRead614_40(life7_143), (-life8_147), (-life8_147), (-life8_147));
    spill614_8 = life7_143;
    if (!((life4_5 == null))) {
        lexicalValue614_174_0 = spill614_6;
        lexicalValue614_174_1 = spill614_7;
        lexicalValue614_174_2 = spill614_8;
        break lexical_join_174;
    }
    spill614_9 = __call614_44(spill614_6, spill614_7, __call614_43(__fieldRead614_42(spill614_8), life8_147, life8_147, life8_147));
    if (!((life4_5 == null))) {
        lexicalValue614_188_0 = __integerCategory614_45(spill614_9);
        break lexical_join_188;
    }
    if (!(spill614_9)) {
        break lexical_join_170;
    }
    life9_180 = __call614_47(receiver, __fieldRead614_46(life7_143));
    spill614_10 = __call614_48(life9_180);
    if (!((life4_5 == null))) {
        lexicalValue614_153_0 = spill614_10;
        break lexical_join_153;
    }
    if (!((__call614_49(spill614_10) != __fieldRead614_50()))) {
        break lexical_join_168;
    }
    lexicalValue614_153_0 = __call614_51(life9_180);
    }
    if (!((life4_5 == null))) {
        lexicalValue614_161_0 = lexicalValue614_153_0;
        break lexical_join_161;
    }
    if (!(__call614_53(lexicalValue614_153_0, __call614_52(life7_143)))) {
        break lexical_join_168;
    }
    lexicalValue614_161_0 = __call614_54(life9_180);
    }
    __call614_57(lexicalValue614_161_0, receiver, __fieldRead614_55(life7_143), life9_180, __fieldRead614_56(receiver));
    }
    if (!((life4_5 != null))) {
        break lexical_join_177;
    }
    }
    lexicalValue614_174_0 = receiver;
    lexicalValue614_174_1 = __fieldRead614_58(life7_143);
    lexicalValue614_174_2 = life7_143;
    }
    __call614_60(lexicalValue614_174_0, lexicalValue614_174_1, __call614_59(lexicalValue614_174_2), 0);
    }
    if (!((life4_5 != null))) { continue lexical_cycle_106; }
    break lexical_cycle_106;
    }
    }
    __call614_62(__fieldRead614_61(receiver));
    __call614_64(__fieldRead614_63(receiver));
    lexicalValue614_188_0 = __integerCategory614_67(__call614_66(__fieldRead614_65(receiver)));
    }
    if (!((life4_5 == null))) {
        lexicalValue614_192_0 = lexicalValue614_188_0;
        break lexical_join_192;
    }
    if (!((lexicalValue614_188_0 == 0))) {
        break lexical_join_193;
    }
    lexicalValue614_192_0 = 1;
    }
    lexicalValue614_194_0 = lexicalValue614_192_0;
    break lexical_join_194;
    }
    lexicalValue614_194_0 = 0;
    }
    return __integerCategory614_68(lexicalValue614_194_0);
}
public static boolean h614_0(java.lang.Throwable p0) throws Throwable {
    throw __call2061400_0(p0);
}
public static boolean h614_1(java.lang.Throwable p0) throws Throwable {
    throw __call2061401_0(p0);
}
public static boolean h614_2(java.lang.Throwable p0) throws Throwable {
    throw __call2061402_0(p0);
}
public static boolean h614_3(java.lang.Throwable p0) throws Throwable {
    throw __call2061403_0(p0);
}
public static boolean h614_4(java.lang.Throwable p0) throws Throwable {
    throw __call2061404_0(p0);
}
public static boolean h614_5(java.lang.Throwable p0) throws Throwable {
    throw __call2061405_0(p0);
}
public static boolean h614_6(java.lang.Throwable p0) throws Throwable {
    throw __call2061406_0(p0);
}
public static boolean h614_7(java.lang.Throwable p0) throws Throwable {
    throw __call2061407_0(p0);
}
public static boolean h614_8(java.lang.Throwable p0) throws Throwable {
    throw __call2061408_0(p0);
}
public static boolean h614_9(java.lang.Throwable p0) throws Throwable {
    throw __call2061409_0(p0);
}
public static boolean h614_10(java.lang.Throwable p0) throws Throwable {
    throw __call2061410_0(p0);
}
public static boolean h614_11(java.lang.Throwable p0) throws Throwable {
    throw __call2061411_0(p0);
}
public static boolean h614_12(java.lang.Throwable p0) throws Throwable {
    throw __call2061412_0(p0);
}
public static boolean h614_13(java.lang.Throwable p0) throws Throwable {
    throw __call2061413_0(p0);
}
public static boolean h614_14(java.lang.Throwable p0) throws Throwable {
    throw __call2061414_0(p0);
}
public static boolean h614_15(java.lang.Throwable p0) throws Throwable {
    throw __call2061415_0(p0);
}
public static boolean h614_16(java.lang.Throwable p0, moom.Er p1, net.minecraft.block.state.IBlockState p2) throws Throwable {
    java.lang.Throwable local3 = p0;
    moom.qY local4 = __call2061416_0(local3, "Exception while ticking a block");
    moom.qZ local5 = __call2061416_1(local4, "Block being ticked");
    __call2061416_3(local5, __fieldRead2061416_2(p1), p2);
    throw new moom.Oo(local4);
}
public static boolean h614_17(java.lang.Throwable p0) throws Throwable {
    throw __call2061417_0(p0);
}
public static boolean h614_18(java.lang.Throwable p0) throws Throwable {
    throw __call2061418_0(p0);
}
private static native long __fieldRead614_0() throws Throwable;
private static native java.lang.String __call614_1() throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead614_2(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.world.WorldType __call614_3(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.world.WorldType __fieldRead614_4() throws Throwable;
private static native boolean __integerCategory614_5(int value) throws Throwable;
private static native java.util.TreeSet __fieldRead614_6(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call614_7(java.util.TreeSet a0) throws Throwable;
private static native java.util.Set __fieldRead614_8(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call614_9(java.util.Set a0) throws Throwable;
private static native int __invokedynamic614_10(int a0, long a1) throws Throwable;
private static native int __invokedynamic614_11(int a0, long a1) throws Throwable;
private static native moom.A9 __fieldRead614_12(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call614_13(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native java.util.TreeSet __fieldRead614_14(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.lang.Object __call614_15(java.util.TreeSet a0) throws Throwable;
private static native moom.Er __cast614_16(java.lang.Object a0) throws Throwable;
private static native int __integerCategory614_17(boolean value) throws Throwable;
private static native long __fieldRead614_18(moom.Er a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead614_19(net.minecraft.world.WorldServer a0) throws Throwable;
private static native long __call614_20(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native int __numericCompare614_21(long a0, long a1) throws Throwable;
private static native java.util.TreeSet __fieldRead614_22(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call614_23(java.util.TreeSet a0, moom.Er a1) throws Throwable;
private static native java.util.Set __fieldRead614_24(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call614_25(java.util.Set a0, moom.Er a1) throws Throwable;
private static native java.util.List __fieldRead614_26(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call614_27(java.util.List a0, moom.Er a1) throws Throwable;
private static native int __integerCategory614_28(boolean value) throws Throwable;
private static native void __discardScalar614_29(int a0) throws Throwable;
private static native moom.A9 __fieldRead614_30(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call614_31(moom.A9 a0) throws Throwable;
private static native moom.A9 __fieldRead614_32(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call614_33(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native java.util.List __fieldRead614_34(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.util.Iterator __call614_35(java.util.List a0) throws Throwable;
private static native boolean __call614_36(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call614_37(java.util.Iterator a0) throws Throwable;
private static native moom.Er __cast614_38(java.lang.Object a0) throws Throwable;
private static native void __call614_39(java.util.Iterator a0) throws Throwable;
private static native moom.DT __fieldRead614_40(moom.Er a0) throws Throwable;
private static native moom.DT __call614_41(moom.DT a0, int a1, int a2, int a3) throws Throwable;
private static native moom.DT __fieldRead614_42(moom.Er a0) throws Throwable;
private static native moom.DT __call614_43(moom.DT a0, int a1, int a2, int a3) throws Throwable;
private static native boolean __call614_44(net.minecraft.world.WorldServer a0, moom.DT a1, moom.DT a2) throws Throwable;
private static native int __integerCategory614_45(boolean value) throws Throwable;
private static native moom.DT __fieldRead614_46(moom.Er a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call614_47(net.minecraft.world.WorldServer a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call614_48(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.fn __call614_49(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead614_50() throws Throwable;
private static native net.minecraft.block.Block __call614_51(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.block.Block __call614_52(moom.Er a0) throws Throwable;
private static native boolean __call614_53(net.minecraft.block.Block a0, net.minecraft.block.Block a1) throws Throwable;
private static native net.minecraft.block.Block __call614_54(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.DT __fieldRead614_55(moom.Er a0) throws Throwable;
private static native java.util.Random __fieldRead614_56(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call614_57(net.minecraft.block.Block a0, net.minecraft.world.WorldServer a1, moom.DT a2, net.minecraft.block.state.IBlockState a3, java.util.Random a4) throws Throwable;
private static native moom.DT __fieldRead614_58(moom.Er a0) throws Throwable;
private static native net.minecraft.block.Block __call614_59(moom.Er a0) throws Throwable;
private static native void __call614_60(net.minecraft.world.WorldServer a0, moom.DT a1, net.minecraft.block.Block a2, int a3) throws Throwable;
private static native moom.A9 __fieldRead614_61(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call614_62(moom.A9 a0) throws Throwable;
private static native java.util.List __fieldRead614_63(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call614_64(java.util.List a0) throws Throwable;
private static native java.util.TreeSet __fieldRead614_65(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call614_66(java.util.TreeSet a0) throws Throwable;
private static native int __integerCategory614_67(boolean value) throws Throwable;
private static native boolean __integerCategory614_68(int value) throws Throwable;
private static native java.lang.Throwable __call2061400_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2061401_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2061402_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2061403_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2061404_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2061405_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2061406_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2061407_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2061408_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2061409_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2061410_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2061411_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2061412_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2061413_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2061414_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2061415_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call2061416_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call2061416_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native moom.DT __fieldRead2061416_2(moom.Er a0) throws Throwable;
private static native void __call2061416_3(moom.qZ a0, moom.DT a1, net.minecraft.block.state.IBlockState a2) throws Throwable;
private static native java.lang.Throwable __call2061417_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2061418_0(java.lang.Throwable a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_017b47ed3e4744e55953(net.minecraft.world.WorldServer a0, boolean a1, net.minecraft.util.IProgressUpdate a2) throws E;
private static final class __SourceHandler_017b47ed3e4744e55953 {

public static void f1771(net.minecraft.world.WorldServer receiver, boolean p0, net.minecraft.util.IProgressUpdate p1) throws Throwable {
    net.minecraft.util.IProgressUpdate lexicalValue1771_22_0;
    net.minecraft.world.WorldServer lexicalValue1771_58_0;
    net.minecraft.util.IProgressUpdate spill1771_0;
    net.minecraft.world.WorldServer spill1771_1;
    long life3_3;
    java.lang.String life5_5;
    java.util.Iterator life6_52;
    net.minecraft.world.chunk.Chunk life7_59;
    lexical_join_66: {
    lexical_join_32: {
    lexical_join_26: {
    lexical_join_22: {
    lexical_join_17: {
    life3_3 = (__fieldRead1771_0() ^ 124561274960655L);
    life5_5 = __call1771_1();
    if (!(__call1771_3(__fieldRead1771_2(receiver)))) {
        break lexical_join_66;
    }
    spill1771_0 = p1;
    if (!((life5_5 == null))) {
        lexicalValue1771_22_0 = spill1771_0;
        break lexical_join_22;
    }
    if (!((spill1771_0 != null))) {
        break lexical_join_17;
    }
    __call1771_4(p1, "Saving level");
    }
    __call1771_5(receiver);
    if (!((life5_5 == null))) {
        break lexical_join_32;
    }
    lexicalValue1771_22_0 = p1;
    }
    if (!((lexicalValue1771_22_0 != null))) {
        break lexical_join_26;
    }
    __call1771_6(p1, "Saving chunks");
    }
    __call1771_8(__fieldRead1771_7(receiver), p0, p1);
    }
    life6_52 = __call1771_12(__call1771_11(__call1771_10(__fieldRead1771_9(receiver))));
    lexical_cycle_38: while (true) {
    lexical_join_64: {
    lexical_join_58: {
    if (!(__call1771_13(life6_52))) {
        break lexical_join_66;
    }
    life7_59 = __cast1771_15(__call1771_14(life6_52));
    if (!((life7_59 != null))) {
        break lexical_join_64;
    }
    spill1771_1 = receiver;
    if (!((life5_5 == null))) {
        lexicalValue1771_58_0 = spill1771_1;
        break lexical_join_58;
    }
    if (!((!__call1771_19(__fieldRead1771_16(spill1771_1), __fieldRead1771_17(life7_59), __fieldRead1771_18(life7_59))))) {
        break lexical_join_64;
    }
    lexicalValue1771_58_0 = receiver;
    }
    __call1771_23(__fieldRead1771_20(lexicalValue1771_58_0), __fieldRead1771_21(life7_59), __fieldRead1771_22(life7_59));
    }
    if (!((life5_5 != null))) { continue lexical_cycle_38; }
    break lexical_cycle_38;
    }
    }
    return;
}
public static void h1771_0(net.minecraft.world.MinecraftException p0) throws Throwable {
    throw __call1177100_0(p0);
}
public static void h1771_1(net.minecraft.world.MinecraftException p0) throws Throwable {
    throw __call1177101_0(p0);
}
public static void h1771_2(net.minecraft.world.MinecraftException p0) throws Throwable {
    throw __call1177102_0(p0);
}
public static void h1771_3(net.minecraft.world.MinecraftException p0) throws Throwable {
    throw __call1177103_0(p0);
}
public static void h1771_4(net.minecraft.world.MinecraftException p0) throws Throwable {
    throw __call1177104_0(p0);
}
public static void h1771_5(net.minecraft.world.MinecraftException p0) throws Throwable {
    throw __call1177105_0(p0);
}
public static void h1771_6(net.minecraft.world.MinecraftException p0) throws Throwable {
    throw __call1177106_0(p0);
}
public static void h1771_7(net.minecraft.world.MinecraftException p0) throws Throwable {
    throw __call1177107_0(p0);
}
private static native long __fieldRead1771_0() throws Throwable;
private static native java.lang.String __call1771_1() throws Throwable;
private static native moom.Fn __fieldRead1771_2(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call1771_3(moom.Fn a0) throws Throwable;
private static native void __call1771_4(net.minecraft.util.IProgressUpdate a0, java.lang.String a1) throws Throwable;
private static native void __call1771_5(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1771_6(net.minecraft.util.IProgressUpdate a0, java.lang.String a1) throws Throwable;
private static native moom.Fn __fieldRead1771_7(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call1771_8(moom.Fn a0, boolean a1, net.minecraft.util.IProgressUpdate a2) throws Throwable;
private static native net.minecraft.world.gen.ChunkProviderServer __fieldRead1771_9(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.util.List __call1771_10(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native java.util.ArrayList __call1771_11(java.util.List a0) throws Throwable;
private static native java.util.Iterator __call1771_12(java.util.ArrayList a0) throws Throwable;
private static native boolean __call1771_13(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1771_14(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __cast1771_15(java.lang.Object a0) throws Throwable;
private static native moom.Br __fieldRead1771_16(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __fieldRead1771_17(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __fieldRead1771_18(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native boolean __call1771_19(moom.Br a0, int a1, int a2) throws Throwable;
private static native net.minecraft.world.gen.ChunkProviderServer __fieldRead1771_20(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __fieldRead1771_21(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __fieldRead1771_22(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __call1771_23(net.minecraft.world.gen.ChunkProviderServer a0, int a1, int a2) throws Throwable;
private static native java.lang.Throwable __call1177100_0(net.minecraft.world.MinecraftException a0) throws Throwable;
private static native java.lang.Throwable __call1177101_0(net.minecraft.world.MinecraftException a0) throws Throwable;
private static native java.lang.Throwable __call1177102_0(net.minecraft.world.MinecraftException a0) throws Throwable;
private static native java.lang.Throwable __call1177103_0(net.minecraft.world.MinecraftException a0) throws Throwable;
private static native java.lang.Throwable __call1177104_0(net.minecraft.world.MinecraftException a0) throws Throwable;
private static native java.lang.Throwable __call1177105_0(net.minecraft.world.MinecraftException a0) throws Throwable;
private static native java.lang.Throwable __call1177106_0(net.minecraft.world.MinecraftException a0) throws Throwable;
private static native java.lang.Throwable __call1177107_0(net.minecraft.world.MinecraftException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_442057ce96471928362f(net.minecraft.world.WorldServer a0, net.minecraft.entity.Entity a1) throws E;
private static final class __SourceHandler_442057ce96471928362f {

public static boolean f1772(net.minecraft.world.WorldServer receiver, net.minecraft.entity.Entity p0) throws Throwable {
    int forwardValue1772_33_0;
    boolean spill1772_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_33: {
    forward_join_32: {
    life2_3 = (__fieldRead1772_0() ^ 92658068525394L);
    life4_5 = __call1772_1();
    spill1772_0 = __call1772_2(receiver, p0);
    if (!((life4_5 == null))) {
        forwardValue1772_33_0 = __integerCategory1772_3(spill1772_0);
        break forward_join_33;
    }
    if (!(spill1772_0)) {
        break forward_join_32;
    }
    __call1772_11(__call1772_5(__fieldRead1772_4(receiver)), __fieldRead1772_6(p0), __fieldRead1772_7(p0), __fieldRead1772_8(p0), 0x1.0p9d, __call1772_10(__fieldRead1772_9(receiver)), new moom.Ad(p0));
    return __integerCategory1772_12(1);
    }
    forwardValue1772_33_0 = 0;
    }
    return __integerCategory1772_13(forwardValue1772_33_0);
}
public static void h1772_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1177200_0(p0);
}
public static void h1772_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1177201_0(p0);
}
private static native long __fieldRead1772_0() throws Throwable;
private static native java.lang.String __call1772_1() throws Throwable;
private static native boolean __call1772_2(net.minecraft.world.WorldServer a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native int __integerCategory1772_3(boolean value) throws Throwable;
private static native moom.Bl __fieldRead1772_4(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1772_5(moom.Bl a0) throws Throwable;
private static native double __fieldRead1772_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1772_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1772_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.EA __fieldRead1772_9(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call1772_10(moom.EA a0) throws Throwable;
private static native void __call1772_11(net.minecraft.server.management.ServerConfigurationManager a0, double a1, double a2, double a3, double a4, int a5, moom.Ad a6) throws Throwable;
private static native boolean __integerCategory1772_12(int value) throws Throwable;
private static native boolean __integerCategory1772_13(int value) throws Throwable;
private static native java.lang.Throwable __call1177200_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1177201_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.world.World __sourceHandlerCall_ade37178a3179bae1016(net.minecraft.world.WorldServer a0) throws E;
private static final class __SourceHandler_ade37178a3179bae1016 {

public static net.minecraft.world.World f1773(net.minecraft.world.WorldServer receiver) throws Throwable {
    moom.EG forwardValue1773_47_0;
    net.minecraft.scoreboard.ScoreboardSaveData forwardValue1773_77_0;
    net.minecraft.world.WorldServer forwardValue1773_141_0;
    java.lang.String spill1773_0;
    moom.EG spill1773_1;
    net.minecraft.scoreboard.ScoreboardSaveData spill1773_2;
    net.minecraft.world.WorldServer spill1773_3;
    long life1_3;
    java.lang.String life4_14;
    moom.EG life5_22;
    java.lang.String life3_23;
    net.minecraft.scoreboard.ScoreboardSaveData life6_71;
    forward_join_146: {
    forward_join_141: {
    forward_join_140: {
    forward_join_77: {
    forward_join_76: {
    forward_join_49: {
    forward_join_47: {
    forward_join_42: {
    life1_3 = (__fieldRead1773_0() ^ 15302918422637L);
    __fieldWrite1773_2(receiver, new moom.IO(__fieldRead1773_1(receiver)));
    life4_14 = __call1773_4(__fieldRead1773_3(receiver));
    spill1773_0 = __call1773_5();
    life5_22 = __cast1773_9(__call1773_8(__fieldRead1773_6(receiver), __classLiteral1773_7(), life4_14));
    life3_23 = spill1773_0;
    spill1773_1 = life5_22;
    if (!((life3_23 == null))) {
        forwardValue1773_47_0 = spill1773_1;
        break forward_join_47;
    }
    if (!((spill1773_1 == null))) {
        break forward_join_42;
    }
    __fieldWrite1773_10(receiver, new moom.EG(receiver));
    __call1773_13(__fieldRead1773_11(receiver), life4_14, __fieldRead1773_12(receiver));
    if (!((life3_23 != null))) {
        break forward_join_49;
    }
    }
    __fieldWrite1773_14(receiver, life5_22);
    forwardValue1773_47_0 = __fieldRead1773_15(receiver);
    }
    __call1773_16(forwardValue1773_47_0, receiver);
    }
    __fieldWrite1773_18(receiver, new moom.Bi(__fieldRead1773_17(receiver)));
    life6_71 = __cast1773_22(__call1773_21(__fieldRead1773_19(receiver), __classLiteral1773_20(), "scoreboard"));
    spill1773_2 = life6_71;
    if (!((life3_23 == null))) {
        forwardValue1773_77_0 = spill1773_2;
        break forward_join_77;
    }
    if (!((spill1773_2 == null))) {
        break forward_join_76;
    }
    life6_71 = new net.minecraft.scoreboard.ScoreboardSaveData();
    __call1773_24(__fieldRead1773_23(receiver), "scoreboard", life6_71);
    }
    forwardValue1773_77_0 = life6_71;
    }
    __call1773_26(forwardValue1773_77_0, __fieldRead1773_25(receiver));
    __call1773_29(__cast1773_28(__fieldRead1773_27(receiver)), life6_71);
    __call1773_35(__call1773_30(receiver), __call1773_32(__fieldRead1773_31(receiver)), __call1773_34(__fieldRead1773_33(receiver)));
    __call1773_39(__call1773_36(receiver), __call1773_38(__fieldRead1773_37(receiver)));
    __call1773_43(__call1773_40(receiver), __call1773_42(__fieldRead1773_41(receiver)));
    __call1773_47(__call1773_44(receiver), __call1773_46(__fieldRead1773_45(receiver)));
    __call1773_51(__call1773_48(receiver), __call1773_50(__fieldRead1773_49(receiver)));
    spill1773_3 = receiver;
    if (!((life3_23 == null))) {
        forwardValue1773_141_0 = spill1773_3;
        break forward_join_141;
    }
    if (!((__numericCompare1773_54(__call1773_53(__fieldRead1773_52(spill1773_3)), 0L) > 0))) {
        break forward_join_140;
    }
    __call1773_62(__call1773_55(receiver), __call1773_57(__fieldRead1773_56(receiver)), __call1773_59(__fieldRead1773_58(receiver)), __call1773_61(__fieldRead1773_60(receiver)));
    if (!((life3_23 != null))) {
        break forward_join_146;
    }
    }
    forwardValue1773_141_0 = receiver;
    }
    __call1773_66(__call1773_63(forwardValue1773_141_0), __call1773_65(__fieldRead1773_64(receiver)));
    }
    return receiver;
}
public static void h1773_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1177300_0(p0);
}
public static void h1773_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1177301_0(p0);
}
public static void h1773_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1177302_0(p0);
}
public static void h1773_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1177303_0(p0);
}
public static void h1773_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1177304_0(p0);
}
public static void h1773_5(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1177305_0(p0);
}
public static void h1773_6(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1177306_0(p0);
}
private static native long __fieldRead1773_0() throws Throwable;
private static native net.minecraft.world.storage.ISaveHandler __fieldRead1773_1(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __fieldWrite1773_2(net.minecraft.world.WorldServer a0, moom.IO a1) throws Throwable;
private static native moom.EA __fieldRead1773_3(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.lang.String __call1773_4(moom.EA a0) throws Throwable;
private static native java.lang.String __call1773_5() throws Throwable;
private static native moom.IO __fieldRead1773_6(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.lang.Object __classLiteral1773_7() throws Throwable;
private static native net.minecraft.world.WorldSavedData __call1773_8(moom.IO a0, java.lang.Object a1, java.lang.String a2) throws Throwable;
private static native moom.EG __cast1773_9(net.minecraft.world.WorldSavedData a0) throws Throwable;
private static native void __fieldWrite1773_10(net.minecraft.world.WorldServer a0, moom.EG a1) throws Throwable;
private static native moom.IO __fieldRead1773_11(net.minecraft.world.WorldServer a0) throws Throwable;
private static native moom.EG __fieldRead1773_12(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1773_13(moom.IO a0, java.lang.String a1, moom.EG a2) throws Throwable;
private static native void __fieldWrite1773_14(net.minecraft.world.WorldServer a0, moom.EG a1) throws Throwable;
private static native moom.EG __fieldRead1773_15(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1773_16(moom.EG a0, net.minecraft.world.WorldServer a1) throws Throwable;
private static native moom.Bl __fieldRead1773_17(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __fieldWrite1773_18(net.minecraft.world.WorldServer a0, moom.Bi a1) throws Throwable;
private static native moom.IO __fieldRead1773_19(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.lang.Object __classLiteral1773_20() throws Throwable;
private static native net.minecraft.world.WorldSavedData __call1773_21(moom.IO a0, java.lang.Object a1, java.lang.String a2) throws Throwable;
private static native net.minecraft.scoreboard.ScoreboardSaveData __cast1773_22(net.minecraft.world.WorldSavedData a0) throws Throwable;
private static native moom.IO __fieldRead1773_23(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1773_24(moom.IO a0, java.lang.String a1, net.minecraft.scoreboard.ScoreboardSaveData a2) throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __fieldRead1773_25(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1773_26(net.minecraft.scoreboard.ScoreboardSaveData a0, net.minecraft.scoreboard.Scoreboard a1) throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __fieldRead1773_27(net.minecraft.world.WorldServer a0) throws Throwable;
private static native moom.Bi __cast1773_28(net.minecraft.scoreboard.Scoreboard a0) throws Throwable;
private static native void __call1773_29(moom.Bi a0, net.minecraft.scoreboard.ScoreboardSaveData a1) throws Throwable;
private static native net.minecraft.world.border.WorldBorder __call1773_30(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1773_31(net.minecraft.world.WorldServer a0) throws Throwable;
private static native double __call1773_32(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1773_33(net.minecraft.world.WorldServer a0) throws Throwable;
private static native double __call1773_34(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1773_35(net.minecraft.world.border.WorldBorder a0, double a1, double a2) throws Throwable;
private static native net.minecraft.world.border.WorldBorder __call1773_36(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1773_37(net.minecraft.world.WorldServer a0) throws Throwable;
private static native double __call1773_38(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1773_39(net.minecraft.world.border.WorldBorder a0, double a1) throws Throwable;
private static native net.minecraft.world.border.WorldBorder __call1773_40(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1773_41(net.minecraft.world.WorldServer a0) throws Throwable;
private static native double __call1773_42(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1773_43(net.minecraft.world.border.WorldBorder a0, double a1) throws Throwable;
private static native net.minecraft.world.border.WorldBorder __call1773_44(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1773_45(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call1773_46(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1773_47(net.minecraft.world.border.WorldBorder a0, int a1) throws Throwable;
private static native net.minecraft.world.border.WorldBorder __call1773_48(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1773_49(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call1773_50(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1773_51(net.minecraft.world.border.WorldBorder a0, int a1) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1773_52(net.minecraft.world.WorldServer a0) throws Throwable;
private static native long __call1773_53(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native int __numericCompare1773_54(long a0, long a1) throws Throwable;
private static native net.minecraft.world.border.WorldBorder __call1773_55(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1773_56(net.minecraft.world.WorldServer a0) throws Throwable;
private static native double __call1773_57(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1773_58(net.minecraft.world.WorldServer a0) throws Throwable;
private static native double __call1773_59(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1773_60(net.minecraft.world.WorldServer a0) throws Throwable;
private static native long __call1773_61(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1773_62(net.minecraft.world.border.WorldBorder a0, double a1, double a2, long a3) throws Throwable;
private static native net.minecraft.world.border.WorldBorder __call1773_63(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1773_64(net.minecraft.world.WorldServer a0) throws Throwable;
private static native double __call1773_65(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1773_66(net.minecraft.world.border.WorldBorder a0, double a1) throws Throwable;
private static native java.lang.Throwable __call1177300_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1177301_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1177302_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1177303_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1177304_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1177305_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1177306_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_415ab7f6eec8e3c8c9d5(net.minecraft.world.WorldServer a0) throws E;
private static final class __SourceHandler_415ab7f6eec8e3c8c9d5 {

public static void f1162(net.minecraft.world.WorldServer receiver) throws Throwable {
    int forestValue1162_22_0;
    int spill1162_0;
    long life1_3;
    java.lang.String life3_5;
    int life4_24;
    int life5_28;
    int life6_30;
    forest_join_90: {
    forest_join_22: {
    forest_join_19: {
    life1_3 = (__fieldRead1162_0() ^ 57177411721922L);
    life3_5 = __call1162_1();
    spill1162_0 = __call1162_3(__fieldRead1162_2(receiver));
    if (!((life3_5 == null))) {
        forestValue1162_22_0 = spill1162_0;
        break forest_join_22;
    }
    if (!((spill1162_0 <= 0))) {
        break forest_join_19;
    }
    __call1162_6(__fieldRead1162_4(receiver), (__call1162_5(receiver) + 1));
    }
    forestValue1162_22_0 = __call1162_8(__fieldRead1162_7(receiver));
    }
    life4_24 = forestValue1162_22_0;
    life5_28 = __call1162_10(__fieldRead1162_9(receiver));
    life6_30 = 0;
    forest_cycle_29: while (true) {
    if (!((__call1162_12(__call1162_11(receiver, new moom.DT(life4_24, 0, life5_28))) == __fieldRead1162_13()))) {
        break forest_join_90;
    }
    life4_24 = (life4_24 + (__call1162_16(__fieldRead1162_14(receiver), __invokedynamic1162_15(18151, (5065226653097649099L ^ life1_3))) - __call1162_19(__fieldRead1162_17(receiver), __invokedynamic1162_18(18151, (5065226653097649099L ^ life1_3)))));
    life5_28 = (life5_28 + (__call1162_22(__fieldRead1162_20(receiver), __invokedynamic1162_21(18151, (5065226653097649099L ^ life1_3))) - __call1162_25(__fieldRead1162_23(receiver), __invokedynamic1162_24(18151, (5065226653097649099L ^ life1_3)))));
    life6_30 += 1;
    forest_cycle_81: while (true) {
    if (!((life6_30 == __invokedynamic1162_26(2811, (5278286910998425541L ^ life1_3))))) {
        continue forest_cycle_29;
    }
    if (!((life3_5 == null))) {
        continue forest_cycle_81;
    }
    break forest_cycle_81;
    }
    break forest_cycle_29;
    }
    }
    __call1162_28(__fieldRead1162_27(receiver), life4_24);
    __call1162_30(__fieldRead1162_29(receiver), life5_28);
    return;
}
public static void h1162_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116200_0(p0);
}
public static void h1162_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116201_0(p0);
}
private static native long __fieldRead1162_0() throws Throwable;
private static native java.lang.String __call1162_1() throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1162_2(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call1162_3(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1162_4(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call1162_5(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1162_6(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1162_7(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call1162_8(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1162_9(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call1162_10(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.block.Block __call1162_11(net.minecraft.world.WorldServer a0, moom.DT a1) throws Throwable;
private static native moom.fn __call1162_12(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead1162_13() throws Throwable;
private static native java.util.Random __fieldRead1162_14(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __invokedynamic1162_15(int a0, long a1) throws Throwable;
private static native int __call1162_16(java.util.Random a0, int a1) throws Throwable;
private static native java.util.Random __fieldRead1162_17(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __invokedynamic1162_18(int a0, long a1) throws Throwable;
private static native int __call1162_19(java.util.Random a0, int a1) throws Throwable;
private static native java.util.Random __fieldRead1162_20(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __invokedynamic1162_21(int a0, long a1) throws Throwable;
private static native int __call1162_22(java.util.Random a0, int a1) throws Throwable;
private static native java.util.Random __fieldRead1162_23(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __invokedynamic1162_24(int a0, long a1) throws Throwable;
private static native int __call1162_25(java.util.Random a0, int a1) throws Throwable;
private static native int __invokedynamic1162_26(int a0, long a1) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1162_27(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1162_28(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1162_29(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1162_30(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native java.lang.Throwable __call3116200_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116201_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c7abe5ed9f49e6a53aab(net.minecraft.world.WorldServer a0, moom.DT a1, net.minecraft.block.Block a2, int a3, int a4) throws E;
private static final class __SourceHandler_c7abe5ed9f49e6a53aab {

public static void f287(net.minecraft.world.WorldServer receiver, moom.DT p0, net.minecraft.block.Block p1, int p2, int p3) throws Throwable {
    moom.Er forwardValue287_23_0;
    int forwardValue287_23_1;
    int forwardValue287_46_0;
    java.lang.String spill287_0;
    moom.Er spill287_1;
    int spill287_2;
    boolean spill287_3;
    long life5_3;
    moom.Er life8_10;
    java.lang.String life7_11;
    forward_join_47: {
    forward_join_46: {
    forward_join_30: {
    forward_join_23: {
    life5_3 = (__fieldRead287_0() ^ 26308347298746L);
    spill287_0 = __call287_1();
    life8_10 = new moom.Er(p0, p1);
    life7_11 = spill287_0;
    spill287_1 = life8_10;
    spill287_2 = p3;
    if (!((life7_11 == null))) {
        forwardValue287_23_0 = spill287_1;
        forwardValue287_23_1 = spill287_2;
        break forward_join_23;
    }
    __call287_2(spill287_1, spill287_2);
    if (!((__call287_3(p1) != __fieldRead287_4()))) {
        break forward_join_30;
    }
    forwardValue287_23_0 = life8_10;
    forwardValue287_23_1 = p2;
    }
    __call287_7(forwardValue287_23_0, (((long) forwardValue287_23_1) + __call287_6(__fieldRead287_5(receiver))));
    }
    spill287_3 = __call287_9(__fieldRead287_8(receiver), life8_10);
    if (!((life7_11 == null))) {
        forwardValue287_46_0 = __integerCategory287_10(spill287_3);
        break forward_join_46;
    }
    if (!((!spill287_3))) {
        break forward_join_47;
    }
    __call287_12(__fieldRead287_11(receiver), life8_10);
    forwardValue287_46_0 = __integerCategory287_15(__call287_14(__fieldRead287_13(receiver), life8_10));
    }
    __discardScalar287_16(forwardValue287_46_0);
    }
    return;
}
public static void h287_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1028700_0(p0);
}
public static void h287_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1028701_0(p0);
}
public static void h287_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1028702_0(p0);
}
public static void h287_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1028703_0(p0);
}
private static native long __fieldRead287_0() throws Throwable;
private static native java.lang.String __call287_1() throws Throwable;
private static native void __call287_2(moom.Er a0, int a1) throws Throwable;
private static native moom.fn __call287_3(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead287_4() throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead287_5(net.minecraft.world.WorldServer a0) throws Throwable;
private static native long __call287_6(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native moom.Er __call287_7(moom.Er a0, long a1) throws Throwable;
private static native java.util.Set __fieldRead287_8(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call287_9(java.util.Set a0, moom.Er a1) throws Throwable;
private static native int __integerCategory287_10(boolean value) throws Throwable;
private static native java.util.Set __fieldRead287_11(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call287_12(java.util.Set a0, moom.Er a1) throws Throwable;
private static native java.util.TreeSet __fieldRead287_13(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call287_14(java.util.TreeSet a0, moom.Er a1) throws Throwable;
private static native int __integerCategory287_15(boolean value) throws Throwable;
private static native void __discardScalar287_16(int a0) throws Throwable;
private static native java.lang.Throwable __call1028700_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1028701_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1028702_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1028703_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_1556e4c045cfc8ce314b(net.minecraft.world.WorldServer a0, moom.EK a1) throws E;
private static final class __SourceHandler_1556e4c045cfc8ce314b {

public static void f1158(net.minecraft.world.WorldServer receiver, moom.EK p0) throws Throwable {
    net.minecraft.world.WorldServer forestValue1158_23_0;
    net.minecraft.world.WorldServer forestValue1158_40_0;
    moom.DT forestValue1158_80_0;
    net.minecraft.world.WorldServer forestValue1158_159_0;
    net.minecraft.world.WorldServer spill1158_0;
    moom.DT spill1158_1;
    net.minecraft.world.WorldServer spill1158_2;
    long life2_3;
    java.lang.String life4_5;
    net.minecraft.world.biome.WorldChunkManager life5_48;
    java.util.List life6_51;
    java.util.Random life7_57;
    moom.DT life8_69;
    int life9_71;
    int life10_75;
    int life11_77;
    int life12_96;
    forest_join_160: {
    forest_join_159: {
    forest_join_141: {
    forest_join_87: {
    forest_join_84: {
    forest_join_80: {
    forest_join_40: {
    forest_join_36: {
    forest_join_23: {
    forest_join_22: {
    life2_3 = (__fieldRead1158_0() ^ 120841002865031L);
    life4_5 = __call1158_1();
    spill1158_0 = receiver;
    if (!((life4_5 == null))) {
        forestValue1158_23_0 = spill1158_0;
        break forest_join_23;
    }
    if (!((!__call1158_3(__fieldRead1158_2(spill1158_0))))) {
        break forest_join_22;
    }
    __call1158_9(__fieldRead1158_4(receiver), __call1158_8(__fieldRead1158_5(), __call1158_7(__fieldRead1158_6(receiver))));
    if (!((life4_5 != null))) {
        break forest_join_160;
    }
    }
    forestValue1158_23_0 = receiver;
    }
    if (!((life4_5 == null))) {
        forestValue1158_40_0 = forestValue1158_23_0;
        break forest_join_40;
    }
    if (!((__call1158_11(__fieldRead1158_10(forestValue1158_23_0)) == __fieldRead1158_12()))) {
        break forest_join_36;
    }
    __call1158_16(__fieldRead1158_13(receiver), __call1158_15(__fieldRead1158_14()));
    if (!((life4_5 != null))) {
        break forest_join_160;
    }
    }
    __fieldWrite1158_17(receiver, 1);
    forestValue1158_40_0 = receiver;
    }
    life5_48 = __call1158_19(__fieldRead1158_18(forestValue1158_40_0));
    life6_51 = __call1158_20(life5_48);
    life7_57 = new java.util.Random(__call1158_21(receiver));
    life8_69 = __call1158_23(life5_48, 0, 0, __invokedynamic1158_22(21788, (7417160224540506989L ^ life2_3)), life6_51, life7_57);
    life9_71 = 0;
    life10_75 = __call1158_25(__fieldRead1158_24(receiver));
    life11_77 = 0;
    spill1158_1 = life8_69;
    if (!((life4_5 == null))) {
        forestValue1158_80_0 = spill1158_1;
        break forest_join_80;
    }
    if (!((spill1158_1 != null))) {
        break forest_join_84;
    }
    life9_71 = __call1158_26(life8_69);
    forestValue1158_80_0 = life8_69;
    }
    life11_77 = __call1158_27(forestValue1158_80_0);
    if (!((life4_5 != null))) {
        break forest_join_87;
    }
    }
    __call1158_29(__fieldRead1158_28(), "Unable to find spawn biome");
    }
    life12_96 = 0;
    forest_cycle_89: while (true) {
    if (!((!__call1158_31(__fieldRead1158_30(receiver), life9_71, life11_77)))) {
        break forest_join_141;
    }
    life9_71 = (life9_71 + (__call1158_33(life7_57, __invokedynamic1158_32(10193, (1964894534587435435L ^ life2_3))) - __call1158_35(life7_57, __invokedynamic1158_34(6446, (6456059364189501266L ^ life2_3)))));
    life11_77 = (life11_77 + (__call1158_37(life7_57, __invokedynamic1158_36(6446, (6456059364189501266L ^ life2_3))) - __call1158_39(life7_57, __invokedynamic1158_38(6446, (6456059364189501266L ^ life2_3)))));
    life12_96 += 1;
    forest_cycle_132: while (true) {
    if (!((life12_96 == __invokedynamic1158_40(12274, (2925696627567640970L ^ life2_3))))) {
        continue forest_cycle_89;
    }
    if (!((life4_5 == null))) {
        continue forest_cycle_132;
    }
    break forest_cycle_132;
    }
    break forest_cycle_89;
    }
    }
    __call1158_42(__fieldRead1158_41(receiver), new moom.DT(life9_71, life10_75, life11_77));
    spill1158_2 = receiver;
    if (!((life4_5 == null))) {
        forestValue1158_159_0 = spill1158_2;
        break forest_join_159;
    }
    __fieldWrite1158_43(spill1158_2, 0);
    if (!(__call1158_44(p0))) {
        break forest_join_160;
    }
    forestValue1158_159_0 = receiver;
    }
    __call1158_45(forestValue1158_159_0);
    }
    return;
}
public static void h1158_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3115800_0(p0);
}
public static void h1158_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3115801_0(p0);
}
public static void h1158_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3115802_0(p0);
}
public static void h1158_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3115803_0(p0);
}
public static void h1158_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3115804_0(p0);
}
public static void h1158_5(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3115805_0(p0);
}
public static void h1158_6(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3115806_0(p0);
}
public static void h1158_7(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3115807_0(p0);
}
public static void h1158_8(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3115808_0(p0);
}
public static void h1158_9(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3115809_0(p0);
}
private static native long __fieldRead1158_0() throws Throwable;
private static native java.lang.String __call1158_1() throws Throwable;
private static native moom.EA __fieldRead1158_2(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call1158_3(moom.EA a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1158_4(net.minecraft.world.WorldServer a0) throws Throwable;
private static native moom.DT __fieldRead1158_5() throws Throwable;
private static native moom.EA __fieldRead1158_6(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call1158_7(moom.EA a0) throws Throwable;
private static native moom.DT __call1158_8(moom.DT a0, int a1) throws Throwable;
private static native void __call1158_9(net.minecraft.world.storage.WorldInfo a0, moom.DT a1) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1158_10(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.world.WorldType __call1158_11(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.world.WorldType __fieldRead1158_12() throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1158_13(net.minecraft.world.WorldServer a0) throws Throwable;
private static native moom.DT __fieldRead1158_14() throws Throwable;
private static native moom.DT __call1158_15(moom.DT a0) throws Throwable;
private static native void __call1158_16(net.minecraft.world.storage.WorldInfo a0, moom.DT a1) throws Throwable;
private static native void __fieldWrite1158_17(net.minecraft.world.WorldServer a0, int a1) throws Throwable;
private static native moom.EA __fieldRead1158_18(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.world.biome.WorldChunkManager __call1158_19(moom.EA a0) throws Throwable;
private static native java.util.List __call1158_20(net.minecraft.world.biome.WorldChunkManager a0) throws Throwable;
private static native long __call1158_21(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __invokedynamic1158_22(int a0, long a1) throws Throwable;
private static native moom.DT __call1158_23(net.minecraft.world.biome.WorldChunkManager a0, int a1, int a2, int a3, java.util.List a4, java.util.Random a5) throws Throwable;
private static native moom.EA __fieldRead1158_24(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call1158_25(moom.EA a0) throws Throwable;
private static native int __call1158_26(moom.DT a0) throws Throwable;
private static native int __call1158_27(moom.DT a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead1158_28() throws Throwable;
private static native void __call1158_29(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native moom.EA __fieldRead1158_30(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call1158_31(moom.EA a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic1158_32(int a0, long a1) throws Throwable;
private static native int __call1158_33(java.util.Random a0, int a1) throws Throwable;
private static native int __invokedynamic1158_34(int a0, long a1) throws Throwable;
private static native int __call1158_35(java.util.Random a0, int a1) throws Throwable;
private static native int __invokedynamic1158_36(int a0, long a1) throws Throwable;
private static native int __call1158_37(java.util.Random a0, int a1) throws Throwable;
private static native int __invokedynamic1158_38(int a0, long a1) throws Throwable;
private static native int __call1158_39(java.util.Random a0, int a1) throws Throwable;
private static native int __invokedynamic1158_40(int a0, long a1) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1158_41(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1158_42(net.minecraft.world.storage.WorldInfo a0, moom.DT a1) throws Throwable;
private static native void __fieldWrite1158_43(net.minecraft.world.WorldServer a0, int a1) throws Throwable;
private static native boolean __call1158_44(moom.EK a0) throws Throwable;
private static native void __call1158_45(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.lang.Throwable __call3115800_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3115801_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3115802_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3115803_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3115804_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3115805_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3115806_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3115807_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3115808_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3115809_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d0bb851597576da7c17b(net.minecraft.world.WorldServer a0, net.minecraft.entity.Entity a1) throws E;
private static final class __SourceHandler_d0bb851597576da7c17b {

public static void f1777(net.minecraft.world.WorldServer receiver, net.minecraft.entity.Entity p0) throws Throwable {
    net.minecraft.entity.Entity[] lexicalValue1777_29_0;
    java.lang.String spill1777_0;
    net.minecraft.entity.Entity[] spill1777_1;
    long life2_3;
    java.lang.String life4_14;
    net.minecraft.entity.Entity[] life5_23;
    net.minecraft.entity.Entity[] life6_32;
    int life7_35;
    int life8_37;
    net.minecraft.entity.Entity life9_44;
    lexical_join_51: {
    lexical_join_29: {
    life2_3 = (__fieldRead1777_0() ^ 101637698028578L);
    spill1777_0 = __call1777_1();
    __call1777_2(receiver, p0);
    __call1777_5(__fieldRead1777_3(receiver), __call1777_4(p0));
    life4_14 = spill1777_0;
    __call1777_8(__fieldRead1777_6(receiver), __call1777_7(p0));
    life5_23 = __call1777_9(p0);
    spill1777_1 = life5_23;
    if (!((life4_14 == null))) {
        lexicalValue1777_29_0 = spill1777_1;
        break lexical_join_29;
    }
    if (!((spill1777_1 != null))) {
        break lexical_join_51;
    }
    lexicalValue1777_29_0 = life5_23;
    }
    life6_32 = lexicalValue1777_29_0;
    life7_35 = (life6_32).length;
    life8_37 = 0;
    lexical_cycle_35: while (true) {
    if (!((life8_37 < life7_35))) {
        break lexical_join_51;
    }
    life9_44 = (life6_32)[life8_37];
    __call1777_12(__fieldRead1777_10(receiver), __call1777_11(life9_44));
    life8_37 += 1;
    if (!((life4_14 != null))) { continue lexical_cycle_35; }
    break lexical_cycle_35;
    }
    }
    return;
}
public static void h1777_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1177700_0(p0);
}
private static native long __fieldRead1777_0() throws Throwable;
private static native java.lang.String __call1777_1() throws Throwable;
private static native void __call1777_2(net.minecraft.world.WorldServer a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native moom.Dd __fieldRead1777_3(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call1777_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.Object __call1777_5(moom.Dd a0, int a1) throws Throwable;
private static native java.util.Map __fieldRead1777_6(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.util.UUID __call1777_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.Object __call1777_8(java.util.Map a0, java.util.UUID a1) throws Throwable;
private static native net.minecraft.entity.Entity[] __call1777_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.Dd __fieldRead1777_10(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call1777_11(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.Object __call1777_12(moom.Dd a0, int a1) throws Throwable;
private static native java.lang.Throwable __call1177700_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_fe52c0e48b452659cebd(net.minecraft.world.WorldServer a0) throws E;
private static final class __SourceHandler_fe52c0e48b452659cebd {

public static void f1157(net.minecraft.world.WorldServer receiver) throws Throwable {
    net.minecraft.world.WorldServer forestValue1157_29_0;
    net.minecraft.world.WorldServer forestValue1157_31_0;
    net.minecraft.world.WorldServer spill1157_0;
    net.minecraft.world.WorldServer spill1157_1;
    int spill1157_2;
    long life1_3;
    java.lang.String life3_5;
    forest_join_31: {
    forest_join_30: {
    forest_join_29: {
    forest_join_28: {
    life1_3 = (__fieldRead1157_0() ^ 48332673225869L);
    life3_5 = __call1157_1();
    spill1157_0 = receiver;
    if (!((life3_5 == null))) {
        forestValue1157_29_0 = spill1157_0;
        break forest_join_29;
    }
    if (!(__call1157_3(__fieldRead1157_2(spill1157_0)))) {
        break forest_join_28;
    }
    spill1157_1 = receiver;
    if (!((life3_5 == null))) {
        forestValue1157_31_0 = spill1157_1;
        break forest_join_31;
    }
    net.minecraft.world.WorldServer __stackOp1157_4_0 = spill1157_1;
    net.minecraft.world.WorldServer __stackOp1157_6_0 = __stackOp1157_4_0;
    int __stackOp1157_6_1 = __fieldRead1157_5(__stackOp1157_4_0);
    spill1157_2 = __stackOp1157_6_1;
    __fieldWrite1157_7(__stackOp1157_6_0, (__stackOp1157_6_1 + 1));
    if (!((spill1157_2 >= __invokedynamic1157_8(3420, (6181959629437576739L ^ life1_3))))) {
        break forest_join_30;
    }
    return;
    }
    forestValue1157_29_0 = receiver;
    }
    __call1157_9(forestValue1157_29_0);
    }
    forestValue1157_31_0 = receiver;
    }
    __call1157_10(forestValue1157_31_0);
    return;
}
public static void h1157_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3115700_0(p0);
}
public static void h1157_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3115701_0(p0);
}
public static void h1157_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3115702_0(p0);
}
public static void h1157_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3115703_0(p0);
}
private static native long __fieldRead1157_0() throws Throwable;
private static native java.lang.String __call1157_1() throws Throwable;
private static native java.util.List __fieldRead1157_2(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call1157_3(java.util.List a0) throws Throwable;
private static native int __fieldRead1157_5(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __fieldWrite1157_7(net.minecraft.world.WorldServer a0, int a1) throws Throwable;
private static native int __invokedynamic1157_8(int a0, long a1) throws Throwable;
private static native void __call1157_9(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1157_10(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.lang.Throwable __call3115700_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3115701_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3115702_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3115703_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f012165b027b9ab05515(net.minecraft.world.WorldServer a0, moom.DT a1, net.minecraft.block.Block a2, int a3, int a4) throws E;
private static final class __SourceHandler_f012165b027b9ab05515 {

public static void f289(net.minecraft.world.WorldServer receiver, moom.DT p0, net.minecraft.block.Block p1, int p2, int p3) throws Throwable {
    int lexicalValue289_44_0;
    java.lang.String spill289_0;
    boolean spill289_1;
    long life5_3;
    moom.eS life8_12;
    java.lang.String life7_13;
    java.util.Iterator life9_20;
    moom.eS life10_27;
    lexical_join_44: {
    lexical_join_37: {
    life5_3 = (__fieldRead289_0() ^ 103498491618817L);
    spill289_0 = __call289_1();
    life8_12 = new moom.eS(p0, p1, p2, p3);
    life7_13 = spill289_0;
    life9_20 = __call289_4((__fieldRead289_2(receiver))[__fieldRead289_3(receiver)]);
    lexical_cycle_21: while (true) {
    lexical_join_35: {
    if (!(__call289_5(life9_20))) {
        break lexical_join_37;
    }
    life10_27 = __cast289_7(__call289_6(life9_20));
    spill289_1 = __call289_8(life10_27, life8_12);
    if (!((life7_13 == null))) {
        lexicalValue289_44_0 = __integerCategory289_9(spill289_1);
        break lexical_join_44;
    }
    if (!(spill289_1)) {
        break lexical_join_35;
    }
    return;
    }
    if (!((life7_13 != null))) { continue lexical_cycle_21; }
    break lexical_cycle_21;
    }
    }
    lexicalValue289_44_0 = __integerCategory289_13(__call289_12((__fieldRead289_10(receiver))[__fieldRead289_11(receiver)], life8_12));
    }
    __discardScalar289_14(lexicalValue289_44_0);
    return;
}
public static void h289_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1028900_0(p0);
}
private static native long __fieldRead289_0() throws Throwable;
private static native java.lang.String __call289_1() throws Throwable;
private static native moom.OG[] __fieldRead289_2(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __fieldRead289_3(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.util.Iterator __call289_4(moom.OG a0) throws Throwable;
private static native boolean __call289_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call289_6(java.util.Iterator a0) throws Throwable;
private static native moom.eS __cast289_7(java.lang.Object a0) throws Throwable;
private static native boolean __call289_8(moom.eS a0, moom.eS a1) throws Throwable;
private static native int __integerCategory289_9(boolean value) throws Throwable;
private static native moom.OG[] __fieldRead289_10(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __fieldRead289_11(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call289_12(moom.OG a0, moom.eS a1) throws Throwable;
private static native int __integerCategory289_13(boolean value) throws Throwable;
private static native void __discardScalar289_14(int a0) throws Throwable;
private static native java.lang.Throwable __call1028900_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> moom.DT __sourceHandlerCall_1486d1b6cb32f8493645(net.minecraft.world.WorldServer a0, moom.DT a1) throws E;
private static final class __SourceHandler_1486d1b6cb32f8493645 {

public static moom.DT f1780(net.minecraft.world.WorldServer receiver, moom.DT p0) throws Throwable {
    java.lang.Object forwardValue1780_47_0;
    moom.DT forwardValue1780_51_0;
    java.lang.String spill1780_0;
    java.util.List spill1780_1;
    long life2_3;
    moom.DT life5_8;
    java.lang.String life4_9;
    moom.CA life6_27;
    java.util.List life7_34;
    forward_join_51: {
    forward_join_50: {
    forward_join_47: {
    life2_3 = (__fieldRead1780_0() ^ 70426569777435L);
    spill1780_0 = __call1780_1();
    life5_8 = __call1780_2(receiver, p0);
    life4_9 = spill1780_0;
    life6_27 = __call1780_6(new moom.CA(life5_8, new moom.DT(__call1780_3(life5_8), __call1780_4(receiver), __call1780_5(life5_8))), 0x1.8p1d, 0x1.8p1d, 0x1.8p1d);
    life7_34 = __call1780_9(receiver, __classLiteral1780_7(), life6_27, __invokedynamic1780_8(receiver));
    spill1780_1 = life7_34;
    if (!((life4_9 == null))) {
        forwardValue1780_47_0 = spill1780_1;
        break forward_join_47;
    }
    if (!((!__call1780_10(spill1780_1)))) {
        break forward_join_50;
    }
    forwardValue1780_47_0 = __call1780_14(life7_34, __call1780_13(__fieldRead1780_11(receiver), __call1780_12(life7_34)));
    }
    forwardValue1780_51_0 = __call1780_16(__cast1780_15(forwardValue1780_47_0));
    break forward_join_51;
    }
    forwardValue1780_51_0 = life5_8;
    }
    return forwardValue1780_51_0;
}
public static void h1780_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1178000_0(p0);
}
public static void h1780_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1178001_0(p0);
}
private static native long __fieldRead1780_0() throws Throwable;
private static native java.lang.String __call1780_1() throws Throwable;
private static native moom.DT __call1780_2(net.minecraft.world.WorldServer a0, moom.DT a1) throws Throwable;
private static native int __call1780_3(moom.DT a0) throws Throwable;
private static native int __call1780_4(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call1780_5(moom.DT a0) throws Throwable;
private static native moom.CA __call1780_6(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native java.lang.Object __classLiteral1780_7() throws Throwable;
private static native com.google.common.base.Predicate __invokedynamic1780_8(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.util.List __call1780_9(net.minecraft.world.WorldServer a0, java.lang.Object a1, moom.CA a2, com.google.common.base.Predicate a3) throws Throwable;
private static native boolean __call1780_10(java.util.List a0) throws Throwable;
private static native java.util.Random __fieldRead1780_11(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call1780_12(java.util.List a0) throws Throwable;
private static native int __call1780_13(java.util.Random a0, int a1) throws Throwable;
private static native java.lang.Object __call1780_14(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __cast1780_15(java.lang.Object a0) throws Throwable;
private static native moom.DT __call1780_16(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native java.lang.Throwable __call1178000_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1178001_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_dd2620b101c51ad3aec5(net.minecraft.world.WorldServer a0) throws E;
private static final class __SourceHandler_dd2620b101c51ad3aec5 {

public static void f1161(net.minecraft.world.WorldServer receiver) throws Throwable {
    net.minecraft.world.WorldServer forestValue1161_29_0;
    int forestValue1161_30_0;
    net.minecraft.world.WorldServer forestValue1161_63_0;
    int forestValue1161_72_0;
    moom.Es forestValue1161_104_0;
    net.minecraft.world.WorldServer forestValue1161_104_1;
    int forestValue1161_104_2;
    int forestValue1161_104_3;
    int forestValue1161_104_4;
    moom.Es forestValue1161_105_0;
    net.minecraft.world.WorldServer forestValue1161_105_1;
    int forestValue1161_105_2;
    int forestValue1161_105_3;
    moom.Es forestValue1161_106_0;
    net.minecraft.world.WorldServer forestValue1161_106_1;
    int forestValue1161_106_2;
    int forestValue1161_106_3;
    int forestValue1161_106_4;
    net.minecraft.world.WorldServer forestValue1161_117_0;
    int forestValue1161_119_0;
    int forestValue1161_141_0;
    int forestValue1161_159_0;
    java.lang.String spill1161_0;
    boolean spill1161_1;
    net.minecraft.world.WorldServer spill1161_2;
    net.minecraft.world.WorldServer spill1161_3;
    net.minecraft.world.WorldServer spill1161_4;
    moom.Es spill1161_5;
    net.minecraft.world.WorldServer spill1161_6;
    boolean spill1161_7;
    boolean spill1161_8;
    int spill1161_9;
    int spill1161_10;
    long life1_3;
    java.lang.String life3_7;
    long life4_56;
    int life4_131;
    forest_join_159: {
    forest_join_152: {
    forest_join_141: {
    forest_join_129: {
    forest_join_119: {
    forest_join_117: {
    forest_join_108: {
    forest_join_106: {
    forest_join_105: {
    forest_join_104: {
    forest_join_72: {
    forest_join_64: {
    forest_join_63: {
    forest_join_62: {
    forest_join_30: {
    forest_join_29: {
    forest_join_24: {
    life1_3 = (__fieldRead1161_0() ^ 2608520091024L);
    spill1161_0 = __call1161_1();
    __call1161_2(receiver);
    life3_7 = spill1161_0;
    spill1161_1 = __call1161_4(__call1161_3(receiver));
    if (!((life3_7 == null))) {
        forestValue1161_30_0 = __integerCategory1161_5(spill1161_1);
        break forest_join_30;
    }
    if (!(spill1161_1)) {
        break forest_join_24;
    }
    spill1161_2 = receiver;
    if (!((life3_7 == null))) {
        forestValue1161_29_0 = spill1161_2;
        break forest_join_29;
    }
    if (!((__call1161_6(spill1161_2) != __fieldRead1161_7()))) {
        break forest_join_24;
    }
    __call1161_10(__call1161_8(receiver), __fieldRead1161_9());
    }
    __call1161_13(__call1161_12(__fieldRead1161_11(receiver)));
    forestValue1161_29_0 = receiver;
    }
    forestValue1161_30_0 = __integerCategory1161_15(__call1161_14(forestValue1161_29_0));
    }
    if (!((life3_7 == null))) {
        forestValue1161_72_0 = forestValue1161_30_0;
        break forest_join_72;
    }
    if (!((forestValue1161_30_0 != 0))) {
        break forest_join_64;
    }
    spill1161_3 = receiver;
    if (!((life3_7 == null))) {
        forestValue1161_63_0 = spill1161_3;
        break forest_join_63;
    }
    if (!(__call1161_17(__call1161_16(spill1161_3), "doDaylightCycle"))) {
        break forest_join_62;
    }
    life4_56 = (__call1161_19(__fieldRead1161_18(receiver)) + __invokedynamic1161_20(6815, (4047666182812173342L ^ life1_3)));
    __call1161_23(__fieldRead1161_21(receiver), (life4_56 - (life4_56 % __invokedynamic1161_22(20881, (5402707636755713809L ^ life1_3)))));
    }
    forestValue1161_63_0 = receiver;
    }
    __call1161_24(forestValue1161_63_0);
    }
    __call1161_26(__fieldRead1161_25(receiver), "mobSpawner");
    forestValue1161_72_0 = __integerCategory1161_29(__call1161_28(__call1161_27(receiver), "doMobSpawning"));
    }
    if (!((life3_7 == null))) {
        forestValue1161_119_0 = forestValue1161_72_0;
        break forest_join_119;
    }
    if (!((forestValue1161_72_0 != 0))) {
        break forest_join_108;
    }
    spill1161_4 = receiver;
    if (!((life3_7 == null))) {
        forestValue1161_117_0 = spill1161_4;
        break forest_join_117;
    }
    if (!((__call1161_31(__fieldRead1161_30(spill1161_4)) != __fieldRead1161_32()))) {
        break forest_join_108;
    }
    spill1161_5 = __fieldRead1161_33(receiver);
    spill1161_6 = receiver;
    spill1161_7 = __fieldRead1161_34(receiver);
    spill1161_8 = __fieldRead1161_35(receiver);
    spill1161_9 = __numericCompare1161_39((__call1161_37(__fieldRead1161_36(receiver)) % __invokedynamic1161_38(17453, (289140970476722862L ^ life1_3))), 0L);
    if (!((life3_7 == null))) {
        forestValue1161_104_0 = spill1161_5;
        forestValue1161_104_1 = spill1161_6;
        forestValue1161_104_2 = __integerCategory1161_40(spill1161_7);
        forestValue1161_104_3 = __integerCategory1161_41(spill1161_8);
        forestValue1161_104_4 = spill1161_9;
        break forest_join_104;
    }
    if (!((spill1161_9 == 0))) {
        forestValue1161_105_0 = spill1161_5;
        forestValue1161_105_1 = spill1161_6;
        forestValue1161_105_2 = __integerCategory1161_42(spill1161_7);
        forestValue1161_105_3 = __integerCategory1161_43(spill1161_8);
        break forest_join_105;
    }
    forestValue1161_104_0 = spill1161_5;
    forestValue1161_104_1 = spill1161_6;
    forestValue1161_104_2 = __integerCategory1161_44(spill1161_7);
    forestValue1161_104_3 = __integerCategory1161_45(spill1161_8);
    forestValue1161_104_4 = 1;
    }
    forestValue1161_106_0 = forestValue1161_104_0;
    forestValue1161_106_1 = forestValue1161_104_1;
    forestValue1161_106_2 = forestValue1161_104_2;
    forestValue1161_106_3 = forestValue1161_104_3;
    forestValue1161_106_4 = forestValue1161_104_4;
    break forest_join_106;
    }
    forestValue1161_106_0 = forestValue1161_105_0;
    forestValue1161_106_1 = forestValue1161_105_1;
    forestValue1161_106_2 = forestValue1161_105_2;
    forestValue1161_106_3 = forestValue1161_105_3;
    forestValue1161_106_4 = 0;
    }
    __call1161_46(forestValue1161_106_0, forestValue1161_106_1, forestValue1161_106_2, forestValue1161_106_3, forestValue1161_106_4);
    }
    __call1161_48(__fieldRead1161_47(receiver), "chunkSource");
    __call1161_50(__fieldRead1161_49(receiver));
    forestValue1161_117_0 = receiver;
    }
    forestValue1161_119_0 = __call1161_51(forestValue1161_117_0, 0x1.0p0f);
    }
    life4_131 = forestValue1161_119_0;
    spill1161_10 = life4_131;
    if (!((life3_7 == null))) {
        forestValue1161_141_0 = spill1161_10;
        break forest_join_141;
    }
    if (!((spill1161_10 != __call1161_52(receiver)))) {
        break forest_join_129;
    }
    __call1161_53(receiver, life4_131);
    }
    __call1161_57(__fieldRead1161_54(receiver), (__call1161_56(__fieldRead1161_55(receiver)) + 1L));
    forestValue1161_141_0 = __integerCategory1161_60(__call1161_59(__call1161_58(receiver), "doDaylightCycle"));
    }
    if (!((life3_7 == null))) {
        forestValue1161_159_0 = forestValue1161_141_0;
        break forest_join_159;
    }
    if (!((forestValue1161_141_0 != 0))) {
        break forest_join_152;
    }
    __call1161_64(__fieldRead1161_61(receiver), (__call1161_63(__fieldRead1161_62(receiver)) + 1L));
    }
    __call1161_66(__fieldRead1161_65(receiver), "tickPending");
    forestValue1161_159_0 = __integerCategory1161_68(__call1161_67(receiver, 0));
    }
    __discardScalar1161_69(forestValue1161_159_0);
    __call1161_71(__fieldRead1161_70(receiver), "tickBlocks");
    __call1161_72(receiver);
    __call1161_74(__fieldRead1161_73(receiver), "chunkMap");
    __call1161_76(__fieldRead1161_75(receiver));
    __call1161_78(__fieldRead1161_77(receiver), "village");
    __call1161_80(__fieldRead1161_79(receiver));
    __call1161_82(__fieldRead1161_81(receiver));
    __call1161_84(__fieldRead1161_83(receiver), "portalForcer");
    __call1161_87(__fieldRead1161_85(receiver), __call1161_86(receiver));
    __call1161_89(__fieldRead1161_88(receiver));
    __call1161_90(receiver);
    return;
}
public static void h1161_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116100_0(p0);
}
public static void h1161_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116101_0(p0);
}
public static void h1161_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116102_0(p0);
}
public static void h1161_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116103_0(p0);
}
public static void h1161_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116104_0(p0);
}
public static void h1161_5(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116105_0(p0);
}
public static void h1161_6(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116106_0(p0);
}
public static void h1161_7(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116107_0(p0);
}
public static void h1161_8(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116108_0(p0);
}
public static void h1161_9(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116109_0(p0);
}
public static void h1161_10(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116110_0(p0);
}
public static void h1161_11(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116111_0(p0);
}
public static void h1161_12(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116112_0(p0);
}
public static void h1161_13(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116113_0(p0);
}
public static void h1161_14(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116114_0(p0);
}
public static void h1161_15(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116115_0(p0);
}
private static native long __fieldRead1161_0() throws Throwable;
private static native java.lang.String __call1161_1() throws Throwable;
private static native void __call1161_2(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call1161_3(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call1161_4(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native int __integerCategory1161_5(boolean value) throws Throwable;
private static native net.minecraft.world.EnumDifficulty __call1161_6(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.world.EnumDifficulty __fieldRead1161_7() throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call1161_8(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.world.EnumDifficulty __fieldRead1161_9() throws Throwable;
private static native void __call1161_10(net.minecraft.world.storage.WorldInfo a0, net.minecraft.world.EnumDifficulty a1) throws Throwable;
private static native moom.EA __fieldRead1161_11(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.world.biome.WorldChunkManager __call1161_12(moom.EA a0) throws Throwable;
private static native void __call1161_13(net.minecraft.world.biome.WorldChunkManager a0) throws Throwable;
private static native boolean __call1161_14(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __integerCategory1161_15(boolean value) throws Throwable;
private static native net.minecraft.world.GameRules __call1161_16(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call1161_17(net.minecraft.world.GameRules a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1161_18(net.minecraft.world.WorldServer a0) throws Throwable;
private static native long __call1161_19(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native long __invokedynamic1161_20(int a0, long a1) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1161_21(net.minecraft.world.WorldServer a0) throws Throwable;
private static native long __invokedynamic1161_22(int a0, long a1) throws Throwable;
private static native void __call1161_23(net.minecraft.world.storage.WorldInfo a0, long a1) throws Throwable;
private static native void __call1161_24(net.minecraft.world.WorldServer a0) throws Throwable;
private static native moom.A9 __fieldRead1161_25(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1161_26(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.world.GameRules __call1161_27(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call1161_28(net.minecraft.world.GameRules a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1161_29(boolean value) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1161_30(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.world.WorldType __call1161_31(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.world.WorldType __fieldRead1161_32() throws Throwable;
private static native moom.Es __fieldRead1161_33(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __fieldRead1161_34(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __fieldRead1161_35(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1161_36(net.minecraft.world.WorldServer a0) throws Throwable;
private static native long __call1161_37(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native long __invokedynamic1161_38(int a0, long a1) throws Throwable;
private static native int __numericCompare1161_39(long a0, long a1) throws Throwable;
private static native int __integerCategory1161_40(boolean value) throws Throwable;
private static native int __integerCategory1161_41(boolean value) throws Throwable;
private static native int __integerCategory1161_42(boolean value) throws Throwable;
private static native int __integerCategory1161_43(boolean value) throws Throwable;
private static native int __integerCategory1161_44(boolean value) throws Throwable;
private static native int __integerCategory1161_45(boolean value) throws Throwable;
private static native int __call1161_46(moom.Es a0, net.minecraft.world.WorldServer a1, int a2, int a3, int a4) throws Throwable;
private static native moom.A9 __fieldRead1161_47(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1161_48(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native moom.Fn __fieldRead1161_49(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call1161_50(moom.Fn a0) throws Throwable;
private static native int __call1161_51(net.minecraft.world.WorldServer a0, float a1) throws Throwable;
private static native int __call1161_52(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1161_53(net.minecraft.world.WorldServer a0, int a1) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1161_54(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1161_55(net.minecraft.world.WorldServer a0) throws Throwable;
private static native long __call1161_56(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1161_57(net.minecraft.world.storage.WorldInfo a0, long a1) throws Throwable;
private static native net.minecraft.world.GameRules __call1161_58(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call1161_59(net.minecraft.world.GameRules a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1161_60(boolean value) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1161_61(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1161_62(net.minecraft.world.WorldServer a0) throws Throwable;
private static native long __call1161_63(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1161_64(net.minecraft.world.storage.WorldInfo a0, long a1) throws Throwable;
private static native moom.A9 __fieldRead1161_65(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1161_66(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native boolean __call1161_67(net.minecraft.world.WorldServer a0, int a1) throws Throwable;
private static native int __integerCategory1161_68(boolean value) throws Throwable;
private static native void __discardScalar1161_69(int a0) throws Throwable;
private static native moom.A9 __fieldRead1161_70(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1161_71(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native void __call1161_72(net.minecraft.world.WorldServer a0) throws Throwable;
private static native moom.A9 __fieldRead1161_73(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1161_74(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native moom.Br __fieldRead1161_75(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1161_76(moom.Br a0) throws Throwable;
private static native moom.A9 __fieldRead1161_77(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1161_78(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native moom.EG __fieldRead1161_79(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1161_80(moom.EG a0) throws Throwable;
private static native moom.Eb __fieldRead1161_81(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1161_82(moom.Eb a0) throws Throwable;
private static native moom.A9 __fieldRead1161_83(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1161_84(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native moom.Et __fieldRead1161_85(net.minecraft.world.WorldServer a0) throws Throwable;
private static native long __call1161_86(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1161_87(moom.Et a0, long a1) throws Throwable;
private static native moom.A9 __fieldRead1161_88(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1161_89(moom.A9 a0) throws Throwable;
private static native void __call1161_90(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.lang.Throwable __call3116100_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116101_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116102_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116103_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116104_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116105_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116106_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116107_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116108_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116109_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116110_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116111_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116112_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116113_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116114_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116115_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_df53dd9789f805d38bc1(net.minecraft.world.WorldServer a0) throws E;
private static final class __SourceHandler_df53dd9789f805d38bc1 {

public static void f723(net.minecraft.world.WorldServer receiver) throws Throwable {
    int forestValue723_41_0;
    int forestValue723_62_0;
    int forestValue723_68_0;
    java.lang.String spill723_0;
    int spill723_1;
    long life1_3;
    int life4_7;
    java.lang.String life3_8;
    forest_join_117: {
    forest_join_89: {
    forest_join_80: {
    forest_join_68: {
    forest_join_62: {
    forest_join_61: {
    forest_join_41: {
    forest_join_36: {
    life1_3 = (__fieldRead723_0() ^ 77543999857836L);
    spill723_0 = __call723_1();
    life4_7 = __integerCategory723_3(__call723_2(receiver));
    life3_8 = spill723_0;
    __call723_4(receiver);
    spill723_1 = __numericCompare723_7(__fieldRead723_5(receiver), __fieldRead723_6(receiver));
    if (!((life3_8 == null))) {
        forestValue723_41_0 = spill723_1;
        break forest_join_41;
    }
    if (!((spill723_1 != 0))) {
        break forest_join_36;
    }
    __call723_14(__call723_9(__fieldRead723_8(receiver)), new moom.Ac(__invokedynamic723_10(21353, (6519707216310077499L ^ life1_3)), __fieldRead723_11(receiver)), __call723_13(__fieldRead723_12(receiver)));
    }
    forestValue723_41_0 = __numericCompare723_17(__fieldRead723_15(receiver), __fieldRead723_16(receiver));
    }
    if (!((life3_8 == null))) {
        forestValue723_62_0 = forestValue723_41_0;
        break forest_join_62;
    }
    if (!((forestValue723_41_0 != 0))) {
        break forest_join_61;
    }
    __call723_24(__call723_19(__fieldRead723_18(receiver)), new moom.Ac(__invokedynamic723_20(19377, (4260397159456182512L ^ life1_3)), __fieldRead723_21(receiver)), __call723_23(__fieldRead723_22(receiver)));
    }
    forestValue723_62_0 = life4_7;
    }
    if (!((life3_8 == null))) {
        forestValue723_68_0 = forestValue723_62_0;
        break forest_join_68;
    }
    if (!((forestValue723_62_0 != __integerCategory723_26(__call723_25(receiver))))) {
        break forest_join_117;
    }
    forestValue723_68_0 = life4_7;
    }
    if (!((forestValue723_68_0 != 0))) {
        break forest_join_80;
    }
    __call723_29(__call723_28(__fieldRead723_27(receiver)), new moom.Ac(2, 0x0.0p0f));
    if (!((life3_8 != null))) {
        break forest_join_89;
    }
    }
    __call723_32(__call723_31(__fieldRead723_30(receiver)), new moom.Ac(1, 0x0.0p0f));
    }
    __call723_37(__call723_34(__fieldRead723_33(receiver)), new moom.Ac(__invokedynamic723_35(15530, (252045901936257004L ^ life1_3)), __fieldRead723_36(receiver)));
    __call723_42(__call723_39(__fieldRead723_38(receiver)), new moom.Ac(__invokedynamic723_40(18151, (5065210701467458981L ^ life1_3)), __fieldRead723_41(receiver)));
    }
    return;
}
public static void h723_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3072300_0(p0);
}
public static void h723_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3072301_0(p0);
}
public static void h723_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3072302_0(p0);
}
public static void h723_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3072303_0(p0);
}
public static void h723_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3072304_0(p0);
}
public static void h723_5(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3072305_0(p0);
}
public static void h723_6(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3072306_0(p0);
}
public static void h723_7(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3072307_0(p0);
}
private static native long __fieldRead723_0() throws Throwable;
private static native java.lang.String __call723_1() throws Throwable;
private static native boolean __call723_2(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __integerCategory723_3(boolean value) throws Throwable;
private static native void __call723_4(net.minecraft.world.WorldServer a0) throws Throwable;
private static native float __fieldRead723_5(net.minecraft.world.WorldServer a0) throws Throwable;
private static native float __fieldRead723_6(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __numericCompare723_7(float a0, float a1) throws Throwable;
private static native moom.Bl __fieldRead723_8(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call723_9(moom.Bl a0) throws Throwable;
private static native int __invokedynamic723_10(int a0, long a1) throws Throwable;
private static native float __fieldRead723_11(net.minecraft.world.WorldServer a0) throws Throwable;
private static native moom.EA __fieldRead723_12(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call723_13(moom.EA a0) throws Throwable;
private static native void __call723_14(net.minecraft.server.management.ServerConfigurationManager a0, moom.Ac a1, int a2) throws Throwable;
private static native float __fieldRead723_15(net.minecraft.world.WorldServer a0) throws Throwable;
private static native float __fieldRead723_16(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __numericCompare723_17(float a0, float a1) throws Throwable;
private static native moom.Bl __fieldRead723_18(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call723_19(moom.Bl a0) throws Throwable;
private static native int __invokedynamic723_20(int a0, long a1) throws Throwable;
private static native float __fieldRead723_21(net.minecraft.world.WorldServer a0) throws Throwable;
private static native moom.EA __fieldRead723_22(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call723_23(moom.EA a0) throws Throwable;
private static native void __call723_24(net.minecraft.server.management.ServerConfigurationManager a0, moom.Ac a1, int a2) throws Throwable;
private static native boolean __call723_25(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __integerCategory723_26(boolean value) throws Throwable;
private static native moom.Bl __fieldRead723_27(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call723_28(moom.Bl a0) throws Throwable;
private static native void __call723_29(net.minecraft.server.management.ServerConfigurationManager a0, moom.Ac a1) throws Throwable;
private static native moom.Bl __fieldRead723_30(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call723_31(moom.Bl a0) throws Throwable;
private static native void __call723_32(net.minecraft.server.management.ServerConfigurationManager a0, moom.Ac a1) throws Throwable;
private static native moom.Bl __fieldRead723_33(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call723_34(moom.Bl a0) throws Throwable;
private static native int __invokedynamic723_35(int a0, long a1) throws Throwable;
private static native float __fieldRead723_36(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call723_37(net.minecraft.server.management.ServerConfigurationManager a0, moom.Ac a1) throws Throwable;
private static native moom.Bl __fieldRead723_38(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call723_39(moom.Bl a0) throws Throwable;
private static native int __invokedynamic723_40(int a0, long a1) throws Throwable;
private static native float __fieldRead723_41(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call723_42(net.minecraft.server.management.ServerConfigurationManager a0, moom.Ac a1) throws Throwable;
private static native java.lang.Throwable __call3072300_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3072301_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3072302_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3072303_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3072304_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3072305_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3072306_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3072307_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_cbf6546ddd8516518550(net.minecraft.world.WorldServer a0) throws E;
private static final class __SourceHandler_cbf6546ddd8516518550 {

public static void f1160(net.minecraft.world.WorldServer receiver) throws Throwable {
    net.minecraft.world.WorldServer forestValue1160_16_0;
    java.lang.Object forestValue1160_53_0;
    int forestValue1160_203_0;
    int forestValue1160_271_0;
    int forestValue1160_289_0;
    int forestValue1160_314_0;
    int forestValue1160_318_0;
    int forestValue1160_328_0;
    int forestValue1160_346_0;
    java.lang.String spill1160_0;
    net.minecraft.world.WorldServer spill1160_1;
    int spill1160_2;
    boolean spill1160_3;
    boolean spill1160_4;
    boolean spill1160_5;
    boolean spill1160_6;
    boolean spill1160_7;
    boolean spill1160_8;
    moom.Fs spill1160_9;
    boolean spill1160_10;
    boolean spill1160_11;
    long life1_3;
    java.lang.String life3_7;
    java.util.Iterator life4_20;
    moom.Ee life5_27;
    int life4_44;
    int life5_46;
    java.util.Iterator life6_50;
    moom.Ee life7_57;
    int life8_66;
    int life9_75;
    net.minecraft.world.chunk.Chunk life10_86;
    int life11_144;
    moom.DT life12_175;
    int life11_232;
    moom.DT life12_263;
    moom.DT life13_266;
    moom.Fs[] life12_342;
    int life13_345;
    int life14_347;
    moom.Fs life15_354;
    int life16_370;
    int life17_390;
    int life18_398;
    int life19_412;
    int life20_426;
    net.minecraft.block.state.IBlockState life21_433;
    net.minecraft.block.Block life22_436;
    forest_join_451: {
    forest_join_40: {
    forest_join_38: {
    forest_join_16: {
    life1_3 = (__fieldRead1160_0() ^ 139957236156973L);
    spill1160_0 = __call1160_1();
    __call1160_2(receiver);
    life3_7 = spill1160_0;
    spill1160_1 = receiver;
    if (!((life3_7 == null))) {
        forestValue1160_16_0 = spill1160_1;
        break forest_join_16;
    }
    if (!((__call1160_4(__fieldRead1160_3(spill1160_1)) == __fieldRead1160_5()))) {
        break forest_join_40;
    }
    forestValue1160_16_0 = receiver;
    }
    life4_20 = __call1160_7(__fieldRead1160_6(forestValue1160_16_0));
    forest_cycle_19: while (true) {
    if (!(__call1160_8(life4_20))) {
        break forest_join_38;
    }
    life5_27 = __cast1160_10(__call1160_9(life4_20));
    __call1160_14(__call1160_13(receiver, __fieldRead1160_11(life5_27), __fieldRead1160_12(life5_27)), 0);
    if (!((life3_7 == null))) {
        break forest_join_451;
    }
    if (!((life3_7 != null))) {
        continue forest_cycle_19;
    }
    break forest_cycle_19;
    }
    }
    if (!((life3_7 != null))) {
        break forest_join_451;
    }
    }
    life4_44 = 0;
    life5_46 = 0;
    life6_50 = __call1160_16(__fieldRead1160_15(receiver));
    forest_cycle_48: while (true) {
    forest_join_449: {
    forest_join_446: {
    if (!(__call1160_17(life6_50))) {
        break forest_join_451;
    }
    forestValue1160_53_0 = __call1160_18(life6_50);
    forest_cycle_53: while (true) {
    forest_join_318: {
    forest_join_314: {
    forest_join_306: {
    forest_join_289: {
    forest_join_287: {
    forest_join_271: {
    forest_join_269: {
    forest_join_203: {
    forest_join_191: {
    life7_57 = __cast1160_19(forestValue1160_53_0);
    life8_66 = (__fieldRead1160_20(life7_57) * __invokedynamic1160_21(16156, (7080634055691913920L ^ life1_3)));
    life9_75 = (__fieldRead1160_22(life7_57) * __invokedynamic1160_23(19079, (7952949049006931794L ^ life1_3)));
    __call1160_25(__fieldRead1160_24(receiver), "getChunk");
    life10_86 = __call1160_28(receiver, __fieldRead1160_26(life7_57), __fieldRead1160_27(life7_57));
    __call1160_29(receiver, life8_66, life9_75, life10_86);
    __call1160_31(__fieldRead1160_30(receiver), "tickChunk");
    __call1160_32(life10_86, 0);
    __call1160_34(__fieldRead1160_33(receiver), "thunder");
    spill1160_2 = __call1160_37(__fieldRead1160_35(receiver), __invokedynamic1160_36(23841, (1128328229500627168L ^ life1_3)));
    if (!((life3_7 == null))) {
        forestValue1160_203_0 = spill1160_2;
        break forest_join_203;
    }
    if (!((spill1160_2 == 0))) {
        break forest_join_191;
    }
    spill1160_3 = __call1160_38(receiver);
    if (!((life3_7 == null))) {
        forestValue1160_203_0 = __integerCategory1160_39(spill1160_3);
        break forest_join_203;
    }
    if (!(spill1160_3)) {
        break forest_join_191;
    }
    spill1160_4 = __call1160_40(receiver);
    if (!((life3_7 == null))) {
        forestValue1160_203_0 = __integerCategory1160_41(spill1160_4);
        break forest_join_203;
    }
    if (!(spill1160_4)) {
        break forest_join_191;
    }
    __fieldWrite1160_44(receiver, ((__fieldRead1160_42(receiver) * 3) + __invokedynamic1160_43(3815, (2814964106232888098L ^ life1_3))));
    life11_144 = (__fieldRead1160_45(receiver) >> 2);
    life12_175 = __call1160_49(receiver, new moom.DT((life8_66 + (life11_144 & __invokedynamic1160_46(17545, (2046981482908463454L ^ life1_3)))), 0, (life9_75 + ((life11_144 >> __invokedynamic1160_47(18151, (5065150482690945828L ^ life1_3))) & __invokedynamic1160_48(9995, (6567748553588593365L ^ life1_3))))));
    spill1160_5 = __call1160_50(receiver, life12_175);
    if (!((life3_7 == null))) {
        forestValue1160_203_0 = __integerCategory1160_51(spill1160_5);
        break forest_join_203;
    }
    if (!(spill1160_5)) {
        break forest_join_191;
    }
    __call1160_55(receiver, new moom.tu(receiver, ((double) __call1160_52(life12_175)), ((double) __call1160_53(life12_175)), ((double) __call1160_54(life12_175))));
    }
    __call1160_57(__fieldRead1160_56(receiver), "iceandsnow");
    forestValue1160_203_0 = __call1160_60(__fieldRead1160_58(receiver), __invokedynamic1160_59(19079, (7952949049006931794L ^ life1_3)));
    }
    if (!((life3_7 == null))) {
        forestValue1160_314_0 = forestValue1160_203_0;
        break forest_join_314;
    }
    if (!((forestValue1160_203_0 == 0))) {
        break forest_join_306;
    }
    __fieldWrite1160_63(receiver, ((__fieldRead1160_61(receiver) * 3) + __invokedynamic1160_62(26180, (7881600538970755974L ^ life1_3))));
    life11_232 = (__fieldRead1160_64(receiver) >> 2);
    life12_263 = __call1160_68(receiver, new moom.DT((life8_66 + (life11_232 & __invokedynamic1160_65(9995, (6567748553588593365L ^ life1_3)))), 0, (life9_75 + ((life11_232 >> __invokedynamic1160_66(18151, (5065150482690945828L ^ life1_3))) & __invokedynamic1160_67(9995, (6567748553588593365L ^ life1_3))))));
    life13_266 = __call1160_69(life12_263);
    spill1160_6 = __call1160_70(receiver, life13_266);
    if (!((life3_7 == null))) {
        forestValue1160_271_0 = __integerCategory1160_71(spill1160_6);
        break forest_join_271;
    }
    if (!(spill1160_6)) {
        break forest_join_269;
    }
    __call1160_74(receiver, life13_266, __call1160_73(__fieldRead1160_72()));
    }
    forestValue1160_271_0 = __integerCategory1160_76(__call1160_75(receiver));
    }
    if (!((life3_7 == null))) {
        forestValue1160_289_0 = forestValue1160_271_0;
        break forest_join_289;
    }
    if (!((forestValue1160_271_0 != 0))) {
        break forest_join_287;
    }
    spill1160_7 = __call1160_77(receiver, life12_263, 1);
    if (!((life3_7 == null))) {
        forestValue1160_289_0 = __integerCategory1160_78(spill1160_7);
        break forest_join_289;
    }
    if (!(spill1160_7)) {
        break forest_join_287;
    }
    __call1160_81(receiver, life12_263, __call1160_80(__fieldRead1160_79()));
    }
    forestValue1160_289_0 = __integerCategory1160_83(__call1160_82(receiver));
    }
    if (!((life3_7 == null))) {
        forestValue1160_318_0 = forestValue1160_289_0;
        break forest_join_318;
    }
    if (!((forestValue1160_289_0 != 0))) {
        break forest_join_306;
    }
    spill1160_8 = __call1160_85(__call1160_84(receiver, life13_266));
    if (!((life3_7 == null))) {
        forestValue1160_318_0 = __integerCategory1160_86(spill1160_8);
        break forest_join_318;
    }
    if (!(spill1160_8)) {
        break forest_join_306;
    }
    __call1160_89(__call1160_88(__call1160_87(receiver, life13_266)), receiver, life13_266);
    }
    __call1160_91(__fieldRead1160_90(receiver), "tickBlocks");
    forestValue1160_314_0 = __call1160_93(__call1160_92(receiver), "randomTickSpeed");
    }
    life11_232 = forestValue1160_314_0;
    if (!((life3_7 == null))) {
        break forest_join_449;
    }
    forestValue1160_318_0 = life11_232;
    }
    if (!((forestValue1160_318_0 > 0))) {
        break forest_join_446;
    }
    life12_342 = __call1160_94(life10_86);
    life13_345 = (life12_342).length;
    life14_347 = 0;
    forest_cycle_327: while (true) {
    forest_join_444: {
    forest_join_443: {
    forestValue1160_328_0 = life14_347;
    forest_cycle_328: while (true) {
    forest_join_346: {
    if (!((forestValue1160_328_0 < life13_345))) {
        break forest_join_446;
    }
    life15_354 = (life12_342)[life14_347];
    if (!((life3_7 == null))) {
        break forest_join_444;
    }
    spill1160_9 = life15_354;
    if (!((life3_7 == null))) {
        forestValue1160_53_0 = spill1160_9;
        continue forest_cycle_53;
    }
    if (!((spill1160_9 != null))) {
        break forest_join_443;
    }
    spill1160_10 = __call1160_95(life15_354);
    if (!((life3_7 == null))) {
        forestValue1160_346_0 = __integerCategory1160_96(spill1160_10);
        break forest_join_346;
    }
    if (!(spill1160_10)) {
        break forest_join_443;
    }
    forestValue1160_346_0 = 0;
    }
    life16_370 = forestValue1160_346_0;
    forest_cycle_347: while (true) {
    forest_join_441: {
    forest_join_440: {
    if (!((life16_370 < life11_232))) {
        break forest_join_443;
    }
    __fieldWrite1160_99(receiver, ((__fieldRead1160_97(receiver) * 3) + __invokedynamic1160_98(26180, (7881600538970755974L ^ life1_3))));
    life17_390 = (__fieldRead1160_100(receiver) >> 2);
    life18_398 = (life17_390 & __invokedynamic1160_101(9995, (6567748553588593365L ^ life1_3)));
    life19_412 = ((life17_390 >> __invokedynamic1160_102(18151, (5065150482690945828L ^ life1_3))) & __invokedynamic1160_103(9995, (6567748553588593365L ^ life1_3)));
    life20_426 = ((life17_390 >> __invokedynamic1160_104(19079, (7952949049006931794L ^ life1_3))) & __invokedynamic1160_105(9995, (6567748553588593365L ^ life1_3)));
    life5_46 += 1;
    life21_433 = __call1160_106(life15_354, life18_398, life20_426, life19_412);
    life22_436 = __call1160_107(life21_433);
    if (!((life3_7 == null))) {
        break forest_join_441;
    }
    spill1160_11 = __call1160_108(life22_436);
    if (!((life3_7 == null))) {
        forestValue1160_328_0 = __integerCategory1160_109(spill1160_11);
        continue forest_cycle_328;
    }
    if (!(spill1160_11)) {
        break forest_join_440;
    }
    life4_44 += 1;
    __call1160_112(life22_436, receiver, new moom.DT((life18_398 + life8_66), (life20_426 + __call1160_110(life15_354)), (life19_412 + life9_75)), life21_433, __fieldRead1160_111(receiver));
    }
    life16_370 += 1;
    }
    if (!((life3_7 != null))) {
        continue forest_cycle_347;
    }
    break forest_cycle_347;
    }
    break forest_cycle_328;
    }
    }
    life14_347 += 1;
    }
    if (!((life3_7 != null))) {
        continue forest_cycle_327;
    }
    break forest_cycle_327;
    }
    break forest_cycle_53;
    }
    }
    __call1160_114(__fieldRead1160_113(receiver));
    }
    if (!((life3_7 != null))) {
        continue forest_cycle_48;
    }
    break forest_cycle_48;
    }
    }
    return;
}
public static void h1160_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116000_0(p0);
}
public static void h1160_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116001_0(p0);
}
public static void h1160_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116002_0(p0);
}
public static void h1160_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116003_0(p0);
}
public static void h1160_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116004_0(p0);
}
public static void h1160_5(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116005_0(p0);
}
public static void h1160_6(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116006_0(p0);
}
public static void h1160_7(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116007_0(p0);
}
public static void h1160_8(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116008_0(p0);
}
public static void h1160_9(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116009_0(p0);
}
public static void h1160_10(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116010_0(p0);
}
public static void h1160_11(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116011_0(p0);
}
public static void h1160_12(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116012_0(p0);
}
public static void h1160_13(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116013_0(p0);
}
public static void h1160_14(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116014_0(p0);
}
public static void h1160_15(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116015_0(p0);
}
public static void h1160_16(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116016_0(p0);
}
public static void h1160_17(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116017_0(p0);
}
public static void h1160_18(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116018_0(p0);
}
public static void h1160_19(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116019_0(p0);
}
public static void h1160_20(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116020_0(p0);
}
public static void h1160_21(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116021_0(p0);
}
public static void h1160_22(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116022_0(p0);
}
public static void h1160_23(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116023_0(p0);
}
public static void h1160_24(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116024_0(p0);
}
public static void h1160_25(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3116025_0(p0);
}
private static native long __fieldRead1160_0() throws Throwable;
private static native java.lang.String __call1160_1() throws Throwable;
private static native void __call1160_2(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1160_3(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.world.WorldType __call1160_4(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.world.WorldType __fieldRead1160_5() throws Throwable;
private static native java.util.Set __fieldRead1160_6(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.util.Iterator __call1160_7(java.util.Set a0) throws Throwable;
private static native boolean __call1160_8(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1160_9(java.util.Iterator a0) throws Throwable;
private static native moom.Ee __cast1160_10(java.lang.Object a0) throws Throwable;
private static native int __fieldRead1160_11(moom.Ee a0) throws Throwable;
private static native int __fieldRead1160_12(moom.Ee a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call1160_13(net.minecraft.world.WorldServer a0, int a1, int a2) throws Throwable;
private static native void __call1160_14(net.minecraft.world.chunk.Chunk a0, int a1) throws Throwable;
private static native java.util.Set __fieldRead1160_15(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.util.Iterator __call1160_16(java.util.Set a0) throws Throwable;
private static native boolean __call1160_17(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1160_18(java.util.Iterator a0) throws Throwable;
private static native moom.Ee __cast1160_19(java.lang.Object a0) throws Throwable;
private static native int __fieldRead1160_20(moom.Ee a0) throws Throwable;
private static native int __invokedynamic1160_21(int a0, long a1) throws Throwable;
private static native int __fieldRead1160_22(moom.Ee a0) throws Throwable;
private static native int __invokedynamic1160_23(int a0, long a1) throws Throwable;
private static native moom.A9 __fieldRead1160_24(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1160_25(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native int __fieldRead1160_26(moom.Ee a0) throws Throwable;
private static native int __fieldRead1160_27(moom.Ee a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call1160_28(net.minecraft.world.WorldServer a0, int a1, int a2) throws Throwable;
private static native void __call1160_29(net.minecraft.world.WorldServer a0, int a1, int a2, net.minecraft.world.chunk.Chunk a3) throws Throwable;
private static native moom.A9 __fieldRead1160_30(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1160_31(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native void __call1160_32(net.minecraft.world.chunk.Chunk a0, int a1) throws Throwable;
private static native moom.A9 __fieldRead1160_33(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1160_34(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native java.util.Random __fieldRead1160_35(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __invokedynamic1160_36(int a0, long a1) throws Throwable;
private static native int __call1160_37(java.util.Random a0, int a1) throws Throwable;
private static native boolean __call1160_38(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __integerCategory1160_39(boolean value) throws Throwable;
private static native boolean __call1160_40(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __integerCategory1160_41(boolean value) throws Throwable;
private static native int __fieldRead1160_42(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __invokedynamic1160_43(int a0, long a1) throws Throwable;
private static native void __fieldWrite1160_44(net.minecraft.world.WorldServer a0, int a1) throws Throwable;
private static native int __fieldRead1160_45(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __invokedynamic1160_46(int a0, long a1) throws Throwable;
private static native int __invokedynamic1160_47(int a0, long a1) throws Throwable;
private static native int __invokedynamic1160_48(int a0, long a1) throws Throwable;
private static native moom.DT __call1160_49(net.minecraft.world.WorldServer a0, moom.DT a1) throws Throwable;
private static native boolean __call1160_50(net.minecraft.world.WorldServer a0, moom.DT a1) throws Throwable;
private static native int __integerCategory1160_51(boolean value) throws Throwable;
private static native int __call1160_52(moom.DT a0) throws Throwable;
private static native int __call1160_53(moom.DT a0) throws Throwable;
private static native int __call1160_54(moom.DT a0) throws Throwable;
private static native boolean __call1160_55(net.minecraft.world.WorldServer a0, moom.tu a1) throws Throwable;
private static native moom.A9 __fieldRead1160_56(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1160_57(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native java.util.Random __fieldRead1160_58(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __invokedynamic1160_59(int a0, long a1) throws Throwable;
private static native int __call1160_60(java.util.Random a0, int a1) throws Throwable;
private static native int __fieldRead1160_61(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __invokedynamic1160_62(int a0, long a1) throws Throwable;
private static native void __fieldWrite1160_63(net.minecraft.world.WorldServer a0, int a1) throws Throwable;
private static native int __fieldRead1160_64(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __invokedynamic1160_65(int a0, long a1) throws Throwable;
private static native int __invokedynamic1160_66(int a0, long a1) throws Throwable;
private static native int __invokedynamic1160_67(int a0, long a1) throws Throwable;
private static native moom.DT __call1160_68(net.minecraft.world.WorldServer a0, moom.DT a1) throws Throwable;
private static native moom.DT __call1160_69(moom.DT a0) throws Throwable;
private static native boolean __call1160_70(net.minecraft.world.WorldServer a0, moom.DT a1) throws Throwable;
private static native int __integerCategory1160_71(boolean value) throws Throwable;
private static native net.minecraft.block.Block __fieldRead1160_72() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1160_73(net.minecraft.block.Block a0) throws Throwable;
private static native boolean __call1160_74(net.minecraft.world.WorldServer a0, moom.DT a1, net.minecraft.block.state.IBlockState a2) throws Throwable;
private static native boolean __call1160_75(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __integerCategory1160_76(boolean value) throws Throwable;
private static native boolean __call1160_77(net.minecraft.world.WorldServer a0, moom.DT a1, int a2) throws Throwable;
private static native int __integerCategory1160_78(boolean value) throws Throwable;
private static native net.minecraft.block.Block __fieldRead1160_79() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1160_80(net.minecraft.block.Block a0) throws Throwable;
private static native boolean __call1160_81(net.minecraft.world.WorldServer a0, moom.DT a1, net.minecraft.block.state.IBlockState a2) throws Throwable;
private static native boolean __call1160_82(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __integerCategory1160_83(boolean value) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __call1160_84(net.minecraft.world.WorldServer a0, moom.DT a1) throws Throwable;
private static native boolean __call1160_85(net.minecraft.world.biome.BiomeGenBase a0) throws Throwable;
private static native int __integerCategory1160_86(boolean value) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1160_87(net.minecraft.world.WorldServer a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call1160_88(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native void __call1160_89(net.minecraft.block.Block a0, net.minecraft.world.WorldServer a1, moom.DT a2) throws Throwable;
private static native moom.A9 __fieldRead1160_90(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1160_91(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.world.GameRules __call1160_92(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call1160_93(net.minecraft.world.GameRules a0, java.lang.String a1) throws Throwable;
private static native moom.Fs[] __call1160_94(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native boolean __call1160_95(moom.Fs a0) throws Throwable;
private static native int __integerCategory1160_96(boolean value) throws Throwable;
private static native int __fieldRead1160_97(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __invokedynamic1160_98(int a0, long a1) throws Throwable;
private static native void __fieldWrite1160_99(net.minecraft.world.WorldServer a0, int a1) throws Throwable;
private static native int __fieldRead1160_100(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __invokedynamic1160_101(int a0, long a1) throws Throwable;
private static native int __invokedynamic1160_102(int a0, long a1) throws Throwable;
private static native int __invokedynamic1160_103(int a0, long a1) throws Throwable;
private static native int __invokedynamic1160_104(int a0, long a1) throws Throwable;
private static native int __invokedynamic1160_105(int a0, long a1) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1160_106(moom.Fs a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.block.Block __call1160_107(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native boolean __call1160_108(net.minecraft.block.Block a0) throws Throwable;
private static native int __integerCategory1160_109(boolean value) throws Throwable;
private static native int __call1160_110(moom.Fs a0) throws Throwable;
private static native java.util.Random __fieldRead1160_111(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1160_112(net.minecraft.block.Block a0, net.minecraft.world.WorldServer a1, moom.DT a2, net.minecraft.block.state.IBlockState a3, java.util.Random a4) throws Throwable;
private static native moom.A9 __fieldRead1160_113(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1160_114(moom.A9 a0) throws Throwable;
private static native java.lang.Throwable __call3116000_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116001_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116002_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116003_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116004_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116005_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116006_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116007_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116008_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116009_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116010_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116011_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116012_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116013_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116014_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116015_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116016_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116017_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116018_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116019_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116020_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116021_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116022_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116023_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116024_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3116025_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_0b24986077340bf9c0e9(net.minecraft.world.WorldServer a0) throws E;
private static final class __SourceHandler_0b24986077340bf9c0e9 {

public static boolean f1783(net.minecraft.world.WorldServer receiver) throws Throwable {
    int lexicalValue1783_40_0;
    int lexicalValue1783_44_0;
    int lexicalValue1783_46_0;
    boolean spill1783_0;
    boolean spill1783_1;
    boolean spill1783_2;
    boolean spill1783_3;
    long life1_3;
    java.lang.String life3_5;
    java.util.Iterator life4_28;
    net.minecraft.entity.player.EntityPlayer life5_35;
    lexical_join_46: {
    lexical_join_45: {
    lexical_join_44: {
    lexical_join_43: {
    life1_3 = (__fieldRead1783_0() ^ 71156976191953L);
    life3_5 = __call1783_1();
    spill1783_0 = __fieldRead1783_2(receiver);
    if (!((life3_5 == null))) {
        lexicalValue1783_46_0 = __integerCategory1783_3(spill1783_0);
        break lexical_join_46;
    }
    if (!(spill1783_0)) {
        break lexical_join_45;
    }
    spill1783_1 = __fieldRead1783_4(receiver);
    if (!((life3_5 == null))) {
        lexicalValue1783_46_0 = __integerCategory1783_5(spill1783_1);
        break lexical_join_46;
    }
    if (!((!spill1783_1))) {
        break lexical_join_45;
    }
    life4_28 = __call1783_7(__fieldRead1783_6(receiver));
    lexical_cycle_20: while (true) {
    lexical_join_41: {
    lexical_join_40: {
    lexical_join_39: {
    if (!(__call1783_8(life4_28))) {
        break lexical_join_43;
    }
    life5_35 = __cast1783_10(__call1783_9(life4_28));
    spill1783_2 = __call1783_11(life5_35);
    if (!((life3_5 == null))) {
        lexicalValue1783_44_0 = __integerCategory1783_12(spill1783_2);
        break lexical_join_44;
    }
    if (!((life3_5 == null))) {
        lexicalValue1783_40_0 = __integerCategory1783_13(spill1783_2);
        break lexical_join_40;
    }
    if (!((!spill1783_2))) {
        break lexical_join_39;
    }
    spill1783_3 = __call1783_14(life5_35);
    if (!((life3_5 == null))) {
        lexicalValue1783_40_0 = __integerCategory1783_15(spill1783_3);
        break lexical_join_40;
    }
    if (!((!spill1783_3))) {
        break lexical_join_41;
    }
    }
    lexicalValue1783_40_0 = 0;
    }
    return __integerCategory1783_16(lexicalValue1783_40_0);
    }
    if (!((life3_5 != null))) { continue lexical_cycle_20; }
    break lexical_cycle_20;
    }
    }
    lexicalValue1783_44_0 = 1;
    }
    return __integerCategory1783_17(lexicalValue1783_44_0);
    }
    lexicalValue1783_46_0 = 0;
    }
    return __integerCategory1783_18(lexicalValue1783_46_0);
}
public static void h1783_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1178300_0(p0);
}
public static void h1783_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1178301_0(p0);
}
public static void h1783_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1178302_0(p0);
}
public static void h1783_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1178303_0(p0);
}
public static void h1783_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1178304_0(p0);
}
public static void h1783_5(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1178305_0(p0);
}
public static void h1783_6(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1178306_0(p0);
}
private static native long __fieldRead1783_0() throws Throwable;
private static native java.lang.String __call1783_1() throws Throwable;
private static native boolean __fieldRead1783_2(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __integerCategory1783_3(boolean value) throws Throwable;
private static native boolean __fieldRead1783_4(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __integerCategory1783_5(boolean value) throws Throwable;
private static native java.util.List __fieldRead1783_6(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.util.Iterator __call1783_7(java.util.List a0) throws Throwable;
private static native boolean __call1783_8(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1783_9(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast1783_10(java.lang.Object a0) throws Throwable;
private static native boolean __call1783_11(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native int __integerCategory1783_12(boolean value) throws Throwable;
private static native int __integerCategory1783_13(boolean value) throws Throwable;
private static native boolean __call1783_14(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native int __integerCategory1783_15(boolean value) throws Throwable;
private static native boolean __integerCategory1783_16(int value) throws Throwable;
private static native boolean __integerCategory1783_17(int value) throws Throwable;
private static native boolean __integerCategory1783_18(int value) throws Throwable;
private static native java.lang.Throwable __call1178300_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1178301_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1178302_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1178303_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1178304_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1178305_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1178306_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_dc532b4ca9ff7c629ea0(net.minecraft.world.WorldServer a0) throws E;
private static final class __SourceHandler_dc532b4ca9ff7c629ea0 {

public static void f1784(net.minecraft.world.WorldServer receiver) throws Throwable {
    int lexicalValue1784_16_0;
    int lexicalValue1784_42_0;
    net.minecraft.world.WorldServer lexicalValue1784_52_0;
    int lexicalValue1784_52_1;
    net.minecraft.world.WorldServer lexicalValue1784_61_0;
    int lexicalValue1784_61_1;
    net.minecraft.world.WorldServer lexicalValue1784_62_0;
    net.minecraft.world.WorldServer lexicalValue1784_63_0;
    int lexicalValue1784_63_1;
    java.lang.String spill1784_0;
    boolean spill1784_1;
    boolean spill1784_2;
    net.minecraft.world.WorldServer spill1784_3;
    int spill1784_4;
    long life1_3;
    java.lang.String life3_8;
    int life4_19;
    int life5_21;
    java.util.Iterator life6_25;
    net.minecraft.entity.player.EntityPlayer life7_32;
    lexical_join_64: {
    lexical_join_63: {
    lexical_join_62: {
    lexical_join_61: {
    lexical_join_52: {
    lexical_join_46: {
    lexical_join_16: {
    life1_3 = (__fieldRead1784_0() ^ 40937606278375L);
    spill1784_0 = __call1784_1();
    __fieldWrite1784_2(receiver, 0);
    life3_8 = spill1784_0;
    spill1784_1 = __call1784_4(__fieldRead1784_3(receiver));
    if (!((life3_8 == null))) {
        lexicalValue1784_16_0 = __integerCategory1784_5(spill1784_1);
        break lexical_join_16;
    }
    if (!((!spill1784_1))) {
        break lexical_join_64;
    }
    lexicalValue1784_16_0 = 0;
    }
    life4_19 = lexicalValue1784_16_0;
    life5_21 = 0;
    life6_25 = __call1784_7(__fieldRead1784_6(receiver));
    lexical_cycle_23: while (true) {
    lexical_join_44: {
    lexical_join_42: {
    lexical_join_40: {
    if (!(__call1784_8(life6_25))) {
        break lexical_join_46;
    }
    life7_32 = __cast1784_10(__call1784_9(life6_25));
    if (!((life3_8 == null))) {
        break lexical_join_64;
    }
    spill1784_2 = __call1784_11(life7_32);
    if (!((life3_8 == null))) {
        lexicalValue1784_42_0 = __integerCategory1784_12(spill1784_2);
        break lexical_join_42;
    }
    if (!(spill1784_2)) {
        break lexical_join_40;
    }
    life4_19 += 1;
    if (!((life3_8 != null))) {
        break lexical_join_44;
    }
    }
    lexicalValue1784_42_0 = __integerCategory1784_14(__call1784_13(life7_32));
    }
    if (!((lexicalValue1784_42_0 != 0))) {
        break lexical_join_44;
    }
    life5_21 += 1;
    }
    if (!((life3_8 != null))) { continue lexical_cycle_23; }
    break lexical_cycle_23;
    }
    }
    spill1784_3 = receiver;
    spill1784_4 = life5_21;
    if (!((life3_8 == null))) {
        lexicalValue1784_52_0 = spill1784_3;
        lexicalValue1784_52_1 = spill1784_4;
        break lexical_join_52;
    }
    if (!((spill1784_4 > 0))) {
        lexicalValue1784_62_0 = spill1784_3;
        break lexical_join_62;
    }
    lexicalValue1784_52_0 = spill1784_3;
    lexicalValue1784_52_1 = life5_21;
    }
    if (!((life3_8 == null))) {
        lexicalValue1784_61_0 = lexicalValue1784_52_0;
        lexicalValue1784_61_1 = lexicalValue1784_52_1;
        break lexical_join_61;
    }
    if (!((lexicalValue1784_52_1 >= (__call1784_16(__fieldRead1784_15(receiver)) - life4_19)))) {
        lexicalValue1784_62_0 = lexicalValue1784_52_0;
        break lexical_join_62;
    }
    lexicalValue1784_61_0 = lexicalValue1784_52_0;
    lexicalValue1784_61_1 = 1;
    }
    lexicalValue1784_63_0 = lexicalValue1784_61_0;
    lexicalValue1784_63_1 = lexicalValue1784_61_1;
    break lexical_join_63;
    }
    lexicalValue1784_63_0 = lexicalValue1784_62_0;
    lexicalValue1784_63_1 = 0;
    }
    __fieldWrite1784_17(lexicalValue1784_63_0, lexicalValue1784_63_1);
    }
    return;
}
public static void h1784_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1178400_0(p0);
}
public static void h1784_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1178401_0(p0);
}
public static void h1784_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1178402_0(p0);
}
public static void h1784_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1178403_0(p0);
}
public static void h1784_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1178404_0(p0);
}
public static void h1784_5(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1178405_0(p0);
}
public static void h1784_6(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1178406_0(p0);
}
public static void h1784_7(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1178407_0(p0);
}
private static native long __fieldRead1784_0() throws Throwable;
private static native java.lang.String __call1784_1() throws Throwable;
private static native void __fieldWrite1784_2(net.minecraft.world.WorldServer a0, int a1) throws Throwable;
private static native java.util.List __fieldRead1784_3(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call1784_4(java.util.List a0) throws Throwable;
private static native int __integerCategory1784_5(boolean value) throws Throwable;
private static native java.util.List __fieldRead1784_6(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.util.Iterator __call1784_7(java.util.List a0) throws Throwable;
private static native boolean __call1784_8(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1784_9(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast1784_10(java.lang.Object a0) throws Throwable;
private static native boolean __call1784_11(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native int __integerCategory1784_12(boolean value) throws Throwable;
private static native boolean __call1784_13(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native int __integerCategory1784_14(boolean value) throws Throwable;
private static native java.util.List __fieldRead1784_15(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call1784_16(java.util.List a0) throws Throwable;
private static native void __fieldWrite1784_17(net.minecraft.world.WorldServer a0, int a1) throws Throwable;
private static native java.lang.Throwable __call1178400_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1178401_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1178402_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1178403_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1178404_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1178405_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1178406_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1178407_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_cc0360ecd27b137771ed(net.minecraft.world.WorldServer a0) throws E;
private static final class __SourceHandler_cc0360ecd27b137771ed {

public static void f1785(net.minecraft.world.WorldServer receiver) throws Throwable {
    net.minecraft.entity.player.EntityPlayer lexicalValue1785_28_0;
    java.lang.String spill1785_0;
    net.minecraft.entity.player.EntityPlayer spill1785_1;
    long life1_3;
    java.lang.String life3_8;
    java.util.Iterator life4_12;
    net.minecraft.entity.player.EntityPlayer life5_19;
    lexical_join_36: {
    lexical_join_34: {
    life1_3 = (__fieldRead1785_0() ^ 67436014221714L);
    spill1785_0 = __call1785_1();
    __fieldWrite1785_2(receiver, 0);
    life3_8 = spill1785_0;
    life4_12 = __call1785_4(__fieldRead1785_3(receiver));
    lexical_cycle_13: while (true) {
    lexical_join_32: {
    lexical_join_28: {
    if (!(__call1785_5(life4_12))) {
        break lexical_join_34;
    }
    life5_19 = __cast1785_7(__call1785_6(life4_12));
    if (!((life3_8 == null))) {
        break lexical_join_36;
    }
    spill1785_1 = life5_19;
    if (!((life3_8 == null))) {
        lexicalValue1785_28_0 = spill1785_1;
        break lexical_join_28;
    }
    if (!(__call1785_8(spill1785_1))) {
        break lexical_join_32;
    }
    lexicalValue1785_28_0 = life5_19;
    }
    __call1785_9(lexicalValue1785_28_0, 0, 0, 1);
    }
    if (!((life3_8 != null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    __call1785_10(receiver);
    }
    return;
}
public static void h1785_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1178500_0(p0);
}
public static void h1785_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1178501_0(p0);
}
public static void h1785_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1178502_0(p0);
}
private static native long __fieldRead1785_0() throws Throwable;
private static native java.lang.String __call1785_1() throws Throwable;
private static native void __fieldWrite1785_2(net.minecraft.world.WorldServer a0, int a1) throws Throwable;
private static native java.util.List __fieldRead1785_3(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.util.Iterator __call1785_4(java.util.List a0) throws Throwable;
private static native boolean __call1785_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1785_6(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast1785_7(java.lang.Object a0) throws Throwable;
private static native boolean __call1785_8(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native void __call1785_9(net.minecraft.entity.player.EntityPlayer a0, int a1, int a2, int a3) throws Throwable;
private static native void __call1785_10(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.lang.Throwable __call1178500_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1178501_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1178502_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_3f81b8684ea6e2a60b92(net.minecraft.world.WorldServer a0, net.minecraft.entity.EntityLivingBase a1) throws E;
private static final class __SourceHandler_3f81b8684ea6e2a60b92 {

public static boolean f1786(net.minecraft.world.WorldServer receiver, net.minecraft.entity.EntityLivingBase p0) throws Throwable {
    net.minecraft.entity.EntityLivingBase forwardValue1786_11_0;
    int forwardValue1786_19_0;
    int forwardValue1786_23_0;
    int forwardValue1786_25_0;
    net.minecraft.entity.EntityLivingBase spill1786_0;
    boolean spill1786_1;
    long life2_3;
    java.lang.String life4_5;
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_19: {
    forward_join_11: {
    life2_3 = (__fieldRead1786_0() ^ 90571323086624L);
    life4_5 = __call1786_1();
    spill1786_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue1786_11_0 = spill1786_0;
        break forward_join_11;
    }
    if (!((spill1786_0 != null))) {
        break forward_join_24;
    }
    forwardValue1786_11_0 = p0;
    }
    spill1786_1 = __call1786_2(forwardValue1786_11_0);
    if (!((life4_5 == null))) {
        forwardValue1786_19_0 = __integerCategory1786_3(spill1786_1);
        break forward_join_19;
    }
    if (!(spill1786_1)) {
        break forward_join_24;
    }
    forwardValue1786_19_0 = __integerCategory1786_6(__call1786_5(receiver, __call1786_4(p0)));
    }
    if (!((life4_5 == null))) {
        forwardValue1786_23_0 = forwardValue1786_19_0;
        break forward_join_23;
    }
    if (!((forwardValue1786_19_0 != 0))) {
        break forward_join_24;
    }
    forwardValue1786_23_0 = 1;
    }
    forwardValue1786_25_0 = forwardValue1786_23_0;
    break forward_join_25;
    }
    forwardValue1786_25_0 = 0;
    }
    return __integerCategory1786_7(forwardValue1786_25_0);
}
public static void h1786_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1178600_0(p0);
}
public static void h1786_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1178601_0(p0);
}
public static void h1786_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1178602_0(p0);
}
public static void h1786_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1178603_0(p0);
}
private static native long __fieldRead1786_0() throws Throwable;
private static native java.lang.String __call1786_1() throws Throwable;
private static native boolean __call1786_2(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native int __integerCategory1786_3(boolean value) throws Throwable;
private static native moom.DT __call1786_4(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native boolean __call1786_5(net.minecraft.world.WorldServer a0, moom.DT a1) throws Throwable;
private static native int __integerCategory1786_6(boolean value) throws Throwable;
private static native boolean __integerCategory1786_7(int value) throws Throwable;
private static native java.lang.Throwable __call1178600_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1178601_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1178602_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1178603_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_62986694f5c654796c93(net.minecraft.world.WorldServer a0) throws E;
private static final class __SourceHandler_62986694f5c654796c93 {

public static void f1787(net.minecraft.world.WorldServer receiver) throws Throwable {
    java.lang.String spill1787_0;
    long life1_3;
    moom.GC life4_13;
    int life5_16;
    java.lang.String life3_17;
    int life6_46;
    int life7_68;
    moom.DT life8_78;
    lexical_join_93: {
    life1_3 = (__fieldRead1787_0() ^ 100605062309624L);
    life4_13 = new moom.GC(__fieldRead1787_1(), __invokedynamic1787_2(2477, (7181364464441741493L ^ life1_3)));
    spill1787_0 = __call1787_3();
    life5_16 = 0;
    life3_17 = spill1787_0;
    lexical_cycle_18: while (true) {
    lexical_join_91: {
    lexical_join_90: {
    if (!((life5_16 < __invokedynamic1787_4(2477, (7181364464441741493L ^ life1_3))))) {
        break lexical_join_93;
    }
    life6_46 = ((__call1787_6(__fieldRead1787_5(receiver)) + __call1787_9(__fieldRead1787_7(receiver), __invokedynamic1787_8(17624, (8062349823873261013L ^ life1_3)))) - __call1787_12(__fieldRead1787_10(receiver), __invokedynamic1787_11(17624, (8062349823873261013L ^ life1_3))));
    life7_68 = ((__call1787_14(__fieldRead1787_13(receiver)) + __call1787_17(__fieldRead1787_15(receiver), __invokedynamic1787_16(17624, (8062349823873261013L ^ life1_3)))) - __call1787_20(__fieldRead1787_18(receiver), __invokedynamic1787_19(17624, (8062349823873261013L ^ life1_3))));
    life8_78 = __call1787_22(__call1787_21(receiver, new moom.DT(life6_46, 0, life7_68)));
    if (!((life3_17 == null))) {
        break lexical_join_91;
    }
    if (!(__call1787_24(life4_13, receiver, __fieldRead1787_23(receiver), life8_78))) {
        break lexical_join_90;
    }
    if (!((life3_17 != null))) {
        break lexical_join_93;
    }
    }
    life5_16 += 1;
    }
    if (!((life3_17 != null))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    return;
}
public static void h1787_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1178700_0(p0);
}
public static void h1787_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1178701_0(p0);
}
public static void h1787_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1178702_0(p0);
}
private static native long __fieldRead1787_0() throws Throwable;
private static native java.util.List __fieldRead1787_1() throws Throwable;
private static native int __invokedynamic1787_2(int a0, long a1) throws Throwable;
private static native java.lang.String __call1787_3() throws Throwable;
private static native int __invokedynamic1787_4(int a0, long a1) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1787_5(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call1787_6(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native java.util.Random __fieldRead1787_7(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __invokedynamic1787_8(int a0, long a1) throws Throwable;
private static native int __call1787_9(java.util.Random a0, int a1) throws Throwable;
private static native java.util.Random __fieldRead1787_10(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __invokedynamic1787_11(int a0, long a1) throws Throwable;
private static native int __call1787_12(java.util.Random a0, int a1) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __fieldRead1787_13(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call1787_14(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native java.util.Random __fieldRead1787_15(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __invokedynamic1787_16(int a0, long a1) throws Throwable;
private static native int __call1787_17(java.util.Random a0, int a1) throws Throwable;
private static native java.util.Random __fieldRead1787_18(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __invokedynamic1787_19(int a0, long a1) throws Throwable;
private static native int __call1787_20(java.util.Random a0, int a1) throws Throwable;
private static native moom.DT __call1787_21(net.minecraft.world.WorldServer a0, moom.DT a1) throws Throwable;
private static native moom.DT __call1787_22(moom.DT a0) throws Throwable;
private static native java.util.Random __fieldRead1787_23(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call1787_24(moom.GC a0, net.minecraft.world.WorldServer a1, java.util.Random a2, moom.DT a3) throws Throwable;
private static native java.lang.Throwable __call1178700_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1178701_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1178702_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c4be1db55f39ad85759d(net.minecraft.world.WorldServer a0) throws E;
private static final class __SourceHandler_c4be1db55f39ad85759d {

public static void f1788(net.minecraft.world.WorldServer receiver) throws Throwable {
    moom.Fn forwardValue1788_14_0;
    moom.Fn spill1788_0;
    long life1_3;
    java.lang.String life3_5;
    forward_join_15: {
    forward_join_14: {
    life1_3 = (__fieldRead1788_0() ^ 114712650045563L);
    life3_5 = __call1788_1();
    spill1788_0 = __fieldRead1788_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue1788_14_0 = spill1788_0;
        break forward_join_14;
    }
    if (!(__call1788_3(spill1788_0))) {
        break forward_join_15;
    }
    forwardValue1788_14_0 = __fieldRead1788_4(receiver);
    }
    __call1788_5(forwardValue1788_14_0);
    }
    return;
}
public static void h1788_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1178800_0(p0);
}
public static void h1788_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1178801_0(p0);
}
private static native long __fieldRead1788_0() throws Throwable;
private static native java.lang.String __call1788_1() throws Throwable;
private static native moom.Fn __fieldRead1788_2(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call1788_3(moom.Fn a0) throws Throwable;
private static native moom.Fn __fieldRead1788_4(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1788_5(moom.Fn a0) throws Throwable;
private static native java.lang.Throwable __call1178800_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1178801_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d6807fe5e1eca6c9e55d(net.minecraft.world.WorldServer a0) throws E;
private static final class __SourceHandler_d6807fe5e1eca6c9e55d {

public static void f1159(net.minecraft.world.WorldServer receiver) throws Throwable {
    int forestValue1159_12_0;
    net.minecraft.world.WorldServer forestValue1159_44_0;
    net.minecraft.world.WorldServer spill1159_0;
    boolean spill1159_1;
    long life1_3;
    java.lang.String life3_5;
    int life4_15;
    java.util.Iterator life5_27;
    moom.eS life6_34;
    forest_join_83: {
    life1_3 = (__fieldRead1159_0() ^ 106648666887600L);
    life3_5 = __call1159_1();
    forest_cycle_6: while (true) {
    forest_join_76: {
    forestValue1159_12_0 = __integerCategory1159_5(__call1159_4((__fieldRead1159_2(receiver))[__fieldRead1159_3(receiver)]));
    forest_cycle_12: while (true) {
    if (!((forestValue1159_12_0 == 0))) {
        break forest_join_83;
    }
    life4_15 = __fieldRead1159_6(receiver);
    net.minecraft.world.WorldServer __stackOp1159_7_0 = receiver;
    __fieldWrite1159_9(__stackOp1159_7_0, (__fieldRead1159_8(__stackOp1159_7_0) ^ 1));
    life5_27 = __call1159_11((__fieldRead1159_10(receiver))[life4_15]);
    forest_cycle_28: while (true) {
    forest_join_74: {
    forest_join_44: {
    if (!(__call1159_12(life5_27))) {
        break forest_join_76;
    }
    life6_34 = __cast1159_14(__call1159_13(life5_27));
    spill1159_0 = receiver;
    if (!((life3_5 == null))) {
        forestValue1159_44_0 = spill1159_0;
        break forest_join_44;
    }
    spill1159_1 = __call1159_15(spill1159_0, life6_34);
    if (!((life3_5 == null))) {
        forestValue1159_12_0 = __integerCategory1159_16(spill1159_1);
        continue forest_cycle_12;
    }
    if (!(spill1159_1)) {
        break forest_join_74;
    }
    forestValue1159_44_0 = receiver;
    }
    __call1159_31(__call1159_18(__fieldRead1159_17(forestValue1159_44_0)), ((double) __call1159_20(__call1159_19(life6_34))), ((double) __call1159_22(__call1159_21(life6_34))), ((double) __call1159_24(__call1159_23(life6_34))), 0x1.0p6d, __call1159_26(__fieldRead1159_25(receiver)), new moom.z6(__call1159_27(life6_34), __call1159_28(life6_34), __call1159_29(life6_34), __call1159_30(life6_34)));
    }
    if (!((life3_5 != null))) {
        continue forest_cycle_28;
    }
    break forest_cycle_28;
    }
    break forest_cycle_12;
    }
    }
    __call1159_33((__fieldRead1159_32(receiver))[life4_15]);
    if (!((life3_5 != null))) {
        continue forest_cycle_6;
    }
    break forest_cycle_6;
    }
    }
    return;
}
public static void h1159_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3115900_0(p0);
}
private static native long __fieldRead1159_0() throws Throwable;
private static native java.lang.String __call1159_1() throws Throwable;
private static native moom.OG[] __fieldRead1159_2(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __fieldRead1159_3(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call1159_4(moom.OG a0) throws Throwable;
private static native int __integerCategory1159_5(boolean value) throws Throwable;
private static native int __fieldRead1159_6(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __fieldRead1159_8(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __fieldWrite1159_9(net.minecraft.world.WorldServer a0, int a1) throws Throwable;
private static native moom.OG[] __fieldRead1159_10(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.util.Iterator __call1159_11(moom.OG a0) throws Throwable;
private static native boolean __call1159_12(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1159_13(java.util.Iterator a0) throws Throwable;
private static native moom.eS __cast1159_14(java.lang.Object a0) throws Throwable;
private static native boolean __call1159_15(net.minecraft.world.WorldServer a0, moom.eS a1) throws Throwable;
private static native int __integerCategory1159_16(boolean value) throws Throwable;
private static native moom.Bl __fieldRead1159_17(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1159_18(moom.Bl a0) throws Throwable;
private static native moom.DT __call1159_19(moom.eS a0) throws Throwable;
private static native int __call1159_20(moom.DT a0) throws Throwable;
private static native moom.DT __call1159_21(moom.eS a0) throws Throwable;
private static native int __call1159_22(moom.DT a0) throws Throwable;
private static native moom.DT __call1159_23(moom.eS a0) throws Throwable;
private static native int __call1159_24(moom.DT a0) throws Throwable;
private static native moom.EA __fieldRead1159_25(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call1159_26(moom.EA a0) throws Throwable;
private static native moom.DT __call1159_27(moom.eS a0) throws Throwable;
private static native net.minecraft.block.Block __call1159_28(moom.eS a0) throws Throwable;
private static native int __call1159_29(moom.eS a0) throws Throwable;
private static native int __call1159_30(moom.eS a0) throws Throwable;
private static native void __call1159_31(net.minecraft.server.management.ServerConfigurationManager a0, double a1, double a2, double a3, double a4, int a5, moom.z6 a6) throws Throwable;
private static native moom.OG[] __fieldRead1159_32(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1159_33(moom.OG a0) throws Throwable;
private static native java.lang.Throwable __call3115900_0(java.lang.IllegalStateException a0) throws Throwable;

}


public void b__Void() { __sourceHandlerCall_fe52c0e48b452659cebd(this); }


protected int b() {
return ((net.minecraft.server.management.ServerConfigurationManager)(((moom.Bl)(this.T)).a__BA())).d();
}


public void b(moom.DT p0, net.minecraft.block.Block p1, int p2, int p3) { __sourceHandlerCall_c7abe5ed9f49e6a53aab(this, p0, p1, p2, p3); }


private void b(moom.EK p0) { __sourceHandlerCall_1556e4c045cfc8ce314b(this, p0); }


protected void b(net.minecraft.entity.Entity p0) { __sourceHandlerCall_d0bb851597576da7c17b(this, p0); }


public moom.DT b__DT() {
return ((moom.EA)(this.v)).a__DT();
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral12542_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Ew"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.world.WorldServer.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 4081;
      if (ib[var3] == null) {
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
         long var5 = hb[var3];
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
         Object[] var9 = (Object[])jb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               jb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/Ew", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         ib[var3] = var15;
      }

      return ib[var3];
}


private static java.lang.Throwable b(java.lang.Throwable p0) {
return p0;
}


private void s() { __sourceHandlerCall_d6807fe5e1eca6c9e55d(this); }


public boolean c__Boolean() {
return (__sourceIntrinsic_booleanComparison((((moom.Bl)(this.T)).c__Boolean())) != 0);
}


public void c(moom.DT p0, net.minecraft.block.Block p1, int p2, int p3) { __sourceHandlerCall_f012165b027b9ab05515(this, p0, p1, p2, p3); }


public void n() {
this.ac = ((int)(0));
    return;
}


protected void h() { __sourceHandlerCall_cbf6546ddd8516518550(this); }


protected void f__Void() { __sourceHandlerCall_df53dd9789f805d38bc1(this); }


private boolean l__Boolean() {
return (__sourceIntrinsic_booleanComparison((((moom.Bl)(this.T)).q())) != 0);
}


protected void l() { __sourceHandlerCall_cc0360ecd27b137771ed(this); }


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral12548_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Ew"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = net.minecraft.world.WorldServer.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static long d(int p0, long p1) {
int life3_8;
    byte[] life4_77;
    long life5_81;
    byte[] life7_146;
    java.lang.Long life8_150;
    java.lang.Object[] life9_155;
    javax.crypto.spec.DESKeySpec life11_188;
    javax.crypto.SecretKey life12_195;
    javax.crypto.Cipher life13_200;
    byte[] life10_212;
    long life11_290;
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 31512);
    if (((net.minecraft.world.WorldServer.ob)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (net.minecraft.world.WorldServer.nb)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(net.minecraft.world.WorldServer.pb)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(net.minecraft.world.WorldServer.pb)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/Ew", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (net.minecraft.world.WorldServer.ob)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((net.minecraft.world.WorldServer.ob)[life3_8])).longValue();
}


protected moom.DT d__sourceReturn_4c3505da3e(moom.DT p0) { return __sourceHandlerCall_1486d1b6cb32f8493645(this, p0); }


public void d__Void() { __sourceHandlerCall_dd2620b101c51ad3aec5(this); }


public boolean a__Boolean(moom.DT p0, net.minecraft.block.Block p1) {
moom.Er local3 = new moom.Er(p0, p1);
    return ((java.util.List)(this.aj)).contains(((java.lang.Object)(local3)));
}


public net.minecraft.entity.EntityTracker a__t2() {
return this.U;
}


public moom.Bl a__sourceReturn_d935d0dee1() {
return this.T;
}


public void a(moom.DT p0, net.minecraft.block.Block p1, int p2, int p3) { __sourceHandlerCall_d5f34a22fd47ce7782dd(this, p0, p1, p2, p3); }


public void a(moom.DT p0, net.minecraft.block.Block p1, int p2) {
((net.minecraft.world.WorldServer)(this)).a(((moom.DT)(p0)), ((net.minecraft.block.Block)(p1)), ((int)(p2)), ((int)(0)));
    return;
}


private boolean a(moom.eS p0) { return __sourceHandlerCall_cb62ccd45ba4758f099d(this, p0); }


public moom.D7 a(net.minecraft.entity.EnumCreatureType p0, moom.DT p1) { return __sourceHandlerCall_94f76dfeef1f52f20e0a(this, p0, p1); }


public net.minecraft.entity.Entity a__sourceReturn_8552167bb6(java.util.UUID p0) {
return ((net.minecraft.entity.Entity)(((java.util.Map)(this.Y)).get(((java.lang.Object)(p0)))));
}


public com.google.common.util.concurrent.ListenableFuture<java.lang.Object> a(java.lang.Runnable p0) {
return ((moom.Bl)(this.T)).a(((java.lang.Runnable)(p0)));
}


public void a__Void() { __sourceHandlerCall_415ab7f6eec8e3c8c9d5(this); }


public boolean a(net.minecraft.entity.EnumCreatureType p0, moom.D7 p1, moom.DT p2) { return __sourceHandlerCall_d39376aa1df453161630(this, p0, p1, p2); }


public moom.Br a__Br() {
return this.V;
}


public moom.Et a__Et() {
return this.ad;
}


public void a(net.minecraft.util.EnumParticleTypes p0, double p1, double p2, double p3, int p4, double p5, double p6, double p7, double p8, int[] p9) {
((net.minecraft.world.WorldServer)(this)).a(((net.minecraft.util.EnumParticleTypes)(p0)), ((boolean)(false)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((int)(p4)), ((double)(p5)), ((double)(p6)), ((double)(p7)), ((double)(p8)), ((int[])(p9)));
    return;
}


public void a(net.minecraft.util.EnumParticleTypes p0, boolean p1, double p2, double p3, double p4, int p5, double p6, double p7, double p8, double p9, int[] p10) { __sourceHandlerCall_6c89b1ac5afc8937a939(this, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10); }


public boolean a(net.minecraft.entity.player.EntityPlayer p0, moom.DT p1) { return __sourceHandlerCall_a1188a4c306949d9f5b3(this, p0, p1); }


public void a(moom.EK p0) { __sourceHandlerCall_2d7f76a551fb0206b41e(this, p0); }


public void a(net.minecraft.entity.Entity p0, boolean p1) { __sourceHandlerCall_8c85b0d148dd83dde79f(this, p0, p1); }


public java.util.List<moom.Er> a(moom.G2 p0, boolean p1) { return __sourceHandlerCall_43994584ef6e9ab26770(this, p0, p1); }


public java.util.List<net.minecraft.tileentity.TileEntity> a__sourceReturn_f9b4ca7e0a(int p0, int p1, int p2, int p3, int p4, int p5) { return __sourceHandlerCall_093c33ff7605c5f026d6(this, p0, p1, p2, p3, p4, p5); }


protected moom.Fn a__Fn() {
net.minecraft.world.chunk.storage.IChunkLoader local1 = ((net.minecraft.world.storage.ISaveHandler)(this.y)).a(((moom.EA)(this.v)));
    this.Z = ((net.minecraft.world.gen.ChunkProviderServer)(new net.minecraft.world.gen.ChunkProviderServer(this, local1, ((moom.EA)(this.v)).a__Fn())));
    return this.Z;
}


public void a(boolean p0, net.minecraft.util.IProgressUpdate p1) throws net.minecraft.world.MinecraftException { __sourceHandlerCall_017b47ed3e4744e55953(this, p0, p1); }


protected void a(net.minecraft.entity.Entity p0) { __sourceHandlerCall_6050dddd9804df64643b(this, p0); }


public boolean a(boolean p0) { return __sourceHandlerCall_224c8654c563d46a045f(this, p0); }


public boolean a__Boolean(net.minecraft.entity.Entity p0) { return __sourceHandlerCall_442057ce96471928362f(this, p0); }


public void a(net.minecraft.entity.Entity p0, byte p1) {
((net.minecraft.entity.EntityTracker)(((net.minecraft.world.WorldServer)(this)).a__t2())).b(((net.minecraft.entity.Entity)(p0)), ((moom.yK)(new moom.zT(p0, p1))));
    return;
}


public moom.Ei a(net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4, boolean p5, boolean p6) { return __sourceHandlerCall_f2aee02aa984c77cea84(this, p0, p1, p2, p3, p4, p5, p6); }


public java.util.List<moom.Er> a(net.minecraft.world.chunk.Chunk p0, boolean p1) {
long local3 = (net.minecraft.world.WorldServer.cb ^ 119658720995829L);
    moom.Ee local5 = ((net.minecraft.world.chunk.Chunk)(p0)).a__Ee();
    int local6 = ((((moom.Ee)(local5)).a << 4) - 2);
    int local7 = ((local6 + __sourceIntrinsic_30dc8d64078d_originalDynamicSite2066_3(19079, (7952968369332935818L ^ local3))) + 2);
    int local8 = ((((moom.Ee)(local5)).b << 4) - 2);
    int local9 = ((local8 + __sourceIntrinsic_30dc8d64078d_originalDynamicSite2066_5(19079, (7952968369332935818L ^ local3))) + 2);
    return ((net.minecraft.world.WorldServer)(this)).a(((moom.G2)(new moom.G2(local6, 0, local8, local7, __sourceIntrinsic_30dc8d64078d_originalDynamicSite2066_6(18643, (5415212908965945046L ^ local3)), local9))), ((boolean)(p1)));
}


public net.minecraft.world.World a__Eu() { return __sourceHandlerCall_ade37178a3179bae1016(this); }


private void m() {
((net.minecraft.world.storage.WorldInfo)(this.z)).g(((int)(0)));
    ((net.minecraft.world.storage.WorldInfo)(this.z)).b(((boolean)(false)));
    ((net.minecraft.world.storage.WorldInfo)(this.z)).f(((int)(0)));
    ((net.minecraft.world.storage.WorldInfo)(this.z)).a(((boolean)(false)));
    return;
}


private void o() {
long local1 = (net.minecraft.world.WorldServer.cb ^ 93761372586555L);
    ((net.minecraft.world.storage.WorldInfo)(this.z)).c(((boolean)(false)));
    ((net.minecraft.world.storage.WorldInfo)(this.z)).e(((boolean)(true)));
    ((net.minecraft.world.storage.WorldInfo)(this.z)).b(((boolean)(false)));
    ((net.minecraft.world.storage.WorldInfo)(this.z)).a(((boolean)(false)));
    ((net.minecraft.world.storage.WorldInfo)(this.z)).e(((int)(__sourceIntrinsic_c5f5dc3d8bf3_originalDynamicSite2067_10(29093, (730270009810832501L ^ local1)))));
    ((net.minecraft.world.storage.WorldInfo)(this.z)).b(((long)(__sourceIntrinsic_c5f5dc3d8bf3_originalDynamicSite2067_13(31186, (6858479805817303291L ^ local1)))));
    ((net.minecraft.world.storage.WorldInfo)(this.z)).a(((net.minecraft.world.WorldSettings$GameType)(net.minecraft.world.WorldSettings$GameType.SPECTATOR)));
    ((net.minecraft.world.storage.WorldInfo)(this.z)).d(((boolean)(false)));
    ((net.minecraft.world.storage.WorldInfo)(this.z)).a(((net.minecraft.world.EnumDifficulty)(net.minecraft.world.EnumDifficulty.PEACEFUL)));
    ((net.minecraft.world.storage.WorldInfo)(this.z)).g(((boolean)(true)));
    ((net.minecraft.world.GameRules)(((net.minecraft.world.WorldServer)(this)).a__Ej())).a(((java.lang.String)("doDaylightCycle")), ((java.lang.String)("false")));
    return;
}


protected void p() { __sourceHandlerCall_62986694f5c654796c93(this); }


public void k() { __sourceHandlerCall_dc532b4ca9ff7c629ea0(this); }


private boolean k__Boolean() {
return (__sourceIntrinsic_booleanComparison((((moom.Bl)(this.T)).r())) != 0);
}


public void t() {
((net.minecraft.world.storage.ISaveHandler)(this.y)).b();
    return;
}


public boolean j__sourceReturn_aae029aa0a() { return __sourceHandlerCall_0b24986077340bf9c0e9(this); }


public void q() { __sourceHandlerCall_c4be1db55f39ad85759d(this); }


protected void r() throws net.minecraft.world.MinecraftException {
((net.minecraft.world.WorldServer)(this)).j();
    ((net.minecraft.world.storage.WorldInfo)(this.z)).a(((double)(((net.minecraft.world.border.WorldBorder)(((net.minecraft.world.WorldServer)(this)).a__Fi())).g())));
    ((net.minecraft.world.storage.WorldInfo)(this.z)).d(((double)(((net.minecraft.world.border.WorldBorder)(((net.minecraft.world.WorldServer)(this)).a__Fi())).e())));
    ((net.minecraft.world.storage.WorldInfo)(this.z)).c(((double)(((net.minecraft.world.border.WorldBorder)(((net.minecraft.world.WorldServer)(this)).a__Fi())).f())));
    ((net.minecraft.world.storage.WorldInfo)(this.z)).e(((double)(((net.minecraft.world.border.WorldBorder)(((net.minecraft.world.WorldServer)(this)).a__Fi())).i())));
    ((net.minecraft.world.storage.WorldInfo)(this.z)).f(((double)(((net.minecraft.world.border.WorldBorder)(((net.minecraft.world.WorldServer)(this)).a__Fi())).j())));
    ((net.minecraft.world.storage.WorldInfo)(this.z)).h(((int)(((net.minecraft.world.border.WorldBorder)(((net.minecraft.world.WorldServer)(this)).a__Fi())).c__Int())));
    ((net.minecraft.world.storage.WorldInfo)(this.z)).i(((int)(((net.minecraft.world.border.WorldBorder)(((net.minecraft.world.WorldServer)(this)).a__Fi())).b__Int())));
    ((net.minecraft.world.storage.WorldInfo)(this.z)).b(((double)(((net.minecraft.world.border.WorldBorder)(((net.minecraft.world.WorldServer)(this)).a__Fi())).h())));
    ((net.minecraft.world.storage.WorldInfo)(this.z)).c(((long)(((net.minecraft.world.border.WorldBorder)(((net.minecraft.world.WorldServer)(this)).a__Fi())).a__Long())));
    ((net.minecraft.world.storage.ISaveHandler)(this.y)).a(((net.minecraft.world.storage.WorldInfo)(this.z)), ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.server.management.ServerConfigurationManager)(((moom.Bl)(this.T)).a__BA())).a__yw())));
    ((moom.IO)(this.B)).a();
    return;
}


private boolean lambda$adjustPosToNearbyEntity$0(net.minecraft.entity.EntityLivingBase p0) { return __sourceHandlerCall_3f81b8684ea6e2a60b92(this, p0); }


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1365_99(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1365_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1365_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1365_108(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1365_112(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1365_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1365_116(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1365_118(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1365_121(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_30dc8d64078d_originalDynamicSite2066_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_30dc8d64078d_originalDynamicSite2066_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_30dc8d64078d_originalDynamicSite2066_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral12542_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral12548_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c5f5dc3d8bf3_originalDynamicSite2067_10(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_c5f5dc3d8bf3_originalDynamicSite2067_13(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
