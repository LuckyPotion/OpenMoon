package moom;


public class hR implements moom.hO {

private final net.minecraft.client.Minecraft a;

private final net.minecraft.client.gui.Gui b;

private final net.minecraft.client.gui.Gui c;

private net.minecraft.client.gui.Gui d;

public hR(net.minecraft.client.gui.Gui p0, net.minecraft.client.gui.Gui p1) {
super();
    this.a = net.minecraft.client.Minecraft.a__fM();
    this.b = p0;
    this.c = p1;
}


public net.minecraft.client.gui.Gui b() {
return this.c;
}


private void a(moom.hJ p0, int p1, int p2, int p3) {
((moom.hJ)(p0)).a(((int)(p1)), ((int)(p2)), ((int)(p3)));
    if ((__sourceIntrinsic_booleanComparison(((moom.hJ)(p0)).b__Boolean()) != 0)) {
        this.d = ((net.minecraft.client.gui.Gui)(p0));
    }
    return;
}


private boolean a__Boolean(moom.gc p0, int p1, int p2, int p3) {
int local5 = __sourceIntrinsic_booleanToInteger(((moom.gc)(p0)).a__Boolean(((net.minecraft.client.Minecraft)(this.a)), ((int)(p1)), ((int)(p2))));
    if ((local5 != 0)) {
        this.d = ((net.minecraft.client.gui.Gui)(p0));
    }
    return ((local5) != 0);
}


private boolean a__Boolean(net.minecraft.client.gui.Gui p0, int p1, int p2, int p3) {
if ((p0 == null)) {
        return ((0) != 0);
    }
    if ((((p0 instanceof moom.gc) ? 1 : 0) != 0)) {
        return (__sourceIntrinsic_booleanComparison((((moom.hR)(this)).a__Boolean(((moom.gc)(((moom.gc)(p0)))), ((int)(p1)), ((int)(p2)), ((int)(p3))))) != 0);
    }
    if ((((p0 instanceof moom.hJ) ? 1 : 0) != 0)) {
        this.a(((moom.hJ)(((moom.hJ)(p0)))), ((int)(p1)), ((int)(p2)), ((int)(p3)));
    }
    return ((0) != 0);
}


public boolean a__Boolean(int p0, int p1, int p2, int p3, int p4, int p5) {
int forwardValue3606_23_0;
    int life7_7;
    int life8_15;
    forward_join_23: {
    forward_join_22: {
    forward_join_20: {
    life7_7 = ((((moom.hR)(this)).a__Boolean(((net.minecraft.client.gui.Gui)(this.b)), ((int)(p1)), ((int)(p2)), ((int)(p3)))) ? 1 : 0);
    life8_15 = ((((moom.hR)(this)).a__Boolean(((net.minecraft.client.gui.Gui)(this.c)), ((int)(p1)), ((int)(p2)), ((int)(p3)))) ? 1 : 0);
    if (!((life7_7 == 0))) {
        break forward_join_20;
    }
    if (!((life8_15 != 0))) {
        break forward_join_22;
    }
    }
    forwardValue3606_23_0 = 1;
    break forward_join_23;
    }
    forwardValue3606_23_0 = 0;
    }
    return ((forwardValue3606_23_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private void a(moom.gc p0, int p1, int p2, int p3) {
((moom.gc)(p0)).a(((int)(p1)), ((int)(p2)));
    return;
}


private void a(net.minecraft.client.gui.Gui p0, int p1, int p2, int p3) {
if ((p0 != null)) {
        if ((((p0 instanceof moom.gc) ? 1 : 0) != 0)) {
        this.a(((moom.gc)(((moom.gc)(p0)))), ((int)(p1)), ((int)(p2)), ((int)(p3)));
    }
    }
    return;
}


public void a(int p0, int p1, int p2, int p3, int p4, int p5) {
this.a(((net.minecraft.client.gui.Gui)(this.b)), ((int)(p1)), ((int)(p2)), ((int)(p3)));
    this.a(((net.minecraft.client.gui.Gui)(this.c)), ((int)(p1)), ((int)(p2)), ((int)(p3)));
    return;
}


private void a(moom.gc p0, int p1, int p2, int p3, boolean p4) {
((moom.gc)(p0)).j = ((int)(p1));
    if ((__sourceIntrinsic_booleanComparison(p4) == 0)) {
        ((moom.gc)(p0)).a(((net.minecraft.client.Minecraft)(this.a)), ((int)(p2)), ((int)(p3)));
    }
    return;
}


private void a(net.minecraft.client.gui.Gui p0, int p1, int p2, int p3, boolean p4) {
if ((p0 != null)) {
        if ((((p0 instanceof moom.gc) ? 1 : 0) != 0)) {
        this.a(((moom.gc)(((moom.gc)(p0)))), ((int)(p1)), ((int)(p2)), ((int)(p3)), ((boolean)(p4)));
    } else {
        if ((((p0 instanceof moom.hJ) ? 1 : 0) != 0)) {
        this.a(((moom.hJ)(((moom.hJ)(p0)))), ((int)(p1)), ((boolean)(p4)));
    } else {
        if ((((p0 instanceof moom.gA) ? 1 : 0) != 0)) {
        this.a(((moom.gA)(((moom.gA)(p0)))), ((int)(p1)), ((int)(p2)), ((int)(p3)), ((boolean)(p4)));
    }
    }
    }
    }
    return;
}


public void a(int p0, int p1, int p2, int p3, int p4, int p5, int p6, boolean p7) {
this.a(((net.minecraft.client.gui.Gui)(this.b)), ((int)(p2)), ((int)(p5)), ((int)(p6)), ((boolean)(false)));
    this.a(((net.minecraft.client.gui.Gui)(this.c)), ((int)(p2)), ((int)(p5)), ((int)(p6)), ((boolean)(false)));
    return;
}


public net.minecraft.client.gui.Gui a() {
return this.b;
}


private void a(moom.hJ p0, int p1, boolean p2) {
((moom.hJ)(p0)).i = ((int)(p1));
    if ((__sourceIntrinsic_booleanComparison(p2) == 0)) {
        ((moom.hJ)(p0)).d__Void();
    }
    return;
}


private void a(moom.gA p0, int p1, int p2, int p3, boolean p4) {
((moom.gA)(p0)).i = ((int)(p1));
    if ((__sourceIntrinsic_booleanComparison(p4) == 0)) {
        ((moom.gA)(p0)).a(((net.minecraft.client.Minecraft)(this.a)), ((int)(p2)), ((int)(p3)));
    }
    return;
}


public void a(int p0, int p1, int p2) {
this.a(((net.minecraft.client.gui.Gui)(this.b)), ((int)(p2)), ((int)(0)), ((int)(0)), ((boolean)(true)));
    this.a(((net.minecraft.client.gui.Gui)(this.c)), ((int)(p2)), ((int)(0)), ((int)(0)), ((boolean)(true)));
    return;
}


private static native int __sourceIntrinsic_booleanToInteger(boolean value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
