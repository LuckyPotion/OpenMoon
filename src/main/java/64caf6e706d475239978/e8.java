package moom;






import moom.DT;



import moom.d2;

import net.minecraft.block.BlockPlanks$EnumType;
public class e8 {

private net.minecraft.world.World a;

private moom.DT b;

private moom.d2 c;

private net.minecraft.block.state.IBlockState d;

private boolean e;

private java.util.List<moom.DT> f;

moom.d2 g;

private static long h;

public e8(moom.d2 p0, net.minecraft.world.World p1, moom.DT p2, net.minecraft.block.state.IBlockState p3) { super(); }

private static void __sourceConstructorBody_2fc0942c00610d43(moom.e8 receiver, moom.d2 p0, net.minecraft.world.World p1, moom.DT p2, net.minecraft.block.state.IBlockState p3) throws Throwable {
((moom.e8)(receiver)).g = ((moom.d2)(p0));
    moom.e8.__sourceConstructorInit_2fc0942c00610d43_0(((moom.e8)(receiver)));
    ((moom.e8)(receiver)).f = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    ((moom.e8)(receiver)).a = ((net.minecraft.world.World)(p1));
    ((moom.e8)(receiver)).b = ((moom.DT)(p2));
    ((moom.e8)(receiver)).d = ((net.minecraft.block.state.IBlockState)(p3));
    ((moom.e8)(receiver)).c = ((moom.d2)(((moom.d2)(((net.minecraft.block.state.IBlockState)(p3)).a__ch()))));
    net.minecraft.block.BlockRailBase$EnumRailDirection local5 = ((net.minecraft.block.BlockRailBase$EnumRailDirection)(((net.minecraft.block.state.IBlockState)(p3)).a(((net.minecraft.block.properties.IProperty)(((moom.d2)(p0)).a__ft())))));
    ((moom.e8)(receiver)).e = ((boolean)(((moom.d2)(((moom.e8)(receiver)).c)).Q));
    ((moom.e8)(receiver)).a(((net.minecraft.block.BlockRailBase$EnumRailDirection)(local5)));
    return;
}


static {
moom.e8.h = (moom._c.a(4474155610230658561L, -8545667739805444660L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(27279188949467L);
}

private static native <E extends Throwable> void __sourceConstructorInit_2fc0942c00610d43_0(moom.e8 a0) throws E;
private static native <E extends Throwable> moom.e8 __sourceHandlerCall_e4be3f5f9438473ea623(moom.e8 a0, moom.DT a1) throws E;
private static final class __SourceHandler_e4be3f5f9438473ea623 {

public static moom.e8 f418(moom.e8 receiver, moom.DT p0) throws Throwable {
    int forestValue418_65_0;
    moom.e8 forestValue418_78_0;
    moom.e8 forestValue418_80_0;
    int[] spill418_0;
    moom.e8 spill418_1;
    moom.e8 spill418_2;
    moom.d2 spill418_3;
    boolean spill418_4;
    moom.e8 spill418_5;
    moom.e8 spill418_6;
    moom.d2 spill418_7;
    moom.e8 spill418_8;
    moom.e8 spill418_9;
    moom.e8 spill418_10;
    moom.d2 spill418_11;
    long life2_3;
    net.minecraft.block.state.IBlockState life5_9;
    int[] life4_10;
    moom.DT life6_29;
    net.minecraft.block.state.IBlockState life5_34;
    forest_join_80: {
    forest_join_79: {
    forest_join_78: {
    forest_join_65: {
    forest_join_53: {
    forest_join_27: {
    life2_3 = (__fieldRead418_0() ^ 45166517299040L);
    spill418_0 = __call418_1();
    life5_9 = __call418_3(__fieldRead418_2(receiver), p0);
    life4_10 = spill418_0;
    if (!(__call418_4(life5_9))) {
        break forest_join_27;
    }
    moom.e8 __stackOp418_6_0 = __sourceUninitializedNEW418_5();
    spill418_1 = __stackOp418_6_0;
    spill418_2 = __stackOp418_6_0;
    moom.d2 __stackOp418_8_0 = __fieldRead418_7(receiver);
    spill418_3 = __stackOp418_8_0;
    __call418_9(__stackOp418_8_0);
    __explicitNewInit418_11(spill418_2, spill418_3, __fieldRead418_10(receiver), p0, life5_9);
    return spill418_1;
    }
    life6_29 = __call418_12(p0);
    life5_34 = __call418_14(__fieldRead418_13(receiver), life6_29);
    spill418_4 = __call418_15(life5_34);
    if (!((life4_10 != null))) {
        forestValue418_65_0 = __integerCategory418_16(spill418_4);
        break forest_join_65;
    }
    if (!(spill418_4)) {
        break forest_join_53;
    }
    moom.e8 __stackOp418_18_0 = __sourceUninitializedNEW418_17();
    spill418_5 = __stackOp418_18_0;
    spill418_6 = __stackOp418_18_0;
    moom.d2 __stackOp418_20_0 = __fieldRead418_19(receiver);
    spill418_7 = __stackOp418_20_0;
    __call418_21(__stackOp418_20_0);
    __explicitNewInit418_23(spill418_6, spill418_7, __fieldRead418_22(receiver), life6_29, life5_34);
    return spill418_5;
    }
    life6_29 = __call418_24(p0);
    spill418_8 = receiver;
    if (!((life4_10 != null))) {
        forestValue418_78_0 = spill418_8;
        break forest_join_78;
    }
    life5_34 = __call418_26(__fieldRead418_25(spill418_8), life6_29);
    forestValue418_65_0 = __integerCategory418_28(__call418_27(life5_34));
    }
    if (!((forestValue418_65_0 != 0))) {
        break forest_join_79;
    }
    moom.e8 __stackOp418_30_0 = __sourceUninitializedNEW418_29();
    spill418_9 = __stackOp418_30_0;
    spill418_10 = __stackOp418_30_0;
    moom.d2 __stackOp418_32_0 = __fieldRead418_31(receiver);
    spill418_11 = __stackOp418_32_0;
    __call418_33(__stackOp418_32_0);
    __explicitNewInit418_35(spill418_10, spill418_11, __fieldRead418_34(receiver), life6_29, life5_34);
    forestValue418_78_0 = spill418_9;
    }
    forestValue418_80_0 = forestValue418_78_0;
    break forest_join_80;
    }
    forestValue418_80_0 = null;
    }
    return forestValue418_80_0;
}
private static native long __fieldRead418_0() throws Throwable;
private static native int[] __call418_1() throws Throwable;
private static native net.minecraft.world.World __fieldRead418_2(moom.e8 a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call418_3(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native boolean __call418_4(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.e8 __sourceUninitializedNEW418_5() throws Throwable;
private static native moom.d2 __fieldRead418_7(moom.e8 a0) throws Throwable;
private static native java.lang.Object __call418_9(moom.d2 a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead418_10(moom.e8 a0) throws Throwable;
private static native void __explicitNewInit418_11(moom.e8 a0, moom.d2 a1, net.minecraft.world.World a2, moom.DT a3, net.minecraft.block.state.IBlockState a4) throws Throwable;
private static native moom.DT __call418_12(moom.DT a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead418_13(moom.e8 a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call418_14(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native boolean __call418_15(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __integerCategory418_16(boolean value) throws Throwable;
private static native moom.e8 __sourceUninitializedNEW418_17() throws Throwable;
private static native moom.d2 __fieldRead418_19(moom.e8 a0) throws Throwable;
private static native java.lang.Object __call418_21(moom.d2 a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead418_22(moom.e8 a0) throws Throwable;
private static native void __explicitNewInit418_23(moom.e8 a0, moom.d2 a1, net.minecraft.world.World a2, moom.DT a3, net.minecraft.block.state.IBlockState a4) throws Throwable;
private static native moom.DT __call418_24(moom.DT a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead418_25(moom.e8 a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call418_26(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native boolean __call418_27(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __integerCategory418_28(boolean value) throws Throwable;
private static native moom.e8 __sourceUninitializedNEW418_29() throws Throwable;
private static native moom.d2 __fieldRead418_31(moom.e8 a0) throws Throwable;
private static native java.lang.Object __call418_33(moom.d2 a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead418_34(moom.e8 a0) throws Throwable;
private static native void __explicitNewInit418_35(moom.e8 a0, moom.d2 a1, net.minecraft.world.World a2, moom.DT a3, net.minecraft.block.state.IBlockState a4) throws Throwable;

}


private boolean b(moom.DT p0) {
int lexicalValue1133_32_0;
    int lexicalValue1133_32_1;
    int lexicalValue1133_34_0;
    int lexicalValue1133_38_0;
    int[] spill1133_0;
    int spill1133_1;
    int spill1133_2;
    int spill1133_3;
    long life2_3;
    java.util.Iterator life5_8;
    int[] life4_9;
    moom.DT life6_16;
    lexical_join_38: {
    lexical_join_37: {
    life2_3 = (moom.e8.h ^ 50718160673827L);
    spill1133_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_8 = ((java.util.List)(this.f)).iterator();
    life4_9 = spill1133_0;
    lexical_cycle_10: while (true) {
    lexical_join_35: {
    lexical_join_34: {
    lexical_join_32: {
    if (!(((java.util.Iterator)(life5_8)).hasNext())) {
        break lexical_join_37;
    }
    life6_16 = ((moom.DT)(((java.util.Iterator)(life5_8)).next()));
    spill1133_1 = ((moom.DT)(life6_16)).a();
    if (!((life4_9 != null))) {
        lexicalValue1133_38_0 = spill1133_1;
        break lexical_join_38;
    }
    spill1133_2 = ((moom.DT)(p0)).a();
    if (!((life4_9 != null))) {
        lexicalValue1133_32_0 = spill1133_1;
        lexicalValue1133_32_1 = spill1133_2;
        break lexical_join_32;
    }
    if (!((spill1133_1 == spill1133_2))) {
        break lexical_join_35;
    }
    spill1133_3 = ((moom.DT)(life6_16)).c();
    if (!((life4_9 != null))) {
        lexicalValue1133_34_0 = spill1133_3;
        break lexical_join_34;
    }
    lexicalValue1133_32_0 = spill1133_3;
    lexicalValue1133_32_1 = ((moom.DT)(p0)).c();
    }
    if (!((lexicalValue1133_32_0 == lexicalValue1133_32_1))) {
        break lexical_join_35;
    }
    lexicalValue1133_34_0 = 1;
    }
    return ((lexicalValue1133_34_0) != 0);
    }
    if (!((life4_9 == null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    lexicalValue1133_38_0 = 0;
    }
    return ((lexicalValue1133_38_0) != 0);
}


private boolean b(moom.e8 p0) {
int forwardValue3379_20_0;
    int forwardValue3379_22_0;
    boolean spill3379_0;
    int spill3379_1;
    long life2_3;
    int[] life4_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life2_3 = (moom.e8.h ^ 140266802205654L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3379_0 = ((moom.e8)(this)).a__Boolean(((moom.e8)(p0)));
    if (!((life4_5 != null))) {
        forwardValue3379_20_0 = ((spill3379_0) ? 1 : 0);
        break forward_join_20;
    }
    if (!((!spill3379_0))) {
        break forward_join_19;
    }
    spill3379_1 = ((java.util.List)(this.f)).size();
    if (!((life4_5 != null))) {
        forwardValue3379_20_0 = spill3379_1;
        break forward_join_20;
    }
    if (!((spill3379_1 != 2))) {
        break forward_join_21;
    }
    }
    forwardValue3379_20_0 = 1;
    }
    forwardValue3379_22_0 = forwardValue3379_20_0;
    break forward_join_22;
    }
    forwardValue3379_22_0 = 0;
    }
    return ((forwardValue3379_22_0) != 0);
}


private boolean c(moom.DT p0) {
moom.e8 forwardValue3380_19_0;
    int[] spill3380_0;
    moom.e8 spill3380_1;
    long life2_3;
    moom.e8 life5_8;
    int[] life4_9;
    forward_join_19: {
    forward_join_16: {
    life2_3 = (moom.e8.h ^ 77270439006689L);
    spill3380_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_8 = ((moom.e8)(this)).a(((moom.DT)(p0)));
    life4_9 = spill3380_0;
    spill3380_1 = life5_8;
    if (!((life4_9 != null))) {
        forwardValue3380_19_0 = spill3380_1;
        break forward_join_19;
    }
    if (!((spill3380_1 == null))) {
        break forward_join_16;
    }
    return ((0) != 0);
    }
    ((moom.e8)(life5_8)).a__Void();
    forwardValue3380_19_0 = life5_8;
    }
    return ((moom.e8)(forwardValue3380_19_0)).b(((moom.e8)(this)));
}


public moom.e8 a(boolean p0, boolean p1) {
int lexicalValue1131_49_0;
    int lexicalValue1131_53_0;
    int lexicalValue1131_65_0;
    int lexicalValue1131_76_0;
    int lexicalValue1131_80_0;
    int lexicalValue1131_98_0;
    int lexicalValue1131_116_0;
    int lexicalValue1131_134_0;
    int lexicalValue1131_138_0;
    int lexicalValue1131_142_0;
    int lexicalValue1131_146_0;
    int lexicalValue1131_158_0;
    int lexicalValue1131_164_0;
    int lexicalValue1131_168_0;
    int lexicalValue1131_175_0;
    int lexicalValue1131_179_0;
    int lexicalValue1131_193_0;
    int lexicalValue1131_203_0;
    int lexicalValue1131_213_0;
    int lexicalValue1131_217_0;
    int lexicalValue1131_223_0;
    int lexicalValue1131_233_0;
    int lexicalValue1131_243_0;
    int lexicalValue1131_253_0;
    int lexicalValue1131_257_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection lexicalValue1131_261_0;
    int lexicalValue1131_280_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection lexicalValue1131_287_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection lexicalValue1131_287_1;
    int lexicalValue1131_303_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection lexicalValue1131_307_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection lexicalValue1131_311_0;
    int lexicalValue1131_346_0;
    moom.e8 lexicalValue1131_371_0;
    moom.e8 lexicalValue1131_378_0;
    moom.e8 lexicalValue1131_378_1;
    moom.e8 lexicalValue1131_382_0;
    int[] spill1131_0;
    int spill1131_1;
    int spill1131_2;
    int spill1131_3;
    int spill1131_4;
    int spill1131_5;
    int spill1131_6;
    int spill1131_7;
    int spill1131_8;
    int spill1131_9;
    int spill1131_10;
    int spill1131_11;
    int spill1131_12;
    int spill1131_13;
    int spill1131_14;
    net.minecraft.block.BlockRailBase$EnumRailDirection spill1131_15;
    int spill1131_16;
    int spill1131_17;
    int spill1131_18;
    int spill1131_19;
    int spill1131_20;
    int spill1131_21;
    int spill1131_22;
    int spill1131_23;
    net.minecraft.block.BlockRailBase$EnumRailDirection spill1131_24;
    boolean spill1131_25;
    net.minecraft.block.BlockRailBase$EnumRailDirection spill1131_26;
    boolean spill1131_27;
    boolean spill1131_28;
    moom.e8 spill1131_29;
    moom.e8 spill1131_30;
    moom.e8 spill1131_31;
    long life3_3;
    moom.DT life6_7;
    moom.DT life7_11;
    moom.DT life8_15;
    moom.DT life9_20;
    int life10_24;
    int[] life5_25;
    int life11_29;
    int life12_33;
    int life13_37;
    net.minecraft.block.BlockRailBase$EnumRailDirection life14_39;
    java.util.Iterator life15_578;
    moom.DT life16_585;
    moom.e8 life17_589;
    lexical_join_382: {
    lexical_join_381: {
    lexical_join_346: {
    lexical_join_338: {
    lexical_join_312: {
    lexical_join_311: {
    lexical_join_307: {
    lexical_join_306: {
    lexical_join_303: {
    lexical_join_298: {
    lexical_join_287: {
    lexical_join_283: {
    lexical_join_280: {
    lexical_join_275: {
    lexical_join_261: {
    lexical_join_260: {
    lexical_join_257: {
    lexical_join_253: {
    lexical_join_252: {
    lexical_join_243: {
    lexical_join_242: {
    lexical_join_233: {
    lexical_join_232: {
    lexical_join_223: {
    lexical_join_222: {
    lexical_join_217: {
    lexical_join_213: {
    lexical_join_212: {
    lexical_join_203: {
    lexical_join_202: {
    lexical_join_193: {
    lexical_join_192: {
    lexical_join_179: {
    lexical_join_175: {
    lexical_join_173: {
    lexical_join_171: {
    lexical_join_168: {
    lexical_join_164: {
    lexical_join_163: {
    lexical_join_161: {
    lexical_join_158: {
    lexical_join_149: {
    lexical_join_146: {
    lexical_join_142: {
    lexical_join_138: {
    lexical_join_134: {
    lexical_join_133: {
    lexical_join_116: {
    lexical_join_115: {
    lexical_join_98: {
    lexical_join_97: {
    lexical_join_80: {
    lexical_join_76: {
    lexical_join_74: {
    lexical_join_65: {
    lexical_join_64: {
    lexical_join_56: {
    lexical_join_53: {
    lexical_join_49: {
    lexical_join_48: {
    life3_3 = (moom.e8.h ^ 83764561040474L);
    life6_7 = ((moom.DT)(this.b)).c__DT();
    life7_11 = ((moom.DT)(this.b)).d__DT();
    life8_15 = ((moom.DT)(this.b)).e();
    spill1131_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life9_20 = ((moom.DT)(this.b)).f();
    life10_24 = ((((moom.e8)(this)).c(((moom.DT)(life6_7)))) ? 1 : 0);
    life5_25 = spill1131_0;
    life11_29 = ((((moom.e8)(this)).c(((moom.DT)(life7_11)))) ? 1 : 0);
    life12_33 = ((((moom.e8)(this)).c(((moom.DT)(life8_15)))) ? 1 : 0);
    life13_37 = ((((moom.e8)(this)).c(((moom.DT)(life9_20)))) ? 1 : 0);
    life14_39 = null;
    spill1131_1 = life10_24;
    if (!((life5_25 != null))) {
        lexicalValue1131_49_0 = spill1131_1;
        break lexical_join_49;
    }
    if (!((spill1131_1 == 0))) {
        break lexical_join_48;
    }
    spill1131_2 = life11_29;
    if (!((life5_25 != null))) {
        lexicalValue1131_49_0 = spill1131_2;
        break lexical_join_49;
    }
    if (!((spill1131_2 != 0))) {
        break lexical_join_56;
    }
    }
    lexicalValue1131_49_0 = life12_33;
    }
    if (!((life5_25 != null))) {
        lexicalValue1131_53_0 = lexicalValue1131_49_0;
        break lexical_join_53;
    }
    if (!((lexicalValue1131_49_0 == 0))) {
        break lexical_join_56;
    }
    lexicalValue1131_53_0 = life13_37;
    }
    if (!((lexicalValue1131_53_0 == 0))) {
        break lexical_join_56;
    }
    life14_39 = net.minecraft.block.BlockRailBase$EnumRailDirection.NORTH_SOUTH;
    }
    spill1131_3 = life12_33;
    if (!((life5_25 != null))) {
        lexicalValue1131_65_0 = spill1131_3;
        break lexical_join_65;
    }
    if (!((spill1131_3 == 0))) {
        break lexical_join_64;
    }
    spill1131_4 = life13_37;
    if (!((life5_25 != null))) {
        lexicalValue1131_76_0 = spill1131_4;
        break lexical_join_76;
    }
    if (!((spill1131_4 != 0))) {
        break lexical_join_74;
    }
    }
    lexicalValue1131_65_0 = life10_24;
    }
    if (!((life5_25 != null))) {
        lexicalValue1131_76_0 = lexicalValue1131_65_0;
        break lexical_join_76;
    }
    if (!((lexicalValue1131_65_0 == 0))) {
        break lexical_join_74;
    }
    spill1131_5 = life11_29;
    if (!((life5_25 != null))) {
        lexicalValue1131_76_0 = spill1131_5;
        break lexical_join_76;
    }
    if (!((spill1131_5 == 0))) {
        break lexical_join_74;
    }
    life14_39 = net.minecraft.block.BlockRailBase$EnumRailDirection.EAST_WEST;
    }
    lexicalValue1131_76_0 = ((this.e) ? 1 : 0);
    }
    if (!((life5_25 != null))) {
        lexicalValue1131_80_0 = lexicalValue1131_76_0;
        break lexical_join_80;
    }
    if (!((lexicalValue1131_76_0 == 0))) {
        break lexical_join_149;
    }
    lexicalValue1131_80_0 = life11_29;
    }
    if (!((life5_25 != null))) {
        lexicalValue1131_98_0 = lexicalValue1131_80_0;
        break lexical_join_98;
    }
    if (!((lexicalValue1131_80_0 != 0))) {
        break lexical_join_97;
    }
    spill1131_6 = life13_37;
    if (!((life5_25 != null))) {
        lexicalValue1131_98_0 = spill1131_6;
        break lexical_join_98;
    }
    if (!((spill1131_6 != 0))) {
        break lexical_join_97;
    }
    spill1131_7 = life10_24;
    if (!((life5_25 != null))) {
        lexicalValue1131_98_0 = spill1131_7;
        break lexical_join_98;
    }
    if (!((spill1131_7 == 0))) {
        break lexical_join_97;
    }
    spill1131_8 = life12_33;
    if (!((life5_25 != null))) {
        lexicalValue1131_98_0 = spill1131_8;
        break lexical_join_98;
    }
    if (!((spill1131_8 == 0))) {
        break lexical_join_97;
    }
    life14_39 = net.minecraft.block.BlockRailBase$EnumRailDirection.SOUTH_EAST;
    }
    lexicalValue1131_98_0 = life11_29;
    }
    if (!((life5_25 != null))) {
        lexicalValue1131_116_0 = lexicalValue1131_98_0;
        break lexical_join_116;
    }
    if (!((lexicalValue1131_98_0 != 0))) {
        break lexical_join_115;
    }
    spill1131_9 = life12_33;
    if (!((life5_25 != null))) {
        lexicalValue1131_116_0 = spill1131_9;
        break lexical_join_116;
    }
    if (!((spill1131_9 != 0))) {
        break lexical_join_115;
    }
    spill1131_10 = life10_24;
    if (!((life5_25 != null))) {
        lexicalValue1131_116_0 = spill1131_10;
        break lexical_join_116;
    }
    if (!((spill1131_10 == 0))) {
        break lexical_join_115;
    }
    spill1131_11 = life13_37;
    if (!((life5_25 != null))) {
        lexicalValue1131_116_0 = spill1131_11;
        break lexical_join_116;
    }
    if (!((spill1131_11 == 0))) {
        break lexical_join_115;
    }
    life14_39 = net.minecraft.block.BlockRailBase$EnumRailDirection.SOUTH_WEST;
    }
    lexicalValue1131_116_0 = life10_24;
    }
    if (!((life5_25 != null))) {
        lexicalValue1131_134_0 = lexicalValue1131_116_0;
        break lexical_join_134;
    }
    if (!((lexicalValue1131_116_0 != 0))) {
        break lexical_join_133;
    }
    spill1131_12 = life12_33;
    if (!((life5_25 != null))) {
        lexicalValue1131_134_0 = spill1131_12;
        break lexical_join_134;
    }
    if (!((spill1131_12 != 0))) {
        break lexical_join_133;
    }
    spill1131_13 = life11_29;
    if (!((life5_25 != null))) {
        lexicalValue1131_134_0 = spill1131_13;
        break lexical_join_134;
    }
    if (!((spill1131_13 == 0))) {
        break lexical_join_133;
    }
    spill1131_14 = life13_37;
    if (!((life5_25 != null))) {
        lexicalValue1131_134_0 = spill1131_14;
        break lexical_join_134;
    }
    if (!((spill1131_14 == 0))) {
        break lexical_join_133;
    }
    life14_39 = net.minecraft.block.BlockRailBase$EnumRailDirection.NORTH_WEST;
    }
    lexicalValue1131_134_0 = life10_24;
    }
    if (!((life5_25 != null))) {
        lexicalValue1131_138_0 = lexicalValue1131_134_0;
        break lexical_join_138;
    }
    if (!((lexicalValue1131_134_0 != 0))) {
        break lexical_join_149;
    }
    lexicalValue1131_138_0 = life13_37;
    }
    if (!((life5_25 != null))) {
        lexicalValue1131_142_0 = lexicalValue1131_138_0;
        break lexical_join_142;
    }
    if (!((lexicalValue1131_138_0 != 0))) {
        break lexical_join_149;
    }
    lexicalValue1131_142_0 = life11_29;
    }
    if (!((life5_25 != null))) {
        lexicalValue1131_146_0 = lexicalValue1131_142_0;
        break lexical_join_146;
    }
    if (!((lexicalValue1131_142_0 == 0))) {
        break lexical_join_149;
    }
    lexicalValue1131_146_0 = life12_33;
    }
    if (!((lexicalValue1131_146_0 == 0))) {
        break lexical_join_149;
    }
    life14_39 = net.minecraft.block.BlockRailBase$EnumRailDirection.NORTH_EAST;
    }
    spill1131_15 = life14_39;
    if (!((life5_25 != null))) {
        lexicalValue1131_261_0 = spill1131_15;
        break lexical_join_261;
    }
    if (!((spill1131_15 == null))) {
        break lexical_join_260;
    }
    spill1131_16 = life10_24;
    if (!((life5_25 != null))) {
        lexicalValue1131_158_0 = spill1131_16;
        break lexical_join_158;
    }
    if (!((spill1131_16 == 0))) {
        break lexical_join_161;
    }
    lexicalValue1131_158_0 = life11_29;
    }
    if (!((life5_25 != null))) {
        lexicalValue1131_164_0 = lexicalValue1131_158_0;
        break lexical_join_164;
    }
    if (!((lexicalValue1131_158_0 != 0))) {
        break lexical_join_163;
    }
    }
    life14_39 = net.minecraft.block.BlockRailBase$EnumRailDirection.NORTH_SOUTH;
    }
    lexicalValue1131_164_0 = life12_33;
    }
    if (!((life5_25 != null))) {
        lexicalValue1131_168_0 = lexicalValue1131_164_0;
        break lexical_join_168;
    }
    if (!((lexicalValue1131_164_0 == 0))) {
        break lexical_join_171;
    }
    lexicalValue1131_168_0 = life13_37;
    }
    if (!((life5_25 != null))) {
        lexicalValue1131_175_0 = lexicalValue1131_168_0;
        break lexical_join_175;
    }
    if (!((lexicalValue1131_168_0 != 0))) {
        break lexical_join_173;
    }
    }
    life14_39 = net.minecraft.block.BlockRailBase$EnumRailDirection.EAST_WEST;
    }
    lexicalValue1131_175_0 = ((this.e) ? 1 : 0);
    }
    if (!((life5_25 != null))) {
        lexicalValue1131_179_0 = lexicalValue1131_175_0;
        break lexical_join_179;
    }
    if (!((lexicalValue1131_175_0 == 0))) {
        break lexical_join_260;
    }
    lexicalValue1131_179_0 = ((p0) ? 1 : 0);
    }
    if (!((life5_25 != null))) {
        lexicalValue1131_223_0 = lexicalValue1131_179_0;
        break lexical_join_223;
    }
    if (!((lexicalValue1131_179_0 != 0))) {
        break lexical_join_222;
    }
    spill1131_17 = life11_29;
    if (!((life5_25 != null))) {
        lexicalValue1131_193_0 = spill1131_17;
        break lexical_join_193;
    }
    if (!((spill1131_17 != 0))) {
        break lexical_join_192;
    }
    spill1131_18 = life13_37;
    if (!((life5_25 != null))) {
        lexicalValue1131_193_0 = spill1131_18;
        break lexical_join_193;
    }
    if (!((spill1131_18 != 0))) {
        break lexical_join_192;
    }
    life14_39 = net.minecraft.block.BlockRailBase$EnumRailDirection.SOUTH_EAST;
    }
    lexicalValue1131_193_0 = life12_33;
    }
    if (!((life5_25 != null))) {
        lexicalValue1131_203_0 = lexicalValue1131_193_0;
        break lexical_join_203;
    }
    if (!((lexicalValue1131_193_0 != 0))) {
        break lexical_join_202;
    }
    spill1131_19 = life11_29;
    if (!((life5_25 != null))) {
        lexicalValue1131_203_0 = spill1131_19;
        break lexical_join_203;
    }
    if (!((spill1131_19 != 0))) {
        break lexical_join_202;
    }
    life14_39 = net.minecraft.block.BlockRailBase$EnumRailDirection.SOUTH_WEST;
    }
    lexicalValue1131_203_0 = life13_37;
    }
    if (!((life5_25 != null))) {
        lexicalValue1131_213_0 = lexicalValue1131_203_0;
        break lexical_join_213;
    }
    if (!((lexicalValue1131_203_0 != 0))) {
        break lexical_join_212;
    }
    spill1131_20 = life10_24;
    if (!((life5_25 != null))) {
        lexicalValue1131_213_0 = spill1131_20;
        break lexical_join_213;
    }
    if (!((spill1131_20 != 0))) {
        break lexical_join_212;
    }
    life14_39 = net.minecraft.block.BlockRailBase$EnumRailDirection.NORTH_EAST;
    }
    lexicalValue1131_213_0 = life10_24;
    }
    if (!((life5_25 != null))) {
        lexicalValue1131_217_0 = lexicalValue1131_213_0;
        break lexical_join_217;
    }
    if (!((lexicalValue1131_213_0 != 0))) {
        break lexical_join_260;
    }
    lexicalValue1131_217_0 = life12_33;
    }
    if (!((lexicalValue1131_217_0 != 0))) {
        break lexical_join_260;
    }
    life14_39 = net.minecraft.block.BlockRailBase$EnumRailDirection.NORTH_WEST;
    if (!((life5_25 == null))) {
        break lexical_join_260;
    }
    }
    lexicalValue1131_223_0 = life10_24;
    }
    if (!((life5_25 != null))) {
        lexicalValue1131_233_0 = lexicalValue1131_223_0;
        break lexical_join_233;
    }
    if (!((lexicalValue1131_223_0 != 0))) {
        break lexical_join_232;
    }
    spill1131_21 = life12_33;
    if (!((life5_25 != null))) {
        lexicalValue1131_233_0 = spill1131_21;
        break lexical_join_233;
    }
    if (!((spill1131_21 != 0))) {
        break lexical_join_232;
    }
    life14_39 = net.minecraft.block.BlockRailBase$EnumRailDirection.NORTH_WEST;
    }
    lexicalValue1131_233_0 = life13_37;
    }
    if (!((life5_25 != null))) {
        lexicalValue1131_243_0 = lexicalValue1131_233_0;
        break lexical_join_243;
    }
    if (!((lexicalValue1131_233_0 != 0))) {
        break lexical_join_242;
    }
    spill1131_22 = life10_24;
    if (!((life5_25 != null))) {
        lexicalValue1131_243_0 = spill1131_22;
        break lexical_join_243;
    }
    if (!((spill1131_22 != 0))) {
        break lexical_join_242;
    }
    life14_39 = net.minecraft.block.BlockRailBase$EnumRailDirection.NORTH_EAST;
    }
    lexicalValue1131_243_0 = life12_33;
    }
    if (!((life5_25 != null))) {
        lexicalValue1131_253_0 = lexicalValue1131_243_0;
        break lexical_join_253;
    }
    if (!((lexicalValue1131_243_0 != 0))) {
        break lexical_join_252;
    }
    spill1131_23 = life11_29;
    if (!((life5_25 != null))) {
        lexicalValue1131_253_0 = spill1131_23;
        break lexical_join_253;
    }
    if (!((spill1131_23 != 0))) {
        break lexical_join_252;
    }
    life14_39 = net.minecraft.block.BlockRailBase$EnumRailDirection.SOUTH_WEST;
    }
    lexicalValue1131_253_0 = life11_29;
    }
    if (!((life5_25 != null))) {
        lexicalValue1131_257_0 = lexicalValue1131_253_0;
        break lexical_join_257;
    }
    if (!((lexicalValue1131_253_0 != 0))) {
        break lexical_join_260;
    }
    lexicalValue1131_257_0 = life13_37;
    }
    if (!((lexicalValue1131_257_0 != 0))) {
        break lexical_join_260;
    }
    life14_39 = net.minecraft.block.BlockRailBase$EnumRailDirection.SOUTH_EAST;
    }
    lexicalValue1131_261_0 = life14_39;
    }
    spill1131_24 = net.minecraft.block.BlockRailBase$EnumRailDirection.NORTH_SOUTH;
    if (!((life5_25 != null))) {
        lexicalValue1131_287_0 = lexicalValue1131_261_0;
        lexicalValue1131_287_1 = spill1131_24;
        break lexical_join_287;
    }
    if (!((lexicalValue1131_261_0 == spill1131_24))) {
        break lexical_join_283;
    }
    spill1131_25 = moom.d2.c(((net.minecraft.world.World)(this.a)), ((moom.DT)(((moom.DT)(life6_7)).a__DT())));
    if (!((life5_25 != null))) {
        lexicalValue1131_280_0 = ((spill1131_25) ? 1 : 0);
        break lexical_join_280;
    }
    if (!(spill1131_25)) {
        break lexical_join_275;
    }
    life14_39 = net.minecraft.block.BlockRailBase$EnumRailDirection.ASCENDING_NORTH;
    }
    lexicalValue1131_280_0 = ((moom.d2.c(((net.minecraft.world.World)(this.a)), ((moom.DT)(((moom.DT)(life7_11)).a__DT())))) ? 1 : 0);
    }
    if (!((lexicalValue1131_280_0 != 0))) {
        break lexical_join_283;
    }
    life14_39 = net.minecraft.block.BlockRailBase$EnumRailDirection.ASCENDING_SOUTH;
    }
    spill1131_26 = life14_39;
    if (!((life5_25 != null))) {
        lexicalValue1131_307_0 = spill1131_26;
        break lexical_join_307;
    }
    lexicalValue1131_287_0 = spill1131_26;
    lexicalValue1131_287_1 = net.minecraft.block.BlockRailBase$EnumRailDirection.EAST_WEST;
    }
    if (!((lexicalValue1131_287_0 == lexicalValue1131_287_1))) {
        break lexical_join_306;
    }
    spill1131_27 = moom.d2.c(((net.minecraft.world.World)(this.a)), ((moom.DT)(((moom.DT)(life9_20)).a__DT())));
    if (!((life5_25 != null))) {
        lexicalValue1131_303_0 = ((spill1131_27) ? 1 : 0);
        break lexical_join_303;
    }
    if (!(spill1131_27)) {
        break lexical_join_298;
    }
    life14_39 = net.minecraft.block.BlockRailBase$EnumRailDirection.ASCENDING_EAST;
    }
    lexicalValue1131_303_0 = ((moom.d2.c(((net.minecraft.world.World)(this.a)), ((moom.DT)(((moom.DT)(life8_15)).a__DT())))) ? 1 : 0);
    }
    if (!((lexicalValue1131_303_0 != 0))) {
        break lexical_join_306;
    }
    life14_39 = net.minecraft.block.BlockRailBase$EnumRailDirection.ASCENDING_WEST;
    }
    lexicalValue1131_307_0 = life14_39;
    }
    if (!((life5_25 != null))) {
        lexicalValue1131_311_0 = lexicalValue1131_307_0;
        break lexical_join_311;
    }
    if (!((lexicalValue1131_307_0 == null))) {
        break lexical_join_312;
    }
    lexicalValue1131_311_0 = net.minecraft.block.BlockRailBase$EnumRailDirection.NORTH_SOUTH;
    }
    life14_39 = lexicalValue1131_311_0;
    }
    ((moom.e8)(this)).a(((net.minecraft.block.BlockRailBase$EnumRailDirection)(life14_39)));
    this.d = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(this.d)).a__fE(((net.minecraft.block.properties.IProperty)(((moom.d2)(this.c)).a__ft())), ((java.lang.Comparable)(life14_39)))));
    spill1131_28 = p1;
    if (!((life5_25 != null))) {
        lexicalValue1131_346_0 = ((spill1131_28) ? 1 : 0);
        break lexical_join_346;
    }
    if (!((!spill1131_28))) {
        break lexical_join_338;
    }
    spill1131_29 = this;
    if (!((life5_25 != null))) {
        lexicalValue1131_382_0 = spill1131_29;
        break lexical_join_382;
    }
    if (!((((net.minecraft.world.World)(((moom.e8)(spill1131_29)).a)).a__fE(((moom.DT)(this.b))) != this.d))) {
        break lexical_join_381;
    }
    }
    lexicalValue1131_346_0 = ((((net.minecraft.world.World)(this.a)).a(((moom.DT)(this.b)), ((net.minecraft.block.state.IBlockState)(this.d)), ((int)(3)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1131_346_0);
    life15_578 = ((java.util.List)(this.f)).iterator();
    lexical_cycle_351: while (true) {
    lexical_join_379: {
    lexical_join_378: {
    lexical_join_371: {
    if (!(((java.util.Iterator)(life15_578)).hasNext())) {
        break lexical_join_381;
    }
    life16_585 = ((moom.DT)(((java.util.Iterator)(life15_578)).next()));
    life17_589 = ((moom.e8)(this)).a(((moom.DT)(life16_585)));
    spill1131_30 = life17_589;
    if (!((life5_25 != null))) {
        lexicalValue1131_382_0 = spill1131_30;
        break lexical_join_382;
    }
    if (!((life5_25 != null))) {
        lexicalValue1131_371_0 = spill1131_30;
        break lexical_join_371;
    }
    if (!((spill1131_30 != null))) {
        break lexical_join_379;
    }
    ((moom.e8)(life17_589)).a__Void();
    lexicalValue1131_371_0 = life17_589;
    }
    spill1131_31 = this;
    if (!((life5_25 != null))) {
        lexicalValue1131_378_0 = lexicalValue1131_371_0;
        lexicalValue1131_378_1 = spill1131_31;
        break lexical_join_378;
    }
    if (!(((moom.e8)(lexicalValue1131_371_0)).b(((moom.e8)(spill1131_31))))) {
        break lexical_join_379;
    }
    lexicalValue1131_378_0 = life17_589;
    lexicalValue1131_378_1 = this;
    }
    ((moom.e8)(lexicalValue1131_378_0)).a(((moom.e8)(lexicalValue1131_378_1)));
    }
    if (!((life5_25 == null))) { continue lexical_cycle_351; }
    break lexical_cycle_351;
    }
    }
    lexicalValue1131_382_0 = this;
    }
    return lexicalValue1131_382_0;
}


private void a(moom.e8 p0) {
int forwardValue3374_51_0;
    int forwardValue3374_59_0;
    int forwardValue3374_66_0;
    int forwardValue3374_70_0;
    int forwardValue3374_88_0;
    int forwardValue3374_106_0;
    int forwardValue3374_124_0;
    int forwardValue3374_128_0;
    int forwardValue3374_132_0;
    int forwardValue3374_136_0;
    int forwardValue3374_159_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3374_166_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3374_166_1;
    int forwardValue3374_182_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3374_186_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3374_190_0;
    int[] spill3374_0;
    int spill3374_1;
    int spill3374_2;
    int spill3374_3;
    int spill3374_4;
    int spill3374_5;
    int spill3374_6;
    int spill3374_7;
    int spill3374_8;
    int spill3374_9;
    int spill3374_10;
    int spill3374_11;
    net.minecraft.block.BlockRailBase$EnumRailDirection spill3374_12;
    net.minecraft.block.BlockRailBase$EnumRailDirection spill3374_13;
    boolean spill3374_14;
    net.minecraft.block.BlockRailBase$EnumRailDirection spill3374_15;
    boolean spill3374_16;
    long life2_3;
    moom.DT life5_13;
    moom.DT life6_17;
    moom.DT life7_21;
    moom.DT life8_25;
    int life9_29;
    int life10_33;
    int life11_37;
    int life12_42;
    int[] life4_43;
    net.minecraft.block.BlockRailBase$EnumRailDirection life13_45;
    forward_join_191: {
    forward_join_190: {
    forward_join_186: {
    forward_join_185: {
    forward_join_182: {
    forward_join_177: {
    forward_join_166: {
    forward_join_162: {
    forward_join_159: {
    forward_join_154: {
    forward_join_139: {
    forward_join_136: {
    forward_join_132: {
    forward_join_128: {
    forward_join_124: {
    forward_join_123: {
    forward_join_106: {
    forward_join_105: {
    forward_join_88: {
    forward_join_87: {
    forward_join_70: {
    forward_join_66: {
    forward_join_64: {
    forward_join_62: {
    forward_join_59: {
    forward_join_54: {
    forward_join_52: {
    forward_join_51: {
    life2_3 = (moom.e8.h ^ 6958534297910L);
    ((java.util.List)(this.f)).add(((java.lang.Object)(((moom.e8)(p0)).b)));
    life5_13 = ((moom.DT)(this.b)).c__DT();
    life6_17 = ((moom.DT)(this.b)).d__DT();
    life7_21 = ((moom.DT)(this.b)).e();
    life8_25 = ((moom.DT)(this.b)).f();
    life9_29 = ((((moom.e8)(this)).b(((moom.DT)(life5_13)))) ? 1 : 0);
    life10_33 = ((((moom.e8)(this)).b(((moom.DT)(life6_17)))) ? 1 : 0);
    life11_37 = ((((moom.e8)(this)).b(((moom.DT)(life7_21)))) ? 1 : 0);
    spill3374_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life12_42 = ((((moom.e8)(this)).b(((moom.DT)(life8_25)))) ? 1 : 0);
    life4_43 = spill3374_0;
    life13_45 = null;
    spill3374_1 = life9_29;
    if (!((life4_43 != null))) {
        forwardValue3374_51_0 = spill3374_1;
        break forward_join_51;
    }
    if (!((spill3374_1 == 0))) {
        break forward_join_52;
    }
    forwardValue3374_51_0 = life10_33;
    }
    if (!((forwardValue3374_51_0 != 0))) {
        break forward_join_54;
    }
    }
    life13_45 = net.minecraft.block.BlockRailBase$EnumRailDirection.NORTH_SOUTH;
    }
    spill3374_2 = life11_37;
    if (!((life4_43 != null))) {
        forwardValue3374_59_0 = spill3374_2;
        break forward_join_59;
    }
    if (!((spill3374_2 == 0))) {
        break forward_join_62;
    }
    forwardValue3374_59_0 = life12_42;
    }
    if (!((life4_43 != null))) {
        forwardValue3374_66_0 = forwardValue3374_59_0;
        break forward_join_66;
    }
    if (!((forwardValue3374_59_0 != 0))) {
        break forward_join_64;
    }
    }
    life13_45 = net.minecraft.block.BlockRailBase$EnumRailDirection.EAST_WEST;
    }
    forwardValue3374_66_0 = ((this.e) ? 1 : 0);
    }
    if (!((life4_43 != null))) {
        forwardValue3374_70_0 = forwardValue3374_66_0;
        break forward_join_70;
    }
    if (!((forwardValue3374_66_0 == 0))) {
        break forward_join_139;
    }
    forwardValue3374_70_0 = life10_33;
    }
    if (!((life4_43 != null))) {
        forwardValue3374_88_0 = forwardValue3374_70_0;
        break forward_join_88;
    }
    if (!((forwardValue3374_70_0 != 0))) {
        break forward_join_87;
    }
    spill3374_3 = life12_42;
    if (!((life4_43 != null))) {
        forwardValue3374_88_0 = spill3374_3;
        break forward_join_88;
    }
    if (!((spill3374_3 != 0))) {
        break forward_join_87;
    }
    spill3374_4 = life9_29;
    if (!((life4_43 != null))) {
        forwardValue3374_88_0 = spill3374_4;
        break forward_join_88;
    }
    if (!((spill3374_4 == 0))) {
        break forward_join_87;
    }
    spill3374_5 = life11_37;
    if (!((life4_43 != null))) {
        forwardValue3374_88_0 = spill3374_5;
        break forward_join_88;
    }
    if (!((spill3374_5 == 0))) {
        break forward_join_87;
    }
    life13_45 = net.minecraft.block.BlockRailBase$EnumRailDirection.SOUTH_EAST;
    }
    forwardValue3374_88_0 = life10_33;
    }
    if (!((life4_43 != null))) {
        forwardValue3374_106_0 = forwardValue3374_88_0;
        break forward_join_106;
    }
    if (!((forwardValue3374_88_0 != 0))) {
        break forward_join_105;
    }
    spill3374_6 = life11_37;
    if (!((life4_43 != null))) {
        forwardValue3374_106_0 = spill3374_6;
        break forward_join_106;
    }
    if (!((spill3374_6 != 0))) {
        break forward_join_105;
    }
    spill3374_7 = life9_29;
    if (!((life4_43 != null))) {
        forwardValue3374_106_0 = spill3374_7;
        break forward_join_106;
    }
    if (!((spill3374_7 == 0))) {
        break forward_join_105;
    }
    spill3374_8 = life12_42;
    if (!((life4_43 != null))) {
        forwardValue3374_106_0 = spill3374_8;
        break forward_join_106;
    }
    if (!((spill3374_8 == 0))) {
        break forward_join_105;
    }
    life13_45 = net.minecraft.block.BlockRailBase$EnumRailDirection.SOUTH_WEST;
    }
    forwardValue3374_106_0 = life9_29;
    }
    if (!((life4_43 != null))) {
        forwardValue3374_124_0 = forwardValue3374_106_0;
        break forward_join_124;
    }
    if (!((forwardValue3374_106_0 != 0))) {
        break forward_join_123;
    }
    spill3374_9 = life11_37;
    if (!((life4_43 != null))) {
        forwardValue3374_124_0 = spill3374_9;
        break forward_join_124;
    }
    if (!((spill3374_9 != 0))) {
        break forward_join_123;
    }
    spill3374_10 = life10_33;
    if (!((life4_43 != null))) {
        forwardValue3374_124_0 = spill3374_10;
        break forward_join_124;
    }
    if (!((spill3374_10 == 0))) {
        break forward_join_123;
    }
    spill3374_11 = life12_42;
    if (!((life4_43 != null))) {
        forwardValue3374_124_0 = spill3374_11;
        break forward_join_124;
    }
    if (!((spill3374_11 == 0))) {
        break forward_join_123;
    }
    life13_45 = net.minecraft.block.BlockRailBase$EnumRailDirection.NORTH_WEST;
    }
    forwardValue3374_124_0 = life9_29;
    }
    if (!((life4_43 != null))) {
        forwardValue3374_128_0 = forwardValue3374_124_0;
        break forward_join_128;
    }
    if (!((forwardValue3374_124_0 != 0))) {
        break forward_join_139;
    }
    forwardValue3374_128_0 = life12_42;
    }
    if (!((life4_43 != null))) {
        forwardValue3374_132_0 = forwardValue3374_128_0;
        break forward_join_132;
    }
    if (!((forwardValue3374_128_0 != 0))) {
        break forward_join_139;
    }
    forwardValue3374_132_0 = life10_33;
    }
    if (!((life4_43 != null))) {
        forwardValue3374_136_0 = forwardValue3374_132_0;
        break forward_join_136;
    }
    if (!((forwardValue3374_132_0 == 0))) {
        break forward_join_139;
    }
    forwardValue3374_136_0 = life11_37;
    }
    if (!((forwardValue3374_136_0 == 0))) {
        break forward_join_139;
    }
    life13_45 = net.minecraft.block.BlockRailBase$EnumRailDirection.NORTH_EAST;
    }
    spill3374_12 = life13_45;
    spill3374_13 = net.minecraft.block.BlockRailBase$EnumRailDirection.NORTH_SOUTH;
    if (!((life4_43 != null))) {
        forwardValue3374_166_0 = spill3374_12;
        forwardValue3374_166_1 = spill3374_13;
        break forward_join_166;
    }
    if (!((spill3374_12 == spill3374_13))) {
        break forward_join_162;
    }
    spill3374_14 = moom.d2.c(((net.minecraft.world.World)(this.a)), ((moom.DT)(((moom.DT)(life5_13)).a__DT())));
    if (!((life4_43 != null))) {
        forwardValue3374_159_0 = ((spill3374_14) ? 1 : 0);
        break forward_join_159;
    }
    if (!(spill3374_14)) {
        break forward_join_154;
    }
    life13_45 = net.minecraft.block.BlockRailBase$EnumRailDirection.ASCENDING_NORTH;
    }
    forwardValue3374_159_0 = ((moom.d2.c(((net.minecraft.world.World)(this.a)), ((moom.DT)(((moom.DT)(life6_17)).a__DT())))) ? 1 : 0);
    }
    if (!((forwardValue3374_159_0 != 0))) {
        break forward_join_162;
    }
    life13_45 = net.minecraft.block.BlockRailBase$EnumRailDirection.ASCENDING_SOUTH;
    }
    spill3374_15 = life13_45;
    if (!((life4_43 != null))) {
        forwardValue3374_186_0 = spill3374_15;
        break forward_join_186;
    }
    forwardValue3374_166_0 = spill3374_15;
    forwardValue3374_166_1 = net.minecraft.block.BlockRailBase$EnumRailDirection.EAST_WEST;
    }
    if (!((forwardValue3374_166_0 == forwardValue3374_166_1))) {
        break forward_join_185;
    }
    spill3374_16 = moom.d2.c(((net.minecraft.world.World)(this.a)), ((moom.DT)(((moom.DT)(life8_25)).a__DT())));
    if (!((life4_43 != null))) {
        forwardValue3374_182_0 = ((spill3374_16) ? 1 : 0);
        break forward_join_182;
    }
    if (!(spill3374_16)) {
        break forward_join_177;
    }
    life13_45 = net.minecraft.block.BlockRailBase$EnumRailDirection.ASCENDING_EAST;
    }
    forwardValue3374_182_0 = ((moom.d2.c(((net.minecraft.world.World)(this.a)), ((moom.DT)(((moom.DT)(life7_21)).a__DT())))) ? 1 : 0);
    }
    if (!((forwardValue3374_182_0 != 0))) {
        break forward_join_185;
    }
    life13_45 = net.minecraft.block.BlockRailBase$EnumRailDirection.ASCENDING_WEST;
    }
    forwardValue3374_186_0 = life13_45;
    }
    if (!((life4_43 != null))) {
        forwardValue3374_190_0 = forwardValue3374_186_0;
        break forward_join_190;
    }
    if (!((forwardValue3374_186_0 == null))) {
        break forward_join_191;
    }
    forwardValue3374_190_0 = net.minecraft.block.BlockRailBase$EnumRailDirection.NORTH_SOUTH;
    }
    life13_45 = forwardValue3374_190_0;
    }
    this.d = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(this.d)).a__fE(((net.minecraft.block.properties.IProperty)(((moom.d2)(this.c)).a__ft())), ((java.lang.Comparable)(life13_45)))));
    ((net.minecraft.world.World)(this.a)).a(((moom.DT)(this.b)), ((net.minecraft.block.state.IBlockState)(this.d)), ((int)(3)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.block.state.IBlockState a__fE() {
return this.d;
}


private void a(net.minecraft.block.BlockRailBase$EnumRailDirection p0) {
int forwardValue345_29_0;
    int[] spill345_0;
    int spill345_1;
    long life2_3;
    int[] life4_8;
    forward_join_178: {
    forward_join_164: {
    forward_join_148: {
    forward_join_132: {
    forward_join_116: {
    forward_join_99: {
    forward_join_82: {
    forward_join_65: {
    forward_join_48: {
    forward_join_32: {
    forward_join_29: {
    forward_join_16: {
    life2_3 = (moom.e8.h ^ 50540157449157L);
    spill345_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    ((java.util.List)(this.f)).clear();
    life4_8 = spill345_0;
    spill345_1 = (moom.e7.a)[((net.minecraft.block.BlockRailBase$EnumRailDirection)(p0)).ordinal()];
    if (!((life4_8 != null))) {
        forwardValue345_29_0 = spill345_1;
        break forward_join_29;
    }
    switch (spill345_1) {
case 1:
{
        break forward_join_16;
    }
case 2:
{
        break forward_join_32;
    }
case 3:
{
        break forward_join_48;
    }
case 4:
{
        break forward_join_65;
    }
case 5:
{
        break forward_join_82;
    }
case 6:
{
        break forward_join_99;
    }
case 7:
{
        break forward_join_116;
    }
case 8:
{
        break forward_join_132;
    }
case 9:
{
        break forward_join_148;
    }
case 10:
{
        break forward_join_164;
    }
default:
{
        break forward_join_178;
    }
}
    }
    ((java.util.List)(this.f)).add(((java.lang.Object)(((moom.DT)(this.b)).c())));
    forwardValue345_29_0 = ((((java.util.List)(this.f)).add(((java.lang.Object)(((moom.DT)(this.b)).d__DT())))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue345_29_0);
    if (!((life4_8 == null))) {
        break forward_join_178;
    }
    }
    ((java.util.List)(this.f)).add(((java.lang.Object)(((moom.DT)(this.b)).e())));
    ((java.util.List)(this.f)).add(((java.lang.Object)(((moom.DT)(this.b)).f())));
    if (!((life4_8 == null))) {
        break forward_join_178;
    }
    }
    ((java.util.List)(this.f)).add(((java.lang.Object)(((moom.DT)(this.b)).e())));
    ((java.util.List)(this.f)).add(((java.lang.Object)(((moom.DT)(((moom.DT)(this.b)).f())).a__DT())));
    if (!((life4_8 == null))) {
        break forward_join_178;
    }
    }
    ((java.util.List)(this.f)).add(((java.lang.Object)(((moom.DT)(((moom.DT)(this.b)).e())).a__DT())));
    ((java.util.List)(this.f)).add(((java.lang.Object)(((moom.DT)(this.b)).f())));
    if (!((life4_8 == null))) {
        break forward_join_178;
    }
    }
    ((java.util.List)(this.f)).add(((java.lang.Object)(((moom.DT)(((moom.DT)(this.b)).c__DT())).a__DT())));
    ((java.util.List)(this.f)).add(((java.lang.Object)(((moom.DT)(this.b)).d__DT())));
    if (!((life4_8 == null))) {
        break forward_join_178;
    }
    }
    ((java.util.List)(this.f)).add(((java.lang.Object)(((moom.DT)(this.b)).c())));
    ((java.util.List)(this.f)).add(((java.lang.Object)(((moom.DT)(((moom.DT)(this.b)).d__DT())).a__DT())));
    if (!((life4_8 == null))) {
        break forward_join_178;
    }
    }
    ((java.util.List)(this.f)).add(((java.lang.Object)(((moom.DT)(this.b)).f())));
    ((java.util.List)(this.f)).add(((java.lang.Object)(((moom.DT)(this.b)).d__DT())));
    if (!((life4_8 == null))) {
        break forward_join_178;
    }
    }
    ((java.util.List)(this.f)).add(((java.lang.Object)(((moom.DT)(this.b)).e())));
    ((java.util.List)(this.f)).add(((java.lang.Object)(((moom.DT)(this.b)).d__DT())));
    if (!((life4_8 == null))) {
        break forward_join_178;
    }
    }
    ((java.util.List)(this.f)).add(((java.lang.Object)(((moom.DT)(this.b)).e())));
    ((java.util.List)(this.f)).add(((java.lang.Object)(((moom.DT)(this.b)).c())));
    if (!((life4_8 == null))) {
        break forward_join_178;
    }
    }
    ((java.util.List)(this.f)).add(((java.lang.Object)(((moom.DT)(this.b)).f())));
    ((java.util.List)(this.f)).add(((java.lang.Object)(((moom.DT)(this.b)).c())));
    }
    return;
}


private void a__Void() {
java.lang.Object lexicalValue1132_45_0;
    int[] spill1132_0;
    moom.e8 spill1132_1;
    moom.e8 spill1132_2;
    long life1_3;
    int life4_6;
    int[] life3_7;
    moom.e8 life5_20;
    lexical_join_49: {
    life1_3 = (moom.e8.h ^ 34170415795690L);
    spill1132_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life4_6 = 0;
    life3_7 = spill1132_0;
    lexical_cycle_8: while (true) {
    lexical_join_46: {
    lexical_join_45: {
    lexical_join_40: {
    if (!((life4_6 < ((java.util.List)(this.f)).size()))) {
        break lexical_join_49;
    }
    life5_20 = ((moom.e8)(this)).a(((moom.DT)(((moom.DT)(((java.util.List)(this.f)).get(((int)(life4_6))))))));
    spill1132_1 = life5_20;
    if (!((life3_7 != null))) {
        lexicalValue1132_45_0 = spill1132_1;
        break lexical_join_45;
    }
    if (!((spill1132_1 != null))) {
        break lexical_join_40;
    }
    spill1132_2 = life5_20;
    if (!((life3_7 != null))) {
        lexicalValue1132_45_0 = spill1132_2;
        break lexical_join_45;
    }
    if (!(((moom.e8)(spill1132_2)).a__Boolean(((moom.e8)(this))))) {
        break lexical_join_40;
    }
    ((java.util.List)(this.f)).set(((int)(life4_6)), ((java.lang.Object)(((moom.e8)(life5_20)).b)));
    if (!((life3_7 == null))) {
        break lexical_join_46;
    }
    }
    lexicalValue1132_45_0 = ((java.util.List)(this.f)).remove(((int)((life4_6--))));
    }
    recovery.source.CarrierOps.discard(lexicalValue1132_45_0);
    }
    life4_6 += 1;
    if (!((life3_7 == null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


private boolean a__Boolean(moom.DT p0) {
long l = moom.e8.h ^ 0x31DBD31D66BDL;
        int[] nArray = BlockPlanks$EnumType.b__ArrayInt();
        boolean bl = d2.c(this.a, p0);
        if (nArray == null) return bl;
        if (bl) return true;
        bl = d2.c(this.a, p0.a__DT());
        if (nArray == null) return bl;
        if (bl) return true;
        bl = d2.c(this.a, p0.b__DT());
        if (nArray == null) return bl;
        if (!bl) return false;
        return true;
}


private moom.e8 a(moom.DT p0) { return __sourceHandlerCall_e4be3f5f9438473ea623(this, p0); }


private boolean a__Boolean(moom.e8 p0) {
return (__sourceIntrinsic_booleanComparison((((moom.e8)(this)).b(((moom.DT)(((moom.e8)(p0)).b))))) != 0);
}


protected int a() {
int lexicalValue1130_31_0;
    int[] spill1130_0;
    boolean spill1130_1;
    long life1_3;
    int life4_6;
    int[] life3_7;
    java.util.Iterator life5_10;
    moom.bs life6_17;
    lexical_join_31: {
    lexical_join_30: {
    life1_3 = (moom.e8.h ^ 114484728989096L);
    spill1130_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life4_6 = 0;
    life3_7 = spill1130_0;
    life5_10 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).iterator();
    lexical_cycle_11: while (true) {
    lexical_join_28: {
    if (!(((java.util.Iterator)(life5_10)).hasNext())) {
        break lexical_join_30;
    }
    life6_17 = ((moom.bs)(((java.util.Iterator)(life5_10)).next()));
    spill1130_1 = ((moom.e8)(this)).a__Boolean(((moom.DT)(((moom.DT)(this.b)).a(((moom.bs)(life6_17))))));
    if (!((life3_7 != null))) {
        lexicalValue1130_31_0 = ((spill1130_1) ? 1 : 0);
        break lexical_join_31;
    }
    if (!(spill1130_1)) {
        break lexical_join_28;
    }
    life4_6 += 1;
    }
    if (!((life3_7 == null))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    lexicalValue1130_31_0 = life4_6;
    }
    return lexicalValue1130_31_0;
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
