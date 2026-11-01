package net.minecraft.client.renderer.entity.layers;

import com.moon.ec;
import com.moon.runtime.ClientContext;
import moom.Dr;
import moom.Oo;
import moom.kZ;
import moom.nr;
import moom.to;
import net.minecraft.entity.player.EnumPlayerModelParts;

public class LayerCape implements net.minecraft.client.renderer.entity.layers.LayerRenderer<moom.to> {
   private final nr a;

   public LayerCape(nr renderer) { this.a = renderer; }
   private static Oo a(Oo error) { return error; }
   @Override public boolean a__Boolean() { return false; }

   public void a(to player, float limbSwing, float limbAmount, float partialTick,
                 float age, float yaw, float pitch, float scale) {
      if (player.W() && !player.v__Boolean()
          && player.a(EnumPlayerModelParts.CAPE) && player.b__DD() != null) {
         ec event = new ec(player, false, false);
         ClientContext.getInstance().getEventBus().publish(event);
         if (event.c()) {
            float divisor = 2.0F;
            kZ.a(1.0F / divisor, 1.0F / divisor, 1.0F / divisor);
            kZ.b(0.0F, 24.0F * scale, 0.0F);
         }
         kZ.c(1.0F, 1.0F, 1.0F, 1.0F);
         this.a.b(player.b__DD());
         kZ.B();
         kZ.b(0.0F, 0.0F, 0.125F);
         double deltaX = player.bM + (player.bP - player.bM) * (double)partialTick
                       - (player.k + (player.n - player.k) * (double)partialTick);
         double deltaY = player.bN + (player.bQ - player.bN) * (double)partialTick
                       - (player.l + (player.o - player.l) * (double)partialTick);
         double deltaZ = player.bO + (player.bR - player.bO) * (double)partialTick
                       - (player.m + (player.p - player.m) * (double)partialTick);
         float bodyYaw = player.a3 + (player.a2 - player.a3) * partialTick;
         double sine = (double)Dr.a(bodyYaw * 3.1415927F / 180.0F);
         double negativeCosine = (double)(-Dr.b(bodyYaw * 3.1415927F / 180.0F));
         float vertical = (float)deltaY * 10.0F;
         vertical = Dr.a(vertical, -6.0F, 32.0F);
         float forward = (float)(deltaX * sine + deltaZ * negativeCosine) * 100.0F;
         float sideways = (float)(deltaX * negativeCosine - deltaZ * sine) * 100.0F;
         if (forward < 0.0F) forward = 0.0F;
         if (forward > 165.0F) forward = 165.0F;
         if (vertical < -5.0F) vertical = -5.0F;
         float walkingAmount = player.bJ + (player.bK - player.bJ) * partialTick;
         vertical += Dr.a((player.I + (player.J - player.I) * partialTick) * 6.0F) * 32.0F * walkingAmount;
         if (player.t__Boolean()) {
            vertical += 25.0F;
            kZ.b(0.0F, 0.142F, -0.0178F);
         }
         kZ.b(6.0F + forward / 2.0F + vertical, 1.0F, 0.0F, 0.0F);
         kZ.b(sideways / 2.0F, 0.0F, 0.0F, 1.0F);
         kZ.b(-sideways / 2.0F, 0.0F, 1.0F, 0.0F);
         kZ.b(180.0F, 0.0F, 1.0F, 0.0F);
         this.a.a__iX().c(0.0625F);
         kZ.C();
      }
   }
}
