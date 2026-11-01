package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class JQ {

private java.lang.String a;

private int b;

private int c;

private int[] d;

private boolean e;

private int[][] f;

private java.nio.IntBuffer[] g;

private java.awt.Dimension[] h;

private static long i;

private static java.lang.String[] j;

private static java.lang.String[] k;

private static java.util.Map l;

private static long[] m;

private static java.lang.Integer[] n;

private static java.util.Map o;

public JQ(java.lang.String p0, int p1, int p2, int[] p3, boolean p4) { super(); }


private static void __sourceConstructorBody_b66b68361f79ec96(moom.JQ receiver, java.lang.String p0, int p1, int p2, int[] p3, boolean p4) throws Throwable {

moom.JQ __initValue531_42_0;

    init_join_48: {

    init_join_42: {

    long local6_life2 = (moom.JQ.i ^ 61429496473067L);

    net.minecraft.entity.Entity[] __sourceSpill531_4 = moom.JM.b__Arrayr3();

    moom.JQ.__sourceConstructorInit_b66b68361f79ec96_0(((moom.JQ)(receiver)));

    ((moom.JQ)(receiver)).a = ((java.lang.String)(p0));

    ((moom.JQ)(receiver)).b = ((int)(p1));

    ((moom.JQ)(receiver)).c = ((int)(p2));

    net.minecraft.entity.Entity[] local8_life9 = __sourceSpill531_4;

    ((moom.JQ)(receiver)).d = ((int[])(p3));

    ((moom.JQ)(receiver)).e = ((boolean)(p4));

    ((moom.JQ)(receiver)).h = ((java.awt.Dimension[])(moom.JQ.a__ArrayDimension(((int)(p1)), ((int)(p2)), ((java.lang.String)(p0)))));

    moom.JQ __sourceSpill531_14 = receiver;

    if (!((local8_life9 != null))) {

        __initValue531_42_0 = __sourceSpill531_14;

        break init_join_42;

    }

    ((moom.JQ)(__sourceSpill531_14)).f = ((int[][])(moom.JQ.a(((int[])(p3)), ((int)(p1)), ((int)(p2)), ((java.awt.Dimension[])(((moom.JQ)(receiver)).h)))));

    if (!(p4)) {

        break init_join_48;

    }

    __initValue531_42_0 = receiver;

    }

    ((moom.JQ)(__initValue531_42_0)).g = ((java.nio.IntBuffer[])(moom.JQ.a(((java.awt.Dimension[])(((moom.JQ)(receiver)).h)), ((int[][])(((moom.JQ)(receiver)).f)))));

    }

    return;

}



static {
i = ((long)(((moom._a)(moom._c.a(((long)(8085580511979858496L)), ((long)(-5054847317183927911L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(213004706021995L)))));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.JQ.i ^ 42448866206980L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill599_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill599_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill599_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill599_14 = new byte[8];
    (__sourceSpill599_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill599_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation599_16 = __sourceSpill599_14;
    ((javax.crypto.Cipher)(__sourceSpill599_11)).init(((int)(__sourceSpill599_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill599_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation599_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[2];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "æ¼Uuå¿!¡uV\030¦`2-£\000ZR\013×úz@Â]ü®ôÀ_\007|bÁçïÉ\"Ô#)V3Ã*VÉ¸|d1\022I\005­ð5ÃàÒ6È\024Ü\004Ó¼tV7AfMxv1ëÚ\001£ÆäÃ¤þ\022¿@ç¿d\022¼e,;\032c´HkÛá"))).length();
    int local16_life24 = 16;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill599_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill599_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill599_29)).doFinal(((byte[])(__sourceSpill599_28)));
        java.lang.String __sourceSpill599_34 = ((java.lang.String)(moom.JQ.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill599_35 = local20_life19;
        int __sourceSpill599_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill599_35)[__sourceSpill599_36] = __sourceSpill599_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    j = ((java.lang.String[])(local20_life19));
    k = ((java.lang.String[])(new java.lang.String[2]));
    o = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life42;
    javax.crypto.Cipher __sourceSpill599_44 = (local0_life42 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill599_45 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill599_46 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill599_47 = new byte[8];
    (__sourceSpill599_47)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life48 = 1;
    while ((local1_life48 < 8)) {
        (__sourceSpill599_47)[local1_life48] = ((byte) ((int) ((local11_life7 << (local1_life48 * 8)) >>> 56)));
        local1_life48 += 1;
    }
    byte[] __sourcePreallocation599_49 = __sourceSpill599_47;
    ((javax.crypto.Cipher)(__sourceSpill599_44)).init(((int)(__sourceSpill599_45)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill599_46)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation599_49)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life52 = new long[16];
    int local3_life53 = 0;
    java.lang.String local4_life54;
    int local5_life56 = ((java.lang.String)((local4_life54 = "ÐÝ=\013\020I\nóòä<;1 z\032\022p7­$zÅ&°gJ\0178âw-\0277*êhù¢]-|Iá%|x\f8d!¼©÷~v\000û¯êìò~,Ñd/çP4©\037\017\031}º£s\000µ#=\030\024¶_ÝçE²@-à"))).length();
    int local2_life57 = 0;
    do {
        java.lang.String __sourceSpill599_58 = local4_life54;
        int __sourceSpill599_59 = local2_life57;
        local2_life57 += 8;
        byte[] local7_life62 = ((java.lang.String)(((java.lang.String)(__sourceSpill599_58)).substring(((int)(__sourceSpill599_59)), ((int)(local2_life57))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill599_63 = local6_life52;
        int __sourceSpill599_64 = local3_life53;
        local3_life53 += 1;
        long local8_life65 = (((((((((((long) (local7_life62)[0]) & 255L) << 56) | ((((long) (local7_life62)[1]) & 255L) << 48)) | ((((long) (local7_life62)[2]) & 255L) << 40)) | ((((long) (local7_life62)[3]) & 255L) << 32)) | ((((long) (local7_life62)[4]) & 255L) << 24)) | ((((long) (local7_life62)[5]) & 255L) << 16)) | ((((long) (local7_life62)[6]) & 255L) << 8)) | (((long) (local7_life62)[7]) & 255L));
        byte[] __sourceSpill599_66 = new byte[8];
        (__sourceSpill599_66)[0] = ((byte) ((int) (local8_life65 >>> 56)));
        (__sourceSpill599_66)[1] = ((byte) ((int) (local8_life65 >>> 48)));
        (__sourceSpill599_66)[2] = ((byte) ((int) (local8_life65 >>> 40)));
        (__sourceSpill599_66)[3] = ((byte) ((int) (local8_life65 >>> 32)));
        (__sourceSpill599_66)[4] = ((byte) ((int) (local8_life65 >>> 24)));
        (__sourceSpill599_66)[5] = ((byte) ((int) (local8_life65 >>> 16)));
        (__sourceSpill599_66)[6] = ((byte) ((int) (local8_life65 >>> 8)));
        (__sourceSpill599_66)[7] = ((byte) ((int) local8_life65));
        javax.crypto.Cipher __sourceSpill599_67 = local0_life42;
        byte[] local10_life69 = ((javax.crypto.Cipher)(__sourceSpill599_67)).doFinal(((byte[])(__sourceSpill599_66)));
        (__sourceSpill599_63)[__sourceSpill599_64] = (((((((((((long) (local10_life69)[0]) & 255L) << 56) | ((((long) (local10_life69)[1]) & 255L) << 48)) | ((((long) (local10_life69)[2]) & 255L) << 40)) | ((((long) (local10_life69)[3]) & 255L) << 32)) | ((((long) (local10_life69)[4]) & 255L) << 24)) | ((((long) (local10_life69)[5]) & 255L) << 16)) | ((((long) (local10_life69)[6]) & 255L) << 8)) | (((long) (local10_life69)[7]) & 255L));
    } while ((!(local2_life57 >= local5_life56)));
    local5_life56 = ((java.lang.String)((local4_life54 = "Öñ!9V´,LK[\177\026ö"))).length();
    local2_life57 = 0;
    do {
        java.lang.String __sourceSpill599_71 = local4_life54;
        int __sourceSpill599_72 = local2_life57;
        local2_life57 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill599_71)).substring(((int)(__sourceSpill599_72)), ((int)(local2_life57))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill599_76 = local6_life52;
        int __sourceSpill599_77 = local3_life53;
        local3_life53 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill599_79 = new byte[8];
        (__sourceSpill599_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill599_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill599_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill599_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill599_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill599_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill599_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill599_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill599_80 = local0_life42;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill599_80)).doFinal(((byte[])(__sourceSpill599_79)));
        (__sourceSpill599_76)[__sourceSpill599_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life57 >= local5_life56)));
    m = ((long[])(local6_life52));
    n = ((java.lang.Integer[])(new java.lang.Integer[16]));
}

private static native <E extends Throwable> void __sourceConstructorInit_b66b68361f79ec96_0(moom.JQ a0) throws E;

private static int b(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x4434;
        if (JQ.n[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = m[n4];
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
                throw new RuntimeException("moom/JQ", exception);
            }
            int n7 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            JQ.n[n4] = n7;
        }
        return JQ.n[n4];
}


private int b(int p0, int p1) {
long local3 = (moom.JQ.i ^ 52157633014615L);
    int local5 = (((p0 & __sourceIntrinsic_b573aff3dc30_originalDynamicSite1194_1(30736, (6541058974444557902L ^ local3))) >> __sourceIntrinsic_b573aff3dc30_originalDynamicSite1194_2(14092, (4629733537110481236L ^ local3))) & __sourceIntrinsic_b573aff3dc30_originalDynamicSite1194_3(6244, (56824379124643387L ^ local3)));
    int local6 = (((p1 & __sourceIntrinsic_b573aff3dc30_originalDynamicSite1194_4(30736, (6541058974444557902L ^ local3))) >> __sourceIntrinsic_b573aff3dc30_originalDynamicSite1194_5(14092, (4629733537110481236L ^ local3))) & __sourceIntrinsic_b573aff3dc30_originalDynamicSite1194_6(6244, (56824379124643387L ^ local3)));
    return ((((local5 + p1) >> 1) << __sourceIntrinsic_b573aff3dc30_originalDynamicSite1194_7(14092, (4629733537110481236L ^ local3))) + (((local5 & __sourceIntrinsic_b573aff3dc30_originalDynamicSite1194_8(18833, (5346609337599862728L ^ local3))) + (local6 & __sourceIntrinsic_b573aff3dc30_originalDynamicSite1194_9(23033, (2188447432901081002L ^ local3)))) >> 1));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_f3216b6c26cd77(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5154_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/JQ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.JQ.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 14614);
    if (((moom.JQ.k)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.JQ.l)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.JQ.l)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/JQ", life9_51);
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
        life9_116 = ((java.lang.String)((moom.JQ.j)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.JQ.k)[life5_8] = moom.JQ.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.JQ.k)[life5_8];
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
        byte[] spill2671_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2671_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2671_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2671_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2671_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2671_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5157_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/JQ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static int[][] a(int[] p0, int p1, int p2, java.awt.Dimension[] p3) {
int lexicalValue835_146_0;
    int lexicalValue835_156_0;
    int[][] lexicalValue835_161_0;
    net.minecraft.entity.Entity[] spill835_0;
    int[][] spill835_1;
    int spill835_2;
    int spill835_3;
    int spill835_4;
    long life4_3;
    int[] life7_6;
    net.minecraft.entity.Entity[] life6_7;
    int life8_9;
    int life9_11;
    int[][] life10_15;
    int life11_17;
    java.awt.Dimension life12_25;
    int life13_28;
    int life14_31;
    int[] life15_36;
    int life16_46;
    int life17_55;
    int life18_62;
    int life19_77;
    int life20_91;
    int life21_107;
    int life22_121;
    int life23_127;
    lexical_join_161: {
    lexical_join_160: {
    life4_3 = (moom.JQ.i ^ 89695864964740L);
    spill835_0 = moom.JM.b__Arrayr3();
    life7_6 = p0;
    life6_7 = spill835_0;
    life8_9 = p1;
    life9_11 = 1;
    life10_15 = new int[(p3).length][];
    life11_17 = 0;
    lexical_cycle_18: while (true) {
    lexical_join_157: {
    lexical_join_156: {
    lexical_join_155: {
    lexical_join_146: {
    lexical_join_141: {
    if (!((life11_17 < (p3).length))) {
        break lexical_join_160;
    }
    life12_25 = (p3)[life11_17];
    life13_28 = ((java.awt.Dimension)(life12_25)).width;
    life14_31 = ((java.awt.Dimension)(life12_25)).height;
    life15_36 = new int[(life13_28 * life14_31)];
    spill835_1 = life10_15;
    if (!((life6_7 != null))) {
        lexicalValue835_161_0 = spill835_1;
        break lexical_join_161;
    }
    (spill835_1)[life11_17] = life15_36;
    life16_46 = (life11_17 + 1);
    spill835_2 = life9_11;
    if (!((life6_7 != null))) {
        lexicalValue835_146_0 = spill835_2;
        break lexical_join_146;
    }
    if (!((spill835_2 != 0))) {
        break lexical_join_141;
    }
    life17_55 = 0;
    lexical_cycle_53: while (true) {
    lexical_join_139: {
    lexical_join_138: {
    if (!((life17_55 < life13_28))) {
        break lexical_join_141;
    }
    spill835_3 = 0;
    if (!((life6_7 != null))) {
        lexicalValue835_146_0 = spill835_3;
        break lexical_join_146;
    }
    life18_62 = spill835_3;
    lexical_cycle_60: while (true) {
    if (!((life18_62 < life14_31))) {
        break lexical_join_138;
    }
    life19_77 = (life7_6)[((life17_55 * 2) + ((life18_62 * 2) * life8_9))];
    life20_91 = (life7_6)[(((life17_55 * 2) + 1) + ((life18_62 * 2) * life8_9))];
    life21_107 = (life7_6)[(((life17_55 * 2) + 1) + (((life18_62 * 2) + 1) * life8_9))];
    life22_121 = (life7_6)[((life17_55 * 2) + (((life18_62 * 2) + 1) * life8_9))];
    life23_127 = moom.JQ.a(((int)(life19_77)), ((int)(life20_91)), ((int)(life21_107)), ((int)(life22_121)));
    (life15_36)[(life17_55 + (life18_62 * life13_28))] = life23_127;
    life18_62 += 1;
    if (!((life6_7 != null))) {
        break lexical_join_139;
    }
    if (!((life6_7 == null))) { continue lexical_cycle_60; }
    break lexical_cycle_60;
    }
    }
    life17_55 += 1;
    }
    if (!((life6_7 == null))) { continue lexical_cycle_53; }
    break lexical_cycle_53;
    }
    }
    life7_6 = life15_36;
    life8_9 = life13_28;
    lexicalValue835_146_0 = life13_28;
    }
    if (!((life6_7 != null))) {
        lexicalValue835_156_0 = lexicalValue835_146_0;
        break lexical_join_156;
    }
    if (!((lexicalValue835_146_0 > 1))) {
        break lexical_join_155;
    }
    spill835_4 = life14_31;
    if (!((life6_7 != null))) {
        lexicalValue835_156_0 = spill835_4;
        break lexical_join_156;
    }
    if (!((spill835_4 <= 1))) {
        break lexical_join_157;
    }
    }
    lexicalValue835_156_0 = 0;
    }
    life9_11 = lexicalValue835_156_0;
    }
    life11_17 += 1;
    if (!((life6_7 == null))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    lexicalValue835_161_0 = life10_15;
    }
    return lexicalValue835_161_0;
}


public static int a(int p0, int p1, int p2, int p3) {
int local4 = moom.JQ.a(((int)(p0)), ((int)(p1)));
    int local5 = moom.JQ.a(((int)(p2)), ((int)(p3)));
    return moom.JQ.a(((int)(local4)), ((int)(local5)));
}


private static int a(int p0, int p1) {
int forwardValue2303_67_0;
    int forwardValue2303_77_0;
    int forwardValue2303_101_0;
    net.minecraft.entity.Entity[] spill2303_0;
    int spill2303_1;
    int spill2303_2;
    long life2_3;
    int life5_23;
    int life6_44;
    int life7_50;
    net.minecraft.entity.Entity[] life4_51;
    int life8_119;
    int life9_135;
    int life10_145;
    int life11_161;
    int life12_177;
    int life13_187;
    int life14_195;
    int life15_203;
    int life16_211;
    forward_join_101: {
    forward_join_86: {
    forward_join_77: {
    forward_join_76: {
    forward_join_67: {
    forward_join_66: {
    life2_3 = (moom.JQ.i ^ 56386687503514L);
    life5_23 = (((p0 & __sourceIntrinsic_90f211e43b08_invokedynamic2303_1(3897, (8284453387580294816L ^ life2_3))) >> __sourceIntrinsic_90f211e43b08_invokedynamic2303_2(1371, (3956233504930745546L ^ life2_3))) & __sourceIntrinsic_90f211e43b08_invokedynamic2303_3(2337, (592944183965139121L ^ life2_3)));
    spill2303_0 = moom.JM.b__Arrayr3();
    life6_44 = (((p1 & __sourceIntrinsic_90f211e43b08_invokedynamic2303_5(30736, (6541089628318642563L ^ life2_3))) >> __sourceIntrinsic_90f211e43b08_invokedynamic2303_6(14092, (4629702856702983833L ^ life2_3))) & __sourceIntrinsic_90f211e43b08_invokedynamic2303_7(6244, (56855057685336566L ^ life2_3)));
    life7_50 = ((life5_23 + life6_44) / 2);
    life4_51 = spill2303_0;
    spill2303_1 = life5_23;
    if (!((life4_51 != null))) {
        forwardValue2303_67_0 = spill2303_1;
        break forward_join_67;
    }
    if (!((spill2303_1 == 0))) {
        break forward_join_66;
    }
    spill2303_2 = life6_44;
    if (!((life4_51 != null))) {
        forwardValue2303_67_0 = spill2303_2;
        break forward_join_67;
    }
    if (!((spill2303_2 == 0))) {
        break forward_join_66;
    }
    life5_23 = 1;
    life6_44 = 1;
    if (!((life4_51 == null))) {
        break forward_join_86;
    }
    }
    forwardValue2303_67_0 = life5_23;
    }
    if (!((life4_51 != null))) {
        forwardValue2303_77_0 = forwardValue2303_67_0;
        break forward_join_77;
    }
    if (!((forwardValue2303_67_0 == 0))) {
        break forward_join_76;
    }
    p0 = p1;
    life7_50 = (life7_50 / 2);
    }
    forwardValue2303_77_0 = life6_44;
    }
    if (!((life4_51 != null))) {
        forwardValue2303_101_0 = forwardValue2303_77_0;
        break forward_join_101;
    }
    if (!((forwardValue2303_77_0 == 0))) {
        break forward_join_86;
    }
    p1 = p0;
    life7_50 = (life7_50 / 2);
    }
    forwardValue2303_101_0 = (((p0 >> __sourceIntrinsic_90f211e43b08_invokedynamic2303_8(13127, (290354125657930449L ^ life2_3))) & __sourceIntrinsic_90f211e43b08_invokedynamic2303_9(6244, (56855057685336566L ^ life2_3))) * life5_23);
    }
    life8_119 = forwardValue2303_101_0;
    life9_135 = (((p0 >> __sourceIntrinsic_90f211e43b08_invokedynamic2303_10(22817, (7629266739258265786L ^ life2_3))) & __sourceIntrinsic_90f211e43b08_invokedynamic2303_11(6244, (56855057685336566L ^ life2_3))) * life5_23);
    life10_145 = ((p0 & __sourceIntrinsic_90f211e43b08_invokedynamic2303_12(6244, (56855057685336566L ^ life2_3))) * life5_23);
    life11_161 = (((p1 >> __sourceIntrinsic_90f211e43b08_invokedynamic2303_13(17922, (6869987988108414872L ^ life2_3))) & __sourceIntrinsic_90f211e43b08_invokedynamic2303_14(6244, (56855057685336566L ^ life2_3))) * life6_44);
    life12_177 = (((p1 >> __sourceIntrinsic_90f211e43b08_invokedynamic2303_15(9939, (9054314791560441679L ^ life2_3))) & __sourceIntrinsic_90f211e43b08_invokedynamic2303_16(6244, (56855057685336566L ^ life2_3))) * life6_44);
    life13_187 = ((p1 & __sourceIntrinsic_90f211e43b08_invokedynamic2303_17(6244, (56855057685336566L ^ life2_3))) * life6_44);
    life14_195 = ((life8_119 + life11_161) / (life5_23 + life6_44));
    life15_203 = ((life9_135 + life12_177) / (life5_23 + life6_44));
    life16_211 = ((life10_145 + life13_187) / (life5_23 + life6_44));
    return ((((life7_50 << __sourceIntrinsic_90f211e43b08_invokedynamic2303_18(14092, (4629702856702983833L ^ life2_3))) | (life14_195 << __sourceIntrinsic_90f211e43b08_invokedynamic2303_19(17922, (6869987988108414872L ^ life2_3)))) | (life15_203 << __sourceIntrinsic_90f211e43b08_invokedynamic2303_20(9939, (9054314791560441679L ^ life2_3)))) | life16_211);
}


public static java.nio.IntBuffer[] a(java.awt.Dimension[] p0, int[][] p1) {
java.awt.Dimension[] lexicalValue836_13_0;
    java.nio.IntBuffer[] lexicalValue836_59_0;
    java.awt.Dimension[] spill836_0;
    java.nio.IntBuffer[] spill836_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    java.nio.IntBuffer[] life5_20;
    int life6_22;
    java.awt.Dimension life7_30;
    int life8_36;
    java.nio.IntBuffer life9_39;
    int[] life10_43;
    lexical_join_59: {
    lexical_join_58: {
    lexical_join_13: {
    lexical_join_12: {
    life2_3 = (moom.JQ.i ^ 113294269095447L);
    life4_5 = moom.JM.b__Arrayr3();
    spill836_0 = p0;
    if (!((life4_5 != null))) {
        lexicalValue836_13_0 = spill836_0;
        break lexical_join_13;
    }
    if (!((spill836_0 == null))) {
        break lexical_join_12;
    }
    return null;
    }
    lexicalValue836_13_0 = p0;
    }
    life5_20 = new java.nio.IntBuffer[(lexicalValue836_13_0).length];
    life6_22 = 0;
    lexical_cycle_18: while (true) {
    if (!((life6_22 < (p0).length))) {
        break lexical_join_58;
    }
    life7_30 = (p0)[life6_22];
    life8_36 = (((java.awt.Dimension)(life7_30)).width * ((java.awt.Dimension)(life7_30)).height);
    life9_39 = net.minecraft.client.renderer.GLAllocation.a__IntBuffer(((int)(life8_36)));
    life10_43 = (p1)[life6_22];
    ((java.nio.IntBuffer)(life9_39)).clear();
    ((java.nio.IntBuffer)(life9_39)).put(((int[])(life10_43)));
    ((java.nio.IntBuffer)(life9_39)).clear();
    spill836_1 = life5_20;
    if (!((life4_5 != null))) {
        lexicalValue836_59_0 = spill836_1;
        break lexical_join_59;
    }
    (spill836_1)[life6_22] = life9_39;
    life6_22 += 1;
    if (!((life4_5 == null))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    lexicalValue836_59_0 = life5_20;
    }
    return lexicalValue836_59_0;
}


public static void a(int p0, int p1, java.lang.String p2) {
net.minecraft.entity.Entity[] spill834_0;
    int spill834_1;
    long spill834_2;
    long life3_3;
    java.awt.Dimension[] life6_9;
    net.minecraft.entity.Entity[] life5_10;
    int life7_12;
    java.awt.Dimension life8_20;
    int life9_24;
    int life10_30;
    int life11_34;
    lexical_join_61: {
    life3_3 = (moom.JQ.i ^ 140478116863166L);
    spill834_0 = moom.JM.b__Arrayr3();
    life6_9 = moom.JQ.a__ArrayDimension(((int)(p0)), ((int)(p1)), ((java.lang.String)(p2)));
    life5_10 = spill834_0;
    life7_12 = 0;
    lexical_cycle_13: while (true) {
    if (!((life7_12 < (life6_9).length))) {
        break lexical_join_61;
    }
    life8_20 = (life6_9)[life7_12];
    spill834_1 = 24057;
    life9_24 = ((java.awt.Dimension)(life8_20)).width;
    spill834_2 = (4875728430550877258L ^ life3_3);
    life10_30 = ((java.awt.Dimension)(life8_20)).height;
    life11_34 = (life7_12 + 1);
    org.lwjgl.opengl.GL11.glTexImage2D(((int)(__sourceIntrinsic_9883aef60017_invokedynamic834_5(spill834_1, spill834_2))), ((int)(life11_34)), ((int)(__sourceIntrinsic_9883aef60017_invokedynamic834_6(20748, (3960904844164270263L ^ life3_3)))), ((int)(life9_24)), ((int)(life10_30)), ((int)(0)), ((int)(__sourceIntrinsic_9883aef60017_invokedynamic834_7(22933, (5802956658781945900L ^ life3_3)))), ((int)(__sourceIntrinsic_9883aef60017_invokedynamic834_8(1459, (4355332427902540815L ^ life3_3)))), ((java.nio.ByteBuffer)(((java.nio.ByteBuffer)(null)))));
    life7_12 += 1;
    if (!((life5_10 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return;
}


public static java.awt.Dimension[] a__ArrayDimension(int p0, int p1, java.lang.String p2) {
int lexicalValue837_53_0;
    int lexicalValue837_59_0;
    int lexicalValue837_69_0;
    int lexicalValue837_105_0;
    net.minecraft.entity.Entity[] spill837_0;
    int spill837_1;
    int spill837_2;
    int spill837_3;
    java.lang.String spill837_4;
    int spill837_5;
    long life3_3;
    int life6_7;
    net.minecraft.entity.Entity[] life5_8;
    int life7_11;
    java.util.ArrayList life8_34;
    int life9_36;
    int life10_38;
    int life11_92;
    java.awt.Dimension life12_98;
    int life13_108;
    int life14_109;
    java.lang.String life15_110;
    lexical_join_105: {
    lexical_join_82: {
    life3_3 = (moom.JQ.i ^ 107060126397284L);
    spill837_0 = moom.JM.b__Arrayr3();
    life6_7 = moom.Oc.a(((int)(p0)));
    life5_8 = spill837_0;
    life7_11 = moom.Oc.a(((int)(p1)));
    spill837_1 = life6_7;
    if (!((life5_8 != null))) {
        lexicalValue837_105_0 = spill837_1;
        break lexical_join_105;
    }
    if (!((spill837_1 == p0))) {
        break lexical_join_82;
    }
    spill837_2 = life7_11;
    if (!((life5_8 != null))) {
        lexicalValue837_105_0 = spill837_2;
        break lexical_join_105;
    }
    if (!((spill837_2 == p1))) {
        break lexical_join_82;
    }
    life8_34 = new java.util.ArrayList();
    life9_36 = life6_7;
    life10_38 = life7_11;
    lexical_cycle_30: while (true) {
    lexical_join_69: {
    lexical_join_64: {
    lexical_join_59: {
    lexical_join_58: {
    lexical_join_53: {
    lexical_join_52: {
    life9_36 = (life9_36 / 2);
    life10_38 = (life10_38 / 2);
    if (!((life9_36 <= 0))) {
        break lexical_join_52;
    }
    spill837_3 = life10_38;
    if (!((life5_8 != null))) {
        lexicalValue837_53_0 = spill837_3;
        break lexical_join_53;
    }
    if (!((life5_8 != null))) {
        lexicalValue837_53_0 = spill837_3;
        break lexical_join_53;
    }
    if (!((spill837_3 <= 0))) {
        break lexical_join_52;
    }
    return ((java.awt.Dimension[])(((java.util.List)(life8_34)).toArray(((java.lang.Object[])(new java.awt.Dimension[0])))));
    }
    lexicalValue837_53_0 = life9_36;
    }
    if (!((life5_8 != null))) {
        lexicalValue837_59_0 = lexicalValue837_53_0;
        break lexical_join_59;
    }
    if (!((lexicalValue837_53_0 <= 0))) {
        break lexical_join_58;
    }
    life9_36 = 1;
    }
    lexicalValue837_59_0 = life10_38;
    }
    if (!((life5_8 != null))) {
        lexicalValue837_69_0 = lexicalValue837_59_0;
        break lexical_join_69;
    }
    if (!((lexicalValue837_59_0 <= 0))) {
        break lexical_join_64;
    }
    life10_38 = 1;
    }
    lexicalValue837_69_0 = ((life9_36 * life10_38) * 4);
    }
    life11_92 = lexicalValue837_69_0;
    life12_98 = new java.awt.Dimension(life9_36, life10_38);
    ((java.util.List)(life8_34)).add(((java.lang.Object)(life12_98)));
    if (!((life5_8 == null))) { continue lexical_cycle_30; }
    break lexical_cycle_30;
    }
    }
    spill837_4 = p2;
    spill837_5 = p0;
    life13_108 = p1;
    life14_109 = spill837_5;
    life15_110 = spill837_4;
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_caead191b8ed_invokedynamic837_9(__sourceIntrinsic_caead191b8ed_invokedynamic837_7(17148, (3474073734352456126L ^ life3_3)), life15_110, __sourceIntrinsic_caead191b8ed_invokedynamic837_8(8666, (1973020875483785881L ^ life3_3)), life14_109, "x", life13_108))));
    lexicalValue837_105_0 = 0;
    }
    return new java.awt.Dimension[lexicalValue837_105_0];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> int __sourceIntrinsic_90f211e43b08_invokedynamic2303_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90f211e43b08_invokedynamic2303_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90f211e43b08_invokedynamic2303_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90f211e43b08_invokedynamic2303_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90f211e43b08_invokedynamic2303_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90f211e43b08_invokedynamic2303_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90f211e43b08_invokedynamic2303_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90f211e43b08_invokedynamic2303_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90f211e43b08_invokedynamic2303_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90f211e43b08_invokedynamic2303_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90f211e43b08_invokedynamic2303_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90f211e43b08_invokedynamic2303_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90f211e43b08_invokedynamic2303_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90f211e43b08_invokedynamic2303_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90f211e43b08_invokedynamic2303_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90f211e43b08_invokedynamic2303_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90f211e43b08_invokedynamic2303_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90f211e43b08_invokedynamic2303_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90f211e43b08_invokedynamic2303_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9883aef60017_invokedynamic834_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9883aef60017_invokedynamic834_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9883aef60017_invokedynamic834_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9883aef60017_invokedynamic834_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5157_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_caead191b8ed_invokedynamic837_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_caead191b8ed_invokedynamic837_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_caead191b8ed_invokedynamic837_9(java.lang.String a0, java.lang.String a1, java.lang.String a2, int a3, java.lang.String a4, int a5) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b573aff3dc30_originalDynamicSite1194_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b573aff3dc30_originalDynamicSite1194_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b573aff3dc30_originalDynamicSite1194_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b573aff3dc30_originalDynamicSite1194_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b573aff3dc30_originalDynamicSite1194_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b573aff3dc30_originalDynamicSite1194_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b573aff3dc30_originalDynamicSite1194_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b573aff3dc30_originalDynamicSite1194_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b573aff3dc30_originalDynamicSite1194_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5154_0() throws E;

private static native int __sourceExactCall_f3216b6c26cd77(int p0, long p1);
}
