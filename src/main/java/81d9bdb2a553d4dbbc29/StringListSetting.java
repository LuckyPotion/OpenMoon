package com.moon.setting;


public class StringListSetting extends com.moon.setting.Setting<java.lang.String> {

private final java.util.List<java.lang.String> values;

private java.util.function.Consumer<java.lang.String> l;

private java.util.function.Consumer<java.lang.String> changeConsumer;

private static final long n;

private static final java.lang.String[] o;

private static final java.lang.String[] p;

private static final java.util.Map r;

protected StringListSetting(java.lang.String p0) {
super(p0, com.moon.cf.MODULAR_LIST);
    this.values = new java.util.concurrent.CopyOnWriteArrayList();
}


static {
n = ((long)(((moom._a)(moom._c.a(((long)(2364168551951364671L)), ((long)(-8468602676243302372L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(39446939512104L)))));

    r = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (com.moon.setting.StringListSetting.n ^ 89011302714123L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill578_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill578_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill578_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill578_14 = new byte[8];

    (__sourceSpill578_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill578_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation578_16 = __sourceSpill578_14;

    ((javax.crypto.Cipher)(__sourceSpill578_11)).init(((int)(__sourceSpill578_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill578_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation578_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[5];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "\004ä\025!tZò­\017We\023i ¢°å[Lp0­6nù|FöÖ\022ÚäD#a`·o4\035ý\020ýÁãjgc¬º\006Æ¶·\002"))).length();

    int local5_life24 = 16;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill578_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill578_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill578_29)).doFinal(((byte[])(__sourceSpill578_28)));

        java.lang.String __sourceSpill578_34 = ((java.lang.String)(com.moon.setting.StringListSetting.a(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill578_35 = local9_life19;

        int __sourceSpill578_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill578_35)[__sourceSpill578_36] = __sourceSpill578_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "íW´S_SMN\031wfL\017wH\031\nFIyjÏ]X\035ì/Scä^\020\021åéìxÎ±\fK¤çýÚ\031w'"))).length();

    local5_life24 = 32;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill578_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill578_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill578_43)).doFinal(((byte[])(__sourceSpill578_42)));

        java.lang.String __sourceSpill578_48 = ((java.lang.String)(com.moon.setting.StringListSetting.a(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill578_49 = local9_life19;

        int __sourceSpill578_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill578_49)[__sourceSpill578_50] = __sourceSpill578_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    o = ((java.lang.String[])(local9_life19));

    p = ((java.lang.String[])(new java.lang.String[5]));
}


public void add(java.lang.String p0) {
int forwardValue1398_17_0;
    java.util.function.Consumer forwardValue1398_25_0;
    boolean spill1398_0;
    java.util.function.Consumer spill1398_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_27: {
    forward_join_25: {
    forward_join_17: {
    life2_3 = (com.moon.setting.StringListSetting.n ^ 3457174152409L);
    life4_5 = com.moon.setting.BooleanSetting.a();
    spill1398_0 = ((java.util.List)(this.values)).contains(((java.lang.Object)(p0)));
    if (!((life4_5 != null))) {
        forwardValue1398_17_0 = ((spill1398_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!((!spill1398_0))) {
        break forward_join_27;
    }
    forwardValue1398_17_0 = ((((java.util.List)(this.values)).add(((java.lang.Object)(p0)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue1398_17_0);
    spill1398_1 = this.changeConsumer;
    if (!((life4_5 != null))) {
        forwardValue1398_25_0 = spill1398_1;
        break forward_join_25;
    }
    if (!((spill1398_1 != null))) {
        break forward_join_27;
    }
    forwardValue1398_25_0 = this.changeConsumer;
    }
    ((java.util.function.Consumer)(forwardValue1398_25_0)).accept(((java.lang.Object)(p0)));
    }
    return;
}


public java.util.function.Consumer<java.lang.String> getChangeConsumer() {
return this.changeConsumer;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 5294);
    if (((com.moon.setting.StringListSetting.p)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.setting.StringListSetting.r)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.setting.StringListSetting.r)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/k3", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.setting.StringListSetting.o)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.setting.StringListSetting.p)[life5_8] = com.moon.setting.StringListSetting.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.setting.StringListSetting.p)[life5_8];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3620_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/k3"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
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
        byte[] spill1742_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1742_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1742_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1742_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1742_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1742_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.setting.StringListSetting.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void fromJson(com.google.gson.JsonObject p0) {
net.minecraft.entity.Entity[] spill457_0;
    long life2_3;
    com.google.gson.JsonArray life5_11;
    int life6_14;
    net.minecraft.entity.Entity[] life4_15;
    java.lang.String life7_24;
    lexical_join_43: {
    lexical_join_33: {
    life2_3 = (com.moon.setting.StringListSetting.n ^ 50202417618554L);
    life5_11 = ((com.google.gson.JsonObject)(p0)).getAsJsonArray(((java.lang.String)(__sourceIntrinsic_6ac6dd84f129_invokedynamic457_1(14820, (169419109912463238L ^ life2_3)))));
    spill457_0 = com.moon.setting.BooleanSetting.a();
    life6_14 = 0;
    life4_15 = spill457_0;
    lexical_cycle_16: while (true) {
    if (!((life6_14 < ((com.google.gson.JsonArray)(life5_11)).size()))) {
        break lexical_join_33;
    }
    life7_24 = ((com.google.gson.JsonElement)(((com.google.gson.JsonArray)(life5_11)).get(((int)(life6_14))))).getAsString();
    ((com.moon.setting.StringListSetting)(this)).add(((java.lang.String)(life7_24)));
    life6_14 += 1;
    if (!((life4_15 != null))) {
        break lexical_join_43;
    }
    if (!((life4_15 == null))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    ((com.moon.setting.StringListSetting)(this)).setValue(((((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(p0)).get(((java.lang.String)(__sourceIntrinsic_6ac6dd84f129_invokedynamic457_8(15407, (2294962350712865358L ^ life2_3))))))).getAsString())));
    }
    return;
}


public com.google.gson.JsonObject toJson() {
net.minecraft.entity.Entity[] spill458_0;
    long life1_3;
    com.google.gson.JsonObject life4_7;
    com.google.gson.JsonArray life5_21;
    java.util.Iterator life6_25;
    net.minecraft.entity.Entity[] life3_26;
    java.lang.String life7_33;
    lexical_join_59: {
    lexical_join_41: {
    life1_3 = (com.moon.setting.StringListSetting.n ^ 1414597562878L);
    life4_7 = new com.google.gson.JsonObject();
    ((com.google.gson.JsonObject)(life4_7)).addProperty(((java.lang.String)(__sourceIntrinsic_55789b9cab72_invokedynamic458_1(5309, (1282627851516765534L ^ life1_3)))), ((java.lang.String)(((com.moon.setting.StringListSetting)(this)).getId())));
    spill458_0 = com.moon.setting.BooleanSetting.a();
    life5_21 = new com.google.gson.JsonArray();
    life6_25 = ((java.util.List)(this.values)).iterator();
    life3_26 = spill458_0;
    lexical_cycle_27: while (true) {
    if (!(((java.util.Iterator)(life6_25)).hasNext())) {
        break lexical_join_41;
    }
    life7_33 = ((java.lang.String)(((java.util.Iterator)(life6_25)).next()));
    ((com.google.gson.JsonArray)(life5_21)).add(((java.lang.String)(life7_33)));
    if (!((life3_26 != null))) {
        break lexical_join_59;
    }
    if (!((life3_26 == null))) { continue lexical_cycle_27; }
    break lexical_cycle_27;
    }
    }
    ((com.google.gson.JsonObject)(life4_7)).add(((java.lang.String)(__sourceIntrinsic_55789b9cab72_invokedynamic458_11(19528, (8744147764342472108L ^ life1_3)))), ((com.google.gson.JsonElement)(life5_21)));
    ((com.google.gson.JsonObject)(life4_7)).addProperty(((java.lang.String)(__sourceIntrinsic_55789b9cab72_invokedynamic458_13(29153, (2865588895451447302L ^ life1_3)))), ((java.lang.String)(((java.lang.String)(((com.moon.setting.StringListSetting)(this)).getValue())))));
    }
    return life4_7;
}


public void remove(java.lang.String p0) {
com.moon.setting.StringListSetting forwardValue1400_14_0;
    java.util.function.Consumer forwardValue1400_20_0;
    com.moon.setting.StringListSetting spill1400_0;
    java.util.function.Consumer spill1400_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_22: {
    forward_join_20: {
    forward_join_14: {
    life2_3 = (com.moon.setting.StringListSetting.n ^ 43669282454085L);
    life4_5 = com.moon.setting.BooleanSetting.a();
    spill1400_0 = this;
    if (!((life4_5 != null))) {
        forwardValue1400_14_0 = spill1400_0;
        break forward_join_14;
    }
    if (!(((java.util.List)(((com.moon.setting.StringListSetting)(spill1400_0)).values)).remove(((java.lang.Object)(p0))))) {
        break forward_join_22;
    }
    forwardValue1400_14_0 = this;
    }
    spill1400_1 = ((com.moon.setting.StringListSetting)(forwardValue1400_14_0)).changeConsumer;
    if (!((life4_5 != null))) {
        forwardValue1400_20_0 = spill1400_1;
        break forward_join_20;
    }
    if (!((spill1400_1 != null))) {
        break forward_join_22;
    }
    forwardValue1400_20_0 = this.changeConsumer;
    }
    ((java.util.function.Consumer)(forwardValue1400_20_0)).accept(((java.lang.Object)(p0)));
    }
    return;
}


public boolean contains(java.lang.String p0) {
return (__sourceIntrinsic_booleanComparison((((java.util.List)(this.values)).contains(((java.lang.Object)(p0))))) != 0);
}


public static com.moon.mh builder(java.lang.String p0) {
return new com.moon.mh(p0);
}


public java.util.List<java.lang.String> getValues() {
return this.values;
}


public java.util.function.Consumer<java.lang.String> a() {
return this.l;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3620_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6ac6dd84f129_invokedynamic457_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6ac6dd84f129_invokedynamic457_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_55789b9cab72_invokedynamic458_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_55789b9cab72_invokedynamic458_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_55789b9cab72_invokedynamic458_13(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
