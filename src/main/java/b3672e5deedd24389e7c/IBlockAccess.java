package net.minecraft.world;

import moom.DT;
import moom.bs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.biome.BiomeGenBase;

public interface IBlockAccess {
   boolean d__Boolean();

   BiomeGenBase a__ES(DT var1);

   WorldType a__EL();

   int a(DT var1, bs var2);

   TileEntity a__B9(DT var1);

   int a(DT var1, int var2);

   IBlockState a__fE(DT var1);

   boolean a__Boolean(DT var1);
}
