package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class j3 implements com.moon.scripting.api.functions.PlayerFunctions {

private static net.minecraft.client.Minecraft a;

private static java.lang.String[] b;

private static long c;

private static java.lang.String[] d;

private static java.lang.String[] e;

private static java.util.Map f;

private static long[] g;

private static java.lang.Integer[] h;

private static java.util.Map i;

public j3() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-81723447358300156L)), ((long)(4473155482728595660L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(74603642885771L)))));
    java.lang.Object __sourceSpill177_6 = null;
    f = ((java.util.Map)(new java.util.HashMap(13)));
    com.moon.j3.b(((java.lang.String[])(__sourceSpill177_6)));
    long local11_life9 = (com.moon.j3.c ^ 45142145317085L);
    javax.crypto.Cipher local13_life11;
    javax.crypto.Cipher __sourceSpill177_13 = (local13_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill177_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill177_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill177_16 = new byte[8];
    (__sourceSpill177_16)[0] = ((byte) ((int) (local11_life9 >>> 56)));
    int local14_life17 = 1;
    while ((local14_life17 < 8)) {
        (__sourceSpill177_16)[local14_life17] = ((byte) ((int) ((local11_life9 << (local14_life17 * 8)) >>> 56)));
        local14_life17 += 1;
    }
    byte[] __sourcePreallocation177_18 = __sourceSpill177_16;
    ((javax.crypto.Cipher)(__sourceSpill177_13)).init(((int)(__sourceSpill177_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill177_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation177_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life21 = new java.lang.String[2];
    int local18_life22 = 0;
    java.lang.String local17_life23;
    int local19_life25 = ((java.lang.String)((local17_life23 = "¥õîºdXO]Ý^H\b½\b½ò½ú3`\n\001ÕÁ\fd8£H9\b_b¼Íl/BY§#¾ë=\013\005[\016Aio¬\024Á¦äTBl\003>ÅRC©å\030Ð1+ÓlL\024\005Ñ¯Y¤\"X\037Æ­ßÖ"))).length();
    int local16_life26 = 72;
    int local15_life27 = -1;
    while (true) {
        local15_life27 += 1;
        byte[] __sourceSpill177_30 = ((java.lang.String)(((java.lang.String)(local17_life23)).substring(((int)(local15_life27)), ((int)((local15_life27 + local16_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill177_31 = local13_life11;
        byte[] local21_life33 = ((javax.crypto.Cipher)(__sourceSpill177_31)).doFinal(((byte[])(__sourceSpill177_30)));
        java.lang.String __sourceSpill177_36 = ((java.lang.String)(com.moon.j3.a(((byte[])(local21_life33))))).intern();
        java.lang.String[] __sourceSpill177_37 = local20_life21;
        int __sourceSpill177_38 = local18_life22;
        local18_life22 += 1;
        (__sourceSpill177_37)[__sourceSpill177_38] = __sourceSpill177_36;
        if (!(((local15_life27 = (local15_life27 + local16_life26)) < local19_life25))) { break; }
        local16_life26 = ((java.lang.String)(local17_life23)).charAt(((int)(local15_life27)));
    }
    d = ((java.lang.String[])(local20_life21));
    e = ((java.lang.String[])(new java.lang.String[2]));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life44;
    javax.crypto.Cipher __sourceSpill177_46 = (local0_life44 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill177_47 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill177_48 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill177_49 = new byte[8];
    (__sourceSpill177_49)[0] = ((byte) ((int) (local11_life9 >>> 56)));
    int local1_life50 = 1;
    while ((local1_life50 < 8)) {
        (__sourceSpill177_49)[local1_life50] = ((byte) ((int) ((local11_life9 << (local1_life50 * 8)) >>> 56)));
        local1_life50 += 1;
    }
    byte[] __sourcePreallocation177_51 = __sourceSpill177_49;
    ((javax.crypto.Cipher)(__sourceSpill177_46)).init(((int)(__sourceSpill177_47)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill177_48)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation177_51)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life54 = new long[2];
    int local3_life55 = 0;
    java.lang.String local4_life56;
    int local5_life58 = ((java.lang.String)((local4_life56 = "4\000LxRs(FAx\036jÍ½|"))).length();
    int local2_life59 = 0;
    do {
        java.lang.String __sourceSpill177_60 = local4_life56;
        int __sourceSpill177_61 = local2_life59;
        local2_life59 += 8;
        byte[] local7_life64 = ((java.lang.String)(((java.lang.String)(__sourceSpill177_60)).substring(((int)(__sourceSpill177_61)), ((int)(local2_life59))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill177_65 = local6_life54;
        int __sourceSpill177_66 = local3_life55;
        local3_life55 += 1;
        long local8_life67 = (((((((((((long) (local7_life64)[0]) & 255L) << 56) | ((((long) (local7_life64)[1]) & 255L) << 48)) | ((((long) (local7_life64)[2]) & 255L) << 40)) | ((((long) (local7_life64)[3]) & 255L) << 32)) | ((((long) (local7_life64)[4]) & 255L) << 24)) | ((((long) (local7_life64)[5]) & 255L) << 16)) | ((((long) (local7_life64)[6]) & 255L) << 8)) | (((long) (local7_life64)[7]) & 255L));
        byte[] __sourceSpill177_68 = new byte[8];
        (__sourceSpill177_68)[0] = ((byte) ((int) (local8_life67 >>> 56)));
        (__sourceSpill177_68)[1] = ((byte) ((int) (local8_life67 >>> 48)));
        (__sourceSpill177_68)[2] = ((byte) ((int) (local8_life67 >>> 40)));
        (__sourceSpill177_68)[3] = ((byte) ((int) (local8_life67 >>> 32)));
        (__sourceSpill177_68)[4] = ((byte) ((int) (local8_life67 >>> 24)));
        (__sourceSpill177_68)[5] = ((byte) ((int) (local8_life67 >>> 16)));
        (__sourceSpill177_68)[6] = ((byte) ((int) (local8_life67 >>> 8)));
        (__sourceSpill177_68)[7] = ((byte) ((int) local8_life67));
        javax.crypto.Cipher __sourceSpill177_69 = local0_life44;
        byte[] local10_life71 = ((javax.crypto.Cipher)(__sourceSpill177_69)).doFinal(((byte[])(__sourceSpill177_68)));
        (__sourceSpill177_65)[__sourceSpill177_66] = (((((((((((long) (local10_life71)[0]) & 255L) << 56) | ((((long) (local10_life71)[1]) & 255L) << 48)) | ((((long) (local10_life71)[2]) & 255L) << 40)) | ((((long) (local10_life71)[3]) & 255L) << 32)) | ((((long) (local10_life71)[4]) & 255L) << 24)) | ((((long) (local10_life71)[5]) & 255L) << 16)) | ((((long) (local10_life71)[6]) & 255L) << 8)) | (((long) (local10_life71)[7]) & 255L));
    } while ((!(local2_life59 >= local5_life58)));
    g = ((long[])(local6_life54));
    h = ((java.lang.Integer[])(new java.lang.Integer[2]));
    a = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));
}

private static native <E extends Throwable> com.moon.scripting.api.types.RayCastResult __sourceHandlerCall_986ac0b912ad4bdac535(com.moon.j3 a0) throws E;
private static final class __SourceHandler_986ac0b912ad4bdac535 {

public static com.moon.scripting.api.types.RayCastResult f300006(com.moon.j3 receiver) throws Throwable {
    net.minecraft.util.MovingObjectPosition forwardValue300006_16_0;
    moom.DT forwardValue300006_31_0;
    moom.DR forwardValue300006_42_0;
    com.moon.scripting.api.types.RayCastResult forwardValue300006_51_0;
    com.moon.scripting.api.types.RayCastResult forwardValue300006_51_1;
    com.moon.scripting.api.enums.HitType[] forwardValue300006_51_2;
    com.moon.scripting.api.types.RayCastResult forwardValue300006_54_0;
    com.moon.scripting.api.types.RayCastResult forwardValue300006_54_1;
    com.moon.scripting.api.enums.HitType[] forwardValue300006_54_2;
    int forwardValue300006_54_3;
    com.moon.scripting.api.types.RayCastResult forwardValue300006_61_0;
    com.moon.scripting.api.types.RayCastResult forwardValue300006_61_1;
    com.moon.scripting.api.enums.HitType forwardValue300006_61_2;
    com.moon.scripting.api.enums.Facing[] forwardValue300006_61_3;
    com.moon.scripting.api.types.RayCastResult forwardValue300006_64_0;
    com.moon.scripting.api.types.RayCastResult forwardValue300006_64_1;
    com.moon.scripting.api.enums.HitType forwardValue300006_64_2;
    com.moon.scripting.api.enums.Facing[] forwardValue300006_64_3;
    int forwardValue300006_64_4;
    com.moon.scripting.api.types.RayCastResult forwardValue300006_88_0;
    com.moon.scripting.api.types.RayCastResult forwardValue300006_88_1;
    com.moon.scripting.api.enums.HitType forwardValue300006_88_2;
    com.moon.scripting.api.enums.Facing forwardValue300006_88_3;
    com.moon.scripting.api.types.Vec3i forwardValue300006_88_4;
    com.moon.scripting.api.types.Vec3d forwardValue300006_88_5;
    com.moon.scripting.api.types.RayCastResult forwardValue300006_91_0;
    com.moon.scripting.api.types.RayCastResult forwardValue300006_91_1;
    com.moon.scripting.api.enums.HitType forwardValue300006_91_2;
    com.moon.scripting.api.enums.Facing forwardValue300006_91_3;
    com.moon.scripting.api.types.Vec3i forwardValue300006_91_4;
    com.moon.scripting.api.types.Vec3d forwardValue300006_91_5;
    int forwardValue300006_91_6;
    boolean spill300006_0;
    net.minecraft.util.MovingObjectPosition spill300006_1;
    moom.DT spill300006_2;
    moom.DT spill300006_3;
    moom.DR spill300006_4;
    moom.DR spill300006_5;
    com.moon.scripting.api.types.RayCastResult spill300006_6;
    com.moon.scripting.api.types.RayCastResult spill300006_7;
    com.moon.scripting.api.enums.HitType[] spill300006_8;
    com.moon.scripting.api.enums.HitType spill300006_9;
    com.moon.scripting.api.enums.Facing[] spill300006_10;
    com.moon.scripting.api.enums.Facing spill300006_11;
    com.moon.scripting.api.types.Vec3i spill300006_12;
    com.moon.scripting.api.types.Vec3d spill300006_13;
    long life1_3;
    net.minecraft.util.MovingObjectPosition life4_7;
    int life3_8;
    moom.DT life5_22;
    moom.DR life6_25;
    forward_join_91: {
    forward_join_88: {
    forward_join_64: {
    forward_join_61: {
    forward_join_54: {
    forward_join_51: {
    forward_join_43: {
    forward_join_42: {
    forward_join_32: {
    forward_join_31: {
    forward_join_16: {
    forward_join_15: {
    life1_3 = (__fieldRead300006_0() ^ 104326803410909L);
    spill300006_0 = __call300006_1();
    life4_7 = __fieldRead300006_3(__fieldRead300006_2());
    life3_8 = __integerCategory300006_4(spill300006_0);
    spill300006_1 = life4_7;
    if (!((life3_8 != 0))) {
        forwardValue300006_16_0 = spill300006_1;
        break forward_join_16;
    }
    if (!((spill300006_1 == null))) {
        break forward_join_15;
    }
    return null;
    }
    forwardValue300006_16_0 = life4_7;
    }
    life5_22 = __call300006_5(forwardValue300006_16_0);
    life6_25 = __fieldRead300006_6(life4_7);
    spill300006_2 = life5_22;
    if (!((life3_8 != 0))) {
        forwardValue300006_31_0 = spill300006_2;
        break forward_join_31;
    }
    if (!((spill300006_2 == null))) {
        break forward_join_32;
    }
    moom.DT __stackOp300006_8_0 = __sourceUninitializedNEW300006_7();
    spill300006_3 = __stackOp300006_8_0;
    __explicitNewInit300006_9(__stackOp300006_8_0, 0, 0, 0);
    forwardValue300006_31_0 = spill300006_3;
    }
    life5_22 = forwardValue300006_31_0;
    }
    spill300006_4 = life6_25;
    if (!((life3_8 != 0))) {
        forwardValue300006_42_0 = spill300006_4;
        break forward_join_42;
    }
    if (!((spill300006_4 == null))) {
        break forward_join_43;
    }
    moom.DR __stackOp300006_11_0 = __sourceUninitializedNEW300006_10();
    spill300006_5 = __stackOp300006_11_0;
    __explicitNewInit300006_12(__stackOp300006_11_0, 0x0.0p0d, 0x0.0p0d, 0x0.0p0d);
    forwardValue300006_42_0 = spill300006_5;
    }
    life6_25 = forwardValue300006_42_0;
    }
    com.moon.scripting.api.types.RayCastResult __stackOp300006_14_0 = __sourceUninitializedNEW300006_13();
    spill300006_6 = __stackOp300006_14_0;
    spill300006_7 = __stackOp300006_14_0;
    spill300006_8 = __call300006_15();
    if (!((__fieldRead300006_16(life4_7) == null))) {
        forwardValue300006_51_0 = spill300006_6;
        forwardValue300006_51_1 = spill300006_7;
        forwardValue300006_51_2 = spill300006_8;
        break forward_join_51;
    }
    forwardValue300006_54_0 = spill300006_6;
    forwardValue300006_54_1 = spill300006_7;
    forwardValue300006_54_2 = spill300006_8;
    forwardValue300006_54_3 = 0;
    break forward_join_54;
    }
    forwardValue300006_54_0 = forwardValue300006_51_0;
    forwardValue300006_54_1 = forwardValue300006_51_1;
    forwardValue300006_54_2 = forwardValue300006_51_2;
    forwardValue300006_54_3 = __call300006_18(__fieldRead300006_17(life4_7));
    }
    spill300006_9 = (forwardValue300006_54_2)[forwardValue300006_54_3];
    spill300006_10 = __call300006_19();
    if (!((__fieldRead300006_20(life4_7) == null))) {
        forwardValue300006_61_0 = forwardValue300006_54_0;
        forwardValue300006_61_1 = forwardValue300006_54_1;
        forwardValue300006_61_2 = spill300006_9;
        forwardValue300006_61_3 = spill300006_10;
        break forward_join_61;
    }
    forwardValue300006_64_0 = forwardValue300006_54_0;
    forwardValue300006_64_1 = forwardValue300006_54_1;
    forwardValue300006_64_2 = spill300006_9;
    forwardValue300006_64_3 = spill300006_10;
    forwardValue300006_64_4 = 0;
    break forward_join_64;
    }
    forwardValue300006_64_0 = forwardValue300006_61_0;
    forwardValue300006_64_1 = forwardValue300006_61_1;
    forwardValue300006_64_2 = forwardValue300006_61_2;
    forwardValue300006_64_3 = forwardValue300006_61_3;
    forwardValue300006_64_4 = __call300006_22(__fieldRead300006_21(life4_7));
    }
    spill300006_11 = (forwardValue300006_64_3)[forwardValue300006_64_4];
    com.moon.scripting.api.types.Vec3i __stackOp300006_24_0 = __sourceUninitializedNEW300006_23();
    spill300006_12 = __stackOp300006_24_0;
    __explicitNewInit300006_28(__stackOp300006_24_0, __call300006_25(life5_22), __call300006_26(life5_22), __call300006_27(life5_22));
    com.moon.scripting.api.types.Vec3d __stackOp300006_30_0 = __sourceUninitializedNEW300006_29();
    spill300006_13 = __stackOp300006_30_0;
    __explicitNewInit300006_34(__stackOp300006_30_0, __fieldRead300006_31(life6_25), __fieldRead300006_32(life6_25), __fieldRead300006_33(life6_25));
    if (!((__fieldRead300006_35(life4_7) == null))) {
        forwardValue300006_88_0 = forwardValue300006_64_0;
        forwardValue300006_88_1 = forwardValue300006_64_1;
        forwardValue300006_88_2 = forwardValue300006_64_2;
        forwardValue300006_88_3 = spill300006_11;
        forwardValue300006_88_4 = spill300006_12;
        forwardValue300006_88_5 = spill300006_13;
        break forward_join_88;
    }
    forwardValue300006_91_0 = forwardValue300006_64_0;
    forwardValue300006_91_1 = forwardValue300006_64_1;
    forwardValue300006_91_2 = forwardValue300006_64_2;
    forwardValue300006_91_3 = spill300006_11;
    forwardValue300006_91_4 = spill300006_12;
    forwardValue300006_91_5 = spill300006_13;
    forwardValue300006_91_6 = 0;
    break forward_join_91;
    }
    forwardValue300006_91_0 = forwardValue300006_88_0;
    forwardValue300006_91_1 = forwardValue300006_88_1;
    forwardValue300006_91_2 = forwardValue300006_88_2;
    forwardValue300006_91_3 = forwardValue300006_88_3;
    forwardValue300006_91_4 = forwardValue300006_88_4;
    forwardValue300006_91_5 = forwardValue300006_88_5;
    forwardValue300006_91_6 = __call300006_37(__fieldRead300006_36(life4_7));
    }
    __explicitNewInit300006_38(forwardValue300006_91_1, forwardValue300006_91_2, forwardValue300006_91_3, forwardValue300006_91_4, forwardValue300006_91_5, forwardValue300006_91_6);
    return forwardValue300006_91_0;
}
private static native long __fieldRead300006_0() throws Throwable;
private static native boolean __call300006_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead300006_2() throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead300006_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __integerCategory300006_4(boolean value) throws Throwable;
private static native moom.DT __call300006_5(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native moom.DR __fieldRead300006_6(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native moom.DT __sourceUninitializedNEW300006_7() throws Throwable;
private static native void __explicitNewInit300006_9(moom.DT a0, int a1, int a2, int a3) throws Throwable;
private static native moom.DR __sourceUninitializedNEW300006_10() throws Throwable;
private static native void __explicitNewInit300006_12(moom.DR a0, double a1, double a2, double a3) throws Throwable;
private static native com.moon.scripting.api.types.RayCastResult __sourceUninitializedNEW300006_13() throws Throwable;
private static native com.moon.scripting.api.enums.HitType[] __call300006_15() throws Throwable;
private static native net.minecraft.util.MovingObjectPosition$MovingObjectType __fieldRead300006_16(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition$MovingObjectType __fieldRead300006_17(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native int __call300006_18(net.minecraft.util.MovingObjectPosition$MovingObjectType a0) throws Throwable;
private static native com.moon.scripting.api.enums.Facing[] __call300006_19() throws Throwable;
private static native moom.bs __fieldRead300006_20(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native moom.bs __fieldRead300006_21(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native int __call300006_22(moom.bs a0) throws Throwable;
private static native com.moon.scripting.api.types.Vec3i __sourceUninitializedNEW300006_23() throws Throwable;
private static native int __call300006_25(moom.DT a0) throws Throwable;
private static native int __call300006_26(moom.DT a0) throws Throwable;
private static native int __call300006_27(moom.DT a0) throws Throwable;
private static native void __explicitNewInit300006_28(com.moon.scripting.api.types.Vec3i a0, int a1, int a2, int a3) throws Throwable;
private static native com.moon.scripting.api.types.Vec3d __sourceUninitializedNEW300006_29() throws Throwable;
private static native double __fieldRead300006_31(moom.DR a0) throws Throwable;
private static native double __fieldRead300006_32(moom.DR a0) throws Throwable;
private static native double __fieldRead300006_33(moom.DR a0) throws Throwable;
private static native void __explicitNewInit300006_34(com.moon.scripting.api.types.Vec3d a0, double a1, double a2, double a3) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300006_35(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300006_36(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native int __call300006_37(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __explicitNewInit300006_38(com.moon.scripting.api.types.RayCastResult a0, com.moon.scripting.api.enums.HitType a1, com.moon.scripting.api.enums.Facing a2, com.moon.scripting.api.types.Vec3i a3, com.moon.scripting.api.types.Vec3d a4, int a5) throws Throwable;

}

private static native <E extends Throwable> com.moon.scripting.api.types.RayCastResult __sourceHandlerCall_590a96fecd5661ca7154(com.moon.j3 a0, float a1, float a2, float a3) throws E;
private static final class __SourceHandler_590a96fecd5661ca7154 {

public static com.moon.scripting.api.types.RayCastResult f300007(com.moon.j3 receiver, float p0, float p1, float p2) throws Throwable {
    net.minecraft.util.MovingObjectPosition forwardValue300007_24_0;
    moom.DT forwardValue300007_39_0;
    moom.DR forwardValue300007_50_0;
    com.moon.scripting.api.types.RayCastResult forwardValue300007_59_0;
    com.moon.scripting.api.types.RayCastResult forwardValue300007_59_1;
    com.moon.scripting.api.enums.HitType[] forwardValue300007_59_2;
    com.moon.scripting.api.types.RayCastResult forwardValue300007_62_0;
    com.moon.scripting.api.types.RayCastResult forwardValue300007_62_1;
    com.moon.scripting.api.enums.HitType[] forwardValue300007_62_2;
    int forwardValue300007_62_3;
    com.moon.scripting.api.types.RayCastResult forwardValue300007_69_0;
    com.moon.scripting.api.types.RayCastResult forwardValue300007_69_1;
    com.moon.scripting.api.enums.HitType forwardValue300007_69_2;
    com.moon.scripting.api.enums.Facing[] forwardValue300007_69_3;
    com.moon.scripting.api.types.RayCastResult forwardValue300007_72_0;
    com.moon.scripting.api.types.RayCastResult forwardValue300007_72_1;
    com.moon.scripting.api.enums.HitType forwardValue300007_72_2;
    com.moon.scripting.api.enums.Facing[] forwardValue300007_72_3;
    int forwardValue300007_72_4;
    com.moon.scripting.api.types.RayCastResult forwardValue300007_96_0;
    com.moon.scripting.api.types.RayCastResult forwardValue300007_96_1;
    com.moon.scripting.api.enums.HitType forwardValue300007_96_2;
    com.moon.scripting.api.enums.Facing forwardValue300007_96_3;
    com.moon.scripting.api.types.Vec3i forwardValue300007_96_4;
    com.moon.scripting.api.types.Vec3d forwardValue300007_96_5;
    com.moon.scripting.api.types.RayCastResult forwardValue300007_99_0;
    com.moon.scripting.api.types.RayCastResult forwardValue300007_99_1;
    com.moon.scripting.api.enums.HitType forwardValue300007_99_2;
    com.moon.scripting.api.enums.Facing forwardValue300007_99_3;
    com.moon.scripting.api.types.Vec3i forwardValue300007_99_4;
    com.moon.scripting.api.types.Vec3d forwardValue300007_99_5;
    int forwardValue300007_99_6;
    net.minecraft.util.MovingObjectPosition spill300007_0;
    moom.DT spill300007_1;
    moom.DT spill300007_2;
    moom.DR spill300007_3;
    moom.DR spill300007_4;
    com.moon.scripting.api.types.RayCastResult spill300007_5;
    com.moon.scripting.api.types.RayCastResult spill300007_6;
    com.moon.scripting.api.enums.HitType[] spill300007_7;
    com.moon.scripting.api.enums.HitType spill300007_8;
    com.moon.scripting.api.enums.Facing[] spill300007_9;
    com.moon.scripting.api.enums.Facing spill300007_10;
    com.moon.scripting.api.types.Vec3i spill300007_11;
    com.moon.scripting.api.types.Vec3d spill300007_12;
    long life4_3;
    int life6_5;
    net.minecraft.util.MovingObjectPosition life7_18;
    moom.DT life8_32;
    moom.DR life9_35;
    forward_join_99: {
    forward_join_96: {
    forward_join_72: {
    forward_join_69: {
    forward_join_62: {
    forward_join_59: {
    forward_join_51: {
    forward_join_50: {
    forward_join_40: {
    forward_join_39: {
    forward_join_24: {
    forward_join_23: {
    forward_join_11: {
    life4_3 = (__fieldRead300007_0() ^ 86808447301215L);
    life6_5 = __integerCategory300007_2(__call300007_1());
    if (!((__fieldRead300007_4(__fieldRead300007_3()) == null))) {
        break forward_join_11;
    }
    return null;
    }
    life7_18 = __call300007_5(p0, p1, p2, 0x1.0p0f);
    spill300007_0 = life7_18;
    if (!((life6_5 == 0))) {
        forwardValue300007_24_0 = spill300007_0;
        break forward_join_24;
    }
    if (!((spill300007_0 == null))) {
        break forward_join_23;
    }
    return null;
    }
    forwardValue300007_24_0 = life7_18;
    }
    life8_32 = __call300007_6(forwardValue300007_24_0);
    life9_35 = __fieldRead300007_7(life7_18);
    spill300007_1 = life8_32;
    if (!((life6_5 == 0))) {
        forwardValue300007_39_0 = spill300007_1;
        break forward_join_39;
    }
    if (!((spill300007_1 == null))) {
        break forward_join_40;
    }
    moom.DT __stackOp300007_9_0 = __sourceUninitializedNEW300007_8();
    spill300007_2 = __stackOp300007_9_0;
    __explicitNewInit300007_10(__stackOp300007_9_0, 0, 0, 0);
    forwardValue300007_39_0 = spill300007_2;
    }
    life8_32 = forwardValue300007_39_0;
    }
    spill300007_3 = life9_35;
    if (!((life6_5 == 0))) {
        forwardValue300007_50_0 = spill300007_3;
        break forward_join_50;
    }
    if (!((spill300007_3 == null))) {
        break forward_join_51;
    }
    moom.DR __stackOp300007_12_0 = __sourceUninitializedNEW300007_11();
    spill300007_4 = __stackOp300007_12_0;
    __explicitNewInit300007_13(__stackOp300007_12_0, 0x0.0p0d, 0x0.0p0d, 0x0.0p0d);
    forwardValue300007_50_0 = spill300007_4;
    }
    life9_35 = forwardValue300007_50_0;
    }
    com.moon.scripting.api.types.RayCastResult __stackOp300007_15_0 = __sourceUninitializedNEW300007_14();
    spill300007_5 = __stackOp300007_15_0;
    spill300007_6 = __stackOp300007_15_0;
    spill300007_7 = __call300007_16();
    if (!((__fieldRead300007_17(life7_18) == null))) {
        forwardValue300007_59_0 = spill300007_5;
        forwardValue300007_59_1 = spill300007_6;
        forwardValue300007_59_2 = spill300007_7;
        break forward_join_59;
    }
    forwardValue300007_62_0 = spill300007_5;
    forwardValue300007_62_1 = spill300007_6;
    forwardValue300007_62_2 = spill300007_7;
    forwardValue300007_62_3 = 0;
    break forward_join_62;
    }
    forwardValue300007_62_0 = forwardValue300007_59_0;
    forwardValue300007_62_1 = forwardValue300007_59_1;
    forwardValue300007_62_2 = forwardValue300007_59_2;
    forwardValue300007_62_3 = __call300007_19(__fieldRead300007_18(life7_18));
    }
    spill300007_8 = (forwardValue300007_62_2)[forwardValue300007_62_3];
    spill300007_9 = __call300007_20();
    if (!((__fieldRead300007_21(life7_18) == null))) {
        forwardValue300007_69_0 = forwardValue300007_62_0;
        forwardValue300007_69_1 = forwardValue300007_62_1;
        forwardValue300007_69_2 = spill300007_8;
        forwardValue300007_69_3 = spill300007_9;
        break forward_join_69;
    }
    forwardValue300007_72_0 = forwardValue300007_62_0;
    forwardValue300007_72_1 = forwardValue300007_62_1;
    forwardValue300007_72_2 = spill300007_8;
    forwardValue300007_72_3 = spill300007_9;
    forwardValue300007_72_4 = 0;
    break forward_join_72;
    }
    forwardValue300007_72_0 = forwardValue300007_69_0;
    forwardValue300007_72_1 = forwardValue300007_69_1;
    forwardValue300007_72_2 = forwardValue300007_69_2;
    forwardValue300007_72_3 = forwardValue300007_69_3;
    forwardValue300007_72_4 = __call300007_23(__fieldRead300007_22(life7_18));
    }
    spill300007_10 = (forwardValue300007_72_3)[forwardValue300007_72_4];
    com.moon.scripting.api.types.Vec3i __stackOp300007_25_0 = __sourceUninitializedNEW300007_24();
    spill300007_11 = __stackOp300007_25_0;
    __explicitNewInit300007_29(__stackOp300007_25_0, __call300007_26(life8_32), __call300007_27(life8_32), __call300007_28(life8_32));
    com.moon.scripting.api.types.Vec3d __stackOp300007_31_0 = __sourceUninitializedNEW300007_30();
    spill300007_12 = __stackOp300007_31_0;
    __explicitNewInit300007_35(__stackOp300007_31_0, __fieldRead300007_32(life9_35), __fieldRead300007_33(life9_35), __fieldRead300007_34(life9_35));
    if (!((__fieldRead300007_36(life7_18) == null))) {
        forwardValue300007_96_0 = forwardValue300007_72_0;
        forwardValue300007_96_1 = forwardValue300007_72_1;
        forwardValue300007_96_2 = forwardValue300007_72_2;
        forwardValue300007_96_3 = spill300007_10;
        forwardValue300007_96_4 = spill300007_11;
        forwardValue300007_96_5 = spill300007_12;
        break forward_join_96;
    }
    forwardValue300007_99_0 = forwardValue300007_72_0;
    forwardValue300007_99_1 = forwardValue300007_72_1;
    forwardValue300007_99_2 = forwardValue300007_72_2;
    forwardValue300007_99_3 = spill300007_10;
    forwardValue300007_99_4 = spill300007_11;
    forwardValue300007_99_5 = spill300007_12;
    forwardValue300007_99_6 = 0;
    break forward_join_99;
    }
    forwardValue300007_99_0 = forwardValue300007_96_0;
    forwardValue300007_99_1 = forwardValue300007_96_1;
    forwardValue300007_99_2 = forwardValue300007_96_2;
    forwardValue300007_99_3 = forwardValue300007_96_3;
    forwardValue300007_99_4 = forwardValue300007_96_4;
    forwardValue300007_99_5 = forwardValue300007_96_5;
    forwardValue300007_99_6 = __call300007_38(__fieldRead300007_37(life7_18));
    }
    __explicitNewInit300007_39(forwardValue300007_99_1, forwardValue300007_99_2, forwardValue300007_99_3, forwardValue300007_99_4, forwardValue300007_99_5, forwardValue300007_99_6);
    return forwardValue300007_99_0;
}
private static native long __fieldRead300007_0() throws Throwable;
private static native boolean __call300007_1() throws Throwable;
private static native int __integerCategory300007_2(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead300007_3() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead300007_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __call300007_5(float a0, float a1, float a2, float a3) throws Throwable;
private static native moom.DT __call300007_6(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native moom.DR __fieldRead300007_7(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native moom.DT __sourceUninitializedNEW300007_8() throws Throwable;
private static native void __explicitNewInit300007_10(moom.DT a0, int a1, int a2, int a3) throws Throwable;
private static native moom.DR __sourceUninitializedNEW300007_11() throws Throwable;
private static native void __explicitNewInit300007_13(moom.DR a0, double a1, double a2, double a3) throws Throwable;
private static native com.moon.scripting.api.types.RayCastResult __sourceUninitializedNEW300007_14() throws Throwable;
private static native com.moon.scripting.api.enums.HitType[] __call300007_16() throws Throwable;
private static native net.minecraft.util.MovingObjectPosition$MovingObjectType __fieldRead300007_17(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition$MovingObjectType __fieldRead300007_18(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native int __call300007_19(net.minecraft.util.MovingObjectPosition$MovingObjectType a0) throws Throwable;
private static native com.moon.scripting.api.enums.Facing[] __call300007_20() throws Throwable;
private static native moom.bs __fieldRead300007_21(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native moom.bs __fieldRead300007_22(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native int __call300007_23(moom.bs a0) throws Throwable;
private static native com.moon.scripting.api.types.Vec3i __sourceUninitializedNEW300007_24() throws Throwable;
private static native int __call300007_26(moom.DT a0) throws Throwable;
private static native int __call300007_27(moom.DT a0) throws Throwable;
private static native int __call300007_28(moom.DT a0) throws Throwable;
private static native void __explicitNewInit300007_29(com.moon.scripting.api.types.Vec3i a0, int a1, int a2, int a3) throws Throwable;
private static native com.moon.scripting.api.types.Vec3d __sourceUninitializedNEW300007_30() throws Throwable;
private static native double __fieldRead300007_32(moom.DR a0) throws Throwable;
private static native double __fieldRead300007_33(moom.DR a0) throws Throwable;
private static native double __fieldRead300007_34(moom.DR a0) throws Throwable;
private static native void __explicitNewInit300007_35(com.moon.scripting.api.types.Vec3d a0, double a1, double a2, double a3) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300007_36(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300007_37(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native int __call300007_38(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __explicitNewInit300007_39(com.moon.scripting.api.types.RayCastResult a0, com.moon.scripting.api.enums.HitType a1, com.moon.scripting.api.enums.Facing a2, com.moon.scripting.api.types.Vec3i a3, com.moon.scripting.api.types.Vec3d a4, int a5) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f043c71eb2c3c6ecaf78(com.moon.j3 a0, int a1, java.lang.Object[] a2) throws E;
private static final class __SourceHandler_f043c71eb2c3c6ecaf78 {

public static void f81(com.moon.j3 receiver, int p0, java.lang.Object[] p1) throws Throwable {
    int forestValue81_12_0;
    int forestValue81_21_0;
    int forestValue81_50_0;
    int forestValue81_83_0;
    java.lang.Object forestValue81_85_0;
    int forestValue81_124_0;
    java.lang.Object forestValue81_151_0;
    java.lang.Object forestValue81_201_0;
    java.lang.Object forestValue81_248_0;
    java.lang.Object forestValue81_316_0;
    java.lang.Object forestValue81_374_0;
    net.minecraft.client.network.NetHandlerPlayClient forestValue81_426_0;
    moom.zb forestValue81_426_1;
    moom.zb forestValue81_426_2;
    moom.DT forestValue81_426_3;
    int forestValue81_426_4;
    net.minecraft.client.network.NetHandlerPlayClient forestValue81_431_0;
    moom.zb forestValue81_431_1;
    moom.zb forestValue81_431_2;
    moom.DT forestValue81_431_3;
    int forestValue81_431_4;
    net.minecraft.item.ItemStack forestValue81_431_5;
    int forestValue81_465_0;
    int forestValue81_474_0;
    int forestValue81_550_0;
    int forestValue81_550_1;
    int forestValue81_556_0;
    int forestValue81_604_0;
    int forestValue81_633_0;
    java.lang.Object forestValue81_674_0;
    int spill81_0;
    net.minecraft.client.network.NetHandlerPlayClient spill81_1;
    moom.y4 spill81_2;
    int spill81_3;
    int spill81_4;
    net.minecraft.client.network.NetHandlerPlayClient spill81_5;
    moom.y6 spill81_6;
    java.lang.Object spill81_7;
    net.minecraft.client.network.NetHandlerPlayClient spill81_8;
    moom.y6 spill81_9;
    moom.y6 spill81_10;
    int spill81_11;
    moom.DR spill81_12;
    int spill81_13;
    net.minecraft.client.network.NetHandlerPlayClient spill81_14;
    moom.y7 spill81_15;
    java.lang.Object[] spill81_16;
    net.minecraft.client.network.NetHandlerPlayClient spill81_17;
    moom.y8 spill81_18;
    java.lang.Object[] spill81_19;
    net.minecraft.client.network.NetHandlerPlayClient spill81_20;
    moom.y9 spill81_21;
    java.lang.Object[] spill81_22;
    net.minecraft.client.network.NetHandlerPlayClient spill81_23;
    moom.y_ spill81_24;
    java.lang.Object[] spill81_25;
    net.minecraft.client.network.NetHandlerPlayClient spill81_26;
    moom.za spill81_27;
    moom.za spill81_28;
    net.minecraft.network.play.client.C07PacketPlayerDigging$Action spill81_29;
    moom.DT spill81_30;
    java.lang.Object[] spill81_31;
    net.minecraft.client.network.NetHandlerPlayClient spill81_32;
    moom.zb spill81_33;
    moom.zb spill81_34;
    moom.DT spill81_35;
    int spill81_36;
    int spill81_37;
    net.minecraft.client.network.NetHandlerPlayClient spill81_38;
    moom.zc spill81_39;
    net.minecraft.client.network.NetHandlerPlayClient spill81_40;
    moom.zc spill81_41;
    net.minecraft.client.network.NetHandlerPlayClient spill81_42;
    moom.zd spill81_43;
    int spill81_44;
    int spill81_45;
    net.minecraft.client.network.NetHandlerPlayClient spill81_46;
    moom.ze spill81_47;
    int spill81_48;
    net.minecraft.client.network.NetHandlerPlayClient spill81_49;
    moom.ze spill81_50;
    int spill81_51;
    net.minecraft.client.network.NetHandlerPlayClient spill81_52;
    moom.zg spill81_53;
    int spill81_54;
    net.minecraft.client.network.NetHandlerPlayClient spill81_55;
    moom.zi spill81_56;
    java.lang.Object[] spill81_57;
    net.minecraft.client.network.NetHandlerPlayClient spill81_58;
    moom.zp spill81_59;
    long life3_3;
    int life5_5;
    int life6_24;
    int life6_57;
    java.lang.Object life7_61;
    com.moon.scripting.api.enums.InteractActions life8_70;
    net.minecraft.network.play.client.C02PacketUseEntity$Action life10_75;
    com.moon.scripting.api.types.Vec3d life9_96;
    int life6_138;
    double life6_171;
    double life8_177;
    double life10_183;
    int life12_189;
    float life6_225;
    float life7_231;
    int life8_237;
    double life6_276;
    double life8_282;
    double life10_288;
    float life12_294;
    float life13_300;
    int life14_306;
    com.moon.scripting.api.enums.DiggingActions life6_347;
    com.moon.scripting.api.types.Vec3i life7_352;
    com.moon.scripting.api.enums.Facing life8_357;
    com.moon.scripting.api.types.Vec3i life6_409;
    int life7_415;
    int life8_421;
    float life9_427;
    float life10_433;
    float life11_439;
    int life6_514;
    int life6_568;
    com.moon.scripting.api.enums.EntityAction life7_573;
    int life6_605;
    com.moon.scripting.api.enums.EntityAction life7_610;
    int life8_616;
    int life6_657;
    int life6_690;
    int life7_696;
    int life8_702;
    com.moon.scripting.api.enums.ClientStatusActions life6_736;
    forest_join_694: {
    forest_join_689: {
    forest_join_674: {
    forest_join_665: {
    forest_join_658: {
    forest_join_633: {
    forest_join_622: {
    forest_join_615: {
    forest_join_604: {
    forest_join_593: {
    forest_join_586: {
    forest_join_556: {
    forest_join_550: {
    forest_join_545: {
    forest_join_511: {
    forest_join_504: {
    forest_join_492: {
    forest_join_485: {
    forest_join_474: {
    forest_join_465: {
    forest_join_463: {
    forest_join_449: {
    forest_join_438: {
    forest_join_431: {
    forest_join_426: {
    forest_join_374: {
    forest_join_361: {
    forest_join_354: {
    forest_join_316: {
    forest_join_307: {
    forest_join_296: {
    forest_join_248: {
    forest_join_235: {
    forest_join_228: {
    forest_join_201: {
    forest_join_192: {
    forest_join_185: {
    forest_join_151: {
    forest_join_142: {
    forest_join_135: {
    forest_join_124: {
    forest_join_113: {
    forest_join_106: {
    forest_join_104: {
    forest_join_85: {
    forest_join_83: {
    forest_join_79: {
    forest_join_50: {
    forest_join_39: {
    forest_join_32: {
    forest_join_21: {
    forest_join_12: {
    forest_join_10: {
    life3_3 = (__fieldRead81_0() ^ 3116137753312L);
    life5_5 = __integerCategory81_2(__call81_1());
    spill81_0 = p0;
    if (!((life5_5 != 0))) {
        forestValue81_12_0 = spill81_0;
        break forest_join_12;
    }
    switch (spill81_0) {
case 0:
{
        break forest_join_10;
    }
case 2:
{
        break forest_join_39;
    }
case 3:
{
        break forest_join_113;
    }
case 4:
{
        break forest_join_142;
    }
case 5:
{
        break forest_join_192;
    }
case 6:
{
        break forest_join_235;
    }
case 7:
{
        break forest_join_307;
    }
case 8:
{
        break forest_join_361;
    }
case 9:
{
        break forest_join_449;
    }
case 10:
{
        break forest_join_492;
    }
case 11:
{
        break forest_join_511;
    }
case 13:
{
        break forest_join_593;
    }
case 15:
{
        break forest_join_622;
    }
case 22:
{
        break forest_join_665;
    }
case 1:
case 12:
case 14:
case 16:
case 17:
case 18:
case 19:
case 20:
case 21:
default:
{
        break forest_join_694;
    }
}
    }
    forestValue81_12_0 = (p1).length;
    }
    if (!((life5_5 != 0))) {
        forestValue81_21_0 = forestValue81_12_0;
        break forest_join_21;
    }
    if (!((forestValue81_12_0 == 1))) {
        break forest_join_32;
    }
    forestValue81_21_0 = __call81_4(__call81_3((p1)[0]));
    }
    life6_24 = forestValue81_21_0;
    spill81_1 = __fieldRead81_7(__fieldRead81_6(__fieldRead81_5()));
    moom.y4 __stackOp81_9_0 = __sourceUninitializedNEW81_8();
    spill81_2 = __stackOp81_9_0;
    __explicitNewInit81_10(__stackOp81_9_0, life6_24);
    __call81_11(spill81_1, spill81_2);
    if (!((life5_5 == 0))) {
        break forest_join_694;
    }
    }
    __call81_12(receiver, (p1).length, 1);
    if (!((life5_5 == 0))) {
        break forest_join_694;
    }
    }
    spill81_3 = (p1).length;
    if (!((life5_5 != 0))) {
        forestValue81_50_0 = spill81_3;
        break forest_join_50;
    }
    if (!((spill81_3 == 2))) {
        break forest_join_106;
    }
    forestValue81_50_0 = __call81_14(__call81_13((p1)[0]));
    }
    life6_57 = forestValue81_50_0;
    life7_61 = (p1)[1];
    spill81_4 = __instanceOf81_15(life7_61);
    if (!((life5_5 != 0))) {
        forestValue81_83_0 = spill81_4;
        break forest_join_83;
    }
    if (!((spill81_4 != 0))) {
        break forest_join_79;
    }
    life8_70 = __cast81_16(life7_61);
    life10_75 = (__call81_17())[__call81_18(life8_70)];
    spill81_5 = __fieldRead81_21(__fieldRead81_20(__fieldRead81_19()));
    moom.y6 __stackOp81_23_0 = __sourceUninitializedNEW81_22();
    spill81_6 = __stackOp81_23_0;
    __explicitNewInit81_24(__stackOp81_23_0, life6_57, life10_75);
    __call81_25(spill81_5, spill81_6);
    if (!((life5_5 == 0))) {
        break forest_join_104;
    }
    }
    spill81_7 = life7_61;
    if (!((life5_5 != 0))) {
        forestValue81_85_0 = spill81_7;
        break forest_join_85;
    }
    forestValue81_83_0 = __instanceOf81_26(spill81_7);
    }
    if (!((forestValue81_83_0 != 0))) {
        break forest_join_104;
    }
    forestValue81_85_0 = life7_61;
    }
    life9_96 = __cast81_27(forestValue81_85_0);
    spill81_8 = __fieldRead81_30(__fieldRead81_29(__fieldRead81_28()));
    moom.y6 __stackOp81_32_0 = __sourceUninitializedNEW81_31();
    spill81_9 = __stackOp81_32_0;
    spill81_10 = __stackOp81_32_0;
    spill81_11 = life6_57;
    moom.DR __stackOp81_34_0 = __sourceUninitializedNEW81_33();
    spill81_12 = __stackOp81_34_0;
    __explicitNewInit81_38(__stackOp81_34_0, __fieldRead81_35(life9_96), __fieldRead81_36(life9_96), __fieldRead81_37(life9_96));
    __explicitNewInit81_39(spill81_10, spill81_11, spill81_12);
    __call81_40(spill81_8, spill81_9);
    }
    if (!((life5_5 == 0))) {
        break forest_join_694;
    }
    }
    __call81_41(receiver, (p1).length, 2);
    if (!((life5_5 == 0))) {
        break forest_join_694;
    }
    }
    spill81_13 = (p1).length;
    if (!((life5_5 != 0))) {
        forestValue81_124_0 = spill81_13;
        break forest_join_124;
    }
    if (!((spill81_13 == 1))) {
        break forest_join_135;
    }
    forestValue81_124_0 = __integerCategory81_44(__call81_43(__cast81_42((p1)[0])));
    }
    life6_138 = forestValue81_124_0;
    spill81_14 = __fieldRead81_47(__fieldRead81_46(__fieldRead81_45()));
    moom.y7 __stackOp81_49_0 = __sourceUninitializedNEW81_48();
    spill81_15 = __stackOp81_49_0;
    __explicitNewInit81_50(__stackOp81_49_0, __integerCategory81_51(life6_138));
    __call81_52(spill81_14, spill81_15);
    if (!((life5_5 == 0))) {
        break forest_join_694;
    }
    }
    __call81_53(receiver, (p1).length, 1);
    if (!((life5_5 == 0))) {
        break forest_join_694;
    }
    }
    spill81_16 = p1;
    if (!((life5_5 != 0))) {
        forestValue81_151_0 = spill81_16;
        break forest_join_151;
    }
    if (!(((spill81_16).length == 4))) {
        break forest_join_185;
    }
    forestValue81_151_0 = (p1)[0];
    }
    life6_171 = __call81_55(__call81_54(forestValue81_151_0));
    life8_177 = __call81_57(__call81_56((p1)[1]));
    life10_183 = __call81_59(__call81_58((p1)[2]));
    life12_189 = __integerCategory81_62(__call81_61(__cast81_60((p1)[3])));
    spill81_17 = __fieldRead81_65(__fieldRead81_64(__fieldRead81_63()));
    moom.y8 __stackOp81_67_0 = __sourceUninitializedNEW81_66();
    spill81_18 = __stackOp81_67_0;
    __explicitNewInit81_68(__stackOp81_67_0, life6_171, life8_177, life10_183, __integerCategory81_69(life12_189));
    __call81_70(spill81_17, spill81_18);
    if (!((life5_5 == 0))) {
        break forest_join_694;
    }
    }
    __call81_71(receiver, (p1).length, 4);
    if (!((life5_5 == 0))) {
        break forest_join_694;
    }
    }
    spill81_19 = p1;
    if (!((life5_5 != 0))) {
        forestValue81_201_0 = spill81_19;
        break forest_join_201;
    }
    if (!(((spill81_19).length == 3))) {
        break forest_join_228;
    }
    forestValue81_201_0 = (p1)[0];
    }
    life6_225 = __call81_73(__call81_72(forestValue81_201_0));
    life7_231 = __call81_75(__call81_74((p1)[1]));
    life8_237 = __integerCategory81_78(__call81_77(__cast81_76((p1)[2])));
    spill81_20 = __fieldRead81_81(__fieldRead81_80(__fieldRead81_79()));
    moom.y9 __stackOp81_83_0 = __sourceUninitializedNEW81_82();
    spill81_21 = __stackOp81_83_0;
    __explicitNewInit81_84(__stackOp81_83_0, life6_225, life7_231, __integerCategory81_85(life8_237));
    __call81_86(spill81_20, spill81_21);
    if (!((life5_5 == 0))) {
        break forest_join_694;
    }
    }
    __call81_87(receiver, (p1).length, 3);
    if (!((life5_5 == 0))) {
        break forest_join_694;
    }
    }
    spill81_22 = p1;
    if (!((life5_5 != 0))) {
        forestValue81_248_0 = spill81_22;
        break forest_join_248;
    }
    if (!(((spill81_22).length == __invokedynamic81_88(27811, (9053700249654909734L ^ life3_3))))) {
        break forest_join_296;
    }
    forestValue81_248_0 = (p1)[0];
    }
    life6_276 = __call81_90(__call81_89(forestValue81_248_0));
    life8_282 = __call81_92(__call81_91((p1)[1]));
    life10_288 = __call81_94(__call81_93((p1)[2]));
    life12_294 = __call81_96(__call81_95((p1)[3]));
    life13_300 = __call81_98(__call81_97((p1)[4]));
    life14_306 = __integerCategory81_101(__call81_100(__cast81_99((p1)[5])));
    spill81_23 = __fieldRead81_104(__fieldRead81_103(__fieldRead81_102()));
    moom.y_ __stackOp81_106_0 = __sourceUninitializedNEW81_105();
    spill81_24 = __stackOp81_106_0;
    __explicitNewInit81_107(__stackOp81_106_0, life6_276, life8_282, life10_288, life12_294, life13_300, __integerCategory81_108(life14_306));
    __call81_109(spill81_23, spill81_24);
    if (!((life5_5 == 0))) {
        break forest_join_694;
    }
    }
    __call81_111(receiver, (p1).length, __invokedynamic81_110(12771, (567891535627978343L ^ life3_3)));
    if (!((life5_5 == 0))) {
        break forest_join_694;
    }
    }
    spill81_25 = p1;
    if (!((life5_5 != 0))) {
        forestValue81_316_0 = spill81_25;
        break forest_join_316;
    }
    if (!(((spill81_25).length == 3))) {
        break forest_join_354;
    }
    forestValue81_316_0 = (p1)[0];
    }
    life6_347 = __cast81_112(forestValue81_316_0);
    life7_352 = __cast81_113((p1)[1]);
    life8_357 = __cast81_114((p1)[2]);
    spill81_26 = __fieldRead81_117(__fieldRead81_116(__fieldRead81_115()));
    moom.za __stackOp81_119_0 = __sourceUninitializedNEW81_118();
    spill81_27 = __stackOp81_119_0;
    spill81_28 = __stackOp81_119_0;
    spill81_29 = (__call81_120())[__call81_121(life6_347)];
    moom.DT __stackOp81_123_0 = __sourceUninitializedNEW81_122();
    spill81_30 = __stackOp81_123_0;
    __explicitNewInit81_127(__stackOp81_123_0, __fieldRead81_124(life7_352), __fieldRead81_125(life7_352), __fieldRead81_126(life7_352));
    __explicitNewInit81_130(spill81_28, spill81_29, spill81_30, (__call81_128())[__call81_129(life8_357)]);
    __call81_131(spill81_26, spill81_27);
    if (!((life5_5 == 0))) {
        break forest_join_694;
    }
    }
    __call81_132(receiver, (p1).length, 3);
    if (!((life5_5 == 0))) {
        break forest_join_694;
    }
    }
    spill81_31 = p1;
    if (!((life5_5 != 0))) {
        forestValue81_374_0 = spill81_31;
        break forest_join_374;
    }
    if (!(((spill81_31).length == __invokedynamic81_133(12771, (567891535627978343L ^ life3_3))))) {
        break forest_join_438;
    }
    forestValue81_374_0 = (p1)[0];
    }
    life6_409 = __cast81_134(forestValue81_374_0);
    life7_415 = __call81_136(__call81_135((p1)[1]));
    life8_421 = __call81_138(__call81_137((p1)[2]));
    life9_427 = __call81_140(__call81_139((p1)[3]));
    life10_433 = __call81_142(__call81_141((p1)[4]));
    life11_439 = __call81_144(__call81_143((p1)[5]));
    spill81_32 = __fieldRead81_147(__fieldRead81_146(__fieldRead81_145()));
    moom.zb __stackOp81_149_0 = __sourceUninitializedNEW81_148();
    spill81_33 = __stackOp81_149_0;
    spill81_34 = __stackOp81_149_0;
    moom.DT __stackOp81_151_0 = __sourceUninitializedNEW81_150();
    spill81_35 = __stackOp81_151_0;
    __explicitNewInit81_155(__stackOp81_151_0, __fieldRead81_152(life6_409), __fieldRead81_153(life6_409), __fieldRead81_154(life6_409));
    spill81_36 = life7_415;
    if (!((life8_421 == -1))) {
        forestValue81_426_0 = spill81_32;
        forestValue81_426_1 = spill81_33;
        forestValue81_426_2 = spill81_34;
        forestValue81_426_3 = spill81_35;
        forestValue81_426_4 = spill81_36;
        break forest_join_426;
    }
    forestValue81_431_0 = spill81_32;
    forestValue81_431_1 = spill81_33;
    forestValue81_431_2 = spill81_34;
    forestValue81_431_3 = spill81_35;
    forestValue81_431_4 = spill81_36;
    forestValue81_431_5 = null;
    break forest_join_431;
    }
    forestValue81_431_0 = forestValue81_426_0;
    forestValue81_431_1 = forestValue81_426_1;
    forestValue81_431_2 = forestValue81_426_2;
    forestValue81_431_3 = forestValue81_426_3;
    forestValue81_431_4 = forestValue81_426_4;
    forestValue81_431_5 = __call81_159(__fieldRead81_158(__fieldRead81_157(__fieldRead81_156())), life8_421);
    }
    __explicitNewInit81_160(forestValue81_431_2, forestValue81_431_3, forestValue81_431_4, forestValue81_431_5, life9_427, life10_433, life11_439);
    __call81_161(forestValue81_431_0, forestValue81_431_1);
    if (!((life5_5 == 0))) {
        break forest_join_694;
    }
    }
    __call81_163(receiver, (p1).length, __invokedynamic81_162(12771, (567891535627978343L ^ life3_3)));
    if (!((life5_5 == 0))) {
        break forest_join_694;
    }
    }
    spill81_37 = (p1).length;
    if (!((life5_5 != 0))) {
        forestValue81_465_0 = spill81_37;
        break forest_join_465;
    }
    if (!((spill81_37 == 0))) {
        break forest_join_463;
    }
    spill81_38 = __fieldRead81_166(__fieldRead81_165(__fieldRead81_164()));
    moom.zc __stackOp81_168_0 = __sourceUninitializedNEW81_167();
    spill81_39 = __stackOp81_168_0;
    __explicitNewInit81_169(__stackOp81_168_0);
    __call81_170(spill81_38, spill81_39);
    if (!((life5_5 == 0))) {
        break forest_join_694;
    }
    }
    forestValue81_465_0 = (p1).length;
    }
    if (!((life5_5 != 0))) {
        forestValue81_474_0 = forestValue81_465_0;
        break forest_join_474;
    }
    if (!((forestValue81_465_0 == 1))) {
        break forest_join_485;
    }
    forestValue81_474_0 = __call81_172(__call81_171((p1)[0]));
    }
    life6_514 = forestValue81_474_0;
    spill81_40 = __fieldRead81_175(__fieldRead81_174(__fieldRead81_173()));
    moom.zc __stackOp81_177_0 = __sourceUninitializedNEW81_176();
    spill81_41 = __stackOp81_177_0;
    __explicitNewInit81_178(__stackOp81_177_0, life6_514);
    __call81_179(spill81_40, spill81_41);
    if (!((life5_5 == 0))) {
        break forest_join_694;
    }
    }
    __call81_180(receiver, (p1).length, 1);
    if (!((life5_5 == 0))) {
        break forest_join_694;
    }
    }
    if (!(((p1).length == 0))) {
        break forest_join_504;
    }
    spill81_42 = __fieldRead81_183(__fieldRead81_182(__fieldRead81_181()));
    moom.zd __stackOp81_185_0 = __sourceUninitializedNEW81_184();
    spill81_43 = __stackOp81_185_0;
    __explicitNewInit81_186(__stackOp81_185_0);
    __call81_187(spill81_42, spill81_43);
    if (!((life5_5 == 0))) {
        break forest_join_694;
    }
    }
    __call81_188(receiver, (p1).length, 0);
    if (!((life5_5 == 0))) {
        break forest_join_694;
    }
    }
    spill81_44 = (p1).length;
    spill81_45 = 2;
    if (!((life5_5 != 0))) {
        forestValue81_550_0 = spill81_44;
        forestValue81_550_1 = spill81_45;
        break forest_join_550;
    }
    if (!((spill81_44 == spill81_45))) {
        break forest_join_545;
    }
    life6_568 = __call81_190(__call81_189((p1)[0]));
    life7_573 = __cast81_191((p1)[1]);
    spill81_46 = __fieldRead81_194(__fieldRead81_193(__fieldRead81_192()));
    moom.ze __stackOp81_196_0 = __sourceUninitializedNEW81_195();
    spill81_47 = __stackOp81_196_0;
    __explicitNewInit81_202(__stackOp81_196_0, __call81_199(__fieldRead81_198(__fieldRead81_197()), life6_568), (__call81_200())[__call81_201(life7_573)]);
    __call81_203(spill81_46, spill81_47);
    if (!((life5_5 == 0))) {
        break forest_join_694;
    }
    }
    spill81_48 = (p1).length;
    if (!((life5_5 != 0))) {
        forestValue81_556_0 = spill81_48;
        break forest_join_556;
    }
    forestValue81_550_0 = spill81_48;
    forestValue81_550_1 = 3;
    }
    if (!((forestValue81_550_0 == forestValue81_550_1))) {
        break forest_join_586;
    }
    forestValue81_556_0 = __call81_205(__call81_204((p1)[0]));
    }
    life6_605 = forestValue81_556_0;
    life7_610 = __cast81_206((p1)[1]);
    life8_616 = __call81_208(__call81_207((p1)[2]));
    spill81_49 = __fieldRead81_211(__fieldRead81_210(__fieldRead81_209()));
    moom.ze __stackOp81_213_0 = __sourceUninitializedNEW81_212();
    spill81_50 = __stackOp81_213_0;
    __explicitNewInit81_219(__stackOp81_213_0, __call81_216(__fieldRead81_215(__fieldRead81_214()), life6_605), (__call81_217())[__call81_218(life7_610)], life8_616);
    __call81_220(spill81_49, spill81_50);
    if (!((life5_5 == 0))) {
        break forest_join_694;
    }
    }
    __call81_221(receiver, (p1).length, 2);
    if (!((life5_5 == 0))) {
        break forest_join_694;
    }
    }
    spill81_51 = (p1).length;
    if (!((life5_5 != 0))) {
        forestValue81_604_0 = spill81_51;
        break forest_join_604;
    }
    if (!((spill81_51 == 1))) {
        break forest_join_615;
    }
    forestValue81_604_0 = __call81_223(__call81_222((p1)[0]));
    }
    life6_657 = forestValue81_604_0;
    spill81_52 = __fieldRead81_226(__fieldRead81_225(__fieldRead81_224()));
    moom.zg __stackOp81_228_0 = __sourceUninitializedNEW81_227();
    spill81_53 = __stackOp81_228_0;
    __explicitNewInit81_229(__stackOp81_228_0, life6_657);
    __call81_230(spill81_52, spill81_53);
    if (!((life5_5 == 0))) {
        break forest_join_694;
    }
    }
    __call81_231(receiver, (p1).length, 1);
    if (!((life5_5 == 0))) {
        break forest_join_694;
    }
    }
    spill81_54 = (p1).length;
    if (!((life5_5 != 0))) {
        forestValue81_633_0 = spill81_54;
        break forest_join_633;
    }
    if (!((spill81_54 == 3))) {
        break forest_join_658;
    }
    forestValue81_633_0 = __call81_233(__call81_232((p1)[0]));
    }
    life6_690 = forestValue81_633_0;
    life7_696 = __call81_235(__call81_234((p1)[1]));
    life8_702 = __integerCategory81_238(__call81_237(__cast81_236((p1)[2])));
    spill81_55 = __fieldRead81_241(__fieldRead81_240(__fieldRead81_239()));
    moom.zi __stackOp81_243_0 = __sourceUninitializedNEW81_242();
    spill81_56 = __stackOp81_243_0;
    __explicitNewInit81_244(__stackOp81_243_0, life6_690, __integerCategory81_245(life7_696), __integerCategory81_246(life8_702));
    __call81_247(spill81_55, spill81_56);
    if (!((life5_5 == 0))) {
        break forest_join_694;
    }
    }
    __call81_248(receiver, (p1).length, 3);
    if (!((life5_5 == 0))) {
        break forest_join_694;
    }
    }
    spill81_57 = p1;
    if (!((life5_5 != 0))) {
        forestValue81_674_0 = spill81_57;
        break forest_join_674;
    }
    if (!(((spill81_57).length == 1))) {
        break forest_join_689;
    }
    forestValue81_674_0 = (p1)[0];
    }
    life6_736 = __cast81_249(forestValue81_674_0);
    spill81_58 = __fieldRead81_252(__fieldRead81_251(__fieldRead81_250()));
    moom.zp __stackOp81_254_0 = __sourceUninitializedNEW81_253();
    spill81_59 = __stackOp81_254_0;
    __explicitNewInit81_257(__stackOp81_254_0, (__call81_255())[__call81_256(life6_736)]);
    __call81_258(spill81_58, spill81_59);
    if (!((life5_5 == 0))) {
        break forest_join_694;
    }
    }
    __call81_259(receiver, (p1).length, 1);
    }
    return;
}
private static native long __fieldRead81_0() throws Throwable;
private static native boolean __call81_1() throws Throwable;
private static native int __integerCategory81_2(boolean value) throws Throwable;
private static native java.lang.Integer __call81_3(java.lang.Object a0) throws Throwable;
private static native int __call81_4(java.lang.Integer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead81_5() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead81_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead81_7(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.y4 __sourceUninitializedNEW81_8() throws Throwable;
private static native void __explicitNewInit81_10(moom.y4 a0, int a1) throws Throwable;
private static native void __call81_11(net.minecraft.client.network.NetHandlerPlayClient a0, moom.y4 a1) throws Throwable;
private static native void __call81_12(com.moon.j3 a0, int a1, int a2) throws Throwable;
private static native java.lang.Integer __call81_13(java.lang.Object a0) throws Throwable;
private static native int __call81_14(java.lang.Integer a0) throws Throwable;
private static native int __instanceOf81_15(java.lang.Object a0) throws Throwable;
private static native com.moon.scripting.api.enums.InteractActions __cast81_16(java.lang.Object a0) throws Throwable;
private static native net.minecraft.network.play.client.C02PacketUseEntity$Action[] __call81_17() throws Throwable;
private static native int __call81_18(com.moon.scripting.api.enums.InteractActions a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead81_19() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead81_20(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead81_21(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.y6 __sourceUninitializedNEW81_22() throws Throwable;
private static native void __explicitNewInit81_24(moom.y6 a0, int a1, net.minecraft.network.play.client.C02PacketUseEntity$Action a2) throws Throwable;
private static native void __call81_25(net.minecraft.client.network.NetHandlerPlayClient a0, moom.y6 a1) throws Throwable;
private static native int __instanceOf81_26(java.lang.Object a0) throws Throwable;
private static native com.moon.scripting.api.types.Vec3d __cast81_27(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead81_28() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead81_29(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead81_30(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.y6 __sourceUninitializedNEW81_31() throws Throwable;
private static native moom.DR __sourceUninitializedNEW81_33() throws Throwable;
private static native double __fieldRead81_35(com.moon.scripting.api.types.Vec3d a0) throws Throwable;
private static native double __fieldRead81_36(com.moon.scripting.api.types.Vec3d a0) throws Throwable;
private static native double __fieldRead81_37(com.moon.scripting.api.types.Vec3d a0) throws Throwable;
private static native void __explicitNewInit81_38(moom.DR a0, double a1, double a2, double a3) throws Throwable;
private static native void __explicitNewInit81_39(moom.y6 a0, int a1, moom.DR a2) throws Throwable;
private static native void __call81_40(net.minecraft.client.network.NetHandlerPlayClient a0, moom.y6 a1) throws Throwable;
private static native void __call81_41(com.moon.j3 a0, int a1, int a2) throws Throwable;
private static native java.lang.Boolean __cast81_42(java.lang.Object a0) throws Throwable;
private static native boolean __call81_43(java.lang.Boolean a0) throws Throwable;
private static native int __integerCategory81_44(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead81_45() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead81_46(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead81_47(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.y7 __sourceUninitializedNEW81_48() throws Throwable;
private static native boolean __integerCategory81_51(int value) throws Throwable;
private static native void __explicitNewInit81_50(moom.y7 a0, boolean a1) throws Throwable;
private static native void __call81_52(net.minecraft.client.network.NetHandlerPlayClient a0, moom.y7 a1) throws Throwable;
private static native void __call81_53(com.moon.j3 a0, int a1, int a2) throws Throwable;
private static native java.lang.Double __call81_54(java.lang.Object a0) throws Throwable;
private static native double __call81_55(java.lang.Double a0) throws Throwable;
private static native java.lang.Double __call81_56(java.lang.Object a0) throws Throwable;
private static native double __call81_57(java.lang.Double a0) throws Throwable;
private static native java.lang.Double __call81_58(java.lang.Object a0) throws Throwable;
private static native double __call81_59(java.lang.Double a0) throws Throwable;
private static native java.lang.Boolean __cast81_60(java.lang.Object a0) throws Throwable;
private static native boolean __call81_61(java.lang.Boolean a0) throws Throwable;
private static native int __integerCategory81_62(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead81_63() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead81_64(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead81_65(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.y8 __sourceUninitializedNEW81_66() throws Throwable;
private static native boolean __integerCategory81_69(int value) throws Throwable;
private static native void __explicitNewInit81_68(moom.y8 a0, double a1, double a2, double a3, boolean a4) throws Throwable;
private static native void __call81_70(net.minecraft.client.network.NetHandlerPlayClient a0, moom.y8 a1) throws Throwable;
private static native void __call81_71(com.moon.j3 a0, int a1, int a2) throws Throwable;
private static native java.lang.Float __call81_72(java.lang.Object a0) throws Throwable;
private static native float __call81_73(java.lang.Float a0) throws Throwable;
private static native java.lang.Float __call81_74(java.lang.Object a0) throws Throwable;
private static native float __call81_75(java.lang.Float a0) throws Throwable;
private static native java.lang.Boolean __cast81_76(java.lang.Object a0) throws Throwable;
private static native boolean __call81_77(java.lang.Boolean a0) throws Throwable;
private static native int __integerCategory81_78(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead81_79() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead81_80(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead81_81(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.y9 __sourceUninitializedNEW81_82() throws Throwable;
private static native boolean __integerCategory81_85(int value) throws Throwable;
private static native void __explicitNewInit81_84(moom.y9 a0, float a1, float a2, boolean a3) throws Throwable;
private static native void __call81_86(net.minecraft.client.network.NetHandlerPlayClient a0, moom.y9 a1) throws Throwable;
private static native void __call81_87(com.moon.j3 a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic81_88(int a0, long a1) throws Throwable;
private static native java.lang.Double __call81_89(java.lang.Object a0) throws Throwable;
private static native double __call81_90(java.lang.Double a0) throws Throwable;
private static native java.lang.Double __call81_91(java.lang.Object a0) throws Throwable;
private static native double __call81_92(java.lang.Double a0) throws Throwable;
private static native java.lang.Double __call81_93(java.lang.Object a0) throws Throwable;
private static native double __call81_94(java.lang.Double a0) throws Throwable;
private static native java.lang.Float __call81_95(java.lang.Object a0) throws Throwable;
private static native float __call81_96(java.lang.Float a0) throws Throwable;
private static native java.lang.Float __call81_97(java.lang.Object a0) throws Throwable;
private static native float __call81_98(java.lang.Float a0) throws Throwable;
private static native java.lang.Boolean __cast81_99(java.lang.Object a0) throws Throwable;
private static native boolean __call81_100(java.lang.Boolean a0) throws Throwable;
private static native int __integerCategory81_101(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead81_102() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead81_103(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead81_104(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.y_ __sourceUninitializedNEW81_105() throws Throwable;
private static native boolean __integerCategory81_108(int value) throws Throwable;
private static native void __explicitNewInit81_107(moom.y_ a0, double a1, double a2, double a3, float a4, float a5, boolean a6) throws Throwable;
private static native void __call81_109(net.minecraft.client.network.NetHandlerPlayClient a0, moom.y_ a1) throws Throwable;
private static native int __invokedynamic81_110(int a0, long a1) throws Throwable;
private static native void __call81_111(com.moon.j3 a0, int a1, int a2) throws Throwable;
private static native com.moon.scripting.api.enums.DiggingActions __cast81_112(java.lang.Object a0) throws Throwable;
private static native com.moon.scripting.api.types.Vec3i __cast81_113(java.lang.Object a0) throws Throwable;
private static native com.moon.scripting.api.enums.Facing __cast81_114(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead81_115() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead81_116(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead81_117(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.za __sourceUninitializedNEW81_118() throws Throwable;
private static native net.minecraft.network.play.client.C07PacketPlayerDigging$Action[] __call81_120() throws Throwable;
private static native int __call81_121(com.moon.scripting.api.enums.DiggingActions a0) throws Throwable;
private static native moom.DT __sourceUninitializedNEW81_122() throws Throwable;
private static native int __fieldRead81_124(com.moon.scripting.api.types.Vec3i a0) throws Throwable;
private static native int __fieldRead81_125(com.moon.scripting.api.types.Vec3i a0) throws Throwable;
private static native int __fieldRead81_126(com.moon.scripting.api.types.Vec3i a0) throws Throwable;
private static native void __explicitNewInit81_127(moom.DT a0, int a1, int a2, int a3) throws Throwable;
private static native moom.bs[] __call81_128() throws Throwable;
private static native int __call81_129(com.moon.scripting.api.enums.Facing a0) throws Throwable;
private static native void __explicitNewInit81_130(moom.za a0, net.minecraft.network.play.client.C07PacketPlayerDigging$Action a1, moom.DT a2, moom.bs a3) throws Throwable;
private static native void __call81_131(net.minecraft.client.network.NetHandlerPlayClient a0, moom.za a1) throws Throwable;
private static native void __call81_132(com.moon.j3 a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic81_133(int a0, long a1) throws Throwable;
private static native com.moon.scripting.api.types.Vec3i __cast81_134(java.lang.Object a0) throws Throwable;
private static native java.lang.Integer __call81_135(java.lang.Object a0) throws Throwable;
private static native int __call81_136(java.lang.Integer a0) throws Throwable;
private static native java.lang.Integer __call81_137(java.lang.Object a0) throws Throwable;
private static native int __call81_138(java.lang.Integer a0) throws Throwable;
private static native java.lang.Float __call81_139(java.lang.Object a0) throws Throwable;
private static native float __call81_140(java.lang.Float a0) throws Throwable;
private static native java.lang.Float __call81_141(java.lang.Object a0) throws Throwable;
private static native float __call81_142(java.lang.Float a0) throws Throwable;
private static native java.lang.Float __call81_143(java.lang.Object a0) throws Throwable;
private static native float __call81_144(java.lang.Float a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead81_145() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead81_146(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead81_147(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.zb __sourceUninitializedNEW81_148() throws Throwable;
private static native moom.DT __sourceUninitializedNEW81_150() throws Throwable;
private static native int __fieldRead81_152(com.moon.scripting.api.types.Vec3i a0) throws Throwable;
private static native int __fieldRead81_153(com.moon.scripting.api.types.Vec3i a0) throws Throwable;
private static native int __fieldRead81_154(com.moon.scripting.api.types.Vec3i a0) throws Throwable;
private static native void __explicitNewInit81_155(moom.DT a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead81_156() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead81_157(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead81_158(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call81_159(net.minecraft.entity.player.InventoryPlayer a0, int a1) throws Throwable;
private static native void __explicitNewInit81_160(moom.zb a0, moom.DT a1, int a2, net.minecraft.item.ItemStack a3, float a4, float a5, float a6) throws Throwable;
private static native void __call81_161(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zb a1) throws Throwable;
private static native int __invokedynamic81_162(int a0, long a1) throws Throwable;
private static native void __call81_163(com.moon.j3 a0, int a1, int a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead81_164() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead81_165(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead81_166(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.zc __sourceUninitializedNEW81_167() throws Throwable;
private static native void __explicitNewInit81_169(moom.zc a0) throws Throwable;
private static native void __call81_170(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zc a1) throws Throwable;
private static native java.lang.Integer __call81_171(java.lang.Object a0) throws Throwable;
private static native int __call81_172(java.lang.Integer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead81_173() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead81_174(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead81_175(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.zc __sourceUninitializedNEW81_176() throws Throwable;
private static native void __explicitNewInit81_178(moom.zc a0, int a1) throws Throwable;
private static native void __call81_179(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zc a1) throws Throwable;
private static native void __call81_180(com.moon.j3 a0, int a1, int a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead81_181() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead81_182(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead81_183(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.zd __sourceUninitializedNEW81_184() throws Throwable;
private static native void __explicitNewInit81_186(moom.zd a0) throws Throwable;
private static native void __call81_187(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zd a1) throws Throwable;
private static native void __call81_188(com.moon.j3 a0, int a1, int a2) throws Throwable;
private static native java.lang.Integer __call81_189(java.lang.Object a0) throws Throwable;
private static native int __call81_190(java.lang.Integer a0) throws Throwable;
private static native com.moon.scripting.api.enums.EntityAction __cast81_191(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead81_192() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead81_193(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead81_194(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.ze __sourceUninitializedNEW81_195() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead81_197() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead81_198(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.Entity __call81_199(net.minecraft.client.multiplayer.WorldClient a0, int a1) throws Throwable;
private static native net.minecraft.network.play.client.C0BPacketEntityAction$Action[] __call81_200() throws Throwable;
private static native int __call81_201(com.moon.scripting.api.enums.EntityAction a0) throws Throwable;
private static native void __explicitNewInit81_202(moom.ze a0, net.minecraft.entity.Entity a1, net.minecraft.network.play.client.C0BPacketEntityAction$Action a2) throws Throwable;
private static native void __call81_203(net.minecraft.client.network.NetHandlerPlayClient a0, moom.ze a1) throws Throwable;
private static native java.lang.Integer __call81_204(java.lang.Object a0) throws Throwable;
private static native int __call81_205(java.lang.Integer a0) throws Throwable;
private static native com.moon.scripting.api.enums.EntityAction __cast81_206(java.lang.Object a0) throws Throwable;
private static native java.lang.Integer __call81_207(java.lang.Object a0) throws Throwable;
private static native int __call81_208(java.lang.Integer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead81_209() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead81_210(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead81_211(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.ze __sourceUninitializedNEW81_212() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead81_214() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead81_215(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.Entity __call81_216(net.minecraft.client.multiplayer.WorldClient a0, int a1) throws Throwable;
private static native net.minecraft.network.play.client.C0BPacketEntityAction$Action[] __call81_217() throws Throwable;
private static native int __call81_218(com.moon.scripting.api.enums.EntityAction a0) throws Throwable;
private static native void __explicitNewInit81_219(moom.ze a0, net.minecraft.entity.Entity a1, net.minecraft.network.play.client.C0BPacketEntityAction$Action a2, int a3) throws Throwable;
private static native void __call81_220(net.minecraft.client.network.NetHandlerPlayClient a0, moom.ze a1) throws Throwable;
private static native void __call81_221(com.moon.j3 a0, int a1, int a2) throws Throwable;
private static native java.lang.Integer __call81_222(java.lang.Object a0) throws Throwable;
private static native int __call81_223(java.lang.Integer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead81_224() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead81_225(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead81_226(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.zg __sourceUninitializedNEW81_227() throws Throwable;
private static native void __explicitNewInit81_229(moom.zg a0, int a1) throws Throwable;
private static native void __call81_230(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zg a1) throws Throwable;
private static native void __call81_231(com.moon.j3 a0, int a1, int a2) throws Throwable;
private static native java.lang.Integer __call81_232(java.lang.Object a0) throws Throwable;
private static native int __call81_233(java.lang.Integer a0) throws Throwable;
private static native java.lang.Short __call81_234(java.lang.Object a0) throws Throwable;
private static native short __call81_235(java.lang.Short a0) throws Throwable;
private static native java.lang.Boolean __cast81_236(java.lang.Object a0) throws Throwable;
private static native boolean __call81_237(java.lang.Boolean a0) throws Throwable;
private static native int __integerCategory81_238(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead81_239() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead81_240(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead81_241(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.zi __sourceUninitializedNEW81_242() throws Throwable;
private static native short __integerCategory81_245(int value) throws Throwable;
private static native boolean __integerCategory81_246(int value) throws Throwable;
private static native void __explicitNewInit81_244(moom.zi a0, int a1, short a2, boolean a3) throws Throwable;
private static native void __call81_247(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zi a1) throws Throwable;
private static native void __call81_248(com.moon.j3 a0, int a1, int a2) throws Throwable;
private static native com.moon.scripting.api.enums.ClientStatusActions __cast81_249(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead81_250() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead81_251(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead81_252(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.zp __sourceUninitializedNEW81_253() throws Throwable;
private static native net.minecraft.network.play.client.C16PacketClientStatus$EnumState[] __call81_255() throws Throwable;
private static native int __call81_256(com.moon.scripting.api.enums.ClientStatusActions a0) throws Throwable;
private static native void __explicitNewInit81_257(moom.zp a0, net.minecraft.network.play.client.C16PacketClientStatus$EnumState a1) throws Throwable;
private static native void __call81_258(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zp a1) throws Throwable;
private static native void __call81_259(com.moon.j3 a0, int a1, int a2) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_83af98f333a330c43c1f(com.moon.j3 a0, int a1, java.lang.Object[] a2) throws E;
private static final class __SourceHandler_83af98f333a330c43c1f {

public static void f82(com.moon.j3 receiver, int p0, java.lang.Object[] p1) throws Throwable {
    int forestValue82_12_0;
    int forestValue82_21_0;
    int forestValue82_50_0;
    int forestValue82_83_0;
    java.lang.Object forestValue82_85_0;
    int forestValue82_124_0;
    java.lang.Object forestValue82_151_0;
    java.lang.Object forestValue82_201_0;
    java.lang.Object forestValue82_248_0;
    java.lang.Object forestValue82_316_0;
    java.lang.Object forestValue82_374_0;
    net.minecraft.client.network.NetHandlerPlayClient forestValue82_426_0;
    moom.zb forestValue82_426_1;
    moom.zb forestValue82_426_2;
    moom.DT forestValue82_426_3;
    int forestValue82_426_4;
    net.minecraft.client.network.NetHandlerPlayClient forestValue82_431_0;
    moom.zb forestValue82_431_1;
    moom.zb forestValue82_431_2;
    moom.DT forestValue82_431_3;
    int forestValue82_431_4;
    net.minecraft.item.ItemStack forestValue82_431_5;
    int forestValue82_465_0;
    int forestValue82_474_0;
    int forestValue82_550_0;
    int forestValue82_550_1;
    int forestValue82_556_0;
    int forestValue82_604_0;
    int forestValue82_633_0;
    java.lang.Object forestValue82_674_0;
    int spill82_0;
    net.minecraft.client.network.NetHandlerPlayClient spill82_1;
    moom.y4 spill82_2;
    int spill82_3;
    int spill82_4;
    net.minecraft.client.network.NetHandlerPlayClient spill82_5;
    moom.y6 spill82_6;
    java.lang.Object spill82_7;
    net.minecraft.client.network.NetHandlerPlayClient spill82_8;
    moom.y6 spill82_9;
    moom.y6 spill82_10;
    int spill82_11;
    moom.DR spill82_12;
    int spill82_13;
    net.minecraft.client.network.NetHandlerPlayClient spill82_14;
    moom.y7 spill82_15;
    java.lang.Object[] spill82_16;
    net.minecraft.client.network.NetHandlerPlayClient spill82_17;
    moom.y8 spill82_18;
    java.lang.Object[] spill82_19;
    net.minecraft.client.network.NetHandlerPlayClient spill82_20;
    moom.y9 spill82_21;
    java.lang.Object[] spill82_22;
    net.minecraft.client.network.NetHandlerPlayClient spill82_23;
    moom.y_ spill82_24;
    java.lang.Object[] spill82_25;
    net.minecraft.client.network.NetHandlerPlayClient spill82_26;
    moom.za spill82_27;
    moom.za spill82_28;
    net.minecraft.network.play.client.C07PacketPlayerDigging$Action spill82_29;
    moom.DT spill82_30;
    java.lang.Object[] spill82_31;
    net.minecraft.client.network.NetHandlerPlayClient spill82_32;
    moom.zb spill82_33;
    moom.zb spill82_34;
    moom.DT spill82_35;
    int spill82_36;
    int spill82_37;
    net.minecraft.client.network.NetHandlerPlayClient spill82_38;
    moom.zc spill82_39;
    net.minecraft.client.network.NetHandlerPlayClient spill82_40;
    moom.zc spill82_41;
    net.minecraft.client.network.NetHandlerPlayClient spill82_42;
    moom.zd spill82_43;
    int spill82_44;
    int spill82_45;
    net.minecraft.client.network.NetHandlerPlayClient spill82_46;
    moom.ze spill82_47;
    int spill82_48;
    net.minecraft.client.network.NetHandlerPlayClient spill82_49;
    moom.ze spill82_50;
    int spill82_51;
    net.minecraft.client.network.NetHandlerPlayClient spill82_52;
    moom.zg spill82_53;
    int spill82_54;
    net.minecraft.client.network.NetHandlerPlayClient spill82_55;
    moom.zi spill82_56;
    java.lang.Object[] spill82_57;
    net.minecraft.client.network.NetHandlerPlayClient spill82_58;
    moom.zp spill82_59;
    long life3_3;
    int life5_5;
    int life6_24;
    int life6_57;
    java.lang.Object life7_61;
    com.moon.scripting.api.enums.InteractActions life8_70;
    net.minecraft.network.play.client.C02PacketUseEntity$Action life10_75;
    com.moon.scripting.api.types.Vec3d life9_96;
    int life6_138;
    double life6_171;
    double life8_177;
    double life10_183;
    int life12_189;
    float life6_225;
    float life7_231;
    int life8_237;
    double life6_276;
    double life8_282;
    double life10_288;
    float life12_294;
    float life13_300;
    int life14_306;
    com.moon.scripting.api.enums.DiggingActions life6_347;
    com.moon.scripting.api.types.Vec3i life7_352;
    com.moon.scripting.api.enums.Facing life8_357;
    com.moon.scripting.api.types.Vec3i life6_409;
    int life7_415;
    int life8_421;
    float life9_427;
    float life10_433;
    float life11_439;
    int life6_514;
    int life6_568;
    com.moon.scripting.api.enums.EntityAction life7_573;
    int life6_605;
    com.moon.scripting.api.enums.EntityAction life7_610;
    int life8_616;
    int life6_657;
    int life6_690;
    int life7_696;
    int life8_702;
    com.moon.scripting.api.enums.ClientStatusActions life6_736;
    forest_join_694: {
    forest_join_689: {
    forest_join_674: {
    forest_join_665: {
    forest_join_658: {
    forest_join_633: {
    forest_join_622: {
    forest_join_615: {
    forest_join_604: {
    forest_join_593: {
    forest_join_586: {
    forest_join_556: {
    forest_join_550: {
    forest_join_545: {
    forest_join_511: {
    forest_join_504: {
    forest_join_492: {
    forest_join_485: {
    forest_join_474: {
    forest_join_465: {
    forest_join_463: {
    forest_join_449: {
    forest_join_438: {
    forest_join_431: {
    forest_join_426: {
    forest_join_374: {
    forest_join_361: {
    forest_join_354: {
    forest_join_316: {
    forest_join_307: {
    forest_join_296: {
    forest_join_248: {
    forest_join_235: {
    forest_join_228: {
    forest_join_201: {
    forest_join_192: {
    forest_join_185: {
    forest_join_151: {
    forest_join_142: {
    forest_join_135: {
    forest_join_124: {
    forest_join_113: {
    forest_join_106: {
    forest_join_104: {
    forest_join_85: {
    forest_join_83: {
    forest_join_79: {
    forest_join_50: {
    forest_join_39: {
    forest_join_32: {
    forest_join_21: {
    forest_join_12: {
    forest_join_10: {
    life3_3 = (__fieldRead82_0() ^ 71524212875376L);
    life5_5 = __integerCategory82_2(__call82_1());
    spill82_0 = p0;
    if (!((life5_5 == 0))) {
        forestValue82_12_0 = spill82_0;
        break forest_join_12;
    }
    switch (spill82_0) {
case 0:
{
        break forest_join_10;
    }
case 2:
{
        break forest_join_39;
    }
case 3:
{
        break forest_join_113;
    }
case 4:
{
        break forest_join_142;
    }
case 5:
{
        break forest_join_192;
    }
case 6:
{
        break forest_join_235;
    }
case 7:
{
        break forest_join_307;
    }
case 8:
{
        break forest_join_361;
    }
case 9:
{
        break forest_join_449;
    }
case 10:
{
        break forest_join_492;
    }
case 11:
{
        break forest_join_511;
    }
case 13:
{
        break forest_join_593;
    }
case 15:
{
        break forest_join_622;
    }
case 22:
{
        break forest_join_665;
    }
case 1:
case 12:
case 14:
case 16:
case 17:
case 18:
case 19:
case 20:
case 21:
default:
{
        break forest_join_694;
    }
}
    }
    forestValue82_12_0 = (p1).length;
    }
    if (!((life5_5 == 0))) {
        forestValue82_21_0 = forestValue82_12_0;
        break forest_join_21;
    }
    if (!((forestValue82_12_0 == 1))) {
        break forest_join_32;
    }
    forestValue82_21_0 = __call82_4(__call82_3((p1)[0]));
    }
    life6_24 = forestValue82_21_0;
    spill82_1 = __fieldRead82_7(__fieldRead82_6(__fieldRead82_5()));
    moom.y4 __stackOp82_9_0 = __sourceUninitializedNEW82_8();
    spill82_2 = __stackOp82_9_0;
    __explicitNewInit82_10(__stackOp82_9_0, life6_24);
    __call82_11(spill82_1, spill82_2);
    if (!((life5_5 != 0))) {
        break forest_join_694;
    }
    }
    __call82_12(receiver, (p1).length, 1);
    if (!((life5_5 != 0))) {
        break forest_join_694;
    }
    }
    spill82_3 = (p1).length;
    if (!((life5_5 == 0))) {
        forestValue82_50_0 = spill82_3;
        break forest_join_50;
    }
    if (!((spill82_3 == 2))) {
        break forest_join_106;
    }
    forestValue82_50_0 = __call82_14(__call82_13((p1)[0]));
    }
    life6_57 = forestValue82_50_0;
    life7_61 = (p1)[1];
    spill82_4 = __instanceOf82_15(life7_61);
    if (!((life5_5 == 0))) {
        forestValue82_83_0 = spill82_4;
        break forest_join_83;
    }
    if (!((spill82_4 != 0))) {
        break forest_join_79;
    }
    life8_70 = __cast82_16(life7_61);
    life10_75 = (__call82_17())[__call82_18(life8_70)];
    spill82_5 = __fieldRead82_21(__fieldRead82_20(__fieldRead82_19()));
    moom.y6 __stackOp82_23_0 = __sourceUninitializedNEW82_22();
    spill82_6 = __stackOp82_23_0;
    __explicitNewInit82_24(__stackOp82_23_0, life6_57, life10_75);
    __call82_25(spill82_5, spill82_6);
    if (!((life5_5 != 0))) {
        break forest_join_104;
    }
    }
    spill82_7 = life7_61;
    if (!((life5_5 == 0))) {
        forestValue82_85_0 = spill82_7;
        break forest_join_85;
    }
    forestValue82_83_0 = __instanceOf82_26(spill82_7);
    }
    if (!((forestValue82_83_0 != 0))) {
        break forest_join_104;
    }
    forestValue82_85_0 = life7_61;
    }
    life9_96 = __cast82_27(forestValue82_85_0);
    spill82_8 = __fieldRead82_30(__fieldRead82_29(__fieldRead82_28()));
    moom.y6 __stackOp82_32_0 = __sourceUninitializedNEW82_31();
    spill82_9 = __stackOp82_32_0;
    spill82_10 = __stackOp82_32_0;
    spill82_11 = life6_57;
    moom.DR __stackOp82_34_0 = __sourceUninitializedNEW82_33();
    spill82_12 = __stackOp82_34_0;
    __explicitNewInit82_38(__stackOp82_34_0, __fieldRead82_35(life9_96), __fieldRead82_36(life9_96), __fieldRead82_37(life9_96));
    __explicitNewInit82_39(spill82_10, spill82_11, spill82_12);
    __call82_40(spill82_8, spill82_9);
    }
    if (!((life5_5 != 0))) {
        break forest_join_694;
    }
    }
    __call82_41(receiver, (p1).length, 2);
    if (!((life5_5 != 0))) {
        break forest_join_694;
    }
    }
    spill82_13 = (p1).length;
    if (!((life5_5 == 0))) {
        forestValue82_124_0 = spill82_13;
        break forest_join_124;
    }
    if (!((spill82_13 == 1))) {
        break forest_join_135;
    }
    forestValue82_124_0 = __integerCategory82_44(__call82_43(__cast82_42((p1)[0])));
    }
    life6_138 = forestValue82_124_0;
    spill82_14 = __fieldRead82_47(__fieldRead82_46(__fieldRead82_45()));
    moom.y7 __stackOp82_49_0 = __sourceUninitializedNEW82_48();
    spill82_15 = __stackOp82_49_0;
    __explicitNewInit82_50(__stackOp82_49_0, __integerCategory82_51(life6_138));
    __call82_52(spill82_14, spill82_15);
    if (!((life5_5 != 0))) {
        break forest_join_694;
    }
    }
    __call82_53(receiver, (p1).length, 1);
    if (!((life5_5 != 0))) {
        break forest_join_694;
    }
    }
    spill82_16 = p1;
    if (!((life5_5 == 0))) {
        forestValue82_151_0 = spill82_16;
        break forest_join_151;
    }
    if (!(((spill82_16).length == 4))) {
        break forest_join_185;
    }
    forestValue82_151_0 = (p1)[0];
    }
    life6_171 = __call82_55(__call82_54(forestValue82_151_0));
    life8_177 = __call82_57(__call82_56((p1)[1]));
    life10_183 = __call82_59(__call82_58((p1)[2]));
    life12_189 = __integerCategory82_62(__call82_61(__cast82_60((p1)[3])));
    spill82_17 = __fieldRead82_65(__fieldRead82_64(__fieldRead82_63()));
    moom.y8 __stackOp82_67_0 = __sourceUninitializedNEW82_66();
    spill82_18 = __stackOp82_67_0;
    __explicitNewInit82_68(__stackOp82_67_0, life6_171, life8_177, life10_183, __integerCategory82_69(life12_189));
    __call82_70(spill82_17, spill82_18);
    if (!((life5_5 != 0))) {
        break forest_join_694;
    }
    }
    __call82_71(receiver, (p1).length, 4);
    if (!((life5_5 != 0))) {
        break forest_join_694;
    }
    }
    spill82_19 = p1;
    if (!((life5_5 == 0))) {
        forestValue82_201_0 = spill82_19;
        break forest_join_201;
    }
    if (!(((spill82_19).length == 3))) {
        break forest_join_228;
    }
    forestValue82_201_0 = (p1)[0];
    }
    life6_225 = __call82_73(__call82_72(forestValue82_201_0));
    life7_231 = __call82_75(__call82_74((p1)[1]));
    life8_237 = __integerCategory82_78(__call82_77(__cast82_76((p1)[2])));
    spill82_20 = __fieldRead82_81(__fieldRead82_80(__fieldRead82_79()));
    moom.y9 __stackOp82_83_0 = __sourceUninitializedNEW82_82();
    spill82_21 = __stackOp82_83_0;
    __explicitNewInit82_84(__stackOp82_83_0, life6_225, life7_231, __integerCategory82_85(life8_237));
    __call82_86(spill82_20, spill82_21);
    if (!((life5_5 != 0))) {
        break forest_join_694;
    }
    }
    __call82_87(receiver, (p1).length, 3);
    if (!((life5_5 != 0))) {
        break forest_join_694;
    }
    }
    spill82_22 = p1;
    if (!((life5_5 == 0))) {
        forestValue82_248_0 = spill82_22;
        break forest_join_248;
    }
    if (!(((spill82_22).length == __invokedynamic82_88(12771, (567961043348425975L ^ life3_3))))) {
        break forest_join_296;
    }
    forestValue82_248_0 = (p1)[0];
    }
    life6_276 = __call82_90(__call82_89(forestValue82_248_0));
    life8_282 = __call82_92(__call82_91((p1)[1]));
    life10_288 = __call82_94(__call82_93((p1)[2]));
    life12_294 = __call82_96(__call82_95((p1)[3]));
    life13_300 = __call82_98(__call82_97((p1)[4]));
    life14_306 = __integerCategory82_101(__call82_100(__cast82_99((p1)[5])));
    spill82_23 = __fieldRead82_104(__fieldRead82_103(__fieldRead82_102()));
    moom.y_ __stackOp82_106_0 = __sourceUninitializedNEW82_105();
    spill82_24 = __stackOp82_106_0;
    __explicitNewInit82_107(__stackOp82_106_0, life6_276, life8_282, life10_288, life12_294, life13_300, __integerCategory82_108(life14_306));
    __call82_109(spill82_23, spill82_24);
    if (!((life5_5 != 0))) {
        break forest_join_694;
    }
    }
    __call82_111(receiver, (p1).length, __invokedynamic82_110(12771, (567961043348425975L ^ life3_3)));
    if (!((life5_5 != 0))) {
        break forest_join_694;
    }
    }
    spill82_25 = p1;
    if (!((life5_5 == 0))) {
        forestValue82_316_0 = spill82_25;
        break forest_join_316;
    }
    if (!(((spill82_25).length == 3))) {
        break forest_join_354;
    }
    forestValue82_316_0 = (p1)[0];
    }
    life6_347 = __cast82_112(forestValue82_316_0);
    life7_352 = __cast82_113((p1)[1]);
    life8_357 = __cast82_114((p1)[2]);
    spill82_26 = __fieldRead82_117(__fieldRead82_116(__fieldRead82_115()));
    moom.za __stackOp82_119_0 = __sourceUninitializedNEW82_118();
    spill82_27 = __stackOp82_119_0;
    spill82_28 = __stackOp82_119_0;
    spill82_29 = (__call82_120())[__call82_121(life6_347)];
    moom.DT __stackOp82_123_0 = __sourceUninitializedNEW82_122();
    spill82_30 = __stackOp82_123_0;
    __explicitNewInit82_127(__stackOp82_123_0, __fieldRead82_124(life7_352), __fieldRead82_125(life7_352), __fieldRead82_126(life7_352));
    __explicitNewInit82_130(spill82_28, spill82_29, spill82_30, (__call82_128())[__call82_129(life8_357)]);
    __call82_131(spill82_26, spill82_27);
    if (!((life5_5 != 0))) {
        break forest_join_694;
    }
    }
    __call82_132(receiver, (p1).length, 3);
    if (!((life5_5 != 0))) {
        break forest_join_694;
    }
    }
    spill82_31 = p1;
    if (!((life5_5 == 0))) {
        forestValue82_374_0 = spill82_31;
        break forest_join_374;
    }
    if (!(((spill82_31).length == __invokedynamic82_133(12771, (567961043348425975L ^ life3_3))))) {
        break forest_join_438;
    }
    forestValue82_374_0 = (p1)[0];
    }
    life6_409 = __cast82_134(forestValue82_374_0);
    life7_415 = __call82_136(__call82_135((p1)[1]));
    life8_421 = __call82_138(__call82_137((p1)[2]));
    life9_427 = __call82_140(__call82_139((p1)[3]));
    life10_433 = __call82_142(__call82_141((p1)[4]));
    life11_439 = __call82_144(__call82_143((p1)[5]));
    spill82_32 = __fieldRead82_147(__fieldRead82_146(__fieldRead82_145()));
    moom.zb __stackOp82_149_0 = __sourceUninitializedNEW82_148();
    spill82_33 = __stackOp82_149_0;
    spill82_34 = __stackOp82_149_0;
    moom.DT __stackOp82_151_0 = __sourceUninitializedNEW82_150();
    spill82_35 = __stackOp82_151_0;
    __explicitNewInit82_155(__stackOp82_151_0, __fieldRead82_152(life6_409), __fieldRead82_153(life6_409), __fieldRead82_154(life6_409));
    spill82_36 = life7_415;
    if (!((life8_421 == -1))) {
        forestValue82_426_0 = spill82_32;
        forestValue82_426_1 = spill82_33;
        forestValue82_426_2 = spill82_34;
        forestValue82_426_3 = spill82_35;
        forestValue82_426_4 = spill82_36;
        break forest_join_426;
    }
    forestValue82_431_0 = spill82_32;
    forestValue82_431_1 = spill82_33;
    forestValue82_431_2 = spill82_34;
    forestValue82_431_3 = spill82_35;
    forestValue82_431_4 = spill82_36;
    forestValue82_431_5 = null;
    break forest_join_431;
    }
    forestValue82_431_0 = forestValue82_426_0;
    forestValue82_431_1 = forestValue82_426_1;
    forestValue82_431_2 = forestValue82_426_2;
    forestValue82_431_3 = forestValue82_426_3;
    forestValue82_431_4 = forestValue82_426_4;
    forestValue82_431_5 = __call82_159(__fieldRead82_158(__fieldRead82_157(__fieldRead82_156())), life8_421);
    }
    __explicitNewInit82_160(forestValue82_431_2, forestValue82_431_3, forestValue82_431_4, forestValue82_431_5, life9_427, life10_433, life11_439);
    __call82_161(forestValue82_431_0, forestValue82_431_1);
    if (!((life5_5 != 0))) {
        break forest_join_694;
    }
    }
    __call82_163(receiver, (p1).length, __invokedynamic82_162(12771, (567961043348425975L ^ life3_3)));
    if (!((life5_5 != 0))) {
        break forest_join_694;
    }
    }
    spill82_37 = (p1).length;
    if (!((life5_5 == 0))) {
        forestValue82_465_0 = spill82_37;
        break forest_join_465;
    }
    if (!((spill82_37 == 0))) {
        break forest_join_463;
    }
    spill82_38 = __fieldRead82_166(__fieldRead82_165(__fieldRead82_164()));
    moom.zc __stackOp82_168_0 = __sourceUninitializedNEW82_167();
    spill82_39 = __stackOp82_168_0;
    __explicitNewInit82_169(__stackOp82_168_0);
    __call82_170(spill82_38, spill82_39);
    if (!((life5_5 != 0))) {
        break forest_join_694;
    }
    }
    forestValue82_465_0 = (p1).length;
    }
    if (!((life5_5 == 0))) {
        forestValue82_474_0 = forestValue82_465_0;
        break forest_join_474;
    }
    if (!((forestValue82_465_0 == 1))) {
        break forest_join_485;
    }
    forestValue82_474_0 = __call82_172(__call82_171((p1)[0]));
    }
    life6_514 = forestValue82_474_0;
    spill82_40 = __fieldRead82_175(__fieldRead82_174(__fieldRead82_173()));
    moom.zc __stackOp82_177_0 = __sourceUninitializedNEW82_176();
    spill82_41 = __stackOp82_177_0;
    __explicitNewInit82_178(__stackOp82_177_0, life6_514);
    __call82_179(spill82_40, spill82_41);
    if (!((life5_5 != 0))) {
        break forest_join_694;
    }
    }
    __call82_180(receiver, (p1).length, 1);
    if (!((life5_5 != 0))) {
        break forest_join_694;
    }
    }
    if (!(((p1).length == 0))) {
        break forest_join_504;
    }
    spill82_42 = __fieldRead82_183(__fieldRead82_182(__fieldRead82_181()));
    moom.zd __stackOp82_185_0 = __sourceUninitializedNEW82_184();
    spill82_43 = __stackOp82_185_0;
    __explicitNewInit82_186(__stackOp82_185_0);
    __call82_187(spill82_42, spill82_43);
    if (!((life5_5 != 0))) {
        break forest_join_694;
    }
    }
    __call82_188(receiver, (p1).length, 0);
    if (!((life5_5 != 0))) {
        break forest_join_694;
    }
    }
    spill82_44 = (p1).length;
    spill82_45 = 2;
    if (!((life5_5 == 0))) {
        forestValue82_550_0 = spill82_44;
        forestValue82_550_1 = spill82_45;
        break forest_join_550;
    }
    if (!((spill82_44 == spill82_45))) {
        break forest_join_545;
    }
    life6_568 = __call82_190(__call82_189((p1)[0]));
    life7_573 = __cast82_191((p1)[1]);
    spill82_46 = __fieldRead82_194(__fieldRead82_193(__fieldRead82_192()));
    moom.ze __stackOp82_196_0 = __sourceUninitializedNEW82_195();
    spill82_47 = __stackOp82_196_0;
    __explicitNewInit82_202(__stackOp82_196_0, __call82_199(__fieldRead82_198(__fieldRead82_197()), life6_568), (__call82_200())[__call82_201(life7_573)]);
    __call82_203(spill82_46, spill82_47);
    if (!((life5_5 != 0))) {
        break forest_join_694;
    }
    }
    spill82_48 = (p1).length;
    if (!((life5_5 == 0))) {
        forestValue82_556_0 = spill82_48;
        break forest_join_556;
    }
    forestValue82_550_0 = spill82_48;
    forestValue82_550_1 = 3;
    }
    if (!((forestValue82_550_0 == forestValue82_550_1))) {
        break forest_join_586;
    }
    forestValue82_556_0 = __call82_205(__call82_204((p1)[0]));
    }
    life6_605 = forestValue82_556_0;
    life7_610 = __cast82_206((p1)[1]);
    life8_616 = __call82_208(__call82_207((p1)[2]));
    spill82_49 = __fieldRead82_211(__fieldRead82_210(__fieldRead82_209()));
    moom.ze __stackOp82_213_0 = __sourceUninitializedNEW82_212();
    spill82_50 = __stackOp82_213_0;
    __explicitNewInit82_219(__stackOp82_213_0, __call82_216(__fieldRead82_215(__fieldRead82_214()), life6_605), (__call82_217())[__call82_218(life7_610)], life8_616);
    __call82_220(spill82_49, spill82_50);
    if (!((life5_5 != 0))) {
        break forest_join_694;
    }
    }
    __call82_221(receiver, (p1).length, 2);
    if (!((life5_5 != 0))) {
        break forest_join_694;
    }
    }
    spill82_51 = (p1).length;
    if (!((life5_5 == 0))) {
        forestValue82_604_0 = spill82_51;
        break forest_join_604;
    }
    if (!((spill82_51 == 1))) {
        break forest_join_615;
    }
    forestValue82_604_0 = __call82_223(__call82_222((p1)[0]));
    }
    life6_657 = forestValue82_604_0;
    spill82_52 = __fieldRead82_226(__fieldRead82_225(__fieldRead82_224()));
    moom.zg __stackOp82_228_0 = __sourceUninitializedNEW82_227();
    spill82_53 = __stackOp82_228_0;
    __explicitNewInit82_229(__stackOp82_228_0, life6_657);
    __call82_230(spill82_52, spill82_53);
    if (!((life5_5 != 0))) {
        break forest_join_694;
    }
    }
    __call82_231(receiver, (p1).length, 1);
    if (!((life5_5 != 0))) {
        break forest_join_694;
    }
    }
    spill82_54 = (p1).length;
    if (!((life5_5 == 0))) {
        forestValue82_633_0 = spill82_54;
        break forest_join_633;
    }
    if (!((spill82_54 == 3))) {
        break forest_join_658;
    }
    forestValue82_633_0 = __call82_233(__call82_232((p1)[0]));
    }
    life6_690 = forestValue82_633_0;
    life7_696 = __call82_235(__call82_234((p1)[1]));
    life8_702 = __integerCategory82_238(__call82_237(__cast82_236((p1)[2])));
    spill82_55 = __fieldRead82_241(__fieldRead82_240(__fieldRead82_239()));
    moom.zi __stackOp82_243_0 = __sourceUninitializedNEW82_242();
    spill82_56 = __stackOp82_243_0;
    __explicitNewInit82_244(__stackOp82_243_0, life6_690, __integerCategory82_245(life7_696), __integerCategory82_246(life8_702));
    __call82_247(spill82_55, spill82_56);
    if (!((life5_5 != 0))) {
        break forest_join_694;
    }
    }
    __call82_248(receiver, (p1).length, 3);
    if (!((life5_5 != 0))) {
        break forest_join_694;
    }
    }
    spill82_57 = p1;
    if (!((life5_5 == 0))) {
        forestValue82_674_0 = spill82_57;
        break forest_join_674;
    }
    if (!(((spill82_57).length == 1))) {
        break forest_join_689;
    }
    forestValue82_674_0 = (p1)[0];
    }
    life6_736 = __cast82_249(forestValue82_674_0);
    spill82_58 = __fieldRead82_252(__fieldRead82_251(__fieldRead82_250()));
    moom.zp __stackOp82_254_0 = __sourceUninitializedNEW82_253();
    spill82_59 = __stackOp82_254_0;
    __explicitNewInit82_257(__stackOp82_254_0, (__call82_255())[__call82_256(life6_736)]);
    __call82_258(spill82_58, spill82_59);
    if (!((life5_5 != 0))) {
        break forest_join_694;
    }
    }
    __call82_259(receiver, (p1).length, 1);
    }
    return;
}
private static native long __fieldRead82_0() throws Throwable;
private static native boolean __call82_1() throws Throwable;
private static native int __integerCategory82_2(boolean value) throws Throwable;
private static native java.lang.Integer __call82_3(java.lang.Object a0) throws Throwable;
private static native int __call82_4(java.lang.Integer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead82_5() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead82_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead82_7(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.y4 __sourceUninitializedNEW82_8() throws Throwable;
private static native void __explicitNewInit82_10(moom.y4 a0, int a1) throws Throwable;
private static native void __call82_11(net.minecraft.client.network.NetHandlerPlayClient a0, moom.y4 a1) throws Throwable;
private static native void __call82_12(com.moon.j3 a0, int a1, int a2) throws Throwable;
private static native java.lang.Integer __call82_13(java.lang.Object a0) throws Throwable;
private static native int __call82_14(java.lang.Integer a0) throws Throwable;
private static native int __instanceOf82_15(java.lang.Object a0) throws Throwable;
private static native com.moon.scripting.api.enums.InteractActions __cast82_16(java.lang.Object a0) throws Throwable;
private static native net.minecraft.network.play.client.C02PacketUseEntity$Action[] __call82_17() throws Throwable;
private static native int __call82_18(com.moon.scripting.api.enums.InteractActions a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead82_19() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead82_20(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead82_21(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.y6 __sourceUninitializedNEW82_22() throws Throwable;
private static native void __explicitNewInit82_24(moom.y6 a0, int a1, net.minecraft.network.play.client.C02PacketUseEntity$Action a2) throws Throwable;
private static native void __call82_25(net.minecraft.client.network.NetHandlerPlayClient a0, moom.y6 a1) throws Throwable;
private static native int __instanceOf82_26(java.lang.Object a0) throws Throwable;
private static native com.moon.scripting.api.types.Vec3d __cast82_27(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead82_28() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead82_29(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead82_30(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.y6 __sourceUninitializedNEW82_31() throws Throwable;
private static native moom.DR __sourceUninitializedNEW82_33() throws Throwable;
private static native double __fieldRead82_35(com.moon.scripting.api.types.Vec3d a0) throws Throwable;
private static native double __fieldRead82_36(com.moon.scripting.api.types.Vec3d a0) throws Throwable;
private static native double __fieldRead82_37(com.moon.scripting.api.types.Vec3d a0) throws Throwable;
private static native void __explicitNewInit82_38(moom.DR a0, double a1, double a2, double a3) throws Throwable;
private static native void __explicitNewInit82_39(moom.y6 a0, int a1, moom.DR a2) throws Throwable;
private static native void __call82_40(net.minecraft.client.network.NetHandlerPlayClient a0, moom.y6 a1) throws Throwable;
private static native void __call82_41(com.moon.j3 a0, int a1, int a2) throws Throwable;
private static native java.lang.Boolean __cast82_42(java.lang.Object a0) throws Throwable;
private static native boolean __call82_43(java.lang.Boolean a0) throws Throwable;
private static native int __integerCategory82_44(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead82_45() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead82_46(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead82_47(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.y7 __sourceUninitializedNEW82_48() throws Throwable;
private static native boolean __integerCategory82_51(int value) throws Throwable;
private static native void __explicitNewInit82_50(moom.y7 a0, boolean a1) throws Throwable;
private static native void __call82_52(net.minecraft.client.network.NetHandlerPlayClient a0, moom.y7 a1) throws Throwable;
private static native void __call82_53(com.moon.j3 a0, int a1, int a2) throws Throwable;
private static native java.lang.Double __call82_54(java.lang.Object a0) throws Throwable;
private static native double __call82_55(java.lang.Double a0) throws Throwable;
private static native java.lang.Double __call82_56(java.lang.Object a0) throws Throwable;
private static native double __call82_57(java.lang.Double a0) throws Throwable;
private static native java.lang.Double __call82_58(java.lang.Object a0) throws Throwable;
private static native double __call82_59(java.lang.Double a0) throws Throwable;
private static native java.lang.Boolean __cast82_60(java.lang.Object a0) throws Throwable;
private static native boolean __call82_61(java.lang.Boolean a0) throws Throwable;
private static native int __integerCategory82_62(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead82_63() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead82_64(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead82_65(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.y8 __sourceUninitializedNEW82_66() throws Throwable;
private static native boolean __integerCategory82_69(int value) throws Throwable;
private static native void __explicitNewInit82_68(moom.y8 a0, double a1, double a2, double a3, boolean a4) throws Throwable;
private static native void __call82_70(net.minecraft.client.network.NetHandlerPlayClient a0, moom.y8 a1) throws Throwable;
private static native void __call82_71(com.moon.j3 a0, int a1, int a2) throws Throwable;
private static native java.lang.Float __call82_72(java.lang.Object a0) throws Throwable;
private static native float __call82_73(java.lang.Float a0) throws Throwable;
private static native java.lang.Float __call82_74(java.lang.Object a0) throws Throwable;
private static native float __call82_75(java.lang.Float a0) throws Throwable;
private static native java.lang.Boolean __cast82_76(java.lang.Object a0) throws Throwable;
private static native boolean __call82_77(java.lang.Boolean a0) throws Throwable;
private static native int __integerCategory82_78(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead82_79() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead82_80(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead82_81(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.y9 __sourceUninitializedNEW82_82() throws Throwable;
private static native boolean __integerCategory82_85(int value) throws Throwable;
private static native void __explicitNewInit82_84(moom.y9 a0, float a1, float a2, boolean a3) throws Throwable;
private static native void __call82_86(net.minecraft.client.network.NetHandlerPlayClient a0, moom.y9 a1) throws Throwable;
private static native void __call82_87(com.moon.j3 a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic82_88(int a0, long a1) throws Throwable;
private static native java.lang.Double __call82_89(java.lang.Object a0) throws Throwable;
private static native double __call82_90(java.lang.Double a0) throws Throwable;
private static native java.lang.Double __call82_91(java.lang.Object a0) throws Throwable;
private static native double __call82_92(java.lang.Double a0) throws Throwable;
private static native java.lang.Double __call82_93(java.lang.Object a0) throws Throwable;
private static native double __call82_94(java.lang.Double a0) throws Throwable;
private static native java.lang.Float __call82_95(java.lang.Object a0) throws Throwable;
private static native float __call82_96(java.lang.Float a0) throws Throwable;
private static native java.lang.Float __call82_97(java.lang.Object a0) throws Throwable;
private static native float __call82_98(java.lang.Float a0) throws Throwable;
private static native java.lang.Boolean __cast82_99(java.lang.Object a0) throws Throwable;
private static native boolean __call82_100(java.lang.Boolean a0) throws Throwable;
private static native int __integerCategory82_101(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead82_102() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead82_103(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead82_104(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.y_ __sourceUninitializedNEW82_105() throws Throwable;
private static native boolean __integerCategory82_108(int value) throws Throwable;
private static native void __explicitNewInit82_107(moom.y_ a0, double a1, double a2, double a3, float a4, float a5, boolean a6) throws Throwable;
private static native void __call82_109(net.minecraft.client.network.NetHandlerPlayClient a0, moom.y_ a1) throws Throwable;
private static native int __invokedynamic82_110(int a0, long a1) throws Throwable;
private static native void __call82_111(com.moon.j3 a0, int a1, int a2) throws Throwable;
private static native com.moon.scripting.api.enums.DiggingActions __cast82_112(java.lang.Object a0) throws Throwable;
private static native com.moon.scripting.api.types.Vec3i __cast82_113(java.lang.Object a0) throws Throwable;
private static native com.moon.scripting.api.enums.Facing __cast82_114(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead82_115() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead82_116(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead82_117(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.za __sourceUninitializedNEW82_118() throws Throwable;
private static native net.minecraft.network.play.client.C07PacketPlayerDigging$Action[] __call82_120() throws Throwable;
private static native int __call82_121(com.moon.scripting.api.enums.DiggingActions a0) throws Throwable;
private static native moom.DT __sourceUninitializedNEW82_122() throws Throwable;
private static native int __fieldRead82_124(com.moon.scripting.api.types.Vec3i a0) throws Throwable;
private static native int __fieldRead82_125(com.moon.scripting.api.types.Vec3i a0) throws Throwable;
private static native int __fieldRead82_126(com.moon.scripting.api.types.Vec3i a0) throws Throwable;
private static native void __explicitNewInit82_127(moom.DT a0, int a1, int a2, int a3) throws Throwable;
private static native moom.bs[] __call82_128() throws Throwable;
private static native int __call82_129(com.moon.scripting.api.enums.Facing a0) throws Throwable;
private static native void __explicitNewInit82_130(moom.za a0, net.minecraft.network.play.client.C07PacketPlayerDigging$Action a1, moom.DT a2, moom.bs a3) throws Throwable;
private static native void __call82_131(net.minecraft.client.network.NetHandlerPlayClient a0, moom.za a1) throws Throwable;
private static native void __call82_132(com.moon.j3 a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic82_133(int a0, long a1) throws Throwable;
private static native com.moon.scripting.api.types.Vec3i __cast82_134(java.lang.Object a0) throws Throwable;
private static native java.lang.Integer __call82_135(java.lang.Object a0) throws Throwable;
private static native int __call82_136(java.lang.Integer a0) throws Throwable;
private static native java.lang.Integer __call82_137(java.lang.Object a0) throws Throwable;
private static native int __call82_138(java.lang.Integer a0) throws Throwable;
private static native java.lang.Float __call82_139(java.lang.Object a0) throws Throwable;
private static native float __call82_140(java.lang.Float a0) throws Throwable;
private static native java.lang.Float __call82_141(java.lang.Object a0) throws Throwable;
private static native float __call82_142(java.lang.Float a0) throws Throwable;
private static native java.lang.Float __call82_143(java.lang.Object a0) throws Throwable;
private static native float __call82_144(java.lang.Float a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead82_145() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead82_146(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead82_147(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.zb __sourceUninitializedNEW82_148() throws Throwable;
private static native moom.DT __sourceUninitializedNEW82_150() throws Throwable;
private static native int __fieldRead82_152(com.moon.scripting.api.types.Vec3i a0) throws Throwable;
private static native int __fieldRead82_153(com.moon.scripting.api.types.Vec3i a0) throws Throwable;
private static native int __fieldRead82_154(com.moon.scripting.api.types.Vec3i a0) throws Throwable;
private static native void __explicitNewInit82_155(moom.DT a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead82_156() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead82_157(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead82_158(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call82_159(net.minecraft.entity.player.InventoryPlayer a0, int a1) throws Throwable;
private static native void __explicitNewInit82_160(moom.zb a0, moom.DT a1, int a2, net.minecraft.item.ItemStack a3, float a4, float a5, float a6) throws Throwable;
private static native void __call82_161(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zb a1) throws Throwable;
private static native int __invokedynamic82_162(int a0, long a1) throws Throwable;
private static native void __call82_163(com.moon.j3 a0, int a1, int a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead82_164() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead82_165(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead82_166(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.zc __sourceUninitializedNEW82_167() throws Throwable;
private static native void __explicitNewInit82_169(moom.zc a0) throws Throwable;
private static native void __call82_170(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zc a1) throws Throwable;
private static native java.lang.Integer __call82_171(java.lang.Object a0) throws Throwable;
private static native int __call82_172(java.lang.Integer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead82_173() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead82_174(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead82_175(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.zc __sourceUninitializedNEW82_176() throws Throwable;
private static native void __explicitNewInit82_178(moom.zc a0, int a1) throws Throwable;
private static native void __call82_179(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zc a1) throws Throwable;
private static native void __call82_180(com.moon.j3 a0, int a1, int a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead82_181() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead82_182(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead82_183(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.zd __sourceUninitializedNEW82_184() throws Throwable;
private static native void __explicitNewInit82_186(moom.zd a0) throws Throwable;
private static native void __call82_187(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zd a1) throws Throwable;
private static native void __call82_188(com.moon.j3 a0, int a1, int a2) throws Throwable;
private static native java.lang.Integer __call82_189(java.lang.Object a0) throws Throwable;
private static native int __call82_190(java.lang.Integer a0) throws Throwable;
private static native com.moon.scripting.api.enums.EntityAction __cast82_191(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead82_192() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead82_193(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead82_194(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.ze __sourceUninitializedNEW82_195() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead82_197() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead82_198(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.Entity __call82_199(net.minecraft.client.multiplayer.WorldClient a0, int a1) throws Throwable;
private static native net.minecraft.network.play.client.C0BPacketEntityAction$Action[] __call82_200() throws Throwable;
private static native int __call82_201(com.moon.scripting.api.enums.EntityAction a0) throws Throwable;
private static native void __explicitNewInit82_202(moom.ze a0, net.minecraft.entity.Entity a1, net.minecraft.network.play.client.C0BPacketEntityAction$Action a2) throws Throwable;
private static native void __call82_203(net.minecraft.client.network.NetHandlerPlayClient a0, moom.ze a1) throws Throwable;
private static native java.lang.Integer __call82_204(java.lang.Object a0) throws Throwable;
private static native int __call82_205(java.lang.Integer a0) throws Throwable;
private static native com.moon.scripting.api.enums.EntityAction __cast82_206(java.lang.Object a0) throws Throwable;
private static native java.lang.Integer __call82_207(java.lang.Object a0) throws Throwable;
private static native int __call82_208(java.lang.Integer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead82_209() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead82_210(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead82_211(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.ze __sourceUninitializedNEW82_212() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead82_214() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead82_215(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.Entity __call82_216(net.minecraft.client.multiplayer.WorldClient a0, int a1) throws Throwable;
private static native net.minecraft.network.play.client.C0BPacketEntityAction$Action[] __call82_217() throws Throwable;
private static native int __call82_218(com.moon.scripting.api.enums.EntityAction a0) throws Throwable;
private static native void __explicitNewInit82_219(moom.ze a0, net.minecraft.entity.Entity a1, net.minecraft.network.play.client.C0BPacketEntityAction$Action a2, int a3) throws Throwable;
private static native void __call82_220(net.minecraft.client.network.NetHandlerPlayClient a0, moom.ze a1) throws Throwable;
private static native void __call82_221(com.moon.j3 a0, int a1, int a2) throws Throwable;
private static native java.lang.Integer __call82_222(java.lang.Object a0) throws Throwable;
private static native int __call82_223(java.lang.Integer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead82_224() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead82_225(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead82_226(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.zg __sourceUninitializedNEW82_227() throws Throwable;
private static native void __explicitNewInit82_229(moom.zg a0, int a1) throws Throwable;
private static native void __call82_230(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zg a1) throws Throwable;
private static native void __call82_231(com.moon.j3 a0, int a1, int a2) throws Throwable;
private static native java.lang.Integer __call82_232(java.lang.Object a0) throws Throwable;
private static native int __call82_233(java.lang.Integer a0) throws Throwable;
private static native java.lang.Short __call82_234(java.lang.Object a0) throws Throwable;
private static native short __call82_235(java.lang.Short a0) throws Throwable;
private static native java.lang.Boolean __cast82_236(java.lang.Object a0) throws Throwable;
private static native boolean __call82_237(java.lang.Boolean a0) throws Throwable;
private static native int __integerCategory82_238(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead82_239() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead82_240(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead82_241(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.zi __sourceUninitializedNEW82_242() throws Throwable;
private static native short __integerCategory82_245(int value) throws Throwable;
private static native boolean __integerCategory82_246(int value) throws Throwable;
private static native void __explicitNewInit82_244(moom.zi a0, int a1, short a2, boolean a3) throws Throwable;
private static native void __call82_247(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zi a1) throws Throwable;
private static native void __call82_248(com.moon.j3 a0, int a1, int a2) throws Throwable;
private static native com.moon.scripting.api.enums.ClientStatusActions __cast82_249(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead82_250() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead82_251(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead82_252(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.zp __sourceUninitializedNEW82_253() throws Throwable;
private static native net.minecraft.network.play.client.C16PacketClientStatus$EnumState[] __call82_255() throws Throwable;
private static native int __call82_256(com.moon.scripting.api.enums.ClientStatusActions a0) throws Throwable;
private static native void __explicitNewInit82_257(moom.zp a0, net.minecraft.network.play.client.C16PacketClientStatus$EnumState a1) throws Throwable;
private static native void __call82_258(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zp a1) throws Throwable;
private static native void __call82_259(com.moon.j3 a0, int a1, int a2) throws Throwable;

}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1743_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/j3"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static void b(java.lang.String[] p0) {
b = ((java.lang.String[])(p0));
    return;
}


public static java.lang.String[] b() {
return com.moon.j3.b;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 2593;
      if (h[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(p1 >>> 56),
            (byte)(p1 >>> 48),
            (byte)(p1 >>> 40),
            (byte)(p1 >>> 32),
            (byte)(p1 >>> 24),
            (byte)(p1 >>> 16),
            (byte)(p1 >>> 8),
            (byte)p1
         };
         long var5 = g[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/j3", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.j3.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private void a(int p0, int p1) {
long local3_life2 = (com.moon.j3.c ^ 119319273059573L);
    int __stackOp52_5_0 = p0;
    int __stackOp52_5_1 = p1;
    java.lang.String __stackOp52_5_2 = __sourceIntrinsic_fd0ba049c90e_originalDynamicSite52_4(21585, (8590968302306412534L ^ local3_life2));
    java.lang.String __sourceSpill52_7 = __stackOp52_5_2;
    int __sourceSpill52_8 = __stackOp52_5_0;
    int __sourceSpill52_9 = __stackOp52_5_1;
    recovery.source.CarrierOps.discard(__stackOp52_5_2);
    int __stackOp52_12_0 = __sourceSpill52_9;
    java.lang.String __stackOp52_12_1 = __sourceIntrinsic_fd0ba049c90e_originalDynamicSite52_11(22027, (3093138980968744365L ^ local3_life2));
    com.moon.nC.a(((java.lang.String)(__sourceIntrinsic_fd0ba049c90e_originalDynamicSite52_13(__sourceSpill52_7, __sourceSpill52_8, __stackOp52_12_1, __stackOp52_12_0, "!"))));
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1744_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/j3"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 12311);
    if (((com.moon.j3.e)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.j3.f)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.j3.f)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/j3", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.j3.d)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.j3.e)[life5_8] = com.moon.j3.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.j3.e)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.j3.a(((int)(local4)), ((long)(local5)));
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
        byte[] spill457_0 = p0;
        life4_9 += 1;
        life5_44 = (spill457_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill457_1 = p0;
        life4_9 += 1;
        life5_76 = (spill457_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill457_2 = p0;
        life4_9 += 1;
        life5_91 = (spill457_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public void jump() {
net.minecraft.client.entity.EntityPlayerSP forwardValue504_13_0;
    net.minecraft.client.entity.EntityPlayerSP spill504_0;
    long life1_3;
    int life3_5;
    forward_join_14: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 63361129320206L);
    life3_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill504_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 != 0))) {
        forwardValue504_13_0 = spill504_0;
        break forward_join_13;
    }
    if (!((spill504_0 != null))) {
        break forward_join_14;
    }
    forwardValue504_13_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue504_13_0)).D__sourceReturn_da8c82d5d4();
    }
    return;
}


public double get_base_move_speed() {
long local1 = (com.moon.j3.c ^ 24222397376950L);
    if ((((net.minecraft.client.Minecraft)(com.moon.j3.a)).K == null)) {
        return 0x0.0p0d;
    }
    return com.moon.nJ.b();
}


public double get_prev_position_y() {
net.minecraft.client.entity.EntityPlayerSP forwardValue484_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill484_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 12148688288287L);
    life3_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill484_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 != 0))) {
        forwardValue484_15_0 = spill484_0;
        break forward_join_15;
    }
    if (!((spill484_0 == null))) {
        break forward_join_13;
    }
    return 0x0.0p0d;
    }
    forwardValue484_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue484_15_0)).l;
}


public double get_prev_position_z() {
net.minecraft.client.entity.EntityPlayerSP forwardValue485_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill485_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 6022343988486L);
    life3_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill485_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 == 0))) {
        forwardValue485_15_0 = spill485_0;
        break forward_join_15;
    }
    if (!((spill485_0 == null))) {
        break forward_join_13;
    }
    return 0x0.0p0d;
    }
    forwardValue485_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue485_15_0)).m;
}


public boolean collided_vertically() {
net.minecraft.client.entity.EntityPlayerSP forwardValue459_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill459_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 33851221107391L);
    life3_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill459_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 != 0))) {
        forwardValue459_15_0 = spill459_0;
        break forward_join_15;
    }
    if (!((spill459_0 == null))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue459_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue459_15_0)).C;
}


public void set_position_and_update(com.moon.scripting.api.types.Vec3d p0) {
net.minecraft.client.entity.EntityPlayerSP forwardValue518_14_0;
    net.minecraft.client.entity.EntityPlayerSP spill518_0;
    long life2_3;
    int life4_5;
    forward_join_14: {
    forward_join_12: {
    life2_3 = (com.moon.j3.c ^ 38677243489020L);
    life4_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill518_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life4_5 == 0))) {
        forwardValue518_14_0 = spill518_0;
        break forward_join_14;
    }
    if (!((spill518_0 == null))) {
        break forward_join_12;
    }
    return;
    }
    forwardValue518_14_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue518_14_0)).e(((double)(((com.moon.scripting.api.types.Vec3d)(p0)).x)), ((double)(((com.moon.scripting.api.types.Vec3d)(p0)).y)), ((double)(((com.moon.scripting.api.types.Vec3d)(p0)).z)));
    return;
}


public boolean collided_horizontally() {
net.minecraft.client.entity.EntityPlayerSP forwardValue458_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill458_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 134236881681743L);
    life3_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill458_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 != 0))) {
        forwardValue458_15_0 = spill458_0;
        break forward_join_15;
    }
    if (!((spill458_0 == null))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue458_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue458_15_0)).B;
}


public void send_packet_no_event(int p0, java.lang.Object[] p1) { __sourceHandlerCall_83af98f333a330c43c1f(this, p0, p1); }


public double get_prev_position_x() {
net.minecraft.client.entity.EntityPlayerSP forwardValue483_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill483_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 29718043397096L);
    life3_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill483_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 != 0))) {
        forwardValue483_15_0 = spill483_0;
        break forward_join_15;
    }
    if (!((spill483_0 == null))) {
        break forward_join_13;
    }
    return 0x0.0p0d;
    }
    forwardValue483_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue483_15_0)).k;
}


public boolean is_blocking() {
net.minecraft.client.entity.EntityPlayerSP forwardValue490_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill490_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 82976625094481L);
    life3_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill490_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 != 0))) {
        forwardValue490_15_0 = spill490_0;
        break forward_join_15;
    }
    if (!((spill490_0 == null))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue490_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue490_15_0)).M();
}


public double distance_to_vec(com.moon.scripting.api.types.Vec3d p0) {
net.minecraft.client.entity.EntityPlayerSP forwardValue462_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill462_0;
    long life2_3;
    int life4_5;
    forward_join_15: {
    forward_join_13: {
    life2_3 = (com.moon.j3.c ^ 105524712399525L);
    life4_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill462_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life4_5 != 0))) {
        forwardValue462_15_0 = spill462_0;
        break forward_join_15;
    }
    if (!((spill462_0 == null))) {
        break forward_join_13;
    }
    return 0x0.0p0d;
    }
    forwardValue462_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue462_15_0)).a(((double)(((com.moon.scripting.api.types.Vec3d)(p0)).x)), ((double)(((com.moon.scripting.api.types.Vec3d)(p0)).y)), ((double)(((com.moon.scripting.api.types.Vec3d)(p0)).z)));
}


public double get_health() {
net.minecraft.client.entity.EntityPlayerSP forwardValue468_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill468_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 121665149398183L);
    life3_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill468_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 != 0))) {
        forwardValue468_15_0 = spill468_0;
        break forward_join_15;
    }
    if (!((spill468_0 == null))) {
        break forward_join_13;
    }
    return 0x0.0p0d;
    }
    forwardValue468_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((double) ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue468_15_0)).b__sourceReturn_bc607678b6());
}


public boolean is_dead() {
net.minecraft.client.entity.EntityPlayerSP forwardValue492_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill492_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 135657059612072L);
    life3_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill492_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 == 0))) {
        forwardValue492_15_0 = spill492_0;
        break forward_join_15;
    }
    if (!((spill492_0 == null))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue492_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue492_15_0)).F;
}


public void set_motion_x(double p0) {
net.minecraft.client.entity.EntityPlayerSP forwardValue513_14_0;
    net.minecraft.client.entity.EntityPlayerSP spill513_0;
    long life3_3;
    int life5_5;
    forward_join_14: {
    forward_join_12: {
    life3_3 = (com.moon.j3.c ^ 81393662931947L);
    life5_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill513_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life5_5 != 0))) {
        forwardValue513_14_0 = spill513_0;
        break forward_join_14;
    }
    if (!((spill513_0 == null))) {
        break forward_join_12;
    }
    return;
    }
    forwardValue513_14_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue513_14_0)).t = ((double)(p0));
    return;
}


public double get_motion_z() {
net.minecraft.client.entity.EntityPlayerSP forwardValue475_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill475_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 138203683307187L);
    life3_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill475_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 == 0))) {
        forwardValue475_15_0 = spill475_0;
        break forward_join_15;
    }
    if (!((spill475_0 == null))) {
        break forward_join_13;
    }
    return 0x0.0p0d;
    }
    forwardValue475_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue475_15_0)).v;
}


public boolean is_sneaking() {
net.minecraft.client.entity.EntityPlayerSP forwardValue501_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill501_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 80565106018042L);
    life3_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill501_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 != 0))) {
        forwardValue501_15_0 = spill501_0;
        break forward_join_15;
    }
    if (!((spill501_0 == null))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue501_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue501_15_0)).t__Boolean();
}


public void set_held_item(int p0) {
net.minecraft.client.entity.EntityPlayerSP forwardValue511_14_0;
    net.minecraft.client.entity.EntityPlayerSP spill511_0;
    long life2_3;
    int life4_5;
    forward_join_14: {
    forward_join_12: {
    life2_3 = (com.moon.j3.c ^ 61434446378720L);
    life4_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill511_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life4_5 == 0))) {
        forwardValue511_14_0 = spill511_0;
        break forward_join_14;
    }
    if (!((spill511_0 == null))) {
        break forward_join_12;
    }
    return;
    }
    forwardValue511_14_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(forwardValue511_14_0)).bD)).c = ((int)(p0));
    ((moom.jI)(((net.minecraft.client.Minecraft)(com.moon.j3.a)).F)).c();
    return;
}


public void set_motion_y(double p0) {
net.minecraft.client.entity.EntityPlayerSP forwardValue514_14_0;
    net.minecraft.client.entity.EntityPlayerSP spill514_0;
    long life3_3;
    int life5_5;
    forward_join_14: {
    forward_join_12: {
    life3_3 = (com.moon.j3.c ^ 137532814795261L);
    life5_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill514_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life5_5 == 0))) {
        forwardValue514_14_0 = spill514_0;
        break forward_join_14;
    }
    if (!((spill514_0 == null))) {
        break forward_join_12;
    }
    return;
    }
    forwardValue514_14_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue514_14_0)).u = ((double)(p0));
    return;
}


public boolean place_block(int p0, com.moon.scripting.api.types.Vec3i p1, com.moon.scripting.api.types.Vec3d p2, com.moon.scripting.api.enums.Facing p3) {
net.minecraft.client.Minecraft forwardValue506_14_0;
    net.minecraft.client.Minecraft spill506_0;
    long life5_3;
    int life7_5;
    forward_join_14: {
    forward_join_13: {
    life5_3 = (com.moon.j3.c ^ 48017598655805L);
    life7_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill506_0 = com.moon.j3.a;
    if (!((life7_5 == 0))) {
        forwardValue506_14_0 = spill506_0;
        break forward_join_14;
    }
    if (!((((net.minecraft.client.Minecraft)(spill506_0)).K == null))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue506_14_0 = com.moon.j3.a;
    }
    return ((moom.jI)(((net.minecraft.client.Minecraft)(forwardValue506_14_0)).F)).a(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.j3.a)).K)), ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.j3.a)).I)), ((net.minecraft.item.ItemStack)(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.j3.a)).K)).bD)).a__xW(((int)(p0))))), ((moom.DT)(new moom.DT(((double) ((com.moon.scripting.api.types.Vec3i)(p1)).x), ((double) ((com.moon.scripting.api.types.Vec3i)(p1)).y), ((com.moon.scripting.api.types.Vec3d)(p2)).z))), ((moom.bs)((moom.bs.values())[((com.moon.scripting.api.enums.Facing)(p3)).ordinal()])), ((moom.DR)(new moom.DR(((com.moon.scripting.api.types.Vec3d)(p2)).x, ((com.moon.scripting.api.types.Vec3d)(p2)).y, ((com.moon.scripting.api.types.Vec3d)(p2)).z))));
}


public double get_fall_distance() {
net.minecraft.client.entity.EntityPlayerSP forwardValue466_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill466_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 102459747252834L);
    life3_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill466_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 == 0))) {
        forwardValue466_15_0 = spill466_0;
        break forward_join_15;
    }
    if (!((spill466_0 == null))) {
        break forward_join_13;
    }
    return 0x0.0p0d;
    }
    forwardValue466_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((double) ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue466_15_0)).L);
}


public boolean is_on_edge() {
net.minecraft.client.entity.EntityPlayerSP forwardValue497_15_0;
    int forwardValue497_20_0;
    net.minecraft.client.entity.EntityPlayerSP spill497_0;
    boolean spill497_1;
    long life1_3;
    int life3_5;
    moom.DT life4_43;
    forward_join_21: {
    forward_join_20: {
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 43451093271487L);
    life3_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill497_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 == 0))) {
        forwardValue497_15_0 = spill497_0;
        break forward_join_15;
    }
    if (!((spill497_0 == null))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue497_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    spill497_1 = ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue497_15_0)).A;
    if (!((life3_5 == 0))) {
        forwardValue497_20_0 = ((spill497_1) ? 1 : 0);
        break forward_join_20;
    }
    if (!((!spill497_1))) {
        break forward_join_21;
    }
    forwardValue497_20_0 = 0;
    }
    return ((forwardValue497_20_0) != 0);
    }
    life4_43 = new moom.DT(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.j3.a)).K)).n, (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.j3.a)).K)).o - 0x1.0p-1d), ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.j3.a)).K)).p);
    return ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.j3.a)).I)).a__Boolean(((moom.DT)(life4_43)));
}


public float get_yaw() {
net.minecraft.client.entity.EntityPlayerSP forwardValue488_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill488_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 104408009556202L);
    life3_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill488_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 == 0))) {
        forwardValue488_15_0 = spill488_0;
        break forward_join_15;
    }
    if (!((spill488_0 == null))) {
        break forward_join_13;
    }
    return 0x0.0p0f;
    }
    forwardValue488_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue488_15_0)).w;
}


public double distance_to_entity(int p0) {
net.minecraft.client.entity.EntityPlayerSP forwardValue461_24_0;
    boolean spill461_0;
    net.minecraft.client.entity.EntityPlayerSP spill461_1;
    long life2_3;
    net.minecraft.entity.Entity life5_9;
    int life4_10;
    forward_join_24: {
    forward_join_22: {
    forward_join_15: {
    life2_3 = (com.moon.j3.c ^ 31764280727174L);
    spill461_0 = com.moon.j2.c();
    life5_9 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.j3.a)).I)).a(((int)(p0)));
    life4_10 = ((spill461_0) ? 1 : 0);
    if (!((life5_9 == null))) {
        break forward_join_15;
    }
    return 0x0.0p0d;
    }
    spill461_1 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life4_10 == 0))) {
        forwardValue461_24_0 = spill461_1;
        break forward_join_24;
    }
    if (!((spill461_1 == null))) {
        break forward_join_22;
    }
    return 0x0.0p0d;
    }
    forwardValue461_24_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue461_24_0)).a(((net.minecraft.entity.Entity)(life5_9)));
}


public com.moon.scripting.api.types.RayCastResult ray_cast(float p0, float p1, float p2) { return __sourceHandlerCall_590a96fecd5661ca7154(this, p0, p1, p2); }


public void right_click() {
net.minecraft.client.Minecraft forwardValue508_13_0;
    net.minecraft.client.Minecraft spill508_0;
    long life1_3;
    int life3_5;
    int life4_21;
    forward_join_13: {
    forward_join_12: {
    life1_3 = (com.moon.j3.c ^ 47206209649391L);
    life3_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill508_0 = com.moon.j3.a;
    if (!((life3_5 == 0))) {
        forwardValue508_13_0 = spill508_0;
        break forward_join_13;
    }
    if (!((((net.minecraft.client.Minecraft)(spill508_0)).K == null))) {
        break forward_join_12;
    }
    return;
    }
    forwardValue508_13_0 = com.moon.j3.a;
    }
    life4_21 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(forwardValue508_13_0)).W)).at)).b();
    moom.pz.a(((int)(life4_21)), ((boolean)(true)));
    moom.pz.a(((int)(life4_21)), ((boolean)(false)));
    moom.pz.a(((int)(life4_21)));
    return;
}


public double get_position_y() {
net.minecraft.client.entity.EntityPlayerSP forwardValue480_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill480_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 68163423768952L);
    life3_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill480_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 != 0))) {
        forwardValue480_15_0 = spill480_0;
        break forward_join_15;
    }
    if (!((spill480_0 == null))) {
        break forward_join_13;
    }
    return 0x0.0p0d;
    }
    forwardValue480_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue480_15_0)).o;
}


