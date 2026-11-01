package net.minecraft.world.storage;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;

public interface IPlayerFileData {
   void a__Void(EntityPlayer var1);

   NBTTagCompound a(EntityPlayer var1);

   String[] a__ArrayString();
}
