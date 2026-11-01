package com.moon;

import me.xdrop.fuzzywuzzy.FuzzySearch;


public class dy {

private java.util.Map<java.lang.String, com.moon.c0> a;

private java.lang.String b;

private boolean c;

private java.lang.String d;

private static net.minecraft.entity.Entity[] e;

private static final long f;

public dy(java.util.Map<java.lang.String, com.moon.c0> p0) {
super();
    this.a = p0;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(4969495042035200000L)), ((long)(5331798539467511257L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(87600161581840L)))));
    if ((com.moon.dy.b() != null)) {
        com.moon.dy.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[2])));
    }
}


public static void b(net.minecraft.entity.Entity[] p0) {
com.moon.dy.e = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public static net.minecraft.entity.Entity[] b() {
return com.moon.dy.e;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(com.moon.ek p0) {
int forwardValue55_42_0;
    int forwardValue55_52_0;
    int forwardValue55_59_0;
    int forwardValue55_63_0;
    int forwardValue55_65_0;
    java.lang.Object forwardValue55_99_0;
    int forwardValue55_154_0;
    int forwardValue55_154_1;
    int forwardValue55_155_0;
    int forwardValue55_156_0;
    int forwardValue55_156_1;
    java.lang.Object forwardValue55_177_0;
    net.minecraft.entity.Entity[] spill55_0;
    boolean spill55_1;
    java.lang.Integer spill55_2;
    int spill55_3;
    boolean spill55_4;
    java.util.List spill55_5;
    long life2_3;
    java.lang.String life5_8;
    net.minecraft.entity.Entity[] life4_9;
    java.lang.String[] life6_24;
    int life7_87;
    java.lang.String life8_91;
    moom.DN life9_107;
    java.lang.String life10_137;
    com.moon.c0 life9_172;
    int life10_203;
    java.util.List life11_206;
    com.moon.df life12_229;
    java.lang.String[] life13_241;
    forward_join_230: {
    forward_join_227: {
    forward_join_223: {
    forward_join_205: {
    forward_join_177: {
    forward_join_174: {
    forward_join_156: {
    forward_join_155: {
    forward_join_154: {
    forward_join_145: {
    forward_join_144: {
    forward_join_130: {
    forward_join_128: {
    forward_join_127: {
    forward_join_123: {
    forward_join_99: {
    forward_join_65: {
    forward_join_64: {
    forward_join_63: {
    forward_join_59: {
    forward_join_52: {
    forward_join_50: {
    forward_join_42: {
    forward_join_40: {
    life2_3 = (com.moon.dy.f ^ 51944722921943L);
    spill55_0 = com.moon.dy.b();
    life5_8 = ((java.lang.String)(((com.moon.ek)(p0)).a())).toLowerCase();
    life4_9 = spill55_0;
    if (!((life4_9 == null))) {
        break forward_join_230;
    }
    if (!(((java.lang.String)(life5_8)).startsWith(((java.lang.String)("."))))) {
        break forward_join_227;
    }
    life6_24 = ((java.lang.String)(((java.lang.String)(life5_8)).substring(((int)(1))))).split(((java.lang.String)(" ")));
    spill55_1 = ((java.lang.String)(this.d)).equals(((java.lang.Object)(life5_8)));
    if (!((life4_9 == null))) {
        forwardValue55_42_0 = ((spill55_1) ? 1 : 0);
        break forward_join_42;
    }
    if (!(spill55_1)) {
        break forward_join_40;
    }
    ((com.moon.ek)(p0)).a(((java.lang.String)(this.b)));
    ((com.moon.ek)(p0)).a(((boolean)(this.c)));
    return;
    }
    forwardValue55_42_0 = (life6_24).length;
    }
    if (!((life4_9 == null))) {
        forwardValue55_52_0 = forwardValue55_42_0;
        break forward_join_52;
    }
    if (!((forwardValue55_42_0 == 0))) {
        break forward_join_50;
    }
    this.a(((com.moon.ek)(p0)), ((java.lang.String)(life5_8)));
    return;
    }
    forwardValue55_52_0 = (life6_24).length;
    }
    if (!((life4_9 == null))) {
        forwardValue55_59_0 = forwardValue55_52_0;
        break forward_join_59;
    }
    if (!((forwardValue55_52_0 == 1))) {
        break forward_join_64;
    }
    forwardValue55_59_0 = ((((java.lang.String)(life5_8)).endsWith(((java.lang.String)(" ")))) ? 1 : 0);
    }
    if (!((life4_9 == null))) {
        forwardValue55_63_0 = forwardValue55_59_0;
        break forward_join_63;
    }
    if (!((forwardValue55_59_0 == 0))) {
        break forward_join_64;
    }
    forwardValue55_63_0 = 1;
    }
    forwardValue55_65_0 = forwardValue55_63_0;
    break forward_join_65;
    }
    forwardValue55_65_0 = 0;
    }
    life7_87 = forwardValue55_65_0;
    life8_91 = (life6_24)[0];
    if (!((life7_87 != 0))) {
        break forward_join_130;
    }
    life9_107 = ((moom.DN)(((java.util.Optional)(((java.util.stream.Stream)(((java.util.stream.Stream)(((java.util.Collection)(((java.util.Map)(this.a)).values())).stream())).map(((java.util.function.Function)(__sourceIntrinsic_724f8c12800f_invokedynamic55_20(life8_91)))))).max(((java.util.Comparator)(java.util.Comparator.comparing(((java.util.function.Function)(__sourceIntrinsic_724f8c12800f_invokedynamic55_22())))))))).orElse(((java.lang.Object)(null)))));
    if (!((life4_9 == null))) {
        break forward_join_127;
    }
    if (!((life9_107 != null))) {
        break forward_join_123;
    }
    spill55_2 = ((java.lang.Integer)(((moom.DN)(life9_107)).b()));
    if (!((life4_9 == null))) {
        forwardValue55_99_0 = spill55_2;
        break forward_join_99;
    }
    if (!((((java.lang.Integer)(spill55_2)).intValue() > 0))) {
        break forward_join_123;
    }
    forwardValue55_99_0 = ((moom.DN)(life9_107)).a();
    }
    life10_137 = __sourceIntrinsic_724f8c12800f_invokedynamic55_34(((java.lang.String)(((com.moon.c0)(((com.moon.c0)(forwardValue55_99_0)))).a__String())).toLowerCase());
    ((com.moon.ek)(p0)).a(((java.lang.String)(life10_137)));
    ((com.moon.ek)(p0)).a(((boolean)(true)));
    this.b = ((java.lang.String)(life10_137));
    this.c = ((boolean)(true));
    if (!((life4_9 != null))) {
        break forward_join_128;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[4])));
    }
    this.a(((com.moon.ek)(p0)), ((java.lang.String)(life5_8)));
    }
    return;
    }
    if (!((life4_9 != null))) {
        break forward_join_227;
    }
    }
    life9_172 = ((com.moon.c0)(((java.util.Map)(this.a)).get(((java.lang.Object)(life8_91)))));
    if (!((life4_9 == null))) {
        break forward_join_144;
    }
    if (!((life9_172 == null))) {
        break forward_join_145;
    }
    this.a(((com.moon.ek)(p0)), ((java.lang.String)(life5_8)));
    }
    return;
    }
    spill55_3 = (life6_24).length;
    spill55_4 = ((java.lang.String)(life5_8)).endsWith(((java.lang.String)(" ")));
    if (!((life4_9 == null))) {
        forwardValue55_154_0 = spill55_3;
        forwardValue55_154_1 = ((spill55_4) ? 1 : 0);
        break forward_join_154;
    }
    if (!(spill55_4)) {
        forwardValue55_155_0 = spill55_3;
        break forward_join_155;
    }
    forwardValue55_154_0 = spill55_3;
    forwardValue55_154_1 = 1;
    }
    forwardValue55_156_0 = forwardValue55_154_0;
    forwardValue55_156_1 = forwardValue55_154_1;
    break forward_join_156;
    }
    forwardValue55_156_0 = forwardValue55_155_0;
    forwardValue55_156_1 = 2;
    }
    life10_203 = (forwardValue55_156_0 - forwardValue55_156_1);
    life11_206 = ((com.moon.c0)(life9_172)).b__List();
    spill55_5 = life11_206;
    if (!((life4_9 == null))) {
        forwardValue55_177_0 = spill55_5;
        break forward_join_177;
    }
    if (!(((((java.util.List)(spill55_5)).size() - 1) < life10_203))) {
        break forward_join_174;
    }
    this.a(((com.moon.ek)(p0)), ((java.lang.String)(life5_8)));
    return;
    }
    forwardValue55_177_0 = ((java.util.List)(life11_206)).get(((int)(life10_203)));
    }
    life12_229 = ((com.moon.df)(forwardValue55_177_0));
    if (!((((com.moon.df)(life12_229)).a() == com.moon.aS.ALWAYS))) {
        break forward_join_205;
    }
    life13_241 = ((java.lang.String[])(java.util.Arrays.copyOfRange(((java.lang.Object[])(life6_24)), ((int)(0)), ((int)((life10_203 + 1))))));
    ((com.moon.ek)(p0)).a(((java.lang.String)(this.a(((com.moon.df)(life12_229)), ((java.lang.String[])(life13_241)), ((java.lang.String[])(life6_24))))));
    ((com.moon.ek)(p0)).a(((boolean)(true)));
    if (!((life4_9 != null))) {
        break forward_join_227;
    }
    }
    if (!(((java.lang.String)(life5_8)).endsWith(((java.lang.String)(" "))))) {
        break forward_join_223;
    }
    ((com.moon.ek)(p0)).a(((java.lang.String)(this.a(((com.moon.df)(life12_229)), ((java.lang.String[])(life6_24)), ((java.lang.String[])(life6_24))))));
    ((com.moon.ek)(p0)).a(((boolean)(false)));
    if (!((life4_9 != null))) {
        break forward_join_227;
    }
    }
    this.a(((com.moon.ek)(p0)), ((java.lang.String)(life5_8)));
    }
    this.d = ((java.lang.String)(life5_8));
    }
    return;
}


