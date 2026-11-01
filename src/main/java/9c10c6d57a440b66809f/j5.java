package com.moon;


public class j5 implements com.moon.scripting.api.functions.WorldFunctions {

private static final net.minecraft.client.Minecraft a;

private com.moon.module.impl.AntiBot b;

private static final long c;

public j5() {
super();
}


static {
c = (moom._c.a(7907459150077964916L, -4823036289763193959L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(131344249967803L);
    a = net.minecraft.client.Minecraft.a__fM();
}


public void remove(int p0) {
net.minecraft.client.multiplayer.WorldClient forwardValue563_14_0;
    net.minecraft.client.multiplayer.WorldClient spill563_0;
    long life2_3;
    int life4_5;
    forward_join_14: {
    forward_join_12: {
    life2_3 = (com.moon.j5.c ^ 102098982914172L);
    life4_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill563_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life4_5 == 0))) {
        forwardValue563_14_0 = spill563_0;
        break forward_join_14;
    }
    if (!((spill563_0 == null))) {
        break forward_join_12;
    }
    return;
    }
    forwardValue563_14_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    ((net.minecraft.client.multiplayer.WorldClient)(forwardValue563_14_0)).b__sourceReturn_b6fcdeb6b7(((int)(p0)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.scripting.api.enums.Facing get_facing(int p0) {
net.minecraft.client.multiplayer.WorldClient forwardValue532_15_0;
    net.minecraft.client.multiplayer.WorldClient spill532_0;
    long life2_3;
    int life4_5;
    net.minecraft.entity.Entity life5_22;
    forward_join_22: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (com.moon.j5.c ^ 1593434299835L);
    life4_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill532_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life4_5 != 0))) {
        forwardValue532_15_0 = spill532_0;
        break forward_join_15;
    }
    if (!((spill532_0 == null))) {
        break forward_join_13;
    }
    return null;
    }
    forwardValue532_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    life5_22 = ((net.minecraft.client.multiplayer.WorldClient)(forwardValue532_15_0)).a(((int)(p0)));
    if (!((life5_22 == null))) {
        break forward_join_22;
    }
    return com.moon.scripting.api.enums.Facing.UP;
    }
    return (com.moon.scripting.api.enums.Facing.values())[((moom.bs)(((net.minecraft.entity.Entity)(life5_22)).b__bs())).ordinal()];
}


public boolean is_burning(int p0) {
net.minecraft.client.multiplayer.WorldClient forwardValue555_15_0;
    net.minecraft.entity.Entity forwardValue555_25_0;
    net.minecraft.client.multiplayer.WorldClient spill555_0;
    net.minecraft.entity.Entity spill555_1;
    long life2_3;
    int life4_5;
    net.minecraft.entity.Entity life5_22;
    forward_join_25: {
    forward_join_24: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (com.moon.j5.c ^ 113704554306349L);
    life4_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill555_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life4_5 == 0))) {
        forwardValue555_15_0 = spill555_0;
        break forward_join_15;
    }
    if (!((spill555_0 == null))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue555_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    life5_22 = ((net.minecraft.client.multiplayer.WorldClient)(forwardValue555_15_0)).a(((int)(p0)));
    spill555_1 = life5_22;
    if (!((life4_5 == 0))) {
        forwardValue555_25_0 = spill555_1;
        break forward_join_25;
    }
    if (!((spill555_1 == null))) {
        break forward_join_24;
    }
    return ((0) != 0);
    }
    forwardValue555_25_0 = life5_22;
    }
    return ((net.minecraft.entity.Entity)(forwardValue555_25_0)).r__Boolean();
}


public com.moon.scripting.api.types.Vec3d get_position(int p0) {
net.minecraft.client.multiplayer.WorldClient forwardValue541_15_0;
    net.minecraft.client.multiplayer.WorldClient spill541_0;
    long life2_3;
    int life4_5;
    net.minecraft.entity.Entity life5_22;
    forward_join_22: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (com.moon.j5.c ^ 114216397627024L);
    life4_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill541_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life4_5 != 0))) {
        forwardValue541_15_0 = spill541_0;
        break forward_join_15;
    }
    if (!((spill541_0 == null))) {
        break forward_join_13;
    }
    return null;
    }
    forwardValue541_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    life5_22 = ((net.minecraft.client.multiplayer.WorldClient)(forwardValue541_15_0)).a(((int)(p0)));
    if (!((life5_22 == null))) {
        break forward_join_22;
    }
    return null;
    }
    return new com.moon.scripting.api.types.Vec3d(((net.minecraft.entity.Entity)(life5_22)).n, ((net.minecraft.entity.Entity)(life5_22)).o, ((net.minecraft.entity.Entity)(life5_22)).p);
}


public java.lang.String get_name(int p0) {
net.minecraft.client.multiplayer.WorldClient forwardValue538_15_0;
    net.minecraft.entity.Entity forwardValue538_25_0;
    net.minecraft.client.multiplayer.WorldClient spill538_0;
    net.minecraft.entity.Entity spill538_1;
    long life2_3;
    int life4_5;
    net.minecraft.entity.Entity life5_22;
    forward_join_25: {
    forward_join_24: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (com.moon.j5.c ^ 42291209443167L);
    life4_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill538_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life4_5 == 0))) {
        forwardValue538_15_0 = spill538_0;
        break forward_join_15;
    }
    if (!((spill538_0 == null))) {
        break forward_join_13;
    }
    return null;
    }
    forwardValue538_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    life5_22 = ((net.minecraft.client.multiplayer.WorldClient)(forwardValue538_15_0)).a(((int)(p0)));
    spill538_1 = life5_22;
    if (!((life4_5 == 0))) {
        forwardValue538_25_0 = spill538_1;
        break forward_join_25;
    }
    if (!((spill538_1 == null))) {
        break forward_join_24;
    }
    return null;
    }
    forwardValue538_25_0 = life5_22;
    }
    return ((net.minecraft.entity.Entity)(forwardValue538_25_0)).a__String();
}


