package moom;

import net.minecraft.client.audio.SoundCategory;
import net.minecraft.client.audio.SoundEventAccessorComposite;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.gui.GuiOptions;

class gm extends gc {
   final GuiOptions r;
   gm(GuiOptions parent, int id, int x, int y, int width, int height, String label) {
      super(id, x, y, width, height, label);
      this.r = parent;
   }
   private static Oo b(Oo exception) { return exception; }
   @Override public void a(SoundHandler handler) {
      SoundEventAccessorComposite sound = handler.a(new SoundCategory[] {SoundCategory.ANIMALS, SoundCategory.BLOCKS,
            SoundCategory.MOBS, SoundCategory.PLAYERS, SoundCategory.WEATHER});
      if (sound != null) handler.a(fY.a(sound.a__DD(), 0.5F));
   }
}
