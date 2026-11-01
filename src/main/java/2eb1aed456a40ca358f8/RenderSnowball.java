package net.minecraft.client.renderer.entity;

import moom.DD;
import moom.kZ;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RenderSnowball<T extends net.minecraft.entity.Entity> extends net.minecraft.client.renderer.entity.Render<T> {
   protected final Item h;
   private final RenderItem i;

   public RenderSnowball(RenderManager var1, Item var2, RenderItem var3) {
      super(var1);
      this.h = var2;
      this.i = var3;
   }

   @Override
   protected DD a(Entity var1) {
      return TextureMap.k;
   }

   public net.minecraft.item.ItemStack a__xW(T var1) {
      return new ItemStack(this.h, 1, 0);
   }

   @Override
   public void a(T var1, double var2, double var4, double var6, float var8, float var9) {
      kZ.B();
      kZ.b((float)var2, (float)var4, (float)var6);
      kZ.y();
      kZ.a(0.5F, 0.5F, 0.5F);
      kZ.b(-this.b.g, 0.0F, 1.0F, 0.0F);
      kZ.b(this.b.h, 1.0F, 0.0F, 0.0F);
      this.b(TextureMap.k);
      this.i.a(this.a__xW((T)var1), ItemCameraTransforms$TransformType.GROUND);
      kZ.z();
      kZ.C();
      super.a((T)var1, var2, var4, var6, var8, var9);
   }
}
