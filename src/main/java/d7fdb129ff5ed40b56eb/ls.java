package moom;

public class ls {
   final mp a;
   bs b;
   int c;
   public ls(mp chunk, bs direction, int mask) {
      this.a = chunk;
      this.b = direction;
      this.c = mask;
   }
   private static Oo a(Oo exception) { return exception; }
   private void a(bs direction, int mask) { this.b = direction; this.c = mask; }
   public boolean a(bs direction) { return (this.c & 1 << direction.ordinal()) > 0; }
   public void a(byte mask, bs direction) { this.c = this.c | mask | 1 << direction.ordinal(); }
}
