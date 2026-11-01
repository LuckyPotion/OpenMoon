package moom;

public class DV extends DT {
   public long p;

   public DV(DT var1, long var2) {
      super(var1.a(), var1.b(), var1.c());
      this.p = var2;
   }
}
