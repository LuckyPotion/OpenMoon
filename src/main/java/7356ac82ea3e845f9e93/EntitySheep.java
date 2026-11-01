package net.minecraft.entity.passive;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntitySheep extends moom.sK {

private moom.wx cd;

private static java.util.Map<net.minecraft.item.EnumDyeColor, float[]> ce;

private int cf;

private moom.up cg;

private static long jb;

private static long[] kb;

private static java.lang.Integer[] Ab;

private static java.util.Map Bb;

public EntitySheep(net.minecraft.world.World p0) { super((net.minecraft.world.World)null); }

private static void __sourceConstructorBody_99597f75c0f7cf5e(net.minecraft.entity.passive.EntitySheep receiver, net.minecraft.world.World p0) throws Throwable {
long local2 = (net.minecraft.entity.passive.EntitySheep.jb ^ 73879801207411L);
    net.minecraft.entity.passive.EntitySheep.__sourceConstructorInit_99597f75c0f7cf5e_0(((net.minecraft.entity.passive.EntitySheep)(receiver)), ((net.minecraft.world.World)(p0)));
    ((net.minecraft.entity.passive.EntitySheep)(receiver)).cd = ((moom.wx)(new moom.wx(new moom.v_(receiver), 2, 1)));
    ((net.minecraft.entity.passive.EntitySheep)(receiver)).cg = ((moom.up)(new moom.up(receiver)));
    ((net.minecraft.entity.passive.EntitySheep)(receiver)).a__Void(((float)(0x1.ccccccp-1f)), ((float)(0x1.4cccccp0f)));
    ((moom.AW)(((moom.AW)(__sourceExactCall_2d16a4174cdb47(((net.minecraft.entity.passive.EntitySheep)(receiver))))))).a(((boolean)(true)));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntitySheep)(receiver)).bJ)).a(((int)(0)), ((moom.uc)(new moom.uQ(receiver))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntitySheep)(receiver)).bJ)).a(((int)(1)), ((moom.uc)(new moom.uJ(receiver, 0x1.4p0d))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntitySheep)(receiver)).bJ)).a(((int)(2)), ((moom.uc)(new moom.uz(receiver, 0x1.0p0d))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntitySheep)(receiver)).bJ)).a(((int)(3)), ((moom.uc)(new moom.u3(receiver, 0x1.199999999999ap0d, net.minecraft.init.Items.O, false))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntitySheep)(receiver)).bJ)).a(((int)(4)), ((moom.uc)(new moom.uv(receiver, 0x1.199999999999ap0d))));
    __sourceExactCall_ae34dbea601cc3(((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntitySheep)(receiver)).bJ)), ((int)(5)), ((moom.uc)(((net.minecraft.entity.passive.EntitySheep)(receiver)).cg)));
    __sourceExactCall_ae34dbea601cc3(((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntitySheep)(receiver)).bJ)), ((int)(__sourceIntrinsic_99597f75c0f7cf5e_originalDynamicSite3392_23(22104, (7831262068423918392L ^ local2)))), ((moom.uc)(new moom.u6(receiver, 0x1.0p0d))));
    __sourceExactCall_ae34dbea601cc3(((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntitySheep)(receiver)).bJ)), ((int)(__sourceIntrinsic_99597f75c0f7cf5e_originalDynamicSite3392_26(21288, (1125546639749613148L ^ local2)))), ((moom.uc)(new moom.u8(receiver, net.minecraft.entity.player.EntityPlayer.class, 0x1.8p2f))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntitySheep)(receiver)).bJ)).a(((int)(__sourceIntrinsic_99597f75c0f7cf5e_originalDynamicSite3392_30(20907, (8273140795887125724L ^ local2)))), ((moom.uc)(new moom.uy(receiver))));
    ((moom.wx)(((net.minecraft.entity.passive.EntitySheep)(receiver)).cd)).a__Void(((int)(0)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, 0))));
    ((moom.wx)(((net.minecraft.entity.passive.EntitySheep)(receiver)).cd)).a__Void(((int)(1)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, 0))));
    return;
}


