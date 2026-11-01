package net.minecraft.client.renderer;

import moom.DE;
import moom.Oo;
import moom.d1;
import moom.l8;
import net.minecraft.block.BlockQuartz$EnumType;
import net.minecraft.block.state.IBlockState;

class BlockModelShapes$1 extends l8 {
   final BlockModelShapes c;
   BlockModelShapes$1(BlockModelShapes shapes) { this.c = shapes; }
   private static Oo b(Oo exception) { return exception; }
   @Override protected DE a(IBlockState state) {
      BlockQuartz$EnumType type = state.a(d1.Q);
      switch (BlockModelShapes$8.a[type.ordinal()]) {
         case 1: default: return new DE("quartz_block", "normal");
         case 2: return new DE("chiseled_quartz_block", "normal");
         case 3: return new DE("quartz_column", "axis=y");
         case 4: return new DE("quartz_column", "axis=x");
         case 5: return new DE("quartz_column", "axis=z");
      }
   }
}
