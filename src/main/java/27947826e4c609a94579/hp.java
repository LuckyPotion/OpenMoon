package com.moon;


public class hp {

private java.util.List<com.moon.ho> a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

public hp() { super(); }


private static void __sourceConstructorBody_fe1b374011cfdc7e(com.moon.hp receiver) throws Throwable {

long local1_life1 = (com.moon.hp.b ^ 32063522826617L);

    net.minecraft.entity.Entity[] __sourceSpill79_3 = com.moon.ho.b__Arrayr3();

    com.moon.hp.__sourceConstructorInit_fe1b374011cfdc7e_0(((com.moon.hp)(receiver)));

    net.minecraft.entity.Entity[] local3_life5 = __sourceSpill79_3;

    ((com.moon.hp)(receiver)).a = ((java.util.List)(new java.util.ArrayList()));

    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {

        com.moon.ho.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[5])));

    }

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_fe1b374011cfdc7e_0(com.moon.hp a0) throws E;

static {
b = ((long)(((moom._a)(moom._c.a(((long)(-4827021365661129983L)), ((long)(2150119187891652820L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(24519669680771L)))));

    e = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (com.moon.hp.b ^ 42817650597023L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill209_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill209_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill209_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill209_14 = new byte[8];

    (__sourceSpill209_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill209_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation209_16 = __sourceSpill209_14;

    ((javax.crypto.Cipher)(__sourceSpill209_11)).init(((int)(__sourceSpill209_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill209_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation209_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[6];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "ÿY\032Å\026@[ç\003Bøà?\020ªZ\tèJï\004\030)9× K3\020<ù\032¤$\0372Â7`Ç\\m\020 ´ê}\bZO=K>\024ùáÄ{"))).length();

    int local5_life24 = 16;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill209_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill209_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill209_29)).doFinal(((byte[])(__sourceSpill209_28)));

        java.lang.String __sourceSpill209_34 = ((java.lang.String)(com.moon.hp.a(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill209_35 = local9_life19;

        int __sourceSpill209_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill209_35)[__sourceSpill209_36] = __sourceSpill209_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "²¿~çñ9î±; áÒ9<\b±(¸\fkD6ìÔ\027¾A\030ns_|W°ú²!zW¥k#r\177võ<\037\021"))).length();

    local5_life24 = 32;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill209_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill209_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill209_43)).doFinal(((byte[])(__sourceSpill209_42)));

        java.lang.String __sourceSpill209_48 = ((java.lang.String)(com.moon.hp.a(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill209_49 = local9_life19;

        int __sourceSpill209_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill209_49)[__sourceSpill209_50] = __sourceSpill209_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    c = ((java.lang.String[])(local9_life19));

    d = ((java.lang.String[])(new java.lang.String[6]));
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
        byte[] spill530_0 = p0;
        life4_9 += 1;
        life5_44 = (spill530_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill530_1 = p0;
        life4_9 += 1;
        life5_76 = (spill530_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill530_2 = p0;
        life4_9 += 1;
        life5_91 = (spill530_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 26946);
    if (((com.moon.hp.d)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.hp.e)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.hp.e)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/hp", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.hp.c)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.hp.d)[life5_8] = com.moon.hp.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.hp.d)[life5_8];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1478_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/hp"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.hp.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.util.List<com.moon.ho> a() {
return this.a;
}


public static com.moon.hp a(com.google.gson.JsonElement p0) {
com.google.gson.JsonElement lexicalValue72_16_0;
    com.google.gson.JsonElement lexicalValue72_34_0;
    int lexicalValue72_68_0;
    int lexicalValue72_89_0;
    int lexicalValue72_107_0;
    net.minecraft.entity.Entity[] spill72_0;
    com.google.gson.JsonElement spill72_1;
    com.google.gson.JsonElement spill72_2;
    boolean spill72_3;
    long life1_3;
    com.moon.hp life4_8;
    net.minecraft.entity.Entity[] life3_9;
    com.google.gson.JsonArray life5_23;
    java.util.Iterator life6_26;
    com.google.gson.JsonElement life7_33;
    com.google.gson.JsonObject life8_47;
    com.moon.ho life9_51;
    lexical_join_113: {
    lexical_join_16: {
    life1_3 = (com.moon.hp.b ^ 10341448237652L);
    spill72_0 = com.moon.ho.b__Arrayr3();
    life4_8 = new com.moon.hp();
    life3_9 = spill72_0;
    spill72_1 = p0;
    if (!((life3_9 == null))) {
        lexicalValue72_16_0 = spill72_1;
        break lexical_join_16;
    }
    if (!(((com.google.gson.JsonElement)(spill72_1)).isJsonArray())) {
        break lexical_join_113;
    }
    lexicalValue72_16_0 = p0;
    }
    life5_23 = ((com.google.gson.JsonElement)(lexicalValue72_16_0)).getAsJsonArray();
    life6_26 = ((com.google.gson.JsonArray)(life5_23)).iterator();
    lexical_cycle_21: while (true) {
    lexical_join_108: {
    lexical_join_107: {
    lexical_join_103: {
    lexical_join_89: {
    lexical_join_82: {
    lexical_join_68: {
    lexical_join_61: {
    lexical_join_34: {
    if (!(((java.util.Iterator)(life6_26)).hasNext())) {
        break lexical_join_113;
    }
    life7_33 = ((com.google.gson.JsonElement)(((java.util.Iterator)(life6_26)).next()));
    spill72_2 = life7_33;
    if (!((life3_9 == null))) {
        lexicalValue72_34_0 = spill72_2;
        break lexical_join_34;
    }
    if (!(((com.google.gson.JsonElement)(spill72_2)).isJsonObject())) {
        break lexical_join_108;
    }
    lexicalValue72_34_0 = life7_33;
    }
    life8_47 = ((com.google.gson.JsonElement)(lexicalValue72_34_0)).getAsJsonObject();
    life9_51 = new com.moon.ho();
    spill72_3 = ((com.google.gson.JsonObject)(life8_47)).has(((java.lang.String)(__sourceIntrinsic_4afc95473ae0_invokedynamic72_10(29803, (8088332120174452541L ^ life1_3)))));
    if (!((life3_9 == null))) {
        lexicalValue72_68_0 = ((spill72_3) ? 1 : 0);
        break lexical_join_68;
    }
    if (!(spill72_3)) {
        break lexical_join_61;
    }
    ((com.moon.ho)(life9_51)).a(((java.lang.String)(((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(life8_47)).get(((java.lang.String)(__sourceIntrinsic_4afc95473ae0_invokedynamic72_13(16037, (329463110854579697L ^ life1_3))))))).getAsString())));
    }
    lexicalValue72_68_0 = ((((com.google.gson.JsonObject)(life8_47)).has(((java.lang.String)(__sourceIntrinsic_4afc95473ae0_invokedynamic72_17(16016, (4856042739080271297L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_9 == null))) {
        lexicalValue72_89_0 = lexicalValue72_68_0;
        break lexical_join_89;
    }
    if (!((lexicalValue72_68_0 != 0))) {
        break lexical_join_82;
    }
    ((com.moon.ho)(life9_51)).a(((long)(((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(life8_47)).get(((java.lang.String)(__sourceIntrinsic_4afc95473ae0_invokedynamic72_20(20427, (8702627369253463195L ^ life1_3))))))).getAsLong())));
    }
    lexicalValue72_89_0 = ((((com.google.gson.JsonObject)(life8_47)).has(((java.lang.String)(__sourceIntrinsic_4afc95473ae0_invokedynamic72_24(11425, (5156705866790602740L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_9 == null))) {
        lexicalValue72_107_0 = lexicalValue72_89_0;
        break lexical_join_107;
    }
    if (!((lexicalValue72_89_0 != 0))) {
        break lexical_join_103;
    }
    ((com.moon.ho)(life9_51)).b(((java.lang.String)(((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(life8_47)).get(((java.lang.String)(__sourceIntrinsic_4afc95473ae0_invokedynamic72_27(32520, (9047377715382998111L ^ life1_3))))))).getAsString())));
    }
    lexicalValue72_107_0 = ((((java.util.List)(((com.moon.hp)(life4_8)).a)).add(((java.lang.Object)(life9_51)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue72_107_0);
    }
    if (!((life3_9 != null))) { continue lexical_cycle_21; }
    break lexical_cycle_21;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));
    }
    return life4_8;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1478_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4afc95473ae0_invokedynamic72_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4afc95473ae0_invokedynamic72_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4afc95473ae0_invokedynamic72_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4afc95473ae0_invokedynamic72_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4afc95473ae0_invokedynamic72_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4afc95473ae0_invokedynamic72_27(int a0, long a1) throws E;
}
