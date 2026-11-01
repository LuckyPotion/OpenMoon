package moom;

import io.netty.buffer.ByteBuf;


public class AE implements moom.yK<moom.y2> {

private net.minecraft.network.play.server.S44PacketWorldBorder$Action a;

private int b;

private double c;

private double d;

private double e;

private double f;

private long g;

private int h;

private int i;

private static long j;

public AE() {
super();
}


public AE(net.minecraft.world.border.WorldBorder p0, net.minecraft.network.play.server.S44PacketWorldBorder$Action p1) {
super();
    this.a = p1;
    this.c = (p0).e();
    this.d = (p0).f();
    this.f = (p0).g();
    this.e = (p0).h();
    this.g = (p0).a__Long();
    this.b = (p0).a__Int();
    this.i = (p0).c__Int();
    this.h = (p0).b__Int();
}


static {
moom.AE.j = (moom._c.a(-3701301976267047431L, -5414482102432582844L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(174187544064007L);
}

private static native <E extends Throwable> void __sourceHandlerCall_c017c1f9cc0298e01a72(moom.AE a0, net.minecraft.network.PacketBuffer a1) throws E;
private static final class __SourceHandler_c017c1f9cc0298e01a72 {

public static void f152(moom.AE receiver, net.minecraft.network.PacketBuffer p0) throws Throwable {
    int[] spill152_0;
    long life2_3;
    int[] life4_11;
    forward_join_94: {
    forward_join_62: {
    forward_join_56: {
    forward_join_50: {
    forward_join_40: {
    forward_join_26: {
    forward_join_24: {
    forward_join_20: {
    life2_3 = (__fieldRead152_0() ^ 66802289885421L);
    spill152_0 = __call152_1();
    __fieldWrite152_5(receiver, __cast152_4(__call152_3(p0, __classLiteral152_2())));
    life4_11 = spill152_0;
    if (!((life4_11 == null))) {
        break forward_join_24;
    }
    switch ((__fieldRead152_6())[__call152_8(__fieldRead152_7(receiver))]) {
case 1:
{
        break forward_join_20;
    }
case 2:
{
        break forward_join_26;
    }
case 3:
{
        break forward_join_40;
    }
case 4:
{
        break forward_join_50;
    }
case 5:
{
        break forward_join_56;
    }
case 6:
{
        break forward_join_62;
    }
default:
{
        break forward_join_94;
    }
}
    }
    __fieldWrite152_10(receiver, __call152_9(p0));
    }
    if (!((life4_11 != null))) {
        break forward_join_94;
    }
    }
    __fieldWrite152_12(receiver, __call152_11(p0));
    __fieldWrite152_14(receiver, __call152_13(p0));
    __fieldWrite152_16(receiver, __call152_15(p0));
    if (!((life4_11 != null))) {
        break forward_join_94;
    }
    }
    __fieldWrite152_18(receiver, __call152_17(p0));
    __fieldWrite152_20(receiver, __call152_19(p0));
    if (!((life4_11 != null))) {
        break forward_join_94;
    }
    }
    __fieldWrite152_22(receiver, __call152_21(p0));
    if (!((life4_11 != null))) {
        break forward_join_94;
    }
    }
    __fieldWrite152_24(receiver, __call152_23(p0));
    if (!((life4_11 != null))) {
        break forward_join_94;
    }
    }
    __fieldWrite152_26(receiver, __call152_25(p0));
    __fieldWrite152_28(receiver, __call152_27(p0));
    __fieldWrite152_30(receiver, __call152_29(p0));
    __fieldWrite152_32(receiver, __call152_31(p0));
    __fieldWrite152_34(receiver, __call152_33(p0));
    __fieldWrite152_36(receiver, __call152_35(p0));
    __fieldWrite152_38(receiver, __call152_37(p0));
    __fieldWrite152_40(receiver, __call152_39(p0));
    }
    return;
}
public static void h152_0(java.io.IOException p0) throws Throwable {
    throw __call2015200_0(p0);
}
public static void h152_1(java.io.IOException p0) throws Throwable {
    throw __call2015201_0(p0);
}
public static void h152_2(java.io.IOException p0) throws Throwable {
    throw __call2015202_0(p0);
}
public static void h152_3(java.io.IOException p0) throws Throwable {
    throw __call2015203_0(p0);
}
public static void h152_4(java.io.IOException p0) throws Throwable {
    throw __call2015204_0(p0);
}
public static void h152_5(java.io.IOException p0) throws Throwable {
    throw __call2015205_0(p0);
}
public static void h152_6(java.io.IOException p0) throws Throwable {
    throw __call2015206_0(p0);
}
private static native long __fieldRead152_0() throws Throwable;
private static native int[] __call152_1() throws Throwable;
private static native java.lang.Object __classLiteral152_2() throws Throwable;
private static native java.lang.Enum __call152_3(net.minecraft.network.PacketBuffer a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.network.play.server.S44PacketWorldBorder$Action __cast152_4(java.lang.Enum a0) throws Throwable;
private static native void __fieldWrite152_5(moom.AE a0, net.minecraft.network.play.server.S44PacketWorldBorder$Action a1) throws Throwable;
private static native int[] __fieldRead152_6() throws Throwable;
private static native net.minecraft.network.play.server.S44PacketWorldBorder$Action __fieldRead152_7(moom.AE a0) throws Throwable;
private static native int __call152_8(net.minecraft.network.play.server.S44PacketWorldBorder$Action a0) throws Throwable;
private static native double __call152_9(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite152_10(moom.AE a0, double a1) throws Throwable;
private static native double __call152_11(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite152_12(moom.AE a0, double a1) throws Throwable;
private static native double __call152_13(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite152_14(moom.AE a0, double a1) throws Throwable;
private static native long __call152_15(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite152_16(moom.AE a0, long a1) throws Throwable;
private static native double __call152_17(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite152_18(moom.AE a0, double a1) throws Throwable;
private static native double __call152_19(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite152_20(moom.AE a0, double a1) throws Throwable;
private static native int __call152_21(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite152_22(moom.AE a0, int a1) throws Throwable;
private static native int __call152_23(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite152_24(moom.AE a0, int a1) throws Throwable;
private static native double __call152_25(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite152_26(moom.AE a0, double a1) throws Throwable;
private static native double __call152_27(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite152_28(moom.AE a0, double a1) throws Throwable;
private static native double __call152_29(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite152_30(moom.AE a0, double a1) throws Throwable;
private static native double __call152_31(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite152_32(moom.AE a0, double a1) throws Throwable;
private static native long __call152_33(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite152_34(moom.AE a0, long a1) throws Throwable;
private static native int __call152_35(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite152_36(moom.AE a0, int a1) throws Throwable;
private static native int __call152_37(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite152_38(moom.AE a0, int a1) throws Throwable;
private static native int __call152_39(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite152_40(moom.AE a0, int a1) throws Throwable;
private static native java.lang.Exception __call2015200_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2015201_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2015202_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2015203_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2015204_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2015205_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2015206_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5083b31729e130a08fa9(moom.AE a0, net.minecraft.world.border.WorldBorder a1) throws E;
private static final class __SourceHandler_5083b31729e130a08fa9 {

public static void f153(moom.AE receiver, net.minecraft.world.border.WorldBorder p0) throws Throwable {
    net.minecraft.world.border.WorldBorder forwardValue153_76_0;
    double forwardValue153_76_1;
    net.minecraft.world.border.WorldBorder spill153_0;
    double spill153_1;
    long life2_3;
    int[] life4_5;
    forward_join_89: {
    forward_join_77: {
    forward_join_76: {
    forward_join_73: {
    forward_join_50: {
    forward_join_44: {
    forward_join_38: {
    forward_join_30: {
    forward_join_20: {
    forward_join_18: {
    forward_join_14: {
    life2_3 = (__fieldRead153_0() ^ 102310980685485L);
    life4_5 = __call153_1();
    if (!((life4_5 == null))) {
        break forward_join_18;
    }
    switch ((__fieldRead153_2())[__call153_4(__fieldRead153_3(receiver))]) {
case 1:
{
        break forward_join_14;
    }
case 2:
{
        break forward_join_20;
    }
case 3:
{
        break forward_join_30;
    }
case 4:
{
        break forward_join_38;
    }
case 5:
{
        break forward_join_44;
    }
case 6:
{
        break forward_join_50;
    }
default:
{
        break forward_join_89;
    }
}
    }
    __call153_6(p0, __fieldRead153_5(receiver));
    }
    if (!((life4_5 != null))) {
        break forward_join_89;
    }
    }
    __call153_10(p0, __fieldRead153_7(receiver), __fieldRead153_8(receiver), __fieldRead153_9(receiver));
    if (!((life4_5 != null))) {
        break forward_join_89;
    }
    }
    __call153_13(p0, __fieldRead153_11(receiver), __fieldRead153_12(receiver));
    if (!((life4_5 != null))) {
        break forward_join_89;
    }
    }
    __call153_15(p0, __fieldRead153_14(receiver));
    if (!((life4_5 != null))) {
        break forward_join_89;
    }
    }
    __call153_17(p0, __fieldRead153_16(receiver));
    if (!((life4_5 != null))) {
        break forward_join_89;
    }
    }
    spill153_0 = p0;
    spill153_1 = __fieldRead153_18(receiver);
    if (!((life4_5 == null))) {
        forwardValue153_76_0 = spill153_0;
        forwardValue153_76_1 = spill153_1;
        break forward_join_76;
    }
    __call153_20(spill153_0, spill153_1, __fieldRead153_19(receiver));
    if (!((__numericCompare153_22(__fieldRead153_21(receiver), 0L) > 0))) {
        break forward_join_73;
    }
    __call153_26(p0, __fieldRead153_23(receiver), __fieldRead153_24(receiver), __fieldRead153_25(receiver));
    if (!((life4_5 != null))) {
        break forward_join_77;
    }
    }
    forwardValue153_76_0 = p0;
    forwardValue153_76_1 = __fieldRead153_27(receiver);
    }
    __call153_28(forwardValue153_76_0, forwardValue153_76_1);
    }
    __call153_30(p0, __fieldRead153_29(receiver));
    __call153_32(p0, __fieldRead153_31(receiver));
    __call153_34(p0, __fieldRead153_33(receiver));
    }
    return;
}
public static void h153_0(moom.Oo p0) throws Throwable {
    throw __call2015300_0(p0);
}
public static void h153_1(moom.Oo p0) throws Throwable {
    throw __call2015301_0(p0);
}
public static void h153_2(moom.Oo p0) throws Throwable {
    throw __call2015302_0(p0);
}
public static void h153_3(moom.Oo p0) throws Throwable {
    throw __call2015303_0(p0);
}
public static void h153_4(moom.Oo p0) throws Throwable {
    throw __call2015304_0(p0);
}
public static void h153_5(moom.Oo p0) throws Throwable {
    throw __call2015305_0(p0);
}
public static void h153_6(moom.Oo p0) throws Throwable {
    throw __call2015306_0(p0);
}
public static void h153_7(moom.Oo p0) throws Throwable {
    throw __call2015307_0(p0);
}
public static void h153_8(moom.Oo p0) throws Throwable {
    throw __call2015308_0(p0);
}
public static void h153_9(moom.Oo p0) throws Throwable {
    throw __call2015309_0(p0);
}
private static native long __fieldRead153_0() throws Throwable;
private static native int[] __call153_1() throws Throwable;
private static native int[] __fieldRead153_2() throws Throwable;
private static native net.minecraft.network.play.server.S44PacketWorldBorder$Action __fieldRead153_3(moom.AE a0) throws Throwable;
private static native int __call153_4(net.minecraft.network.play.server.S44PacketWorldBorder$Action a0) throws Throwable;
private static native double __fieldRead153_5(moom.AE a0) throws Throwable;
private static native void __call153_6(net.minecraft.world.border.WorldBorder a0, double a1) throws Throwable;
private static native double __fieldRead153_7(moom.AE a0) throws Throwable;
private static native double __fieldRead153_8(moom.AE a0) throws Throwable;
private static native long __fieldRead153_9(moom.AE a0) throws Throwable;
private static native void __call153_10(net.minecraft.world.border.WorldBorder a0, double a1, double a2, long a3) throws Throwable;
private static native double __fieldRead153_11(moom.AE a0) throws Throwable;
private static native double __fieldRead153_12(moom.AE a0) throws Throwable;
private static native void __call153_13(net.minecraft.world.border.WorldBorder a0, double a1, double a2) throws Throwable;
private static native int __fieldRead153_14(moom.AE a0) throws Throwable;
private static native void __call153_15(net.minecraft.world.border.WorldBorder a0, int a1) throws Throwable;
private static native int __fieldRead153_16(moom.AE a0) throws Throwable;
private static native void __call153_17(net.minecraft.world.border.WorldBorder a0, int a1) throws Throwable;
private static native double __fieldRead153_18(moom.AE a0) throws Throwable;
private static native double __fieldRead153_19(moom.AE a0) throws Throwable;
private static native void __call153_20(net.minecraft.world.border.WorldBorder a0, double a1, double a2) throws Throwable;
private static native long __fieldRead153_21(moom.AE a0) throws Throwable;
private static native int __numericCompare153_22(long a0, long a1) throws Throwable;
private static native double __fieldRead153_23(moom.AE a0) throws Throwable;
private static native double __fieldRead153_24(moom.AE a0) throws Throwable;
private static native long __fieldRead153_25(moom.AE a0) throws Throwable;
private static native void __call153_26(net.minecraft.world.border.WorldBorder a0, double a1, double a2, long a3) throws Throwable;
private static native double __fieldRead153_27(moom.AE a0) throws Throwable;
private static native void __call153_28(net.minecraft.world.border.WorldBorder a0, double a1) throws Throwable;
private static native int __fieldRead153_29(moom.AE a0) throws Throwable;
private static native void __call153_30(net.minecraft.world.border.WorldBorder a0, int a1) throws Throwable;
private static native int __fieldRead153_31(moom.AE a0) throws Throwable;
private static native void __call153_32(net.minecraft.world.border.WorldBorder a0, int a1) throws Throwable;
private static native int __fieldRead153_33(moom.AE a0) throws Throwable;
private static native void __call153_34(net.minecraft.world.border.WorldBorder a0, int a1) throws Throwable;
private static native java.lang.Exception __call2015300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2015301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2015302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2015303_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2015304_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2015305_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2015306_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2015307_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2015308_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2015309_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_8cc251a888d54ca27189(moom.AE a0, net.minecraft.network.PacketBuffer a1) throws E;
private static final class __SourceHandler_8cc251a888d54ca27189 {

public static void f154(moom.AE receiver, net.minecraft.network.PacketBuffer p0) throws Throwable {
    int[] spill154_0;
    long life2_3;
    int[] life4_9;
    forward_join_101: {
    forward_join_65: {
    forward_join_59: {
    forward_join_53: {
    forward_join_41: {
    forward_join_25: {
    forward_join_23: {
    forward_join_18: {
    life2_3 = (__fieldRead154_0() ^ 81451581379428L);
    spill154_0 = __call154_1();
    __call154_3(p0, __fieldRead154_2(receiver));
    life4_9 = spill154_0;
    if (!((life4_9 == null))) {
        break forward_join_23;
    }
    switch ((__fieldRead154_4())[__call154_6(__fieldRead154_5(receiver))]) {
case 1:
{
        break forward_join_18;
    }
case 2:
{
        break forward_join_25;
    }
case 3:
{
        break forward_join_41;
    }
case 4:
{
        break forward_join_53;
    }
case 5:
{
        break forward_join_59;
    }
case 6:
{
        break forward_join_65;
    }
default:
{
        break forward_join_101;
    }
}
    }
    __call154_8(p0, __fieldRead154_7(receiver));
    }
    if (!((life4_9 != null))) {
        break forward_join_101;
    }
    }
    __call154_10(p0, __fieldRead154_9(receiver));
    __call154_12(p0, __fieldRead154_11(receiver));
    __call154_14(p0, __fieldRead154_13(receiver));
    if (!((life4_9 != null))) {
        break forward_join_101;
    }
    }
    __call154_16(p0, __fieldRead154_15(receiver));
    __call154_18(p0, __fieldRead154_17(receiver));
    if (!((life4_9 != null))) {
        break forward_join_101;
    }
    }
    __call154_20(p0, __fieldRead154_19(receiver));
    if (!((life4_9 != null))) {
        break forward_join_101;
    }
    }
    __call154_22(p0, __fieldRead154_21(receiver));
    if (!((life4_9 != null))) {
        break forward_join_101;
    }
    }
    __call154_24(p0, __fieldRead154_23(receiver));
    __call154_26(p0, __fieldRead154_25(receiver));
    __call154_28(p0, __fieldRead154_27(receiver));
    __call154_30(p0, __fieldRead154_29(receiver));
    __call154_32(p0, __fieldRead154_31(receiver));
    __call154_34(p0, __fieldRead154_33(receiver));
    __call154_36(p0, __fieldRead154_35(receiver));
    __call154_38(p0, __fieldRead154_37(receiver));
    }
    return;
}
public static void h154_0(java.io.IOException p0) throws Throwable {
    throw __call2015400_0(p0);
}
public static void h154_1(java.io.IOException p0) throws Throwable {
    throw __call2015401_0(p0);
}
public static void h154_2(java.io.IOException p0) throws Throwable {
    throw __call2015402_0(p0);
}
public static void h154_3(java.io.IOException p0) throws Throwable {
    throw __call2015403_0(p0);
}
public static void h154_4(java.io.IOException p0) throws Throwable {
    throw __call2015404_0(p0);
}
public static void h154_5(java.io.IOException p0) throws Throwable {
    throw __call2015405_0(p0);
}
public static void h154_6(java.io.IOException p0) throws Throwable {
    throw __call2015406_0(p0);
}
private static native long __fieldRead154_0() throws Throwable;
private static native int[] __call154_1() throws Throwable;
private static native net.minecraft.network.play.server.S44PacketWorldBorder$Action __fieldRead154_2(moom.AE a0) throws Throwable;
private static native void __call154_3(net.minecraft.network.PacketBuffer a0, net.minecraft.network.play.server.S44PacketWorldBorder$Action a1) throws Throwable;
private static native int[] __fieldRead154_4() throws Throwable;
private static native net.minecraft.network.play.server.S44PacketWorldBorder$Action __fieldRead154_5(moom.AE a0) throws Throwable;
private static native int __call154_6(net.minecraft.network.play.server.S44PacketWorldBorder$Action a0) throws Throwable;
private static native double __fieldRead154_7(moom.AE a0) throws Throwable;
private static native ByteBuf __call154_8(net.minecraft.network.PacketBuffer a0, double a1) throws Throwable;
private static native double __fieldRead154_9(moom.AE a0) throws Throwable;
private static native ByteBuf __call154_10(net.minecraft.network.PacketBuffer a0, double a1) throws Throwable;
private static native double __fieldRead154_11(moom.AE a0) throws Throwable;
private static native ByteBuf __call154_12(net.minecraft.network.PacketBuffer a0, double a1) throws Throwable;
private static native long __fieldRead154_13(moom.AE a0) throws Throwable;
private static native void __call154_14(net.minecraft.network.PacketBuffer a0, long a1) throws Throwable;
private static native double __fieldRead154_15(moom.AE a0) throws Throwable;
private static native ByteBuf __call154_16(net.minecraft.network.PacketBuffer a0, double a1) throws Throwable;
private static native double __fieldRead154_17(moom.AE a0) throws Throwable;
private static native ByteBuf __call154_18(net.minecraft.network.PacketBuffer a0, double a1) throws Throwable;
private static native int __fieldRead154_19(moom.AE a0) throws Throwable;
private static native void __call154_20(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native int __fieldRead154_21(moom.AE a0) throws Throwable;
private static native void __call154_22(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native double __fieldRead154_23(moom.AE a0) throws Throwable;
private static native ByteBuf __call154_24(net.minecraft.network.PacketBuffer a0, double a1) throws Throwable;
private static native double __fieldRead154_25(moom.AE a0) throws Throwable;
private static native ByteBuf __call154_26(net.minecraft.network.PacketBuffer a0, double a1) throws Throwable;
private static native double __fieldRead154_27(moom.AE a0) throws Throwable;
private static native ByteBuf __call154_28(net.minecraft.network.PacketBuffer a0, double a1) throws Throwable;
private static native double __fieldRead154_29(moom.AE a0) throws Throwable;
private static native ByteBuf __call154_30(net.minecraft.network.PacketBuffer a0, double a1) throws Throwable;
private static native long __fieldRead154_31(moom.AE a0) throws Throwable;
private static native void __call154_32(net.minecraft.network.PacketBuffer a0, long a1) throws Throwable;
private static native int __fieldRead154_33(moom.AE a0) throws Throwable;
private static native void __call154_34(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native int __fieldRead154_35(moom.AE a0) throws Throwable;
private static native void __call154_36(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native int __fieldRead154_37(moom.AE a0) throws Throwable;
private static native void __call154_38(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native java.lang.Exception __call2015400_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2015401_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2015402_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2015403_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2015404_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2015405_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2015406_0(java.io.IOException a0) throws Throwable;

}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException { __sourceHandlerCall_8cc251a888d54ca27189(this, p0); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public void a(net.minecraft.world.border.WorldBorder p0) { __sourceHandlerCall_5083b31729e130a08fa9(this, p0); }


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.AE)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException { __sourceHandlerCall_c017c1f9cc0298e01a72(this, p0); }

}
