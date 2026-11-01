package com.moon;


public class ml {

private static com.google.gson.Gson a;

private java.util.Map<java.lang.String, com.moon.mk> b;

private java.util.Map<net.minecraft.entity.player.EntityPlayer, com.moon.mk> c;

private static java.lang.String d;

private static long e;

private static java.lang.String[] f;

private static java.lang.String[] g;

private static java.util.Map h;

public ml() {
super();
    this.b = new java.util.HashMap();
    this.c = new java.util.HashMap();
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(4504474710835950965L)), ((long)(-7523837288305381907L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(14837184104214L)))));
    java.lang.Object __sourceSpill338_6 = null;
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life8 = (com.moon.ml.e ^ 16681919102213L);
    com.moon.ml.c(((java.lang.String)(__sourceSpill338_6)));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill338_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill338_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill338_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill338_16 = new byte[8];
    (__sourceSpill338_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill338_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation338_18 = __sourceSpill338_16;
    ((javax.crypto.Cipher)(__sourceSpill338_13)).init(((int)(__sourceSpill338_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill338_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation338_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life21 = new java.lang.String[9];
    int local7_life22 = 0;
    java.lang.String local6_life23;
    int local8_life25 = ((java.lang.String)((local6_life23 = "UÏähÐ¡Ù9Öâ\rq¢A®lö¦]\005Ã\rËyøÖê¨Ñ\0163êlá\017\"X\b2ãè®¹\021¹&<\004î#wLúí\rçÁ\037ý¦þm4à³ -ÁÅ\002-\035TT3kÞ\007Ræ\022Cí\002ôN§-æ÷êÉs×Ù|5ÈÞ\\^\016 KÅ\013²îHkìUh\013^,3 È|ÞÊ@-Ö\\Æ\032\0074\035I¢¹ÇÓ,\035;èöYgÂ2ë% ­Ô\fIý¨¦ª t{xNyö{fÓ\nô\004½>¼\"\0203(í\037ñ<ó\033 ¶@Ä,Â\017\020\035é[/ÿòåÑ_góí_P\002\026\016&Î¥ÌÝ¥eôô\0225z©M0Ñ3n>ú\037Zï¯Í®þo\177ë\036\016Z7Û®¼¢C¼aÇ²Éci-¹§\033×²0»Bõî\004\004Î\027²þÎ@(*"))).length();
    int local5_life26 = 40;
    int local4_life27 = -1;
    while (true) {
        local4_life27 += 1;
        byte[] __sourceSpill338_30 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill338_31 = local2_life11;
        byte[] local10_life33 = ((javax.crypto.Cipher)(__sourceSpill338_31)).doFinal(((byte[])(__sourceSpill338_30)));
        java.lang.String __sourceSpill338_36 = ((java.lang.String)(com.moon.ml.a(((byte[])(local10_life33))))).intern();
        java.lang.String[] __sourceSpill338_37 = local9_life21;
        int __sourceSpill338_38 = local7_life22;
        local7_life22 += 1;
        (__sourceSpill338_37)[__sourceSpill338_38] = __sourceSpill338_36;
        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }
        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));
    }
    local8_life25 = ((java.lang.String)((local6_life23 = "÷ÒB@£\025S\006ÑµË©÷Ôb/à`\"HýÈ\016³þT»â:'ÚyUÊ]úÇ@\037rnÓ\017\005´R²¸®\031\0306!j,èÂú\007ºnÎ\022×Ç\024dj±Ä¬\">÷H[\001\025!{ÎÈÃ1\030RNeó\001ª{ø*Tþ"))).length();
    local5_life26 = 40;
    local4_life27 = -1;
    while (true) {
        local4_life27 += 1;
        byte[] __sourceSpill338_44 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill338_45 = local2_life11;
        byte[] local10_life47 = ((javax.crypto.Cipher)(__sourceSpill338_45)).doFinal(((byte[])(__sourceSpill338_44)));
        java.lang.String __sourceSpill338_50 = ((java.lang.String)(com.moon.ml.a(((byte[])(local10_life47))))).intern();
        java.lang.String[] __sourceSpill338_51 = local9_life21;
        int __sourceSpill338_52 = local7_life22;
        local7_life22 += 1;
        (__sourceSpill338_51)[__sourceSpill338_52] = __sourceSpill338_50;
        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }
        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));
    }
    f = ((java.lang.String[])(local9_life21));
    g = ((java.lang.String[])(new java.lang.String[9]));
    a = ((com.google.gson.Gson)(((com.google.gson.GsonBuilder)(((com.google.gson.GsonBuilder)(new com.google.gson.GsonBuilder())).setPrettyPrinting())).create()));
}

