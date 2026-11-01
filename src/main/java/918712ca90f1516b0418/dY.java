package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class dY extends net.minecraft.block.Block {

public static final moom.fx Q;

public static final moom.fw<net.minecraft.block.BlockPistonExtension$EnumPistonType> R;

public static final moom.fv S;

private static final long T;

private static final long[] U;

private static final java.lang.Integer[] V;

private static final java.util.Map W;

public dY() {
super(moom.fn.H);
    (this).a__Void(((((this.M).a__fE()).a__fE(moom.dY.Q, moom.bs.NORTH)).a__fE(moom.dY.R, net.minecraft.block.BlockPistonExtension$EnumPistonType.DEFAULT)).a__fE(moom.dY.S, java.lang.Boolean.FALSE));
    (this).a(moom.dY.i);
    (this).c(0x1.0000000000000p-1f);
}


static {
T = ((long)(((moom._a)(moom._c.a(((long)(-8191209551938246126L)), ((long)(4930151076823905105L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(247057326757203L)))));
    W = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.dY.T ^ 82136641489200L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill810_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill810_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill810_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill810_14 = new byte[8];
    (__sourceSpill810_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill810_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation810_16 = __sourceSpill810_14;
    ((javax.crypto.Cipher)(__sourceSpill810_11)).init(((int)(__sourceSpill810_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill810_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation810_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\006d\002võµ\016\017+mW!\026l¶¶å\021y£ðÜM"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill810_25 = local6_life21;
        int __sourceSpill810_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill810_25)).substring(((int)(__sourceSpill810_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill810_30 = local8_life19;
        int __sourceSpill810_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill810_33 = new byte[8];
        (__sourceSpill810_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill810_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill810_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill810_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill810_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill810_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill810_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill810_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill810_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill810_34)).doFinal(((byte[])(__sourceSpill810_33)));
        (__sourceSpill810_30)[__sourceSpill810_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    U = ((long[])(local8_life19));
    V = ((java.lang.Integer[])(new java.lang.Integer[3]));
    Q = ((moom.fx)(moom.fx.a(((java.lang.String)("facing")))));
    R = ((moom.fw)(moom.fw.a(((java.lang.String)("type")), ((java.lang.Class)(net.minecraft.block.BlockPistonExtension$EnumPistonType.class)))));
    S = ((moom.fv)(moom.fv.a(((java.lang.String)("short")))));
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
long local2 = (moom.dY.T ^ 52124687471597L);
    return ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.dY)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dY.Q)), ((java.lang.Comparable)(moom.dY.a(((int)(p0)))))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.dY.R)), ((java.lang.Comparable)((((p0 & __sourceIntrinsic_819466f05fee_invokedynamic6230_6(25470, (2172797590871510031L ^ local2))) > 0) ? net.minecraft.block.BlockPistonExtension$EnumPistonType.STICKY : net.minecraft.block.BlockPistonExtension$EnumPistonType.DEFAULT))));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7336_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/dY"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private void b__Void(net.minecraft.block.state.IBlockState p0) {
int[] spill329_0;
    long life2_3;
    float life5_5;
    float life6_7;
    float life7_10;
    float life8_12;
    int[] life4_13;
    float life9_15;
    forward_join_84: {
    forward_join_76: {
    forward_join_66: {
    forward_join_56: {
    forward_join_46: {
    forward_join_36: {
    forward_join_34: {
    forward_join_26: {
    life2_3 = (moom.dY.T ^ 15015518250892L);
    life5_5 = 0x1.0p-2f;
    life6_7 = 0x1.8p-2f;
    spill329_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_10 = 0x1.4p-1f;
    life8_12 = 0x1.0p-2f;
    life4_13 = spill329_0;
    life9_15 = 0x1.8p-1f;
    if (!((life4_13 != null))) {
        break forward_join_34;
    }
    switch ((moom.e3.a)[((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dY.Q))))))).ordinal()]) {
case 1:
{
        break forward_join_26;
    }
case 2:
{
        break forward_join_36;
    }
case 3:
{
        break forward_join_46;
    }
case 4:
{
        break forward_join_56;
    }
case 5:
{
        break forward_join_66;
    }
case 6:
{
        break forward_join_76;
    }
default:
{
        break forward_join_84;
    }
}
    }
    ((moom.dY)(this)).a(((float)(0x1.8p-2f)), ((float)(0x1.0p-2f)), ((float)(0x1.8p-2f)), ((float)(0x1.4p-1f)), ((float)(0x1.0p0f)), ((float)(0x1.4p-1f)));
    }
    if (!((life4_13 == null))) {
        break forward_join_84;
    }
    }
    ((moom.dY)(this)).a(((float)(0x1.8p-2f)), ((float)(0x0.0p0f)), ((float)(0x1.8p-2f)), ((float)(0x1.4p-1f)), ((float)(0x1.8p-1f)), ((float)(0x1.4p-1f)));
    if (!((life4_13 == null))) {
        break forward_join_84;
    }
    }
    ((moom.dY)(this)).a(((float)(0x1.0p-2f)), ((float)(0x1.8p-2f)), ((float)(0x1.0p-2f)), ((float)(0x1.8p-1f)), ((float)(0x1.4p-1f)), ((float)(0x1.0p0f)));
    if (!((life4_13 == null))) {
        break forward_join_84;
    }
    }
    ((moom.dY)(this)).a(((float)(0x1.0p-2f)), ((float)(0x1.8p-2f)), ((float)(0x0.0p0f)), ((float)(0x1.8p-1f)), ((float)(0x1.4p-1f)), ((float)(0x1.8p-1f)));
    if (!((life4_13 == null))) {
        break forward_join_84;
    }
    }
    ((moom.dY)(this)).a(((float)(0x1.8p-2f)), ((float)(0x1.0p-2f)), ((float)(0x1.0p-2f)), ((float)(0x1.4p-1f)), ((float)(0x1.8p-1f)), ((float)(0x1.0p0f)));
    if (!((life4_13 == null))) {
        break forward_join_84;
    }
    }
    ((moom.dY)(this)).a(((float)(0x0.0p0f)), ((float)(0x1.8p-2f)), ((float)(0x1.0p-2f)), ((float)(0x1.8p-1f)), ((float)(0x1.4p-1f)), ((float)(0x1.8p-1f)));
    }
    return;
}


