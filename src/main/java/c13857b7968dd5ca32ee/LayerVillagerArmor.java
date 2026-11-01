package net.minecraft.client.renderer.entity.layers;

import moom.i0;
import moom.mS;

public class LayerVillagerArmor extends LayerBipedArmor {
   public LayerVillagerArmor(moom.mS<?> var1) {
      super(var1);
   }

   @Override
   protected void a() {
      this.b = new i0(0.5F, 0.0F, true);
      this.c = new i0(1.0F, 0.0F, true);
   }
}
