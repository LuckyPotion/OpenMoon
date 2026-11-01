package moom;


public class pX extends moom.pW {

private static long c;

public pX() {
super();
}

private static native <E extends Throwable> void __sourceHandlerCall_9a61f9531e19d631a8f7(moom.pX a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_9a61f9531e19d631a8f7 {

public static void f1953(moom.pX receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    long life3_3;
    net.minecraft.world.WorldSettings$GameType life5_22;
    life3_3 = (__fieldRead1953_0() ^ 5014882976676L);
    if (((p1).length == 0)) {
        throw new moom.cc("commands.defaultgamemode.usage", new java.lang.Object[0]);
    }
    life5_22 = __call1953_1(receiver, p0, (p1)[0]);
    __call1953_2(receiver, life5_22);
    __call1953_5(p0, receiver, "commands.defaultgamemode.success", new java.lang.Object[] {new moom.CN(__invokedynamic1953_4(__call1953_3(life5_22)), new java.lang.Object[0])});
    return;
}
public static void h1953_0(moom.b7 p0) throws Throwable {
    throw __call1195300_0(p0);
}
private static native long __fieldRead1953_0() throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __call1953_1(moom.pX a0, net.minecraft.command.ICommandSender a1, java.lang.String a2) throws Throwable;
private static native void __call1953_2(moom.pX a0, net.minecraft.world.WorldSettings$GameType a1) throws Throwable;
private static native java.lang.String __call1953_3(net.minecraft.world.WorldSettings$GameType a0) throws Throwable;
private static native java.lang.String __invokedynamic1953_4(java.lang.String a0) throws Throwable;
private static native void __call1953_5(net.minecraft.command.ICommandSender a0, moom.pX a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call1195300_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b04eeaeb308dd47c0021(moom.pX a0, net.minecraft.world.WorldSettings$GameType a1) throws E;
private static final class __SourceHandler_b04eeaeb308dd47c0021 {

public static void f1130(moom.pX receiver, net.minecraft.world.WorldSettings$GameType p0) throws Throwable {
    moom.Bl lexicalValue1130_17_0;
    boolean spill1130_0;
    moom.Bl spill1130_1;
    long life2_3;
    moom.Bl life5_6;
    int life4_7;
    java.util.Iterator life6_26;
    net.minecraft.entity.player.EntityPlayerMP life7_33;
    lexical_join_36: {
    lexical_join_17: {
    life2_3 = (__fieldRead1130_0() ^ 94726296397528L);
    spill1130_0 = __call1130_1();
    life5_6 = __call1130_2();
    life4_7 = __integerCategory1130_3(spill1130_0);
    __call1130_4(life5_6, p0);
    spill1130_1 = life5_6;
    if (!((life4_7 != 0))) {
        lexicalValue1130_17_0 = spill1130_1;
        break lexical_join_17;
    }
    if (!(__call1130_5(spill1130_1))) {
        break lexical_join_36;
    }
    lexicalValue1130_17_0 = __call1130_6();
    }
    life6_26 = __call1130_9(__call1130_8(__call1130_7(lexicalValue1130_17_0)));
    lexical_cycle_21: while (true) {
    if (!(__call1130_10(life6_26))) {
        break lexical_join_36;
    }
    life7_33 = __cast1130_12(__call1130_11(life6_26));
    __call1130_13(life7_33, p0);
    __fieldWrite1130_14(life7_33, 0x0.0p0f);
    if (!((life4_7 == 0))) { continue lexical_cycle_21; }
    break lexical_cycle_21;
    }
    }
    return;
}
public static void h1130_0(moom.Oo p0) throws Throwable {
    throw __call1113000_0(p0);
}
public static void h1130_1(moom.Oo p0) throws Throwable {
    throw __call1113001_0(p0);
}
private static native long __fieldRead1130_0() throws Throwable;
private static native boolean __call1130_1() throws Throwable;
private static native moom.Bl __call1130_2() throws Throwable;
private static native int __integerCategory1130_3(boolean value) throws Throwable;
private static native void __call1130_4(moom.Bl a0, net.minecraft.world.WorldSettings$GameType a1) throws Throwable;
private static native boolean __call1130_5(moom.Bl a0) throws Throwable;
private static native moom.Bl __call1130_6() throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1130_7(moom.Bl a0) throws Throwable;
private static native java.util.List __call1130_8(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native java.util.Iterator __call1130_9(java.util.List a0) throws Throwable;
private static native boolean __call1130_10(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1130_11(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __cast1130_12(java.lang.Object a0) throws Throwable;
private static native void __call1130_13(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.world.WorldSettings$GameType a1) throws Throwable;
private static native void __fieldWrite1130_14(net.minecraft.entity.player.EntityPlayerMP a0, float a1) throws Throwable;
private static native java.lang.Exception __call1113000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1113001_0(moom.Oo a0) throws Throwable;

}


static {
moom.pX.c = (moom._c.a(6470536554765992795L, 7402795921451039616L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(234921561723906L);
}


private static java.lang.Exception c(java.lang.Exception p0) {
return p0;
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_9a61f9531e19d631a8f7(this, p0, p1); }


public java.lang.String a__String() {
return "defaultgamemode";
}


protected void a(net.minecraft.world.WorldSettings$GameType p0) { __sourceHandlerCall_b04eeaeb308dd47c0021(this, p0); }


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.defaultgamemode.usage";
}

}
