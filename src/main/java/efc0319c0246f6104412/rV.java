package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class rV {

private static final java.util.Random a;

private static final moom.rZ b;

private static final net.minecraft.enchantment.EnchantmentHelper$ModifierLiving c;

private static final moom.rX d;

private static final moom.rW e;

private static boolean f;

private static final long g;

private static final long[] h;

private static final java.lang.Integer[] i;

private static final java.util.Map j;

public rV() {
super();
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(-8331108718182680572L)), ((long)(8927160496011278449L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(189684715609409L)))));
    int __sourceSpill1504_6 = 1;
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life8 = (moom.rV.g ^ 157104365916L);
    moom.rV.b(((boolean)__sourceIntrinsic_integerToBoolean((__sourceSpill1504_6))));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1504_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1504_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1504_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1504_16 = new byte[8];
    (__sourceSpill1504_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1504_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1504_18 = __sourceSpill1504_16;
    ((javax.crypto.Cipher)(__sourceSpill1504_13)).init(((int)(__sourceSpill1504_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1504_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1504_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[6];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "GÄÀ\rU«pà\035Ñ*x\030î\000Ï}z\032ýWY\006\r<È0\n§Ó¹Y"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1504_27 = local6_life23;
        int __sourceSpill1504_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1504_27)).substring(((int)(__sourceSpill1504_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1504_32 = local8_life21;
        int __sourceSpill1504_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1504_35 = new byte[8];
        (__sourceSpill1504_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1504_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1504_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1504_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1504_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1504_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1504_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1504_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1504_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1504_36)).doFinal(((byte[])(__sourceSpill1504_35)));
        (__sourceSpill1504_32)[__sourceSpill1504_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "\024Wª<üê<0j\024Æx¢"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1504_40 = local6_life23;
        int __sourceSpill1504_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1504_40)).substring(((int)(__sourceSpill1504_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1504_45 = local8_life21;
        int __sourceSpill1504_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill1504_48 = new byte[8];
        (__sourceSpill1504_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill1504_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill1504_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill1504_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill1504_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill1504_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill1504_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill1504_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill1504_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill1504_49)).doFinal(((byte[])(__sourceSpill1504_48)));
        (__sourceSpill1504_45)[__sourceSpill1504_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    h = ((long[])(local8_life21));
    i = ((java.lang.Integer[])(new java.lang.Integer[6]));
    a = ((java.util.Random)(new java.util.Random()));
    b = ((moom.rZ)(new moom.rZ()));
    c = ((net.minecraft.enchantment.EnchantmentHelper$ModifierLiving)(new net.minecraft.enchantment.EnchantmentHelper$ModifierLiving()));
    d = ((moom.rX)(new moom.rX()));
    e = ((moom.rW)(new moom.rW()));
}


public static boolean b__Boolean(net.minecraft.entity.EntityLivingBase p0) {
int forwardValue3922_15_0;
    int forwardValue3922_17_0;
    int spill3922_0;
    long life1_3;
    int life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life1_3 = (moom.rV.g ^ 15137404906775L);
    life3_5 = ((moom.rV.b()) ? 1 : 0);
    spill3922_0 = moom.rV.a(((int)(((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.j)).C)), ((net.minecraft.item.ItemStack[])(((net.minecraft.entity.EntityLivingBase)(p0)).a__ArrayxW())));
    if (!((life3_5 != 0))) {
        forwardValue3922_15_0 = spill3922_0;
        break forward_join_15;
    }
    if (!((spill3922_0 > 0))) {
        break forward_join_16;
    }
    forwardValue3922_15_0 = 1;
    }
    forwardValue3922_17_0 = forwardValue3922_15_0;
    break forward_join_17;
    }
    forwardValue3922_17_0 = 0;
    }
    return ((forwardValue3922_17_0) != 0);
}


public static int b(net.minecraft.entity.EntityLivingBase p0) {
return moom.rV.a(((int)(((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.q)).C)), ((net.minecraft.item.ItemStack)(((net.minecraft.entity.EntityLivingBase)(p0)).a__xW())));
}


public static void b(net.minecraft.entity.EntityLivingBase p0, net.minecraft.entity.Entity p1) {
net.minecraft.entity.EntityLivingBase forwardValue3921_21_0;
    boolean spill3921_0;
    net.minecraft.entity.EntityLivingBase spill3921_1;
    long life2_3;
    int life4_11;
    forward_join_27: {
    forward_join_21: {
    forward_join_20: {
    life2_3 = (moom.rV.g ^ 87488901078299L);
    spill3921_0 = moom.rV.c();
    ((moom.rW)(moom.rV.e)).a = ((net.minecraft.entity.EntityLivingBase)(p0));
    ((moom.rW)(moom.rV.e)).b = ((net.minecraft.entity.Entity)(p1));
    life4_11 = ((spill3921_0) ? 1 : 0);
    spill3921_1 = p0;
    if (!((life4_11 == 0))) {
        forwardValue3921_21_0 = spill3921_1;
        break forward_join_21;
    }
    if (!((spill3921_1 != null))) {
        break forward_join_20;
    }
    moom.rV.a(((net.minecraft.enchantment.EnchantmentHelper$IModifier)(moom.rV.e)), ((net.minecraft.item.ItemStack[])(((net.minecraft.entity.EntityLivingBase)(p0)).a__ArrayxW())));
    }
    forwardValue3921_21_0 = p0;
    }
    if (!((((forwardValue3921_21_0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0) != 0))) {
        break forward_join_27;
    }
    moom.rV.a(((net.minecraft.enchantment.EnchantmentHelper$IModifier)(moom.rV.e)), ((net.minecraft.item.ItemStack)(((net.minecraft.entity.EntityLivingBase)(p0)).a__xW())));
    }
    return;
}


public static int b(net.minecraft.entity.Entity p0) {
return moom.rV.a(((int)(((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.l)).C)), ((net.minecraft.item.ItemStack[])(((net.minecraft.entity.Entity)(p0)).a__ArrayxW())));
}


public static boolean b() {
return ((((moom.rV.f) ? 1 : 0)) != 0);
}


public static void b(boolean p0) {
moom.rV.f = ((boolean)(p0));
    return;
}


public static int e(net.minecraft.entity.EntityLivingBase p0) {
return moom.rV.a(((int)(((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.A)).C)), ((net.minecraft.item.ItemStack)(((net.minecraft.entity.EntityLivingBase)(p0)).a__xW())));
}


public static boolean c() {
int local0 = __sourceIntrinsic_booleanToInteger(moom.rV.b());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


public static int c(net.minecraft.entity.EntityLivingBase p0) {
int forwardValue3923_39_0;
    int spill3923_0;
    long life1_3;
    int life3_5;
    net.minecraft.client.entity.EntityPlayerSP life4_16;
    com.moon.er life5_23;
    forward_join_39: {
    forward_join_34: {
    life1_3 = (moom.rV.g ^ 67411977480891L);
    life3_5 = ((moom.rV.b()) ? 1 : 0);
    spill3923_0 = ((p0 instanceof net.minecraft.client.entity.EntityPlayerSP) ? 1 : 0);
    if (!((life3_5 != 0))) {
        forwardValue3923_39_0 = spill3923_0;
        break forward_join_39;
    }
    if (!((spill3923_0 != 0))) {
        break forward_join_34;
    }
    life4_16 = ((net.minecraft.client.entity.EntityPlayerSP)(p0));
    life5_23 = new com.moon.er(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(life4_16)).bD)).c);
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life5_23)));
    return moom.rV.a(((int)(((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.s)).C)), ((net.minecraft.item.ItemStack)(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(life4_16)).bD)).a__xW(((int)(((com.moon.er)(life5_23)).a()))))));
    }
    forwardValue3923_39_0 = moom.rV.a(((int)(((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.s)).C)), ((net.minecraft.item.ItemStack)(((net.minecraft.entity.EntityLivingBase)(p0)).a__xW())));
    }
    return forwardValue3923_39_0;
}


