package net.minecraft.world;


public class WorldSettings$GameType extends sourcebuild.EnumConstructor<net.minecraft.world.WorldSettings$GameType> {

public static net.minecraft.world.WorldSettings$GameType NOT_SET;

public static net.minecraft.world.WorldSettings$GameType SURVIVAL;

public static net.minecraft.world.WorldSettings$GameType CREATIVE;

public static net.minecraft.world.WorldSettings$GameType ADVENTURE;

public static net.minecraft.world.WorldSettings$GameType SPECTATOR;

int a;

java.lang.String b;

private static net.minecraft.world.WorldSettings$GameType[] c;

private static long d;

private WorldSettings$GameType(java.lang.String p0, int p1, int p2, java.lang.String p3) {
super(p0, p1);
    this.a = p2;
    this.b = p3;
}


private static void initialize() {
d = ((long)(((moom._a)(moom._c.a(((long)(-6467443300686468431L)), ((long)(-2583562704134613896L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(55087856636521L)))));
    NOT_SET = ((net.minecraft.world.WorldSettings$GameType)(new net.minecraft.world.WorldSettings$GameType("NOT_SET", 0, -1, "")));
    SURVIVAL = ((net.minecraft.world.WorldSettings$GameType)(new net.minecraft.world.WorldSettings$GameType("SURVIVAL", 1, 0, "survival")));
    CREATIVE = ((net.minecraft.world.WorldSettings$GameType)(new net.minecraft.world.WorldSettings$GameType("CREATIVE", 2, 1, "creative")));
    ADVENTURE = ((net.minecraft.world.WorldSettings$GameType)(new net.minecraft.world.WorldSettings$GameType("ADVENTURE", 3, 2, "adventure")));
    SPECTATOR = ((net.minecraft.world.WorldSettings$GameType)(new net.minecraft.world.WorldSettings$GameType("SPECTATOR", 4, 3, "spectator")));
    c = ((net.minecraft.world.WorldSettings$GameType[])(net.minecraft.world.WorldSettings$GameType.a__ArraybE()));
}


public static net.minecraft.world.WorldSettings$GameType[] values() {
return ((net.minecraft.world.WorldSettings$GameType[])(((net.minecraft.world.WorldSettings$GameType[])(net.minecraft.world.WorldSettings$GameType.c)).clone()));
}


public static net.minecraft.world.WorldSettings$GameType valueOf(java.lang.String p0) {
return ((net.minecraft.world.WorldSettings$GameType)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.world.WorldSettings$GameType.class)), ((java.lang.String)(p0)))));
}


public boolean b() {
long local1 = (net.minecraft.world.WorldSettings$GameType.d ^ 32172192368064L);
    return ((((this == net.minecraft.world.WorldSettings$GameType.CREATIVE) ? 1 : 0)) != 0);
}


public boolean c() {
net.minecraft.world.WorldSettings$GameType forwardValue5800_13_0;
    net.minecraft.world.WorldSettings$GameType forwardValue5800_13_1;
    int forwardValue5800_17_0;
    net.minecraft.world.WorldSettings$GameType spill5800_0;
    net.minecraft.world.WorldSettings$GameType spill5800_1;
    long life1_3;
    java.lang.String life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (net.minecraft.world.WorldSettings$GameType.d ^ 64382921311535L);
    life3_5 = net.minecraft.world.World.c__String();
    spill5800_0 = this;
    spill5800_1 = net.minecraft.world.WorldSettings$GameType.SURVIVAL;
    if (!((life3_5 == null))) {
        forwardValue5800_13_0 = spill5800_0;
        forwardValue5800_13_1 = spill5800_1;
        break forward_join_13;
    }
    if (!((spill5800_0 != spill5800_1))) {
        break forward_join_14;
    }
    forwardValue5800_13_0 = this;
    forwardValue5800_13_1 = net.minecraft.world.WorldSettings$GameType.ADVENTURE;
    }
    if (!((forwardValue5800_13_0 == forwardValue5800_13_1))) {
        break forward_join_16;
    }
    }
    forwardValue5800_17_0 = 1;
    break forward_join_17;
    }
    forwardValue5800_17_0 = 0;
    }
    return ((forwardValue5800_17_0) != 0);
}


