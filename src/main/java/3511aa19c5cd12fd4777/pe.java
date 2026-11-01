package moom;


public class pe extends moom.pa<net.minecraft.client.resources.data.PackMetadataSection> implements com.google.gson.JsonSerializer<net.minecraft.client.resources.data.PackMetadataSection> {

private static final long a;

public pe() {
super();
}


static {
moom.pe.a = (moom._c.a(-5017677312926806323L, -1808335101987282136L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(94606318505402L);
}


public java.lang.String a() {
return "pack";
}


private static com.google.gson.JsonParseException a(com.google.gson.JsonParseException p0) {
return p0;
}


public net.minecraft.client.resources.data.PackMetadataSection a(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
long local4 = (moom.pe.a ^ 14984787494158L);
    com.google.gson.JsonObject local6 = ((com.google.gson.JsonElement)(p0)).getAsJsonObject();
    net.minecraft.util.IChatComponent local7 = ((net.minecraft.util.IChatComponent)(((com.google.gson.JsonDeserializationContext)(p2)).deserialize(((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(local6)).get(((java.lang.String)("description"))))), ((java.lang.reflect.Type)(net.minecraft.util.IChatComponent.class)))));
    if ((local7 == null)) {
        throw new com.google.gson.JsonParseException("Invalid/missing description!");
    }
    int local8 = moom.Dg.a__Int(((com.google.gson.JsonObject)(local6)), ((java.lang.String)("pack_format")));
    return new net.minecraft.client.resources.data.PackMetadataSection(local7, local8);
}


public com.google.gson.JsonElement a(net.minecraft.client.resources.data.PackMetadataSection p0, java.lang.reflect.Type p1, com.google.gson.JsonSerializationContext p2) {
com.google.gson.JsonObject local4 = new com.google.gson.JsonObject();
    ((com.google.gson.JsonObject)(local4)).addProperty(((java.lang.String)("pack_format")), ((java.lang.Number)(java.lang.Integer.valueOf(((int)(((net.minecraft.client.resources.data.PackMetadataSection)(p0)).a()))))));
    ((com.google.gson.JsonObject)(local4)).add(((java.lang.String)("description")), ((com.google.gson.JsonElement)(((com.google.gson.JsonSerializationContext)(p2)).serialize(((java.lang.Object)(((net.minecraft.client.resources.data.PackMetadataSection)(p0)).a__C5()))))));
    return local4;
}


public net.minecraft.client.resources.data.PackMetadataSection deserialize(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
return ((moom.pe)(this)).a(((com.google.gson.JsonElement)(p0)), ((java.lang.reflect.Type)(p1)), ((com.google.gson.JsonDeserializationContext)(p2)));
}


public com.google.gson.JsonElement serialize__sourceBridge_aa40c1536e(java.lang.Object p0, java.lang.reflect.Type p1, com.google.gson.JsonSerializationContext p2) {
return ((moom.pe)(this)).a(((net.minecraft.client.resources.data.PackMetadataSection)(((net.minecraft.client.resources.data.PackMetadataSection)(p0)))), ((java.lang.reflect.Type)(p1)), ((com.google.gson.JsonSerializationContext)(p2)));
}


public com.google.gson.JsonElement serialize(net.minecraft.client.resources.data.PackMetadataSection __bridgeParam0, java.lang.reflect.Type __bridgeParam1, com.google.gson.JsonSerializationContext __bridgeParam2) { return this.serialize__sourceBridge_aa40c1536e(((java.lang.Object)(__bridgeParam0)), ((java.lang.reflect.Type)(__bridgeParam1)), ((com.google.gson.JsonSerializationContext)(__bridgeParam2))); }
}
