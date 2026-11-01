package moom;

import java.lang.invoke.MethodHandles;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandResultStats$Type;
import net.minecraft.command.ICommandSender;

public class qo extends CommandBase {
   private static final long c = _c.a(6217601699496344939L, -3399812101996357075L, MethodHandles.lookup().lookupClass()).a(156518521219950L);

   private static b7 a(b7 var0) {
      return var0;
   }

   @Override
   public void a(ICommandSender var1, String[] var2) throws b7 {
      long var3 = c ^ 108984051488891L;
      int var5 = Bl.a__Bl().b();
      var1.a(new CN("commands.players.list", new java.lang.Object[] {var5, Bl.a__Bl().c()}));
      var1.a(new CM(Bl.a__Bl().a__BA().a(var2.length > 0 && "uuids".equalsIgnoreCase(var2[0]))));
      var1.a(CommandResultStats$Type.QUERY_RESULT, var5);
   }

   public String a__sourceReturn_abea8daec3(ICommandSender var1) {
      return "commands.players.usage";
   }

   @Override
   public int a() {
      return 0;
   }

   @Override
   public String a__String() {
      return "list";
   }
}