public int b(net.minecraft.block.state.IBlockState p0) {
int forwardValue3287_32_0;
    int[] spill3287_0;
    int spill3287_1;
    long life2_3;
    int life5_6;
    int[] life4_7;
    int life5_17;
    forward_join_32: {
    forward_join_31: {
    life2_3 = (moom.dY.T ^ 39428205799655L);
    spill3287_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_6 = 0;
    life4_7 = spill3287_0;
    spill3287_1 = (life5_6 | ((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dY.Q))))))).a());
    if (!((life4_7 != null))) {
        forwardValue3287_32_0 = spill3287_1;
        break forward_join_32;
    }
    life5_17 = spill3287_1;
    if (!((((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dY.R))) == net.minecraft.block.BlockPistonExtension$EnumPistonType.STICKY))) {
        break forward_join_31;
    }
    life5_17 = (life5_17 | __sourceIntrinsic_8db5871551d4_invokedynamic3287_9(2597, (8423833895914380892L ^ life2_3)));
    }
    forwardValue3287_32_0 = life5_17;
    }
    return forwardValue3287_32_0;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x4BF;
        if (V[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = U[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])W.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    W.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/dY", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            dY.V[n2] = n3;
        }
        return V[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.dY.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean b__Boolean(net.minecraft.world.World p0, moom.DT p1) {
return ((0) != 0);
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
net.minecraft.block.state.IBlockState forwardValue3290_38_0;
    int forwardValue3290_55_0;
    int[] spill3290_0;
    net.minecraft.block.state.IBlockState spill3290_1;
    net.minecraft.block.state.IBlockState spill3290_2;
    boolean spill3290_3;
    long life4_3;
    moom.bs life7_14;
    moom.DT life2_19;
    net.minecraft.block.state.IBlockState life8_23;
    int[] life6_24;
    forward_join_56: {
    forward_join_55: {
    forward_join_38: {
    forward_join_37: {
    life4_3 = (moom.dY.T ^ 116076684928857L);
    super.c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    life7_14 = ((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dY.Q))))))).a__bs();
    spill3290_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life2_19 = ((moom.DT)(p1)).a(((moom.bs)(life7_14)));
    life8_23 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life2_19)));
    life6_24 = spill3290_0;
    spill3290_1 = life8_23;
    if (!((life6_24 != null))) {
        forwardValue3290_38_0 = spill3290_1;
        break forward_join_38;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill3290_1)).a__ch() != net.minecraft.init.Blocks.J))) {
        break forward_join_37;
    }
    spill3290_2 = life8_23;
    if (!((life6_24 != null))) {
        forwardValue3290_38_0 = spill3290_2;
        break forward_join_38;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill3290_2)).a__ch() == net.minecraft.init.Blocks.F))) {
        break forward_join_56;
    }
    }
    forwardValue3290_38_0 = life8_23;
    }
    spill3290_3 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(forwardValue3290_38_0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockPistonBase.R))))))).booleanValue();
    if (!((life6_24 != null))) {
        forwardValue3290_55_0 = ((spill3290_3) ? 1 : 0);
        break forward_join_55;
    }
    if (!(spill3290_3)) {
        break forward_join_56;
    }
    ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life8_23)).a__ch())).a(((net.minecraft.world.World)(p0)), ((moom.DT)(life2_19)), ((net.minecraft.block.state.IBlockState)(life8_23)), ((int)(0)));
    forwardValue3290_55_0 = ((((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(life2_19)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3290_55_0);
    }
    return;
}


public void c__sourceReturn_2167789c79(net.minecraft.block.state.IBlockState p0) {
int[] spill330_0;
    long life2_3;
    float life5_5;
    moom.bs life6_11;
    int[] life4_12;
    forward_join_78: {
    forward_join_70: {
    forward_join_60: {
    forward_join_50: {
    forward_join_40: {
    forward_join_30: {
    forward_join_20: {
    life2_3 = (moom.dY.T ^ 66365335618125L);
    life5_5 = 0x1.0p-2f;
    spill330_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_11 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dY.Q)))));
    life4_12 = spill330_0;
    if (!((life6_11 != null))) {
        break forward_join_78;
    }
    switch ((moom.e3.a)[((moom.bs)(life6_11)).ordinal()]) {
case 1:
{
        break forward_join_20;
    }
case 2:
{
        break forward_join_30;
    }
case 3:
{
        break forward_join_40;
    }
case 4:
{
        break forward_join_50;
    }
case 5:
{
        break forward_join_60;
    }
case 6:
{
        break forward_join_70;
    }
default:
{
        break forward_join_78;
    }
}
    }
    ((moom.dY)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p-2f)), ((float)(0x1.0p0f)));
    if (!((life4_12 == null))) {
        break forward_join_78;
    }
    }
    ((moom.dY)(this)).a(((float)(0x0.0p0f)), ((float)(0x1.8p-1f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    if (!((life4_12 == null))) {
        break forward_join_78;
    }
    }
    ((moom.dY)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p-2f)));
    if (!((life4_12 == null))) {
        break forward_join_78;
    }
    }
    ((moom.dY)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.8p-1f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    if (!((life4_12 == null))) {
        break forward_join_78;
    }
    }
    ((moom.dY)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p-2f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    if (!((life4_12 == null))) {
        break forward_join_78;
    }
    }
    ((moom.dY)(this)).a(((float)(0x1.8p-1f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    }
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.CA p3, java.util.List<moom.CA> p4, net.minecraft.entity.Entity p5) {
((moom.dY)(this)).c__sourceReturn_2167789c79(((net.minecraft.block.state.IBlockState)(p2)));
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.CA)(p3)), ((java.util.List)(p4)), ((net.minecraft.entity.Entity)(p5)));
    ((moom.dY)(this)).b__Void(((net.minecraft.block.state.IBlockState)(p2)));
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.CA)(p3)), ((java.util.List)(p4)), ((net.minecraft.entity.Entity)(p5)));
    ((moom.dY)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    return;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.dY.Q, moom.dY.R, moom.dY.S});
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
net.minecraft.block.Block forwardValue3285_40_0;
    int[] spill3285_0;
    net.minecraft.block.Block spill3285_1;
    net.minecraft.block.Block spill3285_2;
    long life5_3;
    moom.bs life8_8;
    moom.DT life9_13;
    net.minecraft.block.state.IBlockState life10_18;
    int[] life7_19;
    forward_join_45: {
    forward_join_40: {
    forward_join_38: {
    life5_3 = (moom.dY.T ^ 23011602632123L);
    life8_8 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dY.Q)))));
    life9_13 = ((moom.DT)(p1)).a(((moom.bs)(((moom.bs)(life8_8)).a__bs())));
    spill3285_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life10_18 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life9_13)));
    life7_19 = spill3285_0;
    spill3285_1 = ((net.minecraft.block.state.IBlockState)(life10_18)).a__ch();
    if (!((life7_19 != null))) {
        forwardValue3285_40_0 = spill3285_1;
        break forward_join_40;
    }
    if (!((spill3285_1 != net.minecraft.init.Blocks.J))) {
        break forward_join_38;
    }
    spill3285_2 = ((net.minecraft.block.state.IBlockState)(life10_18)).a__ch();
    if (!((life7_19 != null))) {
        forwardValue3285_40_0 = spill3285_2;
        break forward_join_40;
    }
    if (!((spill3285_2 != net.minecraft.init.Blocks.F))) {
        break forward_join_38;
    }
    ((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)));
    if (!((life7_19 == null))) {
        break forward_join_45;
    }
    }
    forwardValue3285_40_0 = ((net.minecraft.block.state.IBlockState)(life10_18)).a__ch();
    }
    ((net.minecraft.block.Block)(forwardValue3285_40_0)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(life9_13)), ((net.minecraft.block.state.IBlockState)(life10_18)), ((net.minecraft.block.Block)(p3)));
    }
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3) {
net.minecraft.block.Block forwardValue3286_38_0;
    net.minecraft.block.BlockPistonBase forwardValue3286_38_1;
    net.minecraft.block.Block spill3286_0;
    net.minecraft.block.BlockPistonBase spill3286_1;
    long life5_3;
    int[] life7_5;
    moom.bs life8_19;
    moom.DT life9_31;
    net.minecraft.block.Block life10_36;
    forward_join_49: {
    forward_join_43: {
    forward_join_39: {
    forward_join_38: {
    life5_3 = (moom.dY.T ^ 130383566740127L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!((life7_5 != null))) {
        break forward_join_49;
    }
    if (!(((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p3)).b1)).d)) {
        break forward_join_43;
    }
    life8_19 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dY.Q)))));
    if (!((life7_5 != null))) {
        break forward_join_49;
    }
    if (!((life8_19 != null))) {
        break forward_join_43;
    }
    life9_31 = ((moom.DT)(p1)).a(((moom.bs)(((moom.bs)(life8_19)).a__bs())));
    life10_36 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life9_31))))).a__ch();
    spill3286_0 = life10_36;
    spill3286_1 = net.minecraft.init.Blocks.J;
    if (!((life7_5 != null))) {
        forwardValue3286_38_0 = spill3286_0;
        forwardValue3286_38_1 = spill3286_1;
        break forward_join_38;
    }
    if (!((spill3286_0 != spill3286_1))) {
        break forward_join_39;
    }
    forwardValue3286_38_0 = life10_36;
    forwardValue3286_38_1 = net.minecraft.init.Blocks.F;
    }
    if (!((forwardValue3286_38_0 == forwardValue3286_38_1))) {
        break forward_join_43;
    }
    }
    ((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(life9_31)));
    }
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((net.minecraft.entity.player.EntityPlayer)(p3)));
    }
    return;
}


