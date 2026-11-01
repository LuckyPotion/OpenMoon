package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class pV extends net.minecraft.command.CommandBase {

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map g;

public pV() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-7278668131112813038L)), ((long)(-3232471951436653435L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(100710641393355L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.pV.c ^ 22184454556380L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1460_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1460_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1460_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1460_14 = new byte[8];
    (__sourceSpill1460_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1460_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1460_16 = __sourceSpill1460_14;
    ((javax.crypto.Cipher)(__sourceSpill1460_11)).init(((int)(__sourceSpill1460_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1460_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1460_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[16];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ÿG\033xY[o1\005\033ïº0düm§Äá÷©\0357ÙÍ\034Mñá\003\033\032bâz\fZd¸_%\002\032*Ôi%îñ6Aú=àbn\016\001`4èÛDôrH3\022\013«ù?Ì¬>]\001¢\030o<nô\006u_\024¹¼ÓÁ\036\n¼.¾â\""))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1460_25 = local6_life21;
        int __sourceSpill1460_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1460_25)).substring(((int)(__sourceSpill1460_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1460_30 = local8_life19;
        int __sourceSpill1460_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1460_33 = new byte[8];
        (__sourceSpill1460_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1460_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1460_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1460_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1460_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1460_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1460_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1460_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1460_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1460_34)).doFinal(((byte[])(__sourceSpill1460_33)));
        (__sourceSpill1460_30)[__sourceSpill1460_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "kM+\035C\177ð#f\021ô Ü"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1460_38 = local6_life21;
        int __sourceSpill1460_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1460_38)).substring(((int)(__sourceSpill1460_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1460_43 = local8_life19;
        int __sourceSpill1460_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1460_46 = new byte[8];
        (__sourceSpill1460_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1460_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1460_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1460_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1460_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1460_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1460_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1460_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1460_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1460_47)).doFinal(((byte[])(__sourceSpill1460_46)));
        (__sourceSpill1460_43)[__sourceSpill1460_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[16]));
}

private static native <E extends Throwable> void __sourceHandlerCall_cb5c7d92e3778ec4c290(moom.pV a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_cb5c7d92e3778ec4c290 {

public static void f149(moom.pV receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    int forestValue149_75_0;
    int forestValue149_170_0;
    int forestValue149_175_0;
    int forestValue149_188_0;
    int forestValue149_258_0;
    int forestValue149_282_0;
    int forestValue149_291_0;
    int forestValue149_291_1;
    int forestValue149_329_0;
    int forestValue149_372_0;
    int forestValue149_392_0;
    int forestValue149_397_0;
    int forestValue149_402_0;
    int forestValue149_437_0;
    int forestValue149_437_1;
    int forestValue149_446_0;
    int forestValue149_462_0;
    int forestValue149_470_0;
    int forestValue149_470_1;
    int forestValue149_476_0;
    int forestValue149_476_1;
    int forestValue149_482_0;
    int forestValue149_482_1;
    int forestValue149_488_0;
    int forestValue149_488_1;
    int forestValue149_496_0;
    int forestValue149_496_1;
    int forestValue149_506_0;
    int forestValue149_519_0;
    net.minecraft.world.World forestValue149_524_0;
    moom.DT forestValue149_524_1;
    net.minecraft.tileentity.TileEntity forestValue149_531_0;
    net.minecraft.tileentity.TileEntity forestValue149_536_0;
    net.minecraft.world.World forestValue149_547_0;
    moom.DT forestValue149_547_1;
    net.minecraft.block.state.IBlockState forestValue149_547_2;
    net.minecraft.world.World forestValue149_548_0;
    moom.DT forestValue149_548_1;
    net.minecraft.block.state.IBlockState forestValue149_548_2;
    int forestValue149_548_3;
    int spill149_0;
    int spill149_1;
    boolean spill149_2;
    int spill149_3;
    int spill149_4;
    int spill149_5;
    int spill149_6;
    boolean spill149_7;
    boolean spill149_8;
    net.minecraft.world.World spill149_9;
    moom.DT spill149_10;
    int spill149_11;
    int spill149_12;
    int spill149_13;
    int spill149_14;
    net.minecraft.tileentity.TileEntity spill149_15;
    net.minecraft.world.World spill149_16;
    moom.DT spill149_17;
    net.minecraft.block.state.IBlockState spill149_18;
    long life3_3;
    int life5_5;
    moom.DT life6_33;
    moom.DT life7_39;
    net.minecraft.block.Block life8_49;
    int life9_51;
    moom.DT life10_97;
    moom.DT life11_116;
    int life12_140;
    net.minecraft.world.World life13_189;
    int life14_192;
    int life15_205;
    net.minecraft.nbt.NBTTagCompound life14_249;
    int life15_251;
    java.lang.String life16_276;
    java.util.ArrayList life16_284;
    int life12_286;
    int life17_289;
    int life18_296;
    int life19_305;
    moom.DT life20_316;
    net.minecraft.block.Block life21_447;
    int life21_478;
    net.minecraft.block.state.IBlockState life22_482;
    net.minecraft.tileentity.TileEntity life21_575;
    net.minecraft.block.state.IBlockState life22_606;
    net.minecraft.tileentity.TileEntity life23_630;
    java.util.Iterator life17_666;
    moom.DT life18_673;
    net.minecraft.block.Block life19_678;
    forest_join_662: {
    forest_join_655: {
    forest_join_653: {
    forest_join_638: {
    forest_join_629: {
    forest_join_606: {
    forest_join_274: {
    forest_join_258: {
    forest_join_240: {
    forest_join_233: {
    forest_join_175: {
    forest_join_170: {
    forest_join_168: {
    forest_join_76: {
    forest_join_75: {
    forest_join_27: {
    forest_join_23: {
    life3_3 = (__fieldRead149_0() ^ 115418673832052L);
    life5_5 = __integerCategory149_2(__call149_1());
    if (!((life5_5 == 0))) {
        break forest_join_27;
    }
    if (!(((p1).length < __invokedynamic149_3(14027, (1461011496487309535L ^ life3_3))))) {
        break forest_join_23;
    }
    throw new moom.cc("commands.fill.usage", new java.lang.Object[0]);
    }
    __call149_5(p0, __fieldRead149_4(), 0);
    }
    life6_33 = __call149_6(p0, p1, 0, 0);
    life7_39 = __call149_7(p0, p1, 3, 0);
    life8_49 = __call149_9(p0, (p1)[__invokedynamic149_8(9075, (7760123497313060204L ^ life3_3))]);
    life9_51 = 0;
    spill149_0 = (p1).length;
    if (!((life5_5 == 0))) {
        forestValue149_75_0 = spill149_0;
        break forest_join_75;
    }
    if (!((spill149_0 >= __invokedynamic149_10(9168, (6600062039453058505L ^ life3_3))))) {
        break forest_join_76;
    }
    forestValue149_75_0 = __call149_13((p1)[__invokedynamic149_11(24093, (4794624228747884549L ^ life3_3))], 0, __invokedynamic149_12(2325, (6524405830150713097L ^ life3_3)));
    }
    life9_51 = forestValue149_75_0;
    }
    life10_97 = new moom.DT(__call149_16(__call149_14(life6_33), __call149_15(life7_39)), __call149_19(__call149_17(life6_33), __call149_18(life7_39)), __call149_22(__call149_20(life6_33), __call149_21(life7_39)));
    life11_116 = new moom.DT(__call149_25(__call149_23(life6_33), __call149_24(life7_39)), __call149_28(__call149_26(life6_33), __call149_27(life7_39)), __call149_31(__call149_29(life6_33), __call149_30(life7_39)));
    life12_140 = ((((__call149_32(life11_116) - __call149_33(life10_97)) + 1) * ((__call149_34(life11_116) - __call149_35(life10_97)) + 1)) * ((__call149_36(life11_116) - __call149_37(life10_97)) + 1));
    spill149_1 = life12_140;
    if (!((life5_5 == 0))) {
        forestValue149_170_0 = spill149_1;
        break forest_join_170;
    }
    if (!((spill149_1 > __invokedynamic149_38(1849, (8113544610491621676L ^ life3_3))))) {
        break forest_join_168;
    }
    throw new moom.b7("commands.fill.tooManyBlocks", new java.lang.Object[] {__call149_39(life12_140), __call149_41(__invokedynamic149_40(21570, (3000034168347013721L ^ life3_3)))});
    }
    forestValue149_170_0 = __call149_42(life10_97);
    }
    if (!((life5_5 == 0))) {
        forestValue149_175_0 = forestValue149_170_0;
        break forest_join_175;
    }
    if (!((forestValue149_170_0 >= 0))) {
        break forest_join_655;
    }
    forestValue149_175_0 = __call149_43(life11_116);
    }
    if (!((forestValue149_175_0 < __invokedynamic149_44(20522, (7991906855358379580L ^ life3_3))))) {
        break forest_join_655;
    }
    life13_189 = __call149_45(p0);
    life14_192 = __call149_46(life10_97);
    forest_cycle_187: while (true) {
    forest_join_229: {
    forestValue149_188_0 = life14_192;
    forest_cycle_188: while (true) {
    if (!((forestValue149_188_0 < (__call149_47(life11_116) + __invokedynamic149_48(24132, (4029788346004158549L ^ life3_3)))))) {
        break forest_join_240;
    }
    life15_205 = __call149_49(life10_97);
    forest_cycle_200: while (true) {
    forest_join_226: {
    if (!((life15_205 < (__call149_50(life11_116) + __invokedynamic149_51(19543, (1939975120111184453L ^ life3_3)))))) {
        break forest_join_229;
    }
    spill149_2 = __call149_54(life13_189, new moom.DT(life15_205, (__call149_52(life11_116) - __call149_53(life10_97)), life14_192));
    if (!((life5_5 == 0))) {
        forestValue149_188_0 = __integerCategory149_55(spill149_2);
        continue forest_cycle_188;
    }
    if (!((!spill149_2))) {
        break forest_join_226;
    }
    break forest_join_233;
    }
    life15_205 += 16;
    if (!((life5_5 != 0))) {
        continue forest_cycle_200;
    }
    break forest_cycle_200;
    }
    break forest_cycle_188;
    }
    }
    life14_192 += 16;
    if (!((life5_5 != 0))) {
        continue forest_cycle_187;
    }
    break forest_cycle_187;
    }
    break forest_join_240;
    }
    throw new moom.b7("commands.fill.outOfWorld", new java.lang.Object[0]);
    }
    life14_249 = new net.minecraft.nbt.NBTTagCompound();
    life15_251 = 0;
    spill149_3 = (p1).length;
    if (!((life5_5 == 0))) {
        forestValue149_258_0 = spill149_3;
        break forest_join_258;
    }
    if (!((spill149_3 >= __invokedynamic149_56(12848, (8571055044323169322L ^ life3_3))))) {
        break forest_join_274;
    }
    forestValue149_258_0 = __integerCategory149_58(__call149_57(life8_49));
    }
    if (!((forestValue149_258_0 != 0))) {
        break forest_join_274;
    }
    life16_276 = __call149_61(__call149_60(p0, p1, __invokedynamic149_59(12229, (7477749864591051224L ^ life3_3))));
    life14_249 = __call149_62(life16_276);
    life15_251 = 1;
    }
    life16_284 = __call149_63();
    life12_286 = 0;
    life17_289 = __call149_64(life10_97);
    forest_cycle_281: while (true) {
    forest_join_603: {
    forestValue149_282_0 = life17_289;
    forest_cycle_282: while (true) {
    if (!((forestValue149_282_0 <= __call149_65(life11_116)))) {
        break forest_join_606;
    }
    life18_296 = __call149_66(life10_97);
    forest_cycle_288: while (true) {
    forest_join_600: {
    forestValue149_291_0 = life18_296;
    forestValue149_291_1 = __call149_67(life11_116);
    forest_cycle_291: while (true) {
    if (!((forestValue149_291_0 <= forestValue149_291_1))) {
        break forest_join_603;
    }
    spill149_4 = __call149_68(life10_97);
    if (!((life5_5 == 0))) {
        forestValue149_282_0 = spill149_4;
        continue forest_cycle_282;
    }
    life19_305 = spill149_4;
    forest_cycle_297: while (true) {
    forest_join_598: {
    forest_join_597: {
    forest_join_550: {
    forest_join_548: {
    forest_join_547: {
    forest_join_538: {
    forest_join_536: {
    forest_join_531: {
    forest_join_524: {
    forest_join_522: {
    forest_join_519: {
    forest_join_506: {
    forest_join_496: {
    forest_join_488: {
    forest_join_482: {
    forest_join_476: {
    forest_join_470: {
    forest_join_462: {
    forest_join_461: {
    forest_join_459: {
    forest_join_446: {
    forest_join_437: {
    forest_join_428: {
    forest_join_402: {
    forest_join_397: {
    forest_join_392: {
    forest_join_383: {
    forest_join_372: {
    forest_join_363: {
    forest_join_329: {
    if (!((life19_305 <= __call149_69(life11_116)))) {
        break forest_join_600;
    }
    life20_316 = new moom.DT(life19_305, life18_296, life17_289);
    spill149_5 = (p1).length;
    if (!((life5_5 == 0))) {
        forestValue149_329_0 = spill149_5;
        break forest_join_329;
    }
    spill149_6 = __invokedynamic149_70(2371, (3533427806165299037L ^ life3_3));
    if (!((life5_5 == 0))) {
        forestValue149_291_0 = spill149_5;
        forestValue149_291_1 = spill149_6;
        continue forest_cycle_291;
    }
    if (!((spill149_5 >= spill149_6))) {
        break forest_join_522;
    }
    forestValue149_329_0 = __integerCategory149_73(__call149_72((p1)[__invokedynamic149_71(22042, (7020858094664265737L ^ life3_3))], "outline"));
    }
    if (!((life5_5 == 0))) {
        forestValue149_462_0 = forestValue149_329_0;
        break forest_join_462;
    }
    if (!((forestValue149_329_0 == 0))) {
        break forest_join_461;
    }
    spill149_7 = __call149_75((p1)[__invokedynamic149_74(22042, (7020858094664265737L ^ life3_3))], "hollow");
    if (!((life5_5 == 0))) {
        forestValue149_462_0 = __integerCategory149_76(spill149_7);
        break forest_join_462;
    }
    if (!((!spill149_7))) {
        break forest_join_461;
    }
    spill149_8 = __call149_78((p1)[__invokedynamic149_77(22042, (7020858094664265737L ^ life3_3))], "destroy");
    if (!((life5_5 == 0))) {
        forestValue149_372_0 = __integerCategory149_79(spill149_8);
        break forest_join_372;
    }
    if (!(spill149_8)) {
        break forest_join_363;
    }
    __call149_80(life13_189, life20_316, 1);
    if (!((life5_5 != 0))) {
        break forest_join_522;
    }
    }
    forestValue149_372_0 = __integerCategory149_83(__call149_82((p1)[__invokedynamic149_81(22042, (7020858094664265737L ^ life3_3))], "keep"));
    }
    if (!((life5_5 == 0))) {
        forestValue149_392_0 = forestValue149_372_0;
        break forest_join_392;
    }
    if (!((forestValue149_372_0 != 0))) {
        break forest_join_383;
    }
    spill149_9 = life13_189;
    spill149_10 = life20_316;
    if (!((life5_5 == 0))) {
        forestValue149_524_0 = spill149_9;
        forestValue149_524_1 = spill149_10;
        break forest_join_524;
    }
    if (!((!__call149_84(spill149_9, spill149_10)))) {
        break forest_join_522;
    }
    if (!((life5_5 != 0))) {
        break forest_join_597;
    }
    }
    forestValue149_392_0 = __integerCategory149_87(__call149_86((p1)[__invokedynamic149_85(22042, (7020858094664265737L ^ life3_3))], "replace"));
    }
    if (!((life5_5 == 0))) {
        forestValue149_397_0 = forestValue149_392_0;
        break forest_join_397;
    }
    if (!((forestValue149_392_0 != 0))) {
        break forest_join_522;
    }
    forestValue149_397_0 = __integerCategory149_89(__call149_88(life8_49));
    }
    if (!((life5_5 == 0))) {
        forestValue149_402_0 = forestValue149_397_0;
        break forest_join_402;
    }
    if (!((forestValue149_397_0 == 0))) {
        break forest_join_522;
    }
    forestValue149_402_0 = (p1).length;
    }
    spill149_11 = __invokedynamic149_90(2371, (3533427806165299037L ^ life3_3));
    if (!((life5_5 == 0))) {
        forestValue149_437_0 = forestValue149_402_0;
        forestValue149_437_1 = spill149_11;
        break forest_join_437;
    }
    if (!((forestValue149_402_0 > spill149_11))) {
        break forest_join_428;
    }
    life21_447 = __call149_92(p0, (p1)[__invokedynamic149_91(2371, (3533427806165299037L ^ life3_3))]);
    if (!((__call149_94(__call149_93(life13_189, life20_316)) != life21_447))) {
        break forest_join_428;
    }
    if (!((life5_5 != 0))) {
        break forest_join_597;
    }
    }
    spill149_12 = (p1).length;
    if (!((life5_5 == 0))) {
        forestValue149_446_0 = spill149_12;
        break forest_join_446;
    }
    forestValue149_437_0 = spill149_12;
    forestValue149_437_1 = __invokedynamic149_95(3074, (7714069684271737365L ^ life3_3));
    }
    if (!((forestValue149_437_0 > forestValue149_437_1))) {
        break forest_join_522;
    }
    forestValue149_446_0 = __call149_97((p1)[__invokedynamic149_96(3074, (7714069684271737365L ^ life3_3))]);
    }
    life21_478 = forestValue149_446_0;
    life22_482 = __call149_98(life13_189, life20_316);
    if (!((__call149_100(__call149_99(life22_482), life22_482) != life21_478))) {
        break forest_join_459;
    }
    if (!((life5_5 != 0))) {
        break forest_join_597;
    }
    }
    if (!((life5_5 != 0))) {
        break forest_join_522;
    }
    }
    forestValue149_462_0 = life19_305;
    }
    spill149_13 = __call149_101(life10_97);
    if (!((life5_5 == 0))) {
        forestValue149_470_0 = forestValue149_462_0;
        forestValue149_470_1 = spill149_13;
        break forest_join_470;
    }
    if (!((forestValue149_462_0 != spill149_13))) {
        break forest_join_522;
    }
    forestValue149_470_0 = life19_305;
    forestValue149_470_1 = __call149_102(life11_116);
    }
    if (!((life5_5 == 0))) {
        forestValue149_476_0 = forestValue149_470_0;
        forestValue149_476_1 = forestValue149_470_1;
        break forest_join_476;
    }
    if (!((forestValue149_470_0 != forestValue149_470_1))) {
        break forest_join_522;
    }
    forestValue149_476_0 = life18_296;
    forestValue149_476_1 = __call149_103(life10_97);
    }
    if (!((life5_5 == 0))) {
        forestValue149_482_0 = forestValue149_476_0;
        forestValue149_482_1 = forestValue149_476_1;
        break forest_join_482;
    }
    if (!((forestValue149_476_0 != forestValue149_476_1))) {
        break forest_join_522;
    }
    forestValue149_482_0 = life18_296;
    forestValue149_482_1 = __call149_104(life11_116);
    }
    if (!((life5_5 == 0))) {
        forestValue149_488_0 = forestValue149_482_0;
        forestValue149_488_1 = forestValue149_482_1;
        break forest_join_488;
    }
    if (!((forestValue149_482_0 != forestValue149_482_1))) {
        break forest_join_522;
    }
    forestValue149_488_0 = life17_289;
    forestValue149_488_1 = __call149_105(life10_97);
    }
    if (!((life5_5 == 0))) {
        forestValue149_496_0 = forestValue149_488_0;
        forestValue149_496_1 = forestValue149_488_1;
        break forest_join_496;
    }
    if (!((forestValue149_488_0 != forestValue149_488_1))) {
        break forest_join_522;
    }
    spill149_14 = life17_289;
    if (!((life5_5 == 0))) {
        forestValue149_506_0 = spill149_14;
        break forest_join_506;
    }
    forestValue149_496_0 = spill149_14;
    forestValue149_496_1 = __call149_106(life11_116);
    }
    if (!((forestValue149_496_0 != forestValue149_496_1))) {
        break forest_join_522;
    }
    forestValue149_506_0 = __integerCategory149_109(__call149_108((p1)[__invokedynamic149_107(22042, (7020858094664265737L ^ life3_3))], "hollow"));
    }
    if (!((life5_5 == 0))) {
        forestValue149_519_0 = forestValue149_506_0;
        break forest_join_519;
    }
    if (!((forestValue149_506_0 != 0))) {
        break forest_join_597;
    }
    __call149_112(life13_189, life20_316, __call149_111(__fieldRead149_110()), 2);
    forestValue149_519_0 = __integerCategory149_114(__call149_113(life16_284, life20_316));
    }
    __discardScalar149_115(forestValue149_519_0);
    if (!((life5_5 != 0))) {
        break forest_join_597;
    }
    }
    forestValue149_524_0 = life13_189;
    forestValue149_524_1 = life20_316;
    }
    life21_575 = __call149_116(forestValue149_524_0, forestValue149_524_1);
    spill149_15 = life21_575;
    if (!((life5_5 == 0))) {
        forestValue149_531_0 = spill149_15;
        break forest_join_531;
    }
    if (!((spill149_15 != null))) {
        break forest_join_550;
    }
    forestValue149_531_0 = life21_575;
    }
    if (!((life5_5 == 0))) {
        forestValue149_536_0 = forestValue149_531_0;
        break forest_join_536;
    }
    if (!((__instanceOf149_117(forestValue149_531_0) != 0))) {
        break forest_join_538;
    }
    forestValue149_536_0 = life21_575;
    }
    __call149_119(__cast149_118(forestValue149_536_0));
    }
    spill149_16 = life13_189;
    spill149_17 = life20_316;
    spill149_18 = __call149_121(__fieldRead149_120());
    if (!((life8_49 == __fieldRead149_122()))) {
        forestValue149_547_0 = spill149_16;
        forestValue149_547_1 = spill149_17;
        forestValue149_547_2 = spill149_18;
        break forest_join_547;
    }
    forestValue149_548_0 = spill149_16;
    forestValue149_548_1 = spill149_17;
    forestValue149_548_2 = spill149_18;
    forestValue149_548_3 = 2;
    break forest_join_548;
    }
    forestValue149_548_0 = forestValue149_547_0;
    forestValue149_548_1 = forestValue149_547_1;
    forestValue149_548_2 = forestValue149_547_2;
    forestValue149_548_3 = 4;
    }
    __call149_123(forestValue149_548_0, forestValue149_548_1, forestValue149_548_2, forestValue149_548_3);
    }
    life22_606 = __call149_124(life8_49, life9_51);
    if (!((life5_5 == 0))) {
        break forest_join_598;
    }
    if (!(__call149_125(life13_189, life20_316, life22_606, 2))) {
        break forest_join_597;
    }
    __call149_126(life16_284, life20_316);
    life12_286 += 1;
    if (!((life5_5 == 0))) {
        break forest_join_598;
    }
    if (!((life15_251 != 0))) {
        break forest_join_597;
    }
    life23_630 = __call149_127(life13_189, life20_316);
    if (!((life5_5 == 0))) {
        break forest_join_598;
    }
    if (!((life23_630 != null))) {
        break forest_join_597;
    }
    __call149_129(life14_249, "x", __call149_128(life20_316));
    __call149_131(life14_249, "y", __call149_130(life20_316));
    __call149_133(life14_249, "z", __call149_132(life20_316));
    __call149_134(life23_630, life14_249);
    }
    life19_305 += 1;
    }
    if (!((life5_5 != 0))) {
        continue forest_cycle_297;
    }
    break forest_cycle_297;
    }
    break forest_cycle_291;
    }
    }
    life18_296 += 1;
    if (!((life5_5 != 0))) {
        continue forest_cycle_288;
    }
    break forest_cycle_288;
    }
    break forest_cycle_282;
    }
    }
    life17_289 += 1;
    if (!((life5_5 != 0))) {
        continue forest_cycle_281;
    }
    break forest_cycle_281;
    }
    }
    life17_666 = __call149_135(life16_284);
    forest_cycle_609: while (true) {
    if (!(__call149_136(life17_666))) {
        break forest_join_629;
    }
    life18_673 = __cast149_138(__call149_137(life17_666));
    life19_678 = __call149_140(__call149_139(life13_189, life18_673));
    __call149_141(life13_189, life18_673, life19_678);
    if (!((life5_5 == 0))) {
        break forest_join_653;
    }
    if (!((life5_5 != 0))) {
        continue forest_cycle_609;
    }
    break forest_cycle_609;
    }
    }
    if (!((life12_286 <= 0))) {
        break forest_join_638;
    }
    throw new moom.b7("commands.fill.failed", new java.lang.Object[0]);
    }
    __call149_143(p0, __fieldRead149_142(), life12_286);
    __call149_145(p0, receiver, "commands.fill.success", new java.lang.Object[] {__call149_144(life12_286)});
    }
    if (!((life5_5 != 0))) {
        break forest_join_662;
    }
    }
    throw new moom.b7("commands.fill.outOfWorld", new java.lang.Object[0]);
    }
    return;
}
public static void h149_0(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014900_0(p0);
}
public static void h149_1(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014901_0(p0);
}
public static void h149_2(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014902_0(p0);
}
public static void h149_3(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014903_0(p0);
}
public static void h149_4(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014904_0(p0);
}
public static void h149_5(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014905_0(p0);
}
public static void h149_6(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014906_0(p0);
}
public static void h149_7(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014907_0(p0);
}
public static void h149_8(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014908_0(p0);
}
public static void h149_9(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014909_0(p0);
}
public static void h149_10(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014910_0(p0);
}
public static void h149_11(net.minecraft.nbt.NBTException p0) throws Throwable {
    net.minecraft.nbt.NBTException life1_2;
    life1_2 = p0;
    throw new moom.b7("commands.fill.tagError", new java.lang.Object[] {__call3014911_0(life1_2)});
}
public static void h149_12(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014912_0(p0);
}
public static void h149_13(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014913_0(p0);
}
public static void h149_14(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014914_0(p0);
}
public static void h149_15(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014915_0(p0);
}
public static void h149_16(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014916_0(p0);
}
public static void h149_17(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014917_0(p0);
}
public static void h149_18(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014918_0(p0);
}
public static void h149_19(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014919_0(p0);
}
public static void h149_20(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014920_0(p0);
}
public static void h149_21(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014921_0(p0);
}
public static void h149_22(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014922_0(p0);
}
public static void h149_23(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014923_0(p0);
}
public static void h149_24(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014924_0(p0);
}
public static void h149_25(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014925_0(p0);
}
public static void h149_26(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014926_0(p0);
}
public static void h149_27(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014927_0(p0);
}
public static void h149_28(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014928_0(p0);
}
public static void h149_29(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014929_0(p0);
}
public static void h149_30(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014930_0(p0);
}
public static void h149_31(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014931_0(p0);
}
public static void h149_32(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014932_0(p0);
}
public static void h149_33(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014933_0(p0);
}
public static void h149_34(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014934_0(p0);
}
public static void h149_35(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014935_0(p0);
}
public static void h149_36(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014936_0(p0);
}
public static void h149_37(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014937_0(p0);
}
public static void h149_38(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014938_0(p0);
}
public static void h149_39(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014939_0(p0);
}
public static void h149_40(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014940_0(p0);
}
public static void h149_41(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014941_0(p0);
}
public static void h149_42(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014942_0(p0);
}
public static void h149_43(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014943_0(p0);
}
public static void h149_44(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014944_0(p0);
}
public static void h149_45(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014945_0(p0);
}
public static void h149_46(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014946_0(p0);
}
public static void h149_47(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014947_0(p0);
}
public static void h149_48(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014948_0(p0);
}
public static void h149_49(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014949_0(p0);
}
public static void h149_50(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014950_0(p0);
}
public static void h149_51(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014951_0(p0);
}
public static void h149_52(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014952_0(p0);
}
public static void h149_53(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014953_0(p0);
}
public static void h149_54(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014954_0(p0);
}
public static void h149_55(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014955_0(p0);
}
public static void h149_56(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014956_0(p0);
}
public static void h149_57(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014957_0(p0);
}
public static void h149_58(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014958_0(p0);
}
public static void h149_59(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014959_0(p0);
}
public static void h149_60(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014960_0(p0);
}
public static void h149_61(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014961_0(p0);
}
public static void h149_62(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014962_0(p0);
}
public static void h149_63(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014963_0(p0);
}
public static void h149_64(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014964_0(p0);
}
private static native long __fieldRead149_0() throws Throwable;
private static native boolean __call149_1() throws Throwable;
private static native int __integerCategory149_2(boolean value) throws Throwable;
private static native int __invokedynamic149_3(int a0, long a1) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead149_4() throws Throwable;
private static native void __call149_5(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native moom.DT __call149_6(net.minecraft.command.ICommandSender a0, java.lang.String[] a1, int a2, int a3) throws Throwable;
private static native moom.DT __call149_7(net.minecraft.command.ICommandSender a0, java.lang.String[] a1, int a2, int a3) throws Throwable;
private static native int __invokedynamic149_8(int a0, long a1) throws Throwable;
private static native net.minecraft.block.Block __call149_9(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic149_10(int a0, long a1) throws Throwable;
private static native int __invokedynamic149_11(int a0, long a1) throws Throwable;
private static native int __invokedynamic149_12(int a0, long a1) throws Throwable;
private static native int __call149_13(java.lang.String a0, int a1, int a2) throws Throwable;
private static native int __call149_14(moom.DT a0) throws Throwable;
private static native int __call149_15(moom.DT a0) throws Throwable;
private static native int __call149_16(int a0, int a1) throws Throwable;
private static native int __call149_17(moom.DT a0) throws Throwable;
private static native int __call149_18(moom.DT a0) throws Throwable;
private static native int __call149_19(int a0, int a1) throws Throwable;
private static native int __call149_20(moom.DT a0) throws Throwable;
private static native int __call149_21(moom.DT a0) throws Throwable;
private static native int __call149_22(int a0, int a1) throws Throwable;
private static native int __call149_23(moom.DT a0) throws Throwable;
private static native int __call149_24(moom.DT a0) throws Throwable;
private static native int __call149_25(int a0, int a1) throws Throwable;
private static native int __call149_26(moom.DT a0) throws Throwable;
private static native int __call149_27(moom.DT a0) throws Throwable;
private static native int __call149_28(int a0, int a1) throws Throwable;
private static native int __call149_29(moom.DT a0) throws Throwable;
private static native int __call149_30(moom.DT a0) throws Throwable;
private static native int __call149_31(int a0, int a1) throws Throwable;
private static native int __call149_32(moom.DT a0) throws Throwable;
private static native int __call149_33(moom.DT a0) throws Throwable;
private static native int __call149_34(moom.DT a0) throws Throwable;
private static native int __call149_35(moom.DT a0) throws Throwable;
private static native int __call149_36(moom.DT a0) throws Throwable;
private static native int __call149_37(moom.DT a0) throws Throwable;
private static native int __invokedynamic149_38(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call149_39(int a0) throws Throwable;
private static native int __invokedynamic149_40(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call149_41(int a0) throws Throwable;
private static native int __call149_42(moom.DT a0) throws Throwable;
private static native int __call149_43(moom.DT a0) throws Throwable;
private static native int __invokedynamic149_44(int a0, long a1) throws Throwable;
private static native net.minecraft.world.World __call149_45(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native int __call149_46(moom.DT a0) throws Throwable;
private static native int __call149_47(moom.DT a0) throws Throwable;
private static native int __invokedynamic149_48(int a0, long a1) throws Throwable;
private static native int __call149_49(moom.DT a0) throws Throwable;
private static native int __call149_50(moom.DT a0) throws Throwable;
private static native int __invokedynamic149_51(int a0, long a1) throws Throwable;
private static native int __call149_52(moom.DT a0) throws Throwable;
private static native int __call149_53(moom.DT a0) throws Throwable;
private static native boolean __call149_54(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __integerCategory149_55(boolean value) throws Throwable;
private static native int __invokedynamic149_56(int a0, long a1) throws Throwable;
private static native boolean __call149_57(net.minecraft.block.Block a0) throws Throwable;
private static native int __integerCategory149_58(boolean value) throws Throwable;
private static native int __invokedynamic149_59(int a0, long a1) throws Throwable;
private static native net.minecraft.util.IChatComponent __call149_60(net.minecraft.command.ICommandSender a0, java.lang.String[] a1, int a2) throws Throwable;
private static native java.lang.String __call149_61(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call149_62(java.lang.String a0) throws Throwable;
private static native java.util.ArrayList __call149_63() throws Throwable;
private static native int __call149_64(moom.DT a0) throws Throwable;
private static native int __call149_65(moom.DT a0) throws Throwable;
private static native int __call149_66(moom.DT a0) throws Throwable;
private static native int __call149_67(moom.DT a0) throws Throwable;
private static native int __call149_68(moom.DT a0) throws Throwable;
private static native int __call149_69(moom.DT a0) throws Throwable;
private static native int __invokedynamic149_70(int a0, long a1) throws Throwable;
private static native int __invokedynamic149_71(int a0, long a1) throws Throwable;
private static native boolean __call149_72(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory149_73(boolean value) throws Throwable;
private static native int __invokedynamic149_74(int a0, long a1) throws Throwable;
private static native boolean __call149_75(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory149_76(boolean value) throws Throwable;
private static native int __invokedynamic149_77(int a0, long a1) throws Throwable;
private static native boolean __call149_78(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory149_79(boolean value) throws Throwable;
private static native boolean __call149_80(net.minecraft.world.World a0, moom.DT a1, int a2) throws Throwable;
private static native int __invokedynamic149_81(int a0, long a1) throws Throwable;
private static native boolean __call149_82(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory149_83(boolean value) throws Throwable;
private static native boolean __call149_84(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __invokedynamic149_85(int a0, long a1) throws Throwable;
private static native boolean __call149_86(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory149_87(boolean value) throws Throwable;
private static native boolean __call149_88(net.minecraft.block.Block a0) throws Throwable;
private static native int __integerCategory149_89(boolean value) throws Throwable;
private static native int __invokedynamic149_90(int a0, long a1) throws Throwable;
private static native int __invokedynamic149_91(int a0, long a1) throws Throwable;
private static native net.minecraft.block.Block __call149_92(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call149_93(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call149_94(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __invokedynamic149_95(int a0, long a1) throws Throwable;
private static native int __invokedynamic149_96(int a0, long a1) throws Throwable;
private static native int __call149_97(java.lang.String a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call149_98(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call149_99(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __call149_100(net.minecraft.block.Block a0, net.minecraft.block.state.IBlockState a1) throws Throwable;
private static native int __call149_101(moom.DT a0) throws Throwable;
private static native int __call149_102(moom.DT a0) throws Throwable;
private static native int __call149_103(moom.DT a0) throws Throwable;
private static native int __call149_104(moom.DT a0) throws Throwable;
private static native int __call149_105(moom.DT a0) throws Throwable;
private static native int __call149_106(moom.DT a0) throws Throwable;
private static native int __invokedynamic149_107(int a0, long a1) throws Throwable;
private static native boolean __call149_108(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory149_109(boolean value) throws Throwable;
private static native net.minecraft.block.Block __fieldRead149_110() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call149_111(net.minecraft.block.Block a0) throws Throwable;
private static native boolean __call149_112(net.minecraft.world.World a0, moom.DT a1, net.minecraft.block.state.IBlockState a2, int a3) throws Throwable;
private static native boolean __call149_113(java.util.ArrayList a0, moom.DT a1) throws Throwable;
private static native int __integerCategory149_114(boolean value) throws Throwable;
private static native void __discardScalar149_115(int a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call149_116(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __instanceOf149_117(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.inventory.IInventory __cast149_118(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native void __call149_119(net.minecraft.inventory.IInventory a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead149_120() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call149_121(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead149_122() throws Throwable;
private static native boolean __call149_123(net.minecraft.world.World a0, moom.DT a1, net.minecraft.block.state.IBlockState a2, int a3) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call149_124(net.minecraft.block.Block a0, int a1) throws Throwable;
private static native boolean __call149_125(net.minecraft.world.World a0, moom.DT a1, net.minecraft.block.state.IBlockState a2, int a3) throws Throwable;
private static native boolean __call149_126(java.util.ArrayList a0, moom.DT a1) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call149_127(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __call149_128(moom.DT a0) throws Throwable;
private static native void __call149_129(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __call149_130(moom.DT a0) throws Throwable;
private static native void __call149_131(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __call149_132(moom.DT a0) throws Throwable;
private static native void __call149_133(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native void __call149_134(net.minecraft.tileentity.TileEntity a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native java.util.Iterator __call149_135(java.util.ArrayList a0) throws Throwable;
private static native boolean __call149_136(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call149_137(java.util.Iterator a0) throws Throwable;
private static native moom.DT __cast149_138(java.lang.Object a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call149_139(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call149_140(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native void __call149_141(net.minecraft.world.World a0, moom.DT a1, net.minecraft.block.Block a2) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead149_142() throws Throwable;
private static native void __call149_143(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native java.lang.Integer __call149_144(int a0) throws Throwable;
private static native void __call149_145(net.minecraft.command.ICommandSender a0, moom.pV a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call3014900_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014901_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014902_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014903_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014904_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014905_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014906_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014907_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014908_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014909_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014910_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.String __call3014911_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014912_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014913_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014914_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014915_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014916_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014917_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014918_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014919_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014920_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014921_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014922_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014923_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014924_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014925_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014926_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014927_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014928_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014929_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014930_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014931_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014932_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014933_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014934_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014935_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014936_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014937_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014938_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014939_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014940_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014941_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014942_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014943_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014944_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014945_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014946_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014947_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014948_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014949_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014950_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014951_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014952_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014953_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014954_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014955_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014956_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014957_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014958_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014959_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014960_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014961_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014962_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014963_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014964_0(net.minecraft.nbt.NBTException a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_188f7d138fd7e40e05d6(moom.pV a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_188f7d138fd7e40e05d6 {

public static java.util.List f1125(moom.pV receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    int forwardValue1125_24_0;
    int forwardValue1125_25_0;
    int forwardValue1125_25_1;
    int forwardValue1125_50_0;
    int forwardValue1125_50_1;
    int forwardValue1125_65_0;
    int forwardValue1125_65_1;
    int forwardValue1125_102_0;
    int forwardValue1125_102_1;
    int forwardValue1125_112_0;
    java.util.List forwardValue1125_119_0;
    int spill1125_0;
    int spill1125_1;
    int spill1125_2;
    int spill1125_3;
    int spill1125_4;
    int spill1125_5;
    long life4_3;
    int life6_5;
    forward_join_119: {
    forward_join_118: {
    forward_join_112: {
    forward_join_102: {
    forward_join_93: {
    forward_join_65: {
    forward_join_58: {
    forward_join_50: {
    forward_join_43: {
    forward_join_25: {
    forward_join_24: {
    forward_join_22: {
    life4_3 = (__fieldRead1125_0() ^ 52715659162103L);
    life6_5 = __integerCategory1125_2(__call1125_1());
    spill1125_0 = (p1).length;
    if (!((life6_5 == 0))) {
        forwardValue1125_24_0 = spill1125_0;
        break forward_join_24;
    }
    if (!((spill1125_0 > 0))) {
        break forward_join_22;
    }
    spill1125_1 = (p1).length;
    spill1125_2 = 3;
    if (!((life6_5 == 0))) {
        forwardValue1125_25_0 = spill1125_1;
        forwardValue1125_25_1 = spill1125_2;
        break forward_join_25;
    }
    if (!((spill1125_1 <= spill1125_2))) {
        break forward_join_22;
    }
    forwardValue1125_119_0 = __call1125_3(p1, 0, p2);
    break forward_join_119;
    }
    forwardValue1125_24_0 = (p1).length;
    }
    forwardValue1125_25_0 = forwardValue1125_24_0;
    forwardValue1125_25_1 = 3;
    }
    if (!((life6_5 == 0))) {
        forwardValue1125_50_0 = forwardValue1125_25_0;
        forwardValue1125_50_1 = forwardValue1125_25_1;
        break forward_join_50;
    }
    if (!((forwardValue1125_25_0 > forwardValue1125_25_1))) {
        break forward_join_43;
    }
    spill1125_3 = (p1).length;
    spill1125_4 = __invokedynamic1125_4(14348, (3501578448581250975L ^ life4_3));
    if (!((life6_5 == 0))) {
        forwardValue1125_50_0 = spill1125_3;
        forwardValue1125_50_1 = spill1125_4;
        break forward_join_50;
    }
    if (!((spill1125_3 <= spill1125_4))) {
        break forward_join_43;
    }
    forwardValue1125_119_0 = __call1125_5(p1, 3, p2);
    break forward_join_119;
    }
    forwardValue1125_50_0 = (p1).length;
    forwardValue1125_50_1 = __invokedynamic1125_6(24093, (4794550597184465286L ^ life4_3));
    }
    if (!((life6_5 == 0))) {
        forwardValue1125_65_0 = forwardValue1125_50_0;
        forwardValue1125_65_1 = forwardValue1125_50_1;
        break forward_join_65;
    }
    if (!((forwardValue1125_50_0 == forwardValue1125_50_1))) {
        break forward_join_58;
    }
    forwardValue1125_119_0 = __call1125_9(p1, __call1125_8(__fieldRead1125_7()));
    break forward_join_119;
    }
    forwardValue1125_65_0 = (p1).length;
    forwardValue1125_65_1 = __invokedynamic1125_10(2371, (3533362901976284894L ^ life4_3));
    }
    if (!((life6_5 == 0))) {
        forwardValue1125_102_0 = forwardValue1125_65_0;
        forwardValue1125_102_1 = forwardValue1125_65_1;
        break forward_join_102;
    }
    if (!((forwardValue1125_65_0 == forwardValue1125_65_1))) {
        break forward_join_93;
    }
    forwardValue1125_119_0 = __call1125_11(p1, new java.lang.String[] {"replace", "destroy", "keep", "hollow", "outline"});
    break forward_join_119;
    }
    spill1125_5 = (p1).length;
    if (!((life6_5 == 0))) {
        forwardValue1125_112_0 = spill1125_5;
        break forward_join_112;
    }
    forwardValue1125_102_0 = spill1125_5;
    forwardValue1125_102_1 = __invokedynamic1125_12(3074, (7714004844441172886L ^ life4_3));
    }
    if (!((forwardValue1125_102_0 == forwardValue1125_102_1))) {
        break forward_join_118;
    }
    forwardValue1125_112_0 = __integerCategory1125_15(__call1125_14("replace", (p1)[__invokedynamic1125_13(22042, (7020933930078249354L ^ life4_3))]));
    }
    if (!((forwardValue1125_112_0 != 0))) {
        break forward_join_118;
    }
    forwardValue1125_119_0 = __call1125_18(p1, __call1125_17(__fieldRead1125_16()));
    break forward_join_119;
    }
    forwardValue1125_119_0 = null;
    }
    return forwardValue1125_119_0;
}
public static void h1125_0(moom.Oo p0) throws Throwable {
    throw __call1112500_0(p0);
}
public static void h1125_1(moom.Oo p0) throws Throwable {
    throw __call1112501_0(p0);
}
public static void h1125_2(moom.Oo p0) throws Throwable {
    throw __call1112502_0(p0);
}
public static void h1125_3(moom.Oo p0) throws Throwable {
    throw __call1112503_0(p0);
}
public static void h1125_4(moom.Oo p0) throws Throwable {
    throw __call1112504_0(p0);
}
public static void h1125_5(moom.Oo p0) throws Throwable {
    throw __call1112505_0(p0);
}
public static void h1125_6(moom.Oo p0) throws Throwable {
    throw __call1112506_0(p0);
}
public static void h1125_7(moom.Oo p0) throws Throwable {
    throw __call1112507_0(p0);
}
public static void h1125_8(moom.Oo p0) throws Throwable {
    throw __call1112508_0(p0);
}
public static void h1125_9(moom.Oo p0) throws Throwable {
    throw __call1112509_0(p0);
}
public static void h1125_10(moom.Oo p0) throws Throwable {
    throw __call1112510_0(p0);
}
public static void h1125_11(moom.Oo p0) throws Throwable {
    throw __call1112511_0(p0);
}
public static void h1125_12(moom.Oo p0) throws Throwable {
    throw __call1112512_0(p0);
}
public static void h1125_13(moom.Oo p0) throws Throwable {
    throw __call1112513_0(p0);
}
public static void h1125_14(moom.Oo p0) throws Throwable {
    throw __call1112514_0(p0);
}
private static native long __fieldRead1125_0() throws Throwable;
private static native boolean __call1125_1() throws Throwable;
private static native int __integerCategory1125_2(boolean value) throws Throwable;
private static native java.util.List __call1125_3(java.lang.String[] a0, int a1, moom.DT a2) throws Throwable;
private static native int __invokedynamic1125_4(int a0, long a1) throws Throwable;
private static native java.util.List __call1125_5(java.lang.String[] a0, int a1, moom.DT a2) throws Throwable;
private static native int __invokedynamic1125_6(int a0, long a1) throws Throwable;
private static native moom.DC __fieldRead1125_7() throws Throwable;
private static native java.util.Set __call1125_8(moom.DC a0) throws Throwable;
private static native java.util.List __call1125_9(java.lang.String[] a0, java.util.Set a1) throws Throwable;
private static native int __invokedynamic1125_10(int a0, long a1) throws Throwable;
private static native java.util.List __call1125_11(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native int __invokedynamic1125_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic1125_13(int a0, long a1) throws Throwable;
private static native boolean __call1125_14(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1125_15(boolean value) throws Throwable;
private static native moom.DC __fieldRead1125_16() throws Throwable;
private static native java.util.Set __call1125_17(moom.DC a0) throws Throwable;
private static native java.util.List __call1125_18(java.lang.String[] a0, java.util.Set a1) throws Throwable;
private static native java.lang.Exception __call1112500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1112501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1112502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1112503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1112504_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1112505_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1112506_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1112507_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1112508_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1112509_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1112510_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1112511_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1112512_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1112513_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1112514_0(moom.Oo a0) throws Throwable;

}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8689_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/pV"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 28004;
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
            throw new RuntimeException("moom/pV", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.pV.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_188f7d138fd7e40e05d6(this, p0, p1, p2); }


public java.lang.String a__String() {
return "fill";
}


public int a() {
return 2;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.fill.usage";
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_cb5c7d92e3778ec4c290(this, p0, p1); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8689_0() throws E;
}
