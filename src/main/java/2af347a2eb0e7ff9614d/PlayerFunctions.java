package com.moon.scripting.api.functions;


public interface PlayerFunctions {

public abstract void jump();

public abstract double get_base_move_speed();

public abstract double get_prev_position_y();

public abstract double get_prev_position_z();

public abstract boolean collided_vertically();

public abstract void set_position_and_update(com.moon.scripting.api.types.Vec3d p0);

public abstract boolean collided_horizontally();

public abstract void send_packet_no_event(int p0, java.lang.Object[] p1);

public abstract double get_prev_position_x();

public abstract boolean is_blocking();

public abstract double distance_to_vec(com.moon.scripting.api.types.Vec3d p0);

public abstract double get_health();

public abstract boolean is_dead();

public abstract void set_motion_x(double p0);

public abstract double get_motion_z();

public abstract boolean is_sneaking();

public abstract void set_held_item(int p0);

public abstract void set_motion_y(double p0);

public abstract boolean place_block(int p0, com.moon.scripting.api.types.Vec3i p1, com.moon.scripting.api.types.Vec3d p2, com.moon.scripting.api.enums.Facing p3);

public abstract double get_fall_distance();

public abstract boolean is_on_edge();

public abstract float get_yaw();

public abstract double distance_to_entity(int p0);

public abstract com.moon.scripting.api.types.RayCastResult ray_cast(float p0, float p1, float p2);

public abstract void right_click();

public abstract double get_position_y();

public abstract void set_motion(com.moon.scripting.api.types.Vec3d p0);

public abstract void swing_item();

public abstract com.moon.scripting.api.types.Vec3d get_prev_position();

public abstract boolean is_in_water();

public abstract boolean is_on_ladder();

public abstract double get_motion_x();

public abstract com.moon.scripting.api.types.Vec2f get_input();

public abstract boolean is_riding();

public abstract void set_pitch(float p0);

public abstract com.moon.scripting.api.types.Vec3d get_position();

public abstract com.moon.scripting.api.types.RayCastResult get_mouse_over();

public abstract boolean is_using_item();

public abstract void send_packet(int p0, java.lang.Object[] p1);

public abstract float get_prev_yaw();

public abstract int get_hurt_time();

public abstract double get_position_x();

public abstract void set_speed(org.luaj.vm2.LuaTable p0, double p1);

public abstract boolean is_sprinting();

public abstract double get_speed();

public abstract int get_held_item_slot();

public abstract int get_ticks_existed();

public abstract void left_click();

public abstract boolean is_moving();

public abstract double get_absorption();

public abstract float get_pitch();

public abstract com.moon.scripting.api.types.Vec3d get_motion();

public abstract void set_position(com.moon.scripting.api.types.Vec3d p0);

public abstract void set_sneaking(boolean p0);

public abstract boolean is_burning();

public abstract com.moon.scripting.api.enums.Facing get_facing();

public abstract com.moon.scripting.api.types.Vec2f rotations_to(com.moon.scripting.api.types.Vec3d p0);

public abstract float get_prev_pitch();

public abstract boolean is_in_cobweb();

public abstract java.lang.String get_name();

public abstract void set_yaw(float p0);

public abstract com.moon.scripting.api.types.Potion get_effect(int p0);

public abstract double get_position_z();

public abstract int get_id();

public abstract double get_max_health();

public abstract boolean is_on_ground();

public abstract void set_motion_speed(double p0);

public abstract double get_food_amount();

public abstract boolean is_in_lava();

public abstract double distance_to(float p0, float p1, float p2);

public abstract com.moon.scripting.api.types.Potion[] get_active_effects();

public abstract void set_motion_z(double p0);

public abstract double get_motion_y();

public abstract void set_sprinting(boolean p0);

public abstract boolean has_effect(int p0);

public abstract void use_item();
}
