package moom;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.BlockModelShapes;

class l_ extends l8 {
   final BlockModelShapes c;

   l_(BlockModelShapes var1) {
      this.c = var1;
   }

   @Override
   protected DE a(IBlockState var1) {
      return new DE("dead_bush", "normal");
   }
}
