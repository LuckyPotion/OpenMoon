package com.moon;


class sA extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jW a;

sA(com.moon.jW p0) { super(); }


private static void __sourceConstructorBody_903ffd3ea66a3b1f(com.moon.sA receiver, com.moon.jW p0) throws Throwable {

((com.moon.sA)(receiver)).a = ((com.moon.jW)(p0));

    com.moon.sA.__sourceConstructorInit_903ffd3ea66a3b1f_0(((com.moon.sA)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_903ffd3ea66a3b1f_0(com.moon.sA a0) throws E;

public org.luaj.vm2.LuaValue call() {
int[] life1_4;
    org.luaj.vm2.LuaValue[] life2_12;
    life1_4 = ((com.moon.j5)(((com.moon.jW)(this.a)).c)).get_players();
    life2_12 = ((org.luaj.vm2.LuaValue[])(((java.util.stream.Stream)(((java.util.stream.IntStream)(java.util.Arrays.stream(((int[])(life1_4))))).mapToObj(((java.util.function.IntFunction)(__sourceIntrinsic_55cc1ef719ef_invokedynamic200_4()))))).toArray(((java.util.function.IntFunction)(__sourceIntrinsic_55cc1ef719ef_invokedynamic200_6())))));
    return org.luaj.vm2.LuaValue.listOf(((org.luaj.vm2.LuaValue[])(life2_12)));
}


private static org.luaj.vm2.LuaValue[] lambda$call$0(int p0) {
return new org.luaj.vm2.LuaValue[p0];
}


private static native <E extends Throwable> java.util.function.IntFunction __sourceIntrinsic_55cc1ef719ef_invokedynamic200_4() throws E;

private static native <E extends Throwable> java.util.function.IntFunction __sourceIntrinsic_55cc1ef719ef_invokedynamic200_6() throws E;
}
