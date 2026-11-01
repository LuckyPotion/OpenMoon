package net.minecraft.client.renderer.entity.layers;

import moom.Oo;
import moom.iT;
import moom.mS;

public class LayerBipedArmor extends net.minecraft.client.renderer.entity.layers.LayerArmorBase<moom.iT> {
   public LayerBipedArmor(moom.mS<?> renderer) { super(renderer); }
   private static Oo b(Oo exception) { return exception; }
   protected void a(iT model) { model.a(false); }
   @Override protected void a() { this.b = new iT(0.5F); this.c = new iT(1.0F); }
   protected void a(iT model, int slot) {
      this.a(model);
      switch (slot) {
         case 1:
            model.n.n = true; model.o.n = true; break;
         case 2:
            model.k.n = true; model.n.n = true; model.o.n = true; break;
         case 3:
            model.k.n = true; model.l.n = true; model.m.n = true; break;
         case 4:
            model.i.n = true; model.j.n = true; break;
      }
   }
}
