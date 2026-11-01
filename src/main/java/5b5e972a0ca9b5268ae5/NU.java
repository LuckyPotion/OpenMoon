package moom;


public class NU {

private static long a;

private static java.lang.String[] b;

private static java.lang.String[] c;

private static java.util.Map d;

public NU() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(6196732880377024153L)), ((long)(3179058743644800201L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(211477264852413L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.NU.a ^ 60281665954062L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill876_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill876_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill876_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill876_14 = new byte[8];
    (__sourceSpill876_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill876_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation876_16 = __sourceSpill876_14;
    ((javax.crypto.Cipher)(__sourceSpill876_11)).init(((int)(__sourceSpill876_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill876_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation876_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[6];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "·\027Ï3öÒE\020ê(ß=$Xcd©?Fâ1\005Â\013ÚK\002µ(ÓXÖ/@£\003èÔÖç=\001W¬N'6»l«;u%Å\033êîÏ\b'ø©¼(\026EÌÏÌ#¿\030£³¯k\007fMZB§¾8{\t}H\003ug¥í¬\r\033ô¦a¼ò\030÷pÑKK\022\031mZ70wz¹ù¸ÑL+v"))).length();
    int local5_life24 = 32;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill876_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill876_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill876_29)).doFinal(((byte[])(__sourceSpill876_28)));
        java.lang.String __sourceSpill876_34 = ((java.lang.String)(moom.NU.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill876_35 = local9_life19;
        int __sourceSpill876_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill876_35)[__sourceSpill876_36] = __sourceSpill876_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    local8_life23 = ((java.lang.String)((local6_life21 = "~÷PÝößÅ,ËsÜ\bPDÖ\022\017k#\\Fror¬þ¢Q´cft ³u£D×ÞDìB¤RHKêi/º&ÌÉåÔ}ìC!\026±\016\031"))).length();
    local5_life24 = 32;
    local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill876_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill876_43 = local2_life9;
        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill876_43)).doFinal(((byte[])(__sourceSpill876_42)));
        java.lang.String __sourceSpill876_48 = ((java.lang.String)(moom.NU.a(((byte[])(local10_life45))))).intern();
        java.lang.String[] __sourceSpill876_49 = local9_life19;
        int __sourceSpill876_50 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill876_49)[__sourceSpill876_50] = __sourceSpill876_48;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    b = ((java.lang.String[])(local9_life19));
    c = ((java.lang.String[])(new java.lang.String[6]));
}

