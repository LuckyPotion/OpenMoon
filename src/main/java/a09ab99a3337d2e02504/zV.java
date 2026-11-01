package moom;


public class zV implements moom.yK<moom.y2> {

private int a;

private java.util.List<moom.r2> b;

private static long c;

public zV() {
super();
}


public zV(int p0, net.minecraft.entity.DataWatcher p1, boolean p2) { super(); }


private static void __sourceConstructorBody_745d1a582ae78571(moom.zV receiver, int p0, net.minecraft.entity.DataWatcher p1, boolean p2) throws Throwable {

moom.zV __initValue774_22_0;

    init_join_25: {

    init_join_22: {

    init_join_21: {

    long local4_life2 = (moom.zV.c ^ 124838029215502L);

    int[] __sourceSpill774_4 = moom.zN.b__ArrayInt();

    moom.zV.__sourceConstructorInit_745d1a582ae78571_0(((moom.zV)(receiver)));

    int[] local6_life6 = __sourceSpill774_4;

    moom.zV __sourceSpill774_7 = receiver;

    if (!((local6_life6 == null))) {

        __initValue774_22_0 = __sourceSpill774_7;

        break init_join_22;

    }

    ((moom.zV)(__sourceSpill774_7)).a = ((int)(p0));

    if (!(p2)) {

        break init_join_21;

    }

    ((moom.zV)(receiver)).b = ((java.util.List)(((net.minecraft.entity.DataWatcher)(p1)).b()));

    if (!((local6_life6 != null))) {

        break init_join_25;

    }

    }

    __initValue774_22_0 = receiver;

    }

    ((moom.zV)(__initValue774_22_0)).b = ((java.util.List)(((net.minecraft.entity.DataWatcher)(p1)).a()));

    }

    return;

}



static {
moom.zV.c = (moom._c.a(8751637535074333877L, -1375623809442663927L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(81373436626032L);
}

private static native <E extends Throwable> void __sourceConstructorInit_745d1a582ae78571_0(moom.zV a0) throws E;

public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(this.a)));
    net.minecraft.entity.DataWatcher.a(((java.util.List)(this.b)), ((net.minecraft.network.PacketBuffer)(p0)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a() {
return this.a;
}


public java.util.List<moom.r2> a__List() {
return this.b;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.zV)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).a()));
    this.b = ((java.util.List)(net.minecraft.entity.DataWatcher.a(((net.minecraft.network.PacketBuffer)(p0)))));
    return;
}

}
