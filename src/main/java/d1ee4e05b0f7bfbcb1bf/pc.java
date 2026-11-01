package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class pc extends moom.pa<net.minecraft.client.resources.data.FontMetadataSection> {

private static final long a;

private static final long[] c;

private static final java.lang.Integer[] d;

private static final java.util.Map e;

public pc() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(6284084624229703085L)), ((long)(-1899794754054048428L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(50948909683932L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.pc.a ^ 58020811870195L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill966_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill966_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill966_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill966_14 = new byte[8];
    (__sourceSpill966_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill966_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation966_16 = __sourceSpill966_14;
    ((javax.crypto.Cipher)(__sourceSpill966_11)).init(((int)(__sourceSpill966_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill966_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation966_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "n@ÀHSe¦C\020\tWj¨N\005"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill966_25 = local6_life21;
        int __sourceSpill966_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill966_25)).substring(((int)(__sourceSpill966_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill966_30 = local8_life19;
        int __sourceSpill966_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill966_33 = new byte[8];
        (__sourceSpill966_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill966_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill966_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill966_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill966_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill966_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill966_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill966_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill966_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill966_34)).doFinal(((byte[])(__sourceSpill966_33)));
        (__sourceSpill966_30)[__sourceSpill966_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    c = ((long[])(local8_life19));
    d = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static com.google.gson.JsonParseException a(com.google.gson.JsonParseException p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 3472;
      if (d[var3] == null) {
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
         long var5 = c[var3];
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
         Object[] var9 = (Object[])e.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               e.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/pc", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.pc.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8715_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/pc"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.client.resources.data.FontMetadataSection a(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
int lexicalValue1267_48_0;
    com.google.gson.JsonObject lexicalValue1267_59_0;
    java.lang.String lexicalValue1267_59_1;
    com.google.gson.JsonObject lexicalValue1267_84_0;
    java.lang.String lexicalValue1267_84_1;
    int lexicalValue1267_120_0;
    net.minecraft.client.resources.data.FontMetadataSection lexicalValue1267_207_0;
    int spill1267_0;
    boolean spill1267_1;
    com.google.gson.JsonObject spill1267_2;
    java.lang.String spill1267_3;
    boolean spill1267_4;
    com.google.gson.JsonObject spill1267_5;
    java.lang.String spill1267_6;
    net.minecraft.client.resources.data.FontMetadataSection spill1267_7;
    long life4_3;
    com.google.gson.JsonObject life7_7;
    float[] life8_14;
    float[] life9_21;
    int life6_22;
    float[] life10_29;
    float life11_31;
    float life12_33;
    float life13_35;
    com.google.gson.JsonObject life14_71;
    com.google.gson.JsonObject life15_107;
    int life15_142;
    com.google.gson.JsonElement life16_154;
    float life17_156;
    float life18_158;
    float life19_160;
    com.google.gson.JsonObject life20_172;
    lexical_join_207: {
    lexical_join_196: {
    lexical_join_120: {
    lexical_join_119: {
    lexical_join_84: {
    lexical_join_82: {
    lexical_join_59: {
    lexical_join_57: {
    lexical_join_48: {
    life4_3 = (moom.pc.a ^ 20700018192847L);
    spill1267_0 = moom.pa.b();
    life7_7 = ((com.google.gson.JsonElement)(p0)).getAsJsonObject();
    life8_14 = new float[__sourceIntrinsic_de330261ea35_invokedynamic1267_3(4077, (7873211837141904792L ^ life4_3))];
    life9_21 = new float[__sourceIntrinsic_de330261ea35_invokedynamic1267_4(32359, (3213842698084490259L ^ life4_3))];
    life6_22 = spill1267_0;
    life10_29 = new float[__sourceIntrinsic_de330261ea35_invokedynamic1267_5(32359, (3213842698084490259L ^ life4_3))];
    life11_31 = 0x1.0p0f;
    life12_33 = 0x0.0p0f;
    life13_35 = 0x0.0p0f;
    spill1267_1 = ((com.google.gson.JsonObject)(life7_7)).has(((java.lang.String)("characters")));
    if (!((life6_22 == 0))) {
        lexicalValue1267_48_0 = ((spill1267_1) ? 1 : 0);
        break lexical_join_48;
    }
    if (!(spill1267_1)) {
        break lexical_join_196;
    }
    spill1267_2 = life7_7;
    spill1267_3 = "characters";
    if (!((life6_22 == 0))) {
        lexicalValue1267_59_0 = spill1267_2;
        lexicalValue1267_59_1 = spill1267_3;
        break lexical_join_59;
    }
    lexicalValue1267_48_0 = ((((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(spill1267_2)).get(((java.lang.String)(spill1267_3))))).isJsonObject()) ? 1 : 0);
    }
    if (!((lexicalValue1267_48_0 == 0))) {
        break lexical_join_57;
    }
    throw new com.google.gson.JsonParseException(__sourceIntrinsic_de330261ea35_invokedynamic1267_12(((com.google.gson.JsonObject)(life7_7)).get(((java.lang.String)("characters")))));
    }
    lexicalValue1267_59_0 = life7_7;
    lexicalValue1267_59_1 = "characters";
    }
    life14_71 = ((com.google.gson.JsonObject)(lexicalValue1267_59_0)).getAsJsonObject(((java.lang.String)(lexicalValue1267_59_1)));
    spill1267_4 = ((com.google.gson.JsonObject)(life14_71)).has(((java.lang.String)("default")));
    if (!((life6_22 == 0))) {
        lexicalValue1267_120_0 = ((spill1267_4) ? 1 : 0);
        break lexical_join_120;
    }
    if (!(spill1267_4)) {
        break lexical_join_119;
    }
    spill1267_5 = life14_71;
    spill1267_6 = "default";
    if (!((life6_22 == 0))) {
        lexicalValue1267_84_0 = spill1267_5;
        lexicalValue1267_84_1 = spill1267_6;
        break lexical_join_84;
    }
    if (!((!((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(spill1267_5)).get(((java.lang.String)(spill1267_6))))).isJsonObject()))) {
        break lexical_join_82;
    }
    throw new com.google.gson.JsonParseException(__sourceIntrinsic_de330261ea35_invokedynamic1267_19(((com.google.gson.JsonObject)(life14_71)).get(((java.lang.String)("default")))));
    }
    lexicalValue1267_84_0 = life14_71;
    lexicalValue1267_84_1 = "default";
    }
    life15_107 = ((com.google.gson.JsonObject)(lexicalValue1267_84_0)).getAsJsonObject(((java.lang.String)(lexicalValue1267_84_1)));
    life11_31 = moom.Dg.a(((com.google.gson.JsonObject)(life15_107)), ((java.lang.String)("width")), ((float)(life11_31)));
    org.apache.commons.lang3.Validate.inclusiveBetween(((double)(0x0.0p0d)), ((double)(0x1.fffffep127d)), ((double)(((double) life11_31))), ((java.lang.String)("Invalid default width")));
    life12_33 = moom.Dg.a(((com.google.gson.JsonObject)(life15_107)), ((java.lang.String)("spacing")), ((float)(life12_33)));
    org.apache.commons.lang3.Validate.inclusiveBetween(((double)(0x0.0p0d)), ((double)(0x1.fffffep127d)), ((double)(((double) life12_33))), ((java.lang.String)("Invalid default spacing")));
    life13_35 = moom.Dg.a(((com.google.gson.JsonObject)(life15_107)), ((java.lang.String)("left")), ((float)(life12_33)));
    org.apache.commons.lang3.Validate.inclusiveBetween(((double)(0x0.0p0d)), ((double)(0x1.fffffep127d)), ((double)(((double) life13_35))), ((java.lang.String)("Invalid default left")));
    }
    lexicalValue1267_120_0 = 0;
    }
    life15_142 = lexicalValue1267_120_0;
    lexical_cycle_121: while (true) {
    lexical_join_194: {
    lexical_join_181: {
    if (!((life15_142 < __sourceIntrinsic_de330261ea35_invokedynamic1267_27(32359, (3213842698084490259L ^ life4_3))))) {
        break lexical_join_196;
    }
    life16_154 = ((com.google.gson.JsonObject)(life14_71)).get(((java.lang.String)(java.lang.Integer.toString(((int)(life15_142))))));
    life17_156 = life11_31;
    life18_158 = life12_33;
    life19_160 = life13_35;
    if (!((life6_22 == 0))) {
        break lexical_join_194;
    }
    if (!((life16_154 != null))) {
        break lexical_join_181;
    }
    life20_172 = moom.Dg.a__JsonObject(((com.google.gson.JsonElement)(life16_154)), ((java.lang.String)(__sourceIntrinsic_de330261ea35_invokedynamic1267_30(life15_142))));
    life17_156 = moom.Dg.a(((com.google.gson.JsonObject)(life20_172)), ((java.lang.String)("width")), ((float)(life11_31)));
    org.apache.commons.lang3.Validate.inclusiveBetween(((double)(0x0.0p0d)), ((double)(0x1.fffffep127d)), ((double)(((double) life17_156))), ((java.lang.String)("Invalid width")));
    life18_158 = moom.Dg.a(((com.google.gson.JsonObject)(life20_172)), ((java.lang.String)("spacing")), ((float)(life12_33)));
    org.apache.commons.lang3.Validate.inclusiveBetween(((double)(0x0.0p0d)), ((double)(0x1.fffffep127d)), ((double)(((double) life18_158))), ((java.lang.String)("Invalid spacing")));
    life19_160 = moom.Dg.a(((com.google.gson.JsonObject)(life20_172)), ((java.lang.String)("left")), ((float)(life13_35)));
    org.apache.commons.lang3.Validate.inclusiveBetween(((double)(0x0.0p0d)), ((double)(0x1.fffffep127d)), ((double)(((double) life19_160))), ((java.lang.String)("Invalid left")));
    }
    (life8_14)[life15_142] = life17_156;
    (life9_21)[life15_142] = life18_158;
    (life10_29)[life15_142] = life19_160;
    life15_142 += 1;
    }
    if (!((life6_22 != 0))) { continue lexical_cycle_121; }
    break lexical_cycle_121;
    }
    }
    spill1267_7 = new net.minecraft.client.resources.data.FontMetadataSection(life8_14, life10_29, life9_21);
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        lexicalValue1267_207_0 = spill1267_7;
        break lexical_join_207;
    }
    life6_22 += 1;
    moom.pa.b(((int)(life6_22)));
    lexicalValue1267_207_0 = spill1267_7;
    }
    return lexicalValue1267_207_0;
}


public java.lang.String a() {
return "font";
}


public net.minecraft.client.resources.data.FontMetadataSection deserialize(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
return this.a(((com.google.gson.JsonElement)(p0)), ((java.lang.reflect.Type)(p1)), ((com.google.gson.JsonDeserializationContext)(p2)));
}


private static native <E extends Throwable> int __sourceIntrinsic_de330261ea35_invokedynamic1267_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de330261ea35_invokedynamic1267_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de330261ea35_invokedynamic1267_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_de330261ea35_invokedynamic1267_12(com.google.gson.JsonElement a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_de330261ea35_invokedynamic1267_19(com.google.gson.JsonElement a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de330261ea35_invokedynamic1267_27(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_de330261ea35_invokedynamic1267_30(int a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8715_0() throws E;
}
