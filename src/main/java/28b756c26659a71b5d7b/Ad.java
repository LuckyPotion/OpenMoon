package moom;


public class Ad implements moom.yK<moom.y2> {

private int a;

private int b;

private int c;

private int d;

private int e;

private static long f;

public Ad() {
super();
}


public Ad(net.minecraft.entity.Entity p0) { super(); }

private static void __sourceConstructorBody_41872d48b8bcf2d8(moom.Ad receiver, net.minecraft.entity.Entity p0) throws Throwable {
moom.Ad __initValue451_40_0;
    int __initValue451_40_1;
    init_join_41: {
    init_join_40: {
    long local2_life2 = (moom.Ad.f ^ 29856050318458L);
    int[] __sourceSpill451_4 = moom.zN.b__ArrayInt();
    moom.Ad.__sourceConstructorInit_41872d48b8bcf2d8_0(((moom.Ad)(receiver)));
    ((moom.Ad)(receiver)).a = ((int)(((net.minecraft.entity.Entity)(p0)).e__Int()));
    int[] local4_life8 = __sourceSpill451_4;
    ((moom.Ad)(receiver)).b = ((int)(moom.Dr.b__Int(((double)((((net.minecraft.entity.Entity)(p0)).n * 0x1.0000000000000p+5D))))));
    ((moom.Ad)(receiver)).c = ((int)(moom.Dr.b__Int(((double)((((net.minecraft.entity.Entity)(p0)).o * 0x1.0000000000000p+5D))))));
    moom.Ad __sourceSpill451_20 = receiver;
    int __sourceSpill451_21 = moom.Dr.b__Int(((double)((((net.minecraft.entity.Entity)(p0)).p * 0x1.0000000000000p+5D))));
    if (!((local4_life8 == null))) {
        __initValue451_40_0 = __sourceSpill451_20;
        __initValue451_40_1 = __sourceSpill451_21;
        break init_join_40;
    }
    ((moom.Ad)(__sourceSpill451_20)).d = ((int)(__sourceSpill451_21));
    if (!((((p0 instanceof moom.tu) ? 1 : 0) != 0))) {
        break init_join_41;
    }
    __initValue451_40_0 = receiver;
    __initValue451_40_1 = 1;
    }
    ((moom.Ad)(__initValue451_40_0)).e = ((int)(__initValue451_40_1));
    }
    return;
}


static {
moom.Ad.f = (moom._c.a(-6390294376961738723L, -4439602855189817896L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(25179385455941L);
}

private static native <E extends Throwable> void __sourceConstructorInit_41872d48b8bcf2d8_0(moom.Ad a0) throws E;

public int b() {
return this.b;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.e)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(this.b)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(this.c)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(this.d)));
    return;
}


public int e() {
return this.e;
}


public int c() {
return this.c;
}


public int d() {
return this.d;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).a()));
    this.e = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    this.b = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readInt()));
    this.c = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readInt()));
    this.d = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readInt()));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.Ad)(this)));
    return;
}


public int a() {
return this.a;
}

}
