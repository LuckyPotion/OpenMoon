package net.minecraft.world.gen.structure;


abstract class ComponentScatteredFeaturePieces$Feature extends moom.G4 {

protected int e;

protected int f;

protected int g;

protected int h;

private static long p;

private static long r;

public ComponentScatteredFeaturePieces$Feature() {
super();
    this.h = -1;
}


protected ComponentScatteredFeaturePieces$Feature(java.util.Random p0, int p1, int p2, int p3, int p4, int p5, int p6) { super(0); }

private static void __sourceConstructorBody_f59fcb9f766102e0(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$Feature receiver, java.util.Random p0, int p1, int p2, int p3, int p4, int p5, int p6) throws Throwable {
net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$Feature __initValue582_60_0;
    long local8_life2;
    net.minecraft.entity.Entity[] local10_life6;
    init_join_82: {
    init_join_60: {
    init_join_59: {
    init_join_34: {
    local8_life2 = (net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$Feature.p ^ 88667133811863L);
    net.minecraft.entity.Entity[] __sourceSpill582_4 = moom.G4.b();
    net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$Feature.__sourceConstructorInit_f59fcb9f766102e0_0(((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$Feature)(receiver)), ((int)(0)));
    local10_life6 = __sourceSpill582_4;
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$Feature)(receiver)).h = ((int)(-1));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$Feature)(receiver)).e = ((int)(p4));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$Feature)(receiver)).f = ((int)(p5));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$Feature)(receiver)).g = ((int)(p6));
    net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$Feature __sourceSpill582_11 = receiver;
    if (!((local10_life6 != null))) {
        __initValue582_60_0 = __sourceSpill582_11;
        break init_join_60;
    }
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$Feature)(__sourceSpill582_11)).b = ((moom.bs)(((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).a(((java.util.Random)(p0)))));
    switch ((moom.G0.a)[((moom.bs)(((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$Feature)(receiver)).b)).ordinal()]) {
case 1:
case 2:
{
        break init_join_34;
    }
default:
{
        break init_join_59;
    }
}
    }
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$Feature)(receiver)).a = ((moom.G2)(new moom.G2(p1, p2, p3, ((p1 + p4) - 1), ((p2 + p5) - 1), ((p3 + p6) - 1))));
    if (!((local10_life6 == null))) {
        break init_join_82;
    }
    }
    __initValue582_60_0 = receiver;
    }
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$Feature)(__initValue582_60_0)).a = ((moom.G2)(new moom.G2(p1, p2, p3, ((p1 + p6) - 1), ((p2 + p5) - 1), ((p3 + p4) - 1))));
    }
    return;
}


static {
p = ((long)(((moom._a)(moom._c.a(((long)(-5158130010595812977L)), ((long)(-3680322180145234583L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(186557404092574L)))));
    long local0_life6 = (net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$Feature.p ^ 36734264860428L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1220_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1220_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1220_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1220_13 = new byte[8];
    (__sourceSpill1220_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1220_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1220_15 = __sourceSpill1220_13;
    ((javax.crypto.Cipher)(__sourceSpill1220_10)).init(((int)(__sourceSpill1220_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1220_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1220_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -7472734612184603130L;
    byte[] __sourceSpill1220_19 = new byte[8];
    (__sourceSpill1220_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1220_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1220_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1220_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1220_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1220_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1220_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1220_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1220_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1220_20)).doFinal(((byte[])(__sourceSpill1220_19)));
    r = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_f59fcb9f766102e0_0(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$Feature a0, int a1) throws E;

protected void b(net.minecraft.nbt.NBTTagCompound p0) {
this.e = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("Width")))));
    this.f = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("Height")))));
    this.g = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("Depth")))));
    this.h = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("HPos")))));
    return;
}


protected boolean a(net.minecraft.world.World p0, moom.G2 p1, int p2) {
int forestValue1179_14_0;
    int forestValue1179_26_0;
    int forestValue1179_75_0;
    int forestValue1179_99_0;
    int spill1179_0;
    int spill1179_1;
    boolean spill1179_2;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    int life7_15;
    int life8_17;
    moom.DU life9_21;
    int life10_25;
    int life11_36;
    forest_join_99: {
    forest_join_80: {
    forest_join_75: {
    forest_join_74: {
    forest_join_14: {
    forest_join_13: {
    life4_3 = (net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$Feature.p ^ 119610336789062L);
    life6_5 = moom.G4.b();
    spill1179_0 = this.h;
    if (!((life6_5 != null))) {
        forestValue1179_14_0 = spill1179_0;
        break forest_join_14;
    }
    if (!((spill1179_0 >= 0))) {
        break forest_join_13;
    }
    return ((1) != 0);
    }
    forestValue1179_14_0 = 0;
    }
    life7_15 = forestValue1179_14_0;
    life8_17 = 0;
    life9_21 = new moom.DU();
    life10_25 = ((moom.G2)(this.a)).c;
    forest_cycle_25: while (true) {
    forest_join_71: {
    forestValue1179_26_0 = life10_25;
    forest_cycle_26: while (true) {
    if (!((forestValue1179_26_0 <= ((moom.G2)(this.a)).f))) {
        break forest_join_74;
    }
    spill1179_1 = ((moom.G2)(this.a)).a;
    if (!((life6_5 != null))) {
        forestValue1179_75_0 = spill1179_1;
        break forest_join_75;
    }
    life11_36 = spill1179_1;
    forest_cycle_36: while (true) {
    forest_join_69: {
    forest_join_68: {
    if (!((life11_36 <= ((moom.G2)(this.a)).d))) {
        break forest_join_71;
    }
    ((moom.DU)(life9_21)).a(((int)(life11_36)), ((int)(((int) net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$Feature.r))), ((int)(life10_25)));
    if (!((life6_5 != null))) {
        break forest_join_69;
    }
    spill1179_2 = ((moom.G2)(p1)).a(((moom.DS)(life9_21)));
    if (!((life6_5 != null))) {
        forestValue1179_26_0 = ((spill1179_2) ? 1 : 0);
        continue forest_cycle_26;
    }
    if (!(spill1179_2)) {
        break forest_join_68;
    }
    life7_15 = (life7_15 + java.lang.Math.max(((int)(((moom.DT)(((net.minecraft.world.World)(p0)).c__DT(((moom.DT)(life9_21))))).b())), ((int)(((moom.EA)(((net.minecraft.world.World)(p0)).v)).a__Int()))));
    life8_17 += 1;
    }
    life11_36 += 1;
    }
    if (!((life6_5 == null))) {
        continue forest_cycle_36;
    }
    break forest_cycle_36;
    }
    break forest_cycle_26;
    }
    }
    life10_25 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_25;
    }
    break forest_cycle_25;
    }
    }
    forestValue1179_75_0 = life8_17;
    }
    if (!((life6_5 != null))) {
        forestValue1179_99_0 = forestValue1179_75_0;
        break forest_join_99;
    }
    if (!((forestValue1179_75_0 == 0))) {
        break forest_join_80;
    }
    return ((0) != 0);
    }
    this.h = ((int)((life7_15 / life8_17)));
    ((moom.G2)(this.a)).a(((int)(0)), ((int)(((this.h - ((moom.G2)(this.a)).b) + p2))), ((int)(0)));
    forestValue1179_99_0 = 1;
    }
    return ((forestValue1179_99_0) != 0);
}


protected void a(net.minecraft.nbt.NBTTagCompound p0) {
((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("Width")), ((int)(this.e)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("Height")), ((int)(this.f)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("Depth")), ((int)(this.g)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("HPos")), ((int)(this.h)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
