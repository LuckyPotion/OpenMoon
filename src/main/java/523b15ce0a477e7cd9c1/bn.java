package moom;


public class bn extends sourcebuild.EnumConstructor<moom.bn> {

public static moom.bn INTEGER;

public static moom.bn HEARTS;

private static java.util.Map<java.lang.String, moom.bn> a;

private java.lang.String b;

private static moom.bn[] c;

private static long d;

private bn(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);
    this.b = p2;
}


private static void initialize() {
d = ((long)(((moom._a)(moom._c.a(((long)(-5531617607744088043L)), ((long)(-5796570318754022776L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(39052227289916L)))));
    INTEGER = ((moom.bn)(new moom.bn("INTEGER", 0, "integer")));
    HEARTS = ((moom.bn)(new moom.bn("HEARTS", 1, "hearts")));
    c = ((moom.bn[])(moom.bn.a__Arraybn()));
    a = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    moom.bn[] local0_life12 = moom.bn.values();
    int local1_life13 = (local0_life12).length;
    int local2_life14 = 0;
    while ((local2_life14 < local1_life13)) {
        moom.bn local3_life15 = (local0_life12)[local2_life14];
        ((java.util.Map)(moom.bn.a)).put(((java.lang.Object)(((moom.bn)(local3_life15)).a())), ((java.lang.Object)(local3_life15)));
        local2_life14 += 1;
    }
}


public static moom.bn[] values() {
return ((moom.bn[])(((moom.bn[])(moom.bn.c)).clone()));
}


public static moom.bn valueOf(java.lang.String p0) {
return ((moom.bn)(java.lang.Enum.valueOf(((java.lang.Class)(moom.bn.class)), ((java.lang.String)(p0)))));
}


private static moom.bn[] a__Arraybn() {
return new moom.bn[] {moom.bn.INTEGER, moom.bn.HEARTS};
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static moom.bn a(java.lang.String p0) {
moom.bn forwardValue2985_16_0;
    moom.bn forwardValue2985_18_0;
    java.lang.String[] spill2985_0;
    moom.bn spill2985_1;
    long life1_3;
    moom.bn life4_9;
    java.lang.String[] life3_10;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (moom.bn.d ^ 3805177799843L);
    spill2985_0 = moom.Bj.b__ArrayString();
    life4_9 = ((moom.bn)(((java.util.Map)(moom.bn.a)).get(((java.lang.Object)(p0)))));
    life3_10 = spill2985_0;
    spill2985_1 = life4_9;
    if (!((life3_10 != null))) {
        forwardValue2985_16_0 = spill2985_1;
        break forward_join_16;
    }
    if (!((spill2985_1 == null))) {
        break forward_join_17;
    }
    forwardValue2985_16_0 = moom.bn.INTEGER;
    }
    forwardValue2985_18_0 = forwardValue2985_16_0;
    break forward_join_18;
    }
    forwardValue2985_18_0 = life4_9;
    }
    return forwardValue2985_18_0;
}


public java.lang.String a() {
return this.b;
}

}
