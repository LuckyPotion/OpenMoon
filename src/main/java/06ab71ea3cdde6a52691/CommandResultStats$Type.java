package net.minecraft.command;


public class CommandResultStats$Type extends sourcebuild.EnumConstructor<net.minecraft.command.CommandResultStats$Type> {

public static net.minecraft.command.CommandResultStats$Type SUCCESS_COUNT;

public static net.minecraft.command.CommandResultStats$Type AFFECTED_BLOCKS;

public static net.minecraft.command.CommandResultStats$Type AFFECTED_ENTITIES;

public static net.minecraft.command.CommandResultStats$Type AFFECTED_ITEMS;

public static net.minecraft.command.CommandResultStats$Type QUERY_RESULT;

int a;

java.lang.String b;

private static net.minecraft.command.CommandResultStats$Type[] c;

private static long d;

private CommandResultStats$Type(java.lang.String p0, int p1, int p2, java.lang.String p3) {
super(p0, p1);
    this.a = p2;
    this.b = p3;
}


private static void initialize() {
d = ((long)(((moom._a)(moom._c.a(((long)(-2555365311212194043L)), ((long)(5023495537217484692L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(194299288348181L)))));
    SUCCESS_COUNT = ((net.minecraft.command.CommandResultStats$Type)(new net.minecraft.command.CommandResultStats$Type("SUCCESS_COUNT", 0, 0, "SuccessCount")));
    AFFECTED_BLOCKS = ((net.minecraft.command.CommandResultStats$Type)(new net.minecraft.command.CommandResultStats$Type("AFFECTED_BLOCKS", 1, 1, "AffectedBlocks")));
    AFFECTED_ENTITIES = ((net.minecraft.command.CommandResultStats$Type)(new net.minecraft.command.CommandResultStats$Type("AFFECTED_ENTITIES", 2, 2, "AffectedEntities")));
    AFFECTED_ITEMS = ((net.minecraft.command.CommandResultStats$Type)(new net.minecraft.command.CommandResultStats$Type("AFFECTED_ITEMS", 3, 3, "AffectedItems")));
    QUERY_RESULT = ((net.minecraft.command.CommandResultStats$Type)(new net.minecraft.command.CommandResultStats$Type("QUERY_RESULT", 4, 4, "QueryResult")));
    c = ((net.minecraft.command.CommandResultStats$Type[])(net.minecraft.command.CommandResultStats$Type.a__ArrayaO()));
}


public static net.minecraft.command.CommandResultStats$Type[] values() {
return ((net.minecraft.command.CommandResultStats$Type[])(((net.minecraft.command.CommandResultStats$Type[])(net.minecraft.command.CommandResultStats$Type.c)).clone()));
}


public static net.minecraft.command.CommandResultStats$Type valueOf(java.lang.String p0) {
return ((net.minecraft.command.CommandResultStats$Type)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.command.CommandResultStats$Type.class)), ((java.lang.String)(p0)))));
}


private static net.minecraft.command.CommandResultStats$Type[] a__ArrayaO() {
return new net.minecraft.command.CommandResultStats$Type[] {net.minecraft.command.CommandResultStats$Type.SUCCESS_COUNT, net.minecraft.command.CommandResultStats$Type.AFFECTED_BLOCKS, net.minecraft.command.CommandResultStats$Type.AFFECTED_ENTITIES, net.minecraft.command.CommandResultStats$Type.AFFECTED_ITEMS, net.minecraft.command.CommandResultStats$Type.QUERY_RESULT};
}


public static net.minecraft.command.CommandResultStats$Type a(java.lang.String p0) {
boolean spill1518_0;
    long life1_3;
    net.minecraft.command.CommandResultStats$Type[] life4_6;
    int life5_9;
    int life3_10;
    int life6_12;
    net.minecraft.command.CommandResultStats$Type life7_19;
    lexical_join_32: {
    life1_3 = (net.minecraft.command.CommandResultStats$Type.d ^ 37595184856930L);
    spill1518_0 = moom.b7.c();
    life4_6 = net.minecraft.command.CommandResultStats$Type.values();
    life5_9 = (life4_6).length;
    life3_10 = ((spill1518_0) ? 1 : 0);
    life6_12 = 0;
    lexical_cycle_13: while (true) {
    lexical_join_30: {
    lexical_join_29: {
    if (!((life6_12 < life5_9))) {
        break lexical_join_32;
    }
    life7_19 = (life4_6)[life6_12];
    if (!((life3_10 != 0))) {
        break lexical_join_30;
    }
    if (!(((java.lang.String)(((net.minecraft.command.CommandResultStats$Type)(life7_19)).a__String())).equals(((java.lang.Object)(p0))))) {
        break lexical_join_29;
    }
    return life7_19;
    }
    life6_12 += 1;
    }
    if (!((life3_10 == 0))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return null;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static java.lang.String[] a__ArrayString() {
java.lang.String[] lexicalValue1519_38_0;
    boolean spill1519_0;
    java.lang.String[] spill1519_1;
    long life0_3;
    java.lang.String[] life3_8;
    int life2_9;
    int life4_11;
    net.minecraft.command.CommandResultStats$Type[] life5_13;
    int life6_16;
    int life7_18;
    net.minecraft.command.CommandResultStats$Type life8_25;
    lexical_join_38: {
    lexical_join_37: {
    life0_3 = (net.minecraft.command.CommandResultStats$Type.d ^ 135551309658709L);
    spill1519_0 = moom.b7.b();
    life3_8 = new java.lang.String[(net.minecraft.command.CommandResultStats$Type.values()).length];
    life2_9 = ((spill1519_0) ? 1 : 0);
    life4_11 = 0;
    life5_13 = net.minecraft.command.CommandResultStats$Type.values();
    life6_16 = (life5_13).length;
    life7_18 = 0;
    lexical_cycle_19: while (true) {
    if (!((life7_18 < life6_16))) {
        break lexical_join_37;
    }
    life8_25 = (life5_13)[life7_18];
    spill1519_1 = life3_8;
    if (!((life2_9 == 0))) {
        lexicalValue1519_38_0 = spill1519_1;
        break lexical_join_38;
    }
    (spill1519_1)[(life4_11++)] = ((net.minecraft.command.CommandResultStats$Type)(life8_25)).a__String();
    life7_18 += 1;
    if (!((life2_9 != 0))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    lexicalValue1519_38_0 = life3_8;
    }
    return lexicalValue1519_38_0;
}


public java.lang.String a__String() {
return this.b;
}


public int a() {
return this.a;
}

}
