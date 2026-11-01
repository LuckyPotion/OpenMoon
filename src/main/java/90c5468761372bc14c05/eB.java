package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class eB extends moom.eA {

private static final java.util.Map<net.minecraft.world.World, java.util.List<moom.e_>> R;

private final boolean S;

private static final long T;

private static final long[] V;

private static final java.lang.Integer[] W;

private static final java.util.Map X;

private static final long Y;

protected eB(boolean p0) {
super();
    this.S = p0;
    (this).a(true);
    (this).a((net.minecraft.creativetab.CreativeTabs)null);
}


static {
T = ((long)(__sourceExactCall_93409fc8361486(((moom._a)(__sourceExactCall_41bab94bc4b1bd(((long)(-5174438740938355708L)), ((long)(4165283133242887721L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))), ((long)(198935999949734L)))));
    X = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (moom.eB.T ^ 132856855254028L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill823_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill823_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill823_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill823_14 = new byte[8];
    (__sourceSpill823_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill823_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation823_16 = __sourceSpill823_14;
    ((javax.crypto.Cipher)(__sourceSpill823_11)).init(((int)(__sourceSpill823_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill823_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation823_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local13_life19 = new long[3];
    int local10_life20 = 0;
    java.lang.String local11_life21;
    int local12_life23 = ((java.lang.String)((local11_life21 = "SuÌ\031\026´9.j÷ï¢¿AVO£\006I"))).length();
    int local9_life24 = 0;
    do {
        java.lang.String __sourceSpill823_25 = local11_life21;
        int __sourceSpill823_26 = local9_life24;
        local9_life24 += 8;
        byte[] local14_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill823_25)).substring(((int)(__sourceSpill823_26)), ((int)(local9_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill823_30 = local13_life19;
        int __sourceSpill823_31 = local10_life20;
        local10_life20 += 1;
        long local15_life32 = (((((((((((long) (local14_life29)[0]) & 255L) << 56) | ((((long) (local14_life29)[1]) & 255L) << 48)) | ((((long) (local14_life29)[2]) & 255L) << 40)) | ((((long) (local14_life29)[3]) & 255L) << 32)) | ((((long) (local14_life29)[4]) & 255L) << 24)) | ((((long) (local14_life29)[5]) & 255L) << 16)) | ((((long) (local14_life29)[6]) & 255L) << 8)) | (((long) (local14_life29)[7]) & 255L));
        byte[] __sourceSpill823_33 = new byte[8];
        (__sourceSpill823_33)[0] = ((byte) ((int) (local15_life32 >>> 56)));
        (__sourceSpill823_33)[1] = ((byte) ((int) (local15_life32 >>> 48)));
        (__sourceSpill823_33)[2] = ((byte) ((int) (local15_life32 >>> 40)));
        (__sourceSpill823_33)[3] = ((byte) ((int) (local15_life32 >>> 32)));
        (__sourceSpill823_33)[4] = ((byte) ((int) (local15_life32 >>> 24)));
        (__sourceSpill823_33)[5] = ((byte) ((int) (local15_life32 >>> 16)));
        (__sourceSpill823_33)[6] = ((byte) ((int) (local15_life32 >>> 8)));
        (__sourceSpill823_33)[7] = ((byte) ((int) local15_life32));
        javax.crypto.Cipher __sourceSpill823_34 = local7_life9;
        byte[] local17_life36 = ((javax.crypto.Cipher)(__sourceSpill823_34)).doFinal(((byte[])(__sourceSpill823_33)));
        (__sourceSpill823_30)[__sourceSpill823_31] = (((((((((((long) (local17_life36)[0]) & 255L) << 56) | ((((long) (local17_life36)[1]) & 255L) << 48)) | ((((long) (local17_life36)[2]) & 255L) << 40)) | ((((long) (local17_life36)[3]) & 255L) << 32)) | ((((long) (local17_life36)[4]) & 255L) << 24)) | ((((long) (local17_life36)[5]) & 255L) << 16)) | ((((long) (local17_life36)[6]) & 255L) << 8)) | (((long) (local17_life36)[7]) & 255L));
    } while ((!(local9_life24 >= local12_life23)));
    V = ((long[])(local13_life19));
    W = ((java.lang.Integer[])(new java.lang.Integer[3]));
    javax.crypto.Cipher local0_life40;
    javax.crypto.Cipher __sourceSpill823_42 = (local0_life40 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill823_43 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill823_44 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill823_45 = new byte[8];
    (__sourceSpill823_45)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life46 = 1;
    while ((local1_life46 < 8)) {
        (__sourceSpill823_45)[local1_life46] = ((byte) ((int) ((local5_life7 << (local1_life46 * 8)) >>> 56)));
        local1_life46 += 1;
    }
    byte[] __sourcePreallocation823_47 = __sourceSpill823_45;
    ((javax.crypto.Cipher)(__sourceSpill823_42)).init(((int)(__sourceSpill823_43)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill823_44)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation823_47)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life50 = -2970440651778161799L;
    byte[] __sourceSpill823_51 = new byte[8];
    (__sourceSpill823_51)[0] = ((byte) ((int) (local2_life50 >>> 56)));
    (__sourceSpill823_51)[1] = ((byte) ((int) (local2_life50 >>> 48)));
    (__sourceSpill823_51)[2] = ((byte) ((int) (local2_life50 >>> 40)));
    (__sourceSpill823_51)[3] = ((byte) ((int) (local2_life50 >>> 32)));
    (__sourceSpill823_51)[4] = ((byte) ((int) (local2_life50 >>> 24)));
    (__sourceSpill823_51)[5] = ((byte) ((int) (local2_life50 >>> 16)));
    (__sourceSpill823_51)[6] = ((byte) ((int) (local2_life50 >>> 8)));
    (__sourceSpill823_51)[7] = ((byte) ((int) local2_life50));
    javax.crypto.Cipher __sourceSpill823_52 = local0_life40;
    byte[] local4_life54 = ((javax.crypto.Cipher)(__sourceSpill823_52)).doFinal(((byte[])(__sourceSpill823_51)));
    Y = ((long)((((((((((((long) (local4_life54)[0]) & 255L) << 56) | ((((long) (local4_life54)[1]) & 255L) << 48)) | ((((long) (local4_life54)[2]) & 255L) << 40)) | ((((long) (local4_life54)[3]) & 255L) << 32)) | ((((long) (local4_life54)[4]) & 255L) << 24)) | ((((long) (local4_life54)[5]) & 255L) << 16)) | ((((long) (local4_life54)[6]) & 255L) << 8)) | (((long) (local4_life54)[7]) & 255L))));
    R = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
}


public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
int lexicalValue1137_47_0;
    int lexicalValue1137_72_0;
    int lexicalValue1137_109_0;
    int lexicalValue1137_177_0;
    int lexicalValue1137_185_0;
    int lexicalValue1137_200_0;
    int[] spill1137_0;
    boolean spill1137_1;
    int spill1137_2;
    int spill1137_3;
    long life5_3;
    int life8_9;
    java.util.List life9_15;
    int[] life7_16;
    int life10_142;
    double life11_156;
    double life13_167;
    double life15_178;
    lexical_join_201: {
    lexical_join_200: {
    lexical_join_185: {
    lexical_join_177: {
    lexical_join_176: {
    lexical_join_174: {
    lexical_join_162: {
    lexical_join_109: {
    lexical_join_72: {
    lexical_join_47: {
    lexical_join_45: {
    life5_3 = (moom.eB.T ^ 9468056168162L);
    life8_9 = ((((moom.eB)(this)).c__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)))) ? 1 : 0);
    spill1137_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life9_15 = ((java.util.List)(((java.util.Map)(moom.eB.R)).get(((java.lang.Object)(p0)))));
    life7_16 = spill1137_0;
    lexical_cycle_17: while (true) {
    if (!((life9_15 != null))) {
        break lexical_join_45;
    }
    spill1137_1 = ((java.util.List)(life9_15)).isEmpty();
    if (!((life7_16 != null))) {
        lexicalValue1137_47_0 = ((spill1137_1) ? 1 : 0);
        break lexical_join_47;
    }
    if (!((life7_16 != null))) {
        lexicalValue1137_47_0 = ((spill1137_1) ? 1 : 0);
        break lexical_join_47;
    }
    if (!((!spill1137_1))) {
        break lexical_join_45;
    }
    spill1137_2 = recovery.source.CarrierOps.lcmp(((long)((((net.minecraft.world.World)(p0)).b__Long() - ((moom.e_)(((moom.e_)(((java.util.List)(life9_15)).get(((int)(0))))))).b))), ((long)(moom.eB.Y)));
    if (!((life7_16 != null))) {
        lexicalValue1137_47_0 = spill1137_2;
        break lexical_join_47;
    }
    if (!((spill1137_2 > 0))) {
        break lexical_join_45;
    }
    ((java.util.List)(life9_15)).remove(((int)(0)));
    if (!((life7_16 == null))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    lexicalValue1137_47_0 = ((this.S) ? 1 : 0);
    }
    if (!((life7_16 != null))) {
        lexicalValue1137_177_0 = lexicalValue1137_47_0;
        break lexical_join_177;
    }
    if (!((lexicalValue1137_47_0 != 0))) {
        break lexical_join_176;
    }
    spill1137_3 = life8_9;
    if (!((life7_16 != null))) {
        lexicalValue1137_72_0 = spill1137_3;
        break lexical_join_72;
    }
    if (!((spill1137_3 != 0))) {
        break lexical_join_201;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aE)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.eB.Q)), ((java.lang.Comparable)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.eB.Q)))))))))), ((int)(3)));
    lexicalValue1137_72_0 = ((((moom.eB)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((boolean)(true)))) ? 1 : 0);
    }
    if (!((life7_16 != null))) {
        lexicalValue1137_109_0 = lexicalValue1137_72_0;
        break lexical_join_109;
    }
    if (!((lexicalValue1137_72_0 != 0))) {
        break lexical_join_201;
    }
    ((net.minecraft.world.World)(p0)).a(((double)(((double) (((float) ((moom.DT)(p1)).a()) + 0x1.0p-1f)))), ((double)(((double) (((float) ((moom.DT)(p1)).b()) + 0x1.0p-1f)))), ((double)(((double) (((float) ((moom.DT)(p1)).c()) + 0x1.0p-1f)))), ((java.lang.String)("random.fizz")), ((float)(0x1.0p-1f)), ((float)((0x1.4cccccp1f + ((((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextFloat() - ((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextFloat()) * 0x1.99999ap-1f)))));
    lexicalValue1137_109_0 = 0;
    }
    life10_142 = lexicalValue1137_109_0;
    lexical_cycle_110: while (true) {
    if (!((life10_142 < 5))) {
        break lexical_join_162;
    }
    life11_156 = ((((double) ((moom.DT)(p1)).a()) + (((java.util.Random)(p3)).nextDouble() * 0x1.3333333333333p-1d)) + 0x1.999999999999ap-3d);
    life13_167 = ((((double) ((moom.DT)(p1)).b()) + (((java.util.Random)(p3)).nextDouble() * 0x1.3333333333333p-1d)) + 0x1.999999999999ap-3d);
    life15_178 = ((((double) ((moom.DT)(p1)).c()) + (((java.util.Random)(p3)).nextDouble() * 0x1.3333333333333p-1d)) + 0x1.999999999999ap-3d);
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SMOKE_NORMAL)), ((double)(life11_156)), ((double)(life13_167)), ((double)(life15_178)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    life10_142 += 1;
    if (!((life7_16 != null))) {
        break lexical_join_174;
    }
    if (!((life7_16 == null))) { continue lexical_cycle_110; }
    break lexical_cycle_110;
    }
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))).a__ch())), ((int)(__sourceIntrinsic_b4b54c999db9_invokedynamic1137_47(13262, (692830471130515049L ^ life5_3)))));
    }
    if (!((life7_16 == null))) {
        break lexical_join_201;
    }
    }
    lexicalValue1137_177_0 = life8_9;
    }
    if (!((life7_16 != null))) {
        lexicalValue1137_185_0 = lexicalValue1137_177_0;
        break lexical_join_185;
    }
    if (!((lexicalValue1137_177_0 == 0))) {
        break lexical_join_201;
    }
    lexicalValue1137_185_0 = ((((moom.eB)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((boolean)(false)))) ? 1 : 0);
    }
    if (!((life7_16 != null))) {
        lexicalValue1137_200_0 = lexicalValue1137_185_0;
        break lexical_join_200;
    }
    if (!((lexicalValue1137_185_0 == 0))) {
        break lexical_join_201;
    }
    lexicalValue1137_200_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aF)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.eB.Q)), ((java.lang.Comparable)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.eB.Q)))))))))), ((int)(3)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1137_200_0);
    }
    return;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7459_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/eB"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x3CBC;
        if (W[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = V[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])X.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    X.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/eB", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            eB.W[n2] = n3;
        }
        return W[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_4e69a0c0845be4(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public int b(net.minecraft.world.IBlockAccess p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.bs p3) {
long local5 = (moom.eB.T ^ 110029452521560L);
    return ((p3 == moom.bs.DOWN) ? ((moom.eB)(this)).a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.bs)(p3))) : 0);
}