static {
jb = ((long)(((moom._a)(moom._c.a(((long)(1788358001489465710L)), ((long)(-1811654369684432252L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(147881963324009L)))));
    Bb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.entity.passive.EntitySheep.jb ^ 3415290387300L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1884_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1884_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1884_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1884_14 = new byte[8];
    (__sourceSpill1884_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1884_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1884_16 = __sourceSpill1884_14;
    ((javax.crypto.Cipher)(__sourceSpill1884_11)).init(((int)(__sourceSpill1884_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1884_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1884_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[19];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ô70Uèy=¡£Ù\024®ú^®\n\bJÆ÷JÑ~U/ë]v¡^Þ¸ÝÃ¹3âç®\034j.ÍØ\017j\031ó+Ó\007\002V\rHöÍ\033=oU²§_ëÑTG<Þ7tÎ]æ\"\037½~ùtY\033¡£×Æ`Üs@Ò9Í\034g\røÏ\\=è¢.ñ0w-¥fnñ¸\036¢UÏj"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1884_25 = local6_life21;
        int __sourceSpill1884_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1884_25)).substring(((int)(__sourceSpill1884_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1884_30 = local8_life19;
        int __sourceSpill1884_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1884_33 = new byte[8];
        (__sourceSpill1884_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1884_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1884_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1884_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1884_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1884_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1884_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1884_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1884_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1884_34)).doFinal(((byte[])(__sourceSpill1884_33)));
        (__sourceSpill1884_30)[__sourceSpill1884_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "äcúªkñË§µÏ\037Ñµl"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1884_38 = local6_life21;
        int __sourceSpill1884_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1884_38)).substring(((int)(__sourceSpill1884_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1884_43 = local8_life19;
        int __sourceSpill1884_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1884_46 = new byte[8];
        (__sourceSpill1884_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1884_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1884_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1884_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1884_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1884_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1884_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1884_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1884_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1884_47)).doFinal(((byte[])(__sourceSpill1884_46)));
        (__sourceSpill1884_43)[__sourceSpill1884_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    kb = ((long[])(local8_life19));
    Ab = ((java.lang.Integer[])(new java.lang.Integer[19]));
    ce = ((java.util.Map)(com.google.common.collect.Maps.newEnumMap(((java.lang.Class)(net.minecraft.item.EnumDyeColor.class)))));
    java.util.Map __sourceSpill1884_57 = net.minecraft.entity.passive.EntitySheep.ce;
    net.minecraft.item.EnumDyeColor __sourceSpill1884_58 = net.minecraft.item.EnumDyeColor.WHITE;
    float[] __sourceSpill1884_59 = new float[3];
    (__sourceSpill1884_59)[0] = 0x1.0p0f;
    (__sourceSpill1884_59)[1] = 0x1.0p0f;
    (__sourceSpill1884_59)[2] = 0x1.0p0f;
    ((java.util.Map)(__sourceSpill1884_57)).put(((java.lang.Object)(__sourceSpill1884_58)), ((java.lang.Object)(__sourceSpill1884_59)));
    java.util.Map __sourceSpill1884_63 = net.minecraft.entity.passive.EntitySheep.ce;
    net.minecraft.item.EnumDyeColor __sourceSpill1884_64 = net.minecraft.item.EnumDyeColor.ORANGE;
    float[] __sourceSpill1884_65 = new float[3];
    (__sourceSpill1884_65)[0] = 0x1.b33334p-1f;
    (__sourceSpill1884_65)[1] = 0x1.0p-1f;
    (__sourceSpill1884_65)[2] = 0x1.99999ap-3f;
    ((java.util.Map)(__sourceSpill1884_63)).put(((java.lang.Object)(__sourceSpill1884_64)), ((java.lang.Object)(__sourceSpill1884_65)));
    java.util.Map __sourceSpill1884_69 = net.minecraft.entity.passive.EntitySheep.ce;
    net.minecraft.item.EnumDyeColor __sourceSpill1884_70 = net.minecraft.item.EnumDyeColor.MAGENTA;
    float[] __sourceSpill1884_71 = new float[3];
    (__sourceSpill1884_71)[0] = 0x1.666666p-1f;
    (__sourceSpill1884_71)[1] = 0x1.333334p-2f;
    (__sourceSpill1884_71)[2] = 0x1.b33334p-1f;
    ((java.util.Map)(__sourceSpill1884_69)).put(((java.lang.Object)(__sourceSpill1884_70)), ((java.lang.Object)(__sourceSpill1884_71)));
    java.util.Map __sourceSpill1884_75 = net.minecraft.entity.passive.EntitySheep.ce;
    net.minecraft.item.EnumDyeColor __sourceSpill1884_76 = net.minecraft.item.EnumDyeColor.LIGHT_BLUE;
    float[] __sourceSpill1884_77 = new float[3];
    (__sourceSpill1884_77)[0] = 0x1.99999ap-2f;
    (__sourceSpill1884_77)[1] = 0x1.333334p-1f;
    (__sourceSpill1884_77)[2] = 0x1.b33334p-1f;
    ((java.util.Map)(__sourceSpill1884_75)).put(((java.lang.Object)(__sourceSpill1884_76)), ((java.lang.Object)(__sourceSpill1884_77)));
    java.util.Map __sourceSpill1884_81 = net.minecraft.entity.passive.EntitySheep.ce;
    net.minecraft.item.EnumDyeColor __sourceSpill1884_82 = net.minecraft.item.EnumDyeColor.YELLOW;
    float[] __sourceSpill1884_83 = new float[3];
    (__sourceSpill1884_83)[0] = 0x1.ccccccp-1f;
    (__sourceSpill1884_83)[1] = 0x1.ccccccp-1f;
    (__sourceSpill1884_83)[2] = 0x1.99999ap-3f;
    ((java.util.Map)(__sourceSpill1884_81)).put(((java.lang.Object)(__sourceSpill1884_82)), ((java.lang.Object)(__sourceSpill1884_83)));
    java.util.Map __sourceSpill1884_87 = net.minecraft.entity.passive.EntitySheep.ce;
    net.minecraft.item.EnumDyeColor __sourceSpill1884_88 = net.minecraft.item.EnumDyeColor.LIME;
    float[] __sourceSpill1884_89 = new float[3];
    (__sourceSpill1884_89)[0] = 0x1.0p-1f;
    (__sourceSpill1884_89)[1] = 0x1.99999ap-1f;
    (__sourceSpill1884_89)[2] = 0x1.99999ap-4f;
    ((java.util.Map)(__sourceSpill1884_87)).put(((java.lang.Object)(__sourceSpill1884_88)), ((java.lang.Object)(__sourceSpill1884_89)));
    java.util.Map __sourceSpill1884_93 = net.minecraft.entity.passive.EntitySheep.ce;
    net.minecraft.item.EnumDyeColor __sourceSpill1884_94 = net.minecraft.item.EnumDyeColor.PINK;
    float[] __sourceSpill1884_95 = new float[3];
    (__sourceSpill1884_95)[0] = 0x1.e66666p-1f;
    (__sourceSpill1884_95)[1] = 0x1.0p-1f;
    (__sourceSpill1884_95)[2] = 0x1.4cccccp-1f;
    ((java.util.Map)(__sourceSpill1884_93)).put(((java.lang.Object)(__sourceSpill1884_94)), ((java.lang.Object)(__sourceSpill1884_95)));
    java.util.Map __sourceSpill1884_99 = net.minecraft.entity.passive.EntitySheep.ce;
    net.minecraft.item.EnumDyeColor __sourceSpill1884_100 = net.minecraft.item.EnumDyeColor.GRAY;
    float[] __sourceSpill1884_101 = new float[3];
    (__sourceSpill1884_101)[0] = 0x1.333334p-2f;
    (__sourceSpill1884_101)[1] = 0x1.333334p-2f;
    (__sourceSpill1884_101)[2] = 0x1.333334p-2f;
    ((java.util.Map)(__sourceSpill1884_99)).put(((java.lang.Object)(__sourceSpill1884_100)), ((java.lang.Object)(__sourceSpill1884_101)));
    java.util.Map __sourceSpill1884_105 = net.minecraft.entity.passive.EntitySheep.ce;
    net.minecraft.item.EnumDyeColor __sourceSpill1884_106 = net.minecraft.item.EnumDyeColor.SILVER;
    float[] __sourceSpill1884_107 = new float[3];
    (__sourceSpill1884_107)[0] = 0x1.333334p-1f;
    (__sourceSpill1884_107)[1] = 0x1.333334p-1f;
    (__sourceSpill1884_107)[2] = 0x1.333334p-1f;
    ((java.util.Map)(__sourceSpill1884_105)).put(((java.lang.Object)(__sourceSpill1884_106)), ((java.lang.Object)(__sourceSpill1884_107)));
    java.util.Map __sourceSpill1884_111 = net.minecraft.entity.passive.EntitySheep.ce;
    net.minecraft.item.EnumDyeColor __sourceSpill1884_112 = net.minecraft.item.EnumDyeColor.CYAN;
    float[] __sourceSpill1884_113 = new float[3];
    (__sourceSpill1884_113)[0] = 0x1.333334p-2f;
    (__sourceSpill1884_113)[1] = 0x1.0p-1f;
    (__sourceSpill1884_113)[2] = 0x1.333334p-1f;
    ((java.util.Map)(__sourceSpill1884_111)).put(((java.lang.Object)(__sourceSpill1884_112)), ((java.lang.Object)(__sourceSpill1884_113)));
    java.util.Map __sourceSpill1884_117 = net.minecraft.entity.passive.EntitySheep.ce;
    net.minecraft.item.EnumDyeColor __sourceSpill1884_118 = net.minecraft.item.EnumDyeColor.PURPLE;
    float[] __sourceSpill1884_119 = new float[3];
    (__sourceSpill1884_119)[0] = 0x1.0p-1f;
    (__sourceSpill1884_119)[1] = 0x1.0p-2f;
    (__sourceSpill1884_119)[2] = 0x1.666666p-1f;
    ((java.util.Map)(__sourceSpill1884_117)).put(((java.lang.Object)(__sourceSpill1884_118)), ((java.lang.Object)(__sourceSpill1884_119)));
    java.util.Map __sourceSpill1884_123 = net.minecraft.entity.passive.EntitySheep.ce;
    net.minecraft.item.EnumDyeColor __sourceSpill1884_124 = net.minecraft.item.EnumDyeColor.BLUE;
    float[] __sourceSpill1884_125 = new float[3];
    (__sourceSpill1884_125)[0] = 0x1.99999ap-3f;
    (__sourceSpill1884_125)[1] = 0x1.333334p-2f;
    (__sourceSpill1884_125)[2] = 0x1.666666p-1f;
    ((java.util.Map)(__sourceSpill1884_123)).put(((java.lang.Object)(__sourceSpill1884_124)), ((java.lang.Object)(__sourceSpill1884_125)));
    java.util.Map __sourceSpill1884_129 = net.minecraft.entity.passive.EntitySheep.ce;
    net.minecraft.item.EnumDyeColor __sourceSpill1884_130 = net.minecraft.item.EnumDyeColor.BROWN;
    float[] __sourceSpill1884_131 = new float[3];
    (__sourceSpill1884_131)[0] = 0x1.99999ap-2f;
    (__sourceSpill1884_131)[1] = 0x1.333334p-2f;
    (__sourceSpill1884_131)[2] = 0x1.99999ap-3f;
    ((java.util.Map)(__sourceSpill1884_129)).put(((java.lang.Object)(__sourceSpill1884_130)), ((java.lang.Object)(__sourceSpill1884_131)));
    java.util.Map __sourceSpill1884_135 = net.minecraft.entity.passive.EntitySheep.ce;
    net.minecraft.item.EnumDyeColor __sourceSpill1884_136 = net.minecraft.item.EnumDyeColor.GREEN;
    float[] __sourceSpill1884_137 = new float[3];
    (__sourceSpill1884_137)[0] = 0x1.99999ap-2f;
    (__sourceSpill1884_137)[1] = 0x1.0p-1f;
    (__sourceSpill1884_137)[2] = 0x1.99999ap-3f;
    ((java.util.Map)(__sourceSpill1884_135)).put(((java.lang.Object)(__sourceSpill1884_136)), ((java.lang.Object)(__sourceSpill1884_137)));
    java.util.Map __sourceSpill1884_141 = net.minecraft.entity.passive.EntitySheep.ce;
    net.minecraft.item.EnumDyeColor __sourceSpill1884_142 = net.minecraft.item.EnumDyeColor.RED;
    float[] __sourceSpill1884_143 = new float[3];
    (__sourceSpill1884_143)[0] = 0x1.333334p-1f;
    (__sourceSpill1884_143)[1] = 0x1.99999ap-3f;
    (__sourceSpill1884_143)[2] = 0x1.99999ap-3f;
    ((java.util.Map)(__sourceSpill1884_141)).put(((java.lang.Object)(__sourceSpill1884_142)), ((java.lang.Object)(__sourceSpill1884_143)));
    java.util.Map __sourceSpill1884_147 = net.minecraft.entity.passive.EntitySheep.ce;
    net.minecraft.item.EnumDyeColor __sourceSpill1884_148 = net.minecraft.item.EnumDyeColor.BLACK;
    float[] __sourceSpill1884_149 = new float[3];
    (__sourceSpill1884_149)[0] = 0x1.99999ap-4f;
    (__sourceSpill1884_149)[1] = 0x1.99999ap-4f;
    (__sourceSpill1884_149)[2] = 0x1.99999ap-4f;
    ((java.util.Map)(__sourceSpill1884_147)).put(((java.lang.Object)(__sourceSpill1884_148)), ((java.lang.Object)(__sourceSpill1884_149)));
}

private static native <E extends Throwable> void __sourceConstructorInit_99597f75c0f7cf5e_0(net.minecraft.entity.passive.EntitySheep a0, net.minecraft.world.World a1) throws E;

protected java.lang.String i__String() {
return "mob.sheep.say";
}


protected void b(boolean p0, int p1) {
int lexicalValue1606_37_0;
    net.minecraft.entity.passive.EntitySheep lexicalValue1606_56_0;
    boolean spill1606_0;
    net.minecraft.entity.passive.EntitySheep spill1606_1;
    long life3_3;
    int life5_5;
    int life6_43;
    int life7_45;
    lexical_join_63: {
    lexical_join_37: {
    lexical_join_24: {
    life3_3 = (net.minecraft.entity.passive.EntitySheep.jb ^ 39511486194940L);
    life5_5 = moom.vR.b();
    spill1606_0 = ((net.minecraft.entity.passive.EntitySheep)(this)).ae();
    if (!((life5_5 != 0))) {
        lexicalValue1606_37_0 = ((spill1606_0) ? 1 : 0);
        break lexical_join_37;
    }
    if (!((!spill1606_0))) {
        break lexical_join_24;
    }
    ((net.minecraft.entity.passive.EntitySheep)(this)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(__sourceExactCall_42e37b9acc15b0(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L))), 1, ((net.minecraft.item.EnumDyeColor)(((net.minecraft.entity.passive.EntitySheep)(this)).a__sourceReturn_d841ada59b())).a()))), ((float)(0x0.0p0f)));
    }
    lexicalValue1606_37_0 = ((((java.util.Random)(this.ah)).nextInt(((int)(2))) + 1) + ((java.util.Random)(this.ah)).nextInt(((int)((1 + p1)))));
    }
    life6_43 = lexicalValue1606_37_0;
    life7_45 = 0;
    lexical_cycle_40: while (true) {
    lexical_join_60: {
    lexical_join_56: {
    lexical_join_55: {
    if (!((life7_45 < life6_43))) {
        break lexical_join_63;
    }
    spill1606_1 = this;
    if (!((life5_5 != 0))) {
        lexicalValue1606_56_0 = spill1606_1;
        break lexical_join_56;
    }
    if (!(((net.minecraft.entity.passive.EntitySheep)(spill1606_1)).r__Boolean())) {
        break lexical_join_55;
    }
    ((net.minecraft.entity.passive.EntitySheep)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bc)), ((int)(1)));
    if (!((life5_5 == 0))) {
        break lexical_join_60;
    }
    }
    lexicalValue1606_56_0 = this;
    }
    ((net.minecraft.entity.passive.EntitySheep)(lexicalValue1606_56_0)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bb)), ((int)(1)));
    }
    life7_45 += 1;
    if (!((life5_5 == 0))) { continue lexical_cycle_40; }
    break lexical_cycle_40;
    }
    }
    return;
}


