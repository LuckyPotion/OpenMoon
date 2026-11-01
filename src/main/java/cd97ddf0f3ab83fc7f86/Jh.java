package moom;


public class Jh {

private static long a;

private static java.lang.String[] b;

private static java.lang.String[] c;

private static java.util.Map d;

private static long e;

private static long f;

public Jh() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(-341221709947733191L)), ((long)(4711013928366556308L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(123771303638258L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    long local10_life7 = (moom.Jh.a ^ 4731492039360L);
    javax.crypto.Cipher local12_life9;
    javax.crypto.Cipher __sourceSpill610_11 = (local12_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill610_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill610_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill610_14 = new byte[8];
    (__sourceSpill610_14)[0] = ((byte) ((int) (local10_life7 >>> 56)));
    int local13_life15 = 1;
    while ((local13_life15 < 8)) {
        (__sourceSpill610_14)[local13_life15] = ((byte) ((int) ((local10_life7 << (local13_life15 * 8)) >>> 56)));
        local13_life15 += 1;
    }
    byte[] __sourcePreallocation610_16 = __sourceSpill610_14;
    ((javax.crypto.Cipher)(__sourceSpill610_11)).init(((int)(__sourceSpill610_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill610_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation610_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local19_life19 = new java.lang.String[25];
    int local17_life20 = 0;
    java.lang.String local16_life21;
    int local18_life23 = ((java.lang.String)((local16_life21 = " /«\016²J3g|çKÜ%î\030¨e9ÈµPt!êo.\035·-òñ\fß×þ,ã8øE(9ý¤JÄÕB¼¾í7MH¬@ùÀhK\035t»¾ú]¢PôbLN¶\033õ\0273 £²\t;\\²O»Í!\037óÊ*\020±~¤¡×7ÕN:\fVN\025Õ¶0â\004pu>ÒûÀåÚÞÜo\b)¶â\022\r¡Þ\0309o\00473öêå}=CnÂ¬§hsé\037Ûé[\020µfYb=³\037»\005éçà7\030e\000\027ÚFÃ0Å>£\037éï\t+\036\025T/\bMðc(ó:Ñj)5¨¦èZÍÀ¿ëèk\t\031þ©z\023_4uj¢8/Y\004\030Áü¥Ý(Þ\026I­î1i v\001Yßt©\177¦|`A|!Å¿»0¿¶É#\177Ðê\001\006\t\030\003:9§\034!û(6÷«ùé.wª¨»_\004H\030W®\007=zÊ8ÛXw\0349\f\f^é­ÚìÒ=\030úü¾ç¨G²@ð\n\016m ¼Ê¨x\036A#(Ù\032÷Í¯Uþ@Ü\007b»}4Y\034\025Zx@\bûT:JÿfÐæµ5\t{´ Ä\030Xt¢¡\035OäÅ\002\r¡\177\005Ç\016.¡¾*Ñp\0308Z­¥ZªW\037ÝRÃTÈ7Ú!|(¨EÕ1¡h5â:áç·aÀÁ\034*S½ÈûÃGY.~ìù\027Aàß ý¦B\021äh£V¦~ç\023a^ûæ\025P*¬\002\002öÍ*£µ¤\020y:\032¢A}G-x+|äéO\025\020¤HÝi\f\007sqùH\005tô§\024¿\020!\037d&;xCß:fUm|\027\020ãí6§\027=¾8{ç\t¼ób² Êt+)Ü[2Qãò0ãÉ%¾nê\037iO¹\013*\0377Üáÿ\032\037\020I\"_\023R¶ÌI¶Bl²á@"))).length();
    int local15_life24 = 16;
    int local14_life25 = -1;
    while (true) {
        local14_life25 += 1;
        byte[] __sourceSpill610_28 = ((java.lang.String)(((java.lang.String)(local16_life21)).substring(((int)(local14_life25)), ((int)((local14_life25 + local15_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill610_29 = local12_life9;
        byte[] local20_life31 = ((javax.crypto.Cipher)(__sourceSpill610_29)).doFinal(((byte[])(__sourceSpill610_28)));
        java.lang.String __sourceSpill610_34 = ((java.lang.String)(moom.Jh.a(((byte[])(local20_life31))))).intern();
        java.lang.String[] __sourceSpill610_35 = local19_life19;
        int __sourceSpill610_36 = local17_life20;
        local17_life20 += 1;
        (__sourceSpill610_35)[__sourceSpill610_36] = __sourceSpill610_34;
        if (!(((local14_life25 = (local14_life25 + local15_life24)) < local18_life23))) { break; }
        local15_life24 = ((java.lang.String)(local16_life21)).charAt(((int)(local14_life25)));
    }
    local18_life23 = ((java.lang.String)((local16_life21 = "o\005½3h\r±ÎINò\016\020\030\"0m±\024d£KCH@kí]Ò­¡é]8n"))).length();
    local15_life24 = 16;
    local14_life25 = -1;
    while (true) {
        local14_life25 += 1;
        byte[] __sourceSpill610_41 = ((java.lang.String)(((java.lang.String)(local16_life21)).substring(((int)(local14_life25)), ((int)((local14_life25 + local15_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill610_42 = local12_life9;
        byte[] local20_life44 = ((javax.crypto.Cipher)(__sourceSpill610_42)).doFinal(((byte[])(__sourceSpill610_41)));
        java.lang.String __sourceSpill610_47 = ((java.lang.String)(moom.Jh.a(((byte[])(local20_life44))))).intern();
        java.lang.String[] __sourceSpill610_48 = local19_life19;
        int __sourceSpill610_49 = local17_life20;
        local17_life20 += 1;
        (__sourceSpill610_48)[__sourceSpill610_49] = __sourceSpill610_47;
        if (!(((local14_life25 = (local14_life25 + local15_life24)) < local18_life23))) { break; }
        local15_life24 = ((java.lang.String)(local16_life21)).charAt(((int)(local14_life25)));
    }
    b = ((java.lang.String[])(local19_life19));
    c = ((java.lang.String[])(new java.lang.String[25]));
    javax.crypto.Cipher local5_life54;
    javax.crypto.Cipher __sourceSpill610_56 = (local5_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill610_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill610_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill610_59 = new byte[8];
    (__sourceSpill610_59)[0] = ((byte) ((int) (local10_life7 >>> 56)));
    int local6_life60 = 1;
    while ((local6_life60 < 8)) {
        (__sourceSpill610_59)[local6_life60] = ((byte) ((int) ((local10_life7 << (local6_life60 * 8)) >>> 56)));
        local6_life60 += 1;
    }
    byte[] __sourcePreallocation610_61 = __sourceSpill610_59;
    ((javax.crypto.Cipher)(__sourceSpill610_56)).init(((int)(__sourceSpill610_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill610_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation610_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local7_life64 = -8371263252539238330L;
    byte[] __sourceSpill610_65 = new byte[8];
    (__sourceSpill610_65)[0] = ((byte) ((int) (local7_life64 >>> 56)));
    (__sourceSpill610_65)[1] = ((byte) ((int) (local7_life64 >>> 48)));
    (__sourceSpill610_65)[2] = ((byte) ((int) (local7_life64 >>> 40)));
    (__sourceSpill610_65)[3] = ((byte) ((int) (local7_life64 >>> 32)));
    (__sourceSpill610_65)[4] = ((byte) ((int) (local7_life64 >>> 24)));
    (__sourceSpill610_65)[5] = ((byte) ((int) (local7_life64 >>> 16)));
    (__sourceSpill610_65)[6] = ((byte) ((int) (local7_life64 >>> 8)));
    (__sourceSpill610_65)[7] = ((byte) ((int) local7_life64));
    javax.crypto.Cipher __sourceSpill610_66 = local5_life54;
    byte[] local9_life68 = ((javax.crypto.Cipher)(__sourceSpill610_66)).doFinal(((byte[])(__sourceSpill610_65)));
    e = ((long)((((((((((((long) (local9_life68)[0]) & 255L) << 56) | ((((long) (local9_life68)[1]) & 255L) << 48)) | ((((long) (local9_life68)[2]) & 255L) << 40)) | ((((long) (local9_life68)[3]) & 255L) << 32)) | ((((long) (local9_life68)[4]) & 255L) << 24)) | ((((long) (local9_life68)[5]) & 255L) << 16)) | ((((long) (local9_life68)[6]) & 255L) << 8)) | (((long) (local9_life68)[7]) & 255L))));
    javax.crypto.Cipher local0_life71;
    javax.crypto.Cipher __sourceSpill610_73 = (local0_life71 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill610_74 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill610_75 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill610_76 = new byte[8];
    (__sourceSpill610_76)[0] = ((byte) ((int) (local10_life7 >>> 56)));
    int local1_life77 = 1;
    while ((local1_life77 < 8)) {
        (__sourceSpill610_76)[local1_life77] = ((byte) ((int) ((local10_life7 << (local1_life77 * 8)) >>> 56)));
        local1_life77 += 1;
    }
    byte[] __sourcePreallocation610_78 = __sourceSpill610_76;
    ((javax.crypto.Cipher)(__sourceSpill610_73)).init(((int)(__sourceSpill610_74)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill610_75)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation610_78)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life81 = 4305463564675871807L;
    byte[] __sourceSpill610_82 = new byte[8];
    (__sourceSpill610_82)[0] = ((byte) ((int) (local2_life81 >>> 56)));
    (__sourceSpill610_82)[1] = ((byte) ((int) (local2_life81 >>> 48)));
    (__sourceSpill610_82)[2] = ((byte) ((int) (local2_life81 >>> 40)));
    (__sourceSpill610_82)[3] = ((byte) ((int) (local2_life81 >>> 32)));
    (__sourceSpill610_82)[4] = ((byte) ((int) (local2_life81 >>> 24)));
    (__sourceSpill610_82)[5] = ((byte) ((int) (local2_life81 >>> 16)));
    (__sourceSpill610_82)[6] = ((byte) ((int) (local2_life81 >>> 8)));
    (__sourceSpill610_82)[7] = ((byte) ((int) local2_life81));
    javax.crypto.Cipher __sourceSpill610_83 = local0_life71;
    byte[] local4_life85 = ((javax.crypto.Cipher)(__sourceSpill610_83)).doFinal(((byte[])(__sourceSpill610_82)));
    f = ((long)((((((((((((long) (local4_life85)[0]) & 255L) << 56) | ((((long) (local4_life85)[1]) & 255L) << 48)) | ((((long) (local4_life85)[2]) & 255L) << 40)) | ((((long) (local4_life85)[3]) & 255L) << 32)) | ((((long) (local4_life85)[4]) & 255L) << 24)) | ((((long) (local4_life85)[5]) & 255L) << 16)) | ((((long) (local4_life85)[6]) & 255L) << 8)) | (((long) (local4_life85)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceHandlerCall_96d257e2943d15315741(moom.qY a0, moom.qZ a1) throws E;
private static final class __SourceHandler_96d257e2943d15315741 {

public static void f308(moom.qY p0, moom.qZ p1) throws Throwable {
    java.lang.Throwable spill308_0;
    java.lang.Throwable joinValue308_0_0;
    java.lang.Class spill308_1;
    java.lang.Class joinValue308_1_0;
    net.minecraft.client.settings.GameSettings spill308_2;
    net.minecraft.client.settings.GameSettings joinValue308_2_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    java.lang.Throwable life5_8;
    net.minecraft.client.settings.GameSettings life6_41;
    java.lang.String life7_59;
    java.lang.String life8_62;
    byte[] life9_66;
    moom.LW life10_68;
    java.util.HashMap life11_72;
    moom.Oy life12_99;
    life2_3 = (__fieldRead308_0() ^ 4302451301960L);
    life4_5 = __call308_1();
    life5_8 = __call308_2(p0);
    spill308_0 = life5_8;
    if ((life4_5 != null)) {
        if ((spill308_0 == null)) {
        return;
    }
        joinValue308_0_0 = life5_8;
    } else {
        joinValue308_0_0 = spill308_0;
    }
    spill308_1 = __call308_3(joinValue308_0_0);
    if ((life4_5 != null)) {
        if (__call308_6(__call308_4(spill308_1), __invokedynamic308_5(11351, (9073464116591338858L ^ life2_3)))) {
        return;
    }
        joinValue308_1_0 = __call308_7(life5_8);
    } else {
        joinValue308_1_0 = spill308_1;
    }
    if ((joinValue308_1_0 == __classLiteral308_8())) {
        return;
    }
    __call308_9(p1);
    life6_41 = __call308_10();
    spill308_2 = life6_41;
    if ((life4_5 != null)) {
        if ((spill308_2 == null)) {
        return;
    }
        joinValue308_2_0 = life6_41;
    } else {
        joinValue308_2_0 = spill308_2;
    }
    if ((!__fieldRead308_11(joinValue308_2_0))) {
        return;
    }
    life7_59 = __invokedynamic308_12(20211, (2303268132208429000L ^ life2_3));
    life8_62 = __call308_13(p0);
    life9_66 = __call308_15(life8_62, __fieldRead308_14());
    life10_68 = __invokedynamic308_16();
    life11_72 = new java.util.HashMap();
    __call308_19(life11_72, __invokedynamic308_17(25194, (8622547145609734976L ^ life2_3)), __call308_18());
    __call308_22(life11_72, __invokedynamic308_20(24006, (2654608348251444468L ^ life2_3)), __call308_21(p0));
    life12_99 = new moom.Oy(life7_59, life11_72, life9_66, life10_68);
    __call308_24(life12_99, ((int) __fieldRead308_23()));
    __call308_25(life12_99);
    __call308_27(__fieldRead308_26());
    return;
}
public static void h308_0(java.lang.Exception p0) throws Throwable {
    throw __call2030800_0(p0);
}
public static void h308_1(java.lang.Exception p0) throws Throwable {
    throw __call2030801_0(p0);
}
public static void h308_2(java.lang.Exception p0) throws Throwable {
    throw __call2030802_0(p0);
}
public static void h308_3(java.lang.Exception p0, long p1) throws Throwable {
    java.lang.Exception local3 = p0;
    java.lang.String spill2030803_0 = __call2030803_1(__call2030803_0(local3));
    java.lang.String __stackOp2030803_4_0 = __call2030803_2(local3);
    java.lang.String __stackOp2030803_4_1 = __invokedynamic2030803_3(4394, (4357154193245083669L ^ p1));
    __call2030803_6(__invokedynamic2030803_5(spill2030803_0, __stackOp2030803_4_1, __stackOp2030803_4_0));
    return;
}
private static native long __fieldRead308_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call308_1() throws Throwable;
private static native java.lang.Throwable __call308_2(moom.qY a0) throws Throwable;
private static native java.lang.Class __call308_3(java.lang.Throwable a0) throws Throwable;
private static native java.lang.String __call308_4(java.lang.Class a0) throws Throwable;
private static native java.lang.String __invokedynamic308_5(int a0, long a1) throws Throwable;
private static native boolean __call308_6(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.Class __call308_7(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Object __classLiteral308_8() throws Throwable;
private static native void __call308_9(moom.qZ a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __call308_10() throws Throwable;
private static native boolean __fieldRead308_11(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.String __invokedynamic308_12(int a0, long a1) throws Throwable;
private static native java.lang.String __call308_13(moom.qY a0) throws Throwable;
private static native java.nio.charset.Charset __fieldRead308_14() throws Throwable;
private static native byte[] __call308_15(java.lang.String a0, java.nio.charset.Charset a1) throws Throwable;
private static native moom.LW __invokedynamic308_16() throws Throwable;
private static native java.lang.String __invokedynamic308_17(int a0, long a1) throws Throwable;
private static native java.lang.String __call308_18() throws Throwable;
private static native java.lang.Object __call308_19(java.util.HashMap a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic308_20(int a0, long a1) throws Throwable;
private static native java.lang.String __call308_21(moom.qY a0) throws Throwable;
private static native java.lang.Object __call308_22(java.util.HashMap a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native long __fieldRead308_23() throws Throwable;
private static native void __call308_24(moom.Oy a0, int a1) throws Throwable;
private static native void __call308_25(moom.Oy a0) throws Throwable;
private static native long __fieldRead308_26() throws Throwable;
private static native void __call308_27(long a0) throws Throwable;
private static native java.lang.Exception __call2030800_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2030801_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2030802_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Class __call2030803_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __call2030803_1(java.lang.Class a0) throws Throwable;
private static native java.lang.String __call2030803_2(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __invokedynamic2030803_3(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic2030803_5(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call2030803_6(java.lang.String a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_45c139ecda986409d8ac(moom.qZ a0) throws E;
private static final class __SourceHandler_45c139ecda986409d8ac {

public static void f1253(moom.qZ p0) throws Throwable {
    long life1_3;
    net.minecraft.entity.Entity[] life3_13;
    life1_3 = (__fieldRead1253_0() ^ 136484713439072L);
    net.minecraft.entity.Entity[] spill1253_0 = __call1253_1();
    __call1253_4(p0, __invokedynamic1253_2(10209, (7823627151622631422L ^ life1_3)), __call1253_3());
    life3_13 = spill1253_0;
    __call1253_7(p0, __invokedynamic1253_5(31961, (5090239931328115911L ^ life1_3)), __call1253_6());
    if ((life3_13 != null)) {
        if ((__call1253_8() != null)) {
        __call1253_12(p0, __invokedynamic1253_9(31262, (1522031282383532558L ^ life1_3)), __invokedynamic1253_11(__call1253_10()));
        __call1253_16(p0, __invokedynamic1253_13(26444, (8395245656819511113L ^ life1_3)), __invokedynamic1253_15(__call1253_14()));
        __call1253_20(p0, __invokedynamic1253_17(27220, (4275506373978530380L ^ life1_3)), __invokedynamic1253_19(__call1253_18()));
        __call1253_24(p0, __invokedynamic1253_21(5473, (937914240558783864L ^ life1_3)), __invokedynamic1253_23(__call1253_22()));
        __call1253_28(p0, __invokedynamic1253_25(28843, (1824828700999923894L ^ life1_3)), __invokedynamic1253_27(__call1253_26()));
    }
        __call1253_32(p0, __invokedynamic1253_29(32033, (7531536844413777191L ^ life1_3)), __invokedynamic1253_31(__call1253_30()));
        __call1253_36(p0, __invokedynamic1253_33(12062, (7369894524082120456L ^ life1_3)), __invokedynamic1253_35(__fieldRead1253_34()));
        __call1253_40(p0, __invokedynamic1253_37(29467, (8662127889895078684L ^ life1_3)), __invokedynamic1253_39(__fieldRead1253_38()));
        __call1253_44(p0, __invokedynamic1253_41(19670, (4767026923226268871L ^ life1_3)), __invokedynamic1253_43(__fieldRead1253_42()));
        __call1253_48(p0, __invokedynamic1253_45(3607, (5088266074635519512L ^ life1_3)), __invokedynamic1253_47(__call1253_46()));
    }
    return;
}
public static void h1253_0(moom.Oo p0) throws Throwable {
    throw __call1125300_0(p0);
}
public static void h1253_1(moom.Oo p0) throws Throwable {
    throw __call1125301_0(p0);
}
private static native long __fieldRead1253_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call1253_1() throws Throwable;
private static native java.lang.String __invokedynamic1253_2(int a0, long a1) throws Throwable;
private static native java.lang.String __call1253_3() throws Throwable;
private static native void __call1253_4(moom.qZ a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic1253_5(int a0, long a1) throws Throwable;
private static native java.lang.String __call1253_6() throws Throwable;
private static native void __call1253_7(moom.qZ a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __call1253_8() throws Throwable;
private static native java.lang.String __invokedynamic1253_9(int a0, long a1) throws Throwable;
private static native int __call1253_10() throws Throwable;
private static native java.lang.String __invokedynamic1253_11(int a0) throws Throwable;
private static native void __call1253_12(moom.qZ a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic1253_13(int a0, long a1) throws Throwable;
private static native int __call1253_14() throws Throwable;
private static native java.lang.String __invokedynamic1253_15(int a0) throws Throwable;
private static native void __call1253_16(moom.qZ a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic1253_17(int a0, long a1) throws Throwable;
private static native int __call1253_18() throws Throwable;
private static native java.lang.String __invokedynamic1253_19(int a0) throws Throwable;
private static native void __call1253_20(moom.qZ a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic1253_21(int a0, long a1) throws Throwable;
private static native int __call1253_22() throws Throwable;
private static native java.lang.String __invokedynamic1253_23(int a0) throws Throwable;
private static native void __call1253_24(moom.qZ a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic1253_25(int a0, long a1) throws Throwable;
private static native boolean __call1253_26() throws Throwable;
private static native java.lang.String __invokedynamic1253_27(boolean a0) throws Throwable;
private static native void __call1253_28(moom.qZ a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic1253_29(int a0, long a1) throws Throwable;
private static native java.lang.String __call1253_30() throws Throwable;
private static native java.lang.String __invokedynamic1253_31(java.lang.String a0) throws Throwable;
private static native void __call1253_32(moom.qZ a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic1253_33(int a0, long a1) throws Throwable;
private static native java.lang.String __fieldRead1253_34() throws Throwable;
private static native java.lang.String __invokedynamic1253_35(java.lang.String a0) throws Throwable;
private static native void __call1253_36(moom.qZ a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic1253_37(int a0, long a1) throws Throwable;
private static native java.lang.String __fieldRead1253_38() throws Throwable;
private static native java.lang.String __invokedynamic1253_39(java.lang.String a0) throws Throwable;
private static native void __call1253_40(moom.qZ a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic1253_41(int a0, long a1) throws Throwable;
private static native java.lang.String __fieldRead1253_42() throws Throwable;
private static native java.lang.String __invokedynamic1253_43(java.lang.String a0) throws Throwable;
private static native void __call1253_44(moom.qZ a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic1253_45(int a0, long a1) throws Throwable;
private static native int __call1253_46() throws Throwable;
private static native java.lang.String __invokedynamic1253_47(int a0) throws Throwable;
private static native void __call1253_48(moom.qZ a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.Exception __call1125300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1125301_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_901442ce603165224f05(moom.qY a0) throws E;
private static final class __SourceHandler_901442ce603165224f05 {

public static java.lang.String f702(moom.qY p0) throws Throwable {
    java.lang.Throwable forwardValue702_20_0;
    java.lang.StackTraceElement[] forwardValue702_34_0;
    net.minecraft.entity.Entity[] spill702_0;
    java.lang.Throwable spill702_1;
    java.lang.StackTraceElement[] spill702_2;
    java.lang.String spill702_3;
    java.lang.String spill702_4;
    java.lang.String spill702_5;
    long life1_3;
    java.lang.Throwable life4_7;
    net.minecraft.entity.Entity[] life3_8;
    java.lang.StackTraceElement[] life5_26;
    java.lang.String life6_32;
    java.lang.String life7_58;
    java.lang.String life8_59;
    java.lang.String life9_60;
    forward_join_39: {
    forward_join_34: {
    forward_join_20: {
    forward_join_19: {
    life1_3 = (__fieldRead702_0() ^ 57582949491943L);
    spill702_0 = __call702_1();
    life4_7 = __call702_2(p0);
    life3_8 = spill702_0;
    spill702_1 = life4_7;
    if (!((life3_8 != null))) {
        forwardValue702_20_0 = spill702_1;
        break forward_join_20;
    }
    if (!((spill702_1 == null))) {
        break forward_join_19;
    }
    return __invokedynamic702_3(21045, (105365553038614963L ^ life1_3));
    }
    forwardValue702_20_0 = life4_7;
    }
    life5_26 = __call702_4(forwardValue702_20_0);
    life6_32 = __invokedynamic702_5(9593, (4432362304579933930L ^ life1_3));
    spill702_2 = life5_26;
    if (!((life3_8 != null))) {
        forwardValue702_34_0 = spill702_2;
        break forward_join_34;
    }
    if (!(((spill702_2).length > 0))) {
        break forward_join_39;
    }
    forwardValue702_34_0 = life5_26;
    }
    life6_32 = __call702_7(__call702_6((forwardValue702_34_0)[0]));
    }
    spill702_3 = __call702_9(__call702_8(life4_7));
    spill702_4 = __call702_10(life4_7);
    spill702_5 = __call702_11(p0);
    life7_58 = life6_32;
    life8_59 = spill702_5;
    life9_60 = spill702_4;
    return __invokedynamic702_15(spill702_3, __invokedynamic702_12(15825, (7981162370366901828L ^ life1_3)), life9_60, __invokedynamic702_13(494, (3217868455631073901L ^ life1_3)), life8_59, __invokedynamic702_14(9004, (6695169204064427L ^ life1_3)), life7_58, "]");
}
public static void h702_0(moom.Oo p0) throws Throwable {
    throw __call1070200_0(p0);
}
public static void h702_1(moom.Oo p0) throws Throwable {
    throw __call1070201_0(p0);
}
public static void h702_2(moom.Oo p0) throws Throwable {
    throw __call1070202_0(p0);
}
public static void h702_3(moom.Oo p0) throws Throwable {
    throw __call1070203_0(p0);
}
private static native long __fieldRead702_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call702_1() throws Throwable;
private static native java.lang.Throwable __call702_2(moom.qY a0) throws Throwable;
private static native java.lang.String __invokedynamic702_3(int a0, long a1) throws Throwable;
private static native java.lang.StackTraceElement[] __call702_4(java.lang.Throwable a0) throws Throwable;
private static native java.lang.String __invokedynamic702_5(int a0, long a1) throws Throwable;
private static native java.lang.String __call702_6(java.lang.StackTraceElement a0) throws Throwable;
private static native java.lang.String __call702_7(java.lang.String a0) throws Throwable;
private static native java.lang.Class __call702_8(java.lang.Throwable a0) throws Throwable;
private static native java.lang.String __call702_9(java.lang.Class a0) throws Throwable;
private static native java.lang.String __call702_10(java.lang.Throwable a0) throws Throwable;
private static native java.lang.String __call702_11(moom.qY a0) throws Throwable;
private static native java.lang.String __invokedynamic702_12(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic702_13(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic702_14(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic702_15(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, java.lang.String a5, java.lang.String a6, java.lang.String a7) throws Throwable;
private static native java.lang.Exception __call1070200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1070201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1070202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1070203_0(moom.Oo a0) throws Throwable;

}


private static java.lang.String b(moom.qY p0) { return __sourceHandlerCall_901442ce603165224f05(p0); }


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 30827);
    if (((moom.Jh.c)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Jh.d)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Jh.d)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Jh", life9_51);
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
        life9_116 = ((java.lang.String)((moom.Jh.b)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Jh.c)[life5_8] = moom.Jh.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Jh.c)[life5_8];
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
        byte[] spill2758_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2758_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2758_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2758_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2758_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2758_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Jh.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5339_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Jh"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.String a(moom.qY p0) {
long local1 = (moom.Jh.a ^ 84607335794056L);
    java.lang.String __sourceSpill1737_4 = moom.BU.a__String();
    java.lang.String __sourceSpill1737_5 = moom.Jh.b(((moom.qY)(p0)));
    java.lang.String local3 = ((moom.qY)(p0)).c();
    java.lang.String local4 = __sourceSpill1737_5;
    java.lang.String local5 = __sourceSpill1737_4;
    return __sourceIntrinsic_e2a0e9f2720c_originalDynamicSite1737_9(__sourceIntrinsic_e2a0e9f2720c_originalDynamicSite1737_6(5495, (4828012362459924356L ^ local1)), local5, __sourceIntrinsic_e2a0e9f2720c_originalDynamicSite1737_7(23201, (707676529622354005L ^ local1)), local4, __sourceIntrinsic_e2a0e9f2720c_originalDynamicSite1737_8(3018, (6095758554573396257L ^ local1)), local3, "\n");
}


public static void a(moom.qZ p0) { __sourceHandlerCall_45c139ecda986409d8ac(p0); }


public static void a(moom.qY p0, moom.qZ p1) { __sourceHandlerCall_96d257e2943d15315741(p0, p1); }


private static void lambda$onCrashReport$0(java.lang.String p0, byte[] p1, java.lang.Throwable p2) {
return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5339_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e2a0e9f2720c_originalDynamicSite1737_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e2a0e9f2720c_originalDynamicSite1737_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e2a0e9f2720c_originalDynamicSite1737_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e2a0e9f2720c_originalDynamicSite1737_9(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, java.lang.String a5, java.lang.String a6) throws E;
}
