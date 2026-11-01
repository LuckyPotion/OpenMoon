package moom;

public class Oo extends RuntimeException {
   private final qY a;

   public Oo(qY var1) {
      this.a = var1;
   }

   @Override
   public Throwable getCause() {
      return this.a.a__Throwable();
   }

   public qY a() {
      return this.a;
   }

   @Override
   public String getMessage() {
      return this.a.a__String();
   }
}
