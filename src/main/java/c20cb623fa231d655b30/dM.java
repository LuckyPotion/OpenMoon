package com.moon;

import com.moon.event.CancellableEvent;
import net.minecraft.entity.Entity;

public class dM extends CancellableEvent {
   private final Entity c;

   public dM(Entity var1) {
      this.c = var1;
   }

   public Entity getEntity() {
      return this.c;
   }
}
