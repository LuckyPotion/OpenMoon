package com.moon;


public class eY {

private java.util.concurrent.ExecutorService a;

private static net.minecraft.client.Minecraft b;

private java.lang.String c;

private java.lang.String d;

private long e;

private static long f;

private static java.lang.String g;

private static long h;

public eY() { super(); }


private static void __sourceConstructorBody_5ac8a7319075e647(com.moon.eY receiver) throws Throwable {

long local1_life1 = (com.moon.eY.f ^ 95751082808332L);

    int __sourceSpill38_3 = com.moon.e0.c();

    com.moon.eY.__sourceConstructorInit_5ac8a7319075e647_0(((com.moon.eY)(receiver)));

    ((com.moon.eY)(receiver)).a = ((java.util.concurrent.ExecutorService)(java.util.concurrent.Executors.newSingleThreadExecutor()));

    int local3_life7 = __sourceSpill38_3;

    ((com.moon.eY)(receiver)).c = ((java.lang.String)(""));

    ((com.moon.eY)(receiver)).d = ((java.lang.String)(""));

    if ((local3_life7 == 0)) {

        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[1])));

    }

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_5ac8a7319075e647_0(com.moon.eY a0) throws E;

static {
f = ((long)(((moom._a)(moom._c.a(((long)(4097052655482661980L)), ((long)(2614302072360547765L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(55155933406182L)))));
    long local5_life6 = (com.moon.eY.f ^ 100919294965534L);
    javax.crypto.Cipher local7_life8;
    javax.crypto.Cipher __sourceSpill82_10 = (local7_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill82_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill82_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill82_13 = new byte[8];
    (__sourceSpill82_13)[0] = ((byte) ((int) (local5_life6 >>> 56)));
    int local8_life14 = 1;
    while ((local8_life14 < 8)) {
        (__sourceSpill82_13)[local8_life14] = ((byte) ((int) ((local5_life6 << (local8_life14 * 8)) >>> 56)));
        local8_life14 += 1;
    }
    byte[] __sourcePreallocation82_15 = __sourceSpill82_13;
    ((javax.crypto.Cipher)(__sourceSpill82_10)).init(((int)(__sourceSpill82_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill82_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation82_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill82_19 = ((java.lang.String)("ø.¸à8:{¨Ábü\013Ô\024æÜ")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill82_20 = local7_life8;
    byte[] local9_life22 = ((javax.crypto.Cipher)(__sourceSpill82_20)).doFinal(((byte[])(__sourceSpill82_19)));
    g = ((java.lang.String)(((java.lang.String)(com.moon.eY.a(((byte[])(local9_life22))))).intern()));
    javax.crypto.Cipher local0_life27;
    javax.crypto.Cipher __sourceSpill82_29 = (local0_life27 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill82_30 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill82_31 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill82_32 = new byte[8];
    (__sourceSpill82_32)[0] = ((byte) ((int) (local5_life6 >>> 56)));
    int local1_life33 = 1;
    while ((local1_life33 < 8)) {
        (__sourceSpill82_32)[local1_life33] = ((byte) ((int) ((local5_life6 << (local1_life33 * 8)) >>> 56)));
        local1_life33 += 1;
    }
    byte[] __sourcePreallocation82_34 = __sourceSpill82_32;
    ((javax.crypto.Cipher)(__sourceSpill82_29)).init(((int)(__sourceSpill82_30)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill82_31)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation82_34)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life37 = -443381071576141963L;
    byte[] __sourceSpill82_38 = new byte[8];
    (__sourceSpill82_38)[0] = ((byte) ((int) (local2_life37 >>> 56)));
    (__sourceSpill82_38)[1] = ((byte) ((int) (local2_life37 >>> 48)));
    (__sourceSpill82_38)[2] = ((byte) ((int) (local2_life37 >>> 40)));
    (__sourceSpill82_38)[3] = ((byte) ((int) (local2_life37 >>> 32)));
    (__sourceSpill82_38)[4] = ((byte) ((int) (local2_life37 >>> 24)));
    (__sourceSpill82_38)[5] = ((byte) ((int) (local2_life37 >>> 16)));
    (__sourceSpill82_38)[6] = ((byte) ((int) (local2_life37 >>> 8)));
    (__sourceSpill82_38)[7] = ((byte) ((int) local2_life37));
    javax.crypto.Cipher __sourceSpill82_39 = local0_life27;
    byte[] local4_life41 = ((javax.crypto.Cipher)(__sourceSpill82_39)).doFinal(((byte[])(__sourceSpill82_38)));
    h = ((long)((((((((((((long) (local4_life41)[0]) & 255L) << 56) | ((((long) (local4_life41)[1]) & 255L) << 48)) | ((((long) (local4_life41)[2]) & 255L) << 40)) | ((((long) (local4_life41)[3]) & 255L) << 32)) | ((((long) (local4_life41)[4]) & 255L) << 24)) | ((((long) (local4_life41)[5]) & 255L) << 16)) | ((((long) (local4_life41)[6]) & 255L) << 8)) | (((long) (local4_life41)[7]) & 255L))));
    b = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));
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
        byte[] spill200_0 = p0;
        life4_9 += 1;
        life5_44 = (spill200_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill200_1 = p0;
        life4_9 += 1;
        life5_76 = (spill200_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill200_2 = p0;
        life4_9 += 1;
        life5_91 = (spill200_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public void a(com.moon.ev p0) {
long local2 = (com.moon.eY.f ^ 14424719856448L);
    if ((__sourceIntrinsic_booleanComparison(((com.moon.ev)(p0)).a__Boolean()) == 0)) {
        ((com.moon.ok)(((com.moon.og)(((com.moon.od)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__od())).a__og())).a__ok())).b(((java.lang.String)(((com.moon.ev)(p0)).a())));
    }
    return;
}


public void a(com.moon.event.TickEvent p0) {
long life2_3;
    long life5_6;
    int life4_7;
    forward_join_31: {
    forward_join_26: {
    forward_join_20: {
    life2_3 = (com.moon.eY.f ^ 34773733813803L);
    int spill199_0 = com.moon.e0.c();
    life5_6 = java.lang.System.currentTimeMillis();
    life4_7 = spill199_0;
    if (!((life4_7 != 0))) { break forward_join_20; }
    if (!((recovery.source.CarrierOps.lcmp(((long)((life5_6 - this.e))), ((long)(com.moon.eY.h))) > 0))) { break forward_join_26; }
    this.e = ((long)(life5_6));
    }
    ((java.util.concurrent.ExecutorService)(this.a)).submit(((java.lang.Runnable)(__sourceIntrinsic_be06bc302d53_invokedynamic199_8(this))));
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) { break forward_join_31; }
    life4_7 += 1;
    com.moon.e0.b(((int)(life4_7)));
    }
    return;
}


public void a() {
this.d = ((java.lang.String)(null));
    this.c = ((java.lang.String)(null));
    return;
}


private void lambda$receiveTick$0() {
net.minecraft.client.Minecraft forwardValue71_31_0;
    moom.jL forwardValue71_32_0;
    moom.jL forwardValue71_37_0;
    java.lang.String forwardValue71_40_0;
    com.moon.eY forwardValue71_72_0;
    int spill71_0;
    net.minecraft.client.Minecraft spill71_1;
    moom.jL spill71_2;
    com.moon.eY spill71_3;
    long life1_3;
    moom.jL life4_12;
    int life3_13;
    java.lang.String life5_58;
    forward_join_74: {
    forward_join_72: {
    forward_join_71: {
    forward_join_57: {
    forward_join_40: {
    forward_join_39: {
    forward_join_37: {
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    life1_3 = (com.moon.eY.f ^ 90814462894920L);
    spill71_0 = com.moon.e0.c();
    ((com.moon.ok)(((com.moon.og)(((com.moon.od)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__od())).a__og())).a__ok())).a();
    life4_12 = ((net.minecraft.client.Minecraft)(com.moon.eY.b)).a__jL();
    life3_13 = spill71_0;
    spill71_1 = com.moon.eY.b;
    if (!((life3_13 != 0))) {
        forwardValue71_31_0 = spill71_1;
        break forward_join_31;
    }
    if (!((((net.minecraft.client.Minecraft)(spill71_1)).K != null))) {
        break forward_join_30;
    }
    spill71_2 = life4_12;
    if (!((life3_13 != 0))) {
        forwardValue71_32_0 = spill71_2;
        break forward_join_32;
    }
    if (!((spill71_2 != null))) {
        break forward_join_30;
    }
    ((com.moon.ok)(((com.moon.og)(((com.moon.od)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__od())).a__og())).a__ok())).a(((java.lang.String)(((moom.jL)(life4_12)).b)));
    }
    forwardValue71_31_0 = com.moon.eY.b;
    }
    forwardValue71_32_0 = ((net.minecraft.client.Minecraft)(forwardValue71_31_0)).a__jL();
    }
    if (!((life3_13 != 0))) {
        forwardValue71_37_0 = forwardValue71_32_0;
        break forward_join_37;
    }
    if (!((forwardValue71_32_0 != null))) {
        break forward_join_39;
    }
    forwardValue71_37_0 = ((net.minecraft.client.Minecraft)(com.moon.eY.b)).a__jL();
    }
    forwardValue71_40_0 = ((moom.jL)(forwardValue71_37_0)).b;
    break forward_join_40;
    }
    forwardValue71_40_0 = com.moon.eY.g;
    }
    life5_58 = forwardValue71_40_0;
    if (!((life3_13 != 0))) {
        break forward_join_71;
    }
    if (!(((java.lang.String)(((net.minecraft.util.Session)(((net.minecraft.client.Minecraft)(com.moon.eY.b)).b__DH())).c())).equals(((java.lang.Object)(this.c))))) {
        break forward_join_57;
    }
    spill71_3 = this;
    if (!((life3_13 != 0))) {
        forwardValue71_72_0 = spill71_3;
        break forward_join_72;
    }
    if (!((!((java.lang.String)(((com.moon.eY)(spill71_3)).d)).equals(((java.lang.Object)(life5_58)))))) {
        break forward_join_74;
    }
    }
    ((com.moon.oj)(((com.moon.og)(((com.moon.od)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__od())).a__og())).a__oj())).a(((java.lang.String)(((net.minecraft.util.Session)(((net.minecraft.client.Minecraft)(com.moon.eY.b)).b__DH())).c())), ((java.lang.String)(life5_58)));
    this.c = ((java.lang.String)(((net.minecraft.util.Session)(((net.minecraft.client.Minecraft)(com.moon.eY.b)).b__DH())).c()));
    }
    forwardValue71_72_0 = this;
    }
    ((com.moon.eY)(forwardValue71_72_0)).d = ((java.lang.String)(life5_58));
    }
    return;
}


private static native <E extends Throwable> java.lang.Runnable __sourceIntrinsic_be06bc302d53_invokedynamic199_8(com.moon.eY a0) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
