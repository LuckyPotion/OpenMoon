package moom;

import net.minecraft.entity.monster.EntitySlime;

class vm extends uc {
   private final EntitySlime c;

   public vm(EntitySlime var1) {
      this.c = var1;
      this.a(5);
   }

   @Override
   public void c() {
      ((vx)this.c.a__vu()).a(1.0);
   }

   @Override
   public boolean a__Boolean() {
      return true;
   }
}
