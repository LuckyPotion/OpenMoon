package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class C3 {

private long[] a;

private int b;

private int c;

private int d;

private static long e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

public C3() { super(); }


private static void __sourceConstructorBody_62bf64c2566ff5c8(moom.C3 receiver) throws Throwable {

long local1 = (moom.C3.e ^ 74449774147325L);

    moom.C3.__sourceConstructorInit_62bf64c2566ff5c8_0(((moom.C3)(receiver)));

    ((moom.C3)(receiver)).a = ((long[])(new long[__sourceIntrinsic_62bf64c2566ff5c8_originalDynamicSite1870_2(31207, (4396616226081547308L ^ local1))]));

    return;

}



static {
e = ((long)(((moom._a)(moom._c.a(((long)(7464817519049866057L)), ((long)(-1002133955800702495L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(168316583600695L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.C3.e ^ 93400010909615L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill498_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill498_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill498_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill498_14 = new byte[8];
    (__sourceSpill498_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill498_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation498_16 = __sourceSpill498_14;
    ((javax.crypto.Cipher)(__sourceSpill498_11)).init(((int)(__sourceSpill498_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill498_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation498_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "omOtJì4bóìÝ\031q¡¾"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill498_25 = local6_life21;
        int __sourceSpill498_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill498_25)).substring(((int)(__sourceSpill498_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill498_30 = local8_life19;
        int __sourceSpill498_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill498_33 = new byte[8];
        (__sourceSpill498_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill498_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill498_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill498_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill498_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill498_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill498_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill498_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill498_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill498_34)).doFinal(((byte[])(__sourceSpill498_33)));
        (__sourceSpill498_30)[__sourceSpill498_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_62bf64c2566ff5c8_0(moom.C3 a0) throws E;

public int b() {
return this.d;
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x34EF;
        if (g[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = f[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/C3", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            C3.g[n4] = n6;
        }
        return g[n4];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.C3.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4011_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/C3"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(long p0) {
int forwardValue189_40_0;
    int forwardValue189_40_1;
    moom.C3 forwardValue189_53_0;
    boolean spill189_0;
    int spill189_1;
    int spill189_2;
    moom.C3 spill189_3;
    long life3_3;
    int life5_11;
    forward_join_60: {
    forward_join_53: {
    forward_join_52: {
    forward_join_40: {
    forward_join_31: {
    life3_3 = (moom.C3.e ^ 84624394645982L);
    spill189_0 = moom.DS.b__Boolean();
    (this.a)[this.d] = p0;
    life5_11 = ((spill189_0) ? 1 : 0);
    moom.C3 __stackOp189_5_0 = this;
    ((moom.C3)(__stackOp189_5_0)).d = ((int)((((moom.C3)(__stackOp189_5_0)).d + 1)));
    spill189_1 = this.d;
    spill189_2 = __sourceIntrinsic_e753b806269e_invokedynamic189_9(14656, (621009725091505065L ^ life3_3));
    if (!((life5_11 == 0))) {
        forwardValue189_40_0 = spill189_1;
        forwardValue189_40_1 = spill189_2;
        break forward_join_40;
    }
    if (!((spill189_1 == spill189_2))) {
        break forward_join_31;
    }
    this.d = ((int)(0));
    }
    spill189_3 = this;
    if (!((life5_11 == 0))) {
        forwardValue189_53_0 = spill189_3;
        break forward_join_53;
    }
    forwardValue189_40_0 = ((moom.C3)(spill189_3)).c;
    forwardValue189_40_1 = __sourceIntrinsic_e753b806269e_invokedynamic189_12(14656, (621009725091505065L ^ life3_3));
    }
    if (!((forwardValue189_40_0 < forwardValue189_40_1))) {
        break forward_join_52;
    }
    this.b = ((int)(0));
    moom.C3 __stackOp189_14_0 = this;
    ((moom.C3)(__stackOp189_14_0)).c = ((int)((((moom.C3)(__stackOp189_14_0)).c + 1)));
    if (!((life5_11 != 0))) {
        break forward_join_60;
    }
    }
    forwardValue189_53_0 = this;
    }
    ((moom.C3)(forwardValue189_53_0)).b = ((int)(((moom.C3)(this)).a(((int)((this.d + 1))))));
    }
    return;
}


public int a(long p0, int p1) {
double local4 = (((double) p0) / 0x1.fca054p23d);
    return ((int) (local4 * ((double) p1)));
}


public int a() {
return this.b;
}


public int a(int p0) {
long local2 = (moom.C3.e ^ 82521945422733L);
    return (p0 % __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1071_1(14656, (621007416642841082L ^ local2)));
}


public long[] a__ArrayLong() {
return this.a;
}


private static native <E extends Throwable> int __sourceIntrinsic_62bf64c2566ff5c8_originalDynamicSite1870_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1071_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e753b806269e_invokedynamic189_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e753b806269e_invokedynamic189_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4011_0() throws E;
}
