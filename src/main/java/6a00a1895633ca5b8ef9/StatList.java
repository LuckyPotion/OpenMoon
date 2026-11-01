package net.minecraft.stats;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class StatList {

protected static java.util.Map<java.lang.String, moom.BY> a;

public static java.util.List<moom.BY> b;

public static java.util.List<moom.BY> c;

public static java.util.List<moom.B1> d;

public static java.util.List<moom.B1> e;

public static moom.BY f;

public static moom.BY g;

public static moom.BY h;

public static moom.BY i;

public static moom.BY j;

public static moom.BY k;

public static moom.BY l;

public static moom.BY m;

public static moom.BY n;

public static moom.BY o;

public static moom.BY p;

public static moom.BY q;

public static moom.BY r;

public static moom.BY s;

public static moom.BY t;

public static moom.BY u;

public static moom.BY v;

public static moom.BY w;

public static moom.BY x;

public static moom.BY y;

public static moom.BY z;

public static moom.BY A;

public static moom.BY B;

public static moom.BY C;

public static moom.BY D;

public static moom.BY E;

public static moom.BY F;

public static moom.BY G;

public static moom.BY H;

public static moom.BY I;

public static moom.BY J;

public static moom.BY K;

public static moom.BY L;

public static moom.BY M;

public static moom.BY N;

public static moom.BY O;

public static moom.BY P;

public static moom.BY Q;

public static moom.BY R;

public static moom.BY S;

public static moom.BY T;

public static moom.BY U;

public static moom.BY V;

public static moom.BY W;

public static moom.BY X;

public static moom.BY Y;

public static moom.BY Z;

public static moom.BY aa;

public static moom.BY[] ab;

public static moom.BY[] ac;

public static moom.BY[] ad;

public static moom.BY[] ae;

private static java.lang.String af;

private static long bb;

private static long[] cb;

private static java.lang.Integer[] db;

private static java.util.Map eb;

public StatList() {
super();
}


static {
bb = ((long)(((moom._a)(moom._c.a(((long)(-6745791217367228184L)), ((long)(1166980111388937613L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(91381867454094L)))));
    long local11_life6 = (net.minecraft.stats.StatList.bb ^ 31732369581752L);
    java.lang.String __sourceSpill1922_8 = "eOhDr";
    eb = ((java.util.Map)(new java.util.HashMap(13)));
    net.minecraft.stats.StatList.b(((java.lang.String)(__sourceSpill1922_8)));
    javax.crypto.Cipher local0_life11;
    javax.crypto.Cipher __sourceSpill1922_13 = (local0_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1922_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1922_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1922_16 = new byte[8];
    (__sourceSpill1922_16)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life17 = 1;
    while ((local1_life17 < 8)) {
        (__sourceSpill1922_16)[local1_life17] = ((byte) ((int) ((local11_life6 << (local1_life17 * 8)) >>> 56)));
        local1_life17 += 1;
    }
    byte[] __sourcePreallocation1922_18 = __sourceSpill1922_16;
    ((javax.crypto.Cipher)(__sourceSpill1922_13)).init(((int)(__sourceSpill1922_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1922_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1922_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life21 = new long[5];
    int local3_life22 = 0;
    java.lang.String local4_life23;
    int local5_life25 = ((java.lang.String)((local4_life23 = "jg7®k \037Ïb}5\004w9\035\002Ù\024ryÀ"))).length();
    int local2_life26 = 0;
    do {
        java.lang.String __sourceSpill1922_27 = local4_life23;
        int __sourceSpill1922_28 = local2_life26;
        local2_life26 += 8;
        byte[] local7_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1922_27)).substring(((int)(__sourceSpill1922_28)), ((int)(local2_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1922_32 = local6_life21;
        int __sourceSpill1922_33 = local3_life22;
        local3_life22 += 1;
        long local8_life34 = (((((((((((long) (local7_life31)[0]) & 255L) << 56) | ((((long) (local7_life31)[1]) & 255L) << 48)) | ((((long) (local7_life31)[2]) & 255L) << 40)) | ((((long) (local7_life31)[3]) & 255L) << 32)) | ((((long) (local7_life31)[4]) & 255L) << 24)) | ((((long) (local7_life31)[5]) & 255L) << 16)) | ((((long) (local7_life31)[6]) & 255L) << 8)) | (((long) (local7_life31)[7]) & 255L));
        byte[] __sourceSpill1922_35 = new byte[8];
        (__sourceSpill1922_35)[0] = ((byte) ((int) (local8_life34 >>> 56)));
        (__sourceSpill1922_35)[1] = ((byte) ((int) (local8_life34 >>> 48)));
        (__sourceSpill1922_35)[2] = ((byte) ((int) (local8_life34 >>> 40)));
        (__sourceSpill1922_35)[3] = ((byte) ((int) (local8_life34 >>> 32)));
        (__sourceSpill1922_35)[4] = ((byte) ((int) (local8_life34 >>> 24)));
        (__sourceSpill1922_35)[5] = ((byte) ((int) (local8_life34 >>> 16)));
        (__sourceSpill1922_35)[6] = ((byte) ((int) (local8_life34 >>> 8)));
        (__sourceSpill1922_35)[7] = ((byte) ((int) local8_life34));
        javax.crypto.Cipher __sourceSpill1922_36 = local0_life11;
        byte[] local10_life38 = ((javax.crypto.Cipher)(__sourceSpill1922_36)).doFinal(((byte[])(__sourceSpill1922_35)));
        (__sourceSpill1922_32)[__sourceSpill1922_33] = (((((((((((long) (local10_life38)[0]) & 255L) << 56) | ((((long) (local10_life38)[1]) & 255L) << 48)) | ((((long) (local10_life38)[2]) & 255L) << 40)) | ((((long) (local10_life38)[3]) & 255L) << 32)) | ((((long) (local10_life38)[4]) & 255L) << 24)) | ((((long) (local10_life38)[5]) & 255L) << 16)) | ((((long) (local10_life38)[6]) & 255L) << 8)) | (((long) (local10_life38)[7]) & 255L));
    } while ((!(local2_life26 >= local5_life25)));
    local5_life25 = ((java.lang.String)((local4_life23 = "\024eµWÅÆ\024c\001dì<\025âX"))).length();
    local2_life26 = 0;
    do {
        java.lang.String __sourceSpill1922_40 = local4_life23;
        int __sourceSpill1922_41 = local2_life26;
        local2_life26 += 8;
        byte[] local7_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1922_40)).substring(((int)(__sourceSpill1922_41)), ((int)(local2_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1922_45 = local6_life21;
        int __sourceSpill1922_46 = local3_life22;
        local3_life22 += 1;
        long local8_life47 = (((((((((((long) (local7_life44)[0]) & 255L) << 56) | ((((long) (local7_life44)[1]) & 255L) << 48)) | ((((long) (local7_life44)[2]) & 255L) << 40)) | ((((long) (local7_life44)[3]) & 255L) << 32)) | ((((long) (local7_life44)[4]) & 255L) << 24)) | ((((long) (local7_life44)[5]) & 255L) << 16)) | ((((long) (local7_life44)[6]) & 255L) << 8)) | (((long) (local7_life44)[7]) & 255L));
        byte[] __sourceSpill1922_48 = new byte[8];
        (__sourceSpill1922_48)[0] = ((byte) ((int) (local8_life47 >>> 56)));
        (__sourceSpill1922_48)[1] = ((byte) ((int) (local8_life47 >>> 48)));
        (__sourceSpill1922_48)[2] = ((byte) ((int) (local8_life47 >>> 40)));
        (__sourceSpill1922_48)[3] = ((byte) ((int) (local8_life47 >>> 32)));
        (__sourceSpill1922_48)[4] = ((byte) ((int) (local8_life47 >>> 24)));
        (__sourceSpill1922_48)[5] = ((byte) ((int) (local8_life47 >>> 16)));
        (__sourceSpill1922_48)[6] = ((byte) ((int) (local8_life47 >>> 8)));
        (__sourceSpill1922_48)[7] = ((byte) ((int) local8_life47));
        javax.crypto.Cipher __sourceSpill1922_49 = local0_life11;
        byte[] local10_life51 = ((javax.crypto.Cipher)(__sourceSpill1922_49)).doFinal(((byte[])(__sourceSpill1922_48)));
        (__sourceSpill1922_45)[__sourceSpill1922_46] = (((((((((((long) (local10_life51)[0]) & 255L) << 56) | ((((long) (local10_life51)[1]) & 255L) << 48)) | ((((long) (local10_life51)[2]) & 255L) << 40)) | ((((long) (local10_life51)[3]) & 255L) << 32)) | ((((long) (local10_life51)[4]) & 255L) << 24)) | ((((long) (local10_life51)[5]) & 255L) << 16)) | ((((long) (local10_life51)[6]) & 255L) << 8)) | (((long) (local10_life51)[7]) & 255L));
    } while ((!(local2_life26 >= local5_life25)));
    cb = ((long[])(local6_life21));
    db = ((java.lang.Integer[])(new java.lang.Integer[5]));
    a = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    b = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    c = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    d = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    e = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    f = ((moom.BY)(((moom.BY)(((moom.B0)(new moom.B0("stat.leaveGame", new moom.CN("stat.leaveGame", new java.lang.Object[0])))).a__BY())).b()));
    g = ((moom.BY)(((moom.BY)(((moom.B0)(new moom.B0("stat.playOneMinute", new moom.CN("stat.playOneMinute", new java.lang.Object[0]), moom.BY.j))).a__BY())).b()));
    h = ((moom.BY)(((moom.BY)(((moom.B0)(new moom.B0("stat.timeSinceDeath", new moom.CN("stat.timeSinceDeath", new java.lang.Object[0]), moom.BY.j))).a__BY())).b()));
    i = ((moom.BY)(((moom.BY)(((moom.B0)(new moom.B0("stat.walkOneCm", new moom.CN("stat.walkOneCm", new java.lang.Object[0]), moom.BY.k))).a__BY())).b()));
    j = ((moom.BY)(((moom.BY)(((moom.B0)(new moom.B0("stat.crouchOneCm", new moom.CN("stat.crouchOneCm", new java.lang.Object[0]), moom.BY.k))).a__BY())).b()));
    k = ((moom.BY)(((moom.BY)(((moom.B0)(new moom.B0("stat.sprintOneCm", new moom.CN("stat.sprintOneCm", new java.lang.Object[0]), moom.BY.k))).a__BY())).b()));
    l = ((moom.BY)(((moom.BY)(((moom.B0)(new moom.B0("stat.swimOneCm", new moom.CN("stat.swimOneCm", new java.lang.Object[0]), moom.BY.k))).a__BY())).b()));
    m = ((moom.BY)(((moom.BY)(((moom.B0)(new moom.B0("stat.fallOneCm", new moom.CN("stat.fallOneCm", new java.lang.Object[0]), moom.BY.k))).a__BY())).b()));
    n = ((moom.BY)(((moom.BY)(((moom.B0)(new moom.B0("stat.climbOneCm", new moom.CN("stat.climbOneCm", new java.lang.Object[0]), moom.BY.k))).a__BY())).b()));
    o = ((moom.BY)(((moom.BY)(((moom.B0)(new moom.B0("stat.flyOneCm", new moom.CN("stat.flyOneCm", new java.lang.Object[0]), moom.BY.k))).a__BY())).b()));
    p = ((moom.BY)(((moom.BY)(((moom.B0)(new moom.B0("stat.diveOneCm", new moom.CN("stat.diveOneCm", new java.lang.Object[0]), moom.BY.k))).a__BY())).b()));
    q = ((moom.BY)(((moom.BY)(((moom.B0)(new moom.B0("stat.minecartOneCm", new moom.CN("stat.minecartOneCm", new java.lang.Object[0]), moom.BY.k))).a__BY())).b()));
    r = ((moom.BY)(((moom.BY)(((moom.B0)(new moom.B0("stat.boatOneCm", new moom.CN("stat.boatOneCm", new java.lang.Object[0]), moom.BY.k))).a__BY())).b()));
    s = ((moom.BY)(((moom.BY)(((moom.B0)(new moom.B0("stat.pigOneCm", new moom.CN("stat.pigOneCm", new java.lang.Object[0]), moom.BY.k))).a__BY())).b()));
    t = ((moom.BY)(((moom.BY)(((moom.B0)(new moom.B0("stat.horseOneCm", new moom.CN("stat.horseOneCm", new java.lang.Object[0]), moom.BY.k))).a__BY())).b()));
    u = ((moom.BY)(((moom.BY)(((moom.B0)(new moom.B0("stat.jump", new moom.CN("stat.jump", new java.lang.Object[0])))).a__BY())).b()));
    v = ((moom.BY)(((moom.BY)(((moom.B0)(new moom.B0("stat.drop", new moom.CN("stat.drop", new java.lang.Object[0])))).a__BY())).b()));
    w = ((moom.BY)(((moom.B0)(new moom.B0("stat.damageDealt", new moom.CN("stat.damageDealt", new java.lang.Object[0]), moom.BY.l))).b()));
    x = ((moom.BY)(((moom.B0)(new moom.B0("stat.damageTaken", new moom.CN("stat.damageTaken", new java.lang.Object[0]), moom.BY.l))).b()));
    y = ((moom.BY)(((moom.B0)(new moom.B0("stat.deaths", new moom.CN("stat.deaths", new java.lang.Object[0])))).b()));
    z = ((moom.BY)(((moom.B0)(new moom.B0("stat.mobKills", new moom.CN("stat.mobKills", new java.lang.Object[0])))).b()));
    A = ((moom.BY)(((moom.B0)(new moom.B0("stat.animalsBred", new moom.CN("stat.animalsBred", new java.lang.Object[0])))).b()));
    B = ((moom.BY)(((moom.B0)(new moom.B0("stat.playerKills", new moom.CN("stat.playerKills", new java.lang.Object[0])))).b()));
    C = ((moom.BY)(((moom.B0)(new moom.B0("stat.fishCaught", new moom.CN("stat.fishCaught", new java.lang.Object[0])))).b()));
    D = ((moom.BY)(((moom.B0)(new moom.B0("stat.junkFished", new moom.CN("stat.junkFished", new java.lang.Object[0])))).b()));
    E = ((moom.BY)(((moom.B0)(new moom.B0("stat.treasureFished", new moom.CN("stat.treasureFished", new java.lang.Object[0])))).b()));
    F = ((moom.BY)(((moom.B0)(new moom.B0("stat.talkedToVillager", new moom.CN("stat.talkedToVillager", new java.lang.Object[0])))).b()));
    G = ((moom.BY)(((moom.B0)(new moom.B0("stat.tradedWithVillager", new moom.CN("stat.tradedWithVillager", new java.lang.Object[0])))).b()));
    H = ((moom.BY)(((moom.B0)(new moom.B0("stat.cakeSlicesEaten", new moom.CN("stat.cakeSlicesEaten", new java.lang.Object[0])))).b()));
    I = ((moom.BY)(((moom.B0)(new moom.B0("stat.cauldronFilled", new moom.CN("stat.cauldronFilled", new java.lang.Object[0])))).b()));
    J = ((moom.BY)(((moom.B0)(new moom.B0("stat.cauldronUsed", new moom.CN("stat.cauldronUsed", new java.lang.Object[0])))).b()));
    K = ((moom.BY)(((moom.B0)(new moom.B0("stat.armorCleaned", new moom.CN("stat.armorCleaned", new java.lang.Object[0])))).b()));
    L = ((moom.BY)(((moom.B0)(new moom.B0("stat.bannerCleaned", new moom.CN("stat.bannerCleaned", new java.lang.Object[0])))).b()));
    M = ((moom.BY)(((moom.B0)(new moom.B0("stat.brewingstandInteraction", new moom.CN("stat.brewingstandInteraction", new java.lang.Object[0])))).b()));
    N = ((moom.BY)(((moom.B0)(new moom.B0("stat.beaconInteraction", new moom.CN("stat.beaconInteraction", new java.lang.Object[0])))).b()));
    O = ((moom.BY)(((moom.B0)(new moom.B0("stat.dropperInspected", new moom.CN("stat.dropperInspected", new java.lang.Object[0])))).b()));
    P = ((moom.BY)(((moom.B0)(new moom.B0("stat.hopperInspected", new moom.CN("stat.hopperInspected", new java.lang.Object[0])))).b()));
    Q = ((moom.BY)(((moom.B0)(new moom.B0("stat.dispenserInspected", new moom.CN("stat.dispenserInspected", new java.lang.Object[0])))).b()));
    R = ((moom.BY)(((moom.B0)(new moom.B0("stat.noteblockPlayed", new moom.CN("stat.noteblockPlayed", new java.lang.Object[0])))).b()));
    S = ((moom.BY)(((moom.B0)(new moom.B0("stat.noteblockTuned", new moom.CN("stat.noteblockTuned", new java.lang.Object[0])))).b()));
    T = ((moom.BY)(((moom.B0)(new moom.B0("stat.flowerPotted", new moom.CN("stat.flowerPotted", new java.lang.Object[0])))).b()));
    U = ((moom.BY)(((moom.B0)(new moom.B0("stat.trappedChestTriggered", new moom.CN("stat.trappedChestTriggered", new java.lang.Object[0])))).b()));
    V = ((moom.BY)(((moom.B0)(new moom.B0("stat.enderchestOpened", new moom.CN("stat.enderchestOpened", new java.lang.Object[0])))).b()));
    W = ((moom.BY)(((moom.B0)(new moom.B0("stat.itemEnchanted", new moom.CN("stat.itemEnchanted", new java.lang.Object[0])))).b()));
    X = ((moom.BY)(((moom.B0)(new moom.B0("stat.recordPlayed", new moom.CN("stat.recordPlayed", new java.lang.Object[0])))).b()));
    Y = ((moom.BY)(((moom.B0)(new moom.B0("stat.furnaceInteraction", new moom.CN("stat.furnaceInteraction", new java.lang.Object[0])))).b()));
    Z = ((moom.BY)(((moom.B0)(new moom.B0("stat.craftingTableInteraction", new moom.CN("stat.workbenchInteraction", new java.lang.Object[0])))).b()));
    aa = ((moom.BY)(((moom.B0)(new moom.B0("stat.chestOpened", new moom.CN("stat.chestOpened", new java.lang.Object[0])))).b()));
    ab = ((moom.BY[])(new moom.BY[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1922_193(21248, (1911920200764951421L ^ local11_life6))]));
    ac = ((moom.BY[])(new moom.BY[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1922_195(11218, (4678877367723193262L ^ local11_life6))]));
    ad = ((moom.BY[])(new moom.BY[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1922_197(1954, (4946072968348786652L ^ local11_life6))]));
    ae = ((moom.BY[])(new moom.BY[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1922_199(1954, (4946072968348786652L ^ local11_life6))]));
}

private static native <E extends Throwable> void __sourceHandlerCall_f8183590944146a3a5ef() throws E;
private static final class __SourceHandler_f8183590944146a3a5ef {

public static void f720012() throws Throwable {
    net.minecraft.item.Item forestValue720012_70_0;
    java.lang.Object forestValue720012_104_0;
    net.minecraft.item.Item forestValue720012_113_0;
    boolean spill720012_0;
    net.minecraft.item.ItemStack spill720012_1;
    net.minecraft.item.Item spill720012_2;
    moom.BY[] spill720012_3;
    int spill720012_4;
    moom.B1 spill720012_5;
    moom.B1 spill720012_6;
    java.lang.String spill720012_7;
    java.lang.String spill720012_8;
    moom.CN spill720012_9;
    moom.CN spill720012_10;
    java.lang.String spill720012_11;
    java.lang.Object[] spill720012_12;
    java.lang.Object[] spill720012_13;
    int spill720012_14;
    net.minecraft.item.ItemStack spill720012_15;
    net.minecraft.item.Item spill720012_16;
    moom.BY[] spill720012_17;
    int spill720012_18;
    moom.B1 spill720012_19;
    moom.B1 spill720012_20;
    java.lang.String spill720012_21;
    java.lang.String spill720012_22;
    moom.CN spill720012_23;
    moom.CN spill720012_24;
    java.lang.String spill720012_25;
    java.lang.Object[] spill720012_26;
    java.lang.Object[] spill720012_27;
    int spill720012_28;
    net.minecraft.item.ItemStack spill720012_29;
    java.lang.Object spill720012_30;
    long life0_3;
    java.util.HashSet life3_5;
    java.util.Iterator life4_10;
    int life2_11;
    net.minecraft.item.crafting.IRecipe life5_20;
    java.util.Iterator life4_43;
    net.minecraft.item.ItemStack life5_52;
    net.minecraft.item.Item life5_77;
    int life6_92;
    java.lang.String life7_95;
    net.minecraft.item.Item life5_128;
    int life6_143;
    java.lang.String life7_146;
    forest_join_155: {
    forest_join_153: {
    forest_join_104: {
    forest_join_56: {
    forest_join_53: {
    forest_join_32: {
    life0_3 = (__fieldRead720012_0() ^ 102055972600601L);
    life3_5 = __call720012_1();
    spill720012_0 = __call720012_2();
    life4_10 = __call720012_5(__call720012_4(__call720012_3()));
    life2_11 = __integerCategory720012_6(spill720012_0);
    forest_cycle_12: while (true) {
    forest_join_30: {
    if (!(__call720012_7(life4_10))) {
        break forest_join_32;
    }
    life5_20 = __cast720012_9(__call720012_8(life4_10));
    spill720012_1 = __call720012_10(life5_20);
    if (!((life2_11 == 0))) {
        forestValue720012_104_0 = spill720012_1;
        break forest_join_104;
    }
    if (!((spill720012_1 != null))) {
        break forest_join_30;
    }
    __call720012_13(life3_5, __call720012_12(__call720012_11(life5_20)));
    }
    if (!((life2_11 != 0))) {
        continue forest_cycle_12;
    }
    break forest_cycle_12;
    }
    }
    life4_43 = __call720012_17(__call720012_16(__call720012_15(__call720012_14())));
    forest_cycle_37: while (true) {
    if (!(__call720012_18(life4_43))) {
        break forest_join_53;
    }
    life5_52 = __cast720012_20(__call720012_19(life4_43));
    __call720012_22(life3_5, __call720012_21(life5_52));
    if (!((life2_11 == 0))) {
        break forest_join_56;
    }
    if (!((life2_11 != 0))) {
        continue forest_cycle_37;
    }
    break forest_cycle_37;
    }
    }
    life4_43 = __call720012_23(life3_5);
    }
    forest_cycle_56: while (true) {
    forest_join_101: {
    forest_join_70: {
    if (!(__call720012_24(life4_43))) {
        break forest_join_153;
    }
    life5_77 = __cast720012_26(__call720012_25(life4_43));
    if (!((life2_11 == 0))) {
        break forest_join_155;
    }
    spill720012_2 = life5_77;
    if (!((life2_11 == 0))) {
        forestValue720012_70_0 = spill720012_2;
        break forest_join_70;
    }
    if (!((spill720012_2 != null))) {
        break forest_join_101;
    }
    forestValue720012_70_0 = life5_77;
    }
    life6_92 = __call720012_27(forestValue720012_70_0);
    life7_95 = __call720012_28(life5_77);
    if (!((life7_95 != null))) {
        break forest_join_101;
    }
    spill720012_3 = __fieldRead720012_29();
    spill720012_4 = life6_92;
    moom.B1 __stackOp720012_31_0 = __sourceUninitializedNEW720012_30();
    spill720012_5 = __stackOp720012_31_0;
    spill720012_6 = __stackOp720012_31_0;
    spill720012_7 = "stat.craftItem.";
    spill720012_8 = life7_95;
    moom.CN __stackOp720012_33_0 = __sourceUninitializedNEW720012_32();
    spill720012_9 = __stackOp720012_33_0;
    spill720012_10 = __stackOp720012_33_0;
    spill720012_11 = "stat.craftItem";
    java.lang.Object[] __stackOp720012_34_0 = new java.lang.Object[1];
    spill720012_12 = __stackOp720012_34_0;
    spill720012_13 = __stackOp720012_34_0;
    spill720012_14 = 0;
    net.minecraft.item.ItemStack __stackOp720012_36_0 = __sourceUninitializedNEW720012_35();
    spill720012_15 = __stackOp720012_36_0;
    __explicitNewInit720012_37(__stackOp720012_36_0, life5_77);
    (spill720012_13)[spill720012_14] = __call720012_38(spill720012_15);
    __explicitNewInit720012_39(spill720012_10, spill720012_11, spill720012_12);
    __explicitNewInit720012_40(spill720012_6, spill720012_7, spill720012_8, spill720012_9, life5_77);
    (spill720012_3)[spill720012_4] = __call720012_41(spill720012_5);
    }
    if (!((life2_11 != 0))) {
        continue forest_cycle_56;
    }
    break forest_cycle_56;
    }
    break forest_join_153;
    }
    forest_cycle_104: while (true) {
    forest_join_147: {
    forest_join_144: {
    forest_join_113: {
    life5_128 = __cast720012_42(forestValue720012_104_0);
    if (!((life2_11 == 0))) {
        break forest_join_155;
    }
    spill720012_16 = life5_128;
    if (!((life2_11 == 0))) {
        forestValue720012_113_0 = spill720012_16;
        break forest_join_113;
    }
    if (!((spill720012_16 != null))) {
        break forest_join_144;
    }
    forestValue720012_113_0 = life5_128;
    }
    life6_143 = __call720012_43(forestValue720012_113_0);
    life7_146 = __call720012_44(life5_128);
    if (!((life7_146 != null))) {
        break forest_join_144;
    }
    spill720012_17 = __fieldRead720012_45();
    spill720012_18 = life6_143;
    moom.B1 __stackOp720012_47_0 = __sourceUninitializedNEW720012_46();
    spill720012_19 = __stackOp720012_47_0;
    spill720012_20 = __stackOp720012_47_0;
    spill720012_21 = "stat.craftItem.";
    spill720012_22 = life7_146;
    moom.CN __stackOp720012_49_0 = __sourceUninitializedNEW720012_48();
    spill720012_23 = __stackOp720012_49_0;
    spill720012_24 = __stackOp720012_49_0;
    spill720012_25 = "stat.craftItem";
    java.lang.Object[] __stackOp720012_50_0 = new java.lang.Object[1];
    spill720012_26 = __stackOp720012_50_0;
    spill720012_27 = __stackOp720012_50_0;
    spill720012_28 = 0;
    net.minecraft.item.ItemStack __stackOp720012_52_0 = __sourceUninitializedNEW720012_51();
    spill720012_29 = __stackOp720012_52_0;
    __explicitNewInit720012_53(__stackOp720012_52_0, life5_128);
    (spill720012_27)[spill720012_28] = __call720012_54(spill720012_29);
    __explicitNewInit720012_55(spill720012_24, spill720012_25, spill720012_26);
    __explicitNewInit720012_56(spill720012_20, spill720012_21, spill720012_22, spill720012_23, life5_128);
    (spill720012_17)[spill720012_18] = __call720012_57(spill720012_19);
    }
    if (!((life2_11 != 0))) {
        break forest_join_147;
    }
    break forest_join_153;
    }
    if (!(__call720012_58(life4_10))) {
        break forest_join_153;
    }
    spill720012_30 = __call720012_59(life4_10);
    forestValue720012_104_0 = spill720012_30;
    continue forest_cycle_104;
    }
    }
    __call720012_61(__fieldRead720012_60());
    }
    return;
}
private static native long __fieldRead720012_0() throws Throwable;
private static native java.util.HashSet __call720012_1() throws Throwable;
private static native boolean __call720012_2() throws Throwable;
private static native net.minecraft.item.crafting.CraftingManager __call720012_3() throws Throwable;
private static native java.util.List __call720012_4(net.minecraft.item.crafting.CraftingManager a0) throws Throwable;
private static native java.util.Iterator __call720012_5(java.util.List a0) throws Throwable;
private static native int __integerCategory720012_6(boolean value) throws Throwable;
private static native boolean __call720012_7(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call720012_8(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.item.crafting.IRecipe __cast720012_9(java.lang.Object a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call720012_10(net.minecraft.item.crafting.IRecipe a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call720012_11(net.minecraft.item.crafting.IRecipe a0) throws Throwable;
private static native net.minecraft.item.Item __call720012_12(net.minecraft.item.ItemStack a0) throws Throwable;
private static native boolean __call720012_13(java.util.HashSet a0, net.minecraft.item.Item a1) throws Throwable;
private static native moom.xY __call720012_14() throws Throwable;
private static native java.util.Map __call720012_15(moom.xY a0) throws Throwable;
private static native java.util.Collection __call720012_16(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call720012_17(java.util.Collection a0) throws Throwable;
private static native boolean __call720012_18(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call720012_19(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.item.ItemStack __cast720012_20(java.lang.Object a0) throws Throwable;
private static native net.minecraft.item.Item __call720012_21(net.minecraft.item.ItemStack a0) throws Throwable;
private static native boolean __call720012_22(java.util.HashSet a0, net.minecraft.item.Item a1) throws Throwable;
private static native java.util.Iterator __call720012_23(java.util.HashSet a0) throws Throwable;
private static native boolean __call720012_24(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call720012_25(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.item.Item __cast720012_26(java.lang.Object a0) throws Throwable;
private static native int __call720012_27(net.minecraft.item.Item a0) throws Throwable;
private static native java.lang.String __call720012_28(net.minecraft.item.Item a0) throws Throwable;
private static native moom.BY[] __fieldRead720012_29() throws Throwable;
private static native moom.B1 __sourceUninitializedNEW720012_30() throws Throwable;
private static native moom.CN __sourceUninitializedNEW720012_32() throws Throwable;
private static native net.minecraft.item.ItemStack __sourceUninitializedNEW720012_35() throws Throwable;
private static native void __explicitNewInit720012_37(net.minecraft.item.ItemStack a0, net.minecraft.item.Item a1) throws Throwable;
private static native net.minecraft.util.IChatComponent __call720012_38(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __explicitNewInit720012_39(moom.CN a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native void __explicitNewInit720012_40(moom.B1 a0, java.lang.String a1, java.lang.String a2, net.minecraft.util.IChatComponent a3, net.minecraft.item.Item a4) throws Throwable;
private static native moom.BY __call720012_41(moom.B1 a0) throws Throwable;
private static native net.minecraft.item.Item __cast720012_42(java.lang.Object a0) throws Throwable;
private static native int __call720012_43(net.minecraft.item.Item a0) throws Throwable;
private static native java.lang.String __call720012_44(net.minecraft.item.Item a0) throws Throwable;
private static native moom.BY[] __fieldRead720012_45() throws Throwable;
private static native moom.B1 __sourceUninitializedNEW720012_46() throws Throwable;
private static native moom.CN __sourceUninitializedNEW720012_48() throws Throwable;
private static native net.minecraft.item.ItemStack __sourceUninitializedNEW720012_51() throws Throwable;
private static native void __explicitNewInit720012_53(net.minecraft.item.ItemStack a0, net.minecraft.item.Item a1) throws Throwable;
private static native net.minecraft.util.IChatComponent __call720012_54(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __explicitNewInit720012_55(moom.CN a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native void __explicitNewInit720012_56(moom.B1 a0, java.lang.String a1, java.lang.String a2, net.minecraft.util.IChatComponent a3, net.minecraft.item.Item a4) throws Throwable;
private static native moom.BY __call720012_57(moom.B1 a0) throws Throwable;
private static native boolean __call720012_58(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call720012_59(java.util.Iterator a0) throws Throwable;
private static native moom.BY[] __fieldRead720012_60() throws Throwable;
private static native void __call720012_61(moom.BY[] a0) throws Throwable;

}


public static moom.BY b(net.minecraft.entity.EntityList$EntityEggInfo p0) {
long local1 = (net.minecraft.stats.StatList.bb ^ 8161292982171L);
    java.lang.String local3 = net.minecraft.entity.EntityList.a__String(((int)(((net.minecraft.entity.EntityList$EntityEggInfo)(p0)).a)));
    return ((local3 == null) ? null : ((moom.BY)(new moom.BY(__sourceIntrinsic_a324524dbe47_invokedynamic10302_3(local3), new moom.CN("stat.entityKilledBy", new java.lang.Object[] {new moom.CN(__sourceIntrinsic_a324524dbe47_invokedynamic10302_4(local3), new java.lang.Object[0])})))).b());
}


public static void b(java.lang.String p0) {
af = ((java.lang.String)(p0));
    return;
}


public static java.lang.String b() {
return net.minecraft.stats.StatList.af;
}


private static void b__Void() { __sourceHandlerCall_f8183590944146a3a5ef(); }


private static void e() {
net.minecraft.item.Item lexicalValue1683_23_0;
    boolean spill1683_0;
    net.minecraft.item.Item spill1683_1;
    long life0_3;
    java.util.Iterator life3_7;
    int life2_8;
    net.minecraft.item.Item life4_15;
    int life5_30;
    java.lang.String life6_33;
    lexical_join_61: {
    lexical_join_59: {
    life0_3 = (net.minecraft.stats.StatList.bb ^ 133214844382980L);
    spill1683_0 = moom.BY.b__Boolean();
    life3_7 = ((moom.DB)(net.minecraft.item.Item.a)).iterator();
    life2_8 = ((spill1683_0) ? 1 : 0);
    lexical_cycle_9: while (true) {
    lexical_join_57: {
    lexical_join_23: {
    if (!(((java.util.Iterator)(life3_7)).hasNext())) {
        break lexical_join_59;
    }
    life4_15 = ((net.minecraft.item.Item)(((java.util.Iterator)(life3_7)).next()));
    if (!((life2_8 == 0))) {
        break lexical_join_61;
    }
    spill1683_1 = life4_15;
    if (!((life2_8 == 0))) {
        lexicalValue1683_23_0 = spill1683_1;
        break lexical_join_23;
    }
    if (!((spill1683_1 != null))) {
        break lexical_join_57;
    }
    lexicalValue1683_23_0 = life4_15;
    }
    life5_30 = net.minecraft.item.Item.a(((net.minecraft.item.Item)(lexicalValue1683_23_0)));
    life6_33 = net.minecraft.stats.StatList.a(((net.minecraft.item.Item)(life4_15)));
    if (!((life6_33 != null))) {
        break lexical_join_57;
    }
    if (!(((net.minecraft.item.Item)(life4_15)).b__Boolean())) {
        break lexical_join_57;
    }
    (net.minecraft.stats.StatList.ae)[life5_30] = ((moom.B1)(new moom.B1("stat.breakItem.", life6_33, new moom.CN("stat.breakItem", new java.lang.Object[] {((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(life4_15))).a__C5()}), life4_15))).b();
    }
    if (!((life2_8 != 0))) { continue lexical_cycle_9; }
    break lexical_cycle_9;
    }
    }
    net.minecraft.stats.StatList.a(((moom.BY[])(net.minecraft.stats.StatList.ae)));
    }
    return;
}


private static void c() {
int lexicalValue1681_66_0;
    boolean spill1681_0;
    boolean spill1681_1;
    long life0_3;
    java.util.Iterator life3_7;
    int life2_8;
    net.minecraft.block.Block life4_15;
    net.minecraft.item.Item life5_18;
    int life6_28;
    java.lang.String life7_31;
    lexical_join_71: {
    lexical_join_69: {
    life0_3 = (net.minecraft.stats.StatList.bb ^ 125086875896144L);
    spill1681_0 = moom.BY.c();
    life3_7 = ((moom.DC)(net.minecraft.block.Block.b)).iterator();
    life2_8 = ((spill1681_0) ? 1 : 0);
    lexical_cycle_9: while (true) {
    lexical_join_67: {
    lexical_join_66: {
    if (!(((java.util.Iterator)(life3_7)).hasNext())) {
        break lexical_join_69;
    }
    life4_15 = ((net.minecraft.block.Block)(((java.util.Iterator)(life3_7)).next()));
    life5_18 = net.minecraft.item.Item.a(((net.minecraft.block.Block)(life4_15)));
    if (!((life2_8 != 0))) {
        break lexical_join_71;
    }
    if (!((life5_18 != null))) {
        break lexical_join_67;
    }
    life6_28 = net.minecraft.block.Block.a(((net.minecraft.block.Block)(life4_15)));
    life7_31 = net.minecraft.stats.StatList.a(((net.minecraft.item.Item)(life5_18)));
    if (!((life7_31 != null))) {
        break lexical_join_67;
    }
    spill1681_1 = ((net.minecraft.block.Block)(life4_15)).o();
    if (!((life2_8 != 0))) {
        lexicalValue1681_66_0 = ((spill1681_1) ? 1 : 0);
        break lexical_join_66;
    }
    if (!(spill1681_1)) {
        break lexical_join_67;
    }
    (net.minecraft.stats.StatList.ab)[life6_28] = ((moom.B1)(new moom.B1("stat.mineBlock.", life7_31, new moom.CN("stat.mineBlock", new java.lang.Object[] {((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(life4_15))).a__C5()}), life5_18))).b();
    lexicalValue1681_66_0 = ((((java.util.List)(net.minecraft.stats.StatList.e)).add(((java.lang.Object)(((moom.B1)((net.minecraft.stats.StatList.ab)[life6_28])))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1681_66_0);
    }
    if (!((life2_8 == 0))) { continue lexical_cycle_9; }
    break lexical_cycle_9;
    }
    }
    net.minecraft.stats.StatList.a(((moom.BY[])(net.minecraft.stats.StatList.ab)));
    }
    return;
}


private static void d() {
net.minecraft.item.Item lexicalValue1682_23_0;
    int lexicalValue1682_67_0;
    boolean spill1682_0;
    net.minecraft.item.Item spill1682_1;
    int spill1682_2;
    long life0_3;
    java.util.Iterator life3_7;
    int life2_8;
    net.minecraft.item.Item life4_15;
    int life5_30;
    java.lang.String life6_33;
    lexical_join_72: {
    lexical_join_70: {
    life0_3 = (net.minecraft.stats.StatList.bb ^ 44735928252432L);
    spill1682_0 = moom.BY.c();
    life3_7 = ((moom.DB)(net.minecraft.item.Item.a)).iterator();
    life2_8 = ((spill1682_0) ? 1 : 0);
    lexical_cycle_9: while (true) {
    lexical_join_68: {
    lexical_join_67: {
    lexical_join_56: {
    lexical_join_23: {
    if (!(((java.util.Iterator)(life3_7)).hasNext())) {
        break lexical_join_70;
    }
    life4_15 = ((net.minecraft.item.Item)(((java.util.Iterator)(life3_7)).next()));
    if (!((life2_8 != 0))) {
        break lexical_join_72;
    }
    spill1682_1 = life4_15;
    if (!((life2_8 != 0))) {
        lexicalValue1682_23_0 = spill1682_1;
        break lexical_join_23;
    }
    if (!((spill1682_1 != null))) {
        break lexical_join_68;
    }
    lexicalValue1682_23_0 = life4_15;
    }
    life5_30 = net.minecraft.item.Item.a(((net.minecraft.item.Item)(lexicalValue1682_23_0)));
    life6_33 = net.minecraft.stats.StatList.a(((net.minecraft.item.Item)(life4_15)));
    if (!((life2_8 != 0))) {
        break lexical_join_56;
    }
    if (!((life6_33 != null))) {
        break lexical_join_68;
    }
    (net.minecraft.stats.StatList.ad)[life5_30] = ((moom.B1)(new moom.B1("stat.useItem.", life6_33, new moom.CN("stat.useItem", new java.lang.Object[] {((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(life4_15))).a__C5()}), life4_15))).b();
    }
    spill1682_2 = ((life4_15 instanceof moom.wU) ? 1 : 0);
    if (!((life2_8 != 0))) {
        lexicalValue1682_67_0 = spill1682_2;
        break lexical_join_67;
    }
    if (!((spill1682_2 == 0))) {
        break lexical_join_68;
    }
    lexicalValue1682_67_0 = ((((java.util.List)(net.minecraft.stats.StatList.d)).add(((java.lang.Object)(((moom.B1)((net.minecraft.stats.StatList.ad)[life5_30])))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1682_67_0);
    }
    if (!((life2_8 == 0))) { continue lexical_cycle_9; }
    break lexical_cycle_9;
    }
    }
    net.minecraft.stats.StatList.a(((moom.BY[])(net.minecraft.stats.StatList.ad)));
    }
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.stats.StatList.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 1433;
      if (db[var3] == null) {
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
         long var5 = cb[var3];
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
         Object[] var9 = (Object[])eb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               eb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/B4", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         db[var3] = var15;
      }

      return db[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12215_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/B4"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static void a() {
net.minecraft.stats.StatList.c();
    net.minecraft.stats.StatList.d();
    net.minecraft.stats.StatList.e();
    net.minecraft.stats.StatList.b__Void();
    net.minecraft.stats.AchievementList.a();
    net.minecraft.entity.EntityList.a__Void();
    return;
}


private static java.lang.String a(net.minecraft.item.Item p0) {
moom.DD forwardValue5625_16_0;
    java.lang.String forwardValue5625_30_0;
    boolean spill5625_0;
    moom.DD spill5625_1;
    long life1_3;
    moom.DD life4_9;
    int life3_10;
    forward_join_30: {
    forward_join_29: {
    forward_join_16: {
    life1_3 = (net.minecraft.stats.StatList.bb ^ 27841259031542L);
    spill5625_0 = moom.BY.c();
    life4_9 = ((moom.DD)(((moom.DB)(net.minecraft.item.Item.a)).b(((java.lang.Object)(p0)))));
    life3_10 = ((spill5625_0) ? 1 : 0);
    spill5625_1 = life4_9;
    if (!((life3_10 != 0))) {
        forwardValue5625_16_0 = spill5625_1;
        break forward_join_16;
    }
    if (!((spill5625_1 != null))) {
        break forward_join_29;
    }
    forwardValue5625_16_0 = life4_9;
    }
    forwardValue5625_30_0 = ((java.lang.String)(((moom.DD)(forwardValue5625_16_0)).toString())).replace(((char)(__sourceIntrinsic_31d0114a0634_invokedynamic5625_7(5097, (4893103869232342744L ^ life1_3)))), ((char)(__sourceIntrinsic_31d0114a0634_invokedynamic5625_8(25837, (1293691761829745113L ^ life1_3)))));
    break forward_join_30;
    }
    forwardValue5625_30_0 = null;
    }
    return forwardValue5625_30_0;
}


private static void a(moom.BY[] p0) {
net.minecraft.stats.StatList.a(((moom.BY[])(p0)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.j)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.i)));
    net.minecraft.stats.StatList.a(((moom.BY[])(p0)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.l)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.k)));
    net.minecraft.stats.StatList.a(((moom.BY[])(p0)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.aZ)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.aU)));
    net.minecraft.stats.StatList.a(((moom.BY[])(p0)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.am)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.al)));
    net.minecraft.stats.StatList.a(((moom.BY[])(p0)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.aD)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.aC)));
    net.minecraft.stats.StatList.a(((moom.BY[])(p0)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.a2)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.a1)));
    net.minecraft.stats.StatList.a(((moom.BY[])(p0)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.bZ)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.bY)));
    net.minecraft.stats.StatList.a(((moom.BY[])(p0)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.aF)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.aE)));
    net.minecraft.stats.StatList.a(((moom.BY[])(p0)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.bz)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.by)));
    net.minecraft.stats.StatList.a(((moom.BY[])(p0)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.T)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.U)));
    net.minecraft.stats.StatList.a(((moom.BY[])(p0)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.bA)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.bB)));
    net.minecraft.stats.StatList.a(((moom.BY[])(p0)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.cs)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.ct)));
    net.minecraft.stats.StatList.a(((moom.BY[])(p0)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.c)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)));
    net.minecraft.stats.StatList.a(((moom.BY[])(p0)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.ak)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)));
    return;
}


private static void a(moom.BY[] p0, net.minecraft.block.Block p1, net.minecraft.block.Block p2) {
moom.BY[] forwardValue5626_52_0;
    int forwardValue5626_52_1;
    boolean spill5626_0;
    moom.BY[] spill5626_1;
    int spill5626_2;
    moom.BY[] spill5626_3;
    int spill5626_4;
    long life3_3;
    int life6_7;
    int life5_8;
    int life7_11;
    forward_join_56: {
    forward_join_52: {
    forward_join_32: {
    life3_3 = (net.minecraft.stats.StatList.bb ^ 27914140848696L);
    spill5626_0 = moom.BY.c();
    life6_7 = net.minecraft.block.Block.a(((net.minecraft.block.Block)(p1)));
    life5_8 = ((spill5626_0) ? 1 : 0);
    life7_11 = net.minecraft.block.Block.a(((net.minecraft.block.Block)(p2)));
    spill5626_1 = p0;
    spill5626_2 = life6_7;
    if (!((life5_8 != 0))) {
        forwardValue5626_52_0 = spill5626_1;
        forwardValue5626_52_1 = spill5626_2;
        break forward_join_52;
    }
    if (!(((spill5626_1)[spill5626_2] != null))) {
        break forward_join_32;
    }
    spill5626_3 = p0;
    spill5626_4 = life7_11;
    if (!((life5_8 != 0))) {
        forwardValue5626_52_0 = spill5626_3;
        forwardValue5626_52_1 = spill5626_4;
        break forward_join_52;
    }
    if (!(((spill5626_3)[spill5626_4] == null))) {
        break forward_join_32;
    }
    (p0)[life7_11] = (p0)[life6_7];
    if (!((life5_8 == 0))) {
        break forward_join_56;
    }
    }
    ((java.util.List)(net.minecraft.stats.StatList.b)).remove(((java.lang.Object)((p0)[life6_7])));
    ((java.util.List)(net.minecraft.stats.StatList.e)).remove(((java.lang.Object)((p0)[life6_7])));
    ((java.util.List)(net.minecraft.stats.StatList.c)).remove(((java.lang.Object)((p0)[life6_7])));
    forwardValue5626_52_0 = p0;
    forwardValue5626_52_1 = life6_7;
    }
    (forwardValue5626_52_0)[forwardValue5626_52_1] = (p0)[life7_11];
    }
    return;
}


public static moom.BY a(net.minecraft.entity.EntityList$EntityEggInfo p0) {
long local1 = (net.minecraft.stats.StatList.bb ^ 106651749874618L);
    java.lang.String local3 = net.minecraft.entity.EntityList.a__String(((int)(((net.minecraft.entity.EntityList$EntityEggInfo)(p0)).a)));
    return ((local3 == null) ? null : ((moom.BY)(new moom.BY(__sourceIntrinsic_d8fac6043413_invokedynamic10309_3(local3), new moom.CN("stat.entityKill", new java.lang.Object[] {new moom.CN(__sourceIntrinsic_d8fac6043413_invokedynamic10309_4(local3), new java.lang.Object[0])})))).b());
}


public static moom.BY a(java.lang.String p0) {
return ((moom.BY)(((java.util.Map)(net.minecraft.stats.StatList.a)).get(((java.lang.Object)(p0)))));
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1922_193(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1922_195(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1922_197(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1922_199(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12215_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d8fac6043413_invokedynamic10309_3(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d8fac6043413_invokedynamic10309_4(java.lang.String a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_31d0114a0634_invokedynamic5625_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_31d0114a0634_invokedynamic5625_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a324524dbe47_invokedynamic10302_3(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a324524dbe47_invokedynamic10302_4(java.lang.String a0) throws E;
}
