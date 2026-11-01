package moom;


public class cZ extends moom.cT {

public static final moom.fx R;

public final int S;

private static final long T;

private static final long U;

protected cZ(int p0) {
super(moom.fn.d);
    (this).a__Void(((this.M).a__fE()).a__fE(moom.cZ.R, moom.bs.NORTH));
    this.S = p0;
    (this).a(net.minecraft.creativetab.CreativeTabs.c);
    (this).a(0x1.0000000000000p-4f, 0x0.0p+0f, 0x1.0000000000000p-4f, 0x1.e000000000000p-1f, 0x1.c000000000000p-1f, 0x1.e000000000000p-1f);
}


static {
T = ((long)(((moom._a)(moom._c.a(((long)(3887724464154031885L)), ((long)(8928635837733446957L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(257742052226321L)))));
    long local0_life6 = (moom.cZ.T ^ 54969306479457L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill792_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill792_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill792_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill792_13 = new byte[8];
    (__sourceSpill792_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill792_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation792_15 = __sourceSpill792_13;
    ((javax.crypto.Cipher)(__sourceSpill792_10)).init(((int)(__sourceSpill792_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill792_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation792_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -5815030403793188624L;
    byte[] __sourceSpill792_19 = new byte[8];
    (__sourceSpill792_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill792_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill792_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill792_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill792_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill792_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill792_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill792_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill792_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill792_20)).doFinal(((byte[])(__sourceSpill792_19)));
    U = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    R = ((moom.fx)(moom.fx.a(((java.lang.String)("facing")), ((com.google.common.base.Predicate)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)))));
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
moom.bs forwardValue3110_16_0;
    int[] spill3110_0;
    moom.bs spill3110_1;
    long life2_3;
    moom.bs life5_7;
    int[] life4_8;
    forward_join_17: {
    forward_join_16: {
    life2_3 = (moom.cZ.T ^ 108259996656307L);
    spill3110_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_7 = moom.bs.a(((int)(p0)));
    life4_8 = spill3110_0;
    spill3110_1 = life5_7;
    if (!((life4_8 != null))) {
        forwardValue3110_16_0 = spill3110_1;
        break forward_join_16;
    }
    if (!((((moom.bs)(spill3110_1)).a__bt() == net.minecraft.util.EnumFacing$Axis.Y))) {
        break forward_join_17;
    }
    forwardValue3110_16_0 = moom.bs.NORTH;
    }
    life5_7 = forwardValue3110_16_0;
    }
    return ((net.minecraft.block.state.IBlockState)(((moom.cZ)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cZ.R)), ((java.lang.Comparable)(life5_7)));
}


public int b(net.minecraft.world.World p0, moom.DT p1) {
return moom.v8.a(((net.minecraft.inventory.IInventory)(((moom.cZ)(this)).a__sourceReturn_5599c2b7a2(((net.minecraft.world.World)(p0)), ((moom.DT)(p1))))));
}


public net.minecraft.block.state.IBlockState b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
net.minecraft.block.Block lexicalValue1081_36_0;
    moom.bs lexicalValue1081_46_0;
    net.minecraft.block.state.IBlockState lexicalValue1081_60_0;
    moom.bs lexicalValue1081_63_0;
    int lexicalValue1081_84_0;
    int lexicalValue1081_99_0;
    net.minecraft.block.state.IBlockState lexicalValue1081_107_0;
    int[] spill1081_0;
    net.minecraft.block.state.IBlockState spill1081_1;
    net.minecraft.block.Block spill1081_2;
    moom.bs spill1081_3;
    moom.bs spill1081_4;
    boolean spill1081_5;
    net.minecraft.block.state.IBlockState spill1081_6;
    long life4_3;
    moom.bs life7_6;
    int[] life6_7;
    java.util.Iterator life8_10;
    moom.bs life9_17;
    net.minecraft.block.state.IBlockState life10_23;
    moom.bs life8_82;
    lexical_join_107: {
    lexical_join_103: {
    lexical_join_99: {
    lexical_join_90: {
    lexical_join_84: {
    lexical_join_77: {
    lexical_join_63: {
    lexical_join_60: {
    lexical_join_59: {
    lexical_join_49: {
    life4_3 = (moom.cZ.T ^ 117677387610627L);
    spill1081_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_6 = null;
    life6_7 = spill1081_0;
    life8_10 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).iterator();
    lexical_cycle_11: while (true) {
    lexical_join_47: {
    lexical_join_46: {
    lexical_join_45: {
    lexical_join_36: {
    lexical_join_34: {
    if (!(((java.util.Iterator)(life8_10)).hasNext())) {
        break lexical_join_49;
    }
    life9_17 = ((moom.bs)(((java.util.Iterator)(life8_10)).next()));
    life10_23 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(life9_17))))));
    spill1081_1 = life10_23;
    if (!((life6_7 != null))) {
        lexicalValue1081_60_0 = spill1081_1;
        break lexical_join_60;
    }
    spill1081_2 = ((net.minecraft.block.state.IBlockState)(spill1081_1)).a__ch();
    if (!((life6_7 != null))) {
        lexicalValue1081_36_0 = spill1081_2;
        break lexical_join_36;
    }
    if (!((spill1081_2 == this))) {
        break lexical_join_34;
    }
    return p2;
    }
    lexicalValue1081_36_0 = ((net.minecraft.block.state.IBlockState)(life10_23)).a__ch();
    }
    if (!(((net.minecraft.block.Block)(lexicalValue1081_36_0)).a__Boolean())) {
        break lexical_join_47;
    }
    spill1081_3 = life7_6;
    if (!((life6_7 != null))) {
        lexicalValue1081_46_0 = spill1081_3;
        break lexical_join_46;
    }
    if (!((spill1081_3 != null))) {
        break lexical_join_45;
    }
    life7_6 = null;
    break lexical_join_49;
    }
    lexicalValue1081_46_0 = life9_17;
    }
    life7_6 = lexicalValue1081_46_0;
    }
    if (!((life6_7 == null))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    spill1081_4 = life7_6;
    if (!((life6_7 != null))) {
        lexicalValue1081_63_0 = spill1081_4;
        break lexical_join_63;
    }
    if (!((spill1081_4 != null))) {
        break lexical_join_59;
    }
    return ((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.cZ.R)), ((java.lang.Comparable)(((moom.bs)(life7_6)).a__bs())));
    }
    lexicalValue1081_60_0 = p2;
    }
    lexicalValue1081_63_0 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(lexicalValue1081_60_0)).a(((net.minecraft.block.properties.IProperty)(moom.cZ.R)))));
    }
    life8_82 = lexicalValue1081_63_0;
    spill1081_5 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(life8_82)))))))).a__ch())).a__Boolean();
    if (!((life6_7 != null))) {
        lexicalValue1081_84_0 = ((spill1081_5) ? 1 : 0);
        break lexical_join_84;
    }
    if (!(spill1081_5)) {
        break lexical_join_77;
    }
    life8_82 = ((moom.bs)(life8_82)).a__bs();
    }
    lexicalValue1081_84_0 = ((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(life8_82)))))))).a__ch())).a__Boolean()) ? 1 : 0);
    }
    if (!((life6_7 != null))) {
        lexicalValue1081_99_0 = lexicalValue1081_84_0;
        break lexical_join_99;
    }
    if (!((lexicalValue1081_84_0 != 0))) {
        break lexical_join_90;
    }
    life8_82 = ((moom.bs)(life8_82)).b__bs();
    }
    spill1081_6 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(life8_82))))));
    if (!((life6_7 != null))) {
        lexicalValue1081_107_0 = spill1081_6;
        break lexical_join_107;
    }
    lexicalValue1081_99_0 = ((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(spill1081_6)).a__ch())).a__Boolean()) ? 1 : 0);
    }
    if (!((lexicalValue1081_99_0 != 0))) {
        break lexical_join_103;
    }
    life8_82 = ((moom.bs)(life8_82)).a__bs();
    }
    lexicalValue1081_107_0 = ((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.cZ.R)), ((java.lang.Comparable)(life8_82)));
    }
    return lexicalValue1081_107_0;
}


