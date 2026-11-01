package net.minecraft.client.renderer.entity.layers;

import moom.Oo;
import moom.kZ;
import moom.nr;
import moom.to;

public class LayerDeadmau5Head implements net.minecraft.client.renderer.entity.layers.LayerRenderer<moom.to> {
   private final nr a;

   public LayerDeadmau5Head(nr renderer) { this.a = renderer; }
   private static Oo a(Oo error) { return error; }
   @Override public boolean a__Boolean() { return true; }

   public void a(to player, float limbSwing, float limbAmount, float partialTick,
                 float age, float yaw, float pitch, float scale) {
      if (player.a__String().equals("deadmau5") && player.X() && !player.v__Boolean()) {
         this.a.b(player.a__DD());
         for (int ear = 0; ear < 2; ear++) {
            float relativeYaw = player.y + (player.w - player.y) * partialTick
                              - (player.a3 + (player.a2 - player.a3) * partialTick);
            float interpolatedPitch = player.z + (player.x - player.z) * partialTick;
            kZ.B();
            kZ.b(relativeYaw, 0.0F, 1.0F, 0.0F);
            kZ.b(interpolatedPitch, 1.0F, 0.0F, 0.0F);
            kZ.b(0.375F * (ear * 2 - 1), 0.0F, 0.0F);
            kZ.b(0.0F, -0.375F, 0.0F);
            kZ.b(-interpolatedPitch, 1.0F, 0.0F, 0.0F);
            kZ.b(-relativeYaw, 0.0F, 1.0F, 0.0F);
            float earScale = 1.3333334F;
            kZ.a(earScale, earScale, earScale);
            this.a.a__iX().b(0.0625F);
            kZ.C();
         }
      }
   }
}
