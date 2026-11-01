package net.minecraft.network.play.server;


public class S45PacketTitle$Type extends sourcebuild.EnumConstructor<net.minecraft.network.play.server.S45PacketTitle$Type> {

public static net.minecraft.network.play.server.S45PacketTitle$Type TITLE;

public static net.minecraft.network.play.server.S45PacketTitle$Type SUBTITLE;

public static net.minecraft.network.play.server.S45PacketTitle$Type TIMES;

public static net.minecraft.network.play.server.S45PacketTitle$Type CLEAR;

public static net.minecraft.network.play.server.S45PacketTitle$Type RESET;

private static net.minecraft.network.play.server.S45PacketTitle$Type[] a;

private static long b;

private S45PacketTitle$Type(java.lang.String p0, int p1) {
super(p0, p1);
}


private static void initialize() {
b = ((long)(((moom._a)(moom._c.a(((long)(-5306956230892855148L)), ((long)(5189559624782916040L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(50521516231482L)))));
    TITLE = ((net.minecraft.network.play.server.S45PacketTitle$Type)(new net.minecraft.network.play.server.S45PacketTitle$Type("TITLE", 0)));
    SUBTITLE = ((net.minecraft.network.play.server.S45PacketTitle$Type)(new net.minecraft.network.play.server.S45PacketTitle$Type("SUBTITLE", 1)));
    TIMES = ((net.minecraft.network.play.server.S45PacketTitle$Type)(new net.minecraft.network.play.server.S45PacketTitle$Type("TIMES", 2)));
    CLEAR = ((net.minecraft.network.play.server.S45PacketTitle$Type)(new net.minecraft.network.play.server.S45PacketTitle$Type("CLEAR", 3)));
    RESET = ((net.minecraft.network.play.server.S45PacketTitle$Type)(new net.minecraft.network.play.server.S45PacketTitle$Type("RESET", 4)));
    a = ((net.minecraft.network.play.server.S45PacketTitle$Type[])(net.minecraft.network.play.server.S45PacketTitle$Type.a__Arraybm()));
}


public static net.minecraft.network.play.server.S45PacketTitle$Type[] values() {
return ((net.minecraft.network.play.server.S45PacketTitle$Type[])(((net.minecraft.network.play.server.S45PacketTitle$Type[])(net.minecraft.network.play.server.S45PacketTitle$Type.a)).clone()));
}


public static net.minecraft.network.play.server.S45PacketTitle$Type valueOf(java.lang.String p0) {
return ((net.minecraft.network.play.server.S45PacketTitle$Type)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.network.play.server.S45PacketTitle$Type.class)), ((java.lang.String)(p0)))));
}


private static net.minecraft.network.play.server.S45PacketTitle$Type[] a__Arraybm() {
return new net.minecraft.network.play.server.S45PacketTitle$Type[] {net.minecraft.network.play.server.S45PacketTitle$Type.TITLE, net.minecraft.network.play.server.S45PacketTitle$Type.SUBTITLE, net.minecraft.network.play.server.S45PacketTitle$Type.TIMES, net.minecraft.network.play.server.S45PacketTitle$Type.CLEAR, net.minecraft.network.play.server.S45PacketTitle$Type.RESET};
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static java.lang.String[] a() {
java.lang.String[] lexicalValue1641_39_0;
    int[] spill1641_0;
    java.lang.String[] spill1641_1;
    long life0_3;
    java.lang.String[] life3_7;
    int life4_9;
    net.minecraft.network.play.server.S45PacketTitle$Type[] life5_12;
    int[] life2_13;
    int life6_16;
    int life7_18;
    net.minecraft.network.play.server.S45PacketTitle$Type life8_25;
    lexical_join_39: {
    lexical_join_38: {
    life0_3 = (net.minecraft.network.play.server.S45PacketTitle$Type.b ^ 86585168202550L);
    life3_7 = new java.lang.String[(net.minecraft.network.play.server.S45PacketTitle$Type.values()).length];
    life4_9 = 0;
    spill1641_0 = moom.zN.b__ArrayInt();
    life5_12 = net.minecraft.network.play.server.S45PacketTitle$Type.values();
    life2_13 = spill1641_0;
    life6_16 = (life5_12).length;
    life7_18 = 0;
    lexical_cycle_19: while (true) {
    if (!((life7_18 < life6_16))) {
        break lexical_join_38;
    }
    life8_25 = (life5_12)[life7_18];
    spill1641_1 = life3_7;
    if (!((life2_13 == null))) {
        lexicalValue1641_39_0 = spill1641_1;
        break lexical_join_39;
    }
    (spill1641_1)[(life4_9++)] = ((java.lang.String)(((net.minecraft.network.play.server.S45PacketTitle$Type)(life8_25)).name())).toLowerCase();
    life7_18 += 1;
    if (!((life2_13 != null))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    lexicalValue1641_39_0 = life3_7;
    }
    return lexicalValue1641_39_0;
}


public static net.minecraft.network.play.server.S45PacketTitle$Type a(java.lang.String p0) {
net.minecraft.network.play.server.S45PacketTitle$Type lexicalValue1642_35_0;
    int[] spill1642_0;
    net.minecraft.network.play.server.S45PacketTitle$Type spill1642_1;
    long life1_3;
    net.minecraft.network.play.server.S45PacketTitle$Type[] life4_5;
    int life5_9;
    int[] life3_10;
    int life6_12;
    net.minecraft.network.play.server.S45PacketTitle$Type life7_19;
    lexical_join_35: {
    lexical_join_34: {
    life1_3 = (net.minecraft.network.play.server.S45PacketTitle$Type.b ^ 109775979842871L);
    life4_5 = net.minecraft.network.play.server.S45PacketTitle$Type.values();
    spill1642_0 = moom.zN.b__ArrayInt();
    life5_9 = (life4_5).length;
    life3_10 = spill1642_0;
    life6_12 = 0;
    lexical_cycle_13: while (true) {
    lexical_join_32: {
    lexical_join_31: {
    if (!((life6_12 < life5_9))) {
        break lexical_join_34;
    }
    life7_19 = (life4_5)[life6_12];
    if (!((life3_10 == null))) {
        break lexical_join_32;
    }
    spill1642_1 = life7_19;
    if (!((life3_10 == null))) {
        lexicalValue1642_35_0 = spill1642_1;
        break lexical_join_35;
    }
    if (!(((java.lang.String)(((net.minecraft.network.play.server.S45PacketTitle$Type)(spill1642_1)).name())).equalsIgnoreCase(((java.lang.String)(p0))))) {
        break lexical_join_31;
    }
    return life7_19;
    }
    life6_12 += 1;
    }
    if (!((life3_10 != null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    lexicalValue1642_35_0 = net.minecraft.network.play.server.S45PacketTitle$Type.TITLE;
    }
    return lexicalValue1642_35_0;
}

}
