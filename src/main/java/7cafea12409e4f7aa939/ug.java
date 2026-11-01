package moom;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityRabbit;

class ug extends ue {
   public ug(EntityRabbit var1) {
      super(var1, EntityLivingBase.class, 1.4, true);
   }

   @Override
   protected double a(EntityLivingBase var1) {
      return 4.0F + var1.G;
   }
}
