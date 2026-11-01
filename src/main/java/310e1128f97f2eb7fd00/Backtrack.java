package com.moon.module.impl;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Backtrack extends com.moon.module.Module {

private com.moon.setting.ModeSetting<com.moon.bj> s;

private com.moon.setting.IntegerSetting t;

public com.moon.setting.BooleanSetting u;

private com.moon.setting.IntegerSetting v;

private com.moon.setting.BooleanSetting w;

private com.moon.setting.BooleanSetting x;

private com.moon.setting.BooleanSetting y;

private com.moon.setting.ColorSetting z;

private java.util.concurrent.locks.ReentrantLock A;

private java.util.LinkedList<com.moon.gp> B;

private moom.DZ C;

private long D;

private moom.DZ E;

private moom.DZ F;

private net.minecraft.entity.Entity G;

private moom.tp H;

private long I;

private boolean J;

private long K;

private java.util.function.Predicate<moom.yK<?>> L;

private static long M;

private static java.lang.String[] N;

private static java.lang.String[] O;

private static java.util.Map P;

private static long[] Q;

private static java.lang.Integer[] R;

private static java.util.Map S;

private static long T;

public Backtrack(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); __sourceHandlerCall_a9b44163626d8312ecce(this, p0, p1, p2, p3); }


static {
M = ((long)(((moom._a)(moom._c.a(((long)(4554901551717848621L)), ((long)(5637760467372195352L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(212004435508364L)))));
    P = ((java.util.Map)(new java.util.HashMap(13)));
    long local16_life7 = (com.moon.module.impl.Backtrack.M ^ 65375763813402L);
    javax.crypto.Cipher local18_life9;
    javax.crypto.Cipher __sourceSpill260_11 = (local18_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill260_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill260_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill260_14 = new byte[8];
    (__sourceSpill260_14)[0] = ((byte) ((int) (local16_life7 >>> 56)));
    int local19_life15 = 1;
    while ((local19_life15 < 8)) {
        (__sourceSpill260_14)[local19_life15] = ((byte) ((int) ((local16_life7 << (local19_life15 * 8)) >>> 56)));
        local19_life15 += 1;
    }
    byte[] __sourcePreallocation260_16 = __sourceSpill260_14;
    ((javax.crypto.Cipher)(__sourceSpill260_11)).init(((int)(__sourceSpill260_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill260_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation260_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local25_life19 = new java.lang.String[16];
    int local23_life20 = 0;
    java.lang.String local22_life21;
    int local24_life23 = ((java.lang.String)((local22_life21 = "\t0ÒçMëZB=íu<hæÝg0Ì,dÈîN§(ÎPg(é¼\023®,CãKÓTúRòÂi¤¦BË¯#ä¶¿÷Zâ75H\020\025\033rô/zÔÝ}Èou¿\020P»¨ýå\001±#F1ú_ÔHËL Oiº\031\021â'µ¦\006ÚëZ4lb\002¦\024M>§ÌO\016@\020Ú%÷\025ólÈÈÍPÑ\\²\034@ {PWìK1;\025ú^¬Fw¦Jm-(\020µÆhçoF\005ÙãP;S ¨§×/i\036æ.\036ÔÓëI\tZÀfÅ2\000\nÚ\025^\033·F¸.\020Âãõ|6\005Ýá\036g-Ù\013ü\020aÑUã! 4£\017¾»X*\\Ç ü°­/Ðg®¾­jÌJLgn:\037à¥00gÇS`Öº\030É$Õ:»\002v1áì¨ÀÇ­È¿\\Ìè\0179­& ÿºÀ\025Ò£0y\016J\006B\037~AýëJ\001îóÊ WÚATÃ¢\020S¿ÐÖÂ\027\002#Ã$AÉ4;"))).length();
    int local21_life24 = 24;
    int local20_life25 = -1;
    while (true) {
        local20_life25 += 1;
        byte[] __sourceSpill260_28 = ((java.lang.String)(((java.lang.String)(local22_life21)).substring(((int)(local20_life25)), ((int)((local20_life25 + local21_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill260_29 = local18_life9;
        byte[] local26_life31 = ((javax.crypto.Cipher)(__sourceSpill260_29)).doFinal(((byte[])(__sourceSpill260_28)));
        java.lang.String __sourceSpill260_34 = ((java.lang.String)(com.moon.module.impl.Backtrack.c(((byte[])(local26_life31))))).intern();
        java.lang.String[] __sourceSpill260_35 = local25_life19;
        int __sourceSpill260_36 = local23_life20;
        local23_life20 += 1;
        (__sourceSpill260_35)[__sourceSpill260_36] = __sourceSpill260_34;
        if (!(((local20_life25 = (local20_life25 + local21_life24)) < local24_life23))) { break; }
        local21_life24 = ((java.lang.String)(local22_life21)).charAt(((int)(local20_life25)));
    }
    local24_life23 = ((java.lang.String)((local22_life21 = "ãÏ:ÛaK~>è\032\007µæ\0331*½G\n¦¢°oJîq1jýñ»\035ß)öQ\\²r*·\020õFOÎøôén(Q¥È¸­\027Â\"¸Vñ5$2ì§Õ\006T²ûØY@þ§þjX<Ëm¿ØC"))).length();
    local21_life24 = 56;
    local20_life25 = -1;
    while (true) {
        local20_life25 += 1;
        byte[] __sourceSpill260_41 = ((java.lang.String)(((java.lang.String)(local22_life21)).substring(((int)(local20_life25)), ((int)((local20_life25 + local21_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill260_42 = local18_life9;
        byte[] local26_life44 = ((javax.crypto.Cipher)(__sourceSpill260_42)).doFinal(((byte[])(__sourceSpill260_41)));
        java.lang.String __sourceSpill260_47 = ((java.lang.String)(com.moon.module.impl.Backtrack.c(((byte[])(local26_life44))))).intern();
        java.lang.String[] __sourceSpill260_48 = local25_life19;
        int __sourceSpill260_49 = local23_life20;
        local23_life20 += 1;
        (__sourceSpill260_48)[__sourceSpill260_49] = __sourceSpill260_47;
        if (!(((local20_life25 = (local20_life25 + local21_life24)) < local24_life23))) { break; }
        local21_life24 = ((java.lang.String)(local22_life21)).charAt(((int)(local20_life25)));
    }
    N = ((java.lang.String[])(local25_life19));
    O = ((java.lang.String[])(new java.lang.String[16]));
    S = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local5_life55;
    javax.crypto.Cipher __sourceSpill260_57 = (local5_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill260_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill260_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill260_60 = new byte[8];
    (__sourceSpill260_60)[0] = ((byte) ((int) (local16_life7 >>> 56)));
    int local6_life61 = 1;
    while ((local6_life61 < 8)) {
        (__sourceSpill260_60)[local6_life61] = ((byte) ((int) ((local16_life7 << (local6_life61 * 8)) >>> 56)));
        local6_life61 += 1;
    }
    byte[] __sourcePreallocation260_62 = __sourceSpill260_60;
    ((javax.crypto.Cipher)(__sourceSpill260_57)).init(((int)(__sourceSpill260_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill260_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation260_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local11_life65 = new long[11];
    int local8_life66 = 0;
    java.lang.String local9_life67;
    int local10_life69 = ((java.lang.String)((local9_life67 = "çsOÖ\rÍMCj\f}wÅºJ\bÜIÃ\016íÂíØ§i¡}E\006\001àÅ6;&óï¯\033UÝ\0026\177ù\036Ü0 )véM³\03513JÎ\000Ü"))).length();
    int local7_life70 = 0;
    do {
        java.lang.String __sourceSpill260_71 = local9_life67;
        int __sourceSpill260_72 = local7_life70;
        local7_life70 += 8;
        byte[] local12_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill260_71)).substring(((int)(__sourceSpill260_72)), ((int)(local7_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill260_76 = local11_life65;
        int __sourceSpill260_77 = local8_life66;
        local8_life66 += 1;
        long local13_life78 = (((((((((((long) (local12_life75)[0]) & 255L) << 56) | ((((long) (local12_life75)[1]) & 255L) << 48)) | ((((long) (local12_life75)[2]) & 255L) << 40)) | ((((long) (local12_life75)[3]) & 255L) << 32)) | ((((long) (local12_life75)[4]) & 255L) << 24)) | ((((long) (local12_life75)[5]) & 255L) << 16)) | ((((long) (local12_life75)[6]) & 255L) << 8)) | (((long) (local12_life75)[7]) & 255L));
        byte[] __sourceSpill260_79 = new byte[8];
        (__sourceSpill260_79)[0] = ((byte) ((int) (local13_life78 >>> 56)));
        (__sourceSpill260_79)[1] = ((byte) ((int) (local13_life78 >>> 48)));
        (__sourceSpill260_79)[2] = ((byte) ((int) (local13_life78 >>> 40)));
        (__sourceSpill260_79)[3] = ((byte) ((int) (local13_life78 >>> 32)));
        (__sourceSpill260_79)[4] = ((byte) ((int) (local13_life78 >>> 24)));
        (__sourceSpill260_79)[5] = ((byte) ((int) (local13_life78 >>> 16)));
        (__sourceSpill260_79)[6] = ((byte) ((int) (local13_life78 >>> 8)));
        (__sourceSpill260_79)[7] = ((byte) ((int) local13_life78));
        javax.crypto.Cipher __sourceSpill260_80 = local5_life55;
        byte[] local15_life82 = ((javax.crypto.Cipher)(__sourceSpill260_80)).doFinal(((byte[])(__sourceSpill260_79)));
        (__sourceSpill260_76)[__sourceSpill260_77] = (((((((((((long) (local15_life82)[0]) & 255L) << 56) | ((((long) (local15_life82)[1]) & 255L) << 48)) | ((((long) (local15_life82)[2]) & 255L) << 40)) | ((((long) (local15_life82)[3]) & 255L) << 32)) | ((((long) (local15_life82)[4]) & 255L) << 24)) | ((((long) (local15_life82)[5]) & 255L) << 16)) | ((((long) (local15_life82)[6]) & 255L) << 8)) | (((long) (local15_life82)[7]) & 255L));
    } while ((!(local7_life70 >= local10_life69)));
    local10_life69 = ((java.lang.String)((local9_life67 = "·­¾5\017c4ß\020á*LÊ"))).length();
    local7_life70 = 0;
    do {
        java.lang.String __sourceSpill260_84 = local9_life67;
        int __sourceSpill260_85 = local7_life70;
        local7_life70 += 8;
        byte[] local12_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill260_84)).substring(((int)(__sourceSpill260_85)), ((int)(local7_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill260_89 = local11_life65;
        int __sourceSpill260_90 = local8_life66;
        local8_life66 += 1;
        long local13_life91 = (((((((((((long) (local12_life88)[0]) & 255L) << 56) | ((((long) (local12_life88)[1]) & 255L) << 48)) | ((((long) (local12_life88)[2]) & 255L) << 40)) | ((((long) (local12_life88)[3]) & 255L) << 32)) | ((((long) (local12_life88)[4]) & 255L) << 24)) | ((((long) (local12_life88)[5]) & 255L) << 16)) | ((((long) (local12_life88)[6]) & 255L) << 8)) | (((long) (local12_life88)[7]) & 255L));
        byte[] __sourceSpill260_92 = new byte[8];
        (__sourceSpill260_92)[0] = ((byte) ((int) (local13_life91 >>> 56)));
        (__sourceSpill260_92)[1] = ((byte) ((int) (local13_life91 >>> 48)));
        (__sourceSpill260_92)[2] = ((byte) ((int) (local13_life91 >>> 40)));
        (__sourceSpill260_92)[3] = ((byte) ((int) (local13_life91 >>> 32)));
        (__sourceSpill260_92)[4] = ((byte) ((int) (local13_life91 >>> 24)));
        (__sourceSpill260_92)[5] = ((byte) ((int) (local13_life91 >>> 16)));
        (__sourceSpill260_92)[6] = ((byte) ((int) (local13_life91 >>> 8)));
        (__sourceSpill260_92)[7] = ((byte) ((int) local13_life91));
        javax.crypto.Cipher __sourceSpill260_93 = local5_life55;
        byte[] local15_life95 = ((javax.crypto.Cipher)(__sourceSpill260_93)).doFinal(((byte[])(__sourceSpill260_92)));
        (__sourceSpill260_89)[__sourceSpill260_90] = (((((((((((long) (local15_life95)[0]) & 255L) << 56) | ((((long) (local15_life95)[1]) & 255L) << 48)) | ((((long) (local15_life95)[2]) & 255L) << 40)) | ((((long) (local15_life95)[3]) & 255L) << 32)) | ((((long) (local15_life95)[4]) & 255L) << 24)) | ((((long) (local15_life95)[5]) & 255L) << 16)) | ((((long) (local15_life95)[6]) & 255L) << 8)) | (((long) (local15_life95)[7]) & 255L));
    } while ((!(local7_life70 >= local10_life69)));
    Q = ((long[])(local11_life65));
    R = ((java.lang.Integer[])(new java.lang.Integer[11]));
    javax.crypto.Cipher local0_life99;
    javax.crypto.Cipher __sourceSpill260_101 = (local0_life99 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill260_102 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill260_103 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill260_104 = new byte[8];
    (__sourceSpill260_104)[0] = ((byte) ((int) (local16_life7 >>> 56)));
    int local1_life105 = 1;
    while ((local1_life105 < 8)) {
        (__sourceSpill260_104)[local1_life105] = ((byte) ((int) ((local16_life7 << (local1_life105 * 8)) >>> 56)));
        local1_life105 += 1;
    }
    byte[] __sourcePreallocation260_106 = __sourceSpill260_104;
    ((javax.crypto.Cipher)(__sourceSpill260_101)).init(((int)(__sourceSpill260_102)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill260_103)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation260_106)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life109 = 8112770325763036999L;
    byte[] __sourceSpill260_110 = new byte[8];
    (__sourceSpill260_110)[0] = ((byte) ((int) (local2_life109 >>> 56)));
    (__sourceSpill260_110)[1] = ((byte) ((int) (local2_life109 >>> 48)));
    (__sourceSpill260_110)[2] = ((byte) ((int) (local2_life109 >>> 40)));
    (__sourceSpill260_110)[3] = ((byte) ((int) (local2_life109 >>> 32)));
    (__sourceSpill260_110)[4] = ((byte) ((int) (local2_life109 >>> 24)));
    (__sourceSpill260_110)[5] = ((byte) ((int) (local2_life109 >>> 16)));
    (__sourceSpill260_110)[6] = ((byte) ((int) (local2_life109 >>> 8)));
    (__sourceSpill260_110)[7] = ((byte) ((int) local2_life109));
    javax.crypto.Cipher __sourceSpill260_111 = local0_life99;
    byte[] local4_life113 = ((javax.crypto.Cipher)(__sourceSpill260_111)).doFinal(((byte[])(__sourceSpill260_110)));
    T = ((long)((((((((((((long) (local4_life113)[0]) & 255L) << 56) | ((((long) (local4_life113)[1]) & 255L) << 48)) | ((((long) (local4_life113)[2]) & 255L) << 40)) | ((((long) (local4_life113)[3]) & 255L) << 32)) | ((((long) (local4_life113)[4]) & 255L) << 24)) | ((((long) (local4_life113)[5]) & 255L) << 16)) | ((((long) (local4_life113)[6]) & 255L) << 8)) | (((long) (local4_life113)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceHandlerCall_a9b44163626d8312ecce(com.moon.module.impl.Backtrack a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;
private static final class __SourceHandler_a9b44163626d8312ecce {

public static void f34(com.moon.module.impl.Backtrack receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {
    int spill34_0;
    com.moon.module.impl.Backtrack spill34_1;
    com.moon.l_ spill34_2;
    com.moon.setting.BooleanSetting spill34_3;
    com.moon.module.impl.Backtrack spill34_4;
    com.moon.l_ spill34_5;
    com.moon.setting.BooleanSetting spill34_6;
    com.moon.module.impl.Backtrack spill34_7;
    com.moon.mb spill34_8;
    com.moon.setting.BooleanSetting spill34_9;
    long life5_3;
    int life7_108;
    life5_3 = (__fieldRead34_0() ^ 37109827272716L);
    spill34_0 = __call34_1();
    __directSuperInit34_2(receiver, p0, p1, p2, p3);
    __fieldWrite34_10(receiver, __call34_9(__call34_8(__call34_5(__invokedynamic34_3(24344, (1550995489852992710L ^ life5_3)), __classLiteral34_4()), __invokedynamic34_6(19344, (4568524011671468106L ^ life5_3)), __fieldRead34_7())));
    __fieldWrite34_19(receiver, __call34_18(__call34_17(__call34_12(__invokedynamic34_11(4134, (45777889355817978L ^ life5_3))), __invokedynamic34_13(9560, (3101923722373682821L ^ life5_3)), __invokedynamic34_14(9590, (8944742144106615832L ^ life5_3)), __invokedynamic34_15(7288, (6879473227408338193L ^ life5_3)), __invokedynamic34_16(13893, (1228226722572748585L ^ life5_3)), 5)));
    __fieldWrite34_27(receiver, __call34_26(__call34_25(__call34_23(__call34_21(__invokedynamic34_20(13916, (1614507092232390028L ^ life5_3))), __invokedynamic34_22(14980, (1185558367686969685L ^ life5_3)), 1), __invokedynamic34_24(receiver))));
    __fieldWrite34_37(receiver, __call34_36(__call34_35(__call34_33(__call34_29(__invokedynamic34_28(17861, (6416219954571228700L ^ life5_3))), __invokedynamic34_30(17702, (286759704745424637L ^ life5_3)), __invokedynamic34_31(5540, (3347926229858804939L ^ life5_3)), 5, __invokedynamic34_32(18017, (94056379438806796L ^ life5_3)), 5), __invokedynamic34_34(receiver))));
    life7_108 = spill34_0;
    __fieldWrite34_43(receiver, __call34_42(__call34_41(__call34_39(__invokedynamic34_38(28234, (3348000456136433042L ^ life5_3))), __invokedynamic34_40(19981, (4380578479548153307L ^ life5_3)), 1)));
    spill34_1 = receiver;
    spill34_2 = __call34_47(__call34_45(__invokedynamic34_44(25594, (1455036226419560494L ^ life5_3))), __invokedynamic34_46(3769, (6864288537714490726L ^ life5_3)), 1);
    com.moon.setting.BooleanSetting __stackOp34_49_0 = __fieldRead34_48(receiver);
    spill34_3 = __stackOp34_49_0;
    __call34_50(__stackOp34_49_0);
    __fieldWrite34_54(spill34_1, __call34_53(__call34_52(spill34_2, __invokedynamic34_51(spill34_3))));
    spill34_4 = receiver;
    spill34_5 = __call34_58(__call34_56(__invokedynamic34_55(15589, (1831586777290624818L ^ life5_3))), __invokedynamic34_57(22212, (8297322621761398039L ^ life5_3)), 1);
    com.moon.setting.BooleanSetting __stackOp34_60_0 = __fieldRead34_59(receiver);
    spill34_6 = __stackOp34_60_0;
    __call34_61(__stackOp34_60_0);
    __fieldWrite34_65(spill34_4, __call34_64(__call34_63(spill34_5, __invokedynamic34_62(spill34_6))));
    spill34_7 = receiver;
    spill34_8 = __call34_69(__call34_67(__invokedynamic34_66(14070, (5999991248438248740L ^ life5_3))), __invokedynamic34_68(17401, (6276180838585348140L ^ life5_3)), -1);
    com.moon.setting.BooleanSetting __stackOp34_71_0 = __fieldRead34_70(receiver);
    spill34_9 = __stackOp34_71_0;
    __call34_72(__stackOp34_71_0);
    __fieldWrite34_76(spill34_7, __call34_75(__call34_74(spill34_8, __invokedynamic34_73(spill34_9))));
    __fieldWrite34_77(receiver, new java.util.concurrent.locks.ReentrantLock());
    __fieldWrite34_78(receiver, new java.util.LinkedList());
    __fieldWrite34_79(receiver, new moom.DZ());
    __fieldWrite34_80(receiver, new moom.DZ());
    __fieldWrite34_81(receiver, new moom.DZ());
    __fieldWrite34_83(receiver, __invokedynamic34_82());
    if ((life7_108 != 0)) {
        __call34_84(new java.lang.String[3]);
    } else {
        
    }
    return;
}
public static void h34_0(moom.Oo p0) throws Throwable {
    throw __call3003400_0(p0);
}
private static native long __fieldRead34_0() throws Throwable;
private static native int __call34_1() throws Throwable;
private static native void __directSuperInit34_2(com.moon.module.impl.Backtrack a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws Throwable;
private static native java.lang.String __invokedynamic34_3(int a0, long a1) throws Throwable;
private static native java.lang.Class __classLiteral34_4() throws Throwable;
private static native com.moon.mc __call34_5(java.lang.String a0, java.lang.Class a1) throws Throwable;
private static native java.lang.String __invokedynamic34_6(int a0, long a1) throws Throwable;
private static native com.moon.bj __fieldRead34_7() throws Throwable;
private static native com.moon.mc __call34_8(com.moon.mc a0, java.lang.String a1, com.moon.bj a2) throws Throwable;
private static native com.moon.setting.ModeSetting __call34_9(com.moon.mc a0) throws Throwable;
private static native void __fieldWrite34_10(com.moon.module.impl.Backtrack a0, com.moon.setting.ModeSetting a1) throws Throwable;
private static native java.lang.String __invokedynamic34_11(int a0, long a1) throws Throwable;
private static native com.moon.mf __call34_12(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic34_13(int a0, long a1) throws Throwable;
private static native int __invokedynamic34_14(int a0, long a1) throws Throwable;
private static native int __invokedynamic34_15(int a0, long a1) throws Throwable;
private static native int __invokedynamic34_16(int a0, long a1) throws Throwable;
private static native com.moon.mf __call34_17(com.moon.mf a0, java.lang.String a1, int a2, int a3, int a4, int a5) throws Throwable;
private static native com.moon.setting.IntegerSetting __call34_18(com.moon.mf a0) throws Throwable;
private static native void __fieldWrite34_19(com.moon.module.impl.Backtrack a0, com.moon.setting.IntegerSetting a1) throws Throwable;
private static native java.lang.String __invokedynamic34_20(int a0, long a1) throws Throwable;
private static native com.moon.l_ __call34_21(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic34_22(int a0, long a1) throws Throwable;
private static native com.moon.l_ __call34_23(com.moon.l_ a0, java.lang.String a1, int a2) throws Throwable;
private static native java.util.function.Supplier __invokedynamic34_24(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native com.moon.l_ __call34_25(com.moon.l_ a0, java.util.function.Supplier a1) throws Throwable;
private static native com.moon.setting.BooleanSetting __call34_26(com.moon.l_ a0) throws Throwable;
private static native void __fieldWrite34_27(com.moon.module.impl.Backtrack a0, com.moon.setting.BooleanSetting a1) throws Throwable;
private static native java.lang.String __invokedynamic34_28(int a0, long a1) throws Throwable;
private static native com.moon.mf __call34_29(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic34_30(int a0, long a1) throws Throwable;
private static native int __invokedynamic34_31(int a0, long a1) throws Throwable;
private static native int __invokedynamic34_32(int a0, long a1) throws Throwable;
private static native com.moon.mf __call34_33(com.moon.mf a0, java.lang.String a1, int a2, int a3, int a4, int a5) throws Throwable;
private static native java.util.function.Supplier __invokedynamic34_34(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native com.moon.mf __call34_35(com.moon.mf a0, java.util.function.Supplier a1) throws Throwable;
private static native com.moon.setting.IntegerSetting __call34_36(com.moon.mf a0) throws Throwable;
private static native void __fieldWrite34_37(com.moon.module.impl.Backtrack a0, com.moon.setting.IntegerSetting a1) throws Throwable;
private static native java.lang.String __invokedynamic34_38(int a0, long a1) throws Throwable;
private static native com.moon.l_ __call34_39(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic34_40(int a0, long a1) throws Throwable;
private static native com.moon.l_ __call34_41(com.moon.l_ a0, java.lang.String a1, int a2) throws Throwable;
private static native com.moon.setting.BooleanSetting __call34_42(com.moon.l_ a0) throws Throwable;
private static native void __fieldWrite34_43(com.moon.module.impl.Backtrack a0, com.moon.setting.BooleanSetting a1) throws Throwable;
private static native java.lang.String __invokedynamic34_44(int a0, long a1) throws Throwable;
private static native com.moon.l_ __call34_45(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic34_46(int a0, long a1) throws Throwable;
private static native com.moon.l_ __call34_47(com.moon.l_ a0, java.lang.String a1, int a2) throws Throwable;
private static native com.moon.setting.BooleanSetting __fieldRead34_48(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native java.lang.Object __call34_50(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native java.util.function.Supplier __invokedynamic34_51(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native com.moon.l_ __call34_52(com.moon.l_ a0, java.util.function.Supplier a1) throws Throwable;
private static native com.moon.setting.BooleanSetting __call34_53(com.moon.l_ a0) throws Throwable;
private static native void __fieldWrite34_54(com.moon.module.impl.Backtrack a0, com.moon.setting.BooleanSetting a1) throws Throwable;
private static native java.lang.String __invokedynamic34_55(int a0, long a1) throws Throwable;
private static native com.moon.l_ __call34_56(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic34_57(int a0, long a1) throws Throwable;
private static native com.moon.l_ __call34_58(com.moon.l_ a0, java.lang.String a1, int a2) throws Throwable;
private static native com.moon.setting.BooleanSetting __fieldRead34_59(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native java.lang.Object __call34_61(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native java.util.function.Supplier __invokedynamic34_62(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native com.moon.l_ __call34_63(com.moon.l_ a0, java.util.function.Supplier a1) throws Throwable;
private static native com.moon.setting.BooleanSetting __call34_64(com.moon.l_ a0) throws Throwable;
private static native void __fieldWrite34_65(com.moon.module.impl.Backtrack a0, com.moon.setting.BooleanSetting a1) throws Throwable;
private static native java.lang.String __invokedynamic34_66(int a0, long a1) throws Throwable;
private static native com.moon.mb __call34_67(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic34_68(int a0, long a1) throws Throwable;
private static native com.moon.mb __call34_69(com.moon.mb a0, java.lang.String a1, int a2) throws Throwable;
private static native com.moon.setting.BooleanSetting __fieldRead34_70(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native java.lang.Object __call34_72(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native java.util.function.Supplier __invokedynamic34_73(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native com.moon.mb __call34_74(com.moon.mb a0, java.util.function.Supplier a1) throws Throwable;
private static native com.moon.setting.ColorSetting __call34_75(com.moon.mb a0) throws Throwable;
private static native void __fieldWrite34_76(com.moon.module.impl.Backtrack a0, com.moon.setting.ColorSetting a1) throws Throwable;
private static native void __fieldWrite34_77(com.moon.module.impl.Backtrack a0, java.util.concurrent.locks.ReentrantLock a1) throws Throwable;
private static native void __fieldWrite34_78(com.moon.module.impl.Backtrack a0, java.util.LinkedList a1) throws Throwable;
private static native void __fieldWrite34_79(com.moon.module.impl.Backtrack a0, moom.DZ a1) throws Throwable;
private static native void __fieldWrite34_80(com.moon.module.impl.Backtrack a0, moom.DZ a1) throws Throwable;
private static native void __fieldWrite34_81(com.moon.module.impl.Backtrack a0, moom.DZ a1) throws Throwable;
private static native java.util.function.Predicate __invokedynamic34_82() throws Throwable;
private static native void __fieldWrite34_83(com.moon.module.impl.Backtrack a0, java.util.function.Predicate a1) throws Throwable;
private static native void __call34_84(java.lang.String[] a0) throws Throwable;
private static native java.lang.Exception __call3003400_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_63526984c91966780e98(com.moon.module.impl.Backtrack a0, long a1) throws E;
private static final class __SourceHandler_63526984c91966780e98 {

public static void f118(com.moon.module.impl.Backtrack receiver, long p0) throws Throwable {
    int forestValue118_50_0;
    int forestValue118_52_0;
    int forestValue118_70_0;
    int forestValue118_72_0;
    int forestValue118_94_0;
    int spill118_0;
    int spill118_1;
    int spill118_2;
    int spill118_3;
    int spill118_4;
    int spill118_5;
    long life3_3;
    moom.DZ life6_16;
    double life7_22;
    double life9_29;
    int life5_30;
    int life11_57;
    int life12_78;
    forest_join_97: {
    forest_join_95: {
    forest_join_94: {
    forest_join_89: {
    forest_join_87: {
    forest_join_83: {
    forest_join_72: {
    forest_join_71: {
    forest_join_70: {
    forest_join_52: {
    forest_join_51: {
    forest_join_50: {
    forest_join_49: {
    life3_3 = (__fieldRead118_0() ^ 129747580916881L);
    life6_16 = new moom.DZ(__fieldRead118_3(__fieldRead118_2(__fieldRead118_1())), __fieldRead118_6(__fieldRead118_5(__fieldRead118_4())), __fieldRead118_9(__fieldRead118_8(__fieldRead118_7())));
    life7_22 = __call118_11(receiver, life6_16, __fieldRead118_10(receiver));
    spill118_0 = __call118_12();
    life9_29 = __call118_14(receiver, life6_16, __fieldRead118_13(receiver));
    life5_30 = spill118_0;
    spill118_1 = __numericCompare118_15(life9_29, life7_22);
    if (!((life5_30 == 0))) {
        forestValue118_50_0 = spill118_1;
        break forest_join_50;
    }
    if (!((spill118_1 < 0))) {
        break forest_join_49;
    }
    spill118_2 = __numericCompare118_16(life7_22, 0x1.8p2d);
    if (!((life5_30 == 0))) {
        forestValue118_50_0 = spill118_2;
        break forest_join_50;
    }
    if (!((spill118_2 < 0))) {
        break forest_join_49;
    }
    spill118_3 = __numericCompare118_17(life7_22, 0x1.6p1d);
    if (!((life5_30 == 0))) {
        forestValue118_50_0 = spill118_3;
        break forest_join_50;
    }
    if (!((spill118_3 <= 0))) {
        break forest_join_51;
    }
    }
    forestValue118_50_0 = 1;
    }
    forestValue118_52_0 = forestValue118_50_0;
    break forest_join_52;
    }
    forestValue118_52_0 = 0;
    }
    life11_57 = forestValue118_52_0;
    spill118_4 = __numericCompare118_23((p0 - __fieldRead118_18(receiver)), ((long) (__call118_22(__cast118_21(__call118_20(__fieldRead118_19(receiver)))) - 5)));
    if (!((life5_30 == 0))) {
        forestValue118_70_0 = spill118_4;
        break forest_join_70;
    }
    if (!((spill118_4 > 0))) {
        break forest_join_71;
    }
    forestValue118_70_0 = 1;
    }
    forestValue118_72_0 = forestValue118_70_0;
    break forest_join_72;
    }
    forestValue118_72_0 = 0;
    }
    life12_78 = forestValue118_72_0;
    if (!((life5_30 == 0))) {
        break forest_join_87;
    }
    switch ((__fieldRead118_24())[__call118_28(__cast118_27(__call118_26(__fieldRead118_25(receiver))))]) {
case 1:
{
        break forest_join_83;
    }
case 2:
{
        break forest_join_89;
    }
default:
{
        break forest_join_97;
    }
}
    }
    __call118_30(receiver, __fieldRead118_29(receiver));
    }
    if (!((life5_30 != 0))) {
        break forest_join_97;
    }
    }
    spill118_5 = life11_57;
    if (!((life5_30 == 0))) {
        forestValue118_94_0 = spill118_5;
        break forest_join_94;
    }
    if (!((spill118_5 == 0))) {
        break forest_join_95;
    }
    forestValue118_94_0 = life12_78;
    }
    if (!((forestValue118_94_0 != 0))) {
        break forest_join_97;
    }
    }
    __call118_31(receiver);
    }
    return;
}
public static void h118_0(moom.Oo p0) throws Throwable {
    throw __call3011800_0(p0);
}
public static void h118_1(moom.Oo p0) throws Throwable {
    throw __call3011801_0(p0);
}
public static void h118_2(moom.Oo p0) throws Throwable {
    throw __call3011802_0(p0);
}
public static void h118_3(moom.Oo p0) throws Throwable {
    throw __call3011803_0(p0);
}
public static void h118_4(moom.Oo p0) throws Throwable {
    throw __call3011804_0(p0);
}
public static void h118_5(moom.Oo p0) throws Throwable {
    throw __call3011805_0(p0);
}
public static void h118_6(moom.Oo p0) throws Throwable {
    throw __call3011806_0(p0);
}
public static void h118_7(moom.Oo p0) throws Throwable {
    throw __call3011807_0(p0);
}
public static void h118_8(moom.Oo p0) throws Throwable {
    throw __call3011808_0(p0);
}
public static void h118_9(moom.Oo p0) throws Throwable {
    throw __call3011809_0(p0);
}
public static void h118_10(moom.Oo p0) throws Throwable {
    throw __call3011810_0(p0);
}
private static native long __fieldRead118_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead118_1() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead118_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead118_3(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead118_4() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead118_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead118_6(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead118_7() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead118_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead118_9(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.DZ __fieldRead118_10(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native double __call118_11(com.moon.module.impl.Backtrack a0, moom.DZ a1, moom.DZ a2) throws Throwable;
private static native int __call118_12() throws Throwable;
private static native moom.DZ __fieldRead118_13(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native double __call118_14(com.moon.module.impl.Backtrack a0, moom.DZ a1, moom.DZ a2) throws Throwable;
private static native int __numericCompare118_15(double a0, double a1) throws Throwable;
private static native int __numericCompare118_16(double a0, double a1) throws Throwable;
private static native int __numericCompare118_17(double a0, double a1) throws Throwable;
private static native long __fieldRead118_18(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native com.moon.setting.IntegerSetting __fieldRead118_19(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native java.lang.Object __call118_20(com.moon.setting.IntegerSetting a0) throws Throwable;
private static native java.lang.Integer __cast118_21(java.lang.Object a0) throws Throwable;
private static native int __call118_22(java.lang.Integer a0) throws Throwable;
private static native int __numericCompare118_23(long a0, long a1) throws Throwable;
private static native int[] __fieldRead118_24() throws Throwable;
private static native com.moon.setting.ModeSetting __fieldRead118_25(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native java.lang.Object __call118_26(com.moon.setting.ModeSetting a0) throws Throwable;
private static native com.moon.bj __cast118_27(java.lang.Object a0) throws Throwable;
private static native int __call118_28(com.moon.bj a0) throws Throwable;
private static native long __fieldRead118_29(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native void __call118_30(com.moon.module.impl.Backtrack a0, long a1) throws Throwable;
private static native void __call118_31(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native java.lang.Exception __call3011800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3011801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3011802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3011803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3011804_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3011805_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3011806_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3011807_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3011808_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3011809_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3011810_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f643c0ad3b6a77ead1a2(com.moon.module.impl.Backtrack a0, com.moon.eQ a1) throws E;
private static final class __SourceHandler_f643c0ad3b6a77ead1a2 {

public static void f492(com.moon.module.impl.Backtrack receiver, com.moon.eQ p0) throws Throwable {
    int forwardValue492_22_0;
    com.moon.module.impl.Backtrack forwardValue492_29_0;
    boolean spill492_0;
    com.moon.module.impl.Backtrack spill492_1;
    long life2_3;
    int life4_5;
    long life5_47;
    forward_join_32: {
    forward_join_29: {
    forward_join_26: {
    forward_join_22: {
    forward_join_18: {
    forward_join_11: {
    life2_3 = (__fieldRead492_0() ^ 63220007202021L);
    life4_5 = __call492_1();
    if (!((__call492_2(p0) != __fieldRead492_3()))) {
        break forward_join_11;
    }
    return;
    }
    spill492_0 = __call492_5(__fieldRead492_4(receiver));
    if (!((life4_5 == 0))) {
        forwardValue492_22_0 = __integerCategory492_6(spill492_0);
        break forward_join_22;
    }
    if (!(spill492_0)) {
        break forward_join_18;
    }
    return;
    }
    spill492_1 = receiver;
    if (!((life4_5 == 0))) {
        forwardValue492_29_0 = spill492_1;
        break forward_join_29;
    }
    forwardValue492_22_0 = __integerCategory492_8(__fieldRead492_7(spill492_1));
    }
    if (!((forwardValue492_22_0 == 0))) {
        break forward_join_26;
    }
    if (!((__fieldRead492_10(__fieldRead492_9()) == null))) {
        break forward_join_32;
    }
    }
    __call492_11(receiver);
    forwardValue492_29_0 = receiver;
    }
    __fieldWrite492_12(forwardValue492_29_0, 0);
    return;
    }
    life5_47 = __call492_13();
    __call492_14(receiver, life5_47);
    return;
}
public static void h492_0(moom.Oo p0) throws Throwable {
    throw __call1049200_0(p0);
}
public static void h492_1(moom.Oo p0) throws Throwable {
    throw __call1049201_0(p0);
}
public static void h492_2(moom.Oo p0) throws Throwable {
    throw __call1049202_0(p0);
}
public static void h492_3(moom.Oo p0) throws Throwable {
    throw __call1049203_0(p0);
}
public static void h492_4(moom.Oo p0) throws Throwable {
    throw __call1049204_0(p0);
}
private static native long __fieldRead492_0() throws Throwable;
private static native int __call492_1() throws Throwable;
private static native com.moon.a1 __call492_2(com.moon.eQ a0) throws Throwable;
private static native com.moon.a1 __fieldRead492_3() throws Throwable;
private static native java.util.LinkedList __fieldRead492_4(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native boolean __call492_5(java.util.LinkedList a0) throws Throwable;
private static native int __integerCategory492_6(boolean value) throws Throwable;
private static native boolean __fieldRead492_7(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native int __integerCategory492_8(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead492_9() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead492_10(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call492_11(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native void __fieldWrite492_12(com.moon.module.impl.Backtrack a0, int a1) throws Throwable;
private static native long __call492_13() throws Throwable;
private static native void __call492_14(com.moon.module.impl.Backtrack a0, long a1) throws Throwable;
private static native java.lang.Exception __call1049200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049203_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049204_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c2bd231dd7e9e76da449(com.moon.module.impl.Backtrack a0, com.moon.event.MoveEvent a1) throws E;
private static final class __SourceHandler_c2bd231dd7e9e76da449 {

public static void f493(com.moon.module.impl.Backtrack receiver, com.moon.event.MoveEvent p0) throws Throwable {
    net.minecraft.client.entity.EntityPlayerSP forwardValue493_30_0;
    int forwardValue493_39_0;
    net.minecraft.entity.Entity forwardValue493_49_0;
    com.moon.module.impl.Backtrack forwardValue493_55_0;
    net.minecraft.entity.Entity forwardValue493_77_0;
    moom.tp forwardValue493_135_0;
    net.minecraft.entity.Entity forwardValue493_150_0;
    int forwardValue493_155_0;
    net.minecraft.entity.Entity forwardValue493_157_0;
    moom.tp forwardValue493_179_0;
    int forwardValue493_246_0;
    int forwardValue493_248_0;
    int forwardValue493_272_0;
    int forwardValue493_274_0;
    int forwardValue493_286_0;
    long forwardValue493_287_0;
    int forwardValue493_306_0;
    com.moon.module.impl.Backtrack forwardValue493_328_0;
    int spill493_0;
    net.minecraft.client.entity.EntityPlayerSP spill493_1;
    boolean spill493_2;
    net.minecraft.client.entity.EntityPlayerSP spill493_3;
    com.moon.module.impl.Backtrack spill493_4;
    moom.tp spill493_5;
    net.minecraft.entity.Entity spill493_6;
    net.minecraft.entity.Entity spill493_7;
    int spill493_8;
    moom.tp spill493_9;
    net.minecraft.entity.Entity spill493_10;
    moom.tp spill493_11;
    int spill493_12;
    int spill493_13;
    int spill493_14;
    int spill493_15;
    int spill493_16;
    int spill493_17;
    int spill493_18;
    int spill493_19;
    int spill493_20;
    com.moon.module.impl.Backtrack spill493_21;
    long life2_3;
    int life4_12;
    net.minecraft.entity.Entity life6_124;
    net.minecraft.entity.player.EntityPlayer life5_135;
    net.minecraft.entity.player.EntityPlayer life5_217;
    moom.DZ life5_269;
    double life6_275;
    double life8_281;
    int life10_330;
    int life11_377;
    long life12_395;
    forward_join_335: {
    forward_join_328: {
    forward_join_327: {
    forward_join_306: {
    forward_join_299: {
    forward_join_287: {
    forward_join_286: {
    forward_join_281: {
    forward_join_274: {
    forward_join_273: {
    forward_join_272: {
    forward_join_271: {
    forward_join_248: {
    forward_join_247: {
    forward_join_246: {
    forward_join_245: {
    forward_join_190: {
    forward_join_185: {
    forward_join_179: {
    forward_join_157: {
    forward_join_155: {
    forward_join_150: {
    forward_join_148: {
    forward_join_135: {
    forward_join_101: {
    forward_join_77: {
    forward_join_75: {
    forward_join_55: {
    forward_join_54: {
    forward_join_50: {
    forward_join_49: {
    forward_join_39: {
    forward_join_30: {
    forward_join_28: {
    forward_join_27: {
    forward_join_24: {
    life2_3 = (__fieldRead493_0() ^ 70604952820821L);
    spill493_0 = __call493_1();
    __call493_6(receiver, __call493_5(__cast493_4(__call493_3(__fieldRead493_2(receiver)))));
    life4_12 = spill493_0;
    if (!((life4_12 == 0))) {
        break forward_join_27;
    }
    if (!((__fieldRead493_8(__fieldRead493_7()) != null))) {
        break forward_join_24;
    }
    spill493_1 = __fieldRead493_10(__fieldRead493_9());
    if (!((life4_12 == 0))) {
        forwardValue493_30_0 = spill493_1;
        break forward_join_30;
    }
    if (!((__fieldRead493_11(spill493_1) == null))) {
        break forward_join_28;
    }
    }
    __fieldWrite493_12(receiver, 1);
    }
    return;
    }
    forwardValue493_30_0 = __fieldRead493_14(__fieldRead493_13());
    }
    spill493_2 = __fieldRead493_15(forwardValue493_30_0);
    if (!((life4_12 == 0))) {
        forwardValue493_39_0 = __integerCategory493_16(spill493_2);
        break forward_join_39;
    }
    if (!((!spill493_2))) {
        break forward_join_50;
    }
    spill493_3 = __fieldRead493_18(__fieldRead493_17());
    if (!((life4_12 == 0))) {
        forwardValue493_49_0 = spill493_3;
        break forward_join_49;
    }
    forwardValue493_39_0 = __fieldRead493_19(spill493_3);
    }
    if (!((forwardValue493_39_0 > __invokedynamic493_20(9997, (6195033740973083196L ^ life2_3))))) {
        break forward_join_50;
    }
    spill493_4 = receiver;
    if (!((life4_12 == 0))) {
        forwardValue493_55_0 = spill493_4;
        break forward_join_55;
    }
    forwardValue493_49_0 = __fieldRead493_21(spill493_4);
    }
    if (!((forwardValue493_49_0 == null))) {
        break forward_join_54;
    }
    }
    __fieldWrite493_22(receiver, 1);
    return;
    }
    forwardValue493_55_0 = receiver;
    }
    spill493_5 = __fieldRead493_23(forwardValue493_55_0);
    if (!((life4_12 == 0))) {
        forwardValue493_77_0 = spill493_5;
        break forward_join_77;
    }
    if (!((spill493_5 != null))) {
        break forward_join_75;
    }
    spill493_6 = __fieldRead493_24(receiver);
    if (!((life4_12 == 0))) {
        forwardValue493_150_0 = spill493_6;
        break forward_join_150;
    }
    if (!((__instanceOf493_25(spill493_6) != 0))) {
        break forward_join_148;
    }
    spill493_7 = __fieldRead493_26(receiver);
    if (!((life4_12 == 0))) {
        forwardValue493_150_0 = spill493_7;
        break forward_join_150;
    }
    if (!((!__call493_30(__call493_27(spill493_7), __call493_29(__fieldRead493_28(receiver)))))) {
        break forward_join_148;
    }
    }
    forwardValue493_77_0 = __fieldRead493_31(receiver);
    }
    life6_124 = forwardValue493_77_0;
    spill493_8 = __instanceOf493_32(life6_124);
    if (!((life4_12 == 0))) {
        forwardValue493_155_0 = spill493_8;
        break forward_join_155;
    }
    if (!((spill493_8 != 0))) {
        break forward_join_148;
    }
    life5_135 = __cast493_33(life6_124);
    spill493_9 = __fieldRead493_34(receiver);
    if (!((life4_12 == 0))) {
        forwardValue493_135_0 = spill493_9;
        break forward_join_135;
    }
    if (!((spill493_9 != null))) {
        break forward_join_101;
    }
    __call493_39(__fieldRead493_36(__fieldRead493_35()), __call493_38(__fieldRead493_37(receiver)));
    __fieldWrite493_40(receiver, null);
    }
    __fieldWrite493_44(receiver, new moom.tp(__fieldRead493_42(__fieldRead493_41()), __call493_43(life5_135)));
    __call493_56(__fieldRead493_45(receiver), __fieldRead493_47(__fieldRead493_46(receiver)), __fieldRead493_49(__fieldRead493_48(receiver)), __fieldRead493_51(__fieldRead493_50(receiver)), __fieldRead493_53(__fieldRead493_52(receiver)), __fieldRead493_55(__fieldRead493_54(receiver)));
    __fieldWrite493_59(__fieldRead493_57(receiver), __fieldRead493_58(life5_135));
    forwardValue493_135_0 = __fieldRead493_60(receiver);
    }
    __fieldWrite493_62(forwardValue493_135_0, __fieldRead493_61(life5_135));
    __call493_67(__fieldRead493_64(__fieldRead493_63()), __invokedynamic493_65(5216, (7240384549585828191L ^ life2_3)), __fieldRead493_66(receiver));
    }
    forwardValue493_150_0 = __fieldRead493_68(receiver);
    }
    life6_124 = forwardValue493_150_0;
    spill493_10 = life6_124;
    if (!((life4_12 == 0))) {
        forwardValue493_157_0 = spill493_10;
        break forward_join_157;
    }
    forwardValue493_155_0 = __instanceOf493_69(spill493_10);
    }
    if (!((forwardValue493_155_0 != 0))) {
        break forward_join_185;
    }
    forwardValue493_157_0 = life6_124;
    }
    life5_217 = __cast493_70(forwardValue493_157_0);
    spill493_11 = __fieldRead493_71(receiver);
    if (!((life4_12 == 0))) {
        forwardValue493_179_0 = spill493_11;
        break forward_join_179;
    }
    if (!((spill493_11 != null))) {
        break forward_join_185;
    }
    __call493_76(__fieldRead493_73(__fieldRead493_72(receiver)), __call493_75(__fieldRead493_74(life5_217)));
    __call493_80(__fieldRead493_77(receiver), __call493_79(__fieldRead493_78(receiver)));
    forwardValue493_179_0 = __fieldRead493_81(receiver);
    }
    __call493_86(__call493_82(forwardValue493_179_0), __call493_85(__call493_84(__fieldRead493_83(receiver))));
    }
    if (!((__call493_87(p0) != __fieldRead493_88()))) {
        break forward_join_190;
    }
    return;
    }
    life5_269 = new moom.DZ(__fieldRead493_91(__fieldRead493_90(__fieldRead493_89())), __fieldRead493_94(__fieldRead493_93(__fieldRead493_92())), __fieldRead493_97(__fieldRead493_96(__fieldRead493_95())));
    life6_275 = __call493_99(receiver, life5_269, __fieldRead493_98(receiver));
    life8_281 = __call493_101(receiver, life5_269, __fieldRead493_100(receiver));
    spill493_12 = __numericCompare493_106(__fieldRead493_103(__fieldRead493_102(receiver)), __fieldRead493_105(__fieldRead493_104(receiver)));
    if (!((life4_12 == 0))) {
        forwardValue493_246_0 = spill493_12;
        break forward_join_246;
    }
    if (!((spill493_12 == 0))) {
        break forward_join_245;
    }
    spill493_13 = __numericCompare493_111(__fieldRead493_108(__fieldRead493_107(receiver)), __fieldRead493_110(__fieldRead493_109(receiver)));
    if (!((life4_12 == 0))) {
        forwardValue493_246_0 = spill493_13;
        break forward_join_246;
    }
    if (!((spill493_13 == 0))) {
        break forward_join_245;
    }
    spill493_14 = __numericCompare493_116(__fieldRead493_113(__fieldRead493_112(receiver)), __fieldRead493_115(__fieldRead493_114(receiver)));
    if (!((life4_12 == 0))) {
        forwardValue493_246_0 = spill493_14;
        break forward_join_246;
    }
    if (!((spill493_14 != 0))) {
        break forward_join_247;
    }
    }
    forwardValue493_246_0 = 1;
    }
    forwardValue493_248_0 = forwardValue493_246_0;
    break forward_join_248;
    }
    forwardValue493_248_0 = 0;
    }
    life10_330 = forwardValue493_248_0;
    spill493_15 = __numericCompare493_117(life8_281, life6_275);
    if (!((life4_12 == 0))) {
        forwardValue493_272_0 = spill493_15;
        break forward_join_272;
    }
    if (!((spill493_15 <= 0))) {
        break forward_join_271;
    }
    spill493_16 = life10_330;
    if (!((life4_12 == 0))) {
        forwardValue493_272_0 = spill493_16;
        break forward_join_272;
    }
    if (!((spill493_16 != 0))) {
        break forward_join_271;
    }
    spill493_17 = __numericCompare493_118(life6_275, 0x1.8p2d);
    if (!((life4_12 == 0))) {
        forwardValue493_272_0 = spill493_17;
        break forward_join_272;
    }
    if (!((spill493_17 < 0))) {
        break forward_join_271;
    }
    spill493_18 = __numericCompare493_119(life6_275, 0x1.8p0d);
    if (!((life4_12 == 0))) {
        forwardValue493_272_0 = spill493_18;
        break forward_join_272;
    }
    if (!((spill493_18 <= 0))) {
        break forward_join_273;
    }
    }
    forwardValue493_272_0 = 1;
    }
    forwardValue493_274_0 = forwardValue493_272_0;
    break forward_join_274;
    }
    forwardValue493_274_0 = 0;
    }
    life11_377 = forwardValue493_274_0;
    spill493_19 = life11_377;
    if (!((life4_12 == 0))) {
        forwardValue493_286_0 = spill493_19;
        break forward_join_286;
    }
    if (!((spill493_19 != 0))) {
        break forward_join_281;
    }
    forwardValue493_287_0 = 0L;
    break forward_join_287;
    }
    forwardValue493_286_0 = __call493_123(__cast493_122(__call493_121(__fieldRead493_120(receiver))));
    }
    forwardValue493_287_0 = ((long) forwardValue493_286_0);
    }
    life12_395 = forwardValue493_287_0;
    spill493_20 = __numericCompare493_124(life12_395, 0L);
    if (!((life4_12 == 0))) {
        forwardValue493_306_0 = spill493_20;
        break forward_join_306;
    }
    if (!((spill493_20 == 0))) {
        break forward_join_299;
    }
    __fieldWrite493_125(receiver, 0L);
    if (!((life4_12 != 0))) {
        break forward_join_335;
    }
    }
    spill493_21 = receiver;
    if (!((life4_12 == 0))) {
        forwardValue493_328_0 = spill493_21;
        break forward_join_328;
    }
    forwardValue493_306_0 = __integerCategory493_130(__call493_129(__cast493_128(__call493_127(__fieldRead493_126(spill493_21)))));
    }
    if (!((forwardValue493_306_0 != 0))) {
        break forward_join_327;
    }
    __fieldWrite493_141(receiver, __call493_140(((long) __call493_134(__cast493_133(__call493_132(__fieldRead493_131(receiver))))), (__fieldRead493_135(receiver) + ((long) __call493_139(__cast493_138(__call493_137(__fieldRead493_136(receiver))))))));
    if (!((life4_12 != 0))) {
        break forward_join_335;
    }
    }
    forwardValue493_328_0 = receiver;
    }
    __fieldWrite493_146(forwardValue493_328_0, ((long) __call493_145(__cast493_144(__call493_143(__fieldRead493_142(receiver))))));
    }
    return;
}
public static void h493_0(moom.Oo p0) throws Throwable {
    throw __call1049300_0(p0);
}
public static void h493_1(moom.Oo p0) throws Throwable {
    throw __call1049301_0(p0);
}
public static void h493_2(moom.Oo p0) throws Throwable {
    throw __call1049302_0(p0);
}
public static void h493_3(moom.Oo p0) throws Throwable {
    throw __call1049303_0(p0);
}
public static void h493_4(moom.Oo p0) throws Throwable {
    throw __call1049304_0(p0);
}
public static void h493_5(moom.Oo p0) throws Throwable {
    throw __call1049305_0(p0);
}
public static void h493_6(moom.Oo p0) throws Throwable {
    throw __call1049306_0(p0);
}
public static void h493_7(moom.Oo p0) throws Throwable {
    throw __call1049307_0(p0);
}
public static void h493_8(moom.Oo p0) throws Throwable {
    throw __call1049308_0(p0);
}
public static void h493_9(moom.Oo p0) throws Throwable {
    throw __call1049309_0(p0);
}
public static void h493_10(moom.Oo p0) throws Throwable {
    throw __call1049310_0(p0);
}
public static void h493_11(moom.Oo p0) throws Throwable {
    throw __call1049311_0(p0);
}
public static void h493_12(moom.Oo p0) throws Throwable {
    throw __call1049312_0(p0);
}
public static void h493_13(moom.Oo p0) throws Throwable {
    throw __call1049313_0(p0);
}
public static void h493_14(moom.Oo p0) throws Throwable {
    throw __call1049314_0(p0);
}
public static void h493_15(moom.Oo p0) throws Throwable {
    throw __call1049315_0(p0);
}
public static void h493_16(moom.Oo p0) throws Throwable {
    throw __call1049316_0(p0);
}
public static void h493_17(moom.Oo p0) throws Throwable {
    throw __call1049317_0(p0);
}
public static void h493_18(moom.Oo p0) throws Throwable {
    throw __call1049318_0(p0);
}
public static void h493_19(moom.Oo p0) throws Throwable {
    throw __call1049319_0(p0);
}
public static void h493_20(moom.Oo p0) throws Throwable {
    throw __call1049320_0(p0);
}
public static void h493_21(moom.Oo p0) throws Throwable {
    throw __call1049321_0(p0);
}
public static void h493_22(moom.Oo p0) throws Throwable {
    throw __call1049322_0(p0);
}
public static void h493_23(moom.Oo p0) throws Throwable {
    throw __call1049323_0(p0);
}
public static void h493_24(moom.Oo p0) throws Throwable {
    throw __call1049324_0(p0);
}
public static void h493_25(moom.Oo p0) throws Throwable {
    throw __call1049325_0(p0);
}
public static void h493_26(moom.Oo p0) throws Throwable {
    throw __call1049326_0(p0);
}
public static void h493_27(moom.Oo p0) throws Throwable {
    throw __call1049327_0(p0);
}
public static void h493_28(moom.Oo p0) throws Throwable {
    throw __call1049328_0(p0);
}
public static void h493_29(moom.Oo p0) throws Throwable {
    throw __call1049329_0(p0);
}
public static void h493_30(moom.Oo p0) throws Throwable {
    throw __call1049330_0(p0);
}
public static void h493_31(moom.Oo p0) throws Throwable {
    throw __call1049331_0(p0);
}
public static void h493_32(moom.Oo p0) throws Throwable {
    throw __call1049332_0(p0);
}
public static void h493_33(moom.Oo p0) throws Throwable {
    throw __call1049333_0(p0);
}
public static void h493_34(moom.Oo p0) throws Throwable {
    throw __call1049334_0(p0);
}
public static void h493_35(moom.Oo p0) throws Throwable {
    throw __call1049335_0(p0);
}
public static void h493_36(moom.Oo p0) throws Throwable {
    throw __call1049336_0(p0);
}
public static void h493_37(moom.Oo p0) throws Throwable {
    throw __call1049337_0(p0);
}
public static void h493_38(moom.Oo p0) throws Throwable {
    throw __call1049338_0(p0);
}
public static void h493_39(moom.Oo p0) throws Throwable {
    throw __call1049339_0(p0);
}
public static void h493_40(moom.Oo p0) throws Throwable {
    throw __call1049340_0(p0);
}
public static void h493_41(moom.Oo p0) throws Throwable {
    throw __call1049341_0(p0);
}
public static void h493_42(moom.Oo p0) throws Throwable {
    throw __call1049342_0(p0);
}
private static native long __fieldRead493_0() throws Throwable;
private static native int __call493_1() throws Throwable;
private static native com.moon.setting.ModeSetting __fieldRead493_2(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native java.lang.Object __call493_3(com.moon.setting.ModeSetting a0) throws Throwable;
private static native com.moon.bj __cast493_4(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call493_5(com.moon.bj a0) throws Throwable;
private static native void __call493_6(com.moon.module.impl.Backtrack a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead493_7() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead493_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead493_9() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead493_10(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead493_11(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native void __fieldWrite493_12(com.moon.module.impl.Backtrack a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead493_13() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead493_14(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead493_15(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __integerCategory493_16(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead493_17() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead493_18(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead493_19(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __invokedynamic493_20(int a0, long a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead493_21(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native void __fieldWrite493_22(com.moon.module.impl.Backtrack a0, int a1) throws Throwable;
private static native moom.tp __fieldRead493_23(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead493_24(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native int __instanceOf493_25(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead493_26(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native java.lang.String __call493_27(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.tp __fieldRead493_28(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native java.lang.String __call493_29(moom.tp a0) throws Throwable;
private static native boolean __call493_30(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead493_31(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native int __instanceOf493_32(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast493_33(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.tp __fieldRead493_34(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead493_35() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead493_36(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.tp __fieldRead493_37(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native int __call493_38(moom.tp a0) throws Throwable;
private static native net.minecraft.entity.Entity __call493_39(net.minecraft.client.multiplayer.WorldClient a0, int a1) throws Throwable;
private static native void __fieldWrite493_40(com.moon.module.impl.Backtrack a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead493_41() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead493_42(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call493_43(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native void __fieldWrite493_44(com.moon.module.impl.Backtrack a0, moom.tp a1) throws Throwable;
private static native moom.tp __fieldRead493_45(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native moom.DZ __fieldRead493_46(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native double __fieldRead493_47(moom.DZ a0) throws Throwable;
private static native moom.DZ __fieldRead493_48(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native double __fieldRead493_49(moom.DZ a0) throws Throwable;
private static native moom.DZ __fieldRead493_50(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native double __fieldRead493_51(moom.DZ a0) throws Throwable;
private static native moom.tp __fieldRead493_52(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native float __fieldRead493_53(moom.tp a0) throws Throwable;
private static native moom.tp __fieldRead493_54(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native float __fieldRead493_55(moom.tp a0) throws Throwable;
private static native void __call493_56(moom.tp a0, double a1, double a2, double a3, float a4, float a5) throws Throwable;
private static native moom.tp __fieldRead493_57(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead493_58(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native void __fieldWrite493_59(moom.tp a0, net.minecraft.entity.player.InventoryPlayer a1) throws Throwable;
private static native moom.tp __fieldRead493_60(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native moom.v8 __fieldRead493_61(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native void __fieldWrite493_62(moom.tp a0, moom.v8 a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead493_63() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead493_64(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __invokedynamic493_65(int a0, long a1) throws Throwable;
private static native moom.tp __fieldRead493_66(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native void __call493_67(net.minecraft.client.multiplayer.WorldClient a0, int a1, moom.tp a2) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead493_68(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native int __instanceOf493_69(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast493_70(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.tp __fieldRead493_71(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native moom.tp __fieldRead493_72(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead493_73(moom.tp a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead493_74(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call493_75(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native void __call493_76(net.minecraft.entity.player.InventoryPlayer a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native moom.tp __fieldRead493_77(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead493_78(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call493_79(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call493_80(moom.tp a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native moom.tp __fieldRead493_81(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native net.minecraft.entity.DataWatcher __call493_82(moom.tp a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead493_83(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native net.minecraft.entity.DataWatcher __call493_84(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.util.List __call493_85(net.minecraft.entity.DataWatcher a0) throws Throwable;
private static native void __call493_86(net.minecraft.entity.DataWatcher a0, java.util.List a1) throws Throwable;
private static native com.moon.event.MovePhase __call493_87(com.moon.event.MoveEvent a0) throws Throwable;
private static native com.moon.event.MovePhase __fieldRead493_88() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead493_89() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead493_90(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead493_91(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead493_92() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead493_93(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead493_94(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead493_95() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead493_96(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead493_97(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.DZ __fieldRead493_98(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native double __call493_99(com.moon.module.impl.Backtrack a0, moom.DZ a1, moom.DZ a2) throws Throwable;
private static native moom.DZ __fieldRead493_100(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native double __call493_101(com.moon.module.impl.Backtrack a0, moom.DZ a1, moom.DZ a2) throws Throwable;
private static native moom.DZ __fieldRead493_102(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native double __fieldRead493_103(moom.DZ a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead493_104(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native double __fieldRead493_105(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __numericCompare493_106(double a0, double a1) throws Throwable;
private static native moom.DZ __fieldRead493_107(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native double __fieldRead493_108(moom.DZ a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead493_109(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native double __fieldRead493_110(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __numericCompare493_111(double a0, double a1) throws Throwable;
private static native moom.DZ __fieldRead493_112(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native double __fieldRead493_113(moom.DZ a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead493_114(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native double __fieldRead493_115(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __numericCompare493_116(double a0, double a1) throws Throwable;
private static native int __numericCompare493_117(double a0, double a1) throws Throwable;
private static native int __numericCompare493_118(double a0, double a1) throws Throwable;
private static native int __numericCompare493_119(double a0, double a1) throws Throwable;
private static native com.moon.setting.IntegerSetting __fieldRead493_120(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native java.lang.Object __call493_121(com.moon.setting.IntegerSetting a0) throws Throwable;
private static native java.lang.Integer __cast493_122(java.lang.Object a0) throws Throwable;
private static native int __call493_123(java.lang.Integer a0) throws Throwable;
private static native int __numericCompare493_124(long a0, long a1) throws Throwable;
private static native void __fieldWrite493_125(com.moon.module.impl.Backtrack a0, long a1) throws Throwable;
private static native com.moon.setting.BooleanSetting __fieldRead493_126(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native java.lang.Object __call493_127(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native java.lang.Boolean __cast493_128(java.lang.Object a0) throws Throwable;
private static native boolean __call493_129(java.lang.Boolean a0) throws Throwable;
private static native int __integerCategory493_130(boolean value) throws Throwable;
private static native com.moon.setting.IntegerSetting __fieldRead493_131(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native java.lang.Object __call493_132(com.moon.setting.IntegerSetting a0) throws Throwable;
private static native java.lang.Integer __cast493_133(java.lang.Object a0) throws Throwable;
private static native int __call493_134(java.lang.Integer a0) throws Throwable;
private static native long __fieldRead493_135(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native com.moon.setting.IntegerSetting __fieldRead493_136(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native java.lang.Object __call493_137(com.moon.setting.IntegerSetting a0) throws Throwable;
private static native java.lang.Integer __cast493_138(java.lang.Object a0) throws Throwable;
private static native int __call493_139(java.lang.Integer a0) throws Throwable;
private static native long __call493_140(long a0, long a1) throws Throwable;
private static native void __fieldWrite493_141(com.moon.module.impl.Backtrack a0, long a1) throws Throwable;
private static native com.moon.setting.IntegerSetting __fieldRead493_142(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native java.lang.Object __call493_143(com.moon.setting.IntegerSetting a0) throws Throwable;
private static native java.lang.Integer __cast493_144(java.lang.Object a0) throws Throwable;
private static native int __call493_145(java.lang.Integer a0) throws Throwable;
private static native void __fieldWrite493_146(com.moon.module.impl.Backtrack a0, long a1) throws Throwable;
private static native java.lang.Exception __call1049300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049303_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049304_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049305_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049306_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049307_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049308_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049309_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049310_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049311_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049312_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049313_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049314_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049315_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049316_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049317_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049318_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049319_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049320_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049321_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049322_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049323_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049324_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049325_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049326_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049327_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049328_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049329_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049330_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049331_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049332_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049333_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049334_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049335_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049336_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049337_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049338_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049339_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049340_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049341_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049342_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_65175c4547eddea944c2(com.moon.module.impl.Backtrack a0, com.moon.event.PacketEvent a1) throws E;
private static final class __SourceHandler_65175c4547eddea944c2 {

public static void f119(com.moon.module.impl.Backtrack receiver, com.moon.event.PacketEvent p0) throws Throwable {
    net.minecraft.client.Minecraft lexicalValue119_12_0;
    int lexicalValue119_37_0;
    int lexicalValue119_46_0;
    com.moon.module.impl.Backtrack lexicalValue119_85_0;
    int lexicalValue119_94_0;
    int lexicalValue119_103_0;
    com.moon.module.impl.Backtrack lexicalValue119_105_0;
    net.minecraft.entity.Entity lexicalValue119_108_0;
    com.moon.module.impl.Backtrack lexicalValue119_111_0;
    com.moon.module.impl.Backtrack lexicalValue119_155_0;
    int lexicalValue119_158_0;
    net.minecraft.client.Minecraft spill119_0;
    int spill119_1;
    net.minecraft.entity.Entity spill119_2;
    com.moon.module.impl.Backtrack spill119_3;
    com.moon.module.impl.Backtrack spill119_4;
    int spill119_5;
    com.moon.module.impl.Backtrack spill119_6;
    com.moon.module.impl.Backtrack spill119_7;
    int spill119_8;
    long life2_3;
    int life4_5;
    long life5_24;
    moom.yK life8_27;
    moom.y6 life7_38;
    moom.zM life7_71;
    int[] life8_74;
    int life9_77;
    int life10_79;
    int life11_86;
    moom.yK life8_171;
    moom.zE life7_182;
    int life7_230;
    com.moon.gp life8_244;
    lexical_join_158: {
    lexical_join_155: {
    lexical_join_154: {
    lexical_join_117: {
    lexical_join_111: {
    lexical_join_110: {
    lexical_join_109: {
    lexical_join_108: {
    lexical_join_105: {
    lexical_join_103: {
    lexical_join_94: {
    lexical_join_92: {
    lexical_join_46: {
    lexical_join_41: {
    lexical_join_37: {
    lexical_join_35: {
    lexical_join_15: {
    lexical_join_14: {
    lexical_join_12: {
    life2_3 = (__fieldRead119_0() ^ 21317667598690L);
    life4_5 = __call119_1();
    spill119_0 = __fieldRead119_2();
    if (!((life4_5 == 0))) {
        lexicalValue119_12_0 = spill119_0;
        break lexical_join_12;
    }
    if (!((__fieldRead119_3(spill119_0) != null))) {
        break lexical_join_14;
    }
    lexicalValue119_12_0 = __fieldRead119_4();
    }
    if (!(__call119_5(lexicalValue119_12_0))) {
        break lexical_join_15;
    }
    }
    return;
    }
    life5_24 = __call119_6();
    life8_27 = __call119_7(p0);
    spill119_1 = __instanceOf119_8(life8_27);
    if (!((life4_5 == 0))) {
        lexicalValue119_37_0 = spill119_1;
        break lexical_join_37;
    }
    if (!((spill119_1 != 0))) {
        break lexical_join_35;
    }
    life7_38 = __cast119_9(life8_27);
    if (!((__call119_10(life7_38) == __fieldRead119_11()))) {
        break lexical_join_35;
    }
    __call119_12(receiver, life7_38);
    }
    lexicalValue119_37_0 = __integerCategory119_14(__call119_13(p0));
    }
    if (!((life4_5 == 0))) {
        lexicalValue119_46_0 = lexicalValue119_37_0;
        break lexical_join_46;
    }
    if (!((lexicalValue119_37_0 != 0))) {
        break lexical_join_41;
    }
    return;
    }
    life8_27 = __call119_15(p0);
    lexicalValue119_46_0 = __instanceOf119_16(life8_27);
    }
    if (!((life4_5 == 0))) {
        lexicalValue119_94_0 = lexicalValue119_46_0;
        break lexical_join_94;
    }
    if (!((lexicalValue119_46_0 != 0))) {
        break lexical_join_92;
    }
    life7_71 = __cast119_17(life8_27);
    life8_74 = __call119_18(life7_71);
    life9_77 = (life8_74).length;
    life10_79 = 0;
    lexical_cycle_60: while (true) {
    lexical_join_90: {
    lexical_join_89: {
    lexical_join_85: {
    if (!((life10_79 < life9_77))) {
        break lexical_join_92;
    }
    life11_86 = (life8_74)[life10_79];
    if (!((life4_5 == 0))) {
        break lexical_join_90;
    }
    spill119_2 = __fieldRead119_19(receiver);
    if (!((life4_5 == 0))) {
        lexicalValue119_108_0 = spill119_2;
        break lexical_join_108;
    }
    if (!((spill119_2 != null))) {
        break lexical_join_89;
    }
    spill119_3 = receiver;
    if (!((life4_5 == 0))) {
        lexicalValue119_85_0 = spill119_3;
        break lexical_join_85;
    }
    if (!((__call119_21(__fieldRead119_20(spill119_3)) == life11_86))) {
        break lexical_join_89;
    }
    __fieldWrite119_22(receiver, null);
    lexicalValue119_85_0 = receiver;
    }
    __fieldWrite119_23(lexicalValue119_85_0, 1);
    if (!((life4_5 != 0))) {
        break lexical_join_92;
    }
    }
    life10_79 += 1;
    }
    if (!((life4_5 != 0))) { continue lexical_cycle_60; }
    break lexical_cycle_60;
    }
    }
    lexicalValue119_94_0 = __integerCategory119_25(__call119_24(p0));
    }
    if (!((life4_5 == 0))) {
        lexicalValue119_103_0 = lexicalValue119_94_0;
        break lexical_join_103;
    }
    if (!((lexicalValue119_94_0 == 0))) {
        break lexical_join_109;
    }
    spill119_4 = receiver;
    if (!((life4_5 == 0))) {
        lexicalValue119_105_0 = spill119_4;
        break lexical_join_105;
    }
    lexicalValue119_103_0 = __integerCategory119_28(__call119_27(spill119_4, __call119_26(p0)));
    }
    if (!((lexicalValue119_103_0 != 0))) {
        break lexical_join_109;
    }
    lexicalValue119_105_0 = receiver;
    }
    if (!((life4_5 == 0))) {
        lexicalValue119_111_0 = lexicalValue119_105_0;
        break lexical_join_111;
    }
    lexicalValue119_108_0 = __fieldRead119_29(lexicalValue119_105_0);
    }
    if (!((lexicalValue119_108_0 == null))) {
        break lexical_join_110;
    }
    }
    return;
    }
    lexicalValue119_111_0 = receiver;
    }
    if (!(__call119_32(__fieldRead119_30(lexicalValue119_111_0), __call119_31(p0)))) {
        break lexical_join_117;
    }
    return;
    }
    life8_171 = __call119_33(p0);
    spill119_5 = __instanceOf119_34(life8_171);
    if (!((life4_5 == 0))) {
        lexicalValue119_158_0 = spill119_5;
        break lexical_join_158;
    }
    if (!((spill119_5 != 0))) {
        break lexical_join_154;
    }
    life7_182 = __cast119_35(life8_171);
    spill119_6 = receiver;
    if (!((life4_5 == 0))) {
        lexicalValue119_155_0 = spill119_6;
        break lexical_join_155;
    }
    if (!((__fieldRead119_36(spill119_6) != null))) {
        break lexical_join_154;
    }
    spill119_7 = receiver;
    if (!((life4_5 == 0))) {
        lexicalValue119_155_0 = spill119_7;
        break lexical_join_155;
    }
    if (!((__fieldRead119_37(spill119_7) != null))) {
        break lexical_join_154;
    }
    spill119_8 = __call119_38(life7_182);
    if (!((life4_5 == 0))) {
        lexicalValue119_158_0 = spill119_8;
        break lexical_join_158;
    }
    if (!((spill119_8 == __call119_40(__fieldRead119_39(receiver))))) {
        break lexical_join_154;
    }
    __call119_42(__fieldRead119_41(receiver));
    __call119_43(p0, 1);
    return;
    }
    lexicalValue119_155_0 = receiver;
    }
    lexicalValue119_158_0 = __call119_45(lexicalValue119_155_0, __call119_44(p0));
    }
    life7_230 = lexicalValue119_158_0;
    __call119_46(p0, 1);
    life8_244 = new com.moon.gp(__call119_47(p0), life5_24, life7_230, __fieldRead119_48(receiver));
    __call119_50(__fieldRead119_49(receiver));
    __call119_52(__fieldRead119_51(receiver), life8_244);
    __call119_54(__fieldRead119_53(receiver));
    return;
}
public static void h119_0(java.lang.Exception p0) throws Throwable {
    throw __call3011900_0(p0);
}
public static void h119_1(java.lang.Exception p0) throws Throwable {
    throw __call3011901_0(p0);
}
public static void h119_2(java.lang.Exception p0) throws Throwable {
    throw __call3011902_0(p0);
}
public static void h119_3(java.lang.Exception p0) throws Throwable {
    throw __call3011903_0(p0);
}
public static void h119_4(java.lang.Exception p0) throws Throwable {
    throw __call3011904_0(p0);
}
public static void h119_5(java.lang.Exception p0) throws Throwable {
    throw __call3011905_0(p0);
}
public static void h119_6(java.lang.Exception p0) throws Throwable {
    throw __call3011906_0(p0);
}
public static void h119_7(java.lang.Exception p0) throws Throwable {
    throw __call3011907_0(p0);
}
public static void h119_8(java.lang.Exception p0) throws Throwable {
    throw __call3011908_0(p0);
}
public static void h119_9(java.lang.Exception p0) throws Throwable {
    throw __call3011909_0(p0);
}
public static void h119_10(java.lang.Exception p0) throws Throwable {
    throw __call3011910_0(p0);
}
public static void h119_11(java.lang.Exception p0) throws Throwable {
    throw __call3011911_0(p0);
}
public static void h119_12(java.lang.Exception p0) throws Throwable {
    throw __call3011912_0(p0);
}
public static void h119_13(java.lang.Exception p0) throws Throwable {
    throw __call3011913_0(p0);
}
public static void h119_14(java.lang.Exception p0) throws Throwable {
    throw __call3011914_0(p0);
}
public static void h119_15(java.lang.Exception p0) throws Throwable {
    throw __call3011915_0(p0);
}
public static void h119_16(java.lang.Exception p0) throws Throwable {
    throw __call3011916_0(p0);
}
public static void h119_17(java.lang.Exception p0) throws Throwable {
    throw __call3011917_0(p0);
}
public static void h119_18(java.lang.Exception p0) throws Throwable {
    throw __call3011918_0(p0);
}
public static void h119_19(java.lang.Exception p0) throws Throwable {
    throw __call3011919_0(p0);
}
public static void h119_20(java.lang.Exception p0) throws Throwable {
    throw __call3011920_0(p0);
}
public static void h119_21(java.lang.Exception p0) throws Throwable {
    throw __call3011921_0(p0);
}
public static void h119_22(java.lang.Exception p0) throws Throwable {
    throw __call3011922_0(p0);
}
public static void h119_23(java.lang.Exception p0) throws Throwable {
    throw __call3011923_0(p0);
}
public static void h119_24(java.lang.Exception p0) throws Throwable {
    throw __call3011924_0(p0);
}
public static void h119_25(java.lang.Exception p0, com.moon.module.impl.Backtrack p1, int p2) throws Throwable {
    java.lang.Exception life2_2;
    life2_2 = p0;
    __call3011925_0(life2_2);
    __call3011925_2(__fieldRead3011925_1(p1));
    return;
}
public static void h119_26(java.lang.Throwable p0, com.moon.module.impl.Backtrack p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3011926_1(__fieldRead3011926_0(p1));
    throw life2_2;
}
private static native long __fieldRead119_0() throws Throwable;
private static native int __call119_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead119_2() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead119_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead119_4() throws Throwable;
private static native boolean __call119_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native long __call119_6() throws Throwable;
private static native moom.yK __call119_7(com.moon.event.PacketEvent a0) throws Throwable;
private static native int __instanceOf119_8(moom.yK a0) throws Throwable;
private static native moom.y6 __cast119_9(moom.yK a0) throws Throwable;
private static native net.minecraft.network.play.client.C02PacketUseEntity$Action __call119_10(moom.y6 a0) throws Throwable;
private static native net.minecraft.network.play.client.C02PacketUseEntity$Action __fieldRead119_11() throws Throwable;
private static native void __call119_12(com.moon.module.impl.Backtrack a0, moom.y6 a1) throws Throwable;
private static native boolean __call119_13(com.moon.event.PacketEvent a0) throws Throwable;
private static native int __integerCategory119_14(boolean value) throws Throwable;
private static native moom.yK __call119_15(com.moon.event.PacketEvent a0) throws Throwable;
private static native int __instanceOf119_16(moom.yK a0) throws Throwable;
private static native moom.zM __cast119_17(moom.yK a0) throws Throwable;
private static native int[] __call119_18(moom.zM a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead119_19(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead119_20(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native int __call119_21(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite119_22(com.moon.module.impl.Backtrack a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite119_23(com.moon.module.impl.Backtrack a0, int a1) throws Throwable;
private static native boolean __call119_24(com.moon.event.PacketEvent a0) throws Throwable;
private static native int __integerCategory119_25(boolean value) throws Throwable;
private static native moom.yK __call119_26(com.moon.event.PacketEvent a0) throws Throwable;
private static native boolean __call119_27(com.moon.module.impl.Backtrack a0, moom.yK a1) throws Throwable;
private static native int __integerCategory119_28(boolean value) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead119_29(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native java.util.function.Predicate __fieldRead119_30(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native moom.yK __call119_31(com.moon.event.PacketEvent a0) throws Throwable;
private static native boolean __call119_32(java.util.function.Predicate a0, moom.yK a1) throws Throwable;
private static native moom.yK __call119_33(com.moon.event.PacketEvent a0) throws Throwable;
private static native int __instanceOf119_34(moom.yK a0) throws Throwable;
private static native moom.zE __cast119_35(moom.yK a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead119_36(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native moom.tp __fieldRead119_37(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native int __call119_38(moom.zE a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead119_39(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native int __call119_40(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.tp __fieldRead119_41(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native void __call119_42(moom.tp a0) throws Throwable;
private static native com.moon.event.CancellableEvent __call119_43(com.moon.event.PacketEvent a0, int a1) throws Throwable;
private static native moom.yK __call119_44(com.moon.event.PacketEvent a0) throws Throwable;
private static native int __call119_45(com.moon.module.impl.Backtrack a0, moom.yK a1) throws Throwable;
private static native com.moon.event.CancellableEvent __call119_46(com.moon.event.PacketEvent a0, int a1) throws Throwable;
private static native moom.yK __call119_47(com.moon.event.PacketEvent a0) throws Throwable;
private static native moom.DZ __fieldRead119_48(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __fieldRead119_49(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native void __call119_50(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native java.util.LinkedList __fieldRead119_51(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native boolean __call119_52(java.util.LinkedList a0, com.moon.gp a1) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __fieldRead119_53(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native void __call119_54(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native java.lang.Exception __call3011900_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011901_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011902_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011903_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011904_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011905_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011906_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011907_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011908_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011909_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011910_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011911_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011912_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011913_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011914_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011915_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011916_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011917_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011918_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011919_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011920_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011921_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011922_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011923_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011924_0(java.lang.Exception a0) throws Throwable;
private static native void __call3011925_0(java.lang.Exception a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __fieldRead3011925_1(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native void __call3011925_2(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __fieldRead3011926_0(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native void __call3011926_1(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_10d6b228736edf10565c(com.moon.module.impl.Backtrack a0, com.moon.event.Render2DEvent a1) throws E;
private static final class __SourceHandler_10d6b228736edf10565c {

public static void f494(com.moon.module.impl.Backtrack receiver, com.moon.event.Render2DEvent p0) throws Throwable {
    net.minecraft.entity.Entity forwardValue494_13_0;
    net.minecraft.entity.Entity forwardValue494_18_0;
    java.lang.Object forwardValue494_29_0;
    int forwardValue494_40_0;
    int forwardValue494_52_0;
    int forwardValue494_54_0;
    com.moon.hX forwardValue494_73_0;
    int forwardValue494_73_1;
    com.moon.hX forwardValue494_74_0;
    com.moon.hX forwardValue494_79_0;
    int forwardValue494_79_1;
    com.moon.module.impl.Backtrack forwardValue494_131_0;
    com.moon.hW forwardValue494_214_0;
    moom.CA forwardValue494_214_1;
    int forwardValue494_214_2;
    com.moon.hW forwardValue494_215_0;
    moom.CA forwardValue494_215_1;
    com.moon.hW forwardValue494_226_0;
    moom.CA forwardValue494_226_1;
    int forwardValue494_226_2;
    moom.tp spill494_0;
    com.moon.event.RenderPhase spill494_1;
    boolean spill494_2;
    boolean spill494_3;
    com.moon.hX spill494_4;
    boolean spill494_5;
    com.moon.module.impl.Backtrack spill494_6;
    com.moon.hW spill494_7;
    moom.CA spill494_8;
    boolean spill494_9;
    long life2_3;
    int life4_5;
    int life5_90;
    com.moon.hW life6_127;
    moom.tp life7_130;
    float life8_134;
    double life9_142;
    double life11_150;
    double life13_158;
    float life15_184;
    float life16_189;
    double life17_193;
    double life19_197;
    double life21_201;
    moom.CA life23_246;
    forward_join_231: {
    forward_join_226: {
    forward_join_215: {
    forward_join_214: {
    forward_join_134: {
    forward_join_131: {
    forward_join_79: {
    forward_join_74: {
    forward_join_73: {
    forward_join_61: {
    forward_join_54: {
    forward_join_53: {
    forward_join_52: {
    forward_join_51: {
    forward_join_40: {
    forward_join_29: {
    forward_join_18: {
    forward_join_13: {
    life2_3 = (__fieldRead494_0() ^ 244035652424L);
    life4_5 = __call494_1();
    spill494_0 = __fieldRead494_2(receiver);
    if (!((life4_5 != 0))) {
        forwardValue494_13_0 = spill494_0;
        break forward_join_13;
    }
    if (!((spill494_0 != null))) {
        break forward_join_231;
    }
    forwardValue494_13_0 = __fieldRead494_3(receiver);
    }
    if (!((life4_5 != 0))) {
        forwardValue494_18_0 = forwardValue494_13_0;
        break forward_join_18;
    }
    if (!((forwardValue494_13_0 != null))) {
        break forward_join_231;
    }
    forwardValue494_18_0 = __fieldRead494_4(receiver);
    }
    if (!((!__fieldRead494_5(forwardValue494_18_0)))) {
        break forward_join_231;
    }
    spill494_1 = __call494_6(p0);
    if (!((life4_5 != 0))) {
        forwardValue494_29_0 = spill494_1;
        break forward_join_29;
    }
    if (!((spill494_1 == __fieldRead494_7()))) {
        break forward_join_231;
    }
    forwardValue494_29_0 = __call494_9(__fieldRead494_8(receiver));
    }
    spill494_2 = __call494_11(__cast494_10(forwardValue494_29_0));
    if (!((life4_5 != 0))) {
        forwardValue494_40_0 = __integerCategory494_12(spill494_2);
        break forward_join_40;
    }
    if (!(spill494_2)) {
        break forward_join_231;
    }
    forwardValue494_40_0 = __numericCompare494_16((__call494_13() - __fieldRead494_14(receiver)), __fieldRead494_15());
    }
    if (!((life4_5 != 0))) {
        forwardValue494_52_0 = forwardValue494_40_0;
        break forward_join_52;
    }
    if (!((forwardValue494_40_0 > 0))) {
        break forward_join_51;
    }
    spill494_3 = __call494_20(__cast494_19(__call494_18(__fieldRead494_17(receiver))));
    if (!((life4_5 != 0))) {
        forwardValue494_52_0 = __integerCategory494_21(spill494_3);
        break forward_join_52;
    }
    if (!((!spill494_3))) {
        break forward_join_53;
    }
    }
    forwardValue494_52_0 = 1;
    }
    forwardValue494_54_0 = forwardValue494_52_0;
    break forward_join_54;
    }
    forwardValue494_54_0 = 0;
    }
    life5_90 = forwardValue494_54_0;
    if (!((life4_5 != 0))) {
        break forward_join_61;
    }
    if (!((life5_90 != 0))) {
        break forward_join_231;
    }
    __call494_22();
    __call494_23();
    }
    spill494_4 = __call494_26(__call494_24(), __fieldRead494_25());
    spill494_5 = __call494_30(__cast494_29(__call494_28(__fieldRead494_27(receiver))));
    if (!((life4_5 != 0))) {
        forwardValue494_73_0 = spill494_4;
        forwardValue494_73_1 = __integerCategory494_31(spill494_5);
        break forward_join_73;
    }
    if (!(spill494_5)) {
        forwardValue494_74_0 = spill494_4;
        break forward_join_74;
    }
    forwardValue494_73_0 = spill494_4;
    forwardValue494_73_1 = 1;
    }
    forwardValue494_79_0 = forwardValue494_73_0;
    forwardValue494_79_1 = forwardValue494_73_1;
    break forward_join_79;
    }
    forwardValue494_79_0 = forwardValue494_74_0;
    forwardValue494_79_1 = __invokedynamic494_32(7375, (8446092805127366380L ^ life2_3));
    }
    life6_127 = __call494_35(__call494_34(__call494_33(forwardValue494_79_0, forwardValue494_79_1)));
    life7_130 = __fieldRead494_36(receiver);
    life8_134 = __fieldRead494_39(__fieldRead494_38(__fieldRead494_37()));
    life9_142 = __call494_42(__fieldRead494_40(life7_130), __fieldRead494_41(life7_130), ((double) life8_134));
    life11_150 = __call494_45(__fieldRead494_43(life7_130), __fieldRead494_44(life7_130), ((double) life8_134));
    life13_158 = __call494_48(__fieldRead494_46(life7_130), __fieldRead494_47(life7_130), ((double) life8_134));
    spill494_6 = receiver;
    if (!((life4_5 != 0))) {
        forwardValue494_131_0 = spill494_6;
        break forward_join_131;
    }
    if (!(__call494_52(__cast494_51(__call494_50(__fieldRead494_49(spill494_6)))))) {
        break forward_join_134;
    }
    life9_142 = __fieldRead494_54(__fieldRead494_53(receiver));
    life11_150 = __fieldRead494_56(__fieldRead494_55(receiver));
    forwardValue494_131_0 = receiver;
    }
    life13_158 = __fieldRead494_58(__fieldRead494_57(forwardValue494_131_0));
    }
    life15_184 = __fieldRead494_59(life7_130);
    life16_189 = (__fieldRead494_60(life7_130) + 0x1.99999ap-4f);
    life17_193 = __call494_63(__call494_62(__fieldRead494_61()));
    life19_197 = __call494_66(__call494_65(__fieldRead494_64()));
    life21_201 = __call494_69(__call494_68(__fieldRead494_67()));
    life23_246 = new moom.CA((((life9_142 - life17_193) - ((double) life15_184)) + 0x1.0p-2d), (life11_150 - life19_197), (((life13_158 - life21_201) - ((double) life15_184)) + 0x1.0p-2d), (((life9_142 - life17_193) + ((double) life15_184)) - 0x1.0p-2d), ((life11_150 - life19_197) + ((double) life16_189)), (((life13_158 - life21_201) + ((double) life15_184)) - 0x1.0p-2d));
    spill494_7 = life6_127;
    spill494_8 = life23_246;
    spill494_9 = __call494_73(__cast494_72(__call494_71(__fieldRead494_70(receiver))));
    if (!((life4_5 != 0))) {
        forwardValue494_214_0 = spill494_7;
        forwardValue494_214_1 = spill494_8;
        forwardValue494_214_2 = __integerCategory494_74(spill494_9);
        break forward_join_214;
    }
    if (!(spill494_9)) {
        forwardValue494_215_0 = spill494_7;
        forwardValue494_215_1 = spill494_8;
        break forward_join_215;
    }
    forwardValue494_214_0 = spill494_7;
    forwardValue494_214_1 = spill494_8;
    forwardValue494_214_2 = __call494_78(__cast494_77(__call494_76(__fieldRead494_75(receiver))));
    }
    forwardValue494_226_0 = forwardValue494_214_0;
    forwardValue494_226_1 = forwardValue494_214_1;
    forwardValue494_226_2 = forwardValue494_214_2;
    break forward_join_226;
    }
    forwardValue494_226_0 = forwardValue494_215_0;
    forwardValue494_226_1 = forwardValue494_215_1;
    forwardValue494_226_2 = __call494_84(__call494_83(new com.moon.aO(__call494_82(__cast494_81(__call494_80(__fieldRead494_79(receiver))))), 0x1.0p-1f));
    }
    __call494_86(forwardValue494_226_0, __call494_85(forwardValue494_226_1, forwardValue494_226_2));
    __call494_87(life6_127);
    __call494_88();
    }
    return;
}
public static void h494_0(moom.Oo p0) throws Throwable {
    throw __call1049400_0(p0);
}
public static void h494_1(moom.Oo p0) throws Throwable {
    throw __call1049401_0(p0);
}
public static void h494_2(moom.Oo p0) throws Throwable {
    throw __call1049402_0(p0);
}
public static void h494_3(moom.Oo p0) throws Throwable {
    throw __call1049403_0(p0);
}
public static void h494_4(moom.Oo p0) throws Throwable {
    throw __call1049404_0(p0);
}
public static void h494_5(moom.Oo p0) throws Throwable {
    throw __call1049405_0(p0);
}
public static void h494_6(moom.Oo p0) throws Throwable {
    throw __call1049406_0(p0);
}
public static void h494_7(moom.Oo p0) throws Throwable {
    throw __call1049407_0(p0);
}
public static void h494_8(moom.Oo p0) throws Throwable {
    throw __call1049408_0(p0);
}
public static void h494_9(moom.Oo p0) throws Throwable {
    throw __call1049409_0(p0);
}
public static void h494_10(moom.Oo p0) throws Throwable {
    throw __call1049410_0(p0);
}
public static void h494_11(moom.Oo p0) throws Throwable {
    throw __call1049411_0(p0);
}
public static void h494_12(moom.Oo p0) throws Throwable {
    throw __call1049412_0(p0);
}
public static void h494_13(moom.Oo p0) throws Throwable {
    throw __call1049413_0(p0);
}
public static void h494_14(moom.Oo p0) throws Throwable {
    throw __call1049414_0(p0);
}
public static void h494_15(moom.Oo p0) throws Throwable {
    throw __call1049415_0(p0);
}
public static void h494_16(moom.Oo p0) throws Throwable {
    throw __call1049416_0(p0);
}
public static void h494_17(moom.Oo p0) throws Throwable {
    throw __call1049417_0(p0);
}
private static native long __fieldRead494_0() throws Throwable;
private static native int __call494_1() throws Throwable;
private static native moom.tp __fieldRead494_2(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead494_3(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead494_4(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native boolean __fieldRead494_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native com.moon.event.RenderPhase __call494_6(com.moon.event.Render2DEvent a0) throws Throwable;
private static native com.moon.event.RenderPhase __fieldRead494_7() throws Throwable;
private static native com.moon.setting.BooleanSetting __fieldRead494_8(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native java.lang.Object __call494_9(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native java.lang.Boolean __cast494_10(java.lang.Object a0) throws Throwable;
private static native boolean __call494_11(java.lang.Boolean a0) throws Throwable;
private static native int __integerCategory494_12(boolean value) throws Throwable;
private static native long __call494_13() throws Throwable;
private static native long __fieldRead494_14(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native long __fieldRead494_15() throws Throwable;
private static native int __numericCompare494_16(long a0, long a1) throws Throwable;
private static native com.moon.setting.BooleanSetting __fieldRead494_17(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native java.lang.Object __call494_18(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native java.lang.Boolean __cast494_19(java.lang.Object a0) throws Throwable;
private static native boolean __call494_20(java.lang.Boolean a0) throws Throwable;
private static native int __integerCategory494_21(boolean value) throws Throwable;
private static native void __call494_22() throws Throwable;
private static native void __call494_23() throws Throwable;
private static native com.moon.hX __call494_24() throws Throwable;
private static native com.moon.cb __fieldRead494_25() throws Throwable;
private static native com.moon.hX __call494_26(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.setting.BooleanSetting __fieldRead494_27(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native java.lang.Object __call494_28(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native java.lang.Boolean __cast494_29(java.lang.Object a0) throws Throwable;
private static native boolean __call494_30(java.lang.Boolean a0) throws Throwable;
private static native int __integerCategory494_31(boolean value) throws Throwable;
private static native int __invokedynamic494_32(int a0, long a1) throws Throwable;
private static native com.moon.hX __call494_33(com.moon.hX a0, int a1) throws Throwable;
private static native com.moon.hX __call494_34(com.moon.hX a0) throws Throwable;
private static native com.moon.hW __call494_35(com.moon.hX a0) throws Throwable;
private static native moom.tp __fieldRead494_36(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead494_37() throws Throwable;
private static native moom.DM __fieldRead494_38(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead494_39(moom.DM a0) throws Throwable;
private static native double __fieldRead494_40(moom.tp a0) throws Throwable;
private static native double __fieldRead494_41(moom.tp a0) throws Throwable;
private static native double __call494_42(double a0, double a1, double a2) throws Throwable;
private static native double __fieldRead494_43(moom.tp a0) throws Throwable;
private static native double __fieldRead494_44(moom.tp a0) throws Throwable;
private static native double __call494_45(double a0, double a1, double a2) throws Throwable;
private static native double __fieldRead494_46(moom.tp a0) throws Throwable;
private static native double __fieldRead494_47(moom.tp a0) throws Throwable;
private static native double __call494_48(double a0, double a1, double a2) throws Throwable;
private static native com.moon.setting.BooleanSetting __fieldRead494_49(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native java.lang.Object __call494_50(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native java.lang.Boolean __cast494_51(java.lang.Object a0) throws Throwable;
private static native boolean __call494_52(java.lang.Boolean a0) throws Throwable;
private static native moom.DZ __fieldRead494_53(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native double __fieldRead494_54(moom.DZ a0) throws Throwable;
private static native moom.DZ __fieldRead494_55(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native double __fieldRead494_56(moom.DZ a0) throws Throwable;
private static native moom.DZ __fieldRead494_57(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native double __fieldRead494_58(moom.DZ a0) throws Throwable;
private static native float __fieldRead494_59(moom.tp a0) throws Throwable;
private static native float __fieldRead494_60(moom.tp a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead494_61() throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __call494_62(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __call494_63(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead494_64() throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __call494_65(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __call494_66(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead494_67() throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __call494_68(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __call494_69(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native com.moon.setting.BooleanSetting __fieldRead494_70(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native java.lang.Object __call494_71(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native java.lang.Boolean __cast494_72(java.lang.Object a0) throws Throwable;
private static native boolean __call494_73(java.lang.Boolean a0) throws Throwable;
private static native int __integerCategory494_74(boolean value) throws Throwable;
private static native com.moon.setting.ColorSetting __fieldRead494_75(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native java.lang.Object __call494_76(com.moon.setting.ColorSetting a0) throws Throwable;
private static native java.lang.Integer __cast494_77(java.lang.Object a0) throws Throwable;
private static native int __call494_78(java.lang.Integer a0) throws Throwable;
private static native com.moon.setting.ColorSetting __fieldRead494_79(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native java.lang.Object __call494_80(com.moon.setting.ColorSetting a0) throws Throwable;
private static native java.lang.Integer __cast494_81(java.lang.Object a0) throws Throwable;
private static native int __call494_82(java.lang.Integer a0) throws Throwable;
private static native com.moon.aO __call494_83(com.moon.aO a0, float a1) throws Throwable;
private static native int __call494_84(com.moon.aO a0) throws Throwable;
private static native com.moon.i9 __call494_85(moom.CA a0, int a1) throws Throwable;
private static native void __call494_86(com.moon.hW a0, com.moon.i9 a1) throws Throwable;
private static native void __call494_87(com.moon.hW a0) throws Throwable;
private static native void __call494_88() throws Throwable;
private static native java.lang.Exception __call1049400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049403_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049404_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049405_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049406_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049407_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049408_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049409_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049410_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049411_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049412_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049413_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049414_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049415_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049416_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049417_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_23fba9fc1e6f3c8b6824(com.moon.module.impl.Backtrack a0, moom.y6 a1) throws E;
private static final class __SourceHandler_23fba9fc1e6f3c8b6824 {

public static void f495(com.moon.module.impl.Backtrack receiver, moom.y6 p0) throws Throwable {
    net.minecraft.entity.Entity forwardValue495_20_0;
    com.moon.module.impl.Backtrack forwardValue495_57_0;
    net.minecraft.entity.Entity forwardValue495_58_0;
    net.minecraft.entity.Entity forwardValue495_77_0;
    net.minecraft.entity.Entity forwardValue495_118_0;
    net.minecraft.entity.Entity forwardValue495_125_0;
    moom.tp forwardValue495_204_0;
    int spill495_0;
    net.minecraft.entity.Entity spill495_1;
    net.minecraft.entity.Entity spill495_2;
    com.moon.module.impl.Backtrack spill495_3;
    net.minecraft.entity.Entity spill495_4;
    net.minecraft.entity.Entity spill495_5;
    moom.tp spill495_6;
    long life2_3;
    net.minecraft.entity.Entity life5_10;
    int life4_11;
    net.minecraft.entity.Entity life7_159;
    net.minecraft.entity.player.EntityPlayer life6_173;
    forward_join_210: {
    forward_join_207: {
    forward_join_204: {
    forward_join_142: {
    forward_join_125: {
    forward_join_118: {
    forward_join_116: {
    forward_join_77: {
    forward_join_69: {
    forward_join_58: {
    forward_join_57: {
    forward_join_56: {
    forward_join_20: {
    forward_join_18: {
    life2_3 = (__fieldRead495_0() ^ 116508422891824L);
    spill495_0 = __call495_1();
    life5_10 = __call495_5(__fieldRead495_3(__fieldRead495_2()), __call495_4(p0));
    life4_11 = spill495_0;
    spill495_1 = life5_10;
    if (!((life4_11 == 0))) {
        forwardValue495_20_0 = spill495_1;
        break forward_join_20;
    }
    if (!((__instanceOf495_6(spill495_1) == 0))) {
        break forward_join_18;
    }
    return;
    }
    forwardValue495_20_0 = __fieldRead495_7(receiver);
    }
    if (!((life4_11 == 0))) {
        forwardValue495_58_0 = forwardValue495_20_0;
        break forward_join_58;
    }
    if (!((forwardValue495_20_0 != null))) {
        break forward_join_56;
    }
    spill495_2 = __fieldRead495_8(receiver);
    if (!((life4_11 == 0))) {
        forwardValue495_58_0 = spill495_2;
        break forward_join_58;
    }
    if (!((__call495_9(spill495_2) == __call495_10(p0)))) {
        break forward_join_56;
    }
    spill495_3 = receiver;
    if (!((life4_11 == 0))) {
        forwardValue495_57_0 = spill495_3;
        break forward_join_57;
    }
    if (!(__call495_14(__cast495_13(__call495_12(__fieldRead495_11(spill495_3)))))) {
        break forward_join_56;
    }
    __fieldWrite495_21(receiver, new moom.DZ(__fieldRead495_16(__fieldRead495_15(receiver)), __fieldRead495_18(__fieldRead495_17(receiver)), __fieldRead495_20(__fieldRead495_19(receiver))));
    __fieldWrite495_23(receiver, __call495_22());
    }
    forwardValue495_57_0 = receiver;
    }
    forwardValue495_58_0 = __fieldRead495_24(forwardValue495_57_0);
    }
    if (!((life4_11 == 0))) {
        forwardValue495_77_0 = forwardValue495_58_0;
        break forward_join_77;
    }
    if (!((forwardValue495_58_0 != null))) {
        break forward_join_69;
    }
    spill495_4 = __fieldRead495_25(receiver);
    if (!((life4_11 == 0))) {
        forwardValue495_77_0 = spill495_4;
        break forward_join_77;
    }
    if (!((__call495_26(spill495_4) != __call495_27(p0)))) {
        break forward_join_210;
    }
    }
    __fieldWrite495_31(receiver, __call495_30(p0, __fieldRead495_29(__fieldRead495_28())));
    forwardValue495_77_0 = __fieldRead495_32(receiver);
    }
    if (!((life4_11 == 0))) {
        forwardValue495_118_0 = forwardValue495_77_0;
        break forward_join_118;
    }
    if (!((forwardValue495_77_0 != null))) {
        break forward_join_116;
    }
    __fieldWrite495_36(__fieldRead495_33(receiver), __fieldRead495_35(__fieldRead495_34(receiver)));
    __fieldWrite495_40(__fieldRead495_37(receiver), __fieldRead495_39(__fieldRead495_38(receiver)));
    __fieldWrite495_44(__fieldRead495_41(receiver), __fieldRead495_43(__fieldRead495_42(receiver)));
    __fieldWrite495_48(__fieldRead495_45(receiver), __fieldRead495_47(__fieldRead495_46(receiver)));
    __fieldWrite495_52(__fieldRead495_49(receiver), __fieldRead495_51(__fieldRead495_50(receiver)));
    __fieldWrite495_56(__fieldRead495_53(receiver), __fieldRead495_55(__fieldRead495_54(receiver)));
    }
    forwardValue495_118_0 = __fieldRead495_57(receiver);
    }
    life7_159 = forwardValue495_118_0;
    spill495_5 = life7_159;
    if (!((life4_11 == 0))) {
        forwardValue495_125_0 = spill495_5;
        break forward_join_125;
    }
    if (!((__instanceOf495_58(spill495_5) != 0))) {
        break forward_join_207;
    }
    forwardValue495_125_0 = life7_159;
    }
    life6_173 = __cast495_59(forwardValue495_125_0);
    spill495_6 = __fieldRead495_60(receiver);
    if (!((life4_11 == 0))) {
        forwardValue495_204_0 = spill495_6;
        break forward_join_204;
    }
    if (!((spill495_6 != null))) {
        break forward_join_142;
    }
    __call495_65(__fieldRead495_62(__fieldRead495_61()), __call495_64(__fieldRead495_63(receiver)));
    __fieldWrite495_66(receiver, null);
    }
    __fieldWrite495_70(receiver, new moom.tp(__fieldRead495_68(__fieldRead495_67()), __call495_69(life6_173)));
    __call495_75(__fieldRead495_72(__fieldRead495_71()), __invokedynamic495_73(19768, (8071006918541694318L ^ life2_3)), __fieldRead495_74(receiver));
    __call495_87(__fieldRead495_76(receiver), __fieldRead495_78(__fieldRead495_77(receiver)), __fieldRead495_80(__fieldRead495_79(receiver)), __fieldRead495_82(__fieldRead495_81(receiver)), __fieldRead495_84(__fieldRead495_83(receiver)), __fieldRead495_86(__fieldRead495_85(receiver)));
    __fieldWrite495_91(__fieldRead495_88(receiver), __fieldRead495_90(__fieldRead495_89(receiver)));
    __fieldWrite495_95(__fieldRead495_92(receiver), __fieldRead495_94(__fieldRead495_93(receiver)));
    __fieldWrite495_99(__fieldRead495_96(receiver), __fieldRead495_98(__fieldRead495_97(receiver)));
    __fieldWrite495_102(__fieldRead495_100(receiver), __fieldRead495_101(life6_173));
    forwardValue495_204_0 = __fieldRead495_103(receiver);
    }
    __fieldWrite495_105(forwardValue495_204_0, __fieldRead495_104(life6_173));
    }
    __fieldWrite495_106(receiver, 1);
    }
    return;
}
public static void h495_0(moom.Oo p0) throws Throwable {
    throw __call1049500_0(p0);
}
public static void h495_1(moom.Oo p0) throws Throwable {
    throw __call1049501_0(p0);
}
public static void h495_2(moom.Oo p0) throws Throwable {
    throw __call1049502_0(p0);
}
public static void h495_3(moom.Oo p0) throws Throwable {
    throw __call1049503_0(p0);
}
public static void h495_4(moom.Oo p0) throws Throwable {
    throw __call1049504_0(p0);
}
public static void h495_5(moom.Oo p0) throws Throwable {
    throw __call1049505_0(p0);
}
public static void h495_6(moom.Oo p0) throws Throwable {
    throw __call1049506_0(p0);
}
public static void h495_7(moom.Oo p0) throws Throwable {
    throw __call1049507_0(p0);
}
public static void h495_8(moom.Oo p0) throws Throwable {
    throw __call1049508_0(p0);
}
public static void h495_9(moom.Oo p0) throws Throwable {
    throw __call1049509_0(p0);
}
public static void h495_10(moom.Oo p0) throws Throwable {
    throw __call1049510_0(p0);
}
public static void h495_11(moom.Oo p0) throws Throwable {
    throw __call1049511_0(p0);
}
public static void h495_12(moom.Oo p0) throws Throwable {
    throw __call1049512_0(p0);
}
public static void h495_13(moom.Oo p0) throws Throwable {
    throw __call1049513_0(p0);
}
public static void h495_14(moom.Oo p0) throws Throwable {
    throw __call1049514_0(p0);
}
public static void h495_15(moom.Oo p0) throws Throwable {
    throw __call1049515_0(p0);
}
public static void h495_16(moom.Oo p0) throws Throwable {
    throw __call1049516_0(p0);
}
public static void h495_17(moom.Oo p0) throws Throwable {
    throw __call1049517_0(p0);
}
private static native long __fieldRead495_0() throws Throwable;
private static native int __call495_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead495_2() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead495_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __call495_4(moom.y6 a0) throws Throwable;
private static native net.minecraft.entity.Entity __call495_5(net.minecraft.client.multiplayer.WorldClient a0, int a1) throws Throwable;
private static native int __instanceOf495_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead495_7(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead495_8(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native int __call495_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call495_10(moom.y6 a0) throws Throwable;
private static native com.moon.setting.BooleanSetting __fieldRead495_11(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native java.lang.Object __call495_12(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native java.lang.Boolean __cast495_13(java.lang.Object a0) throws Throwable;
private static native boolean __call495_14(java.lang.Boolean a0) throws Throwable;
private static native moom.DZ __fieldRead495_15(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native double __fieldRead495_16(moom.DZ a0) throws Throwable;
private static native moom.DZ __fieldRead495_17(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native double __fieldRead495_18(moom.DZ a0) throws Throwable;
private static native moom.DZ __fieldRead495_19(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native double __fieldRead495_20(moom.DZ a0) throws Throwable;
private static native void __fieldWrite495_21(com.moon.module.impl.Backtrack a0, moom.DZ a1) throws Throwable;
private static native long __call495_22() throws Throwable;
private static native void __fieldWrite495_23(com.moon.module.impl.Backtrack a0, long a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead495_24(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead495_25(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native int __call495_26(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call495_27(moom.y6 a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead495_28() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead495_29(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.Entity __call495_30(moom.y6 a0, net.minecraft.client.multiplayer.WorldClient a1) throws Throwable;
private static native void __fieldWrite495_31(com.moon.module.impl.Backtrack a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead495_32(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native moom.DZ __fieldRead495_33(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead495_34(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native double __fieldRead495_35(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite495_36(moom.DZ a0, double a1) throws Throwable;
private static native moom.DZ __fieldRead495_37(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead495_38(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native double __fieldRead495_39(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite495_40(moom.DZ a0, double a1) throws Throwable;
private static native moom.DZ __fieldRead495_41(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead495_42(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native double __fieldRead495_43(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite495_44(moom.DZ a0, double a1) throws Throwable;
private static native moom.DZ __fieldRead495_45(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead495_46(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native double __fieldRead495_47(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite495_48(moom.DZ a0, double a1) throws Throwable;
private static native moom.DZ __fieldRead495_49(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead495_50(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native double __fieldRead495_51(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite495_52(moom.DZ a0, double a1) throws Throwable;
private static native moom.DZ __fieldRead495_53(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead495_54(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native double __fieldRead495_55(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite495_56(moom.DZ a0, double a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead495_57(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native int __instanceOf495_58(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast495_59(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.tp __fieldRead495_60(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead495_61() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead495_62(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.tp __fieldRead495_63(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native int __call495_64(moom.tp a0) throws Throwable;
private static native net.minecraft.entity.Entity __call495_65(net.minecraft.client.multiplayer.WorldClient a0, int a1) throws Throwable;
private static native void __fieldWrite495_66(com.moon.module.impl.Backtrack a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead495_67() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead495_68(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call495_69(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native void __fieldWrite495_70(com.moon.module.impl.Backtrack a0, moom.tp a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead495_71() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead495_72(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __invokedynamic495_73(int a0, long a1) throws Throwable;
private static native moom.tp __fieldRead495_74(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native void __call495_75(net.minecraft.client.multiplayer.WorldClient a0, int a1, moom.tp a2) throws Throwable;
private static native moom.tp __fieldRead495_76(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native moom.DZ __fieldRead495_77(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native double __fieldRead495_78(moom.DZ a0) throws Throwable;
private static native moom.DZ __fieldRead495_79(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native double __fieldRead495_80(moom.DZ a0) throws Throwable;
private static native moom.DZ __fieldRead495_81(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native double __fieldRead495_82(moom.DZ a0) throws Throwable;
private static native moom.tp __fieldRead495_83(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native float __fieldRead495_84(moom.tp a0) throws Throwable;
private static native moom.tp __fieldRead495_85(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native float __fieldRead495_86(moom.tp a0) throws Throwable;
private static native void __call495_87(moom.tp a0, double a1, double a2, double a3, float a4, float a5) throws Throwable;
private static native moom.tp __fieldRead495_88(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead495_89(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native int __fieldRead495_90(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite495_91(moom.tp a0, int a1) throws Throwable;
private static native moom.tp __fieldRead495_92(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead495_93(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native int __fieldRead495_94(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite495_95(moom.tp a0, int a1) throws Throwable;
private static native moom.tp __fieldRead495_96(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead495_97(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native int __fieldRead495_98(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite495_99(moom.tp a0, int a1) throws Throwable;
private static native moom.tp __fieldRead495_100(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead495_101(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native void __fieldWrite495_102(moom.tp a0, net.minecraft.entity.player.InventoryPlayer a1) throws Throwable;
private static native moom.tp __fieldRead495_103(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native moom.v8 __fieldRead495_104(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native void __fieldWrite495_105(moom.tp a0, moom.v8 a1) throws Throwable;
private static native void __fieldWrite495_106(com.moon.module.impl.Backtrack a0, int a1) throws Throwable;
private static native java.lang.Exception __call1049500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049504_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049505_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049506_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049507_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049508_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049509_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049510_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049511_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049512_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049513_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049514_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049515_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049516_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049517_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_211e38bfe4f0775938c8(com.moon.module.impl.Backtrack a0, moom.yK a1) throws E;
private static final class __SourceHandler_211e38bfe4f0775938c8 {

public static int f41(com.moon.module.impl.Backtrack receiver, moom.yK p0) throws Throwable {
    net.minecraft.entity.Entity forwardValue41_24_0;
    moom.tp forwardValue41_94_0;
    int forwardValue41_126_0;
    float forwardValue41_132_0;
    int forwardValue41_146_0;
    float forwardValue41_152_0;
    int forwardValue41_164_0;
    int forwardValue41_167_0;
    moom.tp forwardValue41_227_0;
    int forwardValue41_286_0;
    int forwardValue41_289_0;
    moom.tp forwardValue41_330_0;
    int forwardValue41_333_0;
    int spill41_0;
    net.minecraft.entity.Entity spill41_1;
    boolean spill41_2;
    moom.tp spill41_3;
    boolean spill41_4;
    boolean spill41_5;
    int spill41_6;
    moom.tp spill41_7;
    int spill41_8;
    moom.tp spill41_9;
    long life2_3;
    int life4_5;
    moom.zN life5_16;
    net.minecraft.entity.Entity life8_21;
    double life9_116;
    double life11_123;
    double life13_130;
    float life15_156;
    float life16_182;
    moom.zR life6_205;
    double life8_276;
    double life10_283;
    double life12_290;
    float life14_302;
    float life15_314;
    moom.zV life7_342;
    java.util.List life8_345;
    int life9_348;
    forward_join_333: {
    forward_join_332: {
    forward_join_330: {
    forward_join_289: {
    forward_join_287: {
    forward_join_286: {
    forward_join_285: {
    forward_join_227: {
    forward_join_167: {
    forward_join_165: {
    forward_join_164: {
    forward_join_163: {
    forward_join_152: {
    forward_join_150: {
    forward_join_146: {
    forward_join_132: {
    forward_join_130: {
    forward_join_126: {
    forward_join_94: {
    forward_join_24: {
    life2_3 = (__fieldRead41_0() ^ 70144811823530L);
    life4_5 = __call41_1();
    spill41_0 = __instanceOf41_2(p0);
    if (!((life4_5 != 0))) {
        forwardValue41_167_0 = spill41_0;
        break forward_join_167;
    }
    if (!((spill41_0 != 0))) {
        break forward_join_165;
    }
    life5_16 = __cast41_3(p0);
    life8_21 = __call41_6(life5_16, __fieldRead41_5(__fieldRead41_4()));
    spill41_1 = life8_21;
    if (!((life4_5 != 0))) {
        forwardValue41_24_0 = spill41_1;
        break forward_join_24;
    }
    if (!((spill41_1 != null))) {
        break forward_join_163;
    }
    forwardValue41_24_0 = life8_21;
    }
    spill41_2 = __call41_8(forwardValue41_24_0, __fieldRead41_7(receiver));
    if (!((life4_5 != 0))) {
        forwardValue41_164_0 = __integerCategory41_9(spill41_2);
        break forward_join_164;
    }
    if (!(spill41_2)) {
        break forward_join_163;
    }
    moom.DZ __stackOp41_11_0 = __fieldRead41_10(receiver);
    __fieldWrite41_14(__stackOp41_11_0, (__fieldRead41_12(__stackOp41_11_0) + (((double) __call41_13(life5_16)) / 0x1.0p5d)));
    moom.DZ __stackOp41_16_0 = __fieldRead41_15(receiver);
    __fieldWrite41_19(__stackOp41_16_0, (__fieldRead41_17(__stackOp41_16_0) + (((double) __call41_18(life5_16)) / 0x1.0p5d)));
    moom.DZ __stackOp41_21_0 = __fieldRead41_20(receiver);
    __fieldWrite41_24(__stackOp41_21_0, (__fieldRead41_22(__stackOp41_21_0) + (((double) __call41_23(life5_16)) / 0x1.0p5d)));
    spill41_3 = __fieldRead41_25(receiver);
    if (!((life4_5 != 0))) {
        forwardValue41_94_0 = spill41_3;
        break forward_join_94;
    }
    if (!((spill41_3 != null))) {
        break forward_join_163;
    }
    moom.tp __stackOp41_27_0 = __fieldRead41_26(receiver);
    __fieldWrite41_30(__stackOp41_27_0, (__fieldRead41_28(__stackOp41_27_0) + __call41_29(life5_16)));
    moom.tp __stackOp41_32_0 = __fieldRead41_31(receiver);
    __fieldWrite41_35(__stackOp41_32_0, (__fieldRead41_33(__stackOp41_32_0) + __call41_34(life5_16)));
    moom.tp __stackOp41_37_0 = __fieldRead41_36(receiver);
    __fieldWrite41_40(__stackOp41_37_0, (__fieldRead41_38(__stackOp41_37_0) + __call41_39(life5_16)));
    forwardValue41_94_0 = __fieldRead41_41(receiver);
    }
    life9_116 = (((double) __fieldRead41_42(forwardValue41_94_0)) / 0x1.0p5d);
    life11_123 = (((double) __fieldRead41_44(__fieldRead41_43(receiver))) / 0x1.0p5d);
    life13_130 = (((double) __fieldRead41_46(__fieldRead41_45(receiver))) / 0x1.0p5d);
    spill41_4 = __call41_47(life5_16);
    if (!((life4_5 != 0))) {
        forwardValue41_126_0 = __integerCategory41_48(spill41_4);
        break forward_join_126;
    }
    if (!(spill41_4)) {
        break forward_join_130;
    }
    forwardValue41_126_0 = (__call41_49(life5_16) * __invokedynamic41_50(17807, (7456205659819394370L ^ life2_3)));
    }
    forwardValue41_132_0 = (((float) forwardValue41_126_0) / 0x1.0p8f);
    break forward_join_132;
    }
    forwardValue41_132_0 = __fieldRead41_51(life8_21);
    }
    life15_156 = forwardValue41_132_0;
    spill41_5 = __call41_52(life5_16);
    if (!((life4_5 != 0))) {
        forwardValue41_146_0 = __integerCategory41_53(spill41_5);
        break forward_join_146;
    }
    if (!(spill41_5)) {
        break forward_join_150;
    }
    forwardValue41_146_0 = (__call41_54(life5_16) * __invokedynamic41_55(18435, (6961724182596995264L ^ life2_3)));
    }
    forwardValue41_152_0 = (((float) forwardValue41_146_0) / 0x1.0p8f);
    break forward_join_152;
    }
    forwardValue41_152_0 = __fieldRead41_56(life8_21);
    }
    life16_182 = forwardValue41_152_0;
    __call41_58(__fieldRead41_57(receiver), life9_116, life11_123, life13_130, life15_156, life16_182, 3, 1);
    }
    forwardValue41_164_0 = 1;
    }
    return forwardValue41_164_0;
    }
    forwardValue41_167_0 = __instanceOf41_59(p0);
    }
    if (!((life4_5 != 0))) {
        forwardValue41_289_0 = forwardValue41_167_0;
        break forward_join_289;
    }
    if (!((forwardValue41_167_0 != 0))) {
        break forward_join_287;
    }
    life6_205 = __cast41_60(p0);
    spill41_6 = __call41_61(life6_205);
    if (!((life4_5 != 0))) {
        forwardValue41_286_0 = spill41_6;
        break forward_join_286;
    }
    if (!((spill41_6 == __call41_63(__fieldRead41_62(receiver))))) {
        break forward_join_285;
    }
    __fieldWrite41_66(__fieldRead41_64(receiver), (((double) __call41_65(life6_205)) / 0x1.0p5d));
    __fieldWrite41_69(__fieldRead41_67(receiver), (((double) __call41_68(life6_205)) / 0x1.0p5d));
    __fieldWrite41_72(__fieldRead41_70(receiver), (((double) __call41_71(life6_205)) / 0x1.0p5d));
    spill41_7 = __fieldRead41_73(receiver);
    if (!((life4_5 != 0))) {
        forwardValue41_227_0 = spill41_7;
        break forward_join_227;
    }
    if (!((spill41_7 != null))) {
        break forward_join_285;
    }
    __fieldWrite41_76(__fieldRead41_74(receiver), __call41_75(life6_205));
    __fieldWrite41_79(__fieldRead41_77(receiver), __call41_78(life6_205));
    __fieldWrite41_82(__fieldRead41_80(receiver), __call41_81(life6_205));
    forwardValue41_227_0 = __fieldRead41_83(receiver);
    }
    life8_276 = (((double) __fieldRead41_84(forwardValue41_227_0)) / 0x1.0p5d);
    life10_283 = (((double) __fieldRead41_86(__fieldRead41_85(receiver))) / 0x1.0p5d);
    life12_290 = (((double) __fieldRead41_88(__fieldRead41_87(receiver))) / 0x1.0p5d);
    life14_302 = (((float) (__call41_89(life6_205) * __invokedynamic41_90(18435, (6961724182596995264L ^ life2_3)))) / 0x1.0p8f);
    life15_314 = (((float) (__call41_91(life6_205) * __invokedynamic41_92(18435, (6961724182596995264L ^ life2_3)))) / 0x1.0p8f);
    __call41_94(__fieldRead41_93(receiver), life8_276, life10_283, life12_290, life14_302, life15_314, 3, 1);
    __fieldWrite41_97(__fieldRead41_95(receiver), __call41_96(life6_205));
    }
    forwardValue41_286_0 = 2;
    }
    return forwardValue41_286_0;
    }
    forwardValue41_289_0 = __instanceOf41_98(p0);
    }
    if (!((life4_5 != 0))) {
        forwardValue41_333_0 = forwardValue41_289_0;
        break forward_join_333;
    }
    if (!((forwardValue41_289_0 != 0))) {
        break forward_join_332;
    }
    life7_342 = __cast41_99(p0);
    life8_345 = __call41_100(life7_342);
    life9_348 = __call41_101(life7_342);
    spill41_8 = life9_348;
    if (!((life4_5 != 0))) {
        forwardValue41_333_0 = spill41_8;
        break forward_join_333;
    }
    if (!((spill41_8 == __call41_103(__fieldRead41_102(receiver))))) {
        break forward_join_332;
    }
    spill41_9 = __fieldRead41_104(receiver);
    if (!((life4_5 != 0))) {
        forwardValue41_330_0 = spill41_9;
        break forward_join_330;
    }
    if (!((spill41_9 != null))) {
        break forward_join_332;
    }
    __call41_107(__call41_106(__fieldRead41_105(receiver)), life8_345);
    __call41_109(__fieldRead41_108(receiver), 0, 0);
    __call41_111(__fieldRead41_110(receiver), 1);
    forwardValue41_330_0 = __fieldRead41_112(receiver);
    }
    __call41_113(forwardValue41_330_0, 0);
    }
    forwardValue41_333_0 = 0;
    }
    return forwardValue41_333_0;
}
public static void h41_0(moom.Oo p0) throws Throwable {
    throw __call1004100_0(p0);
}
public static void h41_1(moom.Oo p0) throws Throwable {
    throw __call1004101_0(p0);
}
public static void h41_2(moom.Oo p0) throws Throwable {
    throw __call1004102_0(p0);
}
public static void h41_3(moom.Oo p0) throws Throwable {
    throw __call1004103_0(p0);
}
public static void h41_4(moom.Oo p0) throws Throwable {
    throw __call1004104_0(p0);
}
public static void h41_5(moom.Oo p0) throws Throwable {
    throw __call1004105_0(p0);
}
public static void h41_6(moom.Oo p0) throws Throwable {
    throw __call1004106_0(p0);
}
public static void h41_7(moom.Oo p0) throws Throwable {
    throw __call1004107_0(p0);
}
public static void h41_8(moom.Oo p0) throws Throwable {
    throw __call1004108_0(p0);
}
public static void h41_9(moom.Oo p0) throws Throwable {
    throw __call1004109_0(p0);
}
public static void h41_10(moom.Oo p0) throws Throwable {
    throw __call1004110_0(p0);
}
public static void h41_11(moom.Oo p0) throws Throwable {
    throw __call1004111_0(p0);
}
public static void h41_12(moom.Oo p0) throws Throwable {
    throw __call1004112_0(p0);
}
public static void h41_13(moom.Oo p0) throws Throwable {
    throw __call1004113_0(p0);
}
public static void h41_14(moom.Oo p0) throws Throwable {
    throw __call1004114_0(p0);
}
public static void h41_15(moom.Oo p0) throws Throwable {
    throw __call1004115_0(p0);
}
public static void h41_16(moom.Oo p0) throws Throwable {
    throw __call1004116_0(p0);
}
public static void h41_17(moom.Oo p0) throws Throwable {
    throw __call1004117_0(p0);
}
public static void h41_18(moom.Oo p0) throws Throwable {
    throw __call1004118_0(p0);
}
public static void h41_19(moom.Oo p0) throws Throwable {
    throw __call1004119_0(p0);
}
private static native long __fieldRead41_0() throws Throwable;
private static native int __call41_1() throws Throwable;
private static native int __instanceOf41_2(moom.yK a0) throws Throwable;
private static native moom.zN __cast41_3(moom.yK a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead41_4() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead41_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.Entity __call41_6(moom.zN a0, net.minecraft.client.multiplayer.WorldClient a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead41_7(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native boolean __call41_8(net.minecraft.entity.Entity a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native int __integerCategory41_9(boolean value) throws Throwable;
private static native moom.DZ __fieldRead41_10(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native double __fieldRead41_12(moom.DZ a0) throws Throwable;
private static native byte __call41_13(moom.zN a0) throws Throwable;
private static native void __fieldWrite41_14(moom.DZ a0, double a1) throws Throwable;
private static native moom.DZ __fieldRead41_15(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native double __fieldRead41_17(moom.DZ a0) throws Throwable;
private static native byte __call41_18(moom.zN a0) throws Throwable;
private static native void __fieldWrite41_19(moom.DZ a0, double a1) throws Throwable;
private static native moom.DZ __fieldRead41_20(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native double __fieldRead41_22(moom.DZ a0) throws Throwable;
private static native byte __call41_23(moom.zN a0) throws Throwable;
private static native void __fieldWrite41_24(moom.DZ a0, double a1) throws Throwable;
private static native moom.tp __fieldRead41_25(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native moom.tp __fieldRead41_26(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native int __fieldRead41_28(moom.tp a0) throws Throwable;
private static native byte __call41_29(moom.zN a0) throws Throwable;
private static native void __fieldWrite41_30(moom.tp a0, int a1) throws Throwable;
private static native moom.tp __fieldRead41_31(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native int __fieldRead41_33(moom.tp a0) throws Throwable;
private static native byte __call41_34(moom.zN a0) throws Throwable;
private static native void __fieldWrite41_35(moom.tp a0, int a1) throws Throwable;
private static native moom.tp __fieldRead41_36(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native int __fieldRead41_38(moom.tp a0) throws Throwable;
private static native byte __call41_39(moom.zN a0) throws Throwable;
private static native void __fieldWrite41_40(moom.tp a0, int a1) throws Throwable;
private static native moom.tp __fieldRead41_41(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native int __fieldRead41_42(moom.tp a0) throws Throwable;
private static native moom.tp __fieldRead41_43(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native int __fieldRead41_44(moom.tp a0) throws Throwable;
private static native moom.tp __fieldRead41_45(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native int __fieldRead41_46(moom.tp a0) throws Throwable;
private static native boolean __call41_47(moom.zN a0) throws Throwable;
private static native int __integerCategory41_48(boolean value) throws Throwable;
private static native byte __call41_49(moom.zN a0) throws Throwable;
private static native int __invokedynamic41_50(int a0, long a1) throws Throwable;
private static native float __fieldRead41_51(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call41_52(moom.zN a0) throws Throwable;
private static native int __integerCategory41_53(boolean value) throws Throwable;
private static native byte __call41_54(moom.zN a0) throws Throwable;
private static native int __invokedynamic41_55(int a0, long a1) throws Throwable;
private static native float __fieldRead41_56(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.tp __fieldRead41_57(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native void __call41_58(moom.tp a0, double a1, double a2, double a3, float a4, float a5, int a6, int a7) throws Throwable;
private static native int __instanceOf41_59(moom.yK a0) throws Throwable;
private static native moom.zR __cast41_60(moom.yK a0) throws Throwable;
private static native int __call41_61(moom.zR a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead41_62(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native int __call41_63(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.DZ __fieldRead41_64(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native int __call41_65(moom.zR a0) throws Throwable;
private static native void __fieldWrite41_66(moom.DZ a0, double a1) throws Throwable;
private static native moom.DZ __fieldRead41_67(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native int __call41_68(moom.zR a0) throws Throwable;
private static native void __fieldWrite41_69(moom.DZ a0, double a1) throws Throwable;
private static native moom.DZ __fieldRead41_70(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native int __call41_71(moom.zR a0) throws Throwable;
private static native void __fieldWrite41_72(moom.DZ a0, double a1) throws Throwable;
private static native moom.tp __fieldRead41_73(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native moom.tp __fieldRead41_74(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native int __call41_75(moom.zR a0) throws Throwable;
private static native void __fieldWrite41_76(moom.tp a0, int a1) throws Throwable;
private static native moom.tp __fieldRead41_77(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native int __call41_78(moom.zR a0) throws Throwable;
private static native void __fieldWrite41_79(moom.tp a0, int a1) throws Throwable;
private static native moom.tp __fieldRead41_80(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native int __call41_81(moom.zR a0) throws Throwable;
private static native void __fieldWrite41_82(moom.tp a0, int a1) throws Throwable;
private static native moom.tp __fieldRead41_83(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native int __fieldRead41_84(moom.tp a0) throws Throwable;
private static native moom.tp __fieldRead41_85(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native int __fieldRead41_86(moom.tp a0) throws Throwable;
private static native moom.tp __fieldRead41_87(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native int __fieldRead41_88(moom.tp a0) throws Throwable;
private static native byte __call41_89(moom.zR a0) throws Throwable;
private static native int __invokedynamic41_90(int a0, long a1) throws Throwable;
private static native byte __call41_91(moom.zR a0) throws Throwable;
private static native int __invokedynamic41_92(int a0, long a1) throws Throwable;
private static native moom.tp __fieldRead41_93(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native void __call41_94(moom.tp a0, double a1, double a2, double a3, float a4, float a5, int a6, int a7) throws Throwable;
private static native moom.tp __fieldRead41_95(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native boolean __call41_96(moom.zR a0) throws Throwable;
private static native void __fieldWrite41_97(moom.tp a0, boolean a1) throws Throwable;
private static native int __instanceOf41_98(moom.yK a0) throws Throwable;
private static native moom.zV __cast41_99(moom.yK a0) throws Throwable;
private static native java.util.List __call41_100(moom.zV a0) throws Throwable;
private static native int __call41_101(moom.zV a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead41_102(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native int __call41_103(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.tp __fieldRead41_104(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native moom.tp __fieldRead41_105(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native net.minecraft.entity.DataWatcher __call41_106(moom.tp a0) throws Throwable;
private static native void __call41_107(net.minecraft.entity.DataWatcher a0, java.util.List a1) throws Throwable;
private static native moom.tp __fieldRead41_108(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native void __call41_109(moom.tp a0, int a1, int a2) throws Throwable;
private static native moom.tp __fieldRead41_110(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native net.minecraft.entity.Entity __call41_111(moom.tp a0, int a1) throws Throwable;
private static native moom.tp __fieldRead41_112(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native void __call41_113(moom.tp a0, int a1) throws Throwable;
private static native java.lang.Exception __call1004100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004103_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004104_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004105_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004106_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004107_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004108_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004109_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004110_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004111_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004112_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004113_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004114_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004115_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004116_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004117_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004118_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004119_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_16027fed4dd6fc49d8d9(com.moon.module.impl.Backtrack a0, net.minecraft.entity.Entity a1) throws E;
private static final class __SourceHandler_16027fed4dd6fc49d8d9 {

public static boolean f497(com.moon.module.impl.Backtrack receiver, net.minecraft.entity.Entity p0) throws Throwable {
    int forwardValue497_15_0;
    int forwardValue497_24_0;
    int forwardValue497_26_0;
    int spill497_0;
    long life2_3;
    int life4_5;
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (__fieldRead497_0() ^ 640148010465L);
    life4_5 = __call497_1();
    spill497_0 = __instanceOf497_2(p0);
    if (!((life4_5 == 0))) {
        forwardValue497_15_0 = spill497_0;
        break forward_join_15;
    }
    if (!((spill497_0 == 0))) {
        break forward_join_13;
    }
    return __integerCategory497_3(0);
    }
    forwardValue497_15_0 = __call497_4(p0);
    }
    if (!((life4_5 == 0))) {
        forwardValue497_24_0 = forwardValue497_15_0;
        break forward_join_24;
    }
    if (!((forwardValue497_15_0 == __invokedynamic497_5(19768, (8070894066935941567L ^ life2_3))))) {
        break forward_join_25;
    }
    forwardValue497_24_0 = 1;
    }
    forwardValue497_26_0 = forwardValue497_24_0;
    break forward_join_26;
    }
    forwardValue497_26_0 = 0;
    }
    return __integerCategory497_6(forwardValue497_26_0);
}
public static void h497_0(moom.Oo p0) throws Throwable {
    throw __call1049700_0(p0);
}
public static void h497_1(moom.Oo p0) throws Throwable {
    throw __call1049701_0(p0);
}
public static void h497_2(moom.Oo p0) throws Throwable {
    throw __call1049702_0(p0);
}
public static void h497_3(moom.Oo p0) throws Throwable {
    throw __call1049703_0(p0);
}
private static native long __fieldRead497_0() throws Throwable;
private static native int __call497_1() throws Throwable;
private static native int __instanceOf497_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __integerCategory497_3(int value) throws Throwable;
private static native int __call497_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic497_5(int a0, long a1) throws Throwable;
private static native boolean __integerCategory497_6(int value) throws Throwable;
private static native java.lang.Exception __call1049700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049703_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_3f72fb79c6b5c7dd413c(com.moon.module.impl.Backtrack a0, moom.yK a1) throws E;
private static final class __SourceHandler_3f72fb79c6b5c7dd413c {

public static boolean f498(com.moon.module.impl.Backtrack receiver, moom.yK p0) throws Throwable {
    int forwardValue498_27_0;
    int forwardValue498_29_0;
    int forwardValue498_41_0;
    int forwardValue498_43_0;
    int forwardValue498_49_0;
    int forwardValue498_53_0;
    int forwardValue498_55_0;
    int spill498_0;
    int spill498_1;
    int spill498_2;
    int spill498_3;
    int spill498_4;
    int spill498_5;
    int spill498_6;
    long life2_3;
    int life4_5;
    int life5_50;
    int life6_73;
    forward_join_55: {
    forward_join_54: {
    forward_join_53: {
    forward_join_49: {
    forward_join_43: {
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    forward_join_29: {
    forward_join_28: {
    forward_join_27: {
    forward_join_26: {
    life2_3 = (__fieldRead498_0() ^ 137017511540475L);
    life4_5 = __call498_1();
    spill498_0 = __instanceOf498_2(p0);
    if (!((life4_5 != 0))) {
        forwardValue498_27_0 = spill498_0;
        break forward_join_27;
    }
    if (!((spill498_0 == 0))) {
        break forward_join_26;
    }
    spill498_1 = __instanceOf498_3(p0);
    if (!((life4_5 != 0))) {
        forwardValue498_27_0 = spill498_1;
        break forward_join_27;
    }
    if (!((spill498_1 == 0))) {
        break forward_join_26;
    }
    spill498_2 = __instanceOf498_4(p0);
    if (!((life4_5 != 0))) {
        forwardValue498_27_0 = spill498_2;
        break forward_join_27;
    }
    if (!((spill498_2 == 0))) {
        break forward_join_26;
    }
    spill498_3 = __instanceOf498_5(p0);
    if (!((life4_5 != 0))) {
        forwardValue498_27_0 = spill498_3;
        break forward_join_27;
    }
    if (!((spill498_3 != 0))) {
        break forward_join_28;
    }
    }
    forwardValue498_27_0 = 1;
    }
    forwardValue498_29_0 = forwardValue498_27_0;
    break forward_join_29;
    }
    forwardValue498_29_0 = 0;
    }
    life5_50 = forwardValue498_29_0;
    spill498_4 = __instanceOf498_6(p0);
    if (!((life4_5 != 0))) {
        forwardValue498_41_0 = spill498_4;
        break forward_join_41;
    }
    if (!((spill498_4 == 0))) {
        break forward_join_40;
    }
    spill498_5 = __instanceOf498_7(p0);
    if (!((life4_5 != 0))) {
        forwardValue498_41_0 = spill498_5;
        break forward_join_41;
    }
    if (!((spill498_5 != 0))) {
        break forward_join_42;
    }
    }
    forwardValue498_41_0 = 1;
    }
    forwardValue498_43_0 = forwardValue498_41_0;
    break forward_join_43;
    }
    forwardValue498_43_0 = 0;
    }
    life6_73 = forwardValue498_43_0;
    spill498_6 = life5_50;
    if (!((life4_5 != 0))) {
        forwardValue498_49_0 = spill498_6;
        break forward_join_49;
    }
    if (!((spill498_6 == 0))) {
        break forward_join_54;
    }
    forwardValue498_49_0 = life6_73;
    }
    if (!((life4_5 != 0))) {
        forwardValue498_53_0 = forwardValue498_49_0;
        break forward_join_53;
    }
    if (!((forwardValue498_49_0 == 0))) {
        break forward_join_54;
    }
    forwardValue498_53_0 = 1;
    }
    forwardValue498_55_0 = forwardValue498_53_0;
    break forward_join_55;
    }
    forwardValue498_55_0 = 0;
    }
    return __integerCategory498_8(forwardValue498_55_0);
}
public static void h498_0(moom.Oo p0) throws Throwable {
    throw __call1049800_0(p0);
}
public static void h498_1(moom.Oo p0) throws Throwable {
    throw __call1049801_0(p0);
}
public static void h498_2(moom.Oo p0) throws Throwable {
    throw __call1049802_0(p0);
}
public static void h498_3(moom.Oo p0) throws Throwable {
    throw __call1049803_0(p0);
}
public static void h498_4(moom.Oo p0) throws Throwable {
    throw __call1049804_0(p0);
}
public static void h498_5(moom.Oo p0) throws Throwable {
    throw __call1049805_0(p0);
}
public static void h498_6(moom.Oo p0) throws Throwable {
    throw __call1049806_0(p0);
}
public static void h498_7(moom.Oo p0) throws Throwable {
    throw __call1049807_0(p0);
}
public static void h498_8(moom.Oo p0) throws Throwable {
    throw __call1049808_0(p0);
}
public static void h498_9(moom.Oo p0) throws Throwable {
    throw __call1049809_0(p0);
}
public static void h498_10(moom.Oo p0) throws Throwable {
    throw __call1049810_0(p0);
}
public static void h498_11(moom.Oo p0) throws Throwable {
    throw __call1049811_0(p0);
}
private static native long __fieldRead498_0() throws Throwable;
private static native int __call498_1() throws Throwable;
private static native int __instanceOf498_2(moom.yK a0) throws Throwable;
private static native int __instanceOf498_3(moom.yK a0) throws Throwable;
private static native int __instanceOf498_4(moom.yK a0) throws Throwable;
private static native int __instanceOf498_5(moom.yK a0) throws Throwable;
private static native int __instanceOf498_6(moom.yK a0) throws Throwable;
private static native int __instanceOf498_7(moom.yK a0) throws Throwable;
private static native boolean __integerCategory498_8(int value) throws Throwable;
private static native java.lang.Exception __call1049800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049804_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049805_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049806_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049807_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049808_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049809_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049810_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049811_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f42cc96f0d9d11cce813(com.moon.module.impl.Backtrack a0, long a1) throws E;
private static final class __SourceHandler_f42cc96f0d9d11cce813 {

public static void f120(com.moon.module.impl.Backtrack receiver, long p0) throws Throwable {
    java.lang.Object lexicalValue120_49_0;
    int spill120_0;
    net.minecraft.client.network.NetHandlerPlayClient spill120_1;
    long life3_3;
    int life5_8;
    long life6_10;
    com.moon.gp life8_16;
    moom.yK life9_20;
    long life10_23;
    lexical_join_55: {
    lexical_join_52: {
    life3_3 = (__fieldRead120_0() ^ 33800631162204L);
    spill120_0 = __call120_1();
    __call120_3(__fieldRead120_2(receiver));
    life5_8 = spill120_0;
    life6_10 = __call120_4();
    lexical_cycle_11: while (true) {
    lexical_join_49: {
    lexical_join_42: {
    lexical_join_34: {
    if (!(((life8_16 = __cast120_7(__call120_6(__fieldRead120_5(receiver)))) != null))) {
        break lexical_join_52;
    }
    life9_20 = __fieldRead120_8(life8_16);
    life10_23 = __fieldRead120_9(life8_16);
    if (!((life5_8 == 0))) {
        break lexical_join_55;
    }
    if (!((__numericCompare120_10((life6_10 - life10_23), p0) < 0))) {
        break lexical_join_34;
    }
    if (!((life5_8 != 0))) {
        break lexical_join_52;
    }
    }
    spill120_1 = __call120_12(__fieldRead120_11());
    if (!((life5_8 == 0))) {
        lexicalValue120_49_0 = spill120_1;
        break lexical_join_49;
    }
    if (!((spill120_1 != null))) {
        break lexical_join_42;
    }
    __call120_14(__fieldRead120_13(), life9_20);
    }
    __fieldWrite120_16(receiver, __fieldRead120_15(life8_16));
    lexicalValue120_49_0 = __call120_18(__fieldRead120_17(receiver));
    }
    __discardScalar120_19(lexicalValue120_49_0);
    if (!((life5_8 != 0))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    __call120_21(__fieldRead120_20(receiver));
    }
    return;
}
public static void h120_0(java.lang.Exception p0) throws Throwable {
    throw __call3012000_0(p0);
}
public static void h120_1(java.lang.Exception p0) throws Throwable {
    throw __call3012001_0(p0);
}
public static void h120_2(java.lang.Exception p0) throws Throwable {
    throw __call3012002_0(p0);
}
public static void h120_3(java.lang.Exception p0) throws Throwable {
    throw __call3012003_0(p0);
}
public static void h120_4(java.lang.Exception p0) throws Throwable {
    throw __call3012004_0(p0);
}
public static void h120_5(java.lang.Exception p0, com.moon.module.impl.Backtrack p1, long p2) throws Throwable {
    java.lang.Exception life2_2;
    life2_2 = p0;
    __call3012005_0(life2_2);
    __call3012005_2(__fieldRead3012005_1(p1));
    return;
}
public static void h120_6(java.lang.Throwable p0, com.moon.module.impl.Backtrack p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3012006_1(__fieldRead3012006_0(p1));
    throw life2_2;
}
private static native long __fieldRead120_0() throws Throwable;
private static native int __call120_1() throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __fieldRead120_2(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native void __call120_3(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native long __call120_4() throws Throwable;
private static native java.util.LinkedList __fieldRead120_5(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native java.lang.Object __call120_6(java.util.LinkedList a0) throws Throwable;
private static native com.moon.gp __cast120_7(java.lang.Object a0) throws Throwable;
private static native moom.yK __fieldRead120_8(com.moon.gp a0) throws Throwable;
private static native long __fieldRead120_9(com.moon.gp a0) throws Throwable;
private static native int __numericCompare120_10(long a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead120_11() throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __call120_12(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead120_13() throws Throwable;
private static native void __call120_14(net.minecraft.client.Minecraft a0, moom.yK a1) throws Throwable;
private static native moom.DZ __fieldRead120_15(com.moon.gp a0) throws Throwable;
private static native void __fieldWrite120_16(com.moon.module.impl.Backtrack a0, moom.DZ a1) throws Throwable;
private static native java.util.LinkedList __fieldRead120_17(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native java.lang.Object __call120_18(java.util.LinkedList a0) throws Throwable;
private static native void __discardScalar120_19(java.lang.Object a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __fieldRead120_20(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native void __call120_21(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native java.lang.Exception __call3012000_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3012001_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3012002_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3012003_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3012004_0(java.lang.Exception a0) throws Throwable;
private static native void __call3012005_0(java.lang.Exception a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __fieldRead3012005_1(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native void __call3012005_2(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __fieldRead3012006_0(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native void __call3012006_1(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.Boolean __sourceHandlerCall_ddbca5dc05ab7352c32b(com.moon.module.impl.Backtrack a0) throws E;
private static final class __SourceHandler_ddbca5dc05ab7352c32b {

public static java.lang.Boolean f712(com.moon.module.impl.Backtrack receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead712_0() ^ 48119476690127L);
    return __call712_4(((__call712_2(__fieldRead712_1(receiver)) == __fieldRead712_3()) ? 1 : 0));
}
public static void h712_0(moom.Oo p0) throws Throwable {
    throw __call1071200_0(p0);
}
private static native long __fieldRead712_0() throws Throwable;
private static native com.moon.setting.ModeSetting __fieldRead712_1(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native java.lang.Object __call712_2(com.moon.setting.ModeSetting a0) throws Throwable;
private static native com.moon.bj __fieldRead712_3() throws Throwable;
private static native java.lang.Boolean __call712_4(int a0) throws Throwable;
private static native java.lang.Exception __call1071200_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.Boolean __sourceHandlerCall_a01cc88942a58e56d412(com.moon.module.impl.Backtrack a0) throws E;
private static final class __SourceHandler_a01cc88942a58e56d412 {

public static java.lang.Boolean f499(com.moon.module.impl.Backtrack receiver) throws Throwable {
    java.lang.Object forwardValue499_16_0;
    int forwardValue499_22_0;
    int forwardValue499_24_0;
    java.lang.Object spill499_0;
    boolean spill499_1;
    long life1_3;
    int life3_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_16: {
    life1_3 = (__fieldRead499_0() ^ 24105214012283L);
    life3_5 = __call499_1();
    spill499_0 = __call499_3(__fieldRead499_2(receiver));
    if (!((life3_5 != 0))) {
        forwardValue499_16_0 = spill499_0;
        break forward_join_16;
    }
    if (!((spill499_0 == __fieldRead499_4()))) {
        break forward_join_23;
    }
    forwardValue499_16_0 = __call499_6(__fieldRead499_5(receiver));
    }
    spill499_1 = __call499_8(__cast499_7(forwardValue499_16_0));
    if (!((life3_5 != 0))) {
        forwardValue499_22_0 = __integerCategory499_9(spill499_1);
        break forward_join_22;
    }
    if (!(spill499_1)) {
        break forward_join_23;
    }
    forwardValue499_22_0 = 1;
    }
    forwardValue499_24_0 = forwardValue499_22_0;
    break forward_join_24;
    }
    forwardValue499_24_0 = 0;
    }
    return __call499_10(forwardValue499_24_0);
}
public static void h499_0(moom.Oo p0) throws Throwable {
    throw __call1049900_0(p0);
}
public static void h499_1(moom.Oo p0) throws Throwable {
    throw __call1049901_0(p0);
}
public static void h499_2(moom.Oo p0) throws Throwable {
    throw __call1049902_0(p0);
}
private static native long __fieldRead499_0() throws Throwable;
private static native int __call499_1() throws Throwable;
private static native com.moon.setting.ModeSetting __fieldRead499_2(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native java.lang.Object __call499_3(com.moon.setting.ModeSetting a0) throws Throwable;
private static native com.moon.bj __fieldRead499_4() throws Throwable;
private static native com.moon.setting.BooleanSetting __fieldRead499_5(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native java.lang.Object __call499_6(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native java.lang.Boolean __cast499_7(java.lang.Object a0) throws Throwable;
private static native boolean __call499_8(java.lang.Boolean a0) throws Throwable;
private static native int __integerCategory499_9(boolean value) throws Throwable;
private static native java.lang.Boolean __call499_10(int a0) throws Throwable;
private static native java.lang.Exception __call1049900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1049902_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_16ec70afb5d61642028d(moom.yK a0) throws E;
private static final class __SourceHandler_16ec70afb5d61642028d {

public static boolean f500(moom.yK p0) throws Throwable {
    int forwardValue500_67_0;
    int forwardValue500_69_0;
    int spill500_0;
    int spill500_1;
    int spill500_2;
    int spill500_3;
    int spill500_4;
    int spill500_5;
    int spill500_6;
    int spill500_7;
    int spill500_8;
    int spill500_9;
    int spill500_10;
    int spill500_11;
    long life1_3;
    int life3_5;
    forward_join_69: {
    forward_join_68: {
    forward_join_67: {
    forward_join_66: {
    life1_3 = (__fieldRead500_0() ^ 78707423203387L);
    life3_5 = __call500_1();
    spill500_0 = __instanceOf500_2(p0);
    if (!((life3_5 != 0))) {
        forwardValue500_67_0 = spill500_0;
        break forward_join_67;
    }
    if (!((spill500_0 == 0))) {
        break forward_join_66;
    }
    spill500_1 = __instanceOf500_3(p0);
    if (!((life3_5 != 0))) {
        forwardValue500_67_0 = spill500_1;
        break forward_join_67;
    }
    if (!((spill500_1 == 0))) {
        break forward_join_66;
    }
    spill500_2 = __instanceOf500_4(p0);
    if (!((life3_5 != 0))) {
        forwardValue500_67_0 = spill500_2;
        break forward_join_67;
    }
    if (!((spill500_2 == 0))) {
        break forward_join_66;
    }
    spill500_3 = __instanceOf500_5(p0);
    if (!((life3_5 != 0))) {
        forwardValue500_67_0 = spill500_3;
        break forward_join_67;
    }
    if (!((spill500_3 == 0))) {
        break forward_join_66;
    }
    spill500_4 = __instanceOf500_6(p0);
    if (!((life3_5 != 0))) {
        forwardValue500_67_0 = spill500_4;
        break forward_join_67;
    }
    if (!((spill500_4 == 0))) {
        break forward_join_66;
    }
    spill500_5 = __instanceOf500_7(p0);
    if (!((life3_5 != 0))) {
        forwardValue500_67_0 = spill500_5;
        break forward_join_67;
    }
    if (!((spill500_5 == 0))) {
        break forward_join_66;
    }
    spill500_6 = __instanceOf500_8(p0);
    if (!((life3_5 != 0))) {
        forwardValue500_67_0 = spill500_6;
        break forward_join_67;
    }
    if (!((spill500_6 == 0))) {
        break forward_join_66;
    }
    spill500_7 = __instanceOf500_9(p0);
    if (!((life3_5 != 0))) {
        forwardValue500_67_0 = spill500_7;
        break forward_join_67;
    }
    if (!((spill500_7 == 0))) {
        break forward_join_66;
    }
    spill500_8 = __instanceOf500_10(p0);
    if (!((life3_5 != 0))) {
        forwardValue500_67_0 = spill500_8;
        break forward_join_67;
    }
    if (!((spill500_8 == 0))) {
        break forward_join_66;
    }
    spill500_9 = __instanceOf500_11(p0);
    if (!((life3_5 != 0))) {
        forwardValue500_67_0 = spill500_9;
        break forward_join_67;
    }
    if (!((spill500_9 == 0))) {
        break forward_join_66;
    }
    spill500_10 = __instanceOf500_12(p0);
    if (!((life3_5 != 0))) {
        forwardValue500_67_0 = spill500_10;
        break forward_join_67;
    }
    if (!((spill500_10 == 0))) {
        break forward_join_66;
    }
    spill500_11 = __instanceOf500_13(p0);
    if (!((life3_5 != 0))) {
        forwardValue500_67_0 = spill500_11;
        break forward_join_67;
    }
    if (!((spill500_11 != 0))) {
        break forward_join_68;
    }
    }
    forwardValue500_67_0 = 1;
    }
    forwardValue500_69_0 = forwardValue500_67_0;
    break forward_join_69;
    }
    forwardValue500_69_0 = 0;
    }
    return __integerCategory500_14(forwardValue500_69_0);
}
public static void h500_0(moom.Oo p0) throws Throwable {
    throw __call1050000_0(p0);
}
public static void h500_1(moom.Oo p0) throws Throwable {
    throw __call1050001_0(p0);
}
public static void h500_2(moom.Oo p0) throws Throwable {
    throw __call1050002_0(p0);
}
public static void h500_3(moom.Oo p0) throws Throwable {
    throw __call1050003_0(p0);
}
public static void h500_4(moom.Oo p0) throws Throwable {
    throw __call1050004_0(p0);
}
public static void h500_5(moom.Oo p0) throws Throwable {
    throw __call1050005_0(p0);
}
public static void h500_6(moom.Oo p0) throws Throwable {
    throw __call1050006_0(p0);
}
public static void h500_7(moom.Oo p0) throws Throwable {
    throw __call1050007_0(p0);
}
public static void h500_8(moom.Oo p0) throws Throwable {
    throw __call1050008_0(p0);
}
public static void h500_9(moom.Oo p0) throws Throwable {
    throw __call1050009_0(p0);
}
public static void h500_10(moom.Oo p0) throws Throwable {
    throw __call1050010_0(p0);
}
public static void h500_11(moom.Oo p0) throws Throwable {
    throw __call1050011_0(p0);
}
public static void h500_12(moom.Oo p0) throws Throwable {
    throw __call1050012_0(p0);
}
public static void h500_13(moom.Oo p0) throws Throwable {
    throw __call1050013_0(p0);
}
public static void h500_14(moom.Oo p0) throws Throwable {
    throw __call1050014_0(p0);
}
public static void h500_15(moom.Oo p0) throws Throwable {
    throw __call1050015_0(p0);
}
public static void h500_16(moom.Oo p0) throws Throwable {
    throw __call1050016_0(p0);
}
public static void h500_17(moom.Oo p0) throws Throwable {
    throw __call1050017_0(p0);
}
public static void h500_18(moom.Oo p0) throws Throwable {
    throw __call1050018_0(p0);
}
public static void h500_19(moom.Oo p0) throws Throwable {
    throw __call1050019_0(p0);
}
public static void h500_20(moom.Oo p0) throws Throwable {
    throw __call1050020_0(p0);
}
public static void h500_21(moom.Oo p0) throws Throwable {
    throw __call1050021_0(p0);
}
public static void h500_22(moom.Oo p0) throws Throwable {
    throw __call1050022_0(p0);
}
private static native long __fieldRead500_0() throws Throwable;
private static native int __call500_1() throws Throwable;
private static native int __instanceOf500_2(moom.yK a0) throws Throwable;
private static native int __instanceOf500_3(moom.yK a0) throws Throwable;
private static native int __instanceOf500_4(moom.yK a0) throws Throwable;
private static native int __instanceOf500_5(moom.yK a0) throws Throwable;
private static native int __instanceOf500_6(moom.yK a0) throws Throwable;
private static native int __instanceOf500_7(moom.yK a0) throws Throwable;
private static native int __instanceOf500_8(moom.yK a0) throws Throwable;
private static native int __instanceOf500_9(moom.yK a0) throws Throwable;
private static native int __instanceOf500_10(moom.yK a0) throws Throwable;
private static native int __instanceOf500_11(moom.yK a0) throws Throwable;
private static native int __instanceOf500_12(moom.yK a0) throws Throwable;
private static native int __instanceOf500_13(moom.yK a0) throws Throwable;
private static native boolean __integerCategory500_14(int value) throws Throwable;
private static native java.lang.Exception __call1050000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050003_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050004_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050005_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050006_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050007_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050008_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050009_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050010_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050011_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050012_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050013_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050014_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050015_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050016_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050017_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050018_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050019_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050020_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050021_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050022_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_9768db01df0457e82bb8(com.moon.module.impl.Backtrack a0) throws E;
private static final class __SourceHandler_9768db01df0457e82bb8 {

public static void f501(com.moon.module.impl.Backtrack receiver) throws Throwable {
    net.minecraft.client.entity.EntityPlayerSP forwardValue501_15_0;
    net.minecraft.client.Minecraft forwardValue501_18_0;
    com.moon.module.impl.Backtrack forwardValue501_37_0;
    net.minecraft.client.entity.EntityPlayerSP spill501_0;
    net.minecraft.client.Minecraft spill501_1;
    com.moon.module.impl.Backtrack spill501_2;
    long life1_3;
    int life3_5;
    forward_join_37: {
    forward_join_36: {
    forward_join_21: {
    forward_join_20: {
    forward_join_18: {
    forward_join_15: {
    life1_3 = (__fieldRead501_0() ^ 110145547632463L);
    life3_5 = __call501_1();
    spill501_0 = __fieldRead501_3(__fieldRead501_2());
    if (!((life3_5 != 0))) {
        forwardValue501_15_0 = spill501_0;
        break forward_join_15;
    }
    if (!((spill501_0 != null))) {
        break forward_join_20;
    }
    spill501_1 = __fieldRead501_4();
    if (!((life3_5 != 0))) {
        forwardValue501_18_0 = spill501_1;
        break forward_join_18;
    }
    forwardValue501_15_0 = __fieldRead501_5(spill501_1);
    }
    if (!((!__fieldRead501_6(forwardValue501_15_0)))) {
        break forward_join_20;
    }
    forwardValue501_18_0 = __fieldRead501_7();
    }
    if (!((__fieldRead501_8(forwardValue501_18_0) == null))) {
        break forward_join_21;
    }
    }
    return;
    }
    spill501_2 = receiver;
    if (!((life3_5 != 0))) {
        forwardValue501_37_0 = spill501_2;
        break forward_join_37;
    }
    if (!((__fieldRead501_9(spill501_2) != null))) {
        break forward_join_36;
    }
    __call501_14(__fieldRead501_11(__fieldRead501_10()), __call501_13(__fieldRead501_12(receiver)));
    __fieldWrite501_15(receiver, null);
    }
    forwardValue501_37_0 = receiver;
    }
    __call501_16(forwardValue501_37_0);
    return;
}
public static void h501_0(moom.Oo p0) throws Throwable {
    throw __call1050100_0(p0);
}
public static void h501_1(moom.Oo p0) throws Throwable {
    throw __call1050101_0(p0);
}
public static void h501_2(moom.Oo p0) throws Throwable {
    throw __call1050102_0(p0);
}
public static void h501_3(moom.Oo p0) throws Throwable {
    throw __call1050103_0(p0);
}
public static void h501_4(moom.Oo p0) throws Throwable {
    throw __call1050104_0(p0);
}
public static void h501_5(moom.Oo p0) throws Throwable {
    throw __call1050105_0(p0);
}
public static void h501_6(moom.Oo p0) throws Throwable {
    throw __call1050106_0(p0);
}
private static native long __fieldRead501_0() throws Throwable;
private static native int __call501_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead501_2() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead501_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead501_4() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead501_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead501_6(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead501_7() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead501_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.tp __fieldRead501_9(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead501_10() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead501_11(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.tp __fieldRead501_12(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native int __call501_13(moom.tp a0) throws Throwable;
private static native net.minecraft.entity.Entity __call501_14(net.minecraft.client.multiplayer.WorldClient a0, int a1) throws Throwable;
private static native void __fieldWrite501_15(com.moon.module.impl.Backtrack a0, java.lang.Object a1) throws Throwable;
private static native void __call501_16(com.moon.module.impl.Backtrack a0) throws Throwable;
private static native java.lang.Exception __call1050100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050103_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050104_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050105_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050106_0(moom.Oo a0) throws Throwable;

}


private void b(long p0) { __sourceHandlerCall_f42cc96f0d9d11cce813(this, p0); }


private static java.lang.Exception c(java.lang.Exception p0) {
return p0;
}


private static java.lang.String c(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 31362);
    if (((com.moon.module.impl.Backtrack.O)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.Backtrack.P)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.Backtrack.P)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/lg", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.Backtrack.N)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.Backtrack.O)[life5_8] = com.moon.module.impl.Backtrack.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.Backtrack.O)[life5_8];
}


private static java.lang.String c(byte[] p0) {
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
        byte[] spill1035_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1035_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1035_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1035_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1035_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1035_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public void onEnable() {
this.G = ((net.minecraft.entity.Entity)(null));
    return;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2368_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lg"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.Backtrack.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private void f() {
this.D = ((long)(java.lang.System.currentTimeMillis()));
    ((com.moon.module.impl.Backtrack)(this)).b(((long)(0L)));
    return;
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.module.impl.Backtrack.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void onDisable() { __sourceHandlerCall_9768db01df0457e82bb8(this); }


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2370_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lg"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 30778;
      if (R[var3] == null) {
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
         long var5 = Q[var3];
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
         Object[] var9 = (Object[])S.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               S.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/lg", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         R[var3] = var15;
      }

      return R[var3];
}


private void a(long p0) { __sourceHandlerCall_63526984c91966780e98(this, p0); }


public void a(com.moon.eb p0) {
long life2_3;
    life2_3 = (com.moon.module.impl.Backtrack.M ^ 140486991561742L);
    try {
        if (__sourceExactCall_da281af9cac729(((com.moon.module.impl.Backtrack)(this)), ((net.minecraft.entity.Entity)(__sourceExactCall_43f93e53ef1f98(((com.moon.eb)(p0))))))) {
        ((com.moon.eb)(p0)).setCancelled(((boolean)(true)));
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw com.moon.module.impl.Backtrack.c(((java.lang.Exception)(caught_rethrow_0)));
    }
    return;
}


public void a(com.moon.event.EntityRenderEvent p0) {
long life2_3;
    life2_3 = (com.moon.module.impl.Backtrack.M ^ 104986041138384L);
    try {
        if (((com.moon.module.impl.Backtrack)(this)).a(((net.minecraft.entity.Entity)(((com.moon.event.EntityRenderEvent)(p0)).getEntity())))) {
        ((com.moon.event.EntityRenderEvent)(p0)).setCancelled(((boolean)(true)));
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw com.moon.module.impl.Backtrack.c(((java.lang.Exception)(caught_rethrow_0)));
    }
    return;
}


public void a(com.moon.event.EntityEvent p0) {
long life2_3;
    life2_3 = (com.moon.module.impl.Backtrack.M ^ 128822509684065L);
    try {
        if (((com.moon.module.impl.Backtrack)(this)).a(((net.minecraft.entity.Entity)(((com.moon.event.EntityEvent)(p0)).getEntity())))) {
        ((com.moon.event.EntityEvent)(p0)).setCancelled(((boolean)(true)));
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw com.moon.module.impl.Backtrack.c(((java.lang.Exception)(caught_rethrow_0)));
    }
    return;
}


public void a(com.moon.ee p0) {
long life2_3;
    life2_3 = (com.moon.module.impl.Backtrack.M ^ 52713746597481L);
    try {
        if (__sourceExactCall_da281af9cac729(((com.moon.module.impl.Backtrack)(this)), ((net.minecraft.entity.Entity)(__sourceExactCall_92a35836030faa(((com.moon.ee)(p0))))))) {
        ((com.moon.ee)(p0)).setCancelled(((boolean)(true)));
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw com.moon.module.impl.Backtrack.c(((java.lang.Exception)(caught_rethrow_0)));
    }
    return;
}


private boolean a__Boolean(moom.yK<?> p0) { return __sourceHandlerCall_3f72fb79c6b5c7dd413c(this, p0); }


public void a(com.moon.event.MoveEvent p0) { __sourceHandlerCall_c2bd231dd7e9e76da449(this, p0); }


public void a(com.moon.event.PacketEvent p0) { __sourceHandlerCall_65175c4547eddea944c2(this, p0); }


public void a(com.moon.eQ p0) { __sourceHandlerCall_f643c0ad3b6a77ead1a2(this, p0); }


public void a(com.moon.event.Render2DEvent p0) { __sourceHandlerCall_10d6b228736edf10565c(this, p0); }


private void a(moom.y6 p0) { __sourceHandlerCall_23fba9fc1e6f3c8b6824(this, p0); }


private boolean a(net.minecraft.entity.Entity p0) { return __sourceHandlerCall_16027fed4dd6fc49d8d9(this, p0); }


private double a(moom.DZ p0, moom.DZ p1) {
double local3 = (((moom.DZ)(p0)).a - ((moom.DZ)(p1)).a);
    double local5 = (((moom.DZ)(p0)).c - ((moom.DZ)(p1)).c);
    return java.lang.Math.sqrt(((double)(((local3 * local3) + (local5 * local5)))));
}


private int a(moom.yK<?> p0) { return __sourceHandlerCall_211e38bfe4f0775938c8(this, p0); }


private void g() {
((moom.DZ)(this.F)).a = ((double)(((moom.DZ)(this.C)).a));
    ((moom.DZ)(this.F)).b = ((double)(((moom.DZ)(this.C)).b));
    ((moom.DZ)(this.F)).c = ((double)(((moom.DZ)(this.C)).c));
    return;
}


private java.lang.Boolean lambda$new$0() { return __sourceHandlerCall_ddbca5dc05ab7352c32b(this); }


private java.lang.Boolean lambda$new$1() { return __sourceHandlerCall_a01cc88942a58e56d412(this); }


private static boolean lambda$new$2(moom.yK p0) { return __sourceHandlerCall_16ec70afb5d61642028d(p0); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2368_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2370_0() throws E;

private static native boolean __sourceExactCall_da281af9cac729(com.moon.module.impl.Backtrack p0, net.minecraft.entity.Entity p1);
private static native net.minecraft.entity.Entity __sourceExactCall_43f93e53ef1f98(com.moon.eb p0);
private static native net.minecraft.entity.Entity __sourceExactCall_92a35836030faa(com.moon.ee p0);
}
