package com.moon;

import de.gerrygames.viarewind.api.ViaRewindConfigImpl;
import de.gerrygames.viarewind.api.ViaRewindPlatform;


public class pa implements ViaRewindPlatform {

private static long a;

private static java.lang.String[] b;

private static java.lang.String[] c;

private static java.util.Map d;

public pa(java.io.File p0) { super(); __sourceHandlerCall_5af6ce2955c0901c3197(this, p0); }


static {
javax.crypto.Cipher forestValue125_36_0;
    int forestValue125_36_1;
    javax.crypto.SecretKeyFactory forestValue125_36_2;
    byte[] forestValue125_36_3;
    javax.crypto.Cipher forestValue125_53_0;
    int forestValue125_53_1;
    javax.crypto.SecretKeyFactory forestValue125_53_2;
    byte[] forestValue125_53_3;
    javax.crypto.Cipher spill125_0;
    int spill125_1;
    javax.crypto.SecretKeyFactory spill125_2;
    byte[] spill125_3;
    byte[] spill125_4;
    java.lang.String spill125_5;
    int spill125_6;
    java.lang.String spill125_7;
    java.lang.String[] spill125_8;
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
    a = ((long)(((moom._a)(moom._c.a(((long)(6751425318149097556L)), ((long)(-8086818052712819616L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(237712833325575L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (com.moon.pa.a ^ 138728574401304L);
    spill125_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill125_1 = 2;
    spill125_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp125_9_0 = new byte[8];
    spill125_3 = __stackOp125_9_0;
    (__stackOp125_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue125_36_0 = spill125_0;
    forestValue125_36_1 = spill125_1;
    forestValue125_36_2 = spill125_2;
    forestValue125_36_3 = spill125_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue125_53_0 = forestValue125_36_0;
        forestValue125_53_1 = forestValue125_36_1;
        forestValue125_53_2 = forestValue125_36_2;
        forestValue125_53_3 = forestValue125_36_3;
        break forest_join_53;
    }
    byte[] __stackOp125_10_0 = forestValue125_36_3;
    spill125_4 = __stackOp125_10_0;
    (__stackOp125_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue125_36_3 = spill125_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue125_53_0)).init(((int)(forestValue125_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue125_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue125_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life9_66 = new java.lang.String[2];
    life7_68 = 0;
    life8_73 = ((java.lang.String)((life6_71 = "Å\bPV¹¢ÿÊFgs#ÃÀ\030Èîk¬\0274kMA\035\016)Ø¯g\001Uc\013®Õ"))).length();
    life5_75 = 16;
    life4_77 = -1;
    forest_cycle_78: while (true) {
    life4_77 += 1;
    spill125_5 = life6_71;
    int __stackOp125_14_0 = life4_77;
    java.lang.String __stackOp125_16_0 = ((java.lang.String)(spill125_5)).substring(((int)(__stackOp125_14_0)), ((int)((__stackOp125_14_0 + life5_75))));
    int __stackOp125_16_1 = -1;
    spill125_6 = __stackOp125_16_1;
    byte[] __stackOp125_18_0 = ((java.lang.String)(__stackOp125_16_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp125_18_1 = life2_20;
    life10_93 = ((javax.crypto.Cipher)(__stackOp125_18_1)).doFinal(((byte[])(__stackOp125_18_0)));
    int __stackOp125_22_0 = spill125_6;
    java.lang.String __stackOp125_22_1 = ((java.lang.String)(com.moon.pa.a(((byte[])(life10_93))))).intern();
    spill125_7 = __stackOp125_22_1;
    recovery.source.CarrierOps.discard(__stackOp125_22_0);
    java.lang.String __stackOp125_24_0 = spill125_7;
    java.lang.String[] __stackOp125_24_1 = life9_66;
    spill125_8 = __stackOp125_24_1;
    java.lang.String __stackOp125_25_0 = __stackOp125_24_0;
    int __stackOp125_25_1 = (life7_68++);
    (spill125_8)[__stackOp125_25_1] = __stackOp125_25_0;
    if (!(((life4_77 = (life4_77 + life5_75)) < life8_73))) {
        break forest_join_116;
    }
    life5_75 = ((int)(((java.lang.String)(life6_71)).charAt(((int)(life4_77)))));
    continue forest_cycle_78;
    }
    }
    b = ((java.lang.String[])(life9_66));
    c = ((java.lang.String[])(new java.lang.String[2]));
}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_6289fd4915d4278aef87(int a0, long a1) throws E;
private static final class __SourceHandler_6289fd4915d4278aef87 {

public static java.lang.String f117(int p0, long p1) throws Throwable {
    int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 21222);
    if (((__fieldRead117_0())[life5_8] == null)) {
        life3_16 = __call117_3(__call117_2(__call117_1()));
        life4_21 = __cast117_6(__call117_5(__fieldRead117_4(), life3_16));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = __call117_7("DES/CBC/PKCS5Padding");
        (life4_21)[1] = __call117_8("DES");
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        __call117_10(__fieldRead117_9(), life3_16, life4_21);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_63: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = __call117_12(__cast117_11((life4_21)[1]), life7_92);
        __call117_15(__cast117_13((life4_21)[0]), 2, life8_99, __cast117_14((life4_21)[2]));
        life9_116 = __call117_17((__fieldRead117_16())[life5_8], "ISO-8859-1");
        (__fieldRead117_18())[life5_8] = __call117_21(__call117_20(__cast117_19((life4_21)[0]), life9_116));
    }
    return (__fieldRead117_22())[life5_8];
}
public static java.lang.String h117_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    throw new java.lang.RuntimeException("com/moon/pa", local1);
}
private static native java.lang.String[] __fieldRead117_0() throws Throwable;
private static native java.lang.Thread __call117_1() throws Throwable;
private static native long __call117_2(java.lang.Thread a0) throws Throwable;
private static native java.lang.Long __call117_3(long a0) throws Throwable;
private static native java.util.Map __fieldRead117_4() throws Throwable;
private static native java.lang.Object __call117_5(java.util.Map a0, java.lang.Long a1) throws Throwable;
private static native java.lang.Object[] __cast117_6(java.lang.Object a0) throws Throwable;
private static native javax.crypto.Cipher __call117_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call117_8(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead117_9() throws Throwable;
private static native java.lang.Object __call117_10(java.util.Map a0, java.lang.Long a1, java.lang.Object[] a2) throws Throwable;
private static native javax.crypto.SecretKeyFactory __cast117_11(java.lang.Object a0) throws Throwable;
private static native javax.crypto.SecretKey __call117_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native javax.crypto.Cipher __cast117_13(java.lang.Object a0) throws Throwable;
private static native javax.crypto.spec.IvParameterSpec __cast117_14(java.lang.Object a0) throws Throwable;
private static native void __call117_15(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native java.lang.String[] __fieldRead117_16() throws Throwable;
private static native byte[] __call117_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __fieldRead117_18() throws Throwable;
private static native javax.crypto.Cipher __cast117_19(java.lang.Object a0) throws Throwable;
private static native byte[] __call117_20(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call117_21(byte[] a0) throws Throwable;
private static native java.lang.String[] __fieldRead117_22() throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_61963ff82ce1d66529e6(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_61963ff82ce1d66529e6 {

public static java.lang.invoke.CallSite f118(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill118_0 = life3_4;
    java.lang.invoke.MethodHandle spill118_1 = __call118_3(__methodHandleLiteral118_0(), __classLiteral118_1(), __call118_2(p2));
    int spill118_2 = 0;
    java.lang.Object[] __stackOp118_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill118_3 = __stackOp118_4_0;
    (__stackOp118_4_0)[0] = p0;
    java.lang.Object[] __stackOp118_5_0 = spill118_3;
    java.lang.Object[] spill118_4 = __stackOp118_5_0;
    (__stackOp118_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp118_6_0 = spill118_4;
    java.lang.Object[] spill118_5 = __stackOp118_6_0;
    (__stackOp118_6_0)[2] = p1;
    __call118_9(spill118_0, __call118_8(__call118_7(spill118_1, spill118_2, spill118_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h118_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2011800_6(__call2011800_5(__call2011800_3(__call2011800_2(__call2011800_1(__call2011800_0(new java.lang.StringBuilder(), "com/moon/pa"), " : "), p1), " : "), __call2011800_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral118_0() throws Throwable;
private static native java.lang.Object __classLiteral118_1() throws Throwable;
private static native int __call118_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call118_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call118_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call118_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call118_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2011800_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2011800_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2011800_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2011800_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2011800_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2011800_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2011800_6(java.lang.StringBuilder a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5af6ce2955c0901c3197(com.moon.pa a0, java.io.File a1) throws E;
private static final class __SourceHandler_5af6ce2955c0901c3197 {

public static void f740001(com.moon.pa receiver, java.io.File p0) throws Throwable {
    java.lang.String spill740001_0;
    long life2_3;
    java.lang.String life4_7;
    ViaRewindConfigImpl life5_26;
    life2_3 = (__fieldRead740001_0() ^ 20112885291172L);
    spill740001_0 = __call740001_1();
    __directSuperInit740001_2(receiver);
    life4_7 = spill740001_0;
    life5_26 = new ViaRewindConfigImpl(__call740001_8(__call740001_7(__call740001_5(__call740001_3(p0), __invokedynamic740001_4(25181, (1620066015437813782L ^ life2_3))), __invokedynamic740001_6(14732, (4902157650390819782L ^ life2_3)))));
    __call740001_9(life5_26);
    __call740001_10(receiver, life5_26);
    if ((__call740001_11() != null)) {
        __call740001_12("NE0kVb");
    } else {
        
    }
    return;
}
private static native long __fieldRead740001_0() throws Throwable;
private static native java.lang.String __call740001_1() throws Throwable;
private static native void __directSuperInit740001_2(com.moon.pa a0) throws Throwable;
private static native java.nio.file.Path __call740001_3(java.io.File a0) throws Throwable;
private static native java.lang.String __invokedynamic740001_4(int a0, long a1) throws Throwable;
private static native java.nio.file.Path __call740001_5(java.nio.file.Path a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic740001_6(int a0, long a1) throws Throwable;
private static native java.nio.file.Path __call740001_7(java.nio.file.Path a0, java.lang.String a1) throws Throwable;
private static native java.io.File __call740001_8(java.nio.file.Path a0) throws Throwable;
private static native void __call740001_9(ViaRewindConfigImpl a0) throws Throwable;
private static native void __call740001_10(com.moon.pa a0, ViaRewindConfigImpl a1) throws Throwable;
private static native java.lang.String[] __call740001_11() throws Throwable;
private static native void __call740001_12(java.lang.String a0) throws Throwable;

}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_61963ff82ce1d66529e6(p0, p1, p2); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.pa.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String a(int p0, long p1) { return __sourceHandlerCall_6289fd4915d4278aef87(p0, p1); }


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
        byte[] spill1205_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1205_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1205_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1205_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1205_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1205_2)[life4_9];
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


public java.util.logging.Logger getLogger() {
return ((com.moon.o4)(com.moon.o4.a__o4())).a__Logger();
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0dee28b8235b_invokedynamic740001_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0dee28b8235b_invokedynamic740001_6(int a0, long a1) throws E;
}
