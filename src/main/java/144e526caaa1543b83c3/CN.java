package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class CN extends moom.CJ {

private java.lang.String d;

private java.lang.Object[] e;

private java.lang.Object f;

private long g;

java.util.List<net.minecraft.util.IChatComponent> h;

public static java.util.regex.Pattern i;

private static long k;

private static long[] m;

private static java.lang.Integer[] n;

private static java.util.Map o;

private static long[] p;

private static java.lang.Long[] q;

private static java.util.Map r;

public CN(java.lang.String p0, java.lang.Object[] p1) { super(); __sourceHandlerCall_83ddd1f76f89b282bc76(this, p0, p1); }


static {
k = ((long)(((moom._a)(moom._c.a(((long)(-7802237909978027307L)), ((long)(598145596745793808L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(52233710547666L)))));
    o = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.CN.k ^ 90549928650140L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill502_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill502_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill502_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill502_14 = new byte[8];
    (__sourceSpill502_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill502_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation502_16 = __sourceSpill502_14;
    ((javax.crypto.Cipher)(__sourceSpill502_11)).init(((int)(__sourceSpill502_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill502_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation502_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life19 = new long[2];
    int local16_life20 = 0;
    java.lang.String local17_life21;
    int local18_life23 = ((java.lang.String)((local17_life21 = "\034f\032#@u±vC\006êe|ÀL"))).length();
    int local15_life24 = 0;
    do {
        java.lang.String __sourceSpill502_25 = local17_life21;
        int __sourceSpill502_26 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill502_25)).substring(((int)(__sourceSpill502_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill502_30 = local19_life19;
        int __sourceSpill502_31 = local16_life20;
        local16_life20 += 1;
        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));
        byte[] __sourceSpill502_33 = new byte[8];
        (__sourceSpill502_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));
        (__sourceSpill502_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));
        (__sourceSpill502_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));
        (__sourceSpill502_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));
        (__sourceSpill502_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));
        (__sourceSpill502_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));
        (__sourceSpill502_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));
        (__sourceSpill502_33)[7] = ((byte) ((int) local21_life32));
        javax.crypto.Cipher __sourceSpill502_34 = local13_life9;
        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill502_34)).doFinal(((byte[])(__sourceSpill502_33)));
        (__sourceSpill502_30)[__sourceSpill502_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    m = ((long[])(local19_life19));
    n = ((java.lang.Integer[])(new java.lang.Integer[2]));
    r = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life41;
    javax.crypto.Cipher __sourceSpill502_43 = (local0_life41 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill502_44 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill502_45 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill502_46 = new byte[8];
    (__sourceSpill502_46)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life47 = 1;
    while ((local1_life47 < 8)) {
        (__sourceSpill502_46)[local1_life47] = ((byte) ((int) ((local11_life7 << (local1_life47 * 8)) >>> 56)));
        local1_life47 += 1;
    }
    byte[] __sourcePreallocation502_48 = __sourceSpill502_46;
    ((javax.crypto.Cipher)(__sourceSpill502_43)).init(((int)(__sourceSpill502_44)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill502_45)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation502_48)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life51 = new long[2];
    int local3_life52 = 0;
    java.lang.String local4_life53;
    int local5_life55 = ((java.lang.String)((local4_life53 = "\004Rôéj~¢[í.Ò`\nB\031"))).length();
    int local2_life56 = 0;
    do {
        java.lang.String __sourceSpill502_57 = local4_life53;
        int __sourceSpill502_58 = local2_life56;
        local2_life56 += 8;
        byte[] local7_life61 = ((java.lang.String)(((java.lang.String)(__sourceSpill502_57)).substring(((int)(__sourceSpill502_58)), ((int)(local2_life56))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill502_62 = local6_life51;
        int __sourceSpill502_63 = local3_life52;
        local3_life52 += 1;
        long local8_life64 = (((((((((((long) (local7_life61)[0]) & 255L) << 56) | ((((long) (local7_life61)[1]) & 255L) << 48)) | ((((long) (local7_life61)[2]) & 255L) << 40)) | ((((long) (local7_life61)[3]) & 255L) << 32)) | ((((long) (local7_life61)[4]) & 255L) << 24)) | ((((long) (local7_life61)[5]) & 255L) << 16)) | ((((long) (local7_life61)[6]) & 255L) << 8)) | (((long) (local7_life61)[7]) & 255L));
        byte[] __sourceSpill502_65 = new byte[8];
        (__sourceSpill502_65)[0] = ((byte) ((int) (local8_life64 >>> 56)));
        (__sourceSpill502_65)[1] = ((byte) ((int) (local8_life64 >>> 48)));
        (__sourceSpill502_65)[2] = ((byte) ((int) (local8_life64 >>> 40)));
        (__sourceSpill502_65)[3] = ((byte) ((int) (local8_life64 >>> 32)));
        (__sourceSpill502_65)[4] = ((byte) ((int) (local8_life64 >>> 24)));
        (__sourceSpill502_65)[5] = ((byte) ((int) (local8_life64 >>> 16)));
        (__sourceSpill502_65)[6] = ((byte) ((int) (local8_life64 >>> 8)));
        (__sourceSpill502_65)[7] = ((byte) ((int) local8_life64));
        javax.crypto.Cipher __sourceSpill502_66 = local0_life41;
        byte[] local10_life68 = ((javax.crypto.Cipher)(__sourceSpill502_66)).doFinal(((byte[])(__sourceSpill502_65)));
        (__sourceSpill502_62)[__sourceSpill502_63] = (((((((((((long) (local10_life68)[0]) & 255L) << 56) | ((((long) (local10_life68)[1]) & 255L) << 48)) | ((((long) (local10_life68)[2]) & 255L) << 40)) | ((((long) (local10_life68)[3]) & 255L) << 32)) | ((((long) (local10_life68)[4]) & 255L) << 24)) | ((((long) (local10_life68)[5]) & 255L) << 16)) | ((((long) (local10_life68)[6]) & 255L) << 8)) | (((long) (local10_life68)[7]) & 255L));
    } while ((!(local2_life56 >= local5_life55)));
    p = ((long[])(local6_life51));
    q = ((java.lang.Long[])(new java.lang.Long[2]));
    i = ((java.util.regex.Pattern)(java.util.regex.Pattern.compile(((java.lang.String)("%(?:(\\d+)\\$)?([A-Za-z%]|$)")))));
}

private static native <E extends Throwable> void __sourceHandlerCall_83ddd1f76f89b282bc76(moom.CN a0, java.lang.String a1, java.lang.Object[] a2) throws E;
private static final class __SourceHandler_83ddd1f76f89b282bc76 {

public static void f384(moom.CN receiver, java.lang.String p0, java.lang.Object[] p1) throws Throwable {
    long life3_3;
    java.lang.Object[] life5_28;
    int life6_31;
    int life7_33;
    java.lang.Object life8_40;
    forest_join_53: {
    life3_3 = (__fieldRead384_0() ^ 95949269914528L);
    __directSuperInit384_1(receiver);
    __fieldWrite384_2(receiver, new java.lang.Object());
    __fieldWrite384_4(receiver, __invokedynamic384_3(17927, (3295716129660752938L ^ life3_3)));
    __fieldWrite384_6(receiver, __call384_5());
    __fieldWrite384_7(receiver, p0);
    __fieldWrite384_8(receiver, p1);
    life5_28 = p1;
    life6_31 = (life5_28).length;
    life7_33 = 0;
    forest_cycle_34: while (true) {
    forest_join_51: {
    if (!((life7_33 < life6_31))) {
        break forest_join_53;
    }
    life8_40 = (life5_28)[life7_33];
    if (!((__instanceOf384_9(life8_40) != 0))) {
        break forest_join_51;
    }
    __call384_13(__call384_11(__cast384_10(life8_40)), __call384_12(receiver));
    }
    life7_33 += 1;
    continue forest_cycle_34;
    }
    }
    return;
}
public static void h384_0(net.minecraft.util.ChatComponentTranslationFormatException p0) throws Throwable {
    throw __call3038400_0(p0);
}
private static native long __fieldRead384_0() throws Throwable;
private static native void __directSuperInit384_1(moom.CN a0) throws Throwable;
private static native void __fieldWrite384_2(moom.CN a0, java.lang.Object a1) throws Throwable;
private static native long __invokedynamic384_3(int a0, long a1) throws Throwable;
private static native void __fieldWrite384_4(moom.CN a0, long a1) throws Throwable;
private static native java.util.ArrayList __call384_5() throws Throwable;
private static native void __fieldWrite384_6(moom.CN a0, java.util.ArrayList a1) throws Throwable;
private static native void __fieldWrite384_7(moom.CN a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite384_8(moom.CN a0, java.lang.Object[] a1) throws Throwable;
private static native int __instanceOf384_9(java.lang.Object a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __cast384_10(java.lang.Object a0) throws Throwable;
private static native moom.CO __call384_11(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native moom.CO __call384_12(moom.CN a0) throws Throwable;
private static native moom.CO __call384_13(moom.CO a0, moom.CO a1) throws Throwable;
private static native java.lang.IllegalArgumentException __call3038400_0(net.minecraft.util.ChatComponentTranslationFormatException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_99e30a4474672c6f377e(moom.CN a0) throws E;
private static final class __SourceHandler_99e30a4474672c6f377e {

public static java.lang.String f61(moom.CN receiver) throws Throwable {
    java.lang.StringBuilder lexicalValue61_33_0;
    boolean spill61_0;
    java.lang.StringBuilder spill61_1;
    long life1_3;
    int life3_7;
    java.lang.StringBuilder life4_11;
    java.util.Iterator life5_15;
    net.minecraft.util.IChatComponent life6_22;
    lexical_join_33: {
    lexical_join_32: {
    life1_3 = (__fieldRead61_0() ^ 66169392647411L);
    spill61_0 = __call61_1();
    __call61_2(receiver);
    life3_7 = __integerCategory61_3(spill61_0);
    life4_11 = new java.lang.StringBuilder();
    life5_15 = __call61_5(__fieldRead61_4(receiver));
    lexical_cycle_16: while (true) {
    if (!(__call61_6(life5_15))) {
        break lexical_join_32;
    }
    life6_22 = __cast61_8(__call61_7(life5_15));
    spill61_1 = __call61_10(life4_11, __call61_9(life6_22));
    if (!((life3_7 != 0))) {
        lexicalValue61_33_0 = spill61_1;
        break lexical_join_33;
    }
    __discardScalar61_11(spill61_1);
    if (!((life3_7 == 0))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    lexicalValue61_33_0 = life4_11;
    }
    return __call61_12(lexicalValue61_33_0);
}
public static void h61_0(net.minecraft.util.ChatComponentTranslationFormatException p0) throws Throwable {
    throw __call1006100_0(p0);
}
private static native long __fieldRead61_0() throws Throwable;
private static native boolean __call61_1() throws Throwable;
private static native void __call61_2(moom.CN a0) throws Throwable;
private static native int __integerCategory61_3(boolean value) throws Throwable;
private static native java.util.List __fieldRead61_4(moom.CN a0) throws Throwable;
private static native java.util.Iterator __call61_5(java.util.List a0) throws Throwable;
private static native boolean __call61_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call61_7(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __cast61_8(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call61_9(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native java.lang.StringBuilder __call61_10(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native void __discardScalar61_11(java.lang.StringBuilder a0) throws Throwable;
private static native java.lang.String __call61_12(java.lang.StringBuilder a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call1006100_0(net.minecraft.util.ChatComponentTranslationFormatException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.util.IChatComponent __sourceHandlerCall_97213d51f964c7cf0161(moom.CN a0, int a1) throws E;
private static final class __SourceHandler_97213d51f964c7cf0161 {

public static net.minecraft.util.IChatComponent f229(moom.CN receiver, int p0) throws Throwable {
    java.lang.Object forestValue229_28_0;
    moom.CM forestValue229_38_0;
    moom.CM forestValue229_38_1;
    moom.CM forestValue229_40_0;
    moom.CM forestValue229_40_1;
    java.lang.String forestValue229_40_2;
    net.minecraft.util.ChatComponentTranslationFormatException spill229_0;
    java.lang.Object spill229_1;
    moom.CM spill229_2;
    moom.CM spill229_3;
    long life2_3;
    int life4_5;
    java.lang.Object life5_21;
    net.minecraft.util.IChatComponent life6_31;
    forest_join_48: {
    forest_join_40: {
    forest_join_38: {
    forest_join_32: {
    forest_join_28: {
    forest_join_17: {
    life2_3 = (__fieldRead229_0() ^ 138368808127761L);
    life4_5 = __integerCategory229_2(__call229_1());
    if (!((p0 >= (__fieldRead229_3(receiver)).length))) {
        break forest_join_17;
    }
    net.minecraft.util.ChatComponentTranslationFormatException __stackOp229_5_0 = __sourceUninitializedNEW229_4();
    spill229_0 = __stackOp229_5_0;
    __explicitNewInit229_6(__stackOp229_5_0, receiver, p0);
    throw spill229_0;
    }
    life5_21 = (__fieldRead229_7(receiver))[p0];
    spill229_1 = life5_21;
    if (!((life4_5 != 0))) {
        forestValue229_28_0 = spill229_1;
        break forest_join_28;
    }
    if (!((__instanceOf229_8(spill229_1) != 0))) {
        break forest_join_32;
    }
    forestValue229_28_0 = life5_21;
    }
    life6_31 = __cast229_9(forestValue229_28_0);
    if (!((life4_5 == 0))) {
        break forest_join_48;
    }
    }
    moom.CM __stackOp229_11_0 = __sourceUninitializedNEW229_10();
    spill229_2 = __stackOp229_11_0;
    spill229_3 = __stackOp229_11_0;
    if (!((life5_21 == null))) {
        forestValue229_38_0 = spill229_2;
        forestValue229_38_1 = spill229_3;
        break forest_join_38;
    }
    forestValue229_40_0 = spill229_2;
    forestValue229_40_1 = spill229_3;
    forestValue229_40_2 = "null";
    break forest_join_40;
    }
    forestValue229_40_0 = forestValue229_38_0;
    forestValue229_40_1 = forestValue229_38_1;
    forestValue229_40_2 = __call229_12(life5_21);
    }
    __explicitNewInit229_13(forestValue229_40_1, forestValue229_40_2);
    life6_31 = forestValue229_40_0;
    __call229_16(__call229_14(life6_31), __call229_15(receiver));
    }
    return life6_31;
}
public static net.minecraft.util.IChatComponent h229_0(net.minecraft.util.ChatComponentTranslationFormatException p0) throws Throwable {
    throw __call3022900_0(p0);
}
public static net.minecraft.util.IChatComponent h229_1(net.minecraft.util.ChatComponentTranslationFormatException p0) throws Throwable {
    throw __call3022901_0(p0);
}
public static net.minecraft.util.IChatComponent h229_2(net.minecraft.util.ChatComponentTranslationFormatException p0) throws Throwable {
    throw __call3022902_0(p0);
}
public static net.minecraft.util.IChatComponent h229_3(net.minecraft.util.ChatComponentTranslationFormatException p0) throws Throwable {
    throw __call3022903_0(p0);
}
public static net.minecraft.util.IChatComponent h229_4(net.minecraft.util.ChatComponentTranslationFormatException p0) throws Throwable {
    throw __call3022904_0(p0);
}
private static native long __fieldRead229_0() throws Throwable;
private static native boolean __call229_1() throws Throwable;
private static native int __integerCategory229_2(boolean value) throws Throwable;
private static native java.lang.Object[] __fieldRead229_3(moom.CN a0) throws Throwable;
private static native net.minecraft.util.ChatComponentTranslationFormatException __sourceUninitializedNEW229_4() throws Throwable;
private static native void __explicitNewInit229_6(net.minecraft.util.ChatComponentTranslationFormatException a0, moom.CN a1, int a2) throws Throwable;
private static native java.lang.Object[] __fieldRead229_7(moom.CN a0) throws Throwable;
private static native int __instanceOf229_8(java.lang.Object a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __cast229_9(java.lang.Object a0) throws Throwable;
private static native moom.CM __sourceUninitializedNEW229_10() throws Throwable;
private static native java.lang.String __call229_12(java.lang.Object a0) throws Throwable;
private static native void __explicitNewInit229_13(moom.CM a0, java.lang.String a1) throws Throwable;
private static native moom.CO __call229_14(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native moom.CO __call229_15(moom.CN a0) throws Throwable;
private static native moom.CO __call229_16(moom.CO a0, moom.CO a1) throws Throwable;
private static native java.lang.IllegalArgumentException __call3022900_0(net.minecraft.util.ChatComponentTranslationFormatException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call3022901_0(net.minecraft.util.ChatComponentTranslationFormatException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call3022902_0(net.minecraft.util.ChatComponentTranslationFormatException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call3022903_0(net.minecraft.util.ChatComponentTranslationFormatException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call3022904_0(net.minecraft.util.ChatComponentTranslationFormatException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_9d03604f6297d6ab801e(moom.CN a0, java.lang.String a1) throws E;
private static final class __SourceHandler_9d03604f6297d6ab801e {

public static void f244(moom.CN receiver, java.lang.String p0) throws Throwable {
    int lexicalValue244_97_0;
    java.lang.String lexicalValue244_108_0;
    java.lang.String lexicalValue244_114_0;
    int lexicalValue244_120_0;
    int lexicalValue244_136_0;
    int lexicalValue244_142_0;
    int lexicalValue244_142_1;
    boolean spill244_0;
    int spill244_1;
    int spill244_2;
    boolean spill244_3;
    boolean spill244_4;
    java.lang.String spill244_5;
    java.lang.String spill244_6;
    int spill244_7;
    long life2_3;
    int life5_6;
    int life4_7;
    java.util.regex.Matcher life6_11;
    int life7_13;
    int life8_15;
    int life10_22;
    int life9_25;
    moom.CM life11_44;
    java.lang.String life11_59;
    java.lang.String life12_64;
    moom.CM life13_90;
    java.lang.String life13_128;
    int life14_143;
    moom.CM life10_181;
    lexical_join_164: {
    lexical_join_142: {
    lexical_join_139: {
    life2_3 = (__fieldRead244_0() ^ 102384690318585L);
    spill244_0 = __call244_1();
    life5_6 = 0;
    life4_7 = __integerCategory244_2(spill244_0);
    life6_11 = __call244_4(__fieldRead244_3(), p0);
    life7_13 = 0;
    life8_15 = 0;
    lexical_cycle_16: while (true) {
    lexical_join_136: {
    lexical_join_135: {
    lexical_join_120: {
    lexical_join_118: {
    lexical_join_114: {
    lexical_join_108: {
    lexical_join_105: {
    lexical_join_97: {
    lexical_join_92: {
    lexical_join_53: {
    if (!(__call244_5(life6_11, life8_15))) {
        break lexical_join_139;
    }
    life10_22 = __call244_6(life6_11);
    life9_25 = __call244_7(life6_11);
    spill244_1 = life10_22;
    spill244_2 = life8_15;
    if (!((life4_7 == 0))) {
        lexicalValue244_142_0 = spill244_1;
        lexicalValue244_142_1 = spill244_2;
        break lexical_join_142;
    }
    if (!((spill244_1 > spill244_2))) {
        break lexical_join_53;
    }
    life11_44 = new moom.CM(__call244_9(__call244_8(p0, life8_15, life10_22), new java.lang.Object[0]));
    __call244_12(__call244_10(life11_44), __call244_11(receiver));
    __call244_14(__fieldRead244_13(receiver), life11_44);
    }
    life11_59 = __call244_15(life6_11, 2);
    life12_64 = __call244_16(p0, life10_22, life9_25);
    spill244_3 = __call244_17("%", life11_59);
    if (!((life4_7 == 0))) {
        lexicalValue244_97_0 = __integerCategory244_18(spill244_3);
        break lexical_join_97;
    }
    if (!(spill244_3)) {
        break lexical_join_92;
    }
    spill244_4 = __call244_19("%%", life12_64);
    if (!((life4_7 == 0))) {
        lexicalValue244_97_0 = __integerCategory244_20(spill244_4);
        break lexical_join_97;
    }
    if (!(spill244_4)) {
        break lexical_join_92;
    }
    life13_90 = new moom.CM("%");
    __call244_23(__call244_21(life13_90), __call244_22(receiver));
    __call244_25(__fieldRead244_24(receiver), life13_90);
    if (!((life4_7 != 0))) {
        break lexical_join_135;
    }
    }
    spill244_5 = "s";
    if (!((life4_7 == 0))) {
        lexicalValue244_108_0 = spill244_5;
        break lexical_join_108;
    }
    lexicalValue244_97_0 = __integerCategory244_27(__call244_26(spill244_5, life11_59));
    }
    if (!((lexicalValue244_97_0 == 0))) {
        break lexical_join_105;
    }
    throw new net.minecraft.util.ChatComponentTranslationFormatException(receiver, __invokedynamic244_28(life12_64));
    }
    lexicalValue244_108_0 = __call244_29(life6_11, 1);
    }
    life13_128 = lexicalValue244_108_0;
    spill244_6 = life13_128;
    if (!((life4_7 == 0))) {
        lexicalValue244_114_0 = spill244_6;
        break lexical_join_114;
    }
    if (!((spill244_6 != null))) {
        break lexical_join_118;
    }
    lexicalValue244_114_0 = life13_128;
    }
    lexicalValue244_120_0 = (__call244_30(lexicalValue244_114_0) - 1);
    break lexical_join_120;
    }
    lexicalValue244_120_0 = (life7_13++);
    }
    life14_143 = lexicalValue244_120_0;
    spill244_7 = life14_143;
    if (!((life4_7 == 0))) {
        lexicalValue244_136_0 = spill244_7;
        break lexical_join_136;
    }
    if (!((spill244_7 < (__fieldRead244_31(receiver)).length))) {
        break lexical_join_135;
    }
    __call244_34(__fieldRead244_32(receiver), __call244_33(receiver, life14_143));
    }
    lexicalValue244_136_0 = life9_25;
    }
    life8_15 = lexicalValue244_136_0;
    if (!((life4_7 != 0))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    lexicalValue244_142_0 = life8_15;
    lexicalValue244_142_1 = __call244_35(p0);
    }
    if (!((lexicalValue244_142_0 < lexicalValue244_142_1))) {
        break lexical_join_164;
    }
    life10_181 = new moom.CM(__call244_37(__call244_36(p0, life8_15), new java.lang.Object[0]));
    __call244_40(__call244_38(life10_181), __call244_39(receiver));
    __call244_42(__fieldRead244_41(receiver), life10_181);
    }
    return;
}
public static void h244_0(java.util.IllegalFormatException p0) throws Throwable {
    throw __call2024400_0(p0);
}
public static void h244_1(java.util.IllegalFormatException p0) throws Throwable {
    throw __call2024401_0(p0);
}
public static void h244_2(java.util.IllegalFormatException p0) throws Throwable {
    throw __call2024402_0(p0);
}
public static void h244_3(java.util.IllegalFormatException p0) throws Throwable {
    throw __call2024403_0(p0);
}
public static void h244_4(java.util.IllegalFormatException p0) throws Throwable {
    throw __call2024404_0(p0);
}
public static void h244_5(java.util.IllegalFormatException p0) throws Throwable {
    throw __call2024405_0(p0);
}
public static void h244_6(java.util.IllegalFormatException p0) throws Throwable {
    throw __call2024406_0(p0);
}
public static void h244_7(java.util.IllegalFormatException p0) throws Throwable {
    throw __call2024407_0(p0);
}
public static void h244_8(java.util.IllegalFormatException p0) throws Throwable {
    throw __call2024408_0(p0);
}
public static void h244_9(java.util.IllegalFormatException p0) throws Throwable {
    throw __call2024409_0(p0);
}
public static void h244_10(java.util.IllegalFormatException p0, moom.CN p1) throws Throwable {
    java.util.IllegalFormatException local2 = p0;
    throw new net.minecraft.util.ChatComponentTranslationFormatException(p1, local2);
}
private static native long __fieldRead244_0() throws Throwable;
private static native boolean __call244_1() throws Throwable;
private static native int __integerCategory244_2(boolean value) throws Throwable;
private static native java.util.regex.Pattern __fieldRead244_3() throws Throwable;
private static native java.util.regex.Matcher __call244_4(java.util.regex.Pattern a0, java.lang.String a1) throws Throwable;
private static native boolean __call244_5(java.util.regex.Matcher a0, int a1) throws Throwable;
private static native int __call244_6(java.util.regex.Matcher a0) throws Throwable;
private static native int __call244_7(java.util.regex.Matcher a0) throws Throwable;
private static native java.lang.String __call244_8(java.lang.String a0, int a1, int a2) throws Throwable;
private static native java.lang.String __call244_9(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.CO __call244_10(moom.CM a0) throws Throwable;
private static native moom.CO __call244_11(moom.CN a0) throws Throwable;
private static native moom.CO __call244_12(moom.CO a0, moom.CO a1) throws Throwable;
private static native java.util.List __fieldRead244_13(moom.CN a0) throws Throwable;
private static native boolean __call244_14(java.util.List a0, moom.CM a1) throws Throwable;
private static native java.lang.String __call244_15(java.util.regex.Matcher a0, int a1) throws Throwable;
private static native java.lang.String __call244_16(java.lang.String a0, int a1, int a2) throws Throwable;
private static native boolean __call244_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory244_18(boolean value) throws Throwable;
private static native boolean __call244_19(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory244_20(boolean value) throws Throwable;
private static native moom.CO __call244_21(moom.CM a0) throws Throwable;
private static native moom.CO __call244_22(moom.CN a0) throws Throwable;
private static native moom.CO __call244_23(moom.CO a0, moom.CO a1) throws Throwable;
private static native java.util.List __fieldRead244_24(moom.CN a0) throws Throwable;
private static native boolean __call244_25(java.util.List a0, moom.CM a1) throws Throwable;
private static native boolean __call244_26(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory244_27(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic244_28(java.lang.String a0) throws Throwable;
private static native java.lang.String __call244_29(java.util.regex.Matcher a0, int a1) throws Throwable;
private static native int __call244_30(java.lang.String a0) throws Throwable;
private static native java.lang.Object[] __fieldRead244_31(moom.CN a0) throws Throwable;
private static native java.util.List __fieldRead244_32(moom.CN a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call244_33(moom.CN a0, int a1) throws Throwable;
private static native boolean __call244_34(java.util.List a0, net.minecraft.util.IChatComponent a1) throws Throwable;
private static native int __call244_35(java.lang.String a0) throws Throwable;
private static native java.lang.String __call244_36(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.String __call244_37(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.CO __call244_38(moom.CM a0) throws Throwable;
private static native moom.CO __call244_39(moom.CN a0) throws Throwable;
private static native moom.CO __call244_40(moom.CO a0, moom.CO a1) throws Throwable;
private static native java.util.List __fieldRead244_41(moom.CN a0) throws Throwable;
private static native boolean __call244_42(java.util.List a0, moom.CM a1) throws Throwable;
private static native java.lang.IllegalArgumentException __call2024400_0(java.util.IllegalFormatException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call2024401_0(java.util.IllegalFormatException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call2024402_0(java.util.IllegalFormatException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call2024403_0(java.util.IllegalFormatException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call2024404_0(java.util.IllegalFormatException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call2024405_0(java.util.IllegalFormatException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call2024406_0(java.util.IllegalFormatException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call2024407_0(java.util.IllegalFormatException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call2024408_0(java.util.IllegalFormatException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call2024409_0(java.util.IllegalFormatException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.util.IChatComponent __sourceHandlerCall_3ea20ee7f7de73e4aa32(moom.CN a0, moom.CO a1) throws E;
private static final class __SourceHandler_3ea20ee7f7de73e4aa32 {

public static net.minecraft.util.IChatComponent f622(moom.CN receiver, moom.CO p0) throws Throwable {
    int lexicalValue622_52_0;
    moom.CN lexicalValue622_72_0;
    boolean spill622_0;
    int spill622_1;
    moom.CN spill622_2;
    long life2_3;
    int life4_9;
    java.lang.Object[] life5_12;
    int life6_15;
    int life7_17;
    java.lang.Object life8_24;
    java.util.Iterator life5_68;
    net.minecraft.util.IChatComponent life6_75;
    lexical_join_72: {
    lexical_join_71: {
    lexical_join_52: {
    lexical_join_42: {
    life2_3 = (__fieldRead622_0() ^ 47028617105513L);
    spill622_0 = __call622_1();
    __call622_2(receiver, p0);
    life4_9 = __integerCategory622_3(spill622_0);
    life5_12 = __fieldRead622_4(receiver);
    life6_15 = (life5_12).length;
    life7_17 = 0;
    lexical_cycle_18: while (true) {
    lexical_join_40: {
    lexical_join_39: {
    if (!((life7_17 < life6_15))) {
        break lexical_join_42;
    }
    life8_24 = (life5_12)[life7_17];
    if (!((life4_9 != 0))) {
        break lexical_join_40;
    }
    spill622_1 = __instanceOf622_5(life8_24);
    if (!((life4_9 != 0))) {
        lexicalValue622_52_0 = spill622_1;
        break lexical_join_52;
    }
    if (!((spill622_1 != 0))) {
        break lexical_join_39;
    }
    __call622_9(__call622_7(__cast622_6(life8_24)), __call622_8(receiver));
    }
    life7_17 += 1;
    }
    if (!((life4_9 == 0))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    spill622_2 = receiver;
    if (!((life4_9 != 0))) {
        lexicalValue622_72_0 = spill622_2;
        break lexical_join_72;
    }
    lexicalValue622_52_0 = __numericCompare622_12(__fieldRead622_10(spill622_2), __invokedynamic622_11(19613, (902151319842086264L ^ life2_3)));
    }
    if (!((lexicalValue622_52_0 > 0))) {
        break lexical_join_71;
    }
    life5_68 = __call622_14(__fieldRead622_13(receiver));
    lexical_cycle_57: while (true) {
    if (!(__call622_15(life5_68))) {
        break lexical_join_71;
    }
    life6_75 = __cast622_17(__call622_16(life5_68));
    __call622_19(__call622_18(life6_75), p0);
    if (!((life4_9 == 0))) { continue lexical_cycle_57; }
    break lexical_cycle_57;
    }
    }
    lexicalValue622_72_0 = receiver;
    }
    return lexicalValue622_72_0;
}
public static void h622_0(net.minecraft.util.ChatComponentTranslationFormatException p0) throws Throwable {
    throw __call1062200_0(p0);
}
public static void h622_1(net.minecraft.util.ChatComponentTranslationFormatException p0) throws Throwable {
    throw __call1062201_0(p0);
}
public static void h622_2(net.minecraft.util.ChatComponentTranslationFormatException p0) throws Throwable {
    throw __call1062202_0(p0);
}
public static void h622_3(net.minecraft.util.ChatComponentTranslationFormatException p0) throws Throwable {
    throw __call1062203_0(p0);
}
private static native long __fieldRead622_0() throws Throwable;
private static native boolean __call622_1() throws Throwable;
private static native net.minecraft.util.IChatComponent __call622_2(moom.CN a0, moom.CO a1) throws Throwable;
private static native int __integerCategory622_3(boolean value) throws Throwable;
private static native java.lang.Object[] __fieldRead622_4(moom.CN a0) throws Throwable;
private static native int __instanceOf622_5(java.lang.Object a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __cast622_6(java.lang.Object a0) throws Throwable;
private static native moom.CO __call622_7(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native moom.CO __call622_8(moom.CN a0) throws Throwable;
private static native moom.CO __call622_9(moom.CO a0, moom.CO a1) throws Throwable;
private static native long __fieldRead622_10(moom.CN a0) throws Throwable;
private static native long __invokedynamic622_11(int a0, long a1) throws Throwable;
private static native int __numericCompare622_12(long a0, long a1) throws Throwable;
private static native java.util.List __fieldRead622_13(moom.CN a0) throws Throwable;
private static native java.util.Iterator __call622_14(java.util.List a0) throws Throwable;
private static native boolean __call622_15(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call622_16(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __cast622_17(java.lang.Object a0) throws Throwable;
private static native moom.CO __call622_18(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native moom.CO __call622_19(moom.CO a0, moom.CO a1) throws Throwable;
private static native java.lang.IllegalArgumentException __call1062200_0(net.minecraft.util.ChatComponentTranslationFormatException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call1062201_0(net.minecraft.util.ChatComponentTranslationFormatException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call1062202_0(net.minecraft.util.ChatComponentTranslationFormatException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call1062203_0(net.minecraft.util.ChatComponentTranslationFormatException a0) throws Throwable;

}

private static native <E extends Throwable> moom.CN __sourceHandlerCall_619d9644f34e95d9d3d1(moom.CN a0) throws E;
private static final class __SourceHandler_619d9644f34e95d9d3d1 {

public static moom.CN f623(moom.CN receiver) throws Throwable {
    java.lang.Object[] lexicalValue623_41_0;
    int lexicalValue623_41_1;
    moom.CN lexicalValue623_55_0;
    moom.CN lexicalValue623_83_0;
    boolean spill623_0;
    moom.CN spill623_1;
    java.lang.Object[] spill623_2;
    int spill623_3;
    moom.CN spill623_4;
    long life1_3;
    java.lang.Object[] life4_9;
    int life3_10;
    int life5_12;
    moom.CN life5_67;
    java.util.Iterator life6_77;
    net.minecraft.util.IChatComponent life7_84;
    lexical_join_83: {
    lexical_join_82: {
    lexical_join_55: {
    lexical_join_49: {
    life1_3 = (__fieldRead623_0() ^ 62923948638671L);
    spill623_0 = __call623_1();
    life4_9 = new java.lang.Object[(__fieldRead623_2(receiver)).length];
    life3_10 = __integerCategory623_3(spill623_0);
    life5_12 = 0;
    lexical_cycle_13: while (true) {
    lexical_join_46: {
    lexical_join_41: {
    lexical_join_39: {
    if (!((life5_12 < (__fieldRead623_4(receiver)).length))) {
        break lexical_join_49;
    }
    spill623_1 = receiver;
    if (!((life3_10 == 0))) {
        lexicalValue623_55_0 = spill623_1;
        break lexical_join_55;
    }
    spill623_2 = __fieldRead623_5(spill623_1);
    spill623_3 = life5_12;
    if (!((life3_10 == 0))) {
        lexicalValue623_41_0 = spill623_2;
        lexicalValue623_41_1 = spill623_3;
        break lexical_join_41;
    }
    if (!((__instanceOf623_6((spill623_2)[spill623_3]) != 0))) {
        break lexical_join_39;
    }
    (life4_9)[life5_12] = __call623_9(__cast623_8((__fieldRead623_7(receiver))[life5_12]));
    if (!((life3_10 != 0))) {
        break lexical_join_46;
    }
    }
    lexicalValue623_41_0 = life4_9;
    lexicalValue623_41_1 = life5_12;
    }
    (lexicalValue623_41_0)[lexicalValue623_41_1] = (__fieldRead623_10(receiver))[life5_12];
    }
    life5_12 += 1;
    if (!((life3_10 != 0))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    lexicalValue623_55_0 = new moom.CN(__fieldRead623_11(receiver), life4_9);
    }
    life5_67 = lexicalValue623_55_0;
    __call623_14(life5_67, __call623_13(__call623_12(receiver)));
    life6_77 = __call623_16(__call623_15(receiver));
    lexical_cycle_66: while (true) {
    if (!(__call623_17(life6_77))) {
        break lexical_join_82;
    }
    life7_84 = __cast623_19(__call623_18(life6_77));
    spill623_4 = life5_67;
    if (!((life3_10 == 0))) {
        lexicalValue623_83_0 = spill623_4;
        break lexical_join_83;
    }
    __call623_21(spill623_4, __call623_20(life7_84));
    if (!((life3_10 != 0))) { continue lexical_cycle_66; }
    break lexical_cycle_66;
    }
    }
    lexicalValue623_83_0 = life5_67;
    }
    return lexicalValue623_83_0;
}
public static void h623_0(net.minecraft.util.ChatComponentTranslationFormatException p0) throws Throwable {
    throw __call1062300_0(p0);
}
public static void h623_1(net.minecraft.util.ChatComponentTranslationFormatException p0) throws Throwable {
    throw __call1062301_0(p0);
}
public static void h623_2(net.minecraft.util.ChatComponentTranslationFormatException p0) throws Throwable {
    throw __call1062302_0(p0);
}
public static void h623_3(net.minecraft.util.ChatComponentTranslationFormatException p0) throws Throwable {
    throw __call1062303_0(p0);
}
public static void h623_4(net.minecraft.util.ChatComponentTranslationFormatException p0) throws Throwable {
    throw __call1062304_0(p0);
}
private static native long __fieldRead623_0() throws Throwable;
private static native boolean __call623_1() throws Throwable;
private static native java.lang.Object[] __fieldRead623_2(moom.CN a0) throws Throwable;
private static native int __integerCategory623_3(boolean value) throws Throwable;
private static native java.lang.Object[] __fieldRead623_4(moom.CN a0) throws Throwable;
private static native java.lang.Object[] __fieldRead623_5(moom.CN a0) throws Throwable;
private static native int __instanceOf623_6(java.lang.Object a0) throws Throwable;
private static native java.lang.Object[] __fieldRead623_7(moom.CN a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __cast623_8(java.lang.Object a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call623_9(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native java.lang.Object[] __fieldRead623_10(moom.CN a0) throws Throwable;
private static native java.lang.String __fieldRead623_11(moom.CN a0) throws Throwable;
private static native moom.CO __call623_12(moom.CN a0) throws Throwable;
private static native moom.CO __call623_13(moom.CO a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call623_14(moom.CN a0, moom.CO a1) throws Throwable;
private static native java.util.List __call623_15(moom.CN a0) throws Throwable;
private static native java.util.Iterator __call623_16(java.util.List a0) throws Throwable;
private static native boolean __call623_17(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call623_18(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __cast623_19(java.lang.Object a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call623_20(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call623_21(moom.CN a0, net.minecraft.util.IChatComponent a1) throws Throwable;
private static native java.lang.IllegalArgumentException __call1062300_0(net.minecraft.util.ChatComponentTranslationFormatException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call1062301_0(net.minecraft.util.ChatComponentTranslationFormatException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call1062302_0(net.minecraft.util.ChatComponentTranslationFormatException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call1062303_0(net.minecraft.util.ChatComponentTranslationFormatException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call1062304_0(net.minecraft.util.ChatComponentTranslationFormatException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_8868023f6241305d4030(moom.CN a0) throws E;
private static final class __SourceHandler_8868023f6241305d4030 {

public static void f230(moom.CN receiver) throws Throwable {
    boolean spill230_0;
    long life1_3;
    java.lang.Object life4_8;
    int life3_10;
    long life5_12;
    forest_join_31: {
    forest_join_23: {
    life1_3 = (__fieldRead230_0() ^ 18849301470613L);
    spill230_0 = __call230_1();
    __monitorEnter230_3((life4_8 = __fieldRead230_2(receiver)));
    life3_10 = __integerCategory230_4(spill230_0);
    life5_12 = __call230_5();
    if (!((life3_10 != 0))) {
        break forest_join_31;
    }
    if (!((__numericCompare230_7(life5_12, __fieldRead230_6(receiver)) == 0))) {
        break forest_join_23;
    }
    __monitorExit230_8(life4_8);
    return;
    }
    __fieldWrite230_9(receiver, life5_12);
    __call230_11(__fieldRead230_10(receiver));
    __monitorExit230_12(life4_8);
    }
    __call230_15(receiver, __call230_14(__fieldRead230_13(receiver)));
    return;
}
public static void h230_0(net.minecraft.util.ChatComponentTranslationFormatException p0) throws Throwable {
    throw __call3023000_0(p0);
}
public static void h230_1(java.lang.Throwable p0, java.lang.Object p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3023001_0(p1);
    throw life2_2;
}
public static void h230_2(net.minecraft.util.ChatComponentTranslationFormatException p0, moom.CN p1) throws Throwable {
    net.minecraft.util.ChatComponentTranslationFormatException life2_2;
    life2_2 = p0;
    __call3023002_1(__fieldRead3023002_0(p1));
    __call3023002_4(p1, __call3023002_3(__fieldRead3023002_2(p1)));
    return;
}
public static void h230_3(net.minecraft.util.ChatComponentTranslationFormatException p0, net.minecraft.util.ChatComponentTranslationFormatException p1) throws Throwable {
    net.minecraft.util.ChatComponentTranslationFormatException life2_2;
    life2_2 = p0;
    throw p1;
}
private static native long __fieldRead230_0() throws Throwable;
private static native boolean __call230_1() throws Throwable;
private static native java.lang.Object __fieldRead230_2(moom.CN a0) throws Throwable;
private static native void __monitorEnter230_3(java.lang.Object a0) throws Throwable;
private static native int __integerCategory230_4(boolean value) throws Throwable;
private static native long __call230_5() throws Throwable;
private static native long __fieldRead230_6(moom.CN a0) throws Throwable;
private static native int __numericCompare230_7(long a0, long a1) throws Throwable;
private static native void __monitorExit230_8(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite230_9(moom.CN a0, long a1) throws Throwable;
private static native java.util.List __fieldRead230_10(moom.CN a0) throws Throwable;
private static native void __call230_11(java.util.List a0) throws Throwable;
private static native void __monitorExit230_12(java.lang.Object a0) throws Throwable;
private static native java.lang.String __fieldRead230_13(moom.CN a0) throws Throwable;
private static native java.lang.String __call230_14(java.lang.String a0) throws Throwable;
private static native void __call230_15(moom.CN a0, java.lang.String a1) throws Throwable;
private static native java.lang.IllegalArgumentException __call3023000_0(net.minecraft.util.ChatComponentTranslationFormatException a0) throws Throwable;
private static native void __monitorExit3023001_0(java.lang.Object a0) throws Throwable;
private static native java.util.List __fieldRead3023002_0(moom.CN a0) throws Throwable;
private static native void __call3023002_1(java.util.List a0) throws Throwable;
private static native java.lang.String __fieldRead3023002_2(moom.CN a0) throws Throwable;
private static native java.lang.String __call3023002_3(java.lang.String a0) throws Throwable;
private static native void __call3023002_4(moom.CN a0, java.lang.String a1) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_0bcb3eb8343da52ebf6d(moom.CN a0, java.lang.Object a1) throws E;
private static final class __SourceHandler_0bcb3eb8343da52ebf6d {

public static boolean f624(moom.CN receiver, java.lang.Object p0) throws Throwable {
    java.lang.Object forwardValue624_14_0;
    int forwardValue624_24_0;
    int forwardValue624_38_0;
    int forwardValue624_44_0;
    int forwardValue624_48_0;
    int forwardValue624_50_0;
    moom.CN spill624_0;
    int spill624_1;
    boolean spill624_2;
    long life2_3;
    int life4_5;
    moom.CN life5_28;
    forward_join_50: {
    forward_join_49: {
    forward_join_48: {
    forward_join_44: {
    forward_join_38: {
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (__fieldRead624_0() ^ 44123135876427L);
    life4_5 = __integerCategory624_2(__call624_1());
    spill624_0 = receiver;
    if (!((life4_5 != 0))) {
        forwardValue624_14_0 = spill624_0;
        break forward_join_14;
    }
    if (!((spill624_0 == p0))) {
        break forward_join_13;
    }
    return __integerCategory624_3(1);
    }
    forwardValue624_14_0 = p0;
    }
    spill624_1 = __instanceOf624_4(forwardValue624_14_0);
    if (!((life4_5 != 0))) {
        forwardValue624_24_0 = spill624_1;
        break forward_join_24;
    }
    if (!((spill624_1 != 0))) {
        break forward_join_23;
    }
    life5_28 = __cast624_5(p0);
    if (!((life4_5 == 0))) {
        break forward_join_25;
    }
    }
    forwardValue624_24_0 = 0;
    }
    return __integerCategory624_6(forwardValue624_24_0);
    }
    spill624_2 = __call624_9(__fieldRead624_7(receiver), __fieldRead624_8(life5_28));
    if (!((life4_5 != 0))) {
        forwardValue624_38_0 = __integerCategory624_10(spill624_2);
        break forward_join_38;
    }
    if (!(spill624_2)) {
        break forward_join_49;
    }
    forwardValue624_38_0 = __integerCategory624_14(__call624_13(__fieldRead624_11(receiver), __fieldRead624_12(life5_28)));
    }
    if (!((life4_5 != 0))) {
        forwardValue624_44_0 = forwardValue624_38_0;
        break forward_join_44;
    }
    if (!((forwardValue624_38_0 != 0))) {
        break forward_join_49;
    }
    forwardValue624_44_0 = __integerCategory624_16(__call624_15(receiver, p0));
    }
    if (!((life4_5 != 0))) {
        forwardValue624_48_0 = forwardValue624_44_0;
        break forward_join_48;
    }
    if (!((forwardValue624_44_0 != 0))) {
        break forward_join_49;
    }
    forwardValue624_48_0 = 1;
    }
    forwardValue624_50_0 = forwardValue624_48_0;
    break forward_join_50;
    }
    forwardValue624_50_0 = 0;
    }
    return __integerCategory624_17(forwardValue624_50_0);
}
public static void h624_0(net.minecraft.util.ChatComponentTranslationFormatException p0) throws Throwable {
    throw __call1062400_0(p0);
}
public static void h624_1(net.minecraft.util.ChatComponentTranslationFormatException p0) throws Throwable {
    throw __call1062401_0(p0);
}
public static void h624_2(net.minecraft.util.ChatComponentTranslationFormatException p0) throws Throwable {
    throw __call1062402_0(p0);
}
public static void h624_3(net.minecraft.util.ChatComponentTranslationFormatException p0) throws Throwable {
    throw __call1062403_0(p0);
}
public static void h624_4(net.minecraft.util.ChatComponentTranslationFormatException p0) throws Throwable {
    throw __call1062404_0(p0);
}
public static void h624_5(net.minecraft.util.ChatComponentTranslationFormatException p0) throws Throwable {
    throw __call1062405_0(p0);
}
public static void h624_6(net.minecraft.util.ChatComponentTranslationFormatException p0) throws Throwable {
    throw __call1062406_0(p0);
}
public static void h624_7(net.minecraft.util.ChatComponentTranslationFormatException p0) throws Throwable {
    throw __call1062407_0(p0);
}
public static void h624_8(net.minecraft.util.ChatComponentTranslationFormatException p0) throws Throwable {
    throw __call1062408_0(p0);
}
private static native long __fieldRead624_0() throws Throwable;
private static native boolean __call624_1() throws Throwable;
private static native int __integerCategory624_2(boolean value) throws Throwable;
private static native boolean __integerCategory624_3(int value) throws Throwable;
private static native int __instanceOf624_4(java.lang.Object a0) throws Throwable;
private static native moom.CN __cast624_5(java.lang.Object a0) throws Throwable;
private static native boolean __integerCategory624_6(int value) throws Throwable;
private static native java.lang.Object[] __fieldRead624_7(moom.CN a0) throws Throwable;
private static native java.lang.Object[] __fieldRead624_8(moom.CN a0) throws Throwable;
private static native boolean __call624_9(java.lang.Object[] a0, java.lang.Object[] a1) throws Throwable;
private static native int __integerCategory624_10(boolean value) throws Throwable;
private static native java.lang.String __fieldRead624_11(moom.CN a0) throws Throwable;
private static native java.lang.String __fieldRead624_12(moom.CN a0) throws Throwable;
private static native boolean __call624_13(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory624_14(boolean value) throws Throwable;
private static native boolean __call624_15(moom.CN a0, java.lang.Object a1) throws Throwable;
private static native int __integerCategory624_16(boolean value) throws Throwable;
private static native boolean __integerCategory624_17(int value) throws Throwable;
private static native java.lang.IllegalArgumentException __call1062400_0(net.minecraft.util.ChatComponentTranslationFormatException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call1062401_0(net.minecraft.util.ChatComponentTranslationFormatException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call1062402_0(net.minecraft.util.ChatComponentTranslationFormatException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call1062403_0(net.minecraft.util.ChatComponentTranslationFormatException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call1062404_0(net.minecraft.util.ChatComponentTranslationFormatException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call1062405_0(net.minecraft.util.ChatComponentTranslationFormatException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call1062406_0(net.minecraft.util.ChatComponentTranslationFormatException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call1062407_0(net.minecraft.util.ChatComponentTranslationFormatException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call1062408_0(net.minecraft.util.ChatComponentTranslationFormatException a0) throws Throwable;

}


public boolean equals(java.lang.Object p0) { return __sourceHandlerCall_0bcb3eb8343da52ebf6d(this, p0); }


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1078_5(this.d, java.util.Arrays.toString(((java.lang.Object[])(this.e))), this.a, ((moom.CN)(this)).a__CO());
}


public int hashCode() {
long local1 = (moom.CN.k ^ 24277394675547L);
    int local3 = super.hashCode();
    local3 = ((__sourceIntrinsic_1861091996aa_originalDynamicSite1079_2(903, (1084645769675932957L ^ local1)) * local3) + ((java.lang.String)(this.d)).hashCode());
    local3 = ((__sourceIntrinsic_1861091996aa_originalDynamicSite1079_5(12355, (1840269514536367832L ^ local1)) * local3) + java.util.Arrays.hashCode(((java.lang.Object[])(this.e))));
    return local3;
}


public java.util.Iterator<net.minecraft.util.IChatComponent> iterator() {
((moom.CN)(this)).a__Void();
    return com.google.common.collect.Iterators.concat(((java.util.Iterator)(moom.CN.a(((java.lang.Iterable)(this.h))))), ((java.util.Iterator)(moom.CN.a(((java.lang.Iterable)(this.a))))));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4046_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/CN"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long b(int p0, long p1) {
int life3_8;
    byte[] life4_77;
    long life5_81;
    byte[] life7_146;
    java.lang.Long life8_150;
    java.lang.Object[] life9_155;
    javax.crypto.spec.DESKeySpec life11_188;
    javax.crypto.SecretKey life12_195;
    javax.crypto.Cipher life13_200;
    byte[] life10_212;
    long life11_290;
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 19193);
    if (((moom.CN.q)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.CN.p)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.CN.r)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.CN.r)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/CN", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.CN.q)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.CN.q)[life3_8])).longValue();
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.CN.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public java.lang.String d() {
return this.d;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4048_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/CN"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.CN.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 23221;
      if (n[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(p1 >>> 56),
            (byte)(p1 >>> 48),
            (byte)(p1 >>> 40),
            (byte)(p1 >>> 32),
            (byte)(p1 >>> 24),
            (byte)(p1 >>> 16),
            (byte)(p1 >>> 8),
            (byte)p1
         };
         long var5 = m[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])o.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               o.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/CN", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         n[var3] = var15;
      }

      return n[var3];
}


protected void a__sourceReturn_a7421bf54c(java.lang.String p0) { __sourceHandlerCall_9d03604f6297d6ab801e(this, p0); }


synchronized void a__Void() { __sourceHandlerCall_8868023f6241305d4030(this); }


public moom.CN a__CN() { return __sourceHandlerCall_619d9644f34e95d9d3d1(this); }


public java.lang.String a() { return __sourceHandlerCall_99e30a4474672c6f377e(this); }


public net.minecraft.util.IChatComponent a(moom.CO p0) { return __sourceHandlerCall_3ea20ee7f7de73e4aa32(this, p0); }


public java.lang.Object[] a__ArrayObject() {
return this.e;
}


public net.minecraft.util.IChatComponent a__C5() {
return ((moom.CN)(this)).a__CN();
}


private net.minecraft.util.IChatComponent a(int p0) { return __sourceHandlerCall_97213d51f964c7cf0161(this, p0); }


private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4048_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4046_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_originalDynamicSite1079_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_originalDynamicSite1079_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1078_5(java.lang.String a0, java.lang.String a1, java.util.List a2, moom.CO a3) throws E;
}