public void set_motion(com.moon.scripting.api.types.Vec3d p0) {
net.minecraft.client.entity.EntityPlayerSP forwardValue512_24_0;
    net.minecraft.client.entity.EntityPlayerSP spill512_0;
    long life2_3;
    int life4_5;
    forward_join_24: {
    forward_join_12: {
    life2_3 = (com.moon.j3.c ^ 66966732543419L);
    life4_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill512_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life4_5 != 0))) {
        forwardValue512_24_0 = spill512_0;
        break forward_join_24;
    }
    if (!((spill512_0 == null))) {
        break forward_join_12;
    }
    return;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.j3.a)).K)).t = ((double)(((com.moon.scripting.api.types.Vec3d)(p0)).x));
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.j3.a)).K)).u = ((double)(((com.moon.scripting.api.types.Vec3d)(p0)).y));
    forwardValue512_24_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue512_24_0)).v = ((double)(((com.moon.scripting.api.types.Vec3d)(p0)).z));
    return;
}


public void swing_item() {
net.minecraft.client.entity.EntityPlayerSP forwardValue523_14_0;
    net.minecraft.client.entity.EntityPlayerSP spill523_0;
    long life1_3;
    int life3_5;
    forward_join_14: {
    forward_join_12: {
    life1_3 = (com.moon.j3.c ^ 112350098028911L);
    life3_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill523_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 == 0))) {
        forwardValue523_14_0 = spill523_0;
        break forward_join_14;
    }
    if (!((spill523_0 == null))) {
        break forward_join_12;
    }
    return;
    }
    forwardValue523_14_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue523_14_0)).B__sourceReturn_da8c82d5d4();
    return;
}