public float e__Float() {
return (0x1.e66666p-1f * this.H);
}


public boolean ae() {
int forwardValue5328_24_0;
    int forwardValue5328_26_0;
    int spill5328_0;
    long life1_3;
    int life3_5;
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    life1_3 = (net.minecraft.entity.passive.EntitySheep.jb ^ 86086373725807L);
    life3_5 = moom.vR.b();
    spill5328_0 = (((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a627c59d8423_invokedynamic5328_3(6849, (7449367984197436325L ^ life1_3))))) & __sourceIntrinsic_a627c59d8423_invokedynamic5328_5(6849, (7449367984197436325L ^ life1_3)));
    if (!((life3_5 != 0))) {
        forwardValue5328_24_0 = spill5328_0;
        break forward_join_24;
    }
    if (!((spill5328_0 != 0))) {
        break forward_join_25;
    }
    forwardValue5328_24_0 = 1;
    }
    forwardValue5328_26_0 = forwardValue5328_24_0;
    break forward_join_26;
    }
    forwardValue5328_26_0 = 0;
    }
    return ((forwardValue5328_26_0) != 0);
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
super.c(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.entity.passive.EntitySheep)(this)).n(((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("Sheared"))))));
    ((net.minecraft.entity.passive.EntitySheep)(this)).a(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.b(((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__sourceReturn_d4c7a9581c(((java.lang.String)("Color")))))))));
    return;
}


