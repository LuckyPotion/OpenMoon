package moom;


public class cP extends net.minecraft.block.Block {

public static final moom.fy Q;

private static final long R;

private static final long S;

public cP() {
super(moom.fn.f, moom.fm.m);
    (this).a__Void(((this.M).a__fE()).a__fE(moom.cP.Q, java.lang.Integer.valueOf(0)));
}


static {
R = ((long)(((moom._a)(moom._c.a(((long)(827255497720105847L)), ((long)(-2591019469226038767L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(43268529483350L)))));
    long local0_life6 = (moom.cP.R ^ 58446306534851L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill789_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill789_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill789_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill789_13 = new byte[8];
    (__sourceSpill789_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill789_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation789_15 = __sourceSpill789_13;
    ((javax.crypto.Cipher)(__sourceSpill789_10)).init(((int)(__sourceSpill789_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill789_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation789_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -390386837957679951L;
    byte[] __sourceSpill789_19 = new byte[8];
    (__sourceSpill789_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill789_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill789_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill789_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill789_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill789_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill789_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill789_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill789_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill789_20)).doFinal(((byte[])(__sourceSpill789_19)));
    S = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    Q = ((moom.fy)(moom.fy.a(((java.lang.String)("level")), ((int)(0)), ((int)(3)))));
}


public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, int p3) {
((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.cP.Q)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(moom.Dr.a(((int)(p3)), ((int)(0)), ((int)(3))))))))))), ((int)(2)));
    ((net.minecraft.world.World)(p0)).d(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)));
    return;
}


public int b(net.minecraft.world.World p0, moom.DT p1) {
return ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))).a(((net.minecraft.block.properties.IProperty)(moom.cP.Q))))))).intValue();
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((moom.cP)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cP.Q)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(p0))))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cP.Q))))))).intValue();
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return net.minecraft.init.Items.bv;
}


public net.minecraft.item.Item a__wQ(net.minecraft.world.World p0, moom.DT p1) {
return net.minecraft.init.Items.bv;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.cP.Q});
}


