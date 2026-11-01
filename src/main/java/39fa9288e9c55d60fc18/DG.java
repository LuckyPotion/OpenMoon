package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class DG {

private static org.apache.logging.log4j.Logger a;

private static java.text.DateFormat b;

private static java.nio.IntBuffer c;

private static int[] d;

private static long e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

public DG() {
super();
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-7848570412223512475L)), ((long)(7262445293103976601L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(258813653890372L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.DG.e ^ 70370240773244L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill687_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill687_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill687_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill687_14 = new byte[8];
    (__sourceSpill687_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill687_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation687_16 = __sourceSpill687_14;
    ((javax.crypto.Cipher)(__sourceSpill687_11)).init(((int)(__sourceSpill687_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill687_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation687_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "]Ép\"Îw HdwùÖ\003{@#¿CRÖNc\0061S¿­3ÕÝÎ$£Ñ#\001NSÁSä k"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill687_25 = local6_life21;
        int __sourceSpill687_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill687_25)).substring(((int)(__sourceSpill687_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill687_30 = local8_life19;
        int __sourceSpill687_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill687_33 = new byte[8];
        (__sourceSpill687_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill687_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill687_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill687_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill687_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill687_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill687_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill687_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill687_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill687_34)).doFinal(((byte[])(__sourceSpill687_33)));
        (__sourceSpill687_30)[__sourceSpill687_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "I¼\000°\037Æ\003\002«;\027>¡Í"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill687_38 = local6_life21;
        int __sourceSpill687_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill687_38)).substring(((int)(__sourceSpill687_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill687_43 = local8_life19;
        int __sourceSpill687_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill687_46 = new byte[8];
        (__sourceSpill687_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill687_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill687_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill687_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill687_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill687_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill687_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill687_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill687_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill687_47)).doFinal(((byte[])(__sourceSpill687_46)));
        (__sourceSpill687_43)[__sourceSpill687_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[8]));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
    b = ((java.text.DateFormat)(new java.text.SimpleDateFormat("yyyy-MM-dd_HH.mm.ss")));
}

private static native <E extends Throwable> void __sourceHandlerCall_ffb88f1eb91ca8d13b58() throws E;
private static final class __SourceHandler_ffb88f1eb91ca8d13b58 {

public static void f625() throws Throwable {
    net.minecraft.client.renderer.EntityRenderer forwardValue625_22_0;
    boolean spill625_0;
    net.minecraft.client.renderer.EntityRenderer spill625_1;
    long life0_3;
    net.minecraft.client.Minecraft life3_6;
    int life2_14;
    forward_join_27: {
    forward_join_22: {
    life0_3 = (__fieldRead625_0() ^ 81768018248792L);
    spill625_0 = __call625_1();
    life3_6 = __call625_2();
    __call625_6(__call625_3(life3_6), __fieldRead625_4(life3_6), __fieldRead625_5(life3_6));
    life2_14 = __integerCategory625_7(spill625_0);
    spill625_1 = __fieldRead625_8(life3_6);
    if (!((life2_14 != 0))) {
        forwardValue625_22_0 = spill625_1;
        break forward_join_22;
    }
    if (!((spill625_1 != null))) {
        break forward_join_27;
    }
    forwardValue625_22_0 = __fieldRead625_9(life3_6);
    }
    __call625_12(forwardValue625_22_0, __fieldRead625_10(life3_6), __fieldRead625_11(life3_6));
    }
    return;
}
public static void h625_0(moom.Oo p0) throws Throwable {
    throw __call1062500_0(p0);
}
public static void h625_1(moom.Oo p0) throws Throwable {
    throw __call1062501_0(p0);
}
private static native long __fieldRead625_0() throws Throwable;
private static native boolean __call625_1() throws Throwable;
private static native net.minecraft.client.Minecraft __call625_2() throws Throwable;
private static native net.minecraft.client.shader.Framebuffer __call625_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead625_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead625_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call625_6(net.minecraft.client.shader.Framebuffer a0, int a1, int a2) throws Throwable;
private static native int __integerCategory625_7(boolean value) throws Throwable;
private static native net.minecraft.client.renderer.EntityRenderer __fieldRead625_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.renderer.EntityRenderer __fieldRead625_9(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead625_10(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead625_11(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call625_12(net.minecraft.client.renderer.EntityRenderer a0, int a1, int a2) throws Throwable;
private static native java.lang.Exception __call1062500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1062501_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_56200bd98af7a4277553(int a0, int a1) throws E;
private static final class __SourceHandler_56200bd98af7a4277553 {

public static void f1097(int p0, int p1) throws Throwable {
    long life2_3;
    net.minecraft.client.Minecraft life5_6;
    int life4_12;
    moom.ir life6_30;
    life2_3 = (__fieldRead1097_0() ^ 37692547219628L);
    boolean spill1097_0 = __call1097_1();
    life5_6 = __call1097_2();
    __fieldWrite1097_4(life5_6, __call1097_3(1, p0));
    life4_12 = __integerCategory1097_5(spill1097_0);
    __fieldWrite1097_7(life5_6, __call1097_6(1, p1));
    if ((life4_12 == 0)) {
        if ((__fieldRead1097_8(life5_6) != null)) {
        life6_30 = new moom.ir(life5_6);
        __call1097_12(__fieldRead1097_9(life5_6), life5_6, __call1097_10(life6_30), __call1097_11(life6_30));
    }
        __call1097_13();
    }
    return;
}
public static void h1097_0(moom.Oo p0) throws Throwable {
    throw __call1109700_0(p0);
}
private static native long __fieldRead1097_0() throws Throwable;
private static native boolean __call1097_1() throws Throwable;
private static native net.minecraft.client.Minecraft __call1097_2() throws Throwable;
private static native int __call1097_3(int a0, int a1) throws Throwable;
private static native void __fieldWrite1097_4(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native int __integerCategory1097_5(boolean value) throws Throwable;
private static native int __call1097_6(int a0, int a1) throws Throwable;
private static native void __fieldWrite1097_7(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead1097_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead1097_9(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __call1097_10(moom.ir a0) throws Throwable;
private static native int __call1097_11(moom.ir a0) throws Throwable;
private static native void __call1097_12(net.minecraft.client.gui.GuiScreen a0, net.minecraft.client.Minecraft a1, int a2, int a3) throws Throwable;
private static native void __call1097_13() throws Throwable;
private static native java.lang.Exception __call1109700_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.io.File __sourceHandlerCall_fc87501e1210cda5f782(java.io.File a0) throws E;
private static final class __SourceHandler_fc87501e1210cda5f782 {

public static java.io.File f231(java.io.File p0) throws Throwable {
    java.io.File forestValue231_23_0;
    java.io.File forestValue231_23_1;
    java.io.File forestValue231_23_2;
    java.lang.String forestValue231_23_3;
    java.io.File forestValue231_25_0;
    java.io.File forestValue231_25_1;
    java.io.File forestValue231_25_2;
    java.lang.String forestValue231_25_3;
    java.lang.String forestValue231_25_4;
    boolean spill231_0;
    java.text.DateFormat spill231_1;
    java.util.Date spill231_2;
    java.io.File spill231_3;
    java.io.File spill231_4;
    java.io.File spill231_5;
    java.lang.String spill231_6;
    long life1_3;
    java.lang.String life4_10;
    int life5_12;
    int life3_13;
    java.io.File life6_27;
    forest_join_36: {
    life1_3 = (__fieldRead231_0() ^ 12912304597807L);
    spill231_0 = __call231_1();
    spill231_1 = __fieldRead231_2();
    java.util.Date __stackOp231_4_0 = __sourceUninitializedNEW231_3();
    spill231_2 = __stackOp231_4_0;
    __explicitNewInit231_5(__stackOp231_4_0);
    life4_10 = __call231_6(spill231_1, spill231_2);
    life5_12 = 1;
    life3_13 = __integerCategory231_7(spill231_0);
    forest_cycle_14: while (true) {
    forest_join_35: {
    forest_join_34: {
    forest_join_25: {
    forest_join_23: {
    java.io.File __stackOp231_9_0 = __sourceUninitializedNEW231_8();
    spill231_3 = __stackOp231_9_0;
    spill231_4 = __stackOp231_9_0;
    spill231_5 = p0;
    spill231_6 = life4_10;
    if (!((life5_12 == 1))) {
        forestValue231_23_0 = spill231_3;
        forestValue231_23_1 = spill231_4;
        forestValue231_23_2 = spill231_5;
        forestValue231_23_3 = spill231_6;
        break forest_join_23;
    }
    forestValue231_25_0 = spill231_3;
    forestValue231_25_1 = spill231_4;
    forestValue231_25_2 = spill231_5;
    forestValue231_25_3 = spill231_6;
    forestValue231_25_4 = "";
    break forest_join_25;
    }
    forestValue231_25_0 = forestValue231_23_0;
    forestValue231_25_1 = forestValue231_23_1;
    forestValue231_25_2 = forestValue231_23_2;
    forestValue231_25_3 = forestValue231_23_3;
    forestValue231_25_4 = __invokedynamic231_10(life5_12);
    }
    __explicitNewInit231_12(forestValue231_25_1, forestValue231_25_2, __invokedynamic231_11(forestValue231_25_3, forestValue231_25_4));
    life6_27 = forestValue231_25_0;
    if (!((life3_13 != 0))) {
        break forest_join_35;
    }
    if (!((!__call231_13(life6_27)))) {
        break forest_join_34;
    }
    break forest_join_36;
    }
    life5_12 += 1;
    }
    continue forest_cycle_14;
    }
    }
    return life6_27;
}
public static java.io.File h231_0(moom.Oo p0) throws Throwable {
    throw __call3023100_0(p0);
}
public static java.io.File h231_1(moom.Oo p0) throws Throwable {
    throw __call3023101_0(p0);
}
public static java.io.File h231_2(moom.Oo p0) throws Throwable {
    throw __call3023102_0(p0);
}
private static native long __fieldRead231_0() throws Throwable;
private static native boolean __call231_1() throws Throwable;
private static native java.text.DateFormat __fieldRead231_2() throws Throwable;
private static native java.util.Date __sourceUninitializedNEW231_3() throws Throwable;
private static native void __explicitNewInit231_5(java.util.Date a0) throws Throwable;
private static native java.lang.String __call231_6(java.text.DateFormat a0, java.util.Date a1) throws Throwable;
private static native int __integerCategory231_7(boolean value) throws Throwable;
private static native java.io.File __sourceUninitializedNEW231_8() throws Throwable;
private static native java.lang.String __invokedynamic231_10(int a0) throws Throwable;
private static native java.lang.String __invokedynamic231_11(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __explicitNewInit231_12(java.io.File a0, java.io.File a1, java.lang.String a2) throws Throwable;
private static native boolean __call231_13(java.io.File a0) throws Throwable;
private static native java.lang.Exception __call3023100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3023101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3023102_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.util.IChatComponent __sourceHandlerCall_12843e6a713ade760856(java.io.File a0, java.lang.String a1, int a2, int a3, net.minecraft.client.shader.Framebuffer a4) throws E;
private static final class __SourceHandler_12843e6a713ade760856 {

public static net.minecraft.util.IChatComponent f232(java.io.File p0, java.lang.String p1, int p2, int p3, net.minecraft.client.shader.Framebuffer p4) throws Throwable {
    int forestValue232_35_0;
    int forestValue232_40_0;
    int forestValue232_42_0;
    int forestValue232_76_0;
    int forestValue232_88_0;
    java.nio.IntBuffer forestValue232_101_0;
    int forestValue232_118_0;
    int forestValue232_118_1;
    int forestValue232_150_0;
    int forestValue232_246_0;
    int forestValue232_257_0;
    java.io.File spill232_0;
    moom.ir spill232_1;
    boolean spill232_2;
    int spill232_3;
    int spill232_4;
    long spill232_5;
    java.nio.IntBuffer spill232_6;
    int spill232_7;
    int spill232_8;
    boolean spill232_9;
    java.awt.image.BufferedImage spill232_10;
    int spill232_11;
    java.awt.image.BufferedImage spill232_12;
    java.io.File spill232_13;
    moom.CM spill232_14;
    moom.CO spill232_15;
    moom.v2 spill232_16;
    moom.CN spill232_17;
    moom.CN spill232_18;
    java.lang.String spill232_19;
    java.lang.Object[] spill232_20;
    long life5_3;
    int life7_5;
    java.io.File life8_11;
    net.minecraft.client.Minecraft life9_16;
    int life10_19;
    moom.ir life11_24;
    int life12_27;
    int life13_29;
    int life14_45;
    int life15_94;
    java.lang.Object life16_187;
    java.awt.image.BufferedImage life16_198;
    int life17_204;
    int life18_206;
    int life19_214;
    java.io.File life17_279;
    java.io.File life17_290;
    moom.CM life18_301;
    forest_join_272: {
    forest_join_266: {
    forest_join_259: {
    forest_join_257: {
    forest_join_246: {
    forest_join_245: {
    forest_join_229: {
    forest_join_228: {
    forest_join_165: {
    forest_join_150: {
    forest_join_149: {
    forest_join_118: {
    forest_join_105: {
    forest_join_101: {
    forest_join_99: {
    forest_join_88: {
    forest_join_85: {
    forest_join_76: {
    forest_join_75: {
    forest_join_42: {
    forest_join_41: {
    forest_join_40: {
    forest_join_35: {
    life5_3 = (__fieldRead232_0() ^ 115637277588598L);
    life7_5 = __integerCategory232_2(__call232_1());
    java.io.File __stackOp232_4_0 = __sourceUninitializedNEW232_3();
    spill232_0 = __stackOp232_4_0;
    __explicitNewInit232_5(__stackOp232_4_0, p0, "screenshots");
    life8_11 = spill232_0;
    __call232_6(life8_11);
    life9_16 = __call232_7();
    life10_19 = __fieldRead232_9(__call232_8());
    moom.ir __stackOp232_11_0 = __sourceUninitializedNEW232_10();
    spill232_1 = __stackOp232_11_0;
    __explicitNewInit232_12(__stackOp232_11_0, life9_16);
    life11_24 = spill232_1;
    life12_27 = __call232_13(life11_24);
    life13_29 = __call232_14();
    spill232_2 = __call232_15();
    if (!((life7_5 == 0))) {
        forestValue232_35_0 = __integerCategory232_16(spill232_2);
        break forest_join_35;
    }
    if (!(spill232_2)) {
        break forest_join_41;
    }
    forestValue232_35_0 = life13_29;
    }
    if (!((life7_5 == 0))) {
        forestValue232_40_0 = forestValue232_35_0;
        break forest_join_40;
    }
    if (!((forestValue232_35_0 > 1))) {
        break forest_join_41;
    }
    forestValue232_40_0 = 1;
    }
    forestValue232_42_0 = forestValue232_40_0;
    break forest_join_42;
    }
    forestValue232_42_0 = 0;
    }
    life14_45 = forestValue232_42_0;
    spill232_3 = life14_45;
    if (!((life7_5 == 0))) {
        forestValue232_76_0 = spill232_3;
        break forest_join_76;
    }
    if (!((spill232_3 != 0))) {
        break forest_join_75;
    }
    __fieldWrite232_18(__call232_17(), (life12_27 * life13_29));
    spill232_4 = 27236;
    __call232_19((p2 * life13_29), (p3 * life13_29));
    spill232_5 = (2003196550927926370L ^ life5_3);
    __call232_20();
    __call232_22(__invokedynamic232_21(spill232_4, spill232_5));
    __call232_24(__call232_23(life9_16), 1);
    __call232_28(__fieldRead232_25(life9_16), __fieldRead232_26(), __call232_27());
    }
    forestValue232_76_0 = __integerCategory232_30(__call232_29());
    }
    if (!((life7_5 == 0))) {
        forestValue232_88_0 = forestValue232_76_0;
        break forest_join_88;
    }
    if (!((forestValue232_76_0 != 0))) {
        break forest_join_85;
    }
    p2 = __fieldRead232_31(p4);
    p3 = __fieldRead232_32(p4);
    }
    forestValue232_88_0 = (p2 * p3);
    }
    life15_94 = forestValue232_88_0;
    spill232_6 = __fieldRead232_33();
    if (!((life7_5 == 0))) {
        forestValue232_101_0 = spill232_6;
        break forest_join_101;
    }
    if (!((spill232_6 != null))) {
        break forest_join_99;
    }
    spill232_7 = __call232_35(__fieldRead232_34());
    spill232_8 = life15_94;
    if (!((life7_5 == 0))) {
        forestValue232_118_0 = spill232_7;
        forestValue232_118_1 = spill232_8;
        break forest_join_118;
    }
    if (!((spill232_7 < spill232_8))) {
        break forest_join_105;
    }
    }
    forestValue232_101_0 = __call232_36(life15_94);
    }
    __fieldWrite232_37(forestValue232_101_0);
    __fieldWrite232_38(new int[life15_94]);
    }
    __call232_40(__invokedynamic232_39(24076, (6834701848222298124L ^ life5_3)), 1);
    forestValue232_118_0 = __invokedynamic232_41(11343, (5412669847938957898L ^ life5_3));
    forestValue232_118_1 = 1;
    }
    __call232_42(forestValue232_118_0, forestValue232_118_1);
    __call232_44(__fieldRead232_43());
    spill232_9 = __call232_45();
    if (!((life7_5 == 0))) {
        forestValue232_150_0 = __integerCategory232_46(spill232_9);
        break forest_join_150;
    }
    if (!(spill232_9)) {
        break forest_join_149;
    }
    __call232_48(__fieldRead232_47(p4));
    __call232_53(__invokedynamic232_49(2310, (595587292303369989L ^ life5_3)), 0, __invokedynamic232_50(6698, (1916406740917629997L ^ life5_3)), __invokedynamic232_51(29831, (2592841051807668869L ^ life5_3)), __fieldRead232_52());
    if (!((life7_5 != 0))) {
        break forest_join_165;
    }
    }
    forestValue232_150_0 = 0;
    }
    __call232_57(forestValue232_150_0, 0, p2, p3, __invokedynamic232_54(11596, (4692445681803395917L ^ life5_3)), __invokedynamic232_55(4294, (8121984214080437954L ^ life5_3)), __fieldRead232_56());
    }
    __call232_60(__fieldRead232_58(), __fieldRead232_59());
    __call232_62(__fieldRead232_61(), p2, p3);
    life16_187 = null;
    if (!(__call232_63())) {
        break forest_join_229;
    }
    java.awt.image.BufferedImage __stackOp232_65_0 = __sourceUninitializedNEW232_64();
    spill232_10 = __stackOp232_65_0;
    __explicitNewInit232_68(__stackOp232_65_0, __fieldRead232_66(p4), __fieldRead232_67(p4), 1);
    life16_198 = spill232_10;
    life17_204 = (__fieldRead232_69(p4) - __fieldRead232_70(p4));
    life18_206 = life17_204;
    forest_cycle_194: while (true) {
    forest_join_226: {
    forest_join_225: {
    if (!((life18_206 < __fieldRead232_71(p4)))) {
        break forest_join_228;
    }
    spill232_11 = 0;
    if (!((life7_5 == 0))) {
        forestValue232_246_0 = spill232_11;
        break forest_join_246;
    }
    life19_214 = spill232_11;
    forest_cycle_202: while (true) {
    if (!((life19_214 < __fieldRead232_72(p4)))) {
        break forest_join_225;
    }
    __call232_75(life16_198, life19_214, (life18_206 - life17_204), (__fieldRead232_73())[((life18_206 * __fieldRead232_74(p4)) + life19_214)]);
    life19_214 += 1;
    if (!((life7_5 == 0))) {
        break forest_join_226;
    }
    if (!((life7_5 != 0))) {
        continue forest_cycle_202;
    }
    break forest_cycle_202;
    }
    }
    life18_206 += 1;
    }
    if (!((life7_5 != 0))) {
        continue forest_cycle_194;
    }
    break forest_cycle_194;
    }
    }
    break forest_join_245;
    }
    java.awt.image.BufferedImage __stackOp232_77_0 = __sourceUninitializedNEW232_76();
    spill232_12 = __stackOp232_77_0;
    __explicitNewInit232_78(__stackOp232_77_0, p2, p3, 1);
    life16_198 = spill232_12;
    __call232_80(life16_198, 0, 0, p2, p3, __fieldRead232_79(), 0, p2);
    }
    forestValue232_246_0 = life14_45;
    }
    if (!((life7_5 == 0))) {
        forestValue232_257_0 = forestValue232_246_0;
        break forest_join_257;
    }
    if (!((forestValue232_246_0 != 0))) {
        break forest_join_259;
    }
    __call232_82(__call232_81(life9_16));
    __call232_83();
    __fieldWrite232_85(__call232_84(), life10_19);
    forestValue232_257_0 = p2;
    }
    __call232_86(forestValue232_257_0, p3);
    }
    if (!((p1 == null))) {
        break forest_join_266;
    }
    life17_279 = __call232_87(life8_11);
    if (!((life7_5 != 0))) {
        break forest_join_272;
    }
    }
    java.io.File __stackOp232_89_0 = __sourceUninitializedNEW232_88();
    spill232_13 = __stackOp232_89_0;
    __explicitNewInit232_90(__stackOp232_89_0, life8_11, p1);
    life17_279 = spill232_13;
    }
    life17_290 = __call232_91(life17_279);
    __call232_92(life16_198, "png", life17_290);
    moom.CM __stackOp232_94_0 = __sourceUninitializedNEW232_93();
    spill232_14 = __stackOp232_94_0;
    __explicitNewInit232_96(__stackOp232_94_0, __call232_95(life17_290));
    life18_301 = spill232_14;
    spill232_15 = __call232_97(life18_301);
    moom.v2 __stackOp232_99_0 = __sourceUninitializedNEW232_98();
    spill232_16 = __stackOp232_99_0;
    __explicitNewInit232_102(__stackOp232_99_0, __fieldRead232_100(), __call232_101(life17_290));
    __call232_103(spill232_15, spill232_16);
    __call232_106(__call232_104(life18_301), __fieldRead232_105());
    moom.CN __stackOp232_108_0 = __sourceUninitializedNEW232_107();
    spill232_17 = __stackOp232_108_0;
    spill232_18 = __stackOp232_108_0;
    spill232_19 = "screenshot.success";
    java.lang.Object[] __stackOp232_109_0 = new java.lang.Object[1];
    spill232_20 = __stackOp232_109_0;
    (__stackOp232_109_0)[0] = life18_301;
    __explicitNewInit232_110(spill232_18, spill232_19, spill232_20);
    return spill232_17;
}
public static net.minecraft.util.IChatComponent h232_0(java.lang.Exception p0) throws Throwable {
    throw __call3023200_0(p0);
}
public static net.minecraft.util.IChatComponent h232_1(java.lang.Exception p0) throws Throwable {
    throw __call3023201_0(p0);
}
public static net.minecraft.util.IChatComponent h232_2(java.lang.Exception p0) throws Throwable {
    throw __call3023202_0(p0);
}
public static net.minecraft.util.IChatComponent h232_3(java.lang.Exception p0) throws Throwable {
    throw __call3023203_0(p0);
}
public static net.minecraft.util.IChatComponent h232_4(java.lang.Exception p0) throws Throwable {
    throw __call3023204_0(p0);
}
public static net.minecraft.util.IChatComponent h232_5(java.lang.Exception p0) throws Throwable {
    throw __call3023205_0(p0);
}
public static net.minecraft.util.IChatComponent h232_6(java.lang.Exception p0) throws Throwable {
    throw __call3023206_0(p0);
}
public static net.minecraft.util.IChatComponent h232_7(java.lang.Exception p0) throws Throwable {
    throw __call3023207_0(p0);
}
public static net.minecraft.util.IChatComponent h232_8(java.lang.Exception p0) throws Throwable {
    throw __call3023208_0(p0);
}
public static net.minecraft.util.IChatComponent h232_9(java.lang.Exception p0) throws Throwable {
    throw __call3023209_0(p0);
}
public static net.minecraft.util.IChatComponent h232_10(java.lang.Exception p0) throws Throwable {
    throw __call3023210_0(p0);
}
public static net.minecraft.util.IChatComponent h232_11(java.lang.Exception p0) throws Throwable {
    throw __call3023211_0(p0);
}
public static net.minecraft.util.IChatComponent h232_12(java.lang.Exception p0) throws Throwable {
    throw __call3023212_0(p0);
}
public static net.minecraft.util.IChatComponent h232_13(java.lang.Exception p0) throws Throwable {
    throw __call3023213_0(p0);
}
public static net.minecraft.util.IChatComponent h232_14(java.lang.Exception p0) throws Throwable {
    throw __call3023214_0(p0);
}
public static net.minecraft.util.IChatComponent h232_15(java.lang.Exception p0) throws Throwable {
    throw __call3023215_0(p0);
}
public static net.minecraft.util.IChatComponent h232_16(java.lang.Exception p0) throws Throwable {
    moom.CN spill3023216_0;
    moom.CN spill3023216_1;
    java.lang.String spill3023216_2;
    java.lang.Object[] spill3023216_3;
    java.lang.Exception life1_2;
    life1_2 = p0;
    __call3023216_1(__fieldRead3023216_0(), "Couldn't save screenshot", life1_2);
    moom.CN __stackOp3023216_3_0 = __sourceUninitializedNEW3023216_2();
    spill3023216_0 = __stackOp3023216_3_0;
    spill3023216_1 = __stackOp3023216_3_0;
    spill3023216_2 = "screenshot.failure";
    java.lang.Object[] __stackOp3023216_4_0 = new java.lang.Object[1];
    spill3023216_3 = __stackOp3023216_4_0;
    (__stackOp3023216_4_0)[0] = __call3023216_5(life1_2);
    __explicitNewInit3023216_6(spill3023216_1, spill3023216_2, spill3023216_3);
    return spill3023216_0;
}
private static native long __fieldRead232_0() throws Throwable;
private static native boolean __call232_1() throws Throwable;
private static native int __integerCategory232_2(boolean value) throws Throwable;
private static native java.io.File __sourceUninitializedNEW232_3() throws Throwable;
private static native void __explicitNewInit232_5(java.io.File a0, java.io.File a1, java.lang.String a2) throws Throwable;
private static native boolean __call232_6(java.io.File a0) throws Throwable;
private static native net.minecraft.client.Minecraft __call232_7() throws Throwable;
private static native net.minecraft.client.settings.GameSettings __call232_8() throws Throwable;
private static native int __fieldRead232_9(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native moom.ir __sourceUninitializedNEW232_10() throws Throwable;
private static native void __explicitNewInit232_12(moom.ir a0, net.minecraft.client.Minecraft a1) throws Throwable;
private static native int __call232_13(moom.ir a0) throws Throwable;
private static native int __call232_14() throws Throwable;
private static native boolean __call232_15() throws Throwable;
private static native int __integerCategory232_16(boolean value) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __call232_17() throws Throwable;
private static native void __fieldWrite232_18(net.minecraft.client.settings.GameSettings a0, int a1) throws Throwable;
private static native void __call232_19(int a0, int a1) throws Throwable;
private static native void __call232_20() throws Throwable;
private static native int __invokedynamic232_21(int a0, long a1) throws Throwable;
private static native void __call232_22(int a0) throws Throwable;
private static native net.minecraft.client.shader.Framebuffer __call232_23(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call232_24(net.minecraft.client.shader.Framebuffer a0, int a1) throws Throwable;
private static native net.minecraft.client.renderer.EntityRenderer __fieldRead232_25(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead232_26() throws Throwable;
private static native long __call232_27() throws Throwable;
private static native void __call232_28(net.minecraft.client.renderer.EntityRenderer a0, float a1, long a2) throws Throwable;
private static native boolean __call232_29() throws Throwable;
private static native int __integerCategory232_30(boolean value) throws Throwable;
private static native int __fieldRead232_31(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native int __fieldRead232_32(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native java.nio.IntBuffer __fieldRead232_33() throws Throwable;
private static native java.nio.IntBuffer __fieldRead232_34() throws Throwable;
private static native int __call232_35(java.nio.IntBuffer a0) throws Throwable;
private static native java.nio.IntBuffer __call232_36(int a0) throws Throwable;
private static native void __fieldWrite232_37(java.nio.IntBuffer a0) throws Throwable;
private static native void __fieldWrite232_38(int[] a0) throws Throwable;
private static native int __invokedynamic232_39(int a0, long a1) throws Throwable;
private static native void __call232_40(int a0, int a1) throws Throwable;
private static native int __invokedynamic232_41(int a0, long a1) throws Throwable;
private static native void __call232_42(int a0, int a1) throws Throwable;
private static native java.nio.IntBuffer __fieldRead232_43() throws Throwable;
private static native java.nio.IntBuffer __call232_44(java.nio.IntBuffer a0) throws Throwable;
private static native boolean __call232_45() throws Throwable;
private static native int __integerCategory232_46(boolean value) throws Throwable;
private static native int __fieldRead232_47(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native void __call232_48(int a0) throws Throwable;
private static native int __invokedynamic232_49(int a0, long a1) throws Throwable;
private static native int __invokedynamic232_50(int a0, long a1) throws Throwable;
private static native int __invokedynamic232_51(int a0, long a1) throws Throwable;
private static native java.nio.IntBuffer __fieldRead232_52() throws Throwable;
private static native void __call232_53(int a0, int a1, int a2, int a3, java.nio.IntBuffer a4) throws Throwable;
private static native int __invokedynamic232_54(int a0, long a1) throws Throwable;
private static native int __invokedynamic232_55(int a0, long a1) throws Throwable;
private static native java.nio.IntBuffer __fieldRead232_56() throws Throwable;
private static native void __call232_57(int a0, int a1, int a2, int a3, int a4, int a5, java.nio.IntBuffer a6) throws Throwable;
private static native java.nio.IntBuffer __fieldRead232_58() throws Throwable;
private static native int[] __fieldRead232_59() throws Throwable;
private static native java.nio.IntBuffer __call232_60(java.nio.IntBuffer a0, int[] a1) throws Throwable;
private static native int[] __fieldRead232_61() throws Throwable;
private static native void __call232_62(int[] a0, int a1, int a2) throws Throwable;
private static native boolean __call232_63() throws Throwable;
private static native java.awt.image.BufferedImage __sourceUninitializedNEW232_64() throws Throwable;
private static native int __fieldRead232_66(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native int __fieldRead232_67(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native void __explicitNewInit232_68(java.awt.image.BufferedImage a0, int a1, int a2, int a3) throws Throwable;
private static native int __fieldRead232_69(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native int __fieldRead232_70(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native int __fieldRead232_71(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native int __fieldRead232_72(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native int[] __fieldRead232_73() throws Throwable;
private static native int __fieldRead232_74(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native void __call232_75(java.awt.image.BufferedImage a0, int a1, int a2, int a3) throws Throwable;
private static native java.awt.image.BufferedImage __sourceUninitializedNEW232_76() throws Throwable;
private static native void __explicitNewInit232_78(java.awt.image.BufferedImage a0, int a1, int a2, int a3) throws Throwable;
private static native int[] __fieldRead232_79() throws Throwable;
private static native void __call232_80(java.awt.image.BufferedImage a0, int a1, int a2, int a3, int a4, int[] a5, int a6, int a7) throws Throwable;
private static native net.minecraft.client.shader.Framebuffer __call232_81(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call232_82(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native void __call232_83() throws Throwable;
private static native net.minecraft.client.settings.GameSettings __call232_84() throws Throwable;
private static native void __fieldWrite232_85(net.minecraft.client.settings.GameSettings a0, int a1) throws Throwable;
private static native void __call232_86(int a0, int a1) throws Throwable;
private static native java.io.File __call232_87(java.io.File a0) throws Throwable;
private static native java.io.File __sourceUninitializedNEW232_88() throws Throwable;
private static native void __explicitNewInit232_90(java.io.File a0, java.io.File a1, java.lang.String a2) throws Throwable;
private static native java.io.File __call232_91(java.io.File a0) throws Throwable;
private static native boolean __call232_92(java.awt.image.BufferedImage a0, java.lang.String a1, java.io.File a2) throws Throwable;
private static native moom.CM __sourceUninitializedNEW232_93() throws Throwable;
private static native java.lang.String __call232_95(java.io.File a0) throws Throwable;
private static native void __explicitNewInit232_96(moom.CM a0, java.lang.String a1) throws Throwable;
private static native moom.CO __call232_97(moom.CM a0) throws Throwable;
private static native moom.v2 __sourceUninitializedNEW232_98() throws Throwable;
private static native net.minecraft.event.ClickEvent$Action __fieldRead232_100() throws Throwable;
private static native java.lang.String __call232_101(java.io.File a0) throws Throwable;
private static native void __explicitNewInit232_102(moom.v2 a0, net.minecraft.event.ClickEvent$Action a1, java.lang.String a2) throws Throwable;
private static native moom.CO __call232_103(moom.CO a0, moom.v2 a1) throws Throwable;
private static native moom.CO __call232_104(moom.CM a0) throws Throwable;
private static native java.lang.Boolean __fieldRead232_105() throws Throwable;
private static native moom.CO __call232_106(moom.CO a0, java.lang.Boolean a1) throws Throwable;
private static native moom.CN __sourceUninitializedNEW232_107() throws Throwable;
private static native void __explicitNewInit232_110(moom.CN a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.Exception __call3023200_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3023201_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3023202_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3023203_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3023204_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3023205_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3023206_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3023207_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3023208_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3023209_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3023210_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3023211_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3023212_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3023213_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3023214_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3023215_0(java.lang.Exception a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3023216_0() throws Throwable;
private static native void __call3023216_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Exception a2) throws Throwable;
private static native moom.CN __sourceUninitializedNEW3023216_2() throws Throwable;
private static native java.lang.String __call3023216_5(java.lang.Exception a0) throws Throwable;
private static native void __explicitNewInit3023216_6(moom.CN a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;

}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 10555;
      if (g[var3] == null) {
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
         long var5 = f[var3];
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
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/DG", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4165_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/DG"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.DG.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public static net.minecraft.util.IChatComponent a(java.io.File p0, int p1, int p2, net.minecraft.client.shader.Framebuffer p3) {
return moom.DG.a(((java.io.File)(p0)), ((java.lang.String)(null)), ((int)(p1)), ((int)(p2)), ((net.minecraft.client.shader.Framebuffer)(p3)));
}


public static net.minecraft.util.IChatComponent a(java.io.File p0, java.lang.String p1, int p2, int p3, net.minecraft.client.shader.Framebuffer p4) { return __sourceHandlerCall_12843e6a713ade760856(p0, p1, p2, p3, p4); }


private static java.io.File a(java.io.File p0) { return __sourceHandlerCall_fc87501e1210cda5f782(p0); }


private static void a(int p0, int p1) { __sourceHandlerCall_56200bd98af7a4277553(p0, p1); }


private static void a() { __sourceHandlerCall_ffb88f1eb91ca8d13b58(); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4165_0() throws E;
}
