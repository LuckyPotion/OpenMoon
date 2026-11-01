package com.moon.event;

public class Event extends java.lang.Object {
    private static net.minecraft.entity.Entity[] b;

    public Event() {
        super();
    }

    static {
        if (com.moon.event.Event.b() == null) {
            com.moon.event.Event.b(new net.minecraft.entity.Entity[4]);
        }
    }

    public static void b(net.minecraft.entity.Entity[] p0) {
        com.moon.event.Event.b = p0;
        return;
    }

    public static net.minecraft.entity.Entity[] b() {
        return com.moon.event.Event.b;
    }

}