public boolean b__Boolean(net.minecraft.world.World p0, moom.DT p1) {
int forwardValue3108_36_0;
    net.minecraft.block.Block forwardValue3108_43_0;
    moom.cZ forwardValue3108_43_1;
    int forwardValue3108_54_0;
    net.minecraft.block.Block forwardValue3108_61_0;
    moom.cZ forwardValue3108_61_1;
    int forwardValue3108_72_0;
    net.minecraft.block.Block forwardValue3108_79_0;
    moom.cZ forwardValue3108_79_1;
    int forwardValue3108_88_0;
    int forwardValue3108_96_0;
    int forwardValue3108_98_0;
    int[] spill3108_0;
    net.minecraft.block.Block spill3108_1;
    moom.cZ spill3108_2;
    boolean spill3108_3;
    boolean spill3108_4;
    boolean spill3108_5;
    boolean spill3108_6;
    int spill3108_7;
    long life3_3;
    int life6_5;
    moom.DT life7_8;
    moom.DT life8_12;
    moom.DT life9_15;
    int[] life5_16;
    moom.DT life10_19;
    forward_join_98: {
    forward_join_97: {
    forward_join_96: {
    forward_join_90: {
    forward_join_89: {
    forward_join_88: {
    forward_join_79: {
    forward_join_74: {
    forward_join_73: {
    forward_join_72: {
    forward_join_61: {
    forward_join_56: {
    forward_join_55: {
    forward_join_54: {
    forward_join_43: {
    forward_join_38: {
    forward_join_37: {
    forward_join_36: {
    life3_3 = (moom.cZ.T ^ 122708548942737L);
    life6_5 = 0;
    life7_8 = ((moom.DT)(p1)).e();
    spill3108_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_12 = ((moom.DT)(p1)).f();
    life9_15 = ((moom.DT)(p1)).c__DT();
    life5_16 = spill3108_0;
    life10_19 = ((moom.DT)(p1)).d__DT();
    spill3108_1 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life7_8))))).a__ch();
    spill3108_2 = this;
    if (!((life5_16 != null))) {
        forwardValue3108_43_0 = spill3108_1;
        forwardValue3108_43_1 = spill3108_2;
        break forward_join_43;
    }
    if (!((spill3108_1 == spill3108_2))) {
        break forward_join_38;
    }
    spill3108_3 = ((moom.cZ)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(life7_8)));
    if (!((life5_16 != null))) {
        forwardValue3108_36_0 = ((spill3108_3) ? 1 : 0);
        break forward_join_36;
    }
    if (!(spill3108_3)) {
        break forward_join_37;
    }
    forwardValue3108_36_0 = 0;
    }
    return ((forwardValue3108_36_0) != 0);
    }
    life6_5 += 1;
    }
    forwardValue3108_43_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life8_12))))).a__ch();
    forwardValue3108_43_1 = this;
    }
    if (!((life5_16 != null))) {
        forwardValue3108_61_0 = forwardValue3108_43_0;
        forwardValue3108_61_1 = forwardValue3108_43_1;
        break forward_join_61;
    }
    if (!((forwardValue3108_43_0 == forwardValue3108_43_1))) {
        break forward_join_56;
    }
    spill3108_4 = ((moom.cZ)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(life8_12)));
    if (!((life5_16 != null))) {
        forwardValue3108_54_0 = ((spill3108_4) ? 1 : 0);
        break forward_join_54;
    }
    if (!(spill3108_4)) {
        break forward_join_55;
    }
    forwardValue3108_54_0 = 0;
    }
    return ((forwardValue3108_54_0) != 0);
    }
    life6_5 += 1;
    }
    forwardValue3108_61_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life9_15))))).a__ch();
    forwardValue3108_61_1 = this;
    }
    if (!((life5_16 != null))) {
        forwardValue3108_79_0 = forwardValue3108_61_0;
        forwardValue3108_79_1 = forwardValue3108_61_1;
        break forward_join_79;
    }
    if (!((forwardValue3108_61_0 == forwardValue3108_61_1))) {
        break forward_join_74;
    }
    spill3108_5 = ((moom.cZ)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(life9_15)));
    if (!((life5_16 != null))) {
        forwardValue3108_72_0 = ((spill3108_5) ? 1 : 0);
        break forward_join_72;
    }
    if (!(spill3108_5)) {
        break forward_join_73;
    }
    forwardValue3108_72_0 = 0;
    }
    return ((forwardValue3108_72_0) != 0);
    }
    life6_5 += 1;
    }
    forwardValue3108_79_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life10_19))))).a__ch();
    forwardValue3108_79_1 = this;
    }
    if (!((forwardValue3108_79_0 == forwardValue3108_79_1))) {
        break forward_join_90;
    }
    spill3108_6 = ((moom.cZ)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(life10_19)));
    if (!((life5_16 != null))) {
        forwardValue3108_88_0 = ((spill3108_6) ? 1 : 0);
        break forward_join_88;
    }
    if (!(spill3108_6)) {
        break forward_join_89;
    }
    forwardValue3108_88_0 = 0;
    }
    return ((forwardValue3108_88_0) != 0);
    }
    life6_5 += 1;
    }
    spill3108_7 = life6_5;
    if (!((life5_16 != null))) {
        forwardValue3108_96_0 = spill3108_7;
        break forward_join_96;
    }
    if (!((spill3108_7 <= 1))) {
        break forward_join_97;
    }
    forwardValue3108_96_0 = 1;
    }
    forwardValue3108_98_0 = forwardValue3108_96_0;
    break forward_join_98;
    }
    forwardValue3108_98_0 = 0;
    }
    return ((forwardValue3108_98_0) != 0);
}


public int b(net.minecraft.world.IBlockAccess p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.bs p3) {
long local5 = (moom.cZ.T ^ 35226234050270L);
    return ((p3 == moom.bs.UP) ? ((moom.cZ)(this)).a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.bs)(p3))) : 0);
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cZ.R))))))).a();
}


