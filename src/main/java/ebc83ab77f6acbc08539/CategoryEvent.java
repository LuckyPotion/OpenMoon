package com.moon.event;

import com.moon.module.ModuleCategory;

public class CategoryEvent extends Event {
   private final ModuleCategory category;
   private final boolean c;

   public CategoryEvent(ModuleCategory var1, boolean var2) {
      this.category = var1;
      this.c = var2;
   }

   public ModuleCategory getCategory() {
      return this.category;
   }

   public boolean a() {
      return this.c;
   }
}
