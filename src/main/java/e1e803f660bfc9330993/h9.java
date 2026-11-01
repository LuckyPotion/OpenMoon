package com.moon;


public class h9 extends com.moon.h8 {

private static final long a;

private static final java.lang.String[] c;

private static final java.lang.String[] d;

private static final java.util.Map e;

public h9() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(-4461550183484835084L)), ((long)(-7963234479102354031L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(88023412288978L)))));

    e = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (com.moon.h9.a ^ 46474236355900L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill188_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill188_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill188_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill188_14 = new byte[8];

    (__sourceSpill188_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill188_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation188_16 = __sourceSpill188_14;

    ((javax.crypto.Cipher)(__sourceSpill188_11)).init(((int)(__sourceSpill188_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill188_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation188_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[6];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "\021¥Ð\nÀ8Ã6qlÄ4\b\020Û|KõèÒ­>ûxIØùh\020\t\f.ë_nxÉEcqä9s\020:1\005mðËÄzvÒü\026É"))).length();

    int local5_life24 = 16;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill188_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill188_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill188_29)).doFinal(((byte[])(__sourceSpill188_28)));

        java.lang.String __sourceSpill188_34 = ((java.lang.String)(com.moon.h9.a(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill188_35 = local9_life19;

        int __sourceSpill188_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill188_35)[__sourceSpill188_36] = __sourceSpill188_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "aéaH#nç¯>.±n_\\y\020ÿz}/ã4I\020\001Ð¦°¦û"))).length();

    local5_life24 = 16;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill188_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill188_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill188_43)).doFinal(((byte[])(__sourceSpill188_42)));

        java.lang.String __sourceSpill188_48 = ((java.lang.String)(com.moon.h9.a(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill188_49 = local9_life19;

        int __sourceSpill188_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill188_49)[__sourceSpill188_50] = __sourceSpill188_48;

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
        byte[] spill462_0 = p0;
        life4_9 += 1;
        life5_44 = (spill462_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill462_1 = p0;
        life4_9 += 1;
        life5_76 = (spill462_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill462_2 = p0;
        life4_9 += 1;
        life5_91 = (spill462_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 15673);
    if (((com.moon.h9.d)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.h9.e)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.h9.e)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/h9", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.h9.c)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.h9.d)[life5_8] = com.moon.h9.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.h9.d)[life5_8];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1352_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/h9"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.h9.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public <T> void a(T p0, com.moon.ie p1, java.lang.reflect.Field p2, java.lang.Class<?> p3, java.lang.Class<?> p4, java.util.Map<java.lang.Class<? extends com.moon.ie>, com.moon.h8> p5, java.util.Map<java.lang.Class<?>, java.lang.Class<? extends com.moon.it<?>>> p6, java.util.ArrayList p7) {
return;
}


public <T> void a(T p0, com.moon.ie p1, java.lang.reflect.Field p2, java.lang.Class<?> p3, java.lang.Class<?> p4, java.util.Map<java.lang.Class<? extends com.moon.ie>, com.moon.h8> p5, java.util.Map<java.lang.Class<?>, java.lang.Class<? extends com.moon.it<?>>> p6) throws java.lang.Exception {
com.moon.h8 forestValue69_39_0;
    java.lang.Class forestValue69_59_0;
    int forestValue69_153_0;
    java.lang.reflect.Field forestValue69_209_0;
    java.lang.Object forestValue69_209_1;
    java.lang.reflect.Field forestValue69_210_0;
    java.lang.Object forestValue69_210_1;
    java.lang.Object forestValue69_210_2;
    boolean spill69_0;
    com.moon.h8 spill69_1;
    java.lang.Class spill69_2;
    int spill69_3;
    boolean spill69_4;
    boolean spill69_5;
    boolean spill69_6;
    boolean spill69_7;
    boolean spill69_8;
    boolean spill69_9;
    java.lang.reflect.Field spill69_10;
    java.lang.Object spill69_11;
    long life8_3;
    com.moon.pr life11_6;
    java.util.ArrayList life12_10;
    java.util.Iterator life13_15;
    int life10_16;
    com.moon.ie life14_23;
    java.lang.Class life15_26;
    com.moon.h8 life16_31;
    java.lang.String life13_64;
    java.lang.String life14_66;
    int life15_68;
    forest_join_210: {
    forest_join_209: {
    forest_join_195: {
    forest_join_194: {
    forest_join_189: {
    forest_join_182: {
    forest_join_175: {
    forest_join_168: {
    forest_join_161: {
    forest_join_154: {
    forest_join_153: {
    forest_join_152: {
    forest_join_140: {
    forest_join_126: {
    forest_join_112: {
    forest_join_98: {
    forest_join_84: {
    forest_join_70: {
    forest_join_59: {
    forest_join_53: {
    life8_3 = (com.moon.h9.a ^ 43960868461003L);
    life11_6 = ((com.moon.pr)(p1));
    life12_10 = new java.util.ArrayList();
    spill69_0 = __sourceExactCall_edefb84806eefb();
    life13_15 = ((java.util.List)(((com.moon.pr)(life11_6)).h())).iterator();
    life10_16 = ((spill69_0) ? 1 : 0);
    forest_cycle_17: while (true) {
    forest_join_48: {
    forest_join_39: {
    if (!(((java.util.Iterator)(life13_15)).hasNext())) {
        break forest_join_53;
    }
    life14_23 = ((com.moon.ie)(((java.util.Iterator)(life13_15)).next()));
    life15_26 = ((java.lang.Object)(life14_23)).getClass();
    life16_31 = ((com.moon.h8)(((java.util.Map)(p5)).get(((java.lang.Object)(life15_26)))));
    if (!((life10_16 != 0))) {
        break forest_join_195;
    }
    spill69_1 = life16_31;
    if (!((life10_16 != 0))) {
        forestValue69_39_0 = spill69_1;
        break forest_join_39;
    }
    if (!((spill69_1 != null))) {
        break forest_join_48;
    }
    forestValue69_39_0 = life16_31;
    }
    ((com.moon.h8)(forestValue69_39_0)).a(((java.lang.Object)(p0)), ((com.moon.ie)(life14_23)), ((java.lang.reflect.Field)(p2)), ((java.lang.Class)(p3)), ((java.lang.Class)(p4)), ((java.util.Map)(p5)), ((java.util.Map)(p6)), ((java.util.ArrayList)(life12_10)));
    }
    if (!((life10_16 == 0))) {
        continue forest_cycle_17;
    }
    break forest_cycle_17;
    }
    __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[2])));
    }
    spill69_2 = p4;
    if (!((life10_16 != 0))) {
        forestValue69_59_0 = spill69_2;
        break forest_join_59;
    }
    if (!(((java.lang.Class)(spill69_2)).isPrimitive())) {
        break forest_join_195;
    }
    forestValue69_59_0 = p4;
    }
    life13_64 = ((java.lang.Class)(forestValue69_59_0)).getTypeName();
    life14_66 = life13_64;
    life15_68 = -1;
    spill69_3 = ((java.lang.String)(life14_66)).hashCode();
    if (!((life10_16 != 0))) {
        forestValue69_153_0 = spill69_3;
        break forest_join_153;
    }
    switch (spill69_3) {
case 104431:
{
        break forest_join_70;
    }
case 97526364:
{
        break forest_join_84;
    }
case -1325958191:
{
        break forest_join_98;
    }
case 3039496:
{
        break forest_join_112;
    }
case 109413500:
{
        break forest_join_126;
    }
case 3327612:
{
        break forest_join_140;
    }
default:
{
        break forest_join_152;
    }
}
    }
    spill69_4 = ((java.lang.String)(life14_66)).equals(((java.lang.Object)(__sourceIntrinsic_0092df7c0e3a_invokedynamic69_17(32576, (3457139494314142614L ^ life8_3)))));
    if (!((life10_16 != 0))) {
        forestValue69_153_0 = ((spill69_4) ? 1 : 0);
        break forest_join_153;
    }
    if (!(spill69_4)) {
        break forest_join_152;
    }
    life15_68 = 0;
    if (!((life10_16 == 0))) {
        break forest_join_152;
    }
    }
    spill69_5 = ((java.lang.String)(life14_66)).equals(((java.lang.Object)(__sourceIntrinsic_0092df7c0e3a_invokedynamic69_20(23622, (3997323565936953489L ^ life8_3)))));
    if (!((life10_16 != 0))) {
        forestValue69_153_0 = ((spill69_5) ? 1 : 0);
        break forest_join_153;
    }
    if (!(spill69_5)) {
        break forest_join_152;
    }
    life15_68 = 1;
    if (!((life10_16 == 0))) {
        break forest_join_152;
    }
    }
    spill69_6 = ((java.lang.String)(life14_66)).equals(((java.lang.Object)(__sourceIntrinsic_0092df7c0e3a_invokedynamic69_23(4852, (1556036143305917991L ^ life8_3)))));
    if (!((life10_16 != 0))) {
        forestValue69_153_0 = ((spill69_6) ? 1 : 0);
        break forest_join_153;
    }
    if (!(spill69_6)) {
        break forest_join_152;
    }
    life15_68 = 2;
    if (!((life10_16 == 0))) {
        break forest_join_152;
    }
    }
    spill69_7 = ((java.lang.String)(life14_66)).equals(((java.lang.Object)(__sourceIntrinsic_0092df7c0e3a_invokedynamic69_26(19049, (164915820012592824L ^ life8_3)))));
    if (!((life10_16 != 0))) {
        forestValue69_153_0 = ((spill69_7) ? 1 : 0);
        break forest_join_153;
    }
    if (!(spill69_7)) {
        break forest_join_152;
    }
    life15_68 = 3;
    if (!((life10_16 == 0))) {
        break forest_join_152;
    }
    }
    spill69_8 = ((java.lang.String)(life14_66)).equals(((java.lang.Object)(__sourceIntrinsic_0092df7c0e3a_invokedynamic69_29(7337, (2469697324785469563L ^ life8_3)))));
    if (!((life10_16 != 0))) {
        forestValue69_153_0 = ((spill69_8) ? 1 : 0);
        break forest_join_153;
    }
    if (!(spill69_8)) {
        break forest_join_152;
    }
    life15_68 = 4;
    if (!((life10_16 == 0))) {
        break forest_join_152;
    }
    }
    spill69_9 = ((java.lang.String)(life14_66)).equals(((java.lang.Object)(__sourceIntrinsic_0092df7c0e3a_invokedynamic69_32(17569, (5178299689873428593L ^ life8_3)))));
    if (!((life10_16 != 0))) {
        forestValue69_153_0 = ((spill69_9) ? 1 : 0);
        break forest_join_153;
    }
    if (!(spill69_9)) {
        break forest_join_152;
    }
    life15_68 = 5;
    }
    forestValue69_153_0 = life15_68;
    }
    switch (forestValue69_153_0) {
case 0:
{
        break forest_join_154;
    }
case 1:
{
        break forest_join_161;
    }
case 2:
{
        break forest_join_168;
    }
case 3:
{
        break forest_join_175;
    }
case 4:
{
        break forest_join_182;
    }
case 5:
{
        break forest_join_189;
    }
default:
{
        break forest_join_194;
    }
}
    }
    ((java.lang.reflect.Field)(p2)).set(((java.lang.Object)(p0)), ((java.lang.Object)(com.moon.ib.a__ArrayInt(((java.util.ArrayList)(life12_10))))));
    if (!((life10_16 == 0))) {
        break forest_join_194;
    }
    }
    ((java.lang.reflect.Field)(p2)).set(((java.lang.Object)(p0)), ((java.lang.Object)(com.moon.ib.a__ArrayFloat(((java.util.ArrayList)(life12_10))))));
    if (!((life10_16 == 0))) {
        break forest_join_194;
    }
    }
    ((java.lang.reflect.Field)(p2)).set(((java.lang.Object)(p0)), ((java.lang.Object)(com.moon.ib.a__ArrayDouble(((java.util.ArrayList)(life12_10))))));
    if (!((life10_16 == 0))) {
        break forest_join_194;
    }
    }
    ((java.lang.reflect.Field)(p2)).set(((java.lang.Object)(p0)), ((java.lang.Object)(com.moon.ib.a(((java.util.ArrayList)(life12_10))))));
    if (!((life10_16 == 0))) {
        break forest_join_194;
    }
    }
    ((java.lang.reflect.Field)(p2)).set(((java.lang.Object)(p0)), ((java.lang.Object)(com.moon.ib.a__ArrayShort(((java.util.ArrayList)(life12_10))))));
    if (!((life10_16 == 0))) {
        break forest_join_194;
    }
    }
    ((java.lang.reflect.Field)(p2)).set(((java.lang.Object)(p0)), ((java.lang.Object)(com.moon.ib.a__ArrayLong(((java.util.ArrayList)(life12_10))))));
    }
    return;
    }
    spill69_10 = p2;
    spill69_11 = p0;
    if (!(((java.lang.Class)(p3)).isArray())) {
        forestValue69_209_0 = spill69_10;
        forestValue69_209_1 = spill69_11;
        break forest_join_209;
    }
    forestValue69_210_0 = spill69_10;
    forestValue69_210_1 = spill69_11;
    forestValue69_210_2 = ((java.util.ArrayList)(life12_10)).toArray(((java.lang.Object[])(((java.lang.Object[])(java.lang.reflect.Array.newInstance(((java.lang.Class)(((java.lang.Class)(p3)).getComponentType())), ((int)(((java.util.ArrayList)(life12_10)).size()))))))));
    break forest_join_210;
    }
    forestValue69_210_0 = forestValue69_209_0;
    forestValue69_210_1 = forestValue69_209_1;
    forestValue69_210_2 = life12_10;
    }
    ((java.lang.reflect.Field)(forestValue69_210_0)).set(((java.lang.Object)(forestValue69_210_1)), ((java.lang.Object)(forestValue69_210_2)));
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0092df7c0e3a_invokedynamic69_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0092df7c0e3a_invokedynamic69_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0092df7c0e3a_invokedynamic69_23(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0092df7c0e3a_invokedynamic69_26(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0092df7c0e3a_invokedynamic69_29(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0092df7c0e3a_invokedynamic69_32(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1352_0() throws E;

private static native boolean __sourceExactCall_edefb84806eefb();
private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);
}
