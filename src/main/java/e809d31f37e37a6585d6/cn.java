package moom;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class cn extends Block {
   public cn() {
      super(fn.d);
      this.a(CreativeTabs.b);
   }

   @Override
   public int a(Random var1) {
      return 3;
   }

   @Override
   public Item a(IBlockState var1, Random var2, int var3) {
      return Items.aL;
   }
}
