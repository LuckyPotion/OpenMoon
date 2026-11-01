package moom;


public class z_ implements moom.yK<moom.y2> {

private int a;

private moom.DT b;

private int c;

private boolean d;

public z_() {
super();
}


public z_(int p0, moom.DT p1, int p2, boolean p3) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).a(((moom.DT)(this.b)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(this.c)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeBoolean(((boolean)__sourceIntrinsic_integerToBoolean((((this.d) ? 1 : 0)))));
    return;
}


public int b() {
return this.c;
}


public moom.DT a__DT() {
return this.b;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.z_)(this)).a(((moom.y2)(((moom.y2)(p0)))));
}


public int a() {
return this.a;
}


public boolean a__Boolean() {
return ((((this.d) ? 1 : 0)) != 0);
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.z_)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readInt()));
    this.b = ((moom.DT)(((net.minecraft.network.PacketBuffer)(p0)).a__DT()));
    this.c = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readInt()));
    this.d = ((boolean)(((net.minecraft.network.PacketBuffer)(p0)).readBoolean()));
    return;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);


}
