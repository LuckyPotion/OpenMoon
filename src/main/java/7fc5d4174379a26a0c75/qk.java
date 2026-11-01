package moom;


public class qk extends net.minecraft.command.CommandBase {

private static long c;

public qk() {
super();
}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_17bd3f6e46c79e4b36f8(moom.qk a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_17bd3f6e46c79e4b36f8 {

public static java.util.List f1190(moom.qk receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    java.lang.String[] forwardValue1190_13_0;
    java.util.List forwardValue1190_18_0;
    java.lang.String[] spill1190_0;
    long life4_3;
    int life6_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_13: {
    life4_3 = (__fieldRead1190_0() ^ 117622044822843L);
    life6_5 = __call1190_1();
    spill1190_0 = p1;
    if (!((life6_5 != 0))) {
        forwardValue1190_13_0 = spill1190_0;
        break forward_join_13;
    }
    if (!(((spill1190_0).length >= 1))) {
        break forward_join_17;
    }
    forwardValue1190_13_0 = p1;
    }
    forwardValue1190_18_0 = __call1190_4(forwardValue1190_13_0, __call1190_3(__call1190_2()));
    break forward_join_18;
    }
    forwardValue1190_18_0 = null;
    }
    return forwardValue1190_18_0;
}
public static void h1190_0(moom.Oo p0) throws Throwable {
    throw __call1119000_0(p0);
}
public static void h1190_1(moom.Oo p0) throws Throwable {
    throw __call1119001_0(p0);
}
private static native long __fieldRead1190_0() throws Throwable;
private static native int __call1190_1() throws Throwable;
private static native moom.Bl __call1190_2() throws Throwable;
private static native java.lang.String[] __call1190_3(moom.Bl a0) throws Throwable;
private static native java.util.List __call1190_4(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.Exception __call1119000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1119001_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_fabacd10bbcb5e33137d(moom.qk a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_fabacd10bbcb5e33137d {

public static void f1189(moom.qk receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    int forwardValue1189_15_0;
    int spill1189_0;
    long life3_3;
    int life5_5;
    net.minecraft.util.IChatComponent life6_27;
    forward_join_49: {
    forward_join_42: {
    forward_join_15: {
    life3_3 = (__fieldRead1189_0() ^ 50521014377656L);
    life5_5 = __call1189_1();
    spill1189_0 = (p1).length;
    if (!((life5_5 != 0))) {
        forwardValue1189_15_0 = spill1189_0;
        break forward_join_15;
    }
    if (!((spill1189_0 > 0))) {
        break forward_join_42;
    }
    forwardValue1189_15_0 = __call1189_2((p1)[0]);
    }
    if (!((forwardValue1189_15_0 > 0))) {
        break forward_join_42;
    }
    life6_27 = __call1189_3(p0, p1, 0, 1);
    __call1189_7(__call1189_5(__call1189_4()), new moom.CN("chat.type.announcement", new java.lang.Object[] {__call1189_6(p0), life6_27}));
    if (!((life5_5 == 0))) {
        break forward_join_49;
    }
    }
    throw new moom.cc("commands.say.usage", new java.lang.Object[0]);
    }
    return;
}
public static void h1189_0(moom.b7 p0) throws Throwable {
    throw __call1118900_0(p0);
}
public static void h1189_1(moom.b7 p0) throws Throwable {
    throw __call1118901_0(p0);
}
public static void h1189_2(moom.b7 p0) throws Throwable {
    throw __call1118902_0(p0);
}
private static native long __fieldRead1189_0() throws Throwable;
private static native int __call1189_1() throws Throwable;
private static native int __call1189_2(java.lang.String a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1189_3(net.minecraft.command.ICommandSender a0, java.lang.String[] a1, int a2, int a3) throws Throwable;
private static native moom.Bl __call1189_4() throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1189_5(moom.Bl a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1189_6(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native void __call1189_7(net.minecraft.server.management.ServerConfigurationManager a0, moom.CN a1) throws Throwable;
private static native java.lang.Exception __call1118900_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1118901_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1118902_0(moom.b7 a0) throws Throwable;

}


static {
moom.qk.c = (moom._c.a(-4969644222062439905L, 9090988536013721501L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(234791714197310L);
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_17bd3f6e46c79e4b36f8(this, p0, p1, p2); }


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_fabacd10bbcb5e33137d(this, p0, p1); }


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.say.usage";
}


public int a() {
return 1;
}


public java.lang.String a__String() {
return "say";
}

}
