package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class J2 {

private static moom.J0[] a;

private static int b;

private static int c;

private static long d;

private static java.lang.String[] e;

private static java.lang.String[] f;

private static java.util.Map g;

private static long[] h;

private static java.lang.Integer[] i;

private static java.util.Map j;

public J2() {
super();
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-2230883801023069463L)), ((long)(4606163669101403697L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(162596421524019L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.J2.d ^ 83354403347907L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill587_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill587_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill587_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill587_14 = new byte[8];
    (__sourceSpill587_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill587_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation587_16 = __sourceSpill587_14;
    ((javax.crypto.Cipher)(__sourceSpill587_11)).init(((int)(__sourceSpill587_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill587_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation587_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[17];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "éÑ\037-§àÏÚ/c/§Ì@q¤«&ÉòoÝ¶ålÞÚ\037E zÄ¹c\001yb3hétíy×º\003uHÆ\033#ÂI\021ä\024\000¶Ê©Þ£V\020\rÅõ *3ÿÕª`G~í\030\033Ô1qÏ&\022Ûë¨m¶ðÝSâÏiæ¡U³|7{\007°t\017¹Ê\\8½ø.j«hÊ6IO¤\025giu£é»`ó*ZomÿPGÊCæ\f\032¹´ã?D§ösc¬±÷cí?Ù`\004Ï\tE\020ìhVBÁSxrJ¬ÓË\033\003Ù½ti¥'.\026J:1Æ÷ÚÒ¦ÀOÌf\017-¡7hÈ\026lüÆNeÀ'ñvÞÈìPd!D£d\031Å9Û6$ìR«\020¬Lää\030¯N¼øm\005½O¢°o\025¤Ú\"çÍ4(E;!¢\006\"Ç¤Ò4»ïº»\177-Yn4\003(\025\037*µÐ\034y\022-½Þ)âà^Pü0)®²«:úã5ùFÙC+rÞJ\013Ð¶ÑH®¨VBTE¥WJÿÊpæ\005aùxiE¡­RÄYñ[ðñ\020DèHHà²\005u.\020½ãóI¬p] ëÏ¨\bîè.7bÎ(\003­¬_Q\020\022õ\bØ\024ôï/Æ/(\031Ûë\tê;\013>úßÁ\026úÒØÕ©Ö]iâOzDÔ¡S7e¨\006F7\020\n[Kµ®Î~°{Nü\017ÿ=c8{êå§æ»\013\0076xö(-Wl\005w\013~ôÅ§àð¦\033deÝeîáV<´±\027\003\030Ïn@-\016E~hÂF%\bÉ\024èa\024MÏ\032ä\005Ê¬uôÿ&X3<l~ðKJ¦ßÒãøÌ}qx\026liÖÒ\016¸\nùHà<msô)Ó\017±Ó\004\027Ö´?ÂW¶Qc&À7'ñ\036pä¶?ç¦\007ö½Þö©·\023W\005lQ¨ \024V_­%×o¨ñØ/s<Ñ±NÏ¥K\023òëMÍ\030\023¤\020\t/ÉJ`\004Yvè×Pp@\022ëB\030\fÞðb®\032phW+.v¾î÷ùîæ> I6¿\"\020ÿy ÜÃ:÷\r\006$QÎ§"))).length();
    int local16_life24 = 80;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill587_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill587_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill587_29)).doFinal(((byte[])(__sourceSpill587_28)));
        java.lang.String __sourceSpill587_34 = ((java.lang.String)(moom.J2.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill587_35 = local20_life19;
        int __sourceSpill587_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill587_35)[__sourceSpill587_36] = __sourceSpill587_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "Á7\025Nµ¿@'Ý+¢~U`L\016êÎÌAÞí(Ö\003\013Ñ3\"¾²òð\177#\001\177\033Æ'pØV\006|à\032|qÚ\005\033Ò\031äá\024\022\002\b©ÚHKoÄý¾\003\\)Nù·ÎX*<¶R\020¬FR¯mº\000ó¹\005©%¯$¡ûÄÐÀÁ~¸å2ßª\004¢P\022Ý'\023`¸U¡f@\027Ò2W,¥c¥ck\177`\t\007¤½\b\007Ö\037ûÏÚ¦&5\\°\0379\021á_uÏáb1Øk-SV¶ß<LW?ç#>\020ü¤}LCÓfb J"))).length();
    local16_life24 = 80;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill587_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill587_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill587_42)).doFinal(((byte[])(__sourceSpill587_41)));
        java.lang.String __sourceSpill587_47 = ((java.lang.String)(moom.J2.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill587_48 = local20_life19;
        int __sourceSpill587_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill587_48)[__sourceSpill587_49] = __sourceSpill587_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    e = ((java.lang.String[])(local20_life19));
    f = ((java.lang.String[])(new java.lang.String[17]));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill587_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill587_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill587_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill587_60 = new byte[8];
    (__sourceSpill587_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill587_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation587_62 = __sourceSpill587_60;
    ((javax.crypto.Cipher)(__sourceSpill587_57)).init(((int)(__sourceSpill587_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill587_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation587_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[13];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "%!àejâï\004ç\000g!Ì_wG>ª|!´w¿\n¯Ñ<çF\022Æá2@»µä6u¼\037#\001öH-X;ËE\006Té¢\tW\023¤\005¿nføAÑO\0272#2v%\023î`?"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill587_71 = local4_life67;
        int __sourceSpill587_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill587_71)).substring(((int)(__sourceSpill587_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill587_76 = local6_life65;
        int __sourceSpill587_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill587_79 = new byte[8];
        (__sourceSpill587_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill587_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill587_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill587_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill587_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill587_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill587_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill587_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill587_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill587_80)).doFinal(((byte[])(__sourceSpill587_79)));
        (__sourceSpill587_76)[__sourceSpill587_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "IEëf]hnµÛ Ý\rË¡"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill587_84 = local4_life67;
        int __sourceSpill587_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill587_84)).substring(((int)(__sourceSpill587_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill587_89 = local6_life65;
        int __sourceSpill587_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill587_92 = new byte[8];
        (__sourceSpill587_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill587_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill587_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill587_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill587_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill587_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill587_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill587_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill587_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill587_93)).doFinal(((byte[])(__sourceSpill587_92)));
        (__sourceSpill587_89)[__sourceSpill587_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    h = ((long[])(local6_life65));
    i = ((java.lang.Integer[])(new java.lang.Integer[13]));
    a = ((moom.J0[])(null));
    b = ((int)(0));
    c = ((int)(0));
}

private static native <E extends Throwable> int __sourceHandlerCall_463816e0253fbe415c78() throws E;
private static final class __SourceHandler_463816e0253fbe415c78 {

public static int f653() throws Throwable {
    moom.J0[] forwardValue653_13_0;
    int forwardValue653_14_0;
    moom.J0[] spill653_0;
    long life0_3;
    net.minecraft.entity.Entity[] life2_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life0_3 = (__fieldRead653_0() ^ 136149029327168L);
    life2_5 = __call653_1();
    spill653_0 = __fieldRead653_2();
    if (!((life2_5 != null))) {
        forwardValue653_13_0 = spill653_0;
        break forward_join_13;
    }
    if (!((spill653_0 == null))) {
        break forward_join_12;
    }
    forwardValue653_14_0 = 0;
    break forward_join_14;
    }
    forwardValue653_13_0 = __fieldRead653_3();
    }
    forwardValue653_14_0 = (forwardValue653_13_0).length;
    }
    return forwardValue653_14_0;
}
public static void h653_0(moom.Oo p0) throws Throwable {
    throw __call1065300_0(p0);
}
public static void h653_1(moom.Oo p0) throws Throwable {
    throw __call1065301_0(p0);
}
private static native long __fieldRead653_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call653_1() throws Throwable;
private static native moom.J0[] __fieldRead653_2() throws Throwable;
private static native moom.J0[] __fieldRead653_3() throws Throwable;
private static native java.lang.Exception __call1065300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1065301_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> byte[] __sourceHandlerCall_6bb698da91b16efe9cdb(java.lang.String a0, int a1) throws E;
private static final class __SourceHandler_6bb698da91b16efe9cdb {

public static byte[] f69(java.lang.String p0, int p1) throws Throwable {
    byte[] forwardValue69_26_0;
    net.minecraft.entity.Entity[] spill69_0;
    byte[] spill69_1;
    long life2_3;
    byte[] life5_8;
    net.minecraft.entity.Entity[] life4_9;
    forward_join_26: {
    forward_join_25: {
    life2_3 = (__fieldRead69_0() ^ 122365084386683L);
    spill69_0 = __call69_1();
    life5_8 = __call69_2(p0, p1);
    life4_9 = spill69_0;
    spill69_1 = life5_8;
    if (!((life4_9 != null))) {
        forwardValue69_26_0 = spill69_1;
        break forward_join_26;
    }
    if (!((spill69_1 == null))) {
        break forward_join_25;
    }
    java.lang.String __stackOp69_4_0 = p0;
    java.lang.String __stackOp69_4_1 = __invokedynamic69_3(26855, (8708876447480277444L ^ life2_3));
    life5_8 = __call69_6(__invokedynamic69_5(__stackOp69_4_1, __stackOp69_4_0), p1);
    }
    forwardValue69_26_0 = life5_8;
    }
    return forwardValue69_26_0;
}
public static void h69_0(moom.Oo p0) throws Throwable {
    throw __call1006900_0(p0);
}
private static native long __fieldRead69_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call69_1() throws Throwable;
private static native byte[] __call69_2(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.String __invokedynamic69_3(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic69_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native byte[] __call69_6(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.Exception __call1006900_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.J0 __sourceHandlerCall_62baf802c0c90d619fa6(java.util.Properties a0, moom.DD a1) throws E;
private static final class __SourceHandler_62baf802c0c90d619fa6 {

public static moom.J0 f224(java.util.Properties p0, moom.DD p1) throws Throwable {
    int forwardValue224_59_0;
    int forwardValue224_63_0;
    int forwardValue224_67_0;
    byte[] forwardValue224_106_0;
    java.io.InputStream forwardValue224_176_0;
    java.lang.String forwardValue224_229_0;
    net.minecraft.entity.Entity[] spill224_0;
    java.lang.String spill224_1;
    java.lang.String spill224_2;
    int spill224_3;
    byte[] spill224_4;
    java.lang.String spill224_5;
    java.lang.String spill224_6;
    float spill224_7;
    java.io.InputStream spill224_8;
    long life2_3;
    java.lang.String life5_12;
    java.lang.String life6_20;
    net.minecraft.entity.Entity[] life4_21;
    int life7_27;
    int life8_33;
    int life9_39;
    int life10_45;
    java.lang.String life5_91;
    java.lang.String life6_94;
    java.lang.String life11_98;
    java.lang.String life5_102;
    java.lang.String life6_106;
    byte[] life12_110;
    int life13_135;
    int life14_141;
    int life15_147;
    moom.DD life16_188;
    java.io.InputStream life17_191;
    java.awt.image.BufferedImage life18_212;
    forward_join_229: {
    forward_join_224: {
    forward_join_216: {
    forward_join_214: {
    forward_join_205: {
    forward_join_176: {
    forward_join_175: {
    forward_join_152: {
    forward_join_150: {
    forward_join_106: {
    forward_join_105: {
    forward_join_67: {
    forward_join_63: {
    forward_join_59: {
    life2_3 = (__fieldRead224_0() ^ 116229055870269L);
    spill224_0 = __call224_1();
    life5_12 = __call224_3(p0, __invokedynamic224_2(12930, (4193308771143615457L ^ life2_3)));
    life6_20 = __call224_5(p0, __invokedynamic224_4(16575, (2586704536624525790L ^ life2_3)));
    life4_21 = spill224_0;
    life7_27 = __call224_7(__call224_6(p0, "x"), -1);
    life8_33 = __call224_9(__call224_8(p0, "y"), -1);
    life9_39 = __call224_11(__call224_10(p0, "w"), -1);
    life10_45 = __call224_13(__call224_12(p0, "h"), -1);
    spill224_1 = life5_12;
    if (!((life4_21 != null))) {
        forwardValue224_229_0 = spill224_1;
        break forward_join_229;
    }
    if (!((spill224_1 != null))) {
        break forward_join_224;
    }
    spill224_2 = life6_20;
    if (!((life4_21 != null))) {
        forwardValue224_229_0 = spill224_2;
        break forward_join_229;
    }
    if (!((spill224_2 != null))) {
        break forward_join_224;
    }
    spill224_3 = life7_27;
    if (!((life4_21 != null))) {
        forwardValue224_59_0 = spill224_3;
        break forward_join_59;
    }
    if (!((spill224_3 >= 0))) {
        break forward_join_216;
    }
    forwardValue224_59_0 = life8_33;
    }
    if (!((life4_21 != null))) {
        forwardValue224_63_0 = forwardValue224_59_0;
        break forward_join_63;
    }
    if (!((forwardValue224_59_0 >= 0))) {
        break forward_join_216;
    }
    forwardValue224_63_0 = life9_39;
    }
    if (!((life4_21 != null))) {
        forwardValue224_67_0 = forwardValue224_63_0;
        break forward_join_67;
    }
    if (!((forwardValue224_63_0 >= 0))) {
        break forward_join_216;
    }
    forwardValue224_67_0 = life10_45;
    }
    if (!((forwardValue224_67_0 >= 0))) {
        break forward_join_216;
    }
    life5_91 = __call224_14(life5_12);
    life6_94 = __call224_15(life6_20);
    life11_98 = __call224_17(__call224_16(p1));
    life5_102 = __call224_18(life5_91, life11_98);
    life6_106 = __call224_19(life6_94, life11_98);
    life12_110 = __call224_20(life5_102, life9_39);
    spill224_4 = life12_110;
    if (!((life4_21 != null))) {
        forwardValue224_106_0 = spill224_4;
        break forward_join_106;
    }
    if (!((spill224_4 == null))) {
        break forward_join_105;
    }
    java.lang.String __stackOp224_22_0 = life6_106;
    java.lang.String __stackOp224_22_1 = __invokedynamic224_21(10097, (8663912390174643731L ^ life2_3));
    __call224_24(__invokedynamic224_23(__stackOp224_22_1, __stackOp224_22_0));
    return null;
    }
    forwardValue224_106_0 = life12_110;
    }
    life13_135 = ((forwardValue224_106_0).length / 4);
    life14_141 = (life13_135 / (life9_39 * life10_45));
    life15_147 = ((life14_141 * life9_39) * life10_45);
    if (!((life4_21 != null))) {
        break forward_join_150;
    }
    if (!((life13_135 != life15_147))) {
        break forward_join_152;
    }
    java.lang.String __stackOp224_26_0 = life5_102;
    float __stackOp224_26_1 = (((float) life13_135) / ((float) (life9_39 * life10_45)));
    java.lang.String __stackOp224_26_2 = __invokedynamic224_25(8052, (4689568460586135059L ^ life2_3));
    spill224_5 = __stackOp224_26_2;
    spill224_6 = __stackOp224_26_0;
    spill224_7 = __stackOp224_26_1;
    __discardScalar224_27(__stackOp224_26_2);
    float __stackOp224_29_0 = spill224_7;
    java.lang.String __stackOp224_29_1 = __invokedynamic224_28(1138, (6302337005465777426L ^ life2_3));
    __call224_31(__invokedynamic224_30(spill224_5, spill224_6, __stackOp224_29_1, __stackOp224_29_0));
    }
    return null;
    }
    life16_188 = new moom.DD(life6_106);
    life17_191 = __call224_32(life16_188);
    spill224_8 = life17_191;
    if (!((life4_21 != null))) {
        forwardValue224_176_0 = spill224_8;
        break forward_join_176;
    }
    if (!((spill224_8 == null))) {
        break forward_join_175;
    }
    java.lang.String __stackOp224_34_0 = life6_106;
    java.lang.String __stackOp224_34_1 = __invokedynamic224_33(11927, (3252401998000726010L ^ life2_3));
    __call224_36(__invokedynamic224_35(__stackOp224_34_1, __stackOp224_34_0));
    return null;
    }
    forwardValue224_176_0 = life17_191;
    }
    life18_212 = __call224_37(forwardValue224_176_0);
    if (!((life4_21 != null))) {
        break forward_join_214;
    }
    if (!(((life7_27 + life9_39) <= __call224_38(life18_212)))) {
        break forward_join_205;
    }
    if (!(((life8_33 + life10_45) <= __call224_39(life18_212)))) {
        break forward_join_205;
    }
    return new moom.J0(life5_102, life12_110, life6_106, life16_188, life7_27, life8_33, life9_39, life10_45, p0);
    }
    java.lang.String __stackOp224_41_0 = life6_106;
    java.lang.String __stackOp224_41_1 = __invokedynamic224_40(11979, (2199175985372045238L ^ life2_3));
    __call224_43(__invokedynamic224_42(__stackOp224_41_1, __stackOp224_41_0));
    }
    return null;
    }
    __call224_45(__invokedynamic224_44(7741, (8145539543135203161L ^ life2_3)));
    return null;
    }
    forwardValue224_229_0 = __invokedynamic224_46(28923, (5598459821632340372L ^ life2_3));
    }
    __call224_47(forwardValue224_229_0);
    return null;
}
public static moom.J0 h224_0(java.io.IOException p0) throws Throwable {
    throw __call2022400_0(p0);
}
public static moom.J0 h224_1(java.io.IOException p0) throws Throwable {
    throw __call2022401_0(p0);
}
public static moom.J0 h224_2(java.io.IOException p0) throws Throwable {
    throw __call2022402_0(p0);
}
public static moom.J0 h224_3(java.io.IOException p0) throws Throwable {
    throw __call2022403_0(p0);
}
public static moom.J0 h224_4(java.io.IOException p0) throws Throwable {
    throw __call2022404_0(p0);
}
public static moom.J0 h224_5(java.io.IOException p0) throws Throwable {
    throw __call2022405_0(p0);
}
public static moom.J0 h224_6(java.io.IOException p0) throws Throwable {
    throw __call2022406_0(p0);
}
public static moom.J0 h224_7(java.io.IOException p0) throws Throwable {
    throw __call2022407_0(p0);
}
public static moom.J0 h224_8(java.io.IOException p0) throws Throwable {
    throw __call2022408_0(p0);
}
public static moom.J0 h224_9(java.io.IOException p0) throws Throwable {
    throw __call2022409_0(p0);
}
public static moom.J0 h224_10(java.io.IOException p0) throws Throwable {
    throw __call2022410_0(p0);
}
public static moom.J0 h224_11(java.io.IOException p0) throws Throwable {
    throw __call2022411_0(p0);
}
public static moom.J0 h224_12(java.io.IOException p0) throws Throwable {
    throw __call2022412_0(p0);
}
public static moom.J0 h224_13(java.io.IOException p0) throws Throwable {
    throw __call2022413_0(p0);
}
public static moom.J0 h224_14(java.io.IOException p0, long p1, java.lang.String p2) throws Throwable {
    java.io.IOException local4 = p0;
    java.lang.String __stackOp2022414_1_0 = p2;
    java.lang.String __stackOp2022414_1_1 = __invokedynamic2022414_0(6025, (2363941647808210657L ^ p1));
    __call2022414_3(__invokedynamic2022414_2(__stackOp2022414_1_1, __stackOp2022414_1_0));
    return null;
}
private static native long __fieldRead224_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call224_1() throws Throwable;
private static native java.lang.String __invokedynamic224_2(int a0, long a1) throws Throwable;
private static native java.lang.String __call224_3(java.util.Properties a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic224_4(int a0, long a1) throws Throwable;
private static native java.lang.String __call224_5(java.util.Properties a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call224_6(java.util.Properties a0, java.lang.String a1) throws Throwable;
private static native int __call224_7(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.String __call224_8(java.util.Properties a0, java.lang.String a1) throws Throwable;
private static native int __call224_9(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.String __call224_10(java.util.Properties a0, java.lang.String a1) throws Throwable;
private static native int __call224_11(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.String __call224_12(java.util.Properties a0, java.lang.String a1) throws Throwable;
private static native int __call224_13(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.String __call224_14(java.lang.String a0) throws Throwable;
private static native java.lang.String __call224_15(java.lang.String a0) throws Throwable;
private static native java.lang.String __call224_16(moom.DD a0) throws Throwable;
private static native java.lang.String __call224_17(java.lang.String a0) throws Throwable;
private static native java.lang.String __call224_18(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call224_19(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native byte[] __call224_20(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.String __invokedynamic224_21(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic224_23(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call224_24(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic224_25(int a0, long a1) throws Throwable;
private static native void __discardScalar224_27(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic224_28(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic224_30(java.lang.String a0, java.lang.String a1, java.lang.String a2, float a3) throws Throwable;
private static native void __call224_31(java.lang.String a0) throws Throwable;
private static native java.io.InputStream __call224_32(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic224_33(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic224_35(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call224_36(java.lang.String a0) throws Throwable;
private static native java.awt.image.BufferedImage __call224_37(java.io.InputStream a0) throws Throwable;
private static native int __call224_38(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call224_39(java.awt.image.BufferedImage a0) throws Throwable;
private static native java.lang.String __invokedynamic224_40(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic224_42(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call224_43(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic224_44(int a0, long a1) throws Throwable;
private static native void __call224_45(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic224_46(int a0, long a1) throws Throwable;
private static native void __call224_47(java.lang.String a0) throws Throwable;
private static native java.lang.Exception __call2022400_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2022401_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2022402_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2022403_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2022404_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2022405_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2022406_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2022407_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2022408_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2022409_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2022410_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2022411_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2022412_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2022413_0(java.io.IOException a0) throws Throwable;
private static native java.lang.String __invokedynamic2022414_0(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic2022414_2(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call2022414_3(java.lang.String a0) throws Throwable;

}

private static native <E extends Throwable> moom.J0[] __sourceHandlerCall_50a3cc4d5775fa943416(net.minecraft.client.resources.IResourcePack a0) throws E;
private static final class __SourceHandler_50a3cc4d5775fa943416 {

public static moom.J0[] f684(net.minecraft.client.resources.IResourcePack p0) throws Throwable {
    java.lang.Object[] forestValue684_117_0;
    net.minecraft.entity.Entity[] spill684_0;
    java.lang.String[] spill684_1;
    long life1_3;
    java.lang.String[] life4_18;
    net.minecraft.entity.Entity[] life3_19;
    java.util.ArrayList life5_28;
    java.lang.String[] life6_30;
    int life7_33;
    int life8_35;
    java.lang.String life9_44;
    moom.DD life10_58;
    java.io.InputStream life11_62;
    moom.OH life12_66;
    moom.J0 life13_75;
    moom.DD life14_83;
    forest_join_117: {
    forest_join_113: {
    forest_join_25: {
    life1_3 = (__fieldRead684_0() ^ 77665258866093L);
    spill684_0 = __call684_1();
    life4_18 = __call684_4(p0, __invokedynamic684_2(27529, (3924420132949109362L ^ life1_3)), __invokedynamic684_3(24603, (968390537507709413L ^ life1_3)), null);
    life3_19 = spill684_0;
    if (!(((life4_18).length == 0))) {
        break forest_join_25;
    }
    return null;
    }
    life5_28 = new java.util.ArrayList();
    life6_30 = life4_18;
    life7_33 = (life6_30).length;
    life8_35 = 0;
    forest_cycle_36: while (true) {
    forest_join_110: {
    forest_join_106: {
    forest_join_104: {
    if (!((life8_35 < life7_33))) {
        break forest_join_113;
    }
    spill684_1 = life6_30;
    if (!((life3_19 != null))) {
        forestValue684_117_0 = spill684_1;
        break forest_join_117;
    }
    life9_44 = (spill684_1)[life8_35];
    java.lang.String __stackOp684_6_0 = life9_44;
    java.lang.String __stackOp684_6_1 = __invokedynamic684_5(2877, (1036257776474835655L ^ life1_3));
    __call684_8(__invokedynamic684_7(__stackOp684_6_1, __stackOp684_6_0));
    life10_58 = new moom.DD(life9_44);
    life11_62 = __call684_9(p0, life10_58);
    life12_66 = new moom.OH();
    __call684_10(life12_66, life11_62);
    __call684_11(life11_62);
    life13_75 = __call684_12(life12_66, life10_58);
    if (!((life13_75 != null))) {
        break forest_join_110;
    }
    life14_83 = new moom.DD(__call684_13(life13_75));
    if (!((life3_19 != null))) {
        break forest_join_104;
    }
    if (!((__call684_14(life14_83) != p0))) {
        break forest_join_106;
    }
    java.lang.String __stackOp684_16_0 = life9_44;
    java.lang.String __stackOp684_16_1 = __invokedynamic684_15(9756, (6330946624254175210L ^ life1_3));
    __call684_19(__invokedynamic684_18(__stackOp684_16_1, __stackOp684_16_0, __invokedynamic684_17(10098, (7968235888154437262L ^ life1_3))));
    }
    if (!((life3_19 == null))) {
        break forest_join_110;
    }
    }
    __call684_20(life5_28, life13_75);
    }
    life8_35 += 1;
    if (!((life3_19 == null))) {
        continue forest_cycle_36;
    }
    break forest_cycle_36;
    }
    }
    forestValue684_117_0 = __call684_21(life5_28, new moom.J0[0]);
    }
    return __cast684_22(forestValue684_117_0);
}
public static moom.J0[] h684_0(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3068400_0(p0);
}
public static moom.J0[] h684_1(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3068401_0(p0);
}
public static moom.J0[] h684_2(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3068402_0(p0);
}
public static moom.J0[] h684_3(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3068403_0(p0);
}
public static moom.J0[] h684_4(java.io.FileNotFoundException p0, net.minecraft.client.resources.IResourcePack p1, long p2, net.minecraft.entity.Entity[] p3, java.util.ArrayList p4, java.lang.String[] p5, int p6, int p7, java.lang.String p8, moom.DD p9, java.io.InputStream p10, moom.OH p11, moom.J0 p12, moom.DD p13) throws Throwable {
    java.lang.Object[] forestValue3068404_95_0;
    java.lang.String[] spill3068404_0;
    java.io.FileNotFoundException life10_2;
    java.lang.String life9_26;
    moom.DD life10_40;
    java.io.InputStream life11_44;
    moom.OH life12_48;
    moom.J0 life13_57;
    moom.DD life14_65;
    forest_join_95: {
    forest_join_91: {
    life10_2 = p0;
    java.lang.String __stackOp3068404_2_0 = __call3068404_0(life10_2);
    java.lang.String __stackOp3068404_2_1 = __invokedynamic3068404_1(9106, (411885592520712811L ^ p2));
    __call3068404_4(__invokedynamic3068404_3(__stackOp3068404_2_1, __stackOp3068404_2_0));
    forest_cycle_12: while (true) {
    forest_join_90: {
    forest_join_86: {
    forest_join_84: {
    forest_join_16: {
    p7 += 1;
    if (!((p3 == null))) {
        break forest_join_16;
    }
    break forest_join_91;
    }
    if (!((p7 < p6))) {
        break forest_join_91;
    }
    spill3068404_0 = p5;
    if (!((p3 != null))) {
        forestValue3068404_95_0 = spill3068404_0;
        break forest_join_95;
    }
    life9_26 = (spill3068404_0)[p7];
    java.lang.String __stackOp3068404_6_0 = life9_26;
    java.lang.String __stackOp3068404_6_1 = __invokedynamic3068404_5(2877, (1036257776474835655L ^ p2));
    __call3068404_8(__invokedynamic3068404_7(__stackOp3068404_6_1, __stackOp3068404_6_0));
    life10_40 = new moom.DD(life9_26);
    life11_44 = __call3068404_9(p1, life10_40);
    life12_48 = new moom.OH();
    __call3068404_10(life12_48, life11_44);
    __call3068404_11(life11_44);
    life13_57 = __call3068404_12(life12_48, life10_40);
    if (!((life13_57 != null))) {
        break forest_join_90;
    }
    life14_65 = new moom.DD(__call3068404_13(life13_57));
    if (!((p3 != null))) {
        break forest_join_84;
    }
    if (!((__call3068404_14(life14_65) != p1))) {
        break forest_join_86;
    }
    java.lang.String __stackOp3068404_16_0 = life9_26;
    java.lang.String __stackOp3068404_16_1 = __invokedynamic3068404_15(9756, (6330946624254175210L ^ p2));
    __call3068404_19(__invokedynamic3068404_18(__stackOp3068404_16_1, __stackOp3068404_16_0, __invokedynamic3068404_17(10098, (7968235888154437262L ^ p2))));
    }
    if (!((p3 == null))) {
        break forest_join_90;
    }
    }
    __call3068404_20(p4, life13_57);
    }
    continue forest_cycle_12;
    }
    }
    forestValue3068404_95_0 = __call3068404_21(p4, new moom.J0[0]);
    }
    return __cast3068404_22(forestValue3068404_95_0);
}
public static moom.J0[] h684_5(java.io.IOException p0, net.minecraft.client.resources.IResourcePack p1, long p2, net.minecraft.entity.Entity[] p3, java.util.ArrayList p4, java.lang.String[] p5, int p6, int p7, java.lang.String p8, moom.DD p9, java.io.InputStream p10, moom.OH p11, moom.J0 p12, moom.DD p13) throws Throwable {
    java.lang.Object[] forestValue3068405_87_0;
    java.lang.String[] spill3068405_0;
    java.io.IOException life10_2;
    java.lang.String life9_17;
    moom.DD life10_31;
    java.io.InputStream life11_35;
    moom.OH life12_39;
    moom.J0 life13_48;
    moom.DD life14_56;
    forest_join_87: {
    forest_join_83: {
    life10_2 = p0;
    __call3068405_0(life10_2);
    forest_cycle_4: while (true) {
    forest_join_82: {
    forest_join_78: {
    forest_join_76: {
    forest_join_8: {
    p7 += 1;
    if (!((p3 == null))) {
        break forest_join_8;
    }
    break forest_join_83;
    }
    if (!((p7 < p6))) {
        break forest_join_83;
    }
    spill3068405_0 = p5;
    if (!((p3 != null))) {
        forestValue3068405_87_0 = spill3068405_0;
        break forest_join_87;
    }
    life9_17 = (spill3068405_0)[p7];
    java.lang.String __stackOp3068405_2_0 = life9_17;
    java.lang.String __stackOp3068405_2_1 = __invokedynamic3068405_1(2877, (1036257776474835655L ^ p2));
    __call3068405_4(__invokedynamic3068405_3(__stackOp3068405_2_1, __stackOp3068405_2_0));
    life10_31 = new moom.DD(life9_17);
    life11_35 = __call3068405_5(p1, life10_31);
    life12_39 = new moom.OH();
    __call3068405_6(life12_39, life11_35);
    __call3068405_7(life11_35);
    life13_48 = __call3068405_8(life12_39, life10_31);
    if (!((life13_48 != null))) {
        break forest_join_82;
    }
    life14_56 = new moom.DD(__call3068405_9(life13_48));
    if (!((p3 != null))) {
        break forest_join_76;
    }
    if (!((__call3068405_10(life14_56) != p1))) {
        break forest_join_78;
    }
    java.lang.String __stackOp3068405_12_0 = life9_17;
    java.lang.String __stackOp3068405_12_1 = __invokedynamic3068405_11(9756, (6330946624254175210L ^ p2));
    __call3068405_15(__invokedynamic3068405_14(__stackOp3068405_12_1, __stackOp3068405_12_0, __invokedynamic3068405_13(10098, (7968235888154437262L ^ p2))));
    }
    if (!((p3 == null))) {
        break forest_join_82;
    }
    }
    __call3068405_16(p4, life13_48);
    }
    continue forest_cycle_4;
    }
    }
    forestValue3068405_87_0 = __call3068405_17(p4, new moom.J0[0]);
    }
    return __cast3068405_18(forestValue3068405_87_0);
}
private static native long __fieldRead684_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call684_1() throws Throwable;
private static native java.lang.String __invokedynamic684_2(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic684_3(int a0, long a1) throws Throwable;
private static native java.lang.String[] __call684_4(net.minecraft.client.resources.IResourcePack a0, java.lang.String a1, java.lang.String a2, java.lang.Object a3) throws Throwable;
private static native java.lang.String __invokedynamic684_5(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic684_7(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call684_8(java.lang.String a0) throws Throwable;
private static native java.io.InputStream __call684_9(net.minecraft.client.resources.IResourcePack a0, moom.DD a1) throws Throwable;
private static native void __call684_10(moom.OH a0, java.io.InputStream a1) throws Throwable;
private static native void __call684_11(java.io.InputStream a0) throws Throwable;
private static native moom.J0 __call684_12(moom.OH a0, moom.DD a1) throws Throwable;
private static native java.lang.String __call684_13(moom.J0 a0) throws Throwable;
private static native net.minecraft.client.resources.IResourcePack __call684_14(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic684_15(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic684_17(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic684_18(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call684_19(java.lang.String a0) throws Throwable;
private static native boolean __call684_20(java.util.ArrayList a0, moom.J0 a1) throws Throwable;
private static native java.lang.Object[] __call684_21(java.util.ArrayList a0, moom.J0[] a1) throws Throwable;
private static native moom.J0[] __cast684_22(java.lang.Object[] a0) throws Throwable;
private static native java.lang.Exception __call3068400_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3068401_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3068402_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3068403_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.String __call3068404_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.String __invokedynamic3068404_1(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3068404_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call3068404_4(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic3068404_5(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3068404_7(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call3068404_8(java.lang.String a0) throws Throwable;
private static native java.io.InputStream __call3068404_9(net.minecraft.client.resources.IResourcePack a0, moom.DD a1) throws Throwable;
private static native void __call3068404_10(moom.OH a0, java.io.InputStream a1) throws Throwable;
private static native void __call3068404_11(java.io.InputStream a0) throws Throwable;
private static native moom.J0 __call3068404_12(moom.OH a0, moom.DD a1) throws Throwable;
private static native java.lang.String __call3068404_13(moom.J0 a0) throws Throwable;
private static native net.minecraft.client.resources.IResourcePack __call3068404_14(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic3068404_15(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3068404_17(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3068404_18(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call3068404_19(java.lang.String a0) throws Throwable;
private static native boolean __call3068404_20(java.util.ArrayList a0, moom.J0 a1) throws Throwable;
private static native java.lang.Object[] __call3068404_21(java.util.ArrayList a0, moom.J0[] a1) throws Throwable;
private static native moom.J0[] __cast3068404_22(java.lang.Object[] a0) throws Throwable;
private static native void __call3068405_0(java.io.IOException a0) throws Throwable;
private static native java.lang.String __invokedynamic3068405_1(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3068405_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call3068405_4(java.lang.String a0) throws Throwable;
private static native java.io.InputStream __call3068405_5(net.minecraft.client.resources.IResourcePack a0, moom.DD a1) throws Throwable;
private static native void __call3068405_6(moom.OH a0, java.io.InputStream a1) throws Throwable;
private static native void __call3068405_7(java.io.InputStream a0) throws Throwable;
private static native moom.J0 __call3068405_8(moom.OH a0, moom.DD a1) throws Throwable;
private static native java.lang.String __call3068405_9(moom.J0 a0) throws Throwable;
private static native net.minecraft.client.resources.IResourcePack __call3068405_10(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic3068405_11(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3068405_13(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3068405_14(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call3068405_15(java.lang.String a0) throws Throwable;
private static native boolean __call3068405_16(java.util.ArrayList a0, moom.J0 a1) throws Throwable;
private static native java.lang.Object[] __call3068405_17(java.util.ArrayList a0, moom.J0[] a1) throws Throwable;
private static native moom.J0[] __cast3068405_18(java.lang.Object[] a0) throws Throwable;

}

private static native <E extends Throwable> moom.J0[] __sourceHandlerCall_bae05162c61013eef155(net.minecraft.client.resources.IResourcePack[] a0) throws E;
private static final class __SourceHandler_bae05162c61013eef155 {

public static moom.J0[] f654(net.minecraft.client.resources.IResourcePack[] p0) throws Throwable {
    moom.J0[] lexicalValue654_46_0;
    net.minecraft.entity.Entity[] spill654_0;
    moom.J0[] spill654_1;
    long life1_3;
    java.util.ArrayList life4_8;
    net.minecraft.client.resources.IResourcePack[] life5_10;
    int life6_13;
    int life7_15;
    net.minecraft.entity.Entity[] life3_16;
    net.minecraft.client.resources.IResourcePack life8_23;
    moom.J0[] life9_26;
    lexical_join_46: {
    lexical_join_41: {
    life1_3 = (__fieldRead654_0() ^ 82709899812203L);
    spill654_0 = __call654_1();
    life4_8 = new java.util.ArrayList();
    life5_10 = p0;
    life6_13 = (life5_10).length;
    life7_15 = 0;
    life3_16 = spill654_0;
    lexical_cycle_17: while (true) {
    lexical_join_39: {
    lexical_join_38: {
    if (!((life7_15 < life6_13))) {
        break lexical_join_41;
    }
    life8_23 = (life5_10)[life7_15];
    life9_26 = __call654_2(life8_23);
    if (!((life3_16 != null))) {
        break lexical_join_39;
    }
    spill654_1 = life9_26;
    if (!((life3_16 != null))) {
        lexicalValue654_46_0 = spill654_1;
        break lexical_join_46;
    }
    if (!((spill654_1 != null))) {
        break lexical_join_38;
    }
    __call654_4(life4_8, __call654_3(life9_26));
    }
    life7_15 += 1;
    }
    if (!((life3_16 == null))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    lexicalValue654_46_0 = __cast654_6(__call654_5(life4_8, new moom.J0[0]));
    }
    return lexicalValue654_46_0;
}
public static void h654_0(moom.Oo p0) throws Throwable {
    throw __call1065400_0(p0);
}
public static void h654_1(moom.Oo p0) throws Throwable {
    throw __call1065401_0(p0);
}
public static void h654_2(moom.Oo p0) throws Throwable {
    throw __call1065402_0(p0);
}
private static native long __fieldRead654_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call654_1() throws Throwable;
private static native moom.J0[] __call654_2(net.minecraft.client.resources.IResourcePack a0) throws Throwable;
private static native java.util.List __call654_3(moom.J0[] a0) throws Throwable;
private static native boolean __call654_4(java.util.ArrayList a0, java.util.List a1) throws Throwable;
private static native java.lang.Object[] __call654_5(java.util.ArrayList a0, moom.J0[] a1) throws Throwable;
private static native moom.J0[] __cast654_6(java.lang.Object[] a0) throws Throwable;
private static native java.lang.Exception __call1065400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1065401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1065402_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> byte[] __sourceHandlerCall_d2de8784e44ad9596dda(java.lang.String a0, int a1) throws E;
private static final class __SourceHandler_d2de8784e44ad9596dda {

public static byte[] f274(java.lang.String p0, int p1) throws Throwable {
    java.io.InputStream lexicalValue274_23_0;
    int lexicalValue274_61_0;
    int lexicalValue274_189_0;
    net.minecraft.entity.Entity[] spill274_0;
    java.io.InputStream spill274_1;
    int spill274_2;
    int spill274_3;
    boolean spill274_4;
    long life2_3;
    net.minecraft.client.settings.GameSettings life5_6;
    net.minecraft.entity.Entity[] life4_7;
    moom.DD life6_12;
    java.io.InputStream life7_15;
    java.awt.image.BufferedImage life8_27;
    double life9_59;
    int life11_65;
    int life9_73;
    int life10_76;
    int[] life11_81;
    byte[] life12_88;
    int life13_100;
    int life14_120;
    int life15_136;
    int life16_152;
    int life17_162;
    int life18_213;
    int life19_235;
    int life20_257;
    lexical_join_277: {
    lexical_join_61: {
    lexical_join_59: {
    lexical_join_31: {
    lexical_join_23: {
    lexical_join_22: {
    life2_3 = (__fieldRead274_0() ^ 116364626559780L);
    spill274_0 = __call274_1();
    life5_6 = __call274_2();
    life4_7 = spill274_0;
    life6_12 = new moom.DD(p0);
    life7_15 = __call274_3(life6_12);
    spill274_1 = life7_15;
    if (!((life4_7 != null))) {
        lexicalValue274_23_0 = spill274_1;
        break lexical_join_23;
    }
    if (!((spill274_1 == null))) {
        break lexical_join_22;
    }
    return null;
    }
    lexicalValue274_23_0 = life7_15;
    }
    life8_27 = __call274_4(lexicalValue274_23_0);
    __call274_5(life7_15);
    if (!((life8_27 == null))) {
        break lexical_join_31;
    }
    return null;
    }
    spill274_2 = p1;
    if (!((life4_7 != null))) {
        lexicalValue274_61_0 = spill274_2;
        break lexical_join_61;
    }
    if (!((spill274_2 > 0))) {
        break lexical_join_59;
    }
    spill274_3 = __call274_6(life8_27);
    if (!((life4_7 != null))) {
        lexicalValue274_61_0 = spill274_3;
        break lexical_join_61;
    }
    if (!((spill274_3 != p1))) {
        break lexical_join_59;
    }
    life9_59 = ((double) (__call274_7(life8_27) / __call274_8(life8_27)));
    life11_65 = ((int) (((double) p1) * life9_59));
    life8_27 = __call274_9(life8_27, p1, life11_65);
    }
    lexicalValue274_61_0 = __call274_10(life8_27);
    }
    life9_73 = lexicalValue274_61_0;
    life10_76 = __call274_11(life8_27);
    life11_81 = new int[(life9_73 * life10_76)];
    life12_88 = new byte[((life9_73 * life10_76) * 4)];
    __call274_12(life8_27, 0, 0, life9_73, life10_76, life11_81, 0, life9_73);
    life13_100 = 0;
    lexical_cycle_89: while (true) {
    lexical_join_275: {
    lexical_join_240: {
    lexical_join_189: {
    if (!((life13_100 < (life11_81).length))) {
        break lexical_join_277;
    }
    life14_120 = (((life11_81)[life13_100] >> __invokedynamic274_13(11948, (3273686554902665695L ^ life2_3))) & __invokedynamic274_14(7910, (5010554346895550868L ^ life2_3)));
    life15_136 = (((life11_81)[life13_100] >> __invokedynamic274_15(30662, (8915609335983882416L ^ life2_3))) & __invokedynamic274_16(1163, (4315649100345390079L ^ life2_3)));
    life16_152 = (((life11_81)[life13_100] >> __invokedynamic274_17(10015, (8014506416508604522L ^ life2_3))) & __invokedynamic274_18(1163, (4315649100345390079L ^ life2_3)));
    life17_162 = ((life11_81)[life13_100] & __invokedynamic274_19(1163, (4315649100345390079L ^ life2_3)));
    if (!((life4_7 != null))) {
        break lexical_join_275;
    }
    if (!((life5_6 != null))) {
        break lexical_join_240;
    }
    spill274_4 = __fieldRead274_20(life5_6);
    if (!((life4_7 != null))) {
        lexicalValue274_189_0 = __integerCategory274_21(spill274_4);
        break lexical_join_189;
    }
    if (!(spill274_4)) {
        break lexical_join_240;
    }
    lexicalValue274_189_0 = ((((life15_136 * __invokedynamic274_22(13840, (5238832371094028649L ^ life2_3))) + (life16_152 * __invokedynamic274_23(1959, (2721303625284726998L ^ life2_3)))) + (life17_162 * __invokedynamic274_24(15733, (758071126754888205L ^ life2_3)))) / __invokedynamic274_25(10285, (9062446148567277398L ^ life2_3)));
    }
    life18_213 = lexicalValue274_189_0;
    life19_235 = (((life15_136 * __invokedynamic274_26(9286, (1129515264523670328L ^ life2_3))) + (life16_152 * __invokedynamic274_27(13639, (8746909778585092669L ^ life2_3)))) / __invokedynamic274_28(26643, (8116260102601760611L ^ life2_3)));
    life20_257 = (((life15_136 * __invokedynamic274_29(9286, (1129515264523670328L ^ life2_3))) + (life17_162 * __invokedynamic274_30(24119, (5702345075699116352L ^ life2_3)))) / __invokedynamic274_31(26643, (8116260102601760611L ^ life2_3)));
    life15_136 = life18_213;
    life16_152 = life19_235;
    life17_162 = life20_257;
    }
    (life12_88)[(life13_100 * 4)] = ((byte) life15_136);
    (life12_88)[((life13_100 * 4) + 1)] = ((byte) life16_152);
    (life12_88)[((life13_100 * 4) + 2)] = ((byte) life17_162);
    (life12_88)[((life13_100 * 4) + 3)] = ((byte) life14_120);
    life13_100 += 1;
    }
    if (!((life4_7 == null))) { continue lexical_cycle_89; }
    break lexical_cycle_89;
    }
    }
    return life12_88;
}
public static byte[] h274_0(java.io.FileNotFoundException p0) throws Throwable {
    throw __call2027400_0(p0);
}
public static byte[] h274_1(java.io.FileNotFoundException p0) throws Throwable {
    throw __call2027401_0(p0);
}
public static byte[] h274_2(java.io.FileNotFoundException p0) throws Throwable {
    throw __call2027402_0(p0);
}
public static byte[] h274_3(java.io.FileNotFoundException p0) throws Throwable {
    throw __call2027403_0(p0);
}
public static byte[] h274_4(java.io.FileNotFoundException p0) throws Throwable {
    throw __call2027404_0(p0);
}
public static byte[] h274_5(java.io.FileNotFoundException p0) throws Throwable {
    throw __call2027405_0(p0);
}
public static byte[] h274_6(java.io.FileNotFoundException p0) throws Throwable {
    throw __call2027406_0(p0);
}
public static byte[] h274_7(java.io.FileNotFoundException p0) throws Throwable {
    throw __call2027407_0(p0);
}
public static byte[] h274_8(java.io.FileNotFoundException p0) throws Throwable {
    java.io.FileNotFoundException local1 = p0;
    return null;
}
public static byte[] h274_9(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    __call2027409_0(local1);
    return null;
}
private static native long __fieldRead274_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call274_1() throws Throwable;
private static native net.minecraft.client.settings.GameSettings __call274_2() throws Throwable;
private static native java.io.InputStream __call274_3(moom.DD a0) throws Throwable;
private static native java.awt.image.BufferedImage __call274_4(java.io.InputStream a0) throws Throwable;
private static native void __call274_5(java.io.InputStream a0) throws Throwable;
private static native int __call274_6(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call274_7(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call274_8(java.awt.image.BufferedImage a0) throws Throwable;
private static native java.awt.image.BufferedImage __call274_9(java.awt.image.BufferedImage a0, int a1, int a2) throws Throwable;
private static native int __call274_10(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call274_11(java.awt.image.BufferedImage a0) throws Throwable;
private static native int[] __call274_12(java.awt.image.BufferedImage a0, int a1, int a2, int a3, int a4, int[] a5, int a6, int a7) throws Throwable;
private static native int __invokedynamic274_13(int a0, long a1) throws Throwable;
private static native int __invokedynamic274_14(int a0, long a1) throws Throwable;
private static native int __invokedynamic274_15(int a0, long a1) throws Throwable;
private static native int __invokedynamic274_16(int a0, long a1) throws Throwable;
private static native int __invokedynamic274_17(int a0, long a1) throws Throwable;
private static native int __invokedynamic274_18(int a0, long a1) throws Throwable;
private static native int __invokedynamic274_19(int a0, long a1) throws Throwable;
private static native boolean __fieldRead274_20(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __integerCategory274_21(boolean value) throws Throwable;
private static native int __invokedynamic274_22(int a0, long a1) throws Throwable;
private static native int __invokedynamic274_23(int a0, long a1) throws Throwable;
private static native int __invokedynamic274_24(int a0, long a1) throws Throwable;
private static native int __invokedynamic274_25(int a0, long a1) throws Throwable;
private static native int __invokedynamic274_26(int a0, long a1) throws Throwable;
private static native int __invokedynamic274_27(int a0, long a1) throws Throwable;
private static native int __invokedynamic274_28(int a0, long a1) throws Throwable;
private static native int __invokedynamic274_29(int a0, long a1) throws Throwable;
private static native int __invokedynamic274_30(int a0, long a1) throws Throwable;
private static native int __invokedynamic274_31(int a0, long a1) throws Throwable;
private static native java.lang.Exception __call2027400_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call2027401_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call2027402_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call2027403_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call2027404_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call2027405_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call2027406_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call2027407_0(java.io.FileNotFoundException a0) throws Throwable;
private static native void __call2027409_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_6e3c382291f9b7437533() throws E;
private static final class __SourceHandler_6e3c382291f9b7437533 {

public static void f655() throws Throwable {
    int lexicalValue655_44_0;
    int lexicalValue655_55_0;
    int lexicalValue655_60_0;
    boolean spill655_0;
    boolean spill655_1;
    int spill655_2;
    long life0_3;
    net.minecraft.entity.Entity[] life2_5;
    int life3_19;
    moom.J0[] life4_21;
    int life5_24;
    int life6_26;
    moom.J0 life7_33;
    int life4_56;
    lexical_join_61: {
    lexical_join_60: {
    lexical_join_59: {
    lexical_join_57: {
    lexical_join_55: {
    lexical_join_54: {
    lexical_join_44: {
    lexical_join_41: {
    life0_3 = (__fieldRead655_0() ^ 114712107717129L);
    life2_5 = __call655_1();
    if (!((__fieldRead655_2() != null))) {
        break lexical_join_59;
    }
    spill655_0 = __call655_3();
    if (!((life2_5 != null))) {
        lexicalValue655_60_0 = __integerCategory655_4(spill655_0);
        break lexical_join_60;
    }
    if (!(spill655_0)) {
        break lexical_join_59;
    }
    life3_19 = 0;
    life4_21 = __fieldRead655_5();
    life5_24 = (life4_21).length;
    life6_26 = 0;
    lexical_cycle_21: while (true) {
    lexical_join_39: {
    lexical_join_38: {
    if (!((life6_26 < life5_24))) {
        break lexical_join_41;
    }
    life7_33 = (life4_21)[life6_26];
    __call655_6(life7_33);
    if (!((life2_5 != null))) {
        break lexical_join_39;
    }
    spill655_1 = __call655_7(life7_33);
    if (!((life2_5 != null))) {
        lexicalValue655_44_0 = __integerCategory655_8(spill655_1);
        break lexical_join_44;
    }
    if (!(spill655_1)) {
        break lexical_join_38;
    }
    life3_19 += 1;
    }
    life6_26 += 1;
    }
    if (!((life2_5 == null))) { continue lexical_cycle_21; }
    break lexical_cycle_21;
    }
    }
    lexicalValue655_44_0 = __fieldRead655_11(__fieldRead655_10(__call655_9()));
    }
    life4_56 = lexicalValue655_44_0;
    spill655_2 = life4_56;
    if (!((life2_5 != null))) {
        lexicalValue655_55_0 = spill655_2;
        break lexical_join_55;
    }
    if (!((spill655_2 != __fieldRead655_12()))) {
        break lexical_join_54;
    }
    __fieldWrite655_13(life3_19);
    __fieldWrite655_14(life4_56);
    }
    lexicalValue655_55_0 = __integerCategory655_16(__call655_15());
    }
    if (!((lexicalValue655_55_0 != 0))) {
        break lexical_join_57;
    }
    __call655_17();
    }
    if (!((life2_5 == null))) {
        break lexical_join_61;
    }
    }
    lexicalValue655_60_0 = 0;
    }
    __fieldWrite655_18(lexicalValue655_60_0);
    }
    return;
}
public static void h655_0(moom.Oo p0) throws Throwable {
    throw __call1065500_0(p0);
}
public static void h655_1(moom.Oo p0) throws Throwable {
    throw __call1065501_0(p0);
}
public static void h655_2(moom.Oo p0) throws Throwable {
    throw __call1065502_0(p0);
}
public static void h655_3(moom.Oo p0) throws Throwable {
    throw __call1065503_0(p0);
}
public static void h655_4(moom.Oo p0) throws Throwable {
    throw __call1065504_0(p0);
}
public static void h655_5(moom.Oo p0) throws Throwable {
    throw __call1065505_0(p0);
}
public static void h655_6(moom.Oo p0) throws Throwable {
    throw __call1065506_0(p0);
}
private static native long __fieldRead655_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call655_1() throws Throwable;
private static native moom.J0[] __fieldRead655_2() throws Throwable;
private static native boolean __call655_3() throws Throwable;
private static native int __integerCategory655_4(boolean value) throws Throwable;
private static native moom.J0[] __fieldRead655_5() throws Throwable;
private static native void __call655_6(moom.J0 a0) throws Throwable;
private static native boolean __call655_7(moom.J0 a0) throws Throwable;
private static native int __integerCategory655_8(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __call655_9() throws Throwable;
private static native net.minecraft.client.renderer.EntityRenderer __fieldRead655_10(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead655_11(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __fieldRead655_12() throws Throwable;
private static native void __fieldWrite655_13(int a0) throws Throwable;
private static native void __fieldWrite655_14(int a0) throws Throwable;
private static native boolean __call655_15() throws Throwable;
private static native int __integerCategory655_16(boolean value) throws Throwable;
private static native void __call655_17() throws Throwable;
private static native void __fieldWrite655_18(int a0) throws Throwable;
private static native java.lang.Exception __call1065500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1065501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1065502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1065503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1065504_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1065505_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1065506_0(moom.Oo a0) throws Throwable;

}


private static byte[] b(java.lang.String p0, int p1) { return __sourceHandlerCall_d2de8784e44ad9596dda(p0, p1); }


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4984_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/J2"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static int b() {
return moom.J2.b;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.J2.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 5406;
      if (i[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(p1 >>> 56),
            (byte)(p1 >>> 48),
            (byte)(p1 >>> 40),
            (byte)(p1 >>> 32),
            (byte)(p1 >>> 24),
            (byte)(p1 >>> 16),
            (byte)(p1 >>> 8),
            (byte)p1
         };
         long var5 = h[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/J2", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
}


public static void b__Void() {
a = ((moom.J0[])(null));
    b = ((int)(0));
    java.lang.Object[] local0 = moom.BU.a__ArrayoT();
    a = ((moom.J0[])(moom.J2.a(((net.minecraft.client.resources.IResourcePack[])(local0)))));
    moom.J2.c();
    return;
}


public static void c() { __sourceHandlerCall_6e3c382291f9b7437533(); }


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 25880);
    if (((moom.J2.f)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.J2.g)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.J2.g)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/J2", life9_51);
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
        life9_116 = ((java.lang.String)((moom.J2.e)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.J2.f)[life5_8] = moom.J2.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.J2.f)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.J2.a(((int)(local4)), ((long)(local5)));
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
        byte[] spill2580_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2580_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2580_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2580_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2580_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2580_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4988_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/J2"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static void a__Void() {
a = ((moom.J0[])(null));
    return;
}


public static int a() { return __sourceHandlerCall_463816e0253fbe415c78(); }


private static java.awt.image.BufferedImage a(java.awt.image.BufferedImage p0, int p1, int p2) {
java.awt.image.BufferedImage local3 = new java.awt.image.BufferedImage(p1, p2, 2);
    java.awt.Graphics2D local4 = ((java.awt.image.BufferedImage)(local3)).createGraphics();
    ((java.awt.Graphics2D)(local4)).setRenderingHint(((java.awt.RenderingHints.Key)(java.awt.RenderingHints.KEY_INTERPOLATION)), ((java.lang.Object)(java.awt.RenderingHints.VALUE_INTERPOLATION_BILINEAR)));
    ((java.awt.Graphics2D)(local4)).drawImage(((java.awt.Image)(p0)), ((int)(0)), ((int)(0)), ((int)(p1)), ((int)(p2)), ((java.awt.image.ImageObserver)(null)));
    return local3;
}


private static java.awt.image.BufferedImage a(java.io.InputStream p0) throws java.io.IOException {
java.lang.Object local1 = javax.imageio.ImageIO.read(((java.io.InputStream)(p0)));
    ((java.io.InputStream)(p0)).close();
    return ((java.awt.image.BufferedImage)(local1));
}


private static moom.J0 a(java.util.Properties p0, moom.DD p1) { return __sourceHandlerCall_62baf802c0c90d619fa6(p0, p1); }


private static byte[] a(java.lang.String p0, int p1) { return __sourceHandlerCall_6bb698da91b16efe9cdb(p0, p1); }


private static moom.J0[] a(net.minecraft.client.resources.IResourcePack p0) { return __sourceHandlerCall_50a3cc4d5775fa943416(p0); }


private static moom.J0[] a(net.minecraft.client.resources.IResourcePack[] p0) { return __sourceHandlerCall_bae05162c61013eef155(p0); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4988_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4984_0() throws E;
}
