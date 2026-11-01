package net.minecraft.scoreboard;


public class Score {

public static final java.util.Comparator<net.minecraft.scoreboard.Score> a;

private final net.minecraft.scoreboard.Scoreboard b;

private final net.minecraft.scoreboard.ScoreObjective c;

private final java.lang.String d;

private int e;

private boolean f;

private boolean g;

private static final long h;

public Score(net.minecraft.scoreboard.Scoreboard p0, net.minecraft.scoreboard.ScoreObjective p1, java.lang.String p2) {
super();
    this.b = p0;
    this.c = p1;
    this.d = p2;
    this.g = true;
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(-4848711053321820687L)), ((long)(2554524973934550868L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(43031934502732L)))));
    a = ((java.util.Comparator)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite5625_5()));
}


public void b(int p0) {
net.minecraft.scoreboard.Score forwardValue5555_19_0;
    net.minecraft.scoreboard.Score spill5555_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_19: {
    forward_join_18: {
    life2_3 = (net.minecraft.scoreboard.Score.h ^ 12094607982981L);
    life4_5 = moom.Bj.b__ArrayString();
    spill5555_0 = this;
    if (!((life4_5 != null))) {
        forwardValue5555_19_0 = spill5555_0;
        break forward_join_19;
    }
    if (!(((net.minecraft.scoreboard.IScoreObjectiveCriteria)(((net.minecraft.scoreboard.ScoreObjective)(((net.minecraft.scoreboard.Score)(spill5555_0)).c)).a__Bb())).a__Boolean())) {
        break forward_join_18;
    }
    throw new java.lang.IllegalStateException("Cannot modify read-only score");
    }
    forwardValue5555_19_0 = this;
    }
    ((net.minecraft.scoreboard.Score)(forwardValue5555_19_0)).c(((int)((this.a() - p0))));
    return;
}


public void c(int p0) {
net.minecraft.scoreboard.Score forwardValue5556_26_0;
    java.lang.String[] spill5556_0;
    net.minecraft.scoreboard.Score spill5556_1;
    long life2_3;
    int life5_7;
    java.lang.String[] life4_8;
    forward_join_29: {
    forward_join_26: {
    forward_join_25: {
    forward_join_22: {
    life2_3 = (net.minecraft.scoreboard.Score.h ^ 52304434464931L);
    spill5556_0 = moom.Bj.b__ArrayString();
    life5_7 = this.e;
    life4_8 = spill5556_0;
    this.e = ((int)(p0));
    if (!((life4_8 != null))) {
        break forward_join_25;
    }
    if (!((life5_7 == p0))) {
        break forward_join_22;
    }
    spill5556_1 = this;
    if (!((life4_8 != null))) {
        forwardValue5556_26_0 = spill5556_1;
        break forward_join_26;
    }
    if (!(((net.minecraft.scoreboard.Score)(spill5556_1)).g)) {
        break forward_join_29;
    }
    }
    this.g = ((boolean)(false));
    }
    forwardValue5556_26_0 = this;
    }
    ((net.minecraft.scoreboard.Scoreboard)(((net.minecraft.scoreboard.Score)(forwardValue5556_26_0)).a__Bh())).a(((net.minecraft.scoreboard.Score)(this)));
    }
    return;
}


public void a(boolean p0) {
this.f = ((boolean)(p0));
    return;
}


public boolean a__Boolean() {
return ((((this.f) ? 1 : 0)) != 0);
}


public net.minecraft.scoreboard.Scoreboard a__Bh() {
return this.b;
}


public void a(java.util.List<net.minecraft.entity.player.EntityPlayer> p0) {
this.c(((int)(((net.minecraft.scoreboard.IScoreObjectiveCriteria)(((net.minecraft.scoreboard.ScoreObjective)(this.c)).a__Bb())).a(((java.util.List)(p0))))));
    return;
}


private static java.lang.IllegalStateException a(java.lang.IllegalStateException p0) {
return p0;
}


