package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Jy {

private moom.DD a;

private int b;

private int c;

private boolean d;

private static long e;

private static java.lang.String[] f;

private static java.lang.String[] g;

private static java.util.Map h;

private static long[] i;

private static java.lang.Integer[] j;

private static java.util.Map k;

public Jy(moom.DD p0, int p1, int p2, boolean p3) { super(); }


private static void __sourceConstructorBody_981d45d7166f8200(moom.Jy receiver, moom.DD p0, int p1, int p2, boolean p3) throws Throwable {

long local5 = (moom.Jy.e ^ 120011053362565L);

    moom.Jy.__sourceConstructorInit_981d45d7166f8200_0(((moom.Jy)(receiver)));

    ((moom.Jy)(receiver)).b = ((int)(0));

    ((moom.Jy)(receiver)).c = ((int)(__sourceIntrinsic_981d45d7166f8200_originalDynamicSite2249_3(4149, (7251082497455606549L ^ local5))));

    ((moom.Jy)(receiver)).a = ((moom.DD)(p0));

    ((moom.Jy)(receiver)).b = ((int)(p1));

    ((moom.Jy)(receiver)).c = ((int)(p2));

    ((moom.Jy)(receiver)).d = ((boolean)(p3));

    return;

}



static {
e = ((long)(((moom._a)(moom._c.a(((long)(-8989798785390569544L)), ((long)(937929839796976717L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(77139060999559L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.Jy.e ^ 137611757658042L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill617_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill617_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill617_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill617_14 = new byte[8];
    (__sourceSpill617_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill617_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation617_16 = __sourceSpill617_14;
    ((javax.crypto.Cipher)(__sourceSpill617_11)).init(((int)(__sourceSpill617_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill617_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation617_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[9];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "H¾|\016\005çk·\006oÛ*bð\rá¦?§ãO>\020SùßùÝ%H ¯j±\030<\000¹Á4P8þÐb\033\033.OeTì,¥»¤\030(ÃI\004L\007\022ý\\s{Ç\000\0131[âÖ\023\roNpô¨§zs\031£ÓnL\031¶Ó|\0300\020Å\033ÆxSd[}\007\006¿¤\031Wß\0202Ï'ç/ÐGóc¹<ß\020ÃlX$ä?\031ËóF\032*·ý`"))).length();
    int local16_life24 = 24;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill617_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill617_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill617_29)).doFinal(((byte[])(__sourceSpill617_28)));
        java.lang.String __sourceSpill617_34 = ((java.lang.String)(moom.Jy.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill617_35 = local20_life19;
        int __sourceSpill617_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill617_35)[__sourceSpill617_36] = __sourceSpill617_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "chX[tÈêëSüañi\025\020õ\022Ì3WéçÂé¨\016"))).length();
    local16_life24 = 16;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill617_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill617_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill617_42)).doFinal(((byte[])(__sourceSpill617_41)));
        java.lang.String __sourceSpill617_47 = ((java.lang.String)(moom.Jy.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill617_48 = local20_life19;
        int __sourceSpill617_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill617_48)[__sourceSpill617_49] = __sourceSpill617_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    f = ((java.lang.String[])(local20_life19));
    g = ((java.lang.String[])(new java.lang.String[9]));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill617_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill617_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill617_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill617_60 = new byte[8];
    (__sourceSpill617_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill617_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation617_62 = __sourceSpill617_60;
    ((javax.crypto.Cipher)(__sourceSpill617_57)).init(((int)(__sourceSpill617_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill617_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation617_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[5];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "Ü)$ÛSñZzV$\037È3?_Ì·~\023\025]"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill617_71 = local4_life67;
        int __sourceSpill617_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill617_71)).substring(((int)(__sourceSpill617_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill617_76 = local6_life65;
        int __sourceSpill617_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill617_79 = new byte[8];
        (__sourceSpill617_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill617_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill617_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill617_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill617_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill617_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill617_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill617_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill617_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill617_80)).doFinal(((byte[])(__sourceSpill617_79)));
        (__sourceSpill617_76)[__sourceSpill617_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "Dª¤ÌrãUÙ\025\006µ8¨"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill617_84 = local4_life67;
        int __sourceSpill617_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill617_84)).substring(((int)(__sourceSpill617_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill617_89 = local6_life65;
        int __sourceSpill617_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill617_92 = new byte[8];
        (__sourceSpill617_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill617_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill617_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill617_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill617_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill617_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill617_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill617_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill617_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill617_93)).doFinal(((byte[])(__sourceSpill617_92)));
        (__sourceSpill617_89)[__sourceSpill617_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    i = ((long[])(local6_life65));
    j = ((java.lang.Integer[])(new java.lang.Integer[5]));
}

private static native <E extends Throwable> void __sourceConstructorInit_981d45d7166f8200_0(moom.Jy a0) throws E;

private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Jy.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5546_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Jy"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x4C82;
        if (j[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = i[n4];
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
                throw new RuntimeException("moom/Jy", exception);
            }
            int n8 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Jy.j[n4] = n8;
        }
        return j[n4];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Jy.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5547_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Jy"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.String a(java.lang.String p0, int p1, java.util.Properties p2) {
java.util.Properties forwardValue2450_13_0;
    java.lang.String forwardValue2450_36_0;
    java.util.Properties spill2450_0;
    java.lang.String spill2450_1;
    int spill2450_2;
    java.lang.String spill2450_3;
    java.lang.String spill2450_4;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    java.lang.String life6_31;
    forward_join_36: {
    forward_join_35: {
    forward_join_13: {
    forward_join_12: {
    life3_3 = (moom.Jy.e ^ 11178412830804L);
    life5_5 = moom.JM.b__Arrayr3();
    spill2450_0 = p2;
    if (!((life5_5 != null))) {
        forwardValue2450_13_0 = spill2450_0;
        break forward_join_13;
    }
    if (!((spill2450_0 == null))) {
        break forward_join_12;
    }
    return null;
    }
    forwardValue2450_13_0 = p2;
    }
    int __stackOp2450_3_0 = p1;
    java.lang.String __stackOp2450_3_1 = p0;
    java.lang.String __stackOp2450_3_2 = __sourceIntrinsic_43f5f1d5c1b9_invokedynamic2450_2(21427, (8960129055330589345L ^ life3_3));
    spill2450_1 = __stackOp2450_3_2;
    spill2450_2 = __stackOp2450_3_0;
    spill2450_3 = __stackOp2450_3_1;
    recovery.source.CarrierOps.discard(__stackOp2450_3_2);
    java.lang.String __stackOp2450_5_0 = spill2450_3;
    java.lang.String __stackOp2450_5_1 = ".";
    life6_31 = ((java.util.Properties)(forwardValue2450_13_0)).getProperty(((java.lang.String)(__sourceIntrinsic_43f5f1d5c1b9_invokedynamic2450_6(spill2450_1, spill2450_2, __stackOp2450_5_1, __stackOp2450_5_0))));
    spill2450_4 = life6_31;
    if (!((life5_5 != null))) {
        forwardValue2450_36_0 = spill2450_4;
        break forward_join_36;
    }
    if (!((spill2450_4 == null))) {
        break forward_join_35;
    }
    life6_31 = ((java.util.Properties)(p2)).getProperty(((java.lang.String)(p0)));
    }
    forwardValue2450_36_0 = life6_31;
    }
    return forwardValue2450_36_0;
}


public static moom.Jy a__Jy(java.lang.String p0, int p1, java.util.Properties p2) {
int forwardValue275_26_0;
    int forwardValue275_28_0;
    net.minecraft.entity.Entity[] spill275_0;
    int spill275_1;
    long life3_3;
    moom.DD life6_9;
    net.minecraft.entity.Entity[] life5_10;
    int life7_20;
    int life8_31;
    int life9_42;
    int life10_53;
    forward_join_28: {
    forward_join_27: {
    forward_join_26: {
    life3_3 = (moom.Jy.e ^ 96916432946559L);
    spill275_0 = moom.JM.b__Arrayr3();
    life6_9 = new moom.DD(p0);
    life5_10 = spill275_0;
    life7_20 = moom.Jy.a(((java.lang.String)(moom.Jy.a(((java.lang.String)(__sourceIntrinsic_fe7c020e00e9_invokedynamic275_2(14387, (3087815621551408143L ^ life3_3)))), ((int)(p1)), ((java.util.Properties)(p2))))));
    spill275_1 = life7_20;
    if (!((life5_10 != null))) {
        forwardValue275_26_0 = spill275_1;
        break forward_join_26;
    }
    if (!((spill275_1 == 0))) {
        break forward_join_27;
    }
    forwardValue275_26_0 = 2;
    }
    forwardValue275_28_0 = forwardValue275_26_0;
    break forward_join_28;
    }
    forwardValue275_28_0 = 1;
    }
    life8_31 = forwardValue275_28_0;
    life9_42 = moom.Jy.a(((java.lang.String)(moom.Jy.a(((java.lang.String)(__sourceIntrinsic_fe7c020e00e9_invokedynamic275_5(11366, (4729084457995456601L ^ life3_3)))), ((int)(p1)), ((java.util.Properties)(p2))))), ((int)(life8_31)));
    life10_53 = ((moom.BU.a(((java.lang.String)(moom.Jy.a(((java.lang.String)(__sourceIntrinsic_fe7c020e00e9_invokedynamic275_8(16826, (182543400451521921L ^ life3_3)))), ((int)(p1)), ((java.util.Properties)(p2))))), ((boolean)(false)))) ? 1 : 0);
    return new moom.Jy(life6_9, life7_20, life9_42, ((life10_53) != 0));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(int p0, int p1) {
int forwardValue253_71_0;
    int forwardValue253_99_0;
    net.minecraft.entity.Entity[] spill253_0;
    boolean spill253_1;
    long life3_3;
    net.minecraft.entity.Entity[] life5_6;
    net.minecraft.client.renderer.Tessellator life6_9;
    moom.lw life7_12;
    double life8_31;
    double life10_36;
    double life12_41;
    double life14_43;
    double life16_45;
    forward_join_282: {
    forward_join_140: {
    forward_join_128: {
    forward_join_99: {
    forward_join_74: {
    forward_join_71: {
    forward_join_69: {
    life3_3 = (moom.Jy.e ^ 18012499596254L);
    spill253_0 = moom.JM.b__Arrayr3();
    moom.kZ.f();
    life5_6 = spill253_0;
    moom.kZ.n();
    life6_9 = net.minecraft.client.renderer.Tessellator.a();
    life7_12 = ((net.minecraft.client.renderer.Tessellator)(life6_9)).a__lw();
    ((net.minecraft.client.renderer.texture.TextureManager)(moom.BU.a__ok())).a__Void(((moom.DD)(this.a)));
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    life8_31 = ((double) (__sourceIntrinsic_fd0ba049c90e_invokedynamic253_10(26665, (8886624027805420886L ^ life3_3)) * this.c));
    life10_36 = (((double) p0) / life8_31);
    life12_41 = (((double) p1) / life8_31);
    life14_43 = 0x0.0p0d;
    life16_45 = 0x0.0p0d;
    spill253_1 = this.d;
    if (!((life5_6 != null))) {
        forwardValue253_71_0 = ((spill253_1) ? 1 : 0);
        break forward_join_71;
    }
    if (!(spill253_1)) {
        break forward_join_69;
    }
    life14_43 = ((life8_31 - ((double) p0)) / (life8_31 * 0x1.0p1d));
    life16_45 = ((life8_31 - ((double) p1)) / (life8_31 * 0x1.0p1d));
    }
    forwardValue253_71_0 = this.b;
    }
    if (!((life5_6 != null))) {
        forwardValue253_99_0 = forwardValue253_71_0;
        break forward_join_99;
    }
    switch (forwardValue253_71_0) {
case 1:
{
        break forward_join_74;
    }
case 2:
{
        break forward_join_128;
    }
default:
{
        break forward_join_140;
    }
}
    }
    life8_31 = ((double) java.lang.Math.max(((int)(p0)), ((int)(p1))));
    life10_36 = (((double) (this.c * p0)) / life8_31);
    life12_41 = (((double) (this.c * p1)) / life8_31);
    if (!((life5_6 != null))) {
        break forward_join_282;
    }
    forwardValue253_99_0 = ((this.d) ? 1 : 0);
    }
    if (!((forwardValue253_99_0 != 0))) {
        break forward_join_140;
    }
    life14_43 = ((((double) this.c) * (life8_31 - ((double) p0))) / (life8_31 * 0x1.0p1d));
    life16_45 = ((((double) this.c) * (life8_31 - ((double) p1))) / (life8_31 * 0x1.0p1d));
    if (!((life5_6 == null))) {
        break forward_join_140;
    }
    }
    life10_36 = ((double) this.c);
    life12_41 = ((double) this.c);
    life14_43 = 0x0.0p0d;
    life16_45 = 0x0.0p0d;
    }
    ((moom.lw)(life7_12)).a(((int)(__sourceIntrinsic_fd0ba049c90e_invokedynamic253_24(24599, (6860755520041616750L ^ life3_3)))), ((moom.oD)(moom.oB.k)));
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life7_12)).a(((double)(0x0.0p0d)), ((double)(((double) p1))), ((double)(0x0.0p0d))))).a(((double)(life14_43)), ((double)((life16_45 + life12_41)))))).a(((int)(__sourceIntrinsic_fd0ba049c90e_invokedynamic253_29(25101, (6202473113817712501L ^ life3_3)))), ((int)(__sourceIntrinsic_fd0ba049c90e_invokedynamic253_30(19460, (8405135901576079742L ^ life3_3)))), ((int)(__sourceIntrinsic_fd0ba049c90e_invokedynamic253_31(19460, (8405135901576079742L ^ life3_3)))), ((int)(__sourceIntrinsic_fd0ba049c90e_invokedynamic253_32(19460, (8405135901576079742L ^ life3_3))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life7_12)).a(((double)(((double) p0))), ((double)(((double) p1))), ((double)(0x0.0p0d))))).a(((double)((life14_43 + life10_36))), ((double)((life16_45 + life12_41)))))).a(((int)(__sourceIntrinsic_fd0ba049c90e_invokedynamic253_37(19460, (8405135901576079742L ^ life3_3)))), ((int)(__sourceIntrinsic_fd0ba049c90e_invokedynamic253_38(19460, (8405135901576079742L ^ life3_3)))), ((int)(__sourceIntrinsic_fd0ba049c90e_invokedynamic253_39(19460, (8405135901576079742L ^ life3_3)))), ((int)(__sourceIntrinsic_fd0ba049c90e_invokedynamic253_40(19460, (8405135901576079742L ^ life3_3))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life7_12)).a(((double)(((double) p0))), ((double)(0x0.0p0d)), ((double)(0x0.0p0d))))).a(((double)((life14_43 + life10_36))), ((double)(life16_45))))).a(((int)(__sourceIntrinsic_fd0ba049c90e_invokedynamic253_45(19460, (8405135901576079742L ^ life3_3)))), ((int)(__sourceIntrinsic_fd0ba049c90e_invokedynamic253_46(19460, (8405135901576079742L ^ life3_3)))), ((int)(__sourceIntrinsic_fd0ba049c90e_invokedynamic253_47(19460, (8405135901576079742L ^ life3_3)))), ((int)(__sourceIntrinsic_fd0ba049c90e_invokedynamic253_48(19460, (8405135901576079742L ^ life3_3))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life7_12)).a(((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d))))).a(((double)(life14_43)), ((double)(life16_45))))).a(((int)(__sourceIntrinsic_fd0ba049c90e_invokedynamic253_53(19460, (8405135901576079742L ^ life3_3)))), ((int)(__sourceIntrinsic_fd0ba049c90e_invokedynamic253_54(19460, (8405135901576079742L ^ life3_3)))), ((int)(__sourceIntrinsic_fd0ba049c90e_invokedynamic253_55(19460, (8405135901576079742L ^ life3_3)))), ((int)(__sourceIntrinsic_fd0ba049c90e_invokedynamic253_56(19460, (8405135901576079742L ^ life3_3))))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(life6_9)).a__Void();
    }
    return;
}


