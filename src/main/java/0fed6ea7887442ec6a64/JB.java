package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class JB {

private java.lang.String a;

private moom.DD[] b;

private int c;

private int d;

private int e;

private int f;

private int g;

private int h;

private int i;

private int j;

private static long k;

private static java.lang.String[] l;

private static java.lang.String[] m;

private static java.util.Map n;

private static long[] o;

private static java.lang.Integer[] p;

private static java.util.Map q;

public JB(java.lang.String p0, java.util.Properties p1) { super(); __sourceHandlerCall_ccd726d58ddf4dfd60ef(this, p0, p1); }


static {
k = ((long)(((moom._a)(moom._c.a(((long)(-101504965734705176L)), ((long)(-1665160942908045039L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(250689641362331L)))));
    n = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.JB.k ^ 58660648108053L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill590_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill590_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill590_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill590_14 = new byte[8];
    (__sourceSpill590_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill590_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation590_16 = __sourceSpill590_14;
    ((javax.crypto.Cipher)(__sourceSpill590_11)).init(((int)(__sourceSpill590_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill590_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation590_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[14];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "á>=mVñX¸Ñ#óUèû°7Ìoû g£äV\0050WDÐ=\037\021\006B§¹¿ÔD%nK&Æa\030·+k;\"*73µýÓ}'vGÛýówù\bÔ® Öøþ²Û+&\000äd\033Æ+Ó£[(ô²Nêü7BÁuùd\001G c}rCl;ñ\034¢\\{ûÇb\024!+p~Ò\n¦\035à\007\\ÇáN\020?Þ·\036\bÅ\006ãæ¾.ùOø\020\021eª;'@ì\007óÕ,\nD ßë\025Zo'lG02ÿ¾¸\032#ù]\0307©ûa_ó ÃÃi¾\020gúÚw\021W\005Î\025ÊTÙzá <E\034:\tÀmö8«öyTº\022\035ã\007ª\rjôò&xê\020<W\026ÝbqÇb^¯þ¸\n`\020X6]aoÁvBC\023Ú\fsÃj"))).length();
    int local16_life24 = 24;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill590_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill590_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill590_29)).doFinal(((byte[])(__sourceSpill590_28)));
        java.lang.String __sourceSpill590_34 = ((java.lang.String)(moom.JB.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill590_35 = local20_life19;
        int __sourceSpill590_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill590_35)[__sourceSpill590_36] = __sourceSpill590_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "ò­ò\016u!X\001¹\037\035\013\021Øq2\bv8\b­FÛ`\037Ja ããU\036\nM1¶\003'X=.f¾\034Ã/ùàà:&`ÝxG$"))).length();
    local16_life24 = 32;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill590_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill590_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill590_42)).doFinal(((byte[])(__sourceSpill590_41)));
        java.lang.String __sourceSpill590_47 = ((java.lang.String)(moom.JB.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill590_48 = local20_life19;
        int __sourceSpill590_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill590_48)[__sourceSpill590_49] = __sourceSpill590_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    l = ((java.lang.String[])(local20_life19));
    m = ((java.lang.String[])(new java.lang.String[14]));
    q = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill590_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill590_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill590_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill590_60 = new byte[8];
    (__sourceSpill590_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill590_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation590_62 = __sourceSpill590_60;
    ((javax.crypto.Cipher)(__sourceSpill590_57)).init(((int)(__sourceSpill590_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill590_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation590_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[11];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "½=Ãþ¦¸aHR8ßkìÇê\005¶²73óhø¶@g8ÿK6N[\f®n´Ï¿z3·ÊÁ\030)ø·n\0077Ì9T\000A\n\0130g\025È\026#Î"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill590_71 = local4_life67;
        int __sourceSpill590_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill590_71)).substring(((int)(__sourceSpill590_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill590_76 = local6_life65;
        int __sourceSpill590_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill590_79 = new byte[8];
        (__sourceSpill590_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill590_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill590_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill590_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill590_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill590_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill590_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill590_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill590_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill590_80)).doFinal(((byte[])(__sourceSpill590_79)));
        (__sourceSpill590_76)[__sourceSpill590_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "\031\nÏ`0\036Ú­\0334t³"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill590_84 = local4_life67;
        int __sourceSpill590_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill590_84)).substring(((int)(__sourceSpill590_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill590_89 = local6_life65;
        int __sourceSpill590_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill590_92 = new byte[8];
        (__sourceSpill590_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill590_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill590_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill590_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill590_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill590_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill590_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill590_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill590_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill590_93)).doFinal(((byte[])(__sourceSpill590_92)));
        (__sourceSpill590_89)[__sourceSpill590_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    o = ((long[])(local6_life65));
    p = ((java.lang.Integer[])(new java.lang.Integer[11]));
}

private static native <E extends Throwable> void __sourceHandlerCall_ccd726d58ddf4dfd60ef(moom.JB a0, java.lang.String a1, java.util.Properties a2) throws E;
private static final class __SourceHandler_ccd726d58ddf4dfd60ef {

public static void f200022(moom.JB receiver, java.lang.String p0, java.util.Properties p1) throws Throwable {
    net.minecraft.entity.Entity[] spill200022_0;
    long life3_3;
    net.minecraft.entity.Entity[] life5_55;
    moom.J3 life6_64;
    int life7_77;
    lexical_join_217: {
    lexical_join_109: {
    life3_3 = (__fieldRead200022_0() ^ 88238111070417L);
    spill200022_0 = __call200022_1();
    __directSuperInit200022_2(receiver);
    __fieldWrite200022_3(receiver, 1);
    __fieldWrite200022_5(receiver, __invokedynamic200022_4(30998, (8216924067479890611L ^ life3_3)));
    __fieldWrite200022_7(receiver, __invokedynamic200022_6(20545, (6346516477053305836L ^ life3_3)));
    __fieldWrite200022_9(receiver, __invokedynamic200022_8(16562, (3661409620917981969L ^ life3_3)));
    __fieldWrite200022_11(receiver, __invokedynamic200022_10(7707, (4186075344603762106L ^ life3_3)));
    __fieldWrite200022_13(receiver, __invokedynamic200022_12(22879, (5815977776790637299L ^ life3_3)));
    __fieldWrite200022_14(receiver, 0);
    __fieldWrite200022_16(receiver, __invokedynamic200022_15(3348, (5432471442744172210L ^ life3_3)));
    life5_55 = spill200022_0;
    life6_64 = new moom.J3(__invokedynamic200022_17(9608, (4014691764992449641L ^ life3_3)));
    __fieldWrite200022_18(receiver, p0);
    __fieldWrite200022_20(receiver, new moom.DD[__invokedynamic200022_19(13761, (1775548432731792995L ^ life3_3))]);
    life7_77 = 0;
    lexical_cycle_78: while (true) {
    if (!((life7_77 < (__fieldRead200022_21(receiver)).length))) {
        break lexical_join_109;
    }
    java.lang.Object __inlineStack200022_24Token;
    (__fieldRead200022_22(receiver))[life7_77] = new moom.DD(__invokedynamic200022_26(p0, __inlineStack200022_24Output0((__inlineStack200022_24Token = __inlineStack200022_24Pack(life7_77, __invokedynamic200022_23(1711, (3758530167473192780L ^ life3_3))))), __inlineStack200022_24Output1(__inlineStack200022_24Token), __invokedynamic200022_25(3063, (574475122930725394L ^ life3_3))));
    life7_77 += 1;
    if (!((life5_55 != null))) {
        break lexical_join_217;
    }
    if (!((life5_55 == null))) { continue lexical_cycle_78; }
    break lexical_cycle_78;
    }
    }
    __fieldWrite200022_30(receiver, __call200022_29(life6_64, __call200022_28(p1, __invokedynamic200022_27(16482, (5769220774451771780L ^ life3_3))), 1));
    __fieldWrite200022_35(receiver, __call200022_34(life6_64, __call200022_32(p1, __invokedynamic200022_31(89, (2417103464393193905L ^ life3_3))), __invokedynamic200022_33(15308, (7744073832409688162L ^ life3_3))));
    __fieldWrite200022_39(receiver, __call200022_38(life6_64, __call200022_37(p1, __invokedynamic200022_36(8386, (5824340205708548393L ^ life3_3))), 3));
    __fieldWrite200022_43(receiver, __call200022_42(life6_64, __call200022_41(p1, __invokedynamic200022_40(9181, (5097865680690715188L ^ life3_3))), 3));
    __fieldWrite200022_48(receiver, __call200022_47(__call200022_45(p1, __invokedynamic200022_44(16774, (1706775602153486434L ^ life3_3))), __invokedynamic200022_46(6768, (2509001450146056660L ^ life3_3))));
    __fieldWrite200022_53(receiver, __call200022_52(__call200022_50(p1, __invokedynamic200022_49(29590, (3229753601894369908L ^ life3_3))), __invokedynamic200022_51(12793, (7602930743570358873L ^ life3_3))));
    __fieldWrite200022_57(receiver, __call200022_56(__call200022_55(p1, __invokedynamic200022_54(4756, (6250368577902914430L ^ life3_3))), 0));
    __fieldWrite200022_62(receiver, __call200022_61(__call200022_59(p1, __invokedynamic200022_58(15165, (8056784771542811357L ^ life3_3))), __invokedynamic200022_60(9427, (8854505130308728692L ^ life3_3))));
    }
    return;
}
private static native long __fieldRead200022_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call200022_1() throws Throwable;
private static native void __directSuperInit200022_2(moom.JB a0) throws Throwable;
private static native void __fieldWrite200022_3(moom.JB a0, int a1) throws Throwable;
private static native int __invokedynamic200022_4(int a0, long a1) throws Throwable;
private static native void __fieldWrite200022_5(moom.JB a0, int a1) throws Throwable;
private static native int __invokedynamic200022_6(int a0, long a1) throws Throwable;
private static native void __fieldWrite200022_7(moom.JB a0, int a1) throws Throwable;
private static native int __invokedynamic200022_8(int a0, long a1) throws Throwable;
private static native void __fieldWrite200022_9(moom.JB a0, int a1) throws Throwable;
private static native int __invokedynamic200022_10(int a0, long a1) throws Throwable;
private static native void __fieldWrite200022_11(moom.JB a0, int a1) throws Throwable;
private static native int __invokedynamic200022_12(int a0, long a1) throws Throwable;
private static native void __fieldWrite200022_13(moom.JB a0, int a1) throws Throwable;
private static native void __fieldWrite200022_14(moom.JB a0, int a1) throws Throwable;
private static native int __invokedynamic200022_15(int a0, long a1) throws Throwable;
private static native void __fieldWrite200022_16(moom.JB a0, int a1) throws Throwable;
private static native java.lang.String __invokedynamic200022_17(int a0, long a1) throws Throwable;
private static native void __fieldWrite200022_18(moom.JB a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic200022_19(int a0, long a1) throws Throwable;
private static native void __fieldWrite200022_20(moom.JB a0, moom.DD[] a1) throws Throwable;
private static native moom.DD[] __fieldRead200022_21(moom.JB a0) throws Throwable;
private static native moom.DD[] __fieldRead200022_22(moom.JB a0) throws Throwable;
private static native java.lang.String __invokedynamic200022_23(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack200022_24Pack(int a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack200022_24Output0(java.lang.Object token) throws Throwable;
private static native int __inlineStack200022_24Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic200022_25(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic200022_26(java.lang.String a0, java.lang.String a1, int a2, java.lang.String a3) throws Throwable;
private static native java.lang.String __invokedynamic200022_27(int a0, long a1) throws Throwable;
private static native java.lang.String __call200022_28(java.util.Properties a0, java.lang.String a1) throws Throwable;
private static native int __call200022_29(moom.J3 a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite200022_30(moom.JB a0, int a1) throws Throwable;
private static native java.lang.String __invokedynamic200022_31(int a0, long a1) throws Throwable;
private static native java.lang.String __call200022_32(java.util.Properties a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic200022_33(int a0, long a1) throws Throwable;
private static native int __call200022_34(moom.J3 a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite200022_35(moom.JB a0, int a1) throws Throwable;
private static native java.lang.String __invokedynamic200022_36(int a0, long a1) throws Throwable;
private static native java.lang.String __call200022_37(java.util.Properties a0, java.lang.String a1) throws Throwable;
private static native int __call200022_38(moom.J3 a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite200022_39(moom.JB a0, int a1) throws Throwable;
private static native java.lang.String __invokedynamic200022_40(int a0, long a1) throws Throwable;
private static native java.lang.String __call200022_41(java.util.Properties a0, java.lang.String a1) throws Throwable;
private static native int __call200022_42(moom.J3 a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite200022_43(moom.JB a0, int a1) throws Throwable;
private static native java.lang.String __invokedynamic200022_44(int a0, long a1) throws Throwable;
private static native java.lang.String __call200022_45(java.util.Properties a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic200022_46(int a0, long a1) throws Throwable;
private static native int __call200022_47(java.lang.String a0, int a1) throws Throwable;
private static native void __fieldWrite200022_48(moom.JB a0, int a1) throws Throwable;
private static native java.lang.String __invokedynamic200022_49(int a0, long a1) throws Throwable;
private static native java.lang.String __call200022_50(java.util.Properties a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic200022_51(int a0, long a1) throws Throwable;
private static native int __call200022_52(java.lang.String a0, int a1) throws Throwable;
private static native void __fieldWrite200022_53(moom.JB a0, int a1) throws Throwable;
private static native java.lang.String __invokedynamic200022_54(int a0, long a1) throws Throwable;
private static native java.lang.String __call200022_55(java.util.Properties a0, java.lang.String a1) throws Throwable;
private static native int __call200022_56(java.lang.String a0, int a1) throws Throwable;
private static native void __fieldWrite200022_57(moom.JB a0, int a1) throws Throwable;
private static native java.lang.String __invokedynamic200022_58(int a0, long a1) throws Throwable;
private static native java.lang.String __call200022_59(java.util.Properties a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic200022_60(int a0, long a1) throws Throwable;
private static native int __call200022_61(java.lang.String a0, int a1) throws Throwable;
private static native void __fieldWrite200022_62(moom.JB a0, int a1) throws Throwable;

}


public java.lang.String toString() {
long local1 = (moom.JB.k ^ 98667897402550L);
    java.lang.String __sourceSpill1688_10 = this.a;
    int __sourceSpill1688_11 = this.c;
    int __sourceSpill1688_12 = this.d;
    int __sourceSpill1688_13 = this.e;
    int __sourceSpill1688_14 = this.f;
    int __sourceSpill1688_15 = this.g;
    int __sourceSpill1688_16 = this.h;
    int __sourceSpill1688_17 = this.i;
    int local3 = this.j;
    int local4 = __sourceSpill1688_17;
    int local5 = __sourceSpill1688_16;
    int local6 = __sourceSpill1688_15;
    int local7 = __sourceSpill1688_14;
    int local8 = __sourceSpill1688_13;
    int local9 = __sourceSpill1688_12;
    int local10 = __sourceSpill1688_11;
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1688_21(__sourceSpill1688_10, __sourceIntrinsic_a86c261fcdee_originalDynamicSite1688_18(20375, (5182700454320232991L ^ local1)), local10, __sourceIntrinsic_a86c261fcdee_originalDynamicSite1688_19(10095, (779719660513702639L ^ local1)), local9, " ", local8, " ", local7, __sourceIntrinsic_a86c261fcdee_originalDynamicSite1688_20(16037, (7544450697113086764L ^ local1)), local6, " ", local5, " ", local4, " ", local3);
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.JB.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x1DCC;
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
                throw new RuntimeException("moom/JB", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            JB.p[n2] = n4;
        }
        return p[n2];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5047_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/JB"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int b() {
return this.d;
}


public int e() {
return this.g;
}


public int c() {
return this.e;
}


public int h() {
return this.j;
}


public int f() {
return this.h;
}


public int d() {
return this.f;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5048_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/JB"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.JB.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public moom.DD[] a__ArrayDD() {
return this.b;
}


public int a() {
return this.c;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
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
        byte[] spill2618_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2618_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2618_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2618_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2618_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2618_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 30603);
    if (((moom.JB.m)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.JB.n)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.JB.n)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/JB", life9_51);
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
        life9_116 = ((java.lang.String)((moom.JB.l)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.JB.m)[life5_8] = moom.JB.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.JB.m)[life5_8];
}


public int g() {
return this.i;
}


private static native <E extends Throwable> int __sourceIntrinsic_b6097fab259f_invokedynamic200022_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b6097fab259f_invokedynamic200022_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b6097fab259f_invokedynamic200022_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b6097fab259f_invokedynamic200022_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b6097fab259f_invokedynamic200022_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b6097fab259f_invokedynamic200022_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b6097fab259f_invokedynamic200022_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b6097fab259f_invokedynamic200022_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b6097fab259f_invokedynamic200022_23(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5048_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5047_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1688_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1688_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1688_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1688_21(java.lang.String a0, java.lang.String a1, int a2, java.lang.String a3, int a4, java.lang.String a5, int a6, java.lang.String a7, int a8, java.lang.String a9, int a10, java.lang.String a11, int a12, java.lang.String a13, int a14, java.lang.String a15, int a16) throws E;
}
