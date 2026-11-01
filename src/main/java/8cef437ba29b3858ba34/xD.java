package moom;


public class xD extends net.minecraft.item.Item {

private static final long n;

public xD() {
super();
    (this).a(net.minecraft.creativetab.CreativeTabs.i);
}


static {
n = (moom._c.a(-8238984857972244884L, -975575385667648451L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(88943215535511L);
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, net.minecraft.entity.EntityLivingBase p2) {
int forwardValue4485_15_0;
    int forwardValue4485_40_0;
    boolean spill4485_0;
    long life4_3;
    int life6_5;
    net.minecraft.entity.EntityLiving life7_28;
    forward_join_40: {
    forward_join_35: {
    forward_join_15: {
    forward_join_13: {
    life4_3 = (moom.xD.n ^ 20175224156719L);
    life6_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill4485_0 = ((net.minecraft.item.ItemStack)(p0)).f__Boolean();
    if (!((life6_5 != 0))) {
        forwardValue4485_15_0 = ((spill4485_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!((!spill4485_0))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue4485_15_0 = ((p2 instanceof net.minecraft.entity.EntityLiving) ? 1 : 0);
    }
    if (!((life6_5 != 0))) {
        forwardValue4485_40_0 = forwardValue4485_15_0;
        break forward_join_40;
    }
    if (!((forwardValue4485_15_0 != 0))) {
        break forward_join_35;
    }
    life7_28 = ((net.minecraft.entity.EntityLiving)(p2));
    ((net.minecraft.entity.EntityLiving)(life7_28)).a(((java.lang.String)(((net.minecraft.item.ItemStack)(p0)).b__String())));
    ((net.minecraft.entity.EntityLiving)(life7_28)).S();
    net.minecraft.item.ItemStack __stackOp4485_11_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp4485_11_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4485_11_0)).b - 1)));
    return ((1) != 0);
    }
    forwardValue4485_40_0 = ((super.a(((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.entity.player.EntityPlayer)(p1)), ((net.minecraft.entity.EntityLivingBase)(p2)))) ? 1 : 0);
    }
    return ((forwardValue4485_40_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
