package net.minecraft.entity.passive;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntityHorse extends moom.sK implements net.minecraft.inventory.IInvBasic {

private static com.google.common.base.Predicate<net.minecraft.entity.Entity> cd;

private static net.minecraft.entity.ai.attributes.IAttribute ce;

private static java.lang.String[] cf;

private static java.lang.String[] cg;

private static int[] ch;

public static java.lang.String[] ci;

public static java.lang.String[] cj;

private static java.lang.String[] ck;

private static java.lang.String[] cl;

private int cm;

private int cn;

private int co;

public int cp;

public int cq;

protected boolean cr;

private moom.ws cs;

private boolean ct;

protected int cu;

protected float cv;

private boolean cw;

private float cx;

private float cy;

private float cz;

private float cA;

private float cB;

private float cC;

private int cD;

private java.lang.String cE;

private java.lang.String[] cF;

private boolean cG;

private static long jb;

private static long[] kb;

private static java.lang.Integer[] Ab;

private static java.util.Map Bb;

public EntityHorse(net.minecraft.world.World p0) { super((net.minecraft.world.World)null); }

private static void __sourceConstructorBody_45b8980b0bacf351(net.minecraft.entity.passive.EntityHorse receiver, net.minecraft.world.World p0) throws Throwable {
long local2 = (net.minecraft.entity.passive.EntityHorse.jb ^ 133002235974032L);
    net.minecraft.entity.passive.EntityHorse.__sourceConstructorInit_45b8980b0bacf351_0(((net.minecraft.entity.passive.EntityHorse)(receiver)), ((net.minecraft.world.World)(p0)));
    ((net.minecraft.entity.passive.EntityHorse)(receiver)).cF = ((java.lang.String[])(new java.lang.String[3]));
    ((net.minecraft.entity.passive.EntityHorse)(receiver)).cG = ((boolean)(false));
    ((net.minecraft.entity.passive.EntityHorse)(receiver)).a__Void(((float)(0x1.666666p0f)), ((float)(0x1.99999ap0f)));
    ((net.minecraft.entity.passive.EntityHorse)(receiver)).ak = ((boolean)(false));
    ((net.minecraft.entity.passive.EntityHorse)(receiver)).q(((boolean)(false)));
    ((moom.AW)(((moom.AW)(__sourceExactCall_69c3d1a2c98d20(((net.minecraft.entity.passive.EntityHorse)(receiver))))))).a(((boolean)(true)));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityHorse)(receiver)).bJ)).a(((int)(0)), ((moom.uc)(new moom.uQ(receiver))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityHorse)(receiver)).bJ)).a(((int)(1)), ((moom.uc)(new moom.uJ(receiver, 0x1.3333333333333p0d))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityHorse)(receiver)).bJ)).a(((int)(1)), ((moom.uc)(new moom.uO(receiver, 0x1.3333333333333p0d))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityHorse)(receiver)).bJ)).a(((int)(2)), ((moom.uc)(new moom.uz(receiver, 0x1.0p0d))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityHorse)(receiver)).bJ)).a(((int)(4)), ((moom.uc)(new moom.uv(receiver, 0x1.0p0d))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityHorse)(receiver)).bJ)).a(((int)(__sourceIntrinsic_45b8980b0bacf351_originalDynamicSite3383_21(20223, (4715850584970366433L ^ local2)))), ((moom.uc)(new moom.u6(receiver, 0x1.6666666666666p-1d))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityHorse)(receiver)).bJ)).a(((int)(__sourceIntrinsic_45b8980b0bacf351_originalDynamicSite3383_24(16424, (6707498383726314298L ^ local2)))), ((moom.uc)(new moom.u8(receiver, net.minecraft.entity.player.EntityPlayer.class, 0x1.8p2f))));
    __sourceExactCall_ae34dbea601cc3(((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityHorse)(receiver)).bJ)), ((int)(__sourceIntrinsic_45b8980b0bacf351_originalDynamicSite3383_28(25443, (6136704083506372678L ^ local2)))), ((moom.uc)(new moom.uy(receiver))));
    __sourceExactCall_9dfdb54eea9b0d(((net.minecraft.entity.passive.EntityHorse)(receiver)));
    return;
}


static {
jb = ((long)(((moom._a)(moom._c.a(((long)(-1360994090566228684L)), ((long)(-884402837120653628L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(46551905436769L)))));
    long local11_life6 = (net.minecraft.entity.passive.EntityHorse.jb ^ 19217755495981L);
    Bb = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1879_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1879_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1879_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1879_14 = new byte[8];
    (__sourceSpill1879_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1879_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1879_16 = __sourceSpill1879_14;
    ((javax.crypto.Cipher)(__sourceSpill1879_11)).init(((int)(__sourceSpill1879_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1879_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1879_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[50];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "»Éì\177\bâÌ¾¦¨\023\b>ß\006u²ÕN\024©»\0355Ù\t£ûLÔ\032!ßsÙ%·{\023:\020ø\030x·IhYÍ]èDÅ«Aä¥\000Ë\025ýKÉR°×ûÐe\017\032<d\036PDälB5¦IKc {&ÆM:\026Ö\035^ôífa>«~ÔM.ôD\000Ý·«\027¦\002H£*¶õ]à±á®6b\005!lOÁ!ûèÛD,\021\017.õ®ô×äð\035Ö2\nç>#Î\037º|;g·7±\037'p~ÀôX1°N\017qgh\032(ø¡×\0039M\n/>\177_µ$¹·zçR¨9Ú½éÏe|XÉ\f+Ì»Ùç²F\177µ\001×°Úv\020Á0ÝÇT\\R¼\007÷¼ÀApM2t×w6AgXô\035?.\002ÑôRÎég\bMäêÑd\"ÖDÞgL²\177øxlË\006*N§t5\033P@Ó2÷¡¥ìúÞ¿KÔºxdï\006y½:Gó\020W2¿ÙL·ØìÈ\tûíôø\035QAüÕ\\;¼\nøO¬tn\017l©\030\004È"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1879_25 = local4_life21;
        int __sourceSpill1879_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1879_25)).substring(((int)(__sourceSpill1879_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1879_30 = local6_life19;
        int __sourceSpill1879_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1879_33 = new byte[8];
        (__sourceSpill1879_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1879_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1879_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1879_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1879_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1879_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1879_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1879_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1879_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1879_34)).doFinal(((byte[])(__sourceSpill1879_33)));
        (__sourceSpill1879_30)[__sourceSpill1879_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = ")Q'\037ª\022I?­\026¸r,¥\030ÿ"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1879_38 = local4_life21;
        int __sourceSpill1879_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1879_38)).substring(((int)(__sourceSpill1879_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1879_43 = local6_life19;
        int __sourceSpill1879_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1879_46 = new byte[8];
        (__sourceSpill1879_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1879_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1879_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1879_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1879_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1879_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1879_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1879_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1879_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1879_47)).doFinal(((byte[])(__sourceSpill1879_46)));
        (__sourceSpill1879_43)[__sourceSpill1879_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    kb = ((long[])(local6_life19));
    Ab = ((java.lang.Integer[])(new java.lang.Integer[50]));
    cd = ((com.google.common.base.Predicate)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1879_52()));
    ce = ((net.minecraft.entity.ai.attributes.IAttribute)(((net.minecraft.entity.ai.attributes.RangedAttribute)(((net.minecraft.entity.ai.attributes.RangedAttribute)(new net.minecraft.entity.ai.attributes.RangedAttribute(null, "horse.jumpStrength", 0x1.6666666666666p-1d, 0x0.0p0d, 0x1.0p1d))).a(((java.lang.String)("Jump Strength"))))).a(((boolean)(true)))));
    java.lang.String[] __sourceSpill1879_57 = new java.lang.String[4];
    (__sourceSpill1879_57)[0] = null;
    (__sourceSpill1879_57)[1] = "textures/entity/horse/armor/horse_armor_iron.png";
    (__sourceSpill1879_57)[2] = "textures/entity/horse/armor/horse_armor_gold.png";
    (__sourceSpill1879_57)[3] = "textures/entity/horse/armor/horse_armor_diamond.png";
    cf = ((java.lang.String[])(__sourceSpill1879_57));
    java.lang.String[] __sourceSpill1879_59 = new java.lang.String[4];
    (__sourceSpill1879_59)[0] = "";
    (__sourceSpill1879_59)[1] = "meo";
    (__sourceSpill1879_59)[2] = "goo";
    (__sourceSpill1879_59)[3] = "dio";
    cg = ((java.lang.String[])(__sourceSpill1879_59));
    int[] __sourceSpill1879_61 = new int[4];
    (__sourceSpill1879_61)[0] = 0;
    (__sourceSpill1879_61)[1] = 5;
    (__sourceSpill1879_61)[2] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1879_62(18074, (2532220831178213918L ^ local11_life6));
    (__sourceSpill1879_61)[3] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1879_63(23821, (2452572653891015057L ^ local11_life6));
    ch = ((int[])(__sourceSpill1879_61));
    java.lang.String[] __sourceSpill1879_66 = new java.lang.String[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1879_65(18074, (2532220831178213918L ^ local11_life6))];
    (__sourceSpill1879_66)[0] = "textures/entity/horse/horse_white.png";
    (__sourceSpill1879_66)[1] = "textures/entity/horse/horse_creamy.png";
    (__sourceSpill1879_66)[2] = "textures/entity/horse/horse_chestnut.png";
    (__sourceSpill1879_66)[3] = "textures/entity/horse/horse_brown.png";
    (__sourceSpill1879_66)[4] = "textures/entity/horse/horse_black.png";
    (__sourceSpill1879_66)[5] = "textures/entity/horse/horse_gray.png";
    (__sourceSpill1879_66)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1879_67(572, (8880873844932578962L ^ local11_life6))] = "textures/entity/horse/horse_darkbrown.png";
    ci = ((java.lang.String[])(__sourceSpill1879_66));
    java.lang.String[] __sourceSpill1879_70 = new java.lang.String[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1879_69(18074, (2532220831178213918L ^ local11_life6))];
    (__sourceSpill1879_70)[0] = "hwh";
    (__sourceSpill1879_70)[1] = "hcr";
    (__sourceSpill1879_70)[2] = "hch";
    (__sourceSpill1879_70)[3] = "hbr";
    (__sourceSpill1879_70)[4] = "hbl";
    (__sourceSpill1879_70)[5] = "hgr";
    (__sourceSpill1879_70)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1879_71(572, (8880873844932578962L ^ local11_life6))] = "hdb";
    cj = ((java.lang.String[])(__sourceSpill1879_70));
    java.lang.String[] __sourceSpill1879_73 = new java.lang.String[5];
    (__sourceSpill1879_73)[0] = null;
    (__sourceSpill1879_73)[1] = "textures/entity/horse/horse_markings_white.png";
    (__sourceSpill1879_73)[2] = "textures/entity/horse/horse_markings_whitefield.png";
    (__sourceSpill1879_73)[3] = "textures/entity/horse/horse_markings_whitedots.png";
    (__sourceSpill1879_73)[4] = "textures/entity/horse/horse_markings_blackdots.png";
    ck = ((java.lang.String[])(__sourceSpill1879_73));
    java.lang.String[] __sourceSpill1879_75 = new java.lang.String[5];
    (__sourceSpill1879_75)[0] = "";
    (__sourceSpill1879_75)[1] = "wo_";
    (__sourceSpill1879_75)[2] = "wmo";
    (__sourceSpill1879_75)[3] = "wdo";
    (__sourceSpill1879_75)[4] = "bdo";
    cl = ((java.lang.String[])(__sourceSpill1879_75));
}

private static native <E extends Throwable> void __sourceConstructorInit_45b8980b0bacf351_0(net.minecraft.entity.passive.EntityHorse a0, net.minecraft.world.World a1) throws E;

public boolean I__Boolean() {
return ((0) != 0);
}


protected boolean J__Boolean() {
net.minecraft.entity.passive.EntityHorse forwardValue5236_17_0;
    int forwardValue5236_27_0;
    int forwardValue5236_29_0;
    net.minecraft.entity.passive.EntityHorse spill5236_0;
    boolean spill5236_1;
    boolean spill5236_2;
    boolean spill5236_3;
    long life1_3;
    int life3_5;
    forward_join_29: {
    forward_join_28: {
    forward_join_27: {
    forward_join_26: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 22730267365775L);
    life3_5 = moom.vR.b();
    spill5236_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue5236_17_0 = spill5236_0;
        break forward_join_17;
    }
    if (!((((net.minecraft.entity.passive.EntityHorse)(spill5236_0)).f != null))) {
        break forward_join_16;
    }
    spill5236_1 = ((net.minecraft.entity.passive.EntityHorse)(this)).ao();
    if (!((life3_5 != 0))) {
        forwardValue5236_27_0 = ((spill5236_1) ? 1 : 0);
        break forward_join_27;
    }
    if (!((!spill5236_1))) {
        break forward_join_26;
    }
    }
    forwardValue5236_17_0 = this;
    }
    spill5236_2 = ((net.minecraft.entity.passive.EntityHorse)(forwardValue5236_17_0)).aj__Boolean();
    if (!((life3_5 != 0))) {
        forwardValue5236_27_0 = ((spill5236_2) ? 1 : 0);
        break forward_join_27;
    }
    if (!((!spill5236_2))) {
        break forward_join_26;
    }
    spill5236_3 = ((net.minecraft.entity.passive.EntityHorse)(this)).ak();
    if (!((life3_5 != 0))) {
        forwardValue5236_27_0 = ((spill5236_3) ? 1 : 0);
        break forward_join_27;
    }
    if (!(spill5236_3)) {
        break forward_join_28;
    }
    }
    forwardValue5236_27_0 = 1;
    }
    forwardValue5236_29_0 = forwardValue5236_27_0;
    break forward_join_29;
    }
    forwardValue5236_29_0 = 0;
    }
    return ((forwardValue5236_29_0) != 0);
}


public boolean S__Boolean() {
int forwardValue5237_13_0;
    int forwardValue5237_17_0;
    int forwardValue5237_19_0;
    boolean spill5237_0;
    long life1_3;
    int life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 55645807548371L);
    life3_5 = moom.vR.b();
    spill5237_0 = ((net.minecraft.entity.passive.EntityHorse)(this)).at();
    if (!((life3_5 != 0))) {
        forwardValue5237_13_0 = ((spill5237_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!((!spill5237_0))) {
        break forward_join_18;
    }
    forwardValue5237_13_0 = ((super.S__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue5237_17_0 = forwardValue5237_13_0;
        break forward_join_17;
    }
    if (!((forwardValue5237_13_0 != 0))) {
        break forward_join_18;
    }
    forwardValue5237_17_0 = 1;
    }
    forwardValue5237_19_0 = forwardValue5237_17_0;
    break forward_join_19;
    }
    forwardValue5237_19_0 = 0;
    }
    return ((forwardValue5237_19_0) != 0);
}


public void Z__sourceReturn_da8c82d5d4() {
int forwardValue5238_16_0;
    net.minecraft.entity.passive.EntityHorse forwardValue5238_24_0;
    boolean spill5238_0;
    net.minecraft.entity.passive.EntityHorse spill5238_1;
    long life1_3;
    int life3_5;
    forward_join_26: {
    forward_join_24: {
    forward_join_16: {
    life1_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 130025716578883L);
    life3_5 = moom.vR.c();
    spill5238_0 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life3_5 == 0))) {
        forwardValue5238_16_0 = ((spill5238_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!((!spill5238_0))) {
        break forward_join_26;
    }
    spill5238_1 = this;
    if (!((life3_5 == 0))) {
        forwardValue5238_24_0 = spill5238_1;
        break forward_join_24;
    }
    forwardValue5238_16_0 = ((((net.minecraft.entity.passive.EntityHorse)(spill5238_1)).ai__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue5238_16_0 != 0))) {
        break forward_join_26;
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).a(((net.minecraft.item.Item)(__sourceExactCall_42e37b9acc15b0(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ae))))), ((int)(1)));
    forwardValue5238_24_0 = this;
    }
    ((net.minecraft.entity.passive.EntityHorse)(forwardValue5238_24_0)).q(((boolean)(false)));
    }
    return;
}


protected void i(float p0) {
int forwardValue5279_16_0;
    net.minecraft.entity.passive.EntityHorse forwardValue5279_18_0;
    int spill5279_0;
    net.minecraft.entity.passive.EntityHorse spill5279_1;
    long life2_3;
    int life4_5;
    forward_join_20: {
    forward_join_18: {
    forward_join_16: {
    life2_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 11983617724829L);
    life4_5 = moom.vR.c();
    spill5279_0 = recovery.source.CarrierOps.fcmpl(((float)(p0)), ((float)(0x1.8p2f)));
    if (!((life4_5 == 0))) {
        forwardValue5279_16_0 = spill5279_0;
        break forward_join_16;
    }
    if (!((spill5279_0 > 0))) {
        break forward_join_20;
    }
    spill5279_1 = this;
    if (!((life4_5 == 0))) {
        forwardValue5279_18_0 = spill5279_1;
        break forward_join_18;
    }
    forwardValue5279_16_0 = ((((net.minecraft.entity.passive.EntityHorse)(spill5279_1)).aj__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue5279_16_0 != 0))) {
        break forward_join_20;
    }
    forwardValue5279_18_0 = this;
    }
    ((net.minecraft.entity.passive.EntityHorse)(forwardValue5279_18_0)).t(((boolean)(false)));
    }
    return;
}


protected java.lang.String i__String() {
int forwardValue5280_28_0;
    int forwardValue5280_38_0;
    int forwardValue5280_38_1;
    int forwardValue5280_45_0;
    int forwardValue5280_45_1;
    int forwardValue5280_50_0;
    int forwardValue5280_50_1;
    java.lang.String forwardValue5280_54_0;
    int spill5280_0;
    int spill5280_1;
    boolean spill5280_2;
    int spill5280_3;
    int spill5280_4;
    long life1_3;
    int life3_7;
    int life4_40;
    forward_join_54: {
    forward_join_53: {
    forward_join_50: {
    forward_join_45: {
    forward_join_43: {
    forward_join_38: {
    forward_join_36: {
    forward_join_28: {
    forward_join_26: {
    life1_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 118702855182671L);
    spill5280_0 = moom.vR.b();
    ((net.minecraft.entity.passive.EntityHorse)(this)).ag();
    life3_7 = spill5280_0;
    spill5280_1 = ((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_fc475de8b950_invokedynamic5280_4(806, (1433267377766336705L ^ life1_3)))));
    if (!((life3_7 != 0))) {
        forwardValue5280_28_0 = spill5280_1;
        break forward_join_28;
    }
    if (!((spill5280_1 == 0))) {
        break forward_join_26;
    }
    spill5280_2 = ((net.minecraft.entity.passive.EntityHorse)(this)).J__Boolean();
    if (!((life3_7 != 0))) {
        forwardValue5280_28_0 = ((spill5280_2) ? 1 : 0);
        break forward_join_28;
    }
    if (!((!spill5280_2))) {
        break forward_join_26;
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).ah();
    }
    forwardValue5280_28_0 = ((net.minecraft.entity.passive.EntityHorse)(this)).t();
    }
    life4_40 = forwardValue5280_28_0;
    spill5280_3 = life4_40;
    spill5280_4 = 3;
    if (!((life3_7 != 0))) {
        forwardValue5280_38_0 = spill5280_3;
        forwardValue5280_38_1 = spill5280_4;
        break forward_join_38;
    }
    if (!((spill5280_3 == spill5280_4))) {
        break forward_join_36;
    }
    forwardValue5280_54_0 = "mob.horse.zombie.idle";
    break forward_join_54;
    }
    forwardValue5280_38_0 = life4_40;
    forwardValue5280_38_1 = 4;
    }
    if (!((life3_7 != 0))) {
        forwardValue5280_45_0 = forwardValue5280_38_0;
        forwardValue5280_45_1 = forwardValue5280_38_1;
        break forward_join_45;
    }
    if (!((forwardValue5280_38_0 == forwardValue5280_38_1))) {
        break forward_join_43;
    }
    forwardValue5280_54_0 = "mob.horse.skeleton.idle";
    break forward_join_54;
    }
    forwardValue5280_45_0 = life4_40;
    forwardValue5280_45_1 = 1;
    }
    if (!((life3_7 != 0))) {
        forwardValue5280_50_0 = forwardValue5280_45_0;
        forwardValue5280_50_1 = forwardValue5280_45_1;
        break forward_join_50;
    }
    if (!((forwardValue5280_45_0 != forwardValue5280_45_1))) {
        break forward_join_53;
    }
    forwardValue5280_50_0 = life4_40;
    forwardValue5280_50_1 = 2;
    }
    if (!((forwardValue5280_50_0 != forwardValue5280_50_1))) {
        break forward_join_53;
    }
    forwardValue5280_54_0 = "mob.horse.idle";
    break forward_join_54;
    }
    forwardValue5280_54_0 = "mob.horse.donkey.idle";
    }
    return forwardValue5280_54_0;
}


public boolean b__Boolean(net.minecraft.item.ItemStack p0) {
return ((0) != 0);
}


public int b__sourceReturn_0f7a48eca2(int p0) {
int local2 = moom.Dr.a(((int)((((net.minecraft.entity.passive.EntityHorse)(this)).w__sourceReturn_8abf5c6871() + p0))), ((int)(0)), ((int)(((net.minecraft.entity.passive.EntityHorse)(this)).y__sourceReturn_8abf5c6871())));
    ((net.minecraft.entity.passive.EntityHorse)(this)).p(((int)(local2)));
    return local2;
}


public void b(java.lang.String p0) {
long local2 = (net.minecraft.entity.passive.EntityHorse.jb ^ 32853887431599L);
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_d1c1922d1ba0_originalDynamicSite1962_2(27081, (6519037482181986522L ^ local2)))), ((java.lang.Object)(p0)));
    return;
}


private int b__sourceReturn_9e303eb146(net.minecraft.item.ItemStack p0) {
net.minecraft.item.ItemStack forwardValue5268_13_0;
    net.minecraft.item.Item forwardValue5268_24_0;
    net.minecraft.item.Item forwardValue5268_24_1;
    net.minecraft.item.Item forwardValue5268_31_0;
    net.minecraft.item.Item forwardValue5268_31_1;
    int forwardValue5268_35_0;
    net.minecraft.item.ItemStack spill5268_0;
    net.minecraft.item.Item spill5268_1;
    net.minecraft.item.Item spill5268_2;
    long life2_3;
    int life4_5;
    net.minecraft.item.Item life5_19;
    forward_join_35: {
    forward_join_34: {
    forward_join_31: {
    forward_join_29: {
    forward_join_24: {
    forward_join_22: {
    forward_join_13: {
    forward_join_12: {
    life2_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 124916015891696L);
    life4_5 = moom.vR.b();
    spill5268_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue5268_13_0 = spill5268_0;
        break forward_join_13;
    }
    if (!((spill5268_0 == null))) {
        break forward_join_12;
    }
    return 0;
    }
    forwardValue5268_13_0 = p0;
    }
    life5_19 = ((net.minecraft.item.ItemStack)(forwardValue5268_13_0)).a__wQ();
    spill5268_1 = life5_19;
    spill5268_2 = net.minecraft.init.Items.bZ;
    if (!((life4_5 != 0))) {
        forwardValue5268_24_0 = spill5268_1;
        forwardValue5268_24_1 = spill5268_2;
        break forward_join_24;
    }
    if (!((spill5268_1 == spill5268_2))) {
        break forward_join_22;
    }
    forwardValue5268_35_0 = 1;
    break forward_join_35;
    }
    forwardValue5268_24_0 = life5_19;
    forwardValue5268_24_1 = net.minecraft.init.Items.b0;
    }
    if (!((life4_5 != 0))) {
        forwardValue5268_31_0 = forwardValue5268_24_0;
        forwardValue5268_31_1 = forwardValue5268_24_1;
        break forward_join_31;
    }
    if (!((forwardValue5268_24_0 == forwardValue5268_24_1))) {
        break forward_join_29;
    }
    forwardValue5268_35_0 = 2;
    break forward_join_35;
    }
    forwardValue5268_31_0 = life5_19;
    forwardValue5268_31_1 = net.minecraft.init.Items.b1;
    }
    if (!((forwardValue5268_31_0 == forwardValue5268_31_1))) {
        break forward_join_34;
    }
    forwardValue5268_35_0 = 3;
    break forward_join_35;
    }
    forwardValue5268_35_0 = 0;
    }
    return forwardValue5268_35_0;
}


public void b(net.minecraft.entity.player.EntityPlayer p0) {
net.minecraft.entity.Entity forwardValue5267_16_0;
    net.minecraft.entity.passive.EntityHorse forwardValue5267_24_0;
    net.minecraft.entity.passive.EntityHorse forwardValue5267_29_0;
    net.minecraft.entity.passive.EntityHorse spill5267_0;
    net.minecraft.entity.passive.EntityHorse spill5267_1;
    net.minecraft.entity.passive.EntityHorse spill5267_2;
    long life2_3;
    int life4_5;
    forward_join_38: {
    forward_join_29: {
    forward_join_24: {
    forward_join_23: {
    forward_join_16: {
    life2_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 121774924760201L);
    life4_5 = moom.vR.b();
    spill5267_0 = this;
    if (!((life4_5 != 0))) {
        forwardValue5267_16_0 = spill5267_0;
        break forward_join_16;
    }
    if (!((!((net.minecraft.world.World)(((net.minecraft.entity.passive.EntityHorse)(spill5267_0)).i)).G))) {
        break forward_join_38;
    }
    spill5267_1 = this;
    if (!((life4_5 != 0))) {
        forwardValue5267_24_0 = spill5267_1;
        break forward_join_24;
    }
    forwardValue5267_16_0 = ((net.minecraft.entity.passive.EntityHorse)(spill5267_1)).f;
    }
    if (!((forwardValue5267_16_0 != null))) {
        break forward_join_23;
    }
    spill5267_2 = this;
    if (!((life4_5 != 0))) {
        forwardValue5267_24_0 = spill5267_2;
        break forward_join_24;
    }
    if (!((((net.minecraft.entity.passive.EntityHorse)(spill5267_2)).f == p0))) {
        break forward_join_38;
    }
    }
    forwardValue5267_24_0 = this;
    }
    if (!((life4_5 != 0))) {
        forwardValue5267_29_0 = forwardValue5267_24_0;
        break forward_join_29;
    }
    if (!(((net.minecraft.entity.passive.EntityHorse)(forwardValue5267_24_0)).af__Boolean())) {
        break forward_join_38;
    }
    forwardValue5267_29_0 = this;
    }
    ((moom.ws)(((net.minecraft.entity.passive.EntityHorse)(forwardValue5267_29_0)).cs)).a(((java.lang.String)(((net.minecraft.entity.passive.EntityHorse)(this)).a__String())));
    ((net.minecraft.entity.player.EntityPlayer)(p0)).a(((net.minecraft.entity.passive.EntityHorse)(this)), ((net.minecraft.inventory.IInventory)(this.cs)));
    }
    return;
}


private double b__sourceReturn_fedcb3e4d3() {
return (((0x1.99999ap-2d + (((java.util.Random)(this.ah)).nextDouble() * 0x1.999999999999ap-3d)) + (((java.util.Random)(this.ah)).nextDouble() * 0x1.999999999999ap-3d)) + (((java.util.Random)(this.ah)).nextDouble() * 0x1.999999999999ap-3d));
}


