package moom;


final class rZ implements net.minecraft.enchantment.EnchantmentHelper$IModifier {

public int a;

public net.minecraft.util.DamageSource b;

private rZ() {
super();
}


public void a(net.minecraft.enchantment.Enchantment p0, int p1) {
this.a += ((net.minecraft.enchantment.Enchantment)(p0)).a(((int)(p1)), ((net.minecraft.util.DamageSource)(this.b)));
    return;
}

}
