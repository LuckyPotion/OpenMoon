package com.moon.event;

import net.minecraft.entity.Entity;

public class EntityEvent extends CancellableEvent {
   private final Entity entity;

   public EntityEvent(Entity var1) {
      this.entity = var1;
   }

   public Entity getEntity() {
      return this.entity;
   }
}
