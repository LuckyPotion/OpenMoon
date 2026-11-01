package net.minecraft.client.audio;

import moom.DD;

public class SoundPoolEntry {
   private final DD a;
   private final boolean b;
   private double c;
   private double d;

   public SoundPoolEntry(DD var1, double var2, double var4, boolean var6) {
      this.a = var1;
      this.c = var2;
      this.d = var4;
      this.b = var6;
   }

   public SoundPoolEntry(SoundPoolEntry var1) {
      this.a = var1.a;
      this.c = var1.c;
      this.d = var1.d;
      this.b = var1.b;
   }

   public void b(double var1) {
      this.d = var1;
   }

   public double b() {
      return this.d;
   }

   public boolean a__Boolean() {
      return this.b;
   }

   public void a(double var1) {
      this.c = var1;
   }

   public double a() {
      return this.c;
   }

   public DD a__DD() {
      return this.a;
   }
}
