package com.moon;

import com.moon.event.Event;

public class eL extends Event {
   private boolean a;

   public eL() {
   }

   public boolean a() {
      return this.a;
   }

   public eL a(boolean var1) {
      this.a = var1;
      return this;
   }
}