private static int a(java.lang.String p0, int p1) {
java.lang.String forwardValue2449_16_0;
    int forwardValue2449_36_0;
    java.lang.String spill2449_0;
    int spill2449_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    int life5_23;
    forward_join_36: {
    forward_join_35: {
    forward_join_16: {
    forward_join_12: {
    life2_3 = (moom.Jy.e ^ 44097129542011L);
    life4_5 = moom.JM.b__Arrayr3();
    spill2449_0 = p0;
    if (!((life4_5 != null))) {
        forwardValue2449_16_0 = spill2449_0;
        break forward_join_16;
    }
    if (!((spill2449_0 == null))) {
        break forward_join_12;
    }
    return p1;
    }
    p0 = ((java.lang.String)(p0)).trim();
    forwardValue2449_16_0 = p0;
    }
    life5_23 = moom.BU.a(((java.lang.String)(forwardValue2449_16_0)), ((int)(-1)));
    spill2449_1 = life5_23;
    if (!((life4_5 != null))) {
        forwardValue2449_36_0 = spill2449_1;
        break forward_join_36;
    }
    if (!((spill2449_1 < 1))) {
        break forward_join_35;
    }
    java.lang.String __stackOp2449_5_0 = p0;
    java.lang.String __stackOp2449_5_1 = __sourceIntrinsic_5e130d9b8037_invokedynamic2449_4(5517, (849848682424671671L ^ life2_3));
    moom.Jz.a(((java.lang.String)(__sourceIntrinsic_5e130d9b8037_invokedynamic2449_6(__stackOp2449_5_1, __stackOp2449_5_0))));
    return p1;
    }
    forwardValue2449_36_0 = life5_23;
    }
    return forwardValue2449_36_0;
}


