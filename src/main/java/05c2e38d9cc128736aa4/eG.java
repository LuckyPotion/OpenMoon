package moom;


public class eG extends net.minecraft.block.Block {

public static final moom.fv Q;

public static final moom.fv R;

public static final moom.fv S;

public static final moom.fv T;

public static final moom.fv U;

public static final moom.fw<moom.at> V;

private static final long W;

private static final long X;

public eG(net.minecraft.block.Block p0) {
super(p0.J);
    (this).a__Void((((((((this.M).a__fE()).a__fE(moom.eG.Q, java.lang.Boolean.FALSE)).a__fE(moom.eG.R, java.lang.Boolean.FALSE)).a__fE(moom.eG.S, java.lang.Boolean.FALSE)).a__fE(moom.eG.T, java.lang.Boolean.FALSE)).a__fE(moom.eG.U, java.lang.Boolean.FALSE)).a__fE(moom.eG.V, moom.at.NORMAL));
    (this).c(p0.w);
    (this).b((p0.x / 0x1.8000000000000p+1f));
    (this).a(p0.H);
    (this).a(net.minecraft.creativetab.CreativeTabs.b);
}


static {
W = ((long)(((moom._a)(moom._c.a(((long)(-8996947843356380384L)), ((long)(4091468508071877380L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(277072246539763L)))));
    long local0_life6 = (moom.eG.W ^ 48161193341823L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill826_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill826_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill826_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill826_13 = new byte[8];
    (__sourceSpill826_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill826_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation826_15 = __sourceSpill826_13;
    ((javax.crypto.Cipher)(__sourceSpill826_10)).init(((int)(__sourceSpill826_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill826_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation826_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -5768692412388094858L;
    byte[] __sourceSpill826_19 = new byte[8];
    (__sourceSpill826_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill826_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill826_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill826_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill826_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill826_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill826_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill826_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill826_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill826_20)).doFinal(((byte[])(__sourceSpill826_19)));
    X = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    Q = ((moom.fv)(moom.fv.a(((java.lang.String)("up")))));
    R = ((moom.fv)(moom.fv.a(((java.lang.String)("north")))));
    S = ((moom.fv)(moom.fv.a(((java.lang.String)("east")))));
    T = ((moom.fv)(moom.fv.a(((java.lang.String)("south")))));
    U = ((moom.fv)(moom.fv.a(((java.lang.String)("west")))));
    V = ((moom.fw)(moom.fw.a(((java.lang.String)("variant")), ((java.lang.Class)(moom.at.class)))));
}


public boolean b__sourceReturn_b38f36a0de(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
net.minecraft.block.Block forwardValue349_17_0;
    net.minecraft.block.Block forwardValue349_22_0;
    int forwardValue349_36_0;
    net.minecraft.block.Block forwardValue349_38_0;
    int forwardValue349_42_0;
    int forwardValue349_44_0;
    int[] spill349_0;
    net.minecraft.block.Block spill349_1;
    int spill349_2;
    boolean spill349_3;
    net.minecraft.block.Block spill349_4;
    long life3_3;
    net.minecraft.block.Block life6_9;
    int[] life5_10;
    forward_join_44: {
    forward_join_43: {
    forward_join_42: {
    forward_join_41: {
    forward_join_38: {
    forward_join_36: {
    forward_join_22: {
    forward_join_17: {
    life3_3 = (moom.eG.W ^ 88292247457506L);
    spill349_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_9 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1))))).a__ch();
    life5_10 = spill349_0;
    spill349_1 = life6_9;
    if (!((life5_10 != null))) {
        forwardValue349_17_0 = spill349_1;
        break forward_join_17;
    }
    if (!((spill349_1 != net.minecraft.init.Blocks.b_))) {
        break forward_join_43;
    }
    forwardValue349_17_0 = life6_9;
    }
    if (!((life5_10 != null))) {
        forwardValue349_22_0 = forwardValue349_17_0;
        break forward_join_22;
    }
    if (!((forwardValue349_17_0 != this))) {
        break forward_join_41;
    }
    forwardValue349_22_0 = life6_9;
    }
    spill349_2 = ((forwardValue349_22_0 instanceof moom.dk) ? 1 : 0);
    if (!((life5_10 != null))) {
        forwardValue349_42_0 = spill349_2;
        break forward_join_42;
    }
    if (!((spill349_2 == 0))) {
        break forward_join_41;
    }
    spill349_3 = ((moom.fn)(((net.minecraft.block.Block)(life6_9)).J)).g__Boolean();
    if (!((life5_10 != null))) {
        forwardValue349_36_0 = ((spill349_3) ? 1 : 0);
        break forward_join_36;
    }
    if (!(spill349_3)) {
        break forward_join_43;
    }
    spill349_4 = life6_9;
    if (!((life5_10 != null))) {
        forwardValue349_38_0 = spill349_4;
        break forward_join_38;
    }
    forwardValue349_36_0 = ((((net.minecraft.block.Block)(spill349_4)).g()) ? 1 : 0);
    }
    if (!((forwardValue349_36_0 != 0))) {
        break forward_join_43;
    }
    forwardValue349_38_0 = life6_9;
    }
    if (!((((net.minecraft.block.Block)(forwardValue349_38_0)).J != moom.fn.C))) {
        break forward_join_43;
    }
    }
    forwardValue349_42_0 = 1;
    }
    forwardValue349_44_0 = forwardValue349_42_0;
    break forward_join_44;
    }
    forwardValue349_44_0 = 0;
    }
    return ((forwardValue349_44_0) != 0);
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((moom.eG)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.eG.V)), ((java.lang.Comparable)(moom.at.a(((int)(p0))))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((moom.at)(((moom.at)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.eG.V))))))).a();
}


