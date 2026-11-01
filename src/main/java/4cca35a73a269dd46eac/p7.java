package moom;


public class p7 extends net.minecraft.command.CommandBase {

private static long c;

public p7() {
super();
}

private static native <E extends Throwable> boolean __sourceHandlerCall_ba6fb8c226a16f141255(moom.p7 a0, java.lang.String[] a1, int a2) throws E;
private static final class __SourceHandler_ba6fb8c226a16f141255 {

public static boolean f1099(moom.p7 receiver, java.lang.String[] p0, int p1) throws Throwable {
    int forwardValue1099_11_0;
    int forwardValue1099_13_0;
    int spill1099_0;
    long life3_3;
    int life5_5;
    forward_join_13: {
    forward_join_12: {
    forward_join_11: {
    life3_3 = (__fieldRead1099_0() ^ 63729569357206L);
    life5_5 = __integerCategory1099_2(__call1099_1());
    spill1099_0 = p1;
    if (!((life5_5 == 0))) {
        forwardValue1099_11_0 = spill1099_0;
        break forward_join_11;
    }
    if (!((spill1099_0 == 0))) {
        break forward_join_12;
    }
    forwardValue1099_11_0 = 1;
    }
    forwardValue1099_13_0 = forwardValue1099_11_0;
    break forward_join_13;
    }
    forwardValue1099_13_0 = 0;
    }
    return __integerCategory1099_3(forwardValue1099_13_0);
}
public static void h1099_0(moom.Oo p0) throws Throwable {
    throw __call1109900_0(p0);
}
private static native long __fieldRead1099_0() throws Throwable;
private static native boolean __call1099_1() throws Throwable;
private static native int __integerCategory1099_2(boolean value) throws Throwable;
private static native boolean __integerCategory1099_3(int value) throws Throwable;
private static native java.lang.Exception __call1109900_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_0d39b485945604362139(moom.p7 a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_0d39b485945604362139 {

public static java.util.List f1098(moom.p7 receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    int forwardValue1098_20_0;
    int forwardValue1098_20_1;
    int forwardValue1098_28_0;
    int forwardValue1098_28_1;
    java.lang.String[] forwardValue1098_30_0;
    java.util.List forwardValue1098_35_0;
    int spill1098_0;
    int spill1098_1;
    java.lang.String[] spill1098_2;
    long life4_3;
    int life6_5;
    forward_join_35: {
    forward_join_34: {
    forward_join_30: {
    forward_join_28: {
    forward_join_20: {
    forward_join_17: {
    life4_3 = (__fieldRead1098_0() ^ 1454917971341L);
    life6_5 = __integerCategory1098_2(__call1098_1());
    spill1098_0 = (p1).length;
    spill1098_1 = 1;
    if (!((life6_5 != 0))) {
        forwardValue1098_20_0 = spill1098_0;
        forwardValue1098_20_1 = spill1098_1;
        break forward_join_20;
    }
    if (!((spill1098_0 == spill1098_1))) {
        break forward_join_17;
    }
    forwardValue1098_35_0 = __call1098_5(p1, __call1098_4(__call1098_3()));
    break forward_join_35;
    }
    forwardValue1098_20_0 = (p1).length;
    forwardValue1098_20_1 = 1;
    }
    if (!((life6_5 != 0))) {
        forwardValue1098_28_0 = forwardValue1098_20_0;
        forwardValue1098_28_1 = forwardValue1098_20_1;
        break forward_join_28;
    }
    if (!((forwardValue1098_20_0 > forwardValue1098_20_1))) {
        break forward_join_34;
    }
    spill1098_2 = p1;
    if (!((life6_5 != 0))) {
        forwardValue1098_30_0 = spill1098_2;
        break forward_join_30;
    }
    forwardValue1098_28_0 = (spill1098_2).length;
    forwardValue1098_28_1 = 4;
    }
    if (!((forwardValue1098_28_0 <= forwardValue1098_28_1))) {
        break forward_join_34;
    }
    forwardValue1098_30_0 = p1;
    }
    forwardValue1098_35_0 = __call1098_6(forwardValue1098_30_0, 1, p2);
    break forward_join_35;
    }
    forwardValue1098_35_0 = null;
    }
    return forwardValue1098_35_0;
}
public static void h1098_0(moom.Oo p0) throws Throwable {
    throw __call1109800_0(p0);
}
public static void h1098_1(moom.Oo p0) throws Throwable {
    throw __call1109801_0(p0);
}
public static void h1098_2(moom.Oo p0) throws Throwable {
    throw __call1109802_0(p0);
}
public static void h1098_3(moom.Oo p0) throws Throwable {
    throw __call1109803_0(p0);
}
public static void h1098_4(moom.Oo p0) throws Throwable {
    throw __call1109804_0(p0);
}
private static native long __fieldRead1098_0() throws Throwable;
private static native boolean __call1098_1() throws Throwable;
private static native int __integerCategory1098_2(boolean value) throws Throwable;
private static native moom.Bl __call1098_3() throws Throwable;
private static native java.lang.String[] __call1098_4(moom.Bl a0) throws Throwable;
private static native java.util.List __call1098_5(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.util.List __call1098_6(java.lang.String[] a0, int a1, moom.DT a2) throws Throwable;
private static native java.lang.Exception __call1109800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1109801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1109802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1109803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1109804_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b3c7be76685012b2c5f4(moom.p7 a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_b3c7be76685012b2c5f4 {

public static void f1097(moom.p7 receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    int forwardValue1097_27_0;
    net.minecraft.entity.player.EntityPlayerMP forwardValue1097_36_0;
    moom.DT forwardValue1097_49_0;
    net.minecraft.command.ICommandSender forwardValue1097_60_0;
    int spill1097_0;
    int spill1097_1;
    net.minecraft.entity.player.EntityPlayerMP spill1097_2;
    long life3_3;
    int life5_5;
    net.minecraft.entity.player.EntityPlayerMP life6_49;
    moom.DT life7_64;
    forward_join_88: {
    forward_join_60: {
    forward_join_49: {
    forward_join_47: {
    forward_join_36: {
    forward_join_34: {
    forward_join_27: {
    forward_join_25: {
    life3_3 = (__fieldRead1097_0() ^ 77354188733454L);
    life5_5 = __integerCategory1097_2(__call1097_1());
    spill1097_0 = (p1).length;
    if (!((life5_5 != 0))) {
        forwardValue1097_27_0 = spill1097_0;
        break forward_join_27;
    }
    if (!((spill1097_0 > 1))) {
        break forward_join_25;
    }
    spill1097_1 = (p1).length;
    if (!((life5_5 != 0))) {
        forwardValue1097_27_0 = spill1097_1;
        break forward_join_27;
    }
    if (!((spill1097_1 < 4))) {
        break forward_join_25;
    }
    throw new moom.cc("commands.spawnpoint.usage", new java.lang.Object[0]);
    }
    forwardValue1097_27_0 = (p1).length;
    }
    if (!((forwardValue1097_27_0 > 0))) {
        break forward_join_34;
    }
    forwardValue1097_36_0 = __call1097_3(p0, (p1)[0]);
    break forward_join_36;
    }
    forwardValue1097_36_0 = __call1097_4(p0);
    }
    life6_49 = forwardValue1097_36_0;
    if (!(((p1).length > 3))) {
        break forward_join_47;
    }
    forwardValue1097_49_0 = __call1097_5(p0, p1, 1, 1);
    break forward_join_49;
    }
    forwardValue1097_49_0 = __call1097_6(life6_49);
    }
    life7_64 = forwardValue1097_49_0;
    spill1097_2 = life6_49;
    if (!((life5_5 != 0))) {
        forwardValue1097_60_0 = spill1097_2;
        break forward_join_60;
    }
    if (!((__fieldRead1097_7(spill1097_2) != null))) {
        break forward_join_88;
    }
    __call1097_8(life6_49, life7_64, 1);
    forwardValue1097_60_0 = p0;
    }
    __call1097_16(forwardValue1097_60_0, receiver, "commands.spawnpoint.success", new java.lang.Object[] {__call1097_9(life6_49), __call1097_11(__call1097_10(life7_64)), __call1097_13(__call1097_12(life7_64)), __call1097_15(__call1097_14(life7_64))});
    }
    return;
}
public static void h1097_0(moom.b7 p0) throws Throwable {
    throw __call1109700_0(p0);
}
public static void h1097_1(moom.b7 p0) throws Throwable {
    throw __call1109701_0(p0);
}
public static void h1097_2(moom.b7 p0) throws Throwable {
    throw __call1109702_0(p0);
}
public static void h1097_3(moom.b7 p0) throws Throwable {
    throw __call1109703_0(p0);
}
public static void h1097_4(moom.b7 p0) throws Throwable {
    throw __call1109704_0(p0);
}
public static void h1097_5(moom.b7 p0) throws Throwable {
    throw __call1109705_0(p0);
}
public static void h1097_6(moom.b7 p0) throws Throwable {
    throw __call1109706_0(p0);
}
public static void h1097_7(moom.b7 p0) throws Throwable {
    throw __call1109707_0(p0);
}
private static native long __fieldRead1097_0() throws Throwable;
private static native boolean __call1097_1() throws Throwable;
private static native int __integerCategory1097_2(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __call1097_3(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __call1097_4(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native moom.DT __call1097_5(net.minecraft.command.ICommandSender a0, java.lang.String[] a1, int a2, int a3) throws Throwable;
private static native moom.DT __call1097_6(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1097_7(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1097_8(net.minecraft.entity.player.EntityPlayerMP a0, moom.DT a1, int a2) throws Throwable;
private static native java.lang.String __call1097_9(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call1097_10(moom.DT a0) throws Throwable;
private static native java.lang.Integer __call1097_11(int a0) throws Throwable;
private static native int __call1097_12(moom.DT a0) throws Throwable;
private static native java.lang.Integer __call1097_13(int a0) throws Throwable;
private static native int __call1097_14(moom.DT a0) throws Throwable;
private static native java.lang.Integer __call1097_15(int a0) throws Throwable;
private static native void __call1097_16(net.minecraft.command.ICommandSender a0, moom.p7 a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call1109700_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1109701_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1109702_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1109703_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1109704_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1109705_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1109706_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1109707_0(moom.b7 a0) throws Throwable;

}


static {
moom.p7.c = (moom._c.a(-6487604062879289563L, 8072627879679655004L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(237214530427908L);
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public boolean a__Boolean(java.lang.String[] p0, int p1) { return __sourceHandlerCall_ba6fb8c226a16f141255(this, p0, p1); }


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_0d39b485945604362139(this, p0, p1, p2); }


public java.lang.String a__String() {
return "spawnpoint";
}


public int a() {
return 2;
}


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.spawnpoint.usage";
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_b3c7be76685012b2c5f4(this, p0, p1); }

}
