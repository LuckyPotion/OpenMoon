package net.minecraft.client.renderer.entity.layers;

import moom.Oo;
import moom.jx;
import moom.kZ;
import moom.no;
import moom.ta;
import moom.wU;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class LayerHeldItemWitch implements net.minecraft.client.renderer.entity.layers.LayerRenderer<moom.ta> {
   private final no a;

   public LayerHeldItemWitch(no renderer) { this.a = renderer; }
   private static Oo a(Oo error) { return error; }
   @Override public boolean a__Boolean() { return false; }

   public void a(ta entity, float limbSwing, float limbAmount, float partialTick,
                 float age, float yaw, float pitch, float scale) {
      ItemStack stack = entity.a__xW();
      if (stack != null) {
         kZ.c(1.0F, 1.0F, 1.0F);
         kZ.B();
         if (this.a.a__iQ().c) {
            kZ.b(0.0F, 0.625F, 0.0F);
            kZ.b(-20.0F, -1.0F, 0.0F, 0.0F);
            float childScale = 0.5F;
            kZ.a(childScale, childScale, childScale);
         }
         ((jx)this.a.a__iQ()).n.c(0.0625F);
         kZ.b(-0.0625F, 0.53125F, 0.21875F);
         Item item = stack.a__wQ();
         Minecraft client = Minecraft.a__fM();
         float itemScale;
         if (item instanceof wU && client.a__kP().a(Block.a(item), stack.c())) {
            kZ.b(0.0F, 0.0625F, -0.25F);
            kZ.b(30.0F, 1.0F, 0.0F, 0.0F);
            kZ.b(-5.0F, 0.0F, 1.0F, 0.0F);
            itemScale = 0.375F;
            kZ.a(itemScale, -itemScale, itemScale);
         } else if (item == Items.f) {
            kZ.b(0.0F, 0.125F, -0.125F);
            kZ.b(-45.0F, 0.0F, 1.0F, 0.0F);
            itemScale = 0.625F;
            kZ.a(itemScale, -itemScale, itemScale);
            kZ.b(-100.0F, 1.0F, 0.0F, 0.0F);
            kZ.b(-20.0F, 0.0F, 1.0F, 0.0F);
         } else if (item.c__Boolean()) {
            if (item.d__Boolean()) {
               kZ.b(180.0F, 0.0F, 0.0F, 1.0F);
               kZ.b(0.0F, -0.0625F, 0.0F);
            }
            this.a.a__Void();
            kZ.b(0.0625F, -0.125F, 0.0F);
            itemScale = 0.625F;
            kZ.a(itemScale, -itemScale, itemScale);
            kZ.b(0.0F, 1.0F, 0.0F, 0.0F);
            kZ.b(0.0F, 0.0F, 1.0F, 0.0F);
         } else {
            kZ.b(0.1875F, 0.1875F, 0.0F);
            itemScale = 0.875F;
            kZ.a(itemScale, itemScale, itemScale);
            kZ.b(-20.0F, 0.0F, 0.0F, 1.0F);
            kZ.b(-60.0F, 1.0F, 0.0F, 0.0F);
            kZ.b(-30.0F, 0.0F, 0.0F, 1.0F);
         }
         kZ.b(-15.0F, 1.0F, 0.0F, 0.0F);
         kZ.b(40.0F, 0.0F, 0.0F, 1.0F);
         client.a__lm().a(entity, stack, ItemCameraTransforms$TransformType.THIRD_PERSON);
         kZ.C();
      }
   }
}