public static int f(net.minecraft.entity.EntityLivingBase p0) {
return moom.rV.a(((int)(((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.B)).C)), ((net.minecraft.item.ItemStack)(((net.minecraft.entity.EntityLivingBase)(p0)).a__xW())));
}


public static int d(net.minecraft.entity.EntityLivingBase p0) {
return moom.rV.a(((int)(((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.v)).C)), ((net.minecraft.item.ItemStack)(((net.minecraft.entity.EntityLivingBase)(p0)).a__xW())));
}


public static void a(java.util.Map<java.lang.Integer, java.lang.Integer> p0, net.minecraft.item.ItemStack p1) {
net.minecraft.item.ItemStack lexicalValue1287_82_0;
    int lexicalValue1287_91_0;
    net.minecraft.item.ItemStack lexicalValue1287_93_0;
    boolean spill1287_0;
    int spill1287_1;
    net.minecraft.item.ItemStack spill1287_2;
    net.minecraft.item.ItemStack spill1287_3;
    long life2_3;
    net.minecraft.nbt.NBTTagList life5_8;
    int life4_9;
    java.util.Iterator life6_13;
    int life7_21;
    net.minecraft.enchantment.Enchantment life8_24;
    net.minecraft.nbt.NBTTagCompound life9_35;
    lexical_join_96: {
    lexical_join_93: {
    lexical_join_91: {
    lexical_join_87: {
    lexical_join_82: {
    lexical_join_70: {
    life2_3 = (moom.rV.g ^ 36428988706038L);
    spill1287_0 = moom.rV.c();
    life5_8 = new net.minecraft.nbt.NBTTagList();
    life4_9 = ((spill1287_0) ? 1 : 0);
    life6_13 = ((java.util.Set)(((java.util.Map)(p0)).keySet())).iterator();
    lexical_cycle_14: while (true) {
    lexical_join_68: {
    if (!(((java.util.Iterator)(life6_13)).hasNext())) {
        break lexical_join_70;
    }
    life7_21 = ((java.lang.Integer)(((java.lang.Integer)(((java.util.Iterator)(life6_13)).next())))).intValue();
    life8_24 = net.minecraft.enchantment.Enchantment.a__rD(((int)(life7_21)));
    if (!((life4_9 == 0))) {
        break lexical_join_87;
    }
    if (!((life8_24 != null))) {
        break lexical_join_68;
    }
    life9_35 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.nbt.NBTTagCompound)(life9_35)).a(((java.lang.String)("id")), ((short)(((short) life7_21))));
    ((net.minecraft.nbt.NBTTagCompound)(life9_35)).a(((java.lang.String)("lvl")), ((short)(((short) ((java.lang.Integer)(((java.lang.Integer)(((java.util.Map)(p0)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(life7_21)))))))))).intValue()))));
    ((net.minecraft.nbt.NBTTagList)(life5_8)).a(((net.minecraft.nbt.NBTBase)(life9_35)));
    if (!((((net.minecraft.item.ItemStack)(p1)).a__wQ() == net.minecraft.init.Items.bS))) {
        break lexical_join_68;
    }
    ((moom.xg)(net.minecraft.init.Items.bS)).a(((net.minecraft.item.ItemStack)(p1)), ((moom.D3)(new moom.D3(life8_24, ((java.lang.Integer)(((java.lang.Integer)(((java.util.Map)(p0)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(life7_21)))))))))).intValue()))));
    }
    if (!((life4_9 != 0))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    spill1287_1 = ((net.minecraft.nbt.NBTTagList)(life5_8)).a__Int();
    if (!((life4_9 == 0))) {
        lexicalValue1287_91_0 = spill1287_1;
        break lexical_join_91;
    }
    if (!((spill1287_1 > 0))) {
        break lexical_join_87;
    }
    spill1287_2 = p1;
    if (!((life4_9 == 0))) {
        lexicalValue1287_82_0 = spill1287_2;
        break lexical_join_82;
    }
    if (!((((net.minecraft.item.ItemStack)(spill1287_2)).a__wQ() != net.minecraft.init.Items.bS))) {
        break lexical_join_96;
    }
    lexicalValue1287_82_0 = p1;
    }
    ((net.minecraft.item.ItemStack)(lexicalValue1287_82_0)).a(((java.lang.String)("ench")), ((net.minecraft.nbt.NBTBase)(life5_8)));
    if (!((life4_9 != 0))) {
        break lexical_join_96;
    }
    }
    spill1287_3 = p1;
    if (!((life4_9 == 0))) {
        lexicalValue1287_93_0 = spill1287_3;
        break lexical_join_93;
    }
    lexicalValue1287_91_0 = ((((net.minecraft.item.ItemStack)(spill1287_3)).e__Boolean()) ? 1 : 0);
    }
    if (!((lexicalValue1287_91_0 != 0))) {
        break lexical_join_96;
    }
    lexicalValue1287_93_0 = p1;
    }
    ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.item.ItemStack)(lexicalValue1287_93_0)).a__yw())).a__Void(((java.lang.String)("ench")));
    }
    return;
}