public void b__Void(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
net.minecraft.block.state.IBlockState lexicalValue1082_41_0;
    int[] spill1082_0;
    net.minecraft.block.state.IBlockState spill1082_1;
    long life4_3;
    int[] life6_11;
    java.util.Iterator life7_14;
    moom.bs life8_21;
    moom.DT life9_25;
    net.minecraft.block.state.IBlockState life10_29;
    lexical_join_44: {
    life4_3 = (moom.cZ.T ^ 71010968821669L);
    spill1082_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    ((moom.cZ)(this)).a__sourceReturn_79273189a1(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    life6_11 = spill1082_0;
    life7_14 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).iterator();
    lexical_cycle_15: while (true) {
    lexical_join_42: {
    lexical_join_41: {
    if (!(((java.util.Iterator)(life7_14)).hasNext())) {
        break lexical_join_44;
    }
    life8_21 = ((moom.bs)(((java.util.Iterator)(life7_14)).next()));
    life9_25 = ((moom.DT)(p1)).a(((moom.bs)(life8_21)));
    life10_29 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life9_25)));
    spill1082_1 = life10_29;
    if (!((life6_11 != null))) {
        lexicalValue1082_41_0 = spill1082_1;
        break lexical_join_41;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill1082_1)).a__ch() == this))) {
        break lexical_join_42;
    }
    lexicalValue1082_41_0 = ((moom.cZ)(this)).a__sourceReturn_79273189a1(((net.minecraft.world.World)(p0)), ((moom.DT)(life9_25)), ((net.minecraft.block.state.IBlockState)(life10_29)));
    }
    recovery.source.CarrierOps.discard(lexicalValue1082_41_0);
    }
    if (!((life6_11 == null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    return;
}


private boolean e(net.minecraft.world.World p0, moom.DT p1) {
int forwardValue3112_21_0;
    int forwardValue3112_23_0;
    boolean spill3112_0;
    boolean spill3112_1;
    long life3_3;
    int[] life5_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life3_3 = (moom.cZ.T ^ 108948473592178L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3112_0 = ((moom.cZ)(this)).f(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    if (!((life5_5 != null))) {
        forwardValue3112_21_0 = ((spill3112_0) ? 1 : 0);
        break forward_join_21;
    }
    if (!((!spill3112_0))) {
        break forward_join_20;
    }
    spill3112_1 = ((moom.cZ)(this)).g(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    if (!((life5_5 != null))) {
        forwardValue3112_21_0 = ((spill3112_1) ? 1 : 0);
        break forward_join_21;
    }
    if (!(spill3112_1)) {
        break forward_join_22;
    }
    }
    forwardValue3112_21_0 = 1;
    }
    forwardValue3112_23_0 = forwardValue3112_21_0;
    break forward_join_23;
    }
    forwardValue3112_23_0 = 0;
    }
    return ((forwardValue3112_23_0) != 0);
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
long life4_3;
    net.minecraft.tileentity.TileEntity life7_8;
    int[] life6_9;
    life4_3 = (moom.cZ.T ^ 40184557966855L);
    int[] spill5942_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_8 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    life6_9 = spill5942_0;
    if ((life6_9 != null)) {
        if ((((life7_8 instanceof net.minecraft.inventory.IInventory) ? 1 : 0) != 0)) {
        moom.wy.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.inventory.IInventory)(((net.minecraft.inventory.IInventory)(life7_8)))));
        ((net.minecraft.world.World)(p0)).d(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)));
    }
        super.c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    }
    return;
}


public int c__Int() {
return 2;
}


private boolean f(net.minecraft.world.World p0, moom.DT p1) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a__DT()))))).a__ch())).e__Boolean())) != 0);
}


public boolean l() {
int forwardValue3114_13_0;
    int forwardValue3114_15_0;
    int spill3114_0;
    long life1_3;
    int[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (moom.cZ.T ^ 130587948234908L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3114_0 = this.S;
    if (!((life3_5 != null))) {
        forwardValue3114_13_0 = spill3114_0;
        break forward_join_13;
    }
    if (!((spill3114_0 == 1))) {
        break forward_join_14;
    }
    forwardValue3114_13_0 = 1;
    }
    forwardValue3114_15_0 = forwardValue3114_13_0;
    break forward_join_15;
    }
    forwardValue3114_15_0 = 0;
    }
    return ((forwardValue3114_15_0) != 0);
}


private boolean d(net.minecraft.world.World p0, moom.DT p1) {
long life3_3;
    int[] life5_5;
    java.util.Iterator life6_18;
    moom.bs life7_25;
    lexical_join_36: {
    lexical_join_14: {
    life3_3 = (moom.cZ.T ^ 136333525952826L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))).a__ch() != this))) {
        break lexical_join_14;
    }
    return ((0) != 0);
    }
    life6_18 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).iterator();
    lexical_cycle_17: while (true) {
    lexical_join_34: {
    if (!(((java.util.Iterator)(life6_18)).hasNext())) {
        break lexical_join_36;
    }
    life7_25 = ((moom.bs)(((java.util.Iterator)(life6_18)).next()));
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(life7_25)))))))).a__ch() == this))) {
        break lexical_join_34;
    }
    return ((1) != 0);
    }
    if (!((life5_5 == null))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    return ((0) != 0);
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.cZ.R});
}