public com.moon.scripting.api.types.Potion get_effect(int p0, int p1) {
net.minecraft.client.multiplayer.WorldClient forwardValue530_15_0;
    net.minecraft.entity.Entity forwardValue530_24_0;
    net.minecraft.client.multiplayer.WorldClient spill530_0;
    net.minecraft.entity.Entity spill530_1;
    long life3_3;
    int life5_5;
    net.minecraft.entity.Entity life6_22;
    net.minecraft.entity.EntityLiving life7_36;
    net.minecraft.potion.PotionEffect life8_49;
    net.minecraft.potion.Potion life9_60;
    com.moon.scripting.api.types.Potion life10_64;
    forward_join_41: {
    forward_join_30: {
    forward_join_28: {
    forward_join_24: {
    forward_join_15: {
    forward_join_13: {
    life3_3 = (com.moon.j5.c ^ 130741528536206L);
    life5_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill530_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life5_5 == 0))) {
        forwardValue530_15_0 = spill530_0;
        break forward_join_15;
    }
    if (!((spill530_0 == null))) {
        break forward_join_13;
    }
    return null;
    }
    forwardValue530_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    life6_22 = ((net.minecraft.client.multiplayer.WorldClient)(forwardValue530_15_0)).a(((int)(p0)));
    spill530_1 = life6_22;
    if (!((life5_5 == 0))) {
        forwardValue530_24_0 = spill530_1;
        break forward_join_24;
    }
    if (!((((spill530_1 instanceof net.minecraft.entity.EntityLiving) ? 1 : 0) != 0))) {
        break forward_join_28;
    }
    forwardValue530_24_0 = life6_22;
    }
    life7_36 = ((net.minecraft.entity.EntityLiving)(forwardValue530_24_0));
    if (!((life5_5 != 0))) {
        break forward_join_30;
    }
    }
    return null;
    }
    life8_49 = ((net.minecraft.potion.PotionEffect)(((java.util.Map)(((net.minecraft.entity.EntityLiving)(life7_36)).a__Map())).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0))))))));
    if (!((life8_49 == null))) {
        break forward_join_41;
    }
    return null;
    }
    life9_60 = (net.minecraft.potion.Potion.a)[((net.minecraft.potion.PotionEffect)(life8_49)).a()];
    life10_64 = new com.moon.scripting.api.types.Potion();
    ((com.moon.scripting.api.types.Potion)(life10_64)).id = ((int)(((net.minecraft.potion.PotionEffect)(life8_49)).a()));
    ((com.moon.scripting.api.types.Potion)(life10_64)).amplifier = ((int)(((net.minecraft.potion.PotionEffect)(life8_49)).c()));
    ((com.moon.scripting.api.types.Potion)(life10_64)).duration = ((int)(((net.minecraft.potion.PotionEffect)(life8_49)).b()));
    ((com.moon.scripting.api.types.Potion)(life10_64)).color = ((int)(((net.minecraft.potion.Potion)(life9_60)).c()));
    ((com.moon.scripting.api.types.Potion)(life10_64)).name = ((java.lang.String)(((net.minecraft.potion.Potion)(life9_60)).a__String()));
    ((com.moon.scripting.api.types.Potion)(life10_64)).bad_effect = ((boolean)(((net.minecraft.potion.Potion)(life9_60)).c__Boolean()));
    return life10_64;
}


public float get_pitch(int p0) {
net.minecraft.client.multiplayer.WorldClient forwardValue539_15_0;
    net.minecraft.entity.Entity forwardValue539_25_0;
    net.minecraft.client.multiplayer.WorldClient spill539_0;
    net.minecraft.entity.Entity spill539_1;
    long life2_3;
    int life4_5;
    net.minecraft.entity.Entity life5_22;
    forward_join_25: {
    forward_join_24: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (com.moon.j5.c ^ 23139918344362L);
    life4_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill539_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life4_5 != 0))) {
        forwardValue539_15_0 = spill539_0;
        break forward_join_15;
    }
    if (!((spill539_0 == null))) {
        break forward_join_13;
    }
    return 0x0.0p0f;
    }
    forwardValue539_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    life5_22 = ((net.minecraft.client.multiplayer.WorldClient)(forwardValue539_15_0)).a(((int)(p0)));
    spill539_1 = life5_22;
    if (!((life4_5 != 0))) {
        forwardValue539_25_0 = spill539_1;
        break forward_join_25;
    }
    if (!((spill539_1 == null))) {
        break forward_join_24;
    }
    return 0x0.0p0f;
    }
    forwardValue539_25_0 = life5_22;
    }
    return ((net.minecraft.entity.Entity)(forwardValue539_25_0)).x;
}


public double get_max_health(int p0) {
net.minecraft.client.multiplayer.WorldClient forwardValue537_15_0;
    net.minecraft.entity.Entity forwardValue537_24_0;
    net.minecraft.client.multiplayer.WorldClient spill537_0;
    net.minecraft.entity.Entity spill537_1;
    long life2_3;
    int life4_5;
    net.minecraft.entity.Entity life5_22;
    net.minecraft.entity.EntityLivingBase life6_36;
    forward_join_30: {
    forward_join_28: {
    forward_join_24: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (com.moon.j5.c ^ 47138072842213L);
    life4_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill537_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life4_5 != 0))) {
        forwardValue537_15_0 = spill537_0;
        break forward_join_15;
    }
    if (!((spill537_0 == null))) {
        break forward_join_13;
    }
    return 0x0.0p0d;
    }
    forwardValue537_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    life5_22 = ((net.minecraft.client.multiplayer.WorldClient)(forwardValue537_15_0)).a(((int)(p0)));
    spill537_1 = life5_22;
    if (!((life4_5 != 0))) {
        forwardValue537_24_0 = spill537_1;
        break forward_join_24;
    }
    if (!((((spill537_1 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0) != 0))) {
        break forward_join_28;
    }
    forwardValue537_24_0 = life5_22;
    }
    life6_36 = ((net.minecraft.entity.EntityLivingBase)(forwardValue537_24_0));
    if (!((life4_5 == 0))) {
        break forward_join_30;
    }
    }
    return 0x0.0p0d;
    }
    return ((double) ((net.minecraft.entity.EntityLivingBase)(life6_36)).a());
}


public double get_position_z(int p0) {
net.minecraft.client.multiplayer.WorldClient forwardValue544_15_0;
    net.minecraft.entity.Entity forwardValue544_25_0;
    net.minecraft.client.multiplayer.WorldClient spill544_0;
    net.minecraft.entity.Entity spill544_1;
    long life2_3;
    int life4_5;
    net.minecraft.entity.Entity life5_22;
    forward_join_25: {
    forward_join_24: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (com.moon.j5.c ^ 8887715837865L);
    life4_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill544_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life4_5 != 0))) {
        forwardValue544_15_0 = spill544_0;
        break forward_join_15;
    }
    if (!((spill544_0 == null))) {
        break forward_join_13;
    }
    return 0x0.0p0d;
    }
    forwardValue544_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    life5_22 = ((net.minecraft.client.multiplayer.WorldClient)(forwardValue544_15_0)).a(((int)(p0)));
    spill544_1 = life5_22;
    if (!((life4_5 != 0))) {
        forwardValue544_25_0 = spill544_1;
        break forward_join_25;
    }
    if (!((spill544_1 == null))) {
        break forward_join_24;
    }
    return 0x0.0p0d;
    }
    forwardValue544_25_0 = life5_22;
    }
    return ((net.minecraft.entity.Entity)(forwardValue544_25_0)).p;
}


public boolean has_effect(int p0, int p1) {
net.minecraft.client.multiplayer.WorldClient forwardValue552_15_0;
    int forwardValue552_29_0;
    int forwardValue552_39_0;
    net.minecraft.client.multiplayer.WorldClient spill552_0;
    int spill552_1;
    long life3_3;
    int life5_5;
    net.minecraft.entity.Entity life6_22;
    net.minecraft.entity.EntityLiving life7_33;
    forward_join_39: {
    forward_join_38: {
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_15: {
    forward_join_13: {
    life3_3 = (com.moon.j5.c ^ 86941353194517L);
    life5_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill552_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life5_5 != 0))) {
        forwardValue552_15_0 = spill552_0;
        break forward_join_15;
    }
    if (!((spill552_0 == null))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue552_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    life6_22 = ((net.minecraft.client.multiplayer.WorldClient)(forwardValue552_15_0)).a(((int)(p0)));
    spill552_1 = ((life6_22 instanceof net.minecraft.entity.EntityLiving) ? 1 : 0);
    if (!((life5_5 != 0))) {
        forwardValue552_29_0 = spill552_1;
        break forward_join_29;
    }
    if (!((spill552_1 != 0))) {
        break forward_join_28;
    }
    life7_33 = ((net.minecraft.entity.EntityLiving)(life6_22));
    if (!((life5_5 == 0))) {
        break forward_join_30;
    }
    }
    forwardValue552_29_0 = 0;
    }
    return ((forwardValue552_29_0) != 0);
    }
    if (!((((java.util.Map)(((net.minecraft.entity.EntityLiving)(life7_33)).a__Map())).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0)))))) != null))) {
        break forward_join_38;
    }
    forwardValue552_39_0 = 1;
    break forward_join_39;
    }
    forwardValue552_39_0 = 0;
    }
    return ((forwardValue552_39_0) != 0);
}