public static int a(int p0, net.minecraft.item.ItemStack[] p1) {
int lexicalValue1286_43_0;
    int spill1286_0;
    long life2_3;
    int life4_5;
    int life5_13;
    net.minecraft.item.ItemStack[] life6_15;
    int life7_18;
    int life8_20;
    net.minecraft.item.ItemStack life9_27;
    int life10_31;
    lexical_join_43: {
    lexical_join_42: {
    lexical_join_10: {
    life2_3 = (moom.rV.g ^ 91954153131047L);
    life4_5 = ((moom.rV.c()) ? 1 : 0);
    if (!((p1 == null))) {
        break lexical_join_10;
    }
    return 0;
    }
    life5_13 = 0;
    life6_15 = p1;
    life7_18 = (life6_15).length;
    life8_20 = 0;
    lexical_cycle_19: while (true) {
    lexical_join_40: {
    lexical_join_39: {
    if (!((life8_20 < life7_18))) {
        break lexical_join_42;
    }
    life9_27 = (life6_15)[life8_20];
    life10_31 = moom.rV.a(((int)(p0)), ((net.minecraft.item.ItemStack)(life9_27)));
    if (!((life4_5 == 0))) {
        break lexical_join_40;
    }
    spill1286_0 = life10_31;
    if (!((life4_5 == 0))) {
        lexicalValue1286_43_0 = spill1286_0;
        break lexical_join_43;
    }
    if (!((spill1286_0 > life5_13))) {
        break lexical_join_39;
    }
    life5_13 = life10_31;
    }
    life8_20 += 1;
    }
    if (!((life4_5 != 0))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    lexicalValue1286_43_0 = life5_13;
    }
    return lexicalValue1286_43_0;
}


public static java.util.Map<java.lang.Integer, moom.D3> a__Map(int p0, net.minecraft.item.ItemStack p1) {
int forestValue934_18_0;
    int forestValue934_28_0;
    int forestValue934_28_1;
    int forestValue934_50_0;
    int forestValue934_68_0;
    int forestValue934_68_1;
    java.lang.Object forestValue934_85_0;
    java.util.HashMap forestValue934_99_0;
    java.util.HashMap forestValue934_100_0;
    int forestValue934_100_1;
    java.util.HashMap forestValue934_101_0;
    boolean spill934_0;
    boolean spill934_1;
    int spill934_2;
    int spill934_3;
    int spill934_4;
    java.util.HashMap spill934_5;
    java.util.HashMap spill934_6;
    long life2_3;
    net.minecraft.item.Item life5_7;
    java.util.HashMap life6_9;
    int life4_10;
    int life7_18;
    net.minecraft.enchantment.Enchantment[] life8_20;
    int life9_23;
    int life10_25;
    net.minecraft.enchantment.Enchantment life11_32;
    int life12_56;
    forest_join_101: {
    forest_join_100: {
    forest_join_99: {
    forest_join_92: {
    forest_join_18: {
    forest_join_17: {
    life2_3 = (moom.rV.g ^ 25488627765611L);
    spill934_0 = moom.rV.c();
    life5_7 = ((net.minecraft.item.ItemStack)(p1)).a__wQ();
    life6_9 = null;
    life4_10 = ((spill934_0) ? 1 : 0);
    if (!((((net.minecraft.item.ItemStack)(p1)).a__wQ() == net.minecraft.init.Items.aL))) {
        break forest_join_17;
    }
    forestValue934_18_0 = 1;
    break forest_join_18;
    }
    forestValue934_18_0 = 0;
    }
    life7_18 = forestValue934_18_0;
    life8_20 = net.minecraft.enchantment.Enchantment.b;
    life9_23 = (life8_20).length;
    life10_25 = 0;
    forest_cycle_26: while (true) {
    forest_join_90: {
    forest_join_89: {
    forestValue934_28_0 = life10_25;
    forestValue934_28_1 = life9_23;
    forest_cycle_28: while (true) {
    forest_join_50: {
    forest_join_48: {
    if (!((forestValue934_28_0 < forestValue934_28_1))) {
        break forest_join_92;
    }
    life11_32 = (life8_20)[life10_25];
    if (!((life4_10 == 0))) {
        break forest_join_90;
    }
    if (!((life11_32 != null))) {
        break forest_join_89;
    }
    spill934_1 = ((net.minecraft.enchantment.EnumEnchantmentType)(((net.minecraft.enchantment.Enchantment)(life11_32)).E)).a(((net.minecraft.item.Item)(life5_7)));
    if (!((life4_10 == 0))) {
        forestValue934_50_0 = ((spill934_1) ? 1 : 0);
        break forest_join_50;
    }
    if (!((!spill934_1))) {
        break forest_join_48;
    }
    spill934_2 = life7_18;
    if (!((life4_10 == 0))) {
        forestValue934_50_0 = spill934_2;
        break forest_join_50;
    }
    if (!((spill934_2 != 0))) {
        break forest_join_89;
    }
    }
    forestValue934_50_0 = ((net.minecraft.enchantment.Enchantment)(life11_32)).b();
    }
    life12_56 = forestValue934_50_0;
    forest_cycle_51: while (true) {
    forest_join_86: {
    forest_join_85: {
    forest_join_75: {
    forest_join_68: {
    if (!((life12_56 <= ((net.minecraft.enchantment.Enchantment)(life11_32)).c()))) {
        break forest_join_89;
    }
    spill934_3 = p0;
    spill934_4 = ((net.minecraft.enchantment.Enchantment)(life11_32)).a(((int)(life12_56)));
    if (!((life4_10 == 0))) {
        forestValue934_28_0 = spill934_3;
        forestValue934_28_1 = spill934_4;
        continue forest_cycle_28;
    }
    if (!((life4_10 == 0))) {
        forestValue934_68_0 = spill934_3;
        forestValue934_68_1 = spill934_4;
        break forest_join_68;
    }
    if (!((spill934_3 >= spill934_4))) {
        break forest_join_86;
    }
    forestValue934_68_0 = p0;
    forestValue934_68_1 = ((net.minecraft.enchantment.Enchantment)(life11_32)).b(((int)(life12_56)));
    }
    if (!((forestValue934_68_0 <= forestValue934_68_1))) {
        break forest_join_86;
    }
    spill934_5 = life6_9;
    if (!((life4_10 == 0))) {
        forestValue934_85_0 = spill934_5;
        break forest_join_85;
    }
    if (!((spill934_5 == null))) {
        break forest_join_75;
    }
    life6_9 = com.google.common.collect.Maps.newHashMap();
    }
    forestValue934_85_0 = ((java.util.Map)(life6_9)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.enchantment.Enchantment)(life11_32)).C))))), ((java.lang.Object)(new moom.D3(life11_32, life12_56))));
    }
    recovery.source.CarrierOps.discard(forestValue934_85_0);
    }
    life12_56 += 1;
    if (!((life4_10 != 0))) {
        continue forest_cycle_51;
    }
    break forest_cycle_51;
    }
    break forest_cycle_28;
    }
    }
    life10_25 += 1;
    }
    if (!((life4_10 != 0))) {
        continue forest_cycle_26;
    }
    break forest_cycle_26;
    }
    }
    spill934_6 = life6_9;
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        forestValue934_101_0 = spill934_6;
        break forest_join_101;
    }
    if (!((life4_10 != 0))) {
        forestValue934_99_0 = spill934_6;
        break forest_join_99;
    }
    forestValue934_100_0 = spill934_6;
    forestValue934_100_1 = 0;
    break forest_join_100;
    }
    forestValue934_100_0 = forestValue934_99_0;
    forestValue934_100_1 = 1;
    }
    moom.rV.b(((boolean)__sourceIntrinsic_integerToBoolean((forestValue934_100_1))));
    forestValue934_101_0 = forestValue934_100_0;
    }
    return forestValue934_101_0;
}


