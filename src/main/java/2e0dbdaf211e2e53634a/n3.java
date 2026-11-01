package com.moon;


public class n3 implements java.lang.Cloneable {

private net.minecraft.world.World a;

private double b;

private double c;

private double d;

private float e;

private float f;

private static final long g;

private static final java.lang.String[] h;

private static final java.lang.String[] i;

private static final java.util.Map j;

public n3(net.minecraft.world.World p0, double p1, double p2, double p3) {
this(p0, p1, p2, p3, 0x0.0p+0f, 0x0.0p+0f);
}


public n3(net.minecraft.world.World p0, double p1, double p2, double p3, float p4, float p5) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
    this.e = p5;
    this.f = p4;
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(4899339419633873461L)), ((long)(8209357913685061684L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(149959947498119L)))));

    j = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (com.moon.n3.g ^ 24169297695378L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill406_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill406_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill406_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill406_14 = new byte[8];

    (__sourceSpill406_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill406_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation406_16 = __sourceSpill406_14;

    ((javax.crypto.Cipher)(__sourceSpill406_11)).init(((int)(__sourceSpill406_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill406_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation406_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[8];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "\017Ø[Æ]oa,3ÏÁ\023]=çPS2Ø±~Àè5`:$wF ^P\016ê~Âû`\016\bé2\006b¦Ëa6ÝÁü\"9áY]B\027G\032Ù*­Òa'}\026&\034¾M;­<_\nUö\037\013ÜYÐ>\0203_Ùäoz}PØm#äVs\033 0|¡\007î¾í¸\021;Q\000\177§wB®\r[\001t\033²$[{&ÑË\020vÿW¤\034\tÒÚqNïÈX\003.\020N$3\000È|c®\005}w¼´)"))).length();

    int local5_life24 = 16;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill406_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill406_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill406_29)).doFinal(((byte[])(__sourceSpill406_28)));

        java.lang.String __sourceSpill406_34 = ((java.lang.String)(com.moon.n3.a(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill406_35 = local9_life19;

        int __sourceSpill406_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill406_35)[__sourceSpill406_36] = __sourceSpill406_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "MPû`0a@}ÀÆ\034ÏÅWH!\035\020jMmÈÄâ\013Hÿ:q8\005U(:WYc²«v:ÛC8þ¯]«ÊcE\024\020F[³0üQøfgMÖËwÿ:yÜ\00189XÑK\013v©¹½"))).length();

    local5_life24 = 16;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill406_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill406_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill406_43)).doFinal(((byte[])(__sourceSpill406_42)));

        java.lang.String __sourceSpill406_48 = ((java.lang.String)(com.moon.n3.a(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill406_49 = local9_life19;

        int __sourceSpill406_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill406_49)[__sourceSpill406_50] = __sourceSpill406_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    h = ((java.lang.String[])(local9_life19));

    i = ((java.lang.String[])(new java.lang.String[8]));
}


public boolean equals(java.lang.Object p0) {
java.lang.Object forwardValue988_20_0;
    net.minecraft.world.World forwardValue988_36_0;
    com.moon.n3 forwardValue988_45_0;
    int forwardValue988_51_0;
    int forwardValue988_63_0;
    int forwardValue988_75_0;
    int forwardValue988_83_0;
    int forwardValue988_99_0;
    int forwardValue988_99_1;
    int forwardValue988_101_0;
    int forwardValue988_103_0;
    java.lang.Class spill988_0;
    com.moon.n3 spill988_1;
    net.minecraft.world.World spill988_2;
    boolean spill988_3;
    int spill988_4;
    int spill988_5;
    long life2_3;
    int life4_5;
    com.moon.n3 life5_28;
    forward_join_103: {
    forward_join_102: {
    forward_join_101: {
    forward_join_99: {
    forward_join_91: {
    forward_join_83: {
    forward_join_80: {
    forward_join_75: {
    forward_join_68: {
    forward_join_63: {
    forward_join_56: {
    forward_join_51: {
    forward_join_45: {
    forward_join_44: {
    forward_join_42: {
    forward_join_36: {
    forward_join_20: {
    forward_join_19: {
    forward_join_10: {
    life2_3 = (com.moon.n3.g ^ 108174370264805L);
    life4_5 = com.moon.n5.b__Int();
    if (!((p0 == null))) {
        break forward_join_10;
    }
    return ((0) != 0);
    }
    spill988_0 = ((java.lang.Object)(this)).getClass();
    if (!((life4_5 == 0))) {
        forwardValue988_20_0 = spill988_0;
        break forward_join_20;
    }
    if (!((spill988_0 != ((java.lang.Object)(p0)).getClass()))) {
        break forward_join_19;
    }
    return ((0) != 0);
    }
    forwardValue988_20_0 = p0;
    }
    life5_28 = ((com.moon.n3)(forwardValue988_20_0));
    spill988_1 = this;
    if (!((life4_5 == 0))) {
        forwardValue988_45_0 = spill988_1;
        break forward_join_45;
    }
    if (!((((com.moon.n3)(spill988_1)).a != ((com.moon.n3)(life5_28)).a))) {
        break forward_join_44;
    }
    spill988_2 = this.a;
    if (!((life4_5 == 0))) {
        forwardValue988_36_0 = spill988_2;
        break forward_join_36;
    }
    if (!((spill988_2 != null))) {
        break forward_join_42;
    }
    forwardValue988_36_0 = this.a;
    }
    spill988_3 = ((java.lang.Object)(forwardValue988_36_0)).equals(((java.lang.Object)(((com.moon.n3)(life5_28)).a)));
    if (!((life4_5 == 0))) {
        forwardValue988_51_0 = ((spill988_3) ? 1 : 0);
        break forward_join_51;
    }
    if (!((!spill988_3))) {
        break forward_join_44;
    }
    }
    return ((0) != 0);
    }
    forwardValue988_45_0 = this;
    }
    forwardValue988_51_0 = recovery.source.CarrierOps.lcmp(((long)(java.lang.Double.doubleToLongBits(((double)(((com.moon.n3)(forwardValue988_45_0)).b))))), ((long)(java.lang.Double.doubleToLongBits(((double)(((com.moon.n3)(life5_28)).b))))));
    }
    if (!((life4_5 == 0))) {
        forwardValue988_63_0 = forwardValue988_51_0;
        break forward_join_63;
    }
    if (!((forwardValue988_51_0 != 0))) {
        break forward_join_56;
    }
    return ((0) != 0);
    }
    forwardValue988_63_0 = recovery.source.CarrierOps.lcmp(((long)(java.lang.Double.doubleToLongBits(((double)(this.c))))), ((long)(java.lang.Double.doubleToLongBits(((double)(((com.moon.n3)(life5_28)).c))))));
    }
    if (!((life4_5 == 0))) {
        forwardValue988_75_0 = forwardValue988_63_0;
        break forward_join_75;
    }
    if (!((forwardValue988_63_0 != 0))) {
        break forward_join_68;
    }
    return ((0) != 0);
    }
    forwardValue988_75_0 = recovery.source.CarrierOps.lcmp(((long)(java.lang.Double.doubleToLongBits(((double)(this.d))))), ((long)(java.lang.Double.doubleToLongBits(((double)(((com.moon.n3)(life5_28)).d))))));
    }
    if (!((life4_5 == 0))) {
        forwardValue988_83_0 = forwardValue988_75_0;
        break forward_join_83;
    }
    if (!((forwardValue988_75_0 != 0))) {
        break forward_join_80;
    }
    return ((0) != 0);
    }
    forwardValue988_83_0 = java.lang.Float.floatToIntBits(((float)(this.e)));
    }
    spill988_4 = java.lang.Float.floatToIntBits(((float)(((com.moon.n3)(life5_28)).e)));
    if (!((life4_5 == 0))) {
        forwardValue988_99_0 = forwardValue988_83_0;
        forwardValue988_99_1 = spill988_4;
        break forward_join_99;
    }
    if (!((forwardValue988_83_0 != spill988_4))) {
        break forward_join_91;
    }
    return ((0) != 0);
    }
    spill988_5 = java.lang.Float.floatToIntBits(((float)(this.f)));
    if (!((life4_5 == 0))) {
        forwardValue988_101_0 = spill988_5;
        break forward_join_101;
    }
    forwardValue988_99_0 = spill988_5;
    forwardValue988_99_1 = java.lang.Float.floatToIntBits(((float)(((com.moon.n3)(life5_28)).f)));
    }
    if (!((forwardValue988_99_0 == forwardValue988_99_1))) {
        break forward_join_102;
    }
    forwardValue988_101_0 = 1;
    }
    forwardValue988_103_0 = forwardValue988_101_0;
    break forward_join_103;
    }
    forwardValue988_103_0 = 0;
    }
    return ((forwardValue988_103_0) != 0);
}


public java.lang.String toString() {
long local1 = (com.moon.n3.g ^ 98237699500582L);
    net.minecraft.world.World __sourceSpill817_7 = this.a;
    double __sourceSpill817_8 = this.b;
    double __sourceSpill817_9 = this.c;
    double __sourceSpill817_10 = this.d;
    float __sourceSpill817_11 = this.e;
    float local3 = this.f;
    float local4 = __sourceSpill817_11;
    double local5 = __sourceSpill817_10;
    double local7 = __sourceSpill817_9;
    double local9 = __sourceSpill817_8;
    net.minecraft.world.World local11 = __sourceSpill817_7;
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite817_18(__sourceIntrinsic_a86c261fcdee_originalDynamicSite817_12(24666, (1481951297535913379L ^ local1)), local11, __sourceIntrinsic_a86c261fcdee_originalDynamicSite817_13(16742, (7418822528511249564L ^ local1)), local9, __sourceIntrinsic_a86c261fcdee_originalDynamicSite817_14(1171, (7834363663011793260L ^ local1)), local7, __sourceIntrinsic_a86c261fcdee_originalDynamicSite817_15(1510, (9158999586593163290L ^ local1)), local5, __sourceIntrinsic_a86c261fcdee_originalDynamicSite817_16(582, (872774167676571576L ^ local1)), local4, __sourceIntrinsic_a86c261fcdee_originalDynamicSite817_17(1472, (3856531202399979576L ^ local1)), local3, "}");
}


public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
return ((com.moon.n3)(this)).b__n3();
}


