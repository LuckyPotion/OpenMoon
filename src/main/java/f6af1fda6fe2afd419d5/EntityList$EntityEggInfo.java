package net.minecraft.entity;

import moom.BY;
import net.minecraft.stats.StatList;

public class EntityList$EntityEggInfo {
   public final int a;
   public final int b;
   public final int c;
   public final BY d;
   public final BY e;

   public EntityList$EntityEggInfo(int var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = StatList.a(this);
      this.e = StatList.b(this);
   }
}
