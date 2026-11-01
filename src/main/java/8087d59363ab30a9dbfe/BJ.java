package moom;


class BJ implements com.google.gson.JsonDeserializer<net.minecraft.server.management.UserListEntry<K>>, com.google.gson.JsonSerializer<net.minecraft.server.management.UserListEntry<K>> {

moom.BD a;

private static long b;

private BJ(moom.BD p0) { super(); }


private static void __sourceConstructorBody_14ec61cd972af3b1(moom.BJ receiver, moom.BD p0) throws Throwable {

((moom.BJ)(receiver)).a = ((moom.BD)(p0));

    moom.BJ.__sourceConstructorInit_14ec61cd972af3b1_0(((moom.BJ)(receiver)));

    return;

}



static {
moom.BJ.b = (moom._c.a(7474979902956600868L, 4061228977478180173L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(82130003401074L);
}

private static native <E extends Throwable> void __sourceConstructorInit_14ec61cd972af3b1_0(moom.BJ a0) throws E;

private static com.google.gson.JsonParseException a(com.google.gson.JsonParseException p0) {
return p0;
}


public com.google.gson.JsonElement a(net.minecraft.server.management.UserListEntry<K> p0, java.lang.reflect.Type p1, com.google.gson.JsonSerializationContext p2) {
com.google.gson.JsonObject local4 = new com.google.gson.JsonObject();
    ((net.minecraft.server.management.UserListEntry)(p0)).a__Void(((com.google.gson.JsonObject)(local4)));
    return local4;
}


public net.minecraft.server.management.UserListEntry<K> a(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
com.google.gson.JsonElement forwardValue1496_12_0;
    com.google.gson.JsonElement spill1496_0;
    long life4_3;
    int life6_5;
    com.google.gson.JsonObject life7_19;
    forward_join_19: {
    forward_join_12: {
    life4_3 = (moom.BJ.b ^ 54567045678783L);
    life6_5 = ((net.minecraft.server.management.ServerConfigurationManager.c__Boolean()) ? 1 : 0);
    spill1496_0 = p0;
    if (!((life6_5 != 0))) {
        forwardValue1496_12_0 = spill1496_0;
        break forward_join_12;
    }
    if (!(((com.google.gson.JsonElement)(spill1496_0)).isJsonObject())) {
        break forward_join_19;
    }
    forwardValue1496_12_0 = p0;
    }
    life7_19 = ((com.google.gson.JsonElement)(forwardValue1496_12_0)).getAsJsonObject();
    return ((moom.BD)(this.a)).a(((com.google.gson.JsonObject)(life7_19)));
    }
    return null;
}


public java.lang.Object deserialize__sourceBridge_592e56158a(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
return ((moom.BJ)(this)).a(((com.google.gson.JsonElement)(p0)), ((java.lang.reflect.Type)(p1)), ((com.google.gson.JsonDeserializationContext)(p2)));
}

public net.minecraft.server.management.UserListEntry<K> deserialize(com.google.gson.JsonElement __bridgeParam0, java.lang.reflect.Type __bridgeParam1, com.google.gson.JsonDeserializationContext __bridgeParam2) throws com.google.gson.JsonParseException { return ((net.minecraft.server.management.UserListEntry<K>)(this.deserialize__sourceBridge_592e56158a(((com.google.gson.JsonElement)(__bridgeParam0)), ((java.lang.reflect.Type)(__bridgeParam1)), ((com.google.gson.JsonDeserializationContext)(__bridgeParam2))))); }
public com.google.gson.JsonElement serialize__sourceBridge_aa40c1536e(java.lang.Object p0, java.lang.reflect.Type p1, com.google.gson.JsonSerializationContext p2) {
return ((moom.BJ)(this)).a(((net.minecraft.server.management.UserListEntry)(((net.minecraft.server.management.UserListEntry)(p0)))), ((java.lang.reflect.Type)(p1)), ((com.google.gson.JsonSerializationContext)(p2)));
}

public com.google.gson.JsonElement serialize(net.minecraft.server.management.UserListEntry<K> __bridgeParam0, java.lang.reflect.Type __bridgeParam1, com.google.gson.JsonSerializationContext __bridgeParam2) { return ((com.google.gson.JsonElement)(this.serialize__sourceBridge_aa40c1536e(((java.lang.Object)(__bridgeParam0)), ((java.lang.reflect.Type)(__bridgeParam1)), ((com.google.gson.JsonSerializationContext)(__bridgeParam2))))); }
}
