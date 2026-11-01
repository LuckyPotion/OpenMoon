package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class dJ extends moom.dH {

public static final moom.fw<net.minecraft.block.BlockPlanks$EnumType> W;

private static final long Z;

private static final long[] hb;

private static final java.lang.Integer[] ib;

private static final java.util.Map jb;

public dJ() {
super();
    (this).a__Void(((((this.M).a__fE()).a__fE(moom.dJ.W, net.minecraft.block.BlockPlanks$EnumType.OAK)).a__fE(moom.dJ.S, java.lang.Boolean.TRUE)).a__fE(moom.dJ.R, java.lang.Boolean.TRUE));
}


static {
Z = ((long)(((moom._a)(moom._c.a(((long)(5913057311937019811L)), ((long)(7553922267257115168L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(16440656328643L)))));
    jb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.dJ.Z ^ 130591169563745L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill805_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill805_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill805_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill805_14 = new byte[8];
    (__sourceSpill805_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill805_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation805_16 = __sourceSpill805_14;
    ((javax.crypto.Cipher)(__sourceSpill805_11)).init(((int)(__sourceSpill805_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill805_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation805_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "¨\026%¶\037+pË¬\b\022¯\000öp\023w7°3;p"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill805_25 = local6_life21;
        int __sourceSpill805_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill805_25)).substring(((int)(__sourceSpill805_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill805_30 = local8_life19;
        int __sourceSpill805_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill805_33 = new byte[8];
        (__sourceSpill805_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill805_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill805_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill805_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill805_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill805_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill805_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill805_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill805_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill805_34)).doFinal(((byte[])(__sourceSpill805_33)));
        (__sourceSpill805_30)[__sourceSpill805_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    hb = ((long[])(local8_life19));
    ib = ((java.lang.Integer[])(new java.lang.Integer[3]));
    W = ((moom.fw)(moom.fw.a(((java.lang.String)("variant")), ((java.lang.Class)(net.minecraft.block.BlockPlanks$EnumType.class)), ((com.google.common.base.Predicate)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite805_40())))));
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
net.minecraft.block.state.IBlockState forwardValue3247_21_0;
    moom.fv forwardValue3247_21_1;
    int forwardValue3247_21_2;
    net.minecraft.block.state.IBlockState forwardValue3247_22_0;
    moom.fv forwardValue3247_22_1;
    net.minecraft.block.state.IBlockState forwardValue3247_23_0;
    moom.fv forwardValue3247_23_1;
    int forwardValue3247_23_2;
    net.minecraft.block.state.IBlockState forwardValue3247_37_0;
    moom.fv forwardValue3247_37_1;
    int forwardValue3247_37_2;
    net.minecraft.block.state.IBlockState forwardValue3247_38_0;
    moom.fv forwardValue3247_38_1;
    net.minecraft.block.state.IBlockState forwardValue3247_39_0;
    moom.fv forwardValue3247_39_1;
    int forwardValue3247_39_2;
    net.minecraft.block.state.IBlockState spill3247_0;
    moom.fv spill3247_1;
    int spill3247_2;
    net.minecraft.block.state.IBlockState spill3247_3;
    moom.fv spill3247_4;
    int spill3247_5;
    long life2_3;
    int[] life4_5;
    forward_join_39: {
    forward_join_38: {
    forward_join_37: {
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    life2_3 = (moom.dJ.Z ^ 93032594990849L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3247_0 = ((net.minecraft.block.state.IBlockState)(((moom.dJ)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dJ.W)), ((java.lang.Comparable)(((moom.dJ)(this)).a__sourceReturn_71725fcced(((int)(p0))))));
    spill3247_1 = moom.dJ.R;
    spill3247_2 = (p0 & 4);
    if (!((life4_5 != null))) {
        forwardValue3247_21_0 = spill3247_0;
        forwardValue3247_21_1 = spill3247_1;
        forwardValue3247_21_2 = spill3247_2;
        break forward_join_21;
    }
    if (!((spill3247_2 == 0))) {
        forwardValue3247_22_0 = spill3247_0;
        forwardValue3247_22_1 = spill3247_1;
        break forward_join_22;
    }
    forwardValue3247_21_0 = spill3247_0;
    forwardValue3247_21_1 = spill3247_1;
    forwardValue3247_21_2 = 1;
    }
    forwardValue3247_23_0 = forwardValue3247_21_0;
    forwardValue3247_23_1 = forwardValue3247_21_1;
    forwardValue3247_23_2 = forwardValue3247_21_2;
    break forward_join_23;
    }
    forwardValue3247_23_0 = forwardValue3247_22_0;
    forwardValue3247_23_1 = forwardValue3247_22_1;
    forwardValue3247_23_2 = 0;
    }
    spill3247_3 = ((net.minecraft.block.state.IBlockState)(forwardValue3247_23_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue3247_23_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3247_23_2)))))));
    spill3247_4 = moom.dJ.S;
    spill3247_5 = (p0 & __sourceIntrinsic_819466f05fee_invokedynamic3247_10(4980, (6936961862603004365L ^ life2_3)));
    if (!((life4_5 != null))) {
        forwardValue3247_37_0 = spill3247_3;
        forwardValue3247_37_1 = spill3247_4;
        forwardValue3247_37_2 = spill3247_5;
        break forward_join_37;
    }
    if (!((spill3247_5 > 0))) {
        forwardValue3247_38_0 = spill3247_3;
        forwardValue3247_38_1 = spill3247_4;
        break forward_join_38;
    }
    forwardValue3247_37_0 = spill3247_3;
    forwardValue3247_37_1 = spill3247_4;
    forwardValue3247_37_2 = 1;
    }
    forwardValue3247_39_0 = forwardValue3247_37_0;
    forwardValue3247_39_1 = forwardValue3247_37_1;
    forwardValue3247_39_2 = forwardValue3247_37_2;
    break forward_join_39;
    }
    forwardValue3247_39_0 = forwardValue3247_38_0;
    forwardValue3247_39_1 = forwardValue3247_38_1;
    forwardValue3247_39_2 = 0;
    }
    return ((net.minecraft.block.state.IBlockState)(forwardValue3247_39_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue3247_39_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3247_39_2)))))));
}


