package moom;


public class zO extends moom.zN {

public zO() {
super();
}


public zO(int p0, byte p1, byte p2, byte p3, boolean p4) {
super(p0);
    this.b = p1;
    this.c = p2;
    this.d = p3;
    this.g = p4;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
super.b(((net.minecraft.network.PacketBuffer)(p0)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.b)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.c)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.d)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeBoolean(((boolean)__sourceIntrinsic_integerToBoolean((((this.g) ? 1 : 0)))));
    return;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
super.a(((moom.y2)(((moom.y2)(p0)))));
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
super.a(((net.minecraft.network.PacketBuffer)(p0)));
    this.b = ((byte)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    this.c = ((byte)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    this.d = ((byte)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    this.g = ((boolean)(((net.minecraft.network.PacketBuffer)(p0)).readBoolean()));
    return;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);

public void a(moom.y2 __bridgeParam0) { this.a__sourceBridge_691ab4d076(((moom.yE)(__bridgeParam0))); }
}
