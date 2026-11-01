package moom;


public class Bk extends moom.Bj {

private net.minecraft.scoreboard.Scoreboard a;

private java.lang.String c;

private java.util.Set<java.lang.String> d;

private java.lang.String e;

private java.lang.String f;

private java.lang.String g;

private boolean h;

private boolean i;

private net.minecraft.scoreboard.Team$EnumVisible j;

private net.minecraft.scoreboard.Team$EnumVisible k;

private net.minecraft.util.EnumChatFormatting l;

private static long m;

public Bk(net.minecraft.scoreboard.Scoreboard p0, java.lang.String p1) { super(); }


private static void __sourceConstructorBody_494fc0378d3b109b(moom.Bk receiver, net.minecraft.scoreboard.Scoreboard p0, java.lang.String p1) throws Throwable {

long local3_life1 = (moom.Bk.m ^ 12762617696497L);

    moom.Bk.__sourceConstructorInit_494fc0378d3b109b_0(((moom.Bk)(receiver)));

    ((moom.Bk)(receiver)).d = ((java.util.Set)(com.google.common.collect.Sets.newHashSet()));

    java.lang.String[] __sourceSpill524_7 = moom.Bj.b__ArrayString();

    ((moom.Bk)(receiver)).f = ((java.lang.String)(""));

    ((moom.Bk)(receiver)).g = ((java.lang.String)(""));

    ((moom.Bk)(receiver)).h = ((boolean)(true));

    ((moom.Bk)(receiver)).i = ((boolean)(true));

    ((moom.Bk)(receiver)).j = ((net.minecraft.scoreboard.Team$EnumVisible)(net.minecraft.scoreboard.Team$EnumVisible.ALWAYS));

    ((moom.Bk)(receiver)).k = ((net.minecraft.scoreboard.Team$EnumVisible)(net.minecraft.scoreboard.Team$EnumVisible.ALWAYS));

    ((moom.Bk)(receiver)).l = ((net.minecraft.util.EnumChatFormatting)(net.minecraft.util.EnumChatFormatting.RESET));

    ((moom.Bk)(receiver)).a = ((net.minecraft.scoreboard.Scoreboard)(p0));

    java.lang.String[] local5_life18 = __sourceSpill524_7;

    ((moom.Bk)(receiver)).c = ((java.lang.String)(p1));

    ((moom.Bk)(receiver)).e = ((java.lang.String)(p1));

    if ((local5_life18 == null)) {

        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));

    }

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_494fc0378d3b109b_0(moom.Bk a0) throws E;