public int a(net.minecraft.world.IBlockAccess p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.bs p3) {
int forwardValue3100_14_0;
    int forwardValue3100_33_0;
    boolean spill3100_0;
    int spill3100_1;
    long life5_3;
    int[] life7_5;
    int life8_19;
    net.minecraft.tileentity.TileEntity life9_23;
    forward_join_33: {
    forward_join_28: {
    forward_join_14: {
    forward_join_13: {
    life5_3 = (moom.cZ.T ^ 58728298162923L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3100_0 = ((moom.cZ)(this)).l();
    if (!((life7_5 != null))) {
        forwardValue3100_14_0 = ((spill3100_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!((!spill3100_0))) {
        break forward_join_13;
    }
    return 0;
    }
    forwardValue3100_14_0 = 0;
    }
    life8_19 = forwardValue3100_14_0;
    life9_23 = ((net.minecraft.world.IBlockAccess)(p0)).a__B9(((moom.DT)(p1)));
    spill3100_1 = ((life9_23 instanceof net.minecraft.tileentity.TileEntityChest) ? 1 : 0);
    if (!((life7_5 != null))) {
        forwardValue3100_33_0 = spill3100_1;
        break forward_join_33;
    }
    if (!((spill3100_1 != 0))) {
        break forward_join_28;
    }
    life8_19 = ((net.minecraft.tileentity.TileEntityChest)(((net.minecraft.tileentity.TileEntityChest)(life9_23)))).v;
    }
    forwardValue3100_33_0 = moom.Dr.a(((int)(life8_19)), ((int)(0)), ((int)(((int) moom.cZ.U))));
    }
    return forwardValue3100_33_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.block.state.IBlockState a__sourceReturn_79273189a1(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
net.minecraft.world.World forwardValue3102_12_0;
    net.minecraft.block.Block forwardValue3102_76_0;
    moom.cZ forwardValue3102_76_1;
    moom.DT forwardValue3102_82_0;
    moom.bs forwardValue3102_111_0;
    moom.bs forwardValue3102_118_0;
    int forwardValue3102_135_0;
    int forwardValue3102_146_0;
    int forwardValue3102_155_0;
    int forwardValue3102_160_0;
    net.minecraft.block.Block forwardValue3102_167_0;
    moom.cZ forwardValue3102_167_1;
    moom.DT forwardValue3102_173_0;
    moom.bs forwardValue3102_202_0;
    moom.bs forwardValue3102_209_0;
    int forwardValue3102_228_0;
    int forwardValue3102_240_0;
    int forwardValue3102_250_0;
    int forwardValue3102_270_0;
    net.minecraft.world.World spill3102_0;
    net.minecraft.block.Block spill3102_1;
    moom.cZ spill3102_2;
    net.minecraft.block.Block spill3102_3;
    moom.cZ spill3102_4;
    net.minecraft.block.Block spill3102_5;
    moom.cZ spill3102_6;
    net.minecraft.block.Block spill3102_7;
    moom.cZ spill3102_8;
    moom.bs spill3102_9;
    moom.bs spill3102_10;
    int spill3102_11;
    boolean spill3102_12;
    boolean spill3102_13;
    boolean spill3102_14;
    moom.bs spill3102_15;
    moom.bs spill3102_16;
    boolean spill3102_17;
    boolean spill3102_18;
    boolean spill3102_19;
    boolean spill3102_20;
    boolean spill3102_21;
    long life4_3;
    int[] life6_5;
    net.minecraft.block.state.IBlockState life7_21;
    net.minecraft.block.state.IBlockState life8_26;
    net.minecraft.block.state.IBlockState life9_31;
    net.minecraft.block.state.IBlockState life10_36;
    moom.bs life11_41;
    net.minecraft.block.Block life12_44;
    net.minecraft.block.Block life13_47;
    net.minecraft.block.Block life14_50;
    net.minecraft.block.Block life15_53;
    int life16_75;
    int life17_78;
    moom.DT life18_111;
    net.minecraft.block.state.IBlockState life19_116;
    net.minecraft.block.state.IBlockState life20_121;
    moom.bs life21_133;
    net.minecraft.block.Block life22_159;
    net.minecraft.block.Block life23_162;
    moom.DT life16_249;
    net.minecraft.block.state.IBlockState life17_254;
    net.minecraft.block.state.IBlockState life18_259;
    moom.bs life19_271;
    net.minecraft.block.Block life20_297;
    net.minecraft.block.Block life21_300;
    forward_join_271: {
    forward_join_270: {
    forward_join_260: {
    forward_join_250: {
    forward_join_248: {
    forward_join_240: {
    forward_join_238: {
    forward_join_228: {
    forward_join_226: {
    forward_join_210: {
    forward_join_209: {
    forward_join_203: {
    forward_join_202: {
    forward_join_198: {
    forward_join_173: {
    forward_join_171: {
    forward_join_167: {
    forward_join_165: {
    forward_join_163: {
    forward_join_160: {
    forward_join_155: {
    forward_join_154: {
    forward_join_146: {
    forward_join_145: {
    forward_join_135: {
    forward_join_134: {
    forward_join_119: {
    forward_join_118: {
    forward_join_112: {
    forward_join_111: {
    forward_join_107: {
    forward_join_82: {
    forward_join_80: {
    forward_join_76: {
    forward_join_74: {
    forward_join_12: {
    life4_3 = (moom.cZ.T ^ 23804231443105L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3102_0 = p0;
    if (!((life6_5 != null))) {
        forwardValue3102_12_0 = spill3102_0;
        break forward_join_12;
    }
    if (!((!((net.minecraft.world.World)(spill3102_0)).G))) {
        break forward_join_271;
    }
    forwardValue3102_12_0 = p0;
    }
    life7_21 = ((net.minecraft.world.World)(forwardValue3102_12_0)).a__fE(((moom.DT)(((moom.DT)(p1)).c__DT())));
    life8_26 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).d__DT())));
    life9_31 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).e())));
    life10_36 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).f())));
    life11_41 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cZ.R)))));
    life12_44 = ((net.minecraft.block.state.IBlockState)(life7_21)).a__ch();
    life13_47 = ((net.minecraft.block.state.IBlockState)(life8_26)).a__ch();
    life14_50 = ((net.minecraft.block.state.IBlockState)(life9_31)).a__ch();
    life15_53 = ((net.minecraft.block.state.IBlockState)(life10_36)).a__ch();
    spill3102_1 = life12_44;
    spill3102_2 = this;
    if (!((life6_5 != null))) {
        forwardValue3102_167_0 = spill3102_1;
        forwardValue3102_167_1 = spill3102_2;
        break forward_join_167;
    }
    if (!((spill3102_1 != spill3102_2))) {
        break forward_join_165;
    }
    spill3102_3 = life13_47;
    spill3102_4 = this;
    if (!((life6_5 != null))) {
        forwardValue3102_167_0 = spill3102_3;
        forwardValue3102_167_1 = spill3102_4;
        break forward_join_167;
    }
    if (!((spill3102_3 != spill3102_4))) {
        break forward_join_165;
    }
    life16_75 = ((((net.minecraft.block.Block)(life12_44)).a__Boolean()) ? 1 : 0);
    life17_78 = ((((net.minecraft.block.Block)(life13_47)).a__Boolean()) ? 1 : 0);
    spill3102_5 = life14_50;
    spill3102_6 = this;
    if (!((life6_5 != null))) {
        forwardValue3102_76_0 = spill3102_5;
        forwardValue3102_76_1 = spill3102_6;
        break forward_join_76;
    }
    if (!((spill3102_5 != spill3102_6))) {
        break forward_join_74;
    }
    spill3102_7 = life15_53;
    spill3102_8 = this;
    if (!((life6_5 != null))) {
        forwardValue3102_76_0 = spill3102_7;
        forwardValue3102_76_1 = spill3102_8;
        break forward_join_76;
    }
    if (!((spill3102_7 == spill3102_8))) {
        break forward_join_163;
    }
    }
    forwardValue3102_76_0 = life14_50;
    forwardValue3102_76_1 = this;
    }
    if (!((forwardValue3102_76_0 == forwardValue3102_76_1))) {
        break forward_join_80;
    }
    forwardValue3102_82_0 = ((moom.DT)(p1)).e();
    break forward_join_82;
    }
    forwardValue3102_82_0 = ((moom.DT)(p1)).f();
    }
    life18_111 = forwardValue3102_82_0;
    life19_116 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(life18_111)).c__DT())));
    life20_121 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(life18_111)).d__DT())));
    spill3102_9 = moom.bs.SOUTH;
    if (!((life6_5 != null))) {
        forwardValue3102_111_0 = spill3102_9;
        break forward_join_111;
    }
    life11_41 = spill3102_9;
    if (!((life14_50 == this))) {
        break forward_join_107;
    }
    life21_133 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(life9_31)).a(((net.minecraft.block.properties.IProperty)(moom.cZ.R)))));
    if (!((life6_5 == null))) {
        break forward_join_112;
    }
    }
    forwardValue3102_111_0 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(life10_36)).a(((net.minecraft.block.properties.IProperty)(moom.cZ.R)))));
    }
    life21_133 = forwardValue3102_111_0;
    }
    spill3102_10 = life21_133;
    if (!((life6_5 != null))) {
        forwardValue3102_118_0 = spill3102_10;
        break forward_join_118;
    }
    if (!((spill3102_10 == moom.bs.NORTH))) {
        break forward_join_119;
    }
    forwardValue3102_118_0 = moom.bs.NORTH;
    }
    life11_41 = forwardValue3102_118_0;
    }
    life22_159 = ((net.minecraft.block.state.IBlockState)(life19_116)).a__ch();
    life23_162 = ((net.minecraft.block.state.IBlockState)(life20_121)).a__ch();
    spill3102_11 = life16_75;
    if (!((life6_5 != null))) {
        forwardValue3102_135_0 = spill3102_11;
        break forward_join_135;
    }
    if (!((spill3102_11 == 0))) {
        break forward_join_134;
    }
    spill3102_12 = ((net.minecraft.block.Block)(life22_159)).a__Boolean();
    if (!((life6_5 != null))) {
        forwardValue3102_146_0 = ((spill3102_12) ? 1 : 0);
        break forward_join_146;
    }
    if (!(spill3102_12)) {
        break forward_join_145;
    }
    }
    forwardValue3102_135_0 = life17_78;
    }
    if (!((life6_5 != null))) {
        forwardValue3102_146_0 = forwardValue3102_135_0;
        break forward_join_146;
    }
    if (!((forwardValue3102_135_0 == 0))) {
        break forward_join_145;
    }
    spill3102_13 = ((net.minecraft.block.Block)(life23_162)).a__Boolean();
    if (!((life6_5 != null))) {
        forwardValue3102_146_0 = ((spill3102_13) ? 1 : 0);
        break forward_join_146;
    }
    if (!((!spill3102_13))) {
        break forward_join_145;
    }
    life11_41 = moom.bs.SOUTH;
    }
    forwardValue3102_146_0 = life17_78;
    }
    if (!((life6_5 != null))) {
        forwardValue3102_155_0 = forwardValue3102_146_0;
        break forward_join_155;
    }
    if (!((forwardValue3102_146_0 == 0))) {
        break forward_join_154;
    }
    spill3102_14 = ((net.minecraft.block.Block)(life23_162)).a__Boolean();
    if (!((life6_5 != null))) {
        forwardValue3102_155_0 = ((spill3102_14) ? 1 : 0);
        break forward_join_155;
    }
    if (!(spill3102_14)) {
        break forward_join_163;
    }
    }
    forwardValue3102_155_0 = life16_75;
    }
    if (!((life6_5 != null))) {
        forwardValue3102_160_0 = forwardValue3102_155_0;
        break forward_join_160;
    }
    if (!((forwardValue3102_155_0 == 0))) {
        break forward_join_163;
    }
    forwardValue3102_160_0 = ((((net.minecraft.block.Block)(life22_159)).a__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue3102_160_0 == 0))) {
        break forward_join_163;
    }
    life11_41 = moom.bs.NORTH;
    }
    if (!((life6_5 == null))) {
        break forward_join_260;
    }
    }
    forwardValue3102_167_0 = life12_44;
    forwardValue3102_167_1 = this;
    }
    if (!((forwardValue3102_167_0 == forwardValue3102_167_1))) {
        break forward_join_171;
    }
    forwardValue3102_173_0 = ((moom.DT)(p1)).c__DT();
    break forward_join_173;
    }
    forwardValue3102_173_0 = ((moom.DT)(p1)).d__DT();
    }
    life16_249 = forwardValue3102_173_0;
    life17_254 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(life16_249)).e())));
    life18_259 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(life16_249)).f())));
    spill3102_15 = moom.bs.EAST;
    if (!((life6_5 != null))) {
        forwardValue3102_202_0 = spill3102_15;
        break forward_join_202;
    }
    life11_41 = spill3102_15;
    if (!((life12_44 == this))) {
        break forward_join_198;
    }
    life19_271 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(life7_21)).a(((net.minecraft.block.properties.IProperty)(moom.cZ.R)))));
    if (!((life6_5 == null))) {
        break forward_join_203;
    }
    }
    forwardValue3102_202_0 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(life8_26)).a(((net.minecraft.block.properties.IProperty)(moom.cZ.R)))));
    }
    life19_271 = forwardValue3102_202_0;
    }
    spill3102_16 = life19_271;
    if (!((life6_5 != null))) {
        forwardValue3102_209_0 = spill3102_16;
        break forward_join_209;
    }
    if (!((spill3102_16 == moom.bs.WEST))) {
        break forward_join_210;
    }
    forwardValue3102_209_0 = moom.bs.WEST;
    }
    life11_41 = forwardValue3102_209_0;
    }
    life20_297 = ((net.minecraft.block.state.IBlockState)(life17_254)).a__ch();
    life21_300 = ((net.minecraft.block.state.IBlockState)(life18_259)).a__ch();
    spill3102_17 = ((net.minecraft.block.Block)(life14_50)).a__Boolean();
    if (!((life6_5 != null))) {
        forwardValue3102_228_0 = ((spill3102_17) ? 1 : 0);
        break forward_join_228;
    }
    if (!((!spill3102_17))) {
        break forward_join_226;
    }
    spill3102_18 = ((net.minecraft.block.Block)(life20_297)).a__Boolean();
    if (!((life6_5 != null))) {
        forwardValue3102_240_0 = ((spill3102_18) ? 1 : 0);
        break forward_join_240;
    }
    if (!(spill3102_18)) {
        break forward_join_238;
    }
    }
    forwardValue3102_228_0 = ((((net.minecraft.block.Block)(life15_53)).a__Boolean()) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue3102_240_0 = forwardValue3102_228_0;
        break forward_join_240;
    }
    if (!((forwardValue3102_228_0 == 0))) {
        break forward_join_238;
    }
    spill3102_19 = ((net.minecraft.block.Block)(life21_300)).a__Boolean();
    if (!((life6_5 != null))) {
        forwardValue3102_240_0 = ((spill3102_19) ? 1 : 0);
        break forward_join_240;
    }
    if (!((!spill3102_19))) {
        break forward_join_238;
    }
    life11_41 = moom.bs.EAST;
    }
    forwardValue3102_240_0 = ((((net.minecraft.block.Block)(life15_53)).a__Boolean()) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue3102_250_0 = forwardValue3102_240_0;
        break forward_join_250;
    }
    if (!((forwardValue3102_240_0 == 0))) {
        break forward_join_248;
    }
    spill3102_20 = ((net.minecraft.block.Block)(life21_300)).a__Boolean();
    if (!((life6_5 != null))) {
        forwardValue3102_270_0 = ((spill3102_20) ? 1 : 0);
        break forward_join_270;
    }
    if (!(spill3102_20)) {
        break forward_join_260;
    }
    }
    forwardValue3102_250_0 = ((((net.minecraft.block.Block)(life14_50)).a__Boolean()) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue3102_270_0 = forwardValue3102_250_0;
        break forward_join_270;
    }
    if (!((forwardValue3102_250_0 == 0))) {
        break forward_join_260;
    }
    spill3102_21 = ((net.minecraft.block.Block)(life20_297)).a__Boolean();
    if (!((life6_5 != null))) {
        forwardValue3102_270_0 = ((spill3102_21) ? 1 : 0);
        break forward_join_270;
    }
    if (!((!spill3102_21))) {
        break forward_join_260;
    }
    life11_41 = moom.bs.WEST;
    }
    p2 = ((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.cZ.R)), ((java.lang.Comparable)(life11_41)));
    forwardValue3102_270_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(3)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3102_270_0);
    }
    return p2;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.EntityLivingBase p3, net.minecraft.item.ItemStack p4) {
int forwardValue3104_47_0;
    int forwardValue3104_57_0;
    int forwardValue3104_67_0;
    int forwardValue3104_77_0;
    int forwardValue3104_83_0;
    int forwardValue3104_87_0;
    int forwardValue3104_91_0;
    int forwardValue3104_99_0;
    net.minecraft.util.EnumFacing$Axis forwardValue3104_119_0;
    net.minecraft.util.EnumFacing$Axis forwardValue3104_119_1;
    int forwardValue3104_129_0;
    int forwardValue3104_145_0;
    int forwardValue3104_155_0;
    int forwardValue3104_171_0;
    int forwardValue3104_180_0;
    net.minecraft.tileentity.TileEntity forwardValue3104_191_0;
    int[] spill3104_0;
    int spill3104_1;
    net.minecraft.util.EnumFacing$Axis spill3104_2;
    net.minecraft.util.EnumFacing$Axis spill3104_3;
    int spill3104_4;
    int spill3104_5;
    int spill3104_6;
    int spill3104_7;
    net.minecraft.tileentity.TileEntity spill3104_8;
    long life6_3;
    moom.bs life9_18;
    net.minecraft.block.state.IBlockState life3_24;
    moom.DT life10_27;
    moom.DT life11_30;
    int[] life8_31;
    moom.DT life12_34;
    moom.DT life13_37;
    int life14_49;
    int life15_61;
    int life16_73;
    int life17_85;
    net.minecraft.tileentity.TileEntity life18_261;
    forward_join_195: {
    forward_join_191: {
    forward_join_180: {
    forward_join_178: {
    forward_join_172: {
    forward_join_171: {
    forward_join_166: {
    forward_join_155: {
    forward_join_154: {
    forward_join_146: {
    forward_join_145: {
    forward_join_140: {
    forward_join_129: {
    forward_join_128: {
    forward_join_119: {
    forward_join_116: {
    forward_join_102: {
    forward_join_99: {
    forward_join_91: {
    forward_join_87: {
    forward_join_83: {
    forward_join_77: {
    forward_join_76: {
    forward_join_67: {
    forward_join_66: {
    forward_join_57: {
    forward_join_56: {
    forward_join_47: {
    forward_join_46: {
    life6_3 = (moom.cZ.T ^ 59680499010592L);
    life9_18 = ((moom.bs)(moom.bs.b(((int)((moom.Dr.b__Int(((double)((((double) ((((net.minecraft.entity.EntityLivingBase)(p3)).w * 0x1.0p2f) / 0x1.68p8f)) + 0x1.0p-1d)))) & 3)))))).a__bs();
    spill3104_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life3_24 = ((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.cZ.R)), ((java.lang.Comparable)(life9_18)));
    life10_27 = ((moom.DT)(p1)).c__DT();
    life11_30 = ((moom.DT)(p1)).d__DT();
    life8_31 = spill3104_0;
    life12_34 = ((moom.DT)(p1)).e();
    life13_37 = ((moom.DT)(p1)).f();
    if (!((this == ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life10_27))))).a__ch()))) {
        break forward_join_46;
    }
    forwardValue3104_47_0 = 1;
    break forward_join_47;
    }
    forwardValue3104_47_0 = 0;
    }
    life14_49 = forwardValue3104_47_0;
    if (!((this == ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life11_30))))).a__ch()))) {
        break forward_join_56;
    }
    forwardValue3104_57_0 = 1;
    break forward_join_57;
    }
    forwardValue3104_57_0 = 0;
    }
    life15_61 = forwardValue3104_57_0;
    if (!((this == ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life12_34))))).a__ch()))) {
        break forward_join_66;
    }
    forwardValue3104_67_0 = 1;
    break forward_join_67;
    }
    forwardValue3104_67_0 = 0;
    }
    life16_73 = forwardValue3104_67_0;
    if (!((this == ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life13_37))))).a__ch()))) {
        break forward_join_76;
    }
    forwardValue3104_77_0 = 1;
    break forward_join_77;
    }
    forwardValue3104_77_0 = 0;
    }
    life17_85 = forwardValue3104_77_0;
    spill3104_1 = life14_49;
    if (!((life8_31 != null))) {
        forwardValue3104_83_0 = spill3104_1;
        break forward_join_83;
    }
    if (!((spill3104_1 == 0))) {
        break forward_join_102;
    }
    forwardValue3104_83_0 = life15_61;
    }
    if (!((life8_31 != null))) {
        forwardValue3104_87_0 = forwardValue3104_83_0;
        break forward_join_87;
    }
    if (!((forwardValue3104_83_0 == 0))) {
        break forward_join_102;
    }
    forwardValue3104_87_0 = life16_73;
    }
    if (!((life8_31 != null))) {
        forwardValue3104_91_0 = forwardValue3104_87_0;
        break forward_join_91;
    }
    if (!((forwardValue3104_87_0 == 0))) {
        break forward_join_102;
    }
    forwardValue3104_91_0 = life17_85;
    }
    if (!((life8_31 != null))) {
        forwardValue3104_99_0 = forwardValue3104_91_0;
        break forward_join_99;
    }
    if (!((forwardValue3104_91_0 == 0))) {
        break forward_join_102;
    }
    forwardValue3104_99_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(life3_24)), ((int)(3)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3104_99_0);
    if (!((life8_31 == null))) {
        break forward_join_178;
    }
    }
    spill3104_2 = ((moom.bs)(life9_18)).a__bt();
    spill3104_3 = net.minecraft.util.EnumFacing$Axis.X;
    if (!((life8_31 != null))) {
        forwardValue3104_119_0 = spill3104_2;
        forwardValue3104_119_1 = spill3104_3;
        break forward_join_119;
    }
    if (!((spill3104_2 == spill3104_3))) {
        break forward_join_116;
    }
    spill3104_4 = life14_49;
    if (!((life8_31 != null))) {
        forwardValue3104_155_0 = spill3104_4;
        break forward_join_155;
    }
    if (!((spill3104_4 == 0))) {
        break forward_join_154;
    }
    spill3104_5 = life15_61;
    if (!((life8_31 != null))) {
        forwardValue3104_155_0 = spill3104_5;
        break forward_join_155;
    }
    if (!((spill3104_5 == 0))) {
        break forward_join_154;
    }
    }
    forwardValue3104_119_0 = ((moom.bs)(life9_18)).a__bt();
    forwardValue3104_119_1 = net.minecraft.util.EnumFacing$Axis.Z;
    }
    if (!((forwardValue3104_119_0 == forwardValue3104_119_1))) {
        break forward_join_178;
    }
    spill3104_6 = life16_73;
    if (!((life8_31 != null))) {
        forwardValue3104_129_0 = spill3104_6;
        break forward_join_129;
    }
    if (!((spill3104_6 == 0))) {
        break forward_join_128;
    }
    spill3104_7 = life17_85;
    if (!((life8_31 != null))) {
        forwardValue3104_180_0 = spill3104_7;
        break forward_join_180;
    }
    if (!((spill3104_7 != 0))) {
        break forward_join_178;
    }
    }
    forwardValue3104_129_0 = life16_73;
    }
    if (!((life8_31 != null))) {
        forwardValue3104_145_0 = forwardValue3104_129_0;
        break forward_join_145;
    }
    if (!((forwardValue3104_129_0 != 0))) {
        break forward_join_140;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(life12_34)), ((net.minecraft.block.state.IBlockState)(life3_24)), ((int)(3)));
    if (!((life8_31 == null))) {
        break forward_join_146;
    }
    }
    forwardValue3104_145_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(life13_37)), ((net.minecraft.block.state.IBlockState)(life3_24)), ((int)(3)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3104_145_0);
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(life3_24)), ((int)(3)));
    if (!((life8_31 == null))) {
        break forward_join_178;
    }
    }
    forwardValue3104_155_0 = life14_49;
    }
    if (!((life8_31 != null))) {
        forwardValue3104_171_0 = forwardValue3104_155_0;
        break forward_join_171;
    }
    if (!((forwardValue3104_155_0 != 0))) {
        break forward_join_166;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(life10_27)), ((net.minecraft.block.state.IBlockState)(life3_24)), ((int)(3)));
    if (!((life8_31 == null))) {
        break forward_join_172;
    }
    }
    forwardValue3104_171_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(life11_30)), ((net.minecraft.block.state.IBlockState)(life3_24)), ((int)(3)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3104_171_0);
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(life3_24)), ((int)(3)));
    }
    forwardValue3104_180_0 = ((((net.minecraft.item.ItemStack)(p4)).f__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue3104_180_0 != 0))) {
        break forward_join_195;
    }
    life18_261 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    spill3104_8 = life18_261;
    if (!((life8_31 != null))) {
        forwardValue3104_191_0 = spill3104_8;
        break forward_join_191;
    }
    if (!((((spill3104_8 instanceof net.minecraft.tileentity.TileEntityChest) ? 1 : 0) != 0))) {
        break forward_join_195;
    }
    forwardValue3104_191_0 = life18_261;
    }
    ((net.minecraft.tileentity.TileEntityChest)(((net.minecraft.tileentity.TileEntityChest)(forwardValue3104_191_0)))).a(((java.lang.String)(((net.minecraft.item.ItemStack)(p4)).b__String())));
    }
    return;
}


