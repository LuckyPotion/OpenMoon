package net.minecraft.network.play.server;

import java.util.Collection;
import moom.vB;

public class S20PacketEntityProperties$Snapshot {
   private final String a;
   private final double b;
   private final java.util.Collection<moom.vB> c;

   public S20PacketEntityProperties$Snapshot(java.lang.String var1, double var2, java.util.Collection<moom.vB> var4) {
      this.a = var1;
      this.b = var2;
      this.c = var4;
   }

   public java.util.Collection<moom.vB> a__Collection() {
      return this.c;
   }

   public double a() {
      return this.b;
   }

   public String a__String() {
      return this.a;
   }
}