public com.moon.scripting.api.types.Vec3d get_prev_position() {
long local1 = (com.moon.j3.c ^ 116220062045356L);
    if ((((net.minecraft.client.Minecraft)(com.moon.j3.a)).K == null)) {
        return null;
    }
    return new com.moon.scripting.api.types.Vec3d(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.j3.a)).K)).k, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.j3.a)).K)).l, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.j3.a)).K)).m);
}


public boolean is_in_water() {
net.minecraft.client.entity.EntityPlayerSP forwardValue495_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill495_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 49983282220661L);
    life3_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill495_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 == 0))) {
        forwardValue495_15_0 = spill495_0;
        break forward_join_15;
    }
    if (!((spill495_0 == null))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue495_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue495_15_0)).j__Boolean();
}


public boolean is_on_ladder() {
net.minecraft.client.entity.EntityPlayerSP forwardValue499_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill499_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 114032887030718L);
    life3_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill499_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 == 0))) {
        forwardValue499_15_0 = spill499_0;
        break forward_join_15;
    }
    if (!((spill499_0 == null))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue499_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue499_15_0)).I__Boolean();
}


public double get_motion_x() {
net.minecraft.client.entity.EntityPlayerSP forwardValue473_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill473_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 19426689755466L);
    life3_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill473_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 != 0))) {
        forwardValue473_15_0 = spill473_0;
        break forward_join_15;
    }
    if (!((spill473_0 == null))) {
        break forward_join_13;
    }
    return 0x0.0p0d;
    }
    forwardValue473_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue473_15_0)).t;
}