public boolean b__Boolean(int p0, net.minecraft.item.ItemStack p1) {
int forwardValue5269_35_0;
    net.minecraft.item.ItemStack forwardValue5269_37_0;
    net.minecraft.item.ItemStack forwardValue5269_41_0;
    int forwardValue5269_63_0;
    int forwardValue5269_63_1;
    int forwardValue5269_64_0;
    net.minecraft.item.ItemStack forwardValue5269_90_0;
    int forwardValue5269_96_0;
    net.minecraft.item.ItemStack forwardValue5269_105_0;
    int forwardValue5269_123_0;
    int forwardValue5269_125_0;
    int forwardValue5269_134_0;
    int forwardValue5269_134_1;
    int forwardValue5269_135_0;
    int forwardValue5269_156_0;
    int spill5269_0;
    int spill5269_1;
    boolean spill5269_2;
    net.minecraft.item.ItemStack spill5269_3;
    boolean spill5269_4;
    boolean spill5269_5;
    int spill5269_6;
    int spill5269_7;
    int spill5269_8;
    int spill5269_9;
    int spill5269_10;
    int spill5269_11;
    net.minecraft.item.ItemStack spill5269_12;
    net.minecraft.item.ItemStack spill5269_13;
    boolean spill5269_14;
    boolean spill5269_15;
    int spill5269_16;
    int spill5269_17;
    long life3_3;
    int life5_5;
    int life6_99;
    int life7_220;
    forward_join_156: {
    forward_join_155: {
    forward_join_135: {
    forward_join_134: {
    forward_join_126: {
    forward_join_125: {
    forward_join_124: {
    forward_join_123: {
    forward_join_115: {
    forward_join_110: {
    forward_join_105: {
    forward_join_96: {
    forward_join_95: {
    forward_join_90: {
    forward_join_64: {
    forward_join_63: {
    forward_join_57: {
    forward_join_41: {
    forward_join_37: {
    forward_join_36: {
    forward_join_35: {
    life3_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 64504021028249L);
    life5_5 = moom.vR.c();
    spill5269_0 = p0;
    spill5269_1 = __sourceIntrinsic_7722627b66bb_invokedynamic5269_2(19059, (1982680641847235909L ^ life3_3));
    if (!((life5_5 == 0))) {
        forwardValue5269_63_0 = spill5269_0;
        forwardValue5269_63_1 = spill5269_1;
        break forward_join_63;
    }
    if (!((spill5269_0 == spill5269_1))) {
        break forward_join_57;
    }
    spill5269_2 = ((net.minecraft.entity.passive.EntityHorse)(this)).as();
    if (!((life5_5 == 0))) {
        forwardValue5269_64_0 = ((spill5269_2) ? 1 : 0);
        break forward_join_64;
    }
    if (!(spill5269_2)) {
        break forward_join_57;
    }
    spill5269_3 = p1;
    if (!((life5_5 == 0))) {
        forwardValue5269_37_0 = spill5269_3;
        break forward_join_37;
    }
    if (!((spill5269_3 == null))) {
        break forward_join_36;
    }
    spill5269_4 = ((net.minecraft.entity.passive.EntityHorse)(this)).ai__Boolean();
    if (!((life5_5 == 0))) {
        forwardValue5269_35_0 = ((spill5269_4) ? 1 : 0);
        break forward_join_35;
    }
    if (!(spill5269_4)) {
        break forward_join_36;
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).q(((boolean)(false)));
    ((net.minecraft.entity.passive.EntityHorse)(this)).ab__sourceReturn_da8c82d5d4();
    forwardValue5269_35_0 = 1;
    }
    return ((forwardValue5269_35_0) != 0);
    }
    forwardValue5269_37_0 = p1;
    }
    if (!((life5_5 == 0))) {
        forwardValue5269_41_0 = forwardValue5269_37_0;
        break forward_join_41;
    }
    if (!((forwardValue5269_37_0 != null))) {
        break forward_join_57;
    }
    forwardValue5269_41_0 = p1;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue5269_41_0)).a__wQ() == __sourceExactCall_42e37b9acc15b0(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ae)))))) {
        break forward_join_57;
    }
    spill5269_5 = ((net.minecraft.entity.passive.EntityHorse)(this)).ai__Boolean();
    if (!((life5_5 == 0))) {
        forwardValue5269_64_0 = ((spill5269_5) ? 1 : 0);
        break forward_join_64;
    }
    if (!((!spill5269_5))) {
        break forward_join_57;
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).q(((boolean)(true)));
    ((net.minecraft.entity.passive.EntityHorse)(this)).ab__sourceReturn_da8c82d5d4();
    return ((1) != 0);
    }
    forwardValue5269_63_0 = p0;
    forwardValue5269_63_1 = __sourceIntrinsic_7722627b66bb_invokedynamic5269_18(19477, (6120168607889494808L ^ life3_3));
    }
    forwardValue5269_64_0 = (forwardValue5269_63_0 - forwardValue5269_63_1);
    }
    life6_99 = forwardValue5269_64_0;
    spill5269_6 = life6_99;
    if (!((life5_5 == 0))) {
        forwardValue5269_135_0 = spill5269_6;
        break forward_join_135;
    }
    if (!((spill5269_6 >= 0))) {
        break forward_join_126;
    }
    spill5269_7 = life6_99;
    spill5269_8 = 2;
    if (!((life5_5 == 0))) {
        forwardValue5269_134_0 = spill5269_7;
        forwardValue5269_134_1 = spill5269_8;
        break forward_join_134;
    }
    if (!((spill5269_7 < spill5269_8))) {
        break forward_join_126;
    }
    spill5269_9 = life6_99;
    spill5269_10 = ((moom.ws)(this.cs)).b__Int();
    if (!((life5_5 == 0))) {
        forwardValue5269_134_0 = spill5269_9;
        forwardValue5269_134_1 = spill5269_10;
        break forward_join_134;
    }
    if (!((spill5269_9 < spill5269_10))) {
        break forward_join_126;
    }
    spill5269_11 = life6_99;
    if (!((life5_5 == 0))) {
        forwardValue5269_96_0 = spill5269_11;
        break forward_join_96;
    }
    if (!((spill5269_11 == 0))) {
        break forward_join_95;
    }
    spill5269_12 = p1;
    if (!((life5_5 == 0))) {
        forwardValue5269_90_0 = spill5269_12;
        break forward_join_90;
    }
    if (!((spill5269_12 != null))) {
        break forward_join_95;
    }
    forwardValue5269_90_0 = p1;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue5269_90_0)).a__wQ() != net.minecraft.init.Items.aA))) {
        break forward_join_95;
    }
    return ((0) != 0);
    }
    forwardValue5269_96_0 = life6_99;
    }
    if (!((life5_5 == 0))) {
        forwardValue5269_123_0 = forwardValue5269_96_0;
        break forward_join_123;
    }
    if (!((forwardValue5269_96_0 == 1))) {
        break forward_join_115;
    }
    spill5269_13 = p1;
    if (!((life5_5 == 0))) {
        forwardValue5269_105_0 = spill5269_13;
        break forward_join_105;
    }
    if (!((spill5269_13 != null))) {
        break forward_join_110;
    }
    forwardValue5269_105_0 = p1;
    }
    spill5269_14 = __sourceExactCall_28cca1ad76a52a(((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(forwardValue5269_105_0)).a__wQ())));
    if (!((life5_5 == 0))) {
        forwardValue5269_125_0 = ((spill5269_14) ? 1 : 0);
        break forward_join_125;
    }
    if (!(spill5269_14)) {
        break forward_join_124;
    }
    }
    spill5269_15 = ((net.minecraft.entity.passive.EntityHorse)(this)).ar();
    if (!((life5_5 == 0))) {
        forwardValue5269_125_0 = ((spill5269_15) ? 1 : 0);
        break forward_join_125;
    }
    if (!(spill5269_15)) {
        break forward_join_124;
    }
    }
    ((moom.ws)(this.cs)).a__Void(((int)(life6_99)), ((net.minecraft.item.ItemStack)(p1)));
    ((net.minecraft.entity.passive.EntityHorse)(this)).ac__sourceReturn_da8c82d5d4();
    forwardValue5269_123_0 = 1;
    }
    return ((forwardValue5269_123_0) != 0);
    }
    forwardValue5269_125_0 = 0;
    }
    return ((forwardValue5269_125_0) != 0);
    }
    forwardValue5269_134_0 = (p0 - __sourceIntrinsic_7722627b66bb_invokedynamic5269_34(13882, (6513769782107728130L ^ life3_3)));
    forwardValue5269_134_1 = 2;
    }
    forwardValue5269_135_0 = (forwardValue5269_134_0 + forwardValue5269_134_1);
    }
    life7_220 = forwardValue5269_135_0;
    spill5269_16 = life7_220;
    if (!((life5_5 == 0))) {
        forwardValue5269_156_0 = spill5269_16;
        break forward_join_156;
    }
    if (!((spill5269_16 >= 2))) {
        break forward_join_155;
    }
    spill5269_17 = life7_220;
    if (!((life5_5 == 0))) {
        forwardValue5269_156_0 = spill5269_17;
        break forward_join_156;
    }
    if (!((spill5269_17 < ((moom.ws)(this.cs)).b__Int()))) {
        break forward_join_155;
    }
    ((moom.ws)(this.cs)).a__Void(((int)(life7_220)), ((net.minecraft.item.ItemStack)(p1)));
    return ((1) != 0);
    }
    forwardValue5269_156_0 = 0;
    }
    return ((forwardValue5269_156_0) != 0);
}


public java.lang.String b__String() {
long local1 = (net.minecraft.entity.passive.EntityHorse.jb ^ 122851109710149L);
    return ((net.minecraft.entity.DataWatcher)(this.al)).a__String(((int)(__sourceIntrinsic_d1398b4921c0_originalDynamicSite1963_2(27081, (6519018005100302896L ^ local1)))));
}


private void ad__sourceReturn_da8c82d5d4() {
this.cE = ((java.lang.String)(null));
    return;
}


public float e__Float() {
return this.H;
}


public void e(boolean p0) {
long local2 = (net.minecraft.entity.passive.EntityHorse.jb ^ 119404123637542L);
    ((net.minecraft.entity.passive.EntityHorse)(this)).c(((int)(__sourceIntrinsic_b6d2aa37fd7d_originalDynamicSite1964_1(6197, (2352787465283079579L ^ local2)))), ((boolean)(p0)));
    return;
}


public void e(float p0, float p1) {
int forwardValue5276_77_0;
    int forwardValue5276_105_0;
    int forwardValue5276_158_0;
    net.minecraft.entity.passive.EntityHorse forwardValue5276_205_0;
    int forwardValue5276_219_0;
    int forwardValue5276_237_0;
    net.minecraft.entity.passive.EntityHorse forwardValue5276_249_0;
    net.minecraft.entity.passive.EntityHorse forwardValue5276_306_0;
    net.minecraft.entity.passive.EntityHorse spill5276_0;
    net.minecraft.entity.passive.EntityHorse spill5276_1;
    net.minecraft.entity.passive.EntityHorse spill5276_2;
    net.minecraft.entity.passive.EntityHorse spill5276_3;
    float spill5276_4;
    net.minecraft.entity.passive.EntityHorse spill5276_5;
    float spill5276_6;
    int spill5276_7;
    int spill5276_8;
    boolean spill5276_9;
    boolean spill5276_10;
    boolean spill5276_11;
    boolean spill5276_12;
    boolean spill5276_13;
    net.minecraft.entity.passive.EntityHorse spill5276_14;
    net.minecraft.entity.passive.EntityHorse spill5276_15;
    long life3_3;
    int life5_5;
    float life6_232;
    float life7_240;
    double life6_331;
    double life8_337;
    float life10_348;
    forward_join_309: {
    forward_join_306: {
    forward_join_299: {
    forward_join_297: {
    forward_join_279: {
    forward_join_249: {
    forward_join_244: {
    forward_join_237: {
    forward_join_233: {
    forward_join_219: {
    forward_join_207: {
    forward_join_205: {
    forward_join_204: {
    forward_join_158: {
    forward_join_147: {
    forward_join_105: {
    forward_join_101: {
    forward_join_77: {
    forward_join_75: {
    life3_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 99009021373302L);
    life5_5 = moom.vR.c();
    spill5276_0 = this;
    if (!((life5_5 == 0))) {
        forwardValue5276_306_0 = spill5276_0;
        break forward_join_306;
    }
    if (!((((net.minecraft.entity.passive.EntityHorse)(spill5276_0)).f != null))) {
        break forward_join_299;
    }
    spill5276_1 = this;
    if (!((life5_5 == 0))) {
        forwardValue5276_306_0 = spill5276_1;
        break forward_join_306;
    }
    if (!((((((net.minecraft.entity.passive.EntityHorse)(spill5276_1)).f instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0) != 0))) {
        break forward_join_299;
    }
    spill5276_2 = this;
    if (!((life5_5 == 0))) {
        forwardValue5276_306_0 = spill5276_2;
        break forward_join_306;
    }
    if (!(((net.minecraft.entity.passive.EntityHorse)(spill5276_2)).ao())) {
        break forward_join_299;
    }
    spill5276_3 = this;
    net.minecraft.entity.passive.EntityHorse __stackOp5276_8_0 = this;
    float __stackOp5276_8_1 = ((net.minecraft.entity.Entity)(this.f)).w;
    spill5276_4 = __stackOp5276_8_1;
    ((net.minecraft.entity.passive.EntityHorse)(__stackOp5276_8_0)).w = ((float)(__stackOp5276_8_1));
    ((net.minecraft.entity.passive.EntityHorse)(spill5276_3)).y = ((float)(spill5276_4));
    this.x = ((float)((((net.minecraft.entity.Entity)(this.f)).x * 0x1.0p-1f)));
    ((net.minecraft.entity.passive.EntityHorse)(this)).b(((float)(this.w)), ((float)(this.x)));
    spill5276_5 = this;
    net.minecraft.entity.passive.EntityHorse __stackOp5276_18_0 = this;
    float __stackOp5276_18_1 = this.w;
    spill5276_6 = __stackOp5276_18_1;
    ((net.minecraft.entity.passive.EntityHorse)(__stackOp5276_18_0)).a2 = ((float)(__stackOp5276_18_1));
    ((net.minecraft.entity.passive.EntityHorse)(spill5276_5)).a4 = ((float)(spill5276_6));
    p0 = (((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(this.f)))).bj * 0x1.0p-1f);
    p1 = ((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(this.f)))).bk;
    spill5276_7 = recovery.source.CarrierOps.fcmpg(((float)(p1)), ((float)(0x0.0p0f)));
    if (!((life5_5 == 0))) {
        forwardValue5276_77_0 = spill5276_7;
        break forward_join_77;
    }
    if (!((spill5276_7 <= 0))) {
        break forward_join_75;
    }
    p1 = (p1 * 0x1.0p-2f);
    this.cD = ((int)(0));
    }
    forwardValue5276_77_0 = ((this.A) ? 1 : 0);
    }
    if (!((life5_5 == 0))) {
        forwardValue5276_105_0 = forwardValue5276_77_0;
        break forward_join_105;
    }
    if (!((forwardValue5276_77_0 != 0))) {
        break forward_join_101;
    }
    spill5276_8 = recovery.source.CarrierOps.fcmpl(((float)(this.cv)), ((float)(0x0.0p0f)));
    if (!((life5_5 == 0))) {
        forwardValue5276_105_0 = spill5276_8;
        break forward_join_105;
    }
    if (!((spill5276_8 == 0))) {
        break forward_join_101;
    }
    spill5276_9 = ((net.minecraft.entity.passive.EntityHorse)(this)).ak();
    if (!((life5_5 == 0))) {
        forwardValue5276_105_0 = ((spill5276_9) ? 1 : 0);
        break forward_join_105;
    }
    if (!(spill5276_9)) {
        break forward_join_101;
    }
    spill5276_10 = this.cw;
    if (!((life5_5 == 0))) {
        forwardValue5276_105_0 = ((spill5276_10) ? 1 : 0);
        break forward_join_105;
    }
    if (!((!spill5276_10))) {
        break forward_join_101;
    }
    p0 = 0x0.0p0f;
    p1 = 0x0.0p0f;
    }
    forwardValue5276_105_0 = recovery.source.CarrierOps.fcmpl(((float)(this.cv)), ((float)(0x0.0p0f)));
    }
    if (!((life5_5 == 0))) {
        forwardValue5276_219_0 = forwardValue5276_105_0;
        break forward_join_219;
    }
    if (!((forwardValue5276_105_0 > 0))) {
        break forward_join_207;
    }
    spill5276_11 = ((net.minecraft.entity.passive.EntityHorse)(this)).ah__Boolean();
    if (!((life5_5 == 0))) {
        forwardValue5276_219_0 = ((spill5276_11) ? 1 : 0);
        break forward_join_219;
    }
    if (!((!spill5276_11))) {
        break forward_join_207;
    }
    spill5276_12 = this.A;
    if (!((life5_5 == 0))) {
        forwardValue5276_219_0 = ((spill5276_12) ? 1 : 0);
        break forward_join_219;
    }
    if (!(spill5276_12)) {
        break forward_join_207;
    }
    this.u = ((double)((((net.minecraft.entity.passive.EntityHorse)(this)).a__sourceReturn_fedcb3e4d3() * ((double) this.cv))));
    spill5276_13 = ((net.minecraft.entity.passive.EntityHorse)(this)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.k)));
    if (!((life5_5 == 0))) {
        forwardValue5276_158_0 = ((spill5276_13) ? 1 : 0);
        break forward_join_158;
    }
    if (!(spill5276_13)) {
        break forward_join_147;
    }
    net.minecraft.entity.passive.EntityHorse __stackOp5276_49_0 = this;
    ((net.minecraft.entity.passive.EntityHorse)(__stackOp5276_49_0)).u = ((double)((((net.minecraft.entity.passive.EntityHorse)(__stackOp5276_49_0)).u + ((double) (((float) (((net.minecraft.potion.PotionEffect)(((net.minecraft.entity.passive.EntityHorse)(this)).a(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.k))))).c() + 1)) * 0x1.99999ap-4f)))));
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).o(((boolean)(true)));
    spill5276_14 = this;
    if (!((life5_5 == 0))) {
        forwardValue5276_205_0 = spill5276_14;
        break forward_join_205;
    }
    ((net.minecraft.entity.passive.EntityHorse)(spill5276_14)).ad = ((boolean)(true));
    forwardValue5276_158_0 = recovery.source.CarrierOps.fcmpl(((float)(p1)), ((float)(0x0.0p0f)));
    }
    if (!((forwardValue5276_158_0 > 0))) {
        break forward_join_204;
    }
    life6_232 = moom.Dr.a(((float)(((this.w * 0x1.921fb6p1f) / 0x1.68p7f))));
    life7_240 = moom.Dr.b(((float)(((this.w * 0x1.921fb6p1f) / 0x1.68p7f))));
    net.minecraft.entity.passive.EntityHorse __stackOp5276_62_0 = this;
    ((net.minecraft.entity.passive.EntityHorse)(__stackOp5276_62_0)).t = ((double)((((net.minecraft.entity.passive.EntityHorse)(__stackOp5276_62_0)).t + ((double) ((-0x1.99999ap-2f * life6_232) * this.cv)))));
    net.minecraft.entity.passive.EntityHorse __stackOp5276_66_0 = this;
    ((net.minecraft.entity.passive.EntityHorse)(__stackOp5276_66_0)).v = ((double)((((net.minecraft.entity.passive.EntityHorse)(__stackOp5276_66_0)).v + ((double) ((0x1.99999ap-2f * life7_240) * this.cv)))));
    ((net.minecraft.entity.passive.EntityHorse)(this)).a(((java.lang.String)("mob.horse.jump")), ((float)(0x1.99999ap-2f)), ((float)(0x1.0p0f)));
    }
    forwardValue5276_205_0 = this;
    }
    ((net.minecraft.entity.passive.EntityHorse)(forwardValue5276_205_0)).cv = ((float)(0x0.0p0f));
    }
    this.P = ((float)(0x1.0p0f));
    this.a6 = ((float)((((net.minecraft.entity.passive.EntityHorse)(this)).i__sourceReturn_bc607678b6() * 0x1.99999ap-4f)));
    forwardValue5276_219_0 = ((((net.minecraft.world.World)(this.i)).G) ? 1 : 0);
    }
    if (!((life5_5 == 0))) {
        forwardValue5276_237_0 = forwardValue5276_219_0;
        break forward_join_237;
    }
    if (!((forwardValue5276_219_0 == 0))) {
        break forward_join_233;
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).f(((float)(((float) ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.passive.EntityHorse)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).b()))));
    super.e(((float)(p0)), ((float)(p1)));
    }
    spill5276_15 = this;
    if (!((life5_5 == 0))) {
        forwardValue5276_249_0 = spill5276_15;
        break forward_join_249;
    }
    forwardValue5276_237_0 = ((((net.minecraft.entity.passive.EntityHorse)(spill5276_15)).A) ? 1 : 0);
    }
    if (!((forwardValue5276_237_0 != 0))) {
        break forward_join_244;
    }
    this.cv = ((float)(0x0.0p0f));
    ((net.minecraft.entity.passive.EntityHorse)(this)).o(((boolean)(false)));
    }
    this.aU = ((float)(this.aV));
    forwardValue5276_249_0 = this;
    }
    life6_331 = (((net.minecraft.entity.passive.EntityHorse)(forwardValue5276_249_0)).n - this.k);
    life8_337 = (this.p - this.m);
    life10_348 = (moom.Dr.a__Float(((double)(((life6_331 * life6_331) + (life8_337 * life8_337))))) * 0x1.0p2f);
    if (!((life5_5 == 0))) {
        break forward_join_297;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(life10_348)), ((float)(0x1.0p0f))) > 0))) {
        break forward_join_279;
    }
    life10_348 = 0x1.0p0f;
    }
    net.minecraft.entity.passive.EntityHorse __stackOp5276_95_0 = this;
    ((net.minecraft.entity.passive.EntityHorse)(__stackOp5276_95_0)).aV = ((float)((((net.minecraft.entity.passive.EntityHorse)(__stackOp5276_95_0)).aV + ((life10_348 - this.aV) * 0x1.99999ap-2f))));
    net.minecraft.entity.passive.EntityHorse __stackOp5276_99_0 = this;
    ((net.minecraft.entity.passive.EntityHorse)(__stackOp5276_99_0)).aW = ((float)((((net.minecraft.entity.passive.EntityHorse)(__stackOp5276_99_0)).aW + this.aV)));
    }
    if (!((life5_5 != 0))) {
        break forward_join_309;
    }
    }
    this.P = ((float)(0x1.0p-1f));
    this.a6 = ((float)(0x1.47ae14p-6f));
    forwardValue5276_306_0 = this;
    }
    __sourceIntrinsic_c23f50d43b1e_call5276_105(forwardValue5276_306_0, p0, p1);
    }
    return;
}


public float e__sourceReturn_f6c4892e39(float p0) {
return (this.cC + ((this.cB - this.cC) * p0));
}


private int x__sourceReturn_8abf5c6871() {
int forwardValue5287_23_0;
    int forwardValue5287_23_1;
    int forwardValue5287_25_0;
    int forwardValue5287_31_0;
    int spill5287_0;
    boolean spill5287_1;
    int spill5287_2;
    int spill5287_3;
    int spill5287_4;
    long life1_3;
    int life4_7;
    int life3_8;
    forward_join_31: {
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    life1_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 45588606631732L);
    spill5287_0 = moom.vR.b();
    life4_7 = ((net.minecraft.entity.passive.EntityHorse)(this)).t();
    life3_8 = spill5287_0;
    spill5287_1 = ((net.minecraft.entity.passive.EntityHorse)(this)).ai__Boolean();
    if (!((life3_8 != 0))) {
        forwardValue5287_25_0 = ((spill5287_1) ? 1 : 0);
        break forward_join_25;
    }
    if (!(spill5287_1)) {
        break forward_join_24;
    }
    spill5287_2 = life4_7;
    spill5287_3 = 1;
    if (!((life3_8 != 0))) {
        forwardValue5287_23_0 = spill5287_2;
        forwardValue5287_23_1 = spill5287_3;
        break forward_join_23;
    }
    if (!((spill5287_2 != spill5287_3))) {
        break forward_join_26;
    }
    spill5287_4 = life4_7;
    if (!((life3_8 != 0))) {
        forwardValue5287_25_0 = spill5287_4;
        break forward_join_25;
    }
    forwardValue5287_23_0 = spill5287_4;
    forwardValue5287_23_1 = 2;
    }
    if (!((forwardValue5287_23_0 != forwardValue5287_23_1))) {
        break forward_join_26;
    }
    }
    forwardValue5287_25_0 = 2;
    }
    forwardValue5287_31_0 = forwardValue5287_25_0;
    break forward_join_31;
    }
    forwardValue5287_31_0 = __sourceIntrinsic_eee0b6aee450_invokedynamic5287_5(20035, (6421651160098939844L ^ life1_3));
    }
    return forwardValue5287_31_0;
}


private void ae() {
int forwardValue5257_86_0;
    int forwardValue5257_86_1;
    int spill5257_0;
    int spill5257_1;
    int spill5257_2;
    long life1_3;
    int life4_25;
    int life5_28;
    int life3_29;
    int life6_44;
    int life7_58;
    int life6_137;
    forward_join_151: {
    forward_join_148: {
    forward_join_133: {
    forward_join_119: {
    forward_join_113: {
    forward_join_108: {
    forward_join_106: {
    forward_join_91: {
    forward_join_86: {
    forward_join_66: {
    life1_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 24245975102051L);
    this.cE = ((java.lang.String)("horse/"));
    spill5257_0 = moom.vR.c();
    (this.cF)[0] = null;
    (this.cF)[1] = null;
    (this.cF)[2] = null;
    life4_25 = ((net.minecraft.entity.passive.EntityHorse)(this)).t();
    life5_28 = ((net.minecraft.entity.passive.EntityHorse)(this)).u__sourceReturn_8abf5c6871();
    life3_29 = spill5257_0;
    if (!((life3_29 == 0))) {
        break forward_join_113;
    }
    if (!((life4_25 == 0))) {
        break forward_join_108;
    }
    life6_44 = (life5_28 & __sourceIntrinsic_a350cb83cc16_invokedynamic5257_8(5056, (3118740696009929516L ^ life1_3)));
    life7_58 = ((life5_28 & __sourceIntrinsic_a350cb83cc16_invokedynamic5257_9(20649, (8665555349601595489L ^ life1_3))) >> __sourceIntrinsic_a350cb83cc16_invokedynamic5257_10(25403, (6035933603901441006L ^ life1_3)));
    spill5257_1 = life6_44;
    spill5257_2 = (net.minecraft.entity.passive.EntityHorse.ci).length;
    if (!((life3_29 == 0))) {
        forwardValue5257_86_0 = spill5257_1;
        forwardValue5257_86_1 = spill5257_2;
        break forward_join_86;
    }
    if (!((spill5257_1 >= spill5257_2))) {
        break forward_join_66;
    }
    this.cG = ((boolean)(false));
    return;
    }
    (this.cF)[0] = (net.minecraft.entity.passive.EntityHorse.ci)[life6_44];
    this.cE = ((java.lang.String)(__sourceIntrinsic_a350cb83cc16_invokedynamic5257_17(this.cE, (net.minecraft.entity.passive.EntityHorse.cj)[life6_44])));
    if (!((life3_29 == 0))) {
        break forward_join_106;
    }
    forwardValue5257_86_0 = life7_58;
    forwardValue5257_86_1 = (net.minecraft.entity.passive.EntityHorse.ck).length;
    }
    if (!((forwardValue5257_86_0 >= forwardValue5257_86_1))) {
        break forward_join_91;
    }
    this.cG = ((boolean)(false));
    return;
    }
    (this.cF)[1] = (net.minecraft.entity.passive.EntityHorse.ck)[life7_58];
    this.cE = ((java.lang.String)(__sourceIntrinsic_a350cb83cc16_invokedynamic5257_25(this.cE, (net.minecraft.entity.passive.EntityHorse.cl)[life7_58])));
    }
    if (!((life3_29 != 0))) {
        break forward_join_119;
    }
    }
    (this.cF)[0] = "";
    }
    this.cE = ((java.lang.String)(__sourceIntrinsic_a350cb83cc16_invokedynamic5257_29(this.cE, life4_25)));
    }
    life6_137 = ((net.minecraft.entity.passive.EntityHorse)(this)).v__sourceReturn_8abf5c6871();
    if (!((life3_29 == 0))) {
        break forward_join_148;
    }
    if (!((life6_137 >= (net.minecraft.entity.passive.EntityHorse.cf).length))) {
        break forward_join_133;
    }
    this.cG = ((boolean)(false));
    if (!((life3_29 != 0))) {
        break forward_join_151;
    }
    }
    (this.cF)[2] = (net.minecraft.entity.passive.EntityHorse.cf)[life6_137];
    this.cE = ((java.lang.String)(__sourceIntrinsic_a350cb83cc16_invokedynamic5257_38(this.cE, (net.minecraft.entity.passive.EntityHorse.cg)[life6_137])));
    }
    this.cG = ((boolean)(true));
    }
    return;
}


public boolean ae__Boolean() {
int forwardValue5258_12_0;
    int forwardValue5258_14_0;
    boolean spill5258_0;
    long life1_3;
    int life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 21766080493353L);
    life3_5 = moom.vR.c();
    spill5258_0 = ((net.minecraft.entity.passive.EntityHorse)(this)).c__Boolean();
    if (!((life3_5 == 0))) {
        forwardValue5258_12_0 = ((spill5258_0) ? 1 : 0);
        break forward_join_12;
    }
    if (!((!spill5258_0))) {
        break forward_join_13;
    }
    forwardValue5258_12_0 = 1;
    }
    forwardValue5258_14_0 = forwardValue5258_12_0;
    break forward_join_14;
    }
    forwardValue5258_14_0 = 0;
    }
    return ((forwardValue5258_14_0) != 0);
}


