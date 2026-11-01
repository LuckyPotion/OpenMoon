package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class pN extends net.minecraft.command.CommandBase {

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map g;

public pN() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(1739753879004376760L)), ((long)(-208030787095683296L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(161328411697223L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.pN.c ^ 102856480034807L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1456_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1456_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1456_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1456_14 = new byte[8];
    (__sourceSpill1456_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1456_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1456_16 = __sourceSpill1456_14;
    ((javax.crypto.Cipher)(__sourceSpill1456_11)).init(((int)(__sourceSpill1456_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1456_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1456_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[16];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ú\032¦e¹æ¤\177h¡óTsµÉbØÀ\034.9ÔwQ«\bØ\"\n~÷\034\020Þ(\006\007ÙØ\0241ÄÒ§\033^(î¼\b(þ\\¢d \000G½©é\016¾Æ2eº}§FÚ\017$\032ãÖß¶ Ô\"©\177é­n\034\027Û¸[áú4\034¦õa"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1456_25 = local6_life21;
        int __sourceSpill1456_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1456_25)).substring(((int)(__sourceSpill1456_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1456_30 = local8_life19;
        int __sourceSpill1456_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1456_33 = new byte[8];
        (__sourceSpill1456_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1456_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1456_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1456_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1456_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1456_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1456_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1456_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1456_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1456_34)).doFinal(((byte[])(__sourceSpill1456_33)));
        (__sourceSpill1456_30)[__sourceSpill1456_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "¡â±äèQF\004o\000µU)"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1456_38 = local6_life21;
        int __sourceSpill1456_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1456_38)).substring(((int)(__sourceSpill1456_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1456_43 = local8_life19;
        int __sourceSpill1456_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1456_46 = new byte[8];
        (__sourceSpill1456_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1456_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1456_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1456_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1456_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1456_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1456_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1456_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1456_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1456_47)).doFinal(((byte[])(__sourceSpill1456_46)));
        (__sourceSpill1456_43)[__sourceSpill1456_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[16]));
}

private static native <E extends Throwable> void __sourceHandlerCall_734b966a723806a036cf(moom.pN a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_734b966a723806a036cf {

public static void f100130(moom.pN receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    int forestValue100130_104_0;
    int forestValue100130_146_0;
    int forestValue100130_158_0;
    int forestValue100130_182_0;
    int forestValue100130_187_0;
    int forestValue100130_197_0;
    int forestValue100130_202_0;
    int forestValue100130_220_0;
    int forestValue100130_224_0;
    int forestValue100130_244_0;
    int forestValue100130_260_0;
    int forestValue100130_265_0;
    int forestValue100130_312_0;
    int forestValue100130_344_0;
    int forestValue100130_353_0;
    net.minecraft.block.Block forestValue100130_391_0;
    net.minecraft.block.Block forestValue100130_396_0;
    int forestValue100130_406_0;
    int forestValue100130_469_0;
    int forestValue100130_483_0;
    int forestValue100130_514_0;
    int forestValue100130_552_0;
    int forestValue100130_619_0;
    int forestValue100130_623_0;
    net.minecraft.tileentity.TileEntity forestValue100130_699_0;
    int forestValue100130_711_0;
    net.minecraft.tileentity.TileEntity forestValue100130_758_0;
    java.lang.Object forestValue100130_773_0;
    net.minecraft.world.World forestValue100130_816_0;
    java.util.List forestValue100130_825_0;
    int forestValue100130_863_0;
    int forestValue100130_893_0;
    moom.cc spill100130_0;
    moom.G2 spill100130_1;
    moom.G2 spill100130_2;
    int spill100130_3;
    moom.b7 spill100130_4;
    moom.b7 spill100130_5;
    java.lang.String spill100130_6;
    java.lang.Object[] spill100130_7;
    java.lang.Object[] spill100130_8;
    int spill100130_9;
    boolean spill100130_10;
    boolean spill100130_11;
    moom.b7 spill100130_12;
    boolean spill100130_13;
    boolean spill100130_14;
    int spill100130_15;
    moom.cc spill100130_16;
    int spill100130_17;
    moom.DT spill100130_18;
    int spill100130_19;
    int spill100130_20;
    moom.DT spill100130_21;
    int spill100130_22;
    net.minecraft.block.Block spill100130_23;
    int spill100130_24;
    net.minecraft.nbt.NBTTagCompound spill100130_25;
    java.util.ArrayList spill100130_26;
    moom.qI spill100130_27;
    boolean spill100130_28;
    boolean spill100130_29;
    java.util.ArrayList spill100130_30;
    moom.qI spill100130_31;
    java.util.ArrayList spill100130_32;
    moom.qI spill100130_33;
    int spill100130_34;
    moom.b7 spill100130_35;
    moom.b7 spill100130_36;
    boolean spill100130_37;
    int spill100130_38;
    boolean spill100130_39;
    net.minecraft.nbt.NBTTagCompound spill100130_40;
    net.minecraft.tileentity.TileEntity spill100130_41;
    net.minecraft.nbt.NBTTagCompound spill100130_42;
    net.minecraft.tileentity.TileEntity spill100130_43;
    boolean spill100130_44;
    net.minecraft.world.World spill100130_45;
    java.lang.Object spill100130_46;
    net.minecraft.world.World spill100130_47;
    java.util.List spill100130_48;
    boolean spill100130_49;
    moom.b7 spill100130_50;
    net.minecraft.command.ICommandSender spill100130_51;
    moom.pN spill100130_52;
    java.lang.String spill100130_53;
    java.lang.Object[] spill100130_54;
    long life3_3;
    int life5_5;
    moom.DT life6_36;
    moom.DT life7_42;
    moom.DT life8_52;
    moom.G2 life9_58;
    moom.G2 life10_67;
    int life11_76;
    int life12_112;
    net.minecraft.block.Block life13_114;
    int life14_116;
    net.minecraft.world.World life15_256;
    int life16_278;
    java.util.ArrayList life17_387;
    java.util.ArrayList life18_389;
    java.util.ArrayList life19_391;
    java.util.LinkedList life20_393;
    moom.DT life21_412;
    int life22_415;
    int life23_428;
    int life24_441;
    moom.DT life25_454;
    moom.DT life26_458;
    net.minecraft.block.state.IBlockState life27_462;
    net.minecraft.tileentity.TileEntity life28_512;
    net.minecraft.nbt.NBTTagCompound life29_519;
    java.util.Iterator life22_606;
    moom.DT life23_615;
    net.minecraft.tileentity.TileEntity life24_619;
    java.util.Iterator life22_649;
    moom.DT life23_673;
    moom.DT life23_689;
    java.util.ArrayList life22_705;
    java.util.List life23_720;
    java.util.Iterator life24_723;
    moom.qI life25_732;
    net.minecraft.tileentity.TileEntity life26_737;
    int life11_768;
    java.util.Iterator life24_771;
    moom.qI life25_780;
    moom.qI life25_811;
    net.minecraft.tileentity.TileEntity life26_816;
    moom.qI life25_883;
    net.minecraft.tileentity.TileEntity life26_888;
    moom.qI life25_954;
    java.util.Iterator life24_979;
    moom.qI life25_989;
    java.util.List life24_1009;
    java.util.Iterator life25_1020;
    moom.Er life26_1029;
    moom.DT life27_1044;
    forest_join_894: {
    forest_join_893: {
    forest_join_892: {
    forest_join_871: {
    forest_join_863: {
    forest_join_862: {
    forest_join_825: {
    forest_join_816: {
    forest_join_815: {
    forest_join_794: {
    forest_join_793: {
    forest_join_773: {
    forest_join_711: {
    forest_join_647: {
    forest_join_623: {
    forest_join_622: {
    forest_join_570: {
    forest_join_552: {
    forest_join_535: {
    forest_join_528: {
    forest_join_521: {
    forest_join_517: {
    forest_join_483: {
    forest_join_482: {
    forest_join_313: {
    forest_join_312: {
    forest_join_278: {
    forest_join_265: {
    forest_join_260: {
    forest_join_251: {
    forest_join_244: {
    forest_join_224: {
    forest_join_220: {
    forest_join_202: {
    forest_join_197: {
    forest_join_187: {
    forest_join_182: {
    forest_join_180: {
    forest_join_158: {
    forest_join_156: {
    forest_join_146: {
    forest_join_143: {
    forest_join_104: {
    forest_join_103: {
    forest_join_27: {
    forest_join_23: {
    life3_3 = (__fieldRead100130_0() ^ 58506019876872L);
    life5_5 = __integerCategory100130_2(__call100130_1());
    if (!((life5_5 != 0))) {
        break forest_join_27;
    }
    if (!(((p1).length < __invokedynamic100130_3(16984, (201633183119495593L ^ life3_3))))) {
        break forest_join_23;
    }
    moom.cc __stackOp100130_5_0 = __sourceUninitializedNEW100130_4();
    spill100130_0 = __stackOp100130_5_0;
    __explicitNewInit100130_6(__stackOp100130_5_0, "commands.clone.usage", new java.lang.Object[0]);
    throw spill100130_0;
    }
    __call100130_8(p0, __fieldRead100130_7(), 0);
    }
    life6_36 = __call100130_9(p0, p1, 0, 0);
    life7_42 = __call100130_10(p0, p1, 3, 0);
    life8_52 = __call100130_12(p0, p1, __invokedynamic100130_11(7392, (937419120092778271L ^ life3_3)), 0);
    moom.G2 __stackOp100130_14_0 = __sourceUninitializedNEW100130_13();
    spill100130_1 = __stackOp100130_14_0;
    __explicitNewInit100130_15(__stackOp100130_14_0, life6_36, life7_42);
    life9_58 = spill100130_1;
    moom.G2 __stackOp100130_17_0 = __sourceUninitializedNEW100130_16();
    spill100130_2 = __stackOp100130_17_0;
    __explicitNewInit100130_20(__stackOp100130_17_0, life8_52, __call100130_19(life8_52, __call100130_18(life9_58)));
    life10_67 = spill100130_2;
    life11_76 = ((__call100130_21(life9_58) * __call100130_22(life9_58)) * __call100130_23(life9_58));
    spill100130_3 = life11_76;
    if (!((life5_5 != 0))) {
        forestValue100130_104_0 = spill100130_3;
        break forest_join_104;
    }
    if (!((spill100130_3 > __invokedynamic100130_24(9975, (7753785922674111748L ^ life3_3))))) {
        break forest_join_103;
    }
    moom.b7 __stackOp100130_26_0 = __sourceUninitializedNEW100130_25();
    spill100130_4 = __stackOp100130_26_0;
    spill100130_5 = __stackOp100130_26_0;
    spill100130_6 = "commands.clone.tooManyBlocks";
    java.lang.Object[] __stackOp100130_27_0 = new java.lang.Object[2];
    spill100130_7 = __stackOp100130_27_0;
    (__stackOp100130_27_0)[0] = __call100130_28(life11_76);
    java.lang.Object[] __stackOp100130_29_0 = spill100130_7;
    spill100130_8 = __stackOp100130_29_0;
    (__stackOp100130_29_0)[1] = __call100130_31(__invokedynamic100130_30(3337, (8373264491649244921L ^ life3_3)));
    __explicitNewInit100130_32(spill100130_5, spill100130_6, spill100130_8);
    throw spill100130_4;
    }
    forestValue100130_104_0 = 0;
    }
    life12_112 = forestValue100130_104_0;
    life13_114 = null;
    life14_116 = -1;
    spill100130_9 = (p1).length;
    if (!((life5_5 != 0))) {
        forestValue100130_146_0 = spill100130_9;
        break forest_join_146;
    }
    if (!((spill100130_9 >= __invokedynamic100130_33(23192, (1709230592223824224L ^ life3_3))))) {
        break forest_join_143;
    }
    spill100130_10 = __call100130_35((p1)[__invokedynamic100130_34(7426, (8422288270699826933L ^ life3_3))], "force");
    if (!((life5_5 != 0))) {
        forestValue100130_158_0 = __integerCategory100130_36(spill100130_10);
        break forest_join_158;
    }
    if (!((!spill100130_10))) {
        break forest_join_156;
    }
    spill100130_11 = __call100130_38((p1)[__invokedynamic100130_37(2163, (7455814808707308426L ^ life3_3))], "move");
    if (!((life5_5 != 0))) {
        forestValue100130_158_0 = __integerCategory100130_39(spill100130_11);
        break forest_join_158;
    }
    if (!((!spill100130_11))) {
        break forest_join_156;
    }
    }
    forestValue100130_146_0 = __integerCategory100130_41(__call100130_40(life9_58, life10_67));
    }
    if (!((life5_5 != 0))) {
        forestValue100130_158_0 = forestValue100130_146_0;
        break forest_join_158;
    }
    if (!((forestValue100130_146_0 != 0))) {
        break forest_join_156;
    }
    moom.b7 __stackOp100130_43_0 = __sourceUninitializedNEW100130_42();
    spill100130_12 = __stackOp100130_43_0;
    __explicitNewInit100130_44(__stackOp100130_43_0, "commands.clone.noOverlap", new java.lang.Object[0]);
    throw spill100130_12;
    }
    forestValue100130_158_0 = (p1).length;
    }
    if (!((life5_5 != 0))) {
        forestValue100130_182_0 = forestValue100130_158_0;
        break forest_join_182;
    }
    if (!((forestValue100130_158_0 >= __invokedynamic100130_45(14860, (5983382298157033975L ^ life3_3))))) {
        break forest_join_180;
    }
    spill100130_13 = __call100130_47((p1)[__invokedynamic100130_46(2163, (7455814808707308426L ^ life3_3))], "move");
    if (!((life5_5 != 0))) {
        forestValue100130_182_0 = __integerCategory100130_48(spill100130_13);
        break forest_join_182;
    }
    if (!(spill100130_13)) {
        break forest_join_180;
    }
    life12_112 = 1;
    }
    forestValue100130_182_0 = __fieldRead100130_49(life9_58);
    }
    if (!((life5_5 != 0))) {
        forestValue100130_187_0 = forestValue100130_182_0;
        break forest_join_187;
    }
    if (!((forestValue100130_182_0 >= 0))) {
        break forest_join_528;
    }
    forestValue100130_187_0 = __fieldRead100130_50(life9_58);
    }
    if (!((life5_5 != 0))) {
        forestValue100130_197_0 = forestValue100130_187_0;
        break forest_join_197;
    }
    if (!((forestValue100130_187_0 < __invokedynamic100130_51(27339, (7339718318890383670L ^ life3_3))))) {
        break forest_join_528;
    }
    forestValue100130_197_0 = __fieldRead100130_52(life10_67);
    }
    if (!((life5_5 != 0))) {
        forestValue100130_202_0 = forestValue100130_197_0;
        break forest_join_202;
    }
    if (!((forestValue100130_197_0 >= 0))) {
        break forest_join_528;
    }
    forestValue100130_202_0 = __fieldRead100130_53(life10_67);
    }
    if (!((forestValue100130_202_0 < __invokedynamic100130_54(19917, (9200520414193114679L ^ life3_3))))) {
        break forest_join_528;
    }
    life15_256 = __call100130_55(p0);
    spill100130_14 = __call100130_56(life15_256, life9_58);
    if (!((life5_5 != 0))) {
        forestValue100130_220_0 = __integerCategory100130_57(spill100130_14);
        break forest_join_220;
    }
    if (!(spill100130_14)) {
        break forest_join_521;
    }
    forestValue100130_220_0 = __integerCategory100130_59(__call100130_58(life15_256, life10_67));
    }
    if (!((life5_5 != 0))) {
        forestValue100130_224_0 = forestValue100130_220_0;
        break forest_join_224;
    }
    if (!((forestValue100130_220_0 != 0))) {
        break forest_join_521;
    }
    forestValue100130_224_0 = 0;
    }
    life16_278 = forestValue100130_224_0;
    spill100130_15 = (p1).length;
    if (!((life5_5 != 0))) {
        forestValue100130_244_0 = spill100130_15;
        break forest_join_244;
    }
    if (!((spill100130_15 >= __invokedynamic100130_60(2163, (7455814808707308426L ^ life3_3))))) {
        break forest_join_313;
    }
    forestValue100130_244_0 = __integerCategory100130_63(__call100130_62((p1)[__invokedynamic100130_61(8153, (1145650945292733479L ^ life3_3))], "masked"));
    }
    if (!((life5_5 != 0))) {
        forestValue100130_260_0 = forestValue100130_244_0;
        break forest_join_260;
    }
    if (!((forestValue100130_244_0 != 0))) {
        break forest_join_251;
    }
    life16_278 = 1;
    if (!((life5_5 == 0))) {
        break forest_join_313;
    }
    }
    forestValue100130_260_0 = __integerCategory100130_66(__call100130_65((p1)[__invokedynamic100130_64(8153, (1145650945292733479L ^ life3_3))], "filtered"));
    }
    if (!((life5_5 != 0))) {
        forestValue100130_265_0 = forestValue100130_260_0;
        break forest_join_265;
    }
    if (!((forestValue100130_260_0 != 0))) {
        break forest_join_313;
    }
    forestValue100130_265_0 = (p1).length;
    }
    if (!((forestValue100130_265_0 < __invokedynamic100130_67(18146, (6155230491845612830L ^ life3_3))))) {
        break forest_join_278;
    }
    moom.cc __stackOp100130_69_0 = __sourceUninitializedNEW100130_68();
    spill100130_16 = __stackOp100130_69_0;
    __explicitNewInit100130_70(__stackOp100130_69_0, "commands.clone.usage", new java.lang.Object[0]);
    throw spill100130_16;
    }
    life13_114 = __call100130_72(p0, (p1)[__invokedynamic100130_71(14860, (5983382298157033975L ^ life3_3))]);
    spill100130_17 = (p1).length;
    if (!((life5_5 != 0))) {
        forestValue100130_312_0 = spill100130_17;
        break forest_join_312;
    }
    if (!((spill100130_17 >= __invokedynamic100130_73(7233, (1386115330266533813L ^ life3_3))))) {
        break forest_join_313;
    }
    forestValue100130_312_0 = __call100130_76((p1)[__invokedynamic100130_74(32567, (4279086908188552389L ^ life3_3))], 0, __invokedynamic100130_75(12491, (6821695923338715966L ^ life3_3)));
    }
    life14_116 = forestValue100130_312_0;
    }
    life17_387 = __call100130_77();
    life18_389 = __call100130_78();
    life19_391 = __call100130_79();
    life20_393 = __call100130_80();
    moom.DT __stackOp100130_82_0 = __sourceUninitializedNEW100130_81();
    spill100130_18 = __stackOp100130_82_0;
    __explicitNewInit100130_89(__stackOp100130_82_0, (__fieldRead100130_83(life10_67) - __fieldRead100130_84(life9_58)), (__fieldRead100130_85(life10_67) - __fieldRead100130_86(life9_58)), (__fieldRead100130_87(life10_67) - __fieldRead100130_88(life9_58)));
    life21_412 = spill100130_18;
    life22_415 = __fieldRead100130_90(life9_58);
    forest_cycle_343: while (true) {
    forest_join_479: {
    forestValue100130_344_0 = life22_415;
    forest_cycle_344: while (true) {
    if (!((forestValue100130_344_0 <= __fieldRead100130_91(life9_58)))) {
        break forest_join_482;
    }
    spill100130_19 = __fieldRead100130_92(life9_58);
    if (!((life5_5 != 0))) {
        forestValue100130_483_0 = spill100130_19;
        break forest_join_483;
    }
    life23_428 = spill100130_19;
    forest_cycle_352: while (true) {
    forest_join_476: {
    forestValue100130_353_0 = life23_428;
    forest_cycle_353: while (true) {
    if (!((forestValue100130_353_0 <= __fieldRead100130_93(life9_58)))) {
        break forest_join_479;
    }
    spill100130_20 = __fieldRead100130_94(life9_58);
    if (!((life5_5 != 0))) {
        forestValue100130_344_0 = spill100130_20;
        continue forest_cycle_344;
    }
    life24_441 = spill100130_20;
    forest_cycle_361: while (true) {
    forest_join_473: {
    forest_join_469: {
    forest_join_461: {
    forest_join_435: {
    forest_join_408: {
    forest_join_406: {
    forest_join_396: {
    forest_join_391: {
    forest_join_390: {
    if (!((life24_441 <= __fieldRead100130_95(life9_58)))) {
        break forest_join_476;
    }
    moom.DT __stackOp100130_97_0 = __sourceUninitializedNEW100130_96();
    spill100130_21 = __stackOp100130_97_0;
    __explicitNewInit100130_98(__stackOp100130_97_0, life24_441, life23_428, life22_415);
    life25_454 = spill100130_21;
    life26_458 = __call100130_99(life25_454, life21_412);
    life27_462 = __call100130_100(life15_256, life25_454);
    spill100130_22 = life16_278;
    if (!((life5_5 != 0))) {
        forestValue100130_353_0 = spill100130_22;
        continue forest_cycle_353;
    }
    if (!((spill100130_22 != 0))) {
        break forest_join_390;
    }
    spill100130_23 = __call100130_101(life27_462);
    if (!((life5_5 != 0))) {
        forestValue100130_391_0 = spill100130_23;
        break forest_join_391;
    }
    if (!((spill100130_23 != __fieldRead100130_102()))) {
        break forest_join_473;
    }
    }
    forestValue100130_391_0 = life13_114;
    }
    if (!((life5_5 != 0))) {
        forestValue100130_396_0 = forestValue100130_391_0;
        break forest_join_396;
    }
    if (!((forestValue100130_391_0 != null))) {
        break forest_join_408;
    }
    forestValue100130_396_0 = __call100130_103(life27_462);
    }
    if (!((forestValue100130_396_0 == life13_114))) {
        break forest_join_473;
    }
    spill100130_24 = life14_116;
    if (!((life5_5 != 0))) {
        forestValue100130_406_0 = spill100130_24;
        break forest_join_406;
    }
    if (!((spill100130_24 >= 0))) {
        break forest_join_408;
    }
    forestValue100130_406_0 = __call100130_105(__call100130_104(life27_462), life27_462);
    }
    if (!((forestValue100130_406_0 == life14_116))) {
        break forest_join_473;
    }
    }
    life28_512 = __call100130_106(life15_256, life25_454);
    if (!((life28_512 != null))) {
        break forest_join_435;
    }
    net.minecraft.nbt.NBTTagCompound __stackOp100130_108_0 = __sourceUninitializedNEW100130_107();
    spill100130_25 = __stackOp100130_108_0;
    __explicitNewInit100130_109(__stackOp100130_108_0);
    life29_519 = spill100130_25;
    __call100130_110(life28_512, life29_519);
    spill100130_26 = life18_389;
    moom.qI __stackOp100130_112_0 = __sourceUninitializedNEW100130_111();
    spill100130_27 = __stackOp100130_112_0;
    __explicitNewInit100130_113(__stackOp100130_112_0, life26_458, life27_462, life29_519);
    __call100130_114(spill100130_26, spill100130_27);
    __call100130_115(life20_393, life25_454);
    if (!((life5_5 == 0))) {
        break forest_join_473;
    }
    }
    spill100130_28 = __call100130_117(__call100130_116(life27_462));
    if (!((life5_5 != 0))) {
        forestValue100130_469_0 = __integerCategory100130_118(spill100130_28);
        break forest_join_469;
    }
    if (!((!spill100130_28))) {
        break forest_join_461;
    }
    spill100130_29 = __call100130_120(__call100130_119(life27_462));
    if (!((life5_5 != 0))) {
        forestValue100130_469_0 = __integerCategory100130_121(spill100130_29);
        break forest_join_469;
    }
    if (!((!spill100130_29))) {
        break forest_join_461;
    }
    spill100130_30 = life19_391;
    moom.qI __stackOp100130_123_0 = __sourceUninitializedNEW100130_122();
    spill100130_31 = __stackOp100130_123_0;
    __explicitNewInit100130_124(__stackOp100130_123_0, life26_458, life27_462, null);
    __call100130_125(spill100130_30, spill100130_31);
    __call100130_126(life20_393, life25_454);
    if (!((life5_5 == 0))) {
        break forest_join_473;
    }
    }
    spill100130_32 = life17_387;
    moom.qI __stackOp100130_128_0 = __sourceUninitializedNEW100130_127();
    spill100130_33 = __stackOp100130_128_0;
    __explicitNewInit100130_129(__stackOp100130_128_0, life26_458, life27_462, null);
    forestValue100130_469_0 = __integerCategory100130_131(__call100130_130(spill100130_32, spill100130_33));
    }
    __discardScalar100130_132(forestValue100130_469_0);
    __call100130_133(life20_393, life25_454);
    }
    life24_441 += 1;
    if (!((life5_5 == 0))) {
        continue forest_cycle_361;
    }
    break forest_cycle_361;
    }
    break forest_cycle_353;
    }
    }
    life23_428 += 1;
    if (!((life5_5 == 0))) {
        continue forest_cycle_352;
    }
    break forest_cycle_352;
    }
    break forest_cycle_344;
    }
    }
    life22_415 += 1;
    if (!((life5_5 == 0))) {
        continue forest_cycle_343;
    }
    break forest_cycle_343;
    }
    }
    forestValue100130_483_0 = life12_112;
    }
    if (!((forestValue100130_483_0 != 0))) {
        break forest_join_570;
    }
    life22_606 = __call100130_134(life20_393);
    forest_cycle_487: while (true) {
    forest_join_514: {
    forest_join_508: {
    if (!(__call100130_135(life22_606))) {
        break forest_join_517;
    }
    life23_615 = __cast100130_137(__call100130_136(life22_606));
    life24_619 = __call100130_138(life15_256, life23_615);
    spill100130_34 = __instanceOf100130_139(life24_619);
    if (!((life5_5 != 0))) {
        forestValue100130_552_0 = spill100130_34;
        break forest_join_552;
    }
    if (!((life5_5 != 0))) {
        forestValue100130_514_0 = spill100130_34;
        break forest_join_514;
    }
    if (!((spill100130_34 != 0))) {
        break forest_join_508;
    }
    __call100130_141(__cast100130_140(life24_619));
    }
    forestValue100130_514_0 = __integerCategory100130_145(__call100130_144(life15_256, life23_615, __call100130_143(__fieldRead100130_142()), 2));
    }
    __discardScalar100130_146(forestValue100130_514_0);
    if (!((life5_5 == 0))) {
        continue forest_cycle_487;
    }
    break forest_cycle_487;
    }
    }
    life22_649 = __call100130_147(life20_393);
    break forest_join_535;
    }
    moom.b7 __stackOp100130_149_0 = __sourceUninitializedNEW100130_148();
    spill100130_35 = __stackOp100130_149_0;
    __explicitNewInit100130_150(__stackOp100130_149_0, "commands.clone.outOfWorld", new java.lang.Object[0]);
    throw spill100130_35;
    }
    moom.b7 __stackOp100130_152_0 = __sourceUninitializedNEW100130_151();
    spill100130_36 = __stackOp100130_152_0;
    __explicitNewInit100130_153(__stackOp100130_152_0, "commands.clone.outOfWorld", new java.lang.Object[0]);
    throw spill100130_36;
    }
    forest_cycle_535: while (true) {
    if (!(__call100130_154(life22_649))) {
        break forest_join_570;
    }
    life23_673 = __cast100130_156(__call100130_155(life22_649));
    __call100130_159(life15_256, life23_673, __call100130_158(__fieldRead100130_157()), 3);
    if (!((life5_5 == 0))) {
        continue forest_cycle_535;
    }
    break forest_cycle_535;
    }
    break forest_join_570;
    }
    forest_cycle_552: while (true) {
    forest_join_567: {
    if (!((forestValue100130_552_0 != 0))) {
        break forest_join_570;
    }
    life23_689 = __cast100130_161(__call100130_160(life22_606));
    __call100130_164(life15_256, life23_689, __call100130_163(__fieldRead100130_162()), 3);
    if (!((life5_5 == 0))) {
        break forest_join_567;
    }
    break forest_join_570;
    }
    spill100130_37 = __call100130_165(life22_606);
    forestValue100130_552_0 = __integerCategory100130_166(spill100130_37);
    continue forest_cycle_552;
    }
    }
    life22_705 = __call100130_167();
    __call100130_168(life22_705, life17_387);
    __call100130_169(life22_705, life18_389);
    __call100130_170(life22_705, life19_391);
    life23_720 = __call100130_171(life22_705);
    life24_723 = __call100130_172(life23_720);
    forest_cycle_590: while (true) {
    forest_join_619: {
    forest_join_612: {
    if (!(__call100130_173(life24_723))) {
        break forest_join_622;
    }
    life25_732 = __cast100130_175(__call100130_174(life24_723));
    life26_737 = __call100130_177(life15_256, __fieldRead100130_176(life25_732));
    spill100130_38 = __instanceOf100130_178(life26_737);
    if (!((life5_5 != 0))) {
        forestValue100130_623_0 = spill100130_38;
        break forest_join_623;
    }
    if (!((life5_5 != 0))) {
        forestValue100130_619_0 = spill100130_38;
        break forest_join_619;
    }
    if (!((spill100130_38 != 0))) {
        break forest_join_612;
    }
    __call100130_180(__cast100130_179(life26_737));
    }
    forestValue100130_619_0 = __integerCategory100130_185(__call100130_184(life15_256, __fieldRead100130_181(life25_732), __call100130_183(__fieldRead100130_182()), 2));
    }
    __discardScalar100130_186(forestValue100130_619_0);
    if (!((life5_5 == 0))) {
        continue forest_cycle_590;
    }
    break forest_cycle_590;
    }
    }
    forestValue100130_623_0 = 0;
    }
    life11_768 = forestValue100130_623_0;
    life24_771 = __call100130_187(life22_705);
    forest_cycle_627: while (true) {
    forest_join_645: {
    if (!(__call100130_188(life24_771))) {
        break forest_join_647;
    }
    life25_780 = __cast100130_190(__call100130_189(life24_771));
    spill100130_39 = __call100130_193(life15_256, __fieldRead100130_191(life25_780), __fieldRead100130_192(life25_780), 2);
    if (!((life5_5 != 0))) {
        forestValue100130_711_0 = __integerCategory100130_194(spill100130_39);
        break forest_join_711;
    }
    if (!(spill100130_39)) {
        break forest_join_645;
    }
    life11_768 += 1;
    }
    if (!((life5_5 == 0))) {
        continue forest_cycle_627;
    }
    break forest_cycle_627;
    }
    }
    life24_771 = __call100130_195(life18_389);
    forest_cycle_650: while (true) {
    forest_join_708: {
    forest_join_700: {
    forest_join_699: {
    if (!(__call100130_196(life24_771))) {
        break forest_join_794;
    }
    life25_811 = __cast100130_198(__call100130_197(life24_771));
    life26_816 = __call100130_200(life15_256, __fieldRead100130_199(life25_811));
    if (!((life5_5 != 0))) {
        break forest_join_708;
    }
    spill100130_40 = __fieldRead100130_201(life25_811);
    if (!((life5_5 != 0))) {
        forestValue100130_773_0 = spill100130_40;
        break forest_join_773;
    }
    if (!((spill100130_40 != null))) {
        break forest_join_700;
    }
    spill100130_41 = life26_816;
    if (!((life5_5 != 0))) {
        forestValue100130_699_0 = spill100130_41;
        break forest_join_699;
    }
    if (!((spill100130_41 != null))) {
        break forest_join_700;
    }
    __call100130_205(__fieldRead100130_202(life25_811), "x", __call100130_204(__fieldRead100130_203(life25_811)));
    __call100130_209(__fieldRead100130_206(life25_811), "y", __call100130_208(__fieldRead100130_207(life25_811)));
    __call100130_213(__fieldRead100130_210(life25_811), "z", __call100130_212(__fieldRead100130_211(life25_811)));
    __call100130_215(life26_816, __fieldRead100130_214(life25_811));
    forestValue100130_699_0 = life26_816;
    }
    __call100130_216(forestValue100130_699_0);
    }
    __call100130_219(life15_256, __fieldRead100130_217(life25_811), __fieldRead100130_218(life25_811), 2);
    }
    if (!((life5_5 == 0))) {
        continue forest_cycle_650;
    }
    break forest_cycle_650;
    }
    break forest_join_794;
    }
    forest_cycle_711: while (true) {
    forest_join_770: {
    forest_join_767: {
    forest_join_759: {
    forest_join_758: {
    if (!((forestValue100130_711_0 != 0))) {
        break forest_join_794;
    }
    life25_883 = __cast100130_221(__call100130_220(life24_771));
    life26_888 = __call100130_223(life15_256, __fieldRead100130_222(life25_883));
    if (!((life5_5 != 0))) {
        break forest_join_767;
    }
    spill100130_42 = __fieldRead100130_224(life25_883);
    if (!((life5_5 != 0))) {
        forestValue100130_773_0 = spill100130_42;
        break forest_join_773;
    }
    if (!((spill100130_42 != null))) {
        break forest_join_759;
    }
    spill100130_43 = life26_888;
    if (!((life5_5 != 0))) {
        forestValue100130_758_0 = spill100130_43;
        break forest_join_758;
    }
    if (!((spill100130_43 != null))) {
        break forest_join_759;
    }
    __call100130_228(__fieldRead100130_225(life25_883), "x", __call100130_227(__fieldRead100130_226(life25_883)));
    __call100130_232(__fieldRead100130_229(life25_883), "y", __call100130_231(__fieldRead100130_230(life25_883)));
    __call100130_236(__fieldRead100130_233(life25_883), "z", __call100130_235(__fieldRead100130_234(life25_883)));
    __call100130_238(life26_888, __fieldRead100130_237(life25_883));
    forestValue100130_758_0 = life26_888;
    }
    __call100130_239(forestValue100130_758_0);
    }
    __call100130_242(life15_256, __fieldRead100130_240(life25_883), __fieldRead100130_241(life25_883), 2);
    }
    if (!((life5_5 == 0))) {
        break forest_join_770;
    }
    break forest_join_794;
    }
    spill100130_44 = __call100130_243(life24_771);
    forestValue100130_711_0 = __integerCategory100130_244(spill100130_44);
    continue forest_cycle_711;
    }
    }
    forest_cycle_773: while (true) {
    forest_join_787: {
    life25_954 = __cast100130_245(forestValue100130_773_0);
    spill100130_45 = life15_256;
    if (!((life5_5 != 0))) {
        forestValue100130_816_0 = spill100130_45;
        break forest_join_816;
    }
    __call100130_249(spill100130_45, __fieldRead100130_246(life25_954), __call100130_248(__fieldRead100130_247(life25_954)));
    if (!((life5_5 == 0))) {
        break forest_join_787;
    }
    break forest_join_793;
    }
    if (!(__call100130_250(life24_771))) {
        break forest_join_815;
    }
    spill100130_46 = __call100130_251(life24_771);
    forestValue100130_773_0 = spill100130_46;
    continue forest_cycle_773;
    }
    }
    break forest_join_815;
    }
    life24_979 = __call100130_252(life23_720);
    forest_cycle_797: while (true) {
    if (!(__call100130_253(life24_979))) {
        break forest_join_815;
    }
    life25_989 = __cast100130_255(__call100130_254(life24_979));
    spill100130_47 = life15_256;
    if (!((life5_5 != 0))) {
        forestValue100130_816_0 = spill100130_47;
        break forest_join_816;
    }
    __call100130_259(spill100130_47, __fieldRead100130_256(life25_989), __call100130_258(__fieldRead100130_257(life25_989)));
    if (!((life5_5 == 0))) {
        continue forest_cycle_797;
    }
    break forest_cycle_797;
    }
    }
    forestValue100130_816_0 = life15_256;
    }
    life24_1009 = __call100130_260(forestValue100130_816_0, life9_58, 0);
    spill100130_48 = life24_1009;
    if (!((life5_5 != 0))) {
        forestValue100130_825_0 = spill100130_48;
        break forest_join_825;
    }
    if (!((spill100130_48 != null))) {
        break forest_join_862;
    }
    forestValue100130_825_0 = life24_1009;
    }
    life25_1020 = __call100130_261(forestValue100130_825_0);
    forest_cycle_827: while (true) {
    forest_join_860: {
    if (!(__call100130_262(life25_1020))) {
        break forest_join_862;
    }
    life26_1029 = __cast100130_264(__call100130_263(life25_1020));
    spill100130_49 = __call100130_266(life9_58, __fieldRead100130_265(life26_1029));
    if (!((life5_5 != 0))) {
        forestValue100130_863_0 = __integerCategory100130_267(spill100130_49);
        break forest_join_863;
    }
    if (!(spill100130_49)) {
        break forest_join_860;
    }
    life27_1044 = __call100130_269(__fieldRead100130_268(life26_1029), life21_412);
    __call100130_275(life15_256, life27_1044, __call100130_270(life26_1029), ((int) (__fieldRead100130_271(life26_1029) - __call100130_273(__call100130_272(life15_256)))), __fieldRead100130_274(life26_1029));
    }
    if (!((life5_5 == 0))) {
        continue forest_cycle_827;
    }
    break forest_cycle_827;
    }
    }
    forestValue100130_863_0 = life11_768;
    }
    if (!((forestValue100130_863_0 <= 0))) {
        break forest_join_871;
    }
    moom.b7 __stackOp100130_277_0 = __sourceUninitializedNEW100130_276();
    spill100130_50 = __stackOp100130_277_0;
    __explicitNewInit100130_278(__stackOp100130_277_0, "commands.clone.failed", new java.lang.Object[0]);
    throw spill100130_50;
    }
    __call100130_280(p0, __fieldRead100130_279(), life11_768);
    spill100130_51 = p0;
    spill100130_52 = receiver;
    spill100130_53 = "commands.clone.success";
    java.lang.Object[] __stackOp100130_281_0 = new java.lang.Object[1];
    spill100130_54 = __stackOp100130_281_0;
    (__stackOp100130_281_0)[0] = __call100130_282(life11_768);
    __call100130_283(spill100130_51, spill100130_52, spill100130_53, spill100130_54);
    if (!((__call100130_284() != null))) {
        break forest_join_894;
    }
    if (!((life5_5 != 0))) {
        break forest_join_892;
    }
    forestValue100130_893_0 = 0;
    break forest_join_893;
    }
    forestValue100130_893_0 = 1;
    }
    __call100130_285(forestValue100130_893_0);
    }
    return;
}
public static void h100130_0(moom.b7 p0) throws Throwable {
    throw __call13013000_0(p0);
}
public static void h100130_1(moom.b7 p0) throws Throwable {
    throw __call13013001_0(p0);
}
public static void h100130_2(moom.b7 p0) throws Throwable {
    throw __call13013002_0(p0);
}
public static void h100130_3(moom.b7 p0) throws Throwable {
    throw __call13013003_0(p0);
}
public static void h100130_4(moom.b7 p0) throws Throwable {
    throw __call13013004_0(p0);
}
public static void h100130_5(moom.b7 p0) throws Throwable {
    throw __call13013005_0(p0);
}
public static void h100130_6(moom.b7 p0) throws Throwable {
    throw __call13013006_0(p0);
}
public static void h100130_7(moom.b7 p0) throws Throwable {
    throw __call13013007_0(p0);
}
public static void h100130_8(moom.b7 p0) throws Throwable {
    throw __call13013008_0(p0);
}
public static void h100130_9(moom.b7 p0) throws Throwable {
    throw __call13013009_0(p0);
}
public static void h100130_10(moom.b7 p0) throws Throwable {
    throw __call13013010_0(p0);
}
public static void h100130_11(moom.b7 p0) throws Throwable {
    throw __call13013011_0(p0);
}
public static void h100130_12(moom.b7 p0) throws Throwable {
    throw __call13013012_0(p0);
}
public static void h100130_13(moom.b7 p0) throws Throwable {
    throw __call13013013_0(p0);
}
public static void h100130_14(moom.b7 p0) throws Throwable {
    throw __call13013014_0(p0);
}
public static void h100130_15(moom.b7 p0) throws Throwable {
    throw __call13013015_0(p0);
}
public static void h100130_16(moom.b7 p0) throws Throwable {
    throw __call13013016_0(p0);
}
public static void h100130_17(moom.b7 p0) throws Throwable {
    throw __call13013017_0(p0);
}
public static void h100130_18(moom.b7 p0) throws Throwable {
    throw __call13013018_0(p0);
}
public static void h100130_19(moom.b7 p0) throws Throwable {
    throw __call13013019_0(p0);
}
public static void h100130_20(moom.b7 p0) throws Throwable {
    throw __call13013020_0(p0);
}
public static void h100130_21(moom.b7 p0) throws Throwable {
    throw __call13013021_0(p0);
}
public static void h100130_22(moom.b7 p0) throws Throwable {
    throw __call13013022_0(p0);
}
public static void h100130_23(moom.b7 p0) throws Throwable {
    throw __call13013023_0(p0);
}
public static void h100130_24(moom.b7 p0) throws Throwable {
    throw __call13013024_0(p0);
}
public static void h100130_25(moom.b7 p0) throws Throwable {
    throw __call13013025_0(p0);
}
public static void h100130_26(moom.b7 p0) throws Throwable {
    throw __call13013026_0(p0);
}
public static void h100130_27(moom.b7 p0) throws Throwable {
    throw __call13013027_0(p0);
}
public static void h100130_28(moom.b7 p0) throws Throwable {
    throw __call13013028_0(p0);
}
public static void h100130_29(moom.b7 p0) throws Throwable {
    throw __call13013029_0(p0);
}
public static void h100130_30(moom.b7 p0) throws Throwable {
    throw __call13013030_0(p0);
}
public static void h100130_31(moom.b7 p0) throws Throwable {
    throw __call13013031_0(p0);
}
public static void h100130_32(moom.b7 p0) throws Throwable {
    throw __call13013032_0(p0);
}
public static void h100130_33(moom.b7 p0) throws Throwable {
    throw __call13013033_0(p0);
}
public static void h100130_34(moom.b7 p0) throws Throwable {
    throw __call13013034_0(p0);
}
public static void h100130_35(moom.b7 p0) throws Throwable {
    throw __call13013035_0(p0);
}
public static void h100130_36(moom.b7 p0) throws Throwable {
    throw __call13013036_0(p0);
}
public static void h100130_37(moom.b7 p0) throws Throwable {
    throw __call13013037_0(p0);
}
public static void h100130_38(moom.b7 p0) throws Throwable {
    throw __call13013038_0(p0);
}
public static void h100130_39(moom.b7 p0) throws Throwable {
    throw __call13013039_0(p0);
}
public static void h100130_40(moom.b7 p0) throws Throwable {
    throw __call13013040_0(p0);
}
public static void h100130_41(moom.b7 p0) throws Throwable {
    throw __call13013041_0(p0);
}
public static void h100130_42(moom.b7 p0) throws Throwable {
    throw __call13013042_0(p0);
}
public static void h100130_43(moom.b7 p0) throws Throwable {
    throw __call13013043_0(p0);
}
public static void h100130_44(moom.b7 p0) throws Throwable {
    throw __call13013044_0(p0);
}
public static void h100130_45(moom.b7 p0) throws Throwable {
    throw __call13013045_0(p0);
}
public static void h100130_46(moom.b7 p0) throws Throwable {
    throw __call13013046_0(p0);
}
public static void h100130_47(moom.b7 p0) throws Throwable {
    throw __call13013047_0(p0);
}
public static void h100130_48(moom.b7 p0) throws Throwable {
    throw __call13013048_0(p0);
}
public static void h100130_49(moom.b7 p0) throws Throwable {
    throw __call13013049_0(p0);
}
public static void h100130_50(moom.b7 p0) throws Throwable {
    throw __call13013050_0(p0);
}
public static void h100130_51(moom.b7 p0) throws Throwable {
    throw __call13013051_0(p0);
}
public static void h100130_52(moom.b7 p0) throws Throwable {
    throw __call13013052_0(p0);
}
public static void h100130_53(moom.b7 p0) throws Throwable {
    throw __call13013053_0(p0);
}
public static void h100130_54(moom.b7 p0) throws Throwable {
    throw __call13013054_0(p0);
}
public static void h100130_55(moom.b7 p0) throws Throwable {
    throw __call13013055_0(p0);
}
public static void h100130_56(moom.b7 p0) throws Throwable {
    throw __call13013056_0(p0);
}
public static void h100130_57(moom.b7 p0) throws Throwable {
    throw __call13013057_0(p0);
}
public static void h100130_58(moom.b7 p0) throws Throwable {
    throw __call13013058_0(p0);
}
public static void h100130_59(moom.b7 p0) throws Throwable {
    throw __call13013059_0(p0);
}
public static void h100130_60(moom.b7 p0) throws Throwable {
    throw __call13013060_0(p0);
}
public static void h100130_61(moom.b7 p0) throws Throwable {
    throw __call13013061_0(p0);
}
public static void h100130_62(moom.b7 p0) throws Throwable {
    throw __call13013062_0(p0);
}
public static void h100130_63(moom.b7 p0) throws Throwable {
    throw __call13013063_0(p0);
}
public static void h100130_64(moom.b7 p0) throws Throwable {
    throw __call13013064_0(p0);
}
private static native long __fieldRead100130_0() throws Throwable;
private static native boolean __call100130_1() throws Throwable;
private static native int __integerCategory100130_2(boolean value) throws Throwable;
private static native int __invokedynamic100130_3(int a0, long a1) throws Throwable;
private static native moom.cc __sourceUninitializedNEW100130_4() throws Throwable;
private static native void __explicitNewInit100130_6(moom.cc a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead100130_7() throws Throwable;
private static native void __call100130_8(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native moom.DT __call100130_9(net.minecraft.command.ICommandSender a0, java.lang.String[] a1, int a2, int a3) throws Throwable;
private static native moom.DT __call100130_10(net.minecraft.command.ICommandSender a0, java.lang.String[] a1, int a2, int a3) throws Throwable;
private static native int __invokedynamic100130_11(int a0, long a1) throws Throwable;
private static native moom.DT __call100130_12(net.minecraft.command.ICommandSender a0, java.lang.String[] a1, int a2, int a3) throws Throwable;
private static native moom.G2 __sourceUninitializedNEW100130_13() throws Throwable;
private static native void __explicitNewInit100130_15(moom.G2 a0, moom.DS a1, moom.DS a2) throws Throwable;
private static native moom.G2 __sourceUninitializedNEW100130_16() throws Throwable;
private static native moom.DS __call100130_18(moom.G2 a0) throws Throwable;
private static native moom.DT __call100130_19(moom.DT a0, moom.DS a1) throws Throwable;
private static native void __explicitNewInit100130_20(moom.G2 a0, moom.DS a1, moom.DS a2) throws Throwable;
private static native int __call100130_21(moom.G2 a0) throws Throwable;
private static native int __call100130_22(moom.G2 a0) throws Throwable;
private static native int __call100130_23(moom.G2 a0) throws Throwable;
private static native int __invokedynamic100130_24(int a0, long a1) throws Throwable;
private static native moom.b7 __sourceUninitializedNEW100130_25() throws Throwable;
private static native java.lang.Integer __call100130_28(int a0) throws Throwable;
private static native int __invokedynamic100130_30(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call100130_31(int a0) throws Throwable;
private static native void __explicitNewInit100130_32(moom.b7 a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native int __invokedynamic100130_33(int a0, long a1) throws Throwable;
private static native int __invokedynamic100130_34(int a0, long a1) throws Throwable;
private static native boolean __call100130_35(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100130_36(boolean value) throws Throwable;
private static native int __invokedynamic100130_37(int a0, long a1) throws Throwable;
private static native boolean __call100130_38(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100130_39(boolean value) throws Throwable;
private static native boolean __call100130_40(moom.G2 a0, moom.G2 a1) throws Throwable;
private static native int __integerCategory100130_41(boolean value) throws Throwable;
private static native moom.b7 __sourceUninitializedNEW100130_42() throws Throwable;
private static native void __explicitNewInit100130_44(moom.b7 a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native int __invokedynamic100130_45(int a0, long a1) throws Throwable;
private static native int __invokedynamic100130_46(int a0, long a1) throws Throwable;
private static native boolean __call100130_47(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100130_48(boolean value) throws Throwable;
private static native int __fieldRead100130_49(moom.G2 a0) throws Throwable;
private static native int __fieldRead100130_50(moom.G2 a0) throws Throwable;
private static native int __invokedynamic100130_51(int a0, long a1) throws Throwable;
private static native int __fieldRead100130_52(moom.G2 a0) throws Throwable;
private static native int __fieldRead100130_53(moom.G2 a0) throws Throwable;
private static native int __invokedynamic100130_54(int a0, long a1) throws Throwable;
private static native net.minecraft.world.World __call100130_55(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native boolean __call100130_56(net.minecraft.world.World a0, moom.G2 a1) throws Throwable;
private static native int __integerCategory100130_57(boolean value) throws Throwable;
private static native boolean __call100130_58(net.minecraft.world.World a0, moom.G2 a1) throws Throwable;
private static native int __integerCategory100130_59(boolean value) throws Throwable;
private static native int __invokedynamic100130_60(int a0, long a1) throws Throwable;
private static native int __invokedynamic100130_61(int a0, long a1) throws Throwable;
private static native boolean __call100130_62(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100130_63(boolean value) throws Throwable;
private static native int __invokedynamic100130_64(int a0, long a1) throws Throwable;
private static native boolean __call100130_65(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100130_66(boolean value) throws Throwable;
private static native int __invokedynamic100130_67(int a0, long a1) throws Throwable;
private static native moom.cc __sourceUninitializedNEW100130_68() throws Throwable;
private static native void __explicitNewInit100130_70(moom.cc a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native int __invokedynamic100130_71(int a0, long a1) throws Throwable;
private static native net.minecraft.block.Block __call100130_72(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic100130_73(int a0, long a1) throws Throwable;
private static native int __invokedynamic100130_74(int a0, long a1) throws Throwable;
private static native int __invokedynamic100130_75(int a0, long a1) throws Throwable;
private static native int __call100130_76(java.lang.String a0, int a1, int a2) throws Throwable;
private static native java.util.ArrayList __call100130_77() throws Throwable;
private static native java.util.ArrayList __call100130_78() throws Throwable;
private static native java.util.ArrayList __call100130_79() throws Throwable;
private static native java.util.LinkedList __call100130_80() throws Throwable;
private static native moom.DT __sourceUninitializedNEW100130_81() throws Throwable;
private static native int __fieldRead100130_83(moom.G2 a0) throws Throwable;
private static native int __fieldRead100130_84(moom.G2 a0) throws Throwable;
private static native int __fieldRead100130_85(moom.G2 a0) throws Throwable;
private static native int __fieldRead100130_86(moom.G2 a0) throws Throwable;
private static native int __fieldRead100130_87(moom.G2 a0) throws Throwable;
private static native int __fieldRead100130_88(moom.G2 a0) throws Throwable;
private static native void __explicitNewInit100130_89(moom.DT a0, int a1, int a2, int a3) throws Throwable;
private static native int __fieldRead100130_90(moom.G2 a0) throws Throwable;
private static native int __fieldRead100130_91(moom.G2 a0) throws Throwable;
private static native int __fieldRead100130_92(moom.G2 a0) throws Throwable;
private static native int __fieldRead100130_93(moom.G2 a0) throws Throwable;
private static native int __fieldRead100130_94(moom.G2 a0) throws Throwable;
private static native int __fieldRead100130_95(moom.G2 a0) throws Throwable;
private static native moom.DT __sourceUninitializedNEW100130_96() throws Throwable;
private static native void __explicitNewInit100130_98(moom.DT a0, int a1, int a2, int a3) throws Throwable;
private static native moom.DT __call100130_99(moom.DT a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call100130_100(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call100130_101(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead100130_102() throws Throwable;
private static native net.minecraft.block.Block __call100130_103(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.block.Block __call100130_104(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __call100130_105(net.minecraft.block.Block a0, net.minecraft.block.state.IBlockState a1) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call100130_106(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __sourceUninitializedNEW100130_107() throws Throwable;
private static native void __explicitNewInit100130_109(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native void __call100130_110(net.minecraft.tileentity.TileEntity a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native moom.qI __sourceUninitializedNEW100130_111() throws Throwable;
private static native void __explicitNewInit100130_113(moom.qI a0, moom.DT a1, net.minecraft.block.state.IBlockState a2, net.minecraft.nbt.NBTTagCompound a3) throws Throwable;
private static native boolean __call100130_114(java.util.ArrayList a0, moom.qI a1) throws Throwable;
private static native void __call100130_115(java.util.LinkedList a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call100130_116(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native boolean __call100130_117(net.minecraft.block.Block a0) throws Throwable;
private static native int __integerCategory100130_118(boolean value) throws Throwable;
private static native net.minecraft.block.Block __call100130_119(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native boolean __call100130_120(net.minecraft.block.Block a0) throws Throwable;
private static native int __integerCategory100130_121(boolean value) throws Throwable;
private static native moom.qI __sourceUninitializedNEW100130_122() throws Throwable;
private static native void __explicitNewInit100130_124(moom.qI a0, moom.DT a1, net.minecraft.block.state.IBlockState a2, net.minecraft.nbt.NBTTagCompound a3) throws Throwable;
private static native boolean __call100130_125(java.util.ArrayList a0, moom.qI a1) throws Throwable;
private static native void __call100130_126(java.util.LinkedList a0, moom.DT a1) throws Throwable;
private static native moom.qI __sourceUninitializedNEW100130_127() throws Throwable;
private static native void __explicitNewInit100130_129(moom.qI a0, moom.DT a1, net.minecraft.block.state.IBlockState a2, net.minecraft.nbt.NBTTagCompound a3) throws Throwable;
private static native boolean __call100130_130(java.util.ArrayList a0, moom.qI a1) throws Throwable;
private static native int __integerCategory100130_131(boolean value) throws Throwable;
private static native void __discardScalar100130_132(int a0) throws Throwable;
private static native void __call100130_133(java.util.LinkedList a0, moom.DT a1) throws Throwable;
private static native java.util.Iterator __call100130_134(java.util.LinkedList a0) throws Throwable;
private static native boolean __call100130_135(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100130_136(java.util.Iterator a0) throws Throwable;
private static native moom.DT __cast100130_137(java.lang.Object a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call100130_138(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __instanceOf100130_139(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.inventory.IInventory __cast100130_140(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native void __call100130_141(net.minecraft.inventory.IInventory a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead100130_142() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call100130_143(net.minecraft.block.Block a0) throws Throwable;
private static native boolean __call100130_144(net.minecraft.world.World a0, moom.DT a1, net.minecraft.block.state.IBlockState a2, int a3) throws Throwable;
private static native int __integerCategory100130_145(boolean value) throws Throwable;
private static native void __discardScalar100130_146(int a0) throws Throwable;
private static native java.util.Iterator __call100130_147(java.util.LinkedList a0) throws Throwable;
private static native moom.b7 __sourceUninitializedNEW100130_148() throws Throwable;
private static native void __explicitNewInit100130_150(moom.b7 a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native moom.b7 __sourceUninitializedNEW100130_151() throws Throwable;
private static native void __explicitNewInit100130_153(moom.b7 a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native boolean __call100130_154(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100130_155(java.util.Iterator a0) throws Throwable;
private static native moom.DT __cast100130_156(java.lang.Object a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead100130_157() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call100130_158(net.minecraft.block.Block a0) throws Throwable;
private static native boolean __call100130_159(net.minecraft.world.World a0, moom.DT a1, net.minecraft.block.state.IBlockState a2, int a3) throws Throwable;
private static native java.lang.Object __call100130_160(java.util.Iterator a0) throws Throwable;
private static native moom.DT __cast100130_161(java.lang.Object a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead100130_162() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call100130_163(net.minecraft.block.Block a0) throws Throwable;
private static native boolean __call100130_164(net.minecraft.world.World a0, moom.DT a1, net.minecraft.block.state.IBlockState a2, int a3) throws Throwable;
private static native boolean __call100130_165(java.util.Iterator a0) throws Throwable;
private static native int __integerCategory100130_166(boolean value) throws Throwable;
private static native java.util.ArrayList __call100130_167() throws Throwable;
private static native boolean __call100130_168(java.util.ArrayList a0, java.util.ArrayList a1) throws Throwable;
private static native boolean __call100130_169(java.util.ArrayList a0, java.util.ArrayList a1) throws Throwable;
private static native boolean __call100130_170(java.util.ArrayList a0, java.util.ArrayList a1) throws Throwable;
private static native java.util.List __call100130_171(java.util.ArrayList a0) throws Throwable;
private static native java.util.Iterator __call100130_172(java.util.List a0) throws Throwable;
private static native boolean __call100130_173(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100130_174(java.util.Iterator a0) throws Throwable;
private static native moom.qI __cast100130_175(java.lang.Object a0) throws Throwable;
private static native moom.DT __fieldRead100130_176(moom.qI a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call100130_177(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __instanceOf100130_178(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.inventory.IInventory __cast100130_179(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native void __call100130_180(net.minecraft.inventory.IInventory a0) throws Throwable;
private static native moom.DT __fieldRead100130_181(moom.qI a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead100130_182() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call100130_183(net.minecraft.block.Block a0) throws Throwable;
private static native boolean __call100130_184(net.minecraft.world.World a0, moom.DT a1, net.minecraft.block.state.IBlockState a2, int a3) throws Throwable;
private static native int __integerCategory100130_185(boolean value) throws Throwable;
private static native void __discardScalar100130_186(int a0) throws Throwable;
private static native java.util.Iterator __call100130_187(java.util.ArrayList a0) throws Throwable;
private static native boolean __call100130_188(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100130_189(java.util.Iterator a0) throws Throwable;
private static native moom.qI __cast100130_190(java.lang.Object a0) throws Throwable;
private static native moom.DT __fieldRead100130_191(moom.qI a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead100130_192(moom.qI a0) throws Throwable;
private static native boolean __call100130_193(net.minecraft.world.World a0, moom.DT a1, net.minecraft.block.state.IBlockState a2, int a3) throws Throwable;
private static native int __integerCategory100130_194(boolean value) throws Throwable;
private static native java.util.Iterator __call100130_195(java.util.ArrayList a0) throws Throwable;
private static native boolean __call100130_196(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100130_197(java.util.Iterator a0) throws Throwable;
private static native moom.qI __cast100130_198(java.lang.Object a0) throws Throwable;
private static native moom.DT __fieldRead100130_199(moom.qI a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call100130_200(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __fieldRead100130_201(moom.qI a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __fieldRead100130_202(moom.qI a0) throws Throwable;
private static native moom.DT __fieldRead100130_203(moom.qI a0) throws Throwable;
private static native int __call100130_204(moom.DT a0) throws Throwable;
private static native void __call100130_205(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __fieldRead100130_206(moom.qI a0) throws Throwable;
private static native moom.DT __fieldRead100130_207(moom.qI a0) throws Throwable;
private static native int __call100130_208(moom.DT a0) throws Throwable;
private static native void __call100130_209(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __fieldRead100130_210(moom.qI a0) throws Throwable;
private static native moom.DT __fieldRead100130_211(moom.qI a0) throws Throwable;
private static native int __call100130_212(moom.DT a0) throws Throwable;
private static native void __call100130_213(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __fieldRead100130_214(moom.qI a0) throws Throwable;
private static native void __call100130_215(net.minecraft.tileentity.TileEntity a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native void __call100130_216(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.DT __fieldRead100130_217(moom.qI a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead100130_218(moom.qI a0) throws Throwable;
private static native boolean __call100130_219(net.minecraft.world.World a0, moom.DT a1, net.minecraft.block.state.IBlockState a2, int a3) throws Throwable;
private static native java.lang.Object __call100130_220(java.util.Iterator a0) throws Throwable;
private static native moom.qI __cast100130_221(java.lang.Object a0) throws Throwable;
private static native moom.DT __fieldRead100130_222(moom.qI a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call100130_223(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __fieldRead100130_224(moom.qI a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __fieldRead100130_225(moom.qI a0) throws Throwable;
private static native moom.DT __fieldRead100130_226(moom.qI a0) throws Throwable;
private static native int __call100130_227(moom.DT a0) throws Throwable;
private static native void __call100130_228(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __fieldRead100130_229(moom.qI a0) throws Throwable;
private static native moom.DT __fieldRead100130_230(moom.qI a0) throws Throwable;
private static native int __call100130_231(moom.DT a0) throws Throwable;
private static native void __call100130_232(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __fieldRead100130_233(moom.qI a0) throws Throwable;
private static native moom.DT __fieldRead100130_234(moom.qI a0) throws Throwable;
private static native int __call100130_235(moom.DT a0) throws Throwable;
private static native void __call100130_236(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __fieldRead100130_237(moom.qI a0) throws Throwable;
private static native void __call100130_238(net.minecraft.tileentity.TileEntity a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native void __call100130_239(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.DT __fieldRead100130_240(moom.qI a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead100130_241(moom.qI a0) throws Throwable;
private static native boolean __call100130_242(net.minecraft.world.World a0, moom.DT a1, net.minecraft.block.state.IBlockState a2, int a3) throws Throwable;
private static native boolean __call100130_243(java.util.Iterator a0) throws Throwable;
private static native int __integerCategory100130_244(boolean value) throws Throwable;
private static native moom.qI __cast100130_245(java.lang.Object a0) throws Throwable;
private static native moom.DT __fieldRead100130_246(moom.qI a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead100130_247(moom.qI a0) throws Throwable;
private static native net.minecraft.block.Block __call100130_248(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native void __call100130_249(net.minecraft.world.World a0, moom.DT a1, net.minecraft.block.Block a2) throws Throwable;
private static native boolean __call100130_250(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100130_251(java.util.Iterator a0) throws Throwable;
private static native java.util.Iterator __call100130_252(java.util.List a0) throws Throwable;
private static native boolean __call100130_253(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100130_254(java.util.Iterator a0) throws Throwable;
private static native moom.qI __cast100130_255(java.lang.Object a0) throws Throwable;
private static native moom.DT __fieldRead100130_256(moom.qI a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __fieldRead100130_257(moom.qI a0) throws Throwable;
private static native net.minecraft.block.Block __call100130_258(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native void __call100130_259(net.minecraft.world.World a0, moom.DT a1, net.minecraft.block.Block a2) throws Throwable;
private static native java.util.List __call100130_260(net.minecraft.world.World a0, moom.G2 a1, int a2) throws Throwable;
private static native java.util.Iterator __call100130_261(java.util.List a0) throws Throwable;
private static native boolean __call100130_262(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100130_263(java.util.Iterator a0) throws Throwable;
private static native moom.Er __cast100130_264(java.lang.Object a0) throws Throwable;
private static native moom.DT __fieldRead100130_265(moom.Er a0) throws Throwable;
private static native boolean __call100130_266(moom.G2 a0, moom.DT a1) throws Throwable;
private static native int __integerCategory100130_267(boolean value) throws Throwable;
private static native moom.DT __fieldRead100130_268(moom.Er a0) throws Throwable;
private static native moom.DT __call100130_269(moom.DT a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call100130_270(moom.Er a0) throws Throwable;
private static native long __fieldRead100130_271(moom.Er a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call100130_272(net.minecraft.world.World a0) throws Throwable;
private static native long __call100130_273(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native int __fieldRead100130_274(moom.Er a0) throws Throwable;
private static native void __call100130_275(net.minecraft.world.World a0, moom.DT a1, net.minecraft.block.Block a2, int a3, int a4) throws Throwable;
private static native moom.b7 __sourceUninitializedNEW100130_276() throws Throwable;
private static native void __explicitNewInit100130_278(moom.b7 a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead100130_279() throws Throwable;
private static native void __call100130_280(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native java.lang.Integer __call100130_282(int a0) throws Throwable;
private static native void __call100130_283(net.minecraft.command.ICommandSender a0, moom.pN a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.String[] __call100130_284() throws Throwable;
private static native void __call100130_285(int a0) throws Throwable;
private static native java.lang.Exception __call13013000_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013001_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013002_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013003_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013004_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013005_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013006_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013007_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013008_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013009_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013010_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013011_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013012_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013013_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013014_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013015_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013016_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013017_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013018_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013019_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013020_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013021_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013022_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013023_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013024_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013025_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013026_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013027_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013028_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013029_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013030_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013031_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013032_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013033_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013034_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013035_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013036_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013037_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013038_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013039_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013040_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013041_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013042_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013043_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013044_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013045_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013046_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013047_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013048_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013049_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013050_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013051_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013052_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013053_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013054_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013055_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013056_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013057_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013058_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013059_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013060_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013061_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013062_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013063_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013064_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_e2042e8b20bcf52e770e(moom.pN a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_e2042e8b20bcf52e770e {

public static java.util.List f1113(moom.pN receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    int forwardValue1113_24_0;
    int forwardValue1113_25_0;
    int forwardValue1113_25_1;
    int forwardValue1113_50_0;
    int forwardValue1113_50_1;
    int forwardValue1113_79_0;
    int forwardValue1113_79_1;
    int forwardValue1113_106_0;
    int forwardValue1113_106_1;
    int forwardValue1113_135_0;
    int forwardValue1113_135_1;
    int forwardValue1113_145_0;
    java.util.List forwardValue1113_152_0;
    int spill1113_0;
    int spill1113_1;
    int spill1113_2;
    int spill1113_3;
    int spill1113_4;
    int spill1113_5;
    int spill1113_6;
    int spill1113_7;
    long life4_3;
    int life6_5;
    forward_join_152: {
    forward_join_151: {
    forward_join_145: {
    forward_join_135: {
    forward_join_126: {
    forward_join_106: {
    forward_join_99: {
    forward_join_79: {
    forward_join_72: {
    forward_join_50: {
    forward_join_43: {
    forward_join_25: {
    forward_join_24: {
    forward_join_22: {
    life4_3 = (__fieldRead1113_0() ^ 125607084466571L);
    life6_5 = __integerCategory1113_2(__call1113_1());
    spill1113_0 = (p1).length;
    if (!((life6_5 != 0))) {
        forwardValue1113_24_0 = spill1113_0;
        break forward_join_24;
    }
    if (!((spill1113_0 > 0))) {
        break forward_join_22;
    }
    spill1113_1 = (p1).length;
    spill1113_2 = 3;
    if (!((life6_5 != 0))) {
        forwardValue1113_25_0 = spill1113_1;
        forwardValue1113_25_1 = spill1113_2;
        break forward_join_25;
    }
    if (!((spill1113_1 <= spill1113_2))) {
        break forward_join_22;
    }
    forwardValue1113_152_0 = __call1113_3(p1, 0, p2);
    break forward_join_152;
    }
    forwardValue1113_24_0 = (p1).length;
    }
    forwardValue1113_25_0 = forwardValue1113_24_0;
    forwardValue1113_25_1 = 3;
    }
    if (!((life6_5 != 0))) {
        forwardValue1113_50_0 = forwardValue1113_25_0;
        forwardValue1113_50_1 = forwardValue1113_25_1;
        break forward_join_50;
    }
    if (!((forwardValue1113_25_0 > forwardValue1113_25_1))) {
        break forward_join_43;
    }
    spill1113_3 = (p1).length;
    spill1113_4 = __invokedynamic1113_4(31722, (5858680319729891743L ^ life4_3));
    if (!((life6_5 != 0))) {
        forwardValue1113_50_0 = spill1113_3;
        forwardValue1113_50_1 = spill1113_4;
        break forward_join_50;
    }
    if (!((spill1113_3 <= spill1113_4))) {
        break forward_join_43;
    }
    forwardValue1113_152_0 = __call1113_5(p1, 3, p2);
    break forward_join_152;
    }
    forwardValue1113_50_0 = (p1).length;
    forwardValue1113_50_1 = __invokedynamic1113_6(31722, (5858680319729891743L ^ life4_3));
    }
    if (!((life6_5 != 0))) {
        forwardValue1113_79_0 = forwardValue1113_50_0;
        forwardValue1113_79_1 = forwardValue1113_50_1;
        break forward_join_79;
    }
    if (!((forwardValue1113_50_0 > forwardValue1113_50_1))) {
        break forward_join_72;
    }
    spill1113_5 = (p1).length;
    spill1113_6 = __invokedynamic1113_7(8153, (1145722444404563364L ^ life4_3));
    if (!((life6_5 != 0))) {
        forwardValue1113_79_0 = spill1113_5;
        forwardValue1113_79_1 = spill1113_6;
        break forward_join_79;
    }
    if (!((spill1113_5 <= spill1113_6))) {
        break forward_join_72;
    }
    forwardValue1113_152_0 = __call1113_9(p1, __invokedynamic1113_8(31722, (5858680319729891743L ^ life4_3)), p2);
    break forward_join_152;
    }
    forwardValue1113_79_0 = (p1).length;
    forwardValue1113_79_1 = __invokedynamic1113_10(2163, (7455752168003734025L ^ life4_3));
    }
    if (!((life6_5 != 0))) {
        forwardValue1113_106_0 = forwardValue1113_79_0;
        forwardValue1113_106_1 = forwardValue1113_79_1;
        break forward_join_106;
    }
    if (!((forwardValue1113_79_0 == forwardValue1113_79_1))) {
        break forward_join_99;
    }
    forwardValue1113_152_0 = __call1113_11(p1, new java.lang.String[] {"replace", "masked", "filtered"});
    break forward_join_152;
    }
    forwardValue1113_106_0 = (p1).length;
    forwardValue1113_106_1 = __invokedynamic1113_12(14860, (5983447133660657780L ^ life4_3));
    }
    if (!((life6_5 != 0))) {
        forwardValue1113_135_0 = forwardValue1113_106_0;
        forwardValue1113_135_1 = forwardValue1113_106_1;
        break forward_join_135;
    }
    if (!((forwardValue1113_106_0 == forwardValue1113_106_1))) {
        break forward_join_126;
    }
    forwardValue1113_152_0 = __call1113_13(p1, new java.lang.String[] {"normal", "force", "move"});
    break forward_join_152;
    }
    spill1113_7 = (p1).length;
    if (!((life6_5 != 0))) {
        forwardValue1113_145_0 = spill1113_7;
        break forward_join_145;
    }
    forwardValue1113_135_0 = spill1113_7;
    forwardValue1113_135_1 = __invokedynamic1113_14(32567, (4279011010497805638L ^ life4_3));
    }
    if (!((forwardValue1113_135_0 == forwardValue1113_135_1))) {
        break forward_join_151;
    }
    forwardValue1113_145_0 = __integerCategory1113_17(__call1113_16("filtered", (p1)[__invokedynamic1113_15(8153, (1145722444404563364L ^ life4_3))]));
    }
    if (!((forwardValue1113_145_0 != 0))) {
        break forward_join_151;
    }
    forwardValue1113_152_0 = __call1113_20(p1, __call1113_19(__fieldRead1113_18()));
    break forward_join_152;
    }
    forwardValue1113_152_0 = null;
    }
    return forwardValue1113_152_0;
}
public static void h1113_0(moom.Oo p0) throws Throwable {
    throw __call1111300_0(p0);
}
public static void h1113_1(moom.Oo p0) throws Throwable {
    throw __call1111301_0(p0);
}
public static void h1113_2(moom.Oo p0) throws Throwable {
    throw __call1111302_0(p0);
}
public static void h1113_3(moom.Oo p0) throws Throwable {
    throw __call1111303_0(p0);
}
public static void h1113_4(moom.Oo p0) throws Throwable {
    throw __call1111304_0(p0);
}
public static void h1113_5(moom.Oo p0) throws Throwable {
    throw __call1111305_0(p0);
}
public static void h1113_6(moom.Oo p0) throws Throwable {
    throw __call1111306_0(p0);
}
public static void h1113_7(moom.Oo p0) throws Throwable {
    throw __call1111307_0(p0);
}
public static void h1113_8(moom.Oo p0) throws Throwable {
    throw __call1111308_0(p0);
}
public static void h1113_9(moom.Oo p0) throws Throwable {
    throw __call1111309_0(p0);
}
public static void h1113_10(moom.Oo p0) throws Throwable {
    throw __call1111310_0(p0);
}
public static void h1113_11(moom.Oo p0) throws Throwable {
    throw __call1111311_0(p0);
}
public static void h1113_12(moom.Oo p0) throws Throwable {
    throw __call1111312_0(p0);
}
public static void h1113_13(moom.Oo p0) throws Throwable {
    throw __call1111313_0(p0);
}
public static void h1113_14(moom.Oo p0) throws Throwable {
    throw __call1111314_0(p0);
}
public static void h1113_15(moom.Oo p0) throws Throwable {
    throw __call1111315_0(p0);
}
public static void h1113_16(moom.Oo p0) throws Throwable {
    throw __call1111316_0(p0);
}
public static void h1113_17(moom.Oo p0) throws Throwable {
    throw __call1111317_0(p0);
}
public static void h1113_18(moom.Oo p0) throws Throwable {
    throw __call1111318_0(p0);
}
private static native long __fieldRead1113_0() throws Throwable;
private static native boolean __call1113_1() throws Throwable;
private static native int __integerCategory1113_2(boolean value) throws Throwable;
private static native java.util.List __call1113_3(java.lang.String[] a0, int a1, moom.DT a2) throws Throwable;
private static native int __invokedynamic1113_4(int a0, long a1) throws Throwable;
private static native java.util.List __call1113_5(java.lang.String[] a0, int a1, moom.DT a2) throws Throwable;
private static native int __invokedynamic1113_6(int a0, long a1) throws Throwable;
private static native int __invokedynamic1113_7(int a0, long a1) throws Throwable;
private static native int __invokedynamic1113_8(int a0, long a1) throws Throwable;
private static native java.util.List __call1113_9(java.lang.String[] a0, int a1, moom.DT a2) throws Throwable;
private static native int __invokedynamic1113_10(int a0, long a1) throws Throwable;
private static native java.util.List __call1113_11(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native int __invokedynamic1113_12(int a0, long a1) throws Throwable;
private static native java.util.List __call1113_13(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native int __invokedynamic1113_14(int a0, long a1) throws Throwable;
private static native int __invokedynamic1113_15(int a0, long a1) throws Throwable;
private static native boolean __call1113_16(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1113_17(boolean value) throws Throwable;
private static native moom.DC __fieldRead1113_18() throws Throwable;
private static native java.util.Set __call1113_19(moom.DC a0) throws Throwable;
private static native java.util.List __call1113_20(java.lang.String[] a0, java.util.Set a1) throws Throwable;
private static native java.lang.Exception __call1111300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111303_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111304_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111305_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111306_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111307_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111308_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111309_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111310_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111311_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111312_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111313_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111314_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111315_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111316_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111317_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111318_0(moom.Oo a0) throws Throwable;

}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8667_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/pN"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 6275;
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
            throw new RuntimeException("moom/pN", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.pN.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_e2042e8b20bcf52e770e(this, p0, p1, p2); }


public java.lang.String a__String() {
return "clone";
}


public int a() {
return 2;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.clone.usage";
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_734b966a723806a036cf(this, p0, p1); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8667_0() throws E;
}
