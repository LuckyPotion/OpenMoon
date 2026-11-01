package moom;


public class dt extends net.minecraft.block.Block {

public static final moom.fx Q;

public static final moom.fv R;

private static final long S;

private static final long T;

public dt() {
super(moom.fn.e, moom.fm.C);
    (this).a__Void((((this.M).a__fE()).a__fE(moom.dt.Q, moom.bs.NORTH)).a__fE(moom.dt.R, java.lang.Boolean.FALSE));
}


static {
S = ((long)(((moom._a)(moom._c.a(((long)(-1428672030909343273L)), ((long)(3709419452456339276L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(131878862704144L)))));
    long local0_life6 = (moom.dt.S ^ 4877359592474L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill818_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill818_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill818_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill818_13 = new byte[8];
    (__sourceSpill818_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill818_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation818_15 = __sourceSpill818_13;
    ((javax.crypto.Cipher)(__sourceSpill818_10)).init(((int)(__sourceSpill818_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill818_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation818_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -3209928006410990986L;
    byte[] __sourceSpill818_19 = new byte[8];
    (__sourceSpill818_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill818_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill818_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill818_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill818_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill818_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill818_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill818_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill818_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill818_20)).doFinal(((byte[])(__sourceSpill818_19)));
    T = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    Q = ((moom.fx)(moom.fx.a(((java.lang.String)("facing")), ((com.google.common.base.Predicate)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)))));
    R = ((moom.fv)(moom.fv.a(((java.lang.String)("eye")))));
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
net.minecraft.block.state.IBlockState forwardValue3349_16_0;
    moom.fv forwardValue3349_16_1;
    int forwardValue3349_16_2;
    net.minecraft.block.state.IBlockState forwardValue3349_17_0;
    moom.fv forwardValue3349_17_1;
    net.minecraft.block.state.IBlockState forwardValue3349_18_0;
    moom.fv forwardValue3349_18_1;
    int forwardValue3349_18_2;
    net.minecraft.block.state.IBlockState spill3349_0;
    moom.fv spill3349_1;
    int spill3349_2;
    long life2_3;
    int[] life4_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (moom.dt.S ^ 51802424866110L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3349_0 = ((moom.dt)(this)).a__fE();
    spill3349_1 = moom.dt.R;
    spill3349_2 = (p0 & 4);
    if (!((life4_5 != null))) {
        forwardValue3349_16_0 = spill3349_0;
        forwardValue3349_16_1 = spill3349_1;
        forwardValue3349_16_2 = spill3349_2;
        break forward_join_16;
    }
    if (!((spill3349_2 != 0))) {
        forwardValue3349_17_0 = spill3349_0;
        forwardValue3349_17_1 = spill3349_1;
        break forward_join_17;
    }
    forwardValue3349_16_0 = spill3349_0;
    forwardValue3349_16_1 = spill3349_1;
    forwardValue3349_16_2 = 1;
    }
    forwardValue3349_18_0 = forwardValue3349_16_0;
    forwardValue3349_18_1 = forwardValue3349_16_1;
    forwardValue3349_18_2 = forwardValue3349_16_2;
    break forward_join_18;
    }
    forwardValue3349_18_0 = forwardValue3349_17_0;
    forwardValue3349_18_1 = forwardValue3349_17_1;
    forwardValue3349_18_2 = 0;
    }
    return ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(forwardValue3349_18_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue3349_18_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3349_18_2))))))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.dt.Q)), ((java.lang.Comparable)(moom.bs.b(((int)((p0 & 3)))))));
}


public int b(net.minecraft.world.World p0, moom.DT p1) {
int forwardValue3348_18_0;
    int forwardValue3348_20_0;
    boolean spill3348_0;
    long life3_3;
    int[] life5_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life3_3 = (moom.dt.S ^ 97813944027593L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3348_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))).a(((net.minecraft.block.properties.IProperty)(moom.dt.R))))))).booleanValue();
    if (!((life5_5 != null))) {
        forwardValue3348_18_0 = ((spill3348_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill3348_0)) {
        break forward_join_19;
    }
    forwardValue3348_18_0 = ((int) moom.dt.T);
    }
    forwardValue3348_20_0 = forwardValue3348_18_0;
    break forward_join_20;
    }
    forwardValue3348_20_0 = 0;
    }
    return forwardValue3348_20_0;
}


public int b(net.minecraft.block.state.IBlockState p0) {
int forwardValue3347_29_0;
    int[] spill3347_0;
    boolean spill3347_1;
    long life2_3;
    int life5_6;
    int[] life4_7;
    int life5_15;
    forward_join_29: {
    forward_join_28: {
    life2_3 = (moom.dt.S ^ 39209031798324L);
    spill3347_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_6 = 0;
    life4_7 = spill3347_0;
    life5_15 = (life5_6 | ((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dt.Q))))))).b());
    spill3347_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dt.R))))))).booleanValue();
    if (!((life4_7 != null))) {
        forwardValue3347_29_0 = ((spill3347_1) ? 1 : 0);
        break forward_join_29;
    }
    if (!(spill3347_1)) {
        break forward_join_28;
    }
    life5_15 = (life5_15 | 4);
    }
    forwardValue3347_29_0 = life5_15;
    }
    return forwardValue3347_29_0;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.dt.Q, moom.dt.R});
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void() {
((moom.dt)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.ap-1f)), ((float)(0x1.0p0f)));
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.CA p3, java.util.List<moom.CA> p4, net.minecraft.entity.Entity p5) {
long local7 = (moom.dt.S ^ 52786532037265L);
    ((moom.dt)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.ap-1f)), ((float)(0x1.0p0f)));
    int[] spill6249_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.CA)(p3)), ((java.util.List)(p4)), ((net.minecraft.entity.Entity)(p5)));
    int[] local9 = spill6249_0;
    if ((local9 != null)) {
        if (((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))).a(((net.minecraft.block.properties.IProperty)(moom.dt.R))))))).booleanValue()) {
        ((moom.dt)(this)).a(((float)(0x1.4p-2f)), ((float)(0x1.ap-1f)), ((float)(0x1.4p-2f)), ((float)(0x1.6p-1f)), ((float)(0x1.0p0f)), ((float)(0x1.6p-1f)));
        super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.CA)(p3)), ((java.util.List)(p4)), ((net.minecraft.entity.Entity)(p5)));
    }
        ((moom.dt)(this)).a__Void();
    }
    return;
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return null;
}


public net.minecraft.block.state.IBlockState a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, float p3, float p4, float p5, int p6, net.minecraft.entity.EntityLivingBase p7) {
return ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.dt)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dt.Q)), ((java.lang.Comparable)(((moom.bs)(((net.minecraft.entity.EntityLivingBase)(p7)).b__bs())).a__bs()))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.dt.R)), ((java.lang.Comparable)(java.lang.Boolean.FALSE)));
}


public boolean j() {
return ((0) != 0);
}


public boolean r() {
return ((1) != 0);
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
