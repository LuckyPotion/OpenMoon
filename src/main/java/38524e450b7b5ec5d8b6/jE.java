package moom;

public class jE {
   public DR a;
   public float b;
   public float c;

   public jE(DR var1, float var2, float var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public jE(jE var1, float var2, float var3) {
      this.a = var1.a;
      this.b = var2;
      this.c = var3;
   }

   public jE(float var1, float var2, float var3, float var4, float var5) {
      this(new DR(var1, var2, var3), var4, var5);
   }

   public jE a(float var1, float var2) {
      return new jE(this, var1, var2);
   }
}
