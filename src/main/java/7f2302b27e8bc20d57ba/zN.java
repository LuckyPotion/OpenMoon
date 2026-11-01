package moom;


public class zN implements moom.yK<moom.y2> {

protected int a;

protected byte b;

protected byte c;

protected byte d;

protected byte e;

protected byte f;

protected boolean g;

protected boolean h;

private static int[] i;

public zN() {
super();
}


public zN(int p0) {
super();
    this.a = p0;
}


static {
if ((moom.zN.b__ArrayInt() != null)) {
        moom.zN.b(((int[])(new int[1])));
    }
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1736_1(super.toString());
}


public byte i() {
return this.e;
}


public byte b() {
return this.c;
}


public boolean b__Boolean() {
return ((((this.g) ? 1 : 0)) != 0);
}


public static int[] b__ArrayInt() {
return moom.zN.i;
}


public static void b(int[] p0) {
i = ((int[])(p0));
    return;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(this.a)));
    return;
}


public byte e() {
return this.f;
}


public boolean c__Boolean() {
return ((((this.g) ? 1 : 0)) != 0);
}


public byte c() {
return this.d;
}


public byte h() {
return this.d;
}


public byte f() {
return this.b;
}


public boolean d__Boolean() {
return ((((this.h) ? 1 : 0)) != 0);
}


public byte d() {
return this.e;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.zN)(this)).a(((moom.y2)(((moom.y2)(p0)))));
}


public boolean a__Boolean() {
return ((((this.h) ? 1 : 0)) != 0);
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.zN)(this)));
    return;
}


public int a__Int() {
return this.a;
}


public byte a() {
return this.b;
}


public net.minecraft.entity.Entity a(net.minecraft.world.World p0) {
return ((net.minecraft.world.World)(p0)).a(((int)(this.a)));
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).a()));
    return;
}


public byte g() {
return this.c;
}


public byte j() {
return this.f;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1736_1(java.lang.String a0) throws E;


}
