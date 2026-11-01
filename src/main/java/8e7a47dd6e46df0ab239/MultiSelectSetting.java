package com.moon.setting;


public class MultiSelectSetting<T extends java.lang.Enum<T> & com.moon.l8> extends com.moon.setting.Setting<java.util.Map<T, java.lang.Boolean>> {

java.lang.Class<T> enumClass;

private static long l;

private static java.lang.String[] m;

private static java.lang.String[] n;

private static java.util.Map o;

protected MultiSelectSetting(java.lang.String p0, java.lang.Class<T> p1) { super((java.lang.String)null, (com.moon.cf)null); }


private static void __sourceConstructorBody_d98e5ae5ec8f6b92(com.moon.setting.MultiSelectSetting receiver, java.lang.String p0, java.lang.Class p1) throws Throwable {

long local3_life2;

    java.util.HashMap local6_life6;

    java.lang.Enum[] local7_life9;

    int local8_life12;

    net.minecraft.entity.Entity[] local5_life13;

    int local9_life14;

    java.lang.Enum local10_life15;

    init_join_47: {

    init_join_44: {

    local3_life2 = (com.moon.setting.MultiSelectSetting.l ^ 15334119656138L);

    com.moon.setting.MultiSelectSetting.__sourceConstructorInit_d98e5ae5ec8f6b92_0(((com.moon.setting.MultiSelectSetting)(receiver)), ((java.lang.String)(p0)), ((com.moon.cf)(com.moon.cf.MULTIPLE_CHOICE)));

    ((com.moon.setting.MultiSelectSetting)(receiver)).enumClass = ((java.lang.Class)(p1));

    local6_life6 = new java.util.HashMap();

    local7_life9 = ((java.lang.Enum[])(((java.lang.Class)(p1)).getEnumConstants()));

    net.minecraft.entity.Entity[] __sourceSpill426_11 = com.moon.setting.BooleanSetting.a();

    local8_life12 = (local7_life9).length;

    local5_life13 = __sourceSpill426_11;

    local9_life14 = 0;

    init_cycle_26: while (true) {

    if (!((local9_life14 < local8_life12))) {

        break init_join_44;

    }

    local10_life15 = (local7_life9)[local9_life14];

    ((java.util.HashMap)(local6_life6)).put(((java.lang.Object)(local10_life15)), ((java.lang.Object)(java.lang.Boolean.valueOf(((boolean)(false))))));

    local9_life14 += 1;

    if (!((local5_life13 != null))) {

        break init_join_47;

    }

    if (!((local5_life13 == null))) { continue init_cycle_26; }

    break init_cycle_26;

    }

    }

    ((com.moon.setting.MultiSelectSetting)(receiver)).setValue(((java.lang.Object)(local6_life6)));

    }

    return;

}



static {
l = ((long)(((moom._a)(moom._c.a(((long)(-1379692660571283619L)), ((long)(-6275366219126356544L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(240047066343139L)))));
    o = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.setting.MultiSelectSetting.l ^ 75362987949877L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill464_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill464_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill464_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill464_14 = new byte[8];
    (__sourceSpill464_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill464_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation464_16 = __sourceSpill464_14;
    ((javax.crypto.Cipher)(__sourceSpill464_11)).init(((int)(__sourceSpill464_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill464_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation464_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[3];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "¡êÖW\024 9\\\nQ¨\013R`\020Ó¸~sí%w÷ì'¥ðÕúy\020½\177ÄË\036-\001CW´òD<"))).length();
    int local5_life24 = 16;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill464_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill464_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill464_29)).doFinal(((byte[])(__sourceSpill464_28)));
        java.lang.String __sourceSpill464_34 = ((java.lang.String)(com.moon.setting.MultiSelectSetting.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill464_35 = local9_life19;
        int __sourceSpill464_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill464_35)[__sourceSpill464_36] = __sourceSpill464_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    m = ((java.lang.String[])(local9_life19));
    n = ((java.lang.String[])(new java.lang.String[3]));
}

private static native <E extends Throwable> void __sourceConstructorInit_d98e5ae5ec8f6b92_0(com.moon.setting.MultiSelectSetting a0, java.lang.String a1, com.moon.cf a2) throws E;

private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3610_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/k4"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public T[] getValues() {
return (((T[])((java.lang.Enum[])(((java.lang.Class)(this.enumClass)).getEnumConstants()))));
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
        byte[] spill1736_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1736_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1736_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1736_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1736_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1736_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 20109);
    if (((com.moon.setting.MultiSelectSetting.n)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.setting.MultiSelectSetting.o)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.setting.MultiSelectSetting.o)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/k4", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.setting.MultiSelectSetting.m)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.setting.MultiSelectSetting.n)[life5_8] = com.moon.setting.MultiSelectSetting.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.setting.MultiSelectSetting.n)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.setting.MultiSelectSetting.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean isSelected(T p0) {
return (__sourceIntrinsic_booleanComparison((((java.lang.Boolean)(((java.lang.Boolean)(((java.util.Map)(((java.util.Map)(((com.moon.setting.MultiSelectSetting)(this)).getValue())))).get(((java.lang.Object)(p0))))))).booleanValue())) != 0);
}


public void setSelected(T p0, boolean p1) {
com.moon.kR forwardValue1394_30_0;
    net.minecraft.entity.Entity[] spill1394_0;
    com.moon.kR spill1394_1;
    long life3_3;
    java.util.HashMap life6_10;
    java.util.Map life7_15;
    net.minecraft.entity.Entity[] life5_16;
    forward_join_33: {
    forward_join_30: {
    life3_3 = (com.moon.setting.MultiSelectSetting.l ^ 36241002636253L);
    life6_10 = new java.util.HashMap(((java.util.Map)(((com.moon.setting.MultiSelectSetting)(this)).getValue())));
    spill1394_0 = com.moon.setting.BooleanSetting.a();
    life7_15 = ((java.util.Map)(((com.moon.setting.MultiSelectSetting)(this)).getValue()));
    life5_16 = spill1394_0;
    ((java.util.Map)(life7_15)).put(((java.lang.Object)(p0)), ((java.lang.Object)(java.lang.Boolean.valueOf(((boolean)(p1))))));
    spill1394_1 = ((com.moon.setting.MultiSelectSetting)(this)).getChangeListener();
    if (!((life5_16 != null))) {
        forwardValue1394_30_0 = spill1394_1;
        break forward_join_30;
    }
    if (!((spill1394_1 != null))) {
        break forward_join_33;
    }
    forwardValue1394_30_0 = ((com.moon.setting.MultiSelectSetting)(this)).getChangeListener();
    }
    ((com.moon.kR)(forwardValue1394_30_0)).accept(((java.lang.Object)(life6_10)), ((java.lang.Object)(life7_15)));
    }
    return;
}


public void toggle(T p0) {
java.util.Map forwardValue1395_30_0;
    java.lang.Enum forwardValue1395_30_1;
    int forwardValue1395_30_2;
    java.util.Map forwardValue1395_31_0;
    java.lang.Enum forwardValue1395_31_1;
    java.util.Map forwardValue1395_32_0;
    java.lang.Enum forwardValue1395_32_1;
    int forwardValue1395_32_2;
    com.moon.kR forwardValue1395_42_0;
    net.minecraft.entity.Entity[] spill1395_0;
    java.util.Map spill1395_1;
    java.lang.Enum spill1395_2;
    boolean spill1395_3;
    com.moon.kR spill1395_4;
    long life2_3;
    java.util.HashMap life5_11;
    java.util.Map life6_15;
    java.lang.Boolean life7_20;
    net.minecraft.entity.Entity[] life4_21;
    forward_join_45: {
    forward_join_42: {
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    life2_3 = (com.moon.setting.MultiSelectSetting.l ^ 9399891446255L);
    spill1395_0 = com.moon.setting.BooleanSetting.a();
    life5_11 = new java.util.HashMap(((java.util.Map)(((com.moon.setting.MultiSelectSetting)(this)).getValue())));
    life6_15 = ((java.util.Map)(((com.moon.setting.MultiSelectSetting)(this)).getValue()));
    life7_20 = ((java.lang.Boolean)(((java.util.Map)(life6_15)).get(((java.lang.Object)(p0)))));
    life4_21 = spill1395_0;
    spill1395_1 = life6_15;
    spill1395_2 = p0;
    spill1395_3 = ((java.lang.Boolean)(life7_20)).booleanValue();
    if (!((life4_21 != null))) {
        forwardValue1395_30_0 = spill1395_1;
        forwardValue1395_30_1 = spill1395_2;
        forwardValue1395_30_2 = ((spill1395_3) ? 1 : 0);
        break forward_join_30;
    }
    if (!((!spill1395_3))) {
        forwardValue1395_31_0 = spill1395_1;
        forwardValue1395_31_1 = spill1395_2;
        break forward_join_31;
    }
    forwardValue1395_30_0 = spill1395_1;
    forwardValue1395_30_1 = spill1395_2;
    forwardValue1395_30_2 = 1;
    }
    forwardValue1395_32_0 = forwardValue1395_30_0;
    forwardValue1395_32_1 = forwardValue1395_30_1;
    forwardValue1395_32_2 = forwardValue1395_30_2;
    break forward_join_32;
    }
    forwardValue1395_32_0 = forwardValue1395_31_0;
    forwardValue1395_32_1 = forwardValue1395_31_1;
    forwardValue1395_32_2 = 0;
    }
    ((java.util.Map)(forwardValue1395_32_0)).put(((java.lang.Object)(forwardValue1395_32_1)), ((java.lang.Object)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue1395_32_2)))))));
    spill1395_4 = ((com.moon.setting.MultiSelectSetting)(this)).getChangeListener();
    if (!((life4_21 != null))) {
        forwardValue1395_42_0 = spill1395_4;
        break forward_join_42;
    }
    if (!((spill1395_4 != null))) {
        break forward_join_45;
    }
    forwardValue1395_42_0 = ((com.moon.setting.MultiSelectSetting)(this)).getChangeListener();
    }
    ((com.moon.kR)(forwardValue1395_42_0)).accept(((java.lang.Object)(life5_11)), ((java.lang.Object)(life6_15)));
    }
    return;
}


