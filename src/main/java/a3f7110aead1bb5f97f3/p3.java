package moom;


public class p3 extends net.minecraft.command.CommandBase {

private static long c;

public p3() {
super();
}

private static native <E extends Throwable> boolean __sourceHandlerCall_c9ebc42ff80ceac386ea(moom.p3 a0, java.lang.String[] a1, int a2) throws E;
private static final class __SourceHandler_c9ebc42ff80ceac386ea {

public static boolean f1094(moom.p3 receiver, java.lang.String[] p0, int p1) throws Throwable {
    int forwardValue1094_12_0;
    int forwardValue1094_14_0;
    int spill1094_0;
    long life3_3;
    int life5_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life3_3 = (__fieldRead1094_0() ^ 46280811726262L);
    life5_5 = __integerCategory1094_2(__call1094_1());
    spill1094_0 = p1;
    if (!((life5_5 != 0))) {
        forwardValue1094_12_0 = spill1094_0;
        break forward_join_12;
    }
    if (!((spill1094_0 == 1))) {
        break forward_join_13;
    }
    forwardValue1094_12_0 = 1;
    }
    forwardValue1094_14_0 = forwardValue1094_12_0;
    break forward_join_14;
    }
    forwardValue1094_14_0 = 0;
    }
    return __integerCategory1094_3(forwardValue1094_14_0);
}
public static void h1094_0(moom.Oo p0) throws Throwable {
    throw __call1109400_0(p0);
}
public static void h1094_1(moom.Oo p0) throws Throwable {
    throw __call1109401_0(p0);
}
private static native long __fieldRead1094_0() throws Throwable;
private static native boolean __call1094_1() throws Throwable;
private static native int __integerCategory1094_2(boolean value) throws Throwable;
private static native boolean __integerCategory1094_3(int value) throws Throwable;
private static native java.lang.Exception __call1109400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1109401_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_847d183b75ff9ccd281c(moom.p3 a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_847d183b75ff9ccd281c {

public static java.util.List f1093(moom.p3 receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    int forwardValue1093_20_0;
    int forwardValue1093_20_1;
    int forwardValue1093_28_0;
    int forwardValue1093_28_1;
    java.lang.String[] forwardValue1093_30_0;
    java.util.List forwardValue1093_35_0;
    int spill1093_0;
    int spill1093_1;
    java.lang.String[] spill1093_2;
    long life4_3;
    int life6_5;
    forward_join_35: {
    forward_join_34: {
    forward_join_30: {
    forward_join_28: {
    forward_join_20: {
    forward_join_17: {
    life4_3 = (__fieldRead1093_0() ^ 20560459232685L);
    life6_5 = __integerCategory1093_2(__call1093_1());
    spill1093_0 = (p1).length;
    spill1093_1 = 2;
    if (!((life6_5 == 0))) {
        forwardValue1093_20_0 = spill1093_0;
        forwardValue1093_20_1 = spill1093_1;
        break forward_join_20;
    }
    if (!((spill1093_0 == spill1093_1))) {
        break forward_join_17;
    }
    forwardValue1093_35_0 = __call1093_5(p1, __call1093_4(__call1093_3()));
    break forward_join_35;
    }
    forwardValue1093_20_0 = (p1).length;
    forwardValue1093_20_1 = 2;
    }
    if (!((life6_5 == 0))) {
        forwardValue1093_28_0 = forwardValue1093_20_0;
        forwardValue1093_28_1 = forwardValue1093_20_1;
        break forward_join_28;
    }
    if (!((forwardValue1093_20_0 > forwardValue1093_20_1))) {
        break forward_join_34;
    }
    spill1093_2 = p1;
    if (!((life6_5 == 0))) {
        forwardValue1093_30_0 = spill1093_2;
        break forward_join_30;
    }
    forwardValue1093_28_0 = (spill1093_2).length;
    forwardValue1093_28_1 = 5;
    }
    if (!((forwardValue1093_28_0 <= forwardValue1093_28_1))) {
        break forward_join_34;
    }
    forwardValue1093_30_0 = p1;
    }
    forwardValue1093_35_0 = __call1093_6(forwardValue1093_30_0, 2, p2);
    break forward_join_35;
    }
    forwardValue1093_35_0 = null;
    }
    return forwardValue1093_35_0;
}
public static void h1093_0(moom.Oo p0) throws Throwable {
    throw __call1109300_0(p0);
}
public static void h1093_1(moom.Oo p0) throws Throwable {
    throw __call1109301_0(p0);
}
public static void h1093_2(moom.Oo p0) throws Throwable {
    throw __call1109302_0(p0);
}
public static void h1093_3(moom.Oo p0) throws Throwable {
    throw __call1109303_0(p0);
}
public static void h1093_4(moom.Oo p0) throws Throwable {
    throw __call1109304_0(p0);
}
private static native long __fieldRead1093_0() throws Throwable;
private static native boolean __call1093_1() throws Throwable;
private static native int __integerCategory1093_2(boolean value) throws Throwable;
private static native moom.Bl __call1093_3() throws Throwable;
private static native java.lang.String[] __call1093_4(moom.Bl a0) throws Throwable;
private static native java.util.List __call1093_5(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.util.List __call1093_6(java.lang.String[] a0, int a1, moom.DT a2) throws Throwable;
private static native java.lang.Exception __call1109300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1109301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1109302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1109303_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1109304_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c0f537b3954b16427913(moom.p3 a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_c0f537b3954b16427913 {

public static void f1092(moom.p3 receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    int forwardValue1092_22_0;
    java.lang.String[] forwardValue1092_94_0;
    java.lang.String[] forwardValue1092_110_0;
    int forwardValue1092_137_0;
    double forwardValue1092_140_0;
    double forwardValue1092_140_1;
    double forwardValue1092_143_0;
    double forwardValue1092_177_0;
    double forwardValue1092_177_1;
    double forwardValue1092_236_0;
    int spill1092_0;
    java.lang.String[] spill1092_1;
    java.lang.String[] spill1092_2;
    int spill1092_3;
    double spill1092_4;
    double spill1092_5;
    double spill1092_6;
    double spill1092_7;
    double spill1092_8;
    long life3_3;
    int life5_5;
    int life6_27;
    java.lang.String life7_32;
    net.minecraft.entity.player.EntityPlayerMP life8_39;
    moom.DR life9_42;
    double life10_45;
    double life12_60;
    double life14_77;
    double life16_91;
    double life18_113;
    double life20_135;
    double life22_169;
    double life24_175;
    double life26_215;
    double life28_220;
    double life30_225;
    double life32_238;
    forward_join_266: {
    forward_join_237: {
    forward_join_236: {
    forward_join_235: {
    forward_join_177: {
    forward_join_174: {
    forward_join_143: {
    forward_join_142: {
    forward_join_140: {
    forward_join_137: {
    forward_join_132: {
    forward_join_117: {
    forward_join_110: {
    forward_join_101: {
    forward_join_94: {
    forward_join_85: {
    forward_join_70: {
    forward_join_53: {
    forward_join_22: {
    forward_join_21: {
    life3_3 = (__fieldRead1092_0() ^ 94265035252782L);
    life5_5 = __integerCategory1092_2(__call1092_1());
    spill1092_0 = (p1).length;
    if (!((life5_5 != 0))) {
        forwardValue1092_22_0 = spill1092_0;
        break forward_join_22;
    }
    if (!((spill1092_0 < 2))) {
        break forward_join_21;
    }
    throw new moom.cc(__call1092_3(receiver, p0), new java.lang.Object[0]);
    }
    forwardValue1092_22_0 = 0;
    }
    life6_27 = forwardValue1092_22_0;
    life7_32 = (p1)[(life6_27++)];
    life8_39 = __call1092_4(p0, (p1)[(life6_27++)]);
    life9_42 = __call1092_5(p0);
    life10_45 = __fieldRead1092_6(life9_42);
    if (!(((p1).length > life6_27))) {
        break forward_join_53;
    }
    life10_45 = __call1092_7(life10_45, (p1)[(life6_27++)], 1);
    }
    life12_60 = __fieldRead1092_8(life9_42);
    if (!(((p1).length > life6_27))) {
        break forward_join_70;
    }
    life12_60 = __call1092_9(life12_60, (p1)[(life6_27++)], 0, 0, 0);
    }
    life14_77 = __fieldRead1092_10(life9_42);
    if (!(((p1).length > life6_27))) {
        break forward_join_85;
    }
    life14_77 = __call1092_11(life14_77, (p1)[(life6_27++)], 1);
    }
    life16_91 = 0x1.0p0d;
    spill1092_1 = p1;
    if (!((life5_5 != 0))) {
        forwardValue1092_94_0 = spill1092_1;
        break forward_join_94;
    }
    if (!(((spill1092_1).length > life6_27))) {
        break forward_join_101;
    }
    forwardValue1092_94_0 = p1;
    }
    life16_91 = __call1092_12((forwardValue1092_94_0)[(life6_27++)], 0x0.0p0d, 0x1.fffffep127d);
    }
    life18_113 = 0x1.0p0d;
    spill1092_2 = p1;
    if (!((life5_5 != 0))) {
        forwardValue1092_110_0 = spill1092_2;
        break forward_join_110;
    }
    if (!(((spill1092_2).length > life6_27))) {
        break forward_join_117;
    }
    forwardValue1092_110_0 = p1;
    }
    life18_113 = __call1092_13((forwardValue1092_110_0)[(life6_27++)], 0x0.0p0d, 0x1.0p1d);
    }
    life20_135 = 0x0.0p0d;
    spill1092_3 = (p1).length;
    if (!((life5_5 != 0))) {
        forwardValue1092_137_0 = spill1092_3;
        break forward_join_137;
    }
    if (!((spill1092_3 > life6_27))) {
        break forward_join_132;
    }
    life20_135 = __call1092_14((p1)[life6_27], 0x0.0p0d, 0x1.0p0d);
    }
    spill1092_4 = life16_91;
    spill1092_5 = 0x1.0p0d;
    if (!((life5_5 != 0))) {
        forwardValue1092_140_0 = spill1092_4;
        forwardValue1092_140_1 = spill1092_5;
        break forward_join_140;
    }
    forwardValue1092_137_0 = __numericCompare1092_15(spill1092_4, spill1092_5);
    }
    if (!((forwardValue1092_137_0 > 0))) {
        break forward_join_142;
    }
    forwardValue1092_140_0 = life16_91;
    forwardValue1092_140_1 = 0x1.0p4d;
    }
    forwardValue1092_143_0 = (forwardValue1092_140_0 * forwardValue1092_140_1);
    break forward_join_143;
    }
    forwardValue1092_143_0 = 0x1.0p4d;
    }
    life22_169 = forwardValue1092_143_0;
    life24_175 = __call1092_16(life8_39, life10_45, life12_60, life14_77);
    if (!((life5_5 != 0))) {
        break forward_join_266;
    }
    if (!((__numericCompare1092_17(life24_175, life22_169) > 0))) {
        break forward_join_237;
    }
    spill1092_6 = life20_135;
    spill1092_7 = 0x0.0p0d;
    if (!((life5_5 != 0))) {
        forwardValue1092_177_0 = spill1092_6;
        forwardValue1092_177_1 = spill1092_7;
        break forward_join_177;
    }
    if (!((__numericCompare1092_18(spill1092_6, spill1092_7) <= 0))) {
        break forward_join_174;
    }
    throw new moom.b7("commands.playsound.playerTooFar", new java.lang.Object[] {__call1092_19(life8_39)});
    }
    forwardValue1092_177_0 = life10_45;
    forwardValue1092_177_1 = __fieldRead1092_20(life8_39);
    }
    life26_215 = (forwardValue1092_177_0 - forwardValue1092_177_1);
    life28_220 = (life12_60 - __fieldRead1092_21(life8_39));
    life30_225 = (life14_77 - __fieldRead1092_22(life8_39));
    life32_238 = __call1092_23((((life26_215 * life26_215) + (life28_220 * life28_220)) + (life30_225 * life30_225)));
    spill1092_8 = life32_238;
    if (!((life5_5 != 0))) {
        forwardValue1092_236_0 = spill1092_8;
        break forward_join_236;
    }
    if (!((__numericCompare1092_24(spill1092_8, 0x0.0p0d) > 0))) {
        break forward_join_235;
    }
    life10_45 = (__fieldRead1092_25(life8_39) + ((life26_215 / life32_238) * 0x1.0p1d));
    life12_60 = (__fieldRead1092_26(life8_39) + ((life28_220 / life32_238) * 0x1.0p1d));
    life14_77 = (__fieldRead1092_27(life8_39) + ((life30_225 / life32_238) * 0x1.0p1d));
    }
    forwardValue1092_236_0 = life20_135;
    }
    life16_91 = forwardValue1092_236_0;
    }
    __call1092_29(__fieldRead1092_28(life8_39), new moom.Aa(life7_32, life10_45, life12_60, life14_77, ((float) life16_91), ((float) life18_113)));
    __call1092_31(p0, receiver, "commands.playsound.success", new java.lang.Object[] {life7_32, __call1092_30(life8_39)});
    }
    return;
}
public static void h1092_0(moom.b7 p0) throws Throwable {
    throw __call1109200_0(p0);
}
public static void h1092_1(moom.b7 p0) throws Throwable {
    throw __call1109201_0(p0);
}
public static void h1092_2(moom.b7 p0) throws Throwable {
    throw __call1109202_0(p0);
}
public static void h1092_3(moom.b7 p0) throws Throwable {
    throw __call1109203_0(p0);
}
public static void h1092_4(moom.b7 p0) throws Throwable {
    throw __call1109204_0(p0);
}
public static void h1092_5(moom.b7 p0) throws Throwable {
    throw __call1109205_0(p0);
}
public static void h1092_6(moom.b7 p0) throws Throwable {
    throw __call1109206_0(p0);
}
public static void h1092_7(moom.b7 p0) throws Throwable {
    throw __call1109207_0(p0);
}
public static void h1092_8(moom.b7 p0) throws Throwable {
    throw __call1109208_0(p0);
}
public static void h1092_9(moom.b7 p0) throws Throwable {
    throw __call1109209_0(p0);
}
public static void h1092_10(moom.b7 p0) throws Throwable {
    throw __call1109210_0(p0);
}
public static void h1092_11(moom.b7 p0) throws Throwable {
    throw __call1109211_0(p0);
}
public static void h1092_12(moom.b7 p0) throws Throwable {
    throw __call1109212_0(p0);
}
public static void h1092_13(moom.b7 p0) throws Throwable {
    throw __call1109213_0(p0);
}
private static native long __fieldRead1092_0() throws Throwable;
private static native boolean __call1092_1() throws Throwable;
private static native int __integerCategory1092_2(boolean value) throws Throwable;
private static native java.lang.String __call1092_3(moom.p3 a0, net.minecraft.command.ICommandSender a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __call1092_4(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native moom.DR __call1092_5(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native double __fieldRead1092_6(moom.DR a0) throws Throwable;
private static native double __call1092_7(double a0, java.lang.String a1, int a2) throws Throwable;
private static native double __fieldRead1092_8(moom.DR a0) throws Throwable;
private static native double __call1092_9(double a0, java.lang.String a1, int a2, int a3, int a4) throws Throwable;
private static native double __fieldRead1092_10(moom.DR a0) throws Throwable;
private static native double __call1092_11(double a0, java.lang.String a1, int a2) throws Throwable;
private static native double __call1092_12(java.lang.String a0, double a1, double a2) throws Throwable;
private static native double __call1092_13(java.lang.String a0, double a1, double a2) throws Throwable;
private static native double __call1092_14(java.lang.String a0, double a1, double a2) throws Throwable;
private static native int __numericCompare1092_15(double a0, double a1) throws Throwable;
private static native double __call1092_16(net.minecraft.entity.player.EntityPlayerMP a0, double a1, double a2, double a3) throws Throwable;
private static native int __numericCompare1092_17(double a0, double a1) throws Throwable;
private static native int __numericCompare1092_18(double a0, double a1) throws Throwable;
private static native java.lang.String __call1092_19(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native double __fieldRead1092_20(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native double __fieldRead1092_21(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native double __fieldRead1092_22(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native double __call1092_23(double a0) throws Throwable;
private static native int __numericCompare1092_24(double a0, double a1) throws Throwable;
private static native double __fieldRead1092_25(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native double __fieldRead1092_26(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native double __fieldRead1092_27(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead1092_28(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1092_29(net.minecraft.network.NetHandlerPlayServer a0, moom.Aa a1) throws Throwable;
private static native java.lang.String __call1092_30(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1092_31(net.minecraft.command.ICommandSender a0, moom.p3 a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call1109200_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1109201_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1109202_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1109203_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1109204_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1109205_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1109206_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1109207_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1109208_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1109209_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1109210_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1109211_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1109212_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1109213_0(moom.b7 a0) throws Throwable;

}


static {
moom.p3.c = (moom._c.a(1720800768048747542L, 5033293157311173836L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(142734186160491L);
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public boolean a__Boolean(java.lang.String[] p0, int p1) { return __sourceHandlerCall_c9ebc42ff80ceac386ea(this, p0, p1); }


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_847d183b75ff9ccd281c(this, p0, p1, p2); }


public java.lang.String a__String() {
return "playsound";
}


public int a() {
return 2;
}


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.playsound.usage";
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_c0f537b3954b16427913(this, p0, p1); }

}
