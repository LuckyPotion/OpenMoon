package net.minecraft.entity.ai;

import net.minecraft.entity.EntityLiving;

public class EntityJumpHelper {
   private final EntityLiving a;
   protected boolean b;

   public EntityJumpHelper(EntityLiving var1) {
      this.a = var1;
   }

   public void b() {
      this.a.h(this.b);
      this.b = false;
   }

   public void a() {
      this.b = true;
   }
}
