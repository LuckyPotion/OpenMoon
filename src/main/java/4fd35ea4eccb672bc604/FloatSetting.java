package com.moon.setting;


public class FloatSetting extends com.moon.setting.Setting<java.lang.Float> {

private float sliderValue;

private float min;

private float max;

private float step;

private float dragMin;

private static java.lang.String[] p;

private static final long r;

private static final java.lang.String[] s;

private static final java.lang.String[] t;

private static final java.util.Map u;

public FloatSetting(java.lang.String p0) {
super(p0, com.moon.cf.FLOAT);
}


static {
r = ((long)(((moom._a)(moom._c.a(((long)(5190456075550507847L)), ((long)(-6057782703956923979L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(251015108481448L)))));
    java.lang.Object __sourceSpill461_6 = null;
    u = ((java.util.Map)(new java.util.HashMap(13)));
    com.moon.setting.FloatSetting.a(((java.lang.String[])(__sourceSpill461_6)));
    long local0_life9 = (com.moon.setting.FloatSetting.r ^ 25792008663892L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill461_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill461_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill461_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill461_16 = new byte[8];
    (__sourceSpill461_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill461_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation461_18 = __sourceSpill461_16;
    ((javax.crypto.Cipher)(__sourceSpill461_13)).init(((int)(__sourceSpill461_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill461_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation461_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life21 = new java.lang.String[3];
    int local7_life22 = 0;
    java.lang.String local6_life23;
    int local8_life25 = ((java.lang.String)((local6_life23 = "·gjª\177î|9hã¾ÛLµ\020Dá9\026dåy×kÉ\t£%!6\020*_Ñ\000\177õÈÌÏÛGo\006"))).length();
    int local5_life26 = 16;
    int local4_life27 = -1;
    while (true) {
        local4_life27 += 1;
        byte[] __sourceSpill461_30 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill461_31 = local2_life11;
        byte[] local10_life33 = ((javax.crypto.Cipher)(__sourceSpill461_31)).doFinal(((byte[])(__sourceSpill461_30)));
        java.lang.String __sourceSpill461_36 = ((java.lang.String)(com.moon.setting.FloatSetting.a(((byte[])(local10_life33))))).intern();
        java.lang.String[] __sourceSpill461_37 = local9_life21;
        int __sourceSpill461_38 = local7_life22;
        local7_life22 += 1;
        (__sourceSpill461_37)[__sourceSpill461_38] = __sourceSpill461_36;
        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }
        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));
    }
    s = ((java.lang.String[])(local9_life21));
    t = ((java.lang.String[])(new java.lang.String[3]));
}


public float getMin() {
return this.min;
}


public void setMin(float p0) {
this.min = ((float)(p0));
    return;
}


public float getDragMin() {
return this.dragMin;
}


public void setDragMin(float p0) {
this.dragMin = ((float)(p0));
    return;
}


public void setMax(float p0) {
this.max = ((float)(p0));
    return;
}


public float getMax() {
return this.max;
}


public void setStep(float p0) {
this.step = ((float)(p0));
    return;
}


public float getStep() {
return this.step;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3598_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/kZ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static java.lang.String[] a() {
return com.moon.setting.FloatSetting.p;
}


public static void a(java.lang.String[] p0) {
p = ((java.lang.String[])(p0));
    return;
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
        byte[] spill1731_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1731_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1731_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1731_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1731_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1731_2)[life4_9];
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
    java.lang.String local7 = com.moon.setting.FloatSetting.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 10829);
    if (((com.moon.setting.FloatSetting.t)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.setting.FloatSetting.u)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.setting.FloatSetting.u)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/kZ", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.setting.FloatSetting.s)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.setting.FloatSetting.t)[life5_8] = com.moon.setting.FloatSetting.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.setting.FloatSetting.t)[life5_8];
}


public void setValue(java.lang.Float p0) {
p0 = java.lang.Float.valueOf(((float)(moom.Dr.a(((float)(((java.lang.Float)(p0)).floatValue())), ((float)(this.min)), ((float)(this.max))))));
    double local2 = com.moon.nI.a(((double)(moom.Dr.a(((double)((((double) this.step) * java.lang.Math.ceil(((double)(((double) (((java.lang.Float)(p0)).floatValue() / this.step)))))))), ((double)(((double) this.min))), ((double)(((double) this.max)))))), ((int)(3)));
    ((com.moon.setting.FloatSetting)(this)).setSliderValue(((float)(((java.lang.Float)(p0)).floatValue())));
    super.setValue(((java.lang.Float.valueOf(((float)(((float) local2)))))));
    return;
}


public void setSliderValue(float p0) {
this.sliderValue = ((float)(p0));
    return;
}


public float getSliderValue() {
return this.sliderValue;
}


public static com.moon.md builder(java.lang.String p0) {
return new com.moon.md(p0);
}


public com.google.gson.JsonObject toJson() {
long local1 = (com.moon.setting.FloatSetting.r ^ 3301090488820L);
    com.google.gson.JsonObject local3 = new com.google.gson.JsonObject();
    ((com.google.gson.JsonObject)(local3)).addProperty(((java.lang.String)(__sourceIntrinsic_55789b9cab72_originalDynamicSite1043_1(5202, (7917000250178427734L ^ local1)))), ((java.lang.String)(((com.moon.setting.FloatSetting)(this)).getId())));
    ((com.google.gson.JsonObject)(local3)).addProperty(((java.lang.String)(__sourceIntrinsic_55789b9cab72_originalDynamicSite1043_4(11461, (7816358688462824387L ^ local1)))), ((java.lang.Number)(((java.lang.Number)(((com.moon.setting.FloatSetting)(this)).getValue())))));
    return local3;
}


public void fromJson(com.google.gson.JsonObject p0) {
long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_37: {
    forward_join_26: {
    life2_3 = (com.moon.setting.FloatSetting.r ^ 52645251415664L);
    life4_5 = com.moon.setting.BooleanSetting.a();
    if (!((life4_5 != null))) { break forward_join_26; }
    if (!(((com.google.gson.JsonObject)(p0)).has(((java.lang.String)(__sourceIntrinsic_6ac6dd84f129_invokedynamic1732_2(8401, (8380370012467552336L ^ life2_3))))))) { break forward_join_37; }
    ((com.moon.setting.FloatSetting)(this)).setSliderValue(((float)(((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(p0)).get(((java.lang.String)(__sourceIntrinsic_6ac6dd84f129_invokedynamic1732_4(11461, (7816388792093011015L ^ life2_3))))))).getAsFloat())));
    }
    ((com.moon.setting.FloatSetting)(this)).setValue(((java.lang.Float)(java.lang.Float.valueOf(((float)(((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(p0)).get(((java.lang.String)(__sourceIntrinsic_6ac6dd84f129_invokedynamic1732_8(11461, (7816388792093011015L ^ life2_3))))))).getAsFloat()))))));
    }
    return;
}


public void setValue__sourceBridge_f286d6bd4c(java.lang.Object p0) {
((com.moon.setting.FloatSetting)(this)).setValue(((java.lang.Float)(((java.lang.Float)(p0)))));
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3598_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_55789b9cab72_originalDynamicSite1043_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_55789b9cab72_originalDynamicSite1043_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6ac6dd84f129_invokedynamic1732_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6ac6dd84f129_invokedynamic1732_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6ac6dd84f129_invokedynamic1732_8(int a0, long a1) throws E;


}
