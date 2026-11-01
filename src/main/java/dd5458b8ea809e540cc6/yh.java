package moom;


public class yh {

private static long a;

public yh() {
super();
}


static {
moom.yh.a = (moom._c.a(-1818602345954749984L, -4046372807028917264L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(236405010801040L);
}

private static native <E extends Throwable> net.minecraft.nbt.NBTBase __sourceHandlerCall_ee8772bf6a6549bc586a(java.io.DataInput a0, int a1, moom.yB a2) throws E;
private static final class __SourceHandler_ee8772bf6a6549bc586a {

public static net.minecraft.nbt.NBTBase f460(java.io.DataInput p0, int p1, moom.yB p2) throws Throwable {
    int forwardValue460_21_0;
    java.lang.String spill460_0;
    int spill460_1;
    long life3_3;
    int life6_7;
    java.lang.String life5_8;
    net.minecraft.nbt.NBTBase life7_27;
    forward_join_21: {
    forward_join_17: {
    life3_3 = (__fieldRead460_0() ^ 107809876723120L);
    spill460_0 = __call460_1();
    life6_7 = __call460_2(p0);
    life5_8 = spill460_0;
    spill460_1 = life6_7;
    if (!((life5_8 == null))) {
        forwardValue460_21_0 = spill460_1;
        break forward_join_21;
    }
    if (!((spill460_1 == 0))) {
        break forward_join_17;
    }
    return new moom.yx();
    }
    __call460_3(p0);
    forwardValue460_21_0 = life6_7;
    }
    life7_27 = __call460_4(forwardValue460_21_0);
    __call460_5(life7_27, p0, p1, p2);
    return life7_27;
}
public static net.minecraft.nbt.NBTBase h460_0(java.io.IOException p0) throws Throwable {
    throw __call2046000_0(p0);
}
public static net.minecraft.nbt.NBTBase h460_1(java.io.IOException p0) throws Throwable {
    throw __call2046001_0(p0);
}
public static net.minecraft.nbt.NBTBase h460_2(java.io.IOException p0, int p1) throws Throwable {
    java.io.IOException local2 = p0;
    moom.qY local3 = __call2046002_0(local2, "Loading NBT data");
    moom.qZ local4 = __call2046002_1(local3, "NBT Tag");
    __call2046002_2(local4, "Tag name", "[UNNAMED TAG]");
    __call2046002_4(local4, "Tag type", __call2046002_3(p1));
    throw new moom.Oo(local3);
}
private static native long __fieldRead460_0() throws Throwable;
private static native java.lang.String __call460_1() throws Throwable;
private static native byte __call460_2(java.io.DataInput a0) throws Throwable;
private static native java.lang.String __call460_3(java.io.DataInput a0) throws Throwable;
private static native net.minecraft.nbt.NBTBase __call460_4(int a0) throws Throwable;
private static native void __call460_5(net.minecraft.nbt.NBTBase a0, java.io.DataInput a1, int a2, moom.yB a3) throws Throwable;
private static native java.io.IOException __call2046000_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call2046001_0(java.io.IOException a0) throws Throwable;
private static native moom.qY __call2046002_0(java.io.IOException a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call2046002_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native void __call2046002_2(moom.qZ a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.Byte __call2046002_3(int a0) throws Throwable;
private static native void __call2046002_4(moom.qZ a0, java.lang.String a1, java.lang.Byte a2) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.nbt.NBTTagCompound __sourceHandlerCall_84d9e94cf1c2c3b7dfec(java.io.File a0) throws E;
private static final class __SourceHandler_84d9e94cf1c2c3b7dfec {

public static net.minecraft.nbt.NBTTagCompound f525(java.io.File p0) throws Throwable {
    long life1_3;
    java.io.DataInputStream life3_18;
    net.minecraft.nbt.NBTTagCompound life4_22;
    life1_3 = (__fieldRead525_0() ^ 57185723339545L);
    if ((!__call525_1(p0))) {
        return null;
    }
    life3_18 = new java.io.DataInputStream(new java.io.FileInputStream(p0));
    life4_22 = __call525_3(life3_18, __fieldRead525_2());
    __call525_4(life3_18);
    return life4_22;
}
public static net.minecraft.nbt.NBTTagCompound h525_0(java.io.IOException p0) throws Throwable {
    throw __call2052500_0(p0);
}
public static net.minecraft.nbt.NBTTagCompound h525_1(java.lang.Throwable p0, java.io.DataInputStream p1) throws Throwable {
    java.lang.Throwable local2 = p0;
    __call2052501_0(p1);
    throw local2;
}
private static native long __fieldRead525_0() throws Throwable;
private static native boolean __call525_1(java.io.File a0) throws Throwable;
private static native moom.yB __fieldRead525_2() throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call525_3(java.io.DataInputStream a0, moom.yB a1) throws Throwable;
private static native void __call525_4(java.io.DataInputStream a0) throws Throwable;
private static native java.io.IOException __call2052500_0(java.io.IOException a0) throws Throwable;
private static native void __call2052501_0(java.io.DataInputStream a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.nbt.NBTTagCompound __sourceHandlerCall_46145e108cb1a9a265b9(java.io.InputStream a0) throws E;
private static final class __SourceHandler_46145e108cb1a9a265b9 {

public static net.minecraft.nbt.NBTTagCompound f526(java.io.InputStream p0) throws Throwable {
    java.io.DataInputStream life1_10;
    net.minecraft.nbt.NBTTagCompound life2_14;
    life1_10 = new java.io.DataInputStream(new java.io.BufferedInputStream(new java.util.zip.GZIPInputStream(p0)));
    life2_14 = __call526_1(life1_10, __fieldRead526_0());
    __call526_2(life1_10);
    return life2_14;
}
public static net.minecraft.nbt.NBTTagCompound h526_0(java.lang.Throwable p0, java.io.DataInputStream p1) throws Throwable {
    java.lang.Throwable local2 = p0;
    __call2052600_0(p1);
    throw local2;
}
private static native moom.yB __fieldRead526_0() throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call526_1(java.io.DataInputStream a0, moom.yB a1) throws Throwable;
private static native void __call526_2(java.io.DataInputStream a0) throws Throwable;
private static native void __call2052600_0(java.io.DataInputStream a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_9d32aa1abef80b813ea5(net.minecraft.nbt.NBTTagCompound a0, java.io.OutputStream a1) throws E;
private static final class __SourceHandler_9d32aa1abef80b813ea5 {

public static void f100136(net.minecraft.nbt.NBTTagCompound p0, java.io.OutputStream p1) throws Throwable {
    java.io.DataOutputStream life2_10;
    life2_10 = new java.io.DataOutputStream(new java.io.BufferedOutputStream(new java.util.zip.GZIPOutputStream(p1)));
    __call100136_0(p0, life2_10);
    __call100136_1(life2_10);
    return;
}
public static void h100136_0(java.lang.Throwable p0, java.io.DataOutputStream p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call13013600_0(p1);
    throw life2_2;
}
public static void h100136_1(java.lang.Throwable p0, java.lang.Throwable p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call13013601_0(p1, life2_2);
    throw p1;
}
private static native void __call100136_0(net.minecraft.nbt.NBTTagCompound a0, java.io.DataOutputStream a1) throws Throwable;
private static native void __call100136_1(java.io.DataOutputStream a0) throws Throwable;
private static native void __call13013600_0(java.io.DataOutputStream a0) throws Throwable;
private static native void __call13013601_0(java.lang.Throwable a0, java.lang.Throwable a1) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_941565fc1bd5dfa5c049(net.minecraft.nbt.NBTTagCompound a0, java.io.File a1) throws E;
private static final class __SourceHandler_941565fc1bd5dfa5c049 {

public static void f100135(net.minecraft.nbt.NBTTagCompound p0, java.io.File p1) throws Throwable {
    java.io.DataOutputStream life2_7;
    life2_7 = new java.io.DataOutputStream(new java.io.FileOutputStream(p1));
    __call100135_0(p0, life2_7);
    __call100135_1(life2_7);
    return;
}
public static void h100135_0(java.lang.Throwable p0, java.io.DataOutputStream p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call13013500_0(p1);
    throw life2_2;
}
public static void h100135_1(java.lang.Throwable p0, java.lang.Throwable p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call13013501_0(p1, life2_2);
    throw p1;
}
private static native void __call100135_0(net.minecraft.nbt.NBTTagCompound a0, java.io.DataOutputStream a1) throws Throwable;
private static native void __call100135_1(java.io.DataOutputStream a0) throws Throwable;
private static native void __call13013500_0(java.io.DataOutputStream a0) throws Throwable;
private static native void __call13013501_0(java.lang.Throwable a0, java.lang.Throwable a1) throws Throwable;

}


public static void b(net.minecraft.nbt.NBTTagCompound p0, java.io.File p1) throws java.io.IOException { __sourceHandlerCall_941565fc1bd5dfa5c049(p0, p1); }


public static net.minecraft.nbt.NBTTagCompound a(java.io.DataInput p0, moom.yB p1) throws java.io.IOException {
net.minecraft.nbt.NBTBase forwardValue4572_17_0;
    java.lang.String spill4572_0;
    net.minecraft.nbt.NBTBase spill4572_1;
    long life2_3;
    net.minecraft.nbt.NBTBase life5_9;
    java.lang.String life4_10;
    forward_join_19: {
    forward_join_17: {
    life2_3 = (moom.yh.a ^ 73073011488407L);
    spill4572_0 = net.minecraft.nbt.NBTBase.b();
    life5_9 = moom.yh.a(((java.io.DataInput)(p0)), ((int)(0)), ((moom.yB)(p1)));
    life4_10 = spill4572_0;
    spill4572_1 = life5_9;
    if (!((life4_10 == null))) {
        forwardValue4572_17_0 = spill4572_1;
        break forward_join_17;
    }
    if (!((((spill4572_1 instanceof net.minecraft.nbt.NBTTagCompound) ? 1 : 0) != 0))) {
        break forward_join_19;
    }
    forwardValue4572_17_0 = life5_9;
    }
    return ((net.minecraft.nbt.NBTTagCompound)(forwardValue4572_17_0));
    }
    throw new java.io.IOException("Root tag must be a named compound tag");
}


public static void a(net.minecraft.nbt.NBTTagCompound p0, java.io.DataOutput p1) throws java.io.IOException {
moom.yh.a(((net.minecraft.nbt.NBTBase)(p0)), ((java.io.DataOutput)(p1)));
    return;
}


private static void a(net.minecraft.nbt.NBTBase p0, java.io.DataOutput p1) throws java.io.IOException {
net.minecraft.nbt.NBTBase forwardValue4573_19_0;
    java.lang.String spill4573_0;
    net.minecraft.nbt.NBTBase spill4573_1;
    long life2_3;
    java.lang.String life4_9;
    forward_join_21: {
    forward_join_19: {
    life2_3 = (moom.yh.a ^ 19284085496241L);
    spill4573_0 = net.minecraft.nbt.NBTBase.b();
    ((java.io.DataOutput)(p1)).writeByte(((int)(((net.minecraft.nbt.NBTBase)(p0)).a())));
    life4_9 = spill4573_0;
    spill4573_1 = p0;
    if (!((life4_9 == null))) {
        forwardValue4573_19_0 = spill4573_1;
        break forward_join_19;
    }
    if (!((((net.minecraft.nbt.NBTBase)(spill4573_1)).a() != 0))) {
        break forward_join_21;
    }
    ((java.io.DataOutput)(p1)).writeUTF(((java.lang.String)("")));
    forwardValue4573_19_0 = p0;
    }
    ((net.minecraft.nbt.NBTBase)(forwardValue4573_19_0)).a(((java.io.DataOutput)(p1)));
    }
    return;
}


private static java.io.IOException a(java.io.IOException p0) {
return p0;
}


private static net.minecraft.nbt.NBTBase a(java.io.DataInput p0, int p1, moom.yB p2) throws java.io.IOException { return __sourceHandlerCall_ee8772bf6a6549bc586a(p0, p1, p2); }


public static net.minecraft.nbt.NBTTagCompound a(java.io.InputStream p0) throws java.io.IOException { return __sourceHandlerCall_46145e108cb1a9a265b9(p0); }


public static void a(net.minecraft.nbt.NBTTagCompound p0, java.io.OutputStream p1) throws java.io.IOException { __sourceHandlerCall_9d32aa1abef80b813ea5(p0, p1); }


public static void a(net.minecraft.nbt.NBTTagCompound p0, java.io.File p1) throws java.io.IOException {
int forwardValue4574_26_0;
    int forwardValue4574_34_0;
    int forwardValue4574_46_0;
    java.lang.String spill4574_0;
    boolean spill4574_1;
    long life2_3;
    java.io.File life5_11;
    java.lang.String life4_12;
    forward_join_46: {
    forward_join_43: {
    forward_join_34: {
    forward_join_32: {
    forward_join_26: {
    forward_join_21: {
    life2_3 = (moom.yh.a ^ 83198477852079L);
    spill4574_0 = net.minecraft.nbt.NBTBase.b();
    life5_11 = new java.io.File(__sourceIntrinsic_7b2335d9942e_invokedynamic4574_3(((java.io.File)(p1)).getAbsolutePath()));
    life4_12 = spill4574_0;
    spill4574_1 = ((java.io.File)(life5_11)).exists();
    if (!((life4_12 == null))) {
        forwardValue4574_26_0 = ((spill4574_1) ? 1 : 0);
        break forward_join_26;
    }
    if (!(spill4574_1)) {
        break forward_join_21;
    }
    ((java.io.File)(life5_11)).delete();
    }
    moom.yh.b(((net.minecraft.nbt.NBTTagCompound)(p0)), ((java.io.File)(life5_11)));
    forwardValue4574_26_0 = ((((java.io.File)(p1)).exists()) ? 1 : 0);
    }
    if (!((life4_12 == null))) {
        forwardValue4574_34_0 = forwardValue4574_26_0;
        break forward_join_34;
    }
    if (!((forwardValue4574_26_0 != 0))) {
        break forward_join_32;
    }
    ((java.io.File)(p1)).delete();
    }
    forwardValue4574_34_0 = ((((java.io.File)(p1)).exists()) ? 1 : 0);
    }
    if (!((life4_12 == null))) {
        forwardValue4574_46_0 = forwardValue4574_34_0;
        break forward_join_46;
    }
    if (!((forwardValue4574_34_0 != 0))) {
        break forward_join_43;
    }
    throw new java.io.IOException(__sourceIntrinsic_7b2335d9942e_invokedynamic4574_13(p1));
    }
    forwardValue4574_46_0 = ((((java.io.File)(life5_11)).renameTo(((java.io.File)(p1)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4574_46_0);
    return;
}


public static net.minecraft.nbt.NBTTagCompound a(java.io.File p0) throws java.io.IOException { return __sourceHandlerCall_84d9e94cf1c2c3b7dfec(p0); }


public static net.minecraft.nbt.NBTTagCompound a(java.io.DataInputStream p0) throws java.io.IOException {
return moom.yh.a(((java.io.DataInput)(p0)), ((moom.yB)(moom.yB.a)));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7b2335d9942e_invokedynamic4574_3(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7b2335d9942e_invokedynamic4574_13(java.io.File a0) throws E;
}
