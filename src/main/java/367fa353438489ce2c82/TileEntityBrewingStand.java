package net.minecraft.tileentity;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class TileEntityBrewingStand extends moom.Ci implements net.minecraft.util.ITickable, net.minecraft.inventory.ISidedInventory {

private static final int[] n;

private static final int[] o;

private net.minecraft.item.ItemStack[] p;

private int q;

private boolean[] r;

private net.minecraft.item.Item s;

public java.lang.String t;

private static final long u;

private static final long[] v;

private static final java.lang.Integer[] w;

private static final java.util.Map x;

public TileEntityBrewingStand() {
super();
    this.p = new net.minecraft.item.ItemStack[4];
}


static {
u = ((long)(((moom._a)(moom._c.a(((long)(848555723674447777L)), ((long)(1383267897964201709L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(239257002720318L)))));
    x = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.tileentity.TileEntityBrewingStand.u ^ 51058590738253L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1926_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1926_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1926_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1926_14 = new byte[8];
    (__sourceSpill1926_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1926_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1926_16 = __sourceSpill1926_14;
    ((javax.crypto.Cipher)(__sourceSpill1926_11)).init(((int)(__sourceSpill1926_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1926_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1926_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "2ó\021Ï\f¦ kêD-e®md"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1926_25 = local6_life21;
        int __sourceSpill1926_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1926_25)).substring(((int)(__sourceSpill1926_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1926_30 = local8_life19;
        int __sourceSpill1926_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1926_33 = new byte[8];
        (__sourceSpill1926_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1926_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1926_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1926_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1926_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1926_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1926_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1926_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1926_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1926_34)).doFinal(((byte[])(__sourceSpill1926_33)));
        (__sourceSpill1926_30)[__sourceSpill1926_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "|(\003V\020f\026êBr%â!YÓ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1926_38 = local6_life21;
        int __sourceSpill1926_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1926_38)).substring(((int)(__sourceSpill1926_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1926_43 = local8_life19;
        int __sourceSpill1926_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1926_46 = new byte[8];
        (__sourceSpill1926_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1926_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1926_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1926_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1926_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1926_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1926_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1926_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1926_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1926_47)).doFinal(((byte[])(__sourceSpill1926_46)));
        (__sourceSpill1926_43)[__sourceSpill1926_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    v = ((long[])(local8_life19));
    w = ((java.lang.Integer[])(new java.lang.Integer[4]));
    int[] __sourceSpill1926_52 = new int[1];
    (__sourceSpill1926_52)[0] = 3;
    n = ((int[])(__sourceSpill1926_52));
    int[] __sourceSpill1926_54 = new int[3];
    (__sourceSpill1926_54)[0] = 0;
    (__sourceSpill1926_54)[1] = 1;
    (__sourceSpill1926_54)[2] = 2;
    o = ((int[])(__sourceSpill1926_54));
}


public void b(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.tileentity.TileEntityBrewingStand lexicalValue1692_62_0;
    net.minecraft.nbt.NBTTagCompound lexicalValue1692_66_0;
    java.lang.String lexicalValue1692_66_1;
    java.lang.String[] spill1692_0;
    net.minecraft.tileentity.TileEntityBrewingStand spill1692_1;
    net.minecraft.nbt.NBTTagCompound spill1692_2;
    java.lang.String spill1692_3;
    long life2_3;
    java.lang.String[] life4_8;
    net.minecraft.nbt.NBTTagList life5_18;
    int life6_20;
    net.minecraft.nbt.NBTTagCompound life7_39;
    lexical_join_69: {
    lexical_join_66: {
    lexical_join_62: {
    lexical_join_55: {
    life2_3 = (net.minecraft.tileentity.TileEntityBrewingStand.u ^ 127189856260832L);
    spill1692_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    life4_8 = spill1692_0;
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("BrewTime")), ((short)(((short) this.q))));
    life5_18 = new net.minecraft.nbt.NBTTagList();
    life6_20 = 0;
    lexical_cycle_21: while (true) {
    lexical_join_52: {
    if (!((life6_20 < (this.p).length))) {
        break lexical_join_55;
    }
    spill1692_1 = this;
    if (!((life4_8 != null))) {
        lexicalValue1692_62_0 = spill1692_1;
        break lexical_join_62;
    }
    if (!(((((net.minecraft.tileentity.TileEntityBrewingStand)(spill1692_1)).p)[life6_20] != null))) {
        break lexical_join_52;
    }
    life7_39 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.nbt.NBTTagCompound)(life7_39)).a(((java.lang.String)("Slot")), ((byte)(((byte) life6_20))));
    ((net.minecraft.item.ItemStack)((this.p)[life6_20])).a__yw(((net.minecraft.nbt.NBTTagCompound)(life7_39)));
    ((net.minecraft.nbt.NBTTagList)(life5_18)).a(((net.minecraft.nbt.NBTBase)(life7_39)));
    }
    life6_20 += 1;
    if (!((life4_8 == null))) { continue lexical_cycle_21; }
    break lexical_cycle_21;
    }
    }
    spill1692_2 = p0;
    spill1692_3 = "Items";
    if (!((life4_8 != null))) {
        lexicalValue1692_66_0 = spill1692_2;
        lexicalValue1692_66_1 = spill1692_3;
        break lexical_join_66;
    }
    ((net.minecraft.nbt.NBTTagCompound)(spill1692_2)).a(((java.lang.String)(spill1692_3)), ((net.minecraft.nbt.NBTBase)(life5_18)));
    lexicalValue1692_62_0 = this;
    }
    if (!(((net.minecraft.tileentity.TileEntityBrewingStand)(lexicalValue1692_62_0)).e__Boolean())) {
        break lexical_join_69;
    }
    lexicalValue1692_66_0 = p0;
    lexicalValue1692_66_1 = "CustomName";
    }
    ((net.minecraft.nbt.NBTTagCompound)(lexicalValue1692_66_0)).a(((java.lang.String)(lexicalValue1692_66_1)), ((java.lang.String)(this.t)));
    }
    return;
}


public net.minecraft.item.ItemStack b__xW(int p0) {
int forwardValue5665_11_0;
    int spill5665_0;
    long life2_3;
    java.lang.String[] life4_5;
    net.minecraft.item.ItemStack life5_22;
    forward_join_27: {
    forward_join_11: {
    life2_3 = (net.minecraft.tileentity.TileEntityBrewingStand.u ^ 60450584047446L);
    life4_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5665_0 = p0;
    if (!((life4_5 != null))) {
        forwardValue5665_11_0 = spill5665_0;
        break forward_join_11;
    }
    if (!((spill5665_0 >= 0))) {
        break forward_join_27;
    }
    forwardValue5665_11_0 = p0;
    }
    if (!((forwardValue5665_11_0 < (this.p).length))) {
        break forward_join_27;
    }
    life5_22 = (this.p)[p0];
    (this.p)[p0] = null;
    return life5_22;
    }
    return null;
}


public void b(net.minecraft.entity.player.EntityPlayer p0) {
return;
}


public boolean b(int p0, net.minecraft.item.ItemStack p1, moom.bs p2) {
return ((1) != 0);
}


public void b__Void() {
java.util.Arrays.fill(((java.lang.Object[])(this.p)), ((java.lang.Object)(null)));
    return;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public int b__Int() {
return (this.p).length;
}


public boolean e__Boolean() {
java.lang.String forwardValue5667_13_0;
    int forwardValue5667_18_0;
    int forwardValue5667_20_0;
    java.lang.String spill5667_0;
    int spill5667_1;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    forward_join_13: {
    life1_3 = (net.minecraft.tileentity.TileEntityBrewingStand.u ^ 113400461227501L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5667_0 = this.t;
    if (!((life3_5 != null))) {
        forwardValue5667_13_0 = spill5667_0;
        break forward_join_13;
    }
    if (!((spill5667_0 != null))) {
        break forward_join_19;
    }
    forwardValue5667_13_0 = this.t;
    }
    spill5667_1 = ((java.lang.String)(forwardValue5667_13_0)).length();
    if (!((life3_5 != null))) {
        forwardValue5667_18_0 = spill5667_1;
        break forward_join_18;
    }
    if (!((spill5667_1 > 0))) {
        break forward_join_19;
    }
    forwardValue5667_18_0 = 1;
    }
    forwardValue5667_20_0 = forwardValue5667_18_0;
    break forward_join_20;
    }
    forwardValue5667_20_0 = 0;
    }
    return ((forwardValue5667_20_0) != 0);
}


public int c__Int() {
long local1 = (net.minecraft.tileentity.TileEntityBrewingStand.u ^ 127439612384894L);
    return __sourceIntrinsic_240e736e888e_originalDynamicSite2043_1(27936, (4287306842419677549L ^ local1));
}


public java.lang.String c__String() {
return "minecraft:brewing_stand";
}


public void c__Void() {
int lexicalValue1693_32_0;
    net.minecraft.tileentity.TileEntityBrewingStand lexicalValue1693_41_0;
    int lexicalValue1693_59_0;
    net.minecraft.tileentity.TileEntityBrewingStand lexicalValue1693_77_0;
    int lexicalValue1693_81_0;
    net.minecraft.tileentity.TileEntityBrewingStand lexicalValue1693_83_0;
    int lexicalValue1693_109_0;
    int spill1693_0;
    int spill1693_1;
    net.minecraft.tileentity.TileEntityBrewingStand spill1693_2;
    int spill1693_3;
    long life1_3;
    java.lang.String[] life3_5;
    boolean[] life4_126;
    net.minecraft.block.state.IBlockState life5_148;
    int life6_160;
    lexical_join_137: {
    lexical_join_129: {
    lexical_join_109: {
    lexical_join_108: {
    lexical_join_95: {
    lexical_join_83: {
    lexical_join_81: {
    lexical_join_77: {
    lexical_join_76: {
    lexical_join_59: {
    lexical_join_57: {
    lexical_join_41: {
    lexical_join_40: {
    lexical_join_32: {
    lexical_join_28: {
    life1_3 = (net.minecraft.tileentity.TileEntityBrewingStand.u ^ 44636262522699L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill1693_0 = this.q;
    if (!((life3_5 != null))) {
        lexicalValue1693_59_0 = spill1693_0;
        break lexical_join_59;
    }
    if (!((spill1693_0 > 0))) {
        break lexical_join_57;
    }
    net.minecraft.tileentity.TileEntityBrewingStand __stackOp1693_3_0 = this;
    ((net.minecraft.tileentity.TileEntityBrewingStand)(__stackOp1693_3_0)).q = ((int)((((net.minecraft.tileentity.TileEntityBrewingStand)(__stackOp1693_3_0)).q - 1)));
    spill1693_1 = this.q;
    if (!((life3_5 != null))) {
        lexicalValue1693_32_0 = spill1693_1;
        break lexical_join_32;
    }
    if (!((spill1693_1 == 0))) {
        break lexical_join_28;
    }
    ((net.minecraft.tileentity.TileEntityBrewingStand)(this)).g__sourceReturn_da8c82d5d4();
    ((net.minecraft.tileentity.TileEntityBrewingStand)(this)).a__Void();
    if (!((life3_5 == null))) {
        break lexical_join_76;
    }
    }
    spill1693_2 = this;
    if (!((life3_5 != null))) {
        lexicalValue1693_41_0 = spill1693_2;
        break lexical_join_41;
    }
    lexicalValue1693_32_0 = ((((net.minecraft.tileentity.TileEntityBrewingStand)(spill1693_2)).h()) ? 1 : 0);
    }
    if (!((lexicalValue1693_32_0 == 0))) {
        break lexical_join_40;
    }
    this.q = ((int)(0));
    ((net.minecraft.tileentity.TileEntityBrewingStand)(this)).a__Void();
    if (!((life3_5 == null))) {
        break lexical_join_76;
    }
    }
    lexicalValue1693_41_0 = this;
    }
    if (!((life3_5 != null))) {
        lexicalValue1693_77_0 = lexicalValue1693_41_0;
        break lexical_join_77;
    }
    if (!((((net.minecraft.tileentity.TileEntityBrewingStand)(lexicalValue1693_41_0)).s != ((net.minecraft.item.ItemStack)((this.p)[3])).a__wQ()))) {
        break lexical_join_76;
    }
    this.q = ((int)(0));
    ((net.minecraft.tileentity.TileEntityBrewingStand)(this)).a__Void();
    if (!((life3_5 == null))) {
        break lexical_join_76;
    }
    }
    lexicalValue1693_59_0 = ((((net.minecraft.tileentity.TileEntityBrewingStand)(this)).h()) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        lexicalValue1693_81_0 = lexicalValue1693_59_0;
        break lexical_join_81;
    }
    if (!((lexicalValue1693_59_0 != 0))) {
        break lexical_join_76;
    }
    this.q = ((int)(__sourceIntrinsic_7ac46ee229a8_invokedynamic1693_20(2363, (2642403397661844545L ^ life1_3))));
    this.s = ((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)((this.p)[3])).a__wQ()));
    }
    lexicalValue1693_77_0 = this;
    }
    if (!((life3_5 != null))) {
        lexicalValue1693_83_0 = lexicalValue1693_77_0;
        break lexical_join_83;
    }
    lexicalValue1693_81_0 = ((((net.minecraft.world.World)(((net.minecraft.tileentity.TileEntityBrewingStand)(lexicalValue1693_77_0)).d)).G) ? 1 : 0);
    }
    if (!((lexicalValue1693_81_0 == 0))) {
        break lexical_join_137;
    }
    lexicalValue1693_83_0 = this;
    }
    life4_126 = ((net.minecraft.tileentity.TileEntityBrewingStand)(lexicalValue1693_83_0)).a__ArrayBoolean();
    if (!((life3_5 != null))) {
        break lexical_join_95;
    }
    if (!((!java.util.Arrays.equals(((boolean[])(life4_126)), ((boolean[])(this.r)))))) {
        break lexical_join_137;
    }
    this.r = ((boolean[])(life4_126));
    }
    life5_148 = ((net.minecraft.world.World)(((net.minecraft.tileentity.TileEntityBrewingStand)(this)).d)).a__fE(((moom.DT)(((net.minecraft.tileentity.TileEntityBrewingStand)(this)).a__DT())));
    spill1693_3 = ((((net.minecraft.block.state.IBlockState)(life5_148)).a__ch() instanceof net.minecraft.block.BlockBrewingStand) ? 1 : 0);
    if (!((life3_5 != null))) {
        lexicalValue1693_109_0 = spill1693_3;
        break lexical_join_109;
    }
    if (!((spill1693_3 == 0))) {
        break lexical_join_108;
    }
    return;
    }
    lexicalValue1693_109_0 = 0;
    }
    life6_160 = lexicalValue1693_109_0;
    lexical_cycle_110: while (true) {
    if (!((life6_160 < (net.minecraft.block.BlockBrewingStand.R).length))) {
        break lexical_join_129;
    }
    life5_148 = ((net.minecraft.block.state.IBlockState)(life5_148)).a__fE(((net.minecraft.block.properties.IProperty)((net.minecraft.block.BlockBrewingStand.R)[life6_160])), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)((life4_126)[life6_160]))))));
    life6_160 += 1;
    if (!((life3_5 != null))) {
        break lexical_join_137;
    }
    if (!((life3_5 == null))) { continue lexical_cycle_110; }
    break lexical_cycle_110;
    }
    }
    ((net.minecraft.world.World)(((net.minecraft.tileentity.TileEntityBrewingStand)(this)).d)).a(((moom.DT)(((net.minecraft.tileentity.TileEntityBrewingStand)(this)).e)), ((net.minecraft.block.state.IBlockState)(life5_148)), ((int)(2)));
    }
    return;
}