public int c(net.minecraft.block.state.IBlockState p0) {
return ((moom.at)(((moom.at)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.eG.V))))))).a();
}


public net.minecraft.block.state.IBlockState a(net.minecraft.block.state.IBlockState p0, net.minecraft.world.IBlockAccess p1, moom.DT p2) {
net.minecraft.block.state.IBlockState forwardValue345_16_0;
    moom.fv forwardValue345_16_1;
    int forwardValue345_16_2;
    net.minecraft.block.state.IBlockState forwardValue345_17_0;
    moom.fv forwardValue345_17_1;
    net.minecraft.block.state.IBlockState forwardValue345_18_0;
    moom.fv forwardValue345_18_1;
    int forwardValue345_18_2;
    net.minecraft.block.state.IBlockState spill345_0;
    moom.fv spill345_1;
    boolean spill345_2;
    long life4_3;
    int[] life6_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life4_3 = (moom.eG.W ^ 94893258545774L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill345_0 = p0;
    spill345_1 = moom.eG.Q;
    spill345_2 = ((net.minecraft.world.IBlockAccess)(p1)).a__Boolean(((moom.DT)(((moom.DT)(p2)).a__DT())));
    if (!((life6_5 != null))) {
        forwardValue345_16_0 = spill345_0;
        forwardValue345_16_1 = spill345_1;
        forwardValue345_16_2 = ((spill345_2) ? 1 : 0);
        break forward_join_16;
    }
    if (!((!spill345_2))) {
        forwardValue345_17_0 = spill345_0;
        forwardValue345_17_1 = spill345_1;
        break forward_join_17;
    }
    forwardValue345_16_0 = spill345_0;
    forwardValue345_16_1 = spill345_1;
    forwardValue345_16_2 = 1;
    }
    forwardValue345_18_0 = forwardValue345_16_0;
    forwardValue345_18_1 = forwardValue345_16_1;
    forwardValue345_18_2 = forwardValue345_16_2;
    break forward_join_18;
    }
    forwardValue345_18_0 = forwardValue345_17_0;
    forwardValue345_18_1 = forwardValue345_17_1;
    forwardValue345_18_2 = 0;
    }
    return ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(forwardValue345_18_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue345_18_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue345_18_2))))))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.eG.R)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)(((moom.eG)(this)).b__sourceReturn_b38f36a0de(((net.minecraft.world.IBlockAccess)(p1)), ((moom.DT)(((moom.DT)(p2)).c__DT()))))))))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.eG.S)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)(((moom.eG)(this)).b__sourceReturn_b38f36a0de(((net.minecraft.world.IBlockAccess)(p1)), ((moom.DT)(((moom.DT)(p2)).f()))))))))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.eG.T)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)(((moom.eG)(this)).b__sourceReturn_b38f36a0de(((net.minecraft.world.IBlockAccess)(p1)), ((moom.DT)(((moom.DT)(p2)).d__DT()))))))))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.eG.U)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)(((moom.eG)(this)).b__sourceReturn_b38f36a0de(((net.minecraft.world.IBlockAccess)(p1)), ((moom.DT)(((moom.DT)(p2)).e())))))))));
}


