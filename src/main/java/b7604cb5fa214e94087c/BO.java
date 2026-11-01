package moom;


public class BO extends net.minecraft.server.management.UserListEntry<com.mojang.authlib.GameProfile> {

private int b;

private boolean c;

private static long d;

public BO(com.mojang.authlib.GameProfile p0, int p1, boolean p2) {
super(p0);
    this.b = p1;
    this.c = p2;
}


public BO(com.google.gson.JsonObject p0) { super(null, (com.google.gson.JsonObject)null); __sourceHandlerCall_cba09ac35db511fb3b53(this, p0); }


static {
moom.BO.d = (moom._c.a(8527148032781261268L, -8665658015798376476L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(244685792215L);
}

private static native <E extends Throwable> void __sourceHandlerCall_cba09ac35db511fb3b53(moom.BO a0, com.google.gson.JsonObject a1) throws E;
private static final class __SourceHandler_cba09ac35db511fb3b53 {

public static void f380(moom.BO receiver, com.google.gson.JsonObject p0) throws Throwable {
    moom.BO forwardValue380_22_0;
    int forwardValue380_22_1;
    moom.BO forwardValue380_23_0;
    moom.BO forwardValue380_24_0;
    int forwardValue380_24_1;
    moom.BO forwardValue380_36_0;
    int forwardValue380_36_1;
    moom.BO forwardValue380_40_0;
    int forwardValue380_40_1;
    moom.BO forwardValue380_41_0;
    moom.BO forwardValue380_42_0;
    int forwardValue380_42_1;
    boolean spill380_0;
    moom.BO spill380_1;
    boolean spill380_2;
    moom.BO spill380_3;
    boolean spill380_4;
    long life2_3;
    int life4_10;
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    forward_join_36: {
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    life2_3 = (__fieldRead380_0() ^ 134778250090528L);
    spill380_0 = __call380_1();
    __directSuperInit380_3(receiver, __call380_2(p0), p0);
    life4_10 = __integerCategory380_4(spill380_0);
    spill380_1 = receiver;
    spill380_2 = __call380_5(p0, "level");
    if (!((life4_10 == 0))) {
        forwardValue380_22_0 = spill380_1;
        forwardValue380_22_1 = __integerCategory380_6(spill380_2);
        break forward_join_22;
    }
    if (!(spill380_2)) {
        forwardValue380_23_0 = spill380_1;
        break forward_join_23;
    }
    forwardValue380_22_0 = spill380_1;
    forwardValue380_22_1 = __call380_8(__call380_7(p0, "level"));
    }
    forwardValue380_24_0 = forwardValue380_22_0;
    forwardValue380_24_1 = forwardValue380_22_1;
    break forward_join_24;
    }
    forwardValue380_24_0 = forwardValue380_23_0;
    forwardValue380_24_1 = 0;
    }
    __fieldWrite380_9(forwardValue380_24_0, forwardValue380_24_1);
    spill380_3 = receiver;
    spill380_4 = __call380_10(p0, "bypassesPlayerLimit");
    if (!((life4_10 == 0))) {
        forwardValue380_36_0 = spill380_3;
        forwardValue380_36_1 = __integerCategory380_11(spill380_4);
        break forward_join_36;
    }
    if (!(spill380_4)) {
        forwardValue380_41_0 = spill380_3;
        break forward_join_41;
    }
    forwardValue380_36_0 = spill380_3;
    forwardValue380_36_1 = __integerCategory380_14(__call380_13(__call380_12(p0, "bypassesPlayerLimit")));
    }
    if (!((life4_10 == 0))) {
        forwardValue380_40_0 = forwardValue380_36_0;
        forwardValue380_40_1 = forwardValue380_36_1;
        break forward_join_40;
    }
    if (!((forwardValue380_36_1 != 0))) {
        forwardValue380_41_0 = forwardValue380_36_0;
        break forward_join_41;
    }
    forwardValue380_40_0 = forwardValue380_36_0;
    forwardValue380_40_1 = 1;
    }
    forwardValue380_42_0 = forwardValue380_40_0;
    forwardValue380_42_1 = forwardValue380_40_1;
    break forward_join_42;
    }
    forwardValue380_42_0 = forwardValue380_41_0;
    forwardValue380_42_1 = 0;
    }
    __fieldWrite380_15(forwardValue380_42_0, forwardValue380_42_1);
    return;
}
public static void h380_0(moom.Oo p0) throws Throwable {
    throw __call3038000_0(p0);
}
public static void h380_1(moom.Oo p0) throws Throwable {
    throw __call3038001_0(p0);
}
public static void h380_2(moom.Oo p0) throws Throwable {
    throw __call3038002_0(p0);
}
public static void h380_3(moom.Oo p0) throws Throwable {
    throw __call3038003_0(p0);
}
public static void h380_4(moom.Oo p0) throws Throwable {
    throw __call3038004_0(p0);
}
private static native long __fieldRead380_0() throws Throwable;
private static native boolean __call380_1() throws Throwable;
private static native com.mojang.authlib.GameProfile __call380_2(com.google.gson.JsonObject a0) throws Throwable;
private static native void __directSuperInit380_3(moom.BO a0, java.lang.Object a1, com.google.gson.JsonObject a2) throws Throwable;
private static native int __integerCategory380_4(boolean value) throws Throwable;
private static native boolean __call380_5(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory380_6(boolean value) throws Throwable;
private static native com.google.gson.JsonElement __call380_7(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native int __call380_8(com.google.gson.JsonElement a0) throws Throwable;
private static native void __fieldWrite380_9(moom.BO a0, int a1) throws Throwable;
private static native boolean __call380_10(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory380_11(boolean value) throws Throwable;
private static native com.google.gson.JsonElement __call380_12(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native boolean __call380_13(com.google.gson.JsonElement a0) throws Throwable;
private static native int __integerCategory380_14(boolean value) throws Throwable;
private static native void __fieldWrite380_15(moom.BO a0, int a1) throws Throwable;
private static native java.lang.Throwable __call3038000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3038001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3038002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3038003_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3038004_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> com.mojang.authlib.GameProfile __sourceHandlerCall_39163dda16821b80f3ef(com.google.gson.JsonObject a0) throws E;
private static final class __SourceHandler_39163dda16821b80f3ef {

public static com.mojang.authlib.GameProfile f221(com.google.gson.JsonObject p0) throws Throwable {
    int forwardValue221_17_0;
    com.google.gson.JsonObject forwardValue221_20_0;
    java.lang.String forwardValue221_20_1;
    boolean spill221_0;
    com.google.gson.JsonObject spill221_1;
    java.lang.String spill221_2;
    long life1_3;
    int life3_5;
    java.lang.String life4_34;
    java.util.UUID life5_37;
    forward_join_35: {
    forward_join_20: {
    forward_join_17: {
    life1_3 = (__fieldRead221_0() ^ 116104290330325L);
    life3_5 = __integerCategory221_2(__call221_1());
    spill221_0 = __call221_3(p0, "uuid");
    if (!((life3_5 != 0))) {
        forwardValue221_17_0 = __integerCategory221_4(spill221_0);
        break forward_join_17;
    }
    if (!(spill221_0)) {
        break forward_join_35;
    }
    spill221_1 = p0;
    spill221_2 = "name";
    if (!((life3_5 != 0))) {
        forwardValue221_20_0 = spill221_1;
        forwardValue221_20_1 = spill221_2;
        break forward_join_20;
    }
    forwardValue221_17_0 = __integerCategory221_6(__call221_5(spill221_1, spill221_2));
    }
    if (!((forwardValue221_17_0 != 0))) {
        break forward_join_35;
    }
    forwardValue221_20_0 = p0;
    forwardValue221_20_1 = "uuid";
    }
    life4_34 = __call221_8(__call221_7(forwardValue221_20_0, forwardValue221_20_1));
    life5_37 = __call221_9(life4_34);
    return new com.mojang.authlib.GameProfile(life5_37, __call221_11(__call221_10(p0, "name")));
    }
    return null;
}
public static com.mojang.authlib.GameProfile h221_0(java.lang.Throwable p0) throws Throwable {
    throw __call2022100_0(p0);
}
public static com.mojang.authlib.GameProfile h221_1(java.lang.Throwable p0) throws Throwable {
    throw __call2022101_0(p0);
}
public static com.mojang.authlib.GameProfile h221_2(java.lang.Throwable p0) throws Throwable {
    throw __call2022102_0(p0);
}
public static com.mojang.authlib.GameProfile h221_3(java.lang.Throwable p0) throws Throwable {
    throw __call2022103_0(p0);
}
public static com.mojang.authlib.GameProfile h221_4(java.lang.Throwable p0) throws Throwable {
    java.lang.Throwable local1 = p0;
    return null;
}
private static native long __fieldRead221_0() throws Throwable;
private static native boolean __call221_1() throws Throwable;
private static native int __integerCategory221_2(boolean value) throws Throwable;
private static native boolean __call221_3(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory221_4(boolean value) throws Throwable;
private static native boolean __call221_5(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory221_6(boolean value) throws Throwable;
private static native com.google.gson.JsonElement __call221_7(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call221_8(com.google.gson.JsonElement a0) throws Throwable;
private static native java.util.UUID __call221_9(java.lang.String a0) throws Throwable;
private static native com.google.gson.JsonElement __call221_10(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call221_11(com.google.gson.JsonElement a0) throws Throwable;
private static native java.lang.Throwable __call2022100_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2022101_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2022102_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2022103_0(java.lang.Throwable a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_bfc748ad63403a89eec1(moom.BO a0, com.google.gson.JsonObject a1) throws E;
private static final class __SourceHandler_bfc748ad63403a89eec1 {

public static void f584(moom.BO receiver, com.google.gson.JsonObject p0) throws Throwable {
    com.google.gson.JsonObject forwardValue584_20_0;
    java.lang.String forwardValue584_20_1;
    com.google.gson.JsonObject forwardValue584_24_0;
    java.lang.String forwardValue584_24_1;
    java.util.UUID forwardValue584_24_2;
    com.google.gson.JsonObject forwardValue584_25_0;
    java.lang.String forwardValue584_25_1;
    java.lang.String forwardValue584_25_2;
    com.google.gson.JsonObject spill584_0;
    java.lang.String spill584_1;
    java.util.UUID spill584_2;
    long life2_3;
    int life4_5;
    forward_join_48: {
    forward_join_25: {
    forward_join_24: {
    forward_join_20: {
    life2_3 = (__fieldRead584_0() ^ 118488275152511L);
    life4_5 = __integerCategory584_2(__call584_1());
    if (!((__call584_3(receiver) != null))) {
        break forward_join_48;
    }
    spill584_0 = p0;
    spill584_1 = "uuid";
    spill584_2 = __call584_6(__cast584_5(__call584_4(receiver)));
    if (!((life4_5 != 0))) {
        forwardValue584_24_0 = spill584_0;
        forwardValue584_24_1 = spill584_1;
        forwardValue584_24_2 = spill584_2;
        break forward_join_24;
    }
    if (!((spill584_2 == null))) {
        forwardValue584_20_0 = spill584_0;
        forwardValue584_20_1 = spill584_1;
        break forward_join_20;
    }
    forwardValue584_25_0 = spill584_0;
    forwardValue584_25_1 = spill584_1;
    forwardValue584_25_2 = "";
    break forward_join_25;
    }
    forwardValue584_24_0 = forwardValue584_20_0;
    forwardValue584_24_1 = forwardValue584_20_1;
    forwardValue584_24_2 = __call584_9(__cast584_8(__call584_7(receiver)));
    }
    forwardValue584_25_0 = forwardValue584_24_0;
    forwardValue584_25_1 = forwardValue584_24_1;
    forwardValue584_25_2 = __call584_10(forwardValue584_24_2);
    }
    __call584_11(forwardValue584_25_0, forwardValue584_25_1, forwardValue584_25_2);
    __call584_15(p0, "name", __call584_14(__cast584_13(__call584_12(receiver))));
    __call584_16(receiver, p0);
    __call584_19(p0, "level", __call584_18(__fieldRead584_17(receiver)));
    __call584_22(p0, "bypassesPlayerLimit", __call584_21(__fieldRead584_20(receiver)));
    }
    return;
}
public static void h584_0(moom.Oo p0) throws Throwable {
    throw __call1058400_0(p0);
}
public static void h584_1(moom.Oo p0) throws Throwable {
    throw __call1058401_0(p0);
}
public static void h584_2(moom.Oo p0) throws Throwable {
    throw __call1058402_0(p0);
}
private static native long __fieldRead584_0() throws Throwable;
private static native boolean __call584_1() throws Throwable;
private static native int __integerCategory584_2(boolean value) throws Throwable;
private static native java.lang.Object __call584_3(moom.BO a0) throws Throwable;
private static native java.lang.Object __call584_4(moom.BO a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __cast584_5(java.lang.Object a0) throws Throwable;
private static native java.util.UUID __call584_6(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native java.lang.Object __call584_7(moom.BO a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __cast584_8(java.lang.Object a0) throws Throwable;
private static native java.util.UUID __call584_9(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native java.lang.String __call584_10(java.util.UUID a0) throws Throwable;
private static native void __call584_11(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.Object __call584_12(moom.BO a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __cast584_13(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call584_14(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native void __call584_15(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call584_16(moom.BO a0, com.google.gson.JsonObject a1) throws Throwable;
private static native int __fieldRead584_17(moom.BO a0) throws Throwable;
private static native java.lang.Integer __call584_18(int a0) throws Throwable;
private static native void __call584_19(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native boolean __fieldRead584_20(moom.BO a0) throws Throwable;
private static native java.lang.Boolean __call584_21(boolean a0) throws Throwable;
private static native void __call584_22(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native java.lang.Throwable __call1058400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1058401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1058402_0(moom.Oo a0) throws Throwable;

}


public boolean b() {
return ((((this.c) ? 1 : 0)) != 0);
}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


private static com.mojang.authlib.GameProfile a(com.google.gson.JsonObject p0) { return __sourceHandlerCall_39163dda16821b80f3ef(p0); }


protected void a__Void(com.google.gson.JsonObject p0) { __sourceHandlerCall_bfc748ad63403a89eec1(this, p0); }


public int a__sourceReturn_8abf5c6871() {
return this.b;
}

}