public void b__Void(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
long life4_3;
    int[] life6_5;
    moom.bs[] life7_10;
    int life8_13;
    int life9_15;
    moom.bs life10_22;
    lexical_join_32: {
    life4_3 = (moom.eB.T ^ 5007979460899L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!(this.S)) {
        break lexical_join_32;
    }
    life7_10 = moom.bs.values();
    life8_13 = (life7_10).length;
    life9_15 = 0;
    lexical_cycle_16: while (true) {
    if (!((life9_15 < life8_13))) {
        break lexical_join_32;
    }
    life10_22 = (life7_10)[life9_15];
    ((net.minecraft.world.World)(p0)).b(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(life10_22))))), ((net.minecraft.block.Block)(this)));
    life9_15 += 1;
    if (!((life6_5 == null))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    return;
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
long life4_3;
    int[] life6_5;
    moom.bs[] life7_10;
    int life8_13;
    int life9_15;
    moom.bs life10_22;
    lexical_join_32: {
    life4_3 = (moom.eB.T ^ 106204727210113L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!(this.S)) {
        break lexical_join_32;
    }
    life7_10 = moom.bs.values();
    life8_13 = (life7_10).length;
    life9_15 = 0;
    lexical_cycle_16: while (true) {
    if (!((life9_15 < life8_13))) {
        break lexical_join_32;
    }
    life10_22 = (life7_10)[life9_15];
    ((net.minecraft.world.World)(p0)).b(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(life10_22))))), ((net.minecraft.block.Block)(this)));
    life9_15 += 1;
    if (!((life6_5 == null))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    return;
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
int forwardValue3397_13_0;
    moom.bs forwardValue3397_63_0;
    boolean spill3397_0;
    moom.bs spill3397_1;
    long life5_3;
    int[] life7_5;
    double life8_29;
    double life10_42;
    double life12_55;
    moom.bs life14_60;
    moom.bs life15_75;
    double life16_77;
    forward_join_97: {
    forward_join_86: {
    forward_join_63: {
    forward_join_13: {
    life5_3 = (moom.eB.T ^ 72534892220546L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3397_0 = this.S;
    if (!((life7_5 != null))) {
        forwardValue3397_13_0 = ((spill3397_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!(spill3397_0)) {
        break forward_join_97;
    }
    forwardValue3397_13_0 = ((moom.DT)(p1)).a();
    }
    life8_29 = ((((double) forwardValue3397_13_0) + 0x1.0p-1d) + ((((java.util.Random)(p3)).nextDouble() - 0x1.0p-1d) * 0x1.999999999999ap-3d));
    life10_42 = ((((double) ((moom.DT)(p1)).b()) + 0x1.6666666666666p-1d) + ((((java.util.Random)(p3)).nextDouble() - 0x1.0p-1d) * 0x1.999999999999ap-3d));
    life12_55 = ((((double) ((moom.DT)(p1)).c()) + 0x1.0p-1d) + ((((java.util.Random)(p3)).nextDouble() - 0x1.0p-1d) * 0x1.999999999999ap-3d));
    life14_60 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.eB.Q)))));
    spill3397_1 = life14_60;
    if (!((life7_5 != null))) {
        forwardValue3397_63_0 = spill3397_1;
        break forward_join_63;
    }
    if (!(((net.minecraft.util.EnumFacing$Axis)(((moom.bs)(spill3397_1)).a__bt())).b__Boolean())) {
        break forward_join_86;
    }
    forwardValue3397_63_0 = ((moom.bs)(life14_60)).a__bs();
    }
    life15_75 = forwardValue3397_63_0;
    life16_77 = 0x1.147ae147ae148p-2d;
    life8_29 = (life8_29 + (0x1.147ae147ae148p-2d * ((double) ((moom.bs)(life15_75)).c())));
    life10_42 = (life10_42 + 0x1.c28f5c28f5c29p-3d);
    life12_55 = (life12_55 + (0x1.147ae147ae148p-2d * ((double) ((moom.bs)(life15_75)).e())));
    }
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.REDSTONE)), ((double)(life8_29)), ((double)(life10_42)), ((double)(life12_55)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    }
    return;
}


