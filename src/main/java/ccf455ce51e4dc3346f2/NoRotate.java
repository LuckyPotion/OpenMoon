package com.moon.module.impl;

import com.moon.eK;
import com.moon.events.subscription.Subscribe;
import com.moon.module.Module;
import com.moon.module.ModuleCategory;

public class NoRotate extends Module {
   public NoRotate(String var1, String var2, String var3, ModuleCategory var4) {
      super(var1, var2, var3, var4);
   }

   @Subscribe
   public void a(eK var1) {
      var1.b(true);
   }
}
