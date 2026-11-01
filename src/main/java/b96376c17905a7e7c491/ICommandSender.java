package net.minecraft.command;

import moom.DR;
import moom.DT;
import net.minecraft.entity.Entity;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public interface ICommandSender {
   DR a__DR();

   World a__Eu();

   Entity a__r3();

   boolean a__Boolean();

   void a(CommandResultStats$Type var1, int var2);

   String a__String();

   IChatComponent a__C5();

   void a(IChatComponent var1);

   boolean a(int var1, String var2);

   DT a__DT();
}