private static native <E extends Throwable> void __sourceHandlerCall_0fe505732978785319b9(com.moon.ml a0, com.moon.event.TickEvent a1) throws E;
private static final class __SourceHandler_0fe505732978785319b9 {

public static void f483(com.moon.ml receiver, com.moon.event.TickEvent p0) throws Throwable {
    net.minecraft.client.entity.EntityPlayerSP forwardValue483_19_0;
    java.lang.String spill483_0;
    net.minecraft.client.entity.EntityPlayerSP spill483_1;
    long life2_3;
    net.minecraft.client.Minecraft life5_6;
    java.lang.String life4_7;
    forward_join_25: {
    forward_join_19: {
    life2_3 = (__fieldRead483_0() ^ 55635228236864L);
    spill483_0 = __call483_1();
    life5_6 = __call483_2();
    life4_7 = spill483_0;
    if (!((__call483_3(p0) == __fieldRead483_4()))) {
        break forward_join_25;
    }
    spill483_1 = __fieldRead483_5(life5_6);
    if (!((life4_7 == null))) {
        forwardValue483_19_0 = spill483_1;
        break forward_join_19;
    }
    if (!((spill483_1 != null))) {
        break forward_join_25;
    }
    forwardValue483_19_0 = __fieldRead483_6(life5_6);
    }
    if (!((__fieldRead483_7(forwardValue483_19_0) <= 1))) {
        break forward_join_25;
    }
    __call483_9(__fieldRead483_8(receiver));
    }
    return;
}
public static void h483_0(moom.Oo p0) throws Throwable {
    throw __call1048300_0(p0);
}
public static void h483_1(moom.Oo p0) throws Throwable {
    throw __call1048301_0(p0);
}
public static void h483_2(moom.Oo p0) throws Throwable {
    throw __call1048302_0(p0);
}
public static void h483_3(moom.Oo p0) throws Throwable {
    throw __call1048303_0(p0);
}
private static native long __fieldRead483_0() throws Throwable;
private static native java.lang.String __call483_1() throws Throwable;
private static native net.minecraft.client.Minecraft __call483_2() throws Throwable;
private static native com.moon.event.TickPhase __call483_3(com.moon.event.TickEvent a0) throws Throwable;
private static native com.moon.event.TickPhase __fieldRead483_4() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead483_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead483_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead483_7(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native java.util.Map __fieldRead483_8(com.moon.ml a0) throws Throwable;
private static native void __call483_9(java.util.Map a0) throws Throwable;
private static native java.lang.Exception __call1048300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1048301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1048302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1048303_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_bb9158dd935b5cc0b7d1(com.moon.ml a0, java.io.File a1) throws E;
private static final class __SourceHandler_bb9158dd935b5cc0b7d1 {

public static void f58(com.moon.ml receiver, java.io.File p0) throws Throwable {
    java.io.File lexicalValue58_33_0;
    java.lang.Object lexicalValue58_55_0;
    java.lang.String spill58_0;
    java.io.File spill58_1;
    java.io.File spill58_2;
    long life2_3;
    java.io.File life5_14;
    java.lang.String life4_15;
    java.io.File life6_39;
    com.moon.mm life7_67;
    com.moon.mk[] life8_70;
    int life9_73;
    int life10_75;
    com.moon.mk life11_82;
    lexical_join_84: {
    lexical_join_55: {
    lexical_join_48: {
    lexical_join_33: {
    lexical_join_24: {
    life2_3 = (__fieldRead58_0() ^ 47242950634943L);
    spill58_0 = __call58_1();
    life5_14 = new java.io.File(p0, __invokedynamic58_2(22850, (358588916420340828L ^ life2_3)));
    life4_15 = spill58_0;
    spill58_1 = life5_14;
    if (!((life4_15 == null))) {
        lexicalValue58_33_0 = spill58_1;
        break lexical_join_33;
    }
    if (!((!__call58_3(spill58_1)))) {
        break lexical_join_24;
    }
    __call58_4(life5_14);
    }
    lexicalValue58_33_0 = new java.io.File(life5_14, __invokedynamic58_5(28013, (1454041737406371956L ^ life2_3)));
    }
    life6_39 = lexicalValue58_33_0;
    spill58_2 = life6_39;
    if (!((life4_15 == null))) {
        lexicalValue58_55_0 = spill58_2;
        break lexical_join_55;
    }
    if (!((!__call58_6(spill58_2)))) {
        break lexical_join_48;
    }
    __call58_10(__call58_8(__call58_7()), __invokedynamic58_9(27054, (397565505204772029L ^ life2_3)));
    return;
    }
    lexicalValue58_55_0 = __call58_13(__fieldRead58_11(), new java.io.FileReader(life6_39), __classLiteral58_12());
    }
    life7_67 = __cast58_14(lexicalValue58_55_0);
    life8_70 = __call58_15(life7_67);
    life9_73 = (life8_70).length;
    life10_75 = 0;
    lexical_cycle_65: while (true) {
    if (!((life10_75 < life9_73))) {
        break lexical_join_84;
    }
    life11_82 = (life8_70)[life10_75];
    __call58_18(__fieldRead58_16(receiver), __call58_17(life11_82), life11_82);
    life10_75 += 1;
    if (!((life4_15 == null))) {
        break lexical_join_84;
    }
    if (!((life4_15 != null))) { continue lexical_cycle_65; }
    break lexical_cycle_65;
    }
    }
    return;
}
public static void h58_0(java.io.FileNotFoundException p0) throws Throwable {
    throw __call2005800_0(p0);
}
public static void h58_1(java.io.FileNotFoundException p0) throws Throwable {
    throw __call2005801_0(p0);
}
public static void h58_2(java.io.FileNotFoundException p0) throws Throwable {
    throw __call2005802_0(p0);
}
public static void h58_3(java.io.FileNotFoundException p0) throws Throwable {
    throw __call2005803_0(p0);
}
public static void h58_4(java.io.FileNotFoundException p0) throws Throwable {
    throw __call2005804_0(p0);
}
public static void h58_5(java.io.FileNotFoundException p0, long p1) throws Throwable {
    java.io.FileNotFoundException local3 = p0;
    org.tinylog.TaggedLogger spill2005805_0 = __call2005805_1(__call2005805_0());
    java.lang.String spill2005805_1 = __invokedynamic2005805_2(10792, (1507681205461720884L ^ p1));
    java.lang.Object[] __stackOp2005805_3_0 = new java.lang.Object[1];
    java.lang.Object[] spill2005805_2 = __stackOp2005805_3_0;
    (__stackOp2005805_3_0)[0] = local3;
    __call2005805_4(spill2005805_0, spill2005805_1, spill2005805_2);
    return;
}
private static native long __fieldRead58_0() throws Throwable;
private static native java.lang.String __call58_1() throws Throwable;
private static native java.lang.String __invokedynamic58_2(int a0, long a1) throws Throwable;
private static native boolean __call58_3(java.io.File a0) throws Throwable;
private static native boolean __call58_4(java.io.File a0) throws Throwable;
private static native java.lang.String __invokedynamic58_5(int a0, long a1) throws Throwable;
private static native boolean __call58_6(java.io.File a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call58_7() throws Throwable;
private static native org.tinylog.TaggedLogger __call58_8(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.String __invokedynamic58_9(int a0, long a1) throws Throwable;
private static native void __call58_10(org.tinylog.TaggedLogger a0, java.lang.String a1) throws Throwable;
private static native com.google.gson.Gson __fieldRead58_11() throws Throwable;
private static native java.lang.Object __classLiteral58_12() throws Throwable;
private static native java.lang.Object __call58_13(com.google.gson.Gson a0, java.io.FileReader a1, java.lang.Object a2) throws Throwable;
private static native com.moon.mm __cast58_14(java.lang.Object a0) throws Throwable;
private static native com.moon.mk[] __call58_15(com.moon.mm a0) throws Throwable;
private static native java.util.Map __fieldRead58_16(com.moon.ml a0) throws Throwable;
private static native java.lang.String __call58_17(com.moon.mk a0) throws Throwable;
private static native java.lang.Object __call58_18(java.util.Map a0, java.lang.String a1, com.moon.mk a2) throws Throwable;
private static native java.lang.Exception __call2005800_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call2005801_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call2005802_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call2005803_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call2005804_0(java.io.FileNotFoundException a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call2005805_0() throws Throwable;
private static native org.tinylog.TaggedLogger __call2005805_1(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.String __invokedynamic2005805_2(int a0, long a1) throws Throwable;
private static native void __call2005805_4(org.tinylog.TaggedLogger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_26e3060d0909a59baeac(com.moon.ml a0, java.lang.String a1) throws E;
private static final class __SourceHandler_26e3060d0909a59baeac {

public static void f484(com.moon.ml receiver, java.lang.String p0) throws Throwable {
    long life2_3;
    java.lang.String life4_5;
    com.moon.mk life5_30;
    forward_join_20: {
    forward_join_19: {
    life2_3 = (__fieldRead484_0() ^ 22073949399204L);
    life4_5 = __call484_1();
    if (!((life4_5 == null))) { break forward_join_19; }
    if (!(__call484_3(__fieldRead484_2(receiver), p0))) { break forward_join_20; }
    __call484_5(__invokedynamic484_4(24094, (2376361642328337951L ^ life2_3)));
    }
    return;
    }
    life5_30 = new com.moon.mk(p0);
    __call484_7(__fieldRead484_6(receiver), p0, life5_30);
    __call484_9(__fieldRead484_8(receiver));
    return;
}
public static void h484_0(moom.Oo p0) throws Throwable {
    throw __call1048400_0(p0);
}
public static void h484_1(moom.Oo p0) throws Throwable {
    throw __call1048401_0(p0);
}
private static native long __fieldRead484_0() throws Throwable;
private static native java.lang.String __call484_1() throws Throwable;
private static native java.util.Map __fieldRead484_2(com.moon.ml a0) throws Throwable;
private static native boolean __call484_3(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic484_4(int a0, long a1) throws Throwable;
private static native void __call484_5(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead484_6(com.moon.ml a0) throws Throwable;
private static native java.lang.Object __call484_7(java.util.Map a0, java.lang.String a1, com.moon.mk a2) throws Throwable;
private static native java.util.Map __fieldRead484_8(com.moon.ml a0) throws Throwable;
private static native void __call484_9(java.util.Map a0) throws Throwable;
private static native java.lang.Exception __call1048400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1048401_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.mk __sourceHandlerCall_d059bb497e27d2981e1c(com.moon.ml a0, net.minecraft.entity.player.EntityPlayer a1) throws E;
private static final class __SourceHandler_d059bb497e27d2981e1c {

public static com.moon.mk f40(com.moon.ml receiver, net.minecraft.entity.player.EntityPlayer p0) throws Throwable {
    java.util.Map lexicalValue40_21_0;
    java.lang.Object lexicalValue40_46_0;
    java.lang.Object lexicalValue40_56_0;
    java.util.Map spill40_0;
    java.lang.String spill40_1;
    long life2_3;
    java.lang.String life4_5;
    java.util.Iterator life5_28;
    com.moon.mk life6_35;
    lexical_join_56: {
    lexical_join_51: {
    lexical_join_21: {
    lexical_join_19: {
    life2_3 = (__fieldRead40_0() ^ 105233919918767L);
    life4_5 = __call40_1();
    spill40_0 = __fieldRead40_2(receiver);
    if (!((life4_5 == null))) {
        lexicalValue40_21_0 = spill40_0;
        break lexical_join_21;
    }
    if (!(__call40_3(spill40_0, p0))) {
        break lexical_join_19;
    }
    return __cast40_6(__call40_5(__fieldRead40_4(receiver), p0));
    }
    lexicalValue40_21_0 = __fieldRead40_7(receiver);
    }
    life5_28 = __call40_9(__call40_8(lexicalValue40_21_0));
    lexical_cycle_24: while (true) {
    lexical_join_49: {
    lexical_join_46: {
    if (!(__call40_10(life5_28))) {
        break lexical_join_51;
    }
    life6_35 = __cast40_12(__call40_11(life5_28));
    spill40_1 = __call40_13(p0);
    if (!((life4_5 == null))) {
        lexicalValue40_56_0 = spill40_1;
        break lexical_join_56;
    }
    if (!((life4_5 == null))) {
        lexicalValue40_46_0 = spill40_1;
        break lexical_join_46;
    }
    if (!(__call40_15(spill40_1, __call40_14(life6_35)))) {
        break lexical_join_49;
    }
    lexicalValue40_46_0 = __call40_17(__fieldRead40_16(receiver), p0, life6_35);
    }
    __discardScalar40_18(lexicalValue40_46_0);
    return life6_35;
    }
    if (!((life4_5 != null))) { continue lexical_cycle_24; }
    break lexical_cycle_24;
    }
    }
    lexicalValue40_56_0 = __call40_20(__fieldRead40_19(receiver), p0, null);
    }
    __discardScalar40_21(lexicalValue40_56_0);
    return null;
}
public static void h40_0(moom.Oo p0) throws Throwable {
    throw __call1004000_0(p0);
}
public static void h40_1(moom.Oo p0) throws Throwable {
    throw __call1004001_0(p0);
}
public static void h40_2(moom.Oo p0) throws Throwable {
    throw __call1004002_0(p0);
}
public static void h40_3(moom.Oo p0) throws Throwable {
    throw __call1004003_0(p0);
}
public static void h40_4(moom.Oo p0) throws Throwable {
    throw __call1004004_0(p0);
}
private static native long __fieldRead40_0() throws Throwable;
private static native java.lang.String __call40_1() throws Throwable;
private static native java.util.Map __fieldRead40_2(com.moon.ml a0) throws Throwable;
private static native boolean __call40_3(java.util.Map a0, net.minecraft.entity.player.EntityPlayer a1) throws Throwable;
private static native java.util.Map __fieldRead40_4(com.moon.ml a0) throws Throwable;
private static native java.lang.Object __call40_5(java.util.Map a0, net.minecraft.entity.player.EntityPlayer a1) throws Throwable;
private static native com.moon.mk __cast40_6(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead40_7(com.moon.ml a0) throws Throwable;
private static native java.util.Collection __call40_8(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call40_9(java.util.Collection a0) throws Throwable;
private static native boolean __call40_10(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call40_11(java.util.Iterator a0) throws Throwable;
private static native com.moon.mk __cast40_12(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call40_13(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native java.lang.String __call40_14(com.moon.mk a0) throws Throwable;
private static native boolean __call40_15(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead40_16(com.moon.ml a0) throws Throwable;
private static native java.lang.Object __call40_17(java.util.Map a0, net.minecraft.entity.player.EntityPlayer a1, com.moon.mk a2) throws Throwable;
private static native void __discardScalar40_18(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead40_19(com.moon.ml a0) throws Throwable;
private static native java.lang.Object __call40_20(java.util.Map a0, net.minecraft.entity.player.EntityPlayer a1, java.lang.Object a2) throws Throwable;
private static native void __discardScalar40_21(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1004000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004003_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004004_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_e7f000c83796b4c47fe8(com.moon.ml a0, net.minecraft.entity.player.EntityPlayer a1) throws E;
private static final class __SourceHandler_e7f000c83796b4c47fe8 {

public static boolean f486(com.moon.ml receiver, net.minecraft.entity.player.EntityPlayer p0) throws Throwable {
    int lexicalValue486_21_0;
    java.util.Map lexicalValue486_24_0;
    int lexicalValue486_51_0;
    int lexicalValue486_61_0;
    int lexicalValue486_65_0;
    java.util.Map spill486_0;
    boolean spill486_1;
    long life2_3;
    java.lang.String life4_5;
    java.util.Iterator life5_34;
    com.moon.mk life6_41;
    lexical_join_65: {
    lexical_join_61: {
    lexical_join_54: {
    lexical_join_24: {
    lexical_join_22: {
    lexical_join_21: {
    lexical_join_20: {
    life2_3 = (__fieldRead486_0() ^ 17748574466174L);
    life4_5 = __call486_1();
    spill486_0 = __fieldRead486_2(receiver);
    if (!((life4_5 == null))) {
        lexicalValue486_24_0 = spill486_0;
        break lexical_join_24;
    }
    if (!(__call486_3(spill486_0, p0))) {
        break lexical_join_22;
    }
    if (!((__call486_5(__fieldRead486_4(receiver), p0) != null))) {
        break lexical_join_20;
    }
    lexicalValue486_21_0 = 1;
    break lexical_join_21;
    }
    lexicalValue486_21_0 = 0;
    }
    return __integerCategory486_6(lexicalValue486_21_0);
    }
    lexicalValue486_24_0 = __fieldRead486_7(receiver);
    }
    life5_34 = __call486_9(__call486_8(lexicalValue486_24_0));
    lexical_cycle_27: while (true) {
    lexical_join_52: {
    lexical_join_51: {
    if (!(__call486_10(life5_34))) {
        break lexical_join_54;
    }
    life6_41 = __cast486_12(__call486_11(life5_34));
    spill486_1 = __call486_15(__call486_13(p0), __call486_14(life6_41));
    if (!((life4_5 == null))) {
        lexicalValue486_61_0 = __integerCategory486_16(spill486_1);
        break lexical_join_61;
    }
    if (!((life4_5 == null))) {
        lexicalValue486_51_0 = __integerCategory486_17(spill486_1);
        break lexical_join_51;
    }
    if (!(spill486_1)) {
        break lexical_join_52;
    }
    __call486_19(__fieldRead486_18(receiver), p0, life6_41);
    lexicalValue486_51_0 = 1;
    }
    return __integerCategory486_20(lexicalValue486_51_0);
    }
    if (!((life4_5 != null))) { continue lexical_cycle_27; }
    break lexical_cycle_27;
    }
    }
    __call486_22(__fieldRead486_21(receiver), p0, null);
    lexicalValue486_61_0 = 0;
    }
    if (!((__call486_23() != null))) {
        lexicalValue486_65_0 = lexicalValue486_61_0;
        break lexical_join_65;
    }
    __call486_24("WoEHNc");
    lexicalValue486_65_0 = lexicalValue486_61_0;
    }
    return __integerCategory486_25(lexicalValue486_65_0);
}
public static void h486_0(moom.Oo p0) throws Throwable {
    throw __call1048600_0(p0);
}
public static void h486_1(moom.Oo p0) throws Throwable {
    throw __call1048601_0(p0);
}
public static void h486_2(moom.Oo p0) throws Throwable {
    throw __call1048602_0(p0);
}
public static void h486_3(moom.Oo p0) throws Throwable {
    throw __call1048603_0(p0);
}
public static void h486_4(moom.Oo p0) throws Throwable {
    throw __call1048604_0(p0);
}
public static void h486_5(moom.Oo p0) throws Throwable {
    throw __call1048605_0(p0);
}
public static void h486_6(moom.Oo p0) throws Throwable {
    throw __call1048606_0(p0);
}
private static native long __fieldRead486_0() throws Throwable;
private static native java.lang.String __call486_1() throws Throwable;
private static native java.util.Map __fieldRead486_2(com.moon.ml a0) throws Throwable;
private static native boolean __call486_3(java.util.Map a0, net.minecraft.entity.player.EntityPlayer a1) throws Throwable;
private static native java.util.Map __fieldRead486_4(com.moon.ml a0) throws Throwable;
private static native java.lang.Object __call486_5(java.util.Map a0, net.minecraft.entity.player.EntityPlayer a1) throws Throwable;
private static native boolean __integerCategory486_6(int value) throws Throwable;
private static native java.util.Map __fieldRead486_7(com.moon.ml a0) throws Throwable;
private static native java.util.Collection __call486_8(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call486_9(java.util.Collection a0) throws Throwable;
private static native boolean __call486_10(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call486_11(java.util.Iterator a0) throws Throwable;
private static native com.moon.mk __cast486_12(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call486_13(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native java.lang.String __call486_14(com.moon.mk a0) throws Throwable;
private static native boolean __call486_15(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory486_16(boolean value) throws Throwable;
private static native int __integerCategory486_17(boolean value) throws Throwable;
private static native java.util.Map __fieldRead486_18(com.moon.ml a0) throws Throwable;
private static native java.lang.Object __call486_19(java.util.Map a0, net.minecraft.entity.player.EntityPlayer a1, com.moon.mk a2) throws Throwable;
private static native boolean __integerCategory486_20(int value) throws Throwable;
private static native java.util.Map __fieldRead486_21(com.moon.ml a0) throws Throwable;
private static native java.lang.Object __call486_22(java.util.Map a0, net.minecraft.entity.player.EntityPlayer a1, java.lang.Object a2) throws Throwable;
private static native java.lang.String[] __call486_23() throws Throwable;
private static native void __call486_24(java.lang.String a0) throws Throwable;
private static native boolean __integerCategory486_25(int value) throws Throwable;
private static native java.lang.Exception __call1048600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1048601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1048602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1048603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1048604_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1048605_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1048606_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_3001ffc06b47350fb126(com.moon.ml a0, java.io.File a1) throws E;
private static final class __SourceHandler_3001ffc06b47350fb126 {

public static void f59(com.moon.ml receiver, java.io.File p0) throws Throwable {
    java.io.File forwardValue59_33_0;
    java.lang.String spill59_0;
    java.io.File spill59_1;
    java.nio.file.Path spill59_2;
    java.lang.String spill59_3;
    java.nio.file.OpenOption[] spill59_4;
    java.nio.file.OpenOption[] spill59_5;
    java.nio.file.OpenOption[] spill59_6;
    long life2_3;
    java.io.File life5_14;
    java.lang.String life4_15;
    java.io.File life6_39;
    java.lang.String life7_52;
    forward_join_33: {
    forward_join_24: {
    life2_3 = (__fieldRead59_0() ^ 106350873445100L);
    spill59_0 = __call59_1();
    life5_14 = new java.io.File(p0, __invokedynamic59_2(1831, (4329346857347865963L ^ life2_3)));
    life4_15 = spill59_0;
    spill59_1 = life5_14;
    if (!((life4_15 == null))) {
        forwardValue59_33_0 = spill59_1;
        break forward_join_33;
    }
    if (!((!__call59_3(spill59_1)))) {
        break forward_join_24;
    }
    __call59_4(life5_14);
    }
    forwardValue59_33_0 = new java.io.File(life5_14, __invokedynamic59_5(8592, (6332153337268501467L ^ life2_3)));
    }
    life6_39 = forwardValue59_33_0;
    life7_52 = __call59_11(__fieldRead59_6(), new com.moon.mm(__cast59_10(__call59_9(__call59_8(__fieldRead59_7(receiver)), new com.moon.mk[0]))));
    spill59_2 = __call59_12(life6_39);
    spill59_3 = life7_52;
    java.nio.file.OpenOption[] __stackOp59_13_0 = new java.nio.file.OpenOption[3];
    spill59_4 = __stackOp59_13_0;
    (__stackOp59_13_0)[0] = __fieldRead59_14();
    java.nio.file.OpenOption[] __stackOp59_15_0 = spill59_4;
    spill59_5 = __stackOp59_15_0;
    (__stackOp59_15_0)[1] = __fieldRead59_16();
    java.nio.file.OpenOption[] __stackOp59_17_0 = spill59_5;
    spill59_6 = __stackOp59_17_0;
    (__stackOp59_17_0)[2] = __fieldRead59_18();
    __call59_19(spill59_2, spill59_3, spill59_6);
    return;
}
public static void h59_0(java.io.IOException p0) throws Throwable {
    throw __call2005900_0(p0);
}
public static void h59_1(java.io.IOException p0) throws Throwable {
    throw __call2005901_0(p0);
}
public static void h59_2(java.io.IOException p0, long p1) throws Throwable {
    java.io.IOException local3 = p0;
    org.tinylog.TaggedLogger spill2005902_0 = __call2005902_1(__call2005902_0());
    java.lang.String spill2005902_1 = __invokedynamic2005902_2(16648, (7413389850799872832L ^ p1));
    java.lang.Object[] __stackOp2005902_3_0 = new java.lang.Object[1];
    java.lang.Object[] spill2005902_2 = __stackOp2005902_3_0;
    (__stackOp2005902_3_0)[0] = local3;
    __call2005902_4(spill2005902_0, spill2005902_1, spill2005902_2);
    return;
}
private static native long __fieldRead59_0() throws Throwable;
private static native java.lang.String __call59_1() throws Throwable;
private static native java.lang.String __invokedynamic59_2(int a0, long a1) throws Throwable;
private static native boolean __call59_3(java.io.File a0) throws Throwable;
private static native boolean __call59_4(java.io.File a0) throws Throwable;
private static native java.lang.String __invokedynamic59_5(int a0, long a1) throws Throwable;
private static native com.google.gson.Gson __fieldRead59_6() throws Throwable;
private static native java.util.Map __fieldRead59_7(com.moon.ml a0) throws Throwable;
private static native java.util.Collection __call59_8(java.util.Map a0) throws Throwable;
private static native java.lang.Object[] __call59_9(java.util.Collection a0, com.moon.mk[] a1) throws Throwable;
private static native com.moon.mk[] __cast59_10(java.lang.Object[] a0) throws Throwable;
private static native java.lang.String __call59_11(com.google.gson.Gson a0, com.moon.mm a1) throws Throwable;
private static native java.nio.file.Path __call59_12(java.io.File a0) throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead59_14() throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead59_16() throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead59_18() throws Throwable;
private static native java.nio.file.Path __call59_19(java.nio.file.Path a0, java.lang.String a1, java.nio.file.OpenOption[] a2) throws Throwable;
private static native java.lang.Exception __call2005900_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2005901_0(java.io.IOException a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call2005902_0() throws Throwable;
private static native org.tinylog.TaggedLogger __call2005902_1(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.String __invokedynamic2005902_2(int a0, long a1) throws Throwable;
private static native void __call2005902_4(org.tinylog.TaggedLogger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e1ed72c8858b8ad49971(com.moon.ml a0, java.lang.String a1) throws E;
private static final class __SourceHandler_e1ed72c8858b8ad49971 {

public static void f487(com.moon.ml receiver, java.lang.String p0) throws Throwable {
    java.util.Map forwardValue487_23_0;
    java.lang.String forwardValue487_23_1;
    java.util.Map spill487_0;
    java.lang.String spill487_1;
    long life2_3;
    java.lang.String life4_5;
    forward_join_23: {
    forward_join_20: {
    life2_3 = (__fieldRead487_0() ^ 57834837679684L);
    life4_5 = __call487_1();
    spill487_0 = __fieldRead487_2(receiver);
    spill487_1 = p0;
    if (!((life4_5 == null))) {
        forwardValue487_23_0 = spill487_0;
        forwardValue487_23_1 = spill487_1;
        break forward_join_23;
    }
    if (!((!__call487_3(spill487_0, spill487_1)))) {
        break forward_join_20;
    }
    __call487_5(__invokedynamic487_4(30006, (6833873074571195344L ^ life2_3)));
    return;
    }
    forwardValue487_23_0 = __fieldRead487_6(receiver);
    forwardValue487_23_1 = p0;
    }
    __call487_7(forwardValue487_23_0, forwardValue487_23_1);
    __call487_9(__fieldRead487_8(receiver));
    return;
}
public static void h487_0(moom.Oo p0) throws Throwable {
    throw __call1048700_0(p0);
}
public static void h487_1(moom.Oo p0) throws Throwable {
    throw __call1048701_0(p0);
}
private static native long __fieldRead487_0() throws Throwable;
private static native java.lang.String __call487_1() throws Throwable;
private static native java.util.Map __fieldRead487_2(com.moon.ml a0) throws Throwable;
private static native boolean __call487_3(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic487_4(int a0, long a1) throws Throwable;
private static native void __call487_5(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead487_6(com.moon.ml a0) throws Throwable;
private static native java.lang.Object __call487_7(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead487_8(com.moon.ml a0) throws Throwable;
private static native void __call487_9(java.util.Map a0) throws Throwable;
private static native java.lang.Exception __call1048700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1048701_0(moom.Oo a0) throws Throwable;

}


public static java.lang.String b() {
return com.moon.ml.d;
}


public java.util.Map<net.minecraft.entity.player.EntityPlayer, com.moon.mk> b__Map() {
return this.c;
}


public void b(java.lang.String p0) { __sourceHandlerCall_e1ed72c8858b8ad49971(this, p0); }


public void b(java.io.File p0) { __sourceHandlerCall_3001ffc06b47350fb126(this, p0); }


public static void c(java.lang.String p0) {
d = ((java.lang.String)(p0));
    return;
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
        byte[] spill1002_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1002_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1002_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1002_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1002_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1002_2)[life4_9];
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


public void a(java.io.File p0) { __sourceHandlerCall_bb9158dd935b5cc0b7d1(this, p0); }


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 13880);
    if (((com.moon.ml.g)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.ml.h)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.ml.h)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/ml", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.ml.f)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.ml.g)[life5_8] = com.moon.ml.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.ml.g)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.ml.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2295_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ml"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public com.moon.mk a(net.minecraft.entity.player.EntityPlayer p0) { return __sourceHandlerCall_d059bb497e27d2981e1c(this, p0); }


public boolean a__Boolean(net.minecraft.entity.player.EntityPlayer p0) { return __sourceHandlerCall_e7f000c83796b4c47fe8(this, p0); }


public java.util.Map<java.lang.String, com.moon.mk> a() {
return this.b;
}


public void a(java.lang.String p0) { __sourceHandlerCall_26e3060d0909a59baeac(this, p0); }


public void a(com.moon.event.TickEvent p0) { __sourceHandlerCall_0fe505732978785319b9(this, p0); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2295_0() throws E;
}
