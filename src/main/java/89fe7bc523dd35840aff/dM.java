package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class dM extends net.minecraft.block.BlockLiquid {

int R;

private static final long S;

private static final long[] X;

private static final java.lang.Integer[] Y;

private static final java.util.Map Z;

protected dM(moom.fn p0) {
super(p0);
}


static {
javax.crypto.Cipher forestValue439_36_0;
    int forestValue439_36_1;
    javax.crypto.SecretKeyFactory forestValue439_36_2;
    byte[] forestValue439_36_3;
    javax.crypto.Cipher forestValue439_53_0;
    int forestValue439_53_1;
    javax.crypto.SecretKeyFactory forestValue439_53_2;
    byte[] forestValue439_53_3;
    long[] forestValue439_157_0;
    int forestValue439_157_1;
    long forestValue439_157_2;
    int forestValue439_157_3;
    long[] forestValue439_300_0;
    int forestValue439_300_1;
    long forestValue439_300_2;
    long[] forestValue439_312_0;
    int forestValue439_312_1;
    long forestValue439_312_2;
    javax.crypto.Cipher spill439_0;
    int spill439_1;
    javax.crypto.SecretKeyFactory spill439_2;
    byte[] spill439_3;
    byte[] spill439_4;
    java.lang.String spill439_5;
    int spill439_6;
    int spill439_7;
    long spill439_8;
    byte[] spill439_9;
    byte[] spill439_10;
    byte[] spill439_11;
    byte[] spill439_12;
    byte[] spill439_13;
    byte[] spill439_14;
    byte[] spill439_15;
    byte[] spill439_16;
    long spill439_17;
    int spill439_18;
    java.lang.String spill439_19;
    int spill439_20;
    long[] spill439_21;
    int spill439_22;
    long spill439_23;
    int spill439_24;
    long life0_16;
    javax.crypto.Cipher life2_20;
    int life3_35;
    long[] life8_66;
    int life5_68;
    java.lang.String life6_71;
    int life7_73;
    int life4_75;
    byte[] life9_83;
    long life10_160;
    byte[] life12_228;
    byte[] life9_325;
    forest_join_399: {
    forest_join_53: {
    S = ((long)(((moom._a)(moom._c.a(((long)(-1161653282758941013L)), ((long)(2142819985471606344L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(47360327859785L)))));
    Z = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (moom.dM.S ^ 119071088655780L);
    spill439_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill439_1 = 2;
    spill439_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp439_9_0 = new byte[8];
    spill439_3 = __stackOp439_9_0;
    (__stackOp439_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue439_36_0 = spill439_0;
    forestValue439_36_1 = spill439_1;
    forestValue439_36_2 = spill439_2;
    forestValue439_36_3 = spill439_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue439_53_0 = forestValue439_36_0;
        forestValue439_53_1 = forestValue439_36_1;
        forestValue439_53_2 = forestValue439_36_2;
        forestValue439_53_3 = forestValue439_36_3;
        break forest_join_53;
    }
    byte[] __stackOp439_10_0 = forestValue439_36_3;
    spill439_4 = __stackOp439_10_0;
    (__stackOp439_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue439_36_3 = spill439_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue439_53_0)).init(((int)(forestValue439_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue439_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue439_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life8_66 = new long[5];
    life5_68 = 0;
    life7_73 = ((java.lang.String)((life6_71 = "nÈgÿ+ßNù6#RC\f=%ä×Å,4Xdo"))).length();
    life4_75 = 0;
    forest_cycle_76: while (true) {
    spill439_5 = life6_71;
    spill439_6 = life4_75;
    life4_75 += 8;
    life9_83 = ((java.lang.String)(((java.lang.String)(spill439_5)).substring(((int)(spill439_6)), ((int)(life4_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    forestValue439_157_0 = life8_66;
    forestValue439_157_1 = (life5_68++);
    forestValue439_157_2 = (((((((((((long) (life9_83)[0]) & 255L) << 56) | ((((long) (life9_83)[1]) & 255L) << 48)) | ((((long) (life9_83)[2]) & 255L) << 40)) | ((((long) (life9_83)[3]) & 255L) << 32)) | ((((long) (life9_83)[4]) & 255L) << 24)) | ((((long) (life9_83)[5]) & 255L) << 16)) | ((((long) (life9_83)[6]) & 255L) << 8)) | (((long) (life9_83)[7]) & 255L));
    forestValue439_157_3 = -1;
    forest_cycle_157: while (true) {
    forest_join_317: {
    forest_join_312: {
    forest_join_300: {
    long __stackOp439_16_0 = forestValue439_157_2;
    int __stackOp439_16_1 = forestValue439_157_3;
    spill439_7 = __stackOp439_16_1;
    spill439_8 = __stackOp439_16_0;
    recovery.source.CarrierOps.discard(__stackOp439_16_1);
    life10_160 = spill439_8;
    byte[] __stackOp439_18_0 = new byte[8];
    spill439_9 = __stackOp439_18_0;
    (__stackOp439_18_0)[0] = ((byte) ((int) (life10_160 >>> 56)));
    byte[] __stackOp439_19_0 = spill439_9;
    spill439_10 = __stackOp439_19_0;
    (__stackOp439_19_0)[1] = ((byte) ((int) (life10_160 >>> 48)));
    byte[] __stackOp439_20_0 = spill439_10;
    spill439_11 = __stackOp439_20_0;
    (__stackOp439_20_0)[2] = ((byte) ((int) (life10_160 >>> 40)));
    byte[] __stackOp439_21_0 = spill439_11;
    spill439_12 = __stackOp439_21_0;
    (__stackOp439_21_0)[3] = ((byte) ((int) (life10_160 >>> 32)));
    byte[] __stackOp439_22_0 = spill439_12;
    spill439_13 = __stackOp439_22_0;
    (__stackOp439_22_0)[4] = ((byte) ((int) (life10_160 >>> 24)));
    byte[] __stackOp439_23_0 = spill439_13;
    spill439_14 = __stackOp439_23_0;
    (__stackOp439_23_0)[5] = ((byte) ((int) (life10_160 >>> 16)));
    byte[] __stackOp439_24_0 = spill439_14;
    spill439_15 = __stackOp439_24_0;
    (__stackOp439_24_0)[6] = ((byte) ((int) (life10_160 >>> 8)));
    byte[] __stackOp439_25_0 = spill439_15;
    spill439_16 = __stackOp439_25_0;
    (__stackOp439_25_0)[7] = ((byte) ((int) life10_160));
    byte[] __stackOp439_26_0 = spill439_16;
    javax.crypto.Cipher __stackOp439_26_1 = life2_20;
    life12_228 = ((javax.crypto.Cipher)(__stackOp439_26_1)).doFinal(((byte[])(__stackOp439_26_0)));
    int __stackOp439_28_0 = spill439_7;
    long __stackOp439_28_1 = (((((((((((long) (life12_228)[0]) & 255L) << 56) | ((((long) (life12_228)[1]) & 255L) << 48)) | ((((long) (life12_228)[2]) & 255L) << 40)) | ((((long) (life12_228)[3]) & 255L) << 32)) | ((((long) (life12_228)[4]) & 255L) << 24)) | ((((long) (life12_228)[5]) & 255L) << 16)) | ((((long) (life12_228)[6]) & 255L) << 8)) | (((long) (life12_228)[7]) & 255L));
    spill439_17 = __stackOp439_28_1;
    spill439_18 = __stackOp439_28_0;
    recovery.source.CarrierOps.discard(__stackOp439_28_1);
    switch (spill439_18) {
default:
{
        forestValue439_300_0 = forestValue439_157_0;
        forestValue439_300_1 = forestValue439_157_1;
        forestValue439_300_2 = spill439_17;
        break forest_join_300;
    }
case 0:
{
        forestValue439_312_0 = forestValue439_157_0;
        forestValue439_312_1 = forestValue439_157_1;
        forestValue439_312_2 = spill439_17;
        break forest_join_312;
    }
}
    }
    (forestValue439_300_0)[forestValue439_300_1] = forestValue439_300_2;
    if (!((life4_75 >= life7_73))) {
        continue forest_cycle_76;
    }
    life7_73 = ((java.lang.String)((life6_71 = "tæöèhcóÊj\035\004ì"))).length();
    life4_75 = 0;
    break forest_join_317;
    }
    (forestValue439_312_0)[forestValue439_312_1] = forestValue439_312_2;
    if (!((life4_75 >= life7_73))) {
        break forest_join_317;
    }
    break forest_join_399;
    }
    spill439_19 = life6_71;
    spill439_20 = life4_75;
    life4_75 += 8;
    life9_325 = ((java.lang.String)(((java.lang.String)(spill439_19)).substring(((int)(spill439_20)), ((int)(life4_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill439_21 = life8_66;
    spill439_22 = (life5_68++);
    spill439_23 = (((((((((((long) (life9_325)[0]) & 255L) << 56) | ((((long) (life9_325)[1]) & 255L) << 48)) | ((((long) (life9_325)[2]) & 255L) << 40)) | ((((long) (life9_325)[3]) & 255L) << 32)) | ((((long) (life9_325)[4]) & 255L) << 24)) | ((((long) (life9_325)[5]) & 255L) << 16)) | ((((long) (life9_325)[6]) & 255L) << 8)) | (((long) (life9_325)[7]) & 255L));
    spill439_24 = 0;
    forestValue439_157_0 = spill439_21;
    forestValue439_157_1 = spill439_22;
    forestValue439_157_2 = spill439_23;
    forestValue439_157_3 = spill439_24;
    continue forest_cycle_157;
    }
    }
    }
    X = ((long[])(life8_66));
    Y = ((java.lang.Integer[])(new java.lang.Integer[5]));
}


private boolean b__Boolean(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
net.minecraft.block.Block forwardValue328_25_0;
    net.minecraft.block.Block forwardValue328_25_1;
    net.minecraft.block.Block forwardValue328_27_0;
    net.minecraft.block.Block forwardValue328_32_0;
    moom.fn forwardValue328_39_0;
    int forwardValue328_44_0;
    int forwardValue328_46_0;
    int[] spill328_0;
    int spill328_1;
    net.minecraft.block.Block spill328_2;
    net.minecraft.block.Block spill328_3;
    net.minecraft.block.Block spill328_4;
    moom.fn spill328_5;
    boolean spill328_6;
    long life4_3;
    net.minecraft.block.Block life7_9;
    int[] life6_10;
    forward_join_46: {
    forward_join_45: {
    forward_join_44: {
    forward_join_43: {
    forward_join_39: {
    forward_join_32: {
    forward_join_27: {
    forward_join_25: {
    life4_3 = (moom.dM.S ^ 110447064201773L);
    spill328_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_9 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))).a__ch();
    life6_10 = spill328_0;
    spill328_1 = ((life7_9 instanceof net.minecraft.block.BlockDoor) ? 1 : 0);
    if (!((life6_10 != null))) {
        forwardValue328_44_0 = spill328_1;
        break forward_join_44;
    }
    if (!((spill328_1 == 0))) {
        break forward_join_43;
    }
    spill328_2 = life7_9;
    spill328_3 = net.minecraft.init.Blocks.an;
    if (!((life6_10 != null))) {
        forwardValue328_25_0 = spill328_2;
        forwardValue328_25_1 = spill328_3;
        break forward_join_25;
    }
    if (!((spill328_2 != spill328_3))) {
        break forward_join_43;
    }
    spill328_4 = life7_9;
    if (!((life6_10 != null))) {
        forwardValue328_27_0 = spill328_4;
        break forward_join_27;
    }
    forwardValue328_25_0 = spill328_4;
    forwardValue328_25_1 = net.minecraft.init.Blocks.au;
    }
    if (!((forwardValue328_25_0 != forwardValue328_25_1))) {
        break forward_join_43;
    }
    forwardValue328_27_0 = life7_9;
    }
    if (!((life6_10 != null))) {
        forwardValue328_32_0 = forwardValue328_27_0;
        break forward_join_32;
    }
    if (!((forwardValue328_27_0 != net.minecraft.init.Blocks.aM))) {
        break forward_join_43;
    }
    forwardValue328_32_0 = life7_9;
    }
    spill328_5 = ((net.minecraft.block.Block)(forwardValue328_32_0)).J;
    if (!((life6_10 != null))) {
        forwardValue328_39_0 = spill328_5;
        break forward_join_39;
    }
    if (!((spill328_5 != moom.fn.E))) {
        break forward_join_43;
    }
    forwardValue328_39_0 = ((net.minecraft.block.Block)(life7_9)).J;
    }
    spill328_6 = ((moom.fn)(forwardValue328_39_0)).d__Boolean();
    if (!((life6_10 != null))) {
        forwardValue328_44_0 = ((spill328_6) ? 1 : 0);
        break forward_join_44;
    }
    if (!(spill328_6)) {
        break forward_join_45;
    }
    }
    forwardValue328_44_0 = 1;
    }
    forwardValue328_46_0 = forwardValue328_44_0;
    break forward_join_46;
    }
    forwardValue328_46_0 = 0;
    }
    return ((forwardValue328_46_0) != 0);
}


public void b__Void(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
long local4 = (moom.dM.S ^ 119850981889811L);
    if ((__sourceIntrinsic_booleanComparison(((moom.dM)(this)).a__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)))) == 0)) {
        ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)), ((int)(((moom.dM)(this)).a(((net.minecraft.world.World)(p0))))));
    }
    return;
}


private void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, int p3) {
net.minecraft.block.Block forwardValue327_16_0;
    net.minecraft.block.Block forwardValue327_32_0;
    moom.dM spill327_0;
    moom.dM spill327_1;
    long life5_3;
    int[] life7_5;
    forward_join_48: {
    forward_join_37: {
    forward_join_32: {
    forward_join_30: {
    forward_join_16: {
    life5_3 = (moom.dM.S ^ 125836250140709L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill327_0 = this;
    if (!((life7_5 != null))) {
        forwardValue327_16_0 = spill327_0;
        break forward_join_16;
    }
    if (!(((moom.dM)(spill327_0)).c__sourceReturn_6048bc1ea7(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2))))) {
        break forward_join_48;
    }
    forwardValue327_16_0 = ((net.minecraft.block.state.IBlockState)(p2)).a__ch();
    }
    if (!((forwardValue327_16_0 != net.minecraft.init.Blocks.a))) {
        break forward_join_37;
    }
    spill327_1 = this;
    if (!((life7_5 != null))) {
        forwardValue327_32_0 = spill327_1;
        break forward_join_32;
    }
    if (!((((moom.dM)(spill327_1)).J == moom.fn.i))) {
        break forward_join_30;
    }
    ((moom.dM)(this)).b__sourceReturn_bfedcc9a42(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    if (!((life7_5 == null))) {
        break forward_join_37;
    }
    }
    forwardValue327_32_0 = ((net.minecraft.block.state.IBlockState)(p2)).a__ch();
    }
    ((net.minecraft.block.Block)(forwardValue327_32_0)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(0)));
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.dM)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dM.Q)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(p3)))))))), ((int)(3)));
    }
    return;
}


