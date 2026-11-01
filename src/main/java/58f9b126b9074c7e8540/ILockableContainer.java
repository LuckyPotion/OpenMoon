package net.minecraft.world;

import moom.Eq;
import net.minecraft.inventory.IInventory;

public interface ILockableContainer extends IInventory, IInteractionObject {
   boolean d__Boolean();

   void a(Eq var1);

   Eq a__Eq();
}
