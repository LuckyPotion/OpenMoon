package moom;


public class fj implements net.minecraft.world.IInteractionObject {

private final net.minecraft.world.World a;

private final moom.DT b;

public fj(net.minecraft.world.World p0, moom.DT p1) {
super();
    this.a = p0;
    this.b = p1;
}


public boolean e__Boolean() {
return ((0) != 0);
}


public java.lang.String c__String() {
return "minecraft:crafting_table";
}


public java.lang.String a__String() {
return null;
}


public moom.v8 a(net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.entity.player.EntityPlayer p1) {
return new moom.wl(p0, this.a, this.b);
}


public net.minecraft.util.IChatComponent a__C5() {
return new moom.CN(__sourceIntrinsic_6e581d8d1b3b_originalDynamicSite1436_2(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ai)).b__String()), new java.lang.Object[0]);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6e581d8d1b3b_originalDynamicSite1436_2(java.lang.String a0) throws E;
}