public com.moon.scripting.api.types.Vec2f get_input() {
long local1 = (com.moon.j3.c ^ 38807600526288L);
    if ((((net.minecraft.client.Minecraft)(com.moon.j3.a)).K == null)) {
        return null;
    }
    return new com.moon.scripting.api.types.Vec2f(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.j3.a)).K)).bk, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.j3.a)).K)).bj);
}


public boolean is_riding() {
net.minecraft.client.entity.EntityPlayerSP forwardValue500_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill500_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 138433112263893L);
    life3_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill500_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 == 0))) {
        forwardValue500_15_0 = spill500_0;
        break forward_join_15;
    }
    if (!((spill500_0 == null))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue500_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue500_15_0)).s__Boolean();
}


public void set_pitch(float p0) {
net.minecraft.client.entity.EntityPlayerSP forwardValue516_14_0;
    net.minecraft.client.entity.EntityPlayerSP spill516_0;
    long life2_3;
    int life4_5;
    forward_join_14: {
    forward_join_12: {
    life2_3 = (com.moon.j3.c ^ 58823091655625L);
    life4_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill516_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life4_5 == 0))) {
        forwardValue516_14_0 = spill516_0;
        break forward_join_14;
    }
    if (!((spill516_0 == null))) {
        break forward_join_12;
    }
    return;
    }
    forwardValue516_14_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue516_14_0)).x = ((float)(p0));
    return;
}


