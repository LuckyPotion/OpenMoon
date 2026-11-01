package com.moon.setting;


public class BooleanSetting extends com.moon.setting.Setting<java.lang.Boolean> {

private static net.minecraft.entity.Entity[] k;

private static final long l;

private static final java.lang.String[] m;

private static final java.lang.String[] n;

private static final java.util.Map o;

private BooleanSetting(java.lang.String p0) {
super(p0, com.moon.cf.BOOLEAN);
}


static {
l = ((long)(((moom._a)(moom._c.a(((long)(6466932037666944293L)), ((long)(8223198575141092416L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(197433713774459L)))));
    net.minecraft.entity.Entity[] __sourceSpill458_6 = new net.minecraft.entity.Entity[4];
    o = ((java.util.Map)(new java.util.HashMap(13)));
    com.moon.setting.BooleanSetting.b(((net.minecraft.entity.Entity[])(__sourceSpill458_6)));
    long local0_life9 = (com.moon.setting.BooleanSetting.l ^ 17087916204139L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill458_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill458_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill458_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill458_16 = new byte[8];
    (__sourceSpill458_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill458_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation458_18 = __sourceSpill458_16;
    ((javax.crypto.Cipher)(__sourceSpill458_13)).init(((int)(__sourceSpill458_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill458_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation458_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life21 = new java.lang.String[3];
    int local7_life22 = 0;
    java.lang.String local6_life23;
    int local8_life25 = ((java.lang.String)((local6_life23 = "/\027\021=WÏ\031blÙÝfÈ\020ÒÏxûÍÛ&ß¬\021è<ÿS¤\020v xBqøïæ÷²Öu"))).length();
    int local5_life26 = 16;
    int local4_life27 = -1;
    while (true) {
        local4_life27 += 1;
        byte[] __sourceSpill458_30 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill458_31 = local2_life11;
        byte[] local10_life33 = ((javax.crypto.Cipher)(__sourceSpill458_31)).doFinal(((byte[])(__sourceSpill458_30)));
        java.lang.String __sourceSpill458_36 = ((java.lang.String)(com.moon.setting.BooleanSetting.a(((byte[])(local10_life33))))).intern();
        java.lang.String[] __sourceSpill458_37 = local9_life21;
        int __sourceSpill458_38 = local7_life22;
        local7_life22 += 1;
        (__sourceSpill458_37)[__sourceSpill458_38] = __sourceSpill458_36;
        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }
        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));
    }
    m = ((java.lang.String[])(local9_life21));
    n = ((java.lang.String[])(new java.lang.String[3]));
}


public static void b(net.minecraft.entity.Entity[] p0) {
com.moon.setting.BooleanSetting.k = ((net.minecraft.entity.Entity[])(p0));
    return;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 4953);
    if (((com.moon.setting.BooleanSetting.n)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.setting.BooleanSetting.o)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.setting.BooleanSetting.o)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/kV", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.setting.BooleanSetting.m)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.setting.BooleanSetting.n)[life5_8] = com.moon.setting.BooleanSetting.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.setting.BooleanSetting.n)[life5_8];
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
        byte[] spill1727_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1727_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1727_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1727_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1727_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1727_2)[life4_9];
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
    java.lang.String local7 = com.moon.setting.BooleanSetting.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3587_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/kV"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public com.google.gson.JsonObject toJson() {
long local1 = (com.moon.setting.BooleanSetting.l ^ 91177595205522L);
    com.google.gson.JsonObject local3 = new com.google.gson.JsonObject();
    ((com.google.gson.JsonObject)(local3)).addProperty(((java.lang.String)(__sourceIntrinsic_55789b9cab72_originalDynamicSite1040_1(32743, (1255429823849040375L ^ local1)))), ((java.lang.String)(((com.moon.setting.BooleanSetting)(this)).getId())));
    ((com.google.gson.JsonObject)(local3)).addProperty(((java.lang.String)(__sourceIntrinsic_55789b9cab72_originalDynamicSite1040_4(31998, (435693069442747116L ^ local1)))), ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this)).getValue())))));
    return local3;
}


public void fromJson(com.google.gson.JsonObject p0) {
long local2 = (com.moon.setting.BooleanSetting.l ^ 138594400172054L);
    if (((com.google.gson.JsonObject)(p0)).has(((java.lang.String)(__sourceIntrinsic_6ac6dd84f129_invokedynamic3588_1(17644, (7948814337585659257L ^ local2)))))) {
        ((com.moon.setting.BooleanSetting)(this)).setValue(((java.lang.Boolean.valueOf(((boolean)(((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(p0)).get(((java.lang.String)(__sourceIntrinsic_6ac6dd84f129_invokedynamic3588_3(31998, (435662139029259624L ^ local2))))))).getAsBoolean()))))));
    }
    return;
}


public static net.minecraft.entity.Entity[] a() {
return com.moon.setting.BooleanSetting.k;
}


public static com.moon.l_ builder(java.lang.String p0) {
return new com.moon.l_(p0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3587_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_55789b9cab72_originalDynamicSite1040_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_55789b9cab72_originalDynamicSite1040_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6ac6dd84f129_invokedynamic3588_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6ac6dd84f129_invokedynamic3588_3(int a0, long a1) throws E;
}
