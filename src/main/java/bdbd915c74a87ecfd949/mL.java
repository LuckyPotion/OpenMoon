package moom;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.tileentity.TileEntityMobSpawnerRenderer;
import net.minecraft.entity.ai.EntityMinecartMobSpawner;
import net.minecraft.init.Blocks;

public class mL extends moom.mK<net.minecraft.entity.ai.EntityMinecartMobSpawner> {
   public mL(RenderManager manager) { super(manager); }
   private static Oo c(Oo exception) { return exception; }
   protected void a(EntityMinecartMobSpawner cart, float partialTicks, IBlockState state) {
      super.a(cart, partialTicks, state);
      if (state.a__ch() == Blocks.ac) {
         TileEntityMobSpawnerRenderer.a(__sourceExactCall_f6f9fd7585f8db(cart), cart.n, cart.o, cart.p, partialTicks);
      }
   }

private static native net.minecraft.tileentity.MobSpawnerBaseLogic __sourceExactCall_f6f9fd7585f8db(net.minecraft.entity.ai.EntityMinecartMobSpawner receiver);
}
