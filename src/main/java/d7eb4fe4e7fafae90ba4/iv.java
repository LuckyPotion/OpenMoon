package moom;


public class iv implements net.minecraft.inventory.ICrafting {

private final net.minecraft.client.Minecraft a;

private static int[] b;

public iv(net.minecraft.client.Minecraft p0) {
super();
    this.a = p0;
}


static {
if ((moom.iv.b() == null)) {
        moom.iv.b(((int[])(new int[4])));
    }
}


public static int[] b() {
return moom.iv.b;
}


public static void b(int[] p0) {
moom.iv.b = ((int[])(p0));
    return;
}


public void a(moom.v8 p0, net.minecraft.inventory.IInventory p1) {
return;
}


public void a(moom.v8 p0, int p1, net.minecraft.item.ItemStack p2) {
((moom.jI)(((net.minecraft.client.Minecraft)(this.a)).F)).a(((net.minecraft.item.ItemStack)(p2)), ((int)(p1)));
    return;
}


public void a(moom.v8 p0, java.util.List<net.minecraft.item.ItemStack> p1) {
return;
}


public void a(moom.v8 p0, int p1, int p2) {
return;
}

}
