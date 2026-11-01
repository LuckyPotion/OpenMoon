package moom;

import com.google.gson.JsonParseException;
import java.lang.invoke.MethodHandles;
import java.util.List;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.IChatComponent$Serializer;
import org.apache.commons.lang3.exception.ExceptionUtils;

public class qq extends CommandBase {
   private static final long c = _c.a(6361263452958602289L, -5461599621722408391L, MethodHandles.lookup().lookupClass()).a(41057758942706L);

   private static JsonParseException a(JsonParseException var0) {
      return var0;
   }

   @Override
   public boolean a__Boolean(String[] var1, int var2) {
      long var3 = c ^ 60946439177042L;
      int var5 = qV.d();
      return var5 != 0 ? (var2 & 1) != 0 : var2 == 0;
   }

   @Override
   public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender var1, java.lang.String[] var2, moom.DT var3) {
      long var4 = c ^ 17363467645769L;
      int var6 = qV.c();
      return var6 == 0 || var2.length == 1 ? a(var2, Bl.a__Bl().a__ArrayString()) : null;
   }

   @Override
   public String a__String() {
      return "tellraw";
   }

   @Override
   public int a() {
      return 2;
   }

   public String a__sourceReturn_abea8daec3(ICommandSender var1) {
      return "commands.tellraw.usage";
   }

   @Override
   public void a(ICommandSender var1, String[] var2) throws b7 {
      long var3 = c ^ 79999880962762L;

      try {
         if (var2.length < 2) {
            throw new cc("commands.tellraw.usage");
         }
      } catch (JsonParseException var11) {
         throw a(var11);
      }

      EntityPlayerMP var5 = a__tr(var1, var2[0]);
      String var6 = a(var2, 1);

      try {
         IChatComponent var7 = IChatComponent$Serializer.a(var6);
         ((EntityPlayer)var5).a(CI.a(var1, var7, var5));
      } catch (JsonParseException var10) {
         Throwable var8 = ExceptionUtils.getRootCause(var10);
         throw new cb("commands.tellraw.jsonException", var8 == null ? "" : var8.getMessage());
      }
   }
}
