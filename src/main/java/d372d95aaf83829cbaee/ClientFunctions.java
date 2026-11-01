package com.moon.scripting.api.functions;


public interface ClientFunctions {

public abstract void message(java.lang.String p0);

public abstract void print(java.lang.String p0);

public abstract long time();

public abstract int fps();

public abstract int current_kill_aura_target();

public abstract void force_effects_redraw();

public abstract float get_width();

public abstract float get_height();

public abstract float get_scaled_height();

public abstract boolean is_mouse_down(int p0);

public abstract float get_scaled_width();

public abstract void set_timer_speed(double p0);

public abstract boolean is_key_down(int p0);
}
