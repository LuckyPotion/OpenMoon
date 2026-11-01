package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class NG {

private static java.util.ArrayDeque<int[]> a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

public NG() {
super();
}

private static native <E extends Throwable> void __sourceHandlerCall_c7991b0275f9fb956765(int[] a0) throws E;
private static final class __SourceHandler_c7991b0275f9fb956765 {

public static void f141(int[] p0) throws Throwable {
    int forwardValue141_19_0;
    int spill141_0;
    long life1_3;
    int life3_5;
    forward_join_20: {
    forward_join_19: {
    life1_3 = (__fieldRead141_0() ^ 139673181092967L);
    life3_5 = __call141_1();
    spill141_0 = __call141_3(__fieldRead141_2());
    if (!((life3_5 != 0))) {
        forwardValue141_19_0 = spill141_0;
        break forward_join_19;
    }
    if (!((spill141_0 < __invokedynamic141_4(21185, (7654985700165673203L ^ life1_3))))) {
        break forward_join_20;
    }
    forwardValue141_19_0 = __integerCategory141_7(__call141_6(__fieldRead141_5(), p0));
    }
    __discardScalar141_8(forwardValue141_19_0);
    }
    return;
}
public static void h141_0(moom.Oo p0) throws Throwable {
    throw __call1014100_0(p0);
}
public static void h141_1(moom.Oo p0) throws Throwable {
    throw __call1014101_0(p0);
}
private static native long __fieldRead141_0() throws Throwable;
private static native int __call141_1() throws Throwable;
private static native java.util.ArrayDeque __fieldRead141_2() throws Throwable;
private static native int __call141_3(java.util.ArrayDeque a0) throws Throwable;
private static native int __invokedynamic141_4(int a0, long a1) throws Throwable;
private static native java.util.ArrayDeque __fieldRead141_5() throws Throwable;
private static native boolean __call141_6(java.util.ArrayDeque a0, int[] a1) throws Throwable;
private static native int __integerCategory141_7(boolean value) throws Throwable;
private static native void __discardScalar141_8(int a0) throws Throwable;
private static native java.lang.Exception __call1014100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1014101_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int[] __sourceHandlerCall_0009b44bd0704de552a4(int a0) throws E;
private static final class __SourceHandler_0009b44bd0704de552a4 {

public static int[] f974(int p0) throws Throwable {
    int[] forwardValue974_22_0;
    int[] forwardValue974_24_0;
    int spill974_0;
    int[] spill974_1;
    int[] spill974_2;
    long life1_3;
    int[] life4_8;
    int life3_9;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_20: {
    life1_3 = (__fieldRead974_0() ^ 93670002854750L);
    spill974_0 = __call974_1();
    life4_8 = __cast974_4(__call974_3(__fieldRead974_2()));
    life3_9 = spill974_0;
    spill974_1 = life4_8;
    if (!((life3_9 != 0))) {
        forwardValue974_22_0 = spill974_1;
        break forward_join_22;
    }
    if (!((spill974_1 != null))) {
        break forward_join_20;
    }
    spill974_2 = life4_8;
    if (!((life3_9 != 0))) {
        forwardValue974_24_0 = spill974_2;
        break forward_join_24;
    }
    if (!(((spill974_2).length < p0))) {
        break forward_join_23;
    }
    }
    forwardValue974_22_0 = new int[p0];
    }
    life4_8 = forwardValue974_22_0;
    }
    forwardValue974_24_0 = life4_8;
    }
    return forwardValue974_24_0;
}
public static void h974_0(moom.Oo p0) throws Throwable {
    throw __call1097400_0(p0);
}
public static void h974_1(moom.Oo p0) throws Throwable {
    throw __call1097401_0(p0);
}
public static void h974_2(moom.Oo p0) throws Throwable {
    throw __call1097402_0(p0);
}
public static void h974_3(moom.Oo p0) throws Throwable {
    throw __call1097403_0(p0);
}
private static native long __fieldRead974_0() throws Throwable;
private static native int __call974_1() throws Throwable;
private static native java.util.ArrayDeque __fieldRead974_2() throws Throwable;
private static native java.lang.Object __call974_3(java.util.ArrayDeque a0) throws Throwable;
private static native int[] __cast974_4(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1097400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1097401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1097402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1097403_0(moom.Oo a0) throws Throwable;

}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(5378841493409543757L)), ((long)(-5540164604233419543L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(53521614153719L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.NG.b ^ 140184097272883L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill722_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill722_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill722_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill722_14 = new byte[8];
    (__sourceSpill722_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill722_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation722_16 = __sourceSpill722_14;
    ((javax.crypto.Cipher)(__sourceSpill722_11)).init(((int)(__sourceSpill722_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill722_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation722_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[5];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "BÒRöå\f,hdÔÌÍi¡?\030oîK\034\034\035\035íÃÕ=D6®w\030cgewÐ\177¦¹ªE ß/Æ5ù@N\020À££ÞÁT¿ú\013\000pÈmL"))).length();
    int local16_life24 = 32;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill722_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill722_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill722_29)).doFinal(((byte[])(__sourceSpill722_28)));
        java.lang.String __sourceSpill722_34 = ((java.lang.String)(moom.NG.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill722_35 = local20_life19;
        int __sourceSpill722_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill722_35)[__sourceSpill722_36] = __sourceSpill722_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "½w\001S&uN\n\016Þ°Dn4¥| æ<¶\020Jë¨Ð½¯]Ô;{w\f=÷Î"))).length();
    local16_life24 = 24;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill722_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill722_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill722_42)).doFinal(((byte[])(__sourceSpill722_41)));
        java.lang.String __sourceSpill722_47 = ((java.lang.String)(moom.NG.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill722_48 = local20_life19;
        int __sourceSpill722_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill722_48)[__sourceSpill722_49] = __sourceSpill722_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    c = ((java.lang.String[])(local20_life19));
    d = ((java.lang.String[])(new java.lang.String[5]));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill722_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill722_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill722_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill722_60 = new byte[8];
    (__sourceSpill722_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill722_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation722_62 = __sourceSpill722_60;
    ((javax.crypto.Cipher)(__sourceSpill722_57)).init(((int)(__sourceSpill722_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill722_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation722_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[3];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "üâ¬Ç2üNRÄAc\017;s×^ÅäÎ\tr"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill722_71 = local4_life67;
        int __sourceSpill722_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill722_71)).substring(((int)(__sourceSpill722_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill722_76 = local6_life65;
        int __sourceSpill722_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill722_79 = new byte[8];
        (__sourceSpill722_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill722_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill722_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill722_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill722_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill722_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill722_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill722_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill722_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill722_80)).doFinal(((byte[])(__sourceSpill722_79)));
        (__sourceSpill722_76)[__sourceSpill722_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    f = ((long[])(local6_life65));
    g = ((java.lang.Integer[])(new java.lang.Integer[3]));
    a = ((java.util.ArrayDeque)(new java.util.ArrayDeque()));
}


public static void main(java.lang.String[] p0) throws java.lang.Exception {
long life1_9;
    int life4_16;
    int life3_17;
    int life5_23;
    long life6_48;
    long life8_52;
    long life10_56;
    long life12_60;
    long life14_65;
    life1_9 = (((moom._a)(moom._c.a(((long)(-3247877432672728489L)), ((long)(-3721034712147305811L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(276236612802904L))) ^ 36765351833083L);
    int spill2798_0 = moom.Ob.c();
    life4_16 = __sourceIntrinsic_0809c461f4f8_invokedynamic2798_5(28093, (37610568195785805L ^ life1_9));
    life3_17 = spill2798_0;
    life5_23 = __sourceIntrinsic_0809c461f4f8_invokedynamic2798_6(32416, (352220949162284882L ^ life1_9));
    moom.NG.b(((int)(life4_16)), ((int)(life5_23)));
    moom.NG.a(((int)(life4_16)), ((int)(life5_23)));
    moom.NG.d(((int)(life4_16)), ((int)(life5_23)));
    moom.NG.c(((int)(life4_16)), ((int)(life5_23)));
    moom.NG.a(((java.lang.Class)(net.minecraft.block.state.IBlockState.class)), ((int)(life4_16)), ((int)(life5_23)));
    life6_48 = moom.NG.b(((int)(life4_16)), ((int)(life5_23)));
    life8_52 = moom.NG.a(((int)(life4_16)), ((int)(life5_23)));
    life10_56 = moom.NG.d(((int)(life4_16)), ((int)(life5_23)));
    life12_60 = moom.NG.c(((int)(life4_16)), ((int)(life5_23)));
    life14_65 = moom.NG.a(((java.lang.Class)(net.minecraft.block.state.IBlockState.class)), ((int)(life4_16)), ((int)(life5_23)));
    long __stackOp2798_20_0 = life6_48;
    java.lang.String __stackOp2798_20_1 = __sourceIntrinsic_0809c461f4f8_invokedynamic2798_19(10352, (933329958007051784L ^ life1_9));
    java.lang.String spill2798_1 = __stackOp2798_20_1;
    long spill2798_2 = __stackOp2798_20_0;
    recovery.source.CarrierOps.discard(__stackOp2798_20_1);
    moom.BU.b__Void(((java.lang.String)(__sourceIntrinsic_0809c461f4f8_invokedynamic2798_22(spill2798_1, spill2798_2))));
    long __stackOp2798_25_0 = life8_52;
    java.lang.String __stackOp2798_25_1 = __sourceIntrinsic_0809c461f4f8_invokedynamic2798_24(12728, (6208677521626959814L ^ life1_9));
    java.lang.String spill2798_3 = __stackOp2798_25_1;
    long spill2798_4 = __stackOp2798_25_0;
    recovery.source.CarrierOps.discard(__stackOp2798_25_1);
    moom.BU.b__Void(((java.lang.String)(__sourceIntrinsic_0809c461f4f8_invokedynamic2798_27(spill2798_3, spill2798_4))));
    long __stackOp2798_30_0 = life10_56;
    java.lang.String __stackOp2798_30_1 = __sourceIntrinsic_0809c461f4f8_invokedynamic2798_29(7561, (4184640646716761077L ^ life1_9));
    java.lang.String spill2798_5 = __stackOp2798_30_1;
    long spill2798_6 = __stackOp2798_30_0;
    recovery.source.CarrierOps.discard(__stackOp2798_30_1);
    moom.BU.b__Void(((java.lang.String)(__sourceIntrinsic_0809c461f4f8_invokedynamic2798_32(spill2798_5, spill2798_6))));
    long __stackOp2798_35_0 = life12_60;
    java.lang.String __stackOp2798_35_1 = __sourceIntrinsic_0809c461f4f8_invokedynamic2798_34(9320, (8544309897117800983L ^ life1_9));
    java.lang.String spill2798_7 = __stackOp2798_35_1;
    long spill2798_8 = __stackOp2798_35_0;
    recovery.source.CarrierOps.discard(__stackOp2798_35_1);
    moom.BU.b__Void(((java.lang.String)(__sourceIntrinsic_0809c461f4f8_invokedynamic2798_37(spill2798_7, spill2798_8))));
    long __stackOp2798_40_0 = life14_65;
    java.lang.String __stackOp2798_40_1 = __sourceIntrinsic_0809c461f4f8_invokedynamic2798_39(14786, (7426223628972328895L ^ life1_9));
    java.lang.String spill2798_9 = __stackOp2798_40_1;
    long spill2798_10 = __stackOp2798_40_0;
    recovery.source.CarrierOps.discard(__stackOp2798_40_1);
    moom.BU.b__Void(((java.lang.String)(__sourceIntrinsic_0809c461f4f8_invokedynamic2798_42(spill2798_9, spill2798_10))));
    if ((life3_17 == 0)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[1])));
    }
    return;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.NG.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static long b(int p0, int p1) {
int spill995_0;
    long life2_3;
    long life5_6;
    int life4_7;
    int life7_9;
    int[] life8_17;
    long life7_22;
    lexical_join_21: {
    life2_3 = (moom.NG.b ^ 50703030894652L);
    spill995_0 = moom.Ob.c();
    life5_6 = java.lang.System.currentTimeMillis();
    life4_7 = spill995_0;
    life7_9 = 0;
    lexical_cycle_10: while (true) {
    if (!((life7_9 < p1))) {
        break lexical_join_21;
    }
    life8_17 = ((int[])(java.lang.reflect.Array.newInstance(((java.lang.Class)(java.lang.Integer.TYPE)), ((int)(p0)))));
    life7_9 += 1;
    if (!((life4_7 == 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    life7_22 = java.lang.System.currentTimeMillis();
    return (life7_22 - life5_6);
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x3B6A;
        if (g[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = f[n2];
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
                throw new RuntimeException("moom/NG", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            NG.g[n2] = n4;
        }
        return g[n2];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6565_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/NG"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long c(int p0, int p1) {
int spill996_0;
    long life2_3;
    long life5_6;
    int life4_7;
    net.minecraft.block.state.IBlockState[] life7_10;
    int life8_12;
    net.minecraft.block.state.IBlockState[] life9_19;
    long life8_24;
    lexical_join_23: {
    life2_3 = (moom.NG.b ^ 35058385211495L);
    spill996_0 = moom.Ob.b();
    life5_6 = java.lang.System.currentTimeMillis();
    life4_7 = spill996_0;
    life7_10 = new net.minecraft.block.state.IBlockState[p0];
    life8_12 = 0;
    lexical_cycle_13: while (true) {
    if (!((life8_12 < p1))) {
        break lexical_join_23;
    }
    life9_19 = ((net.minecraft.block.state.IBlockState[])(((net.minecraft.block.state.IBlockState[])(life7_10)).clone()));
    life8_12 += 1;
    if (!((life4_7 != 0))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    life8_24 = java.lang.System.currentTimeMillis();
    return (life8_24 - life5_6);
}


private static long d(int p0, int p1) {
int spill997_0;
    long life2_3;
    long life5_5;
    int life7_8;
    int life4_9;
    net.minecraft.block.state.IBlockState[] life8_15;
    long life7_20;
    lexical_join_19: {
    life2_3 = (moom.NG.b ^ 597639823729L);
    life5_5 = java.lang.System.currentTimeMillis();
    spill997_0 = moom.Ob.c();
    life7_8 = 0;
    life4_9 = spill997_0;
    lexical_cycle_10: while (true) {
    if (!((life7_8 < p1))) {
        break lexical_join_19;
    }
    life8_15 = new net.minecraft.block.state.IBlockState[p0];
    life7_8 += 1;
    if (!((life4_9 == 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    life7_20 = java.lang.System.currentTimeMillis();
    return (life7_20 - life5_5);
}


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 11494);
    if (((moom.NG.d)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.NG.e)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.NG.e)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/NG", life9_51);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_71: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life4_21)[1])))).generateSecret(((java.security.spec.KeySpec)(life7_92)));
        ((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).init(((int)(2)), ((java.security.Key)(life8_99)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life4_21)[2])))));
        life9_116 = ((java.lang.String)((moom.NG.c)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.NG.d)[life5_8] = moom.NG.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.NG.d)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.NG.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6569_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/NG"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static synchronized void a(int[] p0) { __sourceHandlerCall_c7991b0275f9fb956765(p0); }


private static long a(int p0, int p1) {
int spill993_0;
    long life2_3;
    long life5_6;
    int life4_7;
    int[] life7_10;
    int life8_12;
    int[] life9_19;
    long life8_24;
    lexical_join_23: {
    life2_3 = (moom.NG.b ^ 10527224285447L);
    spill993_0 = moom.Ob.c();
    life5_6 = java.lang.System.currentTimeMillis();
    life4_7 = spill993_0;
    life7_10 = new int[p0];
    life8_12 = 0;
    lexical_cycle_13: while (true) {
    if (!((life8_12 < p1))) {
        break lexical_join_23;
    }
    life9_19 = ((int[])(((int[])(life7_10)).clone()));
    life8_12 += 1;
    if (!((life4_7 == 0))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    life8_24 = java.lang.System.currentTimeMillis();
    return (life8_24 - life5_6);
}


private static long a(java.lang.Class p0, int p1, int p2) {
int spill994_0;
    long life3_3;
    long life6_6;
    int life5_7;
    int life8_9;
    java.lang.Object[] life9_17;
    long life8_22;
    lexical_join_21: {
    life3_3 = (moom.NG.b ^ 71744147249301L);
    spill994_0 = moom.Ob.c();
    life6_6 = java.lang.System.currentTimeMillis();
    life5_7 = spill994_0;
    life8_9 = 0;
    lexical_cycle_10: while (true) {
    if (!((life8_9 < p2))) {
        break lexical_join_21;
    }
    life9_17 = ((java.lang.Object[])(java.lang.reflect.Array.newInstance(((java.lang.Class)(p0)), ((int)(p1)))));
    life8_9 += 1;
    if (!((life5_7 == 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    life8_22 = java.lang.System.currentTimeMillis();
    return (life8_22 - life6_6);
}


private static synchronized int[] a(int p0) { return __sourceHandlerCall_0009b44bd0704de552a4(p0); }


private static java.lang.Exception a(java.lang.Exception p0) {
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
        byte[] spill3306_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3306_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3306_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3306_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3306_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3306_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static native <E extends Throwable> int __sourceIntrinsic_0809c461f4f8_invokedynamic2798_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0809c461f4f8_invokedynamic2798_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0809c461f4f8_invokedynamic2798_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0809c461f4f8_invokedynamic2798_22(java.lang.String a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0809c461f4f8_invokedynamic2798_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0809c461f4f8_invokedynamic2798_27(java.lang.String a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0809c461f4f8_invokedynamic2798_29(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0809c461f4f8_invokedynamic2798_32(java.lang.String a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0809c461f4f8_invokedynamic2798_34(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0809c461f4f8_invokedynamic2798_37(java.lang.String a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0809c461f4f8_invokedynamic2798_39(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0809c461f4f8_invokedynamic2798_42(java.lang.String a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6565_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6569_0() throws E;
}
