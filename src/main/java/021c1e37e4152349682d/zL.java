package moom;


public class zL implements moom.yK<moom.y2> {

private int a;

private int b;

private int c;

private int d;

private static long e;

public zL(int p0, double p1, double p2, double p3) { super(); }

private static void __sourceConstructorBody_d16cf537b3db248a(moom.zL receiver, int p0, double p1, double p2, double p3) throws Throwable {
int __initValue772_27_0;
    int __initValue772_37_0;
    int __initValue772_46_0;
    int __initValue772_54_0;
    int __initValue772_64_0;
    double __initValue772_66_0;
    long local8_life2;
    int[] local10_life7;
    double local11_life9;
    init_join_67: {
    init_join_66: {
    init_join_64: {
    init_join_59: {
    init_join_54: {
    init_join_51: {
    init_join_46: {
    init_join_43: {
    init_join_37: {
    init_join_33: {
    init_join_27: {
    init_join_23: {
    local8_life2 = (moom.zL.e ^ 93261854035288L);
    moom.zL.__sourceConstructorInit_d16cf537b3db248a_0(((moom.zL)(receiver)));
    int[] __sourceSpill772_6 = moom.zN.b__ArrayInt();
    ((moom.zL)(receiver)).a = ((int)(p0));
    local10_life7 = __sourceSpill772_6;
    local11_life9 = 0x1.f333333333333p+1D;
    int __sourceSpill772_11 = recovery.source.CarrierOps.dcmpg(((double)(p1)), ((double)((-local11_life9))));
    if (!((local10_life7 == null))) {
        __initValue772_27_0 = __sourceSpill772_11;
        break init_join_27;
    }
    if (!((__sourceSpill772_11 < 0))) {
        break init_join_23;
    }
    p1 = (-local11_life9);
    }
    __initValue772_27_0 = recovery.source.CarrierOps.dcmpg(((double)(p2)), ((double)((-local11_life9))));
    }
    int __sourceSpill772_13 = __initValue772_27_0;
    if (!((local10_life7 == null))) {
        __initValue772_37_0 = __sourceSpill772_13;
        break init_join_37;
    }
    if (!((__sourceSpill772_13 < 0))) {
        break init_join_33;
    }
    p2 = (-local11_life9);
    }
    __initValue772_37_0 = recovery.source.CarrierOps.dcmpg(((double)(p3)), ((double)((-local11_life9))));
    }
    int __sourceSpill772_15 = __initValue772_37_0;
    if (!((local10_life7 == null))) {
        __initValue772_46_0 = __sourceSpill772_15;
        break init_join_46;
    }
    if (!((__sourceSpill772_15 < 0))) {
        break init_join_43;
    }
    p3 = (-local11_life9);
    }
    __initValue772_46_0 = recovery.source.CarrierOps.dcmpl(((double)(p1)), ((double)(local11_life9)));
    }
    int __sourceSpill772_17 = __initValue772_46_0;
    if (!((local10_life7 == null))) {
        __initValue772_54_0 = __sourceSpill772_17;
        break init_join_54;
    }
    if (!((__sourceSpill772_17 > 0))) {
        break init_join_51;
    }
    p1 = local11_life9;
    }
    __initValue772_54_0 = recovery.source.CarrierOps.dcmpl(((double)(p2)), ((double)(local11_life9)));
    }
    int __sourceSpill772_19 = __initValue772_54_0;
    if (!((local10_life7 == null))) {
        __initValue772_64_0 = __sourceSpill772_19;
        break init_join_64;
    }
    if (!((__sourceSpill772_19 > 0))) {
        break init_join_59;
    }
    p2 = local11_life9;
    }
    double __sourceSpill772_20 = p3;
    if (!((local10_life7 == null))) {
        __initValue772_66_0 = __sourceSpill772_20;
        break init_join_66;
    }
    __initValue772_64_0 = recovery.source.CarrierOps.dcmpl(((double)(__sourceSpill772_20)), ((double)(local11_life9)));
    }
    if (!((__initValue772_64_0 > 0))) {
        break init_join_67;
    }
    __initValue772_66_0 = local11_life9;
    }
    p3 = __initValue772_66_0;
    }
    ((moom.zL)(receiver)).b = ((int)(((int) (p1 * 0x1.f400000000000p+12D))));
    ((moom.zL)(receiver)).c = ((int)(((int) (p2 * 0x1.f400000000000p+12D))));
    ((moom.zL)(receiver)).d = ((int)(((int) (p3 * 0x1.f400000000000p+12D))));
    return;
}


public zL(net.minecraft.entity.Entity p0) {
this(((int)(((net.minecraft.entity.Entity)(p0)).e__Int())), ((double)(((net.minecraft.entity.Entity)(p0)).t)), ((double)(((net.minecraft.entity.Entity)(p0)).u)), ((double)(((net.minecraft.entity.Entity)(p0)).v)));
    return;
}


public zL() {
super();
}


static {
moom.zL.e = (moom._c.a(1584932037774610409L, 8749058311535354536L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(111324981525573L);
}

private static native <E extends Throwable> void __sourceConstructorInit_d16cf537b3db248a_0(moom.zL a0) throws E;

public int b() {
return this.b;
}


public void b(int p0) {
this.b = ((int)(p0));
    return;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeShort(((int)(this.b)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeShort(((int)(this.c)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeShort(((int)(this.d)));
    return;
}


public void c(int p0) {
this.c = ((int)(p0));
    return;
}


public int c() {
return this.c;
}


public void d(int p0) {
this.d = ((int)(p0));
    return;
}


public int d() {
return this.d;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).a()));
    this.b = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readShort()));
    this.c = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readShort()));
    this.d = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readShort()));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(int p0) {
this.a = ((int)(p0));
    return;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.zL)(this)));
    return;
}


public int a() {
return this.a;
}

}
