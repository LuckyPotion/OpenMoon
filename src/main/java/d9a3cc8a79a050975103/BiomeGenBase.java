package net.minecraft.world.biome;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class BiomeGenBase {

private static org.apache.logging.log4j.Logger a;

protected static net.minecraft.world.biome.BiomeGenBase$Height b;

protected static net.minecraft.world.biome.BiomeGenBase$Height c;

protected static net.minecraft.world.biome.BiomeGenBase$Height d;

protected static net.minecraft.world.biome.BiomeGenBase$Height e;

protected static net.minecraft.world.biome.BiomeGenBase$Height f;

protected static net.minecraft.world.biome.BiomeGenBase$Height g;

protected static net.minecraft.world.biome.BiomeGenBase$Height h;

protected static net.minecraft.world.biome.BiomeGenBase$Height i;

protected static net.minecraft.world.biome.BiomeGenBase$Height j;

protected static net.minecraft.world.biome.BiomeGenBase$Height k;

protected static net.minecraft.world.biome.BiomeGenBase$Height l;

protected static net.minecraft.world.biome.BiomeGenBase$Height m;

protected static net.minecraft.world.biome.BiomeGenBase$Height n;

private static net.minecraft.world.biome.BiomeGenBase[] o;

public static java.util.Set<net.minecraft.world.biome.BiomeGenBase> p;

public static java.util.Map<java.lang.String, net.minecraft.world.biome.BiomeGenBase> q;

public static net.minecraft.world.biome.BiomeGenBase r;

public static net.minecraft.world.biome.BiomeGenBase s;

public static net.minecraft.world.biome.BiomeGenBase t;

public static net.minecraft.world.biome.BiomeGenBase u;

public static net.minecraft.world.biome.BiomeGenBase v;

public static net.minecraft.world.biome.BiomeGenBase w;

public static net.minecraft.world.biome.BiomeGenBase x;

public static net.minecraft.world.biome.BiomeGenBase y;

public static net.minecraft.world.biome.BiomeGenBase z;

public static net.minecraft.world.biome.BiomeGenBase A;

public static net.minecraft.world.biome.BiomeGenBase B;

public static net.minecraft.world.biome.BiomeGenBase C;

public static net.minecraft.world.biome.BiomeGenBase D;

public static net.minecraft.world.biome.BiomeGenBase E;

public static net.minecraft.world.biome.BiomeGenBase F;

public static net.minecraft.world.biome.BiomeGenBase G;

public static net.minecraft.world.biome.BiomeGenBase H;

public static net.minecraft.world.biome.BiomeGenBase I;

public static net.minecraft.world.biome.BiomeGenBase J;

public static net.minecraft.world.biome.BiomeGenBase K;

public static net.minecraft.world.biome.BiomeGenBase L;

public static net.minecraft.world.biome.BiomeGenBase M;

public static net.minecraft.world.biome.BiomeGenBase N;

public static net.minecraft.world.biome.BiomeGenBase O;

public static net.minecraft.world.biome.BiomeGenBase P;

public static net.minecraft.world.biome.BiomeGenBase Q;

public static net.minecraft.world.biome.BiomeGenBase R;

public static net.minecraft.world.biome.BiomeGenBase S;

public static net.minecraft.world.biome.BiomeGenBase T;

public static net.minecraft.world.biome.BiomeGenBase U;

public static net.minecraft.world.biome.BiomeGenBase V;

public static net.minecraft.world.biome.BiomeGenBase W;

public static net.minecraft.world.biome.BiomeGenBase X;

public static net.minecraft.world.biome.BiomeGenBase Y;

public static net.minecraft.world.biome.BiomeGenBase Z;

public static net.minecraft.world.biome.BiomeGenBase aa;

public static net.minecraft.world.biome.BiomeGenBase ab;

public static net.minecraft.world.biome.BiomeGenBase ac;

public static net.minecraft.world.biome.BiomeGenBase ad;

public static net.minecraft.world.biome.BiomeGenBase ae;

public static net.minecraft.world.biome.BiomeGenBase af;

protected static moom.FW ag;

protected static moom.FW ah;

protected static moom.Gi ai;

public java.lang.String aj;

public int ak;

public int al;

public net.minecraft.block.state.IBlockState am;

public net.minecraft.block.state.IBlockState an;

public int ao;

public float ap;

public float aq;

public float ar;

public float as;

public int at;

public moom.EQ au;

protected java.util.List<moom.D7> av;

protected java.util.List<moom.D7> aw;

protected java.util.List<moom.D7> ax;

protected java.util.List<moom.D7> ay;

protected boolean az;

protected boolean aA;

public int aB;

protected moom.Ga aC;

protected moom.F1 aD;

protected moom.F8 aE;

private static int[] aF;

private static long bb;

private static long[] db;

private static java.lang.Integer[] eb;

private static java.util.Map fb;

protected BiomeGenBase(int p0) { super(); }


private static void __sourceConstructorBody_1e2b23cb70f652bb(net.minecraft.world.biome.BiomeGenBase receiver, int p0) throws Throwable {

long local2 = (net.minecraft.world.biome.BiomeGenBase.bb ^ 123166968437422L);

    net.minecraft.world.biome.BiomeGenBase.__sourceConstructorInit_1e2b23cb70f652bb_0(((net.minecraft.world.biome.BiomeGenBase)(receiver)));

    ((net.minecraft.world.biome.BiomeGenBase)(receiver)).am = ((net.minecraft.block.state.IBlockState)(((moom.dC)(net.minecraft.init.Blocks.c)).a__fE()));

    ((net.minecraft.world.biome.BiomeGenBase)(receiver)).an = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)).a__fE()));

    ((net.minecraft.world.biome.BiomeGenBase)(receiver)).ao = ((int)(__sourceIntrinsic_1e2b23cb70f652bb_originalDynamicSite3520_8(20460, (4820017276995063122L ^ local2))));

    ((net.minecraft.world.biome.BiomeGenBase)(receiver)).ap = ((float)(((net.minecraft.world.biome.BiomeGenBase$Height)(net.minecraft.world.biome.BiomeGenBase.b)).a));

    ((net.minecraft.world.biome.BiomeGenBase)(receiver)).aq = ((float)(((net.minecraft.world.biome.BiomeGenBase$Height)(net.minecraft.world.biome.BiomeGenBase.b)).b));

    ((net.minecraft.world.biome.BiomeGenBase)(receiver)).ar = ((float)(0x1.0p-1f));

    ((net.minecraft.world.biome.BiomeGenBase)(receiver)).as = ((float)(0x1.0p-1f));

    ((net.minecraft.world.biome.BiomeGenBase)(receiver)).at = ((int)(__sourceIntrinsic_1e2b23cb70f652bb_originalDynamicSite3520_18(14640, (7273246458235894666L ^ local2))));

    ((net.minecraft.world.biome.BiomeGenBase)(receiver)).av = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    ((net.minecraft.world.biome.BiomeGenBase)(receiver)).aw = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    ((net.minecraft.world.biome.BiomeGenBase)(receiver)).ax = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    ((net.minecraft.world.biome.BiomeGenBase)(receiver)).ay = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    ((net.minecraft.world.biome.BiomeGenBase)(receiver)).aA = ((boolean)(true));

    ((net.minecraft.world.biome.BiomeGenBase)(receiver)).aC = ((moom.Ga)(new moom.Ga(false)));

    ((net.minecraft.world.biome.BiomeGenBase)(receiver)).aD = ((moom.F1)(new moom.F1(false)));

    ((net.minecraft.world.biome.BiomeGenBase)(receiver)).aE = ((moom.F8)(new moom.F8()));

    ((net.minecraft.world.biome.BiomeGenBase)(receiver)).aB = ((int)(p0));

    (net.minecraft.world.biome.BiomeGenBase.o)[p0] = receiver;

    ((net.minecraft.world.biome.BiomeGenBase)(receiver)).au = ((moom.EQ)(((net.minecraft.world.biome.BiomeGenBase)(receiver)).a__EQ()));

    ((java.util.List)(((net.minecraft.world.biome.BiomeGenBase)(receiver)).aw)).add(((java.lang.Object)(new moom.D7(net.minecraft.entity.passive.EntitySheep.class, __sourceIntrinsic_1e2b23cb70f652bb_originalDynamicSite3520_38(30128, (301683009098053416L ^ local2)), 4, 4))));

    ((java.util.List)(((net.minecraft.world.biome.BiomeGenBase)(receiver)).aw)).add(((java.lang.Object)(new moom.D7(net.minecraft.entity.passive.EntityRabbit.class, __sourceIntrinsic_1e2b23cb70f652bb_originalDynamicSite3520_42(10374, (6286348065813473813L ^ local2)), 3, 3))));

    ((java.util.List)(((net.minecraft.world.biome.BiomeGenBase)(receiver)).aw)).add(((java.lang.Object)(new moom.D7(net.minecraft.entity.passive.EntityPig.class, __sourceIntrinsic_1e2b23cb70f652bb_originalDynamicSite3520_46(31060, (5490428754721995748L ^ local2)), 4, 4))));

    ((java.util.List)(((net.minecraft.world.biome.BiomeGenBase)(receiver)).aw)).add(((java.lang.Object)(new moom.D7(net.minecraft.entity.passive.EntityChicken.class, __sourceIntrinsic_1e2b23cb70f652bb_originalDynamicSite3520_50(31060, (5490428754721995748L ^ local2)), 4, 4))));

    ((java.util.List)(((net.minecraft.world.biome.BiomeGenBase)(receiver)).aw)).add(((java.lang.Object)(new moom.D7(moom.sM.class, __sourceIntrinsic_1e2b23cb70f652bb_originalDynamicSite3520_54(1618, (2393769544903787721L ^ local2)), 4, 4))));

    ((java.util.List)(((net.minecraft.world.biome.BiomeGenBase)(receiver)).av)).add(((java.lang.Object)(new moom.D7(moom.s9.class, __sourceIntrinsic_1e2b23cb70f652bb_originalDynamicSite3520_58(3238, (2693001720504684115L ^ local2)), 4, 4))));

    ((java.util.List)(((net.minecraft.world.biome.BiomeGenBase)(receiver)).av)).add(((java.lang.Object)(new moom.D7(net.minecraft.entity.monster.EntityZombie.class, __sourceIntrinsic_1e2b23cb70f652bb_originalDynamicSite3520_62(8503, (1937588063472231333L ^ local2)), 4, 4))));

    ((java.util.List)(((net.minecraft.world.biome.BiomeGenBase)(receiver)).av)).add(((java.lang.Object)(new moom.D7(net.minecraft.entity.monster.EntitySkeleton.class, __sourceIntrinsic_1e2b23cb70f652bb_originalDynamicSite3520_66(8503, (1937588063472231333L ^ local2)), 4, 4))));

    ((java.util.List)(((net.minecraft.world.biome.BiomeGenBase)(receiver)).av)).add(((java.lang.Object)(new moom.D7(net.minecraft.entity.monster.EntityCreeper.class, __sourceIntrinsic_1e2b23cb70f652bb_originalDynamicSite3520_70(8503, (1937588063472231333L ^ local2)), 4, 4))));

    ((java.util.List)(((net.minecraft.world.biome.BiomeGenBase)(receiver)).av)).add(((java.lang.Object)(new moom.D7(net.minecraft.entity.monster.EntitySlime.class, __sourceIntrinsic_1e2b23cb70f652bb_originalDynamicSite3520_74(8503, (1937588063472231333L ^ local2)), 4, 4))));

    ((java.util.List)(((net.minecraft.world.biome.BiomeGenBase)(receiver)).av)).add(((java.lang.Object)(new moom.D7(net.minecraft.entity.monster.EntityEnderman.class, __sourceIntrinsic_1e2b23cb70f652bb_originalDynamicSite3520_78(31060, (5490428754721995748L ^ local2)), 1, 4))));

    ((java.util.List)(((net.minecraft.world.biome.BiomeGenBase)(receiver)).av)).add(((java.lang.Object)(new moom.D7(moom.ta.class, 5, 1, 1))));

    ((java.util.List)(((net.minecraft.world.biome.BiomeGenBase)(receiver)).ax)).add(((java.lang.Object)(new moom.D7(moom.tl.class, __sourceIntrinsic_1e2b23cb70f652bb_originalDynamicSite3520_85(31060, (5490428754721995748L ^ local2)), 4, 4))));

    ((java.util.List)(((net.minecraft.world.biome.BiomeGenBase)(receiver)).ay)).add(((java.lang.Object)(new moom.D7(net.minecraft.entity.passive.EntityBat.class, __sourceIntrinsic_1e2b23cb70f652bb_originalDynamicSite3520_89(31060, (5490428754721995748L ^ local2)), __sourceIntrinsic_1e2b23cb70f652bb_originalDynamicSite3520_90(10274, (6369596987851582141L ^ local2)), __sourceIntrinsic_1e2b23cb70f652bb_originalDynamicSite3520_91(10274, (6369596987851582141L ^ local2))))));

    return;

}



