package net.minecraft.client.resources.data;

import net.minecraft.util.IChatComponent;

public class PackMetadataSection implements IMetadataSection {
   private final IChatComponent a;
   private final int b;

   public PackMetadataSection(IChatComponent var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public IChatComponent a__C5() {
      return this.a;
   }

   public int a() {
      return this.b;
   }
}
