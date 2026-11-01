package moom;

/** Caches one OpenGL capability; source generator retains dormant class-file blocks. */
class k3 {
   private final int a;
   private boolean b = false;
   public k3(int capability) { this.a = capability; }
   public void b() { this.a(true); }
   public void a() { this.a(false); }
   public void a(boolean enabled) {
      if (enabled != this.b) {
         this.b = enabled;
         if (enabled) org.lwjgl.opengl.GL11.glEnable(this.a);
         else org.lwjgl.opengl.GL11.glDisable(this.a);
      }
   }
   private static Oo a(Oo exception) { return exception; }
}
