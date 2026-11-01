package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Gc extends moom.FY {

private net.minecraft.block.Block c;

private static final long d;

private static final long[] e;

private static final java.lang.Integer[] f;

private static final java.util.Map g;

public Gc(net.minecraft.block.Block p0) {
super(true);
    this.c = p0;
}


public Gc() {
super(false);
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-988279536956411419L)), ((long)(-7856159525373157931L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(179436637032972L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Gc.d ^ 68938580139891L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill557_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill557_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill557_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill557_14 = new byte[8];
    (__sourceSpill557_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill557_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation557_16 = __sourceSpill557_14;
    ((javax.crypto.Cipher)(__sourceSpill557_11)).init(((int)(__sourceSpill557_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill557_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation557_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "¨®Âö[ÈWNj+äÛàX"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill557_25 = local6_life21;
        int __sourceSpill557_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill557_25)).substring(((int)(__sourceSpill557_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill557_30 = local8_life19;
        int __sourceSpill557_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill557_33 = new byte[8];
        (__sourceSpill557_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill557_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill557_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill557_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill557_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill557_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill557_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill557_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill557_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill557_34)).doFinal(((byte[])(__sourceSpill557_33)));
        (__sourceSpill557_30)[__sourceSpill557_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    e = ((long[])(local8_life19));
    f = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4670_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Gc"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Gc.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x3000;
        if (f[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Gc", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Gc.f[n2] = n3;
        }
        return f[n2];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
moom.Gc forestValue270_12_0;
    moom.Gc forestValue270_17_0;
    moom.Gc forestValue270_18_0;
    net.minecraft.block.Block forestValue270_18_1;
    int forestValue270_51_0;
    int forestValue270_71_0;
    int forestValue270_82_0;
    int forestValue270_97_0;
    int forestValue270_111_0;
    moom.fn forestValue270_141_0;
    moom.fn forestValue270_141_1;
    int forestValue270_147_0;
    int forestValue270_158_0;
    int forestValue270_162_0;
    net.minecraft.block.Block forestValue270_175_0;
    net.minecraft.block.Block forestValue270_180_0;
    int forestValue270_203_0;
    int forestValue270_249_0;
    int forestValue270_249_1;
    int forestValue270_271_0;
    int forestValue270_271_1;
    int forestValue270_277_0;
    int forestValue270_277_1;
    int forestValue270_287_0;
    int forestValue270_287_1;
    int forestValue270_290_0;
    int forestValue270_306_0;
    int forestValue270_306_1;
    int forestValue270_316_0;
    int forestValue270_316_1;
    int forestValue270_321_0;
    int forestValue270_321_1;
    int forestValue270_333_0;
    int forestValue270_333_1;
    int forestValue270_345_0;
    int forestValue270_345_1;
    int forestValue270_367_0;
    int forestValue270_367_1;
    int forestValue270_379_0;
    int forestValue270_379_1;
    int forestValue270_401_0;
    int forestValue270_401_1;
    int forestValue270_413_0;
    int forestValue270_413_1;
    int forestValue270_435_0;
    int forestValue270_435_1;
    int forestValue270_447_0;
    int forestValue270_447_1;
    int forestValue270_457_0;
    int forestValue270_457_1;
    int forestValue270_483_0;
    int forestValue270_483_1;
    moom.DT forestValue270_493_0;
    int forestValue270_525_0;
    int forestValue270_559_0;
    int forestValue270_559_1;
    int forestValue270_594_0;
    moom.Gc spill270_0;
    int spill270_1;
    int spill270_2;
    int spill270_3;
    int spill270_4;
    int spill270_5;
    int spill270_6;
    moom.fn spill270_7;
    moom.fn spill270_8;
    net.minecraft.block.Block spill270_9;
    int spill270_10;
    int spill270_11;
    int spill270_12;
    int spill270_13;
    int spill270_14;
    int spill270_15;
    int spill270_16;
    int spill270_17;
    int spill270_18;
    int spill270_19;
    int spill270_20;
    int spill270_21;
    int spill270_22;
    int spill270_23;
    int spill270_24;
    int spill270_25;
    int spill270_26;
    int spill270_27;
    int spill270_28;
    int spill270_29;
    int spill270_30;
    int spill270_31;
    int spill270_32;
    int spill270_33;
    int spill270_34;
    int spill270_35;
    moom.DT spill270_36;
    boolean spill270_37;
    boolean spill270_38;
    int spill270_39;
    int spill270_40;
    long life4_3;
    int[] life6_5;
    int life7_31;
    int life8_33;
    int life9_63;
    int life10_76;
    moom.DU life11_99;
    int life12_104;
    int life13_129;
    net.minecraft.block.Block life14_177;
    net.minecraft.block.Block life9_231;
    int life10_260;
    int life11_275;
    int life12_286;
    int life13_312;
    int life14_317;
    int life15_322;
    int life16_327;
    int life17_329;
    int life18_340;
    int life19_347;
    net.minecraft.block.BlockHugeMushroom$EnumType life20_403;
    moom.DT life21_710;
    int life11_747;
    net.minecraft.block.Block life12_763;
    net.minecraft.block.Block life12_802;
    forest_join_594: {
    forest_join_593: {
    forest_join_559: {
    forest_join_526: {
    forest_join_525: {
    forest_join_524: {
    forest_join_521: {
    forest_join_200: {
    forest_join_184: {
    forest_join_180: {
    forest_join_175: {
    forest_join_163: {
    forest_join_162: {
    forest_join_158: {
    forest_join_157: {
    forest_join_19: {
    forest_join_18: {
    forest_join_17: {
    forest_join_12: {
    life4_3 = (moom.Gc.d ^ 43132020954867L);
    life6_5 = moom.FY.b();
    spill270_0 = this;
    if (!((life6_5 != null))) {
        forestValue270_12_0 = spill270_0;
        break forest_join_12;
    }
    if (!((((moom.Gc)(spill270_0)).c == null))) {
        break forest_join_19;
    }
    forestValue270_12_0 = this;
    }
    if (!(((java.util.Random)(p1)).nextBoolean())) {
        forestValue270_17_0 = forestValue270_12_0;
        break forest_join_17;
    }
    forestValue270_18_0 = forestValue270_12_0;
    forestValue270_18_1 = net.minecraft.init.Blocks.a6;
    break forest_join_18;
    }
    forestValue270_18_0 = forestValue270_17_0;
    forestValue270_18_1 = net.minecraft.init.Blocks.a7;
    }
    ((moom.Gc)(forestValue270_18_0)).c = ((net.minecraft.block.Block)(forestValue270_18_1));
    }
    life7_31 = (((java.util.Random)(p1)).nextInt(((int)(3))) + 4);
    life8_33 = 1;
    spill270_1 = ((moom.DT)(p2)).b();
    if (!((life6_5 != null))) {
        forestValue270_525_0 = spill270_1;
        break forest_join_525;
    }
    if (!((spill270_1 >= 1))) {
        break forest_join_524;
    }
    spill270_2 = ((((moom.DT)(p2)).b() + life7_31) + 1);
    if (!((life6_5 != null))) {
        forestValue270_525_0 = spill270_2;
        break forest_join_525;
    }
    if (!((spill270_2 < __sourceIntrinsic_e7ba66b54646_invokedynamic270_10(14557, (8812177882943131042L ^ life4_3))))) {
        break forest_join_524;
    }
    life9_63 = ((moom.DT)(p2)).b();
    forest_cycle_50: while (true) {
    forest_join_154: {
    forestValue270_51_0 = life9_63;
    forest_cycle_51: while (true) {
    forest_join_72: {
    forest_join_71: {
    if (!((forestValue270_51_0 <= ((((moom.DT)(p2)).b() + 1) + life7_31)))) {
        break forest_join_157;
    }
    life10_76 = 3;
    spill270_3 = life9_63;
    if (!((life6_5 != null))) {
        forestValue270_158_0 = spill270_3;
        break forest_join_158;
    }
    if (!((life6_5 != null))) {
        forestValue270_71_0 = spill270_3;
        break forest_join_71;
    }
    if (!((spill270_3 <= (((moom.DT)(p2)).b() + 3)))) {
        break forest_join_72;
    }
    forestValue270_71_0 = 0;
    }
    life10_76 = forestValue270_71_0;
    }
    life11_99 = new moom.DU();
    life12_104 = (((moom.DT)(p2)).a() - life10_76);
    forest_cycle_81: while (true) {
    forest_join_151: {
    forestValue270_82_0 = life12_104;
    forest_cycle_82: while (true) {
    forest_join_97: {
    if (!((forestValue270_82_0 <= (((moom.DT)(p2)).a() + life10_76)))) {
        break forest_join_154;
    }
    spill270_4 = life8_33;
    if (!((life6_5 != null))) {
        forestValue270_51_0 = spill270_4;
        continue forest_cycle_51;
    }
    if (!((life6_5 != null))) {
        forestValue270_97_0 = spill270_4;
        break forest_join_97;
    }
    if (!((spill270_4 != 0))) {
        break forest_join_154;
    }
    forestValue270_97_0 = (((moom.DT)(p2)).c() - life10_76);
    }
    life13_129 = forestValue270_97_0;
    forest_cycle_98: while (true) {
    forest_join_148: {
    forest_join_147: {
    forest_join_146: {
    forest_join_144: {
    forest_join_141: {
    forest_join_111: {
    if (!((life13_129 <= (((moom.DT)(p2)).c() + life10_76)))) {
        break forest_join_151;
    }
    spill270_5 = life8_33;
    if (!((life6_5 != null))) {
        forestValue270_82_0 = spill270_5;
        continue forest_cycle_82;
    }
    if (!((life6_5 != null))) {
        forestValue270_111_0 = spill270_5;
        break forest_join_111;
    }
    if (!((spill270_5 != 0))) {
        break forest_join_151;
    }
    forestValue270_111_0 = life9_63;
    }
    if (!((life6_5 != null))) {
        forestValue270_147_0 = forestValue270_111_0;
        break forest_join_147;
    }
    if (!((forestValue270_111_0 >= 0))) {
        break forest_join_146;
    }
    spill270_6 = life9_63;
    if (!((life6_5 != null))) {
        forestValue270_147_0 = spill270_6;
        break forest_join_147;
    }
    if (!((spill270_6 < __sourceIntrinsic_e7ba66b54646_invokedynamic270_18(31111, (3616451571224759545L ^ life4_3))))) {
        break forest_join_146;
    }
    life14_177 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DU)(life11_99)).a(((int)(life12_104)), ((int)(life9_63)), ((int)(life13_129)))))))).a__ch();
    spill270_7 = ((net.minecraft.block.Block)(life14_177)).a__fn();
    spill270_8 = moom.fn.a;
    if (!((life6_5 != null))) {
        forestValue270_141_0 = spill270_7;
        forestValue270_141_1 = spill270_8;
        break forest_join_141;
    }
    if (!((spill270_7 != spill270_8))) {
        break forest_join_144;
    }
    forestValue270_141_0 = ((net.minecraft.block.Block)(life14_177)).a__fn();
    forestValue270_141_1 = moom.fn.j;
    }
    if (!((forestValue270_141_0 != forestValue270_141_1))) {
        break forest_join_144;
    }
    life8_33 = 0;
    }
    if (!((life6_5 == null))) {
        break forest_join_148;
    }
    }
    forestValue270_147_0 = 0;
    }
    life8_33 = forestValue270_147_0;
    }
    life13_129 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_98;
    }
    break forest_cycle_98;
    }
    break forest_cycle_82;
    }
    }
    life12_104 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_81;
    }
    break forest_cycle_81;
    }
    break forest_cycle_51;
    }
    }
    life9_63 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_50;
    }
    break forest_cycle_50;
    }
    }
    forestValue270_158_0 = life8_33;
    }
    if (!((life6_5 != null))) {
        forestValue270_162_0 = forestValue270_158_0;
        break forest_join_162;
    }
    if (!((forestValue270_158_0 == 0))) {
        break forest_join_163;
    }
    forestValue270_162_0 = 0;
    }
    return ((forestValue270_162_0) != 0);
    }
    life9_231 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).b__DT()))))).a__ch();
    spill270_9 = life9_231;
    if (!((life6_5 != null))) {
        forestValue270_175_0 = spill270_9;
        break forest_join_175;
    }
    if (!((spill270_9 != net.minecraft.init.Blocks.d))) {
        break forest_join_184;
    }
    forestValue270_175_0 = life9_231;
    }
    if (!((life6_5 != null))) {
        forestValue270_180_0 = forestValue270_175_0;
        break forest_join_180;
    }
    if (!((forestValue270_175_0 != net.minecraft.init.Blocks.c))) {
        break forest_join_184;
    }
    forestValue270_180_0 = life9_231;
    }
    if (!((forestValue270_180_0 != net.minecraft.init.Blocks.bl))) {
        break forest_join_184;
    }
    return ((0) != 0);
    }
    life10_260 = (((moom.DT)(p2)).b() + life7_31);
    if (!((this.c == net.minecraft.init.Blocks.a7))) {
        break forest_join_200;
    }
    life10_260 = ((((moom.DT)(p2)).b() + life7_31) - 3);
    }
    life11_275 = life10_260;
    forest_cycle_202: while (true) {
    forest_join_518: {
    forestValue270_203_0 = life11_275;
    forest_cycle_203: while (true) {
    forest_join_225: {
    forest_join_219: {
    if (!((forestValue270_203_0 <= (((moom.DT)(p2)).b() + life7_31)))) {
        break forest_join_521;
    }
    life12_286 = 1;
    spill270_10 = life11_275;
    spill270_11 = (((moom.DT)(p2)).b() + life7_31);
    if (!((life6_5 != null))) {
        forestValue270_559_0 = spill270_10;
        forestValue270_559_1 = spill270_11;
        break forest_join_559;
    }
    if (!((spill270_10 < spill270_11))) {
        break forest_join_219;
    }
    life12_286 += 1;
    }
    if (!((this.c == net.minecraft.init.Blocks.a6))) {
        break forest_join_225;
    }
    life12_286 = 3;
    }
    life13_312 = (((moom.DT)(p2)).a() - life12_286);
    life14_317 = (((moom.DT)(p2)).a() + life12_286);
    life15_322 = (((moom.DT)(p2)).c() - life12_286);
    life16_327 = (((moom.DT)(p2)).c() + life12_286);
    life17_329 = life13_312;
    forest_cycle_247: while (true) {
    forest_join_515: {
    forestValue270_249_0 = life17_329;
    forestValue270_249_1 = life14_317;
    forest_cycle_249: while (true) {
    if (!((forestValue270_249_0 <= forestValue270_249_1))) {
        break forest_join_518;
    }
    spill270_12 = life15_322;
    if (!((life6_5 != null))) {
        forestValue270_203_0 = spill270_12;
        continue forest_cycle_203;
    }
    life18_340 = spill270_12;
    forest_cycle_254: while (true) {
    forest_join_513: {
    forest_join_512: {
    forest_join_493: {
    forest_join_487: {
    forest_join_483: {
    forest_join_473: {
    forest_join_460: {
    forest_join_457: {
    forest_join_447: {
    forest_join_445: {
    forest_join_435: {
    forest_join_428: {
    forest_join_413: {
    forest_join_411: {
    forest_join_401: {
    forest_join_394: {
    forest_join_379: {
    forest_join_377: {
    forest_join_367: {
    forest_join_360: {
    forest_join_345: {
    forest_join_343: {
    forest_join_333: {
    forest_join_326: {
    forest_join_321: {
    forest_join_316: {
    forest_join_314: {
    forest_join_306: {
    forest_join_304: {
    forest_join_290: {
    forest_join_289: {
    forest_join_287: {
    forest_join_283: {
    forest_join_277: {
    forest_join_275: {
    forest_join_271: {
    forest_join_269: {
    if (!((life18_340 <= life16_327))) {
        break forest_join_515;
    }
    life19_347 = 5;
    spill270_13 = life17_329;
    spill270_14 = life13_312;
    if (!((life6_5 != null))) {
        forestValue270_249_0 = spill270_13;
        forestValue270_249_1 = spill270_14;
        continue forest_cycle_249;
    }
    if (!((life6_5 != null))) {
        forestValue270_271_0 = spill270_13;
        forestValue270_271_1 = spill270_14;
        break forest_join_271;
    }
    if (!((spill270_13 == spill270_14))) {
        break forest_join_269;
    }
    life19_347 += -1;
    if (!((life6_5 == null))) {
        break forest_join_275;
    }
    }
    forestValue270_271_0 = life17_329;
    forestValue270_271_1 = life14_317;
    }
    if (!((life6_5 != null))) {
        forestValue270_277_0 = forestValue270_271_0;
        forestValue270_277_1 = forestValue270_271_1;
        break forest_join_277;
    }
    if (!((forestValue270_271_0 == forestValue270_271_1))) {
        break forest_join_275;
    }
    life19_347 += 1;
    }
    forestValue270_277_0 = life18_340;
    forestValue270_277_1 = life15_322;
    }
    if (!((life6_5 != null))) {
        forestValue270_287_0 = forestValue270_277_0;
        forestValue270_287_1 = forestValue270_277_1;
        break forest_join_287;
    }
    if (!((forestValue270_277_0 == forestValue270_277_1))) {
        break forest_join_283;
    }
    life19_347 += -3;
    if (!((life6_5 == null))) {
        break forest_join_289;
    }
    }
    spill270_15 = life18_340;
    if (!((life6_5 != null))) {
        forestValue270_290_0 = spill270_15;
        break forest_join_290;
    }
    forestValue270_287_0 = spill270_15;
    forestValue270_287_1 = life16_327;
    }
    if (!((forestValue270_287_0 == forestValue270_287_1))) {
        break forest_join_289;
    }
    life19_347 += 3;
    }
    forestValue270_290_0 = life19_347;
    }
    life20_403 = net.minecraft.block.BlockHugeMushroom$EnumType.a(((int)(forestValue270_290_0)));
    if (!((this.c != net.minecraft.init.Blocks.a6))) {
        break forest_join_304;
    }
    spill270_16 = life11_275;
    spill270_17 = (((moom.DT)(p2)).b() + life7_31);
    if (!((life6_5 != null))) {
        forestValue270_306_0 = spill270_16;
        forestValue270_306_1 = spill270_17;
        break forest_join_306;
    }
    if (!((spill270_16 < spill270_17))) {
        break forest_join_460;
    }
    }
    forestValue270_306_0 = life17_329;
    forestValue270_306_1 = life13_312;
    }
    if (!((life6_5 != null))) {
        forestValue270_316_0 = forestValue270_306_0;
        forestValue270_316_1 = forestValue270_306_1;
        break forest_join_316;
    }
    if (!((forestValue270_306_0 != forestValue270_306_1))) {
        break forest_join_314;
    }
    spill270_18 = life17_329;
    spill270_19 = life14_317;
    if (!((life6_5 != null))) {
        forestValue270_333_0 = spill270_18;
        forestValue270_333_1 = spill270_19;
        break forest_join_333;
    }
    if (!((spill270_18 == spill270_19))) {
        break forest_join_326;
    }
    }
    forestValue270_316_0 = life18_340;
    forestValue270_316_1 = life15_322;
    }
    if (!((life6_5 != null))) {
        forestValue270_321_0 = forestValue270_316_0;
        forestValue270_321_1 = forestValue270_316_1;
        break forest_join_321;
    }
    if (!((forestValue270_316_0 != forestValue270_316_1))) {
        break forest_join_512;
    }
    forestValue270_321_0 = life18_340;
    forestValue270_321_1 = life16_327;
    }
    if (!((life6_5 != null))) {
        forestValue270_333_0 = forestValue270_321_0;
        forestValue270_333_1 = forestValue270_321_1;
        break forest_join_333;
    }
    if (!((forestValue270_321_0 == forestValue270_321_1))) {
        break forest_join_326;
    }
    if (!((life6_5 == null))) {
        break forest_join_512;
    }
    }
    forestValue270_333_0 = life17_329;
    forestValue270_333_1 = (((moom.DT)(p2)).a() - (life12_286 - 1));
    }
    if (!((life6_5 != null))) {
        forestValue270_345_0 = forestValue270_333_0;
        forestValue270_345_1 = forestValue270_333_1;
        break forest_join_345;
    }
    if (!((forestValue270_333_0 == forestValue270_333_1))) {
        break forest_join_343;
    }
    spill270_20 = life18_340;
    spill270_21 = life15_322;
    if (!((life6_5 != null))) {
        forestValue270_345_0 = spill270_20;
        forestValue270_345_1 = spill270_21;
        break forest_join_345;
    }
    if (!((spill270_20 == spill270_21))) {
        break forest_join_343;
    }
    life20_403 = net.minecraft.block.BlockHugeMushroom$EnumType.NORTH_WEST;
    }
    forestValue270_345_0 = life17_329;
    forestValue270_345_1 = life13_312;
    }
    if (!((life6_5 != null))) {
        forestValue270_367_0 = forestValue270_345_0;
        forestValue270_367_1 = forestValue270_345_1;
        break forest_join_367;
    }
    if (!((forestValue270_345_0 == forestValue270_345_1))) {
        break forest_join_360;
    }
    spill270_22 = life18_340;
    spill270_23 = (((moom.DT)(p2)).c() - (life12_286 - 1));
    if (!((life6_5 != null))) {
        forestValue270_367_0 = spill270_22;
        forestValue270_367_1 = spill270_23;
        break forest_join_367;
    }
    if (!((spill270_22 == spill270_23))) {
        break forest_join_360;
    }
    life20_403 = net.minecraft.block.BlockHugeMushroom$EnumType.NORTH_WEST;
    }
    forestValue270_367_0 = life17_329;
    forestValue270_367_1 = (((moom.DT)(p2)).a() + (life12_286 - 1));
    }
    if (!((life6_5 != null))) {
        forestValue270_379_0 = forestValue270_367_0;
        forestValue270_379_1 = forestValue270_367_1;
        break forest_join_379;
    }
    if (!((forestValue270_367_0 == forestValue270_367_1))) {
        break forest_join_377;
    }
    spill270_24 = life18_340;
    spill270_25 = life15_322;
    if (!((life6_5 != null))) {
        forestValue270_379_0 = spill270_24;
        forestValue270_379_1 = spill270_25;
        break forest_join_379;
    }
    if (!((spill270_24 == spill270_25))) {
        break forest_join_377;
    }
    life20_403 = net.minecraft.block.BlockHugeMushroom$EnumType.NORTH_EAST;
    }
    forestValue270_379_0 = life17_329;
    forestValue270_379_1 = life14_317;
    }
    if (!((life6_5 != null))) {
        forestValue270_401_0 = forestValue270_379_0;
        forestValue270_401_1 = forestValue270_379_1;
        break forest_join_401;
    }
    if (!((forestValue270_379_0 == forestValue270_379_1))) {
        break forest_join_394;
    }
    spill270_26 = life18_340;
    spill270_27 = (((moom.DT)(p2)).c() - (life12_286 - 1));
    if (!((life6_5 != null))) {
        forestValue270_401_0 = spill270_26;
        forestValue270_401_1 = spill270_27;
        break forest_join_401;
    }
    if (!((spill270_26 == spill270_27))) {
        break forest_join_394;
    }
    life20_403 = net.minecraft.block.BlockHugeMushroom$EnumType.NORTH_EAST;
    }
    forestValue270_401_0 = life17_329;
    forestValue270_401_1 = (((moom.DT)(p2)).a() - (life12_286 - 1));
    }
    if (!((life6_5 != null))) {
        forestValue270_413_0 = forestValue270_401_0;
        forestValue270_413_1 = forestValue270_401_1;
        break forest_join_413;
    }
    if (!((forestValue270_401_0 == forestValue270_401_1))) {
        break forest_join_411;
    }
    spill270_28 = life18_340;
    spill270_29 = life16_327;
    if (!((life6_5 != null))) {
        forestValue270_413_0 = spill270_28;
        forestValue270_413_1 = spill270_29;
        break forest_join_413;
    }
    if (!((spill270_28 == spill270_29))) {
        break forest_join_411;
    }
    life20_403 = net.minecraft.block.BlockHugeMushroom$EnumType.SOUTH_WEST;
    }
    forestValue270_413_0 = life17_329;
    forestValue270_413_1 = life13_312;
    }
    if (!((life6_5 != null))) {
        forestValue270_435_0 = forestValue270_413_0;
        forestValue270_435_1 = forestValue270_413_1;
        break forest_join_435;
    }
    if (!((forestValue270_413_0 == forestValue270_413_1))) {
        break forest_join_428;
    }
    spill270_30 = life18_340;
    spill270_31 = (((moom.DT)(p2)).c() + (life12_286 - 1));
    if (!((life6_5 != null))) {
        forestValue270_435_0 = spill270_30;
        forestValue270_435_1 = spill270_31;
        break forest_join_435;
    }
    if (!((spill270_30 == spill270_31))) {
        break forest_join_428;
    }
    life20_403 = net.minecraft.block.BlockHugeMushroom$EnumType.SOUTH_WEST;
    }
    forestValue270_435_0 = life17_329;
    forestValue270_435_1 = (((moom.DT)(p2)).a() + (life12_286 - 1));
    }
    if (!((life6_5 != null))) {
        forestValue270_447_0 = forestValue270_435_0;
        forestValue270_447_1 = forestValue270_435_1;
        break forest_join_447;
    }
    if (!((forestValue270_435_0 == forestValue270_435_1))) {
        break forest_join_445;
    }
    spill270_32 = life18_340;
    spill270_33 = life16_327;
    if (!((life6_5 != null))) {
        forestValue270_447_0 = spill270_32;
        forestValue270_447_1 = spill270_33;
        break forest_join_447;
    }
    if (!((spill270_32 == spill270_33))) {
        break forest_join_445;
    }
    life20_403 = net.minecraft.block.BlockHugeMushroom$EnumType.SOUTH_EAST;
    }
    forestValue270_447_0 = life17_329;
    forestValue270_447_1 = life14_317;
    }
    if (!((life6_5 != null))) {
        forestValue270_457_0 = forestValue270_447_0;
        forestValue270_457_1 = forestValue270_447_1;
        break forest_join_457;
    }
    if (!((forestValue270_447_0 == forestValue270_447_1))) {
        break forest_join_460;
    }
    forestValue270_457_0 = life18_340;
    forestValue270_457_1 = (((moom.DT)(p2)).c() + (life12_286 - 1));
    }
    if (!((forestValue270_457_0 == forestValue270_457_1))) {
        break forest_join_460;
    }
    life20_403 = net.minecraft.block.BlockHugeMushroom$EnumType.SOUTH_EAST;
    }
    if (!((life20_403 == net.minecraft.block.BlockHugeMushroom$EnumType.CENTER))) {
        break forest_join_473;
    }
    spill270_34 = life11_275;
    spill270_35 = (((moom.DT)(p2)).b() + life7_31);
    if (!((life6_5 != null))) {
        forestValue270_483_0 = spill270_34;
        forestValue270_483_1 = spill270_35;
        break forest_join_483;
    }
    if (!((spill270_34 < spill270_35))) {
        break forest_join_473;
    }
    life20_403 = net.minecraft.block.BlockHugeMushroom$EnumType.ALL_INSIDE;
    }
    spill270_36 = p2;
    if (!((life6_5 != null))) {
        forestValue270_493_0 = spill270_36;
        break forest_join_493;
    }
    forestValue270_483_0 = ((moom.DT)(spill270_36)).b();
    forestValue270_483_1 = ((((moom.DT)(p2)).b() + life7_31) - 1);
    }
    if (!((forestValue270_483_0 < forestValue270_483_1))) {
        break forest_join_487;
    }
    if (!((life20_403 != net.minecraft.block.BlockHugeMushroom$EnumType.ALL_INSIDE))) {
        break forest_join_512;
    }
    }
    forestValue270_493_0 = new moom.DT(life17_329, life11_275, life18_340);
    }
    life21_710 = forestValue270_493_0;
    if (!((life6_5 != null))) {
        break forest_join_513;
    }
    if (!((!((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life21_710))))).a__ch())).a__Boolean()))) {
        break forest_join_512;
    }
    ((moom.Gc)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(life21_710)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(this.c)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dE.Q)), ((java.lang.Comparable)(life20_403))))));
    }
    life18_340 += 1;
    }
    if (!((life6_5 == null))) {
        continue forest_cycle_254;
    }
    break forest_cycle_254;
    }
    break forest_cycle_249;
    }
    }
    life17_329 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_247;
    }
    break forest_cycle_247;
    }
    break forest_cycle_203;
    }
    }
    life11_275 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_202;
    }
    break forest_cycle_202;
    }
    }
    life11_747 = 0;
    break forest_join_526;
    }
    forestValue270_525_0 = 0;
    }
    return ((forestValue270_525_0) != 0);
    }
    forest_cycle_526: while (true) {
    forest_join_556: {
    forest_join_555: {
    if (!((life11_747 < life7_31))) {
        break forest_join_593;
    }
    life12_763 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).a(((int)(life11_747)))))))).a__ch();
    if (!((life6_5 != null))) {
        break forest_join_556;
    }
    spill270_37 = ((net.minecraft.block.Block)(life12_763)).a__Boolean();
    if (!((life6_5 != null))) {
        forestValue270_594_0 = ((spill270_37) ? 1 : 0);
        break forest_join_594;
    }
    if (!((!spill270_37))) {
        break forest_join_555;
    }
    ((moom.Gc)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p2)).a(((int)(life11_747))))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(this.c)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dE.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockHugeMushroom$EnumType.STEM))))));
    }
    life11_747 += 1;
    }
    if (!((life6_5 == null))) {
        continue forest_cycle_526;
    }
    break forest_cycle_526;
    }
    break forest_join_593;
    }
    forest_cycle_559: while (true) {
    forest_join_590: {
    forest_join_587: {
    forest_join_586: {
    if (!((forestValue270_559_0 < forestValue270_559_1))) {
        break forest_join_593;
    }
    life12_802 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).a(((int)(life11_275)))))))).a__ch();
    if (!((life6_5 != null))) {
        break forest_join_587;
    }
    spill270_38 = ((net.minecraft.block.Block)(life12_802)).a__Boolean();
    if (!((life6_5 != null))) {
        forestValue270_594_0 = ((spill270_38) ? 1 : 0);
        break forest_join_594;
    }
    if (!((!spill270_38))) {
        break forest_join_586;
    }
    ((moom.Gc)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p2)).a(((int)(life11_275))))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(this.c)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dE.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockHugeMushroom$EnumType.STEM))))));
    }
    life11_275 += 1;
    }
    if (!((life6_5 == null))) {
        break forest_join_590;
    }
    break forest_join_593;
    }
    spill270_39 = life11_275;
    spill270_40 = life7_31;
    forestValue270_559_0 = spill270_39;
    forestValue270_559_1 = spill270_40;
    continue forest_cycle_559;
    }
    }
    forestValue270_594_0 = 1;
    }
    return ((forestValue270_594_0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4670_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic270_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic270_18(int a0, long a1) throws E;
}
