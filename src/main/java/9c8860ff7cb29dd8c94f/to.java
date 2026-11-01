package moom;


public abstract class to extends net.minecraft.entity.player.EntityPlayer {

private static moom.DD ce;

private moom.jX cf;

private moom.DD cg;

private long ch;

private boolean ci;

private java.lang.String cj;

private com.moon.module.impl.Capes ck;

private static boolean cl;

private static long db;

public to(net.minecraft.world.World p0, com.mojang.authlib.GameProfile p1) { super((net.minecraft.world.World)null, (com.mojang.authlib.GameProfile)null); __sourceHandlerCall_c5036d1700d86a345c25(this, p0, p1); }


static {
db = ((long)(((moom._a)(moom._c.a(((long)(5758345117116107894L)), ((long)(8670026799999302752L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(16223790521234L)))));
    int __sourceSpill2854_6 = 0;
    ce = ((moom.DD)(new moom.DD("textures/moon/cape/cape.png")));
    moom.to.k(((boolean)__sourceIntrinsic_integerToBoolean((__sourceSpill2854_6))));
}

private static native <E extends Throwable> void __sourceHandlerCall_c5036d1700d86a345c25(moom.to a0, net.minecraft.world.World a1, com.mojang.authlib.GameProfile a2) throws E;
private static final class __SourceHandler_c5036d1700d86a345c25 {

public static void f507(moom.to receiver, net.minecraft.world.World p0, com.mojang.authlib.GameProfile p1) throws Throwable {
    moom.to forwardValue507_45_0;
    net.minecraft.entity.Entity[] spill507_0;
    moom.to spill507_1;
    moom.to spill507_2;
    long life3_3;
    net.minecraft.entity.Entity[] life5_15;
    forward_join_45: {
    forward_join_42: {
    life3_3 = (__fieldRead507_0() ^ 30315472613238L);
    spill507_0 = __call507_1();
    __directSuperInit507_2(receiver, p0, p1);
    __fieldWrite507_3(receiver, null);
    __fieldWrite507_4(receiver, 0L);
    life5_15 = spill507_0;
    __fieldWrite507_5(receiver, 0);
    __fieldWrite507_6(receiver, null);
    __fieldWrite507_8(receiver, __call507_7(p1));
    spill507_1 = receiver;
    if (!((life5_15 != null))) {
        forwardValue507_45_0 = spill507_1;
        break forward_join_45;
    }
    if (!((__fieldRead507_9(spill507_1) != null))) {
        break forward_join_42;
    }
    spill507_2 = receiver;
    if (!((life5_15 != null))) {
        forwardValue507_45_0 = spill507_2;
        break forward_join_45;
    }
    if (!((!__call507_11(__fieldRead507_10(spill507_2))))) {
        break forward_join_42;
    }
    __fieldWrite507_14(receiver, __call507_13(__fieldRead507_12(receiver)));
    }
    __call507_15(receiver);
    forwardValue507_45_0 = receiver;
    }
    __call507_16(forwardValue507_45_0);
    return;
}
public static void h507_0(moom.Oo p0) throws Throwable {
    throw __call3050700_0(p0);
}
public static void h507_1(moom.Oo p0) throws Throwable {
    throw __call3050701_0(p0);
}
public static void h507_2(moom.Oo p0) throws Throwable {
    throw __call3050702_0(p0);
}
public static void h507_3(moom.Oo p0) throws Throwable {
    throw __call3050703_0(p0);
}
private static native long __fieldRead507_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call507_1() throws Throwable;
private static native void __directSuperInit507_2(moom.to a0, net.minecraft.world.World a1, com.mojang.authlib.GameProfile a2) throws Throwable;
private static native void __fieldWrite507_3(moom.to a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite507_4(moom.to a0, long a1) throws Throwable;
private static native void __fieldWrite507_5(moom.to a0, int a1) throws Throwable;
private static native void __fieldWrite507_6(moom.to a0, java.lang.Object a1) throws Throwable;
private static native java.lang.String __call507_7(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native void __fieldWrite507_8(moom.to a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead507_9(moom.to a0) throws Throwable;
private static native java.lang.String __fieldRead507_10(moom.to a0) throws Throwable;
private static native boolean __call507_11(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead507_12(moom.to a0) throws Throwable;
private static native java.lang.String __call507_13(java.lang.String a0) throws Throwable;
private static native void __fieldWrite507_14(moom.to a0, java.lang.String a1) throws Throwable;
private static native void __call507_15(moom.to a0) throws Throwable;
private static native moom.L6 __call507_16(moom.to a0) throws Throwable;
private static native java.lang.Exception __call3050700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3050701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3050702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3050703_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_fd746d3d19e531fac2f1(moom.to a0) throws E;
private static final class __SourceHandler_fd746d3d19e531fac2f1 {

public static boolean f1221(moom.to receiver) throws Throwable {
    moom.jX forwardValue1221_18_0;
    int forwardValue1221_24_0;
    net.minecraft.entity.Entity[] spill1221_0;
    moom.jX spill1221_1;
    long life1_3;
    moom.jX life4_11;
    net.minecraft.entity.Entity[] life3_12;
    forward_join_24: {
    forward_join_23: {
    forward_join_18: {
    life1_3 = (__fieldRead1221_0() ^ 34001751855471L);
    spill1221_0 = __call1221_1();
    life4_11 = __call1221_6(__call1221_3(__call1221_2()), __call1221_5(__call1221_4(receiver)));
    life3_12 = spill1221_0;
    spill1221_1 = life4_11;
    if (!((life3_12 != null))) {
        forwardValue1221_18_0 = spill1221_1;
        break forward_join_18;
    }
    if (!((spill1221_1 != null))) {
        break forward_join_23;
    }
    forwardValue1221_18_0 = life4_11;
    }
    if (!((__call1221_7(forwardValue1221_18_0) == __fieldRead1221_8()))) {
        break forward_join_23;
    }
    forwardValue1221_24_0 = 1;
    break forward_join_24;
    }
    forwardValue1221_24_0 = 0;
    }
    return __integerCategory1221_9(forwardValue1221_24_0);
}
public static void h1221_0(moom.Oo p0) throws Throwable {
    throw __call1122100_0(p0);
}
public static void h1221_1(moom.Oo p0) throws Throwable {
    throw __call1122101_0(p0);
}
private static native long __fieldRead1221_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call1221_1() throws Throwable;
private static native net.minecraft.client.Minecraft __call1221_2() throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __call1221_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call1221_4(moom.to a0) throws Throwable;
private static native java.util.UUID __call1221_5(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native moom.jX __call1221_6(net.minecraft.client.network.NetHandlerPlayClient a0, java.util.UUID a1) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __call1221_7(moom.jX a0) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __fieldRead1221_8() throws Throwable;
private static native boolean __integerCategory1221_9(int value) throws Throwable;
private static native java.lang.Exception __call1122100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1122101_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_b4485f669f934702dc17(moom.to a0) throws E;
private static final class __SourceHandler_b4485f669f934702dc17 {

public static boolean f2077(moom.to receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead2077_0() ^ 40126260451645L);
    return ((__call2077_1(receiver) != null) ? true : false);
}
public static void h2077_0(moom.Oo p0) throws Throwable {
    throw __call1207700_0(p0);
}
private static native long __fieldRead2077_0() throws Throwable;
private static native moom.jX __call2077_1(moom.to a0) throws Throwable;
private static native java.lang.Exception __call1207700_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_2b6318eec00e5d868852(moom.to a0) throws E;
private static final class __SourceHandler_2b6318eec00e5d868852 {

public static boolean f1222(moom.to receiver) throws Throwable {
    moom.jX forwardValue1222_14_0;
    int forwardValue1222_19_0;
    int forwardValue1222_21_0;
    net.minecraft.entity.Entity[] spill1222_0;
    moom.jX spill1222_1;
    boolean spill1222_2;
    long life1_3;
    moom.jX life4_7;
    net.minecraft.entity.Entity[] life3_8;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_14: {
    life1_3 = (__fieldRead1222_0() ^ 111303859255905L);
    spill1222_0 = __call1222_1();
    life4_7 = __call1222_2(receiver);
    life3_8 = spill1222_0;
    spill1222_1 = life4_7;
    if (!((life3_8 != null))) {
        forwardValue1222_14_0 = spill1222_1;
        break forward_join_14;
    }
    if (!((spill1222_1 != null))) {
        break forward_join_20;
    }
    forwardValue1222_14_0 = life4_7;
    }
    spill1222_2 = __call1222_3(forwardValue1222_14_0);
    if (!((life3_8 != null))) {
        forwardValue1222_19_0 = __integerCategory1222_4(spill1222_2);
        break forward_join_19;
    }
    if (!(spill1222_2)) {
        break forward_join_20;
    }
    forwardValue1222_19_0 = 1;
    }
    forwardValue1222_21_0 = forwardValue1222_19_0;
    break forward_join_21;
    }
    forwardValue1222_21_0 = 0;
    }
    return __integerCategory1222_5(forwardValue1222_21_0);
}
public static void h1222_0(moom.Oo p0) throws Throwable {
    throw __call1122200_0(p0);
}
public static void h1222_1(moom.Oo p0) throws Throwable {
    throw __call1122201_0(p0);
}
private static native long __fieldRead1222_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call1222_1() throws Throwable;
private static native moom.jX __call1222_2(moom.to a0) throws Throwable;
private static native boolean __call1222_3(moom.jX a0) throws Throwable;
private static native int __integerCategory1222_4(boolean value) throws Throwable;
private static native boolean __integerCategory1222_5(int value) throws Throwable;
private static native java.lang.Exception __call1122200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1122201_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_c1b42040b94f688f3cc0(moom.to a0) throws E;
private static final class __SourceHandler_c1b42040b94f688f3cc0 {

public static boolean f1223(moom.to receiver) throws Throwable {
    moom.DD forwardValue1223_14_0;
    int forwardValue1223_23_0;
    int forwardValue1223_25_0;
    net.minecraft.entity.Entity[] spill1223_0;
    moom.DD spill1223_1;
    boolean spill1223_2;
    long life1_3;
    moom.DD life4_7;
    net.minecraft.entity.Entity[] life3_8;
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_14: {
    life1_3 = (__fieldRead1223_0() ^ 20574010125538L);
    spill1223_0 = __call1223_1();
    life4_7 = __call1223_2(receiver);
    life3_8 = spill1223_0;
    spill1223_1 = life4_7;
    if (!((life3_8 != null))) {
        forwardValue1223_14_0 = spill1223_1;
        break forward_join_14;
    }
    if (!((spill1223_1 != null))) {
        break forward_join_24;
    }
    forwardValue1223_14_0 = life4_7;
    }
    if (!((forwardValue1223_14_0 == __fieldRead1223_3(receiver)))) {
        break forward_join_22;
    }
    spill1223_2 = __fieldRead1223_4(receiver);
    if (!((life3_8 != null))) {
        forwardValue1223_23_0 = __integerCategory1223_5(spill1223_2);
        break forward_join_23;
    }
    if (!(spill1223_2)) {
        break forward_join_24;
    }
    }
    forwardValue1223_23_0 = 1;
    }
    forwardValue1223_25_0 = forwardValue1223_23_0;
    break forward_join_25;
    }
    forwardValue1223_25_0 = 0;
    }
    return __integerCategory1223_6(forwardValue1223_25_0);
}
public static void h1223_0(moom.Oo p0) throws Throwable {
    throw __call1122300_0(p0);
}
public static void h1223_1(moom.Oo p0) throws Throwable {
    throw __call1122301_0(p0);
}
public static void h1223_2(moom.Oo p0) throws Throwable {
    throw __call1122302_0(p0);
}
private static native long __fieldRead1223_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call1223_1() throws Throwable;
private static native moom.DD __call1223_2(moom.to a0) throws Throwable;
private static native moom.DD __fieldRead1223_3(moom.to a0) throws Throwable;
private static native boolean __fieldRead1223_4(moom.to a0) throws Throwable;
private static native int __integerCategory1223_5(boolean value) throws Throwable;
private static native boolean __integerCategory1223_6(int value) throws Throwable;
private static native java.lang.Exception __call1122300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1122301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1122302_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_87a089a3ae81bec2fc6f(java.lang.String a0) throws E;
private static final class __SourceHandler_87a089a3ae81bec2fc6f {

public static java.lang.String f202(java.lang.String p0) throws Throwable {
    net.minecraft.entity.Entity[] spill202_0;
    long life1_3;
    java.lang.StringBuilder life4_8;
    net.minecraft.entity.Entity[] life3_9;
    java.net.HttpURLConnection life5_16;
    java.io.BufferedReader life6_31;
    java.lang.String life7_35;
    lexical_join_49: {
    lexical_join_47: {
    life1_3 = (__fieldRead202_0() ^ 37740267187988L);
    spill202_0 = __call202_1();
    life4_8 = new java.lang.StringBuilder();
    life3_9 = spill202_0;
    life5_16 = __cast202_3(__call202_2(new java.net.URL(p0)));
    __call202_4(life5_16, "User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.88 Safari/537.36 OPR/73.0.3856.284 (Edition avira-2)");
    __call202_5(life5_16);
    life6_31 = new java.io.BufferedReader(new java.io.InputStreamReader(__call202_6(life5_16)));
    lexical_cycle_32: while (true) {
    if (!(((life7_35 = __call202_7(life6_31)) != null))) {
        break lexical_join_47;
    }
    __call202_10(__call202_8(life4_8, life7_35), __call202_9());
    if (!((life3_9 != null))) {
        break lexical_join_49;
    }
    if (!((life3_9 == null))) { continue lexical_cycle_32; }
    break lexical_cycle_32;
    }
    }
    __call202_11(life6_31);
    }
    return __call202_12(life4_8);
}
public static java.lang.String h202_0(java.lang.Exception p0) throws Throwable {
    throw __call2020200_0(p0);
}
public static java.lang.String h202_1(java.lang.Exception p0, java.lang.StringBuilder p1) throws Throwable {
    java.lang.Exception local2 = p0;
    __call2020201_0(local2);
    return __call2020201_1(p1);
}
private static native long __fieldRead202_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call202_1() throws Throwable;
private static native java.net.URLConnection __call202_2(java.net.URL a0) throws Throwable;
private static native java.net.HttpURLConnection __cast202_3(java.net.URLConnection a0) throws Throwable;
private static native void __call202_4(java.net.HttpURLConnection a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call202_5(java.net.HttpURLConnection a0) throws Throwable;
private static native java.io.InputStream __call202_6(java.net.HttpURLConnection a0) throws Throwable;
private static native java.lang.String __call202_7(java.io.BufferedReader a0) throws Throwable;
private static native java.lang.StringBuilder __call202_8(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call202_9() throws Throwable;
private static native java.lang.StringBuilder __call202_10(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native void __call202_11(java.io.BufferedReader a0) throws Throwable;
private static native java.lang.String __call202_12(java.lang.StringBuilder a0) throws Throwable;
private static native java.lang.Exception __call2020200_0(java.lang.Exception a0) throws Throwable;
private static native void __call2020201_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __call2020201_1(java.lang.StringBuilder a0) throws Throwable;

}

private static native <E extends Throwable> moom.n7 __sourceHandlerCall_fef9b52e4516a28d8cf2(moom.DD a0, java.lang.String a1) throws E;
private static final class __SourceHandler_fef9b52e4516a28d8cf2 {

public static moom.n7 f506(moom.DD p0, java.lang.String p1) throws Throwable {
    net.minecraft.client.renderer.texture.ITextureObject forestValue506_44_0;
    net.minecraft.entity.Entity[] spill506_0;
    net.minecraft.client.renderer.texture.ITextureObject spill506_1;
    moom.n7 spill506_2;
    moom.n7 spill506_3;
    java.io.File spill506_4;
    java.lang.String spill506_5;
    java.lang.Object[] spill506_6;
    java.lang.String spill506_7;
    moom.DD spill506_8;
    moom.li spill506_9;
    long life2_3;
    net.minecraft.client.renderer.texture.TextureManager life5_7;
    net.minecraft.client.renderer.texture.ITextureObject life6_11;
    net.minecraft.entity.Entity[] life4_12;
    forest_join_44: {
    forest_join_43: {
    life2_3 = (__fieldRead506_0() ^ 123946372733670L);
    spill506_0 = __call506_1();
    life5_7 = __call506_3(__call506_2());
    life6_11 = __call506_4(life5_7, p0);
    life4_12 = spill506_0;
    spill506_1 = life6_11;
    if (!((life4_12 != null))) {
        forestValue506_44_0 = spill506_1;
        break forest_join_44;
    }
    if (!((spill506_1 == null))) {
        break forest_join_43;
    }
    moom.n7 __stackOp506_6_0 = __sourceUninitializedNEW506_5();
    spill506_2 = __stackOp506_6_0;
    spill506_3 = __stackOp506_6_0;
    spill506_4 = __cast506_7(null);
    spill506_5 = "http://minotar.net/skin/%s.png";
    java.lang.Object[] __stackOp506_8_0 = new java.lang.Object[1];
    spill506_6 = __stackOp506_8_0;
    (__stackOp506_8_0)[0] = p1;
    spill506_7 = __call506_9(spill506_5, spill506_6);
    spill506_8 = __call506_11(__call506_10(p1));
    moom.li __stackOp506_13_0 = __sourceUninitializedNEW506_12();
    spill506_9 = __stackOp506_13_0;
    __explicitNewInit506_14(__stackOp506_13_0);
    __explicitNewInit506_15(spill506_3, spill506_4, spill506_7, spill506_8, spill506_9);
    life6_11 = spill506_2;
    __call506_17(life5_7, p0, __cast506_16(life6_11));
    }
    forestValue506_44_0 = life6_11;
    }
    return __cast506_18(forestValue506_44_0);
}
public static moom.n7 h506_0(moom.Oo p0) throws Throwable {
    throw __call3050600_0(p0);
}
private static native long __fieldRead506_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call506_1() throws Throwable;
private static native net.minecraft.client.Minecraft __call506_2() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call506_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.ITextureObject __call506_4(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native moom.n7 __sourceUninitializedNEW506_5() throws Throwable;
private static native java.io.File __cast506_7(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call506_9(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.util.UUID __call506_10(java.lang.String a0) throws Throwable;
private static native moom.DD __call506_11(java.util.UUID a0) throws Throwable;
private static native moom.li __sourceUninitializedNEW506_12() throws Throwable;
private static native void __explicitNewInit506_14(moom.li a0) throws Throwable;
private static native void __explicitNewInit506_15(moom.n7 a0, java.io.File a1, java.lang.String a2, moom.DD a3, moom.lh a4) throws Throwable;
private static native net.minecraft.client.renderer.texture.ITextureObject __cast506_16(net.minecraft.client.renderer.texture.ITextureObject a0) throws Throwable;
private static native boolean __call506_17(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1, net.minecraft.client.renderer.texture.ITextureObject a2) throws Throwable;
private static native moom.n7 __cast506_18(net.minecraft.client.renderer.texture.ITextureObject a0) throws Throwable;
private static native java.lang.Exception __call3050600_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.DD __sourceHandlerCall_0cad417ce9643c937f9a(moom.to a0) throws E;
private static final class __SourceHandler_0cad417ce9643c937f9a {

public static moom.DD f1224(moom.to receiver) throws Throwable {
    moom.jX forwardValue1224_18_0;
    moom.DD forwardValue1224_19_0;
    net.minecraft.entity.Entity[] spill1224_0;
    moom.jX spill1224_1;
    long life1_3;
    moom.jX life4_7;
    net.minecraft.entity.Entity[] life3_8;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead1224_0() ^ 7842085765393L);
    spill1224_0 = __call1224_1();
    life4_7 = __call1224_2(receiver);
    life3_8 = spill1224_0;
    spill1224_1 = life4_7;
    if (!((life3_8 != null))) {
        forwardValue1224_18_0 = spill1224_1;
        break forward_join_18;
    }
    if (!((spill1224_1 == null))) {
        break forward_join_17;
    }
    forwardValue1224_19_0 = __call1224_4(__call1224_3(receiver));
    break forward_join_19;
    }
    forwardValue1224_18_0 = life4_7;
    }
    forwardValue1224_19_0 = __call1224_5(forwardValue1224_18_0);
    }
    return forwardValue1224_19_0;
}
public static void h1224_0(moom.Oo p0) throws Throwable {
    throw __call1122400_0(p0);
}
public static void h1224_1(moom.Oo p0) throws Throwable {
    throw __call1122401_0(p0);
}
private static native long __fieldRead1224_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call1224_1() throws Throwable;
private static native moom.jX __call1224_2(moom.to a0) throws Throwable;
private static native java.util.UUID __call1224_3(moom.to a0) throws Throwable;
private static native moom.DD __call1224_4(java.util.UUID a0) throws Throwable;
private static native moom.DD __call1224_5(moom.jX a0) throws Throwable;
private static native java.lang.Exception __call1122400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1122401_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.DR __sourceHandlerCall_85e64fd104443f5f1d3a(moom.to a0, float a1) throws E;
private static final class __SourceHandler_85e64fd104443f5f1d3a {

public static moom.DR f1225(moom.to receiver, float p0) throws Throwable {
    float forwardValue1225_54_0;
    float forwardValue1225_54_1;
    moom.to forwardValue1225_73_0;
    net.minecraft.entity.Entity[] spill1225_0;
    moom.to spill1225_1;
    float spill1225_2;
    float spill1225_3;
    long life2_3;
    moom.to life6_6;
    net.minecraft.entity.Entity[] life4_7;
    net.minecraft.client.entity.EntityPlayerSP life5_18;
    float life6_21;
    float life7_24;
    com.moon.eA life8_30;
    float life9_63;
    float life10_74;
    forward_join_73: {
    forward_join_72: {
    forward_join_54: {
    forward_join_45: {
    life2_3 = (__fieldRead1225_0() ^ 19867125007516L);
    spill1225_0 = __call1225_1();
    life6_6 = receiver;
    life4_7 = spill1225_0;
    spill1225_1 = life6_6;
    if (!((life4_7 != null))) {
        forwardValue1225_73_0 = spill1225_1;
        break forward_join_73;
    }
    if (!((__instanceOf1225_2(spill1225_1) != 0))) {
        break forward_join_72;
    }
    life5_18 = __cast1225_3(life6_6);
    life6_21 = __fieldRead1225_4(life5_18);
    life7_24 = __fieldRead1225_5(life5_18);
    life8_30 = new com.moon.eA(life7_24, life6_21);
    __call1225_8(__call1225_7(__call1225_6()), life8_30);
    spill1225_2 = p0;
    spill1225_3 = 0x1.0p0f;
    if (!((life4_7 != null))) {
        forwardValue1225_54_0 = spill1225_2;
        forwardValue1225_54_1 = spill1225_3;
        break forward_join_54;
    }
    if (!((__numericCompare1225_9(spill1225_2, spill1225_3) == 0))) {
        break forward_join_45;
    }
    return __call1225_12(receiver, __call1225_10(life8_30), __call1225_11(life8_30));
    }
    forwardValue1225_54_0 = __fieldRead1225_13(life5_18);
    forwardValue1225_54_1 = ((__call1225_14(life8_30) - __fieldRead1225_15(life5_18)) * p0);
    }
    life9_63 = (forwardValue1225_54_0 + forwardValue1225_54_1);
    life10_74 = (__fieldRead1225_16(life5_18) + ((__call1225_17(life8_30) - __fieldRead1225_18(life5_18)) * p0));
    return __call1225_19(receiver, life9_63, life10_74);
    }
    forwardValue1225_73_0 = receiver;
    }
    return __call1225_22(forwardValue1225_73_0, __fieldRead1225_20(receiver), __fieldRead1225_21(receiver));
}
public static void h1225_0(moom.Oo p0) throws Throwable {
    throw __call1122500_0(p0);
}
public static void h1225_1(moom.Oo p0) throws Throwable {
    throw __call1122501_0(p0);
}
public static void h1225_2(moom.Oo p0) throws Throwable {
    throw __call1122502_0(p0);
}
private static native long __fieldRead1225_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call1225_1() throws Throwable;
private static native int __instanceOf1225_2(moom.to a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __cast1225_3(moom.to a0) throws Throwable;
private static native float __fieldRead1225_4(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native float __fieldRead1225_5(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call1225_6() throws Throwable;
private static native com.moon.events.EventBus __call1225_7(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call1225_8(com.moon.events.EventBus a0, com.moon.eA a1) throws Throwable;
private static native int __numericCompare1225_9(float a0, float a1) throws Throwable;
private static native float __call1225_10(com.moon.eA a0) throws Throwable;
private static native float __call1225_11(com.moon.eA a0) throws Throwable;
private static native moom.DR __call1225_12(moom.to a0, float a1, float a2) throws Throwable;
private static native float __fieldRead1225_13(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native float __call1225_14(com.moon.eA a0) throws Throwable;
private static native float __fieldRead1225_15(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native float __fieldRead1225_16(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native float __call1225_17(com.moon.eA a0) throws Throwable;
private static native float __fieldRead1225_18(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.DR __call1225_19(moom.to a0, float a1, float a2) throws Throwable;
private static native float __fieldRead1225_20(moom.to a0) throws Throwable;
private static native float __fieldRead1225_21(moom.to a0) throws Throwable;
private static native moom.DR __call1225_22(moom.to a0, float a1, float a2) throws Throwable;
private static native java.lang.Exception __call1122500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1122501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1122502_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.jX __sourceHandlerCall_efcd5fdf57b05b60d4fb(moom.to a0) throws E;
private static final class __SourceHandler_efcd5fdf57b05b60d4fb {

public static moom.jX f1226(moom.to receiver) throws Throwable {
    moom.jX forwardValue1226_20_0;
    moom.jX spill1226_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_20: {
    forward_join_18: {
    life1_3 = (__fieldRead1226_0() ^ 88619008039670L);
    life3_5 = __call1226_1();
    spill1226_0 = __fieldRead1226_2(receiver);
    if (!((life3_5 != null))) {
        forwardValue1226_20_0 = spill1226_0;
        break forward_join_20;
    }
    if (!((spill1226_0 == null))) {
        break forward_join_18;
    }
    __fieldWrite1226_7(receiver, __call1226_6(__call1226_4(__call1226_3()), __call1226_5(receiver)));
    }
    forwardValue1226_20_0 = __fieldRead1226_8(receiver);
    }
    return forwardValue1226_20_0;
}
public static void h1226_0(moom.Oo p0) throws Throwable {
    throw __call1122600_0(p0);
}
public static void h1226_1(moom.Oo p0) throws Throwable {
    throw __call1122601_0(p0);
}
private static native long __fieldRead1226_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call1226_1() throws Throwable;
private static native moom.jX __fieldRead1226_2(moom.to a0) throws Throwable;
private static native net.minecraft.client.Minecraft __call1226_3() throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __call1226_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.util.UUID __call1226_5(moom.to a0) throws Throwable;
private static native moom.jX __call1226_6(net.minecraft.client.network.NetHandlerPlayClient a0, java.util.UUID a1) throws Throwable;
private static native void __fieldWrite1226_7(moom.to a0, moom.jX a1) throws Throwable;
private static native moom.jX __fieldRead1226_8(moom.to a0) throws Throwable;
private static native java.lang.Exception __call1122600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1122601_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_01773f1addd03d768ed7() throws E;
private static final class __SourceHandler_01773f1addd03d768ed7 {

public static boolean f2085() throws Throwable {
    int life0_1;
    life0_1 = __integerCategory2085_1(__call2085_0());
    if ((life0_1 == 0)) {
        return true;
    }
    return false;
}
public static void h2085_0(moom.Oo p0) throws Throwable {
    throw __call1208500_0(p0);
}
private static native boolean __call2085_0() throws Throwable;
private static native int __integerCategory2085_1(boolean value) throws Throwable;
private static native java.lang.Exception __call1208500_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_f72a279643035c1ecaf4(moom.to a0) throws E;
private static final class __SourceHandler_f72a279643035c1ecaf4 {

public static java.lang.String f1227(moom.to receiver) throws Throwable {
    moom.jX forwardValue1227_18_0;
    java.lang.String forwardValue1227_19_0;
    net.minecraft.entity.Entity[] spill1227_0;
    moom.jX spill1227_1;
    long life1_3;
    moom.jX life4_7;
    net.minecraft.entity.Entity[] life3_8;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead1227_0() ^ 120244130199207L);
    spill1227_0 = __call1227_1();
    life4_7 = __call1227_2(receiver);
    life3_8 = spill1227_0;
    spill1227_1 = life4_7;
    if (!((life3_8 != null))) {
        forwardValue1227_18_0 = spill1227_1;
        break forward_join_18;
    }
    if (!((spill1227_1 == null))) {
        break forward_join_17;
    }
    forwardValue1227_19_0 = __call1227_4(__call1227_3(receiver));
    break forward_join_19;
    }
    forwardValue1227_18_0 = life4_7;
    }
    forwardValue1227_19_0 = __call1227_5(forwardValue1227_18_0);
    }
    return forwardValue1227_19_0;
}
public static void h1227_0(moom.Oo p0) throws Throwable {
    throw __call1122700_0(p0);
}
public static void h1227_1(moom.Oo p0) throws Throwable {
    throw __call1122701_0(p0);
}
private static native long __fieldRead1227_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call1227_1() throws Throwable;
private static native moom.jX __call1227_2(moom.to a0) throws Throwable;
private static native java.util.UUID __call1227_3(moom.to a0) throws Throwable;
private static native java.lang.String __call1227_4(java.util.UUID a0) throws Throwable;
private static native java.lang.String __call1227_5(moom.jX a0) throws Throwable;
private static native java.lang.Exception __call1122700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1122701_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.n7 __sourceHandlerCall_fd15303fa822da7fcff7(moom.DD a0, java.lang.String a1) throws E;
private static final class __SourceHandler_fd15303fa822da7fcff7 {

public static moom.n7 f507(moom.DD p0, java.lang.String p1) throws Throwable {
    net.minecraft.client.renderer.texture.ITextureObject forestValue507_43_0;
    net.minecraft.entity.Entity[] spill507_0;
    net.minecraft.client.renderer.texture.ITextureObject spill507_1;
    moom.n7 spill507_2;
    moom.n7 spill507_3;
    java.io.File spill507_4;
    java.lang.String spill507_5;
    java.lang.Object[] spill507_6;
    java.lang.String spill507_7;
    moom.DD spill507_8;
    moom.li spill507_9;
    long life2_3;
    net.minecraft.client.renderer.texture.TextureManager life5_6;
    net.minecraft.client.renderer.texture.ITextureObject life6_11;
    net.minecraft.entity.Entity[] life4_12;
    forest_join_43: {
    forest_join_42: {
    life2_3 = (__fieldRead507_0() ^ 9829058900523L);
    life5_6 = __call507_2(__call507_1());
    spill507_0 = __call507_3();
    life6_11 = __call507_4(life5_6, p0);
    life4_12 = spill507_0;
    spill507_1 = life6_11;
    if (!((life4_12 != null))) {
        forestValue507_43_0 = spill507_1;
        break forest_join_43;
    }
    if (!((spill507_1 == null))) {
        break forest_join_42;
    }
    moom.n7 __stackOp507_6_0 = __sourceUninitializedNEW507_5();
    spill507_2 = __stackOp507_6_0;
    spill507_3 = __stackOp507_6_0;
    spill507_4 = null;
    spill507_5 = "http://skins.minecraft.net/MinecraftSkins/%s.png";
    java.lang.Object[] __stackOp507_7_0 = new java.lang.Object[1];
    spill507_6 = __stackOp507_7_0;
    (__stackOp507_7_0)[0] = __call507_8(p1);
    spill507_7 = __call507_9(spill507_5, spill507_6);
    spill507_8 = __call507_11(__call507_10(p1));
    moom.li __stackOp507_13_0 = __sourceUninitializedNEW507_12();
    spill507_9 = __stackOp507_13_0;
    __explicitNewInit507_14(__stackOp507_13_0);
    __explicitNewInit507_15(spill507_3, spill507_4, spill507_7, spill507_8, spill507_9);
    life6_11 = spill507_2;
    __call507_16(life5_6, p0, life6_11);
    }
    forestValue507_43_0 = life6_11;
    }
    return __cast507_17(forestValue507_43_0);
}
public static moom.n7 h507_0(moom.Oo p0) throws Throwable {
    throw __call3050700_0(p0);
}
private static native long __fieldRead507_0() throws Throwable;
private static native net.minecraft.client.Minecraft __call507_1() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call507_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.Entity[] __call507_3() throws Throwable;
private static native net.minecraft.client.renderer.texture.ITextureObject __call507_4(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native moom.n7 __sourceUninitializedNEW507_5() throws Throwable;
private static native java.lang.String __call507_8(java.lang.String a0) throws Throwable;
private static native java.lang.String __call507_9(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.util.UUID __call507_10(java.lang.String a0) throws Throwable;
private static native moom.DD __call507_11(java.util.UUID a0) throws Throwable;
private static native moom.li __sourceUninitializedNEW507_12() throws Throwable;
private static native void __explicitNewInit507_14(moom.li a0) throws Throwable;
private static native void __explicitNewInit507_15(moom.n7 a0, java.io.File a1, java.lang.String a2, moom.DD a3, moom.lh a4) throws Throwable;
private static native boolean __call507_16(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1, net.minecraft.client.renderer.texture.ITextureObject a2) throws Throwable;
private static native moom.n7 __cast507_17(net.minecraft.client.renderer.texture.ITextureObject a0) throws Throwable;
private static native java.lang.Exception __call3050700_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.DD __sourceHandlerCall_7150edfb2f6f66591ed5(moom.to a0) throws E;
private static final class __SourceHandler_7150edfb2f6f66591ed5 {

public static moom.DD f1228(moom.to receiver) throws Throwable {
    com.moon.module.impl.Capes forwardValue1228_20_0;
    int forwardValue1228_34_0;
    int forwardValue1228_45_0;
    moom.to forwardValue1228_57_0;
    moom.to forwardValue1228_65_0;
    moom.jX forwardValue1228_74_0;
    moom.DD forwardValue1228_75_0;
    com.moon.module.impl.Capes spill1228_0;
    boolean spill1228_1;
    boolean spill1228_2;
    moom.to spill1228_3;
    moom.jX spill1228_4;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    moom.jX life4_102;
    forward_join_75: {
    forward_join_74: {
    forward_join_73: {
    forward_join_65: {
    forward_join_64: {
    forward_join_57: {
    forward_join_56: {
    forward_join_45: {
    forward_join_39: {
    forward_join_34: {
    forward_join_33: {
    forward_join_20: {
    forward_join_18: {
    life1_3 = (__fieldRead1228_0() ^ 64264093540711L);
    life3_5 = __call1228_1();
    spill1228_0 = __fieldRead1228_2(receiver);
    if (!((life3_5 != null))) {
        forwardValue1228_20_0 = spill1228_0;
        break forward_join_20;
    }
    if (!((spill1228_0 == null))) {
        break forward_join_18;
    }
    __fieldWrite1228_8(receiver, __cast1228_7(__call1228_6(__call1228_4(__call1228_3()), __classLiteral1228_5())));
    }
    forwardValue1228_20_0 = __fieldRead1228_9(receiver);
    }
    spill1228_1 = __call1228_10(forwardValue1228_20_0);
    if (!((life3_5 != null))) {
        forwardValue1228_34_0 = __integerCategory1228_11(spill1228_1);
        break forward_join_34;
    }
    if (!(spill1228_1)) {
        break forward_join_33;
    }
    spill1228_2 = __call1228_13(__fieldRead1228_12(receiver), receiver);
    if (!((life3_5 != null))) {
        forwardValue1228_34_0 = __integerCategory1228_14(spill1228_2);
        break forward_join_34;
    }
    if (!(spill1228_2)) {
        break forward_join_33;
    }
    return __fieldRead1228_15();
    }
    forwardValue1228_34_0 = __integerCategory1228_17(__call1228_16());
    }
    if (!((life3_5 != null))) {
        forwardValue1228_45_0 = forwardValue1228_34_0;
        break forward_join_45;
    }
    if (!((forwardValue1228_34_0 == 0))) {
        break forward_join_39;
    }
    return null;
    }
    spill1228_3 = receiver;
    if (!((life3_5 != null))) {
        forwardValue1228_57_0 = spill1228_3;
        break forward_join_57;
    }
    forwardValue1228_45_0 = __numericCompare1228_19(__fieldRead1228_18(spill1228_3), 0L);
    }
    if (!((forwardValue1228_45_0 != 0))) {
        break forward_join_56;
    }
    if (!((__numericCompare1228_22(__call1228_20(), __fieldRead1228_21(receiver)) > 0))) {
        break forward_join_56;
    }
    __call1228_23(receiver);
    __fieldWrite1228_24(receiver, 0L);
    }
    forwardValue1228_57_0 = receiver;
    }
    if (!((life3_5 != null))) {
        forwardValue1228_65_0 = forwardValue1228_57_0;
        break forward_join_65;
    }
    if (!((__fieldRead1228_25(forwardValue1228_57_0) != null))) {
        break forward_join_64;
    }
    return __fieldRead1228_26(receiver);
    }
    forwardValue1228_65_0 = receiver;
    }
    life4_102 = __call1228_27(forwardValue1228_65_0);
    spill1228_4 = life4_102;
    if (!((life3_5 != null))) {
        forwardValue1228_74_0 = spill1228_4;
        break forward_join_74;
    }
    if (!((spill1228_4 == null))) {
        break forward_join_73;
    }
    forwardValue1228_75_0 = null;
    break forward_join_75;
    }
    forwardValue1228_74_0 = life4_102;
    }
    forwardValue1228_75_0 = __call1228_28(forwardValue1228_74_0);
    }
    return forwardValue1228_75_0;
}
public static void h1228_0(moom.Oo p0) throws Throwable {
    throw __call1122800_0(p0);
}
public static void h1228_1(moom.Oo p0) throws Throwable {
    throw __call1122801_0(p0);
}
public static void h1228_2(moom.Oo p0) throws Throwable {
    throw __call1122802_0(p0);
}
public static void h1228_3(moom.Oo p0) throws Throwable {
    throw __call1122803_0(p0);
}
public static void h1228_4(moom.Oo p0) throws Throwable {
    throw __call1122804_0(p0);
}
public static void h1228_5(moom.Oo p0) throws Throwable {
    throw __call1122805_0(p0);
}
public static void h1228_6(moom.Oo p0) throws Throwable {
    throw __call1122806_0(p0);
}
public static void h1228_7(moom.Oo p0) throws Throwable {
    throw __call1122807_0(p0);
}
public static void h1228_8(moom.Oo p0) throws Throwable {
    throw __call1122808_0(p0);
}
public static void h1228_9(moom.Oo p0) throws Throwable {
    throw __call1122809_0(p0);
}
public static void h1228_10(moom.Oo p0) throws Throwable {
    throw __call1122810_0(p0);
}
public static void h1228_11(moom.Oo p0) throws Throwable {
    throw __call1122811_0(p0);
}
public static void h1228_12(moom.Oo p0) throws Throwable {
    throw __call1122812_0(p0);
}
public static void h1228_13(moom.Oo p0) throws Throwable {
    throw __call1122813_0(p0);
}
public static void h1228_14(moom.Oo p0) throws Throwable {
    throw __call1122814_0(p0);
}
private static native long __fieldRead1228_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call1228_1() throws Throwable;
private static native com.moon.module.impl.Capes __fieldRead1228_2(moom.to a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call1228_3() throws Throwable;
private static native com.moon.fU __call1228_4(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.Object __classLiteral1228_5() throws Throwable;
private static native com.moon.module.Module __call1228_6(com.moon.fU a0, java.lang.Object a1) throws Throwable;
private static native com.moon.module.impl.Capes __cast1228_7(com.moon.module.Module a0) throws Throwable;
private static native void __fieldWrite1228_8(moom.to a0, com.moon.module.impl.Capes a1) throws Throwable;
private static native com.moon.module.impl.Capes __fieldRead1228_9(moom.to a0) throws Throwable;
private static native boolean __call1228_10(com.moon.module.impl.Capes a0) throws Throwable;
private static native int __integerCategory1228_11(boolean value) throws Throwable;
private static native com.moon.module.impl.Capes __fieldRead1228_12(moom.to a0) throws Throwable;
private static native boolean __call1228_13(com.moon.module.impl.Capes a0, moom.to a1) throws Throwable;
private static native int __integerCategory1228_14(boolean value) throws Throwable;
private static native moom.DD __fieldRead1228_15() throws Throwable;
private static native boolean __call1228_16() throws Throwable;
private static native int __integerCategory1228_17(boolean value) throws Throwable;
private static native long __fieldRead1228_18(moom.to a0) throws Throwable;
private static native int __numericCompare1228_19(long a0, long a1) throws Throwable;
private static native long __call1228_20() throws Throwable;
private static native long __fieldRead1228_21(moom.to a0) throws Throwable;
private static native int __numericCompare1228_22(long a0, long a1) throws Throwable;
private static native void __call1228_23(moom.to a0) throws Throwable;
private static native void __fieldWrite1228_24(moom.to a0, long a1) throws Throwable;
private static native moom.DD __fieldRead1228_25(moom.to a0) throws Throwable;
private static native moom.DD __fieldRead1228_26(moom.to a0) throws Throwable;
private static native moom.jX __call1228_27(moom.to a0) throws Throwable;
private static native moom.DD __call1228_28(moom.jX a0) throws Throwable;
private static native java.lang.Exception __call1122800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1122801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1122802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1122803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1122804_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1122805_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1122806_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1122807_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1122808_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1122809_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1122810_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1122811_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1122812_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1122813_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1122814_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> float __sourceHandlerCall_2bcd0663e809d9d22877(moom.to a0) throws E;
private static final class __SourceHandler_2bcd0663e809d9d22877 {

public static float f938(moom.to receiver) throws Throwable {
    moom.to forestValue938_19_0;
    float forestValue938_59_0;
    int forestValue938_64_0;
    moom.to forestValue938_66_0;
    moom.to forestValue938_73_0;
    float forestValue938_92_0;
    float forestValue938_92_1;
    net.minecraft.entity.Entity[] spill938_0;
    moom.to spill938_1;
    float spill938_2;
    float spill938_3;
    boolean spill938_4;
    moom.to spill938_5;
    float spill938_6;
    float spill938_7;
    long life1_3;
    float life4_6;
    net.minecraft.entity.Entity[] life3_7;
    net.minecraft.entity.ai.attributes.IAttributeInstance life5_22;
    double life6_25;
    float life4_40;
    int life8_83;
    float life9_88;
    forest_join_102: {
    forest_join_94: {
    forest_join_92: {
    forest_join_90: {
    forest_join_73: {
    forest_join_66: {
    forest_join_64: {
    forest_join_60: {
    forest_join_59: {
    forest_join_58: {
    forest_join_19: {
    forest_join_18: {
    life1_3 = (__fieldRead938_0() ^ 76992978904332L);
    spill938_0 = __call938_1();
    life4_6 = 0x1.0p0f;
    life3_7 = spill938_0;
    spill938_1 = receiver;
    if (!((life3_7 != null))) {
        forestValue938_19_0 = spill938_1;
        break forest_join_19;
    }
    if (!(__fieldRead938_3(__fieldRead938_2(spill938_1)))) {
        break forest_join_18;
    }
    life4_6 = (life4_6 * 0x1.19999ap0f);
    }
    forestValue938_19_0 = receiver;
    }
    life5_22 = __call938_5(forestValue938_19_0, __fieldRead938_4());
    life6_25 = __call938_6(life5_22);
    life4_40 = ((float) (((double) life4_6) * (((life6_25 / ((double) __call938_8(__fieldRead938_7(receiver)))) + 0x1.0p0d) / 0x1.0p1d)));
    spill938_2 = __call938_10(__fieldRead938_9(receiver));
    if (!((life3_7 != null))) {
        forestValue938_59_0 = spill938_2;
        break forest_join_59;
    }
    if (!((__numericCompare938_11(spill938_2, 0x0.0p0f) != 0))) {
        break forest_join_58;
    }
    spill938_3 = life4_40;
    if (!((life3_7 != null))) {
        forestValue938_59_0 = spill938_3;
        break forest_join_59;
    }
    if (!((!__call938_12(spill938_3)))) {
        break forest_join_58;
    }
    spill938_4 = __call938_13(life4_40);
    if (!((life3_7 != null))) {
        forestValue938_64_0 = __integerCategory938_14(spill938_4);
        break forest_join_64;
    }
    if (!(spill938_4)) {
        break forest_join_60;
    }
    }
    forestValue938_59_0 = 0x1.0p0f;
    }
    life4_40 = forestValue938_59_0;
    }
    spill938_5 = receiver;
    if (!((life3_7 != null))) {
        forestValue938_66_0 = spill938_5;
        break forest_join_66;
    }
    forestValue938_64_0 = __integerCategory938_16(__call938_15(spill938_5));
    }
    if (!((forestValue938_64_0 != 0))) {
        break forest_join_102;
    }
    forestValue938_66_0 = receiver;
    }
    if (!((life3_7 != null))) {
        forestValue938_73_0 = forestValue938_66_0;
        break forest_join_73;
    }
    if (!((__call938_18(__call938_17(forestValue938_66_0)) == __fieldRead938_19()))) {
        break forest_join_102;
    }
    forestValue938_73_0 = receiver;
    }
    life8_83 = __call938_20(forestValue938_73_0);
    life9_88 = (((float) life8_83) / 0x1.4p4f);
    spill938_6 = life9_88;
    spill938_7 = 0x1.0p0f;
    if (!((life3_7 != null))) {
        forestValue938_92_0 = spill938_6;
        forestValue938_92_1 = spill938_7;
        break forest_join_92;
    }
    if (!((__numericCompare938_21(spill938_6, spill938_7) > 0))) {
        break forest_join_90;
    }
    life9_88 = 0x1.0p0f;
    if (!((life3_7 == null))) {
        break forest_join_94;
    }
    }
    forestValue938_92_0 = life9_88;
    forestValue938_92_1 = life9_88;
    }
    life9_88 = (forestValue938_92_0 * forestValue938_92_1);
    }
    life4_40 = (life4_40 * (0x1.0p0f - (life9_88 * 0x1.333334p-3f)));
    }
    return life4_40;
}
public static float h938_0(moom.Oo p0) throws Throwable {
    throw __call3093800_0(p0);
}
public static float h938_1(moom.Oo p0) throws Throwable {
    throw __call3093801_0(p0);
}
public static float h938_2(moom.Oo p0) throws Throwable {
    throw __call3093802_0(p0);
}
public static float h938_3(moom.Oo p0) throws Throwable {
    throw __call3093803_0(p0);
}
public static float h938_4(moom.Oo p0) throws Throwable {
    throw __call3093804_0(p0);
}
public static float h938_5(moom.Oo p0) throws Throwable {
    throw __call3093805_0(p0);
}
public static float h938_6(moom.Oo p0) throws Throwable {
    throw __call3093806_0(p0);
}
public static float h938_7(moom.Oo p0) throws Throwable {
    throw __call3093807_0(p0);
}
public static float h938_8(moom.Oo p0) throws Throwable {
    throw __call3093808_0(p0);
}
public static float h938_9(moom.Oo p0) throws Throwable {
    throw __call3093809_0(p0);
}
public static float h938_10(moom.Oo p0) throws Throwable {
    throw __call3093810_0(p0);
}
private static native long __fieldRead938_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call938_1() throws Throwable;
private static native net.minecraft.entity.player.PlayerCapabilities __fieldRead938_2(moom.to a0) throws Throwable;
private static native boolean __fieldRead938_3(net.minecraft.entity.player.PlayerCapabilities a0) throws Throwable;
private static native net.minecraft.entity.ai.attributes.IAttribute __fieldRead938_4() throws Throwable;
private static native net.minecraft.entity.ai.attributes.IAttributeInstance __call938_5(moom.to a0, net.minecraft.entity.ai.attributes.IAttribute a1) throws Throwable;
private static native double __call938_6(net.minecraft.entity.ai.attributes.IAttributeInstance a0) throws Throwable;
private static native net.minecraft.entity.player.PlayerCapabilities __fieldRead938_7(moom.to a0) throws Throwable;
private static native float __call938_8(net.minecraft.entity.player.PlayerCapabilities a0) throws Throwable;
private static native net.minecraft.entity.player.PlayerCapabilities __fieldRead938_9(moom.to a0) throws Throwable;
private static native float __call938_10(net.minecraft.entity.player.PlayerCapabilities a0) throws Throwable;
private static native int __numericCompare938_11(float a0, float a1) throws Throwable;
private static native boolean __call938_12(float a0) throws Throwable;
private static native boolean __call938_13(float a0) throws Throwable;
private static native int __integerCategory938_14(boolean value) throws Throwable;
private static native boolean __call938_15(moom.to a0) throws Throwable;
private static native int __integerCategory938_16(boolean value) throws Throwable;
private static native net.minecraft.item.ItemStack __call938_17(moom.to a0) throws Throwable;
private static native net.minecraft.item.Item __call938_18(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.ItemBow __fieldRead938_19() throws Throwable;
private static native int __call938_20(moom.to a0) throws Throwable;
private static native int __numericCompare938_21(float a0, float a1) throws Throwable;
private static native java.lang.Exception __call3093800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3093801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3093802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3093803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3093804_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3093805_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3093806_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3093807_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3093808_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3093809_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3093810_0(moom.Oo a0) throws Throwable;

}


public boolean Z() {
return ((((this.ci) ? 1 : 0)) != 0);
}


public java.lang.String i__sourceReturn_0e30dfc966() {
return this.cj;
}


public static moom.n7 b(moom.DD p0, java.lang.String p1) { return __sourceHandlerCall_fd15303fa822da7fcff7(p0, p1); }


public java.lang.String b__sourceReturn_0e30dfc966() { return __sourceHandlerCall_f72a279643035c1ecaf4(this); }


public moom.DD b__DD() { return __sourceHandlerCall_7150edfb2f6f66591ed5(this); }


public moom.DD c__sourceReturn_e9022bf14b() {
return this.cg;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public void a(moom.DD p0) {
this.cg = ((moom.DD)(p0));
    return;
}


public static moom.n7 a(moom.DD p0, java.lang.String p1) { return __sourceHandlerCall_fef9b52e4516a28d8cf2(p0, p1); }


public moom.DR a__DR(float p0) { return __sourceHandlerCall_85e64fd104443f5f1d3a(this, p0); }


public void a(long p0) {
this.ch = ((long)(p0));
    return;
}


public long a__sourceReturn_f9912cc5c6() {
return this.ch;
}


private static java.lang.String a__sourceReturn_7b622a9996(java.lang.String p0) { return __sourceHandlerCall_87a089a3ae81bec2fc6f(p0); }


protected moom.jX a__jX() { return __sourceHandlerCall_efcd5fdf57b05b60d4fb(this); }


public moom.DD a__DD() { return __sourceHandlerCall_0cad417ce9643c937f9a(this); }


public static moom.DD a__DD(java.lang.String p0) {
return new moom.DD(__sourceIntrinsic_f3c5791fe5ef_originalDynamicSite1656_1(moom.DK.a(((java.lang.String)(p0)))));
}


public float m__sourceReturn_bc607678b6() { return __sourceHandlerCall_2bcd0663e809d9d22877(this); }


public static void k(boolean p0) {
cl = ((boolean)(p0));
    return;
}


public void j(boolean p0) {
this.ci = ((boolean)(p0));
    return;
}


public boolean U__Boolean() { return __sourceHandlerCall_fd746d3d19e531fac2f1(this); }


public boolean X() { return __sourceHandlerCall_2b6318eec00e5d868852(this); }


public boolean Y() { return __sourceHandlerCall_c1b42040b94f688f3cc0(this); }


public boolean W() { return __sourceHandlerCall_b4485f669f934702dc17(this); }


public static boolean ab() { return __sourceHandlerCall_01773f1addd03d768ed7(); }


public static boolean aa() {
return ((((moom.to.cl) ? 1 : 0)) != 0);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f3c5791fe5ef_originalDynamicSite1656_1(java.lang.String a0) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
