package moom;


public class OA extends java.lang.Thread {

private moom.LQ a;

private static java.nio.charset.Charset b;

private static long c;

private static java.lang.String[] d;

private static java.lang.String[] e;

private static java.util.Map f;

private static long g;

public OA(moom.LQ p0) { super((java.lang.String)null); }

private static void __sourceConstructorBody_9a8632ba9486a10c(moom.OA receiver, moom.LQ p0) throws Throwable {
long local2 = (moom.OA.c ^ 43420489120446L);
    moom.OA.__sourceConstructorInit_9a8632ba9486a10c_0(((moom.OA)(receiver)), ((java.lang.String)(__sourceIntrinsic_9a8632ba9486a10c_originalDynamicSite2522_1(30101, (2178486969502148200L ^ local2)))));
    ((moom.OA)(receiver)).a = ((moom.LQ)(null));
    ((moom.OA)(receiver)).a = ((moom.LQ)(p0));
    return;
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(5928238386184656616L)), ((long)(4092803755957649012L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(178838173515470L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (moom.OA.c ^ 94106466755177L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill742_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill742_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill742_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill742_14 = new byte[8];
    (__sourceSpill742_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill742_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation742_16 = __sourceSpill742_14;
    ((javax.crypto.Cipher)(__sourceSpill742_11)).init(((int)(__sourceSpill742_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill742_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation742_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local14_life19 = new java.lang.String[4];
    int local12_life20 = 0;
    java.lang.String local11_life21;
    int local13_life23 = ((java.lang.String)((local11_life21 = "ªðØO\034²L0,¾då\003ñãÏ¢}\036X&v\025\031©Æoû\003 êÌG\022ð\\\020\036é¤¤\020.\nTXa5\017ÿVÏµ"))).length();
    int local10_life24 = 40;
    int local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill742_28 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill742_29 = local7_life9;
        byte[] local15_life31 = ((javax.crypto.Cipher)(__sourceSpill742_29)).doFinal(((byte[])(__sourceSpill742_28)));
        java.lang.String __sourceSpill742_34 = ((java.lang.String)(moom.OA.a(((byte[])(local15_life31))))).intern();
        java.lang.String[] __sourceSpill742_35 = local14_life19;
        int __sourceSpill742_36 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill742_35)[__sourceSpill742_36] = __sourceSpill742_34;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    local13_life23 = ((java.lang.String)((local11_life21 = "c£u\rþi¶\021ÜqX\022ï\nö\020\177@ìFkÙ£­­Î\031\037\013"))).length();
    local10_life24 = 16;
    local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill742_41 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill742_42 = local7_life9;
        byte[] local15_life44 = ((javax.crypto.Cipher)(__sourceSpill742_42)).doFinal(((byte[])(__sourceSpill742_41)));
        java.lang.String __sourceSpill742_47 = ((java.lang.String)(moom.OA.a(((byte[])(local15_life44))))).intern();
        java.lang.String[] __sourceSpill742_48 = local14_life19;
        int __sourceSpill742_49 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill742_48)[__sourceSpill742_49] = __sourceSpill742_47;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    d = ((java.lang.String[])(local14_life19));
    e = ((java.lang.String[])(new java.lang.String[4]));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill742_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill742_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill742_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill742_59 = new byte[8];
    (__sourceSpill742_59)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill742_59)[local1_life60] = ((byte) ((int) ((local5_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation742_61 = __sourceSpill742_59;
    ((javax.crypto.Cipher)(__sourceSpill742_56)).init(((int)(__sourceSpill742_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill742_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation742_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life64 = -4256587722546900430L;
    byte[] __sourceSpill742_65 = new byte[8];
    (__sourceSpill742_65)[0] = ((byte) ((int) (local2_life64 >>> 56)));
    (__sourceSpill742_65)[1] = ((byte) ((int) (local2_life64 >>> 48)));
    (__sourceSpill742_65)[2] = ((byte) ((int) (local2_life64 >>> 40)));
    (__sourceSpill742_65)[3] = ((byte) ((int) (local2_life64 >>> 32)));
    (__sourceSpill742_65)[4] = ((byte) ((int) (local2_life64 >>> 24)));
    (__sourceSpill742_65)[5] = ((byte) ((int) (local2_life64 >>> 16)));
    (__sourceSpill742_65)[6] = ((byte) ((int) (local2_life64 >>> 8)));
    (__sourceSpill742_65)[7] = ((byte) ((int) local2_life64));
    javax.crypto.Cipher __sourceSpill742_66 = local0_life54;
    byte[] local4_life68 = ((javax.crypto.Cipher)(__sourceSpill742_66)).doFinal(((byte[])(__sourceSpill742_65)));
    g = ((long)((((((((((((long) (local4_life68)[0]) & 255L) << 56) | ((((long) (local4_life68)[1]) & 255L) << 48)) | ((((long) (local4_life68)[2]) & 255L) << 40)) | ((((long) (local4_life68)[3]) & 255L) << 32)) | ((((long) (local4_life68)[4]) & 255L) << 24)) | ((((long) (local4_life68)[5]) & 255L) << 16)) | ((((long) (local4_life68)[6]) & 255L) << 8)) | (((long) (local4_life68)[7]) & 255L))));
    b = ((java.nio.charset.Charset)(java.nio.charset.StandardCharsets.US_ASCII));
}

private static native <E extends Throwable> void __sourceConstructorInit_9a8632ba9486a10c_0(moom.OA a0, java.lang.String a1) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_5efc519afe1f4474ac9a(moom.OA a0, moom.LS a1, java.io.OutputStream a2) throws E;
private static final class __SourceHandler_5efc519afe1f4474ac9a {

public static void f166(moom.OA receiver, moom.LS p0, java.io.OutputStream p1) throws Throwable {
    moom.OA spill166_0;
    java.io.OutputStream spill166_1;
    java.lang.String spill166_2;
    java.lang.String spill166_3;
    java.lang.String spill166_4;
    java.lang.String spill166_5;
    net.minecraft.entity.Entity[] spill166_6;
    moom.OA spill166_7;
    java.io.OutputStream spill166_8;
    java.lang.String spill166_9;
    long life3_3;
    java.util.Map life6_26;
    java.util.Iterator life7_31;
    net.minecraft.entity.Entity[] life5_32;
    java.lang.String life8_39;
    java.lang.String life9_45;
    lexical_join_75: {
    lexical_join_67: {
    life3_3 = (__fieldRead166_0() ^ 65181862348323L);
    spill166_0 = receiver;
    spill166_1 = p1;
    spill166_2 = __call166_1(p0);
    java.lang.String __stackOp166_4_0 = __call166_2(p0);
    java.lang.String __stackOp166_4_1 = __call166_3(p0);
    java.lang.String __stackOp166_4_2 = " ";
    spill166_3 = __stackOp166_4_2;
    spill166_4 = __stackOp166_4_0;
    spill166_5 = __stackOp166_4_1;
    __discardScalar166_5(__stackOp166_4_2);
    java.lang.String __stackOp166_6_0 = spill166_5;
    java.lang.String __stackOp166_6_1 = " ";
    __call166_9(spill166_0, spill166_1, __invokedynamic166_8(spill166_2, spill166_3, spill166_4, __stackOp166_6_1, __stackOp166_6_0, __invokedynamic166_7(7764, (6004017368772833591L ^ life3_3))));
    life6_26 = __call166_10(p0);
    spill166_6 = __call166_11();
    life7_31 = __call166_13(__call166_12(life6_26));
    life5_32 = spill166_6;
    lexical_cycle_33: while (true) {
    if (!(__call166_14(life7_31))) {
        break lexical_join_67;
    }
    life8_39 = __cast166_16(__call166_15(life7_31));
    life9_45 = __cast166_19(__call166_18(__call166_17(p0), life8_39));
    spill166_7 = receiver;
    spill166_8 = p1;
    spill166_9 = life8_39;
    java.lang.String __stackOp166_21_0 = life9_45;
    java.lang.String __stackOp166_21_1 = __invokedynamic166_20(22667, (1789217805019199465L ^ life3_3));
    __call166_24(spill166_7, spill166_8, __invokedynamic166_23(spill166_9, __stackOp166_21_1, __stackOp166_21_0, __invokedynamic166_22(5278, (3783787721646636031L ^ life3_3))));
    if (!((life5_32 != null))) {
        break lexical_join_75;
    }
    if (!((life5_32 == null))) { continue lexical_cycle_33; }
    break lexical_cycle_33;
    }
    }
    __call166_26(receiver, p1, __invokedynamic166_25(5278, (3783787721646636031L ^ life3_3)));
    }
    return;
}
public static void h166_0(java.io.IOException p0) throws Throwable {
    throw __call1016600_0(p0);
}
private static native long __fieldRead166_0() throws Throwable;
private static native java.lang.String __call166_1(moom.LS a0) throws Throwable;
private static native java.lang.String __call166_2(moom.LS a0) throws Throwable;
private static native java.lang.String __call166_3(moom.LS a0) throws Throwable;
private static native void __discardScalar166_5(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic166_7(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic166_8(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, java.lang.String a5) throws Throwable;
private static native void __call166_9(moom.OA a0, java.io.OutputStream a1, java.lang.String a2) throws Throwable;
private static native java.util.Map __call166_10(moom.LS a0) throws Throwable;
private static native net.minecraft.entity.Entity[] __call166_11() throws Throwable;
private static native java.util.Set __call166_12(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call166_13(java.util.Set a0) throws Throwable;
private static native boolean __call166_14(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call166_15(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast166_16(java.lang.Object a0) throws Throwable;
private static native java.util.Map __call166_17(moom.LS a0) throws Throwable;
private static native java.lang.Object __call166_18(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __cast166_19(java.lang.Object a0) throws Throwable;
private static native java.lang.String __invokedynamic166_20(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic166_22(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic166_23(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native void __call166_24(moom.OA a0, java.io.OutputStream a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic166_25(int a0, long a1) throws Throwable;
private static native void __call166_26(moom.OA a0, java.io.OutputStream a1, java.lang.String a2) throws Throwable;
private static native java.lang.Exception __call1016600_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d38e5f638ae6e016f411(moom.OA a0) throws E;
private static final class __SourceHandler_d38e5f638ae6e016f411 {

public static void f379(moom.OA receiver) throws Throwable {
    net.minecraft.entity.Entity[] spill379_0;
    long life1_3;
    java.lang.Object life4_6;
    net.minecraft.entity.Entity[] life3_7;
    moom.LR life4_15;
    moom.LS life5_18;
    java.io.OutputStream life6_22;
    forest_join_35: {
    life1_3 = (__fieldRead379_0() ^ 14509277940261L);
    spill379_0 = __call379_1();
    life4_6 = null;
    life3_7 = spill379_0;
    __call379_2(receiver);
    forest_cycle_10: while (true) {
    if (!((!__call379_3()))) {
        break forest_join_35;
    }
    life4_15 = __call379_5(__fieldRead379_4(receiver));
    life5_18 = __call379_6(life4_15);
    life6_22 = __call379_8(__fieldRead379_7(receiver));
    __call379_9(receiver, life5_18, life6_22);
    __call379_11(__fieldRead379_10(receiver), life4_15);
    if (!((life3_7 != null))) {
        break forest_join_35;
    }
    if (!((life3_7 == null))) {
        continue forest_cycle_10;
    }
    break forest_cycle_10;
    }
    }
    return;
}
public static void h379_0(java.lang.InterruptedException p0) throws Throwable {
    throw __call3037900_0(p0);
}
public static void h379_1(java.lang.InterruptedException p0) throws Throwable {
    java.lang.InterruptedException life1_2;
    life1_2 = p0;
    return;
}
public static void h379_2(java.lang.Exception p0, moom.OA p1, moom.LR p2) throws Throwable {
    java.lang.Exception life3_2;
    life3_2 = p0;
    __call3037902_1(__fieldRead3037902_0(p1), p2, life3_2);
    return;
}
private static native long __fieldRead379_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call379_1() throws Throwable;
private static native void __call379_2(moom.OA a0) throws Throwable;
private static native boolean __call379_3() throws Throwable;
private static native moom.LQ __fieldRead379_4(moom.OA a0) throws Throwable;
private static native moom.LR __call379_5(moom.LQ a0) throws Throwable;
private static native moom.LS __call379_6(moom.LR a0) throws Throwable;
private static native moom.LQ __fieldRead379_7(moom.OA a0) throws Throwable;
private static native java.io.OutputStream __call379_8(moom.LQ a0) throws Throwable;
private static native void __call379_9(moom.OA a0, moom.LS a1, java.io.OutputStream a2) throws Throwable;
private static native moom.LQ __fieldRead379_10(moom.OA a0) throws Throwable;
private static native void __call379_11(moom.LQ a0, moom.LR a1) throws Throwable;
private static native java.lang.Exception __call3037900_0(java.lang.InterruptedException a0) throws Throwable;
private static native moom.LQ __fieldRead3037902_0(moom.OA a0) throws Throwable;
private static native void __call3037902_1(moom.LQ a0, moom.LR a1, java.lang.Exception a2) throws Throwable;

}


public void run() { __sourceHandlerCall_d38e5f638ae6e016f411(this); }


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
        byte[] spill3416_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3416_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3416_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3416_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3416_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3416_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 32017);
    if (((moom.OA.e)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.OA.f)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.OA.f)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/OA", life9_51);
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
        life9_116 = ((java.lang.String)((moom.OA.d)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.OA.e)[life5_8] = moom.OA.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.OA.e)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.OA.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6767_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/OA"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private void a() throws java.io.IOException {
long local1 = (moom.OA.c ^ 100471816444217L);
    java.lang.String local3 = ((moom.LQ)(this.a)).a__String();
    int local4 = ((moom.LQ)(this.a)).b();
    java.net.Proxy local5 = ((moom.LQ)(this.a)).a__Proxy();
    java.net.Socket local6 = new java.net.Socket(local5);
    ((java.net.Socket)(local6)).connect(((java.net.SocketAddress)(new java.net.InetSocketAddress(local3, local4))), ((int)(((int) moom.OA.g))));
    ((moom.LQ)(this.a)).a(((java.net.Socket)(local6)));
    return;
}


private void a(moom.LS p0, java.io.OutputStream p1) throws java.io.IOException { __sourceHandlerCall_5efc519afe1f4474ac9a(this, p0, p1); }


private void a(java.io.OutputStream p0, java.lang.String p1) throws java.io.IOException {
byte[] local3 = ((java.lang.String)(p1)).getBytes(((java.nio.charset.Charset)(moom.OA.b)));
    ((java.io.OutputStream)(p0)).write(((byte[])(local3)));
    return;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9a8632ba9486a10c_originalDynamicSite2522_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6767_0() throws E;
}
