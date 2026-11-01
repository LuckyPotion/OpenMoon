package moom;

import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;

class nA extends LayerBipedArmor {
   final mT m;

   nA(mT var1, mS var2) {
      super(var2);
      this.m = var1;
   }

   @Override
   protected void a() {
      this.b = new iU(0.5F);
      this.c = new iU(1.0F);
   }
}
