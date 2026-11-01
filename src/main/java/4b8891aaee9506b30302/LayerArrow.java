package net.minecraft.client.renderer.entity.layers;

import java.util.Random;
import moom.Dr;
import moom.jC;
import moom.jD;
import moom.kZ;
import moom.lt;
import moom.mS;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;

public class LayerArrow implements net.minecraft.client.renderer.entity.layers.LayerRenderer<net.minecraft.entity.EntityLivingBase> {
   private final mS a;

   public LayerArrow(mS var1) {
      this.a = var1;
   }

   @Override
   public void a(EntityLivingBase var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      int var9 = var1.j__Int();
      if (var9 > 0) {
         Entity var10 = new EntityArrow(var1.i, var1.n, var1.o, var1.p);
         Random var11 = new Random(var1.e__Int());
         lt.a();

         for (int var12 = 0; var12 < var9; var12++) {
            kZ.B();
            jD var13 = this.a.a__iQ().a(var11);
            jC var14 = var13.p.get(var11.nextInt(var13.p.size()));
            var13.c(0.0625F);
            float var15 = var11.nextFloat();
            float var16 = var11.nextFloat();
            float var17 = var11.nextFloat();
            float var18 = (var14.c + (var14.f - var14.c) * var15) / 16.0F;
            float var19 = (var14.d + (var14.g - var14.d) * var16) / 16.0F;
            float var20 = (var14.e + (var14.h - var14.e) * var17) / 16.0F;
            kZ.b(var18, var19, var20);
            var15 = var15 * 2.0F - 1.0F;
            var16 = var16 * 2.0F - 1.0F;
            var17 = var17 * 2.0F - 1.0F;
            var15 *= -1.0F;
            var16 *= -1.0F;
            var17 *= -1.0F;
            float var21 = Dr.c(var15 * var15 + var17 * var17);
            var10.y = var10.w = (float)(Math.atan2(var15, var17) * 180.0 / Math.PI);
            var10.z = var10.x = (float)(Math.atan2(var16, var21) * 180.0 / Math.PI);
            double var22 = 0.0;
            double var24 = 0.0;
            double var26 = 0.0;
            this.a.a__nw().a__Boolean(var10, var22, var24, var26, 0.0F, var4);
            kZ.C();
         }

         lt.b();
      }
   }

   @Override
   public boolean a__Boolean() {
      return false;
   }
}