public void c__sourceReturn_aecb585720(net.minecraft.entity.player.EntityPlayer p0) {
return;
}


private boolean h() {
net.minecraft.item.ItemStack lexicalValue1695_17_0;
    int lexicalValue1695_36_0;
    net.minecraft.item.ItemStack lexicalValue1695_53_0;
    net.minecraft.item.ItemStack lexicalValue1695_62_0;
    int lexicalValue1695_76_0;
    int lexicalValue1695_80_0;
    java.util.List lexicalValue1695_99_0;
    java.util.List lexicalValue1695_103_0;
    java.util.List lexicalValue1695_109_0;
    int lexicalValue1695_116_0;
    int lexicalValue1695_125_0;
    net.minecraft.item.ItemStack spill1695_0;
    int spill1695_1;
    boolean spill1695_2;
    net.minecraft.item.ItemStack spill1695_3;
    boolean spill1695_4;
    java.util.List spill1695_5;
    int spill1695_6;
    long life1_3;
    java.lang.String[] life3_5;
    net.minecraft.item.ItemStack life4_34;
    int life5_50;
    int life6_52;
    int life7_89;
    int life8_94;
    java.util.List life9_121;
    java.util.List life10_125;
    lexical_join_125: {
    lexical_join_124: {
    lexical_join_122: {
    lexical_join_36: {
    lexical_join_35: {
    lexical_join_17: {
    life1_3 = (net.minecraft.tileentity.TileEntityBrewingStand.u ^ 38899972120801L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill1695_0 = (this.p)[3];
    if (!((life3_5 != null))) {
        lexicalValue1695_17_0 = spill1695_0;
        break lexical_join_17;
    }
    if (!((spill1695_0 != null))) {
        break lexical_join_124;
    }
    lexicalValue1695_17_0 = (this.p)[3];
    }
    spill1695_1 = ((net.minecraft.item.ItemStack)(lexicalValue1695_17_0)).b;
    if (!((life3_5 != null))) {
        lexicalValue1695_125_0 = spill1695_1;
        break lexical_join_125;
    }
    if (!((spill1695_1 > 0))) {
        break lexical_join_124;
    }
    life4_34 = (this.p)[3];
    spill1695_2 = ((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(life4_34)).a__wQ())).a__Boolean(((net.minecraft.item.ItemStack)(life4_34)));
    if (!((life3_5 != null))) {
        lexicalValue1695_36_0 = ((spill1695_2) ? 1 : 0);
        break lexical_join_36;
    }
    if (!((!spill1695_2))) {
        break lexical_join_35;
    }
    return ((0) != 0);
    }
    lexicalValue1695_36_0 = 0;
    }
    life5_50 = lexicalValue1695_36_0;
    life6_52 = 0;
    lexical_cycle_39: while (true) {
    lexical_join_119: {
    lexical_join_116: {
    lexical_join_110: {
    lexical_join_109: {
    lexical_join_103: {
    lexical_join_99: {
    lexical_join_98: {
    lexical_join_83: {
    lexical_join_80: {
    lexical_join_76: {
    lexical_join_62: {
    lexical_join_53: {
    if (!((life6_52 < 3))) {
        break lexical_join_122;
    }
    spill1695_3 = (this.p)[life6_52];
    if (!((life3_5 != null))) {
        lexicalValue1695_53_0 = spill1695_3;
        break lexical_join_53;
    }
    if (!((spill1695_3 != null))) {
        break lexical_join_119;
    }
    lexicalValue1695_53_0 = (this.p)[life6_52];
    }
    if (!((life3_5 != null))) {
        lexicalValue1695_62_0 = lexicalValue1695_53_0;
        break lexical_join_62;
    }
    if (!((((net.minecraft.item.ItemStack)(lexicalValue1695_53_0)).a__wQ() == net.minecraft.init.Items.bo))) {
        break lexical_join_119;
    }
    lexicalValue1695_62_0 = (this.p)[life6_52];
    }
    life7_89 = ((net.minecraft.item.ItemStack)(lexicalValue1695_62_0)).c();
    life8_94 = ((net.minecraft.tileentity.TileEntityBrewingStand)(this)).a(((int)(life7_89)), ((net.minecraft.item.ItemStack)(life4_34)));
    spill1695_4 = net.minecraft.item.ItemPotion.a__Boolean(((int)(life7_89)));
    if (!((life3_5 != null))) {
        lexicalValue1695_76_0 = ((spill1695_4) ? 1 : 0);
        break lexical_join_76;
    }
    if (!((!spill1695_4))) {
        break lexical_join_83;
    }
    lexicalValue1695_76_0 = ((net.minecraft.item.ItemPotion.a__Boolean(((int)(life8_94)))) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        lexicalValue1695_80_0 = lexicalValue1695_76_0;
        break lexical_join_80;
    }
    if (!((lexicalValue1695_76_0 != 0))) {
        break lexical_join_83;
    }
    lexicalValue1695_80_0 = 1;
    }
    life5_50 = lexicalValue1695_80_0;
    if (!((life3_5 == null))) {
        break lexical_join_122;
    }
    }
    life9_121 = ((net.minecraft.item.ItemPotion)(net.minecraft.init.Items.bo)).a__sourceReturn_7947c2aecb(((int)(life7_89)));
    life10_125 = ((net.minecraft.item.ItemPotion)(net.minecraft.init.Items.bo)).a__sourceReturn_7947c2aecb(((int)(life8_94)));
    if (!((life7_89 > 0))) {
        break lexical_join_98;
    }
    spill1695_5 = life9_121;
    if (!((life3_5 != null))) {
        lexicalValue1695_99_0 = spill1695_5;
        break lexical_join_99;
    }
    if (!((spill1695_5 != life10_125))) {
        break lexical_join_119;
    }
    }
    lexicalValue1695_99_0 = life9_121;
    }
    if (!((life3_5 != null))) {
        lexicalValue1695_103_0 = lexicalValue1695_99_0;
        break lexical_join_103;
    }
    if (!((lexicalValue1695_99_0 != null))) {
        break lexical_join_110;
    }
    lexicalValue1695_103_0 = life9_121;
    }
    if (!((life3_5 != null))) {
        lexicalValue1695_109_0 = lexicalValue1695_103_0;
        break lexical_join_109;
    }
    if (!((!((java.util.List)(lexicalValue1695_103_0)).equals(((java.lang.Object)(life10_125)))))) {
        break lexical_join_119;
    }
    lexicalValue1695_109_0 = life10_125;
    }
    if (!((lexicalValue1695_109_0 != null))) {
        break lexical_join_119;
    }
    }
    spill1695_6 = life7_89;
    if (!((life3_5 != null))) {
        lexicalValue1695_116_0 = spill1695_6;
        break lexical_join_116;
    }
    if (!((spill1695_6 != life8_94))) {
        break lexical_join_119;
    }
    lexicalValue1695_116_0 = 1;
    }
    life5_50 = lexicalValue1695_116_0;
    if (!((life3_5 == null))) {
        break lexical_join_122;
    }
    }
    life6_52 += 1;
    if (!((life3_5 == null))) { continue lexical_cycle_39; }
    break lexical_cycle_39;
    }
    }
    return ((life5_50) != 0);
    }
    lexicalValue1695_125_0 = 0;
    }
    return ((lexicalValue1695_125_0) != 0);
}


public int d__Int() {
return 1;
}


public int a__sourceReturn_0f7a48eca2(int p0) {
int forwardValue5654_14_0;
    int spill5654_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_14: {
    forward_join_13: {
    life2_3 = (net.minecraft.tileentity.TileEntityBrewingStand.u ^ 57656740214432L);
    life4_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5654_0 = p0;
    if (!((life4_5 != null))) {
        forwardValue5654_14_0 = spill5654_0;
        break forward_join_14;
    }
    if (!((spill5654_0 == 0))) {
        break forward_join_13;
    }
    return this.q;
    }
    forwardValue5654_14_0 = 0;
    }
    return forwardValue5654_14_0;
}


public moom.v8 a(net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.entity.player.EntityPlayer p1) {
return new moom.wb(p0, this);
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.tileentity.TileEntityBrewingStand.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12269_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Ck"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(java.lang.String p0) {
this.t = ((java.lang.String)(p0));
    return;
}


public java.lang.String a__String() {
net.minecraft.tileentity.TileEntityBrewingStand forwardValue5660_12_0;
    java.lang.String forwardValue5660_15_0;
    net.minecraft.tileentity.TileEntityBrewingStand spill5660_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_12: {
    life1_3 = (net.minecraft.tileentity.TileEntityBrewingStand.u ^ 49833147300595L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5660_0 = this;
    if (!((life3_5 != null))) {
        forwardValue5660_12_0 = spill5660_0;
        break forward_join_12;
    }
    if (!(((net.minecraft.tileentity.TileEntityBrewingStand)(spill5660_0)).e__Boolean())) {
        break forward_join_14;
    }
    forwardValue5660_12_0 = this;
    }
    forwardValue5660_15_0 = ((net.minecraft.tileentity.TileEntityBrewingStand)(forwardValue5660_12_0)).t;
    break forward_join_15;
    }
    forwardValue5660_15_0 = "container.brewing";
    }
    return forwardValue5660_15_0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 440;
      if (w[var3] == null) {
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
         long var5 = v[var3];
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
         Object[] var9 = (Object[])x.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               x.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/Ck", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         w[var3] = var15;
      }

      return w[var3];
}


