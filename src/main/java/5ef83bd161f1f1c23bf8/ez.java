package com.moon;

import com.moon.event.Event;
import java.util.List;
import moom.CA;
import moom.DU;
import net.minecraft.block.Block;

public class ez extends Event {
   private Block a;
   private DU c;
   private java.util.List<moom.CA> d;

   public ez(net.minecraft.block.Block var1, moom.DU var2, java.util.List<moom.CA> var3) {
      this.a = var1;
      this.c = var2;
      this.d = var3;
   }

   public ez a(DU var1) {
      this.c = var1;
      return this;
   }

   public com.moon.ez a(java.util.List<moom.CA> var1) {
      this.d = var1;
      return this;
   }

   public Block a__ch() {
      return this.a;
   }

   public ez a(Block var1) {
      this.a = var1;
      return this;
   }

   public java.util.List<moom.CA> a() {
      return this.d;
   }

   public DU a__DU() {
      return this.c;
   }
}
