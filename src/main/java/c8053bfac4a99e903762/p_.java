package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class p_ extends net.minecraft.command.CommandBase {

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map g;

public p_() {
super();
}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_2ffd3da89f7797eb0a3d(moom.p_ a0) throws E;
private static final class __SourceHandler_2ffd3da89f7797eb0a3d {

public static java.util.List f183(moom.p_ receiver) throws Throwable {
    int lexicalValue183_34_0;
    boolean spill183_0;
    boolean spill183_1;
    long life1_3;
    java.util.Collection life4_10;
    int life3_11;
    java.util.ArrayList life5_13;
    java.util.Iterator life6_16;
    net.minecraft.scoreboard.ScoreObjective life7_23;
    lexical_join_37: {
    life1_3 = (__fieldRead183_0() ^ 66495310768206L);
    spill183_0 = __call183_1();
    life4_10 = __call183_5(__call183_4(__call183_3(__call183_2(), 0)));
    life3_11 = __integerCategory183_6(spill183_0);
    life5_13 = __call183_7();
    life6_16 = __call183_8(life4_10);
    lexical_cycle_17: while (true) {
    lexical_join_35: {
    lexical_join_34: {
    if (!(__call183_9(life6_16))) {
        break lexical_join_37;
    }
    life7_23 = __cast183_11(__call183_10(life6_16));
    spill183_1 = __call183_13(__call183_12(life7_23));
    if (!((life3_11 != 0))) {
        lexicalValue183_34_0 = __integerCategory183_14(spill183_1);
        break lexical_join_34;
    }
    if (!((!spill183_1))) {
        break lexical_join_35;
    }
    lexicalValue183_34_0 = __integerCategory183_17(__call183_16(life5_13, __call183_15(life7_23)));
    }
    __discardScalar183_18(lexicalValue183_34_0);
    }
    if (!((life3_11 == 0))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    return life5_13;
}
public static void h183_0(moom.Oo p0) throws Throwable {
    throw __call1018300_0(p0);
}
public static void h183_1(moom.Oo p0) throws Throwable {
    throw __call1018301_0(p0);
}
private static native long __fieldRead183_0() throws Throwable;
private static native boolean __call183_1() throws Throwable;
private static native moom.Bl __call183_2() throws Throwable;
private static native net.minecraft.world.WorldServer __call183_3(moom.Bl a0, int a1) throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call183_4(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.util.Collection __call183_5(net.minecraft.scoreboard.Scoreboard a0) throws Throwable;
private static native int __integerCategory183_6(boolean value) throws Throwable;
private static native java.util.ArrayList __call183_7() throws Throwable;
private static native java.util.Iterator __call183_8(java.util.Collection a0) throws Throwable;
private static native boolean __call183_9(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call183_10(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.scoreboard.ScoreObjective __cast183_11(java.lang.Object a0) throws Throwable;
private static native net.minecraft.scoreboard.IScoreObjectiveCriteria __call183_12(net.minecraft.scoreboard.ScoreObjective a0) throws Throwable;
private static native boolean __call183_13(net.minecraft.scoreboard.IScoreObjectiveCriteria a0) throws Throwable;
private static native int __integerCategory183_14(boolean value) throws Throwable;
private static native java.lang.String __call183_15(net.minecraft.scoreboard.ScoreObjective a0) throws Throwable;
private static native boolean __call183_16(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory183_17(boolean value) throws Throwable;
private static native void __discardScalar183_18(int a0) throws Throwable;
private static native java.lang.Exception __call1018300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018301_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_6a76a194593d5e597c4e(moom.p_ a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_6a76a194593d5e597c4e {

public static java.util.List f182(moom.p_ receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    int forwardValue182_28_0;
    int forwardValue182_28_1;
    int forwardValue182_46_0;
    int forwardValue182_47_0;
    int forwardValue182_47_1;
    int forwardValue182_71_0;
    int forwardValue182_72_0;
    int forwardValue182_72_1;
    int forwardValue182_86_0;
    int forwardValue182_86_1;
    int forwardValue182_100_0;
    int forwardValue182_100_1;
    int forwardValue182_118_0;
    int forwardValue182_118_1;
    int forwardValue182_136_0;
    int forwardValue182_136_1;
    int forwardValue182_156_0;
    int forwardValue182_156_1;
    int forwardValue182_164_0;
    java.lang.String[] forwardValue182_168_0;
    java.lang.String[] forwardValue182_173_0;
    java.lang.String[] forwardValue182_178_0;
    int forwardValue182_178_1;
    java.util.List forwardValue182_188_0;
    int spill182_0;
    int spill182_1;
    java.lang.String[] spill182_2;
    java.lang.String[] spill182_3;
    java.lang.String[] spill182_4;
    boolean spill182_5;
    int spill182_6;
    int spill182_7;
    boolean spill182_8;
    java.lang.String[] spill182_9;
    int spill182_10;
    java.lang.String[] spill182_11;
    int spill182_12;
    java.lang.String[] spill182_13;
    java.lang.String[] spill182_14;
    java.lang.String[] spill182_15;
    int spill182_16;
    java.lang.String[] spill182_17;
    java.lang.String[] spill182_18;
    java.lang.String[] spill182_19;
    long life4_3;
    int life6_5;
    forward_join_188: {
    forward_join_178: {
    forward_join_176: {
    forward_join_173: {
    forward_join_172: {
    forward_join_168: {
    forward_join_167: {
    forward_join_165: {
    forward_join_164: {
    forward_join_156: {
    forward_join_147: {
    forward_join_136: {
    forward_join_129: {
    forward_join_118: {
    forward_join_111: {
    forward_join_100: {
    forward_join_97: {
    forward_join_86: {
    forward_join_83: {
    forward_join_72: {
    forward_join_71: {
    forward_join_69: {
    forward_join_47: {
    forward_join_46: {
    forward_join_44: {
    forward_join_28: {
    forward_join_25: {
    life4_3 = (__fieldRead182_0() ^ 1780117221410L);
    life6_5 = __integerCategory182_2(__call182_1());
    spill182_0 = (p1).length;
    spill182_1 = 1;
    if (!((life6_5 != 0))) {
        forwardValue182_28_0 = spill182_0;
        forwardValue182_28_1 = spill182_1;
        break forward_join_28;
    }
    if (!((spill182_0 == spill182_1))) {
        break forward_join_25;
    }
    spill182_2 = p1;
    java.lang.String[] __stackOp182_3_0 = new java.lang.String[2];
    spill182_3 = __stackOp182_3_0;
    (__stackOp182_3_0)[0] = "entity";
    java.lang.String[] __stackOp182_4_0 = spill182_3;
    spill182_4 = __stackOp182_4_0;
    (__stackOp182_4_0)[1] = "block";
    forwardValue182_188_0 = __call182_5(spill182_2, spill182_4);
    break forward_join_188;
    }
    forwardValue182_28_0 = (p1).length;
    forwardValue182_28_1 = 2;
    }
    if (!((life6_5 != 0))) {
        forwardValue182_47_0 = forwardValue182_28_0;
        forwardValue182_47_1 = forwardValue182_28_1;
        break forward_join_47;
    }
    if (!((forwardValue182_28_0 == forwardValue182_28_1))) {
        break forward_join_44;
    }
    spill182_5 = __call182_6((p1)[0], "entity");
    if (!((life6_5 != 0))) {
        forwardValue182_46_0 = __integerCategory182_7(spill182_5);
        break forward_join_46;
    }
    if (!(spill182_5)) {
        break forward_join_44;
    }
    forwardValue182_188_0 = __call182_9(p1, __call182_8(receiver));
    break forward_join_188;
    }
    forwardValue182_46_0 = (p1).length;
    }
    forwardValue182_47_0 = forwardValue182_46_0;
    forwardValue182_47_1 = 2;
    }
    if (!((life6_5 != 0))) {
        forwardValue182_72_0 = forwardValue182_47_0;
        forwardValue182_72_1 = forwardValue182_47_1;
        break forward_join_72;
    }
    if (!((forwardValue182_47_0 >= forwardValue182_47_1))) {
        break forward_join_69;
    }
    spill182_6 = (p1).length;
    spill182_7 = 4;
    if (!((life6_5 != 0))) {
        forwardValue182_72_0 = spill182_6;
        forwardValue182_72_1 = spill182_7;
        break forward_join_72;
    }
    if (!((spill182_6 <= spill182_7))) {
        break forward_join_69;
    }
    spill182_8 = __call182_10((p1)[0], "block");
    if (!((life6_5 != 0))) {
        forwardValue182_71_0 = __integerCategory182_11(spill182_8);
        break forward_join_71;
    }
    if (!(spill182_8)) {
        break forward_join_69;
    }
    forwardValue182_188_0 = __call182_12(p1, 1, p2);
    break forward_join_188;
    }
    forwardValue182_71_0 = (p1).length;
    }
    forwardValue182_72_0 = forwardValue182_71_0;
    forwardValue182_72_1 = 3;
    }
    if (!((life6_5 != 0))) {
        forwardValue182_86_0 = forwardValue182_72_0;
        forwardValue182_86_1 = forwardValue182_72_1;
        break forward_join_86;
    }
    if (!((forwardValue182_72_0 == forwardValue182_72_1))) {
        break forward_join_83;
    }
    spill182_9 = p1;
    spill182_10 = 0;
    if (!((life6_5 != 0))) {
        forwardValue182_178_0 = spill182_9;
        forwardValue182_178_1 = spill182_10;
        break forward_join_178;
    }
    if (!((!__call182_13((spill182_9)[spill182_10], "entity")))) {
        break forward_join_176;
    }
    }
    forwardValue182_86_0 = (p1).length;
    forwardValue182_86_1 = 5;
    }
    if (!((life6_5 != 0))) {
        forwardValue182_100_0 = forwardValue182_86_0;
        forwardValue182_100_1 = forwardValue182_86_1;
        break forward_join_100;
    }
    if (!((forwardValue182_86_0 == forwardValue182_86_1))) {
        break forward_join_97;
    }
    spill182_11 = p1;
    spill182_12 = 0;
    if (!((life6_5 != 0))) {
        forwardValue182_178_0 = spill182_11;
        forwardValue182_178_1 = spill182_12;
        break forward_join_178;
    }
    if (!((!__call182_14((spill182_11)[spill182_12], "block")))) {
        break forward_join_176;
    }
    }
    forwardValue182_100_0 = (p1).length;
    forwardValue182_100_1 = 4;
    }
    if (!((life6_5 != 0))) {
        forwardValue182_118_0 = forwardValue182_100_0;
        forwardValue182_118_1 = forwardValue182_100_1;
        break forward_join_118;
    }
    if (!((forwardValue182_100_0 == forwardValue182_100_1))) {
        break forward_join_111;
    }
    spill182_13 = p1;
    if (!((life6_5 != 0))) {
        forwardValue182_173_0 = spill182_13;
        break forward_join_173;
    }
    if (!((!__call182_15((spill182_13)[0], "entity")))) {
        break forward_join_172;
    }
    }
    forwardValue182_118_0 = (p1).length;
    forwardValue182_118_1 = __invokedynamic182_16(3746, (1153615633166897866L ^ life4_3));
    }
    if (!((life6_5 != 0))) {
        forwardValue182_136_0 = forwardValue182_118_0;
        forwardValue182_136_1 = forwardValue182_118_1;
        break forward_join_136;
    }
    if (!((forwardValue182_118_0 == forwardValue182_118_1))) {
        break forward_join_129;
    }
    spill182_14 = p1;
    if (!((life6_5 != 0))) {
        forwardValue182_173_0 = spill182_14;
        break forward_join_173;
    }
    if (!((!__call182_17((spill182_14)[0], "block")))) {
        break forward_join_172;
    }
    }
    forwardValue182_136_0 = (p1).length;
    forwardValue182_136_1 = __invokedynamic182_18(11377, (4851438616697778202L ^ life4_3));
    }
    if (!((life6_5 != 0))) {
        forwardValue182_156_0 = forwardValue182_136_0;
        forwardValue182_156_1 = forwardValue182_136_1;
        break forward_join_156;
    }
    if (!((forwardValue182_136_0 == forwardValue182_136_1))) {
        break forward_join_147;
    }
    spill182_15 = p1;
    if (!((life6_5 != 0))) {
        forwardValue182_168_0 = spill182_15;
        break forward_join_168;
    }
    if (!((!__call182_19((spill182_15)[0], "entity")))) {
        break forward_join_167;
    }
    }
    spill182_16 = (p1).length;
    if (!((life6_5 != 0))) {
        forwardValue182_164_0 = spill182_16;
        break forward_join_164;
    }
    forwardValue182_156_0 = spill182_16;
    forwardValue182_156_1 = __invokedynamic182_20(4344, (9019829652381797522L ^ life4_3));
    }
    if (!((forwardValue182_156_0 == forwardValue182_156_1))) {
        break forward_join_165;
    }
    spill182_17 = p1;
    if (!((life6_5 != 0))) {
        forwardValue182_168_0 = spill182_17;
        break forward_join_168;
    }
    forwardValue182_164_0 = __integerCategory182_22(__call182_21((spill182_17)[0], "block"));
    }
    if (!((forwardValue182_164_0 == 0))) {
        break forward_join_167;
    }
    }
    forwardValue182_188_0 = null;
    break forward_join_188;
    }
    forwardValue182_168_0 = p1;
    }
    forwardValue182_188_0 = __call182_24(forwardValue182_168_0, __call182_23(receiver));
    break forward_join_188;
    }
    forwardValue182_173_0 = p1;
    }
    forwardValue182_188_0 = __call182_26(forwardValue182_173_0, __call182_25());
    break forward_join_188;
    }
    forwardValue182_178_0 = p1;
    forwardValue182_178_1 = 2;
    }
    java.lang.String[] __stackOp182_27_0 = new java.lang.String[forwardValue182_178_1];
    spill182_18 = __stackOp182_27_0;
    (__stackOp182_27_0)[0] = "set";
    java.lang.String[] __stackOp182_28_0 = spill182_18;
    spill182_19 = __stackOp182_28_0;
    (__stackOp182_28_0)[1] = "clear";
    forwardValue182_188_0 = __call182_29(forwardValue182_178_0, spill182_19);
    }
    return forwardValue182_188_0;
}
public static void h182_0(moom.Oo p0) throws Throwable {
    throw __call1018200_0(p0);
}
public static void h182_1(moom.Oo p0) throws Throwable {
    throw __call1018201_0(p0);
}
public static void h182_2(moom.Oo p0) throws Throwable {
    throw __call1018202_0(p0);
}
public static void h182_3(moom.Oo p0) throws Throwable {
    throw __call1018203_0(p0);
}
public static void h182_4(moom.Oo p0) throws Throwable {
    throw __call1018204_0(p0);
}
public static void h182_5(moom.Oo p0) throws Throwable {
    throw __call1018205_0(p0);
}
public static void h182_6(moom.Oo p0) throws Throwable {
    throw __call1018206_0(p0);
}
public static void h182_7(moom.Oo p0) throws Throwable {
    throw __call1018207_0(p0);
}
public static void h182_8(moom.Oo p0) throws Throwable {
    throw __call1018208_0(p0);
}
public static void h182_9(moom.Oo p0) throws Throwable {
    throw __call1018209_0(p0);
}
public static void h182_10(moom.Oo p0) throws Throwable {
    throw __call1018210_0(p0);
}
public static void h182_11(moom.Oo p0) throws Throwable {
    throw __call1018211_0(p0);
}
public static void h182_12(moom.Oo p0) throws Throwable {
    throw __call1018212_0(p0);
}
public static void h182_13(moom.Oo p0) throws Throwable {
    throw __call1018213_0(p0);
}
public static void h182_14(moom.Oo p0) throws Throwable {
    throw __call1018214_0(p0);
}
public static void h182_15(moom.Oo p0) throws Throwable {
    throw __call1018215_0(p0);
}
public static void h182_16(moom.Oo p0) throws Throwable {
    throw __call1018216_0(p0);
}
public static void h182_17(moom.Oo p0) throws Throwable {
    throw __call1018217_0(p0);
}
public static void h182_18(moom.Oo p0) throws Throwable {
    throw __call1018218_0(p0);
}
public static void h182_19(moom.Oo p0) throws Throwable {
    throw __call1018219_0(p0);
}
public static void h182_20(moom.Oo p0) throws Throwable {
    throw __call1018220_0(p0);
}
public static void h182_21(moom.Oo p0) throws Throwable {
    throw __call1018221_0(p0);
}
public static void h182_22(moom.Oo p0) throws Throwable {
    throw __call1018222_0(p0);
}
public static void h182_23(moom.Oo p0) throws Throwable {
    throw __call1018223_0(p0);
}
public static void h182_24(moom.Oo p0) throws Throwable {
    throw __call1018224_0(p0);
}
public static void h182_25(moom.Oo p0) throws Throwable {
    throw __call1018225_0(p0);
}
public static void h182_26(moom.Oo p0) throws Throwable {
    throw __call1018226_0(p0);
}
public static void h182_27(moom.Oo p0) throws Throwable {
    throw __call1018227_0(p0);
}
public static void h182_28(moom.Oo p0) throws Throwable {
    throw __call1018228_0(p0);
}
public static void h182_29(moom.Oo p0) throws Throwable {
    throw __call1018229_0(p0);
}
public static void h182_30(moom.Oo p0) throws Throwable {
    throw __call1018230_0(p0);
}
public static void h182_31(moom.Oo p0) throws Throwable {
    throw __call1018231_0(p0);
}
public static void h182_32(moom.Oo p0) throws Throwable {
    throw __call1018232_0(p0);
}
public static void h182_33(moom.Oo p0) throws Throwable {
    throw __call1018233_0(p0);
}
public static void h182_34(moom.Oo p0) throws Throwable {
    throw __call1018234_0(p0);
}
public static void h182_35(moom.Oo p0) throws Throwable {
    throw __call1018235_0(p0);
}
private static native long __fieldRead182_0() throws Throwable;
private static native boolean __call182_1() throws Throwable;
private static native int __integerCategory182_2(boolean value) throws Throwable;
private static native java.util.List __call182_5(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native boolean __call182_6(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory182_7(boolean value) throws Throwable;
private static native java.lang.String[] __call182_8(moom.p_ a0) throws Throwable;
private static native java.util.List __call182_9(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native boolean __call182_10(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory182_11(boolean value) throws Throwable;
private static native java.util.List __call182_12(java.lang.String[] a0, int a1, moom.DT a2) throws Throwable;
private static native boolean __call182_13(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __call182_14(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __call182_15(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic182_16(int a0, long a1) throws Throwable;
private static native boolean __call182_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic182_18(int a0, long a1) throws Throwable;
private static native boolean __call182_19(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic182_20(int a0, long a1) throws Throwable;
private static native boolean __call182_21(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory182_22(boolean value) throws Throwable;
private static native java.util.List __call182_23(moom.p_ a0) throws Throwable;
private static native java.util.List __call182_24(java.lang.String[] a0, java.util.List a1) throws Throwable;
private static native java.lang.String[] __call182_25() throws Throwable;
private static native java.util.List __call182_26(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.util.List __call182_29(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.Exception __call1018200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018203_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018204_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018205_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018206_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018207_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018208_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018209_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018210_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018211_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018212_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018213_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018214_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018215_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018216_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018217_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018218_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018219_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018220_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018221_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018222_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018223_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018224_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018225_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018226_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018227_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018228_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018229_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018230_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018231_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018232_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018233_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018234_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018235_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_12f6d6b96d713d27a78c(moom.p_ a0, java.lang.String[] a1, int a2) throws E;
private static final class __SourceHandler_12f6d6b96d713d27a78c {

public static boolean f1138(moom.p_ receiver, java.lang.String[] p0, int p1) throws Throwable {
    int forwardValue1138_16_0;
    int forwardValue1138_20_0;
    int forwardValue1138_25_0;
    int forwardValue1138_27_0;
    int spill1138_0;
    long life3_3;
    int life5_5;
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    forward_join_20: {
    forward_join_16: {
    life3_3 = (__fieldRead1138_0() ^ 62925478330425L);
    life5_5 = __integerCategory1138_2(__call1138_1());
    spill1138_0 = (p0).length;
    if (!((life5_5 != 0))) {
        forwardValue1138_16_0 = spill1138_0;
        break forward_join_16;
    }
    if (!((spill1138_0 > 0))) {
        break forward_join_26;
    }
    forwardValue1138_16_0 = __integerCategory1138_4(__call1138_3((p0)[0], "entity"));
    }
    if (!((life5_5 != 0))) {
        forwardValue1138_20_0 = forwardValue1138_16_0;
        break forward_join_20;
    }
    if (!((forwardValue1138_16_0 != 0))) {
        break forward_join_26;
    }
    forwardValue1138_20_0 = p1;
    }
    if (!((life5_5 != 0))) {
        forwardValue1138_25_0 = forwardValue1138_20_0;
        break forward_join_25;
    }
    if (!((forwardValue1138_20_0 == 1))) {
        break forward_join_26;
    }
    forwardValue1138_25_0 = 1;
    }
    forwardValue1138_27_0 = forwardValue1138_25_0;
    break forward_join_27;
    }
    forwardValue1138_27_0 = 0;
    }
    return __integerCategory1138_5(forwardValue1138_27_0);
}
public static void h1138_0(moom.Oo p0) throws Throwable {
    throw __call1113800_0(p0);
}
public static void h1138_1(moom.Oo p0) throws Throwable {
    throw __call1113801_0(p0);
}
public static void h1138_2(moom.Oo p0) throws Throwable {
    throw __call1113802_0(p0);
}
public static void h1138_3(moom.Oo p0) throws Throwable {
    throw __call1113803_0(p0);
}
public static void h1138_4(moom.Oo p0) throws Throwable {
    throw __call1113804_0(p0);
}
private static native long __fieldRead1138_0() throws Throwable;
private static native boolean __call1138_1() throws Throwable;
private static native int __integerCategory1138_2(boolean value) throws Throwable;
private static native boolean __call1138_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1138_4(boolean value) throws Throwable;
private static native boolean __integerCategory1138_5(int value) throws Throwable;
private static native java.lang.Exception __call1113800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1113801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1113802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1113803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1113804_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_1579179d03043f247463(moom.p_ a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_1579179d03043f247463 {

public static void f1136(moom.p_ receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    int forwardValue1136_24_0;
    int forwardValue1136_36_0;
    int forwardValue1136_47_0;
    int forwardValue1136_66_0;
    int forwardValue1136_71_0;
    int forwardValue1136_83_0;
    int forwardValue1136_123_0;
    int forwardValue1136_137_0;
    java.lang.String[] forwardValue1136_159_0;
    net.minecraft.tileentity.TileEntity forwardValue1136_218_0;
    int forwardValue1136_232_0;
    net.minecraft.tileentity.TileEntity forwardValue1136_259_0;
    int forwardValue1136_295_0;
    int forwardValue1136_332_0;
    int forwardValue1136_352_0;
    int spill1136_0;
    int spill1136_1;
    int spill1136_2;
    boolean spill1136_3;
    java.lang.String[] spill1136_4;
    java.lang.String[] spill1136_5;
    net.minecraft.tileentity.TileEntity spill1136_6;
    int spill1136_7;
    net.minecraft.tileentity.TileEntity spill1136_8;
    boolean spill1136_9;
    int spill1136_10;
    long life3_3;
    int life5_5;
    int life6_36;
    int life7_93;
    java.lang.String life8_123;
    net.minecraft.command.CommandResultStats$Type life9_225;
    net.minecraft.world.World life10_239;
    moom.DT life12_247;
    net.minecraft.tileentity.TileEntity life13_251;
    moom.qN life11_297;
    net.minecraft.entity.Entity life12_349;
    java.lang.String life12_366;
    java.lang.String life13_370;
    moom.DT life12_458;
    net.minecraft.tileentity.TileEntity life13_462;
    forward_join_365: {
    forward_join_352: {
    forward_join_351: {
    forward_join_332: {
    forward_join_329: {
    forward_join_303: {
    forward_join_296: {
    forward_join_295: {
    forward_join_273: {
    forward_join_264: {
    forward_join_262: {
    forward_join_259: {
    forward_join_258: {
    forward_join_232: {
    forward_join_228: {
    forward_join_218: {
    forward_join_217: {
    forward_join_173: {
    forward_join_159: {
    forward_join_158: {
    forward_join_151: {
    forward_join_137: {
    forward_join_133: {
    forward_join_123: {
    forward_join_120: {
    forward_join_113: {
    forward_join_84: {
    forward_join_83: {
    forward_join_82: {
    forward_join_71: {
    forward_join_69: {
    forward_join_66: {
    forward_join_65: {
    forward_join_48: {
    forward_join_47: {
    forward_join_46: {
    forward_join_36: {
    forward_join_31: {
    forward_join_24: {
    forward_join_19: {
    life3_3 = (__fieldRead1136_0() ^ 77612817818017L);
    life5_5 = __integerCategory1136_2(__call1136_1());
    spill1136_0 = (p1).length;
    if (!((life5_5 != 0))) {
        forwardValue1136_24_0 = spill1136_0;
        break forward_join_24;
    }
    if (!((spill1136_0 < 1))) {
        break forward_join_19;
    }
    throw new moom.cc("commands.stats.usage", new java.lang.Object[0]);
    }
    forwardValue1136_24_0 = __integerCategory1136_4(__call1136_3((p1)[0], "entity"));
    }
    if (!((life5_5 != 0))) {
        forwardValue1136_36_0 = forwardValue1136_24_0;
        break forward_join_36;
    }
    if (!((forwardValue1136_24_0 != 0))) {
        break forward_join_31;
    }
    life6_36 = 0;
    if (!((life5_5 == 0))) {
        break forward_join_48;
    }
    }
    forwardValue1136_36_0 = __integerCategory1136_6(__call1136_5((p1)[0], "block"));
    }
    if (!((life5_5 != 0))) {
        forwardValue1136_47_0 = forwardValue1136_36_0;
        break forward_join_47;
    }
    if (!((forwardValue1136_36_0 == 0))) {
        break forward_join_46;
    }
    throw new moom.cc("commands.stats.usage", new java.lang.Object[0]);
    }
    forwardValue1136_47_0 = 1;
    }
    life6_36 = forwardValue1136_47_0;
    }
    spill1136_1 = life6_36;
    if (!((life5_5 != 0))) {
        forwardValue1136_71_0 = spill1136_1;
        break forward_join_71;
    }
    if (!((spill1136_1 != 0))) {
        break forward_join_69;
    }
    spill1136_2 = (p1).length;
    if (!((life5_5 != 0))) {
        forwardValue1136_66_0 = spill1136_2;
        break forward_join_66;
    }
    if (!((spill1136_2 < 5))) {
        break forward_join_65;
    }
    throw new moom.cc("commands.stats.block.usage", new java.lang.Object[0]);
    }
    forwardValue1136_66_0 = 4;
    }
    life7_93 = forwardValue1136_66_0;
    if (!((life5_5 == 0))) {
        break forward_join_84;
    }
    }
    forwardValue1136_71_0 = (p1).length;
    }
    if (!((life5_5 != 0))) {
        forwardValue1136_83_0 = forwardValue1136_71_0;
        break forward_join_83;
    }
    if (!((forwardValue1136_71_0 < 3))) {
        break forward_join_82;
    }
    throw new moom.cc("commands.stats.entity.usage", new java.lang.Object[0]);
    }
    forwardValue1136_83_0 = 2;
    }
    life7_93 = forwardValue1136_83_0;
    }
    life8_123 = (p1)[(life7_93++)];
    spill1136_3 = __call1136_7("set", life8_123);
    if (!((life5_5 != 0))) {
        forwardValue1136_123_0 = __integerCategory1136_8(spill1136_3);
        break forward_join_123;
    }
    if (!(spill1136_3)) {
        break forward_join_120;
    }
    spill1136_4 = p1;
    if (!((life5_5 != 0))) {
        forwardValue1136_159_0 = spill1136_4;
        break forward_join_159;
    }
    if (!(((spill1136_4).length < (life7_93 + 3)))) {
        break forward_join_158;
    }
    if (!((life7_93 == 5))) {
        break forward_join_113;
    }
    throw new moom.cc("commands.stats.block.set.usage", new java.lang.Object[0]);
    }
    throw new moom.cc("commands.stats.entity.set.usage", new java.lang.Object[0]);
    }
    forwardValue1136_123_0 = __integerCategory1136_10(__call1136_9("clear", life8_123));
    }
    if (!((life5_5 != 0))) {
        forwardValue1136_137_0 = forwardValue1136_123_0;
        break forward_join_137;
    }
    if (!((forwardValue1136_123_0 == 0))) {
        break forward_join_133;
    }
    throw new moom.cc("commands.stats.usage", new java.lang.Object[0]);
    }
    spill1136_5 = p1;
    if (!((life5_5 != 0))) {
        forwardValue1136_159_0 = spill1136_5;
        break forward_join_159;
    }
    forwardValue1136_137_0 = (spill1136_5).length;
    }
    if (!((forwardValue1136_137_0 < (life7_93 + 1)))) {
        break forward_join_158;
    }
    if (!((life7_93 == 5))) {
        break forward_join_151;
    }
    throw new moom.cc("commands.stats.block.clear.usage", new java.lang.Object[0]);
    }
    throw new moom.cc("commands.stats.entity.clear.usage", new java.lang.Object[0]);
    }
    forwardValue1136_159_0 = p1;
    }
    life9_225 = __call1136_11((forwardValue1136_159_0)[(life7_93++)]);
    if (!((life9_225 == null))) {
        break forward_join_173;
    }
    throw new moom.b7("commands.stats.failed", new java.lang.Object[0]);
    }
    life10_239 = __call1136_12(p0);
    if (!((life6_36 != 0))) {
        break forward_join_264;
    }
    life12_247 = __call1136_13(p0, p1, 1, 0);
    life13_251 = __call1136_14(life10_239, life12_247);
    spill1136_6 = life13_251;
    if (!((life5_5 != 0))) {
        forwardValue1136_218_0 = spill1136_6;
        break forward_join_218;
    }
    if (!((spill1136_6 == null))) {
        break forward_join_217;
    }
    throw new moom.b7("commands.stats.noCompatibleBlock", new java.lang.Object[] {__call1136_16(__call1136_15(life12_247)), __call1136_18(__call1136_17(life12_247)), __call1136_20(__call1136_19(life12_247))});
    }
    forwardValue1136_218_0 = life13_251;
    }
    spill1136_7 = __instanceOf1136_21(forwardValue1136_218_0);
    if (!((life5_5 != 0))) {
        forwardValue1136_232_0 = spill1136_7;
        break forward_join_232;
    }
    if (!((spill1136_7 != 0))) {
        break forward_join_228;
    }
    life11_297 = __call1136_23(__cast1136_22(life13_251));
    if (!((life5_5 == 0))) {
        break forward_join_262;
    }
    }
    spill1136_8 = life13_251;
    if (!((life5_5 != 0))) {
        forwardValue1136_259_0 = spill1136_8;
        break forward_join_259;
    }
    forwardValue1136_232_0 = __instanceOf1136_24(spill1136_8);
    }
    if (!((forwardValue1136_232_0 == 0))) {
        break forward_join_258;
    }
    throw new moom.b7("commands.stats.noCompatibleBlock", new java.lang.Object[] {__call1136_26(__call1136_25(life12_247)), __call1136_28(__call1136_27(life12_247)), __call1136_30(__call1136_29(life12_247))});
    }
    forwardValue1136_259_0 = life13_251;
    }
    life11_297 = __call1136_32(__cast1136_31(forwardValue1136_259_0));
    }
    if (!((life5_5 == 0))) {
        break forward_join_273;
    }
    }
    life12_349 = __call1136_33(p0, (p1)[1]);
    life11_297 = __call1136_34(life12_349);
    }
    spill1136_9 = __call1136_35("set", life8_123);
    if (!((life5_5 != 0))) {
        forwardValue1136_332_0 = __integerCategory1136_36(spill1136_9);
        break forward_join_332;
    }
    if (!(spill1136_9)) {
        break forward_join_329;
    }
    life12_366 = (p1)[(life7_93++)];
    life13_370 = (p1)[life7_93];
    spill1136_10 = __call1136_37(life12_366);
    if (!((life5_5 != 0))) {
        forwardValue1136_295_0 = spill1136_10;
        break forward_join_295;
    }
    if (!((spill1136_10 != 0))) {
        break forward_join_296;
    }
    forwardValue1136_295_0 = __call1136_38(life13_370);
    }
    if (!((forwardValue1136_295_0 == 0))) {
        break forward_join_303;
    }
    }
    throw new moom.b7("commands.stats.failed", new java.lang.Object[0]);
    }
    __call1136_39(life11_297, life9_225, life12_366, life13_370);
    __call1136_41(p0, receiver, "commands.stats.success", new java.lang.Object[] {__call1136_40(life9_225), life13_370, life12_366});
    if (!((life5_5 == 0))) {
        break forward_join_351;
    }
    }
    forwardValue1136_332_0 = __integerCategory1136_43(__call1136_42("clear", life8_123));
    }
    if (!((life5_5 != 0))) {
        forwardValue1136_352_0 = forwardValue1136_332_0;
        break forward_join_352;
    }
    if (!((forwardValue1136_332_0 != 0))) {
        break forward_join_351;
    }
    __call1136_44(life11_297, life9_225, null, null);
    __call1136_46(p0, receiver, "commands.stats.cleared", new java.lang.Object[] {__call1136_45(life9_225)});
    }
    forwardValue1136_352_0 = life6_36;
    }
    if (!((forwardValue1136_352_0 != 0))) {
        break forward_join_365;
    }
    life12_458 = __call1136_47(p0, p1, 1, 0);
    life13_462 = __call1136_48(life10_239, life12_458);
    __call1136_49(life13_462);
    }
    return;
}
public static void h1136_0(moom.b7 p0) throws Throwable {
    throw __call1113600_0(p0);
}
public static void h1136_1(moom.b7 p0) throws Throwable {
    throw __call1113601_0(p0);
}
public static void h1136_2(moom.b7 p0) throws Throwable {
    throw __call1113602_0(p0);
}
public static void h1136_3(moom.b7 p0) throws Throwable {
    throw __call1113603_0(p0);
}
public static void h1136_4(moom.b7 p0) throws Throwable {
    throw __call1113604_0(p0);
}
public static void h1136_5(moom.b7 p0) throws Throwable {
    throw __call1113605_0(p0);
}
public static void h1136_6(moom.b7 p0) throws Throwable {
    throw __call1113606_0(p0);
}
public static void h1136_7(moom.b7 p0) throws Throwable {
    throw __call1113607_0(p0);
}
public static void h1136_8(moom.b7 p0) throws Throwable {
    throw __call1113608_0(p0);
}
public static void h1136_9(moom.b7 p0) throws Throwable {
    throw __call1113609_0(p0);
}
public static void h1136_10(moom.b7 p0) throws Throwable {
    throw __call1113610_0(p0);
}
public static void h1136_11(moom.b7 p0) throws Throwable {
    throw __call1113611_0(p0);
}
public static void h1136_12(moom.b7 p0) throws Throwable {
    throw __call1113612_0(p0);
}
public static void h1136_13(moom.b7 p0) throws Throwable {
    throw __call1113613_0(p0);
}
public static void h1136_14(moom.b7 p0) throws Throwable {
    throw __call1113614_0(p0);
}
public static void h1136_15(moom.b7 p0) throws Throwable {
    throw __call1113615_0(p0);
}
public static void h1136_16(moom.b7 p0) throws Throwable {
    throw __call1113616_0(p0);
}
public static void h1136_17(moom.b7 p0) throws Throwable {
    throw __call1113617_0(p0);
}
public static void h1136_18(moom.b7 p0) throws Throwable {
    throw __call1113618_0(p0);
}
public static void h1136_19(moom.b7 p0) throws Throwable {
    throw __call1113619_0(p0);
}
public static void h1136_20(moom.b7 p0) throws Throwable {
    throw __call1113620_0(p0);
}
public static void h1136_21(moom.b7 p0) throws Throwable {
    throw __call1113621_0(p0);
}
public static void h1136_22(moom.b7 p0) throws Throwable {
    throw __call1113622_0(p0);
}
public static void h1136_23(moom.b7 p0) throws Throwable {
    throw __call1113623_0(p0);
}
public static void h1136_24(moom.b7 p0) throws Throwable {
    throw __call1113624_0(p0);
}
public static void h1136_25(moom.b7 p0) throws Throwable {
    throw __call1113625_0(p0);
}
public static void h1136_26(moom.b7 p0) throws Throwable {
    throw __call1113626_0(p0);
}
public static void h1136_27(moom.b7 p0) throws Throwable {
    throw __call1113627_0(p0);
}
public static void h1136_28(moom.b7 p0) throws Throwable {
    throw __call1113628_0(p0);
}
public static void h1136_29(moom.b7 p0) throws Throwable {
    throw __call1113629_0(p0);
}
public static void h1136_30(moom.b7 p0) throws Throwable {
    throw __call1113630_0(p0);
}
public static void h1136_31(moom.b7 p0) throws Throwable {
    throw __call1113631_0(p0);
}
public static void h1136_32(moom.b7 p0) throws Throwable {
    throw __call1113632_0(p0);
}
public static void h1136_33(moom.b7 p0) throws Throwable {
    throw __call1113633_0(p0);
}
public static void h1136_34(moom.b7 p0) throws Throwable {
    throw __call1113634_0(p0);
}
public static void h1136_35(moom.b7 p0) throws Throwable {
    throw __call1113635_0(p0);
}
public static void h1136_36(moom.b7 p0) throws Throwable {
    throw __call1113636_0(p0);
}
private static native long __fieldRead1136_0() throws Throwable;
private static native boolean __call1136_1() throws Throwable;
private static native int __integerCategory1136_2(boolean value) throws Throwable;
private static native boolean __call1136_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1136_4(boolean value) throws Throwable;
private static native boolean __call1136_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1136_6(boolean value) throws Throwable;
private static native boolean __call1136_7(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1136_8(boolean value) throws Throwable;
private static native boolean __call1136_9(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1136_10(boolean value) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __call1136_11(java.lang.String a0) throws Throwable;
private static native net.minecraft.world.World __call1136_12(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native moom.DT __call1136_13(net.minecraft.command.ICommandSender a0, java.lang.String[] a1, int a2, int a3) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call1136_14(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __call1136_15(moom.DT a0) throws Throwable;
private static native java.lang.Integer __call1136_16(int a0) throws Throwable;
private static native int __call1136_17(moom.DT a0) throws Throwable;
private static native java.lang.Integer __call1136_18(int a0) throws Throwable;
private static native int __call1136_19(moom.DT a0) throws Throwable;
private static native java.lang.Integer __call1136_20(int a0) throws Throwable;
private static native int __instanceOf1136_21(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntityCommandBlock __cast1136_22(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.qN __call1136_23(net.minecraft.tileentity.TileEntityCommandBlock a0) throws Throwable;
private static native int __instanceOf1136_24(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native int __call1136_25(moom.DT a0) throws Throwable;
private static native java.lang.Integer __call1136_26(int a0) throws Throwable;
private static native int __call1136_27(moom.DT a0) throws Throwable;
private static native java.lang.Integer __call1136_28(int a0) throws Throwable;
private static native int __call1136_29(moom.DT a0) throws Throwable;
private static native java.lang.Integer __call1136_30(int a0) throws Throwable;
private static native moom.Ct __cast1136_31(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.qN __call1136_32(moom.Ct a0) throws Throwable;
private static native net.minecraft.entity.Entity __call1136_33(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native moom.qN __call1136_34(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call1136_35(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1136_36(boolean value) throws Throwable;
private static native int __call1136_37(java.lang.String a0) throws Throwable;
private static native int __call1136_38(java.lang.String a0) throws Throwable;
private static native void __call1136_39(moom.qN a0, net.minecraft.command.CommandResultStats$Type a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native java.lang.String __call1136_40(net.minecraft.command.CommandResultStats$Type a0) throws Throwable;
private static native void __call1136_41(net.minecraft.command.ICommandSender a0, moom.p_ a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native boolean __call1136_42(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1136_43(boolean value) throws Throwable;
private static native void __call1136_44(moom.qN a0, net.minecraft.command.CommandResultStats$Type a1, java.lang.Object a2, java.lang.Object a3) throws Throwable;
private static native java.lang.String __call1136_45(net.minecraft.command.CommandResultStats$Type a0) throws Throwable;
private static native void __call1136_46(net.minecraft.command.ICommandSender a0, moom.p_ a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native moom.DT __call1136_47(net.minecraft.command.ICommandSender a0, java.lang.String[] a1, int a2, int a3) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call1136_48(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native void __call1136_49(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native java.lang.Exception __call1113600_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113601_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113602_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113603_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113604_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113605_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113606_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113607_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113608_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113609_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113610_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113611_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113612_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113613_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113614_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113615_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113616_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113617_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113618_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113619_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113620_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113621_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113622_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113623_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113624_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113625_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113626_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113627_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113628_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113629_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113630_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113631_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113632_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113633_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113634_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113635_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1113636_0(moom.b7 a0) throws Throwable;

}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-2725093038882993272L)), ((long)(-127177754283007815L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(15507027414953L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.p_.c ^ 100917636417022L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill964_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill964_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill964_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill964_14 = new byte[8];
    (__sourceSpill964_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill964_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation964_16 = __sourceSpill964_14;
    ((javax.crypto.Cipher)(__sourceSpill964_11)).init(((int)(__sourceSpill964_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill964_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation964_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ðl×(P\tÂ^¶»V¯=Ê\004lØ§§9\032\006"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill964_25 = local6_life21;
        int __sourceSpill964_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill964_25)).substring(((int)(__sourceSpill964_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill964_30 = local8_life19;
        int __sourceSpill964_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill964_33 = new byte[8];
        (__sourceSpill964_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill964_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill964_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill964_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill964_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill964_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill964_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill964_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill964_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill964_34)).doFinal(((byte[])(__sourceSpill964_33)));
        (__sourceSpill964_30)[__sourceSpill964_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


protected java.util.List<java.lang.String> b__sourceReturn_3f0615080b() { return __sourceHandlerCall_2ffd3da89f7797eb0a3d(this); }


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 1686;
      if (e[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(p1 >>> 56),
            (byte)(p1 >>> 48),
            (byte)(p1 >>> 40),
            (byte)(p1 >>> 32),
            (byte)(p1 >>> 24),
            (byte)(p1 >>> 16),
            (byte)(p1 >>> 8),
            (byte)p1
         };
         long var5 = d[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/p_", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.p_.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8706_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/p_"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.stats.usage";
}


public int a() {
return 2;
}


public java.lang.String a__String() {
return "stats";
}


protected java.lang.String[] a__ArrayString() {
return ((moom.Bl)(moom.Bl.a__Bl())).a__ArrayString();
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_6a76a194593d5e597c4e(this, p0, p1, p2); }


public boolean a__Boolean(java.lang.String[] p0, int p1) { return __sourceHandlerCall_12f6d6b96d713d27a78c(this, p0, p1); }


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_1579179d03043f247463(this, p0, p1); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8706_0() throws E;
}
