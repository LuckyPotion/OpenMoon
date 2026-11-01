package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Fu {

public final byte[] a;

private final int b;

private final int c;

private static final long d;

private static final long[] e;

private static final java.lang.Integer[] f;

private static final java.util.Map g;

public Fu(byte[] p0, int p1) {
super();
    this.a = p0;
    this.b = p1;
    this.c = (p1 + 4);
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-6840005352162105219L)), ((long)(2335912138005248805L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(19426953092848L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Fu.d ^ 70575533948985L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill541_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill541_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill541_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill541_14 = new byte[8];
    (__sourceSpill541_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill541_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation541_16 = __sourceSpill541_14;
    ((javax.crypto.Cipher)(__sourceSpill541_11)).init(((int)(__sourceSpill541_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill541_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation541_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "´<äà>ÿt;Hï¯\016'*Å¥"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill541_25 = local6_life21;
        int __sourceSpill541_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill541_25)).substring(((int)(__sourceSpill541_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill541_30 = local8_life19;
        int __sourceSpill541_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill541_33 = new byte[8];
        (__sourceSpill541_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill541_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill541_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill541_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill541_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill541_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill541_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill541_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill541_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill541_34)).doFinal(((byte[])(__sourceSpill541_33)));
        (__sourceSpill541_30)[__sourceSpill541_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    e = ((long[])(local8_life19));
    f = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4560_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Fu"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Fu.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x214B;
        if (f[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Fu", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Fu.f[n2] = n3;
        }
        return f[n2];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a(int p0, int p1, int p2) {
int forwardValue1954_47_0;
    int forwardValue1954_53_0;
    int spill1954_0;
    int spill1954_1;
    long life4_3;
    int life7_15;
    int life8_20;
    int life6_21;
    int life9_25;
    forward_join_53: {
    forward_join_47: {
    forward_join_41: {
    life4_3 = (moom.Fu.d ^ 108660635114550L);
    life7_15 = (((p0 << this.c) | (p2 << this.b)) | p1);
    spill1954_0 = moom.Fs.c();
    life8_20 = (life7_15 >> 1);
    life6_21 = spill1954_0;
    life9_25 = (life7_15 & 1);
    spill1954_1 = life9_25;
    if (!((life6_21 == 0))) {
        forwardValue1954_47_0 = spill1954_1;
        break forward_join_47;
    }
    if (!((spill1954_1 == 0))) {
        break forward_join_41;
    }
    forwardValue1954_53_0 = ((this.a)[life8_20] & __sourceIntrinsic_248c5cdd4d82_invokedynamic1954_5(19861, (3948760651341711689L ^ life4_3)));
    break forward_join_53;
    }
    forwardValue1954_47_0 = ((this.a)[life8_20] >> 4);
    }
    forwardValue1954_53_0 = (forwardValue1954_47_0 & __sourceIntrinsic_248c5cdd4d82_invokedynamic1954_7(9857, (6485903526187704924L ^ life4_3)));
    }
    return forwardValue1954_53_0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4560_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_248c5cdd4d82_invokedynamic1954_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_248c5cdd4d82_invokedynamic1954_7(int a0, long a1) throws E;
}
