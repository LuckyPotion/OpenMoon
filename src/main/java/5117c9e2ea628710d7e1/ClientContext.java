package com.moon.runtime;


public class ClientContext {

private static com.moon.runtime.ClientContext a;

private static long b;

private org.tinylog.TaggedLogger c;

private com.moon.events.EventBus<com.moon.event.Event> eventBus;

private com.moon.fU e;

private com.moon.fW f;

private com.moon.de g;

private com.moon.cX h;

private com.moon.je i;

private com.moon.jo j;

private com.moon.hO k;

private com.moon.dE l;

private com.moon.eV m;

private com.moon.ml n;

private com.moon.hI o;

private com.moon.runtime.LocalClientProfile p;

private java.io.File q;

private java.util.concurrent.ExecutorService r;

private com.moon.nN s;

private com.moon.cs t;

private com.moon.ct u;

private com.moon.jK v;

private com.moon.n9 w;

private com.moon.pe x;

private com.moon.hD y;

private com.moon.od z;

private com.moon.eY A;

private java.lang.String B;

private com.moon.cq C;

private com.moon.g5 D;

private static java.lang.String E;

private static long F;

private static java.lang.String[] G;

private static java.lang.String[] H;

private static java.util.Map I;

public ClientContext() { super(); }

private static void __sourceConstructorBody_be973995cb48077a(com.moon.runtime.ClientContext receiver) throws Throwable {
long local1 = (com.moon.runtime.ClientContext.F ^ 50030472669868L);
    com.moon.runtime.ClientContext.__sourceConstructorInit_be973995cb48077a_0(((com.moon.runtime.ClientContext)(receiver)));
    ((com.moon.runtime.ClientContext)(receiver)).c = ((org.tinylog.TaggedLogger)(org.tinylog.Logger.tag(((java.lang.String)(__sourceIntrinsic_be973995cb48077a_originalDynamicSite1719_2(28428, (3978529017593081789L ^ local1)))))));
    a = ((com.moon.runtime.ClientContext)(receiver));
    b = ((long)(java.lang.System.currentTimeMillis()));
    return;
}


static {
F = ((long)(((moom._a)(moom._c.a(((long)(4794868900023677509L)), ((long)(-2035370255064546420L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(83898059712020L)))));
    java.lang.Object __sourceSpill565_6 = null;
    I = ((java.util.Map)(new java.util.HashMap(13)));
    com.moon.runtime.ClientContext.b(((java.lang.String)(__sourceSpill565_6)));
    long local0_life9 = (com.moon.runtime.ClientContext.F ^ 30953916321475L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill565_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill565_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill565_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill565_16 = new byte[8];
    (__sourceSpill565_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill565_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation565_18 = __sourceSpill565_16;
    ((javax.crypto.Cipher)(__sourceSpill565_13)).init(((int)(__sourceSpill565_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill565_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation565_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life21 = new java.lang.String[4];
    int local7_life22 = 0;
    java.lang.String local6_life23;
    int local8_life25 = ((java.lang.String)((local6_life23 = "\tÁ\005B\021\033D7Btópyf¹ß[$\031aF9XÖ¤²\020h¢ÈÔ9Ü/§\r\020Rç"))).length();
    int local5_life26 = 32;
    int local4_life27 = -1;
    while (true) {
        local4_life27 += 1;
        byte[] __sourceSpill565_30 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill565_31 = local2_life11;
        byte[] local10_life33 = ((javax.crypto.Cipher)(__sourceSpill565_31)).doFinal(((byte[])(__sourceSpill565_30)));
        java.lang.String __sourceSpill565_36 = ((java.lang.String)(com.moon.runtime.ClientContext.a(((byte[])(local10_life33))))).intern();
        java.lang.String[] __sourceSpill565_37 = local9_life21;
        int __sourceSpill565_38 = local7_life22;
        local7_life22 += 1;
        (__sourceSpill565_37)[__sourceSpill565_38] = __sourceSpill565_36;
        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }
        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));
    }
    local8_life25 = ((java.lang.String)((local6_life23 = "A÷È\036<ï\177PÑõðæÖ'×7/òýq9!ÃÝ­Áî\fÕV<óÎæ êMzÑ¼\031=¥çÉ_¬(\177û«oQ4¿h¡±­\030;hÎ\000"))).length();
    local5_life26 = 40;
    local4_life27 = -1;
    while (true) {
        local4_life27 += 1;
        byte[] __sourceSpill565_44 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill565_45 = local2_life11;
        byte[] local10_life47 = ((javax.crypto.Cipher)(__sourceSpill565_45)).doFinal(((byte[])(__sourceSpill565_44)));
        java.lang.String __sourceSpill565_50 = ((java.lang.String)(com.moon.runtime.ClientContext.a(((byte[])(local10_life47))))).intern();
        java.lang.String[] __sourceSpill565_51 = local9_life21;
        int __sourceSpill565_52 = local7_life22;
        local7_life22 += 1;
        (__sourceSpill565_51)[__sourceSpill565_52] = __sourceSpill565_50;
        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }
        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));
    }
    G = ((java.lang.String[])(local9_life21));
    H = ((java.lang.String[])(new java.lang.String[4]));
}

private static native <E extends Throwable> void __sourceConstructorInit_be973995cb48077a_0(com.moon.runtime.ClientContext a0) throws E;

public static java.lang.String b() {
return com.moon.runtime.ClientContext.E;
}


public void b__Void() {
int lexicalValue452_51_0;
    java.lang.String spill452_0;
    boolean spill452_1;
    long life1_3;
    java.lang.String life3_19;
    java.io.File life4_43;
    com.moon.module.impl.HUD life5_63;
    java.util.Iterator life6_67;
    com.moon.hi life7_74;
    lexical_join_77: {
    lexical_join_52: {
    lexical_join_51: {
    life1_3 = (com.moon.runtime.ClientContext.F ^ 101619174096821L);
    spill452_0 = com.moon.runtime.ClientContext.b();
    ((com.moon.ct)(this.u)).a(((java.util.Collection)(((com.moon.cs)(this.t)).a__List())));
    ((com.moon.fW)(this.f)).a(((java.util.Collection)(((java.util.Map)(((com.moon.fV)(((com.moon.fU)(this.e)).a__fV())).a__Map())).values())));
    life3_19 = spill452_0;
    ((com.moon.eV)(this.m)).b(((java.io.File)(this.q)));
    ((com.moon.ml)(this.n)).b(((java.io.File)(this.q)));
    ((com.moon.jK)(this.v)).a__Void();
    life4_43 = new java.io.File(((com.moon.runtime.ClientContext)(this)).a__File(), __sourceIntrinsic_9bf881b104f5_invokedynamic452_21(11697, (8827042847021987867L ^ life1_3)));
    spill452_1 = ((java.io.File)(life4_43)).exists();
    if (!((life3_19 == null))) {
        lexicalValue452_51_0 = ((spill452_1) ? 1 : 0);
        break lexical_join_51;
    }
    if (!((!spill452_1))) {
        break lexical_join_52;
    }
    lexicalValue452_51_0 = ((((java.io.File)(life4_43)).mkdirs()) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue452_51_0);
    }
    life5_63 = ((com.moon.module.impl.HUD)(((com.moon.fU)(this.e)).a(((java.lang.Class)(com.moon.module.impl.HUD.class)))));
    life6_67 = ((java.util.List)(((com.moon.module.impl.HUD)(life5_63)).aK)).iterator();
    lexical_cycle_62: while (true) {
    if (!(((java.util.Iterator)(life6_67)).hasNext())) {
        break lexical_join_77;
    }
    life7_74 = ((com.moon.hi)(((java.util.Iterator)(life6_67)).next()));
    ((com.moon.hi)(life7_74)).a(((java.io.File)(life4_43)));
    if (!((life3_19 != null))) { continue lexical_cycle_62; }
    break lexical_cycle_62;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[3])));
    }
    return;
}


public static void b(java.lang.String p0) {
E = ((java.lang.String)(p0));
    return;
}


public com.moon.runtime.ClientContext a(java.io.File p0) {
this.q = ((java.io.File)(p0));
    return this;
}


public com.moon.runtime.ClientContext a(com.moon.runtime.LocalClientProfile p0) {
this.p = ((com.moon.runtime.LocalClientProfile)(p0));
    return this;
}


public com.moon.runtime.ClientContext a(com.moon.hI p0) {
this.o = ((com.moon.hI)(p0));
    return this;
}


public com.moon.runtime.ClientContext a(com.moon.jK p0) {
this.v = ((com.moon.jK)(p0));
    return this;
}


public com.moon.runtime.ClientContext a(com.moon.ct p0) {
this.u = ((com.moon.ct)(p0));
    return this;
}


public com.moon.runtime.ClientContext a(com.moon.cs p0) {
this.t = ((com.moon.cs)(p0));
    return this;
}


public com.moon.runtime.ClientContext a(com.moon.nN p0) {
this.s = ((com.moon.nN)(p0));
    return this;
}


public com.moon.runtime.ClientContext a(java.util.concurrent.ExecutorService p0) {
this.r = ((java.util.concurrent.ExecutorService)(p0));
    return this;
}


public com.moon.runtime.ClientContext a(com.moon.jo p0) {
this.j = ((com.moon.jo)(p0));
    return this;
}


public com.moon.runtime.ClientContext a(com.moon.je p0) {
this.i = ((com.moon.je)(p0));
    return this;
}


public com.moon.runtime.ClientContext a(com.moon.cX p0) {
this.h = ((com.moon.cX)(p0));
    return this;
}


public com.moon.runtime.ClientContext a(com.moon.de p0) {
this.g = ((com.moon.de)(p0));
    return this;
}


public com.moon.runtime.ClientContext a(com.moon.ml p0) {
this.n = ((com.moon.ml)(p0));
    return this;
}


public com.moon.runtime.ClientContext a(com.moon.eV p0) {
this.m = ((com.moon.eV)(p0));
    return this;
}


public com.moon.runtime.ClientContext a(com.moon.dE p0) {
this.l = ((com.moon.dE)(p0));
    return this;
}


public com.moon.runtime.ClientContext a(com.moon.hO p0) {
this.k = ((com.moon.hO)(p0));
    return this;
}


private static java.lang.RuntimeException a(java.lang.RuntimeException p0) {
return p0;
}


public static long a() {
return com.moon.runtime.ClientContext.b;
}


public static com.moon.runtime.ClientContext getInstance() {
return com.moon.runtime.ClientContext.a;
}


public com.moon.runtime.ClientContext a(com.moon.g5 p0) {
this.D = ((com.moon.g5)(p0));
    return this;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3537_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/cp"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.runtime.ClientContext.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 28129);
    if (((com.moon.runtime.ClientContext.H)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.runtime.ClientContext.I)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.runtime.ClientContext.I)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/cp", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.runtime.ClientContext.G)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.runtime.ClientContext.H)[life5_8] = com.moon.runtime.ClientContext.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.runtime.ClientContext.H)[life5_8];
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
        byte[] spill1715_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1715_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1715_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1715_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1715_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1715_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public com.moon.runtime.ClientContext a(com.moon.od p0) {
this.z = ((com.moon.od)(p0));
    return this;
}


public com.moon.runtime.ClientContext a(com.moon.hD p0) {
this.y = ((com.moon.hD)(p0));
    return this;
}


public com.moon.runtime.ClientContext a(com.moon.pe p0) {
this.x = ((com.moon.pe)(p0));
    return this;
}


public com.moon.runtime.ClientContext a(com.moon.n9 p0) {
this.w = ((com.moon.n9)(p0));
    return this;
}


public com.moon.runtime.ClientContext a(com.moon.eY p0) {
this.A = ((com.moon.eY)(p0));
    return this;
}


public com.moon.runtime.ClientContext a(java.lang.String p0) {
this.B = ((java.lang.String)(p0));
    return this;
}


public com.moon.runtime.ClientContext a(com.moon.cq p0) {
this.C = ((com.moon.cq)(p0));
    return this;
}


public com.moon.eV a__eV() {
return this.m;
}


public com.moon.dE a__dE() {
return this.l;
}


public com.moon.hO a__hO() {
return this.k;
}


public com.moon.jo a__jo() {
return this.j;
}


public com.moon.je a__je() {
return this.i;
}


public java.io.File a__File() {
return this.q;
}


public com.moon.runtime.LocalClientProfile a__c() {
return this.p;
}


public com.moon.hI a__hI() {
return this.o;
}


public com.moon.ml a__ml() {
return this.n;
}


public com.moon.events.EventBus<com.moon.event.Event> getEventBus() {
return this.eventBus;
}


public org.tinylog.TaggedLogger a__TaggedLogger() {
return this.c;
}


/** Compatibility entry: local initialization accepts no UID or credentials. */
public void a__Void(java.lang.String unused) throws java.lang.InterruptedException {
    com.moon.runtime.LocalBootstrap.initialize();
}



public void a__Void() {
long local1 = (com.moon.runtime.ClientContext.F ^ 108582262994991L);
    java.lang.String spill3011_0 = com.moon.runtime.ClientContext.b();
    ((org.tinylog.TaggedLogger)(this.c)).info(((java.lang.Object)(__sourceIntrinsic_b82a5b29b709_invokedynamic3011_3(18698, (1698814297337027385L ^ local1)))));
    this.i = ((com.moon.je)(new com.moon.je()));
    java.lang.String local3 = spill3011_0;
    this.j = ((com.moon.jo)(new com.moon.jo()));
    this.eventBus = ((com.moon.events.EventBus)(new com.moon.events.EventBus()));
    ((com.moon.events.EventBus)(this.eventBus)).subscribe(((java.lang.Object)(new com.moon.nS())));
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        com.moon.runtime.ClientContext.b(((java.lang.String)("NsjnM")));
    }
    return;
}


public com.moon.cX a__cX() {
return this.h;
}


public com.moon.de a__de() {
return this.g;
}


public com.moon.fW a__fW() {
return this.f;
}


public com.moon.fU a__fU() {
return this.e;
}


public com.moon.cq a__cq() {
return this.C;
}


public java.lang.String a__String() {
return this.B;
}


public com.moon.eY a__eY() {
return this.A;
}


public com.moon.od a__od() {
return this.z;
}


public com.moon.runtime.ClientContext a(com.moon.fW p0) {
this.f = ((com.moon.fW)(p0));
    return this;
}


public com.moon.runtime.ClientContext a(com.moon.fU p0) {
this.e = ((com.moon.fU)(p0));
    return this;
}


public com.moon.runtime.ClientContext a(com.moon.events.EventBus<com.moon.event.Event> p0) {
this.eventBus = ((com.moon.events.EventBus)(p0));
    return this;
}


public com.moon.g5 a__g5() {
return this.D;
}


public com.moon.ct a__ct() {
return this.u;
}


public com.moon.cs a__cs() {
return this.t;
}


public com.moon.nN a__nN() {
return this.s;
}


public java.util.concurrent.ExecutorService a__ExecutorService() {
return this.r;
}


public com.moon.hD a__hD() {
return this.y;
}


public com.moon.pe a__pe() {
return this.x;
}


public com.moon.n9 a__n9() {
return this.w;
}


public com.moon.jK a__jK() {
return this.v;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_be973995cb48077a_originalDynamicSite1719_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3537_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic3011_3(int a0, long a1) throws E;


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9bf881b104f5_invokedynamic452_21(int a0, long a1) throws E;


}
