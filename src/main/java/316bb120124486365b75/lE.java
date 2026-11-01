package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class lE {

public float[] a;

public final int b;

private static final long c;

private static final long[] d;

private static final java.lang.Integer[] e;

private static final java.util.Map f;

public lE(float[] p0, int p1) {
super();
    this.a = p0;
    this.b = p1;
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(7210367354310684433L)), ((long)(7037149151856970649L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(15473481477926L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.lE.c ^ 25225362362315L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill917_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill917_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill917_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill917_14 = new byte[8];
    (__sourceSpill917_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill917_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation917_16 = __sourceSpill917_14;
    ((javax.crypto.Cipher)(__sourceSpill917_11)).init(((int)(__sourceSpill917_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill917_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation917_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "þ£\000÷òöÍÉ³¬\031ìÑIM"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill917_25 = local6_life21;
        int __sourceSpill917_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill917_25)).substring(((int)(__sourceSpill917_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill917_30 = local8_life19;
        int __sourceSpill917_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill917_33 = new byte[8];
        (__sourceSpill917_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill917_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill917_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill917_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill917_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill917_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill917_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill917_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill917_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill917_34)).doFinal(((byte[])(__sourceSpill917_33)));
        (__sourceSpill917_30)[__sourceSpill917_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public int b__Int(int p0) {
long local2 = (moom.lE.c ^ 11958669304662L);
    return ((p0 + (4 - (this.b / __sourceIntrinsic_1680bc5d1bde_originalDynamicSite1540_2(16107, (5571136602184764711L ^ local2))))) % 4);
}


public float b(int p0) {
float forwardValue3743_26_0;
    int life2_13;
    forward_join_26: {
    forward_join_22: {
    forward_join_8: {
    if (!((this.a == null))) {
        break forward_join_8;
    }
    throw new java.lang.NullPointerException("uvs");
    }
    life2_13 = ((moom.lE)(this)).a__Int(((int)(p0)));
    if (!((life2_13 != 0))) {
        break forward_join_22;
    }
    if (!((life2_13 != 3))) {
        break forward_join_22;
    }
    forwardValue3743_26_0 = (this.a)[3];
    break forward_join_26;
    }
    forwardValue3743_26_0 = (this.a)[1];
    }
    return forwardValue3743_26_0;
}


private static java.lang.NullPointerException a(java.lang.NullPointerException p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8288_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/lE"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x4FB0;
        if (e[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l5 = d[n4];
            byte[] byArray3 = new byte[]{(byte)(l5 >>> 56), (byte)(l5 >>> 48), (byte)(l5 >>> 40), (byte)(l5 >>> 32), (byte)(l5 >>> 24), (byte)(l5 >>> 16), (byte)(l5 >>> 8), (byte)l5};
            Long l6 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l6);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    f.put(l6, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/lE", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lE.e[n4] = n6;
        }
        return e[n4];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.lE.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(float[] p0) {
if ((this.a == null)) {
        this.a = ((float[])(p0));
    }
    return;
}


private int a__Int(int p0) {
long local2 = (moom.lE.c ^ 54031494028639L);
    return ((p0 + (this.b / __sourceIntrinsic_14567322fa59_originalDynamicSite1541_2(18934, (106668563619628082L ^ local2)))) % 4);
}


public float a(int p0) {
float forwardValue3742_26_0;
    int life2_13;
    forward_join_26: {
    forward_join_22: {
    forward_join_8: {
    if (!((this.a == null))) {
        break forward_join_8;
    }
    throw new java.lang.NullPointerException("uvs");
    }
    life2_13 = ((moom.lE)(this)).a__Int(((int)(p0)));
    if (!((life2_13 != 0))) {
        break forward_join_22;
    }
    if (!((life2_13 != 1))) {
        break forward_join_22;
    }
    forwardValue3742_26_0 = (this.a)[2];
    break forward_join_26;
    }
    forwardValue3742_26_0 = (this.a)[0];
    }
    return forwardValue3742_26_0;
}


private static native <E extends Throwable> int __sourceIntrinsic_1680bc5d1bde_originalDynamicSite1540_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8288_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_14567322fa59_originalDynamicSite1541_2(int a0, long a1) throws E;
}
