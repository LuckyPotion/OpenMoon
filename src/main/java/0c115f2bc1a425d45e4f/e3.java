package com.moon;

import com.moon.event.MoveEvent;
import com.moon.events.subscription.Subscribe;
import com.moon.module.impl.Criticals;
import java.lang.invoke.MethodHandles;
import moom.Oo;
import moom._c;

public class e3 extends com.moon.e2<com.moon.module.impl.Criticals> {
   private final nW e = new nW();
   private boolean f = false;
   private int g = 0;
   private static final long h = _c.a(1451304017965490897L, -8614893976110070536L, MethodHandles.lookup().lookupClass()).a(121564129649858L);

   public e3() {
      super(Criticals.class);
   }

   private static Oo b(Oo var0) {
      return var0;
   }

   @Subscribe
   public void a(MoveEvent event) {
      long key = h ^ 12109043972561L;
      int[] marker = net.minecraft.entity.EntityLivingBase.a__ArrayInt();
      if (event.getPhase() != com.moon.event.MovePhase.PRE) {
         return;
      }
      if (a.K.A && (marker != null || this.f)) {
         this.g++;
         if (marker == null) {
            switch (this.g) {
               case 1:
                  event.setY(event.getY() + 0.419999986886978);
                  break;
               case 2:
                  event.setY(event.getY() + 0.341599985361099);
                  break;
               case 3:
                  event.setY(event.getY() + 0.186367980844497);
                  this.f = false;
                  break;
               default:
                  this.f = false;
                  break;
            }
         } else {
            this.f = false;
         }
         event.a(false);
         if (marker == null) {
            return;
         }
      }
      this.f = false;
      this.g = 0;
   }

   @Subscribe
   public void a(dM event) {
      long key = h ^ 53302282513985L;
      int[] marker = net.minecraft.entity.EntityLivingBase.a__ArrayInt();

      if (a.K.A) {
         if (marker != null) {
            return;
         }
         if (a.K.I__Boolean()) {
            return;
         }
         if (!this.e.b((long)((Integer)((Criticals)this.a()).a().getValue()).intValue())) {
            return;
         }
         if (event.getEntity().F) {
            return;
         }
      } else if (marker == null) {
         return;
      }

      this.f = true;
      a.K.k(event.getEntity());
   }
}
