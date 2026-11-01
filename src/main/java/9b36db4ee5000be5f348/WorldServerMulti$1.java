package net.minecraft.world;

import moom.Ex;
import net.minecraft.world.border.IBorderListener;
import net.minecraft.world.border.WorldBorder;

class WorldServerMulti$1 implements IBorderListener {
   final Ex a;

   WorldServerMulti$1(Ex var1) {
      this.a = var1;
   }

   @Override
   public void b(WorldBorder var1, int var2) {
      this.a.a__Fi().c(var2);
   }

   @Override
   public void b(WorldBorder var1, double var2) {
      this.a.a__Fi().c(var2);
   }

   @Override
   public void c(WorldBorder var1, double var2) {
      this.a.a__Fi().b(var2);
   }

   @Override
   public void a(WorldBorder var1, int var2) {
      this.a.a__Fi().b(var2);
   }

   @Override
   public void a(WorldBorder var1, double var2) {
      this.a.a__Fi().a(var2);
   }

   @Override
   public void a(WorldBorder var1, double var2, double var4, long var6) {
      this.a.a__Fi().a(var2, var4, var6);
   }

   @Override
   public void a(WorldBorder var1, double var2, double var4) {
      this.a.a__Fi().a__Void(var2, var4);
   }
}
