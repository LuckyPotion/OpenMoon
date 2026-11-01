package net.minecraft.util;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EnumParticleTypes extends sourcebuild.EnumConstructor<net.minecraft.util.EnumParticleTypes> {

public static net.minecraft.util.EnumParticleTypes EXPLOSION_NORMAL;

public static net.minecraft.util.EnumParticleTypes EXPLOSION_LARGE;

public static net.minecraft.util.EnumParticleTypes EXPLOSION_HUGE;

public static net.minecraft.util.EnumParticleTypes FIREWORKS_SPARK;

public static net.minecraft.util.EnumParticleTypes WATER_BUBBLE;

public static net.minecraft.util.EnumParticleTypes WATER_SPLASH;

public static net.minecraft.util.EnumParticleTypes WATER_WAKE;

public static net.minecraft.util.EnumParticleTypes SUSPENDED;

public static net.minecraft.util.EnumParticleTypes SUSPENDED_DEPTH;

public static net.minecraft.util.EnumParticleTypes CRIT;

public static net.minecraft.util.EnumParticleTypes CRIT_MAGIC;

public static net.minecraft.util.EnumParticleTypes SMOKE_NORMAL;

public static net.minecraft.util.EnumParticleTypes SMOKE_LARGE;

public static net.minecraft.util.EnumParticleTypes SPELL;

public static net.minecraft.util.EnumParticleTypes SPELL_INSTANT;

public static net.minecraft.util.EnumParticleTypes SPELL_MOB;

public static net.minecraft.util.EnumParticleTypes SPELL_MOB_AMBIENT;

public static net.minecraft.util.EnumParticleTypes SPELL_WITCH;

public static net.minecraft.util.EnumParticleTypes DRIP_WATER;

public static net.minecraft.util.EnumParticleTypes DRIP_LAVA;

public static net.minecraft.util.EnumParticleTypes VILLAGER_ANGRY;

public static net.minecraft.util.EnumParticleTypes VILLAGER_HAPPY;

public static net.minecraft.util.EnumParticleTypes TOWN_AURA;

public static net.minecraft.util.EnumParticleTypes NOTE;

public static net.minecraft.util.EnumParticleTypes PORTAL;

public static net.minecraft.util.EnumParticleTypes ENCHANTMENT_TABLE;

public static net.minecraft.util.EnumParticleTypes FLAME;

public static net.minecraft.util.EnumParticleTypes LAVA;

public static net.minecraft.util.EnumParticleTypes FOOTSTEP;

public static net.minecraft.util.EnumParticleTypes CLOUD;

public static net.minecraft.util.EnumParticleTypes REDSTONE;

public static net.minecraft.util.EnumParticleTypes SNOWBALL;

public static net.minecraft.util.EnumParticleTypes SNOW_SHOVEL;

public static net.minecraft.util.EnumParticleTypes SLIME;

public static net.minecraft.util.EnumParticleTypes HEART;

public static net.minecraft.util.EnumParticleTypes BARRIER;

public static net.minecraft.util.EnumParticleTypes ITEM_CRACK;

public static net.minecraft.util.EnumParticleTypes BLOCK_CRACK;

public static net.minecraft.util.EnumParticleTypes BLOCK_DUST;

public static net.minecraft.util.EnumParticleTypes WATER_DROP;

public static net.minecraft.util.EnumParticleTypes ITEM_TAKE;

public static net.minecraft.util.EnumParticleTypes MOB_APPEARANCE;

private java.lang.String a;

private int b;

private boolean c;

private int d;

private static java.util.Map<java.lang.Integer, net.minecraft.util.EnumParticleTypes> e;

private static java.lang.String[] f;

private static net.minecraft.util.EnumParticleTypes[] g;

private static net.minecraft.entity.Entity[] h;

private static long i;

private static long[] j;

private static java.lang.Integer[] k;

private static java.util.Map l;

private EnumParticleTypes(java.lang.String p0, int p1, java.lang.String p2, int p3, boolean p4) {
this(p0, p1, p2, p3, p4, 0);
    return;
}


private EnumParticleTypes(java.lang.String p0, int p1, java.lang.String p2, int p3, boolean p4, int p5) {
super(p0, p1);
    this.a = p2;
    this.b = p3;
    this.c = p4;
    this.d = p5;
}


private static void initialize() {
i = ((long)(((moom._a)(moom._c.a(((long)(-5870627152084267932L)), ((long)(4357581801062589657L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(157943591770891L)))));
    long local11_life6 = (net.minecraft.util.EnumParticleTypes.i ^ 119815302892111L);
    net.minecraft.entity.Entity[] __sourceSpill1933_8 = new net.minecraft.entity.Entity[1];
    l = ((java.util.Map)(new java.util.HashMap(13)));
    net.minecraft.util.EnumParticleTypes.b(((net.minecraft.entity.Entity[])(__sourceSpill1933_8)));
    javax.crypto.Cipher local0_life11;
    javax.crypto.Cipher __sourceSpill1933_13 = (local0_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1933_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1933_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1933_16 = new byte[8];
    (__sourceSpill1933_16)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life17 = 1;
    while ((local1_life17 < 8)) {
        (__sourceSpill1933_16)[local1_life17] = ((byte) ((int) ((local11_life6 << (local1_life17 * 8)) >>> 56)));
        local1_life17 += 1;
    }
    byte[] __sourcePreallocation1933_18 = __sourceSpill1933_16;
    ((javax.crypto.Cipher)(__sourceSpill1933_13)).init(((int)(__sourceSpill1933_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1933_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1933_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life21 = new long[73];
    int local3_life22 = 0;
    java.lang.String local4_life23;
    int local5_life25 = ((java.lang.String)((local4_life23 = "îÌz»kÇé¼Öâà\177gº»\017èT\020È'^\006ýÍ[\005½g@Ø\rä-#åt;\016\002Äÿ\017\003\032Å2Óß>d\035¨ w#Àë¼@ýè\031\bòéW¯Ñ¤y´àÑûÓµP\030à;-ªã¦\027é-a[*VÑþu6ì\024 ë>¿áTºrvUÿ\027:!,úi¢\027\020w\\eÐ^î\"¿­½\ni U\r¶\bøë/'2}gßÑ)i¥\bó°ZEøý²oýÖ<b¿¸N,ßò¦CÉ¶BFãû\026l \177\n\006ý\036§0Ç7ù¬Qû)T%<®\020ÑÄ\033¥´à©ôO°æ\027\rGf.\n~2ï¾»\003ýë\001tÇøUëãßcm\tZ\007GñGÇùK¤-m\r\"ú½&P Ëëù\023óñùÚ±Öuj.ÂÎj¼áix\032Ë¶¤¯¹Å\ni¾;JY&v¼ºÿC1ö¶ù{u\003êÎ\013ì ªù\0334ôú:\\ýr°¹{:ï³ÊÖ2\fñ#4p3<Q+ÌôðÇÍ\030)ºf¦Ó`\034[í\034Ñø\013\177ÒÈ!Zjó÷\026òðV±Þp\004ÄÛ;:\020ZZ\037ùàu©^(çhÃÜwñûR~\026î_P.ËT[\020\r_ñ.CÓ\tw\r*$'×ÇK³4[\013¤ó.\021z²iÓ\177¥à*íâØQx1ÓxôßùlÚp£­\033y4»nf\032ÍÅÀ]ëA3KÛ_\"ó\005Ì©ÙÑTY§¹àÉÕÊ.W ñÓ\020èv?¸$ÑÃ¹ýbý¤\035|³ê¶x\t}ªx¨s"))).length();
    int local2_life26 = 0;
    do {
        java.lang.String __sourceSpill1933_27 = local4_life23;
        int __sourceSpill1933_28 = local2_life26;
        local2_life26 += 8;
        byte[] local7_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1933_27)).substring(((int)(__sourceSpill1933_28)), ((int)(local2_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1933_32 = local6_life21;
        int __sourceSpill1933_33 = local3_life22;
        local3_life22 += 1;
        long local8_life34 = (((((((((((long) (local7_life31)[0]) & 255L) << 56) | ((((long) (local7_life31)[1]) & 255L) << 48)) | ((((long) (local7_life31)[2]) & 255L) << 40)) | ((((long) (local7_life31)[3]) & 255L) << 32)) | ((((long) (local7_life31)[4]) & 255L) << 24)) | ((((long) (local7_life31)[5]) & 255L) << 16)) | ((((long) (local7_life31)[6]) & 255L) << 8)) | (((long) (local7_life31)[7]) & 255L));
        byte[] __sourceSpill1933_35 = new byte[8];
        (__sourceSpill1933_35)[0] = ((byte) ((int) (local8_life34 >>> 56)));
        (__sourceSpill1933_35)[1] = ((byte) ((int) (local8_life34 >>> 48)));
        (__sourceSpill1933_35)[2] = ((byte) ((int) (local8_life34 >>> 40)));
        (__sourceSpill1933_35)[3] = ((byte) ((int) (local8_life34 >>> 32)));
        (__sourceSpill1933_35)[4] = ((byte) ((int) (local8_life34 >>> 24)));
        (__sourceSpill1933_35)[5] = ((byte) ((int) (local8_life34 >>> 16)));
        (__sourceSpill1933_35)[6] = ((byte) ((int) (local8_life34 >>> 8)));
        (__sourceSpill1933_35)[7] = ((byte) ((int) local8_life34));
        javax.crypto.Cipher __sourceSpill1933_36 = local0_life11;
        byte[] local10_life38 = ((javax.crypto.Cipher)(__sourceSpill1933_36)).doFinal(((byte[])(__sourceSpill1933_35)));
        (__sourceSpill1933_32)[__sourceSpill1933_33] = (((((((((((long) (local10_life38)[0]) & 255L) << 56) | ((((long) (local10_life38)[1]) & 255L) << 48)) | ((((long) (local10_life38)[2]) & 255L) << 40)) | ((((long) (local10_life38)[3]) & 255L) << 32)) | ((((long) (local10_life38)[4]) & 255L) << 24)) | ((((long) (local10_life38)[5]) & 255L) << 16)) | ((((long) (local10_life38)[6]) & 255L) << 8)) | (((long) (local10_life38)[7]) & 255L));
    } while ((!(local2_life26 >= local5_life25)));
    local5_life25 = ((java.lang.String)((local4_life23 = "ÈÄÁám7³+ÜaB¤O;"))).length();
    local2_life26 = 0;
    do {
        java.lang.String __sourceSpill1933_40 = local4_life23;
        int __sourceSpill1933_41 = local2_life26;
        local2_life26 += 8;
        byte[] local7_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1933_40)).substring(((int)(__sourceSpill1933_41)), ((int)(local2_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1933_45 = local6_life21;
        int __sourceSpill1933_46 = local3_life22;
        local3_life22 += 1;
        long local8_life47 = (((((((((((long) (local7_life44)[0]) & 255L) << 56) | ((((long) (local7_life44)[1]) & 255L) << 48)) | ((((long) (local7_life44)[2]) & 255L) << 40)) | ((((long) (local7_life44)[3]) & 255L) << 32)) | ((((long) (local7_life44)[4]) & 255L) << 24)) | ((((long) (local7_life44)[5]) & 255L) << 16)) | ((((long) (local7_life44)[6]) & 255L) << 8)) | (((long) (local7_life44)[7]) & 255L));
        byte[] __sourceSpill1933_48 = new byte[8];
        (__sourceSpill1933_48)[0] = ((byte) ((int) (local8_life47 >>> 56)));
        (__sourceSpill1933_48)[1] = ((byte) ((int) (local8_life47 >>> 48)));
        (__sourceSpill1933_48)[2] = ((byte) ((int) (local8_life47 >>> 40)));
        (__sourceSpill1933_48)[3] = ((byte) ((int) (local8_life47 >>> 32)));
        (__sourceSpill1933_48)[4] = ((byte) ((int) (local8_life47 >>> 24)));
        (__sourceSpill1933_48)[5] = ((byte) ((int) (local8_life47 >>> 16)));
        (__sourceSpill1933_48)[6] = ((byte) ((int) (local8_life47 >>> 8)));
        (__sourceSpill1933_48)[7] = ((byte) ((int) local8_life47));
        javax.crypto.Cipher __sourceSpill1933_49 = local0_life11;
        byte[] local10_life51 = ((javax.crypto.Cipher)(__sourceSpill1933_49)).doFinal(((byte[])(__sourceSpill1933_48)));
        (__sourceSpill1933_45)[__sourceSpill1933_46] = (((((((((((long) (local10_life51)[0]) & 255L) << 56) | ((((long) (local10_life51)[1]) & 255L) << 48)) | ((((long) (local10_life51)[2]) & 255L) << 40)) | ((((long) (local10_life51)[3]) & 255L) << 32)) | ((((long) (local10_life51)[4]) & 255L) << 24)) | ((((long) (local10_life51)[5]) & 255L) << 16)) | ((((long) (local10_life51)[6]) & 255L) << 8)) | (((long) (local10_life51)[7]) & 255L));
    } while ((!(local2_life26 >= local5_life25)));
    j = ((long[])(local6_life21));
    k = ((java.lang.Integer[])(new java.lang.Integer[73]));
    EXPLOSION_NORMAL = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("EXPLOSION_NORMAL", 0, "explode", 0, true)));
    EXPLOSION_LARGE = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("EXPLOSION_LARGE", 1, "largeexplode", 1, true)));
    EXPLOSION_HUGE = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("EXPLOSION_HUGE", 2, "hugeexplosion", 2, true)));
    FIREWORKS_SPARK = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("FIREWORKS_SPARK", 3, "fireworksSpark", 3, false)));
    WATER_BUBBLE = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("WATER_BUBBLE", 4, "bubble", 4, false)));
    WATER_SPLASH = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("WATER_SPLASH", 5, "splash", 5, false)));
    WATER_WAKE = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("WATER_WAKE", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_60(25840, (8652450955699109046L ^ local11_life6)), "wake", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_61(22433, (5363308913935912952L ^ local11_life6)), false)));
    SUSPENDED = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("SUSPENDED", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_63(504, (4492691745634441617L ^ local11_life6)), "suspended", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_64(28709, (6773370106908452944L ^ local11_life6)), false)));
    SUSPENDED_DEPTH = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("SUSPENDED_DEPTH", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_66(18002, (8995874719472197136L ^ local11_life6)), "depthsuspend", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_67(3318, (5526874769615344794L ^ local11_life6)), false)));
    CRIT = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("CRIT", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_69(10200, (8369192606965563280L ^ local11_life6)), "crit", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_70(31747, (8397378561964385380L ^ local11_life6)), false)));
    CRIT_MAGIC = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("CRIT_MAGIC", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_72(27678, (649193325976695889L ^ local11_life6)), "magicCrit", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_73(932, (8433908942837963739L ^ local11_life6)), false)));
    SMOKE_NORMAL = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("SMOKE_NORMAL", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_75(3606, (2264537571953530471L ^ local11_life6)), "smoke", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_76(18749, (1641574727962431868L ^ local11_life6)), false)));
    SMOKE_LARGE = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("SMOKE_LARGE", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_78(32390, (8976358292975199933L ^ local11_life6)), "largesmoke", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_79(21165, (7142089499441367794L ^ local11_life6)), false)));
    SPELL = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("SPELL", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_81(18808, (342596190977790246L ^ local11_life6)), "spell", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_82(25161, (7875365776585275956L ^ local11_life6)), false)));
    SPELL_INSTANT = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("SPELL_INSTANT", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_84(31921, (3938916666025485556L ^ local11_life6)), "instantSpell", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_85(268, (8459993802470644038L ^ local11_life6)), false)));
    SPELL_MOB = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("SPELL_MOB", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_87(7184, (1947663918231012422L ^ local11_life6)), "mobSpell", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_88(1148, (7912224961996610593L ^ local11_life6)), false)));
    SPELL_MOB_AMBIENT = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("SPELL_MOB_AMBIENT", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_90(1736, (4681037611699887770L ^ local11_life6)), "mobSpellAmbient", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_91(23271, (6702624811102143198L ^ local11_life6)), false)));
    SPELL_WITCH = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("SPELL_WITCH", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_93(9206, (4440805047091362766L ^ local11_life6)), "witchMagic", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_94(5298, (1279530122703129797L ^ local11_life6)), false)));
    DRIP_WATER = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("DRIP_WATER", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_96(26333, (2781438364329950849L ^ local11_life6)), "dripWater", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_97(17345, (2159471637466454954L ^ local11_life6)), false)));
    DRIP_LAVA = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("DRIP_LAVA", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_99(3869, (1060479574035683143L ^ local11_life6)), "dripLava", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_100(31120, (2465542897052000748L ^ local11_life6)), false)));
    VILLAGER_ANGRY = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("VILLAGER_ANGRY", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_102(20491, (9065647682698086495L ^ local11_life6)), "angryVillager", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_103(20624, (5003648935642990800L ^ local11_life6)), false)));
    VILLAGER_HAPPY = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("VILLAGER_HAPPY", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_105(5141, (5779842679348612216L ^ local11_life6)), "happyVillager", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_106(16316, (445550806604572559L ^ local11_life6)), false)));
    TOWN_AURA = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("TOWN_AURA", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_108(12989, (4110354784421604046L ^ local11_life6)), "townaura", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_109(24444, (9138291248224339732L ^ local11_life6)), false)));
    NOTE = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("NOTE", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_111(21919, (1306371449438703093L ^ local11_life6)), "note", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_112(29267, (7540952896585706013L ^ local11_life6)), false)));
    PORTAL = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("PORTAL", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_114(30698, (3418951211959660455L ^ local11_life6)), "portal", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_115(11528, (2742583892678145373L ^ local11_life6)), false)));
    ENCHANTMENT_TABLE = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("ENCHANTMENT_TABLE", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_117(7659, (7879200869590713736L ^ local11_life6)), "enchantmenttable", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_118(14620, (8557222518913950055L ^ local11_life6)), false)));
    FLAME = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("FLAME", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_120(20598, (1190547893940717572L ^ local11_life6)), "flame", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_121(16882, (2159625844522359176L ^ local11_life6)), false)));
    LAVA = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("LAVA", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_123(25345, (4776777381068913469L ^ local11_life6)), "lava", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_124(20164, (8049423139502790295L ^ local11_life6)), false)));
    FOOTSTEP = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("FOOTSTEP", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_126(510, (4292966331835537830L ^ local11_life6)), "footstep", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_127(25401, (1205939408556997480L ^ local11_life6)), false)));
    CLOUD = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("CLOUD", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_129(14509, (6247342746465329356L ^ local11_life6)), "cloud", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_130(26302, (7955945618493095666L ^ local11_life6)), false)));
    REDSTONE = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("REDSTONE", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_132(2755, (367277648316551867L ^ local11_life6)), "reddust", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_133(24085, (6783987571365840503L ^ local11_life6)), false)));
    SNOWBALL = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("SNOWBALL", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_135(24699, (758648749128103941L ^ local11_life6)), "snowballpoof", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_136(17888, (8249509375677013391L ^ local11_life6)), false)));
    SNOW_SHOVEL = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("SNOW_SHOVEL", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_138(25147, (3348645614103083616L ^ local11_life6)), "snowshovel", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_139(14370, (7906905159486922869L ^ local11_life6)), false)));
    SLIME = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("SLIME", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_141(8194, (7222282036299298877L ^ local11_life6)), "slime", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_142(1421, (4065582328780086777L ^ local11_life6)), false)));
    HEART = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("HEART", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_144(8966, (4584811340782828387L ^ local11_life6)), "heart", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_145(6067, (7826022034718740419L ^ local11_life6)), false)));
    BARRIER = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("BARRIER", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_147(3502, (9216339642499585424L ^ local11_life6)), "barrier", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_148(3310, (4325281140802376846L ^ local11_life6)), false)));
    ITEM_CRACK = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("ITEM_CRACK", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_150(30640, (6667549170503921655L ^ local11_life6)), "iconcrack_", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_151(18028, (5088573331022814760L ^ local11_life6)), false, 2)));
    BLOCK_CRACK = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("BLOCK_CRACK", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_153(18424, (6810075790307139522L ^ local11_life6)), "blockcrack_", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_154(939, (2656730802080078802L ^ local11_life6)), false, 1)));
    BLOCK_DUST = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("BLOCK_DUST", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_156(17553, (2400371047742905575L ^ local11_life6)), "blockdust_", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_157(21197, (2234224201432566443L ^ local11_life6)), false, 1)));
    WATER_DROP = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("WATER_DROP", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_159(13465, (7100066626789567706L ^ local11_life6)), "droplet", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_160(17015, (8153259963725519379L ^ local11_life6)), false)));
    ITEM_TAKE = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("ITEM_TAKE", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_162(12469, (8136015166930643196L ^ local11_life6)), "take", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_163(30758, (2481652507589910646L ^ local11_life6)), false)));
    MOB_APPEARANCE = ((net.minecraft.util.EnumParticleTypes)(new net.minecraft.util.EnumParticleTypes("MOB_APPEARANCE", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_165(23451, (5912209740442436518L ^ local11_life6)), "mobappearance", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_166(21114, (394573677779880468L ^ local11_life6)), true)));
    g = ((net.minecraft.util.EnumParticleTypes[])(net.minecraft.util.EnumParticleTypes.a__Arraybw()));
    e = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    java.util.ArrayList local13_life173 = com.google.common.collect.Lists.newArrayList();
    net.minecraft.util.EnumParticleTypes[] local14_life175 = net.minecraft.util.EnumParticleTypes.values();
    int local15_life176 = (local14_life175).length;
    int local16_life177 = 0;
    while ((local16_life177 < local15_life176)) {
        net.minecraft.util.EnumParticleTypes local17_life178 = (local14_life175)[local16_life177];
        ((java.util.Map)(net.minecraft.util.EnumParticleTypes.e)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.util.EnumParticleTypes)(local17_life178)).a()))))), ((java.lang.Object)(local17_life178)));
        if ((!((java.lang.String)(((net.minecraft.util.EnumParticleTypes)(local17_life178)).a__String())).endsWith(((java.lang.String)("_"))))) {
        ((java.util.List)(local13_life173)).add(((java.lang.Object)(((net.minecraft.util.EnumParticleTypes)(local17_life178)).a__String())));
    }
        local16_life177 += 1;
    }
    f = ((java.lang.String[])(((java.lang.String[])(((java.util.List)(local13_life173)).toArray(((java.lang.Object[])(new java.lang.String[0])))))));
}


