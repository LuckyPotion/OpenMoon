package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class K_ extends moom.Km {

private static long f;

private static java.lang.String[] h;

private static java.lang.String[] i;

private static java.util.Map j;

private static long[] k;

private static java.lang.Integer[] l;

private static java.util.Map m;

public K_() { super((java.lang.Class)null, (java.lang.String)null, 0.0F); }


private static void __sourceConstructorBody_ab29b55c046a9e89(moom.K_ receiver) throws Throwable {

long local1 = (moom.K_.f ^ 5057421260389L);

    moom.K_.__sourceConstructorInit_ab29b55c046a9e89_0(((moom.K_)(receiver)), ((java.lang.Object)(net.minecraft.entity.passive.EntityWolf.class)), ((java.lang.String)(__sourceIntrinsic_ab29b55c046a9e89_originalDynamicSite2323_2(17806, (3848732769771032957L ^ local1)))), ((float)(0x1.0p-1f)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_ab29b55c046a9e89_0(moom.K_ a0, java.lang.Object a1, java.lang.String a2, float a3) throws E;

static {
f = ((long)(((moom._a)(moom._c.a(((long)(-950908672688187865L)), ((long)(1313413638225015713L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(264745887124684L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.K_.f ^ 65485242114044L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill649_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill649_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill649_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill649_14 = new byte[8];
    (__sourceSpill649_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill649_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation649_16 = __sourceSpill649_14;
    ((javax.crypto.Cipher)(__sourceSpill649_11)).init(((int)(__sourceSpill649_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill649_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation649_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[17];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = ".QTÊèäl=¢Ã\020Ñªþ¼0\020êqFÌVõú dFÝ6)ÿ¾¨\020%ºab\023w£j;?jk«\020cH\tÔ\b\n9\000%rÜp½ðYv\020Àô\r\021bWkÜ\005LQ\023Å\020,¨\177\0167°6(I8ÖÙF°Ñ\177\020\t¼|NÄ\bGÞ\177\026ó?\020-´g\024ÞtË|ú?¨«\013\020\030\020)ùW\002aª\036n©\003\rw_\020±ßp.rï*sr\f\000/|M&\020è\022a^9é×õSôöd¿\020<Y»*w\021LÕ´\003bb\025-§R\020j>Î%/kÚ;´¸\024§\027Èç\020PB«I/*{\002³¬'Ï+Ç>\020O¢±BûkG\030\034ÁÂÌ^"))).length();
    int local16_life24 = 16;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill649_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill649_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill649_29)).doFinal(((byte[])(__sourceSpill649_28)));
        java.lang.String __sourceSpill649_34 = ((java.lang.String)(moom.K_.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill649_35 = local20_life19;
        int __sourceSpill649_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill649_35)[__sourceSpill649_36] = __sourceSpill649_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "XyEuáðÐÏ_Òï¬à\020 !J¬Ð,\r·u\005`L£!"))).length();
    local16_life24 = 16;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill649_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill649_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill649_42)).doFinal(((byte[])(__sourceSpill649_41)));
        java.lang.String __sourceSpill649_47 = ((java.lang.String)(moom.K_.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill649_48 = local20_life19;
        int __sourceSpill649_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill649_48)[__sourceSpill649_49] = __sourceSpill649_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    h = ((java.lang.String[])(local20_life19));
    i = ((java.lang.String[])(new java.lang.String[17]));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill649_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill649_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill649_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill649_60 = new byte[8];
    (__sourceSpill649_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill649_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation649_62 = __sourceSpill649_60;
    ((javax.crypto.Cipher)(__sourceSpill649_57)).init(((int)(__sourceSpill649_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill649_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation649_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[3];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "ÌKlt¬\035­½´\026áx\n¼X4üK5¢"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill649_71 = local4_life67;
        int __sourceSpill649_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill649_71)).substring(((int)(__sourceSpill649_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill649_76 = local6_life65;
        int __sourceSpill649_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill649_79 = new byte[8];
        (__sourceSpill649_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill649_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill649_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill649_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill649_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill649_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill649_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill649_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill649_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill649_80)).doFinal(((byte[])(__sourceSpill649_79)));
        (__sourceSpill649_76)[__sourceSpill649_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    k = ((long[])(local6_life65));
    l = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.K_.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5710_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/K_"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x3CD7;
        if (K_.l[n2] == null) {
            
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
                throw new RuntimeException("moom/K_", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            K_.l[n2] = n4;
        }
        return K_.l[n2];
}


public java.lang.String[] b__ArrayString() {
long local1_life1 = (moom.K_.f ^ 132874422015965L);
    java.lang.String[] __sourceSharedArray667_4 = new java.lang.String[__sourceIntrinsic_b33388dd40f1_originalDynamicSite667_2(6493, (8028898568321664388L ^ local1_life1))];
    __sourceSharedArray667_4[0] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite667_3(26773, (554782586187865552L ^ local1_life1));
    __sourceSharedArray667_4[1] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite667_5(3596, (5917342535783824192L ^ local1_life1));
    __sourceSharedArray667_4[2] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite667_6(13283, (5199770696453883566L ^ local1_life1));
    __sourceSharedArray667_4[3] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite667_7(30482, (5072632347736785496L ^ local1_life1));
    __sourceSharedArray667_4[4] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite667_8(12041, (5185448102671718976L ^ local1_life1));
    __sourceSharedArray667_4[5] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite667_9(24580, (848060945608070471L ^ local1_life1));
    __sourceSharedArray667_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite667_10(15521, (3586800965560311931L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite667_11(10929, (3136999163544870905L ^ local1_life1));
    __sourceSharedArray667_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite667_12(11841, (3025150525941691033L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite667_13(30510, (1186598064989160044L ^ local1_life1));
    return __sourceSharedArray667_4;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5711_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/K_"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public moom.jD a(moom.iQ p0, java.lang.String p1) {
moom.iQ forwardValue2485_12_0;
    int forwardValue2485_38_0;
    int forwardValue2485_51_0;
    int forwardValue2485_64_0;
    int forwardValue2485_77_0;
    int forwardValue2485_90_0;
    int forwardValue2485_103_0;
    int forwardValue2485_116_0;
    moom.jD forwardValue2485_121_0;
    moom.iQ spill2485_0;
    boolean spill2485_1;
    long life3_3;
    int[] life5_5;
    moom.jz life6_19;
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
    life3_3 = (moom.K_.f ^ 137140588197765L);
    life5_5 = moom.Km.b();
    spill2485_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue2485_12_0 = spill2485_0;
        break forward_join_12;
    }
    if (!((((spill2485_0 instanceof moom.jz) ? 1 : 0) != 0))) {
        break forward_join_16;
    }
    forwardValue2485_12_0 = p0;
    }
    life6_19 = ((moom.jz)(forwardValue2485_12_0));
    if (!((life5_5 == null))) {
        break forward_join_18;
    }
    }
    return null;
    }
    spill2485_1 = ((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2485_4(22405, (5426577670242271897L ^ life3_3)))));
    if (!((life5_5 != null))) {
        forwardValue2485_38_0 = ((spill2485_1) ? 1 : 0);
        break forward_join_38;
    }
    if (!(spill2485_1)) {
        break forward_join_31;
    }
    forwardValue2485_121_0 = ((moom.jz)(life6_19)).i;
    break forward_join_121;
    }
    forwardValue2485_38_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2485_8(8940, (8812022855705065461L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2485_51_0 = forwardValue2485_38_0;
        break forward_join_51;
    }
    if (!((forwardValue2485_38_0 != 0))) {
        break forward_join_44;
    }
    forwardValue2485_121_0 = ((moom.jz)(life6_19)).j;
    break forward_join_121;
    }
    forwardValue2485_51_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2485_12(29041, (7252139224701052015L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2485_64_0 = forwardValue2485_51_0;
        break forward_join_64;
    }
    if (!((forwardValue2485_51_0 != 0))) {
        break forward_join_57;
    }
    forwardValue2485_121_0 = ((moom.jz)(life6_19)).k;
    break forward_join_121;
    }
    forwardValue2485_64_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2485_16(31973, (4113903696338463226L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2485_77_0 = forwardValue2485_64_0;
        break forward_join_77;
    }
    if (!((forwardValue2485_64_0 != 0))) {
        break forward_join_70;
    }
    forwardValue2485_121_0 = ((moom.jz)(life6_19)).l;
    break forward_join_121;
    }
    forwardValue2485_77_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2485_20(2255, (5766896126652603865L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2485_90_0 = forwardValue2485_77_0;
        break forward_join_90;
    }
    if (!((forwardValue2485_77_0 != 0))) {
        break forward_join_83;
    }
    forwardValue2485_121_0 = ((moom.jz)(life6_19)).m;
    break forward_join_121;
    }
    forwardValue2485_90_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2485_24(25302, (12710663464826830L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2485_103_0 = forwardValue2485_90_0;
        break forward_join_103;
    }
    if (!((forwardValue2485_90_0 != 0))) {
        break forward_join_96;
    }
    forwardValue2485_121_0 = ((moom.jz)(life6_19)).n;
    break forward_join_121;
    }
    forwardValue2485_103_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2485_28(10294, (1712540065836104993L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2485_116_0 = forwardValue2485_103_0;
        break forward_join_116;
    }
    if (!((forwardValue2485_103_0 != 0))) {
        break forward_join_109;
    }
    forwardValue2485_121_0 = ((moom.jz)(life6_19)).o;
    break forward_join_121;
    }
    forwardValue2485_116_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2485_32(14130, (5710270971162157629L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((forwardValue2485_116_0 != 0))) {
        break forward_join_120;
    }
    forwardValue2485_121_0 = ((moom.jz)(life6_19)).p;
    break forward_join_121;
    }
    forwardValue2485_121_0 = null;
    }
    return forwardValue2485_121_0;
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
        byte[] spill2908_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2908_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2908_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2908_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2908_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2908_2)[life4_9];
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
return new moom.jz();
}


public moom.Kl a(moom.iQ p0, float p1) {
net.minecraft.client.renderer.entity.RenderManager local3 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__nw();
    return new net.minecraft.client.renderer.entity.RenderWolf(local3, p0, p1);
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 5448);
    if (((moom.K_.i)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.K_.j)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.K_.j)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/K_", life9_51);
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
        life9_116 = ((java.lang.String)((moom.K_.h)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.K_.i)[life5_8] = __sourceExactCall_88ae8b22a3d3de(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.K_.i)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = __sourceExactCall_59635e8c8bad1e(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ab29b55c046a9e89_originalDynamicSite2323_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5710_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite667_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite667_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite667_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite667_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite667_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite667_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite667_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite667_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite667_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite667_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite667_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5711_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2485_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2485_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2485_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2485_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2485_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2485_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2485_28(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2485_32(int a0, long a1) throws E;

private static native java.lang.String __sourceExactCall_88ae8b22a3d3de(byte[] p0);
private static native java.lang.String __sourceExactCall_59635e8c8bad1e(int p0, long p1);
}
