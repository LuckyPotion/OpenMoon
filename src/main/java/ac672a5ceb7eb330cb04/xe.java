package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class xe extends net.minecraft.item.Item {

private static long n;

private static long[] o;

private static java.lang.Integer[] p;

private static java.util.Map q;

public xe() {
super();
    (this).b(1);
}


static {
n = ((long)(((moom._a)(moom._c.a(((long)(-1909561963525972575L)), ((long)(-8135345491839536155L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(97274080740165L)))));
    q = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.xe.n ^ 15790495971618L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1108_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1108_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1108_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1108_14 = new byte[8];
    (__sourceSpill1108_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1108_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1108_16 = __sourceSpill1108_14;
    ((javax.crypto.Cipher)(__sourceSpill1108_11)).init(((int)(__sourceSpill1108_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1108_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1108_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "s}ZùS\rÞ\000\006ñ[;Wµ´¯y&\f¸ê["))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1108_25 = local6_life21;
        int __sourceSpill1108_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1108_25)).substring(((int)(__sourceSpill1108_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1108_30 = local8_life19;
        int __sourceSpill1108_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1108_33 = new byte[8];
        (__sourceSpill1108_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1108_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1108_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1108_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1108_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1108_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1108_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1108_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1108_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1108_34)).doFinal(((byte[])(__sourceSpill1108_33)));
        (__sourceSpill1108_30)[__sourceSpill1108_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    o = ((long[])(local8_life19));
    p = ((java.lang.Integer[])(new java.lang.Integer[3]));
}

private static native <E extends Throwable> void __sourceHandlerCall_f9fbc075ac1004bec880(moom.xe a0, net.minecraft.item.ItemStack a1, net.minecraft.entity.player.EntityPlayer a2) throws E;
private static final class __SourceHandler_f9fbc075ac1004bec880 {

public static void f520(moom.xe receiver, net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1) throws Throwable {
    net.minecraft.item.ItemStack forestValue520_11_0;
    net.minecraft.nbt.NBTTagCompound forestValue520_17_0;
    int forestValue520_32_0;
    net.minecraft.nbt.NBTTagCompound forestValue520_34_0;
    net.minecraft.entity.player.EntityPlayer forestValue520_83_0;
    net.minecraft.entity.player.EntityPlayer forestValue520_89_0;
    net.minecraft.item.ItemStack spill520_0;
    net.minecraft.nbt.NBTTagCompound spill520_1;
    boolean spill520_2;
    net.minecraft.nbt.NBTTagCompound spill520_3;
    net.minecraft.nbt.NBTTagList spill520_4;
    int spill520_5;
    moom.yA spill520_6;
    net.minecraft.entity.player.EntityPlayer spill520_7;
    net.minecraft.network.NetHandlerPlayServer spill520_8;
    moom.Ag spill520_9;
    long life3_3;
    int life5_5;
    net.minecraft.nbt.NBTTagCompound life6_20;
    net.minecraft.nbt.NBTTagList life7_47;
    int life8_49;
    java.lang.String life9_57;
    net.minecraft.util.IChatComponent life10_60;
    net.minecraft.util.IChatComponent life10_65;
    moom.wB life8_107;
    forest_join_108: {
    forest_join_89: {
    forest_join_83: {
    forest_join_77: {
    forest_join_73: {
    forest_join_34: {
    forest_join_32: {
    forest_join_17: {
    forest_join_11: {
    life3_3 = (__fieldRead520_0() ^ 67322111860528L);
    life5_5 = __integerCategory520_2(__call520_1());
    spill520_0 = p0;
    if (!((life5_5 != 0))) {
        forestValue520_11_0 = spill520_0;
        break forest_join_11;
    }
    if (!((spill520_0 != null))) {
        break forest_join_108;
    }
    forestValue520_11_0 = p0;
    }
    spill520_1 = __call520_3(forestValue520_11_0);
    if (!((life5_5 != 0))) {
        forestValue520_17_0 = spill520_1;
        break forest_join_17;
    }
    if (!((spill520_1 != null))) {
        break forest_join_108;
    }
    forestValue520_17_0 = __call520_4(p0);
    }
    life6_20 = forestValue520_17_0;
    spill520_2 = __call520_5(life6_20, "resolved");
    if (!((life5_5 != 0))) {
        forestValue520_32_0 = __integerCategory520_6(spill520_2);
        break forest_join_32;
    }
    if (!((!spill520_2))) {
        break forest_join_108;
    }
    __call520_7(life6_20, "resolved", 1);
    spill520_3 = life6_20;
    if (!((life5_5 != 0))) {
        forestValue520_34_0 = spill520_3;
        break forest_join_34;
    }
    forestValue520_32_0 = __integerCategory520_9(__call520_8(spill520_3));
    }
    if (!((forestValue520_32_0 != 0))) {
        break forest_join_108;
    }
    forestValue520_34_0 = life6_20;
    }
    life7_47 = __call520_11(forestValue520_34_0, "pages", __invokedynamic520_10(19620, (1634411062897412386L ^ life3_3)));
    life8_49 = 0;
    forest_cycle_44: while (true) {
    if (!((life8_49 < __call520_12(life7_47)))) {
        break forest_join_73;
    }
    life9_57 = __call520_13(life7_47, life8_49);
    life10_60 = __call520_14(life9_57);
    life10_65 = __call520_15(p1, life10_60, p1);
    if (!((life5_5 != 0))) {
        break forest_join_77;
    }
    spill520_4 = life7_47;
    spill520_5 = life8_49;
    moom.yA __stackOp520_17_0 = __sourceUninitializedNEW520_16();
    spill520_6 = __stackOp520_17_0;
    __explicitNewInit520_19(__stackOp520_17_0, __call520_18(life10_65));
    __call520_20(spill520_4, spill520_5, spill520_6);
    life8_49 += 1;
    if (!((life5_5 == 0))) {
        continue forest_cycle_44;
    }
    break forest_cycle_44;
    }
    }
    __call520_21(life6_20, "pages", life7_47);
    }
    spill520_7 = p1;
    if (!((life5_5 != 0))) {
        forestValue520_83_0 = spill520_7;
        break forest_join_83;
    }
    if (!((__instanceOf520_22(spill520_7) != 0))) {
        break forest_join_108;
    }
    forestValue520_83_0 = p1;
    }
    if (!((life5_5 != 0))) {
        forestValue520_89_0 = forestValue520_83_0;
        break forest_join_89;
    }
    if (!((__call520_23(forestValue520_83_0) == p0))) {
        break forest_join_108;
    }
    forestValue520_89_0 = p1;
    }
    life8_107 = __call520_28(__fieldRead520_24(forestValue520_89_0), __fieldRead520_25(p1), __fieldRead520_27(__fieldRead520_26(p1)));
    spill520_8 = __fieldRead520_30(__cast520_29(p1));
    moom.Ag __stackOp520_32_0 = __sourceUninitializedNEW520_31();
    spill520_9 = __stackOp520_32_0;
    __explicitNewInit520_34(__stackOp520_32_0, 0, __fieldRead520_33(life8_107), p0);
    __call520_35(spill520_8, spill520_9);
    }
    return;
}
public static void h520_0(java.lang.Exception p0) throws Throwable {
    throw __call3052000_0(p0);
}
public static void h520_1(java.lang.Exception p0) throws Throwable {
    throw __call3052001_0(p0);
}
public static void h520_2(java.lang.Exception p0) throws Throwable {
    throw __call3052002_0(p0);
}
public static void h520_3(java.lang.Exception p0) throws Throwable {
    throw __call3052003_0(p0);
}
public static void h520_4(java.lang.Exception p0) throws Throwable {
    throw __call3052004_0(p0);
}
public static void h520_5(java.lang.Exception p0) throws Throwable {
    throw __call3052005_0(p0);
}
public static void h520_6(java.lang.Exception p0) throws Throwable {
    throw __call3052006_0(p0);
}
public static void h520_7(java.lang.Exception p0, net.minecraft.item.ItemStack p1, net.minecraft.entity.player.EntityPlayer p2, int p3, net.minecraft.nbt.NBTTagCompound p4, net.minecraft.nbt.NBTTagList p5, int p6, java.lang.String p7) throws Throwable {
    net.minecraft.entity.player.EntityPlayer forestValue3052007_48_0;
    net.minecraft.entity.player.EntityPlayer forestValue3052007_54_0;
    moom.CM spill3052007_0;
    net.minecraft.nbt.NBTTagList spill3052007_1;
    int spill3052007_2;
    moom.yA spill3052007_3;
    net.minecraft.entity.player.EntityPlayer spill3052007_4;
    net.minecraft.network.NetHandlerPlayServer spill3052007_5;
    moom.Ag spill3052007_6;
    java.lang.Exception life9_2;
    net.minecraft.util.IChatComponent life8_7;
    java.lang.String life7_27;
    net.minecraft.util.IChatComponent life8_30;
    moom.wB life6_66;
    forest_join_73: {
    forest_join_54: {
    forest_join_48: {
    forest_join_42: {
    forest_join_38: {
    life9_2 = p0;
    moom.CM __stackOp3052007_1_0 = __sourceUninitializedNEW3052007_0();
    spill3052007_0 = __stackOp3052007_1_0;
    __explicitNewInit3052007_2(__stackOp3052007_1_0, p7);
    life8_7 = spill3052007_0;
    forest_cycle_7: while (true) {
    forest_join_19: {
    spill3052007_1 = p5;
    spill3052007_2 = p6;
    moom.yA __stackOp3052007_4_0 = __sourceUninitializedNEW3052007_3();
    spill3052007_3 = __stackOp3052007_4_0;
    __explicitNewInit3052007_6(__stackOp3052007_4_0, __call3052007_5(life8_7));
    __call3052007_7(spill3052007_1, spill3052007_2, spill3052007_3);
    p6 += 1;
    if (!((p3 == 0))) {
        break forest_join_19;
    }
    break forest_join_38;
    }
    if (!((p6 < __call3052007_8(p5)))) {
        break forest_join_38;
    }
    life7_27 = __call3052007_9(p5, p6);
    life8_30 = __call3052007_10(life7_27);
    life8_7 = __call3052007_11(p2, life8_30, p2);
    if (!((p3 != 0))) {
        break forest_join_42;
    }
    continue forest_cycle_7;
    }
    }
    __call3052007_12(p4, "pages", p5);
    }
    spill3052007_4 = p2;
    if (!((p3 != 0))) {
        forestValue3052007_48_0 = spill3052007_4;
        break forest_join_48;
    }
    if (!((__instanceOf3052007_13(spill3052007_4) != 0))) {
        break forest_join_73;
    }
    forestValue3052007_48_0 = p2;
    }
    if (!((p3 != 0))) {
        forestValue3052007_54_0 = forestValue3052007_48_0;
        break forest_join_54;
    }
    if (!((__call3052007_14(forestValue3052007_48_0) == p1))) {
        break forest_join_73;
    }
    forestValue3052007_54_0 = p2;
    }
    life6_66 = __call3052007_19(__fieldRead3052007_15(forestValue3052007_54_0), __fieldRead3052007_16(p2), __fieldRead3052007_18(__fieldRead3052007_17(p2)));
    spill3052007_5 = __fieldRead3052007_21(__cast3052007_20(p2));
    moom.Ag __stackOp3052007_23_0 = __sourceUninitializedNEW3052007_22();
    spill3052007_6 = __stackOp3052007_23_0;
    __explicitNewInit3052007_25(__stackOp3052007_23_0, 0, __fieldRead3052007_24(life6_66), p1);
    __call3052007_26(spill3052007_5, spill3052007_6);
    }
    return;
}
public static void h520_8(java.lang.Exception p0) throws Throwable {
    throw __call3052008_0(p0);
}
public static void h520_9(java.lang.Exception p0) throws Throwable {
    throw __call3052009_0(p0);
}
public static void h520_10(java.lang.Exception p0) throws Throwable {
    throw __call3052010_0(p0);
}
public static void h520_11(java.lang.Exception p0) throws Throwable {
    throw __call3052011_0(p0);
}
private static native long __fieldRead520_0() throws Throwable;
private static native boolean __call520_1() throws Throwable;
private static native int __integerCategory520_2(boolean value) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call520_3(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call520_4(net.minecraft.item.ItemStack a0) throws Throwable;
private static native boolean __call520_5(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory520_6(boolean value) throws Throwable;
private static native void __call520_7(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native boolean __call520_8(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native int __integerCategory520_9(boolean value) throws Throwable;
private static native int __invokedynamic520_10(int a0, long a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __call520_11(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __call520_12(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native java.lang.String __call520_13(net.minecraft.nbt.NBTTagList a0, int a1) throws Throwable;
private static native net.minecraft.util.IChatComponent __call520_14(java.lang.String a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call520_15(net.minecraft.entity.player.EntityPlayer a0, net.minecraft.util.IChatComponent a1, net.minecraft.entity.player.EntityPlayer a2) throws Throwable;
private static native moom.yA __sourceUninitializedNEW520_16() throws Throwable;
private static native java.lang.String __call520_18(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native void __explicitNewInit520_19(moom.yA a0, java.lang.String a1) throws Throwable;
private static native void __call520_20(net.minecraft.nbt.NBTTagList a0, int a1, moom.yA a2) throws Throwable;
private static native void __call520_21(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, net.minecraft.nbt.NBTTagList a2) throws Throwable;
private static native int __instanceOf520_22(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call520_23(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native moom.v8 __fieldRead520_24(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead520_25(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead520_26(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native int __fieldRead520_27(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native moom.wB __call520_28(moom.v8 a0, net.minecraft.entity.player.InventoryPlayer a1, int a2) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __cast520_29(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead520_30(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.Ag __sourceUninitializedNEW520_31() throws Throwable;
private static native int __fieldRead520_33(moom.wB a0) throws Throwable;
private static native void __explicitNewInit520_34(moom.Ag a0, int a1, int a2, net.minecraft.item.ItemStack a3) throws Throwable;
private static native void __call520_35(net.minecraft.network.NetHandlerPlayServer a0, moom.Ag a1) throws Throwable;
private static native java.lang.Exception __call3052000_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3052001_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3052002_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3052003_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3052004_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3052005_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3052006_0(java.lang.Exception a0) throws Throwable;
private static native moom.CM __sourceUninitializedNEW3052007_0() throws Throwable;
private static native void __explicitNewInit3052007_2(moom.CM a0, java.lang.String a1) throws Throwable;
private static native moom.yA __sourceUninitializedNEW3052007_3() throws Throwable;
private static native java.lang.String __call3052007_5(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native void __explicitNewInit3052007_6(moom.yA a0, java.lang.String a1) throws Throwable;
private static native void __call3052007_7(net.minecraft.nbt.NBTTagList a0, int a1, moom.yA a2) throws Throwable;
private static native int __call3052007_8(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native java.lang.String __call3052007_9(net.minecraft.nbt.NBTTagList a0, int a1) throws Throwable;
private static native net.minecraft.util.IChatComponent __call3052007_10(java.lang.String a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call3052007_11(net.minecraft.entity.player.EntityPlayer a0, net.minecraft.util.IChatComponent a1, net.minecraft.entity.player.EntityPlayer a2) throws Throwable;
private static native void __call3052007_12(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, net.minecraft.nbt.NBTTagList a2) throws Throwable;
private static native int __instanceOf3052007_13(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call3052007_14(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native moom.v8 __fieldRead3052007_15(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead3052007_16(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead3052007_17(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native int __fieldRead3052007_18(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native moom.wB __call3052007_19(moom.v8 a0, net.minecraft.entity.player.InventoryPlayer a1, int a2) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __cast3052007_20(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead3052007_21(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.Ag __sourceUninitializedNEW3052007_22() throws Throwable;
private static native int __fieldRead3052007_24(moom.wB a0) throws Throwable;
private static native void __explicitNewInit3052007_25(moom.Ag a0, int a1, int a2, net.minecraft.item.ItemStack a3) throws Throwable;
private static native void __call3052007_26(net.minecraft.network.NetHandlerPlayServer a0, moom.Ag a1) throws Throwable;
private static native java.lang.Exception __call3052008_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3052009_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3052010_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3052011_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_86e007abb3712aa54167(moom.xe a0, net.minecraft.item.ItemStack a1, net.minecraft.entity.player.EntityPlayer a2, java.util.List a3, boolean a4) throws E;
private static final class __SourceHandler_86e007abb3712aa54167 {

public static void f192(moom.xe receiver, net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, java.util.List p2, boolean p3) throws Throwable {
    net.minecraft.item.ItemStack forwardValue192_12_0;
    int forwardValue192_45_0;
    net.minecraft.item.ItemStack spill192_0;
    boolean spill192_1;
    java.util.List spill192_2;
    net.minecraft.util.EnumChatFormatting spill192_3;
    java.lang.String spill192_4;
    java.lang.Object[] spill192_5;
    long life5_3;
    int life7_5;
    net.minecraft.nbt.NBTTagCompound life8_19;
    java.lang.String life9_23;
    forward_join_46: {
    forward_join_45: {
    forward_join_36: {
    forward_join_12: {
    life5_3 = (__fieldRead192_0() ^ 99208524718636L);
    life7_5 = __integerCategory192_2(__call192_1());
    spill192_0 = p0;
    if (!((life7_5 != 0))) {
        forwardValue192_12_0 = spill192_0;
        break forward_join_12;
    }
    if (!(__call192_3(spill192_0))) {
        break forward_join_46;
    }
    forwardValue192_12_0 = p0;
    }
    life8_19 = __call192_4(forwardValue192_12_0);
    life9_23 = __call192_5(life8_19, "author");
    spill192_1 = __call192_6(life9_23);
    if (!((life7_5 != 0))) {
        forwardValue192_45_0 = __integerCategory192_7(spill192_1);
        break forward_join_45;
    }
    if (!((!spill192_1))) {
        break forward_join_36;
    }
    spill192_2 = p2;
    spill192_3 = __fieldRead192_8();
    spill192_4 = "book.byAuthor";
    java.lang.Object[] __stackOp192_9_0 = new java.lang.Object[1];
    spill192_5 = __stackOp192_9_0;
    (__stackOp192_9_0)[0] = life9_23;
    __call192_12(spill192_2, __invokedynamic192_11(spill192_3, __call192_10(spill192_4, spill192_5)));
    }
    forwardValue192_45_0 = __integerCategory192_19(__call192_18(p2, __invokedynamic192_17(__fieldRead192_13(), __call192_16(__invokedynamic192_15(__call192_14(life8_19, "generation"))))));
    }
    __discardScalar192_20(forwardValue192_45_0);
    }
    return;
}
public static void h192_0(moom.Oo p0) throws Throwable {
    throw __call1019200_0(p0);
}
public static void h192_1(moom.Oo p0) throws Throwable {
    throw __call1019201_0(p0);
}
public static void h192_2(moom.Oo p0) throws Throwable {
    throw __call1019202_0(p0);
}
public static void h192_3(moom.Oo p0) throws Throwable {
    throw __call1019203_0(p0);
}
private static native long __fieldRead192_0() throws Throwable;
private static native boolean __call192_1() throws Throwable;
private static native int __integerCategory192_2(boolean value) throws Throwable;
private static native boolean __call192_3(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call192_4(net.minecraft.item.ItemStack a0) throws Throwable;
private static native java.lang.String __call192_5(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native boolean __call192_6(java.lang.String a0) throws Throwable;
private static native int __integerCategory192_7(boolean value) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead192_8() throws Throwable;
private static native java.lang.String __call192_10(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic192_11(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws Throwable;
private static native boolean __call192_12(java.util.List a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead192_13() throws Throwable;
private static native int __call192_14(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic192_15(int a0) throws Throwable;
private static native java.lang.String __call192_16(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic192_17(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws Throwable;
private static native boolean __call192_18(java.util.List a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory192_19(boolean value) throws Throwable;
private static native void __discardScalar192_20(int a0) throws Throwable;
private static native java.lang.Exception __call1019200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1019201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1019202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1019203_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.item.ItemStack __sourceHandlerCall_bb2314ac02d07505d138(moom.xe a0, net.minecraft.item.ItemStack a1, net.minecraft.world.World a2, net.minecraft.entity.player.EntityPlayer a3) throws E;
private static final class __SourceHandler_bb2314ac02d07505d138 {

public static net.minecraft.item.ItemStack f2094(moom.xe receiver, net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2) throws Throwable {
    long life4_3;
    int life6_5;
    life4_3 = (__fieldRead2094_0() ^ 6520240035134L);
    life6_5 = __integerCategory2094_2(__call2094_1());
    if ((life6_5 != 0)) {
        if ((!__fieldRead2094_3(p1))) {
        __call2094_4(receiver, p0, p2);
    }
        __call2094_5(p2, p0);
        __call2094_8(p2, (__fieldRead2094_6())[__call2094_7(receiver)]);
    }
    return p0;
}
public static void h2094_0(moom.Oo p0) throws Throwable {
    throw __call1209400_0(p0);
}
public static void h2094_1(moom.Oo p0) throws Throwable {
    throw __call1209401_0(p0);
}
private static native long __fieldRead2094_0() throws Throwable;
private static native boolean __call2094_1() throws Throwable;
private static native int __integerCategory2094_2(boolean value) throws Throwable;
private static native boolean __fieldRead2094_3(net.minecraft.world.World a0) throws Throwable;
private static native void __call2094_4(moom.xe a0, net.minecraft.item.ItemStack a1, net.minecraft.entity.player.EntityPlayer a2) throws Throwable;
private static native void __call2094_5(net.minecraft.entity.player.EntityPlayer a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native moom.BY[] __fieldRead2094_6() throws Throwable;
private static native int __call2094_7(moom.xe a0) throws Throwable;
private static native void __call2094_8(net.minecraft.entity.player.EntityPlayer a0, moom.BY a1) throws Throwable;
private static native java.lang.Exception __call1209400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1209401_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_62d4cf66c052f399c887(net.minecraft.nbt.NBTTagCompound a0) throws E;
private static final class __SourceHandler_62d4cf66c052f399c887 {

public static boolean f1231(net.minecraft.nbt.NBTTagCompound p0) throws Throwable {
    int forwardValue1231_23_0;
    net.minecraft.nbt.NBTTagCompound forwardValue1231_28_0;
    java.lang.String forwardValue1231_28_1;
    java.lang.String forwardValue1231_35_0;
    int forwardValue1231_52_0;
    int forwardValue1231_56_0;
    int forwardValue1231_58_0;
    boolean spill1231_0;
    net.minecraft.nbt.NBTTagCompound spill1231_1;
    java.lang.String spill1231_2;
    java.lang.String spill1231_3;
    int spill1231_4;
    long life1_3;
    int life3_5;
    java.lang.String life4_39;
    forward_join_58: {
    forward_join_57: {
    forward_join_56: {
    forward_join_52: {
    forward_join_35: {
    forward_join_28: {
    forward_join_26: {
    forward_join_23: {
    forward_join_13: {
    life1_3 = (__fieldRead1231_0() ^ 100587368640894L);
    life3_5 = __integerCategory1231_2(__call1231_1());
    spill1231_0 = __call1231_3(p0);
    if (!((life3_5 == 0))) {
        forwardValue1231_23_0 = __integerCategory1231_4(spill1231_0);
        break forward_join_23;
    }
    if (!((!spill1231_0))) {
        break forward_join_13;
    }
    return __integerCategory1231_5(0);
    }
    spill1231_1 = p0;
    spill1231_2 = "title";
    if (!((life3_5 == 0))) {
        forwardValue1231_28_0 = spill1231_1;
        forwardValue1231_28_1 = spill1231_2;
        break forward_join_28;
    }
    forwardValue1231_23_0 = __integerCategory1231_8(__call1231_7(spill1231_1, spill1231_2, __invokedynamic1231_6(12464, (5639032165877717881L ^ life1_3))));
    }
    if (!((forwardValue1231_23_0 == 0))) {
        break forward_join_26;
    }
    return __integerCategory1231_9(0);
    }
    forwardValue1231_28_0 = p0;
    forwardValue1231_28_1 = "title";
    }
    life4_39 = __call1231_10(forwardValue1231_28_0, forwardValue1231_28_1);
    spill1231_3 = life4_39;
    if (!((life3_5 == 0))) {
        forwardValue1231_35_0 = spill1231_3;
        break forward_join_35;
    }
    if (!((spill1231_3 != null))) {
        break forward_join_57;
    }
    forwardValue1231_35_0 = life4_39;
    }
    spill1231_4 = __call1231_11(forwardValue1231_35_0);
    if (!((life3_5 == 0))) {
        forwardValue1231_52_0 = spill1231_4;
        break forward_join_52;
    }
    if (!((spill1231_4 <= __invokedynamic1231_12(941, (8383000918445107303L ^ life1_3))))) {
        break forward_join_57;
    }
    forwardValue1231_52_0 = __integerCategory1231_15(__call1231_14(p0, "author", __invokedynamic1231_13(19620, (1634523483315136364L ^ life1_3))));
    }
    if (!((life3_5 == 0))) {
        forwardValue1231_56_0 = forwardValue1231_52_0;
        break forward_join_56;
    }
    if (!((forwardValue1231_52_0 != 0))) {
        break forward_join_57;
    }
    forwardValue1231_56_0 = 1;
    }
    forwardValue1231_58_0 = forwardValue1231_56_0;
    break forward_join_58;
    }
    forwardValue1231_58_0 = 0;
    }
    return __integerCategory1231_16(forwardValue1231_58_0);
}
public static void h1231_0(moom.Oo p0) throws Throwable {
    throw __call1123100_0(p0);
}
public static void h1231_1(moom.Oo p0) throws Throwable {
    throw __call1123101_0(p0);
}
public static void h1231_2(moom.Oo p0) throws Throwable {
    throw __call1123102_0(p0);
}
public static void h1231_3(moom.Oo p0) throws Throwable {
    throw __call1123103_0(p0);
}
public static void h1231_4(moom.Oo p0) throws Throwable {
    throw __call1123104_0(p0);
}
public static void h1231_5(moom.Oo p0) throws Throwable {
    throw __call1123105_0(p0);
}
public static void h1231_6(moom.Oo p0) throws Throwable {
    throw __call1123106_0(p0);
}
public static void h1231_7(moom.Oo p0) throws Throwable {
    throw __call1123107_0(p0);
}
private static native long __fieldRead1231_0() throws Throwable;
private static native boolean __call1231_1() throws Throwable;
private static native int __integerCategory1231_2(boolean value) throws Throwable;
private static native boolean __call1231_3(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native int __integerCategory1231_4(boolean value) throws Throwable;
private static native boolean __integerCategory1231_5(int value) throws Throwable;
private static native int __invokedynamic1231_6(int a0, long a1) throws Throwable;
private static native boolean __call1231_7(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory1231_8(boolean value) throws Throwable;
private static native boolean __integerCategory1231_9(int value) throws Throwable;
private static native java.lang.String __call1231_10(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int __call1231_11(java.lang.String a0) throws Throwable;
private static native int __invokedynamic1231_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic1231_13(int a0, long a1) throws Throwable;
private static native boolean __call1231_14(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory1231_15(boolean value) throws Throwable;
private static native boolean __integerCategory1231_16(int value) throws Throwable;
private static native java.lang.Exception __call1123100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1123101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1123102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1123103_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1123104_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1123105_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1123106_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1123107_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_a97cce4613a116f468a7(moom.xe a0, net.minecraft.item.ItemStack a1) throws E;
private static final class __SourceHandler_a97cce4613a116f468a7 {

public static java.lang.String f1232(moom.xe receiver, net.minecraft.item.ItemStack p0) throws Throwable {
    net.minecraft.item.ItemStack forwardValue1232_12_0;
    java.lang.String forwardValue1232_28_0;
    net.minecraft.item.ItemStack spill1232_0;
    java.lang.String spill1232_1;
    long life2_3;
    int life4_5;
    net.minecraft.nbt.NBTTagCompound life5_19;
    java.lang.String life6_23;
    forward_join_28: {
    forward_join_25: {
    forward_join_12: {
    life2_3 = (__fieldRead1232_0() ^ 28656150412531L);
    life4_5 = __integerCategory1232_2(__call1232_1());
    spill1232_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue1232_12_0 = spill1232_0;
        break forward_join_12;
    }
    if (!(__call1232_3(spill1232_0))) {
        break forward_join_25;
    }
    forwardValue1232_12_0 = p0;
    }
    life5_19 = __call1232_4(forwardValue1232_12_0);
    life6_23 = __call1232_5(life5_19, "title");
    spill1232_1 = life6_23;
    if (!((life4_5 == 0))) {
        forwardValue1232_28_0 = spill1232_1;
        break forward_join_28;
    }
    if (!((!__call1232_6(spill1232_1)))) {
        break forward_join_25;
    }
    return life6_23;
    }
    forwardValue1232_28_0 = __call1232_7(receiver, p0);
    }
    return forwardValue1232_28_0;
}
public static void h1232_0(moom.Oo p0) throws Throwable {
    throw __call1123200_0(p0);
}
public static void h1232_1(moom.Oo p0) throws Throwable {
    throw __call1123201_0(p0);
}
public static void h1232_2(moom.Oo p0) throws Throwable {
    throw __call1123202_0(p0);
}
public static void h1232_3(moom.Oo p0) throws Throwable {
    throw __call1123203_0(p0);
}
private static native long __fieldRead1232_0() throws Throwable;
private static native boolean __call1232_1() throws Throwable;
private static native int __integerCategory1232_2(boolean value) throws Throwable;
private static native boolean __call1232_3(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call1232_4(net.minecraft.item.ItemStack a0) throws Throwable;
private static native java.lang.String __call1232_5(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native boolean __call1232_6(java.lang.String a0) throws Throwable;
private static native java.lang.String __call1232_7(moom.xe a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native java.lang.Exception __call1123200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1123201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1123202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1123203_0(moom.Oo a0) throws Throwable;

}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9723_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/xe"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean b__Boolean(net.minecraft.item.ItemStack p0) {
return ((1) != 0);
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.xe.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 24406;
      if (p[var3] == null) {
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
         long var5 = o[var3];
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
         Object[] var9 = (Object[])q.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               q.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/xe", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         p[var3] = var15;
      }

      return p[var3];
}


public static int b(net.minecraft.item.ItemStack p0) {
return ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.item.ItemStack)(p0)).a__yw())).a__Int(((java.lang.String)("generation")));
}


public static boolean b(net.minecraft.nbt.NBTTagCompound p0) { return __sourceHandlerCall_62d4cf66c052f399c887(p0); }


public java.lang.String d(net.minecraft.item.ItemStack p0) { return __sourceHandlerCall_a97cce4613a116f468a7(this, p0); }


private void a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1) { __sourceHandlerCall_f9fbc075ac1004bec880(this, p0, p1); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public void a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, java.util.List<java.lang.String> p2, boolean p3) { __sourceHandlerCall_86e007abb3712aa54167(this, p0, p1, p2, p3); }


public net.minecraft.item.ItemStack a(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2) { return __sourceHandlerCall_bb2314ac02d07505d138(this, p0, p1, p2); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9723_0() throws E;
}
