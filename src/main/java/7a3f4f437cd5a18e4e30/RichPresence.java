package com.moon.module.impl;

import com.moon.module.Module;
import com.moon.module.ModuleCategory;
import com.moon.runtime.ClientContext;

public class RichPresence extends Module {
   public RichPresence(String var1, String var2, String var3, ModuleCategory var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public void onEnable() {
      ClientContext.getInstance().a__n9().a();
   }

   @Override
   public void onDisable() {
      ClientContext.getInstance().a__n9().c();
   }
}
