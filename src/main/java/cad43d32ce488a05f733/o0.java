package moom;

import net.minecraft.client.gui.GuiScreenResourcePacks;
import net.minecraft.client.resources.ResourcePackRepository$Entry;

public class o0 extends oY {
   private final ResourcePackRepository$Entry g;

   public o0(GuiScreenResourcePacks var1, ResourcePackRepository$Entry var2) {
      super(var1);
      this.g = var2;
   }

   @Override
   protected String b() {
      return this.g.a__String();
   }

   public ResourcePackRepository$Entry a__o3() {
      return this.g;
   }

   @Override
   protected String a__String() {
      return this.g.b();
   }

   @Override
   protected int a() {
      return this.g.a();
   }

   @Override
   protected void a__Void() {
      this.g.a(this.e.a__ok());
   }
}
