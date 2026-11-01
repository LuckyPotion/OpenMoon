package moom;


public class pb extends moom.pa<net.minecraft.client.resources.data.AnimationMetadataSection> implements com.google.gson.JsonSerializer<net.minecraft.client.resources.data.AnimationMetadataSection> {

private static long a;

private static long[] c;

private static java.lang.Long[] d;

private static java.util.Map e;

public pb() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(192403129875128396L)), ((long)(-356273447597174272L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(74664148866239L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.pb.a ^ 99466268275712L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill965_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill965_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill965_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill965_14 = new byte[8];
    (__sourceSpill965_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill965_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation965_16 = __sourceSpill965_14;
    ((javax.crypto.Cipher)(__sourceSpill965_11)).init(((int)(__sourceSpill965_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill965_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation965_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ßÁÿÉSv9\020Á=Ü¦Üå\035"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill965_25 = local6_life21;
        int __sourceSpill965_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill965_25)).substring(((int)(__sourceSpill965_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill965_30 = local8_life19;
        int __sourceSpill965_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill965_33 = new byte[8];
        (__sourceSpill965_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill965_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill965_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill965_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill965_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill965_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill965_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill965_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill965_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill965_34)).doFinal(((byte[])(__sourceSpill965_33)));
        (__sourceSpill965_30)[__sourceSpill965_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    c = ((long[])(local8_life19));
    d = ((java.lang.Long[])(new java.lang.Long[2]));
}

private static native <E extends Throwable> net.minecraft.client.resources.data.AnimationMetadataSection __sourceHandlerCall_a5bc0a6fbc29619d5927(moom.pb a0, com.google.gson.JsonElement a1, java.lang.reflect.Type a2, com.google.gson.JsonDeserializationContext a3) throws E;
private static final class __SourceHandler_a5bc0a6fbc29619d5927 {

public static net.minecraft.client.resources.data.AnimationMetadataSection f434(moom.pb receiver, com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws Throwable {
    int lexicalValue434_35_0;
    int lexicalValue434_77_0;
    int lexicalValue434_102_0;
    int lexicalValue434_102_1;
    int lexicalValue434_117_0;
    int spill434_0;
    int spill434_1;
    int spill434_2;
    int spill434_3;
    int spill434_4;
    long life4_3;
    java.util.ArrayList life7_6;
    int life6_7;
    com.google.gson.JsonObject life8_11;
    int life9_16;
    com.google.gson.JsonArray life10_50;
    int life11_52;
    com.google.gson.JsonElement life12_60;
    moom.o9 life13_65;
    int life10_106;
    int life11_111;
    int life12_158;
    lexical_join_117: {
    lexical_join_113: {
    lexical_join_102: {
    lexical_join_98: {
    lexical_join_77: {
    lexical_join_73: {
    lexical_join_35: {
    lexical_join_32: {
    life4_3 = (__fieldRead434_0() ^ 134067180327109L);
    spill434_0 = __call434_1();
    life7_6 = __call434_2();
    life6_7 = spill434_0;
    life8_11 = __call434_3(p0, "metadata section");
    life9_16 = __call434_4(life8_11, "frametime", 1);
    spill434_1 = life9_16;
    if (!((life6_7 == 0))) {
        lexicalValue434_35_0 = spill434_1;
        break lexical_join_35;
    }
    if (!((spill434_1 != 1))) {
        break lexical_join_32;
    }
    __call434_6(1L, __invokedynamic434_5(14380, (1416644865868074054L ^ life4_3)), ((long) life9_16), "Invalid default frame time");
    }
    lexicalValue434_35_0 = __integerCategory434_8(__call434_7(life8_11, "frames"));
    }
    if (!((life6_7 == 0))) {
        lexicalValue434_77_0 = lexicalValue434_35_0;
        break lexical_join_77;
    }
    if (!((lexicalValue434_35_0 != 0))) {
        break lexical_join_73;
    }
    life10_50 = __call434_9(life8_11, "frames");
    life11_52 = 0;
    lexical_cycle_44: while (true) {
    lexical_join_68: {
    lexical_join_67: {
    if (!((life11_52 < __call434_10(life10_50)))) {
        break lexical_join_73;
    }
    life12_60 = __call434_11(life10_50, life11_52);
    life13_65 = __call434_12(receiver, life11_52, life12_60);
    if (!((life6_7 == 0))) {
        break lexical_join_73;
    }
    if (!((life6_7 == 0))) {
        break lexical_join_68;
    }
    if (!((life13_65 != null))) {
        break lexical_join_67;
    }
    __call434_13(life7_6, life13_65);
    }
    life11_52 += 1;
    }
    if (!((life6_7 != 0))) { continue lexical_cycle_44; }
    break lexical_cycle_44;
    }
    __call434_14(new java.lang.String[1]);
    }
    lexicalValue434_77_0 = __call434_15(life8_11, "width", -1);
    }
    life10_106 = lexicalValue434_77_0;
    life11_111 = __call434_16(life8_11, "height", -1);
    spill434_2 = life10_106;
    spill434_3 = -1;
    if (!((life6_7 == 0))) {
        lexicalValue434_102_0 = spill434_2;
        lexicalValue434_102_1 = spill434_3;
        break lexical_join_102;
    }
    if (!((spill434_2 != spill434_3))) {
        break lexical_join_98;
    }
    __call434_18(1L, __invokedynamic434_17(14380, (1416644865868074054L ^ life4_3)), ((long) life10_106), "Invalid width");
    }
    spill434_4 = life11_111;
    if (!((life6_7 == 0))) {
        lexicalValue434_117_0 = spill434_4;
        break lexical_join_117;
    }
    lexicalValue434_102_0 = spill434_4;
    lexicalValue434_102_1 = -1;
    }
    if (!((lexicalValue434_102_0 != lexicalValue434_102_1))) {
        break lexical_join_113;
    }
    __call434_20(1L, __invokedynamic434_19(14380, (1416644865868074054L ^ life4_3)), ((long) life11_111), "Invalid height");
    }
    lexicalValue434_117_0 = __integerCategory434_22(__call434_21(life8_11, "interpolate", 0));
    }
    life12_158 = lexicalValue434_117_0;
    return new net.minecraft.client.resources.data.AnimationMetadataSection(life7_6, life10_106, life11_111, life9_16, __integerCategory434_23(life12_158));
}
public static net.minecraft.client.resources.data.AnimationMetadataSection h434_0(java.lang.ClassCastException p0) throws Throwable {
    throw __call2043400_0(p0);
}
public static net.minecraft.client.resources.data.AnimationMetadataSection h434_1(java.lang.ClassCastException p0) throws Throwable {
    throw __call2043401_0(p0);
}
public static net.minecraft.client.resources.data.AnimationMetadataSection h434_2(java.lang.ClassCastException p0) throws Throwable {
    throw __call2043402_0(p0);
}
public static net.minecraft.client.resources.data.AnimationMetadataSection h434_3(java.lang.ClassCastException p0) throws Throwable {
    throw __call2043403_0(p0);
}
public static net.minecraft.client.resources.data.AnimationMetadataSection h434_4(java.lang.ClassCastException p0) throws Throwable {
    throw __call2043404_0(p0);
}
public static net.minecraft.client.resources.data.AnimationMetadataSection h434_5(java.lang.ClassCastException p0) throws Throwable {
    throw __call2043405_0(p0);
}
public static net.minecraft.client.resources.data.AnimationMetadataSection h434_6(java.lang.ClassCastException p0, com.google.gson.JsonObject p1) throws Throwable {
    java.lang.ClassCastException local2 = p0;
    throw new com.google.gson.JsonParseException(__invokedynamic2043406_1(__call2043406_0(p1, "frames")), local2);
}
public static net.minecraft.client.resources.data.AnimationMetadataSection h434_7(java.lang.ClassCastException p0) throws Throwable {
    throw __call2043407_0(p0);
}
public static net.minecraft.client.resources.data.AnimationMetadataSection h434_8(java.lang.ClassCastException p0) throws Throwable {
    throw __call2043408_0(p0);
}
public static net.minecraft.client.resources.data.AnimationMetadataSection h434_9(java.lang.ClassCastException p0) throws Throwable {
    throw __call2043409_0(p0);
}
public static net.minecraft.client.resources.data.AnimationMetadataSection h434_10(java.lang.ClassCastException p0) throws Throwable {
    throw __call2043410_0(p0);
}
private static native long __fieldRead434_0() throws Throwable;
private static native int __call434_1() throws Throwable;
private static native java.util.ArrayList __call434_2() throws Throwable;
private static native com.google.gson.JsonObject __call434_3(com.google.gson.JsonElement a0, java.lang.String a1) throws Throwable;
private static native int __call434_4(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native long __invokedynamic434_5(int a0, long a1) throws Throwable;
private static native void __call434_6(long a0, long a1, long a2, java.lang.String a3) throws Throwable;
private static native boolean __call434_7(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory434_8(boolean value) throws Throwable;
private static native com.google.gson.JsonArray __call434_9(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native int __call434_10(com.google.gson.JsonArray a0) throws Throwable;
private static native com.google.gson.JsonElement __call434_11(com.google.gson.JsonArray a0, int a1) throws Throwable;
private static native moom.o9 __call434_12(moom.pb a0, int a1, com.google.gson.JsonElement a2) throws Throwable;
private static native boolean __call434_13(java.util.ArrayList a0, moom.o9 a1) throws Throwable;
private static native void __call434_14(java.lang.String[] a0) throws Throwable;
private static native int __call434_15(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native int __call434_16(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native long __invokedynamic434_17(int a0, long a1) throws Throwable;
private static native void __call434_18(long a0, long a1, long a2, java.lang.String a3) throws Throwable;
private static native long __invokedynamic434_19(int a0, long a1) throws Throwable;
private static native void __call434_20(long a0, long a1, long a2, java.lang.String a3) throws Throwable;
private static native boolean __call434_21(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory434_22(boolean value) throws Throwable;
private static native boolean __integerCategory434_23(int value) throws Throwable;
private static native java.lang.ClassCastException __call2043400_0(java.lang.ClassCastException a0) throws Throwable;
private static native java.lang.ClassCastException __call2043401_0(java.lang.ClassCastException a0) throws Throwable;
private static native java.lang.ClassCastException __call2043402_0(java.lang.ClassCastException a0) throws Throwable;
private static native java.lang.ClassCastException __call2043403_0(java.lang.ClassCastException a0) throws Throwable;
private static native java.lang.ClassCastException __call2043404_0(java.lang.ClassCastException a0) throws Throwable;
private static native java.lang.ClassCastException __call2043405_0(java.lang.ClassCastException a0) throws Throwable;
private static native com.google.gson.JsonElement __call2043406_0(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic2043406_1(com.google.gson.JsonElement a0) throws Throwable;
private static native java.lang.ClassCastException __call2043407_0(java.lang.ClassCastException a0) throws Throwable;
private static native java.lang.ClassCastException __call2043408_0(java.lang.ClassCastException a0) throws Throwable;
private static native java.lang.ClassCastException __call2043409_0(java.lang.ClassCastException a0) throws Throwable;
private static native java.lang.ClassCastException __call2043410_0(java.lang.ClassCastException a0) throws Throwable;

}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8710_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/pb"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.ClassCastException a(java.lang.ClassCastException p0) {
return p0;
}


private static long a(int p0, long p1) {
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 1705);
    if (((moom.pb.d)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.pb.c)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.pb.e)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.pb.e)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/pb", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.pb.d)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.pb.d)[life3_8])).longValue();
}


private static long a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = __sourceExactCall_8e8dd946ce1e53(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public net.minecraft.client.resources.data.AnimationMetadataSection a(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException { return __sourceHandlerCall_a5bc0a6fbc29619d5927(this, p0, p1, p2); }


public com.google.gson.JsonElement a(net.minecraft.client.resources.data.AnimationMetadataSection p0, java.lang.reflect.Type p1, com.google.gson.JsonSerializationContext p2) {
int lexicalValue1266_33_0;
    int lexicalValue1266_33_1;
    int lexicalValue1266_42_0;
    int spill1266_0;
    int spill1266_1;
    int spill1266_2;
    int spill1266_3;
    long life4_3;
    com.google.gson.JsonObject life7_8;
    int life6_9;
    com.google.gson.JsonArray life8_58;
    int life9_60;
    com.google.gson.JsonObject life10_77;
    lexical_join_98: {
    lexical_join_94: {
    lexical_join_42: {
    lexical_join_40: {
    lexical_join_33: {
    lexical_join_28: {
    life4_3 = (moom.pb.a ^ 74438991729549L);
    spill1266_0 = moom.pa.c();
    life7_8 = new com.google.gson.JsonObject();
    life6_9 = spill1266_0;
    ((com.google.gson.JsonObject)(life7_8)).addProperty(((java.lang.String)("frametime")), ((java.lang.Number)(java.lang.Integer.valueOf(((int)(((net.minecraft.client.resources.data.AnimationMetadataSection)(p0)).d()))))));
    spill1266_1 = ((net.minecraft.client.resources.data.AnimationMetadataSection)(p0)).b();
    spill1266_2 = -1;
    if (!((life6_9 != 0))) {
        lexicalValue1266_33_0 = spill1266_1;
        lexicalValue1266_33_1 = spill1266_2;
        break lexical_join_33;
    }
    if (!((spill1266_1 != spill1266_2))) {
        break lexical_join_28;
    }
    ((com.google.gson.JsonObject)(life7_8)).addProperty(((java.lang.String)("width")), ((java.lang.Number)(java.lang.Integer.valueOf(((int)(((net.minecraft.client.resources.data.AnimationMetadataSection)(p0)).b()))))));
    }
    spill1266_3 = ((net.minecraft.client.resources.data.AnimationMetadataSection)(p0)).a();
    if (!((life6_9 != 0))) {
        lexicalValue1266_42_0 = spill1266_3;
        break lexical_join_42;
    }
    lexicalValue1266_33_0 = spill1266_3;
    lexicalValue1266_33_1 = -1;
    }
    if (!((lexicalValue1266_33_0 != lexicalValue1266_33_1))) {
        break lexical_join_40;
    }
    ((com.google.gson.JsonObject)(life7_8)).addProperty(((java.lang.String)("height")), ((java.lang.Number)(java.lang.Integer.valueOf(((int)(((net.minecraft.client.resources.data.AnimationMetadataSection)(p0)).a()))))));
    }
    lexicalValue1266_42_0 = ((net.minecraft.client.resources.data.AnimationMetadataSection)(p0)).c();
    }
    if (!((lexicalValue1266_42_0 > 0))) {
        break lexical_join_98;
    }
    life8_58 = new com.google.gson.JsonArray();
    life9_60 = 0;
    lexical_cycle_49: while (true) {
    lexical_join_91: {
    lexical_join_82: {
    if (!((life9_60 < ((net.minecraft.client.resources.data.AnimationMetadataSection)(p0)).c()))) {
        break lexical_join_94;
    }
    if (!((life6_9 != 0))) {
        break lexical_join_98;
    }
    if (!(((net.minecraft.client.resources.data.AnimationMetadataSection)(p0)).a__Boolean(((int)(life9_60))))) {
        break lexical_join_82;
    }
    life10_77 = new com.google.gson.JsonObject();
    ((com.google.gson.JsonObject)(life10_77)).addProperty(((java.lang.String)("index")), ((java.lang.Number)(java.lang.Integer.valueOf(((int)(((net.minecraft.client.resources.data.AnimationMetadataSection)(p0)).b(((int)(life9_60)))))))));
    ((com.google.gson.JsonObject)(life10_77)).addProperty(((java.lang.String)("time")), ((java.lang.Number)(java.lang.Integer.valueOf(((int)(((net.minecraft.client.resources.data.AnimationMetadataSection)(p0)).a(((int)(life9_60)))))))));
    ((com.google.gson.JsonArray)(life8_58)).add(((com.google.gson.JsonElement)(life10_77)));
    if (!((life6_9 == 0))) {
        break lexical_join_91;
    }
    }
    ((com.google.gson.JsonArray)(life8_58)).add(((com.google.gson.JsonElement)(new com.google.gson.JsonPrimitive(java.lang.Integer.valueOf(((int)(((net.minecraft.client.resources.data.AnimationMetadataSection)(p0)).b(((int)(life9_60))))))))));
    }
    life9_60 += 1;
    if (!((life6_9 == 0))) { continue lexical_cycle_49; }
    break lexical_cycle_49;
    }
    }
    ((com.google.gson.JsonObject)(life7_8)).add(((java.lang.String)("frames")), ((com.google.gson.JsonElement)(life8_58)));
    }
    return life7_8;
}


public java.lang.String a() {
return "animation";
}


private moom.o9 a(int p0, com.google.gson.JsonElement p1) {
int forwardValue3834_23_0;
    com.google.gson.JsonElement forwardValue3834_25_0;
    int forwardValue3834_53_0;
    boolean spill3834_0;
    com.google.gson.JsonElement spill3834_1;
    boolean spill3834_2;
    long life3_3;
    int life5_5;
    com.google.gson.JsonObject life6_36;
    int life7_41;
    int life8_67;
    forward_join_70: {
    forward_join_53: {
    forward_join_50: {
    forward_join_25: {
    forward_join_23: {
    forward_join_19: {
    life3_3 = (moom.pb.a ^ 111087077318651L);
    life5_5 = moom.pa.c();
    spill3834_0 = ((com.google.gson.JsonElement)(p1)).isJsonPrimitive();
    if (!((life5_5 != 0))) {
        forwardValue3834_23_0 = ((spill3834_0) ? 1 : 0);
        break forward_join_23;
    }
    if (!(spill3834_0)) {
        break forward_join_19;
    }
    return new moom.o9(moom.Dg.a__Int(((com.google.gson.JsonElement)(p1)), ((java.lang.String)(__sourceIntrinsic_864869c3d789_invokedynamic3834_4(p0)))));
    }
    spill3834_1 = p1;
    if (!((life5_5 != 0))) {
        forwardValue3834_25_0 = spill3834_1;
        break forward_join_25;
    }
    forwardValue3834_23_0 = ((((com.google.gson.JsonElement)(spill3834_1)).isJsonObject()) ? 1 : 0);
    }
    if (!((forwardValue3834_23_0 != 0))) {
        break forward_join_70;
    }
    forwardValue3834_25_0 = p1;
    }
    life6_36 = moom.Dg.a__JsonObject(((com.google.gson.JsonElement)(forwardValue3834_25_0)), ((java.lang.String)(__sourceIntrinsic_864869c3d789_invokedynamic3834_8(p0))));
    life7_41 = moom.Dg.a(((com.google.gson.JsonObject)(life6_36)), ((java.lang.String)("time")), ((int)(-1)));
    spill3834_2 = ((com.google.gson.JsonObject)(life6_36)).has(((java.lang.String)("time")));
    if (!((life5_5 != 0))) {
        forwardValue3834_53_0 = ((spill3834_2) ? 1 : 0);
        break forward_join_53;
    }
    if (!(spill3834_2)) {
        break forward_join_50;
    }
    org.apache.commons.lang3.Validate.inclusiveBetween(((long)(1L)), ((long)(__sourceIntrinsic_864869c3d789_invokedynamic3834_13(24748, (1043408470829652985L ^ life3_3)))), ((long)(((long) life7_41))), ((java.lang.String)("Invalid frame time")));
    }
    forwardValue3834_53_0 = moom.Dg.a__Int(((com.google.gson.JsonObject)(life6_36)), ((java.lang.String)("index")));
    }
    life8_67 = forwardValue3834_53_0;
    org.apache.commons.lang3.Validate.inclusiveBetween(((long)(0L)), ((long)(__sourceIntrinsic_864869c3d789_invokedynamic3834_16(14380, (1416648274035737464L ^ life3_3)))), ((long)(((long) life8_67))), ((java.lang.String)("Invalid frame index")));
    return new moom.o9(life8_67, life7_41);
    }
    return null;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_864869c3d789_invokedynamic3834_4(int a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_864869c3d789_invokedynamic3834_8(int a0) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_864869c3d789_invokedynamic3834_13(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_864869c3d789_invokedynamic3834_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8710_0() throws E;

private static native long __sourceExactCall_8e8dd946ce1e53(int p0, long p1);

public java.lang.Object deserialize__sourceBridge_592e56158a(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
return ((moom.pb)(this)).a(((com.google.gson.JsonElement)(p0)), ((java.lang.reflect.Type)(p1)), ((com.google.gson.JsonDeserializationContext)(p2)));
}

public net.minecraft.client.resources.data.AnimationMetadataSection deserialize(com.google.gson.JsonElement __bridgeParam0, java.lang.reflect.Type __bridgeParam1, com.google.gson.JsonDeserializationContext __bridgeParam2) throws com.google.gson.JsonParseException { return ((net.minecraft.client.resources.data.AnimationMetadataSection)(this.deserialize__sourceBridge_592e56158a(((com.google.gson.JsonElement)(__bridgeParam0)), ((java.lang.reflect.Type)(__bridgeParam1)), ((com.google.gson.JsonDeserializationContext)(__bridgeParam2))))); }
public com.google.gson.JsonElement serialize__sourceBridge_aa40c1536e(java.lang.Object p0, java.lang.reflect.Type p1, com.google.gson.JsonSerializationContext p2) {
return ((moom.pb)(this)).a(((net.minecraft.client.resources.data.AnimationMetadataSection)(((net.minecraft.client.resources.data.AnimationMetadataSection)(p0)))), ((java.lang.reflect.Type)(p1)), ((com.google.gson.JsonSerializationContext)(p2)));
}

public com.google.gson.JsonElement serialize(net.minecraft.client.resources.data.AnimationMetadataSection __bridgeParam0, java.lang.reflect.Type __bridgeParam1, com.google.gson.JsonSerializationContext __bridgeParam2) { return ((com.google.gson.JsonElement)(this.serialize__sourceBridge_aa40c1536e(((java.lang.Object)(__bridgeParam0)), ((java.lang.reflect.Type)(__bridgeParam1)), ((com.google.gson.JsonSerializationContext)(__bridgeParam2))))); }
}
