package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class qF extends net.minecraft.command.CommandBase {

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map g;

public qF() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(634566304022273796L)), ((long)(-4670303576223642600L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(256888872898145L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.qF.c ^ 98060711034195L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill970_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill970_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill970_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill970_14 = new byte[8];
    (__sourceSpill970_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill970_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation970_16 = __sourceSpill970_14;
    ((javax.crypto.Cipher)(__sourceSpill970_11)).init(((int)(__sourceSpill970_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill970_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation970_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "!ÀO²õ¿so¢ßö Â"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill970_25 = local6_life21;
        int __sourceSpill970_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill970_25)).substring(((int)(__sourceSpill970_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill970_30 = local8_life19;
        int __sourceSpill970_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill970_33 = new byte[8];
        (__sourceSpill970_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill970_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill970_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill970_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill970_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill970_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill970_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill970_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill970_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill970_34)).doFinal(((byte[])(__sourceSpill970_33)));
        (__sourceSpill970_30)[__sourceSpill970_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> void __sourceHandlerCall_0e4f73feddcb23743b61(moom.qF a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_0e4f73feddcb23743b61 {

public static void f153(moom.qF receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    int forwardValue153_67_0;
    int forwardValue153_100_0;
    int forwardValue153_208_0;
    int spill153_0;
    int spill153_1;
    int spill153_2;
    int spill153_3;
    long life3_3;
    int life5_5;
    moom.DT life6_33;
    net.minecraft.block.Block life7_38;
    int life8_57;
    net.minecraft.world.World life9_83;
    net.minecraft.nbt.NBTTagCompound life10_100;
    int life11_102;
    java.lang.String life12_127;
    net.minecraft.block.state.IBlockState life12_150;
    net.minecraft.block.Block life13_153;
    int life14_206;
    net.minecraft.tileentity.TileEntity life14_257;
    net.minecraft.nbt.NBTTagCompound life15_290;
    forward_join_312: {
    forward_join_307: {
    forward_join_279: {
    forward_join_240: {
    forward_join_208: {
    forward_join_207: {
    forward_join_157: {
    forward_join_112: {
    forward_join_100: {
    forward_join_82: {
    forward_join_68: {
    forward_join_67: {
    forward_join_49: {
    forward_join_23: {
    forward_join_19: {
    life3_3 = (__fieldRead153_0() ^ 111086073370062L);
    life5_5 = __call153_1();
    if (!((life5_5 == 0))) {
        break forward_join_23;
    }
    if (!(((p1).length < 4))) {
        break forward_join_19;
    }
    throw new moom.cc("commands.testforblock.usage", new java.lang.Object[0]);
    }
    __call153_3(p0, __fieldRead153_2(), 0);
    }
    life6_33 = __call153_4(p0, p1, 0, 0);
    life7_38 = __call153_5((p1)[3]);
    if (!((life7_38 == null))) {
        break forward_join_49;
    }
    throw new moom.b_("commands.setblock.notFound", new java.lang.Object[] {(p1)[3]});
    }
    life8_57 = -1;
    spill153_0 = (p1).length;
    if (!((life5_5 == 0))) {
        forwardValue153_67_0 = spill153_0;
        break forward_join_67;
    }
    if (!((spill153_0 >= 5))) {
        break forward_join_68;
    }
    forwardValue153_67_0 = __call153_7((p1)[4], -1, __invokedynamic153_6(4818, (1822194863173893089L ^ life3_3)));
    }
    life8_57 = forwardValue153_67_0;
    }
    life9_83 = __call153_8(p0);
    if (!((!__call153_9(life9_83, life6_33)))) {
        break forward_join_82;
    }
    throw new moom.b7("commands.testforblock.outOfWorld", new java.lang.Object[0]);
    }
    life10_100 = new net.minecraft.nbt.NBTTagCompound();
    life11_102 = 0;
    spill153_1 = (p1).length;
    if (!((life5_5 == 0))) {
        forwardValue153_100_0 = spill153_1;
        break forward_join_100;
    }
    if (!((spill153_1 >= __invokedynamic153_10(492, (3287729351997810910L ^ life3_3))))) {
        break forward_join_112;
    }
    forwardValue153_100_0 = __integerCategory153_12(__call153_11(life7_38));
    }
    if (!((forwardValue153_100_0 != 0))) {
        break forward_join_112;
    }
    life12_127 = __call153_14(__call153_13(p0, p1, 5));
    life10_100 = __call153_15(life12_127);
    life11_102 = 1;
    }
    life12_150 = __call153_16(life9_83, life6_33);
    life13_153 = __call153_17(life12_150);
    if (!((life13_153 != life7_38))) {
        break forward_join_157;
    }
    throw new moom.b7("commands.testforblock.failed.tile", new java.lang.Object[] {__call153_19(__call153_18(life6_33)), __call153_21(__call153_20(life6_33)), __call153_23(__call153_22(life6_33)), __call153_24(life13_153), __call153_25(life7_38)});
    }
    spill153_2 = life8_57;
    if (!((life5_5 == 0))) {
        forwardValue153_208_0 = spill153_2;
        break forward_join_208;
    }
    if (!((spill153_2 > -1))) {
        break forward_join_207;
    }
    life14_206 = __call153_27(__call153_26(life12_150), life12_150);
    spill153_3 = life14_206;
    if (!((life5_5 == 0))) {
        forwardValue153_208_0 = spill153_3;
        break forward_join_208;
    }
    if (!((spill153_3 != life8_57))) {
        break forward_join_207;
    }
    throw new moom.b7("commands.testforblock.failed.data", new java.lang.Object[] {__call153_29(__call153_28(life6_33)), __call153_31(__call153_30(life6_33)), __call153_33(__call153_32(life6_33)), __call153_34(life14_206), __call153_35(life8_57)});
    }
    forwardValue153_208_0 = life11_102;
    }
    if (!((forwardValue153_208_0 != 0))) {
        break forward_join_279;
    }
    life14_257 = __call153_36(life9_83, life6_33);
    if (!((life14_257 == null))) {
        break forward_join_240;
    }
    throw new moom.b7("commands.testforblock.failed.tileEntity", new java.lang.Object[] {__call153_38(__call153_37(life6_33)), __call153_40(__call153_39(life6_33)), __call153_42(__call153_41(life6_33))});
    }
    life15_290 = new net.minecraft.nbt.NBTTagCompound();
    __call153_43(life14_257, life15_290);
    if (!((life5_5 == 0))) {
        break forward_join_307;
    }
    if (!((!__call153_44(life10_100, life15_290, 1)))) {
        break forward_join_279;
    }
    throw new moom.b7("commands.testforblock.failed.nbt", new java.lang.Object[] {__call153_46(__call153_45(life6_33)), __call153_48(__call153_47(life6_33)), __call153_50(__call153_49(life6_33))});
    }
    __call153_52(p0, __fieldRead153_51(), 1);
    __call153_59(p0, receiver, "commands.testforblock.success", new java.lang.Object[] {__call153_54(__call153_53(life6_33)), __call153_56(__call153_55(life6_33)), __call153_58(__call153_57(life6_33))});
    }
    if (!((life5_5 != 0))) {
        break forward_join_312;
    }
    __call153_60(new java.lang.String[4]);
    }
    return;
}
public static void h153_0(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015300_0(p0);
}
public static void h153_1(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015301_0(p0);
}
public static void h153_2(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015302_0(p0);
}
public static void h153_3(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015303_0(p0);
}
public static void h153_4(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015304_0(p0);
}
public static void h153_5(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015305_0(p0);
}
public static void h153_6(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015306_0(p0);
}
public static void h153_7(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015307_0(p0);
}
public static void h153_8(net.minecraft.nbt.NBTException p0, net.minecraft.block.Block p1) throws Throwable {
    net.minecraft.nbt.NBTException life1_2;
    life1_2 = p0;
    throw new moom.b7("commands.setblock.tagError", new java.lang.Object[] {__call3015308_0(life1_2)});
}
public static void h153_9(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015309_0(p0);
}
public static void h153_10(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015310_0(p0);
}
public static void h153_11(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015311_0(p0);
}
public static void h153_12(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015312_0(p0);
}
public static void h153_13(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015313_0(p0);
}
public static void h153_14(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015314_0(p0);
}
public static void h153_15(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015315_0(p0);
}
public static void h153_16(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015316_0(p0);
}
private static native long __fieldRead153_0() throws Throwable;
private static native int __call153_1() throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead153_2() throws Throwable;
private static native void __call153_3(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native moom.DT __call153_4(net.minecraft.command.ICommandSender a0, java.lang.String[] a1, int a2, int a3) throws Throwable;
private static native net.minecraft.block.Block __call153_5(java.lang.String a0) throws Throwable;
private static native int __invokedynamic153_6(int a0, long a1) throws Throwable;
private static native int __call153_7(java.lang.String a0, int a1, int a2) throws Throwable;
private static native net.minecraft.world.World __call153_8(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native boolean __call153_9(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __invokedynamic153_10(int a0, long a1) throws Throwable;
private static native boolean __call153_11(net.minecraft.block.Block a0) throws Throwable;
private static native int __integerCategory153_12(boolean value) throws Throwable;
private static native net.minecraft.util.IChatComponent __call153_13(net.minecraft.command.ICommandSender a0, java.lang.String[] a1, int a2) throws Throwable;
private static native java.lang.String __call153_14(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call153_15(java.lang.String a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call153_16(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call153_17(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __call153_18(moom.DT a0) throws Throwable;
private static native java.lang.Integer __call153_19(int a0) throws Throwable;
private static native int __call153_20(moom.DT a0) throws Throwable;
private static native java.lang.Integer __call153_21(int a0) throws Throwable;
private static native int __call153_22(moom.DT a0) throws Throwable;
private static native java.lang.Integer __call153_23(int a0) throws Throwable;
private static native java.lang.String __call153_24(net.minecraft.block.Block a0) throws Throwable;
private static native java.lang.String __call153_25(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __call153_26(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __call153_27(net.minecraft.block.Block a0, net.minecraft.block.state.IBlockState a1) throws Throwable;
private static native int __call153_28(moom.DT a0) throws Throwable;
private static native java.lang.Integer __call153_29(int a0) throws Throwable;
private static native int __call153_30(moom.DT a0) throws Throwable;
private static native java.lang.Integer __call153_31(int a0) throws Throwable;
private static native int __call153_32(moom.DT a0) throws Throwable;
private static native java.lang.Integer __call153_33(int a0) throws Throwable;
private static native java.lang.Integer __call153_34(int a0) throws Throwable;
private static native java.lang.Integer __call153_35(int a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call153_36(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __call153_37(moom.DT a0) throws Throwable;
private static native java.lang.Integer __call153_38(int a0) throws Throwable;
private static native int __call153_39(moom.DT a0) throws Throwable;
private static native java.lang.Integer __call153_40(int a0) throws Throwable;
private static native int __call153_41(moom.DT a0) throws Throwable;
private static native java.lang.Integer __call153_42(int a0) throws Throwable;
private static native void __call153_43(net.minecraft.tileentity.TileEntity a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native boolean __call153_44(net.minecraft.nbt.NBTTagCompound a0, net.minecraft.nbt.NBTTagCompound a1, int a2) throws Throwable;
private static native int __call153_45(moom.DT a0) throws Throwable;
private static native java.lang.Integer __call153_46(int a0) throws Throwable;
private static native int __call153_47(moom.DT a0) throws Throwable;
private static native java.lang.Integer __call153_48(int a0) throws Throwable;
private static native int __call153_49(moom.DT a0) throws Throwable;
private static native java.lang.Integer __call153_50(int a0) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead153_51() throws Throwable;
private static native void __call153_52(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native int __call153_53(moom.DT a0) throws Throwable;
private static native java.lang.Integer __call153_54(int a0) throws Throwable;
private static native int __call153_55(moom.DT a0) throws Throwable;
private static native java.lang.Integer __call153_56(int a0) throws Throwable;
private static native int __call153_57(moom.DT a0) throws Throwable;
private static native java.lang.Integer __call153_58(int a0) throws Throwable;
private static native void __call153_59(net.minecraft.command.ICommandSender a0, moom.qF a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native void __call153_60(java.lang.String[] a0) throws Throwable;
private static native java.lang.Exception __call3015300_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015301_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015302_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015303_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015304_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015305_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015306_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015307_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.String __call3015308_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015309_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015310_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015311_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015312_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015313_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015314_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015315_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015316_0(net.minecraft.nbt.NBTException a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_57a80c860901ed239d9e(moom.qF a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_57a80c860901ed239d9e {

public static java.util.List f1147(moom.qF receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    int forwardValue1147_26_0;
    int forwardValue1147_27_0;
    int forwardValue1147_27_1;
    java.lang.String[] forwardValue1147_29_0;
    java.util.List forwardValue1147_34_0;
    int spill1147_0;
    int spill1147_1;
    int spill1147_2;
    java.lang.String[] spill1147_3;
    long life4_3;
    int life6_5;
    forward_join_34: {
    forward_join_33: {
    forward_join_29: {
    forward_join_27: {
    forward_join_26: {
    forward_join_22: {
    life4_3 = (__fieldRead1147_0() ^ 37387402986573L);
    life6_5 = __call1147_1();
    spill1147_0 = (p1).length;
    if (!((life6_5 != 0))) {
        forwardValue1147_26_0 = spill1147_0;
        break forward_join_26;
    }
    if (!((spill1147_0 > 0))) {
        break forward_join_22;
    }
    spill1147_1 = (p1).length;
    spill1147_2 = 3;
    if (!((life6_5 != 0))) {
        forwardValue1147_27_0 = spill1147_1;
        forwardValue1147_27_1 = spill1147_2;
        break forward_join_27;
    }
    if (!((spill1147_1 <= spill1147_2))) {
        break forward_join_22;
    }
    forwardValue1147_34_0 = __call1147_2(p1, 0, p2);
    break forward_join_34;
    }
    spill1147_3 = p1;
    if (!((life6_5 != 0))) {
        forwardValue1147_29_0 = spill1147_3;
        break forward_join_29;
    }
    forwardValue1147_26_0 = (spill1147_3).length;
    }
    forwardValue1147_27_0 = forwardValue1147_26_0;
    forwardValue1147_27_1 = 4;
    }
    if (!((forwardValue1147_27_0 == forwardValue1147_27_1))) {
        break forward_join_33;
    }
    forwardValue1147_29_0 = p1;
    }
    forwardValue1147_34_0 = __call1147_5(forwardValue1147_29_0, __call1147_4(__fieldRead1147_3()));
    break forward_join_34;
    }
    forwardValue1147_34_0 = null;
    }
    return forwardValue1147_34_0;
}
public static void h1147_0(moom.Oo p0) throws Throwable {
    throw __call1114700_0(p0);
}
public static void h1147_1(moom.Oo p0) throws Throwable {
    throw __call1114701_0(p0);
}
public static void h1147_2(moom.Oo p0) throws Throwable {
    throw __call1114702_0(p0);
}
public static void h1147_3(moom.Oo p0) throws Throwable {
    throw __call1114703_0(p0);
}
public static void h1147_4(moom.Oo p0) throws Throwable {
    throw __call1114704_0(p0);
}
private static native long __fieldRead1147_0() throws Throwable;
private static native int __call1147_1() throws Throwable;
private static native java.util.List __call1147_2(java.lang.String[] a0, int a1, moom.DT a2) throws Throwable;
private static native moom.DC __fieldRead1147_3() throws Throwable;
private static native java.util.Set __call1147_4(moom.DC a0) throws Throwable;
private static native java.util.List __call1147_5(java.lang.String[] a0, java.util.Set a1) throws Throwable;
private static native java.lang.Exception __call1114700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1114701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1114702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1114703_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1114704_0(moom.Oo a0) throws Throwable;

}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8741_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/qF"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 25165;
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
            throw new RuntimeException("moom/qF", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.qF.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_57a80c860901ed239d9e(this, p0, p1, p2); }


public java.lang.String a__String() {
return "testforblock";
}


public int a() {
return 2;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.testforblock.usage";
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_0e4f73feddcb23743b61(this, p0, p1); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8741_0() throws E;
}
