package moom;

public class Le implements Lx {
   private final String a;
   private final jD b;
   private final bP c;

   public Le(String var1, jD var2, bP var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   @Override
   public String toString() {
      return this.a;
   }

   public float b() {
      return this.c.a(this.b);
   }

   @Override
   public float a() {
      return this.b();
   }

   public void a(float var1) {
      this.c.a(this.b, var1);
   }

   @Override
   public bS a__bS() {
      return bS.FLOAT;
   }
}
