package net.minecraft.network;

import net.minecraft.util.IChatComponent;

public class ServerStatusResponse {
   private IChatComponent a;
   private ServerStatusResponse$PlayerCountData b;
   private ServerStatusResponse$MinecraftProtocolVersionIdentifier c;
   private String d;

   public ServerStatusResponse$MinecraftProtocolVersionIdentifier a__yN() {
      return this.c;
   }

   public void a(ServerStatusResponse$MinecraftProtocolVersionIdentifier var1) {
      this.c = var1;
   }

   public void a(String var1) {
      this.d = var1;
   }

   public String a() {
      return this.d;
   }

   public IChatComponent a__C5() {
      return this.a;
   }

   public void a(IChatComponent var1) {
      this.a = var1;
   }

   public ServerStatusResponse$PlayerCountData a__yP() {
      return this.b;
   }

   public void a(ServerStatusResponse$PlayerCountData var1) {
      this.b = var1;
   }
}