public void s(boolean p0) {
((net.minecraft.entity.passive.EntityHorse)(this)).c(((int)(4)), ((boolean)(p0)));
    return;
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.nbt.NBTTagCompound lexicalValue1599_70_0;
    java.lang.String lexicalValue1599_70_1;
    net.minecraft.entity.ai.attributes.IAttributeInstance lexicalValue1599_93_0;
    int lexicalValue1599_163_0;
    net.minecraft.nbt.NBTTagCompound lexicalValue1599_187_0;
    int lexicalValue1599_194_0;
    net.minecraft.item.ItemStack lexicalValue1599_207_0;
    int lexicalValue1599_220_0;
    int spill1599_0;
    net.minecraft.nbt.NBTTagCompound spill1599_1;
    java.lang.String spill1599_2;
    net.minecraft.entity.ai.attributes.IAttributeInstance spill1599_3;
    boolean spill1599_4;
    int spill1599_5;
    net.minecraft.nbt.NBTTagCompound spill1599_6;
    boolean spill1599_7;
    net.minecraft.item.ItemStack spill1599_8;
    long life2_3;
    int life4_28;
    java.lang.String life5_50;
    java.lang.String life5_68;
    java.lang.String life6_77;
    net.minecraft.entity.ai.attributes.IAttributeInstance life6_94;
    net.minecraft.nbt.NBTTagList life7_129;
    int life8_133;
    net.minecraft.nbt.NBTTagCompound life9_141;
    int life10_151;
    net.minecraft.item.ItemStack life7_208;
    net.minecraft.item.ItemStack life7_249;
    lexical_join_229: {
    lexical_join_220: {
    lexical_join_217: {
    lexical_join_215: {
    lexical_join_207: {
    lexical_join_194: {
    lexical_join_187: {
    lexical_join_186: {
    lexical_join_163: {
    lexical_join_155: {
    lexical_join_98: {
    lexical_join_93: {
    lexical_join_81: {
    lexical_join_75: {
    lexical_join_70: {
    lexical_join_68: {
    life2_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 115880146845806L);
    super.c(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.entity.passive.EntityHorse)(this)).t(((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("EatingHaystack"))))));
    ((net.minecraft.entity.passive.EntityHorse)(this)).p(((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("Bred"))))));
    ((net.minecraft.entity.passive.EntityHorse)(this)).q(((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("ChestedHorse"))))));
    spill1599_0 = moom.vR.c();
    ((net.minecraft.entity.passive.EntityHorse)(this)).r(((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("HasReproduced"))))));
    life4_28 = spill1599_0;
    ((net.minecraft.entity.passive.EntityHorse)(this)).n(((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("Type"))))));
    ((net.minecraft.entity.passive.EntityHorse)(this)).o(((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("Variant"))))));
    ((net.minecraft.entity.passive.EntityHorse)(this)).p(((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("Temper"))))));
    ((net.minecraft.entity.passive.EntityHorse)(this)).n(((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("Tame"))))));
    life5_50 = "";
    spill1599_1 = p0;
    spill1599_2 = "OwnerUUID";
    if (!((life4_28 == 0))) {
        lexicalValue1599_70_0 = spill1599_1;
        lexicalValue1599_70_1 = spill1599_2;
        break lexical_join_70;
    }
    if (!(((net.minecraft.nbt.NBTTagCompound)(spill1599_1)).a__Boolean(((java.lang.String)(spill1599_2)), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic1599_19(25403, (6035824929380069859L ^ life2_3))))))) {
        break lexical_join_68;
    }
    life5_68 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__String(((java.lang.String)("OwnerUUID")));
    if (!((life4_28 != 0))) {
        break lexical_join_75;
    }
    }
    lexicalValue1599_70_0 = p0;
    lexicalValue1599_70_1 = "Owner";
    }
    life6_77 = ((net.minecraft.nbt.NBTTagCompound)(lexicalValue1599_70_0)).a__String(((java.lang.String)(lexicalValue1599_70_1)));
    life5_68 = moom.By.a(((java.lang.String)(life6_77)));
    }
    if (!((((java.lang.String)(life5_68)).length() > 0))) {
        break lexical_join_81;
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).b(((java.lang.String)(life5_68)));
    }
    life6_94 = ((net.minecraft.entity.ai.attributes.BaseAttributeMap)(((net.minecraft.entity.passive.EntityHorse)(this)).a__vE())).a(((java.lang.String)("Speed")));
    spill1599_3 = life6_94;
    if (!((life4_28 == 0))) {
        lexicalValue1599_93_0 = spill1599_3;
        break lexical_join_93;
    }
    if (!((spill1599_3 != null))) {
        break lexical_join_98;
    }
    lexicalValue1599_93_0 = ((net.minecraft.entity.passive.EntityHorse)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e)));
    }
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(lexicalValue1599_93_0)).a(((double)((((net.minecraft.entity.ai.attributes.IAttributeInstance)(life6_94)).a() * 0x1.0p-2d))));
    }
    spill1599_4 = ((net.minecraft.entity.passive.EntityHorse)(this)).ai__Boolean();
    if (!((life4_28 == 0))) {
        lexicalValue1599_163_0 = ((spill1599_4) ? 1 : 0);
        break lexical_join_163;
    }
    if (!(spill1599_4)) {
        break lexical_join_155;
    }
    life7_129 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Items")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic1599_34(20811, (9198065770443522991L ^ life2_3)))));
    ((net.minecraft.entity.passive.EntityHorse)(this)).ab__sourceReturn_da8c82d5d4();
    life8_133 = 0;
    lexical_cycle_116: while (true) {
    lexical_join_153: {
    lexical_join_152: {
    if (!((life8_133 < ((net.minecraft.nbt.NBTTagList)(life7_129)).a__Int()))) {
        break lexical_join_155;
    }
    life9_141 = ((net.minecraft.nbt.NBTTagList)(life7_129)).a__yw(((int)(life8_133)));
    life10_151 = (((net.minecraft.nbt.NBTTagCompound)(life9_141)).b__sourceReturn_d4c7a9581c(((java.lang.String)("Slot"))) & __sourceIntrinsic_01f4e1cd062e_invokedynamic1599_40(18123, (1471316669223719963L ^ life2_3)));
    if (!((life4_28 == 0))) {
        break lexical_join_153;
    }
    spill1599_5 = life10_151;
    if (!((life4_28 == 0))) {
        lexicalValue1599_163_0 = spill1599_5;
        break lexical_join_163;
    }
    if (!((spill1599_5 >= 2))) {
        break lexical_join_152;
    }
    if (!((life10_151 < ((moom.ws)(this.cs)).b__Int()))) {
        break lexical_join_152;
    }
    ((moom.ws)(this.cs)).a__Void(((int)(life10_151)), ((net.minecraft.item.ItemStack)(__sourceExactCall_b20cc06766c170(((net.minecraft.nbt.NBTTagCompound)(life9_141))))));
    }
    life8_133 += 1;
    }
    if (!((life4_28 != 0))) { continue lexical_cycle_116; }
    break lexical_cycle_116;
    }
    }
    lexicalValue1599_163_0 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("ArmorItem")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic1599_46(20811, (9198065770443522991L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_28 == 0))) {
        lexicalValue1599_194_0 = lexicalValue1599_163_0;
        break lexical_join_194;
    }
    if (!((lexicalValue1599_163_0 != 0))) {
        break lexical_join_186;
    }
    spill1599_6 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__yw(((java.lang.String)("ArmorItem")));
    if (!((life4_28 == 0))) {
        lexicalValue1599_187_0 = spill1599_6;
        break lexical_join_187;
    }
    life7_208 = __sourceExactCall_b20cc06766c170(((net.minecraft.nbt.NBTTagCompound)(spill1599_6)));
    if (!((life7_208 != null))) {
        break lexical_join_186;
    }
    spill1599_7 = __sourceExactCall_28cca1ad76a52a(((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(life7_208)).a__wQ())));
    if (!((life4_28 == 0))) {
        lexicalValue1599_194_0 = ((spill1599_7) ? 1 : 0);
        break lexical_join_194;
    }
    if (!(spill1599_7)) {
        break lexical_join_186;
    }
    ((moom.ws)(this.cs)).a__Void(((int)(1)), ((net.minecraft.item.ItemStack)(life7_208)));
    }
    lexicalValue1599_187_0 = p0;
    }
    lexicalValue1599_194_0 = ((((net.minecraft.nbt.NBTTagCompound)(lexicalValue1599_187_0)).a__Boolean(((java.lang.String)("SaddleItem")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic1599_56(20811, (9198065770443522991L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_28 == 0))) {
        lexicalValue1599_220_0 = lexicalValue1599_194_0;
        break lexical_join_220;
    }
    if (!((lexicalValue1599_194_0 != 0))) {
        break lexical_join_217;
    }
    life7_249 = __sourceExactCall_b20cc06766c170(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__yw(((java.lang.String)("SaddleItem"))))));
    spill1599_8 = life7_249;
    if (!((life4_28 == 0))) {
        lexicalValue1599_207_0 = spill1599_8;
        break lexical_join_207;
    }
    if (!((spill1599_8 != null))) {
        break lexical_join_215;
    }
    lexicalValue1599_207_0 = life7_249;
    }
    if (!((((net.minecraft.item.ItemStack)(lexicalValue1599_207_0)).a__wQ() == net.minecraft.init.Items.aA))) {
        break lexical_join_215;
    }
    ((moom.ws)(this.cs)).a__Void(((int)(0)), ((net.minecraft.item.ItemStack)(life7_249)));
    }
    if (!((life4_28 != 0))) {
        break lexical_join_229;
    }
    }
    lexicalValue1599_220_0 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("Saddle")))) ? 1 : 0);
    }
    if (!((lexicalValue1599_220_0 != 0))) {
        break lexical_join_229;
    }
    ((moom.ws)(this.cs)).a__Void(((int)(0)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.aA))));
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).ac__sourceReturn_da8c82d5d4();
    return;
}


protected java.lang.String c__String() {
int forwardValue5273_19_0;
    int forwardValue5273_29_0;
    int forwardValue5273_29_1;
    int forwardValue5273_36_0;
    int forwardValue5273_36_1;
    int forwardValue5273_41_0;
    int forwardValue5273_41_1;
    java.lang.String forwardValue5273_45_0;
    int spill5273_0;
    int spill5273_1;
    int spill5273_2;
    int spill5273_3;
    long life1_3;
    int life3_7;
    int life4_25;
    forward_join_45: {
    forward_join_44: {
    forward_join_41: {
    forward_join_36: {
    forward_join_34: {
    forward_join_29: {
    forward_join_27: {
    forward_join_19: {
    forward_join_17: {
    life1_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 78968006725309L);
    spill5273_0 = moom.vR.c();
    ((net.minecraft.entity.passive.EntityHorse)(this)).ag();
    life3_7 = spill5273_0;
    spill5273_1 = ((java.util.Random)(this.ah)).nextInt(((int)(3)));
    if (!((life3_7 == 0))) {
        forwardValue5273_19_0 = spill5273_1;
        break forward_join_19;
    }
    if (!((spill5273_1 == 0))) {
        break forward_join_17;
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).ah();
    }
    forwardValue5273_19_0 = ((net.minecraft.entity.passive.EntityHorse)(this)).t();
    }
    life4_25 = forwardValue5273_19_0;
    spill5273_2 = life4_25;
    spill5273_3 = 3;
    if (!((life3_7 == 0))) {
        forwardValue5273_29_0 = spill5273_2;
        forwardValue5273_29_1 = spill5273_3;
        break forward_join_29;
    }
    if (!((spill5273_2 == spill5273_3))) {
        break forward_join_27;
    }
    forwardValue5273_45_0 = "mob.horse.zombie.hit";
    break forward_join_45;
    }
    forwardValue5273_29_0 = life4_25;
    forwardValue5273_29_1 = 4;
    }
    if (!((life3_7 == 0))) {
        forwardValue5273_36_0 = forwardValue5273_29_0;
        forwardValue5273_36_1 = forwardValue5273_29_1;
        break forward_join_36;
    }
    if (!((forwardValue5273_29_0 == forwardValue5273_29_1))) {
        break forward_join_34;
    }
    forwardValue5273_45_0 = "mob.horse.skeleton.hit";
    break forward_join_45;
    }
    forwardValue5273_36_0 = life4_25;
    forwardValue5273_36_1 = 1;
    }
    if (!((life3_7 == 0))) {
        forwardValue5273_41_0 = forwardValue5273_36_0;
        forwardValue5273_41_1 = forwardValue5273_36_1;
        break forward_join_41;
    }
    if (!((forwardValue5273_36_0 != forwardValue5273_36_1))) {
        break forward_join_44;
    }
    forwardValue5273_41_0 = life4_25;
    forwardValue5273_41_1 = 2;
    }
    if (!((forwardValue5273_41_0 != forwardValue5273_41_1))) {
        break forward_join_44;
    }
    forwardValue5273_45_0 = "mob.horse.hit";
    break forward_join_45;
    }
    forwardValue5273_45_0 = "mob.horse.donkey.hit";
    }
    return forwardValue5273_45_0;
}


public float c__sourceReturn_f6c4892e39(float p0) {
return (this.cy + ((this.cx - this.cy) * p0));
}


private void c(int p0, boolean p1) {
long life3_3;
    int life6_13;
    int life5_14;
    forward_join_47: {
    forward_join_33: {
    forward_join_31: {
    life3_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 65558654306587L);
    int spill5918_0 = moom.vR.b();
    life6_13 = ((net.minecraft.entity.DataWatcher)(this.al)).a__Int(((int)(__sourceIntrinsic_42305bc53e1c_invokedynamic5918_3(9170, (4543151692084230259L ^ life3_3)))));
    life5_14 = spill5918_0;
    if (!((life5_14 != 0))) { break forward_join_31; }
    if (!(p1)) { break forward_join_33; }
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_42305bc53e1c_invokedynamic5918_6(9170, (4543151692084230259L ^ life3_3)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)((life6_13 | p0)))))));
    }
    if (!((life5_14 == 0))) { break forward_join_47; }
    }
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_42305bc53e1c_invokedynamic5918_10(9170, (4543151692084230259L ^ life3_3)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)((life6_13 & (p0 ^ -1))))))));
    }
    return;
}


private boolean c__sourceReturn_9a6ad9dfe5(int p0) {
int forwardValue5270_20_0;
    int forwardValue5270_22_0;
    int spill5270_0;
    long life2_3;
    int life4_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life2_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 17308055504064L);
    life4_5 = moom.vR.b();
    spill5270_0 = (((net.minecraft.entity.DataWatcher)(this.al)).a__Int(((int)(__sourceIntrinsic_63673aced462_invokedynamic5270_3(9170, (4543200159586612648L ^ life2_3))))) & p0);
    if (!((life4_5 != 0))) {
        forwardValue5270_20_0 = spill5270_0;
        break forward_join_20;
    }
    if (!((spill5270_0 != 0))) {
        break forward_join_21;
    }
    forwardValue5270_20_0 = 1;
    }
    forwardValue5270_22_0 = forwardValue5270_20_0;
    break forward_join_22;
    }
    forwardValue5270_22_0 = 0;
    }
    return ((forwardValue5270_22_0) != 0);
}


private void c__sourceReturn_aecb585720(net.minecraft.entity.player.EntityPlayer p0) {
net.minecraft.entity.player.EntityPlayer forwardValue5271_28_0;
    net.minecraft.entity.passive.EntityHorse forwardValue5271_28_1;
    int spill5271_0;
    net.minecraft.entity.player.EntityPlayer spill5271_1;
    net.minecraft.entity.passive.EntityHorse spill5271_2;
    long life2_3;
    int life4_9;
    forward_join_29: {
    forward_join_28: {
    life2_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 39505742397426L);
    spill5271_0 = moom.vR.b();
    ((net.minecraft.entity.player.EntityPlayer)(p0)).w = ((float)(this.w));
    life4_9 = spill5271_0;
    spill5271_1 = p0;
    spill5271_2 = this;
    if (!((life4_9 != 0))) {
        forwardValue5271_28_0 = spill5271_1;
        forwardValue5271_28_1 = spill5271_2;
        break forward_join_28;
    }
    ((net.minecraft.entity.player.EntityPlayer)(spill5271_1)).x = ((float)(((net.minecraft.entity.passive.EntityHorse)(spill5271_2)).x));
    ((net.minecraft.entity.passive.EntityHorse)(this)).t(((boolean)(false)));
    ((net.minecraft.entity.passive.EntityHorse)(this)).u(((boolean)(false)));
    if (!((!((net.minecraft.world.World)(this.i)).G))) {
        break forward_join_29;
    }
    forwardValue5271_28_0 = p0;
    forwardValue5271_28_1 = this;
    }
    ((net.minecraft.entity.player.EntityPlayer)(forwardValue5271_28_0)).b(((net.minecraft.entity.Entity)(forwardValue5271_28_1)));
    }
    return;
}


private double c__sourceReturn_fedcb3e4d3() {
return ((((0x1.ccccccp-2d + (((java.util.Random)(this.ah)).nextDouble() * 0x1.3333333333333p-2d)) + (((java.util.Random)(this.ah)).nextDouble() * 0x1.3333333333333p-2d)) + (((java.util.Random)(this.ah)).nextDouble() * 0x1.3333333333333p-2d)) * 0x1.0p-2d);
}


public int n__Int() {
long local1 = (net.minecraft.entity.passive.EntityHorse.jb ^ 136117083462034L);
    return __sourceIntrinsic_11645c1a30d8_originalDynamicSite1965_1(572, (8880914862962018605L ^ local1));
}


public boolean n__Boolean() {
long local1 = (net.minecraft.entity.passive.EntityHorse.jb ^ 57157817555713L);
    return ((((this.f == null) ? 1 : 0)) != 0);
}


private float n() {
long local1 = (net.minecraft.entity.passive.EntityHorse.jb ^ 88336324181379L);
    return ((0x1.ep3f + ((float) ((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_40c7d890f800_originalDynamicSite1966_2(25403, (6035870202994953230L ^ local1))))))) + ((float) ((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_40c7d890f800_originalDynamicSite1966_5(21816, (1677537331815234075L ^ local1)))))));
}


public void n(int p0) {
long local2 = (net.minecraft.entity.passive.EntityHorse.jb ^ 33715409755681L);
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_e3ce5c7e7d84_originalDynamicSite1967_2(25367, (1447289249783885705L ^ local2)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) p0)))))));
    ((net.minecraft.entity.passive.EntityHorse)(this)).ad__sourceReturn_da8c82d5d4();
    return;
}


public void n(boolean p0) {
((net.minecraft.entity.passive.EntityHorse)(this)).c(((int)(2)), ((boolean)(p0)));
    return;
}


protected java.lang.String h__String() {
int forwardValue5278_20_0;
    int forwardValue5278_20_1;
    int forwardValue5278_27_0;
    int forwardValue5278_27_1;
    int forwardValue5278_32_0;
    int forwardValue5278_32_1;
    java.lang.String forwardValue5278_36_0;
    int spill5278_0;
    int spill5278_1;
    int spill5278_2;
    long life1_3;
    int life3_7;
    int life4_10;
    forward_join_36: {
    forward_join_35: {
    forward_join_32: {
    forward_join_27: {
    forward_join_25: {
    forward_join_20: {
    forward_join_18: {
    life1_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 52831984299464L);
    spill5278_0 = moom.vR.b();
    ((net.minecraft.entity.passive.EntityHorse)(this)).ag();
    life3_7 = spill5278_0;
    life4_10 = ((net.minecraft.entity.passive.EntityHorse)(this)).t();
    spill5278_1 = life4_10;
    spill5278_2 = 3;
    if (!((life3_7 != 0))) {
        forwardValue5278_20_0 = spill5278_1;
        forwardValue5278_20_1 = spill5278_2;
        break forward_join_20;
    }
    if (!((spill5278_1 == spill5278_2))) {
        break forward_join_18;
    }
    forwardValue5278_36_0 = "mob.horse.zombie.death";
    break forward_join_36;
    }
    forwardValue5278_20_0 = life4_10;
    forwardValue5278_20_1 = 4;
    }
    if (!((life3_7 != 0))) {
        forwardValue5278_27_0 = forwardValue5278_20_0;
        forwardValue5278_27_1 = forwardValue5278_20_1;
        break forward_join_27;
    }
    if (!((forwardValue5278_20_0 == forwardValue5278_20_1))) {
        break forward_join_25;
    }
    forwardValue5278_36_0 = "mob.horse.skeleton.death";
    break forward_join_36;
    }
    forwardValue5278_27_0 = life4_10;
    forwardValue5278_27_1 = 1;
    }
    if (!((life3_7 != 0))) {
        forwardValue5278_32_0 = forwardValue5278_27_0;
        forwardValue5278_32_1 = forwardValue5278_27_1;
        break forward_join_32;
    }
    if (!((forwardValue5278_27_0 != forwardValue5278_27_1))) {
        break forward_join_35;
    }
    forwardValue5278_32_0 = life4_10;
    forwardValue5278_32_1 = 2;
    }
    if (!((forwardValue5278_32_0 != forwardValue5278_32_1))) {
        break forward_join_35;
    }
    forwardValue5278_36_0 = "mob.horse.death";
    break forward_join_36;
    }
    forwardValue5278_36_0 = "mob.horse.donkey.death";
    }
    return forwardValue5278_36_0;
}


private static java.lang.invoke.CallSite f(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_ec881c4a524b_methodHandleLiteral11579_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/sO"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected float f__sourceReturn_bc607678b6() {
return 0x1.99999ap-1f;
}


private static int f(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.entity.passive.EntityHorse.f(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int f(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 27734;
      if (Ab[var3] == null) {
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
         long var5 = kb[var3];
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
         Object[] var9 = (Object[])Bb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               Bb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/sO", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         Ab[var3] = var15;
      }

      return Ab[var3];
}


public void l(boolean p0) {
long life2_3;
    int life4_5;
    forward_join_19: {
    forward_join_16: {
    forward_join_14: {
    life2_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 23711865221806L);
    life4_5 = moom.vR.b();
    if (!((life4_5 != 0))) { break forward_join_14; }
    if (!(p0)) { break forward_join_16; }
    ((net.minecraft.entity.passive.EntityHorse)(this)).j(((float)(((net.minecraft.entity.passive.EntityHorse)(this)).m__sourceReturn_bc607678b6())));
    }
    if (!((life4_5 == 0))) { break forward_join_19; }
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).j(((float)(0x1.0p0f)));
    }
    return;
}


public int l__sourceReturn_8abf5c6871() {
long local1 = (net.minecraft.entity.passive.EntityHorse.jb ^ 46232494344358L);
    return __sourceIntrinsic_d0e131a72963_originalDynamicSite1968_1(8736, (4119677947923363840L ^ local1));
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.entity.passive.EntityHorse lexicalValue1600_105_0;
    net.minecraft.item.ItemStack lexicalValue1600_108_0;
    net.minecraft.item.ItemStack lexicalValue1600_126_0;
    int spill1600_0;
    net.minecraft.entity.passive.EntityHorse spill1600_1;
    net.minecraft.item.ItemStack spill1600_2;
    long life2_3;
    int life4_43;
    net.minecraft.nbt.NBTTagList life5_65;
    int life6_67;
    net.minecraft.item.ItemStack life7_77;
    net.minecraft.nbt.NBTTagCompound life8_93;
    lexical_join_138: {
    lexical_join_126: {
    lexical_join_122: {
    lexical_join_108: {
    lexical_join_105: {
    lexical_join_104: {
    lexical_join_100: {
    life2_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 92361335135077L);
    super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("EatingHaystack")), ((boolean)(((net.minecraft.entity.passive.EntityHorse)(this)).aj__Boolean())));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("ChestedHorse")), ((boolean)(((net.minecraft.entity.passive.EntityHorse)(this)).ai__Boolean())));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("HasReproduced")), ((boolean)(((net.minecraft.entity.passive.EntityHorse)(this)).am())));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Bred")), ((boolean)(((net.minecraft.entity.passive.EntityHorse)(this)).al())));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("Type")), ((int)(((net.minecraft.entity.passive.EntityHorse)(this)).t())));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("Variant")), ((int)(((net.minecraft.entity.passive.EntityHorse)(this)).u__sourceReturn_8abf5c6871())));
    spill1600_0 = moom.vR.b();
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("Temper")), ((int)(((net.minecraft.entity.passive.EntityHorse)(this)).w__sourceReturn_8abf5c6871())));
    life4_43 = spill1600_0;
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Tame")), ((boolean)(((net.minecraft.entity.passive.EntityHorse)(this)).af__Boolean())));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("OwnerUUID")), ((java.lang.String)(((net.minecraft.entity.passive.EntityHorse)(this)).b__String())));
    spill1600_1 = this;
    if (!((life4_43 != 0))) {
        lexicalValue1600_105_0 = spill1600_1;
        break lexical_join_105;
    }
    if (!(((net.minecraft.entity.passive.EntityHorse)(spill1600_1)).ai__Boolean())) {
        break lexical_join_104;
    }
    life5_65 = new net.minecraft.nbt.NBTTagList();
    life6_67 = 2;
    lexical_cycle_65: while (true) {
    lexical_join_98: {
    lexical_join_97: {
    if (!((life6_67 < ((moom.ws)(this.cs)).b__Int()))) {
        break lexical_join_100;
    }
    life7_77 = ((moom.ws)(this.cs)).a__xW(((int)(life6_67)));
    if (!((life4_43 != 0))) {
        break lexical_join_98;
    }
    spill1600_2 = life7_77;
    if (!((life4_43 != 0))) {
        lexicalValue1600_108_0 = spill1600_2;
        break lexical_join_108;
    }
    if (!((spill1600_2 != null))) {
        break lexical_join_97;
    }
    life8_93 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.nbt.NBTTagCompound)(life8_93)).a(((java.lang.String)("Slot")), ((byte)(((byte) life6_67))));
    ((net.minecraft.item.ItemStack)(life7_77)).a__yw(((net.minecraft.nbt.NBTTagCompound)(life8_93)));
    ((net.minecraft.nbt.NBTTagList)(life5_65)).a(((net.minecraft.nbt.NBTBase)(life8_93)));
    }
    life6_67 += 1;
    }
    if (!((life4_43 == 0))) { continue lexical_cycle_65; }
    break lexical_cycle_65;
    }
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Items")), ((net.minecraft.nbt.NBTBase)(life5_65)));
    }
    lexicalValue1600_105_0 = this;
    }
    lexicalValue1600_108_0 = ((moom.ws)(((net.minecraft.entity.passive.EntityHorse)(lexicalValue1600_105_0)).cs)).a__xW(((int)(1)));
    }
    if (!((life4_43 != 0))) {
        lexicalValue1600_126_0 = lexicalValue1600_108_0;
        break lexical_join_126;
    }
    if (!((lexicalValue1600_108_0 != null))) {
        break lexical_join_122;
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("ArmorItem")), ((net.minecraft.nbt.NBTBase)(((net.minecraft.item.ItemStack)(((moom.ws)(this.cs)).a__xW(((int)(1))))).a__yw(((net.minecraft.nbt.NBTTagCompound)(new net.minecraft.nbt.NBTTagCompound()))))));
    }
    lexicalValue1600_126_0 = ((moom.ws)(this.cs)).a__xW(((int)(0)));
    }
    if (!((lexicalValue1600_126_0 != null))) {
        break lexical_join_138;
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("SaddleItem")), ((net.minecraft.nbt.NBTBase)(((net.minecraft.item.ItemStack)(((moom.ws)(this.cs)).a__xW(((int)(0))))).a__yw(((net.minecraft.nbt.NBTTagCompound)(new net.minecraft.nbt.NBTTagCompound()))))));
    }
    return;
}


public float d__sourceReturn_f6c4892e39(float p0) {
return (this.cA + ((this.cz - this.cA) * p0));
}


public boolean d__sourceReturn_55ee61ea68(net.minecraft.entity.player.EntityPlayer p0) {
((net.minecraft.entity.passive.EntityHorse)(this)).b(((java.lang.String)(((java.util.UUID)(((net.minecraft.entity.player.EntityPlayer)(p0)).a__UUID())).toString())));
    ((net.minecraft.entity.passive.EntityHorse)(this)).n(((boolean)(true)));
    return ((1) != 0);
}


protected void d__Void() {
long local1 = (net.minecraft.entity.passive.EntityHorse.jb ^ 32364999261245L);
    super.d__Void();
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1969_3(9170, (4543184980227968341L ^ local1)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(0))))));
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1969_7(9419, (6094335737392745039L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1969_11(19775, (2510797534416610220L ^ local1)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(0))))));
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1969_15(30053, (851857698296142847L ^ local1)))), ((java.lang.Object)("")));
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1969_18(19929, (4816051165644497728L ^ local1)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(0))))));
    return;
}


public int d__Int() {
return (net.minecraft.entity.passive.EntityHorse.ch)[((net.minecraft.entity.passive.EntityHorse)(this)).v__sourceReturn_8abf5c6871()];
}


