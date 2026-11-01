package com.moon;

import com.moon.event.Event;

public class et extends Event {
   private int a;

   public et(int var1) {
      this.a = var1;
   }

   public int a() {
      return this.a;
   }

   public et a(int var1) {
      this.a = var1;
      return this;
   }
}
