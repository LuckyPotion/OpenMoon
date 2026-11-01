package moom;


public class w9 extends net.minecraft.item.Item {

private final net.minecraft.block.Block n;

private static final long o;

private static final long p;

public w9(net.minecraft.block.Block p0) {
super();
    this.f = 1;
    this.n = p0;
    (this).a(net.minecraft.creativetab.CreativeTabs.f);
}


static {
o = ((long)(((moom._a)(moom._c.a(((long)(-5985817569475215056L)), ((long)(648524359750251633L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(159829309669187L)))));
    long local0_life6 = (moom.w9.o ^ 121056722647509L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1083_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1083_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1083_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1083_13 = new byte[8];
    (__sourceSpill1083_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1083_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1083_15 = __sourceSpill1083_13;
    ((javax.crypto.Cipher)(__sourceSpill1083_10)).init(((int)(__sourceSpill1083_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1083_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1083_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 7081995442177136132L;
    byte[] __sourceSpill1083_19 = new byte[8];
    (__sourceSpill1083_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1083_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1083_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1083_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1083_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1083_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1083_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1083_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1083_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1083_20)).doFinal(((byte[])(__sourceSpill1083_19)));
    p = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a(net.minecraft.world.World p0, moom.DT p1) {
net.minecraft.block.Block lexicalValue1365_18_0;
    int lexicalValue1365_26_0;
    int lexicalValue1365_28_0;
    int lexicalValue1365_44_0;
    int lexicalValue1365_125_0;
    int lexicalValue1365_149_0;
    net.minecraft.block.Block spill1365_0;
    boolean spill1365_1;
    boolean spill1365_2;
    int spill1365_3;
    int spill1365_4;
    boolean spill1365_5;
    long life3_3;
    int life5_5;
    moom.fn life6_24;
    int life7_36;
    int life8_78;
    int life9_81;
    int life10_84;
    int life11_116;
    lexical_join_150: {
    lexical_join_149: {
    lexical_join_142: {
    lexical_join_125: {
    lexical_join_123: {
    lexical_join_121: {
    lexical_join_44: {
    lexical_join_41: {
    lexical_join_28: {
    lexical_join_27: {
    lexical_join_26: {
    lexical_join_18: {
    lexical_join_14: {
    life3_3 = (moom.w9.o ^ 8270433337435L);
    life5_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill1365_0 = this.n;
    if (!((life5_5 == 0))) {
        lexicalValue1365_18_0 = spill1365_0;
        break lexical_join_18;
    }
    if (!((spill1365_0 == net.minecraft.init.Blocks.a))) {
        break lexical_join_14;
    }
    return ((0) != 0);
    }
    lexicalValue1365_18_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))).a__ch();
    }
    life6_24 = ((net.minecraft.block.Block)(lexicalValue1365_18_0)).a__fn();
    spill1365_1 = ((moom.fn)(life6_24)).b__Boolean();
    if (!((life5_5 == 0))) {
        lexicalValue1365_26_0 = ((spill1365_1) ? 1 : 0);
        break lexical_join_26;
    }
    if (!((!spill1365_1))) {
        break lexical_join_27;
    }
    lexicalValue1365_26_0 = 1;
    }
    lexicalValue1365_28_0 = lexicalValue1365_26_0;
    break lexical_join_28;
    }
    lexicalValue1365_28_0 = 0;
    }
    life7_36 = lexicalValue1365_28_0;
    spill1365_2 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(p1)));
    if (!((life5_5 == 0))) {
        lexicalValue1365_44_0 = ((spill1365_2) ? 1 : 0);
        break lexical_join_44;
    }
    if (!((!spill1365_2))) {
        break lexical_join_41;
    }
    spill1365_3 = life7_36;
    if (!((life5_5 == 0))) {
        lexicalValue1365_44_0 = spill1365_3;
        break lexical_join_44;
    }
    if (!((spill1365_3 == 0))) {
        break lexical_join_41;
    }
    return ((0) != 0);
    }
    lexicalValue1365_44_0 = ((((moom.EA)(((net.minecraft.world.World)(p0)).v)).d()) ? 1 : 0);
    }
    if (!((life5_5 == 0))) {
        lexicalValue1365_125_0 = lexicalValue1365_44_0;
        break lexical_join_125;
    }
    if (!((lexicalValue1365_44_0 != 0))) {
        break lexical_join_123;
    }
    if (!((this.n == net.minecraft.init.Blocks.i))) {
        break lexical_join_123;
    }
    life8_78 = ((moom.DT)(p1)).a();
    life9_81 = ((moom.DT)(p1)).b();
    life10_84 = ((moom.DT)(p1)).c();
    ((net.minecraft.world.World)(p0)).a(((double)(((double) (((float) life8_78) + 0x1.0p-1f)))), ((double)(((double) (((float) life9_81) + 0x1.0p-1f)))), ((double)(((double) (((float) life10_84) + 0x1.0p-1f)))), ((java.lang.String)("random.fizz")), ((float)(0x1.0p-1f)), ((float)((0x1.4cccccp1f + ((((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextFloat() - ((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextFloat()) * 0x1.99999ap-1f)))));
    life11_116 = 0;
    lexical_cycle_92: while (true) {
    if (!((life11_116 < ((int) moom.w9.p)))) {
        break lexical_join_121;
    }
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SMOKE_LARGE)), ((double)((((double) life8_78) + java.lang.Math.random()))), ((double)((((double) life9_81) + java.lang.Math.random()))), ((double)((((double) life10_84) + java.lang.Math.random()))), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    life11_116 += 1;
    if (!((life5_5 == 0))) {
        break lexical_join_150;
    }
    if (!((life5_5 != 0))) { continue lexical_cycle_92; }
    break lexical_cycle_92;
    }
    }
    if (!((life5_5 != 0))) {
        break lexical_join_150;
    }
    }
    lexicalValue1365_125_0 = ((((net.minecraft.world.World)(p0)).G) ? 1 : 0);
    }
    if (!((life5_5 == 0))) {
        lexicalValue1365_149_0 = lexicalValue1365_125_0;
        break lexical_join_149;
    }
    if (!((lexicalValue1365_125_0 == 0))) {
        break lexical_join_142;
    }
    spill1365_4 = life7_36;
    if (!((life5_5 == 0))) {
        lexicalValue1365_149_0 = spill1365_4;
        break lexical_join_149;
    }
    if (!((spill1365_4 != 0))) {
        break lexical_join_142;
    }
    spill1365_5 = ((moom.fn)(life6_24)).a__Boolean();
    if (!((life5_5 == 0))) {
        lexicalValue1365_149_0 = ((spill1365_5) ? 1 : 0);
        break lexical_join_149;
    }
    if (!((!spill1365_5))) {
        break lexical_join_142;
    }
    ((net.minecraft.world.World)(p0)).b(((moom.DT)(p1)), ((boolean)(true)));
    }
    lexicalValue1365_149_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(this.n)).a__fE())), ((int)(3)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1365_149_0);
    }
    return ((1) != 0);
}


private net.minecraft.item.ItemStack a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, net.minecraft.item.Item p2) {
int forwardValue4346_21_0;
    int forwardValue4346_38_0;
    net.minecraft.entity.player.EntityPlayer forwardValue4346_40_0;
    boolean spill4346_0;
    int spill4346_1;
    net.minecraft.entity.player.EntityPlayer spill4346_2;
    long life4_3;
    int life6_5;
    forward_join_49: {
    forward_join_40: {
    forward_join_38: {
    forward_join_29: {
    forward_join_21: {
    forward_join_14: {
    life4_3 = (moom.w9.o ^ 103654442620493L);
    life6_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill4346_0 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p1)).b1)).d;
    if (!((life6_5 != 0))) {
        forwardValue4346_21_0 = ((spill4346_0) ? 1 : 0);
        break forward_join_21;
    }
    if (!(spill4346_0)) {
        break forward_join_14;
    }
    return p0;
    }
    net.minecraft.item.ItemStack __stackOp4346_6_0 = p0;
    net.minecraft.item.ItemStack __stackOp4346_8_0 = __stackOp4346_6_0;
    int __stackOp4346_8_1 = (((net.minecraft.item.ItemStack)(__stackOp4346_6_0)).b - 1);
    spill4346_1 = __stackOp4346_8_1;
    ((net.minecraft.item.ItemStack)(__stackOp4346_8_0)).b = ((int)(__stackOp4346_8_1));
    forwardValue4346_21_0 = spill4346_1;
    }
    if (!((life6_5 != 0))) {
        forwardValue4346_38_0 = forwardValue4346_21_0;
        break forward_join_38;
    }
    if (!((forwardValue4346_21_0 <= 0))) {
        break forward_join_29;
    }
    return new net.minecraft.item.ItemStack(p2);
    }
    spill4346_2 = p1;
    if (!((life6_5 != 0))) {
        forwardValue4346_40_0 = spill4346_2;
        break forward_join_40;
    }
    forwardValue4346_38_0 = ((((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(spill4346_2)).bD)).a__Boolean(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(p2))))) ? 1 : 0);
    }
    if (!((forwardValue4346_38_0 == 0))) {
        break forward_join_49;
    }
    forwardValue4346_40_0 = p1;
    }
    ((net.minecraft.entity.player.EntityPlayer)(forwardValue4346_40_0)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(p2, 1, 0))), ((boolean)(false)));
    }
    return p0;
}


