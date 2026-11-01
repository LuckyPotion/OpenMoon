package net.minecraft.block;

import moom.DT;
import moom.fn;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.World;

public class BlockBarrier extends Block {
   protected BlockBarrier() {
      super(fn.I);
      this.a__ch();
      this.b(6000001.0F);
      this.b__ch();
      this.t = true;
   }

   @Override
   public int c__Int() {
      return -1;
   }

   @Override
   public float a__Float() {
      return 1.0F;
   }

   @Override
   public void a(World var1, DT var2, IBlockState var3, float var4, int var5) {
   }

   @Override
   public boolean j() {
      return false;
   }
}
