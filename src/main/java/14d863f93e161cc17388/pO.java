package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class pO extends net.minecraft.command.CommandBase {

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map g;

public pO() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(975765782470917013L)), ((long)(-1312818094583737068L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(94382978361729L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.pO.c ^ 109244184088674L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1457_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1457_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1457_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1457_14 = new byte[8];
    (__sourceSpill1457_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1457_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1457_16 = __sourceSpill1457_14;
    ((javax.crypto.Cipher)(__sourceSpill1457_11)).init(((int)(__sourceSpill1457_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1457_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1457_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[9];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "}\001N &òÜ*\003\025\007íBæ^ûÒÁ8'¾\036ù\004:q ´´v#$\032eÖ\003å\000µsBÃJ\034D1KYà"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1457_25 = local6_life21;
        int __sourceSpill1457_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1457_25)).substring(((int)(__sourceSpill1457_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1457_30 = local8_life19;
        int __sourceSpill1457_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1457_33 = new byte[8];
        (__sourceSpill1457_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1457_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1457_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1457_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1457_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1457_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1457_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1457_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1457_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1457_34)).doFinal(((byte[])(__sourceSpill1457_33)));
        (__sourceSpill1457_30)[__sourceSpill1457_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "îÎ\fÿ¶23\020ðÂóiIàC"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1457_38 = local6_life21;
        int __sourceSpill1457_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1457_38)).substring(((int)(__sourceSpill1457_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1457_43 = local8_life19;
        int __sourceSpill1457_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1457_46 = new byte[8];
        (__sourceSpill1457_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1457_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1457_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1457_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1457_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1457_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1457_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1457_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1457_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1457_47)).doFinal(((byte[])(__sourceSpill1457_46)));
        (__sourceSpill1457_43)[__sourceSpill1457_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[9]));
}

private static native <E extends Throwable> void __sourceHandlerCall_2c1ef29b6017e3f2f9c6(moom.pO a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_2c1ef29b6017e3f2f9c6 {

public static void f56(moom.pO receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    int forestValue56_105_0;
    int forestValue56_110_0;
    int forestValue56_120_0;
    int forestValue56_125_0;
    int forestValue56_143_0;
    int forestValue56_148_0;
    int forestValue56_165_0;
    int forestValue56_169_0;
    int forestValue56_171_0;
    int forestValue56_205_0;
    int forestValue56_214_0;
    net.minecraft.block.state.IBlockState forestValue56_264_0;
    int forestValue56_323_0;
    net.minecraft.tileentity.TileEntity forestValue56_327_0;
    int spill56_0;
    boolean spill56_1;
    int spill56_2;
    int spill56_3;
    net.minecraft.block.state.IBlockState spill56_4;
    net.minecraft.tileentity.TileEntity spill56_5;
    net.minecraft.tileentity.TileEntity spill56_6;
    boolean spill56_7;
    long life3_3;
    int life5_5;
    moom.DT life6_33;
    moom.DT life7_39;
    moom.DT life8_49;
    moom.G2 life9_55;
    moom.G2 life10_64;
    int life11_73;
    net.minecraft.world.World life12_141;
    int life13_186;
    int life11_188;
    moom.DT life14_207;
    moom.DU life15_211;
    moom.DU life16_215;
    int life17_218;
    int life18_227;
    int life19_236;
    int life20_263;
    net.minecraft.block.state.IBlockState life21_267;
    net.minecraft.tileentity.TileEntity life22_289;
    net.minecraft.tileentity.TileEntity life23_293;
    net.minecraft.nbt.NBTTagCompound life24_308;
    net.minecraft.nbt.NBTTagCompound life25_324;
    forest_join_390: {
    forest_join_383: {
    forest_join_381: {
    forest_join_374: {
    forest_join_372: {
    forest_join_357: {
    forest_join_350: {
    forest_join_171: {
    forest_join_170: {
    forest_join_169: {
    forest_join_165: {
    forest_join_148: {
    forest_join_143: {
    forest_join_125: {
    forest_join_120: {
    forest_join_110: {
    forest_join_105: {
    forest_join_103: {
    forest_join_27: {
    forest_join_23: {
    life3_3 = (__fieldRead56_0() ^ 121431425756623L);
    life5_5 = __integerCategory56_2(__call56_1());
    if (!((life5_5 == 0))) {
        break forest_join_27;
    }
    if (!(((p1).length < __invokedynamic56_3(20271, (8199441232231862285L ^ life3_3))))) {
        break forest_join_23;
    }
    throw new moom.cc("commands.compare.usage", new java.lang.Object[0]);
    }
    __call56_5(p0, __fieldRead56_4(), 0);
    }
    life6_33 = __call56_6(p0, p1, 0, 0);
    life7_39 = __call56_7(p0, p1, 3, 0);
    life8_49 = __call56_9(p0, p1, __invokedynamic56_8(8946, (87876740193844698L ^ life3_3)), 0);
    life9_55 = new moom.G2(life6_33, life7_39);
    life10_64 = new moom.G2(life8_49, __call56_11(life8_49, __call56_10(life9_55)));
    life11_73 = ((__call56_12(life9_55) * __call56_13(life9_55)) * __call56_14(life9_55));
    spill56_0 = life11_73;
    if (!((life5_5 == 0))) {
        forestValue56_105_0 = spill56_0;
        break forest_join_105;
    }
    if (!((spill56_0 > __invokedynamic56_15(18442, (6900204647608981280L ^ life3_3))))) {
        break forest_join_103;
    }
    throw new moom.b7("commands.compare.tooManyBlocks", new java.lang.Object[] {__call56_16(life11_73), __call56_18(__invokedynamic56_17(1406, (8638244102518725201L ^ life3_3)))});
    }
    forestValue56_105_0 = __fieldRead56_19(life9_55);
    }
    if (!((life5_5 == 0))) {
        forestValue56_110_0 = forestValue56_105_0;
        break forest_join_110;
    }
    if (!((forestValue56_105_0 >= 0))) {
        break forest_join_383;
    }
    forestValue56_110_0 = __fieldRead56_20(life9_55);
    }
    if (!((life5_5 == 0))) {
        forestValue56_120_0 = forestValue56_110_0;
        break forest_join_120;
    }
    if (!((forestValue56_110_0 < __invokedynamic56_21(26279, (5826911701773531531L ^ life3_3))))) {
        break forest_join_383;
    }
    forestValue56_120_0 = __fieldRead56_22(life10_64);
    }
    if (!((life5_5 == 0))) {
        forestValue56_125_0 = forestValue56_120_0;
        break forest_join_125;
    }
    if (!((forestValue56_120_0 >= 0))) {
        break forest_join_383;
    }
    forestValue56_125_0 = __fieldRead56_23(life10_64);
    }
    if (!((forestValue56_125_0 < __invokedynamic56_24(22135, (6193599017283619161L ^ life3_3))))) {
        break forest_join_383;
    }
    life12_141 = __call56_25(p0);
    spill56_1 = __call56_26(life12_141, life9_55);
    if (!((life5_5 == 0))) {
        forestValue56_143_0 = __integerCategory56_27(spill56_1);
        break forest_join_143;
    }
    if (!(spill56_1)) {
        break forest_join_374;
    }
    forestValue56_143_0 = __integerCategory56_29(__call56_28(life12_141, life10_64));
    }
    if (!((life5_5 == 0))) {
        forestValue56_148_0 = forestValue56_143_0;
        break forest_join_148;
    }
    if (!((forestValue56_143_0 != 0))) {
        break forest_join_374;
    }
    forestValue56_148_0 = (p1).length;
    }
    if (!((life5_5 == 0))) {
        forestValue56_165_0 = forestValue56_148_0;
        break forest_join_165;
    }
    if (!((forestValue56_148_0 > __invokedynamic56_30(20271, (8199441232231862285L ^ life3_3))))) {
        break forest_join_170;
    }
    forestValue56_165_0 = __integerCategory56_33(__call56_32((p1)[__invokedynamic56_31(20271, (8199441232231862285L ^ life3_3))], "masked"));
    }
    if (!((life5_5 == 0))) {
        forestValue56_169_0 = forestValue56_165_0;
        break forest_join_169;
    }
    if (!((forestValue56_165_0 != 0))) {
        break forest_join_170;
    }
    forestValue56_169_0 = 1;
    }
    forestValue56_171_0 = forestValue56_169_0;
    break forest_join_171;
    }
    forestValue56_171_0 = 0;
    }
    life13_186 = forestValue56_171_0;
    life11_188 = 0;
    life14_207 = new moom.DT((__fieldRead56_34(life10_64) - __fieldRead56_35(life9_55)), (__fieldRead56_36(life10_64) - __fieldRead56_37(life9_55)), (__fieldRead56_38(life10_64) - __fieldRead56_39(life9_55)));
    life15_211 = new moom.DU();
    life16_215 = new moom.DU();
    life17_218 = __fieldRead56_40(life9_55);
    forest_cycle_204: while (true) {
    forest_join_346: {
    forestValue56_205_0 = life17_218;
    forest_cycle_205: while (true) {
    if (!((forestValue56_205_0 <= __fieldRead56_41(life9_55)))) {
        break forest_join_357;
    }
    if (!((life5_5 == 0))) {
        break forest_join_372;
    }
    life18_227 = __fieldRead56_42(life9_55);
    forest_cycle_213: while (true) {
    forest_join_343: {
    forestValue56_214_0 = life18_227;
    forest_cycle_214: while (true) {
    if (!((forestValue56_214_0 <= __fieldRead56_43(life9_55)))) {
        break forest_join_346;
    }
    spill56_2 = __fieldRead56_44(life9_55);
    if (!((life5_5 == 0))) {
        forestValue56_205_0 = spill56_2;
        continue forest_cycle_205;
    }
    life19_236 = spill56_2;
    forest_cycle_222: while (true) {
    forest_join_341: {
    forest_join_340: {
    forest_join_334: {
    forest_join_332: {
    forest_join_330: {
    forest_join_327: {
    forest_join_326: {
    forest_join_324: {
    forest_join_323: {
    forest_join_264: {
    forest_join_263: {
    if (!((life19_236 <= __fieldRead56_45(life9_55)))) {
        break forest_join_343;
    }
    __call56_46(life15_211, life19_236, life18_227, life17_218);
    __call56_50(life16_215, (life19_236 + __call56_47(life14_207)), (life18_227 + __call56_48(life14_207)), (life17_218 + __call56_49(life14_207)));
    life20_263 = 0;
    life21_267 = __call56_51(life12_141, life15_211);
    spill56_3 = life13_186;
    if (!((life5_5 == 0))) {
        forestValue56_214_0 = spill56_3;
        continue forest_cycle_214;
    }
    if (!((spill56_3 != 0))) {
        break forest_join_263;
    }
    spill56_4 = life21_267;
    if (!((life5_5 == 0))) {
        forestValue56_264_0 = spill56_4;
        break forest_join_264;
    }
    if (!((__call56_52(spill56_4) != __fieldRead56_53()))) {
        break forest_join_340;
    }
    }
    forestValue56_264_0 = life21_267;
    }
    if (!((forestValue56_264_0 == __call56_54(life12_141, life16_215)))) {
        break forest_join_332;
    }
    life22_289 = __call56_55(life12_141, life15_211);
    life23_293 = __call56_56(life12_141, life16_215);
    spill56_5 = life22_289;
    if (!((life5_5 == 0))) {
        forestValue56_327_0 = spill56_5;
        break forest_join_327;
    }
    if (!((spill56_5 != null))) {
        break forest_join_326;
    }
    spill56_6 = life23_293;
    if (!((life5_5 == 0))) {
        forestValue56_327_0 = spill56_6;
        break forest_join_327;
    }
    if (!((spill56_6 != null))) {
        break forest_join_326;
    }
    life24_308 = new net.minecraft.nbt.NBTTagCompound();
    __call56_57(life22_289, life24_308);
    __call56_58(life24_308, "x");
    __call56_59(life24_308, "y");
    __call56_60(life24_308, "z");
    life25_324 = new net.minecraft.nbt.NBTTagCompound();
    __call56_61(life23_293, life25_324);
    __call56_62(life25_324, "x");
    __call56_63(life25_324, "y");
    __call56_64(life25_324, "z");
    spill56_7 = __call56_65(life24_308, life25_324);
    if (!((life5_5 == 0))) {
        forestValue56_323_0 = __integerCategory56_66(spill56_7);
        break forest_join_323;
    }
    if (!((!spill56_7))) {
        break forest_join_324;
    }
    forestValue56_323_0 = 1;
    }
    life20_263 = forestValue56_323_0;
    }
    if (!((life5_5 != 0))) {
        break forest_join_330;
    }
    }
    forestValue56_327_0 = life22_289;
    }
    if (!((forestValue56_327_0 != null))) {
        break forest_join_330;
    }
    life20_263 = 1;
    }
    if (!((life5_5 != 0))) {
        break forest_join_334;
    }
    }
    life20_263 = 1;
    }
    life11_188 += 1;
    if (!((life5_5 == 0))) {
        break forest_join_341;
    }
    if (!((life20_263 != 0))) {
        break forest_join_340;
    }
    break forest_join_350;
    }
    life19_236 += 1;
    }
    if (!((life5_5 != 0))) {
        continue forest_cycle_222;
    }
    break forest_cycle_222;
    }
    break forest_cycle_214;
    }
    }
    life18_227 += 1;
    if (!((life5_5 != 0))) {
        continue forest_cycle_213;
    }
    break forest_cycle_213;
    }
    break forest_cycle_205;
    }
    }
    life17_218 += 1;
    if (!((life5_5 != 0))) {
        continue forest_cycle_204;
    }
    break forest_cycle_204;
    }
    break forest_join_357;
    }
    throw new moom.b7("commands.compare.failed", new java.lang.Object[0]);
    }
    __call56_68(p0, __fieldRead56_67(), life11_188);
    __call56_70(p0, receiver, "commands.compare.success", new java.lang.Object[] {__call56_69(life11_188)});
    }
    if (!((life5_5 != 0))) {
        break forest_join_381;
    }
    }
    throw new moom.b7("commands.compare.outOfWorld", new java.lang.Object[0]);
    }
    if (!((life5_5 != 0))) {
        break forest_join_390;
    }
    }
    throw new moom.b7("commands.compare.outOfWorld", new java.lang.Object[0]);
    }
    return;
}
public static void h56_0(moom.b7 p0) throws Throwable {
    throw __call3005600_0(p0);
}
public static void h56_1(moom.b7 p0) throws Throwable {
    throw __call3005601_0(p0);
}
public static void h56_2(moom.b7 p0) throws Throwable {
    throw __call3005602_0(p0);
}
public static void h56_3(moom.b7 p0) throws Throwable {
    throw __call3005603_0(p0);
}
public static void h56_4(moom.b7 p0) throws Throwable {
    throw __call3005604_0(p0);
}
public static void h56_5(moom.b7 p0) throws Throwable {
    throw __call3005605_0(p0);
}
public static void h56_6(moom.b7 p0) throws Throwable {
    throw __call3005606_0(p0);
}
public static void h56_7(moom.b7 p0) throws Throwable {
    throw __call3005607_0(p0);
}
public static void h56_8(moom.b7 p0) throws Throwable {
    throw __call3005608_0(p0);
}
public static void h56_9(moom.b7 p0) throws Throwable {
    throw __call3005609_0(p0);
}
public static void h56_10(moom.b7 p0) throws Throwable {
    throw __call3005610_0(p0);
}
public static void h56_11(moom.b7 p0) throws Throwable {
    throw __call3005611_0(p0);
}
public static void h56_12(moom.b7 p0) throws Throwable {
    throw __call3005612_0(p0);
}
public static void h56_13(moom.b7 p0) throws Throwable {
    throw __call3005613_0(p0);
}
public static void h56_14(moom.b7 p0) throws Throwable {
    throw __call3005614_0(p0);
}
public static void h56_15(moom.b7 p0) throws Throwable {
    throw __call3005615_0(p0);
}
public static void h56_16(moom.b7 p0) throws Throwable {
    throw __call3005616_0(p0);
}
public static void h56_17(moom.b7 p0) throws Throwable {
    throw __call3005617_0(p0);
}
public static void h56_18(moom.b7 p0) throws Throwable {
    throw __call3005618_0(p0);
}
public static void h56_19(moom.b7 p0) throws Throwable {
    throw __call3005619_0(p0);
}
public static void h56_20(moom.b7 p0) throws Throwable {
    throw __call3005620_0(p0);
}
public static void h56_21(moom.b7 p0) throws Throwable {
    throw __call3005621_0(p0);
}
public static void h56_22(moom.b7 p0) throws Throwable {
    throw __call3005622_0(p0);
}
public static void h56_23(moom.b7 p0) throws Throwable {
    throw __call3005623_0(p0);
}
public static void h56_24(moom.b7 p0) throws Throwable {
    throw __call3005624_0(p0);
}
public static void h56_25(moom.b7 p0) throws Throwable {
    throw __call3005625_0(p0);
}
public static void h56_26(moom.b7 p0) throws Throwable {
    throw __call3005626_0(p0);
}
public static void h56_27(moom.b7 p0) throws Throwable {
    throw __call3005627_0(p0);
}
public static void h56_28(moom.b7 p0) throws Throwable {
    throw __call3005628_0(p0);
}
private static native long __fieldRead56_0() throws Throwable;
private static native boolean __call56_1() throws Throwable;
private static native int __integerCategory56_2(boolean value) throws Throwable;
private static native int __invokedynamic56_3(int a0, long a1) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead56_4() throws Throwable;
private static native void __call56_5(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native moom.DT __call56_6(net.minecraft.command.ICommandSender a0, java.lang.String[] a1, int a2, int a3) throws Throwable;
private static native moom.DT __call56_7(net.minecraft.command.ICommandSender a0, java.lang.String[] a1, int a2, int a3) throws Throwable;
private static native int __invokedynamic56_8(int a0, long a1) throws Throwable;
private static native moom.DT __call56_9(net.minecraft.command.ICommandSender a0, java.lang.String[] a1, int a2, int a3) throws Throwable;
private static native moom.DS __call56_10(moom.G2 a0) throws Throwable;
private static native moom.DT __call56_11(moom.DT a0, moom.DS a1) throws Throwable;
private static native int __call56_12(moom.G2 a0) throws Throwable;
private static native int __call56_13(moom.G2 a0) throws Throwable;
private static native int __call56_14(moom.G2 a0) throws Throwable;
private static native int __invokedynamic56_15(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call56_16(int a0) throws Throwable;
private static native int __invokedynamic56_17(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call56_18(int a0) throws Throwable;
private static native int __fieldRead56_19(moom.G2 a0) throws Throwable;
private static native int __fieldRead56_20(moom.G2 a0) throws Throwable;
private static native int __invokedynamic56_21(int a0, long a1) throws Throwable;
private static native int __fieldRead56_22(moom.G2 a0) throws Throwable;
private static native int __fieldRead56_23(moom.G2 a0) throws Throwable;
private static native int __invokedynamic56_24(int a0, long a1) throws Throwable;
private static native net.minecraft.world.World __call56_25(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native boolean __call56_26(net.minecraft.world.World a0, moom.G2 a1) throws Throwable;
private static native int __integerCategory56_27(boolean value) throws Throwable;
private static native boolean __call56_28(net.minecraft.world.World a0, moom.G2 a1) throws Throwable;
private static native int __integerCategory56_29(boolean value) throws Throwable;
private static native int __invokedynamic56_30(int a0, long a1) throws Throwable;
private static native int __invokedynamic56_31(int a0, long a1) throws Throwable;
private static native boolean __call56_32(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory56_33(boolean value) throws Throwable;
private static native int __fieldRead56_34(moom.G2 a0) throws Throwable;
private static native int __fieldRead56_35(moom.G2 a0) throws Throwable;
private static native int __fieldRead56_36(moom.G2 a0) throws Throwable;
private static native int __fieldRead56_37(moom.G2 a0) throws Throwable;
private static native int __fieldRead56_38(moom.G2 a0) throws Throwable;
private static native int __fieldRead56_39(moom.G2 a0) throws Throwable;
private static native int __fieldRead56_40(moom.G2 a0) throws Throwable;
private static native int __fieldRead56_41(moom.G2 a0) throws Throwable;
private static native int __fieldRead56_42(moom.G2 a0) throws Throwable;
private static native int __fieldRead56_43(moom.G2 a0) throws Throwable;
private static native int __fieldRead56_44(moom.G2 a0) throws Throwable;
private static native int __fieldRead56_45(moom.G2 a0) throws Throwable;
private static native moom.DU __call56_46(moom.DU a0, int a1, int a2, int a3) throws Throwable;
private static native int __call56_47(moom.DT a0) throws Throwable;
private static native int __call56_48(moom.DT a0) throws Throwable;
private static native int __call56_49(moom.DT a0) throws Throwable;
private static native moom.DU __call56_50(moom.DU a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call56_51(net.minecraft.world.World a0, moom.DU a1) throws Throwable;
private static native net.minecraft.block.Block __call56_52(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead56_53() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call56_54(net.minecraft.world.World a0, moom.DU a1) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call56_55(net.minecraft.world.World a0, moom.DU a1) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call56_56(net.minecraft.world.World a0, moom.DU a1) throws Throwable;
private static native void __call56_57(net.minecraft.tileentity.TileEntity a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native void __call56_58(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __call56_59(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __call56_60(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __call56_61(net.minecraft.tileentity.TileEntity a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native void __call56_62(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __call56_63(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __call56_64(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native boolean __call56_65(net.minecraft.nbt.NBTTagCompound a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native int __integerCategory56_66(boolean value) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead56_67() throws Throwable;
private static native void __call56_68(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native java.lang.Integer __call56_69(int a0) throws Throwable;
private static native void __call56_70(net.minecraft.command.ICommandSender a0, moom.pO a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call3005600_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005601_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005602_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005603_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005604_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005605_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005606_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005607_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005608_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005609_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005610_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005611_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005612_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005613_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005614_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005615_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005616_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005617_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005618_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005619_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005620_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005621_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005622_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005623_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005624_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005625_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005626_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005627_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005628_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_365306331f6bb686d349(moom.pO a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_365306331f6bb686d349 {

public static java.util.List f1115(moom.pO receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    int forwardValue1115_24_0;
    int forwardValue1115_25_0;
    int forwardValue1115_25_1;
    int forwardValue1115_50_0;
    int forwardValue1115_50_1;
    int forwardValue1115_81_0;
    int forwardValue1115_81_1;
    java.lang.String[] forwardValue1115_83_0;
    java.util.List forwardValue1115_96_0;
    int spill1115_0;
    int spill1115_1;
    int spill1115_2;
    int spill1115_3;
    int spill1115_4;
    int spill1115_5;
    int spill1115_6;
    java.lang.String[] spill1115_7;
    long life4_3;
    int life6_5;
    forward_join_96: {
    forward_join_95: {
    forward_join_83: {
    forward_join_81: {
    forward_join_72: {
    forward_join_50: {
    forward_join_43: {
    forward_join_25: {
    forward_join_24: {
    forward_join_22: {
    life4_3 = (__fieldRead1115_0() ^ 45596040870988L);
    life6_5 = __integerCategory1115_2(__call1115_1());
    spill1115_0 = (p1).length;
    if (!((life6_5 == 0))) {
        forwardValue1115_24_0 = spill1115_0;
        break forward_join_24;
    }
    if (!((spill1115_0 > 0))) {
        break forward_join_22;
    }
    spill1115_1 = (p1).length;
    spill1115_2 = 3;
    if (!((life6_5 == 0))) {
        forwardValue1115_25_0 = spill1115_1;
        forwardValue1115_25_1 = spill1115_2;
        break forward_join_25;
    }
    if (!((spill1115_1 <= spill1115_2))) {
        break forward_join_22;
    }
    forwardValue1115_96_0 = __call1115_3(p1, 0, p2);
    break forward_join_96;
    }
    forwardValue1115_24_0 = (p1).length;
    }
    forwardValue1115_25_0 = forwardValue1115_24_0;
    forwardValue1115_25_1 = 3;
    }
    if (!((life6_5 == 0))) {
        forwardValue1115_50_0 = forwardValue1115_25_0;
        forwardValue1115_50_1 = forwardValue1115_25_1;
        break forward_join_50;
    }
    if (!((forwardValue1115_25_0 > forwardValue1115_25_1))) {
        break forward_join_43;
    }
    spill1115_3 = (p1).length;
    spill1115_4 = __invokedynamic1115_4(15935, (877738424295944343L ^ life4_3));
    if (!((life6_5 == 0))) {
        forwardValue1115_50_0 = spill1115_3;
        forwardValue1115_50_1 = spill1115_4;
        break forward_join_50;
    }
    if (!((spill1115_3 <= spill1115_4))) {
        break forward_join_43;
    }
    forwardValue1115_96_0 = __call1115_5(p1, 3, p2);
    break forward_join_96;
    }
    forwardValue1115_50_0 = (p1).length;
    forwardValue1115_50_1 = __invokedynamic1115_6(8946, (87948170552372313L ^ life4_3));
    }
    if (!((life6_5 == 0))) {
        forwardValue1115_81_0 = forwardValue1115_50_0;
        forwardValue1115_81_1 = forwardValue1115_50_1;
        break forward_join_81;
    }
    if (!((forwardValue1115_50_0 > forwardValue1115_50_1))) {
        break forward_join_72;
    }
    spill1115_5 = (p1).length;
    spill1115_6 = __invokedynamic1115_7(15717, (7061621516239107019L ^ life4_3));
    if (!((life6_5 == 0))) {
        forwardValue1115_81_0 = spill1115_5;
        forwardValue1115_81_1 = spill1115_6;
        break forward_join_81;
    }
    if (!((spill1115_5 <= spill1115_6))) {
        break forward_join_72;
    }
    forwardValue1115_96_0 = __call1115_9(p1, __invokedynamic1115_8(8946, (87948170552372313L ^ life4_3)), p2);
    break forward_join_96;
    }
    spill1115_7 = p1;
    if (!((life6_5 == 0))) {
        forwardValue1115_83_0 = spill1115_7;
        break forward_join_83;
    }
    forwardValue1115_81_0 = (spill1115_7).length;
    forwardValue1115_81_1 = __invokedynamic1115_10(23088, (5967715955681694874L ^ life4_3));
    }
    if (!((forwardValue1115_81_0 == forwardValue1115_81_1))) {
        break forward_join_95;
    }
    forwardValue1115_83_0 = p1;
    }
    forwardValue1115_96_0 = __call1115_11(forwardValue1115_83_0, new java.lang.String[] {"masked", "all"});
    break forward_join_96;
    }
    forwardValue1115_96_0 = null;
    }
    return forwardValue1115_96_0;
}
public static void h1115_0(moom.Oo p0) throws Throwable {
    throw __call1111500_0(p0);
}
public static void h1115_1(moom.Oo p0) throws Throwable {
    throw __call1111501_0(p0);
}
public static void h1115_2(moom.Oo p0) throws Throwable {
    throw __call1111502_0(p0);
}
public static void h1115_3(moom.Oo p0) throws Throwable {
    throw __call1111503_0(p0);
}
public static void h1115_4(moom.Oo p0) throws Throwable {
    throw __call1111504_0(p0);
}
public static void h1115_5(moom.Oo p0) throws Throwable {
    throw __call1111505_0(p0);
}
public static void h1115_6(moom.Oo p0) throws Throwable {
    throw __call1111506_0(p0);
}
public static void h1115_7(moom.Oo p0) throws Throwable {
    throw __call1111507_0(p0);
}
public static void h1115_8(moom.Oo p0) throws Throwable {
    throw __call1111508_0(p0);
}
public static void h1115_9(moom.Oo p0) throws Throwable {
    throw __call1111509_0(p0);
}
public static void h1115_10(moom.Oo p0) throws Throwable {
    throw __call1111510_0(p0);
}
public static void h1115_11(moom.Oo p0) throws Throwable {
    throw __call1111511_0(p0);
}
public static void h1115_12(moom.Oo p0) throws Throwable {
    throw __call1111512_0(p0);
}
private static native long __fieldRead1115_0() throws Throwable;
private static native boolean __call1115_1() throws Throwable;
private static native int __integerCategory1115_2(boolean value) throws Throwable;
private static native java.util.List __call1115_3(java.lang.String[] a0, int a1, moom.DT a2) throws Throwable;
private static native int __invokedynamic1115_4(int a0, long a1) throws Throwable;
private static native java.util.List __call1115_5(java.lang.String[] a0, int a1, moom.DT a2) throws Throwable;
private static native int __invokedynamic1115_6(int a0, long a1) throws Throwable;
private static native int __invokedynamic1115_7(int a0, long a1) throws Throwable;
private static native int __invokedynamic1115_8(int a0, long a1) throws Throwable;
private static native java.util.List __call1115_9(java.lang.String[] a0, int a1, moom.DT a2) throws Throwable;
private static native int __invokedynamic1115_10(int a0, long a1) throws Throwable;
private static native java.util.List __call1115_11(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.Exception __call1111500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111504_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111505_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111506_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111507_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111508_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111509_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111510_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111511_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111512_0(moom.Oo a0) throws Throwable;

}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8670_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/pO"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 21589;
      if (e[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(p1 >>> 56),
            (byte)(p1 >>> 48),
            (byte)(p1 >>> 40),
            (byte)(p1 >>> 32),
            (byte)(p1 >>> 24),
            (byte)(p1 >>> 16),
            (byte)(p1 >>> 8),
            (byte)p1
         };
         long var5 = d[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/pO", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.pO.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_365306331f6bb686d349(this, p0, p1, p2); }


public java.lang.String a__String() {
return "testforblocks";
}


public int a() {
return 2;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.compare.usage";
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_2c1ef29b6017e3f2f9c6(this, p0, p1); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8670_0() throws E;
}
