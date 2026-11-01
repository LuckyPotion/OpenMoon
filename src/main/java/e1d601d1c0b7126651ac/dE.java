package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class dE extends net.minecraft.block.Block {

public static final moom.fw<net.minecraft.block.BlockHugeMushroom$EnumType> Q;

private final net.minecraft.block.Block R;

private static final long S;

private static final long[] T;

private static final java.lang.Integer[] U;

private static final java.util.Map V;

public dE(moom.fn p0, moom.fm p1, net.minecraft.block.Block p2) {
super(p0, p1);
    (this).a__Void(((this.M).a__fE()).a__fE(moom.dE.Q, net.minecraft.block.BlockHugeMushroom$EnumType.ALL_OUTSIDE));
    this.R = p2;
}


static {
S = ((long)(((moom._a)(moom._c.a(((long)(-4550701771089904810L)), ((long)(8051157303236446009L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(228807734738558L)))));
    V = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.dE.S ^ 138849518297804L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill803_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill803_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill803_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill803_14 = new byte[8];
    (__sourceSpill803_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill803_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation803_16 = __sourceSpill803_14;
    ((javax.crypto.Cipher)(__sourceSpill803_11)).init(((int)(__sourceSpill803_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill803_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation803_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "º¼Ö <\026tåÕÈÞ@"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill803_25 = local6_life21;
        int __sourceSpill803_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill803_25)).substring(((int)(__sourceSpill803_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill803_30 = local8_life19;
        int __sourceSpill803_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill803_33 = new byte[8];
        (__sourceSpill803_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill803_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill803_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill803_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill803_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill803_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill803_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill803_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill803_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill803_34)).doFinal(((byte[])(__sourceSpill803_33)));
        (__sourceSpill803_30)[__sourceSpill803_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    T = ((long[])(local8_life19));
    U = ((java.lang.Integer[])(new java.lang.Integer[2]));
    Q = ((moom.fw)(moom.fw.a(((java.lang.String)("variant")), ((java.lang.Class)(net.minecraft.block.BlockHugeMushroom$EnumType.class)))));
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((moom.dE)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dE.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockHugeMushroom$EnumType.a(((int)(p0))))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.block.BlockHugeMushroom$EnumType)(((net.minecraft.block.BlockHugeMushroom$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dE.Q))))))).a();
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x5F46;
        if (U[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = T[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])V.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    V.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/dE", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            dE.U[n2] = n3;
        }
        return U[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.dE.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7264_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/dE"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return net.minecraft.item.Item.a(((net.minecraft.block.Block)(this.R)));
}


public moom.fm a__fm(net.minecraft.block.state.IBlockState p0) {
long local2 = (moom.dE.S ^ 62634503199613L);
    switch ((moom.eW.a)[((net.minecraft.block.BlockHugeMushroom$EnumType)(((net.minecraft.block.BlockHugeMushroom$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dE.Q))))))).ordinal()]) {
case 1:
{
        return moom.fm.e;
    }
case 2:
case 3:
{
        return moom.fm.d;
    }
default:
{
        return super.a__fm(((net.minecraft.block.state.IBlockState)(p0)));
    }
}
}


public int a(java.util.Random p0) {
long local2 = (moom.dE.S ^ 14585537471271L);
    return java.lang.Math.max(((int)(0)), ((int)((((java.util.Random)(p0)).nextInt(((int)(__sourceIntrinsic_41d82141e1ef_originalDynamicSite1408_1(6016, (8099377313808741717L ^ local2))))) - __sourceIntrinsic_41d82141e1ef_originalDynamicSite1408_3(30791, (2416033163594177171L ^ local2))))));
}


public net.minecraft.item.Item a__wQ(net.minecraft.world.World p0, moom.DT p1) {
return net.minecraft.item.Item.a(((net.minecraft.block.Block)(this.R)));
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.dE.Q});
}


public net.minecraft.block.state.IBlockState a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, float p3, float p4, float p5, int p6, net.minecraft.entity.EntityLivingBase p7) {
return ((moom.dE)(this)).a__fE();
}


private static native <E extends Throwable> int __sourceIntrinsic_41d82141e1ef_originalDynamicSite1408_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_41d82141e1ef_originalDynamicSite1408_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7264_0() throws E;
}