public void a__Void(int p0, int p1) {
long local3 = (net.minecraft.tileentity.TileEntityBrewingStand.u ^ 46719575298983L);
    if ((p0 == 0)) {
        this.q = ((int)(p1));
    }
    return;
}


public void a__Void(int p0, net.minecraft.item.ItemStack p1) {
int forwardValue5661_11_0;
    int spill5661_0;
    long life3_3;
    java.lang.String[] life5_5;
    forward_join_20: {
    forward_join_11: {
    life3_3 = (net.minecraft.tileentity.TileEntityBrewingStand.u ^ 126567078594093L);
    life5_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5661_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue5661_11_0 = spill5661_0;
        break forward_join_11;
    }
    if (!((spill5661_0 >= 0))) {
        break forward_join_20;
    }
    forwardValue5661_11_0 = p0;
    }
    if (!((forwardValue5661_11_0 < (this.p).length))) {
        break forward_join_20;
    }
    (this.p)[p0] = p1;
    }
    return;
}


public net.minecraft.item.ItemStack a(int p0, int p1) {
int forwardValue5655_11_0;
    int spill5655_0;
    long life3_3;
    java.lang.String[] life5_5;
    net.minecraft.item.ItemStack life6_22;
    forward_join_27: {
    forward_join_11: {
    life3_3 = (net.minecraft.tileentity.TileEntityBrewingStand.u ^ 103650936991262L);
    life5_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5655_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue5655_11_0 = spill5655_0;
        break forward_join_11;
    }
    if (!((spill5655_0 >= 0))) {
        break forward_join_27;
    }
    forwardValue5655_11_0 = p0;
    }
    if (!((forwardValue5655_11_0 < (this.p).length))) {
        break forward_join_27;
    }
    life6_22 = (this.p)[p0];
    (this.p)[p0] = null;
    return life6_22;
    }
    return null;
}


