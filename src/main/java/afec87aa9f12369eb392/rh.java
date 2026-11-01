package moom;

import net.minecraft.entity.IProjectile;
import net.minecraft.world.World;

class rh extends re {
   @Override
   protected IProjectile a(World var1, rB var2) {
      return new tX(var1, var2.a(), var2.b(), var2.c());
   }
}
