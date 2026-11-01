package com.moon;


public class eV {

private static com.google.gson.Gson a;

private java.util.Map<java.lang.String, com.moon.eU> b;

private java.util.Map<net.minecraft.entity.player.EntityPlayer, com.moon.eU> c;

private static int[] d;

private static long e;

private static java.lang.String[] f;

private static java.lang.String[] g;

private static java.util.Map h;

public eV() {
super();
    this.b = new java.util.HashMap();
    this.c = new java.util.HashMap();
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(8167038607201115917L)), ((long)(-527393166810756331L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(72413822409617L)))));
    int[] __sourceSpill135_6 = new int[3];
    h = ((java.util.Map)(new java.util.HashMap(13)));
    com.moon.eV.b(((int[])(__sourceSpill135_6)));
    long local0_life9 = (com.moon.eV.e ^ 100540637471555L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill135_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill135_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill135_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill135_16 = new byte[8];
    (__sourceSpill135_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill135_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation135_18 = __sourceSpill135_16;
    ((javax.crypto.Cipher)(__sourceSpill135_13)).init(((int)(__sourceSpill135_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill135_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation135_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life21 = new java.lang.String[9];
    int local7_life22 = 0;
    java.lang.String local6_life23;
    int local8_life25 = ((java.lang.String)((local6_life23 = "ÞäK\033\177HÕ¶\016½ ÒÇi]e¤h\027\001¡­VqQµ±#è\001önö\"Ömð!²:XX¬N,\016%¬m \râL5ß\020\rVêêCÃ²\034i/aS,¢äc O#ì¢hz»¼t±ôY­Yépéê/JÙ9ÄÔ^V¡§PN-\006ÜáØ)-¶¼kÐLVýð;iX\táþQ:FfCòp\000j¼Ó<\034Ñ­ý\bf#Ðª»Ð\035,Áb´Áéq%Ôg.,NÈÙyF Üæ±w^ Á§7h¤qN\\×<ÛÒ&!ß¿SÙOÚæ5ñds(Êm{A.wÿäq\177ÈH\002¯P*¤Ø¿\031Î=J%\n`LQZt¯ §C\020\025[é\013ápþÞãT¸\013gæ"))).length();
    int local5_life26 = 64;
    int local4_life27 = -1;
    while (true) {
        local4_life27 += 1;
        byte[] __sourceSpill135_30 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill135_31 = local2_life11;
        byte[] local10_life33 = ((javax.crypto.Cipher)(__sourceSpill135_31)).doFinal(((byte[])(__sourceSpill135_30)));
        java.lang.String __sourceSpill135_36 = ((java.lang.String)(com.moon.eV.a(((byte[])(local10_life33))))).intern();
        java.lang.String[] __sourceSpill135_37 = local9_life21;
        int __sourceSpill135_38 = local7_life22;
        local7_life22 += 1;
        (__sourceSpill135_37)[__sourceSpill135_38] = __sourceSpill135_36;
        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }
        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));
    }
    local8_life25 = ((java.lang.String)((local6_life23 = "%/z^U-Ó6èóì9þwµ5X4ë¯óëæuf²Î'u·ÃzÞü`v\rÜ(.ÔE\000$­ìØ×f\024\tI6ÉØªaÜ\bõ'{ÇJ-Iãv,´¿\fäpA¿ªÂ*#ªµ\022[h\022ÝL^â*t\baksV:.U\004Q\005®!\f\032Vj»­¦ Ê³ÆáX"))).length();
    local5_life26 = 40;
    local4_life27 = -1;
    while (true) {
        local4_life27 += 1;
        byte[] __sourceSpill135_44 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill135_45 = local2_life11;
        byte[] local10_life47 = ((javax.crypto.Cipher)(__sourceSpill135_45)).doFinal(((byte[])(__sourceSpill135_44)));
        java.lang.String __sourceSpill135_50 = ((java.lang.String)(com.moon.eV.a(((byte[])(local10_life47))))).intern();
        java.lang.String[] __sourceSpill135_51 = local9_life21;
        int __sourceSpill135_52 = local7_life22;
        local7_life22 += 1;
        (__sourceSpill135_51)[__sourceSpill135_52] = __sourceSpill135_50;
        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }
        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));
    }
    f = ((java.lang.String[])(local9_life21));
    g = ((java.lang.String[])(new java.lang.String[9]));
    a = ((com.google.gson.Gson)(((com.google.gson.GsonBuilder)(((com.google.gson.GsonBuilder)(new com.google.gson.GsonBuilder())).setPrettyPrinting())).create()));
}

