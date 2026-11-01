package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class L5 {

private static java.util.regex.Pattern a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

public L5() {
super();
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(-6652380947870418204L)), ((long)(240501453647055264L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(274775741804034L)))));
    long local20_life6 = (moom.L5.b ^ 119849664132060L);
    e = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life9;
    javax.crypto.Cipher __sourceSpill663_11 = (local11_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill663_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill663_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill663_14 = new byte[8];
    (__sourceSpill663_14)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local12_life15 = 1;
    while ((local12_life15 < 8)) {
        (__sourceSpill663_14)[local12_life15] = ((byte) ((int) ((local20_life6 << (local12_life15 * 8)) >>> 56)));
        local12_life15 += 1;
    }
    byte[] __sourcePreallocation663_16 = __sourceSpill663_14;
    ((javax.crypto.Cipher)(__sourceSpill663_11)).init(((int)(__sourceSpill663_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill663_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation663_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local18_life19 = new java.lang.String[5];
    int local16_life20 = 0;
    java.lang.String local15_life21;
    int local17_life23 = ((java.lang.String)((local15_life21 = ":Ø\001ùnz\023j°\006\037\022Ú\033\020}Há§©fçgùM\033]Ýz\020n\n>\016\177ÉÖ90³PÍ³\r"))).length();
    int local14_life24 = 16;
    int local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill663_28 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill663_29 = local11_life9;
        byte[] local19_life31 = ((javax.crypto.Cipher)(__sourceSpill663_29)).doFinal(((byte[])(__sourceSpill663_28)));
        java.lang.String __sourceSpill663_34 = ((java.lang.String)(moom.L5.a(((byte[])(local19_life31))))).intern();
        java.lang.String[] __sourceSpill663_35 = local18_life19;
        int __sourceSpill663_36 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill663_35)[__sourceSpill663_36] = __sourceSpill663_34;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    local17_life23 = ((java.lang.String)((local15_life21 = "\033lD\020¹\002u\031\022\177Òb.SLÖ¶eNBÑDìí\000+ó6]å:©]X\023.îØ\013å\005¦\007Ê(DÆ³­¦G\030ot\007\0222\030´\022\177\005ûIfã\013á»îÑÊoF"))).length();
    local14_life24 = 56;
    local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill663_41 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill663_42 = local11_life9;
        byte[] local19_life44 = ((javax.crypto.Cipher)(__sourceSpill663_42)).doFinal(((byte[])(__sourceSpill663_41)));
        java.lang.String __sourceSpill663_47 = ((java.lang.String)(moom.L5.a(((byte[])(local19_life44))))).intern();
        java.lang.String[] __sourceSpill663_48 = local18_life19;
        int __sourceSpill663_49 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill663_48)[__sourceSpill663_49] = __sourceSpill663_47;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    c = ((java.lang.String[])(local18_life19));
    d = ((java.lang.String[])(new java.lang.String[5]));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill663_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill663_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill663_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill663_60 = new byte[8];
    (__sourceSpill663_60)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill663_60)[local1_life61] = ((byte) ((int) ((local20_life6 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation663_62 = __sourceSpill663_60;
    ((javax.crypto.Cipher)(__sourceSpill663_57)).init(((int)(__sourceSpill663_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill663_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation663_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[2];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "=è#;v|\017fiH>8·ÞZ%"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill663_71 = local4_life67;
        int __sourceSpill663_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill663_71)).substring(((int)(__sourceSpill663_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill663_76 = local6_life65;
        int __sourceSpill663_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill663_79 = new byte[8];
        (__sourceSpill663_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill663_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill663_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill663_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill663_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill663_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill663_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill663_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill663_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill663_80)).doFinal(((byte[])(__sourceSpill663_79)));
        (__sourceSpill663_76)[__sourceSpill663_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    f = ((long[])(local6_life65));
    g = ((java.lang.Integer[])(new java.lang.Integer[2]));
    a = ((java.util.regex.Pattern)(java.util.regex.Pattern.compile(((java.lang.String)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite663_85(5772, (8991976246251489555L ^ local20_life6)))))));
}

private static native <E extends Throwable> void __sourceHandlerCall_0a508de2dbff31fde30c(moom.to a0) throws E;
private static final class __SourceHandler_0a508de2dbff31fde30c {

public static void f104(moom.to p0) throws Throwable {
    java.lang.String forwardValue104_14_0;
    int forwardValue104_21_0;
    int forwardValue104_28_0;
    net.minecraft.client.renderer.texture.ITextureObject forwardValue104_68_0;
    java.lang.Boolean forwardValue104_79_0;
    moom.n7 forwardValue104_85_0;
    moom.lh forwardValue104_93_0;
    java.lang.String spill104_0;
    java.lang.String spill104_1;
    boolean spill104_2;
    net.minecraft.client.renderer.texture.ITextureObject spill104_3;
    java.lang.Boolean spill104_4;
    moom.n7 spill104_5;
    moom.lh spill104_6;
    long life1_3;
    java.lang.String life4_7;
    java.lang.String life3_8;
    java.lang.String life5_57;
    moom.DD life6_69;
    net.minecraft.client.renderer.texture.TextureManager life7_72;
    net.minecraft.client.renderer.texture.ITextureObject life8_76;
    moom.n7 life9_90;
    moom.lh life11_119;
    moom.lj life10_133;
    moom.lj life9_144;
    moom.n7 life10_152;
    forward_join_122: {
    forward_join_100: {
    forward_join_99: {
    forward_join_93: {
    forward_join_85: {
    forward_join_79: {
    forward_join_68: {
    forward_join_28: {
    forward_join_21: {
    forward_join_14: {
    life1_3 = (__fieldRead104_0() ^ 119521261283610L);
    spill104_0 = __call104_1();
    life4_7 = __call104_2(p0);
    life3_8 = spill104_0;
    spill104_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue104_14_0 = spill104_1;
        break forward_join_14;
    }
    if (!((spill104_1 != null))) {
        break forward_join_122;
    }
    forwardValue104_14_0 = life4_7;
    }
    spill104_2 = __call104_3(forwardValue104_14_0);
    if (!((life3_8 == null))) {
        forwardValue104_21_0 = __integerCategory104_4(spill104_2);
        break forward_join_21;
    }
    if (!((!spill104_2))) {
        break forward_join_122;
    }
    forwardValue104_21_0 = __integerCategory104_6(__call104_5(life4_7, "\000"));
    }
    if (!((life3_8 == null))) {
        forwardValue104_28_0 = forwardValue104_21_0;
        break forward_join_28;
    }
    if (!((forwardValue104_21_0 == 0))) {
        break forward_join_122;
    }
    forwardValue104_28_0 = __integerCategory104_10(__call104_9(__call104_8(__fieldRead104_7(), life4_7)));
    }
    if (!((forwardValue104_28_0 != 0))) {
        break forward_join_122;
    }
    java.lang.String __stackOp104_12_0 = life4_7;
    java.lang.String __stackOp104_12_1 = __invokedynamic104_11(20115, (7957691427964718029L ^ life1_3));
    life5_57 = __invokedynamic104_14(__stackOp104_12_1, __stackOp104_12_0, __invokedynamic104_13(28421, (7341759583025867353L ^ life1_3)));
    java.lang.Object __inlineStack104_16Token;
    life6_69 = new moom.DD(__invokedynamic104_17(__inlineStack104_16Output0((__inlineStack104_16Token = __inlineStack104_16Pack(life4_7, __invokedynamic104_15(5438, (7038196557078548579L ^ life1_3))))), __inlineStack104_16Output1(__inlineStack104_16Token)));
    life7_72 = __call104_19(__call104_18());
    life8_76 = __call104_20(life7_72, life6_69);
    spill104_3 = life8_76;
    if (!((life3_8 == null))) {
        forwardValue104_68_0 = spill104_3;
        break forward_join_68;
    }
    if (!((__instanceOf104_21(spill104_3) != 0))) {
        break forward_join_100;
    }
    forwardValue104_68_0 = life8_76;
    }
    life9_90 = __cast104_22(forwardValue104_68_0);
    spill104_4 = __fieldRead104_23(life9_90);
    if (!((life3_8 == null))) {
        forwardValue104_79_0 = spill104_4;
        break forward_join_79;
    }
    if (!((spill104_4 != null))) {
        break forward_join_100;
    }
    spill104_5 = life9_90;
    if (!((life3_8 == null))) {
        forwardValue104_85_0 = spill104_5;
        break forward_join_85;
    }
    forwardValue104_79_0 = __fieldRead104_24(spill104_5);
    }
    if (!(__call104_25(forwardValue104_79_0))) {
        break forward_join_99;
    }
    __call104_26(p0, life6_69);
    forwardValue104_85_0 = life9_90;
    }
    life11_119 = __call104_27(forwardValue104_85_0);
    spill104_6 = life11_119;
    if (!((life3_8 == null))) {
        forwardValue104_93_0 = spill104_6;
        break forward_join_93;
    }
    if (!((__instanceOf104_28(spill104_6) != 0))) {
        break forward_join_99;
    }
    forwardValue104_93_0 = life11_119;
    }
    life10_133 = __cast104_29(forwardValue104_93_0);
    __call104_31(p0, __call104_30(life10_133));
    }
    return;
    }
    life9_144 = new moom.lj(p0, life6_69);
    life10_152 = new moom.n7(null, life5_57, null, life9_144);
    __fieldWrite104_32(life10_152, 1);
    __call104_33(life7_72, life6_69, life10_152);
    }
    return;
}
private static native long __fieldRead104_0() throws Throwable;
private static native java.lang.String __call104_1() throws Throwable;
private static native java.lang.String __call104_2(moom.to a0) throws Throwable;
private static native boolean __call104_3(java.lang.String a0) throws Throwable;
private static native int __integerCategory104_4(boolean value) throws Throwable;
private static native boolean __call104_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory104_6(boolean value) throws Throwable;
private static native java.util.regex.Pattern __fieldRead104_7() throws Throwable;
private static native java.util.regex.Matcher __call104_8(java.util.regex.Pattern a0, java.lang.String a1) throws Throwable;
private static native boolean __call104_9(java.util.regex.Matcher a0) throws Throwable;
private static native int __integerCategory104_10(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic104_11(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic104_13(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic104_14(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic104_15(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack104_16Pack(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack104_16Output0(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack104_16Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic104_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.Minecraft __call104_18() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call104_19(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.ITextureObject __call104_20(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native int __instanceOf104_21(net.minecraft.client.renderer.texture.ITextureObject a0) throws Throwable;
private static native moom.n7 __cast104_22(net.minecraft.client.renderer.texture.ITextureObject a0) throws Throwable;
private static native java.lang.Boolean __fieldRead104_23(moom.n7 a0) throws Throwable;
private static native java.lang.Boolean __fieldRead104_24(moom.n7 a0) throws Throwable;
private static native boolean __call104_25(java.lang.Boolean a0) throws Throwable;
private static native void __call104_26(moom.to a0, moom.DD a1) throws Throwable;
private static native moom.lh __call104_27(moom.n7 a0) throws Throwable;
private static native int __instanceOf104_28(moom.lh a0) throws Throwable;
private static native moom.lj __cast104_29(moom.lh a0) throws Throwable;
private static native boolean __call104_30(moom.lj a0) throws Throwable;
private static native void __call104_31(moom.to a0, boolean a1) throws Throwable;
private static native void __fieldWrite104_32(moom.n7 a0, int a1) throws Throwable;
private static native boolean __call104_33(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1, moom.n7 a2) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d344079004958e885ff7(moom.to a0) throws E;
private static final class __SourceHandler_d344079004958e885ff7 {

public static void f30(moom.to p0) throws Throwable {
    java.lang.String spill30_0;
    long life1_3;
    java.lang.String life4_6;
    moom.DD life5_18;
    net.minecraft.client.renderer.texture.TextureManager life6_20;
    net.minecraft.client.renderer.texture.ITextureObject life7_25;
    java.lang.String life3_26;
    moom.n6 life8_37;
    life1_3 = (__fieldRead30_0() ^ 33930510767226L);
    life4_6 = __call30_1(p0);
    java.lang.Object __inlineStack30_3Token;
    life5_18 = new moom.DD(__invokedynamic30_4(__inlineStack30_3Output0((__inlineStack30_3Token = __inlineStack30_3Pack(life4_6, __invokedynamic30_2(1599, (5330829261509312000L ^ life1_3))))), __inlineStack30_3Output1(__inlineStack30_3Token)));
    life6_20 = __call30_5();
    spill30_0 = __call30_6();
    life7_25 = __call30_7(life6_20, life5_18);
    life3_26 = spill30_0;
    if ((life3_26 == null)) {
        if ((__instanceOf30_8(life7_25) != 0)) {
        life8_37 = __cast30_9(life7_25);
        __call30_10(life8_37);
        __call30_11(life6_20, life5_18);
    } else {
        
    }
        __call30_12(p0, null);
        __call30_13(p0, 0);
        __call30_14(p0);
    } else {
        
    }
    return;
}
private static native long __fieldRead30_0() throws Throwable;
private static native java.lang.String __call30_1(moom.to a0) throws Throwable;
private static native java.lang.String __invokedynamic30_2(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack30_3Pack(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack30_3Output0(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack30_3Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic30_4(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call30_5() throws Throwable;
private static native java.lang.String __call30_6() throws Throwable;
private static native net.minecraft.client.renderer.texture.ITextureObject __call30_7(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native int __instanceOf30_8(net.minecraft.client.renderer.texture.ITextureObject a0) throws Throwable;
private static native moom.n6 __cast30_9(net.minecraft.client.renderer.texture.ITextureObject a0) throws Throwable;
private static native void __call30_10(moom.n6 a0) throws Throwable;
private static native void __call30_11(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native void __call30_12(moom.to a0, java.lang.Object a1) throws Throwable;
private static native void __call30_13(moom.to a0, int a1) throws Throwable;
private static native void __call30_14(moom.to a0) throws Throwable;

}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.L5.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5841_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/L5"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 32464;
      if (g[var3] == null) {
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
         long var5 = f[var3];
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
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/L5", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


public static void b(moom.to p0) { __sourceHandlerCall_d344079004958e885ff7(p0); }


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5843_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/L5"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static java.awt.image.BufferedImage a(java.awt.image.BufferedImage p0) {
int lexicalValue911_40_0;
    int lexicalValue911_40_1;
    java.lang.String spill911_0;
    int spill911_1;
    int spill911_2;
    long life1_3;
    int life4_10;
    java.lang.String life3_11;
    int life5_17;
    int life6_20;
    int life7_23;
    java.awt.image.BufferedImage life7_56;
    java.awt.Graphics life8_59;
    lexical_join_44: {
    life1_3 = (moom.L5.b ^ 121632373707512L);
    spill911_0 = moom.L_.b();
    life4_10 = __sourceIntrinsic_ffe7cf041fec_invokedynamic911_2(23701, (10900167844872886L ^ life1_3));
    life3_11 = spill911_0;
    life5_17 = __sourceIntrinsic_ffe7cf041fec_invokedynamic911_3(9554, (6929466938619050864L ^ life1_3));
    life6_20 = ((java.awt.image.BufferedImage)(p0)).getWidth();
    life7_23 = ((java.awt.image.BufferedImage)(p0)).getHeight();
    lexical_cycle_24: while (true) {
    lexical_join_40: {
    lexical_join_34: {
    if (!((life4_10 >= life6_20))) {
        break lexical_join_34;
    }
    spill911_1 = life5_17;
    spill911_2 = life7_23;
    if (!((life3_11 == null))) {
        lexicalValue911_40_0 = spill911_1;
        lexicalValue911_40_1 = spill911_2;
        break lexical_join_40;
    }
    if (!((life3_11 == null))) {
        lexicalValue911_40_0 = spill911_1;
        lexicalValue911_40_1 = spill911_2;
        break lexical_join_40;
    }
    if (!((spill911_1 < spill911_2))) {
        break lexical_join_44;
    }
    }
    life4_10 = (life4_10 * 2);
    lexicalValue911_40_0 = life5_17;
    lexicalValue911_40_1 = 2;
    }
    life5_17 = (lexicalValue911_40_0 * lexicalValue911_40_1);
    if (!((life3_11 != null))) { continue lexical_cycle_24; }
    break lexical_cycle_24;
    }
    }
    life7_56 = new java.awt.image.BufferedImage(life4_10, life5_17, 2);
    life8_59 = ((java.awt.image.BufferedImage)(life7_56)).getGraphics();
    ((java.awt.Graphics)(life8_59)).drawImage(((java.awt.Image)(p0)), ((int)(0)), ((int)(0)), ((java.awt.image.ImageObserver)(null)));
    ((java.awt.Graphics)(life8_59)).dispose();
    return life7_56;
}


public static void a(moom.to p0) { __sourceHandlerCall_0a508de2dbff31fde30c(p0); }


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
        byte[] spill2992_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2992_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2992_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2992_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2992_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2992_2)[life4_9];
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


public static boolean a(java.awt.image.BufferedImage p0, java.awt.image.BufferedImage p1) {
int forwardValue2547_14_0;
    int forwardValue2547_16_0;
    int spill2547_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_14: {
    life2_3 = (moom.L5.b ^ 127356558151868L);
    life4_5 = moom.L_.b();
    spill2547_0 = ((java.awt.image.BufferedImage)(p0)).getWidth();
    if (!((life4_5 == null))) {
        forwardValue2547_14_0 = spill2547_0;
        break forward_join_14;
    }
    if (!((spill2547_0 > ((java.awt.image.BufferedImage)(p1)).getHeight()))) {
        break forward_join_15;
    }
    forwardValue2547_14_0 = 1;
    }
    forwardValue2547_16_0 = forwardValue2547_14_0;
    break forward_join_16;
    }
    forwardValue2547_16_0 = 0;
    }
    return ((forwardValue2547_16_0) != 0);
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 24140);
    if (((moom.L5.d)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.L5.e)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.L5.e)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/L5", life9_51);
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
        life9_116 = ((java.lang.String)((moom.L5.c)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.L5.d)[life5_8] = moom.L5.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.L5.d)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.L5.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite663_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic911_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic911_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5843_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6b3152fcce6a_invokedynamic104_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6b3152fcce6a_invokedynamic104_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6b3152fcce6a_invokedynamic104_14(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6b3152fcce6a_invokedynamic104_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5841_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_33bf765f2b67_invokedynamic30_2(int a0, long a1) throws E;
}
