package moom;


public class ez extends net.minecraft.block.Block {

public static final moom.fv Q;

private static final long R;

private static final long S;

public ez() {
super(moom.fn.u);
    (this).a__Void(((this.M).a__fE()).a__fE(moom.ez.Q, java.lang.Boolean.FALSE));
    (this).a(net.minecraft.creativetab.CreativeTabs.d);
}


static {
R = ((long)(((moom._a)(moom._c.a(((long)(-9042756943956720842L)), ((long)(-5596927472770298908L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(40358232239550L)))));
    long local0_life6 = (moom.ez.R ^ 133607773807056L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill835_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill835_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill835_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill835_13 = new byte[8];
    (__sourceSpill835_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill835_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation835_15 = __sourceSpill835_13;
    ((javax.crypto.Cipher)(__sourceSpill835_10)).init(((int)(__sourceSpill835_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill835_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation835_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 6334155986531815724L;
    byte[] __sourceSpill835_19 = new byte[8];
    (__sourceSpill835_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill835_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill835_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill835_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill835_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill835_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill835_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill835_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill835_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill835_20)).doFinal(((byte[])(__sourceSpill835_19)));
    S = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    Q = ((moom.fv)(moom.fv.a(((java.lang.String)("explode")))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
int forwardValue3509_15_0;
    int forwardValue3509_17_0;
    boolean spill3509_0;
    long life2_3;
    int[] life4_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life2_3 = (moom.ez.R ^ 126196081114605L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3509_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ez.Q))))))).booleanValue();
    if (!((life4_5 != null))) {
        forwardValue3509_15_0 = ((spill3509_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill3509_0)) {
        break forward_join_16;
    }
    forwardValue3509_15_0 = 1;
    }
    forwardValue3509_17_0 = forwardValue3509_15_0;
    break forward_join_17;
    }
    forwardValue3509_17_0 = 0;
    }
    return forwardValue3509_17_0;
}


public void b__Void(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int forwardValue3510_28_0;
    int[] spill3510_0;
    boolean spill3510_1;
    long life4_3;
    int[] life6_10;
    forward_join_29: {
    forward_join_28: {
    life4_3 = (moom.ez.R ^ 101781210725361L);
    spill3510_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    super.b__Void(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    life6_10 = spill3510_0;
    spill3510_1 = ((net.minecraft.world.World)(p0)).l(((moom.DT)(p1)));
    if (!((life6_10 != null))) {
        forwardValue3510_28_0 = ((spill3510_1) ? 1 : 0);
        break forward_join_28;
    }
    if (!(spill3510_1)) {
        break forward_join_29;
    }
    ((moom.ez)(this)).a__Void(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.ez.Q)), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))));
    forwardValue3510_28_0 = ((((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3510_28_0);
    }
    return;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
net.minecraft.block.state.IBlockState forwardValue3511_16_0;
    moom.fv forwardValue3511_16_1;
    int forwardValue3511_16_2;
    net.minecraft.block.state.IBlockState forwardValue3511_17_0;
    moom.fv forwardValue3511_17_1;
    net.minecraft.block.state.IBlockState forwardValue3511_18_0;
    moom.fv forwardValue3511_18_1;
    int forwardValue3511_18_2;
    net.minecraft.block.state.IBlockState spill3511_0;
    moom.fv spill3511_1;
    int spill3511_2;
    long life2_3;
    int[] life4_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (moom.ez.R ^ 139030001764071L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3511_0 = ((moom.ez)(this)).a__fE();
    spill3511_1 = moom.ez.Q;
    spill3511_2 = (p0 & 1);
    if (!((life4_5 != null))) {
        forwardValue3511_16_0 = spill3511_0;
        forwardValue3511_16_1 = spill3511_1;
        forwardValue3511_16_2 = spill3511_2;
        break forward_join_16;
    }
    if (!((spill3511_2 > 0))) {
        forwardValue3511_17_0 = spill3511_0;
        forwardValue3511_17_1 = spill3511_1;
        break forward_join_17;
    }
    forwardValue3511_16_0 = spill3511_0;
    forwardValue3511_16_1 = spill3511_1;
    forwardValue3511_16_2 = 1;
    }
    forwardValue3511_18_0 = forwardValue3511_16_0;
    forwardValue3511_18_1 = forwardValue3511_16_1;
    forwardValue3511_18_2 = forwardValue3511_16_2;
    break forward_join_18;
    }
    forwardValue3511_18_0 = forwardValue3511_17_0;
    forwardValue3511_18_1 = forwardValue3511_17_1;
    forwardValue3511_18_2 = 0;
    }
    return ((net.minecraft.block.state.IBlockState)(forwardValue3511_18_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue3511_18_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3511_18_2)))))));
}


