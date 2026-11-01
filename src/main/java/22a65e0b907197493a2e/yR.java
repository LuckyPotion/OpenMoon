package moom;


public class yR implements com.google.gson.JsonDeserializer<net.minecraft.network.ServerStatusResponse>, com.google.gson.JsonSerializer<net.minecraft.network.ServerStatusResponse> {

private static final long a;

public yR() {
super();
}


static {
moom.yR.a = (moom._c.a(6843480942234505924L, 1376968969893951976L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(133219887698781L);
}


private static com.google.gson.JsonParseException a(com.google.gson.JsonParseException p0) {
return p0;
}


public net.minecraft.network.ServerStatusResponse a(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
int forwardValue4557_32_0;
    int forwardValue4557_47_0;
    int forwardValue4557_62_0;
    java.lang.String spill4557_0;
    boolean spill4557_1;
    long life4_3;
    com.google.gson.JsonObject life7_8;
    java.lang.String life6_9;
    net.minecraft.network.ServerStatusResponse life8_13;
    forward_join_68: {
    forward_join_62: {
    forward_join_59: {
    forward_join_47: {
    forward_join_44: {
    forward_join_32: {
    forward_join_29: {
    life4_3 = (moom.yR.a ^ 657438481213L);
    spill4557_0 = net.minecraft.network.PacketBuffer.b();
    life7_8 = moom.Dg.a__JsonObject(((com.google.gson.JsonElement)(p0)), ((java.lang.String)("status")));
    life6_9 = spill4557_0;
    life8_13 = new net.minecraft.network.ServerStatusResponse();
    spill4557_1 = ((com.google.gson.JsonObject)(life7_8)).has(((java.lang.String)("description")));
    if (!((life6_9 == null))) {
        forwardValue4557_32_0 = ((spill4557_1) ? 1 : 0);
        break forward_join_32;
    }
    if (!(spill4557_1)) {
        break forward_join_29;
    }
    ((net.minecraft.network.ServerStatusResponse)(life8_13)).a(((net.minecraft.util.IChatComponent)(((net.minecraft.util.IChatComponent)(((com.google.gson.JsonDeserializationContext)(p2)).deserialize(((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(life7_8)).get(((java.lang.String)("description"))))), ((java.lang.reflect.Type)(net.minecraft.util.IChatComponent.class))))))));
    }
    forwardValue4557_32_0 = ((((com.google.gson.JsonObject)(life7_8)).has(((java.lang.String)("players")))) ? 1 : 0);
    }
    if (!((life6_9 == null))) {
        forwardValue4557_47_0 = forwardValue4557_32_0;
        break forward_join_47;
    }
    if (!((forwardValue4557_32_0 != 0))) {
        break forward_join_44;
    }
    ((net.minecraft.network.ServerStatusResponse)(life8_13)).a(((net.minecraft.network.ServerStatusResponse$PlayerCountData)(((net.minecraft.network.ServerStatusResponse$PlayerCountData)(((com.google.gson.JsonDeserializationContext)(p2)).deserialize(((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(life7_8)).get(((java.lang.String)("players"))))), ((java.lang.reflect.Type)(net.minecraft.network.ServerStatusResponse$PlayerCountData.class))))))));
    }
    forwardValue4557_47_0 = ((((com.google.gson.JsonObject)(life7_8)).has(((java.lang.String)("version")))) ? 1 : 0);
    }
    if (!((life6_9 == null))) {
        forwardValue4557_62_0 = forwardValue4557_47_0;
        break forward_join_62;
    }
    if (!((forwardValue4557_47_0 != 0))) {
        break forward_join_59;
    }
    ((net.minecraft.network.ServerStatusResponse)(life8_13)).a(((net.minecraft.network.ServerStatusResponse$MinecraftProtocolVersionIdentifier)(((net.minecraft.network.ServerStatusResponse$MinecraftProtocolVersionIdentifier)(((com.google.gson.JsonDeserializationContext)(p2)).deserialize(((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(life7_8)).get(((java.lang.String)("version"))))), ((java.lang.reflect.Type)(net.minecraft.network.ServerStatusResponse$MinecraftProtocolVersionIdentifier.class))))))));
    }
    forwardValue4557_62_0 = ((((com.google.gson.JsonObject)(life7_8)).has(((java.lang.String)("favicon")))) ? 1 : 0);
    }
    if (!((forwardValue4557_62_0 != 0))) {
        break forward_join_68;
    }
    ((net.minecraft.network.ServerStatusResponse)(life8_13)).a(((java.lang.String)(moom.Dg.a__String(((com.google.gson.JsonObject)(life7_8)), ((java.lang.String)("favicon"))))));
    }
    return life8_13;
}


