package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class H5 extends moom.HT {

private static long q;

private static long[] w;

private static java.lang.Integer[] x;

private static java.util.Map y;

public H5() {
super();
}


public H5(moom.H6 p0, int p1, java.util.Random p2, int p3, int p4) { super((moom.H6)null, 0); }


private static void __sourceConstructorBody_8decca8870715772(moom.H5 receiver, moom.H6 p0, int p1, java.util.Random p2, int p3, int p4) throws Throwable {

long local6 = (moom.H5.q ^ 106259062153976L);

    moom.H5.__sourceConstructorInit_8decca8870715772_0(((moom.H5)(receiver)), ((moom.H6)(p0)), ((int)(p1)));

    ((moom.H5)(receiver)).b = ((moom.bs)(((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).a(((java.util.Random)(p2)))));

    ((moom.H5)(receiver)).a = ((moom.G2)(new moom.G2(p3, __sourceIntrinsic_8decca8870715772_originalDynamicSite2101_5(19240, (8982484331003504066L ^ local6)), p4, ((p3 + __sourceIntrinsic_8decca8870715772_originalDynamicSite2101_6(29648, (7344794287194004796L ^ local6))) - 1), __sourceIntrinsic_8decca8870715772_originalDynamicSite2101_7(28933, (447819508573167589L ^ local6)), ((p4 + __sourceIntrinsic_8decca8870715772_originalDynamicSite2101_8(10738, (5601922034393089813L ^ local6))) - 1))));

    return;

}



static {
q = ((long)(((moom._a)(moom._c.a(((long)(-8231367923643495163L)), ((long)(4386758925705094764L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(272355399768482L)))));
    y = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.H5.q ^ 122401995902133L);
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
    long[] local8_life19 = new long[13];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ÞòµAÌ½CáF\020k²\004<A\ri>ÚQ8Ùc&I¨¿OõB+\t?×Ö¨#Y$p§\0025àß<\007\\îpÚ\035\033¡nIbjq<ùj\025ïÐùP\024\004©ó\026t\177À\000¹"))).length();
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
    local7_life23 = ((java.lang.String)((local6_life21 = "\002\fÌqØtE>:|vþ¡Ã\030ç"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill805_38 = local6_life21;
        int __sourceSpill805_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill805_38)).substring(((int)(__sourceSpill805_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill805_43 = local8_life19;
        int __sourceSpill805_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill805_46 = new byte[8];
        (__sourceSpill805_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill805_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill805_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill805_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill805_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill805_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill805_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill805_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill805_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill805_47)).doFinal(((byte[])(__sourceSpill805_46)));
        (__sourceSpill805_43)[__sourceSpill805_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    w = ((long[])(local8_life19));
    x = ((java.lang.Integer[])(new java.lang.Integer[13]));
}

private static native <E extends Throwable> void __sourceConstructorInit_8decca8870715772_0(moom.H5 a0, moom.H6 a1, int a2) throws E;

private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_677e1b8e451f7d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4720_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/H5"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x70E2;
        if (x[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = w[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])y.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    y.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/H5", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            H5.x[n2] = n3;
        }
        return x[n2];
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
moom.H5 forestValue668_25_0;
    int forestValue668_236_0;
    int forestValue668_238_0;
    int forestValue668_254_0;
    int forestValue668_259_0;
    int forestValue668_263_0;
    int forestValue668_296_0;
    int spill668_0;
    moom.H5 spill668_1;
    int spill668_2;
    int spill668_3;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    int life7_239;
    int life8_246;
    forest_join_296: {
    forest_join_295: {
    forest_join_236: {
    forest_join_37: {
    forest_join_25: {
    forest_join_24: {
    life4_3 = (moom.H5.q ^ 104041067896794L);
    life6_5 = moom.G4.b();
    spill668_0 = this.e;
    if (!((life6_5 != null))) {
        forestValue668_236_0 = spill668_0;
        break forest_join_236;
    }
    if (!((spill668_0 < 0))) {
        break forest_join_37;
    }
    this.e = ((int)(((moom.H5)(this)).a__sourceReturn_6a83d276d7(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)))));
    spill668_1 = this;
    if (!((life6_5 != null))) {
        forestValue668_25_0 = spill668_1;
        break forest_join_25;
    }
    if (!((((moom.H5)(spill668_1)).e < 0))) {
        break forest_join_24;
    }
    return ((1) != 0);
    }
    forestValue668_25_0 = this;
    }
    ((moom.G2)(((moom.H5)(forestValue668_25_0)).a)).a(((int)(0)), ((int)(((this.e - ((moom.G2)(this.a)).e) + 3))), ((int)(0)));
    }
    ((moom.H5)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(0)), ((int)(1)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic668_12(828, (7575184641498616054L ^ life4_3)))), ((int)(4)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_4011ce2a926de7(((moom.dM)(net.minecraft.init.Blocks.i))))), ((boolean)(false)));
    ((moom.H5)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a))))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic668_20(18353, (7871802859353461872L ^ life4_3)))), ((int)(2)), ((moom.G2)(p2)));
    ((moom.H5)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a))))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic668_24(18353, (7871802859353461872L ^ life4_3)))), ((int)(2)), ((moom.G2)(p2)));
    ((moom.H5)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a))))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic668_28(18353, (7871802859353461872L ^ life4_3)))), ((int)(3)), ((moom.G2)(p2)));
    ((moom.H5)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a))))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic668_32(18353, (7871802859353461872L ^ life4_3)))), ((int)(3)), ((moom.G2)(p2)));
    ((moom.H5)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO))))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic668_36(19910, (3707207161855401482L ^ life4_3)))), ((int)(1)), ((moom.G2)(p2)));
    ((moom.H5)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO))))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic668_40(14128, (8851658781166675199L ^ life4_3)))), ((int)(1)), ((moom.G2)(p2)));
    ((moom.H5)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO))))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic668_44(444, (1356629059242529407L ^ life4_3)))), ((int)(1)), ((moom.G2)(p2)));
    ((moom.H5)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO))))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic668_48(15176, (7537222811947313285L ^ life4_3)))), ((int)(1)), ((moom.G2)(p2)));
    ((moom.H5)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO))))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic668_52(444, (1356629059242529407L ^ life4_3)))), ((int)(4)), ((moom.G2)(p2)));
    ((moom.H5)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO))))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic668_56(15176, (7537222811947313285L ^ life4_3)))), ((int)(4)), ((moom.G2)(p2)));
    ((moom.H5)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO))))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic668_60(444, (1356629059242529407L ^ life4_3)))), ((int)(4)), ((moom.G2)(p2)));
    ((moom.H5)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO))))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic668_64(15176, (7537222811947313285L ^ life4_3)))), ((int)(4)), ((moom.G2)(p2)));
    ((moom.H5)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic668_66(9171, (5852562564565970963L ^ life4_3)))), ((int)(1)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic668_67(210, (5247660246274478875L ^ life4_3)))), ((int)(4)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e))))), ((boolean)(false)));
    forestValue668_236_0 = 0;
    }
    life7_239 = forestValue668_236_0;
    forest_cycle_237: while (true) {
    forest_join_292: {
    forestValue668_238_0 = life7_239;
    forest_cycle_238: while (true) {
    if (!((forestValue668_238_0 <= 5))) {
        break forest_join_295;
    }
    spill668_2 = 0;
    if (!((life6_5 != null))) {
        forestValue668_296_0 = spill668_2;
        break forest_join_296;
    }
    life8_246 = spill668_2;
    forest_cycle_244: while (true) {
    forest_join_289: {
    forest_join_265: {
    forest_join_263: {
    forest_join_259: {
    forest_join_254: {
    if (!((life8_246 <= 5))) {
        break forest_join_292;
    }
    spill668_3 = life8_246;
    if (!((life6_5 != null))) {
        forestValue668_238_0 = spill668_3;
        continue forest_cycle_238;
    }
    if (!((life6_5 != null))) {
        forestValue668_254_0 = spill668_3;
        break forest_join_254;
    }
    if (!((spill668_3 != 0))) {
        break forest_join_265;
    }
    forestValue668_254_0 = life8_246;
    }
    if (!((life6_5 != null))) {
        forestValue668_259_0 = forestValue668_254_0;
        break forest_join_259;
    }
    if (!((forestValue668_254_0 != 5))) {
        break forest_join_265;
    }
    forestValue668_259_0 = life7_239;
    }
    if (!((life6_5 != null))) {
        forestValue668_263_0 = forestValue668_259_0;
        break forest_join_263;
    }
    if (!((forestValue668_259_0 != 0))) {
        break forest_join_265;
    }
    forestValue668_263_0 = life7_239;
    }
    if (!((forestValue668_263_0 == 5))) {
        break forest_join_289;
    }
    }
    ((moom.H5)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.n))))), ((int)(life8_246)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic668_75(2095, (3583101841149795300L ^ life4_3)))), ((int)(life7_239)), ((moom.G2)(p2)));
    ((moom.H5)(this)).a__Void(((net.minecraft.world.World)(p0)), ((int)(life8_246)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic668_77(18353, (7871802859353461872L ^ life4_3)))), ((int)(life7_239)), ((moom.G2)(p2)));
    }
    life8_246 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_244;
    }
    break forest_cycle_244;
    }
    break forest_cycle_238;
    }
    }
    life7_239 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_237;
    }
    break forest_cycle_237;
    }
    }
    forestValue668_296_0 = 1;
    }
    return ((forestValue668_296_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(moom.G4 p0, java.util.List<moom.G4> p1, java.util.Random p2) {
__sourceExactCall_a2b35a35ee714a(((moom.H6)(((moom.H6)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).a - 1))), ((int)((((moom.G2)(this.a)).e - 4))), ((int)((((moom.G2)(this.a)).c + 1))), ((moom.bs)(moom.bs.WEST)), ((int)(__sourceExactCall_9ad81d9ca893aa(((moom.H5)(this))))));
    __sourceExactCall_a2b35a35ee714a(((moom.H6)(((moom.H6)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).d + 1))), ((int)((((moom.G2)(this.a)).e - 4))), ((int)((((moom.G2)(this.a)).c + 1))), ((moom.bs)(moom.bs.EAST)), ((int)(__sourceExactCall_9ad81d9ca893aa(((moom.H5)(this))))));
    __sourceExactCall_a2b35a35ee714a(((moom.H6)(((moom.H6)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).a + 1))), ((int)((((moom.G2)(this.a)).e - 4))), ((int)((((moom.G2)(this.a)).c - 1))), ((moom.bs)(moom.bs.NORTH)), ((int)(__sourceExactCall_9ad81d9ca893aa(((moom.H5)(this))))));
    __sourceExactCall_a2b35a35ee714a(((moom.H6)(((moom.H6)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).a + 1))), ((int)((((moom.G2)(this.a)).e - 4))), ((int)((((moom.G2)(this.a)).f + 1))), ((moom.bs)(moom.bs.SOUTH)), ((int)(__sourceExactCall_9ad81d9ca893aa(((moom.H5)(this))))));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_8decca8870715772_originalDynamicSite2101_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8decca8870715772_originalDynamicSite2101_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8decca8870715772_originalDynamicSite2101_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8decca8870715772_originalDynamicSite2101_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic668_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic668_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic668_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic668_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic668_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic668_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic668_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic668_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic668_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic668_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic668_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic668_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic668_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic668_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic668_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic668_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic668_77(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4720_0() throws E;

private static native int __sourceExactCall_677e1b8e451f7d(int p0, long p1);

private static native net.minecraft.block.state.IBlockState __sourceExactCall_4011ce2a926de7(moom.dM p0);
private static native net.minecraft.block.state.IBlockState __sourceExactCall_7dba7f72a5b74e(net.minecraft.block.Block p0);

private static native moom.G4 __sourceExactCall_a2b35a35ee714a(moom.H6 p0, java.util.List p1, java.util.Random p2, int p3, int p4, int p5, moom.bs p6, int p7);
private static native int __sourceExactCall_9ad81d9ca893aa(moom.H5 p0);
}
