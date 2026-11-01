package moom;


public class Iv extends moom.Ir {

private boolean e;

private static long f;

public Iv() {
super();
}


public Iv(net.minecraft.world.World p0, java.util.Random p1, int p2, int p3, int p4) { super(0, 0); }


private static void __sourceConstructorBody_7a5bb0fa32e0729e(moom.Iv receiver, net.minecraft.world.World p0, java.util.Random p1, int p2, int p3, int p4) throws Throwable {

int forestValue398_63_0;

    int forestValue398_88_0;

    int forestValue398_105_0;

    moom.Iv forestValue398_132_0;

    int forestValue398_132_1;

    moom.Iv forestValue398_133_0;

    moom.Iv forestValue398_134_0;

    int forestValue398_134_1;

    net.minecraft.entity.Entity[] spill398_0;

    boolean spill398_1;

    moom.Iv spill398_2;

    int spill398_3;

    long life6_3;

    java.util.List life9_11;

    moom.H6 life10_32;

    net.minecraft.entity.Entity[] life8_38;

    java.util.List life11_47;

    java.util.List life12_50;

    int life13_74;

    moom.G4 life14_79;

    int life13_92;

    moom.G4 life14_97;

    int life13_109;

    java.util.Iterator life14_113;

    moom.G4 life15_120;

    forest_join_135: {

    forest_join_134: {

    forest_join_133: {

    forest_join_132: {

    forest_join_125: {

    forest_join_105: {

    forest_join_102: {

    life6_3 = (moom.Iv.f ^ 76060316140028L);

    moom.Iv.__sourceConstructorInit_7a5bb0fa32e0729e_0(((moom.Iv)(receiver)), ((int)(p2)), ((int)(p3)));

    life9_11 = moom.ID.a(((java.util.Random)(p1)), ((int)(p4)));

    spill398_0 = moom.G4.b();

    life10_32 = new moom.H6(((net.minecraft.world.World)(p0)).a__Ff(), 0, p1, ((p2 << 4) + 2), ((p3 << 4) + 2), life9_11, p4);

    ((java.util.LinkedList)(((moom.Iv)(receiver)).a)).add(((java.lang.Object)(life10_32)));

    life8_38 = spill398_0;

    ((moom.H6)(life10_32)).a(((moom.G4)(life10_32)), ((java.util.List)(((moom.Iv)(receiver)).a)), ((java.util.Random)(p1)));

    life11_47 = ((moom.H6)(life10_32)).n;

    life12_50 = ((moom.H6)(life10_32)).m;

    forest_cycle_51: while (true) {

    forest_join_88: {

    forest_join_84: {

    forest_join_63: {

    forest_join_61: {

    if (!(((java.util.List)(life11_47)).isEmpty())) {

        break forest_join_61;

    }

    spill398_1 = ((java.util.List)(life12_50)).isEmpty();

    if (!((life8_38 != null))) {

        forestValue398_63_0 = ((spill398_1) ? 1 : 0);

        break forest_join_63;

    }

    if (!((life8_38 != null))) {

        forestValue398_105_0 = ((spill398_1) ? 1 : 0);

        break forest_join_105;

    }

    if (!((!spill398_1))) {

        break forest_join_102;

    }

    }

    forestValue398_63_0 = ((((java.util.List)(life11_47)).isEmpty()) ? 1 : 0);

    }

    if (!((life8_38 != null))) {

        forestValue398_88_0 = forestValue398_63_0;

        break forest_join_88;

    }

    if (!((forestValue398_63_0 != 0))) {

        break forest_join_84;

    }

    life13_74 = ((java.util.Random)(p1)).nextInt(((int)(((java.util.List)(life12_50)).size())));

    life14_79 = ((moom.G4)(((java.util.List)(life12_50)).remove(((int)(life13_74)))));

    ((moom.G4)(life14_79)).a(((moom.G4)(life10_32)), ((java.util.List)(((moom.Iv)(receiver)).a)), ((java.util.Random)(p1)));

    if (!((life8_38 == null))) {

        continue forest_cycle_51;

    }

    }

    forestValue398_88_0 = ((java.util.Random)(p1)).nextInt(((int)(((java.util.List)(life11_47)).size())));

    }

    life13_92 = forestValue398_88_0;

    life14_97 = ((moom.G4)(((java.util.List)(life11_47)).remove(((int)(life13_92)))));

    ((moom.G4)(life14_97)).a(((moom.G4)(life10_32)), ((java.util.List)(((moom.Iv)(receiver)).a)), ((java.util.Random)(p1)));

    if (!((life8_38 == null))) {

        continue forest_cycle_51;

    }

    break forest_cycle_51;

    }

    }

    ((moom.Iv)(receiver)).a__Void();

    forestValue398_105_0 = 0;

    }

    life13_109 = forestValue398_105_0;

    life14_113 = ((java.util.LinkedList)(((moom.Iv)(receiver)).a)).iterator();

    forest_cycle_110: while (true) {

    forest_join_123: {

    if (!(((java.util.Iterator)(life14_113)).hasNext())) {

        break forest_join_125;

    }

    life15_120 = ((moom.G4)(((java.util.Iterator)(life14_113)).next()));

    if (!((life8_38 != null))) {

        break forest_join_135;

    }

    if (!((((life15_120 instanceof moom.H2) ? 1 : 0) == 0))) {

        break forest_join_123;

    }

    life13_109 += 1;

    }

    if (!((life8_38 == null))) {

        continue forest_cycle_110;

    }

    break forest_cycle_110;

    }

    }

    spill398_2 = receiver;

    spill398_3 = life13_109;

    if (!((life8_38 != null))) {

        forestValue398_132_0 = spill398_2;

        forestValue398_132_1 = spill398_3;

        break forest_join_132;

    }

    if (!((spill398_3 > 2))) {

        forestValue398_133_0 = spill398_2;

        break forest_join_133;

    }

    forestValue398_132_0 = spill398_2;

    forestValue398_132_1 = 1;

    }

    forestValue398_134_0 = forestValue398_132_0;

    forestValue398_134_1 = forestValue398_132_1;

    break forest_join_134;

    }

    forestValue398_134_0 = forestValue398_133_0;

    forestValue398_134_1 = 0;

    }

    ((moom.Iv)(forestValue398_134_0)).e = ((boolean)__sourceIntrinsic_integerToBoolean((forestValue398_134_1)));

    }

    return;

}



static {
moom.Iv.f = (moom._c.a(-5936752954926553275L, -3722807387198473232L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(19561188478917L);
}

private static native <E extends Throwable> void __sourceConstructorInit_7a5bb0fa32e0729e_0(moom.Iv a0, int a1, int a2) throws E;

public void b(net.minecraft.nbt.NBTTagCompound p0) {
super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    this.e = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("Valid")))));
    return;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
return ((((this.e) ? 1 : 0)) != 0);
}


public void a(net.minecraft.nbt.NBTTagCompound p0) {
super.a(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Valid")), ((boolean)__sourceIntrinsic_integerToBoolean((((this.e) ? 1 : 0)))));
    return;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
