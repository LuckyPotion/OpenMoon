package moom;

import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.chunk.IRenderChunkFactory;
import net.minecraft.world.World;

public class mo implements IRenderChunkFactory {
   @Override
   public mp a(World var1, RenderGlobal var2, DT var3, int var4) {
      return new mq(var1, var2, var3, var4);
   }
}
