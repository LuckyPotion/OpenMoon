package moom;

public class GW extends GV {
   public GW(long var1, GD var3) {
      super(var1, var3);
   }

   @Override
   protected int a(int var1, int var2, int var3, int var4) {
      return this.a(new int[]{var1, var2, var3, var4});
   }
}