protected void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, int p3) {
net.minecraft.world.World forwardValue3246_19_0;
    net.minecraft.world.World spill3246_0;
    long life5_3;
    int[] life7_5;
    forward_join_27: {
    forward_join_19: {
    life5_3 = (moom.dJ.Z ^ 117865282408571L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!((((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dJ.W))) == net.minecraft.block.BlockPlanks$EnumType.OAK))) {
        break forward_join_27;
    }
    spill3246_0 = p0;
    if (!((life7_5 != null))) {
        forwardValue3246_19_0 = spill3246_0;
        break forward_join_19;
    }
    if (!((((java.util.Random)(((net.minecraft.world.World)(spill3246_0)).u)).nextInt(((int)(p3))) == 0))) {
        break forward_join_27;
    }
    forwardValue3246_19_0 = p0;
    }
    moom.dJ.a(((net.minecraft.world.World)(forwardValue3246_19_0)), ((moom.DT)(p1)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.e, 1, 0))));
    }
    return;
}


public int b(net.minecraft.block.state.IBlockState p0) {
int forwardValue3245_33_0;
    int forwardValue3245_45_0;
    int[] spill3245_0;
    boolean spill3245_1;
    long life2_3;
    int life5_5;
    int life5_14;
    int[] life4_15;
    forward_join_45: {
    forward_join_44: {
    forward_join_33: {
    forward_join_28: {
    life2_3 = (moom.dJ.Z ^ 96932975254539L);
    life5_5 = 0;
    spill3245_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_14 = (life5_5 | ((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dJ.W))))))).a());
    life4_15 = spill3245_0;
    spill3245_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dJ.R))))))).booleanValue();
    if (!((life4_15 != null))) {
        forwardValue3245_33_0 = ((spill3245_1) ? 1 : 0);
        break forward_join_33;
    }
    if (!((!spill3245_1))) {
        break forward_join_28;
    }
    life5_14 = (life5_14 | 4);
    }
    forwardValue3245_33_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dJ.S))))))).booleanValue()) ? 1 : 0);
    }
    if (!((life4_15 != null))) {
        forwardValue3245_45_0 = forwardValue3245_33_0;
        break forward_join_45;
    }
    if (!((forwardValue3245_33_0 != 0))) {
        break forward_join_44;
    }
    life5_14 = (life5_14 | __sourceIntrinsic_8db5871551d4_invokedynamic3245_16(9243, (5868459657007240617L ^ life2_3)));
    }
    forwardValue3245_45_0 = life5_14;
    }
    return forwardValue3245_45_0;
}


