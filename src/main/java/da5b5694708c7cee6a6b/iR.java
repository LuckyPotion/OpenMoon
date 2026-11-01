package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class iR extends moom.iQ {

public moom.jD i;

public moom.jD j;

public moom.jD k;

private static long l;

private static long[] m;

private static java.lang.Integer[] n;

private static java.util.Map o;

public iR() { super(); }


private static void __sourceConstructorBody_fced3d0807f65e7c(moom.iR receiver) throws Throwable {

long local1 = (moom.iR.l ^ 139365079399010L);

    moom.iR.__sourceConstructorInit_fced3d0807f65e7c_0(((moom.iR)(receiver)));

    ((moom.iR)(receiver)).f = ((int)(__sourceIntrinsic_fced3d0807f65e7c_originalDynamicSite2889_2(25101, (5888642624435914870L ^ local1))));

    ((moom.iR)(receiver)).g = ((int)(__sourceIntrinsic_fced3d0807f65e7c_originalDynamicSite2889_4(1681, (343166713642314987L ^ local1))));

    ((moom.iR)(receiver)).i = ((moom.jD)(new moom.jD(receiver, 0, 0)));

    ((moom.jD)(((moom.iR)(receiver)).i)).a(((float)(-0x1.4p3f)), ((float)(0x0.0p0f)), ((float)(-0x1.0p1f)), ((int)(__sourceIntrinsic_fced3d0807f65e7c_originalDynamicSite2889_8(22998, (2417600669477614510L ^ local1)))), ((int)(__sourceIntrinsic_fced3d0807f65e7c_originalDynamicSite2889_9(19626, (6949885927132473047L ^ local1)))), ((int)(1)), ((float)(0x0.0p0f)));

    ((moom.iR)(receiver)).j = ((moom.jD)(new moom.jD(receiver, __sourceIntrinsic_fced3d0807f65e7c_originalDynamicSite2889_11(16178, (5102383346181657933L ^ local1)), 0)));

    ((moom.jD)(((moom.iR)(receiver)).j)).a(((float)(-0x1.0p0f)), ((float)(-0x1.ep4f)), ((float)(-0x1.0p0f)), ((int)(2)), ((int)(__sourceIntrinsic_fced3d0807f65e7c_originalDynamicSite2889_14(14313, (5815824466827632023L ^ local1)))), ((int)(2)), ((float)(0x0.0p0f)));

    ((moom.iR)(receiver)).k = ((moom.jD)(new moom.jD(receiver, 0, __sourceIntrinsic_fced3d0807f65e7c_originalDynamicSite2889_16(8465, (8323192099004402536L ^ local1)))));

    ((moom.jD)(((moom.iR)(receiver)).k)).a(((float)(-0x1.4p3f)), ((float)(-0x1.0p5f)), ((float)(-0x1.0p0f)), ((int)(__sourceIntrinsic_fced3d0807f65e7c_originalDynamicSite2889_19(31426, (6086200504625959102L ^ local1)))), ((int)(2)), ((int)(2)), ((float)(0x0.0p0f)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_fced3d0807f65e7c_0(moom.iR a0) throws E;

static {
l = ((long)(((moom._a)(moom._c.a(((long)(1809063534267088866L)), ((long)(638127916735687064L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(126926381182410L)))));
    o = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.iR.l ^ 5979688332581L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1293_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1293_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1293_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1293_14 = new byte[8];
    (__sourceSpill1293_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1293_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1293_16 = __sourceSpill1293_14;
    ((javax.crypto.Cipher)(__sourceSpill1293_11)).init(((int)(__sourceSpill1293_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1293_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1293_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "¢aà4AÒ¸¥\005\030²O\005 C ^uE¡w?`s6xâ(ÁC@Ã\004^\017µ³}MZ?¸"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1293_25 = local6_life21;
        int __sourceSpill1293_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1293_25)).substring(((int)(__sourceSpill1293_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1293_30 = local8_life19;
        int __sourceSpill1293_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1293_33 = new byte[8];
        (__sourceSpill1293_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1293_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1293_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1293_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1293_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1293_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1293_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1293_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1293_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1293_34)).doFinal(((byte[])(__sourceSpill1293_33)));
        (__sourceSpill1293_30)[__sourceSpill1293_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "wøÓOvu\013$\020\031iö\023»­"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1293_38 = local6_life21;
        int __sourceSpill1293_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1293_38)).substring(((int)(__sourceSpill1293_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1293_43 = local8_life19;
        int __sourceSpill1293_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1293_46 = new byte[8];
        (__sourceSpill1293_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1293_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1293_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1293_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1293_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1293_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1293_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1293_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1293_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1293_47)).doFinal(((byte[])(__sourceSpill1293_46)));
        (__sourceSpill1293_43)[__sourceSpill1293_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    m = ((long[])(local8_life19));
    n = ((java.lang.Integer[])(new java.lang.Integer[8]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8016_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/iR"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.iR.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x4F79;
        if (iR.n[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = m[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])o.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    o.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/iR", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            iR.n[n2] = n4;
        }
        return iR.n[n2];
}


public void a() {
((moom.jD)(this.i)).f = ((float)(-0x1.0p5f));
    ((moom.jD)(this.i)).a(((float)(0x1.0p-4f)));
    ((moom.jD)(this.j)).a(((float)(0x1.0p-4f)));
    ((moom.jD)(this.k)).a(((float)(0x1.0p-4f)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_fced3d0807f65e7c_originalDynamicSite2889_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fced3d0807f65e7c_originalDynamicSite2889_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fced3d0807f65e7c_originalDynamicSite2889_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fced3d0807f65e7c_originalDynamicSite2889_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fced3d0807f65e7c_originalDynamicSite2889_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fced3d0807f65e7c_originalDynamicSite2889_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fced3d0807f65e7c_originalDynamicSite2889_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fced3d0807f65e7c_originalDynamicSite2889_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8016_0() throws E;
}