public static net.minecraft.world.WorldSettings$GameType a(java.lang.String p0) {
net.minecraft.world.WorldSettings$GameType lexicalValue1742_35_0;
    java.lang.String spill1742_0;
    net.minecraft.world.WorldSettings$GameType spill1742_1;
    long life1_3;
    net.minecraft.world.WorldSettings$GameType[] life4_6;
    java.lang.String life3_7;
    int life5_10;
    int life6_12;
    net.minecraft.world.WorldSettings$GameType life7_19;
    lexical_join_35: {
    lexical_join_34: {
    life1_3 = (net.minecraft.world.WorldSettings$GameType.d ^ 79566246428989L);
    spill1742_0 = net.minecraft.world.World.c__String();
    life4_6 = net.minecraft.world.WorldSettings$GameType.values();
    life3_7 = spill1742_0;
    life5_10 = (life4_6).length;
    life6_12 = 0;
    lexical_cycle_13: while (true) {
    lexical_join_32: {
    lexical_join_31: {
    if (!((life6_12 < life5_10))) {
        break lexical_join_34;
    }
    life7_19 = (life4_6)[life6_12];
    if (!((life3_7 == null))) {
        break lexical_join_32;
    }
    spill1742_1 = life7_19;
    if (!((life3_7 == null))) {
        lexicalValue1742_35_0 = spill1742_1;
        break lexical_join_35;
    }
    if (!(((java.lang.String)(((net.minecraft.world.WorldSettings$GameType)(spill1742_1)).b)).equals(((java.lang.Object)(p0))))) {
        break lexical_join_31;
    }
    return life7_19;
    }
    life6_12 += 1;
    }
    if (!((life3_7 != null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    lexicalValue1742_35_0 = net.minecraft.world.WorldSettings$GameType.SURVIVAL;
    }
    return lexicalValue1742_35_0;
}


private static net.minecraft.world.WorldSettings$GameType[] a__ArraybE() {
return new net.minecraft.world.WorldSettings$GameType[] {net.minecraft.world.WorldSettings$GameType.NOT_SET, net.minecraft.world.WorldSettings$GameType.SURVIVAL, net.minecraft.world.WorldSettings$GameType.CREATIVE, net.minecraft.world.WorldSettings$GameType.ADVENTURE, net.minecraft.world.WorldSettings$GameType.SPECTATOR};
}


public int a() {
return this.a;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.entity.player.PlayerCapabilities p0) {
net.minecraft.world.WorldSettings$GameType forwardValue5798_24_0;
    net.minecraft.world.WorldSettings$GameType forwardValue5798_24_1;
    net.minecraft.entity.player.PlayerCapabilities forwardValue5798_58_0;
    int forwardValue5798_58_1;
    net.minecraft.entity.player.PlayerCapabilities forwardValue5798_59_0;
    net.minecraft.entity.player.PlayerCapabilities forwardValue5798_60_0;
    int forwardValue5798_60_1;
    net.minecraft.world.WorldSettings$GameType spill5798_0;
    net.minecraft.world.WorldSettings$GameType spill5798_1;
    net.minecraft.entity.player.PlayerCapabilities spill5798_2;
    boolean spill5798_3;
    long life2_3;
    java.lang.String life4_5;
    forward_join_60: {
    forward_join_59: {
    forward_join_58: {
    forward_join_51: {
    forward_join_39: {
    forward_join_24: {
    forward_join_22: {
    life2_3 = (net.minecraft.world.WorldSettings$GameType.d ^ 64471954589523L);
    life4_5 = net.minecraft.world.World.c__String();
    spill5798_0 = this;
    spill5798_1 = net.minecraft.world.WorldSettings$GameType.CREATIVE;
    if (!((life4_5 == null))) {
        forwardValue5798_24_0 = spill5798_0;
        forwardValue5798_24_1 = spill5798_1;
        break forward_join_24;
    }
    if (!((spill5798_0 == spill5798_1))) {
        break forward_join_22;
    }
    ((net.minecraft.entity.player.PlayerCapabilities)(p0)).c = ((boolean)(true));
    ((net.minecraft.entity.player.PlayerCapabilities)(p0)).d = ((boolean)(true));
    ((net.minecraft.entity.player.PlayerCapabilities)(p0)).a = ((boolean)(true));
    if (!((life4_5 != null))) {
        break forward_join_51;
    }
    }
    forwardValue5798_24_0 = this;
    forwardValue5798_24_1 = net.minecraft.world.WorldSettings$GameType.SPECTATOR;
    }
    if (!((forwardValue5798_24_0 == forwardValue5798_24_1))) {
        break forward_join_39;
    }
    ((net.minecraft.entity.player.PlayerCapabilities)(p0)).c = ((boolean)(true));
    ((net.minecraft.entity.player.PlayerCapabilities)(p0)).d = ((boolean)(false));
    ((net.minecraft.entity.player.PlayerCapabilities)(p0)).a = ((boolean)(true));
    ((net.minecraft.entity.player.PlayerCapabilities)(p0)).b = ((boolean)(true));
    if (!((life4_5 != null))) {
        break forward_join_51;
    }
    }
    ((net.minecraft.entity.player.PlayerCapabilities)(p0)).c = ((boolean)(false));
    ((net.minecraft.entity.player.PlayerCapabilities)(p0)).d = ((boolean)(false));
    ((net.minecraft.entity.player.PlayerCapabilities)(p0)).a = ((boolean)(false));
    ((net.minecraft.entity.player.PlayerCapabilities)(p0)).b = ((boolean)(false));
    }
    spill5798_2 = p0;
    spill5798_3 = ((net.minecraft.world.WorldSettings$GameType)(this)).a__Boolean();
    if (!((life4_5 == null))) {
        forwardValue5798_58_0 = spill5798_2;
        forwardValue5798_58_1 = ((spill5798_3) ? 1 : 0);
        break forward_join_58;
    }
    if (!((!spill5798_3))) {
        forwardValue5798_59_0 = spill5798_2;
        break forward_join_59;
    }
    forwardValue5798_58_0 = spill5798_2;
    forwardValue5798_58_1 = 1;
    }
    forwardValue5798_60_0 = forwardValue5798_58_0;
    forwardValue5798_60_1 = forwardValue5798_58_1;
    break forward_join_60;
    }
    forwardValue5798_60_0 = forwardValue5798_59_0;
    forwardValue5798_60_1 = 0;
    }
    ((net.minecraft.entity.player.PlayerCapabilities)(forwardValue5798_60_0)).e = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue5798_60_1)));
    return;
}


public boolean a__Boolean() {
net.minecraft.world.WorldSettings$GameType forwardValue5799_13_0;
    net.minecraft.world.WorldSettings$GameType forwardValue5799_13_1;
    int forwardValue5799_17_0;
    net.minecraft.world.WorldSettings$GameType spill5799_0;
    net.minecraft.world.WorldSettings$GameType spill5799_1;
    long life1_3;
    java.lang.String life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (net.minecraft.world.WorldSettings$GameType.d ^ 85697708511466L);
    life3_5 = net.minecraft.world.World.c__String();
    spill5799_0 = this;
    spill5799_1 = net.minecraft.world.WorldSettings$GameType.ADVENTURE;
    if (!((life3_5 == null))) {
        forwardValue5799_13_0 = spill5799_0;
        forwardValue5799_13_1 = spill5799_1;
        break forward_join_13;
    }
    if (!((spill5799_0 != spill5799_1))) {
        break forward_join_14;
    }
    forwardValue5799_13_0 = this;
    forwardValue5799_13_1 = net.minecraft.world.WorldSettings$GameType.SPECTATOR;
    }
    if (!((forwardValue5799_13_0 == forwardValue5799_13_1))) {
        break forward_join_16;
    }
    }
    forwardValue5799_17_0 = 1;
    break forward_join_17;
    }
    forwardValue5799_17_0 = 0;
    }
    return ((forwardValue5799_17_0) != 0);
}