public static <T extends java.lang.Enum<T> & com.moon.l8> com.moon.mi<T> builder(java.lang.String p0, java.lang.Class<T> p1) {
return new com.moon.mi(p0, p1);
}


public com.google.gson.JsonObject toJson() {
long local1 = (com.moon.setting.MultiSelectSetting.l ^ 114880645335120L);
    com.google.gson.JsonObject local3 = new com.google.gson.JsonObject();
    com.google.gson.JsonArray local4 = new com.google.gson.JsonArray();
    ((com.google.gson.JsonObject)(local3)).addProperty(((java.lang.String)(__sourceIntrinsic_55789b9cab72_originalDynamicSite1046_1(5793, (4518298397660560741L ^ local1)))), ((java.lang.String)(((com.moon.setting.MultiSelectSetting)(this)).getId())));
    ((java.util.Map)(((java.util.Map)(((com.moon.setting.MultiSelectSetting)(this)).getValue())))).forEach(((java.util.function.BiConsumer)(__sourceIntrinsic_55789b9cab72_originalDynamicSite1046_6(local4))));
    ((com.google.gson.JsonObject)(local3)).add(((java.lang.String)(__sourceIntrinsic_55789b9cab72_originalDynamicSite1046_8(5214, (2165805128830074776L ^ local1)))), ((com.google.gson.JsonElement)(local4)));
    return local3;
}