static {
bb = ((long)(((moom._a)(moom._c.a(((long)(-8707768107054597512L)), ((long)(-945776472263026260L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(92978525494535L)))));
    long local22_life6 = (net.minecraft.world.biome.BiomeGenBase.bb ^ 4060564955169L);
    java.lang.Object __sourceSpill1215_8 = null;
    fb = ((java.util.Map)(new java.util.HashMap(13)));
    net.minecraft.world.biome.BiomeGenBase.b(((int[])(__sourceSpill1215_8)));
    javax.crypto.Cipher local11_life11;
    javax.crypto.Cipher __sourceSpill1215_13 = (local11_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1215_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1215_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1215_16 = new byte[8];
    (__sourceSpill1215_16)[0] = ((byte) ((int) (local22_life6 >>> 56)));
    int local12_life17 = 1;
    while ((local12_life17 < 8)) {
        (__sourceSpill1215_16)[local12_life17] = ((byte) ((int) ((local22_life6 << (local12_life17 * 8)) >>> 56)));
        local12_life17 += 1;
    }
    byte[] __sourcePreallocation1215_18 = __sourceSpill1215_16;
    ((javax.crypto.Cipher)(__sourceSpill1215_13)).init(((int)(__sourceSpill1215_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1215_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1215_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local17_life21 = new long[94];
    int local14_life22 = 0;
    java.lang.String local15_life23;
    int local16_life25 = ((java.lang.String)((local15_life23 = "¯\026¨\021\036ÿ\røP\020bgî#¾\024Êõ¹¤Qº\020v;éOÀMzÂd×û#\002ïÓo637æP'çº\035(=LÖmepê¬Ä_â¹Bé%\027öî{\021·­JÝÄy\026uÓÜ\026\033¤Ràý\022TåãmR\004¶­ÝÔ7\002=ªuMÃÙ¹]ú`n.çJ©àâ\006ò³Õñ8ÐÎ'ÖV÷È¬ñi\022fÅ&è\n6\033WÇ58ï$\"vCÄ¦û\001ÎÙ<eB\017½b3«À\036\002Ö2eÒ\b¼DIOx·Ó\004ènðÚÇÕ¿9pVââM_oß\030j.þ{\026ês`Äö/oñ\035$ÕûÁ0I\r9*¢Ñ9oÓ/ô\003º\000hêØ«\016ï\027ÿÜñÚ(þÈÇbüÔVD\030h;\\®6¥Âøl\r§\031÷kt\035\034YÍ¬ºÇÒÇÃëñ¶ü\0250·µ()\022¥v!²ò¢\r\024È\027u£H »Hg\031xðÛq\024hÌÝwûëÿäÈäD@ñíf9zL8|DN¢­\030H²?Xßþ6ñmûÑy¶áámÈ\001:¬È\005ÏÄ·ÉP&ÂP\177\022úþÓ®k>@X±ø%\004}º%*\013M4Ü!÷ûH£öHúà\0203A^Ê¦<í·\021Ülð§<ü\025\030\036à»jöL\016}½¶õþeµõìZÞÖA:X¡íÕ«±AÂ¥\030Q°à{iÚNS\020Ã[Æ¸iCi÷Ý\001zÝ÷H%­ï)ÅÑÅÚ\n\036Üeã#_µv4eÐ\000%ªñ\\Q-IR¿ºéTg?¹$*GË-f\\k%ÃÑÊ'pýÉSq?ÑMÏ\b´s\022\002±eRñ²Yé\037ÑÅ\021\032\024(f\003#Ö~¾©àû\022ï\031ÎD>\032\020ÚßÈ^¦\000í3SãÓdo\f\006\033\004¾KÝoVÇÞé\bñ-ð­÷í·qh'r\033dÐ-(W±~²âæÜo[\020:(WÅ\016\020ã0 Ã¯}:ZÉu:*\006ñf<\031d\005ÿDÚ¹\031Ý¾î`b"))).length();
    int local13_life26 = 0;
    do {
        java.lang.String __sourceSpill1215_27 = local15_life23;
        int __sourceSpill1215_28 = local13_life26;
        local13_life26 += 8;
        byte[] local18_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1215_27)).substring(((int)(__sourceSpill1215_28)), ((int)(local13_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1215_32 = local17_life21;
        int __sourceSpill1215_33 = local14_life22;
        local14_life22 += 1;
        long local19_life34 = (((((((((((long) (local18_life31)[0]) & 255L) << 56) | ((((long) (local18_life31)[1]) & 255L) << 48)) | ((((long) (local18_life31)[2]) & 255L) << 40)) | ((((long) (local18_life31)[3]) & 255L) << 32)) | ((((long) (local18_life31)[4]) & 255L) << 24)) | ((((long) (local18_life31)[5]) & 255L) << 16)) | ((((long) (local18_life31)[6]) & 255L) << 8)) | (((long) (local18_life31)[7]) & 255L));
        byte[] __sourceSpill1215_35 = new byte[8];
        (__sourceSpill1215_35)[0] = ((byte) ((int) (local19_life34 >>> 56)));
        (__sourceSpill1215_35)[1] = ((byte) ((int) (local19_life34 >>> 48)));
        (__sourceSpill1215_35)[2] = ((byte) ((int) (local19_life34 >>> 40)));
        (__sourceSpill1215_35)[3] = ((byte) ((int) (local19_life34 >>> 32)));
        (__sourceSpill1215_35)[4] = ((byte) ((int) (local19_life34 >>> 24)));
        (__sourceSpill1215_35)[5] = ((byte) ((int) (local19_life34 >>> 16)));
        (__sourceSpill1215_35)[6] = ((byte) ((int) (local19_life34 >>> 8)));
        (__sourceSpill1215_35)[7] = ((byte) ((int) local19_life34));
        javax.crypto.Cipher __sourceSpill1215_36 = local11_life11;
        byte[] local21_life38 = ((javax.crypto.Cipher)(__sourceSpill1215_36)).doFinal(((byte[])(__sourceSpill1215_35)));
        (__sourceSpill1215_32)[__sourceSpill1215_33] = (((((((((((long) (local21_life38)[0]) & 255L) << 56) | ((((long) (local21_life38)[1]) & 255L) << 48)) | ((((long) (local21_life38)[2]) & 255L) << 40)) | ((((long) (local21_life38)[3]) & 255L) << 32)) | ((((long) (local21_life38)[4]) & 255L) << 24)) | ((((long) (local21_life38)[5]) & 255L) << 16)) | ((((long) (local21_life38)[6]) & 255L) << 8)) | (((long) (local21_life38)[7]) & 255L));
    } while ((!(local13_life26 >= local16_life25)));
    local16_life25 = ((java.lang.String)((local15_life23 = "J,à¨\026*¤õÔZÕü"))).length();
    local13_life26 = 0;
    do {
        java.lang.String __sourceSpill1215_40 = local15_life23;
        int __sourceSpill1215_41 = local13_life26;
        local13_life26 += 8;
        byte[] local18_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1215_40)).substring(((int)(__sourceSpill1215_41)), ((int)(local13_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1215_45 = local17_life21;
        int __sourceSpill1215_46 = local14_life22;
        local14_life22 += 1;
        long local19_life47 = (((((((((((long) (local18_life44)[0]) & 255L) << 56) | ((((long) (local18_life44)[1]) & 255L) << 48)) | ((((long) (local18_life44)[2]) & 255L) << 40)) | ((((long) (local18_life44)[3]) & 255L) << 32)) | ((((long) (local18_life44)[4]) & 255L) << 24)) | ((((long) (local18_life44)[5]) & 255L) << 16)) | ((((long) (local18_life44)[6]) & 255L) << 8)) | (((long) (local18_life44)[7]) & 255L));
        byte[] __sourceSpill1215_48 = new byte[8];
        (__sourceSpill1215_48)[0] = ((byte) ((int) (local19_life47 >>> 56)));
        (__sourceSpill1215_48)[1] = ((byte) ((int) (local19_life47 >>> 48)));
        (__sourceSpill1215_48)[2] = ((byte) ((int) (local19_life47 >>> 40)));
        (__sourceSpill1215_48)[3] = ((byte) ((int) (local19_life47 >>> 32)));
        (__sourceSpill1215_48)[4] = ((byte) ((int) (local19_life47 >>> 24)));
        (__sourceSpill1215_48)[5] = ((byte) ((int) (local19_life47 >>> 16)));
        (__sourceSpill1215_48)[6] = ((byte) ((int) (local19_life47 >>> 8)));
        (__sourceSpill1215_48)[7] = ((byte) ((int) local19_life47));
        javax.crypto.Cipher __sourceSpill1215_49 = local11_life11;
        byte[] local21_life51 = ((javax.crypto.Cipher)(__sourceSpill1215_49)).doFinal(((byte[])(__sourceSpill1215_48)));
        (__sourceSpill1215_45)[__sourceSpill1215_46] = (((((((((((long) (local21_life51)[0]) & 255L) << 56) | ((((long) (local21_life51)[1]) & 255L) << 48)) | ((((long) (local21_life51)[2]) & 255L) << 40)) | ((((long) (local21_life51)[3]) & 255L) << 32)) | ((((long) (local21_life51)[4]) & 255L) << 24)) | ((((long) (local21_life51)[5]) & 255L) << 16)) | ((((long) (local21_life51)[6]) & 255L) << 8)) | (((long) (local21_life51)[7]) & 255L));
    } while ((!(local13_life26 >= local16_life25)));
    db = ((long[])(local17_life21));
    eb = ((java.lang.Integer[])(new java.lang.Integer[94]));
    javax.crypto.Cipher local1_life55;
    javax.crypto.Cipher __sourceSpill1215_57 = (local1_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1215_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1215_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1215_60 = new byte[8];
    (__sourceSpill1215_60)[0] = ((byte) ((int) (local22_life6 >>> 56)));
    int local2_life61 = 1;
    while ((local2_life61 < 8)) {
        (__sourceSpill1215_60)[local2_life61] = ((byte) ((int) ((local22_life6 << (local2_life61 * 8)) >>> 56)));
        local2_life61 += 1;
    }
    byte[] __sourcePreallocation1215_62 = __sourceSpill1215_60;
    ((javax.crypto.Cipher)(__sourceSpill1215_57)).init(((int)(__sourceSpill1215_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1215_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1215_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local0_life65 = new long[2];
    int local4_life66 = 0;
    java.lang.String local5_life67;
    int local6_life69 = ((java.lang.String)((local5_life67 = "\rµ¥ñý<í\001û\031c\007"))).length();
    int local3_life70 = 0;
    do {
        java.lang.String __sourceSpill1215_71 = local5_life67;
        int __sourceSpill1215_72 = local3_life70;
        local3_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill1215_71)).substring(((int)(__sourceSpill1215_72)), ((int)(local3_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1215_76 = local0_life65;
        int __sourceSpill1215_77 = local4_life66;
        local4_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill1215_79 = new byte[8];
        (__sourceSpill1215_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill1215_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill1215_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill1215_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill1215_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill1215_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill1215_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill1215_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill1215_80 = local1_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill1215_80)).doFinal(((byte[])(__sourceSpill1215_79)));
        (__sourceSpill1215_76)[__sourceSpill1215_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local3_life70 >= local6_life69)));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
    b = ((net.minecraft.world.biome.BiomeGenBase$Height)(new net.minecraft.world.biome.BiomeGenBase$Height(0x1.99999ap-4f, 0x1.99999ap-3f)));
    c = ((net.minecraft.world.biome.BiomeGenBase$Height)(new net.minecraft.world.biome.BiomeGenBase$Height(-0x1.0p-1f, 0x0.0p0f)));
    d = ((net.minecraft.world.biome.BiomeGenBase$Height)(new net.minecraft.world.biome.BiomeGenBase$Height(-0x1.0p0f, 0x1.99999ap-4f)));
    e = ((net.minecraft.world.biome.BiomeGenBase$Height)(new net.minecraft.world.biome.BiomeGenBase$Height(-0x1.ccccccp0f, 0x1.99999ap-4f)));
    f = ((net.minecraft.world.biome.BiomeGenBase$Height)(new net.minecraft.world.biome.BiomeGenBase$Height(0x1.0p-3f, 0x1.99999ap-5f)));
    g = ((net.minecraft.world.biome.BiomeGenBase$Height)(new net.minecraft.world.biome.BiomeGenBase$Height(0x1.99999ap-3f, 0x1.99999ap-3f)));
    h = ((net.minecraft.world.biome.BiomeGenBase$Height)(new net.minecraft.world.biome.BiomeGenBase$Height(0x1.ccccccp-2f, 0x1.333334p-2f)));
    i = ((net.minecraft.world.biome.BiomeGenBase$Height)(new net.minecraft.world.biome.BiomeGenBase$Height(0x1.8p0f, 0x1.99999ap-6f)));
    j = ((net.minecraft.world.biome.BiomeGenBase$Height)(new net.minecraft.world.biome.BiomeGenBase$Height(0x1.0p0f, 0x1.0p-1f)));
    k = ((net.minecraft.world.biome.BiomeGenBase$Height)(new net.minecraft.world.biome.BiomeGenBase$Height(0x0.0p0f, 0x1.99999ap-6f)));
    l = ((net.minecraft.world.biome.BiomeGenBase$Height)(new net.minecraft.world.biome.BiomeGenBase$Height(0x1.99999ap-4f, 0x1.99999ap-1f)));
    m = ((net.minecraft.world.biome.BiomeGenBase$Height)(new net.minecraft.world.biome.BiomeGenBase$Height(0x1.99999ap-3f, 0x1.333334p-2f)));
    n = ((net.minecraft.world.biome.BiomeGenBase$Height)(new net.minecraft.world.biome.BiomeGenBase$Height(-0x1.99999ap-3f, 0x1.99999ap-4f)));
    o = ((net.minecraft.world.biome.BiomeGenBase[])(new net.minecraft.world.biome.BiomeGenBase[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_98(12450, (543933721380309131L ^ local22_life6))]));
    p = ((java.util.Set)(com.google.common.collect.Sets.newHashSet()));
    q = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    r = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenOcean)(new net.minecraft.world.biome.BiomeGenOcean(0))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_104(16997, (1363734590105205323L ^ local22_life6))))))).a(((java.lang.String)("Ocean"))))).a(((net.minecraft.world.biome.BiomeGenBase$Height)(net.minecraft.world.biome.BiomeGenBase.d)))));
    s = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((moom.E7)(new moom.E7(1))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_110(25837, (4059955650951191690L ^ local22_life6))))))).a(((java.lang.String)("Plains")))));
    t = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((moom.EU)(new moom.EU(2))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_114(5761, (9033088547766431376L ^ local22_life6))))))).a(((java.lang.String)("Desert"))))).a__ES())).a(((float)(0x1.0p1f)), ((float)(0x0.0p0f))))).a(((net.minecraft.world.biome.BiomeGenBase$Height)(net.minecraft.world.biome.BiomeGenBase.f)))));
    u = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((moom.EY)(new moom.EY(3, false))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_122(14184, (5826417446381866836L ^ local22_life6))))))).a(((java.lang.String)("Extreme Hills"))))).a(((net.minecraft.world.biome.BiomeGenBase$Height)(net.minecraft.world.biome.BiomeGenBase.j))))).a(((float)(0x1.99999ap-3f)), ((float)(0x1.333334p-2f)))));
    v = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((moom.EW)(new moom.EW(4, 0))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_129(10744, (7402675396540420499L ^ local22_life6))))))).a(((java.lang.String)("Forest")))));
    w = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((moom.Fc)(new moom.Fc(5, 0))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_133(19620, (3388222365219337433L ^ local22_life6))))))).a(((java.lang.String)("Taiga"))))).a(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_136(12950, (5110095370816899774L ^ local22_life6))))))).a(((float)(0x1.0p-2f)), ((float)(0x1.99999ap-1f))))).a(((net.minecraft.world.biome.BiomeGenBase$Height)(net.minecraft.world.biome.BiomeGenBase.g)))));
    x = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((moom.Fb)(new moom.Fb(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_142(27204, (4482369739444851272L ^ local22_life6))))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_143(26625, (8866341194127347712L ^ local22_life6))))))).a(((java.lang.String)("Swampland"))))).a(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_146(952, (2473745643604310962L ^ local22_life6))))))).a(((net.minecraft.world.biome.BiomeGenBase$Height)(net.minecraft.world.biome.BiomeGenBase.n))))).a(((float)(0x1.99999ap-1f)), ((float)(0x1.ccccccp-1f)))));
    y = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenRiver)(new net.minecraft.world.biome.BiomeGenRiver(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_152(11770, (8562967902685451729L ^ local22_life6))))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_153(7008, (967388817716798318L ^ local22_life6))))))).a(((java.lang.String)("River"))))).a(((net.minecraft.world.biome.BiomeGenBase$Height)(net.minecraft.world.biome.BiomeGenBase.c)))));
    z = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenHell)(new net.minecraft.world.biome.BiomeGenHell(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_159(10274, (6369542336965529650L ^ local22_life6))))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_160(8, (3023532404881127540L ^ local22_life6))))))).a(((java.lang.String)("Hell"))))).a__ES())).a(((float)(0x1.0p1f)), ((float)(0x0.0p0f)))));
    A = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenEnd)(new net.minecraft.world.biome.BiomeGenEnd(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_166(24406, (2125608138426361701L ^ local22_life6))))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_167(20934, (5561940430370286048L ^ local22_life6))))))).a(((java.lang.String)("The End"))))).a__ES()));
    B = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenOcean)(new net.minecraft.world.biome.BiomeGenOcean(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_172(31060, (5490336995368862059L ^ local22_life6))))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_173(13116, (5661793895221250843L ^ local22_life6))))))).a(((java.lang.String)("FrozenOcean"))))).b__ES())).a(((net.minecraft.world.biome.BiomeGenBase$Height)(net.minecraft.world.biome.BiomeGenBase.d))))).a(((float)(0x0.0p0f)), ((float)(0x1.0p-1f)))));
    C = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenRiver)(new net.minecraft.world.biome.BiomeGenRiver(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_181(12238, (1190537209054123990L ^ local22_life6))))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_182(32166, (2379625169168631185L ^ local22_life6))))))).a(((java.lang.String)("FrozenRiver"))))).b__ES())).a(((net.minecraft.world.biome.BiomeGenBase$Height)(net.minecraft.world.biome.BiomeGenBase.c))))).a(((float)(0x0.0p0f)), ((float)(0x1.0p-1f)))));
    D = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((moom.E_)(new moom.E_(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_190(326, (5025228233014180144L ^ local22_life6)), false))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_191(8921, (600265433019079329L ^ local22_life6))))))).a(((java.lang.String)("Ice Plains"))))).b__ES())).a(((float)(0x0.0p0f)), ((float)(0x1.0p-1f))))).a(((net.minecraft.world.biome.BiomeGenBase$Height)(net.minecraft.world.biome.BiomeGenBase.f)))));
    E = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((moom.E_)(new moom.E_(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_199(909, (4635367299192847343L ^ local22_life6)), false))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_200(10192, (685958617655238642L ^ local22_life6))))))).a(((java.lang.String)("Ice Mountains"))))).b__ES())).a(((net.minecraft.world.biome.BiomeGenBase$Height)(net.minecraft.world.biome.BiomeGenBase.h))))).a(((float)(0x0.0p0f)), ((float)(0x1.0p-1f)))));
    F = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((moom.E1)(new moom.E1(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_208(17582, (7430026750750997672L ^ local22_life6))))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_209(11239, (6193641367962178433L ^ local22_life6))))))).a(((java.lang.String)("MushroomIsland"))))).a(((float)(0x1.ccccccp-1f)), ((float)(0x1.0p0f))))).a(((net.minecraft.world.biome.BiomeGenBase$Height)(net.minecraft.world.biome.BiomeGenBase.m)))));
    G = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((moom.E1)(new moom.E1(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_216(24743, (1337891444777130204L ^ local22_life6))))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_217(5076, (3630688360501111735L ^ local22_life6))))))).a(((java.lang.String)("MushroomIslandShore"))))).a(((float)(0x1.ccccccp-1f)), ((float)(0x1.0p0f))))).a(((net.minecraft.world.biome.BiomeGenBase$Height)(net.minecraft.world.biome.BiomeGenBase.k)))));
    H = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((moom.ET)(new moom.ET(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_224(32011, (7788604867797222692L ^ local22_life6))))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_225(11860, (6790093941699303010L ^ local22_life6))))))).a(((java.lang.String)("Beach"))))).a(((float)(0x1.99999ap-1f)), ((float)(0x1.99999ap-2f))))).a(((net.minecraft.world.biome.BiomeGenBase$Height)(net.minecraft.world.biome.BiomeGenBase.k)))));
    I = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((moom.EU)(new moom.EU(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_232(22437, (8416463391732969412L ^ local22_life6))))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_233(4522, (7327610286627154318L ^ local22_life6))))))).a(((java.lang.String)("DesertHills"))))).a__ES())).a(((float)(0x1.0p1f)), ((float)(0x0.0p0f))))).a(((net.minecraft.world.biome.BiomeGenBase$Height)(net.minecraft.world.biome.BiomeGenBase.h)))));
    J = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((moom.EW)(new moom.EW(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_241(13883, (7578617207406906963L ^ local22_life6)), 0))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_242(24125, (2278534709084628558L ^ local22_life6))))))).a(((java.lang.String)("ForestHills"))))).a(((net.minecraft.world.biome.BiomeGenBase$Height)(net.minecraft.world.biome.BiomeGenBase.h)))));
    K = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((moom.Fc)(new moom.Fc(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_248(29617, (7346844197649648524L ^ local22_life6)), 0))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_249(11888, (4784551414770226756L ^ local22_life6))))))).a(((java.lang.String)("TaigaHills"))))).a(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_252(4415, (6518084673546381651L ^ local22_life6))))))).a(((float)(0x1.0p-2f)), ((float)(0x1.99999ap-1f))))).a(((net.minecraft.world.biome.BiomeGenBase$Height)(net.minecraft.world.biome.BiomeGenBase.h)))));
    L = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((moom.EY)(new moom.EY(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_258(7675, (5407333276411454917L ^ local22_life6)), true))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_259(19221, (387762663795995395L ^ local22_life6))))))).a(((java.lang.String)("Extreme Hills Edge"))))).a(((net.minecraft.world.biome.BiomeGenBase$Height)(((net.minecraft.world.biome.BiomeGenBase$Height)(net.minecraft.world.biome.BiomeGenBase.j)).a()))))).a(((float)(0x1.99999ap-3f)), ((float)(0x1.333334p-2f)))));
    M = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((moom.EZ)(new moom.EZ(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_267(16603, (7039270238120425697L ^ local22_life6)), false))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_268(27444, (5717501421700191014L ^ local22_life6))))))).a(((java.lang.String)("Jungle"))))).a(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_271(23581, (9193579196866274342L ^ local22_life6))))))).a(((float)(0x1.e66666p-1f)), ((float)(0x1.ccccccp-1f)))));
    N = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((moom.EZ)(new moom.EZ(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_275(19465, (2948098462977012854L ^ local22_life6)), false))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_276(2184, (7137578420389310689L ^ local22_life6))))))).a(((java.lang.String)("JungleHills"))))).a(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_279(23581, (9193579196866274342L ^ local22_life6))))))).a(((float)(0x1.e66666p-1f)), ((float)(0x1.ccccccp-1f))))).a(((net.minecraft.world.biome.BiomeGenBase$Height)(net.minecraft.world.biome.BiomeGenBase.h)))));
    O = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((moom.EZ)(new moom.EZ(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_285(10022, (4684108677583331117L ^ local22_life6)), true))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_286(31592, (8938623966034428744L ^ local22_life6))))))).a(((java.lang.String)("JungleEdge"))))).a(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_289(23581, (9193579196866274342L ^ local22_life6))))))).a(((float)(0x1.e66666p-1f)), ((float)(0x1.99999ap-1f)))));
    P = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenOcean)(new net.minecraft.world.biome.BiomeGenOcean(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_293(17187, (3115252377990871885L ^ local22_life6))))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_294(17198, (8305879368307489574L ^ local22_life6))))))).a(((java.lang.String)("Deep Ocean"))))).a(((net.minecraft.world.biome.BiomeGenBase$Height)(net.minecraft.world.biome.BiomeGenBase.e)))));
    Q = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenStoneBeach)(new net.minecraft.world.biome.BiomeGenStoneBeach(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_300(17551, (6168994745312263416L ^ local22_life6))))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_301(569, (8551518030160067100L ^ local22_life6))))))).a(((java.lang.String)("Stone Beach"))))).a(((float)(0x1.99999ap-3f)), ((float)(0x1.333334p-2f))))).a(((net.minecraft.world.biome.BiomeGenBase$Height)(net.minecraft.world.biome.BiomeGenBase.l)))));
    R = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((moom.ET)(new moom.ET(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_308(14712, (6258139900678390022L ^ local22_life6))))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_309(25017, (7990563351520287148L ^ local22_life6))))))).a(((java.lang.String)("Cold Beach"))))).a(((float)(0x1.99999ap-5f)), ((float)(0x1.333334p-2f))))).a(((net.minecraft.world.biome.BiomeGenBase$Height)(net.minecraft.world.biome.BiomeGenBase.k))))).b__ES()));
    S = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((moom.EW)(new moom.EW(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_317(18184, (3802534657279246107L ^ local22_life6)), 2))).a(((java.lang.String)("Birch Forest"))))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_319(5054, (139575632433998799L ^ local22_life6)))))));
    T = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((moom.EW)(new moom.EW(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_322(25723, (2697787395476823106L ^ local22_life6)), 2))).a(((java.lang.String)("Birch Forest Hills"))))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_324(12339, (371357322756769823L ^ local22_life6))))))).a(((net.minecraft.world.biome.BiomeGenBase$Height)(net.minecraft.world.biome.BiomeGenBase.h)))));
    U = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((moom.EW)(new moom.EW(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_329(29664, (38324562942462858L ^ local22_life6)), 3))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_330(19636, (2897494798386738351L ^ local22_life6))))))).a(((java.lang.String)("Roofed Forest")))));
    V = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((moom.Fc)(new moom.Fc(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_334(6180, (874314061009870921L ^ local22_life6)), 0))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_335(28858, (6563918097707829427L ^ local22_life6))))))).a(((java.lang.String)("Cold Taiga"))))).a(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_338(4415, (6518084673546381651L ^ local22_life6))))))).b__ES())).a(((float)(-0x1.0p-1f)), ((float)(0x1.99999ap-2f))))).a(((net.minecraft.world.biome.BiomeGenBase$Height)(net.minecraft.world.biome.BiomeGenBase.g))))).c(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_344(8921, (600265433019079329L ^ local22_life6)))))));
    W = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((moom.Fc)(new moom.Fc(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_347(298, (6328720191515162932L ^ local22_life6)), 0))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_348(17464, (2531975964171156513L ^ local22_life6))))))).a(((java.lang.String)("Cold Taiga Hills"))))).a(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_351(4415, (6518084673546381651L ^ local22_life6))))))).b__ES())).a(((float)(-0x1.0p-1f)), ((float)(0x1.99999ap-2f))))).a(((net.minecraft.world.biome.BiomeGenBase$Height)(net.minecraft.world.biome.BiomeGenBase.h))))).c(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_357(8921, (600265433019079329L ^ local22_life6)))))));
    X = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((moom.Fc)(new moom.Fc(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_360(7216, (3564611201062954045L ^ local22_life6)), 1))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_361(29014, (3383932353801357606L ^ local22_life6))))))).a(((java.lang.String)("Mega Taiga"))))).a(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_364(4415, (6518084673546381651L ^ local22_life6))))))).a(((float)(0x1.333334p-2f)), ((float)(0x1.99999ap-1f))))).a(((net.minecraft.world.biome.BiomeGenBase$Height)(net.minecraft.world.biome.BiomeGenBase.g)))));
    Y = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((moom.Fc)(new moom.Fc(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_370(31233, (4725205975966089848L ^ local22_life6)), 1))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_371(11832, (5743161478518789659L ^ local22_life6))))))).a(((java.lang.String)("Mega Taiga Hills"))))).a(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_374(4415, (6518084673546381651L ^ local22_life6))))))).a(((float)(0x1.333334p-2f)), ((float)(0x1.99999ap-1f))))).a(((net.minecraft.world.biome.BiomeGenBase$Height)(net.minecraft.world.biome.BiomeGenBase.h)))));
    Z = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((moom.EY)(new moom.EY(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_380(30678, (511837385589788598L ^ local22_life6)), true))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_381(3617, (5599893282210412094L ^ local22_life6))))))).a(((java.lang.String)("Extreme Hills+"))))).a(((net.minecraft.world.biome.BiomeGenBase$Height)(net.minecraft.world.biome.BiomeGenBase.j))))).a(((float)(0x1.99999ap-3f)), ((float)(0x1.333334p-2f)))));
    aa = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((moom.E9)(new moom.E9(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_388(9119, (4339233304979856363L ^ local22_life6))))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_389(1996, (8976015458775334859L ^ local22_life6))))))).a(((java.lang.String)("Savanna"))))).a(((float)(0x1.333334p0f)), ((float)(0x0.0p0f))))).a__ES())).a(((net.minecraft.world.biome.BiomeGenBase$Height)(net.minecraft.world.biome.BiomeGenBase.f)))));
    ab = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((moom.E9)(new moom.E9(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_397(4800, (5895188879702616772L ^ local22_life6))))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_398(20386, (8133937989333792655L ^ local22_life6))))))).a(((java.lang.String)("Savanna Plateau"))))).a(((float)(0x1.0p0f)), ((float)(0x0.0p0f))))).a__ES())).a(((net.minecraft.world.biome.BiomeGenBase$Height)(net.minecraft.world.biome.BiomeGenBase.i)))));
    ac = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((moom.E0)(new moom.E0(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_406(1568, (4853217702943358498L ^ local22_life6)), false, false))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_407(29211, (8843856978562517534L ^ local22_life6))))))).a(((java.lang.String)("Mesa")))));
    ad = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((moom.E0)(new moom.E0(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_411(22802, (946009494536397088L ^ local22_life6)), false, true))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_412(14082, (6846754744990060289L ^ local22_life6))))))).a(((java.lang.String)("Mesa Plateau F"))))).a(((net.minecraft.world.biome.BiomeGenBase$Height)(net.minecraft.world.biome.BiomeGenBase.i)))));
    ae = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((moom.E0)(new moom.E0(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_418(23192, (1865646807441056503L ^ local22_life6)), false, false))).b(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_419(141, (1176516416598243458L ^ local22_life6))))))).a(((java.lang.String)("Mesa Plateau"))))).a(((net.minecraft.world.biome.BiomeGenBase$Height)(net.minecraft.world.biome.BiomeGenBase.i)))));
    af = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.r));
    ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.s)).c();
    ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.t)).c();
    ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.v)).c();
    ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.w)).c();
    ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.x)).c();
    ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.D)).c();
    ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.M)).c();
    ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.O)).c();
    ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.V)).c();
    ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.aa)).c();
    ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.ab)).c();
    ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.ac)).c();
    ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.ad)).c();
    ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.ae)).c();
    ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.S)).c();
    ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.T)).c();
    ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.U)).c();
    ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.X)).c();
    ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.u)).c();
    ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.Z)).c();
    ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.X)).d(((int)((((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.Y)).aB + __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_470(14829, (8426742234782384631L ^ local22_life6)))))))).a(((java.lang.String)("Redwood Taiga Hills M")));
    net.minecraft.world.biome.BiomeGenBase[] local24_life474 = net.minecraft.world.biome.BiomeGenBase.o;
    int local25_life475 = (local24_life474).length;
    int local26_life476 = 0;
    while ((local26_life476 < local25_life475)) {
        net.minecraft.world.biome.BiomeGenBase local27_life477 = (local24_life474)[local26_life476];
        if ((local27_life477 != null)) {
        if (((java.util.Map)(net.minecraft.world.biome.BiomeGenBase.q)).containsKey(((java.lang.Object)(((net.minecraft.world.biome.BiomeGenBase)(local27_life477)).aj)))) {
        throw new java.lang.Error(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_488(((net.minecraft.world.biome.BiomeGenBase)(local27_life477)).aj, ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((java.util.Map)(net.minecraft.world.biome.BiomeGenBase.q)).get(((java.lang.Object)(((net.minecraft.world.biome.BiomeGenBase)(local27_life477)).aj))))))).aB, ((net.minecraft.world.biome.BiomeGenBase)(local27_life477)).aB));
    }
        ((java.util.Map)(net.minecraft.world.biome.BiomeGenBase.q)).put(((java.lang.Object)(((net.minecraft.world.biome.BiomeGenBase)(local27_life477)).aj)), ((java.lang.Object)(local27_life477)));
        if ((((net.minecraft.world.biome.BiomeGenBase)(local27_life477)).aB < __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_493(14829, (8426742234782384631L ^ local22_life6)))) {
        ((java.util.Set)(net.minecraft.world.biome.BiomeGenBase.p)).add(((java.lang.Object)(local27_life477)));
    }
    }
        local26_life476 += 1;
    }
    ((java.util.Set)(net.minecraft.world.biome.BiomeGenBase.p)).remove(((java.lang.Object)(net.minecraft.world.biome.BiomeGenBase.z)));
    ((java.util.Set)(net.minecraft.world.biome.BiomeGenBase.p)).remove(((java.lang.Object)(net.minecraft.world.biome.BiomeGenBase.A)));
    ((java.util.Set)(net.minecraft.world.biome.BiomeGenBase.p)).remove(((java.lang.Object)(net.minecraft.world.biome.BiomeGenBase.B)));
    ((java.util.Set)(net.minecraft.world.biome.BiomeGenBase.p)).remove(((java.lang.Object)(net.minecraft.world.biome.BiomeGenBase.L)));
    ag = ((moom.FW)(new moom.FW(new java.util.Random((local0_life65)[0]), 1)));
    ah = ((moom.FW)(new moom.FW(new java.util.Random((local0_life65)[1]), 1)));
    ai = ((moom.Gi)(new moom.Gi()));
}

