package net.minecraft.inventory;

import java.util.List;
import moom.v8;
import net.minecraft.item.ItemStack;

public interface ICrafting {
   void a(v8 var1, IInventory var2);

   void a(v8 var1, int var2, int var3);

   void a(v8 var1, int var2, ItemStack var3);

   void a(moom.v8 var1, java.util.List<net.minecraft.item.ItemStack> var2);
}
