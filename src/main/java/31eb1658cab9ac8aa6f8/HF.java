package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
abstract class HF extends moom.G4 {

protected moom.bJ e;

private static final long l;

private static final long[] m;

private static final java.lang.Integer[] n;

private static final java.util.Map o;

public HF() {
super();
    this.e = moom.bJ.OPENING;
}


protected HF(int p0) {
super(p0);
    this.e = moom.bJ.OPENING;
}


static {
l = ((long)(((moom._a)(moom._c.a(((long)(-4420637806349490231L)), ((long)(-5705110175335462811L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(101363597432011L)))));
    o = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.HF.l ^ 54465789680673L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill570_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill570_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill570_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill570_14 = new byte[8];
    (__sourceSpill570_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill570_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation570_16 = __sourceSpill570_14;
    ((javax.crypto.Cipher)(__sourceSpill570_11)).init(((int)(__sourceSpill570_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill570_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation570_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "%'h\006´!îH\034À4\032bþlrÒª"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill570_25 = local6_life21;
        int __sourceSpill570_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill570_25)).substring(((int)(__sourceSpill570_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill570_30 = local8_life19;
        int __sourceSpill570_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill570_33 = new byte[8];
        (__sourceSpill570_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill570_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill570_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill570_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill570_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill570_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill570_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill570_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill570_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill570_34)).doFinal(((byte[])(__sourceSpill570_33)));
        (__sourceSpill570_30)[__sourceSpill570_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    m = ((long[])(local8_life19));
    n = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


protected moom.G4 b(moom.HQ p0, java.util.List<moom.G4> p1, java.util.Random p2, int p3, int p4) {
long life6_3;
    forward_join_59: {
    forward_join_36: {
    forward_join_13: {
    life6_3 = (moom.HF.l ^ 129498160989441L);
    if (!((((moom.HF)(this)).b != null))) {
        break forward_join_59;
    }
    switch ((moom.Iz.a)[((moom.bs)(((moom.HF)(this)).b)).ordinal()]) {
case 1:
case 4:
{
        break forward_join_13;
    }
case 2:
case 3:
{
        break forward_join_36;
    }
default:
{
        break forward_join_59;
    }
}
    }
    return __sourceExactCall_ae97c77343187e(((moom.HQ)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(((moom.HF)(this)).a)).a - 1))), ((int)((((moom.G2)(((moom.HF)(this)).a)).b + p3))), ((int)((((moom.G2)(((moom.HF)(this)).a)).c + p4))), ((moom.bs)(moom.bs.WEST)), ((int)(__sourceExactCall_3d52f3de4b3981(((moom.HF)(this))))));
    }
    return __sourceExactCall_ae97c77343187e(((moom.HQ)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(((moom.HF)(this)).a)).a + p4))), ((int)((((moom.G2)(((moom.HF)(this)).a)).b + p3))), ((int)((((moom.G2)(((moom.HF)(this)).a)).c - 1))), ((moom.bs)(moom.bs.NORTH)), ((int)(__sourceExactCall_3d52f3de4b3981(((moom.HF)(this))))));
    }
    return null;
}


protected void b(net.minecraft.nbt.NBTTagCompound p0) {
this.e = ((moom.bJ)(moom.bJ.valueOf(((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__String(((java.lang.String)("EntryDoor"))))))));
    return;
}


protected moom.G4 c(moom.HQ p0, java.util.List<moom.G4> p1, java.util.Random p2, int p3, int p4) {
long life6_3;
    forward_join_59: {
    forward_join_36: {
    forward_join_13: {
    life6_3 = (moom.HF.l ^ 71839624262112L);
    if (!((((moom.HF)(this)).b != null))) {
        break forward_join_59;
    }
    switch ((moom.Iz.a)[((moom.bs)(((moom.HF)(this)).b)).ordinal()]) {
case 1:
case 4:
{
        break forward_join_13;
    }
case 2:
case 3:
{
        break forward_join_36;
    }
default:
{
        break forward_join_59;
    }
}
    }
    return __sourceExactCall_ae97c77343187e(((moom.HQ)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(((moom.HF)(this)).a)).d + 1))), ((int)((((moom.G2)(((moom.HF)(this)).a)).b + p3))), ((int)((((moom.G2)(((moom.HF)(this)).a)).c + p4))), ((moom.bs)(moom.bs.EAST)), ((int)(__sourceExactCall_3d52f3de4b3981(((moom.HF)(this))))));
    }
    return __sourceExactCall_ae97c77343187e(((moom.HQ)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(((moom.HF)(this)).a)).a + p4))), ((int)((((moom.G2)(((moom.HF)(this)).a)).b + p3))), ((int)((((moom.G2)(((moom.HF)(this)).a)).f + 1))), ((moom.bs)(moom.bs.SOUTH)), ((int)(__sourceExactCall_3d52f3de4b3981(((moom.HF)(this))))));
    }
    return null;
}


