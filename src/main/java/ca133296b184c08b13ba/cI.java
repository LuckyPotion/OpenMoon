package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class cI extends moom.cu implements net.minecraft.block.IGrowable {

public static final moom.fw<moom.ar> R;

private static final long S;

private static final long[] T;

private static final java.lang.Integer[] V;

private static final java.util.Map W;

protected cI() {
super(moom.fn.l);
    ((moom.cI)(this)).a__Void(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.fA)(((moom.cI)(this)).M)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cI.R)), ((java.lang.Comparable)(moom.ar.DEAD_BUSH))))));
    float local1 = 0x1.99999ap-2f;
    ((moom.cI)(this)).a(((float)((0x1.0p-1f - local1))), ((float)(0x0.0p0f)), ((float)((0x1.0p-1f - local1))), ((float)((0x1.0p-1f + local1))), ((float)(0x1.99999ap-1f)), ((float)((0x1.0p-1f + local1))));
    return;
}


static {
S = ((long)(((moom._a)(moom._c.a(((long)(1433629972190375786L)), ((long)(5306457970724940632L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(258647051790722L)))));
    W = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.cI.S ^ 30711858599862L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill785_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill785_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill785_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill785_14 = new byte[8];
    (__sourceSpill785_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill785_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation785_16 = __sourceSpill785_14;
    ((javax.crypto.Cipher)(__sourceSpill785_11)).init(((int)(__sourceSpill785_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill785_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation785_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Í\033@Ü(;6Ö£\025/Â.L\007"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill785_25 = local6_life21;
        int __sourceSpill785_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill785_25)).substring(((int)(__sourceSpill785_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill785_30 = local8_life19;
        int __sourceSpill785_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill785_33 = new byte[8];
        (__sourceSpill785_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill785_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill785_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill785_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill785_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill785_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill785_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill785_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill785_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill785_34)).doFinal(((byte[])(__sourceSpill785_33)));
        (__sourceSpill785_30)[__sourceSpill785_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    T = ((long[])(local8_life19));
    V = ((java.lang.Integer[])(new java.lang.Integer[2]));
    R = ((moom.fw)(moom.fw.a(((java.lang.String)("type")), ((java.lang.Class)(moom.ar.class)))));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7071_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/cI"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((moom.cI)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cI.R)), ((java.lang.Comparable)(moom.ar.a(((int)(p0))))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((moom.ar)(((moom.ar)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cI.R))))))).a();
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.cI.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x448;
        if (V[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = T[n2];
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
                throw new RuntimeException("moom/cI", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            cI.V[n2] = n4;
        }
        return V[n2];
}


public int d__Int() {
return moom.Eg.a(((double)(0x1.0p-1d)), ((double)(0x1.0p0d)));
}


public int d(net.minecraft.block.state.IBlockState p0) {
net.minecraft.block.state.IBlockState forwardValue3059_17_0;
    int forwardValue3059_33_0;
    net.minecraft.block.state.IBlockState spill3059_0;
    long life2_3;
    int[] life4_5;
    moom.ar life5_25;
    forward_join_33: {
    forward_join_30: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (moom.cI.S ^ 112899930374241L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3059_0 = p0;
    if (!((life4_5 != null))) {
        forwardValue3059_17_0 = spill3059_0;
        break forward_join_17;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill3059_0)).a__ch() != this))) {
        break forward_join_16;
    }
    return super.d(((net.minecraft.block.state.IBlockState)(p0)));
    }
    forwardValue3059_17_0 = p0;
    }
    life5_25 = ((moom.ar)(((net.minecraft.block.state.IBlockState)(forwardValue3059_17_0)).a(((net.minecraft.block.properties.IProperty)(moom.cI.R)))));
    if (!((life5_25 == moom.ar.DEAD_BUSH))) {
        break forward_join_30;
    }
    forwardValue3059_33_0 = __sourceIntrinsic_ba4ebd9c343f_invokedynamic3059_8(6213, (3057434599360603201L ^ life2_3));
    break forward_join_33;
    }
    forwardValue3059_33_0 = moom.Eg.a(((double)(0x1.0p-1d)), ((double)(0x1.0p0d)));
    }
    return forwardValue3059_33_0;
}


public boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1) {
return ((1) != 0);
}


public moom.F a__F() {
return moom.F.XYZ;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.cI.R});
}


public int a(int p0, java.util.Random p1) {
return (1 + ((java.util.Random)(p1)).nextInt(((int)(((p0 * 2) + 1)))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
return (__sourceIntrinsic_booleanComparison((((moom.cI)(this)).b(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).b__DT()))))).a__ch()))))) != 0);
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, boolean p3) {
long local5 = (moom.cI.S ^ 129113098242540L);
    return ((((((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cI.R))) != moom.ar.DEAD_BUSH) ? 1 : 0)) != 0);
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
long local4 = (moom.cI.S ^ 72622263438970L);
    return ((((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_0611ab0e6a18_invokedynamic5995_1(14063, (2859595917955843313L ^ local4))))) == 0) ? net.minecraft.init.Items.N : null);
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
int[] spill1073_0;
    long life4_3;
    int life7_6;
    int[] life6_7;
    lexical_join_23: {
    life4_3 = (moom.cI.S ^ 19092444951996L);
    spill1073_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_6 = 1;
    life6_7 = spill1073_0;
    lexical_cycle_8: while (true) {
    if (!((life7_6 < 3))) {
        break lexical_join_23;
    }
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, life7_6))));
    life7_6 += 1;
    if (!((life6_7 == null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


public int a__Int(net.minecraft.world.World p0, moom.DT p1) {
java.lang.Object local3 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1)));
    return ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(local3)).a__ch())).b(((net.minecraft.block.state.IBlockState)(local3)));
}