private static native <E extends Throwable> void __sourceConstructorInit_1e2b23cb70f652bb_0(net.minecraft.world.biome.BiomeGenBase a0) throws E;

public int b(moom.DT p0) {
double local2 = ((double) moom.Dr.a(((float)(((net.minecraft.world.biome.BiomeGenBase)(this)).a(((moom.DT)(p0))))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f))));
    double local4 = ((double) moom.Dr.a(((float)(((net.minecraft.world.biome.BiomeGenBase)(this)).b())), ((float)(0x0.0p0f)), ((float)(0x1.0p0f))));
    return moom.Ef.a(((double)(local2)), ((double)(local4)));
}


protected net.minecraft.world.biome.BiomeGenBase b__ES() {
this.az = ((boolean)(true));
    return this;
}


protected net.minecraft.world.biome.BiomeGenBase b(int p0) {
((net.minecraft.world.biome.BiomeGenBase)(this)).a(((int)(p0)), ((boolean)(false)));
    return this;
}


public final void b(net.minecraft.world.World p0, java.util.Random p1, moom.Fm p2, int p3, int p4, double p5) {
net.minecraft.block.Block lexicalValue1744_90_0;
    int lexicalValue1744_108_0;
    int lexicalValue1744_129_0;
    int lexicalValue1744_129_1;
    net.minecraft.block.state.IBlockState lexicalValue1744_137_0;
    int lexicalValue1744_165_0;
    int lexicalValue1744_165_1;
    int lexicalValue1744_186_0;
    int lexicalValue1744_186_1;
    int lexicalValue1744_209_0;
    int lexicalValue1744_222_0;
    net.minecraft.block.state.IBlockState lexicalValue1744_244_0;
    net.minecraft.block.state.IBlockState lexicalValue1744_252_0;
    net.minecraft.block.state.IBlockState lexicalValue1744_255_0;
    java.lang.String spill1744_0;
    net.minecraft.block.Block spill1744_1;
    int spill1744_2;
    int spill1744_3;
    int spill1744_4;
    int spill1744_5;
    int spill1744_6;
    net.minecraft.block.state.IBlockState spill1744_7;
    net.minecraft.block.state.IBlockState spill1744_8;
    long life8_3;
    int life11_6;
    net.minecraft.block.state.IBlockState life12_10;
    net.minecraft.block.state.IBlockState life13_13;
    int life14_15;
    int life15_27;
    int life16_35;
    java.lang.String life10_36;
    int life17_44;
    moom.DU life18_48;
    int life19_54;
    net.minecraft.block.state.IBlockState life20_79;
    lexical_join_259: {
    life8_3 = (net.minecraft.world.biome.BiomeGenBase.bb ^ 80110780135394L);
    life11_6 = ((net.minecraft.world.World)(p0)).c();
    spill1744_0 = net.minecraft.world.biome.WorldChunkManager.b();
    life12_10 = this.am;
    life13_13 = this.an;
    life14_15 = -1;
    life15_27 = ((int) (((p5 / 0x1.8p1d) + 0x1.8p1d) + (((java.util.Random)(p1)).nextDouble() * 0x1.0p-2d)));
    life16_35 = (p3 & __sourceIntrinsic_f3c8c4f968d2_invokedynamic1744_6(732, (2083400871602974014L ^ life8_3)));
    life10_36 = spill1744_0;
    life17_44 = (p4 & __sourceIntrinsic_f3c8c4f968d2_invokedynamic1744_7(24743, (1337971800157851423L ^ life8_3)));
    life18_48 = new moom.DU();
    life19_54 = __sourceIntrinsic_f3c8c4f968d2_invokedynamic1744_8(26632, (224767658555279294L ^ life8_3));
    lexical_cycle_55: while (true) {
    lexical_join_257: {
    lexical_join_256: {
    lexical_join_255: {
    lexical_join_253: {
    lexical_join_252: {
    lexical_join_244: {
    lexical_join_222: {
    lexical_join_209: {
    lexical_join_208: {
    lexical_join_200: {
    lexical_join_186: {
    lexical_join_176: {
    lexical_join_165: {
    lexical_join_159: {
    lexical_join_156: {
    lexical_join_141: {
    lexical_join_137: {
    lexical_join_129: {
    lexical_join_127: {
    lexical_join_108: {
    lexical_join_107: {
    lexical_join_90: {
    lexical_join_88: {
    lexical_join_71: {
    if (!((life19_54 >= 0))) {
        break lexical_join_259;
    }
    if (!((life19_54 <= ((java.util.Random)(p1)).nextInt(((int)(5)))))) {
        break lexical_join_71;
    }
    ((moom.Fm)(p2)).a(((int)(life17_44)), ((int)(life19_54)), ((int)(life16_35)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.h))))));
    if (!((life10_36 != null))) {
        break lexical_join_256;
    }
    }
    life20_79 = ((moom.Fm)(p2)).a(((int)(life17_44)), ((int)(life19_54)), ((int)(life16_35)));
    spill1744_1 = ((net.minecraft.block.state.IBlockState)(life20_79)).a__ch();
    if (!((life10_36 == null))) {
        lexicalValue1744_90_0 = spill1744_1;
        break lexical_join_90;
    }
    if (!((((net.minecraft.block.Block)(spill1744_1)).a__fn() == moom.fn.a))) {
        break lexical_join_88;
    }
    life14_15 = -1;
    if (!((life10_36 != null))) {
        break lexical_join_256;
    }
    }
    lexicalValue1744_90_0 = ((net.minecraft.block.state.IBlockState)(life20_79)).a__ch();
    }
    if (!((lexicalValue1744_90_0 == net.minecraft.init.Blocks.b))) {
        break lexical_join_256;
    }
    spill1744_2 = life14_15;
    if (!((life10_36 == null))) {
        lexicalValue1744_209_0 = spill1744_2;
        break lexical_join_209;
    }
    if (!((spill1744_2 == -1))) {
        break lexical_join_208;
    }
    spill1744_3 = life15_27;
    if (!((life10_36 == null))) {
        lexicalValue1744_108_0 = spill1744_3;
        break lexical_join_108;
    }
    if (!((spill1744_3 <= 0))) {
        break lexical_join_107;
    }
    life12_10 = null;
    life13_13 = __sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b)));
    break lexical_join_127;
    }
    lexicalValue1744_108_0 = life19_54;
    }
    spill1744_4 = (life11_6 - 4);
    if (!((life10_36 == null))) {
        lexicalValue1744_129_0 = lexicalValue1744_108_0;
        lexicalValue1744_129_1 = spill1744_4;
        break lexical_join_129;
    }
    if (!((lexicalValue1744_108_0 >= spill1744_4))) {
        break lexical_join_127;
    }
    spill1744_5 = life19_54;
    spill1744_6 = (life11_6 + 1);
    if (!((life10_36 == null))) {
        lexicalValue1744_129_0 = spill1744_5;
        lexicalValue1744_129_1 = spill1744_6;
        break lexical_join_129;
    }
    if (!((spill1744_5 <= spill1744_6))) {
        break lexical_join_127;
    }
    life12_10 = this.am;
    life13_13 = this.an;
    }
    lexicalValue1744_129_0 = life19_54;
    lexicalValue1744_129_1 = life11_6;
    }
    if (!((life10_36 == null))) {
        lexicalValue1744_165_0 = lexicalValue1744_129_0;
        lexicalValue1744_165_1 = lexicalValue1744_129_1;
        break lexical_join_165;
    }
    if (!((lexicalValue1744_129_0 < lexicalValue1744_129_1))) {
        break lexical_join_159;
    }
    spill1744_7 = life12_10;
    if (!((life10_36 == null))) {
        lexicalValue1744_137_0 = spill1744_7;
        break lexical_join_137;
    }
    if (!((spill1744_7 != null))) {
        break lexical_join_141;
    }
    lexicalValue1744_137_0 = life12_10;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(lexicalValue1744_137_0)).a__ch())).a__fn() == moom.fn.a))) {
        break lexical_join_159;
    }
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.world.biome.BiomeGenBase)(this)).a(((moom.DT)(((moom.DU)(life18_48)).a(((int)(p3)), ((int)(life19_54)), ((int)(p4)))))))), ((float)(0x1.333334p-3f))) < 0))) {
        break lexical_join_156;
    }
    life12_10 = __sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aI)));
    if (!((life10_36 != null))) {
        break lexical_join_159;
    }
    }
    life12_10 = __sourceExactCall_654639a3f01247(((moom.dN)(net.minecraft.init.Blocks.j)));
    }
    life14_15 = life15_27;
    lexicalValue1744_165_0 = life19_54;
    lexicalValue1744_165_1 = (life11_6 - 1);
    }
    if (!((life10_36 == null))) {
        lexicalValue1744_186_0 = lexicalValue1744_165_0;
        lexicalValue1744_186_1 = lexicalValue1744_165_1;
        break lexical_join_186;
    }
    if (!((lexicalValue1744_165_0 >= lexicalValue1744_165_1))) {
        break lexical_join_176;
    }
    ((moom.Fm)(p2)).a(((int)(life17_44)), ((int)(life19_54)), ((int)(life16_35)), ((net.minecraft.block.state.IBlockState)(life12_10)));
    if (!((life10_36 != null))) {
        break lexical_join_256;
    }
    }
    lexicalValue1744_186_0 = life19_54;
    lexicalValue1744_186_1 = ((life11_6 - __sourceIntrinsic_f3c8c4f968d2_invokedynamic1744_34(17479, (8146103619745655740L ^ life8_3))) - life15_27);
    }
    if (!((lexicalValue1744_186_0 < lexicalValue1744_186_1))) {
        break lexical_join_200;
    }
    life12_10 = null;
    life13_13 = __sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b)));
    ((moom.Fm)(p2)).a(((int)(life17_44)), ((int)(life19_54)), ((int)(life16_35)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.n))))));
    break lexical_join_256;
    }
    ((moom.Fm)(p2)).a(((int)(life17_44)), ((int)(life19_54)), ((int)(life16_35)), ((net.minecraft.block.state.IBlockState)(life13_13)));
    if (!((life10_36 != null))) {
        break lexical_join_256;
    }
    }
    lexicalValue1744_209_0 = life14_15;
    }
    if (!((life10_36 == null))) {
        lexicalValue1744_222_0 = lexicalValue1744_209_0;
        break lexical_join_222;
    }
    if (!((lexicalValue1744_209_0 > 0))) {
        break lexical_join_256;
    }
    life14_15 += -1;
    ((moom.Fm)(p2)).a(((int)(life17_44)), ((int)(life19_54)), ((int)(life16_35)), ((net.minecraft.block.state.IBlockState)(life13_13)));
    if (!((life10_36 == null))) {
        break lexical_join_257;
    }
    lexicalValue1744_222_0 = life14_15;
    }
    if (!((lexicalValue1744_222_0 == 0))) {
        break lexical_join_256;
    }
    spill1744_8 = life13_13;
    if (!((life10_36 == null))) {
        lexicalValue1744_244_0 = spill1744_8;
        break lexical_join_244;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill1744_8)).a__ch() == net.minecraft.init.Blocks.m))) {
        break lexical_join_256;
    }
    life14_15 = (((java.util.Random)(p1)).nextInt(((int)(4))) + java.lang.Math.max(((int)(0)), ((int)((life19_54 - __sourceIntrinsic_f3c8c4f968d2_invokedynamic1744_45(15084, (7511310931815322973L ^ life8_3)))))));
    lexicalValue1744_244_0 = life13_13;
    }
    if (!((life10_36 == null))) {
        lexicalValue1744_252_0 = lexicalValue1744_244_0;
        break lexical_join_252;
    }
    if (!((((net.minecraft.block.state.IBlockState)(lexicalValue1744_244_0)).a(((net.minecraft.block.properties.IProperty)(moom.dx.R))) == moom.ab.RED_SAND))) {
        break lexical_join_253;
    }
    lexicalValue1744_252_0 = __sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cq)));
    }
    lexicalValue1744_255_0 = lexicalValue1744_252_0;
    break lexical_join_255;
    }
    lexicalValue1744_255_0 = __sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)));
    }
    life13_13 = lexicalValue1744_255_0;
    }
    life19_54 += -1;
    }
    if (!((life10_36 != null))) { continue lexical_cycle_55; }
    break lexical_cycle_55;
    }
    }
    return;
}


