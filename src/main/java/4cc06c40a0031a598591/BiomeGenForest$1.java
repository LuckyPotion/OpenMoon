package net.minecraft.world.biome;

import java.util.Random;
import moom.DT;
import moom.EW;
import net.minecraft.world.World;

class BiomeGenForest$1 extends BiomeGenMutated {
   final EW aH;

   BiomeGenForest$1(EW var1, int var2, BiomeGenBase var3) {
      super(var2, var3);
      this.aH = var1;
   }

   @Override
   public void a(World var1, Random var2, DT var3) {
      this.aG.a(var1, var2, var3);
   }
}
