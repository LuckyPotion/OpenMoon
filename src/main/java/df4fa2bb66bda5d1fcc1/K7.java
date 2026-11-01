package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class K7 extends moom.Km {

private static long f;

private static java.lang.String[] h;

private static java.lang.String[] i;

private static java.util.Map j;

private static long[] k;

private static java.lang.Integer[] l;

private static java.util.Map m;

public K7() { super((java.lang.Class)null, (java.lang.String)null, 0.0F); }


private static void __sourceConstructorBody_756e77b725ee7b04(moom.K7 receiver) throws Throwable {

long local1 = (moom.K7.f ^ 1104671040751L);

    moom.K7.__sourceConstructorInit_756e77b725ee7b04_0(((moom.K7)(receiver)), ((java.lang.Object)(moom.ta.class)), ((java.lang.String)(__sourceIntrinsic_756e77b725ee7b04_originalDynamicSite2266_2(11060, (5861234787600319277L ^ local1)))), ((float)(0x1.0p-1f)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_756e77b725ee7b04_0(moom.K7 a0, java.lang.Object a1, java.lang.String a2, float a3) throws E;

static {
f = ((long)(((moom._a)(moom._c.a(((long)(-4202576644278527323L)), ((long)(2730340233868737305L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(116646621651172L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.K7.f ^ 43016515083205L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill625_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill625_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill625_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill625_14 = new byte[8];
    (__sourceSpill625_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill625_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation625_16 = __sourceSpill625_14;
    ((javax.crypto.Cipher)(__sourceSpill625_11)).init(((int)(__sourceSpill625_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill625_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation625_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[16];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "íi}©õ©\005~[AÝbK\002ãz²0\rg\005\020~/\\S\034ûp?Â)° \f\003Ð\020Óáð8wà3Õ--m}¯ð\020sÄß\005\000å\\F2¥ã$E¢\020©¹h@ªzT\016>¾zÊ\020MDÊ;Y¼CÛý`\017\024ø¨¨\020zªc­!\0373·ßs%\030w±A«u+mTû\030xÇ¥¡ \001\027æ£\001\002ª\020Ûc¼0b¨º%\034Í!\f²Ô`\020´ºÑ½ÿB2Äè÷G#u\020\020J\177\0176H­ø(ZÁ\f¨Oª$\020A\016#\013r ×\f\036sex0\020Ä\000M?wÙrrÐ\003Ú·mb\024\030\032·Ï8º/le?ÍmkÑ!ÖÀoÇ'åê"))).length();
    int local16_life24 = 24;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill625_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill625_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill625_29)).doFinal(((byte[])(__sourceSpill625_28)));
        java.lang.String __sourceSpill625_34 = ((java.lang.String)(moom.K7.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill625_35 = local20_life19;
        int __sourceSpill625_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill625_35)[__sourceSpill625_36] = __sourceSpill625_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "µ=â%\032`øñªåYÆIþ ÂÉ©âRcõA!\027ò{ßý×\026!JÈ_ð8ß - ;Sº-"))).length();
    local16_life24 = 16;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill625_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill625_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill625_42)).doFinal(((byte[])(__sourceSpill625_41)));
        java.lang.String __sourceSpill625_47 = ((java.lang.String)(moom.K7.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill625_48 = local20_life19;
        int __sourceSpill625_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill625_48)[__sourceSpill625_49] = __sourceSpill625_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    h = ((java.lang.String[])(local20_life19));
    i = ((java.lang.String[])(new java.lang.String[16]));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill625_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill625_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill625_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill625_60 = new byte[8];
    (__sourceSpill625_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill625_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation625_62 = __sourceSpill625_60;
    ((javax.crypto.Cipher)(__sourceSpill625_57)).init(((int)(__sourceSpill625_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill625_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation625_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[2];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "ÛR¬H7»ßrôn33J?\005"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill625_71 = local4_life67;
        int __sourceSpill625_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill625_71)).substring(((int)(__sourceSpill625_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill625_76 = local6_life65;
        int __sourceSpill625_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill625_79 = new byte[8];
        (__sourceSpill625_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill625_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill625_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill625_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill625_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill625_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill625_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill625_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill625_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill625_80)).doFinal(((byte[])(__sourceSpill625_79)));
        (__sourceSpill625_76)[__sourceSpill625_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    k = ((long[])(local6_life65));
    l = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.K7.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5589_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/K7"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x4B3D;
        if (K7.l[n2] == null) {
            
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
                throw new RuntimeException("moom/K7", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            K7.l[n2] = n4;
        }
        return K7.l[n2];
}


public java.lang.String[] b__ArrayString() {
long local1_life1 = (moom.K7.f ^ 33081096997756L);
    java.lang.String[] __sourceSharedArray653_4 = new java.lang.String[__sourceIntrinsic_b33388dd40f1_originalDynamicSite653_2(18369, (2010390023135243506L ^ local1_life1))];
    __sourceSharedArray653_4[0] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite653_3(21423, (6707592306361029667L ^ local1_life1));
    __sourceSharedArray653_4[1] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite653_5(25254, (5147521230565860651L ^ local1_life1));
    __sourceSharedArray653_4[2] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite653_6(13191, (3459899426722821127L ^ local1_life1));
    __sourceSharedArray653_4[3] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite653_7(21138, (6690923446612710685L ^ local1_life1));
    __sourceSharedArray653_4[4] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite653_8(13186, (2844320439716131846L ^ local1_life1));
    __sourceSharedArray653_4[5] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite653_9(14412, (5007966529808646087L ^ local1_life1));
    __sourceSharedArray653_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite653_10(30433, (1767056727465762259L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite653_11(20054, (4305791202466712023L ^ local1_life1));
    return __sourceSharedArray653_4;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5590_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/K7"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public moom.jD a(moom.iQ p0, java.lang.String p1) {
moom.iQ forwardValue2460_12_0;
    int forwardValue2460_38_0;
    int forwardValue2460_51_0;
    int forwardValue2460_64_0;
    int forwardValue2460_77_0;
    int forwardValue2460_90_0;
    int forwardValue2460_103_0;
    int forwardValue2460_116_0;
    moom.jD forwardValue2460_121_0;
    moom.iQ spill2460_0;
    boolean spill2460_1;
    long life3_3;
    int[] life5_5;
    moom.jx life6_19;
    forward_join_121: {
    forward_join_120: {
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
    life3_3 = (moom.K7.f ^ 29094103968548L);
    life5_5 = moom.Km.b();
    spill2460_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue2460_12_0 = spill2460_0;
        break forward_join_12;
    }
    if (!((((spill2460_0 instanceof moom.jx) ? 1 : 0) != 0))) {
        break forward_join_16;
    }
    forwardValue2460_12_0 = p0;
    }
    life6_19 = ((moom.jx)(forwardValue2460_12_0));
    if (!((life5_5 == null))) {
        break forward_join_18;
    }
    }
    return null;
    }
    spill2460_1 = ((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2460_4(9996, (613106390883647708L ^ life3_3)))));
    if (!((life5_5 != null))) {
        forwardValue2460_38_0 = ((spill2460_1) ? 1 : 0);
        break forward_join_38;
    }
    if (!(spill2460_1)) {
        break forward_join_31;
    }
    forwardValue2460_121_0 = ((moom.jx)(life6_19)).p;
    break forward_join_121;
    }
    forwardValue2460_38_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2460_8(28991, (5250819407561463521L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2460_51_0 = forwardValue2460_38_0;
        break forward_join_51;
    }
    if (!((forwardValue2460_38_0 != 0))) {
        break forward_join_44;
    }
    forwardValue2460_121_0 = ((moom.jx)(life6_19)).q;
    break forward_join_121;
    }
    forwardValue2460_51_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2460_12(8326, (1772303362164803408L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2460_64_0 = forwardValue2460_51_0;
        break forward_join_64;
    }
    if (!((forwardValue2460_51_0 != 0))) {
        break forward_join_57;
    }
    forwardValue2460_121_0 = ((moom.jx)(life6_19)).i;
    break forward_join_121;
    }
    forwardValue2460_64_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2460_16(22223, (3055284433585189136L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2460_77_0 = forwardValue2460_64_0;
        break forward_join_77;
    }
    if (!((forwardValue2460_64_0 != 0))) {
        break forward_join_70;
    }
    forwardValue2460_121_0 = ((moom.jx)(life6_19)).j;
    break forward_join_121;
    }
    forwardValue2460_77_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2460_20(26136, (833258354856034754L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2460_90_0 = forwardValue2460_77_0;
        break forward_join_90;
    }
    if (!((forwardValue2460_77_0 != 0))) {
        break forward_join_83;
    }
    forwardValue2460_121_0 = ((moom.jx)(life6_19)).k;
    break forward_join_121;
    }
    forwardValue2460_90_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2460_24(18474, (3685116605594578939L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2460_103_0 = forwardValue2460_90_0;
        break forward_join_103;
    }
    if (!((forwardValue2460_90_0 != 0))) {
        break forward_join_96;
    }
    forwardValue2460_121_0 = ((moom.jx)(life6_19)).m;
    break forward_join_121;
    }
    forwardValue2460_103_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2460_28(20634, (763185891565877057L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2460_116_0 = forwardValue2460_103_0;
        break forward_join_116;
    }
    if (!((forwardValue2460_103_0 != 0))) {
        break forward_join_109;
    }
    forwardValue2460_121_0 = ((moom.jx)(life6_19)).l;
    break forward_join_121;
    }
    forwardValue2460_116_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2460_32(22021, (1641499708095508952L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((forwardValue2460_116_0 != 0))) {
        break forward_join_120;
    }
    forwardValue2460_121_0 = ((moom.jx)(life6_19)).n;
    break forward_join_121;
    }
    forwardValue2460_121_0 = null;
    }
    return forwardValue2460_121_0;
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
        byte[] spill2854_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2854_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2854_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2854_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2854_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2854_2)[life4_9];
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
return new moom.jx(0x0.0p0f);
}


public moom.Kl a(moom.iQ p0, float p1) {
net.minecraft.client.renderer.entity.RenderManager local3 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__nw();
    moom.no local4 = new moom.no(local3);
    ((moom.no)(local4)).m = ((moom.iQ)(p0));
    ((moom.no)(local4)).c = ((float)(p1));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 10123);
    if (((moom.K7.i)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.K7.j)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.K7.j)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/K7", life9_51);
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
        life9_116 = ((java.lang.String)((moom.K7.h)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.K7.i)[life5_8] = __sourceExactCall_ff8d0158e19f35(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.K7.i)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = __sourceExactCall_187843ea60ddbc(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_756e77b725ee7b04_originalDynamicSite2266_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5589_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite653_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite653_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite653_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite653_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite653_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite653_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite653_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite653_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite653_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5590_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2460_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2460_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2460_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2460_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2460_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2460_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2460_28(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2460_32(int a0, long a1) throws E;

private static native java.lang.String __sourceExactCall_ff8d0158e19f35(byte[] p0);
private static native java.lang.String __sourceExactCall_187843ea60ddbc(int p0, long p1);
}