protected void a(net.minecraft.nbt.NBTTagCompound p0) {
((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("EntryDoor")), ((java.lang.String)(((moom.bJ)(this.e)).name())));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4737_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/HF"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x67B6;
        if (HF.n[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = m[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])o.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    o.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/HF", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            HF.n[n2] = n3;
        }
        return HF.n[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_939381d17da898(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected void a(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2, moom.bJ p3, int p4, int p5, int p6) {
long life8_3;
    net.minecraft.entity.Entity[] life10_5;
    forest_join_405: {
    forest_join_386: {
    forest_join_257: {
    forest_join_150: {
    forest_join_38: {
    forest_join_13: {
    life8_3 = (moom.HF.l ^ 45126688807206L);
    life10_5 = moom.G4.b();
    if (!((life10_5 != null))) {
        break forest_join_386;
    }
    switch ((moom.Iz.b)[((moom.bJ)(p3)).ordinal()]) {
case 1:
default:
{
        break forest_join_13;
    }
case 2:
{
        break forest_join_38;
    }
case 3:
{
        break forest_join_150;
    }
case 4:
{
        break forest_join_257;
    }
}
    }
    ((moom.HF)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(p4)), ((int)(p5)), ((int)(p6)), ((int)(((p4 + 3) - 1))), ((int)(((p5 + 3) - 1))), ((int)(p6)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    if (!((life10_5 == null))) {
        break forest_join_405;
    }
    }
    ((moom.HF)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(p4)), ((int)(p5)), ((int)(p6)), ((moom.G2)(p2)));
    ((moom.HF)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(p4)), ((int)((p5 + 1))), ((int)(p6)), ((moom.G2)(p2)));
    ((moom.HF)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(p4)), ((int)((p5 + 2))), ((int)(p6)), ((moom.G2)(p2)));
    ((moom.HF)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)((p4 + 1))), ((int)((p5 + 2))), ((int)(p6)), ((moom.G2)(p2)));
    ((moom.HF)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)((p4 + 2))), ((int)((p5 + 2))), ((int)(p6)), ((moom.G2)(p2)));
    ((moom.HF)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)((p4 + 2))), ((int)((p5 + 1))), ((int)(p6)), ((moom.G2)(p2)));
    ((moom.HF)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)((p4 + 2))), ((int)(p5)), ((int)(p6)), ((moom.G2)(p2)));
    ((moom.HF)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ao)).a__fE())), ((int)((p4 + 1))), ((int)(p5)), ((int)(p6)), ((moom.G2)(p2)));
    ((moom.HF)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ao)).b__fE(((int)(__sourceIntrinsic_bb66ff5db130_invokedynamic669_34(2778, (6390811832543857434L ^ life8_3))))))), ((int)((p4 + 1))), ((int)((p5 + 1))), ((int)(p6)), ((moom.G2)(p2)));
    if (!((life10_5 == null))) {
        break forest_join_405;
    }
    }
    ((moom.HF)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)((p4 + 1))), ((int)(p5)), ((int)(p6)), ((moom.G2)(p2)));
    ((moom.HF)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)((p4 + 1))), ((int)((p5 + 1))), ((int)(p6)), ((moom.G2)(p2)));
    ((moom.HF)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a8)).a__fE())), ((int)(p4)), ((int)(p5)), ((int)(p6)), ((moom.G2)(p2)));
    ((moom.HF)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a8)).a__fE())), ((int)(p4)), ((int)((p5 + 1))), ((int)(p6)), ((moom.G2)(p2)));
    ((moom.HF)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a8)).a__fE())), ((int)(p4)), ((int)((p5 + 2))), ((int)(p6)), ((moom.G2)(p2)));
    ((moom.HF)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a8)).a__fE())), ((int)((p4 + 1))), ((int)((p5 + 2))), ((int)(p6)), ((moom.G2)(p2)));
    ((moom.HF)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a8)).a__fE())), ((int)((p4 + 2))), ((int)((p5 + 2))), ((int)(p6)), ((moom.G2)(p2)));
    ((moom.HF)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a8)).a__fE())), ((int)((p4 + 2))), ((int)((p5 + 1))), ((int)(p6)), ((moom.G2)(p2)));
    ((moom.HF)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a8)).a__fE())), ((int)((p4 + 2))), ((int)(p5)), ((int)(p6)), ((moom.G2)(p2)));
    if (!((life10_5 == null))) {
        break forest_join_405;
    }
    }
    ((moom.HF)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(p4)), ((int)(p5)), ((int)(p6)), ((moom.G2)(p2)));
    ((moom.HF)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(p4)), ((int)((p5 + 1))), ((int)(p6)), ((moom.G2)(p2)));
    ((moom.HF)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(p4)), ((int)((p5 + 2))), ((int)(p6)), ((moom.G2)(p2)));
    ((moom.HF)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)((p4 + 1))), ((int)((p5 + 2))), ((int)(p6)), ((moom.G2)(p2)));
    ((moom.HF)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)((p4 + 2))), ((int)((p5 + 2))), ((int)(p6)), ((moom.G2)(p2)));
    ((moom.HF)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)((p4 + 2))), ((int)((p5 + 1))), ((int)(p6)), ((moom.G2)(p2)));
    ((moom.HF)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)((p4 + 2))), ((int)(p5)), ((int)(p6)), ((moom.G2)(p2)));
    ((moom.HF)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aA)).a__fE())), ((int)((p4 + 1))), ((int)(p5)), ((int)(p6)), ((moom.G2)(p2)));
    ((moom.HF)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aA)).b__fE(((int)(__sourceIntrinsic_bb66ff5db130_invokedynamic669_89(26252, (7451433332844570447L ^ life8_3))))))), ((int)((p4 + 1))), ((int)((p5 + 1))), ((int)(p6)), ((moom.G2)(p2)));
    ((moom.HF)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aG)).b__fE(((int)(((moom.HF)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aG)), ((int)(4)))))))), ((int)((p4 + 2))), ((int)((p5 + 1))), ((int)((p6 + 1))), ((moom.G2)(p2)));
    }
    ((moom.HF)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aG)).b__fE(((int)(((moom.HF)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aG)), ((int)(3)))))))), ((int)((p4 + 2))), ((int)((p5 + 1))), ((int)((p6 - 1))), ((moom.G2)(p2)));
    }
    return;
}


