package net.minecraft.world.gen.structure;


public class MapGenStructureData extends net.minecraft.world.WorldSavedData {

private net.minecraft.nbt.NBTTagCompound c;

public MapGenStructureData(java.lang.String p0) {
super(p0);
    this.c = new net.minecraft.nbt.NBTTagCompound();
}


public void b(net.minecraft.nbt.NBTTagCompound p0) {
((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Features")), ((net.minecraft.nbt.NBTBase)(this.c)));
    return;
}


public net.minecraft.nbt.NBTTagCompound a__sourceReturn_918ca510d2() {
return this.c;
}


public static java.lang.String a(int p0, int p1) {
return __sourceIntrinsic_5e0b0adb07e0_originalDynamicSite2078_0(p0, p1);
}


public void a(net.minecraft.nbt.NBTTagCompound p0, int p1, int p2) {
((net.minecraft.nbt.NBTTagCompound)(this.c)).a(((java.lang.String)(net.minecraft.world.gen.structure.MapGenStructureData.a(((int)(p1)), ((int)(p2))))), ((net.minecraft.nbt.NBTBase)(p0)));
    return;
}


public void a(net.minecraft.nbt.NBTTagCompound p0) {
this.c = ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__yw(((java.lang.String)("Features")))));
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5e0b0adb07e0_originalDynamicSite2078_0(int a0, int a1) throws E;
}
