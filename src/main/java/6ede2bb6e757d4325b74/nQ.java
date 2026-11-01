package moom;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class nQ implements net.minecraft.client.renderer.entity.layers.LayerRenderer<net.minecraft.entity.EntityLivingBase> {
   private final moom.mS<?> a;

   public nQ(moom.mS<?> var1) {
      this.a = var1;
   }

   private static Oo a(Oo var0) {
      return var0;
   }

   @Override
   public boolean a__Boolean() {
      return false;
   }

   @Override
   public void a(EntityLivingBase var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      ItemStack var9 = var1.a__xW();
      if (var9 != null) {

      kZ.B();
      if (this.a.a__iQ().c) {
         float var10 = 0.5F;
         kZ.b(0.0F, 0.625F, 0.0F);
         kZ.b(-20.0F, -1.0F, 0.0F, 0.0F);
         kZ.a(var10, var10, var10);
      }

      ((iT)this.a.a__iQ()).a(0.0625F);
      kZ.b(-0.0625F, 0.4375F, 0.0625F);
      if (var1 instanceof EntityPlayer && ((EntityPlayer)var1).cc != null) {
         var9 = new ItemStack(Items.aR, 0);
      }

      Item var17 = var9.a__wQ();
      Minecraft var11 = Minecraft.a__fM();
      if (var17 instanceof wU && Block.a(var17).c__Int() == 2) {
         kZ.b(0.0F, 0.1875F, -0.3125F);
         kZ.b(20.0F, 1.0F, 0.0F, 0.0F);
         kZ.b(45.0F, 0.0F, 1.0F, 0.0F);
         float var12 = 0.375F;
         kZ.a(-var12, -var12, var12);
      }

      if (var1.t__Boolean()) {
         kZ.b(0.0F, 0.203125F, 0.0F);
      }

      var11.a__lm().a(var1, var9, ItemCameraTransforms$TransformType.THIRD_PERSON);
      kZ.C();
      }
   }
}
