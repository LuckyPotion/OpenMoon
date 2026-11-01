package moom;


public class BF extends moom.BD<com.mojang.authlib.GameProfile, moom.BN> {

private static final long g;

public BF(java.io.File p0) {
super(p0);
}


static {
moom.BF.g = (moom._c.a(1790202593356272980L, -3156273090154224540L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(41338944199686L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected java.lang.String a(com.mojang.authlib.GameProfile p0) {
return ((java.util.UUID)(((com.mojang.authlib.GameProfile)(p0)).getId())).toString();
}


protected net.minecraft.server.management.UserListEntry<com.mojang.authlib.GameProfile> a(com.google.gson.JsonObject p0) {
return new moom.BN(p0);
}


protected java.lang.String a__sourceBridge_8a030586a9(java.lang.Object p0) {
return ((moom.BF)(this)).a(((com.mojang.authlib.GameProfile)(((com.mojang.authlib.GameProfile)(p0)))));
}


public com.mojang.authlib.GameProfile a(java.lang.String p0) {
java.lang.Object lexicalValue494_29_0;
    boolean spill494_0;
    java.lang.String spill494_1;
    long life2_3;
    java.util.Iterator life5_9;
    int life4_10;
    moom.BN life6_17;
    lexical_join_33: {
    life2_3 = (moom.BF.g ^ 18965451421631L);
    spill494_0 = net.minecraft.server.management.ServerConfigurationManager.b__Boolean();
    life5_9 = ((java.util.Collection)(((java.util.Map)(((moom.BF)(this)).a())).values())).iterator();
    life4_10 = ((spill494_0) ? 1 : 0);
    lexical_cycle_11: while (true) {
    lexical_join_31: {
    lexical_join_29: {
    if (!(((java.util.Iterator)(life5_9)).hasNext())) {
        break lexical_join_33;
    }
    life6_17 = ((moom.BN)(((java.util.Iterator)(life5_9)).next()));
    spill494_1 = p0;
    if (!((life4_10 == 0))) {
        lexicalValue494_29_0 = spill494_1;
        break lexical_join_29;
    }
    if (!(((java.lang.String)(spill494_1)).equalsIgnoreCase(((java.lang.String)(((com.mojang.authlib.GameProfile)(((com.mojang.authlib.GameProfile)(((moom.BN)(life6_17)).a())))).getName()))))) {
        break lexical_join_31;
    }
    lexicalValue494_29_0 = ((moom.BN)(life6_17)).a();
    }
    return ((com.mojang.authlib.GameProfile)(lexicalValue494_29_0));
    }
    if (!((life4_10 != 0))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    return null;
}


public boolean a__Boolean(com.mojang.authlib.GameProfile p0) {
return (__sourceIntrinsic_booleanComparison((((moom.BF)(this)).a__Boolean(((p0))))) != 0);
}


public java.lang.String[] a__ArrayString() {
java.lang.String[] lexicalValue495_38_0;
    boolean spill495_0;
    java.lang.String[] spill495_1;
    long life1_3;
    java.lang.String[] life4_9;
    int life5_11;
    int life3_12;
    java.util.Iterator life6_17;
    moom.BN life7_24;
    lexical_join_38: {
    lexical_join_37: {
    life1_3 = (moom.BF.g ^ 16637164774990L);
    spill495_0 = net.minecraft.server.management.ServerConfigurationManager.c__Boolean();
    life4_9 = new java.lang.String[((java.util.Map)(((moom.BF)(this)).a())).size()];
    life5_11 = 0;
    life3_12 = ((spill495_0) ? 1 : 0);
    life6_17 = ((java.util.Collection)(((java.util.Map)(((moom.BF)(this)).a())).values())).iterator();
    lexical_cycle_18: while (true) {
    if (!(((java.util.Iterator)(life6_17)).hasNext())) {
        break lexical_join_37;
    }
    life7_24 = ((moom.BN)(((java.util.Iterator)(life6_17)).next()));
    spill495_1 = life4_9;
    if (!((life3_12 != 0))) {
        lexicalValue495_38_0 = spill495_1;
        break lexical_join_38;
    }
    (spill495_1)[(life5_11++)] = ((com.mojang.authlib.GameProfile)(((com.mojang.authlib.GameProfile)(((moom.BN)(life7_24)).a())))).getName();
    if (!((life3_12 == 0))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    lexicalValue495_38_0 = life4_9;
    }
    return lexicalValue495_38_0;
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
