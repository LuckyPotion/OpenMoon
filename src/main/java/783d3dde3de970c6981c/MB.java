package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class MB {

private int a;

private java.lang.String b;

private moom.bV c;

private moom.MB d;

private moom.Mg e;

private moom.Mh f;

private moom.M1 g;

private java.lang.Boolean[] h;

private int i;

private int j;

private java.lang.String k;

private java.nio.IntBuffer l;

private java.nio.IntBuffer m;

private int n;

private int o;

private boolean[] p;

private static long q;

private static java.lang.String[] r;

private static java.lang.String[] s;

private static java.util.Map t;

private static long[] u;

private static java.lang.Integer[] v;

private static java.util.Map w;

public MB(int p0, java.lang.String p1, moom.bV p2, moom.MB p3) { super(); }


private static void __sourceConstructorBody_869a950fc5003df3(moom.MB receiver, int p0, java.lang.String p1, moom.bV p2, moom.MB p3) throws Throwable {

long local5 = (moom.MB.q ^ 59408407683762L);

    moom.MB.__sourceConstructorInit_869a950fc5003df3_0(((moom.MB)(receiver)));

    ((moom.MB)(receiver)).h = ((java.lang.Boolean[])(new java.lang.Boolean[__sourceIntrinsic_869a950fc5003df3_originalDynamicSite2414_2(14920, (8669360143108108874L ^ local5))]));

    ((moom.MB)(receiver)).p = ((boolean[])(new boolean[__sourceIntrinsic_869a950fc5003df3_originalDynamicSite2414_4(25615, (3271474900592667660L ^ local5))]));

    ((moom.MB)(receiver)).a = ((int)(p0));

    ((moom.MB)(receiver)).b = ((java.lang.String)(p1));

    ((moom.MB)(receiver)).c = ((moom.bV)(p2));

    ((moom.MB)(receiver)).d = ((moom.MB)(p3));

    return;

}



public MB(int p0, java.lang.String p1, moom.bV p2, boolean p3) { super(); }


private static void __sourceConstructorBody_2f81cd2a77bf9cb4(moom.MB receiver, int p0, java.lang.String p1, moom.bV p2, boolean p3) throws Throwable {

long local5_life2 = (moom.MB.q ^ 78566127747637L);

    moom.MB.__sourceConstructorInit_2f81cd2a77bf9cb4_0(((moom.MB)(receiver)));

    ((moom.MB)(receiver)).h = ((java.lang.Boolean[])(new java.lang.Boolean[__sourceIntrinsic_2f81cd2a77bf9cb4_originalDynamicSite573_5(25615, (3271562120655080587L ^ local5_life2))]));

    ((moom.MB)(receiver)).p = ((boolean[])(new boolean[__sourceIntrinsic_2f81cd2a77bf9cb4_originalDynamicSite573_8(25615, (3271562120655080587L ^ local5_life2))]));

    ((moom.MB)(receiver)).a = ((int)(p0));

    ((moom.MB)(receiver)).b = ((java.lang.String)(p1));

    ((moom.MB)(receiver)).c = ((moom.bV)(p2));

    ((moom.MB)(receiver)).d = ((moom.MB)((p3 ? receiver : null)));

    return;

}



static {
q = ((long)(((moom._a)(moom._c.a(((long)(5416502609325487548L)), ((long)(455913873567393389L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(277142860624743L)))));
    t = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.MB.q ^ 138045762681247L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill688_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill688_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill688_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill688_14 = new byte[8];
    (__sourceSpill688_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill688_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation688_16 = __sourceSpill688_14;
    ((javax.crypto.Cipher)(__sourceSpill688_11)).init(((int)(__sourceSpill688_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill688_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation688_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[6];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "\"\023'jH¶£+=Â®÷}FÓ\020xL²¶1¡rh=te¨k e\020ÌÂé¶\032\033ù @¦·ûõ\0203¦,ß²2è¨!\000o\036Ùô"))).length();
    int local16_life24 = 16;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill688_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill688_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill688_29)).doFinal(((byte[])(__sourceSpill688_28)));
        java.lang.String __sourceSpill688_34 = ((java.lang.String)(moom.MB.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill688_35 = local20_life19;
        int __sourceSpill688_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill688_35)[__sourceSpill688_36] = __sourceSpill688_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "\t\023HëúAu}\bzoÕã`§ \"dg¼ù\036ñ;®íú\006\007IbâD¤£#7`^¬ Ü\000á\024}"))).length();
    local16_life24 = 16;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill688_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill688_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill688_42)).doFinal(((byte[])(__sourceSpill688_41)));
        java.lang.String __sourceSpill688_47 = ((java.lang.String)(moom.MB.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill688_48 = local20_life19;
        int __sourceSpill688_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill688_48)[__sourceSpill688_49] = __sourceSpill688_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    r = ((java.lang.String[])(local20_life19));
    s = ((java.lang.String[])(new java.lang.String[6]));
    w = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill688_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill688_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill688_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill688_60 = new byte[8];
    (__sourceSpill688_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill688_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation688_62 = __sourceSpill688_60;
    ((javax.crypto.Cipher)(__sourceSpill688_57)).init(((int)(__sourceSpill688_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill688_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation688_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[2];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "\\0òÑ §[ûù\tC¤"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill688_71 = local4_life67;
        int __sourceSpill688_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill688_71)).substring(((int)(__sourceSpill688_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill688_76 = local6_life65;
        int __sourceSpill688_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill688_79 = new byte[8];
        (__sourceSpill688_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill688_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill688_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill688_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill688_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill688_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill688_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill688_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill688_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill688_80)).doFinal(((byte[])(__sourceSpill688_79)));
        (__sourceSpill688_76)[__sourceSpill688_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    u = ((long[])(local6_life65));
    v = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_869a950fc5003df3_0(moom.MB a0) throws E;
private static native <E extends Throwable> void __sourceConstructorInit_2f81cd2a77bf9cb4_0(moom.MB a0) throws E;

public java.lang.String toString() {
long local1 = (moom.MB.q ^ 42570001553704L);
    java.lang.String __sourceSpill1907_5 = this.b;
    int __sourceSpill1907_6 = this.i;
    int __sourceSpill1907_7 = this.j;
    java.lang.String local3 = ((moom.MB)(this)).c__String();
    int local4 = __sourceSpill1907_7;
    int local5 = __sourceSpill1907_6;
    java.lang.String local6 = __sourceSpill1907_5;
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1907_12(__sourceIntrinsic_a86c261fcdee_originalDynamicSite1907_8(8673, (3300983068252721124L ^ local1)), local6, __sourceIntrinsic_a86c261fcdee_originalDynamicSite1907_9(3175, (2018011530518225507L ^ local1)), local5, __sourceIntrinsic_a86c261fcdee_originalDynamicSite1907_10(13687, (7710495694658329456L ^ local1)), local4, __sourceIntrinsic_a86c261fcdee_originalDynamicSite1907_11(3026, (6774394577560790481L ^ local1)), local3);
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6070_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/MB"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public java.nio.IntBuffer b__IntBuffer() {
return this.m;
}


public java.lang.String b__String() {
return this.k;
}


public int b() {
return this.i;
}


public void b(int p0) {
this.j = ((int)(p0));
    return;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.MB.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x11EA;
        if (v[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = u[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])w.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    w.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/MB", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            MB.v[n2] = n4;
        }
        return v[n2];
}


public void b__Void() {
this.i = ((int)(0));
    this.j = ((int)(0));
    return;
}


public int e() {
return this.o;
}


public void c__Void() {
moom.MB forwardValue2656_21_0;
    int spill2656_0;
    moom.MB spill2656_1;
    long life1_3;
    int life3_14;
    forward_join_28: {
    forward_join_21: {
    life1_3 = (moom.MB.q ^ 35350724602589L);
    spill2656_0 = moom.MS.c();
    this.k = ((java.lang.String)(null));
    this.n = ((int)(0));
    this.o = ((int)(0));
    life3_14 = spill2656_0;
    spill2656_1 = this;
    if (!((life3_14 != 0))) {
        forwardValue2656_21_0 = spill2656_1;
        break forward_join_21;
    }
    if (!((((moom.MB)(spill2656_1)).m == null))) {
        break forward_join_28;
    }
    forwardValue2656_21_0 = this;
    }
    ((moom.MB)(forwardValue2656_21_0)).m = ((java.nio.IntBuffer)(moom.MP.a__IntBuffer(((int)(__sourceIntrinsic_7ac46ee229a8_invokedynamic2656_6(25615, (3271455253828346979L ^ life1_3)))))));
    }
    return;
}


public void c(int p0) {
this.n = ((int)(p0));
    return;
}


public java.lang.String c__String() {
moom.MB lexicalValue948_18_0;
    moom.MB lexicalValue948_33_0;
    moom.MB lexicalValue948_45_0;
    moom.MB lexicalValue948_49_0;
    moom.MB spill948_0;
    moom.MB spill948_1;
    long life1_3;
    int life3_5;
    moom.MB life4_23;
    lexical_join_49: {
    lexical_join_48: {
    lexical_join_18: {
    lexical_join_17: {
    life1_3 = (moom.MB.q ^ 100424682773329L);
    life3_5 = moom.MS.b();
    spill948_0 = this;
    if (!((life3_5 == 0))) {
        lexicalValue948_18_0 = spill948_0;
        break lexical_join_18;
    }
    if (!((((moom.MB)(spill948_0)).i == 0))) {
        break lexical_join_17;
    }
    return __sourceIntrinsic_1b9166c333f3_invokedynamic948_3(24891, (244991638231977284L ^ life1_3));
    }
    lexicalValue948_18_0 = this;
    }
    life4_23 = lexicalValue948_18_0;
    lexical_cycle_19: while (true) {
    lexical_join_45: {
    lexical_join_43: {
    lexical_join_37: {
    lexical_join_33: {
    if (!((((moom.MB)(life4_23)).c() != this.i))) {
        break lexical_join_48;
    }
    spill948_1 = ((moom.MB)(life4_23)).a__MB();
    if (!((life3_5 == 0))) {
        lexicalValue948_49_0 = spill948_1;
        break lexical_join_49;
    }
    if (!((life3_5 == 0))) {
        lexicalValue948_33_0 = spill948_1;
        break lexical_join_33;
    }
    if (!((spill948_1 != null))) {
        break lexical_join_37;
    }
    lexicalValue948_33_0 = ((moom.MB)(life4_23)).a__MB();
    }
    if (!((life3_5 == 0))) {
        lexicalValue948_45_0 = lexicalValue948_33_0;
        break lexical_join_45;
    }
    if (!((lexicalValue948_33_0 == life4_23))) {
        break lexical_join_43;
    }
    }
    return __sourceIntrinsic_1b9166c333f3_invokedynamic948_8(25766, (7626716897668729053L ^ life1_3));
    }
    lexicalValue948_45_0 = ((moom.MB)(life4_23)).a__MB();
    }
    life4_23 = lexicalValue948_45_0;
    if (!((life3_5 != 0))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    lexicalValue948_49_0 = life4_23;
    }
    return ((moom.MB)(lexicalValue948_49_0)).a__String();
}


public int c() {
return this.j;
}


public void d(int p0) {
this.o = ((int)(p0));
    return;
}


public int d() {
return this.n;
}


public void a(moom.MB p0) {
this.i = ((int)(((moom.MB)(p0)).b()));
    this.e = ((moom.Mg)(((moom.MB)(p0)).a__Mg()));
    this.f = ((moom.Mh)(((moom.MB)(p0)).a__Mh()));
    this.g = ((moom.M1)(((moom.MB)(p0)).a__M1()));
    java.lang.System.arraycopy(((java.lang.Object)(((moom.MB)(p0)).a__ArrayBoolean())), ((int)(0)), ((java.lang.Object)(this.h)), ((int)(0)), ((int)((this.h).length)));
    this.k = ((java.lang.String)(((moom.MB)(p0)).b__String()));
    this.l = ((java.nio.IntBuffer)(((moom.MB)(p0)).a__IntBuffer()));
    this.n = ((int)(((moom.MB)(p0)).d()));
    this.o = ((int)(((moom.MB)(p0)).e()));
    java.lang.System.arraycopy(((java.lang.Object)(((moom.MB)(p0)).a__ArrayBoolean_2())), ((int)(0)), ((java.lang.Object)(this.p)), ((int)(0)), ((int)((this.p).length)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public moom.MB a__MB() {
return this.d;
}


public void a(moom.M1 p0) {
this.g = ((moom.M1)(p0));
    return;
}


public java.nio.IntBuffer a__IntBuffer() {
return this.l;
}


public boolean[] a__ArrayBoolean_2() {
return this.p;
}


public void a__Void() {
this.e = ((moom.Mg)(null));
    this.f = ((moom.Mh)(null));
    this.g = ((moom.M1)(null));
    java.util.Arrays.fill(((java.lang.Object[])(this.h)), ((java.lang.Object)(null)));
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6073_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/MB"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.MB.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 19573);
    if (((moom.MB.s)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.MB.t)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.MB.t)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/MB", life9_51);
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
        life9_116 = ((java.lang.String)((moom.MB.r)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.MB.s)[life5_8] = moom.MB.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.MB.s)[life5_8];
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
        byte[] spill3127_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3127_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3127_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3127_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3127_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3127_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public void a(int p0) {
this.i = ((int)(p0));
    return;
}


public java.lang.String a__String() {
return this.b;
}


public java.lang.Boolean[] a__ArrayBoolean() {
return this.h;
}


public moom.M1 a__M1() {
return this.g;
}


public moom.Mh a__Mh() {
return this.f;
}


public moom.Mg a__Mg() {
return this.e;
}


public void a(moom.Mh p0) {
this.f = ((moom.Mh)(p0));
    return;
}


public void a(moom.Mg p0) {
this.e = ((moom.Mg)(p0));
    return;
}


public moom.bV a__bV() {
return this.c;
}


public void a(java.nio.IntBuffer p0) {
this.l = ((java.nio.IntBuffer)(p0));
    return;
}


public void a(java.lang.String p0) {
this.k = ((java.lang.String)(p0));
    return;
}


public int a() {
return this.a;
}


private static native <E extends Throwable> int __sourceIntrinsic_869a950fc5003df3_originalDynamicSite2414_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_869a950fc5003df3_originalDynamicSite2414_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2f81cd2a77bf9cb4_originalDynamicSite573_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2f81cd2a77bf9cb4_originalDynamicSite573_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6073_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6070_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1b9166c333f3_invokedynamic948_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1b9166c333f3_invokedynamic948_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic2656_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1907_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1907_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1907_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1907_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1907_12(java.lang.String a0, java.lang.String a1, java.lang.String a2, int a3, java.lang.String a4, int a5, java.lang.String a6, java.lang.String a7) throws E;
}