public java.lang.String a__String() {
return this.b;
}


public static net.minecraft.world.WorldSettings$GameType a(int p0) {
net.minecraft.world.WorldSettings$GameType lexicalValue1741_34_0;
    java.lang.String spill1741_0;
    net.minecraft.world.WorldSettings$GameType spill1741_1;
    long life1_3;
    net.minecraft.world.WorldSettings$GameType[] life4_6;
    java.lang.String life3_7;
    int life5_10;
    int life6_12;
    net.minecraft.world.WorldSettings$GameType life7_19;
    lexical_join_34: {
    lexical_join_33: {
    life1_3 = (net.minecraft.world.WorldSettings$GameType.d ^ 84558028553720L);
    spill1741_0 = net.minecraft.world.World.c__String();
    life4_6 = net.minecraft.world.WorldSettings$GameType.values();
    life3_7 = spill1741_0;
    life5_10 = (life4_6).length;
    life6_12 = 0;
    lexical_cycle_13: while (true) {
    lexical_join_31: {
    lexical_join_30: {
    if (!((life6_12 < life5_10))) {
        break lexical_join_33;
    }
    life7_19 = (life4_6)[life6_12];
    if (!((life3_7 == null))) {
        break lexical_join_31;
    }
    spill1741_1 = life7_19;
    if (!((life3_7 == null))) {
        lexicalValue1741_34_0 = spill1741_1;
        break lexical_join_34;
    }
    if (!((((net.minecraft.world.WorldSettings$GameType)(spill1741_1)).a == p0))) {
        break lexical_join_30;
    }
    return life7_19;
    }
    life6_12 += 1;
    }
    if (!((life3_7 != null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    lexicalValue1741_34_0 = net.minecraft.world.WorldSettings$GameType.SURVIVAL;
    }
    return lexicalValue1741_34_0;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