public static java.util.List<moom.D3> a(java.util.Random p0, net.minecraft.item.ItemStack p1, int p2) {
int forestValue935_43_0;
    int forestValue935_70_0;
    java.util.Map forestValue935_82_0;
    java.util.Iterator forestValue935_112_0;
    int forestValue935_146_0;
    int forestValue935_152_0;
    int forestValue935_175_0;
    boolean spill935_0;
    int spill935_1;
    int spill935_2;
    java.util.Map spill935_3;
    java.util.Iterator spill935_4;
    boolean spill935_5;
    boolean spill935_6;
    long life3_3;
    net.minecraft.item.Item life6_7;
    int life5_8;
    int life7_11;
    int life7_22;
    int life7_40;
    int life8_44;
    float life9_54;
    int life10_64;
    java.util.ArrayList life11_75;
    java.util.Map life12_79;
    moom.D3 life13_93;
    int life14_103;
    java.util.Iterator life15_116;
    java.lang.Integer life16_123;
    int life17_125;
    java.util.Iterator life18_130;
    moom.D3 life19_137;
    moom.D3 life16_176;
    forest_join_178: {
    forest_join_82: {
    forest_join_71: {
    forest_join_70: {
    forest_join_43: {
    forest_join_18: {
    life3_3 = (moom.rV.g ^ 129018997836134L);
    spill935_0 = moom.rV.b();
    life6_7 = ((net.minecraft.item.ItemStack)(p1)).a__wQ();
    life5_8 = ((spill935_0) ? 1 : 0);
    life7_11 = ((net.minecraft.item.Item)(life6_7)).c();
    spill935_1 = life7_11;
    if (!((life5_8 != 0))) {
        forestValue935_43_0 = spill935_1;
        break forest_join_43;
    }
    if (!((spill935_1 <= 0))) {
        break forest_join_18;
    }
    return null;
    }
    life7_22 = (life7_11 / 2);
    life7_40 = ((1 + ((java.util.Random)(p0)).nextInt(((int)(((life7_22 >> 1) + 1))))) + ((java.util.Random)(p0)).nextInt(((int)(((life7_22 >> 1) + 1)))));
    forestValue935_43_0 = (life7_40 + p2);
    }
    life8_44 = forestValue935_43_0;
    life9_54 = (((((java.util.Random)(p0)).nextFloat() + ((java.util.Random)(p0)).nextFloat()) - 0x1.0p0f) * 0x1.333334p-3f);
    life10_64 = ((int) ((((float) life8_44) * (0x1.0p0f + life9_54)) + 0x1.0p-1f));
    spill935_2 = life10_64;
    if (!((life5_8 != 0))) {
        forestValue935_70_0 = spill935_2;
        break forest_join_70;
    }
    if (!((spill935_2 < 1))) {
        break forest_join_71;
    }
    forestValue935_70_0 = 1;
    }
    life10_64 = forestValue935_70_0;
    }
    life11_75 = null;
    life12_79 = moom.rV.a__Map(((int)(life10_64)), ((net.minecraft.item.ItemStack)(p1)));
    spill935_3 = life12_79;
    if (!((life5_8 != 0))) {
        forestValue935_82_0 = spill935_3;
        break forest_join_82;
    }
    if (!((spill935_3 != null))) {
        break forest_join_178;
    }
    forestValue935_82_0 = life12_79;
    }
    if (!((!((java.util.Map)(forestValue935_82_0)).isEmpty()))) {
        break forest_join_178;
    }
    life13_93 = ((moom.D3)(moom.D0.a(((java.util.Random)(p0)), ((java.util.Collection)(((java.util.Map)(life12_79)).values())))));
    if (!((life13_93 != null))) {
        break forest_join_178;
    }
    life11_75 = com.google.common.collect.Lists.newArrayList();
    ((java.util.List)(life11_75)).add(((java.lang.Object)(life13_93)));
    life14_103 = life10_64;
    forest_cycle_100: while (true) {
    forest_join_175: {
    forest_join_172: {
    forest_join_157: {
    if (!((((java.util.Random)(p0)).nextInt(((int)(__sourceIntrinsic_f99fa3215514_invokedynamic935_16(27859, (6650684194970767358L ^ life3_3))))) <= life14_103))) {
        break forest_join_178;
    }
    forestValue935_112_0 = ((java.util.Set)(((java.util.Map)(life12_79)).keySet())).iterator();
    forest_cycle_112: while (true) {
    life15_116 = forestValue935_112_0;
    forest_cycle_113: while (true) {
    forest_join_155: {
    forest_join_152: {
    forest_join_151: {
    if (!(((java.util.Iterator)(life15_116)).hasNext())) {
        break forest_join_157;
    }
    life16_123 = ((java.lang.Integer)(((java.util.Iterator)(life15_116)).next()));
    life17_125 = 1;
    spill935_4 = ((java.util.List)(life11_75)).iterator();
    if (!((life5_8 != 0))) {
        forestValue935_112_0 = spill935_4;
        continue forest_cycle_112;
    }
    life18_130 = spill935_4;
    forest_cycle_127: while (true) {
    forest_join_149: {
    forest_join_146: {
    if (!(((java.util.Iterator)(life18_130)).hasNext())) {
        break forest_join_151;
    }
    life19_137 = ((moom.D3)(((java.util.Iterator)(life18_130)).next()));
    spill935_5 = ((net.minecraft.enchantment.Enchantment)(((moom.D3)(life19_137)).c)).a(((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.a__rD(((int)(((java.lang.Integer)(life16_123)).intValue()))))));
    if (!((life5_8 != 0))) {
        forestValue935_152_0 = ((spill935_5) ? 1 : 0);
        break forest_join_152;
    }
    if (!((life5_8 != 0))) {
        forestValue935_146_0 = ((spill935_5) ? 1 : 0);
        break forest_join_146;
    }
    if (!((!spill935_5))) {
        break forest_join_149;
    }
    forestValue935_146_0 = 0;
    }
    life17_125 = forestValue935_146_0;
    if (!((life5_8 == 0))) {
        break forest_join_151;
    }
    }
    if (!((life5_8 == 0))) {
        continue forest_cycle_127;
    }
    break forest_cycle_127;
    }
    }
    forestValue935_152_0 = life17_125;
    }
    if (!((forestValue935_152_0 == 0))) {
        break forest_join_155;
    }
    ((java.util.Iterator)(life15_116)).remove();
    }
    if (!((life5_8 == 0))) {
        continue forest_cycle_113;
    }
    break forest_cycle_113;
    }
    break forest_cycle_112;
    }
    }
    spill935_6 = ((java.util.Map)(life12_79)).isEmpty();
    if (!((life5_8 != 0))) {
        forestValue935_175_0 = ((spill935_6) ? 1 : 0);
        break forest_join_175;
    }
    if (!((!spill935_6))) {
        break forest_join_172;
    }
    life16_176 = ((moom.D3)(moom.D0.a(((java.util.Random)(p0)), ((java.util.Collection)(((java.util.Map)(life12_79)).values())))));
    ((java.util.List)(life11_75)).add(((java.lang.Object)(life16_176)));
    }
    forestValue935_175_0 = (life14_103 >> 1);
    }
    life14_103 = forestValue935_175_0;
    if (!((life5_8 == 0))) {
        continue forest_cycle_100;
    }
    break forest_cycle_100;
    }
    }
    return life11_75;
}