public net.minecraft.item.ItemStack a__xW(int p0) {
int forwardValue5663_11_0;
    net.minecraft.item.ItemStack forwardValue5663_21_0;
    int spill5663_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_11: {
    life2_3 = (net.minecraft.tileentity.TileEntityBrewingStand.u ^ 8153097992749L);
    life4_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5663_0 = p0;
    if (!((life4_5 != null))) {
        forwardValue5663_11_0 = spill5663_0;
        break forward_join_11;
    }
    if (!((spill5663_0 >= 0))) {
        break forward_join_20;
    }
    forwardValue5663_11_0 = p0;
    }
    if (!((forwardValue5663_11_0 < (this.p).length))) {
        break forward_join_20;
    }
    forwardValue5663_21_0 = (this.p)[p0];
    break forward_join_21;
    }
    forwardValue5663_21_0 = null;
    }
    return forwardValue5663_21_0;
}


public void a__Void(net.minecraft.nbt.NBTTagCompound p0) {
int lexicalValue1691_72_0;
    net.minecraft.tileentity.TileEntityBrewingStand lexicalValue1691_76_0;
    net.minecraft.nbt.NBTTagCompound lexicalValue1691_76_1;
    java.lang.String lexicalValue1691_76_2;
    java.lang.String[] spill1691_0;
    int spill1691_1;
    net.minecraft.tileentity.TileEntityBrewingStand spill1691_2;
    net.minecraft.nbt.NBTTagCompound spill1691_3;
    java.lang.String spill1691_4;
    long life2_3;
    net.minecraft.nbt.NBTTagList life5_16;
    java.lang.String[] life4_22;
    int life6_24;
    net.minecraft.nbt.NBTTagCompound life7_32;
    int life8_36;
    lexical_join_78: {
    lexical_join_76: {
    lexical_join_72: {
    lexical_join_57: {
    life2_3 = (net.minecraft.tileentity.TileEntityBrewingStand.u ^ 20414247883745L);
    spill1691_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    super.a__Void(((net.minecraft.nbt.NBTTagCompound)(p0)));
    life5_16 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Items")), ((int)(__sourceIntrinsic_03d9340fa09f_invokedynamic1691_3(24265, (1886244490046521112L ^ life2_3)))));
    this.p = ((net.minecraft.item.ItemStack[])(new net.minecraft.item.ItemStack[((net.minecraft.tileentity.TileEntityBrewingStand)(this)).b__Int()]));
    life4_22 = spill1691_0;
    life6_24 = 0;
    lexical_cycle_25: while (true) {
    lexical_join_55: {
    lexical_join_54: {
    if (!((life6_24 < ((net.minecraft.nbt.NBTTagList)(life5_16)).a__Int()))) {
        break lexical_join_57;
    }
    life7_32 = ((net.minecraft.nbt.NBTTagList)(life5_16)).a__yw(((int)(life6_24)));
    life8_36 = ((net.minecraft.nbt.NBTTagCompound)(life7_32)).b__sourceReturn_d4c7a9581c(((java.lang.String)("Slot")));
    if (!((life4_22 != null))) {
        break lexical_join_55;
    }
    spill1691_1 = life8_36;
    if (!((life4_22 != null))) {
        lexicalValue1691_72_0 = spill1691_1;
        break lexical_join_72;
    }
    if (!((spill1691_1 >= 0))) {
        break lexical_join_54;
    }
    if (!((life8_36 < (this.p).length))) {
        break lexical_join_54;
    }
    (this.p)[life8_36] = net.minecraft.item.ItemStack.a(((net.minecraft.nbt.NBTTagCompound)(life7_32)));
    }
    life6_24 += 1;
    }
    if (!((life4_22 == null))) { continue lexical_cycle_25; }
    break lexical_cycle_25;
    }
    }
    spill1691_2 = this;
    spill1691_3 = p0;
    spill1691_4 = "BrewTime";
    if (!((life4_22 != null))) {
        lexicalValue1691_76_0 = spill1691_2;
        lexicalValue1691_76_1 = spill1691_3;
        lexicalValue1691_76_2 = spill1691_4;
        break lexical_join_76;
    }
    ((net.minecraft.tileentity.TileEntityBrewingStand)(spill1691_2)).q = ((int)(((net.minecraft.nbt.NBTTagCompound)(spill1691_3)).a__Short(((java.lang.String)(spill1691_4)))));
    lexicalValue1691_72_0 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("CustomName")), ((int)(__sourceIntrinsic_03d9340fa09f_invokedynamic1691_15(14494, (2734356370433366349L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((lexicalValue1691_72_0 != 0))) {
        break lexical_join_78;
    }
    lexicalValue1691_76_0 = this;
    lexicalValue1691_76_1 = p0;
    lexicalValue1691_76_2 = "CustomName";
    }
    ((net.minecraft.tileentity.TileEntityBrewingStand)(lexicalValue1691_76_0)).t = ((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(lexicalValue1691_76_1)).a__String(((java.lang.String)(lexicalValue1691_76_2)))));
    }
    return;
}


private int a(int p0, net.minecraft.item.ItemStack p1) {
net.minecraft.item.ItemStack forwardValue5656_13_0;
    int forwardValue5656_25_0;
    int forwardValue5656_27_0;
    net.minecraft.item.ItemStack spill5656_0;
    boolean spill5656_1;
    long life3_3;
    java.lang.String[] life5_5;
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    forward_join_13: {
    forward_join_12: {
    life3_3 = (net.minecraft.tileentity.TileEntityBrewingStand.u ^ 49414750628192L);
    life5_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5656_0 = p1;
    if (!((life5_5 != null))) {
        forwardValue5656_13_0 = spill5656_0;
        break forward_join_13;
    }
    if (!((spill5656_0 == null))) {
        break forward_join_12;
    }
    forwardValue5656_27_0 = p0;
    break forward_join_27;
    }
    forwardValue5656_13_0 = p1;
    }
    spill5656_1 = ((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(forwardValue5656_13_0)).a__wQ())).a__Boolean(((net.minecraft.item.ItemStack)(p1)));
    if (!((life5_5 != null))) {
        forwardValue5656_25_0 = ((spill5656_1) ? 1 : 0);
        break forward_join_25;
    }
    if (!(spill5656_1)) {
        break forward_join_26;
    }
    forwardValue5656_25_0 = moom.A6.a(((int)(p0)), ((java.lang.String)(((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(p1)).a__wQ())).c(((net.minecraft.item.ItemStack)(p1))))));
    }
    forwardValue5656_27_0 = forwardValue5656_25_0;
    break forward_join_27;
    }
    forwardValue5656_27_0 = p0;
    }
    return forwardValue5656_27_0;
}


