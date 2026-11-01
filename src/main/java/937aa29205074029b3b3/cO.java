package moom;


public class cO extends net.minecraft.block.Block {

public static final moom.fw<net.minecraft.item.EnumDyeColor> Q;

private static final long R;

private static final long S;

protected cO() {
super(moom.fn.r);
    (this).a__Void(((this.M).a__fE()).a__fE(moom.cO.Q, net.minecraft.item.EnumDyeColor.WHITE));
    (this).a(0x0.0p+0f, 0x0.0p+0f, 0x0.0p+0f, 0x1.0000000000000p+0f, 0x1.0000000000000p-4f, 0x1.0000000000000p+0f);
    (this).a(true);
    (this).a(net.minecraft.creativetab.CreativeTabs.c);
    (this).a(0);
}


static {
R = ((long)(((moom._a)(moom._c.a(((long)(-537983518306584872L)), ((long)(-2043294041940410164L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(23232435894917L)))));
    long local0_life6 = (moom.cO.R ^ 30036802467404L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill788_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill788_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill788_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill788_13 = new byte[8];
    (__sourceSpill788_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill788_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation788_15 = __sourceSpill788_13;
    ((javax.crypto.Cipher)(__sourceSpill788_10)).init(((int)(__sourceSpill788_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill788_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation788_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 2070329536042741274L;
    byte[] __sourceSpill788_19 = new byte[8];
    (__sourceSpill788_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill788_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill788_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill788_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill788_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill788_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill788_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill788_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill788_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill788_20)).doFinal(((byte[])(__sourceSpill788_19)));
    S = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    Q = ((moom.fw)(moom.fw.a(((java.lang.String)("color")), ((java.lang.Class)(net.minecraft.item.EnumDyeColor.class)))));
}


public boolean b__Boolean(net.minecraft.world.World p0, moom.DT p1) {
int forwardValue3083_17_0;
    int forwardValue3083_21_0;
    int forwardValue3083_23_0;
    boolean spill3083_0;
    long life3_3;
    int[] life5_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_17: {
    life3_3 = (moom.cO.R ^ 54063138503540L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3083_0 = super.b__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    if (!((life5_5 != null))) {
        forwardValue3083_17_0 = ((spill3083_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill3083_0)) {
        break forward_join_22;
    }
    forwardValue3083_17_0 = ((((moom.cO)(this)).c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue3083_21_0 = forwardValue3083_17_0;
        break forward_join_21;
    }
    if (!((forwardValue3083_17_0 != 0))) {
        break forward_join_22;
    }
    forwardValue3083_21_0 = 1;
    }
    forwardValue3083_23_0 = forwardValue3083_21_0;
    break forward_join_23;
    }
    forwardValue3083_23_0 = 0;
    }
    return ((forwardValue3083_23_0) != 0);
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((moom.cO)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cO.Q)), ((java.lang.Comparable)(net.minecraft.item.EnumDyeColor.b(((int)(p0))))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.item.EnumDyeColor)(((net.minecraft.item.EnumDyeColor)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cO.Q))))))).a();
}


private boolean c(net.minecraft.world.World p0, moom.DT p1) {
int forwardValue3084_14_0;
    int forwardValue3084_16_0;
    boolean spill3084_0;
    long life3_3;
    int[] life5_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_14: {
    life3_3 = (moom.cO.R ^ 75937037359910L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3084_0 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(((moom.DT)(p1)).b__DT())));
    if (!((life5_5 != null))) {
        forwardValue3084_14_0 = ((spill3084_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!((!spill3084_0))) {
        break forward_join_15;
    }
    forwardValue3084_14_0 = 1;
    }
    forwardValue3084_16_0 = forwardValue3084_14_0;
    break forward_join_16;
    }
    forwardValue3084_16_0 = 0;
    }
    return ((forwardValue3084_16_0) != 0);
}


public int c(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.item.EnumDyeColor)(((net.minecraft.item.EnumDyeColor)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cO.Q))))))).a();
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.cO.Q});
}


public boolean a__Boolean(net.minecraft.world.IBlockAccess p0, moom.DT p1, moom.bs p2) {
int forwardValue3082_18_0;
    int forwardValue3082_20_0;
    boolean spill3082_0;
    long life4_3;
    int[] life6_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life4_3 = (moom.cO.R ^ 8805466147317L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!((p2 != moom.bs.UP))) {
        break forward_join_17;
    }
    spill3082_0 = super.a__Boolean(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)), ((moom.bs)(p2)));
    if (!((life6_5 != null))) {
        forwardValue3082_18_0 = ((spill3082_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill3082_0)) {
        break forward_join_19;
    }
    }
    forwardValue3082_18_0 = 1;
    }
    forwardValue3082_20_0 = forwardValue3082_18_0;
    break forward_join_20;
    }
    forwardValue3082_20_0 = 0;
    }
    return ((forwardValue3082_20_0) != 0);
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
int[] spill1077_0;
    long life4_3;
    int life7_6;
    int[] life6_7;
    lexical_join_24: {
    life4_3 = (moom.cO.R ^ 67003443168267L);
    spill1077_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_6 = 0;
    life6_7 = spill1077_0;
    lexical_cycle_8: while (true) {
    if (!((life7_6 < ((int) moom.cO.S)))) {
        break lexical_join_24;
    }
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, life7_6))));
    life7_6 += 1;
    if (!((life6_7 == null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public moom.fm a__fm(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.item.EnumDyeColor)(((net.minecraft.item.EnumDyeColor)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cO.Q))))))).a__fm();
}


public void a__Void() {
((moom.cO)(this)).a__sourceReturn_d00df7729d(((int)(0)));
    return;
}


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
((moom.cO)(this)).a__sourceReturn_d00df7729d(((int)(0)));
    return;
}


private boolean a__sourceReturn_6048bc1ea7(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int forwardValue3081_26_0;
    boolean spill3081_0;
    long life4_3;
    int[] life6_5;
    forward_join_26: {
    forward_join_25: {
    life4_3 = (moom.cO.R ^ 40599040170980L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3081_0 = ((moom.cO)(this)).c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    if (!((life6_5 != null))) {
        forwardValue3081_26_0 = ((spill3081_0) ? 1 : 0);
        break forward_join_26;
    }
    if (!((!spill3081_0))) {
        break forward_join_25;
    }
    ((moom.cO)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(0)));
    ((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)));
    return ((0) != 0);
    }
    forwardValue3081_26_0 = 1;
    }
    return ((forwardValue3081_26_0) != 0);
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
((moom.cO)(this)).a__sourceReturn_6048bc1ea7(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    return;
}


protected void a__sourceReturn_d00df7729d(int p0) {
int local2 = 0;
    float local3 = (((float) (1 + local2)) / 0x1.0p4f);
    ((moom.cO)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(local3)), ((float)(0x1.0p0f)));
    return;
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}

}
