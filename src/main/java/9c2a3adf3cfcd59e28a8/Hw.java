package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Hw extends moom.Hs {

private static final long p;

private static final long[] q;

private static final java.lang.Integer[] r;

private static final java.util.Map t;

public Hw() {
super();
}


public Hw(moom.bs p0, moom.Il p1, java.util.Random p2) {
super(1, p0, p1, 1, 2, 2);
}


static {
p = ((long)(((moom._a)(moom._c.a(((long)(4250541609966573161L)), ((long)(1326961681666599713L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(121849913394075L)))));
    t = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Hw.p ^ 138415806651345L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill849_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill849_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill849_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill849_14 = new byte[8];
    (__sourceSpill849_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill849_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation849_16 = __sourceSpill849_14;
    ((javax.crypto.Cipher)(__sourceSpill849_11)).init(((int)(__sourceSpill849_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill849_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation849_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[18];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\025Ð\177SQÐØª¡¾Ê½pú´\r½<k¬Öj\000,ýQÍ\021!?>N1Ãi~0ó0øÿSa`)£\0052ê<¥xôN{\034(nàâ%Cº\021Â\177YÃñx\030ÏÃgâ®o£ê÷Ù77j?\031\\\027ü5ºëÒÒl¥(¹Â¼\005rÚú\003Ø.y"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill849_25 = local6_life21;
        int __sourceSpill849_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill849_25)).substring(((int)(__sourceSpill849_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill849_30 = local8_life19;
        int __sourceSpill849_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill849_33 = new byte[8];
        (__sourceSpill849_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill849_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill849_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill849_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill849_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill849_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill849_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill849_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill849_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill849_34)).doFinal(((byte[])(__sourceSpill849_33)));
        (__sourceSpill849_30)[__sourceSpill849_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "r\026¼eV\"Úãñ°Ò)\001íP"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill849_38 = local6_life21;
        int __sourceSpill849_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill849_38)).substring(((int)(__sourceSpill849_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill849_43 = local8_life19;
        int __sourceSpill849_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill849_46 = new byte[8];
        (__sourceSpill849_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill849_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill849_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill849_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill849_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill849_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill849_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill849_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill849_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill849_47)).doFinal(((byte[])(__sourceSpill849_46)));
        (__sourceSpill849_43)[__sourceSpill849_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    q = ((long[])(local8_life19));
    r = ((java.lang.Integer[])(new java.lang.Integer[18]));
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x51F8;
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
                throw new RuntimeException("moom/Hw", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Hw.r[n2] = n3;
        }
        return r[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Hw.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4878_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Hw"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
moom.Il forestValue900073_71_0;
    moom.Il forestValue900073_106_0;
    int forestValue900073_162_0;
    int forestValue900073_162_1;
    int forestValue900073_276_0;
    int forestValue900073_276_1;
    int forestValue900073_304_0;
    int forestValue900073_304_1;
    int forestValue900073_320_0;
    int forestValue900073_320_1;
    int forestValue900073_360_0;
    int forestValue900073_379_0;
    int forestValue900073_406_0;
    int forestValue900073_425_0;
    int forestValue900073_452_0;
    int forestValue900073_479_0;
    int forestValue900073_514_0;
    int forestValue900073_537_0;
    int forestValue900073_627_0;
    int forestValue900073_689_0;
    int forestValue900073_720_0;
    int forestValue900073_814_0;
    int forestValue900073_932_0;
    net.minecraft.entity.Entity[] spill900073_0;
    moom.Il spill900073_1;
    int spill900073_2;
    int spill900073_3;
    int spill900073_4;
    int spill900073_5;
    int spill900073_6;
    int spill900073_7;
    int spill900073_8;
    int spill900073_9;
    long life4_3;
    moom.Il life7_11;
    moom.Il life8_14;
    moom.Il life9_20;
    moom.Il life10_26;
    net.minecraft.entity.Entity[] life6_27;
    int life11_151;
    net.minecraft.block.state.IBlockState life12_162;
    int life11_276;
    net.minecraft.block.state.IBlockState life12_288;
    net.minecraft.block.state.IBlockState life12_341;
    forest_join_932: {
    forest_join_931: {
    forest_join_814: {
    forest_join_809: {
    forest_join_720: {
    forest_join_715: {
    forest_join_689: {
    forest_join_684: {
    forest_join_627: {
    forest_join_622: {
    forest_join_537: {
    forest_join_532: {
    forest_join_514: {
    forest_join_509: {
    forest_join_479: {
    forest_join_474: {
    forest_join_452: {
    forest_join_447: {
    forest_join_425: {
    forest_join_420: {
    forest_join_406: {
    forest_join_401: {
    forest_join_379: {
    forest_join_374: {
    forest_join_360: {
    forest_join_355: {
    forest_join_304: {
    forest_join_252: {
    forest_join_138: {
    forest_join_106: {
    forest_join_101: {
    forest_join_71: {
    forest_join_66: {
    life4_3 = (moom.Hw.p ^ 49279659122897L);
    spill900073_0 = moom.G4.b();
    life7_11 = (((moom.Il)(((moom.Hw)(this)).o)).b)[((moom.bs)(moom.bs.NORTH)).a()];
    life8_14 = ((moom.Hw)(this)).o;
    life9_20 = (((moom.Il)(life7_11)).b)[((moom.bs)(moom.bs.UP)).a()];
    life10_26 = (((moom.Il)(life8_14)).b)[((moom.bs)(moom.bs.UP)).a()];
    life6_27 = spill900073_0;
    spill900073_1 = ((moom.Hw)(this)).o;
    if (!((life6_27 != null))) {
        forestValue900073_71_0 = spill900073_1;
        break forest_join_71;
    }
    if (!(((((moom.Il)(spill900073_1)).a / __sourceIntrinsic_5ac1d031d896_invokedynamic900073_15(28061, (6171420319907176257L ^ life4_3))) > 0))) {
        break forest_join_66;
    }
    ((moom.Hw)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_16(31356, (2128100274207246503L ^ life4_3)))), ((boolean)((((moom.Il)(life7_11)).c)[((moom.bs)(moom.bs.DOWN)).a()])));
    ((moom.Hw)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((boolean)((((moom.Il)(life8_14)).c)[((moom.bs)(moom.bs.DOWN)).a()])));
    }
    forestValue900073_71_0 = (((moom.Il)(life10_26)).b)[((moom.bs)(moom.bs.UP)).a()];
    }
    if (!((life6_27 != null))) {
        forestValue900073_106_0 = forestValue900073_71_0;
        break forest_join_106;
    }
    if (!((forestValue900073_71_0 == null))) {
        break forest_join_101;
    }
    ((moom.Hw)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_28(10272, (3083803021961698019L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_29(15053, (5393455867326990352L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_30(10272, (3083803021961698019L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_31(3155, (7216975231899975299L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hw.e)));
    }
    forestValue900073_106_0 = (((moom.Il)(life9_20)).b)[((moom.bs)(moom.bs.UP)).a()];
    }
    if (!((forestValue900073_106_0 == null))) {
        break forest_join_138;
    }
    ((moom.Hw)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_37(10272, (3083803021961698019L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_38(10272, (3083803021961698019L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_39(14371, (1563419156249479922L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_40(10272, (3083803021961698019L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_41(19992, (3776928379463892167L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hw.e)));
    }
    life11_151 = 1;
    forest_cycle_140: while (true) {
    forest_join_165: {
    forest_join_163: {
    forest_join_162: {
    if (!((life11_151 <= __sourceIntrinsic_5ac1d031d896_invokedynamic900073_44(15581, (108743466432237071L ^ life4_3))))) {
        break forest_join_252;
    }
    life12_162 = moom.Hw.f;
    spill900073_2 = life11_151;
    spill900073_3 = 2;
    if (!((life6_27 != null))) {
        forestValue900073_304_0 = spill900073_2;
        forestValue900073_304_1 = spill900073_3;
        break forest_join_304;
    }
    if (!((life6_27 != null))) {
        forestValue900073_162_0 = spill900073_2;
        forestValue900073_162_1 = spill900073_3;
        break forest_join_162;
    }
    if (!((spill900073_2 != spill900073_3))) {
        break forest_join_163;
    }
    forestValue900073_162_0 = life11_151;
    forestValue900073_162_1 = __sourceIntrinsic_5ac1d031d896_invokedynamic900073_46(14371, (1563419156249479922L ^ life4_3));
    }
    if (!((forestValue900073_162_0 == forestValue900073_162_1))) {
        break forest_join_165;
    }
    }
    life12_162 = moom.Hw.e;
    }
    ((moom.Hw)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(life11_151)), ((int)(0)), ((int)(0)), ((int)(life11_151)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_48(22280, (8257691890557445584L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(life12_162)), ((net.minecraft.block.state.IBlockState)(life12_162)), ((boolean)(false)));
    ((moom.Hw)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_50(15581, (108743466432237071L ^ life4_3)))), ((int)(life11_151)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_51(15581, (108743466432237071L ^ life4_3)))), ((int)(life11_151)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_52(18134, (5912809197861270533L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(life12_162)), ((net.minecraft.block.state.IBlockState)(life12_162)), ((boolean)(false)));
    ((moom.Hw)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(life11_151)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_54(14371, (1563419156249479922L ^ life4_3)))), ((int)(life11_151)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(life12_162)), ((net.minecraft.block.state.IBlockState)(life12_162)), ((boolean)(false)));
    ((moom.Hw)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(life11_151)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_56(18134, (5912809197861270533L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_57(14371, (1563419156249479922L ^ life4_3)))), ((int)(life11_151)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_58(18134, (5912809197861270533L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(life12_162)), ((net.minecraft.block.state.IBlockState)(life12_162)), ((boolean)(false)));
    life11_151 += 1;
    if (!((life6_27 == null))) {
        continue forest_cycle_140;
    }
    break forest_cycle_140;
    }
    }
    life11_276 = 1;
    forest_cycle_254: while (true) {
    forest_join_279: {
    forest_join_277: {
    forest_join_276: {
    if (!((life11_276 <= __sourceIntrinsic_5ac1d031d896_invokedynamic900073_60(15581, (108743466432237071L ^ life4_3))))) {
        break forest_join_355;
    }
    life12_288 = moom.Hw.g;
    spill900073_4 = life11_276;
    if (!((life6_27 != null))) {
        forestValue900073_360_0 = spill900073_4;
        break forest_join_360;
    }
    spill900073_5 = 2;
    if (!((life6_27 != null))) {
        forestValue900073_276_0 = spill900073_4;
        forestValue900073_276_1 = spill900073_5;
        break forest_join_276;
    }
    if (!((spill900073_4 != spill900073_5))) {
        break forest_join_277;
    }
    forestValue900073_276_0 = life11_276;
    forestValue900073_276_1 = __sourceIntrinsic_5ac1d031d896_invokedynamic900073_62(14371, (1563419156249479922L ^ life4_3));
    }
    if (!((forestValue900073_276_0 == forestValue900073_276_1))) {
        break forest_join_279;
    }
    }
    life12_288 = moom.Hw.i;
    }
    ((moom.Hw)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(life11_276)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_64(15581, (108743466432237071L ^ life4_3)))), ((int)(4)), ((int)(life11_276)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_65(10272, (3083803021961698019L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(life12_288)), ((net.minecraft.block.state.IBlockState)(life12_288)), ((boolean)(false)));
    life11_276 += 1;
    if (!((life6_27 == null))) {
        continue forest_cycle_254;
    }
    break forest_cycle_254;
    }
    break forest_join_355;
    }
    forest_cycle_304: while (true) {
    forest_join_348: {
    forest_join_323: {
    forest_join_321: {
    forest_join_320: {
    if (!((forestValue900073_304_0 <= forestValue900073_304_1))) {
        break forest_join_355;
    }
    life12_341 = moom.Hw.g;
    spill900073_6 = life11_151;
    if (!((life6_27 != null))) {
        forestValue900073_360_0 = spill900073_6;
        break forest_join_360;
    }
    spill900073_7 = 2;
    if (!((life6_27 != null))) {
        forestValue900073_320_0 = spill900073_6;
        forestValue900073_320_1 = spill900073_7;
        break forest_join_320;
    }
    if (!((spill900073_6 != spill900073_7))) {
        break forest_join_321;
    }
    forestValue900073_320_0 = life11_151;
    forestValue900073_320_1 = __sourceIntrinsic_5ac1d031d896_invokedynamic900073_68(14371, (1563419156249479922L ^ life4_3));
    }
    if (!((forestValue900073_320_0 == forestValue900073_320_1))) {
        break forest_join_323;
    }
    }
    life12_341 = moom.Hw.i;
    }
    ((moom.Hw)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(life11_151)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_70(15581, (108743466432237071L ^ life4_3)))), ((int)(4)), ((int)(life11_151)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_71(10272, (3083803021961698019L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(life12_341)), ((net.minecraft.block.state.IBlockState)(life12_341)), ((boolean)(false)));
    life11_151 += 1;
    if (!((life6_27 == null))) {
        break forest_join_348;
    }
    break forest_join_355;
    }
    spill900073_8 = life11_151;
    spill900073_9 = __sourceIntrinsic_5ac1d031d896_invokedynamic900073_73(15581, (108743466432237071L ^ life4_3));
    forestValue900073_304_0 = spill900073_8;
    forestValue900073_304_1 = spill900073_9;
    continue forest_cycle_304;
    }
    }
    forestValue900073_360_0 = (((((moom.Il)(life8_14)).c)[((moom.bs)(moom.bs.SOUTH)).a()]) ? 1 : 0);
    }
    if (!((life6_27 != null))) {
        forestValue900073_379_0 = forestValue900073_360_0;
        break forest_join_379;
    }
    if (!((forestValue900073_360_0 != 0))) {
        break forest_join_374;
    }
    ((moom.Hw)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(1)), ((int)(0)), ((int)(4)), ((int)(2)), ((int)(0)), ((boolean)(false)));
    }
    forestValue900073_379_0 = (((((moom.Il)(life8_14)).c)[((moom.bs)(moom.bs.EAST)).a()]) ? 1 : 0);
    }
    if (!((life6_27 != null))) {
        forestValue900073_406_0 = forestValue900073_379_0;
        break forest_join_406;
    }
    if (!((forestValue900073_379_0 != 0))) {
        break forest_join_401;
    }
    ((moom.Hw)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_83(15581, (108743466432237071L ^ life4_3)))), ((int)(1)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_84(15581, (108743466432237071L ^ life4_3)))), ((int)(2)), ((int)(4)), ((boolean)(false)));
    }
    forestValue900073_406_0 = (((((moom.Il)(life8_14)).c)[((moom.bs)(moom.bs.WEST)).a()]) ? 1 : 0);
    }
    if (!((life6_27 != null))) {
        forestValue900073_425_0 = forestValue900073_406_0;
        break forest_join_425;
    }
    if (!((forestValue900073_406_0 != 0))) {
        break forest_join_420;
    }
    ((moom.Hw)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(3)), ((int)(0)), ((int)(2)), ((int)(4)), ((boolean)(false)));
    }
    forestValue900073_425_0 = (((((moom.Il)(life7_11)).c)[((moom.bs)(moom.bs.NORTH)).a()]) ? 1 : 0);
    }
    if (!((life6_27 != null))) {
        forestValue900073_452_0 = forestValue900073_425_0;
        break forest_join_452;
    }
    if (!((forestValue900073_425_0 != 0))) {
        break forest_join_447;
    }
    ((moom.Hw)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_95(18134, (5912809197861270533L ^ life4_3)))), ((int)(4)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_96(18134, (5912809197861270533L ^ life4_3)))), ((boolean)(false)));
    }
    forestValue900073_452_0 = (((((moom.Il)(life7_11)).c)[((moom.bs)(moom.bs.WEST)).a()]) ? 1 : 0);
    }
    if (!((life6_27 != null))) {
        forestValue900073_479_0 = forestValue900073_452_0;
        break forest_join_479;
    }
    if (!((forestValue900073_452_0 != 0))) {
        break forest_join_474;
    }
    ((moom.Hw)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_102(26416, (5807675630201984486L ^ life4_3)))), ((int)(0)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_103(16035, (1288957107109891191L ^ life4_3)))), ((boolean)(false)));
    }
    forestValue900073_479_0 = (((((moom.Il)(life7_11)).c)[((moom.bs)(moom.bs.EAST)).a()]) ? 1 : 0);
    }
    if (!((life6_27 != null))) {
        forestValue900073_514_0 = forestValue900073_479_0;
        break forest_join_514;
    }
    if (!((forestValue900073_479_0 != 0))) {
        break forest_join_509;
    }
    ((moom.Hw)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_109(15581, (108743466432237071L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_110(12743, (7340512937232302878L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_111(15581, (108743466432237071L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_112(16468, (2446243674360148630L ^ life4_3)))), ((boolean)(false)));
    }
    forestValue900073_514_0 = (((((moom.Il)(life10_26)).c)[((moom.bs)(moom.bs.SOUTH)).a()]) ? 1 : 0);
    }
    if (!((life6_27 != null))) {
        forestValue900073_537_0 = forestValue900073_514_0;
        break forest_join_537;
    }
    if (!((forestValue900073_514_0 != 0))) {
        break forest_join_532;
    }
    ((moom.Hw)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(5)), ((int)(0)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_118(14371, (1563419156249479922L ^ life4_3)))), ((int)(0)), ((boolean)(false)));
    }
    forestValue900073_537_0 = (((((moom.Il)(life10_26)).c)[((moom.bs)(moom.bs.EAST)).a()]) ? 1 : 0);
    }
    if (!((life6_27 != null))) {
        forestValue900073_627_0 = forestValue900073_537_0;
        break forest_join_627;
    }
    if (!((forestValue900073_537_0 != 0))) {
        break forest_join_622;
    }
    ((moom.Hw)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_124(15581, (108743466432237071L ^ life4_3)))), ((int)(5)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_125(15581, (108743466432237071L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_126(14371, (1563419156249479922L ^ life4_3)))), ((int)(4)), ((boolean)(false)));
    ((moom.Hw)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(4)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_128(14371, (1563419156249479922L ^ life4_3)))), ((int)(4)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(moom.Hw.f)), ((net.minecraft.block.state.IBlockState)(moom.Hw.f)), ((boolean)(false)));
    ((moom.Hw)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_132(14371, (1563419156249479922L ^ life4_3)))), ((int)(1)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_133(14371, (1563419156249479922L ^ life4_3)))), ((int)(3)), ((int)(2)), ((net.minecraft.block.state.IBlockState)(moom.Hw.f)), ((net.minecraft.block.state.IBlockState)(moom.Hw.f)), ((boolean)(false)));
    ((moom.Hw)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_137(14371, (1563419156249479922L ^ life4_3)))), ((int)(1)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_138(14371, (1563419156249479922L ^ life4_3)))), ((int)(3)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(moom.Hw.f)), ((net.minecraft.block.state.IBlockState)(moom.Hw.f)), ((boolean)(false)));
    }
    forestValue900073_627_0 = (((((moom.Il)(life10_26)).c)[((moom.bs)(moom.bs.WEST)).a()]) ? 1 : 0);
    }
    if (!((life6_27 != null))) {
        forestValue900073_689_0 = forestValue900073_627_0;
        break forest_join_689;
    }
    if (!((forestValue900073_627_0 != 0))) {
        break forest_join_684;
    }
    ((moom.Hw)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(5)), ((int)(3)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_146(14371, (1563419156249479922L ^ life4_3)))), ((int)(4)), ((boolean)(false)));
    ((moom.Hw)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(4)), ((int)(2)), ((int)(2)), ((int)(4)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(moom.Hw.f)), ((net.minecraft.block.state.IBlockState)(moom.Hw.f)), ((boolean)(false)));
    ((moom.Hw)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(2)), ((int)(1)), ((int)(3)), ((int)(2)), ((net.minecraft.block.state.IBlockState)(moom.Hw.f)), ((net.minecraft.block.state.IBlockState)(moom.Hw.f)), ((boolean)(false)));
    ((moom.Hw)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(5)), ((int)(1)), ((int)(3)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(moom.Hw.f)), ((net.minecraft.block.state.IBlockState)(moom.Hw.f)), ((boolean)(false)));
    }
    forestValue900073_689_0 = (((((moom.Il)(life9_20)).c)[((moom.bs)(moom.bs.NORTH)).a()]) ? 1 : 0);
    }
    if (!((life6_27 != null))) {
        forestValue900073_720_0 = forestValue900073_689_0;
        break forest_join_720;
    }
    if (!((forestValue900073_689_0 != 0))) {
        break forest_join_715;
    }
    ((moom.Hw)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_161(18134, (5912809197861270533L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_162(14371, (1563419156249479922L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_163(18134, (5912809197861270533L ^ life4_3)))), ((boolean)(false)));
    }
    forestValue900073_720_0 = (((((moom.Il)(life9_20)).c)[((moom.bs)(moom.bs.WEST)).a()]) ? 1 : 0);
    }
    if (!((life6_27 != null))) {
        forestValue900073_814_0 = forestValue900073_720_0;
        break forest_join_814;
    }
    if (!((forestValue900073_720_0 != 0))) {
        break forest_join_809;
    }
    ((moom.Hw)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_169(12743, (7340512937232302878L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_170(14371, (1563419156249479922L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_171(16468, (2446243674360148630L ^ life4_3)))), ((boolean)(false)));
    ((moom.Hw)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_173(11988, (5810421577490209806L ^ life4_3)))), ((int)(2)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_174(31838, (1230376535805841033L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hw.f)), ((net.minecraft.block.state.IBlockState)(moom.Hw.f)), ((boolean)(false)));
    ((moom.Hw)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_178(32135, (3133236355703525209L ^ life4_3)))), ((int)(1)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_179(32135, (3133236355703525209L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hw.f)), ((net.minecraft.block.state.IBlockState)(moom.Hw.f)), ((boolean)(false)));
    ((moom.Hw)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_183(28744, (5778448126748508829L ^ life4_3)))), ((int)(1)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_184(28744, (5778448126748508829L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hw.f)), ((net.minecraft.block.state.IBlockState)(moom.Hw.f)), ((boolean)(false)));
    }
    forestValue900073_814_0 = (((((moom.Il)(life9_20)).c)[((moom.bs)(moom.bs.EAST)).a()]) ? 1 : 0);
    }
    if (!((life6_27 != null))) {
        forestValue900073_932_0 = forestValue900073_814_0;
        break forest_join_932;
    }
    if (!((forestValue900073_814_0 != 0))) {
        break forest_join_931;
    }
    ((moom.Hw)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_192(15581, (108743466432237071L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_193(12743, (7340512937232302878L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_194(15581, (108743466432237071L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_195(14371, (1563419156249479922L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_196(16468, (2446243674360148630L ^ life4_3)))), ((boolean)(false)));
    ((moom.Hw)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_198(32135, (3133236355703525209L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_199(14371, (1563419156249479922L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_200(28744, (5778448126748508829L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hw.f)), ((net.minecraft.block.state.IBlockState)(moom.Hw.f)), ((boolean)(false)));
    ((moom.Hw)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_204(14371, (1563419156249479922L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_205(32135, (3133236355703525209L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_206(14371, (1563419156249479922L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_207(32135, (3133236355703525209L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hw.f)), ((net.minecraft.block.state.IBlockState)(moom.Hw.f)), ((boolean)(false)));
    ((moom.Hw)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_211(14371, (1563419156249479922L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_212(28744, (5778448126748508829L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_213(14371, (1563419156249479922L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900073_214(28744, (5778448126748508829L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hw.f)), ((net.minecraft.block.state.IBlockState)(moom.Hw.f)), ((boolean)(false)));
    }
    forestValue900073_932_0 = 1;
    }
    return ((forestValue900073_932_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_96(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_102(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_110(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_112(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_118(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_124(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_125(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_126(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_128(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_132(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_133(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_137(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_138(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_146(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_161(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_162(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_163(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_169(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_170(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_171(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_173(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_174(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_178(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_179(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_183(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_184(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_192(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_193(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_194(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_195(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_196(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_198(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_199(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_200(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_204(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_205(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_206(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_207(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_211(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_212(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_213(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900073_214(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4878_0() throws E;
}
