package moom;

public class DN<A, B> {
   private final A b;
   private final B c;

   public DN(A var1, B var2) {
      this.b = (A)var1;
      this.c = (B)var2;
   }

   public B b() {
      return this.c;
   }

   public A a() {
      return this.b;
   }
}