public void d(float p0, float p1) {
int forwardValue5274_25_0;
    int forwardValue5274_35_0;
    net.minecraft.entity.passive.EntityHorse forwardValue5274_49_0;
    int spill5274_0;
    int spill5274_1;
    net.minecraft.entity.passive.EntityHorse spill5274_2;
    long life3_3;
    int life5_5;
    int life6_31;
    net.minecraft.block.Block life7_85;
    moom.eJ life8_98;
    forward_join_92: {
    forward_join_49: {
    forward_join_48: {
    forward_join_35: {
    forward_join_25: {
    forward_join_17: {
    life3_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 53480927915158L);
    life5_5 = moom.vR.b();
    spill5274_0 = recovery.source.CarrierOps.fcmpl(((float)(p0)), ((float)(0x1.0p0f)));
    if (!((life5_5 != 0))) {
        forwardValue5274_25_0 = spill5274_0;
        break forward_join_25;
    }
    if (!((spill5274_0 > 0))) {
        break forward_join_17;
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).a(((java.lang.String)("mob.horse.land")), ((float)(0x1.99999ap-2f)), ((float)(0x1.0p0f)));
    }
    forwardValue5274_25_0 = moom.Dr.b__Int(((float)((((p0 * 0x1.0p-1f) - 0x1.8p1f) * p1))));
    }
    life6_31 = forwardValue5274_25_0;
    spill5274_1 = life6_31;
    if (!((life5_5 != 0))) {
        forwardValue5274_35_0 = spill5274_1;
        break forward_join_35;
    }
    if (!((spill5274_1 > 0))) {
        break forward_join_92;
    }
    forwardValue5274_35_0 = ((__sourceExactCall_21cc6ea71b9757(((net.minecraft.entity.passive.EntityHorse)(this)), ((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.i)), ((float)(((float) life6_31))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue5274_35_0);
    spill5274_2 = this;
    if (!((life5_5 != 0))) {
        forwardValue5274_49_0 = spill5274_2;
        break forward_join_49;
    }
    if (!((((net.minecraft.entity.passive.EntityHorse)(spill5274_2)).f != null))) {
        break forward_join_48;
    }
    __sourceExactCall_4b74618998ea07(((net.minecraft.entity.Entity)(this.f)), ((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.i)), ((float)(((float) life6_31))));
    }
    forwardValue5274_49_0 = this;
    }
    life7_85 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(((net.minecraft.entity.passive.EntityHorse)(forwardValue5274_49_0)).i)).a__fE(((moom.DT)(new moom.DT(this.n, ((this.o - 0x1.999999999999ap-3d) - ((double) this.y)), this.p)))))).a__ch();
    if (!((((net.minecraft.block.Block)(life7_85)).a__fn() != moom.fn.a))) {
        break forward_join_92;
    }
    if (!((!((net.minecraft.entity.passive.EntityHorse)(this)).f__Boolean()))) {
        break forward_join_92;
    }
    life8_98 = ((net.minecraft.block.Block)(life7_85)).H;
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(this)), ((java.lang.String)(((moom.eJ)(life8_98)).b__String())), ((float)((((moom.eJ)(life8_98)).a() * 0x1.0p-1f))), ((float)((((moom.eJ)(life8_98)).b() * 0x1.8p-1f))));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a(moom.sK p0) {
moom.sK forwardValue5243_14_0;
    moom.sK forwardValue5243_23_0;
    int forwardValue5243_56_0;
    int forwardValue5243_61_0;
    int forwardValue5243_65_0;
    int forwardValue5243_67_0;
    int forwardValue5243_69_0;
    moom.sK spill5243_0;
    boolean spill5243_1;
    boolean spill5243_2;
    int spill5243_3;
    int spill5243_4;
    int spill5243_5;
    long life2_3;
    int life4_5;
    net.minecraft.entity.passive.EntityHorse life5_34;
    int life6_56;
    int life7_59;
    forward_join_69: {
    forward_join_68: {
    forward_join_67: {
    forward_join_66: {
    forward_join_65: {
    forward_join_64: {
    forward_join_61: {
    forward_join_56: {
    forward_join_55: {
    forward_join_23: {
    forward_join_22: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 123019738301818L);
    life4_5 = moom.vR.c();
    spill5243_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue5243_14_0 = spill5243_0;
        break forward_join_14;
    }
    if (!((spill5243_0 == this))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue5243_14_0 = p0;
    }
    if (!((life4_5 == 0))) {
        forwardValue5243_23_0 = forwardValue5243_14_0;
        break forward_join_23;
    }
    if (!((((java.lang.Object)(forwardValue5243_14_0)).getClass() != ((java.lang.Object)(this)).getClass()))) {
        break forward_join_22;
    }
    return ((0) != 0);
    }
    forwardValue5243_23_0 = p0;
    }
    life5_34 = ((net.minecraft.entity.passive.EntityHorse)(forwardValue5243_23_0));
    spill5243_1 = ((net.minecraft.entity.passive.EntityHorse)(this)).av();
    if (!((life4_5 == 0))) {
        forwardValue5243_69_0 = ((spill5243_1) ? 1 : 0);
        break forward_join_69;
    }
    if (!(spill5243_1)) {
        break forward_join_68;
    }
    spill5243_2 = ((net.minecraft.entity.passive.EntityHorse)(life5_34)).av();
    if (!((life4_5 == 0))) {
        forwardValue5243_69_0 = ((spill5243_2) ? 1 : 0);
        break forward_join_69;
    }
    if (!(spill5243_2)) {
        break forward_join_68;
    }
    life6_56 = ((net.minecraft.entity.passive.EntityHorse)(this)).t();
    life7_59 = ((net.minecraft.entity.passive.EntityHorse)(life5_34)).t();
    spill5243_3 = life6_56;
    if (!((life4_5 == 0))) {
        forwardValue5243_65_0 = spill5243_3;
        break forward_join_65;
    }
    if (!((spill5243_3 != life7_59))) {
        break forward_join_64;
    }
    spill5243_4 = life6_56;
    if (!((life4_5 == 0))) {
        forwardValue5243_56_0 = spill5243_4;
        break forward_join_56;
    }
    if (!((spill5243_4 == 0))) {
        break forward_join_55;
    }
    spill5243_5 = life7_59;
    if (!((life4_5 == 0))) {
        forwardValue5243_65_0 = spill5243_5;
        break forward_join_65;
    }
    if (!((spill5243_5 != 1))) {
        break forward_join_64;
    }
    }
    forwardValue5243_56_0 = life6_56;
    }
    if (!((life4_5 == 0))) {
        forwardValue5243_61_0 = forwardValue5243_56_0;
        break forward_join_61;
    }
    if (!((forwardValue5243_56_0 == 1))) {
        break forward_join_66;
    }
    forwardValue5243_61_0 = life7_59;
    }
    if (!((life4_5 == 0))) {
        forwardValue5243_65_0 = forwardValue5243_61_0;
        break forward_join_65;
    }
    if (!((forwardValue5243_61_0 == 0))) {
        break forward_join_66;
    }
    }
    forwardValue5243_65_0 = 1;
    }
    forwardValue5243_67_0 = forwardValue5243_65_0;
    break forward_join_67;
    }
    forwardValue5243_67_0 = 0;
    }
    return ((forwardValue5243_67_0) != 0);
    }
    forwardValue5243_69_0 = 0;
    }
    return ((forwardValue5243_69_0) != 0);
}


public moom.sJ a(moom.sJ p0) {
int forwardValue5242_33_0;
    int forwardValue5242_42_0;
    int forwardValue5242_51_0;
    int forwardValue5242_53_0;
    int forwardValue5242_64_0;
    int forwardValue5242_89_0;
    int forwardValue5242_89_1;
    int forwardValue5242_109_0;
    int forwardValue5242_135_0;
    int forwardValue5242_135_1;
    int forwardValue5242_168_0;
    int forwardValue5242_168_1;
    int spill5242_0;
    int spill5242_1;
    int spill5242_2;
    int spill5242_3;
    int spill5242_4;
    int spill5242_5;
    int spill5242_6;
    int spill5242_7;
    int spill5242_8;
    long life2_3;
    net.minecraft.entity.passive.EntityHorse life5_6;
    net.minecraft.entity.passive.EntityHorse life6_13;
    int life7_16;
    int life4_17;
    int life8_20;
    int life9_22;
    int life10_97;
    int life11_114;
    int life12_159;
    double life10_246;
    double life12_266;
    double life14_286;
    forward_join_173: {
    forward_join_170: {
    forward_join_168: {
    forward_join_151: {
    forward_join_135: {
    forward_join_133: {
    forward_join_110: {
    forward_join_109: {
    forward_join_101: {
    forward_join_89: {
    forward_join_81: {
    forward_join_64: {
    forward_join_53: {
    forward_join_52: {
    forward_join_51: {
    forward_join_50: {
    forward_join_42: {
    forward_join_41: {
    forward_join_33: {
    forward_join_32: {
    life2_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 125305436256965L);
    life5_6 = ((net.minecraft.entity.passive.EntityHorse)(p0));
    spill5242_0 = moom.vR.c();
    life6_13 = new net.minecraft.entity.passive.EntityHorse(this.i);
    life7_16 = ((net.minecraft.entity.passive.EntityHorse)(this)).t();
    life4_17 = spill5242_0;
    life8_20 = ((net.minecraft.entity.passive.EntityHorse)(life5_6)).t();
    life9_22 = 0;
    spill5242_1 = life7_16;
    if (!((life4_17 == 0))) {
        forwardValue5242_33_0 = spill5242_1;
        break forward_join_33;
    }
    if (!((spill5242_1 == life8_20))) {
        break forward_join_32;
    }
    life9_22 = life7_16;
    if (!((life4_17 != 0))) {
        break forward_join_52;
    }
    }
    forwardValue5242_33_0 = life7_16;
    }
    if (!((life4_17 == 0))) {
        forwardValue5242_42_0 = forwardValue5242_33_0;
        break forward_join_42;
    }
    if (!((forwardValue5242_33_0 == 0))) {
        break forward_join_41;
    }
    spill5242_2 = life8_20;
    if (!((life4_17 == 0))) {
        forwardValue5242_51_0 = spill5242_2;
        break forward_join_51;
    }
    if (!((spill5242_2 != 1))) {
        break forward_join_50;
    }
    }
    forwardValue5242_42_0 = life7_16;
    }
    if (!((life4_17 == 0))) {
        forwardValue5242_53_0 = forwardValue5242_42_0;
        break forward_join_53;
    }
    if (!((forwardValue5242_42_0 == 1))) {
        break forward_join_52;
    }
    spill5242_3 = life8_20;
    if (!((life4_17 == 0))) {
        forwardValue5242_53_0 = spill5242_3;
        break forward_join_53;
    }
    if (!((spill5242_3 == 0))) {
        break forward_join_52;
    }
    }
    forwardValue5242_51_0 = 2;
    }
    life9_22 = forwardValue5242_51_0;
    }
    forwardValue5242_53_0 = life9_22;
    }
    if (!((life4_17 == 0))) {
        forwardValue5242_64_0 = forwardValue5242_53_0;
        break forward_join_64;
    }
    if (!((forwardValue5242_53_0 == 0))) {
        break forward_join_173;
    }
    forwardValue5242_64_0 = ((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_a7918f27299c_invokedynamic5242_7(537, (6119826114940693114L ^ life2_3)))));
    }
    life10_97 = forwardValue5242_64_0;
    spill5242_4 = life10_97;
    spill5242_5 = 4;
    if (!((life4_17 == 0))) {
        forwardValue5242_89_0 = spill5242_4;
        forwardValue5242_89_1 = spill5242_5;
        break forward_join_89;
    }
    if (!((spill5242_4 < spill5242_5))) {
        break forward_join_81;
    }
    life11_114 = (((net.minecraft.entity.passive.EntityHorse)(this)).u__sourceReturn_8abf5c6871() & __sourceIntrinsic_a7918f27299c_invokedynamic5242_10(5056, (3118630421622324106L ^ life2_3)));
    if (!((life4_17 != 0))) {
        break forward_join_110;
    }
    }
    spill5242_6 = life10_97;
    if (!((life4_17 == 0))) {
        forwardValue5242_109_0 = spill5242_6;
        break forward_join_109;
    }
    forwardValue5242_89_0 = spill5242_6;
    forwardValue5242_89_1 = __sourceIntrinsic_a7918f27299c_invokedynamic5242_11(25403, (6035833238006270792L ^ life2_3));
    }
    if (!((forwardValue5242_89_0 < forwardValue5242_89_1))) {
        break forward_join_101;
    }
    life11_114 = (((net.minecraft.entity.passive.EntityHorse)(life5_6)).u__sourceReturn_8abf5c6871() & __sourceIntrinsic_a7918f27299c_invokedynamic5242_13(5056, (3118630421622324106L ^ life2_3)));
    if (!((life4_17 != 0))) {
        break forward_join_110;
    }
    }
    forwardValue5242_109_0 = ((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_a7918f27299c_invokedynamic5242_15(18074, (2532186142724435702L ^ life2_3)))));
    }
    life11_114 = forwardValue5242_109_0;
    }
    life12_159 = ((java.util.Random)(this.ah)).nextInt(((int)(5)));
    spill5242_7 = life12_159;
    spill5242_8 = 2;
    if (!((life4_17 == 0))) {
        forwardValue5242_135_0 = spill5242_7;
        forwardValue5242_135_1 = spill5242_8;
        break forward_join_135;
    }
    if (!((spill5242_7 < spill5242_8))) {
        break forward_join_133;
    }
    life11_114 = (life11_114 | (((net.minecraft.entity.passive.EntityHorse)(this)).u__sourceReturn_8abf5c6871() & __sourceIntrinsic_a7918f27299c_invokedynamic5242_20(23366, (8304721990847443714L ^ life2_3))));
    if (!((life4_17 != 0))) {
        break forward_join_170;
    }
    }
    forwardValue5242_135_0 = life12_159;
    forwardValue5242_135_1 = 4;
    }
    if (!((life4_17 == 0))) {
        forwardValue5242_168_0 = forwardValue5242_135_0;
        forwardValue5242_168_1 = forwardValue5242_135_1;
        break forward_join_168;
    }
    if (!((forwardValue5242_135_0 < forwardValue5242_135_1))) {
        break forward_join_151;
    }
    life11_114 = (life11_114 | (((net.minecraft.entity.passive.EntityHorse)(life5_6)).u__sourceReturn_8abf5c6871() & __sourceIntrinsic_a7918f27299c_invokedynamic5242_22(20649, (8665589059764271303L ^ life2_3))));
    if (!((life4_17 != 0))) {
        break forward_join_170;
    }
    }
    forwardValue5242_168_0 = life11_114;
    forwardValue5242_168_1 = ((((java.util.Random)(this.ah)).nextInt(((int)(5))) << __sourceIntrinsic_a7918f27299c_invokedynamic5242_25(25403, (6035833238006270792L ^ life2_3))) & __sourceIntrinsic_a7918f27299c_invokedynamic5242_26(20649, (8665589059764271303L ^ life2_3)));
    }
    life11_114 = (forwardValue5242_168_0 | forwardValue5242_168_1);
    }
    ((net.minecraft.entity.passive.EntityHorse)(life6_13)).o(((int)(life11_114)));
    }
    ((net.minecraft.entity.passive.EntityHorse)(life6_13)).n(((int)(life9_22)));
    life10_246 = ((((net.minecraft.entity.ai.attributes.IAttributeInstance)(__sourceExactCall_dba86182f7a600(((net.minecraft.entity.passive.EntityHorse)(this)), ((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b))))).a() + ((net.minecraft.entity.ai.attributes.IAttributeInstance)(__sourceExactCall_78faa497e49b2d(((moom.sJ)(p0)), ((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b))))).a()) + ((double) ((net.minecraft.entity.passive.EntityHorse)(this)).n()));
    __sourceExactCall_d2390726a67678(((net.minecraft.entity.ai.attributes.IAttributeInstance)(__sourceExactCall_dba86182f7a600(((net.minecraft.entity.passive.EntityHorse)(life6_13)), ((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b))))), ((double)((life10_246 / 0x1.8p1d))));
    life12_266 = ((((net.minecraft.entity.ai.attributes.IAttributeInstance)(__sourceExactCall_dba86182f7a600(((net.minecraft.entity.passive.EntityHorse)(this)), ((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.passive.EntityHorse.ce))))).a() + ((net.minecraft.entity.ai.attributes.IAttributeInstance)(__sourceExactCall_78faa497e49b2d(((moom.sJ)(p0)), ((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.passive.EntityHorse.ce))))).a()) + ((net.minecraft.entity.passive.EntityHorse)(this)).b__sourceReturn_fedcb3e4d3());
    __sourceExactCall_d2390726a67678(((net.minecraft.entity.ai.attributes.IAttributeInstance)(__sourceExactCall_dba86182f7a600(((net.minecraft.entity.passive.EntityHorse)(life6_13)), ((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.passive.EntityHorse.ce))))), ((double)((life12_266 / 0x1.8p1d))));
    life14_286 = ((((net.minecraft.entity.ai.attributes.IAttributeInstance)(__sourceExactCall_dba86182f7a600(((net.minecraft.entity.passive.EntityHorse)(this)), ((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).a() + ((net.minecraft.entity.ai.attributes.IAttributeInstance)(__sourceExactCall_78faa497e49b2d(((moom.sJ)(p0)), ((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).a()) + ((net.minecraft.entity.passive.EntityHorse)(this)).c__sourceReturn_fedcb3e4d3());
    __sourceExactCall_d2390726a67678(((net.minecraft.entity.ai.attributes.IAttributeInstance)(__sourceExactCall_dba86182f7a600(((net.minecraft.entity.passive.EntityHorse)(life6_13)), ((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))), ((double)((life14_286 / 0x1.8p1d))));
    return life6_13;
}


public net.minecraft.entity.IEntityLivingData a(moom.Eh p0, net.minecraft.entity.IEntityLivingData p1) {
int forestValue26_55_0;
    int forestValue26_70_0;
    int forestValue26_115_0;
    int forestValue26_123_0;
    int forestValue26_123_1;
    int forestValue26_134_0;
    int forestValue26_167_0;
    int forestValue26_167_1;
    int spill26_0;
    int spill26_1;
    int spill26_2;
    int spill26_3;
    int spill26_4;
    int spill26_5;
    int spill26_6;
    long life3_3;
    net.minecraft.entity.IEntityLivingData life2_9;
    int life6_11;
    int life7_13;
    int life5_14;
    int life6_26;
    int life8_80;
    int life9_85;
    forest_join_181: {
    forest_join_176: {
    forest_join_167: {
    forest_join_160: {
    forest_join_150: {
    forest_join_148: {
    forest_join_143: {
    forest_join_134: {
    forest_join_123: {
    forest_join_115: {
    forest_join_114: {
    forest_join_94: {
    forest_join_88: {
    forest_join_70: {
    forest_join_62: {
    forest_join_55: {
    forest_join_47: {
    life3_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 76067877791841L);
    spill26_0 = moom.vR.b();
    life2_9 = super.a(((moom.Eh)(p0)), ((net.minecraft.entity.IEntityLivingData)(p1)));
    life6_11 = 0;
    life7_13 = 0;
    life5_14 = spill26_0;
    spill26_1 = ((life2_9 instanceof moom.vQ) ? 1 : 0);
    if (!((life5_14 != 0))) {
        forestValue26_55_0 = spill26_1;
        break forest_join_55;
    }
    if (!((spill26_1 != 0))) {
        break forest_join_47;
    }
    life6_26 = ((moom.vQ)(((moom.vQ)(life2_9)))).a;
    life7_13 = ((((moom.vQ)(((moom.vQ)(life2_9)))).b & __sourceIntrinsic_07d6d39f9236_invokedynamic26_8(5056, (3118651484608653614L ^ life3_3))) | (((java.util.Random)(this.ah)).nextInt(((int)(5))) << __sourceIntrinsic_07d6d39f9236_invokedynamic26_11(25403, (6035846604132293100L ^ life3_3))));
    if (!((life5_14 == 0))) {
        break forest_join_94;
    }
    }
    forestValue26_55_0 = ((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_07d6d39f9236_invokedynamic26_13(20811, (9198096872380541856L ^ life3_3)))));
    }
    if (!((life5_14 != 0))) {
        forestValue26_70_0 = forestValue26_55_0;
        break forest_join_70;
    }
    if (!((forestValue26_55_0 == 0))) {
        break forest_join_62;
    }
    life6_26 = 1;
    if (!((life5_14 == 0))) {
        break forest_join_88;
    }
    }
    forestValue26_70_0 = ((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_07d6d39f9236_invokedynamic26_16(18074, (2532172226834218066L ^ life3_3)))));
    }
    life8_80 = forestValue26_70_0;
    life9_85 = ((java.util.Random)(this.ah)).nextInt(((int)(5)));
    life6_26 = 0;
    life7_13 = (life8_80 | (life9_85 << __sourceIntrinsic_07d6d39f9236_invokedynamic26_20(25403, (6035846604132293100L ^ life3_3))));
    }
    life2_9 = new moom.vQ(life6_26, life7_13);
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).n(((int)(life6_26)));
    ((net.minecraft.entity.passive.EntityHorse)(this)).o(((int)(life7_13)));
    spill26_2 = ((java.util.Random)(this.ah)).nextInt(((int)(5)));
    if (!((life5_14 != 0))) {
        forestValue26_115_0 = spill26_2;
        break forest_join_115;
    }
    if (!((spill26_2 == 0))) {
        break forest_join_114;
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).l(((int)(__sourceIntrinsic_07d6d39f9236_invokedynamic26_25(14592, (1419771959975560180L ^ life3_3)))));
    }
    forestValue26_115_0 = life6_26;
    }
    spill26_3 = 4;
    if (!((life5_14 != 0))) {
        forestValue26_123_0 = forestValue26_115_0;
        forestValue26_123_1 = spill26_3;
        break forest_join_123;
    }
    if (!((forestValue26_115_0 != spill26_3))) {
        break forest_join_150;
    }
    spill26_4 = life6_26;
    if (!((life5_14 != 0))) {
        forestValue26_134_0 = spill26_4;
        break forest_join_134;
    }
    forestValue26_123_0 = spill26_4;
    forestValue26_123_1 = 3;
    }
    if (!((forestValue26_123_0 != forestValue26_123_1))) {
        break forest_join_150;
    }
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.passive.EntityHorse)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b))))).a(((double)(((double) ((net.minecraft.entity.passive.EntityHorse)(this)).n()))));
    if (!((life5_14 != 0))) {
        break forest_join_148;
    }
    forestValue26_134_0 = life6_26;
    }
    if (!((forestValue26_134_0 == 0))) {
        break forest_join_143;
    }
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.passive.EntityHorse)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).a(((double)(((net.minecraft.entity.passive.EntityHorse)(this)).c__sourceReturn_fedcb3e4d3())));
    if (!((life5_14 == 0))) {
        break forest_join_160;
    }
    }
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.passive.EntityHorse)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).a(((double)(0x1.666666p-3d)));
    }
    if (!((life5_14 == 0))) {
        break forest_join_160;
    }
    }
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.passive.EntityHorse)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b))))).a(((double)(0x1.ep3d)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.passive.EntityHorse)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).a(((double)(0x1.99999ap-3d)));
    }
    spill26_5 = life6_26;
    spill26_6 = 2;
    if (!((life5_14 != 0))) {
        forestValue26_167_0 = spill26_5;
        forestValue26_167_1 = spill26_6;
        break forest_join_167;
    }
    if (!((spill26_5 != spill26_6))) {
        break forest_join_176;
    }
    forestValue26_167_0 = life6_26;
    forestValue26_167_1 = 1;
    }
    if (!((forestValue26_167_0 != forestValue26_167_1))) {
        break forest_join_176;
    }
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.passive.EntityHorse)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.passive.EntityHorse.ce))))).a(((double)(((net.minecraft.entity.passive.EntityHorse)(this)).b__sourceReturn_fedcb3e4d3())));
    if (!((life5_14 == 0))) {
        break forest_join_181;
    }
    }
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.passive.EntityHorse)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.passive.EntityHorse.ce))))).a(((double)(0x1.0p-1d)));
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).d(((float)(((net.minecraft.entity.passive.EntityHorse)(this)).a())));
    return life2_9;
}


public void a__sourceReturn_7889e8f768(net.minecraft.util.DamageSource p0) {
net.minecraft.entity.passive.EntityHorse forwardValue5248_16_0;
    int spill5248_0;
    net.minecraft.entity.passive.EntityHorse spill5248_1;
    long life2_3;
    int life4_8;
    forward_join_17: {
    forward_join_16: {
    life2_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 86008731803925L);
    spill5248_0 = moom.vR.c();
    super.a__sourceReturn_7889e8f768(((net.minecraft.util.DamageSource)(p0)));
    life4_8 = spill5248_0;
    spill5248_1 = this;
    if (!((life4_8 == 0))) {
        forwardValue5248_16_0 = spill5248_1;
        break forward_join_16;
    }
    if (!((!((net.minecraft.world.World)(((net.minecraft.entity.passive.EntityHorse)(spill5248_1)).i)).G))) {
        break forward_join_17;
    }
    forwardValue5248_16_0 = this;
    }
    ((net.minecraft.entity.passive.EntityHorse)(forwardValue5248_16_0)).aj();
    }
    return;
}


