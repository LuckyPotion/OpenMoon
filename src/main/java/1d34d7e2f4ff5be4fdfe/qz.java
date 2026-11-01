package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class qz extends net.minecraft.command.CommandBase {

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map g;

public qz() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-8520610305594661095L)), ((long)(-2982231769786689424L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(106316020354506L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.qz.c ^ 54012400884186L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1483_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1483_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1483_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1483_14 = new byte[8];
    (__sourceSpill1483_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1483_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1483_16 = __sourceSpill1483_14;
    ((javax.crypto.Cipher)(__sourceSpill1483_11)).init(((int)(__sourceSpill1483_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1483_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1483_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "J`X\bAËY+\bx2\035þÄ(Î"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1483_25 = local6_life21;
        int __sourceSpill1483_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1483_25)).substring(((int)(__sourceSpill1483_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1483_30 = local8_life19;
        int __sourceSpill1483_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1483_33 = new byte[8];
        (__sourceSpill1483_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1483_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1483_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1483_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1483_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1483_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1483_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1483_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1483_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1483_34)).doFinal(((byte[])(__sourceSpill1483_33)));
        (__sourceSpill1483_30)[__sourceSpill1483_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = ">²\001x\023Ã\001-C­ú-î\031"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1483_38 = local6_life21;
        int __sourceSpill1483_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1483_38)).substring(((int)(__sourceSpill1483_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1483_43 = local8_life19;
        int __sourceSpill1483_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1483_46 = new byte[8];
        (__sourceSpill1483_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1483_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1483_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1483_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1483_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1483_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1483_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1483_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1483_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1483_47)).doFinal(((byte[])(__sourceSpill1483_46)));
        (__sourceSpill1483_43)[__sourceSpill1483_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[4]));
}

private static native <E extends Throwable> void __sourceHandlerCall_07e4a97657537b2ec358(moom.qz a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_07e4a97657537b2ec358 {

public static void f155(moom.qz receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    int forwardValue155_53_0;
    int forwardValue155_106_0;
    int forwardValue155_113_0;
    int forwardValue155_113_1;
    int forwardValue155_119_0;
    int forwardValue155_144_0;
    int forwardValue155_152_0;
    net.minecraft.world.World forwardValue155_162_0;
    moom.DT forwardValue155_162_1;
    net.minecraft.tileentity.TileEntity forwardValue155_169_0;
    net.minecraft.tileentity.TileEntity forwardValue155_174_0;
    net.minecraft.world.World forwardValue155_185_0;
    moom.DT forwardValue155_185_1;
    net.minecraft.block.state.IBlockState forwardValue155_185_2;
    net.minecraft.world.World forwardValue155_186_0;
    moom.DT forwardValue155_186_1;
    net.minecraft.block.state.IBlockState forwardValue155_186_2;
    int forwardValue155_186_3;
    int forwardValue155_208_0;
    int spill155_0;
    int spill155_1;
    int spill155_2;
    boolean spill155_3;
    net.minecraft.world.World spill155_4;
    moom.DT spill155_5;
    net.minecraft.world.World spill155_6;
    moom.DT spill155_7;
    net.minecraft.tileentity.TileEntity spill155_8;
    net.minecraft.world.World spill155_9;
    moom.DT spill155_10;
    net.minecraft.block.state.IBlockState spill155_11;
    boolean spill155_12;
    long life3_3;
    int life5_5;
    moom.DT life6_33;
    net.minecraft.block.Block life7_39;
    int life8_41;
    net.minecraft.world.World life9_67;
    net.minecraft.nbt.NBTTagCompound life10_84;
    int life11_86;
    java.lang.String life12_120;
    net.minecraft.tileentity.TileEntity life12_227;
    net.minecraft.block.state.IBlockState life13_266;
    net.minecraft.tileentity.TileEntity life14_292;
    forward_join_250: {
    forward_join_235: {
    forward_join_208: {
    forward_join_207: {
    forward_join_188: {
    forward_join_186: {
    forward_join_185: {
    forward_join_176: {
    forward_join_174: {
    forward_join_169: {
    forward_join_162: {
    forward_join_160: {
    forward_join_152: {
    forward_join_144: {
    forward_join_139: {
    forward_join_119: {
    forward_join_113: {
    forward_join_106: {
    forward_join_104: {
    forward_join_68: {
    forward_join_54: {
    forward_join_53: {
    forward_join_23: {
    forward_join_19: {
    life3_3 = (__fieldRead155_0() ^ 8758336403204L);
    life5_5 = __call155_1();
    if (!((life5_5 == 0))) {
        break forward_join_23;
    }
    if (!(((p1).length < 4))) {
        break forward_join_19;
    }
    throw new moom.cc("commands.setblock.usage", new java.lang.Object[0]);
    }
    __call155_3(p0, __fieldRead155_2(), 0);
    }
    life6_33 = __call155_4(p0, p1, 0, 0);
    life7_39 = __call155_5(p0, (p1)[3]);
    life8_41 = 0;
    spill155_0 = (p1).length;
    if (!((life5_5 == 0))) {
        forwardValue155_53_0 = spill155_0;
        break forward_join_53;
    }
    if (!((spill155_0 >= 5))) {
        break forward_join_54;
    }
    forwardValue155_53_0 = __call155_7((p1)[4], 0, __invokedynamic155_6(32041, (6672491277411954140L ^ life3_3)));
    }
    life8_41 = forwardValue155_53_0;
    }
    life9_67 = __call155_8(p0);
    if (!((!__call155_9(life9_67, life6_33)))) {
        break forward_join_68;
    }
    throw new moom.b7("commands.setblock.outOfWorld", new java.lang.Object[0]);
    }
    life10_84 = new net.minecraft.nbt.NBTTagCompound();
    life11_86 = 0;
    spill155_1 = (p1).length;
    spill155_2 = __invokedynamic155_10(10163, (1119267287787697988L ^ life3_3));
    if (!((life5_5 == 0))) {
        forwardValue155_113_0 = spill155_1;
        forwardValue155_113_1 = spill155_2;
        break forward_join_113;
    }
    if (!((spill155_1 >= spill155_2))) {
        break forward_join_104;
    }
    spill155_3 = __call155_11(life7_39);
    if (!((life5_5 == 0))) {
        forwardValue155_106_0 = __integerCategory155_12(spill155_3);
        break forward_join_106;
    }
    if (!(spill155_3)) {
        break forward_join_104;
    }
    life12_120 = __call155_15(__call155_14(p0, p1, __invokedynamic155_13(27025, (2699295490879273319L ^ life3_3))));
    life10_84 = __call155_16(life12_120);
    life11_86 = 1;
    }
    forwardValue155_106_0 = (p1).length;
    }
    if (!((life5_5 == 0))) {
        forwardValue155_119_0 = forwardValue155_106_0;
        break forward_join_119;
    }
    forwardValue155_113_0 = forwardValue155_106_0;
    forwardValue155_113_1 = __invokedynamic155_17(17481, (3973189775563232445L ^ life3_3));
    }
    if (!((forwardValue155_113_0 >= forwardValue155_113_1))) {
        break forward_join_160;
    }
    forwardValue155_119_0 = __integerCategory155_19(__call155_18((p1)[5], "destroy"));
    }
    if (!((life5_5 == 0))) {
        forwardValue155_144_0 = forwardValue155_119_0;
        break forward_join_144;
    }
    if (!((forwardValue155_119_0 != 0))) {
        break forward_join_139;
    }
    spill155_4 = life9_67;
    spill155_5 = life6_33;
    if (!((life5_5 == 0))) {
        forwardValue155_162_0 = spill155_4;
        forwardValue155_162_1 = spill155_5;
        break forward_join_162;
    }
    __call155_20(spill155_4, spill155_5, 1);
    if (!((life7_39 == __fieldRead155_21()))) {
        break forward_join_160;
    }
    __call155_22(p0, receiver, "commands.setblock.success", new java.lang.Object[0]);
    return;
    }
    forwardValue155_144_0 = __integerCategory155_24(__call155_23((p1)[5], "keep"));
    }
    if (!((life5_5 == 0))) {
        forwardValue155_152_0 = forwardValue155_144_0;
        break forward_join_152;
    }
    if (!((forwardValue155_144_0 != 0))) {
        break forward_join_160;
    }
    spill155_6 = life9_67;
    spill155_7 = life6_33;
    if (!((life5_5 == 0))) {
        forwardValue155_162_0 = spill155_6;
        forwardValue155_162_1 = spill155_7;
        break forward_join_162;
    }
    forwardValue155_152_0 = __integerCategory155_26(__call155_25(spill155_6, spill155_7));
    }
    if (!((forwardValue155_152_0 == 0))) {
        break forward_join_160;
    }
    throw new moom.b7("commands.setblock.noChange", new java.lang.Object[0]);
    }
    forwardValue155_162_0 = life9_67;
    forwardValue155_162_1 = life6_33;
    }
    life12_227 = __call155_27(forwardValue155_162_0, forwardValue155_162_1);
    spill155_8 = life12_227;
    if (!((life5_5 == 0))) {
        forwardValue155_169_0 = spill155_8;
        break forward_join_169;
    }
    if (!((spill155_8 != null))) {
        break forward_join_188;
    }
    forwardValue155_169_0 = life12_227;
    }
    if (!((life5_5 == 0))) {
        forwardValue155_174_0 = forwardValue155_169_0;
        break forward_join_174;
    }
    if (!((__instanceOf155_28(forwardValue155_169_0) != 0))) {
        break forward_join_176;
    }
    forwardValue155_174_0 = life12_227;
    }
    __call155_30(__cast155_29(forwardValue155_174_0));
    }
    spill155_9 = life9_67;
    spill155_10 = life6_33;
    spill155_11 = __call155_32(__fieldRead155_31());
    if (!((life7_39 == __fieldRead155_33()))) {
        forwardValue155_185_0 = spill155_9;
        forwardValue155_185_1 = spill155_10;
        forwardValue155_185_2 = spill155_11;
        break forward_join_185;
    }
    forwardValue155_186_0 = spill155_9;
    forwardValue155_186_1 = spill155_10;
    forwardValue155_186_2 = spill155_11;
    forwardValue155_186_3 = 2;
    break forward_join_186;
    }
    forwardValue155_186_0 = forwardValue155_185_0;
    forwardValue155_186_1 = forwardValue155_185_1;
    forwardValue155_186_2 = forwardValue155_185_2;
    forwardValue155_186_3 = 4;
    }
    __call155_34(forwardValue155_186_0, forwardValue155_186_1, forwardValue155_186_2, forwardValue155_186_3);
    }
    life13_266 = __call155_35(life7_39, life8_41);
    spill155_12 = __call155_36(life9_67, life6_33, life13_266, 2);
    if (!((life5_5 == 0))) {
        forwardValue155_208_0 = __integerCategory155_37(spill155_12);
        break forward_join_208;
    }
    if (!((!spill155_12))) {
        break forward_join_207;
    }
    throw new moom.b7("commands.setblock.noChange", new java.lang.Object[0]);
    }
    forwardValue155_208_0 = life11_86;
    }
    if (!((forwardValue155_208_0 != 0))) {
        break forward_join_235;
    }
    life14_292 = __call155_38(life9_67, life6_33);
    if (!((life5_5 == 0))) {
        break forward_join_250;
    }
    if (!((life14_292 != null))) {
        break forward_join_235;
    }
    __call155_40(life10_84, "x", __call155_39(life6_33));
    __call155_42(life10_84, "y", __call155_41(life6_33));
    __call155_44(life10_84, "z", __call155_43(life6_33));
    __call155_45(life14_292, life10_84);
    }
    __call155_47(life9_67, life6_33, __call155_46(life13_266));
    __call155_49(p0, __fieldRead155_48(), 1);
    __call155_50(p0, receiver, "commands.setblock.success", new java.lang.Object[0]);
    }
    return;
}
public static void h155_0(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015500_0(p0);
}
public static void h155_1(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015501_0(p0);
}
public static void h155_2(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015502_0(p0);
}
public static void h155_3(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015503_0(p0);
}
public static void h155_4(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015504_0(p0);
}
public static void h155_5(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015505_0(p0);
}
public static void h155_6(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015506_0(p0);
}
public static void h155_7(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015507_0(p0);
}
public static void h155_8(net.minecraft.nbt.NBTException p0, net.minecraft.block.state.IBlockState p1) throws Throwable {
    net.minecraft.nbt.NBTException life1_2;
    life1_2 = p0;
    throw new moom.b7("commands.setblock.tagError", new java.lang.Object[] {__call3015508_0(life1_2)});
}
public static void h155_9(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015509_0(p0);
}
public static void h155_10(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015510_0(p0);
}
public static void h155_11(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015511_0(p0);
}
public static void h155_12(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015512_0(p0);
}
public static void h155_13(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015513_0(p0);
}
public static void h155_14(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015514_0(p0);
}
public static void h155_15(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015515_0(p0);
}
public static void h155_16(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015516_0(p0);
}
public static void h155_17(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015517_0(p0);
}
public static void h155_18(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015518_0(p0);
}
public static void h155_19(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015519_0(p0);
}
public static void h155_20(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015520_0(p0);
}
public static void h155_21(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015521_0(p0);
}
public static void h155_22(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015522_0(p0);
}
public static void h155_23(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015523_0(p0);
}
public static void h155_24(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015524_0(p0);
}
public static void h155_25(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015525_0(p0);
}
public static void h155_26(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015526_0(p0);
}
private static native long __fieldRead155_0() throws Throwable;
private static native int __call155_1() throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead155_2() throws Throwable;
private static native void __call155_3(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native moom.DT __call155_4(net.minecraft.command.ICommandSender a0, java.lang.String[] a1, int a2, int a3) throws Throwable;
private static native net.minecraft.block.Block __call155_5(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic155_6(int a0, long a1) throws Throwable;
private static native int __call155_7(java.lang.String a0, int a1, int a2) throws Throwable;
private static native net.minecraft.world.World __call155_8(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native boolean __call155_9(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __invokedynamic155_10(int a0, long a1) throws Throwable;
private static native boolean __call155_11(net.minecraft.block.Block a0) throws Throwable;
private static native int __integerCategory155_12(boolean value) throws Throwable;
private static native int __invokedynamic155_13(int a0, long a1) throws Throwable;
private static native net.minecraft.util.IChatComponent __call155_14(net.minecraft.command.ICommandSender a0, java.lang.String[] a1, int a2) throws Throwable;
private static native java.lang.String __call155_15(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call155_16(java.lang.String a0) throws Throwable;
private static native int __invokedynamic155_17(int a0, long a1) throws Throwable;
private static native boolean __call155_18(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory155_19(boolean value) throws Throwable;
private static native boolean __call155_20(net.minecraft.world.World a0, moom.DT a1, int a2) throws Throwable;
private static native net.minecraft.block.Block __fieldRead155_21() throws Throwable;
private static native void __call155_22(net.minecraft.command.ICommandSender a0, moom.qz a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native boolean __call155_23(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory155_24(boolean value) throws Throwable;
private static native boolean __call155_25(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __integerCategory155_26(boolean value) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call155_27(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __instanceOf155_28(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.inventory.IInventory __cast155_29(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native void __call155_30(net.minecraft.inventory.IInventory a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead155_31() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call155_32(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead155_33() throws Throwable;
private static native boolean __call155_34(net.minecraft.world.World a0, moom.DT a1, net.minecraft.block.state.IBlockState a2, int a3) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call155_35(net.minecraft.block.Block a0, int a1) throws Throwable;
private static native boolean __call155_36(net.minecraft.world.World a0, moom.DT a1, net.minecraft.block.state.IBlockState a2, int a3) throws Throwable;
private static native int __integerCategory155_37(boolean value) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call155_38(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __call155_39(moom.DT a0) throws Throwable;
private static native void __call155_40(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __call155_41(moom.DT a0) throws Throwable;
private static native void __call155_42(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __call155_43(moom.DT a0) throws Throwable;
private static native void __call155_44(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native void __call155_45(net.minecraft.tileentity.TileEntity a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native net.minecraft.block.Block __call155_46(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native void __call155_47(net.minecraft.world.World a0, moom.DT a1, net.minecraft.block.Block a2) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead155_48() throws Throwable;
private static native void __call155_49(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native void __call155_50(net.minecraft.command.ICommandSender a0, moom.qz a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call3015500_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015501_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015502_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015503_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015504_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015505_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015506_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015507_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.String __call3015508_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015509_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015510_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015511_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015512_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015513_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015514_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015515_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015516_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015517_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015518_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015519_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015520_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015521_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015522_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015523_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015524_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015525_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015526_0(net.minecraft.nbt.NBTException a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_77206539ddfc138ae71a(moom.qz a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_77206539ddfc138ae71a {

public static java.util.List f1219(moom.qz receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    int forwardValue1219_24_0;
    int forwardValue1219_25_0;
    int forwardValue1219_25_1;
    int forwardValue1219_42_0;
    int forwardValue1219_42_1;
    java.lang.String[] forwardValue1219_44_0;
    java.util.List forwardValue1219_61_0;
    int spill1219_0;
    int spill1219_1;
    int spill1219_2;
    java.lang.String[] spill1219_3;
    long life4_3;
    int life6_5;
    forward_join_61: {
    forward_join_60: {
    forward_join_44: {
    forward_join_42: {
    forward_join_33: {
    forward_join_25: {
    forward_join_24: {
    forward_join_22: {
    life4_3 = (__fieldRead1219_0() ^ 71467830683271L);
    life6_5 = __call1219_1();
    spill1219_0 = (p1).length;
    if (!((life6_5 != 0))) {
        forwardValue1219_24_0 = spill1219_0;
        break forward_join_24;
    }
    if (!((spill1219_0 > 0))) {
        break forward_join_22;
    }
    spill1219_1 = (p1).length;
    spill1219_2 = 3;
    if (!((life6_5 != 0))) {
        forwardValue1219_25_0 = spill1219_1;
        forwardValue1219_25_1 = spill1219_2;
        break forward_join_25;
    }
    if (!((spill1219_1 <= spill1219_2))) {
        break forward_join_22;
    }
    forwardValue1219_61_0 = __call1219_2(p1, 0, p2);
    break forward_join_61;
    }
    forwardValue1219_24_0 = (p1).length;
    }
    forwardValue1219_25_0 = forwardValue1219_24_0;
    forwardValue1219_25_1 = 4;
    }
    if (!((life6_5 != 0))) {
        forwardValue1219_42_0 = forwardValue1219_25_0;
        forwardValue1219_42_1 = forwardValue1219_25_1;
        break forward_join_42;
    }
    if (!((forwardValue1219_25_0 == forwardValue1219_25_1))) {
        break forward_join_33;
    }
    forwardValue1219_61_0 = __call1219_5(p1, __call1219_4(__fieldRead1219_3()));
    break forward_join_61;
    }
    spill1219_3 = p1;
    if (!((life6_5 != 0))) {
        forwardValue1219_44_0 = spill1219_3;
        break forward_join_44;
    }
    forwardValue1219_42_0 = (spill1219_3).length;
    forwardValue1219_42_1 = __invokedynamic1219_6(17481, (3973261206521087294L ^ life4_3));
    }
    if (!((forwardValue1219_42_0 == forwardValue1219_42_1))) {
        break forward_join_60;
    }
    forwardValue1219_44_0 = p1;
    }
    forwardValue1219_61_0 = __call1219_7(forwardValue1219_44_0, new java.lang.String[] {"replace", "destroy", "keep"});
    break forward_join_61;
    }
    forwardValue1219_61_0 = null;
    }
    return forwardValue1219_61_0;
}
public static void h1219_0(moom.Oo p0) throws Throwable {
    throw __call1121900_0(p0);
}
public static void h1219_1(moom.Oo p0) throws Throwable {
    throw __call1121901_0(p0);
}
public static void h1219_2(moom.Oo p0) throws Throwable {
    throw __call1121902_0(p0);
}
public static void h1219_3(moom.Oo p0) throws Throwable {
    throw __call1121903_0(p0);
}
public static void h1219_4(moom.Oo p0) throws Throwable {
    throw __call1121904_0(p0);
}
public static void h1219_5(moom.Oo p0) throws Throwable {
    throw __call1121905_0(p0);
}
public static void h1219_6(moom.Oo p0) throws Throwable {
    throw __call1121906_0(p0);
}
private static native long __fieldRead1219_0() throws Throwable;
private static native int __call1219_1() throws Throwable;
private static native java.util.List __call1219_2(java.lang.String[] a0, int a1, moom.DT a2) throws Throwable;
private static native moom.DC __fieldRead1219_3() throws Throwable;
private static native java.util.Set __call1219_4(moom.DC a0) throws Throwable;
private static native java.util.List __call1219_5(java.lang.String[] a0, java.util.Set a1) throws Throwable;
private static native int __invokedynamic1219_6(int a0, long a1) throws Throwable;
private static native java.util.List __call1219_7(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.Exception __call1121900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1121901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1121902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1121903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1121904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1121905_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1121906_0(moom.Oo a0) throws Throwable;

}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8898_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/qz"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 23435;
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
            throw new RuntimeException("moom/qz", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.qz.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_77206539ddfc138ae71a(this, p0, p1, p2); }


public java.lang.String a__String() {
return "setblock";
}


public int a() {
return 2;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.setblock.usage";
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_07e4a97657537b2ec358(this, p0, p1); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8898_0() throws E;
}