protected int e(net.minecraft.block.state.IBlockState p0) {
long local2 = (moom.dJ.Z ^ 13093796203632L);
    return ((((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dJ.W))) == net.minecraft.block.BlockPlanks$EnumType.JUNGLE) ? __sourceIntrinsic_5ac91b912065_invokedynamic7289_4(2491, (1587746345721817200L ^ local2)) : super.e(((net.minecraft.block.state.IBlockState)(p0))));
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral7290_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/dJ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int c(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dJ.W))))))).a();
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.dJ.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int c(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x2174;
        if (ib[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = hb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])jb.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    jb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/dJ", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            dJ.ib[n2] = n3;
        }
        return ib[n2];
}


public int d(net.minecraft.block.state.IBlockState p0) {
net.minecraft.block.state.IBlockState forwardValue3248_17_0;
    net.minecraft.block.BlockPlanks$EnumType forwardValue3248_30_0;
    net.minecraft.block.BlockPlanks$EnumType forwardValue3248_30_1;
    int forwardValue3248_36_0;
    net.minecraft.block.state.IBlockState spill3248_0;
    net.minecraft.block.BlockPlanks$EnumType spill3248_1;
    net.minecraft.block.BlockPlanks$EnumType spill3248_2;
    long life2_3;
    int[] life4_5;
    net.minecraft.block.BlockPlanks$EnumType life5_25;
    forward_join_36: {
    forward_join_33: {
    forward_join_30: {
    forward_join_28: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (moom.dJ.Z ^ 38863062250625L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3248_0 = p0;
    if (!((life4_5 != null))) {
        forwardValue3248_17_0 = spill3248_0;
        break forward_join_17;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill3248_0)).a__ch() != this))) {
        break forward_join_16;
    }
    return super.d(((net.minecraft.block.state.IBlockState)(p0)));
    }
    forwardValue3248_17_0 = p0;
    }
    life5_25 = ((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.state.IBlockState)(forwardValue3248_17_0)).a(((net.minecraft.block.properties.IProperty)(moom.dJ.W)))));
    spill3248_1 = life5_25;
    spill3248_2 = net.minecraft.block.BlockPlanks$EnumType.SPRUCE;
    if (!((life4_5 != null))) {
        forwardValue3248_30_0 = spill3248_1;
        forwardValue3248_30_1 = spill3248_2;
        break forward_join_30;
    }
    if (!((spill3248_1 == spill3248_2))) {
        break forward_join_28;
    }
    forwardValue3248_36_0 = moom.Ef.a();
    break forward_join_36;
    }
    forwardValue3248_30_0 = life5_25;
    forwardValue3248_30_1 = net.minecraft.block.BlockPlanks$EnumType.BIRCH;
    }
    if (!((forwardValue3248_30_0 == forwardValue3248_30_1))) {
        break forward_join_33;
    }
    forwardValue3248_36_0 = moom.Ef.b();
    break forward_join_36;
    }
    forwardValue3248_36_0 = super.d(((net.minecraft.block.state.IBlockState)(p0)));
    }
    return forwardValue3248_36_0;
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.OAK)).a()))));
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE)).a()))));
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.BIRCH)).a()))));
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.JUNGLE)).a()))));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a(net.minecraft.world.IBlockAccess p0, moom.DT p1, int p2) {
net.minecraft.block.state.IBlockState forwardValue3243_17_0;
    net.minecraft.block.BlockPlanks$EnumType forwardValue3243_30_0;
    net.minecraft.block.BlockPlanks$EnumType forwardValue3243_30_1;
    int[] spill3243_0;
    net.minecraft.block.state.IBlockState spill3243_1;
    net.minecraft.block.BlockPlanks$EnumType spill3243_2;
    net.minecraft.block.BlockPlanks$EnumType spill3243_3;
    long life4_3;
    net.minecraft.block.state.IBlockState life7_8;
    int[] life6_9;
    net.minecraft.block.BlockPlanks$EnumType life8_26;
    forward_join_33: {
    forward_join_30: {
    forward_join_28: {
    forward_join_17: {
    life4_3 = (moom.dJ.Z ^ 30589604469151L);
    spill3243_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_8 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1)));
    life6_9 = spill3243_0;
    spill3243_1 = life7_8;
    if (!((life6_9 != null))) {
        forwardValue3243_17_0 = spill3243_1;
        break forward_join_17;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill3243_1)).a__ch() == this))) {
        break forward_join_33;
    }
    forwardValue3243_17_0 = life7_8;
    }
    life8_26 = ((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.state.IBlockState)(forwardValue3243_17_0)).a(((net.minecraft.block.properties.IProperty)(moom.dJ.W)))));
    spill3243_2 = life8_26;
    spill3243_3 = net.minecraft.block.BlockPlanks$EnumType.SPRUCE;
    if (!((life6_9 != null))) {
        forwardValue3243_30_0 = spill3243_2;
        forwardValue3243_30_1 = spill3243_3;
        break forward_join_30;
    }
    if (!((spill3243_2 == spill3243_3))) {
        break forward_join_28;
    }
    return moom.Ef.a();
    }
    forwardValue3243_30_0 = life8_26;
    forwardValue3243_30_1 = net.minecraft.block.BlockPlanks$EnumType.BIRCH;
    }
    if (!((forwardValue3243_30_0 == forwardValue3243_30_1))) {
        break forward_join_33;
    }
    return moom.Ef.b();
    }
    return super.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)), ((int)(p2)));
}


