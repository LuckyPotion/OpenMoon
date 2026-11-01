package moom;


public class IO {

private net.minecraft.world.storage.ISaveHandler a;

protected java.util.Map<java.lang.String, net.minecraft.world.WorldSavedData> b;

private java.util.List<net.minecraft.world.WorldSavedData> c;

private java.util.Map<java.lang.String, java.lang.Short> d;

private static long e;

public IO(net.minecraft.world.storage.ISaveHandler p0) {
super();
    this.b = com.google.common.collect.Maps.newHashMap();
    this.c = com.google.common.collect.Lists.newArrayList();
    this.d = com.google.common.collect.Maps.newHashMap();
    this.a = p0;
    (this).b();
}


static {
moom.IO.e = (moom._c.a(2019293624742218732L, -9099357018151897611L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(181444118248672L);
}

private static native <E extends Throwable> void __sourceHandlerCall_3b8bc34883f88ff709b5(moom.IO a0) throws E;
private static final class __SourceHandler_3b8bc34883f88ff709b5 {

public static void f649(moom.IO receiver) throws Throwable {
    net.minecraft.world.WorldSavedData lexicalValue649_26_0;
    java.lang.String spill649_0;
    net.minecraft.world.WorldSavedData spill649_1;
    long life1_3;
    java.util.Iterator life4_8;
    java.lang.String life3_9;
    net.minecraft.world.WorldSavedData life5_16;
    lexical_join_30: {
    life1_3 = (__fieldRead649_0() ^ 83998801918788L);
    spill649_0 = __call649_1();
    life4_8 = __call649_3(__fieldRead649_2(receiver));
    life3_9 = spill649_0;
    lexical_cycle_10: while (true) {
    lexical_join_28: {
    lexical_join_26: {
    if (!(__call649_4(life4_8))) {
        break lexical_join_30;
    }
    life5_16 = __cast649_6(__call649_5(life4_8));
    spill649_1 = life5_16;
    if (!((life3_9 != null))) {
        lexicalValue649_26_0 = spill649_1;
        break lexical_join_26;
    }
    if (!(__call649_7(spill649_1))) {
        break lexical_join_28;
    }
    __call649_8(receiver, life5_16);
    lexicalValue649_26_0 = life5_16;
    }
    __call649_9(lexicalValue649_26_0, 0);
    }
    if (!((life3_9 == null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}
public static void h649_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1064900_0(p0);
}
public static void h649_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1064901_0(p0);
}
private static native long __fieldRead649_0() throws Throwable;
private static native java.lang.String __call649_1() throws Throwable;
private static native java.util.List __fieldRead649_2(moom.IO a0) throws Throwable;
private static native java.util.Iterator __call649_3(java.util.List a0) throws Throwable;
private static native boolean __call649_4(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call649_5(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.world.WorldSavedData __cast649_6(java.lang.Object a0) throws Throwable;
private static native boolean __call649_7(net.minecraft.world.WorldSavedData a0) throws Throwable;
private static native void __call649_8(moom.IO a0, net.minecraft.world.WorldSavedData a1) throws Throwable;
private static native void __call649_9(net.minecraft.world.WorldSavedData a0, int a1) throws Throwable;
private static native java.lang.Exception __call1064900_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1064901_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.world.WorldSavedData __sourceHandlerCall_c5b3890bd27b3bffb896(moom.IO a0, java.lang.Class a1, java.lang.String a2) throws E;
private static final class __SourceHandler_c5b3890bd27b3bffb896 {

public static net.minecraft.world.WorldSavedData f285(moom.IO receiver, java.lang.Class p0, java.lang.String p1) throws Throwable {
    net.minecraft.world.storage.ISaveHandler forestValue285_23_0;
    java.io.File forestValue285_31_0;
    java.lang.Object forestValue285_50_0;
    net.minecraft.world.WorldSavedData forestValue285_83_0;
    java.lang.String spill285_0;
    net.minecraft.world.WorldSavedData spill285_1;
    net.minecraft.world.storage.ISaveHandler spill285_2;
    java.io.File spill285_3;
    java.lang.Class spill285_4;
    java.lang.Class[] spill285_5;
    java.lang.reflect.Constructor spill285_6;
    java.lang.Object[] spill285_7;
    net.minecraft.world.WorldSavedData spill285_8;
    long life3_3;
    net.minecraft.world.WorldSavedData life6_10;
    java.lang.String life5_11;
    java.io.File life7_28;
    java.io.FileInputStream life8_62;
    net.minecraft.nbt.NBTTagCompound life9_65;
    forest_join_83: {
    forest_join_82: {
    forest_join_67: {
    forest_join_50: {
    forest_join_31: {
    forest_join_23: {
    life3_3 = (__fieldRead285_0() ^ 28969525383359L);
    spill285_0 = __call285_1();
    life6_10 = __cast285_4(__call285_3(__fieldRead285_2(receiver), p1));
    life5_11 = spill285_0;
    spill285_1 = life6_10;
    if (!((life5_11 != null))) {
        forestValue285_83_0 = spill285_1;
        break forest_join_83;
    }
    if (!((spill285_1 == null))) {
        break forest_join_82;
    }
    spill285_2 = __fieldRead285_5(receiver);
    if (!((life5_11 != null))) {
        forestValue285_23_0 = spill285_2;
        break forest_join_23;
    }
    if (!((spill285_2 != null))) {
        break forest_join_67;
    }
    forestValue285_23_0 = __fieldRead285_6(receiver);
    }
    life7_28 = __call285_7(forestValue285_23_0, p1);
    spill285_3 = life7_28;
    if (!((life5_11 != null))) {
        forestValue285_31_0 = spill285_3;
        break forest_join_31;
    }
    if (!((spill285_3 != null))) {
        break forest_join_67;
    }
    forestValue285_31_0 = life7_28;
    }
    if (!((life5_11 != null))) {
        forestValue285_50_0 = forestValue285_31_0;
        break forest_join_50;
    }
    if (!(__call285_8(forestValue285_31_0))) {
        break forest_join_67;
    }
    spill285_4 = p0;
    java.lang.Class[] __stackOp285_9_0 = new java.lang.Class[1];
    spill285_5 = __stackOp285_9_0;
    (__stackOp285_9_0)[0] = __classLiteral285_10();
    spill285_6 = __call285_11(spill285_4, spill285_5);
    java.lang.Object[] __stackOp285_12_0 = new java.lang.Object[1];
    spill285_7 = __stackOp285_12_0;
    (__stackOp285_12_0)[0] = p1;
    forestValue285_50_0 = __call285_13(spill285_6, spill285_7);
    }
    life6_10 = __cast285_14(forestValue285_50_0);
    life8_62 = new java.io.FileInputStream(life7_28);
    life9_65 = __call285_15(life8_62);
    __call285_16(life8_62);
    __call285_18(life6_10, __call285_17(life9_65, "data"));
    }
    spill285_8 = life6_10;
    if (!((life5_11 != null))) {
        forestValue285_83_0 = spill285_8;
        break forest_join_83;
    }
    if (!((spill285_8 != null))) {
        break forest_join_82;
    }
    __call285_20(__fieldRead285_19(receiver), p1, life6_10);
    __call285_22(__fieldRead285_21(receiver), life6_10);
    }
    forestValue285_83_0 = life6_10;
    }
    return forestValue285_83_0;
}
public static net.minecraft.world.WorldSavedData h285_0(java.lang.Exception p0) throws Throwable {
    throw __call3028500_0(p0);
}
public static net.minecraft.world.WorldSavedData h285_1(java.lang.Exception p0) throws Throwable {
    throw __call3028501_0(p0);
}
public static net.minecraft.world.WorldSavedData h285_2(java.lang.Exception p0) throws Throwable {
    throw __call3028502_0(p0);
}
public static net.minecraft.world.WorldSavedData h285_3(java.lang.Exception p0) throws Throwable {
    throw __call3028503_0(p0);
}
public static net.minecraft.world.WorldSavedData h285_4(java.lang.Exception p0) throws Throwable {
    throw __call3028504_0(p0);
}
public static net.minecraft.world.WorldSavedData h285_5(java.lang.Exception p0, java.lang.Class p1, java.io.FileInputStream p2) throws Throwable {
    java.lang.Exception life2_2;
    life2_2 = p0;
    throw new java.lang.RuntimeException(__invokedynamic3028505_1(__call3028505_0(p1)), life2_2);
}
public static net.minecraft.world.WorldSavedData h285_6(java.lang.Exception p0, moom.IO p1, java.lang.String p2, java.lang.String p3, net.minecraft.world.WorldSavedData p4, java.io.File p5) throws Throwable {
    net.minecraft.world.WorldSavedData forestValue3028506_20_0;
    net.minecraft.world.WorldSavedData spill3028506_0;
    java.lang.Exception life5_2;
    forest_join_20: {
    forest_join_19: {
    life5_2 = p0;
    __call3028506_0(life5_2);
    spill3028506_0 = p4;
    if (!((p3 != null))) {
        forestValue3028506_20_0 = spill3028506_0;
        break forest_join_20;
    }
    if (!((spill3028506_0 != null))) {
        break forest_join_19;
    }
    __call3028506_2(__fieldRead3028506_1(p1), p2, p4);
    __call3028506_4(__fieldRead3028506_3(p1), p4);
    }
    forestValue3028506_20_0 = p4;
    }
    return forestValue3028506_20_0;
}
public static net.minecraft.world.WorldSavedData h285_7(java.lang.Exception p0) throws Throwable {
    throw __call3028507_0(p0);
}
public static net.minecraft.world.WorldSavedData h285_8(java.lang.Exception p0) throws Throwable {
    throw __call3028508_0(p0);
}
private static native long __fieldRead285_0() throws Throwable;
private static native java.lang.String __call285_1() throws Throwable;
private static native java.util.Map __fieldRead285_2(moom.IO a0) throws Throwable;
private static native java.lang.Object __call285_3(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.world.WorldSavedData __cast285_4(java.lang.Object a0) throws Throwable;
private static native net.minecraft.world.storage.ISaveHandler __fieldRead285_5(moom.IO a0) throws Throwable;
private static native net.minecraft.world.storage.ISaveHandler __fieldRead285_6(moom.IO a0) throws Throwable;
private static native java.io.File __call285_7(net.minecraft.world.storage.ISaveHandler a0, java.lang.String a1) throws Throwable;
private static native boolean __call285_8(java.io.File a0) throws Throwable;
private static native java.lang.Class __classLiteral285_10() throws Throwable;
private static native java.lang.reflect.Constructor __call285_11(java.lang.Class a0, java.lang.Class[] a1) throws Throwable;
private static native java.lang.Object __call285_13(java.lang.reflect.Constructor a0, java.lang.Object[] a1) throws Throwable;
private static native net.minecraft.world.WorldSavedData __cast285_14(java.lang.Object a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call285_15(java.io.FileInputStream a0) throws Throwable;
private static native void __call285_16(java.io.FileInputStream a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call285_17(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __call285_18(net.minecraft.world.WorldSavedData a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native java.util.Map __fieldRead285_19(moom.IO a0) throws Throwable;
private static native java.lang.Object __call285_20(java.util.Map a0, java.lang.String a1, net.minecraft.world.WorldSavedData a2) throws Throwable;
private static native java.util.List __fieldRead285_21(moom.IO a0) throws Throwable;
private static native boolean __call285_22(java.util.List a0, net.minecraft.world.WorldSavedData a1) throws Throwable;
private static native java.lang.Exception __call3028500_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3028501_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3028502_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3028503_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3028504_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __call3028505_0(java.lang.Class a0) throws Throwable;
private static native java.lang.String __invokedynamic3028505_1(java.lang.String a0) throws Throwable;
private static native void __call3028506_0(java.lang.Exception a0) throws Throwable;
private static native java.util.Map __fieldRead3028506_1(moom.IO a0) throws Throwable;
private static native java.lang.Object __call3028506_2(java.util.Map a0, java.lang.String a1, net.minecraft.world.WorldSavedData a2) throws Throwable;
private static native java.util.List __fieldRead3028506_3(moom.IO a0) throws Throwable;
private static native boolean __call3028506_4(java.util.List a0, net.minecraft.world.WorldSavedData a1) throws Throwable;
private static native java.lang.Exception __call3028507_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3028508_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_c45723dd37961c25d0c2(moom.IO a0, java.lang.String a1) throws E;
private static final class __SourceHandler_c45723dd37961c25d0c2 {

public static int f117(moom.IO receiver, java.lang.String p0) throws Throwable {
    java.lang.Short lexicalValue117_27_0;
    net.minecraft.world.storage.ISaveHandler lexicalValue117_41_0;
    java.lang.String spill117_0;
    java.lang.Short spill117_1;
    net.minecraft.world.storage.ISaveHandler spill117_2;
    long life2_3;
    java.lang.Short life5_10;
    java.lang.String life4_11;
    java.io.File life6_52;
    net.minecraft.nbt.NBTTagCompound life7_58;
    java.util.Iterator life8_63;
    java.lang.String life9_70;
    int life10_77;
    java.io.DataOutputStream life8_96;
    lexical_join_90: {
    lexical_join_77: {
    lexical_join_41: {
    lexical_join_28: {
    lexical_join_27: {
    lexical_join_21: {
    life2_3 = (__fieldRead117_0() ^ 120316354066288L);
    spill117_0 = __call117_1();
    life5_10 = __cast117_4(__call117_3(__fieldRead117_2(receiver), p0));
    life4_11 = spill117_0;
    spill117_1 = life5_10;
    if (!((life4_11 != null))) {
        lexicalValue117_27_0 = spill117_1;
        break lexical_join_27;
    }
    if (!((spill117_1 == null))) {
        break lexical_join_21;
    }
    life5_10 = __call117_5(0);
    if (!((life4_11 == null))) {
        break lexical_join_28;
    }
    }
    lexicalValue117_27_0 = __call117_7(((short) (__call117_6(life5_10) + 1)));
    }
    life5_10 = lexicalValue117_27_0;
    }
    __call117_9(__fieldRead117_8(receiver), p0, life5_10);
    spill117_2 = __fieldRead117_10(receiver);
    if (!((life4_11 != null))) {
        lexicalValue117_41_0 = spill117_2;
        break lexical_join_41;
    }
    if (!((spill117_2 != null))) {
        break lexical_join_90;
    }
    lexicalValue117_41_0 = __fieldRead117_11(receiver);
    }
    life6_52 = __call117_12(lexicalValue117_41_0, "idcounts");
    if (!((life6_52 != null))) {
        break lexical_join_90;
    }
    life7_58 = new net.minecraft.nbt.NBTTagCompound();
    life8_63 = __call117_15(__call117_14(__fieldRead117_13(receiver)));
    lexical_cycle_55: while (true) {
    if (!(__call117_16(life8_63))) {
        break lexical_join_77;
    }
    life9_70 = __cast117_18(__call117_17(life8_63));
    life10_77 = __call117_22(__cast117_21(__call117_20(__fieldRead117_19(receiver), life9_70)));
    __call117_23(life7_58, life9_70, life10_77);
    if (!((life4_11 != null))) {
        break lexical_join_90;
    }
    if (!((life4_11 == null))) { continue lexical_cycle_55; }
    break lexical_cycle_55;
    }
    }
    life8_96 = new java.io.DataOutputStream(new java.io.FileOutputStream(life6_52));
    __call117_24(life7_58, life8_96);
    __call117_25(life8_96);
    }
    return __integerCategory117_27(__call117_26(life5_10));
}
public static int h117_0(java.lang.Exception p0) throws Throwable {
    throw __call2011700_0(p0);
}
public static int h117_1(java.lang.Exception p0) throws Throwable {
    throw __call2011701_0(p0);
}
public static int h117_2(java.lang.Exception p0) throws Throwable {
    throw __call2011702_0(p0);
}
public static int h117_3(java.lang.Exception p0) throws Throwable {
    throw __call2011703_0(p0);
}
public static int h117_4(java.lang.Exception p0, java.lang.Short p1) throws Throwable {
    java.lang.Exception local2 = p0;
    __call2011704_0(local2);
    return __call2011704_1(p1);
}
private static native long __fieldRead117_0() throws Throwable;
private static native java.lang.String __call117_1() throws Throwable;
private static native java.util.Map __fieldRead117_2(moom.IO a0) throws Throwable;
private static native java.lang.Object __call117_3(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.Short __cast117_4(java.lang.Object a0) throws Throwable;
private static native java.lang.Short __call117_5(int a0) throws Throwable;
private static native short __call117_6(java.lang.Short a0) throws Throwable;
private static native java.lang.Short __call117_7(short a0) throws Throwable;
private static native java.util.Map __fieldRead117_8(moom.IO a0) throws Throwable;
private static native java.lang.Object __call117_9(java.util.Map a0, java.lang.String a1, java.lang.Short a2) throws Throwable;
private static native net.minecraft.world.storage.ISaveHandler __fieldRead117_10(moom.IO a0) throws Throwable;
private static native net.minecraft.world.storage.ISaveHandler __fieldRead117_11(moom.IO a0) throws Throwable;
private static native java.io.File __call117_12(net.minecraft.world.storage.ISaveHandler a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead117_13(moom.IO a0) throws Throwable;
private static native java.util.Set __call117_14(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call117_15(java.util.Set a0) throws Throwable;
private static native boolean __call117_16(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call117_17(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast117_18(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead117_19(moom.IO a0) throws Throwable;
private static native java.lang.Object __call117_20(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.Short __cast117_21(java.lang.Object a0) throws Throwable;
private static native short __call117_22(java.lang.Short a0) throws Throwable;
private static native void __call117_23(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native void __call117_24(net.minecraft.nbt.NBTTagCompound a0, java.io.DataOutputStream a1) throws Throwable;
private static native void __call117_25(java.io.DataOutputStream a0) throws Throwable;
private static native short __call117_26(java.lang.Short a0) throws Throwable;
private static native int __integerCategory117_27(short value) throws Throwable;
private static native java.lang.Exception __call2011700_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2011701_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2011702_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2011703_0(java.lang.Exception a0) throws Throwable;
private static native void __call2011704_0(java.lang.Exception a0) throws Throwable;
private static native short __call2011704_1(java.lang.Short a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_65d0fc3407373b9f8f40(moom.IO a0, java.lang.String a1, net.minecraft.world.WorldSavedData a2) throws E;
private static final class __SourceHandler_65d0fc3407373b9f8f40 {

public static void f67(moom.IO receiver, java.lang.String p0, net.minecraft.world.WorldSavedData p1) throws Throwable {
    int forwardValue67_31_0;
    boolean spill67_0;
    long life3_3;
    java.lang.String life5_5;
    forward_join_31: {
    forward_join_21: {
    life3_3 = (__fieldRead67_0() ^ 2574956385812L);
    life5_5 = __call67_1();
    spill67_0 = __call67_3(__fieldRead67_2(receiver), p0);
    if (!((life5_5 != null))) {
        forwardValue67_31_0 = __integerCategory67_4(spill67_0);
        break forward_join_31;
    }
    if (!(spill67_0)) {
        break forward_join_21;
    }
    __call67_8(__fieldRead67_5(receiver), __call67_7(__fieldRead67_6(receiver), p0));
    }
    __call67_10(__fieldRead67_9(receiver), p0, p1);
    forwardValue67_31_0 = __integerCategory67_13(__call67_12(__fieldRead67_11(receiver), p1));
    }
    __discardScalar67_14(forwardValue67_31_0);
    return;
}
public static void h67_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1006700_0(p0);
}
public static void h67_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1006701_0(p0);
}
private static native long __fieldRead67_0() throws Throwable;
private static native java.lang.String __call67_1() throws Throwable;
private static native java.util.Map __fieldRead67_2(moom.IO a0) throws Throwable;
private static native boolean __call67_3(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory67_4(boolean value) throws Throwable;
private static native java.util.List __fieldRead67_5(moom.IO a0) throws Throwable;
private static native java.util.Map __fieldRead67_6(moom.IO a0) throws Throwable;
private static native java.lang.Object __call67_7(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native boolean __call67_8(java.util.List a0, java.lang.Object a1) throws Throwable;
private static native java.util.Map __fieldRead67_9(moom.IO a0) throws Throwable;
private static native java.lang.Object __call67_10(java.util.Map a0, java.lang.String a1, net.minecraft.world.WorldSavedData a2) throws Throwable;
private static native java.util.List __fieldRead67_11(moom.IO a0) throws Throwable;
private static native boolean __call67_12(java.util.List a0, net.minecraft.world.WorldSavedData a1) throws Throwable;
private static native int __integerCategory67_13(boolean value) throws Throwable;
private static native void __discardScalar67_14(int a0) throws Throwable;
private static native java.lang.Exception __call1006700_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1006701_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5f240b2a3a0e29a895fa(moom.IO a0, net.minecraft.world.WorldSavedData a1) throws E;
private static final class __SourceHandler_5f240b2a3a0e29a895fa {

public static void f118(moom.IO receiver, net.minecraft.world.WorldSavedData p0) throws Throwable {
    net.minecraft.world.storage.ISaveHandler forwardValue118_13_0;
    net.minecraft.world.storage.ISaveHandler spill118_0;
    long life2_3;
    java.lang.String life4_5;
    java.io.File life5_19;
    net.minecraft.nbt.NBTTagCompound life6_25;
    net.minecraft.nbt.NBTTagCompound life7_32;
    java.io.FileOutputStream life8_41;
    forward_join_44: {
    forward_join_13: {
    life2_3 = (__fieldRead118_0() ^ 26683560652469L);
    life4_5 = __call118_1();
    spill118_0 = __fieldRead118_2(receiver);
    if (!((life4_5 != null))) {
        forwardValue118_13_0 = spill118_0;
        break forward_join_13;
    }
    if (!((spill118_0 != null))) {
        break forward_join_44;
    }
    forwardValue118_13_0 = __fieldRead118_3(receiver);
    }
    life5_19 = __call118_5(forwardValue118_13_0, __fieldRead118_4(p0));
    if (!((life5_19 != null))) {
        break forward_join_44;
    }
    life6_25 = new net.minecraft.nbt.NBTTagCompound();
    __call118_6(p0, life6_25);
    life7_32 = new net.minecraft.nbt.NBTTagCompound();
    __call118_7(life7_32, "data", life6_25);
    life8_41 = new java.io.FileOutputStream(life5_19);
    __call118_8(life7_32, life8_41);
    __call118_9(life8_41);
    }
    return;
}
public static void h118_0(java.lang.Exception p0) throws Throwable {
    throw __call2011800_0(p0);
}
public static void h118_1(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    __call2011801_0(local1);
    return;
}
private static native long __fieldRead118_0() throws Throwable;
private static native java.lang.String __call118_1() throws Throwable;
private static native net.minecraft.world.storage.ISaveHandler __fieldRead118_2(moom.IO a0) throws Throwable;
private static native net.minecraft.world.storage.ISaveHandler __fieldRead118_3(moom.IO a0) throws Throwable;
private static native java.lang.String __fieldRead118_4(net.minecraft.world.WorldSavedData a0) throws Throwable;
private static native java.io.File __call118_5(net.minecraft.world.storage.ISaveHandler a0, java.lang.String a1) throws Throwable;
private static native void __call118_6(net.minecraft.world.WorldSavedData a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native void __call118_7(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, net.minecraft.nbt.NBTTagCompound a2) throws Throwable;
private static native void __call118_8(net.minecraft.nbt.NBTTagCompound a0, java.io.FileOutputStream a1) throws Throwable;
private static native void __call118_9(java.io.FileOutputStream a0) throws Throwable;
private static native java.lang.Exception __call2011800_0(java.lang.Exception a0) throws Throwable;
private static native void __call2011801_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f3c4b747948a1f5492ac(moom.IO a0) throws E;
private static final class __SourceHandler_f3c4b747948a1f5492ac {

public static void f286(moom.IO receiver) throws Throwable {
    net.minecraft.world.storage.ISaveHandler lexicalValue286_17_0;
    java.io.File lexicalValue286_25_0;
    net.minecraft.nbt.NBTBase lexicalValue286_63_0;
    net.minecraft.world.storage.ISaveHandler spill286_0;
    java.io.File spill286_1;
    net.minecraft.nbt.NBTBase spill286_2;
    long life1_3;
    java.lang.String life3_5;
    java.io.File life4_19;
    java.io.DataInputStream life5_37;
    net.minecraft.nbt.NBTTagCompound life6_40;
    java.util.Iterator life7_46;
    java.lang.String life8_53;
    net.minecraft.nbt.NBTBase life9_57;
    moom.yu life10_76;
    int life11_79;
    lexical_join_77: {
    lexical_join_25: {
    lexical_join_17: {
    lexical_join_15: {
    life1_3 = (__fieldRead286_0() ^ 120870131295581L);
    life3_5 = __call286_1();
    __call286_3(__fieldRead286_2(receiver));
    spill286_0 = __fieldRead286_4(receiver);
    if (!((life3_5 != null))) {
        lexicalValue286_17_0 = spill286_0;
        break lexical_join_17;
    }
    if (!((spill286_0 == null))) {
        break lexical_join_15;
    }
    return;
    }
    lexicalValue286_17_0 = __fieldRead286_5(receiver);
    }
    life4_19 = __call286_6(lexicalValue286_17_0, "idcounts");
    spill286_1 = life4_19;
    if (!((life3_5 != null))) {
        lexicalValue286_25_0 = spill286_1;
        break lexical_join_25;
    }
    if (!((spill286_1 != null))) {
        break lexical_join_77;
    }
    lexicalValue286_25_0 = life4_19;
    }
    if (!(__call286_7(lexicalValue286_25_0))) {
        break lexical_join_77;
    }
    life5_37 = new java.io.DataInputStream(new java.io.FileInputStream(life4_19));
    life6_40 = __call286_8(life5_37);
    __call286_9(life5_37);
    life7_46 = __call286_11(__call286_10(life6_40));
    lexical_cycle_44: while (true) {
    lexical_join_75: {
    lexical_join_63: {
    if (!(__call286_12(life7_46))) {
        break lexical_join_77;
    }
    life8_53 = __cast286_14(__call286_13(life7_46));
    life9_57 = __call286_15(life6_40, life8_53);
    if (!((life3_5 != null))) {
        break lexical_join_77;
    }
    spill286_2 = life9_57;
    if (!((life3_5 != null))) {
        lexicalValue286_63_0 = spill286_2;
        break lexical_join_63;
    }
    if (!((__instanceOf286_16(spill286_2) != 0))) {
        break lexical_join_75;
    }
    lexicalValue286_63_0 = life9_57;
    }
    life10_76 = __cast286_17(lexicalValue286_63_0);
    life11_79 = __call286_18(life10_76);
    __call286_21(__fieldRead286_19(receiver), life8_53, __call286_20(life11_79));
    }
    if (!((life3_5 == null))) { continue lexical_cycle_44; }
    break lexical_cycle_44;
    }
    }
    return;
}
public static void h286_0(java.lang.Exception p0) throws Throwable {
    throw __call2028600_0(p0);
}
public static void h286_1(java.lang.Exception p0) throws Throwable {
    throw __call2028601_0(p0);
}
public static void h286_2(java.lang.Exception p0) throws Throwable {
    throw __call2028602_0(p0);
}
public static void h286_3(java.lang.Exception p0) throws Throwable {
    throw __call2028603_0(p0);
}
public static void h286_4(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    __call2028604_0(local1);
    return;
}
private static native long __fieldRead286_0() throws Throwable;
private static native java.lang.String __call286_1() throws Throwable;
private static native java.util.Map __fieldRead286_2(moom.IO a0) throws Throwable;
private static native void __call286_3(java.util.Map a0) throws Throwable;
private static native net.minecraft.world.storage.ISaveHandler __fieldRead286_4(moom.IO a0) throws Throwable;
private static native net.minecraft.world.storage.ISaveHandler __fieldRead286_5(moom.IO a0) throws Throwable;
private static native java.io.File __call286_6(net.minecraft.world.storage.ISaveHandler a0, java.lang.String a1) throws Throwable;
private static native boolean __call286_7(java.io.File a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call286_8(java.io.DataInputStream a0) throws Throwable;
private static native void __call286_9(java.io.DataInputStream a0) throws Throwable;
private static native java.util.Set __call286_10(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native java.util.Iterator __call286_11(java.util.Set a0) throws Throwable;
private static native boolean __call286_12(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call286_13(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast286_14(java.lang.Object a0) throws Throwable;
private static native net.minecraft.nbt.NBTBase __call286_15(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int __instanceOf286_16(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native moom.yu __cast286_17(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native short __call286_18(moom.yu a0) throws Throwable;
private static native java.util.Map __fieldRead286_19(moom.IO a0) throws Throwable;
private static native java.lang.Short __call286_20(int a0) throws Throwable;
private static native java.lang.Object __call286_21(java.util.Map a0, java.lang.String a1, java.lang.Short a2) throws Throwable;
private static native java.lang.Exception __call2028600_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2028601_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2028602_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2028603_0(java.lang.Exception a0) throws Throwable;
private static native void __call2028604_0(java.lang.Exception a0) throws Throwable;

}


private void b() { __sourceHandlerCall_f3c4b747948a1f5492ac(this); }


public int a(java.lang.String p0) { return __sourceHandlerCall_c45723dd37961c25d0c2(this, p0); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public net.minecraft.world.WorldSavedData a(java.lang.Class<? extends net.minecraft.world.WorldSavedData> p0, java.lang.String p1) { return __sourceHandlerCall_c5b3890bd27b3bffb896(this, p0, p1); }


public void a(java.lang.String p0, net.minecraft.world.WorldSavedData p1) { __sourceHandlerCall_65d0fc3407373b9f8f40(this, p0, p1); }


public void a() { __sourceHandlerCall_3b8bc34883f88ff709b5(this); }


private void a(net.minecraft.world.WorldSavedData p0) { __sourceHandlerCall_5f240b2a3a0e29a895fa(this, p0); }

}
