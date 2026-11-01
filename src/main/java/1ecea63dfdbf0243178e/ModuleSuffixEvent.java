package com.moon.event;

import com.moon.module.Module;

public class ModuleSuffixEvent extends Event {
   private final String suffix;
   private final Module module;

   public ModuleSuffixEvent(String var1, Module var2) {
      this.suffix = var1;
      this.module = var2;
   }
}