public com.moon.scripting.api.types.Vec3d get_position() {
long local1 = (com.moon.j3.c ^ 69655390530458L);
    if ((((net.minecraft.client.Minecraft)(com.moon.j3.a)).K == null)) {
        return null;
    }
    return new com.moon.scripting.api.types.Vec3d(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.j3.a)).K)).n, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.j3.a)).K)).o, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.j3.a)).K)).p);
}


public com.moon.scripting.api.types.RayCastResult get_mouse_over() { return __sourceHandlerCall_986ac0b912ad4bdac535(this); }


public boolean is_using_item() {
net.minecraft.client.entity.EntityPlayerSP forwardValue503_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill503_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 85316939459032L);
    life3_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill503_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 == 0))) {
        forwardValue503_15_0 = spill503_0;
        break forward_join_15;
    }
    if (!((spill503_0 == null))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue503_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue503_15_0)).M();
}


public void send_packet(int p0, java.lang.Object[] p1) { __sourceHandlerCall_f043c71eb2c3c6ecaf78(this, p0, p1); }


public float get_prev_yaw() {
net.minecraft.client.entity.EntityPlayerSP forwardValue486_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill486_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 31277490531551L);
    life3_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill486_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 != 0))) {
        forwardValue486_15_0 = spill486_0;
        break forward_join_15;
    }
    if (!((spill486_0 == null))) {
        break forward_join_13;
    }
    return 0x0.0p0f;
    }
    forwardValue486_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue486_15_0)).y;
}