public com.moon.scripting.api.types.Potion[] get_active_effects(int p0) {
net.minecraft.client.multiplayer.WorldClient lexicalValue100_16_0;
    net.minecraft.entity.Entity lexicalValue100_25_0;
    com.moon.scripting.api.types.Potion[] lexicalValue100_65_0;
    net.minecraft.client.multiplayer.WorldClient spill100_0;
    net.minecraft.entity.Entity spill100_1;
    com.moon.scripting.api.types.Potion[] spill100_2;
    long life2_3;
    int life4_5;
    net.minecraft.entity.Entity life5_23;
    net.minecraft.entity.EntityLiving life6_37;
    java.util.Map life7_46;
    com.moon.scripting.api.types.Potion[] life8_50;
    int life9_52;
    java.util.Iterator life10_56;
    java.lang.Integer life11_63;
    lexical_join_65: {
    lexical_join_64: {
    lexical_join_31: {
    lexical_join_29: {
    lexical_join_25: {
    lexical_join_16: {
    lexical_join_14: {
    life2_3 = (com.moon.j5.c ^ 129169122163876L);
    life4_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill100_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life4_5 == 0))) {
        lexicalValue100_16_0 = spill100_0;
        break lexical_join_16;
    }
    if (!((spill100_0 == null))) {
        break lexical_join_14;
    }
    return new com.moon.scripting.api.types.Potion[0];
    }
    lexicalValue100_16_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    life5_23 = ((net.minecraft.client.multiplayer.WorldClient)(lexicalValue100_16_0)).a(((int)(p0)));
    spill100_1 = life5_23;
    if (!((life4_5 == 0))) {
        lexicalValue100_25_0 = spill100_1;
        break lexical_join_25;
    }
    if (!((((spill100_1 instanceof net.minecraft.entity.EntityLiving) ? 1 : 0) != 0))) {
        break lexical_join_29;
    }
    lexicalValue100_25_0 = life5_23;
    }
    life6_37 = ((net.minecraft.entity.EntityLiving)(lexicalValue100_25_0));
    if (!((life4_5 != 0))) {
        break lexical_join_31;
    }
    }
    return null;
    }
    life7_46 = ((net.minecraft.entity.EntityLiving)(life6_37)).a__Map();
    life8_50 = new com.moon.scripting.api.types.Potion[((java.util.Map)(life7_46)).size()];
    life9_52 = 0;
    life10_56 = ((java.util.Set)(((java.util.Map)(life7_46)).keySet())).iterator();
    lexical_cycle_44: while (true) {
    if (!(((java.util.Iterator)(life10_56)).hasNext())) {
        break lexical_join_64;
    }
    life11_63 = ((java.lang.Integer)(((java.util.Iterator)(life10_56)).next()));
    spill100_2 = life8_50;
    if (!((life4_5 == 0))) {
        lexicalValue100_65_0 = spill100_2;
        break lexical_join_65;
    }
    (spill100_2)[life9_52] = ((com.moon.j5)(this)).get_effect(((int)(p0)), ((int)(((java.lang.Integer)(life11_63)).intValue())));
    life9_52 += 1;
    if (!((life4_5 != 0))) { continue lexical_cycle_44; }
    break lexical_cycle_44;
    }
    }
    lexicalValue100_65_0 = life8_50;
    }
    return lexicalValue100_65_0;
}


public double get_position_y(int p0) {
net.minecraft.client.multiplayer.WorldClient forwardValue543_15_0;
    net.minecraft.entity.Entity forwardValue543_25_0;
    net.minecraft.client.multiplayer.WorldClient spill543_0;
    net.minecraft.entity.Entity spill543_1;
    long life2_3;
    int life4_5;
    net.minecraft.entity.Entity life5_22;
    forward_join_25: {
    forward_join_24: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (com.moon.j5.c ^ 11908653458300L);
    life4_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill543_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life4_5 != 0))) {
        forwardValue543_15_0 = spill543_0;
        break forward_join_15;
    }
    if (!((spill543_0 == null))) {
        break forward_join_13;
    }
    return 0x0.0p0d;
    }
    forwardValue543_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    life5_22 = ((net.minecraft.client.multiplayer.WorldClient)(forwardValue543_15_0)).a(((int)(p0)));
    spill543_1 = life5_22;
    if (!((life4_5 != 0))) {
        forwardValue543_25_0 = spill543_1;
        break forward_join_25;
    }
    if (!((spill543_1 == null))) {
        break forward_join_24;
    }
    return 0x0.0p0d;
    }
    forwardValue543_25_0 = life5_22;
    }
    return ((net.minecraft.entity.Entity)(forwardValue543_25_0)).o;
}


public boolean is_sneaking(int p0) {
net.minecraft.client.multiplayer.WorldClient forwardValue560_15_0;
    net.minecraft.entity.Entity forwardValue560_25_0;
    net.minecraft.client.multiplayer.WorldClient spill560_0;
    net.minecraft.entity.Entity spill560_1;
    long life2_3;
    int life4_5;
    net.minecraft.entity.Entity life5_22;
    forward_join_25: {
    forward_join_24: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (com.moon.j5.c ^ 89903346974966L);
    life4_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill560_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life4_5 == 0))) {
        forwardValue560_15_0 = spill560_0;
        break forward_join_15;
    }
    if (!((spill560_0 == null))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue560_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    life5_22 = ((net.minecraft.client.multiplayer.WorldClient)(forwardValue560_15_0)).a(((int)(p0)));
    spill560_1 = life5_22;
    if (!((life4_5 == 0))) {
        forwardValue560_25_0 = spill560_1;
        break forward_join_25;
    }
    if (!((spill560_1 == null))) {
        break forward_join_24;
    }
    return ((0) != 0);
    }
    forwardValue560_25_0 = life5_22;
    }
    return ((net.minecraft.entity.Entity)(forwardValue560_25_0)).t__Boolean();
}


public int get_hurt_time(int p0) {
net.minecraft.client.multiplayer.WorldClient forwardValue536_15_0;
    int forwardValue536_29_0;
    net.minecraft.client.multiplayer.WorldClient spill536_0;
    int spill536_1;
    long life2_3;
    int life4_5;
    net.minecraft.entity.Entity life5_22;
    net.minecraft.entity.EntityLivingBase life6_33;
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (com.moon.j5.c ^ 16982822432272L);
    life4_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill536_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life4_5 != 0))) {
        forwardValue536_15_0 = spill536_0;
        break forward_join_15;
    }
    if (!((spill536_0 == null))) {
        break forward_join_13;
    }
    return 0;
    }
    forwardValue536_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    life5_22 = ((net.minecraft.client.multiplayer.WorldClient)(forwardValue536_15_0)).a(((int)(p0)));
    spill536_1 = ((life5_22 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue536_29_0 = spill536_1;
        break forward_join_29;
    }
    if (!((spill536_1 != 0))) {
        break forward_join_28;
    }
    life6_33 = ((net.minecraft.entity.EntityLivingBase)(life5_22));
    if (!((life4_5 == 0))) {
        break forward_join_30;
    }
    }
    forwardValue536_29_0 = 0;
    }
    return forwardValue536_29_0;
    }
    return ((net.minecraft.entity.EntityLivingBase)(life6_33)).aO;
}


