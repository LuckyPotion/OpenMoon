package moom;


public class qr extends net.minecraft.command.CommandBase {

private static long c;

public qr() {
super();
}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_7b9fcb99670666cea3a5(moom.qr a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_7b9fcb99670666cea3a5 {

public static java.util.List f188(moom.qr receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    java.lang.String[] lexicalValue188_13_0;
    int lexicalValue188_54_0;
    java.lang.String[] spill188_0;
    boolean spill188_1;
    long life4_3;
    int life6_5;
    java.lang.String life7_24;
    java.util.ArrayList life8_26;
    com.mojang.authlib.GameProfile[] life9_29;
    int life10_32;
    int life11_34;
    com.mojang.authlib.GameProfile life12_41;
    lexical_join_60: {
    lexical_join_58: {
    lexical_join_13: {
    life4_3 = (__fieldRead188_0() ^ 134910474087454L);
    life6_5 = __call188_1();
    spill188_0 = p1;
    if (!((life6_5 == 0))) {
        lexicalValue188_13_0 = spill188_0;
        break lexical_join_13;
    }
    if (!(((spill188_0).length == 1))) {
        break lexical_join_60;
    }
    lexicalValue188_13_0 = p1;
    }
    life7_24 = (lexicalValue188_13_0)[((p1).length - 1)];
    life8_26 = __call188_2();
    life9_29 = __call188_4(__call188_3());
    life10_32 = (life9_29).length;
    life11_34 = 0;
    lexical_cycle_29: while (true) {
    lexical_join_56: {
    lexical_join_55: {
    lexical_join_54: {
    if (!((life11_34 < life10_32))) {
        break lexical_join_58;
    }
    life12_41 = (life9_29)[life11_34];
    if (!((life6_5 == 0))) {
        break lexical_join_56;
    }
    if (!((!__call188_7(__call188_6(__call188_5()), life12_41)))) {
        break lexical_join_55;
    }
    spill188_1 = __call188_9(life7_24, __call188_8(life12_41));
    if (!((life6_5 == 0))) {
        lexicalValue188_54_0 = __integerCategory188_10(spill188_1);
        break lexical_join_54;
    }
    if (!(spill188_1)) {
        break lexical_join_55;
    }
    lexicalValue188_54_0 = __integerCategory188_13(__call188_12(life8_26, __call188_11(life12_41)));
    }
    __discardScalar188_14(lexicalValue188_54_0);
    }
    life11_34 += 1;
    }
    if (!((life6_5 != 0))) { continue lexical_cycle_29; }
    break lexical_cycle_29;
    }
    }
    return life8_26;
    }
    return null;
}
public static void h188_0(moom.Oo p0) throws Throwable {
    throw __call1018800_0(p0);
}
public static void h188_1(moom.Oo p0) throws Throwable {
    throw __call1018801_0(p0);
}
public static void h188_2(moom.Oo p0) throws Throwable {
    throw __call1018802_0(p0);
}
public static void h188_3(moom.Oo p0) throws Throwable {
    throw __call1018803_0(p0);
}
public static void h188_4(moom.Oo p0) throws Throwable {
    throw __call1018804_0(p0);
}
public static void h188_5(moom.Oo p0) throws Throwable {
    throw __call1018805_0(p0);
}
private static native long __fieldRead188_0() throws Throwable;
private static native int __call188_1() throws Throwable;
private static native java.util.ArrayList __call188_2() throws Throwable;
private static native moom.Bl __call188_3() throws Throwable;
private static native com.mojang.authlib.GameProfile[] __call188_4(moom.Bl a0) throws Throwable;
private static native moom.Bl __call188_5() throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call188_6(moom.Bl a0) throws Throwable;
private static native boolean __call188_7(net.minecraft.server.management.ServerConfigurationManager a0, com.mojang.authlib.GameProfile a1) throws Throwable;
private static native java.lang.String __call188_8(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native boolean __call188_9(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory188_10(boolean value) throws Throwable;
private static native java.lang.String __call188_11(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native boolean __call188_12(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory188_13(boolean value) throws Throwable;
private static native void __discardScalar188_14(int a0) throws Throwable;
private static native java.lang.Exception __call1018800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018804_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018805_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f9682b9b584e6c390ceb(moom.qr a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_f9682b9b584e6c390ceb {

public static void f1198(moom.qr receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    int forwardValue1198_16_0;
    int spill1198_0;
    long life3_3;
    int life5_5;
    moom.Bl life6_24;
    com.mojang.authlib.GameProfile life7_31;
    forward_join_68: {
    forward_join_61: {
    forward_join_59: {
    forward_join_43: {
    forward_join_16: {
    life3_3 = (__fieldRead1198_0() ^ 67875948527005L);
    life5_5 = __call1198_1();
    spill1198_0 = (p1).length;
    if (!((life5_5 != 0))) {
        forwardValue1198_16_0 = spill1198_0;
        break forward_join_16;
    }
    if (!((spill1198_0 == 1))) {
        break forward_join_61;
    }
    forwardValue1198_16_0 = __call1198_2((p1)[0]);
    }
    if (!((forwardValue1198_16_0 > 0))) {
        break forward_join_61;
    }
    life6_24 = __call1198_3();
    life7_31 = __call1198_5(__call1198_4(life6_24), (p1)[0]);
    if (!((life5_5 != 0))) {
        break forward_join_59;
    }
    if (!((life7_31 == null))) {
        break forward_join_43;
    }
    throw new moom.b7("commands.op.failed", new java.lang.Object[] {(p1)[0]});
    }
    __call1198_7(__call1198_6(life6_24), life7_31);
    __call1198_8(p0, receiver, "commands.op.success", new java.lang.Object[] {(p1)[0]});
    }
    if (!((life5_5 == 0))) {
        break forward_join_68;
    }
    }
    throw new moom.cc("commands.op.usage", new java.lang.Object[0]);
    }
    return;
}
public static void h1198_0(moom.b7 p0) throws Throwable {
    throw __call1119800_0(p0);
}
public static void h1198_1(moom.b7 p0) throws Throwable {
    throw __call1119801_0(p0);
}
public static void h1198_2(moom.b7 p0) throws Throwable {
    throw __call1119802_0(p0);
}
public static void h1198_3(moom.b7 p0) throws Throwable {
    throw __call1119803_0(p0);
}
public static void h1198_4(moom.b7 p0) throws Throwable {
    throw __call1119804_0(p0);
}
private static native long __fieldRead1198_0() throws Throwable;
private static native int __call1198_1() throws Throwable;
private static native int __call1198_2(java.lang.String a0) throws Throwable;
private static native moom.Bl __call1198_3() throws Throwable;
private static native moom.Bt __call1198_4(moom.Bl a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call1198_5(moom.Bt a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1198_6(moom.Bl a0) throws Throwable;
private static native void __call1198_7(net.minecraft.server.management.ServerConfigurationManager a0, com.mojang.authlib.GameProfile a1) throws Throwable;
private static native void __call1198_8(net.minecraft.command.ICommandSender a0, moom.qr a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call1119800_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1119801_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1119802_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1119803_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1119804_0(moom.b7 a0) throws Throwable;

}


static {
moom.qr.c = (moom._c.a(7056195664872456076L, 6522635449970592201L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(267923452423623L);
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_7b9fcb99670666cea3a5(this, p0, p1, p2); }


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_f9682b9b584e6c390ceb(this, p0, p1); }


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.op.usage";
}


public int a() {
return 3;
}


public java.lang.String a__String() {
return "op";
}

}
