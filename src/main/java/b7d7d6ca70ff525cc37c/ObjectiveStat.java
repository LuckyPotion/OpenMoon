package net.minecraft.stats;

import moom.BY;
import net.minecraft.scoreboard.ScoreDummyCriteria;

public class ObjectiveStat extends ScoreDummyCriteria {
   private final BY k;

   public ObjectiveStat(BY var1) {
      super(var1.a);
      this.k = var1;
   }
}
