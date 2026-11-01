package com.moon;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class hY {

private static org.tinylog.TaggedLogger a;

private com.moon.iv b;

private org.lwjgl.util.vector.Matrix4f c;

private java.util.List<com.moon.iX> d;

private java.util.List<com.moon.jA> e;

private com.moon.jb f;

private com.moon.jm g;

private com.moon.jH h;

private com.moon.jG i;

private org.lwjgl.util.vector.Matrix4f j;

private org.lwjgl.util.vector.Matrix4f k;

private int l;

private int m;

private float n;

private float o;

private boolean p;

private boolean q;

private boolean r;

private int s;

private static long t;

private static java.lang.String[] u;

private static java.lang.String[] v;

private static java.util.Map w;

private static long[] x;

private static java.lang.Integer[] y;

private static java.util.Map z;

private static long A;

public hY() { super(); }


private static void __sourceConstructorBody_710fb18f302c9091(com.moon.hY receiver) throws Throwable {

long local1_life2 = (com.moon.hY.t ^ 20209994390103L);

    com.moon.hY.__sourceConstructorInit_710fb18f302c9091_0(((com.moon.hY)(receiver)));

    ((com.moon.hY)(receiver)).b = ((com.moon.iv)(new com.moon.iv(__sourceIntrinsic_710fb18f302c9091_originalDynamicSite16_5(11517, (7472698672779913452L ^ local1_life2)))));

    ((com.moon.hY)(receiver)).c = ((org.lwjgl.util.vector.Matrix4f)(com.moon.hV.a(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)))));

    ((com.moon.hY)(receiver)).d = ((java.util.List)(new java.util.ArrayList()));

    ((com.moon.hY)(receiver)).e = ((java.util.List)(new java.util.ArrayList()));

    ((com.moon.hY)(receiver)).s = ((int)(__sourceIntrinsic_710fb18f302c9091_originalDynamicSite16_12(26759, (4567620374130732181L ^ local1_life2))));

    ((com.moon.hY)(receiver)).n = ((float)(((float) ((moom.ir)(com.moon.nS.a())).a())));

    ((com.moon.hY)(receiver)).o = ((float)(((float) ((moom.ir)(com.moon.nS.a())).b())));

    return;

}



