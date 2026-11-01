package moom;


public class G1 {

private static org.apache.logging.log4j.Logger a;

private static java.util.Map<java.lang.String, java.lang.Class<? extends moom.Ir>> b;

private static java.util.Map<java.lang.Class<? extends moom.Ir>, java.lang.String> c;

private static java.util.Map<java.lang.String, java.lang.Class<? extends moom.G4>> d;

private static java.util.Map<java.lang.Class<? extends moom.G4>, java.lang.String> e;

private static long f;

public G1() {
super();
}


static {
moom.G1.f = (moom._c.a(-9089992786882295591L, -6086859225157916232L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(14051592175875L);
    moom.G1.a = org.apache.logging.log4j.LogManager.getLogger();
    moom.G1.b = com.google.common.collect.Maps.newHashMap();
    moom.G1.c = com.google.common.collect.Maps.newHashMap();
    moom.G1.d = com.google.common.collect.Maps.newHashMap();
    moom.G1.e = com.google.common.collect.Maps.newHashMap();
    moom.G1.a(moom.Iw.class, "Mineshaft");
    moom.G1.a(moom.Iv.class, "Village");
    moom.G1.a(moom.Is.class, "Fortress");
    moom.G1.a(moom.Iu.class, "Stronghold");
    moom.G1.a(moom.It.class, "Temple");
    moom.G1.a(moom.Ix.class, "Monument");
    net.minecraft.world.gen.structure.StructureMineshaftPieces.a();
    moom.ID.a();
    net.minecraft.world.gen.structure.StructureNetherBridgePieces.a();
    net.minecraft.world.gen.structure.StructureStrongholdPieces.a();
    net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces.a();
    net.minecraft.world.gen.structure.StructureOceanMonumentPieces.a();
}

private static native <E extends Throwable> moom.G4 __sourceHandlerCall_335b3eeb0e84655f4008(net.minecraft.nbt.NBTTagCompound a0, net.minecraft.world.World a1) throws E;
private static final class __SourceHandler_335b3eeb0e84655f4008 {

public static moom.G4 f262(net.minecraft.nbt.NBTTagCompound p0, net.minecraft.world.World p1) throws Throwable {
    java.lang.Object forwardValue262_21_0;
    moom.G4 forwardValue262_28_0;
    net.minecraft.entity.Entity[] spill262_0;
    java.lang.Class spill262_1;
    moom.G4 spill262_2;
    long life2_3;
    moom.G4 life5_6;
    net.minecraft.entity.Entity[] life4_7;
    java.lang.Class life6_14;
    forward_join_39: {
    forward_join_33: {
    forward_join_28: {
    forward_join_23: {
    forward_join_21: {
    life2_3 = (__fieldRead262_0() ^ 91902813900411L);
    spill262_0 = __call262_1();
    life5_6 = null;
    life4_7 = spill262_0;
    life6_14 = __cast262_5(__call262_4(__fieldRead262_2(), __call262_3(p0, "id")));
    spill262_1 = life6_14;
    if (!((life4_7 != null))) {
        forwardValue262_21_0 = spill262_1;
        break forward_join_21;
    }
    if (!((spill262_1 != null))) {
        break forward_join_23;
    }
    forwardValue262_21_0 = __call262_6(life6_14);
    }
    life5_6 = __cast262_7(forwardValue262_21_0);
    }
    spill262_2 = life5_6;
    if (!((life4_7 != null))) {
        forwardValue262_28_0 = spill262_2;
        break forward_join_28;
    }
    if (!((spill262_2 != null))) {
        break forward_join_33;
    }
    forwardValue262_28_0 = life5_6;
    }
    __call262_8(forwardValue262_28_0, p1, p0);
    if (!((life4_7 == null))) {
        break forward_join_39;
    }
    }
    __call262_12(__fieldRead262_9(), __invokedynamic262_11(__call262_10(p0, "id")));
    }
    return life5_6;
}
public static moom.G4 h262_0(java.lang.Exception p0) throws Throwable {
    throw __call3026200_0(p0);
}
public static moom.G4 h262_1(java.lang.Exception p0) throws Throwable {
    throw __call3026201_0(p0);
}
public static moom.G4 h262_2(java.lang.Exception p0, net.minecraft.nbt.NBTTagCompound p1, net.minecraft.world.World p2, net.minecraft.entity.Entity[] p3, moom.G4 p4, java.lang.Class p5) throws Throwable {
    moom.G4 forwardValue3026202_15_0;
    moom.G4 spill3026202_0;
    java.lang.Exception life5_2;
    forward_join_26: {
    forward_join_20: {
    forward_join_15: {
    life5_2 = p0;
    __call3026202_3(__fieldRead3026202_0(), __invokedynamic3026202_2(__call3026202_1(p1, "id")));
    __call3026202_4(life5_2);
    spill3026202_0 = p4;
    if (!((p3 != null))) {
        forwardValue3026202_15_0 = spill3026202_0;
        break forward_join_15;
    }
    if (!((spill3026202_0 != null))) {
        break forward_join_20;
    }
    forwardValue3026202_15_0 = p4;
    }
    __call3026202_5(forwardValue3026202_15_0, p2, p1);
    if (!((p3 == null))) {
        break forward_join_26;
    }
    }
    __call3026202_9(__fieldRead3026202_6(), __invokedynamic3026202_8(__call3026202_7(p1, "id")));
    }
    return p4;
}
public static moom.G4 h262_3(java.lang.Exception p0) throws Throwable {
    throw __call3026203_0(p0);
}
public static moom.G4 h262_4(java.lang.Exception p0) throws Throwable {
    throw __call3026204_0(p0);
}
private static native long __fieldRead262_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call262_1() throws Throwable;
private static native java.util.Map __fieldRead262_2() throws Throwable;
private static native java.lang.String __call262_3(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call262_4(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.Class __cast262_5(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call262_6(java.lang.Class a0) throws Throwable;
private static native moom.G4 __cast262_7(java.lang.Object a0) throws Throwable;
private static native void __call262_8(moom.G4 a0, net.minecraft.world.World a1, net.minecraft.nbt.NBTTagCompound a2) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead262_9() throws Throwable;
private static native java.lang.String __call262_10(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic262_11(java.lang.String a0) throws Throwable;
private static native void __call262_12(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call3026200_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3026201_0(java.lang.Exception a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3026202_0() throws Throwable;
private static native java.lang.String __call3026202_1(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic3026202_2(java.lang.String a0) throws Throwable;
private static native void __call3026202_3(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native void __call3026202_4(java.lang.Exception a0) throws Throwable;
private static native void __call3026202_5(moom.G4 a0, net.minecraft.world.World a1, net.minecraft.nbt.NBTTagCompound a2) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3026202_6() throws Throwable;
private static native java.lang.String __call3026202_7(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic3026202_8(java.lang.String a0) throws Throwable;
private static native void __call3026202_9(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call3026203_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3026204_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> moom.Ir __sourceHandlerCall_f6f3da17f974e9d56de2(net.minecraft.nbt.NBTTagCompound a0, net.minecraft.world.World a1) throws E;
private static final class __SourceHandler_f6f3da17f974e9d56de2 {

public static moom.Ir f263(net.minecraft.nbt.NBTTagCompound p0, net.minecraft.world.World p1) throws Throwable {
    java.lang.Object forwardValue263_21_0;
    moom.Ir forwardValue263_28_0;
    net.minecraft.entity.Entity[] spill263_0;
    java.lang.Class spill263_1;
    moom.Ir spill263_2;
    long life2_3;
    moom.Ir life5_6;
    net.minecraft.entity.Entity[] life4_7;
    java.lang.Class life6_14;
    forward_join_39: {
    forward_join_33: {
    forward_join_28: {
    forward_join_23: {
    forward_join_21: {
    life2_3 = (__fieldRead263_0() ^ 46921713393632L);
    spill263_0 = __call263_1();
    life5_6 = null;
    life4_7 = spill263_0;
    life6_14 = __cast263_5(__call263_4(__fieldRead263_2(), __call263_3(p0, "id")));
    spill263_1 = life6_14;
    if (!((life4_7 != null))) {
        forwardValue263_21_0 = spill263_1;
        break forward_join_21;
    }
    if (!((spill263_1 != null))) {
        break forward_join_23;
    }
    forwardValue263_21_0 = __call263_6(life6_14);
    }
    life5_6 = __cast263_7(forwardValue263_21_0);
    }
    spill263_2 = life5_6;
    if (!((life4_7 != null))) {
        forwardValue263_28_0 = spill263_2;
        break forward_join_28;
    }
    if (!((spill263_2 != null))) {
        break forward_join_33;
    }
    forwardValue263_28_0 = life5_6;
    }
    __call263_8(forwardValue263_28_0, p1, p0);
    if (!((life4_7 == null))) {
        break forward_join_39;
    }
    }
    __call263_12(__fieldRead263_9(), __invokedynamic263_11(__call263_10(p0, "id")));
    }
    return life5_6;
}
public static moom.Ir h263_0(java.lang.Exception p0) throws Throwable {
    throw __call3026300_0(p0);
}
public static moom.Ir h263_1(java.lang.Exception p0) throws Throwable {
    throw __call3026301_0(p0);
}
public static moom.Ir h263_2(java.lang.Exception p0, net.minecraft.nbt.NBTTagCompound p1, net.minecraft.world.World p2, net.minecraft.entity.Entity[] p3, moom.Ir p4, java.lang.Class p5) throws Throwable {
    moom.Ir forwardValue3026302_15_0;
    moom.Ir spill3026302_0;
    java.lang.Exception life5_2;
    forward_join_26: {
    forward_join_20: {
    forward_join_15: {
    life5_2 = p0;
    __call3026302_3(__fieldRead3026302_0(), __invokedynamic3026302_2(__call3026302_1(p1, "id")));
    __call3026302_4(life5_2);
    spill3026302_0 = p4;
    if (!((p3 != null))) {
        forwardValue3026302_15_0 = spill3026302_0;
        break forward_join_15;
    }
    if (!((spill3026302_0 != null))) {
        break forward_join_20;
    }
    forwardValue3026302_15_0 = p4;
    }
    __call3026302_5(forwardValue3026302_15_0, p2, p1);
    if (!((p3 == null))) {
        break forward_join_26;
    }
    }
    __call3026302_9(__fieldRead3026302_6(), __invokedynamic3026302_8(__call3026302_7(p1, "id")));
    }
    return p4;
}
public static moom.Ir h263_3(java.lang.Exception p0) throws Throwable {
    throw __call3026303_0(p0);
}
public static moom.Ir h263_4(java.lang.Exception p0) throws Throwable {
    throw __call3026304_0(p0);
}
private static native long __fieldRead263_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call263_1() throws Throwable;
private static native java.util.Map __fieldRead263_2() throws Throwable;
private static native java.lang.String __call263_3(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call263_4(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.Class __cast263_5(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call263_6(java.lang.Class a0) throws Throwable;
private static native moom.Ir __cast263_7(java.lang.Object a0) throws Throwable;
private static native void __call263_8(moom.Ir a0, net.minecraft.world.World a1, net.minecraft.nbt.NBTTagCompound a2) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead263_9() throws Throwable;
private static native java.lang.String __call263_10(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic263_11(java.lang.String a0) throws Throwable;
private static native void __call263_12(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call3026300_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3026301_0(java.lang.Exception a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3026302_0() throws Throwable;
private static native java.lang.String __call3026302_1(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic3026302_2(java.lang.String a0) throws Throwable;
private static native void __call3026302_3(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native void __call3026302_4(java.lang.Exception a0) throws Throwable;
private static native void __call3026302_5(moom.Ir a0, net.minecraft.world.World a1, net.minecraft.nbt.NBTTagCompound a2) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3026302_6() throws Throwable;
private static native java.lang.String __call3026302_7(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic3026302_8(java.lang.String a0) throws Throwable;
private static native void __call3026302_9(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call3026303_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3026304_0(java.lang.Exception a0) throws Throwable;

}


static void b(java.lang.Class<? extends moom.G4> p0, java.lang.String p1) {
((java.util.Map)(moom.G1.d)).put(((java.lang.Object)(p1)), ((java.lang.Object)(p0)));
    ((java.util.Map)(moom.G1.e)).put(((java.lang.Object)(p0)), ((java.lang.Object)(p1)));
    return;
}


public static moom.Ir a__Ir(net.minecraft.nbt.NBTTagCompound p0, net.minecraft.world.World p1) { return __sourceHandlerCall_f6f3da17f974e9d56de2(p0, p1); }


public static moom.G4 a(net.minecraft.nbt.NBTTagCompound p0, net.minecraft.world.World p1) { return __sourceHandlerCall_335b3eeb0e84655f4008(p0, p1); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public static java.lang.String a(moom.G4 p0) {
return ((java.lang.String)(((java.util.Map)(moom.G1.e)).get(((java.lang.Object)(((java.lang.Object)(p0)).getClass())))));
}


public static java.lang.String a(moom.Ir p0) {
return ((java.lang.String)(((java.util.Map)(moom.G1.c)).get(((java.lang.Object)(((java.lang.Object)(p0)).getClass())))));
}


private static void a(java.lang.Class<? extends moom.Ir> p0, java.lang.String p1) {
((java.util.Map)(moom.G1.b)).put(((java.lang.Object)(p1)), ((java.lang.Object)(p0)));
    ((java.util.Map)(moom.G1.c)).put(((java.lang.Object)(p0)), ((java.lang.Object)(p1)));
    return;
}

}
