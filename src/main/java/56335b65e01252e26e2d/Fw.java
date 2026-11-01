package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Fw {

private static java.util.Map<java.io.File, moom.Fv> a;

private static long b;

private static long[] c;

private static java.lang.Integer[] d;

private static java.util.Map e;

public Fw() {
super();
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(-8218263181666732815L)), ((long)(384777583994272905L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(203026287000646L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Fw.b ^ 119732967383695L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill542_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill542_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill542_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill542_14 = new byte[8];
    (__sourceSpill542_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill542_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation542_16 = __sourceSpill542_14;
    ((javax.crypto.Cipher)(__sourceSpill542_11)).init(((int)(__sourceSpill542_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill542_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation542_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "âòå.0¡§äZE\032Ø±«[¤ûRr­sâ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill542_25 = local6_life21;
        int __sourceSpill542_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill542_25)).substring(((int)(__sourceSpill542_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill542_30 = local8_life19;
        int __sourceSpill542_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill542_33 = new byte[8];
        (__sourceSpill542_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill542_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill542_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill542_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill542_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill542_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill542_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill542_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill542_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill542_34)).doFinal(((byte[])(__sourceSpill542_33)));
        (__sourceSpill542_30)[__sourceSpill542_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    c = ((long[])(local8_life19));
    d = ((java.lang.Integer[])(new java.lang.Integer[3]));
    a = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
}

private static native <E extends Throwable> void __sourceHandlerCall_a4c9480cfd261b7ad038() throws E;
private static final class __SourceHandler_a4c9480cfd261b7ad038 {

public static void f628() throws Throwable {
    moom.Fv forestValue628_24_0;
    int spill628_0;
    moom.Fv spill628_1;
    long life0_3;
    java.util.Iterator life3_8;
    int life2_9;
    moom.Fv life4_16;
    forest_join_29: {
    forest_join_27: {
    life0_3 = (__fieldRead628_0() ^ 105561554007364L);
    spill628_0 = __call628_1();
    life3_8 = __call628_4(__call628_3(__fieldRead628_2()));
    life2_9 = spill628_0;
    forest_cycle_10: while (true) {
    forest_join_25: {
    forest_join_24: {
    if (!(__call628_5(life3_8))) {
        break forest_join_27;
    }
    life4_16 = __cast628_7(__call628_6(life3_8));
    if (!((life2_9 != 0))) {
        break forest_join_29;
    }
    spill628_1 = life4_16;
    if (!((life2_9 != 0))) {
        forestValue628_24_0 = spill628_1;
        break forest_join_24;
    }
    if (!((spill628_1 != null))) {
        break forest_join_25;
    }
    forestValue628_24_0 = life4_16;
    }
    __call628_8(forestValue628_24_0);
    }
    if (!((life2_9 == 0))) {
        continue forest_cycle_10;
    }
    break forest_cycle_10;
    }
    }
    __call628_10(__fieldRead628_9());
    }
    return;
}
public static void h628_0(java.io.IOException p0) throws Throwable {
    throw __call3062800_0(p0);
}
public static void h628_1(java.io.IOException p0) throws Throwable {
    throw __call3062801_0(p0);
}
public static void h628_2(java.io.IOException p0, int p1, java.util.Iterator p2, moom.Fv p3) throws Throwable {
    moom.Fv forestValue3062802_21_0;
    moom.Fv spill3062802_0;
    java.io.IOException life4_2;
    moom.Fv life3_14;
    forest_join_25: {
    forest_join_23: {
    life4_2 = p0;
    __call3062802_0(life4_2);
    forest_cycle_4: while (true) {
    forest_join_22: {
    forest_join_21: {
    forest_join_7: {
    if (!((p1 == 0))) {
        break forest_join_7;
    }
    break forest_join_23;
    }
    if (!(__call3062802_1(p2))) {
        break forest_join_23;
    }
    life3_14 = __cast3062802_3(__call3062802_2(p2));
    if (!((p1 != 0))) {
        break forest_join_25;
    }
    spill3062802_0 = life3_14;
    if (!((p1 != 0))) {
        forestValue3062802_21_0 = spill3062802_0;
        break forest_join_21;
    }
    if (!((spill3062802_0 != null))) {
        break forest_join_22;
    }
    forestValue3062802_21_0 = life3_14;
    }
    __call3062802_4(forestValue3062802_21_0);
    }
    continue forest_cycle_4;
    }
    }
    __call3062802_6(__fieldRead3062802_5());
    }
    return;
}
private static native long __fieldRead628_0() throws Throwable;
private static native int __call628_1() throws Throwable;
private static native java.util.Map __fieldRead628_2() throws Throwable;
private static native java.util.Collection __call628_3(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call628_4(java.util.Collection a0) throws Throwable;
private static native boolean __call628_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call628_6(java.util.Iterator a0) throws Throwable;
private static native moom.Fv __cast628_7(java.lang.Object a0) throws Throwable;
private static native void __call628_8(moom.Fv a0) throws Throwable;
private static native java.util.Map __fieldRead628_9() throws Throwable;
private static native void __call628_10(java.util.Map a0) throws Throwable;
private static native java.lang.Exception __call3062800_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3062801_0(java.io.IOException a0) throws Throwable;
private static native void __call3062802_0(java.io.IOException a0) throws Throwable;
private static native boolean __call3062802_1(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3062802_2(java.util.Iterator a0) throws Throwable;
private static native moom.Fv __cast3062802_3(java.lang.Object a0) throws Throwable;
private static native void __call3062802_4(moom.Fv a0) throws Throwable;
private static native java.util.Map __fieldRead3062802_5() throws Throwable;
private static native void __call3062802_6(java.util.Map a0) throws Throwable;

}

private static native <E extends Throwable> moom.Fv __sourceHandlerCall_c268ebbc4f80486b3968(java.io.File a0, int a1, int a2) throws E;
private static final class __SourceHandler_c268ebbc4f80486b3968 {

public static moom.Fv f639(java.io.File p0, int p1, int p2) throws Throwable {
    moom.Fv forwardValue639_34_0;
    int forwardValue639_45_0;
    int spill639_0;
    moom.Fv spill639_1;
    boolean spill639_2;
    long life3_3;
    java.io.File life6_10;
    java.io.File life7_22;
    int life5_23;
    moom.Fv life8_28;
    moom.Fv life9_68;
    forward_join_52: {
    forward_join_45: {
    forward_join_43: {
    forward_join_35: {
    forward_join_34: {
    life3_3 = (__fieldRead639_0() ^ 33394319792343L);
    spill639_0 = __call639_1();
    life6_10 = new java.io.File(p0, "region");
    life7_22 = new java.io.File(life6_10, __invokedynamic639_2((p1 >> 5), (p2 >> 5)));
    life5_23 = spill639_0;
    life8_28 = __cast639_5(__call639_4(__fieldRead639_3(), life7_22));
    spill639_1 = life8_28;
    if (!((life5_23 != 0))) {
        forwardValue639_34_0 = spill639_1;
        break forward_join_34;
    }
    if (!((spill639_1 != null))) {
        break forward_join_35;
    }
    forwardValue639_34_0 = life8_28;
    }
    return forwardValue639_34_0;
    }
    spill639_2 = __call639_6(life6_10);
    if (!((life5_23 != 0))) {
        forwardValue639_45_0 = __integerCategory639_7(spill639_2);
        break forward_join_45;
    }
    if (!((!spill639_2))) {
        break forward_join_43;
    }
    __call639_8(life6_10);
    }
    forwardValue639_45_0 = __call639_10(__fieldRead639_9());
    }
    if (!((forwardValue639_45_0 >= __invokedynamic639_11(28828, (9026107116838767036L ^ life3_3))))) {
        break forward_join_52;
    }
    __call639_12();
    }
    life9_68 = new moom.Fv(life7_22);
    __call639_14(__fieldRead639_13(), life7_22, life9_68);
    return life9_68;
}
public static void h639_0(moom.Oo p0) throws Throwable {
    throw __call1063900_0(p0);
}
public static void h639_1(moom.Oo p0) throws Throwable {
    throw __call1063901_0(p0);
}
public static void h639_2(moom.Oo p0) throws Throwable {
    throw __call1063902_0(p0);
}
public static void h639_3(moom.Oo p0) throws Throwable {
    throw __call1063903_0(p0);
}
private static native long __fieldRead639_0() throws Throwable;
private static native int __call639_1() throws Throwable;
private static native java.lang.String __invokedynamic639_2(int a0, int a1) throws Throwable;
private static native java.util.Map __fieldRead639_3() throws Throwable;
private static native java.lang.Object __call639_4(java.util.Map a0, java.io.File a1) throws Throwable;
private static native moom.Fv __cast639_5(java.lang.Object a0) throws Throwable;
private static native boolean __call639_6(java.io.File a0) throws Throwable;
private static native int __integerCategory639_7(boolean value) throws Throwable;
private static native boolean __call639_8(java.io.File a0) throws Throwable;
private static native java.util.Map __fieldRead639_9() throws Throwable;
private static native int __call639_10(java.util.Map a0) throws Throwable;
private static native int __invokedynamic639_11(int a0, long a1) throws Throwable;
private static native void __call639_12() throws Throwable;
private static native java.util.Map __fieldRead639_13() throws Throwable;
private static native java.lang.Object __call639_14(java.util.Map a0, java.io.File a1, moom.Fv a2) throws Throwable;
private static native java.lang.Exception __call1063900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1063901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1063902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1063903_0(moom.Oo a0) throws Throwable;

}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x5FCE;
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
                throw new RuntimeException("moom/Fw", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Fw.d[n2] = n3;
        }
        return d[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Fw.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4571_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Fw"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static synchronized void a() { __sourceHandlerCall_a4c9480cfd261b7ad038(); }


public static java.io.DataInputStream a(java.io.File p0, int p1, int p2) {
long local3 = (moom.Fw.b ^ 46507445743340L);
    moom.Fv local5 = moom.Fw.a__Fv(((java.io.File)(p0)), ((int)(p1)), ((int)(p2)));
    return ((moom.Fv)(local5)).a__DataInputStream(((int)((p1 & __sourceIntrinsic_fb377bca808f_originalDynamicSite1158_2(2116, (8114066533022910301L ^ local3))))), ((int)((p2 & __sourceIntrinsic_fb377bca808f_originalDynamicSite1158_3(14940, (809077887246431558L ^ local3))))));
}


public static java.io.DataOutputStream a__DataOutputStream(java.io.File p0, int p1, int p2) {
long local3 = (moom.Fw.b ^ 139164284454867L);
    moom.Fv local5 = moom.Fw.a__Fv(((java.io.File)(p0)), ((int)(p1)), ((int)(p2)));
    return ((moom.Fv)(local5)).a__DataOutputStream(((int)((p1 & __sourceIntrinsic_a16c13dd5833_originalDynamicSite1159_2(14940, (809021551998901369L ^ local3))))), ((int)((p2 & __sourceIntrinsic_a16c13dd5833_originalDynamicSite1159_3(14940, (809021551998901369L ^ local3))))));
}


public static synchronized moom.Fv a__Fv(java.io.File p0, int p1, int p2) { return __sourceHandlerCall_c268ebbc4f80486b3968(p0, p1, p2); }


private static native <E extends Throwable> int __sourceIntrinsic_fb377bca808f_originalDynamicSite1158_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fb377bca808f_originalDynamicSite1158_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4571_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a16c13dd5833_originalDynamicSite1159_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a16c13dd5833_originalDynamicSite1159_3(int a0, long a1) throws E;
}
