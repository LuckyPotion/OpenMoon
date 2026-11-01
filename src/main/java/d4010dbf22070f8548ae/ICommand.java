package net.minecraft.command;

import java.util.List;
import moom.DT;
import moom.b7;

public interface ICommand extends java.lang.Comparable<net.minecraft.command.ICommand> {
   void a(ICommandSender var1, String[] var2) throws b7;

   boolean a__Boolean(ICommandSender var1);

   java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender var1, java.lang.String[] var2, moom.DT var3);

   boolean a__Boolean(String[] var1, int var2);

   java.util.List<java.lang.String> a__List();

   String a__sourceReturn_abea8daec3(ICommandSender var1);

   String a__String();
}
