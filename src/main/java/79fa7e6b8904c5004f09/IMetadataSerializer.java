package net.minecraft.client.resources.data;


public class IMetadataSerializer {

private final net.minecraft.util.IRegistry<java.lang.String, moom.pk<? extends net.minecraft.client.resources.data.IMetadataSection>> a;

private final com.google.gson.GsonBuilder b;

private com.google.gson.Gson c;

private static final long d;

public IMetadataSerializer() {
super();
    this.a = new moom.Dy();
    this.b = new com.google.gson.GsonBuilder();
    (this.b).registerTypeHierarchyAdapter(net.minecraft.util.IChatComponent.class, new net.minecraft.util.IChatComponent$Serializer());
    (this.b).registerTypeHierarchyAdapter(moom.CO.class, new moom.CQ());
    (this.b).registerTypeAdapterFactory(new moom.C1());
}


static {
d = (moom._c.a(-8980438685008734931L, -8560198835872081244L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(97418246241260L);
}


private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


private com.google.gson.Gson a() {
com.google.gson.Gson forwardValue4850_18_0;
    com.google.gson.Gson spill4850_0;
    long life1_3;
    int life3_5;
    forward_join_18: {
    forward_join_16: {
    life1_3 = (net.minecraft.client.resources.data.IMetadataSerializer.d ^ 21327886394035L);
    life3_5 = moom.pa.b();
    spill4850_0 = this.c;
    if (!((life3_5 == 0))) {
        forwardValue4850_18_0 = spill4850_0;
        break forward_join_18;
    }
    if (!((spill4850_0 == null))) {
        break forward_join_16;
    }
    this.c = ((com.google.gson.Gson)(((com.google.gson.GsonBuilder)(this.b)).create()));
    }
    forwardValue4850_18_0 = this.c;
    }
    return forwardValue4850_18_0;
}


public <T extends net.minecraft.client.resources.data.IMetadataSection> T a(java.lang.String p0, com.google.gson.JsonObject p1) {
int forwardValue4851_27_0;
    java.lang.Object forwardValue4851_41_0;
    java.lang.Object forwardValue4851_61_0;
    boolean spill4851_0;
    com.google.gson.JsonElement spill4851_1;
    moom.pk spill4851_2;
    long life3_3;
    int life5_5;
    moom.pk life6_54;
    forward_join_61: {
    forward_join_53: {
    forward_join_41: {
    forward_join_37: {
    forward_join_27: {
    forward_join_21: {
    forward_join_13: {
    life3_3 = (net.minecraft.client.resources.data.IMetadataSerializer.d ^ 49669778718583L);
    life5_5 = moom.pa.b();
    if (!((p0 == null))) {
        break forward_join_13;
    }
    throw new java.lang.IllegalArgumentException("Metadata section name cannot be null");
    }
    spill4851_0 = ((com.google.gson.JsonObject)(p1)).has(((java.lang.String)(p0)));
    if (!((life5_5 == 0))) {
        forwardValue4851_27_0 = ((spill4851_0) ? 1 : 0);
        break forward_join_27;
    }
    if (!((!spill4851_0))) {
        break forward_join_21;
    }
    return null;
    }
    spill4851_1 = ((com.google.gson.JsonObject)(p1)).get(((java.lang.String)(p0)));
    if (!((life5_5 == 0))) {
        forwardValue4851_41_0 = spill4851_1;
        break forward_join_41;
    }
    forwardValue4851_27_0 = ((((com.google.gson.JsonElement)(spill4851_1)).isJsonObject()) ? 1 : 0);
    }
    if (!((forwardValue4851_27_0 == 0))) {
        break forward_join_37;
    }
    throw new java.lang.IllegalArgumentException(__sourceIntrinsic_a0310c02abd4_invokedynamic4851_8(p0, ((com.google.gson.JsonObject)(p1)).get(((java.lang.String)(p0)))));
    }
    forwardValue4851_41_0 = ((net.minecraft.util.IRegistry)(this.a)).a__Object(((java.lang.Object)(p0)));
    }
    life6_54 = ((moom.pk)(forwardValue4851_41_0));
    spill4851_2 = life6_54;
    if (!((life5_5 == 0))) {
        forwardValue4851_61_0 = spill4851_2;
        break forward_join_61;
    }
    if (!((spill4851_2 == null))) {
        break forward_join_53;
    }
    throw new java.lang.IllegalArgumentException(__sourceIntrinsic_a0310c02abd4_invokedynamic4851_12(p0));
    }
    forwardValue4851_61_0 = ((com.google.gson.Gson)(this.a())).fromJson(((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(p1)).getAsJsonObject(((java.lang.String)(p0))))), ((java.lang.Class)(((moom.pk)(life6_54)).b)));
    }
    return (((T)((net.minecraft.client.resources.data.IMetadataSection)(forwardValue4851_61_0))));
}


public <T extends net.minecraft.client.resources.data.IMetadataSection> void a(net.minecraft.client.resources.data.IMetadataSectionSerializer<T> p0, java.lang.Class<T> p1) {
((net.minecraft.util.IRegistry)(this.a)).a(((java.lang.Object)(((net.minecraft.client.resources.data.IMetadataSectionSerializer)(p0)).a())), ((java.lang.Object)(new moom.pk(p0, p1))));
    ((com.google.gson.GsonBuilder)(this.b)).registerTypeAdapter(((java.lang.reflect.Type)(p1)), ((java.lang.Object)(p0)));
    this.c = ((com.google.gson.Gson)(null));
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a0310c02abd4_invokedynamic4851_8(java.lang.String a0, com.google.gson.JsonElement a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a0310c02abd4_invokedynamic4851_12(java.lang.String a0) throws E;
}
