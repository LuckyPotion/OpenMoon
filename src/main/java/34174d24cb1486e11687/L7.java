package moom;


public class L7 {

private java.lang.String a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

public L7(java.lang.String p0) {
super();
    this.a = null;
    this.a = p0;
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(-5245278928370555791L)), ((long)(7768188624336950045L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(241579459642116L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.L7.b ^ 75158023007280L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill798_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill798_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill798_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill798_14 = new byte[8];
    (__sourceSpill798_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill798_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation798_16 = __sourceSpill798_14;
    ((javax.crypto.Cipher)(__sourceSpill798_11)).init(((int)(__sourceSpill798_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill798_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation798_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[17];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "_\rIÝdÅù¸,Y»ê«0C0dÒ\027\fU°¦\006\037\031q¨Ô8¾^þ3GÊ\035È\fö\033aK\005mHm½ÎÏ~{\f\003J\031\r\002a°\020g\037 ={bUðWðeMÁ\003\020ð&\027\\/Þû\013ù)¬\003Ñ\020IQhQ\016àÿÆ\032çóµÁ\020èðW8\027\0034d,VÉä\nÝp\020<ã,\n<Ùæ¬ÄÂu\020\031¦AÅ\n¡ùiï·)Z\020¾\023'T*x56ücçÀÑ9\035\020Vªí¶ÜîY¢m\020é¢~u0d>«p\fÆ÷{pØ`\f±÷æY¢#Uú¯á\025|mú\r-ÒG®G#ùË©\033@\023&EíÇ\f\030{\006YæÓÍ²°¬÷ðÿ\033Ã4Å)¢ß\002mCÛ0}h\032õòI¢Ø÷\n&¸Mû{¹ðf¸,kNÀ®¿é\rñìV¯r{GÄ»,\\YrÙÙ\020¨\002áÖãX(èÎz7Å\006'\"\020Ù,c/;fK\035#º%.ØQ"))).length();
    int local5_life24 = 16;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill798_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill798_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill798_29)).doFinal(((byte[])(__sourceSpill798_28)));
        java.lang.String __sourceSpill798_34 = ((java.lang.String)(moom.L7.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill798_35 = local9_life19;
        int __sourceSpill798_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill798_35)[__sourceSpill798_36] = __sourceSpill798_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    local8_life23 = ((java.lang.String)((local6_life21 = "®ù\013t¥¨Lip³2_ô\025\"\013cÆ²bóøN?_/\nm´%8¸¦+{·\ndÖ$:&\021\"B¯³>Säa\"±\b\034\0209Âï¯ÈpI£àö\021¾õ½àñW·Ól\022\rä"))).length();
    local5_life24 = 32;
    local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill798_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill798_43 = local2_life9;
        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill798_43)).doFinal(((byte[])(__sourceSpill798_42)));
        java.lang.String __sourceSpill798_48 = ((java.lang.String)(moom.L7.a(((byte[])(local10_life45))))).intern();
        java.lang.String[] __sourceSpill798_49 = local9_life19;
        int __sourceSpill798_50 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill798_49)[__sourceSpill798_50] = __sourceSpill798_48;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    c = ((java.lang.String[])(local9_life19));
    d = ((java.lang.String[])(new java.lang.String[17]));
}

