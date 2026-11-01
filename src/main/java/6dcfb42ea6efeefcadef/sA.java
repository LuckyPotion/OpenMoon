package moom;

import net.minecraft.client.particle.EntityFX;
import net.minecraft.world.World;

public class sA extends EntityFX {
   protected sA(World var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4 - 0.125, var6, var8, var10, var12);
      this.aM = 0.4F;
      this.aN = 0.4F;
      this.aO = 0.7F;
      this.g(0);
      this.a__Void(0.01F, 0.01F);
      this.aK *= this.ah.nextFloat() * 0.6F + 0.2F;
      this.t = var8 * 0.0;
      this.u = var10 * 0.0;
      this.v = var12 * 0.0;
      this.aJ = (int)(16.0 / (Math.random() * 0.8 + 0.2));
   }

   private static Oo a(Oo var0) {
      return var0;
   }

   @Override
   public void g__Void() {
      this.k = this.n;
      this.l = this.o;
      this.m = this.p;
      this.b__Void(this.t, this.u, this.v);
      if (this.i.a__fE(new DT(this)).a__ch().a__fn() != fn.h) {
         this.f__Void();
      }

      if (this.aJ-- <= 0) {
         this.f__Void();
      }
   }
}