public static net.minecraft.util.EnumParticleTypes[] values() {
return ((net.minecraft.util.EnumParticleTypes[])(((net.minecraft.util.EnumParticleTypes[])(net.minecraft.util.EnumParticleTypes.g)).clone()));
}


public static net.minecraft.util.EnumParticleTypes valueOf(java.lang.String p0) {
return ((net.minecraft.util.EnumParticleTypes)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.util.EnumParticleTypes.class)), ((java.lang.String)(p0)))));
}


public boolean b__Boolean() {
int forwardValue5744_12_0;
    int forwardValue5744_14_0;
    int spill5744_0;
    long life1_3;
    int life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (net.minecraft.util.EnumParticleTypes.i ^ 123443537787656L);
    life3_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill5744_0 = this.d;
    if (!((life3_5 != 0))) {
        forwardValue5744_12_0 = spill5744_0;
        break forward_join_12;
    }
    if (!((spill5744_0 > 0))) {
        break forward_join_13;
    }
    forwardValue5744_12_0 = 1;
    }
    forwardValue5744_14_0 = forwardValue5744_12_0;
    break forward_join_14;
    }
    forwardValue5744_14_0 = 0;
    }
    return ((forwardValue5744_14_0) != 0);
}


public static void b(net.minecraft.entity.Entity[] p0) {
h = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public static net.minecraft.entity.Entity[] b__Arrayr3() {
return net.minecraft.util.EnumParticleTypes.h;
}


public int b() {
return this.d;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 5822;
      if (k[var3] == null) {
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
         long var5 = j[var3];
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
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/bw", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static java.lang.String[] a__ArrayString() {
return net.minecraft.util.EnumParticleTypes.f;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.util.EnumParticleTypes.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12370_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/bw"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a__Boolean() {
return ((((this.c) ? 1 : 0)) != 0);
}


public static net.minecraft.util.EnumParticleTypes a(int p0) {
return ((net.minecraft.util.EnumParticleTypes)(((java.util.Map)(net.minecraft.util.EnumParticleTypes.e)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0))))))));
}


