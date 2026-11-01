package com.moon.event;

public class ActionEvent extends CancellableEvent {
   private final ActionType type;

   public ActionEvent(ActionType var1) {
      this.type = var1;
   }

   public ActionType getType() {
      return this.type;
   }
}
