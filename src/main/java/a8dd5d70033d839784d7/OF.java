package moom;

import io.netty.buffer.ByteBuf;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class OF extends java.util.ArrayList<net.minecraft.village.MerchantRecipe> {

private static long a;

private static long[] b;

private static java.lang.Integer[] c;

private static java.util.Map d;

public OF() {
super();
}

private static native <E extends Throwable> net.minecraft.nbt.NBTTagCompound __sourceHandlerCall_7f0f837b694be140528b(moom.OF a0) throws E;
private static final class __SourceHandler_7f0f837b694be140528b {

public static net.minecraft.nbt.NBTTagCompound f1004(moom.OF receiver) throws Throwable {
    boolean spill1004_0;
    long life1_3;
    net.minecraft.nbt.NBTTagCompound life4_7;
    net.minecraft.nbt.NBTTagList life5_12;
    java.util.Iterator life6_15;
    int life3_16;
    net.minecraft.village.MerchantRecipe life7_23;
    lexical_join_36: {
    lexical_join_32: {
    life1_3 = (__fieldRead1004_0() ^ 26994881422139L);
    life4_7 = new net.minecraft.nbt.NBTTagCompound();
    spill1004_0 = __call1004_1();
    life5_12 = new net.minecraft.nbt.NBTTagList();
    life6_15 = __call1004_2(receiver);
    life3_16 = __integerCategory1004_3(spill1004_0);
    lexical_cycle_17: while (true) {
    if (!(__call1004_4(life6_15))) {
        break lexical_join_32;
    }
    life7_23 = __cast1004_6(__call1004_5(life6_15));
    __call1004_8(life5_12, __call1004_7(life7_23));
    if (!((life3_16 == 0))) {
        break lexical_join_36;
    }
    if (!((life3_16 != 0))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    __call1004_9(life4_7, "Recipes", life5_12);
    }
    return life4_7;
}
public static void h1004_0(moom.Oo p0) throws Throwable {
    throw __call1100400_0(p0);
}
private static native long __fieldRead1004_0() throws Throwable;
private static native boolean __call1004_1() throws Throwable;
private static native java.util.Iterator __call1004_2(moom.OF a0) throws Throwable;
private static native int __integerCategory1004_3(boolean value) throws Throwable;
private static native boolean __call1004_4(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1004_5(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.village.MerchantRecipe __cast1004_6(java.lang.Object a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call1004_7(net.minecraft.village.MerchantRecipe a0) throws Throwable;
private static native void __call1004_8(net.minecraft.nbt.NBTTagList a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native void __call1004_9(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, net.minecraft.nbt.NBTTagList a2) throws Throwable;
private static native java.lang.Exception __call1100400_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.village.MerchantRecipe __sourceHandlerCall_779475c01c1f43e0e6df(moom.OF a0, net.minecraft.item.ItemStack a1, net.minecraft.item.ItemStack a2, int a3) throws E;
private static final class __SourceHandler_779475c01c1f43e0e6df {

public static net.minecraft.village.MerchantRecipe f1006(moom.OF receiver, net.minecraft.item.ItemStack p0, net.minecraft.item.ItemStack p1, int p2) throws Throwable {
    int lexicalValue1006_44_0;
    int lexicalValue1006_49_0;
    int lexicalValue1006_57_0;
    int lexicalValue1006_62_0;
    net.minecraft.village.MerchantRecipe lexicalValue1006_69_0;
    int lexicalValue1006_71_0;
    int lexicalValue1006_99_0;
    int lexicalValue1006_106_0;
    int lexicalValue1006_114_0;
    int lexicalValue1006_119_0;
    int spill1006_0;
    int spill1006_1;
    boolean spill1006_2;
    boolean spill1006_3;
    int spill1006_4;
    long life4_3;
    int life6_5;
    net.minecraft.village.MerchantRecipe life7_29;
    int life7_118;
    net.minecraft.village.MerchantRecipe life8_127;
    lexical_join_128: {
    lexical_join_71: {
    lexical_join_70: {
    lexical_join_69: {
    lexical_join_68: {
    lexical_join_66: {
    lexical_join_62: {
    lexical_join_57: {
    lexical_join_49: {
    lexical_join_47: {
    lexical_join_44: {
    lexical_join_34: {
    life4_3 = (__fieldRead1006_0() ^ 27407487520149L);
    life6_5 = __integerCategory1006_2(__call1006_1());
    spill1006_0 = p2;
    if (!((life6_5 != 0))) {
        lexicalValue1006_71_0 = spill1006_0;
        break lexical_join_71;
    }
    if (!((spill1006_0 > 0))) {
        break lexical_join_70;
    }
    spill1006_1 = p2;
    if (!((life6_5 != 0))) {
        lexicalValue1006_71_0 = spill1006_1;
        break lexical_join_71;
    }
    if (!((spill1006_1 < __call1006_3(receiver)))) {
        break lexical_join_70;
    }
    life7_29 = __cast1006_5(__call1006_4(receiver, p2));
    if (!(__call1006_7(receiver, p0, __call1006_6(life7_29)))) {
        break lexical_join_66;
    }
    if (!((p1 == null))) {
        break lexical_join_34;
    }
    spill1006_2 = __call1006_8(life7_29);
    if (!((life6_5 != 0))) {
        lexicalValue1006_49_0 = __integerCategory1006_9(spill1006_2);
        break lexical_join_49;
    }
    if (!(spill1006_2)) {
        break lexical_join_47;
    }
    }
    spill1006_3 = __call1006_10(life7_29);
    if (!((life6_5 != 0))) {
        lexicalValue1006_44_0 = __integerCategory1006_11(spill1006_3);
        break lexical_join_44;
    }
    if (!(spill1006_3)) {
        break lexical_join_66;
    }
    lexicalValue1006_44_0 = __integerCategory1006_14(__call1006_13(receiver, p1, __call1006_12(life7_29)));
    }
    if (!((life6_5 != 0))) {
        lexicalValue1006_49_0 = lexicalValue1006_44_0;
        break lexical_join_49;
    }
    if (!((lexicalValue1006_44_0 != 0))) {
        break lexical_join_66;
    }
    }
    lexicalValue1006_49_0 = __fieldRead1006_15(p0);
    }
    if (!((life6_5 != 0))) {
        lexicalValue1006_57_0 = lexicalValue1006_49_0;
        break lexical_join_57;
    }
    if (!((lexicalValue1006_49_0 >= __fieldRead1006_17(__call1006_16(life7_29))))) {
        break lexical_join_66;
    }
    lexicalValue1006_57_0 = __integerCategory1006_19(__call1006_18(life7_29));
    }
    if (!((life6_5 != 0))) {
        lexicalValue1006_62_0 = lexicalValue1006_57_0;
        break lexical_join_62;
    }
    if (!((lexicalValue1006_57_0 != 0))) {
        break lexical_join_68;
    }
    lexicalValue1006_62_0 = __fieldRead1006_20(p1);
    }
    if (!((lexicalValue1006_62_0 < __fieldRead1006_22(__call1006_21(life7_29))))) {
        break lexical_join_68;
    }
    }
    lexicalValue1006_69_0 = null;
    break lexical_join_69;
    }
    lexicalValue1006_69_0 = life7_29;
    }
    return lexicalValue1006_69_0;
    }
    lexicalValue1006_71_0 = 0;
    }
    life7_118 = lexicalValue1006_71_0;
    lexical_cycle_72: while (true) {
    lexical_join_126: {
    lexical_join_125: {
    lexical_join_123: {
    lexical_join_119: {
    lexical_join_114: {
    lexical_join_106: {
    lexical_join_104: {
    lexical_join_99: {
    if (!((life7_118 < __call1006_23(receiver)))) {
        break lexical_join_128;
    }
    life8_127 = __cast1006_25(__call1006_24(receiver, life7_118));
    if (!((life6_5 != 0))) {
        break lexical_join_126;
    }
    if (!(__call1006_27(receiver, p0, __call1006_26(life8_127)))) {
        break lexical_join_125;
    }
    spill1006_4 = __fieldRead1006_28(p0);
    if (!((life6_5 != 0))) {
        lexicalValue1006_99_0 = spill1006_4;
        break lexical_join_99;
    }
    if (!((spill1006_4 >= __fieldRead1006_30(__call1006_29(life8_127))))) {
        break lexical_join_125;
    }
    lexicalValue1006_99_0 = __integerCategory1006_32(__call1006_31(life8_127));
    }
    if (!((life6_5 != 0))) {
        lexicalValue1006_106_0 = lexicalValue1006_99_0;
        break lexical_join_106;
    }
    if (!((lexicalValue1006_99_0 == 0))) {
        break lexical_join_104;
    }
    if (!((p1 != null))) {
        break lexical_join_123;
    }
    }
    lexicalValue1006_106_0 = __integerCategory1006_34(__call1006_33(life8_127));
    }
    if (!((life6_5 != 0))) {
        lexicalValue1006_114_0 = lexicalValue1006_106_0;
        break lexical_join_114;
    }
    if (!((lexicalValue1006_106_0 != 0))) {
        break lexical_join_125;
    }
    lexicalValue1006_114_0 = __integerCategory1006_37(__call1006_36(receiver, p1, __call1006_35(life8_127)));
    }
    if (!((life6_5 != 0))) {
        lexicalValue1006_119_0 = lexicalValue1006_114_0;
        break lexical_join_119;
    }
    if (!((lexicalValue1006_114_0 != 0))) {
        break lexical_join_125;
    }
    lexicalValue1006_119_0 = __fieldRead1006_38(p1);
    }
    if (!((lexicalValue1006_119_0 >= __fieldRead1006_40(__call1006_39(life8_127))))) {
        break lexical_join_125;
    }
    }
    return life8_127;
    }
    life7_118 += 1;
    }
    if (!((life6_5 == 0))) { continue lexical_cycle_72; }
    break lexical_cycle_72;
    }
    }
    return null;
}
public static void h1006_0(moom.Oo p0) throws Throwable {
    throw __call1100600_0(p0);
}
public static void h1006_1(moom.Oo p0) throws Throwable {
    throw __call1100601_0(p0);
}
public static void h1006_2(moom.Oo p0) throws Throwable {
    throw __call1100602_0(p0);
}
public static void h1006_3(moom.Oo p0) throws Throwable {
    throw __call1100603_0(p0);
}
public static void h1006_4(moom.Oo p0) throws Throwable {
    throw __call1100604_0(p0);
}
public static void h1006_5(moom.Oo p0) throws Throwable {
    throw __call1100605_0(p0);
}
public static void h1006_6(moom.Oo p0) throws Throwable {
    throw __call1100606_0(p0);
}
public static void h1006_7(moom.Oo p0) throws Throwable {
    throw __call1100607_0(p0);
}
public static void h1006_8(moom.Oo p0) throws Throwable {
    throw __call1100608_0(p0);
}
public static void h1006_9(moom.Oo p0) throws Throwable {
    throw __call1100609_0(p0);
}
public static void h1006_10(moom.Oo p0) throws Throwable {
    throw __call1100610_0(p0);
}
public static void h1006_11(moom.Oo p0) throws Throwable {
    throw __call1100611_0(p0);
}
public static void h1006_12(moom.Oo p0) throws Throwable {
    throw __call1100612_0(p0);
}
public static void h1006_13(moom.Oo p0) throws Throwable {
    throw __call1100613_0(p0);
}
public static void h1006_14(moom.Oo p0) throws Throwable {
    throw __call1100614_0(p0);
}
public static void h1006_15(moom.Oo p0) throws Throwable {
    throw __call1100615_0(p0);
}
public static void h1006_16(moom.Oo p0) throws Throwable {
    throw __call1100616_0(p0);
}
public static void h1006_17(moom.Oo p0) throws Throwable {
    throw __call1100617_0(p0);
}
public static void h1006_18(moom.Oo p0) throws Throwable {
    throw __call1100618_0(p0);
}
public static void h1006_19(moom.Oo p0) throws Throwable {
    throw __call1100619_0(p0);
}
public static void h1006_20(moom.Oo p0) throws Throwable {
    throw __call1100620_0(p0);
}
public static void h1006_21(moom.Oo p0) throws Throwable {
    throw __call1100621_0(p0);
}
public static void h1006_22(moom.Oo p0) throws Throwable {
    throw __call1100622_0(p0);
}
public static void h1006_23(moom.Oo p0) throws Throwable {
    throw __call1100623_0(p0);
}
public static void h1006_24(moom.Oo p0) throws Throwable {
    throw __call1100624_0(p0);
}
public static void h1006_25(moom.Oo p0) throws Throwable {
    throw __call1100625_0(p0);
}
public static void h1006_26(moom.Oo p0) throws Throwable {
    throw __call1100626_0(p0);
}
public static void h1006_27(moom.Oo p0) throws Throwable {
    throw __call1100627_0(p0);
}
private static native long __fieldRead1006_0() throws Throwable;
private static native boolean __call1006_1() throws Throwable;
private static native int __integerCategory1006_2(boolean value) throws Throwable;
private static native int __call1006_3(moom.OF a0) throws Throwable;
private static native java.lang.Object __call1006_4(moom.OF a0, int a1) throws Throwable;
private static native net.minecraft.village.MerchantRecipe __cast1006_5(java.lang.Object a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1006_6(net.minecraft.village.MerchantRecipe a0) throws Throwable;
private static native boolean __call1006_7(moom.OF a0, net.minecraft.item.ItemStack a1, net.minecraft.item.ItemStack a2) throws Throwable;
private static native boolean __call1006_8(net.minecraft.village.MerchantRecipe a0) throws Throwable;
private static native int __integerCategory1006_9(boolean value) throws Throwable;
private static native boolean __call1006_10(net.minecraft.village.MerchantRecipe a0) throws Throwable;
private static native int __integerCategory1006_11(boolean value) throws Throwable;
private static native net.minecraft.item.ItemStack __call1006_12(net.minecraft.village.MerchantRecipe a0) throws Throwable;
private static native boolean __call1006_13(moom.OF a0, net.minecraft.item.ItemStack a1, net.minecraft.item.ItemStack a2) throws Throwable;
private static native int __integerCategory1006_14(boolean value) throws Throwable;
private static native int __fieldRead1006_15(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1006_16(net.minecraft.village.MerchantRecipe a0) throws Throwable;
private static native int __fieldRead1006_17(net.minecraft.item.ItemStack a0) throws Throwable;
private static native boolean __call1006_18(net.minecraft.village.MerchantRecipe a0) throws Throwable;
private static native int __integerCategory1006_19(boolean value) throws Throwable;
private static native int __fieldRead1006_20(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1006_21(net.minecraft.village.MerchantRecipe a0) throws Throwable;
private static native int __fieldRead1006_22(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call1006_23(moom.OF a0) throws Throwable;
private static native java.lang.Object __call1006_24(moom.OF a0, int a1) throws Throwable;
private static native net.minecraft.village.MerchantRecipe __cast1006_25(java.lang.Object a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1006_26(net.minecraft.village.MerchantRecipe a0) throws Throwable;
private static native boolean __call1006_27(moom.OF a0, net.minecraft.item.ItemStack a1, net.minecraft.item.ItemStack a2) throws Throwable;
private static native int __fieldRead1006_28(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1006_29(net.minecraft.village.MerchantRecipe a0) throws Throwable;
private static native int __fieldRead1006_30(net.minecraft.item.ItemStack a0) throws Throwable;
private static native boolean __call1006_31(net.minecraft.village.MerchantRecipe a0) throws Throwable;
private static native int __integerCategory1006_32(boolean value) throws Throwable;
private static native boolean __call1006_33(net.minecraft.village.MerchantRecipe a0) throws Throwable;
private static native int __integerCategory1006_34(boolean value) throws Throwable;
private static native net.minecraft.item.ItemStack __call1006_35(net.minecraft.village.MerchantRecipe a0) throws Throwable;
private static native boolean __call1006_36(moom.OF a0, net.minecraft.item.ItemStack a1, net.minecraft.item.ItemStack a2) throws Throwable;
private static native int __integerCategory1006_37(boolean value) throws Throwable;
private static native int __fieldRead1006_38(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1006_39(net.minecraft.village.MerchantRecipe a0) throws Throwable;
private static native int __fieldRead1006_40(net.minecraft.item.ItemStack a0) throws Throwable;
private static native java.lang.Exception __call1100600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100604_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100605_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100606_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100607_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100608_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100609_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100610_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100611_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100612_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100613_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100614_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100615_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100616_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100617_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100618_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100619_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100620_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100621_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100622_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100623_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100624_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100625_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100626_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100627_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_641d97f8c83b214467eb(moom.OF a0, net.minecraft.item.ItemStack a1, net.minecraft.item.ItemStack a2) throws E;
private static final class __SourceHandler_641d97f8c83b214467eb {

public static boolean f1005(moom.OF receiver, net.minecraft.item.ItemStack p0, net.minecraft.item.ItemStack p1) throws Throwable {
    int forwardValue1005_14_0;
    int forwardValue1005_28_0;
    int forwardValue1005_32_0;
    int forwardValue1005_34_0;
    boolean spill1005_0;
    boolean spill1005_1;
    long life3_3;
    int life5_5;
    forward_join_34: {
    forward_join_33: {
    forward_join_32: {
    forward_join_31: {
    forward_join_28: {
    forward_join_14: {
    life3_3 = (__fieldRead1005_0() ^ 41479651827193L);
    life5_5 = __integerCategory1005_2(__call1005_1());
    spill1005_0 = __call1005_3(p0, p1);
    if (!((life5_5 == 0))) {
        forwardValue1005_14_0 = __integerCategory1005_4(spill1005_0);
        break forward_join_14;
    }
    if (!(spill1005_0)) {
        break forward_join_33;
    }
    forwardValue1005_14_0 = __integerCategory1005_6(__call1005_5(p1));
    }
    if (!((life5_5 == 0))) {
        forwardValue1005_32_0 = forwardValue1005_14_0;
        break forward_join_32;
    }
    if (!((forwardValue1005_14_0 != 0))) {
        break forward_join_31;
    }
    spill1005_1 = __call1005_7(p0);
    if (!((life5_5 == 0))) {
        forwardValue1005_28_0 = __integerCategory1005_8(spill1005_1);
        break forward_join_28;
    }
    if (!(spill1005_1)) {
        break forward_join_33;
    }
    forwardValue1005_28_0 = __integerCategory1005_12(__call1005_11(__call1005_9(p1), __call1005_10(p0), 0));
    }
    if (!((life5_5 == 0))) {
        forwardValue1005_32_0 = forwardValue1005_28_0;
        break forward_join_32;
    }
    if (!((forwardValue1005_28_0 != 0))) {
        break forward_join_33;
    }
    }
    forwardValue1005_32_0 = 1;
    }
    forwardValue1005_34_0 = forwardValue1005_32_0;
    break forward_join_34;
    }
    forwardValue1005_34_0 = 0;
    }
    return __integerCategory1005_13(forwardValue1005_34_0);
}
public static void h1005_0(moom.Oo p0) throws Throwable {
    throw __call1100500_0(p0);
}
public static void h1005_1(moom.Oo p0) throws Throwable {
    throw __call1100501_0(p0);
}
public static void h1005_2(moom.Oo p0) throws Throwable {
    throw __call1100502_0(p0);
}
public static void h1005_3(moom.Oo p0) throws Throwable {
    throw __call1100503_0(p0);
}
public static void h1005_4(moom.Oo p0) throws Throwable {
    throw __call1100504_0(p0);
}
public static void h1005_5(moom.Oo p0) throws Throwable {
    throw __call1100505_0(p0);
}
public static void h1005_6(moom.Oo p0) throws Throwable {
    throw __call1100506_0(p0);
}
private static native long __fieldRead1005_0() throws Throwable;
private static native boolean __call1005_1() throws Throwable;
private static native int __integerCategory1005_2(boolean value) throws Throwable;
private static native boolean __call1005_3(net.minecraft.item.ItemStack a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native int __integerCategory1005_4(boolean value) throws Throwable;
private static native boolean __call1005_5(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __integerCategory1005_6(boolean value) throws Throwable;
private static native boolean __call1005_7(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __integerCategory1005_8(boolean value) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call1005_9(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call1005_10(net.minecraft.item.ItemStack a0) throws Throwable;
private static native boolean __call1005_11(net.minecraft.nbt.NBTTagCompound a0, net.minecraft.nbt.NBTTagCompound a1, int a2) throws Throwable;
private static native int __integerCategory1005_12(boolean value) throws Throwable;
private static native boolean __integerCategory1005_13(int value) throws Throwable;
private static native java.lang.Exception __call1100500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100504_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100505_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100506_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_42668d38cfe4aa16b788(moom.OF a0, net.minecraft.network.PacketBuffer a1) throws E;
private static final class __SourceHandler_42668d38cfe4aa16b788 {

public static void f1008(moom.OF receiver, net.minecraft.network.PacketBuffer p0) throws Throwable {
    net.minecraft.network.PacketBuffer lexicalValue1008_44_0;
    net.minecraft.network.PacketBuffer lexicalValue1008_45_0;
    int lexicalValue1008_45_1;
    boolean spill1008_0;
    net.minecraft.network.PacketBuffer spill1008_1;
    long life2_3;
    java.util.Iterator life5_19;
    int life4_20;
    net.minecraft.village.MerchantRecipe life6_27;
    net.minecraft.item.ItemStack life7_38;
    lexical_join_71: {
    life2_3 = (__fieldRead1008_0() ^ 3019013497199L);
    __call1008_3(p0, ((byte) (__call1008_1(receiver) & __invokedynamic1008_2(8243, (774779082309102621L ^ life2_3)))));
    spill1008_0 = __call1008_4();
    life5_19 = __call1008_5(receiver);
    life4_20 = __integerCategory1008_6(spill1008_0);
    lexical_cycle_21: while (true) {
    lexical_join_69: {
    lexical_join_54: {
    lexical_join_45: {
    lexical_join_44: {
    if (!(__call1008_7(life5_19))) {
        break lexical_join_71;
    }
    life6_27 = __cast1008_9(__call1008_8(life5_19));
    __call1008_11(p0, __call1008_10(life6_27));
    __call1008_13(p0, __call1008_12(life6_27));
    life7_38 = __call1008_14(life6_27);
    spill1008_1 = p0;
    if (!((life7_38 != null))) {
        lexicalValue1008_44_0 = spill1008_1;
        break lexical_join_44;
    }
    lexicalValue1008_45_0 = spill1008_1;
    lexicalValue1008_45_1 = 1;
    break lexical_join_45;
    }
    lexicalValue1008_45_0 = lexicalValue1008_44_0;
    lexicalValue1008_45_1 = 0;
    }
    __call1008_15(lexicalValue1008_45_0, lexicalValue1008_45_1);
    if (!((life4_20 == 0))) {
        break lexical_join_69;
    }
    if (!((life7_38 != null))) {
        break lexical_join_54;
    }
    __call1008_16(p0, life7_38);
    }
    __call1008_18(p0, __call1008_17(life6_27));
    __call1008_20(p0, __call1008_19(life6_27));
    __call1008_22(p0, __call1008_21(life6_27));
    }
    if (!((life4_20 != 0))) { continue lexical_cycle_21; }
    break lexical_cycle_21;
    }
    }
    return;
}
public static void h1008_0(moom.Oo p0) throws Throwable {
    throw __call1100800_0(p0);
}
public static void h1008_1(moom.Oo p0) throws Throwable {
    throw __call1100801_0(p0);
}
public static void h1008_2(moom.Oo p0) throws Throwable {
    throw __call1100802_0(p0);
}
private static native long __fieldRead1008_0() throws Throwable;
private static native int __call1008_1(moom.OF a0) throws Throwable;
private static native int __invokedynamic1008_2(int a0, long a1) throws Throwable;
private static native ByteBuf __call1008_3(net.minecraft.network.PacketBuffer a0, byte a1) throws Throwable;
private static native boolean __call1008_4() throws Throwable;
private static native java.util.Iterator __call1008_5(moom.OF a0) throws Throwable;
private static native int __integerCategory1008_6(boolean value) throws Throwable;
private static native boolean __call1008_7(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1008_8(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.village.MerchantRecipe __cast1008_9(java.lang.Object a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1008_10(net.minecraft.village.MerchantRecipe a0) throws Throwable;
private static native void __call1008_11(net.minecraft.network.PacketBuffer a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native net.minecraft.item.ItemStack __call1008_12(net.minecraft.village.MerchantRecipe a0) throws Throwable;
private static native void __call1008_13(net.minecraft.network.PacketBuffer a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native net.minecraft.item.ItemStack __call1008_14(net.minecraft.village.MerchantRecipe a0) throws Throwable;
private static native ByteBuf __call1008_15(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native void __call1008_16(net.minecraft.network.PacketBuffer a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native boolean __call1008_17(net.minecraft.village.MerchantRecipe a0) throws Throwable;
private static native ByteBuf __call1008_18(net.minecraft.network.PacketBuffer a0, boolean a1) throws Throwable;
private static native int __call1008_19(net.minecraft.village.MerchantRecipe a0) throws Throwable;
private static native ByteBuf __call1008_20(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native int __call1008_21(net.minecraft.village.MerchantRecipe a0) throws Throwable;
private static native ByteBuf __call1008_22(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native java.lang.Exception __call1100800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100802_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.OF __sourceHandlerCall_310a27e9e8207b45e229(net.minecraft.network.PacketBuffer a0) throws E;
private static final class __SourceHandler_310a27e9e8207b45e229 {

public static moom.OF f167(net.minecraft.network.PacketBuffer p0) throws Throwable {
    net.minecraft.network.PacketBuffer lexicalValue167_38_0;
    int lexicalValue167_67_0;
    boolean spill167_0;
    net.minecraft.network.PacketBuffer spill167_1;
    int spill167_2;
    long life1_3;
    moom.OF life4_7;
    int life5_17;
    int life3_18;
    int life6_20;
    net.minecraft.item.ItemStack life7_26;
    net.minecraft.item.ItemStack life8_29;
    net.minecraft.item.ItemStack life9_31;
    int life10_48;
    int life11_51;
    int life12_54;
    net.minecraft.village.MerchantRecipe life13_63;
    lexical_join_71: {
    life1_3 = (__fieldRead167_0() ^ 13605179557371L);
    life4_7 = new moom.OF();
    spill167_0 = __call167_1();
    life5_17 = (__call167_2(p0) & __invokedynamic167_3(19751, (1394456399335957919L ^ life1_3)));
    life3_18 = __integerCategory167_4(spill167_0);
    life6_20 = 0;
    lexical_cycle_21: while (true) {
    lexical_join_67: {
    lexical_join_64: {
    lexical_join_40: {
    lexical_join_38: {
    if (!((life6_20 < life5_17))) {
        break lexical_join_71;
    }
    life7_26 = __call167_5(p0);
    life8_29 = __call167_6(p0);
    life9_31 = null;
    spill167_1 = p0;
    if (!((life3_18 != 0))) {
        lexicalValue167_38_0 = spill167_1;
        break lexical_join_38;
    }
    if (!(__call167_7(spill167_1))) {
        break lexical_join_40;
    }
    lexicalValue167_38_0 = p0;
    }
    life9_31 = __call167_8(lexicalValue167_38_0);
    }
    life10_48 = __integerCategory167_10(__call167_9(p0));
    life11_51 = __call167_11(p0);
    life12_54 = __call167_12(p0);
    life13_63 = new net.minecraft.village.MerchantRecipe(life7_26, life9_31, life8_29, life11_51, life12_54);
    spill167_2 = life10_48;
    if (!((life3_18 != 0))) {
        lexicalValue167_67_0 = spill167_2;
        break lexical_join_67;
    }
    if (!((spill167_2 != 0))) {
        break lexical_join_64;
    }
    __call167_13(life13_63);
    }
    lexicalValue167_67_0 = __integerCategory167_15(__call167_14(life4_7, life13_63));
    }
    __discardScalar167_16(lexicalValue167_67_0);
    life6_20 += 1;
    if (!((life3_18 == 0))) { continue lexical_cycle_21; }
    break lexical_cycle_21;
    }
    }
    return life4_7;
}
public static void h167_0(java.io.IOException p0) throws Throwable {
    throw __call1016700_0(p0);
}
public static void h167_1(java.io.IOException p0) throws Throwable {
    throw __call1016701_0(p0);
}
public static void h167_2(java.io.IOException p0) throws Throwable {
    throw __call1016702_0(p0);
}
public static void h167_3(java.io.IOException p0) throws Throwable {
    throw __call1016703_0(p0);
}
private static native long __fieldRead167_0() throws Throwable;
private static native boolean __call167_1() throws Throwable;
private static native byte __call167_2(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native int __invokedynamic167_3(int a0, long a1) throws Throwable;
private static native int __integerCategory167_4(boolean value) throws Throwable;
private static native net.minecraft.item.ItemStack __call167_5(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call167_6(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native boolean __call167_7(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call167_8(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native boolean __call167_9(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native int __integerCategory167_10(boolean value) throws Throwable;
private static native int __call167_11(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native int __call167_12(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __call167_13(net.minecraft.village.MerchantRecipe a0) throws Throwable;
private static native boolean __call167_14(moom.OF a0, net.minecraft.village.MerchantRecipe a1) throws Throwable;
private static native int __integerCategory167_15(boolean value) throws Throwable;
private static native void __discardScalar167_16(int a0) throws Throwable;
private static native java.lang.Exception __call1016700_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1016701_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1016702_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1016703_0(java.io.IOException a0) throws Throwable;

}


public OF(net.minecraft.nbt.NBTTagCompound p0) {
super();
    (this).a(p0);
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(-3851857663684111951L)), ((long)(-8440734715638553375L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(157297057910146L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.OF.a ^ 38232365650928L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill743_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill743_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill743_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill743_14 = new byte[8];
    (__sourceSpill743_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill743_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation743_16 = __sourceSpill743_14;
    ((javax.crypto.Cipher)(__sourceSpill743_11)).init(((int)(__sourceSpill743_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill743_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation743_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = ")Ñ|W\037]^]¿Ð¥\bc¢°x\030~b(Ï"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill743_25 = local6_life21;
        int __sourceSpill743_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill743_25)).substring(((int)(__sourceSpill743_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill743_30 = local8_life19;
        int __sourceSpill743_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill743_33 = new byte[8];
        (__sourceSpill743_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill743_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill743_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill743_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill743_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill743_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill743_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill743_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill743_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill743_34)).doFinal(((byte[])(__sourceSpill743_33)));
        (__sourceSpill743_30)[__sourceSpill743_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    b = ((long[])(local8_life19));
    c = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public net.minecraft.nbt.NBTTagCompound a() { return __sourceHandlerCall_7f0f837b694be140528b(this); }


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 13051;
      if (c[var3] == null) {
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
         long var5 = b[var3];
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
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/OF", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_237c9252515feb(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6770_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/OF"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.village.MerchantRecipe a(net.minecraft.item.ItemStack p0, net.minecraft.item.ItemStack p1, int p2) { return __sourceHandlerCall_779475c01c1f43e0e6df(this, p0, p1, p2); }


private boolean a(net.minecraft.item.ItemStack p0, net.minecraft.item.ItemStack p1) { return __sourceHandlerCall_641d97f8c83b214467eb(this, p0, p1); }


public void a__Void(net.minecraft.network.PacketBuffer p0) { __sourceHandlerCall_42668d38cfe4aa16b788(this, p0); }


public static moom.OF a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException { return __sourceHandlerCall_310a27e9e8207b45e229(p0); }


public void a(net.minecraft.nbt.NBTTagCompound p0) {
boolean spill1019_0;
    long life2_3;
    net.minecraft.nbt.NBTTagList life5_13;
    int life4_14;
    int life6_16;
    net.minecraft.nbt.NBTTagCompound life7_24;
    lexical_join_35: {
    life2_3 = (moom.OF.a ^ 79618783508550L);
    spill1019_0 = net.minecraft.village.MerchantRecipe.d();
    life5_13 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Recipes")), ((int)(__sourceIntrinsic_658b606e7852_invokedynamic1019_2(29899, (5341126713067495885L ^ life2_3)))));
    life4_14 = ((spill1019_0) ? 1 : 0);
    life6_16 = 0;
    lexical_cycle_17: while (true) {
    if (!((life6_16 < ((net.minecraft.nbt.NBTTagList)(life5_13)).a__Int()))) {
        break lexical_join_35;
    }
    life7_24 = ((net.minecraft.nbt.NBTTagList)(life5_13)).a__yw(((int)(life6_16)));
    ((moom.OF)(this)).add(((new net.minecraft.village.MerchantRecipe(life7_24))));
    life6_16 += 1;
    if (!((life4_14 != 0))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6770_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_658b606e7852_invokedynamic1019_2(int a0, long a1) throws E;

private static native int __sourceExactCall_237c9252515feb(int p0, long p1);
}
