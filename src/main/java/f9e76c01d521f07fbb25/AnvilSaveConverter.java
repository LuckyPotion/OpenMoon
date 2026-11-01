package net.minecraft.world.chunk.storage;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class AnvilSaveConverter extends net.minecraft.world.storage.SaveFormatOld {

private static org.apache.logging.log4j.Logger c;

private static long d;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

public AnvilSaveConverter(java.io.File p0) {
super(p0);
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-1340596395760434711L)), ((long)(-2464750437434536735L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(117704771310589L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.world.chunk.storage.AnvilSaveConverter.d ^ 80108316068529L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1948_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1948_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1948_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1948_14 = new byte[8];
    (__sourceSpill1948_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1948_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1948_16 = __sourceSpill1948_14;
    ((javax.crypto.Cipher)(__sourceSpill1948_11)).init(((int)(__sourceSpill1948_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1948_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1948_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "É\t-Ëz\033\004»\0355\003O;ÇÆ]@®\027>Ó &4&'ºáæ\")ÿNÿ\035,A°ô=ÏN"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1948_25 = local6_life21;
        int __sourceSpill1948_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1948_25)).substring(((int)(__sourceSpill1948_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1948_30 = local8_life19;
        int __sourceSpill1948_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1948_33 = new byte[8];
        (__sourceSpill1948_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1948_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1948_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1948_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1948_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1948_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1948_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1948_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1948_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1948_34)).doFinal(((byte[])(__sourceSpill1948_33)));
        (__sourceSpill1948_30)[__sourceSpill1948_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "þ½ÃÂKVºg`âãá²­"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1948_38 = local6_life21;
        int __sourceSpill1948_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1948_38)).substring(((int)(__sourceSpill1948_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1948_43 = local8_life19;
        int __sourceSpill1948_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1948_46 = new byte[8];
        (__sourceSpill1948_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1948_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1948_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1948_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1948_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1948_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1948_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1948_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1948_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1948_47)).doFinal(((byte[])(__sourceSpill1948_46)));
        (__sourceSpill1948_43)[__sourceSpill1948_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[8]));
    c = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}

private static native <E extends Throwable> void __sourceHandlerCall_da2e79181883c39cbc17(net.minecraft.world.chunk.storage.AnvilSaveConverter a0, java.io.File a1, java.io.File a2, net.minecraft.world.biome.WorldChunkManager a3, int a4, int a5, net.minecraft.util.IProgressUpdate a6) throws E;
private static final class __SourceHandler_da2e79181883c39cbc17 {

public static void f727(net.minecraft.world.chunk.storage.AnvilSaveConverter receiver, java.io.File p0, java.io.File p1, net.minecraft.world.biome.WorldChunkManager p2, int p3, int p4, net.minecraft.util.IProgressUpdate p5) throws Throwable {
    int lexicalValue727_66_0;
    moom.Fv lexicalValue727_70_0;
    int lexicalValue727_70_1;
    int lexicalValue727_70_2;
    java.io.DataInputStream lexicalValue727_82_0;
    int lexicalValue727_175_0;
    boolean spill727_0;
    moom.Fv spill727_1;
    int spill727_2;
    int spill727_3;
    java.io.DataInputStream spill727_4;
    long life7_3;
    int life9_5;
    java.lang.String life10_8;
    moom.Fv life11_13;
    moom.Fv life12_30;
    int life13_32;
    int life14_43;
    java.io.DataInputStream life15_86;
    net.minecraft.nbt.NBTTagCompound life16_107;
    net.minecraft.nbt.NBTTagCompound life17_113;
    moom.Fr life18_116;
    net.minecraft.nbt.NBTTagCompound life19_120;
    net.minecraft.nbt.NBTTagCompound life20_124;
    java.io.DataOutputStream life21_137;
    int life15_199;
    lexical_join_191: {
    lexical_join_187: {
    life7_3 = (__fieldRead727_0() ^ 88537913939669L);
    life9_5 = __call727_1();
    life10_8 = __call727_2(p1);
    life11_13 = new moom.Fv(p1);
    life12_30 = new moom.Fv(new java.io.File(p0, __invokedynamic727_6(__call727_5(life10_8, 0, (__call727_3(life10_8) - __call727_4(".mcr"))))));
    life13_32 = 0;
    lexical_cycle_33: while (true) {
    lexical_join_185: {
    lexical_join_184: {
    lexical_join_175: {
    lexical_join_122: {
    if (!((life13_32 < __invokedynamic727_7(5102, (4913663996988648834L ^ life7_3))))) {
        break lexical_join_187;
    }
    if (!((life9_5 != 0))) {
        break lexical_join_191;
    }
    life14_43 = 0;
    lexical_cycle_44: while (true) {
    lexical_join_119: {
    lexical_join_82: {
    lexical_join_81: {
    lexical_join_70: {
    lexical_join_66: {
    if (!((life14_43 < __invokedynamic727_8(6827, (8771734672835962054L ^ life7_3))))) {
        break lexical_join_122;
    }
    spill727_0 = __call727_9(life11_13, life13_32, life14_43);
    if (!((life9_5 != 0))) {
        lexicalValue727_175_0 = __integerCategory727_10(spill727_0);
        break lexical_join_175;
    }
    if (!((life9_5 != 0))) {
        lexicalValue727_66_0 = __integerCategory727_11(spill727_0);
        break lexical_join_66;
    }
    if (!(spill727_0)) {
        break lexical_join_119;
    }
    spill727_1 = life12_30;
    spill727_2 = life13_32;
    spill727_3 = life14_43;
    if (!((life9_5 != 0))) {
        lexicalValue727_70_0 = spill727_1;
        lexicalValue727_70_1 = spill727_2;
        lexicalValue727_70_2 = spill727_3;
        break lexical_join_70;
    }
    lexicalValue727_66_0 = __integerCategory727_13(__call727_12(spill727_1, spill727_2, spill727_3));
    }
    if (!((lexicalValue727_66_0 == 0))) {
        break lexical_join_119;
    }
    lexicalValue727_70_0 = life11_13;
    lexicalValue727_70_1 = life13_32;
    lexicalValue727_70_2 = life14_43;
    }
    life15_86 = __call727_14(lexicalValue727_70_0, lexicalValue727_70_1, lexicalValue727_70_2);
    spill727_4 = life15_86;
    if (!((life9_5 != 0))) {
        lexicalValue727_82_0 = spill727_4;
        break lexical_join_82;
    }
    if (!((spill727_4 == null))) {
        break lexical_join_81;
    }
    __call727_16(__fieldRead727_15(), "Failed to fetch input stream");
    if (!((life9_5 == 0))) {
        break lexical_join_119;
    }
    }
    lexicalValue727_82_0 = life15_86;
    }
    life16_107 = __call727_17(lexicalValue727_82_0);
    __call727_18(life15_86);
    life17_113 = __call727_19(life16_107, "Level");
    life18_116 = __call727_20(life17_113);
    life19_120 = new net.minecraft.nbt.NBTTagCompound();
    life20_124 = new net.minecraft.nbt.NBTTagCompound();
    __call727_21(life19_120, "Level", life20_124);
    __call727_22(life18_116, life20_124, p2);
    life21_137 = __call727_23(life12_30, life13_32, life14_43);
    __call727_24(life19_120, life21_137);
    __call727_25(life21_137);
    }
    life14_43 += 1;
    if (!((life9_5 == 0))) { continue lexical_cycle_44; }
    break lexical_cycle_44;
    }
    }
    life14_43 = ((int) __call727_28(((0x1.9p6d * ((double) (p3 * __invokedynamic727_26(7384, (5029445084210389686L ^ life7_3))))) / ((double) (p4 * __invokedynamic727_27(19502, (5677847374599533125L ^ life7_3)))))));
    lexicalValue727_175_0 = ((int) __call727_32(((0x1.9p6d * ((double) (((life13_32 + 1) * __invokedynamic727_29(6827, (8771734672835962054L ^ life7_3))) + (p3 * __invokedynamic727_30(19502, (5677847374599533125L ^ life7_3)))))) / ((double) (p4 * __invokedynamic727_31(19502, (5677847374599533125L ^ life7_3)))))));
    }
    life15_199 = lexicalValue727_175_0;
    if (!((life9_5 != 0))) {
        break lexical_join_185;
    }
    if (!((life15_199 > life14_43))) {
        break lexical_join_184;
    }
    __call727_33(p5, life15_199);
    }
    life13_32 += 1;
    }
    if (!((life9_5 == 0))) { continue lexical_cycle_33; }
    break lexical_cycle_33;
    }
    }
    __call727_34(life11_13);
    __call727_35(life12_30);
    }
    return;
}
public static void h727_0(java.io.IOException p0) throws Throwable {
    throw __call2072700_0(p0);
}
public static void h727_1(java.io.IOException p0) throws Throwable {
    throw __call2072701_0(p0);
}
public static void h727_2(java.io.IOException p0) throws Throwable {
    throw __call2072702_0(p0);
}
public static void h727_3(java.io.IOException p0) throws Throwable {
    throw __call2072703_0(p0);
}
public static void h727_4(java.io.IOException p0) throws Throwable {
    throw __call2072704_0(p0);
}
public static void h727_5(java.io.IOException p0) throws Throwable {
    throw __call2072705_0(p0);
}
public static void h727_6(java.io.IOException p0) throws Throwable {
    throw __call2072706_0(p0);
}
public static void h727_7(java.io.IOException p0) throws Throwable {
    throw __call2072707_0(p0);
}
public static void h727_8(java.io.IOException p0) throws Throwable {
    throw __call2072708_0(p0);
}
public static void h727_9(java.io.IOException p0) throws Throwable {
    throw __call2072709_0(p0);
}
public static void h727_10(java.io.IOException p0) throws Throwable {
    java.io.IOException local1 = p0;
    __call2072710_0(local1);
    return;
}
private static native long __fieldRead727_0() throws Throwable;
private static native int __call727_1() throws Throwable;
private static native java.lang.String __call727_2(java.io.File a0) throws Throwable;
private static native int __call727_3(java.lang.String a0) throws Throwable;
private static native int __call727_4(java.lang.String a0) throws Throwable;
private static native java.lang.String __call727_5(java.lang.String a0, int a1, int a2) throws Throwable;
private static native java.lang.String __invokedynamic727_6(java.lang.String a0) throws Throwable;
private static native int __invokedynamic727_7(int a0, long a1) throws Throwable;
private static native int __invokedynamic727_8(int a0, long a1) throws Throwable;
private static native boolean __call727_9(moom.Fv a0, int a1, int a2) throws Throwable;
private static native int __integerCategory727_10(boolean value) throws Throwable;
private static native int __integerCategory727_11(boolean value) throws Throwable;
private static native boolean __call727_12(moom.Fv a0, int a1, int a2) throws Throwable;
private static native int __integerCategory727_13(boolean value) throws Throwable;
private static native java.io.DataInputStream __call727_14(moom.Fv a0, int a1, int a2) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead727_15() throws Throwable;
private static native void __call727_16(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call727_17(java.io.DataInputStream a0) throws Throwable;
private static native void __call727_18(java.io.DataInputStream a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call727_19(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native moom.Fr __call727_20(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native void __call727_21(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, net.minecraft.nbt.NBTTagCompound a2) throws Throwable;
private static native void __call727_22(moom.Fr a0, net.minecraft.nbt.NBTTagCompound a1, net.minecraft.world.biome.WorldChunkManager a2) throws Throwable;
private static native java.io.DataOutputStream __call727_23(moom.Fv a0, int a1, int a2) throws Throwable;
private static native void __call727_24(net.minecraft.nbt.NBTTagCompound a0, java.io.DataOutputStream a1) throws Throwable;
private static native void __call727_25(java.io.DataOutputStream a0) throws Throwable;
private static native int __invokedynamic727_26(int a0, long a1) throws Throwable;
private static native int __invokedynamic727_27(int a0, long a1) throws Throwable;
private static native long __call727_28(double a0) throws Throwable;
private static native int __invokedynamic727_29(int a0, long a1) throws Throwable;
private static native int __invokedynamic727_30(int a0, long a1) throws Throwable;
private static native int __invokedynamic727_31(int a0, long a1) throws Throwable;
private static native long __call727_32(double a0) throws Throwable;
private static native void __call727_33(net.minecraft.util.IProgressUpdate a0, int a1) throws Throwable;
private static native void __call727_34(moom.Fv a0) throws Throwable;
private static native void __call727_35(moom.Fv a0) throws Throwable;
private static native java.lang.Exception __call2072700_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2072701_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2072702_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2072703_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2072704_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2072705_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2072706_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2072707_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2072708_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2072709_0(java.io.IOException a0) throws Throwable;
private static native void __call2072710_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_689b448b074939c788c3(net.minecraft.world.chunk.storage.AnvilSaveConverter a0, java.lang.String a1) throws E;
private static final class __SourceHandler_689b448b074939c788c3 {

public static void f1834(net.minecraft.world.chunk.storage.AnvilSaveConverter receiver, java.lang.String p0) throws Throwable {
    java.io.File forwardValue1834_28_0;
    java.io.File forwardValue1834_44_0;
    int spill1834_0;
    java.io.File spill1834_1;
    java.io.File spill1834_2;
    long life2_3;
    java.io.File life5_11;
    int life4_12;
    java.io.File life6_37;
    java.io.File life7_62;
    forward_join_52: {
    forward_join_44: {
    forward_join_39: {
    forward_join_28: {
    forward_join_23: {
    life2_3 = (__fieldRead1834_0() ^ 100493528173209L);
    spill1834_0 = __call1834_1();
    life5_11 = new java.io.File(__fieldRead1834_2(receiver), p0);
    life4_12 = spill1834_0;
    spill1834_1 = life5_11;
    if (!((life4_12 == 0))) {
        forwardValue1834_28_0 = spill1834_1;
        break forward_join_28;
    }
    if (!((!__call1834_3(spill1834_1)))) {
        break forward_join_23;
    }
    __call1834_5(__fieldRead1834_4(), "Unable to create level.dat_mcr backup");
    if (!((life4_12 != 0))) {
        break forward_join_52;
    }
    }
    forwardValue1834_28_0 = new java.io.File(life5_11, "level.dat");
    }
    life6_37 = forwardValue1834_28_0;
    spill1834_2 = life6_37;
    if (!((life4_12 == 0))) {
        forwardValue1834_44_0 = spill1834_2;
        break forward_join_44;
    }
    if (!((!__call1834_6(spill1834_2)))) {
        break forward_join_39;
    }
    __call1834_8(__fieldRead1834_7(), "Unable to create level.dat_mcr backup");
    if (!((life4_12 != 0))) {
        break forward_join_52;
    }
    }
    forwardValue1834_44_0 = new java.io.File(life5_11, "level.dat_mcr");
    }
    life7_62 = forwardValue1834_44_0;
    if (!((!__call1834_9(life6_37, life7_62)))) {
        break forward_join_52;
    }
    __call1834_11(__fieldRead1834_10(), "Unable to create level.dat_mcr backup");
    }
    return;
}
public static void h1834_0(moom.Oo p0) throws Throwable {
    throw __call1183400_0(p0);
}
public static void h1834_1(moom.Oo p0) throws Throwable {
    throw __call1183401_0(p0);
}
public static void h1834_2(moom.Oo p0) throws Throwable {
    throw __call1183402_0(p0);
}
public static void h1834_3(moom.Oo p0) throws Throwable {
    throw __call1183403_0(p0);
}
public static void h1834_4(moom.Oo p0) throws Throwable {
    throw __call1183404_0(p0);
}
public static void h1834_5(moom.Oo p0) throws Throwable {
    throw __call1183405_0(p0);
}
public static void h1834_6(moom.Oo p0) throws Throwable {
    throw __call1183406_0(p0);
}
private static native long __fieldRead1834_0() throws Throwable;
private static native int __call1834_1() throws Throwable;
private static native java.io.File __fieldRead1834_2(net.minecraft.world.chunk.storage.AnvilSaveConverter a0) throws Throwable;
private static native boolean __call1834_3(java.io.File a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead1834_4() throws Throwable;
private static native void __call1834_5(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native boolean __call1834_6(java.io.File a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead1834_7() throws Throwable;
private static native void __call1834_8(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native boolean __call1834_9(java.io.File a0, java.io.File a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead1834_10() throws Throwable;
private static native void __call1834_11(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1183400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1183401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1183402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1183403_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1183404_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1183405_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1183406_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_d26ef74d66b49be2a9e0(net.minecraft.world.chunk.storage.AnvilSaveConverter a0, java.lang.String a1, net.minecraft.util.IProgressUpdate a2) throws E;
private static final class __SourceHandler_d26ef74d66b49be2a9e0 {

public static boolean f728(net.minecraft.world.chunk.storage.AnvilSaveConverter receiver, java.lang.String p0, net.minecraft.util.IProgressUpdate p1) throws Throwable {
    int forestValue728_52_0;
    int forestValue728_67_0;
    int forestValue728_181_0;
    int spill728_0;
    boolean spill728_1;
    int spill728_2;
    long life3_3;
    int life5_8;
    java.util.ArrayList life6_10;
    java.util.ArrayList life7_12;
    java.util.ArrayList life8_14;
    java.io.File life9_21;
    java.io.File life10_27;
    java.io.File life11_33;
    int life12_71;
    net.minecraft.world.storage.WorldInfo life13_79;
    java.lang.Object life14_81;
    net.minecraft.world.biome.WorldChunkManager life14_91;
    net.minecraft.world.storage.ISaveHandler life15_177;
    forest_join_181: {
    forest_join_167: {
    forest_join_164: {
    forest_join_99: {
    forest_join_89: {
    forest_join_67: {
    forest_join_59: {
    forest_join_52: {
    forest_join_50: {
    life3_3 = (__fieldRead728_0() ^ 135329962743073L);
    spill728_0 = __call728_1();
    __call728_2(p1, 0);
    life5_8 = spill728_0;
    life6_10 = __call728_3();
    life7_12 = __call728_4();
    life8_14 = __call728_5();
    life9_21 = new java.io.File(__fieldRead728_6(receiver), p0);
    life10_27 = new java.io.File(life9_21, "DIM-1");
    life11_33 = new java.io.File(life9_21, "DIM1");
    __call728_8(__fieldRead728_7(), "Scanning folders...");
    __call728_9(receiver, life9_21, life6_10);
    spill728_1 = __call728_10(life10_27);
    if (!((life5_8 == 0))) {
        forestValue728_52_0 = __integerCategory728_11(spill728_1);
        break forest_join_52;
    }
    if (!(spill728_1)) {
        break forest_join_50;
    }
    __call728_12(receiver, life10_27, life7_12);
    }
    forestValue728_52_0 = __integerCategory728_14(__call728_13(life11_33));
    }
    if (!((life5_8 == 0))) {
        forestValue728_67_0 = forestValue728_52_0;
        break forest_join_67;
    }
    if (!((forestValue728_52_0 != 0))) {
        break forest_join_59;
    }
    __call728_15(receiver, life11_33, life8_14);
    }
    forestValue728_67_0 = ((__call728_16(life6_10) + __call728_17(life7_12)) + __call728_18(life8_14));
    }
    life12_71 = forestValue728_67_0;
    __call728_21(__fieldRead728_19(), __invokedynamic728_20(life12_71));
    life13_79 = __call728_22(receiver, p0);
    life14_81 = null;
    if (!((__call728_23(life13_79) == __fieldRead728_24()))) {
        break forest_join_89;
    }
    life14_91 = new moom.Fg(__fieldRead728_25(), 0x1.0p-1f);
    break forest_join_99;
    }
    life14_91 = new net.minecraft.world.biome.WorldChunkManager(__call728_26(life13_79), __call728_27(life13_79), __call728_28(life13_79));
    }
    __call728_29(receiver, new java.io.File(life9_21, "region"), life6_10, life14_91, 0, life12_71, p1);
    __call728_32(receiver, new java.io.File(life10_27, "region"), life7_12, new moom.Fg(__fieldRead728_30(), 0x0.0p0f), __call728_31(life6_10), life12_71, p1);
    __call728_36(receiver, new java.io.File(life11_33, "region"), life8_14, new moom.Fg(__fieldRead728_33(), 0x0.0p0f), (__call728_34(life6_10) + __call728_35(life7_12)), life12_71, p1);
    __call728_38(life13_79, __invokedynamic728_37(17711, (4060232500917090484L ^ life3_3)));
    if (!((life5_8 == 0))) {
        break forest_join_167;
    }
    if (!((__call728_39(life13_79) == __fieldRead728_40()))) {
        break forest_join_164;
    }
    __call728_42(life13_79, __fieldRead728_41());
    }
    __call728_43(receiver, p0);
    }
    life15_177 = __call728_44(receiver, p0, 0);
    __call728_45(life15_177, life13_79);
    spill728_2 = 1;
    if (!((life5_8 != 0))) {
        forestValue728_181_0 = spill728_2;
        break forest_join_181;
    }
    __call728_46(new java.lang.String[4]);
    forestValue728_181_0 = spill728_2;
    }
    return __integerCategory728_47(forestValue728_181_0);
}
public static boolean h728_0(moom.Oo p0) throws Throwable {
    throw __call3072800_0(p0);
}
public static boolean h728_1(moom.Oo p0) throws Throwable {
    throw __call3072801_0(p0);
}
public static boolean h728_2(moom.Oo p0) throws Throwable {
    throw __call3072802_0(p0);
}
public static boolean h728_3(moom.Oo p0) throws Throwable {
    throw __call3072803_0(p0);
}
public static boolean h728_4(moom.Oo p0) throws Throwable {
    throw __call3072804_0(p0);
}
public static boolean h728_5(moom.Oo p0) throws Throwable {
    throw __call3072805_0(p0);
}
public static boolean h728_6(moom.Oo p0) throws Throwable {
    throw __call3072806_0(p0);
}
private static native long __fieldRead728_0() throws Throwable;
private static native int __call728_1() throws Throwable;
private static native void __call728_2(net.minecraft.util.IProgressUpdate a0, int a1) throws Throwable;
private static native java.util.ArrayList __call728_3() throws Throwable;
private static native java.util.ArrayList __call728_4() throws Throwable;
private static native java.util.ArrayList __call728_5() throws Throwable;
private static native java.io.File __fieldRead728_6(net.minecraft.world.chunk.storage.AnvilSaveConverter a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead728_7() throws Throwable;
private static native void __call728_8(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native void __call728_9(net.minecraft.world.chunk.storage.AnvilSaveConverter a0, java.io.File a1, java.util.ArrayList a2) throws Throwable;
private static native boolean __call728_10(java.io.File a0) throws Throwable;
private static native int __integerCategory728_11(boolean value) throws Throwable;
private static native void __call728_12(net.minecraft.world.chunk.storage.AnvilSaveConverter a0, java.io.File a1, java.util.ArrayList a2) throws Throwable;
private static native boolean __call728_13(java.io.File a0) throws Throwable;
private static native int __integerCategory728_14(boolean value) throws Throwable;
private static native void __call728_15(net.minecraft.world.chunk.storage.AnvilSaveConverter a0, java.io.File a1, java.util.ArrayList a2) throws Throwable;
private static native int __call728_16(java.util.ArrayList a0) throws Throwable;
private static native int __call728_17(java.util.ArrayList a0) throws Throwable;
private static native int __call728_18(java.util.ArrayList a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead728_19() throws Throwable;
private static native java.lang.String __invokedynamic728_20(int a0) throws Throwable;
private static native void __call728_21(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call728_22(net.minecraft.world.chunk.storage.AnvilSaveConverter a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.world.WorldType __call728_23(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.world.WorldType __fieldRead728_24() throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __fieldRead728_25() throws Throwable;
private static native long __call728_26(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.world.WorldType __call728_27(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native java.lang.String __call728_28(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call728_29(net.minecraft.world.chunk.storage.AnvilSaveConverter a0, java.io.File a1, java.util.ArrayList a2, net.minecraft.world.biome.WorldChunkManager a3, int a4, int a5, net.minecraft.util.IProgressUpdate a6) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __fieldRead728_30() throws Throwable;
private static native int __call728_31(java.util.ArrayList a0) throws Throwable;
private static native void __call728_32(net.minecraft.world.chunk.storage.AnvilSaveConverter a0, java.io.File a1, java.util.ArrayList a2, moom.Fg a3, int a4, int a5, net.minecraft.util.IProgressUpdate a6) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __fieldRead728_33() throws Throwable;
private static native int __call728_34(java.util.ArrayList a0) throws Throwable;
private static native int __call728_35(java.util.ArrayList a0) throws Throwable;
private static native void __call728_36(net.minecraft.world.chunk.storage.AnvilSaveConverter a0, java.io.File a1, java.util.ArrayList a2, moom.Fg a3, int a4, int a5, net.minecraft.util.IProgressUpdate a6) throws Throwable;
private static native int __invokedynamic728_37(int a0, long a1) throws Throwable;
private static native void __call728_38(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native net.minecraft.world.WorldType __call728_39(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.world.WorldType __fieldRead728_40() throws Throwable;
private static native net.minecraft.world.WorldType __fieldRead728_41() throws Throwable;
private static native void __call728_42(net.minecraft.world.storage.WorldInfo a0, net.minecraft.world.WorldType a1) throws Throwable;
private static native void __call728_43(net.minecraft.world.chunk.storage.AnvilSaveConverter a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.world.storage.ISaveHandler __call728_44(net.minecraft.world.chunk.storage.AnvilSaveConverter a0, java.lang.String a1, int a2) throws Throwable;
private static native void __call728_45(net.minecraft.world.storage.ISaveHandler a0, net.minecraft.world.storage.WorldInfo a1) throws Throwable;
private static native void __call728_46(java.lang.String[] a0) throws Throwable;
private static native boolean __integerCategory728_47(int value) throws Throwable;
private static native java.lang.Exception __call3072800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3072801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3072802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3072803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3072804_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3072805_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3072806_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_2b5187529e31a90c2bad(net.minecraft.world.chunk.storage.AnvilSaveConverter a0) throws E;
private static final class __SourceHandler_2b5187529e31a90c2bad {

public static java.util.List f670006(net.minecraft.world.chunk.storage.AnvilSaveConverter receiver) throws Throwable {
    java.io.File lexicalValue670006_13_0;
    int lexicalValue670006_20_0;
    int lexicalValue670006_83_0;
    int lexicalValue670006_83_1;
    int lexicalValue670006_85_0;
    int lexicalValue670006_87_0;
    java.lang.String lexicalValue670006_97_0;
    java.io.File spill670006_0;
    boolean spill670006_1;
    int spill670006_2;
    int spill670006_3;
    int spill670006_4;
    int spill670006_5;
    int spill670006_6;
    java.lang.String spill670006_7;
    long life1_3;
    int life3_5;
    java.util.ArrayList life4_34;
    java.io.File[] life5_38;
    java.io.File[] life6_40;
    int life7_43;
    int life8_45;
    java.io.File life9_52;
    java.lang.String life10_63;
    net.minecraft.world.storage.WorldInfo life11_67;
    int life12_123;
    java.lang.String life13_126;
    long life14_141;
    lexical_join_123: {
    lexical_join_121: {
    lexical_join_20: {
    lexical_join_13: {
    life1_3 = (__fieldRead670006_0() ^ 63693313580751L);
    life3_5 = __call670006_1();
    spill670006_0 = __fieldRead670006_2(receiver);
    if (!((life3_5 != 0))) {
        lexicalValue670006_13_0 = spill670006_0;
        break lexical_join_13;
    }
    if (!((spill670006_0 != null))) {
        break lexical_join_123;
    }
    lexicalValue670006_13_0 = __fieldRead670006_3(receiver);
    }
    spill670006_1 = __call670006_4(lexicalValue670006_13_0);
    if (!((life3_5 != 0))) {
        lexicalValue670006_20_0 = __integerCategory670006_5(spill670006_1);
        break lexical_join_20;
    }
    if (!(spill670006_1)) {
        break lexical_join_123;
    }
    lexicalValue670006_20_0 = __integerCategory670006_8(__call670006_7(__fieldRead670006_6(receiver)));
    }
    if (!((lexicalValue670006_20_0 != 0))) {
        break lexical_join_123;
    }
    life4_34 = __call670006_9();
    life5_38 = __call670006_11(__fieldRead670006_10(receiver));
    life6_40 = life5_38;
    life7_43 = (life6_40).length;
    life8_45 = 0;
    lexical_cycle_34: while (true) {
    lexical_join_119: {
    lexical_join_118: {
    lexical_join_98: {
    lexical_join_97: {
    lexical_join_87: {
    lexical_join_86: {
    lexical_join_85: {
    lexical_join_83: {
    lexical_join_77: {
    if (!((life8_45 < life7_43))) {
        break lexical_join_121;
    }
    life9_52 = (life6_40)[life8_45];
    if (!((life3_5 != 0))) {
        break lexical_join_119;
    }
    if (!(__call670006_12(life9_52))) {
        break lexical_join_118;
    }
    life10_63 = __call670006_13(life9_52);
    life11_67 = __call670006_14(receiver, life10_63);
    if (!((life3_5 != 0))) {
        break lexical_join_119;
    }
    if (!((life11_67 != null))) {
        break lexical_join_118;
    }
    spill670006_2 = __call670006_15(life11_67);
    spill670006_3 = __invokedynamic670006_16(3873, (2449100501258910035L ^ life1_3));
    if (!((life3_5 != 0))) {
        lexicalValue670006_83_0 = spill670006_2;
        lexicalValue670006_83_1 = spill670006_3;
        break lexical_join_83;
    }
    if (!((spill670006_2 != spill670006_3))) {
        break lexical_join_77;
    }
    spill670006_4 = __call670006_17(life11_67);
    spill670006_5 = __invokedynamic670006_18(17711, (4060158941330895706L ^ life1_3));
    if (!((life3_5 != 0))) {
        lexicalValue670006_83_0 = spill670006_4;
        lexicalValue670006_83_1 = spill670006_5;
        break lexical_join_83;
    }
    if (!((spill670006_4 == spill670006_5))) {
        break lexical_join_118;
    }
    }
    spill670006_6 = __call670006_19(life11_67);
    if (!((life3_5 != 0))) {
        lexicalValue670006_85_0 = spill670006_6;
        break lexical_join_85;
    }
    lexicalValue670006_83_0 = spill670006_6;
    lexicalValue670006_83_1 = __call670006_20(receiver);
    }
    if (!((lexicalValue670006_83_0 != lexicalValue670006_83_1))) {
        break lexical_join_86;
    }
    lexicalValue670006_85_0 = 1;
    }
    lexicalValue670006_87_0 = lexicalValue670006_85_0;
    break lexical_join_87;
    }
    lexicalValue670006_87_0 = 0;
    }
    life12_123 = lexicalValue670006_87_0;
    life13_126 = __call670006_21(life11_67);
    spill670006_7 = life13_126;
    if (!((life3_5 != 0))) {
        lexicalValue670006_97_0 = spill670006_7;
        break lexical_join_97;
    }
    if (!(__call670006_22(spill670006_7))) {
        break lexical_join_98;
    }
    lexicalValue670006_97_0 = life10_63;
    }
    life13_126 = lexicalValue670006_97_0;
    }
    life14_141 = 0L;
    __call670006_28(life4_34, new moom.IQ(life10_63, life13_126, __call670006_23(life11_67), life14_141, __call670006_24(life11_67), __integerCategory670006_27(life12_123), __call670006_25(life11_67), __call670006_26(life11_67)));
    }
    life8_45 += 1;
    }
    if (!((life3_5 == 0))) { continue lexical_cycle_34; }
    break lexical_cycle_34;
    }
    }
    return life4_34;
    }
    throw new net.minecraft.client.AnvilConverterException("Unable to read or access folder where game worlds are saved!");
}
public static java.util.List h670006_0(net.minecraft.client.AnvilConverterException p0) throws Throwable {
    throw __call69000600_0(p0);
}
public static java.util.List h670006_1(net.minecraft.client.AnvilConverterException p0) throws Throwable {
    throw __call69000601_0(p0);
}
public static java.util.List h670006_2(net.minecraft.client.AnvilConverterException p0) throws Throwable {
    throw __call69000602_0(p0);
}
public static java.util.List h670006_3(net.minecraft.client.AnvilConverterException p0) throws Throwable {
    throw __call69000603_0(p0);
}
public static java.util.List h670006_4(net.minecraft.client.AnvilConverterException p0) throws Throwable {
    throw __call69000604_0(p0);
}
public static java.util.List h670006_5(net.minecraft.client.AnvilConverterException p0) throws Throwable {
    throw __call69000605_0(p0);
}
public static java.util.List h670006_6(net.minecraft.client.AnvilConverterException p0) throws Throwable {
    throw __call69000606_0(p0);
}
public static java.util.List h670006_7(net.minecraft.client.AnvilConverterException p0) throws Throwable {
    throw __call69000607_0(p0);
}
public static java.util.List h670006_8(net.minecraft.client.AnvilConverterException p0) throws Throwable {
    throw __call69000608_0(p0);
}
public static java.util.List h670006_9(net.minecraft.client.AnvilConverterException p0) throws Throwable {
    throw __call69000609_0(p0);
}
public static java.util.List h670006_10(net.minecraft.client.AnvilConverterException p0) throws Throwable {
    throw __call69000610_0(p0);
}
public static java.util.List h670006_11(net.minecraft.client.AnvilConverterException p0) throws Throwable {
    throw __call69000611_0(p0);
}
public static java.util.List h670006_12(net.minecraft.client.AnvilConverterException p0) throws Throwable {
    throw __call69000612_0(p0);
}
public static java.util.List h670006_13(net.minecraft.client.AnvilConverterException p0) throws Throwable {
    throw __call69000613_0(p0);
}
private static native long __fieldRead670006_0() throws Throwable;
private static native int __call670006_1() throws Throwable;
private static native java.io.File __fieldRead670006_2(net.minecraft.world.chunk.storage.AnvilSaveConverter a0) throws Throwable;
private static native java.io.File __fieldRead670006_3(net.minecraft.world.chunk.storage.AnvilSaveConverter a0) throws Throwable;
private static native boolean __call670006_4(java.io.File a0) throws Throwable;
private static native int __integerCategory670006_5(boolean value) throws Throwable;
private static native java.io.File __fieldRead670006_6(net.minecraft.world.chunk.storage.AnvilSaveConverter a0) throws Throwable;
private static native boolean __call670006_7(java.io.File a0) throws Throwable;
private static native int __integerCategory670006_8(boolean value) throws Throwable;
private static native java.util.ArrayList __call670006_9() throws Throwable;
private static native java.io.File __fieldRead670006_10(net.minecraft.world.chunk.storage.AnvilSaveConverter a0) throws Throwable;
private static native java.io.File[] __call670006_11(java.io.File a0) throws Throwable;
private static native boolean __call670006_12(java.io.File a0) throws Throwable;
private static native java.lang.String __call670006_13(java.io.File a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call670006_14(net.minecraft.world.chunk.storage.AnvilSaveConverter a0, java.lang.String a1) throws Throwable;
private static native int __call670006_15(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native int __invokedynamic670006_16(int a0, long a1) throws Throwable;
private static native int __call670006_17(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native int __invokedynamic670006_18(int a0, long a1) throws Throwable;
private static native int __call670006_19(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native int __call670006_20(net.minecraft.world.chunk.storage.AnvilSaveConverter a0) throws Throwable;
private static native java.lang.String __call670006_21(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native boolean __call670006_22(java.lang.String a0) throws Throwable;
private static native long __call670006_23(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __call670006_24(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native boolean __call670006_25(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native boolean __call670006_26(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native boolean __integerCategory670006_27(int value) throws Throwable;
private static native boolean __call670006_28(java.util.ArrayList a0, moom.IQ a1) throws Throwable;
private static native java.lang.Exception __call69000600_0(net.minecraft.client.AnvilConverterException a0) throws Throwable;
private static native java.lang.Exception __call69000601_0(net.minecraft.client.AnvilConverterException a0) throws Throwable;
private static native java.lang.Exception __call69000602_0(net.minecraft.client.AnvilConverterException a0) throws Throwable;
private static native java.lang.Exception __call69000603_0(net.minecraft.client.AnvilConverterException a0) throws Throwable;
private static native java.lang.Exception __call69000604_0(net.minecraft.client.AnvilConverterException a0) throws Throwable;
private static native java.lang.Exception __call69000605_0(net.minecraft.client.AnvilConverterException a0) throws Throwable;
private static native java.lang.Exception __call69000606_0(net.minecraft.client.AnvilConverterException a0) throws Throwable;
private static native java.lang.Exception __call69000607_0(net.minecraft.client.AnvilConverterException a0) throws Throwable;
private static native java.lang.Exception __call69000608_0(net.minecraft.client.AnvilConverterException a0) throws Throwable;
private static native java.lang.Exception __call69000609_0(net.minecraft.client.AnvilConverterException a0) throws Throwable;
private static native java.lang.Exception __call69000610_0(net.minecraft.client.AnvilConverterException a0) throws Throwable;
private static native java.lang.Exception __call69000611_0(net.minecraft.client.AnvilConverterException a0) throws Throwable;
private static native java.lang.Exception __call69000612_0(net.minecraft.client.AnvilConverterException a0) throws Throwable;
private static native java.lang.Exception __call69000613_0(net.minecraft.client.AnvilConverterException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_29819c01b51306300dd8(net.minecraft.world.chunk.storage.AnvilSaveConverter a0, java.lang.String a1) throws E;
private static final class __SourceHandler_29819c01b51306300dd8 {

public static boolean f1836(net.minecraft.world.chunk.storage.AnvilSaveConverter receiver, java.lang.String p0) throws Throwable {
    net.minecraft.world.storage.WorldInfo forwardValue1836_15_0;
    int forwardValue1836_25_0;
    int forwardValue1836_27_0;
    int spill1836_0;
    net.minecraft.world.storage.WorldInfo spill1836_1;
    int spill1836_2;
    long life2_3;
    net.minecraft.world.storage.WorldInfo life5_8;
    int life4_9;
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    forward_join_15: {
    life2_3 = (__fieldRead1836_0() ^ 118743748686254L);
    spill1836_0 = __call1836_1();
    life5_8 = __call1836_2(receiver, p0);
    life4_9 = spill1836_0;
    spill1836_1 = life5_8;
    if (!((life4_9 == 0))) {
        forwardValue1836_15_0 = spill1836_1;
        break forward_join_15;
    }
    if (!((spill1836_1 != null))) {
        break forward_join_26;
    }
    forwardValue1836_15_0 = life5_8;
    }
    spill1836_2 = __call1836_3(forwardValue1836_15_0);
    if (!((life4_9 == 0))) {
        forwardValue1836_25_0 = spill1836_2;
        break forward_join_25;
    }
    if (!((spill1836_2 == __invokedynamic1836_4(24631, (780382671511779621L ^ life2_3))))) {
        break forward_join_26;
    }
    forwardValue1836_25_0 = 1;
    }
    forwardValue1836_27_0 = forwardValue1836_25_0;
    break forward_join_27;
    }
    forwardValue1836_27_0 = 0;
    }
    return __integerCategory1836_5(forwardValue1836_27_0);
}
public static void h1836_0(moom.Oo p0) throws Throwable {
    throw __call1183600_0(p0);
}
public static void h1836_1(moom.Oo p0) throws Throwable {
    throw __call1183601_0(p0);
}
public static void h1836_2(moom.Oo p0) throws Throwable {
    throw __call1183602_0(p0);
}
private static native long __fieldRead1836_0() throws Throwable;
private static native int __call1836_1() throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call1836_2(net.minecraft.world.chunk.storage.AnvilSaveConverter a0, java.lang.String a1) throws Throwable;
private static native int __call1836_3(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native int __invokedynamic1836_4(int a0, long a1) throws Throwable;
private static native boolean __integerCategory1836_5(int value) throws Throwable;
private static native java.lang.Exception __call1183600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1183601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1183602_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_e0ffd545b1ca100c65b8(net.minecraft.world.chunk.storage.AnvilSaveConverter a0, java.lang.String a1) throws E;
private static final class __SourceHandler_e0ffd545b1ca100c65b8 {

public static boolean f1837(net.minecraft.world.chunk.storage.AnvilSaveConverter receiver, java.lang.String p0) throws Throwable {
    net.minecraft.world.storage.WorldInfo forwardValue1837_15_0;
    int forwardValue1837_22_0;
    int forwardValue1837_24_0;
    int spill1837_0;
    net.minecraft.world.storage.WorldInfo spill1837_1;
    int spill1837_2;
    long life2_3;
    net.minecraft.world.storage.WorldInfo life5_8;
    int life4_9;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_15: {
    life2_3 = (__fieldRead1837_0() ^ 29524221340316L);
    spill1837_0 = __call1837_1();
    life5_8 = __call1837_2(receiver, p0);
    life4_9 = spill1837_0;
    spill1837_1 = life5_8;
    if (!((life4_9 != 0))) {
        forwardValue1837_15_0 = spill1837_1;
        break forward_join_15;
    }
    if (!((spill1837_1 != null))) {
        break forward_join_23;
    }
    forwardValue1837_15_0 = life5_8;
    }
    spill1837_2 = __call1837_3(forwardValue1837_15_0);
    if (!((life4_9 != 0))) {
        forwardValue1837_22_0 = spill1837_2;
        break forward_join_22;
    }
    if (!((spill1837_2 != __call1837_4(receiver)))) {
        break forward_join_23;
    }
    forwardValue1837_22_0 = 1;
    }
    forwardValue1837_24_0 = forwardValue1837_22_0;
    break forward_join_24;
    }
    forwardValue1837_24_0 = 0;
    }
    return __integerCategory1837_5(forwardValue1837_24_0);
}
public static void h1837_0(moom.Oo p0) throws Throwable {
    throw __call1183700_0(p0);
}
public static void h1837_1(moom.Oo p0) throws Throwable {
    throw __call1183701_0(p0);
}
public static void h1837_2(moom.Oo p0) throws Throwable {
    throw __call1183702_0(p0);
}
private static native long __fieldRead1837_0() throws Throwable;
private static native int __call1837_1() throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call1837_2(net.minecraft.world.chunk.storage.AnvilSaveConverter a0, java.lang.String a1) throws Throwable;
private static native int __call1837_3(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native int __call1837_4(net.minecraft.world.chunk.storage.AnvilSaveConverter a0) throws Throwable;
private static native boolean __integerCategory1837_5(int value) throws Throwable;
private static native java.lang.Exception __call1183700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1183701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1183702_0(moom.Oo a0) throws Throwable;

}


public boolean c(java.lang.String p0) { return __sourceHandlerCall_29819c01b51306300dd8(this, p0); }


public boolean d(java.lang.String p0) { return __sourceHandlerCall_e0ffd545b1ca100c65b8(this, p0); }


private void a(java.io.File p0, java.lang.Iterable<java.io.File> p1, net.minecraft.world.biome.WorldChunkManager p2, int p3, int p4, net.minecraft.util.IProgressUpdate p5) {
int spill1752_0;
    long life7_3;
    java.util.Iterator life10_7;
    int life9_8;
    java.io.File life11_15;
    int life12_34;
    lexical_join_40: {
    life7_3 = (net.minecraft.world.chunk.storage.AnvilSaveConverter.d ^ 20738904160455L);
    spill1752_0 = moom.Fs.d();
    life10_7 = ((java.lang.Iterable)(p1)).iterator();
    life9_8 = spill1752_0;
    lexical_cycle_9: while (true) {
    if (!(((java.util.Iterator)(life10_7)).hasNext())) {
        break lexical_join_40;
    }
    life11_15 = ((java.io.File)(((java.util.Iterator)(life10_7)).next()));
    ((net.minecraft.world.chunk.storage.AnvilSaveConverter)(this)).a(((java.io.File)(p0)), ((java.io.File)(life11_15)), ((net.minecraft.world.biome.WorldChunkManager)(p2)), ((int)(p3)), ((int)(p4)), ((net.minecraft.util.IProgressUpdate)(p5)));
    p3 += 1;
    life12_34 = ((int) java.lang.Math.round(((double)(((0x1.9p6d * ((double) p3)) / ((double) p4))))));
    __sourceExactCall_8bfc4536823991(((net.minecraft.util.IProgressUpdate)(p5)), ((int)(life12_34)));
    if (!((life9_8 == 0))) { continue lexical_cycle_9; }
    break lexical_cycle_9;
    }
    }
    return;
}


private void a(java.io.File p0, java.util.Collection<java.io.File> p1) {
long life3_3;
    java.io.File life5_9;
    java.io.File[] life6_13;
    life3_3 = (net.minecraft.world.chunk.storage.AnvilSaveConverter.d ^ 12570818027462L);
    life5_9 = new java.io.File(p0, "region");
    life6_13 = ((java.io.File)(life5_9)).listFiles(((java.io.FilenameFilter)(__sourceIntrinsic_440b1cb5bf4a_invokedynamic3296_1())));
    try {
        if ((life6_13 != null)) {
        java.util.Collections.addAll(((java.util.Collection)(p1)), ((java.lang.Object[])(life6_13)));
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw net.minecraft.world.chunk.storage.AnvilSaveConverter.a(((java.lang.Exception)(caught_rethrow_0)));
    }
    return;
}


private void a(java.io.File p0, java.io.File p1, net.minecraft.world.biome.WorldChunkManager p2, int p3, int p4, net.minecraft.util.IProgressUpdate p5) { __sourceHandlerCall_da2e79181883c39cbc17(this, p0, p1, p2, p3, p4, p5); }


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 20737;
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
            throw new RuntimeException("moom/IS", var14);
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
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12680_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/IS"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.world.chunk.storage.AnvilSaveConverter.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a__Void() {
moom.Fw.a();
    return;
}


protected int a() {
long local1 = (net.minecraft.world.chunk.storage.AnvilSaveConverter.d ^ 39254107107515L);
    return __sourceIntrinsic_8aebf151eadb_originalDynamicSite2076_1(510, (8563112505280174586L ^ local1));
}


public java.util.List<moom.IQ> a__List() throws net.minecraft.client.AnvilConverterException { return __sourceHandlerCall_2b5187529e31a90c2bad(this); }


public java.lang.String a__String() {
return "Anvil";
}


private void a__sourceReturn_a7421bf54c(java.lang.String p0) { __sourceHandlerCall_689b448b074939c788c3(this, p0); }


public boolean a(java.lang.String p0, net.minecraft.util.IProgressUpdate p1) { return __sourceHandlerCall_d26ef74d66b49be2a9e0(this, p0, p1); }


public net.minecraft.world.storage.ISaveHandler a(java.lang.String p0, boolean p1) {
return new moom.IU(this.b, p0, p1);
}


private static boolean lambda$addRegionFilesToCollection$0(java.io.File p0, java.lang.String p1) {
return (__sourceIntrinsic_booleanComparison((((java.lang.String)(p1)).endsWith(((java.lang.String)(".mcr"))))) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_8aebf151eadb_originalDynamicSite2076_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.io.FilenameFilter __sourceIntrinsic_440b1cb5bf4a_invokedynamic3296_1() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12680_0() throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native void __sourceExactCall_8bfc4536823991(net.minecraft.util.IProgressUpdate p0, int p1);
}
