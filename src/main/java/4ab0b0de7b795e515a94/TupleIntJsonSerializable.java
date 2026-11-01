package net.minecraft.util;

public class TupleIntJsonSerializable {
   private int a;
   private IJsonSerializable b;

   public void a(IJsonSerializable var1) {
      this.b = var1;
   }

   public <T extends net.minecraft.util.IJsonSerializable> T a__C7() {
      return (T)this.b;
   }

   public void a(int var1) {
      this.a = var1;
   }

   public int a() {
      return this.a;
   }
}
