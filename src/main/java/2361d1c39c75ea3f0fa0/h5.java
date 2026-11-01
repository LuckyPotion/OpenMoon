package moom;

import net.minecraft.client.Minecraft;

public abstract class h5 extends h1 {
   public h5(Minecraft var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public boolean b(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.a(); var4++) {
         int var5 = this.g + this.b / 2 - this.e() / 2 + 2;
         int var6 = this.d + 4 - this.d() + var4 * this.h + this.v;
         int var7 = var1 - var5;
         int var8 = var2 - var6;
         this.a__hO(var4).a(var4, var1, var2, var3, var7, var8);
      }

      this.b(true);
      return false;
   }

   private static Oo b(Oo var0) {
      return var0;
   }

   public boolean a__Boolean(int var1, int var2, int var3) {
      if (this.b__Boolean(var2)) {
         int var4 = this.a(var1, var2);
         if (var4 >= 0) {
            int var5 = this.g + this.b / 2 - this.e() / 2 + 2;
            int var6 = this.d + 4 - this.d() + var4 * this.h + this.v;
            int var7 = var1 - var5;
            int var8 = var2 - var6;

            if (this.a__hO(var4).a__Boolean(var4, var1, var2, var3, var7, var8)) {
               this.b(false);
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected void a(int var1, boolean var2, int var3, int var4) {
   }

   public abstract hO a__hO(int var1);

   @Override
   protected void a(int var1, int var2, int var3) {
      this.a__hO(var1).a(var1, var2, var3);
   }

   @Override
   protected boolean a__Boolean(int var1) {
      return false;
   }

   @Override
   protected void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.a__hO(var1).a(var1, var2, var3, this.e(), var4, var5, var6,
         this.a(var5, var6) == var1);
   }

   @Override
   protected void a__Void() {
   }
}
