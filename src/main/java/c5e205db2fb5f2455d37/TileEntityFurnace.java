package net.minecraft.tileentity;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class TileEntityFurnace extends moom.Ci implements net.minecraft.util.ITickable, net.minecraft.inventory.ISidedInventory {

private static final int[] n;

private static final int[] o;

private static final int[] p;

private net.minecraft.item.ItemStack[] q;

private int r;

private int s;

private int t;

private int u;

public java.lang.String v;

private static final long w;

private static final long[] x;

private static final java.lang.Integer[] y;

private static final java.util.Map A;

public TileEntityFurnace() {
super();
    this.q = new net.minecraft.item.ItemStack[3];
}


static {
w = ((long)(((moom._a)(moom._c.a(((long)(6042846096862431957L)), ((long)(910505045506275592L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(62387614652747L)))));
    A = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.tileentity.TileEntityFurnace.w ^ 4756053229439L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1928_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1928_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1928_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1928_14 = new byte[8];
    (__sourceSpill1928_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1928_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1928_16 = __sourceSpill1928_14;
    ((javax.crypto.Cipher)(__sourceSpill1928_11)).init(((int)(__sourceSpill1928_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1928_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1928_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[13];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ké:\n»ÜÇÓ\022QB,¦\b\021Ó#¬Òò%¾5\004g{]këßWrÚ\037q\177Ï¡nRk¤\035\005Ó&9Î\034HþÙ­Äy!ä¯±±ñ\tDÞ}¥ß¹-¿\006¤ZI\013ì\032"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1928_25 = local6_life21;
        int __sourceSpill1928_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1928_25)).substring(((int)(__sourceSpill1928_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1928_30 = local8_life19;
        int __sourceSpill1928_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1928_33 = new byte[8];
        (__sourceSpill1928_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1928_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1928_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1928_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1928_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1928_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1928_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1928_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1928_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1928_34)).doFinal(((byte[])(__sourceSpill1928_33)));
        (__sourceSpill1928_30)[__sourceSpill1928_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ûÂ$¡ñ@Æ·C]3|\020"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1928_38 = local6_life21;
        int __sourceSpill1928_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1928_38)).substring(((int)(__sourceSpill1928_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1928_43 = local8_life19;
        int __sourceSpill1928_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1928_46 = new byte[8];
        (__sourceSpill1928_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1928_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1928_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1928_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1928_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1928_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1928_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1928_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1928_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1928_47)).doFinal(((byte[])(__sourceSpill1928_46)));
        (__sourceSpill1928_43)[__sourceSpill1928_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    x = ((long[])(local8_life19));
    y = ((java.lang.Integer[])(new java.lang.Integer[13]));
    int[] __sourceSpill1928_52 = new int[1];
    (__sourceSpill1928_52)[0] = 0;
    n = ((int[])(__sourceSpill1928_52));
    int[] __sourceSpill1928_54 = new int[2];
    (__sourceSpill1928_54)[0] = 2;
    (__sourceSpill1928_54)[1] = 1;
    o = ((int[])(__sourceSpill1928_54));
    int[] __sourceSpill1928_56 = new int[1];
    (__sourceSpill1928_56)[0] = 1;
    p = ((int[])(__sourceSpill1928_56));
}


private boolean i() {
net.minecraft.item.ItemStack forwardValue5705_21_0;
    net.minecraft.item.ItemStack forwardValue5705_30_0;
    net.minecraft.item.ItemStack forwardValue5705_37_0;
    int forwardValue5705_47_0;
    int forwardValue5705_74_0;
    int forwardValue5705_74_1;
    int forwardValue5705_76_0;
    int forwardValue5705_78_0;
    net.minecraft.item.ItemStack spill5705_0;
    net.minecraft.item.ItemStack spill5705_1;
    boolean spill5705_2;
    int spill5705_3;
    int spill5705_4;
    int spill5705_5;
    long life1_3;
    java.lang.String[] life3_5;
    net.minecraft.item.ItemStack life4_26;
    forward_join_78: {
    forward_join_77: {
    forward_join_76: {
    forward_join_75: {
    forward_join_74: {
    forward_join_65: {
    forward_join_47: {
    forward_join_37: {
    forward_join_30: {
    forward_join_21: {
    forward_join_15: {
    life1_3 = (net.minecraft.tileentity.TileEntityFurnace.w ^ 69040553563160L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5705_0 = (this.q)[0];
    if (!((life3_5 != null))) {
        forwardValue5705_21_0 = spill5705_0;
        break forward_join_21;
    }
    if (!((spill5705_0 == null))) {
        break forward_join_15;
    }
    return ((0) != 0);
    }
    forwardValue5705_21_0 = ((moom.xY)(moom.xY.a__xY())).a__xW(((net.minecraft.item.ItemStack)((this.q)[0])));
    }
    life4_26 = forwardValue5705_21_0;
    spill5705_1 = life4_26;
    if (!((life3_5 != null))) {
        forwardValue5705_30_0 = spill5705_1;
        break forward_join_30;
    }
    if (!((spill5705_1 != null))) {
        break forward_join_77;
    }
    forwardValue5705_30_0 = (this.q)[2];
    }
    if (!((life3_5 != null))) {
        forwardValue5705_37_0 = forwardValue5705_30_0;
        break forward_join_37;
    }
    if (!((forwardValue5705_30_0 != null))) {
        break forward_join_75;
    }
    forwardValue5705_37_0 = (this.q)[2];
    }
    spill5705_2 = ((net.minecraft.item.ItemStack)(forwardValue5705_37_0)).b(((net.minecraft.item.ItemStack)(life4_26)));
    if (!((life3_5 != null))) {
        forwardValue5705_47_0 = ((spill5705_2) ? 1 : 0);
        break forward_join_47;
    }
    if (!(spill5705_2)) {
        break forward_join_77;
    }
    forwardValue5705_47_0 = ((net.minecraft.item.ItemStack)((this.q)[2])).b;
    }
    spill5705_3 = ((net.minecraft.tileentity.TileEntityFurnace)(this)).c__Int();
    if (!((life3_5 != null))) {
        forwardValue5705_74_0 = forwardValue5705_47_0;
        forwardValue5705_74_1 = spill5705_3;
        break forward_join_74;
    }
    if (!((forwardValue5705_47_0 < spill5705_3))) {
        break forward_join_65;
    }
    spill5705_4 = ((net.minecraft.item.ItemStack)((this.q)[2])).b;
    if (!((life3_5 != null))) {
        forwardValue5705_76_0 = spill5705_4;
        break forward_join_76;
    }
    if (!((spill5705_4 >= ((net.minecraft.item.ItemStack)((this.q)[2])).a()))) {
        break forward_join_75;
    }
    }
    spill5705_5 = ((net.minecraft.item.ItemStack)((this.q)[2])).b;
    if (!((life3_5 != null))) {
        forwardValue5705_76_0 = spill5705_5;
        break forward_join_76;
    }
    forwardValue5705_74_0 = spill5705_5;
    forwardValue5705_74_1 = ((net.minecraft.item.ItemStack)(life4_26)).a();
    }
    if (!((forwardValue5705_74_0 < forwardValue5705_74_1))) {
        break forward_join_77;
    }
    }
    forwardValue5705_76_0 = 1;
    }
    forwardValue5705_78_0 = forwardValue5705_76_0;
    break forward_join_78;
    }
    forwardValue5705_78_0 = 0;
    }
    return ((forwardValue5705_78_0) != 0);
}


public void b(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.tileentity.TileEntityFurnace lexicalValue1700_74_0;
    net.minecraft.nbt.NBTTagCompound lexicalValue1700_78_0;
    java.lang.String lexicalValue1700_78_1;
    java.lang.String[] spill1700_0;
    net.minecraft.tileentity.TileEntityFurnace spill1700_1;
    net.minecraft.nbt.NBTTagCompound spill1700_2;
    java.lang.String spill1700_3;
    long life2_3;
    net.minecraft.nbt.NBTTagList life5_29;
    java.lang.String[] life4_30;
    int life6_32;
    net.minecraft.nbt.NBTTagCompound life7_51;
    lexical_join_81: {
    lexical_join_78: {
    lexical_join_74: {
    lexical_join_67: {
    life2_3 = (net.minecraft.tileentity.TileEntityFurnace.w ^ 29485402606547L);
    super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("BurnTime")), ((short)(((short) this.r))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("CookTime")), ((short)(((short) this.t))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("CookTimeTotal")), ((short)(((short) this.u))));
    spill1700_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    life5_29 = new net.minecraft.nbt.NBTTagList();
    life4_30 = spill1700_0;
    life6_32 = 0;
    lexical_cycle_33: while (true) {
    lexical_join_64: {
    if (!((life6_32 < (this.q).length))) {
        break lexical_join_67;
    }
    spill1700_1 = this;
    if (!((life4_30 != null))) {
        lexicalValue1700_74_0 = spill1700_1;
        break lexical_join_74;
    }
    if (!(((((net.minecraft.tileentity.TileEntityFurnace)(spill1700_1)).q)[life6_32] != null))) {
        break lexical_join_64;
    }
    life7_51 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.nbt.NBTTagCompound)(life7_51)).a(((java.lang.String)("Slot")), ((byte)(((byte) life6_32))));
    ((net.minecraft.item.ItemStack)((this.q)[life6_32])).a__yw(((net.minecraft.nbt.NBTTagCompound)(life7_51)));
    ((net.minecraft.nbt.NBTTagList)(life5_29)).a(((net.minecraft.nbt.NBTBase)(life7_51)));
    }
    life6_32 += 1;
    if (!((life4_30 == null))) { continue lexical_cycle_33; }
    break lexical_cycle_33;
    }
    }
    spill1700_2 = p0;
    spill1700_3 = "Items";
    if (!((life4_30 != null))) {
        lexicalValue1700_78_0 = spill1700_2;
        lexicalValue1700_78_1 = spill1700_3;
        break lexical_join_78;
    }
    ((net.minecraft.nbt.NBTTagCompound)(spill1700_2)).a(((java.lang.String)(spill1700_3)), ((net.minecraft.nbt.NBTBase)(life5_29)));
    lexicalValue1700_74_0 = this;
    }
    if (!(((net.minecraft.tileentity.TileEntityFurnace)(lexicalValue1700_74_0)).e__Boolean())) {
        break lexical_join_81;
    }
    lexicalValue1700_78_0 = p0;
    lexicalValue1700_78_1 = "CustomName";
    }
    ((net.minecraft.nbt.NBTTagCompound)(lexicalValue1700_78_0)).a(((java.lang.String)(lexicalValue1700_78_1)), ((java.lang.String)(this.v)));
    }
    return;
}


public void b__Void() {
java.util.Arrays.fill(((java.lang.Object[])(this.q)), ((java.lang.Object)(null)));
    return;
}


public int b__Int() {
return (this.q).length;
}


public static int b(net.minecraft.item.ItemStack p0) {
net.minecraft.item.ItemStack forwardValue5698_13_0;
    net.minecraft.block.Block forwardValue5698_41_0;
    net.minecraft.block.Block forwardValue5698_53_0;
    net.minecraft.item.Item forwardValue5698_62_0;
    int forwardValue5698_63_0;
    int forwardValue5698_82_0;
    int forwardValue5698_103_0;
    net.minecraft.item.Item forwardValue5698_119_0;
    net.minecraft.item.Item forwardValue5698_131_0;
    net.minecraft.item.Item forwardValue5698_131_1;
    net.minecraft.item.Item forwardValue5698_142_0;
    net.minecraft.item.Item forwardValue5698_142_1;
    net.minecraft.item.Item forwardValue5698_154_0;
    net.minecraft.item.Item forwardValue5698_154_1;
    net.minecraft.item.Item forwardValue5698_165_0;
    net.minecraft.item.Item forwardValue5698_165_1;
    int forwardValue5698_173_0;
    net.minecraft.item.ItemStack spill5698_0;
    int spill5698_1;
    net.minecraft.item.Item spill5698_2;
    net.minecraft.block.Block spill5698_3;
    boolean spill5698_4;
    boolean spill5698_5;
    net.minecraft.item.Item spill5698_6;
    moom.xw spill5698_7;
    net.minecraft.item.Item spill5698_8;
    long life1_3;
    java.lang.String[] life3_5;
    net.minecraft.item.Item life4_19;
    net.minecraft.block.Block life5_42;
    forward_join_173: {
    forward_join_172: {
    forward_join_165: {
    forward_join_163: {
    forward_join_154: {
    forward_join_151: {
    forward_join_142: {
    forward_join_140: {
    forward_join_131: {
    forward_join_129: {
    forward_join_119: {
    forward_join_118: {
    forward_join_103: {
    forward_join_99: {
    forward_join_82: {
    forward_join_80: {
    forward_join_63: {
    forward_join_62: {
    forward_join_61: {
    forward_join_53: {
    forward_join_52: {
    forward_join_41: {
    forward_join_40: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (net.minecraft.tileentity.TileEntityFurnace.w ^ 33638927902056L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5698_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue5698_13_0 = spill5698_0;
        break forward_join_13;
    }
    if (!((spill5698_0 == null))) {
        break forward_join_12;
    }
    return 0;
    }
    forwardValue5698_13_0 = p0;
    }
    life4_19 = ((net.minecraft.item.ItemStack)(forwardValue5698_13_0)).a__wQ();
    spill5698_1 = ((life4_19 instanceof moom.wU) ? 1 : 0);
    if (!((life3_5 != null))) {
        forwardValue5698_63_0 = spill5698_1;
        break forward_join_63;
    }
    if (!((spill5698_1 != 0))) {
        break forward_join_61;
    }
    spill5698_2 = life4_19;
    if (!((life3_5 != null))) {
        forwardValue5698_62_0 = spill5698_2;
        break forward_join_62;
    }
    if (!((__sourceExactCall_3c55b55d648265(((net.minecraft.item.Item)(spill5698_2))) != net.minecraft.init.Blocks.a))) {
        break forward_join_61;
    }
    life5_42 = __sourceExactCall_3c55b55d648265(((net.minecraft.item.Item)(life4_19)));
    spill5698_3 = life5_42;
    if (!((life3_5 != null))) {
        forwardValue5698_41_0 = spill5698_3;
        break forward_join_41;
    }
    if (!((spill5698_3 == net.minecraft.init.Blocks.bB))) {
        break forward_join_40;
    }
    return __sourceIntrinsic_9dbdbdfe5e0e_invokedynamic5698_8(17968, (476390369503433422L ^ life1_3));
    }
    forwardValue5698_41_0 = life5_42;
    }
    if (!((life3_5 != null))) {
        forwardValue5698_53_0 = forwardValue5698_41_0;
        break forward_join_53;
    }
    if (!((((net.minecraft.block.Block)(forwardValue5698_41_0)).a__fn() == moom.fn.d))) {
        break forward_join_52;
    }
    return __sourceIntrinsic_9dbdbdfe5e0e_invokedynamic5698_11(19256, (1861301217842814924L ^ life1_3));
    }
    forwardValue5698_53_0 = life5_42;
    }
    if (!((forwardValue5698_53_0 == net.minecraft.init.Blocks.ce))) {
        break forward_join_61;
    }
    return __sourceIntrinsic_9dbdbdfe5e0e_invokedynamic5698_13(30866, (7196156137276959849L ^ life1_3));
    }
    forwardValue5698_62_0 = life4_19;
    }
    forwardValue5698_63_0 = ((forwardValue5698_62_0 instanceof net.minecraft.item.ItemTool) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue5698_82_0 = forwardValue5698_63_0;
        break forward_join_82;
    }
    if (!((forwardValue5698_63_0 != 0))) {
        break forward_join_80;
    }
    spill5698_4 = ((java.lang.String)(((net.minecraft.item.ItemTool)(((net.minecraft.item.ItemTool)(life4_19)))).b__sourceReturn_0e30dfc966())).equals(((java.lang.Object)("WOOD")));
    if (!((life3_5 != null))) {
        forwardValue5698_82_0 = ((spill5698_4) ? 1 : 0);
        break forward_join_82;
    }
    if (!(spill5698_4)) {
        break forward_join_80;
    }
    forwardValue5698_173_0 = __sourceIntrinsic_9dbdbdfe5e0e_invokedynamic5698_19(24121, (460841914921634511L ^ life1_3));
    break forward_join_173;
    }
    forwardValue5698_82_0 = ((life4_19 instanceof moom.xP) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue5698_103_0 = forwardValue5698_82_0;
        break forward_join_103;
    }
    if (!((forwardValue5698_82_0 != 0))) {
        break forward_join_99;
    }
    spill5698_5 = ((java.lang.String)(((moom.xP)(((moom.xP)(life4_19)))).b__sourceReturn_0e30dfc966())).equals(((java.lang.Object)("WOOD")));
    if (!((life3_5 != null))) {
        forwardValue5698_103_0 = ((spill5698_5) ? 1 : 0);
        break forward_join_103;
    }
    if (!(spill5698_5)) {
        break forward_join_99;
    }
    forwardValue5698_173_0 = __sourceIntrinsic_9dbdbdfe5e0e_invokedynamic5698_25(26782, (5217940483270573155L ^ life1_3));
    break forward_join_173;
    }
    spill5698_6 = life4_19;
    if (!((life3_5 != null))) {
        forwardValue5698_119_0 = spill5698_6;
        break forward_join_119;
    }
    forwardValue5698_103_0 = ((spill5698_6 instanceof moom.xw) ? 1 : 0);
    }
    if (!((forwardValue5698_103_0 != 0))) {
        break forward_join_118;
    }
    spill5698_7 = ((moom.xw)(life4_19));
    if (!((life3_5 != null))) {
        forwardValue5698_119_0 = spill5698_7;
        break forward_join_119;
    }
    if (!(((java.lang.String)(((moom.xw)(spill5698_7)).b__sourceReturn_0e30dfc966())).equals(((java.lang.Object)("WOOD"))))) {
        break forward_join_118;
    }
    forwardValue5698_173_0 = __sourceIntrinsic_9dbdbdfe5e0e_invokedynamic5698_30(26782, (5217940483270573155L ^ life1_3));
    break forward_join_173;
    }
    forwardValue5698_119_0 = life4_19;
    }
    spill5698_8 = net.minecraft.init.Items.y;
    if (!((life3_5 != null))) {
        forwardValue5698_131_0 = forwardValue5698_119_0;
        forwardValue5698_131_1 = spill5698_8;
        break forward_join_131;
    }
    if (!((forwardValue5698_119_0 == spill5698_8))) {
        break forward_join_129;
    }
    forwardValue5698_173_0 = __sourceIntrinsic_9dbdbdfe5e0e_invokedynamic5698_32(15752, (4556326145434855794L ^ life1_3));
    break forward_join_173;
    }
    forwardValue5698_131_0 = life4_19;
    forwardValue5698_131_1 = net.minecraft.init.Items.h;
    }
    if (!((life3_5 != null))) {
        forwardValue5698_142_0 = forwardValue5698_131_0;
        forwardValue5698_142_1 = forwardValue5698_131_1;
        break forward_join_142;
    }
    if (!((forwardValue5698_131_0 == forwardValue5698_131_1))) {
        break forward_join_140;
    }
    forwardValue5698_173_0 = __sourceIntrinsic_9dbdbdfe5e0e_invokedynamic5698_34(16576, (3343738092442178615L ^ life1_3));
    break forward_join_173;
    }
    forwardValue5698_142_0 = life4_19;
    forwardValue5698_142_1 = net.minecraft.init.Items.ay;
    }
    if (!((life3_5 != null))) {
        forwardValue5698_154_0 = forwardValue5698_142_0;
        forwardValue5698_154_1 = forwardValue5698_142_1;
        break forward_join_154;
    }
    if (!((forwardValue5698_142_0 == forwardValue5698_142_1))) {
        break forward_join_151;
    }
    forwardValue5698_173_0 = __sourceIntrinsic_9dbdbdfe5e0e_invokedynamic5698_36(17899, (5904577639655559450L ^ life1_3));
    break forward_join_173;
    }
    forwardValue5698_154_0 = life4_19;
    forwardValue5698_154_1 = __sourceExactCall_42e37b9acc15b0(((net.minecraft.block.Block)(net.minecraft.init.Blocks.g)));
    }
    if (!((life3_5 != null))) {
        forwardValue5698_165_0 = forwardValue5698_154_0;
        forwardValue5698_165_1 = forwardValue5698_154_1;
        break forward_join_165;
    }
    if (!((forwardValue5698_154_0 == forwardValue5698_154_1))) {
        break forward_join_163;
    }
    forwardValue5698_173_0 = __sourceIntrinsic_9dbdbdfe5e0e_invokedynamic5698_39(5277, (6466282373309104228L ^ life1_3));
    break forward_join_173;
    }
    forwardValue5698_165_0 = life4_19;
    forwardValue5698_165_1 = net.minecraft.init.Items.bk;
    }
    if (!((forwardValue5698_165_0 == forwardValue5698_165_1))) {
        break forward_join_172;
    }
    forwardValue5698_173_0 = __sourceIntrinsic_9dbdbdfe5e0e_invokedynamic5698_41(18116, (5387749905851601468L ^ life1_3));
    break forward_join_173;
    }
    forwardValue5698_173_0 = 0;
    }
    return forwardValue5698_173_0;
}


public boolean b(int p0, net.minecraft.item.ItemStack p1, moom.bs p2) {
net.minecraft.item.Item forwardValue5697_24_0;
    net.minecraft.item.Item forwardValue5697_24_1;
    int forwardValue5697_28_0;
    int forwardValue5697_30_0;
    int spill5697_0;
    net.minecraft.item.Item spill5697_1;
    net.minecraft.item.Item spill5697_2;
    long life4_3;
    java.lang.String[] life6_5;
    net.minecraft.item.Item life7_22;
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_27: {
    forward_join_25: {
    forward_join_24: {
    life4_3 = (net.minecraft.tileentity.TileEntityFurnace.w ^ 140030581704748L);
    life6_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    if (!((p2 == moom.bs.DOWN))) {
        break forward_join_29;
    }
    spill5697_0 = p0;
    if (!((life6_5 != null))) {
        forwardValue5697_30_0 = spill5697_0;
        break forward_join_30;
    }
    if (!((spill5697_0 == 1))) {
        break forward_join_29;
    }
    life7_22 = ((net.minecraft.item.ItemStack)(p1)).a__wQ();
    spill5697_1 = life7_22;
    spill5697_2 = net.minecraft.init.Items.ax;
    if (!((life6_5 != null))) {
        forwardValue5697_24_0 = spill5697_1;
        forwardValue5697_24_1 = spill5697_2;
        break forward_join_24;
    }
    if (!((spill5697_1 != spill5697_2))) {
        break forward_join_25;
    }
    forwardValue5697_24_0 = life7_22;
    forwardValue5697_24_1 = net.minecraft.init.Items.aw;
    }
    if (!((forwardValue5697_24_0 == forwardValue5697_24_1))) {
        break forward_join_27;
    }
    }
    forwardValue5697_28_0 = 1;
    break forward_join_28;
    }
    forwardValue5697_28_0 = 0;
    }
    return ((forwardValue5697_28_0) != 0);
    }
    forwardValue5697_30_0 = 1;
    }
    return ((forwardValue5697_30_0) != 0);
}


public void b(net.minecraft.entity.player.EntityPlayer p0) {
return;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public net.minecraft.item.ItemStack b__xW(int p0) {
net.minecraft.item.ItemStack forwardValue5700_17_0;
    net.minecraft.item.ItemStack spill5700_0;
    long life2_3;
    java.lang.String[] life4_5;
    net.minecraft.item.ItemStack life5_23;
    forward_join_25: {
    forward_join_17: {
    life2_3 = (net.minecraft.tileentity.TileEntityFurnace.w ^ 105029521897061L);
    life4_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5700_0 = (this.q)[p0];
    if (!((life4_5 != null))) {
        forwardValue5700_17_0 = spill5700_0;
        break forward_join_17;
    }
    if (!((spill5700_0 != null))) {
        break forward_join_25;
    }
    forwardValue5700_17_0 = (this.q)[p0];
    }
    life5_23 = forwardValue5700_17_0;
    (this.q)[p0] = null;
    return life5_23;
    }
    return null;
}


public boolean e__Boolean() {
java.lang.String forwardValue5702_13_0;
    int forwardValue5702_18_0;
    int forwardValue5702_20_0;
    java.lang.String spill5702_0;
    int spill5702_1;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    forward_join_13: {
    life1_3 = (net.minecraft.tileentity.TileEntityFurnace.w ^ 15804187028702L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5702_0 = this.v;
    if (!((life3_5 != null))) {
        forwardValue5702_13_0 = spill5702_0;
        break forward_join_13;
    }
    if (!((spill5702_0 != null))) {
        break forward_join_19;
    }
    forwardValue5702_13_0 = this.v;
    }
    spill5702_1 = ((java.lang.String)(forwardValue5702_13_0)).length();
    if (!((life3_5 != null))) {
        forwardValue5702_18_0 = spill5702_1;
        break forward_join_18;
    }
    if (!((spill5702_1 > 0))) {
        break forward_join_19;
    }
    forwardValue5702_18_0 = 1;
    }
    forwardValue5702_20_0 = forwardValue5702_18_0;
    break forward_join_20;
    }
    forwardValue5702_20_0 = 0;
    }
    return ((forwardValue5702_20_0) != 0);
}


public void c__Void() {
int forwardValue5701_25_0;
    int forwardValue5701_49_0;
    net.minecraft.item.ItemStack[] forwardValue5701_115_0;
    int forwardValue5701_115_1;
    net.minecraft.item.ItemStack[] forwardValue5701_116_0;
    int forwardValue5701_116_1;
    net.minecraft.item.ItemStack forwardValue5701_116_2;
    net.minecraft.tileentity.TileEntityFurnace forwardValue5701_118_0;
    int forwardValue5701_121_0;
    net.minecraft.tileentity.TileEntityFurnace forwardValue5701_158_0;
    net.minecraft.tileentity.TileEntityFurnace forwardValue5701_163_0;
    int forwardValue5701_183_0;
    int forwardValue5701_187_0;
    int forwardValue5701_187_1;
    int forwardValue5701_198_0;
    java.lang.String[] spill5701_0;
    boolean spill5701_1;
    boolean spill5701_2;
    net.minecraft.tileentity.TileEntityFurnace spill5701_3;
    net.minecraft.tileentity.TileEntityFurnace spill5701_4;
    boolean spill5701_5;
    net.minecraft.tileentity.TileEntityFurnace spill5701_6;
    int spill5701_7;
    boolean spill5701_8;
    net.minecraft.tileentity.TileEntityFurnace spill5701_9;
    int spill5701_10;
    net.minecraft.item.ItemStack[] spill5701_11;
    int spill5701_12;
    net.minecraft.tileentity.TileEntityFurnace spill5701_13;
    int spill5701_14;
    int spill5701_15;
    boolean spill5701_16;
    int spill5701_17;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    int life5_10;
    net.minecraft.item.Item life6_158;
    forward_join_201: {
    forward_join_198: {
    forward_join_197: {
    forward_join_187: {
    forward_join_183: {
    forward_join_182: {
    forward_join_163: {
    forward_join_162: {
    forward_join_158: {
    forward_join_157: {
    forward_join_121: {
    forward_join_118: {
    forward_join_117: {
    forward_join_116: {
    forward_join_115: {
    forward_join_49: {
    forward_join_47: {
    forward_join_25: {
    forward_join_22: {
    life1_3 = (net.minecraft.tileentity.TileEntityFurnace.w ^ 72447916443256L);
    spill5701_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    life4_7 = ((((net.minecraft.tileentity.TileEntityFurnace)(this)).h()) ? 1 : 0);
    life3_8 = spill5701_0;
    life5_10 = 0;
    spill5701_1 = ((net.minecraft.tileentity.TileEntityFurnace)(this)).h();
    if (!((life3_8 != null))) {
        forwardValue5701_25_0 = ((spill5701_1) ? 1 : 0);
        break forward_join_25;
    }
    if (!(spill5701_1)) {
        break forward_join_22;
    }
    net.minecraft.tileentity.TileEntityFurnace __stackOp5701_6_0 = this;
    ((net.minecraft.tileentity.TileEntityFurnace)(__stackOp5701_6_0)).r = ((int)((((net.minecraft.tileentity.TileEntityFurnace)(__stackOp5701_6_0)).r - 1)));
    }
    forwardValue5701_25_0 = ((((net.minecraft.world.World)(((net.minecraft.tileentity.TileEntityFurnace)(this)).d)).G) ? 1 : 0);
    }
    if (!((life3_8 != null))) {
        forwardValue5701_198_0 = forwardValue5701_25_0;
        break forward_join_198;
    }
    if (!((forwardValue5701_25_0 == 0))) {
        break forward_join_197;
    }
    spill5701_2 = ((net.minecraft.tileentity.TileEntityFurnace)(this)).h();
    if (!((life3_8 != null))) {
        forwardValue5701_49_0 = ((spill5701_2) ? 1 : 0);
        break forward_join_49;
    }
    if (!((!spill5701_2))) {
        break forward_join_47;
    }
    spill5701_3 = this;
    if (!((life3_8 != null))) {
        forwardValue5701_163_0 = spill5701_3;
        break forward_join_163;
    }
    if (!(((((net.minecraft.tileentity.TileEntityFurnace)(spill5701_3)).q)[1] != null))) {
        break forward_join_162;
    }
    spill5701_4 = this;
    if (!((life3_8 != null))) {
        forwardValue5701_163_0 = spill5701_4;
        break forward_join_163;
    }
    if (!(((((net.minecraft.tileentity.TileEntityFurnace)(spill5701_4)).q)[0] != null))) {
        break forward_join_162;
    }
    }
    forwardValue5701_49_0 = ((((net.minecraft.tileentity.TileEntityFurnace)(this)).h()) ? 1 : 0);
    }
    if (!((life3_8 != null))) {
        forwardValue5701_121_0 = forwardValue5701_49_0;
        break forward_join_121;
    }
    if (!((forwardValue5701_49_0 == 0))) {
        break forward_join_117;
    }
    spill5701_5 = ((net.minecraft.tileentity.TileEntityFurnace)(this)).i();
    if (!((life3_8 != null))) {
        forwardValue5701_121_0 = ((spill5701_5) ? 1 : 0);
        break forward_join_121;
    }
    if (!(spill5701_5)) {
        break forward_join_117;
    }
    spill5701_6 = this;
    net.minecraft.tileentity.TileEntityFurnace __stackOp5701_22_0 = this;
    int __stackOp5701_22_1 = __sourceExactCall_5e8d77093c4f64(((net.minecraft.item.ItemStack)((this.q)[1])));
    spill5701_7 = __stackOp5701_22_1;
    ((net.minecraft.tileentity.TileEntityFurnace)(__stackOp5701_22_0)).r = ((int)(__stackOp5701_22_1));
    ((net.minecraft.tileentity.TileEntityFurnace)(spill5701_6)).s = ((int)(spill5701_7));
    spill5701_8 = ((net.minecraft.tileentity.TileEntityFurnace)(this)).h();
    if (!((life3_8 != null))) {
        forwardValue5701_121_0 = ((spill5701_8) ? 1 : 0);
        break forward_join_121;
    }
    if (!(spill5701_8)) {
        break forward_join_117;
    }
    life5_10 = 1;
    spill5701_9 = this;
    if (!((life3_8 != null))) {
        forwardValue5701_118_0 = spill5701_9;
        break forward_join_118;
    }
    if (!(((((net.minecraft.tileentity.TileEntityFurnace)(spill5701_9)).q)[1] != null))) {
        break forward_join_117;
    }
    net.minecraft.item.ItemStack __stackOp5701_29_0 = (this.q)[1];
    ((net.minecraft.item.ItemStack)(__stackOp5701_29_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp5701_29_0)).b - 1)));
    spill5701_10 = ((net.minecraft.item.ItemStack)((this.q)[1])).b;
    if (!((life3_8 != null))) {
        forwardValue5701_121_0 = spill5701_10;
        break forward_join_121;
    }
    if (!((spill5701_10 == 0))) {
        break forward_join_117;
    }
    life6_158 = ((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)((this.q)[1])).a__wQ())).b__wQ();
    spill5701_11 = this.q;
    spill5701_12 = 1;
    if (!((life6_158 != null))) {
        forwardValue5701_115_0 = spill5701_11;
        forwardValue5701_115_1 = spill5701_12;
        break forward_join_115;
    }
    forwardValue5701_116_0 = spill5701_11;
    forwardValue5701_116_1 = spill5701_12;
    forwardValue5701_116_2 = new net.minecraft.item.ItemStack(life6_158);
    break forward_join_116;
    }
    forwardValue5701_116_0 = forwardValue5701_115_0;
    forwardValue5701_116_1 = forwardValue5701_115_1;
    forwardValue5701_116_2 = null;
    }
    (forwardValue5701_116_0)[forwardValue5701_116_1] = forwardValue5701_116_2;
    }
    forwardValue5701_118_0 = this;
    }
    if (!((life3_8 != null))) {
        forwardValue5701_158_0 = forwardValue5701_118_0;
        break forward_join_158;
    }
    forwardValue5701_121_0 = ((((net.minecraft.tileentity.TileEntityFurnace)(forwardValue5701_118_0)).h()) ? 1 : 0);
    }
    if (!((forwardValue5701_121_0 != 0))) {
        break forward_join_157;
    }
    spill5701_13 = this;
    if (!((life3_8 != null))) {
        forwardValue5701_158_0 = spill5701_13;
        break forward_join_158;
    }
    if (!(((net.minecraft.tileentity.TileEntityFurnace)(spill5701_13)).i())) {
        break forward_join_157;
    }
    net.minecraft.tileentity.TileEntityFurnace __stackOp5701_41_0 = this;
    ((net.minecraft.tileentity.TileEntityFurnace)(__stackOp5701_41_0)).t = ((int)((((net.minecraft.tileentity.TileEntityFurnace)(__stackOp5701_41_0)).t + 1)));
    spill5701_14 = this.t;
    spill5701_15 = this.u;
    if (!((life3_8 != null))) {
        forwardValue5701_187_0 = spill5701_14;
        forwardValue5701_187_1 = spill5701_15;
        break forward_join_187;
    }
    if (!((spill5701_14 == spill5701_15))) {
        break forward_join_182;
    }
    this.t = ((int)(0));
    this.u = ((int)(((net.minecraft.tileentity.TileEntityFurnace)(this)).a(((net.minecraft.item.ItemStack)((this.q)[0])))));
    ((net.minecraft.tileentity.TileEntityFurnace)(this)).g__sourceReturn_da8c82d5d4();
    life5_10 = 1;
    if (!((life3_8 == null))) {
        break forward_join_182;
    }
    }
    forwardValue5701_158_0 = this;
    }
    ((net.minecraft.tileentity.TileEntityFurnace)(forwardValue5701_158_0)).t = ((int)(0));
    if (!((life3_8 == null))) {
        break forward_join_182;
    }
    }
    forwardValue5701_163_0 = this;
    }
    spill5701_16 = ((net.minecraft.tileentity.TileEntityFurnace)(forwardValue5701_163_0)).h();
    if (!((life3_8 != null))) {
        forwardValue5701_183_0 = ((spill5701_16) ? 1 : 0);
        break forward_join_183;
    }
    if (!((!spill5701_16))) {
        break forward_join_182;
    }
    spill5701_17 = this.t;
    if (!((life3_8 != null))) {
        forwardValue5701_183_0 = spill5701_17;
        break forward_join_183;
    }
    if (!((spill5701_17 > 0))) {
        break forward_join_182;
    }
    this.t = ((int)(moom.Dr.a(((int)((this.t - 2))), ((int)(0)), ((int)(this.u)))));
    }
    forwardValue5701_183_0 = life4_7;
    }
    if (!((life3_8 != null))) {
        forwardValue5701_198_0 = forwardValue5701_183_0;
        break forward_join_198;
    }
    forwardValue5701_187_0 = forwardValue5701_183_0;
    forwardValue5701_187_1 = ((((net.minecraft.tileentity.TileEntityFurnace)(this)).h()) ? 1 : 0);
    }
    if (!((forwardValue5701_187_0 != forwardValue5701_187_1))) {
        break forward_join_197;
    }
    life5_10 = 1;
    __sourceExactCall_c5e23a6fae1216(((boolean)(((net.minecraft.tileentity.TileEntityFurnace)(this)).h())), ((net.minecraft.world.World)(((net.minecraft.tileentity.TileEntityFurnace)(this)).d)), ((moom.DT)(((net.minecraft.tileentity.TileEntityFurnace)(this)).e)));
    }
    forwardValue5701_198_0 = life5_10;
    }
    if (!((forwardValue5701_198_0 != 0))) {
        break forward_join_201;
    }
    ((net.minecraft.tileentity.TileEntityFurnace)(this)).a__Void();
    }
    return;
}