public void a(net.minecraft.world.World p0, net.minecraft.entity.player.EntityPlayer p1, moom.DT p2, net.minecraft.block.state.IBlockState p3, net.minecraft.tileentity.TileEntity p4) {
net.minecraft.item.ItemStack forwardValue3058_18_0;
    net.minecraft.entity.player.EntityPlayer forwardValue3058_22_0;
    net.minecraft.item.ItemStack spill3058_0;
    net.minecraft.entity.player.EntityPlayer spill3058_1;
    long life6_3;
    int[] life8_5;
    forward_join_49: {
    forward_join_42: {
    forward_join_22: {
    forward_join_18: {
    life6_3 = (moom.cI.S ^ 73659923444090L);
    life8_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!((!((net.minecraft.world.World)(p0)).G))) {
        break forward_join_42;
    }
    spill3058_0 = ((net.minecraft.entity.player.EntityPlayer)(p1)).c__xW();
    if (!((life8_5 != null))) {
        forwardValue3058_18_0 = spill3058_0;
        break forward_join_18;
    }
    if (!((spill3058_0 != null))) {
        break forward_join_42;
    }
    spill3058_1 = p1;
    if (!((life8_5 != null))) {
        forwardValue3058_22_0 = spill3058_1;
        break forward_join_22;
    }
    forwardValue3058_18_0 = ((net.minecraft.entity.player.EntityPlayer)(spill3058_1)).c__xW();
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue3058_18_0)).a__wQ() == net.minecraft.init.Items.a4))) {
        break forward_join_42;
    }
    forwardValue3058_22_0 = p1;
    }
    ((net.minecraft.entity.player.EntityPlayer)(forwardValue3058_22_0)).a(((moom.BY)((net.minecraft.stats.StatList.ab)[net.minecraft.block.Block.a(((net.minecraft.block.Block)(this)))])));
    moom.cI.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p2)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.H, 1, ((moom.ar)(((moom.ar)(((net.minecraft.block.state.IBlockState)(p3)).a(((net.minecraft.block.properties.IProperty)(moom.cI.R))))))).a()))));
    if (!((life8_5 == null))) {
        break forward_join_49;
    }
    }
    super.a(((net.minecraft.world.World)(p0)), ((net.minecraft.entity.player.EntityPlayer)(p1)), ((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(p3)), ((net.minecraft.tileentity.TileEntity)(p4)));
    }
    return;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2, net.minecraft.block.state.IBlockState p3) {
return ((1) != 0);
}


public void a(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2, net.minecraft.block.state.IBlockState p3) {
moom.cz forwardValue3057_25_0;
    net.minecraft.world.World forwardValue3057_25_1;
    moom.DT forwardValue3057_25_2;
    int[] spill3057_0;
    moom.cz spill3057_1;
    net.minecraft.world.World spill3057_2;
    moom.DT spill3057_3;
    long life5_3;
    net.minecraft.block.BlockDoublePlant$EnumPlantType life8_6;
    int[] life7_7;
    forward_join_28: {
    forward_join_25: {
    forward_join_15: {
    life5_3 = (moom.cI.S ^ 122623452544350L);
    spill3057_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_6 = net.minecraft.block.BlockDoublePlant$EnumPlantType.GRASS;
    life7_7 = spill3057_0;
    if (!((((net.minecraft.block.state.IBlockState)(p3)).a(((net.minecraft.block.properties.IProperty)(moom.cI.R))) == moom.ar.FERN))) {
        break forward_join_15;
    }
    life8_6 = net.minecraft.block.BlockDoublePlant$EnumPlantType.FERN;
    }
    spill3057_1 = net.minecraft.init.Blocks.cj;
    spill3057_2 = p0;
    spill3057_3 = p2;
    if (!((life7_7 != null))) {
        forwardValue3057_25_0 = spill3057_1;
        forwardValue3057_25_1 = spill3057_2;
        forwardValue3057_25_2 = spill3057_3;
        break forward_join_25;
    }
    if (!(((moom.cz)(spill3057_1)).b__Boolean(((net.minecraft.world.World)(spill3057_2)), ((moom.DT)(spill3057_3))))) {
        break forward_join_28;
    }
    forwardValue3057_25_0 = net.minecraft.init.Blocks.cj;
    forwardValue3057_25_1 = p0;
    forwardValue3057_25_2 = p2;
    }
    ((moom.cz)(forwardValue3057_25_0)).a(((net.minecraft.world.World)(forwardValue3057_25_1)), ((moom.DT)(forwardValue3057_25_2)), ((net.minecraft.block.BlockDoublePlant$EnumPlantType)(life8_6)), ((int)(2)));
    }
    return;
}


public int a(net.minecraft.world.IBlockAccess p0, moom.DT p1, int p2) {
return ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.IBlockAccess)(p0)).a__ES(((moom.DT)(p1))))).a__Int(((moom.DT)(p1)));
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7071_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ba4ebd9c343f_invokedynamic3059_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0611ab0e6a18_invokedynamic5995_1(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
