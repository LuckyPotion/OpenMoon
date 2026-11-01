package net.minecraft.block;

import java.util.Random;
import moom.CA;
import moom.DT;
import moom.fn;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.World;

public class BlockWeb extends Block {
   public BlockWeb() {
      super(fn.G);
      this.a(CreativeTabs.c);
   }

   @Override
   public CA a(World var1, DT var2, IBlockState var3) {
      return null;
   }

   @Override
   public EnumWorldBlockLayer a__bx() {
      return EnumWorldBlockLayer.CUTOUT;
   }

   @Override
   public Item a(IBlockState var1, Random var2, int var3) {
      return Items.F;
   }

   @Override
   public void a(World var1, DT var2, IBlockState var3, Entity var4) {
      var4.v();
   }

   @Override
   protected boolean m() {
      return true;
   }

   @Override
   public boolean g() {
      return false;
   }

   @Override
   public boolean j() {
      return false;
   }
}
