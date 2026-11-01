package com.moon;

import com.moon.event.CancellableEvent;
import net.minecraft.entity.EntityLivingBase;

public class d6 extends CancellableEvent {
   private final EntityLivingBase c;

   public d6(EntityLivingBase var1) {
      this.c = var1;
   }

   public EntityLivingBase getEntity() {
      return this.c;
   }
}
