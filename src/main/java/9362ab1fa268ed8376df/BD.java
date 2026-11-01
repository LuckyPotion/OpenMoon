package moom;


public class BD<K, V extends net.minecraft.server.management.UserListEntry<K>> {

protected static org.apache.logging.log4j.Logger a;

protected com.google.gson.Gson b;

private java.io.File c;

private java.util.Map<java.lang.String, V> d;

private boolean e;

private static java.lang.reflect.ParameterizedType f;

private static long h;

public BD(java.io.File p0) {
super();
    this.d = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    this.e = ((boolean)(true));
    this.c = ((java.io.File)(p0));
    com.google.gson.GsonBuilder local2 = ((com.google.gson.GsonBuilder)(new com.google.gson.GsonBuilder())).setPrettyPrinting();
    ((com.google.gson.GsonBuilder)(local2)).registerTypeHierarchyAdapter(((java.lang.Class)(net.minecraft.server.management.UserListEntry.class)), ((java.lang.Object)(new moom.BJ(this))));
    this.b = ((com.google.gson.Gson)(((com.google.gson.GsonBuilder)(local2)).create()));
    return;
}


static {
moom.BD.h = (moom._c.a(3297943145958000828L, -1344133286130916203L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(147384328347467L);
    moom.BD.a = org.apache.logging.log4j.LogManager.getLogger();
    moom.BD.f = new net.minecraft.server.management.UserList$1();
}

private static native <E extends Throwable> void __sourceHandlerCall_9349c5e3d20ce642662b(moom.BD a0) throws E;
private static final class __SourceHandler_9349c5e3d20ce642662b {

public static void f208(moom.BD receiver) throws Throwable {
    java.util.Collection life1_3;
    java.lang.String life2_8;
    java.lang.Object life3_10;
    java.io.BufferedWriter life3_15;
    life1_3 = __call208_1(__fieldRead208_0(receiver));
    life2_8 = __call208_3(__fieldRead208_2(receiver), life1_3);
    life3_10 = null;
    life3_15 = __call208_6(__fieldRead208_4(receiver), __fieldRead208_5());
    __call208_7(life3_15, life2_8);
    __call208_8(life3_15);
    return;
}
public static void h208_0(java.lang.Throwable p0, java.io.BufferedWriter p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3020800_0(p1);
    throw life2_2;
}
private static native java.util.Map __fieldRead208_0(moom.BD a0) throws Throwable;
private static native java.util.Collection __call208_1(java.util.Map a0) throws Throwable;
private static native com.google.gson.Gson __fieldRead208_2(moom.BD a0) throws Throwable;
private static native java.lang.String __call208_3(com.google.gson.Gson a0, java.util.Collection a1) throws Throwable;
private static native java.io.File __fieldRead208_4(moom.BD a0) throws Throwable;
private static native java.nio.charset.Charset __fieldRead208_5() throws Throwable;
private static native java.io.BufferedWriter __call208_6(java.io.File a0, java.nio.charset.Charset a1) throws Throwable;
private static native void __call208_7(java.io.BufferedWriter a0, java.lang.String a1) throws Throwable;
private static native void __call208_8(java.io.BufferedWriter a0) throws Throwable;
private static native void __call3020800_0(java.io.BufferedWriter a0) throws Throwable;

}


public void b() throws java.io.IOException { __sourceHandlerCall_9349c5e3d20ce642662b(this); }


protected boolean a__Boolean(K p0) {
return (__sourceIntrinsic_booleanComparison((((java.util.Map)(this.d)).containsKey(((java.lang.Object)(((moom.BD)(this)).a(((java.lang.Object)(p0)))))))) != 0);
}


private void a__Void() {
int forestValue207_31_0;
    int forestValue207_51_0;
    boolean spill207_0;
    boolean spill207_1;
    boolean spill207_2;
    long life1_3;
    java.util.ArrayList life4_6;
    int life3_7;
    java.util.Iterator life5_12;
    net.minecraft.server.management.UserListEntry life6_21;
    java.util.Iterator life5_46;
    java.lang.Object life6_55;
    java.lang.Object life6_68;
    forest_join_66: {
    forest_join_51: {
    forest_join_34: {
    life1_3 = (moom.BD.h ^ 118277421605139L);
    spill207_0 = net.minecraft.server.management.ServerConfigurationManager.b__Boolean();
    life4_6 = com.google.common.collect.Lists.newArrayList();
    life3_7 = ((spill207_0) ? 1 : 0);
    life5_12 = ((java.util.Collection)(((java.util.Map)(this.d)).values())).iterator();
    forest_cycle_13: while (true) {
    forest_join_32: {
    forest_join_31: {
    if (!(((java.util.Iterator)(life5_12)).hasNext())) {
        break forest_join_34;
    }
    life6_21 = ((net.minecraft.server.management.UserListEntry)(((java.util.Iterator)(life5_12)).next()));
    spill207_1 = ((net.minecraft.server.management.UserListEntry)(life6_21)).a__Boolean();
    if (!((life3_7 == 0))) {
        forestValue207_51_0 = ((spill207_1) ? 1 : 0);
        break forest_join_51;
    }
    if (!((life3_7 == 0))) {
        forestValue207_31_0 = ((spill207_1) ? 1 : 0);
        break forest_join_31;
    }
    if (!(spill207_1)) {
        break forest_join_32;
    }
    forestValue207_31_0 = ((((java.util.List)(life4_6)).add(((java.lang.Object)(((net.minecraft.server.management.UserListEntry)(life6_21)).a())))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue207_31_0);
    }
    if (!((life3_7 != 0))) {
        continue forest_cycle_13;
    }
    break forest_cycle_13;
    }
    }
    life5_46 = ((java.util.List)(life4_6)).iterator();
    forest_cycle_37: while (true) {
    if (!(((java.util.Iterator)(life5_46)).hasNext())) {
        break forest_join_66;
    }
    life6_55 = ((java.util.Iterator)(life5_46)).next();
    ((java.util.Map)(this.d)).remove(((java.lang.Object)(life6_55)));
    if (!((life3_7 != 0))) {
        continue forest_cycle_37;
    }
    break forest_cycle_37;
    }
    break forest_join_66;
    }
    forest_cycle_51: while (true) {
    forest_join_63: {
    if (!((forestValue207_51_0 != 0))) {
        break forest_join_66;
    }
    life6_68 = ((java.util.Iterator)(life5_12)).next();
    ((java.util.Map)(this.d)).remove(((java.lang.Object)(life6_68)));
    if (!((life3_7 != 0))) {
        break forest_join_63;
    }
    break forest_join_66;
    }
    spill207_2 = ((java.util.Iterator)(life5_12)).hasNext();
    forestValue207_51_0 = ((spill207_2) ? 1 : 0);
    continue forest_cycle_51;
    }
    }
    return;
}


protected net.minecraft.server.management.UserListEntry<K> a(com.google.gson.JsonObject p0) {
return new net.minecraft.server.management.UserListEntry(null, p0);
}


protected java.util.Map<java.lang.String, V> a() {
return this.d;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public V a__BK(K p0) {
((moom.BD)(this)).a__Void();
    return (((V)((net.minecraft.server.management.UserListEntry)(((java.util.Map)(this.d)).get(((java.lang.Object)(((moom.BD)(this)).a(((java.lang.Object)(p0))))))))));
}


public void a(V p0) {
((java.util.Map)(this.d)).put(((java.lang.Object)(((moom.BD)(this)).a(((java.lang.Object)(((net.minecraft.server.management.UserListEntry)(p0)).a()))))), ((java.lang.Object)(p0)));
    try {
        ((moom.BD)(this)).b();
    } catch (java.io.IOException caught2) {
        ((org.apache.logging.log4j.Logger)(moom.BD.a)).warn(((java.lang.String)("Could not save the list after adding a user.")), ((java.lang.Throwable)(caught2)));
    }
    return;
}


public void a(boolean p0) {
this.e = ((boolean)(p0));
    return;
}


public boolean a__Boolean() {
return ((((this.e) ? 1 : 0)) != 0);
}


public void a__Void(K p0) {
((java.util.Map)(this.d)).remove(((java.lang.Object)(((moom.BD)(this)).a(((java.lang.Object)(p0))))));
    try {
        ((moom.BD)(this)).b();
    } catch (java.io.IOException caught2) {
        ((org.apache.logging.log4j.Logger)(moom.BD.a)).warn(((java.lang.String)("Could not save the list after removing a user.")), ((java.lang.Throwable)(caught2)));
    }
    return;
}


public java.lang.String[] a__ArrayString() {
return ((java.lang.String[])(((java.util.Set)(((java.util.Map)(this.d)).keySet())).toArray(((java.lang.Object[])(new java.lang.String[0])))));
}


protected java.lang.String a(K p0) {
return ((java.lang.Object)(p0)).toString();
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