public boolean b__Boolean() {
int forwardValue5808_13_0;
    int forwardValue5808_17_0;
    int forwardValue5808_19_0;
    boolean spill5808_0;
    long life1_3;
    java.lang.String life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    forward_join_13: {
    life1_3 = (net.minecraft.world.biome.BiomeGenBase.bb ^ 60187932668472L);
    life3_5 = net.minecraft.world.biome.WorldChunkManager.b();
    spill5808_0 = ((net.minecraft.world.biome.BiomeGenBase)(this)).d();
    if (!((life3_5 == null))) {
        forwardValue5808_13_0 = ((spill5808_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!((!spill5808_0))) {
        break forward_join_18;
    }
    forwardValue5808_13_0 = ((this.aA) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue5808_17_0 = forwardValue5808_13_0;
        break forward_join_17;
    }
    if (!((forwardValue5808_13_0 != 0))) {
        break forward_join_18;
    }
    forwardValue5808_17_0 = 1;
    }
    forwardValue5808_19_0 = forwardValue5808_17_0;
    break forward_join_19;
    }
    forwardValue5808_19_0 = 0;
    }
    return ((forwardValue5808_19_0) != 0);
}


public final float b() {
return this.as;
}


public static int[] b__ArrayInt() {
return net.minecraft.world.biome.BiomeGenBase.aF;
}


