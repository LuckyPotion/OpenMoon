package net.minecraft.event;


public class ClickEvent$Action extends sourcebuild.EnumConstructor<net.minecraft.event.ClickEvent$Action> {

public static net.minecraft.event.ClickEvent$Action OPEN_URL;

public static net.minecraft.event.ClickEvent$Action OPEN_FILE;

public static net.minecraft.event.ClickEvent$Action RUN_COMMAND;

public static net.minecraft.event.ClickEvent$Action SUGGEST_COMMAND;

public static net.minecraft.event.ClickEvent$Action CHANGE_PAGE;

private static java.util.Map<java.lang.String, net.minecraft.event.ClickEvent$Action> a;

private boolean b;

private java.lang.String c;

private static net.minecraft.event.ClickEvent$Action[] d;

private ClickEvent$Action(java.lang.String p0, int p1, java.lang.String p2, boolean p3) {
super(p0, p1);
    this.c = p2;
    this.b = p3;
}


private static void initialize() {
net.minecraft.event.ClickEvent$Action[] life0_45;
    int life1_48;
    int life2_50;
    net.minecraft.event.ClickEvent$Action life3_57;
    OPEN_URL = ((net.minecraft.event.ClickEvent$Action)(new net.minecraft.event.ClickEvent$Action("OPEN_URL", 0, "open_url", true)));
    OPEN_FILE = ((net.minecraft.event.ClickEvent$Action)(new net.minecraft.event.ClickEvent$Action("OPEN_FILE", 1, "open_file", false)));
    RUN_COMMAND = ((net.minecraft.event.ClickEvent$Action)(new net.minecraft.event.ClickEvent$Action("RUN_COMMAND", 2, "run_command", true)));
    SUGGEST_COMMAND = ((net.minecraft.event.ClickEvent$Action)(new net.minecraft.event.ClickEvent$Action("SUGGEST_COMMAND", 3, "suggest_command", true)));
    CHANGE_PAGE = ((net.minecraft.event.ClickEvent$Action)(new net.minecraft.event.ClickEvent$Action("CHANGE_PAGE", 4, "change_page", true)));
    d = ((net.minecraft.event.ClickEvent$Action[])(net.minecraft.event.ClickEvent$Action.a__ArrayaZ()));
    a = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    life0_45 = net.minecraft.event.ClickEvent$Action.values();
    life1_48 = (life0_45).length;
    life2_50 = 0;
    loop_region_51: while ((life2_50 < life1_48)) {
        life3_57 = (life0_45)[life2_50];
        ((java.util.Map)(net.minecraft.event.ClickEvent$Action.a)).put(((java.lang.Object)(((net.minecraft.event.ClickEvent$Action)(life3_57)).a())), ((java.lang.Object)(life3_57)));
        life2_50 += 1;
    }
}


public static net.minecraft.event.ClickEvent$Action[] values() {
return ((net.minecraft.event.ClickEvent$Action[])(((net.minecraft.event.ClickEvent$Action[])(net.minecraft.event.ClickEvent$Action.d)).clone()));
}


public static net.minecraft.event.ClickEvent$Action valueOf(java.lang.String p0) {
return ((net.minecraft.event.ClickEvent$Action)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.event.ClickEvent$Action.class)), ((java.lang.String)(p0)))));
}


public java.lang.String a() {
return this.c;
}


private static net.minecraft.event.ClickEvent$Action[] a__ArrayaZ() {
return new net.minecraft.event.ClickEvent$Action[] {net.minecraft.event.ClickEvent$Action.OPEN_URL, net.minecraft.event.ClickEvent$Action.OPEN_FILE, net.minecraft.event.ClickEvent$Action.RUN_COMMAND, net.minecraft.event.ClickEvent$Action.SUGGEST_COMMAND, net.minecraft.event.ClickEvent$Action.CHANGE_PAGE};
}


public static net.minecraft.event.ClickEvent$Action a(java.lang.String p0) {
return ((net.minecraft.event.ClickEvent$Action)(((java.util.Map)(net.minecraft.event.ClickEvent$Action.a)).get(((java.lang.Object)(p0)))));
}


public boolean a__Boolean() {
return ((((this.b) ? 1 : 0)) != 0);
}

}
