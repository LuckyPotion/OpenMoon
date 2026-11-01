package moom;


public class yO implements com.google.gson.JsonDeserializer<net.minecraft.network.ServerStatusResponse$MinecraftProtocolVersionIdentifier>, com.google.gson.JsonSerializer<net.minecraft.network.ServerStatusResponse$MinecraftProtocolVersionIdentifier> {

public yO() {
super();
}


public com.google.gson.JsonElement a(net.minecraft.network.ServerStatusResponse$MinecraftProtocolVersionIdentifier p0, java.lang.reflect.Type p1, com.google.gson.JsonSerializationContext p2) {
com.google.gson.JsonObject local4 = new com.google.gson.JsonObject();
    ((com.google.gson.JsonObject)(local4)).addProperty(((java.lang.String)("name")), ((java.lang.String)(((net.minecraft.network.ServerStatusResponse$MinecraftProtocolVersionIdentifier)(p0)).a__String())));
    ((com.google.gson.JsonObject)(local4)).addProperty(((java.lang.String)("protocol")), ((java.lang.Number)(java.lang.Integer.valueOf(((int)(((net.minecraft.network.ServerStatusResponse$MinecraftProtocolVersionIdentifier)(p0)).a()))))));
    return local4;
}


public net.minecraft.network.ServerStatusResponse$MinecraftProtocolVersionIdentifier a(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
com.google.gson.JsonObject local4 = moom.Dg.a__JsonObject(((com.google.gson.JsonElement)(p0)), ((java.lang.String)("version")));
    return new net.minecraft.network.ServerStatusResponse$MinecraftProtocolVersionIdentifier(moom.Dg.a__String(((com.google.gson.JsonObject)(local4)), ((java.lang.String)("name"))), moom.Dg.a__Int(((com.google.gson.JsonObject)(local4)), ((java.lang.String)("protocol"))));
}


public net.minecraft.network.ServerStatusResponse$MinecraftProtocolVersionIdentifier deserialize(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
return ((moom.yO)(this)).a(((com.google.gson.JsonElement)(p0)), ((java.lang.reflect.Type)(p1)), ((com.google.gson.JsonDeserializationContext)(p2)));
}


public com.google.gson.JsonElement serialize__sourceBridge_aa40c1536e(java.lang.Object p0, java.lang.reflect.Type p1, com.google.gson.JsonSerializationContext p2) {
return ((moom.yO)(this)).a(((net.minecraft.network.ServerStatusResponse$MinecraftProtocolVersionIdentifier)(((net.minecraft.network.ServerStatusResponse$MinecraftProtocolVersionIdentifier)(p0)))), ((java.lang.reflect.Type)(p1)), ((com.google.gson.JsonSerializationContext)(p2)));
}


public com.google.gson.JsonElement serialize(net.minecraft.network.ServerStatusResponse$MinecraftProtocolVersionIdentifier __bridgeParam0, java.lang.reflect.Type __bridgeParam1, com.google.gson.JsonSerializationContext __bridgeParam2) { return this.serialize__sourceBridge_aa40c1536e(((java.lang.Object)(__bridgeParam0)), ((java.lang.reflect.Type)(__bridgeParam1)), ((com.google.gson.JsonSerializationContext)(__bridgeParam2))); }
}
