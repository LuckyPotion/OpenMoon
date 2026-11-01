package net.minecraft.client.renderer.block.statemap;

import java.util.Map;
import moom.DE;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

public interface IStateMapper {
   java.util.Map<net.minecraft.block.state.IBlockState, moom.DE> a(net.minecraft.block.Block var1);
}
