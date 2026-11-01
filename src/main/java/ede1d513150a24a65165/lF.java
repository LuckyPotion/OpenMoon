package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class lF implements com.google.gson.JsonDeserializer {

private static final long a;

private static final long[] b;

private static final java.lang.Integer[] c;

private static final java.util.Map d;

lF() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(5605979599782528677L)), ((long)(580057462721572432L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(77295204605036L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.lF.a ^ 123892826362056L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill918_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill918_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill918_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill918_14 = new byte[8];
    (__sourceSpill918_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill918_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation918_16 = __sourceSpill918_14;
    ((javax.crypto.Cipher)(__sourceSpill918_11)).init(((int)(__sourceSpill918_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill918_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation918_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Eh\032\033f\001\035þª\025ÕG,|"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill918_25 = local6_life21;
        int __sourceSpill918_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill918_25)).substring(((int)(__sourceSpill918_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill918_30 = local8_life19;
        int __sourceSpill918_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill918_33 = new byte[8];
        (__sourceSpill918_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill918_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill918_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill918_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill918_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill918_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill918_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill918_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill918_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill918_34)).doFinal(((byte[])(__sourceSpill918_33)));
        (__sourceSpill918_30)[__sourceSpill918_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    b = ((long[])(local8_life19));
    c = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static com.google.gson.JsonParseException a(com.google.gson.JsonParseException p0) {
return p0;
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0xF5E;
        if (c[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l5 = b[n4];
            byte[] byArray3 = new byte[]{(byte)(l5 >>> 56), (byte)(l5 >>> 48), (byte)(l5 >>> 40), (byte)(l5 >>> 32), (byte)(l5 >>> 24), (byte)(l5 >>> 16), (byte)(l5 >>> 8), (byte)l5};
            Long l6 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l6);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    d.put(l6, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/lF", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lF.c[n4] = n6;
        }
        return c[n4];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.lF.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8290_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/lF"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected int a(com.google.gson.JsonObject p0) {
long local2 = (moom.lF.a ^ 65220314805141L);
    int local4 = moom.Dg.a(((com.google.gson.JsonObject)(p0)), ((java.lang.String)("rotation")), ((int)(0)));
    if ((local4 >= 0)) {
        if (((local4 % __sourceIntrinsic_c24fe4475f2f_invokedynamic8291_2(13218, (4560281582717116686L ^ local2))) == 0)) {
        if (((local4 / __sourceIntrinsic_c24fe4475f2f_invokedynamic8291_3(21603, (3217362686690641614L ^ local2))) <= 3)) {
        return local4;
    }
    }
    }
    throw new com.google.gson.JsonParseException(__sourceIntrinsic_c24fe4475f2f_invokedynamic8291_4(local4));
}


private float[] a__ArrayFloat(com.google.gson.JsonObject p0) {
if ((!((com.google.gson.JsonObject)(p0)).has(((java.lang.String)("uv"))))) {
        return null;
    }
    com.google.gson.JsonArray local2 = moom.Dg.a__JsonArray(((com.google.gson.JsonObject)(p0)), ((java.lang.String)("uv")));
    if ((((com.google.gson.JsonArray)(local2)).size() != 4)) {
        throw new com.google.gson.JsonParseException(__sourceIntrinsic_e173fdcc9cf2_invokedynamic8292_4(((com.google.gson.JsonArray)(local2)).size()));
    }
    float[] local3 = new float[4];
    int local4 = 0;
    while ((local4 < (local3).length)) {
        (local3)[local4] = moom.Dg.a(((com.google.gson.JsonElement)(((com.google.gson.JsonArray)(local2)).get(((int)(local4))))), ((java.lang.String)(__sourceIntrinsic_e173fdcc9cf2_invokedynamic8292_6(local4))));
        local4 += 1;
    }
    return local3;
}


public moom.lE a(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
com.google.gson.JsonObject local4 = ((com.google.gson.JsonElement)(p0)).getAsJsonObject();
    float[] local5 = ((moom.lF)(this)).a__ArrayFloat(((com.google.gson.JsonObject)(local4)));
    int local6 = this.a(((com.google.gson.JsonObject)(local4)));
    return new moom.lE(local5, local6);
}


public java.lang.Object deserialize(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
return this.a(((com.google.gson.JsonElement)(p0)), ((java.lang.reflect.Type)(p1)), ((com.google.gson.JsonDeserializationContext)(p2)));
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8290_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c24fe4475f2f_invokedynamic8291_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c24fe4475f2f_invokedynamic8291_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c24fe4475f2f_invokedynamic8291_4(int a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e173fdcc9cf2_invokedynamic8292_4(int a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e173fdcc9cf2_invokedynamic8292_6(int a0) throws E;
}