public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
moom.dM lexicalValue1110_29_0;
    int lexicalValue1110_31_0;
    int lexicalValue1110_41_0;
    int lexicalValue1110_85_0;
    int lexicalValue1110_91_0;
    int lexicalValue1110_119_0;
    int lexicalValue1110_119_1;
    int lexicalValue1110_125_0;
    moom.fn lexicalValue1110_152_0;
    int lexicalValue1110_166_0;
    moom.dM lexicalValue1110_168_0;
    moom.fn lexicalValue1110_170_0;
    moom.fn lexicalValue1110_170_1;
    int lexicalValue1110_196_0;
    int lexicalValue1110_199_0;
    int lexicalValue1110_199_1;
    int lexicalValue1110_210_0;
    int lexicalValue1110_230_0;
    moom.fn lexicalValue1110_276_0;
    moom.fn lexicalValue1110_276_1;
    net.minecraft.world.World lexicalValue1110_280_0;
    moom.DT lexicalValue1110_280_1;
    int lexicalValue1110_322_0;
    int lexicalValue1110_326_0;
    int lexicalValue1110_337_0;
    moom.dM lexicalValue1110_341_0;
    net.minecraft.world.World lexicalValue1110_341_1;
    moom.DT lexicalValue1110_341_2;
    int lexicalValue1110_364_0;
    int lexicalValue1110_364_1;
    int[] spill1110_0;
    moom.dM spill1110_1;
    boolean spill1110_2;
    int spill1110_3;
    int spill1110_4;
    int spill1110_5;
    int spill1110_6;
    int spill1110_7;
    moom.dM spill1110_8;
    moom.fn spill1110_9;
    moom.fn spill1110_10;
    moom.fn spill1110_11;
    moom.fn spill1110_12;
    int spill1110_13;
    int spill1110_14;
    int spill1110_15;
    int spill1110_16;
    int spill1110_17;
    int spill1110_18;
    boolean spill1110_19;
    moom.fn spill1110_20;
    moom.fn spill1110_21;
    net.minecraft.world.World spill1110_22;
    moom.DT spill1110_23;
    moom.dM spill1110_24;
    net.minecraft.world.World spill1110_25;
    moom.DT spill1110_26;
    int spill1110_27;
    int spill1110_28;
    long life5_3;
    int life8_10;
    int life9_12;
    int[] life7_13;
    int life10_40;
    int life11_53;
    java.util.Iterator life12_59;
    moom.bs life13_66;
    int life12_85;
    int life13_126;
    net.minecraft.block.state.IBlockState life13_179;
    net.minecraft.block.state.IBlockState life11_341;
    java.util.Set life12_474;
    int life13_478;
    java.util.Iterator life14_503;
    moom.bs life15_510;
    lexical_join_390: {
    lexical_join_366: {
    lexical_join_364: {
    lexical_join_358: {
    lexical_join_341: {
    lexical_join_338: {
    lexical_join_337: {
    lexical_join_326: {
    lexical_join_322: {
    lexical_join_321: {
    lexical_join_306: {
    lexical_join_290: {
    lexical_join_280: {
    lexical_join_276: {
    lexical_join_247: {
    lexical_join_242: {
    lexical_join_240: {
    lexical_join_230: {
    lexical_join_219: {
    lexical_join_210: {
    lexical_join_207: {
    lexical_join_199: {
    lexical_join_196: {
    lexical_join_195: {
    lexical_join_170: {
    lexical_join_168: {
    lexical_join_167: {
    lexical_join_166: {
    lexical_join_152: {
    lexical_join_149: {
    lexical_join_125: {
    lexical_join_121: {
    lexical_join_119: {
    lexical_join_113: {
    lexical_join_91: {
    lexical_join_86: {
    lexical_join_85: {
    lexical_join_84: {
    lexical_join_67: {
    lexical_join_41: {
    lexical_join_31: {
    lexical_join_29: {
    lexical_join_28: {
    life5_3 = (moom.dM.S ^ 106732319295698L);
    spill1110_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_10 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dM.Q))))))).intValue();
    life9_12 = 1;
    life7_13 = spill1110_0;
    spill1110_1 = this;
    if (!((life7_13 != null))) {
        lexicalValue1110_29_0 = spill1110_1;
        break lexical_join_29;
    }
    if (!((((moom.dM)(spill1110_1)).J == moom.fn.i))) {
        break lexical_join_28;
    }
    spill1110_2 = ((moom.EA)(((net.minecraft.world.World)(p0)).v)).d();
    if (!((life7_13 != null))) {
        lexicalValue1110_31_0 = ((spill1110_2) ? 1 : 0);
        break lexical_join_31;
    }
    if (!((!spill1110_2))) {
        break lexical_join_28;
    }
    life9_12 = 2;
    }
    lexicalValue1110_29_0 = this;
    }
    lexicalValue1110_31_0 = ((moom.dM)(lexicalValue1110_29_0)).a(((net.minecraft.world.World)(p0)));
    }
    life10_40 = lexicalValue1110_31_0;
    spill1110_3 = life8_10;
    if (!((life7_13 != null))) {
        lexicalValue1110_41_0 = spill1110_3;
        break lexical_join_41;
    }
    if (!((spill1110_3 > 0))) {
        break lexical_join_242;
    }
    lexicalValue1110_41_0 = __sourceIntrinsic_b4b54c999db9_invokedynamic1110_12(21418, (9219617895135650321L ^ life5_3));
    }
    life11_53 = lexicalValue1110_41_0;
    this.R = ((int)(0));
    life12_59 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).iterator();
    lexical_cycle_48: while (true) {
    if (!(((java.util.Iterator)(life12_59)).hasNext())) {
        break lexical_join_67;
    }
    life13_66 = ((moom.bs)(((java.util.Iterator)(life12_59)).next()));
    life11_53 = ((moom.dM)(this)).a__sourceReturn_4a3edb3151(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(life13_66))))), ((int)(life11_53)));
    if (!((life7_13 != null))) {
        break lexical_join_247;
    }
    if (!((life7_13 == null))) { continue lexical_cycle_48; }
    break lexical_cycle_48;
    }
    }
    life12_85 = (life11_53 + life9_12);
    spill1110_4 = life12_85;
    if (!((life7_13 != null))) {
        lexicalValue1110_85_0 = spill1110_4;
        break lexical_join_85;
    }
    if (!((spill1110_4 < __sourceIntrinsic_b4b54c999db9_invokedynamic1110_21(19193, (922812062626790208L ^ life5_3))))) {
        break lexical_join_84;
    }
    spill1110_5 = life11_53;
    if (!((life7_13 != null))) {
        lexicalValue1110_91_0 = spill1110_5;
        break lexical_join_91;
    }
    if (!((spill1110_5 < 0))) {
        break lexical_join_86;
    }
    }
    lexicalValue1110_85_0 = -1;
    }
    life12_85 = lexicalValue1110_85_0;
    }
    lexicalValue1110_91_0 = ((moom.dM)(this)).c(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).a__DT())));
    }
    if (!((life7_13 != null))) {
        lexicalValue1110_125_0 = lexicalValue1110_91_0;
        break lexical_join_125;
    }
    if (!((lexicalValue1110_91_0 >= 0))) {
        break lexical_join_121;
    }
    life13_126 = ((moom.dM)(this)).c(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).a__DT())));
    spill1110_6 = life13_126;
    spill1110_7 = __sourceIntrinsic_b4b54c999db9_invokedynamic1110_26(25385, (5337112501851689620L ^ life5_3));
    if (!((life7_13 != null))) {
        lexicalValue1110_119_0 = spill1110_6;
        lexicalValue1110_119_1 = spill1110_7;
        break lexical_join_119;
    }
    if (!((spill1110_6 >= spill1110_7))) {
        break lexical_join_113;
    }
    life12_85 = life13_126;
    if (!((life7_13 == null))) {
        break lexical_join_121;
    }
    }
    lexicalValue1110_119_0 = life13_126;
    lexicalValue1110_119_1 = __sourceIntrinsic_b4b54c999db9_invokedynamic1110_27(25385, (5337112501851689620L ^ life5_3));
    }
    life12_85 = (lexicalValue1110_119_0 + lexicalValue1110_119_1);
    }
    spill1110_8 = this;
    if (!((life7_13 != null))) {
        lexicalValue1110_168_0 = spill1110_8;
        break lexical_join_168;
    }
    lexicalValue1110_125_0 = ((moom.dM)(spill1110_8)).R;
    }
    if (!((lexicalValue1110_125_0 >= 2))) {
        break lexical_join_167;
    }
    spill1110_9 = this.J;
    spill1110_10 = moom.fn.h;
    if (!((life7_13 != null))) {
        lexicalValue1110_170_0 = spill1110_9;
        lexicalValue1110_170_1 = spill1110_10;
        break lexical_join_170;
    }
    if (!((spill1110_9 == spill1110_10))) {
        break lexical_join_167;
    }
    life13_179 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).b__DT())));
    spill1110_11 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life13_179)).a__ch())).a__fn();
    if (!((life7_13 != null))) {
        lexicalValue1110_152_0 = spill1110_11;
        break lexical_join_152;
    }
    if (!(((moom.fn)(spill1110_11)).b__Boolean())) {
        break lexical_join_149;
    }
    life12_85 = 0;
    if (!((life7_13 == null))) {
        break lexical_join_167;
    }
    }
    lexicalValue1110_152_0 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life13_179)).a__ch())).a__fn();
    }
    spill1110_12 = this.J;
    if (!((life7_13 != null))) {
        lexicalValue1110_170_0 = lexicalValue1110_152_0;
        lexicalValue1110_170_1 = spill1110_12;
        break lexical_join_170;
    }
    if (!((lexicalValue1110_152_0 == spill1110_12))) {
        break lexical_join_167;
    }
    spill1110_13 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(life13_179)).a(((net.minecraft.block.properties.IProperty)(moom.dM.Q))))))).intValue();
    if (!((life7_13 != null))) {
        lexicalValue1110_166_0 = spill1110_13;
        break lexical_join_166;
    }
    if (!((spill1110_13 == 0))) {
        break lexical_join_167;
    }
    lexicalValue1110_166_0 = 0;
    }
    life12_85 = lexicalValue1110_166_0;
    }
    lexicalValue1110_168_0 = this;
    }
    lexicalValue1110_170_0 = ((moom.dM)(lexicalValue1110_168_0)).J;
    lexicalValue1110_170_1 = moom.fn.i;
    }
    if (!((lexicalValue1110_170_0 == lexicalValue1110_170_1))) {
        break lexical_join_195;
    }
    spill1110_14 = life12_85;
    spill1110_15 = __sourceIntrinsic_b4b54c999db9_invokedynamic1110_45(25385, (5337112501851689620L ^ life5_3));
    if (!((life7_13 != null))) {
        lexicalValue1110_199_0 = spill1110_14;
        lexicalValue1110_199_1 = spill1110_15;
        break lexical_join_199;
    }
    if (!((spill1110_14 < spill1110_15))) {
        break lexical_join_195;
    }
    spill1110_16 = life12_85;
    spill1110_17 = life8_10;
    if (!((life7_13 != null))) {
        lexicalValue1110_199_0 = spill1110_16;
        lexicalValue1110_199_1 = spill1110_17;
        break lexical_join_199;
    }
    if (!((spill1110_16 > spill1110_17))) {
        break lexical_join_195;
    }
    spill1110_18 = ((java.util.Random)(p3)).nextInt(((int)(4)));
    if (!((life7_13 != null))) {
        lexicalValue1110_196_0 = spill1110_18;
        break lexical_join_196;
    }
    if (!((spill1110_18 != 0))) {
        break lexical_join_195;
    }
    life10_40 = (life10_40 * 4);
    }
    lexicalValue1110_196_0 = life12_85;
    }
    if (!((life7_13 != null))) {
        lexicalValue1110_210_0 = lexicalValue1110_196_0;
        break lexical_join_210;
    }
    lexicalValue1110_199_0 = lexicalValue1110_196_0;
    lexicalValue1110_199_1 = life8_10;
    }
    if (!((lexicalValue1110_199_0 == lexicalValue1110_199_1))) {
        break lexical_join_207;
    }
    ((moom.dM)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    if (!((life7_13 == null))) {
        break lexical_join_240;
    }
    }
    life8_10 = life12_85;
    lexicalValue1110_210_0 = life12_85;
    }
    if (!((life7_13 != null))) {
        lexicalValue1110_230_0 = lexicalValue1110_210_0;
        break lexical_join_230;
    }
    if (!((lexicalValue1110_210_0 < 0))) {
        break lexical_join_219;
    }
    ((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)));
    if (!((life7_13 == null))) {
        break lexical_join_240;
    }
    }
    p2 = ((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.dM.Q)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(life12_85))))));
    lexicalValue1110_230_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1110_230_0);
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)), ((int)(life10_40)));
    ((net.minecraft.world.World)(p0)).b(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)));
    }
    if (!((life7_13 == null))) {
        break lexical_join_247;
    }
    }
    ((moom.dM)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    }
    life11_341 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).b__DT())));
    spill1110_19 = ((moom.dM)(this)).c__sourceReturn_6048bc1ea7(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p1)).b__DT())), ((net.minecraft.block.state.IBlockState)(life11_341)));
    if (!((life7_13 != null))) {
        lexicalValue1110_322_0 = ((spill1110_19) ? 1 : 0);
        break lexical_join_322;
    }
    if (!(spill1110_19)) {
        break lexical_join_321;
    }
    spill1110_20 = this.J;
    spill1110_21 = moom.fn.i;
    if (!((life7_13 != null))) {
        lexicalValue1110_276_0 = spill1110_20;
        lexicalValue1110_276_1 = spill1110_21;
        break lexical_join_276;
    }
    if (!((spill1110_20 == spill1110_21))) {
        break lexical_join_290;
    }
    spill1110_22 = p0;
    spill1110_23 = ((moom.DT)(p1)).b__DT();
    if (!((life7_13 != null))) {
        lexicalValue1110_280_0 = spill1110_22;
        lexicalValue1110_280_1 = spill1110_23;
        break lexical_join_280;
    }
    lexicalValue1110_276_0 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(spill1110_22)).a__fE(((moom.DT)(spill1110_23))))).a__ch())).a__fn();
    lexicalValue1110_276_1 = moom.fn.h;
    }
    if (!((lexicalValue1110_276_0 == lexicalValue1110_276_1))) {
        break lexical_join_290;
    }
    lexicalValue1110_280_0 = p0;
    lexicalValue1110_280_1 = ((moom.DT)(p1)).b__DT();
    }
    ((net.minecraft.world.World)(lexicalValue1110_280_0)).a(((moom.DT)(lexicalValue1110_280_1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b)).a__fE())));
    ((moom.dM)(this)).b__sourceReturn_bfedcc9a42(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p1)).b__DT())));
    return;
    }
    if (!((life8_10 >= __sourceIntrinsic_b4b54c999db9_invokedynamic1110_76(25385, (5337112501851689620L ^ life5_3))))) {
        break lexical_join_306;
    }
    ((moom.dM)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p1)).b__DT())), ((net.minecraft.block.state.IBlockState)(life11_341)), ((int)(life8_10)));
    if (!((life7_13 == null))) {
        break lexical_join_390;
    }
    }
    ((moom.dM)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p1)).b__DT())), ((net.minecraft.block.state.IBlockState)(life11_341)), ((int)((life8_10 + __sourceIntrinsic_b4b54c999db9_invokedynamic1110_80(25385, (5337112501851689620L ^ life5_3))))));
    if (!((life7_13 == null))) {
        break lexical_join_390;
    }
    }
    lexicalValue1110_322_0 = life8_10;
    }
    if (!((life7_13 != null))) {
        lexicalValue1110_326_0 = lexicalValue1110_322_0;
        break lexical_join_326;
    }
    if (!((lexicalValue1110_322_0 >= 0))) {
        break lexical_join_390;
    }
    lexicalValue1110_326_0 = life8_10;
    }
    if (!((life7_13 != null))) {
        lexicalValue1110_337_0 = lexicalValue1110_326_0;
        break lexical_join_337;
    }
    if (!((lexicalValue1110_326_0 != 0))) {
        break lexical_join_338;
    }
    spill1110_24 = this;
    spill1110_25 = p0;
    spill1110_26 = ((moom.DT)(p1)).b__DT();
    if (!((life7_13 != null))) {
        lexicalValue1110_341_0 = spill1110_24;
        lexicalValue1110_341_1 = spill1110_25;
        lexicalValue1110_341_2 = spill1110_26;
        break lexical_join_341;
    }
    lexicalValue1110_337_0 = ((((moom.dM)(spill1110_24)).b__Boolean(((net.minecraft.world.World)(spill1110_25)), ((moom.DT)(spill1110_26)), ((net.minecraft.block.state.IBlockState)(life11_341)))) ? 1 : 0);
    }
    if (!((lexicalValue1110_337_0 != 0))) {
        break lexical_join_390;
    }
    }
    lexicalValue1110_341_0 = this;
    lexicalValue1110_341_1 = p0;
    lexicalValue1110_341_2 = p1;
    }
    life12_474 = ((moom.dM)(lexicalValue1110_341_0)).a__sourceReturn_88903421bf(((net.minecraft.world.World)(lexicalValue1110_341_1)), ((moom.DT)(lexicalValue1110_341_2)));
    life13_478 = (life8_10 + life9_12);
    spill1110_27 = life8_10;
    spill1110_28 = __sourceIntrinsic_b4b54c999db9_invokedynamic1110_86(25385, (5337112501851689620L ^ life5_3));
    if (!((life7_13 != null))) {
        lexicalValue1110_364_0 = spill1110_27;
        lexicalValue1110_364_1 = spill1110_28;
        break lexical_join_364;
    }
    if (!((spill1110_27 >= spill1110_28))) {
        break lexical_join_358;
    }
    life13_478 = 1;
    }
    lexicalValue1110_364_0 = life13_478;
    lexicalValue1110_364_1 = __sourceIntrinsic_b4b54c999db9_invokedynamic1110_87(25385, (5337112501851689620L ^ life5_3));
    }
    if (!((lexicalValue1110_364_0 >= lexicalValue1110_364_1))) {
        break lexical_join_366;
    }
    return;
    }
    life14_503 = ((java.util.Set)(life12_474)).iterator();
    lexical_cycle_369: while (true) {
    if (!(((java.util.Iterator)(life14_503)).hasNext())) {
        break lexical_join_390;
    }
    life15_510 = ((moom.bs)(((java.util.Iterator)(life14_503)).next()));
    ((moom.dM)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(life15_510))))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(life15_510)))))))), ((int)(life13_478)));
    if (!((life7_13 == null))) { continue lexical_cycle_369; }
    break lexical_cycle_369;
    }
    }
    return;
}


