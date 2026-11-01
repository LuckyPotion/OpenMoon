package com.moon.setting;


public class EnumSetting<T extends java.lang.Enum<T> & com.moon.l8 & com.moon.kS<?>> extends com.moon.setting.Setting<T> {

private com.moon.kR<T> enumChangeListener;

java.lang.Class<T> enumClass;

private static final long m;

private static final java.lang.String[] n;

private static final java.lang.String[] o;

private static final java.util.Map p;

protected EnumSetting(java.lang.String p0, java.lang.Class<T> p1, com.moon.module.Module p2) {
super(p0, com.moon.cf.MODE);
    this.enumChangeListener = ((com.moon.kR)(null));
    this.enumClass = ((java.lang.Class)(p1));
    ((com.moon.setting.EnumSetting)(this)).setChangeListener(((com.moon.kR)(__sourceIntrinsic_c39f96076568_originalDynamicSite3299_3(this, p2))));
    return;
}


static {
m = ((long)(((moom._a)(moom._c.a(((long)(-8091536682848365610L)), ((long)(-5185675247506506079L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(258407103139601L)))));
    p = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.setting.EnumSetting.m ^ 41055979750260L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill460_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill460_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill460_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill460_14 = new byte[8];
    (__sourceSpill460_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill460_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation460_16 = __sourceSpill460_14;
    ((javax.crypto.Cipher)(__sourceSpill460_11)).init(((int)(__sourceSpill460_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill460_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation460_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[3];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "ò´f°¡r×ÎhE¹R\n\020Ñ¢[Z?à¤|<Òåú\tdµò\020\"Ã\b\006vÙJÇ¯iÛÌã©|"))).length();
    int local5_life24 = 16;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill460_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill460_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill460_29)).doFinal(((byte[])(__sourceSpill460_28)));
        java.lang.String __sourceSpill460_34 = ((java.lang.String)(com.moon.setting.EnumSetting.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill460_35 = local9_life19;
        int __sourceSpill460_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill460_35)[__sourceSpill460_36] = __sourceSpill460_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    n = ((java.lang.String[])(local9_life19));
    o = ((java.lang.String[])(new java.lang.String[3]));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.String a(byte[] p0) {
int life1_1;
    int life2_5;
    char[] life3_7;
    int life4_9;
    int life5_19;
    int life6_39;
    int life5_44;
    int life6_52;
    int life6_71;
    int life5_76;
    int life6_86;
    int life5_91;
    int life6_99;
    life1_1 = 0;
    life3_7 = new char[(life2_5 = (p0).length)];
    life4_9 = 0;
    loop_region_10: while ((life4_9 < life2_5)) {
        if (((life5_19 = (255 & (p0)[life4_9])) < 192)) {
        (life3_7)[(life1_1++)] = ((char) life5_19);
    } else {
        if ((life5_19 < 224)) {
        life6_39 = ((int)(((char) (((char) (life5_19 & 31)) << 6))));
        byte[] spill1729_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1729_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1729_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1729_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1729_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1729_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 1423);
    if (((com.moon.setting.EnumSetting.o)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.setting.EnumSetting.p)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.setting.EnumSetting.p)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/k2", life9_51);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_71: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life4_21)[1])))).generateSecret(((java.security.spec.KeySpec)(life7_92)));
        ((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).init(((int)(2)), ((java.security.Key)(life8_99)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life4_21)[2])))));
        life9_116 = ((java.lang.String)((com.moon.setting.EnumSetting.n)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.setting.EnumSetting.o)[life5_8] = com.moon.setting.EnumSetting.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.setting.EnumSetting.o)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.setting.EnumSetting.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3595_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/k2"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public T[] getValues() {
return (((T[])((java.lang.Enum[])(((java.lang.Class)(this.enumClass)).getEnumConstants()))));
}


public com.google.gson.JsonObject toJson() {
long local1 = (com.moon.setting.EnumSetting.m ^ 78789340678708L);
    com.google.gson.JsonObject local3 = new com.google.gson.JsonObject();
    ((com.google.gson.JsonObject)(local3)).addProperty(((java.lang.String)(__sourceIntrinsic_55789b9cab72_originalDynamicSite1042_1(7929, (3435527417697730110L ^ local1)))), ((java.lang.String)(((com.moon.setting.EnumSetting)(this)).getId())));
    ((com.google.gson.JsonObject)(local3)).addProperty(((java.lang.String)(__sourceIntrinsic_55789b9cab72_originalDynamicSite1042_4(28794, (8227572378822283454L ^ local1)))), ((java.lang.Number)(java.lang.Integer.valueOf(((int)(((java.lang.Enum)(((java.lang.Enum)(((com.moon.setting.EnumSetting)(this)).getValue())))).ordinal()))))));
    return local3;
}


public void fromJson(com.google.gson.JsonObject p0) {
long local2 = (com.moon.setting.EnumSetting.m ^ 117963012752816L);
    if (((com.google.gson.JsonObject)(p0)).has(((java.lang.String)(__sourceIntrinsic_6ac6dd84f129_invokedynamic3596_1(9654, (2512665664655018740L ^ local2)))))) {
        ((com.moon.setting.EnumSetting)(this)).setValue(((java.lang.Object)((((com.moon.setting.EnumSetting)(this)).getValues())[((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(p0)).get(((java.lang.String)(__sourceIntrinsic_6ac6dd84f129_invokedynamic3596_4(28794, (8227541732935704378L ^ local2))))))).getAsInt()])));
    }
    return;
}


public static <T extends java.lang.Enum<T> & com.moon.l8 & com.moon.kS<?>> com.moon.mg<T> builder(java.lang.String p0, java.lang.Class<T> p1, com.moon.module.Module p2) {
return new com.moon.mg(p0, p1, p2);
}


private void lambda$new$0(com.moon.module.Module p0, java.lang.Enum p1, java.lang.Enum p2) {
com.moon.kR forwardValue1392_29_0;
    com.moon.kR spill1392_0;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    com.moon.events.EventBus life7_11;
    forward_join_32: {
    forward_join_29: {
    forward_join_22: {
    life4_3 = (com.moon.setting.EnumSetting.m ^ 21651003654135L);
    life6_5 = com.moon.setting.BooleanSetting.a();
    if (!(((com.moon.module.Module)(p0)).isEnabled())) {
        break forward_join_22;
    }
    life7_11 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus();
    ((com.moon.events.EventBus)(life7_11)).unsubscribe(((java.lang.Object)(((com.moon.kS)(((com.moon.kS)(p1)))).a())));
    ((com.moon.events.EventBus)(life7_11)).subscribe(((java.lang.Object)(((com.moon.kS)(((com.moon.kS)(p2)))).a())));
    }
    spill1392_0 = this.enumChangeListener;
    if (!((life6_5 != null))) {
        forwardValue1392_29_0 = spill1392_0;
        break forward_join_29;
    }
    if (!((spill1392_0 != null))) {
        break forward_join_32;
    }
    forwardValue1392_29_0 = this.enumChangeListener;
    }
    ((com.moon.kR)(forwardValue1392_29_0)).accept(((java.lang.Object)(p1)), ((java.lang.Object)(p2)));
    }
    return;
}


private static native <E extends Throwable> com.moon.kR __sourceIntrinsic_c39f96076568_originalDynamicSite3299_3(com.moon.setting.EnumSetting a0, com.moon.module.Module a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3595_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_55789b9cab72_originalDynamicSite1042_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_55789b9cab72_originalDynamicSite1042_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6ac6dd84f129_invokedynamic3596_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6ac6dd84f129_invokedynamic3596_4(int a0, long a1) throws E;
}
