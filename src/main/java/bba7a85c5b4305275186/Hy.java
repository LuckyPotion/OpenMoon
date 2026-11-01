package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Hy extends moom.Hs {

private static final long p;

private static final long[] q;

private static final java.lang.Integer[] r;

private static final java.util.Map t;

public Hy() {
super();
}


public Hy(moom.bs p0, moom.Il p1) {
super(1, p0, p1, 1, 1, 1);
}


static {
p = ((long)(((moom._a)(moom._c.a(((long)(-7682159948861466018L)), ((long)(-4795835003799972284L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(254532824670948L)))));
    t = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Hy.p ^ 73138129319645L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill851_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill851_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill851_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill851_14 = new byte[8];
    (__sourceSpill851_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill851_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation851_16 = __sourceSpill851_14;
    ((javax.crypto.Cipher)(__sourceSpill851_11)).init(((int)(__sourceSpill851_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill851_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation851_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\004\030²^ëã \024­¬À"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill851_25 = local6_life21;
        int __sourceSpill851_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill851_25)).substring(((int)(__sourceSpill851_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill851_30 = local8_life19;
        int __sourceSpill851_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill851_33 = new byte[8];
        (__sourceSpill851_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill851_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill851_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill851_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill851_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill851_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill851_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill851_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill851_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill851_34)).doFinal(((byte[])(__sourceSpill851_33)));
        (__sourceSpill851_30)[__sourceSpill851_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "¼\002½\021£\003J\031ú\003KwgÂ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill851_38 = local6_life21;
        int __sourceSpill851_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill851_38)).substring(((int)(__sourceSpill851_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill851_43 = local8_life19;
        int __sourceSpill851_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill851_46 = new byte[8];
        (__sourceSpill851_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill851_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill851_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill851_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill851_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill851_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill851_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill851_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill851_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill851_47)).doFinal(((byte[])(__sourceSpill851_46)));
        (__sourceSpill851_43)[__sourceSpill851_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    q = ((long[])(local8_life19));
    r = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x1A4F;
        if (r[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = q[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])t.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    t.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Hy", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Hy.r[n2] = n3;
        }
        return r[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Hy.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4882_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Hy"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
int forwardValue2163_217_0;
    int forwardValue2163_237_0;
    int forwardValue2163_260_0;
    net.minecraft.entity.Entity[] spill2163_0;
    boolean spill2163_1;
    long life4_3;
    net.minecraft.entity.Entity[] life6_127;
    forward_join_260: {
    forward_join_259: {
    forward_join_237: {
    forward_join_231: {
    forward_join_217: {
    forward_join_211: {
    life4_3 = (moom.Hy.p ^ 85730459549950L);
    ((moom.Hy)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(3)), ((int)(0)), ((int)(2)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2163_1(14815, (5654286473645834426L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hy.f)), ((net.minecraft.block.state.IBlockState)(moom.Hy.f)), ((boolean)(false)));
    ((moom.Hy)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(3)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2163_5(19338, (973170308921045740L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2163_6(19338, (973170308921045740L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hy.f)), ((net.minecraft.block.state.IBlockState)(moom.Hy.f)), ((boolean)(false)));
    ((moom.Hy)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(2)), ((int)(0)), ((int)(1)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2163_10(19338, (973170308921045740L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hy.f)), ((net.minecraft.block.state.IBlockState)(moom.Hy.f)), ((boolean)(false)));
    ((moom.Hy)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2163_14(3781, (6710290430118983585L ^ life4_3)))), ((int)(2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2163_15(19338, (973170308921045740L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2163_16(19338, (973170308921045740L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hy.f)), ((net.minecraft.block.state.IBlockState)(moom.Hy.f)), ((boolean)(false)));
    spill2163_0 = moom.G4.b();
    ((moom.Hy)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(0)), ((int)(0)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2163_21(19338, (973170308921045740L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hy.f)), ((net.minecraft.block.state.IBlockState)(moom.Hy.f)), ((boolean)(false)));
    ((moom.Hy)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2163_25(19338, (973170308921045740L ^ life4_3)))), ((int)(1)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2163_26(19338, (973170308921045740L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2163_27(19338, (973170308921045740L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hy.f)), ((net.minecraft.block.state.IBlockState)(moom.Hy.f)), ((boolean)(false)));
    life6_127 = spill2163_0;
    ((moom.Hy)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2163_31(19338, (973170308921045740L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2163_32(19338, (973170308921045740L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2163_33(19338, (973170308921045740L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hy.f)), ((net.minecraft.block.state.IBlockState)(moom.Hy.f)), ((boolean)(false)));
    ((moom.Hy)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(0)), ((int)(2)), ((int)(3)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(moom.Hy.f)), ((net.minecraft.block.state.IBlockState)(moom.Hy.f)), ((boolean)(false)));
    ((moom.Hy)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(1)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2163_40(7401, (8817030335775925646L ^ life4_3)))), ((int)(3)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(moom.Hy.f)), ((net.minecraft.block.state.IBlockState)(moom.Hy.f)), ((boolean)(false)));
    spill2163_1 = (((moom.Il)(((moom.Hy)(this)).o)).c)[((moom.bs)(moom.bs.NORTH)).a()];
    if (!((life6_127 != null))) {
        forwardValue2163_217_0 = ((spill2163_1) ? 1 : 0);
        break forward_join_217;
    }
    if (!(spill2163_1)) {
        break forward_join_211;
    }
    ((moom.Hy)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2163_49(19338, (973170308921045740L ^ life4_3)))), ((int)(4)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2163_50(19338, (973170308921045740L ^ life4_3)))), ((boolean)(false)));
    }
    forwardValue2163_217_0 = (((((moom.Il)(((moom.Hy)(this)).o)).c)[((moom.bs)(moom.bs.WEST)).a()]) ? 1 : 0);
    }
    if (!((life6_127 != null))) {
        forwardValue2163_237_0 = forwardValue2163_217_0;
        break forward_join_237;
    }
    if (!((forwardValue2163_217_0 != 0))) {
        break forward_join_231;
    }
    ((moom.Hy)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(3)), ((int)(1)), ((int)(2)), ((int)(4)), ((boolean)(false)));
    }
    forwardValue2163_237_0 = (((((moom.Il)(((moom.Hy)(this)).o)).c)[((moom.bs)(moom.bs.EAST)).a()]) ? 1 : 0);
    }
    if (!((life6_127 != null))) {
        forwardValue2163_260_0 = forwardValue2163_237_0;
        break forward_join_260;
    }
    if (!((forwardValue2163_237_0 != 0))) {
        break forward_join_259;
    }
    ((moom.Hy)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2163_63(7401, (8817030335775925646L ^ life4_3)))), ((int)(1)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2163_64(19338, (973170308921045740L ^ life4_3)))), ((int)(2)), ((int)(4)), ((boolean)(false)));
    }
    forwardValue2163_260_0 = 1;
    }
    return ((forwardValue2163_260_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4882_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2163_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2163_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2163_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2163_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2163_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2163_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2163_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2163_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2163_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2163_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2163_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2163_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2163_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2163_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2163_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2163_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2163_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2163_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2163_64(int a0, long a1) throws E;
}
