package com.moon;


class qR extends org.luaj.vm2.lib.TwoArgFunction {

com.moon.jT a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

qR(com.moon.jT p0) { super(); }

private static void __sourceConstructorBody_02b9f030f3fc2a75(com.moon.qR receiver, com.moon.jT p0) throws Throwable {
((com.moon.qR)(receiver)).a = ((com.moon.jT)(p0));
    com.moon.qR.__sourceConstructorInit_02b9f030f3fc2a75_0(((com.moon.qR)(receiver)));
    return;
}


static {
javax.crypto.Cipher forestValue185_36_0;
    int forestValue185_36_1;
    javax.crypto.SecretKeyFactory forestValue185_36_2;
    byte[] forestValue185_36_3;
    javax.crypto.Cipher forestValue185_53_0;
    int forestValue185_53_1;
    javax.crypto.SecretKeyFactory forestValue185_53_2;
    byte[] forestValue185_53_3;
    javax.crypto.Cipher spill185_0;
    int spill185_1;
    javax.crypto.SecretKeyFactory spill185_2;
    byte[] spill185_3;
    byte[] spill185_4;
    java.lang.String spill185_5;
    int spill185_6;
    java.lang.String spill185_7;
    java.lang.String[] spill185_8;
    long life0_16;
    javax.crypto.Cipher life2_20;
    int life3_35;
    java.lang.String[] life9_66;
    int life7_68;
    java.lang.String life6_71;
    int life8_73;
    int life5_75;
    int life4_77;
    byte[] life10_93;
    forest_join_116: {
    forest_join_53: {
    b = ((long)(((moom._a)(moom._c.a(((long)(6683362730737636L)), ((long)(7093566905582623253L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(91294648006818L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (com.moon.qR.b ^ 35461411115054L);
    spill185_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill185_1 = 2;
    spill185_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp185_9_0 = new byte[8];
    spill185_3 = __stackOp185_9_0;
    (__stackOp185_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue185_36_0 = spill185_0;
    forestValue185_36_1 = spill185_1;
    forestValue185_36_2 = spill185_2;
    forestValue185_36_3 = spill185_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue185_53_0 = forestValue185_36_0;
        forestValue185_53_1 = forestValue185_36_1;
        forestValue185_53_2 = forestValue185_36_2;
        forestValue185_53_3 = forestValue185_36_3;
        break forest_join_53;
    }
    byte[] __stackOp185_10_0 = forestValue185_36_3;
    spill185_4 = __stackOp185_10_0;
    (__stackOp185_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue185_36_3 = spill185_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue185_53_0)).init(((int)(forestValue185_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue185_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue185_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life9_66 = new java.lang.String[2];
    life7_68 = 0;
    life8_73 = ((java.lang.String)((life6_71 = "««áï\027S«¨ú,\035U{øVïÝû\006ð\021TÝÄ6-u£·\031;KPéöó9Þ¹þ/\026ÊFd­\rúP,/N@Ï!/u¶¬QI\021Q´X»5­Ðòb`§¡'\03121V²éû6\003ÌdEh¢åÖ'2\002×õÐe\17796¿vòæ"))).length();
    life5_75 = 56;
    life4_77 = -1;
    forest_cycle_78: while (true) {
    life4_77 += 1;
    spill185_5 = life6_71;
    int __stackOp185_14_0 = life4_77;
    java.lang.String __stackOp185_16_0 = ((java.lang.String)(spill185_5)).substring(((int)(__stackOp185_14_0)), ((int)((__stackOp185_14_0 + life5_75))));
    int __stackOp185_16_1 = -1;
    spill185_6 = __stackOp185_16_1;
    byte[] __stackOp185_18_0 = ((java.lang.String)(__stackOp185_16_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp185_18_1 = life2_20;
    life10_93 = ((javax.crypto.Cipher)(__stackOp185_18_1)).doFinal(((byte[])(__stackOp185_18_0)));
    int __stackOp185_22_0 = spill185_6;
    java.lang.String __stackOp185_22_1 = ((java.lang.String)(com.moon.qR.a(((byte[])(life10_93))))).intern();
    spill185_7 = __stackOp185_22_1;
    recovery.source.CarrierOps.discard(__stackOp185_22_0);
    java.lang.String __stackOp185_24_0 = spill185_7;
    java.lang.String[] __stackOp185_24_1 = life9_66;
    spill185_8 = __stackOp185_24_1;
    java.lang.String __stackOp185_25_0 = __stackOp185_24_0;
    int __stackOp185_25_1 = (life7_68++);
    (spill185_8)[__stackOp185_25_1] = __stackOp185_25_0;
    if (!(((life4_77 = (life4_77 + life5_75)) < life8_73))) {
        break forest_join_116;
    }
    life5_75 = ((int)(((java.lang.String)(life6_71)).charAt(((int)(life4_77)))));
    continue forest_cycle_78;
    }
    }
    c = ((java.lang.String[])(life9_66));
    d = ((java.lang.String[])(new java.lang.String[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_02b9f030f3fc2a75_0(com.moon.qR a0) throws E;
private static native <E extends Throwable> java.lang.String __sourceHandlerCall_9ff270440826efc003a3(int a0, long a1) throws E;
private static final class __SourceHandler_9ff270440826efc003a3 {

public static java.lang.String f165(int p0, long p1) throws Throwable {
    int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 1334);
    if (((__fieldRead165_0())[life5_8] == null)) {
        life3_16 = __call165_3(__call165_2(__call165_1()));
        life4_21 = __cast165_6(__call165_5(__fieldRead165_4(), life3_16));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = __call165_7("DES/CBC/PKCS5Padding");
        (life4_21)[1] = __call165_8("DES");
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        __call165_10(__fieldRead165_9(), life3_16, life4_21);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_63: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = __call165_12(__cast165_11((life4_21)[1]), life7_92);
        __call165_15(__cast165_13((life4_21)[0]), 2, life8_99, __cast165_14((life4_21)[2]));
        life9_116 = __call165_17((__fieldRead165_16())[life5_8], "ISO-8859-1");
        (__fieldRead165_18())[life5_8] = __call165_21(__call165_20(__cast165_19((life4_21)[0]), life9_116));
    }
    return (__fieldRead165_22())[life5_8];
}
public static java.lang.String h165_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    throw new java.lang.RuntimeException("com/moon/qR", local1);
}
private static native java.lang.String[] __fieldRead165_0() throws Throwable;
private static native java.lang.Thread __call165_1() throws Throwable;
private static native long __call165_2(java.lang.Thread a0) throws Throwable;
private static native java.lang.Long __call165_3(long a0) throws Throwable;
private static native java.util.Map __fieldRead165_4() throws Throwable;
private static native java.lang.Object __call165_5(java.util.Map a0, java.lang.Long a1) throws Throwable;
private static native java.lang.Object[] __cast165_6(java.lang.Object a0) throws Throwable;
private static native javax.crypto.Cipher __call165_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call165_8(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead165_9() throws Throwable;
private static native java.lang.Object __call165_10(java.util.Map a0, java.lang.Long a1, java.lang.Object[] a2) throws Throwable;
private static native javax.crypto.SecretKeyFactory __cast165_11(java.lang.Object a0) throws Throwable;
private static native javax.crypto.SecretKey __call165_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native javax.crypto.Cipher __cast165_13(java.lang.Object a0) throws Throwable;
private static native javax.crypto.spec.IvParameterSpec __cast165_14(java.lang.Object a0) throws Throwable;
private static native void __call165_15(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native java.lang.String[] __fieldRead165_16() throws Throwable;
private static native byte[] __call165_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __fieldRead165_18() throws Throwable;
private static native javax.crypto.Cipher __cast165_19(java.lang.Object a0) throws Throwable;
private static native byte[] __call165_20(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call165_21(byte[] a0) throws Throwable;
private static native java.lang.String[] __fieldRead165_22() throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_ba6c201b48f5271c2859(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_ba6c201b48f5271c2859 {

public static java.lang.invoke.CallSite f166(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill166_0 = life3_4;
    java.lang.invoke.MethodHandle spill166_1 = __call166_3(__methodHandleLiteral166_0(), __classLiteral166_1(), __call166_2(p2));
    int spill166_2 = 0;
    java.lang.Object[] __stackOp166_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill166_3 = __stackOp166_4_0;
    (__stackOp166_4_0)[0] = p0;
    java.lang.Object[] __stackOp166_5_0 = spill166_3;
    java.lang.Object[] spill166_4 = __stackOp166_5_0;
    (__stackOp166_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp166_6_0 = spill166_4;
    java.lang.Object[] spill166_5 = __stackOp166_6_0;
    (__stackOp166_6_0)[2] = p1;
    __call166_9(spill166_0, __call166_8(__call166_7(spill166_1, spill166_2, spill166_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h166_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2016600_6(__call2016600_5(__call2016600_3(__call2016600_2(__call2016600_1(__call2016600_0(new java.lang.StringBuilder(), "com/moon/qR"), " : "), p1), " : "), __call2016600_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral166_0() throws Throwable;
private static native java.lang.Object __classLiteral166_1() throws Throwable;
private static native int __call166_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call166_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call166_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call166_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call166_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2016600_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2016600_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2016600_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2016600_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2016600_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2016600_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2016600_6(java.lang.StringBuilder a0) throws Throwable;

}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_ba6c201b48f5271c2859(p0, p1, p2); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.qR.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String a(int p0, long p1) { return __sourceHandlerCall_9ff270440826efc003a3(p0, p1); }


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
        byte[] spill1290_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1290_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1290_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1290_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1290_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1290_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public org.luaj.vm2.LuaValue call(org.luaj.vm2.LuaValue p0, org.luaj.vm2.LuaValue p1) {
org.luaj.vm2.LuaValue forwardValue1291_26_0;
    int forwardValue1291_31_0;
    org.luaj.vm2.LuaValue forwardValue1291_47_0;
    org.luaj.vm2.LuaValue forwardValue1291_57_0;
    org.luaj.vm2.LuaValue spill1291_0;
    boolean spill1291_1;
    org.luaj.vm2.LuaValue spill1291_2;
    org.luaj.vm2.LuaValue spill1291_3;
    long life3_3;
    int life5_5;
    forward_join_57: {
    forward_join_48: {
    forward_join_47: {
    forward_join_37: {
    forward_join_31: {
    forward_join_27: {
    forward_join_26: {
    forward_join_16: {
    life3_3 = (com.moon.qR.b ^ 33303640253001L);
    life5_5 = com.moon.jN.c();
    spill1291_0 = p0;
    if (!((life5_5 == 0))) {
        forwardValue1291_26_0 = spill1291_0;
        break forward_join_26;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill1291_0)).isnil()))) {
        break forward_join_16;
    }
    spill1291_1 = ((org.luaj.vm2.LuaValue)(p0)).isstring();
    if (!((life5_5 == 0))) {
        forwardValue1291_31_0 = ((spill1291_1) ? 1 : 0);
        break forward_join_31;
    }
    if (!((!spill1291_1))) {
        break forward_join_27;
    }
    }
    java.lang.String __stackOp1291_7_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp1291_7_1 = __sourceIntrinsic_fc861287a8ca_invokedynamic1291_6(32511, (805244692628402863L ^ life3_3));
    forwardValue1291_26_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_fc861287a8ca_invokedynamic1291_8(__stackOp1291_7_1, __stackOp1291_7_0))));
    }
    return forwardValue1291_26_0;
    }
    spill1291_2 = p1;
    if (!((life5_5 == 0))) {
        forwardValue1291_47_0 = spill1291_2;
        break forward_join_47;
    }
    forwardValue1291_31_0 = ((((org.luaj.vm2.LuaValue)(spill1291_2)).isnil()) ? 1 : 0);
    }
    if (!((forwardValue1291_31_0 == 0))) {
        break forward_join_37;
    }
    spill1291_3 = p1;
    if (!((life5_5 == 0))) {
        forwardValue1291_57_0 = spill1291_3;
        break forward_join_57;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill1291_3)).isboolean()))) {
        break forward_join_48;
    }
    }
    java.lang.String __stackOp1291_15_0 = ((org.luaj.vm2.LuaValue)(p1)).typename();
    java.lang.String __stackOp1291_15_1 = __sourceIntrinsic_fc861287a8ca_invokedynamic1291_14(22041, (79404573306280520L ^ life3_3));
    forwardValue1291_47_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_fc861287a8ca_invokedynamic1291_16(__stackOp1291_15_1, __stackOp1291_15_0))));
    }
    return forwardValue1291_47_0;
    }
    ((com.moon.j2)(((com.moon.jT)(this.a)).c)).set_state(((java.lang.String)(((org.luaj.vm2.LuaValue)(p0)).tojstring())), ((boolean)(((org.luaj.vm2.LuaValue)(p1)).toboolean())));
    forwardValue1291_57_0 = org.luaj.vm2.LuaValue.NIL;
    }
    return forwardValue1291_57_0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fc861287a8ca_invokedynamic1291_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fc861287a8ca_invokedynamic1291_8(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fc861287a8ca_invokedynamic1291_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fc861287a8ca_invokedynamic1291_16(java.lang.String a0, java.lang.String a1) throws E;
}
