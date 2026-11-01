package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class HA extends moom.Hs {

private static final long p;

private static final long[] q;

private static final java.lang.Integer[] r;

private static final java.util.Map t;

public HA() {
super();
}


public HA(moom.bs p0, moom.Il p1, java.util.Random p2) {
super(1, p0, p1, 2, 2, 2);
}


static {
p = ((long)(((moom._a)(moom._c.a(((long)(7605229151211475582L)), ((long)(1768227527541022445L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(2513420309082L)))));
    t = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.HA.p ^ 118809789052858L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill807_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill807_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill807_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill807_14 = new byte[8];
    (__sourceSpill807_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill807_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation807_16 = __sourceSpill807_14;
    ((javax.crypto.Cipher)(__sourceSpill807_11)).init(((int)(__sourceSpill807_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill807_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation807_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[18];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\032\002o\026­^\027ÀM¶½hé:i§Gº&ò\017\034þDw¢%ÆÄ[Ê\177¨)Õ\025å;þ\t0ÙPîë.¬u!A³F\024¢Ùwp;¥Y\020ÍEæS\022\027ÖSB¿ÓâÎíÄßü \001Oc´´{@6\013Ðo¤\bÔpßOÐ\007¸ÏÈÌ*d;\006_Õ\036"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill807_25 = local6_life21;
        int __sourceSpill807_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill807_25)).substring(((int)(__sourceSpill807_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill807_30 = local8_life19;
        int __sourceSpill807_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill807_33 = new byte[8];
        (__sourceSpill807_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill807_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill807_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill807_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill807_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill807_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill807_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill807_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill807_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill807_34)).doFinal(((byte[])(__sourceSpill807_33)));
        (__sourceSpill807_30)[__sourceSpill807_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "qqé\027l\026u)C»VÀx"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill807_38 = local6_life21;
        int __sourceSpill807_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill807_38)).substring(((int)(__sourceSpill807_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill807_43 = local8_life19;
        int __sourceSpill807_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill807_46 = new byte[8];
        (__sourceSpill807_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill807_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill807_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill807_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill807_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill807_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill807_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill807_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill807_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill807_47)).doFinal(((byte[])(__sourceSpill807_46)));
        (__sourceSpill807_43)[__sourceSpill807_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    q = ((long[])(local8_life19));
    r = ((java.lang.Integer[])(new java.lang.Integer[18]));
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x5B97;
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
                throw new RuntimeException("moom/HA", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            HA.r[n2] = n3;
        }
        return r[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.HA.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4725_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/HA"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
net.minecraft.block.state.IBlockState forestValue276_153_0;
    int forestValue276_155_0;
    int forestValue276_427_0;
    int forestValue276_427_1;
    int forestValue276_1200_0;
    net.minecraft.entity.Entity[] spill276_0;
    net.minecraft.block.state.IBlockState spill276_1;
    int spill276_2;
    int spill276_3;
    int spill276_4;
    int spill276_5;
    int spill276_6;
    int spill276_7;
    int spill276_8;
    long life4_3;
    int life7_36;
    net.minecraft.block.state.IBlockState life8_38;
    int life7_125;
    net.minecraft.entity.Entity[] life6_126;
    net.minecraft.block.state.IBlockState life8_140;
    int life9_168;
    int life7_391;
    int life9_411;
    int life9_469;
    forest_join_1200: {
    forest_join_483: {
    forest_join_427: {
    forest_join_306: {
    life4_3 = (moom.HA.p ^ 10341204349226L);
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_1(14399, (1765541440394068105L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_2(29505, (432638598880939005L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_3(4844, (4596375519989246550L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_4(32087, (7371628785958372844L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HA.e)));
    life7_36 = __sourceIntrinsic_5ac1d031d896_invokedynamic276_7(9626, (1882179217720450350L ^ life4_3));
    life8_38 = moom.HA.f;
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(life7_36)), ((int)(0)), ((int)(0)), ((int)(life7_36)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_9(11401, (1083478950240916517L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(life8_38)), ((net.minecraft.block.state.IBlockState)(life8_38)), ((boolean)(false)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_11(19845, (5532857602583295291L ^ life4_3)))), ((int)(life7_36)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_12(19845, (5532857602583295291L ^ life4_3)))), ((int)(life7_36)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_13(19845, (5532857602583295291L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(life8_38)), ((net.minecraft.block.state.IBlockState)(life8_38)), ((boolean)(false)));
    spill276_0 = moom.G4.b();
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(life7_36)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_16(19845, (5532857602583295291L ^ life4_3)))), ((int)(life7_36)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(life8_38)), ((net.minecraft.block.state.IBlockState)(life8_38)), ((boolean)(false)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(life7_36)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_18(19845, (5532857602583295291L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_19(32087, (7371628785958372844L ^ life4_3)))), ((int)(life7_36)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_20(19845, (5532857602583295291L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(life8_38)), ((net.minecraft.block.state.IBlockState)(life8_38)), ((boolean)(false)));
    life7_125 = 1;
    life6_126 = spill276_0;
    forest_cycle_127: while (true) {
    forest_join_304: {
    forest_join_223: {
    forest_join_155: {
    forest_join_154: {
    forest_join_153: {
    forest_join_152: {
    if (!((life7_125 <= __sourceIntrinsic_5ac1d031d896_invokedynamic276_22(5994, (5168701369686372306L ^ life4_3))))) {
        break forest_join_306;
    }
    spill276_1 = moom.HA.f;
    if (!((life6_126 != null))) {
        forestValue276_153_0 = spill276_1;
        break forest_join_153;
    }
    life8_140 = spill276_1;
    spill276_2 = life7_125;
    spill276_3 = 2;
    if (!((life6_126 != null))) {
        forestValue276_427_0 = spill276_2;
        forestValue276_427_1 = spill276_3;
        break forest_join_427;
    }
    if (!((spill276_2 != spill276_3))) {
        break forest_join_152;
    }
    spill276_4 = life7_125;
    if (!((life6_126 != null))) {
        forestValue276_155_0 = spill276_4;
        break forest_join_155;
    }
    if (!((spill276_4 == __sourceIntrinsic_5ac1d031d896_invokedynamic276_24(15002, (4204355838450958895L ^ life4_3))))) {
        break forest_join_154;
    }
    }
    forestValue276_153_0 = moom.HA.e;
    }
    life8_140 = forestValue276_153_0;
    }
    forestValue276_155_0 = 0;
    }
    life9_168 = forestValue276_155_0;
    forest_cycle_156: while (true) {
    if (!((life9_168 <= __sourceIntrinsic_5ac1d031d896_invokedynamic276_26(19845, (5532857602583295291L ^ life4_3))))) {
        break forest_join_223;
    }
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(life9_168)), ((int)(life7_125)), ((int)(0)), ((int)(life9_168)), ((int)(life7_125)), ((int)(1)), ((net.minecraft.block.state.IBlockState)(life8_140)), ((net.minecraft.block.state.IBlockState)(life8_140)), ((boolean)(false)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(life9_168)), ((int)(life7_125)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_28(15002, (4204355838450958895L ^ life4_3)))), ((int)(life9_168)), ((int)(life7_125)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_29(27877, (4878440090725831762L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(life8_140)), ((net.minecraft.block.state.IBlockState)(life8_140)), ((boolean)(false)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(life9_168)), ((int)(life7_125)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_31(32087, (7371628785958372844L ^ life4_3)))), ((int)(life9_168)), ((int)(life7_125)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_32(19845, (5532857602583295291L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(life8_140)), ((net.minecraft.block.state.IBlockState)(life8_140)), ((boolean)(false)));
    life9_168 += 15;
    if (!((life6_126 != null))) {
        break forest_join_304;
    }
    if (!((life6_126 == null))) {
        continue forest_cycle_156;
    }
    break forest_cycle_156;
    }
    }
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(life7_125)), ((int)(0)), ((int)(1)), ((int)(life7_125)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(life8_140)), ((net.minecraft.block.state.IBlockState)(life8_140)), ((boolean)(false)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_35(15002, (4204355838450958895L ^ life4_3)))), ((int)(life7_125)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_36(29948, (2305421184216550465L ^ life4_3)))), ((int)(life7_125)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(life8_140)), ((net.minecraft.block.state.IBlockState)(life8_140)), ((boolean)(false)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_38(32087, (7371628785958372844L ^ life4_3)))), ((int)(life7_125)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_39(32087, (7371628785958372844L ^ life4_3)))), ((int)(life7_125)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(life8_140)), ((net.minecraft.block.state.IBlockState)(life8_140)), ((boolean)(false)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(life7_125)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_41(19845, (5532857602583295291L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_42(32087, (7371628785958372844L ^ life4_3)))), ((int)(life7_125)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_43(19845, (5532857602583295291L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(life8_140)), ((net.minecraft.block.state.IBlockState)(life8_140)), ((boolean)(false)));
    life7_125 += 1;
    }
    if (!((life6_126 == null))) {
        continue forest_cycle_127;
    }
    break forest_cycle_127;
    }
    }
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_45(15002, (4204355838450958895L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_46(15002, (4204355838450958895L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_47(29948, (2305421184216550465L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_48(15002, (4204355838450958895L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_49(29948, (2305421184216550465L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HA.g)), ((net.minecraft.block.state.IBlockState)(moom.HA.g)), ((boolean)(false)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_53(7385, (1167159184738198633L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_54(7385, (1167159184738198633L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_55(4844, (4596375519989246550L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_56(4844, (4596375519989246550L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.R)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.R)).a__fE())), ((boolean)(false)));
    life7_391 = 3;
    forest_cycle_372: while (true) {
    forest_join_424: {
    forest_join_423: {
    if (!((life7_391 <= __sourceIntrinsic_5ac1d031d896_invokedynamic276_62(15002, (4204355838450958895L ^ life4_3))))) {
        break forest_join_483;
    }
    spill276_5 = __sourceIntrinsic_5ac1d031d896_invokedynamic276_63(15002, (4204355838450958895L ^ life4_3));
    if (!((life6_126 != null))) {
        forestValue276_1200_0 = spill276_5;
        break forest_join_1200;
    }
    life9_411 = spill276_5;
    forest_cycle_387: while (true) {
    if (!((life9_411 <= __sourceIntrinsic_5ac1d031d896_invokedynamic276_64(29948, (2305421184216550465L ^ life4_3))))) {
        break forest_join_423;
    }
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HA.i)), ((int)(life9_411)), ((int)(life7_391)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_66(15002, (4204355838450958895L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HA.i)), ((int)(life9_411)), ((int)(life7_391)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_69(29948, (2305421184216550465L ^ life4_3)))), ((moom.G2)(p2)));
    life9_411 += 3;
    if (!((life6_126 != null))) {
        break forest_join_424;
    }
    if (!((life6_126 == null))) {
        continue forest_cycle_387;
    }
    break forest_cycle_387;
    }
    }
    life7_391 += 3;
    }
    if (!((life6_126 == null))) {
        continue forest_cycle_372;
    }
    break forest_cycle_372;
    }
    break forest_join_483;
    }
    forest_cycle_427: while (true) {
    forest_join_476: {
    forest_join_473: {
    forest_join_472: {
    if (!((forestValue276_427_0 <= forestValue276_427_1))) {
        break forest_join_483;
    }
    spill276_6 = __sourceIntrinsic_5ac1d031d896_invokedynamic276_71(15002, (4204355838450958895L ^ life4_3));
    if (!((life6_126 != null))) {
        forestValue276_1200_0 = spill276_6;
        break forest_join_1200;
    }
    life9_469 = spill276_6;
    forest_cycle_436: while (true) {
    if (!((life9_469 <= __sourceIntrinsic_5ac1d031d896_invokedynamic276_72(29948, (2305421184216550465L ^ life4_3))))) {
        break forest_join_472;
    }
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HA.i)), ((int)(life9_469)), ((int)(life7_125)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_74(15002, (4204355838450958895L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HA.i)), ((int)(life9_469)), ((int)(life7_125)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_77(29948, (2305421184216550465L ^ life4_3)))), ((moom.G2)(p2)));
    life9_469 += 3;
    if (!((life6_126 != null))) {
        break forest_join_473;
    }
    if (!((life6_126 == null))) {
        continue forest_cycle_436;
    }
    break forest_cycle_436;
    }
    }
    life7_125 += 3;
    }
    if (!((life6_126 == null))) {
        break forest_join_476;
    }
    break forest_join_483;
    }
    spill276_7 = life7_125;
    spill276_8 = __sourceIntrinsic_5ac1d031d896_invokedynamic276_79(15002, (4204355838450958895L ^ life4_3));
    forestValue276_427_0 = spill276_7;
    forestValue276_427_1 = spill276_8;
    continue forest_cycle_427;
    }
    }
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_80(15002, (4204355838450958895L ^ life4_3)))), ((int)(5)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_81(15002, (4204355838450958895L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((boolean)(false)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_85(29948, (2305421184216550465L ^ life4_3)))), ((int)(5)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_86(29948, (2305421184216550465L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((boolean)(false)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_90(31826, (4536021559414179040L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_91(15002, (4204355838450958895L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_92(29201, (6171597220060646050L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_93(15002, (4204355838450958895L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((boolean)(false)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_97(29201, (6171597220060646050L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_98(29948, (2305421184216550465L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_99(29201, (6171597220060646050L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_100(29948, (2305421184216550465L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((boolean)(false)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_104(15002, (4204355838450958895L ^ life4_3)))), ((int)(1)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_105(15002, (4204355838450958895L ^ life4_3)))), ((int)(2)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((boolean)(false)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_109(29948, (2305421184216550465L ^ life4_3)))), ((int)(1)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_110(29948, (2305421184216550465L ^ life4_3)))), ((int)(2)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((boolean)(false)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_114(15002, (4204355838450958895L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_115(29201, (6171597220060646050L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_116(15002, (4204355838450958895L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_117(29201, (6171597220060646050L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((boolean)(false)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_121(29948, (2305421184216550465L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_122(29201, (6171597220060646050L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_123(29948, (2305421184216550465L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_124(29201, (6171597220060646050L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((boolean)(false)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(2)), ((int)(5)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_128(15002, (4204355838450958895L ^ life4_3)))), ((int)(5)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((boolean)(false)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_132(29201, (6171597220060646050L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_133(15002, (4204355838450958895L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_134(29201, (6171597220060646050L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((boolean)(false)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_138(29201, (6171597220060646050L ^ life4_3)))), ((int)(2)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_139(29201, (6171597220060646050L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_140(15002, (4204355838450958895L ^ life4_3)))), ((int)(5)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((boolean)(false)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_144(29201, (6171597220060646050L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_145(29201, (6171597220060646050L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_146(29201, (6171597220060646050L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_147(15002, (4204355838450958895L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_148(29201, (6171597220060646050L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((boolean)(false)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_152(7385, (1167159184738198633L ^ life4_3)))), ((int)(1)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_153(7385, (1167159184738198633L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_154(15002, (4204355838450958895L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((boolean)(false)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_158(29201, (6171597220060646050L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_159(7385, (1167159184738198633L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_160(29201, (6171597220060646050L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_161(7385, (1167159184738198633L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_162(15002, (4204355838450958895L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((boolean)(false)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_166(7385, (1167159184738198633L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_167(29948, (2305421184216550465L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_168(7385, (1167159184738198633L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_169(32087, (7371628785958372844L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((boolean)(false)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_173(29201, (6171597220060646050L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_174(7385, (1167159184738198633L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_175(29948, (2305421184216550465L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_176(29201, (6171597220060646050L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_177(7385, (1167159184738198633L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_178(32087, (7371628785958372844L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((boolean)(false)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_182(7385, (1167159184738198633L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_183(15002, (4204355838450958895L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_184(7385, (1167159184738198633L ^ life4_3)))), ((int)(5)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((boolean)(false)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_188(7385, (1167159184738198633L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_189(29201, (6171597220060646050L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_190(15002, (4204355838450958895L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_191(7385, (1167159184738198633L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_192(29201, (6171597220060646050L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((boolean)(false)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_196(29948, (2305421184216550465L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_197(7385, (1167159184738198633L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_198(32087, (7371628785958372844L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_199(7385, (1167159184738198633L ^ life4_3)))), ((int)(5)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((boolean)(false)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_203(29948, (2305421184216550465L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_204(7385, (1167159184738198633L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_205(29201, (6171597220060646050L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_206(32087, (7371628785958372844L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_207(7385, (1167159184738198633L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_208(29201, (6171597220060646050L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((boolean)(false)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(1)), ((int)(2)), ((int)(2)), ((int)(1)), ((int)(3)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((boolean)(false)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(1)), ((int)(2)), ((int)(3)), ((int)(1)), ((int)(2)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((boolean)(false)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_218(28623, (8024107569103525730L ^ life4_3)))), ((int)(1)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_219(2177, (4436316222533578814L ^ life4_3)))), ((int)(1)), ((int)(3)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((boolean)(false)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_223(26374, (6663946524519980983L ^ life4_3)))), ((int)(1)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_224(16731, (8286914667155159522L ^ life4_3)))), ((int)(1)), ((int)(2)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((boolean)(false)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_228(16731, (8286914667155159522L ^ life4_3)))), ((int)(2)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_229(2177, (4436316222533578814L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((boolean)(false)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_233(2177, (4436316222533578814L ^ life4_3)))), ((int)(3)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_234(2177, (4436316222533578814L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((boolean)(false)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_238(2177, (4436316222533578814L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_239(16731, (8286914667155159522L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_240(2177, (4436316222533578814L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_241(2177, (4436316222533578814L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((boolean)(false)));
    ((moom.HA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_245(16731, (8286914667155159522L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_246(2177, (4436316222533578814L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_247(16731, (8286914667155159522L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic276_248(2177, (4436316222533578814L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((net.minecraft.block.state.IBlockState)(moom.HA.f)), ((boolean)(false)));
    forestValue276_1200_0 = 1;
    }
    return ((forestValue276_1200_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_92(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_93(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_97(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_99(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_100(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_104(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_110(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_115(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_116(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_117(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_121(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_122(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_123(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_124(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_128(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_132(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_133(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_134(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_138(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_139(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_140(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_144(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_145(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_146(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_147(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_148(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_152(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_153(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_154(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_158(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_159(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_160(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_161(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_162(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_166(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_167(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_168(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_169(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_173(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_174(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_175(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_176(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_177(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_178(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_182(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_183(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_184(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_188(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_189(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_190(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_191(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_192(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_196(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_197(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_198(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_199(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_203(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_204(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_205(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_206(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_207(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_208(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_218(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_219(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_223(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_224(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_228(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_229(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_233(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_234(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_238(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_239(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_240(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_241(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_245(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_246(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_247(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic276_248(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4725_0() throws E;
}
