package com.moon.event;

public class Render2DEvent extends CancellableEvent {
   private final RenderPhase phase;

   public Render2DEvent(RenderPhase var1) {
      this.phase = var1;
   }

   public RenderPhase getPhase() {
      return this.phase;
   }
}
