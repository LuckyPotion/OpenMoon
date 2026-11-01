package net.minecraft.event;


public class HoverEvent$Action extends sourcebuild.EnumConstructor<net.minecraft.event.HoverEvent$Action> {

public static net.minecraft.event.HoverEvent$Action SHOW_TEXT;

public static net.minecraft.event.HoverEvent$Action SHOW_ACHIEVEMENT;

public static net.minecraft.event.HoverEvent$Action SHOW_ITEM;

public static net.minecraft.event.HoverEvent$Action SHOW_ENTITY;

private static java.util.Map<java.lang.String, net.minecraft.event.HoverEvent$Action> a;

private boolean b;

private java.lang.String c;

private static net.minecraft.event.HoverEvent$Action[] d;

private HoverEvent$Action(java.lang.String p0, int p1, java.lang.String p2, boolean p3) {
super(p0, p1);
    this.c = p2;
    this.b = p3;
}


private static void initialize() {
net.minecraft.event.HoverEvent$Action[] life0_37;
    int life1_40;
    int life2_42;
    net.minecraft.event.HoverEvent$Action life3_49;
    SHOW_TEXT = ((net.minecraft.event.HoverEvent$Action)(new net.minecraft.event.HoverEvent$Action("SHOW_TEXT", 0, "show_text", true)));
    SHOW_ACHIEVEMENT = ((net.minecraft.event.HoverEvent$Action)(new net.minecraft.event.HoverEvent$Action("SHOW_ACHIEVEMENT", 1, "show_achievement", true)));
    SHOW_ITEM = ((net.minecraft.event.HoverEvent$Action)(new net.minecraft.event.HoverEvent$Action("SHOW_ITEM", 2, "show_item", true)));
    SHOW_ENTITY = ((net.minecraft.event.HoverEvent$Action)(new net.minecraft.event.HoverEvent$Action("SHOW_ENTITY", 3, "show_entity", true)));
    d = ((net.minecraft.event.HoverEvent$Action[])(net.minecraft.event.HoverEvent$Action.a__Arraya0()));
    a = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    life0_37 = net.minecraft.event.HoverEvent$Action.values();
    life1_40 = (life0_37).length;
    life2_42 = 0;
    loop_region_43: while ((life2_42 < life1_40)) {
        life3_49 = (life0_37)[life2_42];
        ((java.util.Map)(net.minecraft.event.HoverEvent$Action.a)).put(((java.lang.Object)(((net.minecraft.event.HoverEvent$Action)(life3_49)).a())), ((java.lang.Object)(life3_49)));
        life2_42 += 1;
    }
}


public static net.minecraft.event.HoverEvent$Action[] values() {
return ((net.minecraft.event.HoverEvent$Action[])(((net.minecraft.event.HoverEvent$Action[])(net.minecraft.event.HoverEvent$Action.d)).clone()));
}


public static net.minecraft.event.HoverEvent$Action valueOf(java.lang.String p0) {
return ((net.minecraft.event.HoverEvent$Action)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.event.HoverEvent$Action.class)), ((java.lang.String)(p0)))));
}


public java.lang.String a() {
return this.c;
}


private static net.minecraft.event.HoverEvent$Action[] a__Arraya0() {
return new net.minecraft.event.HoverEvent$Action[] {net.minecraft.event.HoverEvent$Action.SHOW_TEXT, net.minecraft.event.HoverEvent$Action.SHOW_ACHIEVEMENT, net.minecraft.event.HoverEvent$Action.SHOW_ITEM, net.minecraft.event.HoverEvent$Action.SHOW_ENTITY};
}


public static net.minecraft.event.HoverEvent$Action a(java.lang.String p0) {
return ((net.minecraft.event.HoverEvent$Action)(((java.util.Map)(net.minecraft.event.HoverEvent$Action.a)).get(((java.lang.Object)(p0)))));
}


public boolean a__Boolean() {
return ((((this.b) ? 1 : 0)) != 0);
}

}
