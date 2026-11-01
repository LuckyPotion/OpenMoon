package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class lV {

public static final moom.lV a;

public final org.lwjgl.util.vector.Vector3f b;

public final org.lwjgl.util.vector.Vector3f c;

public final org.lwjgl.util.vector.Vector3f d;

private static final long e;

private static final long[] f;

private static final java.lang.Integer[] g;

private static final java.util.Map h;

public lV(org.lwjgl.util.vector.Vector3f p0, org.lwjgl.util.vector.Vector3f p1, org.lwjgl.util.vector.Vector3f p2) {
super();
    this.b = ((org.lwjgl.util.vector.Vector3f)(new org.lwjgl.util.vector.Vector3f(p0)));
    this.c = ((org.lwjgl.util.vector.Vector3f)(new org.lwjgl.util.vector.Vector3f(p1)));
    this.d = ((org.lwjgl.util.vector.Vector3f)(new org.lwjgl.util.vector.Vector3f(p2)));
    return;
}


static {
javax.crypto.Cipher forestValue400016_36_0;
    int forestValue400016_36_1;
    javax.crypto.SecretKeyFactory forestValue400016_36_2;
    byte[] forestValue400016_36_3;
    javax.crypto.Cipher forestValue400016_53_0;
    int forestValue400016_53_1;
    javax.crypto.SecretKeyFactory forestValue400016_53_2;
    byte[] forestValue400016_53_3;
    javax.crypto.Cipher spill400016_0;
    int spill400016_1;
    javax.crypto.SecretKeyFactory spill400016_2;
    byte[] spill400016_3;
    byte[] spill400016_4;
    java.lang.String spill400016_5;
    int spill400016_6;
    long[] spill400016_7;
    int spill400016_8;
    int spill400016_9;
    long spill400016_10;
    long spill400016_11;
    int spill400016_12;
    long life0_16;
    javax.crypto.Cipher life2_20;
    int life3_35;
    long[] life8_66;
    int life5_68;
    java.lang.String life6_71;
    int life7_73;
    int life4_75;
    byte[] life9_83;
    long life10_160;
    byte[] life12_228;
    forest_join_53: {
    e = ((long)(((moom._a)(moom._c.a(((long)(-7666273846145955700L)), ((long)(-1585881881535874631L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(93705711028117L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (moom.lV.e ^ 89793238801385L);
    spill400016_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill400016_1 = 2;
    spill400016_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp400016_9_0 = new byte[8];
    spill400016_3 = __stackOp400016_9_0;
    (__stackOp400016_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue400016_36_0 = spill400016_0;
    forestValue400016_36_1 = spill400016_1;
    forestValue400016_36_2 = spill400016_2;
    forestValue400016_36_3 = spill400016_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue400016_53_0 = forestValue400016_36_0;
        forestValue400016_53_1 = forestValue400016_36_1;
        forestValue400016_53_2 = forestValue400016_36_2;
        forestValue400016_53_3 = forestValue400016_36_3;
        break forest_join_53;
    }
    byte[] __stackOp400016_10_0 = forestValue400016_36_3;
    spill400016_4 = __stackOp400016_10_0;
    (__stackOp400016_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue400016_36_3 = spill400016_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue400016_53_0)).init(((int)(forestValue400016_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue400016_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue400016_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life8_66 = new long[2];
    life5_68 = 0;
    life7_73 = ((java.lang.String)((life6_71 = "¢\033'\rMqwáÆàW\037º\021M"))).length();
    life4_75 = 0;
    forest_cycle_76: while (true) {
    spill400016_5 = life6_71;
    spill400016_6 = life4_75;
    life4_75 += 8;
    life9_83 = ((java.lang.String)(((java.lang.String)(spill400016_5)).substring(((int)(spill400016_6)), ((int)(life4_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill400016_7 = life8_66;
    spill400016_8 = (life5_68++);
    long __stackOp400016_16_0 = (((((((((((long) (life9_83)[0]) & 255L) << 56) | ((((long) (life9_83)[1]) & 255L) << 48)) | ((((long) (life9_83)[2]) & 255L) << 40)) | ((((long) (life9_83)[3]) & 255L) << 32)) | ((((long) (life9_83)[4]) & 255L) << 24)) | ((((long) (life9_83)[5]) & 255L) << 16)) | ((((long) (life9_83)[6]) & 255L) << 8)) | (((long) (life9_83)[7]) & 255L));
    int __stackOp400016_16_1 = -1;
    spill400016_9 = __stackOp400016_16_1;
    spill400016_10 = __stackOp400016_16_0;
    recovery.source.CarrierOps.discard(__stackOp400016_16_1);
    life10_160 = spill400016_10;
    byte[] __stackOp400016_18_0 = new byte[] {((byte) ((int) (life10_160 >>> 56))), ((byte) ((int) (life10_160 >>> 48))), ((byte) ((int) (life10_160 >>> 40))), ((byte) ((int) (life10_160 >>> 32))), ((byte) ((int) (life10_160 >>> 24))), ((byte) ((int) (life10_160 >>> 16))), ((byte) ((int) (life10_160 >>> 8))), ((byte) ((int) life10_160))};
    javax.crypto.Cipher __stackOp400016_18_1 = life2_20;
    life12_228 = ((javax.crypto.Cipher)(__stackOp400016_18_1)).doFinal(((byte[])(__stackOp400016_18_0)));
    int __stackOp400016_20_0 = spill400016_9;
    long __stackOp400016_20_1 = (((((((((((long) (life12_228)[0]) & 255L) << 56) | ((((long) (life12_228)[1]) & 255L) << 48)) | ((((long) (life12_228)[2]) & 255L) << 40)) | ((((long) (life12_228)[3]) & 255L) << 32)) | ((((long) (life12_228)[4]) & 255L) << 24)) | ((((long) (life12_228)[5]) & 255L) << 16)) | ((((long) (life12_228)[6]) & 255L) << 8)) | (((long) (life12_228)[7]) & 255L));
    spill400016_11 = __stackOp400016_20_1;
    spill400016_12 = __stackOp400016_20_0;
    recovery.source.CarrierOps.discard(__stackOp400016_20_1);
    recovery.source.CarrierOps.discard(spill400016_12);
    (spill400016_7)[spill400016_8] = spill400016_11;
    if (!((life4_75 >= life7_73))) {
        continue forest_cycle_76;
    }
    break forest_cycle_76;
    }
    f = ((long[])(life8_66));
    g = ((java.lang.Integer[])(new java.lang.Integer[2]));
    a = ((moom.lV)(new moom.lV(new org.lwjgl.util.vector.Vector3f(), new org.lwjgl.util.vector.Vector3f(), new org.lwjgl.util.vector.Vector3f(0x1.0p0f, 0x1.0p0f, 0x1.0p0f))));
}


public boolean equals(java.lang.Object p0) {
int forwardValue100119_36_0;
    moom.lV life2_18;
    forward_join_36: {
    forward_join_35: {
    forward_join_12: {
    forward_join_5: {
    if (!((this == p0))) {
        break forward_join_5;
    }
    return ((1) != 0);
    }
    if (!((((java.lang.Object)(this)).getClass() != ((java.lang.Object)(p0)).getClass()))) {
        break forward_join_12;
    }
    return ((0) != 0);
    }
    life2_18 = ((moom.lV)(p0));
    if (!(((java.lang.Object)(this.b)).equals(((java.lang.Object)(((moom.lV)(life2_18)).b))))) {
        break forward_join_35;
    }
    if (!(((java.lang.Object)(this.d)).equals(((java.lang.Object)(((moom.lV)(life2_18)).d))))) {
        break forward_join_35;
    }
    if (!(((java.lang.Object)(this.c)).equals(((java.lang.Object)(((moom.lV)(life2_18)).c))))) {
        break forward_join_35;
    }
    forwardValue100119_36_0 = 1;
    break forward_join_36;
    }
    forwardValue100119_36_0 = 0;
    }
    return ((forwardValue100119_36_0) != 0);
}


public int hashCode() {
long life1_3;
    int life3_7;
    int life3_19;
    int life3_31;
    life1_3 = (moom.lV.e ^ 115761983137278L);
    life3_7 = ((java.lang.Object)(this.b)).hashCode();
    life3_19 = ((__sourceIntrinsic_1861091996aa_invokedynamic100120_3(7638, (2150133757368723690L ^ life1_3)) * life3_7) + ((java.lang.Object)(this.c)).hashCode());
    life3_31 = ((__sourceIntrinsic_1861091996aa_invokedynamic100120_6(18436, (5770708840869707065L ^ life1_3)) * life3_19) + ((java.lang.Object)(this.d)).hashCode());
    return life3_31;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.lV.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8307_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/lV"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x195;
        if (g[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l5 = f[n4];
            byte[] byArray3 = new byte[]{(byte)(l5 >>> 56), (byte)(l5 >>> 48), (byte)(l5 >>> 40), (byte)(l5 >>> 32), (byte)(l5 >>> 24), (byte)(l5 >>> 16), (byte)(l5 >>> 8), (byte)l5};
            Long l6 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l6);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    h.put(l6, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/lV", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lV.g[n4] = n6;
        }
        return g[n4];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8307_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic100120_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic100120_6(int a0, long a1) throws E;
}
