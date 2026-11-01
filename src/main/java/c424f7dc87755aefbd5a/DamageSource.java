package net.minecraft.util;


public class DamageSource {

public static net.minecraft.util.DamageSource a;

public static net.minecraft.util.DamageSource b;

public static net.minecraft.util.DamageSource c;

public static net.minecraft.util.DamageSource d;

public static net.minecraft.util.DamageSource e;

public static net.minecraft.util.DamageSource f;

public static net.minecraft.util.DamageSource g;

public static net.minecraft.util.DamageSource h;

public static net.minecraft.util.DamageSource i;

public static net.minecraft.util.DamageSource j;

public static net.minecraft.util.DamageSource k;

public static net.minecraft.util.DamageSource l;

public static net.minecraft.util.DamageSource m;

public static net.minecraft.util.DamageSource n;

public static net.minecraft.util.DamageSource o;

private boolean p;

private boolean q;

private boolean r;

private float s;

private boolean t;

private boolean u;

private boolean v;

private boolean w;

private boolean x;

public java.lang.String y;

private static net.minecraft.entity.Entity[] z;

private static final long D;

protected DamageSource(java.lang.String p0) {
super();
    this.s = 0x1.3333340000000p-2f;
    this.y = p0;
}


static {
D = ((long)(((moom._a)(moom._c.a(((long)(2175823819909264437L)), ((long)(5380226002147667601L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(227402943374452L)))));
    a = ((net.minecraft.util.DamageSource)(((net.minecraft.util.DamageSource)(new net.minecraft.util.DamageSource("inFire"))).f()));
    net.minecraft.entity.Entity[] __sourceSpill3492_8 = new net.minecraft.entity.Entity[3];
    b = ((net.minecraft.util.DamageSource)(new net.minecraft.util.DamageSource("lightningBolt")));
    c = ((net.minecraft.util.DamageSource)(((net.minecraft.util.DamageSource)(((net.minecraft.util.DamageSource)(new net.minecraft.util.DamageSource("onFire"))).c())).f()));
    d = ((net.minecraft.util.DamageSource)(((net.minecraft.util.DamageSource)(new net.minecraft.util.DamageSource("lava"))).f()));
    e = ((net.minecraft.util.DamageSource)(((net.minecraft.util.DamageSource)(new net.minecraft.util.DamageSource("inWall"))).c()));
    f = ((net.minecraft.util.DamageSource)(((net.minecraft.util.DamageSource)(new net.minecraft.util.DamageSource("drown"))).c()));
    net.minecraft.util.DamageSource.b(((net.minecraft.entity.Entity[])(__sourceSpill3492_8)));
    g = ((net.minecraft.util.DamageSource)(((net.minecraft.util.DamageSource)(((net.minecraft.util.DamageSource)(new net.minecraft.util.DamageSource("starve"))).c())).e()));
    h = ((net.minecraft.util.DamageSource)(new net.minecraft.util.DamageSource("cactus")));
    i = ((net.minecraft.util.DamageSource)(((net.minecraft.util.DamageSource)(new net.minecraft.util.DamageSource("fall"))).c()));
    j = ((net.minecraft.util.DamageSource)(((net.minecraft.util.DamageSource)(((net.minecraft.util.DamageSource)(new net.minecraft.util.DamageSource("outOfWorld"))).c())).d()));
    k = ((net.minecraft.util.DamageSource)(((net.minecraft.util.DamageSource)(new net.minecraft.util.DamageSource("generic"))).c()));
    l = ((net.minecraft.util.DamageSource)(((net.minecraft.util.DamageSource)(((net.minecraft.util.DamageSource)(new net.minecraft.util.DamageSource("magic"))).c())).h()));
    m = ((net.minecraft.util.DamageSource)(((net.minecraft.util.DamageSource)(new net.minecraft.util.DamageSource("wither"))).c()));
    n = ((net.minecraft.util.DamageSource)(new net.minecraft.util.DamageSource("anvil")));
    o = ((net.minecraft.util.DamageSource)(new net.minecraft.util.DamageSource("fallingBlock")));
}


public boolean i() {
int forwardValue5735_18_0;
    int forwardValue5735_22_0;
    int forwardValue5735_24_0;
    boolean spill5735_0;
    int spill5735_1;
    long life1_3;
    net.minecraft.entity.Entity life4_7;
    int life3_8;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_18: {
    life1_3 = (net.minecraft.util.DamageSource.D ^ 29165319504331L);
    spill5735_0 = moom.DS.b__Boolean();
    life4_7 = ((net.minecraft.util.DamageSource)(this)).b__r3();
    life3_8 = ((spill5735_0) ? 1 : 0);
    spill5735_1 = ((life4_7 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life3_8 == 0))) {
        forwardValue5735_18_0 = spill5735_1;
        break forward_join_18;
    }
    if (!((spill5735_1 != 0))) {
        break forward_join_23;
    }
    forwardValue5735_18_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(life4_7)))).b1)).d) ? 1 : 0);
    }
    if (!((life3_8 == 0))) {
        forwardValue5735_22_0 = forwardValue5735_18_0;
        break forward_join_22;
    }
    if (!((forwardValue5735_18_0 != 0))) {
        break forward_join_23;
    }
    forwardValue5735_22_0 = 1;
    }
    forwardValue5735_24_0 = forwardValue5735_22_0;
    break forward_join_24;
    }
    forwardValue5735_24_0 = 0;
    }
    return ((forwardValue5735_24_0) != 0);
}


