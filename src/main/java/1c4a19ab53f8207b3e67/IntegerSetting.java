package com.moon.setting;


public class IntegerSetting extends com.moon.setting.Setting<java.lang.Integer> {

private float sliderValue;

private int min;

private int max;

private int step;

private static final long o;

private static final java.lang.String[] p;

private static final java.lang.String[] r;

private static final java.util.Map s;

private IntegerSetting(java.lang.String p0) {
super(p0, com.moon.cf.INTEGER);
}


static {
o = ((long)(((moom._a)(moom._c.a(((long)(1036208462591396735L)), ((long)(4400430412791961336L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(48676692309349L)))));
    s = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.setting.IntegerSetting.o ^ 112663822727787L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill462_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill462_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill462_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill462_14 = new byte[8];
    (__sourceSpill462_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill462_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation462_16 = __sourceSpill462_14;
    ((javax.crypto.Cipher)(__sourceSpill462_11)).init(((int)(__sourceSpill462_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill462_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation462_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[3];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "\177¸\027Þ2\177>û0AazÎÐ\020ç1ºµ'\bÇÑ¼\004ÚM¨±\020å\020a#Y\016·.G³è7ç´"))).length();
    int local5_life24 = 16;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill462_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill462_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill462_29)).doFinal(((byte[])(__sourceSpill462_28)));
        java.lang.String __sourceSpill462_34 = ((java.lang.String)(com.moon.setting.IntegerSetting.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill462_35 = local9_life19;
        int __sourceSpill462_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill462_35)[__sourceSpill462_36] = __sourceSpill462_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    p = ((java.lang.String[])(local9_life19));
    r = ((java.lang.String[])(new java.lang.String[3]));
}


public void setValueFromSlider(float p0) {
p0 = moom.Dr.a(((float)(p0)), ((float)(((float) this.min))), ((float)(((float) this.max))));
    int local2 = ((int) com.moon.nI.a(((double)(moom.Dr.a(((double)((((double) this.step) * java.lang.Math.ceil(((double)(((double) (p0 / ((float) this.step))))))))), ((double)(((double) this.min))), ((double)(((double) this.max)))))), ((int)(2))));
    ((com.moon.setting.IntegerSetting)(this)).setSliderValue(((float)(p0)));
    super.setValue(((java.lang.Integer.valueOf(((int)(local2))))));
    return;
}


public void setMax(int p0) {
this.max = ((int)(p0));
    return;
}


public int getMax() {
return this.max;
}


public int getStep() {
return this.step;
}


public void setStep(int p0) {
this.step = ((int)(p0));
    return;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.setting.IntegerSetting.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3602_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/k1"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void fromJson(com.google.gson.JsonObject p0) {
long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_38: {
    forward_join_27: {
    life2_3 = (com.moon.setting.IntegerSetting.o ^ 1567712484982L);
    life4_5 = com.moon.setting.BooleanSetting.a();
    if (!((life4_5 != null))) { break forward_join_27; }
    if (!(((com.google.gson.JsonObject)(p0)).has(((java.lang.String)(__sourceIntrinsic_6ac6dd84f129_invokedynamic1734_2(26706, (5246543466320816979L ^ life2_3))))))) { break forward_join_38; }
    ((com.moon.setting.IntegerSetting)(this)).setValueFromSlider(((float)(((float) ((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(p0)).get(((java.lang.String)(__sourceIntrinsic_6ac6dd84f129_invokedynamic1734_4(30497, (391951282515702817L ^ life2_3))))))).getAsInt()))));
    }
    ((com.moon.setting.IntegerSetting)(this)).setSliderValue(((float)(((float) ((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(p0)).get(((java.lang.String)(__sourceIntrinsic_6ac6dd84f129_invokedynamic1734_8(30497, (391951282515702817L ^ life2_3))))))).getAsInt()))));
    }
    return;
}


public void setValue__sourceBridge_f286d6bd4c(java.lang.Object p0) {
((com.moon.setting.IntegerSetting)(this)).setValue(((java.lang.Integer)(((java.lang.Integer)(p0)))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 27085);
    if (((com.moon.setting.IntegerSetting.r)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.setting.IntegerSetting.s)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.setting.IntegerSetting.s)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/k1", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.setting.IntegerSetting.p)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.setting.IntegerSetting.r)[life5_8] = com.moon.setting.IntegerSetting.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.setting.IntegerSetting.r)[life5_8];
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
        byte[] spill1733_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1733_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1733_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1733_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1733_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1733_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public int getMin() {
return this.min;
}


public void setSliderValue(float p0) {
this.sliderValue = ((float)(p0));
    return;
}


public float getSliderValue() {
return this.sliderValue;
}


public static com.moon.mf builder(java.lang.String p0) {
return new com.moon.mf(p0);
}


public void setMin(int p0) {
this.min = ((int)(p0));
    return;
}


public void setValue(java.lang.Integer p0) {
p0 = java.lang.Integer.valueOf(((int)(moom.Dr.a(((int)(((java.lang.Integer)(p0)).intValue())), ((int)(this.min)), ((int)(this.max))))));
    int local2 = ((int) com.moon.nI.a(((double)(moom.Dr.a(((double)((((double) this.step) * java.lang.Math.ceil(((double)(((double) (((java.lang.Integer)(p0)).floatValue() / ((float) this.step))))))))), ((double)(((double) this.min))), ((double)(((double) this.max)))))), ((int)(2))));
    ((com.moon.setting.IntegerSetting)(this)).setSliderValue(((float)(((float) ((java.lang.Integer)(p0)).intValue()))));
    super.setValue(((java.lang.Integer.valueOf(((int)(local2))))));
    return;
}


public com.google.gson.JsonObject toJson() {
long local1 = (com.moon.setting.IntegerSetting.o ^ 50083464942066L);
    com.google.gson.JsonObject local3 = new com.google.gson.JsonObject();
    ((com.google.gson.JsonObject)(local3)).addProperty(((java.lang.String)(__sourceIntrinsic_55789b9cab72_originalDynamicSite1044_1(4466, (3826782094015700468L ^ local1)))), ((java.lang.String)(((com.moon.setting.IntegerSetting)(this)).getId())));
    ((com.google.gson.JsonObject)(local3)).addProperty(((java.lang.String)(__sourceIntrinsic_55789b9cab72_originalDynamicSite1044_4(30497, (391902763120491429L ^ local1)))), ((java.lang.Number)(((java.lang.Number)(((com.moon.setting.IntegerSetting)(this)).getValue())))));
    return local3;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3602_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6ac6dd84f129_invokedynamic1734_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6ac6dd84f129_invokedynamic1734_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6ac6dd84f129_invokedynamic1734_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_55789b9cab72_originalDynamicSite1044_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_55789b9cab72_originalDynamicSite1044_4(int a0, long a1) throws E;


}
