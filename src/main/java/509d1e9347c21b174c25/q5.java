package moom;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

class q5 extends CreativeTabs {
   q5(int var1, String var2) {
      super(var1, var2);
   }

   @Override
   public Item a__wQ() {
      return Item.a(Blocks.ae);
   }
}
