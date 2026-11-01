package com.moon;

import com.moon.scripting.api.functions.render.StatesRenderFunctions;
import moom.kZ;

public class j4 implements StatesRenderFunctions {
   @Override
   public void blend_func_separate(int var1, int var2, int var3, int var4) {
      kZ.a(var1, var2, var3, var4);
   }

   @Override
   public void enable_blend() {
      kZ.l();
   }

   @Override
   public void enable_depth() {
      kZ.j();
   }

   @Override
   public void disable_depth() {
      kZ.i();
   }

   @Override
   public void disable_blend() {
      kZ.k();
   }

   @Override
   public void blend_func(int var1, int var2) {
      kZ.b(var1, var2);
   }
}
