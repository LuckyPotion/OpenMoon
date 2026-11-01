package net.minecraft.client.renderer.culling;

import moom.CA;
import moom.mv;
import moom.mw;

public class Frustum implements ICamera {
   private final mv a;
   private double b;
   private double c;
   private double d;

   public Frustum() {
      this(mw.a());
   }

   public Frustum(mv var1) {
      this.a = var1;
   }

   public boolean b(double var1, double var3, double var5, double var7, double var9, double var11) {
      return this.a.b(var1 - this.b, var3 - this.c, var5 - this.d, var7 - this.b, var9 - this.c, var11 - this.d);
   }

   @Override
   public void a(double var1, double var3, double var5) {
      this.b = var1;
      this.c = var3;
      this.d = var5;
   }

   @Override
   public boolean a(CA var1) {
      return this.a(var1.b, var1.c, var1.d, var1.e, var1.f, var1.g);
   }

   public boolean a(double var1, double var3, double var5, double var7, double var9, double var11) {
      return this.a.a(var1 - this.b, var3 - this.c, var5 - this.d, var7 - this.b, var9 - this.c, var11 - this.d);
   }
}
