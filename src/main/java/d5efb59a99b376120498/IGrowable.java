package net.minecraft.block;

import java.util.Random;
import moom.DT;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.World;

public interface IGrowable {
   boolean a(World var1, DT var2, IBlockState var3, boolean var4);

   boolean a__Boolean(World var1, Random var2, DT var3, IBlockState var4);

   void a(World var1, Random var2, DT var3, IBlockState var4);
}
