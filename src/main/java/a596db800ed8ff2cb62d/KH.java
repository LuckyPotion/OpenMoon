package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class KH extends moom.Km {

private static long f;

private static java.lang.String[] h;

private static java.lang.String[] i;

private static java.util.Map j;

private static long[] k;

private static java.lang.Integer[] l;

private static java.util.Map m;

public KH() { super((java.lang.Class)null, (java.lang.String)null, 0.0F); }


private static void __sourceConstructorBody_cae0af8b7ce06e29(moom.KH receiver) throws Throwable {

long local1 = (moom.KH.f ^ 95001101837879L);

    moom.KH.__sourceConstructorInit_cae0af8b7ce06e29_0(((moom.KH)(receiver)), ((java.lang.Object)(net.minecraft.entity.monster.EntityGuardian.class)), ((java.lang.String)(__sourceIntrinsic_cae0af8b7ce06e29_originalDynamicSite2286_2(31115, (3701173642708015443L ^ local1)))), ((float)(0x1.0p-1f)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_cae0af8b7ce06e29_0(moom.KH a0, java.lang.Object a1, java.lang.String a2, float a3) throws E;

static {
f = ((long)(((moom._a)(moom._c.a(((long)(5345695738769595216L)), ((long)(8226683552518291656L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(166475533646582L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.KH.f ^ 116540084379345L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill632_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill632_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill632_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill632_14 = new byte[8];
    (__sourceSpill632_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill632_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation632_16 = __sourceSpill632_14;
    ((javax.crypto.Cipher)(__sourceSpill632_11)).init(((int)(__sourceSpill632_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill632_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation632_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[22];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "ÅÞè}Ep'XYIDÌGÉ \030\030C\020kòJÂ©ÛÏsð^\036\rß_Ú]\024­Ò>i\020/é0¤)£ê!¢·»\021\020\037\fOq>\017õÝB\017\025\fCÞ\0200òfd-´rÁÅJG:E\020°ZÊaÄÇ&Ò¨\rò¡/â$\020¢;0ëSzÓw*Rrâ\020§IÚÝ\016B5xsêBõ\"ü¨È\0201¨V¤É÷MäÉ\000f8þþ\020\020wt¶Lû\027\001ßGó%nü\020f\024ö\005s¬ÚÐ÷¢©ã¦\013&\017\020 Ü\025få\004·Þ÷Þnxb\0207_á£=®r{¿û\003gï\020²\004Yä\1773rE×jQÍÑÐ\020¯¹ÝÇ©\031\001ê\031´\025ßiZ[\r\020F\013$\031í_ÆãËGç>\004c\000\020<F«¨D*m\037ï5nù³\024¯\020,ÎÙx{ªÉÅ÷Í9N¡È\020]ÌÔ\034xjS/\0221ÛÛÊß\0209ñõé^0>ÄJçPÝ\001"))).length();
    int local16_life24 = 16;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill632_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill632_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill632_29)).doFinal(((byte[])(__sourceSpill632_28)));
        java.lang.String __sourceSpill632_34 = ((java.lang.String)(moom.KH.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill632_35 = local20_life19;
        int __sourceSpill632_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill632_35)[__sourceSpill632_36] = __sourceSpill632_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "'fåf\035d|\021Zn>\007æ\000\030a¼ÁÏÇ3 ý²F9çDÀFÖM<¨"))).length();
    local16_life24 = 16;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill632_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill632_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill632_42)).doFinal(((byte[])(__sourceSpill632_41)));
        java.lang.String __sourceSpill632_47 = ((java.lang.String)(moom.KH.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill632_48 = local20_life19;
        int __sourceSpill632_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill632_48)[__sourceSpill632_49] = __sourceSpill632_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    h = ((java.lang.String[])(local20_life19));
    i = ((java.lang.String[])(new java.lang.String[22]));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill632_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill632_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill632_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill632_60 = new byte[8];
    (__sourceSpill632_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill632_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation632_62 = __sourceSpill632_60;
    ((javax.crypto.Cipher)(__sourceSpill632_57)).init(((int)(__sourceSpill632_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill632_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation632_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[12];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "aÇÉ´¼*[ÙÍóÖPLÿ\022ª«ÎOÄû \nÌES¤\0368$KÿM$Ëóðnð\036câêÇÒ/'*±\030B#´¡5¦yC\016µoÙ^%T©öD!§"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill632_71 = local4_life67;
        int __sourceSpill632_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill632_71)).substring(((int)(__sourceSpill632_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill632_76 = local6_life65;
        int __sourceSpill632_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill632_79 = new byte[8];
        (__sourceSpill632_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill632_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill632_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill632_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill632_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill632_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill632_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill632_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill632_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill632_80)).doFinal(((byte[])(__sourceSpill632_79)));
        (__sourceSpill632_76)[__sourceSpill632_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "BYÍOp.\024»q[ñª\rM"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill632_84 = local4_life67;
        int __sourceSpill632_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill632_84)).substring(((int)(__sourceSpill632_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill632_89 = local6_life65;
        int __sourceSpill632_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill632_92 = new byte[8];
        (__sourceSpill632_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill632_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill632_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill632_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill632_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill632_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill632_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill632_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill632_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill632_93)).doFinal(((byte[])(__sourceSpill632_92)));
        (__sourceSpill632_89)[__sourceSpill632_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    k = ((long[])(local6_life65));
    l = ((java.lang.Integer[])(new java.lang.Integer[12]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.KH.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5636_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/KH"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x25F;
        if (KH.l[n2] == null) {
            
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
                throw new RuntimeException("moom/KH", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            KH.l[n2] = n4;
        }
        return KH.l[n2];
}


public java.lang.String[] b__ArrayString() {
long local1_life1 = (moom.KH.f ^ 124964885058449L);
    java.lang.String[] __sourceSharedArray660_4 = new java.lang.String[__sourceIntrinsic_b33388dd40f1_originalDynamicSite660_2(12893, (2267132165872652302L ^ local1_life1))];
    __sourceSharedArray660_4[0] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_3(7192, (9134934179751381362L ^ local1_life1));
    __sourceSharedArray660_4[1] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_5(12551, (6687911518056014944L ^ local1_life1));
    __sourceSharedArray660_4[2] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_6(17367, (8408181964129277618L ^ local1_life1));
    __sourceSharedArray660_4[3] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_7(1555, (2758730750732653432L ^ local1_life1));
    __sourceSharedArray660_4[4] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_8(4479, (6807763861400896537L ^ local1_life1));
    __sourceSharedArray660_4[5] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_9(25068, (548478776056132751L ^ local1_life1));
    __sourceSharedArray660_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite660_10(1759, (2252643317992137870L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_11(7962, (4523406203646593650L ^ local1_life1));
    __sourceSharedArray660_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite660_12(13267, (7895764598852325766L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_13(15626, (1026848702107183205L ^ local1_life1));
    __sourceSharedArray660_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite660_14(2395, (4073721961855494927L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_15(14525, (4804442995411905988L ^ local1_life1));
    __sourceSharedArray660_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite660_16(30794, (6743076711472519709L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_17(2195, (5778888560578485746L ^ local1_life1));
    __sourceSharedArray660_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite660_18(20170, (2227637350085389466L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_19(22310, (5817028040509391453L ^ local1_life1));
    __sourceSharedArray660_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite660_20(13142, (3992424419056390413L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_21(21299, (3489909422256162399L ^ local1_life1));
    __sourceSharedArray660_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite660_22(8256, (4174419495139672600L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_23(2858, (8224478086840671818L ^ local1_life1));
    __sourceSharedArray660_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite660_24(14036, (1771028594848699526L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_25(12304, (5110619236112786804L ^ local1_life1));
    __sourceSharedArray660_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite660_26(15507, (353952466215608009L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_27(16633, (6380805995682174342L ^ local1_life1));
    __sourceSharedArray660_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite660_28(30786, (2183681845468551707L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_29(14818, (1031831696163466380L ^ local1_life1));
    __sourceSharedArray660_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite660_30(22490, (150483153892439436L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_31(4881, (5666102331340867187L ^ local1_life1));
    return __sourceSharedArray660_4;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5637_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/KH"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public moom.jD a(moom.iQ p0, java.lang.String p1) {
moom.iQ forwardValue2472_12_0;
    int forwardValue2472_40_0;
    java.lang.String forwardValue2472_49_0;
    int forwardValue2472_78_0;
    moom.jD forwardValue2472_86_0;
    java.lang.String forwardValue2472_92_0;
    int forwardValue2472_119_0;
    moom.jD forwardValue2472_127_0;
    moom.iQ spill2472_0;
    boolean spill2472_1;
    java.lang.String spill2472_2;
    java.lang.String spill2472_3;
    int spill2472_4;
    int spill2472_5;
    long life3_3;
    int[] life5_5;
    moom.jb life6_19;
    java.lang.String life7_67;
    moom.jD[] life8_79;
    java.lang.String life9_90;
    int life10_94;
    java.lang.String life8_120;
    moom.jD[] life9_127;
    java.lang.String life10_138;
    int life11_142;
    forward_join_128: {
    forward_join_127: {
    forward_join_126: {
    forward_join_119: {
    forward_join_104: {
    forward_join_92: {
    forward_join_87: {
    forward_join_86: {
    forward_join_85: {
    forward_join_78: {
    forward_join_63: {
    forward_join_49: {
    forward_join_44: {
    forward_join_40: {
    forward_join_31: {
    forward_join_18: {
    forward_join_16: {
    forward_join_12: {
    life3_3 = (moom.KH.f ^ 129484995376073L);
    life5_5 = moom.Km.b();
    spill2472_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue2472_12_0 = spill2472_0;
        break forward_join_12;
    }
    if (!((((spill2472_0 instanceof moom.jb) ? 1 : 0) != 0))) {
        break forward_join_16;
    }
    forwardValue2472_12_0 = p0;
    }
    life6_19 = ((moom.jb)(forwardValue2472_12_0));
    if (!((life5_5 == null))) {
        break forward_join_18;
    }
    }
    return null;
    }
    spill2472_1 = ((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2472_4(5544, (6833608258420088968L ^ life3_3)))));
    if (!((life5_5 != null))) {
        forwardValue2472_40_0 = ((spill2472_1) ? 1 : 0);
        break forward_join_40;
    }
    if (!(spill2472_1)) {
        break forward_join_31;
    }
    return ((moom.jb)(life6_19)).i;
    }
    spill2472_2 = p1;
    if (!((life5_5 != null))) {
        forwardValue2472_49_0 = spill2472_2;
        break forward_join_49;
    }
    forwardValue2472_40_0 = ((((java.lang.String)(spill2472_2)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2472_8(6871, (3075743311678484469L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((forwardValue2472_40_0 != 0))) {
        break forward_join_44;
    }
    return ((moom.jb)(life6_19)).j;
    }
    forwardValue2472_49_0 = __sourceIntrinsic_38607ace6cb3_invokedynamic2472_12(5044, (7589723720461821569L ^ life3_3));
    }
    life7_67 = forwardValue2472_49_0;
    spill2472_3 = p1;
    if (!((life5_5 != null))) {
        forwardValue2472_92_0 = spill2472_3;
        break forward_join_92;
    }
    if (!(((java.lang.String)(spill2472_3)).startsWith(((java.lang.String)(life7_67))))) {
        break forward_join_87;
    }
    life8_79 = ((moom.jb)(life6_19)).k;
    if (!((life8_79 == null))) {
        break forward_join_63;
    }
    return null;
    }
    life9_90 = ((java.lang.String)(p1)).substring(((int)(((java.lang.String)(life7_67)).length())));
    life10_94 = moom.BU.a(((java.lang.String)(life9_90)), ((int)(-1)));
    life10_94 += -1;
    spill2472_4 = life10_94;
    if (!((life5_5 != null))) {
        forwardValue2472_78_0 = spill2472_4;
        break forward_join_78;
    }
    if (!((spill2472_4 >= 0))) {
        break forward_join_85;
    }
    forwardValue2472_78_0 = life10_94;
    }
    if (!((forwardValue2472_78_0 < (life8_79).length))) {
        break forward_join_85;
    }
    forwardValue2472_86_0 = (life8_79)[life10_94];
    break forward_join_86;
    }
    forwardValue2472_86_0 = null;
    }
    return forwardValue2472_86_0;
    }
    forwardValue2472_92_0 = __sourceIntrinsic_38607ace6cb3_invokedynamic2472_18(4398, (850237263388812319L ^ life3_3));
    }
    life8_120 = forwardValue2472_92_0;
    if (!(((java.lang.String)(p1)).startsWith(((java.lang.String)(life8_120))))) {
        break forward_join_128;
    }
    life9_127 = ((moom.jb)(life6_19)).l;
    if (!((life9_127 == null))) {
        break forward_join_104;
    }
    return null;
    }
    life10_138 = ((java.lang.String)(p1)).substring(((int)(((java.lang.String)(life8_120)).length())));
    life11_142 = moom.BU.a(((java.lang.String)(life10_138)), ((int)(-1)));
    life11_142 += -1;
    spill2472_5 = life11_142;
    if (!((life5_5 != null))) {
        forwardValue2472_119_0 = spill2472_5;
        break forward_join_119;
    }
    if (!((spill2472_5 >= 0))) {
        break forward_join_126;
    }
    forwardValue2472_119_0 = life11_142;
    }
    if (!((forwardValue2472_119_0 < (life9_127).length))) {
        break forward_join_126;
    }
    forwardValue2472_127_0 = (life9_127)[life11_142];
    break forward_join_127;
    }
    forwardValue2472_127_0 = null;
    }
    return forwardValue2472_127_0;
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
        byte[] spill2876_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2876_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2876_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2876_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2876_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2876_2)[life4_9];
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
return new moom.jb();
}


public moom.Kl a(moom.iQ p0, float p1) {
net.minecraft.client.renderer.entity.RenderManager local3 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__nw();
    net.minecraft.client.renderer.entity.RenderGuardian local4 = new net.minecraft.client.renderer.entity.RenderGuardian(local3);
    ((net.minecraft.client.renderer.entity.RenderGuardian)(local4)).m = ((moom.iQ)(p0));
    ((net.minecraft.client.renderer.entity.RenderGuardian)(local4)).c = ((float)(p1));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 30052);
    if (((moom.KH.i)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.KH.j)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.KH.j)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/KH", life9_51);
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
        life9_116 = ((java.lang.String)((moom.KH.h)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.KH.i)[life5_8] = __sourceExactCall_291169961cb457(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.KH.i)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = __sourceExactCall_8500ae069b22e7(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cae0af8b7ce06e29_originalDynamicSite2286_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5636_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_26(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_28(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_30(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite660_31(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5637_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2472_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2472_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2472_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2472_18(int a0, long a1) throws E;

private static native java.lang.String __sourceExactCall_291169961cb457(byte[] p0);
private static native java.lang.String __sourceExactCall_8500ae069b22e7(int p0, long p1);
}