public static net.minecraft.item.ItemStack a__xW(java.util.Random p0, net.minecraft.item.ItemStack p1, int p2) {
int lexicalValue1294_18_0;
    java.util.List lexicalValue1294_29_0;
    boolean spill1294_0;
    java.util.List spill1294_1;
    long life3_3;
    java.util.List life6_9;
    int life5_10;
    int life7_20;
    java.util.Iterator life8_38;
    moom.D3 life9_45;
    lexical_join_56: {
    lexical_join_29: {
    lexical_join_24: {
    lexical_join_18: {
    lexical_join_17: {
    life3_3 = (moom.rV.g ^ 439372733864L);
    spill1294_0 = moom.rV.c();
    life6_9 = moom.rV.a(((java.util.Random)(p0)), ((net.minecraft.item.ItemStack)(p1)), ((int)(p2)));
    life5_10 = ((spill1294_0) ? 1 : 0);
    if (!((((net.minecraft.item.ItemStack)(p1)).a__wQ() == net.minecraft.init.Items.aL))) {
        break lexical_join_17;
    }
    lexicalValue1294_18_0 = 1;
    break lexical_join_18;
    }
    lexicalValue1294_18_0 = 0;
    }
    life7_20 = lexicalValue1294_18_0;
    if (!((life7_20 != 0))) {
        break lexical_join_24;
    }
    ((net.minecraft.item.ItemStack)(p1)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bS)));
    }
    spill1294_1 = life6_9;
    if (!((life5_10 == 0))) {
        lexicalValue1294_29_0 = spill1294_1;
        break lexical_join_29;
    }
    if (!((spill1294_1 != null))) {
        break lexical_join_56;
    }
    lexicalValue1294_29_0 = life6_9;
    }
    life8_38 = ((java.util.List)(lexicalValue1294_29_0)).iterator();
    lexical_cycle_31: while (true) {
    lexical_join_54: {
    lexical_join_48: {
    lexical_join_46: {
    if (!(((java.util.Iterator)(life8_38)).hasNext())) {
        break lexical_join_56;
    }
    life9_45 = ((moom.D3)(((java.util.Iterator)(life8_38)).next()));
    if (!((life5_10 == 0))) {
        break lexical_join_46;
    }
    if (!((life7_20 != 0))) {
        break lexical_join_48;
    }
    ((moom.xg)(net.minecraft.init.Items.bS)).a(((net.minecraft.item.ItemStack)(p1)), ((moom.D3)(life9_45)));
    }
    if (!((life5_10 != 0))) {
        break lexical_join_54;
    }
    }
    ((net.minecraft.item.ItemStack)(p1)).a(((net.minecraft.enchantment.Enchantment)(((moom.D3)(life9_45)).c)), ((int)(((moom.D3)(life9_45)).d)));
    }
    if (!((life5_10 != 0))) { continue lexical_cycle_31; }
    break lexical_cycle_31;
    }
    }
    return p1;
}


