package net.minecraft.scoreboard;

import java.util.List;
import moom.bn;
import net.minecraft.entity.player.EntityPlayer;

public class ScoreDummyCriteria implements IScoreObjectiveCriteria {
   private final String j;

   public ScoreDummyCriteria(String var1) {
      this.j = var1;
      IScoreObjectiveCriteria.a.put(var1, this);
   }

   @Override
   public bn a__bn() {
      return bn.INTEGER;
   }

   @Override
   public boolean a__Boolean() {
      return false;
   }

   @Override
   public int a(java.util.List<net.minecraft.entity.player.EntityPlayer> var1) {
      return 0;
   }

   @Override
   public String a() {
      return this.j;
   }
}