public void a__Void() {
net.minecraft.scoreboard.Score forwardValue5554_19_0;
    net.minecraft.scoreboard.Score spill5554_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_19: {
    forward_join_18: {
    life1_3 = (net.minecraft.scoreboard.Score.h ^ 64080704316726L);
    life3_5 = moom.Bj.b__ArrayString();
    spill5554_0 = this;
    if (!((life3_5 != null))) {
        forwardValue5554_19_0 = spill5554_0;
        break forward_join_19;
    }
    if (!(((net.minecraft.scoreboard.IScoreObjectiveCriteria)(((net.minecraft.scoreboard.ScoreObjective)(((net.minecraft.scoreboard.Score)(spill5554_0)).c)).a__Bb())).a__Boolean())) {
        break forward_join_18;
    }
    throw new java.lang.IllegalStateException("Cannot modify read-only score");
    }
    forwardValue5554_19_0 = this;
    }
    ((net.minecraft.scoreboard.Score)(forwardValue5554_19_0)).a(((int)(1)));
    return;
}


public void a(int p0) {
net.minecraft.scoreboard.Score forwardValue5553_19_0;
    net.minecraft.scoreboard.Score spill5553_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_19: {
    forward_join_18: {
    life2_3 = (net.minecraft.scoreboard.Score.h ^ 60997077453565L);
    life4_5 = moom.Bj.b__ArrayString();
    spill5553_0 = this;
    if (!((life4_5 != null))) {
        forwardValue5553_19_0 = spill5553_0;
        break forward_join_19;
    }
    if (!(((net.minecraft.scoreboard.IScoreObjectiveCriteria)(((net.minecraft.scoreboard.ScoreObjective)(((net.minecraft.scoreboard.Score)(spill5553_0)).c)).a__Bb())).a__Boolean())) {
        break forward_join_18;
    }
    throw new java.lang.IllegalStateException("Cannot modify read-only score");
    }
    forwardValue5553_19_0 = this;
    }
    ((net.minecraft.scoreboard.Score)(forwardValue5553_19_0)).c(((int)((this.a() + p0))));
    return;
}


public int a() {
return this.e;
}


public net.minecraft.scoreboard.ScoreObjective a__Bg() {
return this.c;
}


public java.lang.String a__String() {
return this.d;
}


private static int lambda$static$0(net.minecraft.scoreboard.Score p0, net.minecraft.scoreboard.Score p1) {
int forwardValue5557_21_0;
    int forwardValue5557_21_1;
    net.minecraft.scoreboard.Score forwardValue5557_25_0;
    int forwardValue5557_29_0;
    int spill5557_0;
    int spill5557_1;
    net.minecraft.scoreboard.Score spill5557_2;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_29: {
    forward_join_25: {
    forward_join_24: {
    forward_join_21: {
    forward_join_15: {
    life2_3 = (net.minecraft.scoreboard.Score.h ^ 16905772926622L);
    life4_5 = moom.Bj.b__ArrayString();
    spill5557_0 = ((net.minecraft.scoreboard.Score)(p0)).a();
    spill5557_1 = ((net.minecraft.scoreboard.Score)(p1)).a();
    if (!((life4_5 != null))) {
        forwardValue5557_21_0 = spill5557_0;
        forwardValue5557_21_1 = spill5557_1;
        break forward_join_21;
    }
    if (!((spill5557_0 > spill5557_1))) {
        break forward_join_15;
    }
    forwardValue5557_29_0 = 1;
    break forward_join_29;
    }
    spill5557_2 = p0;
    if (!((life4_5 != null))) {
        forwardValue5557_25_0 = spill5557_2;
        break forward_join_25;
    }
    forwardValue5557_21_0 = ((net.minecraft.scoreboard.Score)(spill5557_2)).a();
    forwardValue5557_21_1 = ((net.minecraft.scoreboard.Score)(p1)).a();
    }
    if (!((forwardValue5557_21_0 < forwardValue5557_21_1))) {
        break forward_join_24;
    }
    forwardValue5557_29_0 = -1;
    break forward_join_29;
    }
    forwardValue5557_25_0 = p1;
    }
    forwardValue5557_29_0 = ((java.lang.String)(((net.minecraft.scoreboard.Score)(forwardValue5557_25_0)).a__String())).compareToIgnoreCase(((java.lang.String)(((net.minecraft.scoreboard.Score)(p0)).a__String())));
    }
    return forwardValue5557_29_0;
}


private static native <E extends Throwable> java.util.Comparator __sourceIntrinsic_eb8803ad1f63_originalDynamicSite5625_5() throws E;
}