public static void b(int[] p0) {
aF = ((int[])(p0));
    return;
}


public static net.minecraft.world.biome.BiomeGenBase e(int p0) {
return __sourceExactCall_67e2754ad05106(((int)(p0)), ((net.minecraft.world.biome.BiomeGenBase)(null)));
}


protected net.minecraft.world.biome.BiomeGenBase c(int p0) {
this.al = ((int)(p0));
    return this;
}


protected net.minecraft.world.biome.BiomeGenBase c() {
long local1 = (net.minecraft.world.biome.BiomeGenBase.bb ^ 132715106042965L);
    return ((net.minecraft.world.biome.BiomeGenBase)(this)).d(((int)((this.aB + __sourceIntrinsic_71cbfb1a39ba_originalDynamicSite2070_2(29702, (5867704713082579058L ^ local1))))));
}


public boolean c__Boolean() {
int forwardValue5809_14_0;
    int forwardValue5809_16_0;
    int spill5809_0;
    long life1_3;
    java.lang.String life3_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_14: {
    life1_3 = (net.minecraft.world.biome.BiomeGenBase.bb ^ 48879416865746L);
    life3_5 = net.minecraft.world.biome.WorldChunkManager.b();
    spill5809_0 = recovery.source.CarrierOps.fcmpl(((float)(this.as)), ((float)(0x1.b33334p-1f)));
    if (!((life3_5 == null))) {
        forwardValue5809_14_0 = spill5809_0;
        break forward_join_14;
    }
    if (!((spill5809_0 > 0))) {
        break forward_join_15;
    }
    forwardValue5809_14_0 = 1;
    }
    forwardValue5809_16_0 = forwardValue5809_14_0;
    break forward_join_16;
    }
    forwardValue5809_16_0 = 0;
    }
    return ((forwardValue5809_16_0) != 0);
}