private boolean c__Boolean(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
java.lang.Object local4 = ((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.eB.Q))))))).a__bs();
    return (__sourceIntrinsic_booleanComparison((((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(local4))))), ((moom.bs)(local4))))) != 0);
}


public boolean l() {
return ((1) != 0);
}


public boolean a__Boolean(net.minecraft.block.Block p0) {
net.minecraft.block.Block forwardValue3393_13_0;
    net.minecraft.block.Block forwardValue3393_13_1;
    int forwardValue3393_17_0;
    net.minecraft.block.Block spill3393_0;
    net.minecraft.block.Block spill3393_1;
    long life2_3;
    int[] life4_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (moom.eB.T ^ 259805241340L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3393_0 = p0;
    spill3393_1 = net.minecraft.init.Blocks.aE;
    if (!((life4_5 != null))) {
        forwardValue3393_13_0 = spill3393_0;
        forwardValue3393_13_1 = spill3393_1;
        break forward_join_13;
    }
    if (!((spill3393_0 != spill3393_1))) {
        break forward_join_14;
    }
    forwardValue3393_13_0 = p0;
    forwardValue3393_13_1 = net.minecraft.init.Blocks.aF;
    }
    if (!((forwardValue3393_13_0 == forwardValue3393_13_1))) {
        break forward_join_16;
    }
    }
    forwardValue3393_17_0 = 1;
    break forward_join_17;
    }
    forwardValue3393_17_0 = 0;
    }
    return ((forwardValue3393_17_0) != 0);
}


