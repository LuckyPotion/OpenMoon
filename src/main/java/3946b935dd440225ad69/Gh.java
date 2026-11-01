package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Gh extends moom.FY {

private static final moom.fI c;

private final net.minecraft.block.state.IBlockState d;

private final net.minecraft.block.state.IBlockState e;

private final net.minecraft.block.state.IBlockState f;

private static final long g;

private static final long[] h;

private static final java.lang.Integer[] i;

private static final java.util.Map j;

public Gh() {
super();
    this.d = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.U)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.ej.S)), ((java.lang.Comparable)(net.minecraft.block.BlockStoneSlab$EnumType.SAND))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.ei.Q)), ((java.lang.Comparable)(moom.ak.BOTTOM)))));
    this.e = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE()));
    this.f = ((net.minecraft.block.state.IBlockState)(((moom.dM)(net.minecraft.init.Blocks.i)).a__fE()));
    return;
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(-1087635281198390735L)), ((long)(5200298324424081249L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(273293466662771L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Gh.g ^ 61828946471085L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill560_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill560_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill560_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill560_14 = new byte[8];
    (__sourceSpill560_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill560_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation560_16 = __sourceSpill560_14;
    ((javax.crypto.Cipher)(__sourceSpill560_11)).init(((int)(__sourceSpill560_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill560_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation560_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "l~rê\031Ý£°\016]\006T³9+"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill560_25 = local6_life21;
        int __sourceSpill560_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill560_25)).substring(((int)(__sourceSpill560_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill560_30 = local8_life19;
        int __sourceSpill560_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill560_33 = new byte[8];
        (__sourceSpill560_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill560_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill560_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill560_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill560_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill560_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill560_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill560_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill560_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill560_34)).doFinal(((byte[])(__sourceSpill560_33)));
        (__sourceSpill560_30)[__sourceSpill560_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    h = ((long[])(local8_life19));
    i = ((java.lang.Integer[])(new java.lang.Integer[2]));
    c = ((moom.fI)(((moom.fI)(moom.fI.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.m))))).a(((net.minecraft.block.properties.IProperty)(moom.dx.R)), ((com.google.common.base.Predicate)(com.google.common.base.Predicates.equalTo(((java.lang.Object)(moom.ab.SAND))))))));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4678_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Gh"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Gh.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x250C;
        if (i[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = h[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])j.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    j.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Gh", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Gh.i[n2] = n3;
        }
        return i[n2];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
int forestValue272_28_0;
    int forestValue272_38_0;
    int forestValue272_40_0;
    int forestValue272_76_0;
    int forestValue272_88_0;
    int forestValue272_90_0;
    int forestValue272_92_0;
    int forestValue272_143_0;
    int forestValue272_172_0;
    int forestValue272_175_0;
    int forestValue272_175_1;
    int forestValue272_227_0;
    int forestValue272_287_0;
    int forestValue272_289_0;
    int forestValue272_331_0;
    int forestValue272_339_0;
    int forestValue272_393_0;
    int spill272_0;
    int spill272_1;
    boolean spill272_2;
    int spill272_3;
    int spill272_4;
    boolean spill272_5;
    int spill272_6;
    int spill272_7;
    int spill272_8;
    int spill272_9;
    int spill272_10;
    int spill272_11;
    int spill272_12;
    int spill272_13;
    int spill272_14;
    boolean spill272_15;
    long life4_3;
    int[] life6_5;
    int life7_41;
    int life8_52;
    int life7_96;
    int life8_106;
    int life9_117;
    java.util.Iterator life7_153;
    moom.bs life8_160;
    int life7_180;
    int life8_191;
    int life7_303;
    int life8_310;
    int life7_360;
    forest_join_393: {
    forest_join_392: {
    forest_join_339: {
    forest_join_338: {
    forest_join_287: {
    forest_join_234: {
    forest_join_172: {
    forest_join_167: {
    forest_join_143: {
    forest_join_137: {
    forest_join_90: {
    forest_join_89: {
    forest_join_88: {
    forest_join_87: {
    forest_join_38: {
    forest_join_33: {
    forest_join_28: {
    forest_join_23: {
    life4_3 = (moom.Gh.g ^ 17211734362913L);
    life6_5 = moom.FY.b();
    forest_cycle_6: while (true) {
    if (!(((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(p2))))) {
        break forest_join_23;
    }
    spill272_0 = ((moom.DT)(p2)).b();
    if (!((life6_5 != null))) {
        forestValue272_28_0 = spill272_0;
        break forest_join_28;
    }
    if (!((life6_5 != null))) {
        forestValue272_28_0 = spill272_0;
        break forest_join_28;
    }
    if (!((spill272_0 > 2))) {
        break forest_join_23;
    }
    p2 = ((moom.DT)(p2)).b__DT();
    if (!((life6_5 == null))) {
        continue forest_cycle_6;
    }
    break forest_cycle_6;
    }
    }
    forestValue272_28_0 = ((((moom.fI)(moom.Gh.c)).a(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p2))))))) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forestValue272_38_0 = forestValue272_28_0;
        break forest_join_38;
    }
    if (!((forestValue272_28_0 == 0))) {
        break forest_join_33;
    }
    return ((0) != 0);
    }
    forestValue272_38_0 = __sourceIntrinsic_e7ba66b54646_invokedynamic272_10(19489, (2529628430918937683L ^ life4_3));
    }
    life7_41 = forestValue272_38_0;
    forest_cycle_39: while (true) {
    forest_join_83: {
    forestValue272_40_0 = life7_41;
    forest_cycle_40: while (true) {
    if (!((forestValue272_40_0 <= 2))) {
        break forest_join_89;
    }
    spill272_1 = __sourceIntrinsic_e7ba66b54646_invokedynamic272_11(31256, (1303840906811628139L ^ life4_3));
    if (!((life6_5 != null))) {
        forestValue272_90_0 = spill272_1;
        break forest_join_90;
    }
    life8_52 = spill272_1;
    forest_cycle_50: while (true) {
    forest_join_80: {
    forest_join_76: {
    if (!((life8_52 <= 2))) {
        break forest_join_83;
    }
    spill272_2 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(((moom.DT)(p2)).a(((int)(life7_41)), ((int)(-1)), ((int)(life8_52))))));
    if (!((life6_5 != null))) {
        forestValue272_40_0 = ((spill272_2) ? 1 : 0);
        continue forest_cycle_40;
    }
    if (!((life6_5 != null))) {
        forestValue272_76_0 = ((spill272_2) ? 1 : 0);
        break forest_join_76;
    }
    if (!(spill272_2)) {
        break forest_join_80;
    }
    forestValue272_76_0 = ((((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(((moom.DT)(p2)).a(((int)(life7_41)), ((int)(__sourceIntrinsic_e7ba66b54646_invokedynamic272_16(31256, (1303840906811628139L ^ life4_3)))), ((int)(life8_52))))))) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forestValue272_88_0 = forestValue272_76_0;
        break forest_join_88;
    }
    if (!((forestValue272_76_0 != 0))) {
        break forest_join_80;
    }
    break forest_join_87;
    }
    life8_52 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_50;
    }
    break forest_cycle_50;
    }
    break forest_cycle_40;
    }
    }
    life7_41 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_39;
    }
    break forest_cycle_39;
    }
    break forest_join_89;
    }
    forestValue272_88_0 = 0;
    }
    return ((forestValue272_88_0) != 0);
    }
    forestValue272_90_0 = -1;
    }
    life7_96 = forestValue272_90_0;
    forest_cycle_91: while (true) {
    forest_join_134: {
    forestValue272_92_0 = life7_96;
    forest_cycle_92: while (true) {
    if (!((forestValue272_92_0 <= 0))) {
        break forest_join_137;
    }
    spill272_3 = __sourceIntrinsic_e7ba66b54646_invokedynamic272_21(31256, (1303840906811628139L ^ life4_3));
    if (!((life6_5 != null))) {
        forestValue272_143_0 = spill272_3;
        break forest_join_143;
    }
    life8_106 = spill272_3;
    forest_cycle_101: while (true) {
    forest_join_132: {
    forest_join_131: {
    if (!((life8_106 <= 2))) {
        break forest_join_134;
    }
    spill272_4 = __sourceIntrinsic_e7ba66b54646_invokedynamic272_22(31256, (1303840906811628139L ^ life4_3));
    if (!((life6_5 != null))) {
        forestValue272_92_0 = spill272_4;
        continue forest_cycle_92;
    }
    life9_117 = spill272_4;
    forest_cycle_112: while (true) {
    if (!((life9_117 <= 2))) {
        break forest_join_131;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.DT)(p2)).a(((int)(life8_106)), ((int)(life7_96)), ((int)(life9_117))))), ((net.minecraft.block.state.IBlockState)(this.e)), ((int)(2)));
    life9_117 += 1;
    if (!((life6_5 != null))) {
        break forest_join_132;
    }
    if (!((life6_5 == null))) {
        continue forest_cycle_112;
    }
    break forest_cycle_112;
    }
    }
    life8_106 += 1;
    }
    if (!((life6_5 == null))) {
        continue forest_cycle_101;
    }
    break forest_cycle_101;
    }
    break forest_cycle_92;
    }
    }
    life7_96 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_91;
    }
    break forest_cycle_91;
    }
    }
    forestValue272_143_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(this.f)), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue272_143_0);
    life7_153 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).iterator();
    forest_cycle_147: while (true) {
    if (!(((java.util.Iterator)(life7_153)).hasNext())) {
        break forest_join_167;
    }
    life8_160 = ((moom.bs)(((java.util.Iterator)(life7_153)).next()));
    spill272_5 = ((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.DT)(p2)).a(((moom.bs)(life8_160))))), ((net.minecraft.block.state.IBlockState)(this.f)), ((int)(2)));
    if (!((life6_5 != null))) {
        forestValue272_172_0 = ((spill272_5) ? 1 : 0);
        break forest_join_172;
    }
    recovery.source.CarrierOps.discard(spill272_5);
    if (!((life6_5 == null))) {
        continue forest_cycle_147;
    }
    break forest_cycle_147;
    }
    }
    forestValue272_172_0 = __sourceIntrinsic_e7ba66b54646_invokedynamic272_40(31256, (1303840906811628139L ^ life4_3));
    }
    life7_180 = forestValue272_172_0;
    forest_cycle_173: while (true) {
    forest_join_231: {
    forestValue272_175_0 = life7_180;
    forestValue272_175_1 = 2;
    forest_cycle_175: while (true) {
    if (!((forestValue272_175_0 <= forestValue272_175_1))) {
        break forest_join_234;
    }
    spill272_6 = __sourceIntrinsic_e7ba66b54646_invokedynamic272_41(31256, (1303840906811628139L ^ life4_3));
    if (!((life6_5 != null))) {
        forestValue272_287_0 = spill272_6;
        break forest_join_287;
    }
    life8_191 = spill272_6;
    forest_cycle_184: while (true) {
    forest_join_228: {
    forest_join_227: {
    forest_join_217: {
    if (!((life8_191 <= 2))) {
        break forest_join_231;
    }
    spill272_7 = life7_180;
    if (!((life6_5 != null))) {
        forestValue272_227_0 = spill272_7;
        break forest_join_227;
    }
    spill272_8 = __sourceIntrinsic_e7ba66b54646_invokedynamic272_42(31256, (1303840906811628139L ^ life4_3));
    if (!((life6_5 != null))) {
        forestValue272_175_0 = spill272_7;
        forestValue272_175_1 = spill272_8;
        continue forest_cycle_175;
    }
    if (!((spill272_7 != spill272_8))) {
        break forest_join_217;
    }
    spill272_9 = life7_180;
    if (!((life6_5 != null))) {
        forestValue272_227_0 = spill272_9;
        break forest_join_227;
    }
    if (!((spill272_9 != 2))) {
        break forest_join_217;
    }
    spill272_10 = life8_191;
    if (!((life6_5 != null))) {
        forestValue272_227_0 = spill272_10;
        break forest_join_227;
    }
    if (!((spill272_10 != __sourceIntrinsic_e7ba66b54646_invokedynamic272_43(31256, (1303840906811628139L ^ life4_3))))) {
        break forest_join_217;
    }
    spill272_11 = life8_191;
    if (!((life6_5 != null))) {
        forestValue272_227_0 = spill272_11;
        break forest_join_227;
    }
    if (!((spill272_11 == 2))) {
        break forest_join_228;
    }
    }
    forestValue272_227_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.DT)(p2)).a(((int)(life7_180)), ((int)(1)), ((int)(life8_191))))), ((net.minecraft.block.state.IBlockState)(this.e)), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue272_227_0);
    }
    life8_191 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_184;
    }
    break forest_cycle_184;
    }
    break forest_cycle_175;
    }
    }
    life7_180 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_173;
    }
    break forest_cycle_173;
    }
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.DT)(p2)).a(((int)(2)), ((int)(1)), ((int)(0))))), ((net.minecraft.block.state.IBlockState)(this.d)), ((int)(2)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.DT)(p2)).a(((int)(__sourceIntrinsic_e7ba66b54646_invokedynamic272_52(31256, (1303840906811628139L ^ life4_3)))), ((int)(1)), ((int)(0))))), ((net.minecraft.block.state.IBlockState)(this.d)), ((int)(2)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.DT)(p2)).a(((int)(0)), ((int)(1)), ((int)(2))))), ((net.minecraft.block.state.IBlockState)(this.d)), ((int)(2)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.DT)(p2)).a(((int)(0)), ((int)(1)), ((int)(__sourceIntrinsic_e7ba66b54646_invokedynamic272_59(31256, (1303840906811628139L ^ life4_3))))))), ((net.minecraft.block.state.IBlockState)(this.d)), ((int)(2)));
    forestValue272_287_0 = -1;
    }
    life7_303 = forestValue272_287_0;
    forest_cycle_288: while (true) {
    forest_join_335: {
    forestValue272_289_0 = life7_303;
    forest_cycle_289: while (true) {
    if (!((forestValue272_289_0 <= 1))) {
        break forest_join_338;
    }
    spill272_12 = -1;
    if (!((life6_5 != null))) {
        forestValue272_339_0 = spill272_12;
        break forest_join_339;
    }
    life8_310 = spill272_12;
    forest_cycle_295: while (true) {
    forest_join_332: {
    forest_join_331: {
    forest_join_321: {
    if (!((life8_310 <= 1))) {
        break forest_join_335;
    }
    spill272_13 = life7_303;
    if (!((life6_5 != null))) {
        forestValue272_289_0 = spill272_13;
        continue forest_cycle_289;
    }
    if (!((life6_5 != null))) {
        forestValue272_331_0 = spill272_13;
        break forest_join_331;
    }
    if (!((spill272_13 == 0))) {
        break forest_join_321;
    }
    spill272_14 = life8_310;
    if (!((life6_5 != null))) {
        forestValue272_331_0 = spill272_14;
        break forest_join_331;
    }
    if (!((spill272_14 == 0))) {
        break forest_join_321;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.DT)(p2)).a(((int)(life7_303)), ((int)(4)), ((int)(life8_310))))), ((net.minecraft.block.state.IBlockState)(this.e)), ((int)(2)));
    if (!((life6_5 == null))) {
        break forest_join_332;
    }
    }
    forestValue272_331_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.DT)(p2)).a(((int)(life7_303)), ((int)(4)), ((int)(life8_310))))), ((net.minecraft.block.state.IBlockState)(this.d)), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue272_331_0);
    }
    life8_310 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_295;
    }
    break forest_cycle_295;
    }
    break forest_cycle_289;
    }
    }
    life7_303 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_288;
    }
    break forest_cycle_288;
    }
    }
    forestValue272_339_0 = 1;
    }
    life7_360 = forestValue272_339_0;
    forest_cycle_340: while (true) {
    if (!((life7_360 <= 3))) {
        break forest_join_392;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.DT)(p2)).a(((int)(-1)), ((int)(life7_360)), ((int)(-1))))), ((net.minecraft.block.state.IBlockState)(this.e)), ((int)(2)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.DT)(p2)).a(((int)(-1)), ((int)(life7_360)), ((int)(1))))), ((net.minecraft.block.state.IBlockState)(this.e)), ((int)(2)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.DT)(p2)).a(((int)(1)), ((int)(life7_360)), ((int)(-1))))), ((net.minecraft.block.state.IBlockState)(this.e)), ((int)(2)));
    spill272_15 = ((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.DT)(p2)).a(((int)(1)), ((int)(life7_360)), ((int)(1))))), ((net.minecraft.block.state.IBlockState)(this.e)), ((int)(2)));
    if (!((life6_5 != null))) {
        forestValue272_393_0 = ((spill272_15) ? 1 : 0);
        break forest_join_393;
    }
    recovery.source.CarrierOps.discard(spill272_15);
    life7_360 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_340;
    }
    break forest_cycle_340;
    }
    }
    forestValue272_393_0 = 1;
    }
    return ((forestValue272_393_0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4678_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic272_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic272_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic272_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic272_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic272_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic272_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic272_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic272_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic272_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic272_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic272_59(int a0, long a1) throws E;
}