public boolean is_sprinting(int p0) {
net.minecraft.client.multiplayer.WorldClient forwardValue561_15_0;
    net.minecraft.entity.Entity forwardValue561_25_0;
    net.minecraft.client.multiplayer.WorldClient spill561_0;
    net.minecraft.entity.Entity spill561_1;
    long life2_3;
    int life4_5;
    net.minecraft.entity.Entity life5_22;
    forward_join_25: {
    forward_join_24: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (com.moon.j5.c ^ 9924907441481L);
    life4_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill561_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life4_5 == 0))) {
        forwardValue561_15_0 = spill561_0;
        break forward_join_15;
    }
    if (!((spill561_0 == null))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue561_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    life5_22 = ((net.minecraft.client.multiplayer.WorldClient)(forwardValue561_15_0)).a(((int)(p0)));
    spill561_1 = life5_22;
    if (!((life4_5 == 0))) {
        forwardValue561_25_0 = spill561_1;
        break forward_join_25;
    }
    if (!((spill561_1 == null))) {
        break forward_join_24;
    }
    return ((0) != 0);
    }
    forwardValue561_25_0 = life5_22;
    }
    return ((net.minecraft.entity.Entity)(forwardValue561_25_0)).u__Boolean();
}


public float get_yaw(int p0) {
net.minecraft.client.multiplayer.WorldClient forwardValue551_15_0;
    net.minecraft.entity.Entity forwardValue551_25_0;
    net.minecraft.client.multiplayer.WorldClient spill551_0;
    net.minecraft.entity.Entity spill551_1;
    long life2_3;
    int life4_5;
    net.minecraft.entity.Entity life5_22;
    forward_join_25: {
    forward_join_24: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (com.moon.j5.c ^ 119959885644669L);
    life4_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill551_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life4_5 != 0))) {
        forwardValue551_15_0 = spill551_0;
        break forward_join_15;
    }
    if (!((spill551_0 == null))) {
        break forward_join_13;
    }
    return 0x0.0p0f;
    }
    forwardValue551_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    life5_22 = ((net.minecraft.client.multiplayer.WorldClient)(forwardValue551_15_0)).a(((int)(p0)));
    spill551_1 = life5_22;
    if (!((life4_5 != 0))) {
        forwardValue551_25_0 = spill551_1;
        break forward_join_25;
    }
    if (!((spill551_1 == null))) {
        break forward_join_24;
    }
    return 0x0.0p0f;
    }
    forwardValue551_25_0 = life5_22;
    }
    return ((net.minecraft.entity.Entity)(forwardValue551_25_0)).w;
}


public double get_health(int p0) {
net.minecraft.client.multiplayer.WorldClient forwardValue533_15_0;
    net.minecraft.entity.Entity forwardValue533_24_0;
    net.minecraft.client.multiplayer.WorldClient spill533_0;
    net.minecraft.entity.Entity spill533_1;
    long life2_3;
    int life4_5;
    net.minecraft.entity.Entity life5_22;
    net.minecraft.entity.EntityLivingBase life6_36;
    forward_join_30: {
    forward_join_28: {
    forward_join_24: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (com.moon.j5.c ^ 25272311050571L);
    life4_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill533_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life4_5 == 0))) {
        forwardValue533_15_0 = spill533_0;
        break forward_join_15;
    }
    if (!((spill533_0 == null))) {
        break forward_join_13;
    }
    return 0x0.0p0d;
    }
    forwardValue533_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    life5_22 = ((net.minecraft.client.multiplayer.WorldClient)(forwardValue533_15_0)).a(((int)(p0)));
    spill533_1 = life5_22;
    if (!((life4_5 == 0))) {
        forwardValue533_24_0 = spill533_1;
        break forward_join_24;
    }
    if (!((((spill533_1 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0) != 0))) {
        break forward_join_28;
    }
    forwardValue533_24_0 = life5_22;
    }
    life6_36 = ((net.minecraft.entity.EntityLivingBase)(forwardValue533_24_0));
    if (!((life4_5 != 0))) {
        break forward_join_30;
    }
    }
    return 0x0.0p0d;
    }
    return ((double) ((net.minecraft.entity.EntityLivingBase)(life6_36)).b__sourceReturn_bc607678b6());
}


public double get_position_x(int p0) {
net.minecraft.client.multiplayer.WorldClient forwardValue542_15_0;
    net.minecraft.entity.Entity forwardValue542_25_0;
    net.minecraft.client.multiplayer.WorldClient spill542_0;
    net.minecraft.entity.Entity spill542_1;
    long life2_3;
    int life4_5;
    net.minecraft.entity.Entity life5_22;
    forward_join_25: {
    forward_join_24: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (com.moon.j5.c ^ 72263562788699L);
    life4_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill542_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life4_5 != 0))) {
        forwardValue542_15_0 = spill542_0;
        break forward_join_15;
    }
    if (!((spill542_0 == null))) {
        break forward_join_13;
    }
    return 0x0.0p0d;
    }
    forwardValue542_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    life5_22 = ((net.minecraft.client.multiplayer.WorldClient)(forwardValue542_15_0)).a(((int)(p0)));
    spill542_1 = life5_22;
    if (!((life4_5 != 0))) {
        forwardValue542_25_0 = spill542_1;
        break forward_join_25;
    }
    if (!((spill542_1 == null))) {
        break forward_join_24;
    }
    return 0x0.0p0d;
    }
    forwardValue542_25_0 = life5_22;
    }
    return ((net.minecraft.entity.Entity)(forwardValue542_25_0)).n;
}


public com.moon.scripting.api.types.Vec3d get_prev_position(int p0) {
net.minecraft.client.multiplayer.WorldClient forwardValue545_15_0;
    net.minecraft.client.multiplayer.WorldClient spill545_0;
    long life2_3;
    int life4_5;
    net.minecraft.entity.Entity life5_22;
    forward_join_22: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (com.moon.j5.c ^ 25917276515271L);
    life4_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill545_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life4_5 == 0))) {
        forwardValue545_15_0 = spill545_0;
        break forward_join_15;
    }
    if (!((spill545_0 == null))) {
        break forward_join_13;
    }
    return null;
    }
    forwardValue545_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    life5_22 = ((net.minecraft.client.multiplayer.WorldClient)(forwardValue545_15_0)).a(((int)(p0)));
    if (!((life5_22 == null))) {
        break forward_join_22;
    }
    return null;
    }
    return new com.moon.scripting.api.types.Vec3d(((net.minecraft.entity.Entity)(life5_22)).k, ((net.minecraft.entity.Entity)(life5_22)).l, ((net.minecraft.entity.Entity)(life5_22)).m);
}


