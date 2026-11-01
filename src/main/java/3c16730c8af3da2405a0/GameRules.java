package net.minecraft.world;


public class GameRules {

private final java.util.TreeMap<java.lang.String, moom.Ek> a;

private static final long b;

public GameRules() {
super();
    this.a = new java.util.TreeMap();
    (this).a("doFireTick", "true", net.minecraft.world.GameRules$ValueType.BOOLEAN_VALUE);
    (this).a("mobGriefing", "true", net.minecraft.world.GameRules$ValueType.BOOLEAN_VALUE);
    (this).a("keepInventory", "false", net.minecraft.world.GameRules$ValueType.BOOLEAN_VALUE);
    (this).a("doMobSpawning", "true", net.minecraft.world.GameRules$ValueType.BOOLEAN_VALUE);
    (this).a("doMobLoot", "true", net.minecraft.world.GameRules$ValueType.BOOLEAN_VALUE);
    (this).a("doTileDrops", "true", net.minecraft.world.GameRules$ValueType.BOOLEAN_VALUE);
    (this).a("doEntityDrops", "true", net.minecraft.world.GameRules$ValueType.BOOLEAN_VALUE);
    (this).a("commandBlockOutput", "true", net.minecraft.world.GameRules$ValueType.BOOLEAN_VALUE);
    (this).a("naturalRegeneration", "true", net.minecraft.world.GameRules$ValueType.BOOLEAN_VALUE);
    (this).a("doDaylightCycle", "true", net.minecraft.world.GameRules$ValueType.BOOLEAN_VALUE);
    (this).a("logAdminCommands", "true", net.minecraft.world.GameRules$ValueType.BOOLEAN_VALUE);
    (this).a("showDeathMessages", "true", net.minecraft.world.GameRules$ValueType.BOOLEAN_VALUE);
    (this).a("randomTickSpeed", "3", net.minecraft.world.GameRules$ValueType.NUMERICAL_VALUE);
    (this).a("sendCommandFeedback", "true", net.minecraft.world.GameRules$ValueType.BOOLEAN_VALUE);
    (this).a("reducedDebugInfo", "false", net.minecraft.world.GameRules$ValueType.BOOLEAN_VALUE);
}


static {
b = (moom._c.a(2156180560557497780L, 9182963887145397005L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(64152907089640L);
}


public boolean b(java.lang.String p0) {
return (__sourceIntrinsic_booleanComparison((((java.util.TreeMap)(this.a)).containsKey(((java.lang.Object)(p0))))) != 0);
}


public java.lang.String[] a__ArrayString() {
java.util.Set local1 = ((java.util.TreeMap)(this.a)).keySet();
    return ((java.lang.String[])(((java.util.Set)(local1)).toArray(((java.lang.Object[])(new java.lang.String[0])))));
}


public void a(net.minecraft.nbt.NBTTagCompound p0) {
java.lang.String spill1726_0;
    long life2_3;
    java.util.Iterator life5_8;
    java.lang.String life4_9;
    java.lang.String life6_16;
    java.lang.String life7_20;
    lexical_join_27: {
    life2_3 = (net.minecraft.world.GameRules.b ^ 127093607213358L);
    spill1726_0 = net.minecraft.world.World.c__String();
    life5_8 = ((java.util.Set)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Set())).iterator();
    life4_9 = spill1726_0;
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life5_8)).hasNext())) {
        break lexical_join_27;
    }
    life6_16 = ((java.lang.String)(((java.util.Iterator)(life5_8)).next()));
    life7_20 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__String(((java.lang.String)(life6_16)));
    this.a(((java.lang.String)(life6_16)), ((java.lang.String)(life7_20)));
    if (!((life4_9 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


public boolean a(java.lang.String p0, net.minecraft.world.GameRules$ValueType p1) {
moom.Ek forwardValue5778_17_0;
    net.minecraft.world.GameRules$ValueType forwardValue5778_24_0;
    net.minecraft.world.GameRules$ValueType forwardValue5778_24_1;
    int forwardValue5778_28_0;
    java.lang.String spill5778_0;
    moom.Ek spill5778_1;
    net.minecraft.world.GameRules$ValueType spill5778_2;
    net.minecraft.world.GameRules$ValueType spill5778_3;
    long life3_3;
    moom.Ek life6_10;
    java.lang.String life5_11;
    forward_join_28: {
    forward_join_27: {
    forward_join_25: {
    forward_join_24: {
    forward_join_17: {
    life3_3 = (net.minecraft.world.GameRules.b ^ 17155544195909L);
    spill5778_0 = net.minecraft.world.World.c__String();
    life6_10 = ((moom.Ek)(((java.util.TreeMap)(this.a)).get(((java.lang.Object)(p0)))));
    life5_11 = spill5778_0;
    spill5778_1 = life6_10;
    if (!((life5_11 == null))) {
        forwardValue5778_17_0 = spill5778_1;
        break forward_join_17;
    }
    if (!((spill5778_1 != null))) {
        break forward_join_27;
    }
    forwardValue5778_17_0 = life6_10;
    }
    spill5778_2 = ((moom.Ek)(forwardValue5778_17_0)).a__bD();
    spill5778_3 = p1;
    if (!((life5_11 == null))) {
        forwardValue5778_24_0 = spill5778_2;
        forwardValue5778_24_1 = spill5778_3;
        break forward_join_24;
    }
    if (!((spill5778_2 != spill5778_3))) {
        break forward_join_25;
    }
    forwardValue5778_24_0 = p1;
    forwardValue5778_24_1 = net.minecraft.world.GameRules$ValueType.ANY_VALUE;
    }
    if (!((forwardValue5778_24_0 == forwardValue5778_24_1))) {
        break forward_join_27;
    }
    }
    forwardValue5778_28_0 = 1;
    break forward_join_28;
    }
    forwardValue5778_28_0 = 0;
    }
    return ((forwardValue5778_28_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(java.lang.String p0, java.lang.String p1, net.minecraft.world.GameRules$ValueType p2) {
((java.util.TreeMap)(this.a)).put(((java.lang.Object)(p0)), ((java.lang.Object)(new moom.Ek(p1, p2))));
    return;
}


public void a(java.lang.String p0, java.lang.String p1) {
moom.Ek forwardValue5777_17_0;
    java.lang.String spill5777_0;
    moom.Ek spill5777_1;
    long life3_3;
    moom.Ek life6_10;
    java.lang.String life5_11;
    forward_join_26: {
    forward_join_21: {
    forward_join_17: {
    life3_3 = (net.minecraft.world.GameRules.b ^ 117850598278534L);
    spill5777_0 = net.minecraft.world.World.c__String();
    life6_10 = ((moom.Ek)(((java.util.TreeMap)(this.a)).get(((java.lang.Object)(p0)))));
    life5_11 = spill5777_0;
    spill5777_1 = life6_10;
    if (!((life5_11 == null))) {
        forwardValue5777_17_0 = spill5777_1;
        break forward_join_17;
    }
    if (!((spill5777_1 != null))) {
        break forward_join_21;
    }
    forwardValue5777_17_0 = life6_10;
    }
    ((moom.Ek)(forwardValue5777_17_0)).a(((java.lang.String)(p1)));
    if (!((life5_11 != null))) {
        break forward_join_26;
    }
    }
    this.a(((java.lang.String)(p0)), ((java.lang.String)(p1)), ((net.minecraft.world.GameRules$ValueType)(net.minecraft.world.GameRules$ValueType.ANY_VALUE)));
    }
    return;
}


public java.lang.String a__String(java.lang.String p0) {
moom.Ek forwardValue5781_17_0;
    java.lang.String forwardValue5781_20_0;
    java.lang.String spill5781_0;
    moom.Ek spill5781_1;
    long life2_3;
    moom.Ek life5_10;
    java.lang.String life4_11;
    forward_join_20: {
    forward_join_19: {
    forward_join_17: {
    life2_3 = (net.minecraft.world.GameRules.b ^ 95705966709396L);
    spill5781_0 = net.minecraft.world.World.c__String();
    life5_10 = ((moom.Ek)(((java.util.TreeMap)(this.a)).get(((java.lang.Object)(p0)))));
    life4_11 = spill5781_0;
    spill5781_1 = life5_10;
    if (!((life4_11 == null))) {
        forwardValue5781_17_0 = spill5781_1;
        break forward_join_17;
    }
    if (!((spill5781_1 != null))) {
        break forward_join_19;
    }
    forwardValue5781_17_0 = life5_10;
    }
    forwardValue5781_20_0 = ((moom.Ek)(forwardValue5781_17_0)).a__String();
    break forward_join_20;
    }
    forwardValue5781_20_0 = "";
    }
    return forwardValue5781_20_0;
}


public boolean a__Boolean(java.lang.String p0) {
moom.Ek forwardValue5780_17_0;
    int forwardValue5780_22_0;
    int forwardValue5780_24_0;
    java.lang.String spill5780_0;
    moom.Ek spill5780_1;
    boolean spill5780_2;
    long life2_3;
    moom.Ek life5_10;
    java.lang.String life4_11;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_17: {
    life2_3 = (net.minecraft.world.GameRules.b ^ 14934683365921L);
    spill5780_0 = net.minecraft.world.World.c__String();
    life5_10 = ((moom.Ek)(((java.util.TreeMap)(this.a)).get(((java.lang.Object)(p0)))));
    life4_11 = spill5780_0;
    spill5780_1 = life5_10;
    if (!((life4_11 == null))) {
        forwardValue5780_17_0 = spill5780_1;
        break forward_join_17;
    }
    if (!((spill5780_1 != null))) {
        break forward_join_23;
    }
    forwardValue5780_17_0 = life5_10;
    }
    spill5780_2 = ((moom.Ek)(forwardValue5780_17_0)).a__Boolean();
    if (!((life4_11 == null))) {
        forwardValue5780_22_0 = ((spill5780_2) ? 1 : 0);
        break forward_join_22;
    }
    if (!(spill5780_2)) {
        break forward_join_23;
    }
    forwardValue5780_22_0 = 1;
    }
    forwardValue5780_24_0 = forwardValue5780_22_0;
    break forward_join_24;
    }
    forwardValue5780_24_0 = 0;
    }
    return ((forwardValue5780_24_0) != 0);
}


public int a(java.lang.String p0) {
moom.Ek forwardValue5776_17_0;
    int forwardValue5776_20_0;
    java.lang.String spill5776_0;
    moom.Ek spill5776_1;
    long life2_3;
    moom.Ek life5_10;
    java.lang.String life4_11;
    forward_join_20: {
    forward_join_19: {
    forward_join_17: {
    life2_3 = (net.minecraft.world.GameRules.b ^ 59166064095952L);
    spill5776_0 = net.minecraft.world.World.c__String();
    life5_10 = ((moom.Ek)(((java.util.TreeMap)(this.a)).get(((java.lang.Object)(p0)))));
    life4_11 = spill5776_0;
    spill5776_1 = life5_10;
    if (!((life4_11 == null))) {
        forwardValue5776_17_0 = spill5776_1;
        break forward_join_17;
    }
    if (!((spill5776_1 != null))) {
        break forward_join_19;
    }
    forwardValue5776_17_0 = life5_10;
    }
    forwardValue5776_20_0 = ((moom.Ek)(forwardValue5776_17_0)).a();
    break forward_join_20;
    }
    forwardValue5776_20_0 = 0;
    }
    return forwardValue5776_20_0;
}


public net.minecraft.nbt.NBTTagCompound a() {
net.minecraft.nbt.NBTTagCompound lexicalValue1725_38_0;
    java.lang.String spill1725_0;
    net.minecraft.nbt.NBTTagCompound spill1725_1;
    long life1_3;
    net.minecraft.nbt.NBTTagCompound life4_7;
    java.util.Iterator life5_13;
    java.lang.String life3_14;
    java.lang.String life6_21;
    moom.Ek life7_27;
    lexical_join_38: {
    lexical_join_37: {
    life1_3 = (net.minecraft.world.GameRules.b ^ 97147850184850L);
    life4_7 = new net.minecraft.nbt.NBTTagCompound();
    spill1725_0 = net.minecraft.world.World.c__String();
    life5_13 = ((java.util.Set)(((java.util.TreeMap)(this.a)).keySet())).iterator();
    life3_14 = spill1725_0;
    lexical_cycle_15: while (true) {
    if (!(((java.util.Iterator)(life5_13)).hasNext())) {
        break lexical_join_37;
    }
    life6_21 = ((java.lang.String)(((java.util.Iterator)(life5_13)).next()));
    life7_27 = ((moom.Ek)(((java.util.TreeMap)(this.a)).get(((java.lang.Object)(life6_21)))));
    spill1725_1 = life4_7;
    if (!((life3_14 == null))) {
        lexicalValue1725_38_0 = spill1725_1;
        break lexical_join_38;
    }
    ((net.minecraft.nbt.NBTTagCompound)(spill1725_1)).a(((java.lang.String)(life6_21)), ((java.lang.String)(((moom.Ek)(life7_27)).a__String())));
    if (!((life3_14 != null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    lexicalValue1725_38_0 = life4_7;
    }
    return lexicalValue1725_38_0;
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
