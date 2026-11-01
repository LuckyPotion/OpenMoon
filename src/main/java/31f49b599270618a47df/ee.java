package com.moon;

import com.moon.event.CancellableEvent;
import net.minecraft.entity.Entity;

public class ee extends CancellableEvent {
   private final Entity c;

   public ee(Entity var1) {
      this.c = var1;
   }

   public Entity getEntity() {
      return this.c;
   }
}
