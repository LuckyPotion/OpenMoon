package moom;


class OM extends paulscode.sound.SoundSystem {

private static long a;

private OM() {
super();
}


static {
moom.OM.a = (moom._c.a(2805081192469820764L, -8265917415432371748L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(77287812160122L);
}

private static native <E extends Throwable> boolean __sourceHandlerCall_453c1c5fc63225dfcdb5(moom.OM a0, java.lang.String a1) throws E;
private static final class __SourceHandler_453c1c5fc63225dfcdb5 {

public static boolean f381(moom.OM receiver, java.lang.String p0) throws Throwable {
    java.lang.Object forestValue381_24_0;
    paulscode.sound.Source forestValue381_31_0;
    int forestValue381_46_0;
    int forestValue381_48_0;
    java.lang.String spill381_0;
    paulscode.sound.Library spill381_1;
    int spill381_2;
    paulscode.sound.Source spill381_3;
    boolean spill381_4;
    boolean spill381_5;
    boolean spill381_6;
    long life2_3;
    java.lang.Object life5_7;
    java.lang.String life4_9;
    paulscode.sound.Source life6_26;
    forest_join_48: {
    forest_join_47: {
    forest_join_46: {
    forest_join_45: {
    forest_join_31: {
    forest_join_24: {
    forest_join_19: {
    life2_3 = (__fieldRead381_0() ^ 33571748101235L);
    spill381_0 = __call381_1();
    __monitorEnter381_3((life5_7 = __fieldRead381_2()));
    life4_9 = spill381_0;
    spill381_1 = __fieldRead381_4(receiver);
    if (!((life4_9 == null))) {
        forestValue381_24_0 = spill381_1;
        break forest_join_24;
    }
    if (!((spill381_1 == null))) {
        break forest_join_19;
    }
    spill381_2 = 0;
    __monitorExit381_5(life5_7);
    return __integerCategory381_6(spill381_2);
    }
    forestValue381_24_0 = __call381_9(__call381_8(__fieldRead381_7(receiver)), p0);
    }
    life6_26 = __cast381_10(forestValue381_24_0);
    spill381_3 = life6_26;
    if (!((life4_9 == null))) {
        forestValue381_31_0 = spill381_3;
        break forest_join_31;
    }
    if (!((spill381_3 != null))) {
        break forest_join_47;
    }
    forestValue381_31_0 = life6_26;
    }
    spill381_4 = __call381_11(forestValue381_31_0);
    if (!((life4_9 == null))) {
        forestValue381_46_0 = __integerCategory381_12(spill381_4);
        break forest_join_46;
    }
    if (!((!spill381_4))) {
        break forest_join_45;
    }
    spill381_5 = __call381_13(life6_26);
    if (!((life4_9 == null))) {
        forestValue381_46_0 = __integerCategory381_14(spill381_5);
        break forest_join_46;
    }
    if (!((!spill381_5))) {
        break forest_join_45;
    }
    spill381_6 = __fieldRead381_15(life6_26);
    if (!((life4_9 == null))) {
        forestValue381_46_0 = __integerCategory381_16(spill381_6);
        break forest_join_46;
    }
    if (!(spill381_6)) {
        break forest_join_47;
    }
    }
    forestValue381_46_0 = 1;
    }
    forestValue381_48_0 = forestValue381_46_0;
    break forest_join_48;
    }
    forestValue381_48_0 = 0;
    }
    __monitorExit381_17(life5_7);
    return __integerCategory381_18(forestValue381_48_0);
}
public static boolean h381_0(moom.Oo p0) throws Throwable {
    throw __call3038100_0(p0);
}
public static boolean h381_1(moom.Oo p0) throws Throwable {
    throw __call3038101_0(p0);
}
public static boolean h381_2(moom.Oo p0) throws Throwable {
    throw __call3038102_0(p0);
}
public static boolean h381_3(moom.Oo p0) throws Throwable {
    throw __call3038103_0(p0);
}
public static boolean h381_4(moom.Oo p0) throws Throwable {
    throw __call3038104_0(p0);
}
public static boolean h381_5(moom.Oo p0) throws Throwable {
    throw __call3038105_0(p0);
}
public static boolean h381_6(moom.Oo p0) throws Throwable {
    throw __call3038106_0(p0);
}
public static boolean h381_7(java.lang.Throwable p0, java.lang.Object p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3038107_0(p1);
    throw life2_2;
}
private static native long __fieldRead381_0() throws Throwable;
private static native java.lang.String __call381_1() throws Throwable;
private static native java.lang.Object __fieldRead381_2() throws Throwable;
private static native void __monitorEnter381_3(java.lang.Object a0) throws Throwable;
private static native paulscode.sound.Library __fieldRead381_4(moom.OM a0) throws Throwable;
private static native void __monitorExit381_5(java.lang.Object a0) throws Throwable;
private static native boolean __integerCategory381_6(int value) throws Throwable;
private static native paulscode.sound.Library __fieldRead381_7(moom.OM a0) throws Throwable;
private static native java.util.HashMap __call381_8(paulscode.sound.Library a0) throws Throwable;
private static native java.lang.Object __call381_9(java.util.HashMap a0, java.lang.String a1) throws Throwable;
private static native paulscode.sound.Source __cast381_10(java.lang.Object a0) throws Throwable;
private static native boolean __call381_11(paulscode.sound.Source a0) throws Throwable;
private static native int __integerCategory381_12(boolean value) throws Throwable;
private static native boolean __call381_13(paulscode.sound.Source a0) throws Throwable;
private static native int __integerCategory381_14(boolean value) throws Throwable;
private static native boolean __fieldRead381_15(paulscode.sound.Source a0) throws Throwable;
private static native int __integerCategory381_16(boolean value) throws Throwable;
private static native void __monitorExit381_17(java.lang.Object a0) throws Throwable;
private static native boolean __integerCategory381_18(int value) throws Throwable;
private static native moom.Oo __call3038100_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3038101_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3038102_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3038103_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3038104_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3038105_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3038106_0(moom.Oo a0) throws Throwable;
private static native void __monitorExit3038107_0(java.lang.Object a0) throws Throwable;

}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean playing(java.lang.String p0) { return __sourceHandlerCall_453c1c5fc63225dfcdb5(this, p0); }

}
