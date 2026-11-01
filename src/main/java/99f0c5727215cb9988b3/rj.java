package moom;


class rj extends moom.re {

net.minecraft.item.ItemStack c;

moom.v6 d;

rj(moom.v6 p0, net.minecraft.item.ItemStack p1) { super(); }


private static void __sourceConstructorBody_071b47de79fc1023(moom.rj receiver, moom.v6 p0, net.minecraft.item.ItemStack p1) throws Throwable {

((moom.rj)(receiver)).d = ((moom.v6)(p0));

    ((moom.rj)(receiver)).c = ((net.minecraft.item.ItemStack)(p1));

    moom.rj.__sourceConstructorInit_071b47de79fc1023_0(((moom.rj)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_071b47de79fc1023_0(moom.rj a0) throws E;

protected float b__sourceReturn_bc607678b6() {
return (super.b__sourceReturn_bc607678b6() * 0x1.4p0f);
}


protected net.minecraft.entity.IProjectile a(net.minecraft.world.World p0, moom.rB p1) {
return new moom.tW(p0, ((moom.rB)(p1)).a(), ((moom.rB)(p1)).b(), ((moom.rB)(p1)).c(), ((net.minecraft.item.ItemStack)(this.c)).a__xW());
}


protected float a() {
return (super.a() * 0x1.0p-1f);
}

}