protected moom.bJ a(java.util.Random p0) {
long local2 = (moom.HF.l ^ 43402370550302L);
    int local4 = ((java.util.Random)(p0)).nextInt(((int)(5)));
    switch (local4) {
case 0:
case 1:
default:
{
        return moom.bJ.OPENING;
    }
case 2:
{
        return moom.bJ.WOOD_DOOR;
    }
case 3:
{
        return moom.bJ.GRATES;
    }
case 4:
{
        return moom.bJ.IRON_DOOR;
    }
}
}


protected moom.G4 a(moom.HQ p0, java.util.List<moom.G4> p1, java.util.Random p2, int p3, int p4) {
long life6_3;
    forward_join_109: {
    forward_join_85: {
    forward_join_61: {
    forward_join_37: {
    forward_join_13: {
    life6_3 = (moom.HF.l ^ 52840965087647L);
    if (!((((moom.HF)(this)).b != null))) {
        break forward_join_109;
    }
    switch ((moom.Iz.a)[((moom.bs)(((moom.HF)(this)).b)).ordinal()]) {
case 4:
{
        break forward_join_13;
    }
case 1:
{
        break forward_join_37;
    }
case 2:
{
        break forward_join_61;
    }
case 3:
{
        break forward_join_85;
    }
default:
{
        break forward_join_109;
    }
}
    }
    return __sourceExactCall_ae97c77343187e(((moom.HQ)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(((moom.HF)(this)).a)).a + p3))), ((int)((((moom.G2)(((moom.HF)(this)).a)).b + p4))), ((int)((((moom.G2)(((moom.HF)(this)).a)).c - 1))), ((moom.bs)(((moom.HF)(this)).b)), ((int)(__sourceExactCall_3d52f3de4b3981(((moom.HF)(this))))));
    }
    return __sourceExactCall_ae97c77343187e(((moom.HQ)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(((moom.HF)(this)).a)).a + p3))), ((int)((((moom.G2)(((moom.HF)(this)).a)).b + p4))), ((int)((((moom.G2)(((moom.HF)(this)).a)).f + 1))), ((moom.bs)(((moom.HF)(this)).b)), ((int)(__sourceExactCall_3d52f3de4b3981(((moom.HF)(this))))));
    }
    return __sourceExactCall_ae97c77343187e(((moom.HQ)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(((moom.HF)(this)).a)).a - 1))), ((int)((((moom.G2)(((moom.HF)(this)).a)).b + p4))), ((int)((((moom.G2)(((moom.HF)(this)).a)).c + p3))), ((moom.bs)(((moom.HF)(this)).b)), ((int)(__sourceExactCall_3d52f3de4b3981(((moom.HF)(this))))));
    }
    return __sourceExactCall_ae97c77343187e(((moom.HQ)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(((moom.HF)(this)).a)).d + 1))), ((int)((((moom.G2)(((moom.HF)(this)).a)).b + p4))), ((int)((((moom.G2)(((moom.HF)(this)).a)).c + p3))), ((moom.bs)(((moom.HF)(this)).b)), ((int)(__sourceExactCall_3d52f3de4b3981(((moom.HF)(this))))));
    }
    return null;
}


