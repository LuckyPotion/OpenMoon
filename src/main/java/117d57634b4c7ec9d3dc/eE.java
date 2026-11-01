package com.moon;

import com.moon.event.Event;

public class eE extends Event {
   private float a;

   public eE(float var1) {
      this.a = var1;
   }

   public eE a(float var1) {
      this.a = var1;
      return this;
   }

   public float a() {
      return this.a;
   }
}
