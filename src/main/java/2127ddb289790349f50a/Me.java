package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Me {

public static moom.bs[][] a;

public static moom.bs[][] b;

private static int c;

private static int d;

private static int e;

private static net.minecraft.world.World f;

private static int g;

private static int h;

private static long i;

private static long[] j;

private static java.lang.Integer[] k;

private static java.util.Map l;

public Me() {
super();
}


static {
i = ((long)(((moom._a)(moom._c.a(((long)(2965217012947886273L)), ((long)(-5376104476205597339L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(34139276940165L)))));
    long local11_life6 = (moom.Me.i ^ 30417293057392L);
    l = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1018_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1018_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1018_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1018_14 = new byte[8];
    (__sourceSpill1018_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1018_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1018_16 = __sourceSpill1018_14;
    ((javax.crypto.Cipher)(__sourceSpill1018_11)).init(((int)(__sourceSpill1018_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1018_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1018_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[6];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "ÑÀW6_¶é¶ºY\001E\033GP#i 01ÕÀ\004þ@Æ5"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1018_25 = local4_life21;
        int __sourceSpill1018_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1018_25)).substring(((int)(__sourceSpill1018_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1018_30 = local6_life19;
        int __sourceSpill1018_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1018_33 = new byte[8];
        (__sourceSpill1018_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1018_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1018_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1018_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1018_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1018_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1018_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1018_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1018_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1018_34)).doFinal(((byte[])(__sourceSpill1018_33)));
        (__sourceSpill1018_30)[__sourceSpill1018_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "Ü\006Ñn6ô­xu\n\006Ac]Â"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1018_38 = local4_life21;
        int __sourceSpill1018_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1018_38)).substring(((int)(__sourceSpill1018_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1018_43 = local6_life19;
        int __sourceSpill1018_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1018_46 = new byte[8];
        (__sourceSpill1018_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1018_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1018_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1018_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1018_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1018_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1018_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1018_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1018_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1018_47)).doFinal(((byte[])(__sourceSpill1018_46)));
        (__sourceSpill1018_43)[__sourceSpill1018_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    j = ((long[])(local6_life19));
    k = ((java.lang.Integer[])(new java.lang.Integer[6]));
    a = ((moom.bs[][])(moom.Me.a(((boolean)(false)))));
    b = ((moom.bs[][])(moom.Me.a(((boolean)(true)))));
    c = ((int)(0));
    d = ((int)(-1));
    e = ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1018_58(29368, (5437028343314138488L ^ local11_life6))));
    f = ((net.minecraft.world.World)(null));
    g = ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1018_61(15988, (6453578072143563184L ^ local11_life6))));
    h = ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1018_63(8395, (4765309085542422280L ^ local11_life6))));
}

private static native <E extends Throwable> int __sourceHandlerCall_0b193a61c00518a2506b(net.minecraft.world.World a0, net.minecraft.entity.Entity a1, int a2) throws E;
private static final class __SourceHandler_0b193a61c00518a2506b {

public static int f795(net.minecraft.world.World p0, net.minecraft.entity.Entity p1, int p2) throws Throwable {
    net.minecraft.world.World forestValue795_69_0;
    int forestValue795_73_0;
    int forestValue795_75_0;
    int forestValue795_81_0;
    int forestValue795_109_0;
    int forestValue795_111_0;
    int forestValue795_118_0;
    int forestValue795_119_0;
    int forestValue795_119_1;
    int forestValue795_159_0;
    int forestValue795_164_0;
    java.util.Map forestValue795_179_0;
    int forestValue795_202_0;
    int forestValue795_245_0;
    int forestValue795_245_1;
    int forestValue795_247_0;
    int forestValue795_260_0;
    int forestValue795_273_0;
    net.minecraft.entity.Entity[] spill795_0;
    net.minecraft.world.World spill795_1;
    int spill795_2;
    int spill795_3;
    int spill795_4;
    int spill795_5;
    boolean spill795_6;
    boolean spill795_7;
    java.util.Map spill795_8;
    int spill795_9;
    int spill795_10;
    boolean spill795_11;
    int spill795_12;
    int spill795_13;
    int spill795_14;
    int spill795_15;
    int spill795_16;
    long life3_3;
    int life6_10;
    net.minecraft.entity.Entity[] life5_11;
    int life7_17;
    int life8_23;
    net.minecraft.world.chunk.Chunk life9_28;
    int life10_32;
    int life11_36;
    int life12_40;
    int life13_44;
    int life14_101;
    int life15_135;
    int life16_146;
    net.minecraft.world.chunk.Chunk life17_158;
    moom.Fs[] life18_172;
    int life19_177;
    moom.Fs life20_186;
    java.util.Map life19_229;
    java.util.Iterator life20_242;
    moom.DT life21_251;
    int life22_256;
    net.minecraft.util.ClassInheritanceMultiMap[] life19_278;
    int life20_283;
    net.minecraft.util.ClassInheritanceMultiMap life21_292;
    forest_join_274: {
    forest_join_273: {
    forest_join_270: {
    forest_join_260: {
    forest_join_259: {
    forest_join_109: {
    forest_join_108: {
    forest_join_104: {
    forest_join_98: {
    forest_join_92: {
    forest_join_86: {
    forest_join_81: {
    forest_join_80: {
    forest_join_75: {
    forest_join_74: {
    forest_join_73: {
    forest_join_69: {
    forest_join_60: {
    life3_3 = (__fieldRead795_0() ^ 30131161817749L);
    spill795_0 = __call795_1();
    life6_10 = (__call795_3(__fieldRead795_2(p1)) >> 4);
    life5_11 = spill795_0;
    life7_17 = (__call795_5(__fieldRead795_4(p1)) >> 4);
    life8_23 = (__call795_7(__fieldRead795_6(p1)) >> 4);
    life9_28 = __call795_8(p0, life6_10, life8_23);
    life10_32 = (life6_10 - p2);
    life11_36 = (life6_10 + p2);
    life12_40 = (life8_23 - p2);
    life13_44 = (life8_23 + p2);
    spill795_1 = p0;
    if (!((life5_11 == null))) {
        forestValue795_69_0 = spill795_1;
        break forest_join_69;
    }
    if (!((spill795_1 == __fieldRead795_9()))) {
        break forest_join_60;
    }
    spill795_2 = life6_10;
    if (!((life5_11 == null))) {
        forestValue795_73_0 = spill795_2;
        break forest_join_73;
    }
    if (!((spill795_2 == __fieldRead795_10()))) {
        break forest_join_60;
    }
    spill795_3 = life8_23;
    if (!((life5_11 == null))) {
        forestValue795_75_0 = spill795_3;
        break forest_join_75;
    }
    if (!((spill795_3 != __fieldRead795_11()))) {
        break forest_join_74;
    }
    }
    __fieldWrite795_12(0);
    __fieldWrite795_14(__invokedynamic795_13(30771, (5816864177942409239L ^ life3_3)));
    forestValue795_69_0 = p0;
    }
    __fieldWrite795_15(forestValue795_69_0);
    __fieldWrite795_16(life6_10);
    forestValue795_73_0 = life8_23;
    }
    __fieldWrite795_17(forestValue795_73_0);
    }
    forestValue795_75_0 = __fieldRead795_18();
    }
    if (!((life5_11 == null))) {
        forestValue795_81_0 = forestValue795_75_0;
        break forest_join_81;
    }
    if (!((forestValue795_75_0 == 0))) {
        break forest_join_80;
    }
    __fieldWrite795_19(-1);
    }
    forestValue795_81_0 = __fieldRead795_20();
    }
    life14_101 = forestValue795_81_0;
    spill795_4 = __fieldRead795_21();
    if (!((life5_11 == null))) {
        forestValue795_109_0 = spill795_4;
        break forest_join_109;
    }
    switch (spill795_4) {
case 0:
{
        break forest_join_86;
    }
case 1:
{
        break forest_join_92;
    }
case 2:
{
        break forest_join_98;
    }
case 3:
{
        break forest_join_104;
    }
default:
{
        break forest_join_108;
    }
}
    }
    life11_36 = life6_10;
    life13_44 = life8_23;
    if (!((life5_11 != null))) {
        break forest_join_108;
    }
    }
    life10_32 = life6_10;
    life13_44 = life8_23;
    if (!((life5_11 != null))) {
        break forest_join_108;
    }
    }
    life11_36 = life6_10;
    life12_40 = life8_23;
    if (!((life5_11 != null))) {
        break forest_join_108;
    }
    }
    life10_32 = life6_10;
    life12_40 = life8_23;
    }
    forestValue795_109_0 = life10_32;
    }
    life15_135 = forestValue795_109_0;
    forest_cycle_110: while (true) {
    forest_join_256: {
    forestValue795_111_0 = life15_135;
    forest_cycle_111: while (true) {
    if (!((forestValue795_111_0 < life11_36))) {
        break forest_join_259;
    }
    spill795_5 = life12_40;
    if (!((life5_11 == null))) {
        forestValue795_260_0 = spill795_5;
        break forest_join_260;
    }
    life16_146 = spill795_5;
    forest_cycle_117: while (true) {
    forest_join_254: {
    forest_join_253: {
    forestValue795_118_0 = life16_146;
    forest_cycle_118: while (true) {
    forest_join_205: {
    forestValue795_119_0 = forestValue795_118_0;
    forestValue795_119_1 = life13_44;
    forest_cycle_119: while (true) {
    forest_join_179: {
    forest_join_170: {
    if (!((forestValue795_119_0 < forestValue795_119_1))) {
        break forest_join_256;
    }
    life17_158 = __call795_22(p0, life15_135, life16_146);
    if (!((life5_11 == null))) {
        break forest_join_254;
    }
    spill795_6 = __call795_23(life17_158);
    if (!((life5_11 == null))) {
        forestValue795_111_0 = __integerCategory795_24(spill795_6);
        continue forest_cycle_111;
    }
    if (!((!spill795_6))) {
        break forest_join_253;
    }
    life18_172 = __call795_25(life17_158);
    life19_177 = ((life18_172).length - 1);
    forest_cycle_140: while (true) {
    forest_join_168: {
    forest_join_167: {
    forest_join_164: {
    forest_join_159: {
    if (!((life19_177 > life14_101))) {
        break forest_join_170;
    }
    life20_186 = (life18_172)[life19_177];
    if (!((life5_11 == null))) {
        break forest_join_254;
    }
    if (!((life5_11 == null))) {
        break forest_join_168;
    }
    if (!((life20_186 != null))) {
        break forest_join_167;
    }
    spill795_7 = __call795_26(life20_186);
    if (!((life5_11 == null))) {
        forestValue795_159_0 = __integerCategory795_27(spill795_7);
        break forest_join_159;
    }
    if (!((!spill795_7))) {
        break forest_join_167;
    }
    forestValue795_159_0 = life19_177;
    }
    if (!((life5_11 == null))) {
        forestValue795_164_0 = forestValue795_159_0;
        break forest_join_164;
    }
    if (!((forestValue795_159_0 > life14_101))) {
        break forest_join_170;
    }
    forestValue795_164_0 = life19_177;
    }
    life14_101 = forestValue795_164_0;
    if (!((life5_11 != null))) {
        break forest_join_170;
    }
    }
    life19_177 += -1;
    }
    if (!((life5_11 != null))) {
        continue forest_cycle_140;
    }
    break forest_cycle_140;
    }
    }
    life19_229 = __call795_28(life17_158);
    spill795_8 = life19_229;
    if (!((life5_11 == null))) {
        forestValue795_179_0 = spill795_8;
        break forest_join_179;
    }
    if (!((!__call795_29(spill795_8)))) {
        break forest_join_205;
    }
    forestValue795_179_0 = life19_229;
    }
    life20_242 = __call795_31(__call795_30(forestValue795_179_0));
    forest_cycle_182: while (true) {
    forest_join_203: {
    forest_join_202: {
    if (!(__call795_32(life20_242))) {
        break forest_join_205;
    }
    life21_251 = __cast795_34(__call795_33(life20_242));
    life22_256 = (__call795_35(life21_251) >> 4);
    spill795_9 = life22_256;
    if (!((life5_11 == null))) {
        forestValue795_202_0 = spill795_9;
        break forest_join_202;
    }
    spill795_10 = life14_101;
    if (!((life5_11 == null))) {
        forestValue795_119_0 = spill795_9;
        forestValue795_119_1 = spill795_10;
        continue forest_cycle_119;
    }
    if (!((spill795_9 > spill795_10))) {
        break forest_join_203;
    }
    forestValue795_202_0 = life22_256;
    }
    life14_101 = forestValue795_202_0;
    }
    if (!((life5_11 != null))) {
        continue forest_cycle_182;
    }
    break forest_cycle_182;
    }
    break forest_cycle_119;
    }
    }
    life19_278 = __call795_36(life17_158);
    life20_283 = ((life19_278).length - 1);
    forest_cycle_213: while (true) {
    forest_join_251: {
    forest_join_250: {
    forest_join_247: {
    forest_join_245: {
    forest_join_241: {
    if (!((life20_283 > life14_101))) {
        break forest_join_253;
    }
    life21_292 = (life19_278)[life20_283];
    if (!((life5_11 == null))) {
        break forest_join_251;
    }
    spill795_11 = __call795_37(life21_292);
    if (!((life5_11 == null))) {
        forestValue795_118_0 = __integerCategory795_38(spill795_11);
        continue forest_cycle_118;
    }
    if (!((!spill795_11))) {
        break forest_join_250;
    }
    if (!((life17_158 == life9_28))) {
        break forest_join_241;
    }
    spill795_12 = life20_283;
    spill795_13 = life7_17;
    if (!((life5_11 == null))) {
        forestValue795_245_0 = spill795_12;
        forestValue795_245_1 = spill795_13;
        break forest_join_245;
    }
    if (!((spill795_12 == spill795_13))) {
        break forest_join_241;
    }
    spill795_14 = __call795_39(life21_292);
    spill795_15 = 1;
    if (!((life5_11 == null))) {
        forestValue795_245_0 = spill795_14;
        forestValue795_245_1 = spill795_15;
        break forest_join_245;
    }
    if (!((spill795_14 != spill795_15))) {
        break forest_join_250;
    }
    }
    spill795_16 = life20_283;
    if (!((life5_11 == null))) {
        forestValue795_247_0 = spill795_16;
        break forest_join_247;
    }
    forestValue795_245_0 = spill795_16;
    forestValue795_245_1 = life14_101;
    }
    if (!((forestValue795_245_0 > forestValue795_245_1))) {
        break forest_join_253;
    }
    forestValue795_247_0 = life20_283;
    }
    life14_101 = forestValue795_247_0;
    if (!((life5_11 != null))) {
        break forest_join_253;
    }
    }
    life20_283 += -1;
    }
    if (!((life5_11 != null))) {
        continue forest_cycle_213;
    }
    break forest_cycle_213;
    }
    break forest_cycle_118;
    }
    }
    life16_146 += 1;
    }
    if (!((life5_11 != null))) {
        continue forest_cycle_117;
    }
    break forest_cycle_117;
    }
    break forest_cycle_111;
    }
    }
    life15_135 += 1;
    if (!((life5_11 != null))) {
        continue forest_cycle_110;
    }
    break forest_cycle_110;
    }
    }
    forestValue795_260_0 = __fieldRead795_40();
    }
    if (!((life5_11 == null))) {
        forestValue795_273_0 = forestValue795_260_0;
        break forest_join_273;
    }
    if (!((forestValue795_260_0 < 3))) {
        break forest_join_270;
    }
    __fieldWrite795_41(life14_101);
    life14_101 = __fieldRead795_42();
    if (!((life5_11 != null))) {
        break forest_join_274;
    }
    }
    __fieldWrite795_43(life14_101);
    forestValue795_273_0 = -1;
    }
    __fieldWrite795_44(forestValue795_273_0);
    }
    __fieldWrite795_46(((__fieldRead795_45() + 1) % 4));
    return (life14_101 << 4);
}
public static int h795_0(java.util.ConcurrentModificationException p0) throws Throwable {
    throw __call3079500_0(p0);
}
public static int h795_1(java.util.ConcurrentModificationException p0) throws Throwable {
    throw __call3079501_0(p0);
}
public static int h795_2(java.util.ConcurrentModificationException p0) throws Throwable {
    throw __call3079502_0(p0);
}
public static int h795_3(java.util.ConcurrentModificationException p0) throws Throwable {
    throw __call3079503_0(p0);
}
public static int h795_4(java.util.ConcurrentModificationException p0) throws Throwable {
    throw __call3079504_0(p0);
}
public static int h795_5(java.util.ConcurrentModificationException p0) throws Throwable {
    throw __call3079505_0(p0);
}
public static int h795_6(java.util.ConcurrentModificationException p0) throws Throwable {
    throw __call3079506_0(p0);
}
public static int h795_7(java.util.ConcurrentModificationException p0) throws Throwable {
    throw __call3079507_0(p0);
}
public static int h795_8(java.util.ConcurrentModificationException p0) throws Throwable {
    throw __call3079508_0(p0);
}
public static int h795_9(java.util.ConcurrentModificationException p0) throws Throwable {
    throw __call3079509_0(p0);
}
public static int h795_10(java.util.ConcurrentModificationException p0) throws Throwable {
    throw __call3079510_0(p0);
}
public static int h795_11(java.util.ConcurrentModificationException p0) throws Throwable {
    throw __call3079511_0(p0);
}
public static int h795_12(java.util.ConcurrentModificationException p0) throws Throwable {
    throw __call3079512_0(p0);
}
public static int h795_13(java.util.ConcurrentModificationException p0) throws Throwable {
    throw __call3079513_0(p0);
}
public static int h795_14(java.util.ConcurrentModificationException p0) throws Throwable {
    throw __call3079514_0(p0);
}
public static int h795_15(java.util.ConcurrentModificationException p0) throws Throwable {
    throw __call3079515_0(p0);
}
public static int h795_16(java.util.ConcurrentModificationException p0) throws Throwable {
    throw __call3079516_0(p0);
}
public static int h795_17(java.util.ConcurrentModificationException p0) throws Throwable {
    throw __call3079517_0(p0);
}
public static int h795_18(java.util.ConcurrentModificationException p0) throws Throwable {
    throw __call3079518_0(p0);
}
public static int h795_19(java.util.ConcurrentModificationException p0) throws Throwable {
    throw __call3079519_0(p0);
}
public static int h795_20(java.util.ConcurrentModificationException p0, net.minecraft.world.World p1, net.minecraft.entity.Entity[] p2, int p3, net.minecraft.world.chunk.Chunk p4, int p5, int p6, int p7, int p8, int p9, int p10, net.minecraft.world.chunk.Chunk p11, moom.Fs[] p12, int p13) throws Throwable {
    int forestValue3079520_42_0;
    int forestValue3079520_42_1;
    int forestValue3079520_44_0;
    int forestValue3079520_51_0;
    int forestValue3079520_52_0;
    int forestValue3079520_52_1;
    int forestValue3079520_92_0;
    int forestValue3079520_97_0;
    java.util.Map forestValue3079520_112_0;
    int forestValue3079520_135_0;
    int forestValue3079520_147_0;
    int forestValue3079520_162_0;
    int forestValue3079520_162_1;
    int forestValue3079520_202_0;
    int forestValue3079520_207_0;
    java.util.Map forestValue3079520_222_0;
    int forestValue3079520_245_0;
    int forestValue3079520_254_0;
    int forestValue3079520_266_0;
    int forestValue3079520_274_0;
    int forestValue3079520_274_1;
    int forestValue3079520_314_0;
    int forestValue3079520_319_0;
    java.util.Map forestValue3079520_334_0;
    int forestValue3079520_357_0;
    int forestValue3079520_362_0;
    int forestValue3079520_375_0;
    boolean spill3079520_0;
    int spill3079520_1;
    int spill3079520_2;
    int spill3079520_3;
    int spill3079520_4;
    int spill3079520_5;
    boolean spill3079520_6;
    boolean spill3079520_7;
    java.util.Map spill3079520_8;
    int spill3079520_9;
    int spill3079520_10;
    int spill3079520_11;
    int spill3079520_12;
    boolean spill3079520_13;
    boolean spill3079520_14;
    java.util.Map spill3079520_15;
    int spill3079520_16;
    int spill3079520_17;
    int spill3079520_18;
    int spill3079520_19;
    boolean spill3079520_20;
    boolean spill3079520_21;
    java.util.Map spill3079520_22;
    int spill3079520_23;
    int spill3079520_24;
    java.util.ConcurrentModificationException life14_2;
    net.minecraft.util.ClassInheritanceMultiMap[] life14_6;
    int life15_11;
    net.minecraft.util.ClassInheritanceMultiMap life16_20;
    moom.Fs[] life12_98;
    int life14_103;
    moom.Fs life15_112;
    java.util.Map life14_155;
    java.util.Iterator life15_168;
    moom.DT life16_177;
    int life13_182;
    moom.Fs[] life12_253;
    int life14_258;
    moom.Fs life15_267;
    java.util.Map life14_310;
    java.util.Iterator life15_323;
    moom.DT life16_332;
    int life13_337;
    moom.Fs[] life12_410;
    int life14_415;
    moom.Fs life15_424;
    java.util.Map life14_467;
    java.util.Iterator life15_480;
    moom.DT life16_489;
    int life13_494;
    forest_join_376: {
    forest_join_375: {
    forest_join_372: {
    forest_join_362: {
    forest_join_361: {
    life14_2 = p0;
    forest_cycle_2: while (true) {
    forest_join_360: {
    forest_join_156: {
    forest_join_155: {
    forest_join_51: {
    life14_6 = __call3079520_0(p11);
    life15_11 = ((life14_6).length - 1);
    forest_cycle_10: while (true) {
    forest_join_48: {
    forest_join_47: {
    forest_join_44: {
    forest_join_42: {
    forest_join_38: {
    if (!((life15_11 > p8))) {
        break forest_join_156;
    }
    life16_20 = (life14_6)[life15_11];
    if (!((p2 == null))) {
        break forest_join_48;
    }
    spill3079520_0 = __call3079520_1(life16_20);
    if (!((p2 == null))) {
        forestValue3079520_51_0 = __integerCategory3079520_2(spill3079520_0);
        break forest_join_51;
    }
    if (!((!spill3079520_0))) {
        break forest_join_47;
    }
    if (!((p11 == p4))) {
        break forest_join_38;
    }
    spill3079520_1 = life15_11;
    spill3079520_2 = p3;
    if (!((p2 == null))) {
        forestValue3079520_42_0 = spill3079520_1;
        forestValue3079520_42_1 = spill3079520_2;
        break forest_join_42;
    }
    if (!((spill3079520_1 == spill3079520_2))) {
        break forest_join_38;
    }
    spill3079520_3 = __call3079520_3(life16_20);
    spill3079520_4 = 1;
    if (!((p2 == null))) {
        forestValue3079520_42_0 = spill3079520_3;
        forestValue3079520_42_1 = spill3079520_4;
        break forest_join_42;
    }
    if (!((spill3079520_3 != spill3079520_4))) {
        break forest_join_47;
    }
    }
    spill3079520_5 = life15_11;
    if (!((p2 == null))) {
        forestValue3079520_44_0 = spill3079520_5;
        break forest_join_44;
    }
    forestValue3079520_42_0 = spill3079520_5;
    forestValue3079520_42_1 = p8;
    }
    if (!((forestValue3079520_42_0 > forestValue3079520_42_1))) {
        break forest_join_156;
    }
    forestValue3079520_44_0 = life15_11;
    }
    p8 = forestValue3079520_44_0;
    if (!((p2 != null))) {
        break forest_join_156;
    }
    }
    life15_11 += -1;
    }
    if (!((p2 != null))) {
        continue forest_cycle_10;
    }
    break forest_cycle_10;
    }
    break forest_join_156;
    }
    forest_cycle_51: while (true) {
    forest_join_153: {
    forest_join_147: {
    forest_join_146: {
    forest_join_142: {
    forest_join_140: {
    forest_join_139: {
    forestValue3079520_52_0 = forestValue3079520_51_0;
    forestValue3079520_52_1 = p7;
    forest_cycle_52: while (true) {
    forest_join_112: {
    forest_join_103: {
    if (!((forestValue3079520_52_0 < forestValue3079520_52_1))) {
        break forest_join_142;
    }
    p11 = __call3079520_4(p1, p9, p10);
    if (!((p2 == null))) {
        break forest_join_140;
    }
    spill3079520_6 = __call3079520_5(p11);
    if (!((p2 == null))) {
        forestValue3079520_147_0 = __integerCategory3079520_6(spill3079520_6);
        break forest_join_147;
    }
    if (!((!spill3079520_6))) {
        break forest_join_139;
    }
    life12_98 = __call3079520_7(p11);
    life14_103 = ((life12_98).length - 1);
    forest_cycle_73: while (true) {
    forest_join_101: {
    forest_join_100: {
    forest_join_97: {
    forest_join_92: {
    if (!((life14_103 > p8))) {
        break forest_join_103;
    }
    life15_112 = (life12_98)[life14_103];
    if (!((p2 == null))) {
        break forest_join_140;
    }
    if (!((p2 == null))) {
        break forest_join_101;
    }
    if (!((life15_112 != null))) {
        break forest_join_100;
    }
    spill3079520_7 = __call3079520_8(life15_112);
    if (!((p2 == null))) {
        forestValue3079520_92_0 = __integerCategory3079520_9(spill3079520_7);
        break forest_join_92;
    }
    if (!((!spill3079520_7))) {
        break forest_join_100;
    }
    forestValue3079520_92_0 = life14_103;
    }
    if (!((p2 == null))) {
        forestValue3079520_97_0 = forestValue3079520_92_0;
        break forest_join_97;
    }
    if (!((forestValue3079520_92_0 > p8))) {
        break forest_join_103;
    }
    forestValue3079520_97_0 = life14_103;
    }
    p8 = forestValue3079520_97_0;
    if (!((p2 != null))) {
        break forest_join_103;
    }
    }
    life14_103 += -1;
    }
    if (!((p2 != null))) {
        continue forest_cycle_73;
    }
    break forest_cycle_73;
    }
    }
    life14_155 = __call3079520_10(p11);
    spill3079520_8 = life14_155;
    if (!((p2 == null))) {
        forestValue3079520_112_0 = spill3079520_8;
        break forest_join_112;
    }
    if (!((!__call3079520_11(spill3079520_8)))) {
        break forest_join_360;
    }
    forestValue3079520_112_0 = life14_155;
    }
    life15_168 = __call3079520_13(__call3079520_12(forestValue3079520_112_0));
    forest_cycle_115: while (true) {
    forest_join_136: {
    forest_join_135: {
    if (!(__call3079520_14(life15_168))) {
        break forest_join_360;
    }
    life16_177 = __cast3079520_16(__call3079520_15(life15_168));
    life13_182 = (__call3079520_17(life16_177) >> 4);
    spill3079520_9 = life13_182;
    if (!((p2 == null))) {
        forestValue3079520_135_0 = spill3079520_9;
        break forest_join_135;
    }
    spill3079520_10 = p8;
    if (!((p2 == null))) {
        forestValue3079520_52_0 = spill3079520_9;
        forestValue3079520_52_1 = spill3079520_10;
        continue forest_cycle_52;
    }
    if (!((spill3079520_9 > spill3079520_10))) {
        break forest_join_136;
    }
    forestValue3079520_135_0 = life13_182;
    }
    p8 = forestValue3079520_135_0;
    }
    if (!((p2 != null))) {
        continue forest_cycle_115;
    }
    break forest_cycle_115;
    }
    break forest_cycle_52;
    }
    break forest_join_155;
    }
    p10 += 1;
    }
    if (!((p2 != null))) {
        break forest_join_153;
    }
    }
    p9 += 1;
    if (!((p2 != null))) {
        break forest_join_146;
    }
    break forest_join_361;
    }
    forestValue3079520_147_0 = p9;
    }
    if (!((forestValue3079520_147_0 < p5))) {
        break forest_join_361;
    }
    spill3079520_11 = p6;
    if (!((p2 == null))) {
        forestValue3079520_362_0 = spill3079520_11;
        break forest_join_362;
    }
    p10 = spill3079520_11;
    }
    spill3079520_12 = p10;
    forestValue3079520_51_0 = spill3079520_12;
    continue forest_cycle_51;
    }
    }
    break forest_join_360;
    }
    forest_cycle_156: while (true) {
    p10 += 1;
    forest_cycle_157: while (true) {
    forest_join_261: {
    forest_join_160: {
    if (!((p2 != null))) {
        break forest_join_160;
    }
    break forest_join_261;
    }
    forest_cycle_160: while (true) {
    forest_join_254: {
    forest_join_253: {
    forest_join_249: {
    forestValue3079520_162_0 = p10;
    forestValue3079520_162_1 = p7;
    forest_cycle_162: while (true) {
    forest_join_222: {
    forest_join_213: {
    if (!((forestValue3079520_162_0 < forestValue3079520_162_1))) {
        break forest_join_249;
    }
    p11 = __call3079520_18(p1, p9, p10);
    if (!((p2 == null))) {
        continue forest_cycle_157;
    }
    spill3079520_13 = __call3079520_19(p11);
    if (!((p2 == null))) {
        forestValue3079520_254_0 = __integerCategory3079520_20(spill3079520_13);
        break forest_join_254;
    }
    if (!((!spill3079520_13))) {
        continue forest_cycle_156;
    }
    life12_253 = __call3079520_21(p11);
    life14_258 = ((life12_253).length - 1);
    forest_cycle_183: while (true) {
    forest_join_211: {
    forest_join_210: {
    forest_join_207: {
    forest_join_202: {
    if (!((life14_258 > p8))) {
        break forest_join_213;
    }
    life15_267 = (life12_253)[life14_258];
    if (!((p2 == null))) {
        continue forest_cycle_157;
    }
    if (!((p2 == null))) {
        break forest_join_211;
    }
    if (!((life15_267 != null))) {
        break forest_join_210;
    }
    spill3079520_14 = __call3079520_22(life15_267);
    if (!((p2 == null))) {
        forestValue3079520_202_0 = __integerCategory3079520_23(spill3079520_14);
        break forest_join_202;
    }
    if (!((!spill3079520_14))) {
        break forest_join_210;
    }
    forestValue3079520_202_0 = life14_258;
    }
    if (!((p2 == null))) {
        forestValue3079520_207_0 = forestValue3079520_202_0;
        break forest_join_207;
    }
    if (!((forestValue3079520_202_0 > p8))) {
        break forest_join_213;
    }
    forestValue3079520_207_0 = life14_258;
    }
    p8 = forestValue3079520_207_0;
    if (!((p2 != null))) {
        break forest_join_213;
    }
    }
    life14_258 += -1;
    }
    if (!((p2 != null))) {
        continue forest_cycle_183;
    }
    break forest_cycle_183;
    }
    }
    life14_310 = __call3079520_24(p11);
    spill3079520_15 = life14_310;
    if (!((p2 == null))) {
        forestValue3079520_222_0 = spill3079520_15;
        break forest_join_222;
    }
    if (!((!__call3079520_25(spill3079520_15)))) {
        break forest_join_360;
    }
    forestValue3079520_222_0 = life14_310;
    }
    life15_323 = __call3079520_27(__call3079520_26(forestValue3079520_222_0));
    forest_cycle_225: while (true) {
    forest_join_246: {
    forest_join_245: {
    if (!(__call3079520_28(life15_323))) {
        break forest_join_360;
    }
    life16_332 = __cast3079520_30(__call3079520_29(life15_323));
    life13_337 = (__call3079520_31(life16_332) >> 4);
    spill3079520_16 = life13_337;
    if (!((p2 == null))) {
        forestValue3079520_245_0 = spill3079520_16;
        break forest_join_245;
    }
    spill3079520_17 = p8;
    if (!((p2 == null))) {
        forestValue3079520_162_0 = spill3079520_16;
        forestValue3079520_162_1 = spill3079520_17;
        continue forest_cycle_162;
    }
    if (!((spill3079520_16 > spill3079520_17))) {
        break forest_join_246;
    }
    forestValue3079520_245_0 = life13_337;
    }
    p8 = forestValue3079520_245_0;
    }
    if (!((p2 != null))) {
        continue forest_cycle_225;
    }
    break forest_cycle_225;
    }
    break forest_cycle_162;
    }
    break forest_join_360;
    }
    p9 += 1;
    if (!((p2 != null))) {
        break forest_join_253;
    }
    break forest_join_361;
    }
    forestValue3079520_254_0 = p9;
    }
    if (!((forestValue3079520_254_0 < p5))) {
        break forest_join_361;
    }
    spill3079520_18 = p6;
    if (!((p2 == null))) {
        forestValue3079520_362_0 = spill3079520_18;
        break forest_join_362;
    }
    p10 = spill3079520_18;
    continue forest_cycle_160;
    }
    }
    forest_cycle_261: while (true) {
    forest_join_265: {
    p9 += 1;
    if (!((p2 != null))) {
        break forest_join_265;
    }
    break forest_join_361;
    }
    forestValue3079520_266_0 = p9;
    forest_cycle_266: while (true) {
    if (!((forestValue3079520_266_0 < p5))) {
        break forest_join_361;
    }
    spill3079520_19 = p6;
    if (!((p2 == null))) {
        forestValue3079520_362_0 = spill3079520_19;
        break forest_join_362;
    }
    p10 = spill3079520_19;
    forestValue3079520_274_0 = p10;
    forestValue3079520_274_1 = p7;
    forest_cycle_274: while (true) {
    forest_join_334: {
    forest_join_325: {
    if (!((forestValue3079520_274_0 < forestValue3079520_274_1))) {
        continue forest_cycle_261;
    }
    p11 = __call3079520_32(p1, p9, p10);
    if (!((p2 == null))) {
        continue forest_cycle_157;
    }
    spill3079520_20 = __call3079520_33(p11);
    if (!((p2 == null))) {
        forestValue3079520_266_0 = __integerCategory3079520_34(spill3079520_20);
        continue forest_cycle_266;
    }
    if (!((!spill3079520_20))) {
        continue forest_cycle_156;
    }
    life12_410 = __call3079520_35(p11);
    life14_415 = ((life12_410).length - 1);
    forest_cycle_295: while (true) {
    forest_join_323: {
    forest_join_322: {
    forest_join_319: {
    forest_join_314: {
    if (!((life14_415 > p8))) {
        break forest_join_325;
    }
    life15_424 = (life12_410)[life14_415];
    if (!((p2 == null))) {
        continue forest_cycle_157;
    }
    if (!((p2 == null))) {
        break forest_join_323;
    }
    if (!((life15_424 != null))) {
        break forest_join_322;
    }
    spill3079520_21 = __call3079520_36(life15_424);
    if (!((p2 == null))) {
        forestValue3079520_314_0 = __integerCategory3079520_37(spill3079520_21);
        break forest_join_314;
    }
    if (!((!spill3079520_21))) {
        break forest_join_322;
    }
    forestValue3079520_314_0 = life14_415;
    }
    if (!((p2 == null))) {
        forestValue3079520_319_0 = forestValue3079520_314_0;
        break forest_join_319;
    }
    if (!((forestValue3079520_314_0 > p8))) {
        break forest_join_325;
    }
    forestValue3079520_319_0 = life14_415;
    }
    p8 = forestValue3079520_319_0;
    if (!((p2 != null))) {
        break forest_join_325;
    }
    }
    life14_415 += -1;
    }
    if (!((p2 != null))) {
        continue forest_cycle_295;
    }
    break forest_cycle_295;
    }
    }
    life14_467 = __call3079520_38(p11);
    spill3079520_22 = life14_467;
    if (!((p2 == null))) {
        forestValue3079520_334_0 = spill3079520_22;
        break forest_join_334;
    }
    if (!((!__call3079520_39(spill3079520_22)))) {
        break forest_join_360;
    }
    forestValue3079520_334_0 = life14_467;
    }
    life15_480 = __call3079520_41(__call3079520_40(forestValue3079520_334_0));
    forest_cycle_337: while (true) {
    forest_join_358: {
    forest_join_357: {
    if (!(__call3079520_42(life15_480))) {
        break forest_join_360;
    }
    life16_489 = __cast3079520_44(__call3079520_43(life15_480));
    life13_494 = (__call3079520_45(life16_489) >> 4);
    spill3079520_23 = life13_494;
    if (!((p2 == null))) {
        forestValue3079520_357_0 = spill3079520_23;
        break forest_join_357;
    }
    spill3079520_24 = p8;
    if (!((p2 == null))) {
        forestValue3079520_274_0 = spill3079520_23;
        forestValue3079520_274_1 = spill3079520_24;
        continue forest_cycle_274;
    }
    if (!((spill3079520_23 > spill3079520_24))) {
        break forest_join_358;
    }
    forestValue3079520_357_0 = life13_494;
    }
    p8 = forestValue3079520_357_0;
    }
    if (!((p2 != null))) {
        continue forest_cycle_337;
    }
    break forest_cycle_337;
    }
    break forest_cycle_274;
    }
    break forest_cycle_266;
    }
    break forest_cycle_261;
    }
    break forest_cycle_157;
    }
    break forest_cycle_156;
    }
    }
    continue forest_cycle_2;
    }
    }
    forestValue3079520_362_0 = __fieldRead3079520_46();
    }
    if (!((p2 == null))) {
        forestValue3079520_375_0 = forestValue3079520_362_0;
        break forest_join_375;
    }
    if (!((forestValue3079520_362_0 < 3))) {
        break forest_join_372;
    }
    __fieldWrite3079520_47(p8);
    p8 = __fieldRead3079520_48();
    if (!((p2 != null))) {
        break forest_join_376;
    }
    }
    __fieldWrite3079520_49(p8);
    forestValue3079520_375_0 = -1;
    }
    __fieldWrite3079520_50(forestValue3079520_375_0);
    }
    __fieldWrite3079520_52(((__fieldRead3079520_51() + 1) % 4));
    return (p8 << 4);
}
public static int h795_21(java.util.ConcurrentModificationException p0) throws Throwable {
    throw __call3079521_0(p0);
}
public static int h795_22(java.util.ConcurrentModificationException p0) throws Throwable {
    throw __call3079522_0(p0);
}
public static int h795_23(java.util.ConcurrentModificationException p0) throws Throwable {
    throw __call3079523_0(p0);
}
public static int h795_24(java.util.ConcurrentModificationException p0) throws Throwable {
    throw __call3079524_0(p0);
}
public static int h795_25(java.util.ConcurrentModificationException p0) throws Throwable {
    throw __call3079525_0(p0);
}
public static int h795_26(java.util.ConcurrentModificationException p0) throws Throwable {
    throw __call3079526_0(p0);
}
public static int h795_27(java.util.ConcurrentModificationException p0) throws Throwable {
    throw __call3079527_0(p0);
}
public static int h795_28(java.util.ConcurrentModificationException p0) throws Throwable {
    throw __call3079528_0(p0);
}
public static int h795_29(java.util.ConcurrentModificationException p0) throws Throwable {
    throw __call3079529_0(p0);
}
public static int h795_30(java.util.ConcurrentModificationException p0) throws Throwable {
    throw __call3079530_0(p0);
}
public static int h795_31(java.util.ConcurrentModificationException p0) throws Throwable {
    throw __call3079531_0(p0);
}
private static native long __fieldRead795_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call795_1() throws Throwable;
private static native double __fieldRead795_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call795_3(double a0) throws Throwable;
private static native double __fieldRead795_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call795_5(double a0) throws Throwable;
private static native double __fieldRead795_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call795_7(double a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call795_8(net.minecraft.world.World a0, int a1, int a2) throws Throwable;
private static native net.minecraft.world.World __fieldRead795_9() throws Throwable;
private static native int __fieldRead795_10() throws Throwable;
private static native int __fieldRead795_11() throws Throwable;
private static native void __fieldWrite795_12(int a0) throws Throwable;
private static native int __invokedynamic795_13(int a0, long a1) throws Throwable;
private static native void __fieldWrite795_14(int a0) throws Throwable;
private static native void __fieldWrite795_15(net.minecraft.world.World a0) throws Throwable;
private static native void __fieldWrite795_16(int a0) throws Throwable;
private static native void __fieldWrite795_17(int a0) throws Throwable;
private static native int __fieldRead795_18() throws Throwable;
private static native void __fieldWrite795_19(int a0) throws Throwable;
private static native int __fieldRead795_20() throws Throwable;
private static native int __fieldRead795_21() throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call795_22(net.minecraft.world.World a0, int a1, int a2) throws Throwable;
private static native boolean __call795_23(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __integerCategory795_24(boolean value) throws Throwable;
private static native moom.Fs[] __call795_25(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native boolean __call795_26(moom.Fs a0) throws Throwable;
private static native int __integerCategory795_27(boolean value) throws Throwable;
private static native java.util.Map __call795_28(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native boolean __call795_29(java.util.Map a0) throws Throwable;
private static native java.util.Set __call795_30(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call795_31(java.util.Set a0) throws Throwable;
private static native boolean __call795_32(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call795_33(java.util.Iterator a0) throws Throwable;
private static native moom.DT __cast795_34(java.lang.Object a0) throws Throwable;
private static native int __call795_35(moom.DT a0) throws Throwable;
private static native net.minecraft.util.ClassInheritanceMultiMap[] __call795_36(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native boolean __call795_37(net.minecraft.util.ClassInheritanceMultiMap a0) throws Throwable;
private static native int __integerCategory795_38(boolean value) throws Throwable;
private static native int __call795_39(net.minecraft.util.ClassInheritanceMultiMap a0) throws Throwable;
private static native int __fieldRead795_40() throws Throwable;
private static native void __fieldWrite795_41(int a0) throws Throwable;
private static native int __fieldRead795_42() throws Throwable;
private static native void __fieldWrite795_43(int a0) throws Throwable;
private static native void __fieldWrite795_44(int a0) throws Throwable;
private static native int __fieldRead795_45() throws Throwable;
private static native void __fieldWrite795_46(int a0) throws Throwable;
private static native java.util.ConcurrentModificationException __call3079500_0(java.util.ConcurrentModificationException a0) throws Throwable;
private static native java.util.ConcurrentModificationException __call3079501_0(java.util.ConcurrentModificationException a0) throws Throwable;
private static native java.util.ConcurrentModificationException __call3079502_0(java.util.ConcurrentModificationException a0) throws Throwable;
private static native java.util.ConcurrentModificationException __call3079503_0(java.util.ConcurrentModificationException a0) throws Throwable;
private static native java.util.ConcurrentModificationException __call3079504_0(java.util.ConcurrentModificationException a0) throws Throwable;
private static native java.util.ConcurrentModificationException __call3079505_0(java.util.ConcurrentModificationException a0) throws Throwable;
private static native java.util.ConcurrentModificationException __call3079506_0(java.util.ConcurrentModificationException a0) throws Throwable;
private static native java.util.ConcurrentModificationException __call3079507_0(java.util.ConcurrentModificationException a0) throws Throwable;
private static native java.util.ConcurrentModificationException __call3079508_0(java.util.ConcurrentModificationException a0) throws Throwable;
private static native java.util.ConcurrentModificationException __call3079509_0(java.util.ConcurrentModificationException a0) throws Throwable;
private static native java.util.ConcurrentModificationException __call3079510_0(java.util.ConcurrentModificationException a0) throws Throwable;
private static native java.util.ConcurrentModificationException __call3079511_0(java.util.ConcurrentModificationException a0) throws Throwable;
private static native java.util.ConcurrentModificationException __call3079512_0(java.util.ConcurrentModificationException a0) throws Throwable;
private static native java.util.ConcurrentModificationException __call3079513_0(java.util.ConcurrentModificationException a0) throws Throwable;
private static native java.util.ConcurrentModificationException __call3079514_0(java.util.ConcurrentModificationException a0) throws Throwable;
private static native java.util.ConcurrentModificationException __call3079515_0(java.util.ConcurrentModificationException a0) throws Throwable;
private static native java.util.ConcurrentModificationException __call3079516_0(java.util.ConcurrentModificationException a0) throws Throwable;
private static native java.util.ConcurrentModificationException __call3079517_0(java.util.ConcurrentModificationException a0) throws Throwable;
private static native java.util.ConcurrentModificationException __call3079518_0(java.util.ConcurrentModificationException a0) throws Throwable;
private static native java.util.ConcurrentModificationException __call3079519_0(java.util.ConcurrentModificationException a0) throws Throwable;
private static native net.minecraft.util.ClassInheritanceMultiMap[] __call3079520_0(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native boolean __call3079520_1(net.minecraft.util.ClassInheritanceMultiMap a0) throws Throwable;
private static native int __integerCategory3079520_2(boolean value) throws Throwable;
private static native int __call3079520_3(net.minecraft.util.ClassInheritanceMultiMap a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call3079520_4(net.minecraft.world.World a0, int a1, int a2) throws Throwable;
private static native boolean __call3079520_5(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __integerCategory3079520_6(boolean value) throws Throwable;
private static native moom.Fs[] __call3079520_7(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native boolean __call3079520_8(moom.Fs a0) throws Throwable;
private static native int __integerCategory3079520_9(boolean value) throws Throwable;
private static native java.util.Map __call3079520_10(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native boolean __call3079520_11(java.util.Map a0) throws Throwable;
private static native java.util.Set __call3079520_12(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call3079520_13(java.util.Set a0) throws Throwable;
private static native boolean __call3079520_14(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3079520_15(java.util.Iterator a0) throws Throwable;
private static native moom.DT __cast3079520_16(java.lang.Object a0) throws Throwable;
private static native int __call3079520_17(moom.DT a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call3079520_18(net.minecraft.world.World a0, int a1, int a2) throws Throwable;
private static native boolean __call3079520_19(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __integerCategory3079520_20(boolean value) throws Throwable;
private static native moom.Fs[] __call3079520_21(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native boolean __call3079520_22(moom.Fs a0) throws Throwable;
private static native int __integerCategory3079520_23(boolean value) throws Throwable;
private static native java.util.Map __call3079520_24(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native boolean __call3079520_25(java.util.Map a0) throws Throwable;
private static native java.util.Set __call3079520_26(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call3079520_27(java.util.Set a0) throws Throwable;
private static native boolean __call3079520_28(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3079520_29(java.util.Iterator a0) throws Throwable;
private static native moom.DT __cast3079520_30(java.lang.Object a0) throws Throwable;
private static native int __call3079520_31(moom.DT a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call3079520_32(net.minecraft.world.World a0, int a1, int a2) throws Throwable;
private static native boolean __call3079520_33(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __integerCategory3079520_34(boolean value) throws Throwable;
private static native moom.Fs[] __call3079520_35(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native boolean __call3079520_36(moom.Fs a0) throws Throwable;
private static native int __integerCategory3079520_37(boolean value) throws Throwable;
private static native java.util.Map __call3079520_38(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native boolean __call3079520_39(java.util.Map a0) throws Throwable;
private static native java.util.Set __call3079520_40(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call3079520_41(java.util.Set a0) throws Throwable;
private static native boolean __call3079520_42(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3079520_43(java.util.Iterator a0) throws Throwable;
private static native moom.DT __cast3079520_44(java.lang.Object a0) throws Throwable;
private static native int __call3079520_45(moom.DT a0) throws Throwable;
private static native int __fieldRead3079520_46() throws Throwable;
private static native void __fieldWrite3079520_47(int a0) throws Throwable;
private static native int __fieldRead3079520_48() throws Throwable;
private static native void __fieldWrite3079520_49(int a0) throws Throwable;
private static native void __fieldWrite3079520_50(int a0) throws Throwable;
private static native int __fieldRead3079520_51() throws Throwable;
private static native void __fieldWrite3079520_52(int a0) throws Throwable;
private static native java.util.ConcurrentModificationException __call3079521_0(java.util.ConcurrentModificationException a0) throws Throwable;
private static native java.util.ConcurrentModificationException __call3079522_0(java.util.ConcurrentModificationException a0) throws Throwable;
private static native java.util.ConcurrentModificationException __call3079523_0(java.util.ConcurrentModificationException a0) throws Throwable;
private static native java.util.ConcurrentModificationException __call3079524_0(java.util.ConcurrentModificationException a0) throws Throwable;
private static native java.util.ConcurrentModificationException __call3079525_0(java.util.ConcurrentModificationException a0) throws Throwable;
private static native java.util.ConcurrentModificationException __call3079526_0(java.util.ConcurrentModificationException a0) throws Throwable;
private static native java.util.ConcurrentModificationException __call3079527_0(java.util.ConcurrentModificationException a0) throws Throwable;
private static native java.util.ConcurrentModificationException __call3079528_0(java.util.ConcurrentModificationException a0) throws Throwable;
private static native java.util.ConcurrentModificationException __call3079529_0(java.util.ConcurrentModificationException a0) throws Throwable;
private static native java.util.ConcurrentModificationException __call3079530_0(java.util.ConcurrentModificationException a0) throws Throwable;
private static native java.util.ConcurrentModificationException __call3079531_0(java.util.ConcurrentModificationException a0) throws Throwable;

}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x3A01;
        if (k[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = j[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])Me.l.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    Me.l.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Me", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Me.k[n4] = n6;
        }
        return k[n4];
}


private static java.util.ConcurrentModificationException a(java.util.ConcurrentModificationException p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6394_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Me"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Me.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public static int a(net.minecraft.world.World p0, net.minecraft.entity.Entity p1, int p2) { return __sourceHandlerCall_0b193a61c00518a2506b(p0, p1, p2); }


public static boolean a__Boolean() {
int forwardValue2715_11_0;
    int forwardValue2715_13_0;
    int spill2715_0;
    long life0_3;
    net.minecraft.entity.Entity[] life2_5;
    forward_join_13: {
    forward_join_12: {
    forward_join_11: {
    life0_3 = (moom.Me.i ^ 40938034017884L);
    life2_5 = moom.Mi.b__Arrayr3();
    spill2715_0 = moom.Me.c;
    if (!((life2_5 == null))) {
        forwardValue2715_11_0 = spill2715_0;
        break forward_join_11;
    }
    if (!((spill2715_0 == 0))) {
        break forward_join_12;
    }
    forwardValue2715_11_0 = 1;
    }
    forwardValue2715_13_0 = forwardValue2715_11_0;
    break forward_join_13;
    }
    forwardValue2715_13_0 = 0;
    }
    return ((forwardValue2715_13_0) != 0);
}


private static moom.bs[][] a(boolean p0) {
long life1_3;
    int life3_9;
    moom.bs[][] life4_12;
    int life5_14;
    java.util.ArrayList life6_21;
    int life7_23;
    moom.bs life8_31;
    moom.bs life9_40;
    int life10_45;
    moom.bs[] life7_64;
    life1_3 = (moom.Me.i ^ 51269802093070L);
    life3_9 = __sourceIntrinsic_635c26d42353_invokedynamic5322_1(4225, (6023895492600287290L ^ life1_3));
    life4_12 = new moom.bs[life3_9][];
    life5_14 = 0;
    while ((life5_14 < life3_9)) {
        life6_21 = new java.util.ArrayList();
        life7_23 = 0;
        while ((life7_23 < (moom.bs.VALUES).length)) {
        life8_31 = (moom.bs.VALUES)[life7_23];
        life9_40 = (p0 ? ((moom.bs)(life8_31)).a__bs() : life8_31);
        life10_45 = (1 << ((moom.bs)(life9_40)).ordinal());
        if (((life5_14 & life10_45) != 0)) {
        ((java.util.List)(life6_21)).add(((java.lang.Object)(life8_31)));
    }
        life7_23 += 1;
    }
        life7_64 = ((moom.bs[])(((java.util.List)(life6_21)).toArray(((java.lang.Object[])(new moom.bs[0])))));
        (life4_12)[life5_14] = life7_64;
        life5_14 += 1;
    }
    return life4_12;
}


public static moom.bs[] a(int p0) {
long local1 = (moom.Me.i ^ 136725886215133L);
    int local3 = ((p0 ^ -1) & __sourceIntrinsic_f552305ebd73_originalDynamicSite1319_1(17330, (3214440083969526493L ^ local1)));
    return (moom.Me.b)[local3];
}


public static void a() {
f = ((net.minecraft.world.World)(null));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1018_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1018_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1018_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f552305ebd73_originalDynamicSite1319_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6394_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_635c26d42353_invokedynamic5322_1(int a0, long a1) throws E;
}
