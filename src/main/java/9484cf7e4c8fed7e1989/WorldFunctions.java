package com.moon.scripting.api.functions;


public interface WorldFunctions {

public abstract void remove(int p0);

public abstract com.moon.scripting.api.enums.Facing get_facing(int p0);

public abstract boolean is_burning(int p0);

public abstract com.moon.scripting.api.types.Vec3d get_position(int p0);

public abstract java.lang.String get_name(int p0);

public abstract com.moon.scripting.api.types.Potion get_effect(int p0, int p1);

public abstract float get_pitch(int p0);

public abstract double get_max_health(int p0);

public abstract double get_position_z(int p0);

public abstract boolean has_effect(int p0, int p1);

public abstract com.moon.scripting.api.types.Potion[] get_active_effects(int p0);

public abstract double get_position_y(int p0);

public abstract boolean is_sneaking(int p0);

public abstract int get_hurt_time(int p0);

public abstract boolean is_sprinting(int p0);

public abstract float get_yaw(int p0);

public abstract double get_health(int p0);

public abstract double get_position_x(int p0);

public abstract com.moon.scripting.api.types.Vec3d get_prev_position(int p0);

public abstract boolean is_riding(int p0);

public abstract int get_ticks_existed(int p0);

public abstract int get_hurt_resistant_time(int p0);

public abstract double get_prev_position_z(int p0);

public abstract double get_prev_position_y(int p0);

public abstract double get_prev_position_x(int p0);

public abstract java.lang.String held_item(int p0);

public abstract float get_width(int p0);

public abstract java.lang.String get_biome();

public abstract boolean is_invisible(int p0);

public abstract boolean is_bot(int p0);

public abstract int[] get_entities();

public abstract boolean is_target(int p0);

public abstract boolean is_player(int p0);

public abstract float get_height(int p0);

public abstract int[] get_players();

public abstract com.moon.scripting.api.types.Block get_block_at_vec(com.moon.scripting.api.types.Vec3d p0);

public abstract java.lang.String get_display_name(int p0);

public abstract boolean is_friend(int p0);

public abstract com.moon.scripting.api.types.Block get_block_at(double p0, double p1, double p2);
}