public static int a(java.util.Random p0, int p1, int p2, net.minecraft.item.ItemStack p3) {
int forwardValue3909_19_0;
    int forwardValue3909_51_0;
    int forwardValue3909_51_1;
    int forwardValue3909_64_0;
    int forwardValue3909_80_0;
    int forwardValue3909_80_1;
    int forwardValue3909_81_0;
    boolean spill3909_0;
    int spill3909_1;
    int spill3909_2;
    int spill3909_3;
    int spill3909_4;
    long life4_3;
    net.minecraft.item.Item life7_7;
    int life6_8;
    int life8_11;
    int life9_60;
    forward_join_81: {
    forward_join_80: {
    forward_join_76: {
    forward_join_64: {
    forward_join_63: {
    forward_join_51: {
    forward_join_33: {
    forward_join_19: {
    forward_join_18: {
    life4_3 = (moom.rV.g ^ 108921509586476L);
    spill3909_0 = moom.rV.b();
    life7_7 = ((net.minecraft.item.ItemStack)(p3)).a__wQ();
    life6_8 = ((spill3909_0) ? 1 : 0);
    life8_11 = ((net.minecraft.item.Item)(life7_7)).c();
    spill3909_1 = life8_11;
    if (!((life6_8 != 0))) {
        forwardValue3909_19_0 = spill3909_1;
        break forward_join_19;
    }
    if (!((spill3909_1 <= 0))) {
        break forward_join_18;
    }
    return 0;
    }
    forwardValue3909_19_0 = p2;
    }
    spill3909_2 = __sourceIntrinsic_ed9d2369fd79_invokedynamic3909_5(6173, (5705069938172056703L ^ life4_3));
    if (!((life6_8 != 0))) {
        forwardValue3909_51_0 = forwardValue3909_19_0;
        forwardValue3909_51_1 = spill3909_2;
        break forward_join_51;
    }
    if (!((forwardValue3909_19_0 > spill3909_2))) {
        break forward_join_33;
    }
    p2 = __sourceIntrinsic_ed9d2369fd79_invokedynamic3909_6(2210, (8242869602733409473L ^ life4_3));
    }
    forwardValue3909_51_0 = ((((java.util.Random)(p0)).nextInt(((int)(__sourceIntrinsic_ed9d2369fd79_invokedynamic3909_7(11709, (6233533353402130907L ^ life4_3))))) + 1) + (p2 >> 1));
    forwardValue3909_51_1 = ((java.util.Random)(p0)).nextInt(((int)((p2 + 1))));
    }
    life9_60 = (forwardValue3909_51_0 + forwardValue3909_51_1);
    spill3909_3 = p1;
    if (!((life6_8 != 0))) {
        forwardValue3909_64_0 = spill3909_3;
        break forward_join_64;
    }
    if (!((spill3909_3 == 0))) {
        break forward_join_63;
    }
    forwardValue3909_81_0 = java.lang.Math.max(((int)((life9_60 / 3))), ((int)(1)));
    break forward_join_81;
    }
    forwardValue3909_64_0 = p1;
    }
    spill3909_4 = 1;
    if (!((life6_8 != 0))) {
        forwardValue3909_80_0 = forwardValue3909_64_0;
        forwardValue3909_80_1 = spill3909_4;
        break forward_join_80;
    }
    if (!((forwardValue3909_64_0 == spill3909_4))) {
        break forward_join_76;
    }
    forwardValue3909_81_0 = (((life9_60 * 2) / 3) + 1);
    break forward_join_81;
    }
    forwardValue3909_80_0 = life9_60;
    forwardValue3909_80_1 = (p2 * 2);
    }
    forwardValue3909_81_0 = java.lang.Math.max(((int)(forwardValue3909_80_0)), ((int)(forwardValue3909_80_1)));
    }
    return forwardValue3909_81_0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8945_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/rV"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.rV.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 25196;
      if (i[var3] == null) {
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
         long var5 = h[var3];
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
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/rV", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static int a(int p0, net.minecraft.item.ItemStack p1) {
net.minecraft.item.ItemStack lexicalValue1285_11_0;
    int lexicalValue1285_46_0;
    net.minecraft.item.ItemStack spill1285_0;
    int spill1285_1;
    long life2_3;
    int life4_5;
    net.minecraft.nbt.NBTTagList life5_15;
    int life6_19;
    int life7_29;
    int life8_35;
    lexical_join_46: {
    lexical_join_45: {
    lexical_join_11: {
    life2_3 = (moom.rV.g ^ 53549771494311L);
    life4_5 = ((moom.rV.b()) ? 1 : 0);
    spill1285_0 = p1;
    if (!((life4_5 != 0))) {
        lexicalValue1285_11_0 = spill1285_0;
        break lexical_join_11;
    }
    if (!((spill1285_0 != null))) {
        break lexical_join_45;
    }
    lexicalValue1285_11_0 = p1;
    }
    life5_15 = ((net.minecraft.item.ItemStack)(lexicalValue1285_11_0)).a__yz();
    if (!((life5_15 != null))) {
        break lexical_join_45;
    }
    life6_19 = 0;
    lexical_cycle_17: while (true) {
    lexical_join_43: {
    lexical_join_42: {
    if (!((life6_19 < ((net.minecraft.nbt.NBTTagList)(life5_15)).a__Int()))) {
        break lexical_join_45;
    }
    life7_29 = ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagList)(life5_15)).a__yw(((int)(life6_19))))).a__Short(((java.lang.String)("id")));
    life8_35 = ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagList)(life5_15)).a__yw(((int)(life6_19))))).a__Short(((java.lang.String)("lvl")));
    if (!((life4_5 != 0))) {
        break lexical_join_43;
    }
    spill1285_1 = life7_29;
    if (!((life4_5 != 0))) {
        lexicalValue1285_46_0 = spill1285_1;
        break lexical_join_46;
    }
    if (!((spill1285_1 == p0))) {
        break lexical_join_42;
    }
    return life8_35;
    }
    life6_19 += 1;
    }
    if (!((life4_5 == 0))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    lexicalValue1285_46_0 = 0;
    }
    return lexicalValue1285_46_0;
}


public static java.util.Map<java.lang.Integer, java.lang.Integer> a(net.minecraft.item.ItemStack p0) {
net.minecraft.item.ItemStack lexicalValue1292_19_0;
    net.minecraft.nbt.NBTTagList lexicalValue1292_20_0;
    java.util.LinkedHashMap lexicalValue1292_54_0;
    boolean spill1292_0;
    net.minecraft.item.ItemStack spill1292_1;
    java.util.LinkedHashMap spill1292_2;
    long life1_3;
    java.util.LinkedHashMap life4_6;
    int life3_7;
    net.minecraft.nbt.NBTTagList life5_25;
    int life6_29;
    int life7_39;
    int life8_45;
    lexical_join_54: {
    lexical_join_53: {
    lexical_join_20: {
    lexical_join_19: {
    lexical_join_18: {
    life1_3 = (moom.rV.g ^ 22804241105631L);
    spill1292_0 = moom.rV.b();
    life4_6 = com.google.common.collect.Maps.newLinkedHashMap();
    life3_7 = ((spill1292_0) ? 1 : 0);
    spill1292_1 = p0;
    if (!((life3_7 != 0))) {
        lexicalValue1292_19_0 = spill1292_1;
        break lexical_join_19;
    }
    if (!((((net.minecraft.item.ItemStack)(spill1292_1)).a__wQ() == net.minecraft.init.Items.bS))) {
        break lexical_join_18;
    }
    lexicalValue1292_20_0 = ((moom.xg)(net.minecraft.init.Items.bS)).a__yz(((net.minecraft.item.ItemStack)(p0)));
    break lexical_join_20;
    }
    lexicalValue1292_19_0 = p0;
    }
    lexicalValue1292_20_0 = ((net.minecraft.item.ItemStack)(lexicalValue1292_19_0)).a__yz();
    }
    life5_25 = lexicalValue1292_20_0;
    if (!((life5_25 != null))) {
        break lexical_join_53;
    }
    life6_29 = 0;
    lexical_cycle_25: while (true) {
    if (!((life6_29 < ((net.minecraft.nbt.NBTTagList)(life5_25)).a__Int()))) {
        break lexical_join_53;
    }
    life7_39 = ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagList)(life5_25)).a__yw(((int)(life6_29))))).a__Short(((java.lang.String)("id")));
    life8_45 = ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagList)(life5_25)).a__yw(((int)(life6_29))))).a__Short(((java.lang.String)("lvl")));
    spill1292_2 = life4_6;
    if (!((life3_7 != 0))) {
        lexicalValue1292_54_0 = spill1292_2;
        break lexical_join_54;
    }
    ((java.util.Map)(spill1292_2)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(life7_39))))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(life8_45))))));
    life6_29 += 1;
    if (!((life3_7 == 0))) { continue lexical_cycle_25; }
    break lexical_cycle_25;
    }
    }
    lexicalValue1292_54_0 = life4_6;
    }
    return lexicalValue1292_54_0;
}


