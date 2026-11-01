package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class oW {

private static com.google.common.base.Splitter a;

private static java.util.regex.Pattern b;

java.util.Map<java.lang.String, java.lang.String> c;

private boolean d;

private static long e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

public oW() {
super();
    this.c = com.google.common.collect.Maps.newHashMap();
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(2523803357798843881L)), ((long)(2161499173737366689L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(121371263147271L)))));
    long local11_life6 = (moom.oW.e ^ 34076199678349L);
    h = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill954_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill954_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill954_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill954_14 = new byte[8];
    (__sourceSpill954_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill954_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation954_16 = __sourceSpill954_14;
    ((javax.crypto.Cipher)(__sourceSpill954_11)).init(((int)(__sourceSpill954_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill954_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation954_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[3];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "Äÿ«7â .i\004\036ò@éUÂ¤·CÌ\025à½"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill954_25 = local4_life21;
        int __sourceSpill954_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill954_25)).substring(((int)(__sourceSpill954_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill954_30 = local6_life19;
        int __sourceSpill954_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill954_33 = new byte[8];
        (__sourceSpill954_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill954_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill954_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill954_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill954_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill954_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill954_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill954_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill954_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill954_34)).doFinal(((byte[])(__sourceSpill954_33)));
        (__sourceSpill954_30)[__sourceSpill954_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    f = ((long[])(local6_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[3]));
    a = ((com.google.common.base.Splitter)(((com.google.common.base.Splitter)(com.google.common.base.Splitter.on(((char)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite954_39(12702, (7923127648795353922L ^ local11_life6))))))).limit(((int)(2)))));
    b = ((java.util.regex.Pattern)(java.util.regex.Pattern.compile(((java.lang.String)("%(\\d+\\$)?[\\d.]*[df]")))));
}

private static native <E extends Throwable> void __sourceHandlerCall_2a768ecb2f6fd67d210f(moom.oW a0) throws E;
private static final class __SourceHandler_2a768ecb2f6fd67d210f {

public static void f908(moom.oW receiver) throws Throwable {
    int forestValue908_30_0;
    int forestValue908_30_1;
    int forestValue908_57_0;
    moom.oW forestValue908_71_0;
    int forestValue908_71_1;
    moom.oW forestValue908_72_0;
    moom.oW forestValue908_73_0;
    int forestValue908_73_1;
    java.lang.String[] spill908_0;
    int spill908_1;
    char spill908_2;
    int spill908_3;
    moom.oW spill908_4;
    int spill908_5;
    long life1_3;
    int life4_9;
    int life5_11;
    java.util.Iterator life6_16;
    java.lang.String[] life3_17;
    java.lang.String life7_24;
    int life8_27;
    int life9_35;
    float life6_61;
    forest_join_73: {
    forest_join_72: {
    forest_join_71: {
    forest_join_57: {
    forest_join_56: {
    life1_3 = (__fieldRead908_0() ^ 7581360503778L);
    spill908_0 = __call908_1();
    __fieldWrite908_2(receiver, 0);
    life4_9 = 0;
    life5_11 = 0;
    life6_16 = __call908_5(__call908_4(__fieldRead908_3(receiver)));
    life3_17 = spill908_0;
    forest_cycle_18: while (true) {
    forest_join_54: {
    if (!(__call908_6(life6_16))) {
        break forest_join_56;
    }
    life7_24 = __cast908_8(__call908_7(life6_16));
    life8_27 = __call908_9(life7_24);
    forestValue908_30_0 = life5_11;
    forestValue908_30_1 = life8_27;
    forest_cycle_30: while (true) {
    life5_11 = (forestValue908_30_0 + forestValue908_30_1);
    spill908_1 = 0;
    if (!((life3_17 != null))) {
        forestValue908_57_0 = spill908_1;
        break forest_join_57;
    }
    life9_35 = spill908_1;
    forest_cycle_36: while (true) {
    forest_join_51: {
    if (!((life9_35 < life8_27))) {
        break forest_join_54;
    }
    spill908_2 = __call908_10(life7_24, life9_35);
    spill908_3 = __invokedynamic908_11(12154, (6936594961146492875L ^ life1_3));
    if (!((life3_17 != null))) {
        forestValue908_30_0 = __integerCategory908_12(spill908_2);
        forestValue908_30_1 = spill908_3;
        continue forest_cycle_30;
    }
    if (!((spill908_2 >= spill908_3))) {
        break forest_join_51;
    }
    life4_9 += 1;
    }
    life9_35 += 1;
    if (!((life3_17 == null))) {
        continue forest_cycle_36;
    }
    break forest_cycle_36;
    }
    break forest_cycle_30;
    }
    }
    if (!((life3_17 == null))) {
        continue forest_cycle_18;
    }
    break forest_cycle_18;
    }
    }
    forestValue908_57_0 = life4_9;
    }
    life6_61 = (((float) forestValue908_57_0) / ((float) life5_11));
    spill908_4 = receiver;
    spill908_5 = __numericCompare908_13(((double) life6_61), 0x1.999999999999ap-4d);
    if (!((life3_17 != null))) {
        forestValue908_71_0 = spill908_4;
        forestValue908_71_1 = spill908_5;
        break forest_join_71;
    }
    if (!((spill908_5 > 0))) {
        forestValue908_72_0 = spill908_4;
        break forest_join_72;
    }
    forestValue908_71_0 = spill908_4;
    forestValue908_71_1 = 1;
    }
    forestValue908_73_0 = forestValue908_71_0;
    forestValue908_73_1 = forestValue908_71_1;
    break forest_join_73;
    }
    forestValue908_73_0 = forestValue908_72_0;
    forestValue908_73_1 = 0;
    }
    __fieldWrite908_14(forestValue908_73_0, forestValue908_73_1);
    return;
}
public static void h908_0(java.util.IllegalFormatException p0) throws Throwable {
    throw __call3090800_0(p0);
}
private static native long __fieldRead908_0() throws Throwable;
private static native java.lang.String[] __call908_1() throws Throwable;
private static native void __fieldWrite908_2(moom.oW a0, int a1) throws Throwable;
private static native java.util.Map __fieldRead908_3(moom.oW a0) throws Throwable;
private static native java.util.Collection __call908_4(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call908_5(java.util.Collection a0) throws Throwable;
private static native boolean __call908_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call908_7(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast908_8(java.lang.Object a0) throws Throwable;
private static native int __call908_9(java.lang.String a0) throws Throwable;
private static native char __call908_10(java.lang.String a0, int a1) throws Throwable;
private static native int __invokedynamic908_11(int a0, long a1) throws Throwable;
private static native int __integerCategory908_12(char value) throws Throwable;
private static native int __numericCompare908_13(double a0, double a1) throws Throwable;
private static native void __fieldWrite908_14(moom.oW a0, int a1) throws Throwable;
private static native java.lang.Exception __call3090800_0(java.util.IllegalFormatException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4502beb585eb6ba197db(moom.oW a0, java.io.InputStream a1) throws E;
private static final class __SourceHandler_4502beb585eb6ba197db {

public static void f1089(moom.oW receiver, java.io.InputStream p0) throws Throwable {
    int lexicalValue1089_26_0;
    java.lang.String[] lexicalValue1089_46_0;
    java.lang.String[] spill1089_0;
    boolean spill1089_1;
    java.lang.String[] spill1089_2;
    long life2_3;
    java.util.Iterator life5_9;
    java.lang.String[] life4_10;
    java.lang.String life6_17;
    java.lang.String[] life7_44;
    java.lang.String life8_60;
    java.lang.String life9_68;
    lexical_join_65: {
    life2_3 = (__fieldRead1089_0() ^ 82770207594523L);
    spill1089_0 = __call1089_1();
    life5_9 = __call1089_4(__call1089_3(p0, __fieldRead1089_2()));
    life4_10 = spill1089_0;
    lexical_cycle_11: while (true) {
    lexical_join_63: {
    lexical_join_46: {
    lexical_join_26: {
    if (!(__call1089_5(life5_9))) {
        break lexical_join_65;
    }
    life6_17 = __cast1089_7(__call1089_6(life5_9));
    spill1089_1 = __call1089_8(life6_17);
    if (!((life4_10 != null))) {
        lexicalValue1089_26_0 = __integerCategory1089_9(spill1089_1);
        break lexical_join_26;
    }
    if (!((!spill1089_1))) {
        break lexical_join_63;
    }
    lexicalValue1089_26_0 = __integerCategory1089_11(__call1089_10(life6_17, 0));
    }
    if (!((lexicalValue1089_26_0 != __invokedynamic1089_12(29696, (6497174399967727433L ^ life2_3))))) {
        break lexical_join_63;
    }
    life7_44 = __cast1089_17(__call1089_16(__call1089_14(__fieldRead1089_13(), life6_17), __classLiteral1089_15()));
    spill1089_2 = life7_44;
    if (!((life4_10 != null))) {
        lexicalValue1089_46_0 = spill1089_2;
        break lexical_join_46;
    }
    if (!(((spill1089_2).length == 2))) {
        break lexical_join_63;
    }
    lexicalValue1089_46_0 = life7_44;
    }
    life8_60 = (lexicalValue1089_46_0)[0];
    life9_68 = __call1089_20(__call1089_19(__fieldRead1089_18(), (life7_44)[1]), "%$1s");
    __call1089_22(__fieldRead1089_21(receiver), life8_60, life9_68);
    }
    if (!((life4_10 == null))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    return;
}
public static void h1089_0(java.io.IOException p0) throws Throwable {
    throw __call1108900_0(p0);
}
public static void h1089_1(java.io.IOException p0) throws Throwable {
    throw __call1108901_0(p0);
}
public static void h1089_2(java.io.IOException p0) throws Throwable {
    throw __call1108902_0(p0);
}
public static void h1089_3(java.io.IOException p0) throws Throwable {
    throw __call1108903_0(p0);
}
private static native long __fieldRead1089_0() throws Throwable;
private static native java.lang.String[] __call1089_1() throws Throwable;
private static native java.nio.charset.Charset __fieldRead1089_2() throws Throwable;
private static native java.util.List __call1089_3(java.io.InputStream a0, java.nio.charset.Charset a1) throws Throwable;
private static native java.util.Iterator __call1089_4(java.util.List a0) throws Throwable;
private static native boolean __call1089_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1089_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast1089_7(java.lang.Object a0) throws Throwable;
private static native boolean __call1089_8(java.lang.String a0) throws Throwable;
private static native int __integerCategory1089_9(boolean value) throws Throwable;
private static native char __call1089_10(java.lang.String a0, int a1) throws Throwable;
private static native int __integerCategory1089_11(char value) throws Throwable;
private static native int __invokedynamic1089_12(int a0, long a1) throws Throwable;
private static native com.google.common.base.Splitter __fieldRead1089_13() throws Throwable;
private static native java.lang.Iterable __call1089_14(com.google.common.base.Splitter a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __classLiteral1089_15() throws Throwable;
private static native java.lang.Object[] __call1089_16(java.lang.Iterable a0, java.lang.Object a1) throws Throwable;
private static native java.lang.String[] __cast1089_17(java.lang.Object[] a0) throws Throwable;
private static native java.util.regex.Pattern __fieldRead1089_18() throws Throwable;
private static native java.util.regex.Matcher __call1089_19(java.util.regex.Pattern a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call1089_20(java.util.regex.Matcher a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead1089_21(moom.oW a0) throws Throwable;
private static native java.lang.Object __call1089_22(java.util.Map a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.Exception __call1108900_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1108901_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1108902_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1108903_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_226c42e3d63382443f1c(moom.oW a0, java.lang.String a1) throws E;
private static final class __SourceHandler_226c42e3d63382443f1c {

public static java.lang.String f1883(moom.oW receiver, java.lang.String p0) throws Throwable {
    long life2_3;
    java.lang.String life4_9;
    life2_3 = (__fieldRead1883_0() ^ 88959105350308L);
    life4_9 = __cast1883_3(__call1883_2(__fieldRead1883_1(receiver), p0));
    return ((life4_9 == null) ? p0 : life4_9);
}
public static void h1883_0(java.util.IllegalFormatException p0) throws Throwable {
    throw __call1188300_0(p0);
}
private static native long __fieldRead1883_0() throws Throwable;
private static native java.util.Map __fieldRead1883_1(moom.oW a0) throws Throwable;
private static native java.lang.Object __call1883_2(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __cast1883_3(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1188300_0(java.util.IllegalFormatException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_54965d2922da2ba64c8c(moom.oW a0, java.util.List a1) throws E;
private static final class __SourceHandler_54965d2922da2ba64c8c {

public static void f473(moom.oW receiver, java.util.List p0) throws Throwable {
    java.lang.String[] spill473_0;
    long life2_3;
    java.util.Iterator life5_7;
    java.lang.String[] life4_8;
    net.minecraft.client.resources.IResource life6_15;
    java.io.InputStream life7_18;
    forest_join_26: {
    life2_3 = (__fieldRead473_0() ^ 66575889593L);
    spill473_0 = __call473_1();
    life5_7 = __call473_2(p0);
    life4_8 = spill473_0;
    forest_cycle_9: while (true) {
    if (!(__call473_3(life5_7))) {
        break forest_join_26;
    }
    life6_15 = __cast473_5(__call473_4(life5_7));
    life7_18 = __call473_6(life6_15);
    __call473_7(receiver, life7_18);
    __call473_8(life7_18);
    if (!((life4_8 == null))) {
        continue forest_cycle_9;
    }
    break forest_cycle_9;
    }
    }
    return;
}
public static void h473_0(java.lang.Throwable p0, java.io.InputStream p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3047300_0(p1);
    throw life2_2;
}
private static native long __fieldRead473_0() throws Throwable;
private static native java.lang.String[] __call473_1() throws Throwable;
private static native java.util.Iterator __call473_2(java.util.List a0) throws Throwable;
private static native boolean __call473_3(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call473_4(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.resources.IResource __cast473_5(java.lang.Object a0) throws Throwable;
private static native java.io.InputStream __call473_6(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native void __call473_7(moom.oW a0, java.io.InputStream a1) throws Throwable;
private static native void __call473_8(java.io.InputStream a0) throws Throwable;
private static native void __call3047300_0(java.io.InputStream a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_a3d401a4cc411d8f0398(moom.oW a0, moom.oR a1, java.util.List a2) throws E;
private static final class __SourceHandler_a3d401a4cc411d8f0398 {

public static void f907(moom.oW receiver, moom.oR p0, java.util.List p1) throws Throwable {
    java.lang.String[] spill907_0;
    java.lang.String spill907_1;
    java.lang.Object[] spill907_2;
    long life3_3;
    java.util.Iterator life6_10;
    java.lang.String[] life5_11;
    java.lang.String life7_20;
    java.lang.String life8_29;
    java.util.Iterator life9_36;
    java.lang.String life10_45;
    forest_join_58: {
    forest_join_56: {
    life3_3 = (__fieldRead907_0() ^ 5488694532389L);
    __call907_2(__fieldRead907_1(receiver));
    spill907_0 = __call907_3();
    life6_10 = __call907_4(p1);
    life5_11 = spill907_0;
    forest_cycle_12: while (true) {
    forest_join_54: {
    if (!(__call907_5(life6_10))) {
        break forest_join_56;
    }
    life7_20 = __cast907_7(__call907_6(life6_10));
    spill907_1 = "lang/%s.lang";
    java.lang.Object[] __stackOp907_8_0 = new java.lang.Object[1];
    spill907_2 = __stackOp907_8_0;
    (__stackOp907_8_0)[0] = life7_20;
    life8_29 = __call907_9(spill907_1, spill907_2);
    if (!((life5_11 != null))) {
        break forest_join_58;
    }
    life9_36 = __call907_11(__call907_10(p0));
    forest_cycle_34: while (true) {
    if (!(__call907_12(life9_36))) {
        break forest_join_54;
    }
    life10_45 = __cast907_14(__call907_13(life9_36));
    __call907_16(receiver, __call907_15(p0, new moom.DD(life10_45, life8_29)));
    if (!((life5_11 != null))) {
        continue forest_cycle_12;
    }
    if (!((life5_11 == null))) {
        continue forest_cycle_34;
    }
    break forest_cycle_34;
    }
    }
    if (!((life5_11 == null))) {
        continue forest_cycle_12;
    }
    break forest_cycle_12;
    }
    }
    __call907_17(receiver);
    }
    return;
}
public static void h907_0(java.io.IOException p0, moom.oW p1, moom.oR p2, java.lang.String[] p3, java.util.Iterator p4, java.lang.String p5, java.lang.String p6, java.util.Iterator p7, java.lang.String p8) throws Throwable {
    java.lang.String spill3090700_0;
    java.lang.Object[] spill3090700_1;
    java.lang.String spill3090700_2;
    java.lang.Object[] spill3090700_3;
    java.io.IOException life9_2;
    java.lang.String life8_14;
    java.lang.String life5_37;
    java.lang.String life5_66;
    java.lang.String life8_91;
    forest_join_97: {
    forest_join_95: {
    life9_2 = p0;
    forest_cycle_2: while (true) {
    forest_join_94: {
    forest_join_51: {
    forest_join_50: {
    forest_join_5: {
    if (!((p3 == null))) {
        break forest_join_5;
    }
    break forest_join_51;
    }
    forest_cycle_5: while (true) {
    forest_join_27: {
    forest_join_24: {
    if (!(__call3090700_0(p7))) {
        break forest_join_24;
    }
    life8_14 = __cast3090700_2(__call3090700_1(p7));
    __call3090700_4(p1, __call3090700_3(p2, new moom.DD(life8_14, p6)));
    if (!((p3 != null))) {
        break forest_join_27;
    }
    break forest_join_50;
    }
    if (!((p3 == null))) {
        break forest_join_27;
    }
    break forest_join_95;
    }
    if (!(__call3090700_5(p4))) {
        break forest_join_95;
    }
    life5_37 = __cast3090700_7(__call3090700_6(p4));
    spill3090700_0 = "lang/%s.lang";
    java.lang.Object[] __stackOp3090700_8_0 = new java.lang.Object[1];
    spill3090700_1 = __stackOp3090700_8_0;
    (__stackOp3090700_8_0)[0] = life5_37;
    p6 = __call3090700_9(spill3090700_0, spill3090700_1);
    if (!((p3 != null))) {
        break forest_join_97;
    }
    p7 = __call3090700_11(__call3090700_10(p2));
    continue forest_cycle_5;
    }
    }
    break forest_join_94;
    }
    forest_cycle_51: while (true) {
    forest_join_54: {
    if (!((p3 == null))) {
        break forest_join_54;
    }
    break forest_join_95;
    }
    forest_cycle_54: while (true) {
    if (!(__call3090700_12(p4))) {
        break forest_join_95;
    }
    life5_66 = __cast3090700_14(__call3090700_13(p4));
    spill3090700_2 = "lang/%s.lang";
    java.lang.Object[] __stackOp3090700_15_0 = new java.lang.Object[1];
    spill3090700_3 = __stackOp3090700_15_0;
    (__stackOp3090700_15_0)[0] = life5_66;
    p6 = __call3090700_16(spill3090700_2, spill3090700_3);
    if (!((p3 != null))) {
        break forest_join_97;
    }
    p7 = __call3090700_18(__call3090700_17(p2));
    if (!(__call3090700_19(p7))) {
        continue forest_cycle_51;
    }
    life8_91 = __cast3090700_21(__call3090700_20(p7));
    __call3090700_23(p1, __call3090700_22(p2, new moom.DD(life8_91, p6)));
    if (!((p3 != null))) {
        continue forest_cycle_54;
    }
    break forest_cycle_54;
    }
    break forest_cycle_51;
    }
    }
    continue forest_cycle_2;
    }
    }
    __call3090700_24(p1);
    }
    return;
}
private static native long __fieldRead907_0() throws Throwable;
private static native java.util.Map __fieldRead907_1(moom.oW a0) throws Throwable;
private static native void __call907_2(java.util.Map a0) throws Throwable;
private static native java.lang.String[] __call907_3() throws Throwable;
private static native java.util.Iterator __call907_4(java.util.List a0) throws Throwable;
private static native boolean __call907_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call907_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast907_7(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call907_9(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.util.Set __call907_10(moom.oR a0) throws Throwable;
private static native java.util.Iterator __call907_11(java.util.Set a0) throws Throwable;
private static native boolean __call907_12(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call907_13(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast907_14(java.lang.Object a0) throws Throwable;
private static native java.util.List __call907_15(moom.oR a0, moom.DD a1) throws Throwable;
private static native void __call907_16(moom.oW a0, java.util.List a1) throws Throwable;
private static native void __call907_17(moom.oW a0) throws Throwable;
private static native boolean __call3090700_0(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3090700_1(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast3090700_2(java.lang.Object a0) throws Throwable;
private static native java.util.List __call3090700_3(moom.oR a0, moom.DD a1) throws Throwable;
private static native void __call3090700_4(moom.oW a0, java.util.List a1) throws Throwable;
private static native boolean __call3090700_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3090700_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast3090700_7(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call3090700_9(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.util.Set __call3090700_10(moom.oR a0) throws Throwable;
private static native java.util.Iterator __call3090700_11(java.util.Set a0) throws Throwable;
private static native boolean __call3090700_12(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3090700_13(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast3090700_14(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call3090700_16(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.util.Set __call3090700_17(moom.oR a0) throws Throwable;
private static native java.util.Iterator __call3090700_18(java.util.Set a0) throws Throwable;
private static native boolean __call3090700_19(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3090700_20(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast3090700_21(java.lang.Object a0) throws Throwable;
private static native java.util.List __call3090700_22(moom.oR a0, moom.DD a1) throws Throwable;
private static native void __call3090700_23(moom.oW a0, java.util.List a1) throws Throwable;
private static native void __call3090700_24(moom.oW a0) throws Throwable;

}


public java.lang.String a(java.lang.String p0, java.lang.Object[] p1) {
java.lang.String local3 = ((moom.oW)(this)).a(((java.lang.String)(p0)));
    try {
        return java.lang.String.format(((java.lang.String)(local3)), ((java.lang.Object[])(p1)));
    } catch (java.util.IllegalFormatException caught4) {
        return __sourceIntrinsic_13d92cd9b8bf_invokedynamic8568_2(local3);
    }
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x45A7;
        if (g[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = f[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/oW", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            oW.g[n2] = n3;
        }
        return g[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.oW.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8569_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/oW"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public synchronized void a(moom.oR p0, java.util.List<java.lang.String> p1) { __sourceHandlerCall_a3d401a4cc411d8f0398(this, p0, p1); }


public boolean a__Boolean() {
return ((((this.d) ? 1 : 0)) != 0);
}


private void a() { __sourceHandlerCall_2a768ecb2f6fd67d210f(this); }


private void a(java.util.List<net.minecraft.client.resources.IResource> p0) throws java.io.IOException { __sourceHandlerCall_54965d2922da2ba64c8c(this, p0); }


private void a(java.io.InputStream p0) throws java.io.IOException { __sourceHandlerCall_4502beb585eb6ba197db(this, p0); }


private java.lang.String a(java.lang.String p0) { return __sourceHandlerCall_226c42e3d63382443f1c(this, p0); }


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite954_39(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_13d92cd9b8bf_invokedynamic8568_2(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8569_0() throws E;
}
