package moom;


public class N3 {

private static final long a;

private static final java.lang.String[] b;

private static final java.lang.String[] c;

private static final java.util.Map d;

private static final long e;

public N3() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(-173567257503721219L)), ((long)(-1212265260410177236L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(13259588862109L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (moom.N3.a ^ 121943367711140L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill715_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill715_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill715_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill715_14 = new byte[8];
    (__sourceSpill715_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill715_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation715_16 = __sourceSpill715_14;
    ((javax.crypto.Cipher)(__sourceSpill715_11)).init(((int)(__sourceSpill715_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill715_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation715_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local14_life19 = new java.lang.String[3];
    int local12_life20 = 0;
    java.lang.String local11_life21;
    int local13_life23 = ((java.lang.String)((local11_life21 = "TngK,µBÛ\035`o±4>¹þû]ïX\027\020âm©­Ò@+\030ó_\032=ÿS\034~1³q\026?,ãìß\b\020GVÓT×¾­1%zµÇí\033U¬®¤±õ´KÚõZä2$y\003f8\023k\030¯³ÙR\031ÂJGhF_x¢ä7´\027\021Ç²!"))).length();
    int local10_life24 = 32;
    int local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill715_28 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill715_29 = local7_life9;
        byte[] local15_life31 = ((javax.crypto.Cipher)(__sourceSpill715_29)).doFinal(((byte[])(__sourceSpill715_28)));
        java.lang.String __sourceSpill715_34 = ((java.lang.String)(moom.N3.a(((byte[])(local15_life31))))).intern();
        java.lang.String[] __sourceSpill715_35 = local14_life19;
        int __sourceSpill715_36 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill715_35)[__sourceSpill715_36] = __sourceSpill715_34;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    b = ((java.lang.String[])(local14_life19));
    c = ((java.lang.String[])(new java.lang.String[3]));
    javax.crypto.Cipher local0_life41;
    javax.crypto.Cipher __sourceSpill715_43 = (local0_life41 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill715_44 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill715_45 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill715_46 = new byte[8];
    (__sourceSpill715_46)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life47 = 1;
    while ((local1_life47 < 8)) {
        (__sourceSpill715_46)[local1_life47] = ((byte) ((int) ((local5_life7 << (local1_life47 * 8)) >>> 56)));
        local1_life47 += 1;
    }
    byte[] __sourcePreallocation715_48 = __sourceSpill715_46;
    ((javax.crypto.Cipher)(__sourceSpill715_43)).init(((int)(__sourceSpill715_44)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill715_45)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation715_48)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life51 = -988151376676966029L;
    byte[] __sourceSpill715_52 = new byte[8];
    (__sourceSpill715_52)[0] = ((byte) ((int) (local2_life51 >>> 56)));
    (__sourceSpill715_52)[1] = ((byte) ((int) (local2_life51 >>> 48)));
    (__sourceSpill715_52)[2] = ((byte) ((int) (local2_life51 >>> 40)));
    (__sourceSpill715_52)[3] = ((byte) ((int) (local2_life51 >>> 32)));
    (__sourceSpill715_52)[4] = ((byte) ((int) (local2_life51 >>> 24)));
    (__sourceSpill715_52)[5] = ((byte) ((int) (local2_life51 >>> 16)));
    (__sourceSpill715_52)[6] = ((byte) ((int) (local2_life51 >>> 8)));
    (__sourceSpill715_52)[7] = ((byte) ((int) local2_life51));
    javax.crypto.Cipher __sourceSpill715_53 = local0_life41;
    byte[] local4_life55 = ((javax.crypto.Cipher)(__sourceSpill715_53)).doFinal(((byte[])(__sourceSpill715_52)));
    e = ((long)((((((((((((long) (local4_life55)[0]) & 255L) << 56) | ((((long) (local4_life55)[1]) & 255L) << 48)) | ((((long) (local4_life55)[2]) & 255L) << 40)) | ((((long) (local4_life55)[3]) & 255L) << 32)) | ((((long) (local4_life55)[4]) & 255L) << 24)) | ((((long) (local4_life55)[5]) & 255L) << 16)) | ((((long) (local4_life55)[6]) & 255L) << 8)) | (((long) (local4_life55)[7]) & 255L))));
}


public static void main(java.lang.String[] p0) throws java.lang.Exception {
int spill978_0;
    long life1_9;
    moom.b4[] life4_12;
    moom.b4[] life5_14;
    int life6_17;
    int life7_19;
    int life3_20;
    moom.b4 life8_27;
    lexical_join_48: {
    life1_9 = (((moom._a)(moom._c.a(((long)(-6819330081875663056L)), ((long)(-8207088477038751919L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(163738313925383L))) ^ 1392945135495L);
    spill978_0 = moom.Ob.b();
    life4_12 = moom.b4.values();
    life5_14 = life4_12;
    life6_17 = (life5_14).length;
    life7_19 = 0;
    life3_20 = spill978_0;
    lexical_cycle_21: while (true) {
    if (!((life7_19 < life6_17))) {
        break lexical_join_48;
    }
    life8_27 = (life5_14)[life7_19];
    moom.b4 __stackOp978_7_0 = life8_27;
    java.lang.String __stackOp978_7_1 = __sourceIntrinsic_0809c461f4f8_invokedynamic978_6(18574, (8664797079836790404L ^ life1_9));
    moom.N3.a(((java.lang.String)(__sourceIntrinsic_0809c461f4f8_invokedynamic978_9(__stackOp978_7_1, __stackOp978_7_0, __sourceIntrinsic_0809c461f4f8_invokedynamic978_8(21264, (2372464589340284184L ^ life1_9))))));
    moom.N3.a(((moom.b4)(life8_27)), ((boolean)(false)));
    life7_19 += 1;
    if (!((life3_20 != 0))) { continue lexical_cycle_21; }
    break lexical_cycle_21;
    }
    }
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 26050);
    if (((moom.N3.c)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.N3.d)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.N3.d)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/N3", life9_51);
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
        life9_116 = ((java.lang.String)((moom.N3.b)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.N3.c)[life5_8] = moom.N3.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.N3.c)[life5_8];
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
        byte[] spill3274_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3274_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3274_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3274_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3274_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3274_2)[life4_9];
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
    java.lang.String local7 = moom.N3.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6510_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/N3"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static void a(java.lang.String p0) {
((java.io.PrintStream)(java.lang.System.out)).println(((java.lang.String)(p0)));
    return;
}


private static void a(moom.b4 p0, boolean p1) {
int spill798_0;
    java.lang.String spill798_1;
    java.lang.Object[] spill798_2;
    java.lang.Object[] spill798_3;
    java.lang.Object[] spill798_4;
    java.lang.Object[] spill798_5;
    long life2_3;
    int life4_7;
    double life5_16;
    double life7_19;
    int life9_31;
    int life10_33;
    double life11_48;
    float life13_57;
    float life14_61;
    forest_join_132: {
    forest_join_131: {
    forest_join_29: {
    forest_join_28: {
    forest_join_22: {
    forest_join_13: {
    life2_3 = (moom.N3.a ^ 24405025033480L);
    spill798_0 = moom.Ob.c();
    moom.Dr.h = ((boolean)(p1));
    life4_7 = spill798_0;
    switch ((moom.N4.a)[((moom.b4)(p0)).ordinal()]) {
case 1:
case 2:
{
        break forest_join_13;
    }
case 3:
case 4:
{
        break forest_join_22;
    }
default:
{
        break forest_join_28;
    }
}
    }
    life5_16 = ((double) (-moom.Dr.b));
    life7_19 = ((double) moom.Dr.b);
    if (!((life4_7 == 0))) {
        break forest_join_29;
    }
    }
    life5_16 = -0x1.0p0d;
    life7_19 = 0x1.0p0d;
    if (!((life4_7 == 0))) {
        break forest_join_29;
    }
    }
    return;
    }
    life9_31 = ((int) moom.N3.e);
    life10_33 = 0;
    forest_cycle_34: while (true) {
    forest_join_95: {
    forest_join_84: {
    forest_join_74: {
    forest_join_64: {
    forest_join_54: {
    if (!((life10_33 <= life9_31))) {
        break forest_join_132;
    }
    life11_48 = (life5_16 + ((((double) life10_33) * (life7_19 - life5_16)) / ((double) life9_31)));
    switch ((moom.N4.a)[((moom.b4)(p0)).ordinal()]) {
case 1:
{
        break forest_join_54;
    }
case 2:
{
        break forest_join_64;
    }
case 3:
{
        break forest_join_74;
    }
case 4:
{
        break forest_join_84;
    }
default:
{
        break forest_join_131;
    }
}
    }
    life13_57 = ((float) java.lang.Math.sin(((double)(life11_48))));
    life14_61 = moom.Dr.a(((float)(((float) life11_48))));
    if (!((life4_7 == 0))) {
        break forest_join_95;
    }
    }
    life13_57 = ((float) java.lang.Math.cos(((double)(life11_48))));
    life14_61 = moom.Dr.b(((float)(((float) life11_48))));
    if (!((life4_7 == 0))) {
        break forest_join_95;
    }
    }
    life13_57 = ((float) java.lang.Math.asin(((double)(life11_48))));
    life14_61 = moom.N2.a(((float)(((float) life11_48))));
    if (!((life4_7 == 0))) {
        break forest_join_95;
    }
    }
    life13_57 = ((float) java.lang.Math.acos(((double)(life11_48))));
    life14_61 = moom.N2.b(((float)(((float) life11_48))));
    if (!((life4_7 == 0))) {
        break forest_join_95;
    }
    break forest_join_131;
    }
    spill798_1 = __sourceIntrinsic_45dd673f9f20_invokedynamic798_18(25323, (2558259200227288700L ^ life2_3));
    java.lang.Object[] __stackOp798_19_0 = new java.lang.Object[4];
    spill798_2 = __stackOp798_19_0;
    (__stackOp798_19_0)[0] = java.lang.Double.valueOf(((double)(life11_48)));
    java.lang.Object[] __stackOp798_21_0 = spill798_2;
    spill798_3 = __stackOp798_21_0;
    (__stackOp798_21_0)[1] = java.lang.Float.valueOf(((float)(life13_57)));
    java.lang.Object[] __stackOp798_23_0 = spill798_3;
    spill798_4 = __stackOp798_23_0;
    (__stackOp798_23_0)[2] = java.lang.Float.valueOf(((float)(life14_61)));
    java.lang.Object[] __stackOp798_25_0 = spill798_4;
    spill798_5 = __stackOp798_25_0;
    (__stackOp798_25_0)[3] = java.lang.Float.valueOf(((float)(java.lang.Math.abs(((float)((life13_57 - life14_61)))))));
    moom.N3.a(((java.lang.String)(java.lang.String.format(((java.lang.String)(spill798_1)), ((java.lang.Object[])(spill798_5))))));
    life10_33 += 1;
    if (!((life4_7 == 0))) {
        continue forest_cycle_34;
    }
    break forest_cycle_34;
    }
    break forest_join_132;
    }
    return;
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6510_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_45dd673f9f20_invokedynamic798_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0809c461f4f8_invokedynamic978_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0809c461f4f8_invokedynamic978_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0809c461f4f8_invokedynamic978_9(java.lang.String a0, moom.b4 a1, java.lang.String a2) throws E;
}
