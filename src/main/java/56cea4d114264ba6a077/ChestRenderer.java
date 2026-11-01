package net.minecraft.client.renderer;

import moom.kZ;
import moom.on;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class ChestRenderer {
   public void a(Block var1, float var2) {
      kZ.c(var2, var2, var2, 1.0F);
      kZ.b(90.0F, 0.0F, 1.0F, 0.0F);
      on.a.a(new ItemStack(var1));
   }
}