public boolean a__Boolean(net.minecraft.entity.player.EntityPlayer p0) {
net.minecraft.item.ItemStack forwardValue5250_15_0;
    int forwardValue5250_36_0;
    int forwardValue5250_58_0;
    net.minecraft.entity.Entity forwardValue5250_63_0;
    net.minecraft.entity.passive.EntityHorse forwardValue5250_65_0;
    net.minecraft.item.Item forwardValue5250_92_0;
    net.minecraft.item.Item forwardValue5250_92_1;
    net.minecraft.item.Item forwardValue5250_102_0;
    net.minecraft.item.Item forwardValue5250_102_1;
    int forwardValue5250_122_0;
    int forwardValue5250_124_0;
    net.minecraft.item.Item forwardValue5250_161_0;
    net.minecraft.item.Item forwardValue5250_161_1;
    net.minecraft.item.Item forwardValue5250_176_0;
    net.minecraft.item.Item forwardValue5250_193_0;
    net.minecraft.item.Item forwardValue5250_212_0;
    net.minecraft.item.Item forwardValue5250_212_1;
    net.minecraft.item.Item forwardValue5250_245_0;
    net.minecraft.item.Item forwardValue5250_245_1;
    int forwardValue5250_280_0;
    int forwardValue5250_296_0;
    int forwardValue5250_309_0;
    int forwardValue5250_322_0;
    int forwardValue5250_334_0;
    int forwardValue5250_341_0;
    net.minecraft.item.ItemStack forwardValue5250_353_0;
    int forwardValue5250_364_0;
    int forwardValue5250_366_0;
    int forwardValue5250_407_0;
    int forwardValue5250_430_0;
    int forwardValue5250_457_0;
    int forwardValue5250_460_0;
    net.minecraft.item.ItemStack forwardValue5250_473_0;
    int forwardValue5250_485_0;
    net.minecraft.entity.passive.EntityHorse forwardValue5250_487_0;
    int forwardValue5250_489_0;
    int spill5250_0;
    net.minecraft.item.ItemStack spill5250_1;
    boolean spill5250_2;
    boolean spill5250_3;
    boolean spill5250_4;
    boolean spill5250_5;
    net.minecraft.entity.passive.EntityHorse spill5250_6;
    net.minecraft.entity.passive.EntityHorse spill5250_7;
    boolean spill5250_8;
    net.minecraft.item.Item spill5250_9;
    net.minecraft.item.Item spill5250_10;
    int spill5250_11;
    boolean spill5250_12;
    boolean spill5250_13;
    net.minecraft.item.Item spill5250_14;
    net.minecraft.item.Item spill5250_15;
    net.minecraft.item.Item spill5250_16;
    net.minecraft.item.Item spill5250_17;
    boolean spill5250_18;
    int spill5250_19;
    boolean spill5250_20;
    int spill5250_21;
    int spill5250_22;
    int spill5250_23;
    int spill5250_24;
    boolean spill5250_25;
    int spill5250_26;
    net.minecraft.item.ItemStack spill5250_27;
    boolean spill5250_28;
    boolean spill5250_29;
    boolean spill5250_30;
    boolean spill5250_31;
    boolean spill5250_32;
    boolean spill5250_33;
    int spill5250_34;
    net.minecraft.entity.passive.EntityHorse spill5250_35;
    net.minecraft.item.ItemStack spill5250_36;
    boolean spill5250_37;
    long life2_3;
    net.minecraft.item.ItemStack life5_8;
    int life4_9;
    int life6_113;
    int life7_123;
    float life7_210;
    int life8_212;
    int life9_214;
    forward_join_489: {
    forward_join_487: {
    forward_join_486: {
    forward_join_485: {
    forward_join_481: {
    forward_join_473: {
    forward_join_460: {
    forward_join_458: {
    forward_join_457: {
    forward_join_456: {
    forward_join_430: {
    forward_join_429: {
    forward_join_407: {
    forward_join_406: {
    forward_join_366: {
    forward_join_365: {
    forward_join_364: {
    forward_join_361: {
    forward_join_353: {
    forward_join_341: {
    forward_join_339: {
    forward_join_334: {
    forward_join_333: {
    forward_join_322: {
    forward_join_321: {
    forward_join_309: {
    forward_join_308: {
    forward_join_296: {
    forward_join_294: {
    forward_join_280: {
    forward_join_275: {
    forward_join_245: {
    forward_join_242: {
    forward_join_212: {
    forward_join_209: {
    forward_join_193: {
    forward_join_191: {
    forward_join_176: {
    forward_join_174: {
    forward_join_161: {
    forward_join_156: {
    forward_join_124: {
    forward_join_123: {
    forward_join_122: {
    forward_join_118: {
    forward_join_105: {
    forward_join_102: {
    forward_join_99: {
    forward_join_92: {
    forward_join_89: {
    forward_join_68: {
    forward_join_65: {
    forward_join_63: {
    forward_join_58: {
    forward_join_54: {
    forward_join_36: {
    forward_join_34: {
    forward_join_22: {
    forward_join_15: {
    life2_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 82056078888662L);
    spill5250_0 = moom.vR.c();
    life5_8 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a__xW();
    life4_9 = spill5250_0;
    spill5250_1 = life5_8;
    if (!((life4_9 == 0))) {
        forwardValue5250_15_0 = spill5250_1;
        break forward_join_15;
    }
    if (!((spill5250_1 != null))) {
        break forward_join_22;
    }
    forwardValue5250_15_0 = life5_8;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue5250_15_0)).a__wQ() == net.minecraft.init.Items.by))) {
        break forward_join_22;
    }
    return super.a__Boolean(((net.minecraft.entity.player.EntityPlayer)(p0)));
    }
    spill5250_2 = ((net.minecraft.entity.passive.EntityHorse)(this)).af__Boolean();
    if (!((life4_9 == 0))) {
        forwardValue5250_36_0 = ((spill5250_2) ? 1 : 0);
        break forward_join_36;
    }
    if (!((!spill5250_2))) {
        break forward_join_34;
    }
    spill5250_3 = ((net.minecraft.entity.passive.EntityHorse)(this)).at();
    if (!((life4_9 == 0))) {
        forwardValue5250_36_0 = ((spill5250_3) ? 1 : 0);
        break forward_join_36;
    }
    if (!(spill5250_3)) {
        break forward_join_34;
    }
    return ((0) != 0);
    }
    forwardValue5250_36_0 = ((((net.minecraft.entity.passive.EntityHorse)(this)).af__Boolean()) ? 1 : 0);
    }
    if (!((life4_9 == 0))) {
        forwardValue5250_58_0 = forwardValue5250_36_0;
        break forward_join_58;
    }
    if (!((forwardValue5250_36_0 != 0))) {
        break forward_join_54;
    }
    spill5250_4 = ((net.minecraft.entity.passive.EntityHorse)(this)).ae__Boolean();
    if (!((life4_9 == 0))) {
        forwardValue5250_58_0 = ((spill5250_4) ? 1 : 0);
        break forward_join_58;
    }
    if (!(spill5250_4)) {
        break forward_join_54;
    }
    spill5250_5 = ((net.minecraft.entity.player.EntityPlayer)(p0)).t__Boolean();
    if (!((life4_9 == 0))) {
        forwardValue5250_58_0 = ((spill5250_5) ? 1 : 0);
        break forward_join_58;
    }
    if (!(spill5250_5)) {
        break forward_join_54;
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).b(((net.minecraft.entity.player.EntityPlayer)(p0)));
    return ((1) != 0);
    }
    spill5250_6 = this;
    if (!((life4_9 == 0))) {
        forwardValue5250_63_0 = spill5250_6;
        break forward_join_63;
    }
    forwardValue5250_58_0 = ((((net.minecraft.entity.passive.EntityHorse)(spill5250_6)).ag__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue5250_58_0 != 0))) {
        break forward_join_68;
    }
    spill5250_7 = this;
    if (!((life4_9 == 0))) {
        forwardValue5250_65_0 = spill5250_7;
        break forward_join_65;
    }
    forwardValue5250_63_0 = ((net.minecraft.entity.passive.EntityHorse)(spill5250_7)).f;
    }
    if (!((forwardValue5250_63_0 != null))) {
        break forward_join_68;
    }
    forwardValue5250_65_0 = this;
    }
    return __sourceIntrinsic_d6a7991b4c91_call5250_23(forwardValue5250_65_0, p0);
    }
    if (!((life5_8 != null))) {
        break forward_join_458;
    }
    life6_113 = 0;
    spill5250_8 = ((net.minecraft.entity.passive.EntityHorse)(this)).ar();
    if (!((life4_9 == 0))) {
        forwardValue5250_124_0 = ((spill5250_8) ? 1 : 0);
        break forward_join_124;
    }
    if (!(spill5250_8)) {
        break forward_join_123;
    }
    life7_123 = -1;
    spill5250_9 = ((net.minecraft.item.ItemStack)(life5_8)).a__wQ();
    spill5250_10 = net.minecraft.init.Items.bZ;
    if (!((life4_9 == 0))) {
        forwardValue5250_92_0 = spill5250_9;
        forwardValue5250_92_1 = spill5250_10;
        break forward_join_92;
    }
    if (!((spill5250_9 == spill5250_10))) {
        break forward_join_89;
    }
    life7_123 = 1;
    if (!((life4_9 != 0))) {
        break forward_join_105;
    }
    }
    forwardValue5250_92_0 = ((net.minecraft.item.ItemStack)(life5_8)).a__wQ();
    forwardValue5250_92_1 = net.minecraft.init.Items.b0;
    }
    if (!((life4_9 == 0))) {
        forwardValue5250_102_0 = forwardValue5250_92_0;
        forwardValue5250_102_1 = forwardValue5250_92_1;
        break forward_join_102;
    }
    if (!((forwardValue5250_92_0 == forwardValue5250_92_1))) {
        break forward_join_99;
    }
    life7_123 = 2;
    if (!((life4_9 != 0))) {
        break forward_join_105;
    }
    }
    forwardValue5250_102_0 = ((net.minecraft.item.ItemStack)(life5_8)).a__wQ();
    forwardValue5250_102_1 = net.minecraft.init.Items.b1;
    }
    if (!((forwardValue5250_102_0 == forwardValue5250_102_1))) {
        break forward_join_105;
    }
    life7_123 = 3;
    }
    spill5250_11 = life7_123;
    if (!((life4_9 == 0))) {
        forwardValue5250_124_0 = spill5250_11;
        break forward_join_124;
    }
    if (!((spill5250_11 >= 0))) {
        break forward_join_123;
    }
    spill5250_12 = ((net.minecraft.entity.passive.EntityHorse)(this)).af__Boolean();
    if (!((life4_9 == 0))) {
        forwardValue5250_122_0 = ((spill5250_12) ? 1 : 0);
        break forward_join_122;
    }
    if (!((!spill5250_12))) {
        break forward_join_118;
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).ai();
    return ((1) != 0);
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).b(((net.minecraft.entity.player.EntityPlayer)(p0)));
    forwardValue5250_122_0 = 1;
    }
    return ((forwardValue5250_122_0) != 0);
    }
    forwardValue5250_124_0 = life6_113;
    }
    if (!((life4_9 == 0))) {
        forwardValue5250_341_0 = forwardValue5250_124_0;
        break forward_join_341;
    }
    if (!((forwardValue5250_124_0 == 0))) {
        break forward_join_339;
    }
    spill5250_13 = ((net.minecraft.entity.passive.EntityHorse)(this)).at();
    if (!((life4_9 == 0))) {
        forwardValue5250_341_0 = ((spill5250_13) ? 1 : 0);
        break forward_join_341;
    }
    if (!((!spill5250_13))) {
        break forward_join_339;
    }
    life7_210 = 0x0.0p0f;
    life8_212 = 0;
    life9_214 = 0;
    spill5250_14 = ((net.minecraft.item.ItemStack)(life5_8)).a__wQ();
    spill5250_15 = net.minecraft.init.Items.O;
    if (!((life4_9 == 0))) {
        forwardValue5250_161_0 = spill5250_14;
        forwardValue5250_161_1 = spill5250_15;
        break forward_join_161;
    }
    if (!((spill5250_14 == spill5250_15))) {
        break forward_join_156;
    }
    life7_210 = 0x1.0p1f;
    life8_212 = __sourceIntrinsic_d6a7991b4c91_invokedynamic5250_42(950, (2422171979993145303L ^ life2_3));
    life9_214 = 3;
    if (!((life4_9 != 0))) {
        break forward_join_275;
    }
    }
    spill5250_16 = ((net.minecraft.item.ItemStack)(life5_8)).a__wQ();
    if (!((life4_9 == 0))) {
        forwardValue5250_176_0 = spill5250_16;
        break forward_join_176;
    }
    forwardValue5250_161_0 = spill5250_16;
    forwardValue5250_161_1 = net.minecraft.init.Items.aY;
    }
    if (!((forwardValue5250_161_0 == forwardValue5250_161_1))) {
        break forward_join_174;
    }
    life7_210 = 0x1.0p0f;
    life8_212 = __sourceIntrinsic_d6a7991b4c91_invokedynamic5250_45(22710, (8144518295368959171L ^ life2_3));
    life9_214 = 3;
    if (!((life4_9 != 0))) {
        break forward_join_275;
    }
    }
    forwardValue5250_176_0 = ((net.minecraft.item.ItemStack)(life5_8)).a__wQ();
    }
    if (!((life4_9 == 0))) {
        forwardValue5250_193_0 = forwardValue5250_176_0;
        break forward_join_193;
    }
    if (!((__sourceExactCall_3c55b55d648265(((net.minecraft.item.Item)(forwardValue5250_176_0))) == net.minecraft.init.Blocks.cb))) {
        break forward_join_191;
    }
    life7_210 = 0x1.4p4f;
    life8_212 = __sourceIntrinsic_d6a7991b4c91_invokedynamic5250_49(14833, (2416359257495037325L ^ life2_3));
    if (!((life4_9 != 0))) {
        break forward_join_275;
    }
    }
    forwardValue5250_193_0 = ((net.minecraft.item.ItemStack)(life5_8)).a__wQ();
    }
    spill5250_17 = net.minecraft.init.Items.e;
    if (!((life4_9 == 0))) {
        forwardValue5250_212_0 = forwardValue5250_193_0;
        forwardValue5250_212_1 = spill5250_17;
        break forward_join_212;
    }
    if (!((forwardValue5250_193_0 == spill5250_17))) {
        break forward_join_209;
    }
    life7_210 = 0x1.8p1f;
    life8_212 = __sourceIntrinsic_d6a7991b4c91_invokedynamic5250_52(29225, (6636978842835431026L ^ life2_3));
    life9_214 = 3;
    if (!((life4_9 != 0))) {
        break forward_join_275;
    }
    }
    forwardValue5250_212_0 = ((net.minecraft.item.ItemStack)(life5_8)).a__wQ();
    forwardValue5250_212_1 = net.minecraft.init.Items.bL;
    }
    if (!((life4_9 == 0))) {
        forwardValue5250_245_0 = forwardValue5250_212_0;
        forwardValue5250_245_1 = forwardValue5250_212_1;
        break forward_join_245;
    }
    if (!((forwardValue5250_212_0 == forwardValue5250_212_1))) {
        break forward_join_242;
    }
    life7_210 = 0x1.0p2f;
    life8_212 = __sourceIntrinsic_d6a7991b4c91_invokedynamic5250_55(12921, (6239310336973532719L ^ life2_3));
    life9_214 = 5;
    spill5250_18 = ((net.minecraft.entity.passive.EntityHorse)(this)).af__Boolean();
    if (!((life4_9 == 0))) {
        forwardValue5250_280_0 = ((spill5250_18) ? 1 : 0);
        break forward_join_280;
    }
    if (!(spill5250_18)) {
        break forward_join_275;
    }
    spill5250_19 = ((net.minecraft.entity.passive.EntityHorse)(this)).q__sourceReturn_8abf5c6871();
    if (!((life4_9 == 0))) {
        forwardValue5250_280_0 = spill5250_19;
        break forward_join_280;
    }
    if (!((spill5250_19 == 0))) {
        break forward_join_275;
    }
    life6_113 = 1;
    ((net.minecraft.entity.passive.EntityHorse)(this)).a__Void(((net.minecraft.entity.player.EntityPlayer)(p0)));
    if (!((life4_9 != 0))) {
        break forward_join_275;
    }
    }
    forwardValue5250_245_0 = ((net.minecraft.item.ItemStack)(life5_8)).a__wQ();
    forwardValue5250_245_1 = net.minecraft.init.Items.ao;
    }
    if (!((forwardValue5250_245_0 == forwardValue5250_245_1))) {
        break forward_join_275;
    }
    life7_210 = 0x1.4p3f;
    life8_212 = __sourceIntrinsic_d6a7991b4c91_invokedynamic5250_62(17275, (6168819797543591702L ^ life2_3));
    life9_214 = __sourceIntrinsic_d6a7991b4c91_invokedynamic5250_63(20811, (9198105057422544151L ^ life2_3));
    spill5250_20 = ((net.minecraft.entity.passive.EntityHorse)(this)).af__Boolean();
    if (!((life4_9 == 0))) {
        forwardValue5250_280_0 = ((spill5250_20) ? 1 : 0);
        break forward_join_280;
    }
    if (!(spill5250_20)) {
        break forward_join_275;
    }
    spill5250_21 = ((net.minecraft.entity.passive.EntityHorse)(this)).q__sourceReturn_8abf5c6871();
    if (!((life4_9 == 0))) {
        forwardValue5250_280_0 = spill5250_21;
        break forward_join_280;
    }
    if (!((spill5250_21 == 0))) {
        break forward_join_275;
    }
    life6_113 = 1;
    ((net.minecraft.entity.passive.EntityHorse)(this)).a__Void(((net.minecraft.entity.player.EntityPlayer)(p0)));
    }
    forwardValue5250_280_0 = recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.entity.passive.EntityHorse)(this)).b__sourceReturn_bc607678b6())), ((float)(((net.minecraft.entity.passive.EntityHorse)(this)).a())));
    }
    if (!((life4_9 == 0))) {
        forwardValue5250_296_0 = forwardValue5250_280_0;
        break forward_join_296;
    }
    if (!((forwardValue5250_280_0 < 0))) {
        break forward_join_294;
    }
    spill5250_22 = recovery.source.CarrierOps.fcmpl(((float)(life7_210)), ((float)(0x0.0p0f)));
    if (!((life4_9 == 0))) {
        forwardValue5250_296_0 = spill5250_22;
        break forward_join_296;
    }
    if (!((spill5250_22 > 0))) {
        break forward_join_294;
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).c(((float)(life7_210)));
    life6_113 = 1;
    }
    forwardValue5250_296_0 = ((((net.minecraft.entity.passive.EntityHorse)(this)).ae__Boolean()) ? 1 : 0);
    }
    if (!((life4_9 == 0))) {
        forwardValue5250_309_0 = forwardValue5250_296_0;
        break forward_join_309;
    }
    if (!((forwardValue5250_296_0 == 0))) {
        break forward_join_308;
    }
    spill5250_23 = life8_212;
    if (!((life4_9 == 0))) {
        forwardValue5250_309_0 = spill5250_23;
        break forward_join_309;
    }
    if (!((spill5250_23 > 0))) {
        break forward_join_308;
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).k(((int)(life8_212)));
    life6_113 = 1;
    }
    forwardValue5250_309_0 = life9_214;
    }
    if (!((life4_9 == 0))) {
        forwardValue5250_334_0 = forwardValue5250_309_0;
        break forward_join_334;
    }
    if (!((forwardValue5250_309_0 > 0))) {
        break forward_join_333;
    }
    spill5250_24 = life6_113;
    if (!((life4_9 == 0))) {
        forwardValue5250_322_0 = spill5250_24;
        break forward_join_322;
    }
    if (!((spill5250_24 == 0))) {
        break forward_join_321;
    }
    spill5250_25 = ((net.minecraft.entity.passive.EntityHorse)(this)).af__Boolean();
    if (!((life4_9 == 0))) {
        forwardValue5250_334_0 = ((spill5250_25) ? 1 : 0);
        break forward_join_334;
    }
    if (!((!spill5250_25))) {
        break forward_join_333;
    }
    }
    forwardValue5250_322_0 = life9_214;
    }
    if (!((life4_9 == 0))) {
        forwardValue5250_334_0 = forwardValue5250_322_0;
        break forward_join_334;
    }
    if (!((forwardValue5250_322_0 < ((net.minecraft.entity.passive.EntityHorse)(this)).y__sourceReturn_8abf5c6871()))) {
        break forward_join_333;
    }
    life6_113 = 1;
    ((net.minecraft.entity.passive.EntityHorse)(this)).b__sourceReturn_0f7a48eca2(((int)(life9_214)));
    }
    forwardValue5250_334_0 = life6_113;
    }
    if (!((life4_9 == 0))) {
        forwardValue5250_341_0 = forwardValue5250_334_0;
        break forward_join_341;
    }
    if (!((forwardValue5250_334_0 != 0))) {
        break forward_join_339;
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).aa__sourceReturn_da8c82d5d4();
    }
    forwardValue5250_341_0 = ((((net.minecraft.entity.passive.EntityHorse)(this)).af__Boolean()) ? 1 : 0);
    }
    if (!((life4_9 == 0))) {
        forwardValue5250_366_0 = forwardValue5250_341_0;
        break forward_join_366;
    }
    if (!((forwardValue5250_341_0 == 0))) {
        break forward_join_365;
    }
    spill5250_26 = life6_113;
    if (!((life4_9 == 0))) {
        forwardValue5250_366_0 = spill5250_26;
        break forward_join_366;
    }
    if (!((spill5250_26 == 0))) {
        break forward_join_365;
    }
    spill5250_27 = life5_8;
    if (!((life4_9 == 0))) {
        forwardValue5250_353_0 = spill5250_27;
        break forward_join_353;
    }
    if (!((spill5250_27 != null))) {
        break forward_join_361;
    }
    forwardValue5250_353_0 = life5_8;
    }
    spill5250_28 = ((net.minecraft.item.ItemStack)(forwardValue5250_353_0)).a(((net.minecraft.entity.player.EntityPlayer)(p0)), ((net.minecraft.entity.EntityLivingBase)(this)));
    if (!((life4_9 == 0))) {
        forwardValue5250_364_0 = ((spill5250_28) ? 1 : 0);
        break forward_join_364;
    }
    if (!(spill5250_28)) {
        break forward_join_361;
    }
    return ((1) != 0);
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).ai();
    forwardValue5250_364_0 = 1;
    }
    return ((forwardValue5250_364_0) != 0);
    }
    forwardValue5250_366_0 = life6_113;
    }
    if (!((life4_9 == 0))) {
        forwardValue5250_407_0 = forwardValue5250_366_0;
        break forward_join_407;
    }
    if (!((forwardValue5250_366_0 == 0))) {
        break forward_join_406;
    }
    spill5250_29 = ((net.minecraft.entity.passive.EntityHorse)(this)).as();
    if (!((life4_9 == 0))) {
        forwardValue5250_407_0 = ((spill5250_29) ? 1 : 0);
        break forward_join_407;
    }
    if (!(spill5250_29)) {
        break forward_join_406;
    }
    spill5250_30 = ((net.minecraft.entity.passive.EntityHorse)(this)).ai__Boolean();
    if (!((life4_9 == 0))) {
        forwardValue5250_407_0 = ((spill5250_30) ? 1 : 0);
        break forward_join_407;
    }
    if (!((!spill5250_30))) {
        break forward_join_406;
    }
    if (!((((net.minecraft.item.ItemStack)(life5_8)).a__wQ() == __sourceExactCall_42e37b9acc15b0(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ae)))))) {
        break forward_join_406;
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).q(((boolean)(true)));
    ((net.minecraft.entity.passive.EntityHorse)(this)).a(((java.lang.String)("mob.chickenplop")), ((float)(0x1.0p0f)), ((float)((((((java.util.Random)(this.ah)).nextFloat() - ((java.util.Random)(this.ah)).nextFloat()) * 0x1.99999ap-3f) + 0x1.0p0f))));
    life6_113 = 1;
    ((net.minecraft.entity.passive.EntityHorse)(this)).ab__sourceReturn_da8c82d5d4();
    }
    forwardValue5250_407_0 = life6_113;
    }
    if (!((life4_9 == 0))) {
        forwardValue5250_430_0 = forwardValue5250_407_0;
        break forward_join_430;
    }
    if (!((forwardValue5250_407_0 == 0))) {
        break forward_join_429;
    }
    spill5250_31 = ((net.minecraft.entity.passive.EntityHorse)(this)).ag__Boolean();
    if (!((life4_9 == 0))) {
        forwardValue5250_430_0 = ((spill5250_31) ? 1 : 0);
        break forward_join_430;
    }
    if (!(spill5250_31)) {
        break forward_join_429;
    }
    spill5250_32 = ((net.minecraft.entity.passive.EntityHorse)(this)).ao();
    if (!((life4_9 == 0))) {
        forwardValue5250_430_0 = ((spill5250_32) ? 1 : 0);
        break forward_join_430;
    }
    if (!((!spill5250_32))) {
        break forward_join_429;
    }
    if (!((((net.minecraft.item.ItemStack)(life5_8)).a__wQ() == net.minecraft.init.Items.aA))) {
        break forward_join_429;
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).b(((net.minecraft.entity.player.EntityPlayer)(p0)));
    return ((1) != 0);
    }
    forwardValue5250_430_0 = life6_113;
    }
    if (!((life4_9 == 0))) {
        forwardValue5250_460_0 = forwardValue5250_430_0;
        break forward_join_460;
    }
    if (!((forwardValue5250_430_0 != 0))) {
        break forward_join_458;
    }
    spill5250_33 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p0)).b1)).d;
    if (!((life4_9 == 0))) {
        forwardValue5250_457_0 = ((spill5250_33) ? 1 : 0);
        break forward_join_457;
    }
    if (!((!spill5250_33))) {
        break forward_join_456;
    }
    net.minecraft.item.ItemStack __stackOp5250_113_0 = life5_8;
    net.minecraft.item.ItemStack __stackOp5250_115_0 = __stackOp5250_113_0;
    int __stackOp5250_115_1 = (((net.minecraft.item.ItemStack)(__stackOp5250_113_0)).b - 1);
    spill5250_34 = __stackOp5250_115_1;
    ((net.minecraft.item.ItemStack)(__stackOp5250_115_0)).b = ((int)(__stackOp5250_115_1));
    if (!((life4_9 == 0))) {
        forwardValue5250_457_0 = spill5250_34;
        break forward_join_457;
    }
    if (!((spill5250_34 == 0))) {
        break forward_join_456;
    }
    ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a__Void(((int)(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).c)), ((net.minecraft.item.ItemStack)(null)));
    }
    forwardValue5250_457_0 = 1;
    }
    return ((forwardValue5250_457_0) != 0);
    }
    forwardValue5250_460_0 = ((((net.minecraft.entity.passive.EntityHorse)(this)).ag__Boolean()) ? 1 : 0);
    }
    if (!((life4_9 == 0))) {
        forwardValue5250_489_0 = forwardValue5250_460_0;
        break forward_join_489;
    }
    if (!((forwardValue5250_460_0 != 0))) {
        break forward_join_486;
    }
    spill5250_35 = this;
    if (!((life4_9 == 0))) {
        forwardValue5250_487_0 = spill5250_35;
        break forward_join_487;
    }
    if (!((((net.minecraft.entity.passive.EntityHorse)(spill5250_35)).f == null))) {
        break forward_join_486;
    }
    spill5250_36 = life5_8;
    if (!((life4_9 == 0))) {
        forwardValue5250_473_0 = spill5250_36;
        break forward_join_473;
    }
    if (!((spill5250_36 != null))) {
        break forward_join_481;
    }
    forwardValue5250_473_0 = life5_8;
    }
    spill5250_37 = ((net.minecraft.item.ItemStack)(forwardValue5250_473_0)).a(((net.minecraft.entity.player.EntityPlayer)(p0)), ((net.minecraft.entity.EntityLivingBase)(this)));
    if (!((life4_9 == 0))) {
        forwardValue5250_485_0 = ((spill5250_37) ? 1 : 0);
        break forward_join_485;
    }
    if (!(spill5250_37)) {
        break forward_join_481;
    }
    return ((1) != 0);
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).c__sourceReturn_aecb585720(((net.minecraft.entity.player.EntityPlayer)(p0)));
    forwardValue5250_485_0 = 1;
    }
    return ((forwardValue5250_485_0) != 0);
    }
    forwardValue5250_487_0 = this;
    }
    forwardValue5250_489_0 = ((__sourceIntrinsic_d6a7991b4c91_call5250_130(forwardValue5250_487_0, p0)) ? 1 : 0);
    }
    return ((forwardValue5250_489_0) != 0);
}


public boolean a__Boolean(net.minecraft.util.DamageSource p0, float p1) {
net.minecraft.entity.passive.EntityHorse forwardValue5251_22_0;
    int forwardValue5251_25_0;
    int forwardValue5251_29_0;
    int forwardValue5251_31_0;
    int spill5251_0;
    net.minecraft.entity.passive.EntityHorse spill5251_1;
    boolean spill5251_2;
    long life3_3;
    net.minecraft.entity.Entity life6_7;
    int life5_8;
    forward_join_31: {
    forward_join_30: {
    forward_join_29: {
    forward_join_25: {
    forward_join_22: {
    forward_join_21: {
    life3_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 16132130980076L);
    spill5251_0 = moom.vR.c();
    life6_7 = ((net.minecraft.util.DamageSource)(p0)).b__r3();
    life5_8 = spill5251_0;
    spill5251_1 = this;
    if (!((life5_8 == 0))) {
        forwardValue5251_22_0 = spill5251_1;
        break forward_join_22;
    }
    if (!((((net.minecraft.entity.passive.EntityHorse)(spill5251_1)).f != null))) {
        break forward_join_21;
    }
    spill5251_2 = ((net.minecraft.entity.Entity)(this.f)).equals(((java.lang.Object)(life6_7)));
    if (!((life5_8 == 0))) {
        forwardValue5251_25_0 = ((spill5251_2) ? 1 : 0);
        break forward_join_25;
    }
    if (!((!spill5251_2))) {
        break forward_join_30;
    }
    }
    forwardValue5251_22_0 = this;
    }
    forwardValue5251_25_0 = ((__sourceIntrinsic_153a193fc182_call5251_7(forwardValue5251_22_0, p0, p1)) ? 1 : 0);
    }
    if (!((life5_8 == 0))) {
        forwardValue5251_29_0 = forwardValue5251_25_0;
        break forward_join_29;
    }
    if (!((forwardValue5251_25_0 != 0))) {
        break forward_join_30;
    }
    forwardValue5251_29_0 = 1;
    }
    forwardValue5251_31_0 = forwardValue5251_29_0;
    break forward_join_31;
    }
    forwardValue5251_31_0 = 0;
    }
    return ((forwardValue5251_31_0) != 0);
}


public java.lang.String[] a__ArrayString() {
net.minecraft.entity.passive.EntityHorse forwardValue5249_14_0;
    net.minecraft.entity.passive.EntityHorse spill5249_0;
    long life1_3;
    int life3_5;
    forward_join_14: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 106595703390034L);
    life3_5 = moom.vR.b();
    spill5249_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue5249_14_0 = spill5249_0;
        break forward_join_14;
    }
    if (!((((net.minecraft.entity.passive.EntityHorse)(spill5249_0)).cE == null))) {
        break forward_join_13;
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).ae();
    }
    forwardValue5249_14_0 = this;
    }
    return ((net.minecraft.entity.passive.EntityHorse)(forwardValue5249_14_0)).cF;
}


