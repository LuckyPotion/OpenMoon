package com.moon;

import com.moon.event.CancellableEvent;
import net.minecraft.tileentity.TileEntity;

public class ef extends CancellableEvent {
   private final TileEntity c;

   public ef(TileEntity var1) {
      this.c = var1;
   }

   public TileEntity getTileEntity() {
      return this.c;
   }
}
