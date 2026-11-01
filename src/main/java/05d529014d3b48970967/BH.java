package moom;


public class BH extends moom.BD<com.mojang.authlib.GameProfile, moom.BP> {

private static final long g;

public BH(java.io.File p0) {
super(p0);
}


static {
moom.BH.g = (moom._c.a(9080757883462450358L, -6493710606991713428L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(228579050218559L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public com.mojang.authlib.GameProfile a(java.lang.String p0) {
java.lang.Object lexicalValue498_29_0;
    boolean spill498_0;
    java.lang.String spill498_1;
    long life2_3;
    java.util.Iterator life5_9;
    int life4_10;
    moom.BP life6_17;
    lexical_join_33: {
    life2_3 = (moom.BH.g ^ 50731558827182L);
    spill498_0 = net.minecraft.server.management.ServerConfigurationManager.b__Boolean();
    life5_9 = ((java.util.Collection)(((java.util.Map)(((moom.BH)(this)).a())).values())).iterator();
    life4_10 = ((spill498_0) ? 1 : 0);
    lexical_cycle_11: while (true) {
    lexical_join_31: {
    lexical_join_29: {
    if (!(((java.util.Iterator)(life5_9)).hasNext())) {
        break lexical_join_33;
    }
    life6_17 = ((moom.BP)(((java.util.Iterator)(life5_9)).next()));
    spill498_1 = p0;
    if (!((life4_10 == 0))) {
        lexicalValue498_29_0 = spill498_1;
        break lexical_join_29;
    }
    if (!(((java.lang.String)(spill498_1)).equalsIgnoreCase(((java.lang.String)(((com.mojang.authlib.GameProfile)(((com.mojang.authlib.GameProfile)(((moom.BP)(life6_17)).a())))).getName()))))) {
        break lexical_join_31;
    }
    lexicalValue498_29_0 = ((moom.BP)(life6_17)).a();
    }
    return ((com.mojang.authlib.GameProfile)(lexicalValue498_29_0));
    }
    if (!((life4_10 != 0))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    return null;
}


protected net.minecraft.server.management.UserListEntry<com.mojang.authlib.GameProfile> a(com.google.gson.JsonObject p0) {
return new moom.BP(p0);
}


protected java.lang.String a__sourceBridge_8a030586a9(java.lang.Object p0) {
return ((moom.BH)(this)).a(((com.mojang.authlib.GameProfile)(((com.mojang.authlib.GameProfile)(p0)))));
}


public java.lang.String[] a__ArrayString() {
java.lang.String[] lexicalValue499_38_0;
    boolean spill499_0;
    java.lang.String[] spill499_1;
    long life1_3;
    java.lang.String[] life4_9;
    int life5_11;
    java.util.Iterator life6_16;
    int life3_17;
    moom.BP life7_24;
    lexical_join_38: {
    lexical_join_37: {
    life1_3 = (moom.BH.g ^ 106802803023274L);
    spill499_0 = net.minecraft.server.management.ServerConfigurationManager.c__Boolean();
    life4_9 = new java.lang.String[((java.util.Map)(((moom.BH)(this)).a())).size()];
    life5_11 = 0;
    life6_16 = ((java.util.Collection)(((java.util.Map)(((moom.BH)(this)).a())).values())).iterator();
    life3_17 = ((spill499_0) ? 1 : 0);
    lexical_cycle_18: while (true) {
    if (!(((java.util.Iterator)(life6_16)).hasNext())) {
        break lexical_join_37;
    }
    life7_24 = ((moom.BP)(((java.util.Iterator)(life6_16)).next()));
    spill499_1 = life4_9;
    if (!((life3_17 != 0))) {
        lexicalValue499_38_0 = spill499_1;
        break lexical_join_38;
    }
    (spill499_1)[(life5_11++)] = ((com.mojang.authlib.GameProfile)(((com.mojang.authlib.GameProfile)(((moom.BP)(life7_24)).a())))).getName();
    if (!((life3_17 == 0))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    lexicalValue499_38_0 = life4_9;
    }
    return lexicalValue499_38_0;
}


protected java.lang.String a(com.mojang.authlib.GameProfile p0) {
return ((java.util.UUID)(((com.mojang.authlib.GameProfile)(p0)).getId())).toString();
}

}
