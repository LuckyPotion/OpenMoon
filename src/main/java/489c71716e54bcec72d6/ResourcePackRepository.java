package net.minecraft.client.resources;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ResourcePackRepository {

private static org.apache.logging.log4j.Logger a;

private static java.io.FileFilter b;

private java.io.File c;

public net.minecraft.client.resources.IResourcePack d;

private java.io.File e;

public net.minecraft.client.resources.data.IMetadataSerializer f;

private net.minecraft.client.resources.IResourcePack g;

private java.util.concurrent.locks.ReentrantLock h;

private com.google.common.util.concurrent.ListenableFuture<java.lang.Object> i;

private java.util.List<net.minecraft.client.resources.ResourcePackRepository$Entry> j;

public java.util.List<net.minecraft.client.resources.ResourcePackRepository$Entry> k;

private static long l;

private static long[] m;

private static java.lang.Integer[] n;

private static java.util.Map o;

public ResourcePackRepository(java.io.File p0, java.io.File p1, net.minecraft.client.resources.IResourcePack p2, net.minecraft.client.resources.data.IMetadataSerializer p3, net.minecraft.client.settings.GameSettings p4) { super(); __sourceHandlerCall_133eac58b71487f02c11(this, p0, p1, p2, p3, p4); }


static {
l = ((long)(((moom._a)(moom._c.a(((long)(2869296478506360860L)), ((long)(5022396805537154504L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(3953251551389L)))));
    o = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.resources.ResourcePackRepository.l ^ 123553522928267L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1178_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1178_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1178_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1178_14 = new byte[8];
    (__sourceSpill1178_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1178_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1178_16 = __sourceSpill1178_14;
    ((javax.crypto.Cipher)(__sourceSpill1178_11)).init(((int)(__sourceSpill1178_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1178_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1178_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "0^û_Ác%zÄLà¥B\020fß¾ôbì"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1178_25 = local6_life21;
        int __sourceSpill1178_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1178_25)).substring(((int)(__sourceSpill1178_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1178_30 = local8_life19;
        int __sourceSpill1178_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1178_33 = new byte[8];
        (__sourceSpill1178_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1178_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1178_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1178_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1178_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1178_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1178_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1178_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1178_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1178_34)).doFinal(((byte[])(__sourceSpill1178_33)));
        (__sourceSpill1178_30)[__sourceSpill1178_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    m = ((long[])(local8_life19));
    n = ((java.lang.Integer[])(new java.lang.Integer[3]));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
    b = ((java.io.FileFilter)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1178_41()));
}

private static native <E extends Throwable> void __sourceHandlerCall_133eac58b71487f02c11(net.minecraft.client.resources.ResourcePackRepository a0, java.io.File a1, java.io.File a2, net.minecraft.client.resources.IResourcePack a3, net.minecraft.client.resources.data.IMetadataSerializer a4, net.minecraft.client.settings.GameSettings a5) throws E;
private static final class __SourceHandler_133eac58b71487f02c11 {

public static void f548(net.minecraft.client.resources.ResourcePackRepository receiver, java.io.File p0, java.io.File p1, net.minecraft.client.resources.IResourcePack p2, net.minecraft.client.resources.data.IMetadataSerializer p3, net.minecraft.client.settings.GameSettings p4) throws Throwable {
    int forestValue548_41_0;
    int forestValue548_68_0;
    int forestValue548_84_0;
    java.lang.String[] spill548_0;
    boolean spill548_1;
    boolean spill548_2;
    org.apache.logging.log4j.Logger spill548_3;
    java.lang.String spill548_4;
    java.lang.Object[] spill548_5;
    long life6_3;
    java.lang.String[] life8_15;
    java.util.Iterator life9_38;
    java.lang.String life10_45;
    java.util.Iterator life11_49;
    net.minecraft.client.resources.ResourcePackRepository$Entry life12_56;
    forest_join_103: {
    life6_3 = (__fieldRead548_0() ^ 2048573556804L);
    __directSuperInit548_1(receiver);
    spill548_0 = __call548_2();
    __fieldWrite548_3(receiver, new java.util.concurrent.locks.ReentrantLock());
    __fieldWrite548_5(receiver, __call548_4());
    life8_15 = spill548_0;
    __fieldWrite548_7(receiver, __call548_6());
    __fieldWrite548_8(receiver, p0);
    __fieldWrite548_9(receiver, p1);
    __fieldWrite548_10(receiver, p2);
    __fieldWrite548_11(receiver, p3);
    __call548_12(receiver);
    __call548_13(receiver);
    life9_38 = __call548_15(__fieldRead548_14(p4));
    forest_cycle_39: while (true) {
    forest_join_101: {
    forestValue548_41_0 = __integerCategory548_17(__call548_16(life9_38));
    forest_cycle_41: while (true) {
    if (!((forestValue548_41_0 != 0))) {
        break forest_join_103;
    }
    life10_45 = __cast548_19(__call548_18(life9_38));
    life11_49 = __call548_21(__fieldRead548_20(receiver));
    forest_cycle_50: while (true) {
    forest_join_99: {
    forest_join_87: {
    forest_join_84: {
    forest_join_80: {
    forest_join_68: {
    if (!(__call548_22(life11_49))) {
        break forest_join_101;
    }
    life12_56 = __cast548_24(__call548_23(life11_49));
    spill548_1 = __call548_26(__call548_25(life12_56), life10_45);
    if (!((life8_15 != null))) {
        forestValue548_41_0 = __integerCategory548_27(spill548_1);
        continue forest_cycle_41;
    }
    if (!((life8_15 != null))) {
        forestValue548_68_0 = __integerCategory548_28(spill548_1);
        break forest_join_68;
    }
    if (!(spill548_1)) {
        break forest_join_99;
    }
    forestValue548_68_0 = __call548_29(life12_56);
    }
    if (!((life8_15 != null))) {
        forestValue548_84_0 = forestValue548_68_0;
        break forest_join_84;
    }
    if (!((forestValue548_68_0 != 1))) {
        break forest_join_80;
    }
    spill548_2 = __call548_32(__fieldRead548_30(p4), __call548_31(life12_56));
    if (!((life8_15 != null))) {
        forestValue548_84_0 = __integerCategory548_33(spill548_2);
        break forest_join_84;
    }
    if (!(spill548_2)) {
        break forest_join_87;
    }
    }
    forestValue548_84_0 = __integerCategory548_36(__call548_35(__fieldRead548_34(receiver), life12_56));
    }
    __discardScalar548_37(forestValue548_84_0);
    if (!((life8_15 == null))) {
        break forest_join_101;
    }
    }
    __call548_38(life9_38);
    spill548_3 = __fieldRead548_39();
    spill548_4 = "Removed selected resource pack {} because it's no longer compatible";
    java.lang.Object[] __stackOp548_40_0 = new java.lang.Object[1];
    spill548_5 = __stackOp548_40_0;
    (__stackOp548_40_0)[0] = __call548_41(life12_56);
    __call548_42(spill548_3, spill548_4, spill548_5);
    }
    if (!((life8_15 == null))) {
        continue forest_cycle_50;
    }
    break forest_cycle_50;
    }
    break forest_cycle_41;
    }
    }
    if (!((life8_15 == null))) {
        continue forest_cycle_39;
    }
    break forest_cycle_39;
    }
    }
    return;
}
public static void h548_0(moom.Oo p0) throws Throwable {
    throw __call3054800_0(p0);
}
public static void h548_1(moom.Oo p0) throws Throwable {
    throw __call3054801_0(p0);
}
public static void h548_2(moom.Oo p0) throws Throwable {
    throw __call3054802_0(p0);
}
public static void h548_3(moom.Oo p0) throws Throwable {
    throw __call3054803_0(p0);
}
public static void h548_4(moom.Oo p0) throws Throwable {
    throw __call3054804_0(p0);
}
public static void h548_5(moom.Oo p0) throws Throwable {
    throw __call3054805_0(p0);
}
public static void h548_6(moom.Oo p0) throws Throwable {
    throw __call3054806_0(p0);
}
private static native long __fieldRead548_0() throws Throwable;
private static native void __directSuperInit548_1(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native java.lang.String[] __call548_2() throws Throwable;
private static native void __fieldWrite548_3(net.minecraft.client.resources.ResourcePackRepository a0, java.util.concurrent.locks.ReentrantLock a1) throws Throwable;
private static native java.util.ArrayList __call548_4() throws Throwable;
private static native void __fieldWrite548_5(net.minecraft.client.resources.ResourcePackRepository a0, java.util.ArrayList a1) throws Throwable;
private static native java.util.ArrayList __call548_6() throws Throwable;
private static native void __fieldWrite548_7(net.minecraft.client.resources.ResourcePackRepository a0, java.util.ArrayList a1) throws Throwable;
private static native void __fieldWrite548_8(net.minecraft.client.resources.ResourcePackRepository a0, java.io.File a1) throws Throwable;
private static native void __fieldWrite548_9(net.minecraft.client.resources.ResourcePackRepository a0, java.io.File a1) throws Throwable;
private static native void __fieldWrite548_10(net.minecraft.client.resources.ResourcePackRepository a0, net.minecraft.client.resources.IResourcePack a1) throws Throwable;
private static native void __fieldWrite548_11(net.minecraft.client.resources.ResourcePackRepository a0, net.minecraft.client.resources.data.IMetadataSerializer a1) throws Throwable;
private static native void __call548_12(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native void __call548_13(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native java.util.List __fieldRead548_14(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.util.Iterator __call548_15(java.util.List a0) throws Throwable;
private static native boolean __call548_16(java.util.Iterator a0) throws Throwable;
private static native int __integerCategory548_17(boolean value) throws Throwable;
private static native java.lang.Object __call548_18(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast548_19(java.lang.Object a0) throws Throwable;
private static native java.util.List __fieldRead548_20(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native java.util.Iterator __call548_21(java.util.List a0) throws Throwable;
private static native boolean __call548_22(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call548_23(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.resources.ResourcePackRepository$Entry __cast548_24(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call548_25(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native boolean __call548_26(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory548_27(boolean value) throws Throwable;
private static native int __integerCategory548_28(boolean value) throws Throwable;
private static native int __call548_29(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native java.util.List __fieldRead548_30(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.String __call548_31(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native boolean __call548_32(java.util.List a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory548_33(boolean value) throws Throwable;
private static native java.util.List __fieldRead548_34(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native boolean __call548_35(java.util.List a0, net.minecraft.client.resources.ResourcePackRepository$Entry a1) throws Throwable;
private static native int __integerCategory548_36(boolean value) throws Throwable;
private static native void __discardScalar548_37(int a0) throws Throwable;
private static native void __call548_38(java.util.Iterator a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead548_39() throws Throwable;
private static native java.lang.String __call548_41(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native void __call548_42(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.Exception __call3054800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3054801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3054802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3054803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3054804_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3054805_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3054806_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> com.google.common.util.concurrent.ListenableFuture __sourceHandlerCall_2ae5262693c91cccf4e4(net.minecraft.client.resources.ResourcePackRepository a0, java.lang.String a1, java.lang.String a2) throws E;
private static final class __SourceHandler_2ae5262693c91cccf4e4 {

public static com.google.common.util.concurrent.ListenableFuture f623(net.minecraft.client.resources.ResourcePackRepository receiver, java.lang.String p0, java.lang.String p1) throws Throwable {
    java.lang.String forestValue623_17_0;
    java.lang.String forestValue623_50_0;
    int forestValue623_74_0;
    com.google.common.util.concurrent.ListenableFuture forestValue623_130_0;
    java.lang.String spill623_0;
    java.lang.String spill623_1;
    boolean spill623_2;
    com.google.common.util.concurrent.ListenableFuture spill623_3;
    long life3_3;
    java.lang.String[] life5_5;
    java.lang.String life6_14;
    java.io.File life7_26;
    java.lang.String life8_54;
    com.google.common.util.concurrent.ListenableFuture life9_65;
    moom.g7 life8_86;
    java.util.Map life9_88;
    net.minecraft.client.Minecraft life10_90;
    com.google.common.util.concurrent.SettableFuture life11_99;
    com.google.common.util.concurrent.ListenableFuture life12_126;
    forest_join_130: {
    forest_join_77: {
    forest_join_75: {
    forest_join_74: {
    forest_join_66: {
    forest_join_50: {
    forest_join_18: {
    forest_join_17: {
    forest_join_16: {
    life3_3 = (__fieldRead623_0() ^ 71719850043259L);
    life5_5 = __call623_1();
    spill623_0 = p1;
    if (!((life5_5 != null))) {
        forestValue623_17_0 = spill623_0;
        break forest_join_17;
    }
    if (!(__call623_2(spill623_0, "^[a-f0-9]{40}$"))) {
        break forest_join_16;
    }
    life6_14 = p1;
    if (!((life5_5 == null))) {
        break forest_join_18;
    }
    }
    forestValue623_17_0 = "legacy";
    }
    life6_14 = forestValue623_17_0;
    }
    life7_26 = new java.io.File(__fieldRead623_3(receiver), life6_14);
    __call623_5(__fieldRead623_4(receiver));
    __call623_6(receiver);
    if (!((life5_5 != null))) {
        break forest_join_77;
    }
    if (!(__call623_7(life7_26))) {
        break forest_join_75;
    }
    spill623_1 = p1;
    if (!((life5_5 != null))) {
        forestValue623_50_0 = spill623_1;
        break forest_join_50;
    }
    if (!((__call623_8(spill623_1) == __invokedynamic623_9(15546, (5458418709386104704L ^ life3_3))))) {
        break forest_join_75;
    }
    forestValue623_50_0 = __call623_13(__call623_12(__call623_10(), __call623_11(life7_26)));
    }
    life8_54 = forestValue623_50_0;
    spill623_2 = __call623_14(life8_54, p1);
    if (!((life5_5 != null))) {
        forestValue623_74_0 = __integerCategory623_15(spill623_2);
        break forest_join_74;
    }
    if (!(spill623_2)) {
        break forest_join_66;
    }
    life9_65 = __call623_16(receiver, life7_26);
    __call623_18(__fieldRead623_17(receiver));
    return life9_65;
    }
    __call623_21(__fieldRead623_19(), __invokedynamic623_20(life7_26, p1, life8_54));
    forestValue623_74_0 = __integerCategory623_23(__call623_22(life7_26));
    }
    __discardScalar623_24(forestValue623_74_0);
    }
    __call623_25(receiver);
    }
    life8_86 = new moom.g7();
    life9_88 = __call623_26();
    life10_90 = __call623_27();
    __call623_30(__call623_29(life10_90, __invokedynamic623_28(life10_90, life8_86)));
    life11_99 = __call623_31();
    __fieldWrite623_35(receiver, __call623_34(life7_26, p0, life9_88, __invokedynamic623_32(24925, (6061380643393852006L ^ life3_3)), life8_86, __call623_33(life10_90)));
    __call623_38(__fieldRead623_36(receiver), new moom.o2(receiver, life7_26, life11_99), __call623_37());
    life12_126 = __fieldRead623_39(receiver);
    __call623_41(__fieldRead623_40(receiver));
    spill623_3 = life12_126;
    if (!((__call623_42() != null))) {
        forestValue623_130_0 = spill623_3;
        break forest_join_130;
    }
    __call623_43(new java.lang.String[1]);
    forestValue623_130_0 = spill623_3;
    }
    return forestValue623_130_0;
}
public static com.google.common.util.concurrent.ListenableFuture h623_0(java.io.IOException p0) throws Throwable {
    throw __call3062300_0(p0);
}
public static com.google.common.util.concurrent.ListenableFuture h623_1(java.io.IOException p0) throws Throwable {
    throw __call3062301_0(p0);
}
public static com.google.common.util.concurrent.ListenableFuture h623_2(java.io.IOException p0) throws Throwable {
    throw __call3062302_0(p0);
}
public static com.google.common.util.concurrent.ListenableFuture h623_3(java.io.IOException p0) throws Throwable {
    throw __call3062303_0(p0);
}
public static com.google.common.util.concurrent.ListenableFuture h623_4(java.io.IOException p0) throws Throwable {
    throw __call3062304_0(p0);
}
public static com.google.common.util.concurrent.ListenableFuture h623_5(java.io.IOException p0, net.minecraft.client.resources.ResourcePackRepository p1, java.lang.String p2, long p3, java.io.File p4, net.minecraft.client.Minecraft p5, com.google.common.util.concurrent.SettableFuture p6, com.google.common.util.concurrent.ListenableFuture p7) throws Throwable {
    com.google.common.util.concurrent.ListenableFuture forestValue3062305_65_0;
    com.google.common.util.concurrent.ListenableFuture spill3062305_0;
    java.io.IOException life9_2;
    moom.g7 life9_16;
    java.util.Map life10_18;
    net.minecraft.client.Minecraft life6_20;
    com.google.common.util.concurrent.SettableFuture life7_29;
    com.google.common.util.concurrent.ListenableFuture life8_56;
    forest_join_65: {
    life9_2 = p0;
    __call3062305_2(__fieldRead3062305_0(), __invokedynamic3062305_1(p4), life9_2);
    __call3062305_3(p4);
    __call3062305_4(p1);
    life9_16 = new moom.g7();
    life10_18 = __call3062305_5();
    life6_20 = __call3062305_6();
    __call3062305_9(__call3062305_8(life6_20, __invokedynamic3062305_7(life6_20, life9_16)));
    life7_29 = __call3062305_10();
    __fieldWrite3062305_14(p1, __call3062305_13(p4, p2, life10_18, __invokedynamic3062305_11(24925, (6061380643393852006L ^ p3)), life9_16, __call3062305_12(life6_20)));
    __call3062305_17(__fieldRead3062305_15(p1), new moom.o2(p1, p4, life7_29), __call3062305_16());
    life8_56 = __fieldRead3062305_18(p1);
    __call3062305_20(__fieldRead3062305_19(p1));
    spill3062305_0 = life8_56;
    if (!((__call3062305_21() != null))) {
        forestValue3062305_65_0 = spill3062305_0;
        break forest_join_65;
    }
    __call3062305_22(new java.lang.String[1]);
    forestValue3062305_65_0 = spill3062305_0;
    }
    return forestValue3062305_65_0;
}
public static com.google.common.util.concurrent.ListenableFuture h623_6(java.io.IOException p0) throws Throwable {
    throw __call3062306_0(p0);
}
public static com.google.common.util.concurrent.ListenableFuture h623_7(java.lang.Throwable p0, net.minecraft.client.resources.ResourcePackRepository p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3062307_1(__fieldRead3062307_0(p1));
    throw life2_2;
}
private static native long __fieldRead623_0() throws Throwable;
private static native java.lang.String[] __call623_1() throws Throwable;
private static native boolean __call623_2(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.io.File __fieldRead623_3(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __fieldRead623_4(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native void __call623_5(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native void __call623_6(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native boolean __call623_7(java.io.File a0) throws Throwable;
private static native int __call623_8(java.lang.String a0) throws Throwable;
private static native int __invokedynamic623_9(int a0, long a1) throws Throwable;
private static native com.google.common.hash.HashFunction __call623_10() throws Throwable;
private static native byte[] __call623_11(java.io.File a0) throws Throwable;
private static native com.google.common.hash.HashCode __call623_12(com.google.common.hash.HashFunction a0, byte[] a1) throws Throwable;
private static native java.lang.String __call623_13(com.google.common.hash.HashCode a0) throws Throwable;
private static native boolean __call623_14(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory623_15(boolean value) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFuture __call623_16(net.minecraft.client.resources.ResourcePackRepository a0, java.io.File a1) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __fieldRead623_17(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native void __call623_18(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead623_19() throws Throwable;
private static native java.lang.String __invokedynamic623_20(java.io.File a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call623_21(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native boolean __call623_22(java.io.File a0) throws Throwable;
private static native int __integerCategory623_23(boolean value) throws Throwable;
private static native void __discardScalar623_24(int a0) throws Throwable;
private static native void __call623_25(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native java.util.Map __call623_26() throws Throwable;
private static native net.minecraft.client.Minecraft __call623_27() throws Throwable;
private static native java.lang.Runnable __invokedynamic623_28(net.minecraft.client.Minecraft a0, moom.g7 a1) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFuture __call623_29(net.minecraft.client.Minecraft a0, java.lang.Runnable a1) throws Throwable;
private static native java.lang.Object __call623_30(com.google.common.util.concurrent.ListenableFuture a0) throws Throwable;
private static native com.google.common.util.concurrent.SettableFuture __call623_31() throws Throwable;
private static native int __invokedynamic623_32(int a0, long a1) throws Throwable;
private static native java.net.Proxy __call623_33(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFuture __call623_34(java.io.File a0, java.lang.String a1, java.util.Map a2, int a3, moom.g7 a4, java.net.Proxy a5) throws Throwable;
private static native void __fieldWrite623_35(net.minecraft.client.resources.ResourcePackRepository a0, com.google.common.util.concurrent.ListenableFuture a1) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFuture __fieldRead623_36(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native java.util.concurrent.Executor __call623_37() throws Throwable;
private static native void __call623_38(com.google.common.util.concurrent.ListenableFuture a0, moom.o2 a1, java.util.concurrent.Executor a2) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFuture __fieldRead623_39(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __fieldRead623_40(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native void __call623_41(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native java.lang.String[] __call623_42() throws Throwable;
private static native void __call623_43(java.lang.String[] a0) throws Throwable;
private static native java.lang.Exception __call3062300_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3062301_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3062302_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3062303_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3062304_0(java.io.IOException a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3062305_0() throws Throwable;
private static native java.lang.String __invokedynamic3062305_1(java.io.File a0) throws Throwable;
private static native void __call3062305_2(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.io.IOException a2) throws Throwable;
private static native boolean __call3062305_3(java.io.File a0) throws Throwable;
private static native void __call3062305_4(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native java.util.Map __call3062305_5() throws Throwable;
private static native net.minecraft.client.Minecraft __call3062305_6() throws Throwable;
private static native java.lang.Runnable __invokedynamic3062305_7(net.minecraft.client.Minecraft a0, moom.g7 a1) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFuture __call3062305_8(net.minecraft.client.Minecraft a0, java.lang.Runnable a1) throws Throwable;
private static native java.lang.Object __call3062305_9(com.google.common.util.concurrent.ListenableFuture a0) throws Throwable;
private static native com.google.common.util.concurrent.SettableFuture __call3062305_10() throws Throwable;
private static native int __invokedynamic3062305_11(int a0, long a1) throws Throwable;
private static native java.net.Proxy __call3062305_12(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFuture __call3062305_13(java.io.File a0, java.lang.String a1, java.util.Map a2, int a3, moom.g7 a4, java.net.Proxy a5) throws Throwable;
private static native void __fieldWrite3062305_14(net.minecraft.client.resources.ResourcePackRepository a0, com.google.common.util.concurrent.ListenableFuture a1) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFuture __fieldRead3062305_15(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native java.util.concurrent.Executor __call3062305_16() throws Throwable;
private static native void __call3062305_17(com.google.common.util.concurrent.ListenableFuture a0, moom.o2 a1, java.util.concurrent.Executor a2) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFuture __fieldRead3062305_18(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __fieldRead3062305_19(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native void __call3062305_20(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native java.lang.String[] __call3062305_21() throws Throwable;
private static native void __call3062305_22(java.lang.String[] a0) throws Throwable;
private static native java.lang.Exception __call3062306_0(java.io.IOException a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __fieldRead3062307_0(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native void __call3062307_1(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_6c43736ef09fb83b33db(net.minecraft.client.resources.ResourcePackRepository a0) throws E;
private static final class __SourceHandler_6c43736ef09fb83b33db {

public static java.util.List f1425(net.minecraft.client.resources.ResourcePackRepository receiver) throws Throwable {
    java.io.File forwardValue1425_14_0;
    java.util.List forwardValue1425_19_0;
    java.io.File spill1425_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_14: {
    life1_3 = (__fieldRead1425_0() ^ 91276684796511L);
    life3_5 = __call1425_1();
    spill1425_0 = __fieldRead1425_2(receiver);
    if (!((life3_5 != null))) {
        forwardValue1425_14_0 = spill1425_0;
        break forward_join_14;
    }
    if (!(__call1425_3(spill1425_0))) {
        break forward_join_18;
    }
    forwardValue1425_14_0 = __fieldRead1425_4(receiver);
    }
    forwardValue1425_19_0 = __call1425_7(__call1425_6(forwardValue1425_14_0, __fieldRead1425_5()));
    break forward_join_19;
    }
    forwardValue1425_19_0 = __call1425_8();
    }
    return forwardValue1425_19_0;
}
public static void h1425_0(moom.Oo p0) throws Throwable {
    throw __call1142500_0(p0);
}
public static void h1425_1(moom.Oo p0) throws Throwable {
    throw __call1142501_0(p0);
}
private static native long __fieldRead1425_0() throws Throwable;
private static native java.lang.String[] __call1425_1() throws Throwable;
private static native java.io.File __fieldRead1425_2(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native boolean __call1425_3(java.io.File a0) throws Throwable;
private static native java.io.File __fieldRead1425_4(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native java.io.FileFilter __fieldRead1425_5() throws Throwable;
private static native java.io.File[] __call1425_6(java.io.File a0, java.io.FileFilter a1) throws Throwable;
private static native java.util.List __call1425_7(java.io.File[] a0) throws Throwable;
private static native java.util.List __call1425_8() throws Throwable;
private static native java.lang.Exception __call1142500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1142501_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_ba9eb8d09442fcd8e2ad(net.minecraft.client.resources.ResourcePackRepository a0) throws E;
private static final class __SourceHandler_ba9eb8d09442fcd8e2ad {

public static void f1426(net.minecraft.client.resources.ResourcePackRepository receiver) throws Throwable {
    int forwardValue1426_21_0;
    int forwardValue1426_27_0;
    int forwardValue1426_38_0;
    boolean spill1426_0;
    boolean spill1426_1;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_44: {
    forward_join_38: {
    forward_join_35: {
    forward_join_28: {
    forward_join_27: {
    forward_join_21: {
    life1_3 = (__fieldRead1426_0() ^ 121357658816628L);
    life3_5 = __call1426_1();
    spill1426_0 = __call1426_3(__fieldRead1426_2(receiver));
    if (!((life3_5 != null))) {
        forwardValue1426_38_0 = __integerCategory1426_4(spill1426_0);
        break forward_join_38;
    }
    if (!(spill1426_0)) {
        break forward_join_35;
    }
    spill1426_1 = __call1426_6(__fieldRead1426_5(receiver));
    if (!((life3_5 != null))) {
        forwardValue1426_21_0 = __integerCategory1426_7(spill1426_1);
        break forward_join_21;
    }
    if (!((!spill1426_1))) {
        break forward_join_44;
    }
    forwardValue1426_21_0 = __integerCategory1426_10(__call1426_9(__fieldRead1426_8(receiver)));
    }
    if (!((life3_5 != null))) {
        forwardValue1426_27_0 = forwardValue1426_21_0;
        break forward_join_27;
    }
    if (!((forwardValue1426_21_0 != 0))) {
        break forward_join_28;
    }
    forwardValue1426_27_0 = __integerCategory1426_13(__call1426_12(__fieldRead1426_11(receiver)));
    }
    if (!((forwardValue1426_27_0 == 0))) {
        break forward_join_44;
    }
    }
    __call1426_17(__fieldRead1426_14(), __invokedynamic1426_16(__fieldRead1426_15(receiver)));
    if (!((life3_5 == null))) {
        break forward_join_44;
    }
    }
    forwardValue1426_38_0 = __integerCategory1426_20(__call1426_19(__fieldRead1426_18(receiver)));
    }
    if (!((forwardValue1426_38_0 == 0))) {
        break forward_join_44;
    }
    __call1426_24(__fieldRead1426_21(), __invokedynamic1426_23(__fieldRead1426_22(receiver)));
    }
    return;
}
public static void h1426_0(moom.Oo p0) throws Throwable {
    throw __call1142600_0(p0);
}
public static void h1426_1(moom.Oo p0) throws Throwable {
    throw __call1142601_0(p0);
}
public static void h1426_2(moom.Oo p0) throws Throwable {
    throw __call1142602_0(p0);
}
public static void h1426_3(moom.Oo p0) throws Throwable {
    throw __call1142603_0(p0);
}
public static void h1426_4(moom.Oo p0) throws Throwable {
    throw __call1142604_0(p0);
}
public static void h1426_5(moom.Oo p0) throws Throwable {
    throw __call1142605_0(p0);
}
public static void h1426_6(moom.Oo p0) throws Throwable {
    throw __call1142606_0(p0);
}
public static void h1426_7(moom.Oo p0) throws Throwable {
    throw __call1142607_0(p0);
}
public static void h1426_8(moom.Oo p0) throws Throwable {
    throw __call1142608_0(p0);
}
private static native long __fieldRead1426_0() throws Throwable;
private static native java.lang.String[] __call1426_1() throws Throwable;
private static native java.io.File __fieldRead1426_2(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native boolean __call1426_3(java.io.File a0) throws Throwable;
private static native int __integerCategory1426_4(boolean value) throws Throwable;
private static native java.io.File __fieldRead1426_5(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native boolean __call1426_6(java.io.File a0) throws Throwable;
private static native int __integerCategory1426_7(boolean value) throws Throwable;
private static native java.io.File __fieldRead1426_8(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native boolean __call1426_9(java.io.File a0) throws Throwable;
private static native int __integerCategory1426_10(boolean value) throws Throwable;
private static native java.io.File __fieldRead1426_11(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native boolean __call1426_12(java.io.File a0) throws Throwable;
private static native int __integerCategory1426_13(boolean value) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead1426_14() throws Throwable;
private static native java.io.File __fieldRead1426_15(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native java.lang.String __invokedynamic1426_16(java.io.File a0) throws Throwable;
private static native void __call1426_17(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.io.File __fieldRead1426_18(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native boolean __call1426_19(java.io.File a0) throws Throwable;
private static native int __integerCategory1426_20(boolean value) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead1426_21() throws Throwable;
private static native java.io.File __fieldRead1426_22(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native java.lang.String __invokedynamic1426_23(java.io.File a0) throws Throwable;
private static native void __call1426_24(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1142600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1142601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1142602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1142603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1142604_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1142605_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1142606_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1142607_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1142608_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_1ef12da3d9ff625967d4(net.minecraft.client.resources.ResourcePackRepository a0) throws E;
private static final class __SourceHandler_1ef12da3d9ff625967d4 {

public static void f1075(net.minecraft.client.resources.ResourcePackRepository receiver) throws Throwable {
    int forestValue1075_45_0;
    int forestValue1075_57_0;
    int forestValue1075_57_1;
    int forestValue1075_65_0;
    int forestValue1075_72_0;
    java.lang.String[] spill1075_0;
    boolean spill1075_1;
    int spill1075_2;
    int spill1075_3;
    int spill1075_4;
    long life1_3;
    java.util.ArrayList life4_6;
    java.util.Iterator life5_10;
    java.lang.String[] life3_11;
    java.io.File life6_20;
    net.minecraft.client.resources.ResourcePackRepository$Entry life7_26;
    int life8_53;
    java.util.Iterator life5_95;
    net.minecraft.client.resources.ResourcePackRepository$Entry life6_104;
    forest_join_93: {
    forest_join_90: {
    forest_join_72: {
    forest_join_68: {
    life1_3 = (__fieldRead1075_0() ^ 31372550215695L);
    spill1075_0 = __call1075_1();
    life4_6 = __call1075_2();
    life5_10 = __call1075_4(__call1075_3(receiver));
    life3_11 = spill1075_0;
    forest_cycle_12: while (true) {
    forest_join_66: {
    forest_join_65: {
    forest_join_57: {
    forest_join_45: {
    forest_join_41: {
    if (!(__call1075_5(life5_10))) {
        break forest_join_68;
    }
    life6_20 = __cast1075_7(__call1075_6(life5_10));
    life7_26 = new net.minecraft.client.resources.ResourcePackRepository$Entry(receiver, life6_20);
    spill1075_1 = __call1075_9(__fieldRead1075_8(receiver), life7_26);
    if (!((life3_11 != null))) {
        forestValue1075_72_0 = __integerCategory1075_10(spill1075_1);
        break forest_join_72;
    }
    if (!((life3_11 != null))) {
        forestValue1075_45_0 = __integerCategory1075_11(spill1075_1);
        break forest_join_45;
    }
    if (!((!spill1075_1))) {
        break forest_join_41;
    }
    __call1075_12(life7_26);
    __call1075_13(life4_6, life7_26);
    break forest_join_66;
    }
    forestValue1075_45_0 = __call1075_15(__fieldRead1075_14(receiver), life7_26);
    }
    life8_53 = forestValue1075_45_0;
    spill1075_2 = life8_53;
    spill1075_3 = -1;
    if (!((life3_11 != null))) {
        forestValue1075_57_0 = spill1075_2;
        forestValue1075_57_1 = spill1075_3;
        break forest_join_57;
    }
    if (!((spill1075_2 > spill1075_3))) {
        break forest_join_66;
    }
    spill1075_4 = life8_53;
    if (!((life3_11 != null))) {
        forestValue1075_65_0 = spill1075_4;
        break forest_join_65;
    }
    forestValue1075_57_0 = spill1075_4;
    forestValue1075_57_1 = __call1075_17(__fieldRead1075_16(receiver));
    }
    if (!((forestValue1075_57_0 < forestValue1075_57_1))) {
        break forest_join_66;
    }
    forestValue1075_65_0 = __integerCategory1075_22(__call1075_21(life4_6, __cast1075_20(__call1075_19(__fieldRead1075_18(receiver), life8_53))));
    }
    __discardScalar1075_23(forestValue1075_65_0);
    }
    if (!((life3_11 == null))) {
        continue forest_cycle_12;
    }
    break forest_cycle_12;
    }
    }
    forestValue1075_72_0 = __integerCategory1075_26(__call1075_25(__fieldRead1075_24(receiver), life4_6));
    }
    __discardScalar1075_27(forestValue1075_72_0);
    life5_95 = __call1075_29(__fieldRead1075_28(receiver));
    forest_cycle_77: while (true) {
    if (!(__call1075_30(life5_95))) {
        break forest_join_90;
    }
    life6_104 = __cast1075_32(__call1075_31(life5_95));
    __call1075_33(life6_104);
    if (!((life3_11 != null))) {
        break forest_join_93;
    }
    if (!((life3_11 == null))) {
        continue forest_cycle_77;
    }
    break forest_cycle_77;
    }
    }
    __fieldWrite1075_34(receiver, life4_6);
    }
    return;
}
public static void h1075_0(java.lang.Exception p0) throws Throwable {
    throw __call3107500_0(p0);
}
public static void h1075_1(java.lang.Exception p0) throws Throwable {
    throw __call3107501_0(p0);
}
public static void h1075_2(java.lang.Exception p0, net.minecraft.client.resources.ResourcePackRepository p1, java.lang.String[] p2, java.util.ArrayList p3, java.util.Iterator p4, net.minecraft.client.resources.ResourcePackRepository$Entry p5, int p6) throws Throwable {
    int forestValue3107502_12_0;
    int forestValue3107502_24_0;
    int forestValue3107502_24_1;
    int forestValue3107502_32_0;
    int forestValue3107502_102_0;
    int forestValue3107502_114_0;
    int forestValue3107502_114_1;
    int forestValue3107502_122_0;
    int forestValue3107502_128_0;
    int spill3107502_0;
    int spill3107502_1;
    int spill3107502_2;
    boolean spill3107502_3;
    boolean spill3107502_4;
    int spill3107502_5;
    int spill3107502_6;
    int spill3107502_7;
    java.lang.Exception life6_2;
    int life6_15;
    java.io.File life7_55;
    java.io.File life7_94;
    net.minecraft.client.resources.ResourcePackRepository$Entry life5_100;
    int life6_127;
    java.util.Iterator life4_167;
    net.minecraft.client.resources.ResourcePackRepository$Entry life7_176;
    forest_join_149: {
    forest_join_146: {
    forest_join_128: {
    forest_join_124: {
    forest_join_66: {
    forest_join_65: {
    life6_2 = p0;
    __call3107502_0(p3, p5);
    if (!((p2 == null))) {
        break forest_join_66;
    }
    forest_cycle_8: while (true) {
    forestValue3107502_12_0 = __call3107502_2(__fieldRead3107502_1(p1), p5);
    forest_cycle_12: while (true) {
    forest_join_33: {
    forest_join_32: {
    forest_join_24: {
    life6_15 = forestValue3107502_12_0;
    spill3107502_0 = life6_15;
    spill3107502_1 = -1;
    if (!((p2 != null))) {
        forestValue3107502_24_0 = spill3107502_0;
        forestValue3107502_24_1 = spill3107502_1;
        break forest_join_24;
    }
    if (!((spill3107502_0 > spill3107502_1))) {
        break forest_join_33;
    }
    spill3107502_2 = life6_15;
    if (!((p2 != null))) {
        forestValue3107502_32_0 = spill3107502_2;
        break forest_join_32;
    }
    forestValue3107502_24_0 = spill3107502_2;
    forestValue3107502_24_1 = __call3107502_4(__fieldRead3107502_3(p1));
    }
    if (!((forestValue3107502_24_0 < forestValue3107502_24_1))) {
        break forest_join_33;
    }
    forestValue3107502_32_0 = __integerCategory3107502_9(__call3107502_8(p3, __cast3107502_7(__call3107502_6(__fieldRead3107502_5(p1), life6_15))));
    }
    __discardScalar3107502_10(forestValue3107502_32_0);
    }
    forest_cycle_33: while (true) {
    forest_join_36: {
    if (!((p2 == null))) {
        break forest_join_36;
    }
    break forest_join_65;
    }
    if (!(__call3107502_11(p4))) {
        break forest_join_124;
    }
    life7_55 = __cast3107502_13(__call3107502_12(p4));
    p5 = new net.minecraft.client.resources.ResourcePackRepository$Entry(p1, life7_55);
    spill3107502_3 = __call3107502_15(__fieldRead3107502_14(p1), p5);
    if (!((p2 != null))) {
        forestValue3107502_128_0 = __integerCategory3107502_16(spill3107502_3);
        break forest_join_128;
    }
    if (!((p2 != null))) {
        forestValue3107502_12_0 = __integerCategory3107502_17(spill3107502_3);
        continue forest_cycle_12;
    }
    if (!((!spill3107502_3))) {
        continue forest_cycle_8;
    }
    __call3107502_18(p5);
    __call3107502_19(p3, p5);
    continue forest_cycle_33;
    }
    }
    }
    }
    break forest_join_124;
    }
    forest_cycle_66: while (true) {
    forest_join_122: {
    forest_join_114: {
    forest_join_102: {
    forest_join_98: {
    forest_join_69: {
    if (!((p2 == null))) {
        break forest_join_69;
    }
    break forest_join_124;
    }
    if (!(__call3107502_20(p4))) {
        break forest_join_124;
    }
    life7_94 = __cast3107502_22(__call3107502_21(p4));
    life5_100 = new net.minecraft.client.resources.ResourcePackRepository$Entry(p1, life7_94);
    spill3107502_4 = __call3107502_24(__fieldRead3107502_23(p1), life5_100);
    if (!((p2 != null))) {
        forestValue3107502_128_0 = __integerCategory3107502_25(spill3107502_4);
        break forest_join_128;
    }
    if (!((p2 != null))) {
        forestValue3107502_102_0 = __integerCategory3107502_26(spill3107502_4);
        break forest_join_102;
    }
    if (!((!spill3107502_4))) {
        break forest_join_98;
    }
    __call3107502_27(life5_100);
    __call3107502_28(p3, life5_100);
    continue forest_cycle_66;
    }
    forestValue3107502_102_0 = __call3107502_30(__fieldRead3107502_29(p1), life5_100);
    }
    life6_127 = forestValue3107502_102_0;
    spill3107502_5 = life6_127;
    spill3107502_6 = -1;
    if (!((p2 != null))) {
        forestValue3107502_114_0 = spill3107502_5;
        forestValue3107502_114_1 = spill3107502_6;
        break forest_join_114;
    }
    if (!((spill3107502_5 > spill3107502_6))) {
        continue forest_cycle_66;
    }
    spill3107502_7 = life6_127;
    if (!((p2 != null))) {
        forestValue3107502_122_0 = spill3107502_7;
        break forest_join_122;
    }
    forestValue3107502_114_0 = spill3107502_7;
    forestValue3107502_114_1 = __call3107502_32(__fieldRead3107502_31(p1));
    }
    if (!((forestValue3107502_114_0 < forestValue3107502_114_1))) {
        continue forest_cycle_66;
    }
    forestValue3107502_122_0 = __integerCategory3107502_37(__call3107502_36(p3, __cast3107502_35(__call3107502_34(__fieldRead3107502_33(p1), life6_127))));
    }
    __discardScalar3107502_38(forestValue3107502_122_0);
    continue forest_cycle_66;
    }
    }
    forestValue3107502_128_0 = __integerCategory3107502_41(__call3107502_40(__fieldRead3107502_39(p1), p3));
    }
    __discardScalar3107502_42(forestValue3107502_128_0);
    life4_167 = __call3107502_44(__fieldRead3107502_43(p1));
    forest_cycle_133: while (true) {
    if (!(__call3107502_45(life4_167))) {
        break forest_join_146;
    }
    life7_176 = __cast3107502_47(__call3107502_46(life4_167));
    __call3107502_48(life7_176);
    if (!((p2 != null))) {
        break forest_join_149;
    }
    if (!((p2 == null))) {
        continue forest_cycle_133;
    }
    break forest_cycle_133;
    }
    }
    __fieldWrite3107502_49(p1, p3);
    }
    return;
}
public static void h1075_3(java.lang.Exception p0) throws Throwable {
    throw __call3107503_0(p0);
}
public static void h1075_4(java.lang.Exception p0) throws Throwable {
    throw __call3107504_0(p0);
}
public static void h1075_5(java.lang.Exception p0) throws Throwable {
    throw __call3107505_0(p0);
}
public static void h1075_6(java.lang.Exception p0) throws Throwable {
    throw __call3107506_0(p0);
}
public static void h1075_7(java.lang.Exception p0) throws Throwable {
    throw __call3107507_0(p0);
}
public static void h1075_8(java.lang.Exception p0) throws Throwable {
    throw __call3107508_0(p0);
}
private static native long __fieldRead1075_0() throws Throwable;
private static native java.lang.String[] __call1075_1() throws Throwable;
private static native java.util.ArrayList __call1075_2() throws Throwable;
private static native java.util.List __call1075_3(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native java.util.Iterator __call1075_4(java.util.List a0) throws Throwable;
private static native boolean __call1075_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1075_6(java.util.Iterator a0) throws Throwable;
private static native java.io.File __cast1075_7(java.lang.Object a0) throws Throwable;
private static native java.util.List __fieldRead1075_8(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native boolean __call1075_9(java.util.List a0, net.minecraft.client.resources.ResourcePackRepository$Entry a1) throws Throwable;
private static native int __integerCategory1075_10(boolean value) throws Throwable;
private static native int __integerCategory1075_11(boolean value) throws Throwable;
private static native void __call1075_12(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native boolean __call1075_13(java.util.ArrayList a0, net.minecraft.client.resources.ResourcePackRepository$Entry a1) throws Throwable;
private static native java.util.List __fieldRead1075_14(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native int __call1075_15(java.util.List a0, net.minecraft.client.resources.ResourcePackRepository$Entry a1) throws Throwable;
private static native java.util.List __fieldRead1075_16(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native int __call1075_17(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead1075_18(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native java.lang.Object __call1075_19(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.client.resources.ResourcePackRepository$Entry __cast1075_20(java.lang.Object a0) throws Throwable;
private static native boolean __call1075_21(java.util.ArrayList a0, net.minecraft.client.resources.ResourcePackRepository$Entry a1) throws Throwable;
private static native int __integerCategory1075_22(boolean value) throws Throwable;
private static native void __discardScalar1075_23(int a0) throws Throwable;
private static native java.util.List __fieldRead1075_24(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native boolean __call1075_25(java.util.List a0, java.util.ArrayList a1) throws Throwable;
private static native int __integerCategory1075_26(boolean value) throws Throwable;
private static native void __discardScalar1075_27(int a0) throws Throwable;
private static native java.util.List __fieldRead1075_28(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native java.util.Iterator __call1075_29(java.util.List a0) throws Throwable;
private static native boolean __call1075_30(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1075_31(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.resources.ResourcePackRepository$Entry __cast1075_32(java.lang.Object a0) throws Throwable;
private static native void __call1075_33(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native void __fieldWrite1075_34(net.minecraft.client.resources.ResourcePackRepository a0, java.util.ArrayList a1) throws Throwable;
private static native java.lang.Exception __call3107500_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3107501_0(java.lang.Exception a0) throws Throwable;
private static native boolean __call3107502_0(java.util.ArrayList a0, net.minecraft.client.resources.ResourcePackRepository$Entry a1) throws Throwable;
private static native java.util.List __fieldRead3107502_1(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native int __call3107502_2(java.util.List a0, net.minecraft.client.resources.ResourcePackRepository$Entry a1) throws Throwable;
private static native java.util.List __fieldRead3107502_3(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native int __call3107502_4(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead3107502_5(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native java.lang.Object __call3107502_6(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.client.resources.ResourcePackRepository$Entry __cast3107502_7(java.lang.Object a0) throws Throwable;
private static native boolean __call3107502_8(java.util.ArrayList a0, net.minecraft.client.resources.ResourcePackRepository$Entry a1) throws Throwable;
private static native int __integerCategory3107502_9(boolean value) throws Throwable;
private static native void __discardScalar3107502_10(int a0) throws Throwable;
private static native boolean __call3107502_11(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3107502_12(java.util.Iterator a0) throws Throwable;
private static native java.io.File __cast3107502_13(java.lang.Object a0) throws Throwable;
private static native java.util.List __fieldRead3107502_14(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native boolean __call3107502_15(java.util.List a0, net.minecraft.client.resources.ResourcePackRepository$Entry a1) throws Throwable;
private static native int __integerCategory3107502_16(boolean value) throws Throwable;
private static native int __integerCategory3107502_17(boolean value) throws Throwable;
private static native void __call3107502_18(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native boolean __call3107502_19(java.util.ArrayList a0, net.minecraft.client.resources.ResourcePackRepository$Entry a1) throws Throwable;
private static native boolean __call3107502_20(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3107502_21(java.util.Iterator a0) throws Throwable;
private static native java.io.File __cast3107502_22(java.lang.Object a0) throws Throwable;
private static native java.util.List __fieldRead3107502_23(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native boolean __call3107502_24(java.util.List a0, net.minecraft.client.resources.ResourcePackRepository$Entry a1) throws Throwable;
private static native int __integerCategory3107502_25(boolean value) throws Throwable;
private static native int __integerCategory3107502_26(boolean value) throws Throwable;
private static native void __call3107502_27(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native boolean __call3107502_28(java.util.ArrayList a0, net.minecraft.client.resources.ResourcePackRepository$Entry a1) throws Throwable;
private static native java.util.List __fieldRead3107502_29(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native int __call3107502_30(java.util.List a0, net.minecraft.client.resources.ResourcePackRepository$Entry a1) throws Throwable;
private static native java.util.List __fieldRead3107502_31(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native int __call3107502_32(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead3107502_33(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native java.lang.Object __call3107502_34(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.client.resources.ResourcePackRepository$Entry __cast3107502_35(java.lang.Object a0) throws Throwable;
private static native boolean __call3107502_36(java.util.ArrayList a0, net.minecraft.client.resources.ResourcePackRepository$Entry a1) throws Throwable;
private static native int __integerCategory3107502_37(boolean value) throws Throwable;
private static native void __discardScalar3107502_38(int a0) throws Throwable;
private static native java.util.List __fieldRead3107502_39(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native boolean __call3107502_40(java.util.List a0, java.util.ArrayList a1) throws Throwable;
private static native int __integerCategory3107502_41(boolean value) throws Throwable;
private static native void __discardScalar3107502_42(int a0) throws Throwable;
private static native java.util.List __fieldRead3107502_43(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native java.util.Iterator __call3107502_44(java.util.List a0) throws Throwable;
private static native boolean __call3107502_45(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3107502_46(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.resources.ResourcePackRepository$Entry __cast3107502_47(java.lang.Object a0) throws Throwable;
private static native void __call3107502_48(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native void __fieldWrite3107502_49(net.minecraft.client.resources.ResourcePackRepository a0, java.util.ArrayList a1) throws Throwable;
private static native java.lang.Exception __call3107503_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3107504_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3107505_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3107506_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3107507_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3107508_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_bc839e1aad7c194566ea(net.minecraft.client.resources.ResourcePackRepository a0) throws E;
private static final class __SourceHandler_bc839e1aad7c194566ea {

public static void f233(net.minecraft.client.resources.ResourcePackRepository receiver) throws Throwable {
    int lexicalValue233_45_0;
    java.lang.String[] spill233_0;
    int spill233_1;
    long life1_3;
    java.util.ArrayList life4_11;
    java.lang.String[] life3_12;
    int life5_17;
    java.util.Iterator life6_20;
    java.io.File life7_27;
    lexical_join_48: {
    life1_3 = (__fieldRead233_0() ^ 111985477323572L);
    spill233_0 = __call233_1();
    life4_11 = __call233_5(__call233_4(__fieldRead233_2(receiver), __fieldRead233_3(), null));
    life3_12 = spill233_0;
    __call233_7(life4_11, __fieldRead233_6());
    life5_17 = 0;
    life6_20 = __call233_8(life4_11);
    lexical_cycle_21: while (true) {
    lexical_join_46: {
    lexical_join_45: {
    if (!(__call233_9(life6_20))) {
        break lexical_join_48;
    }
    life7_27 = __cast233_11(__call233_10(life6_20));
    spill233_1 = (life5_17++);
    if (!((life3_12 != null))) {
        lexicalValue233_45_0 = spill233_1;
        break lexical_join_45;
    }
    if (!((spill233_1 >= __invokedynamic233_12(8810, (8748505535396674844L ^ life1_3))))) {
        break lexical_join_46;
    }
    __call233_16(__fieldRead233_13(), __invokedynamic233_15(__call233_14(life7_27)));
    lexicalValue233_45_0 = __integerCategory233_18(__call233_17(life7_27));
    }
    __discardScalar233_19(lexicalValue233_45_0);
    }
    if (!((life3_12 == null))) { continue lexical_cycle_21; }
    break lexical_cycle_21;
    }
    }
    return;
}
public static void h233_0(moom.Oo p0) throws Throwable {
    throw __call1023300_0(p0);
}
public static void h233_1(moom.Oo p0) throws Throwable {
    throw __call1023301_0(p0);
}
private static native long __fieldRead233_0() throws Throwable;
private static native java.lang.String[] __call233_1() throws Throwable;
private static native java.io.File __fieldRead233_2(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native org.apache.commons.io.filefilter.IOFileFilter __fieldRead233_3() throws Throwable;
private static native java.util.Collection __call233_4(java.io.File a0, org.apache.commons.io.filefilter.IOFileFilter a1, java.lang.Object a2) throws Throwable;
private static native java.util.ArrayList __call233_5(java.util.Collection a0) throws Throwable;
private static native java.util.Comparator __fieldRead233_6() throws Throwable;
private static native void __call233_7(java.util.ArrayList a0, java.util.Comparator a1) throws Throwable;
private static native java.util.Iterator __call233_8(java.util.ArrayList a0) throws Throwable;
private static native boolean __call233_9(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call233_10(java.util.Iterator a0) throws Throwable;
private static native java.io.File __cast233_11(java.lang.Object a0) throws Throwable;
private static native int __invokedynamic233_12(int a0, long a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead233_13() throws Throwable;
private static native java.lang.String __call233_14(java.io.File a0) throws Throwable;
private static native java.lang.String __invokedynamic233_15(java.lang.String a0) throws Throwable;
private static native void __call233_16(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native boolean __call233_17(java.io.File a0) throws Throwable;
private static native int __integerCategory233_18(boolean value) throws Throwable;
private static native void __discardScalar233_19(int a0) throws Throwable;
private static native java.lang.Exception __call1023300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1023301_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b9d093e2cd30a5d5cef0(net.minecraft.client.resources.ResourcePackRepository a0) throws E;
private static final class __SourceHandler_b9d093e2cd30a5d5cef0 {

public static void f552(net.minecraft.client.resources.ResourcePackRepository receiver) throws Throwable {
    net.minecraft.client.resources.ResourcePackRepository forwardValue552_23_0;
    net.minecraft.client.resources.ResourcePackRepository forwardValue552_34_0;
    java.lang.String[] spill552_0;
    net.minecraft.client.resources.ResourcePackRepository spill552_1;
    long life1_3;
    java.lang.String[] life3_8;
    forward_join_34: {
    forward_join_33: {
    forward_join_23: {
    forward_join_19: {
    life1_3 = (__fieldRead552_0() ^ 111341891566150L);
    spill552_0 = __call552_1();
    __call552_3(__fieldRead552_2(receiver));
    life3_8 = spill552_0;
    spill552_1 = receiver;
    if (!((life3_8 != null))) {
        forwardValue552_23_0 = spill552_1;
        break forward_join_23;
    }
    if (!((__fieldRead552_4(spill552_1) != null))) {
        break forward_join_19;
    }
    __call552_6(__fieldRead552_5(receiver), 1);
    }
    __fieldWrite552_7(receiver, null);
    forwardValue552_23_0 = receiver;
    }
    if (!((life3_8 != null))) {
        forwardValue552_34_0 = forwardValue552_23_0;
        break forward_join_34;
    }
    if (!((__fieldRead552_8(forwardValue552_23_0) != null))) {
        break forward_join_33;
    }
    __fieldWrite552_9(receiver, null);
    __call552_11(__call552_10());
    }
    forwardValue552_34_0 = receiver;
    }
    __call552_13(__fieldRead552_12(forwardValue552_34_0));
    return;
}
public static void h552_0(moom.Oo p0) throws Throwable {
    throw __call2055200_0(p0);
}
public static void h552_1(moom.Oo p0) throws Throwable {
    throw __call2055201_0(p0);
}
public static void h552_2(moom.Oo p0) throws Throwable {
    throw __call2055202_0(p0);
}
public static void h552_3(moom.Oo p0) throws Throwable {
    throw __call2055203_0(p0);
}
public static void h552_4(java.lang.Throwable p0, net.minecraft.client.resources.ResourcePackRepository p1) throws Throwable {
    java.lang.Throwable local2 = p0;
    __call2055204_1(__fieldRead2055204_0(p1));
    throw local2;
}
private static native long __fieldRead552_0() throws Throwable;
private static native java.lang.String[] __call552_1() throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __fieldRead552_2(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native void __call552_3(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFuture __fieldRead552_4(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFuture __fieldRead552_5(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native boolean __call552_6(com.google.common.util.concurrent.ListenableFuture a0, int a1) throws Throwable;
private static native void __fieldWrite552_7(net.minecraft.client.resources.ResourcePackRepository a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.client.resources.IResourcePack __fieldRead552_8(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native void __fieldWrite552_9(net.minecraft.client.resources.ResourcePackRepository a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.client.Minecraft __call552_10() throws Throwable;
private static native com.google.common.util.concurrent.ListenableFuture __call552_11(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __fieldRead552_12(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native void __call552_13(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native java.lang.Exception __call2055200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2055201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2055202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2055203_0(moom.Oo a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __fieldRead2055204_0(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native void __call2055204_1(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_4a387cd88d437f1e8463(java.io.File a0) throws E;
private static final class __SourceHandler_4a387cd88d437f1e8463 {

public static boolean f1428(java.io.File p0) throws Throwable {
    int forwardValue1428_15_0;
    int forwardValue1428_19_0;
    int forwardValue1428_21_0;
    int forwardValue1428_33_0;
    int forwardValue1428_37_0;
    int forwardValue1428_39_0;
    int forwardValue1428_49_0;
    int forwardValue1428_51_0;
    boolean spill1428_0;
    boolean spill1428_1;
    int spill1428_2;
    int spill1428_3;
    long life1_3;
    java.lang.String[] life3_5;
    int life4_30;
    int life5_57;
    forward_join_51: {
    forward_join_50: {
    forward_join_49: {
    forward_join_48: {
    forward_join_39: {
    forward_join_38: {
    forward_join_37: {
    forward_join_33: {
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_15: {
    life1_3 = (__fieldRead1428_0() ^ 100151000317608L);
    life3_5 = __call1428_1();
    spill1428_0 = __call1428_2(p0);
    if (!((life3_5 != null))) {
        forwardValue1428_15_0 = __integerCategory1428_3(spill1428_0);
        break forward_join_15;
    }
    if (!(spill1428_0)) {
        break forward_join_20;
    }
    forwardValue1428_15_0 = __integerCategory1428_6(__call1428_5(__call1428_4(p0), ".zip"));
    }
    if (!((life3_5 != null))) {
        forwardValue1428_19_0 = forwardValue1428_15_0;
        break forward_join_19;
    }
    if (!((forwardValue1428_15_0 != 0))) {
        break forward_join_20;
    }
    forwardValue1428_19_0 = 1;
    }
    forwardValue1428_21_0 = forwardValue1428_19_0;
    break forward_join_21;
    }
    forwardValue1428_21_0 = 0;
    }
    life4_30 = forwardValue1428_21_0;
    spill1428_1 = __call1428_7(p0);
    if (!((life3_5 != null))) {
        forwardValue1428_33_0 = __integerCategory1428_8(spill1428_1);
        break forward_join_33;
    }
    if (!(spill1428_1)) {
        break forward_join_38;
    }
    forwardValue1428_33_0 = __integerCategory1428_10(__call1428_9(new java.io.File(p0, "pack.mcmeta")));
    }
    if (!((life3_5 != null))) {
        forwardValue1428_37_0 = forwardValue1428_33_0;
        break forward_join_37;
    }
    if (!((forwardValue1428_33_0 != 0))) {
        break forward_join_38;
    }
    forwardValue1428_37_0 = 1;
    }
    forwardValue1428_39_0 = forwardValue1428_37_0;
    break forward_join_39;
    }
    forwardValue1428_39_0 = 0;
    }
    life5_57 = forwardValue1428_39_0;
    spill1428_2 = life4_30;
    if (!((life3_5 != null))) {
        forwardValue1428_49_0 = spill1428_2;
        break forward_join_49;
    }
    if (!((spill1428_2 == 0))) {
        break forward_join_48;
    }
    spill1428_3 = life5_57;
    if (!((life3_5 != null))) {
        forwardValue1428_49_0 = spill1428_3;
        break forward_join_49;
    }
    if (!((spill1428_3 != 0))) {
        break forward_join_50;
    }
    }
    forwardValue1428_49_0 = 1;
    }
    forwardValue1428_51_0 = forwardValue1428_49_0;
    break forward_join_51;
    }
    forwardValue1428_51_0 = 0;
    }
    return __integerCategory1428_11(forwardValue1428_51_0);
}
public static void h1428_0(moom.Oo p0) throws Throwable {
    throw __call1142800_0(p0);
}
public static void h1428_1(moom.Oo p0) throws Throwable {
    throw __call1142801_0(p0);
}
public static void h1428_2(moom.Oo p0) throws Throwable {
    throw __call1142802_0(p0);
}
public static void h1428_3(moom.Oo p0) throws Throwable {
    throw __call1142803_0(p0);
}
public static void h1428_4(moom.Oo p0) throws Throwable {
    throw __call1142804_0(p0);
}
public static void h1428_5(moom.Oo p0) throws Throwable {
    throw __call1142805_0(p0);
}
public static void h1428_6(moom.Oo p0) throws Throwable {
    throw __call1142806_0(p0);
}
public static void h1428_7(moom.Oo p0) throws Throwable {
    throw __call1142807_0(p0);
}
public static void h1428_8(moom.Oo p0) throws Throwable {
    throw __call1142808_0(p0);
}
private static native long __fieldRead1428_0() throws Throwable;
private static native java.lang.String[] __call1428_1() throws Throwable;
private static native boolean __call1428_2(java.io.File a0) throws Throwable;
private static native int __integerCategory1428_3(boolean value) throws Throwable;
private static native java.lang.String __call1428_4(java.io.File a0) throws Throwable;
private static native boolean __call1428_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1428_6(boolean value) throws Throwable;
private static native boolean __call1428_7(java.io.File a0) throws Throwable;
private static native int __integerCategory1428_8(boolean value) throws Throwable;
private static native boolean __call1428_9(java.io.File a0) throws Throwable;
private static native int __integerCategory1428_10(boolean value) throws Throwable;
private static native boolean __integerCategory1428_11(int value) throws Throwable;
private static native java.lang.Exception __call1142800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1142801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1142802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1142803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1142804_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1142805_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1142806_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1142807_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1142808_0(moom.Oo a0) throws Throwable;

}


public java.util.List<net.minecraft.client.resources.ResourcePackRepository$Entry> b() {
return com.google.common.collect.ImmutableList.copyOf(((java.util.Collection)(this.j)));
}


public void b__Void() { __sourceHandlerCall_1ef12da3d9ff625967d4(this); }


public java.util.List<net.minecraft.client.resources.ResourcePackRepository$Entry> c() {
return com.google.common.collect.ImmutableList.copyOf(((java.util.Collection)(this.k)));
}


private void c__Void() { __sourceHandlerCall_bc839e1aad7c194566ea(this); }


public void d() { __sourceHandlerCall_b9d093e2cd30a5d5cef0(this); }


public net.minecraft.client.resources.IResourcePack a__oT() {
return this.g;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10879_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/o1"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.resources.ResourcePackRepository.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 6030;
      if (n[var3] == null) {
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
         long var5 = m[var3];
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
         Object[] var9 = (Object[])o.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               o.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/o1", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         n[var3] = var15;
      }

      return n[var3];
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.io.File a() {
return this.c;
}


public void a(java.util.List<net.minecraft.client.resources.ResourcePackRepository$Entry> p0) {
((java.util.List)(this.k)).clear();
    ((java.util.List)(this.k)).addAll(((java.util.Collection)(p0)));
    return;
}


private java.util.List<java.io.File> a__List() { return __sourceHandlerCall_6c43736ef09fb83b33db(this); }


private void a__Void() { __sourceHandlerCall_ba9eb8d09442fcd8e2ad(this); }


public com.google.common.util.concurrent.ListenableFuture<java.lang.Object> a(java.io.File p0) {
this.g = ((net.minecraft.client.resources.IResourcePack)(new moom.oH(p0)));
    return ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__ListenableFuture();
}


public com.google.common.util.concurrent.ListenableFuture<java.lang.Object> a(java.lang.String p0, java.lang.String p1) { return __sourceHandlerCall_2ae5262693c91cccf4e4(this, p0, p1); }


private static boolean lambda$static$0(java.io.File p0) { return __sourceHandlerCall_4a387cd88d437f1e8463(p0); }


private static void lambda$downloadResourcePack$1(net.minecraft.client.Minecraft p0, moom.g7 p1) {
((net.minecraft.client.Minecraft)(p0)).a(((net.minecraft.client.gui.GuiScreen)(p1)));
    return;
}


private static native <E extends Throwable> java.io.FileFilter __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1178_41() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10879_0() throws E;
}
