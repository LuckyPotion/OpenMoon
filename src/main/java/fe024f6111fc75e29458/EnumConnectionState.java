package net.minecraft.network;


public class EnumConnectionState extends sourcebuild.EnumConstructor<net.minecraft.network.EnumConnectionState> {

public static net.minecraft.network.EnumConnectionState HANDSHAKING;

public static net.minecraft.network.EnumConnectionState PLAY;

public static net.minecraft.network.EnumConnectionState STATUS;

public static net.minecraft.network.EnumConnectionState LOGIN;

private static net.minecraft.network.EnumConnectionState[] a;

private static java.util.Map<java.lang.Class<? extends moom.yK>, net.minecraft.network.EnumConnectionState> b;

private int c;

private java.util.Map<net.minecraft.network.EnumPacketDirection, com.google.common.collect.BiMap<java.lang.Integer, java.lang.Class<? extends moom.yK>>> d;

private static net.minecraft.network.EnumConnectionState[] e;

private static long f;

private EnumConnectionState(java.lang.String p0, int p1, int p2) {
super(p0, p1);
    this.d = com.google.common.collect.Maps.newEnumMap(net.minecraft.network.EnumPacketDirection.class);
    this.c = p2;
}


private static void initialize() { __sourceHandlerCall_b75dfb0afb5440731625(); }

private static native <E extends Throwable> void __sourceHandlerCall_b75dfb0afb5440731625() throws E;
private static final class __SourceHandler_b75dfb0afb5440731625 {

public static void f569() throws Throwable {
    net.minecraft.network.EnumConnectionState[] life0_44;
    int life1_47;
    int life2_49;
    net.minecraft.network.EnumConnectionState life3_56;
    int life4_59;
    java.util.Iterator life5_77;
    net.minecraft.network.EnumPacketDirection life6_84;
    java.util.Iterator life7_92;
    java.lang.Class life8_99;
    forest_join_138: {
    forest_join_128: {
    forest_join_122: {
    __fieldWrite569_4(__call569_3(__call569_2(2783111283810620981L, -3456071301566676331L, __call569_1(__call569_0())), 170906701243551L));
    __fieldWrite569_5(new moom.a8("HANDSHAKING", 0, -1));
    __fieldWrite569_6(new moom.a9("PLAY", 1, 0));
    __fieldWrite569_7(new moom.a_("STATUS", 2, 1));
    __fieldWrite569_8(new moom.ba("LOGIN", 3, 2));
    __fieldWrite569_10(__call569_9());
    __fieldWrite569_11(new net.minecraft.network.EnumConnectionState[4]);
    __fieldWrite569_13(__call569_12());
    life0_44 = __call569_14();
    life1_47 = (life0_44).length;
    life2_49 = 0;
    forest_cycle_50: while (true) {
    forest_join_120: {
    forest_join_67: {
    if (!((life2_49 < life1_47))) {
        break forest_join_138;
    }
    life3_56 = (life0_44)[life2_49];
    life4_59 = __call569_15(life3_56);
    if (!((life4_59 >= -1))) {
        break forest_join_122;
    }
    if (!((life4_59 > 2))) {
        break forest_join_67;
    }
    break forest_join_122;
    }
    (__fieldRead569_16())[(life4_59 - -1)] = life3_56;
    life5_77 = __call569_19(__call569_18(__fieldRead569_17(life3_56)));
    forest_cycle_78: while (true) {
    forest_join_119: {
    if (!(__call569_20(life5_77))) {
        break forest_join_120;
    }
    life6_84 = __cast569_22(__call569_21(life5_77));
    life7_92 = __call569_27(__call569_26(__cast569_25(__call569_24(__fieldRead569_23(life3_56), life6_84))));
    forest_cycle_93: while (true) {
    forest_join_110: {
    if (!(__call569_28(life7_92))) {
        break forest_join_119;
    }
    life8_99 = __cast569_30(__call569_29(life7_92));
    if (!(__call569_32(__fieldRead569_31(), life8_99))) {
        break forest_join_110;
    }
    if (!((__call569_34(__fieldRead569_33(), life8_99) != life3_56))) {
        break forest_join_110;
    }
    break forest_join_128;
    }
    __call569_35(life8_99);
    __call569_37(__fieldRead569_36(), life8_99, life3_56);
    continue forest_cycle_93;
    }
    }
    continue forest_cycle_78;
    }
    }
    life2_49 += 1;
    continue forest_cycle_50;
    }
    }
    throw new java.lang.Error(__invokedynamic569_38(life4_59));
    }
    throw new java.lang.Error(__invokedynamic569_41(life8_99, __call569_40(__fieldRead569_39(), life8_99), life3_56));
    }
    return;
}
public static void h569_0(java.lang.Throwable p0) throws Throwable {
    throw __call3056900_0(p0);
}
public static void h569_1(java.lang.Throwable p0) throws Throwable {
    throw __call3056901_0(p0);
}
public static void h569_2(java.lang.Throwable p0) throws Throwable {
    throw __call3056902_0(p0);
}
public static void h569_3(java.lang.Throwable p0) throws Throwable {
    throw __call3056903_0(p0);
}
public static void h569_4(java.lang.Throwable p0, java.lang.Class p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    throw new java.lang.Error(__invokedynamic3056904_0(p1, p1));
}
private static native java.lang.invoke.MethodHandles.Lookup __call569_0() throws Throwable;
private static native java.lang.Class __call569_1(java.lang.invoke.MethodHandles.Lookup a0) throws Throwable;
private static native moom._a __call569_2(long a0, long a1, java.lang.Class a2) throws Throwable;
private static native long __call569_3(moom._a a0, long a1) throws Throwable;
private static native void __fieldWrite569_4(long a0) throws Throwable;
private static native void __fieldWrite569_5(moom.a8 a0) throws Throwable;
private static native void __fieldWrite569_6(moom.a9 a0) throws Throwable;
private static native void __fieldWrite569_7(moom.a_ a0) throws Throwable;
private static native void __fieldWrite569_8(moom.ba a0) throws Throwable;
private static native net.minecraft.network.EnumConnectionState[] __call569_9() throws Throwable;
private static native void __fieldWrite569_10(net.minecraft.network.EnumConnectionState[] a0) throws Throwable;
private static native void __fieldWrite569_11(net.minecraft.network.EnumConnectionState[] a0) throws Throwable;
private static native java.util.HashMap __call569_12() throws Throwable;
private static native void __fieldWrite569_13(java.util.HashMap a0) throws Throwable;
private static native net.minecraft.network.EnumConnectionState[] __call569_14() throws Throwable;
private static native int __call569_15(net.minecraft.network.EnumConnectionState a0) throws Throwable;
private static native net.minecraft.network.EnumConnectionState[] __fieldRead569_16() throws Throwable;
private static native java.util.Map __fieldRead569_17(net.minecraft.network.EnumConnectionState a0) throws Throwable;
private static native java.util.Set __call569_18(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call569_19(java.util.Set a0) throws Throwable;
private static native boolean __call569_20(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call569_21(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.network.EnumPacketDirection __cast569_22(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead569_23(net.minecraft.network.EnumConnectionState a0) throws Throwable;
private static native java.lang.Object __call569_24(java.util.Map a0, net.minecraft.network.EnumPacketDirection a1) throws Throwable;
private static native com.google.common.collect.BiMap __cast569_25(java.lang.Object a0) throws Throwable;
private static native java.util.Set __call569_26(com.google.common.collect.BiMap a0) throws Throwable;
private static native java.util.Iterator __call569_27(java.util.Set a0) throws Throwable;
private static native boolean __call569_28(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call569_29(java.util.Iterator a0) throws Throwable;
private static native java.lang.Class __cast569_30(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead569_31() throws Throwable;
private static native boolean __call569_32(java.util.Map a0, java.lang.Class a1) throws Throwable;
private static native java.util.Map __fieldRead569_33() throws Throwable;
private static native java.lang.Object __call569_34(java.util.Map a0, java.lang.Class a1) throws Throwable;
private static native java.lang.Object __call569_35(java.lang.Class a0) throws Throwable;
private static native java.util.Map __fieldRead569_36() throws Throwable;
private static native java.lang.Object __call569_37(java.util.Map a0, java.lang.Class a1, net.minecraft.network.EnumConnectionState a2) throws Throwable;
private static native java.lang.String __invokedynamic569_38(int a0) throws Throwable;
private static native java.util.Map __fieldRead569_39() throws Throwable;
private static native java.lang.Object __call569_40(java.util.Map a0, java.lang.Class a1) throws Throwable;
private static native java.lang.String __invokedynamic569_41(java.lang.Class a0, java.lang.Object a1, net.minecraft.network.EnumConnectionState a2) throws Throwable;
private static native java.lang.Throwable __call3056900_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3056901_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3056902_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3056903_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.String __invokedynamic3056904_0(java.lang.Class a0, java.lang.Class a1) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.network.EnumConnectionState __sourceHandlerCall_0f1e9f501ba31d7f8d90(int a0) throws E;
private static final class __SourceHandler_0f1e9f501ba31d7f8d90 {

public static net.minecraft.network.EnumConnectionState f1625(int p0) throws Throwable {
    int forwardValue1625_13_0;
    int forwardValue1625_13_1;
    net.minecraft.network.EnumConnectionState forwardValue1625_21_0;
    int spill1625_0;
    int spill1625_1;
    long life1_3;
    java.lang.String life3_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_13: {
    life1_3 = (__fieldRead1625_0() ^ 17444095492359L);
    life3_5 = __call1625_1();
    spill1625_0 = p0;
    spill1625_1 = -1;
    if (!((life3_5 == null))) {
        forwardValue1625_13_0 = spill1625_0;
        forwardValue1625_13_1 = spill1625_1;
        break forward_join_13;
    }
    if (!((spill1625_0 >= spill1625_1))) {
        break forward_join_20;
    }
    forwardValue1625_13_0 = p0;
    forwardValue1625_13_1 = 2;
    }
    if (!((forwardValue1625_13_0 <= forwardValue1625_13_1))) {
        break forward_join_20;
    }
    forwardValue1625_21_0 = (__fieldRead1625_2())[(p0 - -1)];
    break forward_join_21;
    }
    forwardValue1625_21_0 = null;
    }
    return forwardValue1625_21_0;
}
public static void h1625_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1162500_0(p0);
}
public static void h1625_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1162501_0(p0);
}
public static void h1625_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1162502_0(p0);
}
private static native long __fieldRead1625_0() throws Throwable;
private static native java.lang.String __call1625_1() throws Throwable;
private static native net.minecraft.network.EnumConnectionState[] __fieldRead1625_2() throws Throwable;
private static native java.lang.Throwable __call1162500_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1162501_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1162502_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.network.EnumConnectionState __sourceHandlerCall_a3449ffaa5c17eb3d7fd(moom.yK a0) throws E;
private static final class __SourceHandler_a3449ffaa5c17eb3d7fd {

public static net.minecraft.network.EnumConnectionState f1626(moom.yK p0) throws Throwable {
    int forwardValue1626_15_0;
    java.lang.Object forwardValue1626_22_0;
    int spill1626_0;
    moom.yK spill1626_1;
    long life1_3;
    java.lang.String life3_5;
    forward_join_22: {
    forward_join_18: {
    forward_join_16: {
    forward_join_15: {
    life1_3 = (__fieldRead1626_0() ^ 132000425747564L);
    life3_5 = __call1626_1();
    spill1626_0 = __instanceOf1626_2(p0);
    if (!((life3_5 == null))) {
        forwardValue1626_15_0 = spill1626_0;
        break forward_join_15;
    }
    if (!((spill1626_0 == 0))) {
        break forward_join_16;
    }
    spill1626_1 = p0;
    if (!((life3_5 == null))) {
        forwardValue1626_22_0 = spill1626_1;
        break forward_join_22;
    }
    forwardValue1626_15_0 = __instanceOf1626_3(spill1626_1);
    }
    if (!((forwardValue1626_15_0 != 0))) {
        break forward_join_18;
    }
    }
    return __fieldRead1626_4();
    }
    forwardValue1626_22_0 = __call1626_7(__fieldRead1626_5(), __call1626_6(p0));
    }
    return __cast1626_8(forwardValue1626_22_0);
}
public static void h1626_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1162600_0(p0);
}
public static void h1626_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1162601_0(p0);
}
public static void h1626_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1162602_0(p0);
}
public static void h1626_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1162603_0(p0);
}
private static native long __fieldRead1626_0() throws Throwable;
private static native java.lang.String __call1626_1() throws Throwable;
private static native int __instanceOf1626_2(moom.yK a0) throws Throwable;
private static native int __instanceOf1626_3(moom.yK a0) throws Throwable;
private static native net.minecraft.network.EnumConnectionState __fieldRead1626_4() throws Throwable;
private static native java.util.Map __fieldRead1626_5() throws Throwable;
private static native java.lang.Class __call1626_6(moom.yK a0) throws Throwable;
private static native java.lang.Object __call1626_7(java.util.Map a0, java.lang.Class a1) throws Throwable;
private static native net.minecraft.network.EnumConnectionState __cast1626_8(java.lang.Object a0) throws Throwable;
private static native java.lang.Throwable __call1162600_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1162601_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1162602_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Throwable __call1162603_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> moom.yK __sourceHandlerCall_154b6b0fdac47aca1bc2(net.minecraft.network.EnumConnectionState a0, net.minecraft.network.EnumPacketDirection a1, int a2) throws E;
private static final class __SourceHandler_154b6b0fdac47aca1bc2 {

public static moom.yK f1627(net.minecraft.network.EnumConnectionState receiver, net.minecraft.network.EnumPacketDirection p0, int p1) throws Throwable {
    java.lang.Object forwardValue1627_24_0;
    moom.yK forwardValue1627_25_0;
    java.lang.String spill1627_0;
    java.lang.Class spill1627_1;
    long life3_3;
    java.lang.Class life6_14;
    java.lang.String life5_15;
    forward_join_25: {
    forward_join_24: {
    forward_join_22: {
    life3_3 = (__fieldRead1627_0() ^ 62772275370143L);
    spill1627_0 = __call1627_1();
    life6_14 = __cast1627_7(__call1627_6(__cast1627_4(__call1627_3(__fieldRead1627_2(receiver), p0)), __call1627_5(p1)));
    life5_15 = spill1627_0;
    spill1627_1 = life6_14;
    if (!((life5_15 == null))) {
        forwardValue1627_24_0 = spill1627_1;
        break forward_join_24;
    }
    if (!((spill1627_1 == null))) {
        break forward_join_22;
    }
    forwardValue1627_25_0 = null;
    break forward_join_25;
    }
    forwardValue1627_24_0 = __call1627_8(life6_14);
    }
    forwardValue1627_25_0 = __cast1627_9(forwardValue1627_24_0);
    }
    return forwardValue1627_25_0;
}
public static void h1627_0(java.lang.InstantiationException p0) throws Throwable {
    throw __call1162700_0(p0);
}
public static void h1627_1(java.lang.InstantiationException p0) throws Throwable {
    throw __call1162701_0(p0);
}
private static native long __fieldRead1627_0() throws Throwable;
private static native java.lang.String __call1627_1() throws Throwable;
private static native java.util.Map __fieldRead1627_2(net.minecraft.network.EnumConnectionState a0) throws Throwable;
private static native java.lang.Object __call1627_3(java.util.Map a0, net.minecraft.network.EnumPacketDirection a1) throws Throwable;
private static native com.google.common.collect.BiMap __cast1627_4(java.lang.Object a0) throws Throwable;
private static native java.lang.Integer __call1627_5(int a0) throws Throwable;
private static native java.lang.Object __call1627_6(com.google.common.collect.BiMap a0, java.lang.Integer a1) throws Throwable;
private static native java.lang.Class __cast1627_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call1627_8(java.lang.Class a0) throws Throwable;
private static native moom.yK __cast1627_9(java.lang.Object a0) throws Throwable;
private static native java.lang.Throwable __call1162700_0(java.lang.InstantiationException a0) throws Throwable;
private static native java.lang.Throwable __call1162701_0(java.lang.InstantiationException a0) throws Throwable;

}


public static net.minecraft.network.EnumConnectionState[] values() {
return ((net.minecraft.network.EnumConnectionState[])(((net.minecraft.network.EnumConnectionState[])(net.minecraft.network.EnumConnectionState.e)).clone()));
}


public static net.minecraft.network.EnumConnectionState valueOf(java.lang.String p0) {
return ((net.minecraft.network.EnumConnectionState)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.network.EnumConnectionState.class)), ((java.lang.String)(p0)))));
}


