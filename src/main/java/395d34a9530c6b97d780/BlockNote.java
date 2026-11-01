package net.minecraft.block;


public class BlockNote extends moom.cT {

private static final java.util.List<java.lang.String> R;

private static final long S;

private static final long T;

public BlockNote() {
super(moom.fn.d);
    (this).a(net.minecraft.creativetab.CreativeTabs.d);
}


static {
S = ((long)(((moom._a)(moom._c.a(((long)(-9066578760731301196L)), ((long)(5503736893566244360L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(202574616780074L)))));
    long local0_life6 = (net.minecraft.block.BlockNote.S ^ 5182711866652L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1156_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1156_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1156_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1156_13 = new byte[8];
    (__sourceSpill1156_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1156_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1156_15 = __sourceSpill1156_13;
    ((javax.crypto.Cipher)(__sourceSpill1156_10)).init(((int)(__sourceSpill1156_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1156_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1156_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -4748898988570752748L;
    byte[] __sourceSpill1156_19 = new byte[8];
    (__sourceSpill1156_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1156_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1156_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1156_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1156_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1156_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1156_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1156_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1156_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1156_20)).doFinal(((byte[])(__sourceSpill1156_19)));
    T = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    java.lang.String[] __sourceSpill1156_24 = new java.lang.String[5];
    (__sourceSpill1156_24)[0] = "harp";
    (__sourceSpill1156_24)[1] = "bd";
    (__sourceSpill1156_24)[2] = "snare";
    (__sourceSpill1156_24)[3] = "hat";
    (__sourceSpill1156_24)[4] = "bassattack";
    R = ((java.util.List)(com.google.common.collect.Lists.newArrayList(((java.lang.Object[])(__sourceSpill1156_24)))));
}


public int c__Int() {
return 3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, int p3, int p4) {
long local6 = (net.minecraft.block.BlockNote.S ^ 28249763460877L);
    float local8 = ((float) java.lang.Math.pow(((double)(0x1.0p1d)), ((double)((((double) (p4 - ((int) net.minecraft.block.BlockNote.T))) / 0x1.8p3d)))));
    ((net.minecraft.world.World)(p0)).a(((double)((((double) ((moom.DT)(p1)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(p1)).b()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(p1)).c()) + 0x1.0p-1d))), ((java.lang.String)(__sourceIntrinsic_19a005593b00_originalDynamicSite1757_7(((net.minecraft.block.BlockNote)(this)).a__sourceReturn_b52d34d971(((int)(p3)))))), ((float)(0x1.8p1f)), ((float)(local8)));
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.NOTE)), ((double)((((double) ((moom.DT)(p1)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(p1)).b()) + 0x1.3333333333333p0d))), ((double)((((double) ((moom.DT)(p1)).c()) + 0x1.0p-1d))), ((double)((((double) p4) / 0x1.8p4d))), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    return true;
}


private java.lang.String a__sourceReturn_b52d34d971(int p0) {
int forwardValue4705_17_0;
    int spill4705_0;
    int spill4705_1;
    long life2_3;
    int[] life4_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (net.minecraft.block.BlockNote.S ^ 121482874152362L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4705_0 = p0;
    if (!((life4_5 != null))) {
        forwardValue4705_17_0 = spill4705_0;
        break forward_join_17;
    }
    if (!((spill4705_0 >= 0))) {
        break forward_join_16;
    }
    spill4705_1 = p0;
    if (!((life4_5 != null))) {
        forwardValue4705_17_0 = spill4705_1;
        break forward_join_17;
    }
    if (!((spill4705_1 >= ((java.util.List)(net.minecraft.block.BlockNote.R)).size()))) {
        break forward_join_18;
    }
    }
    forwardValue4705_17_0 = 0;
    }
    p0 = forwardValue4705_17_0;
    }
    return ((java.lang.String)(((java.util.List)(net.minecraft.block.BlockNote.R)).get(((int)(p0)))));
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
net.minecraft.tileentity.TileEntity forwardValue4706_20_0;
    int forwardValue4706_29_0;
    int[] spill4706_0;
    net.minecraft.tileentity.TileEntity spill4706_1;
    boolean spill4706_2;
    long life5_3;
    int life8_8;
    net.minecraft.tileentity.TileEntity life9_12;
    int[] life7_13;
    moom.Cr life10_27;
    forward_join_37: {
    forward_join_34: {
    forward_join_29: {
    forward_join_20: {
    life5_3 = (net.minecraft.block.BlockNote.S ^ 15767231308676L);
    spill4706_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_8 = ((((net.minecraft.world.World)(p0)).l(((moom.DT)(p1)))) ? 1 : 0);
    life9_12 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    life7_13 = spill4706_0;
    spill4706_1 = life9_12;
    if (!((life7_13 != null))) {
        forwardValue4706_20_0 = spill4706_1;
        break forward_join_20;
    }
    if (!((((spill4706_1 instanceof moom.Cr) ? 1 : 0) != 0))) {
        break forward_join_37;
    }
    forwardValue4706_20_0 = life9_12;
    }
    life10_27 = ((moom.Cr)(forwardValue4706_20_0));
    spill4706_2 = ((moom.Cr)(life10_27)).m;
    if (!((life7_13 != null))) {
        forwardValue4706_29_0 = ((spill4706_2) ? 1 : 0);
        break forward_join_29;
    }
    if (!((((spill4706_2) ? 1 : 0) != life8_8))) {
        break forward_join_37;
    }
    forwardValue4706_29_0 = life8_8;
    }
    if (!((forwardValue4706_29_0 != 0))) {
        break forward_join_34;
    }
    ((moom.Cr)(life10_27)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    }
    ((moom.Cr)(life10_27)).m = ((boolean)__sourceIntrinsic_integerToBoolean((life8_8)));
    }
    return;
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue4707_33_0;
    boolean spill4707_0;
    int spill4707_1;
    long life9_3;
    int[] life11_5;
    net.minecraft.tileentity.TileEntity life12_17;
    moom.Cr life13_28;
    forward_join_33: {
    forward_join_32: {
    life9_3 = (net.minecraft.block.BlockNote.S ^ 136250325984914L);
    life11_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4707_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life11_5 != null))) {
        forwardValue4707_33_0 = ((spill4707_0) ? 1 : 0);
        break forward_join_33;
    }
    if (!((!spill4707_0))) {
        break forward_join_32;
    }
    life12_17 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    spill4707_1 = ((life12_17 instanceof moom.Cr) ? 1 : 0);
    if (!((life11_5 != null))) {
        forwardValue4707_33_0 = spill4707_1;
        break forward_join_33;
    }
    if (!((spill4707_1 != 0))) {
        break forward_join_32;
    }
    life13_28 = ((moom.Cr)(life12_17));
    ((moom.Cr)(life13_28)).b();
    ((moom.Cr)(life13_28)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    ((net.minecraft.entity.player.EntityPlayer)(p3)).a(((moom.BY)(net.minecraft.stats.StatList.S)));
    }
    forwardValue4707_33_0 = 1;
    }
    return ((forwardValue4707_33_0) != 0);
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.entity.player.EntityPlayer p2) {
net.minecraft.world.World forwardValue4708_12_0;
    net.minecraft.tileentity.TileEntity forwardValue4708_21_0;
    net.minecraft.world.World spill4708_0;
    net.minecraft.tileentity.TileEntity spill4708_1;
    long life4_3;
    int[] life6_5;
    net.minecraft.tileentity.TileEntity life7_20;
    forward_join_28: {
    forward_join_21: {
    forward_join_12: {
    life4_3 = (net.minecraft.block.BlockNote.S ^ 8970607625723L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4708_0 = p0;
    if (!((life6_5 != null))) {
        forwardValue4708_12_0 = spill4708_0;
        break forward_join_12;
    }
    if (!((!((net.minecraft.world.World)(spill4708_0)).G))) {
        break forward_join_28;
    }
    forwardValue4708_12_0 = p0;
    }
    life7_20 = ((net.minecraft.world.World)(forwardValue4708_12_0)).a__B9(((moom.DT)(p1)));
    spill4708_1 = life7_20;
    if (!((life6_5 != null))) {
        forwardValue4708_21_0 = spill4708_1;
        break forward_join_21;
    }
    if (!((((spill4708_1 instanceof moom.Cr) ? 1 : 0) != 0))) {
        break forward_join_28;
    }
    forwardValue4708_21_0 = life7_20;
    }
    ((moom.Cr)(((moom.Cr)(forwardValue4708_21_0)))).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    ((net.minecraft.entity.player.EntityPlayer)(p2)).a(((moom.BY)(net.minecraft.stats.StatList.R)));
    }
    return;
}


public net.minecraft.tileentity.TileEntity a(net.minecraft.world.World p0, int p1) {
return new moom.Cr();
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_19a005593b00_originalDynamicSite1757_7(java.lang.String a0) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
