package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Kx extends moom.Km {

private static long f;

private static java.lang.String[] h;

private static java.lang.String[] i;

private static java.util.Map j;

private static long[] k;

private static java.lang.Integer[] l;

private static java.util.Map m;

public Kx() { super((java.lang.Class)null, (java.lang.String)null, 0.0F); }


private static void __sourceConstructorBody_78b1734181abc74d(moom.Kx receiver) throws Throwable {

long local1 = (moom.Kx.f ^ 98756998374219L);

    moom.Kx.__sourceConstructorInit_78b1734181abc74d_0(((moom.Kx)(receiver)), ((java.lang.Object)(moom.Ce.class)), ((java.lang.String)(__sourceIntrinsic_78b1734181abc74d_originalDynamicSite2352_2(28704, (5708126243937250799L ^ local1)))), ((float)(0x0.0p0f)));

    return;

}



static {
f = ((long)(((moom._a)(moom._c.a(((long)(8509227447395604197L)), ((long)(-5728844705985299027L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(166924564176163L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.Kx.f ^ 71756463225859L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill660_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill660_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill660_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill660_14 = new byte[8];
    (__sourceSpill660_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill660_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation660_16 = __sourceSpill660_14;
    ((javax.crypto.Cipher)(__sourceSpill660_11)).init(((int)(__sourceSpill660_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill660_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation660_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[15];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "ØW­Ò®¦Úke(a\021Üã=dø\026Á¤a\024ð¨ À\036n\004¬ò©QwµAdõÂÒcv4/rUÍxZ´xèo\022 \021óqD.\"@\037Ì]BR\\ìð\0022­õ[ 2ÓÊÈE)\006¶\0304UôNÛød­3J'so­¶\027\035\020&$\030.(5Éº!)©\013ÞV\b|%ÎQü\022ÔØiÇ\007¿ã8aOuÎù¸ÊLÕ(¿8Ònäû3~-AG\030Nú+B|~\006*Ð°þLè|Ð±+£Ø4ì<(±×®ÕWbÑ\032£Óß@1\007µóz¿V\r¯S«]lÎµãà,1ÖÉ\b LÉïÞÀu~P¾j{×Øû3\027ö\001@\026H\rû!0\023L$£ <2ÕÊ¨¾í\bÚTG\032Î­\fM É\023Ñr2½Ö$ssÓß\020Ø¥;f\033Èdù\005\004þÕJ«\024 ãlo\004w3+ ,\013ÊùQP(#Øoð\"úùó\b|TdY»\030ZåuY;X,`¡ÀÑ¿\0205ó}Ó KÙ}\023ë\002ð¹uÏ¾ç;\n\024VNèã³\030Lô\025¢!Î"))).length();
    int local16_life24 = 32;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill660_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill660_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill660_29)).doFinal(((byte[])(__sourceSpill660_28)));
        java.lang.String __sourceSpill660_34 = ((java.lang.String)(moom.Kx.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill660_35 = local20_life19;
        int __sourceSpill660_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill660_35)[__sourceSpill660_36] = __sourceSpill660_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "ÔwiÈ¢¨¾À¼ëú\013vs9t¦\022\007£o(Åi>uT·­ÞHCoRú\021IÄéÜOãwyöµ!K,<ö=\né>F°³"))).length();
    local16_life24 = 24;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill660_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill660_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill660_42)).doFinal(((byte[])(__sourceSpill660_41)));
        java.lang.String __sourceSpill660_47 = ((java.lang.String)(moom.Kx.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill660_48 = local20_life19;
        int __sourceSpill660_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill660_48)[__sourceSpill660_49] = __sourceSpill660_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    h = ((java.lang.String[])(local20_life19));
    i = ((java.lang.String[])(new java.lang.String[15]));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill660_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill660_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill660_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill660_60 = new byte[8];
    (__sourceSpill660_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill660_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation660_62 = __sourceSpill660_60;
    ((javax.crypto.Cipher)(__sourceSpill660_57)).init(((int)(__sourceSpill660_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill660_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation660_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[2];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "ÁI\"J¬½îI~5´qÝðó"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill660_71 = local4_life67;
        int __sourceSpill660_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill660_71)).substring(((int)(__sourceSpill660_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill660_76 = local6_life65;
        int __sourceSpill660_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill660_79 = new byte[8];
        (__sourceSpill660_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill660_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill660_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill660_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill660_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill660_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill660_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill660_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill660_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill660_80)).doFinal(((byte[])(__sourceSpill660_79)));
        (__sourceSpill660_76)[__sourceSpill660_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    k = ((long[])(local6_life65));
    l = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_78b1734181abc74d_0(moom.Kx a0, java.lang.Object a1, java.lang.String a2, float a3) throws E;

private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Kx.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5807_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Kx"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x76A7;
        if (Kx.l[n2] == null) {
            
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
                throw new RuntimeException("moom/Kx", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Kx.l[n2] = n4;
        }
        return Kx.l[n2];
}


public java.lang.String[] b__ArrayString() {
long local1_life1 = (moom.Kx.f ^ 122087823115498L);
    java.lang.String[] __sourceSharedArray673_4 = new java.lang.String[__sourceIntrinsic_b33388dd40f1_originalDynamicSite673_2(29444, (4101109374058997164L ^ local1_life1))];
    __sourceSharedArray673_4[0] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite673_3(11525, (3591293218429114216L ^ local1_life1));
    __sourceSharedArray673_4[1] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite673_5(23677, (6699634867748070935L ^ local1_life1));
    __sourceSharedArray673_4[2] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite673_6(21682, (1426184009689525972L ^ local1_life1));
    __sourceSharedArray673_4[3] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite673_7(11683, (5825083146155988935L ^ local1_life1));
    __sourceSharedArray673_4[4] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite673_8(900, (742398662428735975L ^ local1_life1));
    __sourceSharedArray673_4[5] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite673_9(3340, (5805877574087948142L ^ local1_life1));
    __sourceSharedArray673_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite673_10(21362, (3419723116437145051L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite673_11(29806, (5799109872762113541L ^ local1_life1));
    return __sourceSharedArray673_4;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5808_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Kx"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public moom.jD a(moom.iQ p0, java.lang.String p1) {
moom.iQ forwardValue2527_12_0;
    int forwardValue2527_38_0;
    int forwardValue2527_51_0;
    int forwardValue2527_64_0;
    int forwardValue2527_77_0;
    int forwardValue2527_90_0;
    int forwardValue2527_103_0;
    moom.jD forwardValue2527_108_0;
    moom.iQ spill2527_0;
    boolean spill2527_1;
    long life3_3;
    int[] life5_5;
    moom.i3 life6_19;
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
    life3_3 = (moom.Kx.f ^ 118105122956466L);
    life5_5 = moom.Km.b();
    spill2527_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue2527_12_0 = spill2527_0;
        break forward_join_12;
    }
    if (!((((spill2527_0 instanceof moom.i3) ? 1 : 0) != 0))) {
        break forward_join_16;
    }
    forwardValue2527_12_0 = p0;
    }
    life6_19 = ((moom.i3)(forwardValue2527_12_0));
    if (!((life5_5 == null))) {
        break forward_join_18;
    }
    }
    return null;
    }
    spill2527_1 = ((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2527_4(592, (5557081203920590952L ^ life3_3)))));
    if (!((life5_5 != null))) {
        forwardValue2527_38_0 = ((spill2527_1) ? 1 : 0);
        break forward_join_38;
    }
    if (!(spill2527_1)) {
        break forward_join_31;
    }
    forwardValue2527_108_0 = ((moom.i3)(life6_19)).i;
    break forward_join_108;
    }
    forwardValue2527_38_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2527_8(19176, (4404673806275481813L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2527_51_0 = forwardValue2527_38_0;
        break forward_join_51;
    }
    if (!((forwardValue2527_38_0 != 0))) {
        break forward_join_44;
    }
    forwardValue2527_108_0 = ((moom.i3)(life6_19)).j;
    break forward_join_108;
    }
    forwardValue2527_51_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2527_12(10992, (6104847956449390791L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2527_64_0 = forwardValue2527_51_0;
        break forward_join_64;
    }
    if (!((forwardValue2527_51_0 != 0))) {
        break forward_join_57;
    }
    forwardValue2527_108_0 = ((moom.i3)(life6_19)).k;
    break forward_join_108;
    }
    forwardValue2527_64_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2527_16(1182, (5541440924278185633L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2527_77_0 = forwardValue2527_64_0;
        break forward_join_77;
    }
    if (!((forwardValue2527_64_0 != 0))) {
        break forward_join_70;
    }
    forwardValue2527_108_0 = ((moom.i3)(life6_19)).l;
    break forward_join_108;
    }
    forwardValue2527_77_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2527_20(31458, (3956755157643829467L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2527_90_0 = forwardValue2527_77_0;
        break forward_join_90;
    }
    if (!((forwardValue2527_77_0 != 0))) {
        break forward_join_83;
    }
    forwardValue2527_108_0 = ((moom.i3)(life6_19)).m;
    break forward_join_108;
    }
    forwardValue2527_90_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2527_24(19265, (1198187833697931632L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2527_103_0 = forwardValue2527_90_0;
        break forward_join_103;
    }
    if (!((forwardValue2527_90_0 != 0))) {
        break forward_join_96;
    }
    forwardValue2527_108_0 = ((moom.i3)(life6_19)).n;
    break forward_join_108;
    }
    forwardValue2527_103_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2527_28(18054, (1012515428297743538L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((forwardValue2527_103_0 != 0))) {
        break forward_join_107;
    }
    forwardValue2527_108_0 = ((moom.i3)(life6_19)).o;
    break forward_join_108;
    }
    forwardValue2527_108_0 = null;
    }
    return forwardValue2527_108_0;
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
        byte[] spill2967_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2967_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2967_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2967_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2967_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2967_2)[life4_9];
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
return new moom.i3();
}


public moom.Kl a(moom.iQ p0, float p1) {
net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer forestValue10_20_0;
    net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer forestValue10_37_0;
    int[] spill10_0;
    net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer spill10_1;
    long life3_3;
    moom.oo life6_6;
    net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer life7_10;
    int[] life5_11;
    forest_join_37: {
    forest_join_31: {
    forest_join_20: {
    forest_join_19: {
    life3_3 = (moom.Kx.f ^ 3579957842709L);
    spill10_0 = moom.Km.b();
    life6_6 = moom.oo.b;
    life7_10 = ((moom.oo)(life6_6)).a(((java.lang.Class)(moom.Ce.class)));
    life5_11 = spill10_0;
    spill10_1 = life7_10;
    if (!((life5_11 != null))) {
        forestValue10_20_0 = spill10_1;
        break forest_join_20;
    }
    if (!((((spill10_1 instanceof moom.ou) ? 1 : 0) == 0))) {
        break forest_join_19;
    }
    return null;
    }
    forestValue10_20_0 = life7_10;
    }
    if (!((life5_11 != null))) {
        forestValue10_37_0 = forestValue10_20_0;
        break forest_join_37;
    }
    if (!((((net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer)(forestValue10_20_0)).a() == null))) {
        break forest_join_31;
    }
    life7_10 = new moom.ou();
    ((net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer)(life7_10)).a(((moom.oo)(life6_6)));
    }
    ((moom.ou)(((moom.ou)(life7_10)))).g = ((moom.i3)(((moom.i3)(p0))));
    forestValue10_37_0 = life7_10;
    }
    return forestValue10_37_0;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 6760);
    if (((moom.Kx.i)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Kx.j)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Kx.j)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Kx", life9_51);
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
        life9_116 = ((java.lang.String)((moom.Kx.h)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Kx.i)[life5_8] = __sourceExactCall_6381ca16d878bf(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Kx.i)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = __sourceExactCall_a8888e9613829e(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_78b1734181abc74d_originalDynamicSite2352_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5808_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2527_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2527_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2527_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2527_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2527_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2527_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2527_28(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5807_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite673_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite673_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite673_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite673_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite673_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite673_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite673_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite673_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite673_11(int a0, long a1) throws E;

private static native java.lang.String __sourceExactCall_6381ca16d878bf(byte[] p0);
private static native java.lang.String __sourceExactCall_a8888e9613829e(int p0, long p1);
}
