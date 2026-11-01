package com.moon.event;

import com.moon.module.Module;

public class ModuleToggleEvent extends Event {
   private final boolean enabled;
   private final Module module;

   public ModuleToggleEvent(boolean var1, Module var2) {
      this.enabled = var1;
      this.module = var2;
   }

   public boolean isEnabled() {
      return this.enabled;
   }

   public Module getModule() {
      return this.module;
   }
}
