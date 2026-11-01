package moom;


public class Bt {

public static java.text.SimpleDateFormat a;

private java.util.Map<java.lang.String, moom.Bw> b;

private java.util.Map<java.util.UUID, moom.Bw> c;

private java.util.LinkedList<com.mojang.authlib.GameProfile> d;

private moom.Bl e;

protected com.google.gson.Gson f;

private java.io.File g;

private static java.lang.reflect.ParameterizedType h;

private static long i;

private static long j;

public Bt(moom.Bl p0, java.io.File p1) {
super();
    this.b = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    this.c = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    this.d = ((java.util.LinkedList)(com.google.common.collect.Lists.newLinkedList()));
    this.e = ((moom.Bl)(p0));
    this.g = ((java.io.File)(p1));
    com.google.gson.GsonBuilder local3 = new com.google.gson.GsonBuilder();
    ((com.google.gson.GsonBuilder)(local3)).registerTypeHierarchyAdapter(((java.lang.Class)(moom.Bw.class)), ((java.lang.Object)(new moom.Bx())));
    this.f = ((com.google.gson.Gson)(((com.google.gson.GsonBuilder)(local3)).create()));
    ((moom.Bt)(this)).a();
    return;
}


static {
i = ((long)(((moom._a)(moom._c.a(((long)(6285569123358159229L)), ((long)(-636577758177298359L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(102507235007069L)))));
    long local0_life6 = (moom.Bt.i ^ 60648019445543L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill496_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill496_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill496_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill496_13 = new byte[8];
    (__sourceSpill496_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill496_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation496_15 = __sourceSpill496_13;
    ((javax.crypto.Cipher)(__sourceSpill496_10)).init(((int)(__sourceSpill496_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill496_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation496_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 5196206647163415715L;
    byte[] __sourceSpill496_19 = new byte[8];
    (__sourceSpill496_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill496_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill496_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill496_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill496_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill496_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill496_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill496_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill496_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill496_20)).doFinal(((byte[])(__sourceSpill496_19)));
    j = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    a = ((java.text.SimpleDateFormat)(new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z")));
    h = ((java.lang.reflect.ParameterizedType)(new moom.Bu()));
}

private static native <E extends Throwable> void __sourceHandlerCall_81657e91848c83ff67d4(moom.Bt a0) throws E;
private static final class __SourceHandler_81657e91848c83ff67d4 {

public static void f225(moom.Bt receiver) throws Throwable {
    boolean spill225_0;
    long life1_3;
    java.lang.Object life4_6;
    int life3_7;
    java.io.BufferedReader life4_12;
    java.util.List life5_19;
    java.util.Iterator life6_32;
    moom.Bw life7_39;
    forest_join_54: {
    forest_join_52: {
    life1_3 = (__fieldRead225_0() ^ 62672850720203L);
    spill225_0 = __call225_1();
    life4_6 = null;
    life3_7 = __integerCategory225_2(spill225_0);
    life4_12 = __call225_5(__fieldRead225_3(receiver), __fieldRead225_4());
    life5_19 = __cast225_9(__call225_8(__fieldRead225_6(receiver), life4_12, __fieldRead225_7()));
    __call225_11(__fieldRead225_10(receiver));
    __call225_13(__fieldRead225_12(receiver));
    __call225_15(__fieldRead225_14(receiver));
    life6_32 = __call225_17(__call225_16(life5_19));
    forest_cycle_33: while (true) {
    forest_join_50: {
    if (!(__call225_18(life6_32))) {
        break forest_join_52;
    }
    life7_39 = __cast225_20(__call225_19(life6_32));
    if (!((life3_7 != 0))) {
        break forest_join_54;
    }
    if (!((life7_39 != null))) {
        break forest_join_50;
    }
    __call225_23(receiver, __call225_21(life7_39), __call225_22(life7_39));
    }
    if (!((life3_7 == 0))) {
        continue forest_cycle_33;
    }
    break forest_cycle_33;
    }
    }
    __call225_24(life4_12);
    }
    return;
}
public static void h225_0(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3022500_0(p0);
}
public static void h225_1(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3022501_0(p0);
}
public static void h225_2(java.lang.Exception p0, java.io.BufferedReader p1) throws Throwable {
    java.lang.Exception life2_2;
    life2_2 = p0;
    __call3022502_0(p1);
    return;
}
public static void h225_3(java.lang.Throwable p0, java.io.BufferedReader p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3022503_0(p1);
    throw life2_2;
}
private static native long __fieldRead225_0() throws Throwable;
private static native boolean __call225_1() throws Throwable;
private static native int __integerCategory225_2(boolean value) throws Throwable;
private static native java.io.File __fieldRead225_3(moom.Bt a0) throws Throwable;
private static native java.nio.charset.Charset __fieldRead225_4() throws Throwable;
private static native java.io.BufferedReader __call225_5(java.io.File a0, java.nio.charset.Charset a1) throws Throwable;
private static native com.google.gson.Gson __fieldRead225_6(moom.Bt a0) throws Throwable;
private static native java.lang.reflect.ParameterizedType __fieldRead225_7() throws Throwable;
private static native java.lang.Object __call225_8(com.google.gson.Gson a0, java.io.BufferedReader a1, java.lang.reflect.ParameterizedType a2) throws Throwable;
private static native java.util.List __cast225_9(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead225_10(moom.Bt a0) throws Throwable;
private static native void __call225_11(java.util.Map a0) throws Throwable;
private static native java.util.Map __fieldRead225_12(moom.Bt a0) throws Throwable;
private static native void __call225_13(java.util.Map a0) throws Throwable;
private static native java.util.LinkedList __fieldRead225_14(moom.Bt a0) throws Throwable;
private static native void __call225_15(java.util.LinkedList a0) throws Throwable;
private static native java.util.List __call225_16(java.util.List a0) throws Throwable;
private static native java.util.Iterator __call225_17(java.util.List a0) throws Throwable;
private static native boolean __call225_18(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call225_19(java.util.Iterator a0) throws Throwable;
private static native moom.Bw __cast225_20(java.lang.Object a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call225_21(moom.Bw a0) throws Throwable;
private static native java.util.Date __call225_22(moom.Bw a0) throws Throwable;
private static native void __call225_23(moom.Bt a0, com.mojang.authlib.GameProfile a1, java.util.Date a2) throws Throwable;
private static native void __call225_24(java.io.BufferedReader a0) throws Throwable;
private static native java.lang.Exception __call3022500_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3022501_0(java.io.FileNotFoundException a0) throws Throwable;
private static native void __call3022502_0(java.io.BufferedReader a0) throws Throwable;
private static native void __call3022503_0(java.io.BufferedReader a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_c79d98f170cc07268a97(moom.Bt a0, int a1) throws E;
private static final class __SourceHandler_c79d98f170cc07268a97 {

public static java.util.List f615(moom.Bt receiver, int p0) throws Throwable {
    boolean spill615_0;
    long life2_3;
    java.util.ArrayList life5_6;
    java.util.Iterator life6_14;
    int life4_15;
    com.mojang.authlib.GameProfile life7_22;
    moom.Bw life8_27;
    lexical_join_36: {
    life2_3 = (__fieldRead615_0() ^ 128729493712321L);
    spill615_0 = __call615_1();
    life5_6 = __call615_2();
    life6_14 = __call615_7(__call615_6(__call615_5(__call615_4(__fieldRead615_3(receiver)), p0)));
    life4_15 = __integerCategory615_8(spill615_0);
    lexical_cycle_16: while (true) {
    lexical_join_34: {
    if (!(__call615_9(life6_14))) {
        break lexical_join_36;
    }
    life7_22 = __cast615_11(__call615_10(life6_14));
    life8_27 = __call615_13(receiver, __call615_12(life7_22));
    if (!((life8_27 != null))) {
        break lexical_join_34;
    }
    __call615_14(life5_6, life8_27);
    }
    if (!((life4_15 == 0))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    return life5_6;
}
public static void h615_0(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1061500_0(p0);
}
private static native long __fieldRead615_0() throws Throwable;
private static native boolean __call615_1() throws Throwable;
private static native java.util.ArrayList __call615_2() throws Throwable;
private static native java.util.LinkedList __fieldRead615_3(moom.Bt a0) throws Throwable;
private static native java.util.Iterator __call615_4(java.util.LinkedList a0) throws Throwable;
private static native java.util.Iterator __call615_5(java.util.Iterator a0, int a1) throws Throwable;
private static native java.util.ArrayList __call615_6(java.util.Iterator a0) throws Throwable;
private static native java.util.Iterator __call615_7(java.util.ArrayList a0) throws Throwable;
private static native int __integerCategory615_8(boolean value) throws Throwable;
private static native boolean __call615_9(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call615_10(java.util.Iterator a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __cast615_11(java.lang.Object a0) throws Throwable;
private static native java.util.UUID __call615_12(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native moom.Bw __call615_13(moom.Bt a0, java.util.UUID a1) throws Throwable;
private static native boolean __call615_14(java.util.ArrayList a0, moom.Bw a1) throws Throwable;
private static native java.lang.Exception __call1061500_0(com.google.gson.JsonParseException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_91ac2f710d7e6bb5b7ed(moom.Bt a0, com.mojang.authlib.GameProfile a1, java.util.Date a2) throws E;
private static final class __SourceHandler_91ac2f710d7e6bb5b7ed {

public static void f616(moom.Bt receiver, com.mojang.authlib.GameProfile p0, java.util.Date p1) throws Throwable {
    java.util.Map forwardValue616_75_0;
    java.util.UUID forwardValue616_75_1;
    boolean spill616_0;
    java.util.Map spill616_1;
    java.util.UUID spill616_2;
    long life3_3;
    java.util.UUID life6_7;
    int life5_8;
    java.util.Calendar life7_12;
    java.lang.String life7_29;
    moom.Bw life8_35;
    moom.Bw life9_51;
    forward_join_75: {
    forward_join_63: {
    forward_join_25: {
    life3_3 = (__fieldRead616_0() ^ 9162107058486L);
    spill616_0 = __call616_1();
    life6_7 = __call616_2(p0);
    life5_8 = __integerCategory616_3(spill616_0);
    if (!((p1 == null))) {
        break forward_join_25;
    }
    life7_12 = __call616_4();
    __call616_5(life7_12, new java.util.Date());
    __call616_6(life7_12, 2, 1);
    p1 = __call616_7(life7_12);
    }
    life7_29 = __call616_10(__call616_8(p0), __fieldRead616_9());
    life8_35 = new moom.Bw(p0, p1);
    spill616_1 = __fieldRead616_11(receiver);
    spill616_2 = life6_7;
    if (!((life5_8 == 0))) {
        forwardValue616_75_0 = spill616_1;
        forwardValue616_75_1 = spill616_2;
        break forward_join_75;
    }
    if (!(__call616_12(spill616_1, spill616_2))) {
        break forward_join_63;
    }
    life9_51 = __cast616_15(__call616_14(__fieldRead616_13(receiver), life6_7));
    __call616_21(__fieldRead616_16(receiver), __call616_20(__call616_18(__call616_17(life9_51)), __fieldRead616_19()));
    __call616_23(__fieldRead616_22(receiver), p0);
    }
    __call616_28(__fieldRead616_24(receiver), __call616_27(__call616_25(p0), __fieldRead616_26()), life8_35);
    forwardValue616_75_0 = __fieldRead616_29(receiver);
    forwardValue616_75_1 = life6_7;
    }
    __call616_30(forwardValue616_75_0, forwardValue616_75_1, life8_35);
    __call616_32(__fieldRead616_31(receiver), p0);
    __call616_33(receiver);
    return;
}
public static void h616_0(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1061600_0(p0);
}
private static native long __fieldRead616_0() throws Throwable;
private static native boolean __call616_1() throws Throwable;
private static native java.util.UUID __call616_2(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native int __integerCategory616_3(boolean value) throws Throwable;
private static native java.util.Calendar __call616_4() throws Throwable;
private static native void __call616_5(java.util.Calendar a0, java.util.Date a1) throws Throwable;
private static native void __call616_6(java.util.Calendar a0, int a1, int a2) throws Throwable;
private static native java.util.Date __call616_7(java.util.Calendar a0) throws Throwable;
private static native java.lang.String __call616_8(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native java.util.Locale __fieldRead616_9() throws Throwable;
private static native java.lang.String __call616_10(java.lang.String a0, java.util.Locale a1) throws Throwable;
private static native java.util.Map __fieldRead616_11(moom.Bt a0) throws Throwable;
private static native boolean __call616_12(java.util.Map a0, java.util.UUID a1) throws Throwable;
private static native java.util.Map __fieldRead616_13(moom.Bt a0) throws Throwable;
private static native java.lang.Object __call616_14(java.util.Map a0, java.util.UUID a1) throws Throwable;
private static native moom.Bw __cast616_15(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead616_16(moom.Bt a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call616_17(moom.Bw a0) throws Throwable;
private static native java.lang.String __call616_18(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native java.util.Locale __fieldRead616_19() throws Throwable;
private static native java.lang.String __call616_20(java.lang.String a0, java.util.Locale a1) throws Throwable;
private static native java.lang.Object __call616_21(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.util.LinkedList __fieldRead616_22(moom.Bt a0) throws Throwable;
private static native boolean __call616_23(java.util.LinkedList a0, com.mojang.authlib.GameProfile a1) throws Throwable;
private static native java.util.Map __fieldRead616_24(moom.Bt a0) throws Throwable;
private static native java.lang.String __call616_25(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native java.util.Locale __fieldRead616_26() throws Throwable;
private static native java.lang.String __call616_27(java.lang.String a0, java.util.Locale a1) throws Throwable;
private static native java.lang.Object __call616_28(java.util.Map a0, java.lang.String a1, moom.Bw a2) throws Throwable;
private static native java.util.Map __fieldRead616_29(moom.Bt a0) throws Throwable;
private static native java.lang.Object __call616_30(java.util.Map a0, java.util.UUID a1, moom.Bw a2) throws Throwable;
private static native java.util.LinkedList __fieldRead616_31(moom.Bt a0) throws Throwable;
private static native void __call616_32(java.util.LinkedList a0, com.mojang.authlib.GameProfile a1) throws Throwable;
private static native void __call616_33(moom.Bt a0) throws Throwable;
private static native java.lang.Exception __call1061600_0(com.google.gson.JsonParseException a0) throws Throwable;

}

private static native <E extends Throwable> com.mojang.authlib.GameProfile __sourceHandlerCall_8f44bb9f4436d6a63739(moom.Bt a0, java.lang.String a1) throws E;
private static final class __SourceHandler_8f44bb9f4436d6a63739 {

public static com.mojang.authlib.GameProfile f187(moom.Bt receiver, java.lang.String p0) throws Throwable {
    int forwardValue187_52_0;
    moom.Bw forwardValue187_56_0;
    moom.Bw forwardValue187_60_0;
    moom.Bw forwardValue187_100_0;
    com.mojang.authlib.GameProfile forwardValue187_101_0;
    boolean spill187_0;
    moom.Bw spill187_1;
    int spill187_2;
    moom.Bw spill187_3;
    long life2_3;
    java.lang.String life5_8;
    int life4_9;
    moom.Bw life6_15;
    com.mojang.authlib.GameProfile life7_73;
    com.mojang.authlib.GameProfile life7_89;
    forward_join_101: {
    forward_join_100: {
    forward_join_99: {
    forward_join_93: {
    forward_join_91: {
    forward_join_73: {
    forward_join_60: {
    forward_join_56: {
    forward_join_55: {
    forward_join_52: {
    life2_3 = (__fieldRead187_0() ^ 86776494633318L);
    spill187_0 = __call187_1();
    life5_8 = __call187_3(p0, __fieldRead187_2());
    life4_9 = __integerCategory187_4(spill187_0);
    life6_15 = __cast187_7(__call187_6(__fieldRead187_5(receiver), life5_8));
    spill187_1 = life6_15;
    if (!((life4_9 == 0))) {
        forwardValue187_56_0 = spill187_1;
        break forward_join_56;
    }
    if (!((spill187_1 != null))) {
        break forward_join_55;
    }
    spill187_2 = __numericCompare187_11(__call187_8(new java.util.Date()), __call187_10(__fieldRead187_9(life6_15)));
    if (!((life4_9 == 0))) {
        forwardValue187_52_0 = spill187_2;
        break forward_join_52;
    }
    if (!((spill187_2 >= 0))) {
        break forward_join_55;
    }
    __call187_15(__fieldRead187_12(receiver), __call187_14(__call187_13(life6_15)));
    __call187_21(__fieldRead187_16(receiver), __call187_20(__call187_18(__call187_17(life6_15)), __fieldRead187_19()));
    forwardValue187_52_0 = __integerCategory187_25(__call187_24(__fieldRead187_22(receiver), __call187_23(life6_15)));
    }
    __discardScalar187_26(forwardValue187_52_0);
    life6_15 = null;
    }
    forwardValue187_56_0 = life6_15;
    }
    if (!((life4_9 == 0))) {
        forwardValue187_60_0 = forwardValue187_56_0;
        break forward_join_60;
    }
    if (!((forwardValue187_56_0 != null))) {
        break forward_join_73;
    }
    forwardValue187_60_0 = life6_15;
    }
    life7_73 = __call187_27(forwardValue187_60_0);
    __call187_29(__fieldRead187_28(receiver), life7_73);
    __call187_31(__fieldRead187_30(receiver), life7_73);
    if (!((life4_9 != 0))) {
        break forward_join_91;
    }
    }
    life7_89 = __call187_33(__fieldRead187_32(receiver), life5_8);
    if (!((life4_9 == 0))) {
        break forward_join_93;
    }
    if (!((life7_89 != null))) {
        break forward_join_91;
    }
    __call187_34(receiver, life7_89);
    life6_15 = __cast187_37(__call187_36(__fieldRead187_35(receiver), life5_8));
    }
    __call187_38(receiver);
    }
    spill187_3 = life6_15;
    if (!((life4_9 == 0))) {
        forwardValue187_100_0 = spill187_3;
        break forward_join_100;
    }
    if (!((spill187_3 == null))) {
        break forward_join_99;
    }
    forwardValue187_101_0 = null;
    break forward_join_101;
    }
    forwardValue187_100_0 = life6_15;
    }
    forwardValue187_101_0 = __call187_39(forwardValue187_100_0);
    }
    return forwardValue187_101_0;
}
public static com.mojang.authlib.GameProfile h187_0(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call2018700_0(p0);
}
public static com.mojang.authlib.GameProfile h187_1(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call2018701_0(p0);
}
public static com.mojang.authlib.GameProfile h187_2(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call2018702_0(p0);
}
public static com.mojang.authlib.GameProfile h187_3(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call2018703_0(p0);
}
public static com.mojang.authlib.GameProfile h187_4(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call2018704_0(p0);
}
public static com.mojang.authlib.GameProfile h187_5(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call2018705_0(p0);
}
public static com.mojang.authlib.GameProfile h187_6(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call2018706_0(p0);
}
private static native long __fieldRead187_0() throws Throwable;
private static native boolean __call187_1() throws Throwable;
private static native java.util.Locale __fieldRead187_2() throws Throwable;
private static native java.lang.String __call187_3(java.lang.String a0, java.util.Locale a1) throws Throwable;
private static native int __integerCategory187_4(boolean value) throws Throwable;
private static native java.util.Map __fieldRead187_5(moom.Bt a0) throws Throwable;
private static native java.lang.Object __call187_6(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native moom.Bw __cast187_7(java.lang.Object a0) throws Throwable;
private static native long __call187_8(java.util.Date a0) throws Throwable;
private static native java.util.Date __fieldRead187_9(moom.Bw a0) throws Throwable;
private static native long __call187_10(java.util.Date a0) throws Throwable;
private static native int __numericCompare187_11(long a0, long a1) throws Throwable;
private static native java.util.Map __fieldRead187_12(moom.Bt a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call187_13(moom.Bw a0) throws Throwable;
private static native java.util.UUID __call187_14(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native java.lang.Object __call187_15(java.util.Map a0, java.util.UUID a1) throws Throwable;
private static native java.util.Map __fieldRead187_16(moom.Bt a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call187_17(moom.Bw a0) throws Throwable;
private static native java.lang.String __call187_18(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native java.util.Locale __fieldRead187_19() throws Throwable;
private static native java.lang.String __call187_20(java.lang.String a0, java.util.Locale a1) throws Throwable;
private static native java.lang.Object __call187_21(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.util.LinkedList __fieldRead187_22(moom.Bt a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call187_23(moom.Bw a0) throws Throwable;
private static native boolean __call187_24(java.util.LinkedList a0, com.mojang.authlib.GameProfile a1) throws Throwable;
private static native int __integerCategory187_25(boolean value) throws Throwable;
private static native void __discardScalar187_26(int a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call187_27(moom.Bw a0) throws Throwable;
private static native java.util.LinkedList __fieldRead187_28(moom.Bt a0) throws Throwable;
private static native boolean __call187_29(java.util.LinkedList a0, com.mojang.authlib.GameProfile a1) throws Throwable;
private static native java.util.LinkedList __fieldRead187_30(moom.Bt a0) throws Throwable;
private static native void __call187_31(java.util.LinkedList a0, com.mojang.authlib.GameProfile a1) throws Throwable;
private static native moom.Bl __fieldRead187_32(moom.Bt a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call187_33(moom.Bl a0, java.lang.String a1) throws Throwable;
private static native void __call187_34(moom.Bt a0, com.mojang.authlib.GameProfile a1) throws Throwable;
private static native java.util.Map __fieldRead187_35(moom.Bt a0) throws Throwable;
private static native java.lang.Object __call187_36(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native moom.Bw __cast187_37(java.lang.Object a0) throws Throwable;
private static native void __call187_38(moom.Bt a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call187_39(moom.Bw a0) throws Throwable;
private static native java.lang.Exception __call2018700_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Exception __call2018701_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Exception __call2018702_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Exception __call2018703_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Exception __call2018704_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Exception __call2018705_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Exception __call2018706_0(com.google.gson.JsonParseException a0) throws Throwable;

}

private static native <E extends Throwable> com.mojang.authlib.GameProfile __sourceHandlerCall_c75b5ed5ef0bdfbd0bd5(moom.Bt a0, java.util.UUID a1) throws E;
private static final class __SourceHandler_c75b5ed5ef0bdfbd0bd5 {

public static com.mojang.authlib.GameProfile f617(moom.Bt receiver, java.util.UUID p0) throws Throwable {
    moom.Bw forwardValue617_19_0;
    com.mojang.authlib.GameProfile forwardValue617_20_0;
    boolean spill617_0;
    moom.Bw spill617_1;
    long life2_3;
    moom.Bw life5_10;
    int life4_11;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life2_3 = (__fieldRead617_0() ^ 51389136664412L);
    spill617_0 = __call617_1();
    life5_10 = __cast617_4(__call617_3(__fieldRead617_2(receiver), p0));
    life4_11 = __integerCategory617_5(spill617_0);
    spill617_1 = life5_10;
    if (!((life4_11 != 0))) {
        forwardValue617_19_0 = spill617_1;
        break forward_join_19;
    }
    if (!((spill617_1 == null))) {
        break forward_join_18;
    }
    forwardValue617_20_0 = null;
    break forward_join_20;
    }
    forwardValue617_19_0 = life5_10;
    }
    forwardValue617_20_0 = __call617_6(forwardValue617_19_0);
    }
    return forwardValue617_20_0;
}
public static void h617_0(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1061700_0(p0);
}
public static void h617_1(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1061701_0(p0);
}
private static native long __fieldRead617_0() throws Throwable;
private static native boolean __call617_1() throws Throwable;
private static native java.util.Map __fieldRead617_2(moom.Bt a0) throws Throwable;
private static native java.lang.Object __call617_3(java.util.Map a0, java.util.UUID a1) throws Throwable;
private static native moom.Bw __cast617_4(java.lang.Object a0) throws Throwable;
private static native int __integerCategory617_5(boolean value) throws Throwable;
private static native com.mojang.authlib.GameProfile __call617_6(moom.Bw a0) throws Throwable;
private static native java.lang.Exception __call1061700_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Exception __call1061701_0(com.google.gson.JsonParseException a0) throws Throwable;

}

private static native <E extends Throwable> com.mojang.authlib.GameProfile __sourceHandlerCall_c9e68670d285969fe96e(moom.Bl a0, java.lang.String a1) throws E;
private static final class __SourceHandler_c9e68670d285969fe96e {

public static com.mojang.authlib.GameProfile f618(moom.Bl p0, java.lang.String p1) throws Throwable {
    com.mojang.authlib.GameProfile forwardValue618_53_0;
    boolean spill618_0;
    com.mojang.authlib.GameProfile spill618_1;
    long life2_3;
    com.mojang.authlib.GameProfile[] life5_7;
    int life4_8;
    moom.Bv life6_13;
    java.util.UUID life7_46;
    com.mojang.authlib.GameProfile life8_52;
    forward_join_53: {
    forward_join_50: {
    life2_3 = (__fieldRead618_0() ^ 128584801386598L);
    spill618_0 = __call618_1();
    life5_7 = new com.mojang.authlib.GameProfile[1];
    life4_8 = __integerCategory618_2(spill618_0);
    life6_13 = new moom.Bv(life5_7);
    __call618_5(__call618_3(p0), new java.lang.String[] {p1}, __fieldRead618_4(), life6_13);
    if (!((!__call618_6(p0)))) {
        break forward_join_50;
    }
    spill618_1 = (life5_7)[0];
    if (!((life4_8 == 0))) {
        forwardValue618_53_0 = spill618_1;
        break forward_join_53;
    }
    if (!((spill618_1 == null))) {
        break forward_join_50;
    }
    life7_46 = __call618_7(new com.mojang.authlib.GameProfile(null, p1));
    life8_52 = new com.mojang.authlib.GameProfile(life7_46, p1);
    __call618_8(life6_13, life8_52);
    }
    forwardValue618_53_0 = (life5_7)[0];
    }
    return forwardValue618_53_0;
}
public static void h618_0(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1061800_0(p0);
}
public static void h618_1(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1061801_0(p0);
}
private static native long __fieldRead618_0() throws Throwable;
private static native boolean __call618_1() throws Throwable;
private static native int __integerCategory618_2(boolean value) throws Throwable;
private static native com.mojang.authlib.GameProfileRepository __call618_3(moom.Bl a0) throws Throwable;
private static native com.mojang.authlib.Agent __fieldRead618_4() throws Throwable;
private static native void __call618_5(com.mojang.authlib.GameProfileRepository a0, java.lang.String[] a1, com.mojang.authlib.Agent a2, moom.Bv a3) throws Throwable;
private static native boolean __call618_6(moom.Bl a0) throws Throwable;
private static native java.util.UUID __call618_7(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native void __call618_8(moom.Bv a0, com.mojang.authlib.GameProfile a1) throws Throwable;
private static native java.lang.Exception __call1061800_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Exception __call1061801_0(com.google.gson.JsonParseException a0) throws Throwable;

}

private static native <E extends Throwable> moom.Bw __sourceHandlerCall_e29609072ae4314130d5(moom.Bt a0, java.util.UUID a1) throws E;
private static final class __SourceHandler_e29609072ae4314130d5 {

public static moom.Bw f619(moom.Bt receiver, java.util.UUID p0) throws Throwable {
    moom.Bw forwardValue619_29_0;
    boolean spill619_0;
    moom.Bw spill619_1;
    long life2_3;
    moom.Bw life5_10;
    int life4_11;
    com.mojang.authlib.GameProfile life6_21;
    forward_join_29: {
    forward_join_28: {
    life2_3 = (__fieldRead619_0() ^ 73854020663577L);
    spill619_0 = __call619_1();
    life5_10 = __cast619_4(__call619_3(__fieldRead619_2(receiver), p0));
    life4_11 = __integerCategory619_5(spill619_0);
    spill619_1 = life5_10;
    if (!((life4_11 != 0))) {
        forwardValue619_29_0 = spill619_1;
        break forward_join_29;
    }
    if (!((spill619_1 != null))) {
        break forward_join_28;
    }
    life6_21 = __call619_6(life5_10);
    __call619_8(__fieldRead619_7(receiver), life6_21);
    __call619_10(__fieldRead619_9(receiver), life6_21);
    }
    forwardValue619_29_0 = life5_10;
    }
    return forwardValue619_29_0;
}
public static void h619_0(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1061900_0(p0);
}
private static native long __fieldRead619_0() throws Throwable;
private static native boolean __call619_1() throws Throwable;
private static native java.util.Map __fieldRead619_2(moom.Bt a0) throws Throwable;
private static native java.lang.Object __call619_3(java.util.Map a0, java.util.UUID a1) throws Throwable;
private static native moom.Bw __cast619_4(java.lang.Object a0) throws Throwable;
private static native int __integerCategory619_5(boolean value) throws Throwable;
private static native com.mojang.authlib.GameProfile __call619_6(moom.Bw a0) throws Throwable;
private static native java.util.LinkedList __fieldRead619_7(moom.Bt a0) throws Throwable;
private static native boolean __call619_8(java.util.LinkedList a0, com.mojang.authlib.GameProfile a1) throws Throwable;
private static native java.util.LinkedList __fieldRead619_9(moom.Bt a0) throws Throwable;
private static native void __call619_10(java.util.LinkedList a0, com.mojang.authlib.GameProfile a1) throws Throwable;
private static native java.lang.Exception __call1061900_0(com.google.gson.JsonParseException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_58530307814591529cb5(moom.Bt a0) throws E;
private static final class __SourceHandler_58530307814591529cb5 {

public static void f226(moom.Bt receiver) throws Throwable {
    long life1_3;
    java.lang.String life3_11;
    java.lang.Object life4_13;
    java.io.BufferedWriter life4_18;
    life1_3 = (__fieldRead226_0() ^ 58030083357798L);
    life3_11 = __call226_4(__fieldRead226_1(receiver), __call226_3(receiver, ((int) __fieldRead226_2())));
    life4_13 = null;
    life4_18 = __call226_7(__fieldRead226_5(receiver), __fieldRead226_6());
    __call226_8(life4_18, life3_11);
    __call226_9(life4_18);
    return;
}
public static void h226_0(java.io.IOException p0, java.io.BufferedWriter p1) throws Throwable {
    java.io.IOException life2_2;
    life2_2 = p0;
    __call3022600_0(p1);
    return;
}
public static void h226_1(java.lang.Throwable p0, java.io.BufferedWriter p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3022601_0(p1);
    throw life2_2;
}
private static native long __fieldRead226_0() throws Throwable;
private static native com.google.gson.Gson __fieldRead226_1(moom.Bt a0) throws Throwable;
private static native long __fieldRead226_2() throws Throwable;
private static native java.util.List __call226_3(moom.Bt a0, int a1) throws Throwable;
private static native java.lang.String __call226_4(com.google.gson.Gson a0, java.util.List a1) throws Throwable;
private static native java.io.File __fieldRead226_5(moom.Bt a0) throws Throwable;
private static native java.nio.charset.Charset __fieldRead226_6() throws Throwable;
private static native java.io.BufferedWriter __call226_7(java.io.File a0, java.nio.charset.Charset a1) throws Throwable;
private static native void __call226_8(java.io.BufferedWriter a0, java.lang.String a1) throws Throwable;
private static native void __call226_9(java.io.BufferedWriter a0) throws Throwable;
private static native void __call3022600_0(java.io.BufferedWriter a0) throws Throwable;
private static native void __call3022601_0(java.io.BufferedWriter a0) throws Throwable;

}


public void b() { __sourceHandlerCall_58530307814591529cb5(this); }


public void a() { __sourceHandlerCall_81657e91848c83ff67d4(this); }


private moom.Bw a__Bw(java.util.UUID p0) { return __sourceHandlerCall_e29609072ae4314130d5(this, p0); }


private java.util.List<moom.Bw> a(int p0) { return __sourceHandlerCall_c79d98f170cc07268a97(this, p0); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static com.mojang.authlib.GameProfile a(moom.Bl p0, java.lang.String p1) { return __sourceHandlerCall_c9e68670d285969fe96e(p0, p1); }


public void a(com.mojang.authlib.GameProfile p0) {
((moom.Bt)(this)).a(((com.mojang.authlib.GameProfile)(p0)), ((java.util.Date)(null)));
    return;
}


private void a(com.mojang.authlib.GameProfile p0, java.util.Date p1) { __sourceHandlerCall_91ac2f710d7e6bb5b7ed(this, p0, p1); }


public com.mojang.authlib.GameProfile a(java.lang.String p0) { return __sourceHandlerCall_8f44bb9f4436d6a63739(this, p0); }


public java.lang.String[] a__ArrayString() {
java.util.ArrayList local1 = com.google.common.collect.Lists.newArrayList(((java.lang.Iterable)(((java.util.Map)(this.b)).keySet())));
    return ((java.lang.String[])(((java.util.List)(local1)).toArray(((java.lang.Object[])(new java.lang.String[0])))));
}


public com.mojang.authlib.GameProfile a(java.util.UUID p0) { return __sourceHandlerCall_c75b5ed5ef0bdfbd0bd5(this, p0); }

}
