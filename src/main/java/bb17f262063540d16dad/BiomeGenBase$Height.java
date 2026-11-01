package net.minecraft.world.biome;

public class BiomeGenBase$Height {
   public float a;
   public float b;

   public BiomeGenBase$Height(float var1, float var2) {
      this.a = var1;
      this.b = var2;
   }

   public BiomeGenBase$Height a() {
      return new BiomeGenBase$Height(this.a * 0.8F, this.b * 0.6F);
   }
}
