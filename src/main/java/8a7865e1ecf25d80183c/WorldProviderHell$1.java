package net.minecraft.world;

import moom.EC;
import net.minecraft.world.border.WorldBorder;

class WorldProviderHell$1 extends WorldBorder {
   final EC n;

   WorldProviderHell$1(EC var1) {
      this.n = var1;
   }

   @Override
   public double e() {
      return super.e() / 8.0;
   }

   @Override
   public double f() {
      return super.f() / 8.0;
   }
}