static {
t = ((long)(((moom._a)(moom._c.a(((long)(4762997695378291493L)), ((long)(3289850250842459852L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(257309783996486L)))));
    long local25_life6 = (com.moon.hY.t ^ 78203069436221L);
    w = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local16_life9;
    javax.crypto.Cipher __sourceSpill131_11 = (local16_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill131_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill131_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill131_14 = new byte[8];
    (__sourceSpill131_14)[0] = ((byte) ((int) (local25_life6 >>> 56)));
    int local17_life15 = 1;
    while ((local17_life15 < 8)) {
        (__sourceSpill131_14)[local17_life15] = ((byte) ((int) ((local25_life6 << (local17_life15 * 8)) >>> 56)));
        local17_life15 += 1;
    }
    byte[] __sourcePreallocation131_16 = __sourceSpill131_14;
    ((javax.crypto.Cipher)(__sourceSpill131_11)).init(((int)(__sourceSpill131_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill131_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation131_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local23_life19 = new java.lang.String[3];
    int local21_life20 = 0;
    java.lang.String local20_life21;
    int local22_life23 = ((java.lang.String)((local20_life21 = "]c7\024}\037\025¡&¾àÀ3Ó¶Eê\rÅç2\021óÅÒ\034vEü\036â\027ãîµÎë¢$F§\bðXÖ¾ûg9(Ú\021§\"\036ãó[p85PÅ\020\002èq&Wpû:²±¯tbñö1vÂ¾Ou\024á¹æ<uõ¤(Ö\004ç\177ë\006\026\007\f/.eÐ¤¼M\033_ì=°×Åü=Cÿ>5ÞàÌDXf \007_¬èx_h\026Üh->4ôDFºâ|\026Á\t²\005v[\t\177ÏP8ä\007oVA\037ó<+j¢®päZs÷³%\002\025¿×\033°ã³y´c³Þ©S04\n\t±ÜºX\025³"))).length();
    int local19_life24 = 96;
    int local18_life25 = -1;
    while (true) {
        local18_life25 += 1;
        byte[] __sourceSpill131_28 = ((java.lang.String)(((java.lang.String)(local20_life21)).substring(((int)(local18_life25)), ((int)((local18_life25 + local19_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill131_29 = local16_life9;
        byte[] local24_life31 = ((javax.crypto.Cipher)(__sourceSpill131_29)).doFinal(((byte[])(__sourceSpill131_28)));
        java.lang.String __sourceSpill131_34 = ((java.lang.String)(com.moon.hY.a(((byte[])(local24_life31))))).intern();
        java.lang.String[] __sourceSpill131_35 = local23_life19;
        int __sourceSpill131_36 = local21_life20;
        local21_life20 += 1;
        (__sourceSpill131_35)[__sourceSpill131_36] = __sourceSpill131_34;
        if (!(((local18_life25 = (local18_life25 + local19_life24)) < local22_life23))) { break; }
        local19_life24 = ((java.lang.String)(local20_life21)).charAt(((int)(local18_life25)));
    }
    u = ((java.lang.String[])(local23_life19));
    v = ((java.lang.String[])(new java.lang.String[3]));
    z = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local5_life42;
    javax.crypto.Cipher __sourceSpill131_44 = (local5_life42 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill131_45 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill131_46 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill131_47 = new byte[8];
    (__sourceSpill131_47)[0] = ((byte) ((int) (local25_life6 >>> 56)));
    int local6_life48 = 1;
    while ((local6_life48 < 8)) {
        (__sourceSpill131_47)[local6_life48] = ((byte) ((int) ((local25_life6 << (local6_life48 * 8)) >>> 56)));
        local6_life48 += 1;
    }
    byte[] __sourcePreallocation131_49 = __sourceSpill131_47;
    ((javax.crypto.Cipher)(__sourceSpill131_44)).init(((int)(__sourceSpill131_45)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill131_46)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation131_49)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local11_life52 = new long[3];
    int local8_life53 = 0;
    java.lang.String local9_life54;
    int local10_life56 = ((java.lang.String)((local9_life54 = " Á´¶=dÃíÉ[Å\023êÒ\n»þ¹éµ"))).length();
    int local7_life57 = 0;
    do {
        java.lang.String __sourceSpill131_58 = local9_life54;
        int __sourceSpill131_59 = local7_life57;
        local7_life57 += 8;
        byte[] local12_life62 = ((java.lang.String)(((java.lang.String)(__sourceSpill131_58)).substring(((int)(__sourceSpill131_59)), ((int)(local7_life57))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill131_63 = local11_life52;
        int __sourceSpill131_64 = local8_life53;
        local8_life53 += 1;
        long local13_life65 = (((((((((((long) (local12_life62)[0]) & 255L) << 56) | ((((long) (local12_life62)[1]) & 255L) << 48)) | ((((long) (local12_life62)[2]) & 255L) << 40)) | ((((long) (local12_life62)[3]) & 255L) << 32)) | ((((long) (local12_life62)[4]) & 255L) << 24)) | ((((long) (local12_life62)[5]) & 255L) << 16)) | ((((long) (local12_life62)[6]) & 255L) << 8)) | (((long) (local12_life62)[7]) & 255L));
        byte[] __sourceSpill131_66 = new byte[8];
        (__sourceSpill131_66)[0] = ((byte) ((int) (local13_life65 >>> 56)));
        (__sourceSpill131_66)[1] = ((byte) ((int) (local13_life65 >>> 48)));
        (__sourceSpill131_66)[2] = ((byte) ((int) (local13_life65 >>> 40)));
        (__sourceSpill131_66)[3] = ((byte) ((int) (local13_life65 >>> 32)));
        (__sourceSpill131_66)[4] = ((byte) ((int) (local13_life65 >>> 24)));
        (__sourceSpill131_66)[5] = ((byte) ((int) (local13_life65 >>> 16)));
        (__sourceSpill131_66)[6] = ((byte) ((int) (local13_life65 >>> 8)));
        (__sourceSpill131_66)[7] = ((byte) ((int) local13_life65));
        javax.crypto.Cipher __sourceSpill131_67 = local5_life42;
        byte[] local15_life69 = ((javax.crypto.Cipher)(__sourceSpill131_67)).doFinal(((byte[])(__sourceSpill131_66)));
        (__sourceSpill131_63)[__sourceSpill131_64] = (((((((((((long) (local15_life69)[0]) & 255L) << 56) | ((((long) (local15_life69)[1]) & 255L) << 48)) | ((((long) (local15_life69)[2]) & 255L) << 40)) | ((((long) (local15_life69)[3]) & 255L) << 32)) | ((((long) (local15_life69)[4]) & 255L) << 24)) | ((((long) (local15_life69)[5]) & 255L) << 16)) | ((((long) (local15_life69)[6]) & 255L) << 8)) | (((long) (local15_life69)[7]) & 255L));
    } while ((!(local7_life57 >= local10_life56)));
    x = ((long[])(local11_life52));
    y = ((java.lang.Integer[])(new java.lang.Integer[3]));
    javax.crypto.Cipher local0_life73;
    javax.crypto.Cipher __sourceSpill131_75 = (local0_life73 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill131_76 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill131_77 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill131_78 = new byte[8];
    (__sourceSpill131_78)[0] = ((byte) ((int) (local25_life6 >>> 56)));
    int local1_life79 = 1;
    while ((local1_life79 < 8)) {
        (__sourceSpill131_78)[local1_life79] = ((byte) ((int) ((local25_life6 << (local1_life79 * 8)) >>> 56)));
        local1_life79 += 1;
    }
    byte[] __sourcePreallocation131_80 = __sourceSpill131_78;
    ((javax.crypto.Cipher)(__sourceSpill131_75)).init(((int)(__sourceSpill131_76)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill131_77)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation131_80)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life83 = 5992385069828068264L;
    byte[] __sourceSpill131_84 = new byte[8];
    (__sourceSpill131_84)[0] = ((byte) ((int) (local2_life83 >>> 56)));
    (__sourceSpill131_84)[1] = ((byte) ((int) (local2_life83 >>> 48)));
    (__sourceSpill131_84)[2] = ((byte) ((int) (local2_life83 >>> 40)));
    (__sourceSpill131_84)[3] = ((byte) ((int) (local2_life83 >>> 32)));
    (__sourceSpill131_84)[4] = ((byte) ((int) (local2_life83 >>> 24)));
    (__sourceSpill131_84)[5] = ((byte) ((int) (local2_life83 >>> 16)));
    (__sourceSpill131_84)[6] = ((byte) ((int) (local2_life83 >>> 8)));
    (__sourceSpill131_84)[7] = ((byte) ((int) local2_life83));
    javax.crypto.Cipher __sourceSpill131_85 = local0_life73;
    byte[] local4_life87 = ((javax.crypto.Cipher)(__sourceSpill131_85)).doFinal(((byte[])(__sourceSpill131_84)));
    A = ((long)((((((((((((long) (local4_life87)[0]) & 255L) << 56) | ((((long) (local4_life87)[1]) & 255L) << 48)) | ((((long) (local4_life87)[2]) & 255L) << 40)) | ((((long) (local4_life87)[3]) & 255L) << 32)) | ((((long) (local4_life87)[4]) & 255L) << 24)) | ((((long) (local4_life87)[5]) & 255L) << 16)) | ((((long) (local4_life87)[6]) & 255L) << 8)) | (((long) (local4_life87)[7]) & 255L))));
    a = ((org.tinylog.TaggedLogger)(org.tinylog.Logger.tag(((java.lang.String)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite131_89(18038, (5952692583916144421L ^ local25_life6)))))));
}

private static native <E extends Throwable> void __sourceConstructorInit_710fb18f302c9091_0(com.moon.hY a0) throws E;

public com.moon.hY b(org.lwjgl.util.vector.Matrix4f p0) {
this.k = ((org.lwjgl.util.vector.Matrix4f)(p0));
    return this;
}


public float b() {
return this.o;
}


public int b__Int() {
return this.m;
}


public boolean b__Boolean() {
org.lwjgl.util.vector.Matrix4f forwardValue334_13_0;
    int forwardValue334_17_0;
    org.lwjgl.util.vector.Matrix4f spill334_0;
    long life1_3;
    int[] life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_13: {
    life1_3 = (com.moon.hY.t ^ 55564421720469L);
    life3_5 = com.moon.hW.b__ArrayInt();
    spill334_0 = this.j;
    if (!((life3_5 != null))) {
        forwardValue334_13_0 = spill334_0;
        break forward_join_13;
    }
    if (!((spill334_0 != null))) {
        break forward_join_16;
    }
    forwardValue334_13_0 = this.k;
    }
    if (!((forwardValue334_13_0 != null))) {
        break forward_join_16;
    }
    forwardValue334_17_0 = 1;
    break forward_join_17;
    }
    forwardValue334_17_0 = 0;
    }
    return ((forwardValue334_17_0) != 0);
}


public org.lwjgl.util.vector.Matrix4f b__Matrix4f() {
return this.j;
}


public java.util.List<com.moon.jA> b__List() {
return this.e;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1404_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/hY"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.hY.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x2F63;
        if (y[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = x[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])z.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    z.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/moon/hY", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            hY.y[n2] = n6;
        }
        return y[n2];
}


public com.moon.hY b(boolean p0) {
this.q = ((boolean)(p0));
    return this;
}


public com.moon.hY b(float p0) {
this.o = ((float)(p0));
    return this;
}


public com.moon.hY b(int p0) {
this.m = ((int)(p0));
    return this;
}


public void b__Void() {
((com.moon.jb)(this.f)).a(((org.lwjgl.util.vector.Matrix4f)(this.c)));
    return;
}


public void e() {
int[] spill70_0;
    long life1_3;
    int life4_6;
    java.util.Iterator life5_10;
    int[] life3_11;
    com.moon.iX life6_18;
    java.util.Iterator life5_38;
    com.moon.iX life6_45;
    lexical_join_63: {
    lexical_join_60: {
    lexical_join_32: {
    lexical_join_28: {
    life1_3 = (com.moon.hY.t ^ 86060937334661L);
    spill70_0 = com.moon.hW.b__ArrayInt();
    life4_6 = 0;
    life5_10 = ((java.util.List)(this.d)).iterator();
    life3_11 = spill70_0;
    lexical_cycle_12: while (true) {
    if (!(((java.util.Iterator)(life5_10)).hasNext())) {
        break lexical_join_28;
    }
    life6_18 = ((com.moon.iX)(((java.util.Iterator)(life5_10)).next()));
    life4_6 = (life4_6 + ((com.moon.iX)(life6_18)).a__Int());
    if (!((life3_11 != null))) {
        break lexical_join_32;
    }
    if (!((life3_11 == null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    ((com.moon.iv)(this.b)).a__Void(((int)(life4_6)));
    }
    life5_38 = ((java.util.List)(this.d)).iterator();
    lexical_cycle_36: while (true) {
    if (!(((java.util.Iterator)(life5_38)).hasNext())) {
        break lexical_join_60;
    }
    life6_45 = ((com.moon.iX)(((java.util.Iterator)(life5_38)).next()));
    com.moon.hY __stackOp70_15_0 = this;
    ((com.moon.hY)(__stackOp70_15_0)).m = ((int)((((com.moon.hY)(__stackOp70_15_0)).m + ((com.moon.iX)(life6_45)).a(((com.moon.iv)(this.b)), ((float)(this.n)), ((float)(this.o))))));
    if (!((life3_11 != null))) {
        break lexical_join_63;
    }
    if (!((life3_11 == null))) { continue lexical_cycle_36; }
    break lexical_cycle_36;
    }
    }
    this.q = ((boolean)(true));
    }
    return;
}


public boolean e__Boolean() {
int forwardValue336_13_0;
    int forwardValue336_15_0;
    boolean spill336_0;
    long life1_3;
    int[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (com.moon.hY.t ^ 36684624048104L);
    life3_5 = com.moon.hW.b__ArrayInt();
    spill336_0 = ((java.util.List)(this.e)).isEmpty();
    if (!((life3_5 != null))) {
        forwardValue336_13_0 = ((spill336_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!((!spill336_0))) {
        break forward_join_14;
    }
    forwardValue336_13_0 = 1;
    }
    forwardValue336_15_0 = forwardValue336_13_0;
    break forward_join_15;
    }
    forwardValue336_15_0 = 0;
    }
    return ((forwardValue336_15_0) != 0);
}


public org.lwjgl.util.vector.Matrix4f c__Matrix4f() {
return this.k;
}


public void c__Void() {
((com.moon.jm)(this.g)).a__Void();
    return;
}


public int c() {
return this.s;
}


public com.moon.hY c(boolean p0) {
this.r = ((boolean)(p0));
    return this;
}


public boolean c__Boolean() {
long local1 = (com.moon.hY.t ^ 58966063760463L);
    return ((((this.f != null) ? 1 : 0)) != 0);
}


public com.moon.hY c(int p0) {
this.s = ((int)(p0));
    return this;
}


public boolean h() {
return ((((this.r) ? 1 : 0)) != 0);
}


public void f() {
int forwardValue337_23_0;
    com.moon.hY forwardValue337_59_0;
    boolean spill337_0;
    com.moon.hY spill337_1;
    long life1_3;
    int[] life3_5;
    forward_join_59: {
    forward_join_32: {
    forward_join_23: {
    forward_join_19: {
    life1_3 = (com.moon.hY.t ^ 54290439350740L);
    life3_5 = com.moon.hW.b__ArrayInt();
    spill337_0 = ((com.moon.hY)(this)).a__Boolean();
    if (!((life3_5 != null))) {
        forwardValue337_23_0 = ((spill337_0) ? 1 : 0);
        break forward_join_23;
    }
    if (!((!spill337_0))) {
        break forward_join_19;
    }
    ((org.tinylog.TaggedLogger)(com.moon.hY.a)).error(((java.lang.Object)(__sourceIntrinsic_0e8bb1a2e971_invokedynamic337_5(25697, (3051215094224100826L ^ life1_3)))));
    return;
    }
    spill337_1 = this;
    if (!((life3_5 != null))) {
        forwardValue337_59_0 = spill337_1;
        break forward_join_59;
    }
    forwardValue337_23_0 = ((((com.moon.hY)(spill337_1)).p) ? 1 : 0);
    }
    if (!((forwardValue337_23_0 != 0))) {
        break forward_join_32;
    }
    ((org.tinylog.TaggedLogger)(com.moon.hY.a)).error(((java.lang.Object)(__sourceIntrinsic_0e8bb1a2e971_invokedynamic337_10(4584, (6866980949485250641L ^ life1_3)))));
    return;
    }
    ((com.moon.jH)(this.h)).a(((int)(net.minecraft.client.renderer.OpenGlHelper.R)));
    ((com.moon.jH)(this.h)).a(((int)(net.minecraft.client.renderer.OpenGlHelper.R)), ((long)((((long) ((com.moon.iv)(this.b)).b()) * com.moon.hY.A))), ((int)(__sourceIntrinsic_0e8bb1a2e971_invokedynamic337_20(14601, (4063907214674792090L ^ life1_3)))));
    ((com.moon.jH)(this.h)).a(((int)(net.minecraft.client.renderer.OpenGlHelper.R)), ((long)(0L)), ((com.moon.iv)(this.b)));
    forwardValue337_59_0 = this;
    }
    ((com.moon.hY)(forwardValue337_59_0)).p = ((boolean)(true));
    return;
}


public boolean f__Boolean() {
return ((((this.p) ? 1 : 0)) != 0);
}


public void d() {
((com.moon.jb)(this.f)).b(((org.lwjgl.util.vector.Matrix4f)(this.c)));
    return;
}


public boolean d__Boolean() {
long local1 = (com.moon.hY.t ^ 108906835009571L);
    return ((((this.g != null) ? 1 : 0)) != 0);
}


public void a__Void() {
int[] spill69_0;
    long life1_3;
    java.util.Iterator life4_8;
    int[] life3_9;
    com.moon.jA life5_16;
    lexical_join_21: {
    life1_3 = (com.moon.hY.t ^ 38296746728969L);
    spill69_0 = com.moon.hW.b__ArrayInt();
    life4_8 = ((java.util.List)(this.e)).iterator();
    life3_9 = spill69_0;
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life4_8)).hasNext())) {
        break lexical_join_21;
    }
    life5_16 = ((com.moon.jA)(((java.util.Iterator)(life4_8)).next()));
    ((com.moon.jA)(life5_16)).a__Void();
    if (!((life3_9 == null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


public void a(com.moon.iX p0) {
((java.util.List)(this.d)).add(((java.lang.Object)(p0)));
    return;
}


public com.moon.hY a(int p0) {
this.l = ((int)(p0));
    return this;
}


public com.moon.hY a(float p0) {
this.n = ((float)(p0));
    return this;
}


public void a(com.moon.iw p0) {
return;
}


public com.moon.hY a(boolean p0) {
this.p = ((boolean)(p0));
    return this;
}


public void a(com.moon.jD p0) {
int[] spill67_0;
    long life2_3;
    java.util.Iterator life5_8;
    int[] life4_9;
    com.moon.jA life6_16;
    lexical_join_29: {
    life2_3 = (com.moon.hY.t ^ 129514461460695L);
    spill67_0 = com.moon.hW.b__ArrayInt();
    life5_8 = ((java.util.List)(this.e)).iterator();
    life4_9 = spill67_0;
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life5_8)).hasNext())) {
        break lexical_join_29;
    }
    life6_16 = ((com.moon.jA)(((java.util.Iterator)(life5_8)).next()));
    ((com.moon.jA)(life6_16)).a(((com.moon.jD)(p0)));
    ((com.moon.jA)(life6_16)).a(((float)(this.n)), ((float)(this.o)));
    if (!((life4_9 == null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
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
        byte[] spill331_0 = p0;
        life4_9 += 1;
        life5_44 = (spill331_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill331_1 = p0;
        life4_9 += 1;
        life5_76 = (spill331_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill331_2 = p0;
        life4_9 += 1;
        life5_91 = (spill331_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 24907);
    if (((com.moon.hY.v)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.hY.w)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.hY.w)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/hY", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.hY.u)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.hY.v)[life5_8] = com.moon.hY.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.hY.v)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.hY.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a__Void(float p0) {
((com.moon.iv)(this.b)).a(((float)(p0)));
    this.m += 1;
    return;
}


public void a(com.moon.jA p0) {
((java.util.List)(this.e)).add(((java.lang.Object)(p0)));
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1412_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/hY"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public com.moon.jb a__jb() {
return this.f;
}


public com.moon.jm a__jm() {
return this.g;
}


public com.moon.jH a__jH() {
return this.h;
}


public com.moon.jG a__jG() {
return this.i;
}


public boolean a__Boolean() {
com.moon.hY forwardValue332_12_0;
    int forwardValue332_17_0;
    com.moon.hY spill332_0;
    long life1_3;
    int[] life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_12: {
    life1_3 = (com.moon.hY.t ^ 1991105298917L);
    life3_5 = com.moon.hW.b__ArrayInt();
    spill332_0 = this;
    if (!((life3_5 != null))) {
        forwardValue332_12_0 = spill332_0;
        break forward_join_12;
    }
    if (!((((com.moon.hY)(spill332_0)).i != null))) {
        break forward_join_16;
    }
    forwardValue332_12_0 = this;
    }
    if (!((((com.moon.hY)(forwardValue332_12_0)).h != null))) {
        break forward_join_16;
    }
    forwardValue332_17_0 = 1;
    break forward_join_17;
    }
    forwardValue332_17_0 = 0;
    }
    return ((forwardValue332_17_0) != 0);
}


public com.moon.iv a__iv() {
return this.b;
}


public org.lwjgl.util.vector.Matrix4f a__Matrix4f() {
return this.c;
}


public java.util.List<com.moon.iX> a__List() {
return this.d;
}


public com.moon.hY a(org.lwjgl.util.vector.Matrix4f p0) {
this.j = ((org.lwjgl.util.vector.Matrix4f)(p0));
    return this;
}


public com.moon.hY a(com.moon.jm p0) {
this.g = ((com.moon.jm)(p0));
    return this;
}


public com.moon.hY a(com.moon.jH p0) {
this.h = ((com.moon.jH)(p0));
    return this;
}


public com.moon.hY a(com.moon.jG p0) {
this.i = ((com.moon.jG)(p0));
    return this;
}


public int a__Int() {
return this.l;
}


public float a() {
return this.n;
}


public com.moon.hY a(com.moon.jb p0) {
this.f = ((com.moon.jb)(p0));
    return this;
}


public boolean g__Boolean() {
return ((((this.q) ? 1 : 0)) != 0);
}


public void g() {
com.moon.hY forwardValue338_18_0;
    com.moon.hY spill338_0;
    long life1_3;
    int[] life3_5;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (com.moon.hY.t ^ 94527054875632L);
    life3_5 = com.moon.hW.b__ArrayInt();
    spill338_0 = this;
    if (!((life3_5 != null))) {
        forwardValue338_18_0 = spill338_0;
        break forward_join_18;
    }
    if (!(((com.moon.hY)(spill338_0)).a__Boolean())) {
        break forward_join_17;
    }
    ((com.moon.jH)(this.h)).a__Void();
    ((com.moon.jG)(this.i)).b();
    }
    forwardValue338_18_0 = this;
    }
    ((com.moon.iv)(((com.moon.hY)(forwardValue338_18_0)).b)).b__Void();
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite131_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_710fb18f302c9091_originalDynamicSite16_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_710fb18f302c9091_originalDynamicSite16_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1412_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1404_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0e8bb1a2e971_invokedynamic337_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0e8bb1a2e971_invokedynamic337_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0e8bb1a2e971_invokedynamic337_20(int a0, long a1) throws E;
}