public static net.minecraft.util.DamageSource b(net.minecraft.entity.Entity p0, net.minecraft.entity.Entity p1) {
return ((net.minecraft.util.DamageSource)(((moom.CW)(new moom.CW("indirectMagic", p0, p1))).c())).h();
}


public boolean b__Boolean() {
return ((((this.x) ? 1 : 0)) != 0);
}


public net.minecraft.entity.Entity b__r3() {
return null;
}


public net.minecraft.util.DamageSource b() {
this.x = ((boolean)(true));
    return this;
}


public static net.minecraft.entity.Entity[] b__Arrayr3() {
return net.minecraft.util.DamageSource.z;
}


public static void b(net.minecraft.entity.Entity[] p0) {
net.minecraft.util.DamageSource.z = ((net.minecraft.entity.Entity[])(p0));
    return;
}


protected net.minecraft.util.DamageSource e() {
this.r = ((boolean)(true));
    this.s = ((float)(0x0.0p0f));
    return this;
}


public boolean e__Boolean() {
return ((((this.r) ? 1 : 0)) != 0);
}


public boolean c__Boolean() {
return ((((this.p) ? 1 : 0)) != 0);
}


protected net.minecraft.util.DamageSource c() {
this.p = ((boolean)(true));
    this.s = ((float)(0x0.0p0f));
    return this;
}


public net.minecraft.util.DamageSource h() {
this.w = ((boolean)(true));
    return this;
}


public boolean h__Boolean() {
return ((((this.w) ? 1 : 0)) != 0);
}


protected net.minecraft.util.DamageSource f() {
this.t = ((boolean)(true));
    return this;
}


public boolean f__Boolean() {
return ((((this.t) ? 1 : 0)) != 0);
}


public boolean d__Boolean() {
return ((((this.q) ? 1 : 0)) != 0);
}