private boolean c__sourceReturn_6048bc1ea7(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
moom.fn forwardValue329_18_0;
    moom.fn forwardValue329_18_1;
    int forwardValue329_28_0;
    int forwardValue329_30_0;
    int[] spill329_0;
    moom.fn spill329_1;
    moom.fn spill329_2;
    boolean spill329_3;
    long life4_3;
    moom.fn life7_8;
    int[] life6_9;
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_18: {
    life4_3 = (moom.dM.S ^ 37495949172577L);
    spill329_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_8 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(p2)).a__ch())).a__fn();
    life6_9 = spill329_0;
    spill329_1 = life7_8;
    spill329_2 = this.J;
    if (!((life6_9 != null))) {
        forwardValue329_18_0 = spill329_1;
        forwardValue329_18_1 = spill329_2;
        break forward_join_18;
    }
    if (!((spill329_1 != spill329_2))) {
        break forward_join_29;
    }
    forwardValue329_18_0 = life7_8;
    forwardValue329_18_1 = moom.fn.i;
    }
    if (!((forwardValue329_18_0 != forwardValue329_18_1))) {
        break forward_join_29;
    }
    spill329_3 = ((moom.dM)(this)).b__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    if (!((life6_9 != null))) {
        forwardValue329_28_0 = ((spill329_3) ? 1 : 0);
        break forward_join_28;
    }
    if (!((!spill329_3))) {
        break forward_join_29;
    }
    forwardValue329_28_0 = 1;
    }
    forwardValue329_30_0 = forwardValue329_28_0;
    break forward_join_30;
    }
    forwardValue329_30_0 = 0;
    }
    return ((forwardValue329_30_0) != 0);
}


