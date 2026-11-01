package moom;


public class zP extends moom.zN {

public zP() {
super();
    this.h = true;
}


public zP(int p0, byte p1, byte p2, boolean p3) {
super(p0);
    this.e = p1;
    this.f = p2;
    this.h = true;
    this.g = p3;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
super.b(((net.minecraft.network.PacketBuffer)(p0)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.e)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.f)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeBoolean(((boolean)__sourceIntrinsic_integerToBoolean((((this.g) ? 1 : 0)))));
    return;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
super.a(((moom.y2)(((moom.y2)(p0)))));
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
super.a(((net.minecraft.network.PacketBuffer)(p0)));
    this.e = ((byte)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    this.f = ((byte)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    this.g = ((boolean)(((net.minecraft.network.PacketBuffer)(p0)).readBoolean()));
    return;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);

public void a(moom.y2 __bridgeParam0) { this.a__sourceBridge_691ab4d076(((moom.yE)(__bridgeParam0))); }
}
