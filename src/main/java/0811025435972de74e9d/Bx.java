package moom;


class Bx implements com.google.gson.JsonDeserializer<moom.Bw>, com.google.gson.JsonSerializer<moom.Bw> {

private static long a;

private Bx() {
super();
}


static {
moom.Bx.a = (moom._c.a(2427735905666260112L, -1184986978308702816L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(14117736888290L);
}

private static native <E extends Throwable> moom.Bw __sourceHandlerCall_e5fa974a6fa202fc26ae(moom.Bx a0, com.google.gson.JsonElement a1, java.lang.reflect.Type a2, com.google.gson.JsonDeserializationContext a3) throws E;
private static final class __SourceHandler_e5fa974a6fa202fc26ae {

public static moom.Bw f227(moom.Bx receiver, com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws Throwable {
    com.google.gson.JsonElement forestValue227_12_0;
    com.google.gson.JsonElement forestValue227_31_0;
    com.google.gson.JsonElement forestValue227_35_0;
    java.lang.String forestValue227_54_0;
    java.lang.String forestValue227_58_0;
    com.google.gson.JsonElement spill227_0;
    com.google.gson.JsonElement spill227_1;
    java.lang.String spill227_2;
    long life4_3;
    int life6_5;
    com.google.gson.JsonObject life7_15;
    com.google.gson.JsonElement life8_19;
    com.google.gson.JsonElement life9_23;
    com.google.gson.JsonElement life10_27;
    java.lang.String life11_40;
    java.lang.String life12_43;
    java.util.Date life13_45;
    java.util.UUID life14_66;
    forest_join_74: {
    forest_join_72: {
    forest_join_70: {
    forest_join_58: {
    forest_join_54: {
    forest_join_49: {
    forest_join_35: {
    forest_join_31: {
    forest_join_12: {
    life4_3 = (__fieldRead227_0() ^ 132238547900141L);
    life6_5 = __integerCategory227_2(__call227_1());
    spill227_0 = p0;
    if (!((life6_5 == 0))) {
        forestValue227_12_0 = spill227_0;
        break forest_join_12;
    }
    if (!(__call227_3(spill227_0))) {
        break forest_join_74;
    }
    forestValue227_12_0 = p0;
    }
    life7_15 = __call227_4(forestValue227_12_0);
    life8_19 = __call227_5(life7_15, "name");
    life9_23 = __call227_6(life7_15, "uuid");
    life10_27 = __call227_7(life7_15, "expiresOn");
    spill227_1 = life8_19;
    if (!((life6_5 == 0))) {
        forestValue227_31_0 = spill227_1;
        break forest_join_31;
    }
    if (!((spill227_1 != null))) {
        break forest_join_72;
    }
    forestValue227_31_0 = life9_23;
    }
    if (!((life6_5 == 0))) {
        forestValue227_35_0 = forestValue227_31_0;
        break forest_join_35;
    }
    if (!((forestValue227_31_0 != null))) {
        break forest_join_72;
    }
    forestValue227_35_0 = life9_23;
    }
    life11_40 = __call227_8(forestValue227_35_0);
    life12_43 = __call227_9(life8_19);
    life13_45 = null;
    if (!((life10_27 != null))) {
        break forest_join_49;
    }
    life13_45 = __call227_12(__fieldRead227_10(), __call227_11(life10_27));
    }
    spill227_2 = life12_43;
    if (!((life6_5 == 0))) {
        forestValue227_54_0 = spill227_2;
        break forest_join_54;
    }
    if (!((spill227_2 != null))) {
        break forest_join_70;
    }
    forestValue227_54_0 = life11_40;
    }
    if (!((life6_5 == 0))) {
        forestValue227_58_0 = forestValue227_54_0;
        break forest_join_58;
    }
    if (!((forestValue227_54_0 != null))) {
        break forest_join_70;
    }
    forestValue227_58_0 = life11_40;
    }
    life14_66 = __call227_13(forestValue227_58_0);
    return new moom.Bw(new com.mojang.authlib.GameProfile(life14_66, life12_43), life13_45);
    }
    return null;
    }
    return null;
    }
    return null;
}
public static moom.Bw h227_0(java.text.ParseException p0) throws Throwable {
    throw __call3022700_0(p0);
}
public static moom.Bw h227_1(java.text.ParseException p0) throws Throwable {
    throw __call3022701_0(p0);
}
public static moom.Bw h227_2(java.text.ParseException p0) throws Throwable {
    throw __call3022702_0(p0);
}
public static moom.Bw h227_3(java.text.ParseException p0) throws Throwable {
    throw __call3022703_0(p0);
}
public static moom.Bw h227_4(java.text.ParseException p0, int p1, java.lang.String p2, java.lang.String p3, java.util.Date p4) throws Throwable {
    java.lang.String forestValue3022704_9_0;
    java.lang.String forestValue3022704_13_0;
    java.lang.String spill3022704_0;
    java.text.ParseException life5_2;
    java.util.Date life4_4;
    java.util.UUID life5_17;
    forest_join_25: {
    forest_join_13: {
    forest_join_9: {
    life5_2 = p0;
    life4_4 = null;
    spill3022704_0 = p3;
    if (!((p1 == 0))) {
        forestValue3022704_9_0 = spill3022704_0;
        break forest_join_9;
    }
    if (!((spill3022704_0 != null))) {
        break forest_join_25;
    }
    forestValue3022704_9_0 = p2;
    }
    if (!((p1 == 0))) {
        forestValue3022704_13_0 = forestValue3022704_9_0;
        break forest_join_13;
    }
    if (!((forestValue3022704_9_0 != null))) {
        break forest_join_25;
    }
    forestValue3022704_13_0 = p2;
    }
    life5_17 = __call3022704_0(forestValue3022704_13_0);
    return new moom.Bw(new com.mojang.authlib.GameProfile(life5_17, p3), life4_4);
    }
    return null;
}
public static moom.Bw h227_5(java.text.ParseException p0) throws Throwable {
    throw __call3022705_0(p0);
}
public static moom.Bw h227_6(java.text.ParseException p0) throws Throwable {
    throw __call3022706_0(p0);
}
public static moom.Bw h227_7(java.lang.Throwable p0) throws Throwable {
    java.lang.Throwable life1_2;
    life1_2 = p0;
    return null;
}
private static native long __fieldRead227_0() throws Throwable;
private static native boolean __call227_1() throws Throwable;
private static native int __integerCategory227_2(boolean value) throws Throwable;
private static native boolean __call227_3(com.google.gson.JsonElement a0) throws Throwable;
private static native com.google.gson.JsonObject __call227_4(com.google.gson.JsonElement a0) throws Throwable;
private static native com.google.gson.JsonElement __call227_5(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native com.google.gson.JsonElement __call227_6(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native com.google.gson.JsonElement __call227_7(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call227_8(com.google.gson.JsonElement a0) throws Throwable;
private static native java.lang.String __call227_9(com.google.gson.JsonElement a0) throws Throwable;
private static native java.text.SimpleDateFormat __fieldRead227_10() throws Throwable;
private static native java.lang.String __call227_11(com.google.gson.JsonElement a0) throws Throwable;
private static native java.util.Date __call227_12(java.text.SimpleDateFormat a0, java.lang.String a1) throws Throwable;
private static native java.util.UUID __call227_13(java.lang.String a0) throws Throwable;
private static native java.lang.Exception __call3022700_0(java.text.ParseException a0) throws Throwable;
private static native java.lang.Exception __call3022701_0(java.text.ParseException a0) throws Throwable;
private static native java.lang.Exception __call3022702_0(java.text.ParseException a0) throws Throwable;
private static native java.lang.Exception __call3022703_0(java.text.ParseException a0) throws Throwable;
private static native java.util.UUID __call3022704_0(java.lang.String a0) throws Throwable;
private static native java.lang.Exception __call3022705_0(java.text.ParseException a0) throws Throwable;
private static native java.lang.Exception __call3022706_0(java.text.ParseException a0) throws Throwable;

}

private static native <E extends Throwable> com.google.gson.JsonElement __sourceHandlerCall_0c2e3513d67fafa3b30c(moom.Bx a0, moom.Bw a1, java.lang.reflect.Type a2, com.google.gson.JsonSerializationContext a3) throws E;
private static final class __SourceHandler_0c2e3513d67fafa3b30c {

public static com.google.gson.JsonElement f620(moom.Bx receiver, moom.Bw p0, java.lang.reflect.Type p1, com.google.gson.JsonSerializationContext p2) throws Throwable {
    com.google.gson.JsonObject forwardValue620_28_0;
    java.lang.String forwardValue620_28_1;
    com.google.gson.JsonObject forwardValue620_29_0;
    java.lang.String forwardValue620_29_1;
    java.util.UUID forwardValue620_29_2;
    com.google.gson.JsonObject forwardValue620_30_0;
    java.lang.String forwardValue620_30_1;
    java.lang.String forwardValue620_30_2;
    boolean spill620_0;
    com.google.gson.JsonObject spill620_1;
    java.lang.String spill620_2;
    java.util.UUID spill620_3;
    long life4_3;
    com.google.gson.JsonObject life7_7;
    java.util.UUID life8_18;
    int life6_19;
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    life4_3 = (__fieldRead620_0() ^ 130211056377731L);
    life7_7 = new com.google.gson.JsonObject();
    __call620_3(life7_7, "name", __call620_2(__call620_1(p0)));
    spill620_0 = __call620_4();
    life8_18 = __call620_6(__call620_5(p0));
    life6_19 = __integerCategory620_7(spill620_0);
    spill620_1 = life7_7;
    spill620_2 = "uuid";
    spill620_3 = life8_18;
    if (!((life6_19 != 0))) {
        forwardValue620_29_0 = spill620_1;
        forwardValue620_29_1 = spill620_2;
        forwardValue620_29_2 = spill620_3;
        break forward_join_29;
    }
    if (!((spill620_3 == null))) {
        forwardValue620_28_0 = spill620_1;
        forwardValue620_28_1 = spill620_2;
        break forward_join_28;
    }
    forwardValue620_30_0 = spill620_1;
    forwardValue620_30_1 = spill620_2;
    forwardValue620_30_2 = "";
    break forward_join_30;
    }
    forwardValue620_29_0 = forwardValue620_28_0;
    forwardValue620_29_1 = forwardValue620_28_1;
    forwardValue620_29_2 = life8_18;
    }
    forwardValue620_30_0 = forwardValue620_29_0;
    forwardValue620_30_1 = forwardValue620_29_1;
    forwardValue620_30_2 = __call620_8(forwardValue620_29_2);
    }
    __call620_9(forwardValue620_30_0, forwardValue620_30_1, forwardValue620_30_2);
    __call620_13(life7_7, "expiresOn", __call620_12(__fieldRead620_10(), __call620_11(p0)));
    return life7_7;
}
public static void h620_0(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1062000_0(p0);
}
public static void h620_1(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1062001_0(p0);
}
private static native long __fieldRead620_0() throws Throwable;
private static native com.mojang.authlib.GameProfile __call620_1(moom.Bw a0) throws Throwable;
private static native java.lang.String __call620_2(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native void __call620_3(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native boolean __call620_4() throws Throwable;
private static native com.mojang.authlib.GameProfile __call620_5(moom.Bw a0) throws Throwable;
private static native java.util.UUID __call620_6(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native int __integerCategory620_7(boolean value) throws Throwable;
private static native java.lang.String __call620_8(java.util.UUID a0) throws Throwable;
private static native void __call620_9(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.text.SimpleDateFormat __fieldRead620_10() throws Throwable;
private static native java.util.Date __call620_11(moom.Bw a0) throws Throwable;
private static native java.lang.String __call620_12(java.text.SimpleDateFormat a0, java.util.Date a1) throws Throwable;
private static native void __call620_13(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.Exception __call1062000_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Exception __call1062001_0(com.google.gson.JsonParseException a0) throws Throwable;

}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public com.google.gson.JsonElement a(moom.Bw p0, java.lang.reflect.Type p1, com.google.gson.JsonSerializationContext p2) { return __sourceHandlerCall_0c2e3513d67fafa3b30c(this, p0, p1, p2); }


public moom.Bw a(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException { return __sourceHandlerCall_e5fa974a6fa202fc26ae(this, p0, p1, p2); }


public java.lang.Object deserialize__sourceBridge_592e56158a(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
return ((moom.Bx)(this)).a(((com.google.gson.JsonElement)(p0)), ((java.lang.reflect.Type)(p1)), ((com.google.gson.JsonDeserializationContext)(p2)));
}

public moom.Bw deserialize(com.google.gson.JsonElement __bridgeParam0, java.lang.reflect.Type __bridgeParam1, com.google.gson.JsonDeserializationContext __bridgeParam2) throws com.google.gson.JsonParseException { return ((moom.Bw)(this.deserialize__sourceBridge_592e56158a(((com.google.gson.JsonElement)(__bridgeParam0)), ((java.lang.reflect.Type)(__bridgeParam1)), ((com.google.gson.JsonDeserializationContext)(__bridgeParam2))))); }
public com.google.gson.JsonElement serialize__sourceBridge_aa40c1536e(java.lang.Object p0, java.lang.reflect.Type p1, com.google.gson.JsonSerializationContext p2) {
return ((moom.Bx)(this)).a(((moom.Bw)(((moom.Bw)(p0)))), ((java.lang.reflect.Type)(p1)), ((com.google.gson.JsonSerializationContext)(p2)));
}

public com.google.gson.JsonElement serialize(moom.Bw __bridgeParam0, java.lang.reflect.Type __bridgeParam1, com.google.gson.JsonSerializationContext __bridgeParam2) { return ((com.google.gson.JsonElement)(this.serialize__sourceBridge_aa40c1536e(((java.lang.Object)(__bridgeParam0)), ((java.lang.reflect.Type)(__bridgeParam1)), ((com.google.gson.JsonSerializationContext)(__bridgeParam2))))); }
}
