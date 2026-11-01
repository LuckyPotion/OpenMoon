package net.minecraft.entity;

import moom.OF;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IChatComponent;
import net.minecraft.village.MerchantRecipe;

public interface IMerchant {
   void a(OF var1);

   void a(MerchantRecipe var1);

   void a__sourceReturn_481e10a41f(ItemStack var1);

   IChatComponent a__C5();

   OF a__sourceReturn_71345e1ee6(EntityPlayer var1);

   EntityPlayer a__tn();

   void a__Void(EntityPlayer var1);
}