public net.minecraft.block.state.IBlockState a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, float p3, float p4, float p5, int p6, net.minecraft.entity.EntityLivingBase p7) {
return ((net.minecraft.block.state.IBlockState)(((moom.cZ)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cZ.R)), ((java.lang.Comparable)(((net.minecraft.entity.EntityLivingBase)(p7)).b__bs())));
}


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
net.minecraft.block.Block forwardValue3106_31_0;
    moom.cZ forwardValue3106_31_1;
    net.minecraft.block.Block forwardValue3106_50_0;
    moom.cZ forwardValue3106_50_1;
    net.minecraft.block.Block forwardValue3106_69_0;
    moom.cZ forwardValue3106_69_1;
    net.minecraft.block.Block spill3106_0;
    moom.cZ spill3106_1;
    long life3_3;
    int[] life5_5;
    forward_join_88: {
    forward_join_80: {
    forward_join_69: {
    forward_join_63: {
    forward_join_50: {
    forward_join_44: {
    forward_join_31: {
    forward_join_25: {
    life3_3 = (moom.cZ.T ^ 117519768414780L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3106_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).c__DT()))))).a__ch();
    spill3106_1 = this;
    if (!((life5_5 != null))) {
        forwardValue3106_31_0 = spill3106_0;
        forwardValue3106_31_1 = spill3106_1;
        break forward_join_31;
    }
    if (!((spill3106_0 == spill3106_1))) {
        break forward_join_25;
    }
    ((moom.cZ)(this)).a(((float)(0x1.0p-4f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.ep-1f)), ((float)(0x1.cp-1f)), ((float)(0x1.ep-1f)));
    if (!((life5_5 == null))) {
        break forward_join_88;
    }
    }
    forwardValue3106_31_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).d__DT()))))).a__ch();
    forwardValue3106_31_1 = this;
    }
    if (!((life5_5 != null))) {
        forwardValue3106_50_0 = forwardValue3106_31_0;
        forwardValue3106_50_1 = forwardValue3106_31_1;
        break forward_join_50;
    }
    if (!((forwardValue3106_31_0 == forwardValue3106_31_1))) {
        break forward_join_44;
    }
    ((moom.cZ)(this)).a(((float)(0x1.0p-4f)), ((float)(0x0.0p0f)), ((float)(0x1.0p-4f)), ((float)(0x1.ep-1f)), ((float)(0x1.cp-1f)), ((float)(0x1.0p0f)));
    if (!((life5_5 == null))) {
        break forward_join_88;
    }
    }
    forwardValue3106_50_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).e()))))).a__ch();
    forwardValue3106_50_1 = this;
    }
    if (!((life5_5 != null))) {
        forwardValue3106_69_0 = forwardValue3106_50_0;
        forwardValue3106_69_1 = forwardValue3106_50_1;
        break forward_join_69;
    }
    if (!((forwardValue3106_50_0 == forwardValue3106_50_1))) {
        break forward_join_63;
    }
    ((moom.cZ)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p-4f)), ((float)(0x1.ep-1f)), ((float)(0x1.cp-1f)), ((float)(0x1.ep-1f)));
    if (!((life5_5 == null))) {
        break forward_join_88;
    }
    }
    forwardValue3106_69_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).f()))))).a__ch();
    forwardValue3106_69_1 = this;
    }
    if (!((forwardValue3106_69_0 == forwardValue3106_69_1))) {
        break forward_join_80;
    }
    ((moom.cZ)(this)).a(((float)(0x1.0p-4f)), ((float)(0x0.0p0f)), ((float)(0x1.0p-4f)), ((float)(0x1.0p0f)), ((float)(0x1.cp-1f)), ((float)(0x1.ep-1f)));
    if (!((life5_5 == null))) {
        break forward_join_88;
    }
    }
    ((moom.cZ)(this)).a(((float)(0x1.0p-4f)), ((float)(0x0.0p0f)), ((float)(0x1.0p-4f)), ((float)(0x1.ep-1f)), ((float)(0x1.cp-1f)), ((float)(0x1.ep-1f)));
    }
    return;
}


