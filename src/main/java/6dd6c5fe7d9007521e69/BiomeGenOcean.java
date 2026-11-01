package net.minecraft.world.biome;

import java.util.Random;
import moom.Fm;
import moom.bF;
import net.minecraft.world.World;

public class BiomeGenOcean extends BiomeGenBase {
   public BiomeGenOcean(int var1) {
      super(var1);
      this.aw.clear();
   }

   @Override
   public bF a__bF() {
      return bF.OCEAN;
   }

   @Override
   public void a(World var1, Random var2, Fm var3, int var4, int var5, double var6) {
      super.a(var1, var2, var3, var4, var5, var6);
   }
}
