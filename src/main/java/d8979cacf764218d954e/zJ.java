package moom;


public class zJ implements moom.yK<moom.y2> {

private int a;

private moom.DT b;

private moom.bs c;

private java.lang.String d;

public zJ() {
super();
}


public zJ(moom.sF p0) {
super();
    this.a = (p0).e__Int();
    this.b = (p0).b__DT();
    this.c = p0.aG;
    this.d = p0.aH.title;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.String)(this.d)));
    ((net.minecraft.network.PacketBuffer)(p0)).a(((moom.DT)(this.b)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(((moom.bs)(this.c)).b())));
    return;
}


public moom.DT a__DT() {
return this.b;
}


public moom.bs a__bs() {
return this.c;
}


public java.lang.String a__String() {
return this.d;
}


public int a() {
return this.a;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.zJ)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).a()));
    this.d = ((java.lang.String)(((net.minecraft.network.PacketBuffer)(p0)).a__String(((int)(moom.aU.field_180001_A)))));
    this.b = ((moom.DT)(((net.minecraft.network.PacketBuffer)(p0)).a__DT()));
    this.c = ((moom.bs)(moom.bs.b(((int)(((net.minecraft.network.PacketBuffer)(p0)).readUnsignedByte())))));
    return;
}

}
