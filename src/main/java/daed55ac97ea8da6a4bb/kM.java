package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class kM {

private final float[] a;

private final int[] b;

private static final long c;

private static final long[] d;

private static final java.lang.Integer[] e;

private static final java.util.Map f;

public kM() {
this(null);
    return;
}


public kM(moom.kK p0) {
super();
    this.a = new float[4];
    this.b = new int[4];
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-4096473900560740520L)), ((long)(-8917908786686663516L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(44544506159129L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.kM.c ^ 103758039216695L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1363_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1363_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1363_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1363_14 = new byte[8];
    (__sourceSpill1363_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1363_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1363_16 = __sourceSpill1363_14;
    ((javax.crypto.Cipher)(__sourceSpill1363_11)).init(((int)(__sourceSpill1363_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1363_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1363_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[10];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\000á$l\177éîB¼Ïhb£¦&Mixg&\027\003êÊjÒã´u÷¯v\nsËßçÌîí\\Ç«²±ym²x$Îø>\021\005yÄ8\013"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1363_25 = local6_life21;
        int __sourceSpill1363_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1363_25)).substring(((int)(__sourceSpill1363_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1363_30 = local8_life19;
        int __sourceSpill1363_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1363_33 = new byte[8];
        (__sourceSpill1363_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1363_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1363_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1363_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1363_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1363_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1363_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1363_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1363_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1363_34)).doFinal(((byte[])(__sourceSpill1363_33)));
        (__sourceSpill1363_30)[__sourceSpill1363_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "Á\025Ù×Ï\035V\036\017ÓëkÊ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1363_38 = local6_life21;
        int __sourceSpill1363_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1363_38)).substring(((int)(__sourceSpill1363_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1363_43 = local8_life19;
        int __sourceSpill1363_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1363_46 = new byte[8];
        (__sourceSpill1363_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1363_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1363_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1363_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1363_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1363_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1363_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1363_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1363_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1363_47)).doFinal(((byte[])(__sourceSpill1363_46)));
        (__sourceSpill1363_43)[__sourceSpill1363_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[10]));
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.kM.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x6D07;
        if (e[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l5 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l5 >>> 56), (byte)(l5 >>> 48), (byte)(l5 >>> 40), (byte)(l5 >>> 32), (byte)(l5 >>> 24), (byte)(l5 >>> 16), (byte)(l5 >>> 8), (byte)l5};
            Long l6 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l6);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    f.put(l6, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/kM", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            kM.e[n2] = n4;
        }
        return e[n2];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8225_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/kM"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a() {
long local1_life2 = (moom.kM.c ^ 46552292935092L);
    int local3_life5 = __sourceIntrinsic_2c8ae721fed4_originalDynamicSite688_4(16996, (4039892613586059691L ^ local1_life2));
    int[] __stackOp688_7_0 = this.b;
    int __stackOp688_7_1 = 0;
    (__stackOp688_7_0)[__stackOp688_7_1] = ((__stackOp688_7_0)[__stackOp688_7_1] | local3_life5);
    int[] __stackOp688_9_0 = this.b;
    int __stackOp688_9_1 = 1;
    (__stackOp688_9_0)[__stackOp688_9_1] = ((__stackOp688_9_0)[__stackOp688_9_1] | local3_life5);
    int[] __stackOp688_11_0 = this.b;
    int __stackOp688_11_1 = 2;
    (__stackOp688_11_0)[__stackOp688_11_1] = ((__stackOp688_11_0)[__stackOp688_11_1] | local3_life5);
    int[] __stackOp688_13_0 = this.b;
    int __stackOp688_13_1 = 3;
    (__stackOp688_13_0)[__stackOp688_13_1] = ((__stackOp688_13_0)[__stackOp688_13_1] | local3_life5);
    (this.a)[0] = 0x1.0p0f;
    (this.a)[1] = 0x1.0p0f;
    (this.a)[2] = 0x1.0p0f;
    (this.a)[3] = 0x1.0p0f;
    return;
}


public void a(net.minecraft.world.IBlockAccess p0, net.minecraft.block.Block p1, moom.DT p2, moom.bs p3, float[] p4, java.util.BitSet p5) {
moom.DT forwardValue3708_13_0;
    float forwardValue3708_276_0;
    long life7_3;
    moom.DT life9_15;
    net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo life10_18;
    moom.DT life11_25;
    moom.DT life12_32;
    moom.DT life13_39;
    moom.DT life14_46;
    int life15_51;
    int life16_56;
    int life17_61;
    int life18_66;
    float life19_73;
    float life20_80;
    float life21_87;
    float life22_94;
    int life23_102;
    int life24_110;
    int life25_118;
    int life26_126;
    float life27_135;
    int life28_137;
    moom.DT life29_145;
    float life30_166;
    int life29_168;
    moom.DT life31_176;
    float life32_197;
    int life31_199;
    moom.DT life33_207;
    float life34_228;
    int life33_230;
    moom.DT life35_238;
    int life35_255;
    float life36_295;
    float life36_298;
    moom.aC life37_301;
    float life38_321;
    float life39_331;
    float life40_341;
    float life41_351;
    float life42_367;
    float life43_383;
    float life44_399;
    float life45_423;
    float life46_439;
    float life47_455;
    float life48_471;
    float life49_495;
    float life50_511;
    float life51_527;
    float life52_543;
    float life53_567;
    float life54_583;
    float life55_599;
    float life56_615;
    float life57_639;
    int life58_726;
    int life59_733;
    int life60_740;
    int life61_747;
    float life38_818;
    float life39_828;
    float life40_838;
    float life41_848;
    forward_join_895: {
    forward_join_787: {
    forward_join_276: {
    forward_join_271: {
    forward_join_261: {
    forward_join_254: {
    forward_join_237: {
    forward_join_218: {
    forward_join_209: {
    forward_join_190: {
    forward_join_181: {
    forward_join_162: {
    forward_join_153: {
    forward_join_134: {
    forward_join_13: {
    forward_join_12: {
    life7_3 = (moom.kM.c ^ 36609695743548L);
    if (!(((java.util.BitSet)(p5)).get(((int)(0))))) {
        break forward_join_12;
    }
    forwardValue3708_13_0 = ((moom.DT)(p2)).a(((moom.bs)(p3)));
    break forward_join_13;
    }
    forwardValue3708_13_0 = p2;
    }
    life9_15 = forwardValue3708_13_0;
    life10_18 = net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo.a(((moom.bs)(p3)));
    life11_25 = ((moom.DT)(life9_15)).a(((moom.bs)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).a)[0])));
    life12_32 = ((moom.DT)(life9_15)).a(((moom.bs)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).a)[1])));
    life13_39 = ((moom.DT)(life9_15)).a(((moom.bs)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).a)[2])));
    life14_46 = ((moom.DT)(life9_15)).a(((moom.bs)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).a)[3])));
    life15_51 = ((net.minecraft.block.Block)(p1)).a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(life11_25)));
    life16_56 = ((net.minecraft.block.Block)(p1)).a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(life12_32)));
    life17_61 = ((net.minecraft.block.Block)(p1)).a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(life13_39)));
    life18_66 = ((net.minecraft.block.Block)(p1)).a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(life14_46)));
    life19_73 = moom.kK.a(((float)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(life11_25))))).a__ch())).a__Float())));
    life20_80 = moom.kK.a(((float)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(life12_32))))).a__ch())).a__Float())));
    life21_87 = moom.kK.a(((float)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(life13_39))))).a__ch())).a__Float())));
    life22_94 = moom.kK.a(((float)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(life14_46))))).a__ch())).a__Float())));
    life23_102 = ((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(life11_25)).a(((moom.bs)(p3)))))))).a__ch())).b__Boolean()) ? 1 : 0);
    life24_110 = ((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(life12_32)).a(((moom.bs)(p3)))))))).a__ch())).b__Boolean()) ? 1 : 0);
    life25_118 = ((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(life13_39)).a(((moom.bs)(p3)))))))).a__ch())).b__Boolean()) ? 1 : 0);
    life26_126 = ((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(life14_46)).a(((moom.bs)(p3)))))))).a__ch())).b__Boolean()) ? 1 : 0);
    if (!((life25_118 == 0))) {
        break forward_join_134;
    }
    if (!((life23_102 == 0))) {
        break forward_join_134;
    }
    life27_135 = life19_73;
    life28_137 = life15_51;
    break forward_join_153;
    }
    life29_145 = ((moom.DT)(life11_25)).a(((moom.bs)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).a)[2])));
    life27_135 = moom.kK.a(((float)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(life29_145))))).a__ch())).a__Float())));
    life28_137 = ((net.minecraft.block.Block)(p1)).a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(life29_145)));
    }
    if (!((life26_126 == 0))) {
        break forward_join_162;
    }
    if (!((life23_102 == 0))) {
        break forward_join_162;
    }
    life30_166 = life19_73;
    life29_168 = life15_51;
    break forward_join_181;
    }
    life31_176 = ((moom.DT)(life11_25)).a(((moom.bs)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).a)[3])));
    life30_166 = moom.kK.a(((float)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(life31_176))))).a__ch())).a__Float())));
    life29_168 = ((net.minecraft.block.Block)(p1)).a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(life31_176)));
    }
    if (!((life25_118 == 0))) {
        break forward_join_190;
    }
    if (!((life24_110 == 0))) {
        break forward_join_190;
    }
    life32_197 = life20_80;
    life31_199 = life16_56;
    break forward_join_209;
    }
    life33_207 = ((moom.DT)(life12_32)).a(((moom.bs)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).a)[2])));
    life32_197 = moom.kK.a(((float)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(life33_207))))).a__ch())).a__Float())));
    life31_199 = ((net.minecraft.block.Block)(p1)).a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(life33_207)));
    }
    if (!((life26_126 == 0))) {
        break forward_join_218;
    }
    if (!((life24_110 == 0))) {
        break forward_join_218;
    }
    life34_228 = life20_80;
    life33_230 = life16_56;
    break forward_join_237;
    }
    life35_238 = ((moom.DT)(life12_32)).a(((moom.bs)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).a)[3])));
    life34_228 = moom.kK.a(((float)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(life35_238))))).a__ch())).a__Float())));
    life33_230 = ((net.minecraft.block.Block)(p1)).a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(life35_238)));
    }
    life35_255 = ((net.minecraft.block.Block)(p1)).a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p2)));
    if (!((!((java.util.BitSet)(p5)).get(((int)(0)))))) {
        break forward_join_254;
    }
    if (!((!((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).a(((moom.bs)(p3)))))))).a__ch())).j()))) {
        break forward_join_261;
    }
    }
    life35_255 = ((net.minecraft.block.Block)(p1)).a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p2)).a(((moom.bs)(p3))))));
    }
    if (!(((java.util.BitSet)(p5)).get(((int)(0))))) {
        break forward_join_271;
    }
    forwardValue3708_276_0 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(life9_15))))).a__ch())).a__Float();
    break forward_join_276;
    }
    forwardValue3708_276_0 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p2))))).a__ch())).a__Float();
    }
    life36_295 = forwardValue3708_276_0;
    life36_298 = moom.kK.a(((float)(life36_295)));
    life37_301 = moom.aC.a(((moom.bs)(p3)));
    if (!(((java.util.BitSet)(p5)).get(((int)(1))))) {
        break forward_join_787;
    }
    if (!(((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).c)) {
        break forward_join_787;
    }
    life38_321 = ((((life22_94 + life19_73) + life30_166) + life36_298) * 0x1.0p-2f);
    life39_331 = ((((life21_87 + life19_73) + life27_135) + life36_298) * 0x1.0p-2f);
    life40_341 = ((((life21_87 + life20_80) + life32_197) + life36_298) * 0x1.0p-2f);
    life41_351 = ((((life22_94 + life20_80) + life34_228) + life36_298) * 0x1.0p-2f);
    life42_367 = ((p4)[((net.minecraft.client.renderer.BlockModelRenderer$Orientation)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).d)[0])).a] * (p4)[((net.minecraft.client.renderer.BlockModelRenderer$Orientation)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).d)[1])).a]);
    life43_383 = ((p4)[((net.minecraft.client.renderer.BlockModelRenderer$Orientation)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).d)[2])).a] * (p4)[((net.minecraft.client.renderer.BlockModelRenderer$Orientation)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).d)[3])).a]);
    life44_399 = ((p4)[((net.minecraft.client.renderer.BlockModelRenderer$Orientation)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).d)[4])).a] * (p4)[((net.minecraft.client.renderer.BlockModelRenderer$Orientation)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).d)[5])).a]);
    life45_423 = ((p4)[((net.minecraft.client.renderer.BlockModelRenderer$Orientation)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).d)[__sourceIntrinsic_51e88cd5fa12_invokedynamic3708_112(28031, (8163727280942028091L ^ life7_3))])).a] * (p4)[((net.minecraft.client.renderer.BlockModelRenderer$Orientation)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).d)[__sourceIntrinsic_51e88cd5fa12_invokedynamic3708_115(15, (3262494868486715470L ^ life7_3))])).a]);
    life46_439 = ((p4)[((net.minecraft.client.renderer.BlockModelRenderer$Orientation)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).e)[0])).a] * (p4)[((net.minecraft.client.renderer.BlockModelRenderer$Orientation)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).e)[1])).a]);
    life47_455 = ((p4)[((net.minecraft.client.renderer.BlockModelRenderer$Orientation)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).e)[2])).a] * (p4)[((net.minecraft.client.renderer.BlockModelRenderer$Orientation)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).e)[3])).a]);
    life48_471 = ((p4)[((net.minecraft.client.renderer.BlockModelRenderer$Orientation)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).e)[4])).a] * (p4)[((net.minecraft.client.renderer.BlockModelRenderer$Orientation)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).e)[5])).a]);
    life49_495 = ((p4)[((net.minecraft.client.renderer.BlockModelRenderer$Orientation)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).e)[__sourceIntrinsic_51e88cd5fa12_invokedynamic3708_130(27437, (1261576503033664366L ^ life7_3))])).a] * (p4)[((net.minecraft.client.renderer.BlockModelRenderer$Orientation)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).e)[__sourceIntrinsic_51e88cd5fa12_invokedynamic3708_133(1424, (4016570059452218832L ^ life7_3))])).a]);
    life50_511 = ((p4)[((net.minecraft.client.renderer.BlockModelRenderer$Orientation)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).f)[0])).a] * (p4)[((net.minecraft.client.renderer.BlockModelRenderer$Orientation)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).f)[1])).a]);
    life51_527 = ((p4)[((net.minecraft.client.renderer.BlockModelRenderer$Orientation)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).f)[2])).a] * (p4)[((net.minecraft.client.renderer.BlockModelRenderer$Orientation)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).f)[3])).a]);
    life52_543 = ((p4)[((net.minecraft.client.renderer.BlockModelRenderer$Orientation)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).f)[4])).a] * (p4)[((net.minecraft.client.renderer.BlockModelRenderer$Orientation)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).f)[5])).a]);
    life53_567 = ((p4)[((net.minecraft.client.renderer.BlockModelRenderer$Orientation)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).f)[__sourceIntrinsic_51e88cd5fa12_invokedynamic3708_148(27437, (1261576503033664366L ^ life7_3))])).a] * (p4)[((net.minecraft.client.renderer.BlockModelRenderer$Orientation)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).f)[__sourceIntrinsic_51e88cd5fa12_invokedynamic3708_151(1424, (4016570059452218832L ^ life7_3))])).a]);
    life54_583 = ((p4)[((net.minecraft.client.renderer.BlockModelRenderer$Orientation)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).g)[0])).a] * (p4)[((net.minecraft.client.renderer.BlockModelRenderer$Orientation)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).g)[1])).a]);
    life55_599 = ((p4)[((net.minecraft.client.renderer.BlockModelRenderer$Orientation)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).g)[2])).a] * (p4)[((net.minecraft.client.renderer.BlockModelRenderer$Orientation)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).g)[3])).a]);
    life56_615 = ((p4)[((net.minecraft.client.renderer.BlockModelRenderer$Orientation)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).g)[4])).a] * (p4)[((net.minecraft.client.renderer.BlockModelRenderer$Orientation)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).g)[5])).a]);
    life57_639 = ((p4)[((net.minecraft.client.renderer.BlockModelRenderer$Orientation)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).g)[__sourceIntrinsic_51e88cd5fa12_invokedynamic3708_166(27437, (1261576503033664366L ^ life7_3))])).a] * (p4)[((net.minecraft.client.renderer.BlockModelRenderer$Orientation)((((net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo)(life10_18)).g)[__sourceIntrinsic_51e88cd5fa12_invokedynamic3708_169(1424, (4016570059452218832L ^ life7_3))])).a]);
    (this.a)[((moom.aC)(life37_301)).a] = ((((life38_321 * life42_367) + (life39_331 * life43_383)) + (life40_341 * life44_399)) + (life41_351 * life45_423));
    (this.a)[((moom.aC)(life37_301)).b] = ((((life38_321 * life46_439) + (life39_331 * life47_455)) + (life40_341 * life48_471)) + (life41_351 * life49_495));
    (this.a)[((moom.aC)(life37_301)).c] = ((((life38_321 * life50_511) + (life39_331 * life51_527)) + (life40_341 * life52_543)) + (life41_351 * life53_567));
    (this.a)[((moom.aC)(life37_301)).d] = ((((life38_321 * life54_583) + (life39_331 * life55_599)) + (life40_341 * life56_615)) + (life41_351 * life57_639));
    life58_726 = this.a(((int)(life18_66)), ((int)(life15_51)), ((int)(life29_168)), ((int)(life35_255)));
    life59_733 = this.a(((int)(life17_61)), ((int)(life15_51)), ((int)(life28_137)), ((int)(life35_255)));
    life60_740 = this.a(((int)(life17_61)), ((int)(life16_56)), ((int)(life31_199)), ((int)(life35_255)));
    life61_747 = this.a(((int)(life18_66)), ((int)(life16_56)), ((int)(life33_230)), ((int)(life35_255)));
    (this.b)[((moom.aC)(life37_301)).a] = this.a(((int)(life58_726)), ((int)(life59_733)), ((int)(life60_740)), ((int)(life61_747)), ((float)(life42_367)), ((float)(life43_383)), ((float)(life44_399)), ((float)(life45_423)));
    (this.b)[((moom.aC)(life37_301)).b] = this.a(((int)(life58_726)), ((int)(life59_733)), ((int)(life60_740)), ((int)(life61_747)), ((float)(life46_439)), ((float)(life47_455)), ((float)(life48_471)), ((float)(life49_495)));
    (this.b)[((moom.aC)(life37_301)).c] = this.a(((int)(life58_726)), ((int)(life59_733)), ((int)(life60_740)), ((int)(life61_747)), ((float)(life50_511)), ((float)(life51_527)), ((float)(life52_543)), ((float)(life53_567)));
    (this.b)[((moom.aC)(life37_301)).d] = this.a(((int)(life58_726)), ((int)(life59_733)), ((int)(life60_740)), ((int)(life61_747)), ((float)(life54_583)), ((float)(life55_599)), ((float)(life56_615)), ((float)(life57_639)));
    break forward_join_895;
    }
    life38_818 = ((((life22_94 + life19_73) + life30_166) + life36_298) * 0x1.0p-2f);
    life39_828 = ((((life21_87 + life19_73) + life27_135) + life36_298) * 0x1.0p-2f);
    life40_838 = ((((life21_87 + life20_80) + life32_197) + life36_298) * 0x1.0p-2f);
    life41_848 = ((((life22_94 + life20_80) + life34_228) + life36_298) * 0x1.0p-2f);
    (this.b)[((moom.aC)(life37_301)).a] = this.a(((int)(life18_66)), ((int)(life15_51)), ((int)(life29_168)), ((int)(life35_255)));
    (this.b)[((moom.aC)(life37_301)).b] = this.a(((int)(life17_61)), ((int)(life15_51)), ((int)(life28_137)), ((int)(life35_255)));
    (this.b)[((moom.aC)(life37_301)).c] = this.a(((int)(life17_61)), ((int)(life16_56)), ((int)(life31_199)), ((int)(life35_255)));
    (this.b)[((moom.aC)(life37_301)).d] = this.a(((int)(life18_66)), ((int)(life16_56)), ((int)(life33_230)), ((int)(life35_255)));
    (this.a)[((moom.aC)(life37_301)).a] = life38_818;
    (this.a)[((moom.aC)(life37_301)).b] = life39_828;
    (this.a)[((moom.aC)(life37_301)).c] = life40_838;
    (this.a)[((moom.aC)(life37_301)).d] = life41_848;
    }
    return;
}


