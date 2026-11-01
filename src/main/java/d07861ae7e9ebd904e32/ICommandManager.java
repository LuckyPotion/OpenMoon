package net.minecraft.command;

import java.util.List;
import java.util.Map;
import moom.DT;

public interface ICommandManager {
   java.util.Map<java.lang.String, net.minecraft.command.ICommand> a();

   java.util.List<net.minecraft.command.ICommand> a(net.minecraft.command.ICommandSender var1);

   java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender var1, java.lang.String var2, moom.DT var3);

   int a(ICommandSender var1, String var2);
}