public void a__Void() {
((moom.cP)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.CA p3, java.util.List<moom.CA> p4, net.minecraft.entity.Entity p5) {
((moom.cP)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.4p-2f)), ((float)(0x1.0p0f)));
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.CA)(p3)), ((java.util.List)(p4)), ((net.minecraft.entity.Entity)(p5)));
    float local7 = 0x1.0p-3f;
    ((moom.cP)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(local7)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.CA)(p3)), ((java.util.List)(p4)), ((net.minecraft.entity.Entity)(p5)));
    ((moom.cP)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(local7)));
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.CA)(p3)), ((java.util.List)(p4)), ((net.minecraft.entity.Entity)(p5)));
    ((moom.cP)(this)).a(((float)((0x1.0p0f - local7))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.CA)(p3)), ((java.util.List)(p4)), ((net.minecraft.entity.Entity)(p5)));
    ((moom.cP)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)((0x1.0p0f - local7))), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.CA)(p3)), ((java.util.List)(p4)), ((net.minecraft.entity.Entity)(p5)));
    ((moom.cP)(this)).a__Void();
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.Entity p3) {
int forwardValue3085_32_0;
    int forwardValue3085_36_0;
    int forwardValue3085_47_0;
    net.minecraft.entity.Entity forwardValue3085_49_0;
    int[] spill3085_0;
    boolean spill3085_1;
    net.minecraft.entity.Entity spill3085_2;
    long life5_3;
    int life8_10;
    float life9_23;
    int[] life7_24;
    forward_join_58: {
    forward_join_49: {
    forward_join_47: {
    forward_join_36: {
    forward_join_32: {
    life5_3 = (moom.cP.R ^ 51783953265809L);
    spill3085_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_10 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cP.Q))))))).intValue();
    life9_23 = (((float) ((moom.DT)(p1)).b()) + ((0x1.8p2f + ((float) (3 * life8_10))) / 0x1.0p4f));
    life7_24 = spill3085_0;
    spill3085_1 = ((net.minecraft.world.World)(p0)).G;
    if (!((life7_24 != null))) {
        forwardValue3085_32_0 = ((spill3085_1) ? 1 : 0);
        break forward_join_32;
    }
    if (!((!spill3085_1))) {
        break forward_join_58;
    }
    forwardValue3085_32_0 = ((((net.minecraft.entity.Entity)(p3)).r__Boolean()) ? 1 : 0);
    }
    if (!((life7_24 != null))) {
        forwardValue3085_36_0 = forwardValue3085_32_0;
        break forward_join_36;
    }
    if (!((forwardValue3085_32_0 != 0))) {
        break forward_join_58;
    }
    forwardValue3085_36_0 = life8_10;
    }
    if (!((life7_24 != null))) {
        forwardValue3085_47_0 = forwardValue3085_36_0;
        break forward_join_47;
    }
    if (!((forwardValue3085_36_0 > 0))) {
        break forward_join_58;
    }
    spill3085_2 = p3;
    if (!((life7_24 != null))) {
        forwardValue3085_49_0 = spill3085_2;
        break forward_join_49;
    }
    forwardValue3085_47_0 = recovery.source.CarrierOps.dcmpg(((double)(((moom.CA)(((net.minecraft.entity.Entity)(spill3085_2)).b())).c)), ((double)(((double) life9_23))));
    }
    if (!((forwardValue3085_47_0 <= 0))) {
        break forward_join_58;
    }
    forwardValue3085_49_0 = p3;
    }
    ((net.minecraft.entity.Entity)(forwardValue3085_49_0)).j();
    ((moom.cP)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)((life8_10 - 1))));
    }
    return;
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue3086_12_0;
    net.minecraft.entity.player.EntityPlayer forwardValue3086_57_0;
    int forwardValue3086_66_0;
    net.minecraft.item.Item forwardValue3086_69_0;
    net.minecraft.item.Item forwardValue3086_69_1;
    int forwardValue3086_119_0;
    int forwardValue3086_140_0;
    net.minecraft.entity.player.EntityPlayer forwardValue3086_142_0;
    int forwardValue3086_157_0;
    net.minecraft.item.ItemArmor forwardValue3086_177_0;
    int forwardValue3086_199_0;
    int forwardValue3086_245_0;
    int forwardValue3086_275_0;
    int forwardValue3086_289_0;
    int forwardValue3086_301_0;
    int forwardValue3086_313_0;
    int forwardValue3086_315_0;
    boolean spill3086_0;
    net.minecraft.item.Item spill3086_1;
    net.minecraft.item.Item spill3086_2;
    int spill3086_3;
    net.minecraft.entity.player.EntityPlayer spill3086_4;
    int spill3086_5;
    boolean spill3086_6;
    net.minecraft.entity.player.EntityPlayer spill3086_7;
    int spill3086_8;
    int spill3086_9;
    net.minecraft.item.ItemArmor spill3086_10;
    boolean spill3086_11;
    int spill3086_12;
    int spill3086_13;
    int spill3086_14;
    boolean spill3086_15;
    long life9_3;
    int[] life11_5;
    net.minecraft.item.ItemStack life12_19;
    int life13_31;
    net.minecraft.item.Item life14_34;
    net.minecraft.item.ItemStack life15_116;
    net.minecraft.item.ItemArmor life15_228;
    net.minecraft.item.ItemStack life15_299;
    forward_join_315: {
    forward_join_314: {
    forward_join_313: {
    forward_join_312: {
    forward_join_301: {
    forward_join_298: {
    forward_join_289: {
    forward_join_283: {
    forward_join_275: {
    forward_join_273: {
    forward_join_245: {
    forward_join_241: {
    forward_join_199: {
    forward_join_198: {
    forward_join_177: {
    forward_join_158: {
    forward_join_157: {
    forward_join_156: {
    forward_join_148: {
    forward_join_142: {
    forward_join_140: {
    forward_join_127: {
    forward_join_119: {
    forward_join_117: {
    forward_join_69: {
    forward_join_67: {
    forward_join_66: {
    forward_join_65: {
    forward_join_57: {
    forward_join_56: {
    forward_join_21: {
    forward_join_13: {
    forward_join_12: {
    life9_3 = (moom.cP.R ^ 61774145566704L);
    life11_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3086_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life11_5 != null))) {
        forwardValue3086_12_0 = ((spill3086_0) ? 1 : 0);
        break forward_join_12;
    }
    if (!(spill3086_0)) {
        break forward_join_13;
    }
    forwardValue3086_12_0 = 1;
    }
    return ((forwardValue3086_12_0) != 0);
    }
    life12_19 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p3)).bD)).a__xW();
    if (!((life12_19 == null))) {
        break forward_join_21;
    }
    return ((1) != 0);
    }
    life13_31 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cP.Q))))))).intValue();
    life14_34 = ((net.minecraft.item.ItemStack)(life12_19)).a__wQ();
    spill3086_1 = life14_34;
    spill3086_2 = net.minecraft.init.Items.ax;
    if (!((life11_5 != null))) {
        forwardValue3086_69_0 = spill3086_1;
        forwardValue3086_69_1 = spill3086_2;
        break forward_join_69;
    }
    if (!((spill3086_1 == spill3086_2))) {
        break forward_join_67;
    }
    spill3086_3 = life13_31;
    if (!((life11_5 != null))) {
        forwardValue3086_66_0 = spill3086_3;
        break forward_join_66;
    }
    if (!((spill3086_3 < 3))) {
        break forward_join_65;
    }
    spill3086_4 = p3;
    if (!((life11_5 != null))) {
        forwardValue3086_57_0 = spill3086_4;
        break forward_join_57;
    }
    if (!((!((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(spill3086_4)).b1)).d))) {
        break forward_join_56;
    }
    ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p3)).bD)).a__Void(((int)(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p3)).bD)).c)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.aw))));
    }
    forwardValue3086_57_0 = p3;
    }
    ((net.minecraft.entity.player.EntityPlayer)(forwardValue3086_57_0)).a(((moom.BY)(net.minecraft.stats.StatList.I)));
    ((moom.cP)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(3)));
    }
    forwardValue3086_66_0 = 1;
    }
    return ((forwardValue3086_66_0) != 0);
    }
    forwardValue3086_69_0 = life14_34;
    forwardValue3086_69_1 = net.minecraft.init.Items.bp;
    }
    if (!((forwardValue3086_69_0 == forwardValue3086_69_1))) {
        break forward_join_158;
    }
    spill3086_5 = life13_31;
    if (!((life11_5 != null))) {
        forwardValue3086_157_0 = spill3086_5;
        break forward_join_157;
    }
    if (!((spill3086_5 > 0))) {
        break forward_join_156;
    }
    if (!((!((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p3)).b1)).d))) {
        break forward_join_148;
    }
    life15_116 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.bo, 1, 0);
    spill3086_6 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p3)).bD)).a__Boolean(((net.minecraft.item.ItemStack)(life15_116)));
    if (!((life11_5 != null))) {
        forwardValue3086_119_0 = ((spill3086_6) ? 1 : 0);
        break forward_join_119;
    }
    if (!((!spill3086_6))) {
        break forward_join_117;
    }
    ((net.minecraft.world.World)(p0)).b__Boolean(((net.minecraft.entity.Entity)(new net.minecraft.entity.item.EntityItem(p0, (((double) ((moom.DT)(p1)).a()) + 0x1.0p-1d), (((double) ((moom.DT)(p1)).b()) + 0x1.8p0d), (((double) ((moom.DT)(p1)).c()) + 0x1.0p-1d), life15_116))));
    if (!((life11_5 == null))) {
        break forward_join_127;
    }
    }
    forwardValue3086_119_0 = ((p3 instanceof net.minecraft.entity.player.EntityPlayerMP) ? 1 : 0);
    }
    if (!((life11_5 != null))) {
        forwardValue3086_140_0 = forwardValue3086_119_0;
        break forward_join_140;
    }
    if (!((forwardValue3086_119_0 != 0))) {
        break forward_join_127;
    }
    ((net.minecraft.entity.player.EntityPlayerMP)(((net.minecraft.entity.player.EntityPlayerMP)(p3)))).a(((moom.v8)(((net.minecraft.entity.player.EntityPlayer)(p3)).bF)));
    }
    spill3086_7 = p3;
    if (!((life11_5 != null))) {
        forwardValue3086_142_0 = spill3086_7;
        break forward_join_142;
    }
    ((net.minecraft.entity.player.EntityPlayer)(spill3086_7)).a(((moom.BY)(net.minecraft.stats.StatList.J)));
    net.minecraft.item.ItemStack __stackOp3086_42_0 = life12_19;
    ((net.minecraft.item.ItemStack)(__stackOp3086_42_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp3086_42_0)).b - 1)));
    forwardValue3086_140_0 = ((net.minecraft.item.ItemStack)(life12_19)).b;
    }
    if (!((forwardValue3086_140_0 <= 0))) {
        break forward_join_148;
    }
    forwardValue3086_142_0 = p3;
    }
    ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(forwardValue3086_142_0)).bD)).a__Void(((int)(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p3)).bD)).c)), ((net.minecraft.item.ItemStack)(null)));
    }
    ((moom.cP)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)((life13_31 - 1))));
    }
    forwardValue3086_157_0 = 1;
    }
    return ((forwardValue3086_157_0) != 0);
    }
    spill3086_8 = life13_31;
    if (!((life11_5 != null))) {
        forwardValue3086_199_0 = spill3086_8;
        break forward_join_199;
    }
    if (!((spill3086_8 > 0))) {
        break forward_join_198;
    }
    spill3086_9 = ((life14_34 instanceof net.minecraft.item.ItemArmor) ? 1 : 0);
    if (!((life11_5 != null))) {
        forwardValue3086_199_0 = spill3086_9;
        break forward_join_199;
    }
    if (!((spill3086_9 != 0))) {
        break forward_join_198;
    }
    life15_228 = ((net.minecraft.item.ItemArmor)(life14_34));
    spill3086_10 = life15_228;
    if (!((life11_5 != null))) {
        forwardValue3086_177_0 = spill3086_10;
        break forward_join_177;
    }
    if (!((((net.minecraft.item.ItemArmor)(spill3086_10)).a__sourceReturn_2ce8a48aa6() == net.minecraft.item.ItemArmor$ArmorMaterial.LEATHER))) {
        break forward_join_198;
    }
    forwardValue3086_177_0 = life15_228;
    }
    spill3086_11 = ((net.minecraft.item.ItemArmor)(forwardValue3086_177_0)).d__sourceReturn_2aed085586(((net.minecraft.item.ItemStack)(life12_19)));
    if (!((life11_5 != null))) {
        forwardValue3086_199_0 = ((spill3086_11) ? 1 : 0);
        break forward_join_199;
    }
    if (!(spill3086_11)) {
        break forward_join_198;
    }
    ((net.minecraft.item.ItemArmor)(life15_228)).a(((net.minecraft.item.ItemStack)(life12_19)));
    ((moom.cP)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)((life13_31 - 1))));
    ((net.minecraft.entity.player.EntityPlayer)(p3)).a(((moom.BY)(net.minecraft.stats.StatList.K)));
    return ((1) != 0);
    }
    forwardValue3086_199_0 = life13_31;
    }
    if (!((life11_5 != null))) {
        forwardValue3086_315_0 = forwardValue3086_199_0;
        break forward_join_315;
    }
    if (!((forwardValue3086_199_0 > 0))) {
        break forward_join_314;
    }
    spill3086_12 = ((life14_34 instanceof moom.wV) ? 1 : 0);
    if (!((life11_5 != null))) {
        forwardValue3086_315_0 = spill3086_12;
        break forward_join_315;
    }
    if (!((spill3086_12 != 0))) {
        break forward_join_314;
    }
    spill3086_13 = moom.Ca.b(((net.minecraft.item.ItemStack)(life12_19)));
    if (!((life11_5 != null))) {
        forwardValue3086_315_0 = spill3086_13;
        break forward_join_315;
    }
    if (!((spill3086_13 > 0))) {
        break forward_join_314;
    }
    life15_299 = ((net.minecraft.item.ItemStack)(life12_19)).a__xW();
    ((net.minecraft.item.ItemStack)(life15_299)).b = ((int)(1));
    moom.Ca.b__Void(((net.minecraft.item.ItemStack)(life15_299)));
    spill3086_14 = ((net.minecraft.item.ItemStack)(life12_19)).b;
    if (!((life11_5 != null))) {
        forwardValue3086_245_0 = spill3086_14;
        break forward_join_245;
    }
    if (!((spill3086_14 <= 1))) {
        break forward_join_241;
    }
    spill3086_15 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p3)).b1)).d;
    if (!((life11_5 != null))) {
        forwardValue3086_245_0 = ((spill3086_15) ? 1 : 0);
        break forward_join_245;
    }
    if (!((!spill3086_15))) {
        break forward_join_241;
    }
    ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p3)).bD)).a__Void(((int)(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p3)).bD)).c)), ((net.minecraft.item.ItemStack)(life15_299)));
    if (!((life11_5 == null))) {
        break forward_join_298;
    }
    }
    forwardValue3086_245_0 = ((((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p3)).bD)).a__Boolean(((net.minecraft.item.ItemStack)(life15_299)))) ? 1 : 0);
    }
    if (!((life11_5 != null))) {
        forwardValue3086_275_0 = forwardValue3086_245_0;
        break forward_join_275;
    }
    if (!((forwardValue3086_245_0 == 0))) {
        break forward_join_273;
    }
    ((net.minecraft.world.World)(p0)).b__Boolean(((net.minecraft.entity.Entity)(new net.minecraft.entity.item.EntityItem(p0, (((double) ((moom.DT)(p1)).a()) + 0x1.0p-1d), (((double) ((moom.DT)(p1)).b()) + 0x1.8p0d), (((double) ((moom.DT)(p1)).c()) + 0x1.0p-1d), life15_299))));
    if (!((life11_5 == null))) {
        break forward_join_283;
    }
    }
    forwardValue3086_275_0 = ((p3 instanceof net.minecraft.entity.player.EntityPlayerMP) ? 1 : 0);
    }
    if (!((life11_5 != null))) {
        forwardValue3086_289_0 = forwardValue3086_275_0;
        break forward_join_289;
    }
    if (!((forwardValue3086_275_0 != 0))) {
        break forward_join_283;
    }
    ((net.minecraft.entity.player.EntityPlayerMP)(((net.minecraft.entity.player.EntityPlayerMP)(p3)))).a(((moom.v8)(((net.minecraft.entity.player.EntityPlayer)(p3)).bF)));
    }
    ((net.minecraft.entity.player.EntityPlayer)(p3)).a(((moom.BY)(net.minecraft.stats.StatList.L)));
    forwardValue3086_289_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p3)).b1)).d) ? 1 : 0);
    }
    if (!((life11_5 != null))) {
        forwardValue3086_301_0 = forwardValue3086_289_0;
        break forward_join_301;
    }
    if (!((forwardValue3086_289_0 == 0))) {
        break forward_join_298;
    }
    net.minecraft.item.ItemStack __stackOp3086_92_0 = life12_19;
    ((net.minecraft.item.ItemStack)(__stackOp3086_92_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp3086_92_0)).b - 1)));
    }
    forwardValue3086_301_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p3)).b1)).d) ? 1 : 0);
    }
    if (!((life11_5 != null))) {
        forwardValue3086_313_0 = forwardValue3086_301_0;
        break forward_join_313;
    }
    if (!((forwardValue3086_301_0 == 0))) {
        break forward_join_312;
    }
    ((moom.cP)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)((life13_31 - 1))));
    }
    forwardValue3086_313_0 = 1;
    }
    return ((forwardValue3086_313_0) != 0);
    }
    forwardValue3086_315_0 = 0;
    }
    return ((forwardValue3086_315_0) != 0);
}