private static native <E extends Throwable> void __sourceHandlerCall_7dc720fb971eec059106(com.moon.eV a0, com.moon.event.TickEvent a1) throws E;
private static final class __SourceHandler_7dc720fb971eec059106 {

public static void f451(com.moon.eV receiver, com.moon.event.TickEvent p0) throws Throwable {
    net.minecraft.client.entity.EntityPlayerSP forwardValue451_19_0;
    int[] spill451_0;
    net.minecraft.client.entity.EntityPlayerSP spill451_1;
    long life2_3;
    net.minecraft.client.Minecraft life5_6;
    int[] life4_7;
    forward_join_25: {
    forward_join_19: {
    life2_3 = (__fieldRead451_0() ^ 109707373415925L);
    spill451_0 = __call451_1();
    life5_6 = __call451_2();
    life4_7 = spill451_0;
    if (!((__call451_3(p0) == __fieldRead451_4()))) {
        break forward_join_25;
    }
    spill451_1 = __fieldRead451_5(life5_6);
    if (!((life4_7 != null))) {
        forwardValue451_19_0 = spill451_1;
        break forward_join_19;
    }
    if (!((spill451_1 != null))) {
        break forward_join_25;
    }
    forwardValue451_19_0 = __fieldRead451_6(life5_6);
    }
    if (!((__fieldRead451_7(forwardValue451_19_0) <= 1))) {
        break forward_join_25;
    }
    __call451_9(__fieldRead451_8(receiver));
    }
    return;
}
public static void h451_0(moom.Oo p0) throws Throwable {
    throw __call1045100_0(p0);
}
public static void h451_1(moom.Oo p0) throws Throwable {
    throw __call1045101_0(p0);
}
public static void h451_2(moom.Oo p0) throws Throwable {
    throw __call1045102_0(p0);
}
public static void h451_3(moom.Oo p0) throws Throwable {
    throw __call1045103_0(p0);
}
private static native long __fieldRead451_0() throws Throwable;
private static native int[] __call451_1() throws Throwable;
private static native net.minecraft.client.Minecraft __call451_2() throws Throwable;
private static native com.moon.event.TickPhase __call451_3(com.moon.event.TickEvent a0) throws Throwable;
private static native com.moon.event.TickPhase __fieldRead451_4() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead451_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead451_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead451_7(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native java.util.Map __fieldRead451_8(com.moon.eV a0) throws Throwable;
private static native void __call451_9(java.util.Map a0) throws Throwable;
private static native java.lang.Exception __call1045100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1045101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1045102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1045103_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d9fa24bb51f40125527c(com.moon.eV a0, java.io.File a1) throws E;
private static final class __SourceHandler_d9fa24bb51f40125527c {

public static void f41(com.moon.eV receiver, java.io.File p0) throws Throwable {
    java.io.File lexicalValue41_33_0;
    java.lang.Object lexicalValue41_55_0;
    int[] spill41_0;
    java.io.File spill41_1;
    java.io.File spill41_2;
    long life2_3;
    java.io.File life5_14;
    int[] life4_15;
    java.io.File life6_39;
    com.moon.eW life7_67;
    com.moon.eU[] life8_70;
    int life9_73;
    int life10_75;
    com.moon.eU life11_82;
    lexical_join_84: {
    lexical_join_55: {
    lexical_join_48: {
    lexical_join_33: {
    lexical_join_24: {
    life2_3 = (__fieldRead41_0() ^ 74727060856872L);
    spill41_0 = __call41_1();
    life5_14 = new java.io.File(p0, __invokedynamic41_2(18439, (1370702820861421225L ^ life2_3)));
    life4_15 = spill41_0;
    spill41_1 = life5_14;
    if (!((life4_15 != null))) {
        lexicalValue41_33_0 = spill41_1;
        break lexical_join_33;
    }
    if (!((!__call41_3(spill41_1)))) {
        break lexical_join_24;
    }
    __call41_4(life5_14);
    }
    lexicalValue41_33_0 = new java.io.File(life5_14, __invokedynamic41_5(4457, (8056480178255036354L ^ life2_3)));
    }
    life6_39 = lexicalValue41_33_0;
    spill41_2 = life6_39;
    if (!((life4_15 != null))) {
        lexicalValue41_55_0 = spill41_2;
        break lexical_join_55;
    }
    if (!((!__call41_6(spill41_2)))) {
        break lexical_join_48;
    }
    __call41_10(__call41_8(__call41_7()), __invokedynamic41_9(11427, (2638609621184037388L ^ life2_3)));
    return;
    }
    lexicalValue41_55_0 = __call41_13(__fieldRead41_11(), new java.io.FileReader(life6_39), __classLiteral41_12());
    }
    life7_67 = __cast41_14(lexicalValue41_55_0);
    life8_70 = __call41_15(life7_67);
    life9_73 = (life8_70).length;
    life10_75 = 0;
    lexical_cycle_65: while (true) {
    if (!((life10_75 < life9_73))) {
        break lexical_join_84;
    }
    life11_82 = (life8_70)[life10_75];
    __call41_18(__fieldRead41_16(receiver), __call41_17(life11_82), life11_82);
    life10_75 += 1;
    if (!((life4_15 != null))) {
        break lexical_join_84;
    }
    if (!((life4_15 == null))) { continue lexical_cycle_65; }
    break lexical_cycle_65;
    }
    }
    return;
}
public static void h41_0(java.io.FileNotFoundException p0) throws Throwable {
    throw __call2004100_0(p0);
}
public static void h41_1(java.io.FileNotFoundException p0) throws Throwable {
    throw __call2004101_0(p0);
}
public static void h41_2(java.io.FileNotFoundException p0) throws Throwable {
    throw __call2004102_0(p0);
}
public static void h41_3(java.io.FileNotFoundException p0) throws Throwable {
    throw __call2004103_0(p0);
}
public static void h41_4(java.io.FileNotFoundException p0) throws Throwable {
    throw __call2004104_0(p0);
}
public static void h41_5(java.io.FileNotFoundException p0, long p1) throws Throwable {
    java.io.FileNotFoundException local3 = p0;
    org.tinylog.TaggedLogger spill2004105_0 = __call2004105_1(__call2004105_0());
    java.lang.String spill2004105_1 = __invokedynamic2004105_2(25958, (4277390214033542092L ^ p1));
    java.lang.Object[] __stackOp2004105_3_0 = new java.lang.Object[1];
    java.lang.Object[] spill2004105_2 = __stackOp2004105_3_0;
    (__stackOp2004105_3_0)[0] = local3;
    __call2004105_4(spill2004105_0, spill2004105_1, spill2004105_2);
    return;
}
private static native long __fieldRead41_0() throws Throwable;
private static native int[] __call41_1() throws Throwable;
private static native java.lang.String __invokedynamic41_2(int a0, long a1) throws Throwable;
private static native boolean __call41_3(java.io.File a0) throws Throwable;
private static native boolean __call41_4(java.io.File a0) throws Throwable;
private static native java.lang.String __invokedynamic41_5(int a0, long a1) throws Throwable;
private static native boolean __call41_6(java.io.File a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call41_7() throws Throwable;
private static native org.tinylog.TaggedLogger __call41_8(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.String __invokedynamic41_9(int a0, long a1) throws Throwable;
private static native void __call41_10(org.tinylog.TaggedLogger a0, java.lang.String a1) throws Throwable;
private static native com.google.gson.Gson __fieldRead41_11() throws Throwable;
private static native java.lang.Object __classLiteral41_12() throws Throwable;
private static native java.lang.Object __call41_13(com.google.gson.Gson a0, java.io.FileReader a1, java.lang.Object a2) throws Throwable;
private static native com.moon.eW __cast41_14(java.lang.Object a0) throws Throwable;
private static native com.moon.eU[] __call41_15(com.moon.eW a0) throws Throwable;
private static native java.util.Map __fieldRead41_16(com.moon.eV a0) throws Throwable;
private static native java.lang.String __call41_17(com.moon.eU a0) throws Throwable;
private static native java.lang.Object __call41_18(java.util.Map a0, java.lang.String a1, com.moon.eU a2) throws Throwable;
private static native java.lang.Exception __call2004100_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call2004101_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call2004102_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call2004103_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call2004104_0(java.io.FileNotFoundException a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call2004105_0() throws Throwable;
private static native org.tinylog.TaggedLogger __call2004105_1(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.String __invokedynamic2004105_2(int a0, long a1) throws Throwable;
private static native void __call2004105_4(org.tinylog.TaggedLogger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_3e88e49be80830992552(com.moon.eV a0, java.lang.String a1) throws E;
private static final class __SourceHandler_3e88e49be80830992552 {

public static void f452(com.moon.eV receiver, java.lang.String p0) throws Throwable {
    java.util.Map forwardValue452_23_0;
    java.lang.String forwardValue452_23_1;
    java.util.Map spill452_0;
    java.lang.String spill452_1;
    long life2_3;
    int[] life4_5;
    forward_join_23: {
    forward_join_20: {
    life2_3 = (__fieldRead452_0() ^ 86183550150304L);
    life4_5 = __call452_1();
    spill452_0 = __fieldRead452_2(receiver);
    spill452_1 = p0;
    if (!((life4_5 != null))) {
        forwardValue452_23_0 = spill452_0;
        forwardValue452_23_1 = spill452_1;
        break forward_join_23;
    }
    if (!((!__call452_3(spill452_0, spill452_1)))) {
        break forward_join_20;
    }
    __call452_5(__invokedynamic452_4(30199, (3054788831164407251L ^ life2_3)));
    return;
    }
    forwardValue452_23_0 = __fieldRead452_6(receiver);
    forwardValue452_23_1 = p0;
    }
    __call452_7(forwardValue452_23_0, forwardValue452_23_1);
    __call452_9(__fieldRead452_8(receiver));
    return;
}
public static void h452_0(moom.Oo p0) throws Throwable {
    throw __call1045200_0(p0);
}
public static void h452_1(moom.Oo p0) throws Throwable {
    throw __call1045201_0(p0);
}
private static native long __fieldRead452_0() throws Throwable;
private static native int[] __call452_1() throws Throwable;
private static native java.util.Map __fieldRead452_2(com.moon.eV a0) throws Throwable;
private static native boolean __call452_3(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic452_4(int a0, long a1) throws Throwable;
private static native void __call452_5(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead452_6(com.moon.eV a0) throws Throwable;
private static native java.lang.Object __call452_7(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead452_8(com.moon.eV a0) throws Throwable;
private static native void __call452_9(java.util.Map a0) throws Throwable;
private static native java.lang.Exception __call1045200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1045201_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_82cc4429549eb8aecbc1(com.moon.eV a0, java.lang.String a1, java.lang.String a2) throws E;
private static final class __SourceHandler_82cc4429549eb8aecbc1 {

public static void f34(com.moon.eV receiver, java.lang.String p0, java.lang.String p1) throws Throwable {
    java.lang.Object forwardValue34_39_0;
    java.lang.String spill34_0;
    long life3_3;
    int[] life5_5;
    com.moon.eU life6_30;
    forward_join_39: {
    forward_join_34: {
    forward_join_20: {
    forward_join_19: {
    life3_3 = (__fieldRead34_0() ^ 134776633862501L);
    life5_5 = __call34_1();
    if (!((life5_5 != null))) {
        break forward_join_19;
    }
    if (!(__call34_3(__fieldRead34_2(receiver), p0))) {
        break forward_join_20;
    }
    __call34_5(__invokedynamic34_4(3053, (4658765800349674503L ^ life3_3)));
    }
    return;
    }
    life6_30 = new com.moon.eU(p0);
    spill34_0 = p1;
    if (!((life5_5 != null))) {
        forwardValue34_39_0 = spill34_0;
        break forward_join_39;
    }
    if (!((!__call34_6(spill34_0)))) {
        break forward_join_34;
    }
    __call34_7(life6_30, p1);
    }
    forwardValue34_39_0 = __call34_9(__fieldRead34_8(receiver), p0, life6_30);
    }
    __discardScalar34_10(forwardValue34_39_0);
    __call34_12(__fieldRead34_11(receiver));
    return;
}
public static void h34_0(moom.Oo p0) throws Throwable {
    throw __call1003400_0(p0);
}
public static void h34_1(moom.Oo p0) throws Throwable {
    throw __call1003401_0(p0);
}
public static void h34_2(moom.Oo p0) throws Throwable {
    throw __call1003402_0(p0);
}
public static void h34_3(moom.Oo p0) throws Throwable {
    throw __call1003403_0(p0);
}
private static native long __fieldRead34_0() throws Throwable;
private static native int[] __call34_1() throws Throwable;
private static native java.util.Map __fieldRead34_2(com.moon.eV a0) throws Throwable;
private static native boolean __call34_3(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic34_4(int a0, long a1) throws Throwable;
private static native void __call34_5(java.lang.String a0) throws Throwable;
private static native boolean __call34_6(java.lang.String a0) throws Throwable;
private static native com.moon.eU __call34_7(com.moon.eU a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead34_8(com.moon.eV a0) throws Throwable;
private static native java.lang.Object __call34_9(java.util.Map a0, java.lang.String a1, com.moon.eU a2) throws Throwable;
private static native void __discardScalar34_10(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead34_11(com.moon.eV a0) throws Throwable;
private static native void __call34_12(java.util.Map a0) throws Throwable;
private static native java.lang.Exception __call1003400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1003401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1003402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1003403_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.eU __sourceHandlerCall_cae6e0e559e00517e2d0(com.moon.eV a0, net.minecraft.entity.player.EntityPlayer a1) throws E;
private static final class __SourceHandler_cae6e0e559e00517e2d0 {

public static com.moon.eU f35(com.moon.eV receiver, net.minecraft.entity.player.EntityPlayer p0) throws Throwable {
    java.util.Map lexicalValue35_21_0;
    java.lang.Object lexicalValue35_46_0;
    java.lang.Object lexicalValue35_56_0;
    java.util.Map spill35_0;
    java.lang.String spill35_1;
    long life2_3;
    int[] life4_5;
    java.util.Iterator life5_28;
    com.moon.eU life6_35;
    lexical_join_56: {
    lexical_join_51: {
    lexical_join_21: {
    lexical_join_19: {
    life2_3 = (__fieldRead35_0() ^ 102928485795804L);
    life4_5 = __call35_1();
    spill35_0 = __fieldRead35_2(receiver);
    if (!((life4_5 != null))) {
        lexicalValue35_21_0 = spill35_0;
        break lexical_join_21;
    }
    if (!(__call35_3(spill35_0, p0))) {
        break lexical_join_19;
    }
    return __cast35_6(__call35_5(__fieldRead35_4(receiver), p0));
    }
    lexicalValue35_21_0 = __fieldRead35_7(receiver);
    }
    life5_28 = __call35_9(__call35_8(lexicalValue35_21_0));
    lexical_cycle_24: while (true) {
    lexical_join_49: {
    lexical_join_46: {
    if (!(__call35_10(life5_28))) {
        break lexical_join_51;
    }
    life6_35 = __cast35_12(__call35_11(life5_28));
    spill35_1 = __call35_13(p0);
    if (!((life4_5 != null))) {
        lexicalValue35_56_0 = spill35_1;
        break lexical_join_56;
    }
    if (!((life4_5 != null))) {
        lexicalValue35_46_0 = spill35_1;
        break lexical_join_46;
    }
    if (!(__call35_15(spill35_1, __call35_14(life6_35)))) {
        break lexical_join_49;
    }
    lexicalValue35_46_0 = __call35_17(__fieldRead35_16(receiver), p0, life6_35);
    }
    __discardScalar35_18(lexicalValue35_46_0);
    return life6_35;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_24; }
    break lexical_cycle_24;
    }
    }
    lexicalValue35_56_0 = __call35_20(__fieldRead35_19(receiver), p0, null);
    }
    __discardScalar35_21(lexicalValue35_56_0);
    return null;
}
public static void h35_0(moom.Oo p0) throws Throwable {
    throw __call1003500_0(p0);
}
public static void h35_1(moom.Oo p0) throws Throwable {
    throw __call1003501_0(p0);
}
public static void h35_2(moom.Oo p0) throws Throwable {
    throw __call1003502_0(p0);
}
public static void h35_3(moom.Oo p0) throws Throwable {
    throw __call1003503_0(p0);
}
public static void h35_4(moom.Oo p0) throws Throwable {
    throw __call1003504_0(p0);
}
private static native long __fieldRead35_0() throws Throwable;
private static native int[] __call35_1() throws Throwable;
private static native java.util.Map __fieldRead35_2(com.moon.eV a0) throws Throwable;
private static native boolean __call35_3(java.util.Map a0, net.minecraft.entity.player.EntityPlayer a1) throws Throwable;
private static native java.util.Map __fieldRead35_4(com.moon.eV a0) throws Throwable;
private static native java.lang.Object __call35_5(java.util.Map a0, net.minecraft.entity.player.EntityPlayer a1) throws Throwable;
private static native com.moon.eU __cast35_6(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead35_7(com.moon.eV a0) throws Throwable;
private static native java.util.Collection __call35_8(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call35_9(java.util.Collection a0) throws Throwable;
private static native boolean __call35_10(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call35_11(java.util.Iterator a0) throws Throwable;
private static native com.moon.eU __cast35_12(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call35_13(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native java.lang.String __call35_14(com.moon.eU a0) throws Throwable;
private static native boolean __call35_15(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead35_16(com.moon.eV a0) throws Throwable;
private static native java.lang.Object __call35_17(java.util.Map a0, net.minecraft.entity.player.EntityPlayer a1, com.moon.eU a2) throws Throwable;
private static native void __discardScalar35_18(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead35_19(com.moon.eV a0) throws Throwable;
private static native java.lang.Object __call35_20(java.util.Map a0, net.minecraft.entity.player.EntityPlayer a1, java.lang.Object a2) throws Throwable;
private static native void __discardScalar35_21(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1003500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1003501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1003502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1003503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1003504_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_3ffd5c52df922183071e(com.moon.eV a0, net.minecraft.entity.player.EntityPlayer a1) throws E;
private static final class __SourceHandler_3ffd5c52df922183071e {

public static boolean f455(com.moon.eV receiver, net.minecraft.entity.player.EntityPlayer p0) throws Throwable {
    int lexicalValue455_21_0;
    java.util.Map lexicalValue455_24_0;
    int lexicalValue455_51_0;
    int lexicalValue455_61_0;
    int lexicalValue455_66_0;
    java.util.Map spill455_0;
    boolean spill455_1;
    long life2_3;
    int[] life4_5;
    java.util.Iterator life5_34;
    com.moon.eU life6_41;
    lexical_join_66: {
    lexical_join_61: {
    lexical_join_54: {
    lexical_join_24: {
    lexical_join_22: {
    lexical_join_21: {
    lexical_join_20: {
    life2_3 = (__fieldRead455_0() ^ 51785312739387L);
    life4_5 = __call455_1();
    spill455_0 = __fieldRead455_2(receiver);
    if (!((life4_5 != null))) {
        lexicalValue455_24_0 = spill455_0;
        break lexical_join_24;
    }
    if (!(__call455_3(spill455_0, p0))) {
        break lexical_join_22;
    }
    if (!((__call455_5(__fieldRead455_4(receiver), p0) != null))) {
        break lexical_join_20;
    }
    lexicalValue455_21_0 = 1;
    break lexical_join_21;
    }
    lexicalValue455_21_0 = 0;
    }
    return __integerCategory455_6(lexicalValue455_21_0);
    }
    lexicalValue455_24_0 = __fieldRead455_7(receiver);
    }
    life5_34 = __call455_9(__call455_8(lexicalValue455_24_0));
    lexical_cycle_27: while (true) {
    lexical_join_52: {
    lexical_join_51: {
    if (!(__call455_10(life5_34))) {
        break lexical_join_54;
    }
    life6_41 = __cast455_12(__call455_11(life5_34));
    spill455_1 = __call455_15(__call455_13(p0), __call455_14(life6_41));
    if (!((life4_5 != null))) {
        lexicalValue455_61_0 = __integerCategory455_16(spill455_1);
        break lexical_join_61;
    }
    if (!((life4_5 != null))) {
        lexicalValue455_51_0 = __integerCategory455_17(spill455_1);
        break lexical_join_51;
    }
    if (!(spill455_1)) {
        break lexical_join_52;
    }
    __call455_19(__fieldRead455_18(receiver), p0, life6_41);
    lexicalValue455_51_0 = 1;
    }
    return __integerCategory455_20(lexicalValue455_51_0);
    }
    if (!((life4_5 == null))) { continue lexical_cycle_27; }
    break lexical_cycle_27;
    }
    }
    __call455_22(__fieldRead455_21(receiver), p0, null);
    lexicalValue455_61_0 = 0;
    }
    if (!((__call455_23() != null))) {
        lexicalValue455_66_0 = lexicalValue455_61_0;
        break lexical_join_66;
    }
    __call455_24(new int[5]);
    lexicalValue455_66_0 = lexicalValue455_61_0;
    }
    return __integerCategory455_25(lexicalValue455_66_0);
}
public static void h455_0(moom.Oo p0) throws Throwable {
    throw __call1045500_0(p0);
}
public static void h455_1(moom.Oo p0) throws Throwable {
    throw __call1045501_0(p0);
}
public static void h455_2(moom.Oo p0) throws Throwable {
    throw __call1045502_0(p0);
}
public static void h455_3(moom.Oo p0) throws Throwable {
    throw __call1045503_0(p0);
}
public static void h455_4(moom.Oo p0) throws Throwable {
    throw __call1045504_0(p0);
}
public static void h455_5(moom.Oo p0) throws Throwable {
    throw __call1045505_0(p0);
}
public static void h455_6(moom.Oo p0) throws Throwable {
    throw __call1045506_0(p0);
}
private static native long __fieldRead455_0() throws Throwable;
private static native int[] __call455_1() throws Throwable;
private static native java.util.Map __fieldRead455_2(com.moon.eV a0) throws Throwable;
private static native boolean __call455_3(java.util.Map a0, net.minecraft.entity.player.EntityPlayer a1) throws Throwable;
private static native java.util.Map __fieldRead455_4(com.moon.eV a0) throws Throwable;
private static native java.lang.Object __call455_5(java.util.Map a0, net.minecraft.entity.player.EntityPlayer a1) throws Throwable;
private static native boolean __integerCategory455_6(int value) throws Throwable;
private static native java.util.Map __fieldRead455_7(com.moon.eV a0) throws Throwable;
private static native java.util.Collection __call455_8(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call455_9(java.util.Collection a0) throws Throwable;
private static native boolean __call455_10(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call455_11(java.util.Iterator a0) throws Throwable;
private static native com.moon.eU __cast455_12(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call455_13(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native java.lang.String __call455_14(com.moon.eU a0) throws Throwable;
private static native boolean __call455_15(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory455_16(boolean value) throws Throwable;
private static native int __integerCategory455_17(boolean value) throws Throwable;
private static native java.util.Map __fieldRead455_18(com.moon.eV a0) throws Throwable;
private static native java.lang.Object __call455_19(java.util.Map a0, net.minecraft.entity.player.EntityPlayer a1, com.moon.eU a2) throws Throwable;
private static native boolean __integerCategory455_20(int value) throws Throwable;
private static native java.util.Map __fieldRead455_21(com.moon.eV a0) throws Throwable;
private static native java.lang.Object __call455_22(java.util.Map a0, net.minecraft.entity.player.EntityPlayer a1, java.lang.Object a2) throws Throwable;
private static native java.lang.String[] __call455_23() throws Throwable;
private static native void __call455_24(int[] a0) throws Throwable;
private static native boolean __integerCategory455_25(int value) throws Throwable;
private static native java.lang.Exception __call1045500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1045501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1045502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1045503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1045504_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1045505_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1045506_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_3cd7271cc10e1021dd94(com.moon.eV a0, java.io.File a1) throws E;
private static final class __SourceHandler_3cd7271cc10e1021dd94 {

public static void f42(com.moon.eV receiver, java.io.File p0) throws Throwable {
    java.io.File forwardValue42_33_0;
    int[] spill42_0;
    java.io.File spill42_1;
    java.nio.file.Path spill42_2;
    java.lang.String spill42_3;
    java.nio.file.OpenOption[] spill42_4;
    java.nio.file.OpenOption[] spill42_5;
    java.nio.file.OpenOption[] spill42_6;
    long life2_3;
    java.io.File life5_14;
    int[] life4_15;
    java.io.File life6_39;
    java.lang.String life7_52;
    forward_join_33: {
    forward_join_24: {
    life2_3 = (__fieldRead42_0() ^ 77209441974114L);
    spill42_0 = __call42_1();
    life5_14 = new java.io.File(p0, __invokedynamic42_2(5807, (497951322414165836L ^ life2_3)));
    life4_15 = spill42_0;
    spill42_1 = life5_14;
    if (!((life4_15 != null))) {
        forwardValue42_33_0 = spill42_1;
        break forward_join_33;
    }
    if (!((!__call42_3(spill42_1)))) {
        break forward_join_24;
    }
    __call42_4(life5_14);
    }
    forwardValue42_33_0 = new java.io.File(life5_14, __invokedynamic42_5(28930, (8644390472956397797L ^ life2_3)));
    }
    life6_39 = forwardValue42_33_0;
    life7_52 = __call42_11(__fieldRead42_6(), new com.moon.eW(__cast42_10(__call42_9(__call42_8(__fieldRead42_7(receiver)), new com.moon.eU[0]))));
    spill42_2 = __call42_12(life6_39);
    spill42_3 = life7_52;
    java.nio.file.OpenOption[] __stackOp42_13_0 = new java.nio.file.OpenOption[3];
    spill42_4 = __stackOp42_13_0;
    (__stackOp42_13_0)[0] = __fieldRead42_14();
    java.nio.file.OpenOption[] __stackOp42_15_0 = spill42_4;
    spill42_5 = __stackOp42_15_0;
    (__stackOp42_15_0)[1] = __fieldRead42_16();
    java.nio.file.OpenOption[] __stackOp42_17_0 = spill42_5;
    spill42_6 = __stackOp42_17_0;
    (__stackOp42_17_0)[2] = __fieldRead42_18();
    __call42_19(spill42_2, spill42_3, spill42_6);
    return;
}
public static void h42_0(java.io.IOException p0) throws Throwable {
    throw __call2004200_0(p0);
}
public static void h42_1(java.io.IOException p0) throws Throwable {
    throw __call2004201_0(p0);
}
public static void h42_2(java.io.IOException p0, long p1) throws Throwable {
    java.io.IOException local3 = p0;
    org.tinylog.TaggedLogger spill2004202_0 = __call2004202_1(__call2004202_0());
    java.lang.String spill2004202_1 = __invokedynamic2004202_2(5213, (5461654805204610495L ^ p1));
    java.lang.Object[] __stackOp2004202_3_0 = new java.lang.Object[1];
    java.lang.Object[] spill2004202_2 = __stackOp2004202_3_0;
    (__stackOp2004202_3_0)[0] = local3;
    __call2004202_4(spill2004202_0, spill2004202_1, spill2004202_2);
    return;
}
private static native long __fieldRead42_0() throws Throwable;
private static native int[] __call42_1() throws Throwable;
private static native java.lang.String __invokedynamic42_2(int a0, long a1) throws Throwable;
private static native boolean __call42_3(java.io.File a0) throws Throwable;
private static native boolean __call42_4(java.io.File a0) throws Throwable;
private static native java.lang.String __invokedynamic42_5(int a0, long a1) throws Throwable;
private static native com.google.gson.Gson __fieldRead42_6() throws Throwable;
private static native java.util.Map __fieldRead42_7(com.moon.eV a0) throws Throwable;
private static native java.util.Collection __call42_8(java.util.Map a0) throws Throwable;
private static native java.lang.Object[] __call42_9(java.util.Collection a0, com.moon.eU[] a1) throws Throwable;
private static native com.moon.eU[] __cast42_10(java.lang.Object[] a0) throws Throwable;
private static native java.lang.String __call42_11(com.google.gson.Gson a0, com.moon.eW a1) throws Throwable;
private static native java.nio.file.Path __call42_12(java.io.File a0) throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead42_14() throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead42_16() throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead42_18() throws Throwable;
private static native java.nio.file.Path __call42_19(java.nio.file.Path a0, java.lang.String a1, java.nio.file.OpenOption[] a2) throws Throwable;
private static native java.lang.Exception __call2004200_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2004201_0(java.io.IOException a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call2004202_0() throws Throwable;
private static native org.tinylog.TaggedLogger __call2004202_1(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.String __invokedynamic2004202_2(int a0, long a1) throws Throwable;
private static native void __call2004202_4(org.tinylog.TaggedLogger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;

}


public java.util.Map<net.minecraft.entity.player.EntityPlayer, com.moon.eU> b() {
return this.c;
}


public static void b(int[] p0) {
d = ((int[])(p0));
    return;
}


public static int[] b__ArrayInt() {
return com.moon.eV.d;
}


public void b(java.io.File p0) { __sourceHandlerCall_3cd7271cc10e1021dd94(this, p0); }


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
        byte[] spill196_0 = p0;
        life4_9 += 1;
        life5_44 = (spill196_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill196_1 = p0;
        life4_9 += 1;
        life5_76 = (spill196_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill196_2 = p0;
        life4_9 += 1;
        life5_91 = (spill196_2)[life4_9];
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


public void a(java.io.File p0) { __sourceHandlerCall_d9fa24bb51f40125527c(this, p0); }


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 10919);
    if (((com.moon.eV.g)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.eV.h)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.eV.h)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/eV", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.eV.f)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.eV.g)[life5_8] = com.moon.eV.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.eV.g)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.eV.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral977_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/eV"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public com.moon.eU a(net.minecraft.entity.player.EntityPlayer p0) { return __sourceHandlerCall_cae6e0e559e00517e2d0(this, p0); }


public boolean a__Boolean(net.minecraft.entity.player.EntityPlayer p0) { return __sourceHandlerCall_3ffd5c52df922183071e(this, p0); }


public java.util.Map<java.lang.String, com.moon.eU> a() {
return this.b;
}


public void a(java.lang.String p0) { __sourceHandlerCall_3e88e49be80830992552(this, p0); }


public void a(java.lang.String p0, java.lang.String p1) { __sourceHandlerCall_82cc4429549eb8aecbc1(this, p0, p1); }


public void a(com.moon.event.TickEvent p0) { __sourceHandlerCall_7dc720fb971eec059106(this, p0); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral977_0() throws E;
}
