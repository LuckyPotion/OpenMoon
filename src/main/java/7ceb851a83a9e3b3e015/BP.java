package moom;


public class BP extends net.minecraft.server.management.UserListEntry<com.mojang.authlib.GameProfile> {

private static long b;

public BP(com.mojang.authlib.GameProfile p0) {
super(p0);
}


public BP(com.google.gson.JsonObject p0) {
super(moom.BP.a(p0), p0);
}


static {
moom.BP.b = (moom._c.a(6236630317824815957L, -153911475153441139L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(263128893011711L);
}

private static native <E extends Throwable> com.mojang.authlib.GameProfile __sourceHandlerCall_8d99058e591ba7b6c604(com.google.gson.JsonObject a0) throws E;
private static final class __SourceHandler_8d99058e591ba7b6c604 {

public static com.mojang.authlib.GameProfile f222(com.google.gson.JsonObject p0) throws Throwable {
    int forwardValue222_17_0;
    com.google.gson.JsonObject forwardValue222_20_0;
    java.lang.String forwardValue222_20_1;
    boolean spill222_0;
    com.google.gson.JsonObject spill222_1;
    java.lang.String spill222_2;
    long life1_3;
    int life3_5;
    java.lang.String life4_34;
    java.util.UUID life5_37;
    forward_join_35: {
    forward_join_20: {
    forward_join_17: {
    life1_3 = (__fieldRead222_0() ^ 128023744572309L);
    life3_5 = __integerCategory222_2(__call222_1());
    spill222_0 = __call222_3(p0, "uuid");
    if (!((life3_5 == 0))) {
        forwardValue222_17_0 = __integerCategory222_4(spill222_0);
        break forward_join_17;
    }
    if (!(spill222_0)) {
        break forward_join_35;
    }
    spill222_1 = p0;
    spill222_2 = "name";
    if (!((life3_5 == 0))) {
        forwardValue222_20_0 = spill222_1;
        forwardValue222_20_1 = spill222_2;
        break forward_join_20;
    }
    forwardValue222_17_0 = __integerCategory222_6(__call222_5(spill222_1, spill222_2));
    }
    if (!((forwardValue222_17_0 != 0))) {
        break forward_join_35;
    }
    forwardValue222_20_0 = p0;
    forwardValue222_20_1 = "uuid";
    }
    life4_34 = __call222_8(__call222_7(forwardValue222_20_0, forwardValue222_20_1));
    life5_37 = __call222_9(life4_34);
    return new com.mojang.authlib.GameProfile(life5_37, __call222_11(__call222_10(p0, "name")));
    }
    return null;
}
public static com.mojang.authlib.GameProfile h222_0(java.lang.Throwable p0) throws Throwable {
    throw __call2022200_0(p0);
}
public static com.mojang.authlib.GameProfile h222_1(java.lang.Throwable p0) throws Throwable {
    throw __call2022201_0(p0);
}
public static com.mojang.authlib.GameProfile h222_2(java.lang.Throwable p0) throws Throwable {
    throw __call2022202_0(p0);
}
public static com.mojang.authlib.GameProfile h222_3(java.lang.Throwable p0) throws Throwable {
    throw __call2022203_0(p0);
}
public static com.mojang.authlib.GameProfile h222_4(java.lang.Throwable p0) throws Throwable {
    java.lang.Throwable local1 = p0;
    return null;
}
private static native long __fieldRead222_0() throws Throwable;
private static native boolean __call222_1() throws Throwable;
private static native int __integerCategory222_2(boolean value) throws Throwable;
private static native boolean __call222_3(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory222_4(boolean value) throws Throwable;
private static native boolean __call222_5(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory222_6(boolean value) throws Throwable;
private static native com.google.gson.JsonElement __call222_7(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call222_8(com.google.gson.JsonElement a0) throws Throwable;
private static native java.util.UUID __call222_9(java.lang.String a0) throws Throwable;
private static native com.google.gson.JsonElement __call222_10(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call222_11(com.google.gson.JsonElement a0) throws Throwable;
private static native java.lang.Throwable __call2022200_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2022201_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2022202_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2022203_0(java.lang.Throwable a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_06927df15c8458bd05a0(moom.BP a0, com.google.gson.JsonObject a1) throws E;
private static final class __SourceHandler_06927df15c8458bd05a0 {

public static void f585(moom.BP receiver, com.google.gson.JsonObject p0) throws Throwable {
    com.google.gson.JsonObject forwardValue585_20_0;
    java.lang.String forwardValue585_20_1;
    com.google.gson.JsonObject forwardValue585_24_0;
    java.lang.String forwardValue585_24_1;
    java.util.UUID forwardValue585_24_2;
    com.google.gson.JsonObject forwardValue585_25_0;
    java.lang.String forwardValue585_25_1;
    java.lang.String forwardValue585_25_2;
    com.google.gson.JsonObject spill585_0;
    java.lang.String spill585_1;
    java.util.UUID spill585_2;
    long life2_3;
    int life4_5;
    forward_join_36: {
    forward_join_25: {
    forward_join_24: {
    forward_join_20: {
    life2_3 = (__fieldRead585_0() ^ 10757435085468L);
    life4_5 = __integerCategory585_2(__call585_1());
    if (!((__call585_3(receiver) != null))) {
        break forward_join_36;
    }
    spill585_0 = p0;
    spill585_1 = "uuid";
    spill585_2 = __call585_6(__cast585_5(__call585_4(receiver)));
    if (!((life4_5 != 0))) {
        forwardValue585_24_0 = spill585_0;
        forwardValue585_24_1 = spill585_1;
        forwardValue585_24_2 = spill585_2;
        break forward_join_24;
    }
    if (!((spill585_2 == null))) {
        forwardValue585_20_0 = spill585_0;
        forwardValue585_20_1 = spill585_1;
        break forward_join_20;
    }
    forwardValue585_25_0 = spill585_0;
    forwardValue585_25_1 = spill585_1;
    forwardValue585_25_2 = "";
    break forward_join_25;
    }
    forwardValue585_24_0 = forwardValue585_20_0;
    forwardValue585_24_1 = forwardValue585_20_1;
    forwardValue585_24_2 = __call585_9(__cast585_8(__call585_7(receiver)));
    }
    forwardValue585_25_0 = forwardValue585_24_0;
    forwardValue585_25_1 = forwardValue585_24_1;
    forwardValue585_25_2 = __call585_10(forwardValue585_24_2);
    }
    __call585_11(forwardValue585_25_0, forwardValue585_25_1, forwardValue585_25_2);
    __call585_15(p0, "name", __call585_14(__cast585_13(__call585_12(receiver))));
    __call585_16(receiver, p0);
    }
    return;
}
public static void h585_0(moom.Oo p0) throws Throwable {
    throw __call1058500_0(p0);
}
public static void h585_1(moom.Oo p0) throws Throwable {
    throw __call1058501_0(p0);
}
public static void h585_2(moom.Oo p0) throws Throwable {
    throw __call1058502_0(p0);
}
private static native long __fieldRead585_0() throws Throwable;
private static native boolean __call585_1() throws Throwable;
private static native int __integerCategory585_2(boolean value) throws Throwable;
private static native java.lang.Object __call585_3(moom.BP a0) throws Throwable;
private static native java.lang.Object __call585_4(moom.BP a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __cast585_5(java.lang.Object a0) throws Throwable;
private static native java.util.UUID __call585_6(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native java.lang.Object __call585_7(moom.BP a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __cast585_8(java.lang.Object a0) throws Throwable;
private static native java.util.UUID __call585_9(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native java.lang.String __call585_10(java.util.UUID a0) throws Throwable;
private static native void __call585_11(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.Object __call585_12(moom.BP a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __cast585_13(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call585_14(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native void __call585_15(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call585_16(moom.BP a0, com.google.gson.JsonObject a1) throws Throwable;
private static native java.lang.Throwable __call1058500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1058501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1058502_0(moom.Oo a0) throws Throwable;

}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


private static com.mojang.authlib.GameProfile a(com.google.gson.JsonObject p0) { return __sourceHandlerCall_8d99058e591ba7b6c604(p0); }


protected void a__Void(com.google.gson.JsonObject p0) { __sourceHandlerCall_06927df15c8458bd05a0(this, p0); }

}
