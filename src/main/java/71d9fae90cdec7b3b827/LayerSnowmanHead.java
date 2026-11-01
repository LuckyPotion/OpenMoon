package net.minecraft.client.renderer.entity.layers;

import moom.kZ;
import moom.nj;
import moom.sY;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class LayerSnowmanHead implements net.minecraft.client.renderer.entity.layers.LayerRenderer<moom.sY> {
   private final nj a;

   public LayerSnowmanHead(nj var1) {
      this.a = var1;
   }

   @Override
   public boolean a__Boolean() {
      return true;
   }

   public void a(sY var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (!var1.v__Boolean()) {
         kZ.B();
         this.a.a__jt().k.c(0.0625F);
         float var9 = 0.625F;
         kZ.b(0.0F, -0.34375F, 0.0F);
         kZ.b(180.0F, 0.0F, 1.0F, 0.0F);
         kZ.a(var9, -var9, -var9);
         Minecraft.a__fM().a__lm().a(var1, new ItemStack(Blocks.aU, 1), ItemCameraTransforms$TransformType.HEAD);
         kZ.C();
      }
   }
}