protected net.minecraft.world.biome.BiomeGenBase d(int p0) {
return new net.minecraft.world.biome.BiomeGenMutated(p0, this);
}


public boolean d() {
return ((((this.az) ? 1 : 0)) != 0);
}


public void a(net.minecraft.world.World p0, java.util.Random p1, moom.Fm p2, int p3, int p4, double p5) {
((net.minecraft.world.biome.BiomeGenBase)(this)).b(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.Fm)(p2)), ((int)(p3)), ((int)(p4)), ((double)(p5)));
    return;
}


public static net.minecraft.world.biome.BiomeGenBase[] a__ArrayES() {
return net.minecraft.world.biome.BiomeGenBase.o;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12584_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ES"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_6d3c1711757e72(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public static net.minecraft.world.biome.BiomeGenBase a(int p0, net.minecraft.world.biome.BiomeGenBase p1) {
net.minecraft.world.biome.BiomeGenBase forwardValue5803_23_0;
    net.minecraft.world.biome.BiomeGenBase forwardValue5803_25_0;
    net.minecraft.world.biome.BiomeGenBase spill5803_0;
    long life2_3;
    java.lang.String life4_5;
    net.minecraft.world.biome.BiomeGenBase life5_23;
    forward_join_30: {
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    life2_3 = (net.minecraft.world.biome.BiomeGenBase.bb ^ 3287569002209L);
    life4_5 = net.minecraft.world.biome.WorldChunkManager.b();
    if (!((life4_5 == null))) {
        break forward_join_30;
    }
    if (!((p0 >= 0))) {
        break forward_join_26;
    }
    if (!((p0 <= (net.minecraft.world.biome.BiomeGenBase.o).length))) {
        break forward_join_26;
    }
    life5_23 = (net.minecraft.world.biome.BiomeGenBase.o)[p0];
    spill5803_0 = life5_23;
    if (!((life4_5 == null))) {
        forwardValue5803_23_0 = spill5803_0;
        break forward_join_23;
    }
    if (!((spill5803_0 == null))) {
        break forward_join_24;
    }
    forwardValue5803_23_0 = p1;
    }
    forwardValue5803_25_0 = forwardValue5803_23_0;
    break forward_join_25;
    }
    forwardValue5803_25_0 = life5_23;
    }
    return forwardValue5803_25_0;
    }
    ((org.apache.logging.log4j.Logger)(net.minecraft.world.biome.BiomeGenBase.a)).warn(((java.lang.String)(__sourceIntrinsic_9e739c326e44_invokedynamic5803_5(p0))));
    }
    return net.minecraft.world.biome.BiomeGenBase.r;
}


