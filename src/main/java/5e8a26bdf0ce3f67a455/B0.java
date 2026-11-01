package moom;

import net.minecraft.stats.StatList;
import net.minecraft.util.IChatComponent;

public class B0 extends BY {
   public B0(String var1, IChatComponent var2, BX var3) {
      super(var1, var2, var3);
   }

   public B0(String var1, IChatComponent var2) {
      super(var1, var2);
   }

   @Override
   public BY b() {
      super.b();
      StatList.c.add(this);
      return this;
   }
}