private static int a(java.lang.String p0) {
java.lang.String forwardValue2448_17_0;
    int forwardValue2448_35_0;
    int forwardValue2448_47_0;
    int forwardValue2448_62_0;
    java.lang.String spill2448_0;
    boolean spill2448_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_62: {
    forward_join_52: {
    forward_join_47: {
    forward_join_40: {
    forward_join_35: {
    forward_join_28: {
    forward_join_17: {
    forward_join_12: {
    life1_3 = (moom.Jy.e ^ 37564805361001L);
    life3_5 = moom.JM.b__Arrayr3();
    spill2448_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue2448_17_0 = spill2448_0;
        break forward_join_17;
    }
    if (!((spill2448_0 == null))) {
        break forward_join_12;
    }
    return 0;
    }
    p0 = ((java.lang.String)(((java.lang.String)(p0)).toLowerCase())).trim();
    forwardValue2448_17_0 = p0;
    }
    spill2448_1 = ((java.lang.String)(forwardValue2448_17_0)).equals(((java.lang.Object)(__sourceIntrinsic_599c5f800586_invokedynamic2448_4(27733, (8723962775102339189L ^ life1_3)))));
    if (!((life3_5 != null))) {
        forwardValue2448_35_0 = ((spill2448_1) ? 1 : 0);
        break forward_join_35;
    }
    if (!(spill2448_1)) {
        break forward_join_28;
    }
    return 0;
    }
    forwardValue2448_35_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_599c5f800586_invokedynamic2448_7(12999, (6255455766901745387L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2448_47_0 = forwardValue2448_35_0;
        break forward_join_47;
    }
    if (!((forwardValue2448_35_0 != 0))) {
        break forward_join_40;
    }
    return 1;
    }
    forwardValue2448_47_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_599c5f800586_invokedynamic2448_10(30970, (7612943255980911828L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2448_62_0 = forwardValue2448_47_0;
        break forward_join_62;
    }
    if (!((forwardValue2448_47_0 != 0))) {
        break forward_join_52;
    }
    return 2;
    }
    java.lang.String __stackOp2448_14_0 = p0;
    java.lang.String __stackOp2448_14_1 = __sourceIntrinsic_599c5f800586_invokedynamic2448_13(13468, (2513840669031391415L ^ life1_3));
    moom.Jz.a(((java.lang.String)(__sourceIntrinsic_599c5f800586_invokedynamic2448_15(__stackOp2448_14_1, __stackOp2448_14_0))));
    forwardValue2448_62_0 = 0;
    }
    return forwardValue2448_62_0;
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
        byte[] spill2835_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2835_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2835_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2835_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2835_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2835_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 870);
    if (((moom.Jy.g)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Jy.h)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Jy.h)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Jy", life9_51);
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
        life9_116 = ((java.lang.String)((moom.Jy.f)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Jy.g)[life5_8] = moom.Jy.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Jy.g)[life5_8];
}


private static native <E extends Throwable> int __sourceIntrinsic_981d45d7166f8200_originalDynamicSite2249_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_invokedynamic253_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_invokedynamic253_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_invokedynamic253_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_invokedynamic253_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_invokedynamic253_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_invokedynamic253_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_invokedynamic253_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_invokedynamic253_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_invokedynamic253_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_invokedynamic253_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_invokedynamic253_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_invokedynamic253_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_invokedynamic253_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_invokedynamic253_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_invokedynamic253_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_invokedynamic253_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_invokedynamic253_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_invokedynamic253_56(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_599c5f800586_invokedynamic2448_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_599c5f800586_invokedynamic2448_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_599c5f800586_invokedynamic2448_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_599c5f800586_invokedynamic2448_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_599c5f800586_invokedynamic2448_15(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5e130d9b8037_invokedynamic2449_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5e130d9b8037_invokedynamic2449_6(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_43f5f1d5c1b9_invokedynamic2450_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_43f5f1d5c1b9_invokedynamic2450_6(java.lang.String a0, int a1, java.lang.String a2, java.lang.String a3) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5547_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fe7c020e00e9_invokedynamic275_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fe7c020e00e9_invokedynamic275_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fe7c020e00e9_invokedynamic275_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5546_0() throws E;
}
