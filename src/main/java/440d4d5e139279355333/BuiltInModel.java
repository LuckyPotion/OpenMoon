package net.minecraft.client.resources.model;

import java.util.List;
import moom.bs;
import moom.lC;
import moom.lP;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;

public class BuiltInModel implements IBakedModel {
   private final lP a;

   public BuiltInModel(lP var1) {
      this.a = var1;
   }

   @Override
   public boolean b() {
      return true;
   }

   @Override
   public boolean c() {
      return true;
   }

   @Override
   public java.util.List<moom.lC> a() {
      return null;
   }

   @Override
   public TextureAtlasSprite a__oh() {
      return null;
   }

   @Override
   public lP a__lP() {
      return this.a;
   }

   @Override
   public java.util.List<moom.lC> a(moom.bs var1) {
      return null;
   }

   @Override
   public boolean a__Boolean() {
      return false;
   }
}