public void c__sourceReturn_aecb585720(net.minecraft.entity.player.EntityPlayer p0) {
return;
}


public java.lang.String c__String() {
return "minecraft:furnace";
}


public int c__Int() {
long local1 = (net.minecraft.tileentity.TileEntityFurnace.w ^ 29254902533965L);
    return __sourceIntrinsic_240e736e888e_originalDynamicSite2046_1(2730, (7808208549747553395L ^ local1));
}


public boolean h() {
int forwardValue5704_12_0;
    int forwardValue5704_14_0;
    int spill5704_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (net.minecraft.tileentity.TileEntityFurnace.w ^ 71741804858531L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5704_0 = this.r;
    if (!((life3_5 != null))) {
        forwardValue5704_12_0 = spill5704_0;
        break forward_join_12;
    }
    if (!((spill5704_0 > 0))) {
        break forward_join_13;
    }
    forwardValue5704_12_0 = 1;
    }
    forwardValue5704_14_0 = forwardValue5704_12_0;
    break forward_join_14;
    }
    forwardValue5704_14_0 = 0;
    }
    return ((forwardValue5704_14_0) != 0);
}


public int d__Int() {
return 4;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 23343;
      if (y[var3] == null) {
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
         long var5 = x[var3];
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
         Object[] var9 = (Object[])A.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               A.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/Co", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         y[var3] = var15;
      }

      return y[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_a17b884f543805(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12305_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Co"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a(int p0, net.minecraft.item.ItemStack p1, moom.bs p2) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.tileentity.TileEntityFurnace)(this)).a__Boolean(((int)(p0)), ((net.minecraft.item.ItemStack)(p1))))) != 0);
}


public void a__Void(int p0, int p1) {
long life3_3;
    java.lang.String[] life5_5;
    forward_join_28: {
    forward_join_25: {
    forward_join_20: {
    forward_join_15: {
    forward_join_13: {
    forward_join_10: {
    life3_3 = (net.minecraft.tileentity.TileEntityFurnace.w ^ 73671967361684L);
    life5_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    if (!((life5_5 != null))) {
        break forward_join_13;
    }
    switch (p0) {
case 0:
{
        break forward_join_10;
    }
case 1:
{
        break forward_join_15;
    }
case 2:
{
        break forward_join_20;
    }
case 3:
{
        break forward_join_25;
    }
default:
{
        break forward_join_28;
    }
}
    }
    this.r = ((int)(p1));
    }
    if (!((life5_5 == null))) {
        break forward_join_28;
    }
    }
    this.s = ((int)(p1));
    if (!((life5_5 == null))) {
        break forward_join_28;
    }
    }
    this.t = ((int)(p1));
    if (!((life5_5 == null))) {
        break forward_join_28;
    }
    }
    this.u = ((int)(p1));
    }
    return;
}


public moom.v8 a(net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.entity.player.EntityPlayer p1) {
return new moom.wf(p0, this);
}


public int a__sourceReturn_0f7a48eca2(int p0) {
int forwardValue578_23_0;
    int spill578_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_19: {
    forward_join_16: {
    forward_join_13: {
    forward_join_10: {
    life2_3 = (net.minecraft.tileentity.TileEntityFurnace.w ^ 102310034648979L);
    life4_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill578_0 = p0;
    if (!((life4_5 != null))) {
        forwardValue578_23_0 = spill578_0;
        break forward_join_23;
    }
    switch (spill578_0) {
case 0:
{
        break forward_join_10;
    }
case 1:
{
        break forward_join_13;
    }
case 2:
{
        break forward_join_16;
    }
case 3:
{
        break forward_join_19;
    }
default:
{
        break forward_join_22;
    }
}
    }
    return this.r;
    }
    return this.s;
    }
    return this.t;
    }
    return this.u;
    }
    forwardValue578_23_0 = 0;
    }
    return forwardValue578_23_0;
}


