package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class KR extends moom.Km {

private static java.util.Map<java.lang.String, java.lang.Integer> f;

private static long h;

private static java.lang.String[] i;

private static java.lang.String[] j;

private static java.util.Map k;

private static long[] l;

private static java.lang.Integer[] m;

private static java.util.Map n;

public KR() { super((java.lang.Class)null, (java.lang.String)null, 0.0F); }

private static void __sourceConstructorBody_c4b36d05600aaebf(moom.KR receiver) throws Throwable {
long local1 = (moom.KR.h ^ 106387364306501L);
    moom.KR.__sourceConstructorInit_c4b36d05600aaebf_0(((moom.KR)(receiver)), ((java.lang.Object)(net.minecraft.entity.passive.EntityOcelot.class)), ((java.lang.String)(__sourceIntrinsic_c4b36d05600aaebf_originalDynamicSite2306_2(25435, (3356105097709527550L ^ local1)))), ((float)(0x1.99999ap-2f)));
    return;
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(4008989564352094466L)), ((long)(2293443021868378472L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(261608507447923L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.KR.h ^ 61381998150155L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill641_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill641_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill641_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill641_14 = new byte[8];
    (__sourceSpill641_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill641_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation641_16 = __sourceSpill641_14;
    ((javax.crypto.Cipher)(__sourceSpill641_11)).init(((int)(__sourceSpill641_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill641_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation641_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[17];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "\020>ÇË\016wè·¿úê÷²>\027 ¬¹äÁi>ÍU\032 É«²m¹ÐEö½®ªiblCÈ\0176Ý6©Uì\034q'ö\nÎ\020Ý^ýwuSóáF\"4ÄeU\020Huov\020ÄW&¤¶Î\020L,ÏRî4}%õ(lÒ¸Ö\026 £w|¤)~R¥© jbW3¥ª§Gz»Á\b?\ftªÍ\020/3û\025#Håâ \t:pBk\020kÔYê$\013±Ú¶\r°­tUµh\020Ø\0048ÊnDIzâ\036MÓ&Ñ\030æ°\031\007b\0321¨ãHÍÛ¹½ÂvY`Ûça®  \001{·Ôä¢jÄNaè;>ß\004[¾ ¦¢\033:ì\022¶\030´UUáÜòUúÅñïÐøÆBq\017zføµ$\032Ñ\030vô«\024ÙäýÞÉ°mÀ=ºë\022\003JcÁ\020vj5)\0076òÛ¨ÕåþI<:\002\020\007Ûk/Î²cºÞNt\005K×q"))).length();
    int local16_life24 = 32;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill641_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill641_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill641_29)).doFinal(((byte[])(__sourceSpill641_28)));
        java.lang.String __sourceSpill641_34 = ((java.lang.String)(moom.KR.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill641_35 = local20_life19;
        int __sourceSpill641_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill641_35)[__sourceSpill641_36] = __sourceSpill641_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "<+îî¬ÝÜÅçê\016<åå= sm\004'b\tàreÅ¡ßÀ|¸ýÚw^3Qowh\030Ê\"%"))).length();
    local16_life24 = 16;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill641_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill641_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill641_42)).doFinal(((byte[])(__sourceSpill641_41)));
        java.lang.String __sourceSpill641_47 = ((java.lang.String)(moom.KR.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill641_48 = local20_life19;
        int __sourceSpill641_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill641_48)[__sourceSpill641_49] = __sourceSpill641_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    i = ((java.lang.String[])(local20_life19));
    j = ((java.lang.String[])(new java.lang.String[17]));
    n = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill641_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill641_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill641_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill641_60 = new byte[8];
    (__sourceSpill641_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill641_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation641_62 = __sourceSpill641_60;
    ((javax.crypto.Cipher)(__sourceSpill641_57)).init(((int)(__sourceSpill641_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill641_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation641_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[5];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = ";×>\021F}Âzx\"+lI\005ÌBLåf¹NÐ\035"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill641_71 = local4_life67;
        int __sourceSpill641_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill641_71)).substring(((int)(__sourceSpill641_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill641_76 = local6_life65;
        int __sourceSpill641_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill641_79 = new byte[8];
        (__sourceSpill641_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill641_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill641_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill641_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill641_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill641_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill641_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill641_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill641_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill641_80)).doFinal(((byte[])(__sourceSpill641_79)));
        (__sourceSpill641_76)[__sourceSpill641_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "Ö\024½iÍÞ\021kï1ÎFÄ¨"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill641_84 = local4_life67;
        int __sourceSpill641_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill641_84)).substring(((int)(__sourceSpill641_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill641_89 = local6_life65;
        int __sourceSpill641_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill641_92 = new byte[8];
        (__sourceSpill641_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill641_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill641_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill641_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill641_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill641_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill641_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill641_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill641_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill641_93)).doFinal(((byte[])(__sourceSpill641_92)));
        (__sourceSpill641_89)[__sourceSpill641_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    l = ((long[])(local6_life65));
    m = ((java.lang.Integer[])(new java.lang.Integer[5]));
    f = ((java.util.Map)(null));
}

private static native <E extends Throwable> void __sourceConstructorInit_c4b36d05600aaebf_0(moom.KR a0, java.lang.Object a1, java.lang.String a2, float a3) throws E;
private static native <E extends Throwable> java.util.Map __sourceHandlerCall_d20540da82039abc0a81() throws E;
private static final class __SourceHandler_d20540da82039abc0a81 {

public static java.util.Map f787() throws Throwable {
    java.util.Map forwardValue787_103_0;
    java.util.Map spill787_0;
    long life0_3;
    int[] life2_5;
    forward_join_103: {
    forward_join_102: {
    life0_3 = (__fieldRead787_0() ^ 92418353252422L);
    life2_5 = __call787_1();
    spill787_0 = __fieldRead787_2();
    if (!((life2_5 != null))) {
        forwardValue787_103_0 = spill787_0;
        break forward_join_103;
    }
    if (!((spill787_0 == null))) {
        break forward_join_102;
    }
    __fieldWrite787_3(new java.util.HashMap());
    __call787_7(__fieldRead787_4(), __invokedynamic787_5(9525, (642783426275504535L ^ life0_3)), __call787_6(0));
    __call787_11(__fieldRead787_8(), __invokedynamic787_9(23239, (2757601968982724206L ^ life0_3)), __call787_10(1));
    __call787_15(__fieldRead787_12(), __invokedynamic787_13(9734, (1752421628776510122L ^ life0_3)), __call787_14(2));
    __call787_19(__fieldRead787_16(), __invokedynamic787_17(16002, (4404354879125580330L ^ life0_3)), __call787_18(3));
    __call787_23(__fieldRead787_20(), __invokedynamic787_21(32035, (561463027097479554L ^ life0_3)), __call787_22(4));
    __call787_27(__fieldRead787_24(), __invokedynamic787_25(10366, (3786112757294496985L ^ life0_3)), __call787_26(5));
    __call787_32(__fieldRead787_28(), __invokedynamic787_29(15201, (598095727891869644L ^ life0_3)), __call787_31(__invokedynamic787_30(25099, (254207095936203827L ^ life0_3))));
    __call787_37(__fieldRead787_33(), __invokedynamic787_34(7013, (8420520739870724046L ^ life0_3)), __call787_36(__invokedynamic787_35(7295, (4300082180762649153L ^ life0_3))));
    }
    forwardValue787_103_0 = __fieldRead787_38();
    }
    return forwardValue787_103_0;
}
public static void h787_0(moom.Oo p0) throws Throwable {
    throw __call1078700_0(p0);
}
public static void h787_1(moom.Oo p0) throws Throwable {
    throw __call1078701_0(p0);
}
private static native long __fieldRead787_0() throws Throwable;
private static native int[] __call787_1() throws Throwable;
private static native java.util.Map __fieldRead787_2() throws Throwable;
private static native void __fieldWrite787_3(java.util.HashMap a0) throws Throwable;
private static native java.util.Map __fieldRead787_4() throws Throwable;
private static native java.lang.String __invokedynamic787_5(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call787_6(int a0) throws Throwable;
private static native java.lang.Object __call787_7(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.util.Map __fieldRead787_8() throws Throwable;
private static native java.lang.String __invokedynamic787_9(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call787_10(int a0) throws Throwable;
private static native java.lang.Object __call787_11(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.util.Map __fieldRead787_12() throws Throwable;
private static native java.lang.String __invokedynamic787_13(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call787_14(int a0) throws Throwable;
private static native java.lang.Object __call787_15(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.util.Map __fieldRead787_16() throws Throwable;
private static native java.lang.String __invokedynamic787_17(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call787_18(int a0) throws Throwable;
private static native java.lang.Object __call787_19(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.util.Map __fieldRead787_20() throws Throwable;
private static native java.lang.String __invokedynamic787_21(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call787_22(int a0) throws Throwable;
private static native java.lang.Object __call787_23(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.util.Map __fieldRead787_24() throws Throwable;
private static native java.lang.String __invokedynamic787_25(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call787_26(int a0) throws Throwable;
private static native java.lang.Object __call787_27(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.util.Map __fieldRead787_28() throws Throwable;
private static native java.lang.String __invokedynamic787_29(int a0, long a1) throws Throwable;
private static native int __invokedynamic787_30(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call787_31(int a0) throws Throwable;
private static native java.lang.Object __call787_32(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.util.Map __fieldRead787_33() throws Throwable;
private static native java.lang.String __invokedynamic787_34(int a0, long a1) throws Throwable;
private static native int __invokedynamic787_35(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call787_36(int a0) throws Throwable;
private static native java.lang.Object __call787_37(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.util.Map __fieldRead787_38() throws Throwable;
private static native java.lang.Exception __call1078700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1078701_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.jD __sourceHandlerCall_2b71d55b67dacef70766(moom.KR a0, moom.iQ a1, java.lang.String a2) throws E;
private static final class __SourceHandler_2b71d55b67dacef70766 {

public static moom.jD f311(moom.KR receiver, moom.iQ p0, java.lang.String p1) throws Throwable {
    moom.iQ forwardValue311_12_0;
    int forwardValue311_31_0;
    moom.iQ spill311_0;
    boolean spill311_1;
    long life3_3;
    int[] life5_5;
    net.minecraft.client.model.ModelOcelot life6_19;
    java.util.Map life7_27;
    int life8_45;
    java.lang.Object[] life9_52;
    forward_join_47: {
    forward_join_31: {
    forward_join_18: {
    forward_join_16: {
    forward_join_12: {
    life3_3 = (__fieldRead311_0() ^ 85203840721728L);
    life5_5 = __call311_1();
    spill311_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue311_12_0 = spill311_0;
        break forward_join_12;
    }
    if (!((__instanceOf311_2(spill311_0) != 0))) {
        break forward_join_16;
    }
    forwardValue311_12_0 = p0;
    }
    life6_19 = __cast311_3(forwardValue311_12_0);
    if (!((life5_5 == null))) {
        break forward_join_18;
    }
    }
    return null;
    }
    life7_27 = __call311_4();
    spill311_1 = __call311_5(life7_27, p1);
    if (!((life5_5 != null))) {
        forwardValue311_31_0 = __integerCategory311_6(spill311_1);
        break forward_join_31;
    }
    if (!(spill311_1)) {
        break forward_join_47;
    }
    forwardValue311_31_0 = __call311_9(__cast311_8(__call311_7(life7_27, p1)));
    }
    life8_45 = forwardValue311_31_0;
    life9_52 = __call311_15(__call311_14(__call311_12(__call311_11(__classLiteral311_10())), __invokedynamic311_13()));
    return __cast311_18(__call311_17(__cast311_16((life9_52)[life8_45]), life6_19));
    }
    return null;
}
public static moom.jD h311_0(java.lang.IllegalAccessException p0) throws Throwable {
    throw __call2031100_0(p0);
}
public static moom.jD h311_1(java.lang.IllegalAccessException p0) throws Throwable {
    throw __call2031101_0(p0);
}
public static moom.jD h311_2(java.lang.IllegalAccessException p0) throws Throwable {
    throw __call2031102_0(p0);
}
public static moom.jD h311_3(java.lang.IllegalAccessException p0) throws Throwable {
    throw __call2031103_0(p0);
}
public static moom.jD h311_4(java.lang.IllegalAccessException p0) throws Throwable {
    throw __call2031104_0(p0);
}
public static moom.jD h311_5(java.lang.IllegalAccessException p0) throws Throwable {
    java.lang.IllegalAccessException local1 = p0;
    return null;
}
private static native long __fieldRead311_0() throws Throwable;
private static native int[] __call311_1() throws Throwable;
private static native int __instanceOf311_2(moom.iQ a0) throws Throwable;
private static native net.minecraft.client.model.ModelOcelot __cast311_3(moom.iQ a0) throws Throwable;
private static native java.util.Map __call311_4() throws Throwable;
private static native boolean __call311_5(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory311_6(boolean value) throws Throwable;
private static native java.lang.Object __call311_7(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.Integer __cast311_8(java.lang.Object a0) throws Throwable;
private static native int __call311_9(java.lang.Integer a0) throws Throwable;
private static native java.lang.Object __classLiteral311_10() throws Throwable;
private static native java.lang.reflect.Field[] __call311_11(java.lang.Object a0) throws Throwable;
private static native java.util.stream.Stream __call311_12(java.lang.reflect.Field[] a0) throws Throwable;
private static native java.util.function.Predicate __invokedynamic311_13() throws Throwable;
private static native java.util.stream.Stream __call311_14(java.util.stream.Stream a0, java.util.function.Predicate a1) throws Throwable;
private static native java.lang.Object[] __call311_15(java.util.stream.Stream a0) throws Throwable;
private static native java.lang.reflect.Field __cast311_16(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call311_17(java.lang.reflect.Field a0, net.minecraft.client.model.ModelOcelot a1) throws Throwable;
private static native moom.jD __cast311_18(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call2031100_0(java.lang.IllegalAccessException a0) throws Throwable;
private static native java.lang.Exception __call2031101_0(java.lang.IllegalAccessException a0) throws Throwable;
private static native java.lang.Exception __call2031102_0(java.lang.IllegalAccessException a0) throws Throwable;
private static native java.lang.Exception __call2031103_0(java.lang.IllegalAccessException a0) throws Throwable;
private static native java.lang.Exception __call2031104_0(java.lang.IllegalAccessException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_96a71bc765070aa03aaa(java.lang.reflect.Field a0) throws E;
private static final class __SourceHandler_96a71bc765070aa03aaa {

public static boolean f1366(java.lang.reflect.Field p0) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead1366_0() ^ 98285182308758L);
    return ((__call1366_1(p0) == __classLiteral1366_2()) ? true : false);
}
public static void h1366_0(moom.Oo p0) throws Throwable {
    throw __call1136600_0(p0);
}
private static native long __fieldRead1366_0() throws Throwable;
private static native java.lang.Class __call1366_1(java.lang.reflect.Field a0) throws Throwable;
private static native java.lang.Object __classLiteral1366_2() throws Throwable;
private static native java.lang.Exception __call1136600_0(moom.Oo a0) throws Throwable;

}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.KR.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5679_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/KR"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x356D;
        if (m[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = KR.l[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])KR.n.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    KR.n.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/KR", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            KR.m[n2] = n4;
        }
        return m[n2];
}


public java.lang.String[] b__ArrayString() {
long local1_life1 = (moom.KR.h ^ 80391656080152L);
    java.lang.String[] __sourceSharedArray664_4 = new java.lang.String[__sourceIntrinsic_b33388dd40f1_originalDynamicSite664_2(32005, (7281339516310546535L ^ local1_life1))];
    __sourceSharedArray664_4[0] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite664_3(25307, (5898023220391476517L ^ local1_life1));
    __sourceSharedArray664_4[1] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite664_5(23045, (1289728233309914594L ^ local1_life1));
    __sourceSharedArray664_4[2] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite664_6(31288, (7748587655699817923L ^ local1_life1));
    __sourceSharedArray664_4[3] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite664_7(21831, (2425963645090974394L ^ local1_life1));
    __sourceSharedArray664_4[4] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite664_8(16489, (2610777126317088665L ^ local1_life1));
    __sourceSharedArray664_4[5] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite664_9(18674, (6308160364238558984L ^ local1_life1));
    __sourceSharedArray664_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite664_10(22652, (1875061070611729695L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite664_11(16175, (2914381962631651547L ^ local1_life1));
    __sourceSharedArray664_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite664_12(13716, (3497534530187239669L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite664_13(2592, (2460381669543712209L ^ local1_life1));
    return __sourceSharedArray664_4;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5680_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/KR"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.KR.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public moom.jD a(moom.iQ p0, java.lang.String p1) { return __sourceHandlerCall_2b71d55b67dacef70766(this, p0, p1); }


public moom.iQ a__iQ() {
return new net.minecraft.client.model.ModelOcelot();
}


public moom.Kl a(moom.iQ p0, float p1) {
net.minecraft.client.renderer.entity.RenderManager local3 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__nw();
    return new net.minecraft.client.renderer.entity.RenderOcelot(local3, p0, p1);
}


private static java.util.Map<java.lang.String, java.lang.Integer> a__sourceReturn_43b9f1ea53() { return __sourceHandlerCall_d20540da82039abc0a81(); }


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
        byte[] spill2894_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2894_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2894_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2894_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2894_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2894_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 16376);
    if (((moom.KR.j)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.KR.k)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.KR.k)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/KR", life9_51);
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
        life9_116 = ((java.lang.String)((moom.KR.i)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.KR.j)[life5_8] = moom.KR.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.KR.j)[life5_8];
}


private static boolean lambda$getModelRenderer$0(java.lang.reflect.Field p0) { return __sourceHandlerCall_96a71bc765070aa03aaa(p0); }


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c4b36d05600aaebf_originalDynamicSite2306_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5680_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5679_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite664_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite664_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite664_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite664_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite664_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite664_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite664_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite664_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite664_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite664_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite664_13(int a0, long a1) throws E;
}
