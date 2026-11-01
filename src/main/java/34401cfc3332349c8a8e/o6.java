package moom;


public class o6 {

private static java.util.concurrent.ExecutorService a;

private net.minecraft.client.renderer.texture.TextureManager b;

private java.io.File c;

private com.mojang.authlib.minecraft.MinecraftSessionService d;

private com.google.common.cache.LoadingCache<com.mojang.authlib.GameProfile, java.util.Map<com.mojang.authlib.minecraft.MinecraftProfileTexture.Type, com.mojang.authlib.minecraft.MinecraftProfileTexture>> e;

private static long f;

private static long g;

public o6(net.minecraft.client.renderer.texture.TextureManager p0, java.io.File p1, com.mojang.authlib.minecraft.MinecraftSessionService p2) { super(); }

private static void __sourceConstructorBody_eb01923f7bdb47f4(moom.o6 receiver, net.minecraft.client.renderer.texture.TextureManager p0, java.io.File p1, com.mojang.authlib.minecraft.MinecraftSessionService p2) throws Throwable {
long local4 = (moom.o6.f ^ 1116542713171L);
    moom.o6.__sourceConstructorInit_eb01923f7bdb47f4_0(((moom.o6)(receiver)));
    ((moom.o6)(receiver)).b = ((net.minecraft.client.renderer.texture.TextureManager)(p0));
    ((moom.o6)(receiver)).c = ((java.io.File)(p1));
    ((moom.o6)(receiver)).d = ((com.mojang.authlib.minecraft.MinecraftSessionService)(p2));
    ((moom.o6)(receiver)).e = ((com.google.common.cache.LoadingCache)(((com.google.common.cache.CacheBuilder)(((com.google.common.cache.CacheBuilder)(com.google.common.cache.CacheBuilder.newBuilder())).expireAfterAccess(((long)(moom.o6.g)), ((java.util.concurrent.TimeUnit)(java.util.concurrent.TimeUnit.SECONDS))))).build(((com.google.common.cache.CacheLoader)(new net.minecraft.client.resources.SkinManager$1(receiver))))));
    return;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-7042818241370709172L)), ((long)(-7932587467872180704L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(257748789228752L)))));
    long local0_life6 = (moom.o6.f ^ 89385120946947L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill949_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill949_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill949_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill949_13 = new byte[8];
    (__sourceSpill949_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill949_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation949_15 = __sourceSpill949_13;
    ((javax.crypto.Cipher)(__sourceSpill949_10)).init(((int)(__sourceSpill949_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill949_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation949_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -2853537230239715824L;
    byte[] __sourceSpill949_19 = new byte[8];
    (__sourceSpill949_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill949_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill949_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill949_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill949_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill949_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill949_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill949_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill949_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill949_20)).doFinal(((byte[])(__sourceSpill949_19)));
    g = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    a = ((java.util.concurrent.ExecutorService)(new java.util.concurrent.ThreadPoolExecutor(0, 2, 1L, java.util.concurrent.TimeUnit.MINUTES, new java.util.concurrent.LinkedBlockingQueue())));
}

private static native <E extends Throwable> void __sourceConstructorInit_eb01923f7bdb47f4_0(moom.o6 a0) throws E;
private static native <E extends Throwable> moom.DD __sourceHandlerCall_d62745c153ef9e163190(moom.o6 a0, com.mojang.authlib.minecraft.MinecraftProfileTexture a1, com.mojang.authlib.minecraft.MinecraftProfileTexture.Type a2, moom.o8 a3) throws E;
private static final class __SourceHandler_d62745c153ef9e163190 {

public static moom.DD f300102(moom.o6 receiver, com.mojang.authlib.minecraft.MinecraftProfileTexture p0, com.mojang.authlib.minecraft.MinecraftProfileTexture.Type p1, moom.o8 p2) throws Throwable {
    moom.o8 forwardValue300102_25_0;
    java.io.File forwardValue300102_46_0;
    java.io.File forwardValue300102_46_1;
    java.io.File forwardValue300102_46_2;
    java.io.File forwardValue300102_47_0;
    java.io.File forwardValue300102_47_1;
    java.io.File forwardValue300102_47_2;
    java.lang.String forwardValue300102_47_3;
    moom.li forwardValue300102_64_0;
    moom.DD spill300102_0;
    java.lang.String[] spill300102_1;
    moom.o8 spill300102_2;
    java.io.File spill300102_3;
    java.io.File spill300102_4;
    java.io.File spill300102_5;
    java.io.File spill300102_6;
    moom.li spill300102_7;
    moom.n7 spill300102_8;
    moom.n7 spill300102_9;
    java.io.File spill300102_10;
    java.lang.String spill300102_11;
    moom.DD spill300102_12;
    moom.o7 spill300102_13;
    long life4_3;
    moom.DD life7_10;
    net.minecraft.client.renderer.texture.ITextureObject life8_16;
    java.lang.String[] life6_17;
    java.io.File life9_59;
    java.io.File life10_66;
    moom.li life11_77;
    moom.n7 life12_94;
    forward_join_88: {
    forward_join_64: {
    forward_join_63: {
    forward_join_47: {
    forward_join_46: {
    forward_join_31: {
    forward_join_25: {
    life4_3 = (__fieldRead300102_0() ^ 116455657291332L);
    moom.DD __stackOp300102_2_0 = __sourceUninitializedNEW300102_1();
    spill300102_0 = __stackOp300102_2_0;
    __explicitNewInit300102_5(__stackOp300102_2_0, __invokedynamic300102_4(__call300102_3(p0)));
    life7_10 = spill300102_0;
    spill300102_1 = __call300102_6();
    life8_16 = __call300102_8(__fieldRead300102_7(receiver), life7_10);
    life6_17 = spill300102_1;
    if (!((life8_16 != null))) {
        break forward_join_31;
    }
    spill300102_2 = p2;
    if (!((life6_17 != null))) {
        forwardValue300102_25_0 = spill300102_2;
        break forward_join_25;
    }
    if (!((spill300102_2 != null))) {
        break forward_join_88;
    }
    forwardValue300102_25_0 = p2;
    }
    __call300102_9(forwardValue300102_25_0, p1, life7_10, p0);
    if (!((life6_17 == null))) {
        break forward_join_88;
    }
    }
    java.io.File __stackOp300102_11_0 = __sourceUninitializedNEW300102_10();
    spill300102_3 = __stackOp300102_11_0;
    spill300102_4 = __stackOp300102_11_0;
    spill300102_5 = __fieldRead300102_12(receiver);
    if (!((__call300102_14(__call300102_13(p0)) > 2))) {
        forwardValue300102_46_0 = spill300102_3;
        forwardValue300102_46_1 = spill300102_4;
        forwardValue300102_46_2 = spill300102_5;
        break forward_join_46;
    }
    forwardValue300102_47_0 = spill300102_3;
    forwardValue300102_47_1 = spill300102_4;
    forwardValue300102_47_2 = spill300102_5;
    forwardValue300102_47_3 = __call300102_16(__call300102_15(p0), 0, 2);
    break forward_join_47;
    }
    forwardValue300102_47_0 = forwardValue300102_46_0;
    forwardValue300102_47_1 = forwardValue300102_46_1;
    forwardValue300102_47_2 = forwardValue300102_46_2;
    forwardValue300102_47_3 = "xx";
    }
    __explicitNewInit300102_17(forwardValue300102_47_1, forwardValue300102_47_2, forwardValue300102_47_3);
    life9_59 = forwardValue300102_47_0;
    java.io.File __stackOp300102_19_0 = __sourceUninitializedNEW300102_18();
    spill300102_6 = __stackOp300102_19_0;
    __explicitNewInit300102_21(__stackOp300102_19_0, life9_59, __call300102_20(p0));
    life10_66 = spill300102_6;
    if (!((p1 == __fieldRead300102_22()))) {
        break forward_join_63;
    }
    moom.li __stackOp300102_24_0 = __sourceUninitializedNEW300102_23();
    spill300102_7 = __stackOp300102_24_0;
    __explicitNewInit300102_25(__stackOp300102_24_0);
    forwardValue300102_64_0 = spill300102_7;
    break forward_join_64;
    }
    forwardValue300102_64_0 = null;
    }
    life11_77 = forwardValue300102_64_0;
    moom.n7 __stackOp300102_27_0 = __sourceUninitializedNEW300102_26();
    spill300102_8 = __stackOp300102_27_0;
    spill300102_9 = __stackOp300102_27_0;
    spill300102_10 = life10_66;
    spill300102_11 = __call300102_28(p0);
    spill300102_12 = __call300102_29();
    moom.o7 __stackOp300102_31_0 = __sourceUninitializedNEW300102_30();
    spill300102_13 = __stackOp300102_31_0;
    __explicitNewInit300102_32(__stackOp300102_31_0, receiver, life11_77, p2, p1, life7_10, p0);
    __explicitNewInit300102_33(spill300102_9, spill300102_10, spill300102_11, spill300102_12, spill300102_13);
    life12_94 = spill300102_8;
    __call300102_35(__fieldRead300102_34(receiver), life7_10, life12_94);
    }
    return life7_10;
}
private static native long __fieldRead300102_0() throws Throwable;
private static native moom.DD __sourceUninitializedNEW300102_1() throws Throwable;
private static native java.lang.String __call300102_3(com.mojang.authlib.minecraft.MinecraftProfileTexture a0) throws Throwable;
private static native java.lang.String __invokedynamic300102_4(java.lang.String a0) throws Throwable;
private static native void __explicitNewInit300102_5(moom.DD a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __call300102_6() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __fieldRead300102_7(moom.o6 a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.ITextureObject __call300102_8(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native void __call300102_9(moom.o8 a0, com.mojang.authlib.minecraft.MinecraftProfileTexture.Type a1, moom.DD a2, com.mojang.authlib.minecraft.MinecraftProfileTexture a3) throws Throwable;
private static native java.io.File __sourceUninitializedNEW300102_10() throws Throwable;
private static native java.io.File __fieldRead300102_12(moom.o6 a0) throws Throwable;
private static native java.lang.String __call300102_13(com.mojang.authlib.minecraft.MinecraftProfileTexture a0) throws Throwable;
private static native int __call300102_14(java.lang.String a0) throws Throwable;
private static native java.lang.String __call300102_15(com.mojang.authlib.minecraft.MinecraftProfileTexture a0) throws Throwable;
private static native java.lang.String __call300102_16(java.lang.String a0, int a1, int a2) throws Throwable;
private static native void __explicitNewInit300102_17(java.io.File a0, java.io.File a1, java.lang.String a2) throws Throwable;
private static native java.io.File __sourceUninitializedNEW300102_18() throws Throwable;
private static native java.lang.String __call300102_20(com.mojang.authlib.minecraft.MinecraftProfileTexture a0) throws Throwable;
private static native void __explicitNewInit300102_21(java.io.File a0, java.io.File a1, java.lang.String a2) throws Throwable;
private static native com.mojang.authlib.minecraft.MinecraftProfileTexture.Type __fieldRead300102_22() throws Throwable;
private static native moom.li __sourceUninitializedNEW300102_23() throws Throwable;
private static native void __explicitNewInit300102_25(moom.li a0) throws Throwable;
private static native moom.n7 __sourceUninitializedNEW300102_26() throws Throwable;
private static native java.lang.String __call300102_28(com.mojang.authlib.minecraft.MinecraftProfileTexture a0) throws Throwable;
private static native moom.DD __call300102_29() throws Throwable;
private static native moom.o7 __sourceUninitializedNEW300102_30() throws Throwable;
private static native void __explicitNewInit300102_32(moom.o7 a0, moom.o6 a1, moom.lh a2, moom.o8 a3, com.mojang.authlib.minecraft.MinecraftProfileTexture.Type a4, moom.DD a5, com.mojang.authlib.minecraft.MinecraftProfileTexture a6) throws Throwable;
private static native void __explicitNewInit300102_33(moom.n7 a0, java.io.File a1, java.lang.String a2, moom.DD a3, moom.lh a4) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __fieldRead300102_34(moom.o6 a0) throws Throwable;
private static native boolean __call300102_35(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1, moom.n7 a2) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_9a5852226daba4b38a58(moom.o6 a0, com.mojang.authlib.GameProfile a1, boolean a2, moom.o8 a3) throws E;
private static final class __SourceHandler_9a5852226daba4b38a58 {

public static void f471(moom.o6 receiver, com.mojang.authlib.GameProfile p0, boolean p1, moom.o8 p2) throws Throwable {
    int forwardValue471_23_0;
    int forwardValue471_34_0;
    java.lang.String[] spill471_0;
    boolean spill471_1;
    java.util.HashMap life5_2;
    java.lang.String[] life4_3;
    forward_join_42: {
    forward_join_34: {
    forward_join_23: {
    spill471_0 = __call471_0();
    life5_2 = __call471_1();
    life4_3 = spill471_0;
    __call471_4(life5_2, __call471_3(__fieldRead471_2(receiver), p0, p1));
    spill471_1 = __call471_5(life5_2);
    if (!((life4_3 != null))) {
        forwardValue471_23_0 = __integerCategory471_6(spill471_1);
        break forward_join_23;
    }
    if (!(spill471_1)) {
        break forward_join_42;
    }
    forwardValue471_23_0 = __integerCategory471_13(__call471_12(__call471_7(p0), __call471_11(__call471_10(__call471_9(__call471_8())))));
    }
    if (!((life4_3 != null))) {
        forwardValue471_34_0 = forwardValue471_23_0;
        break forward_join_34;
    }
    if (!((forwardValue471_23_0 != 0))) {
        break forward_join_42;
    }
    __call471_15(__call471_14(p0));
    forwardValue471_34_0 = __integerCategory471_20(__call471_19(__call471_16(p0), __call471_18(__call471_17())));
    }
    __discardScalar471_21(forwardValue471_34_0);
    __call471_24(life5_2, __call471_23(__fieldRead471_22(receiver), p0, 0));
    }
    __call471_27(__call471_25(), __invokedynamic471_26(receiver, life5_2, p2));
    return;
}
public static void h471_0(com.mojang.authlib.minecraft.InsecureTextureException p0, moom.o6 p1, com.mojang.authlib.GameProfile p2, moom.o8 p3, java.lang.String[] p4, java.util.HashMap p5) throws Throwable {
    int forwardValue3047100_14_0;
    int forwardValue3047100_25_0;
    boolean spill3047100_0;
    com.mojang.authlib.minecraft.InsecureTextureException life6_2;
    forward_join_33: {
    forward_join_25: {
    forward_join_14: {
    life6_2 = p0;
    spill3047100_0 = __call3047100_0(p5);
    if (!((p4 != null))) {
        forwardValue3047100_14_0 = __integerCategory3047100_1(spill3047100_0);
        break forward_join_14;
    }
    if (!(spill3047100_0)) {
        break forward_join_33;
    }
    forwardValue3047100_14_0 = __integerCategory3047100_8(__call3047100_7(__call3047100_2(p2), __call3047100_6(__call3047100_5(__call3047100_4(__call3047100_3())))));
    }
    if (!((p4 != null))) {
        forwardValue3047100_25_0 = forwardValue3047100_14_0;
        break forward_join_25;
    }
    if (!((forwardValue3047100_14_0 != 0))) {
        break forward_join_33;
    }
    __call3047100_10(__call3047100_9(p2));
    forwardValue3047100_25_0 = __integerCategory3047100_15(__call3047100_14(__call3047100_11(p2), __call3047100_13(__call3047100_12())));
    }
    __discardScalar3047100_16(forwardValue3047100_25_0);
    __call3047100_19(p5, __call3047100_18(__fieldRead3047100_17(p1), p2, 0));
    }
    __call3047100_22(__call3047100_20(), __invokedynamic3047100_21(p1, p5, p3));
    return;
}
public static void h471_1(com.mojang.authlib.minecraft.InsecureTextureException p0) throws Throwable {
    throw __call3047101_0(p0);
}
public static void h471_2(com.mojang.authlib.minecraft.InsecureTextureException p0) throws Throwable {
    throw __call3047102_0(p0);
}
public static void h471_3(com.mojang.authlib.minecraft.InsecureTextureException p0) throws Throwable {
    throw __call3047103_0(p0);
}
public static void h471_4(com.mojang.authlib.minecraft.InsecureTextureException p0) throws Throwable {
    throw __call3047104_0(p0);
}
private static native java.lang.String[] __call471_0() throws Throwable;
private static native java.util.HashMap __call471_1() throws Throwable;
private static native com.mojang.authlib.minecraft.MinecraftSessionService __fieldRead471_2(moom.o6 a0) throws Throwable;
private static native java.util.Map __call471_3(com.mojang.authlib.minecraft.MinecraftSessionService a0, com.mojang.authlib.GameProfile a1, boolean a2) throws Throwable;
private static native void __call471_4(java.util.HashMap a0, java.util.Map a1) throws Throwable;
private static native boolean __call471_5(java.util.HashMap a0) throws Throwable;
private static native int __integerCategory471_6(boolean value) throws Throwable;
private static native java.util.UUID __call471_7(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native net.minecraft.client.Minecraft __call471_8() throws Throwable;
private static native net.minecraft.util.Session __call471_9(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call471_10(net.minecraft.util.Session a0) throws Throwable;
private static native java.util.UUID __call471_11(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native boolean __call471_12(java.util.UUID a0, java.util.UUID a1) throws Throwable;
private static native int __integerCategory471_13(boolean value) throws Throwable;
private static native com.mojang.authlib.properties.PropertyMap __call471_14(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native void __call471_15(com.mojang.authlib.properties.PropertyMap a0) throws Throwable;
private static native com.mojang.authlib.properties.PropertyMap __call471_16(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native net.minecraft.client.Minecraft __call471_17() throws Throwable;
private static native com.mojang.authlib.properties.PropertyMap __call471_18(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call471_19(com.mojang.authlib.properties.PropertyMap a0, com.mojang.authlib.properties.PropertyMap a1) throws Throwable;
private static native int __integerCategory471_20(boolean value) throws Throwable;
private static native void __discardScalar471_21(int a0) throws Throwable;
private static native com.mojang.authlib.minecraft.MinecraftSessionService __fieldRead471_22(moom.o6 a0) throws Throwable;
private static native java.util.Map __call471_23(com.mojang.authlib.minecraft.MinecraftSessionService a0, com.mojang.authlib.GameProfile a1, int a2) throws Throwable;
private static native void __call471_24(java.util.HashMap a0, java.util.Map a1) throws Throwable;
private static native net.minecraft.client.Minecraft __call471_25() throws Throwable;
private static native java.lang.Runnable __invokedynamic471_26(moom.o6 a0, java.util.HashMap a1, moom.o8 a2) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFuture __call471_27(net.minecraft.client.Minecraft a0, java.lang.Runnable a1) throws Throwable;
private static native boolean __call3047100_0(java.util.HashMap a0) throws Throwable;
private static native int __integerCategory3047100_1(boolean value) throws Throwable;
private static native java.util.UUID __call3047100_2(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native net.minecraft.client.Minecraft __call3047100_3() throws Throwable;
private static native net.minecraft.util.Session __call3047100_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call3047100_5(net.minecraft.util.Session a0) throws Throwable;
private static native java.util.UUID __call3047100_6(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native boolean __call3047100_7(java.util.UUID a0, java.util.UUID a1) throws Throwable;
private static native int __integerCategory3047100_8(boolean value) throws Throwable;
private static native com.mojang.authlib.properties.PropertyMap __call3047100_9(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native void __call3047100_10(com.mojang.authlib.properties.PropertyMap a0) throws Throwable;
private static native com.mojang.authlib.properties.PropertyMap __call3047100_11(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native net.minecraft.client.Minecraft __call3047100_12() throws Throwable;
private static native com.mojang.authlib.properties.PropertyMap __call3047100_13(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call3047100_14(com.mojang.authlib.properties.PropertyMap a0, com.mojang.authlib.properties.PropertyMap a1) throws Throwable;
private static native int __integerCategory3047100_15(boolean value) throws Throwable;
private static native void __discardScalar3047100_16(int a0) throws Throwable;
private static native com.mojang.authlib.minecraft.MinecraftSessionService __fieldRead3047100_17(moom.o6 a0) throws Throwable;
private static native java.util.Map __call3047100_18(com.mojang.authlib.minecraft.MinecraftSessionService a0, com.mojang.authlib.GameProfile a1, int a2) throws Throwable;
private static native void __call3047100_19(java.util.HashMap a0, java.util.Map a1) throws Throwable;
private static native net.minecraft.client.Minecraft __call3047100_20() throws Throwable;
private static native java.lang.Runnable __invokedynamic3047100_21(moom.o6 a0, java.util.HashMap a1, moom.o8 a2) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFuture __call3047100_22(net.minecraft.client.Minecraft a0, java.lang.Runnable a1) throws Throwable;
private static native com.mojang.authlib.minecraft.InsecureTextureException __call3047101_0(com.mojang.authlib.minecraft.InsecureTextureException a0) throws Throwable;
private static native com.mojang.authlib.minecraft.InsecureTextureException __call3047102_0(com.mojang.authlib.minecraft.InsecureTextureException a0) throws Throwable;
private static native com.mojang.authlib.minecraft.InsecureTextureException __call3047103_0(com.mojang.authlib.minecraft.InsecureTextureException a0) throws Throwable;
private static native com.mojang.authlib.minecraft.InsecureTextureException __call3047104_0(com.mojang.authlib.minecraft.InsecureTextureException a0) throws Throwable;

}


private static com.mojang.authlib.minecraft.InsecureTextureException a(com.mojang.authlib.minecraft.InsecureTextureException p0) {
return p0;
}


public java.util.Map<com.mojang.authlib.minecraft.MinecraftProfileTexture.Type, com.mojang.authlib.minecraft.MinecraftProfileTexture> a(com.mojang.authlib.GameProfile p0) {
return ((java.util.Map)(((com.google.common.cache.LoadingCache)(this.e)).getUnchecked(((java.lang.Object)(p0)))));
}


public moom.DD a(com.mojang.authlib.minecraft.MinecraftProfileTexture p0, com.mojang.authlib.minecraft.MinecraftProfileTexture.Type p1, moom.o8 p2) { return __sourceHandlerCall_d62745c153ef9e163190(this, p0, p1, p2); }


public moom.DD a(com.mojang.authlib.minecraft.MinecraftProfileTexture p0, com.mojang.authlib.minecraft.MinecraftProfileTexture.Type p1) {
return ((moom.o6)(this)).a(((com.mojang.authlib.minecraft.MinecraftProfileTexture)(p0)), ((com.mojang.authlib.minecraft.MinecraftProfileTexture.Type)(p1)), ((moom.o8)(null)));
}


public void a(com.mojang.authlib.GameProfile p0, moom.o8 p1, boolean p2) {
((java.util.concurrent.ExecutorService)(moom.o6.a)).submit(((java.lang.Runnable)(__sourceIntrinsic_0ffc9af812fb_originalDynamicSite1572_1(this, p0, p2, p1))));
    return;
}


private void lambda$loadProfileTextures$0(java.util.Map p0, moom.o8 p1) {
int forwardValue3794_24_0;
    boolean spill3794_0;
    long life3_3;
    java.lang.String[] life5_5;
    forward_join_34: {
    forward_join_24: {
    forward_join_21: {
    life3_3 = (moom.o6.f ^ 109782964071578L);
    life5_5 = moom.oO.b();
    spill3794_0 = ((java.util.Map)(p0)).containsKey(((java.lang.Object)(com.mojang.authlib.minecraft.MinecraftProfileTexture.Type.SKIN)));
    if (!((life5_5 != null))) {
        forwardValue3794_24_0 = ((spill3794_0) ? 1 : 0);
        break forward_join_24;
    }
    if (!(spill3794_0)) {
        break forward_join_21;
    }
    ((moom.o6)(this)).a(((com.mojang.authlib.minecraft.MinecraftProfileTexture)(((com.mojang.authlib.minecraft.MinecraftProfileTexture)(((java.util.Map)(p0)).get(((java.lang.Object)(com.mojang.authlib.minecraft.MinecraftProfileTexture.Type.SKIN))))))), ((com.mojang.authlib.minecraft.MinecraftProfileTexture.Type)(com.mojang.authlib.minecraft.MinecraftProfileTexture.Type.SKIN)), ((moom.o8)(p1)));
    }
    forwardValue3794_24_0 = ((((java.util.Map)(p0)).containsKey(((java.lang.Object)(com.mojang.authlib.minecraft.MinecraftProfileTexture.Type.CAPE)))) ? 1 : 0);
    }
    if (!((forwardValue3794_24_0 != 0))) {
        break forward_join_34;
    }
    ((moom.o6)(this)).a(((com.mojang.authlib.minecraft.MinecraftProfileTexture)(((com.mojang.authlib.minecraft.MinecraftProfileTexture)(((java.util.Map)(p0)).get(((java.lang.Object)(com.mojang.authlib.minecraft.MinecraftProfileTexture.Type.CAPE))))))), ((com.mojang.authlib.minecraft.MinecraftProfileTexture.Type)(com.mojang.authlib.minecraft.MinecraftProfileTexture.Type.CAPE)), ((moom.o8)(p1)));
    }
    return;
}


private void lambda$loadProfileTextures$1(com.mojang.authlib.GameProfile p0, boolean p1, moom.o8 p2) { __sourceHandlerCall_9a5852226daba4b38a58(this, p0, p1, p2); }


private static native <E extends Throwable> java.lang.Runnable __sourceIntrinsic_0ffc9af812fb_originalDynamicSite1572_1(moom.o6 a0, com.mojang.authlib.GameProfile a1, boolean a2, moom.o8 a3) throws E;
}
