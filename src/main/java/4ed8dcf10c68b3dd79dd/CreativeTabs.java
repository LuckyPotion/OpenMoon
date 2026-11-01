package net.minecraft.creativetab;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class CreativeTabs {

public static final net.minecraft.creativetab.CreativeTabs[] a;

public static final net.minecraft.creativetab.CreativeTabs b;

public static final net.minecraft.creativetab.CreativeTabs c;

public static final net.minecraft.creativetab.CreativeTabs d;

public static final net.minecraft.creativetab.CreativeTabs e;

public static final net.minecraft.creativetab.CreativeTabs f;

public static final net.minecraft.creativetab.CreativeTabs g;

public static final net.minecraft.creativetab.CreativeTabs h;

public static final net.minecraft.creativetab.CreativeTabs i;

public static final net.minecraft.creativetab.CreativeTabs j;

public static final net.minecraft.creativetab.CreativeTabs k;

public static final net.minecraft.creativetab.CreativeTabs l;

public static final net.minecraft.creativetab.CreativeTabs m;

private final int n;

private final java.lang.String o;

private java.lang.String p;

private boolean q;

private boolean r;

private net.minecraft.enchantment.EnumEnchantmentType[] s;

private net.minecraft.item.ItemStack t;

private static boolean u;

private static final long v;

private static final long[] w;

private static final java.lang.Integer[] x;

private static final java.util.Map y;

public CreativeTabs(int p0, java.lang.String p1) {
super();
    this.p = ((java.lang.String)("items.png"));
    this.q = ((boolean)(true));
    this.r = ((boolean)(true));
    this.n = ((int)(p0));
    this.o = ((java.lang.String)(p1));
    (net.minecraft.creativetab.CreativeTabs.a)[p0] = this;
    return;
}


static {
javax.crypto.Cipher forestValue557_38_0;
    int forestValue557_38_1;
    javax.crypto.SecretKeyFactory forestValue557_38_2;
    byte[] forestValue557_38_3;
    javax.crypto.Cipher forestValue557_55_0;
    int forestValue557_55_1;
    javax.crypto.SecretKeyFactory forestValue557_55_2;
    byte[] forestValue557_55_3;
    long[] forestValue557_159_0;
    int forestValue557_159_1;
    long forestValue557_159_2;
    int forestValue557_159_3;
    long[] forestValue557_302_0;
    int forestValue557_302_1;
    long forestValue557_302_2;
    long[] forestValue557_314_0;
    int forestValue557_314_1;
    long forestValue557_314_2;
    int spill557_0;
    javax.crypto.Cipher spill557_1;
    int spill557_2;
    javax.crypto.SecretKeyFactory spill557_3;
    byte[] spill557_4;
    byte[] spill557_5;
    java.lang.String spill557_6;
    int spill557_7;
    int spill557_8;
    long spill557_9;
    byte[] spill557_10;
    byte[] spill557_11;
    byte[] spill557_12;
    byte[] spill557_13;
    byte[] spill557_14;
    byte[] spill557_15;
    byte[] spill557_16;
    byte[] spill557_17;
    long spill557_18;
    int spill557_19;
    java.lang.String spill557_20;
    int spill557_21;
    long[] spill557_22;
    int spill557_23;
    long spill557_24;
    int spill557_25;
    moom.q9 spill557_26;
    net.minecraft.enchantment.EnumEnchantmentType[] spill557_27;
    moom.rb spill557_28;
    net.minecraft.enchantment.EnumEnchantmentType[] spill557_29;
    net.minecraft.enchantment.EnumEnchantmentType[] spill557_30;
    net.minecraft.enchantment.EnumEnchantmentType[] spill557_31;
    moom.rc spill557_32;
    net.minecraft.enchantment.EnumEnchantmentType[] spill557_33;
    net.minecraft.enchantment.EnumEnchantmentType[] spill557_34;
    net.minecraft.enchantment.EnumEnchantmentType[] spill557_35;
    net.minecraft.enchantment.EnumEnchantmentType[] spill557_36;
    net.minecraft.enchantment.EnumEnchantmentType[] spill557_37;
    net.minecraft.enchantment.EnumEnchantmentType[] spill557_38;
    net.minecraft.enchantment.EnumEnchantmentType[] spill557_39;
    long life11_11;
    javax.crypto.Cipher life0_22;
    int life1_37;
    long[] life6_68;
    int life3_70;
    java.lang.String life4_73;
    int life5_75;
    int life2_77;
    byte[] life7_85;
    long life8_162;
    byte[] life10_230;
    byte[] life7_327;
    forest_join_401: {
    forest_join_55: {
    v = ((long)(((moom._a)(moom._c.a(((long)(8225725812554714476L)), ((long)(7286730042519110997L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(168782633119710L)))));
    life11_11 = (net.minecraft.creativetab.CreativeTabs.v ^ 81387150095589L);
    spill557_0 = 0;
    y = ((java.util.Map)(new java.util.HashMap(13)));
    net.minecraft.creativetab.CreativeTabs.b(((boolean)__sourceIntrinsic_integerToBoolean((spill557_0))));
    spill557_1 = (life0_22 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill557_2 = 2;
    spill557_3 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp557_10_0 = new byte[8];
    spill557_4 = __stackOp557_10_0;
    (__stackOp557_10_0)[0] = ((byte) ((int) (life11_11 >>> 56)));
    life1_37 = 1;
    forestValue557_38_0 = spill557_1;
    forestValue557_38_1 = spill557_2;
    forestValue557_38_2 = spill557_3;
    forestValue557_38_3 = spill557_4;
    forest_cycle_38: while (true) {
    if (!((life1_37 < 8))) {
        forestValue557_55_0 = forestValue557_38_0;
        forestValue557_55_1 = forestValue557_38_1;
        forestValue557_55_2 = forestValue557_38_2;
        forestValue557_55_3 = forestValue557_38_3;
        break forest_join_55;
    }
    byte[] __stackOp557_11_0 = forestValue557_38_3;
    spill557_5 = __stackOp557_11_0;
    (__stackOp557_11_0)[life1_37] = ((byte) ((int) ((life11_11 << (life1_37 * 8)) >>> 56)));
    life1_37 += 1;
    forestValue557_38_3 = spill557_5;
    continue forest_cycle_38;
    }
    }
    ((javax.crypto.Cipher)(forestValue557_55_0)).init(((int)(forestValue557_55_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue557_55_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue557_55_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life6_68 = new long[9];
    life3_70 = 0;
    life5_75 = ((java.lang.String)((life4_73 = "bP¬n«ë yn×úïåãÈÛ1ÏýT¡çUç?¤ò\021{(\\®(ÐË÷K°¸ÕÌÿýµ:\"ñmGµ"))).length();
    life2_77 = 0;
    forest_cycle_78: while (true) {
    spill557_6 = life4_73;
    spill557_7 = life2_77;
    life2_77 += 8;
    life7_85 = ((java.lang.String)(((java.lang.String)(spill557_6)).substring(((int)(spill557_7)), ((int)(life2_77))))).getBytes(((java.lang.String)("ISO-8859-1")));
    forestValue557_159_0 = life6_68;
    forestValue557_159_1 = (life3_70++);
    forestValue557_159_2 = (((((((((((long) (life7_85)[0]) & 255L) << 56) | ((((long) (life7_85)[1]) & 255L) << 48)) | ((((long) (life7_85)[2]) & 255L) << 40)) | ((((long) (life7_85)[3]) & 255L) << 32)) | ((((long) (life7_85)[4]) & 255L) << 24)) | ((((long) (life7_85)[5]) & 255L) << 16)) | ((((long) (life7_85)[6]) & 255L) << 8)) | (((long) (life7_85)[7]) & 255L));
    forestValue557_159_3 = -1;
    forest_cycle_159: while (true) {
    forest_join_319: {
    forest_join_314: {
    forest_join_302: {
    long __stackOp557_17_0 = forestValue557_159_2;
    int __stackOp557_17_1 = forestValue557_159_3;
    spill557_8 = __stackOp557_17_1;
    spill557_9 = __stackOp557_17_0;
    recovery.source.CarrierOps.discard(__stackOp557_17_1);
    life8_162 = spill557_9;
    byte[] __stackOp557_19_0 = new byte[8];
    spill557_10 = __stackOp557_19_0;
    (__stackOp557_19_0)[0] = ((byte) ((int) (life8_162 >>> 56)));
    byte[] __stackOp557_20_0 = spill557_10;
    spill557_11 = __stackOp557_20_0;
    (__stackOp557_20_0)[1] = ((byte) ((int) (life8_162 >>> 48)));
    byte[] __stackOp557_21_0 = spill557_11;
    spill557_12 = __stackOp557_21_0;
    (__stackOp557_21_0)[2] = ((byte) ((int) (life8_162 >>> 40)));
    byte[] __stackOp557_22_0 = spill557_12;
    spill557_13 = __stackOp557_22_0;
    (__stackOp557_22_0)[3] = ((byte) ((int) (life8_162 >>> 32)));
    byte[] __stackOp557_23_0 = spill557_13;
    spill557_14 = __stackOp557_23_0;
    (__stackOp557_23_0)[4] = ((byte) ((int) (life8_162 >>> 24)));
    byte[] __stackOp557_24_0 = spill557_14;
    spill557_15 = __stackOp557_24_0;
    (__stackOp557_24_0)[5] = ((byte) ((int) (life8_162 >>> 16)));
    byte[] __stackOp557_25_0 = spill557_15;
    spill557_16 = __stackOp557_25_0;
    (__stackOp557_25_0)[6] = ((byte) ((int) (life8_162 >>> 8)));
    byte[] __stackOp557_26_0 = spill557_16;
    spill557_17 = __stackOp557_26_0;
    (__stackOp557_26_0)[7] = ((byte) ((int) life8_162));
    byte[] __stackOp557_27_0 = spill557_17;
    javax.crypto.Cipher __stackOp557_27_1 = life0_22;
    life10_230 = ((javax.crypto.Cipher)(__stackOp557_27_1)).doFinal(((byte[])(__stackOp557_27_0)));
    int __stackOp557_29_0 = spill557_8;
    long __stackOp557_29_1 = (((((((((((long) (life10_230)[0]) & 255L) << 56) | ((((long) (life10_230)[1]) & 255L) << 48)) | ((((long) (life10_230)[2]) & 255L) << 40)) | ((((long) (life10_230)[3]) & 255L) << 32)) | ((((long) (life10_230)[4]) & 255L) << 24)) | ((((long) (life10_230)[5]) & 255L) << 16)) | ((((long) (life10_230)[6]) & 255L) << 8)) | (((long) (life10_230)[7]) & 255L));
    spill557_18 = __stackOp557_29_1;
    spill557_19 = __stackOp557_29_0;
    recovery.source.CarrierOps.discard(__stackOp557_29_1);
    switch (spill557_19) {
default:
{
        forestValue557_302_0 = forestValue557_159_0;
        forestValue557_302_1 = forestValue557_159_1;
        forestValue557_302_2 = spill557_18;
        break forest_join_302;
    }
case 0:
{
        forestValue557_314_0 = forestValue557_159_0;
        forestValue557_314_1 = forestValue557_159_1;
        forestValue557_314_2 = spill557_18;
        break forest_join_314;
    }
}
    }
    (forestValue557_302_0)[forestValue557_302_1] = forestValue557_302_2;
    if (!((life2_77 >= life5_75))) {
        continue forest_cycle_78;
    }
    life5_75 = ((java.lang.String)((life4_73 = "³8W\001Ï¬[ß2AA¬Æ"))).length();
    life2_77 = 0;
    break forest_join_319;
    }
    (forestValue557_314_0)[forestValue557_314_1] = forestValue557_314_2;
    if (!((life2_77 >= life5_75))) {
        break forest_join_319;
    }
    break forest_join_401;
    }
    spill557_20 = life4_73;
    spill557_21 = life2_77;
    life2_77 += 8;
    life7_327 = ((java.lang.String)(((java.lang.String)(spill557_20)).substring(((int)(spill557_21)), ((int)(life2_77))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill557_22 = life6_68;
    spill557_23 = (life3_70++);
    spill557_24 = (((((((((((long) (life7_327)[0]) & 255L) << 56) | ((((long) (life7_327)[1]) & 255L) << 48)) | ((((long) (life7_327)[2]) & 255L) << 40)) | ((((long) (life7_327)[3]) & 255L) << 32)) | ((((long) (life7_327)[4]) & 255L) << 24)) | ((((long) (life7_327)[5]) & 255L) << 16)) | ((((long) (life7_327)[6]) & 255L) << 8)) | (((long) (life7_327)[7]) & 255L));
    spill557_25 = 0;
    forestValue557_159_0 = spill557_22;
    forestValue557_159_1 = spill557_23;
    forestValue557_159_2 = spill557_24;
    forestValue557_159_3 = spill557_25;
    continue forest_cycle_159;
    }
    }
    }
    w = ((long[])(life6_68));
    x = ((java.lang.Integer[])(new java.lang.Integer[9]));
    a = ((net.minecraft.creativetab.CreativeTabs[])(new net.minecraft.creativetab.CreativeTabs[__sourceIntrinsic_eb8803ad1f63_invokedynamic557_36(2392, (357348374049505802L ^ life11_11))]));
    b = ((net.minecraft.creativetab.CreativeTabs)(new moom.q2(0, "buildingBlocks")));
    c = ((net.minecraft.creativetab.CreativeTabs)(new net.minecraft.creativetab.CreativeTabs$5(1, "decorations")));
    d = ((net.minecraft.creativetab.CreativeTabs)(new moom.q7(2, "redstone")));
    e = ((net.minecraft.creativetab.CreativeTabs)(new moom.q8(3, "transportation")));
    spill557_26 = new moom.q9(4, "misc");
    net.minecraft.enchantment.EnumEnchantmentType[] __stackOp557_42_0 = new net.minecraft.enchantment.EnumEnchantmentType[1];
    spill557_27 = __stackOp557_42_0;
    (__stackOp557_42_0)[0] = net.minecraft.enchantment.EnumEnchantmentType.ALL;
    f = ((net.minecraft.creativetab.CreativeTabs)(((moom.q9)(spill557_26)).a(((net.minecraft.enchantment.EnumEnchantmentType[])(spill557_27)))));
    g = ((net.minecraft.creativetab.CreativeTabs)(((moom.q_)(new moom.q_(5, "search"))).a(((java.lang.String)("item_search.png")))));
    h = ((net.minecraft.creativetab.CreativeTabs)(new moom.ra(__sourceIntrinsic_eb8803ad1f63_invokedynamic557_48(724, (1731528356492528000L ^ life11_11)), "food")));
    spill557_28 = new moom.rb(__sourceIntrinsic_eb8803ad1f63_invokedynamic557_50(19821, (3275643171761817146L ^ life11_11)), "tools");
    net.minecraft.enchantment.EnumEnchantmentType[] __stackOp557_51_0 = new net.minecraft.enchantment.EnumEnchantmentType[3];
    spill557_29 = __stackOp557_51_0;
    (__stackOp557_51_0)[0] = net.minecraft.enchantment.EnumEnchantmentType.DIGGER;
    net.minecraft.enchantment.EnumEnchantmentType[] __stackOp557_53_0 = spill557_29;
    spill557_30 = __stackOp557_53_0;
    (__stackOp557_53_0)[1] = net.minecraft.enchantment.EnumEnchantmentType.FISHING_ROD;
    net.minecraft.enchantment.EnumEnchantmentType[] __stackOp557_55_0 = spill557_30;
    spill557_31 = __stackOp557_55_0;
    (__stackOp557_55_0)[2] = net.minecraft.enchantment.EnumEnchantmentType.BREAKABLE;
    i = ((net.minecraft.creativetab.CreativeTabs)(((moom.rb)(spill557_28)).a(((net.minecraft.enchantment.EnumEnchantmentType[])(spill557_31)))));
    spill557_32 = new moom.rc(__sourceIntrinsic_eb8803ad1f63_invokedynamic557_59(17633, (3609625641484521392L ^ life11_11)), "combat");
    net.minecraft.enchantment.EnumEnchantmentType[] __stackOp557_61_0 = new net.minecraft.enchantment.EnumEnchantmentType[__sourceIntrinsic_eb8803ad1f63_invokedynamic557_60(32051, (1108284999264581221L ^ life11_11))];
    spill557_33 = __stackOp557_61_0;
    (__stackOp557_61_0)[0] = net.minecraft.enchantment.EnumEnchantmentType.ARMOR;
    net.minecraft.enchantment.EnumEnchantmentType[] __stackOp557_63_0 = spill557_33;
    spill557_34 = __stackOp557_63_0;
    (__stackOp557_63_0)[1] = net.minecraft.enchantment.EnumEnchantmentType.ARMOR_FEET;
    net.minecraft.enchantment.EnumEnchantmentType[] __stackOp557_65_0 = spill557_34;
    spill557_35 = __stackOp557_65_0;
    (__stackOp557_65_0)[2] = net.minecraft.enchantment.EnumEnchantmentType.ARMOR_HEAD;
    net.minecraft.enchantment.EnumEnchantmentType[] __stackOp557_67_0 = spill557_35;
    spill557_36 = __stackOp557_67_0;
    (__stackOp557_67_0)[3] = net.minecraft.enchantment.EnumEnchantmentType.ARMOR_LEGS;
    net.minecraft.enchantment.EnumEnchantmentType[] __stackOp557_69_0 = spill557_36;
    spill557_37 = __stackOp557_69_0;
    (__stackOp557_69_0)[4] = net.minecraft.enchantment.EnumEnchantmentType.ARMOR_TORSO;
    net.minecraft.enchantment.EnumEnchantmentType[] __stackOp557_71_0 = spill557_37;
    spill557_38 = __stackOp557_71_0;
    (__stackOp557_71_0)[5] = net.minecraft.enchantment.EnumEnchantmentType.BOW;
    net.minecraft.enchantment.EnumEnchantmentType[] __stackOp557_73_0 = spill557_38;
    spill557_39 = __stackOp557_73_0;
    (__stackOp557_73_0)[__sourceIntrinsic_eb8803ad1f63_invokedynamic557_74(4397, (7807772425716947581L ^ life11_11))] = net.minecraft.enchantment.EnumEnchantmentType.WEAPON;
    j = ((net.minecraft.creativetab.CreativeTabs)(((moom.rc)(spill557_32)).a(((net.minecraft.enchantment.EnumEnchantmentType[])(spill557_39)))));
    k = ((net.minecraft.creativetab.CreativeTabs)(new moom.q3(__sourceIntrinsic_eb8803ad1f63_invokedynamic557_78(163, (3305755865994677238L ^ life11_11)), "brewing")));
    l = ((net.minecraft.creativetab.CreativeTabs)(new moom.q4(__sourceIntrinsic_eb8803ad1f63_invokedynamic557_80(5033, (3765352446935357686L ^ life11_11)), "materials")));
    m = ((net.minecraft.creativetab.CreativeTabs)(((net.minecraft.creativetab.CreativeTabs)(((net.minecraft.creativetab.CreativeTabs)(((moom.q5)(new moom.q5(__sourceIntrinsic_eb8803ad1f63_invokedynamic557_82(11977, (8202130816204334490L ^ life11_11)), "inventory"))).a(((java.lang.String)("inventory.png"))))).b__q1())).a__q1()));
}


public net.minecraft.creativetab.CreativeTabs b__q1() {
this.q = ((boolean)(false));
    return this;
}


public boolean b__Boolean() {
return ((((this.q) ? 1 : 0)) != 0);
}


public int b() {
return 0;
}


public java.lang.String b__String() {
return __sourceIntrinsic_d1398b4921c0_originalDynamicSite1860_1(((net.minecraft.creativetab.CreativeTabs)(this)).a__String());
}


public static void b(boolean p0) {
u = ((boolean)(p0));
    return;
}


public static boolean e() {
int local0 = __sourceIntrinsic_booleanToInteger(net.minecraft.creativetab.CreativeTabs.d());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


public boolean c__Boolean() {
int forwardValue4883_17_0;
    int forwardValue4883_19_0;
    int spill4883_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (net.minecraft.creativetab.CreativeTabs.v ^ 45487506476025L);
    life3_5 = net.minecraft.util.DamageSource.b__Arrayr3();
    spill4883_0 = this.n;
    if (!((life3_5 != null))) {
        forwardValue4883_17_0 = spill4883_0;
        break forward_join_17;
    }
    if (!((spill4883_0 < __sourceIntrinsic_4c21d9cede27_invokedynamic4883_3(4397, (7807734310256190817L ^ life1_3))))) {
        break forward_join_18;
    }
    forwardValue4883_17_0 = 1;
    }
    forwardValue4883_19_0 = forwardValue4883_17_0;
    break forward_join_19;
    }
    forwardValue4883_19_0 = 0;
    }
    return ((forwardValue4883_19_0) != 0);
}


public int c() {
long local1 = (net.minecraft.creativetab.CreativeTabs.v ^ 65128825694835L);
    return (this.n % __sourceIntrinsic_94b06fabf08c_originalDynamicSite1861_2(4397, (7807753676295783659L ^ local1)));
}


public java.lang.String c__String() {
return this.p;
}


public static boolean d() {
return ((((net.minecraft.creativetab.CreativeTabs.u) ? 1 : 0)) != 0);
}


public int a() {
return this.n;
}


public void a(java.util.List<net.minecraft.item.ItemStack> p0, net.minecraft.enchantment.EnumEnchantmentType[] p1) {
int lexicalValue1521_58_0;
    int lexicalValue1521_71_0;
    net.minecraft.entity.Entity[] spill1521_0;
    int spill1521_1;
    long life3_3;
    net.minecraft.enchantment.Enchantment[] life6_5;
    int life7_9;
    int life8_11;
    net.minecraft.entity.Entity[] life5_12;
    net.minecraft.enchantment.Enchantment life9_19;
    int life10_34;
    int life11_36;
    lexical_join_75: {
    life3_3 = (net.minecraft.creativetab.CreativeTabs.v ^ 12100707834615L);
    life6_5 = net.minecraft.enchantment.Enchantment.b;
    spill1521_0 = net.minecraft.util.DamageSource.b__Arrayr3();
    life7_9 = (life6_5).length;
    life8_11 = 0;
    life5_12 = spill1521_0;
    lexical_cycle_13: while (true) {
    lexical_join_73: {
    lexical_join_72: {
    lexical_join_71: {
    lexical_join_58: {
    lexical_join_57: {
    if (!((life8_11 < life7_9))) {
        break lexical_join_75;
    }
    life9_19 = (life6_5)[life8_11];
    if (!((life5_12 != null))) {
        break lexical_join_73;
    }
    if (!((life9_19 != null))) {
        break lexical_join_72;
    }
    if (!((((net.minecraft.enchantment.Enchantment)(life9_19)).E != null))) {
        break lexical_join_72;
    }
    life10_34 = 0;
    life11_36 = 0;
    lexical_cycle_31: while (true) {
    lexical_join_54: {
    if (!((life11_36 < (p1).length))) {
        break lexical_join_57;
    }
    spill1521_1 = life10_34;
    if (!((life5_12 != null))) {
        lexicalValue1521_58_0 = spill1521_1;
        break lexical_join_58;
    }
    if (!((life5_12 != null))) {
        lexicalValue1521_58_0 = spill1521_1;
        break lexical_join_58;
    }
    if (!((spill1521_1 == 0))) {
        break lexical_join_57;
    }
    if (!((((net.minecraft.enchantment.Enchantment)(life9_19)).E == (p1)[life11_36]))) {
        break lexical_join_54;
    }
    life10_34 = 1;
    if (!((life5_12 == null))) {
        break lexical_join_57;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[1])));
    }
    life11_36 += 1;
    if (!((life5_12 == null))) { continue lexical_cycle_31; }
    break lexical_cycle_31;
    }
    }
    lexicalValue1521_58_0 = life10_34;
    }
    if (!((life5_12 != null))) {
        lexicalValue1521_71_0 = lexicalValue1521_58_0;
        break lexical_join_71;
    }
    if (!((lexicalValue1521_58_0 != 0))) {
        break lexical_join_72;
    }
    lexicalValue1521_71_0 = ((((java.util.List)(p0)).add(((java.lang.Object)(((moom.xg)(net.minecraft.init.Items.bS)).a(((moom.D3)(new moom.D3(life9_19, ((net.minecraft.enchantment.Enchantment)(life9_19)).c())))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1521_71_0);
    }
    life8_11 += 1;
    }
    if (!((life5_12 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return;
}


public java.lang.String a__String() {
return this.o;
}


public net.minecraft.item.ItemStack a__xW() {
net.minecraft.item.ItemStack forwardValue4882_23_0;
    net.minecraft.item.ItemStack spill4882_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_23: {
    forward_join_21: {
    life1_3 = (net.minecraft.creativetab.CreativeTabs.v ^ 89088797588362L);
    life3_5 = net.minecraft.util.DamageSource.b__Arrayr3();
    spill4882_0 = this.t;
    if (!((life3_5 != null))) {
        forwardValue4882_23_0 = spill4882_0;
        break forward_join_23;
    }
    if (!((spill4882_0 == null))) {
        break forward_join_21;
    }
    this.t = ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(((net.minecraft.creativetab.CreativeTabs)(this)).a__wQ(), 1, ((net.minecraft.creativetab.CreativeTabs)(this)).b())));
    }
    forwardValue4882_23_0 = this.t;
    }
    return forwardValue4882_23_0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral11055_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/q1"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.creativetab.CreativeTabs.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 14772;
      if (x[var3] == null) {
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
         long var5 = w[var3];
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
         Object[] var9 = (Object[])y.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               y.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/q1", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         x[var3] = var15;
      }

      return x[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public abstract net.minecraft.item.Item a__wQ();

public net.minecraft.creativetab.CreativeTabs a(java.lang.String p0) {
this.p = ((java.lang.String)(p0));
    return this;
}


public boolean a__Boolean() {
return ((((this.r) ? 1 : 0)) != 0);
}


public net.minecraft.creativetab.CreativeTabs a__q1() {
this.r = ((boolean)(false));
    return this;
}


public void a(java.util.List<net.minecraft.item.ItemStack> p0) {
net.minecraft.item.Item lexicalValue1520_23_0;
    net.minecraft.item.Item lexicalValue1520_29_0;
    net.minecraft.creativetab.CreativeTabs lexicalValue1520_41_0;
    net.minecraft.entity.Entity[] spill1520_0;
    net.minecraft.item.Item spill1520_1;
    net.minecraft.creativetab.CreativeTabs spill1520_2;
    long life2_3;
    java.util.Iterator life5_7;
    net.minecraft.entity.Entity[] life4_8;
    net.minecraft.item.Item life6_15;
    lexical_join_50: {
    lexical_join_45: {
    lexical_join_41: {
    lexical_join_35: {
    life2_3 = (net.minecraft.creativetab.CreativeTabs.v ^ 43782798032189L);
    spill1520_0 = net.minecraft.util.DamageSource.b__Arrayr3();
    life5_7 = ((moom.DB)(net.minecraft.item.Item.a)).iterator();
    life4_8 = spill1520_0;
    lexical_cycle_9: while (true) {
    lexical_join_33: {
    lexical_join_29: {
    lexical_join_23: {
    if (!(((java.util.Iterator)(life5_7)).hasNext())) {
        break lexical_join_35;
    }
    life6_15 = ((net.minecraft.item.Item)(((java.util.Iterator)(life5_7)).next()));
    if (!((life4_8 != null))) {
        break lexical_join_45;
    }
    spill1520_1 = life6_15;
    if (!((life4_8 != null))) {
        lexicalValue1520_23_0 = spill1520_1;
        break lexical_join_23;
    }
    if (!((spill1520_1 != null))) {
        break lexical_join_33;
    }
    lexicalValue1520_23_0 = life6_15;
    }
    if (!((life4_8 != null))) {
        lexicalValue1520_29_0 = lexicalValue1520_23_0;
        break lexical_join_29;
    }
    if (!((((net.minecraft.item.Item)(lexicalValue1520_23_0)).a__q1() == this))) {
        break lexical_join_33;
    }
    lexicalValue1520_29_0 = life6_15;
    }
    ((net.minecraft.item.Item)(lexicalValue1520_29_0)).a(((net.minecraft.item.Item)(life6_15)), ((net.minecraft.creativetab.CreativeTabs)(this)), ((java.util.List)(p0)));
    }
    if (!((life4_8 == null))) { continue lexical_cycle_9; }
    break lexical_cycle_9;
    }
    }
    spill1520_2 = this;
    if (!((life4_8 != null))) {
        lexicalValue1520_41_0 = spill1520_2;
        break lexical_join_41;
    }
    if (!((((net.minecraft.creativetab.CreativeTabs)(spill1520_2)).a__ArrayaP() != null))) {
        break lexical_join_45;
    }
    lexicalValue1520_41_0 = this;
    }
    ((net.minecraft.creativetab.CreativeTabs)(lexicalValue1520_41_0)).a(((java.util.List)(p0)), ((net.minecraft.enchantment.EnumEnchantmentType[])(((net.minecraft.creativetab.CreativeTabs)(this)).a__ArrayaP())));
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break lexical_join_50;
    }
    net.minecraft.util.DamageSource.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[2])));
    }
    return;
}


public boolean a(net.minecraft.enchantment.EnumEnchantmentType p0) {
net.minecraft.enchantment.EnumEnchantmentType[] lexicalValue1522_13_0;
    net.minecraft.enchantment.EnumEnchantmentType[] spill1522_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    net.minecraft.enchantment.EnumEnchantmentType[] life5_19;
    int life6_22;
    int life7_24;
    net.minecraft.enchantment.EnumEnchantmentType life8_31;
    lexical_join_36: {
    lexical_join_13: {
    life2_3 = (net.minecraft.creativetab.CreativeTabs.v ^ 109427997596971L);
    life4_5 = net.minecraft.util.DamageSource.b__Arrayr3();
    spill1522_0 = this.s;
    if (!((life4_5 != null))) {
        lexicalValue1522_13_0 = spill1522_0;
        break lexical_join_13;
    }
    if (!((spill1522_0 != null))) {
        break lexical_join_36;
    }
    lexicalValue1522_13_0 = this.s;
    }
    life5_19 = lexicalValue1522_13_0;
    life6_22 = (life5_19).length;
    life7_24 = 0;
    lexical_cycle_19: while (true) {
    lexical_join_34: {
    lexical_join_33: {
    if (!((life7_24 < life6_22))) {
        break lexical_join_36;
    }
    life8_31 = (life5_19)[life7_24];
    if (!((life4_5 != null))) {
        break lexical_join_34;
    }
    if (!((life8_31 == p0))) {
        break lexical_join_33;
    }
    return ((1) != 0);
    }
    life7_24 += 1;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    return ((0) != 0);
}


public net.minecraft.creativetab.CreativeTabs a(net.minecraft.enchantment.EnumEnchantmentType[] p0) {
this.s = ((net.minecraft.enchantment.EnumEnchantmentType[])(p0));
    return this;
}


public net.minecraft.enchantment.EnumEnchantmentType[] a__ArrayaP() {
return this.s;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic557_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic557_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic557_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic557_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic557_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic557_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic557_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic557_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic557_82(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral11055_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d1398b4921c0_originalDynamicSite1860_1(java.lang.String a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_94b06fabf08c_originalDynamicSite1861_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4c21d9cede27_invokedynamic4883_3(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanToInteger(boolean value);
private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
