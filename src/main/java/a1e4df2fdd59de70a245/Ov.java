package moom;


class Ov extends java.lang.Thread {

net.minecraft.server.network.NetHandlerLoginServer a;

private static long b;

private static long c;

Ov(net.minecraft.server.network.NetHandlerLoginServer p0, java.lang.String p1) { super((java.lang.String)null); }

private static void __sourceConstructorBody_02544927bbe86908(moom.Ov receiver, net.minecraft.server.network.NetHandlerLoginServer p0, java.lang.String p1) throws Throwable {
((moom.Ov)(receiver)).a = ((net.minecraft.server.network.NetHandlerLoginServer)(p0));
    moom.Ov.__sourceConstructorInit_02544927bbe86908_0(((moom.Ov)(receiver)), ((java.lang.String)(p1)));
    return;
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(-4336079661336629955L)), ((long)(1908880207516256669L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(127423931371832L)))));
    long local0_life6 = (moom.Ov.b ^ 24900609778091L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill754_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill754_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill754_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill754_13 = new byte[8];
    (__sourceSpill754_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill754_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation754_15 = __sourceSpill754_13;
    ((javax.crypto.Cipher)(__sourceSpill754_10)).init(((int)(__sourceSpill754_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill754_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation754_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 6098213270413784794L;
    byte[] __sourceSpill754_19 = new byte[8];
    (__sourceSpill754_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill754_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill754_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill754_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill754_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill754_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill754_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill754_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill754_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill754_20)).doFinal(((byte[])(__sourceSpill754_19)));
    c = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_02544927bbe86908_0(moom.Ov a0, java.lang.String a1) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_4e8c357b92a8f423c367(moom.Ov a0) throws E;
private static final class __SourceHandler_4e8c357b92a8f423c367 {

public static void f385(moom.Ov receiver) throws Throwable {
    net.minecraft.server.network.NetHandlerLoginServer forestValue385_71_0;
    net.minecraft.server.network.NetHandlerLoginServer forestValue385_94_0;
    int[] spill385_0;
    java.math.BigInteger spill385_1;
    java.math.BigInteger spill385_2;
    net.minecraft.server.network.NetHandlerLoginServer spill385_3;
    com.mojang.authlib.minecraft.MinecraftSessionService spill385_4;
    com.mojang.authlib.GameProfile spill385_5;
    net.minecraft.server.network.NetHandlerLoginServer spill385_6;
    long life1_3;
    com.mojang.authlib.GameProfile life4_8;
    int[] life3_9;
    java.lang.String life5_30;
    forest_join_103: {
    forest_join_94: {
    forest_join_92: {
    forest_join_71: {
    forest_join_69: {
    life1_3 = (__fieldRead385_0() ^ 77746415344803L);
    spill385_0 = __call385_1();
    life4_8 = __fieldRead385_3(__fieldRead385_2(receiver));
    life3_9 = spill385_0;
    java.math.BigInteger __stackOp385_5_0 = __sourceUninitializedNEW385_4();
    spill385_1 = __stackOp385_5_0;
    spill385_2 = __stackOp385_5_0;
    __call385_7(__fieldRead385_6(receiver));
    __explicitNewInit385_15(spill385_2, __call385_14("", __call385_11(__call385_10(__fieldRead385_9(__fieldRead385_8(receiver)))), __fieldRead385_13(__fieldRead385_12(receiver))));
    life5_30 = __call385_17(spill385_1, ((int) __fieldRead385_16()));
    spill385_3 = __fieldRead385_18(receiver);
    spill385_4 = __call385_21(__fieldRead385_20(__fieldRead385_19(receiver)));
    com.mojang.authlib.GameProfile __stackOp385_23_0 = __sourceUninitializedNEW385_22();
    spill385_5 = __stackOp385_23_0;
    __explicitNewInit385_25(__stackOp385_23_0, null, __call385_24(life4_8));
    __fieldWrite385_27(spill385_3, __call385_26(spill385_4, spill385_5, life5_30));
    spill385_6 = __fieldRead385_28(receiver);
    if (!((life3_9 != null))) {
        forestValue385_71_0 = spill385_6;
        break forest_join_71;
    }
    if (!((__fieldRead385_29(spill385_6) != null))) {
        break forest_join_69;
    }
    __call385_38(__fieldRead385_30(), __invokedynamic385_37(__call385_33(__fieldRead385_32(__fieldRead385_31(receiver))), __call385_36(__fieldRead385_35(__fieldRead385_34(receiver)))));
    __fieldWrite385_41(__fieldRead385_39(receiver), __fieldRead385_40());
    if (!((life3_9 == null))) {
        break forest_join_103;
    }
    }
    forestValue385_71_0 = __fieldRead385_42(receiver);
    }
    if (!((life3_9 != null))) {
        forestValue385_94_0 = forestValue385_71_0;
        break forest_join_94;
    }
    if (!(__call385_44(__fieldRead385_43(forestValue385_71_0)))) {
        break forest_join_92;
    }
    __call385_46(__fieldRead385_45(), "Failed to verify username but will let them in anyway!");
    __fieldWrite385_50(__fieldRead385_47(receiver), __call385_49(__fieldRead385_48(receiver), life4_8));
    __fieldWrite385_53(__fieldRead385_51(receiver), __fieldRead385_52());
    if (!((life3_9 == null))) {
        break forest_join_103;
    }
    }
    forestValue385_94_0 = __fieldRead385_54(receiver);
    }
    __call385_55(forestValue385_94_0, "Failed to verify username!");
    __call385_61(__fieldRead385_56(), __invokedynamic385_60(__call385_59(__fieldRead385_58(__fieldRead385_57(receiver)))));
    }
    return;
}
public static void h385_0(com.mojang.authlib.exceptions.AuthenticationUnavailableException p0) throws Throwable {
    throw __call3038500_0(p0);
}
public static void h385_1(com.mojang.authlib.exceptions.AuthenticationUnavailableException p0) throws Throwable {
    throw __call3038501_0(p0);
}
public static void h385_2(com.mojang.authlib.exceptions.AuthenticationUnavailableException p0) throws Throwable {
    throw __call3038502_0(p0);
}
public static void h385_3(com.mojang.authlib.exceptions.AuthenticationUnavailableException p0) throws Throwable {
    throw __call3038503_0(p0);
}
public static void h385_4(com.mojang.authlib.exceptions.AuthenticationUnavailableException p0) throws Throwable {
    throw __call3038504_0(p0);
}
public static void h385_5(com.mojang.authlib.exceptions.AuthenticationUnavailableException p0) throws Throwable {
    throw __call3038505_0(p0);
}
public static void h385_6(com.mojang.authlib.exceptions.AuthenticationUnavailableException p0, moom.Ov p1, int[] p2, com.mojang.authlib.GameProfile p3) throws Throwable {
    net.minecraft.server.network.NetHandlerLoginServer forestValue3038506_27_0;
    net.minecraft.server.network.NetHandlerLoginServer spill3038506_0;
    com.mojang.authlib.exceptions.AuthenticationUnavailableException life4_2;
    forest_join_32: {
    forest_join_27: {
    forest_join_25: {
    life4_2 = p0;
    spill3038506_0 = __fieldRead3038506_0(p1);
    if (!((p2 != null))) {
        forestValue3038506_27_0 = spill3038506_0;
        break forest_join_27;
    }
    if (!(__call3038506_2(__fieldRead3038506_1(spill3038506_0)))) {
        break forest_join_25;
    }
    __call3038506_4(__fieldRead3038506_3(), "Authentication servers are down but will let them in anyway!");
    __fieldWrite3038506_8(__fieldRead3038506_5(p1), __call3038506_7(__fieldRead3038506_6(p1), p3));
    __fieldWrite3038506_11(__fieldRead3038506_9(p1), __fieldRead3038506_10());
    if (!((p2 == null))) {
        break forest_join_32;
    }
    }
    forestValue3038506_27_0 = __fieldRead3038506_12(p1);
    }
    __call3038506_13(forestValue3038506_27_0, "Authentication servers are down. Please try again later, sorry!");
    __call3038506_15(__fieldRead3038506_14(), "Couldn't verify username because servers are unavailable");
    }
    return;
}
public static void h385_7(com.mojang.authlib.exceptions.AuthenticationUnavailableException p0) throws Throwable {
    throw __call3038507_0(p0);
}
public static void h385_8(com.mojang.authlib.exceptions.AuthenticationUnavailableException p0) throws Throwable {
    throw __call3038508_0(p0);
}
public static void h385_9(com.mojang.authlib.exceptions.AuthenticationUnavailableException p0) throws Throwable {
    throw __call3038509_0(p0);
}
private static native long __fieldRead385_0() throws Throwable;
private static native int[] __call385_1() throws Throwable;
private static native net.minecraft.server.network.NetHandlerLoginServer __fieldRead385_2(moom.Ov a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __fieldRead385_3(net.minecraft.server.network.NetHandlerLoginServer a0) throws Throwable;
private static native java.math.BigInteger __sourceUninitializedNEW385_4() throws Throwable;
private static native net.minecraft.server.network.NetHandlerLoginServer __fieldRead385_6(moom.Ov a0) throws Throwable;
private static native java.lang.Object __call385_7(net.minecraft.server.network.NetHandlerLoginServer a0) throws Throwable;
private static native net.minecraft.server.network.NetHandlerLoginServer __fieldRead385_8(moom.Ov a0) throws Throwable;
private static native moom.Bl __fieldRead385_9(net.minecraft.server.network.NetHandlerLoginServer a0) throws Throwable;
private static native java.security.KeyPair __call385_10(moom.Bl a0) throws Throwable;
private static native java.security.PublicKey __call385_11(java.security.KeyPair a0) throws Throwable;
private static native net.minecraft.server.network.NetHandlerLoginServer __fieldRead385_12(moom.Ov a0) throws Throwable;
private static native javax.crypto.SecretKey __fieldRead385_13(net.minecraft.server.network.NetHandlerLoginServer a0) throws Throwable;
private static native byte[] __call385_14(java.lang.String a0, java.security.PublicKey a1, javax.crypto.SecretKey a2) throws Throwable;
private static native void __explicitNewInit385_15(java.math.BigInteger a0, byte[] a1) throws Throwable;
private static native long __fieldRead385_16() throws Throwable;
private static native java.lang.String __call385_17(java.math.BigInteger a0, int a1) throws Throwable;
private static native net.minecraft.server.network.NetHandlerLoginServer __fieldRead385_18(moom.Ov a0) throws Throwable;
private static native net.minecraft.server.network.NetHandlerLoginServer __fieldRead385_19(moom.Ov a0) throws Throwable;
private static native moom.Bl __fieldRead385_20(net.minecraft.server.network.NetHandlerLoginServer a0) throws Throwable;
private static native com.mojang.authlib.minecraft.MinecraftSessionService __call385_21(moom.Bl a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __sourceUninitializedNEW385_22() throws Throwable;
private static native java.lang.String __call385_24(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native void __explicitNewInit385_25(com.mojang.authlib.GameProfile a0, java.util.UUID a1, java.lang.String a2) throws Throwable;
private static native com.mojang.authlib.GameProfile __call385_26(com.mojang.authlib.minecraft.MinecraftSessionService a0, com.mojang.authlib.GameProfile a1, java.lang.String a2) throws Throwable;
private static native void __fieldWrite385_27(net.minecraft.server.network.NetHandlerLoginServer a0, com.mojang.authlib.GameProfile a1) throws Throwable;
private static native net.minecraft.server.network.NetHandlerLoginServer __fieldRead385_28(moom.Ov a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __fieldRead385_29(net.minecraft.server.network.NetHandlerLoginServer a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead385_30() throws Throwable;
private static native net.minecraft.server.network.NetHandlerLoginServer __fieldRead385_31(moom.Ov a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __fieldRead385_32(net.minecraft.server.network.NetHandlerLoginServer a0) throws Throwable;
private static native java.lang.String __call385_33(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native net.minecraft.server.network.NetHandlerLoginServer __fieldRead385_34(moom.Ov a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __fieldRead385_35(net.minecraft.server.network.NetHandlerLoginServer a0) throws Throwable;
private static native java.util.UUID __call385_36(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native java.lang.String __invokedynamic385_37(java.lang.String a0, java.util.UUID a1) throws Throwable;
private static native void __call385_38(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.server.network.NetHandlerLoginServer __fieldRead385_39(moom.Ov a0) throws Throwable;
private static native net.minecraft.server.network.NetHandlerLoginServer$LoginState __fieldRead385_40() throws Throwable;
private static native void __fieldWrite385_41(net.minecraft.server.network.NetHandlerLoginServer a0, net.minecraft.server.network.NetHandlerLoginServer$LoginState a1) throws Throwable;
private static native net.minecraft.server.network.NetHandlerLoginServer __fieldRead385_42(moom.Ov a0) throws Throwable;
private static native moom.Bl __fieldRead385_43(net.minecraft.server.network.NetHandlerLoginServer a0) throws Throwable;
private static native boolean __call385_44(moom.Bl a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead385_45() throws Throwable;
private static native void __call385_46(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.server.network.NetHandlerLoginServer __fieldRead385_47(moom.Ov a0) throws Throwable;
private static native net.minecraft.server.network.NetHandlerLoginServer __fieldRead385_48(moom.Ov a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call385_49(net.minecraft.server.network.NetHandlerLoginServer a0, com.mojang.authlib.GameProfile a1) throws Throwable;
private static native void __fieldWrite385_50(net.minecraft.server.network.NetHandlerLoginServer a0, com.mojang.authlib.GameProfile a1) throws Throwable;
private static native net.minecraft.server.network.NetHandlerLoginServer __fieldRead385_51(moom.Ov a0) throws Throwable;
private static native net.minecraft.server.network.NetHandlerLoginServer$LoginState __fieldRead385_52() throws Throwable;
private static native void __fieldWrite385_53(net.minecraft.server.network.NetHandlerLoginServer a0, net.minecraft.server.network.NetHandlerLoginServer$LoginState a1) throws Throwable;
private static native net.minecraft.server.network.NetHandlerLoginServer __fieldRead385_54(moom.Ov a0) throws Throwable;
private static native void __call385_55(net.minecraft.server.network.NetHandlerLoginServer a0, java.lang.String a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead385_56() throws Throwable;
private static native net.minecraft.server.network.NetHandlerLoginServer __fieldRead385_57(moom.Ov a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __fieldRead385_58(net.minecraft.server.network.NetHandlerLoginServer a0) throws Throwable;
private static native java.lang.String __call385_59(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native java.lang.String __invokedynamic385_60(java.lang.String a0) throws Throwable;
private static native void __call385_61(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native com.mojang.authlib.exceptions.AuthenticationUnavailableException __call3038500_0(com.mojang.authlib.exceptions.AuthenticationUnavailableException a0) throws Throwable;
private static native com.mojang.authlib.exceptions.AuthenticationUnavailableException __call3038501_0(com.mojang.authlib.exceptions.AuthenticationUnavailableException a0) throws Throwable;
private static native com.mojang.authlib.exceptions.AuthenticationUnavailableException __call3038502_0(com.mojang.authlib.exceptions.AuthenticationUnavailableException a0) throws Throwable;
private static native com.mojang.authlib.exceptions.AuthenticationUnavailableException __call3038503_0(com.mojang.authlib.exceptions.AuthenticationUnavailableException a0) throws Throwable;
private static native com.mojang.authlib.exceptions.AuthenticationUnavailableException __call3038504_0(com.mojang.authlib.exceptions.AuthenticationUnavailableException a0) throws Throwable;
private static native com.mojang.authlib.exceptions.AuthenticationUnavailableException __call3038505_0(com.mojang.authlib.exceptions.AuthenticationUnavailableException a0) throws Throwable;
private static native net.minecraft.server.network.NetHandlerLoginServer __fieldRead3038506_0(moom.Ov a0) throws Throwable;
private static native moom.Bl __fieldRead3038506_1(net.minecraft.server.network.NetHandlerLoginServer a0) throws Throwable;
private static native boolean __call3038506_2(moom.Bl a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3038506_3() throws Throwable;
private static native void __call3038506_4(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.server.network.NetHandlerLoginServer __fieldRead3038506_5(moom.Ov a0) throws Throwable;
private static native net.minecraft.server.network.NetHandlerLoginServer __fieldRead3038506_6(moom.Ov a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call3038506_7(net.minecraft.server.network.NetHandlerLoginServer a0, com.mojang.authlib.GameProfile a1) throws Throwable;
private static native void __fieldWrite3038506_8(net.minecraft.server.network.NetHandlerLoginServer a0, com.mojang.authlib.GameProfile a1) throws Throwable;
private static native net.minecraft.server.network.NetHandlerLoginServer __fieldRead3038506_9(moom.Ov a0) throws Throwable;
private static native net.minecraft.server.network.NetHandlerLoginServer$LoginState __fieldRead3038506_10() throws Throwable;
private static native void __fieldWrite3038506_11(net.minecraft.server.network.NetHandlerLoginServer a0, net.minecraft.server.network.NetHandlerLoginServer$LoginState a1) throws Throwable;
private static native net.minecraft.server.network.NetHandlerLoginServer __fieldRead3038506_12(moom.Ov a0) throws Throwable;
private static native void __call3038506_13(net.minecraft.server.network.NetHandlerLoginServer a0, java.lang.String a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3038506_14() throws Throwable;
private static native void __call3038506_15(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native com.mojang.authlib.exceptions.AuthenticationUnavailableException __call3038507_0(com.mojang.authlib.exceptions.AuthenticationUnavailableException a0) throws Throwable;
private static native com.mojang.authlib.exceptions.AuthenticationUnavailableException __call3038508_0(com.mojang.authlib.exceptions.AuthenticationUnavailableException a0) throws Throwable;
private static native com.mojang.authlib.exceptions.AuthenticationUnavailableException __call3038509_0(com.mojang.authlib.exceptions.AuthenticationUnavailableException a0) throws Throwable;

}


public void run() { __sourceHandlerCall_4e8c357b92a8f423c367(this); }


private static com.mojang.authlib.exceptions.AuthenticationUnavailableException a(com.mojang.authlib.exceptions.AuthenticationUnavailableException p0) {
return p0;
}

}