public boolean is_riding(int p0) {
net.minecraft.client.multiplayer.WorldClient forwardValue559_15_0;
    net.minecraft.entity.Entity forwardValue559_25_0;
    net.minecraft.client.multiplayer.WorldClient spill559_0;
    net.minecraft.entity.Entity spill559_1;
    long life2_3;
    int life4_5;
    net.minecraft.entity.Entity life5_22;
    forward_join_25: {
    forward_join_24: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (com.moon.j5.c ^ 101135641643981L);
    life4_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill559_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life4_5 == 0))) {
        forwardValue559_15_0 = spill559_0;
        break forward_join_15;
    }
    if (!((spill559_0 == null))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue559_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    life5_22 = ((net.minecraft.client.multiplayer.WorldClient)(forwardValue559_15_0)).a(((int)(p0)));
    spill559_1 = life5_22;
    if (!((life4_5 == 0))) {
        forwardValue559_25_0 = spill559_1;
        break forward_join_25;
    }
    if (!((spill559_1 == null))) {
        break forward_join_24;
    }
    return ((0) != 0);
    }
    forwardValue559_25_0 = life5_22;
    }
    return ((net.minecraft.entity.Entity)(forwardValue559_25_0)).v__Boolean();
}


public int get_ticks_existed(int p0) {
net.minecraft.client.multiplayer.WorldClient forwardValue549_15_0;
    net.minecraft.entity.Entity forwardValue549_25_0;
    net.minecraft.client.multiplayer.WorldClient spill549_0;
    net.minecraft.entity.Entity spill549_1;
    long life2_3;
    int life4_5;
    net.minecraft.entity.Entity life5_22;
    forward_join_25: {
    forward_join_24: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (com.moon.j5.c ^ 38366566577313L);
    life4_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill549_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life4_5 != 0))) {
        forwardValue549_15_0 = spill549_0;
        break forward_join_15;
    }
    if (!((spill549_0 == null))) {
        break forward_join_13;
    }
    return 0;
    }
    forwardValue549_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    life5_22 = ((net.minecraft.client.multiplayer.WorldClient)(forwardValue549_15_0)).a(((int)(p0)));
    spill549_1 = life5_22;
    if (!((life4_5 != 0))) {
        forwardValue549_25_0 = spill549_1;
        break forward_join_25;
    }
    if (!((spill549_1 == null))) {
        break forward_join_24;
    }
    return 0;
    }
    forwardValue549_25_0 = life5_22;
    }
    return ((net.minecraft.entity.Entity)(forwardValue549_25_0)).S;
}


public int get_hurt_resistant_time(int p0) {
net.minecraft.client.multiplayer.WorldClient forwardValue535_15_0;
    int forwardValue535_29_0;
    net.minecraft.client.multiplayer.WorldClient spill535_0;
    int spill535_1;
    long life2_3;
    int life4_5;
    net.minecraft.entity.Entity life5_22;
    net.minecraft.entity.EntityLivingBase life6_33;
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (com.moon.j5.c ^ 99355815652398L);
    life4_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill535_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life4_5 != 0))) {
        forwardValue535_15_0 = spill535_0;
        break forward_join_15;
    }
    if (!((spill535_0 == null))) {
        break forward_join_13;
    }
    return 0;
    }
    forwardValue535_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    life5_22 = ((net.minecraft.client.multiplayer.WorldClient)(forwardValue535_15_0)).a(((int)(p0)));
    spill535_1 = ((life5_22 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue535_29_0 = spill535_1;
        break forward_join_29;
    }
    if (!((spill535_1 != 0))) {
        break forward_join_28;
    }
    life6_33 = ((net.minecraft.entity.EntityLivingBase)(life5_22));
    if (!((life4_5 == 0))) {
        break forward_join_30;
    }
    }
    forwardValue535_29_0 = 0;
    }
    return forwardValue535_29_0;
    }
    return ((net.minecraft.entity.EntityLivingBase)(life6_33)).U;
}


public double get_prev_position_z(int p0) {
net.minecraft.client.multiplayer.WorldClient forwardValue548_15_0;
    net.minecraft.entity.Entity forwardValue548_25_0;
    net.minecraft.client.multiplayer.WorldClient spill548_0;
    net.minecraft.entity.Entity spill548_1;
    long life2_3;
    int life4_5;
    net.minecraft.entity.Entity life5_22;
    forward_join_25: {
    forward_join_24: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (com.moon.j5.c ^ 1923578107332L);
    life4_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill548_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life4_5 != 0))) {
        forwardValue548_15_0 = spill548_0;
        break forward_join_15;
    }
    if (!((spill548_0 == null))) {
        break forward_join_13;
    }
    return 0x0.0p0d;
    }
    forwardValue548_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    life5_22 = ((net.minecraft.client.multiplayer.WorldClient)(forwardValue548_15_0)).a(((int)(p0)));
    spill548_1 = life5_22;
    if (!((life4_5 != 0))) {
        forwardValue548_25_0 = spill548_1;
        break forward_join_25;
    }
    if (!((spill548_1 == null))) {
        break forward_join_24;
    }
    return 0x0.0p0d;
    }
    forwardValue548_25_0 = life5_22;
    }
    return ((net.minecraft.entity.Entity)(forwardValue548_25_0)).m;
}


public double get_prev_position_y(int p0) {
net.minecraft.client.multiplayer.WorldClient forwardValue547_15_0;
    net.minecraft.entity.Entity forwardValue547_25_0;
    net.minecraft.client.multiplayer.WorldClient spill547_0;
    net.minecraft.entity.Entity spill547_1;
    long life2_3;
    int life4_5;
    net.minecraft.entity.Entity life5_22;
    forward_join_25: {
    forward_join_24: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (com.moon.j5.c ^ 78790042332891L);
    life4_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill547_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life4_5 == 0))) {
        forwardValue547_15_0 = spill547_0;
        break forward_join_15;
    }
    if (!((spill547_0 == null))) {
        break forward_join_13;
    }
    return 0x0.0p0d;
    }
    forwardValue547_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    life5_22 = ((net.minecraft.client.multiplayer.WorldClient)(forwardValue547_15_0)).a(((int)(p0)));
    spill547_1 = life5_22;
    if (!((life4_5 == 0))) {
        forwardValue547_25_0 = spill547_1;
        break forward_join_25;
    }
    if (!((spill547_1 == null))) {
        break forward_join_24;
    }
    return 0x0.0p0d;
    }
    forwardValue547_25_0 = life5_22;
    }
    return ((net.minecraft.entity.Entity)(forwardValue547_25_0)).l;
}


public double get_prev_position_x(int p0) {
net.minecraft.client.multiplayer.WorldClient forwardValue546_15_0;
    net.minecraft.entity.Entity forwardValue546_25_0;
    net.minecraft.client.multiplayer.WorldClient spill546_0;
    net.minecraft.entity.Entity spill546_1;
    long life2_3;
    int life4_5;
    net.minecraft.entity.Entity life5_22;
    forward_join_25: {
    forward_join_24: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (com.moon.j5.c ^ 88274885355506L);
    life4_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill546_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life4_5 != 0))) {
        forwardValue546_15_0 = spill546_0;
        break forward_join_15;
    }
    if (!((spill546_0 == null))) {
        break forward_join_13;
    }
    return 0x0.0p0d;
    }
    forwardValue546_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    life5_22 = ((net.minecraft.client.multiplayer.WorldClient)(forwardValue546_15_0)).a(((int)(p0)));
    spill546_1 = life5_22;
    if (!((life4_5 != 0))) {
        forwardValue546_25_0 = spill546_1;
        break forward_join_25;
    }
    if (!((spill546_1 == null))) {
        break forward_join_24;
    }
    return 0x0.0p0d;
    }
    forwardValue546_25_0 = life5_22;
    }
    return ((net.minecraft.entity.Entity)(forwardValue546_25_0)).k;
}