protected static boolean a(moom.G2 p0) {
moom.G2 forwardValue2060_11_0;
    int forwardValue2060_21_0;
    int forwardValue2060_23_0;
    moom.G2 spill2060_0;
    int spill2060_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_11: {
    life1_3 = (moom.HF.l ^ 10028089159572L);
    life3_5 = moom.G4.b();
    spill2060_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue2060_11_0 = spill2060_0;
        break forward_join_11;
    }
    if (!((spill2060_0 != null))) {
        break forward_join_22;
    }
    forwardValue2060_11_0 = p0;
    }
    spill2060_1 = ((moom.G2)(forwardValue2060_11_0)).b;
    if (!((life3_5 != null))) {
        forwardValue2060_21_0 = spill2060_1;
        break forward_join_21;
    }
    if (!((spill2060_1 > __sourceIntrinsic_bf326bccd126_invokedynamic2060_3(20108, (7850021687016241660L ^ life1_3))))) {
        break forward_join_22;
    }
    forwardValue2060_21_0 = 1;
    }
    forwardValue2060_23_0 = forwardValue2060_21_0;
    break forward_join_23;
    }
    forwardValue2060_23_0 = 0;
    }
    return ((forwardValue2060_23_0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4737_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bf326bccd126_invokedynamic2060_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bb66ff5db130_invokedynamic669_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bb66ff5db130_invokedynamic669_89(int a0, long a1) throws E;

private static native int __sourceExactCall_939381d17da898(int p0, long p1);

private static native int __sourceExactCall_3d52f3de4b3981(moom.HF p0);

private static native moom.G4 __sourceExactCall_ae97c77343187e(moom.HQ p0, java.util.List p1, java.util.Random p2, int p3, int p4, int p5, moom.bs p6, int p7);
}
