package net.minecraft.stats;


public class AchievementList {

public static int a;

public static int b;

public static int c;

public static int d;

public static java.util.List<moom.BZ> e;

public static moom.BZ f;

public static moom.BZ g;

public static moom.BZ h;

public static moom.BZ i;

public static moom.BZ j;

public static moom.BZ k;

public static moom.BZ l;

public static moom.BZ m;

public static moom.BZ n;

public static moom.BZ o;

public static moom.BZ p;

public static moom.BZ q;

public static moom.BZ r;

public static moom.BZ s;

public static moom.BZ t;

public static moom.BZ u;

public static moom.BZ v;

public static moom.BZ w;

public static moom.BZ x;

public static moom.BZ y;

public static moom.BZ z;

public static moom.BZ A;

public static moom.BZ B;

public static moom.BZ C;

public static moom.BZ D;

public static moom.BZ E;

public static moom.BZ F;

public static moom.BZ G;

public static moom.BZ H;

public static moom.BZ I;

public static moom.BZ J;

public static moom.BZ K;

public static moom.BZ L;

public static moom.BZ M;

public AchievementList() {
super();
}


static {
long local11_life4 = (((moom._a)(moom._c.a(((long)(-4021447997948763460L)), ((long)(-8129390721219762627L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(109405628659245L))) ^ 133211296885474L);
    javax.crypto.Cipher local1_life6;
    javax.crypto.Cipher __sourceSpill1921_8 = (local1_life6 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1921_9 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1921_10 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1921_11 = new byte[8];
    (__sourceSpill1921_11)[0] = ((byte) ((int) (local11_life4 >>> 56)));
    int local2_life12 = 1;
    while ((local2_life12 < 8)) {
        (__sourceSpill1921_11)[local2_life12] = ((byte) ((int) ((local11_life4 << (local2_life12 * 8)) >>> 56)));
        local2_life12 += 1;
    }
    byte[] __sourcePreallocation1921_13 = __sourceSpill1921_11;
    ((javax.crypto.Cipher)(__sourceSpill1921_8)).init(((int)(__sourceSpill1921_9)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1921_10)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1921_13)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local0_life16 = new long[18];
    int local4_life17 = 0;
    java.lang.String local5_life18;
    int local6_life20 = ((java.lang.String)((local5_life18 = "/Ñ´òòñá\027ÿ~\"\005V^¾}è#rg\006t8PSºê¥ÀdÍD¸[\031Ü¼*ÒzÄ{®åkævÀÉ\022´\023oþA0ö¥§ÞKÈ7ùQVµ6?Ô\\ÛNV2Â\001Cô\r\007¬æ·ÇÛEÛÁ¶ü øÇ_È¿£\\Ð;èl\t÷±gÃ\rpÎè"))).length();
    int local3_life21 = 0;
    do {
        java.lang.String __sourceSpill1921_22 = local5_life18;
        int __sourceSpill1921_23 = local3_life21;
        local3_life21 += 8;
        byte[] local7_life26 = ((java.lang.String)(((java.lang.String)(__sourceSpill1921_22)).substring(((int)(__sourceSpill1921_23)), ((int)(local3_life21))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1921_27 = local0_life16;
        int __sourceSpill1921_28 = local4_life17;
        local4_life17 += 1;
        long local8_life29 = (((((((((((long) (local7_life26)[0]) & 255L) << 56) | ((((long) (local7_life26)[1]) & 255L) << 48)) | ((((long) (local7_life26)[2]) & 255L) << 40)) | ((((long) (local7_life26)[3]) & 255L) << 32)) | ((((long) (local7_life26)[4]) & 255L) << 24)) | ((((long) (local7_life26)[5]) & 255L) << 16)) | ((((long) (local7_life26)[6]) & 255L) << 8)) | (((long) (local7_life26)[7]) & 255L));
        byte[] __sourceSpill1921_30 = new byte[8];
        (__sourceSpill1921_30)[0] = ((byte) ((int) (local8_life29 >>> 56)));
        (__sourceSpill1921_30)[1] = ((byte) ((int) (local8_life29 >>> 48)));
        (__sourceSpill1921_30)[2] = ((byte) ((int) (local8_life29 >>> 40)));
        (__sourceSpill1921_30)[3] = ((byte) ((int) (local8_life29 >>> 32)));
        (__sourceSpill1921_30)[4] = ((byte) ((int) (local8_life29 >>> 24)));
        (__sourceSpill1921_30)[5] = ((byte) ((int) (local8_life29 >>> 16)));
        (__sourceSpill1921_30)[6] = ((byte) ((int) (local8_life29 >>> 8)));
        (__sourceSpill1921_30)[7] = ((byte) ((int) local8_life29));
        javax.crypto.Cipher __sourceSpill1921_31 = local1_life6;
        byte[] local10_life33 = ((javax.crypto.Cipher)(__sourceSpill1921_31)).doFinal(((byte[])(__sourceSpill1921_30)));
        (__sourceSpill1921_27)[__sourceSpill1921_28] = (((((((((((long) (local10_life33)[0]) & 255L) << 56) | ((((long) (local10_life33)[1]) & 255L) << 48)) | ((((long) (local10_life33)[2]) & 255L) << 40)) | ((((long) (local10_life33)[3]) & 255L) << 32)) | ((((long) (local10_life33)[4]) & 255L) << 24)) | ((((long) (local10_life33)[5]) & 255L) << 16)) | ((((long) (local10_life33)[6]) & 255L) << 8)) | (((long) (local10_life33)[7]) & 255L));
    } while ((!(local3_life21 >= local6_life20)));
    local6_life20 = ((java.lang.String)((local5_life18 = "¾bu_\003`f¢Ê@ãßÍS]"))).length();
    local3_life21 = 0;
    do {
        java.lang.String __sourceSpill1921_35 = local5_life18;
        int __sourceSpill1921_36 = local3_life21;
        local3_life21 += 8;
        byte[] local7_life39 = ((java.lang.String)(((java.lang.String)(__sourceSpill1921_35)).substring(((int)(__sourceSpill1921_36)), ((int)(local3_life21))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1921_40 = local0_life16;
        int __sourceSpill1921_41 = local4_life17;
        local4_life17 += 1;
        long local8_life42 = (((((((((((long) (local7_life39)[0]) & 255L) << 56) | ((((long) (local7_life39)[1]) & 255L) << 48)) | ((((long) (local7_life39)[2]) & 255L) << 40)) | ((((long) (local7_life39)[3]) & 255L) << 32)) | ((((long) (local7_life39)[4]) & 255L) << 24)) | ((((long) (local7_life39)[5]) & 255L) << 16)) | ((((long) (local7_life39)[6]) & 255L) << 8)) | (((long) (local7_life39)[7]) & 255L));
        byte[] __sourceSpill1921_43 = new byte[8];
        (__sourceSpill1921_43)[0] = ((byte) ((int) (local8_life42 >>> 56)));
        (__sourceSpill1921_43)[1] = ((byte) ((int) (local8_life42 >>> 48)));
        (__sourceSpill1921_43)[2] = ((byte) ((int) (local8_life42 >>> 40)));
        (__sourceSpill1921_43)[3] = ((byte) ((int) (local8_life42 >>> 32)));
        (__sourceSpill1921_43)[4] = ((byte) ((int) (local8_life42 >>> 24)));
        (__sourceSpill1921_43)[5] = ((byte) ((int) (local8_life42 >>> 16)));
        (__sourceSpill1921_43)[6] = ((byte) ((int) (local8_life42 >>> 8)));
        (__sourceSpill1921_43)[7] = ((byte) ((int) local8_life42));
        javax.crypto.Cipher __sourceSpill1921_44 = local1_life6;
        byte[] local10_life46 = ((javax.crypto.Cipher)(__sourceSpill1921_44)).doFinal(((byte[])(__sourceSpill1921_43)));
        (__sourceSpill1921_40)[__sourceSpill1921_41] = (((((((((((long) (local10_life46)[0]) & 255L) << 56) | ((((long) (local10_life46)[1]) & 255L) << 48)) | ((((long) (local10_life46)[2]) & 255L) << 40)) | ((((long) (local10_life46)[3]) & 255L) << 32)) | ((((long) (local10_life46)[4]) & 255L) << 24)) | ((((long) (local10_life46)[5]) & 255L) << 16)) | ((((long) (local10_life46)[6]) & 255L) << 8)) | (((long) (local10_life46)[7]) & 255L));
    } while ((!(local3_life21 >= local6_life20)));
    e = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    f = ((moom.BZ)(__sourceExactCall_a95dee905e7979(((moom.BZ)(__sourceExactCall_ce9a5adcaa183b(((moom.BZ)(new moom.BZ("achievement.openInventory", "openInventory", 0, 0, net.minecraft.init.Items.aL, null)))))))));
    g = ((moom.BZ)(__sourceExactCall_a95dee905e7979(((moom.BZ)(new moom.BZ("achievement.mineWood", "mineWood", 2, 1, net.minecraft.init.Blocks.r, net.minecraft.stats.AchievementList.f))))));
    h = ((moom.BZ)(__sourceExactCall_a95dee905e7979(((moom.BZ)(new moom.BZ("achievement.buildWorkBench", "buildWorkBench", 4, -1, net.minecraft.init.Blocks.ai, net.minecraft.stats.AchievementList.g))))));
    i = ((moom.BZ)(__sourceExactCall_a95dee905e7979(((moom.BZ)(new moom.BZ("achievement.buildPickaxe", "buildPickaxe", 4, 2, net.minecraft.init.Items.o, net.minecraft.stats.AchievementList.h))))));
    j = ((moom.BZ)(__sourceExactCall_a95dee905e7979(((moom.BZ)(new moom.BZ("achievement.buildFurnace", "buildFurnace", 3, 4, net.minecraft.init.Blocks.al, net.minecraft.stats.AchievementList.i))))));
    k = ((moom.BZ)(__sourceExactCall_a95dee905e7979(((moom.BZ)(new moom.BZ("achievement.acquireIron", "acquireIron", 1, 4, net.minecraft.init.Items.j, net.minecraft.stats.AchievementList.j))))));
    l = ((moom.BZ)(__sourceExactCall_a95dee905e7979(((moom.BZ)(new moom.BZ("achievement.buildHoe", "buildHoe", 2, ((int) (local0_life16)[15]), net.minecraft.init.Items.I, net.minecraft.stats.AchievementList.h))))));
    m = ((moom.BZ)(__sourceExactCall_a95dee905e7979(((moom.BZ)(new moom.BZ("achievement.makeBread", "makeBread", -1, ((int) (local0_life16)[17]), net.minecraft.init.Items.P, net.minecraft.stats.AchievementList.l))))));
    n = ((moom.BZ)(__sourceExactCall_a95dee905e7979(((moom.BZ)(new moom.BZ("achievement.bakeCake", "bakeCake", 0, ((int) (local0_life16)[3]), net.minecraft.init.Items.aZ, net.minecraft.stats.AchievementList.l))))));
    o = ((moom.BZ)(__sourceExactCall_a95dee905e7979(((moom.BZ)(new moom.BZ("achievement.buildBetterPickaxe", "buildBetterPickaxe", ((int) (local0_life16)[9]), 2, net.minecraft.init.Items.s, net.minecraft.stats.AchievementList.i))))));
    p = ((moom.BZ)(__sourceExactCall_a95dee905e7979(((moom.BZ)(new moom.BZ("achievement.cookFish", "cookFish", 2, ((int) (local0_life16)[2]), net.minecraft.init.Items.aV, net.minecraft.stats.AchievementList.j))))));
    q = ((moom.BZ)(__sourceExactCall_a95dee905e7979(((moom.BZ)(__sourceExactCall_59ae749c60dbec(((moom.BZ)(new moom.BZ("achievement.onARail", "onARail", 2, 3, net.minecraft.init.Blocks.av, net.minecraft.stats.AchievementList.k)))))))));
    r = ((moom.BZ)(__sourceExactCall_a95dee905e7979(((moom.BZ)(new moom.BZ("achievement.buildSword", "buildSword", ((int) (local0_life16)[2]), -1, net.minecraft.init.Items.m, net.minecraft.stats.AchievementList.h))))));
    s = ((moom.BZ)(__sourceExactCall_a95dee905e7979(((moom.BZ)(new moom.BZ("achievement.killEnemy", "killEnemy", ((int) (local0_life16)[10]), -1, net.minecraft.init.Items.aX, net.minecraft.stats.AchievementList.r))))));
    t = ((moom.BZ)(__sourceExactCall_a95dee905e7979(((moom.BZ)(new moom.BZ("achievement.killCow", "killCow", ((int) (local0_life16)[13]), ((int) (local0_life16)[17]), net.minecraft.init.Items.aF, net.minecraft.stats.AchievementList.r))))));
    u = ((moom.BZ)(__sourceExactCall_a95dee905e7979(((moom.BZ)(__sourceExactCall_59ae749c60dbec(((moom.BZ)(new moom.BZ("achievement.flyPig", "flyPig", ((int) (local0_life16)[6]), ((int) (local0_life16)[17]), net.minecraft.init.Items.aA, net.minecraft.stats.AchievementList.t)))))))));
    v = ((moom.BZ)(__sourceExactCall_a95dee905e7979(((moom.BZ)(__sourceExactCall_59ae749c60dbec(((moom.BZ)(new moom.BZ("achievement.snipeSkeleton", "snipeSkeleton", ((int) (local0_life16)[4]), 0, net.minecraft.init.Items.f, net.minecraft.stats.AchievementList.s)))))))));
    w = ((moom.BZ)(__sourceExactCall_a95dee905e7979(((moom.BZ)(new moom.BZ("achievement.diamonds", "diamonds", -1, 5, net.minecraft.init.Blocks.ag, net.minecraft.stats.AchievementList.k))))));
    x = ((moom.BZ)(__sourceExactCall_a95dee905e7979(((moom.BZ)(new moom.BZ("achievement.diamondsToYou", "diamondsToYou", -1, 2, net.minecraft.init.Items.i, net.minecraft.stats.AchievementList.w))))));
    y = ((moom.BZ)(__sourceExactCall_a95dee905e7979(((moom.BZ)(new moom.BZ("achievement.portal", "portal", -1, ((int) (local0_life16)[4]), net.minecraft.init.Blocks.Z, net.minecraft.stats.AchievementList.w))))));
    z = ((moom.BZ)(__sourceExactCall_a95dee905e7979(((moom.BZ)(__sourceExactCall_59ae749c60dbec(((moom.BZ)(new moom.BZ("achievement.ghast", "ghast", ((int) (local0_life16)[14]), ((int) (local0_life16)[5]), net.minecraft.init.Items.bl, net.minecraft.stats.AchievementList.y)))))))));
    A = ((moom.BZ)(__sourceExactCall_a95dee905e7979(((moom.BZ)(new moom.BZ("achievement.blazeRod", "blazeRod", 0, ((int) (local0_life16)[16]), net.minecraft.init.Items.bk, net.minecraft.stats.AchievementList.y))))));
    B = ((moom.BZ)(__sourceExactCall_a95dee905e7979(((moom.BZ)(new moom.BZ("achievement.potion", "potion", 2, ((int) (local0_life16)[5]), net.minecraft.init.Items.bo, net.minecraft.stats.AchievementList.A))))));
    C = ((moom.BZ)(__sourceExactCall_a95dee905e7979(((moom.BZ)(__sourceExactCall_59ae749c60dbec(((moom.BZ)(new moom.BZ("achievement.theEnd", "theEnd", 3, ((int) (local0_life16)[8]), net.minecraft.init.Items.bw, net.minecraft.stats.AchievementList.A)))))))));
    D = ((moom.BZ)(__sourceExactCall_a95dee905e7979(((moom.BZ)(__sourceExactCall_59ae749c60dbec(((moom.BZ)(new moom.BZ("achievement.theEnd2", "theEnd2", 4, ((int) (local0_life16)[0]), net.minecraft.init.Blocks.bx, net.minecraft.stats.AchievementList.C)))))))));
    E = ((moom.BZ)(__sourceExactCall_a95dee905e7979(((moom.BZ)(new moom.BZ("achievement.enchantments", "enchantments", ((int) (local0_life16)[7]), 4, net.minecraft.init.Blocks.br, net.minecraft.stats.AchievementList.w))))));
    F = ((moom.BZ)(__sourceExactCall_a95dee905e7979(((moom.BZ)(__sourceExactCall_59ae749c60dbec(((moom.BZ)(new moom.BZ("achievement.overkill", "overkill", ((int) (local0_life16)[7]), 1, net.minecraft.init.Items.u, net.minecraft.stats.AchievementList.E)))))))));
    G = ((moom.BZ)(__sourceExactCall_a95dee905e7979(((moom.BZ)(new moom.BZ("achievement.bookcase", "bookcase", ((int) (local0_life16)[17]), ((int) (local0_life16)[2]), net.minecraft.init.Blocks.X, net.minecraft.stats.AchievementList.E))))));
    H = ((moom.BZ)(__sourceExactCall_a95dee905e7979(((moom.BZ)(new moom.BZ("achievement.breedCow", "breedCow", ((int) (local0_life16)[4]), ((int) (local0_life16)[12]), net.minecraft.init.Items.O, net.minecraft.stats.AchievementList.t))))));
    I = ((moom.BZ)(__sourceExactCall_a95dee905e7979(((moom.BZ)(new moom.BZ("achievement.spawnWither", "spawnWither", ((int) (local0_life16)[4]), ((int) (local0_life16)[1]), new net.minecraft.item.ItemStack(net.minecraft.init.Items.bM, 1, 1), net.minecraft.stats.AchievementList.D))))));
    J = ((moom.BZ)(__sourceExactCall_a95dee905e7979(((moom.BZ)(new moom.BZ("achievement.killWither", "killWither", ((int) (local0_life16)[4]), ((int) (local0_life16)[11]), net.minecraft.init.Items.bO, net.minecraft.stats.AchievementList.I))))));
    K = ((moom.BZ)(__sourceExactCall_a95dee905e7979(((moom.BZ)(__sourceExactCall_59ae749c60dbec(((moom.BZ)(new moom.BZ("achievement.fullBeacon", "fullBeacon", ((int) (local0_life16)[4]), ((int) (local0_life16)[5]), net.minecraft.init.Blocks.bN, net.minecraft.stats.AchievementList.J)))))))));
    L = ((moom.BZ)(__sourceExactCall_a95dee905e7979(((moom.BZ)(__sourceExactCall_59ae749c60dbec(((moom.BZ)(__sourceExactCall_58705645e2bf1f(((moom.BZ)(new moom.BZ("achievement.exploreAllBiomes", "exploreAllBiomes", 4, ((int) (local0_life16)[5]), net.minecraft.init.Items.af, net.minecraft.stats.AchievementList.C))), ((java.lang.Class)(moom.f.class)))))))))));
    M = ((moom.BZ)(__sourceExactCall_a95dee905e7979(((moom.BZ)(__sourceExactCall_59ae749c60dbec(((moom.BZ)(new moom.BZ("achievement.overpowered", "overpowered", ((int) (local0_life16)[2]), 4, new net.minecraft.item.ItemStack(net.minecraft.init.Items.ao, 1, 1), net.minecraft.stats.AchievementList.o)))))))));
}


public static void a() {
return;
}


private static native moom.BZ __sourceExactCall_a95dee905e7979(moom.BZ p0);
private static native moom.BZ __sourceExactCall_ce9a5adcaa183b(moom.BZ p0);
private static native moom.BZ __sourceExactCall_59ae749c60dbec(moom.BZ p0);
private static native moom.BZ __sourceExactCall_58705645e2bf1f(moom.BZ p0, java.lang.Class p1);
}
