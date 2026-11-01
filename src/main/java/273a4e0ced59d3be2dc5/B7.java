package moom;


class B7 extends net.minecraft.tileentity.MobSpawnerBaseLogic {

net.minecraft.entity.ai.EntityMinecartMobSpawner o;

B7(net.minecraft.entity.ai.EntityMinecartMobSpawner p0) { super(); }


private static void __sourceConstructorBody_cf0a21c69b23fc04(moom.B7 receiver, net.minecraft.entity.ai.EntityMinecartMobSpawner p0) throws Throwable {

((moom.B7)(receiver)).o = ((net.minecraft.entity.ai.EntityMinecartMobSpawner)(p0));

    moom.B7.__sourceConstructorInit_cf0a21c69b23fc04_0(((moom.B7)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_cf0a21c69b23fc04_0(moom.B7 a0) throws E;

public moom.DT a__DT() {
return new moom.DT(this.o);
}


public net.minecraft.world.World a__Eu() {
return ((net.minecraft.entity.ai.EntityMinecartMobSpawner)(this.o)).i;
}


public void a(int p0) {
((net.minecraft.world.World)(((net.minecraft.entity.ai.EntityMinecartMobSpawner)(this.o)).i)).a(((net.minecraft.entity.Entity)(this.o)), ((byte)(((byte) p0))));
    return;
}

}
