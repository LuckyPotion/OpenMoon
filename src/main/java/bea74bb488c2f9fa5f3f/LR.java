package moom;

public class LR {
   private LS a = null;
   private LN b = null;
   private boolean c = false;

   public LR(LS var1, LN var2) {
      this.a = var1;
      this.b = var2;
   }

   public void a(boolean var1) {
      this.c = var1;
   }

   public boolean a__Boolean() {
      return this.c;
   }

   public LN a() {
      return this.b;
   }

   public LS a__LS() {
      return this.a;
   }
}
