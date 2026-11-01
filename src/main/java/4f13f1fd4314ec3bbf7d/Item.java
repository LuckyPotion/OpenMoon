package com.moon.scripting.api.types;


public class Item {

public java.lang.String name;

public java.lang.String display_name;

public int max_stack_size;

public int stack_size;

public int max_damage;

public int damage;

public boolean solid;

public com.moon.scripting.api.types.Enchantment[] enchantments;

public com.moon.scripting.api.types.Potion[] potions;

public Item() {
super();
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite633_11(this.name, this.display_name, this.max_stack_size, this.stack_size, this.max_damage, this.damage, this.solid, java.util.Arrays.deepToString(((java.lang.Object[])(this.enchantments))), java.util.Arrays.deepToString(((java.lang.Object[])(this.potions))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite633_11(java.lang.String a0, java.lang.String a1, int a2, int a3, int a4, int a5, boolean a6, java.lang.String a7, java.lang.String a8) throws E;
}
