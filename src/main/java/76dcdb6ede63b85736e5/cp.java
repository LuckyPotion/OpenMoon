package moom;

import java.util.Random;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumWorldBlockLayer;

public class cp extends co {
   public cp(fn var1, boolean var2) {
      super(var1, var2);
      this.a(CreativeTabs.b);
   }

   @Override
   public EnumWorldBlockLayer a__bx() {
      return EnumWorldBlockLayer.CUTOUT;
   }

   @Override
   public int a(Random var1) {
      return 0;
   }

   @Override
   protected boolean m() {
      return true;
   }

   @Override
   public boolean g() {
      return false;
   }
}