private static native <E extends Throwable> float[] __sourceHandlerCall_813b66dbe2aac8781b60(com.google.gson.JsonElement a0, int a1, float[] a2) throws E;
private static final class __SourceHandler_813b66dbe2aac8781b60 {

public static float[] f300094(com.google.gson.JsonElement p0, int p1, float[] p2) throws Throwable {
    com.google.gson.JsonElement lexicalValue300094_13_0;
    int lexicalValue300094_53_0;
    float[] lexicalValue300094_74_0;
    com.google.gson.JsonElement spill300094_0;
    int spill300094_1;
    com.google.gson.JsonParseException spill300094_2;
    com.google.gson.JsonParseException spill300094_3;
    int spill300094_4;
    int spill300094_5;
    float[] spill300094_6;
    long life3_3;
    int life5_5;
    com.google.gson.JsonArray life6_19;
    com.google.gson.JsonArray life9_35;
    int life10_36;
    int life11_37;
    float[] life7_62;
    int life8_64;
    lexical_join_74: {
    lexical_join_73: {
    lexical_join_53: {
    lexical_join_51: {
    lexical_join_13: {
    lexical_join_12: {
    life3_3 = (__fieldRead300094_0() ^ 24976761094637L);
    life5_5 = __call300094_1();
    spill300094_0 = p0;
    if (!((life5_5 == 0))) {
        lexicalValue300094_13_0 = spill300094_0;
        break lexical_join_13;
    }
    if (!((spill300094_0 == null))) {
        break lexical_join_12;
    }
    return p2;
    }
    lexicalValue300094_13_0 = p0;
    }
    life6_19 = __call300094_2(lexicalValue300094_13_0);
    spill300094_1 = __call300094_3(life6_19);
    if (!((life5_5 == 0))) {
        lexicalValue300094_53_0 = spill300094_1;
        break lexical_join_53;
    }
    if (!((spill300094_1 != p1))) {
        break lexical_join_51;
    }
    com.google.gson.JsonParseException __stackOp300094_5_0 = __sourceUninitializedNEW300094_4();
    spill300094_2 = __stackOp300094_5_0;
    spill300094_3 = __stackOp300094_5_0;
    spill300094_4 = __call300094_6(life6_19);
    spill300094_5 = p1;
    life9_35 = life6_19;
    life10_36 = spill300094_5;
    life11_37 = spill300094_4;
    __explicitNewInit300094_11(spill300094_3, __invokedynamic300094_10(__invokedynamic300094_7(25541, (3384276716011682417L ^ life3_3)), life11_37, __invokedynamic300094_8(8064, (2188212883559515702L ^ life3_3)), life10_36, __invokedynamic300094_9(31152, (2556922490739548165L ^ life3_3)), life9_35));
    throw spill300094_2;
    }
    lexicalValue300094_53_0 = __call300094_12(life6_19);
    }
    life7_62 = new float[lexicalValue300094_53_0];
    life8_64 = 0;
    lexical_cycle_57: while (true) {
    if (!((life8_64 < (life7_62).length))) {
        break lexical_join_73;
    }
    spill300094_6 = life7_62;
    if (!((life5_5 == 0))) {
        lexicalValue300094_74_0 = spill300094_6;
        break lexical_join_74;
    }
    (spill300094_6)[life8_64] = __call300094_14(__call300094_13(life6_19, life8_64));
    life8_64 += 1;
    if (!((life5_5 != 0))) { continue lexical_cycle_57; }
    break lexical_cycle_57;
    }
    }
    lexicalValue300094_74_0 = life7_62;
    }
    return lexicalValue300094_74_0;
}
private static native long __fieldRead300094_0() throws Throwable;
private static native int __call300094_1() throws Throwable;
private static native com.google.gson.JsonArray __call300094_2(com.google.gson.JsonElement a0) throws Throwable;
private static native int __call300094_3(com.google.gson.JsonArray a0) throws Throwable;
private static native com.google.gson.JsonParseException __sourceUninitializedNEW300094_4() throws Throwable;
private static native int __call300094_6(com.google.gson.JsonArray a0) throws Throwable;
private static native java.lang.String __invokedynamic300094_7(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic300094_8(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic300094_9(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic300094_10(java.lang.String a0, int a1, java.lang.String a2, int a3, java.lang.String a4, com.google.gson.JsonArray a5) throws Throwable;
private static native void __explicitNewInit300094_11(com.google.gson.JsonParseException a0, java.lang.String a1) throws Throwable;
private static native int __call300094_12(com.google.gson.JsonArray a0) throws Throwable;
private static native com.google.gson.JsonElement __call300094_13(com.google.gson.JsonArray a0, int a1) throws Throwable;
private static native float __call300094_14(com.google.gson.JsonElement a0) throws Throwable;

}

private static native <E extends Throwable> int[] __sourceHandlerCall_e8f2ab6ffbeea6fba93c(com.google.gson.JsonElement a0, int a1, int[] a2) throws E;
private static final class __SourceHandler_e8f2ab6ffbeea6fba93c {

public static int[] f300095(com.google.gson.JsonElement p0, int p1, int[] p2) throws Throwable {
    com.google.gson.JsonElement lexicalValue300095_13_0;
    int lexicalValue300095_53_0;
    int[] lexicalValue300095_74_0;
    com.google.gson.JsonElement spill300095_0;
    int spill300095_1;
    com.google.gson.JsonParseException spill300095_2;
    com.google.gson.JsonParseException spill300095_3;
    int spill300095_4;
    int spill300095_5;
    int[] spill300095_6;
    long life3_3;
    int life5_5;
    com.google.gson.JsonArray life6_19;
    com.google.gson.JsonArray life9_35;
    int life10_36;
    int life11_37;
    int[] life7_62;
    int life8_64;
    lexical_join_74: {
    lexical_join_73: {
    lexical_join_53: {
    lexical_join_51: {
    lexical_join_13: {
    lexical_join_12: {
    life3_3 = (__fieldRead300095_0() ^ 115160826377495L);
    life5_5 = __call300095_1();
    spill300095_0 = p0;
    if (!((life5_5 == 0))) {
        lexicalValue300095_13_0 = spill300095_0;
        break lexical_join_13;
    }
    if (!((spill300095_0 == null))) {
        break lexical_join_12;
    }
    return p2;
    }
    lexicalValue300095_13_0 = p0;
    }
    life6_19 = __call300095_2(lexicalValue300095_13_0);
    spill300095_1 = __call300095_3(life6_19);
    if (!((life5_5 == 0))) {
        lexicalValue300095_53_0 = spill300095_1;
        break lexical_join_53;
    }
    if (!((spill300095_1 != p1))) {
        break lexical_join_51;
    }
    com.google.gson.JsonParseException __stackOp300095_5_0 = __sourceUninitializedNEW300095_4();
    spill300095_2 = __stackOp300095_5_0;
    spill300095_3 = __stackOp300095_5_0;
    spill300095_4 = __call300095_6(life6_19);
    spill300095_5 = p1;
    life9_35 = life6_19;
    life10_36 = spill300095_5;
    life11_37 = spill300095_4;
    __explicitNewInit300095_11(spill300095_3, __invokedynamic300095_10(__invokedynamic300095_7(624, (1517355908187254589L ^ life3_3)), life11_37, __invokedynamic300095_8(1407, (2615290316182972468L ^ life3_3)), life10_36, __invokedynamic300095_9(11355, (5528525651147440401L ^ life3_3)), life9_35));
    throw spill300095_2;
    }
    lexicalValue300095_53_0 = __call300095_12(life6_19);
    }
    life7_62 = new int[lexicalValue300095_53_0];
    life8_64 = 0;
    lexical_cycle_57: while (true) {
    if (!((life8_64 < (life7_62).length))) {
        break lexical_join_73;
    }
    spill300095_6 = life7_62;
    if (!((life5_5 == 0))) {
        lexicalValue300095_74_0 = spill300095_6;
        break lexical_join_74;
    }
    (spill300095_6)[life8_64] = __call300095_14(__call300095_13(life6_19, life8_64));
    life8_64 += 1;
    if (!((life5_5 != 0))) { continue lexical_cycle_57; }
    break lexical_cycle_57;
    }
    }
    lexicalValue300095_74_0 = life7_62;
    }
    return lexicalValue300095_74_0;
}
private static native long __fieldRead300095_0() throws Throwable;
private static native int __call300095_1() throws Throwable;
private static native com.google.gson.JsonArray __call300095_2(com.google.gson.JsonElement a0) throws Throwable;
private static native int __call300095_3(com.google.gson.JsonArray a0) throws Throwable;
private static native com.google.gson.JsonParseException __sourceUninitializedNEW300095_4() throws Throwable;
private static native int __call300095_6(com.google.gson.JsonArray a0) throws Throwable;
private static native java.lang.String __invokedynamic300095_7(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic300095_8(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic300095_9(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic300095_10(java.lang.String a0, int a1, java.lang.String a2, int a3, java.lang.String a4, com.google.gson.JsonArray a5) throws Throwable;
private static native void __explicitNewInit300095_11(com.google.gson.JsonParseException a0, java.lang.String a1) throws Throwable;
private static native int __call300095_12(com.google.gson.JsonArray a0) throws Throwable;
private static native com.google.gson.JsonElement __call300095_13(com.google.gson.JsonArray a0, int a1) throws Throwable;
private static native int __call300095_14(com.google.gson.JsonElement a0) throws Throwable;

}


public static int[] a(com.google.gson.JsonElement p0, int p1, int[] p2) { return __sourceHandlerCall_e8f2ab6ffbeea6fba93c(p0, p1, p2); }


private static com.google.gson.JsonParseException a(com.google.gson.JsonParseException p0) {
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
        byte[] spill3339_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3339_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3339_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3339_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3339_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3339_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 3768);
    if (((moom.NU.c)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.NU.d)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.NU.d)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/NU", life9_51);
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
        life9_116 = ((java.lang.String)((moom.NU.b)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.NU.c)[life5_8] = moom.NU.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.NU.c)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.NU.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6616_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/NU"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static java.lang.String a(com.google.gson.JsonObject p0, java.lang.String p1, java.lang.String p2) {
com.google.gson.JsonElement forwardValue2822_17_0;
    java.lang.String forwardValue2822_18_0;
    int spill2822_0;
    com.google.gson.JsonElement spill2822_1;
    long life3_3;
    com.google.gson.JsonElement life6_8;
    int life5_9;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life3_3 = (moom.NU.a ^ 64791434197749L);
    spill2822_0 = moom.Ob.b();
    life6_8 = ((com.google.gson.JsonObject)(p0)).get(((java.lang.String)(p1)));
    life5_9 = spill2822_0;
    spill2822_1 = life6_8;
    if (!((life5_9 == 0))) {
        forwardValue2822_17_0 = spill2822_1;
        break forward_join_17;
    }
    if (!((spill2822_1 == null))) {
        break forward_join_16;
    }
    forwardValue2822_18_0 = p2;
    break forward_join_18;
    }
    forwardValue2822_17_0 = life6_8;
    }
    forwardValue2822_18_0 = ((com.google.gson.JsonElement)(forwardValue2822_17_0)).getAsString();
    }
    return forwardValue2822_18_0;
}


public static java.lang.String a(com.google.gson.JsonObject p0, java.lang.String p1) {
return moom.NU.a(((com.google.gson.JsonObject)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(null)));
}


public static boolean a(com.google.gson.JsonObject p0, java.lang.String p1, boolean p2) {
com.google.gson.JsonElement forwardValue2823_17_0;
    int forwardValue2823_18_0;
    int spill2823_0;
    com.google.gson.JsonElement spill2823_1;
    long life3_3;
    com.google.gson.JsonElement life6_8;
    int life5_9;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life3_3 = (moom.NU.a ^ 75227328496390L);
    spill2823_0 = moom.Ob.b();
    life6_8 = ((com.google.gson.JsonObject)(p0)).get(((java.lang.String)(p1)));
    life5_9 = spill2823_0;
    spill2823_1 = life6_8;
    if (!((life5_9 == 0))) {
        forwardValue2823_17_0 = spill2823_1;
        break forward_join_17;
    }
    if (!((spill2823_1 == null))) {
        break forward_join_16;
    }
    forwardValue2823_18_0 = ((p2) ? 1 : 0);
    break forward_join_18;
    }
    forwardValue2823_17_0 = life6_8;
    }
    forwardValue2823_18_0 = ((((com.google.gson.JsonElement)(forwardValue2823_17_0)).getAsBoolean()) ? 1 : 0);
    }
    return ((forwardValue2823_18_0) != 0);
}


