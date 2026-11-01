package com.moon;

import com.moon.event.Event;

public class es extends Event {
   private float a;

   public es(float var1) {
      this.a = var1;
   }

   public es a(float var1) {
      this.a = var1;
      return this;
   }

   public float a() {
      return this.a;
   }
}
