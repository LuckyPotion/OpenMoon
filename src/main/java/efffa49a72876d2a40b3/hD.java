package com.moon;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class hD {
   private final java.util.List<com.moon.hA> a = new CopyOnWriteArrayList<>();

   public hD() {
   }

   public void b(hA var1) {
      this.a.remove(var1);
   }

   public void a(hA var1) {
      var1.a__Void();
      this.a.add(var1);
   }

   public java.util.List<com.moon.hA> a() {
      return this.a;
   }
}
