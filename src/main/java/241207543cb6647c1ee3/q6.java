package com.moon;


class q6 extends org.luaj.vm2.lib.VarArgFunction {

com.moon.jO a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

public org.luaj.vm2.Varargs invoke(org.luaj.vm2.Varargs p0) {
java.lang.Object forestValue167_29_0;
    java.lang.Object forestValue167_36_0;
    int spill167_0;
    org.luaj.vm2.LuaValue spill167_1;
    java.lang.Object spill167_2;
    long life2_3;
    org.luaj.vm2.LuaValue life5_8;
    int life4_9;
    java.lang.Object life6_30;
    com.moon.scripting.api.enums.TemplateType life7_40;
    com.moon.scripting.api.types.render.RenderBatch life8_59;
    forest_join_51: {
    forest_join_40: {
    forest_join_36: {
    forest_join_29: {
    forest_join_26: {
    life2_3 = (com.moon.q6.b ^ 44044792293103L);
    spill167_0 = com.moon.jN.b();
    life5_8 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(1)));
    life4_9 = spill167_0;
    spill167_1 = life5_8;
    if (!((life4_9 != 0))) {
        forestValue167_29_0 = spill167_1;
        break forest_join_29;
    }
    if (!(((org.luaj.vm2.LuaValue)(spill167_1)).isnil())) {
        break forest_join_26;
    }
    java.lang.String __stackOp167_6_0 = ((org.luaj.vm2.LuaValue)(life5_8)).typename();
    java.lang.String __stackOp167_6_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic167_5(24560, (6430629708846590934L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic167_7(__stackOp167_6_1, __stackOp167_6_0))));
    }
    forestValue167_29_0 = org.luaj.vm2.lib.jse.CoerceLuaToJava.coerce(((org.luaj.vm2.LuaValue)(life5_8)), ((java.lang.Class)(java.lang.Object.class)));
    }
    life6_30 = forestValue167_29_0;
    spill167_2 = life6_30;
    if (!((life4_9 != 0))) {
        forestValue167_36_0 = spill167_2;
        break forest_join_36;
    }
    if (!((((spill167_2 instanceof com.moon.scripting.api.enums.TemplateType) ? 1 : 0) != 0))) {
        break forest_join_40;
    }
    forestValue167_36_0 = life6_30;
    }
    life7_40 = ((com.moon.scripting.api.enums.TemplateType)(forestValue167_36_0));
    if (!((life4_9 == 0))) {
        break forest_join_51;
    }
    }
    java.lang.String __stackOp167_15_0 = ((org.luaj.vm2.LuaValue)(life5_8)).typename();
    java.lang.String __stackOp167_15_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic167_14(9803, (7961002646658749036L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic167_16(__stackOp167_15_1, __stackOp167_15_0))));
    }
    life8_59 = ((com.moon.jX)(((com.moon.jO)(this.a)).c)).prepare_batch(((com.moon.scripting.api.enums.TemplateType)(life7_40)));
    return com.moon.j6.a__LuaValue(((java.lang.Object)(life8_59)));
}


q6(com.moon.jO p0) { super(); }

private static void __sourceConstructorBody_cb4240bdbf1a891e(com.moon.q6 receiver, com.moon.jO p0) throws Throwable {
((com.moon.q6)(receiver)).a = ((com.moon.jO)(p0));
    com.moon.q6.__sourceConstructorInit_cb4240bdbf1a891e_0(((com.moon.q6)(receiver)));
    return;
}


