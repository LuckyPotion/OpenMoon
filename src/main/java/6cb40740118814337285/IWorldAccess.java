package net.minecraft.world;

import moom.DT;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

public interface IWorldAccess {
   void b(Entity var1);

   void b(DT var1);

   void b(int var1, DT var2, int var3);

   void a(EntityPlayer var1, int var2, DT var3, int var4);

   void a(String var1, DT var2);

   void a(int var1, DT var2, int var3);

   void a__Void(DT var1);

   void a(int var1, int var2, int var3, int var4, int var5, int var6);

   void a(String var1, double var2, double var4, double var6, float var8, float var9);

   void a(EntityPlayer var1, String var2, double var3, double var5, double var7, float var9, float var10);

   void a__Void(int var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15);

   void a(Entity var1);
}
