package moom;


public class hP implements moom.hO {

private final net.minecraft.client.Minecraft a;

private final moom.gc b;

private final moom.gc c;

public hP(moom.gc p0, moom.gc p1) {
super();
    this.a = net.minecraft.client.Minecraft.a__fM();
    this.b = p0;
    this.c = p1;
}


public void a(int p0, int p1, int p2, int p3, int p4, int p5) {
if ((this.b != null)) {
        ((moom.gc)(this.b)).a(((int)(p1)), ((int)(p2)));
    }
    if ((this.c != null)) {
        ((moom.gc)(this.c)).a(((int)(p1)), ((int)(p2)));
    }
    return;
}


public void a(int p0, int p1, int p2) {
return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(int p0, int p1, int p2, int p3, int p4, int p5) {
if ((__sourceIntrinsic_booleanComparison(((moom.gc)(this.b)).a__Boolean(((net.minecraft.client.Minecraft)(this.a)), ((int)(p1)), ((int)(p2)))) != 0)) {
        if ((((this.b instanceof moom.gi) ? 1 : 0) != 0)) {
        ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.a)).W)).a(((net.minecraft.client.settings.GameSettings$Options)(((moom.gi)(((moom.gi)(this.b)))).b())), ((int)(1)));
        ((moom.gc)(this.b)).k = ((java.lang.String)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.a)).W)).a__String(((net.minecraft.client.settings.GameSettings$Options)(net.minecraft.client.settings.GameSettings$Options.a(((int)(((moom.gc)(this.b)).l))))))));
    }
        return ((1) != 0);
    }
    if ((this.c != null)) {
        if ((__sourceIntrinsic_booleanComparison(((moom.gc)(this.c)).a__Boolean(((net.minecraft.client.Minecraft)(this.a)), ((int)(p1)), ((int)(p2)))) != 0)) {
        if ((((this.c instanceof moom.gi) ? 1 : 0) != 0)) {
        ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.a)).W)).a(((net.minecraft.client.settings.GameSettings$Options)(((moom.gi)(((moom.gi)(this.c)))).b())), ((int)(1)));
        ((moom.gc)(this.c)).k = ((java.lang.String)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.a)).W)).a__String(((net.minecraft.client.settings.GameSettings$Options)(net.minecraft.client.settings.GameSettings$Options.a(((int)(((moom.gc)(this.c)).l))))))));
    }
        return ((1) != 0);
    }
    }
    return ((0) != 0);
}


public void a(int p0, int p1, int p2, int p3, int p4, int p5, int p6, boolean p7) {
if ((this.b != null)) {
        ((moom.gc)(this.b)).j = ((int)(p2));
        ((moom.gc)(this.b)).a(((net.minecraft.client.Minecraft)(this.a)), ((int)(p5)), ((int)(p6)));
    }
    if ((this.c != null)) {
        ((moom.gc)(this.c)).j = ((int)(p2));
        ((moom.gc)(this.c)).a(((net.minecraft.client.Minecraft)(this.a)), ((int)(p5)), ((int)(p6)));
    }
    return;
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
