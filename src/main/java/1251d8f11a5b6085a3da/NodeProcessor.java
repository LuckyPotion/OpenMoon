package net.minecraft.world.pathfinder;


public abstract class NodeProcessor {

protected net.minecraft.world.IBlockAccess a;

protected moom.Dd<moom.AZ> b;

protected int c;

protected int d;

protected int e;

private static net.minecraft.entity.Entity[] f;

private static final long l;

public NodeProcessor() {
super();
    this.b = new moom.Dd();
}


static {
l = ((long)(((moom._a)(moom._c.a(((long)(125549850290651700L)), ((long)(-4992661514665078903L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(24490493159492L)))));
    if ((net.minecraft.world.pathfinder.NodeProcessor.b() != null)) {
        net.minecraft.world.pathfinder.NodeProcessor.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[4])));
    }
}


public static void b(net.minecraft.entity.Entity[] p0) {
net.minecraft.world.pathfinder.NodeProcessor.f = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public static net.minecraft.entity.Entity[] b() {
return net.minecraft.world.pathfinder.NodeProcessor.f;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public abstract int a(moom.AZ[] p0, net.minecraft.entity.Entity p1, moom.AZ p2, moom.AZ p3, float p4);

public void a(net.minecraft.world.IBlockAccess p0, net.minecraft.entity.Entity p1) {
long local3 = (net.minecraft.world.pathfinder.NodeProcessor.l ^ 44414299852849L);
    this.a = ((net.minecraft.world.IBlockAccess)(p0));
    ((moom.Dd)(this.b)).a();
    this.c = ((int)(moom.Dr.a__Int(((float)((((net.minecraft.entity.Entity)(p1)).G + 0x1.0p0f))))));
    net.minecraft.entity.Entity[] spill10670_0 = net.minecraft.world.pathfinder.NodeProcessor.b();
    this.d = ((int)(moom.Dr.a__Int(((float)((((net.minecraft.entity.Entity)(p1)).H + 0x1.0p0f))))));
    net.minecraft.entity.Entity[] local5 = spill10670_0;
    this.e = ((int)(moom.Dr.a__Int(((float)((((net.minecraft.entity.Entity)(p1)).G + 0x1.0p0f))))));
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        net.minecraft.world.pathfinder.NodeProcessor.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[1])));
    }
    return;
}


public void a() {
return;
}


protected moom.AZ a(int p0, int p1, int p2) {
moom.AZ forwardValue5853_34_0;
    net.minecraft.entity.Entity[] spill5853_0;
    moom.AZ spill5853_1;
    long life4_3;
    int life7_9;
    moom.AZ life8_15;
    net.minecraft.entity.Entity[] life6_16;
    forward_join_34: {
    forward_join_33: {
    life4_3 = (net.minecraft.world.pathfinder.NodeProcessor.l ^ 60717904006084L);
    spill5853_0 = net.minecraft.world.pathfinder.NodeProcessor.b();
    life7_9 = moom.AZ.a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    life8_15 = ((moom.AZ)(((moom.Dd)(this.b)).a__Object(((int)(life7_9)))));
    life6_16 = spill5853_0;
    spill5853_1 = life8_15;
    if (!((life6_16 == null))) {
        forwardValue5853_34_0 = spill5853_1;
        break forward_join_34;
    }
    if (!((spill5853_1 == null))) {
        break forward_join_33;
    }
    life8_15 = new moom.AZ(p0, p1, p2);
    ((moom.Dd)(this.b)).a(((int)(life7_9)), ((java.lang.Object)(life8_15)));
    }
    forwardValue5853_34_0 = life8_15;
    }
    return forwardValue5853_34_0;
}


public abstract moom.AZ a(net.minecraft.entity.Entity p0);

public abstract moom.AZ a(net.minecraft.entity.Entity p0, double p1, double p2, double p3);
}
