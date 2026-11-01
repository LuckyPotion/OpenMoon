package com.moon.scripting.api.functions;


public interface ModulesFunctions {

public abstract void register(java.lang.String p0, java.lang.String p1, java.lang.String p2, org.luaj.vm2.LuaTable p3);

public abstract void toggle(java.lang.String p0);

public abstract boolean is_enabled(java.lang.String p0);

public abstract void create_boolean_setting(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3);

public abstract void create_integer_setting(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4, int p5, int p6);

public abstract void create_text_setting(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3);

public abstract void set_setting(java.lang.String p0, java.lang.String p1, java.lang.Object p2);

public abstract void create_color_setting(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3);

public abstract void create_float_setting(java.lang.String p0, java.lang.String p1, java.lang.String p2, float p3, float p4, float p5, float p6);

public abstract java.lang.Object get_setting(java.lang.String p0, java.lang.String p1);

public abstract void set_state(java.lang.String p0, boolean p1);
}
