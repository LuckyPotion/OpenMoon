package com.moon;

import com.moon.event.Event;

public class eN extends Event {
   private int a;

   public eN(int var1) {
      this.a = var1;
   }

   public eN a(int var1) {
      this.a = var1;
      return this;
   }

   public int a() {
      return this.a;
   }
}
