package com.moon;


public class jP extends com.moon.jN {

private com.moon.jY c;

private static long d;

private static java.lang.String[] e;

private static java.lang.String[] f;

private static java.util.Map g;

public jP() { super((java.lang.String)null); }

private static void __sourceConstructorBody_77f3748ca2e75580(com.moon.jP receiver) throws Throwable {
long local1 = (com.moon.jP.d ^ 87391135025097L);
    com.moon.jP.__sourceConstructorInit_77f3748ca2e75580_0(((com.moon.jP)(receiver)), ((java.lang.String)(__sourceIntrinsic_77f3748ca2e75580_originalDynamicSite1084_1(7282, (5662648726214696579L ^ local1)))));
    ((com.moon.jP)(receiver)).c = ((com.moon.jY)(new com.moon.jY()));
    return;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-4557597693233069992L)), ((long)(-6295260374680878979L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(197316769731020L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.jP.d ^ 12056566593282L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill186_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill186_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill186_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill186_14 = new byte[8];
    (__sourceSpill186_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill186_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation186_16 = __sourceSpill186_14;
    ((javax.crypto.Cipher)(__sourceSpill186_11)).init(((int)(__sourceSpill186_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill186_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation186_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[15];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "À²/äy­ZI°ÛI\fÈDVb¬iýðO7\005¶[Ì\ndZ(ûuÛ±¢\024\020øÈ\017P§ØX¥»vàç -°@<m\\\\Ö\003mßï\001c8\"*×X\021KªüØCôó\024B´B¬\0208ë\bÐÏ¡Ê¢\t9­çEôF\030Ý÷¬Ñjîv±Ñ¿¼ø:`.\rÇ`ÿJ\n) )Û­{Nüq|\"ñ':OÅ\017ÔújÈr\006ñE<.Ó*1áÂ Òr)YC{m\013\002ä\027¢\017\025\003E¡¾E\026:\n´¬¨±U®v\001\020ÊaÇrÀ\177rs~Íz©Þub\020hïë u\177ºL[+ö½éÎ 3\023E3\001©¨÷?<·\"\006\f´ÏZZÌNnÀ\027OðLX01Íá\020áë\024Ûì¹xòÁUB\024|(·)ÿî\fPMg3z\000?ã\tûÈ\032#EÙV\nA;Ë÷(Âr{á<¸(:ç\177ZÀ¥±ð´Ì\001kR\001#`ý¿C/\021l{g'·ékNgH9q_\020~¯6÷äw\naa\024sPÖ"))).length();
    int local5_life24 = 56;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill186_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill186_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill186_29)).doFinal(((byte[])(__sourceSpill186_28)));
        java.lang.String __sourceSpill186_34 = ((java.lang.String)(com.moon.jP.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill186_35 = local9_life19;
        int __sourceSpill186_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill186_35)[__sourceSpill186_36] = __sourceSpill186_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    local8_life23 = ((java.lang.String)((local6_life21 = "Ü\037øtr-åÚ\027å¬Æ×\021\022<Öìõ÷:ÐÑbýµ#3AD·õEZu¼­SU\020á`\" ¼4Ï¤¬t²¯ä"))).length();
    local5_life24 = 40;
    local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill186_41 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill186_42 = local2_life9;
        byte[] local10_life44 = ((javax.crypto.Cipher)(__sourceSpill186_42)).doFinal(((byte[])(__sourceSpill186_41)));
        java.lang.String __sourceSpill186_47 = ((java.lang.String)(com.moon.jP.a(((byte[])(local10_life44))))).intern();
        java.lang.String[] __sourceSpill186_48 = local9_life19;
        int __sourceSpill186_49 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill186_48)[__sourceSpill186_49] = __sourceSpill186_47;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    e = ((java.lang.String[])(local9_life19));
    f = ((java.lang.String[])(new java.lang.String[15]));
}

private static native <E extends Throwable> void __sourceConstructorInit_77f3748ca2e75580_0(com.moon.jP a0, java.lang.String a1) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_1a790f6841a8bafa6687(com.moon.jP a0, org.luaj.vm2.LuaTable a1) throws E;
private static final class __SourceHandler_1a790f6841a8bafa6687 {

public static void f94(com.moon.jP receiver, org.luaj.vm2.LuaTable p0) throws Throwable {
    org.luaj.vm2.LuaTable spill94_0;
    java.lang.String spill94_1;
    com.moon.pF spill94_2;
    org.luaj.vm2.LuaTable spill94_3;
    java.lang.String spill94_4;
    com.moon.pG spill94_5;
    org.luaj.vm2.LuaTable spill94_6;
    java.lang.String spill94_7;
    com.moon.pH spill94_8;
    org.luaj.vm2.LuaTable spill94_9;
    java.lang.String spill94_10;
    com.moon.ry spill94_11;
    org.luaj.vm2.LuaTable spill94_12;
    java.lang.String spill94_13;
    com.moon.pI spill94_14;
    org.luaj.vm2.LuaTable spill94_15;
    java.lang.String spill94_16;
    com.moon.pJ spill94_17;
    org.luaj.vm2.LuaTable spill94_18;
    java.lang.String spill94_19;
    com.moon.pK spill94_20;
    org.luaj.vm2.LuaTable spill94_21;
    java.lang.String spill94_22;
    com.moon.pL spill94_23;
    org.luaj.vm2.LuaTable spill94_24;
    java.lang.String spill94_25;
    com.moon.rz spill94_26;
    org.luaj.vm2.LuaTable spill94_27;
    java.lang.String spill94_28;
    com.moon.ru spill94_29;
    org.luaj.vm2.LuaTable spill94_30;
    java.lang.String spill94_31;
    com.moon.rv spill94_32;
    org.luaj.vm2.LuaTable spill94_33;
    java.lang.String spill94_34;
    com.moon.rw spill94_35;
    org.luaj.vm2.LuaTable spill94_36;
    java.lang.String spill94_37;
    com.moon.rx spill94_38;
    long life2_3;
    life2_3 = (__fieldRead94_0() ^ 15568846376218L);
    spill94_0 = p0;
    spill94_1 = __invokedynamic94_1(3230, (5871878926847198387L ^ life2_3));
    com.moon.pF __stackOp94_3_0 = __sourceUninitializedNEW94_2();
    spill94_2 = __stackOp94_3_0;
    __explicitNewInit94_4(__stackOp94_3_0, receiver);
    __call94_5(spill94_0, spill94_1, spill94_2);
    spill94_3 = p0;
    spill94_4 = __invokedynamic94_6(27471, (893447181891380073L ^ life2_3));
    com.moon.pG __stackOp94_8_0 = __sourceUninitializedNEW94_7();
    spill94_5 = __stackOp94_8_0;
    __explicitNewInit94_9(__stackOp94_8_0, receiver);
    __call94_10(spill94_3, spill94_4, spill94_5);
    spill94_6 = p0;
    spill94_7 = __invokedynamic94_11(2804, (8930267452197192403L ^ life2_3));
    com.moon.pH __stackOp94_13_0 = __sourceUninitializedNEW94_12();
    spill94_8 = __stackOp94_13_0;
    __explicitNewInit94_14(__stackOp94_13_0, receiver);
    __call94_15(spill94_6, spill94_7, spill94_8);
    spill94_9 = p0;
    spill94_10 = __invokedynamic94_16(11787, (6319347416462976548L ^ life2_3));
    com.moon.ry __stackOp94_18_0 = __sourceUninitializedNEW94_17();
    spill94_11 = __stackOp94_18_0;
    __explicitNewInit94_19(__stackOp94_18_0, receiver);
    __call94_20(spill94_9, spill94_10, spill94_11);
    spill94_12 = p0;
    spill94_13 = __invokedynamic94_21(10222, (419816180298837954L ^ life2_3));
    com.moon.pI __stackOp94_23_0 = __sourceUninitializedNEW94_22();
    spill94_14 = __stackOp94_23_0;
    __explicitNewInit94_24(__stackOp94_23_0, receiver);
    __call94_25(spill94_12, spill94_13, spill94_14);
    spill94_15 = p0;
    spill94_16 = __invokedynamic94_26(193, (5503421805291686112L ^ life2_3));
    com.moon.pJ __stackOp94_28_0 = __sourceUninitializedNEW94_27();
    spill94_17 = __stackOp94_28_0;
    __explicitNewInit94_29(__stackOp94_28_0, receiver);
    __call94_30(spill94_15, spill94_16, spill94_17);
    spill94_18 = p0;
    spill94_19 = __invokedynamic94_31(164, (5218932682935257223L ^ life2_3));
    com.moon.pK __stackOp94_33_0 = __sourceUninitializedNEW94_32();
    spill94_20 = __stackOp94_33_0;
    __explicitNewInit94_34(__stackOp94_33_0, receiver);
    __call94_35(spill94_18, spill94_19, spill94_20);
    spill94_21 = p0;
    spill94_22 = __invokedynamic94_36(17221, (1385860634033851245L ^ life2_3));
    com.moon.pL __stackOp94_38_0 = __sourceUninitializedNEW94_37();
    spill94_23 = __stackOp94_38_0;
    __explicitNewInit94_39(__stackOp94_38_0, receiver);
    __call94_40(spill94_21, spill94_22, spill94_23);
    spill94_24 = p0;
    spill94_25 = __invokedynamic94_41(11706, (4833364829738558878L ^ life2_3));
    com.moon.rz __stackOp94_43_0 = __sourceUninitializedNEW94_42();
    spill94_26 = __stackOp94_43_0;
    __explicitNewInit94_44(__stackOp94_43_0, receiver);
    __call94_45(spill94_24, spill94_25, spill94_26);
    spill94_27 = p0;
    spill94_28 = __invokedynamic94_46(17942, (7008796171917495871L ^ life2_3));
    com.moon.ru __stackOp94_48_0 = __sourceUninitializedNEW94_47();
    spill94_29 = __stackOp94_48_0;
    __explicitNewInit94_49(__stackOp94_48_0, receiver);
    __call94_50(spill94_27, spill94_28, spill94_29);
    spill94_30 = p0;
    spill94_31 = __invokedynamic94_51(1078, (5034102469116644376L ^ life2_3));
    com.moon.rv __stackOp94_53_0 = __sourceUninitializedNEW94_52();
    spill94_32 = __stackOp94_53_0;
    __explicitNewInit94_54(__stackOp94_53_0, receiver);
    __call94_55(spill94_30, spill94_31, spill94_32);
    spill94_33 = p0;
    spill94_34 = __invokedynamic94_56(5917, (2285892857577660216L ^ life2_3));
    com.moon.rw __stackOp94_58_0 = __sourceUninitializedNEW94_57();
    spill94_35 = __stackOp94_58_0;
    __explicitNewInit94_59(__stackOp94_58_0, receiver);
    __call94_60(spill94_33, spill94_34, spill94_35);
    spill94_36 = p0;
    spill94_37 = __invokedynamic94_61(13835, (2702648562890341931L ^ life2_3));
    com.moon.rx __stackOp94_63_0 = __sourceUninitializedNEW94_62();
    spill94_38 = __stackOp94_63_0;
    __explicitNewInit94_64(__stackOp94_63_0, receiver);
    __call94_65(spill94_36, spill94_37, spill94_38);
    return;
}
private static native long __fieldRead94_0() throws Throwable;
private static native java.lang.String __invokedynamic94_1(int a0, long a1) throws Throwable;
private static native com.moon.pF __sourceUninitializedNEW94_2() throws Throwable;
private static native void __explicitNewInit94_4(com.moon.pF a0, com.moon.jP a1) throws Throwable;
private static native void __call94_5(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.pF a2) throws Throwable;
private static native java.lang.String __invokedynamic94_6(int a0, long a1) throws Throwable;
private static native com.moon.pG __sourceUninitializedNEW94_7() throws Throwable;
private static native void __explicitNewInit94_9(com.moon.pG a0, com.moon.jP a1) throws Throwable;
private static native void __call94_10(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.pG a2) throws Throwable;
private static native java.lang.String __invokedynamic94_11(int a0, long a1) throws Throwable;
private static native com.moon.pH __sourceUninitializedNEW94_12() throws Throwable;
private static native void __explicitNewInit94_14(com.moon.pH a0, com.moon.jP a1) throws Throwable;
private static native void __call94_15(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.pH a2) throws Throwable;
private static native java.lang.String __invokedynamic94_16(int a0, long a1) throws Throwable;
private static native com.moon.ry __sourceUninitializedNEW94_17() throws Throwable;
private static native void __explicitNewInit94_19(com.moon.ry a0, com.moon.jP a1) throws Throwable;
private static native void __call94_20(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.ry a2) throws Throwable;
private static native java.lang.String __invokedynamic94_21(int a0, long a1) throws Throwable;
private static native com.moon.pI __sourceUninitializedNEW94_22() throws Throwable;
private static native void __explicitNewInit94_24(com.moon.pI a0, com.moon.jP a1) throws Throwable;
private static native void __call94_25(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.pI a2) throws Throwable;
private static native java.lang.String __invokedynamic94_26(int a0, long a1) throws Throwable;
private static native com.moon.pJ __sourceUninitializedNEW94_27() throws Throwable;
private static native void __explicitNewInit94_29(com.moon.pJ a0, com.moon.jP a1) throws Throwable;
private static native void __call94_30(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.pJ a2) throws Throwable;
private static native java.lang.String __invokedynamic94_31(int a0, long a1) throws Throwable;
private static native com.moon.pK __sourceUninitializedNEW94_32() throws Throwable;
private static native void __explicitNewInit94_34(com.moon.pK a0, com.moon.jP a1) throws Throwable;
private static native void __call94_35(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.pK a2) throws Throwable;
private static native java.lang.String __invokedynamic94_36(int a0, long a1) throws Throwable;
private static native com.moon.pL __sourceUninitializedNEW94_37() throws Throwable;
private static native void __explicitNewInit94_39(com.moon.pL a0, com.moon.jP a1) throws Throwable;
private static native void __call94_40(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.pL a2) throws Throwable;
private static native java.lang.String __invokedynamic94_41(int a0, long a1) throws Throwable;
private static native com.moon.rz __sourceUninitializedNEW94_42() throws Throwable;
private static native void __explicitNewInit94_44(com.moon.rz a0, com.moon.jP a1) throws Throwable;
private static native void __call94_45(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.rz a2) throws Throwable;
private static native java.lang.String __invokedynamic94_46(int a0, long a1) throws Throwable;
private static native com.moon.ru __sourceUninitializedNEW94_47() throws Throwable;
private static native void __explicitNewInit94_49(com.moon.ru a0, com.moon.jP a1) throws Throwable;
private static native void __call94_50(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.ru a2) throws Throwable;
private static native java.lang.String __invokedynamic94_51(int a0, long a1) throws Throwable;
private static native com.moon.rv __sourceUninitializedNEW94_52() throws Throwable;
private static native void __explicitNewInit94_54(com.moon.rv a0, com.moon.jP a1) throws Throwable;
private static native void __call94_55(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.rv a2) throws Throwable;
private static native java.lang.String __invokedynamic94_56(int a0, long a1) throws Throwable;
private static native com.moon.rw __sourceUninitializedNEW94_57() throws Throwable;
private static native void __explicitNewInit94_59(com.moon.rw a0, com.moon.jP a1) throws Throwable;
private static native void __call94_60(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.rw a2) throws Throwable;
private static native java.lang.String __invokedynamic94_61(int a0, long a1) throws Throwable;
private static native com.moon.rx __sourceUninitializedNEW94_62() throws Throwable;
private static native void __explicitNewInit94_64(com.moon.rx a0, com.moon.jP a1) throws Throwable;
private static native void __call94_65(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.rx a2) throws Throwable;

}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1910_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/jP"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.jP.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 29827);
    if (((com.moon.jP.f)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.jP.g)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.jP.g)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/jP", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.jP.e)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.jP.f)[life5_8] = com.moon.jP.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.jP.f)[life5_8];
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
        byte[] spill578_0 = p0;
        life4_9 += 1;
        life5_44 = (spill578_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill578_1 = p0;
        life4_9 += 1;
        life5_76 = (spill578_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill578_2 = p0;
        life4_9 += 1;
        life5_91 = (spill578_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public void a(org.luaj.vm2.LuaTable p0) { __sourceHandlerCall_1a790f6841a8bafa6687(this, p0); }


private java.lang.String a(org.luaj.vm2.LuaValue p0) {
org.luaj.vm2.LuaValue forwardValue577_18_0;
    org.luaj.vm2.LuaValue spill577_0;
    long life2_3;
    int life4_5;
    forward_join_18: {
    forward_join_17: {
    life2_3 = (com.moon.jP.d ^ 127065280851911L);
    life4_5 = com.moon.jN.c();
    spill577_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue577_18_0 = spill577_0;
        break forward_join_18;
    }
    if (!(((org.luaj.vm2.LuaValue)(spill577_0)).isnil())) {
        break forward_join_17;
    }
    return __sourceIntrinsic_86999c18b3c5_invokedynamic577_3(6629, (1900493081908785938L ^ life2_3));
    }
    forwardValue577_18_0 = p0;
    }
    return ((org.luaj.vm2.LuaValue)(forwardValue577_18_0)).tojstring();
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_77f3748ca2e75580_originalDynamicSite1084_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1910_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic94_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_86999c18b3c5_invokedynamic577_3(int a0, long a1) throws E;
}
