package moom;


public class qd extends net.minecraft.command.CommandBase {

private static long c;

public qd() {
super();
}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_203b5407a9e5630a04fc(moom.qd a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_203b5407a9e5630a04fc {

public static java.util.List f1170(moom.qd receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    int lexicalValue1170_54_0;
    int lexicalValue1170_54_1;
    java.lang.String[] lexicalValue1170_56_0;
    java.util.List lexicalValue1170_69_0;
    int spill1170_0;
    int spill1170_1;
    java.lang.String[] spill1170_2;
    long life4_3;
    int life6_5;
    net.minecraft.scoreboard.Scoreboard life7_19;
    java.util.ArrayList life8_21;
    java.util.Iterator life9_25;
    net.minecraft.scoreboard.ScoreObjective life10_32;
    lexical_join_69: {
    lexical_join_68: {
    lexical_join_56: {
    lexical_join_54: {
    lexical_join_49: {
    lexical_join_41: {
    life4_3 = (__fieldRead1170_0() ^ 42635027893772L);
    life6_5 = __integerCategory1170_2(__call1170_1());
    spill1170_0 = (p1).length;
    spill1170_1 = 1;
    if (!((life6_5 == 0))) {
        lexicalValue1170_54_0 = spill1170_0;
        lexicalValue1170_54_1 = spill1170_1;
        break lexical_join_54;
    }
    if (!((spill1170_0 == spill1170_1))) {
        break lexical_join_49;
    }
    life7_19 = __call1170_5(__call1170_4(__call1170_3(), 0));
    life8_21 = __call1170_6();
    life9_25 = __call1170_8(__call1170_7(life7_19));
    lexical_cycle_23: while (true) {
    lexical_join_39: {
    if (!(__call1170_9(life9_25))) {
        break lexical_join_41;
    }
    life10_32 = __cast1170_11(__call1170_10(life9_25));
    if (!((__call1170_12(life10_32) == __fieldRead1170_13()))) {
        break lexical_join_39;
    }
    __call1170_15(life8_21, __call1170_14(life10_32));
    }
    if (!((life6_5 != 0))) { continue lexical_cycle_23; }
    break lexical_cycle_23;
    }
    }
    return __call1170_18(p1, __cast1170_17(__call1170_16(life8_21, new java.lang.String[0])));
    }
    spill1170_2 = p1;
    if (!((life6_5 == 0))) {
        lexicalValue1170_56_0 = spill1170_2;
        break lexical_join_56;
    }
    lexicalValue1170_54_0 = (spill1170_2).length;
    lexicalValue1170_54_1 = 2;
    }
    if (!((lexicalValue1170_54_0 == lexicalValue1170_54_1))) {
        break lexical_join_68;
    }
    lexicalValue1170_56_0 = p1;
    }
    lexicalValue1170_69_0 = __call1170_19(lexicalValue1170_56_0, new java.lang.String[] {"add", "set"});
    break lexical_join_69;
    }
    lexicalValue1170_69_0 = null;
    }
    return lexicalValue1170_69_0;
}
public static void h1170_0(moom.Oo p0) throws Throwable {
    throw __call1117000_0(p0);
}
public static void h1170_1(moom.Oo p0) throws Throwable {
    throw __call1117001_0(p0);
}
public static void h1170_2(moom.Oo p0) throws Throwable {
    throw __call1117002_0(p0);
}
private static native long __fieldRead1170_0() throws Throwable;
private static native boolean __call1170_1() throws Throwable;
private static native int __integerCategory1170_2(boolean value) throws Throwable;
private static native moom.Bl __call1170_3() throws Throwable;
private static native net.minecraft.world.WorldServer __call1170_4(moom.Bl a0, int a1) throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call1170_5(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.util.ArrayList __call1170_6() throws Throwable;
private static native java.util.Collection __call1170_7(net.minecraft.scoreboard.Scoreboard a0) throws Throwable;
private static native java.util.Iterator __call1170_8(java.util.Collection a0) throws Throwable;
private static native boolean __call1170_9(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1170_10(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.scoreboard.ScoreObjective __cast1170_11(java.lang.Object a0) throws Throwable;
private static native net.minecraft.scoreboard.IScoreObjectiveCriteria __call1170_12(net.minecraft.scoreboard.ScoreObjective a0) throws Throwable;
private static native net.minecraft.scoreboard.IScoreObjectiveCriteria __fieldRead1170_13() throws Throwable;
private static native java.lang.String __call1170_14(net.minecraft.scoreboard.ScoreObjective a0) throws Throwable;
private static native boolean __call1170_15(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object[] __call1170_16(java.util.ArrayList a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.String[] __cast1170_17(java.lang.Object[] a0) throws Throwable;
private static native java.util.List __call1170_18(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.util.List __call1170_19(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.Exception __call1117000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1117001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1117002_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_2f08d99f1934ef3aaa62(moom.qd a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_2f08d99f1934ef3aaa62 {

public static void f1169(moom.qd receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    int forwardValue1169_23_0;
    net.minecraft.command.ICommandSender forwardValue1169_30_0;
    net.minecraft.entity.Entity forwardValue1169_45_0;
    net.minecraft.scoreboard.ScoreObjective forwardValue1169_63_0;
    net.minecraft.scoreboard.Scoreboard forwardValue1169_96_0;
    java.lang.String forwardValue1169_96_1;
    net.minecraft.scoreboard.ScoreObjective forwardValue1169_96_2;
    int forwardValue1169_121_0;
    int forwardValue1169_134_0;
    net.minecraft.command.ICommandSender forwardValue1169_161_0;
    int spill1169_0;
    net.minecraft.command.ICommandSender spill1169_1;
    net.minecraft.entity.Entity spill1169_2;
    net.minecraft.scoreboard.ScoreObjective spill1169_3;
    net.minecraft.scoreboard.Scoreboard spill1169_4;
    java.lang.String spill1169_5;
    net.minecraft.scoreboard.ScoreObjective spill1169_6;
    boolean spill1169_7;
    net.minecraft.entity.player.EntityPlayerMP spill1169_8;
    long life3_3;
    int life5_5;
    net.minecraft.entity.player.EntityPlayerMP life6_34;
    net.minecraft.entity.Entity life7_42;
    net.minecraft.scoreboard.Scoreboard life7_67;
    net.minecraft.scoreboard.ScoreObjective life8_73;
    int life9_89;
    net.minecraft.scoreboard.Score life10_121;
    forward_join_199: {
    forward_join_186: {
    forward_join_184: {
    forward_join_161: {
    forward_join_151: {
    forward_join_148: {
    forward_join_134: {
    forward_join_129: {
    forward_join_121: {
    forward_join_116: {
    forward_join_96: {
    forward_join_92: {
    forward_join_63: {
    forward_join_47: {
    forward_join_45: {
    forward_join_44: {
    forward_join_30: {
    forward_join_29: {
    forward_join_23: {
    forward_join_19: {
    life3_3 = (__fieldRead1169_0() ^ 107539247128463L);
    life5_5 = __integerCategory1169_2(__call1169_1());
    spill1169_0 = (p1).length;
    if (!((life5_5 != 0))) {
        forwardValue1169_23_0 = spill1169_0;
        break forward_join_23;
    }
    if (!((spill1169_0 < 3))) {
        break forward_join_19;
    }
    throw new moom.cc("commands.trigger.usage", new java.lang.Object[0]);
    }
    spill1169_1 = p0;
    if (!((life5_5 != 0))) {
        forwardValue1169_30_0 = spill1169_1;
        break forward_join_30;
    }
    forwardValue1169_23_0 = __instanceOf1169_3(spill1169_1);
    }
    if (!((forwardValue1169_23_0 != 0))) {
        break forward_join_29;
    }
    life6_34 = __cast1169_4(p0);
    if (!((life5_5 == 0))) {
        break forward_join_47;
    }
    }
    forwardValue1169_30_0 = p0;
    }
    life7_42 = __call1169_5(forwardValue1169_30_0);
    spill1169_2 = life7_42;
    if (!((life5_5 != 0))) {
        forwardValue1169_45_0 = spill1169_2;
        break forward_join_45;
    }
    if (!((__instanceOf1169_6(spill1169_2) == 0))) {
        break forward_join_44;
    }
    throw new moom.b7("commands.trigger.invalidPlayer", new java.lang.Object[0]);
    }
    forwardValue1169_45_0 = life7_42;
    }
    life6_34 = __cast1169_7(forwardValue1169_45_0);
    }
    life7_67 = __call1169_10(__call1169_9(__call1169_8(), 0));
    life8_73 = __call1169_11(life7_67, (p1)[0]);
    spill1169_3 = life8_73;
    if (!((life5_5 != 0))) {
        forwardValue1169_63_0 = spill1169_3;
        break forward_join_63;
    }
    if (!((spill1169_3 != null))) {
        break forward_join_186;
    }
    forwardValue1169_63_0 = life8_73;
    }
    if (!((__call1169_12(forwardValue1169_63_0) == __fieldRead1169_13()))) {
        break forward_join_186;
    }
    life9_89 = __call1169_14((p1)[2]);
    spill1169_4 = life7_67;
    spill1169_5 = __call1169_15(life6_34);
    spill1169_6 = life8_73;
    if (!((life5_5 != 0))) {
        forwardValue1169_96_0 = spill1169_4;
        forwardValue1169_96_1 = spill1169_5;
        forwardValue1169_96_2 = spill1169_6;
        break forward_join_96;
    }
    if (!((!__call1169_16(spill1169_4, spill1169_5, spill1169_6)))) {
        break forward_join_92;
    }
    throw new moom.b7("commands.trigger.invalidObjective", new java.lang.Object[] {(p1)[0]});
    }
    forwardValue1169_96_0 = life7_67;
    forwardValue1169_96_1 = __call1169_17(life6_34);
    forwardValue1169_96_2 = life8_73;
    }
    life10_121 = __call1169_18(forwardValue1169_96_0, forwardValue1169_96_1, forwardValue1169_96_2);
    spill1169_7 = __call1169_19(life10_121);
    if (!((life5_5 != 0))) {
        forwardValue1169_121_0 = __integerCategory1169_20(spill1169_7);
        break forward_join_121;
    }
    if (!(spill1169_7)) {
        break forward_join_116;
    }
    throw new moom.b7("commands.trigger.disabled", new java.lang.Object[] {(p1)[0]});
    }
    forwardValue1169_121_0 = __integerCategory1169_22(__call1169_21("set", (p1)[1]));
    }
    if (!((life5_5 != 0))) {
        forwardValue1169_134_0 = forwardValue1169_121_0;
        break forward_join_134;
    }
    if (!((forwardValue1169_121_0 != 0))) {
        break forward_join_129;
    }
    __call1169_23(life10_121, life9_89);
    if (!((life5_5 == 0))) {
        break forward_join_151;
    }
    }
    forwardValue1169_134_0 = __integerCategory1169_25(__call1169_24("add", (p1)[1]));
    }
    if (!((forwardValue1169_134_0 == 0))) {
        break forward_join_148;
    }
    throw new moom.b7("commands.trigger.invalidMode", new java.lang.Object[] {(p1)[1]});
    }
    __call1169_26(life10_121, life9_89);
    }
    __call1169_27(life10_121, 1);
    spill1169_8 = life6_34;
    if (!((life5_5 != 0))) {
        forwardValue1169_161_0 = spill1169_8;
        break forward_join_161;
    }
    if (!(__call1169_29(__fieldRead1169_28(spill1169_8)))) {
        break forward_join_184;
    }
    forwardValue1169_161_0 = p0;
    }
    __call1169_30(forwardValue1169_161_0, receiver, "commands.trigger.success", new java.lang.Object[] {(p1)[0], (p1)[1], (p1)[2]});
    }
    if (!((life5_5 == 0))) {
        break forward_join_199;
    }
    }
    throw new moom.b7("commands.trigger.invalidObjective", new java.lang.Object[] {(p1)[0]});
    }
    return;
}
public static void h1169_0(moom.b7 p0) throws Throwable {
    throw __call1116900_0(p0);
}
public static void h1169_1(moom.b7 p0) throws Throwable {
    throw __call1116901_0(p0);
}
public static void h1169_2(moom.b7 p0) throws Throwable {
    throw __call1116902_0(p0);
}
public static void h1169_3(moom.b7 p0) throws Throwable {
    throw __call1116903_0(p0);
}
public static void h1169_4(moom.b7 p0) throws Throwable {
    throw __call1116904_0(p0);
}
public static void h1169_5(moom.b7 p0) throws Throwable {
    throw __call1116905_0(p0);
}
public static void h1169_6(moom.b7 p0) throws Throwable {
    throw __call1116906_0(p0);
}
public static void h1169_7(moom.b7 p0) throws Throwable {
    throw __call1116907_0(p0);
}
public static void h1169_8(moom.b7 p0) throws Throwable {
    throw __call1116908_0(p0);
}
public static void h1169_9(moom.b7 p0) throws Throwable {
    throw __call1116909_0(p0);
}
public static void h1169_10(moom.b7 p0) throws Throwable {
    throw __call1116910_0(p0);
}
public static void h1169_11(moom.b7 p0) throws Throwable {
    throw __call1116911_0(p0);
}
public static void h1169_12(moom.b7 p0) throws Throwable {
    throw __call1116912_0(p0);
}
public static void h1169_13(moom.b7 p0) throws Throwable {
    throw __call1116913_0(p0);
}
public static void h1169_14(moom.b7 p0) throws Throwable {
    throw __call1116914_0(p0);
}
public static void h1169_15(moom.b7 p0) throws Throwable {
    throw __call1116915_0(p0);
}
public static void h1169_16(moom.b7 p0) throws Throwable {
    throw __call1116916_0(p0);
}
public static void h1169_17(moom.b7 p0) throws Throwable {
    throw __call1116917_0(p0);
}
private static native long __fieldRead1169_0() throws Throwable;
private static native boolean __call1169_1() throws Throwable;
private static native int __integerCategory1169_2(boolean value) throws Throwable;
private static native int __instanceOf1169_3(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __cast1169_4(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native net.minecraft.entity.Entity __call1169_5(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native int __instanceOf1169_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __cast1169_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.Bl __call1169_8() throws Throwable;
private static native net.minecraft.world.WorldServer __call1169_9(moom.Bl a0, int a1) throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call1169_10(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.scoreboard.ScoreObjective __call1169_11(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.scoreboard.IScoreObjectiveCriteria __call1169_12(net.minecraft.scoreboard.ScoreObjective a0) throws Throwable;
private static native net.minecraft.scoreboard.IScoreObjectiveCriteria __fieldRead1169_13() throws Throwable;
private static native int __call1169_14(java.lang.String a0) throws Throwable;
private static native java.lang.String __call1169_15(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __call1169_16(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1, net.minecraft.scoreboard.ScoreObjective a2) throws Throwable;
private static native java.lang.String __call1169_17(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.scoreboard.Score __call1169_18(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1, net.minecraft.scoreboard.ScoreObjective a2) throws Throwable;
private static native boolean __call1169_19(net.minecraft.scoreboard.Score a0) throws Throwable;
private static native int __integerCategory1169_20(boolean value) throws Throwable;
private static native boolean __call1169_21(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1169_22(boolean value) throws Throwable;
private static native void __call1169_23(net.minecraft.scoreboard.Score a0, int a1) throws Throwable;
private static native boolean __call1169_24(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1169_25(boolean value) throws Throwable;
private static native void __call1169_26(net.minecraft.scoreboard.Score a0, int a1) throws Throwable;
private static native void __call1169_27(net.minecraft.scoreboard.Score a0, int a1) throws Throwable;
private static native moom.Bo __fieldRead1169_28(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __call1169_29(moom.Bo a0) throws Throwable;
private static native void __call1169_30(net.minecraft.command.ICommandSender a0, moom.qd a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call1116900_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1116901_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1116902_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1116903_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1116904_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1116905_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1116906_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1116907_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1116908_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1116909_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1116910_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1116911_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1116912_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1116913_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1116914_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1116915_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1116916_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1116917_0(moom.b7 a0) throws Throwable;

}


static {
moom.qd.c = (moom._c.a(-420517140628213654L, -7462522429588455404L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(235681746592547L);
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_203b5407a9e5630a04fc(this, p0, p1, p2); }


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_2f08d99f1934ef3aaa62(this, p0, p1); }


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.trigger.usage";
}


public int a() {
return 0;
}


public java.lang.String a__String() {
return "trigger";
}

}
