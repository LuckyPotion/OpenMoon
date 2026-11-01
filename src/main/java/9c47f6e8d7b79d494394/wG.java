package moom;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

class wG extends wB {
   final we f;

   wG(we var1, IInventory var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.f = var1;
   }

   @Override
   public boolean a__Boolean(ItemStack var1) {
      return true;
   }

   @Override
   public int a() {
      return 1;
   }
}
