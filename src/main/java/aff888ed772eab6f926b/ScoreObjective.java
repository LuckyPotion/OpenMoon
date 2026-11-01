package net.minecraft.scoreboard;

import moom.bn;

public class ScoreObjective {
   private final Scoreboard a;
   private final String b;
   private final IScoreObjectiveCriteria c;
   private bn d;
   private String e;

   public ScoreObjective(Scoreboard var1, String var2, IScoreObjectiveCriteria var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.e = var2;
      this.d = var3.a__bn();
   }

   public String b() {
      return this.e;
   }

   public void a(bn var1) {
      this.d = var1;
      this.a.c(this);
   }

   public bn a__bn() {
      return this.d;
   }

   public void a(String var1) {
      this.e = var1;
      this.a.c(this);
   }

   public Scoreboard a__Bh() {
      return this.a;
   }

   public IScoreObjectiveCriteria a__Bb() {
      return this.c;
   }

   public String a() {
      return this.b;
   }
}