public float c__sourceReturn_f6c4892e39(float p0) {
int forwardValue5330_15_0;
    int forwardValue5330_34_0;
    int forwardValue5330_34_1;
    int forwardValue5330_52_0;
    int forwardValue5330_52_1;
    float forwardValue5330_59_0;
    int spill5330_0;
    int spill5330_1;
    int spill5330_2;
    int spill5330_3;
    long life2_3;
    int life4_5;
    forward_join_59: {
    forward_join_52: {
    forward_join_45: {
    forward_join_34: {
    forward_join_31: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (net.minecraft.entity.passive.EntitySheep.jb ^ 95798505035387L);
    life4_5 = moom.vR.b();
    spill5330_0 = this.cf;
    if (!((life4_5 != 0))) {
        forwardValue5330_15_0 = spill5330_0;
        break forward_join_15;
    }
    if (!((spill5330_0 <= 0))) {
        break forward_join_13;
    }
    forwardValue5330_59_0 = 0x0.0p0f;
    break forward_join_59;
    }
    forwardValue5330_15_0 = this.cf;
    }
    spill5330_1 = 4;
    if (!((life4_5 != 0))) {
        forwardValue5330_34_0 = forwardValue5330_15_0;
        forwardValue5330_34_1 = spill5330_1;
        break forward_join_34;
    }
    if (!((forwardValue5330_15_0 >= spill5330_1))) {
        break forward_join_31;
    }
    spill5330_2 = this.cf;
    spill5330_3 = __sourceIntrinsic_3c64789755d1_invokedynamic5330_5(15378, (4498767804775376251L ^ life2_3));
    if (!((life4_5 != 0))) {
        forwardValue5330_34_0 = spill5330_2;
        forwardValue5330_34_1 = spill5330_3;
        break forward_join_34;
    }
    if (!((spill5330_2 <= spill5330_3))) {
        break forward_join_31;
    }
    forwardValue5330_59_0 = 0x1.0p0f;
    break forward_join_59;
    }
    forwardValue5330_34_0 = this.cf;
    forwardValue5330_34_1 = 4;
    }
    if (!((life4_5 != 0))) {
        forwardValue5330_52_0 = forwardValue5330_34_0;
        forwardValue5330_52_1 = forwardValue5330_34_1;
        break forward_join_52;
    }
    if (!((forwardValue5330_34_0 < forwardValue5330_34_1))) {
        break forward_join_45;
    }
    forwardValue5330_59_0 = ((((float) this.cf) - p0) / 0x1.0p2f);
    break forward_join_59;
    }
    forwardValue5330_52_0 = this.cf;
    forwardValue5330_52_1 = __sourceIntrinsic_3c64789755d1_invokedynamic5330_9(2691, (6058422926925566965L ^ life2_3));
    }
    forwardValue5330_59_0 = ((-(((float) (forwardValue5330_52_0 - forwardValue5330_52_1)) - p0)) / 0x1.0p2f);
    }
    return forwardValue5330_59_0;
}


protected java.lang.String c__String() {
return "mob.sheep.say";
}