public java.lang.String a__String() {
net.minecraft.tileentity.TileEntityFurnace forwardValue5693_12_0;
    java.lang.String forwardValue5693_15_0;
    net.minecraft.tileentity.TileEntityFurnace spill5693_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_12: {
    life1_3 = (net.minecraft.tileentity.TileEntityFurnace.w ^ 74964489970624L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5693_0 = this;
    if (!((life3_5 != null))) {
        forwardValue5693_12_0 = spill5693_0;
        break forward_join_12;
    }
    if (!(((net.minecraft.tileentity.TileEntityFurnace)(spill5693_0)).e__Boolean())) {
        break forward_join_14;
    }
    forwardValue5693_12_0 = this;
    }
    forwardValue5693_15_0 = ((net.minecraft.tileentity.TileEntityFurnace)(forwardValue5693_12_0)).v;
    break forward_join_15;
    }
    forwardValue5693_15_0 = "container.furnace";
    }
    return forwardValue5693_15_0;
}


public void a(java.lang.String p0) {
this.v = ((java.lang.String)(p0));
    return;
}


public void a__Void(net.minecraft.nbt.NBTTagCompound p0) {
int lexicalValue1699_89_0;
    net.minecraft.tileentity.TileEntityFurnace lexicalValue1699_91_0;
    java.lang.String[] spill1699_0;
    int spill1699_1;
    net.minecraft.tileentity.TileEntityFurnace spill1699_2;
    long life2_3;
    net.minecraft.nbt.NBTTagList life5_16;
    int life6_23;
    java.lang.String[] life4_24;
    net.minecraft.nbt.NBTTagCompound life7_32;
    int life8_36;
    lexical_join_100: {
    lexical_join_95: {
    lexical_join_91: {
    lexical_join_89: {
    lexical_join_57: {
    life2_3 = (net.minecraft.tileentity.TileEntityFurnace.w ^ 136260643392210L);
    spill1699_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    super.a__Void(((net.minecraft.nbt.NBTTagCompound)(p0)));
    life5_16 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Items")), ((int)(__sourceIntrinsic_03d9340fa09f_invokedynamic1699_3(30795, (5597282305869792004L ^ life2_3)))));
    this.q = ((net.minecraft.item.ItemStack[])(new net.minecraft.item.ItemStack[((net.minecraft.tileentity.TileEntityFurnace)(this)).b__Int()]));
    life6_23 = 0;
    life4_24 = spill1699_0;
    lexical_cycle_25: while (true) {
    lexical_join_55: {
    lexical_join_54: {
    if (!((life6_23 < ((net.minecraft.nbt.NBTTagList)(life5_16)).a__Int()))) {
        break lexical_join_57;
    }
    life7_32 = ((net.minecraft.nbt.NBTTagList)(life5_16)).a__yw(((int)(life6_23)));
    life8_36 = ((net.minecraft.nbt.NBTTagCompound)(life7_32)).b__sourceReturn_d4c7a9581c(((java.lang.String)("Slot")));
    if (!((life4_24 != null))) {
        break lexical_join_55;
    }
    spill1699_1 = life8_36;
    if (!((life4_24 != null))) {
        lexicalValue1699_89_0 = spill1699_1;
        break lexical_join_89;
    }
    if (!((spill1699_1 >= 0))) {
        break lexical_join_54;
    }
    if (!((life8_36 < (this.q).length))) {
        break lexical_join_54;
    }
    (this.q)[life8_36] = __sourceExactCall_b20cc06766c170(((net.minecraft.nbt.NBTTagCompound)(life7_32)));
    }
    life6_23 += 1;
    }
    if (!((life4_24 == null))) { continue lexical_cycle_25; }
    break lexical_cycle_25;
    }
    }
    this.r = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("BurnTime")))));
    this.t = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("CookTime")))));
    this.u = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("CookTimeTotal")))));
    spill1699_2 = this;
    if (!((life4_24 != null))) {
        lexicalValue1699_91_0 = spill1699_2;
        break lexical_join_91;
    }
    ((net.minecraft.tileentity.TileEntityFurnace)(spill1699_2)).s = ((int)(__sourceExactCall_5e8d77093c4f64(((net.minecraft.item.ItemStack)((this.q)[1])))));
    lexicalValue1699_89_0 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("CustomName")), ((int)(__sourceIntrinsic_03d9340fa09f_invokedynamic1699_22(31802, (8353629135508522879L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((lexicalValue1699_89_0 != 0))) {
        break lexical_join_95;
    }
    lexicalValue1699_91_0 = this;
    }
    ((net.minecraft.tileentity.TileEntityFurnace)(lexicalValue1699_91_0)).v = ((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__String(((java.lang.String)("CustomName")))));
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break lexical_join_100;
    }
    __sourceExactCall_c2d48c82bb6044(((java.lang.String[])(new java.lang.String[2])));
    }
    return;
}


