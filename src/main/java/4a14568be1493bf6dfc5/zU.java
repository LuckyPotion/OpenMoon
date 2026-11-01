package moom;


public class zU implements moom.yK<moom.y2> {

private int a;

private int b;

private int c;

private static long d;

public zU() {
super();
}


public zU(int p0, net.minecraft.entity.Entity p1, net.minecraft.entity.Entity p2) { super(); }


private static void __sourceConstructorBody_ed7797862213dac8(moom.zU receiver, int p0, net.minecraft.entity.Entity p1, net.minecraft.entity.Entity p2) throws Throwable {

moom.zU __initValue773_21_0;

    net.minecraft.entity.Entity __initValue773_21_1;

    moom.zU __initValue773_23_0;

    moom.zU __initValue773_24_0;

    int __initValue773_24_1;

    init_join_24: {

    init_join_23: {

    init_join_21: {

    long local4_life2 = (moom.zU.d ^ 29509290790263L);

    int[] __sourceSpill773_4 = moom.zN.b__ArrayInt();

    moom.zU.__sourceConstructorInit_ed7797862213dac8_0(((moom.zU)(receiver)));

    int[] local6_life6 = __sourceSpill773_4;

    ((moom.zU)(receiver)).a = ((int)(p0));

    ((moom.zU)(receiver)).b = ((int)(((net.minecraft.entity.Entity)(p1)).e__Int()));

    moom.zU __sourceSpill773_10 = receiver;

    net.minecraft.entity.Entity __sourceSpill773_11 = p2;

    if (!((local6_life6 == null))) {

        __initValue773_21_0 = __sourceSpill773_10;

        __initValue773_21_1 = __sourceSpill773_11;

        break init_join_21;

    }

    if (!((__sourceSpill773_11 != null))) {

        __initValue773_23_0 = __sourceSpill773_10;

        break init_join_23;

    }

    __initValue773_21_0 = __sourceSpill773_10;

    __initValue773_21_1 = p2;

    }

    __initValue773_24_0 = __initValue773_21_0;

    __initValue773_24_1 = ((net.minecraft.entity.Entity)(__initValue773_21_1)).e__Int();

    break init_join_24;

    }

    __initValue773_24_0 = __initValue773_23_0;

    __initValue773_24_1 = -1;

    }

    ((moom.zU)(__initValue773_24_0)).c = ((int)(__initValue773_24_1));

    return;

}



static {
moom.zU.d = (moom._c.a(-8096481205991034724L, -2593324496239358975L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(55809839899887L);
}

private static native <E extends Throwable> void __sourceConstructorInit_ed7797862213dac8_0(moom.zU a0) throws E;

public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(this.b)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(this.c)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.a)));
    return;
}


public int b() {
return this.b;
}


public int c() {
return this.c;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a() {
return this.a;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.zU)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.b = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readInt()));
    this.c = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readInt()));
    this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readUnsignedByte()));
    return;
}

}
