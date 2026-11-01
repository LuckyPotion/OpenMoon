package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class K0 extends moom.Km {

private static long f;

private static java.lang.String[] h;

private static java.lang.String[] i;

private static java.util.Map j;

private static long[] k;

private static java.lang.Integer[] l;

private static java.util.Map m;

public K0() { super((java.lang.Class)null, (java.lang.String)null, 0.0F); }


private static void __sourceConstructorBody_b9f5ddcc2f400e39(moom.K0 receiver) throws Throwable {

long local1 = (moom.K0.f ^ 3875116615226L);

    moom.K0.__sourceConstructorInit_b9f5ddcc2f400e39_0(((moom.K0)(receiver)), ((java.lang.Object)(moom.s7.class)), ((java.lang.String)(__sourceIntrinsic_b9f5ddcc2f400e39_originalDynamicSite2252_2(15171, (8820535225677829243L ^ local1)))), ((float)(0x1.333334p-2f)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_b9f5ddcc2f400e39_0(moom.K0 a0, java.lang.Object a1, java.lang.String a2, float a3) throws E;

static {
f = ((long)(((moom._a)(moom._c.a(((long)(-1989136788341390424L)), ((long)(4516332873219829300L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(154913688390703L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.K0.f ^ 91649304300652L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill619_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill619_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill619_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill619_14 = new byte[8];
    (__sourceSpill619_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill619_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation619_16 = __sourceSpill619_14;
    ((javax.crypto.Cipher)(__sourceSpill619_11)).init(((int)(__sourceSpill619_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill619_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation619_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[13];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "á_4¸«dQ\030m\036&¶ÐU\020i¾F:;\biö­Í¼K¿²rÐ\020à1º¡»NcîHc¬\030Ë30k\020,\023iÂb%Ö@«q+q\001\020ü(Q\026\036LvÅõQtp$½h\020\003Nêyå\024Bë\035^¥ÕÂ¿h ×VÏs¦Y$ù]Ýsÿ\017Saùc.v6º\021ì½`Ô!Â\035\020²À?RËUY~§\177)Çÿ¶\020íâÓòò,¾âÌ÷}6Ä¿\016a\020R@É\024¸M¬þîÈ\r¢ª¼\020½ÄBì±/Ìc'ùá\0079ÓI"))).length();
    int local16_life24 = 16;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill619_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill619_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill619_29)).doFinal(((byte[])(__sourceSpill619_28)));
        java.lang.String __sourceSpill619_34 = ((java.lang.String)(moom.K0.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill619_35 = local20_life19;
        int __sourceSpill619_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill619_35)[__sourceSpill619_36] = __sourceSpill619_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "xµ\177hÑJÂ\007\022ÞÚä\020è¦ÛmîÁ6~\f\017-ûÛä"))).length();
    local16_life24 = 16;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill619_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill619_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill619_42)).doFinal(((byte[])(__sourceSpill619_41)));
        java.lang.String __sourceSpill619_47 = ((java.lang.String)(moom.K0.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill619_48 = local20_life19;
        int __sourceSpill619_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill619_48)[__sourceSpill619_49] = __sourceSpill619_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    h = ((java.lang.String[])(local20_life19));
    i = ((java.lang.String[])(new java.lang.String[13]));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill619_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill619_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill619_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill619_60 = new byte[8];
    (__sourceSpill619_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill619_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation619_62 = __sourceSpill619_60;
    ((javax.crypto.Cipher)(__sourceSpill619_57)).init(((int)(__sourceSpill619_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill619_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation619_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[5];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "\\¿fÜ#W'Á§0b /húÉÚzåêÑ\bb"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill619_71 = local4_life67;
        int __sourceSpill619_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill619_71)).substring(((int)(__sourceSpill619_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill619_76 = local6_life65;
        int __sourceSpill619_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill619_79 = new byte[8];
        (__sourceSpill619_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill619_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill619_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill619_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill619_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill619_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill619_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill619_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill619_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill619_80)).doFinal(((byte[])(__sourceSpill619_79)));
        (__sourceSpill619_76)[__sourceSpill619_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = " R¹ã\020Ö(í±\007ïÇÉ\177"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill619_84 = local4_life67;
        int __sourceSpill619_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill619_84)).substring(((int)(__sourceSpill619_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill619_89 = local6_life65;
        int __sourceSpill619_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill619_92 = new byte[8];
        (__sourceSpill619_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill619_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill619_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill619_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill619_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill619_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill619_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill619_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill619_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill619_93)).doFinal(((byte[])(__sourceSpill619_92)));
        (__sourceSpill619_89)[__sourceSpill619_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    k = ((long[])(local6_life65));
    l = ((java.lang.Integer[])(new java.lang.Integer[5]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.K0.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5561_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/K0"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x2C00;
        if (K0.l[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = k[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])m.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    m.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/K0", exception);
            }
            int n8 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            K0.l[n4] = n8;
        }
        return K0.l[n4];
}


public java.lang.String[] b__ArrayString() {
long local1_life1 = (moom.K0.f ^ 29493079752475L);
    java.lang.String[] __sourceSharedArray649_4 = new java.lang.String[__sourceIntrinsic_b33388dd40f1_originalDynamicSite649_2(17923, (1046386693810801160L ^ local1_life1))];
    __sourceSharedArray649_4[0] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite649_3(22133, (8024317677686521952L ^ local1_life1));
    __sourceSharedArray649_4[1] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite649_5(18887, (8488077832291459025L ^ local1_life1));
    __sourceSharedArray649_4[2] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite649_6(13674, (5311973972034708342L ^ local1_life1));
    __sourceSharedArray649_4[3] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite649_7(29237, (7187246031786288175L ^ local1_life1));
    __sourceSharedArray649_4[4] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite649_8(13877, (4581700987168120870L ^ local1_life1));
    __sourceSharedArray649_4[5] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite649_9(19529, (3107926261894158929L ^ local1_life1));
    __sourceSharedArray649_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite649_10(2743, (9156247849248163514L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite649_11(29831, (3849519621340865177L ^ local1_life1));
    __sourceSharedArray649_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite649_12(15167, (7165169716210054961L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite649_13(3644, (7457165694218393635L ^ local1_life1));
    __sourceSharedArray649_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite649_14(5252, (2593790868905957515L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite649_15(6806, (4804732096741723277L ^ local1_life1));
    __sourceSharedArray649_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite649_16(32349, (812366495276331601L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite649_17(6976, (7725418771137776989L ^ local1_life1));
    return __sourceSharedArray649_4;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5562_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/K0"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public moom.jD a(moom.iQ p0, java.lang.String p1) {
moom.iQ forwardValue2454_12_0;
    int forwardValue2454_52_0;
    moom.jD forwardValue2454_60_0;
    java.lang.String forwardValue2454_66_0;
    int forwardValue2454_93_0;
    moom.jD forwardValue2454_101_0;
    moom.iQ spill2454_0;
    java.lang.String spill2454_1;
    int spill2454_2;
    int spill2454_3;
    long life3_3;
    int[] life5_5;
    moom.jp life6_19;
    java.lang.String life7_31;
    moom.jD[] life8_43;
    java.lang.String life9_54;
    int life10_58;
    java.lang.String life8_84;
    moom.jD[] life9_91;
    java.lang.String life10_102;
    int life11_106;
    forward_join_102: {
    forward_join_101: {
    forward_join_100: {
    forward_join_93: {
    forward_join_78: {
    forward_join_66: {
    forward_join_61: {
    forward_join_60: {
    forward_join_59: {
    forward_join_52: {
    forward_join_37: {
    forward_join_18: {
    forward_join_16: {
    forward_join_12: {
    life3_3 = (moom.K0.f ^ 33746903949123L);
    life5_5 = moom.Km.b();
    spill2454_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue2454_12_0 = spill2454_0;
        break forward_join_12;
    }
    if (!((((spill2454_0 instanceof moom.jp) ? 1 : 0) != 0))) {
        break forward_join_16;
    }
    forwardValue2454_12_0 = p0;
    }
    life6_19 = ((moom.jp)(forwardValue2454_12_0));
    if (!((life5_5 == null))) {
        break forward_join_18;
    }
    }
    return null;
    }
    life7_31 = __sourceIntrinsic_38607ace6cb3_invokedynamic2454_4(21984, (8794421879927956399L ^ life3_3));
    spill2454_1 = p1;
    if (!((life5_5 != null))) {
        forwardValue2454_66_0 = spill2454_1;
        break forward_join_66;
    }
    if (!(((java.lang.String)(spill2454_1)).startsWith(((java.lang.String)(life7_31))))) {
        break forward_join_61;
    }
    life8_43 = ((moom.jp)(life6_19)).i;
    if (!((life8_43 == null))) {
        break forward_join_37;
    }
    return null;
    }
    life9_54 = ((java.lang.String)(p1)).substring(((int)(((java.lang.String)(life7_31)).length())));
    life10_58 = moom.BU.a(((java.lang.String)(life9_54)), ((int)(-1)));
    life10_58 += -1;
    spill2454_2 = life10_58;
    if (!((life5_5 != null))) {
        forwardValue2454_52_0 = spill2454_2;
        break forward_join_52;
    }
    if (!((spill2454_2 >= 0))) {
        break forward_join_59;
    }
    forwardValue2454_52_0 = life10_58;
    }
    if (!((forwardValue2454_52_0 < (life8_43).length))) {
        break forward_join_59;
    }
    forwardValue2454_60_0 = (life8_43)[life10_58];
    break forward_join_60;
    }
    forwardValue2454_60_0 = null;
    }
    return forwardValue2454_60_0;
    }
    forwardValue2454_66_0 = __sourceIntrinsic_38607ace6cb3_invokedynamic2454_10(25880, (6127337354657256276L ^ life3_3));
    }
    life8_84 = forwardValue2454_66_0;
    if (!(((java.lang.String)(p1)).startsWith(((java.lang.String)(life8_84))))) {
        break forward_join_102;
    }
    life9_91 = ((moom.jp)(life6_19)).j;
    if (!((life9_91 == null))) {
        break forward_join_78;
    }
    return null;
    }
    life10_102 = ((java.lang.String)(p1)).substring(((int)(((java.lang.String)(life8_84)).length())));
    life11_106 = moom.BU.a(((java.lang.String)(life10_102)), ((int)(-1)));
    life11_106 += -1;
    spill2454_3 = life11_106;
    if (!((life5_5 != null))) {
        forwardValue2454_93_0 = spill2454_3;
        break forward_join_93;
    }
    if (!((spill2454_3 >= 0))) {
        break forward_join_100;
    }
    forwardValue2454_93_0 = life11_106;
    }
    if (!((forwardValue2454_93_0 < (life9_91).length))) {
        break forward_join_100;
    }
    forwardValue2454_101_0 = (life9_91)[life11_106];
    break forward_join_101;
    }
    forwardValue2454_101_0 = null;
    }
    return forwardValue2454_101_0;
    }
    return null;
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
        byte[] spill2841_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2841_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2841_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2841_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2841_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2841_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public moom.iQ a__iQ() {
return new moom.jp();
}


public moom.Kl a(moom.iQ p0, float p1) {
net.minecraft.client.renderer.entity.RenderManager local3 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__nw();
    moom.nh local4 = new moom.nh(local3);
    ((moom.nh)(local4)).m = ((moom.iQ)(p0));
    ((moom.nh)(local4)).c = ((float)(p1));
    return local4;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 30224);
    if (((moom.K0.i)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.K0.j)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.K0.j)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/K0", life9_51);
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
        life9_116 = ((java.lang.String)((moom.K0.h)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.K0.i)[life5_8] = __sourceExactCall_5b305c0d2f8975(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.K0.i)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = __sourceExactCall_3d34a6a2fc684a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b9f5ddcc2f400e39_originalDynamicSite2252_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5561_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite649_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite649_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite649_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite649_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite649_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite649_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite649_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite649_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite649_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite649_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite649_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite649_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite649_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite649_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite649_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5562_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2454_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2454_10(int a0, long a1) throws E;

private static native java.lang.String __sourceExactCall_5b305c0d2f8975(byte[] p0);
private static native java.lang.String __sourceExactCall_3d34a6a2fc684a(int p0, long p1);
}