public net.minecraft.block.BlockPlanks$EnumType a__sourceReturn_71725fcced(int p0) {
return net.minecraft.block.BlockPlanks$EnumType.a(((int)(((p0 & 3) % 4))));
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.dJ.W, moom.dJ.S, moom.dJ.R});
}


public void a(net.minecraft.world.World p0, net.minecraft.entity.player.EntityPlayer p1, moom.DT p2, net.minecraft.block.state.IBlockState p3, net.minecraft.tileentity.TileEntity p4) {
net.minecraft.item.ItemStack forwardValue3244_18_0;
    net.minecraft.entity.player.EntityPlayer forwardValue3244_22_0;
    net.minecraft.item.ItemStack spill3244_0;
    net.minecraft.entity.player.EntityPlayer spill3244_1;
    long life6_3;
    int[] life8_5;
    forward_join_50: {
    forward_join_43: {
    forward_join_22: {
    forward_join_18: {
    life6_3 = (moom.dJ.Z ^ 7732462208410L);
    life8_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!((!((net.minecraft.world.World)(p0)).G))) {
        break forward_join_43;
    }
    spill3244_0 = ((net.minecraft.entity.player.EntityPlayer)(p1)).c__xW();
    if (!((life8_5 != null))) {
        forwardValue3244_18_0 = spill3244_0;
        break forward_join_18;
    }
    if (!((spill3244_0 != null))) {
        break forward_join_43;
    }
    spill3244_1 = p1;
    if (!((life8_5 != null))) {
        forwardValue3244_22_0 = spill3244_1;
        break forward_join_22;
    }
    forwardValue3244_18_0 = ((net.minecraft.entity.player.EntityPlayer)(spill3244_1)).c__xW();
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue3244_18_0)).a__wQ() == net.minecraft.init.Items.a4))) {
        break forward_join_43;
    }
    forwardValue3244_22_0 = p1;
    }
    ((net.minecraft.entity.player.EntityPlayer)(forwardValue3244_22_0)).a(((moom.BY)((net.minecraft.stats.StatList.ab)[net.minecraft.block.Block.a(((net.minecraft.block.Block)(this)))])));
    moom.dJ.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p2)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.item.Item.a(((net.minecraft.block.Block)(this))), 1, ((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.state.IBlockState)(p3)).a(((net.minecraft.block.properties.IProperty)(moom.dJ.W))))))).a()))));
    if (!((life8_5 == null))) {
        break forward_join_50;
    }
    }
    super.a(((net.minecraft.world.World)(p0)), ((net.minecraft.entity.player.EntityPlayer)(p1)), ((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(p3)), ((net.minecraft.tileentity.TileEntity)(p4)));
    }
    return;
}


protected net.minecraft.item.ItemStack a__xW(net.minecraft.block.state.IBlockState p0) {
return new net.minecraft.item.ItemStack(net.minecraft.item.Item.a(((net.minecraft.block.Block)(this))), 1, ((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dJ.W))))))).a());
}


private static boolean lambda$static$0(net.minecraft.block.BlockPlanks$EnumType p0) {
int forwardValue3249_13_0;
    int forwardValue3249_15_0;
    int spill3249_0;
    long life1_3;
    int[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (moom.dJ.Z ^ 64086050558653L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3249_0 = ((net.minecraft.block.BlockPlanks$EnumType)(p0)).a();
    if (!((life3_5 != null))) {
        forwardValue3249_13_0 = spill3249_0;
        break forward_join_13;
    }
    if (!((spill3249_0 < 4))) {
        break forward_join_14;
    }
    forwardValue3249_13_0 = 1;
    }
    forwardValue3249_15_0 = forwardValue3249_13_0;
    break forward_join_15;
    }
    forwardValue3249_15_0 = 0;
    }
    return ((forwardValue3249_15_0) != 0);
}


private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_eb8803ad1f63_originalDynamicSite805_40() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_invokedynamic3247_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8db5871551d4_invokedynamic3245_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac91b912065_invokedynamic7289_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral7290_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