public static net.minecraft.network.EnumConnectionState a(int p0) { return __sourceHandlerCall_0f1e9f501ba31d7f8d90(p0); }


public static net.minecraft.network.EnumConnectionState a(moom.yK p0) { return __sourceHandlerCall_a3449ffaa5c17eb3d7fd(p0); }


private static net.minecraft.network.EnumConnectionState[] a__Arraya7() {
return new net.minecraft.network.EnumConnectionState[] {net.minecraft.network.EnumConnectionState.HANDSHAKING, net.minecraft.network.EnumConnectionState.PLAY, net.minecraft.network.EnumConnectionState.STATUS, net.minecraft.network.EnumConnectionState.LOGIN};
}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


protected net.minecraft.network.EnumConnectionState a(net.minecraft.network.EnumPacketDirection p0, java.lang.Class<? extends moom.yK> p1) {
long local3 = (net.minecraft.network.EnumConnectionState.f ^ 38319931799287L);
    com.google.common.collect.BiMap local5 = ((com.google.common.collect.BiMap)(((java.util.Map)(this.d)).computeIfAbsent(((java.lang.Object)(p0)), ((java.util.function.Function)(__sourceIntrinsic_3de35a262b59_invokedynamic12029_2())))));
    if (((com.google.common.collect.BiMap)(local5)).containsValue(((java.lang.Object)(p1)))) {
        java.lang.String local6 = __sourceIntrinsic_3de35a262b59_invokedynamic12029_8(p0, p1, ((com.google.common.collect.BiMap)(((com.google.common.collect.BiMap)(local5)).inverse())).get(((java.lang.Object)(p1))));
        ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger())).fatal(((java.lang.String)(local6)));
        throw new java.lang.IllegalArgumentException(local6);
    }
    ((com.google.common.collect.BiMap)(local5)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((com.google.common.collect.BiMap)(local5)).size()))))), ((java.lang.Object)(p1)));
    return this;
}


public java.lang.Integer a(net.minecraft.network.EnumPacketDirection p0, moom.yK p1) {
return ((java.lang.Integer)(((com.google.common.collect.BiMap)(((com.google.common.collect.BiMap)(((com.google.common.collect.BiMap)(((java.util.Map)(this.d)).get(((java.lang.Object)(p0))))))).inverse())).get(((java.lang.Object)(((java.lang.Object)(p1)).getClass())))));
}


public moom.yK a(net.minecraft.network.EnumPacketDirection p0, int p1) throws java.lang.InstantiationException, java.lang.IllegalAccessException { return __sourceHandlerCall_154b6b0fdac47aca1bc2(this, p0, p1); }


public int a() {
return this.c;
}


private static com.google.common.collect.BiMap lambda$registerPacket$0(net.minecraft.network.EnumPacketDirection p0) {
return com.google.common.collect.HashBiMap.create();
}


private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_3de35a262b59_invokedynamic12029_2() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3de35a262b59_invokedynamic12029_8(net.minecraft.network.EnumPacketDirection a0, java.lang.Class a1, java.lang.Object a2) throws E;
}
