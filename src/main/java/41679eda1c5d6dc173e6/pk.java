package moom;

import net.minecraft.client.resources.data.IMetadataSection;
import net.minecraft.client.resources.data.IMetadataSectionSerializer;

class pk<T extends net.minecraft.client.resources.data.IMetadataSection> {
   final net.minecraft.client.resources.data.IMetadataSectionSerializer<T> a;
   final java.lang.Class<T> b;

   private pk(net.minecraft.client.resources.data.IMetadataSectionSerializer<T> var1, java.lang.Class<T> var2) {
      this.a = var1;
      this.b = var2;
   }
}