public void n(boolean p0) {
long life2_3;
    int life5_13;
    int life4_14;
    forward_join_55: {
    forward_join_38: {
    forward_join_36: {
    life2_3 = (net.minecraft.entity.passive.EntitySheep.jb ^ 7769023679260L);
    int spill5984_0 = moom.vR.c();
    life5_13 = ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_1b79f0ed2644_invokedynamic5984_3(6849, (7449290155931590358L ^ life2_3)))));
    life4_14 = spill5984_0;
    if (!((life4_14 == 0))) { break forward_join_36; }
    if (!(p0)) { break forward_join_38; }
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_1b79f0ed2644_invokedynamic5984_6(6849, (7449290155931590358L ^ life2_3)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) (life5_13 | __sourceIntrinsic_1b79f0ed2644_invokedynamic5984_7(6849, (7449290155931590358L ^ life2_3))))))))));
    }
    if (!((life4_14 != 0))) { break forward_join_55; }
    }
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_1b79f0ed2644_invokedynamic5984_11(6849, (7449290155931590358L ^ life2_3)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) (life5_13 & __sourceIntrinsic_1b79f0ed2644_invokedynamic5984_12(17982, (305473542294176291L ^ life2_3))))))))));
    }
    return;
}


protected java.lang.String h__String() {
return "mob.sheep.say";
}


private static java.lang.invoke.CallSite f(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_ec881c4a524b_methodHandleLiteral11662_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/sR"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int f(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.entity.passive.EntitySheep.f(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int f(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 3432;
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
            throw new RuntimeException("moom/sR", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         Ab[var3] = var15;
      }

      return Ab[var3];
}


public float d__sourceReturn_f6c4892e39(float p0) {
int forwardValue5331_45_0;
    net.minecraft.entity.passive.EntitySheep forwardValue5331_49_0;
    float forwardValue5331_52_0;
    int spill5331_0;
    int spill5331_1;
    net.minecraft.entity.passive.EntitySheep spill5331_2;
    long life2_3;
    int life4_5;
    float life5_40;
    forward_join_52: {
    forward_join_49: {
    forward_join_48: {
    forward_join_45: {
    forward_join_41: {
    life2_3 = (net.minecraft.entity.passive.EntitySheep.jb ^ 107351340917533L);
    life4_5 = moom.vR.c();
    spill5331_0 = this.cf;
    if (!((life4_5 == 0))) {
        forwardValue5331_45_0 = spill5331_0;
        break forward_join_45;
    }
    if (!((spill5331_0 > 4))) {
        break forward_join_41;
    }
    spill5331_1 = this.cf;
    if (!((life4_5 == 0))) {
        forwardValue5331_45_0 = spill5331_1;
        break forward_join_45;
    }
    if (!((spill5331_1 <= __sourceIntrinsic_6e61104d7973_invokedynamic5331_4(27140, (8036673476144727580L ^ life2_3))))) {
        break forward_join_41;
    }
    life5_40 = ((((float) (this.cf - 4)) - p0) / 0x1.0p5f);
    return (0x1.41b2f8p-1f + (0x1.c260f6p-3f * moom.Dr.a(((float)((life5_40 * 0x1.cb3334p4f))))));
    }
    spill5331_2 = this;
    if (!((life4_5 == 0))) {
        forwardValue5331_49_0 = spill5331_2;
        break forward_join_49;
    }
    forwardValue5331_45_0 = ((net.minecraft.entity.passive.EntitySheep)(spill5331_2)).cf;
    }
    if (!((forwardValue5331_45_0 > 0))) {
        break forward_join_48;
    }
    forwardValue5331_52_0 = 0x1.41b2f8p-1f;
    break forward_join_52;
    }
    forwardValue5331_49_0 = this;
    }
    forwardValue5331_52_0 = (((net.minecraft.entity.passive.EntitySheep)(forwardValue5331_49_0)).x / 0x1.ca5dcp5f);
    }
    return forwardValue5331_52_0;
}


protected void d__Void() {
long local1 = (net.minecraft.entity.passive.EntitySheep.jb ^ 112642903949477L);
    super.d__Void();
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1989_3(6849, (7449323836454901103L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    return;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Sheared")), ((boolean)(((net.minecraft.entity.passive.EntitySheep)(this)).ae())));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Color")), ((byte)(((byte) ((net.minecraft.item.EnumDyeColor)(((net.minecraft.entity.passive.EntitySheep)(this)).a__sourceReturn_d841ada59b())).a()))));
    return;
}


public net.minecraft.entity.IEntityLivingData a(moom.Eh p0, net.minecraft.entity.IEntityLivingData p1) {
p1 = super.a(((moom.Eh)(p0)), ((net.minecraft.entity.IEntityLivingData)(p1)));
    ((net.minecraft.entity.passive.EntitySheep)(this)).a(((net.minecraft.item.EnumDyeColor)(__sourceExactCall_ea3fc13555a3a2(((java.util.Random)(((net.minecraft.world.World)(this.i)).u))))));
    return p1;
}


public net.minecraft.entity.passive.EntitySheep a__sR(moom.sJ p0) {
net.minecraft.entity.passive.EntitySheep local2 = ((net.minecraft.entity.passive.EntitySheep)(p0));
    net.minecraft.entity.passive.EntitySheep local3 = new net.minecraft.entity.passive.EntitySheep(this.i);
    ((net.minecraft.entity.passive.EntitySheep)(local3)).a(((net.minecraft.item.EnumDyeColor)(((net.minecraft.entity.passive.EntitySheep)(this)).a(((moom.sK)(this)), ((moom.sK)(local2))))));
    return local3;
}