public net.minecraft.tileentity.TileEntity a(net.minecraft.world.World p0, int p1) {
return new net.minecraft.tileentity.TileEntityChest();
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue3105_35_0;
    int forwardValue3105_43_0;
    boolean spill3105_0;
    int spill3105_1;
    long life9_3;
    int[] life11_5;
    net.minecraft.world.ILockableContainer life12_18;
    forward_join_43: {
    forward_join_42: {
    forward_join_35: {
    forward_join_33: {
    forward_join_23: {
    life9_3 = (moom.cZ.T ^ 48720259725811L);
    life11_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3105_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life11_5 != null))) {
        forwardValue3105_43_0 = ((spill3105_0) ? 1 : 0);
        break forward_join_43;
    }
    if (!((!spill3105_0))) {
        break forward_join_42;
    }
    life12_18 = ((moom.cZ)(this)).a__sourceReturn_5599c2b7a2(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    if (!((life11_5 != null))) {
        break forward_join_23;
    }
    if (!((life12_18 != null))) {
        break forward_join_42;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p3)).a(((net.minecraft.inventory.IInventory)(life12_18)));
    }
    spill3105_1 = this.S;
    if (!((life11_5 != null))) {
        forwardValue3105_35_0 = spill3105_1;
        break forward_join_35;
    }
    if (!((spill3105_1 == 0))) {
        break forward_join_33;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p3)).a(((moom.BY)(net.minecraft.stats.StatList.aa)));
    if (!((life11_5 == null))) {
        break forward_join_42;
    }
    }
    forwardValue3105_35_0 = this.S;
    }
    if (!((life11_5 != null))) {
        forwardValue3105_43_0 = forwardValue3105_35_0;
        break forward_join_43;
    }
    if (!((forwardValue3105_35_0 == 1))) {
        break forward_join_42;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p3)).a(((moom.BY)(net.minecraft.stats.StatList.U)));
    }
    forwardValue3105_43_0 = 1;
    }
    return ((forwardValue3105_43_0) != 0);
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
net.minecraft.tileentity.TileEntity forwardValue3103_22_0;
    int[] spill3103_0;
    net.minecraft.tileentity.TileEntity spill3103_1;
    long life5_3;
    int[] life7_11;
    net.minecraft.tileentity.TileEntity life8_15;
    forward_join_23: {
    forward_join_22: {
    life5_3 = (moom.cZ.T ^ 98903596301541L);
    spill3103_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((net.minecraft.block.Block)(p3)));
    life7_11 = spill3103_0;
    life8_15 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    spill3103_1 = life8_15;
    if (!((life7_11 != null))) {
        forwardValue3103_22_0 = spill3103_1;
        break forward_join_22;
    }
    if (!((((spill3103_1 instanceof net.minecraft.tileentity.TileEntityChest) ? 1 : 0) != 0))) {
        break forward_join_23;
    }
    forwardValue3103_22_0 = life8_15;
    }
    ((net.minecraft.tileentity.TileEntity)(forwardValue3103_22_0)).f__Void();
    }
    return;
}


