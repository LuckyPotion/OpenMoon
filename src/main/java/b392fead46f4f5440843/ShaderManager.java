package net.minecraft.client.shader;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ShaderManager {

private static org.apache.logging.log4j.Logger a;

private static net.minecraft.client.shader.ShaderDefault b;

private static net.minecraft.client.shader.ShaderManager c;

private static int d;

private static boolean e;

private java.util.Map<java.lang.String, java.lang.Object> f;

private java.util.List<java.lang.String> g;

private java.util.List<java.lang.Integer> h;

private java.util.List<net.minecraft.client.shader.ShaderUniform> i;

private java.util.List<java.lang.Integer> j;

private java.util.Map<java.lang.String, net.minecraft.client.shader.ShaderUniform> k;

private int l;

private java.lang.String m;

private boolean n;

private boolean o;

private net.minecraft.client.util.JsonBlendingMode p;

private java.util.List<java.lang.Integer> q;

private java.util.List<java.lang.String> r;

private moom.pE s;

private moom.pE t;

private static long u;

private static long[] v;

private static java.lang.Integer[] w;

private static java.util.Map x;

public ShaderManager(moom.oR p0, java.lang.String p1) throws java.io.IOException { super(); __sourceHandlerCall_cae096020020de480a37(this, p0, p1); }


static {
u = ((long)(((moom._a)(moom._c.a(((long)(1025147105506954245L)), ((long)(-8917305706924052800L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(263295041150206L)))));
    x = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.shader.ShaderManager.u ^ 122692787997984L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1184_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1184_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1184_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1184_14 = new byte[8];
    (__sourceSpill1184_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1184_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1184_16 = __sourceSpill1184_14;
    ((javax.crypto.Cipher)(__sourceSpill1184_11)).init(((int)(__sourceSpill1184_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1184_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1184_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "B~\032Ï\021\034Û\006j«%SP(Qò!Lnô¨"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1184_25 = local6_life21;
        int __sourceSpill1184_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1184_25)).substring(((int)(__sourceSpill1184_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1184_30 = local8_life19;
        int __sourceSpill1184_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1184_33 = new byte[8];
        (__sourceSpill1184_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1184_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1184_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1184_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1184_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1184_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1184_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1184_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1184_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1184_34)).doFinal(((byte[])(__sourceSpill1184_33)));
        (__sourceSpill1184_30)[__sourceSpill1184_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    v = ((long[])(local8_life19));
    w = ((java.lang.Integer[])(new java.lang.Integer[3]));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
    b = ((net.minecraft.client.shader.ShaderDefault)(new net.minecraft.client.shader.ShaderDefault()));
    c = ((net.minecraft.client.shader.ShaderManager)(null));
    d = ((int)(-1));
    e = ((boolean)(true));
}

private static native <E extends Throwable> void __sourceHandlerCall_cae096020020de480a37(net.minecraft.client.shader.ShaderManager a0, moom.oR a1, java.lang.String a2) throws E;
private static final class __SourceHandler_cae096020020de480a37 {

public static void f400023(net.minecraft.client.shader.ShaderManager receiver, moom.oR p0, java.lang.String p1) throws Throwable {
    moom.DD life3_25;
    java.lang.Object life4_30;
    java.io.InputStream life4_35;
    com.google.gson.JsonObject life5_41;
    java.lang.String life6_45;
    java.lang.String life7_49;
    com.google.gson.JsonArray life8_54;
    int life9_58;
    java.util.Iterator life10_61;
    com.google.gson.JsonElement life11_68;
    com.google.gson.JsonArray life9_79;
    int life10_83;
    java.util.Iterator life11_96;
    com.google.gson.JsonElement life12_103;
    com.google.gson.JsonArray life10_125;
    int life11_129;
    java.util.Iterator life12_132;
    com.google.gson.JsonElement life13_139;
    java.util.Iterator life11_186;
    java.lang.String life12_193;
    int life13_198;
    forest_join_203: {
    forest_join_143: {
    forest_join_119: {
    forest_join_113: {
    forest_join_112: {
    forest_join_74: {
    __directSuperInit400023_0(receiver);
    __fieldWrite400023_2(receiver, __call400023_1());
    __fieldWrite400023_4(receiver, __call400023_3());
    __fieldWrite400023_6(receiver, __call400023_5());
    __fieldWrite400023_8(receiver, __call400023_7());
    __fieldWrite400023_10(receiver, __call400023_9());
    __fieldWrite400023_12(receiver, __call400023_11());
    life3_25 = new moom.DD(__invokedynamic400023_13(p1));
    __fieldWrite400023_14(receiver, p1);
    life4_30 = null;
    life4_35 = __call400023_16(__call400023_15(p0, life3_25));
    life5_41 = __call400023_20(__call400023_19(__call400023_18(life4_35, __fieldRead400023_17())));
    life6_45 = __call400023_21(life5_41, "vertex");
    life7_49 = __call400023_22(life5_41, "fragment");
    life8_54 = __call400023_23(life5_41, "samplers", null);
    if (!((life8_54 != null))) {
        break forest_join_74;
    }
    life9_58 = 0;
    life10_61 = __call400023_24(life8_54);
    forest_cycle_62: while (true) {
    if (!(__call400023_25(life10_61))) {
        break forest_join_74;
    }
    life11_68 = __cast400023_27(__call400023_26(life10_61));
    __call400023_28(receiver, life11_68);
    life9_58 += 1;
    continue forest_cycle_62;
    }
    }
    life9_79 = __call400023_29(life5_41, "attributes", null);
    if (!((life9_79 != null))) {
        break forest_join_113;
    }
    life10_83 = 0;
    __fieldWrite400023_32(receiver, __call400023_31(__call400023_30(life9_79)));
    __fieldWrite400023_35(receiver, __call400023_34(__call400023_33(life9_79)));
    life11_96 = __call400023_36(life9_79);
    forest_cycle_96: while (true) {
    if (!(__call400023_37(life11_96))) {
        break forest_join_112;
    }
    life12_103 = __cast400023_39(__call400023_38(life11_96));
    __call400023_42(__fieldRead400023_40(receiver), __call400023_41(life12_103, "attribute"));
    life10_83 += 1;
    continue forest_cycle_96;
    }
    }
    break forest_join_119;
    }
    __fieldWrite400023_43(receiver, null);
    __fieldWrite400023_44(receiver, null);
    }
    life10_125 = __call400023_45(life5_41, "uniforms", null);
    if (!((life10_125 != null))) {
        break forest_join_143;
    }
    life11_129 = 0;
    life12_132 = __call400023_46(life10_125);
    forest_cycle_131: while (true) {
    if (!(__call400023_47(life12_132))) {
        break forest_join_143;
    }
    life13_139 = __cast400023_49(__call400023_48(life12_132));
    __call400023_50(receiver, life13_139);
    life11_129 += 1;
    continue forest_cycle_131;
    }
    }
    __fieldWrite400023_53(receiver, __call400023_52(__call400023_51(life5_41, "blend", null)));
    __fieldWrite400023_55(receiver, __call400023_54(life5_41, "cull", 1));
    __fieldWrite400023_58(receiver, __call400023_57(p0, __fieldRead400023_56(), life6_45));
    __fieldWrite400023_61(receiver, __call400023_60(p0, __fieldRead400023_59(), life7_49));
    __fieldWrite400023_64(receiver, __call400023_63(__call400023_62()));
    __call400023_66(__call400023_65(), receiver);
    __call400023_67(receiver);
    if (!((__fieldRead400023_68(receiver) != null))) {
        break forest_join_203;
    }
    life11_186 = __call400023_70(__fieldRead400023_69(receiver));
    forest_cycle_184: while (true) {
    if (!(__call400023_71(life11_186))) {
        break forest_join_203;
    }
    life12_193 = __cast400023_73(__call400023_72(life11_186));
    life13_198 = __call400023_75(__fieldRead400023_74(receiver), life12_193);
    __call400023_78(__fieldRead400023_76(receiver), __call400023_77(life13_198));
    continue forest_cycle_184;
    }
    }
    __call400023_79(life4_35);
    __call400023_80(receiver);
    return;
}
public static void h400023_0(java.lang.Exception p0, int p1) throws Throwable {
    java.lang.Exception life2_2;
    moom.D life3_5;
    life2_2 = p0;
    life3_5 = __call43002300_0(life2_2);
    __call43002300_2(life3_5, __invokedynamic43002300_1(p1));
    throw life3_5;
}
public static void h400023_1(java.lang.Exception p0, int p1) throws Throwable {
    java.lang.Exception life2_2;
    moom.D life3_5;
    life2_2 = p0;
    life3_5 = __call43002301_0(life2_2);
    __call43002301_2(life3_5, __invokedynamic43002301_1(p1));
    throw life3_5;
}
public static void h400023_2(java.lang.Exception p0, int p1) throws Throwable {
    java.lang.Exception life2_2;
    moom.D life3_5;
    life2_2 = p0;
    life3_5 = __call43002302_0(life2_2);
    __call43002302_2(life3_5, __invokedynamic43002302_1(p1));
    throw life3_5;
}
public static void h400023_3(java.lang.Exception p0, moom.DD p1) throws Throwable {
    java.lang.Exception life2_2;
    moom.D life3_5;
    life2_2 = p0;
    life3_5 = __call43002303_0(life2_2);
    __call43002303_2(life3_5, __call43002303_1(p1));
    throw life3_5;
}
public static void h400023_4(java.lang.Throwable p0, java.io.InputStream p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call43002304_0(p1);
    throw life2_2;
}
private static native void __directSuperInit400023_0(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native java.util.HashMap __call400023_1() throws Throwable;
private static native void __fieldWrite400023_2(net.minecraft.client.shader.ShaderManager a0, java.util.HashMap a1) throws Throwable;
private static native java.util.ArrayList __call400023_3() throws Throwable;
private static native void __fieldWrite400023_4(net.minecraft.client.shader.ShaderManager a0, java.util.ArrayList a1) throws Throwable;
private static native java.util.ArrayList __call400023_5() throws Throwable;
private static native void __fieldWrite400023_6(net.minecraft.client.shader.ShaderManager a0, java.util.ArrayList a1) throws Throwable;
private static native java.util.ArrayList __call400023_7() throws Throwable;
private static native void __fieldWrite400023_8(net.minecraft.client.shader.ShaderManager a0, java.util.ArrayList a1) throws Throwable;
private static native java.util.ArrayList __call400023_9() throws Throwable;
private static native void __fieldWrite400023_10(net.minecraft.client.shader.ShaderManager a0, java.util.ArrayList a1) throws Throwable;
private static native java.util.HashMap __call400023_11() throws Throwable;
private static native void __fieldWrite400023_12(net.minecraft.client.shader.ShaderManager a0, java.util.HashMap a1) throws Throwable;
private static native java.lang.String __invokedynamic400023_13(java.lang.String a0) throws Throwable;
private static native void __fieldWrite400023_14(net.minecraft.client.shader.ShaderManager a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.resources.IResource __call400023_15(moom.oR a0, moom.DD a1) throws Throwable;
private static native java.io.InputStream __call400023_16(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native java.nio.charset.Charset __fieldRead400023_17() throws Throwable;
private static native java.lang.String __call400023_18(java.io.InputStream a0, java.nio.charset.Charset a1) throws Throwable;
private static native com.google.gson.JsonElement __call400023_19(java.lang.String a0) throws Throwable;
private static native com.google.gson.JsonObject __call400023_20(com.google.gson.JsonElement a0) throws Throwable;
private static native java.lang.String __call400023_21(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call400023_22(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native com.google.gson.JsonArray __call400023_23(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Object a2) throws Throwable;
private static native java.util.Iterator __call400023_24(com.google.gson.JsonArray a0) throws Throwable;
private static native boolean __call400023_25(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call400023_26(java.util.Iterator a0) throws Throwable;
private static native com.google.gson.JsonElement __cast400023_27(java.lang.Object a0) throws Throwable;
private static native void __call400023_28(net.minecraft.client.shader.ShaderManager a0, com.google.gson.JsonElement a1) throws Throwable;
private static native com.google.gson.JsonArray __call400023_29(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Object a2) throws Throwable;
private static native int __call400023_30(com.google.gson.JsonArray a0) throws Throwable;
private static native java.util.ArrayList __call400023_31(int a0) throws Throwable;
private static native void __fieldWrite400023_32(net.minecraft.client.shader.ShaderManager a0, java.util.ArrayList a1) throws Throwable;
private static native int __call400023_33(com.google.gson.JsonArray a0) throws Throwable;
private static native java.util.ArrayList __call400023_34(int a0) throws Throwable;
private static native void __fieldWrite400023_35(net.minecraft.client.shader.ShaderManager a0, java.util.ArrayList a1) throws Throwable;
private static native java.util.Iterator __call400023_36(com.google.gson.JsonArray a0) throws Throwable;
private static native boolean __call400023_37(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call400023_38(java.util.Iterator a0) throws Throwable;
private static native com.google.gson.JsonElement __cast400023_39(java.lang.Object a0) throws Throwable;
private static native java.util.List __fieldRead400023_40(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native java.lang.String __call400023_41(com.google.gson.JsonElement a0, java.lang.String a1) throws Throwable;
private static native boolean __call400023_42(java.util.List a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite400023_43(net.minecraft.client.shader.ShaderManager a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite400023_44(net.minecraft.client.shader.ShaderManager a0, java.lang.Object a1) throws Throwable;
private static native com.google.gson.JsonArray __call400023_45(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Object a2) throws Throwable;
private static native java.util.Iterator __call400023_46(com.google.gson.JsonArray a0) throws Throwable;
private static native boolean __call400023_47(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call400023_48(java.util.Iterator a0) throws Throwable;
private static native com.google.gson.JsonElement __cast400023_49(java.lang.Object a0) throws Throwable;
private static native void __call400023_50(net.minecraft.client.shader.ShaderManager a0, com.google.gson.JsonElement a1) throws Throwable;
private static native com.google.gson.JsonObject __call400023_51(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Object a2) throws Throwable;
private static native net.minecraft.client.util.JsonBlendingMode __call400023_52(com.google.gson.JsonObject a0) throws Throwable;
private static native void __fieldWrite400023_53(net.minecraft.client.shader.ShaderManager a0, net.minecraft.client.util.JsonBlendingMode a1) throws Throwable;
private static native boolean __call400023_54(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite400023_55(net.minecraft.client.shader.ShaderManager a0, boolean a1) throws Throwable;
private static native net.minecraft.client.shader.ShaderLoader$ShaderType __fieldRead400023_56() throws Throwable;
private static native moom.pE __call400023_57(moom.oR a0, net.minecraft.client.shader.ShaderLoader$ShaderType a1, java.lang.String a2) throws Throwable;
private static native void __fieldWrite400023_58(net.minecraft.client.shader.ShaderManager a0, moom.pE a1) throws Throwable;
private static native net.minecraft.client.shader.ShaderLoader$ShaderType __fieldRead400023_59() throws Throwable;
private static native moom.pE __call400023_60(moom.oR a0, net.minecraft.client.shader.ShaderLoader$ShaderType a1, java.lang.String a2) throws Throwable;
private static native void __fieldWrite400023_61(net.minecraft.client.shader.ShaderManager a0, moom.pE a1) throws Throwable;
private static native moom.pD __call400023_62() throws Throwable;
private static native int __call400023_63(moom.pD a0) throws Throwable;
private static native void __fieldWrite400023_64(net.minecraft.client.shader.ShaderManager a0, int a1) throws Throwable;
private static native moom.pD __call400023_65() throws Throwable;
private static native void __call400023_66(moom.pD a0, net.minecraft.client.shader.ShaderManager a1) throws Throwable;
private static native void __call400023_67(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native java.util.List __fieldRead400023_68(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native java.util.List __fieldRead400023_69(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native java.util.Iterator __call400023_70(java.util.List a0) throws Throwable;
private static native boolean __call400023_71(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call400023_72(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast400023_73(java.lang.Object a0) throws Throwable;
private static native int __fieldRead400023_74(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native int __call400023_75(int a0, java.lang.String a1) throws Throwable;
private static native java.util.List __fieldRead400023_76(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native java.lang.Integer __call400023_77(int a0) throws Throwable;
private static native boolean __call400023_78(java.util.List a0, java.lang.Integer a1) throws Throwable;
private static native void __call400023_79(java.io.InputStream a0) throws Throwable;
private static native void __call400023_80(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native moom.D __call43002300_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __invokedynamic43002300_1(int a0) throws Throwable;
private static native void __call43002300_2(moom.D a0, java.lang.String a1) throws Throwable;
private static native moom.D __call43002301_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __invokedynamic43002301_1(int a0) throws Throwable;
private static native void __call43002301_2(moom.D a0, java.lang.String a1) throws Throwable;
private static native moom.D __call43002302_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __invokedynamic43002302_1(int a0) throws Throwable;
private static native void __call43002302_2(moom.D a0, java.lang.String a1) throws Throwable;
private static native moom.D __call43002303_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __call43002303_1(moom.DD a0) throws Throwable;
private static native void __call43002303_2(moom.D a0, java.lang.String a1) throws Throwable;
private static native void __call43002304_0(java.io.InputStream a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_908d77e294d72f44f590(net.minecraft.client.shader.ShaderManager a0, com.google.gson.JsonElement a1) throws E;
private static final class __SourceHandler_908d77e294d72f44f590 {

public static void f2676(net.minecraft.client.shader.ShaderManager receiver, com.google.gson.JsonElement p0) throws Throwable {
    com.google.gson.JsonObject life2_3;
    java.lang.String life3_7;
    life2_3 = __call2676_0(p0, "sampler");
    life3_7 = __call2676_1(life2_3, "name");
    if ((!__call2676_2(life2_3, "file"))) {
        __call2676_4(__fieldRead2676_3(receiver), life3_7, null);
        __call2676_6(__fieldRead2676_5(receiver), life3_7);
    } else {
        __call2676_8(__fieldRead2676_7(receiver), life3_7);
    }
    return;
}
public static void h2676_0(moom.D p0) throws Throwable {
    throw __call1267600_0(p0);
}
private static native com.google.gson.JsonObject __call2676_0(com.google.gson.JsonElement a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2676_1(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native boolean __call2676_2(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead2676_3(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native java.lang.Object __call2676_4(java.util.Map a0, java.lang.String a1, java.lang.Object a2) throws Throwable;
private static native java.util.List __fieldRead2676_5(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native boolean __call2676_6(java.util.List a0, java.lang.String a1) throws Throwable;
private static native java.util.List __fieldRead2676_7(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native boolean __call2676_8(java.util.List a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1267600_0(moom.D a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_0307c6c8b6c4781196dc(net.minecraft.client.shader.ShaderManager a0, com.google.gson.JsonElement a1) throws E;
private static final class __SourceHandler_0307c6c8b6c4781196dc {

public static void f636(net.minecraft.client.shader.ShaderManager receiver, com.google.gson.JsonElement p0) throws Throwable {
    int lexicalValue636_106_0;
    long life2_3;
    com.google.gson.JsonObject life4_7;
    java.lang.String life5_11;
    int life6_16;
    int life7_20;
    float[] life8_29;
    com.google.gson.JsonArray life9_33;
    int life10_56;
    java.util.Iterator life11_59;
    com.google.gson.JsonElement life12_66;
    int life11_138;
    net.minecraft.client.shader.ShaderUniform life12_148;
    lexical_join_164: {
    lexical_join_161: {
    lexical_join_139: {
    lexical_join_106: {
    lexical_join_105: {
    lexical_join_88: {
    lexical_join_70: {
    lexical_join_50: {
    life2_3 = (__fieldRead636_0() ^ 89173672117153L);
    life4_7 = __call636_1(p0, "uniform");
    life5_11 = __call636_2(life4_7, "name");
    life6_16 = __call636_4(__call636_3(life4_7, "type"));
    life7_20 = __call636_5(life4_7, "count");
    life8_29 = new float[__call636_7(life7_20, __invokedynamic636_6(13528, (3362069767987125571L ^ life2_3)))];
    life9_33 = __call636_8(life4_7, "values");
    if (!((__call636_9(life9_33) != life7_20))) {
        break lexical_join_50;
    }
    if (!((__call636_10(life9_33) > 1))) {
        break lexical_join_50;
    }
    throw new moom.D(__invokedynamic636_12(life7_20, __call636_11(life9_33)));
    }
    life10_56 = 0;
    life11_59 = __call636_13(life9_33);
    lexical_cycle_55: while (true) {
    if (!(__call636_14(life11_59))) {
        break lexical_join_70;
    }
    life12_66 = __cast636_16(__call636_15(life11_59));
    (life8_29)[life10_56] = __call636_17(life12_66, "value");
    life10_56 += 1;
    continue lexical_cycle_55;
    }
    }
    if (!((life7_20 > 1))) {
        break lexical_join_88;
    }
    if (!((__call636_18(life9_33) == 1))) {
        break lexical_join_88;
    }
    lexical_cycle_77: while (true) {
    if (!((life10_56 < life7_20))) {
        break lexical_join_88;
    }
    (life8_29)[life10_56] = (life8_29)[0];
    life10_56 += 1;
    continue lexical_cycle_77;
    }
    }
    if (!((life7_20 > 1))) {
        break lexical_join_105;
    }
    if (!((life7_20 <= 4))) {
        break lexical_join_105;
    }
    if (!((life6_16 < __invokedynamic636_19(27703, (8761998557673883054L ^ life2_3))))) {
        break lexical_join_105;
    }
    lexicalValue636_106_0 = (life7_20 - 1);
    break lexical_join_106;
    }
    lexicalValue636_106_0 = 0;
    }
    life11_138 = lexicalValue636_106_0;
    life12_148 = new net.minecraft.client.shader.ShaderUniform(life5_11, (life6_16 + life11_138), life7_20, receiver);
    if (!((life6_16 <= 3))) {
        break lexical_join_139;
    }
    __call636_20(life12_148, ((int) (life8_29)[0]), ((int) (life8_29)[1]), ((int) (life8_29)[2]), ((int) (life8_29)[3]));
    break lexical_join_164;
    }
    if (!((life6_16 <= __invokedynamic636_21(28304, (6922920594231297802L ^ life2_3))))) {
        break lexical_join_161;
    }
    __call636_22(life12_148, (life8_29)[0], (life8_29)[1], (life8_29)[2], (life8_29)[3]);
    break lexical_join_164;
    }
    __call636_23(life12_148, life8_29);
    }
    __call636_25(__fieldRead636_24(receiver), life12_148);
    return;
}
public static void h636_0(java.lang.Exception p0) throws Throwable {
    throw __call2063600_0(p0);
}
public static void h636_1(java.lang.Exception p0) throws Throwable {
    throw __call2063601_0(p0);
}
public static void h636_2(java.lang.Exception p0, int p1) throws Throwable {
    java.lang.Exception local2 = p0;
    moom.D local3 = __call2063602_0(local2);
    __call2063602_2(local3, __invokedynamic2063602_1(p1));
    throw local3;
}
public static void h636_3(java.lang.Exception p0) throws Throwable {
    throw __call2063603_0(p0);
}
public static void h636_4(java.lang.Exception p0) throws Throwable {
    throw __call2063604_0(p0);
}
public static void h636_5(java.lang.Exception p0) throws Throwable {
    throw __call2063605_0(p0);
}
public static void h636_6(java.lang.Exception p0) throws Throwable {
    throw __call2063606_0(p0);
}
public static void h636_7(java.lang.Exception p0) throws Throwable {
    throw __call2063607_0(p0);
}
public static void h636_8(java.lang.Exception p0) throws Throwable {
    throw __call2063608_0(p0);
}
public static void h636_9(java.lang.Exception p0) throws Throwable {
    throw __call2063609_0(p0);
}
public static void h636_10(java.lang.Exception p0) throws Throwable {
    throw __call2063610_0(p0);
}
private static native long __fieldRead636_0() throws Throwable;
private static native com.google.gson.JsonObject __call636_1(com.google.gson.JsonElement a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call636_2(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call636_3(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native int __call636_4(java.lang.String a0) throws Throwable;
private static native int __call636_5(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic636_6(int a0, long a1) throws Throwable;
private static native int __call636_7(int a0, int a1) throws Throwable;
private static native com.google.gson.JsonArray __call636_8(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native int __call636_9(com.google.gson.JsonArray a0) throws Throwable;
private static native int __call636_10(com.google.gson.JsonArray a0) throws Throwable;
private static native int __call636_11(com.google.gson.JsonArray a0) throws Throwable;
private static native java.lang.String __invokedynamic636_12(int a0, int a1) throws Throwable;
private static native java.util.Iterator __call636_13(com.google.gson.JsonArray a0) throws Throwable;
private static native boolean __call636_14(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call636_15(java.util.Iterator a0) throws Throwable;
private static native com.google.gson.JsonElement __cast636_16(java.lang.Object a0) throws Throwable;
private static native float __call636_17(com.google.gson.JsonElement a0, java.lang.String a1) throws Throwable;
private static native int __call636_18(com.google.gson.JsonArray a0) throws Throwable;
private static native int __invokedynamic636_19(int a0, long a1) throws Throwable;
private static native void __call636_20(net.minecraft.client.shader.ShaderUniform a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native int __invokedynamic636_21(int a0, long a1) throws Throwable;
private static native void __call636_22(net.minecraft.client.shader.ShaderUniform a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native void __call636_23(net.minecraft.client.shader.ShaderUniform a0, float[] a1) throws Throwable;
private static native java.util.List __fieldRead636_24(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native boolean __call636_25(java.util.List a0, net.minecraft.client.shader.ShaderUniform a1) throws Throwable;
private static native java.lang.Exception __call2063600_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2063601_0(java.lang.Exception a0) throws Throwable;
private static native moom.D __call2063602_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __invokedynamic2063602_1(int a0) throws Throwable;
private static native void __call2063602_2(moom.D a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call2063603_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2063604_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2063605_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2063606_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2063607_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2063608_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2063609_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2063610_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_228adb82e193eccd160b(net.minecraft.client.shader.ShaderManager a0) throws E;
private static final class __SourceHandler_228adb82e193eccd160b {

public static void f2678(net.minecraft.client.shader.ShaderManager receiver) throws Throwable {
    int life1_9;
    __call2678_0(0);
    __fieldWrite2678_1(-1);
    __fieldWrite2678_2(null);
    __fieldWrite2678_3(1);
    life1_9 = 0;
    loop_region_10: while ((life1_9 < __call2678_5(__fieldRead2678_4(receiver)))) {
        if ((__call2678_9(__fieldRead2678_6(receiver), __call2678_8(__fieldRead2678_7(receiver), life1_9)) != null)) {
        __call2678_11((__fieldRead2678_10() + life1_9));
        __call2678_12(0);
    }
        life1_9 += 1;
    }
    return;
}
public static void h2678_0(moom.Oo p0) throws Throwable {
    throw __call1267800_0(p0);
}
public static void h2678_1(moom.Oo p0) throws Throwable {
    throw __call1267801_0(p0);
}
private static native void __call2678_0(int a0) throws Throwable;
private static native void __fieldWrite2678_1(int a0) throws Throwable;
private static native void __fieldWrite2678_2(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite2678_3(int a0) throws Throwable;
private static native java.util.List __fieldRead2678_4(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native int __call2678_5(java.util.List a0) throws Throwable;
private static native java.util.Map __fieldRead2678_6(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native java.util.List __fieldRead2678_7(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native java.lang.Object __call2678_8(java.util.List a0, int a1) throws Throwable;
private static native java.lang.Object __call2678_9(java.util.Map a0, java.lang.Object a1) throws Throwable;
private static native int __fieldRead2678_10() throws Throwable;
private static native void __call2678_11(int a0) throws Throwable;
private static native void __call2678_12(int a0) throws Throwable;
private static native java.lang.Exception __call1267800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1267801_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c0bd5f13a0c00ba7a36a(net.minecraft.client.shader.ShaderManager a0) throws E;
private static final class __SourceHandler_c0bd5f13a0c00ba7a36a {

public static void f2679(net.minecraft.client.shader.ShaderManager receiver) throws Throwable {
    int life1_30;
    java.lang.Object life2_59;
    int life3_61;
    java.util.Iterator life1_108;
    net.minecraft.client.shader.ShaderUniform life2_115;
    __fieldWrite2679_0(receiver, 0);
    __fieldWrite2679_1(receiver);
    __call2679_3(__fieldRead2679_2(receiver));
    if ((__fieldRead2679_4(receiver) != __fieldRead2679_5())) {
        __call2679_7(__fieldRead2679_6(receiver));
        __fieldWrite2679_9(__fieldRead2679_8(receiver));
    }
    if (__fieldRead2679_10(receiver)) {
        __call2679_11();
    } else {
        __call2679_12();
    }
    life1_30 = 0;
    loop_region_26: while ((life1_30 < __call2679_14(__fieldRead2679_13(receiver)))) {
        if ((__call2679_18(__fieldRead2679_15(receiver), __call2679_17(__fieldRead2679_16(receiver), life1_30)) != null)) {
        __call2679_20((__fieldRead2679_19() + life1_30));
        __call2679_21();
        life2_59 = __call2679_25(__fieldRead2679_22(receiver), __call2679_24(__fieldRead2679_23(receiver), life1_30));
        life3_61 = -1;
        if ((__instanceOf2679_26(life2_59) != 0)) {
        life3_61 = __fieldRead2679_28(__cast2679_27(life2_59));
    } else {
        if ((__instanceOf2679_29(life2_59) != 0)) {
        life3_61 = __call2679_31(__cast2679_30(life2_59));
    } else {
        if ((__instanceOf2679_32(life2_59) != 0)) {
        life3_61 = __call2679_34(__cast2679_33(life2_59));
    }
    }
    }
        if ((life3_61 != -1)) {
        __call2679_35(life3_61);
        __call2679_41(__call2679_40(__fieldRead2679_36(receiver), __cast2679_39(__call2679_38(__fieldRead2679_37(receiver), life1_30))), life1_30);
    }
    }
        life1_30 += 1;
    }
    life1_108 = __call2679_43(__fieldRead2679_42(receiver));
    loop_region_98: while (__call2679_44(life1_108)) {
        life2_115 = __cast2679_46(__call2679_45(life1_108));
        __call2679_47(life2_115);
    }
    return;
}
public static void h2679_0(moom.Oo p0) throws Throwable {
    throw __call1267900_0(p0);
}
public static void h2679_1(moom.Oo p0) throws Throwable {
    throw __call1267901_0(p0);
}
public static void h2679_2(moom.Oo p0) throws Throwable {
    throw __call1267902_0(p0);
}
public static void h2679_3(moom.Oo p0) throws Throwable {
    throw __call1267903_0(p0);
}
private static native void __fieldWrite2679_0(net.minecraft.client.shader.ShaderManager a0, int a1) throws Throwable;
private static native void __fieldWrite2679_1(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native net.minecraft.client.util.JsonBlendingMode __fieldRead2679_2(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native void __call2679_3(net.minecraft.client.util.JsonBlendingMode a0) throws Throwable;
private static native int __fieldRead2679_4(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native int __fieldRead2679_5() throws Throwable;
private static native int __fieldRead2679_6(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native void __call2679_7(int a0) throws Throwable;
private static native int __fieldRead2679_8(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native void __fieldWrite2679_9(int a0) throws Throwable;
private static native boolean __fieldRead2679_10(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native void __call2679_11() throws Throwable;
private static native void __call2679_12() throws Throwable;
private static native java.util.List __fieldRead2679_13(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native int __call2679_14(java.util.List a0) throws Throwable;
private static native java.util.Map __fieldRead2679_15(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native java.util.List __fieldRead2679_16(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native java.lang.Object __call2679_17(java.util.List a0, int a1) throws Throwable;
private static native java.lang.Object __call2679_18(java.util.Map a0, java.lang.Object a1) throws Throwable;
private static native int __fieldRead2679_19() throws Throwable;
private static native void __call2679_20(int a0) throws Throwable;
private static native void __call2679_21() throws Throwable;
private static native java.util.Map __fieldRead2679_22(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native java.util.List __fieldRead2679_23(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native java.lang.Object __call2679_24(java.util.List a0, int a1) throws Throwable;
private static native java.lang.Object __call2679_25(java.util.Map a0, java.lang.Object a1) throws Throwable;
private static native int __instanceOf2679_26(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.shader.Framebuffer __cast2679_27(java.lang.Object a0) throws Throwable;
private static native int __fieldRead2679_28(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native int __instanceOf2679_29(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.ITextureObject __cast2679_30(java.lang.Object a0) throws Throwable;
private static native int __call2679_31(net.minecraft.client.renderer.texture.ITextureObject a0) throws Throwable;
private static native int __instanceOf2679_32(java.lang.Object a0) throws Throwable;
private static native java.lang.Integer __cast2679_33(java.lang.Object a0) throws Throwable;
private static native int __call2679_34(java.lang.Integer a0) throws Throwable;
private static native void __call2679_35(int a0) throws Throwable;
private static native int __fieldRead2679_36(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native java.util.List __fieldRead2679_37(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native java.lang.Object __call2679_38(java.util.List a0, int a1) throws Throwable;
private static native java.lang.CharSequence __cast2679_39(java.lang.Object a0) throws Throwable;
private static native int __call2679_40(int a0, java.lang.CharSequence a1) throws Throwable;
private static native void __call2679_41(int a0, int a1) throws Throwable;
private static native java.util.List __fieldRead2679_42(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native java.util.Iterator __call2679_43(java.util.List a0) throws Throwable;
private static native boolean __call2679_44(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call2679_45(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.shader.ShaderUniform __cast2679_46(java.lang.Object a0) throws Throwable;
private static native void __call2679_47(net.minecraft.client.shader.ShaderUniform a0) throws Throwable;
private static native java.lang.Exception __call1267900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1267901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1267902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1267903_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d2b3d67cf94a23af52a8(net.minecraft.client.shader.ShaderManager a0) throws E;
private static final class __SourceHandler_d2b3d67cf94a23af52a8 {

public static void f900222(net.minecraft.client.shader.ShaderManager receiver) throws Throwable {
    int life1_1;
    int life2_3;
    java.lang.String life3_16;
    int life4_21;
    java.util.Iterator life2_57;
    net.minecraft.client.shader.ShaderUniform life3_66;
    java.lang.String life4_69;
    int life5_74;
    forest_join_93: {
    forest_join_50: {
    life1_1 = 0;
    life2_3 = 0;
    forest_cycle_4: while (true) {
    forest_join_47: {
    forest_join_41: {
    if (!((life1_1 < __call900222_1(__fieldRead900222_0(receiver))))) {
        break forest_join_50;
    }
    life3_16 = __cast900222_4(__call900222_3(__fieldRead900222_2(receiver), life1_1));
    life4_21 = __call900222_6(__fieldRead900222_5(receiver), life3_16);
    if (!((life4_21 == -1))) {
        break forest_join_41;
    }
    __call900222_10(__fieldRead900222_7(), __invokedynamic900222_9(__fieldRead900222_8(receiver), life3_16));
    __call900222_12(__fieldRead900222_11(receiver), life3_16);
    __call900222_14(__fieldRead900222_13(receiver), life2_3);
    life2_3 += -1;
    break forest_join_47;
    }
    __call900222_17(__fieldRead900222_15(receiver), __call900222_16(life4_21));
    }
    life1_1 += 1;
    life2_3 += 1;
    continue forest_cycle_4;
    }
    }
    life2_57 = __call900222_19(__fieldRead900222_18(receiver));
    forest_cycle_54: while (true) {
    forest_join_92: {
    forest_join_77: {
    if (!(__call900222_20(life2_57))) {
        break forest_join_93;
    }
    life3_66 = __cast900222_22(__call900222_21(life2_57));
    life4_69 = __call900222_23(life3_66);
    life5_74 = __call900222_25(__fieldRead900222_24(receiver), life4_69);
    if (!((life5_74 == -1))) {
        break forest_join_77;
    }
    __call900222_28(__fieldRead900222_26(), __invokedynamic900222_27(life4_69));
    break forest_join_92;
    }
    __call900222_31(__fieldRead900222_29(receiver), __call900222_30(life5_74));
    __call900222_32(life3_66, life5_74);
    __call900222_34(__fieldRead900222_33(receiver), life4_69, life3_66);
    }
    continue forest_cycle_54;
    }
    }
    return;
}
public static void h900222_0(moom.Oo p0) throws Throwable {
    throw __call93022200_0(p0);
}
public static void h900222_1(moom.Oo p0) throws Throwable {
    throw __call93022201_0(p0);
}
private static native java.util.List __fieldRead900222_0(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native int __call900222_1(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead900222_2(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native java.lang.Object __call900222_3(java.util.List a0, int a1) throws Throwable;
private static native java.lang.String __cast900222_4(java.lang.Object a0) throws Throwable;
private static native int __fieldRead900222_5(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native int __call900222_6(int a0, java.lang.String a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead900222_7() throws Throwable;
private static native java.lang.String __fieldRead900222_8(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native java.lang.String __invokedynamic900222_9(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call900222_10(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead900222_11(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native java.lang.Object __call900222_12(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.util.List __fieldRead900222_13(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native java.lang.Object __call900222_14(java.util.List a0, int a1) throws Throwable;
private static native java.util.List __fieldRead900222_15(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native java.lang.Integer __call900222_16(int a0) throws Throwable;
private static native boolean __call900222_17(java.util.List a0, java.lang.Integer a1) throws Throwable;
private static native java.util.List __fieldRead900222_18(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native java.util.Iterator __call900222_19(java.util.List a0) throws Throwable;
private static native boolean __call900222_20(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call900222_21(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.shader.ShaderUniform __cast900222_22(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call900222_23(net.minecraft.client.shader.ShaderUniform a0) throws Throwable;
private static native int __fieldRead900222_24(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native int __call900222_25(int a0, java.lang.String a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead900222_26() throws Throwable;
private static native java.lang.String __invokedynamic900222_27(java.lang.String a0) throws Throwable;
private static native void __call900222_28(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.util.List __fieldRead900222_29(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native java.lang.Integer __call900222_30(int a0) throws Throwable;
private static native boolean __call900222_31(java.util.List a0, java.lang.Integer a1) throws Throwable;
private static native void __call900222_32(net.minecraft.client.shader.ShaderUniform a0, int a1) throws Throwable;
private static native java.util.Map __fieldRead900222_33(net.minecraft.client.shader.ShaderManager a0) throws Throwable;
private static native java.lang.Object __call900222_34(java.util.Map a0, java.lang.String a1, net.minecraft.client.shader.ShaderUniform a2) throws Throwable;
private static native java.lang.Exception __call93022200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call93022201_0(moom.Oo a0) throws Throwable;

}


public net.minecraft.client.shader.ShaderUniform b(java.lang.String p0) {
return ((net.minecraft.client.shader.ShaderUniform)(((java.util.Map)(this.k)).getOrDefault(((java.lang.Object)(p0)), ((java.lang.Object)(net.minecraft.client.shader.ShaderManager.b)))));
}


private void b(com.google.gson.JsonElement p0) throws moom.D { __sourceHandlerCall_0307c6c8b6c4781196dc(this, p0); }


public moom.pE b() {
return this.t;
}


public void b__Void() { __sourceHandlerCall_228adb82e193eccd160b(this); }


private void e() { __sourceHandlerCall_d2b3d67cf94a23af52a8(this); }


public void c() { __sourceHandlerCall_c0bd5f13a0c00ba7a36a(this); }


public void d() {
this.o = ((boolean)(true));
    return;
}


public int a() {
return this.l;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10987_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/pF"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.shader.ShaderManager.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 4930;
      if (w[var3] == null) {
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
         long var5 = v[var3];
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
         Object[] var9 = (Object[])x.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               x.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/pF", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         w[var3] = var15;
      }

      return w[var3];
}


public void a__Void() {
((moom.pD)(moom.pD.a__pD())).a(((net.minecraft.client.shader.ShaderManager)(this)));
    return;
}


public net.minecraft.client.shader.ShaderUniform a(java.lang.String p0) {
return ((net.minecraft.client.shader.ShaderUniform)(((java.util.Map)(this.k)).getOrDefault(((java.lang.Object)(p0)), ((java.lang.Object)(null)))));
}


private void a(com.google.gson.JsonElement p0) throws moom.D { __sourceHandlerCall_908d77e294d72f44f590(this, p0); }


public void a(java.lang.String p0, java.lang.Object p1) {
((java.util.Map)(this.f)).remove(((java.lang.Object)(p0)));
    ((java.util.Map)(this.f)).put(((java.lang.Object)(p0)), ((java.lang.Object)(p1)));
    ((net.minecraft.client.shader.ShaderManager)(this)).d();
    return;
}


public moom.pE a__pE() {
return this.s;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10987_0() throws E;
}
