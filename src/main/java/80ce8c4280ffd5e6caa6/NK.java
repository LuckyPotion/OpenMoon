package moom;

public class NK {
   private final int a;
   private int b;

   public NK(int var1) {
      this.a = var1;
      this.b = var1;
   }

   public int b() {
      return this.b;
   }

   public synchronized int a() {
      return this.b++;
   }

   public synchronized void a__Void() {
      this.b = this.a;
   }
}