static {
javax.crypto.Cipher forestValue143_36_0;
    int forestValue143_36_1;
    javax.crypto.SecretKeyFactory forestValue143_36_2;
    byte[] forestValue143_36_3;
    javax.crypto.Cipher forestValue143_53_0;
    int forestValue143_53_1;
    javax.crypto.SecretKeyFactory forestValue143_53_2;
    byte[] forestValue143_53_3;
    javax.crypto.Cipher spill143_0;
    int spill143_1;
    javax.crypto.SecretKeyFactory spill143_2;
    byte[] spill143_3;
    byte[] spill143_4;
    java.lang.String spill143_5;
    int spill143_6;
    java.lang.String spill143_7;
    java.lang.String[] spill143_8;
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
    b = ((long)(((moom._a)(moom._c.a(((long)(-6285280529827906432L)), ((long)(3033910376310488737L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(190260058026998L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (com.moon.q6.b ^ 26205024635093L);
    spill143_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill143_1 = 2;
    spill143_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp143_9_0 = new byte[8];
    spill143_3 = __stackOp143_9_0;
    (__stackOp143_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue143_36_0 = spill143_0;
    forestValue143_36_1 = spill143_1;
    forestValue143_36_2 = spill143_2;
    forestValue143_36_3 = spill143_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue143_53_0 = forestValue143_36_0;
        forestValue143_53_1 = forestValue143_36_1;
        forestValue143_53_2 = forestValue143_36_2;
        forestValue143_53_3 = forestValue143_36_3;
        break forest_join_53;
    }
    byte[] __stackOp143_10_0 = forestValue143_36_3;
    spill143_4 = __stackOp143_10_0;
    (__stackOp143_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue143_36_3 = spill143_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue143_53_0)).init(((int)(forestValue143_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue143_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue143_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life9_66 = new java.lang.String[2];
    life7_68 = 0;
    life8_73 = ((java.lang.String)((life6_71 = "\017dÌ\004Å~ÀÌÞ\t½[*Üs\016Î1á]õÄ#æ\021zXnn0×\003|\032~Fð×é\034ô\020[3ZëuòaµÙãP\030t1@TãOxñU°ªy\007Ú kºV\016\000ì¥(ÇRÈ#:õçÎmÌ\nJl:y=p=B[¼uíRÊ\032ò\b#¾2O1$¸É³n2"))).length();
    life5_75 = 64;
    life4_77 = -1;
    forest_cycle_78: while (true) {
    life4_77 += 1;
    spill143_5 = life6_71;
    int __stackOp143_14_0 = life4_77;
    java.lang.String __stackOp143_16_0 = ((java.lang.String)(spill143_5)).substring(((int)(__stackOp143_14_0)), ((int)((__stackOp143_14_0 + life5_75))));
    int __stackOp143_16_1 = -1;
    spill143_6 = __stackOp143_16_1;
    byte[] __stackOp143_18_0 = ((java.lang.String)(__stackOp143_16_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp143_18_1 = life2_20;
    life10_93 = ((javax.crypto.Cipher)(__stackOp143_18_1)).doFinal(((byte[])(__stackOp143_18_0)));
    int __stackOp143_22_0 = spill143_6;
    java.lang.String __stackOp143_22_1 = ((java.lang.String)(com.moon.q6.a(((byte[])(life10_93))))).intern();
    spill143_7 = __stackOp143_22_1;
    recovery.source.CarrierOps.discard(__stackOp143_22_0);
    java.lang.String __stackOp143_24_0 = spill143_7;
    java.lang.String[] __stackOp143_24_1 = life9_66;
    spill143_8 = __stackOp143_24_1;
    java.lang.String __stackOp143_25_0 = __stackOp143_24_0;
    int __stackOp143_25_1 = (life7_68++);
    (spill143_8)[__stackOp143_25_1] = __stackOp143_25_0;
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

private static native <E extends Throwable> void __sourceConstructorInit_cb4240bdbf1a891e_0(com.moon.q6 a0) throws E;
private static native <E extends Throwable> java.lang.String __sourceHandlerCall_a126990f9fd17bdc22f4(int a0, long a1) throws E;
private static final class __SourceHandler_a126990f9fd17bdc22f4 {

public static java.lang.String f136(int p0, long p1) throws Throwable {
    int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 16710);
    if (((__fieldRead136_0())[life5_8] == null)) {
        life3_16 = __call136_3(__call136_2(__call136_1()));
        life4_21 = __cast136_6(__call136_5(__fieldRead136_4(), life3_16));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = __call136_7("DES/CBC/PKCS5Padding");
        (life4_21)[1] = __call136_8("DES");
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        __call136_10(__fieldRead136_9(), life3_16, life4_21);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_63: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = __call136_12(__cast136_11((life4_21)[1]), life7_92);
        __call136_15(__cast136_13((life4_21)[0]), 2, life8_99, __cast136_14((life4_21)[2]));
        life9_116 = __call136_17((__fieldRead136_16())[life5_8], "ISO-8859-1");
        (__fieldRead136_18())[life5_8] = __call136_21(__call136_20(__cast136_19((life4_21)[0]), life9_116));
    }
    return (__fieldRead136_22())[life5_8];
}
public static java.lang.String h136_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    throw new java.lang.RuntimeException("com/moon/q6", local1);
}
private static native java.lang.String[] __fieldRead136_0() throws Throwable;
private static native java.lang.Thread __call136_1() throws Throwable;
private static native long __call136_2(java.lang.Thread a0) throws Throwable;
private static native java.lang.Long __call136_3(long a0) throws Throwable;
private static native java.util.Map __fieldRead136_4() throws Throwable;
private static native java.lang.Object __call136_5(java.util.Map a0, java.lang.Long a1) throws Throwable;
private static native java.lang.Object[] __cast136_6(java.lang.Object a0) throws Throwable;
private static native javax.crypto.Cipher __call136_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call136_8(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead136_9() throws Throwable;
private static native java.lang.Object __call136_10(java.util.Map a0, java.lang.Long a1, java.lang.Object[] a2) throws Throwable;
private static native javax.crypto.SecretKeyFactory __cast136_11(java.lang.Object a0) throws Throwable;
private static native javax.crypto.SecretKey __call136_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native javax.crypto.Cipher __cast136_13(java.lang.Object a0) throws Throwable;
private static native javax.crypto.spec.IvParameterSpec __cast136_14(java.lang.Object a0) throws Throwable;
private static native void __call136_15(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native java.lang.String[] __fieldRead136_16() throws Throwable;
private static native byte[] __call136_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __fieldRead136_18() throws Throwable;
private static native javax.crypto.Cipher __cast136_19(java.lang.Object a0) throws Throwable;
private static native byte[] __call136_20(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call136_21(byte[] a0) throws Throwable;
private static native java.lang.String[] __fieldRead136_22() throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_a57d0d919c840774e356(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_a57d0d919c840774e356 {

public static java.lang.invoke.CallSite f137(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill137_0 = life3_4;
    java.lang.invoke.MethodHandle spill137_1 = __call137_3(__methodHandleLiteral137_0(), __classLiteral137_1(), __call137_2(p2));
    int spill137_2 = 0;
    java.lang.Object[] __stackOp137_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill137_3 = __stackOp137_4_0;
    (__stackOp137_4_0)[0] = p0;
    java.lang.Object[] __stackOp137_5_0 = spill137_3;
    java.lang.Object[] spill137_4 = __stackOp137_5_0;
    (__stackOp137_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp137_6_0 = spill137_4;
    java.lang.Object[] spill137_5 = __stackOp137_6_0;
    (__stackOp137_6_0)[2] = p1;
    __call137_9(spill137_0, __call137_8(__call137_7(spill137_1, spill137_2, spill137_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h137_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2013700_6(__call2013700_5(__call2013700_3(__call2013700_2(__call2013700_1(__call2013700_0(new java.lang.StringBuilder(), "com/moon/q6"), " : "), p1), " : "), __call2013700_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral137_0() throws Throwable;
private static native java.lang.Object __classLiteral137_1() throws Throwable;
private static native int __call137_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call137_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call137_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call137_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call137_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2013700_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2013700_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2013700_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2013700_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2013700_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2013700_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2013700_6(java.lang.StringBuilder a0) throws Throwable;

}


private static java.lang.String a(int p0, long p1) { return __sourceHandlerCall_a126990f9fd17bdc22f4(p0, p1); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.q6.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_a57d0d919c840774e356(p0, p1, p2); }


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
        byte[] spill1248_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1248_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1248_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1248_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1248_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1248_2)[life4_9];
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


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic167_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic167_7(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic167_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic167_16(java.lang.String a0, java.lang.String a1) throws E;
}