private boolean a(net.minecraft.world.World p0, moom.DT p1, boolean p2) {
java.util.Map lexicalValue1136_19_0;
    net.minecraft.world.World lexicalValue1136_19_1;
    int lexicalValue1136_36_0;
    int lexicalValue1136_58_0;
    int lexicalValue1136_67_0;
    int lexicalValue1136_71_0;
    java.util.Map spill1136_0;
    net.minecraft.world.World spill1136_1;
    boolean spill1136_2;
    boolean spill1136_3;
    long life4_3;
    int[] life6_5;
    java.util.List life7_27;
    int life8_48;
    java.util.Iterator life9_51;
    moom.e_ life10_58;
    lexical_join_71: {
    lexical_join_70: {
    lexical_join_36: {
    lexical_join_35: {
    lexical_join_19: {
    lexical_join_17: {
    life4_3 = (moom.eB.T ^ 73738268513162L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill1136_0 = moom.eB.R;
    spill1136_1 = p0;
    if (!((life6_5 != null))) {
        lexicalValue1136_19_0 = spill1136_0;
        lexicalValue1136_19_1 = spill1136_1;
        break lexical_join_19;
    }
    if (!((!((java.util.Map)(spill1136_0)).containsKey(((java.lang.Object)(spill1136_1)))))) {
        break lexical_join_17;
    }
    ((java.util.Map)(moom.eB.R)).put(((java.lang.Object)(p0)), ((java.lang.Object)(com.google.common.collect.Lists.newArrayList())));
    }
    lexicalValue1136_19_0 = moom.eB.R;
    lexicalValue1136_19_1 = p0;
    }
    life7_27 = ((java.util.List)(((java.util.Map)(lexicalValue1136_19_0)).get(((java.lang.Object)(lexicalValue1136_19_1)))));
    spill1136_2 = p2;
    if (!((life6_5 != null))) {
        lexicalValue1136_36_0 = ((spill1136_2) ? 1 : 0);
        break lexical_join_36;
    }
    if (!(spill1136_2)) {
        break lexical_join_35;
    }
    ((java.util.List)(life7_27)).add(((java.lang.Object)(new moom.e_(p1, ((net.minecraft.world.World)(p0)).b__Long()))));
    }
    lexicalValue1136_36_0 = 0;
    }
    life8_48 = lexicalValue1136_36_0;
    life9_51 = ((java.util.List)(life7_27)).iterator();
    lexical_cycle_40: while (true) {
    lexical_join_68: {
    lexical_join_67: {
    lexical_join_58: {
    if (!(((java.util.Iterator)(life9_51)).hasNext())) {
        break lexical_join_70;
    }
    life10_58 = ((moom.e_)(((java.util.Iterator)(life9_51)).next()));
    spill1136_3 = ((moom.DT)(((moom.e_)(life10_58)).a)).equals(((java.lang.Object)(p1)));
    if (!((life6_5 != null))) {
        lexicalValue1136_71_0 = ((spill1136_3) ? 1 : 0);
        break lexical_join_71;
    }
    if (!((life6_5 != null))) {
        lexicalValue1136_58_0 = ((spill1136_3) ? 1 : 0);
        break lexical_join_58;
    }
    if (!(spill1136_3)) {
        break lexical_join_68;
    }
    life8_48 += 1;
    lexicalValue1136_58_0 = life8_48;
    }
    if (!((life6_5 != null))) {
        lexicalValue1136_67_0 = lexicalValue1136_58_0;
        break lexical_join_67;
    }
    if (!((lexicalValue1136_58_0 >= __sourceIntrinsic_d081fdc4782f_invokedynamic1136_21(5943, (1134918384865531898L ^ life4_3))))) {
        break lexical_join_68;
    }
    lexicalValue1136_67_0 = 1;
    }
    return ((lexicalValue1136_67_0) != 0);
    }
    if (!((life6_5 == null))) { continue lexical_cycle_40; }
    break lexical_cycle_40;
    }
    }
    lexicalValue1136_71_0 = 0;
    }
    return ((lexicalValue1136_71_0) != 0);
}


public int a(net.minecraft.world.World p0) {
return 2;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
int forwardValue3391_16_0;
    boolean spill3391_0;
    long life5_3;
    int[] life7_5;
    forward_join_29: {
    forward_join_16: {
    life5_3 = (moom.eB.T ^ 32883561273955L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3391_0 = ((moom.eB)(this)).a__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    if (!((life7_5 != null))) {
        forwardValue3391_16_0 = ((spill3391_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!((!spill3391_0))) {
        break forward_join_29;
    }
    forwardValue3391_16_0 = ((this.S) ? 1 : 0);
    }
    if (!((forwardValue3391_16_0 == ((((moom.eB)(this)).c__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)))) ? 1 : 0)))) {
        break forward_join_29;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)), ((int)(((moom.eB)(this)).a(((net.minecraft.world.World)(p0))))));
    }
    return;
}