static {
moom.Bk.m = (moom._c.a(6644149256483029068L, -7790367435013869227L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(13246304520396L);
}


public void b(java.lang.String p0) {
long local2 = (moom.Bk.m ^ 33708088358765L);
    java.lang.String[] local4 = moom.Bj.b__ArrayString();
    if ((local4 != null)) {
        if ((p0 == null)) {
        throw new java.lang.IllegalArgumentException("Prefix cannot be null");
    }
        this.f = ((java.lang.String)(p0));
        ((net.minecraft.scoreboard.Scoreboard)(this.a)).c(((moom.Bk)(this)));
    }
    return;
}


public net.minecraft.scoreboard.Team$EnumVisible b__bo() {
return this.k;
}


public boolean b__Boolean() {
return ((((this.h) ? 1 : 0)) != 0);
}


public void b(boolean p0) {
this.i = ((boolean)(p0));
    ((net.minecraft.scoreboard.Scoreboard)(this.a)).c(((moom.Bk)(this)));
    return;
}


public void b(net.minecraft.scoreboard.Team$EnumVisible p0) {
this.k = ((net.minecraft.scoreboard.Team$EnumVisible)(p0));
    ((net.minecraft.scoreboard.Scoreboard)(this.a)).c(((moom.Bk)(this)));
    return;
}


public java.lang.String b() {
return this.e;
}


public void c(java.lang.String p0) {
this.g = ((java.lang.String)(p0));
    ((net.minecraft.scoreboard.Scoreboard)(this.a)).c(((moom.Bk)(this)));
    return;
}


public java.lang.String c() {
return this.f;
}


public java.lang.String d() {
return this.g;
}


public int a() {
int forwardValue1520_19_0;
    int forwardValue1520_27_0;
    java.lang.String[] spill1520_0;
    boolean spill1520_1;
    long life1_3;
    int life4_6;
    java.lang.String[] life3_7;
    forward_join_27: {
    forward_join_26: {
    forward_join_19: {
    forward_join_17: {
    life1_3 = (moom.Bk.m ^ 51726471093709L);
    spill1520_0 = moom.Bj.b__ArrayString();
    life4_6 = 0;
    life3_7 = spill1520_0;
    spill1520_1 = ((moom.Bk)(this)).b__Boolean();
    if (!((life3_7 != null))) {
        forwardValue1520_19_0 = ((spill1520_1) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill1520_1)) {
        break forward_join_17;
    }
    life4_6 = (life4_6 | 1);
    }
    forwardValue1520_19_0 = ((((moom.Bk)(this)).a__Boolean()) ? 1 : 0);
    }
    if (!((life3_7 != null))) {
        forwardValue1520_27_0 = forwardValue1520_19_0;
        break forward_join_27;
    }
    if (!((forwardValue1520_19_0 != 0))) {
        break forward_join_26;
    }
    life4_6 = (life4_6 | 2);
    }
    forwardValue1520_27_0 = life4_6;
    }
    return forwardValue1520_27_0;
}


public void a(net.minecraft.scoreboard.Team$EnumVisible p0) {
this.j = ((net.minecraft.scoreboard.Team$EnumVisible)(p0));
    ((net.minecraft.scoreboard.Scoreboard)(this.a)).c(((moom.Bk)(this)));
    return;
}


private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


public void a(net.minecraft.util.EnumChatFormatting p0) {
this.l = ((net.minecraft.util.EnumChatFormatting)(p0));
    return;
}


public void a(int p0) {
moom.Bk forwardValue1521_14_0;
    int forwardValue1521_14_1;
    moom.Bk forwardValue1521_15_0;
    moom.Bk forwardValue1521_16_0;
    int forwardValue1521_16_1;
    moom.Bk forwardValue1521_25_0;
    int forwardValue1521_25_1;
    moom.Bk forwardValue1521_26_0;
    moom.Bk forwardValue1521_27_0;
    int forwardValue1521_27_1;
    moom.Bk spill1521_0;
    int spill1521_1;
    moom.Bk spill1521_2;
    int spill1521_3;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    forward_join_16: {
    forward_join_15: {
    forward_join_14: {
    life2_3 = (moom.Bk.m ^ 101803273413388L);
    life4_5 = moom.Bj.b__ArrayString();
    spill1521_0 = this;
    spill1521_1 = (p0 & 1);
    if (!((life4_5 != null))) {
        forwardValue1521_14_0 = spill1521_0;
        forwardValue1521_14_1 = spill1521_1;
        break forward_join_14;
    }
    if (!((spill1521_1 > 0))) {
        forwardValue1521_15_0 = spill1521_0;
        break forward_join_15;
    }
    forwardValue1521_14_0 = spill1521_0;
    forwardValue1521_14_1 = 1;
    }
    forwardValue1521_16_0 = forwardValue1521_14_0;
    forwardValue1521_16_1 = forwardValue1521_14_1;
    break forward_join_16;
    }
    forwardValue1521_16_0 = forwardValue1521_15_0;
    forwardValue1521_16_1 = 0;
    }
    ((moom.Bk)(forwardValue1521_16_0)).a(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue1521_16_1))));
    spill1521_2 = this;
    spill1521_3 = (p0 & 2);
    if (!((life4_5 != null))) {
        forwardValue1521_25_0 = spill1521_2;
        forwardValue1521_25_1 = spill1521_3;
        break forward_join_25;
    }
    if (!((spill1521_3 > 0))) {
        forwardValue1521_26_0 = spill1521_2;
        break forward_join_26;
    }
    forwardValue1521_25_0 = spill1521_2;
    forwardValue1521_25_1 = 1;
    }
    forwardValue1521_27_0 = forwardValue1521_25_0;
    forwardValue1521_27_1 = forwardValue1521_25_1;
    break forward_join_27;
    }
    forwardValue1521_27_0 = forwardValue1521_26_0;
    forwardValue1521_27_1 = 0;
    }
    ((moom.Bk)(forwardValue1521_27_0)).b(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue1521_27_1))));
    return;
}


public net.minecraft.util.EnumChatFormatting a__br() {
return this.l;
}


public java.lang.String a(java.lang.String p0) {
return __sourceIntrinsic_c43bc540f167_originalDynamicSite1063_2(((moom.Bk)(this)).c(), p0, ((moom.Bk)(this)).d());
}


public java.util.Collection<java.lang.String> a__Collection() {
return this.d;
}


public void a__Void(java.lang.String p0) {
long local2 = (moom.Bk.m ^ 64002291222921L);
    java.lang.String[] local4 = moom.Bj.b__ArrayString();
    if ((local4 != null)) {
        if ((p0 == null)) {
        throw new java.lang.IllegalArgumentException("Name cannot be null");
    }
        this.e = ((java.lang.String)(p0));
        ((net.minecraft.scoreboard.Scoreboard)(this.a)).c(((moom.Bk)(this)));
    }
    return;
}


public java.lang.String a__String() {
return this.c;
}


public net.minecraft.scoreboard.Team$EnumVisible a__bo() {
return this.j;
}


public boolean a__Boolean() {
return ((((this.i) ? 1 : 0)) != 0);
}


public void a(boolean p0) {
this.h = ((boolean)(p0));
    ((net.minecraft.scoreboard.Scoreboard)(this.a)).c(((moom.Bk)(this)));
    return;
}


public static java.lang.String a(moom.Bj p0, java.lang.String p1) {
moom.Bj forwardValue1522_13_0;
    java.lang.String forwardValue1522_15_0;
    moom.Bj spill1522_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_15: {
    forward_join_13: {
    forward_join_12: {
    life2_3 = (moom.Bk.m ^ 114212297438084L);
    life4_5 = moom.Bj.b__ArrayString();
    spill1522_0 = p0;
    if (!((life4_5 != null))) {
        forwardValue1522_13_0 = spill1522_0;
        break forward_join_13;
    }
    if (!((spill1522_0 == null))) {
        break forward_join_12;
    }
    forwardValue1522_15_0 = p1;
    break forward_join_15;
    }
    forwardValue1522_13_0 = p0;
    }
    forwardValue1522_15_0 = ((moom.Bj)(forwardValue1522_13_0)).a(((java.lang.String)(p1)));
    }
    return forwardValue1522_15_0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c43bc540f167_originalDynamicSite1063_2(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
