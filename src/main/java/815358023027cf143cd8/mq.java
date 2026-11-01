package moom;

import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.chunk.CompiledChunk;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.World;

public class mq extends mp {
   private final int G = GLAllocation.a(EnumWorldBlockLayer.values().length);
   public mq(World world, RenderGlobal renderer, DT position, int index) {
      super(world, renderer, position, index);
   }
   private static Oo b(Oo exception) { return exception; }
   @Override public void e() {
      super.e();
      GLAllocation.a(this.G, EnumWorldBlockLayer.values().length);
   }
   public int a(EnumWorldBlockLayer layer, CompiledChunk chunk) {
      return !chunk.a__Boolean(layer) ? this.G + layer.ordinal() : -1;
   }
}