public void i(double p0) {
this.d -= p0;
    return;
}


public void b(float p0) {
this.e = ((float)(p0));
    return;
}


public float b__Float() {
return this.e;
}


public com.moon.n3 b__n3() {
try {
        return ((com.moon.n3)(super.clone()));
    } catch (java.lang.CloneNotSupportedException caught1) {
        throw new java.lang.Error(caught1);
    }
}


public double b(com.moon.n3 p0) {
return java.lang.Math.sqrt(((double)(((java.lang.Math.pow(((double)((this.b - ((com.moon.n3)(p0)).b))), ((double)(0x1.0p1d))) + java.lang.Math.pow(((double)((this.c - ((com.moon.n3)(p0)).c))), ((double)(0x1.0p1d)))) + java.lang.Math.pow(((double)((this.d - ((com.moon.n3)(p0)).d))), ((double)(0x1.0p1d)))))));
}


public com.moon.n3 b__n3(com.moon.n3 p0) {
com.moon.n3 forwardValue987_11_0;
    com.moon.n3 forwardValue987_39_0;
    com.moon.n3 spill987_0;
    long life2_3;
    int life4_5;
    forward_join_40: {
    forward_join_39: {
    forward_join_11: {
    life2_3 = (com.moon.n3.g ^ 11298813459378L);
    life4_5 = com.moon.n5.c__Int();
    spill987_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue987_11_0 = spill987_0;
        break forward_join_11;
    }
    if (!((spill987_0 != null))) {
        break forward_join_40;
    }
    forwardValue987_11_0 = p0;
    }
    if (!((life4_5 != 0))) {
        forwardValue987_39_0 = forwardValue987_11_0;
        break forward_join_39;
    }
    if (!((((com.moon.n3)(forwardValue987_11_0)).a__Eu() == ((com.moon.n3)(this)).a__Eu()))) {
        break forward_join_40;
    }
    com.moon.n3 __stackOp987_4_0 = this;
    ((com.moon.n3)(__stackOp987_4_0)).b = ((double)((((com.moon.n3)(__stackOp987_4_0)).b - ((com.moon.n3)(p0)).b)));
    com.moon.n3 __stackOp987_8_0 = this;
    ((com.moon.n3)(__stackOp987_8_0)).c = ((double)((((com.moon.n3)(__stackOp987_8_0)).c - ((com.moon.n3)(p0)).c)));
    com.moon.n3 __stackOp987_12_0 = this;
    ((com.moon.n3)(__stackOp987_12_0)).d = ((double)((((com.moon.n3)(__stackOp987_12_0)).d - ((com.moon.n3)(p0)).d)));
    forwardValue987_39_0 = this;
    }
    return forwardValue987_39_0;
    }
    throw new java.lang.IllegalArgumentException(__sourceIntrinsic_7d9b372a5c83_invokedynamic987_16(20126, (8227585491404198641L ^ life2_3)));
}


