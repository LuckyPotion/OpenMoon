package moom;


public class oH extends net.minecraft.client.resources.AbstractResourcePack implements java.io.Closeable {

public static com.google.common.base.Splitter c;

private java.util.zip.ZipFile d;

private static long e;

public oH(java.io.File p0) {
super(p0);
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-2742791477990150012L)), ((long)(7402841683707653172L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(157313755853825L)))));
    long local6_life6 = (moom.oH.e ^ 24388906028507L);
    javax.crypto.Cipher local1_life8;
    javax.crypto.Cipher __sourceSpill953_10 = (local1_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill953_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill953_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill953_13 = new byte[8];
    (__sourceSpill953_13)[0] = ((byte) ((int) (local6_life6 >>> 56)));
    int local2_life14 = 1;
    while ((local2_life14 < 8)) {
        (__sourceSpill953_13)[local2_life14] = ((byte) ((int) ((local6_life6 << (local2_life14 * 8)) >>> 56)));
        local2_life14 += 1;
    }
    byte[] __sourcePreallocation953_15 = __sourceSpill953_13;
    ((javax.crypto.Cipher)(__sourceSpill953_10)).init(((int)(__sourceSpill953_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill953_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation953_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local3_life18 = 4507501892259420251L;
    byte[] __sourceSpill953_19 = new byte[8];
    (__sourceSpill953_19)[0] = ((byte) ((int) (local3_life18 >>> 56)));
    (__sourceSpill953_19)[1] = ((byte) ((int) (local3_life18 >>> 48)));
    (__sourceSpill953_19)[2] = ((byte) ((int) (local3_life18 >>> 40)));
    (__sourceSpill953_19)[3] = ((byte) ((int) (local3_life18 >>> 32)));
    (__sourceSpill953_19)[4] = ((byte) ((int) (local3_life18 >>> 24)));
    (__sourceSpill953_19)[5] = ((byte) ((int) (local3_life18 >>> 16)));
    (__sourceSpill953_19)[6] = ((byte) ((int) (local3_life18 >>> 8)));
    (__sourceSpill953_19)[7] = ((byte) ((int) local3_life18));
    javax.crypto.Cipher __sourceSpill953_20 = local1_life8;
    byte[] local5_life22 = ((javax.crypto.Cipher)(__sourceSpill953_20)).doFinal(((byte[])(__sourceSpill953_19)));
    long local0_life23 = (((((((((((long) (local5_life22)[0]) & 255L) << 56) | ((((long) (local5_life22)[1]) & 255L) << 48)) | ((((long) (local5_life22)[2]) & 255L) << 40)) | ((((long) (local5_life22)[3]) & 255L) << 32)) | ((((long) (local5_life22)[4]) & 255L) << 24)) | ((((long) (local5_life22)[5]) & 255L) << 16)) | ((((long) (local5_life22)[6]) & 255L) << 8)) | (((long) (local5_life22)[7]) & 255L));
    c = ((com.google.common.base.Splitter)(((com.google.common.base.Splitter)(((com.google.common.base.Splitter)(com.google.common.base.Splitter.on(((char)(((int) local0_life23)))))).omitEmptyStrings())).limit(((int)(3)))));
}

private static native <E extends Throwable> boolean __sourceHandlerCall_51413ac0c374414603cd(moom.oH a0, java.lang.String a1) throws E;
private static final class __SourceHandler_51413ac0c374414603cd {

public static boolean f432(moom.oH receiver, java.lang.String p0) throws Throwable {
    long life2_3;
    life2_3 = (__fieldRead432_0() ^ 1494829241263L);
    return ((__call432_2(__call432_1(receiver), p0) != null) ? true : false);
}
public static boolean h432_0(java.io.IOException p0) throws Throwable {
    throw __call2043200_0(p0);
}
public static boolean h432_1(java.io.IOException p0) throws Throwable {
    java.io.IOException local1 = p0;
    return false;
}
private static native long __fieldRead432_0() throws Throwable;
private static native java.util.zip.ZipFile __call432_1(moom.oH a0) throws Throwable;
private static native java.util.zip.ZipEntry __call432_2(java.util.zip.ZipFile a0, java.lang.String a1) throws Throwable;
private static native java.io.IOException __call2043200_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> java.util.Set __sourceHandlerCall_cb2a2385a8171fb76271(moom.oH a0) throws E;
private static final class __SourceHandler_cb2a2385a8171fb76271 {

public static java.util.Set f433(moom.oH receiver) throws Throwable {
    java.lang.Object lexicalValue433_38_0;
    int lexicalValue433_55_0;
    java.util.ArrayList spill433_0;
    boolean spill433_1;
    java.lang.String[] life1_1;
    java.util.zip.ZipFile life2_4;
    java.util.Enumeration life3_11;
    java.util.HashSet life4_13;
    java.util.zip.ZipEntry life5_20;
    java.lang.String life6_23;
    java.util.ArrayList life7_32;
    java.lang.String life8_49;
    lexical_join_58: {
    life1_1 = __call433_0();
    life2_4 = __call433_1(receiver);
    life3_11 = __call433_2(life2_4);
    life4_13 = __call433_3();
    lexical_cycle_10: while (true) {
    lexical_join_56: {
    lexical_join_55: {
    lexical_join_52: {
    lexical_join_38: {
    if (!(__call433_4(life3_11))) {
        break lexical_join_58;
    }
    life5_20 = __cast433_6(__call433_5(life3_11));
    life6_23 = __call433_7(life5_20);
    if (!(__call433_8(life6_23, "assets/"))) {
        break lexical_join_56;
    }
    life7_32 = __call433_11(__call433_10(__fieldRead433_9(), life6_23));
    spill433_0 = life7_32;
    if (!((life1_1 != null))) {
        lexicalValue433_38_0 = spill433_0;
        break lexical_join_38;
    }
    if (!((__call433_12(spill433_0) > 1))) {
        break lexical_join_56;
    }
    lexicalValue433_38_0 = __call433_13(life7_32, 1);
    }
    life8_49 = __cast433_14(lexicalValue433_38_0);
    spill433_1 = __call433_16(life8_49, __call433_15(life8_49));
    if (!((life1_1 != null))) {
        lexicalValue433_55_0 = __integerCategory433_17(spill433_1);
        break lexical_join_55;
    }
    if (!((!spill433_1))) {
        break lexical_join_52;
    }
    __call433_18(receiver, life8_49);
    if (!((life1_1 == null))) {
        break lexical_join_56;
    }
    }
    lexicalValue433_55_0 = __integerCategory433_20(__call433_19(life4_13, life8_49));
    }
    __discardScalar433_21(lexicalValue433_55_0);
    }
    if (!((life1_1 == null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return life4_13;
}
public static java.util.Set h433_0(java.io.IOException p0) throws Throwable {
    java.io.IOException local1 = p0;
    return __call2043300_0();
}
public static java.util.Set h433_1(java.io.IOException p0) throws Throwable {
    throw __call2043301_0(p0);
}
public static java.util.Set h433_2(java.io.IOException p0) throws Throwable {
    throw __call2043302_0(p0);
}
public static java.util.Set h433_3(java.io.IOException p0) throws Throwable {
    throw __call2043303_0(p0);
}
public static java.util.Set h433_4(java.io.IOException p0) throws Throwable {
    throw __call2043304_0(p0);
}
public static java.util.Set h433_5(java.io.IOException p0) throws Throwable {
    throw __call2043305_0(p0);
}
private static native java.lang.String[] __call433_0() throws Throwable;
private static native java.util.zip.ZipFile __call433_1(moom.oH a0) throws Throwable;
private static native java.util.Enumeration __call433_2(java.util.zip.ZipFile a0) throws Throwable;
private static native java.util.HashSet __call433_3() throws Throwable;
private static native boolean __call433_4(java.util.Enumeration a0) throws Throwable;
private static native java.lang.Object __call433_5(java.util.Enumeration a0) throws Throwable;
private static native java.util.zip.ZipEntry __cast433_6(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call433_7(java.util.zip.ZipEntry a0) throws Throwable;
private static native boolean __call433_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native com.google.common.base.Splitter __fieldRead433_9() throws Throwable;
private static native java.lang.Iterable __call433_10(com.google.common.base.Splitter a0, java.lang.String a1) throws Throwable;
private static native java.util.ArrayList __call433_11(java.lang.Iterable a0) throws Throwable;
private static native int __call433_12(java.util.ArrayList a0) throws Throwable;
private static native java.lang.Object __call433_13(java.util.ArrayList a0, int a1) throws Throwable;
private static native java.lang.String __cast433_14(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call433_15(java.lang.String a0) throws Throwable;
private static native boolean __call433_16(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory433_17(boolean value) throws Throwable;
private static native void __call433_18(moom.oH a0, java.lang.String a1) throws Throwable;
private static native boolean __call433_19(java.util.HashSet a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory433_20(boolean value) throws Throwable;
private static native void __discardScalar433_21(int a0) throws Throwable;
private static native java.util.Set __call2043300_0() throws Throwable;
private static native java.io.IOException __call2043301_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call2043302_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call2043303_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call2043304_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call2043305_0(java.io.IOException a0) throws Throwable;

}


protected void finalize() throws java.lang.Throwable {
((moom.oH)(this)).close();
    __sourceIntrinsic_706af74033e4_call22182_1(this);
    return;
}


private static java.io.IOException a(java.io.IOException p0) {
return p0;
}


public java.util.Set<java.lang.String> a__Set() { return __sourceHandlerCall_cb2a2385a8171fb76271(this); }


private java.util.zip.ZipFile a__ZipFile() throws java.io.IOException {
java.util.zip.ZipFile forwardValue3804_20_0;
    java.util.zip.ZipFile spill3804_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_20: {
    forward_join_18: {
    life1_3 = (moom.oH.e ^ 88606064104795L);
    life3_5 = moom.oO.b();
    spill3804_0 = this.d;
    if (!((life3_5 != null))) {
        forwardValue3804_20_0 = spill3804_0;
        break forward_join_20;
    }
    if (!((spill3804_0 == null))) {
        break forward_join_18;
    }
    this.d = ((java.util.zip.ZipFile)(new java.util.zip.ZipFile(this.b)));
    }
    forwardValue3804_20_0 = this.d;
    }
    return forwardValue3804_20_0;
}


protected java.io.InputStream a(java.lang.String p0) throws java.io.IOException {
long local2 = (moom.oH.e ^ 3506509544852L);
    java.util.zip.ZipFile local4 = ((moom.oH)(this)).a__ZipFile();
    java.util.zip.ZipEntry local5 = ((java.util.zip.ZipFile)(local4)).getEntry(((java.lang.String)(p0)));
    if ((local5 == null)) {
        throw new moom.B(this.b, p0);
    }
    return ((java.util.zip.ZipFile)(local4)).getInputStream(((java.util.zip.ZipEntry)(local5)));
}


public boolean a__Boolean(java.lang.String p0) { return __sourceHandlerCall_51413ac0c374414603cd(this, p0); }


public void close() throws java.io.IOException {
java.util.zip.ZipFile forwardValue3805_13_0;
    java.util.zip.ZipFile spill3805_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_17: {
    forward_join_13: {
    life1_3 = (moom.oH.e ^ 57409013204410L);
    life3_5 = moom.oO.b();
    spill3805_0 = this.d;
    if (!((life3_5 != null))) {
        forwardValue3805_13_0 = spill3805_0;
        break forward_join_13;
    }
    if (!((spill3805_0 != null))) {
        break forward_join_17;
    }
    forwardValue3805_13_0 = this.d;
    }
    ((java.util.zip.ZipFile)(forwardValue3805_13_0)).close();
    this.d = ((java.util.zip.ZipFile)(null));
    }
    return;
}


private static native <E extends Throwable> void __sourceIntrinsic_706af74033e4_call22182_1(java.lang.Object a0) throws E;
}
