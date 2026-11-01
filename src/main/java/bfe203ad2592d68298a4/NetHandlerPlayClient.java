package net.minecraft.client.network;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class NetHandlerPlayClient implements moom.y2 {

private static org.apache.logging.log4j.Logger a;

private net.minecraft.network.NetworkManager b;

private com.mojang.authlib.GameProfile c;

private net.minecraft.client.gui.GuiScreen d;

private java.util.Map<java.util.UUID, moom.jX> e;

private java.util.Random f;

public int g;

private net.minecraft.client.Minecraft h;

private net.minecraft.client.multiplayer.WorldClient i;

public boolean j;

private boolean k;

private static boolean l;

private static long m;

private static long[] n;

private static java.lang.Integer[] o;

private static java.util.Map p;

public NetHandlerPlayClient(net.minecraft.client.Minecraft p0, net.minecraft.client.gui.GuiScreen p1, net.minecraft.network.NetworkManager p2, com.mojang.authlib.GameProfile p3) { super(); }

private static void __sourceConstructorBody_194c380879ec2dca(net.minecraft.client.network.NetHandlerPlayClient receiver, net.minecraft.client.Minecraft p0, net.minecraft.client.gui.GuiScreen p1, net.minecraft.network.NetworkManager p2, com.mojang.authlib.GameProfile p3) throws Throwable {
long local5 = (net.minecraft.client.network.NetHandlerPlayClient.m ^ 31324429225118L);
    net.minecraft.client.network.NetHandlerPlayClient.__sourceConstructorInit_194c380879ec2dca_0(((net.minecraft.client.network.NetHandlerPlayClient)(receiver)));
    ((net.minecraft.client.network.NetHandlerPlayClient)(receiver)).e = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    ((net.minecraft.client.network.NetHandlerPlayClient)(receiver)).f = ((java.util.Random)(new java.util.Random()));
    ((net.minecraft.client.network.NetHandlerPlayClient)(receiver)).g = ((int)(__sourceIntrinsic_194c380879ec2dca_originalDynamicSite3724_5(27980, (2623114492259967568L ^ local5))));
    ((net.minecraft.client.network.NetHandlerPlayClient)(receiver)).k = ((boolean)(false));
    ((net.minecraft.client.network.NetHandlerPlayClient)(receiver)).h = ((net.minecraft.client.Minecraft)(p0));
    ((net.minecraft.client.network.NetHandlerPlayClient)(receiver)).d = ((net.minecraft.client.gui.GuiScreen)(p1));
    ((net.minecraft.client.network.NetHandlerPlayClient)(receiver)).b = ((net.minecraft.network.NetworkManager)(p2));
    ((net.minecraft.client.network.NetHandlerPlayClient)(receiver)).c = ((com.mojang.authlib.GameProfile)(p3));
    return;
}


static {
m = ((long)(((moom._a)(moom._c.a(((long)(3858921666179016909L)), ((long)(6528033074864269957L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(204190374897732L)))));
    p = ((java.util.Map)(new java.util.HashMap(13)));
    int __sourceSpill1798_7 = 0;
    long local0_life8 = (net.minecraft.client.network.NetHandlerPlayClient.m ^ 76454158605679L);
    net.minecraft.client.network.NetHandlerPlayClient.b(((boolean)__sourceIntrinsic_integerToBoolean((__sourceSpill1798_7))));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1798_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1798_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1798_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1798_16 = new byte[8];
    (__sourceSpill1798_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1798_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1798_18 = __sourceSpill1798_16;
    ((javax.crypto.Cipher)(__sourceSpill1798_13)).init(((int)(__sourceSpill1798_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1798_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1798_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[38];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "û&¾²\t|ñùN&'¶u\036t\003-U\004b\002|i®;R!?ÐÕHøËZ8Þ\017¡$O|ÑNcÉmz\036ulRd\000âF[·»Gv»¾á)áÕeâw·ZØæêGh,Ç¦@°ãË>ç¨|S¦¢y©\035ÿ\027aCæ¯W|\"\nh°·\023\013ÝMr\030º~g@·º(¹âm®4B\000jýå3¬ßUÈùá/n«Ì8¿{¡³óõaÊ,p³}Æ°¦\002~Ê\0356DÓÎu\007ç2\027©÷ë&J+OçZJ\\\030/¹Q\032~\021Ú\006q©Ù¢¡É\020+é|f$Ö\001ÌH\021öæß½SL\\ÏkØ\017&£\022'K\røR´'º¬\033Z\024A\bTýì\022S×Ð¡}\031\025Øà[æ"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1798_27 = local6_life23;
        int __sourceSpill1798_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1798_27)).substring(((int)(__sourceSpill1798_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1798_32 = local8_life21;
        int __sourceSpill1798_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1798_35 = new byte[8];
        (__sourceSpill1798_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1798_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1798_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1798_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1798_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1798_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1798_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1798_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1798_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1798_36)).doFinal(((byte[])(__sourceSpill1798_35)));
        (__sourceSpill1798_32)[__sourceSpill1798_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "¬y¬?Dg\0208DQ\\Z"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1798_40 = local6_life23;
        int __sourceSpill1798_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1798_40)).substring(((int)(__sourceSpill1798_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1798_45 = local8_life21;
        int __sourceSpill1798_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill1798_48 = new byte[8];
        (__sourceSpill1798_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill1798_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill1798_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill1798_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill1798_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill1798_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill1798_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill1798_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill1798_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill1798_49)).doFinal(((byte[])(__sourceSpill1798_48)));
        (__sourceSpill1798_45)[__sourceSpill1798_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    n = ((long[])(local8_life21));
    o = ((java.lang.Integer[])(new java.lang.Integer[38]));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}

private static native <E extends Throwable> void __sourceConstructorInit_194c380879ec2dca_0(net.minecraft.client.network.NetHandlerPlayClient a0) throws E;
private static native <E extends Throwable> moom.jX __sourceHandlerCall_b23ee560e32ef2b76096(net.minecraft.client.network.NetHandlerPlayClient a0, java.lang.String a1) throws E;
private static final class __SourceHandler_b23ee560e32ef2b76096 {

public static moom.jX f1348(net.minecraft.client.network.NetHandlerPlayClient receiver, java.lang.String p0) throws Throwable {
    moom.jX lexicalValue1348_27_0;
    boolean spill1348_0;
    moom.jX spill1348_1;
    long life2_3;
    java.util.Iterator life5_9;
    int life4_10;
    moom.jX life6_17;
    lexical_join_30: {
    life2_3 = (__fieldRead1348_0() ^ 123501677692373L);
    spill1348_0 = __call1348_1();
    life5_9 = __call1348_4(__call1348_3(__fieldRead1348_2(receiver)));
    life4_10 = __integerCategory1348_5(spill1348_0);
    lexical_cycle_11: while (true) {
    lexical_join_28: {
    lexical_join_27: {
    if (!(__call1348_6(life5_9))) {
        break lexical_join_30;
    }
    life6_17 = __cast1348_8(__call1348_7(life5_9));
    spill1348_1 = life6_17;
    if (!((life4_10 != 0))) {
        lexicalValue1348_27_0 = spill1348_1;
        break lexical_join_27;
    }
    if (!(__call1348_11(__call1348_10(__call1348_9(spill1348_1)), p0))) {
        break lexical_join_28;
    }
    lexicalValue1348_27_0 = life6_17;
    }
    return lexicalValue1348_27_0;
    }
    if (!((life4_10 == 0))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    return null;
}
public static void h1348_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1134800_0(p0);
}
public static void h1348_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1134801_0(p0);
}
private static native long __fieldRead1348_0() throws Throwable;
private static native boolean __call1348_1() throws Throwable;
private static native java.util.Map __fieldRead1348_2(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native java.util.Collection __call1348_3(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call1348_4(java.util.Collection a0) throws Throwable;
private static native int __integerCategory1348_5(boolean value) throws Throwable;
private static native boolean __call1348_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1348_7(java.util.Iterator a0) throws Throwable;
private static native moom.jX __cast1348_8(java.lang.Object a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call1348_9(moom.jX a0) throws Throwable;
private static native java.lang.String __call1348_10(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native boolean __call1348_11(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.Throwable __call1134800_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1134801_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_122e0fa576625425a519(net.minecraft.client.network.NetHandlerPlayClient a0, moom.AG a1) throws E;
private static final class __SourceHandler_122e0fa576625425a519 {

public static void f994(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.AG p0) throws Throwable {
    net.minecraft.util.IChatComponent forestValue994_25_0;
    java.lang.String forestValue994_28_0;
    boolean spill994_0;
    net.minecraft.util.IChatComponent spill994_1;
    long life2_3;
    net.minecraft.network.play.server.S45PacketTitle$Type life5_11;
    java.lang.String life6_13;
    java.lang.String life7_16;
    int life4_17;
    java.lang.String life8_30;
    forest_join_54: {
    forest_join_40: {
    forest_join_37: {
    forest_join_34: {
    forest_join_28: {
    forest_join_27: {
    forest_join_25: {
    life2_3 = (__fieldRead994_0() ^ 91798475578703L);
    __call994_2(p0, receiver, __fieldRead994_1(receiver));
    life5_11 = __call994_3(p0);
    life6_13 = null;
    spill994_0 = __call994_4();
    life7_16 = null;
    life4_17 = __integerCategory994_5(spill994_0);
    spill994_1 = __call994_6(p0);
    if (!((life4_17 != 0))) {
        forestValue994_25_0 = spill994_1;
        break forest_join_25;
    }
    if (!((spill994_1 != null))) {
        break forest_join_27;
    }
    forestValue994_25_0 = __call994_7(p0);
    }
    forestValue994_28_0 = __call994_8(forestValue994_25_0);
    break forest_join_28;
    }
    forestValue994_28_0 = "";
    }
    life8_30 = forestValue994_28_0;
    switch ((__fieldRead994_9())[__call994_10(life5_11)]) {
case 1:
{
        break forest_join_34;
    }
case 2:
{
        break forest_join_37;
    }
case 3:
{
        break forest_join_40;
    }
default:
{
        break forest_join_54;
    }
}
    }
    life6_13 = life8_30;
    break forest_join_54;
    }
    life7_16 = life8_30;
    break forest_join_54;
    }
    __call994_13(__fieldRead994_12(__fieldRead994_11(receiver)), "", "", -1, -1, -1);
    __call994_16(__fieldRead994_15(__fieldRead994_14(receiver)));
    return;
    }
    __call994_22(__fieldRead994_18(__fieldRead994_17(receiver)), life6_13, life7_16, __call994_19(p0), __call994_20(p0), __call994_21(p0));
    return;
}
public static void h994_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3099400_0(p0);
}
public static void h994_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3099401_0(p0);
}
private static native long __fieldRead994_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead994_1(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call994_2(moom.AG a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native net.minecraft.network.play.server.S45PacketTitle$Type __call994_3(moom.AG a0) throws Throwable;
private static native boolean __call994_4() throws Throwable;
private static native int __integerCategory994_5(boolean value) throws Throwable;
private static native net.minecraft.util.IChatComponent __call994_6(moom.AG a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call994_7(moom.AG a0) throws Throwable;
private static native java.lang.String __call994_8(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native int[] __fieldRead994_9() throws Throwable;
private static native int __call994_10(net.minecraft.network.play.server.S45PacketTitle$Type a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead994_11(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead994_12(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call994_13(net.minecraft.client.gui.GuiIngame a0, java.lang.String a1, java.lang.String a2, int a3, int a4, int a5) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead994_14(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead994_15(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call994_16(net.minecraft.client.gui.GuiIngame a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead994_17(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead994_18(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __call994_19(moom.AG a0) throws Throwable;
private static native int __call994_20(moom.AG a0) throws Throwable;
private static native int __call994_21(moom.AG a0) throws Throwable;
private static native void __call994_22(net.minecraft.client.gui.GuiIngame a0, java.lang.String a1, java.lang.String a2, int a3, int a4, int a5) throws Throwable;
private static native java.lang.Throwable __call3099400_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3099401_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_3f8902344e043fcd59d8(net.minecraft.client.network.NetHandlerPlayClient a0, moom.AH a1) throws E;
private static final class __SourceHandler_3f8902344e043fcd59d8 {

public static void f1350(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.AH p0) throws Throwable {
    net.minecraft.network.NetworkManager forwardValue1350_14_0;
    net.minecraft.network.NetworkManager spill1350_0;
    long life2_3;
    int life4_5;
    forward_join_17: {
    forward_join_14: {
    life2_3 = (__fieldRead1350_0() ^ 56667904173461L);
    life4_5 = __integerCategory1350_2(__call1350_1());
    spill1350_0 = __fieldRead1350_3(receiver);
    if (!((life4_5 != 0))) {
        forwardValue1350_14_0 = spill1350_0;
        break forward_join_14;
    }
    if (!((!__call1350_4(spill1350_0)))) {
        break forward_join_17;
    }
    forwardValue1350_14_0 = __fieldRead1350_5(receiver);
    }
    __call1350_7(forwardValue1350_14_0, __call1350_6(p0));
    }
    return;
}
public static void h1350_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135000_0(p0);
}
public static void h1350_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135001_0(p0);
}
private static native long __fieldRead1350_0() throws Throwable;
private static native boolean __call1350_1() throws Throwable;
private static native int __integerCategory1350_2(boolean value) throws Throwable;
private static native net.minecraft.network.NetworkManager __fieldRead1350_3(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native boolean __call1350_4(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native net.minecraft.network.NetworkManager __fieldRead1350_5(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call1350_6(moom.AH a0) throws Throwable;
private static native void __call1350_7(net.minecraft.network.NetworkManager a0, int a1) throws Throwable;
private static native java.lang.Throwable __call1135000_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135001_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_7b54dd1d43feca49995f(net.minecraft.client.network.NetHandlerPlayClient a0, moom.AI a1) throws E;
private static final class __SourceHandler_7b54dd1d43feca49995f {

public static void f1351(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.AI p0) throws Throwable {
    moom.gD forwardValue1351_19_0;
    moom.gD forwardValue1351_20_0;
    moom.AI forwardValue1351_20_1;
    moom.gD forwardValue1351_21_0;
    net.minecraft.util.IChatComponent forwardValue1351_21_1;
    moom.gD forwardValue1351_35_0;
    moom.gD forwardValue1351_36_0;
    moom.AI forwardValue1351_36_1;
    moom.gD forwardValue1351_37_0;
    net.minecraft.util.IChatComponent forwardValue1351_37_1;
    moom.gD spill1351_0;
    moom.AI spill1351_1;
    moom.gD spill1351_2;
    moom.AI spill1351_3;
    long life2_3;
    int life4_5;
    forward_join_37: {
    forward_join_36: {
    forward_join_35: {
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life2_3 = (__fieldRead1351_0() ^ 98364414517390L);
    life4_5 = __integerCategory1351_2(__call1351_1());
    spill1351_0 = __call1351_5(__fieldRead1351_4(__fieldRead1351_3(receiver)));
    spill1351_1 = p0;
    if (!((life4_5 != 0))) {
        forwardValue1351_20_0 = spill1351_0;
        forwardValue1351_20_1 = spill1351_1;
        break forward_join_20;
    }
    if (!((__call1351_8(__call1351_7(__call1351_6(spill1351_1))) == 0))) {
        forwardValue1351_19_0 = spill1351_0;
        break forward_join_19;
    }
    forwardValue1351_21_0 = spill1351_0;
    forwardValue1351_21_1 = null;
    break forward_join_21;
    }
    forwardValue1351_20_0 = forwardValue1351_19_0;
    forwardValue1351_20_1 = p0;
    }
    forwardValue1351_21_0 = forwardValue1351_20_0;
    forwardValue1351_21_1 = __call1351_9(forwardValue1351_20_1);
    }
    __call1351_10(forwardValue1351_21_0, forwardValue1351_21_1);
    spill1351_2 = __call1351_13(__fieldRead1351_12(__fieldRead1351_11(receiver)));
    spill1351_3 = p0;
    if (!((life4_5 != 0))) {
        forwardValue1351_36_0 = spill1351_2;
        forwardValue1351_36_1 = spill1351_3;
        break forward_join_36;
    }
    if (!((__call1351_16(__call1351_15(__call1351_14(spill1351_3))) == 0))) {
        forwardValue1351_35_0 = spill1351_2;
        break forward_join_35;
    }
    forwardValue1351_37_0 = spill1351_2;
    forwardValue1351_37_1 = null;
    break forward_join_37;
    }
    forwardValue1351_36_0 = forwardValue1351_35_0;
    forwardValue1351_36_1 = p0;
    }
    forwardValue1351_37_0 = forwardValue1351_36_0;
    forwardValue1351_37_1 = __call1351_17(forwardValue1351_36_1);
    }
    __call1351_18(forwardValue1351_37_0, forwardValue1351_37_1);
    return;
}
public static void h1351_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135100_0(p0);
}
public static void h1351_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135101_0(p0);
}
public static void h1351_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135102_0(p0);
}
public static void h1351_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135103_0(p0);
}
private static native long __fieldRead1351_0() throws Throwable;
private static native boolean __call1351_1() throws Throwable;
private static native int __integerCategory1351_2(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1351_3(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead1351_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.gD __call1351_5(net.minecraft.client.gui.GuiIngame a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1351_6(moom.AI a0) throws Throwable;
private static native java.lang.String __call1351_7(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native int __call1351_8(java.lang.String a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1351_9(moom.AI a0) throws Throwable;
private static native void __call1351_10(moom.gD a0, net.minecraft.util.IChatComponent a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1351_11(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead1351_12(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.gD __call1351_13(net.minecraft.client.gui.GuiIngame a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1351_14(moom.AI a0) throws Throwable;
private static native java.lang.String __call1351_15(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native int __call1351_16(java.lang.String a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1351_17(moom.AI a0) throws Throwable;
private static native void __call1351_18(moom.gD a0, net.minecraft.util.IChatComponent a1) throws Throwable;
private static native java.lang.Throwable __call1135100_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135101_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135102_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135103_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_dbccc3a672ef8702b338(net.minecraft.client.network.NetHandlerPlayClient a0, moom.AJ a1) throws E;
private static final class __SourceHandler_dbccc3a672ef8702b338 {

public static void f1352(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.AJ p0) throws Throwable {
    java.lang.String forwardValue1352_20_0;
    java.lang.String forwardValue1352_20_1;
    moom.jL forwardValue1352_116_0;
    net.minecraft.client.Minecraft forwardValue1352_137_0;
    boolean spill1352_0;
    java.lang.String spill1352_1;
    java.lang.String spill1352_2;
    moom.jL spill1352_3;
    moom.jL spill1352_4;
    net.minecraft.client.Minecraft spill1352_5;
    net.minecraft.client.Minecraft spill1352_6;
    long life2_3;
    java.lang.String life5_6;
    java.lang.String life6_10;
    int life4_11;
    java.lang.String life7_28;
    java.io.File life8_36;
    java.io.File life9_42;
    forward_join_143: {
    forward_join_137: {
    forward_join_135: {
    forward_join_116: {
    forward_join_111: {
    forward_join_74: {
    forward_join_72: {
    forward_join_64: {
    forward_join_62: {
    forward_join_20: {
    life2_3 = (__fieldRead1352_0() ^ 35562969983414L);
    life5_6 = __call1352_1(p0);
    spill1352_0 = __call1352_2();
    life6_10 = __call1352_3(p0);
    life4_11 = __integerCategory1352_4(spill1352_0);
    spill1352_1 = life5_6;
    spill1352_2 = "level://";
    if (!((life4_11 != 0))) {
        forwardValue1352_20_0 = spill1352_1;
        forwardValue1352_20_1 = spill1352_2;
        break forward_join_20;
    }
    if (!(__call1352_5(spill1352_1, spill1352_2))) {
        break forward_join_74;
    }
    forwardValue1352_20_0 = life5_6;
    forwardValue1352_20_1 = "level://";
    }
    life7_28 = __call1352_7(forwardValue1352_20_0, __call1352_6(forwardValue1352_20_1));
    life8_36 = new java.io.File(__fieldRead1352_9(__fieldRead1352_8(receiver)), "saves");
    life9_42 = new java.io.File(life8_36, life7_28);
    if (!((life4_11 != 0))) {
        break forward_join_62;
    }
    if (!(__call1352_10(life9_42))) {
        break forward_join_64;
    }
    __call1352_13(__fieldRead1352_11(receiver), new moom.zs(life6_10, __fieldRead1352_12()));
    __call1352_18(__call1352_16(__call1352_15(__fieldRead1352_14(receiver)), life9_42), new moom.jT(receiver, life6_10), __call1352_17());
    }
    if (!((life4_11 == 0))) {
        break forward_join_72;
    }
    }
    __call1352_21(__fieldRead1352_19(receiver), new moom.zs(life6_10, __fieldRead1352_20()));
    }
    if (!((life4_11 == 0))) {
        break forward_join_143;
    }
    }
    spill1352_3 = __call1352_23(__fieldRead1352_22(receiver));
    if (!((life4_11 != 0))) {
        forwardValue1352_116_0 = spill1352_3;
        break forward_join_116;
    }
    if (!((spill1352_3 != null))) {
        break forward_join_111;
    }
    spill1352_4 = __call1352_25(__fieldRead1352_24(receiver));
    if (!((life4_11 != 0))) {
        forwardValue1352_116_0 = spill1352_4;
        break forward_join_116;
    }
    if (!((__call1352_26(spill1352_4) == __fieldRead1352_27()))) {
        break forward_join_111;
    }
    __call1352_30(__fieldRead1352_28(receiver), new moom.zs(life6_10, __fieldRead1352_29()));
    __call1352_35(__call1352_33(__call1352_32(__fieldRead1352_31(receiver)), life5_6, life6_10), new moom.jU(receiver, life6_10), __call1352_34());
    if (!((life4_11 == 0))) {
        break forward_join_143;
    }
    }
    spill1352_5 = __fieldRead1352_36(receiver);
    if (!((life4_11 != 0))) {
        forwardValue1352_137_0 = spill1352_5;
        break forward_join_137;
    }
    forwardValue1352_116_0 = __call1352_37(spill1352_5);
    }
    if (!((forwardValue1352_116_0 != null))) {
        break forward_join_135;
    }
    spill1352_6 = __fieldRead1352_38(receiver);
    if (!((life4_11 != 0))) {
        forwardValue1352_137_0 = spill1352_6;
        break forward_join_137;
    }
    if (!((__call1352_40(__call1352_39(spill1352_6)) != __fieldRead1352_41()))) {
        break forward_join_135;
    }
    __call1352_44(__fieldRead1352_42(receiver), new moom.zs(life6_10, __fieldRead1352_43()));
    if (!((life4_11 == 0))) {
        break forward_join_143;
    }
    }
    forwardValue1352_137_0 = __fieldRead1352_45(receiver);
    }
    __call1352_47(forwardValue1352_137_0, __invokedynamic1352_46(receiver, life6_10, life5_6));
    }
    return;
}
public static void h1352_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135200_0(p0);
}
public static void h1352_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135201_0(p0);
}
public static void h1352_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135202_0(p0);
}
public static void h1352_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135203_0(p0);
}
public static void h1352_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135204_0(p0);
}
public static void h1352_5(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135205_0(p0);
}
public static void h1352_6(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135206_0(p0);
}
public static void h1352_7(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135207_0(p0);
}
public static void h1352_8(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135208_0(p0);
}
public static void h1352_9(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135209_0(p0);
}
public static void h1352_10(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135210_0(p0);
}
public static void h1352_11(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135211_0(p0);
}
public static void h1352_12(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135212_0(p0);
}
public static void h1352_13(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135213_0(p0);
}
public static void h1352_14(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135214_0(p0);
}
public static void h1352_15(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135215_0(p0);
}
private static native long __fieldRead1352_0() throws Throwable;
private static native java.lang.String __call1352_1(moom.AJ a0) throws Throwable;
private static native boolean __call1352_2() throws Throwable;
private static native java.lang.String __call1352_3(moom.AJ a0) throws Throwable;
private static native int __integerCategory1352_4(boolean value) throws Throwable;
private static native boolean __call1352_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __call1352_6(java.lang.String a0) throws Throwable;
private static native java.lang.String __call1352_7(java.lang.String a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1352_8(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native java.io.File __fieldRead1352_9(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call1352_10(java.io.File a0) throws Throwable;
private static native net.minecraft.network.NetworkManager __fieldRead1352_11(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.network.play.client.C19PacketResourcePackStatus$Action __fieldRead1352_12() throws Throwable;
private static native void __call1352_13(net.minecraft.network.NetworkManager a0, moom.zs a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1352_14(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.resources.ResourcePackRepository __call1352_15(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFuture __call1352_16(net.minecraft.client.resources.ResourcePackRepository a0, java.io.File a1) throws Throwable;
private static native java.util.concurrent.Executor __call1352_17() throws Throwable;
private static native void __call1352_18(com.google.common.util.concurrent.ListenableFuture a0, moom.jT a1, java.util.concurrent.Executor a2) throws Throwable;
private static native net.minecraft.network.NetworkManager __fieldRead1352_19(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.network.play.client.C19PacketResourcePackStatus$Action __fieldRead1352_20() throws Throwable;
private static native void __call1352_21(net.minecraft.network.NetworkManager a0, moom.zs a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1352_22(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native moom.jL __call1352_23(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1352_24(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native moom.jL __call1352_25(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.az __call1352_26(moom.jL a0) throws Throwable;
private static native moom.az __fieldRead1352_27() throws Throwable;
private static native net.minecraft.network.NetworkManager __fieldRead1352_28(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.network.play.client.C19PacketResourcePackStatus$Action __fieldRead1352_29() throws Throwable;
private static native void __call1352_30(net.minecraft.network.NetworkManager a0, moom.zs a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1352_31(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.resources.ResourcePackRepository __call1352_32(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFuture __call1352_33(net.minecraft.client.resources.ResourcePackRepository a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.util.concurrent.Executor __call1352_34() throws Throwable;
private static native void __call1352_35(com.google.common.util.concurrent.ListenableFuture a0, moom.jU a1, java.util.concurrent.Executor a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1352_36(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native moom.jL __call1352_37(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1352_38(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native moom.jL __call1352_39(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.az __call1352_40(moom.jL a0) throws Throwable;
private static native moom.az __fieldRead1352_41() throws Throwable;
private static native net.minecraft.network.NetworkManager __fieldRead1352_42(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.network.play.client.C19PacketResourcePackStatus$Action __fieldRead1352_43() throws Throwable;
private static native void __call1352_44(net.minecraft.network.NetworkManager a0, moom.zs a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1352_45(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native java.lang.Runnable __invokedynamic1352_46(net.minecraft.client.network.NetHandlerPlayClient a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFuture __call1352_47(net.minecraft.client.Minecraft a0, java.lang.Runnable a1) throws Throwable;
private static native java.lang.Throwable __call1135200_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135201_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135202_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135203_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135204_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135205_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135206_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135207_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135208_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135209_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135210_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135211_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135212_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135213_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135214_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135215_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_28eb5927f6a47fea1b63(net.minecraft.client.network.NetHandlerPlayClient a0, moom.AK a1) throws E;
private static final class __SourceHandler_28eb5927f6a47fea1b63 {

public static void f1353(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.AK p0) throws Throwable {
    net.minecraft.entity.Entity forwardValue1353_21_0;
    boolean spill1353_0;
    net.minecraft.entity.Entity spill1353_1;
    long life2_3;
    net.minecraft.entity.Entity life5_14;
    int life4_15;
    forward_join_24: {
    forward_join_21: {
    life2_3 = (__fieldRead1353_0() ^ 127363737228969L);
    __call1353_2(p0, receiver, __fieldRead1353_1(receiver));
    spill1353_0 = __call1353_3();
    life5_14 = __call1353_5(p0, __fieldRead1353_4(receiver));
    life4_15 = __integerCategory1353_6(spill1353_0);
    spill1353_1 = life5_14;
    if (!((life4_15 != 0))) {
        forwardValue1353_21_0 = spill1353_1;
        break forward_join_21;
    }
    if (!((spill1353_1 != null))) {
        break forward_join_24;
    }
    forwardValue1353_21_0 = life5_14;
    }
    __call1353_8(forwardValue1353_21_0, __call1353_7(p0));
    }
    return;
}
public static void h1353_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135300_0(p0);
}
private static native long __fieldRead1353_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1353_1(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1353_2(moom.AK a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native boolean __call1353_3() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1353_4(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.entity.Entity __call1353_5(moom.AK a0, net.minecraft.client.multiplayer.WorldClient a1) throws Throwable;
private static native int __integerCategory1353_6(boolean value) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call1353_7(moom.AK a0) throws Throwable;
private static native void __call1353_8(net.minecraft.entity.Entity a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native java.lang.Throwable __call1135300_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c229d4ed1c400690ffa1(net.minecraft.client.network.NetHandlerPlayClient a0, moom.Ab a1) throws E;
private static final class __SourceHandler_c229d4ed1c400690ffa1 {

public static void f996(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.Ab p0) throws Throwable {
    int forestValue996_58_0;
    boolean spill996_0;
    int spill996_1;
    long life2_3;
    int life4_10;
    double life5_23;
    double life7_30;
    double life9_37;
    int life5_61;
    double life6_73;
    double life8_81;
    double life10_89;
    double life12_97;
    double life14_105;
    double life16_113;
    forest_join_138: {
    forest_join_58: {
    forest_join_57: {
    life2_3 = (__fieldRead996_0() ^ 119576124292866L);
    spill996_0 = __call996_1();
    __call996_3(p0, receiver, __fieldRead996_2(receiver));
    life4_10 = __integerCategory996_4(spill996_0);
    spill996_1 = __call996_5(p0);
    if (!((life4_10 == 0))) {
        forestValue996_58_0 = spill996_1;
        break forest_join_58;
    }
    if (!((spill996_1 == 0))) {
        break forest_join_57;
    }
    life5_23 = ((double) (__call996_6(p0) * __call996_7(p0)));
    life7_30 = ((double) (__call996_8(p0) * __call996_9(p0)));
    life9_37 = ((double) (__call996_10(p0) * __call996_11(p0)));
    __call996_19(__fieldRead996_12(receiver), __call996_13(p0), __call996_14(p0), __call996_15(p0), __call996_16(p0), __call996_17(p0), life5_23, life7_30, life9_37, __call996_18(p0));
    if (!((life4_10 != 0))) {
        break forest_join_138;
    }
    }
    forestValue996_58_0 = 0;
    }
    life5_61 = forestValue996_58_0;
    forest_cycle_59: while (true) {
    if (!((life5_61 < __call996_20(p0)))) {
        break forest_join_138;
    }
    life6_73 = (__call996_22(__fieldRead996_21(receiver)) * ((double) __call996_23(p0)));
    life8_81 = (__call996_25(__fieldRead996_24(receiver)) * ((double) __call996_26(p0)));
    life10_89 = (__call996_28(__fieldRead996_27(receiver)) * ((double) __call996_29(p0)));
    life12_97 = (__call996_31(__fieldRead996_30(receiver)) * ((double) __call996_32(p0)));
    life14_105 = (__call996_34(__fieldRead996_33(receiver)) * ((double) __call996_35(p0)));
    life16_113 = (__call996_37(__fieldRead996_36(receiver)) * ((double) __call996_38(p0)));
    __call996_46(__fieldRead996_39(receiver), __call996_40(p0), __call996_41(p0), (__call996_42(p0) + life6_73), (__call996_43(p0) + life8_81), (__call996_44(p0) + life10_89), life12_97, life14_105, life16_113, __call996_45(p0));
    life5_61 += 1;
    if (!((life4_10 != 0))) {
        continue forest_cycle_59;
    }
    break forest_cycle_59;
    }
    }
    return;
}
public static void h996_0(java.lang.Throwable p0) throws Throwable {
    throw __call3099600_0(p0);
}
public static void h996_1(java.lang.Throwable p0, net.minecraft.client.network.NetHandlerPlayClient p1, moom.Ab p2, int p3, double p4, double p5, double p6, double p7, double p8, double p9) throws Throwable {
    java.lang.Throwable life17_2;
    int life16_12;
    double life4_24;
    double life6_32;
    double life8_40;
    double life10_48;
    double life12_56;
    double life14_64;
    forest_join_90: {
    life17_2 = p0;
    __call3099601_3(__fieldRead3099601_0(), __invokedynamic3099601_2(__call3099601_1(p2)));
    if (!((p3 != 0))) {
        break forest_join_90;
    }
    life16_12 = 0;
    forest_cycle_11: while (true) {
    if (!((life16_12 < __call3099601_4(p2)))) {
        break forest_join_90;
    }
    life4_24 = (__call3099601_6(__fieldRead3099601_5(p1)) * ((double) __call3099601_7(p2)));
    life6_32 = (__call3099601_9(__fieldRead3099601_8(p1)) * ((double) __call3099601_10(p2)));
    life8_40 = (__call3099601_12(__fieldRead3099601_11(p1)) * ((double) __call3099601_13(p2)));
    life10_48 = (__call3099601_15(__fieldRead3099601_14(p1)) * ((double) __call3099601_16(p2)));
    life12_56 = (__call3099601_18(__fieldRead3099601_17(p1)) * ((double) __call3099601_19(p2)));
    life14_64 = (__call3099601_21(__fieldRead3099601_20(p1)) * ((double) __call3099601_22(p2)));
    __call3099601_30(__fieldRead3099601_23(p1), __call3099601_24(p2), __call3099601_25(p2), (__call3099601_26(p2) + life4_24), (__call3099601_27(p2) + life6_32), (__call3099601_28(p2) + life8_40), life10_48, life12_56, life14_64, __call3099601_29(p2));
    life16_12 += 1;
    if (!((p3 != 0))) {
        continue forest_cycle_11;
    }
    break forest_cycle_11;
    }
    }
    return;
}
public static void h996_2(java.lang.Throwable p0) throws Throwable {
    throw __call3099602_0(p0);
}
public static void h996_3(java.lang.Throwable p0, moom.Ab p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3099603_3(__fieldRead3099603_0(), __invokedynamic3099603_2(__call3099603_1(p1)));
    return;
}
private static native long __fieldRead996_0() throws Throwable;
private static native boolean __call996_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead996_2(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call996_3(moom.Ab a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native int __integerCategory996_4(boolean value) throws Throwable;
private static native int __call996_5(moom.Ab a0) throws Throwable;
private static native float __call996_6(moom.Ab a0) throws Throwable;
private static native float __call996_7(moom.Ab a0) throws Throwable;
private static native float __call996_8(moom.Ab a0) throws Throwable;
private static native float __call996_9(moom.Ab a0) throws Throwable;
private static native float __call996_10(moom.Ab a0) throws Throwable;
private static native float __call996_11(moom.Ab a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead996_12(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __call996_13(moom.Ab a0) throws Throwable;
private static native boolean __call996_14(moom.Ab a0) throws Throwable;
private static native double __call996_15(moom.Ab a0) throws Throwable;
private static native double __call996_16(moom.Ab a0) throws Throwable;
private static native double __call996_17(moom.Ab a0) throws Throwable;
private static native int[] __call996_18(moom.Ab a0) throws Throwable;
private static native void __call996_19(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.util.EnumParticleTypes a1, boolean a2, double a3, double a4, double a5, double a6, double a7, double a8, int[] a9) throws Throwable;
private static native int __call996_20(moom.Ab a0) throws Throwable;
private static native java.util.Random __fieldRead996_21(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native double __call996_22(java.util.Random a0) throws Throwable;
private static native float __call996_23(moom.Ab a0) throws Throwable;
private static native java.util.Random __fieldRead996_24(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native double __call996_25(java.util.Random a0) throws Throwable;
private static native float __call996_26(moom.Ab a0) throws Throwable;
private static native java.util.Random __fieldRead996_27(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native double __call996_28(java.util.Random a0) throws Throwable;
private static native float __call996_29(moom.Ab a0) throws Throwable;
private static native java.util.Random __fieldRead996_30(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native double __call996_31(java.util.Random a0) throws Throwable;
private static native float __call996_32(moom.Ab a0) throws Throwable;
private static native java.util.Random __fieldRead996_33(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native double __call996_34(java.util.Random a0) throws Throwable;
private static native float __call996_35(moom.Ab a0) throws Throwable;
private static native java.util.Random __fieldRead996_36(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native double __call996_37(java.util.Random a0) throws Throwable;
private static native float __call996_38(moom.Ab a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead996_39(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __call996_40(moom.Ab a0) throws Throwable;
private static native boolean __call996_41(moom.Ab a0) throws Throwable;
private static native double __call996_42(moom.Ab a0) throws Throwable;
private static native double __call996_43(moom.Ab a0) throws Throwable;
private static native double __call996_44(moom.Ab a0) throws Throwable;
private static native int[] __call996_45(moom.Ab a0) throws Throwable;
private static native void __call996_46(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.util.EnumParticleTypes a1, boolean a2, double a3, double a4, double a5, double a6, double a7, double a8, int[] a9) throws Throwable;
private static native java.lang.Throwable __call3099600_0(java.lang.Throwable a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3099601_0() throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __call3099601_1(moom.Ab a0) throws Throwable;
private static native java.lang.String __invokedynamic3099601_2(net.minecraft.util.EnumParticleTypes a0) throws Throwable;
private static native void __call3099601_3(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native int __call3099601_4(moom.Ab a0) throws Throwable;
private static native java.util.Random __fieldRead3099601_5(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native double __call3099601_6(java.util.Random a0) throws Throwable;
private static native float __call3099601_7(moom.Ab a0) throws Throwable;
private static native java.util.Random __fieldRead3099601_8(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native double __call3099601_9(java.util.Random a0) throws Throwable;
private static native float __call3099601_10(moom.Ab a0) throws Throwable;
private static native java.util.Random __fieldRead3099601_11(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native double __call3099601_12(java.util.Random a0) throws Throwable;
private static native float __call3099601_13(moom.Ab a0) throws Throwable;
private static native java.util.Random __fieldRead3099601_14(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native double __call3099601_15(java.util.Random a0) throws Throwable;
private static native float __call3099601_16(moom.Ab a0) throws Throwable;
private static native java.util.Random __fieldRead3099601_17(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native double __call3099601_18(java.util.Random a0) throws Throwable;
private static native float __call3099601_19(moom.Ab a0) throws Throwable;
private static native java.util.Random __fieldRead3099601_20(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native double __call3099601_21(java.util.Random a0) throws Throwable;
private static native float __call3099601_22(moom.Ab a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead3099601_23(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __call3099601_24(moom.Ab a0) throws Throwable;
private static native boolean __call3099601_25(moom.Ab a0) throws Throwable;
private static native double __call3099601_26(moom.Ab a0) throws Throwable;
private static native double __call3099601_27(moom.Ab a0) throws Throwable;
private static native double __call3099601_28(moom.Ab a0) throws Throwable;
private static native int[] __call3099601_29(moom.Ab a0) throws Throwable;
private static native void __call3099601_30(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.util.EnumParticleTypes a1, boolean a2, double a3, double a4, double a5, double a6, double a7, double a8, int[] a9) throws Throwable;
private static native java.lang.Throwable __call3099602_0(java.lang.Throwable a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3099603_0() throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __call3099603_1(moom.Ab a0) throws Throwable;
private static native java.lang.String __invokedynamic3099603_2(net.minecraft.util.EnumParticleTypes a0) throws Throwable;
private static native void __call3099603_3(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_470120fa1aa8cc317ad0(net.minecraft.client.network.NetHandlerPlayClient a0, moom.Ac a1) throws E;
private static final class __SourceHandler_470120fa1aa8cc317ad0 {

public static void f1354(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.Ac p0) throws Throwable {
    int forwardValue1354_51_0;
    int forwardValue1354_52_0;
    int forwardValue1354_52_1;
    int forwardValue1354_68_0;
    int forwardValue1354_68_1;
    int forwardValue1354_84_0;
    int forwardValue1354_84_1;
    int forwardValue1354_97_0;
    int forwardValue1354_97_1;
    int forwardValue1354_110_0;
    int forwardValue1354_110_1;
    int forwardValue1354_134_0;
    int forwardValue1354_181_0;
    int forwardValue1354_207_0;
    int forwardValue1354_234_0;
    int forwardValue1354_234_1;
    int forwardValue1354_262_0;
    int forwardValue1354_262_1;
    int forwardValue1354_277_0;
    int forwardValue1354_277_1;
    int forwardValue1354_292_0;
    int forwardValue1354_292_1;
    boolean spill1354_0;
    int spill1354_1;
    int spill1354_2;
    int spill1354_3;
    int spill1354_4;
    long life2_3;
    net.minecraft.client.entity.EntityPlayerSP life5_12;
    int life6_16;
    float life7_19;
    int life8_24;
    int life4_25;
    net.minecraft.client.settings.GameSettings life9_170;
    forward_join_321: {
    forward_join_292: {
    forward_join_286: {
    forward_join_277: {
    forward_join_271: {
    forward_join_262: {
    forward_join_256: {
    forward_join_234: {
    forward_join_228: {
    forward_join_226: {
    forward_join_207: {
    forward_join_204: {
    forward_join_181: {
    forward_join_178: {
    forward_join_134: {
    forward_join_131: {
    forward_join_110: {
    forward_join_108: {
    forward_join_97: {
    forward_join_95: {
    forward_join_84: {
    forward_join_82: {
    forward_join_68: {
    forward_join_66: {
    forward_join_52: {
    forward_join_51: {
    forward_join_50: {
    life2_3 = (__fieldRead1354_0() ^ 69270647408308L);
    __call1354_2(p0, receiver, __fieldRead1354_1(receiver));
    life5_12 = __fieldRead1354_4(__fieldRead1354_3(receiver));
    spill1354_0 = __call1354_5();
    life6_16 = __call1354_6(p0);
    life7_19 = __call1354_7(p0);
    life8_24 = __call1354_8((life7_19 + 0x1.0p-1f));
    life4_25 = __integerCategory1354_9(spill1354_0);
    spill1354_1 = life6_16;
    if (!((life4_25 != 0))) {
        forwardValue1354_51_0 = spill1354_1;
        break forward_join_51;
    }
    if (!((spill1354_1 >= 0))) {
        break forward_join_50;
    }
    spill1354_2 = life6_16;
    spill1354_3 = (__fieldRead1354_10()).length;
    if (!((life4_25 != 0))) {
        forwardValue1354_52_0 = spill1354_2;
        forwardValue1354_52_1 = spill1354_3;
        break forward_join_52;
    }
    if (!((spill1354_2 < spill1354_3))) {
        break forward_join_50;
    }
    if (!(((__fieldRead1354_11())[life6_16] != null))) {
        break forward_join_50;
    }
    __call1354_13(life5_12, new moom.CN((__fieldRead1354_12())[life6_16], new java.lang.Object[0]));
    }
    forwardValue1354_51_0 = life6_16;
    }
    forwardValue1354_52_0 = forwardValue1354_51_0;
    forwardValue1354_52_1 = 1;
    }
    if (!((life4_25 != 0))) {
        forwardValue1354_68_0 = forwardValue1354_52_0;
        forwardValue1354_68_1 = forwardValue1354_52_1;
        break forward_join_68;
    }
    if (!((forwardValue1354_52_0 == forwardValue1354_52_1))) {
        break forward_join_66;
    }
    __call1354_16(__call1354_15(__fieldRead1354_14(receiver)), 1);
    __call1354_18(__fieldRead1354_17(receiver), 0x0.0p0f);
    if (!((life4_25 == 0))) {
        break forward_join_321;
    }
    }
    forwardValue1354_68_0 = life6_16;
    forwardValue1354_68_1 = 2;
    }
    if (!((life4_25 != 0))) {
        forwardValue1354_84_0 = forwardValue1354_68_0;
        forwardValue1354_84_1 = forwardValue1354_68_1;
        break forward_join_84;
    }
    if (!((forwardValue1354_68_0 == forwardValue1354_68_1))) {
        break forward_join_82;
    }
    __call1354_21(__call1354_20(__fieldRead1354_19(receiver)), 0);
    __call1354_23(__fieldRead1354_22(receiver), 0x1.0p0f);
    if (!((life4_25 == 0))) {
        break forward_join_321;
    }
    }
    forwardValue1354_84_0 = life6_16;
    forwardValue1354_84_1 = 3;
    }
    if (!((life4_25 != 0))) {
        forwardValue1354_97_0 = forwardValue1354_84_0;
        forwardValue1354_97_1 = forwardValue1354_84_1;
        break forward_join_97;
    }
    if (!((forwardValue1354_84_0 == forwardValue1354_84_1))) {
        break forward_join_95;
    }
    __call1354_27(__fieldRead1354_25(__fieldRead1354_24(receiver)), __call1354_26(life8_24));
    if (!((life4_25 == 0))) {
        break forward_join_321;
    }
    }
    forwardValue1354_97_0 = life6_16;
    forwardValue1354_97_1 = 4;
    }
    if (!((life4_25 != 0))) {
        forwardValue1354_110_0 = forwardValue1354_97_0;
        forwardValue1354_110_1 = forwardValue1354_97_1;
        break forward_join_110;
    }
    if (!((forwardValue1354_97_0 == forwardValue1354_97_1))) {
        break forward_join_108;
    }
    __call1354_29(__fieldRead1354_28(receiver), new net.minecraft.client.gui.GuiWinGame());
    if (!((life4_25 == 0))) {
        break forward_join_321;
    }
    }
    forwardValue1354_110_0 = life6_16;
    forwardValue1354_110_1 = 5;
    }
    if (!((life4_25 != 0))) {
        forwardValue1354_234_0 = forwardValue1354_110_0;
        forwardValue1354_234_1 = forwardValue1354_110_1;
        break forward_join_234;
    }
    if (!((forwardValue1354_110_0 == forwardValue1354_110_1))) {
        break forward_join_228;
    }
    life9_170 = __fieldRead1354_31(__fieldRead1354_30(receiver));
    spill1354_4 = __numericCompare1354_32(life7_19, 0x0.0p0f);
    if (!((life4_25 != 0))) {
        forwardValue1354_134_0 = spill1354_4;
        break forward_join_134;
    }
    if (!((spill1354_4 == 0))) {
        break forward_join_131;
    }
    __call1354_34(__fieldRead1354_33(receiver), new net.minecraft.client.gui.GuiScreenDemo());
    if (!((life4_25 == 0))) {
        break forward_join_226;
    }
    }
    forwardValue1354_134_0 = __numericCompare1354_35(life7_19, 0x1.94p6f);
    }
    if (!((life4_25 != 0))) {
        forwardValue1354_181_0 = forwardValue1354_134_0;
        break forward_join_181;
    }
    if (!((forwardValue1354_134_0 == 0))) {
        break forward_join_178;
    }
    __call1354_51(__call1354_38(__fieldRead1354_37(__fieldRead1354_36(receiver))), new moom.CN("demo.help.movement", new java.lang.Object[] {__call1354_41(__call1354_40(__fieldRead1354_39(life9_170))), __call1354_44(__call1354_43(__fieldRead1354_42(life9_170))), __call1354_47(__call1354_46(__fieldRead1354_45(life9_170))), __call1354_50(__call1354_49(__fieldRead1354_48(life9_170)))}));
    if (!((life4_25 == 0))) {
        break forward_join_226;
    }
    }
    forwardValue1354_181_0 = __numericCompare1354_52(life7_19, 0x1.98p6f);
    }
    if (!((life4_25 != 0))) {
        forwardValue1354_207_0 = forwardValue1354_181_0;
        break forward_join_207;
    }
    if (!((forwardValue1354_181_0 == 0))) {
        break forward_join_204;
    }
    __call1354_59(__call1354_55(__fieldRead1354_54(__fieldRead1354_53(receiver))), new moom.CN("demo.help.jump", new java.lang.Object[] {__call1354_58(__call1354_57(__fieldRead1354_56(life9_170)))}));
    if (!((life4_25 == 0))) {
        break forward_join_226;
    }
    }
    forwardValue1354_207_0 = __numericCompare1354_60(life7_19, 0x1.9cp6f);
    }
    if (!((forwardValue1354_207_0 == 0))) {
        break forward_join_226;
    }
    __call1354_67(__call1354_63(__fieldRead1354_62(__fieldRead1354_61(receiver))), new moom.CN("demo.help.inventory", new java.lang.Object[] {__call1354_66(__call1354_65(__fieldRead1354_64(life9_170)))}));
    }
    if (!((life4_25 == 0))) {
        break forward_join_321;
    }
    }
    forwardValue1354_234_0 = life6_16;
    forwardValue1354_234_1 = __invokedynamic1354_68(16935, (679033006847461120L ^ life2_3));
    }
    if (!((life4_25 != 0))) {
        forwardValue1354_262_0 = forwardValue1354_234_0;
        forwardValue1354_262_1 = forwardValue1354_234_1;
        break forward_join_262;
    }
    if (!((forwardValue1354_234_0 == forwardValue1354_234_1))) {
        break forward_join_256;
    }
    __call1354_74(__fieldRead1354_69(receiver), __fieldRead1354_70(life5_12), (__fieldRead1354_71(life5_12) + ((double) __call1354_72(life5_12))), __fieldRead1354_73(life5_12), "random.successful_hit", 0x1.70a3d8p-3f, 0x1.ccccccp-2f, 0);
    if (!((life4_25 == 0))) {
        break forward_join_321;
    }
    }
    forwardValue1354_262_0 = life6_16;
    forwardValue1354_262_1 = __invokedynamic1354_75(23302, (8186492197280128524L ^ life2_3));
    }
    if (!((life4_25 != 0))) {
        forwardValue1354_277_0 = forwardValue1354_262_0;
        forwardValue1354_277_1 = forwardValue1354_262_1;
        break forward_join_277;
    }
    if (!((forwardValue1354_262_0 == forwardValue1354_262_1))) {
        break forward_join_271;
    }
    __call1354_77(__fieldRead1354_76(receiver), life7_19);
    if (!((life4_25 == 0))) {
        break forward_join_321;
    }
    }
    forwardValue1354_277_0 = life6_16;
    forwardValue1354_277_1 = __invokedynamic1354_78(13881, (6408955454220366614L ^ life2_3));
    }
    if (!((life4_25 != 0))) {
        forwardValue1354_292_0 = forwardValue1354_277_0;
        forwardValue1354_292_1 = forwardValue1354_277_1;
        break forward_join_292;
    }
    if (!((forwardValue1354_277_0 == forwardValue1354_277_1))) {
        break forward_join_286;
    }
    __call1354_80(__fieldRead1354_79(receiver), life7_19);
    if (!((life4_25 == 0))) {
        break forward_join_321;
    }
    }
    forwardValue1354_292_0 = life6_16;
    forwardValue1354_292_1 = __invokedynamic1354_81(11138, (3325524898486513315L ^ life2_3));
    }
    if (!((forwardValue1354_292_0 == forwardValue1354_292_1))) {
        break forward_join_321;
    }
    __call1354_87(__fieldRead1354_82(receiver), __fieldRead1354_83(), __fieldRead1354_84(life5_12), __fieldRead1354_85(life5_12), __fieldRead1354_86(life5_12), 0x0.0p0d, 0x0.0p0d, 0x0.0p0d, new int[0]);
    __call1354_92(__fieldRead1354_88(receiver), __fieldRead1354_89(life5_12), __fieldRead1354_90(life5_12), __fieldRead1354_91(life5_12), "mob.guardian.curse", 0x1.0p0f, 0x1.0p0f, 0);
    }
    return;
}
public static void h1354_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135400_0(p0);
}
public static void h1354_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135401_0(p0);
}
public static void h1354_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135402_0(p0);
}
public static void h1354_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135403_0(p0);
}
public static void h1354_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135404_0(p0);
}
public static void h1354_5(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135405_0(p0);
}
public static void h1354_6(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135406_0(p0);
}
public static void h1354_7(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135407_0(p0);
}
public static void h1354_8(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135408_0(p0);
}
public static void h1354_9(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135409_0(p0);
}
public static void h1354_10(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135410_0(p0);
}
public static void h1354_11(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135411_0(p0);
}
public static void h1354_12(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135412_0(p0);
}
public static void h1354_13(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135413_0(p0);
}
public static void h1354_14(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135414_0(p0);
}
public static void h1354_15(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135415_0(p0);
}
public static void h1354_16(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135416_0(p0);
}
public static void h1354_17(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135417_0(p0);
}
public static void h1354_18(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135418_0(p0);
}
public static void h1354_19(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135419_0(p0);
}
public static void h1354_20(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135420_0(p0);
}
public static void h1354_21(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135421_0(p0);
}
public static void h1354_22(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135422_0(p0);
}
public static void h1354_23(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135423_0(p0);
}
public static void h1354_24(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135424_0(p0);
}
public static void h1354_25(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135425_0(p0);
}
public static void h1354_26(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135426_0(p0);
}
public static void h1354_27(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135427_0(p0);
}
public static void h1354_28(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135428_0(p0);
}
public static void h1354_29(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135429_0(p0);
}
public static void h1354_30(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135430_0(p0);
}
public static void h1354_31(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135431_0(p0);
}
public static void h1354_32(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135432_0(p0);
}
public static void h1354_33(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135433_0(p0);
}
public static void h1354_34(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135434_0(p0);
}
public static void h1354_35(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135435_0(p0);
}
public static void h1354_36(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135436_0(p0);
}
public static void h1354_37(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135437_0(p0);
}
public static void h1354_38(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135438_0(p0);
}
private static native long __fieldRead1354_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1354_1(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1354_2(moom.Ac a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1354_3(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1354_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call1354_5() throws Throwable;
private static native int __call1354_6(moom.Ac a0) throws Throwable;
private static native float __call1354_7(moom.Ac a0) throws Throwable;
private static native int __call1354_8(float a0) throws Throwable;
private static native int __integerCategory1354_9(boolean value) throws Throwable;
private static native java.lang.String[] __fieldRead1354_10() throws Throwable;
private static native java.lang.String[] __fieldRead1354_11() throws Throwable;
private static native java.lang.String[] __fieldRead1354_12() throws Throwable;
private static native void __call1354_13(net.minecraft.client.entity.EntityPlayerSP a0, moom.CN a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1354_14(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call1354_15(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native void __call1354_16(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1354_17(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1354_18(net.minecraft.client.multiplayer.WorldClient a0, float a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1354_19(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call1354_20(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native void __call1354_21(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1354_22(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1354_23(net.minecraft.client.multiplayer.WorldClient a0, float a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1354_24(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native moom.jI __fieldRead1354_25(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __call1354_26(int a0) throws Throwable;
private static native void __call1354_27(moom.jI a0, net.minecraft.world.WorldSettings$GameType a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1354_28(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1354_29(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiWinGame a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1354_30(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1354_31(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __numericCompare1354_32(float a0, float a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1354_33(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1354_34(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiScreenDemo a1) throws Throwable;
private static native int __numericCompare1354_35(float a0, float a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1354_36(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead1354_37(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.gB __call1354_38(net.minecraft.client.gui.GuiIngame a0) throws Throwable;
private static native moom.pz __fieldRead1354_39(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __call1354_40(moom.pz a0) throws Throwable;
private static native java.lang.String __call1354_41(int a0) throws Throwable;
private static native moom.pz __fieldRead1354_42(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __call1354_43(moom.pz a0) throws Throwable;
private static native java.lang.String __call1354_44(int a0) throws Throwable;
private static native moom.pz __fieldRead1354_45(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __call1354_46(moom.pz a0) throws Throwable;
private static native java.lang.String __call1354_47(int a0) throws Throwable;
private static native moom.pz __fieldRead1354_48(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __call1354_49(moom.pz a0) throws Throwable;
private static native java.lang.String __call1354_50(int a0) throws Throwable;
private static native void __call1354_51(moom.gB a0, moom.CN a1) throws Throwable;
private static native int __numericCompare1354_52(float a0, float a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1354_53(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead1354_54(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.gB __call1354_55(net.minecraft.client.gui.GuiIngame a0) throws Throwable;
private static native moom.pz __fieldRead1354_56(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __call1354_57(moom.pz a0) throws Throwable;
private static native java.lang.String __call1354_58(int a0) throws Throwable;
private static native void __call1354_59(moom.gB a0, moom.CN a1) throws Throwable;
private static native int __numericCompare1354_60(float a0, float a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1354_61(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead1354_62(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.gB __call1354_63(net.minecraft.client.gui.GuiIngame a0) throws Throwable;
private static native moom.pz __fieldRead1354_64(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __call1354_65(moom.pz a0) throws Throwable;
private static native java.lang.String __call1354_66(int a0) throws Throwable;
private static native void __call1354_67(moom.gB a0, moom.CN a1) throws Throwable;
private static native int __invokedynamic1354_68(int a0, long a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1354_69(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native double __fieldRead1354_70(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native double __fieldRead1354_71(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native float __call1354_72(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native double __fieldRead1354_73(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native void __call1354_74(net.minecraft.client.multiplayer.WorldClient a0, double a1, double a2, double a3, java.lang.String a4, float a5, float a6, int a7) throws Throwable;
private static native int __invokedynamic1354_75(int a0, long a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1354_76(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1354_77(net.minecraft.client.multiplayer.WorldClient a0, float a1) throws Throwable;
private static native int __invokedynamic1354_78(int a0, long a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1354_79(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1354_80(net.minecraft.client.multiplayer.WorldClient a0, float a1) throws Throwable;
private static native int __invokedynamic1354_81(int a0, long a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1354_82(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead1354_83() throws Throwable;
private static native double __fieldRead1354_84(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native double __fieldRead1354_85(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native double __fieldRead1354_86(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native void __call1354_87(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.util.EnumParticleTypes a1, double a2, double a3, double a4, double a5, double a6, double a7, int[] a8) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1354_88(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native double __fieldRead1354_89(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native double __fieldRead1354_90(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native double __fieldRead1354_91(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native void __call1354_92(net.minecraft.client.multiplayer.WorldClient a0, double a1, double a2, double a3, java.lang.String a4, float a5, float a6, int a7) throws Throwable;
private static native java.lang.Throwable __call1135400_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135401_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135402_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135403_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135404_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135405_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135406_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135407_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135408_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135409_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135410_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135411_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135412_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135413_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135414_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135415_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135416_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135417_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135418_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135419_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135420_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135421_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135422_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135423_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135424_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135425_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135426_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135427_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135428_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135429_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135430_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135431_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135432_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135433_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135434_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135435_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135436_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135437_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135438_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f1b7307697e1de189080(net.minecraft.client.network.NetHandlerPlayClient a0, moom.Ad a1) throws E;
private static final class __SourceHandler_f1b7307697e1de189080 {

public static void f1355(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.Ad p0) throws Throwable {
    moom.tu forwardValue1355_67_0;
    boolean spill1355_0;
    moom.tu spill1355_1;
    long life2_3;
    double life5_14;
    double life7_21;
    double life9_27;
    moom.tu life11_29;
    int life4_30;
    forward_join_75: {
    forward_join_67: {
    forward_join_44: {
    life2_3 = (__fieldRead1355_0() ^ 59638299066985L);
    __call1355_2(p0, receiver, __fieldRead1355_1(receiver));
    life5_14 = (((double) __call1355_3(p0)) / 0x1.0p5d);
    spill1355_0 = __call1355_4();
    life7_21 = (((double) __call1355_5(p0)) / 0x1.0p5d);
    life9_27 = (((double) __call1355_6(p0)) / 0x1.0p5d);
    life11_29 = null;
    life4_30 = __integerCategory1355_7(spill1355_0);
    if (!((__call1355_8(p0) == 1))) {
        break forward_join_44;
    }
    life11_29 = new moom.tu(__fieldRead1355_9(receiver), life5_14, life7_21, life9_27);
    }
    spill1355_1 = life11_29;
    if (!((life4_30 != 0))) {
        forwardValue1355_67_0 = spill1355_1;
        break forward_join_67;
    }
    if (!((spill1355_1 != null))) {
        break forward_join_75;
    }
    __fieldWrite1355_11(life11_29, __call1355_10(p0));
    __fieldWrite1355_13(life11_29, __call1355_12(p0));
    __fieldWrite1355_15(life11_29, __call1355_14(p0));
    __fieldWrite1355_16(life11_29, 0x0.0p0f);
    __fieldWrite1355_17(life11_29, 0x0.0p0f);
    forwardValue1355_67_0 = life11_29;
    }
    __call1355_19(forwardValue1355_67_0, __call1355_18(p0));
    __call1355_21(__fieldRead1355_20(receiver), life11_29);
    }
    return;
}
public static void h1355_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135500_0(p0);
}
public static void h1355_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135501_0(p0);
}
private static native long __fieldRead1355_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1355_1(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1355_2(moom.Ad a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native int __call1355_3(moom.Ad a0) throws Throwable;
private static native boolean __call1355_4() throws Throwable;
private static native int __call1355_5(moom.Ad a0) throws Throwable;
private static native int __call1355_6(moom.Ad a0) throws Throwable;
private static native int __integerCategory1355_7(boolean value) throws Throwable;
private static native int __call1355_8(moom.Ad a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1355_9(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call1355_10(moom.Ad a0) throws Throwable;
private static native void __fieldWrite1355_11(moom.tu a0, int a1) throws Throwable;
private static native int __call1355_12(moom.Ad a0) throws Throwable;
private static native void __fieldWrite1355_13(moom.tu a0, int a1) throws Throwable;
private static native int __call1355_14(moom.Ad a0) throws Throwable;
private static native void __fieldWrite1355_15(moom.tu a0, int a1) throws Throwable;
private static native void __fieldWrite1355_16(moom.tu a0, float a1) throws Throwable;
private static native void __fieldWrite1355_17(moom.tu a0, float a1) throws Throwable;
private static native int __call1355_18(moom.Ad a0) throws Throwable;
private static native void __call1355_19(moom.tu a0, int a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1355_20(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native boolean __call1355_21(net.minecraft.client.multiplayer.WorldClient a0, moom.tu a1) throws Throwable;
private static native java.lang.Throwable __call1135500_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135501_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_52169311d00ed1ec3dbc(net.minecraft.client.network.NetHandlerPlayClient a0, moom.Ae a1) throws E;
private static final class __SourceHandler_52169311d00ed1ec3dbc {

public static void f1356(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.Ae p0) throws Throwable {
    int forwardValue1356_42_0;
    int forwardValue1356_64_0;
    int forwardValue1356_98_0;
    boolean spill1356_0;
    boolean spill1356_1;
    long life2_3;
    net.minecraft.client.entity.EntityPlayerSP life5_13;
    int life4_14;
    net.minecraft.entity.Entity life6_93;
    moom.wr life6_157;
    forward_join_133: {
    forward_join_115: {
    forward_join_98: {
    forward_join_96: {
    forward_join_94: {
    forward_join_89: {
    forward_join_64: {
    forward_join_60: {
    forward_join_42: {
    forward_join_38: {
    life2_3 = (__fieldRead1356_0() ^ 74555145587745L);
    spill1356_0 = __call1356_1();
    __call1356_3(p0, receiver, __fieldRead1356_2(receiver));
    life5_13 = __fieldRead1356_5(__fieldRead1356_4(receiver));
    life4_14 = __integerCategory1356_6(spill1356_0);
    spill1356_1 = __call1356_8("minecraft:container", __call1356_7(p0));
    if (!((life4_14 != 0))) {
        forwardValue1356_42_0 = __integerCategory1356_9(spill1356_1);
        break forward_join_42;
    }
    if (!(spill1356_1)) {
        break forward_join_38;
    }
    __call1356_12(life5_13, new moom.wq(__call1356_10(p0), __call1356_11(p0)));
    __fieldWrite1356_15(__fieldRead1356_13(life5_13), __call1356_14(p0));
    if (!((life4_14 == 0))) {
        break forward_join_133;
    }
    }
    forwardValue1356_42_0 = __integerCategory1356_18(__call1356_17("minecraft:villager", __call1356_16(p0)));
    }
    if (!((life4_14 != 0))) {
        forwardValue1356_64_0 = forwardValue1356_42_0;
        break forward_join_64;
    }
    if (!((forwardValue1356_42_0 != 0))) {
        break forward_join_60;
    }
    __call1356_20(life5_13, new moom.ua(life5_13, __call1356_19(p0)));
    __fieldWrite1356_23(__fieldRead1356_21(life5_13), __call1356_22(p0));
    if (!((life4_14 == 0))) {
        break forward_join_133;
    }
    }
    forwardValue1356_64_0 = __integerCategory1356_26(__call1356_25("EntityHorse", __call1356_24(p0)));
    }
    if (!((life4_14 != 0))) {
        forwardValue1356_98_0 = forwardValue1356_64_0;
        break forward_join_98;
    }
    if (!((forwardValue1356_64_0 != 0))) {
        break forward_join_96;
    }
    life6_93 = __call1356_29(__fieldRead1356_27(receiver), __call1356_28(p0));
    if (!((life4_14 != 0))) {
        break forward_join_89;
    }
    if (!((__instanceOf1356_30(life6_93) != 0))) {
        break forward_join_94;
    }
    __call1356_34(life5_13, __cast1356_31(life6_93), new moom.ws(__call1356_32(p0), __call1356_33(p0)));
    }
    __fieldWrite1356_37(__fieldRead1356_35(life5_13), __call1356_36(p0));
    }
    if (!((life4_14 == 0))) {
        break forward_join_133;
    }
    }
    forwardValue1356_98_0 = __integerCategory1356_39(__call1356_38(p0));
    }
    if (!((forwardValue1356_98_0 == 0))) {
        break forward_join_115;
    }
    __call1356_42(life5_13, new moom.kH(__call1356_40(p0), __call1356_41(p0)));
    __fieldWrite1356_45(__fieldRead1356_43(life5_13), __call1356_44(p0));
    if (!((life4_14 == 0))) {
        break forward_join_133;
    }
    }
    life6_157 = new moom.wr(__call1356_46(p0), __call1356_47(p0), __call1356_48(p0));
    __call1356_49(life5_13, life6_157);
    __fieldWrite1356_52(__fieldRead1356_50(life5_13), __call1356_51(p0));
    }
    return;
}
public static void h1356_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135600_0(p0);
}
public static void h1356_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135601_0(p0);
}
public static void h1356_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135602_0(p0);
}
public static void h1356_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135603_0(p0);
}
public static void h1356_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135604_0(p0);
}
public static void h1356_5(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135605_0(p0);
}
public static void h1356_6(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135606_0(p0);
}
public static void h1356_7(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135607_0(p0);
}
public static void h1356_8(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135608_0(p0);
}
public static void h1356_9(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135609_0(p0);
}
public static void h1356_10(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135610_0(p0);
}
private static native long __fieldRead1356_0() throws Throwable;
private static native boolean __call1356_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1356_2(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1356_3(moom.Ae a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1356_4(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1356_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __integerCategory1356_6(boolean value) throws Throwable;
private static native java.lang.String __call1356_7(moom.Ae a0) throws Throwable;
private static native boolean __call1356_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1356_9(boolean value) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1356_10(moom.Ae a0) throws Throwable;
private static native int __call1356_11(moom.Ae a0) throws Throwable;
private static native void __call1356_12(net.minecraft.client.entity.EntityPlayerSP a0, moom.wq a1) throws Throwable;
private static native moom.v8 __fieldRead1356_13(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __call1356_14(moom.Ae a0) throws Throwable;
private static native void __fieldWrite1356_15(moom.v8 a0, int a1) throws Throwable;
private static native java.lang.String __call1356_16(moom.Ae a0) throws Throwable;
private static native boolean __call1356_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1356_18(boolean value) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1356_19(moom.Ae a0) throws Throwable;
private static native void __call1356_20(net.minecraft.client.entity.EntityPlayerSP a0, moom.ua a1) throws Throwable;
private static native moom.v8 __fieldRead1356_21(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __call1356_22(moom.Ae a0) throws Throwable;
private static native void __fieldWrite1356_23(moom.v8 a0, int a1) throws Throwable;
private static native java.lang.String __call1356_24(moom.Ae a0) throws Throwable;
private static native boolean __call1356_25(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1356_26(boolean value) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1356_27(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call1356_28(moom.Ae a0) throws Throwable;
private static native net.minecraft.entity.Entity __call1356_29(net.minecraft.client.multiplayer.WorldClient a0, int a1) throws Throwable;
private static native int __instanceOf1356_30(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.passive.EntityHorse __cast1356_31(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1356_32(moom.Ae a0) throws Throwable;
private static native int __call1356_33(moom.Ae a0) throws Throwable;
private static native void __call1356_34(net.minecraft.client.entity.EntityPlayerSP a0, net.minecraft.entity.passive.EntityHorse a1, moom.ws a2) throws Throwable;
private static native moom.v8 __fieldRead1356_35(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __call1356_36(moom.Ae a0) throws Throwable;
private static native void __fieldWrite1356_37(moom.v8 a0, int a1) throws Throwable;
private static native boolean __call1356_38(moom.Ae a0) throws Throwable;
private static native int __integerCategory1356_39(boolean value) throws Throwable;
private static native java.lang.String __call1356_40(moom.Ae a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1356_41(moom.Ae a0) throws Throwable;
private static native void __call1356_42(net.minecraft.client.entity.EntityPlayerSP a0, moom.kH a1) throws Throwable;
private static native moom.v8 __fieldRead1356_43(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __call1356_44(moom.Ae a0) throws Throwable;
private static native void __fieldWrite1356_45(moom.v8 a0, int a1) throws Throwable;
private static native java.lang.String __call1356_46(moom.Ae a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1356_47(moom.Ae a0) throws Throwable;
private static native int __call1356_48(moom.Ae a0) throws Throwable;
private static native void __call1356_49(net.minecraft.client.entity.EntityPlayerSP a0, moom.wr a1) throws Throwable;
private static native moom.v8 __fieldRead1356_50(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __call1356_51(moom.Ae a0) throws Throwable;
private static native void __fieldWrite1356_52(moom.v8 a0, int a1) throws Throwable;
private static native java.lang.Throwable __call1135600_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135601_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135602_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135603_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135604_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135605_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135606_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135607_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135608_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135609_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135610_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_8e9e142bc7a56aab6b65(net.minecraft.client.network.NetHandlerPlayClient a0, moom.Ag a1) throws E;
private static final class __SourceHandler_8e9e142bc7a56aab6b65 {

public static void f1357(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.Ag p0) throws Throwable {
    int forwardValue1357_29_0;
    int forwardValue1357_50_0;
    int forwardValue1357_52_0;
    int forwardValue1357_55_0;
    net.minecraft.item.ItemStack forwardValue1357_104_0;
    int forwardValue1357_121_0;
    int forwardValue1357_126_0;
    int forwardValue1357_126_1;
    int forwardValue1357_129_0;
    int forwardValue1357_133_0;
    boolean spill1357_0;
    int spill1357_1;
    int spill1357_2;
    int spill1357_3;
    int spill1357_4;
    int spill1357_5;
    int spill1357_6;
    int spill1357_7;
    net.minecraft.item.ItemStack spill1357_8;
    net.minecraft.item.ItemStack spill1357_9;
    long life2_3;
    int life4_10;
    net.minecraft.client.entity.EntityPlayerSP life5_14;
    int life6_38;
    net.minecraft.client.gui.GuiScreen life8_42;
    moom.ht life7_53;
    net.minecraft.item.ItemStack life7_117;
    forward_join_141: {
    forward_join_134: {
    forward_join_133: {
    forward_join_129: {
    forward_join_126: {
    forward_join_121: {
    forward_join_119: {
    forward_join_117: {
    forward_join_110: {
    forward_join_104: {
    forward_join_102: {
    forward_join_55: {
    forward_join_53: {
    forward_join_52: {
    forward_join_51: {
    forward_join_50: {
    forward_join_29: {
    forward_join_28: {
    life2_3 = (__fieldRead1357_0() ^ 67422802955854L);
    spill1357_0 = __call1357_1();
    __call1357_3(p0, receiver, __fieldRead1357_2(receiver));
    life4_10 = __integerCategory1357_4(spill1357_0);
    life5_14 = __fieldRead1357_6(__fieldRead1357_5(receiver));
    spill1357_1 = __call1357_7(p0);
    if (!((life4_10 != 0))) {
        forwardValue1357_29_0 = spill1357_1;
        break forward_join_29;
    }
    if (!((spill1357_1 == -1))) {
        break forward_join_28;
    }
    __call1357_10(__fieldRead1357_8(life5_14), __call1357_9(p0));
    if (!((life4_10 == 0))) {
        break forward_join_141;
    }
    }
    forwardValue1357_29_0 = 0;
    }
    life6_38 = forwardValue1357_29_0;
    life8_42 = __fieldRead1357_12(__fieldRead1357_11(receiver));
    spill1357_2 = __instanceOf1357_13(life8_42);
    if (!((life4_10 != 0))) {
        forwardValue1357_55_0 = spill1357_2;
        break forward_join_55;
    }
    if (!((spill1357_2 != 0))) {
        break forward_join_53;
    }
    life7_53 = __cast1357_14(life8_42);
    spill1357_3 = __call1357_15(life7_53);
    if (!((life4_10 != 0))) {
        forwardValue1357_50_0 = spill1357_3;
        break forward_join_50;
    }
    if (!((spill1357_3 != __call1357_17(__fieldRead1357_16())))) {
        break forward_join_51;
    }
    forwardValue1357_50_0 = 1;
    }
    forwardValue1357_52_0 = forwardValue1357_50_0;
    break forward_join_52;
    }
    forwardValue1357_52_0 = 0;
    }
    life6_38 = forwardValue1357_52_0;
    }
    forwardValue1357_55_0 = __call1357_18(p0);
    }
    if (!((life4_10 != 0))) {
        forwardValue1357_121_0 = forwardValue1357_55_0;
        break forward_join_121;
    }
    if (!((forwardValue1357_55_0 == 0))) {
        break forward_join_119;
    }
    spill1357_4 = __call1357_19(p0);
    spill1357_5 = __invokedynamic1357_20(24682, (2278159357279366588L ^ life2_3));
    if (!((life4_10 != 0))) {
        forwardValue1357_126_0 = spill1357_4;
        forwardValue1357_126_1 = spill1357_5;
        break forward_join_126;
    }
    if (!((spill1357_4 >= spill1357_5))) {
        break forward_join_119;
    }
    spill1357_6 = __call1357_21(p0);
    spill1357_7 = __invokedynamic1357_22(23325, (2191696184619423442L ^ life2_3));
    if (!((life4_10 != 0))) {
        forwardValue1357_126_0 = spill1357_6;
        forwardValue1357_126_1 = spill1357_7;
        break forward_join_126;
    }
    if (!((spill1357_6 < spill1357_7))) {
        break forward_join_119;
    }
    life7_117 = __call1357_26(__call1357_25(__fieldRead1357_23(life5_14), __call1357_24(p0)));
    if (!((life4_10 != 0))) {
        break forward_join_117;
    }
    if (!((__call1357_27(p0) != null))) {
        break forward_join_110;
    }
    spill1357_8 = life7_117;
    if (!((life4_10 != 0))) {
        forwardValue1357_104_0 = spill1357_8;
        break forward_join_104;
    }
    if (!((spill1357_8 != null))) {
        break forward_join_102;
    }
    spill1357_9 = life7_117;
    if (!((life4_10 != 0))) {
        forwardValue1357_104_0 = spill1357_9;
        break forward_join_104;
    }
    if (!((__fieldRead1357_28(spill1357_9) < __fieldRead1357_30(__call1357_29(p0))))) {
        break forward_join_110;
    }
    }
    forwardValue1357_104_0 = __call1357_31(p0);
    }
    __fieldWrite1357_33(forwardValue1357_104_0, __invokedynamic1357_32(20042, (3913201304683594681L ^ life2_3)));
    }
    __call1357_37(__fieldRead1357_34(life5_14), __call1357_35(p0), __call1357_36(p0));
    }
    if (!((life4_10 == 0))) {
        break forward_join_141;
    }
    }
    forwardValue1357_121_0 = __call1357_38(p0);
    }
    if (!((life4_10 != 0))) {
        forwardValue1357_129_0 = forwardValue1357_121_0;
        break forward_join_129;
    }
    forwardValue1357_126_0 = forwardValue1357_121_0;
    forwardValue1357_126_1 = __fieldRead1357_40(__fieldRead1357_39(life5_14));
    }
    if (!((forwardValue1357_126_0 == forwardValue1357_126_1))) {
        break forward_join_141;
    }
    forwardValue1357_129_0 = __call1357_41(p0);
    }
    if (!((life4_10 != 0))) {
        forwardValue1357_133_0 = forwardValue1357_129_0;
        break forward_join_133;
    }
    if (!((forwardValue1357_129_0 == 0))) {
        break forward_join_134;
    }
    forwardValue1357_133_0 = life6_38;
    }
    if (!((forwardValue1357_133_0 == 0))) {
        break forward_join_141;
    }
    }
    __call1357_45(__fieldRead1357_42(life5_14), __call1357_43(p0), __call1357_44(p0));
    }
    return;
}
public static void h1357_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135700_0(p0);
}
public static void h1357_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135701_0(p0);
}
public static void h1357_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135702_0(p0);
}
public static void h1357_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135703_0(p0);
}
public static void h1357_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135704_0(p0);
}
public static void h1357_5(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135705_0(p0);
}
public static void h1357_6(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135706_0(p0);
}
public static void h1357_7(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135707_0(p0);
}
public static void h1357_8(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135708_0(p0);
}
public static void h1357_9(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135709_0(p0);
}
public static void h1357_10(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135710_0(p0);
}
public static void h1357_11(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135711_0(p0);
}
public static void h1357_12(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135712_0(p0);
}
public static void h1357_13(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135713_0(p0);
}
public static void h1357_14(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135714_0(p0);
}
public static void h1357_15(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135715_0(p0);
}
public static void h1357_16(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135716_0(p0);
}
public static void h1357_17(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135717_0(p0);
}
public static void h1357_18(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135718_0(p0);
}
public static void h1357_19(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135719_0(p0);
}
public static void h1357_20(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135720_0(p0);
}
public static void h1357_21(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135721_0(p0);
}
private static native long __fieldRead1357_0() throws Throwable;
private static native boolean __call1357_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1357_2(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1357_3(moom.Ag a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native int __integerCategory1357_4(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1357_5(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1357_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __call1357_7(moom.Ag a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead1357_8(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1357_9(moom.Ag a0) throws Throwable;
private static native void __call1357_10(net.minecraft.entity.player.InventoryPlayer a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1357_11(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead1357_12(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __instanceOf1357_13(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native moom.ht __cast1357_14(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native int __call1357_15(moom.ht a0) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead1357_16() throws Throwable;
private static native int __call1357_17(net.minecraft.creativetab.CreativeTabs a0) throws Throwable;
private static native int __call1357_18(moom.Ag a0) throws Throwable;
private static native int __call1357_19(moom.Ag a0) throws Throwable;
private static native int __invokedynamic1357_20(int a0, long a1) throws Throwable;
private static native int __call1357_21(moom.Ag a0) throws Throwable;
private static native int __invokedynamic1357_22(int a0, long a1) throws Throwable;
private static native moom.v8 __fieldRead1357_23(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __call1357_24(moom.Ag a0) throws Throwable;
private static native moom.wB __call1357_25(moom.v8 a0, int a1) throws Throwable;
private static native net.minecraft.item.ItemStack __call1357_26(moom.wB a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1357_27(moom.Ag a0) throws Throwable;
private static native int __fieldRead1357_28(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1357_29(moom.Ag a0) throws Throwable;
private static native int __fieldRead1357_30(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1357_31(moom.Ag a0) throws Throwable;
private static native int __invokedynamic1357_32(int a0, long a1) throws Throwable;
private static native void __fieldWrite1357_33(net.minecraft.item.ItemStack a0, int a1) throws Throwable;
private static native moom.v8 __fieldRead1357_34(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __call1357_35(moom.Ag a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1357_36(moom.Ag a0) throws Throwable;
private static native void __call1357_37(moom.v8 a0, int a1, net.minecraft.item.ItemStack a2) throws Throwable;
private static native int __call1357_38(moom.Ag a0) throws Throwable;
private static native moom.v8 __fieldRead1357_39(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __fieldRead1357_40(moom.v8 a0) throws Throwable;
private static native int __call1357_41(moom.Ag a0) throws Throwable;
private static native moom.v8 __fieldRead1357_42(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __call1357_43(moom.Ag a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1357_44(moom.Ag a0) throws Throwable;
private static native void __call1357_45(moom.v8 a0, int a1, net.minecraft.item.ItemStack a2) throws Throwable;
private static native java.lang.Throwable __call1135700_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135701_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135702_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135703_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135704_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135705_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135706_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135707_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135708_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135709_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135710_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135711_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135712_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135713_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135714_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135715_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135716_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135717_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135718_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135719_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135720_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135721_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_2d65351e1e1e681c75d0(net.minecraft.client.network.NetHandlerPlayClient a0, moom.Ah a1) throws E;
private static final class __SourceHandler_2d65351e1e1e681c75d0 {

public static void f1358(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.Ah p0) throws Throwable {
    int forwardValue1358_29_0;
    boolean spill1358_0;
    int spill1358_1;
    long life2_3;
    int life4_10;
    net.minecraft.client.entity.EntityPlayerSP life5_14;
    forward_join_38: {
    forward_join_29: {
    forward_join_27: {
    life2_3 = (__fieldRead1358_0() ^ 21114184084764L);
    spill1358_0 = __call1358_1();
    __call1358_3(p0, receiver, __fieldRead1358_2(receiver));
    life4_10 = __integerCategory1358_4(spill1358_0);
    life5_14 = __fieldRead1358_6(__fieldRead1358_5(receiver));
    spill1358_1 = __call1358_7(p0);
    if (!((life4_10 != 0))) {
        forwardValue1358_29_0 = spill1358_1;
        break forward_join_29;
    }
    if (!((spill1358_1 == 0))) {
        break forward_join_27;
    }
    __call1358_10(__fieldRead1358_8(life5_14), __call1358_9(p0));
    if (!((life4_10 == 0))) {
        break forward_join_38;
    }
    }
    forwardValue1358_29_0 = __call1358_11(p0);
    }
    if (!((forwardValue1358_29_0 == __fieldRead1358_13(__fieldRead1358_12(life5_14))))) {
        break forward_join_38;
    }
    __call1358_16(__fieldRead1358_14(life5_14), __call1358_15(p0));
    }
    return;
}
public static void h1358_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135800_0(p0);
}
public static void h1358_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135801_0(p0);
}
public static void h1358_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135802_0(p0);
}
public static void h1358_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135803_0(p0);
}
private static native long __fieldRead1358_0() throws Throwable;
private static native boolean __call1358_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1358_2(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1358_3(moom.Ah a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native int __integerCategory1358_4(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1358_5(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1358_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __call1358_7(moom.Ah a0) throws Throwable;
private static native moom.v8 __fieldRead1358_8(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __call1358_9(moom.Ah a0) throws Throwable;
private static native void __call1358_10(moom.v8 a0, net.minecraft.item.ItemStack[] a1) throws Throwable;
private static native int __call1358_11(moom.Ah a0) throws Throwable;
private static native moom.v8 __fieldRead1358_12(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __fieldRead1358_13(moom.v8 a0) throws Throwable;
private static native moom.v8 __fieldRead1358_14(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __call1358_15(moom.Ah a0) throws Throwable;
private static native void __call1358_16(moom.v8 a0, net.minecraft.item.ItemStack[] a1) throws Throwable;
private static native java.lang.Throwable __call1135800_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135801_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135802_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135803_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b0eb8a05b45080a12a50(net.minecraft.client.network.NetHandlerPlayClient a0, moom.Ai a1) throws E;
private static final class __SourceHandler_b0eb8a05b45080a12a50 {

public static void f1359(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.Ai p0) throws Throwable {
    moom.v8 forwardValue1359_22_0;
    moom.v8 forwardValue1359_30_0;
    boolean spill1359_0;
    moom.v8 spill1359_1;
    long life2_3;
    net.minecraft.client.entity.EntityPlayerSP life5_13;
    int life4_14;
    forward_join_35: {
    forward_join_30: {
    forward_join_22: {
    life2_3 = (__fieldRead1359_0() ^ 18094037618308L);
    spill1359_0 = __call1359_1();
    __call1359_3(p0, receiver, __fieldRead1359_2(receiver));
    life5_13 = __fieldRead1359_5(__fieldRead1359_4(receiver));
    life4_14 = __integerCategory1359_6(spill1359_0);
    spill1359_1 = __fieldRead1359_7(life5_13);
    if (!((life4_14 != 0))) {
        forwardValue1359_22_0 = spill1359_1;
        break forward_join_22;
    }
    if (!((spill1359_1 != null))) {
        break forward_join_35;
    }
    forwardValue1359_22_0 = __fieldRead1359_8(life5_13);
    }
    if (!((life4_14 != 0))) {
        forwardValue1359_30_0 = forwardValue1359_22_0;
        break forward_join_30;
    }
    if (!((__fieldRead1359_9(forwardValue1359_22_0) == __call1359_10(p0)))) {
        break forward_join_35;
    }
    forwardValue1359_30_0 = __fieldRead1359_11(life5_13);
    }
    __call1359_14(forwardValue1359_30_0, __call1359_12(p0), __call1359_13(p0));
    }
    return;
}
public static void h1359_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135900_0(p0);
}
public static void h1359_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135901_0(p0);
}
public static void h1359_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135902_0(p0);
}
public static void h1359_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1135903_0(p0);
}
private static native long __fieldRead1359_0() throws Throwable;
private static native boolean __call1359_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1359_2(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1359_3(moom.Ai a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1359_4(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1359_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __integerCategory1359_6(boolean value) throws Throwable;
private static native moom.v8 __fieldRead1359_7(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.v8 __fieldRead1359_8(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __fieldRead1359_9(moom.v8 a0) throws Throwable;
private static native int __call1359_10(moom.Ai a0) throws Throwable;
private static native moom.v8 __fieldRead1359_11(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __call1359_12(moom.Ai a0) throws Throwable;
private static native int __call1359_13(moom.Ai a0) throws Throwable;
private static native void __call1359_14(moom.v8 a0, int a1, int a2) throws Throwable;
private static native java.lang.Throwable __call1135900_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135901_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135902_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1135903_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_3528eeaa846c212ae6bb(net.minecraft.client.network.NetHandlerPlayClient a0, moom.Aj a1) throws E;
private static final class __SourceHandler_3528eeaa846c212ae6bb {

public static void f1360(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.Aj p0) throws Throwable {
    int forwardValue1360_28_0;
    boolean spill1360_0;
    int spill1360_1;
    long life2_3;
    int life4_10;
    moom.v8 life5_12;
    net.minecraft.client.entity.EntityPlayerSP life6_16;
    forward_join_50: {
    forward_join_35: {
    forward_join_28: {
    forward_join_26: {
    life2_3 = (__fieldRead1360_0() ^ 51467535469517L);
    spill1360_0 = __call1360_1();
    __call1360_3(p0, receiver, __fieldRead1360_2(receiver));
    life4_10 = __integerCategory1360_4(spill1360_0);
    life5_12 = null;
    life6_16 = __fieldRead1360_6(__fieldRead1360_5(receiver));
    spill1360_1 = __call1360_7(p0);
    if (!((life4_10 == 0))) {
        forwardValue1360_28_0 = spill1360_1;
        break forward_join_28;
    }
    if (!((spill1360_1 == 0))) {
        break forward_join_26;
    }
    life5_12 = __fieldRead1360_8(life6_16);
    break forward_join_35;
    }
    forwardValue1360_28_0 = __call1360_9(p0);
    }
    if (!((forwardValue1360_28_0 == __fieldRead1360_11(__fieldRead1360_10(life6_16))))) {
        break forward_join_35;
    }
    life5_12 = __fieldRead1360_12(life6_16);
    }
    if (!((life5_12 != null))) {
        break forward_join_50;
    }
    if (!((!__call1360_13(p0)))) {
        break forward_join_50;
    }
    __call1360_16(receiver, new moom.zi(__call1360_14(p0), __call1360_15(p0), true));
    }
    return;
}
public static void h1360_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136000_0(p0);
}
public static void h1360_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136001_0(p0);
}
public static void h1360_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136002_0(p0);
}
private static native long __fieldRead1360_0() throws Throwable;
private static native boolean __call1360_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1360_2(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1360_3(moom.Aj a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native int __integerCategory1360_4(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1360_5(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1360_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __call1360_7(moom.Aj a0) throws Throwable;
private static native moom.v8 __fieldRead1360_8(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __call1360_9(moom.Aj a0) throws Throwable;
private static native moom.v8 __fieldRead1360_10(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __fieldRead1360_11(moom.v8 a0) throws Throwable;
private static native moom.v8 __fieldRead1360_12(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native boolean __call1360_13(moom.Aj a0) throws Throwable;
private static native int __call1360_14(moom.Aj a0) throws Throwable;
private static native short __call1360_15(moom.Aj a0) throws Throwable;
private static native void __call1360_16(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zi a1) throws Throwable;
private static native java.lang.Throwable __call1136000_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136001_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136002_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f051215d4cd06891e162(net.minecraft.client.network.NetHandlerPlayClient a0, moom.Ak a1) throws E;
private static final class __SourceHandler_f051215d4cd06891e162 {

public static void f1361(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.Ak p0) throws Throwable {
    int forwardValue1361_53_0;
    int forwardValue1361_55_0;
    net.minecraft.client.entity.EntityPlayerSP forwardValue1361_65_0;
    boolean spill1361_0;
    boolean spill1361_1;
    int spill1361_2;
    boolean spill1361_3;
    net.minecraft.client.entity.EntityPlayerSP spill1361_4;
    long life2_3;
    int life5_11;
    int life4_12;
    net.minecraft.tileentity.TileEntity life6_31;
    moom.Ct life7_42;
    forward_join_79: {
    forward_join_65: {
    forward_join_55: {
    forward_join_54: {
    forward_join_53: {
    forward_join_52: {
    life2_3 = (__fieldRead1361_0() ^ 33830705227365L);
    __call1361_2(p0, receiver, __fieldRead1361_1(receiver));
    spill1361_0 = __call1361_3();
    life5_11 = 0;
    life4_12 = __integerCategory1361_4(spill1361_0);
    spill1361_1 = __call1361_8(__fieldRead1361_6(__fieldRead1361_5(receiver)), __call1361_7(p0));
    if (!((life4_12 == 0))) {
        forwardValue1361_55_0 = __integerCategory1361_9(spill1361_1);
        break forward_join_55;
    }
    if (!(spill1361_1)) {
        break forward_join_54;
    }
    life6_31 = __call1361_13(__fieldRead1361_11(__fieldRead1361_10(receiver)), __call1361_12(p0));
    spill1361_2 = __instanceOf1361_14(life6_31);
    if (!((life4_12 == 0))) {
        forwardValue1361_55_0 = spill1361_2;
        break forward_join_55;
    }
    if (!((spill1361_2 != 0))) {
        break forward_join_54;
    }
    life7_42 = __cast1361_15(life6_31);
    spill1361_3 = __call1361_16(life7_42);
    if (!((life4_12 == 0))) {
        forwardValue1361_53_0 = __integerCategory1361_17(spill1361_3);
        break forward_join_53;
    }
    if (!(spill1361_3)) {
        break forward_join_52;
    }
    __call1361_20(__call1361_18(p0), 0, __fieldRead1361_19(life7_42), 0, 4);
    __call1361_21(life7_42);
    }
    forwardValue1361_53_0 = 1;
    }
    life5_11 = forwardValue1361_53_0;
    }
    forwardValue1361_55_0 = life5_11;
    }
    if (!((forwardValue1361_55_0 == 0))) {
        break forward_join_79;
    }
    spill1361_4 = __fieldRead1361_23(__fieldRead1361_22(receiver));
    if (!((life4_12 == 0))) {
        forwardValue1361_65_0 = spill1361_4;
        break forward_join_65;
    }
    if (!((spill1361_4 != null))) {
        break forward_join_79;
    }
    forwardValue1361_65_0 = __fieldRead1361_25(__fieldRead1361_24(receiver));
    }
    __call1361_33(forwardValue1361_65_0, new moom.CM(__invokedynamic1361_32(__call1361_27(__call1361_26(p0)), __call1361_29(__call1361_28(p0)), __call1361_31(__call1361_30(p0)))));
    }
    return;
}
public static void h1361_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136100_0(p0);
}
public static void h1361_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136101_0(p0);
}
public static void h1361_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136102_0(p0);
}
public static void h1361_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136103_0(p0);
}
public static void h1361_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136104_0(p0);
}
public static void h1361_5(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136105_0(p0);
}
public static void h1361_6(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136106_0(p0);
}
private static native long __fieldRead1361_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1361_1(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1361_2(moom.Ak a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native boolean __call1361_3() throws Throwable;
private static native int __integerCategory1361_4(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1361_5(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1361_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DT __call1361_7(moom.Ak a0) throws Throwable;
private static native boolean __call1361_8(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1) throws Throwable;
private static native int __integerCategory1361_9(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1361_10(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1361_11(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DT __call1361_12(moom.Ak a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call1361_13(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1) throws Throwable;
private static native int __instanceOf1361_14(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.Ct __cast1361_15(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native boolean __call1361_16(moom.Ct a0) throws Throwable;
private static native int __integerCategory1361_17(boolean value) throws Throwable;
private static native net.minecraft.util.IChatComponent[] __call1361_18(moom.Ak a0) throws Throwable;
private static native net.minecraft.util.IChatComponent[] __fieldRead1361_19(moom.Ct a0) throws Throwable;
private static native void __call1361_20(net.minecraft.util.IChatComponent[] a0, int a1, net.minecraft.util.IChatComponent[] a2, int a3, int a4) throws Throwable;
private static native void __call1361_21(moom.Ct a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1361_22(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1361_23(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1361_24(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1361_25(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DT __call1361_26(moom.Ak a0) throws Throwable;
private static native int __call1361_27(moom.DT a0) throws Throwable;
private static native moom.DT __call1361_28(moom.Ak a0) throws Throwable;
private static native int __call1361_29(moom.DT a0) throws Throwable;
private static native moom.DT __call1361_30(moom.Ak a0) throws Throwable;
private static native int __call1361_31(moom.DT a0) throws Throwable;
private static native java.lang.String __invokedynamic1361_32(int a0, int a1, int a2) throws Throwable;
private static native void __call1361_33(net.minecraft.client.entity.EntityPlayerSP a0, moom.CM a1) throws Throwable;
private static native java.lang.Throwable __call1136100_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136101_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136102_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136103_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136104_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136105_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136106_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_bd9c3361794c55f95779(net.minecraft.client.network.NetHandlerPlayClient a0, moom.Am a1) throws E;
private static final class __SourceHandler_bd9c3361794c55f95779 {

public static void f1362(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.Am p0) throws Throwable {
    net.minecraft.client.multiplayer.WorldClient forwardValue1362_25_0;
    moom.DT forwardValue1362_25_1;
    int forwardValue1362_42_0;
    int forwardValue1362_42_1;
    int forwardValue1362_52_0;
    int forwardValue1362_52_1;
    int forwardValue1362_62_0;
    int forwardValue1362_62_1;
    int forwardValue1362_72_0;
    int forwardValue1362_72_1;
    int forwardValue1362_88_0;
    int forwardValue1362_88_1;
    int forwardValue1362_93_0;
    net.minecraft.tileentity.TileEntity forwardValue1362_95_0;
    boolean spill1362_0;
    net.minecraft.client.multiplayer.WorldClient spill1362_1;
    moom.DT spill1362_2;
    int spill1362_3;
    int spill1362_4;
    net.minecraft.tileentity.TileEntity spill1362_5;
    net.minecraft.tileentity.TileEntity spill1362_6;
    net.minecraft.tileentity.TileEntity spill1362_7;
    net.minecraft.tileentity.TileEntity spill1362_8;
    net.minecraft.tileentity.TileEntity spill1362_9;
    int spill1362_10;
    net.minecraft.tileentity.TileEntity spill1362_11;
    long life2_3;
    int life4_10;
    net.minecraft.tileentity.TileEntity life5_32;
    int life6_35;
    forward_join_98: {
    forward_join_95: {
    forward_join_94: {
    forward_join_93: {
    forward_join_88: {
    forward_join_80: {
    forward_join_72: {
    forward_join_70: {
    forward_join_62: {
    forward_join_60: {
    forward_join_52: {
    forward_join_50: {
    forward_join_42: {
    forward_join_40: {
    forward_join_25: {
    life2_3 = (__fieldRead1362_0() ^ 20066587783842L);
    spill1362_0 = __call1362_1();
    __call1362_3(p0, receiver, __fieldRead1362_2(receiver));
    life4_10 = __integerCategory1362_4(spill1362_0);
    spill1362_1 = __fieldRead1362_6(__fieldRead1362_5(receiver));
    spill1362_2 = __call1362_7(p0);
    if (!((life4_10 != 0))) {
        forwardValue1362_25_0 = spill1362_1;
        forwardValue1362_25_1 = spill1362_2;
        break forward_join_25;
    }
    if (!(__call1362_8(spill1362_1, spill1362_2))) {
        break forward_join_98;
    }
    forwardValue1362_25_0 = __fieldRead1362_10(__fieldRead1362_9(receiver));
    forwardValue1362_25_1 = __call1362_11(p0);
    }
    life5_32 = __call1362_12(forwardValue1362_25_0, forwardValue1362_25_1);
    life6_35 = __call1362_13(p0);
    spill1362_3 = life6_35;
    spill1362_4 = 1;
    if (!((life4_10 != 0))) {
        forwardValue1362_42_0 = spill1362_3;
        forwardValue1362_42_1 = spill1362_4;
        break forward_join_42;
    }
    if (!((spill1362_3 == spill1362_4))) {
        break forward_join_40;
    }
    spill1362_5 = life5_32;
    if (!((life4_10 != 0))) {
        forwardValue1362_95_0 = spill1362_5;
        break forward_join_95;
    }
    if (!((__instanceOf1362_14(spill1362_5) == 0))) {
        break forward_join_94;
    }
    }
    forwardValue1362_42_0 = life6_35;
    forwardValue1362_42_1 = 2;
    }
    if (!((life4_10 != 0))) {
        forwardValue1362_52_0 = forwardValue1362_42_0;
        forwardValue1362_52_1 = forwardValue1362_42_1;
        break forward_join_52;
    }
    if (!((forwardValue1362_42_0 == forwardValue1362_42_1))) {
        break forward_join_50;
    }
    spill1362_6 = life5_32;
    if (!((life4_10 != 0))) {
        forwardValue1362_95_0 = spill1362_6;
        break forward_join_95;
    }
    if (!((__instanceOf1362_15(spill1362_6) == 0))) {
        break forward_join_94;
    }
    }
    forwardValue1362_52_0 = life6_35;
    forwardValue1362_52_1 = 3;
    }
    if (!((life4_10 != 0))) {
        forwardValue1362_62_0 = forwardValue1362_52_0;
        forwardValue1362_62_1 = forwardValue1362_52_1;
        break forward_join_62;
    }
    if (!((forwardValue1362_52_0 == forwardValue1362_52_1))) {
        break forward_join_60;
    }
    spill1362_7 = life5_32;
    if (!((life4_10 != 0))) {
        forwardValue1362_95_0 = spill1362_7;
        break forward_join_95;
    }
    if (!((__instanceOf1362_16(spill1362_7) == 0))) {
        break forward_join_94;
    }
    }
    forwardValue1362_62_0 = life6_35;
    forwardValue1362_62_1 = 4;
    }
    if (!((life4_10 != 0))) {
        forwardValue1362_72_0 = forwardValue1362_62_0;
        forwardValue1362_72_1 = forwardValue1362_62_1;
        break forward_join_72;
    }
    if (!((forwardValue1362_62_0 == forwardValue1362_62_1))) {
        break forward_join_70;
    }
    spill1362_8 = life5_32;
    if (!((life4_10 != 0))) {
        forwardValue1362_95_0 = spill1362_8;
        break forward_join_95;
    }
    if (!((__instanceOf1362_17(spill1362_8) == 0))) {
        break forward_join_94;
    }
    }
    forwardValue1362_72_0 = life6_35;
    forwardValue1362_72_1 = 5;
    }
    if (!((life4_10 != 0))) {
        forwardValue1362_88_0 = forwardValue1362_72_0;
        forwardValue1362_88_1 = forwardValue1362_72_1;
        break forward_join_88;
    }
    if (!((forwardValue1362_72_0 == forwardValue1362_72_1))) {
        break forward_join_80;
    }
    spill1362_9 = life5_32;
    if (!((life4_10 != 0))) {
        forwardValue1362_95_0 = spill1362_9;
        break forward_join_95;
    }
    if (!((__instanceOf1362_18(spill1362_9) == 0))) {
        break forward_join_94;
    }
    }
    spill1362_10 = life6_35;
    if (!((life4_10 != 0))) {
        forwardValue1362_93_0 = spill1362_10;
        break forward_join_93;
    }
    forwardValue1362_88_0 = spill1362_10;
    forwardValue1362_88_1 = __invokedynamic1362_19(10647, (8114072680820529317L ^ life2_3));
    }
    if (!((forwardValue1362_88_0 == forwardValue1362_88_1))) {
        break forward_join_98;
    }
    spill1362_11 = life5_32;
    if (!((life4_10 != 0))) {
        forwardValue1362_95_0 = spill1362_11;
        break forward_join_95;
    }
    forwardValue1362_93_0 = __instanceOf1362_20(spill1362_11);
    }
    if (!((forwardValue1362_93_0 != 0))) {
        break forward_join_98;
    }
    }
    forwardValue1362_95_0 = life5_32;
    }
    __call1362_22(forwardValue1362_95_0, __call1362_21(p0));
    }
    return;
}
public static void h1362_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136200_0(p0);
}
public static void h1362_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136201_0(p0);
}
public static void h1362_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136202_0(p0);
}
public static void h1362_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136203_0(p0);
}
public static void h1362_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136204_0(p0);
}
public static void h1362_5(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136205_0(p0);
}
public static void h1362_6(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136206_0(p0);
}
public static void h1362_7(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136207_0(p0);
}
public static void h1362_8(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136208_0(p0);
}
public static void h1362_9(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136209_0(p0);
}
public static void h1362_10(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136210_0(p0);
}
public static void h1362_11(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136211_0(p0);
}
public static void h1362_12(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136212_0(p0);
}
public static void h1362_13(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136213_0(p0);
}
public static void h1362_14(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136214_0(p0);
}
public static void h1362_15(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136215_0(p0);
}
public static void h1362_16(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136216_0(p0);
}
public static void h1362_17(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136217_0(p0);
}
public static void h1362_18(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136218_0(p0);
}
public static void h1362_19(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136219_0(p0);
}
public static void h1362_20(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136220_0(p0);
}
public static void h1362_21(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136221_0(p0);
}
public static void h1362_22(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136222_0(p0);
}
public static void h1362_23(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136223_0(p0);
}
public static void h1362_24(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136224_0(p0);
}
private static native long __fieldRead1362_0() throws Throwable;
private static native boolean __call1362_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1362_2(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1362_3(moom.Am a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native int __integerCategory1362_4(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1362_5(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1362_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DT __call1362_7(moom.Am a0) throws Throwable;
private static native boolean __call1362_8(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1362_9(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1362_10(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DT __call1362_11(moom.Am a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call1362_12(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1) throws Throwable;
private static native int __call1362_13(moom.Am a0) throws Throwable;
private static native int __instanceOf1362_14(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native int __instanceOf1362_15(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native int __instanceOf1362_16(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native int __instanceOf1362_17(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native int __instanceOf1362_18(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native int __invokedynamic1362_19(int a0, long a1) throws Throwable;
private static native int __instanceOf1362_20(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call1362_21(moom.Am a0) throws Throwable;
private static native void __call1362_22(net.minecraft.tileentity.TileEntity a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native java.lang.Throwable __call1136200_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136201_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136202_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136203_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136204_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136205_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136206_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136207_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136208_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136209_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136210_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136211_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136212_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136213_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136214_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136215_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136216_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136217_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136218_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136219_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136220_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136221_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136222_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136223_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136224_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_774878f8589a534c7f1a(net.minecraft.client.network.NetHandlerPlayClient a0, moom.An a1) throws E;
private static final class __SourceHandler_774878f8589a534c7f1a {

public static void f55(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.An p0) throws Throwable {
    boolean spill55_0;
    long life2_3;
    net.minecraft.tileentity.TileEntity life5_15;
    int life4_16;
    forest_join_40: {
    forest_join_34: {
    life2_3 = (__fieldRead55_0() ^ 129365641044037L);
    spill55_0 = __call55_1();
    __call55_3(p0, receiver, __fieldRead55_2(receiver));
    life5_15 = __call55_6(__fieldRead55_4(receiver), __call55_5(p0));
    life4_16 = __integerCategory55_7(spill55_0);
    if (!((life4_16 != 0))) {
        break forest_join_40;
    }
    if (!((__instanceOf55_8(life5_15) == 0))) {
        break forest_join_34;
    }
    life5_15 = new moom.Ct();
    __call55_10(life5_15, __fieldRead55_9(receiver));
    __call55_12(life5_15, __call55_11(p0));
    }
    __call55_16(__fieldRead55_14(__fieldRead55_13(receiver)), __cast55_15(life5_15));
    }
    return;
}
public static void h55_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3005500_0(p0);
}
private static native long __fieldRead55_0() throws Throwable;
private static native boolean __call55_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead55_2(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call55_3(moom.An a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead55_4(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native moom.DT __call55_5(moom.An a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call55_6(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1) throws Throwable;
private static native int __integerCategory55_7(boolean value) throws Throwable;
private static native int __instanceOf55_8(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead55_9(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call55_10(net.minecraft.tileentity.TileEntity a0, net.minecraft.client.multiplayer.WorldClient a1) throws Throwable;
private static native moom.DT __call55_11(moom.An a0) throws Throwable;
private static native void __call55_12(net.minecraft.tileentity.TileEntity a0, moom.DT a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead55_13(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead55_14(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.Ct __cast55_15(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native void __call55_16(net.minecraft.client.entity.EntityPlayerSP a0, moom.Ct a1) throws Throwable;
private static native java.lang.Throwable __call3005500_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_080f4b099916e16611bb(net.minecraft.client.network.NetHandlerPlayClient a0, moom.Ao a1) throws E;
private static final class __SourceHandler_080f4b099916e16611bb {

public static void f1363(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.Ao p0) throws Throwable {
    int lexicalValue1363_47_0;
    int lexicalValue1363_82_0;
    int lexicalValue1363_97_0;
    int lexicalValue1363_125_0;
    net.minecraft.client.gui.GuiScreen lexicalValue1363_129_0;
    boolean spill1363_0;
    boolean spill1363_1;
    int spill1363_2;
    int spill1363_3;
    int spill1363_4;
    boolean spill1363_5;
    net.minecraft.client.gui.GuiScreen spill1363_6;
    long life2_3;
    int life5_11;
    int life4_12;
    java.util.Iterator life6_17;
    java.util.Map.Entry life7_24;
    moom.BY life8_28;
    int life9_33;
    moom.BZ life10_85;
    lexical_join_131: {
    lexical_join_129: {
    lexical_join_125: {
    lexical_join_116: {
    lexical_join_97: {
    lexical_join_95: {
    life2_3 = (__fieldRead1363_0() ^ 78550749919273L);
    spill1363_0 = __call1363_1();
    __call1363_3(p0, receiver, __fieldRead1363_2(receiver));
    life5_11 = 0;
    life4_12 = __integerCategory1363_4(spill1363_0);
    life6_17 = __call1363_7(__call1363_6(__call1363_5(p0)));
    lexical_cycle_18: while (true) {
    lexical_join_93: {
    lexical_join_83: {
    lexical_join_82: {
    lexical_join_81: {
    lexical_join_77: {
    lexical_join_47: {
    if (!(__call1363_8(life6_17))) {
        break lexical_join_95;
    }
    life7_24 = __cast1363_10(__call1363_9(life6_17));
    life8_28 = __cast1363_12(__call1363_11(life7_24));
    life9_33 = __call1363_15(__cast1363_14(__call1363_13(life7_24)));
    if (!((life4_12 != 0))) {
        break lexical_join_93;
    }
    spill1363_1 = __call1363_16(life8_28);
    if (!((life4_12 != 0))) {
        lexicalValue1363_97_0 = __integerCategory1363_17(spill1363_1);
        break lexical_join_97;
    }
    if (!(spill1363_1)) {
        break lexical_join_83;
    }
    spill1363_2 = life9_33;
    if (!((life4_12 != 0))) {
        lexicalValue1363_47_0 = spill1363_2;
        break lexical_join_47;
    }
    if (!((spill1363_2 > 0))) {
        break lexical_join_83;
    }
    lexicalValue1363_47_0 = __integerCategory1363_19(__fieldRead1363_18(receiver));
    }
    if (!((life4_12 != 0))) {
        lexicalValue1363_82_0 = lexicalValue1363_47_0;
        break lexical_join_82;
    }
    if (!((lexicalValue1363_47_0 != 0))) {
        break lexical_join_81;
    }
    spill1363_3 = __call1363_23(__call1363_22(__fieldRead1363_21(__fieldRead1363_20(receiver))), life8_28);
    if (!((life4_12 != 0))) {
        lexicalValue1363_82_0 = spill1363_3;
        break lexical_join_82;
    }
    if (!((spill1363_3 == 0))) {
        break lexical_join_81;
    }
    life10_85 = __cast1363_24(life8_28);
    __call1363_27(__fieldRead1363_26(__fieldRead1363_25(receiver)), life10_85);
    if (!((life4_12 != 0))) {
        break lexical_join_77;
    }
    if (!((life8_28 == __fieldRead1363_28()))) {
        break lexical_join_81;
    }
    __fieldWrite1363_31(__fieldRead1363_30(__fieldRead1363_29(receiver)), 0);
    }
    __call1363_34(__fieldRead1363_33(__fieldRead1363_32(receiver)));
    }
    lexicalValue1363_82_0 = 1;
    }
    life5_11 = lexicalValue1363_82_0;
    }
    __call1363_40(__call1363_37(__fieldRead1363_36(__fieldRead1363_35(receiver))), __fieldRead1363_39(__fieldRead1363_38(receiver)), life8_28, life9_33);
    }
    if (!((life4_12 == 0))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    lexicalValue1363_97_0 = __integerCategory1363_42(__fieldRead1363_41(receiver));
    }
    if (!((life4_12 != 0))) {
        lexicalValue1363_125_0 = lexicalValue1363_97_0;
        break lexical_join_125;
    }
    if (!((lexicalValue1363_97_0 == 0))) {
        break lexical_join_116;
    }
    spill1363_4 = life5_11;
    if (!((life4_12 != 0))) {
        lexicalValue1363_125_0 = spill1363_4;
        break lexical_join_125;
    }
    if (!((spill1363_4 == 0))) {
        break lexical_join_116;
    }
    spill1363_5 = __fieldRead1363_45(__fieldRead1363_44(__fieldRead1363_43(receiver)));
    if (!((life4_12 != 0))) {
        lexicalValue1363_125_0 = __integerCategory1363_46(spill1363_5);
        break lexical_join_125;
    }
    if (!(spill1363_5)) {
        break lexical_join_116;
    }
    __call1363_50(__fieldRead1363_48(__fieldRead1363_47(receiver)), __fieldRead1363_49());
    }
    __fieldWrite1363_51(receiver, 1);
    spill1363_6 = __fieldRead1363_53(__fieldRead1363_52(receiver));
    if (!((life4_12 != 0))) {
        lexicalValue1363_129_0 = spill1363_6;
        break lexical_join_129;
    }
    lexicalValue1363_125_0 = __instanceOf1363_54(spill1363_6);
    }
    if (!((lexicalValue1363_125_0 != 0))) {
        break lexical_join_131;
    }
    lexicalValue1363_129_0 = __fieldRead1363_56(__fieldRead1363_55(receiver));
    }
    __call1363_58(__cast1363_57(lexicalValue1363_129_0));
    }
    return;
}
public static void h1363_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136300_0(p0);
}
public static void h1363_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136301_0(p0);
}
public static void h1363_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136302_0(p0);
}
public static void h1363_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136303_0(p0);
}
public static void h1363_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136304_0(p0);
}
public static void h1363_5(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136305_0(p0);
}
public static void h1363_6(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136306_0(p0);
}
public static void h1363_7(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136307_0(p0);
}
public static void h1363_8(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136308_0(p0);
}
public static void h1363_9(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136309_0(p0);
}
public static void h1363_10(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136310_0(p0);
}
public static void h1363_11(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136311_0(p0);
}
public static void h1363_12(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136312_0(p0);
}
public static void h1363_13(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136313_0(p0);
}
public static void h1363_14(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136314_0(p0);
}
public static void h1363_15(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136315_0(p0);
}
public static void h1363_16(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136316_0(p0);
}
public static void h1363_17(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136317_0(p0);
}
private static native long __fieldRead1363_0() throws Throwable;
private static native boolean __call1363_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1363_2(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1363_3(moom.Ao a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native int __integerCategory1363_4(boolean value) throws Throwable;
private static native java.util.Map __call1363_5(moom.Ao a0) throws Throwable;
private static native java.util.Set __call1363_6(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call1363_7(java.util.Set a0) throws Throwable;
private static native boolean __call1363_8(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1363_9(java.util.Iterator a0) throws Throwable;
private static native java.util.Map.Entry __cast1363_10(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call1363_11(java.util.Map.Entry a0) throws Throwable;
private static native moom.BY __cast1363_12(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call1363_13(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.Integer __cast1363_14(java.lang.Object a0) throws Throwable;
private static native int __call1363_15(java.lang.Integer a0) throws Throwable;
private static native boolean __call1363_16(moom.BY a0) throws Throwable;
private static native int __integerCategory1363_17(boolean value) throws Throwable;
private static native boolean __fieldRead1363_18(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __integerCategory1363_19(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1363_20(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1363_21(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.B2 __call1363_22(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __call1363_23(moom.B2 a0, moom.BY a1) throws Throwable;
private static native moom.BZ __cast1363_24(moom.BY a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1363_25(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native moom.hK __fieldRead1363_26(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1363_27(moom.hK a0, moom.BZ a1) throws Throwable;
private static native moom.BZ __fieldRead1363_28() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1363_29(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1363_30(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite1363_31(net.minecraft.client.settings.GameSettings a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1363_32(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1363_33(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1363_34(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1363_35(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1363_36(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.B2 __call1363_37(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1363_38(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1363_39(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1363_40(moom.B2 a0, net.minecraft.client.entity.EntityPlayerSP a1, moom.BY a2, int a3) throws Throwable;
private static native boolean __fieldRead1363_41(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __integerCategory1363_42(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1363_43(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1363_44(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead1363_45(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __integerCategory1363_46(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1363_47(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native moom.hK __fieldRead1363_48(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.BZ __fieldRead1363_49() throws Throwable;
private static native void __call1363_50(moom.hK a0, moom.BZ a1) throws Throwable;
private static native void __fieldWrite1363_51(net.minecraft.client.network.NetHandlerPlayClient a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1363_52(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead1363_53(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __instanceOf1363_54(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1363_55(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead1363_56(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.gui.IProgressMeter __cast1363_57(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native void __call1363_58(net.minecraft.client.gui.IProgressMeter a0) throws Throwable;
private static native java.lang.Throwable __call1136300_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136301_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136302_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136303_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136304_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136305_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136306_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136307_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136308_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136309_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136310_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136311_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136312_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136313_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136314_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136315_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136316_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136317_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_1a854111609a2c7136f8(net.minecraft.client.network.NetHandlerPlayClient a0, moom.Ap a1) throws E;
private static final class __SourceHandler_1a854111609a2c7136f8 {

public static void f995(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.Ap p0) throws Throwable {
    java.lang.Object forestValue995_43_0;
    java.lang.Object forestValue995_63_0;
    boolean spill995_0;
    net.minecraft.network.play.server.S38PacketPlayerListItem$Action spill995_1;
    net.minecraft.network.play.server.S38PacketPlayerListItem$Action spill995_2;
    long life2_3;
    java.util.Iterator life5_13;
    int life4_14;
    net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData life6_21;
    moom.jX life7_47;
    forest_join_100: {
    life2_3 = (__fieldRead995_0() ^ 63824922530198L);
    spill995_0 = __call995_1();
    __call995_3(p0, receiver, __fieldRead995_2(receiver));
    life5_13 = __call995_5(__call995_4(p0));
    life4_14 = __integerCategory995_6(spill995_0);
    forest_cycle_15: while (true) {
    forest_join_98: {
    forest_join_94: {
    forest_join_88: {
    forest_join_82: {
    forest_join_72: {
    forest_join_64: {
    forest_join_63: {
    forest_join_43: {
    forest_join_37: {
    if (!(__call995_7(life5_13))) {
        break forest_join_100;
    }
    life6_21 = __cast995_9(__call995_8(life5_13));
    spill995_1 = __call995_10(p0);
    if (!((life4_14 == 0))) {
        forestValue995_43_0 = spill995_1;
        break forest_join_43;
    }
    if (!((spill995_1 == __fieldRead995_11()))) {
        break forest_join_37;
    }
    __call995_15(__fieldRead995_12(receiver), __call995_14(__call995_13(life6_21)));
    if (!((life4_14 != 0))) {
        break forest_join_98;
    }
    }
    forestValue995_43_0 = __call995_19(__fieldRead995_16(receiver), __call995_18(__call995_17(life6_21)));
    }
    life7_47 = __cast995_20(forestValue995_43_0);
    spill995_2 = __call995_21(p0);
    if (!((life4_14 == 0))) {
        forestValue995_63_0 = spill995_2;
        break forest_join_63;
    }
    if (!((spill995_2 == __fieldRead995_22()))) {
        break forest_join_64;
    }
    life7_47 = new moom.jX(life6_21);
    forestValue995_63_0 = __call995_26(__fieldRead995_23(receiver), __call995_25(__call995_24(life7_47)), life7_47);
    }
    __discardScalar995_27(forestValue995_63_0);
    }
    if (!((life7_47 != null))) {
        break forest_join_98;
    }
    switch ((__fieldRead995_28())[__call995_30(__call995_29(p0))]) {
case 1:
{
        break forest_join_72;
    }
case 2:
{
        break forest_join_82;
    }
case 3:
{
        break forest_join_88;
    }
case 4:
{
        break forest_join_94;
    }
default:
{
        break forest_join_98;
    }
}
    }
    __call995_32(life7_47, __call995_31(life6_21));
    __call995_34(life7_47, __call995_33(life6_21));
    if (!((life4_14 != 0))) {
        break forest_join_98;
    }
    }
    __call995_36(life7_47, __call995_35(life6_21));
    if (!((life4_14 != 0))) {
        break forest_join_98;
    }
    }
    __call995_38(life7_47, __call995_37(life6_21));
    if (!((life4_14 != 0))) {
        break forest_join_98;
    }
    }
    __call995_40(life7_47, __call995_39(life6_21));
    }
    if (!((life4_14 != 0))) {
        continue forest_cycle_15;
    }
    break forest_cycle_15;
    }
    }
    return;
}
public static void h995_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3099500_0(p0);
}
public static void h995_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3099501_0(p0);
}
public static void h995_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3099502_0(p0);
}
public static void h995_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3099503_0(p0);
}
public static void h995_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3099504_0(p0);
}
public static void h995_5(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3099505_0(p0);
}
public static void h995_6(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3099506_0(p0);
}
public static void h995_7(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3099507_0(p0);
}
public static void h995_8(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3099508_0(p0);
}
private static native long __fieldRead995_0() throws Throwable;
private static native boolean __call995_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead995_2(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call995_3(moom.Ap a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native java.util.List __call995_4(moom.Ap a0) throws Throwable;
private static native java.util.Iterator __call995_5(java.util.List a0) throws Throwable;
private static native int __integerCategory995_6(boolean value) throws Throwable;
private static native boolean __call995_7(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call995_8(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData __cast995_9(java.lang.Object a0) throws Throwable;
private static native net.minecraft.network.play.server.S38PacketPlayerListItem$Action __call995_10(moom.Ap a0) throws Throwable;
private static native net.minecraft.network.play.server.S38PacketPlayerListItem$Action __fieldRead995_11() throws Throwable;
private static native java.util.Map __fieldRead995_12(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call995_13(net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData a0) throws Throwable;
private static native java.util.UUID __call995_14(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native java.lang.Object __call995_15(java.util.Map a0, java.util.UUID a1) throws Throwable;
private static native java.util.Map __fieldRead995_16(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call995_17(net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData a0) throws Throwable;
private static native java.util.UUID __call995_18(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native java.lang.Object __call995_19(java.util.Map a0, java.util.UUID a1) throws Throwable;
private static native moom.jX __cast995_20(java.lang.Object a0) throws Throwable;
private static native net.minecraft.network.play.server.S38PacketPlayerListItem$Action __call995_21(moom.Ap a0) throws Throwable;
private static native net.minecraft.network.play.server.S38PacketPlayerListItem$Action __fieldRead995_22() throws Throwable;
private static native java.util.Map __fieldRead995_23(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call995_24(moom.jX a0) throws Throwable;
private static native java.util.UUID __call995_25(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native java.lang.Object __call995_26(java.util.Map a0, java.util.UUID a1, moom.jX a2) throws Throwable;
private static native void __discardScalar995_27(java.lang.Object a0) throws Throwable;
private static native int[] __fieldRead995_28() throws Throwable;
private static native net.minecraft.network.play.server.S38PacketPlayerListItem$Action __call995_29(moom.Ap a0) throws Throwable;
private static native int __call995_30(net.minecraft.network.play.server.S38PacketPlayerListItem$Action a0) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __call995_31(net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData a0) throws Throwable;
private static native void __call995_32(moom.jX a0, net.minecraft.world.WorldSettings$GameType a1) throws Throwable;
private static native int __call995_33(net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData a0) throws Throwable;
private static native void __call995_34(moom.jX a0, int a1) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __call995_35(net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData a0) throws Throwable;
private static native void __call995_36(moom.jX a0, net.minecraft.world.WorldSettings$GameType a1) throws Throwable;
private static native int __call995_37(net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData a0) throws Throwable;
private static native void __call995_38(moom.jX a0, int a1) throws Throwable;
private static native net.minecraft.util.IChatComponent __call995_39(net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData a0) throws Throwable;
private static native void __call995_40(moom.jX a0, net.minecraft.util.IChatComponent a1) throws Throwable;
private static native java.lang.Throwable __call3099500_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3099501_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3099502_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3099503_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3099504_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3099505_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3099506_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3099507_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3099508_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_cb0db9d2db8c26a636c5(net.minecraft.client.network.NetHandlerPlayClient a0, moom.At a1) throws E;
private static final class __SourceHandler_cb0db9d2db8c26a636c5 {

public static void f1365(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.At p0) throws Throwable {
    net.minecraft.client.gui.GuiScreen forwardValue1365_24_0;
    boolean spill1365_0;
    net.minecraft.client.gui.GuiScreen spill1365_1;
    long life2_3;
    int life4_10;
    java.lang.String[] life5_13;
    net.minecraft.client.gui.GuiScreen life7_17;
    moom.gF life6_31;
    forward_join_29: {
    forward_join_24: {
    life2_3 = (__fieldRead1365_0() ^ 138821919252884L);
    spill1365_0 = __call1365_1();
    __call1365_3(p0, receiver, __fieldRead1365_2(receiver));
    life4_10 = __integerCategory1365_4(spill1365_0);
    life5_13 = __call1365_5(p0);
    life7_17 = __fieldRead1365_7(__fieldRead1365_6(receiver));
    spill1365_1 = life7_17;
    if (!((life4_10 != 0))) {
        forwardValue1365_24_0 = spill1365_1;
        break forward_join_24;
    }
    if (!((__instanceOf1365_8(spill1365_1) != 0))) {
        break forward_join_29;
    }
    forwardValue1365_24_0 = life7_17;
    }
    life6_31 = __cast1365_9(forwardValue1365_24_0);
    __call1365_10(life6_31, life5_13);
    }
    return;
}
public static void h1365_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136500_0(p0);
}
public static void h1365_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136501_0(p0);
}
private static native long __fieldRead1365_0() throws Throwable;
private static native boolean __call1365_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1365_2(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1365_3(moom.At a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native int __integerCategory1365_4(boolean value) throws Throwable;
private static native java.lang.String[] __call1365_5(moom.At a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1365_6(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead1365_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __instanceOf1365_8(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native moom.gF __cast1365_9(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native void __call1365_10(moom.gF a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.Throwable __call1136500_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136501_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_3e621ce9bfebea962031(net.minecraft.client.network.NetHandlerPlayClient a0, moom.Au a1) throws E;
private static final class __SourceHandler_3e621ce9bfebea962031 {

public static void f1366(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.Au p0) throws Throwable {
    int forwardValue1366_53_0;
    int forwardValue1366_53_1;
    boolean spill1366_0;
    int spill1366_1;
    int spill1366_2;
    long life2_3;
    int life4_10;
    net.minecraft.scoreboard.Scoreboard life5_14;
    net.minecraft.scoreboard.ScoreObjective life6_23;
    net.minecraft.scoreboard.ScoreObjective life6_38;
    forward_join_62: {
    forward_join_53: {
    forward_join_50: {
    forward_join_34: {
    life2_3 = (__fieldRead1366_0() ^ 80927243645034L);
    spill1366_0 = __call1366_1();
    __call1366_3(p0, receiver, __fieldRead1366_2(receiver));
    life4_10 = __integerCategory1366_4(spill1366_0);
    life5_14 = __call1366_6(__fieldRead1366_5(receiver));
    if (!((__call1366_7(p0) == 0))) {
        break forward_join_34;
    }
    life6_23 = __call1366_10(life5_14, __call1366_8(p0), __fieldRead1366_9());
    __call1366_12(life6_23, __call1366_11(p0));
    __call1366_14(life6_23, __call1366_13(p0));
    if (!((life4_10 != 0))) {
        break forward_join_62;
    }
    }
    life6_38 = __call1366_16(life5_14, __call1366_15(p0));
    spill1366_1 = __call1366_17(p0);
    spill1366_2 = 1;
    if (!((life4_10 == 0))) {
        forwardValue1366_53_0 = spill1366_1;
        forwardValue1366_53_1 = spill1366_2;
        break forward_join_53;
    }
    if (!((spill1366_1 == spill1366_2))) {
        break forward_join_50;
    }
    __call1366_18(life5_14, life6_38);
    if (!((life4_10 != 0))) {
        break forward_join_62;
    }
    }
    forwardValue1366_53_0 = __call1366_19(p0);
    forwardValue1366_53_1 = 2;
    }
    if (!((forwardValue1366_53_0 == forwardValue1366_53_1))) {
        break forward_join_62;
    }
    __call1366_21(life6_38, __call1366_20(p0));
    __call1366_23(life6_38, __call1366_22(p0));
    }
    return;
}
public static void h1366_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136600_0(p0);
}
public static void h1366_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136601_0(p0);
}
public static void h1366_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136602_0(p0);
}
public static void h1366_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136603_0(p0);
}
private static native long __fieldRead1366_0() throws Throwable;
private static native boolean __call1366_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1366_2(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1366_3(moom.Au a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native int __integerCategory1366_4(boolean value) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1366_5(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call1366_6(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native int __call1366_7(moom.Au a0) throws Throwable;
private static native java.lang.String __call1366_8(moom.Au a0) throws Throwable;
private static native net.minecraft.scoreboard.IScoreObjectiveCriteria __fieldRead1366_9() throws Throwable;
private static native net.minecraft.scoreboard.ScoreObjective __call1366_10(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1, net.minecraft.scoreboard.IScoreObjectiveCriteria a2) throws Throwable;
private static native java.lang.String __call1366_11(moom.Au a0) throws Throwable;
private static native void __call1366_12(net.minecraft.scoreboard.ScoreObjective a0, java.lang.String a1) throws Throwable;
private static native moom.bn __call1366_13(moom.Au a0) throws Throwable;
private static native void __call1366_14(net.minecraft.scoreboard.ScoreObjective a0, moom.bn a1) throws Throwable;
private static native java.lang.String __call1366_15(moom.Au a0) throws Throwable;
private static native net.minecraft.scoreboard.ScoreObjective __call1366_16(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1) throws Throwable;
private static native int __call1366_17(moom.Au a0) throws Throwable;
private static native void __call1366_18(net.minecraft.scoreboard.Scoreboard a0, net.minecraft.scoreboard.ScoreObjective a1) throws Throwable;
private static native int __call1366_19(moom.Au a0) throws Throwable;
private static native java.lang.String __call1366_20(moom.Au a0) throws Throwable;
private static native void __call1366_21(net.minecraft.scoreboard.ScoreObjective a0, java.lang.String a1) throws Throwable;
private static native moom.bn __call1366_22(moom.Au a0) throws Throwable;
private static native void __call1366_23(net.minecraft.scoreboard.ScoreObjective a0, moom.bn a1) throws Throwable;
private static native java.lang.Throwable __call1136600_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136601_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136602_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136603_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_ac00b966e1cb26bfb410(net.minecraft.client.network.NetHandlerPlayClient a0, moom.Av a1) throws E;
private static final class __SourceHandler_ac00b966e1cb26bfb410 {

public static void f1367(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.Av p0) throws Throwable {
    net.minecraft.network.play.server.S3CPacketUpdateScore$Action forwardValue1367_43_0;
    net.minecraft.network.play.server.S3CPacketUpdateScore$Action forwardValue1367_43_1;
    moom.Av forwardValue1367_45_0;
    boolean spill1367_0;
    net.minecraft.network.play.server.S3CPacketUpdateScore$Action spill1367_1;
    net.minecraft.network.play.server.S3CPacketUpdateScore$Action spill1367_2;
    moom.Av spill1367_3;
    long life2_3;
    net.minecraft.scoreboard.Scoreboard life5_13;
    int life4_14;
    net.minecraft.scoreboard.ScoreObjective life6_19;
    net.minecraft.scoreboard.Score life7_34;
    forward_join_62: {
    forward_join_55: {
    forward_join_45: {
    forward_join_43: {
    forward_join_38: {
    life2_3 = (__fieldRead1367_0() ^ 57397612433788L);
    spill1367_0 = __call1367_1();
    __call1367_3(p0, receiver, __fieldRead1367_2(receiver));
    life5_13 = __call1367_5(__fieldRead1367_4(receiver));
    life4_14 = __integerCategory1367_6(spill1367_0);
    life6_19 = __call1367_8(life5_13, __call1367_7(p0));
    spill1367_1 = __call1367_9(p0);
    spill1367_2 = __fieldRead1367_10();
    if (!((life4_14 != 0))) {
        forwardValue1367_43_0 = spill1367_1;
        forwardValue1367_43_1 = spill1367_2;
        break forward_join_43;
    }
    if (!((spill1367_1 == spill1367_2))) {
        break forward_join_38;
    }
    life7_34 = __call1367_12(life5_13, __call1367_11(p0), life6_19);
    __call1367_14(life7_34, __call1367_13(p0));
    if (!((life4_14 == 0))) {
        break forward_join_62;
    }
    }
    spill1367_3 = p0;
    if (!((life4_14 != 0))) {
        forwardValue1367_45_0 = spill1367_3;
        break forward_join_45;
    }
    forwardValue1367_43_0 = __call1367_15(spill1367_3);
    forwardValue1367_43_1 = __fieldRead1367_16();
    }
    if (!((forwardValue1367_43_0 == forwardValue1367_43_1))) {
        break forward_join_62;
    }
    forwardValue1367_45_0 = p0;
    }
    if (!(__call1367_18(__call1367_17(forwardValue1367_45_0)))) {
        break forward_join_55;
    }
    __call1367_20(life5_13, __call1367_19(p0), null);
    if (!((life4_14 == 0))) {
        break forward_join_62;
    }
    }
    if (!((life6_19 != null))) {
        break forward_join_62;
    }
    __call1367_22(life5_13, __call1367_21(p0), life6_19);
    }
    return;
}
public static void h1367_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136700_0(p0);
}
public static void h1367_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136701_0(p0);
}
public static void h1367_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136702_0(p0);
}
public static void h1367_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136703_0(p0);
}
public static void h1367_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136704_0(p0);
}
public static void h1367_5(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136705_0(p0);
}
private static native long __fieldRead1367_0() throws Throwable;
private static native boolean __call1367_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1367_2(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1367_3(moom.Av a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1367_4(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call1367_5(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native int __integerCategory1367_6(boolean value) throws Throwable;
private static native java.lang.String __call1367_7(moom.Av a0) throws Throwable;
private static native net.minecraft.scoreboard.ScoreObjective __call1367_8(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.network.play.server.S3CPacketUpdateScore$Action __call1367_9(moom.Av a0) throws Throwable;
private static native net.minecraft.network.play.server.S3CPacketUpdateScore$Action __fieldRead1367_10() throws Throwable;
private static native java.lang.String __call1367_11(moom.Av a0) throws Throwable;
private static native net.minecraft.scoreboard.Score __call1367_12(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1, net.minecraft.scoreboard.ScoreObjective a2) throws Throwable;
private static native int __call1367_13(moom.Av a0) throws Throwable;
private static native void __call1367_14(net.minecraft.scoreboard.Score a0, int a1) throws Throwable;
private static native net.minecraft.network.play.server.S3CPacketUpdateScore$Action __call1367_15(moom.Av a0) throws Throwable;
private static native net.minecraft.network.play.server.S3CPacketUpdateScore$Action __fieldRead1367_16() throws Throwable;
private static native java.lang.String __call1367_17(moom.Av a0) throws Throwable;
private static native boolean __call1367_18(java.lang.String a0) throws Throwable;
private static native java.lang.String __call1367_19(moom.Av a0) throws Throwable;
private static native void __call1367_20(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1, java.lang.Object a2) throws Throwable;
private static native java.lang.String __call1367_21(moom.Av a0) throws Throwable;
private static native void __call1367_22(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1, net.minecraft.scoreboard.ScoreObjective a2) throws Throwable;
private static native java.lang.Throwable __call1136700_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136701_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136702_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136703_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136704_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136705_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_6ea344be6e7bb1c87bd9(net.minecraft.client.network.NetHandlerPlayClient a0, moom.Aw a1) throws E;
private static final class __SourceHandler_6ea344be6e7bb1c87bd9 {

public static void f1368(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.Aw p0) throws Throwable {
    long life2_3;
    int life4_10;
    net.minecraft.scoreboard.Scoreboard life5_14;
    net.minecraft.scoreboard.ScoreObjective life6_38;
    forward_join_38: {
    forward_join_28: {
    forward_join_26: {
    life2_3 = (__fieldRead1368_0() ^ 130044505006565L);
    boolean spill1368_0 = __call1368_1();
    __call1368_3(p0, receiver, __fieldRead1368_2(receiver));
    life4_10 = __integerCategory1368_4(spill1368_0);
    life5_14 = __call1368_6(__fieldRead1368_5(receiver));
    if (!((life4_10 != 0))) { break forward_join_26; }
    if (!((__call1368_8(__call1368_7(p0)) == 0))) { break forward_join_28; }
    __call1368_10(life5_14, __call1368_9(p0), null);
    }
    if (!((life4_10 == 0))) { break forward_join_38; }
    }
    life6_38 = __call1368_12(life5_14, __call1368_11(p0));
    __call1368_14(life5_14, __call1368_13(p0), life6_38);
    }
    return;
}
public static void h1368_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136800_0(p0);
}
public static void h1368_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136801_0(p0);
}
private static native long __fieldRead1368_0() throws Throwable;
private static native boolean __call1368_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1368_2(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1368_3(moom.Aw a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native int __integerCategory1368_4(boolean value) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1368_5(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call1368_6(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native java.lang.String __call1368_7(moom.Aw a0) throws Throwable;
private static native int __call1368_8(java.lang.String a0) throws Throwable;
private static native int __call1368_9(moom.Aw a0) throws Throwable;
private static native void __call1368_10(net.minecraft.scoreboard.Scoreboard a0, int a1, java.lang.Object a2) throws Throwable;
private static native java.lang.String __call1368_11(moom.Aw a0) throws Throwable;
private static native net.minecraft.scoreboard.ScoreObjective __call1368_12(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1) throws Throwable;
private static native int __call1368_13(moom.Aw a0) throws Throwable;
private static native void __call1368_14(net.minecraft.scoreboard.Scoreboard a0, int a1, net.minecraft.scoreboard.ScoreObjective a2) throws Throwable;
private static native java.lang.Throwable __call1136800_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136801_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_8ff705e3dccfdb15b23f(net.minecraft.client.network.NetHandlerPlayClient a0, moom.Ax a1) throws E;
private static final class __SourceHandler_8ff705e3dccfdb15b23f {

public static void f1369(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.Ax p0) throws Throwable {
    moom.Ax lexicalValue1369_63_0;
    moom.Ax lexicalValue1369_74_0;
    int lexicalValue1369_77_0;
    moom.Ax lexicalValue1369_85_0;
    int lexicalValue1369_108_0;
    int lexicalValue1369_108_1;
    int lexicalValue1369_133_0;
    int lexicalValue1369_133_1;
    boolean spill1369_0;
    moom.Ax spill1369_1;
    int spill1369_2;
    int spill1369_3;
    int spill1369_4;
    long life2_3;
    int life4_10;
    net.minecraft.scoreboard.Scoreboard life5_14;
    moom.Bk life6_22;
    net.minecraft.scoreboard.Team$EnumVisible life7_79;
    java.util.Iterator life7_111;
    java.lang.String life8_118;
    java.util.Iterator life7_144;
    java.lang.String life8_151;
    lexical_join_137: {
    lexical_join_133: {
    lexical_join_130: {
    lexical_join_108: {
    lexical_join_105: {
    lexical_join_85: {
    lexical_join_84: {
    lexical_join_77: {
    lexical_join_74: {
    lexical_join_73: {
    lexical_join_63: {
    lexical_join_41: {
    lexical_join_30: {
    lexical_join_25: {
    life2_3 = (__fieldRead1369_0() ^ 43316772732398L);
    spill1369_0 = __call1369_1();
    __call1369_3(p0, receiver, __fieldRead1369_2(receiver));
    life4_10 = __integerCategory1369_4(spill1369_0);
    life5_14 = __call1369_6(__fieldRead1369_5(receiver));
    if (!((__call1369_7(p0) == 0))) {
        break lexical_join_25;
    }
    life6_22 = __call1369_9(life5_14, __call1369_8(p0));
    if (!((life4_10 == 0))) {
        break lexical_join_30;
    }
    }
    life6_22 = __call1369_11(life5_14, __call1369_10(p0));
    }
    spill1369_1 = p0;
    if (!((life4_10 != 0))) {
        lexicalValue1369_63_0 = spill1369_1;
        break lexical_join_63;
    }
    if (!((__call1369_12(spill1369_1) != 0))) {
        break lexical_join_41;
    }
    spill1369_2 = __call1369_13(p0);
    if (!((life4_10 != 0))) {
        lexicalValue1369_77_0 = spill1369_2;
        break lexical_join_77;
    }
    if (!((spill1369_2 == 2))) {
        break lexical_join_73;
    }
    }
    __call1369_15(life6_22, __call1369_14(p0));
    __call1369_17(life6_22, __call1369_16(p0));
    __call1369_19(life6_22, __call1369_18(p0));
    __call1369_22(life6_22, __call1369_21(__call1369_20(p0)));
    __call1369_24(life6_22, __call1369_23(p0));
    lexicalValue1369_63_0 = p0;
    }
    if (!((life4_10 != 0))) {
        lexicalValue1369_74_0 = lexicalValue1369_63_0;
        break lexical_join_74;
    }
    life7_79 = __call1369_26(__call1369_25(lexicalValue1369_63_0));
    if (!((life7_79 != null))) {
        break lexical_join_73;
    }
    __call1369_27(life6_22, life7_79);
    }
    lexicalValue1369_74_0 = p0;
    }
    if (!((life4_10 != 0))) {
        lexicalValue1369_85_0 = lexicalValue1369_74_0;
        break lexical_join_85;
    }
    lexicalValue1369_77_0 = __call1369_28(lexicalValue1369_74_0);
    }
    if (!((lexicalValue1369_77_0 != 0))) {
        break lexical_join_84;
    }
    spill1369_3 = __call1369_29(p0);
    spill1369_4 = 3;
    if (!((life4_10 != 0))) {
        lexicalValue1369_108_0 = spill1369_3;
        lexicalValue1369_108_1 = spill1369_4;
        break lexical_join_108;
    }
    if (!((spill1369_3 == spill1369_4))) {
        break lexical_join_105;
    }
    }
    lexicalValue1369_85_0 = p0;
    }
    life7_111 = __call1369_31(__call1369_30(lexicalValue1369_85_0));
    lexical_cycle_88: while (true) {
    if (!(__call1369_32(life7_111))) {
        break lexical_join_105;
    }
    life8_118 = __cast1369_34(__call1369_33(life7_111));
    __call1369_36(life5_14, life8_118, __call1369_35(p0));
    if (!((life4_10 != 0))) {
        break lexical_join_130;
    }
    if (!((life4_10 == 0))) { continue lexical_cycle_88; }
    break lexical_cycle_88;
    }
    }
    lexicalValue1369_108_0 = __call1369_37(p0);
    lexicalValue1369_108_1 = 4;
    }
    if (!((life4_10 != 0))) {
        lexicalValue1369_133_0 = lexicalValue1369_108_0;
        lexicalValue1369_133_1 = lexicalValue1369_108_1;
        break lexical_join_133;
    }
    if (!((lexicalValue1369_108_0 == lexicalValue1369_108_1))) {
        break lexical_join_130;
    }
    life7_144 = __call1369_39(__call1369_38(p0));
    lexical_cycle_115: while (true) {
    if (!(__call1369_40(life7_144))) {
        break lexical_join_130;
    }
    life8_151 = __cast1369_42(__call1369_41(life7_144));
    __call1369_43(life5_14, life8_151, life6_22);
    if (!((life4_10 != 0))) {
        break lexical_join_137;
    }
    if (!((life4_10 == 0))) { continue lexical_cycle_115; }
    break lexical_cycle_115;
    }
    }
    lexicalValue1369_133_0 = __call1369_44(p0);
    lexicalValue1369_133_1 = 1;
    }
    if (!((lexicalValue1369_133_0 == lexicalValue1369_133_1))) {
        break lexical_join_137;
    }
    __call1369_45(life5_14, life6_22);
    }
    return;
}
public static void h1369_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136900_0(p0);
}
public static void h1369_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136901_0(p0);
}
public static void h1369_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136902_0(p0);
}
public static void h1369_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136903_0(p0);
}
public static void h1369_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136904_0(p0);
}
public static void h1369_5(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136905_0(p0);
}
public static void h1369_6(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136906_0(p0);
}
public static void h1369_7(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136907_0(p0);
}
public static void h1369_8(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136908_0(p0);
}
public static void h1369_9(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136909_0(p0);
}
public static void h1369_10(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136910_0(p0);
}
public static void h1369_11(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1136911_0(p0);
}
private static native long __fieldRead1369_0() throws Throwable;
private static native boolean __call1369_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1369_2(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1369_3(moom.Ax a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native int __integerCategory1369_4(boolean value) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1369_5(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call1369_6(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native int __call1369_7(moom.Ax a0) throws Throwable;
private static native java.lang.String __call1369_8(moom.Ax a0) throws Throwable;
private static native moom.Bk __call1369_9(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call1369_10(moom.Ax a0) throws Throwable;
private static native moom.Bk __call1369_11(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1) throws Throwable;
private static native int __call1369_12(moom.Ax a0) throws Throwable;
private static native int __call1369_13(moom.Ax a0) throws Throwable;
private static native java.lang.String __call1369_14(moom.Ax a0) throws Throwable;
private static native void __call1369_15(moom.Bk a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call1369_16(moom.Ax a0) throws Throwable;
private static native void __call1369_17(moom.Bk a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call1369_18(moom.Ax a0) throws Throwable;
private static native void __call1369_19(moom.Bk a0, java.lang.String a1) throws Throwable;
private static native int __call1369_20(moom.Ax a0) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __call1369_21(int a0) throws Throwable;
private static native void __call1369_22(moom.Bk a0, net.minecraft.util.EnumChatFormatting a1) throws Throwable;
private static native int __call1369_23(moom.Ax a0) throws Throwable;
private static native void __call1369_24(moom.Bk a0, int a1) throws Throwable;
private static native java.lang.String __call1369_25(moom.Ax a0) throws Throwable;
private static native net.minecraft.scoreboard.Team$EnumVisible __call1369_26(java.lang.String a0) throws Throwable;
private static native void __call1369_27(moom.Bk a0, net.minecraft.scoreboard.Team$EnumVisible a1) throws Throwable;
private static native int __call1369_28(moom.Ax a0) throws Throwable;
private static native int __call1369_29(moom.Ax a0) throws Throwable;
private static native java.util.Collection __call1369_30(moom.Ax a0) throws Throwable;
private static native java.util.Iterator __call1369_31(java.util.Collection a0) throws Throwable;
private static native boolean __call1369_32(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1369_33(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast1369_34(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call1369_35(moom.Ax a0) throws Throwable;
private static native boolean __call1369_36(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native int __call1369_37(moom.Ax a0) throws Throwable;
private static native java.util.Collection __call1369_38(moom.Ax a0) throws Throwable;
private static native java.util.Iterator __call1369_39(java.util.Collection a0) throws Throwable;
private static native boolean __call1369_40(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1369_41(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast1369_42(java.lang.Object a0) throws Throwable;
private static native void __call1369_43(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1, moom.Bk a2) throws Throwable;
private static native int __call1369_44(moom.Ax a0) throws Throwable;
private static native void __call1369_45(net.minecraft.scoreboard.Scoreboard a0, moom.Bk a1) throws Throwable;
private static native java.lang.Throwable __call1136900_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136901_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136902_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136903_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136904_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136905_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136906_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136907_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136908_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136909_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136910_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1136911_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d1877f093a79cb54f24e(net.minecraft.client.network.NetHandlerPlayClient a0, moom.Ay a1) throws E;
private static final class __SourceHandler_d1877f093a79cb54f24e {

public static void f900209(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.Ay p0) throws Throwable {
    int forestValue900209_54_0;
    int forestValue900209_61_0;
    int forestValue900209_82_0;
    net.minecraft.item.ItemStack forestValue900209_93_0;
    boolean spill900209_0;
    boolean spill900209_1;
    int spill900209_2;
    int spill900209_3;
    net.minecraft.item.ItemStack spill900209_4;
    long life2_3;
    int life4_10;
    net.minecraft.network.PacketBuffer life5_23;
    int life6_26;
    net.minecraft.client.gui.GuiScreen life7_30;
    net.minecraft.entity.IMerchant life8_55;
    moom.OF life9_58;
    net.minecraft.item.ItemStack life5_109;
    forest_join_107: {
    forest_join_93: {
    forest_join_82: {
    forest_join_78: {
    forest_join_61: {
    forest_join_57: {
    forest_join_54: {
    forest_join_52: {
    life2_3 = (__fieldRead900209_0() ^ 131065146186605L);
    spill900209_0 = __call900209_1();
    __call900209_3(p0, receiver, __fieldRead900209_2(receiver));
    life4_10 = __integerCategory900209_4(spill900209_0);
    spill900209_1 = __call900209_6("MC|TrList", __call900209_5(p0));
    if (!((life4_10 == 0))) {
        forestValue900209_61_0 = __integerCategory900209_7(spill900209_1);
        break forest_join_61;
    }
    if (!(spill900209_1)) {
        break forest_join_57;
    }
    life5_23 = __call900209_8(p0);
    life6_26 = __call900209_9(life5_23);
    life7_30 = __fieldRead900209_11(__fieldRead900209_10(receiver));
    spill900209_2 = __instanceOf900209_12(life7_30);
    if (!((life4_10 == 0))) {
        forestValue900209_54_0 = spill900209_2;
        break forest_join_54;
    }
    if (!((spill900209_2 != 0))) {
        break forest_join_52;
    }
    spill900209_3 = life6_26;
    if (!((life4_10 == 0))) {
        forestValue900209_54_0 = spill900209_3;
        break forest_join_54;
    }
    if (!((spill900209_3 == __fieldRead900209_16(__fieldRead900209_15(__fieldRead900209_14(__fieldRead900209_13(receiver))))))) {
        break forest_join_52;
    }
    life8_55 = __call900209_18(__cast900209_17(life7_30));
    life9_58 = __call900209_19(life5_23);
    __call900209_20(life8_55, life9_58);
    }
    forestValue900209_54_0 = __integerCategory900209_22(__call900209_21(life5_23));
    }
    __discardScalar900209_23(forestValue900209_54_0);
    if (!((life4_10 != 0))) {
        break forest_join_107;
    }
    }
    forestValue900209_61_0 = __integerCategory900209_26(__call900209_25("MC|Brand", __call900209_24(p0)));
    }
    if (!((life4_10 == 0))) {
        forestValue900209_82_0 = forestValue900209_61_0;
        break forest_join_82;
    }
    if (!((forestValue900209_61_0 != 0))) {
        break forest_join_78;
    }
    __call900209_32(__fieldRead900209_28(__fieldRead900209_27(receiver)), __call900209_31(__call900209_29(p0), __invokedynamic900209_30(13145, (8011081072929565605L ^ life2_3))));
    if (!((life4_10 != 0))) {
        break forest_join_107;
    }
    }
    forestValue900209_82_0 = __integerCategory900209_35(__call900209_34("MC|BOpen", __call900209_33(p0)));
    }
    if (!((forestValue900209_82_0 != 0))) {
        break forest_join_107;
    }
    life5_109 = __call900209_38(__fieldRead900209_37(__fieldRead900209_36(receiver)));
    spill900209_4 = life5_109;
    if (!((life4_10 == 0))) {
        forestValue900209_93_0 = spill900209_4;
        break forest_join_93;
    }
    if (!((spill900209_4 != null))) {
        break forest_join_107;
    }
    forestValue900209_93_0 = life5_109;
    }
    if (!((__call900209_39(forestValue900209_93_0) == __fieldRead900209_40()))) {
        break forest_join_107;
    }
    __call900209_44(__fieldRead900209_41(receiver), new net.minecraft.client.gui.GuiScreenBook(__fieldRead900209_43(__fieldRead900209_42(receiver)), life5_109, false));
    }
    return;
}
public static void h900209_0(java.io.IOException p0) throws Throwable {
    throw __call93020900_0(p0);
}
public static void h900209_1(java.io.IOException p0) throws Throwable {
    throw __call93020901_0(p0);
}
public static void h900209_2(java.io.IOException p0) throws Throwable {
    throw __call93020902_0(p0);
}
public static void h900209_3(java.io.IOException p0) throws Throwable {
    throw __call93020903_0(p0);
}
public static void h900209_4(java.io.IOException p0, net.minecraft.client.network.NetHandlerPlayClient p1, moom.Ay p2, long p3, int p4, net.minecraft.network.PacketBuffer p5) throws Throwable {
    int forestValue93020904_36_0;
    net.minecraft.item.ItemStack forestValue93020904_47_0;
    boolean spill93020904_0;
    net.minecraft.item.ItemStack spill93020904_1;
    java.io.IOException life7_2;
    net.minecraft.item.ItemStack life6_52;
    forest_join_61: {
    forest_join_47: {
    forest_join_36: {
    forest_join_32: {
    life7_2 = p0;
    __call93020904_1(__fieldRead93020904_0(), "Couldn't load trade info", life7_2);
    __call93020904_2(p5);
    if (!((p4 != 0))) {
        break forest_join_61;
    }
    spill93020904_0 = __call93020904_4("MC|Brand", __call93020904_3(p2));
    if (!((p4 == 0))) {
        forestValue93020904_36_0 = __integerCategory93020904_5(spill93020904_0);
        break forest_join_36;
    }
    if (!(spill93020904_0)) {
        break forest_join_32;
    }
    __call93020904_11(__fieldRead93020904_7(__fieldRead93020904_6(p1)), __call93020904_10(__call93020904_8(p2), __invokedynamic93020904_9(13145, (8011081072929565605L ^ p3))));
    if (!((p4 != 0))) {
        break forest_join_61;
    }
    }
    forestValue93020904_36_0 = __integerCategory93020904_14(__call93020904_13("MC|BOpen", __call93020904_12(p2)));
    }
    if (!((forestValue93020904_36_0 != 0))) {
        break forest_join_61;
    }
    life6_52 = __call93020904_17(__fieldRead93020904_16(__fieldRead93020904_15(p1)));
    spill93020904_1 = life6_52;
    if (!((p4 == 0))) {
        forestValue93020904_47_0 = spill93020904_1;
        break forest_join_47;
    }
    if (!((spill93020904_1 != null))) {
        break forest_join_61;
    }
    forestValue93020904_47_0 = life6_52;
    }
    if (!((__call93020904_18(forestValue93020904_47_0) == __fieldRead93020904_19()))) {
        break forest_join_61;
    }
    __call93020904_23(__fieldRead93020904_20(p1), new net.minecraft.client.gui.GuiScreenBook(__fieldRead93020904_22(__fieldRead93020904_21(p1)), life6_52, false));
    }
    return;
}
public static void h900209_5(java.lang.Throwable p0, net.minecraft.network.PacketBuffer p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call93020905_0(p1);
    throw life2_2;
}
public static void h900209_6(java.io.IOException p0) throws Throwable {
    throw __call93020906_0(p0);
}
public static void h900209_7(java.io.IOException p0) throws Throwable {
    throw __call93020907_0(p0);
}
public static void h900209_8(java.io.IOException p0) throws Throwable {
    throw __call93020908_0(p0);
}
public static void h900209_9(java.io.IOException p0) throws Throwable {
    throw __call93020909_0(p0);
}
public static void h900209_10(java.io.IOException p0) throws Throwable {
    throw __call93020910_0(p0);
}
public static void h900209_11(java.io.IOException p0) throws Throwable {
    throw __call93020911_0(p0);
}
private static native long __fieldRead900209_0() throws Throwable;
private static native boolean __call900209_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900209_2(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call900209_3(moom.Ay a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native int __integerCategory900209_4(boolean value) throws Throwable;
private static native java.lang.String __call900209_5(moom.Ay a0) throws Throwable;
private static native boolean __call900209_6(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory900209_7(boolean value) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call900209_8(moom.Ay a0) throws Throwable;
private static native int __call900209_9(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900209_10(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead900209_11(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __instanceOf900209_12(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900209_13(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead900209_14(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.v8 __fieldRead900209_15(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __fieldRead900209_16(moom.v8 a0) throws Throwable;
private static native net.minecraft.client.gui.GuiMerchant __cast900209_17(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native net.minecraft.entity.IMerchant __call900209_18(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native moom.OF __call900209_19(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __call900209_20(net.minecraft.entity.IMerchant a0, moom.OF a1) throws Throwable;
private static native boolean __call900209_21(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native int __integerCategory900209_22(boolean value) throws Throwable;
private static native void __discardScalar900209_23(int a0) throws Throwable;
private static native java.lang.String __call900209_24(moom.Ay a0) throws Throwable;
private static native boolean __call900209_25(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory900209_26(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900209_27(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead900209_28(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call900209_29(moom.Ay a0) throws Throwable;
private static native int __invokedynamic900209_30(int a0, long a1) throws Throwable;
private static native java.lang.String __call900209_31(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native void __call900209_32(net.minecraft.client.entity.EntityPlayerSP a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call900209_33(moom.Ay a0) throws Throwable;
private static native boolean __call900209_34(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory900209_35(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900209_36(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead900209_37(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call900209_38(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.item.Item __call900209_39(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.Item __fieldRead900209_40() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900209_41(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900209_42(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead900209_43(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call900209_44(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiScreenBook a1) throws Throwable;
private static native java.lang.Throwable __call93020900_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call93020901_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call93020902_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call93020903_0(java.io.IOException a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead93020904_0() throws Throwable;
private static native void __call93020904_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.io.IOException a2) throws Throwable;
private static native boolean __call93020904_2(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native java.lang.String __call93020904_3(moom.Ay a0) throws Throwable;
private static native boolean __call93020904_4(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory93020904_5(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead93020904_6(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead93020904_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call93020904_8(moom.Ay a0) throws Throwable;
private static native int __invokedynamic93020904_9(int a0, long a1) throws Throwable;
private static native java.lang.String __call93020904_10(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native void __call93020904_11(net.minecraft.client.entity.EntityPlayerSP a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call93020904_12(moom.Ay a0) throws Throwable;
private static native boolean __call93020904_13(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory93020904_14(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead93020904_15(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead93020904_16(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call93020904_17(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.item.Item __call93020904_18(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.Item __fieldRead93020904_19() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead93020904_20(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead93020904_21(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead93020904_22(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call93020904_23(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiScreenBook a1) throws Throwable;
private static native boolean __call93020905_0(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native java.lang.Throwable __call93020906_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call93020907_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call93020908_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call93020909_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call93020910_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call93020911_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b1969f6ddc0d52b29653(net.minecraft.client.network.NetHandlerPlayClient a0, moom.yK a1) throws E;
private static final class __SourceHandler_b1969f6ddc0d52b29653 {

public static void f1370(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.yK p0) throws Throwable {
    int forwardValue1370_25_0;
    moom.yK forwardValue1370_27_0;
    boolean spill1370_0;
    boolean spill1370_1;
    moom.yK spill1370_2;
    long life2_3;
    com.moon.event.PacketEvent life5_9;
    int life4_15;
    moom.zc life6_37;
    forward_join_40: {
    forward_join_36: {
    forward_join_27: {
    forward_join_25: {
    life2_3 = (__fieldRead1370_0() ^ 8184776820621L);
    life5_9 = new com.moon.event.PacketEvent(true, p0);
    spill1370_0 = __call1370_1();
    __call1370_4(__call1370_3(__call1370_2()), life5_9);
    life4_15 = __integerCategory1370_5(spill1370_0);
    spill1370_1 = __call1370_6(life5_9);
    if (!((life4_15 != 0))) {
        forwardValue1370_25_0 = __integerCategory1370_7(spill1370_1);
        break forward_join_25;
    }
    if (!((!spill1370_1))) {
        break forward_join_40;
    }
    spill1370_2 = p0;
    if (!((life4_15 != 0))) {
        forwardValue1370_27_0 = spill1370_2;
        break forward_join_27;
    }
    forwardValue1370_25_0 = __instanceOf1370_8(spill1370_2);
    }
    if (!((forwardValue1370_25_0 != 0))) {
        break forward_join_36;
    }
    forwardValue1370_27_0 = p0;
    }
    life6_37 = __cast1370_9(forwardValue1370_27_0);
    __call1370_14(__fieldRead1370_12(__fieldRead1370_11(__fieldRead1370_10(receiver))), __call1370_13(life6_37));
    }
    __call1370_16(__fieldRead1370_15(receiver), p0);
    }
    return;
}
public static void h1370_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137000_0(p0);
}
public static void h1370_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137001_0(p0);
}
public static void h1370_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137002_0(p0);
}
private static native long __fieldRead1370_0() throws Throwable;
private static native boolean __call1370_1() throws Throwable;
private static native com.moon.runtime.ClientContext __call1370_2() throws Throwable;
private static native com.moon.events.EventBus __call1370_3(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call1370_4(com.moon.events.EventBus a0, com.moon.event.PacketEvent a1) throws Throwable;
private static native int __integerCategory1370_5(boolean value) throws Throwable;
private static native boolean __call1370_6(com.moon.event.PacketEvent a0) throws Throwable;
private static native int __integerCategory1370_7(boolean value) throws Throwable;
private static native int __instanceOf1370_8(moom.yK a0) throws Throwable;
private static native moom.zc __cast1370_9(moom.yK a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1370_10(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1370_11(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.moon.gF __fieldRead1370_12(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __call1370_13(moom.zc a0) throws Throwable;
private static native void __call1370_14(com.moon.gF a0, int a1) throws Throwable;
private static native net.minecraft.network.NetworkManager __fieldRead1370_15(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1370_16(net.minecraft.network.NetworkManager a0, moom.yK a1) throws Throwable;
private static native java.lang.Throwable __call1137000_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137001_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137002_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5f72487fb39133bb4f00(net.minecraft.client.network.NetHandlerPlayClient a0, moom.z1 a1) throws E;
private static final class __SourceHandler_5f72487fb39133bb4f00 {

public static void f1371(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.z1 p0) throws Throwable {
    net.minecraft.world.chunk.Chunk forwardValue1371_137_0;
    boolean spill1371_0;
    net.minecraft.world.chunk.Chunk spill1371_1;
    long life2_3;
    int life4_10;
    net.minecraft.world.chunk.Chunk life5_88;
    forward_join_138: {
    forward_join_137: {
    forward_join_136: {
    forward_join_73: {
    forward_join_36: {
    forward_join_28: {
    life2_3 = (__fieldRead1371_0() ^ 139769987487792L);
    spill1371_0 = __call1371_1();
    __call1371_3(p0, receiver, __fieldRead1371_2(receiver));
    life4_10 = __integerCategory1371_4(spill1371_0);
    if (!((life4_10 != 0))) {
        break forward_join_73;
    }
    if (!(__call1371_5(p0))) {
        break forward_join_36;
    }
    if (!((__call1371_6(p0) == 0))) {
        break forward_join_28;
    }
    __call1371_10(__fieldRead1371_7(receiver), __call1371_8(p0), __call1371_9(p0), 0);
    return;
    }
    __call1371_14(__fieldRead1371_11(receiver), __call1371_12(p0), __call1371_13(p0), 1);
    }
    __call1371_23(__fieldRead1371_15(receiver), (__call1371_16(p0) << 4), 0, (__call1371_17(p0) << 4), ((__call1371_18(p0) << 4) + __invokedynamic1371_19(3660, (32762185393313270L ^ life2_3))), __invokedynamic1371_20(15633, (7669040117759092406L ^ life2_3)), ((__call1371_21(p0) << 4) + __invokedynamic1371_22(3660, (32762185393313270L ^ life2_3))));
    }
    life5_88 = __call1371_27(__fieldRead1371_24(receiver), __call1371_25(p0), __call1371_26(p0));
    spill1371_1 = life5_88;
    if (!((life4_10 != 0))) {
        forwardValue1371_137_0 = spill1371_1;
        break forward_join_137;
    }
    __call1371_31(spill1371_1, __call1371_28(p0), __call1371_29(p0), __call1371_30(p0));
    __call1371_40(__fieldRead1371_32(receiver), (__call1371_33(p0) << 4), 0, (__call1371_34(p0) << 4), ((__call1371_35(p0) << 4) + __invokedynamic1371_36(3660, (32762185393313270L ^ life2_3))), __invokedynamic1371_37(15633, (7669040117759092406L ^ life2_3)), ((__call1371_38(p0) << 4) + __invokedynamic1371_39(3660, (32762185393313270L ^ life2_3))));
    if (!(__call1371_41(p0))) {
        break forward_join_136;
    }
    if (!((__instanceOf1371_44(__fieldRead1371_43(__fieldRead1371_42(receiver))) == 0))) {
        break forward_join_138;
    }
    }
    forwardValue1371_137_0 = life5_88;
    }
    __call1371_45(forwardValue1371_137_0);
    }
    return;
}
public static void h1371_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137100_0(p0);
}
public static void h1371_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137101_0(p0);
}
public static void h1371_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137102_0(p0);
}
public static void h1371_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137103_0(p0);
}
public static void h1371_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137104_0(p0);
}
public static void h1371_5(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137105_0(p0);
}
private static native long __fieldRead1371_0() throws Throwable;
private static native boolean __call1371_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1371_2(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1371_3(moom.z1 a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native int __integerCategory1371_4(boolean value) throws Throwable;
private static native boolean __call1371_5(moom.z1 a0) throws Throwable;
private static native int __call1371_6(moom.z1 a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1371_7(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call1371_8(moom.z1 a0) throws Throwable;
private static native int __call1371_9(moom.z1 a0) throws Throwable;
private static native void __call1371_10(net.minecraft.client.multiplayer.WorldClient a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1371_11(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call1371_12(moom.z1 a0) throws Throwable;
private static native int __call1371_13(moom.z1 a0) throws Throwable;
private static native void __call1371_14(net.minecraft.client.multiplayer.WorldClient a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1371_15(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call1371_16(moom.z1 a0) throws Throwable;
private static native int __call1371_17(moom.z1 a0) throws Throwable;
private static native int __call1371_18(moom.z1 a0) throws Throwable;
private static native int __invokedynamic1371_19(int a0, long a1) throws Throwable;
private static native int __invokedynamic1371_20(int a0, long a1) throws Throwable;
private static native int __call1371_21(moom.z1 a0) throws Throwable;
private static native int __invokedynamic1371_22(int a0, long a1) throws Throwable;
private static native void __call1371_23(net.minecraft.client.multiplayer.WorldClient a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1371_24(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call1371_25(moom.z1 a0) throws Throwable;
private static native int __call1371_26(moom.z1 a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call1371_27(net.minecraft.client.multiplayer.WorldClient a0, int a1, int a2) throws Throwable;
private static native byte[] __call1371_28(moom.z1 a0) throws Throwable;
private static native int __call1371_29(moom.z1 a0) throws Throwable;
private static native boolean __call1371_30(moom.z1 a0) throws Throwable;
private static native void __call1371_31(net.minecraft.world.chunk.Chunk a0, byte[] a1, int a2, boolean a3) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1371_32(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call1371_33(moom.z1 a0) throws Throwable;
private static native int __call1371_34(moom.z1 a0) throws Throwable;
private static native int __call1371_35(moom.z1 a0) throws Throwable;
private static native int __invokedynamic1371_36(int a0, long a1) throws Throwable;
private static native int __invokedynamic1371_37(int a0, long a1) throws Throwable;
private static native int __call1371_38(moom.z1 a0) throws Throwable;
private static native int __invokedynamic1371_39(int a0, long a1) throws Throwable;
private static native void __call1371_40(net.minecraft.client.multiplayer.WorldClient a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native boolean __call1371_41(moom.z1 a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1371_42(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native moom.EA __fieldRead1371_43(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native int __instanceOf1371_44(moom.EA a0) throws Throwable;
private static native void __call1371_45(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native java.lang.Throwable __call1137100_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137101_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137102_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137103_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137104_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137105_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_98c72af20a94040c7116(net.minecraft.client.network.NetHandlerPlayClient a0, moom.z8 a1) throws E;
private static final class __SourceHandler_98c72af20a94040c7116 {

public static void f1372(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.z8 p0) throws Throwable {
    boolean spill1372_0;
    long life2_3;
    int life4_10;
    int life5_12;
    int life6_20;
    int life7_24;
    net.minecraft.world.chunk.Chunk life8_69;
    lexical_join_124: {
    life2_3 = (__fieldRead1372_0() ^ 30547661795923L);
    spill1372_0 = __call1372_1();
    __call1372_3(p0, receiver, __fieldRead1372_2(receiver));
    life4_10 = __integerCategory1372_4(spill1372_0);
    life5_12 = 0;
    lexical_cycle_13: while (true) {
    lexical_join_122: {
    lexical_join_121: {
    if (!((life5_12 < __call1372_5(p0)))) {
        break lexical_join_124;
    }
    life6_20 = __call1372_6(p0, life5_12);
    life7_24 = __call1372_7(p0, life5_12);
    __call1372_9(__fieldRead1372_8(receiver), life6_20, life7_24, 1);
    __call1372_14(__fieldRead1372_10(receiver), (life6_20 << 4), 0, (life7_24 << 4), ((life6_20 << 4) + __invokedynamic1372_11(25954, (5951344034628572342L ^ life2_3))), __invokedynamic1372_12(3449, (1373056207644916898L ^ life2_3)), ((life7_24 << 4) + __invokedynamic1372_13(3660, (32653151980814229L ^ life2_3))));
    life8_69 = __call1372_16(__fieldRead1372_15(receiver), life6_20, life7_24);
    __call1372_19(life8_69, __call1372_17(p0, life5_12), __call1372_18(p0, life5_12), 1);
    __call1372_24(__fieldRead1372_20(receiver), (life6_20 << 4), 0, (life7_24 << 4), ((life6_20 << 4) + __invokedynamic1372_21(3660, (32653151980814229L ^ life2_3))), __invokedynamic1372_22(15633, (7668930377829043413L ^ life2_3)), ((life7_24 << 4) + __invokedynamic1372_23(3660, (32653151980814229L ^ life2_3))));
    if (!((life4_10 == 0))) {
        break lexical_join_122;
    }
    if (!((__instanceOf1372_27(__fieldRead1372_26(__fieldRead1372_25(receiver))) == 0))) {
        break lexical_join_121;
    }
    __call1372_28(life8_69);
    }
    life5_12 += 1;
    }
    if (!((life4_10 != 0))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return;
}
public static void h1372_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137200_0(p0);
}
public static void h1372_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137201_0(p0);
}
private static native long __fieldRead1372_0() throws Throwable;
private static native boolean __call1372_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1372_2(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1372_3(moom.z8 a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native int __integerCategory1372_4(boolean value) throws Throwable;
private static native int __call1372_5(moom.z8 a0) throws Throwable;
private static native int __call1372_6(moom.z8 a0, int a1) throws Throwable;
private static native int __call1372_7(moom.z8 a0, int a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1372_8(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1372_9(net.minecraft.client.multiplayer.WorldClient a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1372_10(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __invokedynamic1372_11(int a0, long a1) throws Throwable;
private static native int __invokedynamic1372_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic1372_13(int a0, long a1) throws Throwable;
private static native void __call1372_14(net.minecraft.client.multiplayer.WorldClient a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1372_15(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call1372_16(net.minecraft.client.multiplayer.WorldClient a0, int a1, int a2) throws Throwable;
private static native byte[] __call1372_17(moom.z8 a0, int a1) throws Throwable;
private static native int __call1372_18(moom.z8 a0, int a1) throws Throwable;
private static native void __call1372_19(net.minecraft.world.chunk.Chunk a0, byte[] a1, int a2, int a3) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1372_20(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __invokedynamic1372_21(int a0, long a1) throws Throwable;
private static native int __invokedynamic1372_22(int a0, long a1) throws Throwable;
private static native int __invokedynamic1372_23(int a0, long a1) throws Throwable;
private static native void __call1372_24(net.minecraft.client.multiplayer.WorldClient a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1372_25(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native moom.EA __fieldRead1372_26(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native int __instanceOf1372_27(moom.EA a0) throws Throwable;
private static native void __call1372_28(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native java.lang.Throwable __call1137200_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137201_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_285bf99bf5a588fbee32(net.minecraft.client.network.NetHandlerPlayClient a0, moom.z9 a1) throws E;
private static final class __SourceHandler_285bf99bf5a588fbee32 {

public static void f670002(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.z9 p0) throws Throwable {
    int forwardValue670002_17_0;
    int forwardValue670002_24_0;
    int forwardValue670002_31_0;
    int forwardValue670002_38_0;
    int forwardValue670002_45_0;
    int forwardValue670002_54_0;
    moom.z9 forwardValue670002_57_0;
    int forwardValue670002_116_0;
    int forwardValue670002_124_0;
    int forwardValue670002_133_0;
    int forwardValue670002_138_0;
    int forwardValue670002_163_0;
    int spill670002_0;
    moom.z9 spill670002_1;
    int spill670002_2;
    long life2_3;
    int life4_5;
    moom.Ei life5_117;
    com.moon.n5 life6_133;
    com.moon.dW life7_141;
    forward_join_174: {
    forward_join_163: {
    forward_join_161: {
    forward_join_138: {
    forward_join_133: {
    forward_join_131: {
    forward_join_127: {
    forward_join_124: {
    forward_join_116: {
    forward_join_57: {
    forward_join_56: {
    forward_join_55: {
    forward_join_54: {
    forward_join_45: {
    forward_join_38: {
    forward_join_31: {
    forward_join_24: {
    forward_join_17: {
    life2_3 = (__fieldRead670002_0() ^ 4556433394711L);
    life4_5 = __integerCategory670002_2(__call670002_1());
    spill670002_0 = __numericCompare670002_5(__call670002_3(p0), __exactNonfiniteDoubleLiteral670002_4());
    if (!((life4_5 == 0))) {
        forwardValue670002_17_0 = spill670002_0;
        break forward_join_17;
    }
    if (!((spill670002_0 < 0))) {
        break forward_join_55;
    }
    forwardValue670002_17_0 = __numericCompare670002_8(__call670002_6(p0), __exactNonfiniteDoubleLiteral670002_7());
    }
    if (!((life4_5 == 0))) {
        forwardValue670002_24_0 = forwardValue670002_17_0;
        break forward_join_24;
    }
    if (!((forwardValue670002_17_0 < 0))) {
        break forward_join_55;
    }
    forwardValue670002_24_0 = __numericCompare670002_11(__call670002_9(p0), __exactNonfiniteDoubleLiteral670002_10());
    }
    if (!((life4_5 == 0))) {
        forwardValue670002_31_0 = forwardValue670002_24_0;
        break forward_join_31;
    }
    if (!((forwardValue670002_24_0 < 0))) {
        break forward_join_55;
    }
    forwardValue670002_31_0 = __numericCompare670002_14(__call670002_12(p0), __exactNonfiniteFloatLiteral670002_13());
    }
    if (!((life4_5 == 0))) {
        forwardValue670002_38_0 = forwardValue670002_31_0;
        break forward_join_38;
    }
    if (!((forwardValue670002_31_0 < 0))) {
        break forward_join_55;
    }
    forwardValue670002_38_0 = __numericCompare670002_17(__call670002_15(p0), __exactNonfiniteFloatLiteral670002_16());
    }
    if (!((life4_5 == 0))) {
        forwardValue670002_45_0 = forwardValue670002_38_0;
        break forward_join_45;
    }
    if (!((forwardValue670002_38_0 < 0))) {
        break forward_join_55;
    }
    forwardValue670002_45_0 = __numericCompare670002_20(__call670002_18(p0), __exactNonfiniteFloatLiteral670002_19());
    }
    if (!((life4_5 == 0))) {
        forwardValue670002_54_0 = forwardValue670002_45_0;
        break forward_join_54;
    }
    if (!((forwardValue670002_45_0 < 0))) {
        break forward_join_55;
    }
    spill670002_1 = p0;
    if (!((life4_5 == 0))) {
        forwardValue670002_57_0 = spill670002_1;
        break forward_join_57;
    }
    forwardValue670002_54_0 = __numericCompare670002_23(__call670002_21(spill670002_1), __exactNonfiniteFloatLiteral670002_22());
    }
    if (!((forwardValue670002_54_0 >= 0))) {
        break forward_join_56;
    }
    }
    return;
    }
    forwardValue670002_57_0 = p0;
    }
    __call670002_25(forwardValue670002_57_0, receiver, __fieldRead670002_24(receiver));
    life5_117 = new moom.Ei(__fieldRead670002_27(__fieldRead670002_26(receiver)), null, __call670002_28(p0), __call670002_29(p0), __call670002_30(p0), __call670002_31(p0), __call670002_32(p0));
    __call670002_33(life5_117, 1);
    life6_133 = new com.moon.n5(((double) __call670002_34(p0)), ((double) __call670002_35(p0)), ((double) __call670002_36(p0)));
    life7_141 = new com.moon.dW(life6_133, true, false, false);
    spill670002_2 = __numericCompare670002_39(__call670002_38(__call670002_37(life7_141)), 0x0.0p0d);
    if (!((life4_5 == 0))) {
        forwardValue670002_116_0 = spill670002_2;
        break forward_join_116;
    }
    if (!((spill670002_2 <= 0))) {
        break forward_join_127;
    }
    forwardValue670002_116_0 = __numericCompare670002_42(__call670002_41(__call670002_40(life7_141)), 0x0.0p0d);
    }
    if (!((life4_5 == 0))) {
        forwardValue670002_124_0 = forwardValue670002_116_0;
        break forward_join_124;
    }
    if (!((forwardValue670002_116_0 <= 0))) {
        break forward_join_127;
    }
    forwardValue670002_124_0 = __numericCompare670002_45(__call670002_44(__call670002_43(life7_141)), 0x0.0p0d);
    }
    if (!((life4_5 == 0))) {
        forwardValue670002_133_0 = forwardValue670002_124_0;
        break forward_join_133;
    }
    if (!((forwardValue670002_124_0 > 0))) {
        break forward_join_131;
    }
    }
    __call670002_48(__call670002_47(__call670002_46()), life7_141);
    }
    forwardValue670002_133_0 = __integerCategory670002_50(__call670002_49(life7_141));
    }
    if (!((life4_5 == 0))) {
        forwardValue670002_138_0 = forwardValue670002_133_0;
        break forward_join_138;
    }
    if (!((forwardValue670002_133_0 == 0))) {
        break forward_join_174;
    }
    forwardValue670002_138_0 = __integerCategory670002_52(__call670002_51(life7_141));
    }
    if (!((life4_5 == 0))) {
        forwardValue670002_163_0 = forwardValue670002_138_0;
        break forward_join_163;
    }
    if (!((forwardValue670002_138_0 == 0))) {
        break forward_join_161;
    }
    net.minecraft.client.entity.EntityPlayerSP __stackOp670002_55_0 = __fieldRead670002_54(__fieldRead670002_53(receiver));
    __fieldWrite670002_59(__stackOp670002_55_0, (__fieldRead670002_56(__stackOp670002_55_0) + __call670002_58(__call670002_57(life7_141))));
    net.minecraft.client.entity.EntityPlayerSP __stackOp670002_62_0 = __fieldRead670002_61(__fieldRead670002_60(receiver));
    __fieldWrite670002_66(__stackOp670002_62_0, (__fieldRead670002_63(__stackOp670002_62_0) + __call670002_65(__call670002_64(life7_141))));
    }
    forwardValue670002_163_0 = __integerCategory670002_68(__call670002_67(life7_141));
    }
    if (!((forwardValue670002_163_0 == 0))) {
        break forward_join_174;
    }
    net.minecraft.client.entity.EntityPlayerSP __stackOp670002_71_0 = __fieldRead670002_70(__fieldRead670002_69(receiver));
    __fieldWrite670002_75(__stackOp670002_71_0, (__fieldRead670002_72(__stackOp670002_71_0) + __call670002_74(__call670002_73(life7_141))));
    }
    return;
}
public static void h670002_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call69000200_0(p0);
}
public static void h670002_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call69000201_0(p0);
}
public static void h670002_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call69000202_0(p0);
}
public static void h670002_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call69000203_0(p0);
}
public static void h670002_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call69000204_0(p0);
}
public static void h670002_5(java.lang.IllegalStateException p0) throws Throwable {
    throw __call69000205_0(p0);
}
public static void h670002_6(java.lang.IllegalStateException p0) throws Throwable {
    throw __call69000206_0(p0);
}
public static void h670002_7(java.lang.IllegalStateException p0) throws Throwable {
    throw __call69000207_0(p0);
}
public static void h670002_8(java.lang.IllegalStateException p0) throws Throwable {
    throw __call69000208_0(p0);
}
public static void h670002_9(java.lang.IllegalStateException p0) throws Throwable {
    throw __call69000209_0(p0);
}
public static void h670002_10(java.lang.IllegalStateException p0) throws Throwable {
    throw __call69000210_0(p0);
}
public static void h670002_11(java.lang.IllegalStateException p0) throws Throwable {
    throw __call69000211_0(p0);
}
public static void h670002_12(java.lang.IllegalStateException p0) throws Throwable {
    throw __call69000212_0(p0);
}
public static void h670002_13(java.lang.IllegalStateException p0) throws Throwable {
    throw __call69000213_0(p0);
}
public static void h670002_14(java.lang.IllegalStateException p0) throws Throwable {
    throw __call69000214_0(p0);
}
public static void h670002_15(java.lang.IllegalStateException p0) throws Throwable {
    throw __call69000215_0(p0);
}
public static void h670002_16(java.lang.IllegalStateException p0) throws Throwable {
    throw __call69000216_0(p0);
}
public static void h670002_17(java.lang.IllegalStateException p0) throws Throwable {
    throw __call69000217_0(p0);
}
public static void h670002_18(java.lang.IllegalStateException p0) throws Throwable {
    throw __call69000218_0(p0);
}
public static void h670002_19(java.lang.IllegalStateException p0) throws Throwable {
    throw __call69000219_0(p0);
}
public static void h670002_20(java.lang.IllegalStateException p0) throws Throwable {
    throw __call69000220_0(p0);
}
public static void h670002_21(java.lang.IllegalStateException p0) throws Throwable {
    throw __call69000221_0(p0);
}
public static void h670002_22(java.lang.IllegalStateException p0) throws Throwable {
    throw __call69000222_0(p0);
}
public static void h670002_23(java.lang.IllegalStateException p0) throws Throwable {
    throw __call69000223_0(p0);
}
private static native long __fieldRead670002_0() throws Throwable;
private static native boolean __call670002_1() throws Throwable;
private static native int __integerCategory670002_2(boolean value) throws Throwable;
private static native double __call670002_3(moom.z9 a0) throws Throwable;
private static native double __exactNonfiniteDoubleLiteral670002_4() throws Throwable;
private static native int __numericCompare670002_5(double a0, double a1) throws Throwable;
private static native double __call670002_6(moom.z9 a0) throws Throwable;
private static native double __exactNonfiniteDoubleLiteral670002_7() throws Throwable;
private static native int __numericCompare670002_8(double a0, double a1) throws Throwable;
private static native double __call670002_9(moom.z9 a0) throws Throwable;
private static native double __exactNonfiniteDoubleLiteral670002_10() throws Throwable;
private static native int __numericCompare670002_11(double a0, double a1) throws Throwable;
private static native float __call670002_12(moom.z9 a0) throws Throwable;
private static native float __exactNonfiniteFloatLiteral670002_13() throws Throwable;
private static native int __numericCompare670002_14(float a0, float a1) throws Throwable;
private static native float __call670002_15(moom.z9 a0) throws Throwable;
private static native float __exactNonfiniteFloatLiteral670002_16() throws Throwable;
private static native int __numericCompare670002_17(float a0, float a1) throws Throwable;
private static native float __call670002_18(moom.z9 a0) throws Throwable;
private static native float __exactNonfiniteFloatLiteral670002_19() throws Throwable;
private static native int __numericCompare670002_20(float a0, float a1) throws Throwable;
private static native float __call670002_21(moom.z9 a0) throws Throwable;
private static native float __exactNonfiniteFloatLiteral670002_22() throws Throwable;
private static native int __numericCompare670002_23(float a0, float a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead670002_24(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call670002_25(moom.z9 a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead670002_26(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead670002_27(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __call670002_28(moom.z9 a0) throws Throwable;
private static native double __call670002_29(moom.z9 a0) throws Throwable;
private static native double __call670002_30(moom.z9 a0) throws Throwable;
private static native float __call670002_31(moom.z9 a0) throws Throwable;
private static native java.util.List __call670002_32(moom.z9 a0) throws Throwable;
private static native void __call670002_33(moom.Ei a0, int a1) throws Throwable;
private static native float __call670002_34(moom.z9 a0) throws Throwable;
private static native float __call670002_35(moom.z9 a0) throws Throwable;
private static native float __call670002_36(moom.z9 a0) throws Throwable;
private static native com.moon.n5 __call670002_37(com.moon.dW a0) throws Throwable;
private static native double __call670002_38(com.moon.n5 a0) throws Throwable;
private static native int __numericCompare670002_39(double a0, double a1) throws Throwable;
private static native com.moon.n5 __call670002_40(com.moon.dW a0) throws Throwable;
private static native double __call670002_41(com.moon.n5 a0) throws Throwable;
private static native int __numericCompare670002_42(double a0, double a1) throws Throwable;
private static native com.moon.n5 __call670002_43(com.moon.dW a0) throws Throwable;
private static native double __call670002_44(com.moon.n5 a0) throws Throwable;
private static native int __numericCompare670002_45(double a0, double a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call670002_46() throws Throwable;
private static native com.moon.events.EventBus __call670002_47(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call670002_48(com.moon.events.EventBus a0, com.moon.dW a1) throws Throwable;
private static native boolean __call670002_49(com.moon.dW a0) throws Throwable;
private static native int __integerCategory670002_50(boolean value) throws Throwable;
private static native boolean __call670002_51(com.moon.dW a0) throws Throwable;
private static native int __integerCategory670002_52(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead670002_53(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead670002_54(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead670002_56(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native com.moon.n5 __call670002_57(com.moon.dW a0) throws Throwable;
private static native double __call670002_58(com.moon.n5 a0) throws Throwable;
private static native void __fieldWrite670002_59(net.minecraft.client.entity.EntityPlayerSP a0, double a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead670002_60(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead670002_61(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead670002_63(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native com.moon.n5 __call670002_64(com.moon.dW a0) throws Throwable;
private static native double __call670002_65(com.moon.n5 a0) throws Throwable;
private static native void __fieldWrite670002_66(net.minecraft.client.entity.EntityPlayerSP a0, double a1) throws Throwable;
private static native boolean __call670002_67(com.moon.dW a0) throws Throwable;
private static native int __integerCategory670002_68(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead670002_69(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead670002_70(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead670002_72(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native com.moon.n5 __call670002_73(com.moon.dW a0) throws Throwable;
private static native double __call670002_74(com.moon.n5 a0) throws Throwable;
private static native void __fieldWrite670002_75(net.minecraft.client.entity.EntityPlayerSP a0, double a1) throws Throwable;
private static native java.lang.Throwable __call69000200_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call69000201_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call69000202_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call69000203_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call69000204_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call69000205_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call69000206_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call69000207_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call69000208_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call69000209_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call69000210_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call69000211_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call69000212_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call69000213_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call69000214_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call69000215_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call69000216_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call69000217_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call69000218_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call69000219_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call69000220_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call69000221_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call69000222_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call69000223_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_57fca5915e183e5187d8(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zA a1) throws E;
private static final class __SourceHandler_57fca5915e183e5187d8 {

public static void f2386(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.zA p0) throws Throwable {
    long life2_3;
    int life4_10;
    net.minecraft.scoreboard.Scoreboard life5_29;
    life2_3 = (__fieldRead2386_0() ^ 7335877526454L);
    boolean spill2386_0 = __call2386_1();
    __call2386_3(p0, receiver, __fieldRead2386_2(receiver));
    life4_10 = __integerCategory2386_4(spill2386_0);
    if ((life4_10 == 0)) {
        if ((__call2386_5(p0) != __fieldRead2386_8(__fieldRead2386_7(__fieldRead2386_6(receiver))))) {
        __fieldWrite2386_9(receiver, 0);
        life5_29 = __call2386_11(__fieldRead2386_10(receiver));
        __fieldWrite2386_22(receiver, new net.minecraft.client.multiplayer.WorldClient(receiver, new moom.EK(0L, __call2386_12(p0), false, __call2386_16(__call2386_15(__fieldRead2386_14(__fieldRead2386_13(receiver)))), __call2386_17(p0)), __call2386_18(p0), __call2386_19(p0), __fieldRead2386_21(__fieldRead2386_20(receiver))));
        __call2386_24(__fieldRead2386_23(receiver), life5_29);
        __call2386_27(__fieldRead2386_25(receiver), __fieldRead2386_26(receiver));
        __fieldWrite2386_31(__fieldRead2386_29(__fieldRead2386_28(receiver)), __call2386_30(p0));
        __call2386_33(__fieldRead2386_32(receiver), new moom.gP(receiver));
    }
        __call2386_36(__fieldRead2386_34(receiver), __call2386_35(p0));
        __call2386_40(__fieldRead2386_38(__fieldRead2386_37(receiver)), __call2386_39(p0));
    }
    return;
}
public static void h2386_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1238600_0(p0);
}
private static native long __fieldRead2386_0() throws Throwable;
private static native boolean __call2386_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2386_2(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call2386_3(moom.zA a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native int __integerCategory2386_4(boolean value) throws Throwable;
private static native int __call2386_5(moom.zA a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2386_6(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead2386_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead2386_8(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native void __fieldWrite2386_9(net.minecraft.client.network.NetHandlerPlayClient a0, int a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead2386_10(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call2386_11(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __call2386_12(moom.zA a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2386_13(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead2386_14(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call2386_15(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native boolean __call2386_16(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.world.WorldType __call2386_17(moom.zA a0) throws Throwable;
private static native int __call2386_18(moom.zA a0) throws Throwable;
private static native net.minecraft.world.EnumDifficulty __call2386_19(moom.zA a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2386_20(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native moom.A9 __fieldRead2386_21(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite2386_22(net.minecraft.client.network.NetHandlerPlayClient a0, net.minecraft.client.multiplayer.WorldClient a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead2386_23(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call2386_24(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.scoreboard.Scoreboard a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2386_25(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead2386_26(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call2386_27(net.minecraft.client.Minecraft a0, net.minecraft.client.multiplayer.WorldClient a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2386_28(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead2386_29(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __call2386_30(moom.zA a0) throws Throwable;
private static native void __fieldWrite2386_31(net.minecraft.client.entity.EntityPlayerSP a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2386_32(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call2386_33(net.minecraft.client.Minecraft a0, moom.gP a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2386_34(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call2386_35(moom.zA a0) throws Throwable;
private static native void __call2386_36(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2386_37(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native moom.jI __fieldRead2386_38(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __call2386_39(moom.zA a0) throws Throwable;
private static native void __call2386_40(moom.jI a0, net.minecraft.world.WorldSettings$GameType a1) throws Throwable;
private static native java.lang.Throwable __call1238600_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4c6364239ec399601d30(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zB a1) throws E;
private static final class __SourceHandler_4c6364239ec399601d30 {

public static void f1373(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.zB p0) throws Throwable {
    int forwardValue1373_54_0;
    int forwardValue1373_64_0;
    int forwardValue1373_76_0;
    int forwardValue1373_86_0;
    int forwardValue1373_98_0;
    int forwardValue1373_108_0;
    int forwardValue1373_120_0;
    int forwardValue1373_130_0;
    net.minecraft.client.network.NetHandlerPlayClient forwardValue1373_224_0;
    boolean spill1373_0;
    boolean spill1373_1;
    net.minecraft.client.network.NetHandlerPlayClient spill1373_2;
    long life2_3;
    net.minecraft.client.entity.EntityPlayerSP life5_12;
    double life6_15;
    double life8_18;
    double life10_22;
    float life12_25;
    float life13_28;
    com.moon.eK life14_32;
    int life4_37;
    moom.y_ life15_195;
    moom.y_ life15_226;
    forward_join_227: {
    forward_join_224: {
    forward_join_191: {
    forward_join_162: {
    forward_join_130: {
    forward_join_128: {
    forward_join_120: {
    forward_join_116: {
    forward_join_108: {
    forward_join_104: {
    forward_join_98: {
    forward_join_96: {
    forward_join_86: {
    forward_join_82: {
    forward_join_76: {
    forward_join_74: {
    forward_join_64: {
    forward_join_60: {
    forward_join_54: {
    forward_join_52: {
    life2_3 = (__fieldRead1373_0() ^ 43233572742364L);
    __call1373_2(p0, receiver, __fieldRead1373_1(receiver));
    life5_12 = __fieldRead1373_4(__fieldRead1373_3(receiver));
    life6_15 = __call1373_5(p0);
    life8_18 = __call1373_6(p0);
    spill1373_0 = __call1373_7();
    life10_22 = __call1373_8(p0);
    life12_25 = __call1373_9(p0);
    life13_28 = __call1373_10(p0);
    life14_32 = new com.moon.eK();
    __call1373_13(__call1373_12(__call1373_11()), life14_32);
    life4_37 = __integerCategory1373_14(spill1373_0);
    spill1373_1 = __call1373_17(__call1373_15(p0), __fieldRead1373_16());
    if (!((life4_37 == 0))) {
        forwardValue1373_54_0 = __integerCategory1373_18(spill1373_1);
        break forward_join_54;
    }
    if (!(spill1373_1)) {
        break forward_join_52;
    }
    life6_15 = (life6_15 + __fieldRead1373_19(life5_12));
    if (!((life4_37 != 0))) {
        break forward_join_60;
    }
    }
    forwardValue1373_54_0 = __integerCategory1373_21(__call1373_20(life14_32));
    }
    if (!((life4_37 == 0))) {
        forwardValue1373_64_0 = forwardValue1373_54_0;
        break forward_join_64;
    }
    if (!((forwardValue1373_54_0 == 0))) {
        break forward_join_60;
    }
    __fieldWrite1373_22(life5_12, 0x0.0p0d);
    }
    forwardValue1373_64_0 = __integerCategory1373_26(__call1373_25(__call1373_23(p0), __fieldRead1373_24()));
    }
    if (!((life4_37 == 0))) {
        forwardValue1373_76_0 = forwardValue1373_64_0;
        break forward_join_76;
    }
    if (!((forwardValue1373_64_0 != 0))) {
        break forward_join_74;
    }
    life8_18 = (life8_18 + __fieldRead1373_27(life5_12));
    if (!((life4_37 != 0))) {
        break forward_join_82;
    }
    }
    forwardValue1373_76_0 = __integerCategory1373_29(__call1373_28(life14_32));
    }
    if (!((life4_37 == 0))) {
        forwardValue1373_86_0 = forwardValue1373_76_0;
        break forward_join_86;
    }
    if (!((forwardValue1373_76_0 == 0))) {
        break forward_join_82;
    }
    __fieldWrite1373_30(life5_12, 0x0.0p0d);
    }
    forwardValue1373_86_0 = __integerCategory1373_34(__call1373_33(__call1373_31(p0), __fieldRead1373_32()));
    }
    if (!((life4_37 == 0))) {
        forwardValue1373_98_0 = forwardValue1373_86_0;
        break forward_join_98;
    }
    if (!((forwardValue1373_86_0 != 0))) {
        break forward_join_96;
    }
    life10_22 = (life10_22 + __fieldRead1373_35(life5_12));
    if (!((life4_37 != 0))) {
        break forward_join_104;
    }
    }
    forwardValue1373_98_0 = __integerCategory1373_37(__call1373_36(life14_32));
    }
    if (!((life4_37 == 0))) {
        forwardValue1373_108_0 = forwardValue1373_98_0;
        break forward_join_108;
    }
    if (!((forwardValue1373_98_0 == 0))) {
        break forward_join_104;
    }
    __fieldWrite1373_38(life5_12, 0x0.0p0d);
    }
    forwardValue1373_108_0 = __integerCategory1373_42(__call1373_41(__call1373_39(p0), __fieldRead1373_40()));
    }
    if (!((life4_37 == 0))) {
        forwardValue1373_120_0 = forwardValue1373_108_0;
        break forward_join_120;
    }
    if (!((forwardValue1373_108_0 != 0))) {
        break forward_join_116;
    }
    life13_28 = (life13_28 + __fieldRead1373_43(life5_12));
    }
    forwardValue1373_120_0 = __integerCategory1373_47(__call1373_46(__call1373_44(p0), __fieldRead1373_45()));
    }
    if (!((life4_37 == 0))) {
        forwardValue1373_130_0 = forwardValue1373_120_0;
        break forward_join_130;
    }
    if (!((forwardValue1373_120_0 != 0))) {
        break forward_join_128;
    }
    life12_25 = (life12_25 + __fieldRead1373_48(life5_12));
    }
    forwardValue1373_130_0 = __integerCategory1373_50(__call1373_49(life14_32));
    }
    if (!((forwardValue1373_130_0 != 0))) {
        break forward_join_162;
    }
    __call1373_53(life5_12, life6_15, life8_18, life10_22, __fieldRead1373_51(life5_12), __fieldRead1373_52(life5_12));
    life15_195 = new moom.y_(__fieldRead1373_54(life5_12), __fieldRead1373_56(__call1373_55(life5_12)), __fieldRead1373_57(life5_12), life12_25, life13_28, false);
    __call1373_58(life15_195, 1);
    __call1373_59(receiver, life15_195);
    if (!((life4_37 != 0))) {
        break forward_join_191;
    }
    }
    __call1373_60(life5_12, life6_15, life8_18, life10_22, life12_25, life13_28);
    life15_226 = new moom.y_(__fieldRead1373_61(life5_12), __fieldRead1373_63(__call1373_62(life5_12)), __fieldRead1373_64(life5_12), __fieldRead1373_65(life5_12), __fieldRead1373_66(life5_12), false);
    __call1373_67(life15_226, 1);
    __call1373_68(receiver, life15_226);
    }
    spill1373_2 = receiver;
    if (!((life4_37 == 0))) {
        forwardValue1373_224_0 = spill1373_2;
        break forward_join_224;
    }
    if (!((!__fieldRead1373_69(spill1373_2)))) {
        break forward_join_227;
    }
    __fieldWrite1373_75(__fieldRead1373_71(__fieldRead1373_70(receiver)), __fieldRead1373_74(__fieldRead1373_73(__fieldRead1373_72(receiver))));
    __fieldWrite1373_81(__fieldRead1373_77(__fieldRead1373_76(receiver)), __fieldRead1373_80(__fieldRead1373_79(__fieldRead1373_78(receiver))));
    __fieldWrite1373_87(__fieldRead1373_83(__fieldRead1373_82(receiver)), __fieldRead1373_86(__fieldRead1373_85(__fieldRead1373_84(receiver))));
    __fieldWrite1373_88(receiver, 1);
    forwardValue1373_224_0 = receiver;
    }
    __call1373_90(__fieldRead1373_89(forwardValue1373_224_0), null);
    }
    return;
}
public static void h1373_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137300_0(p0);
}
public static void h1373_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137301_0(p0);
}
public static void h1373_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137302_0(p0);
}
public static void h1373_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137303_0(p0);
}
public static void h1373_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137304_0(p0);
}
public static void h1373_5(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137305_0(p0);
}
public static void h1373_6(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137306_0(p0);
}
public static void h1373_7(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137307_0(p0);
}
public static void h1373_8(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137308_0(p0);
}
public static void h1373_9(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137309_0(p0);
}
public static void h1373_10(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137310_0(p0);
}
public static void h1373_11(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137311_0(p0);
}
public static void h1373_12(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137312_0(p0);
}
public static void h1373_13(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137313_0(p0);
}
public static void h1373_14(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137314_0(p0);
}
public static void h1373_15(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137315_0(p0);
}
private static native long __fieldRead1373_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1373_1(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1373_2(moom.zB a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1373_3(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1373_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __call1373_5(moom.zB a0) throws Throwable;
private static native double __call1373_6(moom.zB a0) throws Throwable;
private static native boolean __call1373_7() throws Throwable;
private static native double __call1373_8(moom.zB a0) throws Throwable;
private static native float __call1373_9(moom.zB a0) throws Throwable;
private static native float __call1373_10(moom.zB a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call1373_11() throws Throwable;
private static native com.moon.events.EventBus __call1373_12(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call1373_13(com.moon.events.EventBus a0, com.moon.eK a1) throws Throwable;
private static native int __integerCategory1373_14(boolean value) throws Throwable;
private static native java.util.Set __call1373_15(moom.zB a0) throws Throwable;
private static native net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags __fieldRead1373_16() throws Throwable;
private static native boolean __call1373_17(java.util.Set a0, net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags a1) throws Throwable;
private static native int __integerCategory1373_18(boolean value) throws Throwable;
private static native double __fieldRead1373_19(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native boolean __call1373_20(com.moon.eK a0) throws Throwable;
private static native int __integerCategory1373_21(boolean value) throws Throwable;
private static native void __fieldWrite1373_22(net.minecraft.client.entity.EntityPlayerSP a0, double a1) throws Throwable;
private static native java.util.Set __call1373_23(moom.zB a0) throws Throwable;
private static native net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags __fieldRead1373_24() throws Throwable;
private static native boolean __call1373_25(java.util.Set a0, net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags a1) throws Throwable;
private static native int __integerCategory1373_26(boolean value) throws Throwable;
private static native double __fieldRead1373_27(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native boolean __call1373_28(com.moon.eK a0) throws Throwable;
private static native int __integerCategory1373_29(boolean value) throws Throwable;
private static native void __fieldWrite1373_30(net.minecraft.client.entity.EntityPlayerSP a0, double a1) throws Throwable;
private static native java.util.Set __call1373_31(moom.zB a0) throws Throwable;
private static native net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags __fieldRead1373_32() throws Throwable;
private static native boolean __call1373_33(java.util.Set a0, net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags a1) throws Throwable;
private static native int __integerCategory1373_34(boolean value) throws Throwable;
private static native double __fieldRead1373_35(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native boolean __call1373_36(com.moon.eK a0) throws Throwable;
private static native int __integerCategory1373_37(boolean value) throws Throwable;
private static native void __fieldWrite1373_38(net.minecraft.client.entity.EntityPlayerSP a0, double a1) throws Throwable;
private static native java.util.Set __call1373_39(moom.zB a0) throws Throwable;
private static native net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags __fieldRead1373_40() throws Throwable;
private static native boolean __call1373_41(java.util.Set a0, net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags a1) throws Throwable;
private static native int __integerCategory1373_42(boolean value) throws Throwable;
private static native float __fieldRead1373_43(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native java.util.Set __call1373_44(moom.zB a0) throws Throwable;
private static native net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags __fieldRead1373_45() throws Throwable;
private static native boolean __call1373_46(java.util.Set a0, net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags a1) throws Throwable;
private static native int __integerCategory1373_47(boolean value) throws Throwable;
private static native float __fieldRead1373_48(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native boolean __call1373_49(com.moon.eK a0) throws Throwable;
private static native int __integerCategory1373_50(boolean value) throws Throwable;
private static native float __fieldRead1373_51(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native float __fieldRead1373_52(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native void __call1373_53(net.minecraft.client.entity.EntityPlayerSP a0, double a1, double a2, double a3, float a4, float a5) throws Throwable;
private static native double __fieldRead1373_54(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.CA __call1373_55(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native double __fieldRead1373_56(moom.CA a0) throws Throwable;
private static native double __fieldRead1373_57(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native void __call1373_58(moom.y_ a0, int a1) throws Throwable;
private static native void __call1373_59(net.minecraft.client.network.NetHandlerPlayClient a0, moom.y_ a1) throws Throwable;
private static native void __call1373_60(net.minecraft.client.entity.EntityPlayerSP a0, double a1, double a2, double a3, float a4, float a5) throws Throwable;
private static native double __fieldRead1373_61(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.CA __call1373_62(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native double __fieldRead1373_63(moom.CA a0) throws Throwable;
private static native double __fieldRead1373_64(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native float __fieldRead1373_65(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native float __fieldRead1373_66(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native void __call1373_67(moom.y_ a0, int a1) throws Throwable;
private static native void __call1373_68(net.minecraft.client.network.NetHandlerPlayClient a0, moom.y_ a1) throws Throwable;
private static native boolean __fieldRead1373_69(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1373_70(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1373_71(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1373_72(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1373_73(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead1373_74(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native void __fieldWrite1373_75(net.minecraft.client.entity.EntityPlayerSP a0, double a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1373_76(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1373_77(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1373_78(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1373_79(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead1373_80(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native void __fieldWrite1373_81(net.minecraft.client.entity.EntityPlayerSP a0, double a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1373_82(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1373_83(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1373_84(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1373_85(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead1373_86(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native void __fieldWrite1373_87(net.minecraft.client.entity.EntityPlayerSP a0, double a1) throws Throwable;
private static native void __fieldWrite1373_88(net.minecraft.client.network.NetHandlerPlayClient a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1373_89(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1373_90(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Throwable __call1137300_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137301_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137302_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137303_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137304_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137305_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137306_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137307_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137308_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137309_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137310_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137311_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137312_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137313_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137314_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137315_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_21047e52fa940e58487f(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zC a1) throws E;
private static final class __SourceHandler_21047e52fa940e58487f {

public static void f1374(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.zC p0) throws Throwable {
    int forwardValue1374_18_0;
    boolean spill1374_0;
    int spill1374_1;
    long life2_3;
    int life4_10;
    forward_join_27: {
    forward_join_18: {
    life2_3 = (__fieldRead1374_0() ^ 15452433599684L);
    spill1374_0 = __call1374_1();
    __call1374_3(p0, receiver, __fieldRead1374_2(receiver));
    life4_10 = __integerCategory1374_4(spill1374_0);
    spill1374_1 = __call1374_5(p0);
    if (!((life4_10 == 0))) {
        forwardValue1374_18_0 = spill1374_1;
        break forward_join_18;
    }
    if (!((spill1374_1 >= 0))) {
        break forward_join_27;
    }
    forwardValue1374_18_0 = __call1374_6(p0);
    }
    if (!((forwardValue1374_18_0 < __call1374_7()))) {
        break forward_join_27;
    }
    __fieldWrite1374_12(__fieldRead1374_10(__fieldRead1374_9(__fieldRead1374_8(receiver))), __call1374_11(p0));
    }
    return;
}
public static void h1374_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137400_0(p0);
}
public static void h1374_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137401_0(p0);
}
public static void h1374_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137402_0(p0);
}
private static native long __fieldRead1374_0() throws Throwable;
private static native boolean __call1374_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1374_2(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1374_3(moom.zC a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native int __integerCategory1374_4(boolean value) throws Throwable;
private static native int __call1374_5(moom.zC a0) throws Throwable;
private static native int __call1374_6(moom.zC a0) throws Throwable;
private static native int __call1374_7() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1374_8(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1374_9(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead1374_10(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __call1374_11(moom.zC a0) throws Throwable;
private static native void __fieldWrite1374_12(net.minecraft.entity.player.InventoryPlayer a0, int a1) throws Throwable;
private static native java.lang.Throwable __call1137400_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137401_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137402_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_7e7d82e490b6adcbf710(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zE a1) throws E;
private static final class __SourceHandler_7e7d82e490b6adcbf710 {

public static void f1375(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.zE p0) throws Throwable {
    int forwardValue1375_33_0;
    int forwardValue1375_44_0;
    int forwardValue1375_44_1;
    int forwardValue1375_60_0;
    int forwardValue1375_60_1;
    int forwardValue1375_74_0;
    int forwardValue1375_74_1;
    boolean spill1375_0;
    int spill1375_1;
    int spill1375_2;
    long life2_3;
    net.minecraft.entity.Entity life5_15;
    int life4_16;
    net.minecraft.entity.EntityLivingBase life6_32;
    net.minecraft.entity.player.EntityPlayer life6_70;
    forward_join_81: {
    forward_join_74: {
    forward_join_71: {
    forward_join_60: {
    forward_join_57: {
    forward_join_44: {
    forward_join_41: {
    forward_join_33: {
    forward_join_31: {
    life2_3 = (__fieldRead1375_0() ^ 29030038526892L);
    __call1375_2(p0, receiver, __fieldRead1375_1(receiver));
    spill1375_0 = __call1375_3();
    life5_15 = __call1375_6(__fieldRead1375_4(receiver), __call1375_5(p0));
    life4_16 = __integerCategory1375_7(spill1375_0);
    if (!((life5_15 != null))) {
        break forward_join_81;
    }
    spill1375_1 = __call1375_8(p0);
    if (!((life4_16 != 0))) {
        forwardValue1375_33_0 = spill1375_1;
        break forward_join_33;
    }
    if (!((spill1375_1 == 0))) {
        break forward_join_31;
    }
    life6_32 = __cast1375_9(life5_15);
    __call1375_10(life6_32);
    if (!((life4_16 == 0))) {
        break forward_join_81;
    }
    }
    forwardValue1375_33_0 = __call1375_11(p0);
    }
    spill1375_2 = 1;
    if (!((life4_16 != 0))) {
        forwardValue1375_44_0 = forwardValue1375_33_0;
        forwardValue1375_44_1 = spill1375_2;
        break forward_join_44;
    }
    if (!((forwardValue1375_33_0 == spill1375_2))) {
        break forward_join_41;
    }
    __call1375_12(life5_15);
    if (!((life4_16 == 0))) {
        break forward_join_81;
    }
    }
    forwardValue1375_44_0 = __call1375_13(p0);
    forwardValue1375_44_1 = 2;
    }
    if (!((life4_16 != 0))) {
        forwardValue1375_60_0 = forwardValue1375_44_0;
        forwardValue1375_60_1 = forwardValue1375_44_1;
        break forward_join_60;
    }
    if (!((forwardValue1375_44_0 == forwardValue1375_44_1))) {
        break forward_join_57;
    }
    life6_70 = __cast1375_14(life5_15);
    __call1375_15(life6_70, 0, 0, 0);
    if (!((life4_16 == 0))) {
        break forward_join_81;
    }
    }
    forwardValue1375_60_0 = __call1375_16(p0);
    forwardValue1375_60_1 = 4;
    }
    if (!((life4_16 != 0))) {
        forwardValue1375_74_0 = forwardValue1375_60_0;
        forwardValue1375_74_1 = forwardValue1375_60_1;
        break forward_join_74;
    }
    if (!((forwardValue1375_60_0 == forwardValue1375_60_1))) {
        break forward_join_71;
    }
    __call1375_20(__fieldRead1375_18(__fieldRead1375_17(receiver)), life5_15, __fieldRead1375_19());
    if (!((life4_16 == 0))) {
        break forward_join_81;
    }
    }
    forwardValue1375_74_0 = __call1375_21(p0);
    forwardValue1375_74_1 = 5;
    }
    if (!((forwardValue1375_74_0 == forwardValue1375_74_1))) {
        break forward_join_81;
    }
    __call1375_25(__fieldRead1375_23(__fieldRead1375_22(receiver)), life5_15, __fieldRead1375_24());
    }
    return;
}
public static void h1375_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137500_0(p0);
}
public static void h1375_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137501_0(p0);
}
public static void h1375_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137502_0(p0);
}
public static void h1375_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137503_0(p0);
}
public static void h1375_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137504_0(p0);
}
public static void h1375_5(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137505_0(p0);
}
public static void h1375_6(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137506_0(p0);
}
public static void h1375_7(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137507_0(p0);
}
public static void h1375_8(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137508_0(p0);
}
public static void h1375_9(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137509_0(p0);
}
public static void h1375_10(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137510_0(p0);
}
public static void h1375_11(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137511_0(p0);
}
private static native long __fieldRead1375_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1375_1(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1375_2(moom.zE a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native boolean __call1375_3() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1375_4(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call1375_5(moom.zE a0) throws Throwable;
private static native net.minecraft.entity.Entity __call1375_6(net.minecraft.client.multiplayer.WorldClient a0, int a1) throws Throwable;
private static native int __integerCategory1375_7(boolean value) throws Throwable;
private static native int __call1375_8(moom.zE a0) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __cast1375_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call1375_10(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native int __call1375_11(moom.zE a0) throws Throwable;
private static native void __call1375_12(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call1375_13(moom.zE a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast1375_14(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call1375_15(net.minecraft.entity.player.EntityPlayer a0, int a1, int a2, int a3) throws Throwable;
private static native int __call1375_16(moom.zE a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1375_17(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.particle.EffectRenderer __fieldRead1375_18(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead1375_19() throws Throwable;
private static native void __call1375_20(net.minecraft.client.particle.EffectRenderer a0, net.minecraft.entity.Entity a1, net.minecraft.util.EnumParticleTypes a2) throws Throwable;
private static native int __call1375_21(moom.zE a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1375_22(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.particle.EffectRenderer __fieldRead1375_23(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead1375_24() throws Throwable;
private static native void __call1375_25(net.minecraft.client.particle.EffectRenderer a0, net.minecraft.entity.Entity a1, net.minecraft.util.EnumParticleTypes a2) throws Throwable;
private static native java.lang.Throwable __call1137500_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137501_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137502_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137503_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137504_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137505_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137506_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137507_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137508_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137509_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137510_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137511_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_af556cb4549617cf41a8(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zF a1) throws E;
private static final class __SourceHandler_af556cb4549617cf41a8 {

public static void f574(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.zF p0) throws Throwable {
    boolean spill574_0;
    moom.tp spill574_1;
    moom.tp spill574_2;
    int spill574_3;
    double spill574_4;
    moom.tp spill574_5;
    moom.tp spill574_6;
    int spill574_7;
    double spill574_8;
    moom.tp spill574_9;
    moom.tp spill574_10;
    int spill574_11;
    double spill574_12;
    long life2_3;
    double life5_15;
    double life7_21;
    double life9_27;
    float life11_39;
    float life12_51;
    moom.jX life13_56;
    int life4_57;
    com.mojang.authlib.GameProfile life14_63;
    moom.tp life15_74;
    int life16_110;
    java.util.List life17_160;
    forest_join_164: {
    forest_join_142: {
    forest_join_128: {
    forest_join_123: {
    life2_3 = (__fieldRead574_0() ^ 6782435677797L);
    __call574_2(p0, receiver, __fieldRead574_1(receiver));
    spill574_0 = __call574_3();
    life5_15 = (((double) __call574_4(p0)) / 0x1.0p5d);
    life7_21 = (((double) __call574_5(p0)) / 0x1.0p5d);
    life9_27 = (((double) __call574_6(p0)) / 0x1.0p5d);
    life11_39 = (((float) (__call574_7(p0) * __invokedynamic574_8(3600, (6084321889935956972L ^ life2_3)))) / 0x1.0p8f);
    life12_51 = (((float) (__call574_9(p0) * __invokedynamic574_10(3600, (6084321889935956972L ^ life2_3)))) / 0x1.0p8f);
    life13_56 = __call574_12(receiver, __call574_11(p0));
    life4_57 = __integerCategory574_13(spill574_0);
    __call574_14(life13_56);
    life14_63 = __call574_15(life13_56);
    __call574_16(life14_63);
    life15_74 = new moom.tp(__fieldRead574_18(__fieldRead574_17(receiver)), life14_63);
    spill574_1 = life15_74;
    spill574_2 = life15_74;
    moom.tp __stackOp574_20_0 = life15_74;
    int __stackOp574_20_1 = __call574_19(p0);
    spill574_3 = __stackOp574_20_1;
    __fieldWrite574_21(__stackOp574_20_0, __stackOp574_20_1);
    moom.tp __stackOp574_22_0 = spill574_2;
    double __stackOp574_22_1 = ((double) spill574_3);
    spill574_4 = __stackOp574_22_1;
    __fieldWrite574_23(__stackOp574_22_0, __stackOp574_22_1);
    __fieldWrite574_24(spill574_1, spill574_4);
    spill574_5 = life15_74;
    spill574_6 = life15_74;
    moom.tp __stackOp574_26_0 = life15_74;
    int __stackOp574_26_1 = __call574_25(p0);
    spill574_7 = __stackOp574_26_1;
    __fieldWrite574_27(__stackOp574_26_0, __stackOp574_26_1);
    moom.tp __stackOp574_28_0 = spill574_6;
    double __stackOp574_28_1 = ((double) spill574_7);
    spill574_8 = __stackOp574_28_1;
    __fieldWrite574_29(__stackOp574_28_0, __stackOp574_28_1);
    __fieldWrite574_30(spill574_5, spill574_8);
    spill574_9 = life15_74;
    spill574_10 = life15_74;
    moom.tp __stackOp574_32_0 = life15_74;
    int __stackOp574_32_1 = __call574_31(p0);
    spill574_11 = __stackOp574_32_1;
    __fieldWrite574_33(__stackOp574_32_0, __stackOp574_32_1);
    moom.tp __stackOp574_34_0 = spill574_10;
    double __stackOp574_34_1 = ((double) spill574_11);
    spill574_12 = __stackOp574_34_1;
    __fieldWrite574_35(__stackOp574_34_0, __stackOp574_34_1);
    __fieldWrite574_36(spill574_9, spill574_12);
    life16_110 = __call574_37(p0);
    if (!((life4_57 != 0))) {
        break forest_join_123;
    }
    if (!((life16_110 == 0))) {
        break forest_join_128;
    }
    (__fieldRead574_39(__fieldRead574_38(life15_74)))[__fieldRead574_41(__fieldRead574_40(life15_74))] = null;
    }
    if (!((life4_57 == 0))) {
        break forest_join_142;
    }
    __call574_42(new java.lang.String[3]);
    }
    (__fieldRead574_44(__fieldRead574_43(life15_74)))[__fieldRead574_46(__fieldRead574_45(life15_74))] = new net.minecraft.item.ItemStack(__call574_47(life16_110), 1, 0);
    }
    __call574_48(life15_74, life5_15, life7_21, life9_27, life11_39, life12_51);
    __call574_51(__fieldRead574_49(receiver), __call574_50(p0), life15_74);
    life17_160 = __call574_52(p0);
    if (!((life17_160 != null))) {
        break forest_join_164;
    }
    __call574_54(__call574_53(life15_74), life17_160);
    }
    return;
}
public static void h574_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3057400_0(p0);
}
public static void h574_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3057401_0(p0);
}
public static void h574_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3057402_0(p0);
}
public static void h574_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3057403_0(p0);
}
private static native long __fieldRead574_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead574_1(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call574_2(moom.zF a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native boolean __call574_3() throws Throwable;
private static native int __call574_4(moom.zF a0) throws Throwable;
private static native int __call574_5(moom.zF a0) throws Throwable;
private static native int __call574_6(moom.zF a0) throws Throwable;
private static native byte __call574_7(moom.zF a0) throws Throwable;
private static native int __invokedynamic574_8(int a0, long a1) throws Throwable;
private static native byte __call574_9(moom.zF a0) throws Throwable;
private static native int __invokedynamic574_10(int a0, long a1) throws Throwable;
private static native java.util.UUID __call574_11(moom.zF a0) throws Throwable;
private static native moom.jX __call574_12(net.minecraft.client.network.NetHandlerPlayClient a0, java.util.UUID a1) throws Throwable;
private static native int __integerCategory574_13(boolean value) throws Throwable;
private static native java.lang.Object __call574_14(moom.jX a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call574_15(moom.jX a0) throws Throwable;
private static native java.lang.Object __call574_16(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead574_17(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead574_18(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __call574_19(moom.zF a0) throws Throwable;
private static native void __fieldWrite574_21(moom.tp a0, int a1) throws Throwable;
private static native void __fieldWrite574_23(moom.tp a0, double a1) throws Throwable;
private static native void __fieldWrite574_24(moom.tp a0, double a1) throws Throwable;
private static native int __call574_25(moom.zF a0) throws Throwable;
private static native void __fieldWrite574_27(moom.tp a0, int a1) throws Throwable;
private static native void __fieldWrite574_29(moom.tp a0, double a1) throws Throwable;
private static native void __fieldWrite574_30(moom.tp a0, double a1) throws Throwable;
private static native int __call574_31(moom.zF a0) throws Throwable;
private static native void __fieldWrite574_33(moom.tp a0, int a1) throws Throwable;
private static native void __fieldWrite574_35(moom.tp a0, double a1) throws Throwable;
private static native void __fieldWrite574_36(moom.tp a0, double a1) throws Throwable;
private static native int __call574_37(moom.zF a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead574_38(moom.tp a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead574_39(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead574_40(moom.tp a0) throws Throwable;
private static native int __fieldRead574_41(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native void __call574_42(java.lang.String[] a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead574_43(moom.tp a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead574_44(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead574_45(moom.tp a0) throws Throwable;
private static native int __fieldRead574_46(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.Item __call574_47(int a0) throws Throwable;
private static native void __call574_48(moom.tp a0, double a1, double a2, double a3, float a4, float a5) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead574_49(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call574_50(moom.zF a0) throws Throwable;
private static native void __call574_51(net.minecraft.client.multiplayer.WorldClient a0, int a1, moom.tp a2) throws Throwable;
private static native java.util.List __call574_52(moom.zF a0) throws Throwable;
private static native net.minecraft.entity.DataWatcher __call574_53(moom.tp a0) throws Throwable;
private static native void __call574_54(net.minecraft.entity.DataWatcher a0, java.util.List a1) throws Throwable;
private static native java.lang.Throwable __call3057400_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3057401_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3057402_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3057403_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_9e357a601cce4e36ac0e(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zG a1) throws E;
private static final class __SourceHandler_9e357a601cce4e36ac0e {

public static void f21(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.zG p0) throws Throwable {
    net.minecraft.entity.Entity forestValue21_33_0;
    net.minecraft.entity.Entity forestValue21_37_0;
    boolean spill21_0;
    net.minecraft.entity.EntityLivingBase spill21_1;
    long life2_3;
    int life4_10;
    net.minecraft.entity.Entity life5_16;
    net.minecraft.entity.EntityLivingBase life6_23;
    forest_join_97: {
    forest_join_79: {
    forest_join_60: {
    forest_join_37: {
    forest_join_33: {
    forest_join_32: {
    life2_3 = (__fieldRead21_0() ^ 87507848825202L);
    spill21_0 = __call21_1();
    __call21_3(p0, receiver, __fieldRead21_2(receiver));
    life4_10 = __integerCategory21_4(spill21_0);
    life5_16 = __call21_7(__fieldRead21_5(receiver), __call21_6(p0));
    life6_23 = __cast21_11(__call21_10(__fieldRead21_8(receiver), __call21_9(p0)));
    spill21_1 = life6_23;
    if (!((life4_10 != 0))) {
        forestValue21_33_0 = spill21_1;
        break forest_join_33;
    }
    if (!((spill21_1 == null))) {
        break forest_join_32;
    }
    life6_23 = __fieldRead21_13(__fieldRead21_12(receiver));
    }
    forestValue21_33_0 = life5_16;
    }
    if (!((life4_10 != 0))) {
        forestValue21_37_0 = forestValue21_33_0;
        break forest_join_37;
    }
    if (!((forestValue21_33_0 != null))) {
        break forest_join_97;
    }
    forestValue21_37_0 = life5_16;
    }
    if (!((__instanceOf21_14(forestValue21_37_0) != 0))) {
        break forest_join_60;
    }
    __call21_20(__fieldRead21_15(receiver), life5_16, "random.orb", 0x1.99999ap-3f, ((((__call21_17(__fieldRead21_16(receiver)) - __call21_19(__fieldRead21_18(receiver))) * 0x1.666666p-1f) + 0x1.0p0f) * 0x1.0p1f));
    if (!((life4_10 == 0))) {
        break forest_join_79;
    }
    }
    __call21_26(__fieldRead21_21(receiver), life5_16, "random.pop", 0x1.99999ap-3f, ((((__call21_23(__fieldRead21_22(receiver)) - __call21_25(__fieldRead21_24(receiver))) * 0x1.666666p-1f) + 0x1.0p0f) * 0x1.0p1f));
    }
    __call21_30(__fieldRead21_28(__fieldRead21_27(receiver)), new moom.sr(__fieldRead21_29(receiver), life5_16, life6_23, 0x1.0p-1f));
    __call21_33(__fieldRead21_31(receiver), __call21_32(p0));
    }
    return;
}
public static void h21_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002100_0(p0);
}
public static void h21_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002101_0(p0);
}
public static void h21_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002102_0(p0);
}
public static void h21_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002103_0(p0);
}
private static native long __fieldRead21_0() throws Throwable;
private static native boolean __call21_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead21_2(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call21_3(moom.zG a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native int __integerCategory21_4(boolean value) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead21_5(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call21_6(moom.zG a0) throws Throwable;
private static native net.minecraft.entity.Entity __call21_7(net.minecraft.client.multiplayer.WorldClient a0, int a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead21_8(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call21_9(moom.zG a0) throws Throwable;
private static native net.minecraft.entity.Entity __call21_10(net.minecraft.client.multiplayer.WorldClient a0, int a1) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __cast21_11(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead21_12(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead21_13(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __instanceOf21_14(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead21_15(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native java.util.Random __fieldRead21_16(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native float __call21_17(java.util.Random a0) throws Throwable;
private static native java.util.Random __fieldRead21_18(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native float __call21_19(java.util.Random a0) throws Throwable;
private static native void __call21_20(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.entity.Entity a1, java.lang.String a2, float a3, float a4) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead21_21(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native java.util.Random __fieldRead21_22(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native float __call21_23(java.util.Random a0) throws Throwable;
private static native java.util.Random __fieldRead21_24(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native float __call21_25(java.util.Random a0) throws Throwable;
private static native void __call21_26(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.entity.Entity a1, java.lang.String a2, float a3, float a4) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead21_27(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.particle.EffectRenderer __fieldRead21_28(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead21_29(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call21_30(net.minecraft.client.particle.EffectRenderer a0, moom.sr a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead21_31(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call21_32(moom.zG a0) throws Throwable;
private static native net.minecraft.entity.Entity __call21_33(net.minecraft.client.multiplayer.WorldClient a0, int a1) throws Throwable;
private static native java.lang.Throwable __call3002100_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002101_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002102_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002103_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_0c35ea78f0a5deeb4a69(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zH a1) throws E;
private static final class __SourceHandler_0c35ea78f0a5deeb4a69 {

public static void f22(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.zH p0) throws Throwable {
    int forestValue22_59_0;
    int forestValue22_59_1;
    int forestValue22_93_0;
    int forestValue22_93_1;
    int forestValue22_113_0;
    int forestValue22_113_1;
    int forestValue22_133_0;
    int forestValue22_133_1;
    int forestValue22_165_0;
    int forestValue22_165_1;
    int forestValue22_194_0;
    int forestValue22_194_1;
    int forestValue22_214_0;
    int forestValue22_214_1;
    int forestValue22_234_0;
    int forestValue22_234_1;
    int forestValue22_255_0;
    int forestValue22_255_1;
    int forestValue22_293_0;
    int forestValue22_293_1;
    int forestValue22_331_0;
    int forestValue22_331_1;
    int forestValue22_369_0;
    int forestValue22_369_1;
    int forestValue22_389_0;
    int forestValue22_389_1;
    int forestValue22_414_0;
    int forestValue22_414_1;
    int forestValue22_433_0;
    int forestValue22_433_1;
    int forestValue22_453_0;
    int forestValue22_453_1;
    int forestValue22_474_0;
    int forestValue22_474_1;
    int forestValue22_494_0;
    int forestValue22_494_1;
    int forestValue22_510_0;
    int forestValue22_510_1;
    int forestValue22_530_0;
    int forestValue22_530_1;
    net.minecraft.entity.Entity forestValue22_595_0;
    int forestValue22_649_0;
    net.minecraft.entity.Entity forestValue22_676_0;
    boolean spill22_0;
    int spill22_1;
    int spill22_2;
    net.minecraft.entity.Entity spill22_3;
    int spill22_4;
    net.minecraft.entity.Entity spill22_5;
    net.minecraft.entity.Entity spill22_6;
    long life2_3;
    double life5_15;
    int life4_16;
    double life7_22;
    double life9_28;
    net.minecraft.entity.Entity life11_30;
    net.minecraft.entity.Entity life12_74;
    net.minecraft.entity.Entity[] life12_684;
    int life13_697;
    net.minecraft.entity.Entity[] life14_699;
    int life15_702;
    int life16_704;
    net.minecraft.entity.Entity life17_713;
    net.minecraft.entity.Entity life13_762;
    forest_join_692: {
    forest_join_676: {
    forest_join_675: {
    forest_join_649: {
    forest_join_642: {
    forest_join_632: {
    forest_join_595: {
    forest_join_552: {
    forest_join_530: {
    forest_join_523: {
    forest_join_510: {
    forest_join_507: {
    forest_join_494: {
    forest_join_487: {
    forest_join_474: {
    forest_join_467: {
    forest_join_453: {
    forest_join_446: {
    forest_join_433: {
    forest_join_430: {
    forest_join_414: {
    forest_join_407: {
    forest_join_389: {
    forest_join_382: {
    forest_join_369: {
    forest_join_362: {
    forest_join_331: {
    forest_join_324: {
    forest_join_293: {
    forest_join_286: {
    forest_join_255: {
    forest_join_248: {
    forest_join_234: {
    forest_join_227: {
    forest_join_214: {
    forest_join_207: {
    forest_join_194: {
    forest_join_187: {
    forest_join_165: {
    forest_join_158: {
    forest_join_133: {
    forest_join_126: {
    forest_join_113: {
    forest_join_106: {
    forest_join_93: {
    forest_join_86: {
    forest_join_82: {
    forest_join_59: {
    forest_join_52: {
    life2_3 = (__fieldRead22_0() ^ 134932271752363L);
    __call22_2(p0, receiver, __fieldRead22_1(receiver));
    spill22_0 = __call22_3();
    life5_15 = (((double) __call22_4(p0)) / 0x1.0p5d);
    life4_16 = __integerCategory22_5(spill22_0);
    life7_22 = (((double) __call22_6(p0)) / 0x1.0p5d);
    life9_28 = (((double) __call22_7(p0)) / 0x1.0p5d);
    life11_30 = null;
    spill22_1 = __call22_8(p0);
    spill22_2 = __invokedynamic22_9(19910, (7182302094065068754L ^ life2_3));
    if (!((life4_16 != 0))) {
        forestValue22_59_0 = spill22_1;
        forestValue22_59_1 = spill22_2;
        break forest_join_59;
    }
    if (!((spill22_1 == spill22_2))) {
        break forest_join_52;
    }
    life11_30 = __call22_13(__fieldRead22_10(receiver), life5_15, life7_22, life9_28, __call22_12(__call22_11(p0)));
    break forest_join_552;
    }
    forestValue22_59_0 = __call22_14(p0);
    forestValue22_59_1 = __invokedynamic22_15(19820, (8240526203560880733L ^ life2_3));
    }
    if (!((life4_16 != 0))) {
        forestValue22_93_0 = forestValue22_59_0;
        forestValue22_93_1 = forestValue22_59_1;
        break forest_join_93;
    }
    if (!((forestValue22_59_0 == forestValue22_59_1))) {
        break forest_join_86;
    }
    life12_74 = __call22_18(__fieldRead22_16(receiver), __call22_17(p0));
    if (!((__instanceOf22_19(life12_74) != 0))) {
        break forest_join_82;
    }
    life11_30 = new net.minecraft.entity.projectile.EntityFishHook(__fieldRead22_20(receiver), life5_15, life7_22, life9_28, __cast22_21(life12_74));
    }
    __call22_22(p0, 0);
    break forest_join_552;
    }
    forestValue22_93_0 = __call22_23(p0);
    forestValue22_93_1 = __invokedynamic22_24(23056, (6795114576774298939L ^ life2_3));
    }
    if (!((life4_16 != 0))) {
        forestValue22_113_0 = forestValue22_93_0;
        forestValue22_113_1 = forestValue22_93_1;
        break forest_join_113;
    }
    if (!((forestValue22_93_0 == forestValue22_93_1))) {
        break forest_join_106;
    }
    life11_30 = new net.minecraft.entity.projectile.EntityArrow(__fieldRead22_25(receiver), life5_15, life7_22, life9_28);
    break forest_join_552;
    }
    forestValue22_113_0 = __call22_26(p0);
    forestValue22_113_1 = __invokedynamic22_27(9985, (6637066315910512657L ^ life2_3));
    }
    if (!((life4_16 != 0))) {
        forestValue22_133_0 = forestValue22_113_0;
        forestValue22_133_1 = forestValue22_113_1;
        break forest_join_133;
    }
    if (!((forestValue22_113_0 == forestValue22_113_1))) {
        break forest_join_126;
    }
    life11_30 = new moom.tX(__fieldRead22_28(receiver), life5_15, life7_22, life9_28);
    break forest_join_552;
    }
    forestValue22_133_0 = __call22_29(p0);
    forestValue22_133_1 = __invokedynamic22_30(5771, (3757856086231232958L ^ life2_3));
    }
    if (!((life4_16 != 0))) {
        forestValue22_165_0 = forestValue22_133_0;
        forestValue22_165_1 = forestValue22_133_1;
        break forest_join_165;
    }
    if (!((forestValue22_133_0 == forestValue22_133_1))) {
        break forest_join_158;
    }
    life11_30 = new net.minecraft.entity.item.EntityItemFrame(__fieldRead22_31(receiver), new moom.DT(__call22_32(life5_15), __call22_33(life7_22), __call22_34(life9_28)), __call22_36(__call22_35(p0)));
    __call22_37(p0, 0);
    break forest_join_552;
    }
    forestValue22_165_0 = __call22_38(p0);
    forestValue22_165_1 = __invokedynamic22_39(24004, (921205744853318355L ^ life2_3));
    }
    if (!((life4_16 != 0))) {
        forestValue22_194_0 = forestValue22_165_0;
        forestValue22_194_1 = forestValue22_165_1;
        break forest_join_194;
    }
    if (!((forestValue22_165_0 == forestValue22_165_1))) {
        break forest_join_187;
    }
    life11_30 = new moom.sD(__fieldRead22_40(receiver), new moom.DT(__call22_41(life5_15), __call22_42(life7_22), __call22_43(life9_28)));
    __call22_44(p0, 0);
    break forest_join_552;
    }
    forestValue22_194_0 = __call22_45(p0);
    forestValue22_194_1 = __invokedynamic22_46(28700, (4055537850374084412L ^ life2_3));
    }
    if (!((life4_16 != 0))) {
        forestValue22_214_0 = forestValue22_194_0;
        forestValue22_214_1 = forestValue22_194_1;
        break forest_join_214;
    }
    if (!((forestValue22_194_0 == forestValue22_194_1))) {
        break forest_join_207;
    }
    life11_30 = new moom.tT(__fieldRead22_47(receiver), life5_15, life7_22, life9_28);
    break forest_join_552;
    }
    forestValue22_214_0 = __call22_48(p0);
    forestValue22_214_1 = __invokedynamic22_49(13752, (6085976712194855574L ^ life2_3));
    }
    if (!((life4_16 != 0))) {
        forestValue22_234_0 = forestValue22_214_0;
        forestValue22_234_1 = forestValue22_214_1;
        break forest_join_234;
    }
    if (!((forestValue22_214_0 == forestValue22_214_1))) {
        break forest_join_227;
    }
    life11_30 = new moom.tx(__fieldRead22_50(receiver), life5_15, life7_22, life9_28);
    break forest_join_552;
    }
    forestValue22_234_0 = __call22_51(p0);
    forestValue22_234_1 = __invokedynamic22_52(26514, (7045325265925849277L ^ life2_3));
    }
    if (!((life4_16 != 0))) {
        forestValue22_255_0 = forestValue22_234_0;
        forestValue22_255_1 = forestValue22_234_1;
        break forest_join_255;
    }
    if (!((forestValue22_234_0 == forestValue22_234_1))) {
        break forest_join_248;
    }
    life11_30 = new net.minecraft.entity.item.EntityFireworkRocket(__fieldRead22_53(receiver), life5_15, life7_22, life9_28, null);
    break forest_join_552;
    }
    forestValue22_255_0 = __call22_54(p0);
    forestValue22_255_1 = __invokedynamic22_55(9555, (3614972256668320382L ^ life2_3));
    }
    if (!((life4_16 != 0))) {
        forestValue22_293_0 = forestValue22_255_0;
        forestValue22_293_1 = forestValue22_255_1;
        break forest_join_293;
    }
    if (!((forestValue22_255_0 == forestValue22_255_1))) {
        break forest_join_286;
    }
    life11_30 = new moom.tO(__fieldRead22_56(receiver), life5_15, life7_22, life9_28, (((double) __call22_57(p0)) / 0x1.f4p12d), (((double) __call22_58(p0)) / 0x1.f4p12d), (((double) __call22_59(p0)) / 0x1.f4p12d));
    __call22_60(p0, 0);
    break forest_join_552;
    }
    forestValue22_293_0 = __call22_61(p0);
    forestValue22_293_1 = __invokedynamic22_62(29796, (6715931889926132573L ^ life2_3));
    }
    if (!((life4_16 != 0))) {
        forestValue22_331_0 = forestValue22_293_0;
        forestValue22_331_1 = forestValue22_293_1;
        break forest_join_331;
    }
    if (!((forestValue22_293_0 == forestValue22_293_1))) {
        break forest_join_324;
    }
    life11_30 = new moom.tP(__fieldRead22_63(receiver), life5_15, life7_22, life9_28, (((double) __call22_64(p0)) / 0x1.f4p12d), (((double) __call22_65(p0)) / 0x1.f4p12d), (((double) __call22_66(p0)) / 0x1.f4p12d));
    __call22_67(p0, 0);
    break forest_join_552;
    }
    forestValue22_331_0 = __call22_68(p0);
    forestValue22_331_1 = __invokedynamic22_69(31118, (1474342431931031225L ^ life2_3));
    }
    if (!((life4_16 != 0))) {
        forestValue22_369_0 = forestValue22_331_0;
        forestValue22_369_1 = forestValue22_331_1;
        break forest_join_369;
    }
    if (!((forestValue22_331_0 == forestValue22_331_1))) {
        break forest_join_362;
    }
    life11_30 = new moom.tQ(__fieldRead22_70(receiver), life5_15, life7_22, life9_28, (((double) __call22_71(p0)) / 0x1.f4p12d), (((double) __call22_72(p0)) / 0x1.f4p12d), (((double) __call22_73(p0)) / 0x1.f4p12d));
    __call22_74(p0, 0);
    break forest_join_552;
    }
    forestValue22_369_0 = __call22_75(p0);
    forestValue22_369_1 = __invokedynamic22_76(8226, (4023586465483097887L ^ life2_3));
    }
    if (!((life4_16 != 0))) {
        forestValue22_389_0 = forestValue22_369_0;
        forestValue22_389_1 = forestValue22_369_1;
        break forest_join_389;
    }
    if (!((forestValue22_369_0 == forestValue22_369_1))) {
        break forest_join_382;
    }
    life11_30 = new moom.tV(__fieldRead22_77(receiver), life5_15, life7_22, life9_28);
    break forest_join_552;
    }
    forestValue22_389_0 = __call22_78(p0);
    forestValue22_389_1 = __invokedynamic22_79(13901, (944175279637270888L ^ life2_3));
    }
    if (!((life4_16 != 0))) {
        forestValue22_414_0 = forestValue22_389_0;
        forestValue22_414_1 = forestValue22_389_1;
        break forest_join_414;
    }
    if (!((forestValue22_389_0 == forestValue22_389_1))) {
        break forest_join_407;
    }
    life11_30 = new moom.tW(__fieldRead22_80(receiver), life5_15, life7_22, life9_28, __call22_81(p0));
    __call22_82(p0, 0);
    break forest_join_552;
    }
    forestValue22_414_0 = __call22_83(p0);
    forestValue22_414_1 = __invokedynamic22_84(18187, (6311208387462848557L ^ life2_3));
    }
    if (!((life4_16 != 0))) {
        forestValue22_433_0 = forestValue22_414_0;
        forestValue22_433_1 = forestValue22_414_1;
        break forest_join_433;
    }
    if (!((forestValue22_414_0 == forestValue22_414_1))) {
        break forest_join_430;
    }
    life11_30 = new moom.tU(__fieldRead22_85(receiver), life5_15, life7_22, life9_28);
    __call22_86(p0, 0);
    break forest_join_552;
    }
    forestValue22_433_0 = __call22_87(p0);
    forestValue22_433_1 = 1;
    }
    if (!((life4_16 != 0))) {
        forestValue22_453_0 = forestValue22_433_0;
        forestValue22_453_1 = forestValue22_433_1;
        break forest_join_453;
    }
    if (!((forestValue22_433_0 == forestValue22_433_1))) {
        break forest_join_446;
    }
    life11_30 = new moom.tv(__fieldRead22_88(receiver), life5_15, life7_22, life9_28);
    break forest_join_552;
    }
    forestValue22_453_0 = __call22_89(p0);
    forestValue22_453_1 = __invokedynamic22_90(26893, (7841368585880161842L ^ life2_3));
    }
    if (!((life4_16 != 0))) {
        forestValue22_474_0 = forestValue22_453_0;
        forestValue22_474_1 = forestValue22_453_1;
        break forest_join_474;
    }
    if (!((forestValue22_453_0 == forestValue22_453_1))) {
        break forest_join_467;
    }
    life11_30 = new moom.tK(__fieldRead22_91(receiver), life5_15, life7_22, life9_28, null);
    break forest_join_552;
    }
    forestValue22_474_0 = __call22_92(p0);
    forestValue22_474_1 = __invokedynamic22_93(26886, (7400560780514381362L ^ life2_3));
    }
    if (!((life4_16 != 0))) {
        forestValue22_494_0 = forestValue22_474_0;
        forestValue22_494_1 = forestValue22_474_1;
        break forest_join_494;
    }
    if (!((forestValue22_474_0 == forestValue22_474_1))) {
        break forest_join_487;
    }
    life11_30 = new net.minecraft.entity.item.EntityArmorStand(__fieldRead22_94(receiver), life5_15, life7_22, life9_28);
    break forest_join_552;
    }
    forestValue22_494_0 = __call22_95(p0);
    forestValue22_494_1 = __invokedynamic22_96(23865, (2433732800525171240L ^ life2_3));
    }
    if (!((life4_16 != 0))) {
        forestValue22_510_0 = forestValue22_494_0;
        forestValue22_510_1 = forestValue22_494_1;
        break forest_join_510;
    }
    if (!((forestValue22_494_0 == forestValue22_494_1))) {
        break forest_join_507;
    }
    life11_30 = new moom.tw(__fieldRead22_97(receiver), life5_15, life7_22, life9_28);
    break forest_join_552;
    }
    forestValue22_510_0 = __call22_98(p0);
    forestValue22_510_1 = 2;
    }
    if (!((life4_16 != 0))) {
        forestValue22_530_0 = forestValue22_510_0;
        forestValue22_530_1 = forestValue22_510_1;
        break forest_join_530;
    }
    if (!((forestValue22_510_0 == forestValue22_510_1))) {
        break forest_join_523;
    }
    life11_30 = new net.minecraft.entity.item.EntityItem(__fieldRead22_99(receiver), life5_15, life7_22, life9_28);
    break forest_join_552;
    }
    forestValue22_530_0 = __call22_100(p0);
    forestValue22_530_1 = __invokedynamic22_101(6241, (8656277173858090819L ^ life2_3));
    }
    if (!((forestValue22_530_0 == forestValue22_530_1))) {
        break forest_join_552;
    }
    life11_30 = new net.minecraft.entity.item.EntityFallingBlock(__fieldRead22_102(receiver), life5_15, life7_22, life9_28, __call22_105((__call22_103(p0) & __invokedynamic22_104(19694, (548363191179701193L ^ life2_3)))));
    __call22_106(p0, 0);
    }
    spill22_3 = life11_30;
    if (!((life4_16 != 0))) {
        forestValue22_595_0 = spill22_3;
        break forest_join_595;
    }
    if (!((spill22_3 != null))) {
        break forest_join_692;
    }
    __fieldWrite22_108(life11_30, __call22_107(p0));
    __fieldWrite22_110(life11_30, __call22_109(p0));
    __fieldWrite22_112(life11_30, __call22_111(p0));
    __fieldWrite22_115(life11_30, (((float) (__call22_113(p0) * __invokedynamic22_114(3600, (6084264237743417634L ^ life2_3)))) / 0x1.0p8f));
    __fieldWrite22_118(life11_30, (((float) (__call22_116(p0) * __invokedynamic22_117(3600, (6084264237743417634L ^ life2_3)))) / 0x1.0p8f));
    forestValue22_595_0 = life11_30;
    }
    life12_684 = __call22_119(forestValue22_595_0);
    if (!((life4_16 != 0))) {
        break forest_join_642;
    }
    if (!((life12_684 != null))) {
        break forest_join_632;
    }
    life13_697 = (__call22_120(p0) - __call22_121(life11_30));
    life14_699 = life12_684;
    life15_702 = (life14_699).length;
    life16_704 = 0;
    forest_cycle_614: while (true) {
    if (!((life16_704 < life15_702))) {
        break forest_join_632;
    }
    life17_713 = (life14_699)[life16_704];
    __call22_123(life17_713, (__call22_122(life17_713) + life13_697));
    life16_704 += 1;
    if (!((life4_16 != 0))) {
        break forest_join_642;
    }
    if (!((life4_16 == 0))) {
        continue forest_cycle_614;
    }
    break forest_cycle_614;
    }
    }
    __call22_125(life11_30, __call22_124(p0));
    __call22_128(__fieldRead22_126(receiver), __call22_127(p0), life11_30);
    }
    spill22_4 = __call22_129(p0);
    if (!((life4_16 != 0))) {
        forestValue22_649_0 = spill22_4;
        break forest_join_649;
    }
    if (!((spill22_4 > 0))) {
        break forest_join_692;
    }
    forestValue22_649_0 = __call22_130(p0);
    }
    if (!((forestValue22_649_0 == __invokedynamic22_131(30096, (7332854930400957112L ^ life2_3))))) {
        break forest_join_675;
    }
    life13_762 = __call22_134(__fieldRead22_132(receiver), __call22_133(p0));
    spill22_5 = life13_762;
    if (!((life4_16 != 0))) {
        forestValue22_676_0 = spill22_5;
        break forest_join_676;
    }
    if (!((__instanceOf22_135(spill22_5) != 0))) {
        break forest_join_675;
    }
    spill22_6 = life11_30;
    if (!((life4_16 != 0))) {
        forestValue22_676_0 = spill22_6;
        break forest_join_676;
    }
    if (!((__instanceOf22_136(spill22_6) != 0))) {
        break forest_join_675;
    }
    __fieldWrite22_138(__cast22_137(life11_30), life13_762);
    }
    forestValue22_676_0 = life11_30;
    }
    __call22_142(forestValue22_676_0, (((double) __call22_139(p0)) / 0x1.f4p12d), (((double) __call22_140(p0)) / 0x1.f4p12d), (((double) __call22_141(p0)) / 0x1.f4p12d));
    }
    return;
}
public static void h22_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002200_0(p0);
}
public static void h22_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002201_0(p0);
}
public static void h22_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002202_0(p0);
}
public static void h22_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002203_0(p0);
}
public static void h22_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002204_0(p0);
}
public static void h22_5(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002205_0(p0);
}
public static void h22_6(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002206_0(p0);
}
public static void h22_7(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002207_0(p0);
}
public static void h22_8(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002208_0(p0);
}
public static void h22_9(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002209_0(p0);
}
public static void h22_10(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002210_0(p0);
}
public static void h22_11(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002211_0(p0);
}
public static void h22_12(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002212_0(p0);
}
public static void h22_13(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002213_0(p0);
}
public static void h22_14(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002214_0(p0);
}
public static void h22_15(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002215_0(p0);
}
public static void h22_16(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002216_0(p0);
}
public static void h22_17(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002217_0(p0);
}
public static void h22_18(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002218_0(p0);
}
public static void h22_19(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002219_0(p0);
}
public static void h22_20(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002220_0(p0);
}
public static void h22_21(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002221_0(p0);
}
public static void h22_22(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002222_0(p0);
}
public static void h22_23(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002223_0(p0);
}
public static void h22_24(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002224_0(p0);
}
public static void h22_25(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002225_0(p0);
}
public static void h22_26(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002226_0(p0);
}
public static void h22_27(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002227_0(p0);
}
public static void h22_28(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002228_0(p0);
}
public static void h22_29(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002229_0(p0);
}
private static native long __fieldRead22_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead22_1(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call22_2(moom.zH a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native boolean __call22_3() throws Throwable;
private static native int __call22_4(moom.zH a0) throws Throwable;
private static native int __integerCategory22_5(boolean value) throws Throwable;
private static native int __call22_6(moom.zH a0) throws Throwable;
private static native int __call22_7(moom.zH a0) throws Throwable;
private static native int __call22_8(moom.zH a0) throws Throwable;
private static native int __invokedynamic22_9(int a0, long a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead22_10(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call22_11(moom.zH a0) throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __call22_12(int a0) throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart __call22_13(net.minecraft.client.multiplayer.WorldClient a0, double a1, double a2, double a3, net.minecraft.entity.item.EntityMinecart$EnumMinecartType a4) throws Throwable;
private static native int __call22_14(moom.zH a0) throws Throwable;
private static native int __invokedynamic22_15(int a0, long a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead22_16(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call22_17(moom.zH a0) throws Throwable;
private static native net.minecraft.entity.Entity __call22_18(net.minecraft.client.multiplayer.WorldClient a0, int a1) throws Throwable;
private static native int __instanceOf22_19(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead22_20(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast22_21(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call22_22(moom.zH a0, int a1) throws Throwable;
private static native int __call22_23(moom.zH a0) throws Throwable;
private static native int __invokedynamic22_24(int a0, long a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead22_25(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call22_26(moom.zH a0) throws Throwable;
private static native int __invokedynamic22_27(int a0, long a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead22_28(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call22_29(moom.zH a0) throws Throwable;
private static native int __invokedynamic22_30(int a0, long a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead22_31(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call22_32(double a0) throws Throwable;
private static native int __call22_33(double a0) throws Throwable;
private static native int __call22_34(double a0) throws Throwable;
private static native int __call22_35(moom.zH a0) throws Throwable;
private static native moom.bs __call22_36(int a0) throws Throwable;
private static native void __call22_37(moom.zH a0, int a1) throws Throwable;
private static native int __call22_38(moom.zH a0) throws Throwable;
private static native int __invokedynamic22_39(int a0, long a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead22_40(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call22_41(double a0) throws Throwable;
private static native int __call22_42(double a0) throws Throwable;
private static native int __call22_43(double a0) throws Throwable;
private static native void __call22_44(moom.zH a0, int a1) throws Throwable;
private static native int __call22_45(moom.zH a0) throws Throwable;
private static native int __invokedynamic22_46(int a0, long a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead22_47(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call22_48(moom.zH a0) throws Throwable;
private static native int __invokedynamic22_49(int a0, long a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead22_50(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call22_51(moom.zH a0) throws Throwable;
private static native int __invokedynamic22_52(int a0, long a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead22_53(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call22_54(moom.zH a0) throws Throwable;
private static native int __invokedynamic22_55(int a0, long a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead22_56(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call22_57(moom.zH a0) throws Throwable;
private static native int __call22_58(moom.zH a0) throws Throwable;
private static native int __call22_59(moom.zH a0) throws Throwable;
private static native void __call22_60(moom.zH a0, int a1) throws Throwable;
private static native int __call22_61(moom.zH a0) throws Throwable;
private static native int __invokedynamic22_62(int a0, long a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead22_63(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call22_64(moom.zH a0) throws Throwable;
private static native int __call22_65(moom.zH a0) throws Throwable;
private static native int __call22_66(moom.zH a0) throws Throwable;
private static native void __call22_67(moom.zH a0, int a1) throws Throwable;
private static native int __call22_68(moom.zH a0) throws Throwable;
private static native int __invokedynamic22_69(int a0, long a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead22_70(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call22_71(moom.zH a0) throws Throwable;
private static native int __call22_72(moom.zH a0) throws Throwable;
private static native int __call22_73(moom.zH a0) throws Throwable;
private static native void __call22_74(moom.zH a0, int a1) throws Throwable;
private static native int __call22_75(moom.zH a0) throws Throwable;
private static native int __invokedynamic22_76(int a0, long a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead22_77(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call22_78(moom.zH a0) throws Throwable;
private static native int __invokedynamic22_79(int a0, long a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead22_80(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call22_81(moom.zH a0) throws Throwable;
private static native void __call22_82(moom.zH a0, int a1) throws Throwable;
private static native int __call22_83(moom.zH a0) throws Throwable;
private static native int __invokedynamic22_84(int a0, long a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead22_85(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call22_86(moom.zH a0, int a1) throws Throwable;
private static native int __call22_87(moom.zH a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead22_88(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call22_89(moom.zH a0) throws Throwable;
private static native int __invokedynamic22_90(int a0, long a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead22_91(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call22_92(moom.zH a0) throws Throwable;
private static native int __invokedynamic22_93(int a0, long a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead22_94(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call22_95(moom.zH a0) throws Throwable;
private static native int __invokedynamic22_96(int a0, long a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead22_97(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call22_98(moom.zH a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead22_99(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call22_100(moom.zH a0) throws Throwable;
private static native int __invokedynamic22_101(int a0, long a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead22_102(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call22_103(moom.zH a0) throws Throwable;
private static native int __invokedynamic22_104(int a0, long a1) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call22_105(int a0) throws Throwable;
private static native void __call22_106(moom.zH a0, int a1) throws Throwable;
private static native int __call22_107(moom.zH a0) throws Throwable;
private static native void __fieldWrite22_108(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native int __call22_109(moom.zH a0) throws Throwable;
private static native void __fieldWrite22_110(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native int __call22_111(moom.zH a0) throws Throwable;
private static native void __fieldWrite22_112(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native int __call22_113(moom.zH a0) throws Throwable;
private static native int __invokedynamic22_114(int a0, long a1) throws Throwable;
private static native void __fieldWrite22_115(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native int __call22_116(moom.zH a0) throws Throwable;
private static native int __invokedynamic22_117(int a0, long a1) throws Throwable;
private static native void __fieldWrite22_118(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native net.minecraft.entity.Entity[] __call22_119(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call22_120(moom.zH a0) throws Throwable;
private static native int __call22_121(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call22_122(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call22_123(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native int __call22_124(moom.zH a0) throws Throwable;
private static native void __call22_125(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead22_126(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call22_127(moom.zH a0) throws Throwable;
private static native void __call22_128(net.minecraft.client.multiplayer.WorldClient a0, int a1, net.minecraft.entity.Entity a2) throws Throwable;
private static native int __call22_129(moom.zH a0) throws Throwable;
private static native int __call22_130(moom.zH a0) throws Throwable;
private static native int __invokedynamic22_131(int a0, long a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead22_132(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call22_133(moom.zH a0) throws Throwable;
private static native net.minecraft.entity.Entity __call22_134(net.minecraft.client.multiplayer.WorldClient a0, int a1) throws Throwable;
private static native int __instanceOf22_135(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __instanceOf22_136(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.projectile.EntityArrow __cast22_137(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite22_138(net.minecraft.entity.projectile.EntityArrow a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native int __call22_139(moom.zH a0) throws Throwable;
private static native int __call22_140(moom.zH a0) throws Throwable;
private static native int __call22_141(moom.zH a0) throws Throwable;
private static native void __call22_142(net.minecraft.entity.Entity a0, double a1, double a2, double a3) throws Throwable;
private static native java.lang.Throwable __call3002200_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002201_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002202_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002203_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002204_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002205_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002206_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002207_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002208_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002209_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002210_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002211_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002212_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002213_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002214_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002215_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002216_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002217_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002218_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002219_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002220_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002221_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002222_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002223_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002224_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002225_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002226_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002227_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002228_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002229_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5039a261edfc920be820(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zI a1) throws E;
private static final class __SourceHandler_5039a261edfc920be820 {

public static void f219(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.zI p0) throws Throwable {
    int lexicalValue219_184_0;
    boolean spill219_0;
    net.minecraft.entity.EntityLivingBase spill219_1;
    float spill219_2;
    long life2_3;
    double life5_14;
    double life7_20;
    double life9_26;
    float life11_38;
    float life12_51;
    net.minecraft.entity.EntityLivingBase life13_59;
    int life4_88;
    net.minecraft.entity.Entity[] life14_91;
    int life15_104;
    net.minecraft.entity.Entity[] life16_106;
    int life17_109;
    int life18_111;
    net.minecraft.entity.Entity life19_118;
    java.util.List life15_176;
    lexical_join_185: {
    lexical_join_184: {
    lexical_join_183: {
    lexical_join_177: {
    lexical_join_168: {
    lexical_join_127: {
    life2_3 = (__fieldRead219_0() ^ 126935656686643L);
    __call219_2(p0, receiver, __fieldRead219_1(receiver));
    life5_14 = (((double) __call219_3(p0)) / 0x1.0p5d);
    life7_20 = (((double) __call219_4(p0)) / 0x1.0p5d);
    life9_26 = (((double) __call219_5(p0)) / 0x1.0p5d);
    life11_38 = (((float) (__call219_6(p0) * __invokedynamic219_7(3600, (6084274983156492730L ^ life2_3)))) / 0x1.0p8f);
    spill219_0 = __call219_8();
    life12_51 = (((float) (__call219_9(p0) * __invokedynamic219_10(3600, (6084274983156492730L ^ life2_3)))) / 0x1.0p8f);
    life13_59 = __cast219_15(__call219_14(__call219_11(p0), __fieldRead219_13(__fieldRead219_12(receiver))));
    __fieldWrite219_17(life13_59, __call219_16(p0));
    __fieldWrite219_19(life13_59, __call219_18(p0));
    __fieldWrite219_21(life13_59, __call219_20(p0));
    spill219_1 = life13_59;
    net.minecraft.entity.EntityLivingBase __stackOp219_24_0 = life13_59;
    float __stackOp219_24_1 = (((float) (__call219_22(p0) * __invokedynamic219_23(3600, (6084274983156492730L ^ life2_3)))) / 0x1.0p8f);
    spill219_2 = __stackOp219_24_1;
    __fieldWrite219_25(__stackOp219_24_0, __stackOp219_24_1);
    __fieldWrite219_26(spill219_1, spill219_2);
    life4_88 = __integerCategory219_27(spill219_0);
    life14_91 = __call219_28(life13_59);
    if (!((life4_88 == 0))) {
        break lexical_join_168;
    }
    if (!((life14_91 != null))) {
        break lexical_join_127;
    }
    life15_104 = (__call219_29(p0) - __call219_30(life13_59));
    life16_106 = life14_91;
    life17_109 = (life16_106).length;
    life18_111 = 0;
    lexical_cycle_109: while (true) {
    if (!((life18_111 < life17_109))) {
        break lexical_join_127;
    }
    life19_118 = (life16_106)[life18_111];
    __call219_32(life19_118, (__call219_31(life19_118) + life15_104));
    life18_111 += 1;
    if (!((life4_88 == 0))) {
        break lexical_join_168;
    }
    if (!((life4_88 != 0))) { continue lexical_cycle_109; }
    break lexical_cycle_109;
    }
    }
    __call219_34(life13_59, __call219_33(p0));
    __call219_35(life13_59, life5_14, life7_20, life9_26, life11_38, life12_51);
    __fieldWrite219_37(life13_59, ((double) (((float) __call219_36(p0)) / 0x1.f4p12f)));
    __fieldWrite219_39(life13_59, ((double) (((float) __call219_38(p0)) / 0x1.f4p12f)));
    __fieldWrite219_41(life13_59, ((double) (((float) __call219_40(p0)) / 0x1.f4p12f)));
    __call219_44(__fieldRead219_42(receiver), __call219_43(p0), life13_59);
    }
    life15_176 = __call219_45(p0);
    if (!((life15_176 != null))) {
        break lexical_join_177;
    }
    __call219_47(__call219_46(life13_59), life15_176);
    }
    if (!((__call219_48() != null))) {
        break lexical_join_185;
    }
    if (!((life4_88 != 0))) {
        break lexical_join_183;
    }
    lexicalValue219_184_0 = 0;
    break lexical_join_184;
    }
    lexicalValue219_184_0 = 1;
    }
    __call219_49(lexicalValue219_184_0);
    }
    return;
}
public static void h219_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1021900_0(p0);
}
public static void h219_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1021901_0(p0);
}
public static void h219_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1021902_0(p0);
}
public static void h219_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1021903_0(p0);
}
public static void h219_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1021904_0(p0);
}
private static native long __fieldRead219_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead219_1(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call219_2(moom.zI a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native int __call219_3(moom.zI a0) throws Throwable;
private static native int __call219_4(moom.zI a0) throws Throwable;
private static native int __call219_5(moom.zI a0) throws Throwable;
private static native byte __call219_6(moom.zI a0) throws Throwable;
private static native int __invokedynamic219_7(int a0, long a1) throws Throwable;
private static native boolean __call219_8() throws Throwable;
private static native byte __call219_9(moom.zI a0) throws Throwable;
private static native int __invokedynamic219_10(int a0, long a1) throws Throwable;
private static native int __call219_11(moom.zI a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead219_12(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead219_13(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.Entity __call219_14(int a0, net.minecraft.client.multiplayer.WorldClient a1) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __cast219_15(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call219_16(moom.zI a0) throws Throwable;
private static native void __fieldWrite219_17(net.minecraft.entity.EntityLivingBase a0, int a1) throws Throwable;
private static native int __call219_18(moom.zI a0) throws Throwable;
private static native void __fieldWrite219_19(net.minecraft.entity.EntityLivingBase a0, int a1) throws Throwable;
private static native int __call219_20(moom.zI a0) throws Throwable;
private static native void __fieldWrite219_21(net.minecraft.entity.EntityLivingBase a0, int a1) throws Throwable;
private static native byte __call219_22(moom.zI a0) throws Throwable;
private static native int __invokedynamic219_23(int a0, long a1) throws Throwable;
private static native void __fieldWrite219_25(net.minecraft.entity.EntityLivingBase a0, float a1) throws Throwable;
private static native void __fieldWrite219_26(net.minecraft.entity.EntityLivingBase a0, float a1) throws Throwable;
private static native int __integerCategory219_27(boolean value) throws Throwable;
private static native net.minecraft.entity.Entity[] __call219_28(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native int __call219_29(moom.zI a0) throws Throwable;
private static native int __call219_30(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native int __call219_31(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call219_32(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native int __call219_33(moom.zI a0) throws Throwable;
private static native void __call219_34(net.minecraft.entity.EntityLivingBase a0, int a1) throws Throwable;
private static native void __call219_35(net.minecraft.entity.EntityLivingBase a0, double a1, double a2, double a3, float a4, float a5) throws Throwable;
private static native int __call219_36(moom.zI a0) throws Throwable;
private static native void __fieldWrite219_37(net.minecraft.entity.EntityLivingBase a0, double a1) throws Throwable;
private static native int __call219_38(moom.zI a0) throws Throwable;
private static native void __fieldWrite219_39(net.minecraft.entity.EntityLivingBase a0, double a1) throws Throwable;
private static native int __call219_40(moom.zI a0) throws Throwable;
private static native void __fieldWrite219_41(net.minecraft.entity.EntityLivingBase a0, double a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead219_42(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call219_43(moom.zI a0) throws Throwable;
private static native void __call219_44(net.minecraft.client.multiplayer.WorldClient a0, int a1, net.minecraft.entity.EntityLivingBase a2) throws Throwable;
private static native java.util.List __call219_45(moom.zI a0) throws Throwable;
private static native net.minecraft.entity.DataWatcher __call219_46(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native void __call219_47(net.minecraft.entity.DataWatcher a0, java.util.List a1) throws Throwable;
private static native java.lang.String[] __call219_48() throws Throwable;
private static native void __call219_49(int a0) throws Throwable;
private static native java.lang.Throwable __call1021900_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1021901_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1021902_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1021903_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1021904_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_effefd7c32e2cab189aa(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zL a1) throws E;
private static final class __SourceHandler_effefd7c32e2cab189aa {

public static void f1376(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.zL p0) throws Throwable {
    int forwardValue1376_59_0;
    net.minecraft.entity.Entity forwardValue1376_65_0;
    net.minecraft.entity.Entity forwardValue1376_71_0;
    net.minecraft.entity.Entity forwardValue1376_73_0;
    double forwardValue1376_73_1;
    net.minecraft.entity.Entity forwardValue1376_79_0;
    double forwardValue1376_79_1;
    net.minecraft.entity.Entity forwardValue1376_81_0;
    double forwardValue1376_81_1;
    double forwardValue1376_81_2;
    net.minecraft.entity.Entity forwardValue1376_87_0;
    double forwardValue1376_87_1;
    double forwardValue1376_87_2;
    net.minecraft.entity.Entity forwardValue1376_89_0;
    double forwardValue1376_89_1;
    double forwardValue1376_89_2;
    double forwardValue1376_89_3;
    boolean spill1376_0;
    int spill1376_1;
    net.minecraft.entity.Entity spill1376_2;
    long life2_3;
    int life4_10;
    net.minecraft.entity.Entity life5_16;
    com.moon.n5 life6_35;
    com.moon.dW life7_43;
    forward_join_90: {
    forward_join_89: {
    forward_join_87: {
    forward_join_81: {
    forward_join_79: {
    forward_join_73: {
    forward_join_71: {
    forward_join_65: {
    forward_join_59: {
    forward_join_57: {
    life2_3 = (__fieldRead1376_0() ^ 33829700063956L);
    spill1376_0 = __call1376_1();
    __call1376_3(p0, receiver, __fieldRead1376_2(receiver));
    life4_10 = __integerCategory1376_4(spill1376_0);
    life5_16 = __call1376_7(__fieldRead1376_5(receiver), __call1376_6(p0));
    life6_35 = new com.moon.n5((((double) __call1376_8(p0)) / 0x1.f4p12d), (((double) __call1376_9(p0)) / 0x1.f4p12d), (((double) __call1376_10(p0)) / 0x1.f4p12d));
    life7_43 = new com.moon.dW(life6_35, false, false, false);
    spill1376_1 = __call1376_11(p0);
    if (!((life4_10 != 0))) {
        forwardValue1376_59_0 = spill1376_1;
        break forward_join_59;
    }
    if (!((spill1376_1 == __call1376_14(__fieldRead1376_13(__fieldRead1376_12(receiver)))))) {
        break forward_join_57;
    }
    __call1376_17(__call1376_16(__call1376_15()), life7_43);
    }
    forwardValue1376_59_0 = __integerCategory1376_19(__call1376_18(life7_43));
    }
    if (!((forwardValue1376_59_0 == 0))) {
        break forward_join_90;
    }
    spill1376_2 = life5_16;
    if (!((life4_10 != 0))) {
        forwardValue1376_65_0 = spill1376_2;
        break forward_join_65;
    }
    if (!((spill1376_2 != null))) {
        break forward_join_90;
    }
    forwardValue1376_65_0 = life5_16;
    }
    if (!(__call1376_20(life7_43))) {
        forwardValue1376_71_0 = forwardValue1376_65_0;
        break forward_join_71;
    }
    forwardValue1376_73_0 = forwardValue1376_65_0;
    forwardValue1376_73_1 = __fieldRead1376_21(life5_16);
    break forward_join_73;
    }
    forwardValue1376_73_0 = forwardValue1376_71_0;
    forwardValue1376_73_1 = __call1376_22(life6_35);
    }
    if (!(__call1376_23(life7_43))) {
        forwardValue1376_79_0 = forwardValue1376_73_0;
        forwardValue1376_79_1 = forwardValue1376_73_1;
        break forward_join_79;
    }
    forwardValue1376_81_0 = forwardValue1376_73_0;
    forwardValue1376_81_1 = forwardValue1376_73_1;
    forwardValue1376_81_2 = __fieldRead1376_24(life5_16);
    break forward_join_81;
    }
    forwardValue1376_81_0 = forwardValue1376_79_0;
    forwardValue1376_81_1 = forwardValue1376_79_1;
    forwardValue1376_81_2 = __call1376_25(life6_35);
    }
    if (!(__call1376_26(life7_43))) {
        forwardValue1376_87_0 = forwardValue1376_81_0;
        forwardValue1376_87_1 = forwardValue1376_81_1;
        forwardValue1376_87_2 = forwardValue1376_81_2;
        break forward_join_87;
    }
    forwardValue1376_89_0 = forwardValue1376_81_0;
    forwardValue1376_89_1 = forwardValue1376_81_1;
    forwardValue1376_89_2 = forwardValue1376_81_2;
    forwardValue1376_89_3 = __fieldRead1376_27(life5_16);
    break forward_join_89;
    }
    forwardValue1376_89_0 = forwardValue1376_87_0;
    forwardValue1376_89_1 = forwardValue1376_87_1;
    forwardValue1376_89_2 = forwardValue1376_87_2;
    forwardValue1376_89_3 = __call1376_28(life6_35);
    }
    __call1376_29(forwardValue1376_89_0, forwardValue1376_89_1, forwardValue1376_89_2, forwardValue1376_89_3);
    }
    return;
}
public static void h1376_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137600_0(p0);
}
public static void h1376_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137601_0(p0);
}
public static void h1376_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137602_0(p0);
}
public static void h1376_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137603_0(p0);
}
public static void h1376_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137604_0(p0);
}
public static void h1376_5(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137605_0(p0);
}
public static void h1376_6(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137606_0(p0);
}
private static native long __fieldRead1376_0() throws Throwable;
private static native boolean __call1376_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1376_2(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1376_3(moom.zL a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native int __integerCategory1376_4(boolean value) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1376_5(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call1376_6(moom.zL a0) throws Throwable;
private static native net.minecraft.entity.Entity __call1376_7(net.minecraft.client.multiplayer.WorldClient a0, int a1) throws Throwable;
private static native int __call1376_8(moom.zL a0) throws Throwable;
private static native int __call1376_9(moom.zL a0) throws Throwable;
private static native int __call1376_10(moom.zL a0) throws Throwable;
private static native int __call1376_11(moom.zL a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1376_12(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1376_13(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __call1376_14(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call1376_15() throws Throwable;
private static native com.moon.events.EventBus __call1376_16(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call1376_17(com.moon.events.EventBus a0, com.moon.dW a1) throws Throwable;
private static native boolean __call1376_18(com.moon.dW a0) throws Throwable;
private static native int __integerCategory1376_19(boolean value) throws Throwable;
private static native boolean __call1376_20(com.moon.dW a0) throws Throwable;
private static native double __fieldRead1376_21(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __call1376_22(com.moon.n5 a0) throws Throwable;
private static native boolean __call1376_23(com.moon.dW a0) throws Throwable;
private static native double __fieldRead1376_24(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __call1376_25(com.moon.n5 a0) throws Throwable;
private static native boolean __call1376_26(com.moon.dW a0) throws Throwable;
private static native double __fieldRead1376_27(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __call1376_28(com.moon.n5 a0) throws Throwable;
private static native void __call1376_29(net.minecraft.entity.Entity a0, double a1, double a2, double a3) throws Throwable;
private static native java.lang.Throwable __call1137600_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137601_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137602_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137603_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137604_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137605_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137606_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_81a76eece70f964723d1(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zN a1) throws E;
private static final class __SourceHandler_81a76eece70f964723d1 {

public static void f220(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.zN p0) throws Throwable {
    net.minecraft.entity.Entity forwardValue220_42_0;
    int forwardValue220_72_0;
    float forwardValue220_78_0;
    int forwardValue220_92_0;
    float forwardValue220_98_0;
    boolean spill220_0;
    net.minecraft.entity.Entity spill220_1;
    boolean spill220_2;
    boolean spill220_3;
    long life2_3;
    net.minecraft.entity.Entity life5_14;
    int life4_15;
    double life6_52;
    double life8_58;
    double life10_64;
    float life12_90;
    float life13_116;
    forward_join_112: {
    forward_join_98: {
    forward_join_96: {
    forward_join_92: {
    forward_join_78: {
    forward_join_76: {
    forward_join_72: {
    forward_join_42: {
    life2_3 = (__fieldRead220_0() ^ 111532126078595L);
    __call220_2(p0, receiver, __fieldRead220_1(receiver));
    spill220_0 = __call220_3();
    life5_14 = __call220_5(p0, __fieldRead220_4(receiver));
    life4_15 = __integerCategory220_6(spill220_0);
    spill220_1 = life5_14;
    if (!((life4_15 == 0))) {
        forwardValue220_42_0 = spill220_1;
        break forward_join_42;
    }
    if (!((spill220_1 != null))) {
        break forward_join_112;
    }
    net.minecraft.entity.Entity __stackOp220_7_0 = life5_14;
    __fieldWrite220_10(__stackOp220_7_0, (__fieldRead220_8(__stackOp220_7_0) + __call220_9(p0)));
    net.minecraft.entity.Entity __stackOp220_11_0 = life5_14;
    __fieldWrite220_14(__stackOp220_11_0, (__fieldRead220_12(__stackOp220_11_0) + __call220_13(p0)));
    net.minecraft.entity.Entity __stackOp220_15_0 = life5_14;
    __fieldWrite220_18(__stackOp220_15_0, (__fieldRead220_16(__stackOp220_15_0) + __call220_17(p0)));
    forwardValue220_42_0 = life5_14;
    }
    life6_52 = (((double) __fieldRead220_19(forwardValue220_42_0)) / 0x1.0p5d);
    life8_58 = (((double) __fieldRead220_20(life5_14)) / 0x1.0p5d);
    life10_64 = (((double) __fieldRead220_21(life5_14)) / 0x1.0p5d);
    spill220_2 = __call220_22(p0);
    if (!((life4_15 == 0))) {
        forwardValue220_72_0 = __integerCategory220_23(spill220_2);
        break forward_join_72;
    }
    if (!(spill220_2)) {
        break forward_join_76;
    }
    forwardValue220_72_0 = (__call220_24(p0) * __invokedynamic220_25(24432, (160175352125463150L ^ life2_3)));
    }
    forwardValue220_78_0 = (((float) forwardValue220_72_0) / 0x1.0p8f);
    break forward_join_78;
    }
    forwardValue220_78_0 = __fieldRead220_26(life5_14);
    }
    life12_90 = forwardValue220_78_0;
    spill220_3 = __call220_27(p0);
    if (!((life4_15 == 0))) {
        forwardValue220_92_0 = __integerCategory220_28(spill220_3);
        break forward_join_92;
    }
    if (!(spill220_3)) {
        break forward_join_96;
    }
    forwardValue220_92_0 = (__call220_29(p0) * __invokedynamic220_30(3600, (6084285988571368202L ^ life2_3)));
    }
    forwardValue220_98_0 = (((float) forwardValue220_92_0) / 0x1.0p8f);
    break forward_join_98;
    }
    forwardValue220_98_0 = __fieldRead220_31(life5_14);
    }
    life13_116 = forwardValue220_98_0;
    __call220_32(life5_14, life6_52, life8_58, life10_64, life12_90, life13_116, 3, 0);
    __fieldWrite220_34(life5_14, __call220_33(p0));
    }
    return;
}
public static void h220_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1022000_0(p0);
}
public static void h220_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1022001_0(p0);
}
public static void h220_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1022002_0(p0);
}
public static void h220_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1022003_0(p0);
}
public static void h220_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1022004_0(p0);
}
public static void h220_5(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1022005_0(p0);
}
private static native long __fieldRead220_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead220_1(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call220_2(moom.zN a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native boolean __call220_3() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead220_4(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.entity.Entity __call220_5(moom.zN a0, net.minecraft.client.multiplayer.WorldClient a1) throws Throwable;
private static native int __integerCategory220_6(boolean value) throws Throwable;
private static native int __fieldRead220_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native byte __call220_9(moom.zN a0) throws Throwable;
private static native void __fieldWrite220_10(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native int __fieldRead220_12(net.minecraft.entity.Entity a0) throws Throwable;
private static native byte __call220_13(moom.zN a0) throws Throwable;
private static native void __fieldWrite220_14(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native int __fieldRead220_16(net.minecraft.entity.Entity a0) throws Throwable;
private static native byte __call220_17(moom.zN a0) throws Throwable;
private static native void __fieldWrite220_18(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native int __fieldRead220_19(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __fieldRead220_20(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __fieldRead220_21(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call220_22(moom.zN a0) throws Throwable;
private static native int __integerCategory220_23(boolean value) throws Throwable;
private static native byte __call220_24(moom.zN a0) throws Throwable;
private static native int __invokedynamic220_25(int a0, long a1) throws Throwable;
private static native float __fieldRead220_26(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call220_27(moom.zN a0) throws Throwable;
private static native int __integerCategory220_28(boolean value) throws Throwable;
private static native byte __call220_29(moom.zN a0) throws Throwable;
private static native int __invokedynamic220_30(int a0, long a1) throws Throwable;
private static native float __fieldRead220_31(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call220_32(net.minecraft.entity.Entity a0, double a1, double a2, double a3, float a4, float a5, int a6, int a7) throws Throwable;
private static native boolean __call220_33(moom.zN a0) throws Throwable;
private static native void __fieldWrite220_34(net.minecraft.entity.Entity a0, boolean a1) throws Throwable;
private static native java.lang.Throwable __call1022000_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1022001_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1022002_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1022003_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1022004_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1022005_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_a26f50a8d7a3839a76da(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zR a1) throws E;
private static final class __SourceHandler_a26f50a8d7a3839a76da {

public static void f1378(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.zR p0) throws Throwable {
    net.minecraft.entity.Entity forwardValue1378_34_0;
    net.minecraft.entity.Entity forwardValue1378_120_0;
    boolean spill1378_0;
    net.minecraft.entity.Entity spill1378_1;
    net.minecraft.entity.Entity spill1378_2;
    net.minecraft.entity.Entity spill1378_3;
    net.minecraft.entity.Entity spill1378_4;
    long life2_3;
    net.minecraft.entity.Entity life5_15;
    int life4_16;
    double life6_44;
    double life8_50;
    double life10_56;
    float life12_68;
    float life13_80;
    forward_join_132: {
    forward_join_128: {
    forward_join_120: {
    forward_join_119: {
    forward_join_34: {
    life2_3 = (__fieldRead1378_0() ^ 98061929200347L);
    __call1378_2(p0, receiver, __fieldRead1378_1(receiver));
    spill1378_0 = __call1378_3();
    life5_15 = __call1378_6(__fieldRead1378_4(receiver), __call1378_5(p0));
    life4_16 = __integerCategory1378_7(spill1378_0);
    spill1378_1 = life5_15;
    if (!((life4_16 != 0))) {
        forwardValue1378_34_0 = spill1378_1;
        break forward_join_34;
    }
    if (!((spill1378_1 != null))) {
        break forward_join_132;
    }
    __fieldWrite1378_9(life5_15, __call1378_8(p0));
    __fieldWrite1378_11(life5_15, __call1378_10(p0));
    __fieldWrite1378_13(life5_15, __call1378_12(p0));
    forwardValue1378_34_0 = life5_15;
    }
    life6_44 = (((double) __fieldRead1378_14(forwardValue1378_34_0)) / 0x1.0p5d);
    life8_50 = (((double) __fieldRead1378_15(life5_15)) / 0x1.0p5d);
    life10_56 = (((double) __fieldRead1378_16(life5_15)) / 0x1.0p5d);
    life12_68 = (((float) (__call1378_17(p0) * __invokedynamic1378_18(3600, (6084228411471689554L ^ life2_3)))) / 0x1.0p8f);
    life13_80 = (((float) (__call1378_19(p0) * __invokedynamic1378_20(3600, (6084228411471689554L ^ life2_3)))) / 0x1.0p8f);
    spill1378_2 = life5_15;
    if (!((life4_16 != 0))) {
        forwardValue1378_120_0 = spill1378_2;
        break forward_join_120;
    }
    if (!((__numericCompare1378_23(__call1378_22((__fieldRead1378_21(spill1378_2) - life6_44)), 0x1.0p-5d) < 0))) {
        break forward_join_119;
    }
    spill1378_3 = life5_15;
    if (!((life4_16 != 0))) {
        forwardValue1378_120_0 = spill1378_3;
        break forward_join_120;
    }
    if (!((__numericCompare1378_26(__call1378_25((__fieldRead1378_24(spill1378_3) - life8_50)), 0x1.0p-6d) < 0))) {
        break forward_join_119;
    }
    spill1378_4 = life5_15;
    if (!((life4_16 != 0))) {
        forwardValue1378_120_0 = spill1378_4;
        break forward_join_120;
    }
    if (!((__numericCompare1378_29(__call1378_28((__fieldRead1378_27(spill1378_4) - life10_56)), 0x1.0p-5d) < 0))) {
        break forward_join_119;
    }
    __call1378_33(life5_15, __fieldRead1378_30(life5_15), __fieldRead1378_31(life5_15), __fieldRead1378_32(life5_15), life12_68, life13_80, 3, 1);
    if (!((life4_16 == 0))) {
        break forward_join_128;
    }
    }
    forwardValue1378_120_0 = life5_15;
    }
    __call1378_34(forwardValue1378_120_0, life6_44, life8_50, life10_56, life12_68, life13_80, 3, 1);
    }
    __fieldWrite1378_36(life5_15, __call1378_35(p0));
    }
    return;
}
public static void h1378_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137800_0(p0);
}
public static void h1378_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137801_0(p0);
}
public static void h1378_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137802_0(p0);
}
public static void h1378_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137803_0(p0);
}
public static void h1378_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137804_0(p0);
}
public static void h1378_5(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137805_0(p0);
}
public static void h1378_6(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137806_0(p0);
}
public static void h1378_7(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137807_0(p0);
}
public static void h1378_8(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137808_0(p0);
}
private static native long __fieldRead1378_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1378_1(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1378_2(moom.zR a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native boolean __call1378_3() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1378_4(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call1378_5(moom.zR a0) throws Throwable;
private static native net.minecraft.entity.Entity __call1378_6(net.minecraft.client.multiplayer.WorldClient a0, int a1) throws Throwable;
private static native int __integerCategory1378_7(boolean value) throws Throwable;
private static native int __call1378_8(moom.zR a0) throws Throwable;
private static native void __fieldWrite1378_9(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native int __call1378_10(moom.zR a0) throws Throwable;
private static native void __fieldWrite1378_11(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native int __call1378_12(moom.zR a0) throws Throwable;
private static native void __fieldWrite1378_13(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native int __fieldRead1378_14(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __fieldRead1378_15(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __fieldRead1378_16(net.minecraft.entity.Entity a0) throws Throwable;
private static native byte __call1378_17(moom.zR a0) throws Throwable;
private static native int __invokedynamic1378_18(int a0, long a1) throws Throwable;
private static native byte __call1378_19(moom.zR a0) throws Throwable;
private static native int __invokedynamic1378_20(int a0, long a1) throws Throwable;
private static native double __fieldRead1378_21(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __call1378_22(double a0) throws Throwable;
private static native int __numericCompare1378_23(double a0, double a1) throws Throwable;
private static native double __fieldRead1378_24(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __call1378_25(double a0) throws Throwable;
private static native int __numericCompare1378_26(double a0, double a1) throws Throwable;
private static native double __fieldRead1378_27(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __call1378_28(double a0) throws Throwable;
private static native int __numericCompare1378_29(double a0, double a1) throws Throwable;
private static native double __fieldRead1378_30(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1378_31(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead1378_32(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call1378_33(net.minecraft.entity.Entity a0, double a1, double a2, double a3, float a4, float a5, int a6, int a7) throws Throwable;
private static native void __call1378_34(net.minecraft.entity.Entity a0, double a1, double a2, double a3, float a4, float a5, int a6, int a7) throws Throwable;
private static native boolean __call1378_35(moom.zR a0) throws Throwable;
private static native void __fieldWrite1378_36(net.minecraft.entity.Entity a0, boolean a1) throws Throwable;
private static native java.lang.Throwable __call1137800_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137801_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137802_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137803_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137804_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137805_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137806_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137807_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137808_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5d8dfa2080d83e712bc3(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zT a1) throws E;
private static final class __SourceHandler_5d8dfa2080d83e712bc3 {

public static void f1379(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.zT p0) throws Throwable {
    long life2_3;
    net.minecraft.entity.Entity life5_14;
    int life4_15;
    forward_join_41: {
    forward_join_37: {
    life2_3 = (__fieldRead1379_0() ^ 15318994178548L);
    boolean spill1379_0 = __call1379_1();
    __call1379_3(p0, receiver, __fieldRead1379_2(receiver));
    life5_14 = __call1379_5(p0, __fieldRead1379_4(receiver));
    life4_15 = __integerCategory1379_6(spill1379_0);
    if (!((life5_14 != null))) { break forward_join_41; }
    if (!((__call1379_7(p0) == __invokedynamic1379_8(24034, (1774750040647028633L ^ life2_3))))) { break forward_join_37; }
    __call1379_12(__call1379_10(__fieldRead1379_9(receiver)), new moom.fV(__cast1379_11(life5_14)));
    if (!((life4_15 != 0))) { break forward_join_41; }
    }
    __call1379_14(life5_14, __call1379_13(p0));
    }
    return;
}
public static void h1379_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137900_0(p0);
}
public static void h1379_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137901_0(p0);
}
public static void h1379_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1137902_0(p0);
}
private static native long __fieldRead1379_0() throws Throwable;
private static native boolean __call1379_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1379_2(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1379_3(moom.zT a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1379_4(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.entity.Entity __call1379_5(moom.zT a0, net.minecraft.client.multiplayer.WorldClient a1) throws Throwable;
private static native int __integerCategory1379_6(boolean value) throws Throwable;
private static native byte __call1379_7(moom.zT a0) throws Throwable;
private static native int __invokedynamic1379_8(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1379_9(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.audio.SoundHandler __call1379_10(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.monster.EntityGuardian __cast1379_11(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call1379_12(net.minecraft.client.audio.SoundHandler a0, moom.fV a1) throws Throwable;
private static native byte __call1379_13(moom.zT a0) throws Throwable;
private static native void __call1379_14(net.minecraft.entity.Entity a0, byte a1) throws Throwable;
private static native java.lang.Throwable __call1137900_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137901_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1137902_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f319f1079de206594eae(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zU a1) throws E;
private static final class __SourceHandler_f319f1079de206594eae {

public static void f23(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.zU p0) throws Throwable {
    net.minecraft.entity.Entity forestValue23_54_0;
    net.minecraft.entity.Entity forestValue23_58_0;
    int forestValue23_62_0;
    int forestValue23_69_0;
    net.minecraft.entity.Entity forestValue23_75_0;
    net.minecraft.entity.Entity forestValue23_80_0;
    int forestValue23_108_0;
    int forestValue23_116_0;
    net.minecraft.entity.Entity forestValue23_118_0;
    net.minecraft.entity.Entity forestValue23_129_0;
    boolean spill23_0;
    int spill23_1;
    int spill23_2;
    net.minecraft.entity.Entity spill23_3;
    net.minecraft.entity.Entity spill23_4;
    net.minecraft.client.gui.GuiIngame spill23_5;
    java.lang.String spill23_6;
    java.lang.Object[] spill23_7;
    net.minecraft.entity.Entity spill23_8;
    long life2_3;
    net.minecraft.entity.Entity life5_15;
    int life4_16;
    net.minecraft.entity.Entity life6_22;
    int life7_32;
    net.minecraft.client.settings.GameSettings life8_116;
    forest_join_133: {
    forest_join_129: {
    forest_join_128: {
    forest_join_118: {
    forest_join_116: {
    forest_join_108: {
    forest_join_106: {
    forest_join_104: {
    forest_join_80: {
    forest_join_79: {
    forest_join_75: {
    forest_join_74: {
    forest_join_69: {
    forest_join_65: {
    forest_join_62: {
    forest_join_61: {
    forest_join_58: {
    forest_join_54: {
    forest_join_52: {
    life2_3 = (__fieldRead23_0() ^ 37611063631720L);
    spill23_0 = __call23_1();
    __call23_3(p0, receiver, __fieldRead23_2(receiver));
    life5_15 = __call23_6(__fieldRead23_4(receiver), __call23_5(p0));
    life4_16 = __integerCategory23_7(spill23_0);
    life6_22 = __call23_10(__fieldRead23_8(receiver), __call23_9(p0));
    spill23_1 = __call23_11(p0);
    if (!((life4_16 == 0))) {
        forestValue23_108_0 = spill23_1;
        break forest_join_108;
    }
    if (!((spill23_1 == 0))) {
        break forest_join_106;
    }
    life7_32 = 0;
    spill23_2 = __call23_12(p0);
    if (!((life4_16 == 0))) {
        forestValue23_69_0 = spill23_2;
        break forest_join_69;
    }
    if (!((spill23_2 == __call23_15(__fieldRead23_14(__fieldRead23_13(receiver)))))) {
        break forest_join_65;
    }
    life5_15 = __fieldRead23_17(__fieldRead23_16(receiver));
    spill23_3 = life6_22;
    if (!((life4_16 == 0))) {
        forestValue23_54_0 = spill23_3;
        break forest_join_54;
    }
    if (!((__instanceOf23_18(spill23_3) != 0))) {
        break forest_join_52;
    }
    __call23_20(__cast23_19(life6_22), 0);
    }
    forestValue23_54_0 = __fieldRead23_21(life5_15);
    }
    if (!((life4_16 == 0))) {
        forestValue23_58_0 = forestValue23_54_0;
        break forest_join_58;
    }
    if (!((forestValue23_54_0 == null))) {
        break forest_join_61;
    }
    forestValue23_58_0 = life6_22;
    }
    if (!((forestValue23_58_0 != null))) {
        break forest_join_61;
    }
    forestValue23_62_0 = 1;
    break forest_join_62;
    }
    forestValue23_62_0 = 0;
    }
    life7_32 = forestValue23_62_0;
    if (!((life4_16 != 0))) {
        break forest_join_74;
    }
    }
    spill23_4 = life6_22;
    if (!((life4_16 == 0))) {
        forestValue23_75_0 = spill23_4;
        break forest_join_75;
    }
    forestValue23_69_0 = __instanceOf23_22(spill23_4);
    }
    if (!((forestValue23_69_0 != 0))) {
        break forest_join_74;
    }
    __call23_24(__cast23_23(life6_22), 1);
    }
    forestValue23_75_0 = life5_15;
    }
    if (!((life4_16 == 0))) {
        forestValue23_80_0 = forestValue23_75_0;
        break forest_join_80;
    }
    if (!((forestValue23_75_0 == null))) {
        break forest_join_79;
    }
    return;
    }
    forestValue23_80_0 = life5_15;
    }
    __call23_25(forestValue23_80_0, life6_22);
    if (!((life7_32 != 0))) {
        break forest_join_104;
    }
    life8_116 = __fieldRead23_27(__fieldRead23_26(receiver));
    spill23_5 = __fieldRead23_29(__fieldRead23_28(receiver));
    spill23_6 = "mount.onboard";
    java.lang.Object[] __stackOp23_30_0 = new java.lang.Object[1];
    spill23_7 = __stackOp23_30_0;
    (__stackOp23_30_0)[0] = __call23_33(__call23_32(__fieldRead23_31(life8_116)));
    __call23_35(spill23_5, __call23_34(spill23_6, spill23_7), 0);
    }
    if (!((life4_16 != 0))) {
        break forest_join_133;
    }
    }
    forestValue23_108_0 = __call23_36(p0);
    }
    if (!((life4_16 == 0))) {
        forestValue23_116_0 = forestValue23_108_0;
        break forest_join_116;
    }
    if (!((forestValue23_108_0 == 1))) {
        break forest_join_133;
    }
    spill23_8 = life5_15;
    if (!((life4_16 == 0))) {
        forestValue23_118_0 = spill23_8;
        break forest_join_118;
    }
    forestValue23_116_0 = __instanceOf23_37(spill23_8);
    }
    if (!((forestValue23_116_0 != 0))) {
        break forest_join_133;
    }
    forestValue23_118_0 = life6_22;
    }
    if (!((life4_16 == 0))) {
        forestValue23_129_0 = forestValue23_118_0;
        break forest_join_129;
    }
    if (!((forestValue23_118_0 != null))) {
        break forest_join_128;
    }
    __call23_39(__cast23_38(life5_15), life6_22, 0);
    if (!((life4_16 != 0))) {
        break forest_join_133;
    }
    }
    forestValue23_129_0 = life5_15;
    }
    __call23_41(__cast23_40(forestValue23_129_0), 0, 0);
    }
    return;
}
public static void h23_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002300_0(p0);
}
public static void h23_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002301_0(p0);
}
public static void h23_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002302_0(p0);
}
public static void h23_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002303_0(p0);
}
public static void h23_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002304_0(p0);
}
public static void h23_5(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002305_0(p0);
}
public static void h23_6(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002306_0(p0);
}
public static void h23_7(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002307_0(p0);
}
public static void h23_8(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002308_0(p0);
}
public static void h23_9(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002309_0(p0);
}
public static void h23_10(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002310_0(p0);
}
public static void h23_11(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002311_0(p0);
}
public static void h23_12(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002312_0(p0);
}
public static void h23_13(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002313_0(p0);
}
public static void h23_14(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002314_0(p0);
}
public static void h23_15(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002315_0(p0);
}
public static void h23_16(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3002316_0(p0);
}
private static native long __fieldRead23_0() throws Throwable;
private static native boolean __call23_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead23_2(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call23_3(moom.zU a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead23_4(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call23_5(moom.zU a0) throws Throwable;
private static native net.minecraft.entity.Entity __call23_6(net.minecraft.client.multiplayer.WorldClient a0, int a1) throws Throwable;
private static native int __integerCategory23_7(boolean value) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead23_8(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call23_9(moom.zU a0) throws Throwable;
private static native net.minecraft.entity.Entity __call23_10(net.minecraft.client.multiplayer.WorldClient a0, int a1) throws Throwable;
private static native int __call23_11(moom.zU a0) throws Throwable;
private static native int __call23_12(moom.zU a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead23_13(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead23_14(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __call23_15(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead23_16(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead23_17(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __instanceOf23_18(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.tv __cast23_19(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call23_20(moom.tv a0, int a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead23_21(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __instanceOf23_22(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.tv __cast23_23(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call23_24(moom.tv a0, int a1) throws Throwable;
private static native void __call23_25(net.minecraft.entity.Entity a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead23_26(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead23_27(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead23_28(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead23_29(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead23_31(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __call23_32(moom.pz a0) throws Throwable;
private static native java.lang.String __call23_33(int a0) throws Throwable;
private static native java.lang.String __call23_34(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __call23_35(net.minecraft.client.gui.GuiIngame a0, java.lang.String a1, int a2) throws Throwable;
private static native int __call23_36(moom.zU a0) throws Throwable;
private static native int __instanceOf23_37(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.EntityLiving __cast23_38(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call23_39(net.minecraft.entity.EntityLiving a0, net.minecraft.entity.Entity a1, int a2) throws Throwable;
private static native net.minecraft.entity.EntityLiving __cast23_40(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call23_41(net.minecraft.entity.EntityLiving a0, int a1, int a2) throws Throwable;
private static native java.lang.Throwable __call3002300_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002301_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002302_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002303_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002304_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002305_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002306_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002307_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002308_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002309_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002310_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002311_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002312_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002313_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002314_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002315_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3002316_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_70c2c9148feff7537e5f(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zV a1) throws E;
private static final class __SourceHandler_70c2c9148feff7537e5f {

public static void f2399(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.zV p0) throws Throwable {
    long life2_3;
    net.minecraft.entity.Entity life4_14;
    life2_3 = (__fieldRead2399_0() ^ 71115974507319L);
    __call2399_2(p0, receiver, __fieldRead2399_1(receiver));
    life4_14 = __call2399_5(__fieldRead2399_3(receiver), __call2399_4(p0));
    if ((life4_14 != null)) {
        if ((__call2399_6(p0) != null)) {
        __call2399_9(__call2399_7(life4_14), __call2399_8(p0));
    }
    }
    return;
}
public static void h2399_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1239900_0(p0);
}
public static void h2399_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1239901_0(p0);
}
private static native long __fieldRead2399_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2399_1(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call2399_2(moom.zV a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead2399_3(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call2399_4(moom.zV a0) throws Throwable;
private static native net.minecraft.entity.Entity __call2399_5(net.minecraft.client.multiplayer.WorldClient a0, int a1) throws Throwable;
private static native java.util.List __call2399_6(moom.zV a0) throws Throwable;
private static native net.minecraft.entity.DataWatcher __call2399_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.util.List __call2399_8(moom.zV a0) throws Throwable;
private static native void __call2399_9(net.minecraft.entity.DataWatcher a0, java.util.List a1) throws Throwable;
private static native java.lang.Throwable __call1239900_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1239901_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_9967126abd03925a3934(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zX a1) throws E;
private static final class __SourceHandler_9967126abd03925a3934 {

public static void f1380(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.zX p0) throws Throwable {
    net.minecraft.entity.Entity forwardValue1380_23_0;
    boolean spill1380_0;
    net.minecraft.entity.Entity spill1380_1;
    long life2_3;
    net.minecraft.entity.Entity life5_15;
    int life4_16;
    forward_join_27: {
    forward_join_23: {
    life2_3 = (__fieldRead1380_0() ^ 102264205326697L);
    __call1380_2(p0, receiver, __fieldRead1380_1(receiver));
    spill1380_0 = __call1380_3();
    life5_15 = __call1380_6(__fieldRead1380_4(receiver), __call1380_5(p0));
    life4_16 = __integerCategory1380_7(spill1380_0);
    spill1380_1 = life5_15;
    if (!((life4_16 == 0))) {
        forwardValue1380_23_0 = spill1380_1;
        break forward_join_23;
    }
    if (!((__instanceOf1380_8(spill1380_1) != 0))) {
        break forward_join_27;
    }
    forwardValue1380_23_0 = life5_15;
    }
    __call1380_11(__cast1380_9(forwardValue1380_23_0), __call1380_10(p0));
    }
    return;
}
public static void h1380_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1138000_0(p0);
}
public static void h1380_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1138001_0(p0);
}
private static native long __fieldRead1380_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1380_1(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1380_2(moom.zX a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native boolean __call1380_3() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1380_4(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call1380_5(moom.zX a0) throws Throwable;
private static native net.minecraft.entity.Entity __call1380_6(net.minecraft.client.multiplayer.WorldClient a0, int a1) throws Throwable;
private static native int __integerCategory1380_7(boolean value) throws Throwable;
private static native int __instanceOf1380_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __cast1380_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call1380_10(moom.zX a0) throws Throwable;
private static native void __call1380_11(net.minecraft.entity.EntityLivingBase a0, int a1) throws Throwable;
private static native java.lang.Throwable __call1138000_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1138001_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_93c158b078a7b38a44ea(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zZ a1) throws E;
private static final class __SourceHandler_93c158b078a7b38a44ea {

public static void f1381(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.zZ p0) throws Throwable {
    net.minecraft.entity.Entity lexicalValue1381_22_0;
    net.minecraft.entity.Entity lexicalValue1381_33_0;
    net.minecraft.entity.ai.attributes.IAttributeInstance lexicalValue1381_69_0;
    net.minecraft.entity.ai.attributes.IAttributeInstance lexicalValue1381_92_0;
    int lexicalValue1381_92_1;
    net.minecraft.entity.ai.attributes.IAttributeInstance lexicalValue1381_93_0;
    net.minecraft.entity.ai.attributes.IAttributeInstance lexicalValue1381_94_0;
    int lexicalValue1381_94_1;
    net.minecraft.entity.ai.attributes.IAttributeInstance lexicalValue1381_100_0;
    boolean spill1381_0;
    net.minecraft.entity.Entity spill1381_1;
    net.minecraft.entity.ai.attributes.IAttributeInstance spill1381_2;
    net.minecraft.entity.ai.attributes.IAttributeInstance spill1381_3;
    boolean spill1381_4;
    long life2_3;
    int life4_10;
    net.minecraft.entity.Entity life5_16;
    net.minecraft.entity.ai.attributes.BaseAttributeMap life6_43;
    java.util.Iterator life7_47;
    net.minecraft.network.play.server.S20PacketEntityProperties$Snapshot life8_54;
    net.minecraft.entity.ai.attributes.IAttributeInstance life9_59;
    com.moon.dT life10_94;
    java.util.Iterator life10_124;
    moom.vB life11_131;
    lexical_join_121: {
    lexical_join_33: {
    lexical_join_32: {
    lexical_join_22: {
    life2_3 = (__fieldRead1381_0() ^ 120756875992444L);
    spill1381_0 = __call1381_1();
    __call1381_3(p0, receiver, __fieldRead1381_2(receiver));
    life4_10 = __integerCategory1381_4(spill1381_0);
    life5_16 = __call1381_7(__fieldRead1381_5(receiver), __call1381_6(p0));
    spill1381_1 = life5_16;
    if (!((life4_10 == 0))) {
        lexicalValue1381_22_0 = spill1381_1;
        break lexical_join_22;
    }
    if (!((spill1381_1 != null))) {
        break lexical_join_121;
    }
    lexicalValue1381_22_0 = life5_16;
    }
    if (!((life4_10 == 0))) {
        lexicalValue1381_33_0 = lexicalValue1381_22_0;
        break lexical_join_33;
    }
    if (!((__instanceOf1381_8(lexicalValue1381_22_0) == 0))) {
        break lexical_join_32;
    }
    throw new java.lang.IllegalStateException(__invokedynamic1381_9(life5_16));
    }
    lexicalValue1381_33_0 = life5_16;
    }
    life6_43 = __call1381_11(__cast1381_10(lexicalValue1381_33_0));
    life7_47 = __call1381_13(__call1381_12(p0));
    lexical_cycle_40: while (true) {
    lexical_join_119: {
    lexical_join_101: {
    lexical_join_100: {
    lexical_join_99: {
    lexical_join_94: {
    lexical_join_93: {
    lexical_join_92: {
    lexical_join_69: {
    lexical_join_68: {
    if (!(__call1381_14(life7_47))) {
        break lexical_join_121;
    }
    life8_54 = __cast1381_16(__call1381_15(life7_47));
    life9_59 = __call1381_18(life6_43, __call1381_17(life8_54));
    spill1381_2 = life9_59;
    if (!((life4_10 == 0))) {
        lexicalValue1381_69_0 = spill1381_2;
        break lexical_join_69;
    }
    if (!((spill1381_2 == null))) {
        break lexical_join_68;
    }
    life9_59 = __call1381_20(life6_43, new net.minecraft.entity.ai.attributes.RangedAttribute(null, __call1381_19(life8_54), 0x0.0p0d, 0x1.0p-1022d, 0x1.fffffffffffffp1023d));
    }
    lexicalValue1381_69_0 = life9_59;
    }
    if (!((life4_10 == 0))) {
        lexicalValue1381_100_0 = lexicalValue1381_69_0;
        break lexical_join_100;
    }
    __call1381_22(lexicalValue1381_69_0, __call1381_21(life8_54));
    if (!((__instanceOf1381_23(life5_16) != 0))) {
        break lexical_join_99;
    }
    life10_94 = new com.moon.dT();
    __call1381_26(__call1381_25(__call1381_24()), life10_94);
    spill1381_3 = life9_59;
    spill1381_4 = __call1381_27(life10_94);
    if (!((life4_10 == 0))) {
        lexicalValue1381_92_0 = spill1381_3;
        lexicalValue1381_92_1 = __integerCategory1381_28(spill1381_4);
        break lexical_join_92;
    }
    if (!((!spill1381_4))) {
        lexicalValue1381_93_0 = spill1381_3;
        break lexical_join_93;
    }
    lexicalValue1381_92_0 = spill1381_3;
    lexicalValue1381_92_1 = 1;
    }
    lexicalValue1381_94_0 = lexicalValue1381_92_0;
    lexicalValue1381_94_1 = lexicalValue1381_92_1;
    break lexical_join_94;
    }
    lexicalValue1381_94_0 = lexicalValue1381_93_0;
    lexicalValue1381_94_1 = 0;
    }
    __call1381_30(lexicalValue1381_94_0, lexicalValue1381_94_1, __call1381_29(life8_54));
    if (!((life4_10 != 0))) {
        break lexical_join_101;
    }
    }
    lexicalValue1381_100_0 = life9_59;
    }
    __call1381_31(lexicalValue1381_100_0);
    }
    life10_124 = __call1381_33(__call1381_32(life8_54));
    lexical_cycle_105: while (true) {
    if (!(__call1381_34(life10_124))) {
        break lexical_join_119;
    }
    life11_131 = __cast1381_36(__call1381_35(life10_124));
    __call1381_37(life9_59, life11_131);
    if (!((life4_10 == 0))) { continue lexical_cycle_40; }
    if (!((life4_10 != 0))) { continue lexical_cycle_105; }
    break lexical_cycle_105;
    }
    }
    if (!((life4_10 != 0))) { continue lexical_cycle_40; }
    break lexical_cycle_40;
    }
    }
    return;
}
public static void h1381_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1138100_0(p0);
}
public static void h1381_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1138101_0(p0);
}
public static void h1381_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1138102_0(p0);
}
public static void h1381_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1138103_0(p0);
}
public static void h1381_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1138104_0(p0);
}
public static void h1381_5(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1138105_0(p0);
}
public static void h1381_6(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1138106_0(p0);
}
private static native long __fieldRead1381_0() throws Throwable;
private static native boolean __call1381_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1381_2(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1381_3(moom.zZ a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native int __integerCategory1381_4(boolean value) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1381_5(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call1381_6(moom.zZ a0) throws Throwable;
private static native net.minecraft.entity.Entity __call1381_7(net.minecraft.client.multiplayer.WorldClient a0, int a1) throws Throwable;
private static native int __instanceOf1381_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.String __invokedynamic1381_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __cast1381_10(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.ai.attributes.BaseAttributeMap __call1381_11(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native java.util.List __call1381_12(moom.zZ a0) throws Throwable;
private static native java.util.Iterator __call1381_13(java.util.List a0) throws Throwable;
private static native boolean __call1381_14(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1381_15(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.network.play.server.S20PacketEntityProperties$Snapshot __cast1381_16(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call1381_17(net.minecraft.network.play.server.S20PacketEntityProperties$Snapshot a0) throws Throwable;
private static native net.minecraft.entity.ai.attributes.IAttributeInstance __call1381_18(net.minecraft.entity.ai.attributes.BaseAttributeMap a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call1381_19(net.minecraft.network.play.server.S20PacketEntityProperties$Snapshot a0) throws Throwable;
private static native net.minecraft.entity.ai.attributes.IAttributeInstance __call1381_20(net.minecraft.entity.ai.attributes.BaseAttributeMap a0, net.minecraft.entity.ai.attributes.RangedAttribute a1) throws Throwable;
private static native double __call1381_21(net.minecraft.network.play.server.S20PacketEntityProperties$Snapshot a0) throws Throwable;
private static native void __call1381_22(net.minecraft.entity.ai.attributes.IAttributeInstance a0, double a1) throws Throwable;
private static native int __instanceOf1381_23(net.minecraft.entity.Entity a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call1381_24() throws Throwable;
private static native com.moon.events.EventBus __call1381_25(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call1381_26(com.moon.events.EventBus a0, com.moon.dT a1) throws Throwable;
private static native boolean __call1381_27(com.moon.dT a0) throws Throwable;
private static native int __integerCategory1381_28(boolean value) throws Throwable;
private static native java.util.Collection __call1381_29(net.minecraft.network.play.server.S20PacketEntityProperties$Snapshot a0) throws Throwable;
private static native void __call1381_30(net.minecraft.entity.ai.attributes.IAttributeInstance a0, int a1, java.util.Collection a2) throws Throwable;
private static native void __call1381_31(net.minecraft.entity.ai.attributes.IAttributeInstance a0) throws Throwable;
private static native java.util.Collection __call1381_32(net.minecraft.network.play.server.S20PacketEntityProperties$Snapshot a0) throws Throwable;
private static native java.util.Iterator __call1381_33(java.util.Collection a0) throws Throwable;
private static native boolean __call1381_34(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1381_35(java.util.Iterator a0) throws Throwable;
private static native moom.vB __cast1381_36(java.lang.Object a0) throws Throwable;
private static native void __call1381_37(net.minecraft.entity.ai.attributes.IAttributeInstance a0, moom.vB a1) throws Throwable;
private static native java.lang.Throwable __call1138100_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1138101_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1138102_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1138103_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1138104_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1138105_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1138106_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5e5270a78990260eb664(net.minecraft.client.network.NetHandlerPlayClient a0, moom.z_ a1) throws E;
private static final class __SourceHandler_5e5270a78990260eb664 {

public static void f1382(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.z_ p0) throws Throwable {
    long life2_3;
    int life4_10;
    forward_join_38: {
    forward_join_28: {
    forward_join_26: {
    life2_3 = (__fieldRead1382_0() ^ 89914084644829L);
    boolean spill1382_0 = __call1382_1();
    __call1382_3(p0, receiver, __fieldRead1382_2(receiver));
    life4_10 = __integerCategory1382_4(spill1382_0);
    if (!((life4_10 != 0))) { break forward_join_26; }
    if (!(__call1382_5(p0))) { break forward_join_28; }
    __call1382_11(__fieldRead1382_7(__fieldRead1382_6(receiver)), __call1382_8(p0), __call1382_9(p0), __call1382_10(p0));
    }
    if (!((life4_10 == 0))) { break forward_join_38; }
    }
    __call1382_17(__fieldRead1382_13(__fieldRead1382_12(receiver)), __call1382_14(p0), __call1382_15(p0), __call1382_16(p0));
    }
    return;
}
public static void h1382_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1138200_0(p0);
}
public static void h1382_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1138201_0(p0);
}
public static void h1382_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1138202_0(p0);
}
private static native long __fieldRead1382_0() throws Throwable;
private static native boolean __call1382_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1382_2(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1382_3(moom.z_ a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native int __integerCategory1382_4(boolean value) throws Throwable;
private static native boolean __call1382_5(moom.z_ a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1382_6(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1382_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __call1382_8(moom.z_ a0) throws Throwable;
private static native moom.DT __call1382_9(moom.z_ a0) throws Throwable;
private static native int __call1382_10(moom.z_ a0) throws Throwable;
private static native void __call1382_11(net.minecraft.client.multiplayer.WorldClient a0, int a1, moom.DT a2, int a3) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1382_12(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1382_13(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __call1382_14(moom.z_ a0) throws Throwable;
private static native moom.DT __call1382_15(moom.z_ a0) throws Throwable;
private static native int __call1382_16(moom.z_ a0) throws Throwable;
private static native void __call1382_17(net.minecraft.client.multiplayer.WorldClient a0, int a1, moom.DT a2, int a3) throws Throwable;
private static native java.lang.Throwable __call1138200_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1138201_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1138202_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d6c8ba2169b868dd320d(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zv a1) throws E;
private static final class __SourceHandler_d6c8ba2169b868dd320d {

public static void f1383(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.zv p0) throws Throwable {
    long life2_3;
    int life4_10;
    forward_join_33: {
    forward_join_26: {
    forward_join_24: {
    life2_3 = (__fieldRead1383_0() ^ 127594332676743L);
    boolean spill1383_0 = __call1383_1();
    __call1383_3(p0, receiver, __fieldRead1383_2(receiver));
    life4_10 = __integerCategory1383_4(spill1383_0);
    if (!((life4_10 == 0))) { break forward_join_24; }
    if (!((__call1383_5(p0) == 2))) { break forward_join_26; }
    __call1383_9(__fieldRead1383_7(__fieldRead1383_6(receiver)), __call1383_8(p0), 0);
    }
    if (!((life4_10 != 0))) { break forward_join_33; }
    }
    __call1383_14(__call1383_12(__fieldRead1383_11(__fieldRead1383_10(receiver))), __call1383_13(p0));
    }
    return;
}
public static void h1383_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1138300_0(p0);
}
public static void h1383_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1138301_0(p0);
}
public static void h1383_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1138302_0(p0);
}
private static native long __fieldRead1383_0() throws Throwable;
private static native boolean __call1383_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1383_2(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1383_3(moom.zv a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native int __integerCategory1383_4(boolean value) throws Throwable;
private static native byte __call1383_5(moom.zv a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1383_6(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead1383_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1383_8(moom.zv a0) throws Throwable;
private static native void __call1383_9(net.minecraft.client.gui.GuiIngame a0, net.minecraft.util.IChatComponent a1, int a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1383_10(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead1383_11(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.gB __call1383_12(net.minecraft.client.gui.GuiIngame a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1383_13(moom.zv a0) throws Throwable;
private static native void __call1383_14(moom.gB a0, net.minecraft.util.IChatComponent a1) throws Throwable;
private static native java.lang.Throwable __call1138300_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1138301_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1138302_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d9eecf0bfc972e66eed3(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zx a1) throws E;
private static final class __SourceHandler_d9eecf0bfc972e66eed3 {

public static void f1384(net.minecraft.client.network.NetHandlerPlayClient receiver, moom.zx p0) throws Throwable {
    net.minecraft.entity.Entity forwardValue1384_22_0;
    boolean spill1384_0;
    net.minecraft.entity.Entity spill1384_1;
    long life2_3;
    net.minecraft.entity.Entity life5_15;
    int life4_16;
    forward_join_27: {
    forward_join_22: {
    life2_3 = (__fieldRead1384_0() ^ 46331770563061L);
    __call1384_2(p0, receiver, __fieldRead1384_1(receiver));
    spill1384_0 = __call1384_3();
    life5_15 = __call1384_6(__fieldRead1384_4(receiver), __call1384_5(p0));
    life4_16 = __integerCategory1384_7(spill1384_0);
    spill1384_1 = life5_15;
    if (!((life4_16 == 0))) {
        forwardValue1384_22_0 = spill1384_1;
        break forward_join_22;
    }
    if (!((spill1384_1 != null))) {
        break forward_join_27;
    }
    forwardValue1384_22_0 = life5_15;
    }
    __call1384_10(forwardValue1384_22_0, __call1384_8(p0), __call1384_9(p0));
    }
    return;
}
public static void h1384_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1138400_0(p0);
}
private static native long __fieldRead1384_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1384_1(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1384_2(moom.zx a0, net.minecraft.client.network.NetHandlerPlayClient a1, net.minecraft.client.Minecraft a2) throws Throwable;
private static native boolean __call1384_3() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1384_4(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native int __call1384_5(moom.zx a0) throws Throwable;
private static native net.minecraft.entity.Entity __call1384_6(net.minecraft.client.multiplayer.WorldClient a0, int a1) throws Throwable;
private static native int __integerCategory1384_7(boolean value) throws Throwable;
private static native int __call1384_8(moom.zx a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1384_9(moom.zx a0) throws Throwable;
private static native void __call1384_10(net.minecraft.entity.Entity a0, int a1, net.minecraft.item.ItemStack a2) throws Throwable;
private static native java.lang.Throwable __call1138400_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_bf64004db50cad3e176e() throws E;
private static final class __SourceHandler_bf64004db50cad3e176e {

public static boolean f2405() throws Throwable {
    int life0_1;
    life0_1 = __integerCategory2405_1(__call2405_0());
    if ((life0_1 == 0)) {
        return true;
    }
    return false;
}
public static void h2405_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1240500_0(p0);
}
private static native boolean __call2405_0() throws Throwable;
private static native int __integerCategory2405_1(boolean value) throws Throwable;
private static native java.lang.Throwable __call1240500_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_33bed7e5cb28e07bfaa6(net.minecraft.client.network.NetHandlerPlayClient a0, java.lang.String a1, java.lang.String a2, boolean a3, int a4) throws E;
private static final class __SourceHandler_33bed7e5cb28e07bfaa6 {

public static void f1385(net.minecraft.client.network.NetHandlerPlayClient receiver, java.lang.String p0, java.lang.String p1, boolean p2, int p3) throws Throwable {
    net.minecraft.client.Minecraft forwardValue1385_34_0;
    net.minecraft.client.network.NetHandlerPlayClient forwardValue1385_48_0;
    net.minecraft.client.network.NetHandlerPlayClient forwardValue1385_59_0;
    net.minecraft.client.network.NetHandlerPlayClient spill1385_0;
    net.minecraft.client.Minecraft spill1385_1;
    long life5_3;
    int life7_5;
    forward_join_66: {
    forward_join_59: {
    forward_join_58: {
    forward_join_48: {
    forward_join_47: {
    forward_join_34: {
    forward_join_24: {
    life5_3 = (__fieldRead1385_0() ^ 113481921054650L);
    life7_5 = __integerCategory1385_2(__call1385_1());
    spill1385_0 = receiver;
    if (!((life7_5 != 0))) {
        forwardValue1385_48_0 = spill1385_0;
        break forward_join_48;
    }
    __fieldWrite1385_4(spill1385_0, __call1385_3());
    if (!(p2)) {
        break forward_join_47;
    }
    spill1385_1 = __fieldRead1385_5(receiver);
    if (!((life7_5 != 0))) {
        forwardValue1385_34_0 = spill1385_1;
        break forward_join_34;
    }
    if (!((__call1385_6(spill1385_1) != null))) {
        break forward_join_24;
    }
    __call1385_10(__call1385_8(__fieldRead1385_7(receiver)), __fieldRead1385_9());
    }
    __call1385_13(__fieldRead1385_11(receiver), new moom.zs(p0, __fieldRead1385_12()));
    forwardValue1385_34_0 = __fieldRead1385_14(receiver);
    }
    __call1385_18(__call1385_16(__call1385_15(forwardValue1385_34_0), p1, p0), new moom.jV(receiver, p0), __call1385_17());
    if (!((life7_5 == 0))) {
        break forward_join_66;
    }
    }
    forwardValue1385_48_0 = receiver;
    }
    if (!((life7_5 != 0))) {
        forwardValue1385_59_0 = forwardValue1385_48_0;
        break forward_join_59;
    }
    if (!((__call1385_20(__fieldRead1385_19(forwardValue1385_48_0)) != null))) {
        break forward_join_58;
    }
    __call1385_24(__call1385_22(__fieldRead1385_21(receiver)), __fieldRead1385_23());
    }
    forwardValue1385_59_0 = receiver;
    }
    __call1385_27(__fieldRead1385_25(forwardValue1385_59_0), new moom.zs(p0, __fieldRead1385_26()));
    }
    __call1385_30(__call1385_29(__fieldRead1385_28(receiver)));
    __call1385_32(__fieldRead1385_31(receiver), null);
    return;
}
public static void h1385_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1138500_0(p0);
}
public static void h1385_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1138501_0(p0);
}
public static void h1385_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1138502_0(p0);
}
public static void h1385_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1138503_0(p0);
}
public static void h1385_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1138504_0(p0);
}
public static void h1385_5(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1138505_0(p0);
}
public static void h1385_6(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1138506_0(p0);
}
private static native long __fieldRead1385_0() throws Throwable;
private static native boolean __call1385_1() throws Throwable;
private static native int __integerCategory1385_2(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __call1385_3() throws Throwable;
private static native void __fieldWrite1385_4(net.minecraft.client.network.NetHandlerPlayClient a0, net.minecraft.client.Minecraft a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1385_5(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native moom.jL __call1385_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1385_7(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native moom.jL __call1385_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.az __fieldRead1385_9() throws Throwable;
private static native void __call1385_10(moom.jL a0, moom.az a1) throws Throwable;
private static native net.minecraft.network.NetworkManager __fieldRead1385_11(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.network.play.client.C19PacketResourcePackStatus$Action __fieldRead1385_12() throws Throwable;
private static native void __call1385_13(net.minecraft.network.NetworkManager a0, moom.zs a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1385_14(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.client.resources.ResourcePackRepository __call1385_15(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFuture __call1385_16(net.minecraft.client.resources.ResourcePackRepository a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.util.concurrent.Executor __call1385_17() throws Throwable;
private static native void __call1385_18(com.google.common.util.concurrent.ListenableFuture a0, moom.jV a1, java.util.concurrent.Executor a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1385_19(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native moom.jL __call1385_20(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1385_21(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native moom.jL __call1385_22(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.az __fieldRead1385_23() throws Throwable;
private static native void __call1385_24(moom.jL a0, moom.az a1) throws Throwable;
private static native net.minecraft.network.NetworkManager __fieldRead1385_25(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.network.play.client.C19PacketResourcePackStatus$Action __fieldRead1385_26() throws Throwable;
private static native void __call1385_27(net.minecraft.network.NetworkManager a0, moom.zs a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1385_28(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native moom.jL __call1385_29(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1385_30(moom.jL a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1385_31(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native void __call1385_32(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Throwable __call1138500_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1138501_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1138502_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1138503_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1138504_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1138505_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1138506_0(java.lang.IllegalStateException a0) throws Throwable;

}


public void b(moom.yK<?> p0) {
((net.minecraft.network.NetworkManager)(this.b)).a(((moom.yK)(p0)));
    return;
}


public static void b(boolean p0) {
l = ((boolean)(p0));
    return;
}


public static boolean b() {
return ((((net.minecraft.client.network.NetHandlerPlayClient.l) ? 1 : 0)) != 0);
}


public static boolean c() { return __sourceHandlerCall_bf64004db50cad3e176e(); }


public void a(moom.AG p0) { __sourceHandlerCall_122e0fa576625425a519(this, p0); }


public void a(moom.AH p0) { __sourceHandlerCall_3f8902344e043fcd59d8(this, p0); }


public void a(moom.AE p0) {
moom.yL.a(((moom.yK)(p0)), ((moom.yE)(this)), ((net.minecraft.util.IThreadListener)(this.h)));
    ((moom.AE)(p0)).a(((net.minecraft.world.border.WorldBorder)(((net.minecraft.client.multiplayer.WorldClient)(this.i)).a__Fi())));
    return;
}


public void a(moom.AA p0) {
moom.yL.a(((moom.yK)(p0)), ((moom.yE)(this)), ((net.minecraft.util.IThreadListener)(this.h)));
    ((net.minecraft.world.storage.WorldInfo)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.h)).I)).a__IX())).a(((net.minecraft.world.EnumDifficulty)(((moom.AA)(p0)).a())));
    ((net.minecraft.world.storage.WorldInfo)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.h)).I)).a__IX())).g(((boolean)(((moom.AA)(p0)).a__Boolean())));
    return;
}


public void a(moom.AD p0) {
long life2_3;
    net.minecraft.entity.Entity life4_13;
    life2_3 = (net.minecraft.client.network.NetHandlerPlayClient.m ^ 97896960050231L);
    moom.yL.a(((moom.yK)(p0)), ((moom.yE)(this)), ((net.minecraft.util.IThreadListener)(this.h)));
    life4_13 = ((moom.AD)(p0)).a(((net.minecraft.world.World)(this.i)));
    try {
        if ((life4_13 != null)) {
        ((net.minecraft.client.Minecraft)(this.h)).a(((net.minecraft.entity.Entity)(life4_13)));
    }
    } catch (java.lang.IllegalStateException caught_rethrow_0) {
        throw net.minecraft.client.network.NetHandlerPlayClient.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    return;
}


public void a(moom.zt p0) {
((net.minecraft.client.network.NetHandlerPlayClient)(this)).a(((moom.yK)(new moom.y4(((moom.zt)(p0)).a()))));
    return;
}


public void a(moom.Ap p0) { __sourceHandlerCall_1a854111609a2c7136f8(this, p0); }


public void a(moom.As p0) {
moom.yL.a(((moom.yK)(p0)), ((moom.yE)(this)), ((net.minecraft.util.IThreadListener)(this.h)));
    java.lang.Object local2 = ((net.minecraft.client.Minecraft)(this.h)).K;
    ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(local2)).b1)).b = ((boolean)(((moom.As)(p0)).b__Boolean()));
    ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(local2)).b1)).d = ((boolean)(((moom.As)(p0)).d()));
    ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(local2)).b1)).a = ((boolean)(((moom.As)(p0)).a__Boolean()));
    ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(local2)).b1)).c = ((boolean)(((moom.As)(p0)).c()));
    ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(local2)).b1)).a(((float)(((moom.As)(p0)).a())));
    ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(local2)).b1)).b(((float)(((moom.As)(p0)).b())));
    return;
}


public void a(moom.zX p0) { __sourceHandlerCall_9967126abd03925a3934(this, p0); }


public void a(moom.AI p0) { __sourceHandlerCall_7b54dd1d43feca49995f(this, p0); }


public void a(moom.Ac p0) { __sourceHandlerCall_470120fa1aa8cc317ad0(this, p0); }


public void a(moom.z8 p0) { __sourceHandlerCall_98c72af20a94040c7116(this, p0); }


public void a(moom.z7 p0) {
moom.yL.a(((moom.yK)(p0)), ((moom.yE)(this)), ((net.minecraft.util.IThreadListener)(this.h)));
    ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.h)).I)).c(((int)(((moom.z7)(p0)).a())), ((moom.DT)(((moom.z7)(p0)).a__DT())), ((int)(((moom.z7)(p0)).b())));
    return;
}


public void a(moom.z6 p0) {
moom.yL.a(((moom.yK)(p0)), ((moom.yE)(this)), ((net.minecraft.util.IThreadListener)(this.h)));
    ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.h)).I)).c(((moom.DT)(((moom.z6)(p0)).a__DT())), ((net.minecraft.block.Block)(((moom.z6)(p0)).a__ch())), ((int)(((moom.z6)(p0)).a())), ((int)(((moom.z6)(p0)).b())));
    return;
}


public void a(moom.Af p0) {
moom.yL.a(((moom.yK)(p0)), ((moom.yE)(this)), ((net.minecraft.util.IThreadListener)(this.h)));
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.h)).K)).V__sourceReturn_da8c82d5d4();
    return;
}


public void a(moom.AB p0) {
moom.yL.a(((moom.yK)(p0)), ((moom.yE)(this)), ((net.minecraft.util.IThreadListener)(this.h)));
    return;
}


public void a(moom.zW p0) {
long life2_3;
    net.minecraft.entity.Entity life4_14;
    net.minecraft.potion.PotionEffect life5_30;
    life2_3 = (net.minecraft.client.network.NetHandlerPlayClient.m ^ 7079838719271L);
    moom.yL.a(((moom.yK)(p0)), ((moom.yE)(this)), ((net.minecraft.util.IThreadListener)(this.h)));
    life4_14 = ((net.minecraft.client.multiplayer.WorldClient)(this.i)).a(((int)(((moom.zW)(p0)).a__Int())));
    if ((((life4_14 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0) != 0)) {
        life5_30 = new net.minecraft.potion.PotionEffect(((moom.zW)(p0)).a(), ((moom.zW)(p0)).b__Int(), ((moom.zW)(p0)).b(), false, ((moom.zW)(p0)).b__Boolean());
        ((net.minecraft.potion.PotionEffect)(life5_30)).b(((boolean)(((moom.zW)(p0)).a__Boolean())));
        ((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(life4_14)))).a(((net.minecraft.potion.PotionEffect)(life5_30)));
    }
    return;
}


public void a(moom.Ao p0) { __sourceHandlerCall_080f4b099916e16611bb(this, p0); }


public void a(moom.z_ p0) { __sourceHandlerCall_5e5270a78990260eb664(this, p0); }


public void a(moom.Al p0) {
moom.yL.a(((moom.yK)(p0)), ((moom.yE)(this)), ((net.minecraft.util.IThreadListener)(this.h)));
    java.lang.Object local2 = moom.xA.a(((int)(((moom.Al)(p0)).a())), ((net.minecraft.world.World)(((net.minecraft.client.Minecraft)(this.h)).I)));
    ((moom.Al)(p0)).a(((net.minecraft.world.storage.MapData)(local2)));
    ((net.minecraft.client.gui.MapItemRenderer)(((net.minecraft.client.renderer.EntityRenderer)(((net.minecraft.client.Minecraft)(this.h)).R)).a__ip())).a__Void(((net.minecraft.world.storage.MapData)(local2)));
    return;
}


public moom.jX a(java.lang.String p0) { return __sourceHandlerCall_b23ee560e32ef2b76096(this, p0); }


public moom.jX a(java.util.UUID p0) {
return ((moom.jX)(((java.util.Map)(this.e)).get(((java.lang.Object)(p0)))));
}


public java.util.Collection<moom.jX> a__Collection() {
return ((java.util.Map)(this.e)).values();
}


public net.minecraft.network.NetworkManager a__r() {
return this.b;
}


public void a(moom.zZ p0) { __sourceHandlerCall_93c158b078a7b38a44ea(this, p0); }


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10464_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/jS"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.network.NetHandlerPlayClient.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 13171;
      if (o[var3] == null) {
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
         long var5 = n[var3];
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
         Object[] var9 = (Object[])p.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               p.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/jS", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         o[var3] = var15;
      }

      return o[var3];
}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


public com.mojang.authlib.GameProfile a() {
return this.c;
}


public void a(moom.Ay p0) { __sourceHandlerCall_d1877f093a79cb54f24e(this, p0); }


public void a(moom.AK p0) { __sourceHandlerCall_28eb5927f6a47fea1b63(this, p0); }


public void a(moom.AJ p0) { __sourceHandlerCall_dbccc3a672ef8702b338(this, p0); }


public void a(moom.Aa p0) {
moom.yL.a(((moom.yK)(p0)), ((moom.yE)(this)), ((net.minecraft.util.IThreadListener)(this.h)));
    ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.h)).I)).a(((double)(((moom.Aa)(p0)).a())), ((double)(((moom.Aa)(p0)).b())), ((double)(((moom.Aa)(p0)).c())), ((java.lang.String)(((moom.Aa)(p0)).a__String())), ((float)(((moom.Aa)(p0)).a__Float())), ((float)(((moom.Aa)(p0)).b__Float())), ((boolean)(false)));
    return;
}


public void a(moom.At p0) { __sourceHandlerCall_cb0db9d2db8c26a636c5(this, p0); }


public void a(moom.Ab p0) { __sourceHandlerCall_c229d4ed1c400690ffa1(this, p0); }


public void a(moom.Ax p0) { __sourceHandlerCall_8ff705e3dccfdb15b23f(this, p0); }


public void a(moom.Aw p0) { __sourceHandlerCall_6ea344be6e7bb1c87bd9(this, p0); }


public void a(moom.Av p0) { __sourceHandlerCall_ac00b966e1cb26bfb410(this, p0); }


public void a(moom.Au p0) { __sourceHandlerCall_3e621ce9bfebea962031(this, p0); }


public void a(moom.z1 p0) { __sourceHandlerCall_5f72487fb39133bb4f00(this, p0); }


public void a(moom.z3 p0) {
boolean spill1488_0;
    long life2_3;
    int life4_10;
    moom.z4[] life5_13;
    int life6_16;
    int life7_18;
    moom.z4 life8_25;
    lexical_join_37: {
    life2_3 = (net.minecraft.client.network.NetHandlerPlayClient.m ^ 129434685558322L);
    spill1488_0 = net.minecraft.client.network.NetHandlerPlayClient.c();
    moom.yL.a(((moom.yK)(p0)), ((moom.yE)(this)), ((net.minecraft.util.IThreadListener)(this.h)));
    life4_10 = ((spill1488_0) ? 1 : 0);
    life5_13 = ((moom.z3)(p0)).a();
    life6_16 = (life5_13).length;
    life7_18 = 0;
    lexical_cycle_19: while (true) {
    if (!((life7_18 < life6_16))) {
        break lexical_join_37;
    }
    life8_25 = (life5_13)[life7_18];
    ((net.minecraft.client.multiplayer.WorldClient)(this.i)).b(((moom.DT)(((moom.z4)(life8_25)).a())), ((net.minecraft.block.state.IBlockState)(((moom.z4)(life8_25)).a__fE())));
    life7_18 += 1;
    if (!((life4_10 == 0))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    return;
}


public void a(moom.zB p0) { __sourceHandlerCall_4c6364239ec399601d30(this, p0); }


public void a(moom.zM p0) {
boolean spill1489_0;
    long life2_3;
    int life5_11;
    int life4_12;
    lexical_join_29: {
    life2_3 = (net.minecraft.client.network.NetHandlerPlayClient.m ^ 129950730068696L);
    spill1489_0 = net.minecraft.client.network.NetHandlerPlayClient.c();
    moom.yL.a(((moom.yK)(p0)), ((moom.yE)(this)), ((net.minecraft.util.IThreadListener)(this.h)));
    life5_11 = 0;
    life4_12 = ((spill1489_0) ? 1 : 0);
    lexical_cycle_13: while (true) {
    if (!((life5_11 < (((moom.zM)(p0)).a()).length))) {
        break lexical_join_29;
    }
    ((net.minecraft.client.multiplayer.WorldClient)(this.i)).b__sourceReturn_b6fcdeb6b7(((int)((((moom.zM)(p0)).a())[life5_11])));
    life5_11 += 1;
    if (!((life4_12 == 0))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return;
}


public void a(moom.zS p0) {
long life2_3;
    net.minecraft.entity.Entity life4_13;
    float life5_27;
    life2_3 = (net.minecraft.client.network.NetHandlerPlayClient.m ^ 58365249409445L);
    moom.yL.a(((moom.yK)(p0)), ((moom.yE)(this)), ((net.minecraft.util.IThreadListener)(this.h)));
    life4_13 = ((moom.zS)(p0)).a(((net.minecraft.world.World)(this.i)));
    if ((life4_13 != null)) {
        life5_27 = (((float) (((moom.zS)(p0)).a() * __sourceIntrinsic_19b01f4c826d_invokedynamic8555_6(3600, (6084338614384860204L ^ life2_3)))) / 0x1.0p8f);
        ((net.minecraft.entity.Entity)(life4_13)).a__Void(((float)(life5_27)));
    }
    return;
}


public void a(moom.zN p0) { __sourceHandlerCall_81a76eece70f964723d1(this, p0); }


public void a(moom.zG p0) { __sourceHandlerCall_9e357a601cce4e36ac0e(this, p0); }


public void a(moom.yK p0) { __sourceHandlerCall_b1969f6ddc0d52b29653(this, p0); }


public void a(net.minecraft.util.IChatComponent p0) {
((net.minecraft.client.Minecraft)(this.h)).a(((net.minecraft.client.multiplayer.WorldClient)(null)));
    ((net.minecraft.client.Minecraft)(this.h)).a(((net.minecraft.client.gui.GuiScreen)(new moom.gO(((net.minecraft.client.gui.GuiScreen)(java.util.Objects.requireNonNullElseGet(((java.lang.Object)(this.d)), ((java.util.function.Supplier)(__sourceIntrinsic_2586c2e710d8_originalDynamicSite1811_4()))))), "disconnect.lost", p0))));
    return;
}


public void a(moom.Az p0) {
((net.minecraft.network.NetworkManager)(this.b)).a(((net.minecraft.util.IChatComponent)(((moom.Az)(p0)).a())));
    return;
}


public void a(moom.z5 p0) {
moom.yL.a(((moom.yK)(p0)), ((moom.yE)(this)), ((net.minecraft.util.IThreadListener)(this.h)));
    ((net.minecraft.client.multiplayer.WorldClient)(this.i)).b(((moom.DT)(((moom.z5)(p0)).a())), ((net.minecraft.block.state.IBlockState)(((moom.z5)(p0)).a__fE())));
    return;
}


public void a(moom.zJ p0) {
moom.yL.a(((moom.yK)(p0)), ((moom.yE)(this)), ((net.minecraft.util.IThreadListener)(this.h)));
    moom.sF local2 = new moom.sF(this.i, ((moom.zJ)(p0)).a__DT(), ((moom.zJ)(p0)).a__bs(), ((moom.zJ)(p0)).a__String());
    ((net.minecraft.client.multiplayer.WorldClient)(this.i)).a(((int)(((moom.zJ)(p0)).a())), ((net.minecraft.entity.Entity)(local2)));
    return;
}


public void a(moom.Ad p0) { __sourceHandlerCall_f1b7307697e1de189080(this, p0); }


public void a(moom.zK p0) {
moom.yL.a(((moom.yK)(p0)), ((moom.yE)(this)), ((net.minecraft.util.IThreadListener)(this.h)));
    moom.tL local2 = new moom.tL(this.i, (((double) ((moom.zK)(p0)).b()) / 0x1.0p5d), (((double) ((moom.zK)(p0)).c()) / 0x1.0p5d), (((double) ((moom.zK)(p0)).d()) / 0x1.0p5d), ((moom.zK)(p0)).e());
    ((net.minecraft.entity.Entity)(local2)).Z = ((int)(((moom.zK)(p0)).b()));
    ((net.minecraft.entity.Entity)(local2)).aa = ((int)(((moom.zK)(p0)).c()));
    ((net.minecraft.entity.Entity)(local2)).ab = ((int)(((moom.zK)(p0)).d()));
    ((net.minecraft.entity.Entity)(local2)).w = ((float)(0x0.0p0f));
    ((net.minecraft.entity.Entity)(local2)).x = ((float)(0x0.0p0f));
    ((net.minecraft.entity.Entity)(local2)).a(((int)(((moom.zK)(p0)).a())));
    ((net.minecraft.client.multiplayer.WorldClient)(this.i)).a(((int)(((moom.zK)(p0)).a())), ((net.minecraft.entity.Entity)(local2)));
    return;
}


public void a(moom.zH p0) { __sourceHandlerCall_0c35ea78f0a5deeb4a69(this, p0); }


public void a(moom.zu p0) {
moom.yL.a(((moom.yK)(p0)), ((moom.yE)(this)), ((net.minecraft.util.IThreadListener)(this.h)));
    ((net.minecraft.client.Minecraft)(this.h)).F = ((moom.jI)(new moom.jI(this.h, this)));
    this.i = ((net.minecraft.client.multiplayer.WorldClient)(new net.minecraft.client.multiplayer.WorldClient(this, new moom.EK(0L, ((moom.zu)(p0)).a__bE(), false, ((moom.zu)(p0)).a__Boolean(), ((moom.zu)(p0)).a__EL()), ((moom.zu)(p0)).b(), ((moom.zu)(p0)).a__bB(), ((net.minecraft.client.Minecraft)(this.h)).j)));
    ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.h)).W)).aN = ((net.minecraft.world.EnumDifficulty)(((moom.zu)(p0)).a__bB()));
    ((net.minecraft.client.Minecraft)(this.h)).a(((net.minecraft.client.multiplayer.WorldClient)(this.i)));
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.h)).K)).af = ((int)(((moom.zu)(p0)).b()));
    ((net.minecraft.client.Minecraft)(this.h)).a(((net.minecraft.client.gui.GuiScreen)(new moom.gP(this))));
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.h)).K)).a(((int)(((moom.zu)(p0)).a())));
    this.g = ((int)(((moom.zu)(p0)).c()));
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.h)).K)).i(((boolean)(((moom.zu)(p0)).b__Boolean())));
    ((moom.jI)(((net.minecraft.client.Minecraft)(this.h)).F)).a(((net.minecraft.world.WorldSettings$GameType)(((moom.zu)(p0)).a__bE())));
    ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.h)).W)).c();
    ((net.minecraft.network.NetworkManager)(this.b)).a(((moom.yK)(new moom.zq("MC|Brand", ((net.minecraft.network.PacketBuffer)(new net.minecraft.network.PacketBuffer(io.netty.buffer.Unpooled.buffer()))).a(((java.lang.String)(moom.fK.a())))))));
    return;
}


public void a__Void() {
this.i = ((net.minecraft.client.multiplayer.WorldClient)(null));
    return;
}


public void a(moom.zC p0) { __sourceHandlerCall_21047e52fa940e58487f(this, p0); }


public void a(moom.zR p0) { __sourceHandlerCall_a26f50a8d7a3839a76da(this, p0); }


public void a(moom.zF p0) { __sourceHandlerCall_af556cb4549617cf41a8(this, p0); }


public void a(moom.zV p0) { __sourceHandlerCall_70c2c9148feff7537e5f(this, p0); }


public void a(moom.zL p0) { __sourceHandlerCall_effefd7c32e2cab189aa(this, p0); }


public void a(moom.Ah p0) { __sourceHandlerCall_2d65351e1e1e681c75d0(this, p0); }


public void a(moom.Aj p0) { __sourceHandlerCall_3528eeaa846c212ae6bb(this, p0); }


public void a(moom.Ag p0) { __sourceHandlerCall_8e9e142bc7a56aab6b65(this, p0); }


public void a(moom.Ae p0) { __sourceHandlerCall_52169311d00ed1ec3dbc(this, p0); }


public void a(moom.z9 p0) { __sourceHandlerCall_285bf99bf5a588fbee32(this, p0); }


public void a(moom.zA p0) { __sourceHandlerCall_57fca5915e183e5187d8(this, p0); }


public void a(moom.zx p0) { __sourceHandlerCall_d9eecf0bfc972e66eed3(this, p0); }


public void a(moom.Ai p0) { __sourceHandlerCall_b0eb8a05b45080a12a50(this, p0); }


public void a(moom.Am p0) { __sourceHandlerCall_bd9c3361794c55f95779(this, p0); }


public void a(moom.Ak p0) { __sourceHandlerCall_f051215d4cd06891e162(this, p0); }


public void a(moom.An p0) { __sourceHandlerCall_774878f8589a534c7f1a(this, p0); }


public void a(moom.zI p0) { __sourceHandlerCall_5039a261edfc920be820(this, p0); }


public void a(moom.zw p0) {
moom.yL.a(((moom.yK)(p0)), ((moom.yE)(this)), ((net.minecraft.util.IThreadListener)(this.h)));
    ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.h)).I)).a(((long)(((moom.zw)(p0)).a())));
    ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.h)).I)).b(((long)(((moom.zw)(p0)).b())));
    return;
}


public void a(moom.zy p0) {
moom.yL.a(((moom.yK)(p0)), ((moom.yE)(this)), ((net.minecraft.util.IThreadListener)(this.h)));
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.h)).K)).a(((moom.DT)(((moom.zy)(p0)).a())), ((boolean)(true)));
    ((net.minecraft.world.storage.WorldInfo)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.h)).I)).a__IX())).a(((moom.DT)(((moom.zy)(p0)).a())));
    return;
}


public void a(moom.zU p0) { __sourceHandlerCall_f319f1079de206594eae(this, p0); }


public void a(moom.zD p0) {
moom.yL.a(((moom.yK)(p0)), ((moom.yE)(this)), ((net.minecraft.util.IThreadListener)(this.h)));
    ((net.minecraft.entity.player.EntityPlayer)(((moom.zD)(p0)).a(((net.minecraft.world.World)(this.i))))).a__sourceReturn_47d2aadd8a(((moom.DT)(((moom.zD)(p0)).a())));
    return;
}


public void a(moom.zE p0) { __sourceHandlerCall_7e7d82e490b6adcbf710(this, p0); }


public void a(moom.zv p0) { __sourceHandlerCall_d6c8ba2169b868dd320d(this, p0); }


public void a(moom.zz p0) {
moom.yL.a(((moom.yK)(p0)), ((moom.yE)(this)), ((net.minecraft.util.IThreadListener)(this.h)));
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.h)).K)).i(((float)(((moom.zz)(p0)).a())));
    ((net.minecraft.util.FoodStats)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.h)).K)).a__C2())).a(((int)(((moom.zz)(p0)).a__Int())));
    ((net.minecraft.util.FoodStats)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.h)).K)).a__C2())).b(((float)(((moom.zz)(p0)).b())));
    return;
}


public void a(moom.zY p0) {
moom.yL.a(((moom.yK)(p0)), ((moom.yE)(this)), ((net.minecraft.util.IThreadListener)(this.h)));
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.h)).K)).a(((float)(((moom.zY)(p0)).a())), ((int)(((moom.zY)(p0)).a__Int())), ((int)(((moom.zY)(p0)).b())));
    return;
}


public void a(moom.zT p0) { __sourceHandlerCall_5d8dfa2080d83e712bc3(this, p0); }


private static net.minecraft.client.gui.GuiScreen lambda$onDisconnect$0() {
return new net.minecraft.client.gui.GuiMultiplayer(new net.minecraft.client.gui.GuiMainMenu());
}


private void lambda$handleResourcePack$2(java.lang.String p0, java.lang.String p1) {
((net.minecraft.client.Minecraft)(this.h)).a(((net.minecraft.client.gui.GuiScreen)(new moom.hb(__sourceIntrinsic_26822dd77cd5_originalDynamicSite1812_1(this, p0, p1), moom.oO.a(((java.lang.String)("multiplayer.texturePrompt.line1")), ((java.lang.Object[])(new java.lang.Object[0]))), moom.oO.a(((java.lang.String)("multiplayer.texturePrompt.line2")), ((java.lang.Object[])(new java.lang.Object[0]))), 0))));
    return;
}


private void lambda$handleResourcePack$1(java.lang.String p0, java.lang.String p1, boolean p2, int p3) { __sourceHandlerCall_33bed7e5cb28e07bfaa6(this, p0, p1, p2, p3); }


private static native <E extends Throwable> int __sourceIntrinsic_194c380879ec2dca_originalDynamicSite3724_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10464_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19b01f4c826d_invokedynamic8555_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_2586c2e710d8_originalDynamicSite1811_4() throws E;

private static native <E extends Throwable> net.minecraft.client.gui.GuiYesNoCallback __sourceIntrinsic_26822dd77cd5_originalDynamicSite1812_1(net.minecraft.client.network.NetHandlerPlayClient a0, java.lang.String a1, java.lang.String a2) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
