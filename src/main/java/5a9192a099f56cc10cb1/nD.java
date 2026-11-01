package moom;

import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;

class nD extends LayerBipedArmor {
   final mY m;

   nD(mY var1, mS var2) {
      super(var2);
      this.m = var1;
   }

   @Override
   protected void a() {
      this.b = new iZ(0.5F, true);
      this.c = new iZ(1.0F, true);
   }
}
