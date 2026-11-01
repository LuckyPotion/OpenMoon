package moom;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

class wC extends wB {
   private final wB f;

   public wC(wB var1, int var2) {
      super(var1.b, var2, 0, 0);
      this.f = var1;
   }

   @Override
   public void b(ItemStack var1) {
      this.f.b(var1);
   }

   @Override
   public int a() {
      return this.f.a();
   }

   @Override
   public int a(ItemStack var1) {
      return this.f.a(var1);
   }

   @Override
   public String a__String() {
      return this.f.a__String();
   }

   @Override
   public ItemStack a(int var1) {
      return this.f.a(var1);
   }

   @Override
   public boolean a(IInventory var1, int var2) {
      return this.f.a(var1, var2);
   }

   @Override
   public void a(EntityPlayer var1, ItemStack var2) {
      this.f.a(var1, var2);
   }

   @Override
   public boolean a__Boolean(ItemStack var1) {
      return this.f.a__Boolean(var1);
   }

   @Override
   public ItemStack a__xW() {
      return this.f.a__xW();
   }

   @Override
   public boolean a__Boolean() {
      return this.f.a__Boolean();
   }

   @Override
   public void a__Void() {
      this.f.a__Void();
   }
}