public static float[] a__ArrayFloat(net.minecraft.item.EnumDyeColor p0) {
return ((float[])(((java.util.Map)(net.minecraft.entity.passive.EntitySheep.ce)).get(((java.lang.Object)(p0)))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public moom.sJ a(moom.sJ p0) {
return ((net.minecraft.entity.passive.EntitySheep)(this)).a__sR(((moom.sJ)(p0)));
}


private net.minecraft.item.EnumDyeColor a(moom.sK p0, moom.sK p1) {
net.minecraft.item.ItemStack forwardValue5326_40_0;
    net.minecraft.item.ItemStack forwardValue5326_46_0;
    int forwardValue5326_58_0;
    int forwardValue5326_60_0;
    int spill5326_0;
    net.minecraft.item.ItemStack spill5326_1;
    boolean spill5326_2;
    long life3_3;
    int life6_8;
    int life7_14;
    int life5_21;
    net.minecraft.item.ItemStack life8_34;
    int life9_56;
    forward_join_61: {
    forward_join_60: {
    forward_join_59: {
    forward_join_58: {
    forward_join_50: {
    forward_join_46: {
    forward_join_40: {
    life3_3 = (net.minecraft.entity.passive.EntitySheep.jb ^ 51834448539260L);
    life6_8 = ((net.minecraft.item.EnumDyeColor)(((net.minecraft.entity.passive.EntitySheep)(((net.minecraft.entity.passive.EntitySheep)(p0)))).a__sourceReturn_d841ada59b())).b();
    spill5326_0 = moom.vR.c();
    life7_14 = ((net.minecraft.item.EnumDyeColor)(((net.minecraft.entity.passive.EntitySheep)(((net.minecraft.entity.passive.EntitySheep)(p1)))).a__sourceReturn_d841ada59b())).b();
    ((net.minecraft.item.ItemStack)(((moom.wx)(this.cd)).a__xW(((int)(0))))).a__Void(((int)(life6_8)));
    life5_21 = spill5326_0;
    ((net.minecraft.item.ItemStack)(((moom.wx)(this.cd)).a__xW(((int)(1))))).a__Void(((int)(life7_14)));
    life8_34 = ((net.minecraft.item.crafting.CraftingManager)(net.minecraft.item.crafting.CraftingManager.a__xX())).a(((moom.wx)(this.cd)), ((net.minecraft.world.World)(((moom.sK)(p0)).i)));
    spill5326_1 = life8_34;
    if (!((life5_21 == 0))) {
        forwardValue5326_40_0 = spill5326_1;
        break forward_join_40;
    }
    if (!((spill5326_1 != null))) {
        break forward_join_50;
    }
    forwardValue5326_40_0 = life8_34;
    }
    if (!((life5_21 == 0))) {
        forwardValue5326_46_0 = forwardValue5326_40_0;
        break forward_join_46;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue5326_40_0)).a__wQ() == net.minecraft.init.Items.aW))) {
        break forward_join_50;
    }
    forwardValue5326_46_0 = life8_34;
    }
    life9_56 = ((net.minecraft.item.ItemStack)(forwardValue5326_46_0)).c();
    if (!((life5_21 != 0))) {
        break forward_join_61;
    }
    }
    spill5326_2 = ((java.util.Random)(((net.minecraft.world.World)(this.i)).u)).nextBoolean();
    if (!((life5_21 == 0))) {
        forwardValue5326_58_0 = ((spill5326_2) ? 1 : 0);
        break forward_join_58;
    }
    if (!(spill5326_2)) {
        break forward_join_59;
    }
    forwardValue5326_58_0 = life6_8;
    }
    forwardValue5326_60_0 = forwardValue5326_58_0;
    break forward_join_60;
    }
    forwardValue5326_60_0 = life7_14;
    }
    life9_56 = forwardValue5326_60_0;
    }
    return net.minecraft.item.EnumDyeColor.a(((int)(life9_56)));
}


protected void a(moom.DT p0, net.minecraft.block.Block p1) {
((net.minecraft.entity.passive.EntitySheep)(this)).a(((java.lang.String)("mob.sheep.step")), ((float)(0x1.333334p-3f)), ((float)(0x1.0p0f)));
    return;
}


public boolean a__Boolean(net.minecraft.entity.player.EntityPlayer p0) {
net.minecraft.item.ItemStack lexicalValue1605_15_0;
    net.minecraft.entity.passive.EntitySheep lexicalValue1605_113_0;
    int lexicalValue1605_120_0;
    int spill1605_0;
    net.minecraft.item.ItemStack spill1605_1;
    boolean spill1605_2;
    boolean spill1605_3;
    net.minecraft.entity.passive.EntitySheep spill1605_4;
    long life2_3;
    net.minecraft.item.ItemStack life5_8;
    int life4_9;
    int life6_64;
    int life7_66;
    net.minecraft.entity.item.EntityItem life8_82;
    lexical_join_120: {
    lexical_join_117: {
    lexical_join_113: {
    lexical_join_112: {
    lexical_join_108: {
    lexical_join_15: {
    life2_3 = (net.minecraft.entity.passive.EntitySheep.jb ^ 54683580330574L);
    spill1605_0 = moom.vR.c();
    life5_8 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a__xW();
    life4_9 = spill1605_0;
    spill1605_1 = life5_8;
    if (!((life4_9 == 0))) {
        lexicalValue1605_15_0 = spill1605_1;
        break lexical_join_15;
    }
    if (!((spill1605_1 != null))) {
        break lexical_join_117;
    }
    lexicalValue1605_15_0 = life5_8;
    }
    if (!((((net.minecraft.item.ItemStack)(lexicalValue1605_15_0)).a__wQ() == net.minecraft.init.Items.a4))) {
        break lexical_join_117;
    }
    spill1605_2 = ((net.minecraft.entity.passive.EntitySheep)(this)).ae();
    if (!((life4_9 == 0))) {
        lexicalValue1605_120_0 = ((spill1605_2) ? 1 : 0);
        break lexical_join_120;
    }
    if (!((!spill1605_2))) {
        break lexical_join_117;
    }
    spill1605_3 = ((net.minecraft.entity.passive.EntitySheep)(this)).c__Boolean();
    if (!((life4_9 == 0))) {
        lexicalValue1605_120_0 = ((spill1605_3) ? 1 : 0);
        break lexical_join_120;
    }
    if (!((!spill1605_3))) {
        break lexical_join_117;
    }
    spill1605_4 = this;
    if (!((life4_9 == 0))) {
        lexicalValue1605_113_0 = spill1605_4;
        break lexical_join_113;
    }
    if (!((!((net.minecraft.world.World)(((net.minecraft.entity.passive.EntitySheep)(spill1605_4)).i)).G))) {
        break lexical_join_108;
    }
    ((net.minecraft.entity.passive.EntitySheep)(this)).n(((boolean)(true)));
    life6_64 = (1 + ((java.util.Random)(this.ah)).nextInt(((int)(3))));
    life7_66 = 0;
    lexical_cycle_46: while (true) {
    if (!((life7_66 < life6_64))) {
        break lexical_join_108;
    }
    life8_82 = ((net.minecraft.entity.passive.EntitySheep)(this)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(__sourceExactCall_42e37b9acc15b0(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L))), 1, ((net.minecraft.item.EnumDyeColor)(((net.minecraft.entity.passive.EntitySheep)(this)).a__sourceReturn_d841ada59b())).a()))), ((float)(0x1.0p0f)));
    net.minecraft.entity.item.EntityItem __stackOp1605_20_0 = life8_82;
    ((net.minecraft.entity.item.EntityItem)(__stackOp1605_20_0)).u = ((double)((((net.minecraft.entity.item.EntityItem)(__stackOp1605_20_0)).u + ((double) (((java.util.Random)(this.ah)).nextFloat() * 0x1.99999ap-5f)))));
    net.minecraft.entity.item.EntityItem __stackOp1605_25_0 = life8_82;
    ((net.minecraft.entity.item.EntityItem)(__stackOp1605_25_0)).t = ((double)((((net.minecraft.entity.item.EntityItem)(__stackOp1605_25_0)).t + ((double) ((((java.util.Random)(this.ah)).nextFloat() - ((java.util.Random)(this.ah)).nextFloat()) * 0x1.99999ap-4f)))));
    net.minecraft.entity.item.EntityItem __stackOp1605_32_0 = life8_82;
    ((net.minecraft.entity.item.EntityItem)(__stackOp1605_32_0)).v = ((double)((((net.minecraft.entity.item.EntityItem)(__stackOp1605_32_0)).v + ((double) ((((java.util.Random)(this.ah)).nextFloat() - ((java.util.Random)(this.ah)).nextFloat()) * 0x1.99999ap-4f)))));
    life7_66 += 1;
    if (!((life4_9 == 0))) {
        break lexical_join_112;
    }
    if (!((life4_9 != 0))) { continue lexical_cycle_46; }
    break lexical_cycle_46;
    }
    }
    ((net.minecraft.item.ItemStack)(life5_8)).a(((int)(1)), ((net.minecraft.entity.EntityLivingBase)(p0)));
    }
    lexicalValue1605_113_0 = this;
    }
    ((net.minecraft.entity.passive.EntitySheep)(lexicalValue1605_113_0)).a(((java.lang.String)("mob.sheep.shear")), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    }
    lexicalValue1605_120_0 = ((super.a__Boolean(((net.minecraft.entity.player.EntityPlayer)(p0)))) ? 1 : 0);
    }
    return ((lexicalValue1605_120_0) != 0);
}


