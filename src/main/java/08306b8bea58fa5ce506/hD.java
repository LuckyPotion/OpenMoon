package moom;


public class hD extends net.minecraft.client.gui.GuiScreen {

private static long G;

public hD() {
super();
}

private static native <E extends Throwable> moom.gc __sourceHandlerCall_661b2f1599bcf4708dcf(int a0, int a1, java.util.List a2) throws E;
private static final class __SourceHandler_661b2f1599bcf4708dcf {

public static moom.gc f1043(int p0, int p1, java.util.List p2) throws Throwable {
    int lexicalValue1043_23_0;
    int lexicalValue1043_36_0;
    int lexicalValue1043_36_1;
    int lexicalValue1043_44_0;
    int lexicalValue1043_44_1;
    int lexicalValue1043_52_0;
    int lexicalValue1043_52_1;
    int[] spill1043_0;
    boolean spill1043_1;
    int spill1043_2;
    int spill1043_3;
    long life3_3;
    java.util.Iterator life6_7;
    int[] life5_8;
    moom.gc life7_15;
    int life8_29;
    int life9_32;
    lexical_join_57: {
    life3_3 = (__fieldRead1043_0() ^ 81868558698123L);
    spill1043_0 = __call1043_1();
    life6_7 = __call1043_2(p2);
    life5_8 = spill1043_0;
    lexical_cycle_9: while (true) {
    lexical_join_55: {
    lexical_join_52: {
    lexical_join_44: {
    lexical_join_36: {
    lexical_join_23: {
    if (!(__call1043_3(life6_7))) {
        break lexical_join_57;
    }
    life7_15 = __cast1043_5(__call1043_4(life6_7));
    spill1043_1 = __fieldRead1043_6(life7_15);
    if (!((life5_8 == null))) {
        lexicalValue1043_23_0 = __integerCategory1043_7(spill1043_1);
        break lexical_join_23;
    }
    if (!(spill1043_1)) {
        break lexical_join_55;
    }
    lexicalValue1043_23_0 = __call1043_8(life7_15);
    }
    life8_29 = lexicalValue1043_23_0;
    life9_32 = __call1043_9(life7_15);
    spill1043_2 = p0;
    spill1043_3 = __fieldRead1043_10(life7_15);
    if (!((life5_8 == null))) {
        lexicalValue1043_36_0 = spill1043_2;
        lexicalValue1043_36_1 = spill1043_3;
        break lexical_join_36;
    }
    if (!((spill1043_2 >= spill1043_3))) {
        break lexical_join_55;
    }
    lexicalValue1043_36_0 = p1;
    lexicalValue1043_36_1 = __fieldRead1043_11(life7_15);
    }
    if (!((life5_8 == null))) {
        lexicalValue1043_44_0 = lexicalValue1043_36_0;
        lexicalValue1043_44_1 = lexicalValue1043_36_1;
        break lexical_join_44;
    }
    if (!((lexicalValue1043_36_0 >= lexicalValue1043_36_1))) {
        break lexical_join_55;
    }
    lexicalValue1043_44_0 = p0;
    lexicalValue1043_44_1 = (__fieldRead1043_12(life7_15) + life8_29);
    }
    if (!((life5_8 == null))) {
        lexicalValue1043_52_0 = lexicalValue1043_44_0;
        lexicalValue1043_52_1 = lexicalValue1043_44_1;
        break lexical_join_52;
    }
    if (!((lexicalValue1043_44_0 < lexicalValue1043_44_1))) {
        break lexical_join_55;
    }
    lexicalValue1043_52_0 = p1;
    lexicalValue1043_52_1 = (__fieldRead1043_13(life7_15) + life9_32);
    }
    if (!((lexicalValue1043_52_0 < lexicalValue1043_52_1))) {
        break lexical_join_55;
    }
    return life7_15;
    }
    if (!((life5_8 != null))) { continue lexical_cycle_9; }
    break lexical_cycle_9;
    }
    }
    return null;
}
public static void h1043_0(moom.Oo p0) throws Throwable {
    throw __call1104300_0(p0);
}
public static void h1043_1(moom.Oo p0) throws Throwable {
    throw __call1104301_0(p0);
}
public static void h1043_2(moom.Oo p0) throws Throwable {
    throw __call1104302_0(p0);
}
public static void h1043_3(moom.Oo p0) throws Throwable {
    throw __call1104303_0(p0);
}
public static void h1043_4(moom.Oo p0) throws Throwable {
    throw __call1104304_0(p0);
}
public static void h1043_5(moom.Oo p0) throws Throwable {
    throw __call1104305_0(p0);
}
public static void h1043_6(moom.Oo p0) throws Throwable {
    throw __call1104306_0(p0);
}
public static void h1043_7(moom.Oo p0) throws Throwable {
    throw __call1104307_0(p0);
}
public static void h1043_8(moom.Oo p0) throws Throwable {
    throw __call1104308_0(p0);
}
private static native long __fieldRead1043_0() throws Throwable;
private static native int[] __call1043_1() throws Throwable;
private static native java.util.Iterator __call1043_2(java.util.List a0) throws Throwable;
private static native boolean __call1043_3(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1043_4(java.util.Iterator a0) throws Throwable;
private static native moom.gc __cast1043_5(java.lang.Object a0) throws Throwable;
private static native boolean __fieldRead1043_6(moom.gc a0) throws Throwable;
private static native int __integerCategory1043_7(boolean value) throws Throwable;
private static native int __call1043_8(moom.gc a0) throws Throwable;
private static native int __call1043_9(moom.gc a0) throws Throwable;
private static native int __fieldRead1043_10(moom.gc a0) throws Throwable;
private static native int __fieldRead1043_11(moom.gc a0) throws Throwable;
private static native int __fieldRead1043_12(moom.gc a0) throws Throwable;
private static native int __fieldRead1043_13(moom.gc a0) throws Throwable;
private static native java.lang.Exception __call1104300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104303_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104304_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104305_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104306_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104307_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104308_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_8d94dc4ccc0ebda969a8(moom.hD a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_8d94dc4ccc0ebda969a8 {

public static void f1042(moom.hD receiver, int p0, int p1, int p2) throws Throwable {
    int forwardValue1042_18_0;
    int forwardValue1042_18_1;
    moom.gc forwardValue1042_27_0;
    moom.gc forwardValue1042_32_0;
    int[] spill1042_0;
    int spill1042_1;
    int spill1042_2;
    moom.gc spill1042_3;
    long life4_3;
    int[] life6_10;
    moom.gc life7_27;
    forward_join_39: {
    forward_join_32: {
    forward_join_27: {
    forward_join_18: {
    life4_3 = (__fieldRead1042_0() ^ 123777689445212L);
    spill1042_0 = __call1042_1();
    __call1042_2(receiver, p0, p1, p2);
    life6_10 = spill1042_0;
    spill1042_1 = p2;
    spill1042_2 = 1;
    if (!((life6_10 == null))) {
        forwardValue1042_18_0 = spill1042_1;
        forwardValue1042_18_1 = spill1042_2;
        break forward_join_18;
    }
    if (!((spill1042_1 == spill1042_2))) {
        break forward_join_39;
    }
    forwardValue1042_18_0 = p0;
    forwardValue1042_18_1 = p1;
    }
    life7_27 = __call1042_4(forwardValue1042_18_0, forwardValue1042_18_1, __fieldRead1042_3(receiver));
    spill1042_3 = life7_27;
    if (!((life6_10 == null))) {
        forwardValue1042_27_0 = spill1042_3;
        break forward_join_27;
    }
    if (!((spill1042_3 != null))) {
        break forward_join_39;
    }
    forwardValue1042_27_0 = life7_27;
    }
    if (!((life6_10 == null))) {
        forwardValue1042_32_0 = forwardValue1042_27_0;
        break forward_join_32;
    }
    if (!(__fieldRead1042_5(forwardValue1042_27_0))) {
        break forward_join_39;
    }
    forwardValue1042_32_0 = life7_27;
    }
    __call1042_8(forwardValue1042_32_0, __call1042_7(__fieldRead1042_6(receiver)));
    __call1042_9(receiver, life7_27);
    }
    return;
}
public static void h1042_0(java.io.IOException p0) throws Throwable {
    throw __call1104200_0(p0);
}
public static void h1042_1(java.io.IOException p0) throws Throwable {
    throw __call1104201_0(p0);
}
public static void h1042_2(java.io.IOException p0) throws Throwable {
    throw __call1104202_0(p0);
}
public static void h1042_3(java.io.IOException p0) throws Throwable {
    throw __call1104203_0(p0);
}
public static void h1042_4(java.io.IOException p0) throws Throwable {
    throw __call1104204_0(p0);
}
private static native long __fieldRead1042_0() throws Throwable;
private static native int[] __call1042_1() throws Throwable;
private static native void __call1042_2(moom.hD a0, int a1, int a2, int a3) throws Throwable;
private static native java.util.List __fieldRead1042_3(moom.hD a0) throws Throwable;
private static native moom.gc __call1042_4(int a0, int a1, java.util.List a2) throws Throwable;
private static native boolean __fieldRead1042_5(moom.gc a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1042_6(moom.hD a0) throws Throwable;
private static native net.minecraft.client.audio.SoundHandler __call1042_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1042_8(moom.gc a0, net.minecraft.client.audio.SoundHandler a1) throws Throwable;
private static native void __call1042_9(moom.hD a0, moom.gc a1) throws Throwable;
private static native java.lang.Exception __call1104200_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1104201_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1104202_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1104203_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1104204_0(java.io.IOException a0) throws Throwable;

}


static {
moom.hD.G = (moom._c.a(-4406063632086637529L, -2092995497163820028L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(57066475778378L);
}


protected void b__Void(moom.gc p0) throws java.io.IOException {
return;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public static moom.gc a(int p0, int p1, java.util.List<moom.gc> p2) { return __sourceHandlerCall_661b2f1599bcf4708dcf(p0, p1, p2); }


protected void a(int p0, int p1, int p2) throws java.io.IOException { __sourceHandlerCall_8d94dc4ccc0ebda969a8(this, p0, p1, p2); }

}
