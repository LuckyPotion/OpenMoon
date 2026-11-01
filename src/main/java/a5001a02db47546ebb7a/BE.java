package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class BE extends moom.BD<java.lang.String, moom.BM> {

private static final long g;

private static final long[] i;

private static final java.lang.Integer[] j;

private static final java.util.Map k;

public BE(java.io.File p0) {
super(p0);
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(-7821970453899032288L)), ((long)(-8046588417653206095L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(272470986972436L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.BE.g ^ 16924163979638L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill486_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill486_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill486_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill486_14 = new byte[8];
    (__sourceSpill486_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill486_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation486_16 = __sourceSpill486_14;
    ((javax.crypto.Cipher)(__sourceSpill486_11)).init(((int)(__sourceSpill486_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill486_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation486_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\002m-,å2'<ú¡+Û\003äG"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill486_25 = local6_life21;
        int __sourceSpill486_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill486_25)).substring(((int)(__sourceSpill486_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill486_30 = local8_life19;
        int __sourceSpill486_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill486_33 = new byte[8];
        (__sourceSpill486_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill486_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill486_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill486_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill486_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill486_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill486_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill486_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill486_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill486_34)).doFinal(((byte[])(__sourceSpill486_33)));
        (__sourceSpill486_30)[__sourceSpill486_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    i = ((long[])(local8_life19));
    j = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(java.net.SocketAddress p0) {
java.lang.Object local2 = __sourceExactCall_2edb9b2c413b61(((moom.BE)(this)), ((java.net.SocketAddress)(p0)));
    return ((moom.BE)(this)).a__Boolean(((java.lang.String)(local2)));
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x3280;
        if (j[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = i[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])k.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    k.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/BE", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            BE.j[n2] = n3;
        }
        return j[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.BE.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3755_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/BE"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected net.minecraft.server.management.UserListEntry<java.lang.String> a(com.google.gson.JsonObject p0) {
return new moom.BM(p0);
}


private java.lang.String a(java.net.SocketAddress p0) {
int forwardValue1488_32_0;
    java.lang.String forwardValue1488_45_0;
    boolean spill1488_0;
    boolean spill1488_1;
    java.lang.String spill1488_2;
    long life2_3;
    java.lang.String life5_7;
    int life4_8;
    forward_join_45: {
    forward_join_44: {
    forward_join_32: {
    forward_join_27: {
    life2_3 = (moom.BE.g ^ 111820153379816L);
    spill1488_0 = net.minecraft.server.management.ServerConfigurationManager.b__Boolean();
    life5_7 = ((java.lang.Object)(p0)).toString();
    life4_8 = ((spill1488_0) ? 1 : 0);
    spill1488_1 = ((java.lang.String)(life5_7)).contains(((java.lang.CharSequence)("/")));
    if (!((life4_8 == 0))) {
        forwardValue1488_32_0 = ((spill1488_1) ? 1 : 0);
        break forward_join_32;
    }
    if (!(spill1488_1)) {
        break forward_join_27;
    }
    life5_7 = ((java.lang.String)(life5_7)).substring(((int)((((java.lang.String)(life5_7)).indexOf(((int)(__sourceIntrinsic_5e3e0add45ed_invokedynamic1488_6(20800, (3059876213214052221L ^ life2_3))))) + 1))));
    }
    spill1488_2 = life5_7;
    if (!((life4_8 == 0))) {
        forwardValue1488_45_0 = spill1488_2;
        break forward_join_45;
    }
    forwardValue1488_32_0 = ((((java.lang.String)(spill1488_2)).contains(((java.lang.CharSequence)(":")))) ? 1 : 0);
    }
    if (!((forwardValue1488_32_0 != 0))) {
        break forward_join_44;
    }
    life5_7 = ((java.lang.String)(life5_7)).substring(((int)(0)), ((int)(((java.lang.String)(life5_7)).indexOf(((int)(__sourceIntrinsic_5e3e0add45ed_invokedynamic1488_11(495, (6167490985940168659L ^ life2_3))))))));
    }
    forwardValue1488_45_0 = life5_7;
    }
    return forwardValue1488_45_0;
}


public moom.BM a__BM(java.net.SocketAddress p0) {
java.lang.Object local2 = ((moom.BE)(this)).a(((java.net.SocketAddress)(p0)));
    return ((moom.BM)(((moom.BE)(this)).a__BK(((((java.lang.String)(local2)))))));
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3755_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3e0add45ed_invokedynamic1488_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3e0add45ed_invokedynamic1488_11(int a0, long a1) throws E;

private static native java.lang.String __sourceExactCall_2edb9b2c413b61(moom.BE p0, java.net.SocketAddress p1);
}
