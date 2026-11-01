package moom;


public class Cq extends net.minecraft.tileentity.TileEntity implements net.minecraft.util.ITickable {

private final net.minecraft.tileentity.MobSpawnerBaseLogic l;

private static final long m;

public Cq() {
super();
    this.l = new moom.B8(this);
}


static {
m = (moom._c.a(6312901888198519912L, -7141274592016599688L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(71033362139047L);
}


public void b(net.minecraft.nbt.NBTTagCompound p0) {
super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.tileentity.MobSpawnerBaseLogic)(this.l)).b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    return;
}


public void c__Void() {
((net.minecraft.tileentity.MobSpawnerBaseLogic)(this.l)).a__Void();
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.tileentity.MobSpawnerBaseLogic a__sourceReturn_30e49adebc() {
return this.l;
}


public void a__Void(net.minecraft.nbt.NBTTagCompound p0) {
super.a__Void(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.tileentity.MobSpawnerBaseLogic)(this.l)).a(((net.minecraft.nbt.NBTTagCompound)(p0)));
    return;
}


public boolean a__Boolean(int p0, int p1) {
int forwardValue1673_21_0;
    int forwardValue1673_23_0;
    boolean spill1673_0;
    boolean spill1673_1;
    long life3_3;
    java.lang.String[] life5_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life3_3 = (moom.Cq.m ^ 31846485586158L);
    life5_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill1673_0 = ((net.minecraft.tileentity.MobSpawnerBaseLogic)(this.l)).a__Boolean(((int)(p0)));
    if (!((life5_5 != null))) {
        forwardValue1673_21_0 = ((spill1673_0) ? 1 : 0);
        break forward_join_21;
    }
    if (!((!spill1673_0))) {
        break forward_join_20;
    }
    spill1673_1 = super.a__Boolean(((int)(p0)), ((int)(p1)));
    if (!((life5_5 != null))) {
        forwardValue1673_21_0 = ((spill1673_1) ? 1 : 0);
        break forward_join_21;
    }
    if (!(spill1673_1)) {
        break forward_join_22;
    }
    }
    forwardValue1673_21_0 = 1;
    }
    forwardValue1673_23_0 = forwardValue1673_21_0;
    break forward_join_23;
    }
    forwardValue1673_23_0 = 0;
    }
    return ((forwardValue1673_23_0) != 0);
}


public moom.yK a__yK() {
net.minecraft.nbt.NBTTagCompound local1 = new net.minecraft.nbt.NBTTagCompound();
    ((moom.Cq)(this)).b(((net.minecraft.nbt.NBTTagCompound)(local1)));
    ((net.minecraft.nbt.NBTTagCompound)(local1)).a__Void(((java.lang.String)("SpawnPotentials")));
    return new moom.Am(((moom.Cq)(this)).e, 1, local1);
}


public boolean g__Boolean() {
return ((1) != 0);
}

}
