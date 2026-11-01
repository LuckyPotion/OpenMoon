package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class NR {

private static java.util.Deque<moom.NT<java.lang.Object>> a;

private static long b;

private static long[] c;

private static java.lang.Integer[] d;

private static java.util.Map e;

public NR() {
super();
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(-6670188155834371932L)), ((long)(5471384073331241497L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(87797399171855L)))));
    long local11_life6 = (moom.NR.b ^ 35524092655041L);
    e = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill726_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill726_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill726_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill726_14 = new byte[8];
    (__sourceSpill726_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill726_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation726_16 = __sourceSpill726_14;
    ((javax.crypto.Cipher)(__sourceSpill726_11)).init(((int)(__sourceSpill726_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill726_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation726_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[2];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "Ðu¬î6'Óa]0°ÒNÆ"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill726_25 = local4_life21;
        int __sourceSpill726_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill726_25)).substring(((int)(__sourceSpill726_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill726_30 = local6_life19;
        int __sourceSpill726_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill726_33 = new byte[8];
        (__sourceSpill726_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill726_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill726_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill726_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill726_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill726_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill726_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill726_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill726_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill726_34)).doFinal(((byte[])(__sourceSpill726_33)));
        (__sourceSpill726_30)[__sourceSpill726_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    c = ((long[])(local6_life19));
    d = ((java.lang.Integer[])(new java.lang.Integer[2]));
    a = ((java.util.Deque)(new java.util.ArrayDeque()));
    int local13_life40 = 0;
    while ((local13_life40 < __sourceIntrinsic_eb8803ad1f63_originalDynamicSite726_41(20036, (2836601268036322010L ^ local11_life6)))) {
        moom.NS local14_life42 = new moom.NS();
        ((java.util.Deque)(moom.NR.a)).add(((java.lang.Object)(local14_life42)));
        local13_life40 += 1;
    }
}

private static native <E extends Throwable> java.util.Iterator __sourceHandlerCall_1ba660b322d2f25d134b(java.util.List a0) throws E;
private static final class __SourceHandler_1ba660b322d2f25d134b {

public static java.util.Iterator f370(java.util.List p0) throws Throwable {
    moom.NT forestValue370_28_0;
    int spill370_0;
    moom.NT spill370_1;
    moom.NT spill370_2;
    long life1_3;
    java.util.Deque life4_7;
    int life3_9;
    moom.NT life5_13;
    forest_join_28: {
    forest_join_22: {
    life1_3 = (__fieldRead370_0() ^ 123899344493015L);
    spill370_0 = __call370_1();
    __monitorEnter370_3((life4_7 = __fieldRead370_2()));
    life3_9 = spill370_0;
    life5_13 = __cast370_6(__call370_5(__fieldRead370_4()));
    spill370_1 = life5_13;
    if (!((life3_9 != 0))) {
        forestValue370_28_0 = spill370_1;
        break forest_join_28;
    }
    if (!((spill370_1 == null))) {
        break forest_join_22;
    }
    life5_13 = new moom.NS();
    }
    __call370_7(life5_13, p0);
    spill370_2 = life5_13;
    __monitorExit370_8(life4_7);
    forestValue370_28_0 = spill370_2;
    }
    return forestValue370_28_0;
}
public static java.util.Iterator h370_0(moom.Oo p0) throws Throwable {
    throw __call3037000_0(p0);
}
public static java.util.Iterator h370_1(java.lang.Throwable p0, java.util.Deque p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3037001_0(p1);
    throw life2_2;
}
private static native long __fieldRead370_0() throws Throwable;
private static native int __call370_1() throws Throwable;
private static native java.util.Deque __fieldRead370_2() throws Throwable;
private static native void __monitorEnter370_3(java.util.Deque a0) throws Throwable;
private static native java.util.Deque __fieldRead370_4() throws Throwable;
private static native java.lang.Object __call370_5(java.util.Deque a0) throws Throwable;
private static native moom.NT __cast370_6(java.lang.Object a0) throws Throwable;
private static native void __call370_7(moom.NT a0, java.util.List a1) throws Throwable;
private static native void __monitorExit370_8(java.util.Deque a0) throws Throwable;
private static native moom.Oo __call3037000_0(moom.Oo a0) throws Throwable;
private static native void __monitorExit3037001_0(java.util.Deque a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_daf1711524087ff82c64(moom.NT a0) throws E;
private static final class __SourceHandler_daf1711524087ff82c64 {

public static void f371(moom.NT p0) throws Throwable {
    java.util.Deque forestValue371_27_0;
    int spill371_0;
    java.util.Deque spill371_1;
    long life1_3;
    java.util.Deque life4_7;
    int life3_9;
    forest_join_27: {
    forest_join_26: {
    life1_3 = (__fieldRead371_0() ^ 76594972988097L);
    spill371_0 = __call371_1();
    __monitorEnter371_3((life4_7 = __fieldRead371_2()));
    life3_9 = spill371_0;
    spill371_1 = __fieldRead371_4();
    if (!((life3_9 != 0))) {
        forestValue371_27_0 = spill371_1;
        break forest_join_27;
    }
    if (!((__call371_5(spill371_1) <= __invokedynamic371_6(8588, (6360949581643729427L ^ life1_3))))) {
        break forest_join_26;
    }
    __call371_7(p0, null);
    __call371_9(__fieldRead371_8(), p0);
    }
    forestValue371_27_0 = life4_7;
    }
    __monitorExit371_10(forestValue371_27_0);
    return;
}
public static void h371_0(moom.Oo p0) throws Throwable {
    throw __call3037100_0(p0);
}
public static void h371_1(moom.Oo p0) throws Throwable {
    throw __call3037101_0(p0);
}
public static void h371_2(java.lang.Throwable p0, java.util.Deque p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3037102_0(p1);
    throw life2_2;
}
private static native long __fieldRead371_0() throws Throwable;
private static native int __call371_1() throws Throwable;
private static native java.util.Deque __fieldRead371_2() throws Throwable;
private static native void __monitorEnter371_3(java.util.Deque a0) throws Throwable;
private static native java.util.Deque __fieldRead371_4() throws Throwable;
private static native int __call371_5(java.util.Deque a0) throws Throwable;
private static native int __invokedynamic371_6(int a0, long a1) throws Throwable;
private static native void __call371_7(moom.NT a0, java.lang.Object a1) throws Throwable;
private static native java.util.Deque __fieldRead371_8() throws Throwable;
private static native void __call371_9(java.util.Deque a0, moom.NT a1) throws Throwable;
private static native void __monitorExit371_10(java.util.Deque a0) throws Throwable;
private static native moom.Oo __call3037100_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3037101_0(moom.Oo a0) throws Throwable;
private static native void __monitorExit3037102_0(java.util.Deque a0) throws Throwable;

}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x5261;
        if (d[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    e.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/NR", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            NR.d[n2] = n4;
        }
        return d[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.NR.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6604_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/NR"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static void a(moom.NT<java.lang.Object> p0) { __sourceHandlerCall_daf1711524087ff82c64(p0); }


public static java.util.Iterator<java.lang.Object> a(java.util.List p0) { return __sourceHandlerCall_1ba660b322d2f25d134b(p0); }


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite726_41(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6604_0() throws E;
}
