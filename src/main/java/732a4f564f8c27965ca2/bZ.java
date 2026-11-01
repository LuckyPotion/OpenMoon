package moom;


public class bZ extends sourcebuild.EnumConstructor<moom.bZ> {

public static moom.bZ BOOL;

public static moom.bZ INT;

public static moom.bZ FLOAT;

public static moom.bZ VEC2;

public static moom.bZ VEC3;

public static moom.bZ VEC4;

private static moom.bZ[] a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

private static long f;

private bZ(java.lang.String p0, int p1) {
super(p0, p1);
}


private static void initialize() {
b = ((long)(((moom._a)(moom._c.a(((long)(-3799910821042334096L)), ((long)(2030079523009056401L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(232382657198036L)))));
    long local14_life6 = (moom.bZ.b ^ 108609092616288L);
    e = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local5_life9;
    javax.crypto.Cipher __sourceSpill776_11 = (local5_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill776_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill776_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill776_14 = new byte[8];
    (__sourceSpill776_14)[0] = ((byte) ((int) (local14_life6 >>> 56)));
    int local6_life15 = 1;
    while ((local6_life15 < 8)) {
        (__sourceSpill776_14)[local6_life15] = ((byte) ((int) ((local14_life6 << (local6_life15 * 8)) >>> 56)));
        local6_life15 += 1;
    }
    byte[] __sourcePreallocation776_16 = __sourceSpill776_14;
    ((javax.crypto.Cipher)(__sourceSpill776_11)).init(((int)(__sourceSpill776_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill776_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation776_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local12_life19 = new java.lang.String[11];
    int local10_life20 = 0;
    java.lang.String local9_life21;
    int local11_life23 = ((java.lang.String)((local9_life21 = "^+Ãúº¦Úe\\'\030\032Òó\020\017Ü¼*Ô\031\032ÑÎ½çT©x*¢\020÷ÂS'Ò?zYªú;Ú5Õ\020ÜX«3z:Ú0dÜ¢³I{\020\005en\002á¼ýT\"ÇÆ+a0/¡\n´\b£&È±ÝIE¤Ñ\016ºB©\036HÏfï°\024áÀã:?rçhÏ\016°£í}·5`«0LfTgÐ\000ë\fÙö\030ö@£Á°øXä¨¼\033aÄ\000{;\025`:ÿ\035)P3\tÃâ\004ZyLz\004©\177\020Û\\û\001÷ Ió+\\Xþ~àÄ8GÍ~Ëø|ôïbÏgö\003+zÐX9\032&\004a[9¢2/ö/Kå\002[wÍå/\001¹Và\032ó\013ä>Í2ÞÔùof"))).length();
    int local8_life24 = 16;
    int local7_life25 = -1;
    while (true) {
        local7_life25 += 1;
        byte[] __sourceSpill776_28 = ((java.lang.String)(((java.lang.String)(local9_life21)).substring(((int)(local7_life25)), ((int)((local7_life25 + local8_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill776_29 = local5_life9;
        byte[] local13_life31 = ((javax.crypto.Cipher)(__sourceSpill776_29)).doFinal(((byte[])(__sourceSpill776_28)));
        java.lang.String __sourceSpill776_34 = ((java.lang.String)(moom.bZ.a(((byte[])(local13_life31))))).intern();
        java.lang.String[] __sourceSpill776_35 = local12_life19;
        int __sourceSpill776_36 = local10_life20;
        local10_life20 += 1;
        (__sourceSpill776_35)[__sourceSpill776_36] = __sourceSpill776_34;
        if (!(((local7_life25 = (local7_life25 + local8_life24)) < local11_life23))) { break; }
        local8_life24 = ((java.lang.String)(local9_life21)).charAt(((int)(local7_life25)));
    }
    local11_life23 = ((java.lang.String)((local9_life21 = "÷]ÆÒIÈøE\\Õåxä6wö²H\002fe\003ú\023Co\004#\\ñüÉ\bý]´ÓÁjèÆ\035QþdìzJ\006B9(¿ß\004zwBqÓë©Æj¼\033\031I&Ï\006ö=T2,¼'ër±J2$\024å"))).length();
    local8_life24 = 56;
    local7_life25 = -1;
    while (true) {
        local7_life25 += 1;
        byte[] __sourceSpill776_41 = ((java.lang.String)(((java.lang.String)(local9_life21)).substring(((int)(local7_life25)), ((int)((local7_life25 + local8_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill776_42 = local5_life9;
        byte[] local13_life44 = ((javax.crypto.Cipher)(__sourceSpill776_42)).doFinal(((byte[])(__sourceSpill776_41)));
        java.lang.String __sourceSpill776_47 = ((java.lang.String)(moom.bZ.a(((byte[])(local13_life44))))).intern();
        java.lang.String[] __sourceSpill776_48 = local12_life19;
        int __sourceSpill776_49 = local10_life20;
        local10_life20 += 1;
        (__sourceSpill776_48)[__sourceSpill776_49] = __sourceSpill776_47;
        if (!(((local7_life25 = (local7_life25 + local8_life24)) < local11_life23))) { break; }
        local8_life24 = ((java.lang.String)(local9_life21)).charAt(((int)(local7_life25)));
    }
    c = ((java.lang.String[])(local12_life19));
    d = ((java.lang.String[])(new java.lang.String[11]));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill776_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill776_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill776_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill776_59 = new byte[8];
    (__sourceSpill776_59)[0] = ((byte) ((int) (local14_life6 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill776_59)[local1_life60] = ((byte) ((int) ((local14_life6 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation776_61 = __sourceSpill776_59;
    ((javax.crypto.Cipher)(__sourceSpill776_56)).init(((int)(__sourceSpill776_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill776_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation776_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life64 = -3759121103044483631L;
    byte[] __sourceSpill776_65 = new byte[8];
    (__sourceSpill776_65)[0] = ((byte) ((int) (local2_life64 >>> 56)));
    (__sourceSpill776_65)[1] = ((byte) ((int) (local2_life64 >>> 48)));
    (__sourceSpill776_65)[2] = ((byte) ((int) (local2_life64 >>> 40)));
    (__sourceSpill776_65)[3] = ((byte) ((int) (local2_life64 >>> 32)));
    (__sourceSpill776_65)[4] = ((byte) ((int) (local2_life64 >>> 24)));
    (__sourceSpill776_65)[5] = ((byte) ((int) (local2_life64 >>> 16)));
    (__sourceSpill776_65)[6] = ((byte) ((int) (local2_life64 >>> 8)));
    (__sourceSpill776_65)[7] = ((byte) ((int) local2_life64));
    javax.crypto.Cipher __sourceSpill776_66 = local0_life54;
    byte[] local4_life68 = ((javax.crypto.Cipher)(__sourceSpill776_66)).doFinal(((byte[])(__sourceSpill776_65)));
    f = ((long)((((((((((((long) (local4_life68)[0]) & 255L) << 56) | ((((long) (local4_life68)[1]) & 255L) << 48)) | ((((long) (local4_life68)[2]) & 255L) << 40)) | ((((long) (local4_life68)[3]) & 255L) << 32)) | ((((long) (local4_life68)[4]) & 255L) << 24)) | ((((long) (local4_life68)[5]) & 255L) << 16)) | ((((long) (local4_life68)[6]) & 255L) << 8)) | (((long) (local4_life68)[7]) & 255L))));
    BOOL = ((moom.bZ)(new moom.bZ(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite776_70(2138, (1854383881926712259L ^ local14_life6)), 0)));
    INT = ((moom.bZ)(new moom.bZ(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite776_72(14079, (1948041572155139428L ^ local14_life6)), 1)));
    FLOAT = ((moom.bZ)(new moom.bZ(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite776_74(3688, (2315628641633279476L ^ local14_life6)), 2)));
    VEC2 = ((moom.bZ)(new moom.bZ(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite776_76(30854, (5857860577250831129L ^ local14_life6)), 3)));
    VEC3 = ((moom.bZ)(new moom.bZ(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite776_78(24856, (5003867771990241922L ^ local14_life6)), 4)));
    VEC4 = ((moom.bZ)(new moom.bZ(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite776_80(13387, (878371138221320147L ^ local14_life6)), 5)));
    a = ((moom.bZ[])(moom.bZ.a()));
}

private static native <E extends Throwable> moom.Nq __sourceHandlerCall_7f4f91bebd27a9717b33(moom.bZ a0, java.lang.String a1) throws E;
private static final class __SourceHandler_7f4f91bebd27a9717b33 {

public static moom.Nq f45(moom.bZ receiver, java.lang.String p0) throws Throwable {
    long life2_3;
    life2_3 = (__fieldRead45_0() ^ 16103488142678L);
    switch ((__fieldRead45_1())[__call45_2(receiver)]) {
case 1:
case 2:
{
        return new moom.Ns(p0);
    }
case 3:
{
        return new moom.Nr(p0);
    }
case 4:
{
        return new moom.Nt(p0);
    }
case 5:
{
        return new moom.Nv(p0);
    }
case 6:
{
        return new moom.Nw(p0);
    }
default:
{
        java.lang.Object __inlineStack45_4Token;
        throw new java.lang.RuntimeException(__invokedynamic45_5(__inlineStack45_4Output0((__inlineStack45_4Token = __inlineStack45_4Pack(receiver, __invokedynamic45_3(30079, (7531494283417934807L ^ life2_3))))), __inlineStack45_4Output1(__inlineStack45_4Token)));
    }
}
}
private static native long __fieldRead45_0() throws Throwable;
private static native int[] __fieldRead45_1() throws Throwable;
private static native int __call45_2(moom.bZ a0) throws Throwable;
private static native java.lang.String __invokedynamic45_3(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack45_4Pack(moom.bZ a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack45_4Output0(java.lang.Object token) throws Throwable;
private static native moom.bZ __inlineStack45_4Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic45_5(java.lang.String a0, moom.bZ a1) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e4f4692fe69659c2c21b(moom.bZ a0, moom.Lu a1, moom.Nq a2) throws E;
private static final class __SourceHandler_e4f4692fe69659c2c21b {

public static void f137(moom.bZ receiver, moom.Lu p0, moom.Nq p1) throws Throwable {
    long life3_3;
    java.lang.String life5_5;
    forward_join_55: {
    forward_join_48: {
    forward_join_41: {
    forward_join_34: {
    forward_join_27: {
    forward_join_20: {
    forward_join_19: {
    forward_join_13: {
    life3_3 = (__fieldRead137_0() ^ 87060820883912L);
    life5_5 = __call137_1();
    if (!((life5_5 != null))) {
        break forward_join_19;
    }
    switch ((__fieldRead137_2())[__call137_3(receiver)]) {
case 1:
{
        break forward_join_13;
    }
case 2:
{
        break forward_join_20;
    }
case 3:
{
        break forward_join_27;
    }
case 4:
{
        break forward_join_34;
    }
case 5:
{
        break forward_join_41;
    }
case 6:
{
        break forward_join_48;
    }
default:
{
        break forward_join_55;
    }
}
    }
    __call137_6(receiver, __cast137_4(p0), __cast137_5(p1));
    }
    return;
    }
    __call137_9(receiver, __cast137_7(p0), __cast137_8(p1));
    return;
    }
    __call137_12(receiver, __cast137_10(p0), __cast137_11(p1));
    return;
    }
    __call137_15(receiver, __cast137_13(p0), __cast137_14(p1));
    return;
    }
    __call137_18(receiver, __cast137_16(p0), __cast137_17(p1));
    return;
    }
    __call137_21(receiver, __cast137_19(p0), __cast137_20(p1));
    return;
    }
    java.lang.Object __inlineStack137_23Token;
    throw new java.lang.RuntimeException(__invokedynamic137_24(__inlineStack137_23Output0((__inlineStack137_23Token = __inlineStack137_23Pack(receiver, __invokedynamic137_22(31588, (4017597140124373341L ^ life3_3))))), __inlineStack137_23Output1(__inlineStack137_23Token)));
}
private static native long __fieldRead137_0() throws Throwable;
private static native java.lang.String __call137_1() throws Throwable;
private static native int[] __fieldRead137_2() throws Throwable;
private static native int __call137_3(moom.bZ a0) throws Throwable;
private static native moom.Lv __cast137_4(moom.Lu a0) throws Throwable;
private static native moom.Ns __cast137_5(moom.Nq a0) throws Throwable;
private static native void __call137_6(moom.bZ a0, moom.Lv a1, moom.Ns a2) throws Throwable;
private static native moom.Lx __cast137_7(moom.Lu a0) throws Throwable;
private static native moom.Ns __cast137_8(moom.Nq a0) throws Throwable;
private static native void __call137_9(moom.bZ a0, moom.Lx a1, moom.Ns a2) throws Throwable;
private static native moom.Lx __cast137_10(moom.Lu a0) throws Throwable;
private static native moom.Nr __cast137_11(moom.Nq a0) throws Throwable;
private static native void __call137_12(moom.bZ a0, moom.Lx a1, moom.Nr a2) throws Throwable;
private static native moom.Ly __cast137_13(moom.Lu a0) throws Throwable;
private static native moom.Nt __cast137_14(moom.Nq a0) throws Throwable;
private static native void __call137_15(moom.bZ a0, moom.Ly a1, moom.Nt a2) throws Throwable;
private static native moom.Ly __cast137_16(moom.Lu a0) throws Throwable;
private static native moom.Nv __cast137_17(moom.Nq a0) throws Throwable;
private static native void __call137_18(moom.bZ a0, moom.Ly a1, moom.Nv a2) throws Throwable;
private static native moom.Ly __cast137_19(moom.Lu a0) throws Throwable;
private static native moom.Nw __cast137_20(moom.Nq a0) throws Throwable;
private static native void __call137_21(moom.bZ a0, moom.Ly a1, moom.Nw a2) throws Throwable;
private static native java.lang.String __invokedynamic137_22(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack137_23Pack(moom.bZ a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack137_23Output0(java.lang.Object token) throws Throwable;
private static native moom.bZ __inlineStack137_23Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic137_24(java.lang.String a0, moom.bZ a1) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_42f739ea932b2758af2d(moom.bZ a0, moom.Ly a1, moom.Nt a2) throws E;
private static final class __SourceHandler_42f739ea932b2758af2d {

public static void f48(moom.bZ receiver, moom.Ly p0, moom.Nt p1) throws Throwable {
    java.lang.String spill48_0;
    long life3_3;
    float[] life6_7;
    java.lang.String life5_8;
    life3_3 = (__fieldRead48_0() ^ 84434795828772L);
    spill48_0 = __call48_1();
    life6_7 = __call48_2(p0);
    life5_8 = spill48_0;
    if ((life5_8 != null)) {
        if (((life6_7).length != 2)) {
        java.lang.Object __inlineStack48_4Token;
        throw new java.lang.RuntimeException(__invokedynamic48_5(__inlineStack48_4Output0((__inlineStack48_4Token = __inlineStack48_4Pack((life6_7).length, __invokedynamic48_3(2238, (5792427230858415464L ^ life3_3))))), __inlineStack48_4Output1(__inlineStack48_4Token)));
    }
        __call48_6(p1, (life6_7)[0], (life6_7)[1]);
    } else {
        
    }
    return;
}
private static native long __fieldRead48_0() throws Throwable;
private static native java.lang.String __call48_1() throws Throwable;
private static native float[] __call48_2(moom.Ly a0) throws Throwable;
private static native java.lang.String __invokedynamic48_3(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack48_4Pack(int a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack48_4Output0(java.lang.Object token) throws Throwable;
private static native int __inlineStack48_4Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic48_5(java.lang.String a0, int a1) throws Throwable;
private static native void __call48_6(moom.Nt a0, float a1, float a2) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_3bfea3b4e492720a7267(moom.bZ a0, moom.Ly a1, moom.Nv a2) throws E;
private static final class __SourceHandler_3bfea3b4e492720a7267 {

public static void f47(moom.bZ receiver, moom.Ly p0, moom.Nv p1) throws Throwable {
    java.lang.String spill47_0;
    long life3_3;
    float[] life6_7;
    java.lang.String life5_8;
    life3_3 = (__fieldRead47_0() ^ 73105335636804L);
    spill47_0 = __call47_1();
    life6_7 = __call47_2(p0);
    life5_8 = spill47_0;
    if ((life5_8 != null)) {
        if (((life6_7).length != 3)) {
        java.lang.Object __inlineStack47_4Token;
        throw new java.lang.RuntimeException(__invokedynamic47_5(__inlineStack47_4Output0((__inlineStack47_4Token = __inlineStack47_4Pack((life6_7).length, __invokedynamic47_3(14937, (608821374631115488L ^ life3_3))))), __inlineStack47_4Output1(__inlineStack47_4Token)));
    }
        __call47_6(p1, (life6_7)[0], (life6_7)[1], (life6_7)[2]);
    } else {
        
    }
    return;
}
private static native long __fieldRead47_0() throws Throwable;
private static native java.lang.String __call47_1() throws Throwable;
private static native float[] __call47_2(moom.Ly a0) throws Throwable;
private static native java.lang.String __invokedynamic47_3(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack47_4Pack(int a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack47_4Output0(java.lang.Object token) throws Throwable;
private static native int __inlineStack47_4Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic47_5(java.lang.String a0, int a1) throws Throwable;
private static native void __call47_6(moom.Nv a0, float a1, float a2, float a3) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_525bc3af0531a2507933(moom.bZ a0, moom.Ly a1, moom.Nw a2) throws E;
private static final class __SourceHandler_525bc3af0531a2507933 {

public static void f46(moom.bZ receiver, moom.Ly p0, moom.Nw p1) throws Throwable {
    java.lang.String spill46_0;
    long life3_3;
    float[] life6_7;
    java.lang.String life5_8;
    life3_3 = (__fieldRead46_0() ^ 19599762690793L);
    spill46_0 = __call46_1();
    life6_7 = __call46_2(p0);
    life5_8 = spill46_0;
    if ((life5_8 != null)) {
        if (((life6_7).length != 4)) {
        java.lang.Object __inlineStack46_4Token;
        throw new java.lang.RuntimeException(__invokedynamic46_5(__inlineStack46_4Output0((__inlineStack46_4Token = __inlineStack46_4Pack((life6_7).length, __invokedynamic46_3(21858, (6661386766459524216L ^ life3_3))))), __inlineStack46_4Output1(__inlineStack46_4Token)));
    }
        __call46_6(p1, (life6_7)[0], (life6_7)[1], (life6_7)[2], (life6_7)[3]);
    } else {
        
    }
    return;
}
private static native long __fieldRead46_0() throws Throwable;
private static native java.lang.String __call46_1() throws Throwable;
private static native float[] __call46_2(moom.Ly a0) throws Throwable;
private static native java.lang.String __invokedynamic46_3(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack46_4Pack(int a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack46_4Output0(java.lang.Object token) throws Throwable;
private static native int __inlineStack46_4Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic46_5(java.lang.String a0, int a1) throws Throwable;
private static native void __call46_6(moom.Nw a0, float a1, float a2, float a3, float a4) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_0fb104bf866b214e1598(moom.bZ a0, moom.bS a1) throws E;
private static final class __SourceHandler_0fb104bf866b214e1598 {

public static boolean f44(moom.bZ receiver, moom.bS p0) throws Throwable {
    long life2_3;
    life2_3 = (__fieldRead44_0() ^ 80436040453507L);
    switch ((__fieldRead44_1())[__call44_2(receiver)]) {
case 1:
{
        return ((p0 == __fieldRead44_3()) ? true : false);
    }
case 2:
case 3:
{
        return ((p0 == __fieldRead44_4()) ? true : false);
    }
case 4:
case 5:
case 6:
{
        return ((p0 == __fieldRead44_5()) ? true : false);
    }
default:
{
        java.lang.Object __inlineStack44_7Token;
        throw new java.lang.RuntimeException(__invokedynamic44_8(__inlineStack44_7Output0((__inlineStack44_7Token = __inlineStack44_7Pack(receiver, __invokedynamic44_6(30079, (7531559710888831746L ^ life2_3))))), __inlineStack44_7Output1(__inlineStack44_7Token)));
    }
}
}
private static native long __fieldRead44_0() throws Throwable;
private static native int[] __fieldRead44_1() throws Throwable;
private static native int __call44_2(moom.bZ a0) throws Throwable;
private static native moom.bS __fieldRead44_3() throws Throwable;
private static native moom.bS __fieldRead44_4() throws Throwable;
private static native moom.bS __fieldRead44_5() throws Throwable;
private static native java.lang.String __invokedynamic44_6(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack44_7Pack(moom.bZ a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack44_7Output0(java.lang.Object token) throws Throwable;
private static native moom.bZ __inlineStack44_7Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic44_8(java.lang.String a0, moom.bZ a1) throws Throwable;

}


public static moom.bZ[] values() {
return ((moom.bZ[])(((moom.bZ[])(moom.bZ.a)).clone()));
}


public static moom.bZ valueOf(java.lang.String p0) {
return ((moom.bZ)(java.lang.Enum.valueOf(((java.lang.Class)(moom.bZ.class)), ((java.lang.String)(p0)))));
}


private static moom.bZ[] a() {
long local0_life1 = (moom.bZ.b ^ 31177111647803L);
    moom.bZ[] __sourceSharedArray770_4 = new moom.bZ[((int) moom.bZ.f)];
    __sourceSharedArray770_4[0] = moom.bZ.BOOL;
    __sourceSharedArray770_4[1] = moom.bZ.INT;
    __sourceSharedArray770_4[2] = moom.bZ.FLOAT;
    __sourceSharedArray770_4[3] = moom.bZ.VEC2;
    __sourceSharedArray770_4[4] = moom.bZ.VEC3;
    __sourceSharedArray770_4[5] = moom.bZ.VEC4;
    return __sourceSharedArray770_4;
}


private static java.lang.RuntimeException a(java.lang.RuntimeException p0) {
return p0;
}


public static moom.bZ a__bZ(java.lang.String p0) {
java.lang.String spill1059_0;
    long life1_3;
    moom.bZ[] life4_6;
    moom.bZ[] life5_8;
    java.lang.String life3_9;
    int life6_12;
    int life7_14;
    moom.bZ life8_21;
    lexical_join_35: {
    life1_3 = (moom.bZ.b ^ 95140709566553L);
    spill1059_0 = moom.Nq.b__String();
    life4_6 = moom.bZ.values();
    life5_8 = life4_6;
    life3_9 = spill1059_0;
    life6_12 = (life5_8).length;
    life7_14 = 0;
    lexical_cycle_15: while (true) {
    lexical_join_33: {
    lexical_join_32: {
    if (!((life7_14 < life6_12))) {
        break lexical_join_35;
    }
    life8_21 = (life5_8)[life7_14];
    if (!((life3_9 != null))) {
        break lexical_join_33;
    }
    if (!(((java.lang.String)(((java.lang.String)(((moom.bZ)(life8_21)).name())).toLowerCase())).equals(((java.lang.Object)(p0))))) {
        break lexical_join_32;
    }
    return life8_21;
    }
    life7_14 += 1;
    }
    if (!((life3_9 == null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    return null;
}


public boolean a(moom.bS p0) { return __sourceHandlerCall_0fb104bf866b214e1598(this, p0); }


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6973_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/bZ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.bZ.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 20157);
    if (((moom.bZ.d)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.bZ.e)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.bZ.e)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/bZ", life9_51);
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
        life9_116 = ((java.lang.String)((moom.bZ.c)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.bZ.d)[life5_8] = moom.bZ.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.bZ.d)[life5_8];
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
        byte[] spill3540_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3540_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3540_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3540_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3540_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3540_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private void a(moom.Lx p0, moom.Ns p1) {
int local3 = ((int) ((moom.Lx)(p0)).a());
    ((moom.Ns)(p1)).c(((int)(local3)));
    return;
}


private void a(moom.Lv p0, moom.Ns p1) {
int forwardValue2979_14_0;
    int forwardValue2979_16_0;
    java.lang.String spill2979_0;
    int spill2979_1;
    long life3_3;
    int life6_7;
    java.lang.String life5_8;
    int life7_19;
    forward_join_16: {
    forward_join_15: {
    forward_join_14: {
    life3_3 = (moom.bZ.b ^ 66819357926477L);
    spill2979_0 = moom.Nq.b__String();
    life6_7 = ((((moom.Lv)(p0)).a__Boolean()) ? 1 : 0);
    life5_8 = spill2979_0;
    spill2979_1 = life6_7;
    if (!((life5_8 != null))) {
        forwardValue2979_14_0 = spill2979_1;
        break forward_join_14;
    }
    if (!((spill2979_1 != 0))) {
        break forward_join_15;
    }
    forwardValue2979_14_0 = 1;
    }
    forwardValue2979_16_0 = forwardValue2979_14_0;
    break forward_join_16;
    }
    forwardValue2979_16_0 = 0;
    }
    life7_19 = forwardValue2979_16_0;
    ((moom.Ns)(p1)).c(((int)(life7_19)));
    return;
}


public void a(moom.Lu p0, moom.Nq p1) { __sourceHandlerCall_e4f4692fe69659c2c21b(this, p0, p1); }


public moom.Nq a(java.lang.String p0) { return __sourceHandlerCall_7f4f91bebd27a9717b33(this, p0); }


private void a(moom.Ly p0, moom.Nw p1) { __sourceHandlerCall_525bc3af0531a2507933(this, p0, p1); }


private void a(moom.Ly p0, moom.Nv p1) { __sourceHandlerCall_3bfea3b4e492720a7267(this, p0, p1); }


private void a(moom.Ly p0, moom.Nt p1) { __sourceHandlerCall_42f739ea932b2758af2d(this, p0, p1); }


private void a(moom.Lx p0, moom.Nr p1) {
float local3 = ((moom.Lx)(p0)).a();
    ((moom.Nr)(p1)).a(((float)(local3)));
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite776_70(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite776_72(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite776_74(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite776_76(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite776_78(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite776_80(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0a9e63c4f848_invokedynamic45_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6973_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_50203959efab_invokedynamic137_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3f8696fcb1d8_invokedynamic48_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1c030a572aaa_invokedynamic47_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a439ad713050_invokedynamic46_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6ac8944ef9aa_invokedynamic44_6(int a0, long a1) throws E;
}
