package com.moon;

import com.moon.event.Event;

public class er extends Event {
   int a;

   public er(int var1) {
      this.a = var1;
   }

   public int a() {
      return this.a;
   }

   public er a(int var1) {
      this.a = var1;
      return this;
   }
}
