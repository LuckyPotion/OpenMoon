package net.minecraft.client.renderer.block.model;

import moom.Oo;

class ItemModelGenerator$Span {
   private final ItemModelGenerator$SpanFacing a;
   private int b;
   private int c;
   private final int d;
   public ItemModelGenerator$Span(ItemModelGenerator$SpanFacing facing, int coordinate, int anchor) {
      this.a = facing; this.b = coordinate; this.c = coordinate; this.d = anchor;
   }
   public int b() { return this.c; }
   public int c() { return this.d; }
   private static Oo a(Oo exception) { return exception; }
   public int a() { return this.b; }
   public ItemModelGenerator$SpanFacing a__aG() { return this.a; }
   public void a(int coordinate) {
      if (coordinate < this.b) this.b = coordinate;
      else if (coordinate > this.c) this.c = coordinate;
   }
}
