package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class HD extends moom.Hs {

private static final long p;

private static final long[] q;

private static final java.lang.Integer[] r;

private static final java.util.Map t;

public HD() {
super();
}


public HD(moom.bs p0, moom.Il p1, java.util.Random p2) {
super(1, p0, p1, 1, 1, 1);
}


static {
p = ((long)(((moom._a)(moom._c.a(((long)(246892714227058695L)), ((long)(-399373447336892960L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(16831036129345L)))));
    t = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.HD.p ^ 77425217924762L);
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
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "?,É¶mëÏgW¿\027«l/¬î\036$³à"))).length();
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
    local7_life23 = ((java.lang.String)((local6_life21 = "Ù\007êê¡ \027NÆ\000Bu\007J"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill810_38 = local6_life21;
        int __sourceSpill810_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill810_38)).substring(((int)(__sourceSpill810_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill810_43 = local8_life19;
        int __sourceSpill810_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill810_46 = new byte[8];
        (__sourceSpill810_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill810_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill810_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill810_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill810_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill810_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill810_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill810_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill810_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill810_47)).doFinal(((byte[])(__sourceSpill810_46)));
        (__sourceSpill810_43)[__sourceSpill810_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    q = ((long[])(local8_life19));
    r = ((java.lang.Integer[])(new java.lang.Integer[5]));
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x198A;
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
                throw new RuntimeException("moom/HD", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            HD.r[n2] = n3;
        }
        return r[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.HD.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4731_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/HD"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
moom.Il forestValue277_38_0;
    moom.HD forestValue277_40_0;
    int forestValue277_61_0;
    int forestValue277_87_0;
    int forestValue277_94_0;
    int forestValue277_94_1;
    int forestValue277_95_0;
    int forestValue277_96_0;
    int forestValue277_96_1;
    int forestValue277_447_0;
    int forestValue277_462_0;
    moom.Il spill277_0;
    moom.HD spill277_1;
    int spill277_2;
    int spill277_3;
    int spill277_4;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    int life7_62;
    int life8_73;
    int life9_102;
    forest_join_462: {
    forest_join_461: {
    forest_join_447: {
    forest_join_121: {
    forest_join_58: {
    forest_join_40: {
    forest_join_38: {
    forest_join_30: {
    life4_3 = (moom.HD.p ^ 130677515287636L);
    life6_5 = moom.G4.b();
    spill277_0 = ((moom.HD)(this)).o;
    if (!((life6_5 != null))) {
        forestValue277_38_0 = spill277_0;
        break forest_join_38;
    }
    if (!(((((moom.Il)(spill277_0)).a / __sourceIntrinsic_5ac1d031d896_invokedynamic277_4(15267, (8264116377646776582L ^ life4_3))) > 0))) {
        break forest_join_30;
    }
    ((moom.HD)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((boolean)((((moom.Il)(((moom.HD)(this)).o)).c)[((moom.bs)(moom.bs.DOWN)).a()])));
    }
    spill277_1 = this;
    if (!((life6_5 != null))) {
        forestValue277_40_0 = spill277_1;
        break forest_join_40;
    }
    forestValue277_38_0 = (((moom.Il)(((moom.HD)(spill277_1)).o)).b)[((moom.bs)(moom.bs.UP)).a()];
    }
    if (!((forestValue277_38_0 == null))) {
        break forest_join_58;
    }
    forestValue277_40_0 = this;
    }
    ((moom.HD)(forestValue277_40_0)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(4)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic277_14(28413, (760340903716066399L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic277_15(20963, (1730077910474206018L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HD.e)));
    }
    life7_62 = 1;
    forest_cycle_60: while (true) {
    forest_join_118: {
    forestValue277_61_0 = life7_62;
    forest_cycle_61: while (true) {
    if (!((forestValue277_61_0 <= __sourceIntrinsic_5ac1d031d896_invokedynamic277_18(20963, (1730077910474206018L ^ life4_3))))) {
        break forest_join_121;
    }
    spill277_2 = 1;
    if (!((life6_5 != null))) {
        forestValue277_447_0 = spill277_2;
        break forest_join_447;
    }
    life8_73 = spill277_2;
    forest_cycle_71: while (true) {
    forest_join_115: {
    forest_join_96: {
    forest_join_95: {
    forest_join_94: {
    forest_join_87: {
    if (!((life8_73 <= __sourceIntrinsic_5ac1d031d896_invokedynamic277_19(20963, (1730077910474206018L ^ life4_3))))) {
        break forest_join_118;
    }
    spill277_3 = ((java.util.Random)(p1)).nextInt(((int)(3)));
    if (!((life6_5 != null))) {
        forestValue277_61_0 = spill277_3;
        continue forest_cycle_61;
    }
    if (!((life6_5 != null))) {
        forestValue277_87_0 = spill277_3;
        break forest_join_87;
    }
    if (!((spill277_3 != 0))) {
        break forest_join_115;
    }
    forestValue277_87_0 = 2;
    }
    spill277_4 = ((java.util.Random)(p1)).nextInt(((int)(4)));
    if (!((life6_5 != null))) {
        forestValue277_94_0 = forestValue277_87_0;
        forestValue277_94_1 = spill277_4;
        break forest_join_94;
    }
    if (!((spill277_4 == 0))) {
        forestValue277_95_0 = forestValue277_87_0;
        break forest_join_95;
    }
    forestValue277_94_0 = forestValue277_87_0;
    forestValue277_94_1 = 0;
    }
    forestValue277_96_0 = forestValue277_94_0;
    forestValue277_96_1 = forestValue277_94_1;
    break forest_join_96;
    }
    forestValue277_96_0 = forestValue277_95_0;
    forestValue277_96_1 = 1;
    }
    life9_102 = (forestValue277_96_0 + forestValue277_96_1);
    ((moom.HD)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(life7_62)), ((int)(life9_102)), ((int)(life8_73)), ((int)(life7_62)), ((int)(3)), ((int)(life8_73)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.v)).b__fE(((int)(1))))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.v)).b__fE(((int)(1))))), ((boolean)(false)));
    }
    life8_73 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_71;
    }
    break forest_cycle_71;
    }
    break forest_cycle_61;
    }
    }
    life7_62 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_60;
    }
    break forest_cycle_60;
    }
    }
    ((moom.HD)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(0)), ((int)(0)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic277_27(8135, (1327768022238389604L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HD.f)), ((net.minecraft.block.state.IBlockState)(moom.HD.f)), ((boolean)(false)));
    ((moom.HD)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic277_31(1857, (191675727205137889L ^ life4_3)))), ((int)(1)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic277_32(1857, (191675727205137889L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic277_33(1857, (191675727205137889L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HD.f)), ((net.minecraft.block.state.IBlockState)(moom.HD.f)), ((boolean)(false)));
    ((moom.HD)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic277_37(20963, (1730077910474206018L ^ life4_3)))), ((int)(1)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(moom.HD.f)), ((net.minecraft.block.state.IBlockState)(moom.HD.f)), ((boolean)(false)));
    ((moom.HD)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic277_41(1857, (191675727205137889L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic277_42(20963, (1730077910474206018L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic277_43(1857, (191675727205137889L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HD.f)), ((net.minecraft.block.state.IBlockState)(moom.HD.f)), ((boolean)(false)));
    ((moom.HD)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(2)), ((int)(0)), ((int)(0)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic277_47(1857, (191675727205137889L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HD.g)), ((net.minecraft.block.state.IBlockState)(moom.HD.g)), ((boolean)(false)));
    ((moom.HD)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic277_51(1857, (191675727205137889L ^ life4_3)))), ((int)(2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic277_52(1857, (191675727205137889L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic277_53(1857, (191675727205137889L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HD.g)), ((net.minecraft.block.state.IBlockState)(moom.HD.g)), ((boolean)(false)));
    ((moom.HD)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic277_57(20963, (1730077910474206018L ^ life4_3)))), ((int)(2)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(moom.HD.g)), ((net.minecraft.block.state.IBlockState)(moom.HD.g)), ((boolean)(false)));
    ((moom.HD)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic277_61(1857, (191675727205137889L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic277_62(20963, (1730077910474206018L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic277_63(1857, (191675727205137889L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HD.g)), ((net.minecraft.block.state.IBlockState)(moom.HD.g)), ((boolean)(false)));
    ((moom.HD)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(3)), ((int)(0)), ((int)(0)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic277_67(1857, (191675727205137889L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HD.f)), ((net.minecraft.block.state.IBlockState)(moom.HD.f)), ((boolean)(false)));
    ((moom.HD)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic277_71(1857, (191675727205137889L ^ life4_3)))), ((int)(3)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic277_72(1857, (191675727205137889L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic277_73(1857, (191675727205137889L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HD.f)), ((net.minecraft.block.state.IBlockState)(moom.HD.f)), ((boolean)(false)));
    ((moom.HD)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(3)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic277_77(20963, (1730077910474206018L ^ life4_3)))), ((int)(3)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(moom.HD.f)), ((net.minecraft.block.state.IBlockState)(moom.HD.f)), ((boolean)(false)));
    ((moom.HD)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic277_81(1857, (191675727205137889L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic277_82(20963, (1730077910474206018L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic277_83(1857, (191675727205137889L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HD.f)), ((net.minecraft.block.state.IBlockState)(moom.HD.f)), ((boolean)(false)));
    ((moom.HD)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(3)), ((int)(0)), ((int)(2)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(moom.HD.g)), ((net.minecraft.block.state.IBlockState)(moom.HD.g)), ((boolean)(false)));
    ((moom.HD)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic277_90(1857, (191675727205137889L ^ life4_3)))), ((int)(1)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic277_91(1857, (191675727205137889L ^ life4_3)))), ((int)(2)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(moom.HD.g)), ((net.minecraft.block.state.IBlockState)(moom.HD.g)), ((boolean)(false)));
    ((moom.HD)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(1)), ((int)(0)), ((int)(4)), ((int)(2)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(moom.HD.g)), ((net.minecraft.block.state.IBlockState)(moom.HD.g)), ((boolean)(false)));
    ((moom.HD)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic277_98(1857, (191675727205137889L ^ life4_3)))), ((int)(4)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic277_99(1857, (191675727205137889L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HD.g)), ((net.minecraft.block.state.IBlockState)(moom.HD.g)), ((boolean)(false)));
    forestValue277_447_0 = (((((moom.Il)(((moom.HD)(this)).o)).c)[((moom.bs)(moom.bs.SOUTH)).a()]) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forestValue277_462_0 = forestValue277_447_0;
        break forest_join_462;
    }
    if (!((forestValue277_447_0 != 0))) {
        break forest_join_461;
    }
    ((moom.HD)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(1)), ((int)(0)), ((int)(4)), ((int)(2)), ((int)(0)), ((boolean)(false)));
    }
    forestValue277_462_0 = 1;
    }
    return ((forestValue277_462_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic277_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic277_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic277_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic277_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic277_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic277_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic277_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic277_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic277_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic277_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic277_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic277_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic277_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic277_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic277_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic277_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic277_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic277_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic277_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic277_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic277_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic277_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic277_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic277_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic277_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic277_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic277_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic277_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic277_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic277_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic277_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic277_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic277_99(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4731_0() throws E;
}
