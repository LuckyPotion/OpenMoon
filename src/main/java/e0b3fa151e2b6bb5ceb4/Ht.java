package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Ht extends moom.Hs {

private static final long p;

private static final long[] q;

private static final java.lang.Integer[] r;

private static final java.util.Map t;

public Ht() {
super();
}


public Ht(moom.bs p0, moom.Il p1, java.util.Random p2) {
super(1, p0, p1, 2, 1, 1);
}


static {
p = ((long)(((moom._a)(moom._c.a(((long)(7423470638692085389L)), ((long)(6414183599335232001L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(173613326919415L)))));
    t = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Ht.p ^ 61493940284293L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill846_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill846_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill846_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill846_14 = new byte[8];
    (__sourceSpill846_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill846_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation846_16 = __sourceSpill846_14;
    ((javax.crypto.Cipher)(__sourceSpill846_11)).init(((int)(__sourceSpill846_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill846_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation846_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[19];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "¨VÛ[ìV@\035\177%iÝ\023æÐzP\037Â¦\033[NH$#æöò\002³a@\n\030¦\026õvàï\n¤ÌñÉà \024,âÀ©Õ¹ûK3Bù$YÔ\"ë)ü²\tÈOÆÛïÕg9¥A¹´fú\023È^tf\004\007ë¿1MYu'6¼\025õk\001}£AáBCÖ03!L¬23°\036íX©"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill846_25 = local6_life21;
        int __sourceSpill846_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill846_25)).substring(((int)(__sourceSpill846_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill846_30 = local8_life19;
        int __sourceSpill846_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill846_33 = new byte[8];
        (__sourceSpill846_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill846_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill846_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill846_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill846_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill846_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill846_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill846_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill846_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill846_34)).doFinal(((byte[])(__sourceSpill846_33)));
        (__sourceSpill846_30)[__sourceSpill846_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "JeR\032È'x^[Sé*V"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill846_38 = local6_life21;
        int __sourceSpill846_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill846_38)).substring(((int)(__sourceSpill846_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill846_43 = local8_life19;
        int __sourceSpill846_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill846_46 = new byte[8];
        (__sourceSpill846_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill846_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill846_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill846_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill846_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill846_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill846_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill846_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill846_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill846_47)).doFinal(((byte[])(__sourceSpill846_46)));
        (__sourceSpill846_43)[__sourceSpill846_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    q = ((long[])(local8_life19));
    r = ((java.lang.Integer[])(new java.lang.Integer[19]));
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x68CD;
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
                throw new RuntimeException("moom/Ht", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Ht.r[n2] = n3;
        }
        return r[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Ht.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4872_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Ht"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
moom.Il forwardValue2158_59_0;
    moom.Il forwardValue2158_86_0;
    moom.Il forwardValue2158_444_0;
    int forwardValue2158_467_0;
    int forwardValue2158_494_0;
    int forwardValue2158_513_0;
    int forwardValue2158_540_0;
    int forwardValue2158_575_0;
    int forwardValue2158_598_0;
    net.minecraft.entity.Entity[] spill2158_0;
    moom.Il spill2158_1;
    boolean spill2158_2;
    long life4_3;
    moom.Il life7_10;
    moom.Il life8_14;
    net.minecraft.entity.Entity[] life6_15;
    forward_join_598: {
    forward_join_597: {
    forward_join_575: {
    forward_join_570: {
    forward_join_540: {
    forward_join_535: {
    forward_join_513: {
    forward_join_508: {
    forward_join_494: {
    forward_join_489: {
    forward_join_467: {
    forward_join_462: {
    forward_join_444: {
    forward_join_112: {
    forward_join_86: {
    forward_join_81: {
    forward_join_59: {
    forward_join_54: {
    life4_3 = (moom.Ht.p ^ 53663723487449L);
    life7_10 = (((moom.Il)(((moom.Ht)(this)).o)).b)[((moom.bs)(moom.bs.EAST)).a()];
    spill2158_0 = moom.G4.b();
    life8_14 = ((moom.Ht)(this)).o;
    life6_15 = spill2158_0;
    spill2158_1 = ((moom.Ht)(this)).o;
    if (!((life6_15 != null))) {
        forwardValue2158_59_0 = spill2158_1;
        break forward_join_59;
    }
    if (!(((((moom.Il)(spill2158_1)).a / __sourceIntrinsic_5ac1d031d896_invokedynamic2158_9(17865, (67026227364908590L ^ life4_3))) > 0))) {
        break forward_join_54;
    }
    ((moom.Ht)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_10(32147, (8282614998516987514L ^ life4_3)))), ((int)(0)), ((boolean)((((moom.Il)(life7_10)).c)[((moom.bs)(moom.bs.DOWN)).a()])));
    ((moom.Ht)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((boolean)((((moom.Il)(life8_14)).c)[((moom.bs)(moom.bs.DOWN)).a()])));
    }
    forwardValue2158_59_0 = (((moom.Il)(life8_14)).b)[((moom.bs)(moom.bs.UP)).a()];
    }
    if (!((life6_15 != null))) {
        forwardValue2158_86_0 = forwardValue2158_59_0;
        break forward_join_86;
    }
    if (!((forwardValue2158_59_0 == null))) {
        break forward_join_81;
    }
    ((moom.Ht)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(4)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_22(27595, (5323088074423951395L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_23(4967, (2720011935638788241L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Ht.e)));
    }
    forwardValue2158_86_0 = (((moom.Il)(life7_10)).b)[((moom.bs)(moom.bs.UP)).a()];
    }
    if (!((life6_15 != null))) {
        forwardValue2158_444_0 = forwardValue2158_86_0;
        break forward_join_444;
    }
    if (!((forwardValue2158_86_0 == null))) {
        break forward_join_112;
    }
    ((moom.Ht)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_29(28592, (6947912069325087824L ^ life4_3)))), ((int)(4)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_30(17410, (8598005457961439204L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_31(22466, (4454927400886000687L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Ht.e)));
    }
    ((moom.Ht)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(3)), ((int)(0)), ((int)(0)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_34(26151, (5949475246515056083L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Ht.f)), ((net.minecraft.block.state.IBlockState)(moom.Ht.f)), ((boolean)(false)));
    ((moom.Ht)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_38(20636, (214235456097540989L ^ life4_3)))), ((int)(3)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_39(12201, (4358876038932341854L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_40(26151, (5949475246515056083L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Ht.f)), ((net.minecraft.block.state.IBlockState)(moom.Ht.f)), ((boolean)(false)));
    ((moom.Ht)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(3)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_44(12201, (4358876038932341854L ^ life4_3)))), ((int)(3)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(moom.Ht.f)), ((net.minecraft.block.state.IBlockState)(moom.Ht.f)), ((boolean)(false)));
    ((moom.Ht)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_48(26151, (5949475246515056083L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_49(27168, (8259495769110536651L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_50(26151, (5949475246515056083L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Ht.f)), ((net.minecraft.block.state.IBlockState)(moom.Ht.f)), ((boolean)(false)));
    ((moom.Ht)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(2)), ((int)(0)), ((int)(0)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_54(26151, (5949475246515056083L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Ht.e)), ((net.minecraft.block.state.IBlockState)(moom.Ht.e)), ((boolean)(false)));
    ((moom.Ht)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_58(12201, (4358876038932341854L ^ life4_3)))), ((int)(2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_59(12201, (4358876038932341854L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_60(26151, (5949475246515056083L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Ht.e)), ((net.minecraft.block.state.IBlockState)(moom.Ht.e)), ((boolean)(false)));
    ((moom.Ht)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_64(12201, (4358876038932341854L ^ life4_3)))), ((int)(2)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(moom.Ht.e)), ((net.minecraft.block.state.IBlockState)(moom.Ht.e)), ((boolean)(false)));
    ((moom.Ht)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_68(26151, (5949475246515056083L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_69(27168, (8259495769110536651L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_70(26151, (5949475246515056083L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Ht.e)), ((net.minecraft.block.state.IBlockState)(moom.Ht.e)), ((boolean)(false)));
    ((moom.Ht)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(0)), ((int)(0)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_74(26151, (5949475246515056083L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Ht.f)), ((net.minecraft.block.state.IBlockState)(moom.Ht.f)), ((boolean)(false)));
    ((moom.Ht)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_78(12201, (4358876038932341854L ^ life4_3)))), ((int)(1)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_79(12201, (4358876038932341854L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_80(26151, (5949475246515056083L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Ht.f)), ((net.minecraft.block.state.IBlockState)(moom.Ht.f)), ((boolean)(false)));
    ((moom.Ht)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_84(12201, (4358876038932341854L ^ life4_3)))), ((int)(1)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(moom.Ht.f)), ((net.minecraft.block.state.IBlockState)(moom.Ht.f)), ((boolean)(false)));
    ((moom.Ht)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_88(26151, (5949475246515056083L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_89(27168, (8259495769110536651L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_90(26151, (5949475246515056083L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Ht.f)), ((net.minecraft.block.state.IBlockState)(moom.Ht.f)), ((boolean)(false)));
    ((moom.Ht)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(1)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_94(29653, (4799260619857164351L ^ life4_3)))), ((int)(1)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(moom.Ht.f)), ((net.minecraft.block.state.IBlockState)(moom.Ht.f)), ((boolean)(false)));
    ((moom.Ht)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_98(22466, (4454927400886000687L ^ life4_3)))), ((int)(2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_99(23962, (943520149131679348L ^ life4_3)))), ((int)(2)), ((int)(3)), ((net.minecraft.block.state.IBlockState)(moom.Ht.e)), ((net.minecraft.block.state.IBlockState)(moom.Ht.e)), ((boolean)(false)));
    ((moom.Ht)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(3)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_103(853, (7973102957290621113L ^ life4_3)))), ((int)(3)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(moom.Ht.f)), ((net.minecraft.block.state.IBlockState)(moom.Ht.f)), ((boolean)(false)));
    ((moom.Ht)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Ht.i)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_108(22466, (4454927400886000687L ^ life4_3)))), ((int)(2)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.Ht)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Ht.i)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_111(13222, (2979804504436848709L ^ life4_3)))), ((int)(2)), ((int)(3)), ((moom.G2)(p2)));
    forwardValue2158_444_0 = life8_14;
    }
    spill2158_2 = (((moom.Il)(forwardValue2158_444_0)).c)[((moom.bs)(moom.bs.SOUTH)).a()];
    if (!((life6_15 != null))) {
        forwardValue2158_467_0 = ((spill2158_2) ? 1 : 0);
        break forward_join_467;
    }
    if (!(spill2158_2)) {
        break forward_join_462;
    }
    ((moom.Ht)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(1)), ((int)(0)), ((int)(4)), ((int)(2)), ((int)(0)), ((boolean)(false)));
    }
    forwardValue2158_467_0 = (((((moom.Il)(life8_14)).c)[((moom.bs)(moom.bs.NORTH)).a()]) ? 1 : 0);
    }
    if (!((life6_15 != null))) {
        forwardValue2158_494_0 = forwardValue2158_467_0;
        break forward_join_494;
    }
    if (!((forwardValue2158_467_0 != 0))) {
        break forward_join_489;
    }
    ((moom.Ht)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_122(26151, (5949475246515056083L ^ life4_3)))), ((int)(4)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_123(26151, (5949475246515056083L ^ life4_3)))), ((boolean)(false)));
    }
    forwardValue2158_494_0 = (((((moom.Il)(life8_14)).c)[((moom.bs)(moom.bs.WEST)).a()]) ? 1 : 0);
    }
    if (!((life6_15 != null))) {
        forwardValue2158_513_0 = forwardValue2158_494_0;
        break forward_join_513;
    }
    if (!((forwardValue2158_494_0 != 0))) {
        break forward_join_508;
    }
    ((moom.Ht)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(3)), ((int)(0)), ((int)(2)), ((int)(4)), ((boolean)(false)));
    }
    forwardValue2158_513_0 = (((((moom.Il)(life7_10)).c)[((moom.bs)(moom.bs.SOUTH)).a()]) ? 1 : 0);
    }
    if (!((life6_15 != null))) {
        forwardValue2158_540_0 = forwardValue2158_513_0;
        break forward_join_540;
    }
    if (!((forwardValue2158_513_0 != 0))) {
        break forward_join_535;
    }
    ((moom.Ht)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_134(25723, (3683521098297274271L ^ life4_3)))), ((int)(1)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_135(5751, (7018855344722320789L ^ life4_3)))), ((int)(2)), ((int)(0)), ((boolean)(false)));
    }
    forwardValue2158_540_0 = (((((moom.Il)(life7_10)).c)[((moom.bs)(moom.bs.NORTH)).a()]) ? 1 : 0);
    }
    if (!((life6_15 != null))) {
        forwardValue2158_575_0 = forwardValue2158_540_0;
        break forward_join_575;
    }
    if (!((forwardValue2158_540_0 != 0))) {
        break forward_join_570;
    }
    ((moom.Ht)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_141(20561, (7444761046333971390L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_142(26151, (5949475246515056083L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_143(9487, (509960879716445930L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_144(26151, (5949475246515056083L ^ life4_3)))), ((boolean)(false)));
    }
    forwardValue2158_575_0 = (((((moom.Il)(life7_10)).c)[((moom.bs)(moom.bs.EAST)).a()]) ? 1 : 0);
    }
    if (!((life6_15 != null))) {
        forwardValue2158_598_0 = forwardValue2158_575_0;
        break forward_join_598;
    }
    if (!((forwardValue2158_575_0 != 0))) {
        break forward_join_597;
    }
    ((moom.Ht)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_150(12201, (4358876038932341854L ^ life4_3)))), ((int)(1)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2158_151(12201, (4358876038932341854L ^ life4_3)))), ((int)(2)), ((int)(4)), ((boolean)(false)));
    }
    forwardValue2158_598_0 = 1;
    }
    return ((forwardValue2158_598_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4872_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_88(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_99(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_108(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_122(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_123(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_134(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_135(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_141(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_142(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_143(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_144(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_150(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2158_151(int a0, long a1) throws E;
}