private static int c(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x78A2;
        if (Y[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = X[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])Z.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    Z.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/dM", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            dM.Y[n2] = n3;
        }
        return Y[n2];
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.dM.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral7312_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/dM"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private void d(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.dN)(moom.dM.a__dN(((moom.fn)(this.J))))).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dM.Q)), ((java.lang.Comparable)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dM.Q)))))))))), ((int)(2)));
    return;
}


protected int a__sourceReturn_4a3edb3151(net.minecraft.world.World p0, moom.DT p1, int p2) {
int forwardValue3262_18_0;
    int forwardValue3262_28_0;
    int forwardValue3262_39_0;
    int forwardValue3262_43_0;
    int forwardValue3262_48_0;
    int forwardValue3262_50_0;
    int[] spill3262_0;
    int spill3262_1;
    long life4_3;
    int life7_9;
    int[] life6_10;
    forward_join_50: {
    forward_join_49: {
    forward_join_48: {
    forward_join_43: {
    forward_join_39: {
    forward_join_38: {
    forward_join_28: {
    forward_join_27: {
    forward_join_18: {
    forward_join_17: {
    life4_3 = (moom.dM.S ^ 108576200407325L);
    spill3262_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_9 = ((moom.dM)(this)).c(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
    life6_10 = spill3262_0;
    spill3262_1 = life7_9;
    if (!((life6_10 != null))) {
        forwardValue3262_18_0 = spill3262_1;
        break forward_join_18;
    }
    if (!((spill3262_1 < 0))) {
        break forward_join_17;
    }
    return p2;
    }
    forwardValue3262_18_0 = life7_9;
    }
    if (!((life6_10 != null))) {
        forwardValue3262_28_0 = forwardValue3262_18_0;
        break forward_join_28;
    }
    if (!((forwardValue3262_18_0 == 0))) {
        break forward_join_27;
    }
    moom.dM __stackOp3262_3_0 = this;
    ((moom.dM)(__stackOp3262_3_0)).R = ((int)((((moom.dM)(__stackOp3262_3_0)).R + 1)));
    }
    forwardValue3262_28_0 = life7_9;
    }
    if (!((life6_10 != null))) {
        forwardValue3262_39_0 = forwardValue3262_28_0;
        break forward_join_39;
    }
    if (!((forwardValue3262_28_0 >= __sourceIntrinsic_949cb5aed00f_invokedynamic3262_6(25385, (5337108770865275739L ^ life4_3))))) {
        break forward_join_38;
    }
    life7_9 = 0;
    }
    forwardValue3262_39_0 = p2;
    }
    if (!((life6_10 != null))) {
        forwardValue3262_43_0 = forwardValue3262_39_0;
        break forward_join_43;
    }
    if (!((forwardValue3262_39_0 >= 0))) {
        break forward_join_49;
    }
    forwardValue3262_43_0 = life7_9;
    }
    if (!((life6_10 != null))) {
        forwardValue3262_48_0 = forwardValue3262_43_0;
        break forward_join_48;
    }
    if (!((forwardValue3262_43_0 >= p2))) {
        break forward_join_49;
    }
    forwardValue3262_48_0 = p2;
    }
    forwardValue3262_50_0 = forwardValue3262_48_0;
    break forward_join_50;
    }
    forwardValue3262_50_0 = life7_9;
    }
    return forwardValue3262_50_0;
}


private int a(net.minecraft.world.World p0, moom.DT p1, int p2, moom.bs p3) {
net.minecraft.block.Block lexicalValue1109_45_0;
    net.minecraft.block.state.IBlockState lexicalValue1109_50_0;
    int lexicalValue1109_63_0;
    int lexicalValue1109_69_0;
    int lexicalValue1109_82_0;
    int lexicalValue1109_89_0;
    int[] spill1109_0;
    moom.dM spill1109_1;
    net.minecraft.block.state.IBlockState spill1109_2;
    int spill1109_3;
    int spill1109_4;
    long life5_3;
    int life8_10;
    java.util.Iterator life9_13;
    int[] life7_14;
    moom.bs life10_21;
    moom.DT life11_28;
    net.minecraft.block.state.IBlockState life12_32;
    int life13_111;
    lexical_join_92: {
    life5_3 = (moom.dM.S ^ 19775881325487L);
    spill1109_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_10 = __sourceIntrinsic_43aa8800708a_invokedynamic1109_2(15133, (8702124180969925080L ^ life5_3));
    life9_13 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).iterator();
    life7_14 = spill1109_0;
    lexical_cycle_15: while (true) {
    lexical_join_90: {
    lexical_join_89: {
    lexical_join_82: {
    lexical_join_69: {
    lexical_join_68: {
    lexical_join_63: {
    lexical_join_57: {
    lexical_join_50: {
    lexical_join_45: {
    if (!(((java.util.Iterator)(life9_13)).hasNext())) {
        break lexical_join_92;
    }
    life10_21 = ((moom.bs)(((java.util.Iterator)(life9_13)).next()));
    if (!((life10_21 != p3))) {
        break lexical_join_90;
    }
    life11_28 = ((moom.DT)(p1)).a(((moom.bs)(life10_21)));
    life12_32 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life11_28)));
    spill1109_1 = this;
    if (!((life7_14 != null))) {
        lexicalValue1109_45_0 = spill1109_1;
        break lexical_join_45;
    }
    if (!((!((moom.dM)(spill1109_1)).b__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(life11_28)), ((net.minecraft.block.state.IBlockState)(life12_32)))))) {
        break lexical_join_90;
    }
    spill1109_2 = life12_32;
    if (!((life7_14 != null))) {
        lexicalValue1109_50_0 = spill1109_2;
        break lexical_join_50;
    }
    lexicalValue1109_45_0 = ((net.minecraft.block.state.IBlockState)(spill1109_2)).a__ch();
    }
    if (!((((net.minecraft.block.Block)(lexicalValue1109_45_0)).a__fn() == this.J))) {
        break lexical_join_57;
    }
    lexicalValue1109_50_0 = life12_32;
    }
    spill1109_3 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(lexicalValue1109_50_0)).a(((net.minecraft.block.properties.IProperty)(moom.dM.Q))))))).intValue();
    if (!((life7_14 != null))) {
        lexicalValue1109_63_0 = spill1109_3;
        break lexical_join_63;
    }
    if (!((spill1109_3 > 0))) {
        break lexical_join_90;
    }
    }
    lexicalValue1109_63_0 = ((((moom.dM)(this)).b__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(life11_28)).b__DT())), ((net.minecraft.block.state.IBlockState)(life12_32)))) ? 1 : 0);
    }
    if (!((life7_14 != null))) {
        lexicalValue1109_69_0 = lexicalValue1109_63_0;
        break lexical_join_69;
    }
    if (!((lexicalValue1109_63_0 == 0))) {
        break lexical_join_68;
    }
    return p2;
    }
    lexicalValue1109_69_0 = p2;
    }
    if (!((life7_14 != null))) {
        lexicalValue1109_82_0 = lexicalValue1109_69_0;
        break lexical_join_82;
    }
    if (!((lexicalValue1109_69_0 < 4))) {
        break lexical_join_90;
    }
    lexicalValue1109_82_0 = ((moom.dM)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(life11_28)), ((int)((p2 + 1))), ((moom.bs)(((moom.bs)(life10_21)).a__bs())));
    }
    life13_111 = lexicalValue1109_82_0;
    spill1109_4 = life13_111;
    if (!((life7_14 != null))) {
        lexicalValue1109_89_0 = spill1109_4;
        break lexical_join_89;
    }
    if (!((spill1109_4 < life8_10))) {
        break lexical_join_90;
    }
    lexicalValue1109_89_0 = life13_111;
    }
    life8_10 = lexicalValue1109_89_0;
    }
    if (!((life7_14 == null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    return life8_10;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private java.util.Set<moom.bs> a__sourceReturn_88903421bf(net.minecraft.world.World p0, moom.DT p1) {
net.minecraft.block.Block lexicalValue1108_45_0;
    net.minecraft.block.state.IBlockState lexicalValue1108_50_0;
    int lexicalValue1108_66_0;
    int lexicalValue1108_80_0;
    int lexicalValue1108_92_0;
    int lexicalValue1108_92_1;
    int lexicalValue1108_98_0;
    int[] spill1108_0;
    moom.dM spill1108_1;
    net.minecraft.block.state.IBlockState spill1108_2;
    int spill1108_3;
    int spill1108_4;
    int spill1108_5;
    int spill1108_6;
    long life3_3;
    int life6_9;
    java.util.EnumSet life7_12;
    java.util.Iterator life8_16;
    int[] life5_17;
    moom.bs life9_24;
    moom.DT life10_28;
    net.minecraft.block.state.IBlockState life11_32;
    int life12_97;
    lexical_join_101: {
    life3_3 = (moom.dM.S ^ 95529900354457L);
    life6_9 = __sourceIntrinsic_f1457ce8279b_invokedynamic1108_1(16729, (4924436060716749736L ^ life3_3));
    life7_12 = java.util.EnumSet.noneOf(((java.lang.Class)(moom.bs.class)));
    spill1108_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_16 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).iterator();
    life5_17 = spill1108_0;
    lexical_cycle_18: while (true) {
    lexical_join_99: {
    lexical_join_98: {
    lexical_join_92: {
    lexical_join_88: {
    lexical_join_81: {
    lexical_join_80: {
    lexical_join_79: {
    lexical_join_66: {
    lexical_join_57: {
    lexical_join_50: {
    lexical_join_45: {
    if (!(((java.util.Iterator)(life8_16)).hasNext())) {
        break lexical_join_101;
    }
    life9_24 = ((moom.bs)(((java.util.Iterator)(life8_16)).next()));
    life10_28 = ((moom.DT)(p1)).a(((moom.bs)(life9_24)));
    life11_32 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life10_28)));
    spill1108_1 = this;
    if (!((life5_17 != null))) {
        lexicalValue1108_45_0 = spill1108_1;
        break lexical_join_45;
    }
    if (!((!((moom.dM)(spill1108_1)).b__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(life10_28)), ((net.minecraft.block.state.IBlockState)(life11_32)))))) {
        break lexical_join_99;
    }
    spill1108_2 = life11_32;
    if (!((life5_17 != null))) {
        lexicalValue1108_50_0 = spill1108_2;
        break lexical_join_50;
    }
    lexicalValue1108_45_0 = ((net.minecraft.block.state.IBlockState)(spill1108_2)).a__ch();
    }
    if (!((((net.minecraft.block.Block)(lexicalValue1108_45_0)).a__fn() == this.J))) {
        break lexical_join_57;
    }
    lexicalValue1108_50_0 = life11_32;
    }
    spill1108_3 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(lexicalValue1108_50_0)).a(((net.minecraft.block.properties.IProperty)(moom.dM.Q))))))).intValue();
    if (!((life5_17 != null))) {
        lexicalValue1108_66_0 = spill1108_3;
        break lexical_join_66;
    }
    if (!((spill1108_3 > 0))) {
        break lexical_join_99;
    }
    }
    lexicalValue1108_66_0 = ((((moom.dM)(this)).b__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(life10_28)).b__DT())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(life10_28)).b__DT()))))))) ? 1 : 0);
    }
    if (!((life5_17 != null))) {
        lexicalValue1108_80_0 = lexicalValue1108_66_0;
        break lexical_join_80;
    }
    if (!((lexicalValue1108_66_0 != 0))) {
        break lexical_join_79;
    }
    life12_97 = ((moom.dM)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(life10_28)), ((int)(1)), ((moom.bs)(((moom.bs)(life9_24)).a__bs())));
    if (!((life5_17 == null))) {
        break lexical_join_81;
    }
    }
    lexicalValue1108_80_0 = 0;
    }
    life12_97 = lexicalValue1108_80_0;
    }
    spill1108_4 = life12_97;
    spill1108_5 = life6_9;
    if (!((life5_17 != null))) {
        lexicalValue1108_92_0 = spill1108_4;
        lexicalValue1108_92_1 = spill1108_5;
        break lexical_join_92;
    }
    if (!((spill1108_4 < spill1108_5))) {
        break lexical_join_88;
    }
    ((java.util.Set)(life7_12)).clear();
    }
    spill1108_6 = life12_97;
    if (!((life5_17 != null))) {
        lexicalValue1108_98_0 = spill1108_6;
        break lexical_join_98;
    }
    lexicalValue1108_92_0 = spill1108_6;
    lexicalValue1108_92_1 = life6_9;
    }
    if (!((lexicalValue1108_92_0 <= lexicalValue1108_92_1))) {
        break lexical_join_99;
    }
    ((java.util.Set)(life7_12)).add(((java.lang.Object)(life9_24)));
    lexicalValue1108_98_0 = life12_97;
    }
    life6_9 = lexicalValue1108_98_0;
    }
    if (!((life5_17 == null))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    return life7_12;
}


private static native <E extends Throwable> int __sourceIntrinsic_f1457ce8279b_invokedynamic1108_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_949cb5aed00f_invokedynamic3262_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_43aa8800708a_invokedynamic1109_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic1110_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic1110_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic1110_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic1110_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic1110_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic1110_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic1110_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic1110_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic1110_87(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral7312_0() throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
