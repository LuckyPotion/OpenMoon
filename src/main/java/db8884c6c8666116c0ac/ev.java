package com.moon;

import com.moon.event.Event;

public class ev extends Event {
   private String a;
   private boolean c;

   public ev(String var1, boolean var2) {
      this.a = var1;
      this.c = var2;
   }

   public boolean a__Boolean() {
      return this.c;
   }

   public String a() {
      return this.a;
   }
}
