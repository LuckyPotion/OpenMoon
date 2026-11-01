package com.moon;

import com.moon.event.MoveEvent;
import com.moon.events.subscription.Subscribe;
import com.moon.module.impl.Criticals;
import java.lang.invoke.MethodHandles;
import moom.Oo;
import moom._c;

public class e4 extends com.moon.e2<com.moon.module.impl.Criticals> {
   private final nW e = new nW();
   private boolean f = false;
   private int g = 0;
   private static final long h = _c.a(4999266553594522288L, 4048286579367912053L, MethodHandles.lookup().lookupClass()).a(75833342483364L);

   public e4() {
      super(Criticals.class);
   }

   private static Oo b(Oo var0) {
      return var0;
   }

   @Subscribe
   public void a(MoveEvent event) {
      long key = h ^ 32957886481739L;
      int[] marker = net.minecraft.entity.EntityLivingBase.a__ArrayInt();
      if (event.getPhase() != com.moon.event.MovePhase.PRE) {
         return;
      }
      if (a.K.A && (marker != null || this.f)) {
         this.g++;
         if (marker == null) {
            switch (this.g) {
               case 1:
                  event.setY(event.getY() + 0.07);
                  break;
               case 2:
                  event.setY(event.getY() + 0.04);
                  break;
               case 3:
                  event.setY(event.getY() + 0.03);
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
        long key = h ^ 50193683520145L;
        int[] marker = net.minecraft.entity.EntityLivingBase.a__ArrayInt();
        boolean onGround = a.K.A;

        if (marker == null) {
            if (!onGround) {
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
        } else if (onGround) {
            return;
        }

        this.f = true;
        a.K.k(event.getEntity());
    }
}