public static float a(net.minecraft.item.ItemStack p0, net.minecraft.entity.EnumCreatureAttribute p1) {
((net.minecraft.enchantment.EnchantmentHelper$ModifierLiving)(moom.rV.c)).a = ((float)(0x0.0p0f));
    ((net.minecraft.enchantment.EnchantmentHelper$ModifierLiving)(moom.rV.c)).b = ((net.minecraft.entity.EnumCreatureAttribute)(p1));
    moom.rV.a(((net.minecraft.enchantment.EnchantmentHelper$IModifier)(moom.rV.c)), ((net.minecraft.item.ItemStack)(p0)));
    return ((net.minecraft.enchantment.EnchantmentHelper$ModifierLiving)(moom.rV.c)).a;
}


public static boolean a__Boolean(net.minecraft.entity.EntityLivingBase p0) {
int forwardValue3918_15_0;
    int forwardValue3918_17_0;
    int spill3918_0;
    long life1_3;
    int life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life1_3 = (moom.rV.g ^ 66546578070536L);
    life3_5 = ((moom.rV.b()) ? 1 : 0);
    spill3918_0 = moom.rV.a(((int)(((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.t)).C)), ((net.minecraft.item.ItemStack)(((net.minecraft.entity.EntityLivingBase)(p0)).a__xW())));
    if (!((life3_5 != 0))) {
        forwardValue3918_15_0 = spill3918_0;
        break forward_join_15;
    }
    if (!((spill3918_0 > 0))) {
        break forward_join_16;
    }
    forwardValue3918_15_0 = 1;
    }
    forwardValue3918_17_0 = forwardValue3918_15_0;
    break forward_join_17;
    }
    forwardValue3918_17_0 = 0;
    }
    return ((forwardValue3918_17_0) != 0);
}


public static int a(net.minecraft.entity.EntityLivingBase p0, int p1) {
int forwardValue3914_27_0;
    int spill3914_0;
    long life2_3;
    int life4_5;
    net.minecraft.client.entity.EntityPlayerSP life5_16;
    forward_join_27: {
    forward_join_22: {
    life2_3 = (moom.rV.g ^ 45319447190714L);
    life4_5 = ((moom.rV.c()) ? 1 : 0);
    spill3914_0 = ((p0 instanceof net.minecraft.client.entity.EntityPlayerSP) ? 1 : 0);
    if (!((life4_5 == 0))) {
        forwardValue3914_27_0 = spill3914_0;
        break forward_join_27;
    }
    if (!((spill3914_0 != 0))) {
        break forward_join_22;
    }
    life5_16 = ((net.minecraft.client.entity.EntityPlayerSP)(p0));
    return moom.rV.a(((int)(((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.s)).C)), ((net.minecraft.item.ItemStack)(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(life5_16)).bD)).a__xW(((int)(p1))))));
    }
    forwardValue3914_27_0 = moom.rV.a(((int)(((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.s)).C)), ((net.minecraft.item.ItemStack)(((net.minecraft.entity.EntityLivingBase)(p0)).a__xW())));
    }
    return forwardValue3914_27_0;
}


public static void a(net.minecraft.entity.EntityLivingBase p0, net.minecraft.entity.Entity p1) {
net.minecraft.entity.Entity forwardValue3915_21_0;
    boolean spill3915_0;
    net.minecraft.entity.EntityLivingBase spill3915_1;
    long life2_3;
    int life4_8;
    forward_join_27: {
    forward_join_21: {
    forward_join_20: {
    life2_3 = (moom.rV.g ^ 61365138218220L);
    spill3915_0 = moom.rV.c();
    ((moom.rX)(moom.rV.d)).b = ((net.minecraft.entity.Entity)(p1));
    life4_8 = ((spill3915_0) ? 1 : 0);
    ((moom.rX)(moom.rV.d)).a = ((net.minecraft.entity.EntityLivingBase)(p0));
    spill3915_1 = p0;
    if (!((life4_8 == 0))) {
        forwardValue3915_21_0 = spill3915_1;
        break forward_join_21;
    }
    if (!((spill3915_1 != null))) {
        break forward_join_20;
    }
    moom.rV.a(((net.minecraft.enchantment.EnchantmentHelper$IModifier)(moom.rV.d)), ((net.minecraft.item.ItemStack[])(((net.minecraft.entity.EntityLivingBase)(p0)).a__ArrayxW())));
    }
    forwardValue3915_21_0 = p1;
    }
    if (!((((forwardValue3915_21_0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0) != 0))) {
        break forward_join_27;
    }
    moom.rV.a(((net.minecraft.enchantment.EnchantmentHelper$IModifier)(moom.rV.d)), ((net.minecraft.item.ItemStack)(((net.minecraft.entity.EntityLivingBase)(p0)).a__xW())));
    }
    return;
}


public static int a(net.minecraft.entity.EntityLivingBase p0) {
return moom.rV.a(((int)(((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.p)).C)), ((net.minecraft.item.ItemStack)(((net.minecraft.entity.EntityLivingBase)(p0)).a__xW())));
}


public static int a(net.minecraft.entity.Entity p0) {
return moom.rV.a(((int)(((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.i)).C)), ((net.minecraft.item.ItemStack[])(((net.minecraft.entity.Entity)(p0)).a__ArrayxW())));
}


private static void a(net.minecraft.enchantment.EnchantmentHelper$IModifier p0, net.minecraft.item.ItemStack p1) {
net.minecraft.item.ItemStack lexicalValue1290_11_0;
    net.minecraft.item.ItemStack spill1290_0;
    long life2_3;
    int life4_5;
    net.minecraft.nbt.NBTTagList life5_15;
    int life6_19;
    int life7_29;
    int life8_35;
    lexical_join_46: {
    lexical_join_11: {
    life2_3 = (moom.rV.g ^ 55363398594168L);
    life4_5 = ((moom.rV.b()) ? 1 : 0);
    spill1290_0 = p1;
    if (!((life4_5 != 0))) {
        lexicalValue1290_11_0 = spill1290_0;
        break lexical_join_11;
    }
    if (!((spill1290_0 != null))) {
        break lexical_join_46;
    }
    lexicalValue1290_11_0 = p1;
    }
    life5_15 = ((net.minecraft.item.ItemStack)(lexicalValue1290_11_0)).a__yz();
    if (!((life5_15 != null))) {
        break lexical_join_46;
    }
    life6_19 = 0;
    lexical_cycle_17: while (true) {
    lexical_join_44: {
    lexical_join_43: {
    if (!((life6_19 < ((net.minecraft.nbt.NBTTagList)(life5_15)).a__Int()))) {
        break lexical_join_46;
    }
    life7_29 = ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagList)(life5_15)).a__yw(((int)(life6_19))))).a__Short(((java.lang.String)("id")));
    life8_35 = ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagList)(life5_15)).a__yw(((int)(life6_19))))).a__Short(((java.lang.String)("lvl")));
    if (!((life4_5 != 0))) {
        break lexical_join_44;
    }
    if (!((net.minecraft.enchantment.Enchantment.a__rD(((int)(life7_29))) != null))) {
        break lexical_join_43;
    }
    ((net.minecraft.enchantment.EnchantmentHelper$IModifier)(p0)).a(((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.a__rD(((int)(life7_29))))), ((int)(life8_35)));
    }
    life6_19 += 1;
    }
    if (!((life4_5 == 0))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    return;
}


