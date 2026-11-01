package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class qa extends net.minecraft.command.CommandBase {

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map g;

private static long[] k;

private static java.lang.Long[] l;

private static java.util.Map m;

public qa() {
super();
}

private static native <E extends Throwable> void __sourceHandlerCall_e38dd5d8dc4c5bedc637(moom.qa a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_e38dd5d8dc4c5bedc637 {

public static void f1167(moom.qa receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    int forwardValue1167_17_0;
    int forwardValue1167_41_0;
    int forwardValue1167_57_0;
    int forwardValue1167_79_0;
    int forwardValue1167_109_0;
    int forwardValue1167_117_0;
    int forwardValue1167_152_0;
    int forwardValue1167_165_0;
    int spill1167_0;
    boolean spill1167_1;
    long life3_3;
    int life5_5;
    int life6_48;
    int life6_114;
    int life6_166;
    int life6_207;
    forward_join_182: {
    forward_join_165: {
    forward_join_152: {
    forward_join_147: {
    forward_join_117: {
    forward_join_109: {
    forward_join_104: {
    forward_join_79: {
    forward_join_74: {
    forward_join_58: {
    forward_join_57: {
    forward_join_52: {
    forward_join_41: {
    forward_join_36: {
    forward_join_17: {
    life3_3 = (__fieldRead1167_0() ^ 103550407621675L);
    life5_5 = __integerCategory1167_2(__call1167_1());
    spill1167_0 = (p1).length;
    if (!((life5_5 == 0))) {
        forwardValue1167_17_0 = spill1167_0;
        break forward_join_17;
    }
    if (!((spill1167_0 > 1))) {
        break forward_join_182;
    }
    forwardValue1167_17_0 = __integerCategory1167_4(__call1167_3((p1)[0], "set"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1167_79_0 = forwardValue1167_17_0;
        break forward_join_79;
    }
    if (!((forwardValue1167_17_0 != 0))) {
        break forward_join_74;
    }
    spill1167_1 = __call1167_5((p1)[1], "day");
    if (!((life5_5 == 0))) {
        forwardValue1167_41_0 = __integerCategory1167_6(spill1167_1);
        break forward_join_41;
    }
    if (!(spill1167_1)) {
        break forward_join_36;
    }
    life6_48 = __invokedynamic1167_7(7572, (948774842820515820L ^ life3_3));
    if (!((life5_5 != 0))) {
        break forward_join_58;
    }
    }
    forwardValue1167_41_0 = __integerCategory1167_9(__call1167_8((p1)[1], "night"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1167_57_0 = forwardValue1167_41_0;
        break forward_join_57;
    }
    if (!((forwardValue1167_41_0 != 0))) {
        break forward_join_52;
    }
    life6_48 = __invokedynamic1167_10(14201, (4884916149473836288L ^ life3_3));
    if (!((life5_5 != 0))) {
        break forward_join_58;
    }
    }
    forwardValue1167_57_0 = __call1167_11((p1)[1], 0);
    }
    life6_48 = forwardValue1167_57_0;
    }
    __call1167_12(receiver, p0, life6_48);
    __call1167_14(p0, receiver, "commands.time.set", new java.lang.Object[] {__call1167_13(life6_48)});
    return;
    }
    forwardValue1167_79_0 = __integerCategory1167_16(__call1167_15((p1)[0], "add"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1167_109_0 = forwardValue1167_79_0;
        break forward_join_109;
    }
    if (!((forwardValue1167_79_0 != 0))) {
        break forward_join_104;
    }
    life6_114 = __call1167_17((p1)[1], 0);
    __call1167_18(receiver, p0, life6_114);
    __call1167_20(p0, receiver, "commands.time.added", new java.lang.Object[] {__call1167_19(life6_114)});
    return;
    }
    forwardValue1167_109_0 = __integerCategory1167_22(__call1167_21((p1)[0], "query"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1167_117_0 = forwardValue1167_109_0;
        break forward_join_117;
    }
    if (!((forwardValue1167_109_0 != 0))) {
        break forward_join_182;
    }
    forwardValue1167_117_0 = __integerCategory1167_24(__call1167_23((p1)[1], "daytime"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1167_152_0 = forwardValue1167_117_0;
        break forward_join_152;
    }
    if (!((forwardValue1167_117_0 != 0))) {
        break forward_join_147;
    }
    life6_166 = ((int) (__call1167_26(__call1167_25(p0)) % __invokedynamic1167_27(19050, (6914168947832617587L ^ life3_3))));
    __call1167_29(p0, __fieldRead1167_28(), life6_166);
    __call1167_31(p0, receiver, "commands.time.query", new java.lang.Object[] {__call1167_30(life6_166)});
    return;
    }
    forwardValue1167_152_0 = __integerCategory1167_33(__call1167_32((p1)[1], "gametime"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1167_165_0 = forwardValue1167_152_0;
        break forward_join_165;
    }
    if (!((forwardValue1167_152_0 != 0))) {
        break forward_join_182;
    }
    forwardValue1167_165_0 = ((int) (__call1167_35(__call1167_34(p0)) % __invokedynamic1167_36(14439, (2667721430375762047L ^ life3_3))));
    }
    life6_207 = forwardValue1167_165_0;
    __call1167_38(p0, __fieldRead1167_37(), life6_207);
    __call1167_40(p0, receiver, "commands.time.query", new java.lang.Object[] {__call1167_39(life6_207)});
    return;
    }
    throw new moom.cc("commands.time.usage", new java.lang.Object[0]);
}
public static void h1167_0(moom.b7 p0) throws Throwable {
    throw __call1116700_0(p0);
}
public static void h1167_1(moom.b7 p0) throws Throwable {
    throw __call1116701_0(p0);
}
public static void h1167_2(moom.b7 p0) throws Throwable {
    throw __call1116702_0(p0);
}
public static void h1167_3(moom.b7 p0) throws Throwable {
    throw __call1116703_0(p0);
}
public static void h1167_4(moom.b7 p0) throws Throwable {
    throw __call1116704_0(p0);
}
public static void h1167_5(moom.b7 p0) throws Throwable {
    throw __call1116705_0(p0);
}
public static void h1167_6(moom.b7 p0) throws Throwable {
    throw __call1116706_0(p0);
}
public static void h1167_7(moom.b7 p0) throws Throwable {
    throw __call1116707_0(p0);
}
public static void h1167_8(moom.b7 p0) throws Throwable {
    throw __call1116708_0(p0);
}
public static void h1167_9(moom.b7 p0) throws Throwable {
    throw __call1116709_0(p0);
}
public static void h1167_10(moom.b7 p0) throws Throwable {
    throw __call1116710_0(p0);
}
public static void h1167_11(moom.b7 p0) throws Throwable {
    throw __call1116711_0(p0);
}
public static void h1167_12(moom.b7 p0) throws Throwable {
    throw __call1116712_0(p0);
}
public static void h1167_13(moom.b7 p0) throws Throwable {
    throw __call1116713_0(p0);
}
private static native long __fieldRead1167_0() throws Throwable;
private static native boolean __call1167_1() throws Throwable;
private static native int __integerCategory1167_2(boolean value) throws Throwable;
private static native boolean __call1167_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1167_4(boolean value) throws Throwable;
private static native boolean __call1167_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1167_6(boolean value) throws Throwable;
private static native int __invokedynamic1167_7(int a0, long a1) throws Throwable;
private static native boolean __call1167_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1167_9(boolean value) throws Throwable;
private static native int __invokedynamic1167_10(int a0, long a1) throws Throwable;
private static native int __call1167_11(java.lang.String a0, int a1) throws Throwable;
private static native void __call1167_12(moom.qa a0, net.minecraft.command.ICommandSender a1, int a2) throws Throwable;
private static native java.lang.Integer __call1167_13(int a0) throws Throwable;
private static native void __call1167_14(net.minecraft.command.ICommandSender a0, moom.qa a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native boolean __call1167_15(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1167_16(boolean value) throws Throwable;
private static native int __call1167_17(java.lang.String a0, int a1) throws Throwable;
private static native void __call1167_18(moom.qa a0, net.minecraft.command.ICommandSender a1, int a2) throws Throwable;
private static native java.lang.Integer __call1167_19(int a0) throws Throwable;
private static native void __call1167_20(net.minecraft.command.ICommandSender a0, moom.qa a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native boolean __call1167_21(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1167_22(boolean value) throws Throwable;
private static native boolean __call1167_23(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1167_24(boolean value) throws Throwable;
private static native net.minecraft.world.World __call1167_25(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native long __call1167_26(net.minecraft.world.World a0) throws Throwable;
private static native long __invokedynamic1167_27(int a0, long a1) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead1167_28() throws Throwable;
private static native void __call1167_29(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native java.lang.Integer __call1167_30(int a0) throws Throwable;
private static native void __call1167_31(net.minecraft.command.ICommandSender a0, moom.qa a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native boolean __call1167_32(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1167_33(boolean value) throws Throwable;
private static native net.minecraft.world.World __call1167_34(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native long __call1167_35(net.minecraft.world.World a0) throws Throwable;
private static native long __invokedynamic1167_36(int a0, long a1) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead1167_37() throws Throwable;
private static native void __call1167_38(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native java.lang.Integer __call1167_39(int a0) throws Throwable;
private static native void __call1167_40(net.minecraft.command.ICommandSender a0, moom.qa a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call1116700_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1116701_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1116702_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1116703_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1116704_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1116705_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1116706_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1116707_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1116708_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1116709_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1116710_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1116711_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1116712_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1116713_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_6c14174686577b0a9c4b(moom.qa a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_6c14174686577b0a9c4b {

public static java.util.List f186(moom.qa receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    int forwardValue186_32_0;
    int forwardValue186_32_1;
    int forwardValue186_58_0;
    int forwardValue186_61_0;
    int forwardValue186_61_1;
    int forwardValue186_69_0;
    java.lang.String[] forwardValue186_72_0;
    int forwardValue186_72_1;
    java.util.List forwardValue186_84_0;
    int spill186_0;
    int spill186_1;
    java.lang.String[] spill186_2;
    java.lang.String[] spill186_3;
    java.lang.String[] spill186_4;
    java.lang.String[] spill186_5;
    boolean spill186_6;
    java.lang.String[] spill186_7;
    java.lang.String[] spill186_8;
    java.lang.String[] spill186_9;
    java.lang.String[] spill186_10;
    int spill186_11;
    java.lang.String[] spill186_12;
    java.lang.String[] spill186_13;
    long life4_3;
    int life6_5;
    forward_join_84: {
    forward_join_83: {
    forward_join_72: {
    forward_join_69: {
    forward_join_61: {
    forward_join_58: {
    forward_join_56: {
    forward_join_32: {
    forward_join_29: {
    life4_3 = (__fieldRead186_0() ^ 27648422948264L);
    life6_5 = __integerCategory186_2(__call186_1());
    spill186_0 = (p1).length;
    spill186_1 = 1;
    if (!((life6_5 != 0))) {
        forwardValue186_32_0 = spill186_0;
        forwardValue186_32_1 = spill186_1;
        break forward_join_32;
    }
    if (!((spill186_0 == spill186_1))) {
        break forward_join_29;
    }
    spill186_2 = p1;
    java.lang.String[] __stackOp186_3_0 = new java.lang.String[3];
    spill186_3 = __stackOp186_3_0;
    (__stackOp186_3_0)[0] = "set";
    java.lang.String[] __stackOp186_4_0 = spill186_3;
    spill186_4 = __stackOp186_4_0;
    (__stackOp186_4_0)[1] = "add";
    java.lang.String[] __stackOp186_5_0 = spill186_4;
    spill186_5 = __stackOp186_5_0;
    (__stackOp186_5_0)[2] = "query";
    forwardValue186_84_0 = __call186_6(spill186_2, spill186_5);
    break forward_join_84;
    }
    forwardValue186_32_0 = (p1).length;
    forwardValue186_32_1 = 2;
    }
    if (!((life6_5 != 0))) {
        forwardValue186_61_0 = forwardValue186_32_0;
        forwardValue186_61_1 = forwardValue186_32_1;
        break forward_join_61;
    }
    if (!((forwardValue186_32_0 == forwardValue186_32_1))) {
        break forward_join_56;
    }
    spill186_6 = __call186_7((p1)[0], "set");
    if (!((life6_5 != 0))) {
        forwardValue186_58_0 = __integerCategory186_8(spill186_6);
        break forward_join_58;
    }
    if (!(spill186_6)) {
        break forward_join_56;
    }
    spill186_7 = p1;
    java.lang.String[] __stackOp186_9_0 = new java.lang.String[2];
    spill186_8 = __stackOp186_9_0;
    (__stackOp186_9_0)[0] = "day";
    java.lang.String[] __stackOp186_10_0 = spill186_8;
    spill186_9 = __stackOp186_10_0;
    (__stackOp186_10_0)[1] = "night";
    forwardValue186_84_0 = __call186_11(spill186_7, spill186_9);
    break forward_join_84;
    }
    forwardValue186_58_0 = (p1).length;
    }
    if (!((life6_5 != 0))) {
        forwardValue186_69_0 = forwardValue186_58_0;
        break forward_join_69;
    }
    forwardValue186_61_0 = forwardValue186_58_0;
    forwardValue186_61_1 = 2;
    }
    if (!((forwardValue186_61_0 == forwardValue186_61_1))) {
        break forward_join_83;
    }
    spill186_10 = p1;
    spill186_11 = 0;
    if (!((life6_5 != 0))) {
        forwardValue186_72_0 = spill186_10;
        forwardValue186_72_1 = spill186_11;
        break forward_join_72;
    }
    forwardValue186_69_0 = __integerCategory186_13(__call186_12((spill186_10)[spill186_11], "query"));
    }
    if (!((forwardValue186_69_0 != 0))) {
        break forward_join_83;
    }
    forwardValue186_72_0 = p1;
    forwardValue186_72_1 = 2;
    }
    java.lang.String[] __stackOp186_14_0 = new java.lang.String[forwardValue186_72_1];
    spill186_12 = __stackOp186_14_0;
    (__stackOp186_14_0)[0] = "daytime";
    java.lang.String[] __stackOp186_15_0 = spill186_12;
    spill186_13 = __stackOp186_15_0;
    (__stackOp186_15_0)[1] = "gametime";
    forwardValue186_84_0 = __call186_16(forwardValue186_72_0, spill186_13);
    break forward_join_84;
    }
    forwardValue186_84_0 = null;
    }
    return forwardValue186_84_0;
}
public static void h186_0(moom.Oo p0) throws Throwable {
    throw __call1018600_0(p0);
}
public static void h186_1(moom.Oo p0) throws Throwable {
    throw __call1018601_0(p0);
}
public static void h186_2(moom.Oo p0) throws Throwable {
    throw __call1018602_0(p0);
}
public static void h186_3(moom.Oo p0) throws Throwable {
    throw __call1018603_0(p0);
}
public static void h186_4(moom.Oo p0) throws Throwable {
    throw __call1018604_0(p0);
}
public static void h186_5(moom.Oo p0) throws Throwable {
    throw __call1018605_0(p0);
}
public static void h186_6(moom.Oo p0) throws Throwable {
    throw __call1018606_0(p0);
}
public static void h186_7(moom.Oo p0) throws Throwable {
    throw __call1018607_0(p0);
}
public static void h186_8(moom.Oo p0) throws Throwable {
    throw __call1018608_0(p0);
}
public static void h186_9(moom.Oo p0) throws Throwable {
    throw __call1018609_0(p0);
}
private static native long __fieldRead186_0() throws Throwable;
private static native boolean __call186_1() throws Throwable;
private static native int __integerCategory186_2(boolean value) throws Throwable;
private static native java.util.List __call186_6(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native boolean __call186_7(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory186_8(boolean value) throws Throwable;
private static native java.util.List __call186_11(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native boolean __call186_12(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory186_13(boolean value) throws Throwable;
private static native java.util.List __call186_16(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.Exception __call1018600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018604_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018605_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018606_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018607_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018608_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018609_0(moom.Oo a0) throws Throwable;

}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(3767991113414485838L)), ((long)(-5770909311687477239L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(60441658978503L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.qa.c ^ 45293989265363L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill977_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill977_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill977_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill977_14 = new byte[8];
    (__sourceSpill977_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill977_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation977_16 = __sourceSpill977_14;
    ((javax.crypto.Cipher)(__sourceSpill977_11)).init(((int)(__sourceSpill977_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill977_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation977_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life19 = new long[2];
    int local16_life20 = 0;
    java.lang.String local17_life21;
    int local18_life23 = ((java.lang.String)((local17_life21 = "lC»\024¹y¼¦¡â¸v\025àC"))).length();
    int local15_life24 = 0;
    do {
        java.lang.String __sourceSpill977_25 = local17_life21;
        int __sourceSpill977_26 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill977_25)).substring(((int)(__sourceSpill977_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill977_30 = local19_life19;
        int __sourceSpill977_31 = local16_life20;
        local16_life20 += 1;
        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));
        byte[] __sourceSpill977_33 = new byte[8];
        (__sourceSpill977_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));
        (__sourceSpill977_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));
        (__sourceSpill977_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));
        (__sourceSpill977_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));
        (__sourceSpill977_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));
        (__sourceSpill977_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));
        (__sourceSpill977_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));
        (__sourceSpill977_33)[7] = ((byte) ((int) local21_life32));
        javax.crypto.Cipher __sourceSpill977_34 = local13_life9;
        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill977_34)).doFinal(((byte[])(__sourceSpill977_33)));
        (__sourceSpill977_30)[__sourceSpill977_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    d = ((long[])(local19_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[2]));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life41;
    javax.crypto.Cipher __sourceSpill977_43 = (local0_life41 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill977_44 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill977_45 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill977_46 = new byte[8];
    (__sourceSpill977_46)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life47 = 1;
    while ((local1_life47 < 8)) {
        (__sourceSpill977_46)[local1_life47] = ((byte) ((int) ((local11_life7 << (local1_life47 * 8)) >>> 56)));
        local1_life47 += 1;
    }
    byte[] __sourcePreallocation977_48 = __sourceSpill977_46;
    ((javax.crypto.Cipher)(__sourceSpill977_43)).init(((int)(__sourceSpill977_44)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill977_45)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation977_48)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life51 = new long[2];
    int local3_life52 = 0;
    java.lang.String local4_life53;
    int local5_life55 = ((java.lang.String)((local4_life53 = "9ÈÏ\022Õ®dawïéæh\b"))).length();
    int local2_life56 = 0;
    do {
        java.lang.String __sourceSpill977_57 = local4_life53;
        int __sourceSpill977_58 = local2_life56;
        local2_life56 += 8;
        byte[] local7_life61 = ((java.lang.String)(((java.lang.String)(__sourceSpill977_57)).substring(((int)(__sourceSpill977_58)), ((int)(local2_life56))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill977_62 = local6_life51;
        int __sourceSpill977_63 = local3_life52;
        local3_life52 += 1;
        long local8_life64 = (((((((((((long) (local7_life61)[0]) & 255L) << 56) | ((((long) (local7_life61)[1]) & 255L) << 48)) | ((((long) (local7_life61)[2]) & 255L) << 40)) | ((((long) (local7_life61)[3]) & 255L) << 32)) | ((((long) (local7_life61)[4]) & 255L) << 24)) | ((((long) (local7_life61)[5]) & 255L) << 16)) | ((((long) (local7_life61)[6]) & 255L) << 8)) | (((long) (local7_life61)[7]) & 255L));
        byte[] __sourceSpill977_65 = new byte[8];
        (__sourceSpill977_65)[0] = ((byte) ((int) (local8_life64 >>> 56)));
        (__sourceSpill977_65)[1] = ((byte) ((int) (local8_life64 >>> 48)));
        (__sourceSpill977_65)[2] = ((byte) ((int) (local8_life64 >>> 40)));
        (__sourceSpill977_65)[3] = ((byte) ((int) (local8_life64 >>> 32)));
        (__sourceSpill977_65)[4] = ((byte) ((int) (local8_life64 >>> 24)));
        (__sourceSpill977_65)[5] = ((byte) ((int) (local8_life64 >>> 16)));
        (__sourceSpill977_65)[6] = ((byte) ((int) (local8_life64 >>> 8)));
        (__sourceSpill977_65)[7] = ((byte) ((int) local8_life64));
        javax.crypto.Cipher __sourceSpill977_66 = local0_life41;
        byte[] local10_life68 = ((javax.crypto.Cipher)(__sourceSpill977_66)).doFinal(((byte[])(__sourceSpill977_65)));
        (__sourceSpill977_62)[__sourceSpill977_63] = (((((((((((long) (local10_life68)[0]) & 255L) << 56) | ((((long) (local10_life68)[1]) & 255L) << 48)) | ((((long) (local10_life68)[2]) & 255L) << 40)) | ((((long) (local10_life68)[3]) & 255L) << 32)) | ((((long) (local10_life68)[4]) & 255L) << 24)) | ((((long) (local10_life68)[5]) & 255L) << 16)) | ((((long) (local10_life68)[6]) & 255L) << 8)) | (((long) (local10_life68)[7]) & 255L));
    } while ((!(local2_life56 >= local5_life55)));
    k = ((long[])(local6_life51));
    l = ((java.lang.Long[])(new java.lang.Long[2]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_c8bf4d73e8a831(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected void b(net.minecraft.command.ICommandSender p0, int p1) {
boolean spill1282_0;
    long life3_3;
    int life6_6;
    int life5_7;
    net.minecraft.world.WorldServer life7_17;
    lexical_join_28: {
    life3_3 = (moom.qa.c ^ 51421858002741L);
    spill1282_0 = moom.b7.c();
    life6_6 = 0;
    life5_7 = ((spill1282_0) ? 1 : 0);
    lexical_cycle_8: while (true) {
    if (!((life6_6 < (((moom.Bl)(moom.Bl.a__Bl())).n).length))) {
        break lexical_join_28;
    }
    life7_17 = (((moom.Bl)(moom.Bl.a__Bl())).n)[life6_6];
    ((net.minecraft.world.WorldServer)(life7_17)).b(((long)((((net.minecraft.world.WorldServer)(life7_17)).c__Long() + ((long) p1)))));
    life6_6 += 1;
    if (!((life5_7 == 0))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 16647;
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
            throw new RuntimeException("moom/qa", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8821_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/qa"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral8822_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/qa"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.qa.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static long c(int p0, long p1) {
int life3_8;
    byte[] life4_77;
    long life5_81;
    byte[] life7_146;
    java.lang.Long life8_150;
    java.lang.Object[] life9_155;
    javax.crypto.spec.DESKeySpec life11_188;
    javax.crypto.SecretKey life12_195;
    javax.crypto.Cipher life13_200;
    byte[] life10_212;
    long life11_290;
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 15206);
    if (((moom.qa.l)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.qa.k)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.qa.m)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.qa.m)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/qa", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.qa.l)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.qa.l)[life3_8])).longValue();
}


public int a() {
return 2;
}


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.time.usage";
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_e38dd5d8dc4c5bedc637(this, p0, p1); }


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_6c14174686577b0a9c4b(this, p0, p1, p2); }


protected void a(net.minecraft.command.ICommandSender p0, int p1) {
boolean spill1281_0;
    long life3_3;
    int life6_6;
    int life5_7;
    lexical_join_23: {
    life3_3 = (moom.qa.c ^ 19925839226686L);
    spill1281_0 = moom.b7.b();
    life6_6 = 0;
    life5_7 = ((spill1281_0) ? 1 : 0);
    lexical_cycle_8: while (true) {
    if (!((life6_6 < (((moom.Bl)(moom.Bl.a__Bl())).n).length))) {
        break lexical_join_23;
    }
    ((net.minecraft.world.WorldServer)((((moom.Bl)(moom.Bl.a__Bl())).n)[life6_6])).b(((long)(((long) p1))));
    life6_6 += 1;
    if (!((life5_7 != 0))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


public java.lang.String a__String() {
return "time";
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8821_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral8822_0() throws E;

private static native int __sourceExactCall_c8bf4d73e8a831(int p0, long p1);
}
