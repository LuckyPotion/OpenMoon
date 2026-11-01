package moom;


public class Ex extends net.minecraft.world.WorldServer {

private final net.minecraft.world.WorldServer ak;

private static final long db;

public Ex(moom.Bl p0, net.minecraft.world.storage.ISaveHandler p1, int p2, net.minecraft.world.WorldServer p3, moom.A9 p4) {
super(p0, p1, new net.minecraft.world.storage.DerivedWorldInfo((p3).a__IX()), p2, p4);
    this.ak = p3;
    ((p3).a__Fi()).a(new net.minecraft.world.WorldServerMulti$1(this));
}


static {
db = (moom._c.a(4628268365965060308L, 1347655745639498432L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(221405183798698L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.world.World a__Eu() {
moom.EG forwardValue1849_50_0;
    java.lang.String spill1849_0;
    moom.EG spill1849_1;
    long life1_3;
    java.lang.String life3_15;
    java.lang.String life4_19;
    moom.EG life5_26;
    forward_join_52: {
    forward_join_50: {
    forward_join_45: {
    life1_3 = (moom.Ex.db ^ 88959746312998L);
    spill1849_0 = net.minecraft.world.World.c__String();
    ((moom.Ex)(this)).B = ((moom.IO)(((net.minecraft.world.WorldServer)(this.ak)).a__IO()));
    ((moom.Ex)(this)).F = ((net.minecraft.scoreboard.Scoreboard)(((net.minecraft.world.WorldServer)(this.ak)).a__Bh()));
    life3_15 = spill1849_0;
    life4_19 = moom.EG.a(((moom.EA)(((moom.Ex)(this)).v)));
    life5_26 = ((moom.EG)(((moom.IO)(((moom.Ex)(this)).B)).a(((java.lang.Class)(moom.EG.class)), ((java.lang.String)(life4_19)))));
    spill1849_1 = life5_26;
    if (!((life3_15 == null))) {
        forwardValue1849_50_0 = spill1849_1;
        break forward_join_50;
    }
    if (!((spill1849_1 == null))) {
        break forward_join_45;
    }
    ((moom.Ex)(this)).C = ((moom.EG)(new moom.EG(this)));
    ((moom.IO)(((moom.Ex)(this)).B)).a(((java.lang.String)(life4_19)), ((net.minecraft.world.WorldSavedData)(((moom.Ex)(this)).C)));
    if (!((life3_15 != null))) {
        break forward_join_52;
    }
    }
    ((moom.Ex)(this)).C = ((moom.EG)(life5_26));
    forwardValue1849_50_0 = ((moom.Ex)(this)).C;
    }
    ((moom.EG)(forwardValue1849_50_0)).a(((net.minecraft.world.World)(this)));
    }
    return this;
}


protected void r() throws net.minecraft.world.MinecraftException {
return;
}

}