public void a(byte p0) {
long life2_3;
    int life4_5;
    forward_join_27: {
    forward_join_24: {
    forward_join_22: {
    life2_3 = (net.minecraft.entity.passive.EntitySheep.jb ^ 184028735655L);
    life4_5 = moom.vR.c();
    if (!((life4_5 == 0))) { break forward_join_22; }
    if (!((p0 == __sourceIntrinsic_6121ff5511c4_invokedynamic5976_2(18139, (7796443519269642605L ^ life2_3))))) { break forward_join_24; }
    this.cf = ((int)(__sourceIntrinsic_6121ff5511c4_invokedynamic5976_3(15901, (4976756596922800569L ^ life2_3))));
    }
    if (!((life4_5 != 0))) { break forward_join_27; }
    }
    super.a(((byte)(p0)));
    }
    return;
}


protected net.minecraft.item.Item a__wQ() {
return __sourceExactCall_42e37b9acc15b0(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L)));
}


protected void a__Void() {
super.a__Void();
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.passive.EntitySheep)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b))))).a(((double)(0x1.0p3d)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.passive.EntitySheep)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).a(((double)(0x1.d70a3ep-3d)));
    return;
}


public static net.minecraft.item.EnumDyeColor a(java.util.Random p0) {
int forwardValue5325_27_0;
    int forwardValue5325_27_1;
    int forwardValue5325_38_0;
    int forwardValue5325_38_1;
    int forwardValue5325_51_0;
    int forwardValue5325_51_1;
    int forwardValue5325_61_0;
    net.minecraft.item.EnumDyeColor forwardValue5325_65_0;
    int spill5325_0;
    int spill5325_1;
    int spill5325_2;
    int spill5325_3;
    long life1_3;
    int life4_12;
    int life3_13;
    forward_join_65: {
    forward_join_64: {
    forward_join_61: {
    forward_join_54: {
    forward_join_51: {
    forward_join_43: {
    forward_join_38: {
    forward_join_32: {
    forward_join_27: {
    forward_join_21: {
    life1_3 = (net.minecraft.entity.passive.EntitySheep.jb ^ 7089611654939L);
    spill5325_0 = moom.vR.c();
    life4_12 = ((java.util.Random)(p0)).nextInt(((int)(__sourceIntrinsic_12a4b3d7dc72_invokedynamic5325_2(15773, (8654947555245241736L ^ life1_3)))));
    life3_13 = spill5325_0;
    spill5325_1 = life4_12;
    spill5325_2 = 5;
    if (!((life3_13 == 0))) {
        forwardValue5325_27_0 = spill5325_1;
        forwardValue5325_27_1 = spill5325_2;
        break forward_join_27;
    }
    if (!((spill5325_1 < spill5325_2))) {
        break forward_join_21;
    }
    forwardValue5325_65_0 = net.minecraft.item.EnumDyeColor.BLACK;
    break forward_join_65;
    }
    forwardValue5325_27_0 = life4_12;
    forwardValue5325_27_1 = __sourceIntrinsic_12a4b3d7dc72_invokedynamic5325_5(16707, (6679015785880963410L ^ life1_3));
    }
    if (!((life3_13 == 0))) {
        forwardValue5325_38_0 = forwardValue5325_27_0;
        forwardValue5325_38_1 = forwardValue5325_27_1;
        break forward_join_38;
    }
    if (!((forwardValue5325_27_0 < forwardValue5325_27_1))) {
        break forward_join_32;
    }
    forwardValue5325_65_0 = net.minecraft.item.EnumDyeColor.GRAY;
    break forward_join_65;
    }
    forwardValue5325_38_0 = life4_12;
    forwardValue5325_38_1 = __sourceIntrinsic_12a4b3d7dc72_invokedynamic5325_7(26967, (8392590770367357253L ^ life1_3));
    }
    if (!((life3_13 == 0))) {
        forwardValue5325_51_0 = forwardValue5325_38_0;
        forwardValue5325_51_1 = forwardValue5325_38_1;
        break forward_join_51;
    }
    if (!((forwardValue5325_38_0 < forwardValue5325_38_1))) {
        break forward_join_43;
    }
    forwardValue5325_65_0 = net.minecraft.item.EnumDyeColor.SILVER;
    break forward_join_65;
    }
    spill5325_3 = life4_12;
    if (!((life3_13 == 0))) {
        forwardValue5325_61_0 = spill5325_3;
        break forward_join_61;
    }
    forwardValue5325_51_0 = spill5325_3;
    forwardValue5325_51_1 = __sourceIntrinsic_12a4b3d7dc72_invokedynamic5325_9(32376, (2644947682396272236L ^ life1_3));
    }
    if (!((forwardValue5325_51_0 < forwardValue5325_51_1))) {
        break forward_join_54;
    }
    forwardValue5325_65_0 = net.minecraft.item.EnumDyeColor.BROWN;
    break forward_join_65;
    }
    forwardValue5325_61_0 = ((java.util.Random)(p0)).nextInt(((int)(__sourceIntrinsic_12a4b3d7dc72_invokedynamic5325_11(6987, (3044770908165509968L ^ life1_3)))));
    }
    if (!((forwardValue5325_61_0 == 0))) {
        break forward_join_64;
    }
    forwardValue5325_65_0 = net.minecraft.item.EnumDyeColor.PINK;
    break forward_join_65;
    }
    forwardValue5325_65_0 = net.minecraft.item.EnumDyeColor.WHITE;
    }
    return forwardValue5325_65_0;
}


