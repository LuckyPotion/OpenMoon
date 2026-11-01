package net.minecraft.block;

import java.util.Random;
import moom.fn;
import net.minecraft.creativetab.CreativeTabs;

public class BlockPackedIce extends Block {
   public BlockPackedIce() {
      super(fn.x);
      this.L = 0.98F;
      this.a(CreativeTabs.b);
   }

   @Override
   public int a(Random var1) {
      return 0;
   }
}