public int[] a(moom.bs p0) {
long local2 = (net.minecraft.tileentity.TileEntityBrewingStand.u ^ 139898663713363L);
    return ((p0 == moom.bs.UP) ? net.minecraft.tileentity.TileEntityBrewingStand.n : net.minecraft.tileentity.TileEntityBrewingStand.o);
}


public boolean a(int p0, net.minecraft.item.ItemStack p1, moom.bs p2) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.tileentity.TileEntityBrewingStand)(this)).a__Boolean(((int)(p0)), ((net.minecraft.item.ItemStack)(p1))))) != 0);
}


public boolean[] a__ArrayBoolean() {
java.lang.String[] spill1690_0;
    long life1_3;
    boolean[] life4_7;
    java.lang.String[] life3_8;
    int life5_10;
    lexical_join_26: {
    life1_3 = (net.minecraft.tileentity.TileEntityBrewingStand.u ^ 102281673580809L);
    spill1690_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    life4_7 = new boolean[3];
    life3_8 = spill1690_0;
    life5_10 = 0;
    lexical_cycle_11: while (true) {
    lexical_join_23: {
    if (!((life5_10 < 3))) {
        break lexical_join_26;
    }
    if (!(((this.p)[life5_10] != null))) {
        break lexical_join_23;
    }
    (life4_7)[life5_10] = ((1) != 0);
    }
    life5_10 += 1;
    if (!((life3_8 == null))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    return life4_7;
}


public boolean a__Boolean(int p0, net.minecraft.item.ItemStack p1) {
int forwardValue5659_15_0;
    net.minecraft.item.Item forwardValue5659_25_0;
    net.minecraft.item.Item forwardValue5659_25_1;
    int forwardValue5659_29_0;
    int spill5659_0;
    net.minecraft.item.Item spill5659_1;
    net.minecraft.item.ItemPotion spill5659_2;
    long life3_3;
    java.lang.String[] life5_5;
    forward_join_29: {
    forward_join_28: {
    forward_join_26: {
    forward_join_25: {
    forward_join_16: {
    forward_join_15: {
    life3_3 = (net.minecraft.tileentity.TileEntityBrewingStand.u ^ 17768015244740L);
    life5_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5659_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue5659_15_0 = spill5659_0;
        break forward_join_15;
    }
    if (!((spill5659_0 == 3))) {
        break forward_join_16;
    }
    forwardValue5659_15_0 = ((((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(p1)).a__wQ())).a__Boolean(((net.minecraft.item.ItemStack)(p1)))) ? 1 : 0);
    }
    forwardValue5659_29_0 = forwardValue5659_15_0;
    break forward_join_29;
    }
    spill5659_1 = ((net.minecraft.item.ItemStack)(p1)).a__wQ();
    spill5659_2 = net.minecraft.init.Items.bo;
    if (!((life5_5 != null))) {
        forwardValue5659_25_0 = spill5659_1;
        forwardValue5659_25_1 = spill5659_2;
        break forward_join_25;
    }
    if (!((spill5659_1 != spill5659_2))) {
        break forward_join_26;
    }
    forwardValue5659_25_0 = ((net.minecraft.item.ItemStack)(p1)).a__wQ();
    forwardValue5659_25_1 = net.minecraft.init.Items.bp;
    }
    if (!((forwardValue5659_25_0 == forwardValue5659_25_1))) {
        break forward_join_28;
    }
    }
    forwardValue5659_29_0 = 1;
    break forward_join_29;
    }
    forwardValue5659_29_0 = 0;
    }
    return ((forwardValue5659_29_0) != 0);
}


public boolean a(net.minecraft.entity.player.EntityPlayer p0) {
int forwardValue5657_39_0;
    int forwardValue5657_41_0;
    int spill5657_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_41: {
    forward_join_40: {
    forward_join_39: {
    life2_3 = (net.minecraft.tileentity.TileEntityBrewingStand.u ^ 14721837911202L);
    life4_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    if (!((((net.minecraft.world.World)(((net.minecraft.tileentity.TileEntityBrewingStand)(this)).d)).a__B9(((moom.DT)(((net.minecraft.tileentity.TileEntityBrewingStand)(this)).e))) == this))) {
        break forward_join_40;
    }
    spill5657_0 = recovery.source.CarrierOps.dcmpg(((double)(((net.minecraft.entity.player.EntityPlayer)(p0)).a(((double)((((double) ((moom.DT)(((net.minecraft.tileentity.TileEntityBrewingStand)(this)).e)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(((net.minecraft.tileentity.TileEntityBrewingStand)(this)).e)).b()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(((net.minecraft.tileentity.TileEntityBrewingStand)(this)).e)).c()) + 0x1.0p-1d)))))), ((double)(0x1.0p6d)));
    if (!((life4_5 != null))) {
        forwardValue5657_39_0 = spill5657_0;
        break forward_join_39;
    }
    if (!((spill5657_0 <= 0))) {
        break forward_join_40;
    }
    forwardValue5657_39_0 = 1;
    }
    forwardValue5657_41_0 = forwardValue5657_39_0;
    break forward_join_41;
    }
    forwardValue5657_41_0 = 0;
    }
    return ((forwardValue5657_41_0) != 0);
}


