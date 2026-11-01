package moom;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class xt extends xp {
   public xt(int var1) {
      super(var1, false);
      this.b(1);
   }

   @Override
   public ItemStack b(ItemStack var1, World var2, EntityPlayer var3) {
      super.b(var1, var2, var3);
      return new ItemStack(Items.z);
   }
}
