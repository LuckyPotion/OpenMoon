package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Md {

private static final long a;

private static final java.lang.String[] b;

private static final java.lang.String[] c;

private static final java.util.Map d;

private static final long[] e;

private static final java.lang.Integer[] f;

private static final java.util.Map g;

public Md() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(7843092718411146684L)), ((long)(6097830350547462208L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(24067605340710L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.Md.a ^ 20718191133985L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill703_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill703_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill703_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill703_14 = new byte[8];
    (__sourceSpill703_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill703_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation703_16 = __sourceSpill703_14;
    ((javax.crypto.Cipher)(__sourceSpill703_11)).init(((int)(__sourceSpill703_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill703_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation703_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[10];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "£\n¢Ù,ÐÕíIã´ (lb\002í\000*¹\tÜÿ¤9AÕ9Ì©\fµ¡×¥+\024Ü\020®\034ëU½\rÌº·ìò\020þÃWLÇ\023F8/\035wç\020Ãé$ÀÑ\037Q5¨u#¢¡â ÐyµÇúÔÆrßÌç¸\020e\020!|êm.6\016±ùr-µ/¢\020Ül0\006S&aø<¦Å¬°¸à\0202a\0136ëZ·÷Ò|Â³Dá"))).length();
    int local16_life24 = 16;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill703_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill703_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill703_29)).doFinal(((byte[])(__sourceSpill703_28)));
        java.lang.String __sourceSpill703_34 = ((java.lang.String)(moom.Md.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill703_35 = local20_life19;
        int __sourceSpill703_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill703_35)[__sourceSpill703_36] = __sourceSpill703_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "\033Põ\013RGVNFÔè¥õp c.)ÎPGñæÕµ5\003ÿ®sËu·\"ývKéç+ÌÅ\025]\003"))).length();
    local16_life24 = 16;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill703_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill703_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill703_42)).doFinal(((byte[])(__sourceSpill703_41)));
        java.lang.String __sourceSpill703_47 = ((java.lang.String)(moom.Md.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill703_48 = local20_life19;
        int __sourceSpill703_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill703_48)[__sourceSpill703_49] = __sourceSpill703_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    b = ((java.lang.String[])(local20_life19));
    c = ((java.lang.String[])(new java.lang.String[10]));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill703_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill703_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill703_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill703_60 = new byte[8];
    (__sourceSpill703_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill703_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation703_62 = __sourceSpill703_60;
    ((javax.crypto.Cipher)(__sourceSpill703_57)).init(((int)(__sourceSpill703_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill703_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation703_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[13];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "Rë¦+[à¤\0073Æûþò¡(z39KQ\nÝµq¾D6¯Ú@Ô\001jO6V´õe±ÈT\t=ü\177£mEB\fS[S¢\bSô¥ó[ÒW%ýâ­ ²w;ÐËkòN"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill703_71 = local4_life67;
        int __sourceSpill703_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill703_71)).substring(((int)(__sourceSpill703_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill703_76 = local6_life65;
        int __sourceSpill703_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill703_79 = new byte[8];
        (__sourceSpill703_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill703_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill703_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill703_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill703_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill703_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill703_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill703_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill703_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill703_80)).doFinal(((byte[])(__sourceSpill703_79)));
        (__sourceSpill703_76)[__sourceSpill703_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "·[¦è¾Cºt\005¡8\001Ð;ãú"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill703_84 = local4_life67;
        int __sourceSpill703_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill703_84)).substring(((int)(__sourceSpill703_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill703_89 = local6_life65;
        int __sourceSpill703_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill703_92 = new byte[8];
        (__sourceSpill703_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill703_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill703_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill703_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill703_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill703_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill703_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill703_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill703_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill703_93)).doFinal(((byte[])(__sourceSpill703_92)));
        (__sourceSpill703_89)[__sourceSpill703_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    e = ((long[])(local6_life65));
    f = ((java.lang.Integer[])(new java.lang.Integer[13]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Md.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6388_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Md"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x3DD8;
        if (f[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = e[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Md", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Md.f[n4] = n6;
        }
        return f[n4];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6389_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Md"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static void a(int p0, float p1) {
int spill794_0;
    int spill794_1;
    int spill794_2;
    int spill794_3;
    int spill794_4;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forest_join_154: {
    forest_join_153: {
    forest_join_146: {
    forest_join_126: {
    forest_join_110: {
    forest_join_94: {
    forest_join_82: {
    forest_join_62: {
    forest_join_46: {
    forest_join_30: {
    forest_join_10: {
    life2_3 = (moom.Md.a ^ 11916707582066L);
    life4_5 = moom.Mi.b__Arrayr3();
    if (!((life4_5 == null))) {
        break forest_join_154;
    }
    switch (p0) {
case 0:
{
        break forest_join_10;
    }
case 1:
{
        break forest_join_30;
    }
case 2:
{
        break forest_join_46;
    }
case 3:
{
        break forest_join_62;
    }
case 4:
{
        break forest_join_82;
    }
case 5:
{
        break forest_join_94;
    }
case 6:
{
        break forest_join_110;
    }
case 7:
{
        break forest_join_126;
    }
case 8:
{
        break forest_join_146;
    }
default:
{
        break forest_join_153;
    }
}
    }
    moom.kZ.c__Void();
    spill794_0 = 24750;
    moom.kZ.l();
    moom.kZ.b(((int)(__sourceIntrinsic_02e1fabb0e78_invokedynamic794_4(spill794_0, (1284148961613488737L ^ life2_3)))), ((int)(__sourceIntrinsic_02e1fabb0e78_invokedynamic794_5(9648, (1082212088043202419L ^ life2_3)))));
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(p1)));
    if (!((life4_5 != null))) {
        break forest_join_153;
    }
    }
    moom.kZ.c__Void();
    spill794_1 = 24750;
    moom.kZ.l();
    moom.kZ.b(((int)(__sourceIntrinsic_02e1fabb0e78_invokedynamic794_10(spill794_1, (1284148961613488737L ^ life2_3)))), ((int)(1)));
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(p1)));
    if (!((life4_5 != null))) {
        break forest_join_153;
    }
    }
    moom.kZ.c__Void();
    spill794_2 = 11400;
    moom.kZ.l();
    moom.kZ.b(((int)(__sourceIntrinsic_02e1fabb0e78_invokedynamic794_15(spill794_2, (7699186040091864646L ^ life2_3)))), ((int)(0)));
    moom.kZ.c(((float)(p1)), ((float)(p1)), ((float)(p1)), ((float)(0x1.0p0f)));
    if (!((life4_5 != null))) {
        break forest_join_153;
    }
    }
    moom.kZ.c__Void();
    spill794_3 = 28581;
    moom.kZ.l();
    moom.kZ.b(((int)(__sourceIntrinsic_02e1fabb0e78_invokedynamic794_20(spill794_3, (8613150924941471074L ^ life2_3)))), ((int)(__sourceIntrinsic_02e1fabb0e78_invokedynamic794_21(26898, (1695384805810187222L ^ life2_3)))));
    moom.kZ.c(((float)(p1)), ((float)(p1)), ((float)(p1)), ((float)(p1)));
    if (!((life4_5 != null))) {
        break forest_join_153;
    }
    }
    moom.kZ.c__Void();
    moom.kZ.l();
    moom.kZ.b(((int)(1)), ((int)(1)));
    moom.kZ.c(((float)(p1)), ((float)(p1)), ((float)(p1)), ((float)(0x1.0p0f)));
    if (!((life4_5 != null))) {
        break forest_join_153;
    }
    }
    moom.kZ.c__Void();
    moom.kZ.l();
    moom.kZ.b(((int)(0)), ((int)(__sourceIntrinsic_02e1fabb0e78_invokedynamic794_30(9580, (2378018157145679777L ^ life2_3)))));
    moom.kZ.c(((float)(p1)), ((float)(p1)), ((float)(p1)), ((float)(0x1.0p0f)));
    if (!((life4_5 != null))) {
        break forest_join_153;
    }
    }
    moom.kZ.c__Void();
    moom.kZ.l();
    moom.kZ.b(((int)(1)), ((int)(__sourceIntrinsic_02e1fabb0e78_invokedynamic794_35(11643, (8314453719450808250L ^ life2_3)))));
    moom.kZ.c(((float)(p1)), ((float)(p1)), ((float)(p1)), ((float)(0x1.0p0f)));
    if (!((life4_5 != null))) {
        break forest_join_153;
    }
    }
    moom.kZ.c__Void();
    spill794_4 = 8475;
    moom.kZ.l();
    moom.kZ.b(((int)(__sourceIntrinsic_02e1fabb0e78_invokedynamic794_40(spill794_4, (3354409466601464786L ^ life2_3)))), ((int)(__sourceIntrinsic_02e1fabb0e78_invokedynamic794_41(4008, (2614643359894654314L ^ life2_3)))));
    moom.kZ.c(((float)(p1)), ((float)(p1)), ((float)(p1)), ((float)(0x1.0p0f)));
    if (!((life4_5 != null))) {
        break forest_join_153;
    }
    }
    moom.kZ.d__Void();
    moom.kZ.k();
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(p1)));
    }
    moom.kZ.u();
    }
    return;
}


public static int a(java.lang.String p0) {
java.lang.String forwardValue2714_17_0;
    int forwardValue2714_35_0;
    int forwardValue2714_47_0;
    int forwardValue2714_59_0;
    int forwardValue2714_71_0;
    int forwardValue2714_83_0;
    int forwardValue2714_95_0;
    int forwardValue2714_111_0;
    int forwardValue2714_127_0;
    int forwardValue2714_146_0;
    java.lang.String spill2714_0;
    boolean spill2714_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_146: {
    forward_join_136: {
    forward_join_127: {
    forward_join_120: {
    forward_join_111: {
    forward_join_104: {
    forward_join_95: {
    forward_join_88: {
    forward_join_83: {
    forward_join_76: {
    forward_join_71: {
    forward_join_64: {
    forward_join_59: {
    forward_join_52: {
    forward_join_47: {
    forward_join_40: {
    forward_join_35: {
    forward_join_28: {
    forward_join_17: {
    forward_join_12: {
    life1_3 = (moom.Md.a ^ 137732782468829L);
    life3_5 = moom.Mi.b__Arrayr3();
    spill2714_0 = p0;
    if (!((life3_5 == null))) {
        forwardValue2714_17_0 = spill2714_0;
        break forward_join_17;
    }
    if (!((spill2714_0 == null))) {
        break forward_join_12;
    }
    return 1;
    }
    p0 = ((java.lang.String)(((java.lang.String)(p0)).toLowerCase())).trim();
    forwardValue2714_17_0 = p0;
    }
    spill2714_1 = ((java.lang.String)(forwardValue2714_17_0)).equals(((java.lang.Object)(__sourceIntrinsic_599c5f800586_invokedynamic2714_4(20120, (3322546245913518046L ^ life1_3)))));
    if (!((life3_5 == null))) {
        forwardValue2714_35_0 = ((spill2714_1) ? 1 : 0);
        break forward_join_35;
    }
    if (!(spill2714_1)) {
        break forward_join_28;
    }
    return 0;
    }
    forwardValue2714_35_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_599c5f800586_invokedynamic2714_7(21616, (5202786102360835388L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue2714_47_0 = forwardValue2714_35_0;
        break forward_join_47;
    }
    if (!((forwardValue2714_35_0 != 0))) {
        break forward_join_40;
    }
    return 1;
    }
    forwardValue2714_47_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_599c5f800586_invokedynamic2714_10(8596, (4075451488383693011L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue2714_59_0 = forwardValue2714_47_0;
        break forward_join_59;
    }
    if (!((forwardValue2714_47_0 != 0))) {
        break forward_join_52;
    }
    return 2;
    }
    forwardValue2714_59_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_599c5f800586_invokedynamic2714_13(12696, (207925659410194643L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue2714_71_0 = forwardValue2714_59_0;
        break forward_join_71;
    }
    if (!((forwardValue2714_59_0 != 0))) {
        break forward_join_64;
    }
    return 3;
    }
    forwardValue2714_71_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_599c5f800586_invokedynamic2714_16(12472, (5976571138604163570L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue2714_83_0 = forwardValue2714_71_0;
        break forward_join_83;
    }
    if (!((forwardValue2714_71_0 != 0))) {
        break forward_join_76;
    }
    return 4;
    }
    forwardValue2714_83_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_599c5f800586_invokedynamic2714_19(1061, (1052900056542565739L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue2714_95_0 = forwardValue2714_83_0;
        break forward_join_95;
    }
    if (!((forwardValue2714_83_0 != 0))) {
        break forward_join_88;
    }
    return 5;
    }
    forwardValue2714_95_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_599c5f800586_invokedynamic2714_22(14437, (7650527949557131565L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue2714_111_0 = forwardValue2714_95_0;
        break forward_join_111;
    }
    if (!((forwardValue2714_95_0 != 0))) {
        break forward_join_104;
    }
    return __sourceIntrinsic_599c5f800586_invokedynamic2714_25(16391, (7808679908972723310L ^ life1_3));
    }
    forwardValue2714_111_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_599c5f800586_invokedynamic2714_26(13262, (7854526042546365063L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue2714_127_0 = forwardValue2714_111_0;
        break forward_join_127;
    }
    if (!((forwardValue2714_111_0 != 0))) {
        break forward_join_120;
    }
    return __sourceIntrinsic_599c5f800586_invokedynamic2714_29(175, (7693106771355057344L ^ life1_3));
    }
    forwardValue2714_127_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_599c5f800586_invokedynamic2714_30(26794, (5927414595285301735L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue2714_146_0 = forwardValue2714_127_0;
        break forward_join_146;
    }
    if (!((forwardValue2714_127_0 != 0))) {
        break forward_join_136;
    }
    return __sourceIntrinsic_599c5f800586_invokedynamic2714_33(18008, (6856187640709937714L ^ life1_3));
    }
    java.lang.String __stackOp2714_35_0 = p0;
    java.lang.String __stackOp2714_35_1 = __sourceIntrinsic_599c5f800586_invokedynamic2714_34(20057, (7494386525537738518L ^ life1_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_599c5f800586_invokedynamic2714_36(__stackOp2714_35_1, __stackOp2714_35_0))));
    forwardValue2714_146_0 = 1;
    }
    return forwardValue2714_146_0;
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
        byte[] spill3206_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3206_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3206_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3206_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3206_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3206_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static void a(float p0) {
long local1 = (moom.Md.a ^ 65323069309115L);
    moom.kZ.c__Void();
    moom.kZ.l();
    moom.kZ.b(((int)(__sourceIntrinsic_c6b9ded72a2a_originalDynamicSite1318_3(31513, (759773073239271708L ^ local1)))), ((int)(1)));
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(p0)));
    return;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 20732);
    if (((moom.Md.c)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Md.d)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Md.d)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Md", life9_51);
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
        life9_116 = ((java.lang.String)((moom.Md.b)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Md.c)[life5_8] = moom.Md.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Md.c)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Md.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_originalDynamicSite1318_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02e1fabb0e78_invokedynamic794_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02e1fabb0e78_invokedynamic794_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02e1fabb0e78_invokedynamic794_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02e1fabb0e78_invokedynamic794_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02e1fabb0e78_invokedynamic794_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02e1fabb0e78_invokedynamic794_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02e1fabb0e78_invokedynamic794_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02e1fabb0e78_invokedynamic794_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02e1fabb0e78_invokedynamic794_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02e1fabb0e78_invokedynamic794_41(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_599c5f800586_invokedynamic2714_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_599c5f800586_invokedynamic2714_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_599c5f800586_invokedynamic2714_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_599c5f800586_invokedynamic2714_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_599c5f800586_invokedynamic2714_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_599c5f800586_invokedynamic2714_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_599c5f800586_invokedynamic2714_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_599c5f800586_invokedynamic2714_25(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_599c5f800586_invokedynamic2714_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_599c5f800586_invokedynamic2714_29(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_599c5f800586_invokedynamic2714_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_599c5f800586_invokedynamic2714_33(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_599c5f800586_invokedynamic2714_34(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_599c5f800586_invokedynamic2714_36(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6389_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6388_0() throws E;
}
