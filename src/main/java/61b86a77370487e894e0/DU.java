package moom;

public final class DU extends DT {
   private int p;
   private int q;
   private int r;

   public DU() {
      this(0, 0, 0);
   }

   public DU(int var1, int var2, int var3) {
      super(0, 0, 0);
      this.p = var1;
      this.q = var2;
      this.r = var3;
   }

   @Override
   public int b() {
      return this.q;
   }

   @Override
   public int c() {
      return this.r;
   }

   // $VF: synthetic method
   // $VF: bridge method
   @Override
   public DS a__DS(DS var1) {
      return super.c(var1);
   }

   public DU a__DU(int var1, int var2, int var3) {
      this.p = var1;
      this.q = var2;
      this.r = var3;
      return this;
   }

   @Override
   public int a() {
      return this.p;
   }
}
