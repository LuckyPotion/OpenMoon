package net.minecraft.enchantment;

import net.minecraft.entity.EnumCreatureAttribute;

final class EnchantmentHelper$ModifierLiving implements EnchantmentHelper$IModifier {
   public float a;
   public EnumCreatureAttribute b;

   private EnchantmentHelper$ModifierLiving() {
   }

   @Override
   public void a(Enchantment var1, int var2) {
      this.a += var1.a(var2, this.b);
   }
}