public static boolean a(net.minecraft.inventory.IInventory p0) {
int forwardValue5690_13_0;
    int forwardValue5690_15_0;
    int spill5690_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (net.minecraft.tileentity.TileEntityFurnace.w ^ 44615365487404L);
    life3_5 = __sourceExactCall_784dec7dc59254();
    spill5690_0 = __sourceExactCall_cdf7df5ac5b665(((net.minecraft.inventory.IInventory)(p0)), ((int)(0)));
    if (!((life3_5 != null))) {
        forwardValue5690_13_0 = spill5690_0;
        break forward_join_13;
    }
    if (!((spill5690_0 > 0))) {
        break forward_join_14;
    }
    forwardValue5690_13_0 = 1;
    }
    forwardValue5690_15_0 = forwardValue5690_13_0;
    break forward_join_15;
    }
    forwardValue5690_15_0 = 0;
    }
    return ((forwardValue5690_15_0) != 0);
}


public void a__Void(int p0, net.minecraft.item.ItemStack p1) {
net.minecraft.item.ItemStack forwardValue5695_11_0;
    int forwardValue5695_25_0;
    int forwardValue5695_29_0;
    int forwardValue5695_31_0;
    net.minecraft.item.ItemStack forwardValue5695_42_0;
    int forwardValue5695_53_0;
    int forwardValue5695_57_0;
    net.minecraft.item.ItemStack spill5695_0;
    boolean spill5695_1;
    net.minecraft.item.ItemStack spill5695_2;
    int spill5695_3;
    long life3_3;
    java.lang.String[] life5_5;
    int life6_43;
    forward_join_68: {
    forward_join_57: {
    forward_join_53: {
    forward_join_52: {
    forward_join_42: {
    forward_join_31: {
    forward_join_30: {
    forward_join_29: {
    forward_join_25: {
    forward_join_11: {
    life3_3 = (net.minecraft.tileentity.TileEntityFurnace.w ^ 29000038866718L);
    life5_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5695_0 = p1;
    if (!((life5_5 != null))) {
        forwardValue5695_11_0 = spill5695_0;
        break forward_join_11;
    }
    if (!((spill5695_0 != null))) {
        break forward_join_30;
    }
    forwardValue5695_11_0 = p1;
    }
    spill5695_1 = ((net.minecraft.item.ItemStack)(forwardValue5695_11_0)).b(((net.minecraft.item.ItemStack)((this.q)[p0])));
    if (!((life5_5 != null))) {
        forwardValue5695_25_0 = ((spill5695_1) ? 1 : 0);
        break forward_join_25;
    }
    if (!(spill5695_1)) {
        break forward_join_30;
    }
    forwardValue5695_25_0 = ((__sourceExactCall_89d668202ff0ca(((net.minecraft.item.ItemStack)(p1)), ((net.minecraft.item.ItemStack)((this.q)[p0])))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue5695_29_0 = forwardValue5695_25_0;
        break forward_join_29;
    }
    if (!((forwardValue5695_25_0 != 0))) {
        break forward_join_30;
    }
    forwardValue5695_29_0 = 1;
    }
    forwardValue5695_31_0 = forwardValue5695_29_0;
    break forward_join_31;
    }
    forwardValue5695_31_0 = 0;
    }
    life6_43 = forwardValue5695_31_0;
    (this.q)[p0] = p1;
    spill5695_2 = p1;
    if (!((life5_5 != null))) {
        forwardValue5695_42_0 = spill5695_2;
        break forward_join_42;
    }
    if (!((spill5695_2 != null))) {
        break forward_join_52;
    }
    forwardValue5695_42_0 = p1;
    }
    spill5695_3 = ((net.minecraft.item.ItemStack)(forwardValue5695_42_0)).b;
    if (!((life5_5 != null))) {
        forwardValue5695_53_0 = spill5695_3;
        break forward_join_53;
    }
    if (!((spill5695_3 > ((net.minecraft.tileentity.TileEntityFurnace)(this)).c__Int()))) {
        break forward_join_52;
    }
    ((net.minecraft.item.ItemStack)(p1)).b = ((int)(((net.minecraft.tileentity.TileEntityFurnace)(this)).c__Int()));
    }
    forwardValue5695_53_0 = p0;
    }
    if (!((life5_5 != null))) {
        forwardValue5695_57_0 = forwardValue5695_53_0;
        break forward_join_57;
    }
    if (!((forwardValue5695_53_0 == 0))) {
        break forward_join_68;
    }
    forwardValue5695_57_0 = life6_43;
    }
    if (!((forwardValue5695_57_0 == 0))) {
        break forward_join_68;
    }
    this.u = ((int)(((net.minecraft.tileentity.TileEntityFurnace)(this)).a(((net.minecraft.item.ItemStack)(p1)))));
    this.t = ((int)(0));
    ((net.minecraft.tileentity.TileEntityFurnace)(this)).a__Void();
    }
    return;
}


public net.minecraft.item.ItemStack a(int p0, int p1) {
net.minecraft.item.ItemStack forwardValue5687_17_0;
    net.minecraft.item.ItemStack forwardValue5687_40_0;
    net.minecraft.item.ItemStack forwardValue5687_55_0;
    net.minecraft.item.ItemStack spill5687_0;
    net.minecraft.item.ItemStack spill5687_1;
    long life3_3;
    java.lang.String[] life5_5;
    net.minecraft.item.ItemStack life6_35;
    net.minecraft.item.ItemStack life6_49;
    forward_join_56: {
    forward_join_55: {
    forward_join_54: {
    forward_join_40: {
    forward_join_34: {
    forward_join_17: {
    life3_3 = (net.minecraft.tileentity.TileEntityFurnace.w ^ 60720998184749L);
    life5_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5687_0 = (this.q)[p0];
    if (!((life5_5 != null))) {
        forwardValue5687_17_0 = spill5687_0;
        break forward_join_17;
    }
    if (!((spill5687_0 != null))) {
        break forward_join_56;
    }
    forwardValue5687_17_0 = (this.q)[p0];
    }
    if (!((life5_5 != null))) {
        forwardValue5687_40_0 = forwardValue5687_17_0;
        break forward_join_40;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue5687_17_0)).b <= p1))) {
        break forward_join_34;
    }
    life6_35 = (this.q)[p0];
    (this.q)[p0] = null;
    return life6_35;
    }
    forwardValue5687_40_0 = ((net.minecraft.item.ItemStack)((this.q)[p0])).a(((int)(p1)));
    }
    life6_49 = forwardValue5687_40_0;
    spill5687_1 = (this.q)[p0];
    if (!((life5_5 != null))) {
        forwardValue5687_55_0 = spill5687_1;
        break forward_join_55;
    }
    if (!((((net.minecraft.item.ItemStack)(spill5687_1)).b == 0))) {
        break forward_join_54;
    }
    (this.q)[p0] = null;
    }
    forwardValue5687_55_0 = life6_49;
    }
    return forwardValue5687_55_0;
    }
    return null;
}