public void fromJson(com.google.gson.JsonObject p0) {
com.google.gson.JsonObject lexicalValue456_28_0;
    java.lang.String lexicalValue456_28_1;
    com.google.gson.JsonObject spill456_0;
    java.lang.String spill456_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    com.google.gson.JsonArray life5_36;
    java.util.Iterator life6_39;
    com.google.gson.JsonElement life7_46;
    java.lang.String life8_49;
    lexical_join_53: {
    lexical_join_28: {
    life2_3 = (com.moon.setting.MultiSelectSetting.l ^ 75429455038420L);
    life4_5 = com.moon.setting.BooleanSetting.a();
    spill456_0 = p0;
    spill456_1 = __sourceIntrinsic_6ac6dd84f129_invokedynamic456_2(28202, (2771147190452013675L ^ life2_3));
    if (!((life4_5 != null))) {
        lexicalValue456_28_0 = spill456_0;
        lexicalValue456_28_1 = spill456_1;
        break lexical_join_28;
    }
    if (!(((com.google.gson.JsonObject)(spill456_0)).has(((java.lang.String)(spill456_1))))) {
        break lexical_join_53;
    }
    ((java.util.Map)(((java.util.Map)(((com.moon.setting.MultiSelectSetting)(this)).getValue())))).forEach(((java.util.function.BiConsumer)(__sourceIntrinsic_6ac6dd84f129_invokedynamic456_6(this))));
    lexicalValue456_28_0 = p0;
    lexicalValue456_28_1 = __sourceIntrinsic_6ac6dd84f129_invokedynamic456_8(28202, (2771147190452013675L ^ life2_3));
    }
    life5_36 = ((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(lexicalValue456_28_0)).get(((java.lang.String)(lexicalValue456_28_1))))).getAsJsonArray();
    life6_39 = ((com.google.gson.JsonArray)(life5_36)).iterator();
    lexical_cycle_34: while (true) {
    if (!(((java.util.Iterator)(life6_39)).hasNext())) {
        break lexical_join_53;
    }
    life7_46 = ((com.google.gson.JsonElement)(((java.util.Iterator)(life6_39)).next()));
    life8_49 = ((com.google.gson.JsonElement)(life7_46)).getAsString();
    ((java.util.Map)(((java.util.Map)(((com.moon.setting.MultiSelectSetting)(this)).getValue())))).forEach(((java.util.function.BiConsumer)(__sourceIntrinsic_6ac6dd84f129_invokedynamic456_18(this, life8_49))));
    if (!((life4_5 == null))) { continue lexical_cycle_34; }
    break lexical_cycle_34;
    }
    }
    return;
}