public net.minecraft.item.ItemStack a(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2) {
int forwardValue4347_13_0;
    net.minecraft.util.MovingObjectPosition forwardValue4347_25_0;
    net.minecraft.util.MovingObjectPosition forwardValue4347_31_0;
    int forwardValue4347_43_0;
    int forwardValue4347_55_0;
    int forwardValue4347_82_0;
    moom.fn forwardValue4347_97_0;
    moom.fn forwardValue4347_97_1;
    int forwardValue4347_109_0;
    int forwardValue4347_153_0;
    int forwardValue4347_161_0;
    net.minecraft.entity.player.EntityPlayer forwardValue4347_163_0;
    net.minecraft.util.MovingObjectPosition spill4347_0;
    boolean spill4347_1;
    moom.fn spill4347_2;
    moom.fn spill4347_3;
    int spill4347_4;
    int spill4347_5;
    boolean spill4347_6;
    net.minecraft.entity.player.EntityPlayer spill4347_7;
    long life4_3;
    int life6_5;
    int life7_15;
    net.minecraft.util.MovingObjectPosition life8_21;
    moom.DT life9_43;
    net.minecraft.block.state.IBlockState life10_85;
    moom.fn life11_89;
    moom.DT life10_187;
    forward_join_173: {
    forward_join_163: {
    forward_join_161: {
    forward_join_153: {
    forward_join_149: {
    forward_join_133: {
    forward_join_124: {
    forward_join_122: {
    forward_join_109: {
    forward_join_97: {
    forward_join_95: {
    forward_join_82: {
    forward_join_58: {
    forward_join_55: {
    forward_join_43: {
    forward_join_42: {
    forward_join_31: {
    forward_join_25: {
    forward_join_13: {
    forward_join_12: {
    life4_3 = (moom.w9.o ^ 43287665487249L);
    life6_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    if (!((this.n == net.minecraft.init.Blocks.a))) {
        break forward_join_12;
    }
    forwardValue4347_13_0 = 1;
    break forward_join_13;
    }
    forwardValue4347_13_0 = 0;
    }
    life7_15 = forwardValue4347_13_0;
    life8_21 = ((moom.w9)(this)).a(((net.minecraft.world.World)(p1)), ((net.minecraft.entity.player.EntityPlayer)(p2)), ((boolean)__sourceIntrinsic_integerToBoolean((life7_15))));
    spill4347_0 = life8_21;
    if (!((life6_5 == 0))) {
        forwardValue4347_25_0 = spill4347_0;
        break forward_join_25;
    }
    if (!((spill4347_0 != null))) {
        break forward_join_173;
    }
    forwardValue4347_25_0 = life8_21;
    }
    if (!((life6_5 == 0))) {
        forwardValue4347_31_0 = forwardValue4347_25_0;
        break forward_join_31;
    }
    if (!((((net.minecraft.util.MovingObjectPosition)(forwardValue4347_25_0)).b == net.minecraft.util.MovingObjectPosition$MovingObjectType.BLOCK))) {
        break forward_join_173;
    }
    forwardValue4347_31_0 = life8_21;
    }
    life9_43 = ((net.minecraft.util.MovingObjectPosition)(forwardValue4347_31_0)).a();
    spill4347_1 = ((net.minecraft.world.World)(p1)).a(((net.minecraft.entity.player.EntityPlayer)(p2)), ((moom.DT)(life9_43)));
    if (!((life6_5 == 0))) {
        forwardValue4347_43_0 = ((spill4347_1) ? 1 : 0);
        break forward_join_43;
    }
    if (!((!spill4347_1))) {
        break forward_join_42;
    }
    return p0;
    }
    forwardValue4347_43_0 = life7_15;
    }
    if (!((life6_5 == 0))) {
        forwardValue4347_55_0 = forwardValue4347_43_0;
        break forward_join_55;
    }
    if (!((forwardValue4347_43_0 != 0))) {
        break forward_join_124;
    }
    forwardValue4347_55_0 = ((((net.minecraft.entity.player.EntityPlayer)(p2)).a(((moom.DT)(((moom.DT)(life9_43)).a(((moom.bs)(((net.minecraft.util.MovingObjectPosition)(life8_21)).c))))), ((moom.bs)(((net.minecraft.util.MovingObjectPosition)(life8_21)).c)), ((net.minecraft.item.ItemStack)(p0)))) ? 1 : 0);
    }
    if (!((forwardValue4347_55_0 == 0))) {
        break forward_join_58;
    }
    return p0;
    }
    life10_85 = ((net.minecraft.world.World)(p1)).a__fE(((moom.DT)(life9_43)));
    life11_89 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life10_85)).a__ch())).a__fn();
    spill4347_2 = life11_89;
    spill4347_3 = moom.fn.h;
    if (!((life6_5 == 0))) {
        forwardValue4347_97_0 = spill4347_2;
        forwardValue4347_97_1 = spill4347_3;
        break forward_join_97;
    }
    if (!((spill4347_2 == spill4347_3))) {
        break forward_join_95;
    }
    spill4347_4 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(life10_85)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockLiquid.Q))))))).intValue();
    if (!((life6_5 == 0))) {
        forwardValue4347_82_0 = spill4347_4;
        break forward_join_82;
    }
    if (!((spill4347_4 == 0))) {
        break forward_join_95;
    }
    forwardValue4347_82_0 = ((((net.minecraft.world.World)(p1)).d__Boolean(((moom.DT)(life9_43)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4347_82_0);
    ((net.minecraft.entity.player.EntityPlayer)(p2)).a(((moom.BY)((net.minecraft.stats.StatList.ad)[net.minecraft.item.Item.a(((net.minecraft.item.Item)(this)))])));
    return ((moom.w9)(this)).a(((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.entity.player.EntityPlayer)(p2)), ((net.minecraft.item.Item)(net.minecraft.init.Items.ax)));
    }
    forwardValue4347_97_0 = life11_89;
    forwardValue4347_97_1 = moom.fn.i;
    }
    if (!((forwardValue4347_97_0 == forwardValue4347_97_1))) {
        break forward_join_122;
    }
    spill4347_5 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(life10_85)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockLiquid.Q))))))).intValue();
    if (!((life6_5 == 0))) {
        forwardValue4347_109_0 = spill4347_5;
        break forward_join_109;
    }
    if (!((spill4347_5 == 0))) {
        break forward_join_122;
    }
    forwardValue4347_109_0 = ((((net.minecraft.world.World)(p1)).d__Boolean(((moom.DT)(life9_43)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4347_109_0);
    ((net.minecraft.entity.player.EntityPlayer)(p2)).a(((moom.BY)((net.minecraft.stats.StatList.ad)[net.minecraft.item.Item.a(((net.minecraft.item.Item)(this)))])));
    return ((moom.w9)(this)).a(((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.entity.player.EntityPlayer)(p2)), ((net.minecraft.item.Item)(net.minecraft.init.Items.ay)));
    }
    if (!((life6_5 != 0))) {
        break forward_join_173;
    }
    }
    if (!((this.n == net.minecraft.init.Blocks.a))) {
        break forward_join_133;
    }
    return new net.minecraft.item.ItemStack(net.minecraft.init.Items.aw);
    }
    life10_187 = ((moom.DT)(life9_43)).a(((moom.bs)(((net.minecraft.util.MovingObjectPosition)(life8_21)).c)));
    spill4347_6 = ((net.minecraft.entity.player.EntityPlayer)(p2)).a(((moom.DT)(life10_187)), ((moom.bs)(((net.minecraft.util.MovingObjectPosition)(life8_21)).c)), ((net.minecraft.item.ItemStack)(p0)));
    if (!((life6_5 == 0))) {
        forwardValue4347_153_0 = ((spill4347_6) ? 1 : 0);
        break forward_join_153;
    }
    if (!((!spill4347_6))) {
        break forward_join_149;
    }
    return p0;
    }
    forwardValue4347_153_0 = ((((moom.w9)(this)).a(((net.minecraft.world.World)(p1)), ((moom.DT)(life10_187)))) ? 1 : 0);
    }
    if (!((life6_5 == 0))) {
        forwardValue4347_161_0 = forwardValue4347_153_0;
        break forward_join_161;
    }
    if (!((forwardValue4347_153_0 != 0))) {
        break forward_join_173;
    }
    spill4347_7 = p2;
    if (!((life6_5 == 0))) {
        forwardValue4347_163_0 = spill4347_7;
        break forward_join_163;
    }
    forwardValue4347_161_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(spill4347_7)).b1)).d) ? 1 : 0);
    }
    if (!((forwardValue4347_161_0 == 0))) {
        break forward_join_173;
    }
    forwardValue4347_163_0 = p2;
    }
    ((net.minecraft.entity.player.EntityPlayer)(forwardValue4347_163_0)).a(((moom.BY)((net.minecraft.stats.StatList.ad)[net.minecraft.item.Item.a(((net.minecraft.item.Item)(this)))])));
    return new net.minecraft.item.ItemStack(net.minecraft.init.Items.aw);
    }
    return p0;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
