package moom;


public class BN extends net.minecraft.server.management.BanEntry<com.mojang.authlib.GameProfile> {

private static long h;

public BN(com.google.gson.JsonObject p0) {
super(moom.BN.a(p0), p0);
}


public BN(com.mojang.authlib.GameProfile p0, java.util.Date p1, java.lang.String p2, java.util.Date p3, java.lang.String p4) {
super(p0, p3, p2, p3, p4);
}


public BN(com.mojang.authlib.GameProfile p0) {
this(p0, null, null, null, null);
}


static {
moom.BN.h = (moom._c.a(1017643200572942942L, -280411543972030711L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(108877049270850L);
}

private static native <E extends Throwable> com.mojang.authlib.GameProfile __sourceHandlerCall_2382127cf835a7486f30(com.google.gson.JsonObject a0) throws E;
private static final class __SourceHandler_2382127cf835a7486f30 {

public static com.mojang.authlib.GameProfile f220(com.google.gson.JsonObject p0) throws Throwable {
    int forwardValue220_17_0;
    com.google.gson.JsonObject forwardValue220_20_0;
    java.lang.String forwardValue220_20_1;
    boolean spill220_0;
    com.google.gson.JsonObject spill220_1;
    java.lang.String spill220_2;
    long life1_3;
    int life3_5;
    java.lang.String life4_34;
    java.util.UUID life5_37;
    forward_join_35: {
    forward_join_20: {
    forward_join_17: {
    life1_3 = (__fieldRead220_0() ^ 21474302460540L);
    life3_5 = __integerCategory220_2(__call220_1());
    spill220_0 = __call220_3(p0, "uuid");
    if (!((life3_5 == 0))) {
        forwardValue220_17_0 = __integerCategory220_4(spill220_0);
        break forward_join_17;
    }
    if (!(spill220_0)) {
        break forward_join_35;
    }
    spill220_1 = p0;
    spill220_2 = "name";
    if (!((life3_5 == 0))) {
        forwardValue220_20_0 = spill220_1;
        forwardValue220_20_1 = spill220_2;
        break forward_join_20;
    }
    forwardValue220_17_0 = __integerCategory220_6(__call220_5(spill220_1, spill220_2));
    }
    if (!((forwardValue220_17_0 != 0))) {
        break forward_join_35;
    }
    forwardValue220_20_0 = p0;
    forwardValue220_20_1 = "uuid";
    }
    life4_34 = __call220_8(__call220_7(forwardValue220_20_0, forwardValue220_20_1));
    life5_37 = __call220_9(life4_34);
    return new com.mojang.authlib.GameProfile(life5_37, __call220_11(__call220_10(p0, "name")));
    }
    return null;
}
public static com.mojang.authlib.GameProfile h220_0(java.lang.Throwable p0) throws Throwable {
    throw __call2022000_0(p0);
}
public static com.mojang.authlib.GameProfile h220_1(java.lang.Throwable p0) throws Throwable {
    throw __call2022001_0(p0);
}
public static com.mojang.authlib.GameProfile h220_2(java.lang.Throwable p0) throws Throwable {
    throw __call2022002_0(p0);
}
public static com.mojang.authlib.GameProfile h220_3(java.lang.Throwable p0) throws Throwable {
    throw __call2022003_0(p0);
}
public static com.mojang.authlib.GameProfile h220_4(java.lang.Throwable p0) throws Throwable {
    java.lang.Throwable local1 = p0;
    return null;
}
private static native long __fieldRead220_0() throws Throwable;
private static native boolean __call220_1() throws Throwable;
private static native int __integerCategory220_2(boolean value) throws Throwable;
private static native boolean __call220_3(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory220_4(boolean value) throws Throwable;
private static native boolean __call220_5(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory220_6(boolean value) throws Throwable;
private static native com.google.gson.JsonElement __call220_7(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call220_8(com.google.gson.JsonElement a0) throws Throwable;
private static native java.util.UUID __call220_9(java.lang.String a0) throws Throwable;
private static native com.google.gson.JsonElement __call220_10(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call220_11(com.google.gson.JsonElement a0) throws Throwable;
private static native java.lang.Throwable __call2022000_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2022001_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2022002_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2022003_0(java.lang.Throwable a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_3de0593a51ecaf2b4b80(moom.BN a0, com.google.gson.JsonObject a1) throws E;
private static final class __SourceHandler_3de0593a51ecaf2b4b80 {

public static void f583(moom.BN receiver, com.google.gson.JsonObject p0) throws Throwable {
    com.google.gson.JsonObject forwardValue583_20_0;
    java.lang.String forwardValue583_20_1;
    com.google.gson.JsonObject forwardValue583_24_0;
    java.lang.String forwardValue583_24_1;
    java.util.UUID forwardValue583_24_2;
    com.google.gson.JsonObject forwardValue583_25_0;
    java.lang.String forwardValue583_25_1;
    java.lang.String forwardValue583_25_2;
    com.google.gson.JsonObject spill583_0;
    java.lang.String spill583_1;
    java.util.UUID spill583_2;
    long life2_3;
    int life4_5;
    forward_join_36: {
    forward_join_25: {
    forward_join_24: {
    forward_join_20: {
    life2_3 = (__fieldRead583_0() ^ 31021320837774L);
    life4_5 = __integerCategory583_2(__call583_1());
    if (!((__call583_3(receiver) != null))) {
        break forward_join_36;
    }
    spill583_0 = p0;
    spill583_1 = "uuid";
    spill583_2 = __call583_6(__cast583_5(__call583_4(receiver)));
    if (!((life4_5 == 0))) {
        forwardValue583_24_0 = spill583_0;
        forwardValue583_24_1 = spill583_1;
        forwardValue583_24_2 = spill583_2;
        break forward_join_24;
    }
    if (!((spill583_2 == null))) {
        forwardValue583_20_0 = spill583_0;
        forwardValue583_20_1 = spill583_1;
        break forward_join_20;
    }
    forwardValue583_25_0 = spill583_0;
    forwardValue583_25_1 = spill583_1;
    forwardValue583_25_2 = "";
    break forward_join_25;
    }
    forwardValue583_24_0 = forwardValue583_20_0;
    forwardValue583_24_1 = forwardValue583_20_1;
    forwardValue583_24_2 = __call583_9(__cast583_8(__call583_7(receiver)));
    }
    forwardValue583_25_0 = forwardValue583_24_0;
    forwardValue583_25_1 = forwardValue583_24_1;
    forwardValue583_25_2 = __call583_10(forwardValue583_24_2);
    }
    __call583_11(forwardValue583_25_0, forwardValue583_25_1, forwardValue583_25_2);
    __call583_15(p0, "name", __call583_14(__cast583_13(__call583_12(receiver))));
    __call583_16(receiver, p0);
    }
    return;
}
public static void h583_0(moom.Oo p0) throws Throwable {
    throw __call1058300_0(p0);
}
public static void h583_1(moom.Oo p0) throws Throwable {
    throw __call1058301_0(p0);
}
public static void h583_2(moom.Oo p0) throws Throwable {
    throw __call1058302_0(p0);
}
private static native long __fieldRead583_0() throws Throwable;
private static native boolean __call583_1() throws Throwable;
private static native int __integerCategory583_2(boolean value) throws Throwable;
private static native java.lang.Object __call583_3(moom.BN a0) throws Throwable;
private static native java.lang.Object __call583_4(moom.BN a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __cast583_5(java.lang.Object a0) throws Throwable;
private static native java.util.UUID __call583_6(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native java.lang.Object __call583_7(moom.BN a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __cast583_8(java.lang.Object a0) throws Throwable;
private static native java.util.UUID __call583_9(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native java.lang.String __call583_10(java.util.UUID a0) throws Throwable;
private static native void __call583_11(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.Object __call583_12(moom.BN a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __cast583_13(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call583_14(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native void __call583_15(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call583_16(moom.BN a0, com.google.gson.JsonObject a1) throws Throwable;
private static native java.lang.Throwable __call1058300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1058301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1058302_0(moom.Oo a0) throws Throwable;

}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


private static com.mojang.authlib.GameProfile a(com.google.gson.JsonObject p0) { return __sourceHandlerCall_2382127cf835a7486f30(p0); }


protected void a__Void(com.google.gson.JsonObject p0) { __sourceHandlerCall_3de0593a51ecaf2b4b80(this, p0); }

}
