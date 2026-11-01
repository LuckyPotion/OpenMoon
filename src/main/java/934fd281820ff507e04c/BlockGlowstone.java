package net.minecraft.block;

import java.util.Random;
import moom.Dr;
import moom.fm;
import moom.fn;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BlockGlowstone extends Block {
   public BlockGlowstone(fn var1) {
      super(var1);
      this.a(CreativeTabs.b);
   }

   @Override
   public fm a__fm(IBlockState var1) {
      return fm.d;
   }

   @Override
   public Item a(IBlockState var1, Random var2, int var3) {
      return Items.aT;
   }

   @Override
   public int a(Random var1) {
      return 2 + var1.nextInt(3);
   }

   @Override
   public int a(int var1, Random var2) {
      return Dr.a(this.a(var2) + var2.nextInt(var1 + 1), 1, 4);
   }
}
