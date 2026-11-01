package moom;

import net.minecraft.entity.IProjectile;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.world.World;

class rf extends re {
   @Override
   protected IProjectile a(World var1, rB var2) {
      EntityArrow var3 = new EntityArrow(var1, var2.a(), var2.b(), var2.c());
      var3.aK = 1;
      return var3;
   }
}
