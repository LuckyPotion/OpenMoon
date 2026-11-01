package moom;


public class qp extends net.minecraft.command.CommandBase {

private static long c;

public qp() {
super();
}

private static native <E extends Throwable> void __sourceHandlerCall_a30ccc1b51769ff2b76c(moom.qp a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_a30ccc1b51769ff2b76c {

public static void f1196(moom.qp receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    net.minecraft.command.ICommandSender forwardValue1196_36_0;
    net.minecraft.command.ICommandSender forwardValue1196_44_0;
    java.lang.String[] forwardValue1196_44_1;
    int forwardValue1196_44_2;
    int forwardValue1196_44_3;
    net.minecraft.command.ICommandSender forwardValue1196_45_0;
    java.lang.String[] forwardValue1196_45_1;
    int forwardValue1196_45_2;
    net.minecraft.command.ICommandSender forwardValue1196_46_0;
    java.lang.String[] forwardValue1196_46_1;
    int forwardValue1196_46_2;
    int forwardValue1196_46_3;
    net.minecraft.entity.player.EntityPlayerMP spill1196_0;
    java.lang.String[] spill1196_1;
    int spill1196_2;
    int spill1196_3;
    long life3_3;
    int life5_5;
    net.minecraft.entity.player.EntityPlayerMP life6_24;
    net.minecraft.util.IChatComponent life7_57;
    moom.CN life8_74;
    moom.CN life9_91;
    forward_join_46: {
    forward_join_45: {
    forward_join_44: {
    forward_join_36: {
    forward_join_35: {
    forward_join_17: {
    life3_3 = (__fieldRead1196_0() ^ 54512838155008L);
    life5_5 = __call1196_1();
    if (!(((p1).length < 2))) {
        break forward_join_17;
    }
    throw new moom.cc("commands.message.usage", new java.lang.Object[0]);
    }
    life6_24 = __call1196_2(p0, (p1)[0]);
    spill1196_0 = life6_24;
    if (!((life5_5 != 0))) {
        forwardValue1196_36_0 = spill1196_0;
        break forward_join_36;
    }
    if (!((spill1196_0 == p0))) {
        break forward_join_35;
    }
    throw new moom.ca("commands.message.sameTarget", new java.lang.Object[0]);
    }
    forwardValue1196_36_0 = p0;
    }
    spill1196_1 = p1;
    spill1196_2 = 1;
    spill1196_3 = __instanceOf1196_3(p0);
    if (!((life5_5 != 0))) {
        forwardValue1196_44_0 = forwardValue1196_36_0;
        forwardValue1196_44_1 = spill1196_1;
        forwardValue1196_44_2 = spill1196_2;
        forwardValue1196_44_3 = spill1196_3;
        break forward_join_44;
    }
    if (!((spill1196_3 == 0))) {
        forwardValue1196_45_0 = forwardValue1196_36_0;
        forwardValue1196_45_1 = spill1196_1;
        forwardValue1196_45_2 = spill1196_2;
        break forward_join_45;
    }
    forwardValue1196_44_0 = forwardValue1196_36_0;
    forwardValue1196_44_1 = spill1196_1;
    forwardValue1196_44_2 = spill1196_2;
    forwardValue1196_44_3 = 1;
    }
    forwardValue1196_46_0 = forwardValue1196_44_0;
    forwardValue1196_46_1 = forwardValue1196_44_1;
    forwardValue1196_46_2 = forwardValue1196_44_2;
    forwardValue1196_46_3 = forwardValue1196_44_3;
    break forward_join_46;
    }
    forwardValue1196_46_0 = forwardValue1196_45_0;
    forwardValue1196_46_1 = forwardValue1196_45_1;
    forwardValue1196_46_2 = forwardValue1196_45_2;
    forwardValue1196_46_3 = 0;
    }
    life7_57 = __call1196_4(forwardValue1196_46_0, forwardValue1196_46_1, forwardValue1196_46_2, forwardValue1196_46_3);
    life8_74 = new moom.CN("commands.message.display.incoming", new java.lang.Object[] {__call1196_5(p0), __call1196_6(life7_57)});
    life9_91 = new moom.CN("commands.message.display.outgoing", new java.lang.Object[] {__call1196_7(life6_24), __call1196_8(life7_57)});
    __call1196_13(__call1196_11(__call1196_9(life8_74), __fieldRead1196_10()), __fieldRead1196_12());
    __call1196_18(__call1196_16(__call1196_14(life9_91), __fieldRead1196_15()), __fieldRead1196_17());
    __call1196_19(life6_24, life8_74);
    __call1196_20(p0, life9_91);
    return;
}
public static void h1196_0(moom.b7 p0) throws Throwable {
    throw __call1119600_0(p0);
}
public static void h1196_1(moom.b7 p0) throws Throwable {
    throw __call1119601_0(p0);
}
public static void h1196_2(moom.b7 p0) throws Throwable {
    throw __call1119602_0(p0);
}
public static void h1196_3(moom.b7 p0) throws Throwable {
    throw __call1119603_0(p0);
}
private static native long __fieldRead1196_0() throws Throwable;
private static native int __call1196_1() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __call1196_2(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native int __instanceOf1196_3(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1196_4(net.minecraft.command.ICommandSender a0, java.lang.String[] a1, int a2, int a3) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1196_5(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1196_6(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1196_7(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1196_8(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native moom.CO __call1196_9(moom.CN a0) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead1196_10() throws Throwable;
private static native moom.CO __call1196_11(moom.CO a0, net.minecraft.util.EnumChatFormatting a1) throws Throwable;
private static native java.lang.Boolean __fieldRead1196_12() throws Throwable;
private static native moom.CO __call1196_13(moom.CO a0, java.lang.Boolean a1) throws Throwable;
private static native moom.CO __call1196_14(moom.CN a0) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead1196_15() throws Throwable;
private static native moom.CO __call1196_16(moom.CO a0, net.minecraft.util.EnumChatFormatting a1) throws Throwable;
private static native java.lang.Boolean __fieldRead1196_17() throws Throwable;
private static native moom.CO __call1196_18(moom.CO a0, java.lang.Boolean a1) throws Throwable;
private static native void __call1196_19(net.minecraft.entity.player.EntityPlayerMP a0, moom.CN a1) throws Throwable;
private static native void __call1196_20(net.minecraft.command.ICommandSender a0, moom.CN a1) throws Throwable;
private static native java.lang.Exception __call1119600_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1119601_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1119602_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1119603_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_9fea0824a53f2b7f0e12(moom.qp a0, java.lang.String[] a1, int a2) throws E;
private static final class __SourceHandler_9fea0824a53f2b7f0e12 {

public static boolean f1197(moom.qp receiver, java.lang.String[] p0, int p1) throws Throwable {
    int forwardValue1197_11_0;
    int forwardValue1197_13_0;
    int spill1197_0;
    long life3_3;
    int life5_5;
    forward_join_13: {
    forward_join_12: {
    forward_join_11: {
    life3_3 = (__fieldRead1197_0() ^ 86002911525528L);
    life5_5 = __call1197_1();
    spill1197_0 = p1;
    if (!((life5_5 == 0))) {
        forwardValue1197_11_0 = spill1197_0;
        break forward_join_11;
    }
    if (!((spill1197_0 == 0))) {
        break forward_join_12;
    }
    forwardValue1197_11_0 = 1;
    }
    forwardValue1197_13_0 = forwardValue1197_11_0;
    break forward_join_13;
    }
    forwardValue1197_13_0 = 0;
    }
    return __integerCategory1197_2(forwardValue1197_13_0);
}
public static void h1197_0(moom.Oo p0) throws Throwable {
    throw __call1119700_0(p0);
}
private static native long __fieldRead1197_0() throws Throwable;
private static native int __call1197_1() throws Throwable;
private static native boolean __integerCategory1197_2(int value) throws Throwable;
private static native java.lang.Exception __call1119700_0(moom.Oo a0) throws Throwable;

}


static {
moom.qp.c = (moom._c.a(7174918292335420206L, -2856501673554695239L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(185313017539727L);
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_a30ccc1b51769ff2b76c(this, p0, p1); }


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) {
return __sourceExactCall_c91776a54957c8(((java.lang.String[])(p1)), ((java.lang.String[])(((moom.Bl)(moom.Bl.a__Bl())).a__ArrayString())));
}


public boolean a__Boolean(java.lang.String[] p0, int p1) { return __sourceHandlerCall_9fea0824a53f2b7f0e12(this, p0, p1); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.util.List<java.lang.String> a__List() {
return java.util.Arrays.asList(((new java.lang.String[] {"w", "msg"})));
}


public java.lang.String a__String() {
return "tell";
}


public int a() {
return 0;
}


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.message.usage";
}


private static native java.util.List __sourceExactCall_c91776a54957c8(java.lang.String[] p0, java.lang.String[] p1);
}