public java.lang.String held_item(int p0) {
net.minecraft.client.multiplayer.WorldClient forwardValue553_15_0;
    net.minecraft.entity.Entity forwardValue553_24_0;
    net.minecraft.client.multiplayer.WorldClient spill553_0;
    net.minecraft.entity.Entity spill553_1;
    long life2_3;
    int life4_5;
    net.minecraft.entity.Entity life5_22;
    net.minecraft.entity.player.EntityPlayer life6_36;
    forward_join_30: {
    forward_join_28: {
    forward_join_24: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (com.moon.j5.c ^ 137043669672576L);
    life4_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill553_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life4_5 == 0))) {
        forwardValue553_15_0 = spill553_0;
        break forward_join_15;
    }
    if (!((spill553_0 == null))) {
        break forward_join_13;
    }
    return "";
    }
    forwardValue553_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    life5_22 = ((net.minecraft.client.multiplayer.WorldClient)(forwardValue553_15_0)).a(((int)(p0)));
    spill553_1 = life5_22;
    if (!((life4_5 == 0))) {
        forwardValue553_24_0 = spill553_1;
        break forward_join_24;
    }
    if (!((((spill553_1 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0) != 0))) {
        break forward_join_28;
    }
    forwardValue553_24_0 = life5_22;
    }
    life6_36 = ((net.minecraft.entity.player.EntityPlayer)(forwardValue553_24_0));
    if (!((life4_5 != 0))) {
        break forward_join_30;
    }
    }
    return "";
    }
    return ((net.minecraft.item.ItemStack)(((net.minecraft.entity.player.EntityPlayer)(life6_36)).a__xW())).a__String();
}


public float get_width(int p0) {
net.minecraft.client.multiplayer.WorldClient forwardValue550_15_0;
    net.minecraft.entity.Entity forwardValue550_25_0;
    net.minecraft.client.multiplayer.WorldClient spill550_0;
    net.minecraft.entity.Entity spill550_1;
    long life2_3;
    int life4_5;
    net.minecraft.entity.Entity life5_22;
    forward_join_25: {
    forward_join_24: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (com.moon.j5.c ^ 31513650730983L);
    life4_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill550_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life4_5 != 0))) {
        forwardValue550_15_0 = spill550_0;
        break forward_join_15;
    }
    if (!((spill550_0 == null))) {
        break forward_join_13;
    }
    return 0x0.0p0f;
    }
    forwardValue550_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    life5_22 = ((net.minecraft.client.multiplayer.WorldClient)(forwardValue550_15_0)).a(((int)(p0)));
    spill550_1 = life5_22;
    if (!((life4_5 != 0))) {
        forwardValue550_25_0 = spill550_1;
        break forward_join_25;
    }
    if (!((spill550_1 == null))) {
        break forward_join_24;
    }
    return 0x0.0p0f;
    }
    forwardValue550_25_0 = life5_22;
    }
    return ((net.minecraft.entity.Entity)(forwardValue550_25_0)).G;
}


public java.lang.String get_biome() {
net.minecraft.client.multiplayer.WorldClient forwardValue526_15_0;
    net.minecraft.client.multiplayer.WorldClient spill526_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j5.c ^ 123201982145871L);
    life3_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill526_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life3_5 == 0))) {
        forwardValue526_15_0 = spill526_0;
        break forward_join_15;
    }
    if (!((spill526_0 == null))) {
        break forward_join_13;
    }
    return null;
    }
    forwardValue526_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    return ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.client.multiplayer.WorldClient)(forwardValue526_15_0)).a__ES(((moom.DT)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.j5.a)).K)).bT))))).aj;
}


public boolean is_invisible(int p0) {
net.minecraft.client.multiplayer.WorldClient forwardValue557_15_0;
    net.minecraft.entity.Entity forwardValue557_25_0;
    net.minecraft.client.multiplayer.WorldClient spill557_0;
    net.minecraft.entity.Entity spill557_1;
    long life2_3;
    int life4_5;
    net.minecraft.entity.Entity life5_22;
    forward_join_25: {
    forward_join_24: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (com.moon.j5.c ^ 82614197866841L);
    life4_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill557_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life4_5 != 0))) {
        forwardValue557_15_0 = spill557_0;
        break forward_join_15;
    }
    if (!((spill557_0 == null))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue557_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    life5_22 = ((net.minecraft.client.multiplayer.WorldClient)(forwardValue557_15_0)).a(((int)(p0)));
    spill557_1 = life5_22;
    if (!((life4_5 != 0))) {
        forwardValue557_25_0 = spill557_1;
        break forward_join_25;
    }
    if (!((spill557_1 == null))) {
        break forward_join_24;
    }
    return ((0) != 0);
    }
    forwardValue557_25_0 = life5_22;
    }
    return ((net.minecraft.entity.Entity)(forwardValue557_25_0)).v__Boolean();
}


public boolean is_bot(int p0) {
net.minecraft.client.multiplayer.WorldClient forwardValue554_15_0;
    com.moon.module.impl.AntiBot forwardValue554_36_0;
    net.minecraft.client.multiplayer.WorldClient spill554_0;
    com.moon.module.impl.AntiBot spill554_1;
    long life2_3;
    int life4_5;
    net.minecraft.entity.Entity life5_22;
    forward_join_36: {
    forward_join_34: {
    forward_join_22: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (com.moon.j5.c ^ 58676193089147L);
    life4_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill554_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life4_5 != 0))) {
        forwardValue554_15_0 = spill554_0;
        break forward_join_15;
    }
    if (!((spill554_0 == null))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue554_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    life5_22 = ((net.minecraft.client.multiplayer.WorldClient)(forwardValue554_15_0)).a(((int)(p0)));
    if (!((life5_22 == null))) {
        break forward_join_22;
    }
    return ((0) != 0);
    }
    spill554_1 = this.b;
    if (!((life4_5 != 0))) {
        forwardValue554_36_0 = spill554_1;
        break forward_join_36;
    }
    if (!((spill554_1 == null))) {
        break forward_join_34;
    }
    this.b = ((com.moon.module.impl.AntiBot)(((com.moon.module.impl.AntiBot)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.AntiBot.class)))))));
    }
    forwardValue554_36_0 = this.b;
    }
    return ((com.moon.module.impl.AntiBot)(forwardValue554_36_0)).a(((int)(p0)));
}


public int[] get_entities() {
net.minecraft.client.multiplayer.WorldClient lexicalValue101_16_0;
    int[] lexicalValue101_44_0;
    net.minecraft.client.multiplayer.WorldClient spill101_0;
    int[] spill101_1;
    long life1_3;
    int life3_5;
    java.util.List life4_22;
    int[] life5_26;
    int life6_28;
    net.minecraft.entity.Entity life7_37;
    lexical_join_44: {
    lexical_join_43: {
    lexical_join_16: {
    lexical_join_14: {
    life1_3 = (com.moon.j5.c ^ 24159055506485L);
    life3_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill101_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life3_5 == 0))) {
        lexicalValue101_16_0 = spill101_0;
        break lexical_join_16;
    }
    if (!((spill101_0 == null))) {
        break lexical_join_14;
    }
    return new int[0];
    }
    lexicalValue101_16_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    life4_22 = ((net.minecraft.client.multiplayer.WorldClient)(lexicalValue101_16_0)).c;
    life5_26 = new int[((java.util.List)(life4_22)).size()];
    life6_28 = 0;
    lexical_cycle_24: while (true) {
    if (!((life6_28 < ((java.util.List)(life4_22)).size()))) {
        break lexical_join_43;
    }
    life7_37 = ((net.minecraft.entity.Entity)(((java.util.List)(life4_22)).get(((int)(life6_28)))));
    spill101_1 = life5_26;
    if (!((life3_5 == 0))) {
        lexicalValue101_44_0 = spill101_1;
        break lexical_join_44;
    }
    (spill101_1)[life6_28] = ((net.minecraft.entity.Entity)(life7_37)).e__Int();
    life6_28 += 1;
    if (!((life3_5 != 0))) { continue lexical_cycle_24; }
    break lexical_cycle_24;
    }
    }
    lexicalValue101_44_0 = life5_26;
    }
    return lexicalValue101_44_0;
}


