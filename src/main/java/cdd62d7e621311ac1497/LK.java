package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class LK implements moom.LJ {

private static final long a;

private static final java.lang.String b;

private static final long[] c;

private static final java.lang.Integer[] d;

private static final java.util.Map e;

public LK() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(1522726096099209129L)), ((long)(-5796807519987604064L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(227774364576946L)))));
    long local11_life6 = (moom.LK.a ^ 57237603004071L);
    javax.crypto.Cipher local13_life8;
    javax.crypto.Cipher __sourceSpill669_10 = (local13_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill669_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill669_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill669_13 = new byte[8];
    (__sourceSpill669_13)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local14_life14 = 1;
    while ((local14_life14 < 8)) {
        (__sourceSpill669_13)[local14_life14] = ((byte) ((int) ((local11_life6 << (local14_life14 * 8)) >>> 56)));
        local14_life14 += 1;
    }
    byte[] __sourcePreallocation669_15 = __sourceSpill669_13;
    ((javax.crypto.Cipher)(__sourceSpill669_10)).init(((int)(__sourceSpill669_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill669_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation669_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill669_19 = ((java.lang.String)("¼2Iócrêí%Îu\034C\002¸TGN±Â®\000ZôCÒ")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill669_20 = local13_life8;
    byte[] local15_life22 = ((javax.crypto.Cipher)(__sourceSpill669_20)).doFinal(((byte[])(__sourceSpill669_19)));
    b = ((java.lang.String)(((java.lang.String)(moom.LK.a(((byte[])(local15_life22))))).intern()));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life28;
    javax.crypto.Cipher __sourceSpill669_30 = (local0_life28 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill669_31 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill669_32 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill669_33 = new byte[8];
    (__sourceSpill669_33)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life34 = 1;
    while ((local1_life34 < 8)) {
        (__sourceSpill669_33)[local1_life34] = ((byte) ((int) ((local11_life6 << (local1_life34 * 8)) >>> 56)));
        local1_life34 += 1;
    }
    byte[] __sourcePreallocation669_35 = __sourceSpill669_33;
    ((javax.crypto.Cipher)(__sourceSpill669_30)).init(((int)(__sourceSpill669_31)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill669_32)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation669_35)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life38 = new long[8];
    int local3_life39 = 0;
    java.lang.String local4_life40;
    int local5_life42 = ((java.lang.String)((local4_life40 = "»IªË'éò6\\Hs,ïU¢¢$_Ð%êtø¶Ï±\027\t\006Í|Ôû5òY3þ"))).length();
    int local2_life43 = 0;
    do {
        java.lang.String __sourceSpill669_44 = local4_life40;
        int __sourceSpill669_45 = local2_life43;
        local2_life43 += 8;
        byte[] local7_life48 = ((java.lang.String)(((java.lang.String)(__sourceSpill669_44)).substring(((int)(__sourceSpill669_45)), ((int)(local2_life43))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill669_49 = local6_life38;
        int __sourceSpill669_50 = local3_life39;
        local3_life39 += 1;
        long local8_life51 = (((((((((((long) (local7_life48)[0]) & 255L) << 56) | ((((long) (local7_life48)[1]) & 255L) << 48)) | ((((long) (local7_life48)[2]) & 255L) << 40)) | ((((long) (local7_life48)[3]) & 255L) << 32)) | ((((long) (local7_life48)[4]) & 255L) << 24)) | ((((long) (local7_life48)[5]) & 255L) << 16)) | ((((long) (local7_life48)[6]) & 255L) << 8)) | (((long) (local7_life48)[7]) & 255L));
        byte[] __sourceSpill669_52 = new byte[8];
        (__sourceSpill669_52)[0] = ((byte) ((int) (local8_life51 >>> 56)));
        (__sourceSpill669_52)[1] = ((byte) ((int) (local8_life51 >>> 48)));
        (__sourceSpill669_52)[2] = ((byte) ((int) (local8_life51 >>> 40)));
        (__sourceSpill669_52)[3] = ((byte) ((int) (local8_life51 >>> 32)));
        (__sourceSpill669_52)[4] = ((byte) ((int) (local8_life51 >>> 24)));
        (__sourceSpill669_52)[5] = ((byte) ((int) (local8_life51 >>> 16)));
        (__sourceSpill669_52)[6] = ((byte) ((int) (local8_life51 >>> 8)));
        (__sourceSpill669_52)[7] = ((byte) ((int) local8_life51));
        javax.crypto.Cipher __sourceSpill669_53 = local0_life28;
        byte[] local10_life55 = ((javax.crypto.Cipher)(__sourceSpill669_53)).doFinal(((byte[])(__sourceSpill669_52)));
        (__sourceSpill669_49)[__sourceSpill669_50] = (((((((((((long) (local10_life55)[0]) & 255L) << 56) | ((((long) (local10_life55)[1]) & 255L) << 48)) | ((((long) (local10_life55)[2]) & 255L) << 40)) | ((((long) (local10_life55)[3]) & 255L) << 32)) | ((((long) (local10_life55)[4]) & 255L) << 24)) | ((((long) (local10_life55)[5]) & 255L) << 16)) | ((((long) (local10_life55)[6]) & 255L) << 8)) | (((long) (local10_life55)[7]) & 255L));
    } while ((!(local2_life43 >= local5_life42)));
    local5_life42 = ((java.lang.String)((local4_life40 = "ÂLòëæö±Ëû=¨â3"))).length();
    local2_life43 = 0;
    do {
        java.lang.String __sourceSpill669_57 = local4_life40;
        int __sourceSpill669_58 = local2_life43;
        local2_life43 += 8;
        byte[] local7_life61 = ((java.lang.String)(((java.lang.String)(__sourceSpill669_57)).substring(((int)(__sourceSpill669_58)), ((int)(local2_life43))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill669_62 = local6_life38;
        int __sourceSpill669_63 = local3_life39;
        local3_life39 += 1;
        long local8_life64 = (((((((((((long) (local7_life61)[0]) & 255L) << 56) | ((((long) (local7_life61)[1]) & 255L) << 48)) | ((((long) (local7_life61)[2]) & 255L) << 40)) | ((((long) (local7_life61)[3]) & 255L) << 32)) | ((((long) (local7_life61)[4]) & 255L) << 24)) | ((((long) (local7_life61)[5]) & 255L) << 16)) | ((((long) (local7_life61)[6]) & 255L) << 8)) | (((long) (local7_life61)[7]) & 255L));
        byte[] __sourceSpill669_65 = new byte[8];
        (__sourceSpill669_65)[0] = ((byte) ((int) (local8_life64 >>> 56)));
        (__sourceSpill669_65)[1] = ((byte) ((int) (local8_life64 >>> 48)));
        (__sourceSpill669_65)[2] = ((byte) ((int) (local8_life64 >>> 40)));
        (__sourceSpill669_65)[3] = ((byte) ((int) (local8_life64 >>> 32)));
        (__sourceSpill669_65)[4] = ((byte) ((int) (local8_life64 >>> 24)));
        (__sourceSpill669_65)[5] = ((byte) ((int) (local8_life64 >>> 16)));
        (__sourceSpill669_65)[6] = ((byte) ((int) (local8_life64 >>> 8)));
        (__sourceSpill669_65)[7] = ((byte) ((int) local8_life64));
        javax.crypto.Cipher __sourceSpill669_66 = local0_life28;
        byte[] local10_life68 = ((javax.crypto.Cipher)(__sourceSpill669_66)).doFinal(((byte[])(__sourceSpill669_65)));
        (__sourceSpill669_62)[__sourceSpill669_63] = (((((((((((long) (local10_life68)[0]) & 255L) << 56) | ((((long) (local10_life68)[1]) & 255L) << 48)) | ((((long) (local10_life68)[2]) & 255L) << 40)) | ((((long) (local10_life68)[3]) & 255L) << 32)) | ((((long) (local10_life68)[4]) & 255L) << 24)) | ((((long) (local10_life68)[5]) & 255L) << 16)) | ((((long) (local10_life68)[6]) & 255L) << 8)) | (((long) (local10_life68)[7]) & 255L));
    } while ((!(local2_life43 >= local5_life42)));
    c = ((long[])(local6_life38));
    d = ((java.lang.Integer[])(new java.lang.Integer[8]));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
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
        byte[] spill3011_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3011_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3011_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3011_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3011_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3011_2)[life4_9];
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
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x4711;
        if (d[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = c[n4];
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
                throw new RuntimeException("moom/LK", exception);
            }
            int n8 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            LK.d[n4] = n8;
        }
        return d[n4];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.LK.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5879_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/LK"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a() {
return ((1) != 0);
}


public java.lang.String[] a(moom.gc p0, int p1) {
int forwardValue2560_18_0;
    moom.gc forwardValue2560_20_0;
    int spill2560_0;
    moom.gc spill2560_1;
    long life3_3;
    int[] life5_5;
    moom.gw life6_29;
    moom.bW life7_38;
    forward_join_26: {
    forward_join_24: {
    forward_join_20: {
    forward_join_18: {
    forward_join_14: {
    life3_3 = (moom.LK.a ^ 57319767687902L);
    life5_5 = moom.LL.b();
    spill2560_0 = ((p0 instanceof moom.gv) ? 1 : 0);
    if (!((life5_5 == null))) {
        forwardValue2560_18_0 = spill2560_0;
        break forward_join_18;
    }
    if (!((spill2560_0 != 0))) {
        break forward_join_14;
    }
    return moom.LL.a(((java.lang.String)(moom.LK.b)));
    }
    spill2560_1 = p0;
    if (!((life5_5 == null))) {
        forwardValue2560_20_0 = spill2560_1;
        break forward_join_20;
    }
    forwardValue2560_18_0 = ((spill2560_1 instanceof moom.gw) ? 1 : 0);
    }
    if (!((forwardValue2560_18_0 != 0))) {
        break forward_join_24;
    }
    forwardValue2560_20_0 = p0;
    }
    life6_29 = ((moom.gw)(forwardValue2560_20_0));
    if (!((life5_5 != null))) {
        break forward_join_26;
    }
    }
    return null;
    }
    life7_38 = ((moom.gw)(life6_29)).a__sourceReturn_128cc006c0();
    return this.a(((moom.bW)(life7_38)));
}


private java.lang.String[] a(moom.bW p0) {
return moom.LL.a(((java.lang.String)(((moom.bW)(p0)).a())));
}


public java.awt.Rectangle a(net.minecraft.client.gui.GuiScreen p0, int p1, int p2) {
int forwardValue2561_44_0;
    int forwardValue2561_44_1;
    int forwardValue2561_60_0;
    int forwardValue2561_60_1;
    int[] spill2561_0;
    int spill2561_1;
    int spill2561_2;
    long life4_3;
    int life7_13;
    int[] life6_14;
    int life8_20;
    int life9_67;
    int life10_81;
    forward_join_60: {
    forward_join_48: {
    forward_join_44: {
    forward_join_36: {
    life4_3 = (moom.LK.a ^ 59672102139995L);
    spill2561_0 = moom.LL.b();
    life7_13 = (((net.minecraft.client.gui.GuiScreen)(p0)).k - __sourceIntrinsic_ceb6eec2aa6a_invokedynamic2561_3(25985, (3868158043835254218L ^ life4_3)));
    life6_14 = spill2561_0;
    life8_20 = __sourceIntrinsic_ceb6eec2aa6a_invokedynamic2561_4(25179, (4610500150679978514L ^ life4_3));
    spill2561_1 = life7_13;
    spill2561_2 = __sourceIntrinsic_ceb6eec2aa6a_invokedynamic2561_5(23249, (3957666629159811741L ^ life4_3));
    if (!((life6_14 == null))) {
        forwardValue2561_44_0 = spill2561_1;
        forwardValue2561_44_1 = spill2561_2;
        break forward_join_44;
    }
    if (!((spill2561_1 < spill2561_2))) {
        break forward_join_36;
    }
    life7_13 = __sourceIntrinsic_ceb6eec2aa6a_invokedynamic2561_6(28675, (5183994088895074381L ^ life4_3));
    }
    forwardValue2561_44_0 = p2;
    forwardValue2561_44_1 = (life8_20 + __sourceIntrinsic_ceb6eec2aa6a_invokedynamic2561_7(1958, (6495640156341643244L ^ life4_3)));
    }
    if (!((life6_14 == null))) {
        forwardValue2561_60_0 = forwardValue2561_44_0;
        forwardValue2561_60_1 = forwardValue2561_44_1;
        break forward_join_60;
    }
    if (!((forwardValue2561_44_0 <= forwardValue2561_44_1))) {
        break forward_join_48;
    }
    life8_20 += 100;
    }
    forwardValue2561_60_0 = (life7_13 + __sourceIntrinsic_ceb6eec2aa6a_invokedynamic2561_8(13159, (3354234104943383338L ^ life4_3)));
    forwardValue2561_60_1 = __sourceIntrinsic_ceb6eec2aa6a_invokedynamic2561_9(28964, (8873150366367535467L ^ life4_3));
    }
    life9_67 = (forwardValue2561_60_0 + forwardValue2561_60_1);
    life10_81 = ((life8_20 + __sourceIntrinsic_ceb6eec2aa6a_invokedynamic2561_10(20534, (3211432365685108862L ^ life4_3))) + __sourceIntrinsic_ceb6eec2aa6a_invokedynamic2561_11(28675, (5183994088895074381L ^ life4_3)));
    return new java.awt.Rectangle(life7_13, life8_20, (life9_67 - life7_13), (life10_81 - life8_20));
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5879_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ceb6eec2aa6a_invokedynamic2561_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ceb6eec2aa6a_invokedynamic2561_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ceb6eec2aa6a_invokedynamic2561_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ceb6eec2aa6a_invokedynamic2561_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ceb6eec2aa6a_invokedynamic2561_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ceb6eec2aa6a_invokedynamic2561_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ceb6eec2aa6a_invokedynamic2561_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ceb6eec2aa6a_invokedynamic2561_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ceb6eec2aa6a_invokedynamic2561_11(int a0, long a1) throws E;
}