public int get_hurt_time() {
net.minecraft.client.entity.EntityPlayerSP forwardValue470_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill470_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 83654892548297L);
    life3_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill470_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 == 0))) {
        forwardValue470_15_0 = spill470_0;
        break forward_join_15;
    }
    if (!((spill470_0 == null))) {
        break forward_join_13;
    }
    return 0;
    }
    forwardValue470_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue470_15_0)).aO;
}


public double get_position_x() {
net.minecraft.client.entity.EntityPlayerSP forwardValue479_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill479_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 86131900635198L);
    life3_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill479_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 != 0))) {
        forwardValue479_15_0 = spill479_0;
        break forward_join_15;
    }
    if (!((spill479_0 == null))) {
        break forward_join_13;
    }
    return 0x0.0p0d;
    }
    forwardValue479_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue479_15_0)).n;
}


public void set_speed(org.luaj.vm2.LuaTable p0, double p1) {
long life4_3;
    float life6_11;
    life4_3 = (com.moon.j3.c ^ 7543471349142L);
    if ((((net.minecraft.client.Minecraft)(com.moon.j3.a)).K == null)) {
        return;
    }
    life6_11 = com.moon.nJ.a__Float();
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)("x")), ((double)(((-java.lang.Math.sin(((double)(((double) life6_11))))) * p1))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)("z")), ((double)((java.lang.Math.cos(((double)(((double) life6_11)))) * p1))));
    return;
}


