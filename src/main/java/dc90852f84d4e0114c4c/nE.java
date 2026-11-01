package moom;

import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;

class nE extends LayerBipedArmor {
   final mZ m;

   nE(mZ var1, mS var2) {
      super(var2);
      this.m = var1;
   }

   @Override
   protected void a() {
      this.b = new iY(0.5F, true);
      this.c = new iY(1.0F, true);
   }
}
