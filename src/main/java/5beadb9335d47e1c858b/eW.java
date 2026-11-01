package com.moon;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class eW {

private com.moon.eU[] a;

private static final long b;

private static final java.lang.String c;

private static final long[] d;

private static final java.lang.Integer[] e;

private static final java.util.Map f;

public eW() {
super();
}


public eW(com.moon.eU[] p0) {
super();
    this.a = p0;
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(8940286042522336609L)), ((long)(-7312048549903961592L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(222593793924642L)))));
    long local11_life6 = (com.moon.eW.b ^ 120604158747803L);
    javax.crypto.Cipher local13_life8;
    javax.crypto.Cipher __sourceSpill81_10 = (local13_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill81_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill81_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill81_13 = new byte[8];
    (__sourceSpill81_13)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local14_life14 = 1;
    while ((local14_life14 < 8)) {
        (__sourceSpill81_13)[local14_life14] = ((byte) ((int) ((local11_life6 << (local14_life14 * 8)) >>> 56)));
        local14_life14 += 1;
    }
    byte[] __sourcePreallocation81_15 = __sourceSpill81_13;
    ((javax.crypto.Cipher)(__sourceSpill81_10)).init(((int)(__sourceSpill81_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill81_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation81_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill81_19 = ((java.lang.String)("ô\002Í¾ji2-¨å-l ÞLz2ÕÊ\030Õ?")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill81_20 = local13_life8;
    byte[] local15_life22 = ((javax.crypto.Cipher)(__sourceSpill81_20)).doFinal(((byte[])(__sourceSpill81_19)));
    c = ((java.lang.String)(((java.lang.String)(com.moon.eW.a(((byte[])(local15_life22))))).intern()));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life28;
    javax.crypto.Cipher __sourceSpill81_30 = (local0_life28 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill81_31 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill81_32 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill81_33 = new byte[8];
    (__sourceSpill81_33)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life34 = 1;
    while ((local1_life34 < 8)) {
        (__sourceSpill81_33)[local1_life34] = ((byte) ((int) ((local11_life6 << (local1_life34 * 8)) >>> 56)));
        local1_life34 += 1;
    }
    byte[] __sourcePreallocation81_35 = __sourceSpill81_33;
    ((javax.crypto.Cipher)(__sourceSpill81_30)).init(((int)(__sourceSpill81_31)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill81_32)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation81_35)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life38 = new long[2];
    int local3_life39 = 0;
    java.lang.String local4_life40;
    int local5_life42 = ((java.lang.String)((local4_life40 = "£¥\177õ<45ù´àfDCCs³"))).length();
    int local2_life43 = 0;
    do {
        java.lang.String __sourceSpill81_44 = local4_life40;
        int __sourceSpill81_45 = local2_life43;
        local2_life43 += 8;
        byte[] local7_life48 = ((java.lang.String)(((java.lang.String)(__sourceSpill81_44)).substring(((int)(__sourceSpill81_45)), ((int)(local2_life43))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill81_49 = local6_life38;
        int __sourceSpill81_50 = local3_life39;
        local3_life39 += 1;
        long local8_life51 = (((((((((((long) (local7_life48)[0]) & 255L) << 56) | ((((long) (local7_life48)[1]) & 255L) << 48)) | ((((long) (local7_life48)[2]) & 255L) << 40)) | ((((long) (local7_life48)[3]) & 255L) << 32)) | ((((long) (local7_life48)[4]) & 255L) << 24)) | ((((long) (local7_life48)[5]) & 255L) << 16)) | ((((long) (local7_life48)[6]) & 255L) << 8)) | (((long) (local7_life48)[7]) & 255L));
        byte[] __sourceSpill81_52 = new byte[8];
        (__sourceSpill81_52)[0] = ((byte) ((int) (local8_life51 >>> 56)));
        (__sourceSpill81_52)[1] = ((byte) ((int) (local8_life51 >>> 48)));
        (__sourceSpill81_52)[2] = ((byte) ((int) (local8_life51 >>> 40)));
        (__sourceSpill81_52)[3] = ((byte) ((int) (local8_life51 >>> 32)));
        (__sourceSpill81_52)[4] = ((byte) ((int) (local8_life51 >>> 24)));
        (__sourceSpill81_52)[5] = ((byte) ((int) (local8_life51 >>> 16)));
        (__sourceSpill81_52)[6] = ((byte) ((int) (local8_life51 >>> 8)));
        (__sourceSpill81_52)[7] = ((byte) ((int) local8_life51));
        javax.crypto.Cipher __sourceSpill81_53 = local0_life28;
        byte[] local10_life55 = ((javax.crypto.Cipher)(__sourceSpill81_53)).doFinal(((byte[])(__sourceSpill81_52)));
        (__sourceSpill81_49)[__sourceSpill81_50] = (((((((((((long) (local10_life55)[0]) & 255L) << 56) | ((((long) (local10_life55)[1]) & 255L) << 48)) | ((((long) (local10_life55)[2]) & 255L) << 40)) | ((((long) (local10_life55)[3]) & 255L) << 32)) | ((((long) (local10_life55)[4]) & 255L) << 24)) | ((((long) (local10_life55)[5]) & 255L) << 16)) | ((((long) (local10_life55)[6]) & 255L) << 8)) | (((long) (local10_life55)[7]) & 255L));
    } while ((!(local2_life43 >= local5_life42)));
    d = ((long[])(local6_life38));
    e = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public boolean equals(java.lang.Object p0) {
java.lang.Object forwardValue70_14_0;
    java.lang.Object forwardValue70_21_0;
    int forwardValue70_36_0;
    int forwardValue70_42_0;
    java.lang.Object spill70_0;
    boolean spill70_1;
    long life2_3;
    int[] life4_5;
    com.moon.eW life5_32;
    forward_join_42: {
    forward_join_41: {
    forward_join_36: {
    forward_join_31: {
    forward_join_21: {
    forward_join_20: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (com.moon.eW.b ^ 72189670839230L);
    life4_5 = com.moon.eV.b__ArrayInt();
    spill70_0 = p0;
    if (!((life4_5 != null))) {
        forwardValue70_14_0 = spill70_0;
        break forward_join_14;
    }
    if (!((spill70_0 == this))) {
        break forward_join_13;
    }
    return ((1) != 0);
    }
    forwardValue70_14_0 = p0;
    }
    if (!((life4_5 != null))) {
        forwardValue70_21_0 = forwardValue70_14_0;
        break forward_join_21;
    }
    if (!((((forwardValue70_14_0 instanceof com.moon.eW) ? 1 : 0) == 0))) {
        break forward_join_20;
    }
    return ((0) != 0);
    }
    forwardValue70_21_0 = p0;
    }
    life5_32 = ((com.moon.eW)(forwardValue70_21_0));
    spill70_1 = ((com.moon.eW)(life5_32)).a(((java.lang.Object)(this)));
    if (!((life4_5 != null))) {
        forwardValue70_36_0 = ((spill70_1) ? 1 : 0);
        break forward_join_36;
    }
    if (!((!spill70_1))) {
        break forward_join_31;
    }
    return ((0) != 0);
    }
    forwardValue70_36_0 = ((java.util.Arrays.deepEquals(((java.lang.Object[])(this.a())), ((java.lang.Object[])(((com.moon.eW)(life5_32)).a())))) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue70_42_0 = forwardValue70_36_0;
        break forward_join_42;
    }
    if (!((forwardValue70_36_0 == 0))) {
        break forward_join_41;
    }
    return ((0) != 0);
    }
    forwardValue70_42_0 = 1;
    }
    return ((forwardValue70_42_0) != 0);
}


public java.lang.String toString() {
long local1_life2 = (com.moon.eW.b ^ 105161541594755L);
    java.lang.String __stackOp20_6_0 = java.util.Arrays.deepToString(((java.lang.Object[])(this.a())));
    java.lang.String __stackOp20_6_1 = com.moon.eW.c;
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite20_7(__stackOp20_6_1, __stackOp20_6_0, ")");
}


public int hashCode() {
long life1_3;
    int life4_9;
    int life5_11;
    int life5_24;
    int[] life3_25;
    life1_3 = (com.moon.eW.b ^ 82197756158806L);
    life4_9 = __sourceIntrinsic_1861091996aa_invokedynamic875_1(7137, (8022952603504306928L ^ life1_3));
    life5_11 = 1;
    int[] spill875_0 = com.moon.eV.b__ArrayInt();
    life5_24 = ((life5_11 * __sourceIntrinsic_1861091996aa_invokedynamic875_3(8197, (4621678648655335701L ^ life1_3))) + java.util.Arrays.deepHashCode(((java.lang.Object[])(this.a()))));
    life3_25 = spill875_0;
    int spill875_1 = life5_24;
    if ((life3_25 == null)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[3])));
    }
    return spill875_1;
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
        byte[] spill197_0 = p0;
        life4_9 += 1;
        life5_44 = (spill197_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill197_1 = p0;
        life4_9 += 1;
        life5_76 = (spill197_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill197_2 = p0;
        life4_9 += 1;
        life5_91 = (spill197_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0xA1D;
        if (e[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    f.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/moon/eW", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            eW.e[n2] = n3;
        }
        return e[n2];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral986_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/eW"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.eW.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public com.moon.eU[] a() {
return this.a;
}


public com.moon.eW a(com.moon.eU[] p0) {
this.a = ((com.moon.eU[])(p0));
    return this;
}


protected boolean a(java.lang.Object p0) {
return ((((p0 instanceof com.moon.eW) ? 1 : 0)) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite20_7(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic875_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic875_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral986_0() throws E;
}
