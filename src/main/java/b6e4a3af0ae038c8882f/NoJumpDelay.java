package com.moon.module.impl;

import com.moon.event.MoveEvent;
import com.moon.events.subscription.Subscribe;
import com.moon.module.Module;
import com.moon.module.ModuleCategory;

public class NoJumpDelay extends Module {
   public NoJumpDelay(String var1, String var2, String var3, ModuleCategory var4) {
      super(var1, var2, var3, var4);
   }

   @Subscribe
   public void a(MoveEvent var1) {
      d.K.by = 0;
   }
}