public boolean is_target(int p0) {
net.minecraft.client.multiplayer.WorldClient forwardValue562_15_0;
    int forwardValue562_29_0;
    net.minecraft.client.multiplayer.WorldClient spill562_0;
    int spill562_1;
    long life2_3;
    int life4_5;
    net.minecraft.entity.Entity life5_22;
    net.minecraft.entity.player.EntityPlayer life6_33;
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (com.moon.j5.c ^ 97030837068096L);
    life4_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill562_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life4_5 != 0))) {
        forwardValue562_15_0 = spill562_0;
        break forward_join_15;
    }
    if (!((spill562_0 == null))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue562_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    life5_22 = ((net.minecraft.client.multiplayer.WorldClient)(forwardValue562_15_0)).a(((int)(p0)));
    spill562_1 = ((life5_22 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue562_29_0 = spill562_1;
        break forward_join_29;
    }
    if (!((spill562_1 != 0))) {
        break forward_join_28;
    }
    life6_33 = ((net.minecraft.entity.player.EntityPlayer)(life5_22));
    if (!((life4_5 == 0))) {
        break forward_join_30;
    }
    }
    forwardValue562_29_0 = 0;
    }
    return ((forwardValue562_29_0) != 0);
    }
    return ((com.moon.ml)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__ml())).a__Boolean(((net.minecraft.entity.player.EntityPlayer)(life6_33)));
}


public boolean is_player(int p0) {
net.minecraft.client.multiplayer.WorldClient forwardValue558_15_0;
    net.minecraft.client.multiplayer.WorldClient spill558_0;
    long life2_3;
    int life4_5;
    net.minecraft.entity.Entity life5_22;
    forward_join_15: {
    forward_join_13: {
    life2_3 = (com.moon.j5.c ^ 75524708803360L);
    life4_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill558_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life4_5 != 0))) {
        forwardValue558_15_0 = spill558_0;
        break forward_join_15;
    }
    if (!((spill558_0 == null))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue558_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    life5_22 = ((net.minecraft.client.multiplayer.WorldClient)(forwardValue558_15_0)).a(((int)(p0)));
    return ((((life5_22 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0)) != 0);
}


public float get_height(int p0) {
net.minecraft.client.multiplayer.WorldClient forwardValue534_15_0;
    net.minecraft.entity.Entity forwardValue534_25_0;
    net.minecraft.client.multiplayer.WorldClient spill534_0;
    net.minecraft.entity.Entity spill534_1;
    long life2_3;
    int life4_5;
    net.minecraft.entity.Entity life5_22;
    forward_join_25: {
    forward_join_24: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (com.moon.j5.c ^ 14107809248888L);
    life4_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill534_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life4_5 == 0))) {
        forwardValue534_15_0 = spill534_0;
        break forward_join_15;
    }
    if (!((spill534_0 == null))) {
        break forward_join_13;
    }
    return 0x0.0p0f;
    }
    forwardValue534_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    life5_22 = ((net.minecraft.client.multiplayer.WorldClient)(forwardValue534_15_0)).a(((int)(p0)));
    spill534_1 = life5_22;
    if (!((life4_5 == 0))) {
        forwardValue534_25_0 = spill534_1;
        break forward_join_25;
    }
    if (!((spill534_1 == null))) {
        break forward_join_24;
    }
    return 0x0.0p0f;
    }
    forwardValue534_25_0 = life5_22;
    }
    return ((net.minecraft.entity.Entity)(forwardValue534_25_0)).H;
}


public int[] get_players() {
net.minecraft.client.multiplayer.WorldClient lexicalValue102_16_0;
    int[] lexicalValue102_44_0;
    net.minecraft.client.multiplayer.WorldClient spill102_0;
    int[] spill102_1;
    long life1_3;
    int life3_5;
    java.util.List life4_22;
    int[] life5_26;
    int life6_28;
    net.minecraft.entity.Entity life7_37;
    lexical_join_44: {
    lexical_join_43: {
    lexical_join_16: {
    lexical_join_14: {
    life1_3 = (com.moon.j5.c ^ 61835449933031L);
    life3_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill102_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life3_5 != 0))) {
        lexicalValue102_16_0 = spill102_0;
        break lexical_join_16;
    }
    if (!((spill102_0 == null))) {
        break lexical_join_14;
    }
    return new int[0];
    }
    lexicalValue102_16_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    life4_22 = ((net.minecraft.client.multiplayer.WorldClient)(lexicalValue102_16_0)).i;
    life5_26 = new int[((java.util.List)(life4_22)).size()];
    life6_28 = 0;
    lexical_cycle_24: while (true) {
    if (!((life6_28 < ((java.util.List)(life4_22)).size()))) {
        break lexical_join_43;
    }
    life7_37 = ((net.minecraft.entity.Entity)(((java.util.List)(life4_22)).get(((int)(life6_28)))));
    spill102_1 = life5_26;
    if (!((life3_5 != 0))) {
        lexicalValue102_44_0 = spill102_1;
        break lexical_join_44;
    }
    (spill102_1)[life6_28] = ((net.minecraft.entity.Entity)(life7_37)).e__Int();
    life6_28 += 1;
    if (!((life3_5 == 0))) { continue lexical_cycle_24; }
    break lexical_cycle_24;
    }
    }
    lexicalValue102_44_0 = life5_26;
    }
    return lexicalValue102_44_0;
}


