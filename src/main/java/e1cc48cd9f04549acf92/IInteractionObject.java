package net.minecraft.world;

import moom.v8;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;

public interface IInteractionObject extends IWorldNameable {
   String c__String();

   v8 a(InventoryPlayer var1, EntityPlayer var2);
}
