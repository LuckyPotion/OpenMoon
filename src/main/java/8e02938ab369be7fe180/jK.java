package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class jK {

private final java.lang.String a;

private final int b;

private static final long c;

private static final long[] d;

private static final java.lang.Integer[] e;

private static final java.util.Map f;

private jK(java.lang.String p0, int p1) {
super();
    this.a = p0;
    this.b = p1;
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-4285825769557057740L)), ((long)(7576899855990060973L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(195758059484833L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.jK.c ^ 114315718044886L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill893_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill893_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill893_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill893_14 = new byte[8];
    (__sourceSpill893_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill893_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation893_16 = __sourceSpill893_14;
    ((javax.crypto.Cipher)(__sourceSpill893_11)).init(((int)(__sourceSpill893_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill893_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation893_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "õ¥x\003òåSâ`\030°÷H"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill893_25 = local6_life21;
        int __sourceSpill893_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill893_25)).substring(((int)(__sourceSpill893_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill893_30 = local8_life19;
        int __sourceSpill893_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill893_33 = new byte[8];
        (__sourceSpill893_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill893_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill893_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill893_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill893_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill893_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill893_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill893_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill893_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill893_34)).doFinal(((byte[])(__sourceSpill893_33)));
        (__sourceSpill893_30)[__sourceSpill893_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x5BCA;
        if (e[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = d[n4];
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
                throw new RuntimeException("moom/jK", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            jK.e[n4] = n6;
        }
        return e[n4];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8137_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/jK"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.jK.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public java.lang.String a__String() {
return java.net.IDN.toASCII(((java.lang.String)(this.a)));
}


public int a() {
return this.b;
}


public static moom.jK a(java.lang.String p0) {
java.lang.String forwardValue3678_13_0;
    int forwardValue3678_71_0;
    int forwardValue3678_81_0;
    java.lang.String[] forwardValue3678_91_0;
    int forwardValue3678_109_0;
    int forwardValue3678_115_0;
    java.lang.String spill3678_0;
    boolean spill3678_1;
    int spill3678_2;
    boolean spill3678_3;
    int spill3678_4;
    java.lang.String[] spill3678_5;
    java.lang.String[] spill3678_6;
    java.lang.String[] spill3678_7;
    java.lang.String[] spill3678_8;
    java.lang.String[] spill3678_9;
    int spill3678_10;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    java.lang.String[] life4_20;
    int life5_33;
    java.lang.String life6_45;
    java.lang.String life7_52;
    java.lang.String life7_76;
    java.lang.String life5_119;
    int life6_147;
    java.lang.String[] life7_157;
    forward_join_140: {
    forward_join_115: {
    forward_join_110: {
    forward_join_109: {
    forward_join_91: {
    forward_join_90: {
    forward_join_81: {
    forward_join_77: {
    forward_join_71: {
    forward_join_70: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (moom.jK.c ^ 15494392619855L);
    life3_5 = net.minecraft.client.multiplayer.WorldClient.a__Arrayr3();
    spill3678_0 = p0;
    if (!((life3_5 == null))) {
        forwardValue3678_13_0 = spill3678_0;
        break forward_join_13;
    }
    if (!((spill3678_0 == null))) {
        break forward_join_12;
    }
    return null;
    }
    forwardValue3678_13_0 = p0;
    }
    life4_20 = ((java.lang.String)(forwardValue3678_13_0)).split(((java.lang.String)(":")));
    spill3678_1 = ((java.lang.String)(p0)).startsWith(((java.lang.String)("[")));
    if (!((life3_5 == null))) {
        forwardValue3678_81_0 = ((spill3678_1) ? 1 : 0);
        break forward_join_81;
    }
    if (!(spill3678_1)) {
        break forward_join_77;
    }
    life5_33 = ((java.lang.String)(p0)).indexOf(((java.lang.String)("]")));
    spill3678_2 = life5_33;
    if (!((life3_5 == null))) {
        forwardValue3678_81_0 = spill3678_2;
        break forward_join_81;
    }
    if (!((spill3678_2 > 0))) {
        break forward_join_77;
    }
    life6_45 = ((java.lang.String)(p0)).substring(((int)(1)), ((int)(life5_33)));
    life7_52 = ((java.lang.String)(((java.lang.String)(p0)).substring(((int)((life5_33 + 1)))))).trim();
    spill3678_3 = ((java.lang.String)(life7_52)).startsWith(((java.lang.String)(":")));
    if (!((life3_5 == null))) {
        forwardValue3678_71_0 = ((spill3678_3) ? 1 : 0);
        break forward_join_71;
    }
    if (!(spill3678_3)) {
        break forward_join_70;
    }
    spill3678_4 = ((java.lang.String)(life7_52)).length();
    if (!((life3_5 == null))) {
        forwardValue3678_71_0 = spill3678_4;
        break forward_join_71;
    }
    if (!((spill3678_4 > 0))) {
        break forward_join_70;
    }
    life7_76 = ((java.lang.String)(life7_52)).substring(((int)(1)));
    java.lang.String[] __stackOp3678_13_0 = new java.lang.String[2];
    spill3678_5 = __stackOp3678_13_0;
    (__stackOp3678_13_0)[0] = life6_45;
    java.lang.String[] __stackOp3678_14_0 = spill3678_5;
    spill3678_6 = __stackOp3678_14_0;
    (__stackOp3678_14_0)[1] = life7_76;
    life4_20 = spill3678_6;
    if (!((life3_5 != null))) {
        break forward_join_77;
    }
    }
    forwardValue3678_71_0 = 1;
    }
    java.lang.String[] __stackOp3678_15_0 = new java.lang.String[forwardValue3678_71_0];
    spill3678_7 = __stackOp3678_15_0;
    (__stackOp3678_15_0)[0] = life6_45;
    life4_20 = spill3678_7;
    }
    spill3678_8 = life4_20;
    if (!((life3_5 == null))) {
        forwardValue3678_91_0 = spill3678_8;
        break forward_join_91;
    }
    forwardValue3678_81_0 = (spill3678_8).length;
    }
    if (!((forwardValue3678_81_0 > 2))) {
        break forward_join_90;
    }
    java.lang.String[] __stackOp3678_16_0 = new java.lang.String[1];
    spill3678_9 = __stackOp3678_16_0;
    (__stackOp3678_16_0)[0] = p0;
    life4_20 = spill3678_9;
    }
    forwardValue3678_91_0 = life4_20;
    }
    life5_119 = (forwardValue3678_91_0)[0];
    spill3678_10 = (life4_20).length;
    if (!((life3_5 == null))) {
        forwardValue3678_109_0 = spill3678_10;
        break forward_join_109;
    }
    if (!((spill3678_10 > 1))) {
        break forward_join_110;
    }
    forwardValue3678_109_0 = moom.jK.a(((java.lang.String)((life4_20)[1])), ((int)(__sourceIntrinsic_df4cf2482ffb_invokedynamic3678_17(13993, (6591150872067813320L ^ life1_3)))));
    }
    forwardValue3678_115_0 = forwardValue3678_109_0;
    break forward_join_115;
    }
    forwardValue3678_115_0 = __sourceIntrinsic_df4cf2482ffb_invokedynamic3678_19(13648, (1446260638821329968L ^ life1_3));
    }
    life6_147 = forwardValue3678_115_0;
    if (!((life6_147 == __sourceIntrinsic_df4cf2482ffb_invokedynamic3678_20(13648, (1446260638821329968L ^ life1_3))))) {
        break forward_join_140;
    }
    life7_157 = moom.jK.a__ArrayString(((java.lang.String)(life5_119)));
    life5_119 = (life7_157)[0];
    life6_147 = moom.jK.a(((java.lang.String)((life7_157)[1])), ((int)(__sourceIntrinsic_df4cf2482ffb_invokedynamic3678_22(13648, (1446260638821329968L ^ life1_3)))));
    }
    return new moom.jK(life5_119, life6_147);
}


private static java.lang.String[] a__ArrayString(java.lang.String p0) {
long local1 = (moom.jK.c ^ 5186411604757L);
    try {
        java.lang.Object local3 = "com.sun.jndi.dns.DnsContextFactory";
        java.lang.Class.forName(((java.lang.String)("com.sun.jndi.dns.DnsContextFactory")));
        java.util.Hashtable local4 = new java.util.Hashtable();
        ((java.util.Hashtable)(local4)).put(((java.lang.Object)("java.naming.factory.initial")), ((java.lang.Object)("com.sun.jndi.dns.DnsContextFactory")));
        ((java.util.Hashtable)(local4)).put(((java.lang.Object)("java.naming.provider.url")), ((java.lang.Object)("dns:")));
        ((java.util.Hashtable)(local4)).put(((java.lang.Object)("com.sun.jndi.dns.timeout.retries")), ((java.lang.Object)("1")));
        javax.naming.directory.InitialDirContext local5 = new javax.naming.directory.InitialDirContext(local4);
        javax.naming.directory.Attributes local6 = ((javax.naming.directory.DirContext)(local5)).getAttributes(((java.lang.String)(__sourceIntrinsic_fa9b96cb207e_invokedynamic8139_5(p0))), ((java.lang.String[])(new java.lang.String[] {"SRV"})));
        java.lang.String[] local7 = ((java.lang.String)(((java.lang.Object)(((javax.naming.directory.Attribute)(((javax.naming.directory.Attributes)(local6)).get(((java.lang.String)("srv"))))).get())).toString())).split(((java.lang.String)(" ")), ((int)(4)));
        return new java.lang.String[] {(local7)[3], (local7)[2]};
    } catch (java.lang.Throwable caught3) {
        return new java.lang.String[] {p0, java.lang.Integer.toString(((int)(__sourceIntrinsic_fa9b96cb207e_invokedynamic8139_11(13648, (1446267648289481834L ^ local1)))))};
    }
}


private static int a(java.lang.String p0, int p1) {
try {
        return java.lang.Integer.parseInt(((java.lang.String)(((java.lang.String)(p0)).trim())));
    } catch (java.lang.Exception caught2) {
        return p1;
    }
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8137_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_df4cf2482ffb_invokedynamic3678_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_df4cf2482ffb_invokedynamic3678_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_df4cf2482ffb_invokedynamic3678_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_df4cf2482ffb_invokedynamic3678_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fa9b96cb207e_invokedynamic8139_5(java.lang.String a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fa9b96cb207e_invokedynamic8139_11(int a0, long a1) throws E;
}