public void a(net.minecraft.item.EnumDyeColor p0) {
long local2 = (net.minecraft.entity.passive.EntitySheep.jb ^ 136285609477916L);
    byte local4 = ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_ad257e093cd9_originalDynamicSite1990_2(6849, (7449319983046136534L ^ local2)))));
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_ad257e093cd9_originalDynamicSite1990_5(6849, (7449319983046136534L ^ local2)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) ((local4 & __sourceIntrinsic_ad257e093cd9_originalDynamicSite1990_6(27160, (8126437001137545740L ^ local2))) | (((net.minecraft.item.EnumDyeColor)(p0)).a() & __sourceIntrinsic_ad257e093cd9_originalDynamicSite1990_8(7039, (1176239741641921391L ^ local2)))))))))));
    return;
}


public net.minecraft.item.EnumDyeColor a__sourceReturn_d841ada59b() {
long local1 = (net.minecraft.entity.passive.EntitySheep.jb ^ 27896376814395L);
    return net.minecraft.item.EnumDyeColor.b(((int)((((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_fc36484f3d63_originalDynamicSite1991_2(23422, (5189891009471807299L ^ local1))))) & __sourceIntrinsic_fc36484f3d63_originalDynamicSite1991_4(7039, (1176201998852538184L ^ local1))))));
}


public void N() {
net.minecraft.entity.passive.EntitySheep forwardValue5324_15_0;
    int spill5324_0;
    net.minecraft.entity.passive.EntitySheep spill5324_1;
    long life1_3;
    int life3_8;
    forward_join_21: {
    forward_join_15: {
    life1_3 = (net.minecraft.entity.passive.EntitySheep.jb ^ 5492179309433L);
    spill5324_0 = moom.vR.b();
    ((net.minecraft.entity.passive.EntitySheep)(this)).n(((boolean)(false)));
    life3_8 = spill5324_0;
    spill5324_1 = this;
    if (!((life3_8 != 0))) {
        forwardValue5324_15_0 = spill5324_1;
        break forward_join_15;
    }
    if (!(((net.minecraft.entity.passive.EntitySheep)(spill5324_1)).c__Boolean())) {
        break forward_join_21;
    }
    forwardValue5324_15_0 = this;
    }
    ((net.minecraft.entity.passive.EntitySheep)(forwardValue5324_15_0)).k(((int)(__sourceIntrinsic_1064005e14b6_invokedynamic5324_4(19479, (8305368748839047276L ^ life1_3)))));
    }
    return;
}


protected void R() {
this.cf = ((int)(((moom.up)(this.cg)).b()));
    super.R();
    return;
}


public void G() {
net.minecraft.entity.passive.EntitySheep forwardValue5323_21_0;
    net.minecraft.entity.passive.EntitySheep spill5323_0;
    long life1_3;
    int life3_5;
    forward_join_21: {
    forward_join_20: {
    life1_3 = (net.minecraft.entity.passive.EntitySheep.jb ^ 119501312907006L);
    life3_5 = moom.vR.b();
    spill5323_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue5323_21_0 = spill5323_0;
        break forward_join_21;
    }
    if (!(((net.minecraft.world.World)(((net.minecraft.entity.passive.EntitySheep)(spill5323_0)).i)).G)) {
        break forward_join_20;
    }
    this.cf = ((int)(java.lang.Math.max(((int)(0)), ((int)((this.cf - 1))))));
    }
    forwardValue5323_21_0 = this;
    }
    __sourceIntrinsic_c7b45e3c376e_call5323_7(forwardValue5323_21_0);
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_99597f75c0f7cf5e_originalDynamicSite3392_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_99597f75c0f7cf5e_originalDynamicSite3392_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_99597f75c0f7cf5e_originalDynamicSite3392_30(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_c7b45e3c376e_call5323_7(net.minecraft.entity.passive.EntitySheep a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1064005e14b6_invokedynamic5324_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fc36484f3d63_originalDynamicSite1991_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fc36484f3d63_originalDynamicSite1991_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6121ff5511c4_invokedynamic5976_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6121ff5511c4_invokedynamic5976_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_12a4b3d7dc72_invokedynamic5325_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_12a4b3d7dc72_invokedynamic5325_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_12a4b3d7dc72_invokedynamic5325_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_12a4b3d7dc72_invokedynamic5325_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_12a4b3d7dc72_invokedynamic5325_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ad257e093cd9_originalDynamicSite1990_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ad257e093cd9_originalDynamicSite1990_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ad257e093cd9_originalDynamicSite1990_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ad257e093cd9_originalDynamicSite1990_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a627c59d8423_invokedynamic5328_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a627c59d8423_invokedynamic5328_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3c64789755d1_invokedynamic5330_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3c64789755d1_invokedynamic5330_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6e61104d7973_invokedynamic5331_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1989_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_ec881c4a524b_methodHandleLiteral11662_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1b79f0ed2644_invokedynamic5984_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1b79f0ed2644_invokedynamic5984_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1b79f0ed2644_invokedynamic5984_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1b79f0ed2644_invokedynamic5984_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1b79f0ed2644_invokedynamic5984_12(int a0, long a1) throws E;

private static native net.minecraft.item.Item __sourceExactCall_42e37b9acc15b0(net.minecraft.block.Block p0);
private static native net.minecraft.item.EnumDyeColor __sourceExactCall_ea3fc13555a3a2(java.util.Random p0);

private static native void __sourceExactCall_ae34dbea601cc3(net.minecraft.entity.ai.EntityAITasks p0, int p1, moom.uc p2);

private static native moom.AV __sourceExactCall_2d16a4174cdb47(net.minecraft.entity.passive.EntitySheep p0);
}