private void a(com.moon.ek p0, java.lang.String p1) {
((com.moon.ek)(p0)).a(((java.lang.String)("")));
    this.b = ((java.lang.String)(""));
    this.c = ((boolean)(false));
    this.d = ((java.lang.String)(p1));
    return;
}


private java.lang.String a(com.moon.df<?> p0, java.lang.String[] p1, java.lang.String[] p2) {
long local4 = (com.moon.dy.f ^ 72082286681215L);
    java.lang.String local6 = java.lang.String.join(((java.lang.CharSequence)(" ")), ((java.lang.CharSequence[])(p1)));
    java.lang.String local7 = (p2)[((p2).length - 1)];
    java.lang.String local8 = __sourceIntrinsic_2a91a1eb76ab_invokedynamic852_3(local6, ((com.moon.df)(p0)).a__String(((java.lang.String)(local7))));
    this.b = ((java.lang.String)(local8));
    this.c = ((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.df)(p0)).a() == com.moon.aS.ALWAYS) ? 1 : 0))));
    return local8;
}


private static moom.DN lambda$receiveChatBoxDraw$0(java.lang.String p0, com.moon.c0 p1) {
net.minecraft.entity.Entity[] spill15_0;
    long life2_3;
    int life5_9;
    java.lang.String[] life6_12;
    int life7_16;
    net.minecraft.entity.Entity[] life4_17;
    int life8_19;
    java.lang.String life9_26;
    int life10_31;
    lexical_join_42: {
    life2_3 = (com.moon.dy.f ^ 121207957039902L);
    life5_9 = FuzzySearch.ratio(((java.lang.String)(p0)), ((java.lang.String)(((java.lang.String)(((com.moon.c0)(p1)).a__String())).toLowerCase())));
    life6_12 = ((com.moon.c0)(p1)).a__ArrayString();
    spill15_0 = com.moon.dy.b();
    life7_16 = (life6_12).length;
    life4_17 = spill15_0;
    life8_19 = 0;
    lexical_cycle_20: while (true) {
    lexical_join_40: {
    lexical_join_39: {
    if (!((life8_19 < life7_16))) {
        break lexical_join_42;
    }
    life9_26 = (life6_12)[life8_19];
    life10_31 = FuzzySearch.ratio(((java.lang.String)(p0)), ((java.lang.String)(((java.lang.String)(life9_26)).toLowerCase())));
    if (!((life4_17 == null))) {
        break lexical_join_40;
    }
    if (!((life5_9 > life10_31))) {
        break lexical_join_39;
    }
    life5_9 = life10_31;
    }
    life8_19 += 1;
    }
    if (!((life4_17 != null))) { continue lexical_cycle_20; }
    break lexical_cycle_20;
    }
    }
    return new moom.DN(p1, java.lang.Integer.valueOf(((int)(life5_9))));
}


private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_724f8c12800f_invokedynamic55_20(java.lang.String a0) throws E;

private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_724f8c12800f_invokedynamic55_22() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_724f8c12800f_invokedynamic55_34(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a91a1eb76ab_invokedynamic852_3(java.lang.String a0, java.lang.String a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