public net.minecraft.world.ILockableContainer a__sourceReturn_5599c2b7a2(net.minecraft.world.World p0, moom.DT p1) {
net.minecraft.tileentity.TileEntity forestValue910005_18_0;
    moom.bs forestValue910005_69_0;
    moom.bs forestValue910005_69_1;
    int[] spill910005_0;
    net.minecraft.tileentity.TileEntity spill910005_1;
    moom.bs spill910005_2;
    moom.bs spill910005_3;
    long life3_3;
    net.minecraft.tileentity.TileEntity life6_8;
    int[] life5_9;
    net.minecraft.world.ILockableContainer life7_23;
    java.util.Iterator life8_34;
    moom.bs life9_43;
    moom.DT life10_47;
    net.minecraft.block.Block life11_52;
    net.minecraft.tileentity.TileEntity life12_66;
    forest_join_93: {
    forest_join_91: {
    forest_join_27: {
    forest_join_18: {
    forest_join_17: {
    life3_3 = (moom.cZ.T ^ 136412915092217L);
    spill910005_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_8 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    life5_9 = spill910005_0;
    spill910005_1 = life6_8;
    if (!((life5_9 != null))) {
        forestValue910005_18_0 = spill910005_1;
        break forest_join_18;
    }
    if (!((((spill910005_1 instanceof net.minecraft.tileentity.TileEntityChest) ? 1 : 0) == 0))) {
        break forest_join_17;
    }
    return null;
    }
    forestValue910005_18_0 = life6_8;
    }
    life7_23 = ((net.minecraft.tileentity.TileEntityChest)(forestValue910005_18_0));
    if (!(((moom.cZ)(this)).e(((net.minecraft.world.World)(p0)), ((moom.DT)(p1))))) {
        break forest_join_27;
    }
    return null;
    }
    life8_34 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).iterator();
    forest_cycle_30: while (true) {
    forest_join_88: {
    forest_join_80: {
    forest_join_69: {
    forest_join_55: {
    if (!(((java.util.Iterator)(life8_34)).hasNext())) {
        break forest_join_93;
    }
    life9_43 = ((moom.bs)(((java.util.Iterator)(life8_34)).next()));
    life10_47 = ((moom.DT)(p1)).a(((moom.bs)(life9_43)));
    life11_52 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life10_47))))).a__ch();
    if (!((life11_52 == this))) {
        break forest_join_88;
    }
    if (!(((moom.cZ)(this)).e(((net.minecraft.world.World)(p0)), ((moom.DT)(life10_47))))) {
        break forest_join_55;
    }
    break forest_join_91;
    }
    life12_66 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(life10_47)));
    if (!((((life12_66 instanceof net.minecraft.tileentity.TileEntityChest) ? 1 : 0) != 0))) {
        break forest_join_88;
    }
    spill910005_2 = life9_43;
    spill910005_3 = moom.bs.WEST;
    if (!((life5_9 != null))) {
        forestValue910005_69_0 = spill910005_2;
        forestValue910005_69_1 = spill910005_3;
        break forest_join_69;
    }
    if (!((spill910005_2 != spill910005_3))) {
        break forest_join_80;
    }
    forestValue910005_69_0 = life9_43;
    forestValue910005_69_1 = moom.bs.NORTH;
    }
    if (!((forestValue910005_69_0 != forestValue910005_69_1))) {
        break forest_join_80;
    }
    life7_23 = new moom.wz("container.chestDouble", life7_23, ((net.minecraft.tileentity.TileEntityChest)(life12_66)));
    if (!((life5_9 == null))) {
        break forest_join_88;
    }
    }
    life7_23 = new moom.wz("container.chestDouble", ((net.minecraft.tileentity.TileEntityChest)(life12_66)), life7_23);
    }
    if (!((life5_9 == null))) {
        continue forest_cycle_30;
    }
    break forest_cycle_30;
    }
    break forest_join_93;
    }
    return null;
    }
    return life7_23;
}