public boolean a__Boolean(net.minecraft.world.IBlockAccess p0, moom.DT p1, moom.bs p2) {
int forwardValue346_18_0;
    int forwardValue346_20_0;
    boolean spill346_0;
    long life4_3;
    int[] life6_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life4_3 = (moom.eG.W ^ 64303349484369L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!((p2 == moom.bs.DOWN))) {
        break forward_join_17;
    }
    spill346_0 = super.a__Boolean(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)), ((moom.bs)(p2)));
    if (!((life6_5 != null))) {
        forwardValue346_18_0 = ((spill346_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill346_0)) {
        break forward_join_19;
    }
    }
    forwardValue346_18_0 = 1;
    }
    forwardValue346_20_0 = forwardValue346_18_0;
    break forward_join_20;
    }
    forwardValue346_20_0 = 0;
    }
    return ((forwardValue346_20_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected moom.fA a__fA() {
long life1_3;
    life1_3 = (moom.eG.W ^ 57073189050922L);
    return new moom.fA(this, recovery.source.CarrierOps.store(recovery.source.CarrierOps.store(recovery.source.CarrierOps.store(recovery.source.CarrierOps.store(recovery.source.CarrierOps.store(recovery.source.CarrierOps.store(new net.minecraft.block.properties.IProperty[((int) moom.eG.X)], 0, moom.eG.Q), 1, moom.eG.R), 2, moom.eG.S), 3, moom.eG.U), 4, moom.eG.T), 5, moom.eG.V));
}


public boolean a__Boolean(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
return ((0) != 0);
}


public java.lang.String a__String() {
return net.minecraft.util.StatCollector.a(((java.lang.String)(__sourceIntrinsic_64ccfb84e285_originalDynamicSite1417_3(((moom.eG)(this)).b__String(), ((moom.at)(moom.at.NORMAL)).b()))));
}


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
int forwardValue347_47_0;
    int forwardValue347_53_0;
    int forwardValue347_59_0;
    int forwardValue347_65_0;
    int forwardValue347_89_0;
    int forwardValue347_93_0;
    int forwardValue347_97_0;
    int forwardValue347_101_0;
    int[] spill347_0;
    int spill347_1;
    int spill347_2;
    int spill347_3;
    int spill347_4;
    long life3_3;
    int life6_9;
    int life7_15;
    int life8_21;
    int life9_28;
    float life10_30;
    float life11_32;
    float life12_34;
    int[] life5_35;
    float life13_37;
    float life14_39;
    forward_join_108: {
    forward_join_101: {
    forward_join_97: {
    forward_join_93: {
    forward_join_89: {
    forward_join_88: {
    forward_join_65: {
    forward_join_64: {
    forward_join_59: {
    forward_join_58: {
    forward_join_53: {
    forward_join_52: {
    forward_join_47: {
    forward_join_46: {
    life3_3 = (moom.eG.W ^ 6777756035197L);
    life6_9 = ((((moom.eG)(this)).b__sourceReturn_b38f36a0de(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).c__DT())))) ? 1 : 0);
    life7_15 = ((((moom.eG)(this)).b__sourceReturn_b38f36a0de(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).d__DT())))) ? 1 : 0);
    life8_21 = ((((moom.eG)(this)).b__sourceReturn_b38f36a0de(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).e())))) ? 1 : 0);
    spill347_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life9_28 = ((((moom.eG)(this)).b__sourceReturn_b38f36a0de(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).f())))) ? 1 : 0);
    life10_30 = 0x1.0p-2f;
    life11_32 = 0x1.8p-1f;
    life12_34 = 0x1.0p-2f;
    life5_35 = spill347_0;
    life13_37 = 0x1.8p-1f;
    life14_39 = 0x1.0p0f;
    spill347_1 = life6_9;
    if (!((life5_35 != null))) {
        forwardValue347_47_0 = spill347_1;
        break forward_join_47;
    }
    if (!((spill347_1 != 0))) {
        break forward_join_46;
    }
    life12_34 = 0x0.0p0f;
    }
    forwardValue347_47_0 = life7_15;
    }
    if (!((life5_35 != null))) {
        forwardValue347_53_0 = forwardValue347_47_0;
        break forward_join_53;
    }
    if (!((forwardValue347_47_0 != 0))) {
        break forward_join_52;
    }
    life13_37 = 0x1.0p0f;
    }
    forwardValue347_53_0 = life8_21;
    }
    if (!((life5_35 != null))) {
        forwardValue347_59_0 = forwardValue347_53_0;
        break forward_join_59;
    }
    if (!((forwardValue347_53_0 != 0))) {
        break forward_join_58;
    }
    life10_30 = 0x0.0p0f;
    }
    forwardValue347_59_0 = life9_28;
    }
    if (!((life5_35 != null))) {
        forwardValue347_65_0 = forwardValue347_59_0;
        break forward_join_65;
    }
    if (!((forwardValue347_59_0 != 0))) {
        break forward_join_64;
    }
    life11_32 = 0x1.0p0f;
    }
    forwardValue347_65_0 = life6_9;
    }
    if (!((life5_35 != null))) {
        forwardValue347_89_0 = forwardValue347_65_0;
        break forward_join_89;
    }
    if (!((forwardValue347_65_0 != 0))) {
        break forward_join_88;
    }
    spill347_2 = life7_15;
    if (!((life5_35 != null))) {
        forwardValue347_89_0 = spill347_2;
        break forward_join_89;
    }
    if (!((spill347_2 != 0))) {
        break forward_join_88;
    }
    spill347_3 = life8_21;
    if (!((life5_35 != null))) {
        forwardValue347_89_0 = spill347_3;
        break forward_join_89;
    }
    if (!((spill347_3 == 0))) {
        break forward_join_88;
    }
    spill347_4 = life9_28;
    if (!((life5_35 != null))) {
        forwardValue347_89_0 = spill347_4;
        break forward_join_89;
    }
    if (!((spill347_4 == 0))) {
        break forward_join_88;
    }
    life14_39 = 0x1.ap-1f;
    life10_30 = 0x1.4p-2f;
    life11_32 = 0x1.6p-1f;
    if (!((life5_35 == null))) {
        break forward_join_108;
    }
    }
    forwardValue347_89_0 = life6_9;
    }
    if (!((life5_35 != null))) {
        forwardValue347_93_0 = forwardValue347_89_0;
        break forward_join_93;
    }
    if (!((forwardValue347_89_0 == 0))) {
        break forward_join_108;
    }
    forwardValue347_93_0 = life7_15;
    }
    if (!((life5_35 != null))) {
        forwardValue347_97_0 = forwardValue347_93_0;
        break forward_join_97;
    }
    if (!((forwardValue347_93_0 == 0))) {
        break forward_join_108;
    }
    forwardValue347_97_0 = life8_21;
    }
    if (!((life5_35 != null))) {
        forwardValue347_101_0 = forwardValue347_97_0;
        break forward_join_101;
    }
    if (!((forwardValue347_97_0 != 0))) {
        break forward_join_108;
    }
    forwardValue347_101_0 = life9_28;
    }
    if (!((forwardValue347_101_0 != 0))) {
        break forward_join_108;
    }
    life14_39 = 0x1.ap-1f;
    life12_34 = 0x1.4p-2f;
    life13_37 = 0x1.6p-1f;
    }
    ((moom.eG)(this)).a(((float)(life10_30)), ((float)(0x0.0p0f)), ((float)(life12_34)), ((float)(life11_32)), ((float)(life14_39)), ((float)(life13_37)));
    return;
}


public moom.CA a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
((moom.eG)(this)).a__Void(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
    ((moom.eG)(this)).F = ((double)(0x1.8p0d));
    return super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
int[] spill1147_0;
    long life4_3;
    moom.at[] life7_5;
    int life8_9;
    int life9_11;
    int[] life6_12;
    moom.at life10_19;
    lexical_join_33: {
    life4_3 = (moom.eG.W ^ 15983998568111L);
    life7_5 = moom.at.values();
    spill1147_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_9 = (life7_5).length;
    life9_11 = 0;
    life6_12 = spill1147_0;
    lexical_cycle_13: while (true) {
    if (!((life9_11 < life8_9))) {
        break lexical_join_33;
    }
    life10_19 = (life7_5)[life9_11];
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, ((moom.at)(life10_19)).a()))));
    life9_11 += 1;
    if (!((life6_12 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return;
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_64ccfb84e285_originalDynamicSite1417_3(java.lang.String a0, java.lang.String a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