private int a(int p0, int p1, int p2, int p3) {
long local5 = (moom.kM.c ^ 96508186837448L);
    if ((p0 == 0)) {
        p0 = p3;
    }
    if ((p1 == 0)) {
        p1 = p3;
    }
    if ((p2 == 0)) {
        p2 = p3;
    }
    return (((((p0 + p1) + p2) + p3) >> 2) & __sourceIntrinsic_bf1f811575b2_invokedynamic8227_1(1606, (9190355636378518007L ^ local5)));
}


private int a(int p0, int p1, int p2, int p3, float p4, float p5, float p6, float p7) {
long local9 = (moom.kM.c ^ 101307402469380L);
    int local11 = (((int) ((((((float) ((p0 >> __sourceIntrinsic_3fddf4a2eabc_originalDynamicSite1535_1(2412, (2715673944737795868L ^ local9))) & __sourceIntrinsic_3fddf4a2eabc_originalDynamicSite1535_2(24816, (466761535577237134L ^ local9)))) * p4) + (((float) ((p1 >> __sourceIntrinsic_3fddf4a2eabc_originalDynamicSite1535_3(4921, (6516739324055377224L ^ local9))) & __sourceIntrinsic_3fddf4a2eabc_originalDynamicSite1535_4(4825, (8986869792851547299L ^ local9)))) * p5)) + (((float) ((p2 >> __sourceIntrinsic_3fddf4a2eabc_originalDynamicSite1535_5(4921, (6516739324055377224L ^ local9))) & __sourceIntrinsic_3fddf4a2eabc_originalDynamicSite1535_6(4825, (8986869792851547299L ^ local9)))) * p6)) + (((float) ((p3 >> __sourceIntrinsic_3fddf4a2eabc_originalDynamicSite1535_7(4921, (6516739324055377224L ^ local9))) & __sourceIntrinsic_3fddf4a2eabc_originalDynamicSite1535_8(4825, (8986869792851547299L ^ local9)))) * p7))) & __sourceIntrinsic_3fddf4a2eabc_originalDynamicSite1535_9(4825, (8986869792851547299L ^ local9)));
    int local12 = (((int) ((((((float) (p0 & __sourceIntrinsic_3fddf4a2eabc_originalDynamicSite1535_10(4825, (8986869792851547299L ^ local9)))) * p4) + (((float) (p1 & __sourceIntrinsic_3fddf4a2eabc_originalDynamicSite1535_11(4825, (8986869792851547299L ^ local9)))) * p5)) + (((float) (p2 & __sourceIntrinsic_3fddf4a2eabc_originalDynamicSite1535_12(4825, (8986869792851547299L ^ local9)))) * p6)) + (((float) (p3 & __sourceIntrinsic_3fddf4a2eabc_originalDynamicSite1535_13(4825, (8986869792851547299L ^ local9)))) * p7))) & __sourceIntrinsic_3fddf4a2eabc_originalDynamicSite1535_14(4825, (8986869792851547299L ^ local9)));
    return ((local11 << __sourceIntrinsic_3fddf4a2eabc_originalDynamicSite1535_15(4921, (6516739324055377224L ^ local9))) | local12);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8225_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_originalDynamicSite688_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_51e88cd5fa12_invokedynamic3708_112(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_51e88cd5fa12_invokedynamic3708_115(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_51e88cd5fa12_invokedynamic3708_130(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_51e88cd5fa12_invokedynamic3708_133(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_51e88cd5fa12_invokedynamic3708_148(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_51e88cd5fa12_invokedynamic3708_151(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_51e88cd5fa12_invokedynamic3708_166(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_51e88cd5fa12_invokedynamic3708_169(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bf1f811575b2_invokedynamic8227_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3fddf4a2eabc_originalDynamicSite1535_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3fddf4a2eabc_originalDynamicSite1535_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3fddf4a2eabc_originalDynamicSite1535_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3fddf4a2eabc_originalDynamicSite1535_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3fddf4a2eabc_originalDynamicSite1535_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3fddf4a2eabc_originalDynamicSite1535_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3fddf4a2eabc_originalDynamicSite1535_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3fddf4a2eabc_originalDynamicSite1535_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3fddf4a2eabc_originalDynamicSite1535_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3fddf4a2eabc_originalDynamicSite1535_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3fddf4a2eabc_originalDynamicSite1535_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3fddf4a2eabc_originalDynamicSite1535_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3fddf4a2eabc_originalDynamicSite1535_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3fddf4a2eabc_originalDynamicSite1535_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3fddf4a2eabc_originalDynamicSite1535_15(int a0, long a1) throws E;
}
