package net.minecraft.client.renderer.entity;


public class RenderPotion extends net.minecraft.client.renderer.entity.RenderSnowball {

public RenderPotion(net.minecraft.client.renderer.entity.RenderManager p0, net.minecraft.client.renderer.entity.RenderItem p1) {
super(p0, net.minecraft.init.Items.bo, p1);
}


public net.minecraft.item.ItemStack a(moom.tW p0) {
return new net.minecraft.item.ItemStack(this.h, 1, ((moom.tW)(p0)).a__Int());
}

public net.minecraft.item.ItemStack a__sourceBridge_xW(net.minecraft.entity.Entity p0) {
return ((net.minecraft.client.renderer.entity.RenderPotion)(this)).a(((moom.tW)(p0)));
}


}
