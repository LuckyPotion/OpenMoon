package net.minecraft.command;


public class CommandTitle extends net.minecraft.command.CommandBase {

private static org.apache.logging.log4j.Logger c;

private static long d;

public CommandTitle() {
super();
}


static {
net.minecraft.command.CommandTitle.d = (moom._c.a(-3800091939156051127L, 7208166732005070005L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(42542854816825L);
    net.minecraft.command.CommandTitle.c = org.apache.logging.log4j.LogManager.getLogger();
}

private static native <E extends Throwable> void __sourceHandlerCall_0fd8ac17c1dc3cc03d16(net.minecraft.command.CommandTitle a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_0fd8ac17c1dc3cc03d16 {

public static void f167(net.minecraft.command.CommandTitle receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    int forwardValue167_24_0;
    int forwardValue167_24_1;
    int forwardValue167_30_0;
    int forwardValue167_38_0;
    int forwardValue167_53_0;
    net.minecraft.network.play.server.S45PacketTitle$Type forwardValue167_79_0;
    net.minecraft.network.play.server.S45PacketTitle$Type forwardValue167_79_1;
    net.minecraft.network.play.server.S45PacketTitle$Type forwardValue167_84_0;
    net.minecraft.network.play.server.S45PacketTitle$Type forwardValue167_84_1;
    int forwardValue167_102_0;
    java.lang.String[] forwardValue167_146_0;
    int spill167_0;
    int spill167_1;
    int spill167_2;
    net.minecraft.network.play.server.S45PacketTitle$Type spill167_3;
    net.minecraft.network.play.server.S45PacketTitle$Type spill167_4;
    int spill167_5;
    java.lang.String[] spill167_6;
    long life3_3;
    int life5_5;
    net.minecraft.entity.player.EntityPlayerMP life6_90;
    net.minecraft.network.play.server.S45PacketTitle$Type life7_95;
    int life8_146;
    int life9_151;
    int life10_156;
    moom.AG life11_163;
    java.lang.String life8_200;
    net.minecraft.util.IChatComponent life9_203;
    moom.AG life10_235;
    moom.AG life8_269;
    forward_join_200: {
    forward_join_184: {
    forward_join_173: {
    forward_join_146: {
    forward_join_145: {
    forward_join_132: {
    forward_join_102: {
    forward_join_98: {
    forward_join_84: {
    forward_join_79: {
    forward_join_61: {
    forward_join_53: {
    forward_join_48: {
    forward_join_41: {
    forward_join_38: {
    forward_join_30: {
    forward_join_24: {
    forward_join_19: {
    life3_3 = (__fieldRead167_0() ^ 14707527135358L);
    life5_5 = __integerCategory167_2(__call167_1());
    spill167_0 = (p1).length;
    spill167_1 = 2;
    if (!((life5_5 == 0))) {
        forwardValue167_24_0 = spill167_0;
        forwardValue167_24_1 = spill167_1;
        break forward_join_24;
    }
    if (!((spill167_0 < spill167_1))) {
        break forward_join_19;
    }
    throw new moom.cc("commands.title.usage", new java.lang.Object[0]);
    }
    spill167_2 = (p1).length;
    if (!((life5_5 == 0))) {
        forwardValue167_30_0 = spill167_2;
        break forward_join_30;
    }
    forwardValue167_24_0 = spill167_2;
    forwardValue167_24_1 = 3;
    }
    if (!((forwardValue167_24_0 < forwardValue167_24_1))) {
        break forward_join_61;
    }
    forwardValue167_30_0 = __integerCategory167_4(__call167_3("title", (p1)[1]));
    }
    if (!((life5_5 == 0))) {
        forwardValue167_38_0 = forwardValue167_30_0;
        break forward_join_38;
    }
    if (!((forwardValue167_30_0 == 0))) {
        break forward_join_41;
    }
    forwardValue167_38_0 = __integerCategory167_6(__call167_5("subtitle", (p1)[1]));
    }
    if (!((life5_5 == 0))) {
        forwardValue167_53_0 = forwardValue167_38_0;
        break forward_join_53;
    }
    if (!((forwardValue167_38_0 != 0))) {
        break forward_join_48;
    }
    }
    throw new moom.cc("commands.title.usage.title", new java.lang.Object[0]);
    }
    forwardValue167_53_0 = __integerCategory167_8(__call167_7("times", (p1)[1]));
    }
    if (!((forwardValue167_53_0 != 0))) {
        break forward_join_61;
    }
    throw new moom.cc("commands.title.usage.times", new java.lang.Object[0]);
    }
    life6_90 = __call167_9(p0, (p1)[0]);
    life7_95 = __call167_10((p1)[1]);
    spill167_3 = life7_95;
    spill167_4 = __fieldRead167_11();
    if (!((life5_5 == 0))) {
        forwardValue167_79_0 = spill167_3;
        forwardValue167_79_1 = spill167_4;
        break forward_join_79;
    }
    if (!((spill167_3 != spill167_4))) {
        break forward_join_173;
    }
    forwardValue167_79_0 = life7_95;
    forwardValue167_79_1 = __fieldRead167_12();
    }
    if (!((life5_5 == 0))) {
        forwardValue167_84_0 = forwardValue167_79_0;
        forwardValue167_84_1 = forwardValue167_79_1;
        break forward_join_84;
    }
    if (!((forwardValue167_79_0 != forwardValue167_79_1))) {
        break forward_join_173;
    }
    forwardValue167_84_0 = life7_95;
    forwardValue167_84_1 = __fieldRead167_13();
    }
    if (!((forwardValue167_84_0 == forwardValue167_84_1))) {
        break forward_join_132;
    }
    spill167_5 = (p1).length;
    if (!((life5_5 == 0))) {
        forwardValue167_102_0 = spill167_5;
        break forward_join_102;
    }
    if (!((spill167_5 != 5))) {
        break forward_join_98;
    }
    throw new moom.cc("commands.title.usage", new java.lang.Object[0]);
    }
    forwardValue167_102_0 = __call167_14((p1)[2]);
    }
    life8_146 = forwardValue167_102_0;
    life9_151 = __call167_15((p1)[3]);
    life10_156 = __call167_16((p1)[4]);
    life11_163 = new moom.AG(life8_146, life9_151, life10_156);
    __call167_18(__fieldRead167_17(life6_90), life11_163);
    __call167_19(p0, receiver, "commands.title.success", new java.lang.Object[0]);
    if (!((life5_5 != 0))) {
        break forward_join_200;
    }
    }
    spill167_6 = p1;
    if (!((life5_5 == 0))) {
        forwardValue167_146_0 = spill167_6;
        break forward_join_146;
    }
    if (!(((spill167_6).length < 3))) {
        break forward_join_145;
    }
    throw new moom.cc("commands.title.usage", new java.lang.Object[0]);
    }
    forwardValue167_146_0 = p1;
    }
    life8_200 = __call167_20(forwardValue167_146_0, 2);
    life9_203 = __call167_21(life8_200);
    life10_235 = new moom.AG(life7_95, __call167_22(p0, life9_203, life6_90));
    __call167_24(__fieldRead167_23(life6_90), life10_235);
    __call167_25(p0, receiver, "commands.title.success", new java.lang.Object[0]);
    if (!((life5_5 != 0))) {
        break forward_join_200;
    }
    }
    if (!(((p1).length != 2))) {
        break forward_join_184;
    }
    throw new moom.cc("commands.title.usage", new java.lang.Object[0]);
    }
    life8_269 = new moom.AG(life7_95, null);
    __call167_27(__fieldRead167_26(life6_90), life8_269);
    __call167_28(p0, receiver, "commands.title.success", new java.lang.Object[0]);
    }
    return;
}
public static void h167_0(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3016700_0(p0);
}
public static void h167_1(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3016701_0(p0);
}
public static void h167_2(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3016702_0(p0);
}
public static void h167_3(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3016703_0(p0);
}
public static void h167_4(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3016704_0(p0);
}
public static void h167_5(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3016705_0(p0);
}
public static void h167_6(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3016706_0(p0);
}
public static void h167_7(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3016707_0(p0);
}
public static void h167_8(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3016708_0(p0);
}
public static void h167_9(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3016709_0(p0);
}
public static void h167_10(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3016710_0(p0);
}
public static void h167_11(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3016711_0(p0);
}
public static void h167_12(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3016712_0(p0);
}
public static void h167_13(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3016713_0(p0);
}
public static void h167_14(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3016714_0(p0);
}
public static void h167_15(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3016715_0(p0);
}
public static void h167_16(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3016716_0(p0);
}
public static void h167_17(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3016717_0(p0);
}
public static void h167_18(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3016718_0(p0);
}
public static void h167_19(com.google.gson.JsonParseException p0, moom.AG p1) throws Throwable {
    com.google.gson.JsonParseException life2_2;
    java.lang.Throwable life1_5;
    life2_2 = p0;
    life1_5 = __call3016719_0(life2_2);
    throw new moom.cb("commands.tellraw.jsonException", new java.lang.Object[] {((life1_5 == null) ? "" : __call3016719_1(life1_5))});
}
public static void h167_20(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3016720_0(p0);
}
public static void h167_21(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3016721_0(p0);
}
public static void h167_22(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3016722_0(p0);
}
private static native long __fieldRead167_0() throws Throwable;
private static native boolean __call167_1() throws Throwable;
private static native int __integerCategory167_2(boolean value) throws Throwable;
private static native boolean __call167_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory167_4(boolean value) throws Throwable;
private static native boolean __call167_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory167_6(boolean value) throws Throwable;
private static native boolean __call167_7(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory167_8(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __call167_9(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.network.play.server.S45PacketTitle$Type __call167_10(java.lang.String a0) throws Throwable;
private static native net.minecraft.network.play.server.S45PacketTitle$Type __fieldRead167_11() throws Throwable;
private static native net.minecraft.network.play.server.S45PacketTitle$Type __fieldRead167_12() throws Throwable;
private static native net.minecraft.network.play.server.S45PacketTitle$Type __fieldRead167_13() throws Throwable;
private static native int __call167_14(java.lang.String a0) throws Throwable;
private static native int __call167_15(java.lang.String a0) throws Throwable;
private static native int __call167_16(java.lang.String a0) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead167_17(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call167_18(net.minecraft.network.NetHandlerPlayServer a0, moom.AG a1) throws Throwable;
private static native void __call167_19(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandTitle a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.String __call167_20(java.lang.String[] a0, int a1) throws Throwable;
private static native net.minecraft.util.IChatComponent __call167_21(java.lang.String a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call167_22(net.minecraft.command.ICommandSender a0, net.minecraft.util.IChatComponent a1, net.minecraft.entity.player.EntityPlayerMP a2) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead167_23(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call167_24(net.minecraft.network.NetHandlerPlayServer a0, moom.AG a1) throws Throwable;
private static native void __call167_25(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandTitle a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead167_26(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call167_27(net.minecraft.network.NetHandlerPlayServer a0, moom.AG a1) throws Throwable;
private static native void __call167_28(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandTitle a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native com.google.gson.JsonParseException __call3016700_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native com.google.gson.JsonParseException __call3016701_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native com.google.gson.JsonParseException __call3016702_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native com.google.gson.JsonParseException __call3016703_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native com.google.gson.JsonParseException __call3016704_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native com.google.gson.JsonParseException __call3016705_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native com.google.gson.JsonParseException __call3016706_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native com.google.gson.JsonParseException __call3016707_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native com.google.gson.JsonParseException __call3016708_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native com.google.gson.JsonParseException __call3016709_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native com.google.gson.JsonParseException __call3016710_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native com.google.gson.JsonParseException __call3016711_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native com.google.gson.JsonParseException __call3016712_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native com.google.gson.JsonParseException __call3016713_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native com.google.gson.JsonParseException __call3016714_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native com.google.gson.JsonParseException __call3016715_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native com.google.gson.JsonParseException __call3016716_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native com.google.gson.JsonParseException __call3016717_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native com.google.gson.JsonParseException __call3016718_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call3016719_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.String __call3016719_1(java.lang.Throwable a0) throws Throwable;
private static native com.google.gson.JsonParseException __call3016720_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native com.google.gson.JsonParseException __call3016721_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native com.google.gson.JsonParseException __call3016722_0(com.google.gson.JsonParseException a0) throws Throwable;

}


private static com.google.gson.JsonParseException a(com.google.gson.JsonParseException p0) {
return p0;
}


public boolean a__Boolean(java.lang.String[] p0, int p1) {
int forwardValue4878_11_0;
    int forwardValue4878_13_0;
    int spill4878_0;
    long life3_3;
    int life5_5;
    forward_join_13: {
    forward_join_12: {
    forward_join_11: {
    life3_3 = (net.minecraft.command.CommandTitle.d ^ 126220537237990L);
    life5_5 = ((moom.b7.c()) ? 1 : 0);
    spill4878_0 = p1;
    if (!((life5_5 != 0))) {
        forwardValue4878_11_0 = spill4878_0;
        break forward_join_11;
    }
    if (!((spill4878_0 == 0))) {
        break forward_join_12;
    }
    forwardValue4878_11_0 = 1;
    }
    forwardValue4878_13_0 = forwardValue4878_11_0;
    break forward_join_13;
    }
    forwardValue4878_13_0 = 0;
    }
    return ((forwardValue4878_13_0) != 0);
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) {
int forwardValue4877_22_0;
    int forwardValue4877_22_1;
    java.lang.String[] forwardValue4877_24_0;
    java.util.List forwardValue4877_28_0;
    int spill4877_0;
    int spill4877_1;
    java.lang.String[] spill4877_2;
    long life4_3;
    int life6_5;
    forward_join_28: {
    forward_join_27: {
    forward_join_24: {
    forward_join_22: {
    forward_join_17: {
    life4_3 = (net.minecraft.command.CommandTitle.d ^ 81812948820477L);
    life6_5 = ((moom.b7.b()) ? 1 : 0);
    spill4877_0 = (p1).length;
    spill4877_1 = 1;
    if (!((life6_5 == 0))) {
        forwardValue4877_22_0 = spill4877_0;
        forwardValue4877_22_1 = spill4877_1;
        break forward_join_22;
    }
    if (!((spill4877_0 == spill4877_1))) {
        break forward_join_17;
    }
    forwardValue4877_28_0 = __sourceExactCall_1d2f5e4b5e42d5(((java.lang.String[])(p1)), ((java.lang.String[])(((moom.Bl)(moom.Bl.a__Bl())).a__ArrayString())));
    break forward_join_28;
    }
    spill4877_2 = p1;
    if (!((life6_5 == 0))) {
        forwardValue4877_24_0 = spill4877_2;
        break forward_join_24;
    }
    forwardValue4877_22_0 = (spill4877_2).length;
    forwardValue4877_22_1 = 2;
    }
    if (!((forwardValue4877_22_0 == forwardValue4877_22_1))) {
        break forward_join_27;
    }
    forwardValue4877_24_0 = p1;
    }
    forwardValue4877_28_0 = __sourceExactCall_1d2f5e4b5e42d5(((java.lang.String[])(forwardValue4877_24_0)), ((java.lang.String[])(net.minecraft.network.play.server.S45PacketTitle$Type.a())));
    break forward_join_28;
    }
    forwardValue4877_28_0 = null;
    }
    return forwardValue4877_28_0;
}


public java.lang.String a__String() {
return "title";
}


public int a() {
return 2;
}


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.title.usage";
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_0fd8ac17c1dc3cc03d16(this, p0, p1); }


private static native java.util.List __sourceExactCall_1d2f5e4b5e42d5(java.lang.String[] p0, java.lang.String[] p1);
}