public static float a(com.google.gson.JsonObject p0, java.lang.String p1, float p2) {
com.google.gson.JsonElement forwardValue2821_17_0;
    float forwardValue2821_18_0;
    int spill2821_0;
    com.google.gson.JsonElement spill2821_1;
    long life3_3;
    com.google.gson.JsonElement life6_8;
    int life5_9;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life3_3 = (moom.NU.a ^ 121445181443174L);
    spill2821_0 = moom.Ob.c();
    life6_8 = ((com.google.gson.JsonObject)(p0)).get(((java.lang.String)(p1)));
    life5_9 = spill2821_0;
    spill2821_1 = life6_8;
    if (!((life5_9 != 0))) {
        forwardValue2821_17_0 = spill2821_1;
        break forward_join_17;
    }
    if (!((spill2821_1 == null))) {
        break forward_join_16;
    }
    forwardValue2821_18_0 = p2;
    break forward_join_18;
    }
    forwardValue2821_17_0 = life6_8;
    }
    forwardValue2821_18_0 = ((com.google.gson.JsonElement)(forwardValue2821_17_0)).getAsFloat();
    }
    return forwardValue2821_18_0;
}


public static float[] a(com.google.gson.JsonElement p0, int p1) {
return moom.NU.a(((com.google.gson.JsonElement)(p0)), ((int)(p1)), ((float[])(null)));
}


public static float[] a(com.google.gson.JsonElement p0, int p1, float[] p2) { return __sourceHandlerCall_813b66dbe2aac8781b60(p0, p1, p2); }


public static int[] a__ArrayInt(com.google.gson.JsonElement p0, int p1) {
return moom.NU.a(((com.google.gson.JsonElement)(p0)), ((int)(p1)), ((int[])(null)));
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6616_0() throws E;
}
