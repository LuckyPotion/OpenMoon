package moom;

import io.netty.buffer.ByteBuf;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Ax implements moom.yK<moom.y2> {

private java.lang.String a;

private java.lang.String b;

private java.lang.String c;

private java.lang.String d;

private java.lang.String e;

private int f;

private java.util.Collection<java.lang.String> g;

private int h;

private int i;

private static long j;

private static long[] k;

private static java.lang.Integer[] l;

private static java.util.Map m;

public Ax(moom.Bk p0, java.util.Collection<java.lang.String> p1, int p2) { super(); __sourceHandlerCall_7f13653c12b3ab4065e5(this, p0, p1, p2); }


public Ax(moom.Bk p0, int p1) { super(); __sourceHandlerCall_a4530621c13c8354d822(this, p0, p1); }


public Ax() {
super();
    this.a = "";
    this.b = "";
    this.c = "";
    this.d = "";
    this.e = net.minecraft.scoreboard.Team$EnumVisible.ALWAYS.internalName;
    this.f = -1;
    this.g = com.google.common.collect.Lists.newArrayList();
}


static {
j = ((long)(((moom._a)(moom._c.a(((long)(2930037798624850296L)), ((long)(-989767962637406279L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(155054888848843L)))));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Ax.j ^ 63006039158112L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill654_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill654_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill654_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill654_14 = new byte[8];
    (__sourceSpill654_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill654_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation654_16 = __sourceSpill654_14;
    ((javax.crypto.Cipher)(__sourceSpill654_11)).init(((int)(__sourceSpill654_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill654_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation654_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "7°¥ì0\032ÞµJï?Û+®\001v¤µq3."))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill654_25 = local6_life21;
        int __sourceSpill654_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill654_25)).substring(((int)(__sourceSpill654_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill654_30 = local8_life19;
        int __sourceSpill654_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill654_33 = new byte[8];
        (__sourceSpill654_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill654_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill654_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill654_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill654_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill654_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill654_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill654_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill654_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill654_34)).doFinal(((byte[])(__sourceSpill654_33)));
        (__sourceSpill654_30)[__sourceSpill654_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\020jhß<í<6ût"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill654_38 = local6_life21;
        int __sourceSpill654_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill654_38)).substring(((int)(__sourceSpill654_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill654_43 = local8_life19;
        int __sourceSpill654_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill654_46 = new byte[8];
        (__sourceSpill654_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill654_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill654_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill654_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill654_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill654_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill654_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill654_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill654_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill654_47)).doFinal(((byte[])(__sourceSpill654_46)));
        (__sourceSpill654_43)[__sourceSpill654_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    k = ((long[])(local8_life19));
    l = ((java.lang.Integer[])(new java.lang.Integer[5]));
}

private static native <E extends Throwable> void __sourceHandlerCall_a4530621c13c8354d822(moom.Ax a0, moom.Bk a1, int a2) throws E;
private static final class __SourceHandler_a4530621c13c8354d822 {

public static void f378(moom.Ax receiver, moom.Bk p0, int p1) throws Throwable {
    int forwardValue378_73_0;
    int forwardValue378_81_0;
    int[] spill378_0;
    int spill378_1;
    long life3_3;
    int[] life5_10;
    forward_join_82: {
    forward_join_81: {
    forward_join_73: {
    forward_join_72: {
    forward_join_67: {
    forward_join_46: {
    life3_3 = (__fieldRead378_0() ^ 93449131236540L);
    spill378_0 = __call378_1();
    __directSuperInit378_2(receiver);
    __fieldWrite378_3(receiver, "");
    life5_10 = spill378_0;
    __fieldWrite378_4(receiver, "");
    __fieldWrite378_5(receiver, "");
    __fieldWrite378_6(receiver, "");
    __fieldWrite378_9(receiver, __fieldRead378_8(__fieldRead378_7()));
    __fieldWrite378_10(receiver, -1);
    __fieldWrite378_12(receiver, __call378_11());
    __fieldWrite378_14(receiver, __call378_13(p0));
    __fieldWrite378_15(receiver, p1);
    if (!((life5_10 == null))) {
        break forward_join_67;
    }
    if (!((p1 != 0))) {
        break forward_join_46;
    }
    spill378_1 = p1;
    if (!((life5_10 == null))) {
        forwardValue378_73_0 = spill378_1;
        break forward_join_73;
    }
    if (!((spill378_1 == 2))) {
        break forward_join_72;
    }
    }
    __fieldWrite378_17(receiver, __call378_16(p0));
    __fieldWrite378_19(receiver, __call378_18(p0));
    __fieldWrite378_21(receiver, __call378_20(p0));
    __fieldWrite378_23(receiver, __call378_22(p0));
    __fieldWrite378_26(receiver, __fieldRead378_25(__call378_24(p0)));
    }
    __fieldWrite378_29(receiver, __call378_28(__call378_27(p0)));
    }
    forwardValue378_73_0 = p1;
    }
    if (!((life5_10 == null))) {
        forwardValue378_81_0 = forwardValue378_73_0;
        break forward_join_81;
    }
    if (!((forwardValue378_73_0 == 0))) {
        break forward_join_82;
    }
    forwardValue378_81_0 = __integerCategory378_33(__call378_32(__fieldRead378_30(receiver), __call378_31(p0)));
    }
    __discardScalar378_34(forwardValue378_81_0);
    }
    return;
}
public static void h378_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3037800_0(p0);
}
public static void h378_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3037801_0(p0);
}
public static void h378_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3037802_0(p0);
}
public static void h378_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3037803_0(p0);
}
public static void h378_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3037804_0(p0);
}
public static void h378_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3037805_0(p0);
}
private static native long __fieldRead378_0() throws Throwable;
private static native int[] __call378_1() throws Throwable;
private static native void __directSuperInit378_2(moom.Ax a0) throws Throwable;
private static native void __fieldWrite378_3(moom.Ax a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite378_4(moom.Ax a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite378_5(moom.Ax a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite378_6(moom.Ax a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.scoreboard.Team$EnumVisible __fieldRead378_7() throws Throwable;
private static native java.lang.String __fieldRead378_8(net.minecraft.scoreboard.Team$EnumVisible a0) throws Throwable;
private static native void __fieldWrite378_9(moom.Ax a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite378_10(moom.Ax a0, int a1) throws Throwable;
private static native java.util.ArrayList __call378_11() throws Throwable;
private static native void __fieldWrite378_12(moom.Ax a0, java.util.ArrayList a1) throws Throwable;
private static native java.lang.String __call378_13(moom.Bk a0) throws Throwable;
private static native void __fieldWrite378_14(moom.Ax a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite378_15(moom.Ax a0, int a1) throws Throwable;
private static native java.lang.String __call378_16(moom.Bk a0) throws Throwable;
private static native void __fieldWrite378_17(moom.Ax a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call378_18(moom.Bk a0) throws Throwable;
private static native void __fieldWrite378_19(moom.Ax a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call378_20(moom.Bk a0) throws Throwable;
private static native void __fieldWrite378_21(moom.Ax a0, java.lang.String a1) throws Throwable;
private static native int __call378_22(moom.Bk a0) throws Throwable;
private static native void __fieldWrite378_23(moom.Ax a0, int a1) throws Throwable;
private static native net.minecraft.scoreboard.Team$EnumVisible __call378_24(moom.Bk a0) throws Throwable;
private static native java.lang.String __fieldRead378_25(net.minecraft.scoreboard.Team$EnumVisible a0) throws Throwable;
private static native void __fieldWrite378_26(moom.Ax a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __call378_27(moom.Bk a0) throws Throwable;
private static native int __call378_28(net.minecraft.util.EnumChatFormatting a0) throws Throwable;
private static native void __fieldWrite378_29(moom.Ax a0, int a1) throws Throwable;
private static native java.util.Collection __fieldRead378_30(moom.Ax a0) throws Throwable;
private static native java.util.Collection __call378_31(moom.Bk a0) throws Throwable;
private static native boolean __call378_32(java.util.Collection a0, java.util.Collection a1) throws Throwable;
private static native int __integerCategory378_33(boolean value) throws Throwable;
private static native void __discardScalar378_34(int a0) throws Throwable;
private static native java.lang.Exception __call3037800_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3037801_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3037802_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3037803_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3037804_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3037805_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_7f13653c12b3ab4065e5(moom.Ax a0, moom.Bk a1, java.util.Collection a2, int a3) throws E;
private static final class __SourceHandler_7f13653c12b3ab4065e5 {

public static void f379(moom.Ax receiver, moom.Bk p0, java.util.Collection p1, int p2) throws Throwable {
    int forwardValue379_37_0;
    int forwardValue379_37_1;
    java.util.Collection forwardValue379_48_0;
    int forwardValue379_63_0;
    int[] spill379_0;
    int spill379_1;
    int spill379_2;
    java.util.Collection spill379_3;
    boolean spill379_4;
    long life4_3;
    int[] life6_19;
    forward_join_71: {
    forward_join_66: {
    forward_join_63: {
    forward_join_48: {
    forward_join_43: {
    forward_join_37: {
    life4_3 = (__fieldRead379_0() ^ 87718987183053L);
    __directSuperInit379_1(receiver);
    __fieldWrite379_2(receiver, "");
    __fieldWrite379_3(receiver, "");
    __fieldWrite379_4(receiver, "");
    spill379_0 = __call379_5();
    __fieldWrite379_6(receiver, "");
    life6_19 = spill379_0;
    __fieldWrite379_9(receiver, __fieldRead379_8(__fieldRead379_7()));
    __fieldWrite379_10(receiver, -1);
    __fieldWrite379_12(receiver, __call379_11());
    spill379_1 = p2;
    spill379_2 = 3;
    if (!((life6_19 == null))) {
        forwardValue379_37_0 = spill379_1;
        forwardValue379_37_1 = spill379_2;
        break forward_join_37;
    }
    if (!((spill379_1 != spill379_2))) {
        break forward_join_43;
    }
    forwardValue379_37_0 = p2;
    forwardValue379_37_1 = 4;
    }
    if (!((forwardValue379_37_0 != forwardValue379_37_1))) {
        break forward_join_43;
    }
    throw new java.lang.IllegalArgumentException("Method must be join or leave for player constructor");
    }
    spill379_3 = p1;
    if (!((life6_19 == null))) {
        forwardValue379_48_0 = spill379_3;
        break forward_join_48;
    }
    if (!((spill379_3 != null))) {
        break forward_join_66;
    }
    forwardValue379_48_0 = p1;
    }
    spill379_4 = __call379_13(forwardValue379_48_0);
    if (!((life6_19 == null))) {
        forwardValue379_63_0 = __integerCategory379_14(spill379_4);
        break forward_join_63;
    }
    if (!((!spill379_4))) {
        break forward_join_66;
    }
    __fieldWrite379_15(receiver, p2);
    __fieldWrite379_17(receiver, __call379_16(p0));
    forwardValue379_63_0 = __integerCategory379_20(__call379_19(__fieldRead379_18(receiver), p1));
    }
    __discardScalar379_21(forwardValue379_63_0);
    if (!((life6_19 != null))) {
        break forward_join_71;
    }
    }
    throw new java.lang.IllegalArgumentException("Players cannot be null/empty");
    }
    return;
}
public static void h379_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3037900_0(p0);
}
public static void h379_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3037901_0(p0);
}
public static void h379_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3037902_0(p0);
}
public static void h379_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3037903_0(p0);
}
public static void h379_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3037904_0(p0);
}
public static void h379_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3037905_0(p0);
}
public static void h379_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3037906_0(p0);
}
private static native long __fieldRead379_0() throws Throwable;
private static native void __directSuperInit379_1(moom.Ax a0) throws Throwable;
private static native void __fieldWrite379_2(moom.Ax a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite379_3(moom.Ax a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite379_4(moom.Ax a0, java.lang.String a1) throws Throwable;
private static native int[] __call379_5() throws Throwable;
private static native void __fieldWrite379_6(moom.Ax a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.scoreboard.Team$EnumVisible __fieldRead379_7() throws Throwable;
private static native java.lang.String __fieldRead379_8(net.minecraft.scoreboard.Team$EnumVisible a0) throws Throwable;
private static native void __fieldWrite379_9(moom.Ax a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite379_10(moom.Ax a0, int a1) throws Throwable;
private static native java.util.ArrayList __call379_11() throws Throwable;
private static native void __fieldWrite379_12(moom.Ax a0, java.util.ArrayList a1) throws Throwable;
private static native boolean __call379_13(java.util.Collection a0) throws Throwable;
private static native int __integerCategory379_14(boolean value) throws Throwable;
private static native void __fieldWrite379_15(moom.Ax a0, int a1) throws Throwable;
private static native java.lang.String __call379_16(moom.Bk a0) throws Throwable;
private static native void __fieldWrite379_17(moom.Ax a0, java.lang.String a1) throws Throwable;
private static native java.util.Collection __fieldRead379_18(moom.Ax a0) throws Throwable;
private static native boolean __call379_19(java.util.Collection a0, java.util.Collection a1) throws Throwable;
private static native int __integerCategory379_20(boolean value) throws Throwable;
private static native void __discardScalar379_21(int a0) throws Throwable;
private static native java.lang.Exception __call3037900_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3037901_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3037902_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3037903_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3037904_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3037905_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3037906_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_48b28d21ecb7b3815135(moom.Ax a0, net.minecraft.network.PacketBuffer a1) throws E;
private static final class __SourceHandler_48b28d21ecb7b3815135 {

public static void f581(moom.Ax receiver, net.minecraft.network.PacketBuffer p0) throws Throwable {
    moom.Ax lexicalValue581_71_0;
    int lexicalValue581_76_0;
    int lexicalValue581_93_0;
    int[] spill581_0;
    moom.Ax spill581_1;
    int spill581_2;
    int spill581_3;
    int spill581_4;
    long life2_3;
    int[] life4_18;
    int life5_123;
    int life6_125;
    lexical_join_113: {
    lexical_join_93: {
    lexical_join_91: {
    lexical_join_76: {
    lexical_join_74: {
    lexical_join_71: {
    lexical_join_30: {
    life2_3 = (__fieldRead581_0() ^ 98617635353455L);
    __fieldWrite581_3(receiver, __call581_2(p0, __invokedynamic581_1(1522, (1838584968074162806L ^ life2_3))));
    spill581_0 = __call581_4();
    __fieldWrite581_6(receiver, __call581_5(p0));
    life4_18 = spill581_0;
    spill581_1 = receiver;
    if (!((life4_18 == null))) {
        lexicalValue581_71_0 = spill581_1;
        break lexical_join_71;
    }
    if (!((__fieldRead581_7(spill581_1) != 0))) {
        break lexical_join_30;
    }
    spill581_2 = __fieldRead581_8(receiver);
    if (!((life4_18 == null))) {
        lexicalValue581_76_0 = spill581_2;
        break lexical_join_76;
    }
    if (!((spill581_2 == 2))) {
        break lexical_join_74;
    }
    }
    __fieldWrite581_11(receiver, __call581_10(p0, __invokedynamic581_9(7343, (6156419059331132201L ^ life2_3))));
    __fieldWrite581_14(receiver, __call581_13(p0, __invokedynamic581_12(11433, (8494944619633498923L ^ life2_3))));
    __fieldWrite581_17(receiver, __call581_16(p0, __invokedynamic581_15(11433, (8494944619633498923L ^ life2_3))));
    __fieldWrite581_19(receiver, __call581_18(p0));
    __fieldWrite581_22(receiver, __call581_21(p0, __invokedynamic581_20(24584, (7763905864438486925L ^ life2_3))));
    lexicalValue581_71_0 = receiver;
    }
    __fieldWrite581_24(lexicalValue581_71_0, __call581_23(p0));
    }
    lexicalValue581_76_0 = __fieldRead581_25(receiver);
    }
    if (!((life4_18 == null))) {
        lexicalValue581_93_0 = lexicalValue581_76_0;
        break lexical_join_93;
    }
    if (!((lexicalValue581_76_0 != 0))) {
        break lexical_join_91;
    }
    spill581_3 = __fieldRead581_26(receiver);
    if (!((life4_18 == null))) {
        lexicalValue581_93_0 = spill581_3;
        break lexical_join_93;
    }
    if (!((spill581_3 != 3))) {
        break lexical_join_91;
    }
    spill581_4 = __fieldRead581_27(receiver);
    if (!((life4_18 == null))) {
        lexicalValue581_93_0 = spill581_4;
        break lexical_join_93;
    }
    if (!((spill581_4 == 4))) {
        break lexical_join_113;
    }
    }
    lexicalValue581_93_0 = __call581_28(p0);
    }
    life5_123 = lexicalValue581_93_0;
    life6_125 = 0;
    lexical_cycle_96: while (true) {
    if (!((life6_125 < life5_123))) {
        break lexical_join_113;
    }
    __call581_32(__fieldRead581_29(receiver), __call581_31(p0, __invokedynamic581_30(31093, (874257373253897970L ^ life2_3))));
    life6_125 += 1;
    if (!((life4_18 != null))) { continue lexical_cycle_96; }
    break lexical_cycle_96;
    }
    }
    return;
}
public static void h581_0(java.io.IOException p0) throws Throwable {
    throw __call1058100_0(p0);
}
public static void h581_1(java.io.IOException p0) throws Throwable {
    throw __call1058101_0(p0);
}
public static void h581_2(java.io.IOException p0) throws Throwable {
    throw __call1058102_0(p0);
}
public static void h581_3(java.io.IOException p0) throws Throwable {
    throw __call1058103_0(p0);
}
public static void h581_4(java.io.IOException p0) throws Throwable {
    throw __call1058104_0(p0);
}
public static void h581_5(java.io.IOException p0) throws Throwable {
    throw __call1058105_0(p0);
}
public static void h581_6(java.io.IOException p0) throws Throwable {
    throw __call1058106_0(p0);
}
public static void h581_7(java.io.IOException p0) throws Throwable {
    throw __call1058107_0(p0);
}
public static void h581_8(java.io.IOException p0) throws Throwable {
    throw __call1058108_0(p0);
}
public static void h581_9(java.io.IOException p0) throws Throwable {
    throw __call1058109_0(p0);
}
private static native long __fieldRead581_0() throws Throwable;
private static native int __invokedynamic581_1(int a0, long a1) throws Throwable;
private static native java.lang.String __call581_2(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native void __fieldWrite581_3(moom.Ax a0, java.lang.String a1) throws Throwable;
private static native int[] __call581_4() throws Throwable;
private static native byte __call581_5(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite581_6(moom.Ax a0, byte a1) throws Throwable;
private static native int __fieldRead581_7(moom.Ax a0) throws Throwable;
private static native int __fieldRead581_8(moom.Ax a0) throws Throwable;
private static native int __invokedynamic581_9(int a0, long a1) throws Throwable;
private static native java.lang.String __call581_10(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native void __fieldWrite581_11(moom.Ax a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic581_12(int a0, long a1) throws Throwable;
private static native java.lang.String __call581_13(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native void __fieldWrite581_14(moom.Ax a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic581_15(int a0, long a1) throws Throwable;
private static native java.lang.String __call581_16(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native void __fieldWrite581_17(moom.Ax a0, java.lang.String a1) throws Throwable;
private static native byte __call581_18(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite581_19(moom.Ax a0, byte a1) throws Throwable;
private static native int __invokedynamic581_20(int a0, long a1) throws Throwable;
private static native java.lang.String __call581_21(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native void __fieldWrite581_22(moom.Ax a0, java.lang.String a1) throws Throwable;
private static native byte __call581_23(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite581_24(moom.Ax a0, byte a1) throws Throwable;
private static native int __fieldRead581_25(moom.Ax a0) throws Throwable;
private static native int __fieldRead581_26(moom.Ax a0) throws Throwable;
private static native int __fieldRead581_27(moom.Ax a0) throws Throwable;
private static native int __call581_28(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native java.util.Collection __fieldRead581_29(moom.Ax a0) throws Throwable;
private static native int __invokedynamic581_30(int a0, long a1) throws Throwable;
private static native java.lang.String __call581_31(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native boolean __call581_32(java.util.Collection a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1058100_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1058101_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1058102_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1058103_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1058104_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1058105_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1058106_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1058107_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1058108_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1058109_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_0fcd7b8c78f1b075fa5b(moom.Ax a0, net.minecraft.network.PacketBuffer a1) throws E;
private static final class __SourceHandler_0fcd7b8c78f1b075fa5b {

public static void f582(moom.Ax receiver, net.minecraft.network.PacketBuffer p0) throws Throwable {
    int lexicalValue582_61_0;
    moom.Ax lexicalValue582_80_0;
    int[] spill582_0;
    int spill582_1;
    moom.Ax spill582_2;
    moom.Ax spill582_3;
    moom.Ax spill582_4;
    long life2_3;
    int[] life4_10;
    java.util.Iterator life5_112;
    java.lang.String life6_119;
    lexical_join_96: {
    lexical_join_80: {
    lexical_join_74: {
    lexical_join_61: {
    lexical_join_57: {
    lexical_join_52: {
    lexical_join_27: {
    life2_3 = (__fieldRead582_0() ^ 52109887070438L);
    spill582_0 = __call582_1();
    __call582_3(p0, __fieldRead582_2(receiver));
    life4_10 = spill582_0;
    __call582_5(p0, __fieldRead582_4(receiver));
    if (!((life4_10 == null))) {
        break lexical_join_52;
    }
    if (!((__fieldRead582_6(receiver) != 0))) {
        break lexical_join_27;
    }
    spill582_1 = __fieldRead582_7(receiver);
    if (!((life4_10 == null))) {
        lexicalValue582_61_0 = spill582_1;
        break lexical_join_61;
    }
    if (!((spill582_1 == 2))) {
        break lexical_join_57;
    }
    }
    __call582_9(p0, __fieldRead582_8(receiver));
    __call582_11(p0, __fieldRead582_10(receiver));
    __call582_13(p0, __fieldRead582_12(receiver));
    __call582_15(p0, __fieldRead582_14(receiver));
    __call582_17(p0, __fieldRead582_16(receiver));
    }
    __call582_19(p0, __fieldRead582_18(receiver));
    }
    spill582_2 = receiver;
    if (!((life4_10 == null))) {
        lexicalValue582_80_0 = spill582_2;
        break lexical_join_80;
    }
    lexicalValue582_61_0 = __fieldRead582_20(spill582_2);
    }
    if (!((lexicalValue582_61_0 != 0))) {
        break lexical_join_74;
    }
    spill582_3 = receiver;
    if (!((life4_10 == null))) {
        lexicalValue582_80_0 = spill582_3;
        break lexical_join_80;
    }
    if (!((__fieldRead582_21(spill582_3) != 3))) {
        break lexical_join_74;
    }
    spill582_4 = receiver;
    if (!((life4_10 == null))) {
        lexicalValue582_80_0 = spill582_4;
        break lexical_join_80;
    }
    if (!((__fieldRead582_22(spill582_4) == 4))) {
        break lexical_join_96;
    }
    }
    __call582_25(p0, __call582_24(__fieldRead582_23(receiver)));
    lexicalValue582_80_0 = receiver;
    }
    life5_112 = __call582_27(__fieldRead582_26(lexicalValue582_80_0));
    lexical_cycle_83: while (true) {
    if (!(__call582_28(life5_112))) {
        break lexical_join_96;
    }
    life6_119 = __cast582_30(__call582_29(life5_112));
    __call582_31(p0, life6_119);
    if (!((life4_10 != null))) { continue lexical_cycle_83; }
    break lexical_cycle_83;
    }
    }
    return;
}
public static void h582_0(java.io.IOException p0) throws Throwable {
    throw __call1058200_0(p0);
}
public static void h582_1(java.io.IOException p0) throws Throwable {
    throw __call1058201_0(p0);
}
public static void h582_2(java.io.IOException p0) throws Throwable {
    throw __call1058202_0(p0);
}
public static void h582_3(java.io.IOException p0) throws Throwable {
    throw __call1058203_0(p0);
}
public static void h582_4(java.io.IOException p0) throws Throwable {
    throw __call1058204_0(p0);
}
public static void h582_5(java.io.IOException p0) throws Throwable {
    throw __call1058205_0(p0);
}
public static void h582_6(java.io.IOException p0) throws Throwable {
    throw __call1058206_0(p0);
}
public static void h582_7(java.io.IOException p0) throws Throwable {
    throw __call1058207_0(p0);
}
public static void h582_8(java.io.IOException p0) throws Throwable {
    throw __call1058208_0(p0);
}
public static void h582_9(java.io.IOException p0) throws Throwable {
    throw __call1058209_0(p0);
}
private static native long __fieldRead582_0() throws Throwable;
private static native int[] __call582_1() throws Throwable;
private static native java.lang.String __fieldRead582_2(moom.Ax a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call582_3(net.minecraft.network.PacketBuffer a0, java.lang.String a1) throws Throwable;
private static native int __fieldRead582_4(moom.Ax a0) throws Throwable;
private static native ByteBuf __call582_5(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native int __fieldRead582_6(moom.Ax a0) throws Throwable;
private static native int __fieldRead582_7(moom.Ax a0) throws Throwable;
private static native java.lang.String __fieldRead582_8(moom.Ax a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call582_9(net.minecraft.network.PacketBuffer a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead582_10(moom.Ax a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call582_11(net.minecraft.network.PacketBuffer a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead582_12(moom.Ax a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call582_13(net.minecraft.network.PacketBuffer a0, java.lang.String a1) throws Throwable;
private static native int __fieldRead582_14(moom.Ax a0) throws Throwable;
private static native ByteBuf __call582_15(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native java.lang.String __fieldRead582_16(moom.Ax a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call582_17(net.minecraft.network.PacketBuffer a0, java.lang.String a1) throws Throwable;
private static native int __fieldRead582_18(moom.Ax a0) throws Throwable;
private static native ByteBuf __call582_19(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native int __fieldRead582_20(moom.Ax a0) throws Throwable;
private static native int __fieldRead582_21(moom.Ax a0) throws Throwable;
private static native int __fieldRead582_22(moom.Ax a0) throws Throwable;
private static native java.util.Collection __fieldRead582_23(moom.Ax a0) throws Throwable;
private static native int __call582_24(java.util.Collection a0) throws Throwable;
private static native void __call582_25(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native java.util.Collection __fieldRead582_26(moom.Ax a0) throws Throwable;
private static native java.util.Iterator __call582_27(java.util.Collection a0) throws Throwable;
private static native boolean __call582_28(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call582_29(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast582_30(java.lang.Object a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call582_31(net.minecraft.network.PacketBuffer a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1058200_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1058201_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1058202_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1058203_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1058204_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1058205_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1058206_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1058207_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1058208_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1058209_0(java.io.IOException a0) throws Throwable;

}


public java.lang.String b__String() {
return this.b;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException { __sourceHandlerCall_0fcd7b8c78f1b075fa5b(this, p0); }


public int b() {
return this.i;
}


public java.lang.String e() {
return this.e;
}


public int c() {
return this.f;
}


public java.lang.String c__String() {
return this.c;
}


public java.lang.String d() {
return this.d;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3736_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Ax"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Ax.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 18927;
      if (l[var3] == null) {
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
         long var5 = k[var3];
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
         Object[] var9 = (Object[])m.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               m.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/Ax", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         l[var3] = var15;
      }

      return l[var3];
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException { __sourceHandlerCall_48b28d21ecb7b3815135(this, p0); }


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.Ax)(this)));
    return;
}


public java.lang.String a__String() {
return this.a;
}


public java.util.Collection<java.lang.String> a__Collection() {
return this.g;
}


public int a() {
return this.h;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3736_0() throws E;
}