public com.moon.scripting.api.types.Block get_block_at_vec(com.moon.scripting.api.types.Vec3d p0) {
net.minecraft.client.Minecraft forwardValue528_12_0;
    net.minecraft.block.state.IBlockState forwardValue528_38_0;
    net.minecraft.client.Minecraft spill528_0;
    net.minecraft.block.state.IBlockState spill528_1;
    long life2_3;
    int life4_5;
    moom.DT life5_33;
    net.minecraft.block.state.IBlockState life6_38;
    net.minecraft.block.Block life7_52;
    forward_join_44: {
    forward_join_38: {
    forward_join_37: {
    forward_join_16: {
    forward_join_14: {
    forward_join_12: {
    life2_3 = (com.moon.j5.c ^ 47509109695692L);
    life4_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill528_0 = com.moon.j5.a;
    if (!((life4_5 == 0))) {
        forwardValue528_12_0 = spill528_0;
        break forward_join_12;
    }
    if (!((((net.minecraft.client.Minecraft)(spill528_0)).I != null))) {
        break forward_join_14;
    }
    forwardValue528_12_0 = com.moon.j5.a;
    }
    if (!((((net.minecraft.client.Minecraft)(forwardValue528_12_0)).K == null))) {
        break forward_join_16;
    }
    }
    return null;
    }
    life5_33 = new moom.DT(((com.moon.scripting.api.types.Vec3d)(p0)).x, ((com.moon.scripting.api.types.Vec3d)(p0)).y, ((com.moon.scripting.api.types.Vec3d)(p0)).z);
    life6_38 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.j5.a)).I)).a__fE(((moom.DT)(life5_33)));
    spill528_1 = life6_38;
    if (!((life4_5 == 0))) {
        forwardValue528_38_0 = spill528_1;
        break forward_join_38;
    }
    if (!((spill528_1 == null))) {
        break forward_join_37;
    }
    return null;
    }
    forwardValue528_38_0 = life6_38;
    }
    life7_52 = ((net.minecraft.block.state.IBlockState)(forwardValue528_38_0)).a__ch();
    if (!((life7_52 == null))) {
        break forward_join_44;
    }
    return null;
    }
    return new com.moon.scripting.api.types.Block(((net.minecraft.block.Block)(life7_52)).b__String(), ((net.minecraft.block.Block)(life7_52)).a__String(), ((net.minecraft.block.Block)(life7_52)).a__Boolean(), ((net.minecraft.block.Block)(life7_52)).b__Boolean(), ((net.minecraft.block.Block)(life7_52)).a(((net.minecraft.world.World)(((net.minecraft.client.Minecraft)(com.moon.j5.a)).I)), ((moom.DT)(life5_33))), ((net.minecraft.block.Block)(life7_52)).a(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(com.moon.j5.a)).K)), ((net.minecraft.world.World)(((net.minecraft.client.Minecraft)(com.moon.j5.a)).I)), ((moom.DT)(life5_33))), ((net.minecraft.block.Block)(life7_52)).L);
}


public java.lang.String get_display_name(int p0) {
net.minecraft.client.multiplayer.WorldClient forwardValue529_15_0;
    net.minecraft.entity.Entity forwardValue529_25_0;
    net.minecraft.client.multiplayer.WorldClient spill529_0;
    net.minecraft.entity.Entity spill529_1;
    long life2_3;
    int life4_5;
    net.minecraft.entity.Entity life5_22;
    forward_join_25: {
    forward_join_24: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (com.moon.j5.c ^ 84169054263495L);
    life4_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill529_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life4_5 != 0))) {
        forwardValue529_15_0 = spill529_0;
        break forward_join_15;
    }
    if (!((spill529_0 == null))) {
        break forward_join_13;
    }
    return null;
    }
    forwardValue529_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    life5_22 = ((net.minecraft.client.multiplayer.WorldClient)(forwardValue529_15_0)).a(((int)(p0)));
    spill529_1 = life5_22;
    if (!((life4_5 != 0))) {
        forwardValue529_25_0 = spill529_1;
        break forward_join_25;
    }
    if (!((spill529_1 == null))) {
        break forward_join_24;
    }
    return null;
    }
    forwardValue529_25_0 = life5_22;
    }
    return ((net.minecraft.util.IChatComponent)(((net.minecraft.entity.Entity)(forwardValue529_25_0)).a__C5())).b();
}


public boolean is_friend(int p0) {
net.minecraft.client.multiplayer.WorldClient forwardValue556_15_0;
    int forwardValue556_29_0;
    net.minecraft.client.multiplayer.WorldClient spill556_0;
    int spill556_1;
    long life2_3;
    int life4_5;
    net.minecraft.entity.Entity life5_22;
    net.minecraft.entity.player.EntityPlayer life6_33;
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (com.moon.j5.c ^ 79591236193798L);
    life4_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill556_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    if (!((life4_5 != 0))) {
        forwardValue556_15_0 = spill556_0;
        break forward_join_15;
    }
    if (!((spill556_0 == null))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue556_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j5.a)).I;
    }
    life5_22 = ((net.minecraft.client.multiplayer.WorldClient)(forwardValue556_15_0)).a(((int)(p0)));
    spill556_1 = ((life5_22 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue556_29_0 = spill556_1;
        break forward_join_29;
    }
    if (!((spill556_1 != 0))) {
        break forward_join_28;
    }
    life6_33 = ((net.minecraft.entity.player.EntityPlayer)(life5_22));
    if (!((life4_5 == 0))) {
        break forward_join_30;
    }
    }
    forwardValue556_29_0 = 0;
    }
    return ((forwardValue556_29_0) != 0);
    }
    return ((com.moon.eV)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__eV())).a__Boolean(((net.minecraft.entity.player.EntityPlayer)(life6_33)));
}


public com.moon.scripting.api.types.Block get_block_at(double p0, double p1, double p2) {
net.minecraft.client.Minecraft forwardValue527_12_0;
    net.minecraft.block.state.IBlockState forwardValue527_35_0;
    net.minecraft.client.Minecraft spill527_0;
    net.minecraft.block.state.IBlockState spill527_1;
    long life7_3;
    int life9_5;
    moom.DT life10_30;
    net.minecraft.block.state.IBlockState life11_35;
    net.minecraft.block.Block life12_49;
    forward_join_41: {
    forward_join_35: {
    forward_join_34: {
    forward_join_16: {
    forward_join_14: {
    forward_join_12: {
    life7_3 = (com.moon.j5.c ^ 130279656845816L);
    life9_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill527_0 = com.moon.j5.a;
    if (!((life9_5 != 0))) {
        forwardValue527_12_0 = spill527_0;
        break forward_join_12;
    }
    if (!((((net.minecraft.client.Minecraft)(spill527_0)).I != null))) {
        break forward_join_14;
    }
    forwardValue527_12_0 = com.moon.j5.a;
    }
    if (!((((net.minecraft.client.Minecraft)(forwardValue527_12_0)).K == null))) {
        break forward_join_16;
    }
    }
    return null;
    }
    life10_30 = new moom.DT(p0, p1, p2);
    life11_35 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.j5.a)).I)).a__fE(((moom.DT)(life10_30)));
    spill527_1 = life11_35;
    if (!((life9_5 != 0))) {
        forwardValue527_35_0 = spill527_1;
        break forward_join_35;
    }
    if (!((spill527_1 == null))) {
        break forward_join_34;
    }
    return null;
    }
    forwardValue527_35_0 = life11_35;
    }
    life12_49 = ((net.minecraft.block.state.IBlockState)(forwardValue527_35_0)).a__ch();
    if (!((life12_49 == null))) {
        break forward_join_41;
    }
    return null;
    }
    return new com.moon.scripting.api.types.Block(((net.minecraft.block.Block)(life12_49)).b__String(), ((net.minecraft.block.Block)(life12_49)).a__String(), ((net.minecraft.block.Block)(life12_49)).a__Boolean(), ((net.minecraft.block.Block)(life12_49)).b__Boolean(), ((net.minecraft.block.Block)(life12_49)).a(((net.minecraft.world.World)(((net.minecraft.client.Minecraft)(com.moon.j5.a)).I)), ((moom.DT)(life10_30))), ((net.minecraft.block.Block)(life12_49)).a(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(com.moon.j5.a)).K)), ((net.minecraft.world.World)(((net.minecraft.client.Minecraft)(com.moon.j5.a)).I)), ((moom.DT)(life10_30))), ((net.minecraft.block.Block)(life12_49)).L);
}

}