public com.moon.n3 b(double p0, double p1, double p2) {
this.b -= p0;
    this.c -= p1;
    this.d -= p2;
    return this;
}


public void b(double p0) {
this.b += p0;
    return;
}


public double b() {
return this.c;
}


public void e(double p0) {
this.c += p0;
    return;
}


public void c(double p0) {
this.b -= p0;
    return;
}


public double c() {
return this.d;
}


public void h(double p0) {
this.d += p0;
    return;
}


public void f(double p0) {
this.c -= p0;
    return;
}


public void d(double p0) {
this.c = ((double)(p0));
    return;
}


private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


public void a(net.minecraft.world.World p0) {
this.a = ((net.minecraft.world.World)(p0));
    return;
}


public void a__Void(double p0) {
this.b = ((double)(p0));
    return;
}


public double a() {
return this.b;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 23586);
    if (((com.moon.n3.i)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.n3.j)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.n3.j)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/n3", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.n3.h)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.n3.i)[life5_8] = com.moon.n3.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.n3.i)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.n3.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
        byte[] spill1279_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1279_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1279_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1279_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1279_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1279_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public net.minecraft.world.World a__Eu() {
return this.a;
}


public double a(com.moon.n3 p0) {
return java.lang.Math.sqrt(((double)((java.lang.Math.pow(((double)((this.b - ((com.moon.n3)(p0)).b))), ((double)(0x1.0p1d))) + java.lang.Math.pow(((double)((this.d - ((com.moon.n3)(p0)).d))), ((double)(0x1.0p1d)))))));
}


