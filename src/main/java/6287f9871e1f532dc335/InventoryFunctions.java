package com.moon.scripting.api.functions;


public interface InventoryFunctions {

public abstract void shift(int p0);

public abstract void swap(int p0, int p1);

public abstract void drop(int p0, boolean p1);

public abstract int player_inventory_id();

public abstract double get_damage_reduction(int p0);

public abstract void window_click(int p0, int p1, int p2, int p3);

public abstract int lower_container_id();

public abstract java.lang.String current_inventory();

public abstract int upper_container_id();

public abstract double get_harvest_level(int p0);

public abstract com.moon.scripting.api.types.Item get_item(int p0);

public abstract double get_damage_amount(int p0);

public abstract com.moon.scripting.api.types.Item get_item_in_window(int p0, int p1);
}
