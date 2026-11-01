package net.minecraft.block;

import java.util.Random;
import moom.fm;
import moom.fn;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class BlockObsidian extends Block {
   public BlockObsidian() {
      super(fn.e);
      this.a(CreativeTabs.b);
   }

   @Override
   public Item a(IBlockState var1, Random var2, int var3) {
      return Item.a(Blocks.Z);
   }

   @Override
   public fm a__fm(IBlockState var1) {
      return fm.E;
   }
}
