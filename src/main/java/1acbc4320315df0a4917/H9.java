package moom;

import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;

public abstract class H9 {
   protected IBlockState a = Blocks.a.a__fE();

   public H9() {
   }

   public abstract void a(Random var1, int var2, int var3, int var4, boolean var5);

   public IBlockState a() {
      return this.a;
   }
}
