package net.minecraft.world.storage;

import java.io.File;
import moom.EA;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.MinecraftException;
import net.minecraft.world.chunk.storage.IChunkLoader;

public interface ISaveHandler {
   void b();

   IPlayerFileData a__IJ();

   File a();

   File a(String var1);

   String a__String();

   WorldInfo a__IX();

   void a__Void() throws MinecraftException;

   IChunkLoader a(EA var1);

   void a(WorldInfo var1, NBTTagCompound var2);

   void a(WorldInfo var1);
}