public com.moon.n3 a__n3(com.moon.n3 p0) {
com.moon.n3 forwardValue986_11_0;
    com.moon.n3 forwardValue986_39_0;
    com.moon.n3 spill986_0;
    long life2_3;
    int life4_5;
    forward_join_40: {
    forward_join_39: {
    forward_join_11: {
    life2_3 = (com.moon.n3.g ^ 56675290567226L);
    life4_5 = com.moon.n5.b__Int();
    spill986_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue986_11_0 = spill986_0;
        break forward_join_11;
    }
    if (!((spill986_0 != null))) {
        break forward_join_40;
    }
    forwardValue986_11_0 = p0;
    }
    if (!((life4_5 == 0))) {
        forwardValue986_39_0 = forwardValue986_11_0;
        break forward_join_39;
    }
    if (!((((com.moon.n3)(forwardValue986_11_0)).a__Eu() == ((com.moon.n3)(this)).a__Eu()))) {
        break forward_join_40;
    }
    com.moon.n3 __stackOp986_4_0 = this;
    ((com.moon.n3)(__stackOp986_4_0)).b = ((double)((((com.moon.n3)(__stackOp986_4_0)).b + ((com.moon.n3)(p0)).b)));
    com.moon.n3 __stackOp986_8_0 = this;
    ((com.moon.n3)(__stackOp986_8_0)).c = ((double)((((com.moon.n3)(__stackOp986_8_0)).c + ((com.moon.n3)(p0)).c)));
    com.moon.n3 __stackOp986_12_0 = this;
    ((com.moon.n3)(__stackOp986_12_0)).d = ((double)((((com.moon.n3)(__stackOp986_12_0)).d + ((com.moon.n3)(p0)).d)));
    forwardValue986_39_0 = this;
    }
    return forwardValue986_39_0;
    }
    throw new java.lang.IllegalArgumentException(__sourceIntrinsic_785eaaa0c15b_invokedynamic986_16(21799, (7432886320508035270L ^ life2_3)));
}


public void a(float p0) {
this.f = ((float)(p0));
    return;
}


public float a__Float() {
return this.f;
}


public com.moon.n3 a__n3() {
this.b = ((double)(0x0.0p0d));
    this.c = ((double)(0x0.0p0d));
    this.d = ((double)(0x0.0p0d));
    return this;
}


public com.moon.n3 a(double p0) {
this.b *= p0;
    this.c *= p0;
    this.d *= p0;
    return this;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2795_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/n3"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public com.moon.n3 a(double p0, double p1, double p2) {
this.b += p0;
    this.c += p1;
    this.d += p2;
    return this;
}


public void g(double p0) {
this.d = ((double)(p0));
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2795_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_785eaaa0c15b_invokedynamic986_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7d9b372a5c83_invokedynamic987_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite817_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite817_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite817_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite817_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite817_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite817_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite817_18(java.lang.String a0, net.minecraft.world.World a1, java.lang.String a2, double a3, java.lang.String a4, double a5, java.lang.String a6, double a7, java.lang.String a8, float a9, java.lang.String a10, float a11, java.lang.String a12) throws E;
}
