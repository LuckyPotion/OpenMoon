package moom;


public class zK implements moom.yK<moom.y2> {

private int a;

private int b;

private int c;

private int d;

private int e;

public zK() {
super();
}


public zK(moom.tL p0) {
super();
    this.a = (p0).e__Int();
    this.b = moom.Dr.b__Int((p0.n * 0x1.0000000000000p+5d));
    this.c = moom.Dr.b__Int((p0.o * 0x1.0000000000000p+5d));
    this.d = moom.Dr.b__Int((p0.p * 0x1.0000000000000p+5d));
    this.e = (p0).a();
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(this.b)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(this.c)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(this.d)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeShort(((int)(this.e)));
    return;
}


public int b() {
return this.b;
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


public int a() {
return this.a;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.zK)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).a()));
    this.b = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readInt()));
    this.c = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readInt()));
    this.d = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readInt()));
    this.e = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readShort()));
    return;
}

}
