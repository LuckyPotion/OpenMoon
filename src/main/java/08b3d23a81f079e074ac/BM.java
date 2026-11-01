package moom;


public class BM extends net.minecraft.server.management.BanEntry<java.lang.String> {

private static final long h;

public BM(com.google.gson.JsonObject p0) {
super(moom.BM.a(p0), p0);
}


public BM(java.lang.String p0, java.util.Date p1, java.lang.String p2, java.util.Date p3, java.lang.String p4) {
super(p0, p1, p2, p3, p4);
}


public BM(java.lang.String p0) {
this(p0, null, null, null, null);
}


static {
moom.BM.h = (moom._c.a(7546917085868669207L, -1563812526419864032L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(250348666250060L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected void a__Void(com.google.gson.JsonObject p0) {
moom.BM forwardValue1498_18_0;
    moom.BM spill1498_0;
    long life2_3;
    int life4_5;
    forward_join_20: {
    forward_join_18: {
    life2_3 = (moom.BM.h ^ 127165959105272L);
    life4_5 = ((net.minecraft.server.management.ServerConfigurationManager.c__Boolean()) ? 1 : 0);
    spill1498_0 = this;
    if (!((life4_5 != 0))) {
        forwardValue1498_18_0 = spill1498_0;
        break forward_join_18;
    }
    if (!((((moom.BM)(spill1498_0)).a() != null))) {
        break forward_join_20;
    }
    ((com.google.gson.JsonObject)(p0)).addProperty(((java.lang.String)("ip")), ((java.lang.String)(((java.lang.String)(((moom.BM)(this)).a())))));
    forwardValue1498_18_0 = this;
    }
    __sourceIntrinsic_82564e592246_call1498_7(forwardValue1498_18_0, p0);
    }
    return;
}


private static java.lang.String a(com.google.gson.JsonObject p0) {
com.google.gson.JsonObject forwardValue1497_14_0;
    java.lang.String forwardValue1497_14_1;
    java.lang.String forwardValue1497_18_0;
    com.google.gson.JsonObject spill1497_0;
    java.lang.String spill1497_1;
    long life1_3;
    int life3_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_14: {
    life1_3 = (moom.BM.h ^ 92950598999527L);
    life3_5 = ((net.minecraft.server.management.ServerConfigurationManager.c__Boolean()) ? 1 : 0);
    spill1497_0 = p0;
    spill1497_1 = "ip";
    if (!((life3_5 != 0))) {
        forwardValue1497_14_0 = spill1497_0;
        forwardValue1497_14_1 = spill1497_1;
        break forward_join_14;
    }
    if (!(((com.google.gson.JsonObject)(spill1497_0)).has(((java.lang.String)(spill1497_1))))) {
        break forward_join_17;
    }
    forwardValue1497_14_0 = p0;
    forwardValue1497_14_1 = "ip";
    }
    forwardValue1497_18_0 = ((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(forwardValue1497_14_0)).get(((java.lang.String)(forwardValue1497_14_1))))).getAsString();
    break forward_join_18;
    }
    forwardValue1497_18_0 = null;
    }
    return forwardValue1497_18_0;
}


private static native <E extends Throwable> void __sourceIntrinsic_82564e592246_call1498_7(moom.BM a0, com.google.gson.JsonObject a1) throws E;
}