private void a(net.minecraft.entity.Entity p0, moom.ws p1) {
int lexicalValue1597_15_0;
    boolean spill1597_0;
    long life3_3;
    int life5_5;
    int life6_21;
    net.minecraft.item.ItemStack life7_29;
    lexical_join_36: {
    lexical_join_15: {
    life3_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 29189614991127L);
    life5_5 = moom.vR.b();
    if (!((p1 != null))) {
        break lexical_join_36;
    }
    spill1597_0 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life5_5 != 0))) {
        lexicalValue1597_15_0 = ((spill1597_0) ? 1 : 0);
        break lexical_join_15;
    }
    if (!((!spill1597_0))) {
        break lexical_join_36;
    }
    lexicalValue1597_15_0 = 0;
    }
    life6_21 = lexicalValue1597_15_0;
    lexical_cycle_16: while (true) {
    lexical_join_34: {
    lexical_join_33: {
    if (!((life6_21 < ((moom.ws)(p1)).b__Int()))) {
        break lexical_join_36;
    }
    life7_29 = ((moom.ws)(p1)).a__xW(((int)(life6_21)));
    if (!((life5_5 != 0))) {
        break lexical_join_34;
    }
    if (!((life7_29 != null))) {
        break lexical_join_33;
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).a(((net.minecraft.item.ItemStack)(life7_29)), ((float)(0x0.0p0f)));
    }
    life6_21 += 1;
    }
    if (!((life5_5 == 0))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    return;
}


public void a(byte p0) {
int forestValue669_26_0;
    int forestValue669_26_1;
    byte spill669_0;
    int spill669_1;
    long life2_3;
    int life4_5;
    forest_join_35: {
    forest_join_32: {
    forest_join_26: {
    forest_join_20: {
    life2_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 135480196322367L);
    life4_5 = moom.vR.c();
    spill669_0 = p0;
    spill669_1 = __sourceIntrinsic_6121ff5511c4_invokedynamic669_2(18074, (2532196308886503436L ^ life2_3));
    if (!((life4_5 == 0))) {
        forestValue669_26_0 = ((int)(spill669_0));
        forestValue669_26_1 = spill669_1;
        break forest_join_26;
    }
    if (!((spill669_0 == spill669_1))) {
        break forest_join_20;
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).v(((boolean)(true)));
    if (!((life4_5 != 0))) {
        break forest_join_35;
    }
    }
    forestValue669_26_0 = ((int)(p0));
    forestValue669_26_1 = __sourceIntrinsic_6121ff5511c4_invokedynamic669_5(572, (8880915912115815552L ^ life2_3));
    }
    if (!((forestValue669_26_0 == forestValue669_26_1))) {
        break forest_join_32;
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).v(((boolean)(false)));
    if (!((life4_5 != 0))) {
        break forest_join_35;
    }
    }
    super.a(((byte)(p0)));
    }
    return;
}


protected net.minecraft.item.Item a__wQ() {
int forwardValue5253_14_0;
    int forwardValue5253_16_0;
    int forwardValue5253_31_0;
    int forwardValue5253_31_1;
    int forwardValue5253_33_0;
    net.minecraft.item.Item forwardValue5253_39_0;
    int spill5253_0;
    int spill5253_1;
    int spill5253_2;
    int spill5253_3;
    long life1_3;
    int life3_5;
    int life4_19;
    int life5_22;
    forward_join_39: {
    forward_join_38: {
    forward_join_36: {
    forward_join_33: {
    forward_join_31: {
    forward_join_27: {
    forward_join_16: {
    forward_join_15: {
    forward_join_14: {
    life1_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 55289717756108L);
    life3_5 = moom.vR.b();
    spill5253_0 = ((java.util.Random)(this.ah)).nextInt(((int)(4)));
    if (!((life3_5 != 0))) {
        forwardValue5253_14_0 = spill5253_0;
        break forward_join_14;
    }
    if (!((spill5253_0 == 0))) {
        break forward_join_15;
    }
    forwardValue5253_14_0 = 1;
    }
    forwardValue5253_16_0 = forwardValue5253_14_0;
    break forward_join_16;
    }
    forwardValue5253_16_0 = 0;
    }
    life4_19 = forwardValue5253_16_0;
    life5_22 = ((net.minecraft.entity.passive.EntityHorse)(this)).t();
    spill5253_1 = life5_22;
    spill5253_2 = 4;
    if (!((life3_5 != 0))) {
        forwardValue5253_31_0 = spill5253_1;
        forwardValue5253_31_1 = spill5253_2;
        break forward_join_31;
    }
    if (!((spill5253_1 == spill5253_2))) {
        break forward_join_27;
    }
    forwardValue5253_39_0 = net.minecraft.init.Items.aX;
    break forward_join_39;
    }
    spill5253_3 = life5_22;
    if (!((life3_5 != 0))) {
        forwardValue5253_33_0 = spill5253_3;
        break forward_join_33;
    }
    forwardValue5253_31_0 = spill5253_3;
    forwardValue5253_31_1 = 3;
    }
    if (!((forwardValue5253_31_0 == forwardValue5253_31_1))) {
        break forward_join_38;
    }
    forwardValue5253_33_0 = life4_19;
    }
    if (!((forwardValue5253_33_0 != 0))) {
        break forward_join_36;
    }
    forwardValue5253_39_0 = null;
    break forward_join_39;
    }
    forwardValue5253_39_0 = net.minecraft.init.Items.bi;
    break forward_join_39;
    }
    forwardValue5253_39_0 = net.minecraft.init.Items.aF;
    }
    return forwardValue5253_39_0;
}


public void a(moom.wq p0) {
int forwardValue5244_25_0;
    int forwardValue5244_42_0;
    int forwardValue5244_46_0;
    int forwardValue5244_46_1;
    int forwardValue5244_53_0;
    int forwardValue5244_60_0;
    net.minecraft.entity.passive.EntityHorse forwardValue5244_62_0;
    int spill5244_0;
    int spill5244_1;
    int spill5244_2;
    int spill5244_3;
    net.minecraft.entity.passive.EntityHorse spill5244_4;
    long life2_3;
    int life5_6;
    int life6_9;
    int life4_13;
    forward_join_66: {
    forward_join_62: {
    forward_join_60: {
    forward_join_53: {
    forward_join_52: {
    forward_join_46: {
    forward_join_42: {
    forward_join_41: {
    forward_join_25: {
    life2_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 19916694829730L);
    life5_6 = ((net.minecraft.entity.passive.EntityHorse)(this)).v__sourceReturn_8abf5c6871();
    life6_9 = ((((net.minecraft.entity.passive.EntityHorse)(this)).ao()) ? 1 : 0);
    spill5244_0 = moom.vR.c();
    ((net.minecraft.entity.passive.EntityHorse)(this)).ac__sourceReturn_da8c82d5d4();
    life4_13 = spill5244_0;
    spill5244_1 = this.S;
    if (!((life4_13 == 0))) {
        forwardValue5244_25_0 = spill5244_1;
        break forward_join_25;
    }
    if (!((spill5244_1 > __sourceIntrinsic_31a05ff9bc6d_invokedynamic5244_7(950, (2422109943823821731L ^ life2_3))))) {
        break forward_join_66;
    }
    forwardValue5244_25_0 = life5_6;
    }
    if (!((life4_13 == 0))) {
        forwardValue5244_42_0 = forwardValue5244_25_0;
        break forward_join_42;
    }
    if (!((forwardValue5244_25_0 == 0))) {
        break forward_join_41;
    }
    spill5244_2 = life5_6;
    spill5244_3 = ((net.minecraft.entity.passive.EntityHorse)(this)).v__sourceReturn_8abf5c6871();
    if (!((life4_13 == 0))) {
        forwardValue5244_46_0 = spill5244_2;
        forwardValue5244_46_1 = spill5244_3;
        break forward_join_46;
    }
    if (!((spill5244_2 != spill5244_3))) {
        break forward_join_41;
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).a(((java.lang.String)("mob.horse.armor")), ((float)(0x1.0p-1f)), ((float)(0x1.0p0f)));
    if (!((life4_13 != 0))) {
        break forward_join_52;
    }
    }
    forwardValue5244_42_0 = life5_6;
    }
    if (!((life4_13 == 0))) {
        forwardValue5244_53_0 = forwardValue5244_42_0;
        break forward_join_53;
    }
    forwardValue5244_46_0 = forwardValue5244_42_0;
    forwardValue5244_46_1 = ((net.minecraft.entity.passive.EntityHorse)(this)).v__sourceReturn_8abf5c6871();
    }
    if (!((forwardValue5244_46_0 != forwardValue5244_46_1))) {
        break forward_join_52;
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).a(((java.lang.String)("mob.horse.armor")), ((float)(0x1.0p-1f)), ((float)(0x1.0p0f)));
    }
    forwardValue5244_53_0 = life6_9;
    }
    if (!((life4_13 == 0))) {
        forwardValue5244_60_0 = forwardValue5244_53_0;
        break forward_join_60;
    }
    if (!((forwardValue5244_53_0 == 0))) {
        break forward_join_66;
    }
    spill5244_4 = this;
    if (!((life4_13 == 0))) {
        forwardValue5244_62_0 = spill5244_4;
        break forward_join_62;
    }
    forwardValue5244_60_0 = ((((net.minecraft.entity.passive.EntityHorse)(spill5244_4)).ao()) ? 1 : 0);
    }
    if (!((forwardValue5244_60_0 != 0))) {
        break forward_join_66;
    }
    forwardValue5244_62_0 = this;
    }
    ((net.minecraft.entity.passive.EntityHorse)(forwardValue5244_62_0)).a(((java.lang.String)("mob.horse.leather")), ((float)(0x1.0p-1f)), ((float)(0x1.0p0f)));
    }
    return;
}


public double a__sourceReturn_fedcb3e4d3() {
return ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.passive.EntityHorse)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.passive.EntityHorse.ce))))).b();
}


protected net.minecraft.entity.passive.EntityHorse a(net.minecraft.entity.Entity p0, double p1) {
double lexicalValue1596_50_0;
    net.minecraft.entity.Entity lexicalValue1596_54_0;
    int spill1596_0;
    net.minecraft.entity.Entity spill1596_1;
    double spill1596_2;
    long life4_3;
    double life7_5;
    net.minecraft.entity.Entity life9_8;
    int life6_9;
    java.util.Iterator life10_22;
    net.minecraft.entity.Entity life11_29;
    double life12_40;
    lexical_join_54: {
    lexical_join_53: {
    life4_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 123866257943192L);
    life7_5 = 0x1.fffffffffffffp1023d;
    spill1596_0 = moom.vR.b();
    life9_8 = null;
    life6_9 = spill1596_0;
    life10_22 = ((java.util.List)(((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(p0)), ((moom.CA)(((moom.CA)(((net.minecraft.entity.Entity)(p0)).b())).a(((double)(p1)), ((double)(p1)), ((double)(p1))))), ((com.google.common.base.Predicate)(net.minecraft.entity.passive.EntityHorse.cd))))).iterator();
    lexical_cycle_23: while (true) {
    lexical_join_51: {
    lexical_join_50: {
    if (!(((java.util.Iterator)(life10_22)).hasNext())) {
        break lexical_join_53;
    }
    life11_29 = ((net.minecraft.entity.Entity)(((java.util.Iterator)(life10_22)).next()));
    spill1596_1 = life11_29;
    if (!((life6_9 != 0))) {
        lexicalValue1596_54_0 = spill1596_1;
        break lexical_join_54;
    }
    life12_40 = ((net.minecraft.entity.Entity)(spill1596_1)).a(((double)(((net.minecraft.entity.Entity)(p0)).n)), ((double)(((net.minecraft.entity.Entity)(p0)).o)), ((double)(((net.minecraft.entity.Entity)(p0)).p)));
    spill1596_2 = life12_40;
    if (!((life6_9 != 0))) {
        lexicalValue1596_50_0 = spill1596_2;
        break lexical_join_50;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill1596_2)), ((double)(life7_5))) < 0))) {
        break lexical_join_51;
    }
    life9_8 = life11_29;
    lexicalValue1596_50_0 = life12_40;
    }
    life7_5 = lexicalValue1596_50_0;
    }
    if (!((life6_9 == 0))) { continue lexical_cycle_23; }
    break lexical_cycle_23;
    }
    }
    lexicalValue1596_54_0 = life9_8;
    }
    return ((net.minecraft.entity.passive.EntityHorse)(lexicalValue1596_54_0));
}


public java.lang.String a__String() {
int forestValue670_16_0;
    boolean spill670_0;
    long life1_3;
    int life3_5;
    int life4_17;
    forest_join_31: {
    forest_join_28: {
    forest_join_25: {
    forest_join_22: {
    forest_join_19: {
    forest_join_16: {
    forest_join_14: {
    life1_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 86307310729097L);
    life3_5 = moom.vR.b();
    spill670_0 = ((net.minecraft.entity.passive.EntityHorse)(this)).e__Boolean();
    if (!((life3_5 != 0))) {
        forestValue670_16_0 = ((spill670_0) ? 1 : 0);
        break forest_join_16;
    }
    if (!(spill670_0)) {
        break forest_join_14;
    }
    return ((net.minecraft.entity.passive.EntityHorse)(this)).g__String();
    }
    forestValue670_16_0 = ((net.minecraft.entity.passive.EntityHorse)(this)).t();
    }
    life4_17 = forestValue670_16_0;
    switch (life4_17) {
case 0:
default:
{
        break forest_join_19;
    }
case 1:
{
        break forest_join_22;
    }
case 2:
{
        break forest_join_25;
    }
case 3:
{
        break forest_join_28;
    }
case 4:
{
        break forest_join_31;
    }
}
    }
    return net.minecraft.util.StatCollector.a(((java.lang.String)("entity.horse.name")));
    }
    return net.minecraft.util.StatCollector.a(((java.lang.String)("entity.donkey.name")));
    }
    return net.minecraft.util.StatCollector.a(((java.lang.String)("entity.mule.name")));
    }
    return net.minecraft.util.StatCollector.a(((java.lang.String)("entity.zombiehorse.name")));
    }
    return net.minecraft.util.StatCollector.a(((java.lang.String)("entity.skeletonhorse.name")));
}


protected void a__Void() {
super.a__Void();
    ((net.minecraft.entity.ai.attributes.BaseAttributeMap)(((net.minecraft.entity.passive.EntityHorse)(this)).a__vE())).b(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.passive.EntityHorse.ce)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.passive.EntityHorse)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b))))).a(((double)(0x1.a8p5d)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.passive.EntityHorse)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).a(((double)(0x1.ccccccp-3d)));
    return;
}


protected void a(moom.DT p0, net.minecraft.block.Block p1) {
net.minecraft.block.Block forwardValue5240_23_0;
    int forwardValue5240_30_0;
    int forwardValue5240_41_0;
    int forwardValue5240_41_1;
    int forwardValue5240_53_0;
    int forwardValue5240_53_1;
    int forwardValue5240_86_0;
    net.minecraft.entity.passive.EntityHorse forwardValue5240_88_0;
    int forwardValue5240_102_0;
    int forwardValue5240_103_0;
    int forwardValue5240_103_1;
    net.minecraft.entity.passive.EntityHorse forwardValue5240_105_0;
    int spill5240_0;
    net.minecraft.block.Block spill5240_1;
    boolean spill5240_2;
    int spill5240_3;
    int spill5240_4;
    int spill5240_5;
    int spill5240_6;
    net.minecraft.entity.passive.EntityHorse spill5240_7;
    net.minecraft.entity.passive.EntityHorse spill5240_8;
    long life3_3;
    moom.eJ life6_7;
    int life5_8;
    int life7_39;
    forward_join_138: {
    forward_join_129: {
    forward_join_115: {
    forward_join_105: {
    forward_join_103: {
    forward_join_102: {
    forward_join_98: {
    forward_join_88: {
    forward_join_86: {
    forward_join_53: {
    forward_join_41: {
    forward_join_30: {
    forward_join_23: {
    forward_join_22: {
    life3_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 84764252636069L);
    spill5240_0 = moom.vR.c();
    life6_7 = ((net.minecraft.block.Block)(p1)).H;
    life5_8 = spill5240_0;
    spill5240_1 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.i)).a__fE(((moom.DT)(((moom.DT)(p0)).a__DT()))))).a__ch();
    if (!((life5_8 == 0))) {
        forwardValue5240_23_0 = spill5240_1;
        break forward_join_23;
    }
    if (!((spill5240_1 == net.minecraft.init.Blocks.aH))) {
        break forward_join_22;
    }
    life6_7 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.aH)).H;
    }
    forwardValue5240_23_0 = p1;
    }
    spill5240_2 = ((moom.fn)(((net.minecraft.block.Block)(forwardValue5240_23_0)).a__fn())).a__Boolean();
    if (!((life5_8 == 0))) {
        forwardValue5240_30_0 = ((spill5240_2) ? 1 : 0);
        break forward_join_30;
    }
    if (!((!spill5240_2))) {
        break forward_join_138;
    }
    forwardValue5240_30_0 = ((net.minecraft.entity.passive.EntityHorse)(this)).t();
    }
    life7_39 = forwardValue5240_30_0;
    if (!((this.f != null))) {
        break forward_join_115;
    }
    spill5240_3 = life7_39;
    spill5240_4 = 1;
    if (!((life5_8 == 0))) {
        forwardValue5240_41_0 = spill5240_3;
        forwardValue5240_41_1 = spill5240_4;
        break forward_join_41;
    }
    if (!((spill5240_3 != spill5240_4))) {
        break forward_join_115;
    }
    forwardValue5240_41_0 = life7_39;
    forwardValue5240_41_1 = 2;
    }
    if (!((life5_8 == 0))) {
        forwardValue5240_53_0 = forwardValue5240_41_0;
        forwardValue5240_53_1 = forwardValue5240_41_1;
        break forward_join_53;
    }
    if (!((forwardValue5240_41_0 != forwardValue5240_41_1))) {
        break forward_join_115;
    }
    net.minecraft.entity.passive.EntityHorse __stackOp5240_15_0 = this;
    ((net.minecraft.entity.passive.EntityHorse)(__stackOp5240_15_0)).cD = ((int)((((net.minecraft.entity.passive.EntityHorse)(__stackOp5240_15_0)).cD + 1)));
    forwardValue5240_53_0 = this.cD;
    forwardValue5240_53_1 = 5;
    }
    if (!((life5_8 == 0))) {
        forwardValue5240_103_0 = forwardValue5240_53_0;
        forwardValue5240_103_1 = forwardValue5240_53_1;
        break forward_join_103;
    }
    if (!((forwardValue5240_53_0 > forwardValue5240_53_1))) {
        break forward_join_98;
    }
    spill5240_5 = (this.cD % 3);
    if (!((life5_8 == 0))) {
        forwardValue5240_102_0 = spill5240_5;
        break forward_join_102;
    }
    if (!((spill5240_5 == 0))) {
        break forward_join_98;
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).a(((java.lang.String)("mob.horse.gallop")), ((float)((((moom.eJ)(life6_7)).a() * 0x1.333334p-3f))), ((float)(((moom.eJ)(life6_7)).b())));
    spill5240_6 = life7_39;
    if (!((life5_8 == 0))) {
        forwardValue5240_86_0 = spill5240_6;
        break forward_join_86;
    }
    if (!((spill5240_6 == 0))) {
        break forward_join_138;
    }
    spill5240_7 = this;
    if (!((life5_8 == 0))) {
        forwardValue5240_88_0 = spill5240_7;
        break forward_join_88;
    }
    forwardValue5240_86_0 = ((java.util.Random)(((net.minecraft.entity.passive.EntityHorse)(spill5240_7)).ah)).nextInt(((int)(__sourceIntrinsic_ee3181e06a41_invokedynamic5240_24(20811, (9198105699717021796L ^ life3_3)))));
    }
    if (!((forwardValue5240_86_0 == 0))) {
        break forward_join_138;
    }
    forwardValue5240_88_0 = this;
    }
    ((net.minecraft.entity.passive.EntityHorse)(forwardValue5240_88_0)).a(((java.lang.String)("mob.horse.breathe")), ((float)((((moom.eJ)(life6_7)).a() * 0x1.333334p-1f))), ((float)(((moom.eJ)(life6_7)).b())));
    if (!((life5_8 != 0))) {
        break forward_join_138;
    }
    }
    spill5240_8 = this;
    if (!((life5_8 == 0))) {
        forwardValue5240_105_0 = spill5240_8;
        break forward_join_105;
    }
    forwardValue5240_102_0 = ((net.minecraft.entity.passive.EntityHorse)(spill5240_8)).cD;
    }
    forwardValue5240_103_0 = forwardValue5240_102_0;
    forwardValue5240_103_1 = 5;
    }
    if (!((forwardValue5240_103_0 <= forwardValue5240_103_1))) {
        break forward_join_138;
    }
    forwardValue5240_105_0 = this;
    }
    ((net.minecraft.entity.passive.EntityHorse)(forwardValue5240_105_0)).a(((java.lang.String)("mob.horse.wood")), ((float)((((moom.eJ)(life6_7)).a() * 0x1.333334p-3f))), ((float)(((moom.eJ)(life6_7)).b())));
    if (!((life5_8 != 0))) {
        break forward_join_138;
    }
    }
    if (!((life6_7 == net.minecraft.block.Block.f))) {
        break forward_join_129;
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).a(((java.lang.String)("mob.horse.wood")), ((float)((((moom.eJ)(life6_7)).a() * 0x1.333334p-3f))), ((float)(((moom.eJ)(life6_7)).b())));
    if (!((life5_8 != 0))) {
        break forward_join_138;
    }
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).a(((java.lang.String)("mob.horse.soft")), ((float)((((moom.eJ)(life6_7)).a() * 0x1.333334p-3f))), ((float)(((moom.eJ)(life6_7)).b())));
    }
    return;
}


public static boolean a(net.minecraft.item.Item p0) {
net.minecraft.item.Item forwardValue5247_13_0;
    net.minecraft.item.Item forwardValue5247_13_1;
    net.minecraft.item.Item forwardValue5247_18_0;
    net.minecraft.item.Item forwardValue5247_18_1;
    int forwardValue5247_22_0;
    net.minecraft.item.Item spill5247_0;
    net.minecraft.item.Item spill5247_1;
    long life1_3;
    int life3_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_19: {
    forward_join_18: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 1542374912564L);
    life3_5 = moom.vR.b();
    spill5247_0 = p0;
    spill5247_1 = net.minecraft.init.Items.bZ;
    if (!((life3_5 != 0))) {
        forwardValue5247_13_0 = spill5247_0;
        forwardValue5247_13_1 = spill5247_1;
        break forward_join_13;
    }
    if (!((spill5247_0 != spill5247_1))) {
        break forward_join_19;
    }
    forwardValue5247_13_0 = p0;
    forwardValue5247_13_1 = net.minecraft.init.Items.b0;
    }
    if (!((life3_5 != 0))) {
        forwardValue5247_18_0 = forwardValue5247_13_0;
        forwardValue5247_18_1 = forwardValue5247_13_1;
        break forward_join_18;
    }
    if (!((forwardValue5247_13_0 != forwardValue5247_13_1))) {
        break forward_join_19;
    }
    forwardValue5247_18_0 = p0;
    forwardValue5247_18_1 = net.minecraft.init.Items.b1;
    }
    if (!((forwardValue5247_18_0 == forwardValue5247_18_1))) {
        break forward_join_21;
    }
    }
    forwardValue5247_22_0 = 1;
    break forward_join_22;
    }
    forwardValue5247_22_0 = 0;
    }
    return ((forwardValue5247_22_0) != 0);
}


public void a__sourceReturn_481e10a41f(net.minecraft.item.ItemStack p0) {
long local2 = (net.minecraft.entity.passive.EntityHorse.jb ^ 87546308626548L);
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_5f56e65a234d_originalDynamicSite1970_2(22301, (2508824875344039372L ^ local2)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.entity.passive.EntityHorse)(this)).b__sourceReturn_9e303eb146(((net.minecraft.item.ItemStack)(p0)))))))));
    ((net.minecraft.entity.passive.EntityHorse)(this)).ad__sourceReturn_da8c82d5d4();
    return;
}


public float m__sourceReturn_bc607678b6() {
return 0x1.0p-1f;
}


public void o(boolean p0) {
this.cr = ((boolean)(p0));
    return;
}


public void o(int p0) {
long local2 = (net.minecraft.entity.passive.EntityHorse.jb ^ 122031783314800L);
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_e0479935b9b5_originalDynamicSite1971_2(950, (2422211783832032369L ^ local2)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0))))));
    ((net.minecraft.entity.passive.EntityHorse)(this)).ad__sourceReturn_da8c82d5d4();
    return;
}


public void p(int p0) {
this.cu = ((int)(p0));
    return;
}


public void p(boolean p0) {
long local2 = (net.minecraft.entity.passive.EntityHorse.jb ^ 78713204034544L);
    ((net.minecraft.entity.passive.EntityHorse)(this)).c(((int)(__sourceIntrinsic_335dd01b6fe5_originalDynamicSite1972_1(9170, (4543279156921154200L ^ local2)))), ((boolean)(p0)));
    return;
}


public java.lang.String k__sourceReturn_0e30dfc966() {
java.lang.String forwardValue5282_15_0;
    java.lang.String spill5282_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 75863789807479L);
    life3_5 = moom.vR.c();
    spill5282_0 = this.cE;
    if (!((life3_5 == 0))) {
        forwardValue5282_15_0 = spill5282_0;
        break forward_join_15;
    }
    if (!((spill5282_0 == null))) {
        break forward_join_13;
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).ae();
    }
    forwardValue5282_15_0 = this.cE;
    }
    return forwardValue5282_15_0;
}


public int t() {
long local1 = (net.minecraft.entity.passive.EntityHorse.jb ^ 74223493286913L);
    return ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_cd276fc49293_originalDynamicSite1973_2(9419, (6094268590154349171L ^ local1)))));
}


public void t(boolean p0) {
((net.minecraft.entity.passive.EntityHorse)(this)).e(((boolean)(p0)));
    return;
}


public void t__Void() {
float forwardValue5285_20_0;
    float forwardValue5285_20_1;
    net.minecraft.entity.Entity forwardValue5285_78_0;
    int spill5285_0;
    float spill5285_1;
    float spill5285_2;
    net.minecraft.entity.Entity spill5285_3;
    long life1_3;
    int life3_7;
    float life4_28;
    float life5_36;
    float life6_41;
    float life7_46;
    forward_join_82: {
    forward_join_78: {
    forward_join_20: {
    life1_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 111860607426416L);
    spill5285_0 = moom.vR.b();
    super.t__Void();
    life3_7 = spill5285_0;
    spill5285_1 = this.cA;
    spill5285_2 = 0x0.0p0f;
    if (!((life3_7 != 0))) {
        forwardValue5285_20_0 = spill5285_1;
        forwardValue5285_20_1 = spill5285_2;
        break forward_join_20;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill5285_1)), ((float)(spill5285_2))) > 0))) {
        break forward_join_82;
    }
    forwardValue5285_20_0 = (this.a2 * 0x1.921fb6p1f);
    forwardValue5285_20_1 = 0x1.68p7f;
    }
    life4_28 = moom.Dr.a(((float)((forwardValue5285_20_0 / forwardValue5285_20_1))));
    life5_36 = moom.Dr.b(((float)(((this.a2 * 0x1.921fb6p1f) / 0x1.68p7f))));
    life6_41 = (0x1.666666p-1f * this.cA);
    life7_46 = (0x1.333334p-3f * this.cA);
    ((net.minecraft.entity.Entity)(this.f)).a__Void(((double)((this.n + ((double) (life6_41 * life4_28))))), ((double)((((this.o + ((net.minecraft.entity.passive.EntityHorse)(this)).e()) + ((net.minecraft.entity.Entity)(this.f)).d()) + ((double) life7_46)))), ((double)((this.p - ((double) (life6_41 * life5_36))))));
    spill5285_3 = this.f;
    if (!((life3_7 != 0))) {
        forwardValue5285_78_0 = spill5285_3;
        break forward_join_78;
    }
    if (!((((spill5285_3 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0) != 0))) {
        break forward_join_82;
    }
    forwardValue5285_78_0 = this.f;
    }
    ((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(forwardValue5285_78_0)))).a2 = ((float)(this.a2));
    }
    return;
}


