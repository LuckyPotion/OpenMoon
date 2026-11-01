package moom;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class cQ extends Block {
   public cQ() {
      super(fn.B);
      this.a(CreativeTabs.b);
   }

   @Override
   public Item a(IBlockState var1, Random var2, int var3) {
      return Items.aI;
   }

   @Override
   public int a(Random var1) {
      return 4;
   }
}
