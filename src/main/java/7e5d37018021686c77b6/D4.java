package moom;


public class D4 extends moom.D1 {

private net.minecraft.nbt.NBTTagCompound c;

private java.lang.String d;

private static long e;

private D4(net.minecraft.nbt.NBTTagCompound p0, java.lang.String p1, int p2) { super(0); }


private static void __sourceConstructorBody_57a64a3f3bea228b(moom.D4 receiver, net.minecraft.nbt.NBTTagCompound p0, java.lang.String p1, int p2) throws Throwable {

net.minecraft.nbt.NBTTagCompound __initValue467_20_0;

    long local4_life2;

    java.lang.String[] local6_life6;

    init_join_35: {

    init_join_29: {

    init_join_27: {

    init_join_20: {

    local4_life2 = (moom.D4.e ^ 30292946476925L);

    java.lang.String[] __sourceSpill467_4 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();

    moom.D4.__sourceConstructorInit_57a64a3f3bea228b_0(((moom.D4)(receiver)), ((int)(p2)));

    local6_life6 = __sourceSpill467_4;

    if (!((local6_life6 != null))) {

        break init_join_35;

    }

    if (!(((java.lang.String)(p1)).equals(((java.lang.Object)("Minecart"))))) {

        break init_join_29;

    }

    net.minecraft.nbt.NBTTagCompound __sourceSpill467_8 = p0;

    if (!((local6_life6 != null))) {

        __initValue467_20_0 = __sourceSpill467_8;

        break init_join_20;

    }

    if (!((__sourceSpill467_8 != null))) {

        break init_join_27;

    }

    __initValue467_20_0 = p0;

    }

    p1 = ((net.minecraft.entity.item.EntityMinecart$EnumMinecartType)(net.minecraft.entity.item.EntityMinecart$EnumMinecartType.a(((int)(((net.minecraft.nbt.NBTTagCompound)(__initValue467_20_0)).a__Int(((java.lang.String)("Type")))))))).a__String();

    if (!((local6_life6 == null))) {

        break init_join_29;

    }

    }

    p1 = "MinecartRideable";

    }

    ((moom.D4)(receiver)).c = ((net.minecraft.nbt.NBTTagCompound)(p0));

    ((moom.D4)(receiver)).d = ((java.lang.String)(p1));

    }

    return;

}



public D4(net.minecraft.nbt.NBTTagCompound p0, java.lang.String p1) {
this(((net.minecraft.nbt.NBTTagCompound)(p0)), ((java.lang.String)(p1)), ((int)(1)));
    return;
}


public D4(net.minecraft.nbt.NBTTagCompound p0) {
this(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__yw(((java.lang.String)("Properties"))))), ((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__String(((java.lang.String)("Type"))))), ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("Weight"))))));
    return;
}


static {
moom.D4.e = (moom._c.a(-3496933053784950244L, 3530750000709216224L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(219493249510909L);
}

private static native <E extends Throwable> void __sourceConstructorInit_57a64a3f3bea228b_0(moom.D4 a0, int a1) throws E;

private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.nbt.NBTTagCompound a() {
net.minecraft.nbt.NBTTagCompound local1 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.nbt.NBTTagCompound)(local1)).a(((java.lang.String)("Properties")), ((net.minecraft.nbt.NBTBase)(this.c)));
    ((net.minecraft.nbt.NBTTagCompound)(local1)).a(((java.lang.String)("Type")), ((java.lang.String)(this.d)));
    ((net.minecraft.nbt.NBTTagCompound)(local1)).a__Void(((java.lang.String)("Weight")), ((int)(this.a)));
    return local1;
}

}
