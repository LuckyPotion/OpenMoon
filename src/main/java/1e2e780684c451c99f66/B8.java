package moom;


class B8 extends net.minecraft.tileentity.MobSpawnerBaseLogic {

moom.Cq o;

private static long q;

B8(moom.Cq p0) { super(); }


private static void __sourceConstructorBody_794d03290eda78a6(moom.B8 receiver, moom.Cq p0) throws Throwable {

((moom.B8)(receiver)).o = ((moom.Cq)(p0));

    moom.B8.__sourceConstructorInit_794d03290eda78a6_0(((moom.B8)(receiver)));

    return;

}



static {
moom.B8.q = (moom._c.a(1893804408512968156L, -584054448958130971L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(217669229912384L);
}

private static native <E extends Throwable> void __sourceConstructorInit_794d03290eda78a6_0(moom.B8 a0) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


public moom.DT a__DT() {
return ((moom.Cq)(this.o)).e;
}


public void a(int p0) {
((net.minecraft.world.World)(((moom.Cq)(this.o)).d)).c(((moom.DT)(((moom.Cq)(this.o)).e)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.ac)), ((int)(p0)), ((int)(0)));
    return;
}


public void a(moom.D4 p0) {
net.minecraft.world.World forwardValue1485_16_0;
    java.lang.String[] spill1485_0;
    net.minecraft.world.World spill1485_1;
    long life2_3;
    java.lang.String[] life4_8;
    forward_join_20: {
    forward_join_16: {
    life2_3 = (moom.B8.q ^ 57321943060225L);
    spill1485_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    super.a(((moom.D4)(p0)));
    life4_8 = spill1485_0;
    spill1485_1 = ((moom.B8)(this)).a__Eu();
    if (!((life4_8 != null))) {
        forwardValue1485_16_0 = spill1485_1;
        break forward_join_16;
    }
    if (!((spill1485_1 != null))) {
        break forward_join_20;
    }
    forwardValue1485_16_0 = ((moom.B8)(this)).a__Eu();
    }
    ((net.minecraft.world.World)(forwardValue1485_16_0)).a__Void(((moom.DT)(((moom.Cq)(this.o)).e)));
    }
    return;
}


public net.minecraft.world.World a__Eu() {
return ((moom.Cq)(this.o)).d;
}

}