protected net.minecraft.util.DamageSource d() {
this.q = ((boolean)(true));
    return this;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.util.IChatComponent a(net.minecraft.entity.EntityLivingBase p0) {
moom.CN forwardValue5734_47_0;
    long life2_3;
    net.minecraft.entity.EntityLivingBase life4_6;
    java.lang.String life5_10;
    java.lang.String life6_13;
    forward_join_47: {
    forward_join_36: {
    life2_3 = (net.minecraft.util.DamageSource.D ^ 127565606405753L);
    life4_6 = ((net.minecraft.entity.EntityLivingBase)(p0)).c__sG();
    life5_10 = __sourceIntrinsic_f6c8d7ccd1b5_invokedynamic5734_3(this.y);
    life6_13 = __sourceIntrinsic_f6c8d7ccd1b5_invokedynamic5734_4(life5_10);
    if (!((life4_6 != null))) {
        break forward_join_36;
    }
    if (!(net.minecraft.util.StatCollector.a__Boolean(((java.lang.String)(life6_13))))) {
        break forward_join_36;
    }
    forwardValue5734_47_0 = new moom.CN(life6_13, new java.lang.Object[] {((net.minecraft.entity.EntityLivingBase)(p0)).a__C5(), ((net.minecraft.entity.EntityLivingBase)(life4_6)).a__C5()});
    break forward_join_47;
    }
    forwardValue5734_47_0 = new moom.CN(life5_10, new java.lang.Object[] {((net.minecraft.entity.EntityLivingBase)(p0)).a__C5()});
    }
    return forwardValue5734_47_0;
}


public java.lang.String a__String() {
return this.y;
}


public static net.minecraft.util.DamageSource a(net.minecraft.entity.projectile.EntityFireball p0, net.minecraft.entity.Entity p1) {
long local2 = (net.minecraft.util.DamageSource.D ^ 87858656531393L);
    return ((p1 == null) ? ((net.minecraft.util.DamageSource)(((moom.CW)(new moom.CW("onFire", p0, p0))).f())).a__CU() : ((net.minecraft.util.DamageSource)(((moom.CW)(new moom.CW("fireball", p0, p1))).f())).a__CU());
}


public static net.minecraft.util.DamageSource a(net.minecraft.entity.Entity p0, net.minecraft.entity.Entity p1) {
return ((moom.CW)(new moom.CW("thrown", p0, p1))).a__CU();
}


public static net.minecraft.util.DamageSource a(net.minecraft.entity.Entity p0) {
return ((moom.CV)(((moom.CV)(new moom.CV("thorns", p0))).a__sourceReturn_139ee4bd24())).h();
}


public static net.minecraft.util.DamageSource a(moom.Ei p0) {
moom.Ei forwardValue5733_11_0;
    net.minecraft.util.DamageSource forwardValue5733_28_0;
    moom.Ei spill5733_0;
    long life1_3;
    int life3_5;
    forward_join_28: {
    forward_join_22: {
    forward_join_11: {
    life1_3 = (net.minecraft.util.DamageSource.D ^ 132230548879985L);
    life3_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill5733_0 = p0;
    if (!((life3_5 != 0))) {
        forwardValue5733_11_0 = spill5733_0;
        break forward_join_11;
    }
    if (!((spill5733_0 != null))) {
        break forward_join_22;
    }
    forwardValue5733_11_0 = p0;
    }
    if (!((((moom.Ei)(forwardValue5733_11_0)).a__sG() != null))) {
        break forward_join_22;
    }
    forwardValue5733_28_0 = ((net.minecraft.util.DamageSource)(((moom.CV)(new moom.CV("explosion.player", ((moom.Ei)(p0)).a__sG()))).g())).b();
    break forward_join_28;
    }
    forwardValue5733_28_0 = ((net.minecraft.util.DamageSource)(((net.minecraft.util.DamageSource)(new net.minecraft.util.DamageSource("explosion"))).g())).b();
    }
    return forwardValue5733_28_0;
}


public static net.minecraft.util.DamageSource a(net.minecraft.entity.projectile.EntityArrow p0, net.minecraft.entity.Entity p1) {
return ((moom.CW)(new moom.CW("arrow", p0, p1))).a__CU();
}


public static net.minecraft.util.DamageSource a(net.minecraft.entity.player.EntityPlayer p0) {
return new moom.CV("player", p0);
}


public static net.minecraft.util.DamageSource a__CU(net.minecraft.entity.EntityLivingBase p0) {
return new moom.CV("mob", p0);
}


public float a() {
return this.s;
}


public net.minecraft.entity.Entity a__r3() {
return ((net.minecraft.util.DamageSource)(this)).b__r3();
}


public boolean a__Boolean() {
return ((((this.u) ? 1 : 0)) != 0);
}


public net.minecraft.util.DamageSource a__CU() {
this.u = ((boolean)(true));
    return this;
}


public net.minecraft.util.DamageSource g() {
this.v = ((boolean)(true));
    return this;
}


public boolean g__Boolean() {
return ((((this.v) ? 1 : 0)) != 0);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f6c8d7ccd1b5_invokedynamic5734_3(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f6c8d7ccd1b5_invokedynamic5734_4(java.lang.String a0) throws E;
}
