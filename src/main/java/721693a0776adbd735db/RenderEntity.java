package net.minecraft.client.renderer.entity;

import moom.DD;
import moom.kZ;
import net.minecraft.entity.Entity;

public class RenderEntity extends net.minecraft.client.renderer.entity.Render<net.minecraft.entity.Entity> {
   public RenderEntity(RenderManager var1) {
      super(var1);
   }

   @Override
   public void a(Entity var1, double var2, double var4, double var6, float var8, float var9) {
      kZ.B();
      a(var1.b(), var2 - var1.M, var4 - var1.N, var6 - var1.O);
      kZ.C();
      super.a(var1, var2, var4, var6, var8, var9);
   }

   @Override
   protected DD a(Entity var1) {
      return null;
   }
}
