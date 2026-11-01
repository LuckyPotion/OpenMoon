package com.moon;


public class mV {

public static final com.moon.mV a;

private final com.moon.jm b;

private final java.lang.String c;

private final com.moon.cg d;

private final java.util.function.Consumer<java.lang.Void> e;

public float f;

public float g;

public float h;

public float i;

private static final long j;

public mV(java.lang.String p0, com.moon.cg p1, java.util.function.Consumer<java.lang.Void> p2) {
super();
    this.b = ((com.moon.runtime.ClientContext.getInstance()).a__jo()).a(com.moon.ce.ROBOTO_MEDIUM);
    this.c = p0;
    this.d = p1;
    this.e = p2;
}


static {
j = ((long)(((moom._a)(moom._c.a(((long)(-4270772422025035175L)), ((long)(-991707053539857096L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(18753269734007L)))));
    long local4_life6 = (com.moon.mV.j ^ 46914436093832L);
    javax.crypto.Cipher local1_life8;
    javax.crypto.Cipher __sourceSpill247_10 = (local1_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill247_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill247_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill247_13 = new byte[8];
    (__sourceSpill247_13)[0] = ((byte) ((int) (local4_life6 >>> 56)));
    int local2_life14 = 1;
    while ((local2_life14 < 8)) {
        (__sourceSpill247_13)[local2_life14] = ((byte) ((int) ((local4_life6 << (local2_life14 * 8)) >>> 56)));
        local2_life14 += 1;
    }
    byte[] __sourcePreallocation247_15 = __sourceSpill247_13;
    ((javax.crypto.Cipher)(__sourceSpill247_10)).init(((int)(__sourceSpill247_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill247_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation247_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill247_19 = ((java.lang.String)("\030\031m³\032#")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill247_20 = local1_life8;
    byte[] local3_life22 = ((javax.crypto.Cipher)(__sourceSpill247_20)).doFinal(((byte[])(__sourceSpill247_19)));
    java.lang.String local0_life25 = ((java.lang.String)(com.moon.mV.a(((byte[])(local3_life22))))).intern();
    a = ((com.moon.mV)(new com.moon.mV(local0_life25, com.moon.cg.ERROR, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite247_27())));
}


public com.moon.mV b(float p0) {
this.g = ((float)(p0));
    return this;
}


public float b() {
return this.g;
}


public float c() {
return this.h;
}


public com.moon.mV c(float p0) {
this.h = ((float)(p0));
    return this;
}


public float d() {
return this.i;
}


public com.moon.mV d(float p0) {
this.i = ((float)(p0));
    return this;
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
        byte[] spill743_0 = p0;
        life4_9 += 1;
        life5_44 = (spill743_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill743_1 = p0;
        life4_9 += 1;
        life5_76 = (spill743_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill743_2 = p0;
        life4_9 += 1;
        life5_91 = (spill743_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public com.moon.mV a(float p0) {
this.f = ((float)(p0));
    return this;
}


public java.lang.String a__String() {
return this.c;
}


public com.moon.jm a__jm() {
return this.b;
}


public boolean a(float p0, float p1) {
int forwardValue741_20_0;
    int forwardValue741_27_0;
    int forwardValue741_37_0;
    int forwardValue741_41_0;
    int forwardValue741_43_0;
    int spill741_0;
    long life3_3;
    java.lang.String[] life5_5;
    forward_join_43: {
    forward_join_42: {
    forward_join_41: {
    forward_join_37: {
    forward_join_27: {
    forward_join_20: {
    life3_3 = (com.moon.mV.j ^ 98434406622839L);
    life5_5 = com.moon.cg.b();
    spill741_0 = recovery.source.CarrierOps.fcmpl(((float)(p0)), ((float)(this.f)));
    if (!((life5_5 != null))) {
        forwardValue741_20_0 = spill741_0;
        break forward_join_20;
    }
    if (!((spill741_0 >= 0))) {
        break forward_join_42;
    }
    forwardValue741_20_0 = recovery.source.CarrierOps.fcmpg(((float)(p0)), ((float)((this.f + this.h))));
    }
    if (!((life5_5 != null))) {
        forwardValue741_27_0 = forwardValue741_20_0;
        break forward_join_27;
    }
    if (!((forwardValue741_20_0 <= 0))) {
        break forward_join_42;
    }
    forwardValue741_27_0 = recovery.source.CarrierOps.fcmpl(((float)(p1)), ((float)(this.g)));
    }
    if (!((life5_5 != null))) {
        forwardValue741_37_0 = forwardValue741_27_0;
        break forward_join_37;
    }
    if (!((forwardValue741_27_0 >= 0))) {
        break forward_join_42;
    }
    forwardValue741_37_0 = recovery.source.CarrierOps.fcmpg(((float)(p1)), ((float)((this.g + this.i))));
    }
    if (!((life5_5 != null))) {
        forwardValue741_41_0 = forwardValue741_37_0;
        break forward_join_41;
    }
    if (!((forwardValue741_37_0 <= 0))) {
        break forward_join_42;
    }
    forwardValue741_41_0 = 1;
    }
    forwardValue741_43_0 = forwardValue741_41_0;
    break forward_join_43;
    }
    forwardValue741_43_0 = 0;
    }
    return ((forwardValue741_43_0) != 0);
}


public void a(com.moon.hW p0, com.moon.hW p1, com.v p2) {
int forestValue115_24_0;
    int forestValue115_43_0;
    long life4_3;
    java.lang.String[] life6_5;
    int life7_24;
    int life8_43;
    forest_join_78: {
    forest_join_43: {
    forest_join_41: {
    forest_join_38: {
    forest_join_35: {
    forest_join_31: {
    forest_join_24: {
    forest_join_22: {
    forest_join_19: {
    forest_join_16: {
    forest_join_12: {
    life4_3 = (com.moon.mV.j ^ 7985135257866L);
    life6_5 = __sourceExactCall_7cb4f3ce90f9de();
    switch ((com.moon.mW.a)[((com.moon.cg)(this.d)).ordinal()]) {
default:
{
        break forest_join_12;
    }
case 1:
{
        break forest_join_16;
    }
case 2:
{
        break forest_join_19;
    }
case 3:
{
        break forest_join_22;
    }
}
    }
    throw new java.lang.IncompatibleClassChangeError();
    }
    forestValue115_24_0 = ((com.v)(p2)).m();
    break forest_join_24;
    }
    forestValue115_24_0 = ((com.v)(p2)).e();
    break forest_join_24;
    }
    forestValue115_24_0 = ((com.v)(p2)).a();
    }
    life7_24 = forestValue115_24_0;
    switch ((com.moon.mW.a)[((com.moon.cg)(this.d)).ordinal()]) {
default:
{
        break forest_join_31;
    }
case 1:
{
        break forest_join_35;
    }
case 2:
{
        break forest_join_38;
    }
case 3:
{
        break forest_join_41;
    }
}
    }
    throw new java.lang.IncompatibleClassChangeError();
    }
    forestValue115_43_0 = ((com.v)(p2)).n();
    break forest_join_43;
    }
    forestValue115_43_0 = ((com.v)(p2)).f();
    break forest_join_43;
    }
    forestValue115_43_0 = __sourceExactCall_66349b953a09b2(((com.v)(p2)));
    }
    life8_43 = forestValue115_43_0;
    ((com.moon.hW)(p0)).a(((com.moon.iX)(com.moon.i3.a(((float)(this.f)), ((float)(this.g)), ((float)(this.h)), ((float)(this.i)), ((float)(0x1.8p1f)), ((int)(life7_24))))));
    __sourceExactCall_1949570a13ee94(((com.moon.jm)(this.b)), ((com.moon.hW)(p1)), ((java.lang.String)(this.c)), ((float)(0x1.0p3f)), ((float)((this.f + 0x1.8p1f))), ((float)((this.g + 0x1.cp1f))), ((int)(life8_43)));
    if (!((life6_5 == null))) {
        break forest_join_78;
    }
    __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[3])));
    }
    return;
}


public void a__Void() {
long local1 = (com.moon.mV.j ^ 61609200479116L);
    java.lang.String[] spill1905_0 = com.moon.cg.b();
    this.h = ((float)((((com.moon.jm)(this.b)).a(((java.lang.String)(this.c)), ((float)(0x1.0p3f))) + 0x1.8p2f)));
    java.lang.String[] local3 = spill1905_0;
    this.i = ((float)((((com.moon.jm)(this.b)).a(((float)(0x1.0p3f))) + 0x1.8p2f)));
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        com.moon.cg.b(((java.lang.String[])(new java.lang.String[4])));
    }
    return;
}


public float a() {
return this.f;
}


public java.util.function.Consumer<java.lang.Void> a__Consumer() {
return this.e;
}


public com.moon.cg a__cg() {
return this.d;
}


private static void lambda$static$0(java.lang.Void p0) {
java.lang.Object local1 = ((com.moon.module.impl.ClickGUI)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.ClickGUI.class)))));
    ((com.moon.pj)(((com.moon.module.impl.ClickGUI)(local1)).a__pj())).a(((com.moon.mQ)(null)));
    return;
}


private static native <E extends Throwable> java.util.function.Consumer __sourceIntrinsic_eb8803ad1f63_originalDynamicSite247_27() throws E;

private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);

private static native java.lang.String[] __sourceExactCall_7cb4f3ce90f9de();
private static native void __sourceExactCall_1949570a13ee94(com.moon.jm p0, com.moon.hW p1, java.lang.String p2, float p3, float p4, float p5, int p6);

private static native int __sourceExactCall_66349b953a09b2(com.v p0);
}
