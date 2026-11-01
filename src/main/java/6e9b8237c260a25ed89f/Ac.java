package moom;


public class Ac implements moom.yK<moom.y2> {

public static final java.lang.String[] a;

private int b;

private float c;

public Ac() {
super();
}


public Ac(int p0, float p1) {
super();
    this.b = p0;
    this.c = p1;
}


static {
a = ((java.lang.String[])(new java.lang.String[] {"tile.bed.notValid"}));
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.b)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeFloat(((float)(this.c)));
    return;
}


public float a() {
return this.c;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.Ac)(this)).a(((moom.y2)(((moom.y2)(p0)))));
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.Ac)(this)));
    return;
}


public int a__Int() {
return this.b;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.b = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readUnsignedByte()));
    this.c = ((float)(((net.minecraft.network.PacketBuffer)(p0)).readFloat()));
    return;
}



}
