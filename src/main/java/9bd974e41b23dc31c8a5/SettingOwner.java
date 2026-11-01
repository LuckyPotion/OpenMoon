package com.moon.module;


public class SettingOwner {

private static org.tinylog.TaggedLogger a;

private java.util.List<com.moon.setting.Setting> settings;

private static int[] c;

private static long db;

private static java.lang.String[] eb;

private static java.lang.String[] fb;

private static java.util.Map gb;

public SettingOwner() {
super();
    this.settings = new java.util.ArrayList();
}

private static native <E extends Throwable> void __sourceHandlerCall_1984b3a6de87458bfda5(com.moon.module.SettingOwner a0) throws E;
private static final class __SourceHandler_1984b3a6de87458bfda5 {

public static void f185(com.moon.module.SettingOwner receiver) throws Throwable {
    java.lang.Object forestValue185_35_0;
    java.lang.String[] spill185_0;
    java.lang.Object spill185_1;
    long life1_3;
    java.lang.reflect.Field[] life4_7;
    int life5_11;
    int life6_13;
    java.lang.String[] life3_14;
    java.lang.reflect.Field life7_21;
    java.lang.Object life8_28;
    com.moon.setting.Setting life9_38;
    forest_join_53: {
    forest_join_48: {
    life1_3 = (__fieldRead185_0() ^ 17288909182936L);
    life4_7 = __call185_2(__call185_1(receiver));
    spill185_0 = __call185_3();
    life5_11 = (life4_7).length;
    life6_13 = 0;
    life3_14 = spill185_0;
    forest_cycle_15: while (true) {
    forest_join_45: {
    forest_join_40: {
    forest_join_39: {
    forest_join_35: {
    if (!((life6_13 < life5_11))) {
        break forest_join_48;
    }
    life7_21 = (life4_7)[life6_13];
    __call185_4(life7_21, 1);
    life8_28 = __call185_5(life7_21, receiver);
    spill185_1 = life8_28;
    if (!((life3_14 != null))) {
        forestValue185_35_0 = spill185_1;
        break forest_join_35;
    }
    if (!((__instanceOf185_6(spill185_1) != 0))) {
        break forest_join_39;
    }
    forestValue185_35_0 = life8_28;
    }
    life9_38 = __cast185_7(forestValue185_35_0);
    if (!((life3_14 == null))) {
        break forest_join_40;
    }
    }
    break forest_join_45;
    }
    __call185_9(__fieldRead185_8(receiver), life9_38);
    }
    life6_13 += 1;
    if (!((life3_14 == null))) {
        continue forest_cycle_15;
    }
    break forest_cycle_15;
    }
    }
    if (!((__call185_10() != null))) {
        break forest_join_53;
    }
    __call185_11(new java.lang.String[4]);
    }
    return;
}
public static void h185_0(java.lang.IllegalAccessException p0) throws Throwable {
    throw __call3018500_0(p0);
}
public static void h185_1(java.lang.IllegalAccessException p0) throws Throwable {
    throw __call3018501_0(p0);
}
public static void h185_2(java.lang.IllegalAccessException p0, com.moon.module.SettingOwner p1, long p2, java.lang.String[] p3, java.lang.reflect.Field[] p4, int p5, int p6, java.lang.reflect.Field p7, java.lang.Object p8, com.moon.setting.Setting p9) throws Throwable {
    java.lang.Object forestValue3018502_42_0;
    org.tinylog.TaggedLogger spill3018502_0;
    java.lang.String spill3018502_1;
    java.lang.Object[] spill3018502_2;
    java.lang.Object spill3018502_3;
    java.lang.IllegalAccessException life9_2;
    java.lang.reflect.Field life8_29;
    java.lang.Object life9_36;
    com.moon.setting.Setting life10_46;
    forest_join_58: {
    forest_join_53: {
    life9_2 = p0;
    spill3018502_0 = __fieldRead3018502_0();
    com.moon.module.SettingOwner __stackOp3018502_2_0 = p1;
    java.lang.String __stackOp3018502_2_1 = __invokedynamic3018502_1(20251, (7807489469941833747L ^ p2));
    spill3018502_1 = __invokedynamic3018502_3(__stackOp3018502_2_1, __stackOp3018502_2_0);
    java.lang.Object[] __stackOp3018502_4_0 = new java.lang.Object[1];
    spill3018502_2 = __stackOp3018502_4_0;
    (__stackOp3018502_4_0)[0] = life9_2;
    __call3018502_5(spill3018502_0, spill3018502_1, spill3018502_2);
    forest_cycle_18: while (true) {
    forest_join_47: {
    forest_join_46: {
    forest_join_42: {
    forest_join_22: {
    p6 += 1;
    if (!((p3 == null))) {
        break forest_join_22;
    }
    break forest_join_53;
    }
    if (!((p6 < p5))) {
        break forest_join_53;
    }
    life8_29 = (p4)[p6];
    __call3018502_6(life8_29, 1);
    life9_36 = __call3018502_7(life8_29, p1);
    spill3018502_3 = life9_36;
    if (!((p3 != null))) {
        forestValue3018502_42_0 = spill3018502_3;
        break forest_join_42;
    }
    if (!((__instanceOf3018502_8(spill3018502_3) != 0))) {
        break forest_join_46;
    }
    forestValue3018502_42_0 = life9_36;
    }
    life10_46 = __cast3018502_9(forestValue3018502_42_0);
    if (!((p3 == null))) {
        break forest_join_47;
    }
    }
    continue forest_cycle_18;
    }
    __call3018502_11(__fieldRead3018502_10(p1), life10_46);
    continue forest_cycle_18;
    }
    }
    if (!((__call3018502_12() != null))) {
        break forest_join_58;
    }
    __call3018502_13(new java.lang.String[4]);
    }
    return;
}
public static void h185_3(java.lang.IllegalAccessException p0) throws Throwable {
    throw __call3018503_0(p0);
}
private static native long __fieldRead185_0() throws Throwable;
private static native java.lang.Class __call185_1(com.moon.module.SettingOwner a0) throws Throwable;
private static native java.lang.reflect.Field[] __call185_2(java.lang.Class a0) throws Throwable;
private static native java.lang.String[] __call185_3() throws Throwable;
private static native void __call185_4(java.lang.reflect.Field a0, int a1) throws Throwable;
private static native java.lang.Object __call185_5(java.lang.reflect.Field a0, com.moon.module.SettingOwner a1) throws Throwable;
private static native int __instanceOf185_6(java.lang.Object a0) throws Throwable;
private static native com.moon.setting.Setting __cast185_7(java.lang.Object a0) throws Throwable;
private static native java.util.List __fieldRead185_8(com.moon.module.SettingOwner a0) throws Throwable;
private static native boolean __call185_9(java.util.List a0, com.moon.setting.Setting a1) throws Throwable;
private static native java.lang.String[] __call185_10() throws Throwable;
private static native void __call185_11(java.lang.String[] a0) throws Throwable;
private static native java.lang.Exception __call3018500_0(java.lang.IllegalAccessException a0) throws Throwable;
private static native java.lang.Exception __call3018501_0(java.lang.IllegalAccessException a0) throws Throwable;
private static native org.tinylog.TaggedLogger __fieldRead3018502_0() throws Throwable;
private static native java.lang.String __invokedynamic3018502_1(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3018502_3(java.lang.String a0, com.moon.module.SettingOwner a1) throws Throwable;
private static native void __call3018502_5(org.tinylog.TaggedLogger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native void __call3018502_6(java.lang.reflect.Field a0, int a1) throws Throwable;
private static native java.lang.Object __call3018502_7(java.lang.reflect.Field a0, com.moon.module.SettingOwner a1) throws Throwable;
private static native int __instanceOf3018502_8(java.lang.Object a0) throws Throwable;
private static native com.moon.setting.Setting __cast3018502_9(java.lang.Object a0) throws Throwable;
private static native java.util.List __fieldRead3018502_10(com.moon.module.SettingOwner a0) throws Throwable;
private static native boolean __call3018502_11(java.util.List a0, com.moon.setting.Setting a1) throws Throwable;
private static native java.lang.String[] __call3018502_12() throws Throwable;
private static native void __call3018502_13(java.lang.String[] a0) throws Throwable;
private static native java.lang.Exception __call3018503_0(java.lang.IllegalAccessException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.setting.Setting __sourceHandlerCall_3369f4d1431e1752e39a(com.moon.module.SettingOwner a0, java.lang.String a1) throws E;
private static final class __SourceHandler_3369f4d1431e1752e39a {

public static com.moon.setting.Setting f491(com.moon.module.SettingOwner receiver, java.lang.String p0) throws Throwable {
    com.moon.setting.Setting lexicalValue491_25_0;
    java.lang.String[] spill491_0;
    com.moon.setting.Setting spill491_1;
    long life2_3;
    java.util.Iterator life5_8;
    java.lang.String[] life4_9;
    com.moon.setting.Setting life6_16;
    lexical_join_28: {
    life2_3 = (__fieldRead491_0() ^ 67363360821146L);
    spill491_0 = __call491_1();
    life5_8 = __call491_3(__call491_2(receiver));
    life4_9 = spill491_0;
    lexical_cycle_10: while (true) {
    lexical_join_26: {
    lexical_join_25: {
    if (!(__call491_4(life5_8))) {
        break lexical_join_28;
    }
    life6_16 = __cast491_6(__call491_5(life5_8));
    spill491_1 = life6_16;
    if (!((life4_9 != null))) {
        lexicalValue491_25_0 = spill491_1;
        break lexical_join_25;
    }
    if (!(__call491_8(__call491_7(spill491_1), p0))) {
        break lexical_join_26;
    }
    lexicalValue491_25_0 = life6_16;
    }
    return lexicalValue491_25_0;
    }
    if (!((life4_9 == null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return null;
}
public static void h491_0(moom.Oo p0) throws Throwable {
    throw __call1049100_0(p0);
}
public static void h491_1(moom.Oo p0) throws Throwable {
    throw __call1049101_0(p0);
}
private static native long __fieldRead491_0() throws Throwable;
private static native java.lang.String[] __call491_1() throws Throwable;
private static native java.util.List __call491_2(com.moon.module.SettingOwner a0) throws Throwable;
private static native java.util.Iterator __call491_3(java.util.List a0) throws Throwable;
private static native boolean __call491_4(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call491_5(java.util.Iterator a0) throws Throwable;
private static native com.moon.setting.Setting __cast491_6(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call491_7(com.moon.setting.Setting a0) throws Throwable;
private static native boolean __call491_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1049100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049101_0(moom.Oo a0) throws Throwable;

}


private static void __sourceInitializeParent() throws Throwable {
db = ((long)(((moom._a)(moom._c.a(((long)(-8942555815183930292L)), ((long)(1554788026252007793L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(90504072979086L)))));
    long local9_life6 = (com.moon.module.SettingOwner.db ^ 55212074935010L);
    java.lang.Object __sourceSpill254_8 = null;
    gb = ((java.util.Map)(new java.util.HashMap(13)));
    com.moon.module.SettingOwner.b(((int[])(__sourceSpill254_8)));
    javax.crypto.Cipher local0_life11;
    javax.crypto.Cipher __sourceSpill254_13 = (local0_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill254_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill254_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill254_16 = new byte[8];
    (__sourceSpill254_16)[0] = ((byte) ((int) (local9_life6 >>> 56)));
    int local1_life17 = 1;
    while ((local1_life17 < 8)) {
        (__sourceSpill254_16)[local1_life17] = ((byte) ((int) ((local9_life6 << (local1_life17 * 8)) >>> 56)));
        local1_life17 += 1;
    }
    byte[] __sourcePreallocation254_18 = __sourceSpill254_16;
    ((javax.crypto.Cipher)(__sourceSpill254_13)).init(((int)(__sourceSpill254_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill254_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation254_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local7_life21 = new java.lang.String[2];
    int local5_life22 = 0;
    java.lang.String local4_life23;
    int local6_life25 = ((java.lang.String)((local4_life23 = "\013)®[µ-Hóç\033%\"j*\023Ã¤\f¥\0325\027TOìéÈ\017Me\f\003\005×(\023j\013Ë£÷Õf©ÅÔ)²5Åïýauø\021fA\bE%Ég¸\021(8çb^B}mQtv\035kV\r¼ªÑktë0íãc\037w_¨o\n:"))).length();
    int local3_life26 = 80;
    int local2_life27 = -1;
    while (true) {
        local2_life27 += 1;
        byte[] __sourceSpill254_30 = ((java.lang.String)(((java.lang.String)(local4_life23)).substring(((int)(local2_life27)), ((int)((local2_life27 + local3_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill254_31 = local0_life11;
        byte[] local8_life33 = ((javax.crypto.Cipher)(__sourceSpill254_31)).doFinal(((byte[])(__sourceSpill254_30)));
        java.lang.String __sourceSpill254_36 = ((java.lang.String)(com.moon.module.SettingOwner.a(((byte[])(local8_life33))))).intern();
        java.lang.String[] __sourceSpill254_37 = local7_life21;
        int __sourceSpill254_38 = local5_life22;
        local5_life22 += 1;
        (__sourceSpill254_37)[__sourceSpill254_38] = __sourceSpill254_36;
        if (!(((local2_life27 = (local2_life27 + local3_life26)) < local6_life25))) { break; }
        local3_life26 = ((java.lang.String)(local4_life23)).charAt(((int)(local2_life27)));
    }
    eb = ((java.lang.String[])(local7_life21));
    fb = ((java.lang.String[])(new java.lang.String[2]));
    a = ((org.tinylog.TaggedLogger)(org.tinylog.Logger.tag(((java.lang.String)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite254_42(7799, (4106971352163206212L ^ local9_life6)))))));
}


public static int[] b__ArrayIntStatic() {
return com.moon.module.SettingOwner.c;
}


public static void b(int[] p0) {
c = ((int[])(p0));
    return;
}


public void discoverSettings() { __sourceHandlerCall_1984b3a6de87458bfda5(this); }


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
        byte[] spill1009_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1009_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1009_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1009_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1009_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1009_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.String a(int p0, long p1) throws Throwable {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 31142);
    if (((com.moon.module.SettingOwner.fb)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.SettingOwner.gb)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.SettingOwner.gb)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/k6", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.SettingOwner.eb)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.SettingOwner.fb)[life5_8] = com.moon.module.SettingOwner.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.SettingOwner.fb)[life5_8];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2318_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/k6"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.SettingOwner.__sourceCheckedDecoderCall076(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public com.moon.setting.Setting getSetting(java.lang.String p0) { return __sourceHandlerCall_3369f4d1431e1752e39a(this, p0); }


public java.util.List<com.moon.setting.Setting> getSettings() {
return this.settings;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite254_42(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2318_0() throws E;

private static native java.lang.String __sourceCheckedDecoderCall076(int p0, long p1);
}