public boolean a__Boolean(net.minecraft.world.IBlockAccess p0, moom.DT p1, moom.bs p2) {
return ((1) != 0);
}


public boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1, moom.bs p2) {
return ((0) != 0);
}


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
((moom.dY)(this)).c__sourceReturn_2167789c79(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1))))));
    return;
}


public int a(java.util.Random p0) {
return 0;
}


public net.minecraft.item.Item a__wQ(net.minecraft.world.World p0, moom.DT p1) {
long local3 = (moom.dY.T ^ 8968659941588L);
    return ((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))).a(((net.minecraft.block.properties.IProperty)(moom.dY.R))) == net.minecraft.block.BlockPistonExtension$EnumPistonType.STICKY) ? net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.F))) : net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.J))));
}


public static moom.bs a__sourceReturn_5c5084b5c8(int p0) {
int forwardValue3284_22_0;
    moom.bs forwardValue3284_23_0;
    int[] spill3284_0;
    int spill3284_1;
    long life1_3;
    int life4_12;
    int[] life3_13;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    life1_3 = (moom.dY.T ^ 118278403436078L);
    spill3284_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life4_12 = (p0 & __sourceIntrinsic_4059fcd1c032_invokedynamic3284_2(528, (1902774957550784673L ^ life1_3)));
    life3_13 = spill3284_0;
    spill3284_1 = life4_12;
    if (!((life3_13 != null))) {
        forwardValue3284_22_0 = spill3284_1;
        break forward_join_22;
    }
    if (!((spill3284_1 > 5))) {
        break forward_join_21;
    }
    forwardValue3284_23_0 = null;
    break forward_join_23;
    }
    forwardValue3284_22_0 = life4_12;
    }
    forwardValue3284_23_0 = moom.bs.a(((int)(forwardValue3284_22_0)));
    }
    return forwardValue3284_23_0;
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_4059fcd1c032_invokedynamic3284_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7336_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8db5871551d4_invokedynamic3287_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_invokedynamic6230_6(int a0, long a1) throws E;
}