public void g__Void() {
int forwardValue5277_27_0;
    int forwardValue5277_59_0;
    int forwardValue5277_90_0;
    int forwardValue5277_113_0;
    int forwardValue5277_141_0;
    int forwardValue5277_186_0;
    int forwardValue5277_198_0;
    int forwardValue5277_261_0;
    int forwardValue5277_278_0;
    net.minecraft.entity.passive.EntityHorse forwardValue5277_302_0;
    int forwardValue5277_325_0;
    net.minecraft.entity.passive.EntityHorse forwardValue5277_327_0;
    int spill5277_0;
    boolean spill5277_1;
    boolean spill5277_2;
    int spill5277_3;
    int spill5277_4;
    int spill5277_5;
    int spill5277_6;
    int spill5277_7;
    int spill5277_8;
    net.minecraft.entity.passive.EntityHorse spill5277_9;
    float spill5277_10;
    int spill5277_11;
    net.minecraft.entity.passive.EntityHorse spill5277_12;
    net.minecraft.entity.passive.EntityHorse spill5277_13;
    long life1_3;
    int life3_7;
    forward_join_329: {
    forward_join_327: {
    forward_join_325: {
    forward_join_306: {
    forward_join_302: {
    forward_join_278: {
    forward_join_267: {
    forward_join_261: {
    forward_join_232: {
    forward_join_198: {
    forward_join_192: {
    forward_join_186: {
    forward_join_169: {
    forward_join_141: {
    forward_join_135: {
    forward_join_113: {
    forward_join_111: {
    forward_join_90: {
    forward_join_88: {
    forward_join_59: {
    forward_join_56: {
    forward_join_27: {
    forward_join_25: {
    life1_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 102903980896026L);
    spill5277_0 = moom.vR.c();
    super.g__Void();
    life3_7 = spill5277_0;
    spill5277_1 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life3_7 == 0))) {
        forwardValue5277_27_0 = ((spill5277_1) ? 1 : 0);
        break forward_join_27;
    }
    if (!(spill5277_1)) {
        break forward_join_25;
    }
    spill5277_2 = ((net.minecraft.entity.DataWatcher)(this.al)).a__Boolean();
    if (!((life3_7 == 0))) {
        forwardValue5277_27_0 = ((spill5277_2) ? 1 : 0);
        break forward_join_27;
    }
    if (!(spill5277_2)) {
        break forward_join_25;
    }
    ((net.minecraft.entity.DataWatcher)(this.al)).a__Void();
    ((net.minecraft.entity.passive.EntityHorse)(this)).ad__sourceReturn_da8c82d5d4();
    }
    forwardValue5277_27_0 = this.cn;
    }
    if (!((life3_7 == 0))) {
        forwardValue5277_59_0 = forwardValue5277_27_0;
        break forward_join_59;
    }
    if (!((forwardValue5277_27_0 > 0))) {
        break forward_join_56;
    }
    net.minecraft.entity.passive.EntityHorse __stackOp5277_13_0 = this;
    net.minecraft.entity.passive.EntityHorse __stackOp5277_15_0 = __stackOp5277_13_0;
    int __stackOp5277_15_1 = (((net.minecraft.entity.passive.EntityHorse)(__stackOp5277_13_0)).cn + 1);
    spill5277_3 = __stackOp5277_15_1;
    ((net.minecraft.entity.passive.EntityHorse)(__stackOp5277_15_0)).cn = ((int)(__stackOp5277_15_1));
    if (!((life3_7 == 0))) {
        forwardValue5277_59_0 = spill5277_3;
        break forward_join_59;
    }
    if (!((spill5277_3 > __sourceIntrinsic_736a66cda11e_invokedynamic5277_17(26133, (7616727854598134691L ^ life1_3))))) {
        break forward_join_56;
    }
    this.cn = ((int)(0));
    ((net.minecraft.entity.passive.EntityHorse)(this)).c(((int)(__sourceIntrinsic_736a66cda11e_invokedynamic5277_19(32470, (8501984315204764491L ^ life1_3)))), ((boolean)(false)));
    }
    forwardValue5277_59_0 = ((((net.minecraft.world.World)(this.i)).G) ? 1 : 0);
    }
    if (!((life3_7 == 0))) {
        forwardValue5277_90_0 = forwardValue5277_59_0;
        break forward_join_90;
    }
    if (!((forwardValue5277_59_0 == 0))) {
        break forward_join_88;
    }
    spill5277_4 = this.co;
    if (!((life3_7 == 0))) {
        forwardValue5277_90_0 = spill5277_4;
        break forward_join_90;
    }
    if (!((spill5277_4 > 0))) {
        break forward_join_88;
    }
    net.minecraft.entity.passive.EntityHorse __stackOp5277_25_0 = this;
    net.minecraft.entity.passive.EntityHorse __stackOp5277_27_0 = __stackOp5277_25_0;
    int __stackOp5277_27_1 = (((net.minecraft.entity.passive.EntityHorse)(__stackOp5277_25_0)).co + 1);
    spill5277_5 = __stackOp5277_27_1;
    ((net.minecraft.entity.passive.EntityHorse)(__stackOp5277_27_0)).co = ((int)(__stackOp5277_27_1));
    if (!((life3_7 == 0))) {
        forwardValue5277_90_0 = spill5277_5;
        break forward_join_90;
    }
    if (!((spill5277_5 > __sourceIntrinsic_736a66cda11e_invokedynamic5277_29(950, (2422197329289313819L ^ life1_3))))) {
        break forward_join_88;
    }
    this.co = ((int)(0));
    ((net.minecraft.entity.passive.EntityHorse)(this)).u(((boolean)(false)));
    }
    forwardValue5277_90_0 = this.cp;
    }
    if (!((life3_7 == 0))) {
        forwardValue5277_113_0 = forwardValue5277_90_0;
        break forward_join_113;
    }
    if (!((forwardValue5277_90_0 > 0))) {
        break forward_join_111;
    }
    net.minecraft.entity.passive.EntityHorse __stackOp5277_33_0 = this;
    net.minecraft.entity.passive.EntityHorse __stackOp5277_35_0 = __stackOp5277_33_0;
    int __stackOp5277_35_1 = (((net.minecraft.entity.passive.EntityHorse)(__stackOp5277_33_0)).cp + 1);
    spill5277_6 = __stackOp5277_35_1;
    ((net.minecraft.entity.passive.EntityHorse)(__stackOp5277_35_0)).cp = ((int)(__stackOp5277_35_1));
    if (!((life3_7 == 0))) {
        forwardValue5277_113_0 = spill5277_6;
        break forward_join_113;
    }
    if (!((spill5277_6 > __sourceIntrinsic_736a66cda11e_invokedynamic5277_37(25403, (6035872675486899863L ^ life1_3))))) {
        break forward_join_111;
    }
    this.cp = ((int)(0));
    }
    forwardValue5277_113_0 = this.cq;
    }
    if (!((life3_7 == 0))) {
        forwardValue5277_141_0 = forwardValue5277_113_0;
        break forward_join_141;
    }
    if (!((forwardValue5277_113_0 > 0))) {
        break forward_join_135;
    }
    net.minecraft.entity.passive.EntityHorse __stackOp5277_40_0 = this;
    ((net.minecraft.entity.passive.EntityHorse)(__stackOp5277_40_0)).cq = ((int)((((net.minecraft.entity.passive.EntityHorse)(__stackOp5277_40_0)).cq + 1)));
    spill5277_7 = this.cq;
    if (!((life3_7 == 0))) {
        forwardValue5277_141_0 = spill5277_7;
        break forward_join_141;
    }
    if (!((spill5277_7 > __sourceIntrinsic_736a66cda11e_invokedynamic5277_44(19342, (490641982526895670L ^ life1_3))))) {
        break forward_join_135;
    }
    this.cq = ((int)(0));
    }
    this.cy = ((float)(this.cx));
    forwardValue5277_141_0 = ((((net.minecraft.entity.passive.EntityHorse)(this)).aj__Boolean()) ? 1 : 0);
    }
    if (!((life3_7 == 0))) {
        forwardValue5277_186_0 = forwardValue5277_141_0;
        break forward_join_186;
    }
    if (!((forwardValue5277_141_0 != 0))) {
        break forward_join_169;
    }
    net.minecraft.entity.passive.EntityHorse __stackOp5277_50_0 = this;
    ((net.minecraft.entity.passive.EntityHorse)(__stackOp5277_50_0)).cx = ((float)((((net.minecraft.entity.passive.EntityHorse)(__stackOp5277_50_0)).cx + (((0x1.0p0f - this.cx) * 0x1.99999ap-2f) + 0x1.99999ap-5f))));
    spill5277_8 = recovery.source.CarrierOps.fcmpl(((float)(this.cx)), ((float)(0x1.0p0f)));
    if (!((life3_7 == 0))) {
        forwardValue5277_198_0 = spill5277_8;
        break forward_join_198;
    }
    if (!((spill5277_8 > 0))) {
        break forward_join_192;
    }
    this.cx = ((float)(0x1.0p0f));
    if (!((life3_7 != 0))) {
        break forward_join_192;
    }
    }
    net.minecraft.entity.passive.EntityHorse __stackOp5277_57_0 = this;
    ((net.minecraft.entity.passive.EntityHorse)(__stackOp5277_57_0)).cx = ((float)((((net.minecraft.entity.passive.EntityHorse)(__stackOp5277_57_0)).cx + (((0x0.0p0f - this.cx) * 0x1.99999ap-2f) - 0x1.99999ap-5f))));
    forwardValue5277_186_0 = recovery.source.CarrierOps.fcmpg(((float)(this.cx)), ((float)(0x0.0p0f)));
    }
    if (!((life3_7 == 0))) {
        forwardValue5277_198_0 = forwardValue5277_186_0;
        break forward_join_198;
    }
    if (!((forwardValue5277_186_0 < 0))) {
        break forward_join_192;
    }
    this.cx = ((float)(0x0.0p0f));
    }
    this.cA = ((float)(this.cz));
    forwardValue5277_198_0 = ((((net.minecraft.entity.passive.EntityHorse)(this)).ak()) ? 1 : 0);
    }
    if (!((life3_7 == 0))) {
        forwardValue5277_261_0 = forwardValue5277_198_0;
        break forward_join_261;
    }
    if (!((forwardValue5277_198_0 != 0))) {
        break forward_join_232;
    }
    spill5277_9 = this;
    net.minecraft.entity.passive.EntityHorse __stackOp5277_68_0 = this;
    float __stackOp5277_68_1 = 0x0.0p0f;
    spill5277_10 = __stackOp5277_68_1;
    ((net.minecraft.entity.passive.EntityHorse)(__stackOp5277_68_0)).cx = ((float)(__stackOp5277_68_1));
    ((net.minecraft.entity.passive.EntityHorse)(spill5277_9)).cy = ((float)(spill5277_10));
    net.minecraft.entity.passive.EntityHorse __stackOp5277_71_0 = this;
    ((net.minecraft.entity.passive.EntityHorse)(__stackOp5277_71_0)).cz = ((float)((((net.minecraft.entity.passive.EntityHorse)(__stackOp5277_71_0)).cz + (((0x1.0p0f - this.cz) * 0x1.99999ap-2f) + 0x1.99999ap-5f))));
    spill5277_11 = recovery.source.CarrierOps.fcmpl(((float)(this.cz)), ((float)(0x1.0p0f)));
    if (!((life3_7 == 0))) {
        forwardValue5277_278_0 = spill5277_11;
        break forward_join_278;
    }
    if (!((spill5277_11 > 0))) {
        break forward_join_267;
    }
    this.cz = ((float)(0x1.0p0f));
    if (!((life3_7 != 0))) {
        break forward_join_267;
    }
    }
    this.cw = ((boolean)(false));
    net.minecraft.entity.passive.EntityHorse __stackOp5277_79_0 = this;
    ((net.minecraft.entity.passive.EntityHorse)(__stackOp5277_79_0)).cz = ((float)((((net.minecraft.entity.passive.EntityHorse)(__stackOp5277_79_0)).cz + ((((((0x1.99999ap-1f * this.cz) * this.cz) * this.cz) - this.cz) * 0x1.333334p-1f) - 0x1.99999ap-5f))));
    forwardValue5277_261_0 = recovery.source.CarrierOps.fcmpg(((float)(this.cz)), ((float)(0x0.0p0f)));
    }
    if (!((life3_7 == 0))) {
        forwardValue5277_278_0 = forwardValue5277_261_0;
        break forward_join_278;
    }
    if (!((forwardValue5277_261_0 < 0))) {
        break forward_join_267;
    }
    this.cz = ((float)(0x0.0p0f));
    }
    this.cC = ((float)(this.cB));
    forwardValue5277_278_0 = ((((net.minecraft.entity.passive.EntityHorse)(this)).c__sourceReturn_9a6ad9dfe5(((int)(__sourceIntrinsic_736a66cda11e_invokedynamic5277_91(32470, (8501984315204764491L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_7 == 0))) {
        forwardValue5277_325_0 = forwardValue5277_278_0;
        break forward_join_325;
    }
    if (!((forwardValue5277_278_0 != 0))) {
        break forward_join_306;
    }
    net.minecraft.entity.passive.EntityHorse __stackOp5277_94_0 = this;
    ((net.minecraft.entity.passive.EntityHorse)(__stackOp5277_94_0)).cB = ((float)((((net.minecraft.entity.passive.EntityHorse)(__stackOp5277_94_0)).cB + (((0x1.0p0f - this.cB) * 0x1.666666p-1f) + 0x1.99999ap-5f))));
    spill5277_12 = this;
    if (!((life3_7 == 0))) {
        forwardValue5277_302_0 = spill5277_12;
        break forward_join_302;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.entity.passive.EntityHorse)(spill5277_12)).cB)), ((float)(0x1.0p0f))) > 0))) {
        break forward_join_329;
    }
    forwardValue5277_302_0 = this;
    }
    ((net.minecraft.entity.passive.EntityHorse)(forwardValue5277_302_0)).cB = ((float)(0x1.0p0f));
    if (!((life3_7 != 0))) {
        break forward_join_329;
    }
    }
    net.minecraft.entity.passive.EntityHorse __stackOp5277_101_0 = this;
    ((net.minecraft.entity.passive.EntityHorse)(__stackOp5277_101_0)).cB = ((float)((((net.minecraft.entity.passive.EntityHorse)(__stackOp5277_101_0)).cB + (((0x0.0p0f - this.cB) * 0x1.666666p-1f) - 0x1.99999ap-5f))));
    spill5277_13 = this;
    if (!((life3_7 == 0))) {
        forwardValue5277_327_0 = spill5277_13;
        break forward_join_327;
    }
    forwardValue5277_325_0 = recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.entity.passive.EntityHorse)(spill5277_13)).cB)), ((float)(0x0.0p0f)));
    }
    if (!((forwardValue5277_325_0 < 0))) {
        break forward_join_329;
    }
    forwardValue5277_327_0 = this;
    }
    ((net.minecraft.entity.passive.EntityHorse)(forwardValue5277_327_0)).cB = ((float)(0x0.0p0f));
    }
    return;
}


protected void v(boolean p0) {
net.minecraft.util.EnumParticleTypes lexicalValue1601_11_0;
    long life2_3;
    int life4_5;
    net.minecraft.util.EnumParticleTypes life5_13;
    int life6_15;
    double life7_28;
    double life9_34;
    double life11_40;
    lexical_join_95: {
    lexical_join_11: {
    lexical_join_10: {
    life2_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 108597449848422L);
    life4_5 = moom.vR.b();
    if (!(p0)) {
        break lexical_join_10;
    }
    lexicalValue1601_11_0 = net.minecraft.util.EnumParticleTypes.HEART;
    break lexical_join_11;
    }
    lexicalValue1601_11_0 = net.minecraft.util.EnumParticleTypes.SMOKE_NORMAL;
    }
    life5_13 = lexicalValue1601_11_0;
    life6_15 = 0;
    lexical_cycle_14: while (true) {
    if (!((life6_15 < __sourceIntrinsic_c0134c48c594_invokedynamic1601_4(18074, (2532204773720875605L ^ life2_3))))) {
        break lexical_join_95;
    }
    life7_28 = (((java.util.Random)(this.ah)).nextGaussian() * 0x1.47ae147ae147bp-6d);
    life9_34 = (((java.util.Random)(this.ah)).nextGaussian() * 0x1.47ae147ae147bp-6d);
    life11_40 = (((java.util.Random)(this.ah)).nextGaussian() * 0x1.47ae147ae147bp-6d);
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.util.EnumParticleTypes)(life5_13)), ((double)(((this.n + ((double) ((((java.util.Random)(this.ah)).nextFloat() * this.G) * 0x1.0p1f))) - ((double) this.G)))), ((double)(((this.o + 0x1.0p-1d) + ((double) (((java.util.Random)(this.ah)).nextFloat() * this.H))))), ((double)(((this.p + ((double) ((((java.util.Random)(this.ah)).nextFloat() * this.G) * 0x1.0p1f))) - ((double) this.G)))), ((double)(life7_28)), ((double)(life9_34)), ((double)(life11_40)), ((int[])(new int[0])));
    life6_15 += 1;
    if (!((life4_5 == 0))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    return;
}


public int v__sourceReturn_8abf5c6871() {
long local1 = (net.minecraft.entity.passive.EntityHorse.jb ^ 12659515995981L);
    return ((net.minecraft.entity.DataWatcher)(this.al)).a__Int(((int)(__sourceIntrinsic_0585f56d802f_originalDynamicSite1974_2(22301, (2508899659034866421L ^ local1)))));
}


protected java.lang.String j__sourceReturn_0e30dfc966() {
int forwardValue5281_20_0;
    int forwardValue5281_20_1;
    int forwardValue5281_25_0;
    int forwardValue5281_25_1;
    int forwardValue5281_30_0;
    int forwardValue5281_30_1;
    java.lang.String forwardValue5281_36_0;
    int spill5281_0;
    int spill5281_1;
    int spill5281_2;
    long life1_3;
    int life3_7;
    int life4_12;
    forward_join_36: {
    forward_join_35: {
    forward_join_33: {
    forward_join_30: {
    forward_join_25: {
    forward_join_20: {
    life1_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 118378990996833L);
    spill5281_0 = moom.vR.c();
    ((net.minecraft.entity.passive.EntityHorse)(this)).ag();
    life3_7 = spill5281_0;
    ((net.minecraft.entity.passive.EntityHorse)(this)).ah();
    life4_12 = ((net.minecraft.entity.passive.EntityHorse)(this)).t();
    spill5281_1 = life4_12;
    spill5281_2 = 3;
    if (!((life3_7 == 0))) {
        forwardValue5281_20_0 = spill5281_1;
        forwardValue5281_20_1 = spill5281_2;
        break forward_join_20;
    }
    if (!((spill5281_1 != spill5281_2))) {
        break forward_join_35;
    }
    forwardValue5281_20_0 = life4_12;
    forwardValue5281_20_1 = 4;
    }
    if (!((life3_7 == 0))) {
        forwardValue5281_25_0 = forwardValue5281_20_0;
        forwardValue5281_25_1 = forwardValue5281_20_1;
        break forward_join_25;
    }
    if (!((forwardValue5281_20_0 != forwardValue5281_20_1))) {
        break forward_join_35;
    }
    forwardValue5281_25_0 = life4_12;
    forwardValue5281_25_1 = 1;
    }
    if (!((life3_7 == 0))) {
        forwardValue5281_30_0 = forwardValue5281_25_0;
        forwardValue5281_30_1 = forwardValue5281_25_1;
        break forward_join_30;
    }
    if (!((forwardValue5281_25_0 != forwardValue5281_25_1))) {
        break forward_join_33;
    }
    forwardValue5281_30_0 = life4_12;
    forwardValue5281_30_1 = 2;
    }
    if (!((forwardValue5281_30_0 != forwardValue5281_30_1))) {
        break forward_join_33;
    }
    forwardValue5281_36_0 = "mob.horse.angry";
    break forward_join_36;
    }
    forwardValue5281_36_0 = "mob.horse.donkey.angry";
    break forward_join_36;
    }
    forwardValue5281_36_0 = null;
    }
    return forwardValue5281_36_0;
}


public void q(int p0) {
int forwardValue5284_12_0;
    int forwardValue5284_16_0;
    boolean spill5284_0;
    long life2_3;
    int life4_5;
    forward_join_46: {
    forward_join_36: {
    forward_join_24: {
    forward_join_19: {
    forward_join_16: {
    forward_join_12: {
    life2_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 48821319253395L);
    life4_5 = moom.vR.b();
    spill5284_0 = ((net.minecraft.entity.passive.EntityHorse)(this)).ao();
    if (!((life4_5 != 0))) {
        forwardValue5284_12_0 = ((spill5284_0) ? 1 : 0);
        break forward_join_12;
    }
    if (!(spill5284_0)) {
        break forward_join_46;
    }
    forwardValue5284_12_0 = p0;
    }
    if (!((life4_5 != 0))) {
        forwardValue5284_16_0 = forwardValue5284_12_0;
        break forward_join_16;
    }
    if (!((forwardValue5284_12_0 < 0))) {
        break forward_join_19;
    }
    forwardValue5284_16_0 = 0;
    }
    p0 = forwardValue5284_16_0;
    if (!((life4_5 == 0))) {
        break forward_join_24;
    }
    }
    this.cw = ((boolean)(true));
    ((net.minecraft.entity.passive.EntityHorse)(this)).ah();
    }
    if (!((p0 >= __sourceIntrinsic_012f1ac8dd86_invokedynamic5284_6(19700, (1630143256495662042L ^ life2_3))))) {
        break forward_join_36;
    }
    this.cv = ((float)(0x1.0p0f));
    if (!((life4_5 == 0))) {
        break forward_join_46;
    }
    }
    this.cv = ((float)((0x1.99999ap-2f + ((0x1.99999ap-2f * ((float) p0)) / 0x1.68p6f))));
    }
    return;
}


public void q(boolean p0) {
long local2 = (net.minecraft.entity.passive.EntityHorse.jb ^ 2567339531359L);
    ((net.minecraft.entity.passive.EntityHorse)(this)).c(((int)(__sourceIntrinsic_f6925daff8ea_originalDynamicSite1975_1(25403, (6035920791697386962L ^ local2)))), ((boolean)(p0)));
    return;
}


public boolean ao() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.entity.passive.EntityHorse)(this)).c__sourceReturn_9a6ad9dfe5(((int)(4))))) != 0);
}


public boolean at() {
int forwardValue5264_20_0;
    int forwardValue5264_22_0;
    int spill5264_0;
    int spill5264_1;
    int spill5264_2;
    long life1_3;
    int life4_7;
    int life3_8;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life1_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 108834142768839L);
    spill5264_0 = moom.vR.c();
    life4_7 = ((net.minecraft.entity.passive.EntityHorse)(this)).t();
    life3_8 = spill5264_0;
    spill5264_1 = life4_7;
    if (!((life3_8 == 0))) {
        forwardValue5264_20_0 = spill5264_1;
        break forward_join_20;
    }
    if (!((spill5264_1 != 3))) {
        break forward_join_19;
    }
    spill5264_2 = life4_7;
    if (!((life3_8 == 0))) {
        forwardValue5264_20_0 = spill5264_2;
        break forward_join_20;
    }
    if (!((spill5264_2 == 4))) {
        break forward_join_21;
    }
    }
    forwardValue5264_20_0 = 1;
    }
    forwardValue5264_22_0 = forwardValue5264_20_0;
    break forward_join_22;
    }
    forwardValue5264_22_0 = 0;
    }
    return ((forwardValue5264_22_0) != 0);
}


public boolean ak() {
long local1 = (net.minecraft.entity.passive.EntityHorse.jb ^ 48795337854432L);
    return ((net.minecraft.entity.passive.EntityHorse)(this)).c__sourceReturn_9a6ad9dfe5(((int)(__sourceIntrinsic_ca0f5a39ff7c_originalDynamicSite1976_1(5955, (752028040106199080L ^ local1)))));
}


private boolean av() {
net.minecraft.entity.Entity forwardValue5266_15_0;
    net.minecraft.entity.passive.EntityHorse forwardValue5266_17_0;
    int forwardValue5266_23_0;
    int forwardValue5266_28_0;
    int forwardValue5266_36_0;
    int forwardValue5266_41_0;
    int forwardValue5266_45_0;
    int forwardValue5266_47_0;
    net.minecraft.entity.Entity spill5266_0;
    net.minecraft.entity.passive.EntityHorse spill5266_1;
    boolean spill5266_2;
    long life1_3;
    int life3_5;
    forward_join_47: {
    forward_join_46: {
    forward_join_45: {
    forward_join_41: {
    forward_join_36: {
    forward_join_28: {
    forward_join_23: {
    forward_join_17: {
    forward_join_15: {
    life1_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 3656559222305L);
    life3_5 = moom.vR.c();
    spill5266_0 = this.f;
    if (!((life3_5 == 0))) {
        forwardValue5266_15_0 = spill5266_0;
        break forward_join_15;
    }
    if (!((spill5266_0 == null))) {
        break forward_join_46;
    }
    spill5266_1 = this;
    if (!((life3_5 == 0))) {
        forwardValue5266_17_0 = spill5266_1;
        break forward_join_17;
    }
    forwardValue5266_15_0 = ((net.minecraft.entity.passive.EntityHorse)(spill5266_1)).g;
    }
    if (!((forwardValue5266_15_0 == null))) {
        break forward_join_46;
    }
    forwardValue5266_17_0 = this;
    }
    spill5266_2 = ((net.minecraft.entity.passive.EntityHorse)(forwardValue5266_17_0)).af__Boolean();
    if (!((life3_5 == 0))) {
        forwardValue5266_23_0 = ((spill5266_2) ? 1 : 0);
        break forward_join_23;
    }
    if (!(spill5266_2)) {
        break forward_join_46;
    }
    forwardValue5266_23_0 = ((((net.minecraft.entity.passive.EntityHorse)(this)).ae__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue5266_28_0 = forwardValue5266_23_0;
        break forward_join_28;
    }
    if (!((forwardValue5266_23_0 != 0))) {
        break forward_join_46;
    }
    forwardValue5266_28_0 = ((((net.minecraft.entity.passive.EntityHorse)(this)).au()) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue5266_36_0 = forwardValue5266_28_0;
        break forward_join_36;
    }
    if (!((forwardValue5266_28_0 == 0))) {
        break forward_join_46;
    }
    forwardValue5266_36_0 = recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.entity.passive.EntityHorse)(this)).b__sourceReturn_bc607678b6())), ((float)(((net.minecraft.entity.passive.EntityHorse)(this)).a())));
    }
    if (!((life3_5 == 0))) {
        forwardValue5266_41_0 = forwardValue5266_36_0;
        break forward_join_41;
    }
    if (!((forwardValue5266_36_0 >= 0))) {
        break forward_join_46;
    }
    forwardValue5266_41_0 = ((((net.minecraft.entity.passive.EntityHorse)(this)).ad()) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue5266_45_0 = forwardValue5266_41_0;
        break forward_join_45;
    }
    if (!((forwardValue5266_41_0 != 0))) {
        break forward_join_46;
    }
    forwardValue5266_45_0 = 1;
    }
    forwardValue5266_47_0 = forwardValue5266_45_0;
    break forward_join_47;
    }
    forwardValue5266_47_0 = 0;
    }
    return ((forwardValue5266_47_0) != 0);
}


public int w__sourceReturn_8abf5c6871() {
return this.cu;
}


public void u(boolean p0) {
long local2 = (net.minecraft.entity.passive.EntityHorse.jb ^ 105018740525358L);
    int local4 = moom.vR.b();
    if ((local4 != 0)) {
        if (p0) {
        ((net.minecraft.entity.passive.EntityHorse)(this)).t(((boolean)(false)));
    }
        ((net.minecraft.entity.passive.EntityHorse)(this)).c(((int)(__sourceIntrinsic_0b7ad1265075_invokedynamic11606_3(32401, (3286359518870693171L ^ local2)))), ((boolean)(p0)));
    }
    return;
}


public int u__sourceReturn_8abf5c6871() {
long local1 = (net.minecraft.entity.passive.EntityHorse.jb ^ 2799865995448L);
    return ((net.minecraft.entity.DataWatcher)(this.al)).a__Int(((int)(__sourceIntrinsic_94da53ec79be_originalDynamicSite1977_2(950, (2422092998860796345L ^ local1)))));
}


public void r(boolean p0) {
this.ct = ((boolean)(p0));
    return;
}


public boolean as() {
int forwardValue5263_20_0;
    int forwardValue5263_22_0;
    int spill5263_0;
    int spill5263_1;
    int spill5263_2;
    long life1_3;
    int life4_7;
    int life3_8;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life1_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 63127960677646L);
    spill5263_0 = moom.vR.c();
    life4_7 = ((net.minecraft.entity.passive.EntityHorse)(this)).t();
    life3_8 = spill5263_0;
    spill5263_1 = life4_7;
    if (!((life3_8 == 0))) {
        forwardValue5263_20_0 = spill5263_1;
        break forward_join_20;
    }
    if (!((spill5263_1 != 2))) {
        break forward_join_19;
    }
    spill5263_2 = life4_7;
    if (!((life3_8 == 0))) {
        forwardValue5263_20_0 = spill5263_2;
        break forward_join_20;
    }
    if (!((spill5263_2 == 1))) {
        break forward_join_21;
    }
    }
    forwardValue5263_20_0 = 1;
    }
    forwardValue5263_22_0 = forwardValue5263_20_0;
    break forward_join_22;
    }
    forwardValue5263_22_0 = 0;
    }
    return ((forwardValue5263_22_0) != 0);
}


public int y__sourceReturn_8abf5c6871() {
long local1 = (net.minecraft.entity.passive.EntityHorse.jb ^ 37490354908731L);
    return __sourceIntrinsic_59479448509c_originalDynamicSite1978_1(6369, (276715093827593326L ^ local1));
}


public boolean N__Boolean() {
((net.minecraft.entity.passive.EntityHorse)(this)).an();
    return (__sourceIntrinsic_booleanComparison((super.N__Boolean())) != 0);
}


public boolean an() {
int local1 = moom.Dr.b__Int(((double)(this.n)));
    int local2 = moom.Dr.b__Int(((double)(this.p)));
    ((net.minecraft.world.World)(this.i)).a__ES(((moom.DT)(new moom.DT(local1, 0, local2))));
    return true;
}


public boolean am() {
return ((((this.ct) ? 1 : 0)) != 0);
}