public boolean is_sprinting() {
net.minecraft.client.entity.EntityPlayerSP forwardValue502_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill502_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 77847000466462L);
    life3_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill502_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 != 0))) {
        forwardValue502_15_0 = spill502_0;
        break forward_join_15;
    }
    if (!((spill502_0 == null))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue502_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue502_15_0)).u__Boolean();
}


public double get_speed() {
long local1 = (com.moon.j3.c ^ 11226765915009L);
    if ((((net.minecraft.client.Minecraft)(com.moon.j3.a)).K == null)) {
        return 0x0.0p0d;
    }
    return com.moon.nJ.a();
}


public int get_held_item_slot() {
net.minecraft.client.entity.EntityPlayerSP forwardValue469_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill469_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 18695136445061L);
    life3_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill469_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 == 0))) {
        forwardValue469_15_0 = spill469_0;
        break forward_join_15;
    }
    if (!((spill469_0 == null))) {
        break forward_join_13;
    }
    return 0;
    }
    forwardValue469_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(forwardValue469_15_0)).bD)).c;
}


public int get_ticks_existed() {
net.minecraft.client.entity.EntityPlayerSP forwardValue487_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill487_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 36448318910810L);
    life3_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill487_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 == 0))) {
        forwardValue487_15_0 = spill487_0;
        break forward_join_15;
    }
    if (!((spill487_0 == null))) {
        break forward_join_13;
    }
    return 0;
    }
    forwardValue487_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue487_15_0)).S;
}