private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


public moom.bF a__bF() {
int forwardValue5806_21_0;
    moom.bF forwardValue5806_25_0;
    int spill5806_0;
    long life1_3;
    java.lang.String life3_5;
    forward_join_25: {
    forward_join_24: {
    forward_join_21: {
    forward_join_16: {
    life1_3 = (net.minecraft.world.biome.BiomeGenBase.bb ^ 20463013785932L);
    life3_5 = net.minecraft.world.biome.WorldChunkManager.b();
    spill5806_0 = recovery.source.CarrierOps.dcmpg(((double)(((double) this.ar))), ((double)(0x1.999999999999ap-3d)));
    if (!((life3_5 == null))) {
        forwardValue5806_21_0 = spill5806_0;
        break forward_join_21;
    }
    if (!((spill5806_0 < 0))) {
        break forward_join_16;
    }
    forwardValue5806_25_0 = moom.bF.COLD;
    break forward_join_25;
    }
    forwardValue5806_21_0 = recovery.source.CarrierOps.dcmpg(((double)(((double) this.ar))), ((double)(0x1.0p0d)));
    }
    if (!((forwardValue5806_21_0 < 0))) {
        break forward_join_24;
    }
    forwardValue5806_25_0 = moom.bF.MEDIUM;
    break forward_join_25;
    }
    forwardValue5806_25_0 = moom.bF.WARM;
    }
    return forwardValue5806_25_0;
}


public boolean a(net.minecraft.world.biome.BiomeGenBase p0) {
net.minecraft.world.biome.BiomeGenBase forwardValue5805_12_0;
    net.minecraft.world.biome.BiomeGenBase forwardValue5805_16_0;
    int forwardValue5805_23_0;
    net.minecraft.world.biome.BiomeGenBase spill5805_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_20: {
    forward_join_16: {
    forward_join_12: {
    life2_3 = (net.minecraft.world.biome.BiomeGenBase.bb ^ 5635367466147L);
    life4_5 = net.minecraft.world.biome.WorldChunkManager.b();
    spill5805_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue5805_12_0 = spill5805_0;
        break forward_join_12;
    }
    if (!((spill5805_0 != this))) {
        break forward_join_20;
    }
    forwardValue5805_12_0 = p0;
    }
    if (!((life4_5 == null))) {
        forwardValue5805_16_0 = forwardValue5805_12_0;
        break forward_join_16;
    }
    if (!((forwardValue5805_12_0 != null))) {
        break forward_join_22;
    }
    forwardValue5805_16_0 = this;
    }
    if (!((((net.minecraft.world.biome.BiomeGenBase)(forwardValue5805_16_0)).a__Class() == ((net.minecraft.world.biome.BiomeGenBase)(p0)).a__Class()))) {
        break forward_join_22;
    }
    }
    forwardValue5805_23_0 = 1;
    break forward_join_23;
    }
    forwardValue5805_23_0 = 0;
    }
    return ((forwardValue5805_23_0) != 0);
}