private static native <E extends Throwable> moom.L6 __sourceHandlerCall_4f172011f6981c5f85b9(moom.L7 a0, com.google.gson.JsonElement a1) throws E;
private static final class __SourceHandler_4f172011f6981c5f85b9 {

public static moom.L6 f105(moom.L7 receiver, com.google.gson.JsonElement p0) throws Throwable {
    com.google.gson.JsonElement lexicalValue105_24_0;
    java.lang.String lexicalValue105_96_0;
    java.lang.String lexicalValue105_114_0;
    java.lang.String lexicalValue105_160_0;
    com.google.gson.JsonElement spill105_0;
    java.lang.String spill105_1;
    java.lang.String spill105_2;
    java.lang.String spill105_3;
    java.lang.String spill105_4;
    java.lang.String spill105_5;
    java.lang.String spill105_6;
    long life2_3;
    java.lang.String life4_5;
    com.google.gson.JsonObject life5_30;
    moom.L6 life6_34;
    com.google.gson.JsonArray life7_43;
    int life8_47;
    com.google.gson.JsonObject life9_56;
    int life10_65;
    java.lang.String life11_80;
    java.lang.String life12_113;
    moom.L_ life13_141;
    java.lang.String life14_162;
    java.awt.image.BufferedImage life15_199;
    moom.DD life16_227;
    lexical_join_193: {
    lexical_join_24: {
    lexical_join_23: {
    life2_3 = (__fieldRead105_0() ^ 65734873291411L);
    life4_5 = __call105_1();
    spill105_0 = p0;
    if (!((life4_5 == null))) {
        lexicalValue105_24_0 = spill105_0;
        break lexical_join_24;
    }
    if (!((spill105_0 == null))) {
        break lexical_join_23;
    }
    java.lang.Object __inlineStack105_4Token;
    throw new com.google.gson.JsonParseException(__invokedynamic105_5(__inlineStack105_4Output0((__inlineStack105_4Token = __inlineStack105_4Pack(__fieldRead105_2(receiver), __invokedynamic105_3(10144, (4935770690505213476L ^ life2_3))))), __inlineStack105_4Output1(__inlineStack105_4Token)));
    }
    lexicalValue105_24_0 = p0;
    }
    life5_30 = __cast105_6(lexicalValue105_24_0);
    life6_34 = new moom.L6();
    life7_43 = __cast105_9(__call105_8(life5_30, __invokedynamic105_7(19516, (8584767358218825142L ^ life2_3))));
    if (!((life7_43 != null))) {
        break lexical_join_193;
    }
    life8_47 = 0;
    lexical_cycle_43: while (true) {
    lexical_join_191: {
    lexical_join_190: {
    lexical_join_187: {
    lexical_join_174: {
    lexical_join_171: {
    lexical_join_161: {
    lexical_join_160: {
    lexical_join_115: {
    lexical_join_114: {
    lexical_join_96: {
    lexical_join_89: {
    if (!((life8_47 < __call105_10(life7_43)))) {
        break lexical_join_193;
    }
    life9_56 = __cast105_12(__call105_11(life7_43, life8_47));
    life10_65 = __integerCategory105_15(__call105_14(life9_56, __invokedynamic105_13(29330, (8855360912609104659L ^ life2_3)), 1));
    if (!((life4_5 == null))) {
        break lexical_join_191;
    }
    if (!((life10_65 != 0))) {
        break lexical_join_190;
    }
    life11_80 = __call105_17(life9_56, __invokedynamic105_16(26152, (5355792214037907373L ^ life2_3)));
    spill105_1 = life11_80;
    if (!((life4_5 == null))) {
        lexicalValue105_96_0 = spill105_1;
        break lexical_join_96;
    }
    if (!((spill105_1 == null))) {
        break lexical_join_89;
    }
    java.lang.String __stackOp105_20_0 = __fieldRead105_18(receiver);
    java.lang.String __stackOp105_20_1 = __invokedynamic105_19(30455, (7391349917541062517L ^ life2_3));
    __call105_22(__invokedynamic105_21(__stackOp105_20_1, __stackOp105_20_0));
    if (!((life4_5 != null))) {
        break lexical_join_190;
    }
    }
    lexicalValue105_96_0 = __call105_24(life9_56, __invokedynamic105_23(30604, (4784031723969205770L ^ life2_3)));
    }
    life12_113 = lexicalValue105_96_0;
    spill105_2 = life12_113;
    if (!((life4_5 == null))) {
        lexicalValue105_114_0 = spill105_2;
        break lexical_join_114;
    }
    if (!((spill105_2 == null))) {
        break lexical_join_115;
    }
    java.lang.String __stackOp105_26_0 = life11_80;
    java.lang.String __stackOp105_26_1 = __invokedynamic105_25(8562, (3063059740853731582L ^ life2_3));
    lexicalValue105_114_0 = __invokedynamic105_28(__stackOp105_26_1, __stackOp105_26_0, __invokedynamic105_27(5226, (8062454412987577833L ^ life2_3)));
    }
    life12_113 = lexicalValue105_114_0;
    }
    life13_141 = __call105_29(receiver, life12_113);
    if (!((life4_5 == null))) {
        break lexical_join_191;
    }
    if (!((life13_141 != null))) {
        break lexical_join_190;
    }
    if (!((!__call105_30(life13_141)))) {
        break lexical_join_187;
    }
    life14_162 = __call105_32(life9_56, __invokedynamic105_31(13162, (598556411090932452L ^ life2_3)));
    spill105_3 = life14_162;
    if (!((life4_5 == null))) {
        lexicalValue105_160_0 = spill105_3;
        break lexical_join_160;
    }
    if (!((spill105_3 == null))) {
        break lexical_join_161;
    }
    java.lang.String __stackOp105_35_0 = life11_80;
    java.lang.String __stackOp105_35_1 = __fieldRead105_33(receiver);
    java.lang.String __stackOp105_35_2 = __invokedynamic105_34(11746, (3199056174612647023L ^ life2_3));
    spill105_4 = __stackOp105_35_2;
    spill105_5 = __stackOp105_35_0;
    spill105_6 = __stackOp105_35_1;
    __discardScalar105_36(__stackOp105_35_2);
    java.lang.String __stackOp105_38_0 = spill105_6;
    java.lang.String __stackOp105_38_1 = __invokedynamic105_37(24094, (3913484027763195806L ^ life2_3));
    lexicalValue105_160_0 = __invokedynamic105_40(spill105_4, spill105_5, __stackOp105_38_1, __stackOp105_38_0, __invokedynamic105_39(6527, (6246659135983532272L ^ life2_3)));
    }
    life14_162 = lexicalValue105_160_0;
    }
    life15_199 = __call105_41(receiver, life14_162);
    if (!((life4_5 == null))) {
        break lexical_join_174;
    }
    if (!((life15_199 == null))) {
        break lexical_join_171;
    }
    if (!((life4_5 != null))) {
        break lexical_join_190;
    }
    }
    __call105_42(life13_141, life15_199);
    }
    life16_227 = new moom.DD(__invokedynamic105_43(4066, (4433459160191938149L ^ life2_3)), life14_162);
    __call105_44(life13_141, life16_227);
    }
    __call105_45(life6_34, life13_141);
    }
    life8_47 += 1;
    }
    if (!((life4_5 != null))) { continue lexical_cycle_43; }
    break lexical_cycle_43;
    }
    }
    return life6_34;
}
private static native long __fieldRead105_0() throws Throwable;
private static native java.lang.String __call105_1() throws Throwable;
private static native java.lang.String __fieldRead105_2(moom.L7 a0) throws Throwable;
private static native java.lang.String __invokedynamic105_3(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack105_4Pack(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack105_4Output0(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack105_4Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic105_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native com.google.gson.JsonObject __cast105_6(com.google.gson.JsonElement a0) throws Throwable;
private static native java.lang.String __invokedynamic105_7(int a0, long a1) throws Throwable;
private static native com.google.gson.JsonElement __call105_8(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native com.google.gson.JsonArray __cast105_9(com.google.gson.JsonElement a0) throws Throwable;
private static native int __call105_10(com.google.gson.JsonArray a0) throws Throwable;
private static native com.google.gson.JsonElement __call105_11(com.google.gson.JsonArray a0, int a1) throws Throwable;
private static native com.google.gson.JsonObject __cast105_12(com.google.gson.JsonElement a0) throws Throwable;
private static native java.lang.String __invokedynamic105_13(int a0, long a1) throws Throwable;
private static native boolean __call105_14(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory105_15(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic105_16(int a0, long a1) throws Throwable;
private static native java.lang.String __call105_17(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead105_18(moom.L7 a0) throws Throwable;
private static native java.lang.String __invokedynamic105_19(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic105_21(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call105_22(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic105_23(int a0, long a1) throws Throwable;
private static native java.lang.String __call105_24(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic105_25(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic105_27(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic105_28(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native moom.L_ __call105_29(moom.L7 a0, java.lang.String a1) throws Throwable;
private static native boolean __call105_30(moom.L_ a0) throws Throwable;
private static native java.lang.String __invokedynamic105_31(int a0, long a1) throws Throwable;
private static native java.lang.String __call105_32(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead105_33(moom.L7 a0) throws Throwable;
private static native java.lang.String __invokedynamic105_34(int a0, long a1) throws Throwable;
private static native void __discardScalar105_36(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic105_37(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic105_39(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic105_40(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String a4) throws Throwable;
private static native java.awt.image.BufferedImage __call105_41(moom.L7 a0, java.lang.String a1) throws Throwable;
private static native void __call105_42(moom.L_ a0, java.awt.image.BufferedImage a1) throws Throwable;
private static native java.lang.String __invokedynamic105_43(int a0, long a1) throws Throwable;
private static native void __call105_44(moom.L_ a0, moom.DD a1) throws Throwable;
private static native void __call105_45(moom.L6 a0, moom.L_ a1) throws Throwable;

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
        byte[] spill2996_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2996_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2996_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2996_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2996_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2996_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 21725);
    if (((moom.L7.d)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.L7.e)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.L7.e)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/L7", life9_51);
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
        life9_116 = ((java.lang.String)((moom.L7.c)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.L7.d)[life5_8] = moom.L7.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.L7.d)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.L7.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5852_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/L7"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public moom.L6 a(com.google.gson.JsonElement p0) { return __sourceHandlerCall_4f172011f6981c5f85b9(this, p0); }


private java.awt.image.BufferedImage a(java.lang.String p0) {
long local2 = (moom.L7.b ^ 102846939060521L);
    java.lang.String local4 = __sourceIntrinsic_a857d166a3eb_invokedynamic4895_2(moom.LU.a(), p0);
    try {
        byte[] local5 = moom.LO.a__ArrayByte(((java.lang.String)(local4)), ((java.net.Proxy)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__Proxy())));
        return javax.imageio.ImageIO.read(((java.io.InputStream)(new java.io.ByteArrayInputStream(local5))));
    } catch (java.io.IOException caught5) {
        int spill4895_0 = 19719;
        java.lang.String spill4895_1 = p0;
        java.lang.String spill4895_2 = ((java.lang.Class)(((java.lang.Object)(caught5)).getClass())).getName();
        java.lang.String local6 = ((java.io.IOException)(caught5)).getMessage();
        java.lang.String local7 = spill4895_2;
        java.lang.String local8 = spill4895_1;
        moom.BU.c(((java.lang.String)(__sourceIntrinsic_a857d166a3eb_invokedynamic4895_13(__sourceIntrinsic_a857d166a3eb_invokedynamic4895_10(spill4895_0, (6738421235041644325L ^ local2)), local8, __sourceIntrinsic_a857d166a3eb_invokedynamic4895_11(26843, (763494486685780714L ^ local2)), local7, __sourceIntrinsic_a857d166a3eb_invokedynamic4895_12(28300, (6920153269737884862L ^ local2)), local6))));
        return null;
    }
}


private moom.L_ a__L_(java.lang.String p0) {
long life2_3;
    java.lang.String life4_7;
    byte[] life5_12;
    java.lang.String life6_18;
    com.google.gson.JsonObject life7_22;
    java.lang.String life8_34;
    java.lang.String life9_35;
    java.lang.String life10_36;
    life2_3 = (moom.L7.b ^ 86910295317388L);
    life4_7 = __sourceIntrinsic_444e9612b11c_invokedynamic4846_2(moom.LU.a(), p0);
    try {
        life5_12 = moom.LO.a__ArrayByte(((java.lang.String)(life4_7)), ((java.net.Proxy)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__Proxy())));
        life6_18 = new java.lang.String(life5_12, java.nio.charset.StandardCharsets.US_ASCII);
        life7_22 = ((com.google.gson.JsonObject)(com.google.gson.JsonParser.parseString(((java.lang.String)(life6_18)))));
        return moom.Ma.a(((com.google.gson.JsonObject)(life7_22)));
    } catch (java.lang.Exception life5_26) {
        int spill4846_0 = 15821;
        java.lang.String spill4846_1 = p0;
        java.lang.String spill4846_2 = ((java.lang.Class)(((java.lang.Object)(life5_26)).getClass())).getName();
        life8_34 = ((java.lang.Exception)(life5_26)).getMessage();
        life9_35 = spill4846_2;
        life10_36 = spill4846_1;
        moom.BU.c(((java.lang.String)(__sourceIntrinsic_444e9612b11c_invokedynamic4846_16(__sourceIntrinsic_444e9612b11c_invokedynamic4846_13(spill4846_0, (5418064597479988571L ^ life2_3)), life10_36, __sourceIntrinsic_444e9612b11c_invokedynamic4846_14(28300, (6920132917934902811L ^ life2_3)), life9_35, __sourceIntrinsic_444e9612b11c_invokedynamic4846_15(28300, (6920132917934902811L ^ life2_3)), life8_34))));
        return null;
    }
}


private static com.google.gson.JsonParseException a(com.google.gson.JsonParseException p0) {
return p0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c4d3caa38155_invokedynamic105_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a857d166a3eb_invokedynamic4895_2(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a857d166a3eb_invokedynamic4895_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a857d166a3eb_invokedynamic4895_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a857d166a3eb_invokedynamic4895_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a857d166a3eb_invokedynamic4895_13(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, java.lang.String a5) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5852_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_444e9612b11c_invokedynamic4846_2(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_444e9612b11c_invokedynamic4846_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_444e9612b11c_invokedynamic4846_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_444e9612b11c_invokedynamic4846_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_444e9612b11c_invokedynamic4846_16(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, java.lang.String a5) throws E;
}
