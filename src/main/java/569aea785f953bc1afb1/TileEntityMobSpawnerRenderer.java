package net.minecraft.client.renderer.tileentity;

import moom.Cq;
import moom.kZ;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.MobSpawnerBaseLogic;

public class TileEntityMobSpawnerRenderer extends net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer<moom.Cq> {
   public static void a(MobSpawnerBaseLogic var0, double var1, double var3, double var5, float var7) {
      Entity var8 = var0.a(var0.a__Eu());
      if (var8 != null) {
         float var9 = 0.4375F;
         kZ.b(0.0F, 0.4F, 0.0F);
         kZ.b((float)(var0.b() + (var0.a() - var0.b()) * var7) * 10.0F, 0.0F, 1.0F, 0.0F);
         kZ.b(-30.0F, 1.0F, 0.0F, 0.0F);
         kZ.b(0.0F, -0.4F, 0.0F);
         kZ.a(var9, var9, var9);
         var8.c(var1, var3, var5, 0.0F, 0.0F);
         Minecraft.a__fM().a__nw().a__Boolean(var8, 0.0, 0.0, 0.0, 0.0F, var7);
      }
   }

   public void a(Cq var1, double var2, double var4, double var6, float var8, int var9) {
      kZ.B();
      kZ.b((float)var2 + 0.5F, (float)var4, (float)var6 + 0.5F);
      a(var1.a__sourceReturn_30e49adebc(), var2, var4, var6, var8);
      kZ.C();
   }
}