public net.minecraft.item.ItemStack a__xW(int p0) {
return (this.q)[p0];
}


public int[] a(moom.bs p0) {
moom.bs forwardValue5688_15_0;
    moom.bs forwardValue5688_15_1;
    int[] forwardValue5688_19_0;
    moom.bs spill5688_0;
    moom.bs spill5688_1;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (net.minecraft.tileentity.TileEntityFurnace.w ^ 24464585057120L);
    life4_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5688_0 = p0;
    spill5688_1 = moom.bs.DOWN;
    if (!((life4_5 != null))) {
        forwardValue5688_15_0 = spill5688_0;
        forwardValue5688_15_1 = spill5688_1;
        break forward_join_15;
    }
    if (!((spill5688_0 == spill5688_1))) {
        break forward_join_13;
    }
    forwardValue5688_19_0 = net.minecraft.tileentity.TileEntityFurnace.o;
    break forward_join_19;
    }
    forwardValue5688_15_0 = p0;
    forwardValue5688_15_1 = moom.bs.UP;
    }
    if (!((forwardValue5688_15_0 == forwardValue5688_15_1))) {
        break forward_join_18;
    }
    forwardValue5688_19_0 = net.minecraft.tileentity.TileEntityFurnace.n;
    break forward_join_19;
    }
    forwardValue5688_19_0 = net.minecraft.tileentity.TileEntityFurnace.p;
    }
    return forwardValue5688_19_0;
}


