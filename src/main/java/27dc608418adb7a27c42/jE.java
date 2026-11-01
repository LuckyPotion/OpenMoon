package com.moon;


public class jE {

private static final org.tinylog.TaggedLogger a;

private final java.lang.String b;

private final java.util.function.Supplier<com.moon.jD> c;

private int d;

private static java.lang.String e;

private static final long f;

private static final java.lang.String[] g;

private static final java.lang.String[] h;

private static final java.util.Map i;

jE(java.lang.String p0, java.util.function.Supplier<com.moon.jD> p1, int p2) {
super();
    this.b = p0;
    this.c = p1;
    this.d = p2;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(5838337491969654716L)), ((long)(-365677023143567244L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(196801084405413L)))));

    long local9_life6 = (com.moon.jE.f ^ 14093592702804L);

    java.lang.Object __sourceSpill265_8 = null;

    i = ((java.util.Map)(new java.util.HashMap(13)));

    com.moon.jE.b(((java.lang.String)(__sourceSpill265_8)));

    javax.crypto.Cipher local0_life11;

    javax.crypto.Cipher __sourceSpill265_13 = (local0_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill265_14 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill265_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill265_16 = new byte[8];

    (__sourceSpill265_16)[0] = ((byte) ((int) (local9_life6 >>> 56)));

    int local1_life17 = 1;

    while ((local1_life17 < 8)) {

        (__sourceSpill265_16)[local1_life17] = ((byte) ((int) ((local9_life6 << (local1_life17 * 8)) >>> 56)));

        local1_life17 += 1;

    }

    byte[] __sourcePreallocation265_18 = __sourceSpill265_16;

    ((javax.crypto.Cipher)(__sourceSpill265_13)).init(((int)(__sourceSpill265_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill265_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation265_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local7_life21 = new java.lang.String[5];

    int local5_life22 = 0;

    java.lang.String local4_life23;

    int local6_life25 = ((java.lang.String)((local4_life23 = "cj\007û\035ªÿª#{g;\f<b¬P:ní¼ÿÀ¾ÑÇ83J«±'*bÙx»ç¦4\177gG\021ï\000ùÏ2sÜ):7\013­7Ôã¼³\røí}.+ïc$Lö\016\000HSöX1\036Òh¦©Ô@>[\025'ëâíEþÏ1êb9\030éüm\003Z©õIñ\005[aAe/}åé\003ï\017Î\025\022Ïþ\032²\032úÁù Å\025Ý\021ÀxY§LLc°\030í`0Ð6ðø\023Ö'/¶Ç¸uÈbÁåÆú<6Âg¡·Õ\004d.xÁ@ãÍ8>ï: ½ìy\003óÐP}3íë\\æ6ô]ÌËó<÷$\0177Þ\026\033*à~\037Çk\007\035ÔÎª©\fN\001¬\fÇ\tÓ\177¾ævéÈb¢g@»\031«Åe\006±K\rÖM3EÐP(täÄÚ$Ö`aekKý³ eg²[-ê2ó\035^Þ\021tÚXN«óF§\001ÔÁ©í}~Úã\005>öçQn\177bD×ä[\036.cW«%\026?Ï2:ø:\0006\037<zøM`G"))).length();

    int local3_life26 = 216;

    int local2_life27 = -1;

    while (true) {

        local2_life27 += 1;

        byte[] __sourceSpill265_30 = ((java.lang.String)(((java.lang.String)(local4_life23)).substring(((int)(local2_life27)), ((int)((local2_life27 + local3_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill265_31 = local0_life11;

        byte[] local8_life33 = ((javax.crypto.Cipher)(__sourceSpill265_31)).doFinal(((byte[])(__sourceSpill265_30)));

        java.lang.String __sourceSpill265_36 = ((java.lang.String)(com.moon.jE.a(((byte[])(local8_life33))))).intern();

        java.lang.String[] __sourceSpill265_37 = local7_life21;

        int __sourceSpill265_38 = local5_life22;

        local5_life22 += 1;

        (__sourceSpill265_37)[__sourceSpill265_38] = __sourceSpill265_36;

        if (!(((local2_life27 = (local2_life27 + local3_life26)) < local6_life25))) { break; }

        local3_life26 = ((java.lang.String)(local4_life23)).charAt(((int)(local2_life27)));

    }

    local6_life25 = ((java.lang.String)((local4_life23 = "í_¯-F\016JìH0Üö+\024TRàWª\030\032?<ô«Ä°N\025¬ÞÆ\177@F%ÛQ 4*b¥\033?X.Ð\023+\005rø\\+]Rhoþó )$H±\022\002\013è§e¢n`ÅóiüOu5\006ãüAOb|J\006oîäfr;\007Ø¿3<VÏCr\n¦D\020\"\177JQù/dÀ\016f²\036\026ª§^ùã¸`\036!X2oÊFðã\020oªJøgºY¶\t\007¿=¾q\037.\030\02739o»¡×-T&á\n«Yc_òè¥¹Ì2lé>'rñYùGðÅ\035Æ²ÛÄþ©PÙâ"))).length();

    local3_life26 = 88;

    local2_life27 = -1;

    while (true) {

        local2_life27 += 1;

        byte[] __sourceSpill265_44 = ((java.lang.String)(((java.lang.String)(local4_life23)).substring(((int)(local2_life27)), ((int)((local2_life27 + local3_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill265_45 = local0_life11;

        byte[] local8_life47 = ((javax.crypto.Cipher)(__sourceSpill265_45)).doFinal(((byte[])(__sourceSpill265_44)));

        java.lang.String __sourceSpill265_50 = ((java.lang.String)(com.moon.jE.a(((byte[])(local8_life47))))).intern();

        java.lang.String[] __sourceSpill265_51 = local7_life21;

        int __sourceSpill265_52 = local5_life22;

        local5_life22 += 1;

        (__sourceSpill265_51)[__sourceSpill265_52] = __sourceSpill265_50;

        if (!(((local2_life27 = (local2_life27 + local3_life26)) < local6_life25))) { break; }

        local3_life26 = ((java.lang.String)(local4_life23)).charAt(((int)(local2_life27)));

    }

    g = ((java.lang.String[])(local7_life21));

    h = ((java.lang.String[])(new java.lang.String[5]));

    a = ((org.tinylog.TaggedLogger)(org.tinylog.Logger.tag(((java.lang.String)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_57(4631, (698777975183256617L ^ local9_life6)))))));
}


public static java.lang.String b() {
return com.moon.jE.e;
}


public static void b(java.lang.String p0) {
com.moon.jE.e = ((java.lang.String)(p0));
    return;
}


public int a() {
return this.d;
}


public java.util.function.Supplier<com.moon.jD> a__Supplier() {
return this.c;
}


public com.moon.jE a(int p0) {
this.d = ((int)(p0));
    return this;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.jE.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 27753);
    if (((com.moon.jE.h)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.jE.i)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.jE.i)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/jE", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.jE.g)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.jE.h)[life5_8] = com.moon.jE.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.jE.h)[life5_8];
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
        byte[] spill783_0 = p0;
        life4_9 += 1;
        life5_44 = (spill783_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill783_1 = p0;
        life4_9 += 1;
        life5_76 = (spill783_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill783_2 = p0;
        life4_9 += 1;
        life5_91 = (spill783_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1887_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/jE"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(float p0, float p1) {
org.lwjgl.opengl.GL30.glUniform2f(((int)(this.d)), ((float)(p0)), ((float)(p1)));
    return;
}


public void a(float p0, float p1, float p2, float p3) {
long life5_3;
    java.lang.String life7_12;
    life5_3 = (com.moon.jE.f ^ 45791610075959L);
    java.lang.String spill570_0 = com.moon.jE.b();
    org.lwjgl.opengl.GL30.glUniform4f(((int)(this.d)), ((float)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)));
    life7_12 = spill570_0;
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        com.moon.jE.b(((java.lang.String)("edoaG")));
    }
    return;
}


public void a(float[] p0) {
org.lwjgl.opengl.GL30.glUniform1fv(((int)(this.d)), ((float[])(p0)));
    return;
}


public void a(boolean p0, java.nio.FloatBuffer p1) {
org.lwjgl.opengl.GL30.glUniformMatrix4fv(((int)(this.d)), ((boolean)(p0)), ((java.nio.FloatBuffer)(p1)));
    return;
}


public void a__Void() {
org.tinylog.TaggedLogger spill100008_0;
    java.lang.String spill100008_1;
    java.lang.Object[] spill100008_2;
    long life1_3;
    int life3_27;
    forest_join_48: {
    forest_join_47: {
    forest_join_40: {
    forest_join_32: {
    forest_join_16: {
    life1_3 = (com.moon.jE.f ^ 128092607440688L);
    if (!((((java.util.function.Supplier)(this.c)).get() == null))) {
        break forest_join_16;
    }
    ((org.tinylog.TaggedLogger)(com.moon.jE.a)).error(((java.lang.Object)(__sourceIntrinsic_b82a5b29b709_invokedynamic100008_4(29172, (2331070791407830957L ^ life1_3)))));
    return;
    }
    this.d = ((int)(org.lwjgl.opengl.GL20.glGetUniformLocation(((int)(((com.moon.jD)(((com.moon.jD)(((java.util.function.Supplier)(this.c)).get())))).a())), ((java.lang.CharSequence)(this.b)))));
    life3_27 = org.lwjgl.opengl.GL11.glGetError();
    if (!((life3_27 != 0))) {
        break forest_join_48;
    }
    switch (life3_27) {
case 1282:
{
        break forest_join_32;
    }
case 1281:
{
        break forest_join_40;
    }
default:
{
        break forest_join_47;
    }
}
    }
    ((org.tinylog.TaggedLogger)(com.moon.jE.a)).error(((java.lang.Object)(__sourceIntrinsic_b82a5b29b709_invokedynamic100008_15(23137, (1800121242695576634L ^ life1_3)))));
    break forest_join_47;
    }
    ((org.tinylog.TaggedLogger)(com.moon.jE.a)).error(((java.lang.Object)(__sourceIntrinsic_b82a5b29b709_invokedynamic100008_18(13939, (7937325223596212268L ^ life1_3)))));
    }
    return;
    }
    spill100008_0 = com.moon.jE.a;
    spill100008_1 = __sourceIntrinsic_b82a5b29b709_invokedynamic100008_21(14928, (7104599576795270152L ^ life1_3));
    java.lang.Object[] __stackOp100008_22_0 = new java.lang.Object[1];
    spill100008_2 = __stackOp100008_22_0;
    (__stackOp100008_22_0)[0] = this.b;
    ((org.tinylog.TaggedLogger)(spill100008_0)).info(((java.lang.String)(spill100008_1)), ((java.lang.Object[])(spill100008_2)));
    return;
}


public java.lang.String a__String() {
return this.b;
}


public static com.moon.jF a__jF() {
return new com.moon.jF();
}


public void a(boolean p0) {
int forwardValue571_13_0;
    int forwardValue571_13_1;
    int forwardValue571_14_0;
    int forwardValue571_15_0;
    int forwardValue571_15_1;
    int spill571_0;
    boolean spill571_1;
    long life2_3;
    java.lang.String life4_5;
    forward_join_21: {
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (com.moon.jE.f ^ 53007430618922L);
    life4_5 = com.moon.jE.b();
    spill571_0 = this.d;
    spill571_1 = p0;
    if (!((life4_5 == null))) {
        forwardValue571_13_0 = spill571_0;
        forwardValue571_13_1 = ((spill571_1) ? 1 : 0);
        break forward_join_13;
    }
    if (!(spill571_1)) {
        forwardValue571_14_0 = spill571_0;
        break forward_join_14;
    }
    forwardValue571_13_0 = spill571_0;
    forwardValue571_13_1 = 1;
    }
    forwardValue571_15_0 = forwardValue571_13_0;
    forwardValue571_15_1 = forwardValue571_13_1;
    break forward_join_15;
    }
    forwardValue571_15_0 = forwardValue571_14_0;
    forwardValue571_15_1 = 0;
    }
    org.lwjgl.opengl.GL30.glUniform1i(((int)(forwardValue571_15_0)), ((int)(forwardValue571_15_1)));
    if (!((life4_5 != null))) {
        break forward_join_21;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[4])));
    }
    return;
}


public void a__Void(int p0) {
org.lwjgl.opengl.GL30.glUniform1i(((int)(this.d)), ((int)(p0)));
    return;
}


public void a(float p0) {
org.lwjgl.opengl.GL30.glUniform1f(((int)(this.d)), ((float)(p0)));
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_57(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1887_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic100008_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic100008_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic100008_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic100008_21(int a0, long a1) throws E;
}