public java.lang.Class<? extends net.minecraft.world.biome.BiomeGenBase> a__Class() {
return (this).getClass();
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 11125;
      if (eb[var3] == null) {
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
         long var5 = db[var3];
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
         Object[] var9 = (Object[])fb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               fb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/ES", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         eb[var3] = var15;
      }

      return eb[var3];
}


public moom.F0 a(java.util.Random p0) {
moom.F0 forwardValue5804_17_0;
    long life2_3;
    forward_join_17: {
    forward_join_15: {
    life2_3 = (net.minecraft.world.biome.BiomeGenBase.bb ^ 78271709733049L);
    if (!((((java.util.Random)(p0)).nextInt(((int)(__sourceIntrinsic_723b001678d2_invokedynamic5804_1(31060, (5490412317849534963L ^ life2_3))))) == 0))) {
        break forward_join_15;
    }
    forwardValue5804_17_0 = this.aD;
    break forward_join_17;
    }
    forwardValue5804_17_0 = this.aC;
    }
    return forwardValue5804_17_0;
}


public moom.FY a__FY(java.util.Random p0) {
return new moom.Gz(moom.ar.GRASS);
}


public net.minecraft.block.BlockFlower$EnumFlowerType a(java.util.Random p0, moom.DT p1) {
long local3 = (net.minecraft.world.biome.BiomeGenBase.bb ^ 44531330942199L);
    return ((((java.util.Random)(p0)).nextInt(((int)(3))) > 0) ? net.minecraft.block.BlockFlower$EnumFlowerType.DANDELION : net.minecraft.block.BlockFlower$EnumFlowerType.POPPY);
}


protected net.minecraft.world.biome.BiomeGenBase a(java.lang.String p0) {
this.aj = ((java.lang.String)(p0));
    return this;
}


protected net.minecraft.world.biome.BiomeGenBase a(int p0) {
this.ao = ((int)(p0));
    return this;
}


protected moom.EQ a__EQ() {
return new moom.EQ();
}


protected net.minecraft.world.biome.BiomeGenBase a(float p0, float p1) {
long local3 = (net.minecraft.world.biome.BiomeGenBase.bb ^ 25651496545199L);
    if ((p0 > 0x1.99999ap-4f)) {
        if ((p0 < 0x1.99999ap-3f)) {
        throw new java.lang.IllegalArgumentException("Please avoid temperatures in the range 0.1 - 0.2 because of snow");
    }
    }
    this.ar = ((float)(p0));
    this.as = ((float)(p1));
    return this;
}


protected final net.minecraft.world.biome.BiomeGenBase a(net.minecraft.world.biome.BiomeGenBase$Height p0) {
this.ap = ((float)(((net.minecraft.world.biome.BiomeGenBase$Height)(p0)).a));
    this.aq = ((float)(((net.minecraft.world.biome.BiomeGenBase$Height)(p0)).b));
    return this;
}


protected net.minecraft.world.biome.BiomeGenBase a__ES() {
this.aA = ((boolean)(false));
    return this;
}


public float a() {
return 0x1.99999ap-4f;
}


public final int a__Int() {
return ((int) (this.as * 0x1.0p16f));
}


public final float a(moom.DT p0) {
long local2 = (net.minecraft.world.biome.BiomeGenBase.bb ^ 12548010251251L);
    if ((((moom.DT)(p0)).b() > __sourceIntrinsic_b4b223bdccad_invokedynamic12590_2(28441, (9004612008091624673L ^ local2)))) {
        float local4 = ((float) (((moom.FW)(net.minecraft.world.biome.BiomeGenBase.ag)).a(((double)((((double) ((moom.DT)(p0)).a()) / 0x1.0p3d))), ((double)((((double) ((moom.DT)(p0)).c()) / 0x1.0p3d)))) * 0x1.0p2d));
        return (this.ar - ((((local4 + ((float) ((moom.DT)(p0)).b())) - 0x1.0p6f) * 0x1.99999ap-5f) / 0x1.ep4f));
    }
    return this.ar;
}


public void a(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
((moom.EQ)(this.au)).a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((net.minecraft.world.biome.BiomeGenBase)(this)), ((moom.DT)(p2)));
    return;
}


public int a__Int(moom.DT p0) {
double local2 = ((double) moom.Dr.a(((float)(((net.minecraft.world.biome.BiomeGenBase)(this)).a(((moom.DT)(p0))))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f))));
    double local4 = ((double) moom.Dr.a(((float)(((net.minecraft.world.biome.BiomeGenBase)(this)).b())), ((float)(0x0.0p0f)), ((float)(0x1.0p0f))));
    return moom.Eg.a(((double)(local2)), ((double)(local4)));
}


protected net.minecraft.world.biome.BiomeGenBase a(int p0, boolean p1) {
long local3 = (net.minecraft.world.biome.BiomeGenBase.bb ^ 96648717089870L);
    this.ak = ((int)(p0));
    if (p1) {
        this.al = ((int)(((p0 & __sourceIntrinsic_fcc3f5d4860e_invokedynamic12591_2(2889, (9029625231291641622L ^ local3))) >> 1)));
    } else {
        this.al = ((int)(p0));
    }
    return this;
}


public int a(float p0) {
p0 = (p0 / 0x1.8p1f);
    p0 = moom.Dr.a(((float)(p0)), ((float)(-0x1.0p0f)), ((float)(0x1.0p0f)));
    return moom.Dr.b(((float)((0x1.3e93eap-1f - (p0 * 0x1.99999ap-5f)))), ((float)((0x1.0p-1f + (p0 * 0x1.99999ap-4f)))), ((float)(0x1.0p0f)));
}


public java.util.List<moom.D7> a(net.minecraft.entity.EnumCreatureType p0) {
long local2 = (net.minecraft.world.biome.BiomeGenBase.bb ^ 77119737914784L);
    switch ((net.minecraft.world.biome.BiomeGenBase$1.a)[((net.minecraft.entity.EnumCreatureType)(p0)).ordinal()]) {
case 1:
{
        return this.av;
    }
case 2:
{
        return this.aw;
    }
case 3:
{
        return this.ax;
    }
case 4:
{
        return this.ay;
    }
default:
{
        return java.util.Collections.emptyList();
    }
}
}


public boolean a__Boolean() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.world.biome.BiomeGenBase)(this)).d())) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_104(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_110(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_122(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_129(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_133(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_136(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_142(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_143(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_146(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_152(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_153(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_159(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_160(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_166(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_167(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_172(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_173(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_181(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_182(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_190(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_191(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_199(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_200(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_208(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_209(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_216(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_217(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_224(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_225(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_232(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_233(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_241(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_242(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_248(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_249(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_252(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_258(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_259(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_267(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_268(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_271(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_275(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_276(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_279(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_285(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_286(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_289(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_293(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_294(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_300(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_301(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_308(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_309(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_317(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_319(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_322(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_324(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_329(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_330(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_334(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_335(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_338(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_344(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_347(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_348(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_351(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_357(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_360(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_361(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_364(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_370(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_371(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_374(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_380(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_381(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_388(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_389(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_397(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_398(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_406(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_407(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_411(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_412(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_418(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_419(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_470(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_488(java.lang.String a0, int a1, int a2) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1215_493(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1e2b23cb70f652bb_originalDynamicSite3520_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1e2b23cb70f652bb_originalDynamicSite3520_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1e2b23cb70f652bb_originalDynamicSite3520_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1e2b23cb70f652bb_originalDynamicSite3520_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1e2b23cb70f652bb_originalDynamicSite3520_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1e2b23cb70f652bb_originalDynamicSite3520_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1e2b23cb70f652bb_originalDynamicSite3520_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1e2b23cb70f652bb_originalDynamicSite3520_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1e2b23cb70f652bb_originalDynamicSite3520_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1e2b23cb70f652bb_originalDynamicSite3520_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1e2b23cb70f652bb_originalDynamicSite3520_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1e2b23cb70f652bb_originalDynamicSite3520_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1e2b23cb70f652bb_originalDynamicSite3520_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1e2b23cb70f652bb_originalDynamicSite3520_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1e2b23cb70f652bb_originalDynamicSite3520_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1e2b23cb70f652bb_originalDynamicSite3520_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1e2b23cb70f652bb_originalDynamicSite3520_91(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9e739c326e44_invokedynamic5803_5(int a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fcc3f5d4860e_invokedynamic12591_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12584_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_723b001678d2_invokedynamic5804_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b223bdccad_invokedynamic12590_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f3c8c4f968d2_invokedynamic1744_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f3c8c4f968d2_invokedynamic1744_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f3c8c4f968d2_invokedynamic1744_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f3c8c4f968d2_invokedynamic1744_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f3c8c4f968d2_invokedynamic1744_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_71cbfb1a39ba_originalDynamicSite2070_2(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native net.minecraft.world.biome.BiomeGenBase __sourceExactCall_67e2754ad05106(int p0, net.minecraft.world.biome.BiomeGenBase p1);
private static native int __sourceExactCall_6d3c1711757e72(int p0, long p1);

private static native net.minecraft.block.state.IBlockState __sourceExactCall_7dba7f72a5b74e(net.minecraft.block.Block p0);
private static native net.minecraft.block.state.IBlockState __sourceExactCall_654639a3f01247(moom.dN p0);
}