public int a(net.minecraft.world.IBlockAccess p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.bs p3) {
int forwardValue3390_19_0;
    long life5_3;
    forward_join_19: {
    forward_join_18: {
    life5_3 = (moom.eB.T ^ 124735415241837L);
    if (!(this.S)) {
        break forward_join_18;
    }
    if (!((((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.eB.Q))) != p3))) {
        break forward_join_18;
    }
    forwardValue3390_19_0 = __sourceIntrinsic_0beb55581d70_invokedynamic3390_4(14034, (2658735250302609915L ^ life5_3));
    break forward_join_19;
    }
    forwardValue3390_19_0 = 0;
    }
    return forwardValue3390_19_0;
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return __sourceExactCall_42e37b9acc15b0(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aF)));
}


public net.minecraft.item.Item a__wQ(net.minecraft.world.World p0, moom.DT p1) {
return __sourceExactCall_42e37b9acc15b0(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aF)));
}


private static native <E extends Throwable> int __sourceIntrinsic_0beb55581d70_invokedynamic3390_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d081fdc4782f_invokedynamic1136_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7459_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic1137_47(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native int __sourceExactCall_4e69a0c0845be4(int p0, long p1);
private static native net.minecraft.item.Item __sourceExactCall_42e37b9acc15b0(net.minecraft.block.Block p0);

private static native long __sourceExactCall_93409fc8361486(moom._a p0, long p1);
private static native moom._a __sourceExactCall_41bab94bc4b1bd(long p0, long p1, java.lang.Object p2);
}