private void g__sourceReturn_da8c82d5d4() {
net.minecraft.tileentity.TileEntityBrewingStand lexicalValue1694_12_0;
    net.minecraft.item.ItemStack lexicalValue1694_34_0;
    net.minecraft.item.ItemStack lexicalValue1694_43_0;
    java.util.List lexicalValue1694_66_0;
    java.util.List lexicalValue1694_70_0;
    int lexicalValue1694_79_0;
    int lexicalValue1694_84_0;
    net.minecraft.item.ItemStack lexicalValue1694_106_0;
    int lexicalValue1694_139_0;
    net.minecraft.item.ItemStack[] lexicalValue1694_143_0;
    int lexicalValue1694_143_1;
    net.minecraft.tileentity.TileEntityBrewingStand spill1694_0;
    net.minecraft.item.ItemStack spill1694_1;
    java.util.List spill1694_2;
    boolean spill1694_3;
    boolean spill1694_4;
    net.minecraft.item.ItemStack[] spill1694_5;
    int spill1694_6;
    long life1_3;
    java.lang.String[] life3_5;
    net.minecraft.item.ItemStack life4_21;
    int life5_23;
    int life6_65;
    int life7_70;
    java.util.List life8_74;
    java.util.List life9_78;
    lexical_join_145: {
    lexical_join_143: {
    lexical_join_139: {
    lexical_join_123: {
    lexical_join_106: {
    lexical_join_105: {
    lexical_join_12: {
    life1_3 = (net.minecraft.tileentity.TileEntityBrewingStand.u ^ 59064442801414L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill1694_0 = this;
    if (!((life3_5 != null))) {
        lexicalValue1694_12_0 = spill1694_0;
        break lexical_join_12;
    }
    if (!(((net.minecraft.tileentity.TileEntityBrewingStand)(spill1694_0)).h())) {
        break lexical_join_145;
    }
    lexicalValue1694_12_0 = this;
    }
    life4_21 = (((net.minecraft.tileentity.TileEntityBrewingStand)(lexicalValue1694_12_0)).p)[3];
    life5_23 = 0;
    lexical_cycle_18: while (true) {
    lexical_join_102: {
    lexical_join_93: {
    lexical_join_84: {
    lexical_join_79: {
    lexical_join_77: {
    lexical_join_70: {
    lexical_join_66: {
    lexical_join_65: {
    lexical_join_43: {
    lexical_join_34: {
    if (!((life5_23 < 3))) {
        break lexical_join_105;
    }
    spill1694_1 = (this.p)[life5_23];
    if (!((life3_5 != null))) {
        lexicalValue1694_106_0 = spill1694_1;
        break lexical_join_106;
    }
    if (!((life3_5 != null))) {
        lexicalValue1694_34_0 = spill1694_1;
        break lexical_join_34;
    }
    if (!((spill1694_1 != null))) {
        break lexical_join_102;
    }
    lexicalValue1694_34_0 = (this.p)[life5_23];
    }
    if (!((life3_5 != null))) {
        lexicalValue1694_43_0 = lexicalValue1694_34_0;
        break lexical_join_43;
    }
    if (!((((net.minecraft.item.ItemStack)(lexicalValue1694_34_0)).a__wQ() == net.minecraft.init.Items.bo))) {
        break lexical_join_102;
    }
    lexicalValue1694_43_0 = (this.p)[life5_23];
    }
    life6_65 = ((net.minecraft.item.ItemStack)(lexicalValue1694_43_0)).c();
    life7_70 = ((net.minecraft.tileentity.TileEntityBrewingStand)(this)).a(((int)(life6_65)), ((net.minecraft.item.ItemStack)(life4_21)));
    life8_74 = ((net.minecraft.item.ItemPotion)(net.minecraft.init.Items.bo)).a__sourceReturn_7947c2aecb(((int)(life6_65)));
    life9_78 = ((net.minecraft.item.ItemPotion)(net.minecraft.init.Items.bo)).a__sourceReturn_7947c2aecb(((int)(life7_70)));
    if (!((life6_65 > 0))) {
        break lexical_join_65;
    }
    spill1694_2 = life8_74;
    if (!((life3_5 != null))) {
        lexicalValue1694_66_0 = spill1694_2;
        break lexical_join_66;
    }
    if (!((spill1694_2 != life9_78))) {
        break lexical_join_77;
    }
    }
    lexicalValue1694_66_0 = life8_74;
    }
    if (!((life3_5 != null))) {
        lexicalValue1694_70_0 = lexicalValue1694_66_0;
        break lexical_join_70;
    }
    if (!((lexicalValue1694_66_0 != null))) {
        break lexical_join_93;
    }
    lexicalValue1694_70_0 = life8_74;
    }
    spill1694_3 = ((java.util.List)(lexicalValue1694_70_0)).equals(((java.lang.Object)(life9_78)));
    if (!((life3_5 != null))) {
        lexicalValue1694_79_0 = ((spill1694_3) ? 1 : 0);
        break lexical_join_79;
    }
    if (!((!spill1694_3))) {
        break lexical_join_77;
    }
    if (!((life9_78 == null))) {
        break lexical_join_93;
    }
    }
    lexicalValue1694_79_0 = ((net.minecraft.item.ItemPotion.a__Boolean(((int)(life6_65)))) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        lexicalValue1694_84_0 = lexicalValue1694_79_0;
        break lexical_join_84;
    }
    if (!((lexicalValue1694_79_0 == 0))) {
        break lexical_join_102;
    }
    lexicalValue1694_84_0 = ((net.minecraft.item.ItemPotion.a__Boolean(((int)(life7_70)))) ? 1 : 0);
    }
    if (!((lexicalValue1694_84_0 != 0))) {
        break lexical_join_102;
    }
    ((net.minecraft.item.ItemStack)((this.p)[life5_23])).a__Void(((int)(life7_70)));
    if (!((life3_5 == null))) {
        break lexical_join_102;
    }
    }
    if (!((life6_65 != life7_70))) {
        break lexical_join_102;
    }
    ((net.minecraft.item.ItemStack)((this.p)[life5_23])).a__Void(((int)(life7_70)));
    }
    life5_23 += 1;
    if (!((life3_5 == null))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    lexicalValue1694_106_0 = life4_21;
    }
    spill1694_4 = ((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(lexicalValue1694_106_0)).a__wQ())).f();
    if (!((life3_5 != null))) {
        lexicalValue1694_139_0 = ((spill1694_4) ? 1 : 0);
        break lexical_join_139;
    }
    if (!(spill1694_4)) {
        break lexical_join_123;
    }
    (this.p)[3] = new net.minecraft.item.ItemStack(((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(life4_21)).a__wQ())).b__wQ());
    if (!((life3_5 == null))) {
        break lexical_join_145;
    }
    }
    net.minecraft.item.ItemStack __stackOp1694_32_0 = (this.p)[3];
    ((net.minecraft.item.ItemStack)(__stackOp1694_32_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp1694_32_0)).b - 1)));
    spill1694_5 = this.p;
    spill1694_6 = 3;
    if (!((life3_5 != null))) {
        lexicalValue1694_143_0 = spill1694_5;
        lexicalValue1694_143_1 = spill1694_6;
        break lexical_join_143;
    }
    lexicalValue1694_139_0 = ((net.minecraft.item.ItemStack)((spill1694_5)[spill1694_6])).b;
    }
    if (!((lexicalValue1694_139_0 <= 0))) {
        break lexical_join_145;
    }
    lexicalValue1694_143_0 = this.p;
    lexicalValue1694_143_1 = 3;
    }
    (lexicalValue1694_143_0)[lexicalValue1694_143_1] = null;
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_240e736e888e_originalDynamicSite2043_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1693_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12269_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_03d9340fa09f_invokedynamic1691_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_03d9340fa09f_invokedynamic1691_15(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
