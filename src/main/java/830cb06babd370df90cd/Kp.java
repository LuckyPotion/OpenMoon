package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class Kp extends moom.Km {

private static final long h;

private static final java.lang.String[] i;

private static final java.lang.String[] j;

private static final java.util.Map k;

private static final long[] o;

private static final java.lang.Integer[] p;

private static final java.util.Map q;

public Kp(java.lang.Class p0, java.lang.String p1, float p2) {
super(p0, p1, p2);
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(7522538575055616354L)), ((long)(-5329072992227378788L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(92507514586302L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.Kp.h ^ 129973820304845L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill654_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill654_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill654_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill654_14 = new byte[8];
    (__sourceSpill654_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill654_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation654_16 = __sourceSpill654_14;
    ((javax.crypto.Cipher)(__sourceSpill654_11)).init(((int)(__sourceSpill654_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill654_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation654_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[14];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "Å¿\027qÝA*\026VT\033ý4\036\177$@Y\003 ½\b_ÒJBl: y´F\006°xJ6,ÒßN0ÞVn\177µ\005c\\2³ûåË\017\030èèÛj?ß:PêØé¯!F<(ÓONÉ?¬` >Où\034çâçGØ¬àÚð{Hr\037ÆÄ#HËñàÆÐh *\"è\b®á`½ÑF£MÌø\030$\"ÈàO3Qu¸^|úå°\020ù\004ú+U®s¥\027aÅà©`N\020z£\005B\034ÅU®´q.°ó\fý\030\003\0361Á\023¾3F@z×\026òã\023TJM\020\017h\034°\035\033¯Qny\b\030\036^w¨!8ªá0N\003ÙÒsºdêë\004ä[ô\020CéR\003[\026Ýõ¦ùì\037 x¹çÙAÐb.`øÏ¶\006c|[¾´.\020~?ÁA%0\002Ç"))).length();
    int local16_life24 = 32;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill654_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill654_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill654_29)).doFinal(((byte[])(__sourceSpill654_28)));
        java.lang.String __sourceSpill654_34 = ((java.lang.String)(moom.Kp.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill654_35 = local20_life19;
        int __sourceSpill654_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill654_35)[__sourceSpill654_36] = __sourceSpill654_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "YUAWï2é7\027ÂW.})Æ@fîB\b;xN\005\030\023ý4\027ø\034\003Ë\001åÀ\004Ñk©Kôì<\177W\026"))).length();
    local16_life24 = 24;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill654_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill654_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill654_42)).doFinal(((byte[])(__sourceSpill654_41)));
        java.lang.String __sourceSpill654_47 = ((java.lang.String)(moom.Kp.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill654_48 = local20_life19;
        int __sourceSpill654_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill654_48)[__sourceSpill654_49] = __sourceSpill654_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    i = ((java.lang.String[])(local20_life19));
    j = ((java.lang.String[])(new java.lang.String[14]));
    q = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill654_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill654_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill654_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill654_60 = new byte[8];
    (__sourceSpill654_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill654_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation654_62 = __sourceSpill654_60;
    ((javax.crypto.Cipher)(__sourceSpill654_57)).init(((int)(__sourceSpill654_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill654_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation654_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[2];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "¡U#ãÇJ\006wìcatª¯N"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill654_71 = local4_life67;
        int __sourceSpill654_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill654_71)).substring(((int)(__sourceSpill654_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill654_76 = local6_life65;
        int __sourceSpill654_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill654_79 = new byte[8];
        (__sourceSpill654_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill654_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill654_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill654_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill654_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill654_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill654_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill654_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill654_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill654_80)).doFinal(((byte[])(__sourceSpill654_79)));
        (__sourceSpill654_76)[__sourceSpill654_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    o = ((long[])(local6_life65));
    p = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public java.lang.String[] b__ArrayString() {
long local1_life1 = (moom.Kp.h ^ 105358977610059L);
    java.lang.String[] __sourceSharedArray671_4 = new java.lang.String[__sourceIntrinsic_b33388dd40f1_originalDynamicSite671_2(28664, (8304685023658121712L ^ local1_life1))];
    __sourceSharedArray671_4[0] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite671_3(29383, (5324320052955523312L ^ local1_life1));
    __sourceSharedArray671_4[1] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite671_5(1072, (3081105920280354316L ^ local1_life1));
    __sourceSharedArray671_4[2] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite671_6(12917, (4586573275632134223L ^ local1_life1));
    __sourceSharedArray671_4[3] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite671_7(16004, (3754275476043130034L ^ local1_life1));
    __sourceSharedArray671_4[4] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite671_8(24521, (1838780768767608317L ^ local1_life1));
    __sourceSharedArray671_4[5] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite671_9(14310, (8166341670059896286L ^ local1_life1));
    __sourceSharedArray671_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite671_10(22934, (1732457004336983967L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite671_11(28231, (5350540531087324280L ^ local1_life1));
    return __sourceSharedArray671_4;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral5785_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Kp"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x5607;
        if (p[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = o[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])q.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    q.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Kp", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Kp.p[n2] = n4;
        }
        return p[n2];
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Kp.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 31280);
    if (((moom.Kp.j)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Kp.k)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Kp.k)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Kp", life9_51);
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
        life9_116 = ((java.lang.String)((moom.Kp.i)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Kp.j)[life5_8] = moom.Kp.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Kp.j)[life5_8];
}


public moom.jD a(moom.iQ p0, java.lang.String p1) {
moom.iQ forwardValue2522_12_0;
    int forwardValue2522_38_0;
    int forwardValue2522_51_0;
    int forwardValue2522_64_0;
    int forwardValue2522_77_0;
    int forwardValue2522_90_0;
    int forwardValue2522_103_0;
    moom.jD forwardValue2522_108_0;
    moom.iQ spill2522_0;
    boolean spill2522_1;
    long life3_3;
    int[] life5_5;
    moom.iT life6_19;
    forward_join_108: {
    forward_join_107: {
    forward_join_103: {
    forward_join_96: {
    forward_join_90: {
    forward_join_83: {
    forward_join_77: {
    forward_join_70: {
    forward_join_64: {
    forward_join_57: {
    forward_join_51: {
    forward_join_44: {
    forward_join_38: {
    forward_join_31: {
    forward_join_18: {
    forward_join_16: {
    forward_join_12: {
    life3_3 = (moom.Kp.h ^ 100817795109139L);
    life5_5 = moom.Km.b();
    spill2522_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue2522_12_0 = spill2522_0;
        break forward_join_12;
    }
    if (!((((spill2522_0 instanceof moom.iT) ? 1 : 0) != 0))) {
        break forward_join_16;
    }
    forwardValue2522_12_0 = p0;
    }
    life6_19 = ((moom.iT)(forwardValue2522_12_0));
    if (!((life5_5 == null))) {
        break forward_join_18;
    }
    }
    return null;
    }
    spill2522_1 = ((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2522_4(26511, (4756266294955171298L ^ life3_3)))));
    if (!((life5_5 != null))) {
        forwardValue2522_38_0 = ((spill2522_1) ? 1 : 0);
        break forward_join_38;
    }
    if (!(spill2522_1)) {
        break forward_join_31;
    }
    forwardValue2522_108_0 = ((moom.iT)(life6_19)).i;
    break forward_join_108;
    }
    forwardValue2522_38_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2522_8(25423, (8954748049365850404L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2522_51_0 = forwardValue2522_38_0;
        break forward_join_51;
    }
    if (!((forwardValue2522_38_0 != 0))) {
        break forward_join_44;
    }
    forwardValue2522_108_0 = ((moom.iT)(life6_19)).j;
    break forward_join_108;
    }
    forwardValue2522_51_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2522_12(23373, (7485013797467611436L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2522_64_0 = forwardValue2522_51_0;
        break forward_join_64;
    }
    if (!((forwardValue2522_51_0 != 0))) {
        break forward_join_57;
    }
    forwardValue2522_108_0 = ((moom.iT)(life6_19)).k;
    break forward_join_108;
    }
    forwardValue2522_64_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2522_16(31157, (8160031526436226006L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2522_77_0 = forwardValue2522_64_0;
        break forward_join_77;
    }
    if (!((forwardValue2522_64_0 != 0))) {
        break forward_join_70;
    }
    forwardValue2522_108_0 = ((moom.iT)(life6_19)).m;
    break forward_join_108;
    }
    forwardValue2522_77_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2522_20(17031, (5870044653686323426L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2522_90_0 = forwardValue2522_77_0;
        break forward_join_90;
    }
    if (!((forwardValue2522_77_0 != 0))) {
        break forward_join_83;
    }
    forwardValue2522_108_0 = ((moom.iT)(life6_19)).l;
    break forward_join_108;
    }
    forwardValue2522_90_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2522_24(6611, (8919662891735425973L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2522_103_0 = forwardValue2522_90_0;
        break forward_join_103;
    }
    if (!((forwardValue2522_90_0 != 0))) {
        break forward_join_96;
    }
    forwardValue2522_108_0 = ((moom.iT)(life6_19)).o;
    break forward_join_108;
    }
    forwardValue2522_103_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2522_28(22199, (5107001400124632285L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((forwardValue2522_103_0 != 0))) {
        break forward_join_107;
    }
    forwardValue2522_108_0 = ((moom.iT)(life6_19)).n;
    break forward_join_108;
    }
    forwardValue2522_108_0 = null;
    }
    return forwardValue2522_108_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5788_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Kp"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Kp.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
        byte[] spill2954_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2954_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2954_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2954_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2954_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2954_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite671_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite671_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite671_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite671_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite671_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite671_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite671_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite671_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite671_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral5785_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2522_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2522_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2522_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2522_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2522_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2522_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2522_28(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5788_0() throws E;
}
