package net.minecraft.command;


public class CommandHandler implements net.minecraft.command.ICommandManager {

private static org.apache.logging.log4j.Logger a;

private java.util.Map<java.lang.String, net.minecraft.command.ICommand> b;

private java.util.Set<net.minecraft.command.ICommand> c;

private static long d;

public CommandHandler() {
super();
    this.b = com.google.common.collect.Maps.newHashMap();
    this.c = com.google.common.collect.Sets.newHashSet();
}


static {
net.minecraft.command.CommandHandler.d = (moom._c.a(-6113649466910853071L, -6428104262138146199L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(143652179475121L);
    net.minecraft.command.CommandHandler.a = org.apache.logging.log4j.LogManager.getLogger();
}

private static native <E extends Throwable> boolean __sourceHandlerCall_f4507c949cbf423eef34(net.minecraft.command.CommandHandler a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, net.minecraft.command.ICommand a3, java.lang.String a4) throws E;
private static final class __SourceHandler_f4507c949cbf423eef34 {

public static boolean f165(net.minecraft.command.CommandHandler receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, net.minecraft.command.ICommand p2, java.lang.String p3) throws Throwable {
    __call165_0(p2, p0, p1);
    return __integerCategory165_1(1);
}
public static boolean h165_0(moom.cc p0, net.minecraft.command.ICommandSender p1) throws Throwable {
    moom.cc life2_2;
    moom.CN life3_19;
    life2_2 = p0;
    life3_19 = new moom.CN("commands.generic.usage", new java.lang.Object[] {new moom.CN(__call3016500_0(life2_2), __call3016500_1(life2_2))});
    __call3016500_4(__call3016500_2(life3_19), __fieldRead3016500_3());
    __call3016500_5(p1, life3_19);
    return __integerCategory3016500_6(0);
}
public static boolean h165_1(moom.b7 p0, net.minecraft.command.ICommandSender p1) throws Throwable {
    moom.b7 life2_2;
    moom.CN life3_10;
    life2_2 = p0;
    life3_10 = new moom.CN(__call3016501_0(life2_2), __call3016501_1(life2_2));
    __call3016501_4(__call3016501_2(life3_10), __fieldRead3016501_3());
    __call3016501_5(p1, life3_10);
    return __integerCategory3016501_6(0);
}
public static boolean h165_2(java.lang.Throwable p0, net.minecraft.command.ICommandSender p1, java.lang.String p2) throws Throwable {
    java.lang.Throwable life3_2;
    moom.CN life4_9;
    life3_2 = p0;
    life4_9 = new moom.CN("commands.generic.exception", new java.lang.Object[0]);
    __call3016502_2(__call3016502_0(life4_9), __fieldRead3016502_1());
    __call3016502_3(p1, life4_9);
    __call3016502_6(__fieldRead3016502_4(), __invokedynamic3016502_5(p2));
    return __integerCategory3016502_7(0);
}
private static native void __call165_0(net.minecraft.command.ICommand a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws Throwable;
private static native boolean __integerCategory165_1(int value) throws Throwable;
private static native java.lang.String __call3016500_0(moom.cc a0) throws Throwable;
private static native java.lang.Object[] __call3016500_1(moom.cc a0) throws Throwable;
private static native moom.CO __call3016500_2(moom.CN a0) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead3016500_3() throws Throwable;
private static native moom.CO __call3016500_4(moom.CO a0, net.minecraft.util.EnumChatFormatting a1) throws Throwable;
private static native void __call3016500_5(net.minecraft.command.ICommandSender a0, moom.CN a1) throws Throwable;
private static native boolean __integerCategory3016500_6(int value) throws Throwable;
private static native java.lang.String __call3016501_0(moom.b7 a0) throws Throwable;
private static native java.lang.Object[] __call3016501_1(moom.b7 a0) throws Throwable;
private static native moom.CO __call3016501_2(moom.CN a0) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead3016501_3() throws Throwable;
private static native moom.CO __call3016501_4(moom.CO a0, net.minecraft.util.EnumChatFormatting a1) throws Throwable;
private static native void __call3016501_5(net.minecraft.command.ICommandSender a0, moom.CN a1) throws Throwable;
private static native boolean __integerCategory3016501_6(int value) throws Throwable;
private static native moom.CO __call3016502_0(moom.CN a0) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead3016502_1() throws Throwable;
private static native moom.CO __call3016502_2(moom.CO a0, net.minecraft.util.EnumChatFormatting a1) throws Throwable;
private static native void __call3016502_3(net.minecraft.command.ICommandSender a0, moom.CN a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3016502_4() throws Throwable;
private static native java.lang.String __invokedynamic3016502_5(java.lang.String a0) throws Throwable;
private static native void __call3016502_6(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native boolean __integerCategory3016502_7(int value) throws Throwable;

}


public java.util.List<net.minecraft.command.ICommand> a(net.minecraft.command.ICommandSender p0) {
int lexicalValue1515_28_0;
    boolean spill1515_0;
    boolean spill1515_1;
    long life2_3;
    java.util.ArrayList life5_6;
    int life4_7;
    java.util.Iterator life6_11;
    net.minecraft.command.ICommand life7_18;
    lexical_join_31: {
    life2_3 = (net.minecraft.command.CommandHandler.d ^ 33751917886445L);
    spill1515_0 = moom.b7.c();
    life5_6 = com.google.common.collect.Lists.newArrayList();
    life4_7 = ((spill1515_0) ? 1 : 0);
    life6_11 = ((java.util.Set)(this.c)).iterator();
    lexical_cycle_12: while (true) {
    lexical_join_29: {
    lexical_join_28: {
    if (!(((java.util.Iterator)(life6_11)).hasNext())) {
        break lexical_join_31;
    }
    life7_18 = ((net.minecraft.command.ICommand)(((java.util.Iterator)(life6_11)).next()));
    spill1515_1 = ((net.minecraft.command.ICommand)(life7_18)).a__Boolean(((net.minecraft.command.ICommandSender)(p0)));
    if (!((life4_7 != 0))) {
        lexicalValue1515_28_0 = ((spill1515_1) ? 1 : 0);
        break lexical_join_28;
    }
    if (!(spill1515_1)) {
        break lexical_join_29;
    }
    lexicalValue1515_28_0 = ((((java.util.List)(life5_6)).add(((java.lang.Object)(life7_18)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1515_28_0);
    }
    if (!((life4_7 == 0))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    return life5_6;
}


public java.util.Map<java.lang.String, net.minecraft.command.ICommand> a() {
return this.b;
}


private int a(net.minecraft.command.ICommand p0, java.lang.String[] p1) {
int lexicalValue1514_27_0;
    int lexicalValue1514_31_0;
    int lexicalValue1514_36_0;
    boolean spill1514_0;
    long life3_3;
    int life5_5;
    int life6_9;
    lexical_join_36: {
    lexical_join_35: {
    life3_3 = (net.minecraft.command.CommandHandler.d ^ 72272328268202L);
    life5_5 = ((moom.b7.b()) ? 1 : 0);
    if (!((p0 != null))) {
        break lexical_join_35;
    }
    life6_9 = 0;
    lexical_cycle_10: while (true) {
    lexical_join_32: {
    lexical_join_31: {
    lexical_join_27: {
    if (!((life6_9 < (p1).length))) {
        break lexical_join_35;
    }
    spill1514_0 = ((net.minecraft.command.ICommand)(p0)).a__Boolean(((java.lang.String[])(p1)), ((int)(life6_9)));
    if (!((life5_5 == 0))) {
        lexicalValue1514_36_0 = ((spill1514_0) ? 1 : 0);
        break lexical_join_36;
    }
    if (!((life5_5 == 0))) {
        lexicalValue1514_27_0 = ((spill1514_0) ? 1 : 0);
        break lexical_join_27;
    }
    if (!(spill1514_0)) {
        break lexical_join_32;
    }
    lexicalValue1514_27_0 = ((moom.qU.a__Boolean(((java.lang.String)((p1)[life6_9])))) ? 1 : 0);
    }
    if (!((life5_5 == 0))) {
        lexicalValue1514_31_0 = lexicalValue1514_27_0;
        break lexical_join_31;
    }
    if (!((lexicalValue1514_27_0 != 0))) {
        break lexical_join_32;
    }
    lexicalValue1514_31_0 = life6_9;
    }
    return lexicalValue1514_31_0;
    }
    life6_9 += 1;
    if (!((life5_5 != 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    lexicalValue1514_36_0 = -1;
    }
    return lexicalValue1514_36_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a(net.minecraft.command.ICommandSender p0, java.lang.String p1) {
java.lang.String lexicalValue1516_21_0;
    java.lang.String lexicalValue1516_21_1;
    net.minecraft.command.ICommand lexicalValue1516_65_0;
    int lexicalValue1516_71_0;
    int lexicalValue1516_135_0;
    int lexicalValue1516_161_0;
    boolean spill1516_0;
    java.lang.String spill1516_1;
    java.lang.String spill1516_2;
    net.minecraft.command.ICommand spill1516_3;
    boolean spill1516_4;
    boolean spill1516_5;
    long life3_3;
    java.lang.String life2_7;
    int life5_8;
    java.lang.String[] life6_25;
    java.lang.String life7_29;
    java.lang.String[] life6_32;
    net.minecraft.command.ICommand life8_38;
    int life9_43;
    int life10_45;
    moom.CN life11_59;
    java.util.List life11_96;
    java.lang.String life12_100;
    java.util.Iterator life13_108;
    net.minecraft.entity.Entity life14_115;
    moom.CN life11_174;
    lexical_join_161: {
    lexical_join_156: {
    lexical_join_141: {
    lexical_join_135: {
    lexical_join_125: {
    lexical_join_119: {
    lexical_join_71: {
    lexical_join_65: {
    lexical_join_64: {
    lexical_join_21: {
    lexical_join_19: {
    life3_3 = (net.minecraft.command.CommandHandler.d ^ 11319696335091L);
    spill1516_0 = moom.b7.c();
    life2_7 = ((java.lang.String)(p1)).trim();
    life5_8 = ((spill1516_0) ? 1 : 0);
    spill1516_1 = life2_7;
    spill1516_2 = "/";
    if (!((life5_8 != 0))) {
        lexicalValue1516_21_0 = spill1516_1;
        lexicalValue1516_21_1 = spill1516_2;
        break lexical_join_21;
    }
    if (!(((java.lang.String)(spill1516_1)).startsWith(((java.lang.String)(spill1516_2))))) {
        break lexical_join_19;
    }
    life2_7 = ((java.lang.String)(life2_7)).substring(((int)(1)));
    }
    lexicalValue1516_21_0 = life2_7;
    lexicalValue1516_21_1 = " ";
    }
    life6_25 = ((java.lang.String)(lexicalValue1516_21_0)).split(((java.lang.String)(lexicalValue1516_21_1)));
    life7_29 = (life6_25)[0];
    life6_32 = net.minecraft.command.CommandHandler.a(((java.lang.String[])(life6_25)));
    life8_38 = ((net.minecraft.command.ICommand)(((java.util.Map)(this.b)).get(((java.lang.Object)(life7_29)))));
    life9_43 = ((net.minecraft.command.CommandHandler)(this)).a(((net.minecraft.command.ICommand)(life8_38)), ((java.lang.String[])(life6_32)));
    life10_45 = 0;
    spill1516_3 = life8_38;
    if (!((life5_8 != 0))) {
        lexicalValue1516_65_0 = spill1516_3;
        break lexical_join_65;
    }
    if (!((spill1516_3 == null))) {
        break lexical_join_64;
    }
    life11_59 = new moom.CN("commands.generic.notFound", new java.lang.Object[0]);
    ((moom.CO)(((moom.CN)(life11_59)).a__CO())).a(((net.minecraft.util.EnumChatFormatting)(net.minecraft.util.EnumChatFormatting.RED)));
    ((net.minecraft.command.ICommandSender)(p0)).a(((net.minecraft.util.IChatComponent)(life11_59)));
    if (!((life5_8 == 0))) {
        break lexical_join_156;
    }
    }
    lexicalValue1516_65_0 = life8_38;
    }
    spill1516_4 = ((net.minecraft.command.ICommand)(lexicalValue1516_65_0)).a__Boolean(((net.minecraft.command.ICommandSender)(p0)));
    if (!((life5_8 != 0))) {
        lexicalValue1516_71_0 = ((spill1516_4) ? 1 : 0);
        break lexical_join_71;
    }
    if (!(spill1516_4)) {
        break lexical_join_141;
    }
    lexicalValue1516_71_0 = life9_43;
    }
    if (!((life5_8 != 0))) {
        lexicalValue1516_135_0 = lexicalValue1516_71_0;
        break lexical_join_135;
    }
    if (!((lexicalValue1516_71_0 > -1))) {
        break lexical_join_125;
    }
    life11_96 = moom.qU.a(((net.minecraft.command.ICommandSender)(p0)), ((java.lang.String)((life6_32)[life9_43])), ((java.lang.Class)(net.minecraft.entity.Entity.class)));
    life12_100 = (life6_32)[life9_43];
    ((net.minecraft.command.ICommandSender)(p0)).a(((net.minecraft.command.CommandResultStats$Type)(net.minecraft.command.CommandResultStats$Type.AFFECTED_ENTITIES)), ((int)(((java.util.List)(life11_96)).size())));
    life13_108 = ((java.util.List)(life11_96)).iterator();
    lexical_cycle_94: while (true) {
    lexical_join_117: {
    if (!(((java.util.Iterator)(life13_108)).hasNext())) {
        break lexical_join_119;
    }
    life14_115 = ((net.minecraft.entity.Entity)(((java.util.Iterator)(life13_108)).next()));
    (life6_32)[life9_43] = ((java.util.UUID)(((net.minecraft.entity.Entity)(life14_115)).a__UUID())).toString();
    spill1516_5 = ((net.minecraft.command.CommandHandler)(this)).a(((net.minecraft.command.ICommandSender)(p0)), ((java.lang.String[])(life6_32)), ((net.minecraft.command.ICommand)(life8_38)), ((java.lang.String)(life2_7)));
    if (!((life5_8 != 0))) {
        lexicalValue1516_161_0 = ((spill1516_5) ? 1 : 0);
        break lexical_join_161;
    }
    if (!(spill1516_5)) {
        break lexical_join_117;
    }
    life10_45 += 1;
    }
    if (!((life5_8 == 0))) { continue lexical_cycle_94; }
    break lexical_cycle_94;
    }
    }
    (life6_32)[life9_43] = life12_100;
    if (!((life5_8 == 0))) {
        break lexical_join_156;
    }
    }
    ((net.minecraft.command.ICommandSender)(p0)).a(((net.minecraft.command.CommandResultStats$Type)(net.minecraft.command.CommandResultStats$Type.AFFECTED_ENTITIES)), ((int)(1)));
    lexicalValue1516_135_0 = ((((net.minecraft.command.CommandHandler)(this)).a(((net.minecraft.command.ICommandSender)(p0)), ((java.lang.String[])(life6_32)), ((net.minecraft.command.ICommand)(life8_38)), ((java.lang.String)(life2_7)))) ? 1 : 0);
    }
    if (!((life5_8 != 0))) {
        lexicalValue1516_161_0 = lexicalValue1516_135_0;
        break lexical_join_161;
    }
    if (!((lexicalValue1516_135_0 != 0))) {
        break lexical_join_156;
    }
    life10_45 += 1;
    if (!((life5_8 == 0))) {
        break lexical_join_156;
    }
    }
    life11_174 = new moom.CN("commands.generic.permission", new java.lang.Object[0]);
    ((moom.CO)(((moom.CN)(life11_174)).a__CO())).a(((net.minecraft.util.EnumChatFormatting)(net.minecraft.util.EnumChatFormatting.RED)));
    ((net.minecraft.command.ICommandSender)(p0)).a(((net.minecraft.util.IChatComponent)(life11_174)));
    }
    ((net.minecraft.command.ICommandSender)(p0)).a(((net.minecraft.command.CommandResultStats$Type)(net.minecraft.command.CommandResultStats$Type.SUCCESS_COUNT)), ((int)(life10_45)));
    lexicalValue1516_161_0 = life10_45;
    }
    return lexicalValue1516_161_0;
}


protected boolean a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, net.minecraft.command.ICommand p2, java.lang.String p3) { return __sourceHandlerCall_f4507c949cbf423eef34(this, p0, p1, p2, p3); }


public net.minecraft.command.ICommand a(net.minecraft.command.ICommand p0) {
java.lang.Object lexicalValue1513_53_0;
    net.minecraft.command.ICommand lexicalValue1513_57_0;
    boolean spill1513_0;
    net.minecraft.command.ICommand spill1513_1;
    java.lang.String spill1513_2;
    long life2_3;
    int life4_12;
    java.util.Iterator life5_21;
    java.lang.String life6_28;
    net.minecraft.command.ICommand life7_34;
    lexical_join_57: {
    lexical_join_56: {
    life2_3 = (net.minecraft.command.CommandHandler.d ^ 93422886456419L);
    spill1513_0 = moom.b7.b();
    ((java.util.Map)(this.b)).put(((java.lang.Object)(((net.minecraft.command.ICommand)(p0)).a__String())), ((java.lang.Object)(p0)));
    life4_12 = ((spill1513_0) ? 1 : 0);
    ((java.util.Set)(this.c)).add(((java.lang.Object)(p0)));
    life5_21 = ((java.util.List)(((net.minecraft.command.ICommand)(p0)).a__List())).iterator();
    lexical_cycle_22: while (true) {
    lexical_join_54: {
    lexical_join_53: {
    lexical_join_48: {
    if (!(((java.util.Iterator)(life5_21)).hasNext())) {
        break lexical_join_56;
    }
    life6_28 = ((java.lang.String)(((java.util.Iterator)(life5_21)).next()));
    life7_34 = ((net.minecraft.command.ICommand)(((java.util.Map)(this.b)).get(((java.lang.Object)(life6_28)))));
    spill1513_1 = life7_34;
    if (!((life4_12 == 0))) {
        lexicalValue1513_57_0 = spill1513_1;
        break lexical_join_57;
    }
    if (!((life4_12 == 0))) {
        lexicalValue1513_53_0 = spill1513_1;
        break lexical_join_53;
    }
    if (!((spill1513_1 != null))) {
        break lexical_join_48;
    }
    spill1513_2 = ((net.minecraft.command.ICommand)(life7_34)).a__String();
    if (!((life4_12 == 0))) {
        lexicalValue1513_53_0 = spill1513_2;
        break lexical_join_53;
    }
    if (!((!((java.lang.String)(spill1513_2)).equals(((java.lang.Object)(life6_28)))))) {
        break lexical_join_54;
    }
    }
    lexicalValue1513_53_0 = ((java.util.Map)(this.b)).put(((java.lang.Object)(life6_28)), ((java.lang.Object)(p0)));
    }
    recovery.source.CarrierOps.discard(lexicalValue1513_53_0);
    }
    if (!((life4_12 != 0))) { continue lexical_cycle_22; }
    break lexical_cycle_22;
    }
    }
    lexicalValue1513_57_0 = p0;
    }
    return lexicalValue1513_57_0;
}


private static java.lang.String[] a(java.lang.String[] p0) {
java.lang.String[] local1 = new java.lang.String[((p0).length - 1)];
    java.lang.System.arraycopy(((java.lang.Object)(p0)), ((int)(1)), ((java.lang.Object)(local1)), ((int)(0)), ((int)(((p0).length - 1))));
    return local1;
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String p1, moom.DT p2) {
int lexicalValue1517_48_0;
    int lexicalValue1517_56_0;
    int lexicalValue1517_66_0;
    int lexicalValue1517_66_1;
    java.lang.Object lexicalValue1517_71_0;
    net.minecraft.command.ICommand lexicalValue1517_78_0;
    net.minecraft.command.ICommand lexicalValue1517_85_0;
    net.minecraft.command.ICommandSender lexicalValue1517_85_1;
    boolean spill1517_0;
    int spill1517_1;
    int spill1517_2;
    boolean spill1517_3;
    java.lang.String[] spill1517_4;
    net.minecraft.command.ICommand spill1517_5;
    net.minecraft.command.ICommandSender spill1517_6;
    long life4_3;
    java.lang.String[] life7_9;
    int life6_10;
    java.lang.String life8_14;
    java.util.ArrayList life9_25;
    java.util.Iterator life10_30;
    java.util.Map.Entry life11_37;
    net.minecraft.command.ICommand life9_93;
    lexical_join_90: {
    lexical_join_85: {
    lexical_join_78: {
    lexical_join_71: {
    lexical_join_66: {
    lexical_join_61: {
    lexical_join_59: {
    life4_3 = (net.minecraft.command.CommandHandler.d ^ 76908735478449L);
    spill1517_0 = moom.b7.c();
    life7_9 = ((java.lang.String)(p1)).split(((java.lang.String)(" ")), ((int)(-1)));
    life6_10 = ((spill1517_0) ? 1 : 0);
    life8_14 = (life7_9)[0];
    spill1517_1 = (life7_9).length;
    spill1517_2 = 1;
    if (!((life6_10 != 0))) {
        lexicalValue1517_66_0 = spill1517_1;
        lexicalValue1517_66_1 = spill1517_2;
        break lexical_join_66;
    }
    if (!((spill1517_1 == spill1517_2))) {
        break lexical_join_61;
    }
    life9_25 = com.google.common.collect.Lists.newArrayList();
    life10_30 = ((java.util.Set)(((java.util.Map)(this.b)).entrySet())).iterator();
    lexical_cycle_28: while (true) {
    lexical_join_57: {
    lexical_join_56: {
    lexical_join_48: {
    if (!(((java.util.Iterator)(life10_30)).hasNext())) {
        break lexical_join_59;
    }
    life11_37 = ((java.util.Map.Entry)(((java.util.Iterator)(life10_30)).next()));
    spill1517_3 = net.minecraft.command.CommandBase.a(((java.lang.String)(life8_14)), ((java.lang.String)(((java.lang.String)(((java.util.Map.Entry)(life11_37)).getKey())))));
    if (!((life6_10 != 0))) {
        lexicalValue1517_48_0 = ((spill1517_3) ? 1 : 0);
        break lexical_join_48;
    }
    if (!(spill1517_3)) {
        break lexical_join_57;
    }
    lexicalValue1517_48_0 = ((((net.minecraft.command.ICommand)(((net.minecraft.command.ICommand)(((java.util.Map.Entry)(life11_37)).getValue())))).a__Boolean(((net.minecraft.command.ICommandSender)(p0)))) ? 1 : 0);
    }
    if (!((life6_10 != 0))) {
        lexicalValue1517_56_0 = lexicalValue1517_48_0;
        break lexical_join_56;
    }
    if (!((lexicalValue1517_48_0 != 0))) {
        break lexical_join_57;
    }
    lexicalValue1517_56_0 = ((((java.util.List)(life9_25)).add(((java.lang.Object)(((java.lang.String)(((java.util.Map.Entry)(life11_37)).getKey())))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1517_56_0);
    }
    if (!((life6_10 == 0))) { continue lexical_cycle_28; }
    break lexical_cycle_28;
    }
    }
    return life9_25;
    }
    spill1517_4 = life7_9;
    if (!((life6_10 != 0))) {
        lexicalValue1517_71_0 = spill1517_4;
        break lexical_join_71;
    }
    lexicalValue1517_66_0 = (spill1517_4).length;
    lexicalValue1517_66_1 = 1;
    }
    if (!((lexicalValue1517_66_0 > lexicalValue1517_66_1))) {
        break lexical_join_90;
    }
    lexicalValue1517_71_0 = ((java.util.Map)(this.b)).get(((java.lang.Object)(life8_14)));
    }
    life9_93 = ((net.minecraft.command.ICommand)(lexicalValue1517_71_0));
    spill1517_5 = life9_93;
    if (!((life6_10 != 0))) {
        lexicalValue1517_78_0 = spill1517_5;
        break lexical_join_78;
    }
    if (!((spill1517_5 != null))) {
        break lexical_join_90;
    }
    lexicalValue1517_78_0 = life9_93;
    }
    spill1517_6 = p0;
    if (!((life6_10 != 0))) {
        lexicalValue1517_85_0 = lexicalValue1517_78_0;
        lexicalValue1517_85_1 = spill1517_6;
        break lexical_join_85;
    }
    if (!(((net.minecraft.command.ICommand)(lexicalValue1517_78_0)).a__Boolean(((net.minecraft.command.ICommandSender)(spill1517_6))))) {
        break lexical_join_90;
    }
    lexicalValue1517_85_0 = life9_93;
    lexicalValue1517_85_1 = p0;
    }
    return ((net.minecraft.command.ICommand)(lexicalValue1517_85_0)).a(((net.minecraft.command.ICommandSender)(lexicalValue1517_85_1)), ((java.lang.String[])(net.minecraft.command.CommandHandler.a(((java.lang.String[])(life7_9))))), ((moom.DT)(p2)));
    }
    return null;
}

}