public boolean a(moom.Ei p0) {
return ((0) != 0);
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.ez.Q});
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
int forwardValue3505_23_0;
    boolean spill3505_0;
    long life5_3;
    int[] life7_5;
    forward_join_24: {
    forward_join_23: {
    life5_3 = (moom.ez.R ^ 76929420220593L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3505_0 = ((net.minecraft.world.World)(p0)).l(((moom.DT)(p1)));
    if (!((life7_5 != null))) {
        forwardValue3505_23_0 = ((spill3505_0) ? 1 : 0);
        break forward_join_23;
    }
    if (!(spill3505_0)) {
        break forward_join_24;
    }
    ((moom.ez)(this)).a__Void(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.ez.Q)), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))));
    forwardValue3505_23_0 = ((((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3505_23_0);
    }
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, moom.Ei p2) {
long life4_3;
    moom.tK life6_28;
    life4_3 = (moom.ez.R ^ 129429927497437L);
    if ((!((net.minecraft.world.World)(p0)).G)) {
        life6_28 = new moom.tK(p0, ((double) (((float) ((moom.DT)(p1)).a()) + 0x1.0p-1f)), ((double) ((moom.DT)(p1)).b()), ((double) (((float) ((moom.DT)(p1)).c()) + 0x1.0p-1f)), ((moom.Ei)(p2)).a__sG());
        ((moom.tK)(life6_28)).aE = ((int)((((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextInt(((int)((((moom.tK)(life6_28)).aE / 4)))) + (((moom.tK)(life6_28)).aE / ((int) moom.ez.S)))));
        ((net.minecraft.world.World)(p0)).b__Boolean(((net.minecraft.entity.Entity)(life6_28)));
    }
    return;
}


public void a__Void(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
((moom.ez)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((net.minecraft.entity.EntityLivingBase)(null)));
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.EntityLivingBase p3) {
int forwardValue3507_16_0;
    boolean spill3507_0;
    long life5_3;
    int[] life7_5;
    moom.tK life8_43;
    forward_join_48: {
    forward_join_16: {
    life5_3 = (moom.ez.R ^ 122223301422549L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3507_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life7_5 != null))) {
        forwardValue3507_16_0 = ((spill3507_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!((!spill3507_0))) {
        break forward_join_48;
    }
    forwardValue3507_16_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.ez.Q))))))).booleanValue()) ? 1 : 0);
    }
    if (!((forwardValue3507_16_0 != 0))) {
        break forward_join_48;
    }
    life8_43 = new moom.tK(p0, ((double) (((float) ((moom.DT)(p1)).a()) + 0x1.0p-1f)), ((double) ((moom.DT)(p1)).b()), ((double) (((float) ((moom.DT)(p1)).c()) + 0x1.0p-1f)), p3);
    ((net.minecraft.world.World)(p0)).b__Boolean(((net.minecraft.entity.Entity)(life8_43)));
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.entity.Entity)(life8_43)), ((java.lang.String)("game.tnt.primed")), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    }
    return;
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3, moom.bs p4, float p5, float p6, float p7) {
net.minecraft.item.ItemStack forwardValue3508_13_0;
    net.minecraft.item.Item forwardValue3508_42_0;
    net.minecraft.item.Item forwardValue3508_42_1;
    int forwardValue3508_53_0;
    int forwardValue3508_64_0;
    net.minecraft.item.ItemStack spill3508_0;
    net.minecraft.item.Item spill3508_1;
    net.minecraft.item.Item spill3508_2;
    net.minecraft.item.Item spill3508_3;
    net.minecraft.item.Item spill3508_4;
    boolean spill3508_5;
    long life9_3;
    int[] life11_5;
    net.minecraft.item.Item life12_20;
    forward_join_65: {
    forward_join_64: {
    forward_join_63: {
    forward_join_53: {
    forward_join_50: {
    forward_join_42: {
    forward_join_25: {
    forward_join_13: {
    life9_3 = (moom.ez.R ^ 53102417583527L);
    life11_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3508_0 = ((net.minecraft.entity.player.EntityPlayer)(p3)).c__xW();
    if (!((life11_5 != null))) {
        forwardValue3508_13_0 = spill3508_0;
        break forward_join_13;
    }
    if (!((spill3508_0 != null))) {
        break forward_join_65;
    }
    forwardValue3508_13_0 = ((net.minecraft.entity.player.EntityPlayer)(p3)).c__xW();
    }
    life12_20 = ((net.minecraft.item.ItemStack)(forwardValue3508_13_0)).a__wQ();
    spill3508_1 = life12_20;
    spill3508_2 = net.minecraft.init.Items.d;
    if (!((life11_5 != null))) {
        forwardValue3508_42_0 = spill3508_1;
        forwardValue3508_42_1 = spill3508_2;
        break forward_join_42;
    }
    if (!((spill3508_1 != spill3508_2))) {
        break forward_join_25;
    }
    spill3508_3 = life12_20;
    spill3508_4 = net.minecraft.init.Items.bA;
    if (!((life11_5 != null))) {
        forwardValue3508_42_0 = spill3508_3;
        forwardValue3508_42_1 = spill3508_4;
        break forward_join_42;
    }
    if (!((spill3508_3 == spill3508_4))) {
        break forward_join_65;
    }
    }
    ((moom.ez)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.ez.Q)), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))), ((net.minecraft.entity.EntityLivingBase)(p3)));
    spill3508_5 = ((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)));
    if (!((life11_5 != null))) {
        forwardValue3508_53_0 = ((spill3508_5) ? 1 : 0);
        break forward_join_53;
    }
    recovery.source.CarrierOps.discard(spill3508_5);
    forwardValue3508_42_0 = life12_20;
    forwardValue3508_42_1 = net.minecraft.init.Items.d;
    }
    if (!((forwardValue3508_42_0 == forwardValue3508_42_1))) {
        break forward_join_50;
    }
    ((net.minecraft.item.ItemStack)(((net.minecraft.entity.player.EntityPlayer)(p3)).c__xW())).a(((int)(1)), ((net.minecraft.entity.EntityLivingBase)(p3)));
    if (!((life11_5 == null))) {
        break forward_join_63;
    }
    }
    forwardValue3508_53_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p3)).b1)).d) ? 1 : 0);
    }
    if (!((life11_5 != null))) {
        forwardValue3508_64_0 = forwardValue3508_53_0;
        break forward_join_64;
    }
    if (!((forwardValue3508_53_0 == 0))) {
        break forward_join_63;
    }
    net.minecraft.item.ItemStack __stackOp3508_21_0 = ((net.minecraft.entity.player.EntityPlayer)(p3)).c__xW();
    ((net.minecraft.item.ItemStack)(__stackOp3508_21_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp3508_21_0)).b - 1)));
    }
    forwardValue3508_64_0 = 1;
    }
    return ((forwardValue3508_64_0) != 0);
    }
    return super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((net.minecraft.entity.player.EntityPlayer)(p3)), ((moom.bs)(p4)), ((float)(p5)), ((float)(p6)), ((float)(p7)));
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.Entity p3) {
int forwardValue3506_15_0;
    net.minecraft.entity.Entity forwardValue3506_17_0;
    moom.ez forwardValue3506_39_0;
    net.minecraft.world.World forwardValue3506_39_1;
    moom.DT forwardValue3506_39_2;
    net.minecraft.block.state.IBlockState forwardValue3506_39_3;
    net.minecraft.entity.Entity forwardValue3506_39_4;
    moom.ez forwardValue3506_41_0;
    net.minecraft.world.World forwardValue3506_41_1;
    moom.DT forwardValue3506_41_2;
    net.minecraft.block.state.IBlockState forwardValue3506_41_3;
    moom.ez forwardValue3506_42_0;
    net.minecraft.world.World forwardValue3506_42_1;
    moom.DT forwardValue3506_42_2;
    net.minecraft.block.state.IBlockState forwardValue3506_42_3;
    net.minecraft.entity.EntityLivingBase forwardValue3506_42_4;
    boolean spill3506_0;
    net.minecraft.entity.Entity spill3506_1;
    moom.ez spill3506_2;
    net.minecraft.world.World spill3506_3;
    moom.DT spill3506_4;
    net.minecraft.block.state.IBlockState spill3506_5;
    net.minecraft.entity.Entity spill3506_6;
    long life5_3;
    int[] life7_5;
    net.minecraft.entity.projectile.EntityArrow life8_27;
    forward_join_47: {
    forward_join_42: {
    forward_join_41: {
    forward_join_39: {
    forward_join_17: {
    forward_join_15: {
    life5_3 = (moom.ez.R ^ 43421324517062L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3506_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life7_5 != null))) {
        forwardValue3506_15_0 = ((spill3506_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!((!spill3506_0))) {
        break forward_join_47;
    }
    spill3506_1 = p3;
    if (!((life7_5 != null))) {
        forwardValue3506_17_0 = spill3506_1;
        break forward_join_17;
    }
    forwardValue3506_15_0 = ((spill3506_1 instanceof net.minecraft.entity.projectile.EntityArrow) ? 1 : 0);
    }
    if (!((forwardValue3506_15_0 != 0))) {
        break forward_join_47;
    }
    forwardValue3506_17_0 = p3;
    }
    life8_27 = ((net.minecraft.entity.projectile.EntityArrow)(forwardValue3506_17_0));
    if (!(((net.minecraft.entity.projectile.EntityArrow)(life8_27)).r__Boolean())) {
        break forward_join_47;
    }
    spill3506_2 = this;
    spill3506_3 = p0;
    spill3506_4 = p1;
    spill3506_5 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.ez.Q)), ((java.lang.Comparable)(java.lang.Boolean.TRUE)));
    spill3506_6 = ((net.minecraft.entity.projectile.EntityArrow)(life8_27)).aM;
    if (!((life7_5 != null))) {
        forwardValue3506_39_0 = spill3506_2;
        forwardValue3506_39_1 = spill3506_3;
        forwardValue3506_39_2 = spill3506_4;
        forwardValue3506_39_3 = spill3506_5;
        forwardValue3506_39_4 = spill3506_6;
        break forward_join_39;
    }
    if (!((((spill3506_6 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0) != 0))) {
        forwardValue3506_41_0 = spill3506_2;
        forwardValue3506_41_1 = spill3506_3;
        forwardValue3506_41_2 = spill3506_4;
        forwardValue3506_41_3 = spill3506_5;
        break forward_join_41;
    }
    forwardValue3506_39_0 = spill3506_2;
    forwardValue3506_39_1 = spill3506_3;
    forwardValue3506_39_2 = spill3506_4;
    forwardValue3506_39_3 = spill3506_5;
    forwardValue3506_39_4 = ((net.minecraft.entity.projectile.EntityArrow)(life8_27)).aM;
    }
    forwardValue3506_42_0 = forwardValue3506_39_0;
    forwardValue3506_42_1 = forwardValue3506_39_1;
    forwardValue3506_42_2 = forwardValue3506_39_2;
    forwardValue3506_42_3 = forwardValue3506_39_3;
    forwardValue3506_42_4 = ((net.minecraft.entity.EntityLivingBase)(forwardValue3506_39_4));
    break forward_join_42;
    }
    forwardValue3506_42_0 = forwardValue3506_41_0;
    forwardValue3506_42_1 = forwardValue3506_41_1;
    forwardValue3506_42_2 = forwardValue3506_41_2;
    forwardValue3506_42_3 = forwardValue3506_41_3;
    forwardValue3506_42_4 = null;
    }
    ((moom.ez)(forwardValue3506_42_0)).a(((net.minecraft.world.World)(forwardValue3506_42_1)), ((moom.DT)(forwardValue3506_42_2)), ((net.minecraft.block.state.IBlockState)(forwardValue3506_42_3)), ((net.minecraft.entity.EntityLivingBase)(forwardValue3506_42_4)));
    ((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)));
    }
    return;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