public com.google.gson.JsonElement a(net.minecraft.network.ServerStatusResponse p0, java.lang.reflect.Type p1, com.google.gson.JsonSerializationContext p2) {
net.minecraft.network.ServerStatusResponse forwardValue4558_23_0;
    net.minecraft.network.ServerStatusResponse forwardValue4558_35_0;
    net.minecraft.network.ServerStatusResponse forwardValue4558_47_0;
    java.lang.String spill4558_0;
    net.minecraft.network.ServerStatusResponse spill4558_1;
    long life4_3;
    com.google.gson.JsonObject life7_8;
    java.lang.String life6_9;
    forward_join_54: {
    forward_join_47: {
    forward_join_46: {
    forward_join_35: {
    forward_join_34: {
    forward_join_23: {
    forward_join_22: {
    life4_3 = (moom.yR.a ^ 35695990262347L);
    spill4558_0 = net.minecraft.network.PacketBuffer.b();
    life7_8 = new com.google.gson.JsonObject();
    life6_9 = spill4558_0;
    spill4558_1 = p0;
    if (!((life6_9 == null))) {
        forwardValue4558_23_0 = spill4558_1;
        break forward_join_23;
    }
    if (!((((net.minecraft.network.ServerStatusResponse)(spill4558_1)).a__C5() != null))) {
        break forward_join_22;
    }
    ((com.google.gson.JsonObject)(life7_8)).add(((java.lang.String)("description")), ((com.google.gson.JsonElement)(((com.google.gson.JsonSerializationContext)(p2)).serialize(((java.lang.Object)(((net.minecraft.network.ServerStatusResponse)(p0)).a__C5()))))));
    }
    forwardValue4558_23_0 = p0;
    }
    if (!((life6_9 == null))) {
        forwardValue4558_35_0 = forwardValue4558_23_0;
        break forward_join_35;
    }
    if (!((((net.minecraft.network.ServerStatusResponse)(forwardValue4558_23_0)).a__yP() != null))) {
        break forward_join_34;
    }
    ((com.google.gson.JsonObject)(life7_8)).add(((java.lang.String)("players")), ((com.google.gson.JsonElement)(((com.google.gson.JsonSerializationContext)(p2)).serialize(((java.lang.Object)(((net.minecraft.network.ServerStatusResponse)(p0)).a__yP()))))));
    }
    forwardValue4558_35_0 = p0;
    }
    if (!((life6_9 == null))) {
        forwardValue4558_47_0 = forwardValue4558_35_0;
        break forward_join_47;
    }
    if (!((((net.minecraft.network.ServerStatusResponse)(forwardValue4558_35_0)).a__yN() != null))) {
        break forward_join_46;
    }
    ((com.google.gson.JsonObject)(life7_8)).add(((java.lang.String)("version")), ((com.google.gson.JsonElement)(((com.google.gson.JsonSerializationContext)(p2)).serialize(((java.lang.Object)(((net.minecraft.network.ServerStatusResponse)(p0)).a__yN()))))));
    }
    forwardValue4558_47_0 = p0;
    }
    if (!((((net.minecraft.network.ServerStatusResponse)(forwardValue4558_47_0)).a() != null))) {
        break forward_join_54;
    }
    ((com.google.gson.JsonObject)(life7_8)).addProperty(((java.lang.String)("favicon")), ((java.lang.String)(((net.minecraft.network.ServerStatusResponse)(p0)).a())));
    }
    return life7_8;
}


public net.minecraft.network.ServerStatusResponse deserialize(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
return ((moom.yR)(this)).a(((com.google.gson.JsonElement)(p0)), ((java.lang.reflect.Type)(p1)), ((com.google.gson.JsonDeserializationContext)(p2)));
}


public com.google.gson.JsonElement serialize__sourceBridge_aa40c1536e(java.lang.Object p0, java.lang.reflect.Type p1, com.google.gson.JsonSerializationContext p2) {
return ((moom.yR)(this)).a(((net.minecraft.network.ServerStatusResponse)(((net.minecraft.network.ServerStatusResponse)(p0)))), ((java.lang.reflect.Type)(p1)), ((com.google.gson.JsonSerializationContext)(p2)));
}


public com.google.gson.JsonElement serialize(net.minecraft.network.ServerStatusResponse __bridgeParam0, java.lang.reflect.Type __bridgeParam1, com.google.gson.JsonSerializationContext __bridgeParam2) { return this.serialize__sourceBridge_aa40c1536e(((java.lang.Object)(__bridgeParam0)), ((java.lang.reflect.Type)(__bridgeParam1)), ((com.google.gson.JsonSerializationContext)(__bridgeParam2))); }
}
