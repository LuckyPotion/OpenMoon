package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class cJ extends net.minecraft.block.Block {

public static final moom.fx Q;

public static final moom.fv R;

private final boolean S;

private static final long T;

private static final long[] U;

private static final java.lang.Integer[] V;

private static final java.util.Map W;

protected cJ(boolean p0) {
super(moom.fn.q);
    (this).a__Void((((this.M).a__fE()).a__fE(moom.cJ.Q, moom.bs.NORTH)).a__fE(moom.cJ.R, java.lang.Boolean.FALSE));
    (this).a(true);
    (this).a(net.minecraft.creativetab.CreativeTabs.d);
    this.S = p0;
}


static {
T = ((long)(((moom._a)(moom._c.a(((long)(8933520181873174190L)), ((long)(383007937842192141L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(36382665642525L)))));
    W = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.cJ.T ^ 9872074602994L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1127_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1127_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1127_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1127_14 = new byte[8];
    (__sourceSpill1127_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1127_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1127_16 = __sourceSpill1127_14;
    ((javax.crypto.Cipher)(__sourceSpill1127_11)).init(((int)(__sourceSpill1127_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1127_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1127_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\034­\036t¾\017Öö¾Î.¼¯§7\004I3CÙÚ¶VàÉÐVíõ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1127_25 = local6_life21;
        int __sourceSpill1127_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1127_25)).substring(((int)(__sourceSpill1127_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1127_30 = local8_life19;
        int __sourceSpill1127_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1127_33 = new byte[8];
        (__sourceSpill1127_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1127_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1127_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1127_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1127_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1127_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1127_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1127_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1127_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1127_34)).doFinal(((byte[])(__sourceSpill1127_33)));
        (__sourceSpill1127_30)[__sourceSpill1127_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\017-NåÆc\022`l\013Îcr"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1127_38 = local6_life21;
        int __sourceSpill1127_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1127_38)).substring(((int)(__sourceSpill1127_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1127_43 = local8_life19;
        int __sourceSpill1127_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1127_46 = new byte[8];
        (__sourceSpill1127_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1127_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1127_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1127_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1127_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1127_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1127_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1127_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1127_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1127_47)).doFinal(((byte[])(__sourceSpill1127_46)));
        (__sourceSpill1127_43)[__sourceSpill1127_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    U = ((long[])(local8_life19));
    V = ((java.lang.Integer[])(new java.lang.Integer[7]));
    Q = ((moom.fx)(moom.fx.a(((java.lang.String)("facing")))));
    R = ((moom.fv)(moom.fv.a(((java.lang.String)("powered")))));
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
net.minecraft.block.state.IBlockState forestValue824_53_0;
    moom.fv forestValue824_53_1;
    int forestValue824_53_2;
    net.minecraft.block.state.IBlockState forestValue824_54_0;
    moom.fv forestValue824_54_1;
    net.minecraft.block.state.IBlockState forestValue824_55_0;
    moom.fv forestValue824_55_1;
    int forestValue824_55_2;
    net.minecraft.block.state.IBlockState spill824_0;
    moom.fv spill824_1;
    int spill824_2;
    long life2_3;
    int[] life4_5;
    moom.bs life5_15;
    forest_join_55: {
    forest_join_54: {
    forest_join_53: {
    forest_join_36: {
    forest_join_34: {
    forest_join_30: {
    forest_join_26: {
    forest_join_22: {
    forest_join_18: {
    forest_join_14: {
    life2_3 = (moom.cJ.T ^ 16064607237823L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    switch ((p0 & __sourceIntrinsic_819466f05fee_invokedynamic824_2(27998, (6396852029559242508L ^ life2_3)))) {
case 0:
{
        break forest_join_14;
    }
case 1:
{
        break forest_join_18;
    }
case 2:
{
        break forest_join_22;
    }
case 3:
{
        break forest_join_26;
    }
case 4:
{
        break forest_join_30;
    }
case 5:
default:
{
        break forest_join_34;
    }
}
    }
    life5_15 = moom.bs.DOWN;
    if (!((life4_5 == null))) {
        break forest_join_36;
    }
    }
    life5_15 = moom.bs.EAST;
    if (!((life4_5 == null))) {
        break forest_join_36;
    }
    }
    life5_15 = moom.bs.WEST;
    if (!((life4_5 == null))) {
        break forest_join_36;
    }
    }
    life5_15 = moom.bs.SOUTH;
    if (!((life4_5 == null))) {
        break forest_join_36;
    }
    }
    life5_15 = moom.bs.NORTH;
    if (!((life4_5 == null))) {
        break forest_join_36;
    }
    }
    life5_15 = moom.bs.UP;
    }
    spill824_0 = ((net.minecraft.block.state.IBlockState)(((moom.cJ)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cJ.Q)), ((java.lang.Comparable)(life5_15)));
    spill824_1 = moom.cJ.R;
    spill824_2 = (p0 & __sourceIntrinsic_819466f05fee_invokedynamic824_13(6249, (5329602886424824376L ^ life2_3)));
    if (!((life4_5 != null))) {
        forestValue824_53_0 = spill824_0;
        forestValue824_53_1 = spill824_1;
        forestValue824_53_2 = spill824_2;
        break forest_join_53;
    }
    if (!((spill824_2 > 0))) {
        forestValue824_54_0 = spill824_0;
        forestValue824_54_1 = spill824_1;
        break forest_join_54;
    }
    forestValue824_53_0 = spill824_0;
    forestValue824_53_1 = spill824_1;
    forestValue824_53_2 = 1;
    }
    forestValue824_55_0 = forestValue824_53_0;
    forestValue824_55_1 = forestValue824_53_1;
    forestValue824_55_2 = forestValue824_53_2;
    break forest_join_55;
    }
    forestValue824_55_0 = forestValue824_54_0;
    forestValue824_55_1 = forestValue824_54_1;
    forestValue824_55_2 = 0;
    }
    return ((net.minecraft.block.state.IBlockState)(forestValue824_55_0)).a__fE(((net.minecraft.block.properties.IProperty)(forestValue824_55_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forestValue824_55_2)))))));
}


public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
int forwardValue3068_16_0;
    int forwardValue3068_21_0;
    int forwardValue3068_38_0;
    boolean spill3068_0;
    long life5_3;
    int[] life7_5;
    forward_join_71: {
    forward_join_38: {
    forward_join_31: {
    forward_join_21: {
    forward_join_16: {
    life5_3 = (moom.cJ.T ^ 35655120475240L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3068_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life7_5 != null))) {
        forwardValue3068_16_0 = ((spill3068_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!((!spill3068_0))) {
        break forward_join_71;
    }
    forwardValue3068_16_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cJ.R))))))).booleanValue()) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        forwardValue3068_21_0 = forwardValue3068_16_0;
        break forward_join_21;
    }
    if (!((forwardValue3068_16_0 != 0))) {
        break forward_join_71;
    }
    forwardValue3068_21_0 = ((this.S) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        forwardValue3068_38_0 = forwardValue3068_21_0;
        break forward_join_38;
    }
    if (!((forwardValue3068_21_0 != 0))) {
        break forward_join_31;
    }
    ((moom.cJ)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    if (!((life7_5 == null))) {
        break forward_join_71;
    }
    }
    forwardValue3068_38_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.cJ.R)), ((java.lang.Comparable)(java.lang.Boolean.FALSE))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3068_38_0);
    ((moom.cJ)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cJ.Q))))))));
    ((net.minecraft.world.World)(p0)).a(((double)((((double) ((moom.DT)(p1)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(p1)).b()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(p1)).c()) + 0x1.0p-1d))), ((java.lang.String)("random.click")), ((float)(0x1.333334p-2f)), ((float)(0x1.0p-1f)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((moom.DT)(p1)));
    }
    return;
}


public int b(net.minecraft.world.IBlockAccess p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.bs p3) {
java.lang.Comparable forwardValue3067_19_0;
    int forwardValue3067_28_0;
    java.lang.Boolean spill3067_0;
    long life5_3;
    int[] life7_5;
    forward_join_28: {
    forward_join_27: {
    forward_join_19: {
    forward_join_16: {
    life5_3 = (moom.cJ.T ^ 84541410312914L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3067_0 = ((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cJ.R)))));
    if (!((life7_5 != null))) {
        forwardValue3067_19_0 = spill3067_0;
        break forward_join_19;
    }
    if (!((!((java.lang.Boolean)(spill3067_0)).booleanValue()))) {
        break forward_join_16;
    }
    forwardValue3067_28_0 = 0;
    break forward_join_28;
    }
    forwardValue3067_19_0 = ((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cJ.Q)));
    }
    if (!((forwardValue3067_19_0 == p3))) {
        break forward_join_27;
    }
    forwardValue3067_28_0 = __sourceIntrinsic_b0b3991ff8d9_invokedynamic3067_8(32735, (8002791439734659558L ^ life5_3));
    break forward_join_28;
    }
    forwardValue3067_28_0 = 0;
    }
    return forwardValue3067_28_0;
}


private void b__Void(net.minecraft.block.state.IBlockState p0) {
int forestValue400_26_0;
    int forestValue400_28_0;
    int[] spill400_0;
    int spill400_1;
    long life2_3;
    moom.bs life5_9;
    int[] life4_10;
    int life6_16;
    float life7_18;
    float life8_20;
    float life9_32;
    float life10_34;
    float life11_36;
    forest_join_109: {
    forest_join_99: {
    forest_join_87: {
    forest_join_75: {
    forest_join_65: {
    forest_join_53: {
    forest_join_51: {
    forest_join_43: {
    forest_join_28: {
    forest_join_27: {
    forest_join_26: {
    life2_3 = (moom.cJ.T ^ 135739909130053L);
    spill400_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_9 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cJ.Q)))));
    life4_10 = spill400_0;
    life6_16 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cJ.R))))))).booleanValue()) ? 1 : 0);
    life7_18 = 0x1.0p-2f;
    life8_20 = 0x1.8p-2f;
    spill400_1 = life6_16;
    if (!((life4_10 != null))) {
        forestValue400_26_0 = spill400_1;
        break forest_join_26;
    }
    if (!((spill400_1 != 0))) {
        break forest_join_27;
    }
    forestValue400_26_0 = 1;
    }
    forestValue400_28_0 = forestValue400_26_0;
    break forest_join_28;
    }
    forestValue400_28_0 = 2;
    }
    life9_32 = (((float) forestValue400_28_0) / 0x1.0p4f);
    life10_34 = 0x1.0p-3f;
    life11_36 = 0x1.8p-3f;
    if (!((life4_10 != null))) {
        break forest_join_51;
    }
    switch ((moom.eQ.a)[((moom.bs)(life5_9)).ordinal()]) {
case 1:
{
        break forest_join_43;
    }
case 2:
{
        break forest_join_53;
    }
case 3:
{
        break forest_join_65;
    }
case 4:
{
        break forest_join_75;
    }
case 5:
{
        break forest_join_87;
    }
case 6:
{
        break forest_join_99;
    }
default:
{
        break forest_join_109;
    }
}
    }
    ((moom.cJ)(this)).a(((float)(0x0.0p0f)), ((float)(0x1.8p-2f)), ((float)(0x1.4p-2f)), ((float)(life9_32)), ((float)(0x1.4p-1f)), ((float)(0x1.6p-1f)));
    }
    if (!((life4_10 == null))) {
        break forest_join_109;
    }
    }
    ((moom.cJ)(this)).a(((float)((0x1.0p0f - life9_32))), ((float)(0x1.8p-2f)), ((float)(0x1.4p-2f)), ((float)(0x1.0p0f)), ((float)(0x1.4p-1f)), ((float)(0x1.6p-1f)));
    if (!((life4_10 == null))) {
        break forest_join_109;
    }
    }
    ((moom.cJ)(this)).a(((float)(0x1.4p-2f)), ((float)(0x1.8p-2f)), ((float)(0x0.0p0f)), ((float)(0x1.6p-1f)), ((float)(0x1.4p-1f)), ((float)(life9_32)));
    if (!((life4_10 == null))) {
        break forest_join_109;
    }
    }
    ((moom.cJ)(this)).a(((float)(0x1.4p-2f)), ((float)(0x1.8p-2f)), ((float)((0x1.0p0f - life9_32))), ((float)(0x1.6p-1f)), ((float)(0x1.4p-1f)), ((float)(0x1.0p0f)));
    if (!((life4_10 == null))) {
        break forest_join_109;
    }
    }
    ((moom.cJ)(this)).a(((float)(0x1.4p-2f)), ((float)(0x0.0p0f)), ((float)(0x1.8p-2f)), ((float)(0x1.6p-1f)), ((float)((0x0.0p0f + life9_32))), ((float)(0x1.4p-1f)));
    if (!((life4_10 == null))) {
        break forest_join_109;
    }
    }
    ((moom.cJ)(this)).a(((float)(0x1.4p-2f)), ((float)((0x1.0p0f - life9_32))), ((float)(0x1.8p-2f)), ((float)(0x1.6p-1f)), ((float)(0x1.0p0f)), ((float)(0x1.4p-1f)));
    }
    return;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7081_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/cJ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.cJ.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 31128;
      if (V[var3] == null) {
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
         long var5 = U[var3];
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
         Object[] var9 = (Object[])W.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               W.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/cJ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         V[var3] = var15;
      }

      return V[var3];
}


public int b(net.minecraft.block.state.IBlockState p0) {
int forestValue825_37_0;
    int forestValue825_55_0;
    int spill825_0;
    boolean spill825_1;
    long life2_3;
    int[] life4_5;
    int life5_17;
    forest_join_55: {
    forest_join_54: {
    forest_join_38: {
    forest_join_37: {
    forest_join_36: {
    forest_join_32: {
    forest_join_28: {
    forest_join_24: {
    forest_join_20: {
    forest_join_16: {
    life2_3 = (moom.cJ.T ^ 2372776316341L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill825_0 = (moom.eQ.a)[((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cJ.Q))))))).ordinal()];
    if (!((life4_5 != null))) {
        forestValue825_37_0 = spill825_0;
        break forest_join_37;
    }
    switch (spill825_0) {
case 1:
{
        break forest_join_16;
    }
case 2:
{
        break forest_join_20;
    }
case 3:
{
        break forest_join_24;
    }
case 4:
{
        break forest_join_28;
    }
case 5:
default:
{
        break forest_join_32;
    }
case 6:
{
        break forest_join_36;
    }
}
    }
    life5_17 = 1;
    if (!((life4_5 == null))) {
        break forest_join_38;
    }
    }
    life5_17 = 2;
    if (!((life4_5 == null))) {
        break forest_join_38;
    }
    }
    life5_17 = 3;
    if (!((life4_5 == null))) {
        break forest_join_38;
    }
    }
    life5_17 = 4;
    if (!((life4_5 == null))) {
        break forest_join_38;
    }
    }
    life5_17 = 5;
    if (!((life4_5 == null))) {
        break forest_join_38;
    }
    }
    forestValue825_37_0 = 0;
    }
    life5_17 = forestValue825_37_0;
    }
    spill825_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cJ.R))))))).booleanValue();
    if (!((life4_5 != null))) {
        forestValue825_55_0 = ((spill825_1) ? 1 : 0);
        break forest_join_55;
    }
    if (!(spill825_1)) {
        break forest_join_54;
    }
    life5_17 = (life5_17 | __sourceIntrinsic_8db5871551d4_invokedynamic825_12(22193, (468605770135519214L ^ life2_3)));
    }
    forestValue825_55_0 = life5_17;
    }
    return forestValue825_55_0;
}


protected static boolean b(net.minecraft.world.World p0, moom.DT p1, moom.bs p2) {
long local3 = (moom.cJ.T ^ 54938792734895L);
    java.lang.Object local5 = ((moom.DT)(p1)).a(((moom.bs)(p2)));
    return (__sourceIntrinsic_booleanComparison((((p2 == moom.bs.DOWN) ? net.minecraft.world.World.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(local5))) : ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(local5))))).a__ch())).e__Boolean()))) != 0);
}


public boolean b__Boolean(net.minecraft.world.World p0, moom.DT p1) {
int lexicalValue1074_35_0;
    int[] spill1074_0;
    boolean spill1074_1;
    long life3_3;
    moom.bs[] life6_6;
    int life7_9;
    int[] life5_10;
    int life8_12;
    moom.bs life9_19;
    lexical_join_35: {
    lexical_join_34: {
    life3_3 = (moom.cJ.T ^ 3780190515101L);
    spill1074_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_6 = moom.bs.values();
    life7_9 = (life6_6).length;
    life5_10 = spill1074_0;
    life8_12 = 0;
    lexical_cycle_13: while (true) {
    lexical_join_32: {
    lexical_join_31: {
    if (!((life8_12 < life7_9))) {
        break lexical_join_34;
    }
    life9_19 = (life6_6)[life8_12];
    if (!((life5_10 != null))) {
        break lexical_join_32;
    }
    spill1074_1 = moom.cJ.b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(life9_19)));
    if (!((life5_10 != null))) {
        lexicalValue1074_35_0 = ((spill1074_1) ? 1 : 0);
        break lexical_join_35;
    }
    if (!(spill1074_1)) {
        break lexical_join_31;
    }
    return ((1) != 0);
    }
    life8_12 += 1;
    }
    if (!((life5_10 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    lexicalValue1074_35_0 = 0;
    }
    return ((lexicalValue1074_35_0) != 0);
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
long local4 = (moom.cJ.T ^ 79604431471115L);
    int[] local6 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if ((local6 != null)) {
        if ((__sourceIntrinsic_booleanComparison(((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cJ.R))))))).booleanValue()) != 0)) {
        ((moom.cJ)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cJ.Q))))))));
    }
        super.c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    }
    return;
}


public boolean l() {
return ((1) != 0);
}


private void d(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int forwardValue3072_58_0;
    int forwardValue3072_60_0;
    int forwardValue3072_116_0;
    int forwardValue3072_164_0;
    int[] spill3072_0;
    boolean spill3072_1;
    int spill3072_2;
    int spill3072_3;
    int spill3072_4;
    long life4_3;
    java.util.List life7_50;
    int[] life6_51;
    int life8_63;
    int life9_69;
    forward_join_172: {
    forward_join_164: {
    forward_join_163: {
    forward_join_116: {
    forward_join_115: {
    forward_join_60: {
    forward_join_59: {
    forward_join_58: {
    life4_3 = (moom.cJ.T ^ 60037202554074L);
    ((moom.cJ)(this)).b__Void(((net.minecraft.block.state.IBlockState)(p2)));
    spill3072_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_50 = ((net.minecraft.world.World)(p0)).a(((java.lang.Class)(net.minecraft.entity.projectile.EntityArrow.class)), ((moom.CA)(new moom.CA((((double) ((moom.DT)(p1)).a()) + ((moom.cJ)(this)).B), (((double) ((moom.DT)(p1)).b()) + ((moom.cJ)(this)).C), (((double) ((moom.DT)(p1)).c()) + ((moom.cJ)(this)).D), (((double) ((moom.DT)(p1)).a()) + ((moom.cJ)(this)).E), (((double) ((moom.DT)(p1)).b()) + ((moom.cJ)(this)).F), (((double) ((moom.DT)(p1)).c()) + ((moom.cJ)(this)).G)))));
    life6_51 = spill3072_0;
    spill3072_1 = ((java.util.List)(life7_50)).isEmpty();
    if (!((life6_51 != null))) {
        forwardValue3072_58_0 = ((spill3072_1) ? 1 : 0);
        break forward_join_58;
    }
    if (!((!spill3072_1))) {
        break forward_join_59;
    }
    forwardValue3072_58_0 = 1;
    }
    forwardValue3072_60_0 = forwardValue3072_58_0;
    break forward_join_60;
    }
    forwardValue3072_60_0 = 0;
    }
    life8_63 = forwardValue3072_60_0;
    life9_69 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cJ.R))))))).booleanValue()) ? 1 : 0);
    spill3072_2 = life8_63;
    if (!((life6_51 != null))) {
        forwardValue3072_116_0 = spill3072_2;
        break forward_join_116;
    }
    if (!((spill3072_2 != 0))) {
        break forward_join_115;
    }
    spill3072_3 = life9_69;
    if (!((life6_51 != null))) {
        forwardValue3072_116_0 = spill3072_3;
        break forward_join_116;
    }
    if (!((spill3072_3 == 0))) {
        break forward_join_115;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.cJ.R)), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))));
    ((moom.cJ)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cJ.Q))))))));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((moom.DT)(p1)));
    ((net.minecraft.world.World)(p0)).a(((double)((((double) ((moom.DT)(p1)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(p1)).b()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(p1)).c()) + 0x1.0p-1d))), ((java.lang.String)("random.click")), ((float)(0x1.333334p-2f)), ((float)(0x1.333334p-1f)));
    }
    forwardValue3072_116_0 = life8_63;
    }
    if (!((life6_51 != null))) {
        forwardValue3072_164_0 = forwardValue3072_116_0;
        break forward_join_164;
    }
    if (!((forwardValue3072_116_0 == 0))) {
        break forward_join_163;
    }
    spill3072_4 = life9_69;
    if (!((life6_51 != null))) {
        forwardValue3072_164_0 = spill3072_4;
        break forward_join_164;
    }
    if (!((spill3072_4 != 0))) {
        break forward_join_163;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.cJ.R)), ((java.lang.Comparable)(java.lang.Boolean.FALSE))))));
    ((moom.cJ)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cJ.Q))))))));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((moom.DT)(p1)));
    ((net.minecraft.world.World)(p0)).a(((double)((((double) ((moom.DT)(p1)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(p1)).b()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(p1)).c()) + 0x1.0p-1d))), ((java.lang.String)("random.click")), ((float)(0x1.333334p-2f)), ((float)(0x1.0p-1f)));
    }
    forwardValue3072_164_0 = life8_63;
    }
    if (!((forwardValue3072_164_0 != 0))) {
        break forward_join_172;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)), ((int)(((moom.cJ)(this)).a(((net.minecraft.world.World)(p0))))));
    }
    return;
}


private void a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2) {
((net.minecraft.world.World)(p0)).b(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)));
    ((net.minecraft.world.World)(p0)).b(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(((moom.bs)(p2)).a__bs()))))), ((net.minecraft.block.Block)(this)));
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.Entity p3) {
int forwardValue3063_13_0;
    int forwardValue3063_21_0;
    boolean spill3063_0;
    long life5_3;
    int[] life7_5;
    forward_join_27: {
    forward_join_21: {
    forward_join_13: {
    life5_3 = (moom.cJ.T ^ 96292973112990L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3063_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life7_5 != null))) {
        forwardValue3063_13_0 = ((spill3063_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!((!spill3063_0))) {
        break forward_join_27;
    }
    forwardValue3063_13_0 = ((this.S) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        forwardValue3063_21_0 = forwardValue3063_13_0;
        break forward_join_21;
    }
    if (!((forwardValue3063_13_0 != 0))) {
        break forward_join_27;
    }
    forwardValue3063_21_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cJ.R))))))).booleanValue()) ? 1 : 0);
    }
    if (!((forwardValue3063_21_0 == 0))) {
        break forward_join_27;
    }
    ((moom.cJ)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    }
    return;
}


public int a(net.minecraft.world.World p0) {
int forwardValue3061_16_0;
    int forwardValue3061_22_0;
    boolean spill3061_0;
    long life2_3;
    int[] life4_5;
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (moom.cJ.T ^ 42908273748550L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3061_0 = this.S;
    if (!((life4_5 != null))) {
        forwardValue3061_16_0 = ((spill3061_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!(spill3061_0)) {
        break forward_join_17;
    }
    forwardValue3061_16_0 = __sourceIntrinsic_a3a6e3090437_invokedynamic3061_4(2264, (4133769312739952241L ^ life2_3));
    }
    forwardValue3061_22_0 = forwardValue3061_16_0;
    break forward_join_22;
    }
    forwardValue3061_22_0 = __sourceIntrinsic_a3a6e3090437_invokedynamic3061_5(31313, (8137963273713939710L ^ life2_3));
    }
    return forwardValue3061_22_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.cJ.Q, moom.cJ.R});
}


public boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1, moom.bs p2) {
return (__sourceIntrinsic_booleanComparison((moom.cJ.b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(((moom.bs)(p2)).a__bs()))))) != 0);
}


public moom.CA a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
return null;
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue3064_65_0;
    boolean spill3064_0;
    long life9_3;
    int[] life11_5;
    forward_join_65: {
    forward_join_16: {
    life9_3 = (moom.cJ.T ^ 71081613848063L);
    life11_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3064_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cJ.R))))))).booleanValue();
    if (!((life11_5 != null))) {
        forwardValue3064_65_0 = ((spill3064_0) ? 1 : 0);
        break forward_join_65;
    }
    if (!(spill3064_0)) {
        break forward_join_16;
    }
    return ((1) != 0);
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.cJ.R)), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))), ((int)(3)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((moom.DT)(p1)));
    ((net.minecraft.world.World)(p0)).a(((double)((((double) ((moom.DT)(p1)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(p1)).b()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(p1)).c()) + 0x1.0p-1d))), ((java.lang.String)("random.click")), ((float)(0x1.333334p-2f)), ((float)(0x1.333334p-1f)));
    ((moom.cJ)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cJ.Q))))))));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)), ((int)(((moom.cJ)(this)).a(((net.minecraft.world.World)(p0))))));
    forwardValue3064_65_0 = 1;
    }
    return ((forwardValue3064_65_0) != 0);
}


private boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int forwardValue3065_26_0;
    boolean spill3065_0;
    long life4_3;
    int[] life6_5;
    forward_join_26: {
    forward_join_15: {
    life4_3 = (moom.cJ.T ^ 42109028493348L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3065_0 = ((moom.cJ)(this)).b__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    if (!((life6_5 != null))) {
        forwardValue3065_26_0 = ((spill3065_0) ? 1 : 0);
        break forward_join_26;
    }
    if (!(spill3065_0)) {
        break forward_join_15;
    }
    return ((1) != 0);
    }
    ((moom.cJ)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(0)));
    ((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)));
    forwardValue3065_26_0 = 0;
    }
    return ((forwardValue3065_26_0) != 0);
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
int forwardValue3062_22_0;
    int forwardValue3062_34_0;
    boolean spill3062_0;
    long life5_3;
    int[] life7_5;
    forward_join_35: {
    forward_join_34: {
    forward_join_22: {
    life5_3 = (moom.cJ.T ^ 58384211028201L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3062_0 = ((moom.cJ)(this)).a__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    if (!((life7_5 != null))) {
        forwardValue3062_22_0 = ((spill3062_0) ? 1 : 0);
        break forward_join_22;
    }
    if (!(spill3062_0)) {
        break forward_join_35;
    }
    forwardValue3062_22_0 = ((moom.cJ.b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cJ.Q))))))).a__bs())))) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        forwardValue3062_34_0 = forwardValue3062_22_0;
        break forward_join_34;
    }
    if (!((forwardValue3062_22_0 == 0))) {
        break forward_join_35;
    }
    ((moom.cJ)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(0)));
    forwardValue3062_34_0 = ((((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3062_34_0);
    }
    return;
}


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
((moom.cJ)(this)).b__Void(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1))))));
    return;
}


public void a__Void() {
float local1 = 0x1.8p-3f;
    float local2 = 0x1.0p-3f;
    float local3 = 0x1.0p-3f;
    ((moom.cJ)(this)).a(((float)((0x1.0p-1f - local1))), ((float)((0x1.0p-1f - local2))), ((float)((0x1.0p-1f - local3))), ((float)((0x1.0p-1f + local1))), ((float)((0x1.0p-1f + local2))), ((float)((0x1.0p-1f + local3))));
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
return;
}


public net.minecraft.block.state.IBlockState a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, float p3, float p4, float p5, int p6, net.minecraft.entity.EntityLivingBase p7) {
long local9 = (moom.cJ.T ^ 51504718792738L);
    return ((__sourceIntrinsic_booleanComparison(moom.cJ.b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(((moom.bs)(p2)).a__bs())))) != 0) ? ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.cJ)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cJ.Q)), ((java.lang.Comparable)(p2))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.cJ.R)), ((java.lang.Comparable)(java.lang.Boolean.FALSE))) : ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.cJ)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cJ.Q)), ((java.lang.Comparable)(moom.bs.DOWN))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.cJ.R)), ((java.lang.Comparable)(java.lang.Boolean.FALSE))));
}


public int a(net.minecraft.world.IBlockAccess p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.bs p3) {
int forwardValue3060_19_0;
    int forwardValue3060_21_0;
    boolean spill3060_0;
    long life5_3;
    int[] life7_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life5_3 = (moom.cJ.T ^ 98422745497319L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3060_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cJ.R))))))).booleanValue();
    if (!((life7_5 != null))) {
        forwardValue3060_19_0 = ((spill3060_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill3060_0)) {
        break forward_join_20;
    }
    forwardValue3060_19_0 = __sourceIntrinsic_0beb55581d70_invokedynamic3060_7(31529, (2060923851894235430L ^ life5_3));
    }
    forwardValue3060_21_0 = forwardValue3060_19_0;
    break forward_join_21;
    }
    forwardValue3060_21_0 = 0;
    }
    return forwardValue3060_21_0;
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_0beb55581d70_invokedynamic3060_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a3a6e3090437_invokedynamic3061_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a3a6e3090437_invokedynamic3061_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7081_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8db5871551d4_invokedynamic825_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b0b3991ff8d9_invokedynamic3067_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_invokedynamic824_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_invokedynamic824_13(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
