package net.minecraft.world.storage;


public class SaveHandler implements net.minecraft.world.storage.ISaveHandler, net.minecraft.world.storage.IPlayerFileData {

private static org.apache.logging.log4j.Logger a;

private java.io.File b;

private java.io.File c;

private java.io.File d;

private long e;

private java.lang.String f;

private static long h;

public SaveHandler(java.io.File p0, java.lang.String p1, boolean p2) { super(); __sourceHandlerCall_5198c5f3eeb4738c95aa(this, p0, p1, p2); }


static {
net.minecraft.world.storage.SaveHandler.h = (moom._c.a(6502671024499991648L, -4382637841538257411L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(2150540321735L);
    net.minecraft.world.storage.SaveHandler.a = org.apache.logging.log4j.LogManager.getLogger();
}

private static native <E extends Throwable> void __sourceHandlerCall_5198c5f3eeb4738c95aa(net.minecraft.world.storage.SaveHandler a0, java.io.File a1, java.lang.String a2, boolean a3) throws E;
private static final class __SourceHandler_5198c5f3eeb4738c95aa {

public static void f588(net.minecraft.world.storage.SaveHandler receiver, java.io.File p0, java.lang.String p1, boolean p2) throws Throwable {
    java.lang.String spill588_0;
    long life4_3;
    java.lang.String life6_10;
    life4_3 = (__fieldRead588_0() ^ 22119080583012L);
    spill588_0 = __call588_1();
    __directSuperInit588_2(receiver);
    __fieldWrite588_4(receiver, __call588_3());
    life6_10 = spill588_0;
    __fieldWrite588_5(receiver, new java.io.File(p0, p1));
    __call588_7(__fieldRead588_6(receiver));
    __fieldWrite588_9(receiver, new java.io.File(__fieldRead588_8(receiver), "playerdata"));
    __fieldWrite588_11(receiver, new java.io.File(__fieldRead588_10(receiver), "data"));
    __call588_13(__fieldRead588_12(receiver));
    __fieldWrite588_14(receiver, p1);
    if ((life6_10 != null)) {
        if (p2) {
        __call588_16(__fieldRead588_15(receiver));
    } else {
        
    }
        __call588_17(receiver);
    } else {
        
    }
    return;
}
public static void h588_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call3058800_0(p0);
}
public static void h588_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call3058801_0(p0);
}
private static native long __fieldRead588_0() throws Throwable;
private static native java.lang.String __call588_1() throws Throwable;
private static native void __directSuperInit588_2(net.minecraft.world.storage.SaveHandler a0) throws Throwable;
private static native long __call588_3() throws Throwable;
private static native void __fieldWrite588_4(net.minecraft.world.storage.SaveHandler a0, long a1) throws Throwable;
private static native void __fieldWrite588_5(net.minecraft.world.storage.SaveHandler a0, java.io.File a1) throws Throwable;
private static native java.io.File __fieldRead588_6(net.minecraft.world.storage.SaveHandler a0) throws Throwable;
private static native boolean __call588_7(java.io.File a0) throws Throwable;
private static native java.io.File __fieldRead588_8(net.minecraft.world.storage.SaveHandler a0) throws Throwable;
private static native void __fieldWrite588_9(net.minecraft.world.storage.SaveHandler a0, java.io.File a1) throws Throwable;
private static native java.io.File __fieldRead588_10(net.minecraft.world.storage.SaveHandler a0) throws Throwable;
private static native void __fieldWrite588_11(net.minecraft.world.storage.SaveHandler a0, java.io.File a1) throws Throwable;
private static native java.io.File __fieldRead588_12(net.minecraft.world.storage.SaveHandler a0) throws Throwable;
private static native boolean __call588_13(java.io.File a0) throws Throwable;
private static native void __fieldWrite588_14(net.minecraft.world.storage.SaveHandler a0, java.lang.String a1) throws Throwable;
private static native java.io.File __fieldRead588_15(net.minecraft.world.storage.SaveHandler a0) throws Throwable;
private static native boolean __call588_16(java.io.File a0) throws Throwable;
private static native void __call588_17(net.minecraft.world.storage.SaveHandler a0) throws Throwable;
private static native java.lang.Throwable __call3058800_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Throwable __call3058801_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.nbt.NBTTagCompound __sourceHandlerCall_abe3fc68a0cd0f5c49ad(net.minecraft.world.storage.SaveHandler a0, net.minecraft.entity.player.EntityPlayer a1) throws E;
private static final class __SourceHandler_abe3fc68a0cd0f5c49ad {

public static net.minecraft.nbt.NBTTagCompound f738(net.minecraft.world.storage.SaveHandler receiver, net.minecraft.entity.player.EntityPlayer p0) throws Throwable {
    int forwardValue738_25_0;
    net.minecraft.nbt.NBTTagCompound forwardValue738_40_0;
    java.lang.String spill738_0;
    boolean spill738_1;
    net.minecraft.nbt.NBTTagCompound spill738_2;
    long life2_3;
    net.minecraft.nbt.NBTTagCompound life5_6;
    java.lang.String life4_7;
    java.io.File life6_17;
    forward_join_40: {
    forward_join_39: {
    forward_join_32: {
    forward_join_25: {
    life2_3 = (__fieldRead738_0() ^ 24108271332522L);
    spill738_0 = __call738_1();
    life5_6 = null;
    life4_7 = spill738_0;
    life6_17 = new java.io.File(__fieldRead738_2(receiver), __invokedynamic738_5(__call738_4(__call738_3(p0))));
    spill738_1 = __call738_6(life6_17);
    if (!((life4_7 != null))) {
        forwardValue738_25_0 = __integerCategory738_7(spill738_1);
        break forward_join_25;
    }
    if (!(spill738_1)) {
        break forward_join_32;
    }
    forwardValue738_25_0 = __integerCategory738_9(__call738_8(life6_17));
    }
    if (!((forwardValue738_25_0 != 0))) {
        break forward_join_32;
    }
    life5_6 = __call738_10(new java.io.FileInputStream(life6_17));
    }
    spill738_2 = life5_6;
    if (!((life4_7 != null))) {
        forwardValue738_40_0 = spill738_2;
        break forward_join_40;
    }
    if (!((spill738_2 != null))) {
        break forward_join_39;
    }
    __call738_11(p0, life5_6);
    }
    forwardValue738_40_0 = life5_6;
    }
    return forwardValue738_40_0;
}
public static net.minecraft.nbt.NBTTagCompound h738_0(java.lang.Exception p0) throws Throwable {
    throw __call3073800_0(p0);
}
public static net.minecraft.nbt.NBTTagCompound h738_1(java.lang.Exception p0) throws Throwable {
    throw __call3073801_0(p0);
}
public static net.minecraft.nbt.NBTTagCompound h738_2(java.lang.Exception p0, net.minecraft.entity.player.EntityPlayer p1, java.lang.String p2, net.minecraft.nbt.NBTTagCompound p3, java.io.File p4) throws Throwable {
    net.minecraft.nbt.NBTTagCompound spill3073802_0;
    net.minecraft.nbt.NBTTagCompound joinValue3073802_1_0;
    java.lang.Exception life4_2;
    life4_2 = p0;
    __call3073802_3(__fieldRead3073802_0(), __invokedynamic3073802_2(__call3073802_1(p1)));
    spill3073802_0 = p3;
    if ((p2 != null)) {
        if ((spill3073802_0 != null)) {
        __call3073802_4(p1, p3);
    } else {
        
    }
        joinValue3073802_1_0 = p3;
    } else {
        joinValue3073802_1_0 = spill3073802_0;
    }
    return joinValue3073802_1_0;
}
public static net.minecraft.nbt.NBTTagCompound h738_3(java.lang.Exception p0) throws Throwable {
    throw __call3073803_0(p0);
}
public static net.minecraft.nbt.NBTTagCompound h738_4(java.lang.Exception p0) throws Throwable {
    throw __call3073804_0(p0);
}
private static native long __fieldRead738_0() throws Throwable;
private static native java.lang.String __call738_1() throws Throwable;
private static native java.io.File __fieldRead738_2(net.minecraft.world.storage.SaveHandler a0) throws Throwable;
private static native java.util.UUID __call738_3(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native java.lang.String __call738_4(java.util.UUID a0) throws Throwable;
private static native java.lang.String __invokedynamic738_5(java.lang.String a0) throws Throwable;
private static native boolean __call738_6(java.io.File a0) throws Throwable;
private static native int __integerCategory738_7(boolean value) throws Throwable;
private static native boolean __call738_8(java.io.File a0) throws Throwable;
private static native int __integerCategory738_9(boolean value) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call738_10(java.io.FileInputStream a0) throws Throwable;
private static native void __call738_11(net.minecraft.entity.player.EntityPlayer a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native java.lang.Throwable __call3073800_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3073801_0(java.lang.Exception a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3073802_0() throws Throwable;
private static native java.lang.String __call3073802_1(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native java.lang.String __invokedynamic3073802_2(java.lang.String a0) throws Throwable;
private static native void __call3073802_3(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native void __call3073802_4(net.minecraft.entity.player.EntityPlayer a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native java.lang.Throwable __call3073803_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3073804_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_0e19e281a3c12c150481(net.minecraft.world.storage.SaveHandler a0, net.minecraft.world.storage.WorldInfo a1) throws E;
private static final class __SourceHandler_0e19e281a3c12c150481 {

public static void f280(net.minecraft.world.storage.SaveHandler receiver, net.minecraft.world.storage.WorldInfo p0) throws Throwable {
    int forwardValue280_58_0;
    int forwardValue280_70_0;
    int forwardValue280_75_0;
    java.lang.String spill280_0;
    boolean spill280_1;
    long life2_3;
    net.minecraft.nbt.NBTTagCompound life5_6;
    net.minecraft.nbt.NBTTagCompound life6_11;
    java.lang.String life4_12;
    java.io.File life7_23;
    java.io.File life8_30;
    java.io.File life9_37;
    forward_join_76: {
    forward_join_75: {
    forward_join_70: {
    forward_join_64: {
    forward_join_58: {
    forward_join_52: {
    life2_3 = (__fieldRead280_0() ^ 4986883791954L);
    life5_6 = __call280_1(p0);
    spill280_0 = __call280_2();
    life6_11 = new net.minecraft.nbt.NBTTagCompound();
    life4_12 = spill280_0;
    __call280_3(life6_11, "Data", life5_6);
    life7_23 = new java.io.File(__fieldRead280_4(receiver), "level.dat_new");
    life8_30 = new java.io.File(__fieldRead280_5(receiver), "level.dat_old");
    life9_37 = new java.io.File(__fieldRead280_6(receiver), "level.dat");
    __call280_7(life6_11, new java.io.FileOutputStream(life7_23));
    spill280_1 = __call280_8(life8_30);
    if (!((life4_12 != null))) {
        forwardValue280_58_0 = __integerCategory280_9(spill280_1);
        break forward_join_58;
    }
    if (!(spill280_1)) {
        break forward_join_52;
    }
    __call280_10(life8_30);
    }
    __call280_11(life9_37, life8_30);
    forwardValue280_58_0 = __integerCategory280_13(__call280_12(life9_37));
    }
    if (!((life4_12 != null))) {
        forwardValue280_70_0 = forwardValue280_58_0;
        break forward_join_70;
    }
    if (!((forwardValue280_58_0 != 0))) {
        break forward_join_64;
    }
    __call280_14(life9_37);
    }
    __call280_15(life7_23, life9_37);
    forwardValue280_70_0 = __integerCategory280_17(__call280_16(life7_23));
    }
    if (!((life4_12 != null))) {
        forwardValue280_75_0 = forwardValue280_70_0;
        break forward_join_75;
    }
    if (!((forwardValue280_70_0 != 0))) {
        break forward_join_76;
    }
    forwardValue280_75_0 = __integerCategory280_19(__call280_18(life7_23));
    }
    __discardScalar280_20(forwardValue280_75_0);
    }
    return;
}
public static void h280_0(java.lang.Exception p0) throws Throwable {
    throw __call2028000_0(p0);
}
public static void h280_1(java.lang.Exception p0) throws Throwable {
    throw __call2028001_0(p0);
}
public static void h280_2(java.lang.Exception p0) throws Throwable {
    throw __call2028002_0(p0);
}
public static void h280_3(java.lang.Exception p0) throws Throwable {
    throw __call2028003_0(p0);
}
public static void h280_4(java.lang.Exception p0) throws Throwable {
    throw __call2028004_0(p0);
}
public static void h280_5(java.lang.Exception p0) throws Throwable {
    throw __call2028005_0(p0);
}
public static void h280_6(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    __call2028006_0(local1);
    return;
}
private static native long __fieldRead280_0() throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call280_1(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native java.lang.String __call280_2() throws Throwable;
private static native void __call280_3(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, net.minecraft.nbt.NBTTagCompound a2) throws Throwable;
private static native java.io.File __fieldRead280_4(net.minecraft.world.storage.SaveHandler a0) throws Throwable;
private static native java.io.File __fieldRead280_5(net.minecraft.world.storage.SaveHandler a0) throws Throwable;
private static native java.io.File __fieldRead280_6(net.minecraft.world.storage.SaveHandler a0) throws Throwable;
private static native void __call280_7(net.minecraft.nbt.NBTTagCompound a0, java.io.FileOutputStream a1) throws Throwable;
private static native boolean __call280_8(java.io.File a0) throws Throwable;
private static native int __integerCategory280_9(boolean value) throws Throwable;
private static native boolean __call280_10(java.io.File a0) throws Throwable;
private static native boolean __call280_11(java.io.File a0, java.io.File a1) throws Throwable;
private static native boolean __call280_12(java.io.File a0) throws Throwable;
private static native int __integerCategory280_13(boolean value) throws Throwable;
private static native boolean __call280_14(java.io.File a0) throws Throwable;
private static native boolean __call280_15(java.io.File a0, java.io.File a1) throws Throwable;
private static native boolean __call280_16(java.io.File a0) throws Throwable;
private static native int __integerCategory280_17(boolean value) throws Throwable;
private static native boolean __call280_18(java.io.File a0) throws Throwable;
private static native int __integerCategory280_19(boolean value) throws Throwable;
private static native void __discardScalar280_20(int a0) throws Throwable;
private static native java.lang.Throwable __call2028000_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call2028001_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call2028002_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call2028003_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call2028004_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call2028005_0(java.lang.Exception a0) throws Throwable;
private static native void __call2028006_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_7fac967f21fa7beb1704(net.minecraft.world.storage.SaveHandler a0, net.minecraft.world.storage.WorldInfo a1, net.minecraft.nbt.NBTTagCompound a2) throws E;
private static final class __SourceHandler_7fac967f21fa7beb1704 {

public static void f281(net.minecraft.world.storage.SaveHandler receiver, net.minecraft.world.storage.WorldInfo p0, net.minecraft.nbt.NBTTagCompound p1) throws Throwable {
    int forwardValue281_59_0;
    int forwardValue281_71_0;
    int forwardValue281_76_0;
    java.lang.String spill281_0;
    boolean spill281_1;
    long life3_3;
    net.minecraft.nbt.NBTTagCompound life6_8;
    java.lang.String life5_9;
    net.minecraft.nbt.NBTTagCompound life7_13;
    java.io.File life8_24;
    java.io.File life9_31;
    java.io.File life10_38;
    forward_join_77: {
    forward_join_76: {
    forward_join_71: {
    forward_join_65: {
    forward_join_59: {
    forward_join_53: {
    life3_3 = (__fieldRead281_0() ^ 46864153804514L);
    spill281_0 = __call281_1();
    life6_8 = __call281_2(p0, p1);
    life5_9 = spill281_0;
    life7_13 = new net.minecraft.nbt.NBTTagCompound();
    __call281_3(life7_13, "Data", life6_8);
    life8_24 = new java.io.File(__fieldRead281_4(receiver), "level.dat_new");
    life9_31 = new java.io.File(__fieldRead281_5(receiver), "level.dat_old");
    life10_38 = new java.io.File(__fieldRead281_6(receiver), "level.dat");
    __call281_7(life7_13, new java.io.FileOutputStream(life8_24));
    spill281_1 = __call281_8(life9_31);
    if (!((life5_9 != null))) {
        forwardValue281_59_0 = __integerCategory281_9(spill281_1);
        break forward_join_59;
    }
    if (!(spill281_1)) {
        break forward_join_53;
    }
    __call281_10(life9_31);
    }
    __call281_11(life10_38, life9_31);
    forwardValue281_59_0 = __integerCategory281_13(__call281_12(life10_38));
    }
    if (!((life5_9 != null))) {
        forwardValue281_71_0 = forwardValue281_59_0;
        break forward_join_71;
    }
    if (!((forwardValue281_59_0 != 0))) {
        break forward_join_65;
    }
    __call281_14(life10_38);
    }
    __call281_15(life8_24, life10_38);
    forwardValue281_71_0 = __integerCategory281_17(__call281_16(life8_24));
    }
    if (!((life5_9 != null))) {
        forwardValue281_76_0 = forwardValue281_71_0;
        break forward_join_76;
    }
    if (!((forwardValue281_71_0 != 0))) {
        break forward_join_77;
    }
    forwardValue281_76_0 = __integerCategory281_19(__call281_18(life8_24));
    }
    __discardScalar281_20(forwardValue281_76_0);
    }
    return;
}
public static void h281_0(java.lang.Exception p0) throws Throwable {
    throw __call2028100_0(p0);
}
public static void h281_1(java.lang.Exception p0) throws Throwable {
    throw __call2028101_0(p0);
}
public static void h281_2(java.lang.Exception p0) throws Throwable {
    throw __call2028102_0(p0);
}
public static void h281_3(java.lang.Exception p0) throws Throwable {
    throw __call2028103_0(p0);
}
public static void h281_4(java.lang.Exception p0) throws Throwable {
    throw __call2028104_0(p0);
}
public static void h281_5(java.lang.Exception p0) throws Throwable {
    throw __call2028105_0(p0);
}
public static void h281_6(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    __call2028106_0(local1);
    return;
}
private static native long __fieldRead281_0() throws Throwable;
private static native java.lang.String __call281_1() throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call281_2(net.minecraft.world.storage.WorldInfo a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native void __call281_3(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, net.minecraft.nbt.NBTTagCompound a2) throws Throwable;
private static native java.io.File __fieldRead281_4(net.minecraft.world.storage.SaveHandler a0) throws Throwable;
private static native java.io.File __fieldRead281_5(net.minecraft.world.storage.SaveHandler a0) throws Throwable;
private static native java.io.File __fieldRead281_6(net.minecraft.world.storage.SaveHandler a0) throws Throwable;
private static native void __call281_7(net.minecraft.nbt.NBTTagCompound a0, java.io.FileOutputStream a1) throws Throwable;
private static native boolean __call281_8(java.io.File a0) throws Throwable;
private static native int __integerCategory281_9(boolean value) throws Throwable;
private static native boolean __call281_10(java.io.File a0) throws Throwable;
private static native boolean __call281_11(java.io.File a0, java.io.File a1) throws Throwable;
private static native boolean __call281_12(java.io.File a0) throws Throwable;
private static native int __integerCategory281_13(boolean value) throws Throwable;
private static native boolean __call281_14(java.io.File a0) throws Throwable;
private static native boolean __call281_15(java.io.File a0, java.io.File a1) throws Throwable;
private static native boolean __call281_16(java.io.File a0) throws Throwable;
private static native int __integerCategory281_17(boolean value) throws Throwable;
private static native boolean __call281_18(java.io.File a0) throws Throwable;
private static native int __integerCategory281_19(boolean value) throws Throwable;
private static native void __discardScalar281_20(int a0) throws Throwable;
private static native java.lang.Throwable __call2028100_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call2028101_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call2028102_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call2028103_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call2028104_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call2028105_0(java.lang.Exception a0) throws Throwable;
private static native void __call2028106_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String[] __sourceHandlerCall_8ad6d986a8e63f2dc3ca(net.minecraft.world.storage.SaveHandler a0) throws E;
private static final class __SourceHandler_8ad6d986a8e63f2dc3ca {

public static java.lang.String[] f1853(net.minecraft.world.storage.SaveHandler receiver) throws Throwable {
    java.lang.String[] lexicalValue1853_16_0;
    java.lang.String[] lexicalValue1853_35_0;
    int lexicalValue1853_35_1;
    java.lang.String[] lexicalValue1853_51_0;
    java.lang.String spill1853_0;
    java.lang.String[] spill1853_1;
    java.lang.String[] spill1853_2;
    int spill1853_3;
    long life1_3;
    java.lang.String[] life4_8;
    java.lang.String life3_9;
    int life5_24;
    lexical_join_51: {
    lexical_join_50: {
    lexical_join_17: {
    lexical_join_16: {
    life1_3 = (__fieldRead1853_0() ^ 82043500283591L);
    spill1853_0 = __call1853_1();
    life4_8 = __call1853_3(__fieldRead1853_2(receiver));
    life3_9 = spill1853_0;
    spill1853_1 = life4_8;
    if (!((life3_9 != null))) {
        lexicalValue1853_16_0 = spill1853_1;
        break lexical_join_16;
    }
    if (!((spill1853_1 == null))) {
        break lexical_join_17;
    }
    lexicalValue1853_16_0 = new java.lang.String[0];
    }
    life4_8 = lexicalValue1853_16_0;
    }
    life5_24 = 0;
    lexical_cycle_19: while (true) {
    lexical_join_47: {
    lexical_join_35: {
    if (!((life5_24 < (life4_8).length))) {
        break lexical_join_50;
    }
    spill1853_2 = life4_8;
    if (!((life3_9 != null))) {
        lexicalValue1853_51_0 = spill1853_2;
        break lexical_join_51;
    }
    spill1853_3 = life5_24;
    if (!((life3_9 != null))) {
        lexicalValue1853_35_0 = spill1853_2;
        lexicalValue1853_35_1 = spill1853_3;
        break lexical_join_35;
    }
    if (!(__call1853_4((spill1853_2)[spill1853_3], ".dat"))) {
        break lexical_join_47;
    }
    lexicalValue1853_35_0 = life4_8;
    lexicalValue1853_35_1 = life5_24;
    }
    (lexicalValue1853_35_0)[lexicalValue1853_35_1] = __call1853_6((life4_8)[life5_24], 0, (__call1853_5((life4_8)[life5_24]) - 4));
    }
    life5_24 += 1;
    if (!((life3_9 == null))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    lexicalValue1853_51_0 = life4_8;
    }
    return lexicalValue1853_51_0;
}
public static void h1853_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1185300_0(p0);
}
public static void h1853_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1185301_0(p0);
}
public static void h1853_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1185302_0(p0);
}
public static void h1853_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call1185303_0(p0);
}
public static void h1853_4(java.lang.RuntimeException p0) throws Throwable {
    throw __call1185304_0(p0);
}
private static native long __fieldRead1853_0() throws Throwable;
private static native java.lang.String __call1853_1() throws Throwable;
private static native java.io.File __fieldRead1853_2(net.minecraft.world.storage.SaveHandler a0) throws Throwable;
private static native java.lang.String[] __call1853_3(java.io.File a0) throws Throwable;
private static native boolean __call1853_4(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __call1853_5(java.lang.String a0) throws Throwable;
private static native java.lang.String __call1853_6(java.lang.String a0, int a1, int a2) throws Throwable;
private static native java.lang.Throwable __call1185300_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Throwable __call1185301_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Throwable __call1185302_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Throwable __call1185303_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Throwable __call1185304_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.world.storage.WorldInfo __sourceHandlerCall_ed1824d48a330b2409f6(net.minecraft.world.storage.SaveHandler a0) throws E;
private static final class __SourceHandler_ed1824d48a330b2409f6 {

public static net.minecraft.world.storage.WorldInfo f739(net.minecraft.world.storage.SaveHandler receiver) throws Throwable {
    java.lang.String spill739_0;
    boolean spill739_1;
    boolean joinValue739_0_0;
    long life1_3;
    java.io.File life4_11;
    java.lang.String life3_12;
    net.minecraft.nbt.NBTTagCompound life5_26;
    net.minecraft.nbt.NBTTagCompound life6_30;
    net.minecraft.nbt.NBTTagCompound life5_54;
    net.minecraft.nbt.NBTTagCompound life6_58;
    life1_3 = (__fieldRead739_0() ^ 94181923298252L);
    spill739_0 = __call739_1();
    life4_11 = new java.io.File(__fieldRead739_2(receiver), "level.dat");
    life3_12 = spill739_0;
    spill739_1 = __call739_3(life4_11);
    if ((life3_12 != null)) {
        if (spill739_1) {
        life5_26 = __call739_4(new java.io.FileInputStream(life4_11));
        life6_30 = __call739_5(life5_26, "Data");
        return new net.minecraft.world.storage.WorldInfo(life6_30);
    }
        life4_11 = new java.io.File(__fieldRead739_6(receiver), "level.dat_old");
        joinValue739_0_0 = __call739_7(life4_11);
    } else {
        joinValue739_0_0 = spill739_1;
    }
    if (joinValue739_0_0) {
        life5_54 = __call739_8(new java.io.FileInputStream(life4_11));
        life6_58 = __call739_9(life5_54, "Data");
        return new net.minecraft.world.storage.WorldInfo(life6_58);
    }
    return null;
}
public static net.minecraft.world.storage.WorldInfo h739_0(java.lang.Exception p0) throws Throwable {
    throw __call3073900_0(p0);
}
public static net.minecraft.world.storage.WorldInfo h739_1(java.lang.Exception p0, net.minecraft.world.storage.SaveHandler p1, java.io.File p2, net.minecraft.nbt.NBTTagCompound p3, net.minecraft.nbt.NBTTagCompound p4) throws Throwable {
    java.lang.Exception life3_2;
    java.io.File life2_11;
    net.minecraft.nbt.NBTTagCompound life3_20;
    net.minecraft.nbt.NBTTagCompound life4_24;
    life3_2 = p0;
    __call3073901_0(life3_2);
    life2_11 = new java.io.File(__fieldRead3073901_1(p1), "level.dat_old");
    if (__call3073901_2(life2_11)) {
        life3_20 = __call3073901_3(new java.io.FileInputStream(life2_11));
        life4_24 = __call3073901_4(life3_20, "Data");
        return new net.minecraft.world.storage.WorldInfo(life4_24);
    }
    return null;
}
public static net.minecraft.world.storage.WorldInfo h739_2(java.lang.Exception p0, net.minecraft.nbt.NBTTagCompound p1) throws Throwable {
    java.lang.Exception life1_2;
    life1_2 = p0;
    __call3073902_0(life1_2);
    return null;
}
private static native long __fieldRead739_0() throws Throwable;
private static native java.lang.String __call739_1() throws Throwable;
private static native java.io.File __fieldRead739_2(net.minecraft.world.storage.SaveHandler a0) throws Throwable;
private static native boolean __call739_3(java.io.File a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call739_4(java.io.FileInputStream a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call739_5(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native java.io.File __fieldRead739_6(net.minecraft.world.storage.SaveHandler a0) throws Throwable;
private static native boolean __call739_7(java.io.File a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call739_8(java.io.FileInputStream a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call739_9(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native java.lang.Throwable __call3073900_0(java.lang.Exception a0) throws Throwable;
private static native void __call3073901_0(java.lang.Exception a0) throws Throwable;
private static native java.io.File __fieldRead3073901_1(net.minecraft.world.storage.SaveHandler a0) throws Throwable;
private static native boolean __call3073901_2(java.io.File a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call3073901_3(java.io.FileInputStream a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call3073901_4(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __call3073902_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5505e99457b54c3330b1(net.minecraft.world.storage.SaveHandler a0) throws E;
private static final class __SourceHandler_5505e99457b54c3330b1 {

public static void f740(net.minecraft.world.storage.SaveHandler receiver) throws Throwable {
    java.io.DataInputStream forestValue740_35_0;
    java.io.DataInputStream spill740_0;
    long life1_3;
    java.lang.String life3_5;
    java.io.File life4_12;
    java.io.DataInputStream life5_20;
    forest_join_35: {
    forest_join_34: {
    life1_3 = (__fieldRead740_0() ^ 15531542392783L);
    life3_5 = __call740_1();
    life4_12 = new java.io.File(__fieldRead740_2(receiver), "session.lock");
    life5_20 = new java.io.DataInputStream(new java.io.FileInputStream(life4_12));
    spill740_0 = life5_20;
    if (!((life3_5 != null))) {
        forestValue740_35_0 = spill740_0;
        break forest_join_35;
    }
    if (!((__numericCompare740_5(__call740_3(spill740_0), __fieldRead740_4(receiver)) != 0))) {
        break forest_join_34;
    }
    throw new net.minecraft.world.MinecraftException("The save is being accessed from another location, aborting");
    }
    forestValue740_35_0 = life5_20;
    }
    __call740_6(forestValue740_35_0);
    return;
}
public static void h740_0(java.lang.Throwable p0) throws Throwable {
    throw __call3074000_0(p0);
}
public static void h740_1(java.lang.Throwable p0) throws Throwable {
    throw __call3074001_0(p0);
}
public static void h740_2(java.lang.Throwable p0, java.io.DataInputStream p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3074002_0(p1);
    throw life2_2;
}
public static void h740_3(java.lang.Throwable p0, java.lang.Throwable p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3074003_0(p1, life2_2);
    throw p1;
}
public static void h740_4(java.io.IOException p0) throws Throwable {
    java.io.IOException life1_2;
    life1_2 = p0;
    throw new net.minecraft.world.MinecraftException("Failed to check session lock, aborting");
}
private static native long __fieldRead740_0() throws Throwable;
private static native java.lang.String __call740_1() throws Throwable;
private static native java.io.File __fieldRead740_2(net.minecraft.world.storage.SaveHandler a0) throws Throwable;
private static native long __call740_3(java.io.DataInputStream a0) throws Throwable;
private static native long __fieldRead740_4(net.minecraft.world.storage.SaveHandler a0) throws Throwable;
private static native int __numericCompare740_5(long a0, long a1) throws Throwable;
private static native void __call740_6(java.io.DataInputStream a0) throws Throwable;
private static native java.lang.Throwable __call3074000_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3074001_0(java.lang.Throwable a0) throws Throwable;
private static native void __call3074002_0(java.io.DataInputStream a0) throws Throwable;
private static native void __call3074003_0(java.lang.Throwable a0, java.lang.Throwable a1) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_73287a5d96146794169e(net.minecraft.world.storage.SaveHandler a0, net.minecraft.entity.player.EntityPlayer a1) throws E;
private static final class __SourceHandler_73287a5d96146794169e {

public static void f282(net.minecraft.world.storage.SaveHandler receiver, net.minecraft.entity.player.EntityPlayer p0) throws Throwable {
    int forwardValue282_50_0;
    boolean spill282_0;
    long life2_3;
    java.lang.String life4_5;
    net.minecraft.nbt.NBTTagCompound life5_9;
    java.io.File life6_22;
    java.io.File life7_32;
    forward_join_50: {
    forward_join_47: {
    life2_3 = (__fieldRead282_0() ^ 15798473753427L);
    life4_5 = __call282_1();
    life5_9 = new net.minecraft.nbt.NBTTagCompound();
    __call282_2(p0, life5_9);
    life6_22 = new java.io.File(__fieldRead282_3(receiver), __invokedynamic282_6(__call282_5(__call282_4(p0))));
    life7_32 = new java.io.File(__fieldRead282_7(receiver), __invokedynamic282_10(__call282_9(__call282_8(p0))));
    __call282_11(life5_9, new java.io.FileOutputStream(life6_22));
    spill282_0 = __call282_12(life7_32);
    if (!((life4_5 != null))) {
        forwardValue282_50_0 = __integerCategory282_13(spill282_0);
        break forward_join_50;
    }
    if (!(spill282_0)) {
        break forward_join_47;
    }
    __call282_14(life7_32);
    }
    forwardValue282_50_0 = __integerCategory282_16(__call282_15(life6_22, life7_32));
    }
    __discardScalar282_17(forwardValue282_50_0);
    return;
}
public static void h282_0(java.lang.Exception p0) throws Throwable {
    throw __call2028200_0(p0);
}
public static void h282_1(java.lang.Exception p0) throws Throwable {
    throw __call2028201_0(p0);
}
public static void h282_2(java.lang.Exception p0, net.minecraft.entity.player.EntityPlayer p1) throws Throwable {
    java.lang.Exception local2 = p0;
    __call2028202_3(__fieldRead2028202_0(), __invokedynamic2028202_2(__call2028202_1(p1)));
    return;
}
private static native long __fieldRead282_0() throws Throwable;
private static native java.lang.String __call282_1() throws Throwable;
private static native void __call282_2(net.minecraft.entity.player.EntityPlayer a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native java.io.File __fieldRead282_3(net.minecraft.world.storage.SaveHandler a0) throws Throwable;
private static native java.util.UUID __call282_4(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native java.lang.String __call282_5(java.util.UUID a0) throws Throwable;
private static native java.lang.String __invokedynamic282_6(java.lang.String a0) throws Throwable;
private static native java.io.File __fieldRead282_7(net.minecraft.world.storage.SaveHandler a0) throws Throwable;
private static native java.util.UUID __call282_8(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native java.lang.String __call282_9(java.util.UUID a0) throws Throwable;
private static native java.lang.String __invokedynamic282_10(java.lang.String a0) throws Throwable;
private static native void __call282_11(net.minecraft.nbt.NBTTagCompound a0, java.io.FileOutputStream a1) throws Throwable;
private static native boolean __call282_12(java.io.File a0) throws Throwable;
private static native int __integerCategory282_13(boolean value) throws Throwable;
private static native boolean __call282_14(java.io.File a0) throws Throwable;
private static native boolean __call282_15(java.io.File a0, java.io.File a1) throws Throwable;
private static native int __integerCategory282_16(boolean value) throws Throwable;
private static native void __discardScalar282_17(int a0) throws Throwable;
private static native java.lang.Throwable __call2028200_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call2028201_0(java.lang.Exception a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead2028202_0() throws Throwable;
private static native java.lang.String __call2028202_1(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native java.lang.String __invokedynamic2028202_2(java.lang.String a0) throws Throwable;
private static native void __call2028202_3(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_6c5a9e3a8330d8a90f4e(net.minecraft.world.storage.SaveHandler a0) throws E;
private static final class __SourceHandler_6c5a9e3a8330d8a90f4e {

public static void f741(net.minecraft.world.storage.SaveHandler receiver) throws Throwable {
    java.io.File life1_6;
    java.io.DataOutputStream life2_14;
    life1_6 = new java.io.File(__fieldRead741_0(receiver), "session.lock");
    life2_14 = new java.io.DataOutputStream(new java.io.FileOutputStream(life1_6));
    __call741_2(life2_14, __fieldRead741_1(receiver));
    __call741_3(life2_14);
    return;
}
public static void h741_0(java.lang.Throwable p0, java.io.DataOutputStream p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3074100_0(p1);
    throw life2_2;
}
public static void h741_1(java.lang.Throwable p0, java.lang.Throwable p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3074101_0(p1, life2_2);
    throw p1;
}
public static void h741_2(java.io.IOException p0) throws Throwable {
    java.io.IOException life1_2;
    life1_2 = p0;
    __call3074102_0(life1_2);
    throw new java.lang.RuntimeException("Failed to check session lock, aborting");
}
private static native java.io.File __fieldRead741_0(net.minecraft.world.storage.SaveHandler a0) throws Throwable;
private static native long __fieldRead741_1(net.minecraft.world.storage.SaveHandler a0) throws Throwable;
private static native void __call741_2(java.io.DataOutputStream a0, long a1) throws Throwable;
private static native void __call741_3(java.io.DataOutputStream a0) throws Throwable;
private static native void __call3074100_0(java.io.DataOutputStream a0) throws Throwable;
private static native void __call3074101_0(java.lang.Throwable a0, java.lang.Throwable a1) throws Throwable;
private static native void __call3074102_0(java.io.IOException a0) throws Throwable;

}


public void b() {
return;
}


private void c() { __sourceHandlerCall_6c5a9e3a8330d8a90f4e(this); }


public java.lang.String[] a__ArrayString() { return __sourceHandlerCall_8ad6d986a8e63f2dc3ca(this); }


public net.minecraft.nbt.NBTTagCompound a(net.minecraft.entity.player.EntityPlayer p0) { return __sourceHandlerCall_abe3fc68a0cd0f5c49ad(this, p0); }


public net.minecraft.world.storage.IPlayerFileData a__IJ() {
return this;
}


public java.io.File a(java.lang.String p0) {
return new java.io.File(this.d, __sourceIntrinsic_ad5e12f6b946_originalDynamicSite2081_1(p0));
}


public java.lang.String a__String() {
return this.f;
}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


public net.minecraft.world.storage.WorldInfo a__IX() { return __sourceHandlerCall_ed1824d48a330b2409f6(this); }


public net.minecraft.world.chunk.storage.IChunkLoader a(moom.EA p0) {
throw new java.lang.RuntimeException("Old Chunk Storage is no longer supported.");
}


public void a__Void() throws net.minecraft.world.MinecraftException { __sourceHandlerCall_5505e99457b54c3330b1(this); }


public java.io.File a() {
return this.b;
}


public void a(net.minecraft.world.storage.WorldInfo p0, net.minecraft.nbt.NBTTagCompound p1) { __sourceHandlerCall_7fac967f21fa7beb1704(this, p0, p1); }


public void a(net.minecraft.world.storage.WorldInfo p0) { __sourceHandlerCall_0e19e281a3c12c150481(this, p0); }


public void a__Void(net.minecraft.entity.player.EntityPlayer p0) { __sourceHandlerCall_73287a5d96146794169e(this, p0); }


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ad5e12f6b946_originalDynamicSite2081_1(java.lang.String a0) throws E;
}
