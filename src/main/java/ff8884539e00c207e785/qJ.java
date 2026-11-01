package moom;


class qJ implements net.minecraft.command.ICommandSender {

net.minecraft.entity.Entity a;

net.minecraft.command.ICommandSender b;

moom.DT c;

double d;

double e;

double f;

moom.pU g;

private static long h;

qJ(moom.pU p0, net.minecraft.entity.Entity p1, net.minecraft.command.ICommandSender p2, moom.DT p3, double p4, double p5, double p6) { super(); }


private static void __sourceConstructorBody_86fcaa7af1f0b724(moom.qJ receiver, moom.pU p0, net.minecraft.entity.Entity p1, net.minecraft.command.ICommandSender p2, moom.DT p3, double p4, double p5, double p6) throws Throwable {

((moom.qJ)(receiver)).g = ((moom.pU)(p0));

    ((moom.qJ)(receiver)).a = ((net.minecraft.entity.Entity)(p1));

    ((moom.qJ)(receiver)).b = ((net.minecraft.command.ICommandSender)(p2));

    ((moom.qJ)(receiver)).c = ((moom.DT)(p3));

    ((moom.qJ)(receiver)).d = ((double)(p4));

    ((moom.qJ)(receiver)).e = ((double)(p5));

    ((moom.qJ)(receiver)).f = ((double)(p6));

    moom.qJ.__sourceConstructorInit_86fcaa7af1f0b724_0(((moom.qJ)(receiver)));

    return;

}



static {
moom.qJ.h = (moom._c.a(662019967131715270L, -8588954921813936512L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(151119989226482L);
}

private static native <E extends Throwable> void __sourceConstructorInit_86fcaa7af1f0b724_0(moom.qJ a0) throws E;

public net.minecraft.world.World a__Eu() {
return ((net.minecraft.entity.Entity)(this.a)).i;
}


public net.minecraft.entity.Entity a__r3() {
return this.a;
}


public boolean a__Boolean() {
moom.Bl forwardValue3845_13_0;
    int forwardValue3845_23_0;
    int forwardValue3845_25_0;
    boolean spill3845_0;
    moom.Bl spill3845_1;
    boolean spill3845_2;
    long life1_3;
    moom.Bl life4_6;
    int life3_7;
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_13: {
    life1_3 = (moom.qJ.h ^ 15179507648080L);
    spill3845_0 = moom.b7.c();
    life4_6 = moom.Bl.a__Bl();
    life3_7 = ((spill3845_0) ? 1 : 0);
    spill3845_1 = life4_6;
    if (!((life3_7 != 0))) {
        forwardValue3845_13_0 = spill3845_1;
        break forward_join_13;
    }
    if (!((spill3845_1 != null))) {
        break forward_join_22;
    }
    forwardValue3845_13_0 = life4_6;
    }
    spill3845_2 = ((net.minecraft.world.GameRules)(((net.minecraft.world.WorldServer)((((moom.Bl)(forwardValue3845_13_0)).n)[0])).a__Ej())).a__Boolean(((java.lang.String)("commandBlockOutput")));
    if (!((life3_7 != 0))) {
        forwardValue3845_23_0 = ((spill3845_2) ? 1 : 0);
        break forward_join_23;
    }
    if (!(spill3845_2)) {
        break forward_join_24;
    }
    }
    forwardValue3845_23_0 = 1;
    }
    forwardValue3845_25_0 = forwardValue3845_23_0;
    break forward_join_25;
    }
    forwardValue3845_25_0 = 0;
    }
    return ((forwardValue3845_25_0) != 0);
}


public void a(net.minecraft.command.CommandResultStats$Type p0, int p1) {
((net.minecraft.entity.Entity)(this.a)).a(((net.minecraft.command.CommandResultStats$Type)(p0)), ((int)(p1)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.lang.String a__String() {
return ((net.minecraft.entity.Entity)(this.a)).a__String();
}


public net.minecraft.util.IChatComponent a__C5() {
return ((net.minecraft.entity.Entity)(this.a)).a__C5();
}


public void a(net.minecraft.util.IChatComponent p0) {
((net.minecraft.command.ICommandSender)(this.b)).a(((net.minecraft.util.IChatComponent)(p0)));
    return;
}


public boolean a(int p0, java.lang.String p1) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.command.ICommandSender)(this.b)).a(((int)(p0)), ((java.lang.String)(p1))))) != 0);
}


public moom.DT a__DT() {
return this.c;
}


public moom.DR a__DR() {
return new moom.DR(this.d, this.e, this.f);
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
