package moom;


public class fY extends net.minecraft.client.audio.PositionedSound {

private fY(moom.DD p0, float p1, float p2, boolean p3, int p4, net.minecraft.client.audio.ISound$AttenuationType p5, float p6, float p7, float p8) {
super(p0);
    this.b = p1;
    this.c = p2;
    this.d = p6;
    this.e = p7;
    this.f = p8;
    this.g = p3;
    this.h = p4;
    this.i = p5;
}


public fY(moom.DD p0, float p1, float p2, float p3, float p4, float p5) {
this(p0, p1, p2, false, 0, net.minecraft.client.audio.ISound$AttenuationType.LINEAR, p3, p4, p5);
}


public static moom.fY a(moom.DD p0, float p1) {
return new moom.fY(p0, 0x1.0p-2f, p1, false, 0, net.minecraft.client.audio.ISound$AttenuationType.NONE, 0x0.0p0f, 0x0.0p0f, 0x0.0p0f);
}


public static moom.fY a(moom.DD p0, float p1, float p2, float p3) {
return new moom.fY(p0, 0x1.0p2f, 0x1.0p0f, false, 0, net.minecraft.client.audio.ISound$AttenuationType.LINEAR, p1, p2, p3);
}


public static moom.fY a(moom.DD p0) {
return new moom.fY(p0, 0x1.0p0f, 0x1.0p0f, false, 0, net.minecraft.client.audio.ISound$AttenuationType.NONE, 0x0.0p0f, 0x0.0p0f, 0x0.0p0f);
}

}
