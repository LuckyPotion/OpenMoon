package moom;

import net.minecraft.entity.IProjectile;
import net.minecraft.world.World;

class rg extends re {
   @Override
   protected IProjectile a(World var1, rB var2) {
      return new tV(var1, var2.a(), var2.b(), var2.c());
   }
}
