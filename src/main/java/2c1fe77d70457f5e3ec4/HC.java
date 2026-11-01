package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class HC extends moom.Hs {

private int p;

private static final long q;

private static final long[] r;

private static final java.lang.Integer[] t;

private static final java.util.Map z;

public HC() {
super();
}


public HC(moom.bs p0, moom.Il p1, java.util.Random p2) {
super(1, p0, p1, 1, 1, 1);
    this.p = (p2).nextInt(3);
}


static {
q = ((long)(((moom._a)(moom._c.a(((long)(7841448365680303554L)), ((long)(7353596234559089789L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(78963610274440L)))));
    z = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.HC.q ^ 125582897698608L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill809_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill809_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill809_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill809_14 = new byte[8];
    (__sourceSpill809_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill809_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation809_16 = __sourceSpill809_14;
    ((javax.crypto.Cipher)(__sourceSpill809_11)).init(((int)(__sourceSpill809_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill809_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation809_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "2P\001NÍ\026xawÌ,¶\0201_'.¸\035>"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill809_25 = local6_life21;
        int __sourceSpill809_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill809_25)).substring(((int)(__sourceSpill809_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill809_30 = local8_life19;
        int __sourceSpill809_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill809_33 = new byte[8];
        (__sourceSpill809_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill809_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill809_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill809_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill809_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill809_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill809_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill809_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill809_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill809_34)).doFinal(((byte[])(__sourceSpill809_33)));
        (__sourceSpill809_30)[__sourceSpill809_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "RT¾g]¸9Q-ùûº"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill809_38 = local6_life21;
        int __sourceSpill809_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill809_38)).substring(((int)(__sourceSpill809_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill809_43 = local8_life19;
        int __sourceSpill809_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill809_46 = new byte[8];
        (__sourceSpill809_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill809_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill809_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill809_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill809_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill809_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill809_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill809_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill809_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill809_47)).doFinal(((byte[])(__sourceSpill809_46)));
        (__sourceSpill809_43)[__sourceSpill809_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    r = ((long[])(local8_life19));
    t = ((java.lang.Integer[])(new java.lang.Integer[5]));
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x4000;
        if (t[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = r[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])z.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    z.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/HC", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            HC.t[n2] = n3;
        }
        return t[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.HC.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4729_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/HC"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
moom.Il forwardValue2057_38_0;
    moom.HC forwardValue2057_59_0;
    int forwardValue2057_65_0;
    int forwardValue2057_74_0;
    int forwardValue2057_83_0;
    int forwardValue2057_89_0;
    int forwardValue2057_94_0;
    int forwardValue2057_96_0;
    moom.HC forwardValue2057_489_0;
    moom.HC forwardValue2057_576_0;
    moom.HC forwardValue2057_647_0;
    moom.HC forwardValue2057_734_0;
    int forwardValue2057_758_0;
    int forwardValue2057_1176_0;
    int forwardValue2057_1260_0;
    int forwardValue2057_1320_0;
    int forwardValue2057_1405_0;
    int forwardValue2057_1405_1;
    int forwardValue2057_1752_0;
    int forwardValue2057_1780_0;
    int forwardValue2057_1800_0;
    int forwardValue2057_1823_0;
    int forwardValue2057_1866_0;
    moom.Il spill2057_0;
    moom.HC spill2057_1;
    int spill2057_2;
    int spill2057_3;
    moom.HC spill2057_4;
    moom.HC spill2057_5;
    moom.HC spill2057_6;
    moom.HC spill2057_7;
    int spill2057_8;
    boolean spill2057_9;
    int spill2057_10;
    boolean spill2057_11;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    int life7_138;
    forward_join_1866: {
    forward_join_1865: {
    forward_join_1823: {
    forward_join_1822: {
    forward_join_1800: {
    forward_join_1794: {
    forward_join_1780: {
    forward_join_1774: {
    forward_join_1752: {
    forward_join_1746: {
    forward_join_1405: {
    forward_join_1400: {
    forward_join_1320: {
    forward_join_1314: {
    forward_join_1260: {
    forward_join_1254: {
    forward_join_1176: {
    forward_join_1170: {
    forward_join_758: {
    forward_join_756: {
    forward_join_734: {
    forward_join_691: {
    forward_join_659: {
    forward_join_647: {
    forward_join_620: {
    forward_join_596: {
    forward_join_576: {
    forward_join_533: {
    forward_join_501: {
    forward_join_489: {
    forward_join_462: {
    forward_join_96: {
    forward_join_95: {
    forward_join_94: {
    forward_join_89: {
    forward_join_83: {
    forward_join_74: {
    forward_join_65: {
    forward_join_59: {
    forward_join_58: {
    forward_join_38: {
    forward_join_30: {
    life4_3 = (moom.HC.q ^ 123550376605684L);
    life6_5 = moom.G4.b();
    spill2057_0 = ((moom.HC)(this)).o;
    if (!((life6_5 != null))) {
        forwardValue2057_38_0 = spill2057_0;
        break forward_join_38;
    }
    if (!(((((moom.Il)(spill2057_0)).a / __sourceIntrinsic_5ac1d031d896_invokedynamic2057_4(4133, (8531714207470007050L ^ life4_3))) > 0))) {
        break forward_join_30;
    }
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((boolean)((((moom.Il)(((moom.HC)(this)).o)).c)[((moom.bs)(moom.bs.DOWN)).a()])));
    }
    spill2057_1 = this;
    if (!((life6_5 != null))) {
        forwardValue2057_59_0 = spill2057_1;
        break forward_join_59;
    }
    forwardValue2057_38_0 = (((moom.Il)(((moom.HC)(spill2057_1)).o)).b)[((moom.bs)(moom.bs.UP)).a()];
    }
    if (!((forwardValue2057_38_0 == null))) {
        break forward_join_58;
    }
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(4)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_14(10870, (8253380679577209182L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_15(11083, (3865278576098019426L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.e)));
    }
    forwardValue2057_59_0 = this;
    }
    spill2057_2 = ((moom.HC)(forwardValue2057_59_0)).p;
    if (!((life6_5 != null))) {
        forwardValue2057_65_0 = spill2057_2;
        break forward_join_65;
    }
    if (!((spill2057_2 != 0))) {
        break forward_join_95;
    }
    forwardValue2057_65_0 = ((((java.util.Random)(p1)).nextBoolean()) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue2057_74_0 = forwardValue2057_65_0;
        break forward_join_74;
    }
    if (!((forwardValue2057_65_0 != 0))) {
        break forward_join_95;
    }
    forwardValue2057_74_0 = (((((moom.Il)(((moom.HC)(this)).o)).c)[((moom.bs)(moom.bs.DOWN)).a()]) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue2057_83_0 = forwardValue2057_74_0;
        break forward_join_83;
    }
    if (!((forwardValue2057_74_0 == 0))) {
        break forward_join_95;
    }
    forwardValue2057_83_0 = (((((moom.Il)(((moom.HC)(this)).o)).c)[((moom.bs)(moom.bs.UP)).a()]) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue2057_89_0 = forwardValue2057_83_0;
        break forward_join_89;
    }
    if (!((forwardValue2057_83_0 == 0))) {
        break forward_join_95;
    }
    forwardValue2057_89_0 = ((moom.Il)(((moom.HC)(this)).o)).a();
    }
    if (!((life6_5 != null))) {
        forwardValue2057_94_0 = forwardValue2057_89_0;
        break forward_join_94;
    }
    if (!((forwardValue2057_89_0 > 1))) {
        break forward_join_95;
    }
    forwardValue2057_94_0 = 1;
    }
    forwardValue2057_96_0 = forwardValue2057_94_0;
    break forward_join_96;
    }
    forwardValue2057_96_0 = 0;
    }
    life7_138 = forwardValue2057_96_0;
    spill2057_3 = this.p;
    if (!((life6_5 != null))) {
        forwardValue2057_758_0 = spill2057_3;
        break forward_join_758;
    }
    if (!((spill2057_3 == 0))) {
        break forward_join_756;
    }
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(0)), ((int)(2)), ((int)(1)), ((int)(2)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(3)), ((int)(0)), ((int)(2)), ((int)(3)), ((int)(2)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(2)), ((int)(0)), ((int)(0)), ((int)(2)), ((int)(2)), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(2)), ((int)(0)), ((int)(2)), ((int)(2)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HC.i)), ((int)(1)), ((int)(2)), ((int)(1)), ((moom.G2)(p2)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(1)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_48(20662, (7830361031658566556L ^ life4_3)))), ((int)(1)), ((int)(2)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(3)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_52(9015, (1933839004511797276L ^ life4_3)))), ((int)(3)), ((int)(2)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_56(9015, (1933839004511797276L ^ life4_3)))), ((int)(2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_57(9015, (1933839004511797276L ^ life4_3)))), ((int)(2)), ((int)(2)), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_61(11083, (3865278576098019426L ^ life4_3)))), ((int)(2)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HC.i)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_66(11083, (3865278576098019426L ^ life4_3)))), ((int)(2)), ((int)(1)), ((moom.G2)(p2)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(5)), ((int)(2)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_68(9015, (1933839004511797276L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(3)), ((int)(5)), ((int)(2)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_72(9015, (1933839004511797276L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(2)), ((int)(5)), ((int)(0)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_76(9015, (1933839004511797276L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_80(9015, (1933839004511797276L ^ life4_3)))), ((int)(2)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_81(9015, (1933839004511797276L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HC.i)), ((int)(1)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_86(11083, (3865278576098019426L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(1)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_88(9015, (1933839004511797276L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_89(9015, (1933839004511797276L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(3)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_93(9015, (1933839004511797276L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_94(9015, (1933839004511797276L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_98(9015, (1933839004511797276L ^ life4_3)))), ((int)(2)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_99(9015, (1933839004511797276L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_100(9015, (1933839004511797276L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_104(9015, (1933839004511797276L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_105(11083, (3865278576098019426L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_106(9015, (1933839004511797276L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HC.i)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_111(11083, (3865278576098019426L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_112(11083, (3865278576098019426L ^ life4_3)))), ((moom.G2)(p2)));
    spill2057_4 = this;
    if (!((life6_5 != null))) {
        forwardValue2057_489_0 = spill2057_4;
        break forward_join_489;
    }
    if (!((((moom.Il)(((moom.HC)(spill2057_4)).o)).c)[((moom.bs)(moom.bs.SOUTH)).a()])) {
        break forward_join_462;
    }
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(3)), ((int)(0)), ((int)(4)), ((int)(3)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    if (!((life6_5 == null))) {
        break forward_join_501;
    }
    }
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(3)), ((int)(0)), ((int)(4)), ((int)(3)), ((int)(1)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(2)), ((int)(0)), ((int)(4)), ((int)(2)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((boolean)(false)));
    forwardValue2057_489_0 = this;
    }
    ((moom.HC)(forwardValue2057_489_0)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(1)), ((int)(0)), ((int)(4)), ((int)(1)), ((int)(1)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    }
    spill2057_5 = this;
    if (!((life6_5 != null))) {
        forwardValue2057_576_0 = spill2057_5;
        break forward_join_576;
    }
    if (!((((moom.Il)(((moom.HC)(spill2057_5)).o)).c)[((moom.bs)(moom.bs.NORTH)).a()])) {
        break forward_join_533;
    }
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_134(9015, (1933839004511797276L ^ life4_3)))), ((int)(4)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_135(9015, (1933839004511797276L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    if (!((life6_5 == null))) {
        break forward_join_596;
    }
    }
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_139(11083, (3865278576098019426L ^ life4_3)))), ((int)(4)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_140(9015, (1933839004511797276L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_144(9015, (1933839004511797276L ^ life4_3)))), ((int)(4)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_145(9015, (1933839004511797276L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((boolean)(false)));
    forwardValue2057_576_0 = this;
    }
    ((moom.HC)(forwardValue2057_576_0)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_149(11083, (3865278576098019426L ^ life4_3)))), ((int)(4)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_150(9015, (1933839004511797276L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    }
    spill2057_6 = this;
    if (!((life6_5 != null))) {
        forwardValue2057_647_0 = spill2057_6;
        break forward_join_647;
    }
    if (!((((moom.Il)(((moom.HC)(spill2057_6)).o)).c)[((moom.bs)(moom.bs.WEST)).a()])) {
        break forward_join_620;
    }
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(3)), ((int)(3)), ((int)(0)), ((int)(3)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    if (!((life6_5 == null))) {
        break forward_join_659;
    }
    }
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(3)), ((int)(3)), ((int)(1)), ((int)(3)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(2)), ((int)(3)), ((int)(0)), ((int)(2)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((boolean)(false)));
    forwardValue2057_647_0 = this;
    }
    ((moom.HC)(forwardValue2057_647_0)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(3)), ((int)(1)), ((int)(1)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    }
    spill2057_7 = this;
    if (!((life6_5 != null))) {
        forwardValue2057_734_0 = spill2057_7;
        break forward_join_734;
    }
    if (!((((moom.Il)(((moom.HC)(spill2057_7)).o)).c)[((moom.bs)(moom.bs.EAST)).a()])) {
        break forward_join_691;
    }
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_174(9015, (1933839004511797276L ^ life4_3)))), ((int)(3)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_175(9015, (1933839004511797276L ^ life4_3)))), ((int)(3)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    if (!((life6_5 == null))) {
        break forward_join_1822;
    }
    }
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_179(11083, (3865278576098019426L ^ life4_3)))), ((int)(3)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_180(9015, (1933839004511797276L ^ life4_3)))), ((int)(3)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_184(9015, (1933839004511797276L ^ life4_3)))), ((int)(2)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_185(9015, (1933839004511797276L ^ life4_3)))), ((int)(2)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((boolean)(false)));
    forwardValue2057_734_0 = this;
    }
    ((moom.HC)(forwardValue2057_734_0)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_189(11083, (3865278576098019426L ^ life4_3)))), ((int)(1)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_190(9015, (1933839004511797276L ^ life4_3)))), ((int)(1)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    if (!((life6_5 == null))) {
        break forward_join_1822;
    }
    }
    forwardValue2057_758_0 = this.p;
    }
    spill2057_8 = 1;
    if (!((life6_5 != null))) {
        forwardValue2057_1405_0 = forwardValue2057_758_0;
        forwardValue2057_1405_1 = spill2057_8;
        break forward_join_1405;
    }
    if (!((forwardValue2057_758_0 == spill2057_8))) {
        break forward_join_1400;
    }
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(1)), ((int)(2)), ((int)(2)), ((int)(3)), ((int)(2)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(1)), ((int)(5)), ((int)(2)), ((int)(3)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(1)), ((int)(5)), ((int)(5)), ((int)(3)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(1)), ((int)(2)), ((int)(5)), ((int)(3)), ((int)(2)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HC.i)), ((int)(2)), ((int)(2)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HC.i)), ((int)(2)), ((int)(2)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HC.i)), ((int)(5)), ((int)(2)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HC.i)), ((int)(5)), ((int)(2)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(0)), ((int)(1)), ((int)(3)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(1)), ((int)(0)), ((int)(3)), ((int)(1)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_221(9015, (1933839004511797276L ^ life4_3)))), ((int)(1)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_222(9015, (1933839004511797276L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_226(11083, (3865278576098019426L ^ life4_3)))), ((int)(0)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_227(11083, (3865278576098019426L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_231(11083, (3865278576098019426L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_232(9015, (1933839004511797276L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_233(9015, (1933839004511797276L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_234(9015, (1933839004511797276L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_238(9015, (1933839004511797276L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_239(11083, (3865278576098019426L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_240(9015, (1933839004511797276L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_241(11083, (3865278576098019426L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_245(11083, (3865278576098019426L ^ life4_3)))), ((int)(1)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_246(9015, (1933839004511797276L ^ life4_3)))), ((int)(3)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_250(9015, (1933839004511797276L ^ life4_3)))), ((int)(1)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_251(9015, (1933839004511797276L ^ life4_3)))), ((int)(3)), ((int)(1)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((int)(1)), ((int)(2)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((int)(0)), ((int)(2)), ((int)(1)), ((moom.G2)(p2)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((int)(1)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_260(9015, (1933839004511797276L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((int)(0)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_263(11083, (3865278576098019426L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_266(11083, (3865278576098019426L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_267(9015, (1933839004511797276L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_270(9015, (1933839004511797276L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_271(11083, (3865278576098019426L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_274(11083, (3865278576098019426L ^ life4_3)))), ((int)(2)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_277(9015, (1933839004511797276L ^ life4_3)))), ((int)(2)), ((int)(1)), ((moom.G2)(p2)));
    spill2057_9 = (((moom.Il)(((moom.HC)(this)).o)).c)[((moom.bs)(moom.bs.SOUTH)).a()];
    if (!((life6_5 != null))) {
        forwardValue2057_1176_0 = ((spill2057_9) ? 1 : 0);
        break forward_join_1176;
    }
    if (!((!spill2057_9))) {
        break forward_join_1170;
    }
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(3)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_284(11083, (3865278576098019426L ^ life4_3)))), ((int)(3)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_288(11083, (3865278576098019426L ^ life4_3)))), ((int)(2)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_292(11083, (3865278576098019426L ^ life4_3)))), ((int)(1)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    }
    forwardValue2057_1176_0 = (((((moom.Il)(((moom.HC)(this)).o)).c)[((moom.bs)(moom.bs.NORTH)).a()]) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue2057_1260_0 = forwardValue2057_1176_0;
        break forward_join_1260;
    }
    if (!((forwardValue2057_1176_0 == 0))) {
        break forward_join_1254;
    }
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_301(9015, (1933839004511797276L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_302(11083, (3865278576098019426L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_303(9015, (1933839004511797276L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_307(9015, (1933839004511797276L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_308(11083, (3865278576098019426L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_309(9015, (1933839004511797276L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_313(9015, (1933839004511797276L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_314(11083, (3865278576098019426L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_315(9015, (1933839004511797276L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    }
    forwardValue2057_1260_0 = (((((moom.Il)(((moom.HC)(this)).o)).c)[((moom.bs)(moom.bs.WEST)).a()]) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue2057_1320_0 = forwardValue2057_1260_0;
        break forward_join_1320;
    }
    if (!((forwardValue2057_1260_0 == 0))) {
        break forward_join_1314;
    }
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(3)), ((int)(1)), ((int)(0)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_324(11083, (3865278576098019426L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(2)), ((int)(1)), ((int)(0)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_328(11083, (3865278576098019426L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(1)), ((int)(0)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_332(11083, (3865278576098019426L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    }
    forwardValue2057_1320_0 = (((((moom.Il)(((moom.HC)(this)).o)).c)[((moom.bs)(moom.bs.EAST)).a()]) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue2057_1823_0 = forwardValue2057_1320_0;
        break forward_join_1823;
    }
    if (!((forwardValue2057_1320_0 == 0))) {
        break forward_join_1822;
    }
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_341(9015, (1933839004511797276L ^ life4_3)))), ((int)(3)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_342(9015, (1933839004511797276L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_343(11083, (3865278576098019426L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_347(9015, (1933839004511797276L ^ life4_3)))), ((int)(2)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_348(9015, (1933839004511797276L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_349(11083, (3865278576098019426L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_353(9015, (1933839004511797276L ^ life4_3)))), ((int)(1)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_354(9015, (1933839004511797276L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_355(11083, (3865278576098019426L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    if (!((life6_5 == null))) {
        break forward_join_1822;
    }
    }
    spill2057_10 = this.p;
    if (!((life6_5 != null))) {
        forwardValue2057_1823_0 = spill2057_10;
        break forward_join_1823;
    }
    forwardValue2057_1405_0 = spill2057_10;
    forwardValue2057_1405_1 = 2;
    }
    if (!((forwardValue2057_1405_0 == forwardValue2057_1405_1))) {
        break forward_join_1822;
    }
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(0)), ((int)(0)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_360(9015, (1933839004511797276L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_364(9015, (1933839004511797276L ^ life4_3)))), ((int)(1)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_365(9015, (1933839004511797276L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_366(9015, (1933839004511797276L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_370(11083, (3865278576098019426L ^ life4_3)))), ((int)(1)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_374(9015, (1933839004511797276L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_375(11083, (3865278576098019426L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_376(9015, (1933839004511797276L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(2)), ((int)(0)), ((int)(0)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_380(9015, (1933839004511797276L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.g)), ((net.minecraft.block.state.IBlockState)(moom.HC.g)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_384(9015, (1933839004511797276L ^ life4_3)))), ((int)(2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_385(9015, (1933839004511797276L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_386(9015, (1933839004511797276L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.g)), ((net.minecraft.block.state.IBlockState)(moom.HC.g)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_390(11083, (3865278576098019426L ^ life4_3)))), ((int)(2)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(moom.HC.g)), ((net.minecraft.block.state.IBlockState)(moom.HC.g)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_394(9015, (1933839004511797276L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_395(11083, (3865278576098019426L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_396(9015, (1933839004511797276L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.g)), ((net.minecraft.block.state.IBlockState)(moom.HC.g)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(3)), ((int)(0)), ((int)(0)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_400(9015, (1933839004511797276L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_404(9015, (1933839004511797276L ^ life4_3)))), ((int)(3)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_405(9015, (1933839004511797276L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_406(9015, (1933839004511797276L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(3)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_410(11083, (3865278576098019426L ^ life4_3)))), ((int)(3)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_414(9015, (1933839004511797276L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_415(11083, (3865278576098019426L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_416(9015, (1933839004511797276L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(3)), ((int)(0)), ((int)(2)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(moom.HC.g)), ((net.minecraft.block.state.IBlockState)(moom.HC.g)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_423(9015, (1933839004511797276L ^ life4_3)))), ((int)(1)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_424(9015, (1933839004511797276L ^ life4_3)))), ((int)(2)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(moom.HC.g)), ((net.minecraft.block.state.IBlockState)(moom.HC.g)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(1)), ((int)(0)), ((int)(4)), ((int)(2)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(moom.HC.g)), ((net.minecraft.block.state.IBlockState)(moom.HC.g)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_431(9015, (1933839004511797276L ^ life4_3)))), ((int)(4)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_432(9015, (1933839004511797276L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HC.g)), ((net.minecraft.block.state.IBlockState)(moom.HC.g)), ((boolean)(false)));
    spill2057_11 = (((moom.Il)(((moom.HC)(this)).o)).c)[((moom.bs)(moom.bs.SOUTH)).a()];
    if (!((life6_5 != null))) {
        forwardValue2057_1752_0 = ((spill2057_11) ? 1 : 0);
        break forward_join_1752;
    }
    if (!(spill2057_11)) {
        break forward_join_1746;
    }
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(1)), ((int)(0)), ((int)(4)), ((int)(2)), ((int)(0)), ((boolean)(false)));
    }
    forwardValue2057_1752_0 = (((((moom.Il)(((moom.HC)(this)).o)).c)[((moom.bs)(moom.bs.NORTH)).a()]) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue2057_1780_0 = forwardValue2057_1752_0;
        break forward_join_1780;
    }
    if (!((forwardValue2057_1752_0 != 0))) {
        break forward_join_1774;
    }
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_447(9015, (1933839004511797276L ^ life4_3)))), ((int)(4)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_448(9015, (1933839004511797276L ^ life4_3)))), ((boolean)(false)));
    }
    forwardValue2057_1780_0 = (((((moom.Il)(((moom.HC)(this)).o)).c)[((moom.bs)(moom.bs.WEST)).a()]) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue2057_1800_0 = forwardValue2057_1780_0;
        break forward_join_1800;
    }
    if (!((forwardValue2057_1780_0 != 0))) {
        break forward_join_1794;
    }
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(3)), ((int)(0)), ((int)(2)), ((int)(4)), ((boolean)(false)));
    }
    forwardValue2057_1800_0 = (((((moom.Il)(((moom.HC)(this)).o)).c)[((moom.bs)(moom.bs.EAST)).a()]) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue2057_1823_0 = forwardValue2057_1800_0;
        break forward_join_1823;
    }
    if (!((forwardValue2057_1800_0 != 0))) {
        break forward_join_1822;
    }
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_461(9015, (1933839004511797276L ^ life4_3)))), ((int)(1)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2057_462(9015, (1933839004511797276L ^ life4_3)))), ((int)(2)), ((int)(4)), ((boolean)(false)));
    }
    forwardValue2057_1823_0 = life7_138;
    }
    if (!((life6_5 != null))) {
        forwardValue2057_1866_0 = forwardValue2057_1823_0;
        break forward_join_1866;
    }
    if (!((forwardValue2057_1823_0 != 0))) {
        break forward_join_1865;
    }
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(1)), ((int)(3)), ((int)(4)), ((int)(1)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(2)), ((int)(3)), ((int)(4)), ((int)(2)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((net.minecraft.block.state.IBlockState)(moom.HC.e)), ((boolean)(false)));
    ((moom.HC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(3)), ((int)(3)), ((int)(4)), ((int)(3)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((net.minecraft.block.state.IBlockState)(moom.HC.f)), ((boolean)(false)));
    }
    forwardValue2057_1866_0 = 1;
    }
    return ((forwardValue2057_1866_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4729_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_88(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_93(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_99(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_100(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_104(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_106(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_112(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_134(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_135(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_139(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_140(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_144(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_145(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_149(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_150(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_174(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_175(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_179(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_180(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_184(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_185(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_189(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_190(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_221(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_222(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_226(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_227(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_231(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_232(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_233(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_234(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_238(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_239(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_240(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_241(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_245(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_246(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_250(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_251(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_260(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_263(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_266(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_267(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_270(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_271(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_274(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_277(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_284(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_288(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_292(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_301(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_302(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_303(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_307(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_308(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_309(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_313(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_314(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_315(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_324(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_328(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_332(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_341(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_342(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_343(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_347(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_348(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_349(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_353(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_354(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_355(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_360(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_364(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_365(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_366(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_370(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_374(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_375(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_376(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_380(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_384(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_385(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_386(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_390(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_394(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_395(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_396(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_400(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_404(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_405(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_406(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_410(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_414(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_415(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_416(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_423(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_424(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_431(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_432(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_447(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_448(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_461(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2057_462(int a0, long a1) throws E;
}