private static net.minecraft.util.EnumParticleTypes[] a__Arraybw() {
long local0_life1 = (net.minecraft.util.EnumParticleTypes.i ^ 21640328697482L);
    net.minecraft.util.EnumParticleTypes[] __sourceSharedArray1161_4 = new net.minecraft.util.EnumParticleTypes[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_2(27919, (3046732317589973377L ^ local0_life1))];
    __sourceSharedArray1161_4[0] = net.minecraft.util.EnumParticleTypes.EXPLOSION_NORMAL;
    __sourceSharedArray1161_4[1] = net.minecraft.util.EnumParticleTypes.EXPLOSION_LARGE;
    __sourceSharedArray1161_4[2] = net.minecraft.util.EnumParticleTypes.EXPLOSION_HUGE;
    __sourceSharedArray1161_4[3] = net.minecraft.util.EnumParticleTypes.FIREWORKS_SPARK;
    __sourceSharedArray1161_4[4] = net.minecraft.util.EnumParticleTypes.WATER_BUBBLE;
    __sourceSharedArray1161_4[5] = net.minecraft.util.EnumParticleTypes.WATER_SPLASH;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_10(22433, (5363279579905364797L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.WATER_WAKE;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_12(28709, (6773316462289138837L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.SUSPENDED;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_14(3318, (5526787573784397919L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.SUSPENDED_DEPTH;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_16(31747, (8397247488630044833L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.CRIT;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_18(932, (8433900876276647710L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.CRIT_MAGIC;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_20(18749, (1641690512169504185L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.SMOKE_NORMAL;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_22(21165, (7142062329017636407L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.SMOKE_LARGE;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_24(25161, (7875269784528070385L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.SPELL;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_26(268, (8459889701532157315L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.SPELL_INSTANT;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_28(1148, (7912158209136312548L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.SPELL_MOB;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_30(23271, (6702762069206048283L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.SPELL_MOB_AMBIENT;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_32(5298, (1279500067134918656L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.SPELL_WITCH;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_34(17345, (2159338949207885679L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.DRIP_WATER;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_36(31120, (2465476040996044073L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.DRIP_LAVA;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_38(20624, (5003771196643775509L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.VILLAGER_ANGRY;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_40(16316, (445457580522109770L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.VILLAGER_HAPPY;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_42(24444, (9138300825539615697L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.TOWN_AURA;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_44(29267, (7540899217472632536L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.NOTE;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_46(11528, (2742660094583007640L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.PORTAL;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_48(14620, (8557160198326549922L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.ENCHANTMENT_TABLE;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_50(16882, (2159747692132664653L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.FLAME;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_52(20164, (8049398065944332882L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.LAVA;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_54(25401, (1205879304305813421L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.FOOTSTEP;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_56(26302, (7955975107259703863L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.CLOUD;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_58(24085, (6784091845042805426L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.REDSTONE;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_60(17888, (8249567882198909258L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.SNOWBALL;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_62(14370, (7906780597306031280L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.SNOW_SHOVEL;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_64(1421, (4065526433613693244L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.SLIME;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_66(6067, (7826098116230238982L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.HEART;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_68(3310, (4325147867371227211L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.BARRIER;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_70(18028, (5088576294089622253L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.ITEM_CRACK;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_72(939, (2656813445363123991L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.BLOCK_CRACK;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_74(21197, (2234331068330382958L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.BLOCK_DUST;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_76(17015, (8153289847647078102L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.WATER_DROP;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_78(30758, (2481736937578249395L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.ITEM_TAKE;
    __sourceSharedArray1161_4[__sourceIntrinsic_19bad902add3_originalDynamicSite1161_80(21114, (394542144590812881L ^ local0_life1))] = net.minecraft.util.EnumParticleTypes.MOB_APPEARANCE;
    return __sourceSharedArray1161_4;
}


public int a() {
return this.b;
}


public java.lang.String a__String() {
return this.a;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_87(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_88(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_93(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_96(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_97(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_99(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_100(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_102(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_106(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_108(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_112(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_115(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_117(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_118(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_120(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_121(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_123(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_124(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_126(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_127(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_129(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_130(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_132(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_133(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_135(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_136(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_138(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_139(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_141(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_142(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_144(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_145(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_147(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_148(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_150(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_151(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_153(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_154(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_156(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_157(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_159(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_160(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_162(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_163(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_165(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1933_166(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12370_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19bad902add3_originalDynamicSite1161_80(int a0, long a1) throws E;
}
