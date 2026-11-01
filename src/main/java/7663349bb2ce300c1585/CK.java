package moom;


public class CK extends moom.CJ {

private final java.lang.String d;

private final java.lang.String e;

private java.lang.String f;

private static final long g;

public CK(java.lang.String p0, java.lang.String p1) {
super();
    this.f = "";
    this.d = p0;
    this.e = p1;
}


static {
g = (moom._c.a(2036349539039347708L, -1251986265015191559L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(237960960366956L);
}


public boolean equals(java.lang.Object p0) {
java.lang.Object forwardValue1589_14_0;
    int forwardValue1589_24_0;
    int forwardValue1589_38_0;
    int forwardValue1589_44_0;
    int forwardValue1589_48_0;
    int forwardValue1589_50_0;
    moom.CK spill1589_0;
    int spill1589_1;
    boolean spill1589_2;
    long life2_3;
    int life4_5;
    moom.CK life5_28;
    forward_join_50: {
    forward_join_49: {
    forward_join_48: {
    forward_join_44: {
    forward_join_38: {
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (moom.CK.g ^ 116940497350784L);
    life4_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1589_0 = this;
    if (!((life4_5 == 0))) {
        forwardValue1589_14_0 = spill1589_0;
        break forward_join_14;
    }
    if (!((spill1589_0 == p0))) {
        break forward_join_13;
    }
    return ((1) != 0);
    }
    forwardValue1589_14_0 = p0;
    }
    spill1589_1 = ((forwardValue1589_14_0 instanceof moom.CK) ? 1 : 0);
    if (!((life4_5 == 0))) {
        forwardValue1589_24_0 = spill1589_1;
        break forward_join_24;
    }
    if (!((spill1589_1 != 0))) {
        break forward_join_23;
    }
    life5_28 = ((moom.CK)(p0));
    if (!((life4_5 != 0))) {
        break forward_join_25;
    }
    }
    forwardValue1589_24_0 = 0;
    }
    return ((forwardValue1589_24_0) != 0);
    }
    spill1589_2 = ((java.lang.String)(this.d)).equals(((java.lang.Object)(((moom.CK)(life5_28)).d)));
    if (!((life4_5 == 0))) {
        forwardValue1589_38_0 = ((spill1589_2) ? 1 : 0);
        break forward_join_38;
    }
    if (!(spill1589_2)) {
        break forward_join_49;
    }
    forwardValue1589_38_0 = ((((java.lang.String)(this.e)).equals(((java.lang.Object)(((moom.CK)(life5_28)).e)))) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue1589_44_0 = forwardValue1589_38_0;
        break forward_join_44;
    }
    if (!((forwardValue1589_38_0 != 0))) {
        break forward_join_49;
    }
    forwardValue1589_44_0 = ((super.equals(((java.lang.Object)(p0)))) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue1589_48_0 = forwardValue1589_44_0;
        break forward_join_48;
    }
    if (!((forwardValue1589_44_0 != 0))) {
        break forward_join_49;
    }
    forwardValue1589_48_0 = 1;
    }
    forwardValue1589_50_0 = forwardValue1589_48_0;
    break forward_join_50;
    }
    forwardValue1589_50_0 = 0;
    }
    return ((forwardValue1589_50_0) != 0);
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1075_4(this.d, this.e, ((moom.CK)(this)).a, ((moom.CK)(this)).a__CO());
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public java.lang.String e() {
return this.e;
}


public java.lang.String d() {
return this.d;
}


public net.minecraft.util.IChatComponent a__C5() {
return ((moom.CK)(this)).a__CK();
}


public moom.CK a__CK() {
moom.CK lexicalValue528_45_0;
    boolean spill528_0;
    moom.CK spill528_1;
    long life1_3;
    moom.CK life4_12;
    int life3_13;
    java.util.Iterator life5_27;
    net.minecraft.util.IChatComponent life6_34;
    lexical_join_45: {
    lexical_join_44: {
    life1_3 = (moom.CK.g ^ 30542384638264L);
    spill528_0 = moom.DS.c__Boolean();
    life4_12 = new moom.CK(this.d, this.e);
    life3_13 = ((spill528_0) ? 1 : 0);
    ((moom.CK)(life4_12)).a__sourceReturn_a7421bf54c(((java.lang.String)(this.f)));
    ((moom.CK)(life4_12)).a(((moom.CO)(((moom.CO)(((moom.CK)(this)).a__CO())).b__CO())));
    life5_27 = ((java.util.List)(((moom.CK)(this)).a__List())).iterator();
    lexical_cycle_28: while (true) {
    if (!(((java.util.Iterator)(life5_27)).hasNext())) {
        break lexical_join_44;
    }
    life6_34 = ((net.minecraft.util.IChatComponent)(((java.util.Iterator)(life5_27)).next()));
    spill528_1 = life4_12;
    if (!((life3_13 != 0))) {
        lexicalValue528_45_0 = spill528_1;
        break lexical_join_45;
    }
    ((moom.CK)(spill528_1)).a(((net.minecraft.util.IChatComponent)(((net.minecraft.util.IChatComponent)(life6_34)).a__C5())));
    if (!((life3_13 == 0))) { continue lexical_cycle_28; }
    break lexical_cycle_28;
    }
    }
    lexicalValue528_45_0 = life4_12;
    }
    return lexicalValue528_45_0;
}


public void a__sourceReturn_a7421bf54c(java.lang.String p0) {
this.f = ((java.lang.String)(p0));
    return;
}


public java.lang.String a() {
moom.Bl forwardValue1587_13_0;
    int forwardValue1587_22_0;
    net.minecraft.scoreboard.Scoreboard forwardValue1587_45_0;
    java.lang.String forwardValue1587_45_1;
    net.minecraft.scoreboard.ScoreObjective forwardValue1587_45_2;
    java.lang.String forwardValue1587_66_0;
    boolean spill1587_0;
    moom.Bl spill1587_1;
    boolean spill1587_2;
    java.lang.String spill1587_3;
    net.minecraft.scoreboard.Scoreboard spill1587_4;
    java.lang.String spill1587_5;
    net.minecraft.scoreboard.ScoreObjective spill1587_6;
    long life1_3;
    moom.Bl life4_6;
    int life3_7;
    net.minecraft.scoreboard.Scoreboard life5_39;
    net.minecraft.scoreboard.ScoreObjective life6_44;
    net.minecraft.scoreboard.Score life7_64;
    forward_join_66: {
    forward_join_64: {
    forward_join_61: {
    forward_join_45: {
    forward_join_22: {
    forward_join_13: {
    life1_3 = (moom.CK.g ^ 27087110368444L);
    spill1587_0 = moom.DS.b__Boolean();
    life4_6 = moom.Bl.a__Bl();
    life3_7 = ((spill1587_0) ? 1 : 0);
    spill1587_1 = life4_6;
    if (!((life3_7 == 0))) {
        forwardValue1587_13_0 = spill1587_1;
        break forward_join_13;
    }
    if (!((spill1587_1 != null))) {
        break forward_join_64;
    }
    forwardValue1587_13_0 = life4_6;
    }
    spill1587_2 = ((moom.Bl)(forwardValue1587_13_0)).k__Boolean();
    if (!((life3_7 == 0))) {
        forwardValue1587_22_0 = ((spill1587_2) ? 1 : 0);
        break forward_join_22;
    }
    if (!(spill1587_2)) {
        break forward_join_64;
    }
    spill1587_3 = this.f;
    if (!((life3_7 == 0))) {
        forwardValue1587_66_0 = spill1587_3;
        break forward_join_66;
    }
    forwardValue1587_22_0 = ((moom.DK.a__Boolean(((java.lang.String)(spill1587_3)))) ? 1 : 0);
    }
    if (!((forwardValue1587_22_0 != 0))) {
        break forward_join_64;
    }
    life5_39 = ((net.minecraft.world.WorldServer)(((moom.Bl)(life4_6)).a(((int)(0))))).a__Bh();
    life6_44 = ((net.minecraft.scoreboard.Scoreboard)(life5_39)).a__Bg(((java.lang.String)(this.e)));
    spill1587_4 = life5_39;
    spill1587_5 = this.d;
    spill1587_6 = life6_44;
    if (!((life3_7 == 0))) {
        forwardValue1587_45_0 = spill1587_4;
        forwardValue1587_45_1 = spill1587_5;
        forwardValue1587_45_2 = spill1587_6;
        break forward_join_45;
    }
    if (!(((net.minecraft.scoreboard.Scoreboard)(spill1587_4)).a__Boolean(((java.lang.String)(spill1587_5)), ((net.minecraft.scoreboard.ScoreObjective)(spill1587_6))))) {
        break forward_join_61;
    }
    forwardValue1587_45_0 = life5_39;
    forwardValue1587_45_1 = this.d;
    forwardValue1587_45_2 = life6_44;
    }
    life7_64 = ((net.minecraft.scoreboard.Scoreboard)(forwardValue1587_45_0)).a(((java.lang.String)(forwardValue1587_45_1)), ((net.minecraft.scoreboard.ScoreObjective)(forwardValue1587_45_2)));
    ((moom.CK)(this)).a__sourceReturn_a7421bf54c(((java.lang.String)(java.lang.String.format(((java.lang.String)("%d")), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Integer.valueOf(((int)(((net.minecraft.scoreboard.Score)(life7_64)).a())))}))))));
    if (!((life3_7 != 0))) {
        break forward_join_64;
    }
    }
    this.f = ((java.lang.String)(""));
    }
    forwardValue1587_66_0 = this.f;
    }
    return forwardValue1587_66_0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1075_4(java.lang.String a0, java.lang.String a1, java.util.List a2, moom.CO a3) throws E;
}
