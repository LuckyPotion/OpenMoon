package moom;

import net.minecraft.client.audio.ITickableSound;
import net.minecraft.client.audio.PositionedSound;

public abstract class fU extends PositionedSound implements ITickableSound {
   protected boolean j = false;

   protected fU(DD var1) {
      super(var1);
   }

   @Override
   public boolean b__Boolean() {
      return this.j;
   }
}