public void left_click() {
net.minecraft.client.Minecraft forwardValue505_13_0;
    net.minecraft.client.Minecraft spill505_0;
    long life1_3;
    int life3_5;
    int life4_21;
    forward_join_13: {
    forward_join_12: {
    life1_3 = (com.moon.j3.c ^ 63810415202572L);
    life3_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill505_0 = com.moon.j3.a;
    if (!((life3_5 != 0))) {
        forwardValue505_13_0 = spill505_0;
        break forward_join_13;
    }
    if (!((((net.minecraft.client.Minecraft)(spill505_0)).K == null))) {
        break forward_join_12;
    }
    return;
    }
    forwardValue505_13_0 = com.moon.j3.a;
    }
    life4_21 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(forwardValue505_13_0)).W)).av)).b();
    moom.pz.a(((int)(life4_21)), ((boolean)(true)));
    moom.pz.a(((int)(life4_21)));
    moom.pz.a(((int)(life4_21)), ((boolean)(false)));
    moom.pz.a(((int)(life4_21)));
    return;
}


public boolean is_moving() {
net.minecraft.client.entity.EntityPlayerSP forwardValue496_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill496_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 98342128040425L);
    life3_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill496_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 == 0))) {
        forwardValue496_15_0 = spill496_0;
        break forward_join_15;
    }
    if (!((spill496_0 == null))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue496_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue496_15_0)).ae();
}


public double get_absorption() {
net.minecraft.client.entity.EntityPlayerSP forwardValue463_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill463_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 63980123075074L);
    life3_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill463_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 != 0))) {
        forwardValue463_15_0 = spill463_0;
        break forward_join_15;
    }
    if (!((spill463_0 == null))) {
        break forward_join_13;
    }
    return 0x0.0p0d;
    }
    forwardValue463_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((double) ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue463_15_0)).j__sourceReturn_bc607678b6());
}


public float get_pitch() {
net.minecraft.client.entity.EntityPlayerSP forwardValue478_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill478_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 63907959678732L);
    life3_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill478_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 == 0))) {
        forwardValue478_15_0 = spill478_0;
        break forward_join_15;
    }
    if (!((spill478_0 == null))) {
        break forward_join_13;
    }
    return 0x0.0p0f;
    }
    forwardValue478_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue478_15_0)).x;
}


public com.moon.scripting.api.types.Vec3d get_motion() {
long local1 = (com.moon.j3.c ^ 38131845919738L);
    if ((((net.minecraft.client.Minecraft)(com.moon.j3.a)).K == null)) {
        return null;
    }
    return new com.moon.scripting.api.types.Vec3d(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.j3.a)).K)).t, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.j3.a)).K)).u, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.j3.a)).K)).v);
}


public void set_position(com.moon.scripting.api.types.Vec3d p0) {
net.minecraft.client.entity.EntityPlayerSP forwardValue517_14_0;
    net.minecraft.client.entity.EntityPlayerSP spill517_0;
    long life2_3;
    int life4_5;
    forward_join_14: {
    forward_join_12: {
    life2_3 = (com.moon.j3.c ^ 23403902179937L);
    life4_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill517_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life4_5 == 0))) {
        forwardValue517_14_0 = spill517_0;
        break forward_join_14;
    }
    if (!((spill517_0 == null))) {
        break forward_join_12;
    }
    return;
    }
    forwardValue517_14_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue517_14_0)).a__Void(((double)(((com.moon.scripting.api.types.Vec3d)(p0)).x)), ((double)(((com.moon.scripting.api.types.Vec3d)(p0)).y)), ((double)(((com.moon.scripting.api.types.Vec3d)(p0)).z)));
    return;
}


public void set_sneaking(boolean p0) {
net.minecraft.client.Minecraft forwardValue519_12_0;
    net.minecraft.client.Minecraft spill519_0;
    long life2_3;
    int life4_5;
    int life5_21;
    forward_join_19: {
    forward_join_12: {
    life2_3 = (com.moon.j3.c ^ 38583950538116L);
    life4_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill519_0 = com.moon.j3.a;
    if (!((life4_5 != 0))) {
        forwardValue519_12_0 = spill519_0;
        break forward_join_12;
    }
    if (!((((net.minecraft.client.Minecraft)(spill519_0)).P == null))) {
        break forward_join_19;
    }
    forwardValue519_12_0 = com.moon.j3.a;
    }
    life5_21 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(forwardValue519_12_0)).W)).aq)).b();
    moom.pz.a(((int)(life5_21)), ((boolean)(p0)));
    }
    return;
}


public boolean is_burning() {
net.minecraft.client.entity.EntityPlayerSP forwardValue491_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill491_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 109926137651159L);
    life3_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill491_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 != 0))) {
        forwardValue491_15_0 = spill491_0;
        break forward_join_15;
    }
    if (!((spill491_0 == null))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue491_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue491_15_0)).r__Boolean();
}


public com.moon.scripting.api.enums.Facing get_facing() {
long local1 = (com.moon.j3.c ^ 140382421385591L);
    if ((((net.minecraft.client.Minecraft)(com.moon.j3.a)).K == null)) {
        return com.moon.scripting.api.enums.Facing.UP;
    }
    return (com.moon.scripting.api.enums.Facing.values())[((moom.bs)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.j3.a)).K)).b__bs())).ordinal()];
}


public com.moon.scripting.api.types.Vec2f rotations_to(com.moon.scripting.api.types.Vec3d p0) {
long local2 = (com.moon.j3.c ^ 133554017642931L);
    if ((((net.minecraft.client.Minecraft)(com.moon.j3.a)).K == null)) {
        return null;
    }
    com.moon.pw local4 = new com.moon.pw(((float) ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.j3.a)).K)).n), (((float) ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.j3.a)).K)).o) + ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.j3.a)).K)).e__Float()), ((float) ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.j3.a)).K)).p));
    ((java.io.PrintStream)(java.lang.System.out)).println(((double)(((com.moon.scripting.api.types.Vec3d)(p0)).x)));
    com.moon.pw local5 = ((com.moon.pw)(new com.moon.pw(((float) ((com.moon.scripting.api.types.Vec3d)(p0)).x), ((float) ((com.moon.scripting.api.types.Vec3d)(p0)).y), ((float) ((com.moon.scripting.api.types.Vec3d)(p0)).z)))).b(((com.moon.pw)(local4)));
    float local6 = moom.Dr.c(((float)(((((com.moon.pw)(local5)).p() * ((com.moon.pw)(local5)).p()) + (((com.moon.pw)(local5)).r() * ((com.moon.pw)(local5)).r())))));
    float local7 = ((moom.Dr.a(((float)(((com.moon.pw)(local5)).r())), ((float)(((com.moon.pw)(local5)).p()))) * com.moon.nI.f) - 0x1.68p6f);
    float local8 = ((-moom.Dr.a(((float)(((com.moon.pw)(local5)).q())), ((float)(local6)))) * com.moon.nI.f);
    return new com.moon.scripting.api.types.Vec2f(local7, moom.Dr.a(((float)(local8)), ((float)(-0x1.68p6f)), ((float)(0x1.68p6f))));
}


public float get_prev_pitch() {
net.minecraft.client.entity.EntityPlayerSP forwardValue482_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill482_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 90721257604072L);
    life3_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill482_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 == 0))) {
        forwardValue482_15_0 = spill482_0;
        break forward_join_15;
    }
    if (!((spill482_0 == null))) {
        break forward_join_13;
    }
    return 0x0.0p0f;
    }
    forwardValue482_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue482_15_0)).z;
}


public boolean is_in_cobweb() {
net.minecraft.client.entity.EntityPlayerSP forwardValue493_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill493_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 112566355254051L);
    life3_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill493_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 != 0))) {
        forwardValue493_15_0 = spill493_0;
        break forward_join_15;
    }
    if (!((spill493_0 == null))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue493_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue493_15_0)).F();
}


public java.lang.String get_name() {
net.minecraft.client.entity.EntityPlayerSP forwardValue477_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill477_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 46961864762383L);
    life3_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill477_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 == 0))) {
        forwardValue477_15_0 = spill477_0;
        break forward_join_15;
    }
    if (!((spill477_0 == null))) {
        break forward_join_13;
    }
    return null;
    }
    forwardValue477_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue477_15_0)).a__String();
}


public void set_yaw(float p0) {
net.minecraft.client.entity.EntityPlayerSP forwardValue522_14_0;
    net.minecraft.client.entity.EntityPlayerSP spill522_0;
    long life2_3;
    int life4_5;
    forward_join_14: {
    forward_join_12: {
    life2_3 = (com.moon.j3.c ^ 6161569609966L);
    life4_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill522_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life4_5 == 0))) {
        forwardValue522_14_0 = spill522_0;
        break forward_join_14;
    }
    if (!((spill522_0 == null))) {
        break forward_join_12;
    }
    return;
    }
    forwardValue522_14_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue522_14_0)).w = ((float)(p0));
    return;
}


public com.moon.scripting.api.types.Potion get_effect(int p0) {
java.lang.Object forwardValue465_19_0;
    net.minecraft.client.entity.EntityPlayerSP spill465_0;
    long life2_3;
    int life4_5;
    net.minecraft.potion.PotionEffect life5_25;
    net.minecraft.potion.Potion life6_36;
    com.moon.scripting.api.types.Potion life7_40;
    forward_join_25: {
    forward_join_19: {
    forward_join_13: {
    life2_3 = (com.moon.j3.c ^ 69999657228385L);
    life4_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill465_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life4_5 != 0))) {
        forwardValue465_19_0 = spill465_0;
        break forward_join_19;
    }
    if (!((spill465_0 == null))) {
        break forward_join_13;
    }
    return null;
    }
    forwardValue465_19_0 = ((java.util.Map)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.j3.a)).K)).a__Map())).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0))))));
    }
    life5_25 = ((net.minecraft.potion.PotionEffect)(forwardValue465_19_0));
    if (!((life5_25 == null))) {
        break forward_join_25;
    }
    return null;
    }
    life6_36 = (net.minecraft.potion.Potion.a)[((net.minecraft.potion.PotionEffect)(life5_25)).a()];
    life7_40 = new com.moon.scripting.api.types.Potion();
    ((com.moon.scripting.api.types.Potion)(life7_40)).id = ((int)(((net.minecraft.potion.PotionEffect)(life5_25)).a()));
    ((com.moon.scripting.api.types.Potion)(life7_40)).amplifier = ((int)(((net.minecraft.potion.PotionEffect)(life5_25)).c()));
    ((com.moon.scripting.api.types.Potion)(life7_40)).duration = ((int)(((net.minecraft.potion.PotionEffect)(life5_25)).b()));
    ((com.moon.scripting.api.types.Potion)(life7_40)).color = ((int)(((net.minecraft.potion.Potion)(life6_36)).c()));
    ((com.moon.scripting.api.types.Potion)(life7_40)).name = ((java.lang.String)(((net.minecraft.potion.Potion)(life6_36)).a__String()));
    ((com.moon.scripting.api.types.Potion)(life7_40)).bad_effect = ((boolean)(((net.minecraft.potion.Potion)(life6_36)).c__Boolean()));
    return life7_40;
}


public double get_position_z() {
net.minecraft.client.entity.EntityPlayerSP forwardValue481_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill481_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 3752301711326L);
    life3_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill481_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 == 0))) {
        forwardValue481_15_0 = spill481_0;
        break forward_join_15;
    }
    if (!((spill481_0 == null))) {
        break forward_join_13;
    }
    return 0x0.0p0d;
    }
    forwardValue481_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue481_15_0)).p;
}


public int get_id() {
net.minecraft.client.entity.EntityPlayerSP forwardValue471_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill471_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 1538009970224L);
    life3_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill471_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 != 0))) {
        forwardValue471_15_0 = spill471_0;
        break forward_join_15;
    }
    if (!((spill471_0 == null))) {
        break forward_join_13;
    }
    return 0;
    }
    forwardValue471_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue471_15_0)).e__Int();
}


public double get_max_health() {
net.minecraft.client.entity.EntityPlayerSP forwardValue472_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill472_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 119419289166359L);
    life3_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill472_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 != 0))) {
        forwardValue472_15_0 = spill472_0;
        break forward_join_15;
    }
    if (!((spill472_0 == null))) {
        break forward_join_13;
    }
    return 0x0.0p0d;
    }
    forwardValue472_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((double) ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue472_15_0)).a());
}


public boolean is_on_ground() {
net.minecraft.client.entity.EntityPlayerSP forwardValue498_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill498_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 77854516658398L);
    life3_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill498_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 != 0))) {
        forwardValue498_15_0 = spill498_0;
        break forward_join_15;
    }
    if (!((spill498_0 == null))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue498_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue498_15_0)).A;
}


public void set_motion_speed(double p0) {
long local3 = (com.moon.j3.c ^ 57719928330494L);
    int local5 = __sourceIntrinsic_booleanToInteger(com.moon.j2.b());
    if ((local5 != 0)) {
        if ((((net.minecraft.client.Minecraft)(com.moon.j3.a)).K == null)) {
        return;
    }
        com.moon.nJ.a__Void(((double)(p0)));
    }
    return;
}


public double get_food_amount() {
net.minecraft.client.entity.EntityPlayerSP forwardValue467_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill467_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 58180805659341L);
    life3_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill467_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 != 0))) {
        forwardValue467_15_0 = spill467_0;
        break forward_join_15;
    }
    if (!((spill467_0 == null))) {
        break forward_join_13;
    }
    return 0x0.0p0d;
    }
    forwardValue467_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((double) ((net.minecraft.util.FoodStats)(((net.minecraft.client.entity.EntityPlayerSP)(forwardValue467_15_0)).a__C2())).a__Int());
}


public boolean is_in_lava() {
net.minecraft.client.entity.EntityPlayerSP forwardValue494_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill494_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 93242061345599L);
    life3_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill494_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 == 0))) {
        forwardValue494_15_0 = spill494_0;
        break forward_join_15;
    }
    if (!((spill494_0 == null))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue494_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue494_15_0)).l__Boolean();
}


public double distance_to(float p0, float p1, float p2) {
net.minecraft.client.entity.EntityPlayerSP forwardValue460_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill460_0;
    long life4_3;
    int life6_5;
    forward_join_15: {
    forward_join_13: {
    life4_3 = (com.moon.j3.c ^ 35376755730952L);
    life6_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill460_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life6_5 == 0))) {
        forwardValue460_15_0 = spill460_0;
        break forward_join_15;
    }
    if (!((spill460_0 == null))) {
        break forward_join_13;
    }
    return 0x0.0p0d;
    }
    forwardValue460_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue460_15_0)).a(((double)(((double) p0))), ((double)(((double) p1))), ((double)(((double) p2))));
}


public com.moon.scripting.api.types.Potion[] get_active_effects() {
net.minecraft.client.entity.EntityPlayerSP lexicalValue99_16_0;
    com.moon.scripting.api.types.Potion[] lexicalValue99_48_0;
    net.minecraft.client.entity.EntityPlayerSP spill99_0;
    com.moon.scripting.api.types.Potion[] spill99_1;
    long life1_3;
    int life3_5;
    java.util.Map life4_22;
    com.moon.scripting.api.types.Potion[] life5_26;
    int life6_28;
    java.util.Iterator life7_32;
    java.lang.Integer life8_39;
    lexical_join_48: {
    lexical_join_47: {
    lexical_join_16: {
    lexical_join_14: {
    life1_3 = (com.moon.j3.c ^ 93615656651873L);
    life3_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill99_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 != 0))) {
        lexicalValue99_16_0 = spill99_0;
        break lexical_join_16;
    }
    if (!((spill99_0 == null))) {
        break lexical_join_14;
    }
    return new com.moon.scripting.api.types.Potion[0];
    }
    lexicalValue99_16_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    life4_22 = ((net.minecraft.client.entity.EntityPlayerSP)(lexicalValue99_16_0)).a__Map();
    life5_26 = new com.moon.scripting.api.types.Potion[((java.util.Map)(life4_22)).size()];
    life6_28 = 0;
    life7_32 = ((java.util.Set)(((java.util.Map)(life4_22)).keySet())).iterator();
    lexical_cycle_28: while (true) {
    if (!(((java.util.Iterator)(life7_32)).hasNext())) {
        break lexical_join_47;
    }
    life8_39 = ((java.lang.Integer)(((java.util.Iterator)(life7_32)).next()));
    spill99_1 = life5_26;
    if (!((life3_5 != 0))) {
        lexicalValue99_48_0 = spill99_1;
        break lexical_join_48;
    }
    (spill99_1)[life6_28] = ((com.moon.j3)(this)).get_effect(((int)(((java.lang.Integer)(life8_39)).intValue())));
    life6_28 += 1;
    if (!((life3_5 == 0))) { continue lexical_cycle_28; }
    break lexical_cycle_28;
    }
    }
    lexicalValue99_48_0 = life5_26;
    }
    return lexicalValue99_48_0;
}


public void set_motion_z(double p0) {
net.minecraft.client.entity.EntityPlayerSP forwardValue515_14_0;
    net.minecraft.client.entity.EntityPlayerSP spill515_0;
    long life3_3;
    int life5_5;
    forward_join_14: {
    forward_join_12: {
    life3_3 = (com.moon.j3.c ^ 109479833227737L);
    life5_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill515_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life5_5 == 0))) {
        forwardValue515_14_0 = spill515_0;
        break forward_join_14;
    }
    if (!((spill515_0 == null))) {
        break forward_join_12;
    }
    return;
    }
    forwardValue515_14_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue515_14_0)).v = ((double)(p0));
    return;
}


public double get_motion_y() {
net.minecraft.client.entity.EntityPlayerSP forwardValue474_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill474_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.j3.c ^ 61890945527160L);
    life3_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill474_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 == 0))) {
        forwardValue474_15_0 = spill474_0;
        break forward_join_15;
    }
    if (!((spill474_0 == null))) {
        break forward_join_13;
    }
    return 0x0.0p0d;
    }
    forwardValue474_15_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    return ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue474_15_0)).u;
}


public void set_sprinting(boolean p0) {
net.minecraft.client.entity.EntityPlayerSP forwardValue521_14_0;
    net.minecraft.client.entity.EntityPlayerSP spill521_0;
    long life2_3;
    int life4_5;
    forward_join_14: {
    forward_join_12: {
    life2_3 = (com.moon.j3.c ^ 79765325747380L);
    life4_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill521_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life4_5 != 0))) {
        forwardValue521_14_0 = spill521_0;
        break forward_join_14;
    }
    if (!((spill521_0 == null))) {
        break forward_join_12;
    }
    return;
    }
    forwardValue521_14_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue521_14_0)).c(((boolean)(p0)));
    return;
}


public boolean has_effect(int p0) {
java.lang.Object forwardValue489_19_0;
    int forwardValue489_23_0;
    net.minecraft.client.entity.EntityPlayerSP spill489_0;
    long life2_3;
    int life4_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_19: {
    forward_join_13: {
    life2_3 = (com.moon.j3.c ^ 39644897396145L);
    life4_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill489_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life4_5 == 0))) {
        forwardValue489_19_0 = spill489_0;
        break forward_join_19;
    }
    if (!((spill489_0 == null))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue489_19_0 = ((java.util.Map)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.j3.a)).K)).a__Map())).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0))))));
    }
    if (!((forwardValue489_19_0 != null))) {
        break forward_join_22;
    }
    forwardValue489_23_0 = 1;
    break forward_join_23;
    }
    forwardValue489_23_0 = 0;
    }
    return ((forwardValue489_23_0) != 0);
}


public void use_item() {
net.minecraft.client.entity.EntityPlayerSP forwardValue524_14_0;
    net.minecraft.client.Minecraft forwardValue524_31_0;
    net.minecraft.client.entity.EntityPlayerSP spill524_0;
    net.minecraft.client.Minecraft spill524_1;
    long life1_3;
    int life3_5;
    net.minecraft.item.ItemStack life4_19;
    forward_join_34: {
    forward_join_31: {
    forward_join_14: {
    forward_join_12: {
    life1_3 = (com.moon.j3.c ^ 52010360305070L);
    life3_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill524_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    if (!((life3_5 == 0))) {
        forwardValue524_14_0 = spill524_0;
        break forward_join_14;
    }
    if (!((spill524_0 == null))) {
        break forward_join_12;
    }
    return;
    }
    forwardValue524_14_0 = ((net.minecraft.client.Minecraft)(com.moon.j3.a)).K;
    }
    life4_19 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(forwardValue524_14_0)).bD)).a__xW();
    if (!((life4_19 != null))) {
        break forward_join_34;
    }
    spill524_1 = com.moon.j3.a;
    if (!((life3_5 == 0))) {
        forwardValue524_31_0 = spill524_1;
        break forward_join_31;
    }
    if (!(((moom.jI)(((net.minecraft.client.Minecraft)(spill524_1)).F)).a(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(com.moon.j3.a)).K)), ((net.minecraft.world.World)(((net.minecraft.client.Minecraft)(com.moon.j3.a)).I)), ((net.minecraft.item.ItemStack)(life4_19))))) {
        break forward_join_34;
    }
    forwardValue524_31_0 = com.moon.j3.a;
    }
    ((moom.lm)(((net.minecraft.client.renderer.EntityRenderer)(((net.minecraft.client.Minecraft)(forwardValue524_31_0)).R)).z)).d();
    }
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fd0ba049c90e_originalDynamicSite52_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fd0ba049c90e_originalDynamicSite52_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fd0ba049c90e_originalDynamicSite52_13(java.lang.String a0, int a1, java.lang.String a2, int a3, java.lang.String a4) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1744_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1743_0() throws E;

private static native int __sourceIntrinsic_booleanToInteger(boolean value);
}
