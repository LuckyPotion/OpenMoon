package moom;


public class zB implements moom.yK<moom.y2> {

private double a;

private double b;

private double c;

private float d;

private float e;

private java.util.Set<net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags> f;

public zB() {
super();
}


public zB(double p0, double p1, double p2, float p3, float p4, java.util.Set<net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags> p5) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
    this.e = p4;
    this.f = p5;
}


public float b__Float() {
return this.e;
}


public double b() {
return this.b;
}


public moom.zB b(double p0) {
this.b = ((double)(p0));
    return this;
}


public moom.zB b(float p0) {
this.e = ((float)(p0));
    return this;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).writeDouble(((double)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeDouble(((double)(this.b)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeDouble(((double)(this.c)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeFloat(((float)(this.d)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeFloat(((float)(this.e)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags.a(((java.util.Set)(this.f))))));
    return;
}


public moom.zB c(double p0) {
this.c = ((double)(p0));
    return this;
}


public double c() {
return this.c;
}


public moom.zB a(java.util.Set<net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags> p0) {
this.f = ((java.util.Set)(p0));
    return this;
}


public moom.zB a(float p0) {
this.d = ((float)(p0));
    return this;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((double)(((net.minecraft.network.PacketBuffer)(p0)).readDouble()));
    this.b = ((double)(((net.minecraft.network.PacketBuffer)(p0)).readDouble()));
    this.c = ((double)(((net.minecraft.network.PacketBuffer)(p0)).readDouble()));
    this.d = ((float)(((net.minecraft.network.PacketBuffer)(p0)).readFloat()));
    this.e = ((float)(((net.minecraft.network.PacketBuffer)(p0)).readFloat()));
    this.f = ((java.util.Set)(net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags.a(((int)(((net.minecraft.network.PacketBuffer)(p0)).readUnsignedByte())))));
    return;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.zB)(this)).a(((moom.y2)(((moom.y2)(p0)))));
}


public float a__Float() {
return this.d;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.zB)(this)));
    return;
}


public java.util.Set<net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags> a__Set() {
return this.f;
}


public moom.zB a(double p0) {
this.a = ((double)(p0));
    return this;
}


public double a() {
return this.a;
}



}
