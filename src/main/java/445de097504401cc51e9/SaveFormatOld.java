package net.minecraft.world.storage;


public class SaveFormatOld implements net.minecraft.world.storage.ISaveFormat {

private static org.apache.logging.log4j.Logger a;

protected java.io.File b;

private static long e;

private static long i;

public SaveFormatOld(java.io.File p0) { super(); __sourceHandlerCall_69232e4dd1db6fedb399(this, p0); }


static {
e = ((long)(((moom._a)(moom._c.a(((long)(1794838024272900852L)), ((long)(-8252998711201689531L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(66691583824554L)))));
    long local0_life6 = (net.minecraft.world.storage.SaveFormatOld.e ^ 133322413214515L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1224_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1224_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1224_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1224_13 = new byte[8];
    (__sourceSpill1224_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1224_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1224_15 = __sourceSpill1224_13;
    ((javax.crypto.Cipher)(__sourceSpill1224_10)).init(((int)(__sourceSpill1224_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1224_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1224_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -8291886379501820234L;
    byte[] __sourceSpill1224_19 = new byte[8];
    (__sourceSpill1224_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1224_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1224_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1224_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1224_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1224_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1224_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1224_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1224_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1224_20)).doFinal(((byte[])(__sourceSpill1224_19)));
    i = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}

private static native <E extends Throwable> void __sourceHandlerCall_69232e4dd1db6fedb399(net.minecraft.world.storage.SaveFormatOld a0, java.io.File a1) throws E;
private static final class __SourceHandler_69232e4dd1db6fedb399 {

public static void f587(net.minecraft.world.storage.SaveFormatOld receiver, java.io.File p0) throws Throwable {
    java.lang.String spill587_0;
    long life2_3;
    java.lang.String life4_7;
    life2_3 = (__fieldRead587_0() ^ 14202153710925L);
    spill587_0 = __call587_1();
    __directSuperInit587_2(receiver);
    life4_7 = spill587_0;
    if ((life4_7 != null)) {
        if ((!__call587_3(p0))) {
        __call587_4(p0);
    } else {
        
    }
        __fieldWrite587_5(receiver, p0);
    } else {
        
    }
    return;
}
public static void h587_0(moom.Oo p0) throws Throwable {
    throw __call3058700_0(p0);
}
public static void h587_1(moom.Oo p0) throws Throwable {
    throw __call3058701_0(p0);
}
private static native long __fieldRead587_0() throws Throwable;
private static native java.lang.String __call587_1() throws Throwable;
private static native void __directSuperInit587_2(net.minecraft.world.storage.SaveFormatOld a0) throws Throwable;
private static native boolean __call587_3(java.io.File a0) throws Throwable;
private static native boolean __call587_4(java.io.File a0) throws Throwable;
private static native void __fieldWrite587_5(net.minecraft.world.storage.SaveFormatOld a0, java.io.File a1) throws Throwable;
private static native java.lang.Throwable __call3058700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058701_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.world.storage.WorldInfo __sourceHandlerCall_1874c0a71bfc84217008(net.minecraft.world.storage.SaveFormatOld a0, java.lang.String a1) throws E;
private static final class __SourceHandler_1874c0a71bfc84217008 {

public static net.minecraft.world.storage.WorldInfo f736(net.minecraft.world.storage.SaveFormatOld receiver, java.lang.String p0) throws Throwable {
    java.lang.String spill736_0;
    java.io.File spill736_1;
    java.io.File joinValue736_0_0;
    boolean spill736_2;
    boolean joinValue736_1_0;
    long life2_3;
    java.io.File life5_11;
    java.lang.String life4_12;
    java.io.File life6_30;
    net.minecraft.nbt.NBTTagCompound life7_44;
    net.minecraft.nbt.NBTTagCompound life8_48;
    net.minecraft.nbt.NBTTagCompound life7_74;
    net.minecraft.nbt.NBTTagCompound life8_78;
    life2_3 = (__fieldRead736_0() ^ 118542304057620L);
    spill736_0 = __call736_1();
    life5_11 = new java.io.File(__fieldRead736_2(receiver), p0);
    life4_12 = spill736_0;
    spill736_1 = life5_11;
    if ((life4_12 != null)) {
        if ((!__call736_3(spill736_1))) {
        return null;
    }
        joinValue736_0_0 = new java.io.File(life5_11, "level.dat");
    } else {
        joinValue736_0_0 = spill736_1;
    }
    life6_30 = joinValue736_0_0;
    spill736_2 = __call736_4(life6_30);
    if ((life4_12 != null)) {
        if (spill736_2) {
        life7_44 = __call736_5(new java.io.FileInputStream(life6_30));
        life8_48 = __call736_6(life7_44, "Data");
        return new net.minecraft.world.storage.WorldInfo(life8_48);
    }
        life6_30 = new java.io.File(life5_11, "level.dat_old");
        joinValue736_1_0 = __call736_7(life6_30);
    } else {
        joinValue736_1_0 = spill736_2;
    }
    if (joinValue736_1_0) {
        life7_74 = __call736_8(new java.io.FileInputStream(life6_30));
        life8_78 = __call736_9(life7_74, "Data");
        return new net.minecraft.world.storage.WorldInfo(life8_78);
    }
    return null;
}
public static net.minecraft.world.storage.WorldInfo h736_0(java.lang.Exception p0) throws Throwable {
    throw __call3073600_0(p0);
}
public static net.minecraft.world.storage.WorldInfo h736_1(java.lang.Exception p0) throws Throwable {
    throw __call3073601_0(p0);
}
public static net.minecraft.world.storage.WorldInfo h736_2(java.lang.Exception p0) throws Throwable {
    throw __call3073602_0(p0);
}
public static net.minecraft.world.storage.WorldInfo h736_3(java.lang.Exception p0, java.io.File p1, java.io.File p2, net.minecraft.nbt.NBTTagCompound p3, net.minecraft.nbt.NBTTagCompound p4) throws Throwable {
    java.lang.Exception life3_2;
    java.io.File life2_13;
    net.minecraft.nbt.NBTTagCompound life3_22;
    net.minecraft.nbt.NBTTagCompound life4_26;
    life3_2 = p0;
    __call3073603_2(__fieldRead3073603_0(), __invokedynamic3073603_1(p2), life3_2);
    life2_13 = new java.io.File(p1, "level.dat_old");
    if (__call3073603_3(life2_13)) {
        life3_22 = __call3073603_4(new java.io.FileInputStream(life2_13));
        life4_26 = __call3073603_5(life3_22, "Data");
        return new net.minecraft.world.storage.WorldInfo(life4_26);
    }
    return null;
}
public static net.minecraft.world.storage.WorldInfo h736_4(java.lang.Exception p0, java.io.File p1, net.minecraft.nbt.NBTTagCompound p2) throws Throwable {
    java.lang.Exception life2_2;
    life2_2 = p0;
    __call3073604_2(__fieldRead3073604_0(), __invokedynamic3073604_1(p1), life2_2);
    return null;
}
private static native long __fieldRead736_0() throws Throwable;
private static native java.lang.String __call736_1() throws Throwable;
private static native java.io.File __fieldRead736_2(net.minecraft.world.storage.SaveFormatOld a0) throws Throwable;
private static native boolean __call736_3(java.io.File a0) throws Throwable;
private static native boolean __call736_4(java.io.File a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call736_5(java.io.FileInputStream a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call736_6(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native boolean __call736_7(java.io.File a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call736_8(java.io.FileInputStream a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call736_9(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native java.lang.Throwable __call3073600_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3073601_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3073602_0(java.lang.Exception a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3073603_0() throws Throwable;
private static native java.lang.String __invokedynamic3073603_1(java.io.File a0) throws Throwable;
private static native void __call3073603_2(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Exception a2) throws Throwable;
private static native boolean __call3073603_3(java.io.File a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call3073603_4(java.io.FileInputStream a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call3073603_5(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3073604_0() throws Throwable;
private static native java.lang.String __invokedynamic3073604_1(java.io.File a0) throws Throwable;
private static native void __call3073604_2(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Exception a2) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_50f6996328041983de88(net.minecraft.world.storage.SaveFormatOld a0, java.lang.String a1, java.lang.String a2) throws E;
private static final class __SourceHandler_50f6996328041983de88 {

public static void f737(net.minecraft.world.storage.SaveFormatOld receiver, java.lang.String p0, java.lang.String p1) throws Throwable {
    java.io.File forwardValue737_23_0;
    java.lang.String spill737_0;
    java.io.File spill737_1;
    long life3_3;
    java.io.File life6_11;
    java.lang.String life5_12;
    java.io.File life7_29;
    net.minecraft.nbt.NBTTagCompound life8_38;
    net.minecraft.nbt.NBTTagCompound life9_42;
    forward_join_47: {
    forward_join_23: {
    life3_3 = (__fieldRead737_0() ^ 32637857363580L);
    spill737_0 = __call737_1();
    life6_11 = new java.io.File(__fieldRead737_2(receiver), p0);
    life5_12 = spill737_0;
    spill737_1 = life6_11;
    if (!((life5_12 != null))) {
        forwardValue737_23_0 = spill737_1;
        break forward_join_23;
    }
    if (!(__call737_3(spill737_1))) {
        break forward_join_47;
    }
    forwardValue737_23_0 = new java.io.File(life6_11, "level.dat");
    }
    life7_29 = forwardValue737_23_0;
    if (!(__call737_4(life7_29))) {
        break forward_join_47;
    }
    life8_38 = __call737_5(new java.io.FileInputStream(life7_29));
    life9_42 = __call737_6(life8_38, "Data");
    __call737_7(life9_42, "LevelName", p1);
    __call737_8(life8_38, new java.io.FileOutputStream(life7_29));
    }
    return;
}
public static void h737_0(java.lang.Exception p0) throws Throwable {
    throw __call2073700_0(p0);
}
public static void h737_1(java.lang.Exception p0) throws Throwable {
    throw __call2073701_0(p0);
}
public static void h737_2(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    __call2073702_0(local1);
    return;
}
private static native long __fieldRead737_0() throws Throwable;
private static native java.lang.String __call737_1() throws Throwable;
private static native java.io.File __fieldRead737_2(net.minecraft.world.storage.SaveFormatOld a0) throws Throwable;
private static native boolean __call737_3(java.io.File a0) throws Throwable;
private static native boolean __call737_4(java.io.File a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call737_5(java.io.FileInputStream a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call737_6(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __call737_7(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call737_8(net.minecraft.nbt.NBTTagCompound a0, java.io.FileOutputStream a1) throws Throwable;
private static native java.lang.Throwable __call2073700_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call2073701_0(java.lang.Exception a0) throws Throwable;
private static native void __call2073702_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_019092391bdd2781a15b(java.io.File[] a0) throws E;
private static final class __SourceHandler_019092391bdd2781a15b {

public static boolean f1851(java.io.File[] p0) throws Throwable {
    int lexicalValue1851_45_0;
    int lexicalValue1851_53_0;
    int lexicalValue1851_58_0;
    java.lang.String spill1851_0;
    boolean spill1851_1;
    boolean spill1851_2;
    long life1_3;
    java.io.File[] life4_6;
    java.lang.String life3_7;
    int life5_10;
    int life6_12;
    java.io.File life7_19;
    lexical_join_58: {
    lexical_join_57: {
    life1_3 = (__fieldRead1851_0() ^ 72291916467154L);
    spill1851_0 = __call1851_1();
    life4_6 = p0;
    life3_7 = spill1851_0;
    life5_10 = (life4_6).length;
    life6_12 = 0;
    lexical_cycle_13: while (true) {
    lexical_join_54: {
    lexical_join_53: {
    lexical_join_45: {
    lexical_join_43: {
    if (!((life6_12 < life5_10))) {
        break lexical_join_57;
    }
    life7_19 = (life4_6)[life6_12];
    __call1851_4(__fieldRead1851_2(), __invokedynamic1851_3(life7_19));
    spill1851_1 = __call1851_5(life7_19);
    if (!((life3_7 != null))) {
        lexicalValue1851_58_0 = __integerCategory1851_6(spill1851_1);
        break lexical_join_58;
    }
    if (!((life3_7 != null))) {
        lexicalValue1851_45_0 = __integerCategory1851_7(spill1851_1);
        break lexical_join_45;
    }
    if (!(spill1851_1)) {
        break lexical_join_43;
    }
    spill1851_2 = __call1851_9(__call1851_8(life7_19));
    if (!((life3_7 != null))) {
        lexicalValue1851_45_0 = __integerCategory1851_10(spill1851_2);
        break lexical_join_45;
    }
    if (!((!spill1851_2))) {
        break lexical_join_43;
    }
    __call1851_13(__fieldRead1851_11(), __invokedynamic1851_12(life7_19));
    return __integerCategory1851_14(0);
    }
    lexicalValue1851_45_0 = __integerCategory1851_16(__call1851_15(life7_19));
    }
    if (!((life3_7 != null))) {
        lexicalValue1851_53_0 = lexicalValue1851_45_0;
        break lexical_join_53;
    }
    if (!((lexicalValue1851_45_0 == 0))) {
        break lexical_join_54;
    }
    __call1851_19(__fieldRead1851_17(), __invokedynamic1851_18(life7_19));
    lexicalValue1851_53_0 = 0;
    }
    return __integerCategory1851_20(lexicalValue1851_53_0);
    }
    life6_12 += 1;
    if (!((life3_7 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    lexicalValue1851_58_0 = 1;
    }
    return __integerCategory1851_21(lexicalValue1851_58_0);
}
public static void h1851_0(moom.Oo p0) throws Throwable {
    throw __call1185100_0(p0);
}
public static void h1851_1(moom.Oo p0) throws Throwable {
    throw __call1185101_0(p0);
}
public static void h1851_2(moom.Oo p0) throws Throwable {
    throw __call1185102_0(p0);
}
public static void h1851_3(moom.Oo p0) throws Throwable {
    throw __call1185103_0(p0);
}
public static void h1851_4(moom.Oo p0) throws Throwable {
    throw __call1185104_0(p0);
}
public static void h1851_5(moom.Oo p0) throws Throwable {
    throw __call1185105_0(p0);
}
public static void h1851_6(moom.Oo p0) throws Throwable {
    throw __call1185106_0(p0);
}
private static native long __fieldRead1851_0() throws Throwable;
private static native java.lang.String __call1851_1() throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead1851_2() throws Throwable;
private static native java.lang.String __invokedynamic1851_3(java.io.File a0) throws Throwable;
private static native void __call1851_4(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native boolean __call1851_5(java.io.File a0) throws Throwable;
private static native int __integerCategory1851_6(boolean value) throws Throwable;
private static native int __integerCategory1851_7(boolean value) throws Throwable;
private static native java.io.File[] __call1851_8(java.io.File a0) throws Throwable;
private static native boolean __call1851_9(java.io.File[] a0) throws Throwable;
private static native int __integerCategory1851_10(boolean value) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead1851_11() throws Throwable;
private static native java.lang.String __invokedynamic1851_12(java.io.File a0) throws Throwable;
private static native void __call1851_13(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native boolean __integerCategory1851_14(int value) throws Throwable;
private static native boolean __call1851_15(java.io.File a0) throws Throwable;
private static native int __integerCategory1851_16(boolean value) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead1851_17() throws Throwable;
private static native java.lang.String __invokedynamic1851_18(java.io.File a0) throws Throwable;
private static native void __call1851_19(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native boolean __integerCategory1851_20(int value) throws Throwable;
private static native boolean __integerCategory1851_21(int value) throws Throwable;
private static native java.lang.Throwable __call1185100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1185101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1185102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1185103_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1185104_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1185105_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1185106_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_54805db5acad0dca418b(net.minecraft.world.storage.SaveFormatOld a0, java.lang.String a1) throws E;
private static final class __SourceHandler_54805db5acad0dca418b {

public static boolean f655(net.minecraft.world.storage.SaveFormatOld receiver, java.lang.String p0) throws Throwable {
    int forwardValue655_27_0;
    java.lang.String spill655_0;
    boolean spill655_1;
    long life2_3;
    java.io.File life5_11;
    java.lang.String life4_12;
    forward_join_27: {
    forward_join_20: {
    life2_3 = (__fieldRead655_0() ^ 11650546818127L);
    spill655_0 = __call655_1();
    life5_11 = new java.io.File(__fieldRead655_2(receiver), p0);
    life4_12 = spill655_0;
    spill655_1 = __call655_3(life5_11);
    if (!((life4_12 != null))) {
        forwardValue655_27_0 = __integerCategory655_4(spill655_1);
        break forward_join_27;
    }
    if (!(spill655_1)) {
        break forward_join_20;
    }
    return __integerCategory655_5(0);
    }
    __call655_6(life5_11);
    __call655_7(life5_11);
    forwardValue655_27_0 = 1;
    }
    return __integerCategory655_8(forwardValue655_27_0);
}
public static boolean h655_0(java.lang.Throwable p0) throws Throwable {
    throw __call2065500_0(p0);
}
public static boolean h655_1(java.lang.Throwable p0) throws Throwable {
    throw __call2065501_0(p0);
}
public static boolean h655_2(java.lang.Throwable p0) throws Throwable {
    java.lang.Throwable local1 = p0;
    __call2065502_1(__fieldRead2065502_0(), "Couldn't make new level", local1);
    return false;
}
private static native long __fieldRead655_0() throws Throwable;
private static native java.lang.String __call655_1() throws Throwable;
private static native java.io.File __fieldRead655_2(net.minecraft.world.storage.SaveFormatOld a0) throws Throwable;
private static native boolean __call655_3(java.io.File a0) throws Throwable;
private static native int __integerCategory655_4(boolean value) throws Throwable;
private static native boolean __integerCategory655_5(int value) throws Throwable;
private static native boolean __call655_6(java.io.File a0) throws Throwable;
private static native boolean __call655_7(java.io.File a0) throws Throwable;
private static native boolean __integerCategory655_8(int value) throws Throwable;
private static native java.lang.Throwable __call2065500_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2065501_0(java.lang.Throwable a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead2065502_0() throws Throwable;
private static native void __call2065502_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Throwable a2) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_432dcd45d60740a6d38c(net.minecraft.world.storage.SaveFormatOld a0) throws E;
private static final class __SourceHandler_432dcd45d60740a6d38c {

public static java.util.List f1852(net.minecraft.world.storage.SaveFormatOld receiver) throws Throwable {
    java.lang.String spill1852_0;
    long life1_3;
    java.util.ArrayList life4_6;
    java.lang.String life3_7;
    int life5_9;
    java.lang.String life6_17;
    net.minecraft.world.storage.WorldInfo life7_21;
    lexical_join_48: {
    life1_3 = (__fieldRead1852_0() ^ 2240541264018L);
    spill1852_0 = __call1852_1();
    life4_6 = __call1852_2();
    life3_7 = spill1852_0;
    life5_9 = 0;
    lexical_cycle_10: while (true) {
    lexical_join_46: {
    lexical_join_45: {
    if (!((life5_9 < 5))) {
        break lexical_join_48;
    }
    life6_17 = __invokedynamic1852_3((life5_9 + 1));
    life7_21 = __call1852_4(receiver, life6_17);
    if (!((life3_7 != null))) {
        break lexical_join_46;
    }
    if (!((life7_21 != null))) {
        break lexical_join_45;
    }
    __call1852_10(life4_6, new moom.IQ(life6_17, "", __call1852_5(life7_21), __call1852_6(life7_21), __call1852_7(life7_21), false, __call1852_8(life7_21), __call1852_9(life7_21)));
    }
    life5_9 += 1;
    }
    if (!((life3_7 == null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return life4_6;
}
public static void h1852_0(net.minecraft.client.AnvilConverterException p0) throws Throwable {
    throw __call1185200_0(p0);
}
public static void h1852_1(net.minecraft.client.AnvilConverterException p0) throws Throwable {
    throw __call1185201_0(p0);
}
private static native long __fieldRead1852_0() throws Throwable;
private static native java.lang.String __call1852_1() throws Throwable;
private static native java.util.ArrayList __call1852_2() throws Throwable;
private static native java.lang.String __invokedynamic1852_3(int a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call1852_4(net.minecraft.world.storage.SaveFormatOld a0, java.lang.String a1) throws Throwable;
private static native long __call1852_5(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native long __call1852_6(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __call1852_7(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native boolean __call1852_8(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native boolean __call1852_9(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native boolean __call1852_10(java.util.ArrayList a0, moom.IQ a1) throws Throwable;
private static native java.lang.Throwable __call1185200_0(net.minecraft.client.AnvilConverterException a0) throws Throwable;
private static native java.lang.Throwable __call1185201_0(net.minecraft.client.AnvilConverterException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_396871b1467cc9b3d10b(net.minecraft.world.storage.SaveFormatOld a0, java.lang.String a1) throws E;
private static final class __SourceHandler_396871b1467cc9b3d10b {

public static boolean f1183(net.minecraft.world.storage.SaveFormatOld receiver, java.lang.String p0) throws Throwable {
    int forestValue1183_25_0;
    int forestValue1183_49_0;
    int forestValue1183_58_0;
    java.lang.String spill1183_0;
    boolean spill1183_1;
    boolean spill1183_2;
    long life2_3;
    java.io.File life5_11;
    java.lang.String life4_12;
    int life6_26;
    forest_join_58: {
    forest_join_56: {
    forest_join_25: {
    forest_join_20: {
    life2_3 = (__fieldRead1183_0() ^ 78896263515057L);
    spill1183_0 = __call1183_1();
    life5_11 = new java.io.File(__fieldRead1183_2(receiver), p0);
    life4_12 = spill1183_0;
    spill1183_1 = __call1183_3(life5_11);
    if (!((life4_12 != null))) {
        forestValue1183_25_0 = __integerCategory1183_4(spill1183_1);
        break forest_join_25;
    }
    if (!((!spill1183_1))) {
        break forest_join_20;
    }
    return __integerCategory1183_5(1);
    }
    __call1183_8(__fieldRead1183_6(), __invokedynamic1183_7(p0));
    forestValue1183_25_0 = 1;
    }
    life6_26 = forestValue1183_25_0;
    forest_cycle_26: while (true) {
    forest_join_54: {
    forest_join_53: {
    forest_join_49: {
    forest_join_43: {
    if (!((life6_26 <= 5))) {
        break forest_join_56;
    }
    __call1183_11(__fieldRead1183_9(), __invokedynamic1183_10(life6_26));
    spill1183_2 = __call1183_13(__call1183_12(life5_11));
    if (!((life4_12 != null))) {
        forestValue1183_58_0 = __integerCategory1183_14(spill1183_2);
        break forest_join_58;
    }
    if (!((life4_12 != null))) {
        forestValue1183_49_0 = __integerCategory1183_15(spill1183_2);
        break forest_join_49;
    }
    if (!(spill1183_2)) {
        break forest_join_43;
    }
    if (!((life4_12 == null))) {
        break forest_join_56;
    }
    }
    __call1183_17(__fieldRead1183_16(), "Unsuccessful in deleting contents.");
    if (!((life4_12 != null))) {
        break forest_join_54;
    }
    forestValue1183_49_0 = life6_26;
    }
    if (!((forestValue1183_49_0 < 5))) {
        break forest_join_53;
    }
    __call1183_19(__fieldRead1183_18());
    }
    life6_26 += 1;
    }
    if (!((life4_12 == null))) {
        continue forest_cycle_26;
    }
    break forest_cycle_26;
    }
    }
    forestValue1183_58_0 = __integerCategory1183_21(__call1183_20(life5_11));
    }
    return __integerCategory1183_22(forestValue1183_58_0);
}
public static boolean h1183_0(java.lang.InterruptedException p0) throws Throwable {
    throw __call3118300_0(p0);
}
public static boolean h1183_1(java.lang.InterruptedException p0) throws Throwable {
    throw __call3118301_0(p0);
}
public static boolean h1183_2(java.lang.InterruptedException p0) throws Throwable {
    throw __call3118302_0(p0);
}
public static boolean h1183_3(java.lang.InterruptedException p0) throws Throwable {
    throw __call3118303_0(p0);
}
public static boolean h1183_4(java.lang.InterruptedException p0) throws Throwable {
    throw __call3118304_0(p0);
}
public static boolean h1183_5(java.lang.InterruptedException p0) throws Throwable {
    throw __call3118305_0(p0);
}
public static boolean h1183_6(java.lang.InterruptedException p0) throws Throwable {
    throw __call3118306_0(p0);
}
public static boolean h1183_7(moom.Oo p0) throws Throwable {
    throw __call3118307_0(p0);
}
public static boolean h1183_8(java.lang.InterruptedException p0, java.lang.String p1, java.io.File p2, int p3) throws Throwable {
    int forestValue3118308_29_0;
    int forestValue3118308_36_0;
    boolean spill3118308_0;
    java.lang.InterruptedException life4_2;
    forest_join_36: {
    forest_join_34: {
    life4_2 = p0;
    forest_cycle_2: while (true) {
    forest_join_29: {
    p3 += 1;
    forest_cycle_3: while (true) {
    forest_join_23: {
    forest_join_6: {
    if (!((p1 == null))) {
        break forest_join_6;
    }
    break forest_join_34;
    }
    if (!((p3 <= 5))) {
        break forest_join_34;
    }
    __call3118308_2(__fieldRead3118308_0(), __invokedynamic3118308_1(p3));
    spill3118308_0 = __call3118308_4(__call3118308_3(p2));
    if (!((p1 != null))) {
        forestValue3118308_36_0 = __integerCategory3118308_5(spill3118308_0);
        break forest_join_36;
    }
    if (!((p1 != null))) {
        forestValue3118308_29_0 = __integerCategory3118308_6(spill3118308_0);
        break forest_join_29;
    }
    if (!(spill3118308_0)) {
        break forest_join_23;
    }
    if (!((p1 == null))) {
        break forest_join_34;
    }
    }
    __call3118308_8(__fieldRead3118308_7(), "Unsuccessful in deleting contents.");
    if (!((p1 != null))) {
        continue forest_cycle_3;
    }
    break forest_cycle_3;
    }
    forestValue3118308_29_0 = p3;
    }
    if (!((forestValue3118308_29_0 < 5))) {
        continue forest_cycle_2;
    }
    __call3118308_10(__fieldRead3118308_9());
    continue forest_cycle_2;
    }
    }
    forestValue3118308_36_0 = __integerCategory3118308_12(__call3118308_11(p2));
    }
    return __integerCategory3118308_13(forestValue3118308_36_0);
}
private static native long __fieldRead1183_0() throws Throwable;
private static native java.lang.String __call1183_1() throws Throwable;
private static native java.io.File __fieldRead1183_2(net.minecraft.world.storage.SaveFormatOld a0) throws Throwable;
private static native boolean __call1183_3(java.io.File a0) throws Throwable;
private static native int __integerCategory1183_4(boolean value) throws Throwable;
private static native boolean __integerCategory1183_5(int value) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead1183_6() throws Throwable;
private static native java.lang.String __invokedynamic1183_7(java.lang.String a0) throws Throwable;
private static native void __call1183_8(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead1183_9() throws Throwable;
private static native java.lang.String __invokedynamic1183_10(int a0) throws Throwable;
private static native void __call1183_11(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.io.File[] __call1183_12(java.io.File a0) throws Throwable;
private static native boolean __call1183_13(java.io.File[] a0) throws Throwable;
private static native int __integerCategory1183_14(boolean value) throws Throwable;
private static native int __integerCategory1183_15(boolean value) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead1183_16() throws Throwable;
private static native void __call1183_17(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native long __fieldRead1183_18() throws Throwable;
private static native void __call1183_19(long a0) throws Throwable;
private static native boolean __call1183_20(java.io.File a0) throws Throwable;
private static native int __integerCategory1183_21(boolean value) throws Throwable;
private static native boolean __integerCategory1183_22(int value) throws Throwable;
private static native java.lang.Throwable __call3118300_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Throwable __call3118301_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Throwable __call3118302_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Throwable __call3118303_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Throwable __call3118304_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Throwable __call3118305_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Throwable __call3118306_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Throwable __call3118307_0(moom.Oo a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3118308_0() throws Throwable;
private static native java.lang.String __invokedynamic3118308_1(int a0) throws Throwable;
private static native void __call3118308_2(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.io.File[] __call3118308_3(java.io.File a0) throws Throwable;
private static native boolean __call3118308_4(java.io.File[] a0) throws Throwable;
private static native int __integerCategory3118308_5(boolean value) throws Throwable;
private static native int __integerCategory3118308_6(boolean value) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3118308_7() throws Throwable;
private static native void __call3118308_8(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native long __fieldRead3118308_9() throws Throwable;
private static native void __call3118308_10(long a0) throws Throwable;
private static native boolean __call3118308_11(java.io.File a0) throws Throwable;
private static native int __integerCategory3118308_12(boolean value) throws Throwable;
private static native boolean __integerCategory3118308_13(int value) throws Throwable;

}


public boolean b(java.lang.String p0) { return __sourceHandlerCall_396871b1467cc9b3d10b(this, p0); }


public boolean e(java.lang.String p0) {
java.io.File local2 = new java.io.File(this.b, p0);
    return ((java.io.File)(local2)).isDirectory();
}


public boolean c(java.lang.String p0) {
return ((0) != 0);
}


public boolean d(java.lang.String p0) {
return ((0) != 0);
}


public net.minecraft.world.storage.ISaveHandler a(java.lang.String p0, boolean p1) {
return new net.minecraft.world.storage.SaveHandler(this.b, p0, p1);
}


public boolean a(java.lang.String p0, net.minecraft.util.IProgressUpdate p1) {
return ((0) != 0);
}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


public net.minecraft.world.storage.WorldInfo a(java.lang.String p0) { return __sourceHandlerCall_1874c0a71bfc84217008(this, p0); }


public void a__Void() {
return;
}


public java.util.List<moom.IQ> a__List() throws net.minecraft.client.AnvilConverterException { return __sourceHandlerCall_432dcd45d60740a6d38c(this); }


public java.lang.String a__String() {
return "Old Format";
}


public void a(java.lang.String p0, java.lang.String p1) { __sourceHandlerCall_50f6996328041983de88(this, p0, p1); }


public boolean a__Boolean(java.lang.String p0) { return __sourceHandlerCall_54805db5acad0dca418b(this, p0); }


protected static boolean a(java.io.File[] p0) { return __sourceHandlerCall_019092391bdd2781a15b(p0); }

}
