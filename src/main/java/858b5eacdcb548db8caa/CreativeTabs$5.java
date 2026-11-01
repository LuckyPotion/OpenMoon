package net.minecraft.creativetab;

import net.minecraft.block.BlockDoublePlant$EnumPlantType;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

class CreativeTabs$5 extends CreativeTabs {
   CreativeTabs$5(int var1, String var2) {
      super(var1, var2);
   }

   @Override
   public int b() {
      return BlockDoublePlant$EnumPlantType.PAEONIA.a();
   }

   @Override
   public Item a__wQ() {
      return Item.a(Blocks.cj);
   }
}