public boolean a__Boolean(int p0, net.minecraft.item.ItemStack p1) {
int forwardValue5691_15_0;
    int forwardValue5691_15_1;
    int forwardValue5691_27_0;
    int forwardValue5691_29_0;
    int spill5691_0;
    int spill5691_1;
    int spill5691_2;
    boolean spill5691_3;
    boolean spill5691_4;
    long life3_3;
    java.lang.String[] life5_5;
    forward_join_29: {
    forward_join_28: {
    forward_join_27: {
    forward_join_26: {
    forward_join_15: {
    life3_3 = (net.minecraft.tileentity.TileEntityFurnace.w ^ 133403177252087L);
    life5_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5691_0 = p0;
    spill5691_1 = 2;
    if (!((life5_5 != null))) {
        forwardValue5691_15_0 = spill5691_0;
        forwardValue5691_15_1 = spill5691_1;
        break forward_join_15;
    }
    if (!((spill5691_0 != spill5691_1))) {
        break forward_join_28;
    }
    spill5691_2 = p0;
    if (!((life5_5 != null))) {
        forwardValue5691_27_0 = spill5691_2;
        break forward_join_27;
    }
    forwardValue5691_15_0 = spill5691_2;
    forwardValue5691_15_1 = 1;
    }
    if (!((forwardValue5691_15_0 == forwardValue5691_15_1))) {
        break forward_join_26;
    }
    spill5691_3 = net.minecraft.tileentity.TileEntityFurnace.a__Boolean(((net.minecraft.item.ItemStack)(p1)));
    if (!((life5_5 != null))) {
        forwardValue5691_27_0 = ((spill5691_3) ? 1 : 0);
        break forward_join_27;
    }
    if (!((!spill5691_3))) {
        break forward_join_26;
    }
    spill5691_4 = __sourceExactCall_495c934b8653bf(((net.minecraft.item.ItemStack)(p1)));
    if (!((life5_5 != null))) {
        forwardValue5691_27_0 = ((spill5691_4) ? 1 : 0);
        break forward_join_27;
    }
    if (!(spill5691_4)) {
        break forward_join_28;
    }
    }
    forwardValue5691_27_0 = 1;
    }
    forwardValue5691_29_0 = forwardValue5691_27_0;
    break forward_join_29;
    }
    forwardValue5691_29_0 = 0;
    }
    return ((forwardValue5691_29_0) != 0);
}