private void ac__sourceReturn_da8c82d5d4() {
net.minecraft.entity.passive.EntityHorse forwardValue5256_13_0;
    net.minecraft.entity.passive.EntityHorse forwardValue5256_20_0;
    net.minecraft.entity.passive.EntityHorse forwardValue5256_21_0;
    int forwardValue5256_21_1;
    net.minecraft.entity.passive.EntityHorse forwardValue5256_28_0;
    net.minecraft.entity.passive.EntityHorse spill5256_0;
    net.minecraft.entity.passive.EntityHorse spill5256_1;
    long life1_3;
    int life3_5;
    forward_join_33: {
    forward_join_28: {
    forward_join_21: {
    forward_join_20: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 52988255849759L);
    life3_5 = moom.vR.c();
    spill5256_0 = this;
    if (!((life3_5 == 0))) {
        forwardValue5256_13_0 = spill5256_0;
        break forward_join_13;
    }
    if (!((!((net.minecraft.world.World)(((net.minecraft.entity.passive.EntityHorse)(spill5256_0)).i)).G))) {
        break forward_join_33;
    }
    forwardValue5256_13_0 = this;
    }
    if (!((((moom.ws)(this.cs)).a__xW(((int)(0))) != null))) {
        forwardValue5256_20_0 = forwardValue5256_13_0;
        break forward_join_20;
    }
    forwardValue5256_21_0 = forwardValue5256_13_0;
    forwardValue5256_21_1 = 1;
    break forward_join_21;
    }
    forwardValue5256_21_0 = forwardValue5256_20_0;
    forwardValue5256_21_1 = 0;
    }
    ((net.minecraft.entity.passive.EntityHorse)(forwardValue5256_21_0)).s(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue5256_21_1))));
    spill5256_1 = this;
    if (!((life3_5 == 0))) {
        forwardValue5256_28_0 = spill5256_1;
        break forward_join_28;
    }
    if (!(((net.minecraft.entity.passive.EntityHorse)(spill5256_1)).ar())) {
        break forward_join_33;
    }
    forwardValue5256_28_0 = this;
    }
    ((net.minecraft.entity.passive.EntityHorse)(forwardValue5256_28_0)).a__sourceReturn_481e10a41f(((net.minecraft.item.ItemStack)(((moom.ws)(this.cs)).a__xW(((int)(1))))));
    }
    return;
}


private static boolean lambda$static$0(net.minecraft.entity.Entity p0) {
int forwardValue5283_14_0;
    int forwardValue5283_18_0;
    int forwardValue5283_20_0;
    int spill5283_0;
    long life1_3;
    int life3_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    forward_join_14: {
    life1_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 129425642369790L);
    life3_5 = moom.vR.c();
    spill5283_0 = ((p0 instanceof net.minecraft.entity.passive.EntityHorse) ? 1 : 0);
    if (!((life3_5 == 0))) {
        forwardValue5283_14_0 = spill5283_0;
        break forward_join_14;
    }
    if (!((spill5283_0 != 0))) {
        break forward_join_19;
    }
    forwardValue5283_14_0 = ((((net.minecraft.entity.passive.EntityHorse)(((net.minecraft.entity.passive.EntityHorse)(p0)))).al()) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue5283_18_0 = forwardValue5283_14_0;
        break forward_join_18;
    }
    if (!((forwardValue5283_14_0 != 0))) {
        break forward_join_19;
    }
    forwardValue5283_18_0 = 1;
    }
    forwardValue5283_20_0 = forwardValue5283_18_0;
    break forward_join_20;
    }
    forwardValue5283_20_0 = 0;
    }
    return ((forwardValue5283_20_0) != 0);
}


public boolean al() {
long local1 = (net.minecraft.entity.passive.EntityHorse.jb ^ 124129254222609L);
    return ((net.minecraft.entity.passive.EntityHorse)(this)).c__sourceReturn_9a6ad9dfe5(((int)(__sourceIntrinsic_2a6e380939ef_originalDynamicSite1979_1(29809, (6868544988321451469L ^ local1)))));
}


public void ai() {
long local1 = (net.minecraft.entity.passive.EntityHorse.jb ^ 103065639151057L);
    ((net.minecraft.entity.passive.EntityHorse)(this)).ah();
    java.lang.Object local3 = ((net.minecraft.entity.passive.EntityHorse)(this)).j__sourceReturn_0e30dfc966();
    if ((local3 != null)) {
        ((net.minecraft.entity.passive.EntityHorse)(this)).a(((java.lang.String)(local3)), ((float)(((net.minecraft.entity.passive.EntityHorse)(this)).f__sourceReturn_bc607678b6())), ((float)(((net.minecraft.entity.passive.EntityHorse)(this)).g__sourceReturn_bc607678b6())));
    }
    return;
}


public boolean ai__Boolean() {
long local1 = (net.minecraft.entity.passive.EntityHorse.jb ^ 126380847908247L);
    return ((net.minecraft.entity.passive.EntityHorse)(this)).c__sourceReturn_9a6ad9dfe5(((int)(__sourceIntrinsic_1d9a13f2bdf2_originalDynamicSite1980_1(25403, (6035832158400279578L ^ local1)))));
}


private void ab__sourceReturn_da8c82d5d4() {
moom.ws lexicalValue1598_62_0;
    int spill1598_0;
    moom.ws spill1598_1;
    long life1_3;
    moom.ws life4_7;
    int life3_8;
    int life5_38;
    int life6_40;
    net.minecraft.item.ItemStack life7_47;
    lexical_join_66: {
    lexical_join_62: {
    lexical_join_60: {
    life1_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 57855315856839L);
    spill1598_0 = moom.vR.c();
    life4_7 = this.cs;
    life3_8 = spill1598_0;
    this.cs = ((moom.ws)(new moom.ws("HorseChest", ((net.minecraft.entity.passive.EntityHorse)(this)).x__sourceReturn_8abf5c6871())));
    ((moom.ws)(this.cs)).a(((java.lang.String)(((net.minecraft.entity.passive.EntityHorse)(this)).a__String())));
    spill1598_1 = life4_7;
    if (!((life3_8 == 0))) {
        lexicalValue1598_62_0 = spill1598_1;
        break lexical_join_62;
    }
    if (!((spill1598_1 != null))) {
        break lexical_join_60;
    }
    ((moom.ws)(life4_7)).b(((net.minecraft.inventory.IInvBasic)(this)));
    life5_38 = java.lang.Math.min(((int)(((moom.ws)(life4_7)).b__Int())), ((int)(((moom.ws)(this.cs)).b__Int())));
    life6_40 = 0;
    lexical_cycle_38: while (true) {
    lexical_join_58: {
    lexical_join_57: {
    if (!((life6_40 < life5_38))) {
        break lexical_join_60;
    }
    life7_47 = ((moom.ws)(life4_7)).a__xW(((int)(life6_40)));
    if (!((life3_8 == 0))) {
        break lexical_join_66;
    }
    if (!((life3_8 == 0))) {
        break lexical_join_58;
    }
    if (!((life7_47 != null))) {
        break lexical_join_57;
    }
    ((moom.ws)(this.cs)).a__Void(((int)(life6_40)), ((net.minecraft.item.ItemStack)(((net.minecraft.item.ItemStack)(life7_47)).a__xW())));
    }
    life6_40 += 1;
    }
    if (!((life3_8 != 0))) { continue lexical_cycle_38; }
    break lexical_cycle_38;
    }
    }
    lexicalValue1598_62_0 = this.cs;
    }
    ((moom.ws)(lexicalValue1598_62_0)).a(((net.minecraft.inventory.IInvBasic)(this)));
    ((net.minecraft.entity.passive.EntityHorse)(this)).ac__sourceReturn_da8c82d5d4();
    }
    return;
}


public boolean aq() {
return ((((this.cG) ? 1 : 0)) != 0);
}


public void aj() {
((net.minecraft.entity.passive.EntityHorse)(this)).a(((net.minecraft.entity.Entity)(this)), ((moom.ws)(this.cs)));
    ((net.minecraft.entity.passive.EntityHorse)(this)).Z__sourceReturn_da8c82d5d4();
    return;
}


public boolean aj__Boolean() {
long local1 = (net.minecraft.entity.passive.EntityHorse.jb ^ 79084969692724L);
    return ((net.minecraft.entity.passive.EntityHorse)(this)).c__sourceReturn_9a6ad9dfe5(((int)(__sourceIntrinsic_38b6e9745148_originalDynamicSite1981_1(9487, (1648758730208999870L ^ local1)))));
}


public boolean ap() {
int forwardValue5261_17_0;
    int forwardValue5261_19_0;
    int spill5261_0;
    int spill5261_1;
    long life1_3;
    int life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 132464909475260L);
    life3_5 = moom.vR.c();
    spill5261_0 = ((net.minecraft.entity.passive.EntityHorse)(this)).t();
    if (!((life3_5 == 0))) {
        forwardValue5261_17_0 = spill5261_0;
        break forward_join_17;
    }
    if (!((spill5261_0 != 0))) {
        break forward_join_16;
    }
    spill5261_1 = ((net.minecraft.entity.passive.EntityHorse)(this)).v__sourceReturn_8abf5c6871();
    if (!((life3_5 == 0))) {
        forwardValue5261_17_0 = spill5261_1;
        break forward_join_17;
    }
    if (!((spill5261_1 > 0))) {
        break forward_join_18;
    }
    }
    forwardValue5261_17_0 = 1;
    }
    forwardValue5261_19_0 = forwardValue5261_17_0;
    break forward_join_19;
    }
    forwardValue5261_19_0 = 0;
    }
    return ((forwardValue5261_19_0) != 0);
}


private void ag() {
net.minecraft.entity.passive.EntityHorse forwardValue5259_16_0;
    net.minecraft.entity.passive.EntityHorse spill5259_0;
    long life1_3;
    int life3_5;
    forward_join_23: {
    forward_join_16: {
    life1_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 57771026709014L);
    life3_5 = moom.vR.c();
    spill5259_0 = this;
    if (!((life3_5 == 0))) {
        forwardValue5259_16_0 = spill5259_0;
        break forward_join_16;
    }
    if (!((!((net.minecraft.world.World)(((net.minecraft.entity.passive.EntityHorse)(spill5259_0)).i)).G))) {
        break forward_join_23;
    }
    this.cn = ((int)(1));
    forwardValue5259_16_0 = this;
    }
    ((net.minecraft.entity.passive.EntityHorse)(forwardValue5259_16_0)).c(((int)(__sourceIntrinsic_656831ea2ecf_invokedynamic5259_5(21790, (6129106949269978497L ^ life1_3)))), ((boolean)(true)));
    }
    return;
}


public boolean ag__Boolean() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.entity.passive.EntityHorse)(this)).ae__Boolean())) != 0);
}


private void ah() {
net.minecraft.entity.passive.EntityHorse forwardValue5260_16_0;
    net.minecraft.entity.passive.EntityHorse spill5260_0;
    long life1_3;
    int life3_5;
    forward_join_18: {
    forward_join_16: {
    life1_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 51734658585162L);
    life3_5 = moom.vR.c();
    spill5260_0 = this;
    if (!((life3_5 == 0))) {
        forwardValue5260_16_0 = spill5260_0;
        break forward_join_16;
    }
    if (!((!((net.minecraft.world.World)(((net.minecraft.entity.passive.EntityHorse)(spill5260_0)).i)).G))) {
        break forward_join_18;
    }
    this.co = ((int)(1));
    forwardValue5260_16_0 = this;
    }
    ((net.minecraft.entity.passive.EntityHorse)(forwardValue5260_16_0)).u(((boolean)(true)));
    }
    return;
}


public boolean ah__Boolean() {
return ((((this.cr) ? 1 : 0)) != 0);
}


public boolean au() {
int forwardValue5265_18_0;
    int forwardValue5265_20_0;
    boolean spill5265_0;
    int spill5265_1;
    long life1_3;
    int life3_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 73572435122327L);
    life3_5 = moom.vR.c();
    spill5265_0 = ((net.minecraft.entity.passive.EntityHorse)(this)).at();
    if (!((life3_5 == 0))) {
        forwardValue5265_18_0 = ((spill5265_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!((!spill5265_0))) {
        break forward_join_17;
    }
    spill5265_1 = ((net.minecraft.entity.passive.EntityHorse)(this)).t();
    if (!((life3_5 == 0))) {
        forwardValue5265_18_0 = spill5265_1;
        break forward_join_18;
    }
    if (!((spill5265_1 == 2))) {
        break forward_join_19;
    }
    }
    forwardValue5265_18_0 = 1;
    }
    forwardValue5265_20_0 = forwardValue5265_18_0;
    break forward_join_20;
    }
    forwardValue5265_20_0 = 0;
    }
    return ((forwardValue5265_20_0) != 0);
}


private void aa__sourceReturn_da8c82d5d4() {
net.minecraft.entity.passive.EntityHorse forwardValue5254_14_0;
    int spill5254_0;
    net.minecraft.entity.passive.EntityHorse spill5254_1;
    long life1_3;
    int life3_7;
    forward_join_30: {
    forward_join_14: {
    life1_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 7724385096092L);
    spill5254_0 = moom.vR.b();
    ((net.minecraft.entity.passive.EntityHorse)(this)).ag();
    life3_7 = spill5254_0;
    spill5254_1 = this;
    if (!((life3_7 != 0))) {
        forwardValue5254_14_0 = spill5254_1;
        break forward_join_14;
    }
    if (!((!((net.minecraft.entity.passive.EntityHorse)(spill5254_1)).f__Boolean()))) {
        break forward_join_30;
    }
    forwardValue5254_14_0 = this;
    }
    ((net.minecraft.world.World)(((net.minecraft.entity.passive.EntityHorse)(forwardValue5254_14_0)).i)).a(((net.minecraft.entity.Entity)(this)), ((java.lang.String)("eating")), ((float)(0x1.0p0f)), ((float)((0x1.0p0f + ((((java.util.Random)(this.ah)).nextFloat() - ((java.util.Random)(this.ah)).nextFloat()) * 0x1.99999ap-3f)))));
    }
    return;
}


public void G() {
int forwardValue5235_24_0;
    int forwardValue5235_35_0;
    int forwardValue5235_48_0;
    net.minecraft.entity.passive.EntityHorse forwardValue5235_93_0;
    int forwardValue5235_94_0;
    int forwardValue5235_120_0;
    int forwardValue5235_125_0;
    int forwardValue5235_132_0;
    net.minecraft.entity.passive.EntityHorse forwardValue5235_137_0;
    net.minecraft.entity.passive.EntityHorse forwardValue5235_143_0;
    net.minecraft.entity.passive.EntityHorse forwardValue5235_151_0;
    int spill5235_0;
    int spill5235_1;
    net.minecraft.entity.passive.EntityHorse spill5235_2;
    int spill5235_3;
    net.minecraft.entity.passive.EntityHorse spill5235_4;
    int spill5235_5;
    net.minecraft.entity.passive.EntityHorse spill5235_6;
    net.minecraft.entity.passive.EntityHorse spill5235_7;
    long life1_3;
    int life3_5;
    net.minecraft.entity.passive.EntityHorse life4_215;
    forward_join_155: {
    forward_join_151: {
    forward_join_143: {
    forward_join_137: {
    forward_join_132: {
    forward_join_125: {
    forward_join_120: {
    forward_join_118: {
    forward_join_94: {
    forward_join_93: {
    forward_join_92: {
    forward_join_48: {
    forward_join_46: {
    forward_join_35: {
    forward_join_24: {
    forward_join_19: {
    life1_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 26056379607654L);
    life3_5 = moom.vR.c();
    spill5235_0 = ((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_c7b45e3c376e_invokedynamic5235_3(30143, (1260934450524294493L ^ life1_3)))));
    if (!((life3_5 == 0))) {
        forwardValue5235_24_0 = spill5235_0;
        break forward_join_24;
    }
    if (!((spill5235_0 == 0))) {
        break forward_join_19;
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).af();
    }
    super.G();
    forwardValue5235_24_0 = ((((net.minecraft.world.World)(this.i)).G) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue5235_35_0 = forwardValue5235_24_0;
        break forward_join_35;
    }
    if (!((forwardValue5235_24_0 == 0))) {
        break forward_join_155;
    }
    forwardValue5235_35_0 = ((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_c7b45e3c376e_invokedynamic5235_11(1340, (2869708550112706018L ^ life1_3)))));
    }
    if (!((life3_5 == 0))) {
        forwardValue5235_48_0 = forwardValue5235_35_0;
        break forward_join_48;
    }
    if (!((forwardValue5235_35_0 == 0))) {
        break forward_join_46;
    }
    spill5235_1 = this.aR;
    if (!((life3_5 == 0))) {
        forwardValue5235_48_0 = spill5235_1;
        break forward_join_48;
    }
    if (!((spill5235_1 == 0))) {
        break forward_join_46;
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).c(((float)(0x1.0p0f)));
    }
    forwardValue5235_48_0 = ((((net.minecraft.entity.passive.EntityHorse)(this)).aj__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue5235_94_0 = forwardValue5235_48_0;
        break forward_join_94;
    }
    if (!((forwardValue5235_48_0 == 0))) {
        break forward_join_92;
    }
    spill5235_2 = this;
    if (!((life3_5 == 0))) {
        forwardValue5235_93_0 = spill5235_2;
        break forward_join_93;
    }
    if (!((((net.minecraft.entity.passive.EntityHorse)(spill5235_2)).f == null))) {
        break forward_join_92;
    }
    spill5235_3 = ((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_c7b45e3c376e_invokedynamic5235_19(420, (4846515531180341618L ^ life1_3)))));
    if (!((life3_5 == 0))) {
        forwardValue5235_94_0 = spill5235_3;
        break forward_join_94;
    }
    if (!((spill5235_3 == 0))) {
        break forward_join_92;
    }
    spill5235_4 = this;
    if (!((life3_5 == 0))) {
        forwardValue5235_93_0 = spill5235_4;
        break forward_join_93;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(((net.minecraft.entity.passive.EntityHorse)(spill5235_4)).i)).a__fE(((moom.DT)(new moom.DT(moom.Dr.b__Int(((double)(this.n))), (moom.Dr.b__Int(((double)(this.o))) - 1), moom.Dr.b__Int(((double)(this.p))))))))).a__ch() == net.minecraft.init.Blocks.c))) {
        break forward_join_92;
    }
    ((net.minecraft.entity.passive.EntityHorse)(this)).t(((boolean)(true)));
    }
    forwardValue5235_93_0 = this;
    }
    forwardValue5235_94_0 = ((((net.minecraft.entity.passive.EntityHorse)(forwardValue5235_93_0)).aj__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue5235_120_0 = forwardValue5235_94_0;
        break forward_join_120;
    }
    if (!((forwardValue5235_94_0 != 0))) {
        break forward_join_118;
    }
    net.minecraft.entity.passive.EntityHorse __stackOp5235_34_0 = this;
    net.minecraft.entity.passive.EntityHorse __stackOp5235_36_0 = __stackOp5235_34_0;
    int __stackOp5235_36_1 = (((net.minecraft.entity.passive.EntityHorse)(__stackOp5235_34_0)).cm + 1);
    spill5235_5 = __stackOp5235_36_1;
    ((net.minecraft.entity.passive.EntityHorse)(__stackOp5235_36_0)).cm = ((int)(__stackOp5235_36_1));
    if (!((life3_5 == 0))) {
        forwardValue5235_120_0 = spill5235_5;
        break forward_join_120;
    }
    if (!((spill5235_5 > __sourceIntrinsic_c7b45e3c376e_invokedynamic5235_38(7748, (5724868819346744976L ^ life1_3))))) {
        break forward_join_118;
    }
    this.cm = ((int)(0));
    ((net.minecraft.entity.passive.EntityHorse)(this)).t(((boolean)(false)));
    }
    forwardValue5235_120_0 = ((((net.minecraft.entity.passive.EntityHorse)(this)).al()) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue5235_125_0 = forwardValue5235_120_0;
        break forward_join_125;
    }
    if (!((forwardValue5235_120_0 != 0))) {
        break forward_join_155;
    }
    forwardValue5235_125_0 = ((((net.minecraft.entity.passive.EntityHorse)(this)).ae__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue5235_132_0 = forwardValue5235_125_0;
        break forward_join_132;
    }
    if (!((forwardValue5235_125_0 == 0))) {
        break forward_join_155;
    }
    spill5235_6 = this;
    if (!((life3_5 == 0))) {
        forwardValue5235_137_0 = spill5235_6;
        break forward_join_137;
    }
    forwardValue5235_132_0 = ((((net.minecraft.entity.passive.EntityHorse)(spill5235_6)).aj__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue5235_132_0 == 0))) {
        break forward_join_155;
    }
    forwardValue5235_137_0 = ((net.minecraft.entity.passive.EntityHorse)(this)).a(((net.minecraft.entity.Entity)(this)), ((double)(0x1.0p4d)));
    }
    life4_215 = forwardValue5235_137_0;
    spill5235_7 = life4_215;
    if (!((life3_5 == 0))) {
        forwardValue5235_143_0 = spill5235_7;
        break forward_join_143;
    }
    if (!((spill5235_7 != null))) {
        break forward_join_155;
    }
    forwardValue5235_143_0 = this;
    }
    if (!((life3_5 == 0))) {
        forwardValue5235_151_0 = forwardValue5235_143_0;
        break forward_join_151;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.entity.passive.EntityHorse)(forwardValue5235_143_0)).a(((net.minecraft.entity.Entity)(life4_215))))), ((double)(0x1.0p2d))) > 0))) {
        break forward_join_155;
    }
    forwardValue5235_151_0 = this;
    }
    ((moom.AV)(((net.minecraft.entity.passive.EntityHorse)(forwardValue5235_151_0)).bI)).a(((net.minecraft.entity.Entity)(life4_215)));
    }
    return;
}


private void af() {
this.cp = ((int)(1));
    return;
}


public boolean af__Boolean() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.entity.passive.EntityHorse)(this)).c__sourceReturn_9a6ad9dfe5(((int)(2))))) != 0);
}


public boolean ar() {
int forwardValue5262_12_0;
    int forwardValue5262_14_0;
    int spill5262_0;
    long life1_3;
    int life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (net.minecraft.entity.passive.EntityHorse.jb ^ 94191486657709L);
    life3_5 = moom.vR.c();
    spill5262_0 = ((net.minecraft.entity.passive.EntityHorse)(this)).t();
    if (!((life3_5 == 0))) {
        forwardValue5262_12_0 = spill5262_0;
        break forward_join_12;
    }
    if (!((spill5262_0 == 0))) {
        break forward_join_13;
    }
    forwardValue5262_12_0 = 1;
    }
    forwardValue5262_14_0 = forwardValue5262_12_0;
    break forward_join_14;
    }
    forwardValue5262_14_0 = 0;
    }
    return ((forwardValue5262_14_0) != 0);
}


private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1879_52() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1879_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1879_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1879_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1879_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1879_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1879_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45b8980b0bacf351_originalDynamicSite3383_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45b8980b0bacf351_originalDynamicSite3383_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45b8980b0bacf351_originalDynamicSite3383_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c7b45e3c376e_invokedynamic5235_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c7b45e3c376e_invokedynamic5235_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c7b45e3c376e_invokedynamic5235_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c7b45e3c376e_invokedynamic5235_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6121ff5511c4_invokedynamic669_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6121ff5511c4_invokedynamic669_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee3181e06a41_invokedynamic5240_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_07d6d39f9236_invokedynamic26_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_07d6d39f9236_invokedynamic26_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_07d6d39f9236_invokedynamic26_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_07d6d39f9236_invokedynamic26_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_07d6d39f9236_invokedynamic26_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_07d6d39f9236_invokedynamic26_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a7918f27299c_invokedynamic5242_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a7918f27299c_invokedynamic5242_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a7918f27299c_invokedynamic5242_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a7918f27299c_invokedynamic5242_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a7918f27299c_invokedynamic5242_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a7918f27299c_invokedynamic5242_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a7918f27299c_invokedynamic5242_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a7918f27299c_invokedynamic5242_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a7918f27299c_invokedynamic5242_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_31a05ff9bc6d_invokedynamic5244_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5f56e65a234d_originalDynamicSite1970_2(int a0, long a1) throws E;

private static native <E extends Throwable> boolean __sourceIntrinsic_d6a7991b4c91_call5250_23(net.minecraft.entity.passive.EntityHorse a0, net.minecraft.entity.player.EntityPlayer a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d6a7991b4c91_invokedynamic5250_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d6a7991b4c91_invokedynamic5250_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d6a7991b4c91_invokedynamic5250_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d6a7991b4c91_invokedynamic5250_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d6a7991b4c91_invokedynamic5250_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d6a7991b4c91_invokedynamic5250_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d6a7991b4c91_invokedynamic5250_63(int a0, long a1) throws E;

private static native <E extends Throwable> boolean __sourceIntrinsic_d6a7991b4c91_call5250_130(net.minecraft.entity.passive.EntityHorse a0, net.minecraft.entity.player.EntityPlayer a1) throws E;

private static native <E extends Throwable> boolean __sourceIntrinsic_153a193fc182_call5251_7(net.minecraft.entity.passive.EntityHorse a0, net.minecraft.util.DamageSource a1, float a2) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a350cb83cc16_invokedynamic5257_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a350cb83cc16_invokedynamic5257_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a350cb83cc16_invokedynamic5257_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a350cb83cc16_invokedynamic5257_17(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a350cb83cc16_invokedynamic5257_25(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a350cb83cc16_invokedynamic5257_29(java.lang.String a0, int a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a350cb83cc16_invokedynamic5257_38(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_656831ea2ecf_invokedynamic5259_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1d9a13f2bdf2_originalDynamicSite1980_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_38b6e9745148_originalDynamicSite1981_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ca0f5a39ff7c_originalDynamicSite1976_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2a6e380939ef_originalDynamicSite1979_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d1c1922d1ba0_originalDynamicSite1962_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7722627b66bb_invokedynamic5269_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7722627b66bb_invokedynamic5269_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7722627b66bb_invokedynamic5269_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d1398b4921c0_originalDynamicSite1963_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63673aced462_invokedynamic5270_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_42305bc53e1c_invokedynamic5918_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_42305bc53e1c_invokedynamic5918_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_42305bc53e1c_invokedynamic5918_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic1599_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic1599_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic1599_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic1599_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic1599_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1969_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1969_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1969_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1969_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1969_18(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_c23f50d43b1e_call5276_105(net.minecraft.entity.passive.EntityHorse a0, float a1, float a2) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b6d2aa37fd7d_originalDynamicSite1964_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_ec881c4a524b_methodHandleLiteral11579_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic5277_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic5277_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic5277_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic5277_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic5277_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic5277_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fc475de8b950_invokedynamic5280_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d0e131a72963_originalDynamicSite1968_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_40c7d890f800_originalDynamicSite1966_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_40c7d890f800_originalDynamicSite1966_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e3ce5c7e7d84_originalDynamicSite1967_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_11645c1a30d8_originalDynamicSite1965_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e0479935b9b5_originalDynamicSite1971_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_335dd01b6fe5_originalDynamicSite1972_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_012f1ac8dd86_invokedynamic5284_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f6925daff8ea_originalDynamicSite1975_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cd276fc49293_originalDynamicSite1973_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_94da53ec79be_originalDynamicSite1977_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0b7ad1265075_invokedynamic11606_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0585f56d802f_originalDynamicSite1974_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c0134c48c594_invokedynamic1601_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eee0b6aee450_invokedynamic5287_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_59479448509c_originalDynamicSite1978_1(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native net.minecraft.item.Item __sourceExactCall_42e37b9acc15b0(net.minecraft.block.Block p0);
private static native boolean __sourceExactCall_28cca1ad76a52a(net.minecraft.item.Item p0);
private static native net.minecraft.item.ItemStack __sourceExactCall_b20cc06766c170(net.minecraft.nbt.NBTTagCompound p0);
private static native net.minecraft.block.Block __sourceExactCall_3c55b55d648265(net.minecraft.item.Item p0);

private static native boolean __sourceExactCall_21cc6ea71b9757(net.minecraft.entity.passive.EntityHorse p0, net.minecraft.util.DamageSource p1, float p2);
private static native boolean __sourceExactCall_4b74618998ea07(net.minecraft.entity.Entity p0, net.minecraft.util.DamageSource p1, float p2);
private static native net.minecraft.entity.ai.attributes.IAttributeInstance __sourceExactCall_dba86182f7a600(net.minecraft.entity.passive.EntityHorse p0, net.minecraft.entity.ai.attributes.IAttribute p1);
private static native net.minecraft.entity.ai.attributes.IAttributeInstance __sourceExactCall_78faa497e49b2d(moom.sJ p0, net.minecraft.entity.ai.attributes.IAttribute p1);
private static native void __sourceExactCall_d2390726a67678(net.minecraft.entity.ai.attributes.IAttributeInstance p0, double p1);

private static native void __sourceExactCall_ae34dbea601cc3(net.minecraft.entity.ai.EntityAITasks p0, int p1, moom.uc p2);
private static native void __sourceExactCall_9dfdb54eea9b0d(net.minecraft.entity.passive.EntityHorse p0);

private static native moom.AV __sourceExactCall_69c3d1a2c98d20(net.minecraft.entity.passive.EntityHorse p0);
}