public boolean g() {
return ((0) != 0);
}


private boolean g(net.minecraft.world.World p0, moom.DT p1) {
int lexicalValue1084_55_0;
    int lexicalValue1084_59_0;
    int[] spill1084_0;
    boolean spill1084_1;
    long life3_3;
    java.util.Iterator life6_38;
    int[] life5_39;
    net.minecraft.entity.passive.EntityOcelot life7_46;
    lexical_join_59: {
    lexical_join_58: {
    life3_3 = (moom.cZ.T ^ 121703765677052L);
    spill1084_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_38 = ((java.util.List)(((net.minecraft.world.World)(p0)).a(((java.lang.Class)(net.minecraft.entity.passive.EntityOcelot.class)), ((moom.CA)(new moom.CA(((double) ((moom.DT)(p1)).a()), ((double) (((moom.DT)(p1)).b() + 1)), ((double) ((moom.DT)(p1)).c()), ((double) (((moom.DT)(p1)).a() + 1)), ((double) (((moom.DT)(p1)).b() + 2)), ((double) (((moom.DT)(p1)).c() + 1)))))))).iterator();
    life5_39 = spill1084_0;
    lexical_cycle_40: while (true) {
    lexical_join_56: {
    lexical_join_55: {
    if (!(((java.util.Iterator)(life6_38)).hasNext())) {
        break lexical_join_58;
    }
    life7_46 = ((net.minecraft.entity.passive.EntityOcelot)(((java.util.Iterator)(life6_38)).next()));
    spill1084_1 = ((net.minecraft.entity.passive.EntityOcelot)(life7_46)).af();
    if (!((life5_39 != null))) {
        lexicalValue1084_59_0 = ((spill1084_1) ? 1 : 0);
        break lexical_join_59;
    }
    if (!((life5_39 != null))) {
        lexicalValue1084_55_0 = ((spill1084_1) ? 1 : 0);
        break lexical_join_55;
    }
    if (!(spill1084_1)) {
        break lexical_join_56;
    }
    lexicalValue1084_55_0 = 1;
    }
    return ((lexicalValue1084_55_0) != 0);
    }
    if (!((life5_39 == null))) { continue lexical_cycle_40; }
    break lexical_cycle_40;
    }
    }
    lexicalValue1084_59_0 = 0;
    }
    return ((lexicalValue1084_59_0) != 0);
}


public boolean j() {
return ((0) != 0);
}


public boolean r() {
return ((1) != 0);
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
