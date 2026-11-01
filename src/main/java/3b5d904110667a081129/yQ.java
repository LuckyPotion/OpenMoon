package moom;


public class yQ implements com.google.gson.JsonDeserializer<net.minecraft.network.ServerStatusResponse$PlayerCountData>, com.google.gson.JsonSerializer<net.minecraft.network.ServerStatusResponse$PlayerCountData> {

private static final long a;

public yQ() {
super();
}


static {
moom.yQ.a = (moom._c.a(-169525428213690328L, -8738770207544587195L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(134311165249627L);
}


private static com.google.gson.JsonParseException a(com.google.gson.JsonParseException p0) {
return p0;
}


public net.minecraft.network.ServerStatusResponse$PlayerCountData a(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
com.google.gson.JsonObject lexicalValue1423_28_0;
    java.lang.String lexicalValue1423_28_1;
    int lexicalValue1423_37_0;
    java.lang.String spill1423_0;
    com.google.gson.JsonObject spill1423_1;
    java.lang.String spill1423_2;
    int spill1423_3;
    long life4_3;
    com.google.gson.JsonObject life7_8;
    java.lang.String life6_9;
    net.minecraft.network.ServerStatusResponse$PlayerCountData life8_19;
    com.google.gson.JsonArray life9_35;
    com.mojang.authlib.GameProfile[] life10_50;
    int life11_52;
    com.google.gson.JsonObject life12_63;
    java.lang.String life13_67;
    lexical_join_75: {
    lexical_join_72: {
    lexical_join_37: {
    lexical_join_28: {
    life4_3 = (moom.yQ.a ^ 52814089921387L);
    spill1423_0 = net.minecraft.network.PacketBuffer.b();
    life7_8 = moom.Dg.a__JsonObject(((com.google.gson.JsonElement)(p0)), ((java.lang.String)("players")));
    life6_9 = spill1423_0;
    life8_19 = new net.minecraft.network.ServerStatusResponse$PlayerCountData(moom.Dg.a__Int(((com.google.gson.JsonObject)(life7_8)), ((java.lang.String)("max"))), moom.Dg.a__Int(((com.google.gson.JsonObject)(life7_8)), ((java.lang.String)("online"))));
    spill1423_1 = life7_8;
    spill1423_2 = "sample";
    if (!((life6_9 == null))) {
        lexicalValue1423_28_0 = spill1423_1;
        lexicalValue1423_28_1 = spill1423_2;
        break lexical_join_28;
    }
    if (!(moom.Dg.c(((com.google.gson.JsonObject)(spill1423_1)), ((java.lang.String)(spill1423_2))))) {
        break lexical_join_75;
    }
    lexicalValue1423_28_0 = life7_8;
    lexicalValue1423_28_1 = "sample";
    }
    life9_35 = moom.Dg.a__JsonArray(((com.google.gson.JsonObject)(lexicalValue1423_28_0)), ((java.lang.String)(lexicalValue1423_28_1)));
    spill1423_3 = ((com.google.gson.JsonArray)(life9_35)).size();
    if (!((life6_9 == null))) {
        lexicalValue1423_37_0 = spill1423_3;
        break lexical_join_37;
    }
    if (!((spill1423_3 > 0))) {
        break lexical_join_75;
    }
    lexicalValue1423_37_0 = ((com.google.gson.JsonArray)(life9_35)).size();
    }
    life10_50 = new com.mojang.authlib.GameProfile[lexicalValue1423_37_0];
    life11_52 = 0;
    lexical_cycle_41: while (true) {
    if (!((life11_52 < (life10_50).length))) {
        break lexical_join_72;
    }
    life12_63 = moom.Dg.a__JsonObject(((com.google.gson.JsonElement)(((com.google.gson.JsonArray)(life9_35)).get(((int)(life11_52))))), ((java.lang.String)(__sourceIntrinsic_e0279f21a650_invokedynamic1423_10(life11_52))));
    life13_67 = moom.Dg.a__String(((com.google.gson.JsonObject)(life12_63)), ((java.lang.String)("id")));
    (life10_50)[life11_52] = new com.mojang.authlib.GameProfile(java.util.UUID.fromString(((java.lang.String)(life13_67))), moom.Dg.a__String(((com.google.gson.JsonObject)(life12_63)), ((java.lang.String)("name"))));
    life11_52 += 1;
    if (!((life6_9 == null))) {
        break lexical_join_75;
    }
    if (!((life6_9 != null))) { continue lexical_cycle_41; }
    break lexical_cycle_41;
    }
    }
    ((net.minecraft.network.ServerStatusResponse$PlayerCountData)(life8_19)).a(((com.mojang.authlib.GameProfile[])(life10_50)));
    }
    return life8_19;
}


public com.google.gson.JsonElement a(net.minecraft.network.ServerStatusResponse$PlayerCountData p0, java.lang.reflect.Type p1, com.google.gson.JsonSerializationContext p2) {
com.google.gson.JsonObject lexicalValue1424_62_0;
    java.lang.String lexicalValue1424_62_1;
    com.google.gson.JsonObject lexicalValue1424_63_0;
    java.lang.String lexicalValue1424_63_1;
    java.util.UUID lexicalValue1424_63_2;
    com.google.gson.JsonObject lexicalValue1424_64_0;
    java.lang.String lexicalValue1424_64_1;
    java.lang.String lexicalValue1424_64_2;
    com.google.gson.JsonObject lexicalValue1424_81_0;
    java.lang.String lexicalValue1424_81_1;
    com.google.gson.JsonObject lexicalValue1424_84_0;
    java.lang.String spill1424_0;
    com.google.gson.JsonObject spill1424_1;
    com.google.gson.JsonObject spill1424_2;
    java.lang.String spill1424_3;
    java.util.UUID spill1424_4;
    long life4_3;
    com.google.gson.JsonObject life7_8;
    java.lang.String life6_15;
    com.google.gson.JsonArray life8_40;
    int life9_42;
    com.google.gson.JsonObject life10_51;
    java.util.UUID life11_57;
    lexical_join_84: {
    lexical_join_83: {
    lexical_join_81: {
    lexical_join_79: {
    life4_3 = (moom.yQ.a ^ 124911389439042L);
    spill1424_0 = net.minecraft.network.PacketBuffer.b();
    life7_8 = new com.google.gson.JsonObject();
    ((com.google.gson.JsonObject)(life7_8)).addProperty(((java.lang.String)("max")), ((java.lang.Number)(java.lang.Integer.valueOf(((int)(((net.minecraft.network.ServerStatusResponse$PlayerCountData)(p0)).a()))))));
    life6_15 = spill1424_0;
    spill1424_1 = life7_8;
    if (!((life6_15 == null))) {
        lexicalValue1424_84_0 = spill1424_1;
        break lexical_join_84;
    }
    ((com.google.gson.JsonObject)(spill1424_1)).addProperty(((java.lang.String)("online")), ((java.lang.Number)(java.lang.Integer.valueOf(((int)(((net.minecraft.network.ServerStatusResponse$PlayerCountData)(p0)).b()))))));
    if (!((((net.minecraft.network.ServerStatusResponse$PlayerCountData)(p0)).a__ArrayGameProfile() != null))) {
        break lexical_join_83;
    }
    if (!(((((net.minecraft.network.ServerStatusResponse$PlayerCountData)(p0)).a__ArrayGameProfile()).length > 0))) {
        break lexical_join_83;
    }
    life8_40 = new com.google.gson.JsonArray();
    life9_42 = 0;
    lexical_cycle_37: while (true) {
    lexical_join_64: {
    lexical_join_63: {
    lexical_join_62: {
    if (!((life9_42 < (((net.minecraft.network.ServerStatusResponse$PlayerCountData)(p0)).a__ArrayGameProfile()).length))) {
        break lexical_join_79;
    }
    life10_51 = new com.google.gson.JsonObject();
    life11_57 = ((com.mojang.authlib.GameProfile)((((net.minecraft.network.ServerStatusResponse$PlayerCountData)(p0)).a__ArrayGameProfile())[life9_42])).getId();
    spill1424_2 = life10_51;
    spill1424_3 = "id";
    if (!((life6_15 == null))) {
        lexicalValue1424_81_0 = spill1424_2;
        lexicalValue1424_81_1 = spill1424_3;
        break lexical_join_81;
    }
    spill1424_4 = life11_57;
    if (!((life6_15 == null))) {
        lexicalValue1424_63_0 = spill1424_2;
        lexicalValue1424_63_1 = spill1424_3;
        lexicalValue1424_63_2 = spill1424_4;
        break lexical_join_63;
    }
    if (!((spill1424_4 == null))) {
        lexicalValue1424_62_0 = spill1424_2;
        lexicalValue1424_62_1 = spill1424_3;
        break lexical_join_62;
    }
    lexicalValue1424_64_0 = spill1424_2;
    lexicalValue1424_64_1 = spill1424_3;
    lexicalValue1424_64_2 = "";
    break lexical_join_64;
    }
    lexicalValue1424_63_0 = lexicalValue1424_62_0;
    lexicalValue1424_63_1 = lexicalValue1424_62_1;
    lexicalValue1424_63_2 = life11_57;
    }
    lexicalValue1424_64_0 = lexicalValue1424_63_0;
    lexicalValue1424_64_1 = lexicalValue1424_63_1;
    lexicalValue1424_64_2 = ((java.util.UUID)(lexicalValue1424_63_2)).toString();
    }
    ((com.google.gson.JsonObject)(lexicalValue1424_64_0)).addProperty(((java.lang.String)(lexicalValue1424_64_1)), ((java.lang.String)(lexicalValue1424_64_2)));
    ((com.google.gson.JsonObject)(life10_51)).addProperty(((java.lang.String)("name")), ((java.lang.String)(((com.mojang.authlib.GameProfile)((((net.minecraft.network.ServerStatusResponse$PlayerCountData)(p0)).a__ArrayGameProfile())[life9_42])).getName())));
    ((com.google.gson.JsonArray)(life8_40)).add(((com.google.gson.JsonElement)(life10_51)));
    life9_42 += 1;
    if (!((life6_15 != null))) { continue lexical_cycle_37; }
    break lexical_cycle_37;
    }
    }
    lexicalValue1424_81_0 = life7_8;
    lexicalValue1424_81_1 = "sample";
    }
    ((com.google.gson.JsonObject)(lexicalValue1424_81_0)).add(((java.lang.String)(lexicalValue1424_81_1)), ((com.google.gson.JsonElement)(life8_40)));
    }
    lexicalValue1424_84_0 = life7_8;
    }
    return lexicalValue1424_84_0;
}


public net.minecraft.network.ServerStatusResponse$PlayerCountData deserialize(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
return ((moom.yQ)(this)).a(((com.google.gson.JsonElement)(p0)), ((java.lang.reflect.Type)(p1)), ((com.google.gson.JsonDeserializationContext)(p2)));
}


public com.google.gson.JsonElement serialize__sourceBridge_aa40c1536e(java.lang.Object p0, java.lang.reflect.Type p1, com.google.gson.JsonSerializationContext p2) {
return ((moom.yQ)(this)).a(((net.minecraft.network.ServerStatusResponse$PlayerCountData)(((net.minecraft.network.ServerStatusResponse$PlayerCountData)(p0)))), ((java.lang.reflect.Type)(p1)), ((com.google.gson.JsonSerializationContext)(p2)));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e0279f21a650_invokedynamic1423_10(int a0) throws E;

public com.google.gson.JsonElement serialize(net.minecraft.network.ServerStatusResponse$PlayerCountData __bridgeParam0, java.lang.reflect.Type __bridgeParam1, com.google.gson.JsonSerializationContext __bridgeParam2) { return this.serialize__sourceBridge_aa40c1536e(((java.lang.Object)(__bridgeParam0)), ((java.lang.reflect.Type)(__bridgeParam1)), ((com.google.gson.JsonSerializationContext)(__bridgeParam2))); }
}
