package moom;


class Cz implements net.minecraft.command.ICommandSender {

net.minecraft.entity.player.EntityPlayer a;

moom.Ct b;

private static long c;

Cz(moom.Ct p0, net.minecraft.entity.player.EntityPlayer p1) { super(); }


private static void __sourceConstructorBody_261b1740ffa86304(moom.Cz receiver, moom.Ct p0, net.minecraft.entity.player.EntityPlayer p1) throws Throwable {

((moom.Cz)(receiver)).b = ((moom.Ct)(p0));

    ((moom.Cz)(receiver)).a = ((net.minecraft.entity.player.EntityPlayer)(p1));

    moom.Cz.__sourceConstructorInit_261b1740ffa86304_0(((moom.Cz)(receiver)));

    return;

}



static {
moom.Cz.c = (moom._c.a(3789196292646598006L, -3062717829868586551L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(129968010677044L);
}

private static native <E extends Throwable> void __sourceConstructorInit_261b1740ffa86304_0(moom.Cz a0) throws E;

public net.minecraft.world.World a__Eu() {
return ((net.minecraft.entity.player.EntityPlayer)(this.a)).a__Eu();
}


public net.minecraft.entity.Entity a__r3() {
return this.a;
}


public boolean a__Boolean() {
return ((0) != 0);
}


public void a(net.minecraft.command.CommandResultStats$Type p0, int p1) {
((moom.qN)(((moom.Ct)(this.b)).p)).a(((net.minecraft.command.ICommandSender)(this)), ((net.minecraft.command.CommandResultStats$Type)(p0)), ((int)(p1)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.lang.String a__String() {
return ((net.minecraft.entity.player.EntityPlayer)(this.a)).a__String();
}


public net.minecraft.util.IChatComponent a__C5() {
return ((net.minecraft.entity.player.EntityPlayer)(this.a)).a__C5();
}


public void a(net.minecraft.util.IChatComponent p0) {
return;
}


public boolean a(int p0, java.lang.String p1) {
int forwardValue1678_12_0;
    int forwardValue1678_14_0;
    int spill1678_0;
    long life3_3;
    java.lang.String[] life5_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life3_3 = (moom.Cz.c ^ 65859232752496L);
    life5_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill1678_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue1678_12_0 = spill1678_0;
        break forward_join_12;
    }
    if (!((spill1678_0 <= 2))) {
        break forward_join_13;
    }
    forwardValue1678_12_0 = 1;
    }
    forwardValue1678_14_0 = forwardValue1678_12_0;
    break forward_join_14;
    }
    forwardValue1678_14_0 = 0;
    }
    return ((forwardValue1678_14_0) != 0);
}


public moom.DT a__DT() {
return ((moom.Ct)(this.b)).e;
}


public moom.DR a__DR() {
return new moom.DR((((double) ((moom.DT)(((moom.Ct)(this.b)).e)).a()) + 0x1.0p-1d), (((double) ((moom.DT)(((moom.Ct)(this.b)).e)).b()) + 0x1.0p-1d), (((double) ((moom.DT)(((moom.Ct)(this.b)).e)).c()) + 0x1.0p-1d));
}

}
