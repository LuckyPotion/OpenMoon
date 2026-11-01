package moom;


public class zf implements moom.yK<moom.y3> {

private float a;

private float b;

private boolean c;

private boolean d;

private static final long e;

public zf() {
super();
}


public zf(float p0, float p1, boolean p2, boolean p3) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
}


static {
moom.zf.e = (moom._c.a(2007107774307911692L, -7023752953432496851L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(184554187335950L);
}


public moom.zf b(float p0) {
this.b = ((float)(p0));
    return this;
}


public float b() {
return this.b;
}


public boolean b__Boolean() {
return ((((this.d) ? 1 : 0)) != 0);
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
int forwardValue4602_30_0;
    int forwardValue4602_37_0;
    boolean spill4602_0;
    boolean spill4602_1;
    long life2_3;
    int life4_15;
    int life5_17;
    forward_join_38: {
    forward_join_37: {
    forward_join_30: {
    forward_join_28: {
    life2_3 = (moom.zf.e ^ 122527771743323L);
    ((net.minecraft.network.PacketBuffer)(p0)).writeFloat(((float)(this.a)));
    spill4602_0 = moom.y7.j();
    ((net.minecraft.network.PacketBuffer)(p0)).writeFloat(((float)(this.b)));
    life4_15 = ((spill4602_0) ? 1 : 0);
    life5_17 = 0;
    spill4602_1 = this.c;
    if (!((life4_15 == 0))) {
        forwardValue4602_30_0 = ((spill4602_1) ? 1 : 0);
        break forward_join_30;
    }
    if (!(spill4602_1)) {
        break forward_join_28;
    }
    life5_17 = ((byte) (life5_17 | 1));
    }
    forwardValue4602_30_0 = ((this.d) ? 1 : 0);
    }
    if (!((life4_15 == 0))) {
        forwardValue4602_37_0 = forwardValue4602_30_0;
        break forward_join_37;
    }
    if (!((forwardValue4602_30_0 != 0))) {
        break forward_join_38;
    }
    forwardValue4602_37_0 = ((int)(((byte) (life5_17 | 2))));
    }
    life5_17 = forwardValue4602_37_0;
    }
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(life5_17)));
    return;
}


public moom.zf b(boolean p0) {
this.d = ((boolean)(p0));
    return this;
}


public boolean c__Boolean() {
return ((((this.c) ? 1 : 0)) != 0);
}


public float c() {
return this.a;
}


public boolean d__Boolean() {
return ((((this.d) ? 1 : 0)) != 0);
}


public float d() {
return this.b;
}


public void a(moom.y3 p0) {
((moom.y3)(p0)).a(((moom.zf)(this)));
    return;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.zf)(this)).a(((moom.y3)(((moom.y3)(p0)))));
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
moom.zf forwardValue4601_25_0;
    int forwardValue4601_25_1;
    moom.zf forwardValue4601_26_0;
    moom.zf forwardValue4601_27_0;
    int forwardValue4601_27_1;
    moom.zf forwardValue4601_36_0;
    int forwardValue4601_36_1;
    moom.zf forwardValue4601_37_0;
    moom.zf forwardValue4601_38_0;
    int forwardValue4601_38_1;
    boolean spill4601_0;
    moom.zf spill4601_1;
    int spill4601_2;
    moom.zf spill4601_3;
    int spill4601_4;
    long life2_3;
    int life5_15;
    int life4_16;
    forward_join_38: {
    forward_join_37: {
    forward_join_36: {
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    life2_3 = (moom.zf.e ^ 28199851263954L);
    this.a = ((float)(((net.minecraft.network.PacketBuffer)(p0)).readFloat()));
    this.b = ((float)(((net.minecraft.network.PacketBuffer)(p0)).readFloat()));
    spill4601_0 = moom.y7.i();
    life5_15 = ((net.minecraft.network.PacketBuffer)(p0)).readByte();
    life4_16 = ((spill4601_0) ? 1 : 0);
    spill4601_1 = this;
    spill4601_2 = (life5_15 & 1);
    if (!((life4_16 != 0))) {
        forwardValue4601_25_0 = spill4601_1;
        forwardValue4601_25_1 = spill4601_2;
        break forward_join_25;
    }
    if (!((spill4601_2 > 0))) {
        forwardValue4601_26_0 = spill4601_1;
        break forward_join_26;
    }
    forwardValue4601_25_0 = spill4601_1;
    forwardValue4601_25_1 = 1;
    }
    forwardValue4601_27_0 = forwardValue4601_25_0;
    forwardValue4601_27_1 = forwardValue4601_25_1;
    break forward_join_27;
    }
    forwardValue4601_27_0 = forwardValue4601_26_0;
    forwardValue4601_27_1 = 0;
    }
    ((moom.zf)(forwardValue4601_27_0)).c = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue4601_27_1)));
    spill4601_3 = this;
    spill4601_4 = (life5_15 & 2);
    if (!((life4_16 != 0))) {
        forwardValue4601_36_0 = spill4601_3;
        forwardValue4601_36_1 = spill4601_4;
        break forward_join_36;
    }
    if (!((spill4601_4 > 0))) {
        forwardValue4601_37_0 = spill4601_3;
        break forward_join_37;
    }
    forwardValue4601_36_0 = spill4601_3;
    forwardValue4601_36_1 = 1;
    }
    forwardValue4601_38_0 = forwardValue4601_36_0;
    forwardValue4601_38_1 = forwardValue4601_36_1;
    break forward_join_38;
    }
    forwardValue4601_38_0 = forwardValue4601_37_0;
    forwardValue4601_38_1 = 0;
    }
    ((moom.zf)(forwardValue4601_38_0)).d = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue4601_38_1)));
    return;
}


private static java.io.IOException a(java.io.IOException p0) {
return p0;
}


public boolean a__Boolean() {
return ((((this.c) ? 1 : 0)) != 0);
}


public moom.zf a(float p0) {
this.a = ((float)(p0));
    return this;
}


public float a() {
return this.a;
}


public moom.zf a(boolean p0) {
this.c = ((boolean)(p0));
    return this;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);


}
