package moom;

import io.netty.buffer.ByteBuf;


public class AB implements moom.yK<moom.y2> {

public net.minecraft.network.play.server.S42PacketCombatEvent$Event a;

public int b;

public int c;

public int d;

public java.lang.String e;

private static long f;

private static long g;

public AB() {
super();
}


public AB(net.minecraft.util.CombatTracker p0, net.minecraft.network.play.server.S42PacketCombatEvent$Event p1) { super(); __sourceHandlerCall_8a8b5769222edcf1b412(this, p0, p1); }


static {
f = ((long)(((moom._a)(moom._c.a(((long)(3755053717362482545L)), ((long)(-3950920455810214020L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(56900041913759L)))));
    long local0_life6 = (moom.AB.f ^ 133573412109105L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill466_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill466_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill466_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill466_13 = new byte[8];
    (__sourceSpill466_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill466_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation466_15 = __sourceSpill466_13;
    ((javax.crypto.Cipher)(__sourceSpill466_10)).init(((int)(__sourceSpill466_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill466_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation466_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -7763268375579908798L;
    byte[] __sourceSpill466_19 = new byte[8];
    (__sourceSpill466_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill466_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill466_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill466_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill466_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill466_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill466_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill466_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill466_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill466_20)).doFinal(((byte[])(__sourceSpill466_19)));
    g = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceHandlerCall_8a8b5769222edcf1b412(moom.AB a0, net.minecraft.util.CombatTracker a1, net.minecraft.network.play.server.S42PacketCombatEvent$Event a2) throws E;
private static final class __SourceHandler_8a8b5769222edcf1b412 {

public static void f374(moom.AB receiver, net.minecraft.util.CombatTracker p0, net.minecraft.network.play.server.S42PacketCombatEvent$Event p1) throws Throwable {
    moom.AB forwardValue374_32_0;
    moom.AB forwardValue374_33_0;
    net.minecraft.entity.EntityLivingBase forwardValue374_33_1;
    moom.AB forwardValue374_34_0;
    int forwardValue374_34_1;
    moom.AB forwardValue374_49_0;
    moom.AB forwardValue374_50_0;
    net.minecraft.entity.EntityLivingBase forwardValue374_50_1;
    moom.AB forwardValue374_51_0;
    int forwardValue374_51_1;
    int[] spill374_0;
    moom.AB spill374_1;
    net.minecraft.entity.EntityLivingBase spill374_2;
    moom.AB spill374_3;
    net.minecraft.entity.EntityLivingBase spill374_4;
    long life3_3;
    int[] life5_7;
    net.minecraft.entity.EntityLivingBase life6_13;
    forward_join_57: {
    forward_join_51: {
    forward_join_50: {
    forward_join_49: {
    forward_join_37: {
    forward_join_34: {
    forward_join_33: {
    forward_join_32: {
    forward_join_25: {
    forward_join_21: {
    life3_3 = (__fieldRead374_0() ^ 125004905868538L);
    spill374_0 = __call374_1();
    __directSuperInit374_2(receiver);
    life5_7 = spill374_0;
    __fieldWrite374_3(receiver, p1);
    life6_13 = __call374_4(p0);
    if (!((life5_7 == null))) {
        break forward_join_25;
    }
    switch ((__fieldRead374_5())[__call374_6(p1)]) {
case 1:
{
        break forward_join_21;
    }
case 2:
{
        break forward_join_37;
    }
default:
{
        break forward_join_57;
    }
}
    }
    __fieldWrite374_8(receiver, __call374_7(p0));
    }
    spill374_1 = receiver;
    spill374_2 = life6_13;
    if (!((life5_7 == null))) {
        forwardValue374_33_0 = spill374_1;
        forwardValue374_33_1 = spill374_2;
        break forward_join_33;
    }
    if (!((spill374_2 == null))) {
        forwardValue374_32_0 = spill374_1;
        break forward_join_32;
    }
    forwardValue374_34_0 = spill374_1;
    forwardValue374_34_1 = -1;
    break forward_join_34;
    }
    forwardValue374_33_0 = forwardValue374_32_0;
    forwardValue374_33_1 = life6_13;
    }
    forwardValue374_34_0 = forwardValue374_33_0;
    forwardValue374_34_1 = __call374_9(forwardValue374_33_1);
    }
    __fieldWrite374_10(forwardValue374_34_0, forwardValue374_34_1);
    if (!((life5_7 != null))) {
        break forward_join_57;
    }
    }
    __fieldWrite374_13(receiver, __call374_12(__call374_11(p0)));
    spill374_3 = receiver;
    spill374_4 = life6_13;
    if (!((life5_7 == null))) {
        forwardValue374_50_0 = spill374_3;
        forwardValue374_50_1 = spill374_4;
        break forward_join_50;
    }
    if (!((spill374_4 == null))) {
        forwardValue374_49_0 = spill374_3;
        break forward_join_49;
    }
    forwardValue374_51_0 = spill374_3;
    forwardValue374_51_1 = -1;
    break forward_join_51;
    }
    forwardValue374_50_0 = forwardValue374_49_0;
    forwardValue374_50_1 = life6_13;
    }
    forwardValue374_51_0 = forwardValue374_50_0;
    forwardValue374_51_1 = __call374_14(forwardValue374_50_1);
    }
    __fieldWrite374_15(forwardValue374_51_0, forwardValue374_51_1);
    __fieldWrite374_18(receiver, __call374_17(__call374_16(p0)));
    }
    return;
}
public static void h374_0(moom.Oo p0) throws Throwable {
    throw __call3037400_0(p0);
}
public static void h374_1(moom.Oo p0) throws Throwable {
    throw __call3037401_0(p0);
}
public static void h374_2(moom.Oo p0) throws Throwable {
    throw __call3037402_0(p0);
}
public static void h374_3(moom.Oo p0) throws Throwable {
    throw __call3037403_0(p0);
}
public static void h374_4(moom.Oo p0) throws Throwable {
    throw __call3037404_0(p0);
}
public static void h374_5(moom.Oo p0) throws Throwable {
    throw __call3037405_0(p0);
}
public static void h374_6(moom.Oo p0) throws Throwable {
    throw __call3037406_0(p0);
}
private static native long __fieldRead374_0() throws Throwable;
private static native int[] __call374_1() throws Throwable;
private static native void __directSuperInit374_2(moom.AB a0) throws Throwable;
private static native void __fieldWrite374_3(moom.AB a0, net.minecraft.network.play.server.S42PacketCombatEvent$Event a1) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __call374_4(net.minecraft.util.CombatTracker a0) throws Throwable;
private static native int[] __fieldRead374_5() throws Throwable;
private static native int __call374_6(net.minecraft.network.play.server.S42PacketCombatEvent$Event a0) throws Throwable;
private static native int __call374_7(net.minecraft.util.CombatTracker a0) throws Throwable;
private static native void __fieldWrite374_8(moom.AB a0, int a1) throws Throwable;
private static native int __call374_9(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native void __fieldWrite374_10(moom.AB a0, int a1) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __call374_11(net.minecraft.util.CombatTracker a0) throws Throwable;
private static native int __call374_12(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native void __fieldWrite374_13(moom.AB a0, int a1) throws Throwable;
private static native int __call374_14(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native void __fieldWrite374_15(moom.AB a0, int a1) throws Throwable;
private static native net.minecraft.util.IChatComponent __call374_16(net.minecraft.util.CombatTracker a0) throws Throwable;
private static native java.lang.String __call374_17(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native void __fieldWrite374_18(moom.AB a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call3037400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3037401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3037402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3037403_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3037404_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3037405_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3037406_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_73834c2721ece640ac99(moom.AB a0, net.minecraft.network.PacketBuffer a1) throws E;
private static final class __SourceHandler_73834c2721ece640ac99 {

public static void f574(moom.AB receiver, net.minecraft.network.PacketBuffer p0) throws Throwable {
    net.minecraft.network.play.server.S42PacketCombatEvent$Event forwardValue574_33_0;
    net.minecraft.network.play.server.S42PacketCombatEvent$Event forwardValue574_33_1;
    moom.AB forwardValue574_43_0;
    int[] spill574_0;
    net.minecraft.network.play.server.S42PacketCombatEvent$Event spill574_1;
    net.minecraft.network.play.server.S42PacketCombatEvent$Event spill574_2;
    moom.AB spill574_3;
    long life2_3;
    int[] life4_11;
    forward_join_48: {
    forward_join_43: {
    forward_join_33: {
    forward_join_28: {
    life2_3 = (__fieldRead574_0() ^ 85396712094080L);
    spill574_0 = __call574_1();
    __fieldWrite574_5(receiver, __cast574_4(__call574_3(p0, __classLiteral574_2())));
    life4_11 = spill574_0;
    spill574_1 = __fieldRead574_6(receiver);
    spill574_2 = __fieldRead574_7();
    if (!((life4_11 == null))) {
        forwardValue574_33_0 = spill574_1;
        forwardValue574_33_1 = spill574_2;
        break forward_join_33;
    }
    if (!((spill574_1 == spill574_2))) {
        break forward_join_28;
    }
    __fieldWrite574_9(receiver, __call574_8(p0));
    __fieldWrite574_11(receiver, __call574_10(p0));
    if (!((life4_11 != null))) {
        break forward_join_48;
    }
    }
    spill574_3 = receiver;
    if (!((life4_11 == null))) {
        forwardValue574_43_0 = spill574_3;
        break forward_join_43;
    }
    forwardValue574_33_0 = __fieldRead574_12(spill574_3);
    forwardValue574_33_1 = __fieldRead574_13();
    }
    if (!((forwardValue574_33_0 == forwardValue574_33_1))) {
        break forward_join_48;
    }
    __fieldWrite574_15(receiver, __call574_14(p0));
    __fieldWrite574_17(receiver, __call574_16(p0));
    forwardValue574_43_0 = receiver;
    }
    __fieldWrite574_20(forwardValue574_43_0, __call574_19(p0, ((int) __fieldRead574_18())));
    }
    return;
}
public static void h574_0(java.io.IOException p0) throws Throwable {
    throw __call1057400_0(p0);
}
public static void h574_1(java.io.IOException p0) throws Throwable {
    throw __call1057401_0(p0);
}
public static void h574_2(java.io.IOException p0) throws Throwable {
    throw __call1057402_0(p0);
}
public static void h574_3(java.io.IOException p0) throws Throwable {
    throw __call1057403_0(p0);
}
public static void h574_4(java.io.IOException p0) throws Throwable {
    throw __call1057404_0(p0);
}
private static native long __fieldRead574_0() throws Throwable;
private static native int[] __call574_1() throws Throwable;
private static native java.lang.Object __classLiteral574_2() throws Throwable;
private static native java.lang.Enum __call574_3(net.minecraft.network.PacketBuffer a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.network.play.server.S42PacketCombatEvent$Event __cast574_4(java.lang.Enum a0) throws Throwable;
private static native void __fieldWrite574_5(moom.AB a0, net.minecraft.network.play.server.S42PacketCombatEvent$Event a1) throws Throwable;
private static native net.minecraft.network.play.server.S42PacketCombatEvent$Event __fieldRead574_6(moom.AB a0) throws Throwable;
private static native net.minecraft.network.play.server.S42PacketCombatEvent$Event __fieldRead574_7() throws Throwable;
private static native int __call574_8(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite574_9(moom.AB a0, int a1) throws Throwable;
private static native int __call574_10(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite574_11(moom.AB a0, int a1) throws Throwable;
private static native net.minecraft.network.play.server.S42PacketCombatEvent$Event __fieldRead574_12(moom.AB a0) throws Throwable;
private static native net.minecraft.network.play.server.S42PacketCombatEvent$Event __fieldRead574_13() throws Throwable;
private static native int __call574_14(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite574_15(moom.AB a0, int a1) throws Throwable;
private static native int __call574_16(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite574_17(moom.AB a0, int a1) throws Throwable;
private static native long __fieldRead574_18() throws Throwable;
private static native java.lang.String __call574_19(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native void __fieldWrite574_20(moom.AB a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1057400_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1057401_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1057402_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1057403_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1057404_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_3e6951bc98c416294c60(moom.AB a0, net.minecraft.network.PacketBuffer a1) throws E;
private static final class __SourceHandler_3e6951bc98c416294c60 {

public static void f575(moom.AB receiver, net.minecraft.network.PacketBuffer p0) throws Throwable {
    net.minecraft.network.play.server.S42PacketCombatEvent$Event forwardValue575_30_0;
    net.minecraft.network.play.server.S42PacketCombatEvent$Event forwardValue575_30_1;
    int[] spill575_0;
    net.minecraft.network.play.server.S42PacketCombatEvent$Event spill575_1;
    net.minecraft.network.play.server.S42PacketCombatEvent$Event spill575_2;
    long life2_3;
    int[] life4_9;
    forward_join_45: {
    forward_join_30: {
    forward_join_27: {
    life2_3 = (__fieldRead575_0() ^ 65416829413897L);
    spill575_0 = __call575_1();
    __call575_3(p0, __fieldRead575_2(receiver));
    life4_9 = spill575_0;
    spill575_1 = __fieldRead575_4(receiver);
    spill575_2 = __fieldRead575_5();
    if (!((life4_9 == null))) {
        forwardValue575_30_0 = spill575_1;
        forwardValue575_30_1 = spill575_2;
        break forward_join_30;
    }
    if (!((spill575_1 == spill575_2))) {
        break forward_join_27;
    }
    __call575_7(p0, __fieldRead575_6(receiver));
    __call575_9(p0, __fieldRead575_8(receiver));
    if (!((life4_9 != null))) {
        break forward_join_45;
    }
    }
    forwardValue575_30_0 = __fieldRead575_10(receiver);
    forwardValue575_30_1 = __fieldRead575_11();
    }
    if (!((forwardValue575_30_0 == forwardValue575_30_1))) {
        break forward_join_45;
    }
    __call575_13(p0, __fieldRead575_12(receiver));
    __call575_15(p0, __fieldRead575_14(receiver));
    __call575_17(p0, __fieldRead575_16(receiver));
    }
    return;
}
public static void h575_0(java.io.IOException p0) throws Throwable {
    throw __call1057500_0(p0);
}
public static void h575_1(java.io.IOException p0) throws Throwable {
    throw __call1057501_0(p0);
}
public static void h575_2(java.io.IOException p0) throws Throwable {
    throw __call1057502_0(p0);
}
public static void h575_3(java.io.IOException p0) throws Throwable {
    throw __call1057503_0(p0);
}
private static native long __fieldRead575_0() throws Throwable;
private static native int[] __call575_1() throws Throwable;
private static native net.minecraft.network.play.server.S42PacketCombatEvent$Event __fieldRead575_2(moom.AB a0) throws Throwable;
private static native void __call575_3(net.minecraft.network.PacketBuffer a0, net.minecraft.network.play.server.S42PacketCombatEvent$Event a1) throws Throwable;
private static native net.minecraft.network.play.server.S42PacketCombatEvent$Event __fieldRead575_4(moom.AB a0) throws Throwable;
private static native net.minecraft.network.play.server.S42PacketCombatEvent$Event __fieldRead575_5() throws Throwable;
private static native int __fieldRead575_6(moom.AB a0) throws Throwable;
private static native void __call575_7(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native int __fieldRead575_8(moom.AB a0) throws Throwable;
private static native ByteBuf __call575_9(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native net.minecraft.network.play.server.S42PacketCombatEvent$Event __fieldRead575_10(moom.AB a0) throws Throwable;
private static native net.minecraft.network.play.server.S42PacketCombatEvent$Event __fieldRead575_11() throws Throwable;
private static native int __fieldRead575_12(moom.AB a0) throws Throwable;
private static native void __call575_13(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native int __fieldRead575_14(moom.AB a0) throws Throwable;
private static native ByteBuf __call575_15(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native java.lang.String __fieldRead575_16(moom.AB a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call575_17(net.minecraft.network.PacketBuffer a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1057500_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1057501_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1057502_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1057503_0(java.io.IOException a0) throws Throwable;

}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException { __sourceHandlerCall_3e6951bc98c416294c60(this, p0); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.AB)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException { __sourceHandlerCall_73834c2721ece640ac99(this, p0); }

}
