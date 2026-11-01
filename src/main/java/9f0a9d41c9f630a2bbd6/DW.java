package moom;

class DW extends DT {
   private final int p;

   public DW(DT var1, int var2) {
      super(var1.a(), var1.b(), var1.c());
      this.p = var2;
   }

   public int d() {
      return this.p;
   }
}
