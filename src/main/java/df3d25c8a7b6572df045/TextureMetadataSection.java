package net.minecraft.client.resources.data;

import java.util.Collections;
import java.util.List;

public class TextureMetadataSection implements IMetadataSection {
   private final boolean a;
   private final boolean b;
   private final java.util.List<java.lang.Integer> c;

   public TextureMetadataSection(boolean var1, boolean var2, java.util.List<java.lang.Integer> var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public boolean b() {
      return this.b;
   }

   public boolean a__Boolean() {
      return this.a;
   }

   public java.util.List<java.lang.Integer> a() {
      return Collections.unmodifiableList(this.c);
   }
}
