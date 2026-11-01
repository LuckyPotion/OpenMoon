package moom;

import net.minecraft.world.WorldSavedData;

public class IP extends IO {
   public IP() {
      super(null);
   }

   @Override
   public int a(String var1) {
      return 0;
   }

   @Override
   public void a() {
   }

   @Override
   public void a(String var1, WorldSavedData var2) {
      this.b.put(var1, var2);
   }

   @Override
   public net.minecraft.world.WorldSavedData a(java.lang.Class<? extends net.minecraft.world.WorldSavedData> var1, java.lang.String var2) {
      return this.b.get(var2);
   }
}