public boolean a(net.minecraft.entity.player.EntityPlayer p0) {
int forwardValue5689_39_0;
    int forwardValue5689_41_0;
    int spill5689_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_41: {
    forward_join_40: {
    forward_join_39: {
    life2_3 = (net.minecraft.tileentity.TileEntityFurnace.w ^ 110084728952209L);
    life4_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    if (!((((net.minecraft.world.World)(((net.minecraft.tileentity.TileEntityFurnace)(this)).d)).a__B9(((moom.DT)(((net.minecraft.tileentity.TileEntityFurnace)(this)).e))) == this))) {
        break forward_join_40;
    }
    spill5689_0 = recovery.source.CarrierOps.dcmpg(((double)(((net.minecraft.entity.player.EntityPlayer)(p0)).a(((double)((((double) ((moom.DT)(((net.minecraft.tileentity.TileEntityFurnace)(this)).e)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(((net.minecraft.tileentity.TileEntityFurnace)(this)).e)).b()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(((net.minecraft.tileentity.TileEntityFurnace)(this)).e)).c()) + 0x1.0p-1d)))))), ((double)(0x1.0p6d)));
    if (!((life4_5 != null))) {
        forwardValue5689_39_0 = spill5689_0;
        break forward_join_39;
    }
    if (!((spill5689_0 <= 0))) {
        break forward_join_40;
    }
    forwardValue5689_39_0 = 1;
    }
    forwardValue5689_41_0 = forwardValue5689_39_0;
    break forward_join_41;
    }
    forwardValue5689_41_0 = 0;
    }
    return ((forwardValue5689_41_0) != 0);
}


