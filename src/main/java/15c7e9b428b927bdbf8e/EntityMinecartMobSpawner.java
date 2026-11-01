package net.minecraft.entity.ai;


public class EntityMinecartMobSpawner extends net.minecraft.entity.item.EntityMinecart {

private final net.minecraft.tileentity.MobSpawnerBaseLogic aQ;

public EntityMinecartMobSpawner(net.minecraft.world.World p0) {
super(p0);
    this.aQ = new moom.B7(this);
}


public EntityMinecartMobSpawner(net.minecraft.world.World p0, double p1, double p2, double p3) {
super(p0, p1, p2, p3);
    this.aQ = new moom.B7(this);
}


public net.minecraft.block.state.IBlockState b__fE() {
return ((net.minecraft.block.Block)(net.minecraft.init.Blocks.ac)).a__fE();
}


protected void c(net.minecraft.nbt.NBTTagCompound p0) {
super.c(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.tileentity.MobSpawnerBaseLogic)(this.aQ)).a(((net.minecraft.nbt.NBTTagCompound)(p0)));
    return;
}


protected void d(net.minecraft.nbt.NBTTagCompound p0) {
super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.tileentity.MobSpawnerBaseLogic)(this.aQ)).b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    return;
}


public net.minecraft.tileentity.MobSpawnerBaseLogic a__sourceReturn_30e49adebc() {
return this.aQ;
}


public void a(byte p0) {
((net.minecraft.tileentity.MobSpawnerBaseLogic)(this.aQ)).a__Boolean(((int)(p0)));
    return;
}


public net.minecraft.entity.item.EntityMinecart$EnumMinecartType a__aT() {
return net.minecraft.entity.item.EntityMinecart$EnumMinecartType.SPAWNER;
}


public void g__Void() {
super.g__Void();
    ((net.minecraft.tileentity.MobSpawnerBaseLogic)(this.aQ)).a__Void();
    return;
}

}
