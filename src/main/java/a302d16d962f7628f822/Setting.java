package com.moon.setting;


public abstract class Setting<T> {

private java.lang.String id;

private T value;

private java.lang.String displayName;

private com.moon.cf type;

private com.moon.kR<T> changeListener;

private java.util.function.Supplier<java.lang.Boolean> availabilityPredicate;

private java.lang.String description;

private boolean grouped;

private com.moon.setting.SettingGroup group;

private static java.lang.String[] j;

private static long q;

protected Setting(java.lang.String p0, com.moon.cf p1) { super(); __sourceHandlerCall_4357c4fe6e23f89da516(this, p0, p1); }

private static native <E extends Throwable> void __sourceHandlerCall_4357c4fe6e23f89da516(com.moon.setting.Setting a0, java.lang.String a1, com.moon.cf a2) throws E;
private static final class __SourceHandler_4357c4fe6e23f89da516 {

public static void f485(com.moon.setting.Setting receiver, java.lang.String p0, com.moon.cf p1) throws Throwable {
    long local3_life1 = (__fieldRead485_0() ^ 34303865352638L);
    java.lang.String[] __sourceSpill485_3 = __call485_2();
    __directSuperInit485_4(receiver);
    __fieldWrite485_5(receiver, p0);
    __fieldWrite485_6(receiver, p1);
    java.lang.String[] local5_life7 = __sourceSpill485_3;
    __fieldWrite485_9(receiver, __originalDynamicSite485_8());
    if ((local5_life7 == null)) {
        __call485_10(new java.lang.String[2]);
    }
    return;
}
private static native long __fieldRead485_0();
private static native java.lang.String[] __call485_2();
private static native void __directSuperInit485_4(com.moon.setting.Setting a0);
private static native void __fieldWrite485_5(com.moon.setting.Setting a0, java.lang.String a1);
private static native void __fieldWrite485_6(com.moon.setting.Setting a0, com.moon.cf a1);
private static native java.util.function.Supplier __originalDynamicSite485_8();
private static native void __fieldWrite485_9(com.moon.setting.Setting a0, java.util.function.Supplier a1);
private static native void __call485_10(java.lang.String[] a0);

}


static {
q = ((long)(((moom._a)(moom._c.a(((long)(3042389635354244829L)), ((long)(-2982112010909806659L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(5529397975798L)))));
    if ((com.moon.setting.Setting.b__ArrayStringStatic() == null)) {
        com.moon.setting.Setting.b(((java.lang.String[])(new java.lang.String[5])));
    }
}


public java.lang.String getDisplayName() {
return this.displayName;
}


public boolean isGrouped() {
return ((((this.grouped) ? 1 : 0)) != 0);
}


public com.moon.setting.Setting<T> setDescription(java.lang.String p0) {
this.description = ((java.lang.String)(p0));
    return this;
}


public static void b(java.lang.String[] p0) {
j = ((java.lang.String[])(p0));
    return;
}


public static java.lang.String[] b__ArrayStringStatic() {
return com.moon.setting.Setting.j;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public java.lang.String getDescription() {
return this.description;
}


public com.moon.setting.Setting<T> setGroup(com.moon.setting.SettingGroup p0) {
this.group = ((com.moon.setting.SettingGroup)(p0));
    return this;
}


public com.moon.setting.Setting<T> setGrouped(boolean p0) {
this.grouped = ((boolean)(p0));
    return this;
}


public java.lang.String getId() {
return this.id;
}


public com.moon.setting.Setting<T> setAvailabilityPredicate(java.util.function.Supplier<java.lang.Boolean> p0) {
this.availabilityPredicate = ((java.util.function.Supplier)(p0));
    return this;
}


public void setValue(T p0) {
com.moon.setting.Setting forwardValue1397_18_0;
    com.moon.setting.Setting spill1397_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_18: {
    forward_join_17: {
    life2_3 = (com.moon.setting.Setting.q ^ 116763976832587L);
    life4_5 = com.moon.setting.Setting.b__ArrayStringStatic();
    spill1397_0 = this;
    if (!((life4_5 != null))) {
        forwardValue1397_18_0 = spill1397_0;
        break forward_join_18;
    }
    if (!((((com.moon.setting.Setting)(spill1397_0)).changeListener != null))) {
        break forward_join_17;
    }
    ((com.moon.kR)(this.changeListener)).accept(((java.lang.Object)(this.value)), ((java.lang.Object)(p0)));
    }
    forwardValue1397_18_0 = this;
    }
    ((com.moon.setting.Setting)(forwardValue1397_18_0)).value = ((java.lang.Object)(p0));
    return;
}


public boolean isAvailable() {
int forwardValue1396_24_0;
    boolean spill1396_0;
    boolean spill1396_1;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_24: {
    forward_join_19: {
    life1_3 = (com.moon.setting.Setting.q ^ 75276159819985L);
    life3_5 = com.moon.setting.Setting.b__ArrayStringStatic();
    spill1396_0 = this.grouped;
    if (!((life3_5 != null))) {
        forwardValue1396_24_0 = ((spill1396_0) ? 1 : 0);
        break forward_join_24;
    }
    if (!(spill1396_0)) {
        break forward_join_19;
    }
    spill1396_1 = ((com.moon.setting.SettingGroup)(this.group)).isAvailable();
    if (!((life3_5 != null))) {
        forwardValue1396_24_0 = ((spill1396_1) ? 1 : 0);
        break forward_join_24;
    }
    if (!((!spill1396_1))) {
        break forward_join_19;
    }
    return ((0) != 0);
    }
    forwardValue1396_24_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((java.util.function.Supplier)(this.availabilityPredicate)).get())))).booleanValue()) ? 1 : 0);
    }
    return ((forwardValue1396_24_0) != 0);
}


public abstract com.google.gson.JsonObject toJson();

public abstract void fromJson(com.google.gson.JsonObject p0);

public T getValue() {
return this.value;
}


public java.util.function.Supplier<java.lang.Boolean> getAvailabilityPredicate() {
return this.availabilityPredicate;
}


public com.moon.kR<T> getChangeListener() {
return this.changeListener;
}


public com.moon.cf getType() {
return this.type;
}


public com.moon.setting.Setting<T> setChangeListener(com.moon.kR<T> p0) {
this.changeListener = ((com.moon.kR)(p0));
    return this;
}


public com.moon.setting.SettingGroup getGroup() {
return this.group;
}


public com.moon.setting.Setting<T> setDisplayName(java.lang.String p0) {
this.displayName = ((java.lang.String)(p0));
    return this;
}


private static java.lang.Boolean lambda$new$0() {
return java.lang.Boolean.valueOf(((boolean)(true)));
}


private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_9f9996829ba4_originalDynamicSite485_8() throws E;
}
