package moom;


public class wB {

private final int a;

public final net.minecraft.inventory.IInventory b;

public int c;

public int d;

public int e;

private static final long j;

public wB(net.minecraft.inventory.IInventory p0, int p1, int p2, int p3) {
super();
    this.b = p0;
    this.a = p1;
    this.d = p2;
    this.e = p3;
}


static {
j = (moom._c.a(-7173942680536150444L, -8535394101515878644L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(81522784748103L);
}


public void b(net.minecraft.item.ItemStack p0) {
((net.minecraft.inventory.IInventory)(this.b)).a__Void(((int)(this.a)), ((net.minecraft.item.ItemStack)(p0)));
    ((moom.wB)(this)).a__Void();
    return;
}


public boolean b() {
return ((1) != 0);
}


public int a(net.minecraft.item.ItemStack p0) {
return this.a();
}


public int a() {
return ((net.minecraft.inventory.IInventory)(this.b)).c__Int();
}


public java.lang.String a__String() {
return null;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a(net.minecraft.entity.player.EntityPlayer p0) {
return ((1) != 0);
}


public boolean a(net.minecraft.inventory.IInventory p0, int p1) {
int forwardValue4355_17_0;
    int forwardValue4355_19_0;
    int spill4355_0;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life3_3 = (moom.wB.j ^ 140276179840005L);
    life5_5 = moom.v8.b__Arrayr3();
    if (!((p0 == this.b))) {
        break forward_join_18;
    }
    spill4355_0 = p1;
    if (!((life5_5 == null))) {
        forwardValue4355_17_0 = spill4355_0;
        break forward_join_17;
    }
    if (!((spill4355_0 == this.a))) {
        break forward_join_18;
    }
    forwardValue4355_17_0 = 1;
    }
    forwardValue4355_19_0 = forwardValue4355_17_0;
    break forward_join_19;
    }
    forwardValue4355_19_0 = 0;
    }
    return ((forwardValue4355_19_0) != 0);
}


public net.minecraft.item.ItemStack a(int p0) {
return ((net.minecraft.inventory.IInventory)(this.b)).a(((int)(this.a)), ((int)(p0)));
}


public void a(net.minecraft.entity.player.EntityPlayer p0, net.minecraft.item.ItemStack p1) {
((moom.wB)(this)).a__Void();
    return;
}


protected void a__Void(net.minecraft.item.ItemStack p0) {
return;
}


protected void a(net.minecraft.item.ItemStack p0, int p1) {
return;
}


public void a(net.minecraft.item.ItemStack p0, net.minecraft.item.ItemStack p1) {
net.minecraft.item.ItemStack forwardValue4356_11_0;
    net.minecraft.item.ItemStack forwardValue4356_15_0;
    net.minecraft.item.ItemStack forwardValue4356_22_0;
    net.minecraft.item.ItemStack spill4356_0;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    int life6_38;
    forward_join_33: {
    forward_join_22: {
    forward_join_15: {
    forward_join_11: {
    life3_3 = (moom.wB.j ^ 122596707382906L);
    life5_5 = moom.v8.b__Arrayr3();
    spill4356_0 = p0;
    if (!((life5_5 == null))) {
        forwardValue4356_11_0 = spill4356_0;
        break forward_join_11;
    }
    if (!((spill4356_0 != null))) {
        break forward_join_33;
    }
    forwardValue4356_11_0 = p1;
    }
    if (!((life5_5 == null))) {
        forwardValue4356_15_0 = forwardValue4356_11_0;
        break forward_join_15;
    }
    if (!((forwardValue4356_11_0 != null))) {
        break forward_join_33;
    }
    forwardValue4356_15_0 = p0;
    }
    if (!((life5_5 == null))) {
        forwardValue4356_22_0 = forwardValue4356_15_0;
        break forward_join_22;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue4356_15_0)).a__wQ() == ((net.minecraft.item.ItemStack)(p1)).a__wQ()))) {
        break forward_join_33;
    }
    forwardValue4356_22_0 = p1;
    }
    life6_38 = (((net.minecraft.item.ItemStack)(forwardValue4356_22_0)).b - ((net.minecraft.item.ItemStack)(p0)).b);
    if (!((life6_38 > 0))) {
        break forward_join_33;
    }
    this.a(((net.minecraft.item.ItemStack)(p0)), ((int)(life6_38)));
    }
    return;
}


public void a__Void() {
((net.minecraft.inventory.IInventory)(this.b)).a__Void();
    return;
}


public boolean a__Boolean() {
long local1 = (moom.wB.j ^ 101881494577304L);
    return ((((((moom.wB)(this)).a__xW() != null) ? 1 : 0)) != 0);
}


public net.minecraft.item.ItemStack a__xW() {
return ((net.minecraft.inventory.IInventory)(this.b)).a__xW(((int)(this.a)));
}


public boolean a__Boolean(net.minecraft.item.ItemStack p0) {
return ((1) != 0);
}

}
