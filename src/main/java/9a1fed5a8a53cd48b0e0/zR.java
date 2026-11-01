package moom;


public class zR implements moom.yK<moom.y2> {

private int a;

private int b;

private int c;

private int d;

private byte e;

private byte f;

private boolean g;

public zR(int p0, int p1, int p2, int p3, byte p4, byte p5, boolean p6) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
    this.e = p4;
    this.f = p5;
    this.g = p6;
}


public zR(net.minecraft.entity.Entity p0) {
super();
    this.a = (p0).e__Int();
    this.b = moom.Dr.b__Int((p0.n * 0x1.0000000000000p+5d));
    this.c = moom.Dr.b__Int((p0.o * 0x1.0000000000000p+5d));
    this.d = moom.Dr.b__Int((p0.p * 0x1.0000000000000p+5d));
    this.e = ((byte) (((int) (((p0.w * 0x1.0000000000000p+8f) / 0x1.6800000000000p+8f)))));
    this.f = ((byte) (((int) (((p0.x * 0x1.0000000000000p+8f) / 0x1.6800000000000p+8f)))));
    this.g = p0.A;
}


public zR() {
super();
}


public boolean b__Boolean() {
return ((((this.g) ? 1 : 0)) != 0);
}


public int b__Int() {
return this.b;
}


public byte b() {
return this.f;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(this.b)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(this.c)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(this.d)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.e)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.f)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeBoolean(((boolean)__sourceIntrinsic_integerToBoolean((((this.g) ? 1 : 0)))));
    return;
}


public int e() {
return this.a;
}


public int c__Int() {
return this.c;
}


public byte c() {
return this.e;
}


public int h() {
return this.d;
}


public int f() {
return this.b;
}


public byte d() {
return this.f;
}


public int d__Int() {
return this.d;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.zR)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).a()));
    this.b = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readInt()));
    this.c = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readInt()));
    this.d = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readInt()));
    this.e = ((byte)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    this.f = ((byte)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    this.g = ((boolean)(((net.minecraft.network.PacketBuffer)(p0)).readBoolean()));
    return;
}


public byte a() {
return this.e;
}


public boolean a__Boolean() {
return ((((this.g) ? 1 : 0)) != 0);
}


public int a__Int() {
return this.a;
}


public int g() {
return this.c;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
