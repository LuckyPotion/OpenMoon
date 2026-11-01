package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class FG {

private java.util.List<net.minecraft.world.gen.FlatLayerInfo> a;

private java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> b;

private int c;

private static long d;

private static long[] e;

private static java.lang.Integer[] f;

private static java.util.Map g;

public FG() {
super();
    this.a = com.google.common.collect.Lists.newArrayList();
    this.b = com.google.common.collect.Maps.newHashMap();
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(8044221810671463844L)), ((long)(-8266884014365480603L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(102694421995731L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.FG.d ^ 90123645364084L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill533_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill533_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill533_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill533_14 = new byte[8];
    (__sourceSpill533_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill533_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation533_16 = __sourceSpill533_14;
    ((javax.crypto.Cipher)(__sourceSpill533_11)).init(((int)(__sourceSpill533_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill533_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation533_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ð´5#o+Þ\0234+ÎíÆ5½~y²Ë´,;å"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill533_25 = local6_life21;
        int __sourceSpill533_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill533_25)).substring(((int)(__sourceSpill533_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill533_30 = local8_life19;
        int __sourceSpill533_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill533_33 = new byte[8];
        (__sourceSpill533_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill533_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill533_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill533_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill533_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill533_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill533_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill533_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill533_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill533_34)).doFinal(((byte[])(__sourceSpill533_33)));
        (__sourceSpill533_30)[__sourceSpill533_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    e = ((long[])(local8_life19));
    f = ((java.lang.Integer[])(new java.lang.Integer[3]));
}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_c012b098fda667c379ab(int a0, java.lang.String a1) throws E;
private static final class __SourceHandler_c012b098fda667c379ab {

public static java.util.List f634(int p0, java.lang.String p1) throws Throwable {
    java.lang.String lexicalValue634_11_0;
    java.lang.String spill634_0;
    long life2_3;
    java.lang.String[] life4_5;
    java.util.ArrayList life5_18;
    java.lang.String[] life6_22;
    int life7_24;
    java.lang.String[] life8_26;
    int life9_29;
    int life10_31;
    java.lang.String life11_38;
    net.minecraft.world.gen.FlatLayerInfo life12_43;
    lexical_join_61: {
    lexical_join_59: {
    lexical_join_11: {
    life2_3 = (__fieldRead634_0() ^ 85947760335404L);
    life4_5 = __call634_1();
    spill634_0 = p1;
    if (!((life4_5 != null))) {
        lexicalValue634_11_0 = spill634_0;
        break lexical_join_11;
    }
    if (!((spill634_0 != null))) {
        break lexical_join_61;
    }
    lexicalValue634_11_0 = p1;
    }
    if (!((__call634_2(lexicalValue634_11_0) >= 1))) {
        break lexical_join_61;
    }
    life5_18 = __call634_3();
    life6_22 = __call634_4(p1, ",");
    life7_24 = 0;
    life8_26 = life6_22;
    life9_29 = (life8_26).length;
    life10_31 = 0;
    lexical_cycle_29: while (true) {
    lexical_join_57: {
    lexical_join_47: {
    if (!((life10_31 < life9_29))) {
        break lexical_join_59;
    }
    life11_38 = (life8_26)[life10_31];
    life12_43 = __call634_5(p0, life11_38, life7_24);
    if (!((life4_5 != null))) {
        break lexical_join_57;
    }
    if (!((life12_43 == null))) {
        break lexical_join_47;
    }
    return null;
    }
    __call634_6(life5_18, life12_43);
    life7_24 = (life7_24 + __call634_7(life12_43));
    life10_31 += 1;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_29; }
    break lexical_cycle_29;
    }
    }
    return life5_18;
    }
    return null;
}
public static void h634_0(moom.Oo p0) throws Throwable {
    throw __call1063400_0(p0);
}
public static void h634_1(moom.Oo p0) throws Throwable {
    throw __call1063401_0(p0);
}
public static void h634_2(moom.Oo p0) throws Throwable {
    throw __call1063402_0(p0);
}
private static native long __fieldRead634_0() throws Throwable;
private static native java.lang.String[] __call634_1() throws Throwable;
private static native int __call634_2(java.lang.String a0) throws Throwable;
private static native java.util.ArrayList __call634_3() throws Throwable;
private static native java.lang.String[] __call634_4(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.world.gen.FlatLayerInfo __call634_5(int a0, java.lang.String a1, int a2) throws Throwable;
private static native boolean __call634_6(java.util.ArrayList a0, net.minecraft.world.gen.FlatLayerInfo a1) throws Throwable;
private static native int __call634_7(net.minecraft.world.gen.FlatLayerInfo a0) throws Throwable;
private static native java.lang.Throwable __call1063400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1063401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1063402_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.world.gen.FlatLayerInfo __sourceHandlerCall_57bc47f9c70ab23eceb4(int a0, java.lang.String a1, int a2) throws E;
private static final class __SourceHandler_57bc47f9c70ab23eceb4 {

public static net.minecraft.world.gen.FlatLayerInfo f259(int p0, java.lang.String p1, int p2) throws Throwable {
    java.lang.String[] forwardValue259_18_0;
    int forwardValue259_44_0;
    int forwardValue259_44_1;
    int forwardValue259_54_0;
    int forwardValue259_58_0;
    int forwardValue259_93_0;
    int forwardValue259_106_0;
    int forwardValue259_106_1;
    java.lang.String[] forwardValue259_108_0;
    net.minecraft.block.Block forwardValue259_117_0;
    int forwardValue259_132_0;
    int forwardValue259_134_0;
    net.minecraft.block.Block forwardValue259_143_0;
    int forwardValue259_156_0;
    int forwardValue259_158_0;
    net.minecraft.block.Block forwardValue259_160_0;
    net.minecraft.block.Block forwardValue259_166_0;
    int forwardValue259_184_0;
    int spill259_0;
    int spill259_1;
    int spill259_2;
    int spill259_3;
    int spill259_4;
    int spill259_5;
    java.lang.String[] spill259_6;
    net.minecraft.block.Block spill259_7;
    int spill259_8;
    int spill259_9;
    int spill259_10;
    int spill259_11;
    long life3_3;
    java.lang.String[] life5_5;
    java.lang.String[] life6_20;
    int life7_22;
    int life8_24;
    java.lang.Object life9_75;
    java.lang.String life10_82;
    java.lang.String[] life6_95;
    net.minecraft.block.Block life9_115;
    net.minecraft.world.gen.FlatLayerInfo life10_259;
    forward_join_185: {
    forward_join_184: {
    forward_join_183: {
    forward_join_170: {
    forward_join_166: {
    forward_join_165: {
    forward_join_160: {
    forward_join_159: {
    forward_join_158: {
    forward_join_157: {
    forward_join_156: {
    forward_join_143: {
    forward_join_137: {
    forward_join_134: {
    forward_join_133: {
    forward_join_132: {
    forward_join_117: {
    forward_join_116: {
    forward_join_108: {
    forward_join_106: {
    forward_join_96: {
    forward_join_93: {
    forward_join_89: {
    forward_join_59: {
    forward_join_58: {
    forward_join_54: {
    forward_join_53: {
    forward_join_44: {
    forward_join_18: {
    forward_join_14: {
    life3_3 = (__fieldRead259_0() ^ 88563105266387L);
    life5_5 = __call259_1();
    if (!((p0 >= 3))) {
        break forward_join_14;
    }
    forwardValue259_18_0 = __call259_2(p1, "\\*", 2);
    break forward_join_18;
    }
    forwardValue259_18_0 = __call259_3(p1, "x", 2);
    }
    life6_20 = forwardValue259_18_0;
    life7_22 = 1;
    life8_24 = 0;
    spill259_0 = (life6_20).length;
    spill259_1 = 2;
    if (!((life5_5 != null))) {
        forwardValue259_44_0 = spill259_0;
        forwardValue259_44_1 = spill259_1;
        break forward_join_44;
    }
    if (!((spill259_0 == spill259_1))) {
        break forward_join_59;
    }
    life7_22 = __call259_4((life6_20)[0]);
    spill259_2 = (p2 + life7_22);
    if (!((life5_5 != null))) {
        forwardValue259_54_0 = spill259_2;
        break forward_join_54;
    }
    forwardValue259_44_0 = spill259_2;
    forwardValue259_44_1 = __invokedynamic259_5(20871, (239574394407899473L ^ life3_3));
    }
    if (!((forwardValue259_44_0 >= forwardValue259_44_1))) {
        break forward_join_53;
    }
    life7_22 = (__invokedynamic259_6(20703, (5426328889573199882L ^ life3_3)) - p2);
    }
    forwardValue259_54_0 = life7_22;
    }
    if (!((life5_5 != null))) {
        forwardValue259_58_0 = forwardValue259_54_0;
        break forward_join_58;
    }
    if (!((forwardValue259_54_0 < 0))) {
        break forward_join_59;
    }
    forwardValue259_58_0 = 0;
    }
    life7_22 = forwardValue259_58_0;
    }
    life9_75 = null;
    life10_82 = (life6_20)[((life6_20).length - 1)];
    spill259_3 = p0;
    spill259_4 = 3;
    if (!((life5_5 != null))) {
        forwardValue259_106_0 = spill259_3;
        forwardValue259_106_1 = spill259_4;
        break forward_join_106;
    }
    if (!((spill259_3 < spill259_4))) {
        break forward_join_96;
    }
    life6_95 = __call259_7(life10_82, ":", 2);
    spill259_5 = (life6_95).length;
    if (!((life5_5 != null))) {
        forwardValue259_93_0 = spill259_5;
        break forward_join_93;
    }
    if (!((spill259_5 > 1))) {
        break forward_join_89;
    }
    life8_24 = __call259_8((life6_95)[1]);
    }
    forwardValue259_93_0 = __call259_9((life6_95)[0]);
    }
    life9_115 = __call259_10(forwardValue259_93_0);
    break forward_join_165;
    }
    life6_20 = __call259_11(life10_82, ":", 3);
    spill259_6 = life6_20;
    if (!((life5_5 != null))) {
        forwardValue259_108_0 = spill259_6;
        break forward_join_108;
    }
    forwardValue259_106_0 = (spill259_6).length;
    forwardValue259_106_1 = 1;
    }
    if (!((forwardValue259_106_0 > forwardValue259_106_1))) {
        break forward_join_116;
    }
    forwardValue259_108_0 = life6_20;
    }
    forwardValue259_117_0 = __call259_13(__invokedynamic259_12((forwardValue259_108_0)[0], (life6_20)[1]));
    break forward_join_117;
    }
    forwardValue259_117_0 = null;
    }
    life9_115 = forwardValue259_117_0;
    spill259_7 = life9_115;
    if (!((life5_5 != null))) {
        forwardValue259_143_0 = spill259_7;
        break forward_join_143;
    }
    if (!((spill259_7 != null))) {
        break forward_join_137;
    }
    spill259_8 = (life6_20).length;
    if (!((life5_5 != null))) {
        forwardValue259_132_0 = spill259_8;
        break forward_join_132;
    }
    if (!((spill259_8 > 2))) {
        break forward_join_133;
    }
    forwardValue259_132_0 = __call259_14((life6_20)[2]);
    }
    forwardValue259_134_0 = forwardValue259_132_0;
    break forward_join_134;
    }
    forwardValue259_134_0 = 0;
    }
    life8_24 = forwardValue259_134_0;
    if (!((life5_5 == null))) {
        break forward_join_159;
    }
    }
    life9_115 = __call259_15((life6_20)[0]);
    forwardValue259_143_0 = life9_115;
    }
    if (!((life5_5 != null))) {
        forwardValue259_160_0 = forwardValue259_143_0;
        break forward_join_160;
    }
    if (!((forwardValue259_143_0 != null))) {
        break forward_join_159;
    }
    spill259_9 = (life6_20).length;
    if (!((life5_5 != null))) {
        forwardValue259_156_0 = spill259_9;
        break forward_join_156;
    }
    if (!((spill259_9 > 1))) {
        break forward_join_157;
    }
    forwardValue259_156_0 = __call259_16((life6_20)[1]);
    }
    forwardValue259_158_0 = forwardValue259_156_0;
    break forward_join_158;
    }
    forwardValue259_158_0 = 0;
    }
    life8_24 = forwardValue259_158_0;
    }
    forwardValue259_160_0 = life9_115;
    }
    if (!((life5_5 != null))) {
        forwardValue259_166_0 = forwardValue259_160_0;
        break forward_join_166;
    }
    if (!((forwardValue259_160_0 == null))) {
        break forward_join_165;
    }
    return null;
    }
    forwardValue259_166_0 = life9_115;
    }
    if (!((forwardValue259_166_0 == __fieldRead259_17()))) {
        break forward_join_170;
    }
    life8_24 = 0;
    }
    spill259_10 = life8_24;
    if (!((life5_5 != null))) {
        forwardValue259_184_0 = spill259_10;
        break forward_join_184;
    }
    if (!((spill259_10 >= 0))) {
        break forward_join_183;
    }
    spill259_11 = life8_24;
    if (!((life5_5 != null))) {
        forwardValue259_184_0 = spill259_11;
        break forward_join_184;
    }
    if (!((spill259_11 > __invokedynamic259_18(12948, (2759033276590666307L ^ life3_3))))) {
        break forward_join_185;
    }
    }
    forwardValue259_184_0 = 0;
    }
    life8_24 = forwardValue259_184_0;
    }
    life10_259 = new net.minecraft.world.gen.FlatLayerInfo(p0, life7_22, life9_115, life8_24);
    __call259_19(life10_259, p2);
    return life10_259;
}
public static net.minecraft.world.gen.FlatLayerInfo h259_0(java.lang.Throwable p0) throws Throwable {
    throw __call2025900_0(p0);
}
public static net.minecraft.world.gen.FlatLayerInfo h259_1(java.lang.Throwable p0) throws Throwable {
    throw __call2025901_0(p0);
}
public static net.minecraft.world.gen.FlatLayerInfo h259_2(java.lang.Throwable p0) throws Throwable {
    throw __call2025902_0(p0);
}
public static net.minecraft.world.gen.FlatLayerInfo h259_3(java.lang.Throwable p0) throws Throwable {
    throw __call2025903_0(p0);
}
public static net.minecraft.world.gen.FlatLayerInfo h259_4(java.lang.Throwable p0) throws Throwable {
    java.lang.Throwable local1 = p0;
    return null;
}
public static net.minecraft.world.gen.FlatLayerInfo h259_5(java.lang.Throwable p0) throws Throwable {
    throw __call2025905_0(p0);
}
public static net.minecraft.world.gen.FlatLayerInfo h259_6(java.lang.Throwable p0) throws Throwable {
    throw __call2025906_0(p0);
}
public static net.minecraft.world.gen.FlatLayerInfo h259_7(java.lang.Throwable p0) throws Throwable {
    throw __call2025907_0(p0);
}
public static net.minecraft.world.gen.FlatLayerInfo h259_8(java.lang.Throwable p0) throws Throwable {
    throw __call2025908_0(p0);
}
public static net.minecraft.world.gen.FlatLayerInfo h259_9(java.lang.Throwable p0) throws Throwable {
    throw __call2025909_0(p0);
}
public static net.minecraft.world.gen.FlatLayerInfo h259_10(java.lang.Throwable p0) throws Throwable {
    throw __call2025910_0(p0);
}
public static net.minecraft.world.gen.FlatLayerInfo h259_11(java.lang.Throwable p0) throws Throwable {
    throw __call2025911_0(p0);
}
public static net.minecraft.world.gen.FlatLayerInfo h259_12(java.lang.Throwable p0) throws Throwable {
    throw __call2025912_0(p0);
}
public static net.minecraft.world.gen.FlatLayerInfo h259_13(java.lang.Throwable p0) throws Throwable {
    throw __call2025913_0(p0);
}
public static net.minecraft.world.gen.FlatLayerInfo h259_14(java.lang.Throwable p0) throws Throwable {
    throw __call2025914_0(p0);
}
public static net.minecraft.world.gen.FlatLayerInfo h259_15(java.lang.Throwable p0) throws Throwable {
    throw __call2025915_0(p0);
}
public static net.minecraft.world.gen.FlatLayerInfo h259_16(java.lang.Throwable p0) throws Throwable {
    throw __call2025916_0(p0);
}
public static net.minecraft.world.gen.FlatLayerInfo h259_17(java.lang.Throwable p0) throws Throwable {
    throw __call2025917_0(p0);
}
public static net.minecraft.world.gen.FlatLayerInfo h259_18(java.lang.Throwable p0) throws Throwable {
    throw __call2025918_0(p0);
}
public static net.minecraft.world.gen.FlatLayerInfo h259_19(java.lang.Throwable p0) throws Throwable {
    throw __call2025919_0(p0);
}
public static net.minecraft.world.gen.FlatLayerInfo h259_20(java.lang.Throwable p0) throws Throwable {
    throw __call2025920_0(p0);
}
public static net.minecraft.world.gen.FlatLayerInfo h259_21(java.lang.Throwable p0) throws Throwable {
    java.lang.Throwable local1 = p0;
    return null;
}
private static native long __fieldRead259_0() throws Throwable;
private static native java.lang.String[] __call259_1() throws Throwable;
private static native java.lang.String[] __call259_2(java.lang.String a0, java.lang.String a1, int a2) throws Throwable;
private static native java.lang.String[] __call259_3(java.lang.String a0, java.lang.String a1, int a2) throws Throwable;
private static native int __call259_4(java.lang.String a0) throws Throwable;
private static native int __invokedynamic259_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic259_6(int a0, long a1) throws Throwable;
private static native java.lang.String[] __call259_7(java.lang.String a0, java.lang.String a1, int a2) throws Throwable;
private static native int __call259_8(java.lang.String a0) throws Throwable;
private static native int __call259_9(java.lang.String a0) throws Throwable;
private static native net.minecraft.block.Block __call259_10(int a0) throws Throwable;
private static native java.lang.String[] __call259_11(java.lang.String a0, java.lang.String a1, int a2) throws Throwable;
private static native java.lang.String __invokedynamic259_12(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call259_13(java.lang.String a0) throws Throwable;
private static native int __call259_14(java.lang.String a0) throws Throwable;
private static native net.minecraft.block.Block __call259_15(java.lang.String a0) throws Throwable;
private static native int __call259_16(java.lang.String a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead259_17() throws Throwable;
private static native int __invokedynamic259_18(int a0, long a1) throws Throwable;
private static native void __call259_19(net.minecraft.world.gen.FlatLayerInfo a0, int a1) throws Throwable;
private static native java.lang.Throwable __call2025900_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2025901_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2025902_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2025903_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2025905_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2025906_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2025907_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2025908_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2025909_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2025910_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2025911_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2025912_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2025913_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2025914_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2025915_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2025916_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2025917_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2025918_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2025919_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2025920_0(java.lang.Throwable a0) throws Throwable;

}

private static native <E extends Throwable> moom.FG __sourceHandlerCall_4dd0b688dbdc82dfc463(java.lang.String a0) throws E;
private static final class __SourceHandler_4dd0b688dbdc82dfc463 {

public static moom.FG f620(java.lang.String p0) throws Throwable {
    java.lang.String forestValue620_13_0;
    java.lang.String[] forestValue620_26_0;
    int forestValue620_30_0;
    int forestValue620_36_0;
    int forestValue620_49_0;
    int forestValue620_51_0;
    java.util.List forestValue620_64_0;
    int forestValue620_77_0;
    int forestValue620_101_0;
    int forestValue620_125_0;
    int forestValue620_125_1;
    int forestValue620_174_0;
    java.lang.String forestValue620_187_0;
    java.lang.Object forestValue620_239_0;
    java.lang.String spill620_0;
    java.lang.String[] spill620_1;
    int spill620_2;
    int spill620_3;
    java.util.List spill620_4;
    boolean spill620_5;
    int spill620_6;
    int spill620_7;
    moom.FG spill620_8;
    java.lang.String[] spill620_9;
    boolean spill620_10;
    java.lang.String spill620_11;
    int spill620_12;
    int spill620_13;
    long life1_3;
    java.lang.String[] life3_5;
    java.lang.String[] life4_17;
    int life5_32;
    moom.FG life6_44;
    int life7_56;
    java.util.List life8_63;
    int life9_85;
    java.lang.String[] life10_129;
    java.lang.String[] life11_131;
    int life12_134;
    int life13_136;
    java.lang.String life14_143;
    java.lang.String[] life15_148;
    java.util.HashMap life16_150;
    java.lang.String[] life17_212;
    java.lang.String[] life18_214;
    int life19_217;
    int life20_219;
    java.lang.String life21_226;
    java.lang.String[] life22_231;
    forest_join_244: {
    forest_join_242: {
    forest_join_240: {
    forest_join_239: {
    forest_join_234: {
    forest_join_232: {
    forest_join_101: {
    forest_join_95: {
    forest_join_77: {
    forest_join_64: {
    forest_join_51: {
    forest_join_50: {
    forest_join_49: {
    forest_join_36: {
    forest_join_30: {
    forest_join_26: {
    forest_join_25: {
    forest_join_13: {
    forest_join_12: {
    life1_3 = (__fieldRead620_0() ^ 49638552595891L);
    life3_5 = __call620_1();
    spill620_0 = p0;
    if (!((life3_5 != null))) {
        forestValue620_13_0 = spill620_0;
        break forest_join_13;
    }
    if (!((spill620_0 == null))) {
        break forest_join_12;
    }
    return __call620_2();
    }
    forestValue620_13_0 = p0;
    }
    life4_17 = __call620_3(forestValue620_13_0, ";", -1);
    spill620_1 = life4_17;
    if (!((life3_5 != null))) {
        forestValue620_26_0 = spill620_1;
        break forest_join_26;
    }
    if (!(((spill620_1).length == 1))) {
        break forest_join_25;
    }
    forestValue620_30_0 = 0;
    break forest_join_30;
    }
    forestValue620_26_0 = life4_17;
    }
    forestValue620_30_0 = __call620_4((forestValue620_26_0)[0], 0);
    }
    life5_32 = forestValue620_30_0;
    spill620_2 = life5_32;
    if (!((life3_5 != null))) {
        forestValue620_36_0 = spill620_2;
        break forest_join_36;
    }
    if (!((spill620_2 >= 0))) {
        break forest_join_244;
    }
    forestValue620_36_0 = life5_32;
    }
    if (!((forestValue620_36_0 <= 3))) {
        break forest_join_244;
    }
    life6_44 = new moom.FG();
    spill620_3 = (life4_17).length;
    if (!((life3_5 != null))) {
        forestValue620_49_0 = spill620_3;
        break forest_join_49;
    }
    if (!((spill620_3 == 1))) {
        break forest_join_50;
    }
    forestValue620_49_0 = 0;
    }
    forestValue620_51_0 = forestValue620_49_0;
    break forest_join_51;
    }
    forestValue620_51_0 = 1;
    }
    life7_56 = forestValue620_51_0;
    life8_63 = __call620_5(life5_32, (life4_17)[(life7_56++)]);
    spill620_4 = life8_63;
    if (!((life3_5 != null))) {
        forestValue620_64_0 = spill620_4;
        break forest_join_64;
    }
    if (!((spill620_4 != null))) {
        break forest_join_242;
    }
    forestValue620_64_0 = life8_63;
    }
    spill620_5 = __call620_6(forestValue620_64_0);
    if (!((life3_5 != null))) {
        forestValue620_77_0 = __integerCategory620_7(spill620_5);
        break forest_join_77;
    }
    if (!((!spill620_5))) {
        break forest_join_242;
    }
    __call620_9(__call620_8(life6_44), life8_63);
    __call620_10(life6_44);
    forestValue620_77_0 = __fieldRead620_12(__fieldRead620_11());
    }
    life9_85 = forestValue620_77_0;
    spill620_6 = life5_32;
    if (!((life3_5 != null))) {
        forestValue620_101_0 = spill620_6;
        break forest_join_101;
    }
    if (!((spill620_6 > 0))) {
        break forest_join_95;
    }
    spill620_7 = (life4_17).length;
    if (!((life3_5 != null))) {
        forestValue620_101_0 = spill620_7;
        break forest_join_101;
    }
    if (!((spill620_7 > life7_56))) {
        break forest_join_95;
    }
    life9_85 = __call620_13((life4_17)[(life7_56++)], life9_85);
    }
    spill620_8 = life6_44;
    if (!((life3_5 != null))) {
        forestValue620_239_0 = spill620_8;
        break forest_join_239;
    }
    __call620_14(spill620_8, life9_85);
    forestValue620_101_0 = life5_32;
    }
    if (!((forestValue620_101_0 > 0))) {
        break forest_join_234;
    }
    spill620_9 = life4_17;
    if (!((life3_5 != null))) {
        forestValue620_239_0 = spill620_9;
        break forest_join_239;
    }
    if (!(((spill620_9).length > life7_56))) {
        break forest_join_234;
    }
    life10_129 = __call620_16(__call620_15((life4_17)[(life7_56++)]), ",");
    life11_131 = life10_129;
    life12_134 = (life11_131).length;
    life13_136 = 0;
    forest_cycle_123: while (true) {
    forest_join_230: {
    forest_join_229: {
    forestValue620_125_0 = life13_136;
    forestValue620_125_1 = life12_134;
    forest_cycle_125: while (true) {
    forest_join_187: {
    forest_join_174: {
    if (!((forestValue620_125_0 < forestValue620_125_1))) {
        break forest_join_232;
    }
    life14_143 = (life11_131)[life13_136];
    life15_148 = __call620_17(life14_143, "\\(", 2);
    life16_150 = __call620_18();
    if (!((life3_5 != null))) {
        break forest_join_240;
    }
    if (!((life3_5 != null))) {
        break forest_join_230;
    }
    if (!((__call620_19((life15_148)[0]) > 0))) {
        break forest_join_229;
    }
    __call620_21(__call620_20(life6_44), (life15_148)[0], life16_150);
    if (!((life3_5 != null))) {
        break forest_join_230;
    }
    if (!(((life15_148).length > 1))) {
        break forest_join_229;
    }
    spill620_10 = __call620_22((life15_148)[1], ")");
    if (!((life3_5 != null))) {
        forestValue620_174_0 = __integerCategory620_23(spill620_10);
        break forest_join_174;
    }
    if (!(spill620_10)) {
        break forest_join_229;
    }
    spill620_11 = (life15_148)[1];
    if (!((life3_5 != null))) {
        forestValue620_187_0 = spill620_11;
        break forest_join_187;
    }
    forestValue620_174_0 = __call620_24(spill620_11);
    }
    if (!((forestValue620_174_0 > 1))) {
        break forest_join_229;
    }
    forestValue620_187_0 = __call620_26((life15_148)[1], 0, (__call620_25((life15_148)[1]) - 1));
    }
    life17_212 = __call620_27(forestValue620_187_0, " ");
    life18_214 = life17_212;
    life19_217 = (life18_214).length;
    life20_219 = 0;
    forest_cycle_197: while (true) {
    forest_join_227: {
    forest_join_226: {
    if (!((life20_219 < life19_217))) {
        break forest_join_229;
    }
    life21_226 = (life18_214)[life20_219];
    life22_231 = __call620_28(life21_226, "=", 2);
    if (!((life3_5 != null))) {
        break forest_join_227;
    }
    spill620_12 = (life22_231).length;
    spill620_13 = 2;
    if (!((life3_5 != null))) {
        forestValue620_125_0 = spill620_12;
        forestValue620_125_1 = spill620_13;
        continue forest_cycle_125;
    }
    if (!((spill620_12 == spill620_13))) {
        break forest_join_226;
    }
    __call620_29(life16_150, (life22_231)[0], (life22_231)[1]);
    }
    life20_219 += 1;
    }
    if (!((life3_5 == null))) {
        continue forest_cycle_197;
    }
    break forest_cycle_197;
    }
    break forest_cycle_125;
    }
    }
    life13_136 += 1;
    }
    if (!((life3_5 == null))) {
        continue forest_cycle_123;
    }
    break forest_cycle_123;
    }
    }
    if (!((life3_5 == null))) {
        break forest_join_240;
    }
    }
    forestValue620_239_0 = __call620_32(__call620_30(life6_44), "village", __call620_31());
    }
    __discardScalar620_33(forestValue620_239_0);
    }
    return life6_44;
    }
    return __call620_34();
    }
    return __call620_35();
}
public static moom.FG h620_0(moom.Oo p0) throws Throwable {
    throw __call3062000_0(p0);
}
public static moom.FG h620_1(moom.Oo p0) throws Throwable {
    throw __call3062001_0(p0);
}
public static moom.FG h620_2(moom.Oo p0) throws Throwable {
    throw __call3062002_0(p0);
}
public static moom.FG h620_3(moom.Oo p0) throws Throwable {
    throw __call3062003_0(p0);
}
public static moom.FG h620_4(moom.Oo p0) throws Throwable {
    throw __call3062004_0(p0);
}
public static moom.FG h620_5(moom.Oo p0) throws Throwable {
    throw __call3062005_0(p0);
}
public static moom.FG h620_6(moom.Oo p0) throws Throwable {
    throw __call3062006_0(p0);
}
public static moom.FG h620_7(moom.Oo p0) throws Throwable {
    throw __call3062007_0(p0);
}
public static moom.FG h620_8(moom.Oo p0) throws Throwable {
    throw __call3062008_0(p0);
}
public static moom.FG h620_9(moom.Oo p0) throws Throwable {
    throw __call3062009_0(p0);
}
public static moom.FG h620_10(moom.Oo p0) throws Throwable {
    throw __call3062010_0(p0);
}
public static moom.FG h620_11(moom.Oo p0) throws Throwable {
    throw __call3062011_0(p0);
}
public static moom.FG h620_12(moom.Oo p0) throws Throwable {
    throw __call3062012_0(p0);
}
public static moom.FG h620_13(moom.Oo p0) throws Throwable {
    throw __call3062013_0(p0);
}
public static moom.FG h620_14(moom.Oo p0) throws Throwable {
    throw __call3062014_0(p0);
}
public static moom.FG h620_15(moom.Oo p0) throws Throwable {
    throw __call3062015_0(p0);
}
public static moom.FG h620_16(moom.Oo p0) throws Throwable {
    throw __call3062016_0(p0);
}
public static moom.FG h620_17(moom.Oo p0) throws Throwable {
    throw __call3062017_0(p0);
}
public static moom.FG h620_18(moom.Oo p0) throws Throwable {
    throw __call3062018_0(p0);
}
public static moom.FG h620_19(moom.Oo p0) throws Throwable {
    throw __call3062019_0(p0);
}
public static moom.FG h620_20(moom.Oo p0) throws Throwable {
    throw __call3062020_0(p0);
}
public static moom.FG h620_21(moom.Oo p0) throws Throwable {
    throw __call3062021_0(p0);
}
public static moom.FG h620_22(moom.Oo p0) throws Throwable {
    throw __call3062022_0(p0);
}
public static moom.FG h620_23(moom.Oo p0) throws Throwable {
    throw __call3062023_0(p0);
}
public static moom.FG h620_24(moom.Oo p0) throws Throwable {
    throw __call3062024_0(p0);
}
public static moom.FG h620_25(moom.Oo p0) throws Throwable {
    throw __call3062025_0(p0);
}
public static moom.FG h620_26(moom.Oo p0) throws Throwable {
    throw __call3062026_0(p0);
}
public static moom.FG h620_27(moom.Oo p0) throws Throwable {
    throw __call3062027_0(p0);
}
private static native long __fieldRead620_0() throws Throwable;
private static native java.lang.String[] __call620_1() throws Throwable;
private static native moom.FG __call620_2() throws Throwable;
private static native java.lang.String[] __call620_3(java.lang.String a0, java.lang.String a1, int a2) throws Throwable;
private static native int __call620_4(java.lang.String a0, int a1) throws Throwable;
private static native java.util.List __call620_5(int a0, java.lang.String a1) throws Throwable;
private static native boolean __call620_6(java.util.List a0) throws Throwable;
private static native int __integerCategory620_7(boolean value) throws Throwable;
private static native java.util.List __call620_8(moom.FG a0) throws Throwable;
private static native boolean __call620_9(java.util.List a0, java.util.List a1) throws Throwable;
private static native void __call620_10(moom.FG a0) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __fieldRead620_11() throws Throwable;
private static native int __fieldRead620_12(net.minecraft.world.biome.BiomeGenBase a0) throws Throwable;
private static native int __call620_13(java.lang.String a0, int a1) throws Throwable;
private static native void __call620_14(moom.FG a0, int a1) throws Throwable;
private static native java.lang.String __call620_15(java.lang.String a0) throws Throwable;
private static native java.lang.String[] __call620_16(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __call620_17(java.lang.String a0, java.lang.String a1, int a2) throws Throwable;
private static native java.util.HashMap __call620_18() throws Throwable;
private static native int __call620_19(java.lang.String a0) throws Throwable;
private static native java.util.Map __call620_20(moom.FG a0) throws Throwable;
private static native java.lang.Object __call620_21(java.util.Map a0, java.lang.String a1, java.util.HashMap a2) throws Throwable;
private static native boolean __call620_22(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory620_23(boolean value) throws Throwable;
private static native int __call620_24(java.lang.String a0) throws Throwable;
private static native int __call620_25(java.lang.String a0) throws Throwable;
private static native java.lang.String __call620_26(java.lang.String a0, int a1, int a2) throws Throwable;
private static native java.lang.String[] __call620_27(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __call620_28(java.lang.String a0, java.lang.String a1, int a2) throws Throwable;
private static native java.lang.Object __call620_29(java.util.HashMap a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.util.Map __call620_30(moom.FG a0) throws Throwable;
private static native java.util.HashMap __call620_31() throws Throwable;
private static native java.lang.Object __call620_32(java.util.Map a0, java.lang.String a1, java.util.HashMap a2) throws Throwable;
private static native void __discardScalar620_33(java.lang.Object a0) throws Throwable;
private static native moom.FG __call620_34() throws Throwable;
private static native moom.FG __call620_35() throws Throwable;
private static native java.lang.Throwable __call3062000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3062001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3062002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3062003_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3062004_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3062005_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3062006_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3062007_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3062008_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3062009_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3062010_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3062011_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3062012_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3062013_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3062014_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3062015_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3062016_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3062017_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3062018_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3062019_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3062020_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3062021_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3062022_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3062023_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3062024_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3062025_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3062026_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3062027_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_4b949bacc41535f83a91(moom.FG a0) throws E;
private static final class __SourceHandler_4b949bacc41535f83a91 {

public static java.lang.String f160(moom.FG receiver) throws Throwable {
    long life1_3;
    java.lang.StringBuilder life3_7;
    int life4_17;
    int life4_64;
    java.util.Iterator life5_69;
    java.util.Map.Entry life6_76;
    java.util.Map life7_97;
    int life8_106;
    java.util.Iterator life9_110;
    java.util.Map.Entry life10_117;
    life1_3 = (__fieldRead160_0() ^ 37655353924663L);
    life3_7 = new java.lang.StringBuilder();
    __call160_1(life3_7, 3);
    __call160_2(life3_7, ";");
    life4_17 = 0;
    loop_region_18: while ((life4_17 < __call160_4(__fieldRead160_3(receiver)))) {
        if ((life4_17 > 0)) {
        __call160_5(life3_7, ",");
    }
        __call160_10(life3_7, __call160_9(__cast160_8(__call160_7(__fieldRead160_6(receiver), life4_17))));
        life4_17 += 1;
    }
    __call160_11(life3_7, ";");
    __call160_13(life3_7, __fieldRead160_12(receiver));
    if ((!__call160_15(__fieldRead160_14(receiver)))) {
        __call160_16(life3_7, ";");
        life4_64 = 0;
        life5_69 = __call160_19(__call160_18(__fieldRead160_17(receiver)));
        loop_region_64: while (__call160_20(life5_69)) {
        life6_76 = __cast160_22(__call160_21(life5_69));
        if (((life4_64++) > 0)) {
        __call160_23(life3_7, ",");
    }
        __call160_27(life3_7, __call160_26(__cast160_25(__call160_24(life6_76))));
        life7_97 = __cast160_29(__call160_28(life6_76));
        if ((!__call160_30(life7_97))) {
        __call160_31(life3_7, "(");
        life8_106 = 0;
        life9_110 = __call160_33(__call160_32(life7_97));
        loop_region_102: while (__call160_34(life9_110)) {
        life10_117 = __cast160_36(__call160_35(life9_110));
        if (((life8_106++) > 0)) {
        __call160_37(life3_7, " ");
    }
        __call160_40(life3_7, __cast160_39(__call160_38(life10_117)));
        __call160_41(life3_7, "=");
        __call160_44(life3_7, __cast160_43(__call160_42(life10_117)));
    }
        __call160_45(life3_7, ")");
    }
    }
    } else {
        __call160_46(life3_7, ";");
    }
    return __call160_47(life3_7);
}
public static java.lang.String h160_0(moom.Oo p0) throws Throwable {
    throw __call2016000_0(p0);
}
public static java.lang.String h160_1(moom.Oo p0) throws Throwable {
    throw __call2016001_0(p0);
}
public static java.lang.String h160_2(moom.Oo p0) throws Throwable {
    throw __call2016002_0(p0);
}
public static java.lang.String h160_3(moom.Oo p0) throws Throwable {
    throw __call2016003_0(p0);
}
private static native long __fieldRead160_0() throws Throwable;
private static native java.lang.StringBuilder __call160_1(java.lang.StringBuilder a0, int a1) throws Throwable;
private static native java.lang.StringBuilder __call160_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.util.List __fieldRead160_3(moom.FG a0) throws Throwable;
private static native int __call160_4(java.util.List a0) throws Throwable;
private static native java.lang.StringBuilder __call160_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.util.List __fieldRead160_6(moom.FG a0) throws Throwable;
private static native java.lang.Object __call160_7(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.world.gen.FlatLayerInfo __cast160_8(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call160_9(net.minecraft.world.gen.FlatLayerInfo a0) throws Throwable;
private static native java.lang.StringBuilder __call160_10(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call160_11(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native int __fieldRead160_12(moom.FG a0) throws Throwable;
private static native java.lang.StringBuilder __call160_13(java.lang.StringBuilder a0, int a1) throws Throwable;
private static native java.util.Map __fieldRead160_14(moom.FG a0) throws Throwable;
private static native boolean __call160_15(java.util.Map a0) throws Throwable;
private static native java.lang.StringBuilder __call160_16(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead160_17(moom.FG a0) throws Throwable;
private static native java.util.Set __call160_18(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call160_19(java.util.Set a0) throws Throwable;
private static native boolean __call160_20(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call160_21(java.util.Iterator a0) throws Throwable;
private static native java.util.Map.Entry __cast160_22(java.lang.Object a0) throws Throwable;
private static native java.lang.StringBuilder __call160_23(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call160_24(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.String __cast160_25(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call160_26(java.lang.String a0) throws Throwable;
private static native java.lang.StringBuilder __call160_27(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call160_28(java.util.Map.Entry a0) throws Throwable;
private static native java.util.Map __cast160_29(java.lang.Object a0) throws Throwable;
private static native boolean __call160_30(java.util.Map a0) throws Throwable;
private static native java.lang.StringBuilder __call160_31(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.util.Set __call160_32(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call160_33(java.util.Set a0) throws Throwable;
private static native boolean __call160_34(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call160_35(java.util.Iterator a0) throws Throwable;
private static native java.util.Map.Entry __cast160_36(java.lang.Object a0) throws Throwable;
private static native java.lang.StringBuilder __call160_37(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call160_38(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.String __cast160_39(java.lang.Object a0) throws Throwable;
private static native java.lang.StringBuilder __call160_40(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call160_41(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call160_42(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.String __cast160_43(java.lang.Object a0) throws Throwable;
private static native java.lang.StringBuilder __call160_44(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call160_45(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call160_46(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call160_47(java.lang.StringBuilder a0) throws Throwable;
private static native java.lang.Throwable __call2016000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2016001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2016002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2016003_0(moom.Oo a0) throws Throwable;

}


public java.lang.String toString() { return __sourceHandlerCall_4b949bacc41535f83a91(this); }


public static moom.FG a(java.lang.String p0) { return __sourceHandlerCall_4dd0b688dbdc82dfc463(p0); }


public static moom.FG a__FG() {
moom.FG local0 = new moom.FG();
    ((moom.FG)(local0)).a(((int)(((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.s)).aB)));
    ((java.util.List)(((moom.FG)(local0)).a__List())).add(((java.lang.Object)(new net.minecraft.world.gen.FlatLayerInfo(1, net.minecraft.init.Blocks.h))));
    ((java.util.List)(((moom.FG)(local0)).a__List())).add(((java.lang.Object)(new net.minecraft.world.gen.FlatLayerInfo(2, net.minecraft.init.Blocks.d))));
    ((java.util.List)(((moom.FG)(local0)).a__List())).add(((java.lang.Object)(new net.minecraft.world.gen.FlatLayerInfo(1, net.minecraft.init.Blocks.c))));
    ((moom.FG)(local0)).a__Void();
    ((java.util.Map)(((moom.FG)(local0)).a__Map())).put(((java.lang.Object)("village")), ((java.lang.Object)(com.google.common.collect.Maps.newHashMap())));
    return local0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4483_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/FG"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.FG.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 26365;
      if (f[var3] == null) {
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
         long var5 = e[var3];
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
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/FG", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


public java.util.List<net.minecraft.world.gen.FlatLayerInfo> a__List() {
return this.a;
}


public java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> a__Map() {
return this.b;
}


public void a(int p0) {
this.c = ((int)(p0));
    return;
}


public int a() {
return this.c;
}


public void a__Void() {
long local1 = (moom.FG.d ^ 4300638370570L);
    int local3 = 0;
    java.util.Iterator local4 = ((java.util.List)(this.a)).iterator();
    while (((java.util.Iterator)(local4)).hasNext()) {
        net.minecraft.world.gen.FlatLayerInfo local5 = ((net.minecraft.world.gen.FlatLayerInfo)(((java.util.Iterator)(local4)).next()));
        ((net.minecraft.world.gen.FlatLayerInfo)(local5)).a(((int)(local3)));
        local3 = (local3 + ((net.minecraft.world.gen.FlatLayerInfo)(local5)).a());
    }
    return;
}


private static net.minecraft.world.gen.FlatLayerInfo a(int p0, java.lang.String p1, int p2) { return __sourceHandlerCall_57bc47f9c70ab23eceb4(p0, p1, p2); }


private static java.util.List<net.minecraft.world.gen.FlatLayerInfo> a(int p0, java.lang.String p1) { return __sourceHandlerCall_c012b098fda667c379ab(p0, p1); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4483_0() throws E;
}
