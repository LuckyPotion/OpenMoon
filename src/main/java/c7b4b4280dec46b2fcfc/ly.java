package moom;

import net.minecraft.client.renderer.texture.TextureAtlasSprite;

public class ly {
   private final int[] a;
   private final oD b;
   private TextureAtlasSprite[] c;

   public ly(int[] var1, oD var2, TextureAtlasSprite[] var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public ly(int[] var1, oD var2) {
      this.a = var1;
      this.b = var2;
   }

   public int a() {
      return this.a.length / this.b.c();
   }

   public oD a__oD() {
      return this.b;
   }

   public int[] a__ArrayInt() {
      return this.a;
   }
}
