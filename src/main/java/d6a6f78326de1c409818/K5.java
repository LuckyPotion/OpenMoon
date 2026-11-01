package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class K5 extends moom.Km {

private static long f;

private static java.lang.String[] h;

private static java.lang.String[] i;

private static java.util.Map j;

private static long[] k;

private static java.lang.Integer[] l;

private static java.util.Map m;

public K5() { super((java.lang.Class)null, (java.lang.String)null, 0.0F); }


private static void __sourceConstructorBody_108e863e957d3e7f(moom.K5 receiver) throws Throwable {

long local1 = (moom.K5.f ^ 140338851166479L);

    moom.K5.__sourceConstructorInit_108e863e957d3e7f_0(((moom.K5)(receiver)), ((java.lang.Object)(moom.tl.class)), ((java.lang.String)(__sourceIntrinsic_108e863e957d3e7f_originalDynamicSite2262_2(4361, (217939534475637187L ^ local1)))), ((float)(0x1.666666p-1f)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_108e863e957d3e7f_0(moom.K5 a0, java.lang.Object a1, java.lang.String a2, float a3) throws E;

static {
f = ((long)(((moom._a)(moom._c.a(((long)(2654537828829710589L)), ((long)(5786841382182485625L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(253945125366411L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.K5.f ^ 83596551034210L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill623_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill623_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill623_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill623_14 = new byte[8];
    (__sourceSpill623_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill623_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation623_16 = __sourceSpill623_14;
    ((javax.crypto.Cipher)(__sourceSpill623_11)).init(((int)(__sourceSpill623_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill623_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation623_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[12];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "Åm8­\177g³8Ä:Ëå&'?ü°£EÝ¶\030\rórP\030¯º÷Ý/!;têÅùYWìð­Á«\020Ù Æm-é\020ÑîLÝGÈ¬ðb¬\003Ç_Dòp4z\037ÄÂTtd3\020{à\006]Þ½I rpuÒI\027 Ûä´+\020`îÓ\033ºè\016NFÃ\fÎ\\\020Þ Óþ\005«02$M\030Ñ 1jÓ\"c\006ÏzKU+\036û>±ûßÖ2ØÙ \030¶%%¼ö\026B%\ng©ZÐ\035¼sÑó}ëÍ\006å­'N½}8\030¡\024à[L\034#àÕ8trL\004MïgÉuEÜÏT\020ÏØAS7ß\"½x\024\"bä¬j\030\005¨nxlyw0cJÝ5ÎÛÊ\027èÃ¡"))).length();
    int local16_life24 = 32;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill623_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill623_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill623_29)).doFinal(((byte[])(__sourceSpill623_28)));
        java.lang.String __sourceSpill623_34 = ((java.lang.String)(moom.K5.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill623_35 = local20_life19;
        int __sourceSpill623_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill623_35)[__sourceSpill623_36] = __sourceSpill623_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "ê,ýqæ\034çA9÷ýxr óÅ\t\006'Þ<ÂAì¬±\"v\021¼;\030¸â\0342ººñ{Q\024Ó¦"))).length();
    local16_life24 = 16;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill623_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill623_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill623_42)).doFinal(((byte[])(__sourceSpill623_41)));
        java.lang.String __sourceSpill623_47 = ((java.lang.String)(moom.K5.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill623_48 = local20_life19;
        int __sourceSpill623_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill623_48)[__sourceSpill623_49] = __sourceSpill623_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    h = ((java.lang.String[])(local20_life19));
    i = ((java.lang.String[])(new java.lang.String[12]));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill623_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill623_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill623_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill623_60 = new byte[8];
    (__sourceSpill623_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill623_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation623_62 = __sourceSpill623_60;
    ((javax.crypto.Cipher)(__sourceSpill623_57)).init(((int)(__sourceSpill623_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill623_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation623_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[4];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "ð%üò]öÂ±çË¼%"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill623_71 = local4_life67;
        int __sourceSpill623_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill623_71)).substring(((int)(__sourceSpill623_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill623_76 = local6_life65;
        int __sourceSpill623_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill623_79 = new byte[8];
        (__sourceSpill623_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill623_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill623_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill623_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill623_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill623_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill623_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill623_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill623_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill623_80)).doFinal(((byte[])(__sourceSpill623_79)));
        (__sourceSpill623_76)[__sourceSpill623_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "#é¼J!Æ0Û¶YWJ¼Ü©"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill623_84 = local4_life67;
        int __sourceSpill623_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill623_84)).substring(((int)(__sourceSpill623_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill623_89 = local6_life65;
        int __sourceSpill623_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill623_92 = new byte[8];
        (__sourceSpill623_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill623_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill623_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill623_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill623_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill623_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill623_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill623_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill623_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill623_93)).doFinal(((byte[])(__sourceSpill623_92)));
        (__sourceSpill623_89)[__sourceSpill623_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    k = ((long[])(local6_life65));
    l = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.K5.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5580_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/K5"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x4C5F;
        if (K5.l[n2] == null) {
            
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
                throw new RuntimeException("moom/K5", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            K5.l[n2] = n3;
        }
        return K5.l[n2];
}


public java.lang.String[] b__ArrayString() {
long local1_life1 = (moom.K5.f ^ 125777986115148L);
    java.lang.String[] __sourceSharedArray651_4 = new java.lang.String[__sourceIntrinsic_b33388dd40f1_originalDynamicSite651_2(9401, (78362185610610920L ^ local1_life1))];
    __sourceSharedArray651_4[0] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite651_3(30610, (8021897729166620697L ^ local1_life1));
    __sourceSharedArray651_4[1] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite651_5(21131, (1158096621594582286L ^ local1_life1));
    __sourceSharedArray651_4[2] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite651_6(15776, (4774459769120420385L ^ local1_life1));
    __sourceSharedArray651_4[3] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite651_7(4748, (7209223090835250440L ^ local1_life1));
    __sourceSharedArray651_4[4] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite651_8(9122, (660973508139117608L ^ local1_life1));
    __sourceSharedArray651_4[5] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite651_9(4967, (5708099510177324263L ^ local1_life1));
    __sourceSharedArray651_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite651_10(3498, (6909127073937711609L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite651_11(19085, (2474491468308251915L ^ local1_life1));
    __sourceSharedArray651_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite651_12(23144, (2705114448753833528L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite651_13(28921, (3545035039178080122L ^ local1_life1));
    __sourceSharedArray651_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite651_14(26859, (6052150403584787641L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite651_15(10450, (1396800277987321690L ^ local1_life1));
    return __sourceSharedArray651_4;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5581_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/K5"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public moom.jD a(moom.iQ p0, java.lang.String p1) {
moom.iQ forwardValue2458_12_0;
    java.lang.String forwardValue2458_36_0;
    int forwardValue2458_63_0;
    moom.jD forwardValue2458_71_0;
    moom.iQ spill2458_0;
    java.lang.String spill2458_1;
    int spill2458_2;
    long life3_3;
    int[] life5_5;
    moom.jv life6_19;
    java.lang.String life7_49;
    moom.jD[] life8_56;
    java.lang.String life9_67;
    int life10_71;
    forward_join_72: {
    forward_join_71: {
    forward_join_70: {
    forward_join_63: {
    forward_join_48: {
    forward_join_36: {
    forward_join_31: {
    forward_join_18: {
    forward_join_16: {
    forward_join_12: {
    life3_3 = (moom.K5.f ^ 129773722187284L);
    life5_5 = moom.Km.b();
    spill2458_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue2458_12_0 = spill2458_0;
        break forward_join_12;
    }
    if (!((((spill2458_0 instanceof moom.jv) ? 1 : 0) != 0))) {
        break forward_join_16;
    }
    forwardValue2458_12_0 = p0;
    }
    life6_19 = ((moom.jv)(forwardValue2458_12_0));
    if (!((life5_5 == null))) {
        break forward_join_18;
    }
    }
    return null;
    }
    spill2458_1 = p1;
    if (!((life5_5 != null))) {
        forwardValue2458_36_0 = spill2458_1;
        break forward_join_36;
    }
    if (!(((java.lang.String)(spill2458_1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2458_4(17546, (6448746436363119440L ^ life3_3))))))) {
        break forward_join_31;
    }
    return ((moom.jv)(life6_19)).i;
    }
    forwardValue2458_36_0 = __sourceIntrinsic_38607ace6cb3_invokedynamic2458_7(5190, (2880598700767165337L ^ life3_3));
    }
    life7_49 = forwardValue2458_36_0;
    if (!(((java.lang.String)(p1)).startsWith(((java.lang.String)(life7_49))))) {
        break forward_join_72;
    }
    life8_56 = ((moom.jv)(life6_19)).j;
    if (!((life8_56 == null))) {
        break forward_join_48;
    }
    return null;
    }
    life9_67 = ((java.lang.String)(p1)).substring(((int)(((java.lang.String)(life7_49)).length())));
    life10_71 = moom.BU.a(((java.lang.String)(life9_67)), ((int)(-1)));
    life10_71 += -1;
    spill2458_2 = life10_71;
    if (!((life5_5 != null))) {
        forwardValue2458_63_0 = spill2458_2;
        break forward_join_63;
    }
    if (!((spill2458_2 >= 0))) {
        break forward_join_70;
    }
    forwardValue2458_63_0 = life10_71;
    }
    if (!((forwardValue2458_63_0 < (life8_56).length))) {
        break forward_join_70;
    }
    forwardValue2458_71_0 = (life8_56)[life10_71];
    break forward_join_71;
    }
    forwardValue2458_71_0 = null;
    }
    return forwardValue2458_71_0;
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
        byte[] spill2850_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2850_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2850_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2850_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2850_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2850_2)[life4_9];
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
return new moom.jv();
}


public moom.Kl a(moom.iQ p0, float p1) {
net.minecraft.client.renderer.entity.RenderManager local3 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__nw();
    return new moom.nm(local3, p0, p1);
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 28558);
    if (((moom.K5.i)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.K5.j)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.K5.j)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/K5", life9_51);
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
        life9_116 = ((java.lang.String)((moom.K5.h)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.K5.i)[life5_8] = __sourceExactCall_1e68332bd03ba1(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.K5.i)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = __sourceExactCall_422964f9e30790(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_108e863e957d3e7f_originalDynamicSite2262_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5580_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite651_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite651_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite651_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite651_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite651_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite651_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite651_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite651_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite651_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite651_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite651_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite651_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite651_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5581_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2458_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2458_7(int a0, long a1) throws E;

private static native java.lang.String __sourceExactCall_1e68332bd03ba1(byte[] p0);
private static native java.lang.String __sourceExactCall_422964f9e30790(int p0, long p1);
}
