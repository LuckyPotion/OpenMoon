package moom;

public class rC implements rB {
   protected final double a;
   protected final double b;
   protected final double c;

   public rC(double var1, double var3, double var5) {
      this.a = var1;
      this.b = var3;
      this.c = var5;
   }

   @Override
   public double b() {
      return this.b;
   }

   @Override
   public double c() {
      return this.c;
   }

   @Override
   public double a() {
      return this.a;
   }
}