public void a__Void(net.minecraft.world.World p0, moom.DT p1) {
net.minecraft.world.World forwardValue3087_16_0;
    int forwardValue3087_35_0;
    net.minecraft.world.World spill3087_0;
    int spill3087_1;
    long life3_3;
    int[] life5_5;
    net.minecraft.block.state.IBlockState life6_24;
    forward_join_36: {
    forward_join_35: {
    forward_join_16: {
    life3_3 = (moom.cP.R ^ 25260045741282L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3087_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue3087_16_0 = spill3087_0;
        break forward_join_16;
    }
    if (!((((java.util.Random)(((net.minecraft.world.World)(spill3087_0)).u)).nextInt(((int)(((int) moom.cP.S)))) == 1))) {
        break forward_join_36;
    }
    forwardValue3087_16_0 = p0;
    }
    life6_24 = ((net.minecraft.world.World)(forwardValue3087_16_0)).a__fE(((moom.DT)(p1)));
    spill3087_1 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(life6_24)).a(((net.minecraft.block.properties.IProperty)(moom.cP.Q))))))).intValue();
    if (!((life5_5 != null))) {
        forwardValue3087_35_0 = spill3087_1;
        break forward_join_35;
    }
    if (!((spill3087_1 < 3))) {
        break forward_join_36;
    }
    forwardValue3087_35_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(life6_24)).a__fE(((net.minecraft.block.properties.IProperty)(moom.cP.Q))))), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3087_35_0);
    }
    return;
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


public boolean r() {
return ((1) != 0);
}

}
