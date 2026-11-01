package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class KC extends moom.Km {

private static long f;

private static java.lang.String[] h;

private static java.lang.String[] i;

private static java.util.Map j;

private static long[] k;

private static java.lang.Integer[] l;

private static java.util.Map m;

public KC() { super((java.lang.Class)null, (java.lang.String)null, 0.0F); }


private static void __sourceConstructorBody_090a8c029cdf1016(moom.KC receiver) throws Throwable {

long local1 = (moom.KC.f ^ 91967670868758L);

    moom.KC.__sourceConstructorInit_090a8c029cdf1016_0(((moom.KC)(receiver)), ((java.lang.Object)(net.minecraft.entity.boss.EntityDragon.class)), ((java.lang.String)(__sourceIntrinsic_090a8c029cdf1016_originalDynamicSite2276_2(3418, (3063776762569627299L ^ local1)))), ((float)(0x1.0p-1f)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_090a8c029cdf1016_0(moom.KC a0, java.lang.Object a1, java.lang.String a2, float a3) throws E;

static {
f = ((long)(((moom._a)(moom._c.a(((long)(1621341635817945730L)), ((long)(480738620883656760L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(195685607809753L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.KC.f ^ 128061044138089L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill630_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill630_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill630_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill630_14 = new byte[8];
    (__sourceSpill630_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill630_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation630_16 = __sourceSpill630_14;
    ((javax.crypto.Cipher)(__sourceSpill630_11)).init(((int)(__sourceSpill630_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill630_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation630_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[25];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "Ô|ÚÂÚw\003éÙDa(Oõ\026ÊãdÂ'Çl'`\031Ç`I@ öOûîîûÁÚ ´hüVq6Ç\177Pi~vD\177WzÀ¨\020½1]\\ïÞ\005yO,ÒNÞ%b\026\020v¬ö\\váãÎ[ÃÔ\"ø\020ù\000ûX¢¼rÆp¦EÅ»å ÍÔP2\007¯Dé·2ÝNXíü$\003 8±Ù6èÉ¦«³Gø\035j\020?÷\024\"BôÇ\025ÇíjX \f\002m\002Ý\"\024íÓ.)#9\021¹4kê[«ð\032n{Õ\t\025\020/°iq°\f¤Ã\022¥Fºë¡´ \020ÝgH¶©µÈ\026\036WhQb^îóä\177¦{\020Â­õÇÕ¾Eë\030Ñá¸òl8é~\005­Æp\035Qé7;ï¸ÃÉ@\020\004SÄsBx\003¼´\031ÂÂ6Á¹\020¹ø\003\005\033­Ý-¤\006\005U×dÁ\020T]\"·`.ð7¾f%QJM XÑðÑJiÑ»¼?¡8fäø<\024ÔOsnJá\f\026ÑfÏ\030¦´,\007×#úÜ\034¾¨ü¨\025i*úü7fD (MAøñM\016\fÂlA¬õ°Í³£éJïÎ\035\030`\0023Ä´\020Ýù( ÎE|Zä\ny\004&ídÕ 7Yà-I\006@!ò;ªµ?ÕpáU¸\01367A\024¹?á,Q¶\030\023\177fqüÒù\032¿\016Ñ?Æ1éñâJ\té\024 \013ï\nRÌ¶\\×íCA[±énÀ\r\013ªªåÖ¶TÛS6sá\030\020'þ§'Éf:+Ö\016¯¨!\\Þ-\016}áù ý ¦g\fOJÔÿBÃîUkmÉ%òbL[§­\007ë"))).length();
    int local16_life24 = 32;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill630_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill630_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill630_29)).doFinal(((byte[])(__sourceSpill630_28)));
        java.lang.String __sourceSpill630_34 = ((java.lang.String)(moom.KC.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill630_35 = local20_life19;
        int __sourceSpill630_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill630_35)[__sourceSpill630_36] = __sourceSpill630_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "z¬!RH\001N(n\\\002ò\025\023Å\020þ»óÒÏ\005tSæA\\+"))).length();
    local16_life24 = 16;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill630_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill630_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill630_42)).doFinal(((byte[])(__sourceSpill630_41)));
        java.lang.String __sourceSpill630_47 = ((java.lang.String)(moom.KC.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill630_48 = local20_life19;
        int __sourceSpill630_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill630_48)[__sourceSpill630_49] = __sourceSpill630_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    h = ((java.lang.String[])(local20_life19));
    i = ((java.lang.String[])(new java.lang.String[25]));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill630_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill630_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill630_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill630_60 = new byte[8];
    (__sourceSpill630_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill630_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation630_62 = __sourceSpill630_60;
    ((javax.crypto.Cipher)(__sourceSpill630_57)).init(((int)(__sourceSpill630_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill630_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation630_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[7];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "\177\026NK?9¥gè\032ÿKì·Uº\005¹õ®:D<¸!557aÑ²eË_"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill630_71 = local4_life67;
        int __sourceSpill630_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill630_71)).substring(((int)(__sourceSpill630_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill630_76 = local6_life65;
        int __sourceSpill630_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill630_79 = new byte[8];
        (__sourceSpill630_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill630_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill630_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill630_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill630_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill630_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill630_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill630_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill630_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill630_80)).doFinal(((byte[])(__sourceSpill630_79)));
        (__sourceSpill630_76)[__sourceSpill630_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "u»7Â:CúÐöÝsµÏ"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill630_84 = local4_life67;
        int __sourceSpill630_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill630_84)).substring(((int)(__sourceSpill630_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill630_89 = local6_life65;
        int __sourceSpill630_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill630_92 = new byte[8];
        (__sourceSpill630_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill630_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill630_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill630_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill630_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill630_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill630_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill630_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill630_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill630_93)).doFinal(((byte[])(__sourceSpill630_92)));
        (__sourceSpill630_89)[__sourceSpill630_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    k = ((long[])(local6_life65));
    l = ((java.lang.Integer[])(new java.lang.Integer[7]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.KC.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5612_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/KC"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x38C1;
        if (KC.l[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = k[n2];
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
                throw new RuntimeException("moom/KC", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            KC.l[n2] = n4;
        }
        return KC.l[n2];
}


public java.lang.String[] b__ArrayString() {
long local1_life1 = (moom.KC.f ^ 36454669040833L);
    java.lang.String[] __sourceSharedArray657_4 = new java.lang.String[__sourceIntrinsic_b33388dd40f1_originalDynamicSite657_2(9491, (7380291626381819353L ^ local1_life1))];
    __sourceSharedArray657_4[0] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite657_3(8389, (2236988023874739437L ^ local1_life1));
    __sourceSharedArray657_4[1] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite657_5(11971, (1047611061386859234L ^ local1_life1));
    __sourceSharedArray657_4[2] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite657_6(16270, (1025159470031651770L ^ local1_life1));
    __sourceSharedArray657_4[3] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite657_7(6227, (4623242587998774387L ^ local1_life1));
    __sourceSharedArray657_4[4] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite657_8(32004, (2966372828882665769L ^ local1_life1));
    __sourceSharedArray657_4[5] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite657_9(14906, (1504508375576757788L ^ local1_life1));
    __sourceSharedArray657_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite657_10(23216, (8488064757110456957L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite657_11(7238, (4066583000850358389L ^ local1_life1));
    __sourceSharedArray657_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite657_12(8364, (1306078051263068259L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite657_13(16598, (7048760828513008864L ^ local1_life1));
    __sourceSharedArray657_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite657_14(28529, (5232164694815340479L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite657_15(23397, (4735412619746092876L ^ local1_life1));
    __sourceSharedArray657_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite657_16(8756, (8030752383068977916L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite657_17(19900, (7926551932445667742L ^ local1_life1));
    __sourceSharedArray657_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite657_18(32157, (3119912206981162326L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite657_19(13718, (8258817265058302387L ^ local1_life1));
    __sourceSharedArray657_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite657_20(4833, (4497768130111277613L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite657_21(18984, (8538179860681307677L ^ local1_life1));
    return __sourceSharedArray657_4;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5613_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/KC"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public moom.jD a(moom.iQ p0, java.lang.String p1) {
moom.iQ forwardValue2465_12_0;
    int forwardValue2465_38_0;
    int forwardValue2465_51_0;
    int forwardValue2465_64_0;
    int forwardValue2465_77_0;
    int forwardValue2465_90_0;
    int forwardValue2465_103_0;
    int forwardValue2465_116_0;
    int forwardValue2465_129_0;
    int forwardValue2465_142_0;
    int forwardValue2465_155_0;
    int forwardValue2465_168_0;
    moom.jD forwardValue2465_173_0;
    moom.iQ spill2465_0;
    boolean spill2465_1;
    long life3_3;
    int[] life5_5;
    net.minecraft.client.model.ModelDragon life6_19;
    forward_join_173: {
    forward_join_172: {
    forward_join_168: {
    forward_join_161: {
    forward_join_155: {
    forward_join_148: {
    forward_join_142: {
    forward_join_135: {
    forward_join_129: {
    forward_join_122: {
    forward_join_116: {
    forward_join_109: {
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
    life3_3 = (moom.KC.f ^ 40975987334297L);
    life5_5 = moom.Km.b();
    spill2465_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue2465_12_0 = spill2465_0;
        break forward_join_12;
    }
    if (!((((spill2465_0 instanceof net.minecraft.client.model.ModelDragon) ? 1 : 0) != 0))) {
        break forward_join_16;
    }
    forwardValue2465_12_0 = p0;
    }
    life6_19 = ((net.minecraft.client.model.ModelDragon)(forwardValue2465_12_0));
    if (!((life5_5 == null))) {
        break forward_join_18;
    }
    }
    return null;
    }
    spill2465_1 = ((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2465_4(12649, (6971586460426874115L ^ life3_3)))));
    if (!((life5_5 != null))) {
        forwardValue2465_38_0 = ((spill2465_1) ? 1 : 0);
        break forward_join_38;
    }
    if (!(spill2465_1)) {
        break forward_join_31;
    }
    forwardValue2465_173_0 = ((net.minecraft.client.model.ModelDragon)(life6_19)).i;
    break forward_join_173;
    }
    forwardValue2465_38_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2465_8(11657, (5794644418936353270L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2465_51_0 = forwardValue2465_38_0;
        break forward_join_51;
    }
    if (!((forwardValue2465_38_0 != 0))) {
        break forward_join_44;
    }
    forwardValue2465_173_0 = ((net.minecraft.client.model.ModelDragon)(life6_19)).j;
    break forward_join_173;
    }
    forwardValue2465_51_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2465_12(4982, (4072594306072252181L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2465_64_0 = forwardValue2465_51_0;
        break forward_join_64;
    }
    if (!((forwardValue2465_51_0 != 0))) {
        break forward_join_57;
    }
    forwardValue2465_173_0 = ((net.minecraft.client.model.ModelDragon)(life6_19)).k;
    break forward_join_173;
    }
    forwardValue2465_64_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2465_16(14590, (7277049442049107085L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2465_77_0 = forwardValue2465_64_0;
        break forward_join_77;
    }
    if (!((forwardValue2465_64_0 != 0))) {
        break forward_join_70;
    }
    forwardValue2465_173_0 = ((net.minecraft.client.model.ModelDragon)(life6_19)).l;
    break forward_join_173;
    }
    forwardValue2465_77_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2465_20(10544, (4029666734715155778L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2465_90_0 = forwardValue2465_77_0;
        break forward_join_90;
    }
    if (!((forwardValue2465_77_0 != 0))) {
        break forward_join_83;
    }
    forwardValue2465_173_0 = ((net.minecraft.client.model.ModelDragon)(life6_19)).m;
    break forward_join_173;
    }
    forwardValue2465_90_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2465_24(22091, (7309001606571412031L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2465_103_0 = forwardValue2465_90_0;
        break forward_join_103;
    }
    if (!((forwardValue2465_90_0 != 0))) {
        break forward_join_96;
    }
    forwardValue2465_173_0 = ((net.minecraft.client.model.ModelDragon)(life6_19)).n;
    break forward_join_173;
    }
    forwardValue2465_103_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2465_28(22492, (2584798237124905907L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2465_116_0 = forwardValue2465_103_0;
        break forward_join_116;
    }
    if (!((forwardValue2465_103_0 != 0))) {
        break forward_join_109;
    }
    forwardValue2465_173_0 = ((net.minecraft.client.model.ModelDragon)(life6_19)).o;
    break forward_join_173;
    }
    forwardValue2465_116_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2465_32(1245, (4890464942394218676L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2465_129_0 = forwardValue2465_116_0;
        break forward_join_129;
    }
    if (!((forwardValue2465_116_0 != 0))) {
        break forward_join_122;
    }
    forwardValue2465_173_0 = ((net.minecraft.client.model.ModelDragon)(life6_19)).p;
    break forward_join_173;
    }
    forwardValue2465_129_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2465_36(21215, (1319999187943837348L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2465_142_0 = forwardValue2465_129_0;
        break forward_join_142;
    }
    if (!((forwardValue2465_129_0 != 0))) {
        break forward_join_135;
    }
    forwardValue2465_173_0 = ((net.minecraft.client.model.ModelDragon)(life6_19)).q;
    break forward_join_173;
    }
    forwardValue2465_142_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2465_40(21272, (8713740701805760368L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2465_155_0 = forwardValue2465_142_0;
        break forward_join_155;
    }
    if (!((forwardValue2465_142_0 != 0))) {
        break forward_join_148;
    }
    forwardValue2465_173_0 = ((net.minecraft.client.model.ModelDragon)(life6_19)).r;
    break forward_join_173;
    }
    forwardValue2465_155_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2465_44(110, (6104522339379518489L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2465_168_0 = forwardValue2465_155_0;
        break forward_join_168;
    }
    if (!((forwardValue2465_155_0 != 0))) {
        break forward_join_161;
    }
    forwardValue2465_173_0 = ((net.minecraft.client.model.ModelDragon)(life6_19)).s;
    break forward_join_173;
    }
    forwardValue2465_168_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2465_48(23382, (9064382643524978474L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((forwardValue2465_168_0 != 0))) {
        break forward_join_172;
    }
    forwardValue2465_173_0 = ((net.minecraft.client.model.ModelDragon)(life6_19)).t;
    break forward_join_173;
    }
    forwardValue2465_173_0 = null;
    }
    return forwardValue2465_173_0;
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
        byte[] spill2864_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2864_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2864_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2864_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2864_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2864_2)[life4_9];
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
return new net.minecraft.client.model.ModelDragon(0x0.0p0f);
}


public moom.Kl a(moom.iQ p0, float p1) {
net.minecraft.client.renderer.entity.RenderManager local3 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__nw();
    net.minecraft.client.renderer.entity.RenderDragon local4 = new net.minecraft.client.renderer.entity.RenderDragon(local3);
    ((net.minecraft.client.renderer.entity.RenderDragon)(local4)).m = ((moom.iQ)(p0));
    ((net.minecraft.client.renderer.entity.RenderDragon)(local4)).c = ((float)(p1));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 23596);
    if (((moom.KC.i)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.KC.j)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.KC.j)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/KC", life9_51);
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
        life9_116 = ((java.lang.String)((moom.KC.h)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.KC.i)[life5_8] = __sourceExactCall_a553602ac69072(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.KC.i)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = __sourceExactCall_dc56896f0b5236(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_090a8c029cdf1016_originalDynamicSite2276_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5612_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite657_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite657_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite657_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite657_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite657_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite657_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite657_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite657_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite657_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite657_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite657_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite657_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite657_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite657_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite657_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite657_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite657_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite657_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite657_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5613_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2465_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2465_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2465_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2465_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2465_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2465_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2465_28(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2465_32(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2465_36(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2465_40(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2465_44(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2465_48(int a0, long a1) throws E;

private static native java.lang.String __sourceExactCall_a553602ac69072(byte[] p0);
private static native java.lang.String __sourceExactCall_dc56896f0b5236(int p0, long p1);
}
