package net.minecraft.scoreboard;


public class Team$EnumVisible extends sourcebuild.EnumConstructor<net.minecraft.scoreboard.Team$EnumVisible> {

public static net.minecraft.scoreboard.Team$EnumVisible ALWAYS;

public static net.minecraft.scoreboard.Team$EnumVisible NEVER;

public static net.minecraft.scoreboard.Team$EnumVisible HIDE_FOR_OTHER_TEAMS;

public static net.minecraft.scoreboard.Team$EnumVisible HIDE_FOR_OWN_TEAM;

private static java.util.Map<java.lang.String, net.minecraft.scoreboard.Team$EnumVisible> a;

public java.lang.String internalName;

public int id;

private static net.minecraft.scoreboard.Team$EnumVisible[] b;

private Team$EnumVisible(java.lang.String p0, int p1, java.lang.String p2, int p3) {
super(p0, p1);
    this.internalName = p2;
    this.id = p3;
}


private static void initialize() {
net.minecraft.scoreboard.Team$EnumVisible[] life0_37;
    int life1_40;
    int life2_42;
    net.minecraft.scoreboard.Team$EnumVisible life3_49;
    ALWAYS = ((net.minecraft.scoreboard.Team$EnumVisible)(new net.minecraft.scoreboard.Team$EnumVisible("ALWAYS", 0, "always", 0)));
    NEVER = ((net.minecraft.scoreboard.Team$EnumVisible)(new net.minecraft.scoreboard.Team$EnumVisible("NEVER", 1, "never", 1)));
    HIDE_FOR_OTHER_TEAMS = ((net.minecraft.scoreboard.Team$EnumVisible)(new net.minecraft.scoreboard.Team$EnumVisible("HIDE_FOR_OTHER_TEAMS", 2, "hideForOtherTeams", 2)));
    HIDE_FOR_OWN_TEAM = ((net.minecraft.scoreboard.Team$EnumVisible)(new net.minecraft.scoreboard.Team$EnumVisible("HIDE_FOR_OWN_TEAM", 3, "hideForOwnTeam", 3)));
    b = ((net.minecraft.scoreboard.Team$EnumVisible[])(net.minecraft.scoreboard.Team$EnumVisible.a__Arraybo()));
    a = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    life0_37 = net.minecraft.scoreboard.Team$EnumVisible.values();
    life1_40 = (life0_37).length;
    life2_42 = 0;
    loop_region_43: while ((life2_42 < life1_40)) {
        life3_49 = (life0_37)[life2_42];
        ((java.util.Map)(net.minecraft.scoreboard.Team$EnumVisible.a)).put(((java.lang.Object)(((net.minecraft.scoreboard.Team$EnumVisible)(life3_49)).internalName)), ((java.lang.Object)(life3_49)));
        life2_42 += 1;
    }
}


public static net.minecraft.scoreboard.Team$EnumVisible[] values() {
return ((net.minecraft.scoreboard.Team$EnumVisible[])(((net.minecraft.scoreboard.Team$EnumVisible[])(net.minecraft.scoreboard.Team$EnumVisible.b)).clone()));
}


public static net.minecraft.scoreboard.Team$EnumVisible valueOf(java.lang.String p0) {
return ((net.minecraft.scoreboard.Team$EnumVisible)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.scoreboard.Team$EnumVisible.class)), ((java.lang.String)(p0)))));
}


public static net.minecraft.scoreboard.Team$EnumVisible a(java.lang.String p0) {
return ((net.minecraft.scoreboard.Team$EnumVisible)(((java.util.Map)(net.minecraft.scoreboard.Team$EnumVisible.a)).get(((java.lang.Object)(p0)))));
}


private static net.minecraft.scoreboard.Team$EnumVisible[] a__Arraybo() {
return new net.minecraft.scoreboard.Team$EnumVisible[] {net.minecraft.scoreboard.Team$EnumVisible.ALWAYS, net.minecraft.scoreboard.Team$EnumVisible.NEVER, net.minecraft.scoreboard.Team$EnumVisible.HIDE_FOR_OTHER_TEAMS, net.minecraft.scoreboard.Team$EnumVisible.HIDE_FOR_OWN_TEAM};
}


public static java.lang.String[] a() {
return ((java.lang.String[])(((java.util.Set)(((java.util.Map)(net.minecraft.scoreboard.Team$EnumVisible.a)).keySet())).toArray(((java.lang.Object[])(new java.lang.String[0])))));
}

}
