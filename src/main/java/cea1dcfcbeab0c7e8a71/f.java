package moom;


public class f extends com.google.common.collect.ForwardingSet implements net.minecraft.util.IJsonSerializable {

private final java.util.Set<java.lang.String> a;

private static final long b;

public f() {
super();
    this.a = com.google.common.collect.Sets.newHashSet();
}


static {
b = (moom._c.a(-7089189534130065835L, 385001952420705493L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(231812200823591L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.google.gson.JsonElement a() {
com.google.gson.JsonArray lexicalValue1158_31_0;
    boolean spill1158_0;
    com.google.gson.JsonArray spill1158_1;
    long life1_3;
    com.google.gson.JsonArray life4_8;
    int life3_9;
    java.util.Iterator life5_12;
    java.lang.String life6_19;
    lexical_join_31: {
    lexical_join_30: {
    life1_3 = (moom.f.b ^ 56568440424980L);
    spill1158_0 = moom.DS.c__Boolean();
    life4_8 = new com.google.gson.JsonArray();
    life3_9 = ((spill1158_0) ? 1 : 0);
    life5_12 = ((moom.f)(this)).iterator();
    lexical_cycle_13: while (true) {
    if (!(((java.util.Iterator)(life5_12)).hasNext())) {
        break lexical_join_30;
    }
    life6_19 = ((java.lang.String)(((java.util.Iterator)(life5_12)).next()));
    spill1158_1 = life4_8;
    if (!((life3_9 != 0))) {
        lexicalValue1158_31_0 = spill1158_1;
        break lexical_join_31;
    }
    ((com.google.gson.JsonArray)(spill1158_1)).add(((com.google.gson.JsonElement)(new com.google.gson.JsonPrimitive(life6_19))));
    if (!((life3_9 == 0))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    lexicalValue1158_31_0 = life4_8;
    }
    return lexicalValue1158_31_0;
}


public void a(com.google.gson.JsonElement p0) {
com.google.gson.JsonElement lexicalValue1159_12_0;
    com.google.gson.JsonElement spill1159_0;
    long life2_3;
    int life4_5;
    java.util.Iterator life5_20;
    com.google.gson.JsonElement life6_27;
    lexical_join_29: {
    lexical_join_12: {
    life2_3 = (moom.f.b ^ 114988636229058L);
    life4_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1159_0 = p0;
    if (!((life4_5 == 0))) {
        lexicalValue1159_12_0 = spill1159_0;
        break lexical_join_12;
    }
    if (!(((com.google.gson.JsonElement)(spill1159_0)).isJsonArray())) {
        break lexical_join_29;
    }
    lexicalValue1159_12_0 = p0;
    }
    life5_20 = ((com.google.gson.JsonArray)(((com.google.gson.JsonElement)(lexicalValue1159_12_0)).getAsJsonArray())).iterator();
    lexical_cycle_15: while (true) {
    if (!(((java.util.Iterator)(life5_20)).hasNext())) {
        break lexical_join_29;
    }
    life6_27 = ((com.google.gson.JsonElement)(((java.util.Iterator)(life5_20)).next()));
    ((moom.f)(this)).add(((((com.google.gson.JsonElement)(life6_27)).getAsString())));
    if (!((life4_5 != 0))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    return;
}


protected java.util.Collection delegate__Collection() {
return ((moom.f)(this)).delegate__Set();
}


protected java.util.Set<java.lang.String> delegate() {
return ((moom.f)(this)).delegate__Set();
}


protected java.lang.Object delegate__Object() { return ((moom.f)(this)).delegate__Set(); }

protected java.util.Set<java.lang.String> delegate__Set() {
return this.a;
}

}