public static boolean a__Boolean(net.minecraft.item.ItemStack p0) {
int forwardValue5692_12_0;
    int forwardValue5692_14_0;
    int spill5692_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (net.minecraft.tileentity.TileEntityFurnace.w ^ 71562307656801L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5692_0 = __sourceExactCall_5e8d77093c4f64(((net.minecraft.item.ItemStack)(p0)));
    if (!((life3_5 != null))) {
        forwardValue5692_12_0 = spill5692_0;
        break forward_join_12;
    }
    if (!((spill5692_0 > 0))) {
        break forward_join_13;
    }
    forwardValue5692_12_0 = 1;
    }
    forwardValue5692_14_0 = forwardValue5692_12_0;
    break forward_join_14;
    }
    forwardValue5692_14_0 = 0;
    }
    return ((forwardValue5692_14_0) != 0);
}


public int a(net.minecraft.item.ItemStack p0) {
long local2 = (net.minecraft.tileentity.TileEntityFurnace.w ^ 8761253926127L);
    return __sourceIntrinsic_73d4db24f1d1_originalDynamicSite2047_1(26782, (5217913121222184420L ^ local2));
}


public void g__sourceReturn_da8c82d5d4() {
net.minecraft.item.ItemStack forwardValue5703_35_0;
    net.minecraft.item.Item forwardValue5703_59_0;
    net.minecraft.item.Item forwardValue5703_59_1;
    net.minecraft.item.ItemStack forwardValue5703_108_0;
    int forwardValue5703_109_0;
    net.minecraft.item.ItemStack[] forwardValue5703_113_0;
    int forwardValue5703_113_1;
    net.minecraft.item.ItemStack spill5703_0;
    net.minecraft.item.Item spill5703_1;
    net.minecraft.item.Item spill5703_2;
    net.minecraft.item.ItemStack spill5703_3;
    int spill5703_4;
    net.minecraft.item.ItemStack spill5703_5;
    net.minecraft.item.ItemStack spill5703_6;
    net.minecraft.item.ItemStack[] spill5703_7;
    int spill5703_8;
    long life1_3;
    java.lang.String[] life3_5;
    net.minecraft.item.ItemStack life4_15;
    forward_join_115: {
    forward_join_113: {
    forward_join_109: {
    forward_join_108: {
    forward_join_93: {
    forward_join_59: {
    forward_join_50: {
    forward_join_35: {
    forward_join_31: {
    life1_3 = (net.minecraft.tileentity.TileEntityFurnace.w ^ 117116011479997L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    if (!(((net.minecraft.tileentity.TileEntityFurnace)(this)).i())) {
        break forward_join_115;
    }
    life4_15 = ((moom.xY)(moom.xY.a__xY())).a__xW(((net.minecraft.item.ItemStack)((this.q)[0])));
    spill5703_0 = (this.q)[2];
    if (!((life3_5 != null))) {
        forwardValue5703_35_0 = spill5703_0;
        break forward_join_35;
    }
    if (!((spill5703_0 == null))) {
        break forward_join_31;
    }
    (this.q)[2] = ((net.minecraft.item.ItemStack)(life4_15)).a__xW();
    if (!((life3_5 == null))) {
        break forward_join_50;
    }
    }
    forwardValue5703_35_0 = (this.q)[2];
    }
    spill5703_1 = ((net.minecraft.item.ItemStack)(forwardValue5703_35_0)).a__wQ();
    spill5703_2 = ((net.minecraft.item.ItemStack)(life4_15)).a__wQ();
    if (!((life3_5 != null))) {
        forwardValue5703_59_0 = spill5703_1;
        forwardValue5703_59_1 = spill5703_2;
        break forward_join_59;
    }
    if (!((spill5703_1 == spill5703_2))) {
        break forward_join_50;
    }
    net.minecraft.item.ItemStack __stackOp5703_13_0 = (this.q)[2];
    ((net.minecraft.item.ItemStack)(__stackOp5703_13_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp5703_13_0)).b + 1)));
    }
    spill5703_3 = (this.q)[0];
    if (!((life3_5 != null))) {
        forwardValue5703_108_0 = spill5703_3;
        break forward_join_108;
    }
    forwardValue5703_59_0 = ((net.minecraft.item.ItemStack)(spill5703_3)).a__wQ();
    forwardValue5703_59_1 = __sourceExactCall_42e37b9acc15b0(((net.minecraft.block.Block)(net.minecraft.init.Blocks.v)));
    }
    if (!((forwardValue5703_59_0 == forwardValue5703_59_1))) {
        break forward_join_93;
    }
    spill5703_4 = ((net.minecraft.item.ItemStack)((this.q)[0])).c();
    if (!((life3_5 != null))) {
        forwardValue5703_109_0 = spill5703_4;
        break forward_join_109;
    }
    if (!((spill5703_4 == 1))) {
        break forward_join_93;
    }
    spill5703_5 = (this.q)[1];
    if (!((life3_5 != null))) {
        forwardValue5703_108_0 = spill5703_5;
        break forward_join_108;
    }
    if (!((spill5703_5 != null))) {
        break forward_join_93;
    }
    spill5703_6 = (this.q)[1];
    if (!((life3_5 != null))) {
        forwardValue5703_108_0 = spill5703_6;
        break forward_join_108;
    }
    if (!((((net.minecraft.item.ItemStack)(spill5703_6)).a__wQ() == net.minecraft.init.Items.aw))) {
        break forward_join_93;
    }
    (this.q)[1] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.ax);
    }
    net.minecraft.item.ItemStack __stackOp5703_29_0 = (this.q)[0];
    ((net.minecraft.item.ItemStack)(__stackOp5703_29_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp5703_29_0)).b - 1)));
    spill5703_7 = this.q;
    spill5703_8 = 0;
    if (!((life3_5 != null))) {
        forwardValue5703_113_0 = spill5703_7;
        forwardValue5703_113_1 = spill5703_8;
        break forward_join_113;
    }
    forwardValue5703_108_0 = (spill5703_7)[spill5703_8];
    }
    forwardValue5703_109_0 = ((net.minecraft.item.ItemStack)(forwardValue5703_108_0)).b;
    }
    if (!((forwardValue5703_109_0 <= 0))) {
        break forward_join_115;
    }
    forwardValue5703_113_0 = this.q;
    forwardValue5703_113_1 = 0;
    }
    (forwardValue5703_113_0)[forwardValue5703_113_1] = null;
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12305_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_73d4db24f1d1_originalDynamicSite2047_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_03d9340fa09f_invokedynamic1699_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_03d9340fa09f_invokedynamic1699_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9dbdbdfe5e0e_invokedynamic5698_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9dbdbdfe5e0e_invokedynamic5698_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9dbdbdfe5e0e_invokedynamic5698_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9dbdbdfe5e0e_invokedynamic5698_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9dbdbdfe5e0e_invokedynamic5698_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9dbdbdfe5e0e_invokedynamic5698_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9dbdbdfe5e0e_invokedynamic5698_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9dbdbdfe5e0e_invokedynamic5698_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9dbdbdfe5e0e_invokedynamic5698_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9dbdbdfe5e0e_invokedynamic5698_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9dbdbdfe5e0e_invokedynamic5698_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_240e736e888e_originalDynamicSite2046_1(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native net.minecraft.block.Block __sourceExactCall_3c55b55d648265(net.minecraft.item.Item p0);
private static native net.minecraft.item.Item __sourceExactCall_42e37b9acc15b0(net.minecraft.block.Block p0);
private static native int __sourceExactCall_5e8d77093c4f64(net.minecraft.item.ItemStack p0);
private static native void __sourceExactCall_c5e23a6fae1216(boolean p0, net.minecraft.world.World p1, moom.DT p2);
private static native int __sourceExactCall_a17b884f543805(int p0, long p1);
private static native net.minecraft.item.ItemStack __sourceExactCall_b20cc06766c170(net.minecraft.nbt.NBTTagCompound p0);
private static native void __sourceExactCall_c2d48c82bb6044(java.lang.String[] p0);
private static native boolean __sourceExactCall_89d668202ff0ca(net.minecraft.item.ItemStack p0, net.minecraft.item.ItemStack p1);
private static native boolean __sourceExactCall_495c934b8653bf(net.minecraft.item.ItemStack p0);

private static native java.lang.String[] __sourceExactCall_784dec7dc59254();
private static native int __sourceExactCall_cdf7df5ac5b665(net.minecraft.inventory.IInventory p0, int p1);
}