private void lambda$fromObject$2(java.lang.String p0, java.lang.Enum p1, java.lang.Boolean p2) {
long local4 = (com.moon.setting.MultiSelectSetting.l ^ 122795672490023L);
    if ((__sourceIntrinsic_booleanComparison(((java.lang.String)(((java.lang.Enum)(p1)).name())).equals(((java.lang.Object)(p0)))) != 0)) {
        ((com.moon.setting.MultiSelectSetting)(this)).setSelected(((java.lang.Enum)(p1)), ((boolean)(true)));
    }
    return;
}


private void lambda$fromObject$1(java.lang.Enum p0, java.lang.Boolean p1) {
((com.moon.setting.MultiSelectSetting)(this)).setSelected(((java.lang.Enum)(p0)), ((boolean)(false)));
    return;
}


private static void lambda$toObject$0(com.google.gson.JsonArray p0, java.lang.Enum p1, java.lang.Boolean p2) {
long local3 = (com.moon.setting.MultiSelectSetting.l ^ 108111994642011L);
    if ((__sourceIntrinsic_booleanComparison(((java.lang.Boolean)(p2)).booleanValue()) != 0)) {
        ((com.google.gson.JsonArray)(p0)).add(((java.lang.String)(((java.lang.Enum)(p1)).name())));
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3610_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6ac6dd84f129_invokedynamic456_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.BiConsumer __sourceIntrinsic_6ac6dd84f129_invokedynamic456_6(com.moon.setting.MultiSelectSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6ac6dd84f129_invokedynamic456_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.BiConsumer __sourceIntrinsic_6ac6dd84f129_invokedynamic456_18(com.moon.setting.MultiSelectSetting a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_55789b9cab72_originalDynamicSite1046_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.BiConsumer __sourceIntrinsic_55789b9cab72_originalDynamicSite1046_6(com.google.gson.JsonArray a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_55789b9cab72_originalDynamicSite1046_8(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
