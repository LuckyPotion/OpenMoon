package net.minecraft.inventory;

import moom.bs;
import net.minecraft.item.ItemStack;

public interface ISidedInventory extends IInventory {
   boolean b(int var1, ItemStack var2, bs var3);

   boolean a(int var1, ItemStack var2, bs var3);

   int[] a(bs var1);
}