public static net.minecraft.item.ItemStack a(net.minecraft.enchantment.Enchantment p0, net.minecraft.entity.EntityLivingBase p1) {
boolean spill1289_0;
    long life2_3;
    net.minecraft.item.ItemStack[] life5_6;
    int life6_10;
    int life4_11;
    int life7_13;
    net.minecraft.item.ItemStack life8_20;
    lexical_join_35: {
    life2_3 = (moom.rV.g ^ 117523221157784L);
    life5_6 = ((net.minecraft.entity.EntityLivingBase)(p1)).a__ArrayxW();
    spill1289_0 = moom.rV.b();
    life6_10 = (life5_6).length;
    life4_11 = ((spill1289_0) ? 1 : 0);
    life7_13 = 0;
    lexical_cycle_14: while (true) {
    lexical_join_33: {
    lexical_join_32: {
    if (!((life7_13 < life6_10))) {
        break lexical_join_35;
    }
    life8_20 = (life5_6)[life7_13];
    if (!((life4_11 != 0))) {
        break lexical_join_33;
    }
    if (!((life8_20 != null))) {
        break lexical_join_32;
    }
    if (!((moom.rV.a(((int)(((net.minecraft.enchantment.Enchantment)(p0)).C)), ((net.minecraft.item.ItemStack)(life8_20))) > 0))) {
        break lexical_join_32;
    }
    return life8_20;
    }
    life7_13 += 1;
    }
    if (!((life4_11 == 0))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    return null;
}


private static void a(net.minecraft.enchantment.EnchantmentHelper$IModifier p0, net.minecraft.item.ItemStack[] p1) {
boolean spill1291_0;
    long life2_3;
    net.minecraft.item.ItemStack[] life5_6;
    int life4_7;
    int life6_10;
    int life7_12;
    net.minecraft.item.ItemStack life8_19;
    lexical_join_26: {
    life2_3 = (moom.rV.g ^ 121506812644846L);
    spill1291_0 = moom.rV.b();
    life5_6 = p1;
    life4_7 = ((spill1291_0) ? 1 : 0);
    life6_10 = (life5_6).length;
    life7_12 = 0;
    lexical_cycle_13: while (true) {
    if (!((life7_12 < life6_10))) {
        break lexical_join_26;
    }
    life8_19 = (life5_6)[life7_12];
    moom.rV.a(((net.minecraft.enchantment.EnchantmentHelper$IModifier)(p0)), ((net.minecraft.item.ItemStack)(life8_19)));
    life7_12 += 1;
    if (!((life4_7 == 0))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return;
}


public static int a(net.minecraft.item.ItemStack[] p0, net.minecraft.util.DamageSource p1) {
int forwardValue3917_39_0;
    int forwardValue3917_60_0;
    boolean spill3917_0;
    int spill3917_1;
    long life2_3;
    int life4_14;
    forward_join_60: {
    forward_join_45: {
    forward_join_39: {
    forward_join_37: {
    life2_3 = (moom.rV.g ^ 140446250106680L);
    ((moom.rZ)(moom.rV.b)).a = ((int)(0));
    ((moom.rZ)(moom.rV.b)).b = ((net.minecraft.util.DamageSource)(p1));
    spill3917_0 = moom.rV.c();
    moom.rV.a(((net.minecraft.enchantment.EnchantmentHelper$IModifier)(moom.rV.b)), ((net.minecraft.item.ItemStack[])(p0)));
    life4_14 = ((spill3917_0) ? 1 : 0);
    spill3917_1 = ((moom.rZ)(moom.rV.b)).a;
    if (!((life4_14 == 0))) {
        forwardValue3917_39_0 = spill3917_1;
        break forward_join_39;
    }
    if (!((spill3917_1 > __sourceIntrinsic_64ba76eea4ba_invokedynamic3917_11(28154, (6696231051472697487L ^ life2_3))))) {
        break forward_join_37;
    }
    ((moom.rZ)(moom.rV.b)).a = ((int)(__sourceIntrinsic_64ba76eea4ba_invokedynamic3917_13(16990, (5826345847166949162L ^ life2_3))));
    if (!((life4_14 != 0))) {
        break forward_join_45;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[1])));
    }
    forwardValue3917_39_0 = ((moom.rZ)(moom.rV.b)).a;
    }
    if (!((life4_14 == 0))) {
        forwardValue3917_60_0 = forwardValue3917_39_0;
        break forward_join_60;
    }
    if (!((forwardValue3917_39_0 < 0))) {
        break forward_join_45;
    }
    ((moom.rZ)(moom.rV.b)).a = ((int)(0));
    }
    forwardValue3917_60_0 = (((((moom.rZ)(moom.rV.b)).a + 1) >> 1) + ((java.util.Random)(moom.rV.a)).nextInt(((int)(((((moom.rZ)(moom.rV.b)).a >> 1) + 1)))));
    }
    return forwardValue3917_60_0;
}


public static int g(net.minecraft.entity.EntityLivingBase p0) {
return moom.rV.a(((int)(((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.r)).C)), ((net.minecraft.item.ItemStack)(((net.minecraft.entity.EntityLivingBase)(p0)).a__xW())));
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8945_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ed9d2369fd79_invokedynamic3909_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ed9d2369fd79_invokedynamic3909_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ed9d2369fd79_invokedynamic3909_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f99fa3215514_invokedynamic935_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_64ba76eea4ba_invokedynamic3917_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_64ba76eea4ba_invokedynamic3917_13(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanToInteger(boolean value);
private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
