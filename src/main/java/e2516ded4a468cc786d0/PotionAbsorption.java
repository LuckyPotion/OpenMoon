package net.minecraft.potion;

import moom.DD;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.attributes.BaseAttributeMap;

public class PotionAbsorption extends Potion {
   protected PotionAbsorption(int var1, DD var2, boolean var3, int var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public void b(EntityLivingBase var1, BaseAttributeMap var2, int var3) {
      var1.g(var1.j__sourceReturn_bc607678b6() + 4 * (var3 + 1));
      super.b(var1, var2, var3);
   }

   @Override
   public void a(EntityLivingBase var1, BaseAttributeMap var2, int var3) {
      var1.g(var1.j__sourceReturn_bc607678b6() - 4 * (var3 + 1));
      super.a(var1, var2, var3);
   }
}
