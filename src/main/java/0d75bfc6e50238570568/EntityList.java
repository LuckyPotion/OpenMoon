package net.minecraft.entity;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntityList {

private static org.apache.logging.log4j.Logger a;

private static java.util.Map<java.lang.String, java.lang.Class<? extends net.minecraft.entity.Entity>> b;

private static java.util.Map<java.lang.Class<? extends net.minecraft.entity.Entity>, java.lang.String> c;

private static java.util.Map<java.lang.Integer, java.lang.Class<? extends net.minecraft.entity.Entity>> d;

private static java.util.Map<java.lang.Class<? extends net.minecraft.entity.Entity>, java.lang.Integer> e;

private static java.util.Map<java.lang.String, java.lang.Integer> f;

public static java.util.Map<java.lang.Integer, net.minecraft.entity.EntityList$EntityEggInfo> g;

private static long h;

private static long[] i;

private static java.lang.Integer[] j;

private static java.util.Map k;

public EntityList() {
super();
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(-365824681470601283L)), ((long)(-2784725408869925532L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(276712802032686L)))));
    long local11_life6 = (net.minecraft.entity.EntityList.h ^ 44736637712315L);
    k = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1849_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1849_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1849_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1849_14 = new byte[8];
    (__sourceSpill1849_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1849_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1849_16 = __sourceSpill1849_14;
    ((javax.crypto.Cipher)(__sourceSpill1849_11)).init(((int)(__sourceSpill1849_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1849_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1849_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[115];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "ç#¿|\003rS;,Ù.6óÙv't\177ú\025èãà·hªä_é--\\\036yýÏ 'ù#=êÕ'N|J%¹ìÉ¡È¶K`ÞÝ³Ðù-\022;t£dJ\032P's`;¾j®áí\017÷Î;\r¨rÙ t@óðÎ,îÔ\013Îu\021ZÖ\"Öµ\0233©HØé¦ RL\006Zôæ\003\034,Õ¦«\000m&7\034 Íòß ÌËLÍD\020úÎ\täo§é+£>\020\037¹åa\037\177ªè\t§ý£ÛÝ>/®b¥4\036Wz @oðù\032º9¾\\3r¨-2¶\033\004ëk\003»®~¡\\7¡7éÅPr\023=ç«{G .åb\023W¿\016Hu÷uR\035;®8µÂÙàÜæ1ÔÆe_ú6¬A¯·¢¿Rú\005_÷\023¼Zs\017 #È/\027Y¸cØW\0373\rÓªö\032\001Ns­\023\003*õ)°ñÙT{súÁö­«±\037^£4L\005ëÚê\025ê²là6÷$\030¶Aqñà¶q\003ãô}ò\024ÓE×J®Õ~Z¸Ç\"yÚ~s&u£¡ó\034\037Ôµ\005ñ«ßò9zæTçÊÑ\021\007eÿ1J\020Áâf\024ÁE\tÔI'\033n\nßò\0375p3L'Vt]Bl\007'sÚzeº¶Ñ7ÔLó1á»4@\004þF\026¨,ª-È°ÈwÛÖÎ\177Æ\017ÊQÆðÒ+á¸««\000±Ó¹É~o¦A\005»Å!bG\016óê\"¤)cø¬ì\013å49é\024«Åå\001âÎDÃÉô<1lä)H';ô·ü$ÓîHzñHépìÆÖñß åvGÌ»Qró¸¼Fo*áâB/ÿ\033CÊ3^Ë°íUN%c<$&^åµvøÈØúé`F\177LPÂ5d\032ú\017($\002¶°Ó 7¶¶\027¤t\001å÷èP¥æ>\006êa\000´AV»Èâæ©ú¹²,j\021FÓ½a\027x5tÎ´xXhT{\r7ê¡j\rÅ\177{\005½ÂþêáÜ\036ÛÕ)H\n\017Wè\nà©\004´gZ,ÔÎ\003+ÄnÆ4sFCÕCJ\035JðË\000ùî§C·\r\024Ô=üµûÿA-Åb¸c-È\031*mdÍ\000YûÔ\0056C²1¢¾XèE]e\002kÄ£®¿}V9\024%\035`\035¥ÝÂ\034ï\005\t·\037\037£pN¤\030ã©Ç¸£Ü%¯»\036Y!ïÊ¿¶ßÆ¤'À\021Æö"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1849_25 = local4_life21;
        int __sourceSpill1849_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1849_25)).substring(((int)(__sourceSpill1849_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1849_30 = local6_life19;
        int __sourceSpill1849_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1849_33 = new byte[8];
        (__sourceSpill1849_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1849_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1849_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1849_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1849_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1849_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1849_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1849_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1849_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1849_34)).doFinal(((byte[])(__sourceSpill1849_33)));
        (__sourceSpill1849_30)[__sourceSpill1849_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "¥©piÂRÈäßh_lHñÃt"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1849_38 = local4_life21;
        int __sourceSpill1849_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1849_38)).substring(((int)(__sourceSpill1849_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1849_43 = local6_life19;
        int __sourceSpill1849_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1849_46 = new byte[8];
        (__sourceSpill1849_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1849_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1849_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1849_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1849_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1849_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1849_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1849_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1849_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1849_47)).doFinal(((byte[])(__sourceSpill1849_46)));
        (__sourceSpill1849_43)[__sourceSpill1849_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    i = ((long[])(local6_life19));
    j = ((java.lang.Integer[])(new java.lang.Integer[115]));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
    b = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    c = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    d = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    e = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    f = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    g = ((java.util.Map)(com.google.common.collect.Maps.newLinkedHashMap()));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(net.minecraft.entity.item.EntityItem.class)), ((java.lang.String)("Item")), ((int)(1)));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(moom.tL.class)), ((java.lang.String)("XPOrb")), ((int)(2)));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(moom.tV.class)), ((java.lang.String)("ThrownEgg")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_71(27445, (4516498289100500342L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(moom.sD.class)), ((java.lang.String)("LeashKnot")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_74(7352, (7925296004699314852L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(moom.sF.class)), ((java.lang.String)("Painting")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_77(28615, (6819719387632806358L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(net.minecraft.entity.projectile.EntityArrow.class)), ((java.lang.String)("Arrow")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_80(5872, (7251310841953243265L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(moom.tX.class)), ((java.lang.String)("Snowball")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_83(12018, (6382518388136732821L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(moom.tO.class)), ((java.lang.String)("Fireball")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_86(5782, (7630982630029742313L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(moom.tP.class)), ((java.lang.String)("SmallFireball")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_89(8987, (2225610568799937854L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(moom.tT.class)), ((java.lang.String)("ThrownEnderpearl")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_92(28769, (8125897429287810607L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(moom.tx.class)), ((java.lang.String)("EyeOfEnderSignal")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_95(26799, (1271076164874874516L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(moom.tW.class)), ((java.lang.String)("ThrownPotion")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_98(10320, (7874332934232239632L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(moom.tU.class)), ((java.lang.String)("ThrownExpBottle")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_101(29751, (9024411353067958863L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(net.minecraft.entity.item.EntityItemFrame.class)), ((java.lang.String)("ItemFrame")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_104(4089, (3215410287108540911L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(moom.tQ.class)), ((java.lang.String)("WitherSkull")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_107(860, (7602459468471715138L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(moom.tK.class)), ((java.lang.String)("PrimedTnt")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_110(8043, (1239449051683838242L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(net.minecraft.entity.item.EntityFallingBlock.class)), ((java.lang.String)("FallingSand")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_113(31540, (8349803918650523000L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(net.minecraft.entity.item.EntityFireworkRocket.class)), ((java.lang.String)("FireworksRocketEntity")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_116(1502, (8133933353390457801L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(net.minecraft.entity.item.EntityArmorStand.class)), ((java.lang.String)("ArmorStand")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_119(14117, (273883571028685137L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(moom.tv.class)), ((java.lang.String)("Boat")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_122(9089, (1034670158886790552L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(moom.tH.class)), ((java.lang.String)(((net.minecraft.entity.item.EntityMinecart$EnumMinecartType)(net.minecraft.entity.item.EntityMinecart$EnumMinecartType.RIDEABLE)).a__String())), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_127(23000, (5689218850227134351L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(moom.tF.class)), ((java.lang.String)(((net.minecraft.entity.item.EntityMinecart$EnumMinecartType)(net.minecraft.entity.item.EntityMinecart$EnumMinecartType.CHEST)).a__String())), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_132(13727, (5419120840497460193L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(net.minecraft.entity.item.EntityMinecartFurnace.class)), ((java.lang.String)(((net.minecraft.entity.item.EntityMinecart$EnumMinecartType)(net.minecraft.entity.item.EntityMinecart$EnumMinecartType.FURNACE)).a__String())), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_137(20439, (7433621230277429664L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(moom.tJ.class)), ((java.lang.String)(((net.minecraft.entity.item.EntityMinecart$EnumMinecartType)(net.minecraft.entity.item.EntityMinecart$EnumMinecartType.TNT)).a__String())), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_142(19491, (1689191902992730644L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(moom.tG.class)), ((java.lang.String)(((net.minecraft.entity.item.EntityMinecart$EnumMinecartType)(net.minecraft.entity.item.EntityMinecart$EnumMinecartType.HOPPER)).a__String())), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_147(13602, (6785921833201136485L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(net.minecraft.entity.ai.EntityMinecartMobSpawner.class)), ((java.lang.String)(((net.minecraft.entity.item.EntityMinecart$EnumMinecartType)(net.minecraft.entity.item.EntityMinecart$EnumMinecartType.SPAWNER)).a__String())), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_152(21177, (4600402095578715273L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(moom.tC.class)), ((java.lang.String)(((net.minecraft.entity.item.EntityMinecart$EnumMinecartType)(net.minecraft.entity.item.EntityMinecart$EnumMinecartType.COMMAND_BLOCK)).a__String())), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_157(7045, (6713310105226304950L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(net.minecraft.entity.EntityLiving.class)), ((java.lang.String)("Mob")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_160(7474, (6040545951866411868L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(moom.sZ.class)), ((java.lang.String)("Monster")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_163(31663, (4431677237995650433L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(net.minecraft.entity.monster.EntityCreeper.class)), ((java.lang.String)("Creeper")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_166(19316, (4671856168038010132L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_167(3631, (1347696432568879127L ^ local11_life6)))), ((int)(0)));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(net.minecraft.entity.monster.EntitySkeleton.class)), ((java.lang.String)("Skeleton")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_170(14044, (13862163980742788L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_171(19441, (2339917699831369109L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_172(17431, (843274189444153899L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(moom.s9.class)), ((java.lang.String)("Spider")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_175(525, (6382496931139306575L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_176(8242, (7104007885064169069L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_177(5613, (1270387494325769158L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(moom.s5.class)), ((java.lang.String)("Giant")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_180(4187, (2229081298140517955L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(net.minecraft.entity.monster.EntityZombie.class)), ((java.lang.String)("Zombie")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_183(16394, (5691302242771797617L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_184(29, (3620220945597744732L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_185(20761, (7081304392548357919L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(net.minecraft.entity.monster.EntitySlime.class)), ((java.lang.String)("Slime")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_188(15713, (631086619471543058L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_189(12923, (4180349375485178917L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_190(17016, (3551632636863087641L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(net.minecraft.entity.monster.EntityGhast.class)), ((java.lang.String)("Ghast")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_193(15500, (2036917540393450161L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_194(8960, (3944946559974466860L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_195(25559, (6807376037991294354L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(net.minecraft.entity.monster.EntityPigZombie.class)), ((java.lang.String)("PigZombie")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_198(6789, (5506146648675245243L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_199(4420, (2810613711597819735L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_200(7519, (6363640940638755658L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(net.minecraft.entity.monster.EntityEnderman.class)), ((java.lang.String)("Enderman")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_203(30854, (4909060381815979698L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_204(22915, (6214720510001651616L ^ local11_life6)))), ((int)(0)));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(moom.s_.class)), ((java.lang.String)("CaveSpider")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_207(3358, (7646330593813777166L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_208(4310, (5450583731857577653L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_209(17321, (4040628780085806548L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(moom.s7.class)), ((java.lang.String)("Silverfish")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_212(6955, (3346470143267495286L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_213(19387, (4918326239808163202L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_214(15981, (9121966380204488795L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(net.minecraft.entity.monster.EntityBlaze.class)), ((java.lang.String)("Blaze")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_217(16179, (5008987173748046165L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_218(24377, (5078525056265066813L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_219(24397, (1645456077443832098L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(moom.th.class)), ((java.lang.String)("LavaSlime")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_222(30893, (6776715678542806763L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_223(13155, (3435040451045684519L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_224(31462, (6168278046751243404L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(net.minecraft.entity.boss.EntityDragon.class)), ((java.lang.String)("EnderDragon")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_227(23250, (4772556114263710957L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(net.minecraft.entity.boss.EntityWither.class)), ((java.lang.String)("WitherBoss")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_230(5418, (6889314043311346446L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(net.minecraft.entity.passive.EntityBat.class)), ((java.lang.String)("Bat")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_233(19779, (7935184844362091361L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_234(16167, (4772948106116626744L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_235(1908, (3980200329902801248L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(moom.ta.class)), ((java.lang.String)("Witch")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_238(9956, (8699849484325511326L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_239(12987, (5917302172796777660L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_240(4951, (7946327033047405870L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(net.minecraft.entity.monster.EntityEndermite.class)), ((java.lang.String)("Endermite")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_243(14045, (6165797097291182223L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_244(4131, (7532066873062938191L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_245(18779, (2154944961552224122L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(net.minecraft.entity.monster.EntityGuardian.class)), ((java.lang.String)("Guardian")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_248(17642, (4144911130714669773L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_249(12174, (4523620367040014819L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_250(8666, (4580774518045992847L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(net.minecraft.entity.passive.EntityPig.class)), ((java.lang.String)("Pig")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_253(9604, (6285370171187061726L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_254(23305, (1803363859041492259L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_255(24668, (7410159092377233012L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(net.minecraft.entity.passive.EntitySheep.class)), ((java.lang.String)("Sheep")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_258(7478, (5401076464388266797L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_259(26374, (4252960392566907258L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_260(30478, (3835470933086744955L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(moom.sM.class)), ((java.lang.String)("Cow")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_263(14522, (771183466557603563L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_264(28529, (4880390703821039917L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_265(26984, (2677568526620208947L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(net.minecraft.entity.passive.EntityChicken.class)), ((java.lang.String)("Chicken")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_268(13072, (8186539027077756217L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_269(9095, (3170637419442890186L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_270(3603, (5849409526949660760L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(moom.tl.class)), ((java.lang.String)("Squid")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_273(11967, (822175753679693997L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_274(18166, (5575607393659453630L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_275(10784, (8320668585560206454L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(net.minecraft.entity.passive.EntityWolf.class)), ((java.lang.String)("Wolf")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_278(29273, (3457508395665667188L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_279(12057, (9203762050194827563L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_280(20771, (6920225948895287097L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(moom.sN.class)), ((java.lang.String)("MushroomCow")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_283(31842, (5029368712363326029L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_284(29524, (6200146043323397477L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_285(16493, (2512438699892180486L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(moom.sY.class)), ((java.lang.String)("SnowMan")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_288(12614, (4816603248978196236L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(net.minecraft.entity.passive.EntityOcelot.class)), ((java.lang.String)("Ozelot")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_291(27197, (7683144790740610158L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_292(25012, (3560351962813704173L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_293(29983, (1897517695586874230L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(net.minecraft.entity.monster.EntityIronGolem.class)), ((java.lang.String)("VillagerGolem")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_296(27203, (1967835937334570085L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(net.minecraft.entity.passive.EntityHorse.class)), ((java.lang.String)("EntityHorse")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_299(8605, (7389614623689861074L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_300(29670, (733615748622497222L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_301(10131, (6663117563414045097L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(net.minecraft.entity.passive.EntityRabbit.class)), ((java.lang.String)("Rabbit")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_304(25123, (6777784058096460862L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_305(8509, (4250874724799473496L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_306(5076, (4857066589205747072L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(net.minecraft.entity.passive.EntityVillager.class)), ((java.lang.String)("Villager")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_309(4896, (4420841800810681712L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_310(7960, (5656267501517592938L ^ local11_life6)))), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_311(30450, (2158233908590424218L ^ local11_life6)))));
    net.minecraft.entity.EntityList.a(((java.lang.Class)(moom.tw.class)), ((java.lang.String)("EnderCrystal")), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_314(3069, (6632895085568904589L ^ local11_life6)))));
}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_21b99ef3ab3c0934bd81() throws E;
private static final class __SourceHandler_21b99ef3ab3c0934bd81 {

public static java.util.List f254() throws Throwable {
    int lexicalValue254_47_0;
    int lexicalValue254_53_0;
    int spill254_0;
    int spill254_1;
    long life0_3;
    java.util.Set life3_6;
    java.util.ArrayList life4_9;
    int life2_10;
    java.util.Iterator life5_13;
    java.lang.String life6_20;
    java.lang.Class life7_25;
    lexical_join_53: {
    lexical_join_50: {
    life0_3 = (__fieldRead254_0() ^ 119707142703623L);
    life3_6 = __call254_2(__fieldRead254_1());
    spill254_0 = __call254_3();
    life4_9 = __call254_4();
    life2_10 = spill254_0;
    life5_13 = __call254_5(life3_6);
    lexical_cycle_14: while (true) {
    lexical_join_48: {
    lexical_join_47: {
    if (!(__call254_6(life5_13))) {
        break lexical_join_50;
    }
    life6_20 = __cast254_8(__call254_7(life5_13));
    life7_25 = __cast254_11(__call254_10(__fieldRead254_9(), life6_20));
    spill254_1 = (__call254_12(life7_25) & __invokedynamic254_13(16357, (441494402935063611L ^ life0_3)));
    if (!((life2_10 != 0))) {
        lexicalValue254_53_0 = spill254_1;
        break lexical_join_53;
    }
    if (!((life2_10 != 0))) {
        lexicalValue254_47_0 = spill254_1;
        break lexical_join_47;
    }
    if (!((spill254_1 != __invokedynamic254_14(20891, (463966783633713682L ^ life0_3))))) {
        break lexical_join_48;
    }
    lexicalValue254_47_0 = __integerCategory254_16(__call254_15(life4_9, life6_20));
    }
    __discardScalar254_17(lexicalValue254_47_0);
    }
    if (!((life2_10 == 0))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    lexicalValue254_53_0 = __integerCategory254_19(__call254_18(life4_9, "LightningBolt"));
    }
    __discardScalar254_20(lexicalValue254_53_0);
    return life4_9;
}
public static void h254_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1025400_0(p0);
}
public static void h254_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1025401_0(p0);
}
public static void h254_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1025402_0(p0);
}
private static native long __fieldRead254_0() throws Throwable;
private static native java.util.Map __fieldRead254_1() throws Throwable;
private static native java.util.Set __call254_2(java.util.Map a0) throws Throwable;
private static native int __call254_3() throws Throwable;
private static native java.util.ArrayList __call254_4() throws Throwable;
private static native java.util.Iterator __call254_5(java.util.Set a0) throws Throwable;
private static native boolean __call254_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call254_7(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast254_8(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead254_9() throws Throwable;
private static native java.lang.Object __call254_10(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.Class __cast254_11(java.lang.Object a0) throws Throwable;
private static native int __call254_12(java.lang.Class a0) throws Throwable;
private static native int __invokedynamic254_13(int a0, long a1) throws Throwable;
private static native int __invokedynamic254_14(int a0, long a1) throws Throwable;
private static native boolean __call254_15(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory254_16(boolean value) throws Throwable;
private static native void __discardScalar254_17(int a0) throws Throwable;
private static native boolean __call254_18(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory254_19(boolean value) throws Throwable;
private static native void __discardScalar254_20(int a0) throws Throwable;
private static native java.lang.Exception __call1025400_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1025401_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1025402_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.entity.Entity __sourceHandlerCall_efa0da0d4dcec6f81bbd(int a0, net.minecraft.world.World a1) throws E;
private static final class __SourceHandler_efa0da0d4dcec6f81bbd {

public static net.minecraft.entity.Entity f652(int p0, net.minecraft.world.World p1) throws Throwable {
    java.lang.Object forestValue652_30_0;
    net.minecraft.entity.Entity forestValue652_41_0;
    int spill652_0;
    java.lang.Class spill652_1;
    java.lang.Class spill652_2;
    java.lang.Class[] spill652_3;
    java.lang.reflect.Constructor spill652_4;
    java.lang.Object[] spill652_5;
    net.minecraft.entity.Entity spill652_6;
    long life2_3;
    net.minecraft.entity.Entity life5_6;
    int life4_7;
    java.lang.Class life6_10;
    forest_join_41: {
    forest_join_40: {
    forest_join_32: {
    forest_join_30: {
    life2_3 = (__fieldRead652_0() ^ 75681215641016L);
    spill652_0 = __call652_1();
    life5_6 = null;
    life4_7 = spill652_0;
    life6_10 = __call652_2(p0);
    spill652_1 = life6_10;
    if (!((life4_7 == 0))) {
        forestValue652_30_0 = spill652_1;
        break forest_join_30;
    }
    if (!((spill652_1 != null))) {
        break forest_join_32;
    }
    spill652_2 = life6_10;
    java.lang.Class[] __stackOp652_3_0 = new java.lang.Class[1];
    spill652_3 = __stackOp652_3_0;
    (__stackOp652_3_0)[0] = __classLiteral652_4();
    spill652_4 = __call652_5(spill652_2, spill652_3);
    java.lang.Object[] __stackOp652_6_0 = new java.lang.Object[1];
    spill652_5 = __stackOp652_6_0;
    (__stackOp652_6_0)[0] = p1;
    forestValue652_30_0 = __call652_7(spill652_4, spill652_5);
    }
    life5_6 = __cast652_8(forestValue652_30_0);
    }
    spill652_6 = life5_6;
    if (!((life4_7 == 0))) {
        forestValue652_41_0 = spill652_6;
        break forest_join_41;
    }
    if (!((spill652_6 == null))) {
        break forest_join_40;
    }
    __call652_11(__fieldRead652_9(), __invokedynamic652_10(p0));
    }
    forestValue652_41_0 = life5_6;
    }
    return forestValue652_41_0;
}
public static net.minecraft.entity.Entity h652_0(java.lang.Exception p0) throws Throwable {
    throw __call3065200_0(p0);
}
public static net.minecraft.entity.Entity h652_1(java.lang.Exception p0) throws Throwable {
    throw __call3065201_0(p0);
}
public static net.minecraft.entity.Entity h652_2(java.lang.Exception p0, int p1, int p2, net.minecraft.entity.Entity p3, java.lang.Class p4) throws Throwable {
    net.minecraft.entity.Entity forestValue3065202_13_0;
    net.minecraft.entity.Entity spill3065202_0;
    java.lang.Exception life4_2;
    forest_join_13: {
    forest_join_12: {
    life4_2 = p0;
    __call3065202_0(life4_2);
    spill3065202_0 = p3;
    if (!((p2 == 0))) {
        forestValue3065202_13_0 = spill3065202_0;
        break forest_join_13;
    }
    if (!((spill3065202_0 == null))) {
        break forest_join_12;
    }
    __call3065202_3(__fieldRead3065202_1(), __invokedynamic3065202_2(p1));
    }
    forestValue3065202_13_0 = p3;
    }
    return forestValue3065202_13_0;
}
public static net.minecraft.entity.Entity h652_3(java.lang.Exception p0) throws Throwable {
    throw __call3065203_0(p0);
}
public static net.minecraft.entity.Entity h652_4(java.lang.Exception p0) throws Throwable {
    throw __call3065204_0(p0);
}
private static native long __fieldRead652_0() throws Throwable;
private static native int __call652_1() throws Throwable;
private static native java.lang.Class __call652_2(int a0) throws Throwable;
private static native java.lang.Class __classLiteral652_4() throws Throwable;
private static native java.lang.reflect.Constructor __call652_5(java.lang.Class a0, java.lang.Class[] a1) throws Throwable;
private static native java.lang.Object __call652_7(java.lang.reflect.Constructor a0, java.lang.Object[] a1) throws Throwable;
private static native net.minecraft.entity.Entity __cast652_8(java.lang.Object a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead652_9() throws Throwable;
private static native java.lang.String __invokedynamic652_10(int a0) throws Throwable;
private static native void __call652_11(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call3065200_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3065201_0(java.lang.Exception a0) throws Throwable;
private static native void __call3065202_0(java.lang.Exception a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3065202_1() throws Throwable;
private static native java.lang.String __invokedynamic3065202_2(int a0) throws Throwable;
private static native void __call3065202_3(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call3065203_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3065204_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_75dbd0df7e8c2cd91a00(java.lang.Class a0, java.lang.String a1, int a2) throws E;
private static final class __SourceHandler_75dbd0df7e8c2cd91a00 {

public static void f2786(java.lang.Class p0, java.lang.String p1, int p2) throws Throwable {
    long life3_3;
    life3_3 = (__fieldRead2786_0() ^ 123390949321730L);
    if (__call2786_2(__fieldRead2786_1(), p1)) {
        throw new java.lang.IllegalArgumentException(__invokedynamic2786_3(p1));
    }
    if (__call2786_6(__fieldRead2786_4(), __call2786_5(p2))) {
        throw new java.lang.IllegalArgumentException(__invokedynamic2786_7(p2));
    }
    if ((p2 == 0)) {
        throw new java.lang.IllegalArgumentException(__invokedynamic2786_8(p2));
    }
    if ((p0 == null)) {
        throw new java.lang.IllegalArgumentException(__invokedynamic2786_9(p2));
    }
    __call2786_11(__fieldRead2786_10(), p1, p0);
    __call2786_13(__fieldRead2786_12(), p0, p1);
    __call2786_16(__fieldRead2786_14(), __call2786_15(p2), p0);
    __call2786_19(__fieldRead2786_17(), p0, __call2786_18(p2));
    __call2786_22(__fieldRead2786_20(), p1, __call2786_21(p2));
    return;
}
public static void h2786_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1278600_0(p0);
}
public static void h2786_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1278601_0(p0);
}
public static void h2786_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1278602_0(p0);
}
public static void h2786_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1278603_0(p0);
}
private static native long __fieldRead2786_0() throws Throwable;
private static native java.util.Map __fieldRead2786_1() throws Throwable;
private static native boolean __call2786_2(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic2786_3(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead2786_4() throws Throwable;
private static native java.lang.Integer __call2786_5(int a0) throws Throwable;
private static native boolean __call2786_6(java.util.Map a0, java.lang.Integer a1) throws Throwable;
private static native java.lang.String __invokedynamic2786_7(int a0) throws Throwable;
private static native java.lang.String __invokedynamic2786_8(int a0) throws Throwable;
private static native java.lang.String __invokedynamic2786_9(int a0) throws Throwable;
private static native java.util.Map __fieldRead2786_10() throws Throwable;
private static native java.lang.Object __call2786_11(java.util.Map a0, java.lang.String a1, java.lang.Class a2) throws Throwable;
private static native java.util.Map __fieldRead2786_12() throws Throwable;
private static native java.lang.Object __call2786_13(java.util.Map a0, java.lang.Class a1, java.lang.String a2) throws Throwable;
private static native java.util.Map __fieldRead2786_14() throws Throwable;
private static native java.lang.Integer __call2786_15(int a0) throws Throwable;
private static native java.lang.Object __call2786_16(java.util.Map a0, java.lang.Integer a1, java.lang.Class a2) throws Throwable;
private static native java.util.Map __fieldRead2786_17() throws Throwable;
private static native java.lang.Integer __call2786_18(int a0) throws Throwable;
private static native java.lang.Object __call2786_19(java.util.Map a0, java.lang.Class a1, java.lang.Integer a2) throws Throwable;
private static native java.util.Map __fieldRead2786_20() throws Throwable;
private static native java.lang.Integer __call2786_21(int a0) throws Throwable;
private static native java.lang.Object __call2786_22(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.lang.Exception __call1278600_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1278601_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1278602_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1278603_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_fb20590b3c1aa17db261(java.lang.String a0) throws E;
private static final class __SourceHandler_fb20590b3c1aa17db261 {

public static int f1537(java.lang.String p0) throws Throwable {
    java.lang.Integer forwardValue1537_22_0;
    int forwardValue1537_23_0;
    int spill1537_0;
    java.lang.Integer spill1537_1;
    long life1_3;
    java.lang.Integer life4_9;
    int life3_10;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    life1_3 = (__fieldRead1537_0() ^ 117291246829699L);
    spill1537_0 = __call1537_1();
    life4_9 = __cast1537_4(__call1537_3(__fieldRead1537_2(), p0));
    life3_10 = spill1537_0;
    spill1537_1 = life4_9;
    if (!((life3_10 == 0))) {
        forwardValue1537_22_0 = spill1537_1;
        break forward_join_22;
    }
    if (!((spill1537_1 == null))) {
        break forward_join_21;
    }
    forwardValue1537_23_0 = __invokedynamic1537_5(32098, (798017210326109228L ^ life1_3));
    break forward_join_23;
    }
    forwardValue1537_22_0 = life4_9;
    }
    forwardValue1537_23_0 = __call1537_6(forwardValue1537_22_0);
    }
    return forwardValue1537_23_0;
}
public static void h1537_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1153700_0(p0);
}
public static void h1537_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1153701_0(p0);
}
private static native long __fieldRead1537_0() throws Throwable;
private static native int __call1537_1() throws Throwable;
private static native java.util.Map __fieldRead1537_2() throws Throwable;
private static native java.lang.Object __call1537_3(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.Integer __cast1537_4(java.lang.Object a0) throws Throwable;
private static native int __invokedynamic1537_5(int a0, long a1) throws Throwable;
private static native int __call1537_6(java.lang.Integer a0) throws Throwable;
private static native java.lang.Exception __call1153700_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1153701_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.entity.Entity __sourceHandlerCall_7d4f9e46bf7d3d2722e7(java.lang.String a0, net.minecraft.world.World a1) throws E;
private static final class __SourceHandler_7d4f9e46bf7d3d2722e7 {

public static net.minecraft.entity.Entity f653(java.lang.String p0, net.minecraft.world.World p1) throws Throwable {
    java.lang.Object forestValue653_32_0;
    int spill653_0;
    java.lang.Class spill653_1;
    java.lang.Class spill653_2;
    java.lang.Class[] spill653_3;
    java.lang.reflect.Constructor spill653_4;
    java.lang.Object[] spill653_5;
    long life2_3;
    net.minecraft.entity.Entity life5_6;
    int life4_7;
    java.lang.Class life6_12;
    forest_join_34: {
    forest_join_32: {
    life2_3 = (__fieldRead653_0() ^ 91468608496761L);
    spill653_0 = __call653_1();
    life5_6 = null;
    life4_7 = spill653_0;
    life6_12 = __cast653_4(__call653_3(__fieldRead653_2(), p0));
    spill653_1 = life6_12;
    if (!((life4_7 == 0))) {
        forestValue653_32_0 = spill653_1;
        break forest_join_32;
    }
    if (!((spill653_1 != null))) {
        break forest_join_34;
    }
    spill653_2 = life6_12;
    java.lang.Class[] __stackOp653_5_0 = new java.lang.Class[1];
    spill653_3 = __stackOp653_5_0;
    (__stackOp653_5_0)[0] = __classLiteral653_6();
    spill653_4 = __call653_7(spill653_2, spill653_3);
    java.lang.Object[] __stackOp653_8_0 = new java.lang.Object[1];
    spill653_5 = __stackOp653_8_0;
    (__stackOp653_8_0)[0] = p1;
    forestValue653_32_0 = __call653_9(spill653_4, spill653_5);
    }
    life5_6 = __cast653_10(forestValue653_32_0);
    }
    return life5_6;
}
public static net.minecraft.entity.Entity h653_0(java.lang.Exception p0) throws Throwable {
    throw __call3065300_0(p0);
}
public static net.minecraft.entity.Entity h653_1(java.lang.Exception p0) throws Throwable {
    throw __call3065301_0(p0);
}
public static net.minecraft.entity.Entity h653_2(java.lang.Exception p0, net.minecraft.entity.Entity p1, java.lang.Class p2) throws Throwable {
    java.lang.Exception life2_2;
    life2_2 = p0;
    __call3065302_0(life2_2);
    return p1;
}
private static native long __fieldRead653_0() throws Throwable;
private static native int __call653_1() throws Throwable;
private static native java.util.Map __fieldRead653_2() throws Throwable;
private static native java.lang.Object __call653_3(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.Class __cast653_4(java.lang.Object a0) throws Throwable;
private static native java.lang.Class __classLiteral653_6() throws Throwable;
private static native java.lang.reflect.Constructor __call653_7(java.lang.Class a0, java.lang.Class[] a1) throws Throwable;
private static native java.lang.Object __call653_9(java.lang.reflect.Constructor a0, java.lang.Object[] a1) throws Throwable;
private static native net.minecraft.entity.Entity __cast653_10(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call3065300_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3065301_0(java.lang.Exception a0) throws Throwable;
private static native void __call3065302_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_12f8cd95e555c70ac993(net.minecraft.entity.Entity a0) throws E;
private static final class __SourceHandler_12f8cd95e555c70ac993 {

public static int f1538(net.minecraft.entity.Entity p0) throws Throwable {
    java.lang.Integer forwardValue1538_19_0;
    int forwardValue1538_20_0;
    int spill1538_0;
    java.lang.Integer spill1538_1;
    long life1_3;
    java.lang.Integer life4_10;
    int life3_11;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life1_3 = (__fieldRead1538_0() ^ 71433579545629L);
    spill1538_0 = __call1538_1();
    life4_10 = __cast1538_5(__call1538_4(__fieldRead1538_2(), __call1538_3(p0)));
    life3_11 = spill1538_0;
    spill1538_1 = life4_10;
    if (!((life3_11 != 0))) {
        forwardValue1538_19_0 = spill1538_1;
        break forward_join_19;
    }
    if (!((spill1538_1 == null))) {
        break forward_join_18;
    }
    forwardValue1538_20_0 = 0;
    break forward_join_20;
    }
    forwardValue1538_19_0 = life4_10;
    }
    forwardValue1538_20_0 = __call1538_6(forwardValue1538_19_0);
    }
    return forwardValue1538_20_0;
}
public static void h1538_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1153800_0(p0);
}
public static void h1538_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1153801_0(p0);
}
private static native long __fieldRead1538_0() throws Throwable;
private static native int __call1538_1() throws Throwable;
private static native java.util.Map __fieldRead1538_2() throws Throwable;
private static native java.lang.Class __call1538_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.Object __call1538_4(java.util.Map a0, java.lang.Class a1) throws Throwable;
private static native java.lang.Integer __cast1538_5(java.lang.Object a0) throws Throwable;
private static native int __call1538_6(java.lang.Integer a0) throws Throwable;
private static native java.lang.Exception __call1153800_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1153801_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_0ea549fa6cb66290bd34(net.minecraft.entity.Entity a0, java.lang.String a1) throws E;
private static final class __SourceHandler_0ea549fa6cb66290bd34 {

public static boolean f1539(net.minecraft.entity.Entity p0, java.lang.String p1) throws Throwable {
    java.lang.String forwardValue1539_21_0;
    java.lang.String forwardValue1539_32_0;
    int forwardValue1539_34_0;
    int spill1539_0;
    java.lang.String spill1539_1;
    int spill1539_2;
    long life2_3;
    java.lang.String life5_7;
    int life4_8;
    forward_join_34: {
    forward_join_32: {
    forward_join_31: {
    forward_join_21: {
    forward_join_20: {
    life2_3 = (__fieldRead1539_0() ^ 43860613168003L);
    spill1539_0 = __call1539_1();
    life5_7 = __call1539_2(p0);
    life4_8 = spill1539_0;
    spill1539_1 = life5_7;
    if (!((life4_8 != 0))) {
        forwardValue1539_21_0 = spill1539_1;
        break forward_join_21;
    }
    if (!((spill1539_1 == null))) {
        break forward_join_20;
    }
    if (!((__instanceOf1539_3(p0) != 0))) {
        break forward_join_20;
    }
    life5_7 = "Player";
    if (!((life4_8 == 0))) {
        break forward_join_31;
    }
    }
    forwardValue1539_21_0 = life5_7;
    }
    if (!((life4_8 != 0))) {
        forwardValue1539_32_0 = forwardValue1539_21_0;
        break forward_join_32;
    }
    if (!((forwardValue1539_21_0 == null))) {
        break forward_join_31;
    }
    spill1539_2 = __instanceOf1539_4(p0);
    if (!((life4_8 != 0))) {
        forwardValue1539_34_0 = spill1539_2;
        break forward_join_34;
    }
    if (!((spill1539_2 != 0))) {
        break forward_join_31;
    }
    life5_7 = "LightningBolt";
    }
    forwardValue1539_32_0 = p1;
    }
    forwardValue1539_34_0 = __integerCategory1539_6(__call1539_5(forwardValue1539_32_0, life5_7));
    }
    return __integerCategory1539_7(forwardValue1539_34_0);
}
public static void h1539_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1153900_0(p0);
}
public static void h1539_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1153901_0(p0);
}
public static void h1539_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1153902_0(p0);
}
public static void h1539_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1153903_0(p0);
}
public static void h1539_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1153904_0(p0);
}
public static void h1539_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1153905_0(p0);
}
private static native long __fieldRead1539_0() throws Throwable;
private static native int __call1539_1() throws Throwable;
private static native java.lang.String __call1539_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __instanceOf1539_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __instanceOf1539_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call1539_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1539_6(boolean value) throws Throwable;
private static native boolean __integerCategory1539_7(int value) throws Throwable;
private static native java.lang.Exception __call1153900_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1153901_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1153902_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1153903_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1153904_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1153905_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.entity.Entity __sourceHandlerCall_47e63d560c1dc62b9064(net.minecraft.nbt.NBTTagCompound a0, net.minecraft.world.World a1) throws E;
private static final class __SourceHandler_47e63d560c1dc62b9064 {

public static net.minecraft.entity.Entity f654(net.minecraft.nbt.NBTTagCompound p0, net.minecraft.world.World p1) throws Throwable {
    java.lang.Object forestValue654_32_0;
    java.lang.Object forestValue654_53_0;
    net.minecraft.entity.Entity forestValue654_60_0;
    int spill654_0;
    java.lang.String spill654_1;
    java.lang.Class spill654_2;
    java.lang.Class spill654_3;
    java.lang.Class[] spill654_4;
    java.lang.reflect.Constructor spill654_5;
    java.lang.Object[] spill654_6;
    net.minecraft.entity.Entity spill654_7;
    long life2_3;
    net.minecraft.entity.Entity life5_6;
    int life4_7;
    java.lang.Class life6_35;
    forest_join_70: {
    forest_join_64: {
    forest_join_60: {
    forest_join_55: {
    forest_join_53: {
    forest_join_32: {
    forest_join_27: {
    life2_3 = (__fieldRead654_0() ^ 93348834530184L);
    spill654_0 = __call654_1();
    life5_6 = null;
    life4_7 = spill654_0;
    spill654_1 = "Minecart";
    if (!((life4_7 != 0))) {
        forestValue654_32_0 = spill654_1;
        break forest_join_32;
    }
    if (!(__call654_3(spill654_1, __call654_2(p0, "id")))) {
        break forest_join_27;
    }
    __call654_7(p0, "id", __call654_6(__call654_5(__call654_4(p0, "Type"))));
    __call654_8(p0, "Type");
    }
    forestValue654_32_0 = __call654_11(__fieldRead654_9(), __call654_10(p0, "id"));
    }
    life6_35 = __cast654_12(forestValue654_32_0);
    spill654_2 = life6_35;
    if (!((life4_7 != 0))) {
        forestValue654_53_0 = spill654_2;
        break forest_join_53;
    }
    if (!((spill654_2 != null))) {
        break forest_join_55;
    }
    spill654_3 = life6_35;
    java.lang.Class[] __stackOp654_13_0 = new java.lang.Class[1];
    spill654_4 = __stackOp654_13_0;
    (__stackOp654_13_0)[0] = __classLiteral654_14();
    spill654_5 = __call654_15(spill654_3, spill654_4);
    java.lang.Object[] __stackOp654_16_0 = new java.lang.Object[1];
    spill654_6 = __stackOp654_16_0;
    (__stackOp654_16_0)[0] = p1;
    forestValue654_53_0 = __call654_17(spill654_5, spill654_6);
    }
    life5_6 = __cast654_18(forestValue654_53_0);
    }
    spill654_7 = life5_6;
    if (!((life4_7 != 0))) {
        forestValue654_60_0 = spill654_7;
        break forest_join_60;
    }
    if (!((spill654_7 != null))) {
        break forest_join_64;
    }
    forestValue654_60_0 = life5_6;
    }
    __call654_19(forestValue654_60_0, p0);
    if (!((life4_7 == 0))) {
        break forest_join_70;
    }
    }
    __call654_23(__fieldRead654_20(), __invokedynamic654_22(__call654_21(p0, "id")));
    }
    return life5_6;
}
public static net.minecraft.entity.Entity h654_0(java.lang.Exception p0) throws Throwable {
    throw __call3065400_0(p0);
}
public static net.minecraft.entity.Entity h654_1(java.lang.Exception p0) throws Throwable {
    throw __call3065401_0(p0);
}
public static net.minecraft.entity.Entity h654_2(java.lang.Exception p0) throws Throwable {
    throw __call3065402_0(p0);
}
public static net.minecraft.entity.Entity h654_3(java.lang.Exception p0) throws Throwable {
    throw __call3065403_0(p0);
}
public static net.minecraft.entity.Entity h654_4(java.lang.Exception p0, net.minecraft.nbt.NBTTagCompound p1, int p2, net.minecraft.entity.Entity p3, java.lang.Class p4) throws Throwable {
    net.minecraft.entity.Entity forestValue3065404_9_0;
    net.minecraft.entity.Entity spill3065404_0;
    java.lang.Exception life4_2;
    forest_join_19: {
    forest_join_13: {
    forest_join_9: {
    life4_2 = p0;
    __call3065404_0(life4_2);
    spill3065404_0 = p3;
    if (!((p2 != 0))) {
        forestValue3065404_9_0 = spill3065404_0;
        break forest_join_9;
    }
    if (!((spill3065404_0 != null))) {
        break forest_join_13;
    }
    forestValue3065404_9_0 = p3;
    }
    __call3065404_1(forestValue3065404_9_0, p1);
    if (!((p2 == 0))) {
        break forest_join_19;
    }
    }
    __call3065404_5(__fieldRead3065404_2(), __invokedynamic3065404_4(__call3065404_3(p1, "id")));
    }
    return p3;
}
public static net.minecraft.entity.Entity h654_5(java.lang.Exception p0) throws Throwable {
    throw __call3065405_0(p0);
}
public static net.minecraft.entity.Entity h654_6(java.lang.Exception p0) throws Throwable {
    throw __call3065406_0(p0);
}
private static native long __fieldRead654_0() throws Throwable;
private static native int __call654_1() throws Throwable;
private static native java.lang.String __call654_2(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native boolean __call654_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __call654_4(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __call654_5(int a0) throws Throwable;
private static native java.lang.String __call654_6(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native void __call654_7(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call654_8(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead654_9() throws Throwable;
private static native java.lang.String __call654_10(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call654_11(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.Class __cast654_12(java.lang.Object a0) throws Throwable;
private static native java.lang.Class __classLiteral654_14() throws Throwable;
private static native java.lang.reflect.Constructor __call654_15(java.lang.Class a0, java.lang.Class[] a1) throws Throwable;
private static native java.lang.Object __call654_17(java.lang.reflect.Constructor a0, java.lang.Object[] a1) throws Throwable;
private static native net.minecraft.entity.Entity __cast654_18(java.lang.Object a0) throws Throwable;
private static native void __call654_19(net.minecraft.entity.Entity a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead654_20() throws Throwable;
private static native java.lang.String __call654_21(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic654_22(java.lang.String a0) throws Throwable;
private static native void __call654_23(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call3065400_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3065401_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3065402_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3065403_0(java.lang.Exception a0) throws Throwable;
private static native void __call3065404_0(java.lang.Exception a0) throws Throwable;
private static native void __call3065404_1(net.minecraft.entity.Entity a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3065404_2() throws Throwable;
private static native java.lang.String __call3065404_3(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic3065404_4(java.lang.String a0) throws Throwable;
private static native void __call3065404_5(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call3065405_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3065406_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_990895f18f15e7e3b438(java.lang.String a0) throws E;
private static final class __SourceHandler_990895f18f15e7e3b438 {

public static boolean f1540(java.lang.String p0) throws Throwable {
    int forwardValue1540_19_0;
    int forwardValue1540_21_0;
    boolean spill1540_0;
    boolean spill1540_1;
    long life1_3;
    int life3_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life1_3 = (__fieldRead1540_0() ^ 14273478930191L);
    life3_5 = __call1540_1();
    spill1540_0 = __call1540_2("Player", p0);
    if (!((life3_5 != 0))) {
        forwardValue1540_19_0 = __integerCategory1540_3(spill1540_0);
        break forward_join_19;
    }
    if (!((!spill1540_0))) {
        break forward_join_18;
    }
    spill1540_1 = __call1540_5(__call1540_4(), p0);
    if (!((life3_5 != 0))) {
        forwardValue1540_19_0 = __integerCategory1540_6(spill1540_1);
        break forward_join_19;
    }
    if (!(spill1540_1)) {
        break forward_join_20;
    }
    }
    forwardValue1540_19_0 = 1;
    }
    forwardValue1540_21_0 = forwardValue1540_19_0;
    break forward_join_21;
    }
    forwardValue1540_21_0 = 0;
    }
    return __integerCategory1540_7(forwardValue1540_21_0);
}
public static void h1540_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1154000_0(p0);
}
public static void h1540_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1154001_0(p0);
}
public static void h1540_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1154002_0(p0);
}
private static native long __fieldRead1540_0() throws Throwable;
private static native int __call1540_1() throws Throwable;
private static native boolean __call1540_2(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1540_3(boolean value) throws Throwable;
private static native java.util.List __call1540_4() throws Throwable;
private static native boolean __call1540_5(java.util.List a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1540_6(boolean value) throws Throwable;
private static native boolean __integerCategory1540_7(int value) throws Throwable;
private static native java.lang.Exception __call1154000_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1154001_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1154002_0(java.lang.IllegalArgumentException a0) throws Throwable;

}


public static boolean a__Boolean(java.lang.String p0) { return __sourceHandlerCall_990895f18f15e7e3b438(p0); }


public static boolean a(net.minecraft.entity.Entity p0, java.lang.String p1) { return __sourceHandlerCall_0ea549fa6cb66290bd34(p0, p1); }


public static java.util.List<java.lang.String> a() { return __sourceHandlerCall_21b99ef3ab3c0934bd81(); }


public static void a__Void() {
return;
}


public static java.lang.String a__String(int p0) {
return ((java.lang.String)(((java.util.Map)(net.minecraft.entity.EntityList.c)).get(((java.lang.Object)(net.minecraft.entity.EntityList.a(((int)(p0))))))));
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.entity.EntityList.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 10036;
      if (j[var3] == null) {
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
         long var5 = i[var3];
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
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/tZ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral11155_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/tZ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static net.minecraft.entity.Entity a(int p0, net.minecraft.world.World p1) { return __sourceHandlerCall_efa0da0d4dcec6f81bbd(p0, p1); }


public static net.minecraft.entity.Entity a(net.minecraft.nbt.NBTTagCompound p0, net.minecraft.world.World p1) { return __sourceHandlerCall_47e63d560c1dc62b9064(p0, p1); }


public static net.minecraft.entity.Entity a(java.lang.String p0, net.minecraft.world.World p1) { return __sourceHandlerCall_7d4f9e46bf7d3d2722e7(p0, p1); }


private static void a(java.lang.Class<? extends net.minecraft.entity.Entity> p0, java.lang.String p1, int p2, int p3, int p4) {
net.minecraft.entity.EntityList.a(((java.lang.Class)(p0)), ((java.lang.String)(p1)), ((int)(p2)));
    ((java.util.Map)(net.minecraft.entity.EntityList.g)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(p2))))), ((java.lang.Object)(new net.minecraft.entity.EntityList$EntityEggInfo(p2, p3, p4))));
    return;
}


private static void a(java.lang.Class<? extends net.minecraft.entity.Entity> p0, java.lang.String p1, int p2) { __sourceHandlerCall_75dbd0df7e8c2cd91a00(p0, p1, p2); }


public static int a(java.lang.String p0) { return __sourceHandlerCall_fb20590b3c1aa17db261(p0); }


public static java.lang.String a__String(net.minecraft.entity.Entity p0) {
return ((java.lang.String)(((java.util.Map)(net.minecraft.entity.EntityList.c)).get(((java.lang.Object)(((java.lang.Object)(p0)).getClass())))));
}


public static java.lang.Class<? extends net.minecraft.entity.Entity> a(int p0) {
return ((java.lang.Class)(((java.util.Map)(net.minecraft.entity.EntityList.d)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0))))))));
}


public static int a(net.minecraft.entity.Entity p0) { return __sourceHandlerCall_12f8cd95e555c70ac993(p0); }


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_92(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_104(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_110(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_113(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_116(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_119(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_122(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_127(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_132(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_137(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_142(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_147(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_152(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_157(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_160(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_163(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_166(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_167(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_170(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_171(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_172(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_175(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_176(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_177(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_180(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_183(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_184(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_185(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_188(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_189(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_190(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_193(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_194(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_195(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_198(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_199(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_200(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_203(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_204(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_207(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_208(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_209(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_212(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_213(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_214(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_217(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_218(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_219(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_222(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_223(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_224(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_227(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_230(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_233(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_234(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_235(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_238(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_239(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_240(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_243(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_244(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_245(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_248(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_249(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_250(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_253(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_254(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_255(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_258(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_259(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_260(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_263(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_264(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_265(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_268(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_269(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_270(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_273(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_274(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_275(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_278(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_279(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_280(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_283(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_284(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_285(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_288(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_291(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_292(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_293(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_296(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_299(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_300(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_301(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_304(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_305(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_306(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_309(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_310(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_311(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1849_314(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral11155_0() throws E;
}
