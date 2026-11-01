package moom;


public class BG extends moom.BD<com.mojang.authlib.GameProfile, moom.BO> {

private static final long g;

public BG(java.io.File p0) {
super(p0);
}


static {
moom.BG.g = (moom._c.a(-1580439925892518309L, -6059694535970756616L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(50546897951210L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected java.lang.String a(com.mojang.authlib.GameProfile p0) {
return ((java.util.UUID)(((com.mojang.authlib.GameProfile)(p0)).getId())).toString();
}


protected net.minecraft.server.management.UserListEntry<com.mojang.authlib.GameProfile> a(com.google.gson.JsonObject p0) {
return new moom.BO(p0);
}


protected java.lang.String a__sourceBridge_8a030586a9(java.lang.Object p0) {
return ((moom.BG)(this)).a(((com.mojang.authlib.GameProfile)(((com.mojang.authlib.GameProfile)(p0)))));
}


public com.mojang.authlib.GameProfile a(java.lang.String p0) {
java.lang.Object lexicalValue496_29_0;
    boolean spill496_0;
    java.lang.String spill496_1;
    long life2_3;
    java.util.Iterator life5_9;
    int life4_10;
    moom.BO life6_17;
    lexical_join_33: {
    life2_3 = (moom.BG.g ^ 37816224531427L);
    spill496_0 = net.minecraft.server.management.ServerConfigurationManager.b__Boolean();
    life5_9 = ((java.util.Collection)(((java.util.Map)(((moom.BG)(this)).a())).values())).iterator();
    life4_10 = ((spill496_0) ? 1 : 0);
    lexical_cycle_11: while (true) {
    lexical_join_31: {
    lexical_join_29: {
    if (!(((java.util.Iterator)(life5_9)).hasNext())) {
        break lexical_join_33;
    }
    life6_17 = ((moom.BO)(((java.util.Iterator)(life5_9)).next()));
    spill496_1 = p0;
    if (!((life4_10 == 0))) {
        lexicalValue496_29_0 = spill496_1;
        break lexical_join_29;
    }
    if (!(((java.lang.String)(spill496_1)).equalsIgnoreCase(((java.lang.String)(((com.mojang.authlib.GameProfile)(((com.mojang.authlib.GameProfile)(((moom.BO)(life6_17)).a())))).getName()))))) {
        break lexical_join_31;
    }
    lexicalValue496_29_0 = ((moom.BO)(life6_17)).a();
    }
    return ((com.mojang.authlib.GameProfile)(lexicalValue496_29_0));
    }
    if (!((life4_10 != 0))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    return null;
}


public java.lang.String[] a__ArrayString() {
java.lang.String[] lexicalValue497_38_0;
    boolean spill497_0;
    java.lang.String[] spill497_1;
    long life1_3;
    java.lang.String[] life4_8;
    int life5_11;
    int life3_12;
    java.util.Iterator life6_17;
    moom.BO life7_24;
    lexical_join_38: {
    lexical_join_37: {
    life1_3 = (moom.BG.g ^ 31700261695242L);
    life4_8 = new java.lang.String[((java.util.Map)(((moom.BG)(this)).a())).size()];
    spill497_0 = net.minecraft.server.management.ServerConfigurationManager.b__Boolean();
    life5_11 = 0;
    life3_12 = ((spill497_0) ? 1 : 0);
    life6_17 = ((java.util.Collection)(((java.util.Map)(((moom.BG)(this)).a())).values())).iterator();
    lexical_cycle_18: while (true) {
    if (!(((java.util.Iterator)(life6_17)).hasNext())) {
        break lexical_join_37;
    }
    life7_24 = ((moom.BO)(((java.util.Iterator)(life6_17)).next()));
    spill497_1 = life4_8;
    if (!((life3_12 == 0))) {
        lexicalValue497_38_0 = spill497_1;
        break lexical_join_38;
    }
    (spill497_1)[(life5_11++)] = ((com.mojang.authlib.GameProfile)(((com.mojang.authlib.GameProfile)(((moom.BO)(life7_24)).a())))).getName();
    if (!((life3_12 != 0))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    lexicalValue497_38_0 = life4_8;
    }
    return lexicalValue497_38_0;
}


public boolean a__Boolean(com.mojang.authlib.GameProfile p0) {
moom.BO forwardValue1493_16_0;
    int forwardValue1493_21_0;
    int forwardValue1493_23_0;
    boolean spill1493_0;
    moom.BO spill1493_1;
    boolean spill1493_2;
    long life2_3;
    moom.BO life5_9;
    int life4_10;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_16: {
    life2_3 = (moom.BG.g ^ 88558274228764L);
    spill1493_0 = net.minecraft.server.management.ServerConfigurationManager.c__Boolean();
    life5_9 = ((moom.BO)(((moom.BG)(this)).a__BK(((p0)))));
    life4_10 = ((spill1493_0) ? 1 : 0);
    spill1493_1 = life5_9;
    if (!((life4_10 != 0))) {
        forwardValue1493_16_0 = spill1493_1;
        break forward_join_16;
    }
    if (!((spill1493_1 != null))) {
        break forward_join_22;
    }
    forwardValue1493_16_0 = life5_9;
    }
    spill1493_2 = ((moom.BO)(forwardValue1493_16_0)).b();
    if (!((life4_10 != 0))) {
        forwardValue1493_21_0 = ((spill1493_2) ? 1 : 0);
        break forward_join_21;
    }
    if (!(spill1493_2)) {
        break forward_join_22;
    }
    forwardValue1493_21_0 = 1;
    }
    forwardValue1493_23_0 = forwardValue1493_21_0;
    break forward_join_23;
    }
    forwardValue1493_23_0 = 0;
    }
    return ((forwardValue1493_23_0) != 0);
}

}
