package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class DJ {

private static java.util.regex.Pattern a;

private static com.google.common.base.Splitter b;

private static moom.DJ c;

private java.util.Map<java.lang.String, java.lang.String> d;

private long e;

private static long f;

private static long[] g;

private static java.lang.Integer[] h;

private static java.util.Map i;

public DJ() { super(); __sourceHandlerCall_0497bfddb2982af62b19(this); }


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-2013552361657965151L)), ((long)(-1260321242971794187L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(113471193833540L)))));
    long local11_life6 = (moom.DJ.f ^ 53449033948208L);
    i = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill512_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill512_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill512_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill512_14 = new byte[8];
    (__sourceSpill512_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill512_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation512_16 = __sourceSpill512_14;
    ((javax.crypto.Cipher)(__sourceSpill512_11)).init(((int)(__sourceSpill512_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill512_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation512_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[2];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "ðXÊø[\023î6åµ~Û\037"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill512_25 = local4_life21;
        int __sourceSpill512_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill512_25)).substring(((int)(__sourceSpill512_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill512_30 = local6_life19;
        int __sourceSpill512_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill512_33 = new byte[8];
        (__sourceSpill512_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill512_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill512_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill512_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill512_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill512_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill512_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill512_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill512_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill512_34)).doFinal(((byte[])(__sourceSpill512_33)));
        (__sourceSpill512_30)[__sourceSpill512_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    g = ((long[])(local6_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[2]));
    a = ((java.util.regex.Pattern)(java.util.regex.Pattern.compile(((java.lang.String)("%(\\d+\\$)?[\\d.]*[df]")))));
    b = ((com.google.common.base.Splitter)(((com.google.common.base.Splitter)(com.google.common.base.Splitter.on(((char)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite512_41(8448, (1247977844971011179L ^ local11_life6))))))).limit(((int)(2)))));
    c = ((moom.DJ)(new moom.DJ()));
}

private static native <E extends Throwable> void __sourceHandlerCall_0497bfddb2982af62b19(moom.DJ a0) throws E;
private static final class __SourceHandler_0497bfddb2982af62b19 {

public static void f386(moom.DJ receiver) throws Throwable {
    long life1_3;
    java.io.InputStream life3_12;
    java.util.Iterator life4_17;
    java.lang.String life5_24;
    java.lang.String[] life6_44;
    java.lang.String life7_52;
    java.lang.String life8_60;
    forest_join_67: {
    life1_3 = (__fieldRead386_0() ^ 111277979264800L);
    __directSuperInit386_1(receiver);
    __fieldWrite386_3(receiver, __call386_2());
    life3_12 = __call386_5(__classLiteral386_4(), "/assets/minecraft/lang/en_US.lang");
    life4_17 = __call386_8(__call386_7(life3_12, __fieldRead386_6()));
    forest_cycle_18: while (true) {
    forest_join_66: {
    if (!(__call386_9(life4_17))) {
        break forest_join_67;
    }
    life5_24 = __cast386_11(__call386_10(life4_17));
    if (!((!__call386_12(life5_24)))) {
        break forest_join_66;
    }
    if (!((__call386_13(life5_24, 0) != __invokedynamic386_14(20191, (4834694830246684837L ^ life1_3))))) {
        break forest_join_66;
    }
    life6_44 = __cast386_19(__call386_18(__call386_16(__fieldRead386_15(), life5_24), __classLiteral386_17()));
    if (!(((life6_44).length == 2))) {
        break forest_join_66;
    }
    life7_52 = (life6_44)[0];
    life8_60 = __call386_22(__call386_21(__fieldRead386_20(), (life6_44)[1]), "%$1s");
    __call386_24(__fieldRead386_23(receiver), life7_52, life8_60);
    }
    continue forest_cycle_18;
    }
    }
    __fieldWrite386_26(receiver, __call386_25());
    return;
}
public static void h386_0(java.io.IOException p0) throws Throwable {
    throw __call3038600_0(p0);
}
public static void h386_1(java.io.IOException p0, java.io.InputStream p1) throws Throwable {
    java.io.IOException life1_2;
    life1_2 = p0;
    return;
}
private static native long __fieldRead386_0() throws Throwable;
private static native void __directSuperInit386_1(moom.DJ a0) throws Throwable;
private static native java.util.HashMap __call386_2() throws Throwable;
private static native void __fieldWrite386_3(moom.DJ a0, java.util.HashMap a1) throws Throwable;
private static native java.lang.Class __classLiteral386_4() throws Throwable;
private static native java.io.InputStream __call386_5(java.lang.Class a0, java.lang.String a1) throws Throwable;
private static native java.nio.charset.Charset __fieldRead386_6() throws Throwable;
private static native java.util.List __call386_7(java.io.InputStream a0, java.nio.charset.Charset a1) throws Throwable;
private static native java.util.Iterator __call386_8(java.util.List a0) throws Throwable;
private static native boolean __call386_9(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call386_10(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast386_11(java.lang.Object a0) throws Throwable;
private static native boolean __call386_12(java.lang.String a0) throws Throwable;
private static native char __call386_13(java.lang.String a0, int a1) throws Throwable;
private static native int __invokedynamic386_14(int a0, long a1) throws Throwable;
private static native com.google.common.base.Splitter __fieldRead386_15() throws Throwable;
private static native java.lang.Iterable __call386_16(com.google.common.base.Splitter a0, java.lang.String a1) throws Throwable;
private static native java.lang.Class __classLiteral386_17() throws Throwable;
private static native java.lang.Object[] __call386_18(java.lang.Iterable a0, java.lang.Class a1) throws Throwable;
private static native java.lang.String[] __cast386_19(java.lang.Object[] a0) throws Throwable;
private static native java.util.regex.Pattern __fieldRead386_20() throws Throwable;
private static native java.util.regex.Matcher __call386_21(java.util.regex.Pattern a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call386_22(java.util.regex.Matcher a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead386_23(moom.DJ a0) throws Throwable;
private static native java.lang.Object __call386_24(java.util.Map a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native long __call386_25() throws Throwable;
private static native void __fieldWrite386_26(moom.DJ a0, long a1) throws Throwable;
private static native java.lang.Exception __call3038600_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_935fefe1eab344bd8c5c(moom.DJ a0, java.lang.String a1) throws E;
private static final class __SourceHandler_935fefe1eab344bd8c5c {

public static java.lang.String f626(moom.DJ receiver, java.lang.String p0) throws Throwable {
    java.lang.String forwardValue626_17_0;
    java.lang.String forwardValue626_19_0;
    boolean spill626_0;
    java.lang.String spill626_1;
    long life2_3;
    java.lang.String life5_10;
    int life4_11;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life2_3 = (__fieldRead626_0() ^ 124770740472152L);
    spill626_0 = __call626_1();
    life5_10 = __cast626_4(__call626_3(__fieldRead626_2(receiver), p0));
    life4_11 = __integerCategory626_5(spill626_0);
    spill626_1 = life5_10;
    if (!((life4_11 != 0))) {
        forwardValue626_17_0 = spill626_1;
        break forward_join_17;
    }
    if (!((spill626_1 == null))) {
        break forward_join_18;
    }
    forwardValue626_17_0 = p0;
    }
    forwardValue626_19_0 = forwardValue626_17_0;
    break forward_join_19;
    }
    forwardValue626_19_0 = life5_10;
    }
    return forwardValue626_19_0;
}
public static void h626_0(java.util.IllegalFormatException p0) throws Throwable {
    throw __call1062600_0(p0);
}
private static native long __fieldRead626_0() throws Throwable;
private static native boolean __call626_1() throws Throwable;
private static native java.util.Map __fieldRead626_2(moom.DJ a0) throws Throwable;
private static native java.lang.Object __call626_3(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __cast626_4(java.lang.Object a0) throws Throwable;
private static native int __integerCategory626_5(boolean value) throws Throwable;
private static native java.lang.Exception __call1062600_0(java.util.IllegalFormatException a0) throws Throwable;

}


private java.lang.String b(java.lang.String p0) { return __sourceHandlerCall_935fefe1eab344bd8c5c(this, p0); }


public long a() {
return this.e;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x5144;
        if (h[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = g[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])i.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    i.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/DJ", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DJ.h[n2] = n4;
        }
        return h[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.DJ.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4171_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/DJ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


static moom.DJ a__DJ() {
return moom.DJ.c;
}


public static synchronized void a(java.util.Map<java.lang.String, java.lang.String> p0) {
((java.util.Map)(((moom.DJ)(moom.DJ.c)).d)).clear();
    ((java.util.Map)(((moom.DJ)(moom.DJ.c)).d)).putAll(((java.util.Map)(p0)));
    ((moom.DJ)(moom.DJ.c)).e = ((long)(java.lang.System.currentTimeMillis()));
    return;
}


public synchronized java.lang.String a(java.lang.String p0) {
return ((moom.DJ)(this)).b(((java.lang.String)(p0)));
}


public synchronized java.lang.String a(java.lang.String p0, java.lang.Object[] p1) {
java.lang.String local3 = ((moom.DJ)(this)).b(((java.lang.String)(p0)));
    try {
        return java.lang.String.format(((java.lang.String)(local3)), ((java.lang.Object[])(p1)));
    } catch (java.util.IllegalFormatException caught4) {
        return __sourceIntrinsic_13d92cd9b8bf_invokedynamic4172_2(local3);
    }
}


public synchronized boolean a__Boolean(java.lang.String p0) {
return (__sourceIntrinsic_booleanComparison((((java.util.Map)(this.d)).containsKey(((java.lang.Object)(p0))))) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite512_41(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_13d92cd9b8bf_invokedynamic4172_2(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4171_0() throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
